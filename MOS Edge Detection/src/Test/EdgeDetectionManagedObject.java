package Test;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import MO.ManagedObject;
import RT.Exceptions.TimeOutException;

public class EdgeDetectionManagedObject extends ManagedObject
{
	
	public static long numberTimesRun=0;
	
	/*
	public static void main(String[] args) throws IOException
	{
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		byte[] imageInByte;
		BufferedImage originalImage = ImageIO.read(new File("C:\\Users\\C\\Pictures\\angrytarsieredit.jpg"));

		// convert BufferedImage to byte array
		byte[] pixels = ((DataBufferByte) originalImage.getRaster().getDataBuffer()).getData();
		long time=System.nanoTime();
		detectEdges(pixels, originalImage.getHeight(), originalImage.getWidth());	
		time=System.nanoTime()-time;
		System.out.println(time);
		
	}
	
	public static void displayMat(Mat m)
	{
	      int type = BufferedImage.TYPE_BYTE_GRAY;
	      if ( m.channels() > 1 ) {
	          type = BufferedImage.TYPE_3BYTE_BGR;
	      }
	      int bufferSize = m.channels()*m.cols()*m.rows();
	      byte [] b = new byte[bufferSize];
	      m.get(0,0,b); // get all the pixels
	      BufferedImage image = new BufferedImage(m.cols(),m.rows(), type);
	      final byte[] targetPixels = ((DataBufferByte) image.getRaster().getDataBuffer()).getData();
	      System.arraycopy(b, 0, targetPixels, 0, b.length);  
	      JFrame frame = new JFrame();
	      frame.getContentPane().setLayout(new FlowLayout());
	      frame.getContentPane().add(new JLabel(new ImageIcon(image)));
	      frame.pack();
	      frame.setVisible(true);
	 }
	 */
		
	public EdgeDetectionManagedObject(ManagedObject creator) throws TimeOutException
	{
		super(creator);
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	}
	
	public void run(byte[] imageData, int height, int width) throws IOException
	{
		while(true)
		{
			detectEdges(imageData, height, width);
			numberTimesRun++;
		}
	}
	
	public byte[] detectEdges(byte[] imageData, int height, int width) throws IOException
	{
		Mat imgSource = new Mat(height, width, CvType.CV_8UC3);
		imgSource.put(0, 0, imageData);
		Imgproc.cvtColor(imgSource,imgSource, Imgproc.COLOR_BGR2GRAY);
		Imgproc.Canny(imgSource, imgSource, 0.5, 1.0);
		byte[] return_buff=new byte[(int)(imgSource.total()*imgSource.channels())];
		imgSource.get(0, 0, return_buff);
		return return_buff;
	}

}
