package MO;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Hashtable;
import java.util.List;

import javax.imageio.ImageIO;

import RT.ByteArrayWrapper;
import RT.HSystem;

public class TestEdgeDetection 
{
	
static final boolean master=true;
	
	static final int numberOfThreads=8;
	
	static MOThread baseMOThread;
	static MOThread[] mOThreads;
	
	public static void main(String[] args) throws Exception
	{
		init();
        
        if(master)
        {
        	master();
        }
        else
        {
        	client();
        }
		
	}
	
	static void init() throws Exception
	{
		HSystem.init(numberOfThreads);
	}
	
	static void master() throws Exception
	{
		CannyEdgeDetectorManagedObject cedmo=new CannyEdgeDetectorManagedObject(HSystem.mothreads[0]);
		
		Thread.sleep(2000);
		List<ManagedObject> mos=HSystem.managedObjects;
		Hashtable<ByteArrayWrapper, ByteArrayWrapper> runningMessages=HSystem.runningMessages;
		System.out.println("ready");
	}
	
	static void client() throws Exception
	{
		CannyEdgeDetectorManagedObject cedmo=new CannyEdgeDetectorManagedObject(HSystem.mothreads[0]);

		Thread.sleep(5000);
		List<ManagedObject> mos=HSystem.managedObjects;
		
		byte[] imageInByte;
		BufferedImage originalImage = ImageIO.read(new File("C:\\Users\\C\\Pictures\\desktop-nature-wallpaper-in-hd-quality-dowload.jpg"));

		// convert BufferedImage to byte array
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ImageIO.write(originalImage, "jpg", baos);
		baos.flush();
		imageInByte = baos.toByteArray();
		baos.close();
		
		cedmo.run(imageInByte);
		
		while(true)
		{
			Thread.sleep(5000);
			//HSystem.printRunTimes();
			System.out.println("Number time run "+cedmo.numberTimesRun);
		}
	}

}
