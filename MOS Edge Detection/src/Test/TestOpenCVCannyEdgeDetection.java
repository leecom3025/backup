package Test;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class TestOpenCVCannyEdgeDetection 
{
	
	public static void main(String[] args)
	{
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		Mat imgSource = Imgcodecs.imread("C:\\Users\\C\\Pictures\\angrytarsieredit.jpg");
		Imgproc.cvtColor(imgSource,imgSource, Imgproc.COLOR_BGR2GRAY);
		displayMat(imgSource);
		Imgproc.Canny(imgSource, imgSource, 0.5, 1.0); 
		displayMat(imgSource);
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

}
