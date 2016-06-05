package RT;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.math.BigInteger;
import java.nio.file.Files;

import org.apache.commons.math3.fraction.BigFraction;
import org.apache.commons.math3.fraction.BigFractionField;
import org.apache.commons.math3.linear.BlockFieldMatrix;
import org.apache.commons.math3.linear.FieldLUDecomposition;
import org.apache.commons.math3.linear.FieldMatrix;
import org.bouncycastle.util.Arrays;

import RT.ManagedObjectUtilities;

public class ErrorCorrectionMatrices 
{
	
	public static byte[][] split(byte[] toSplit, int needed, int produced) 
	{
		byte[][] splitPieces=new byte[12][];
		int pieceLength=toSplit.length/needed; //TODO: round piece length up
		BlockFieldMatrix<BigFraction> pieces=new BlockFieldMatrix(BigFractionField.getInstance(), needed, 1);
		for(int rowNumber=0; rowNumber<needed; rowNumber++)
		{
			byte[] pieceBytes;
			if(rowNumber+1<needed)
			{
				pieceBytes=new byte[pieceLength+1];
			}
			else
			{
				pieceBytes=new byte[toSplit.length-rowNumber*pieceLength+1];
			}
			System.arraycopy(toSplit, rowNumber*pieceLength, pieceBytes, 1, pieceBytes.length-1);
			pieceBytes[0]=1;
			splitPieces[rowNumber]=pieceBytes;
			pieces.setEntry(rowNumber, 0, new BigFraction(new BigInteger(pieceBytes)));
		}
		int[] points=new int[needed];
		for(int point=0; point<points.length; point++)
		{
			points[point]=point+1;
		}
		BlockFieldMatrix<BigFraction> vandermondeMatrix=getVandermondeMatrix(needed, needed, points);
		FieldLUDecomposition<BigFraction> solver=new FieldLUDecomposition<BigFraction>(vandermondeMatrix);
		FieldMatrix<BigFraction> coefficients=solver.getSolver().solve(pieces);
		byte[][] splitParts=new byte[produced][];
		for(int index=0; index<splitParts.length; index++)
		{
			int dataLength=-1;
			if(index<needed)
			{
				dataLength=pieces.getEntry(index, 0).getNumerator().toByteArray().length;
				splitParts[index]=new byte[4+dataLength];
				System.arraycopy(pieces.getEntry(index, 0).getNumerator().toByteArray(), 0, splitParts[index], 4, dataLength);
			}
			else
			{
				BigFraction fx=evaluatePolynomial(coefficients, index+1);
				dataLength=fx.getNumerator().toByteArray().length;
				splitParts[index]=new byte[4+dataLength];
				System.arraycopy(fx.getNumerator().toByteArray(), 0, splitParts[index], 4, dataLength);
				
			}
			byte[] dataLengthBytes=ManagedObjectUtilities.b10ToB8(dataLength);
			System.arraycopy(dataLengthBytes, 0, splitParts[index], 0, dataLengthBytes.length);
		}
		return splitParts;
	}
	
	public static byte[] recover(byte[][] split, int[] points) 
	{
		byte[][] splitLessLength=new byte[split.length][];
		for(int splitIndex=0; splitIndex<split.length; splitIndex++)
		{
			splitLessLength[splitIndex]=new byte[split[splitIndex].length-4];
			System.arraycopy(split[splitIndex], 4, splitLessLength[splitIndex], 0, splitLessLength[splitIndex].length);
		}
		BlockFieldMatrix<BigFraction> pieces=new BlockFieldMatrix(BigFractionField.getInstance(), splitLessLength.length, 1);
		for(int rowNumber=0; rowNumber<pieces.getRowDimension(); rowNumber++)
		{
			pieces.setEntry(rowNumber, 0, new BigFraction(new BigInteger(splitLessLength[rowNumber])));
		}
		BlockFieldMatrix<BigFraction> vandermondeMatrix=getVandermondeMatrix(splitLessLength.length, splitLessLength.length, points);
		FieldLUDecomposition<BigFraction> solver=new FieldLUDecomposition<BigFraction>(vandermondeMatrix);
		FieldMatrix<BigFraction> coefficients=solver.getSolver().solve(pieces);
		ByteArrayOutputStream bOut=new ByteArrayOutputStream();
		for(int rowNumber=0; rowNumber<pieces.getRowDimension(); rowNumber++)
		{

			byte[] BI=evaluatePolynomial(coefficients, rowNumber+1).getNumerator().toByteArray();
			bOut.write(BI, 1, BI.length-1);
		}
        return bOut.toByteArray();
	}
	
	private static BlockFieldMatrix<BigFraction> getVandermondeMatrix(int rows, int columns, int[] points)
	{
		BlockFieldMatrix<BigFraction> vandermondeMatrix=new BlockFieldMatrix(BigFractionField.getInstance(), rows, columns);
		for(int row=0; row<rows; row++)
		{
			BigFraction x=BigFraction.ONE;
			for(int column=0; column<columns; column++)
			{
				vandermondeMatrix.setEntry(row, column, x);
				x=x.multiply(points[row]);
			}
		}
		return vandermondeMatrix;
	}
	
	private static BigFraction evaluatePolynomial(FieldMatrix<BigFraction> coefficients, int x)
	{
		BigFraction fx=BigFraction.ZERO;
		BigFraction currentX=BigFraction.ONE;
		for(int coefficientNumber=0; coefficientNumber<coefficients.getRowDimension(); coefficientNumber++)
		{
			fx=fx.add(coefficients.getEntry(coefficientNumber, 0).multiply(currentX));
			currentX=currentX.multiply(x);
		}
		return fx;
	}

}
