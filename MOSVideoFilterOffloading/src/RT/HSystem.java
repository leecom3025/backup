/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RT;

//import MO.CommunicationManagedObject;
import MO.CommunicationManagedObject;
import MO.DataTransferManagedObject;
//import MO.FileManagedObject;
//import MO.FileSystemManagedObject;
//import MO.ImageManagedObject;
import MO.IntelligenceManagedObject;
import MO.IntelligenceManagedObjectLatticeAdd;
import MO.IntelligenceManagedObjectLatticeAddMOAttributes;
import MO.IntelligenceManagedObjectLatticeRemove;
import MO.IntelligenceManagedObjectLatticeRemoveMOAttributes;
import MO.IntelligenceManagedObjectLatticeSearch_24_25;
import MO.MOThread;
import MO.ManagedObject;
import MO.PrintMO;
import MO.SIDMO;
//import MO.SplitFileManagedObject;
//import MO.StoreFileManagedObject;
import MO.SystemManagedObject;
import MO.SystemMasterManagedObject;
import MO.UDPManagedObject;
//import MO.UserFileSystemManagedObject;
import RT.Cryptography.CryptographicPRNG;
import RT.Cryptography.EllipticCurveDiffieHellman;
import RT.Cryptography.Password;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Security;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 *
 * @author C
 */
public class HSystem 
{
	public static final boolean offloading=false;
	
	
	public static double offloadingAverageFactor=0.05;
	public static long distanceFromNode=0;
	public static int SIDMONameHash;
	public static int SIDMOClassHash;
	public static int intelligenceManagedObjectClassHash;
	public static int communicationManagedObjectNameHash;
	public static int communicationManagedObjectClassHash;
	public static int mOThreadNameHash;
	public static int mOThreadClassHash;
	public static int uDPManagedObjectNameHash;
	public static int uDPManagedObjectClassHash;
	public static int systemManagedObjectNameHash;
	public static int systemManagedObjectClassHash;
	public static int systemMasterManagedObjectNameHash;
	public static int systemMasterManagedObjectClassHash;
	public static int printManagedObjectNameHash;
	public static int printManagedObjectClassHash;
	public static int fileManagedObjectNameHash;
	public static int fileManagedObjectClassHash;
	public static int splitFileManagedObjectNameHash;
	public static int splitFileManagedObjectClassHash;
	public static int storeFileManagedObjectNameHash;
	public static int storeFileManagedObjectClassHash;
	public static int fileSystemManagedObjectNameHash;
	public static int fileSystemManagedObjectClassHash;
	
	public static final int mOAttributesLength=26;
	public static final int mOAttributesExactLength=17;
	public static final int maximumNumberOfTimesEfficiencyUpdated=50;
	
    public static Hashtable<ByteArrayWrapper, ByteArrayWrapper> accountSIDs=new Hashtable<>();
    public static ByteArrayWrapper SID;
    public static KeyPair SIDFull;
    public static Runtime run=Runtime.getRuntime();
    public static int securityLevel=128;
    public static String installLocation="D:\\test1BInstall";
    public static long uTime=300000000000L;
    public static final long communicationDelayAdjustment=1000000000L;
    public static int numComm=1000;
    public static int numOther=100;
    public static long packetConTime=10000000;
    public static ByteArrayWrapper masterSID;
    public static byte[] masterPublicKey=null;
    //public static byte[] masterPublicKey=new byte[]{48, 89, 48, 19, 6, 7, 42, -122, 72, -50, 61, 2, 1, 6, 8, 42, -122, 72, -50, 61, 3, 1, 7, 3, 66, 0, 4, -126, 109, 108, 26, 19, 102, -46, 23, -73, -55, -9, -6, 102, 45, 50, 43, -123, 9, -42, -125, -53, 29, -121, -45, 104, -63, -63, 59, -63, -46, -4, -81, 101, -14, -99, -42, -62, -34, 28, -19, 34, -53, 25, -43, 83, -77, -38, -123, -116, 108, -120, -128, -25, 83, -124, -67, 6, 87, 46, -96, 115, -119, -44, -107};
    public static InetAddress masterIP;
    public static EllipticCurveDiffieHellman eCDH;
    public static byte CommMOBytes[];
    public static long tSleepTime=500;
    public static long tSendPauseTimeout=2000;
    
    public static final long deleteNodeClearPeriod=60000000000L;
    
    public static final byte maxNumberOfMethodCalls=100; //=0+128
    
    public static final int mOThreadMaxSearches=2;

    public static int defaultNumCheckNodes=200;
    public static int defaultNumCheckNodesIntelligence=5;
    public static int defaultNumCheckNodesMOThread=20;
    public static int maxCheckNodes=20000;
    
    public static int defaultNumNodes=35;
    public static int numInitCheckNodes=10;
    //public static int minNumToTest=5000;
    //public static double checkFurtherCoeff=50;
    //public static int checkLessThan=50;
    public static double forgienSearchChance=0;
    public static double forgienSearchChanceMOThread=0.05;
    
    public static double integrateChance=0;
    
    public static int defaultNumNodesMOAttributes=35;
    public static int numInitCheckNodesMOAttributes=10;
    
    public static double trimChance=0.05;
    
    public static ManagedObject minManagedObject;
    public static ManagedObject maxManagedObject;
    
    public static int defaultEffReportMessages=25000;
    public static int intMaxValue=Integer.MAX_VALUE;
    public static int defaultPlasticity=(int)(intMaxValue/100);
    public static double intelLatticeSearchChance=intMaxValue/5;
    public static final double improvePresenceChance=0.02;
    public static byte[] maxIntelContactTimes={0,0,4};
    public static long nonexistantAttributeValue=Long.MAX_VALUE/100000;
    public static long defaultTimeOffset=10000000000L;
    public static double latticeSearchTimeEffConst=.01;
    public static long latticeSearchIntelSpreadConst=100;
    public static volatile List<ManagedObject> managedObjects=new ArrayList<>();
    //public static List<CommunicationManagedObject> communicationManagedObjects=new ArrayList<>();
    public static List<ManagedObject> permissionManagedObjects=new ArrayList<>();
    public static HashMap<Class, Integer> classHashes=new HashMap<>();
    public static List<Integer> nums=new ArrayList<>();
    public static int defaultPermissionSearchSpread=50;
    public static byte defaultPermissionSearchNumber=10;
    public static int[] mOThreadAttributes=new int[HSystem.mOAttributesLength+1];
    public static int[] mOThreadMinAttributes=new int[mOThreadAttributes.length];
    public static int[] mOThreadMaxAttributes=new int[mOThreadAttributes.length];
    public static int[] mOThreadAttributeWeights=new int[mOThreadAttributes.length];
    public static int[] systemMasterManagedObjectAttributes=new int[22];
    public static int[] systemMasterManagedObjectWeights=new int[22];
    public static int[] systemManagedObjectAttributes=new int[22];
    public static int[] systemManagedObjectWeights=new int[22];
    public static HashMap<Integer, IntelligenceManagedObject> naturalIntelMessages=new HashMap<>();
    public static CryptographicPRNG cryptoPRNG;
    public static int gradientNumber=50000;
    public static int latticeSearchLocalMOThreadMaxSearches=3;
    public static long totalSearchDistance[]=new long[]{0, 0};
    public static volatile long numCompletedSearches;
    public static volatile long numSuccessfulSearches;

    //public static String defaultCommunicationProtocol="ECDH/AESCBC/HMACSHA2";
    public static String defaultCommunicationProtocol="No Cryptography";
    
    public static int defaultSecurityLevel=128;
    public static SecurityManager securityManager;
    private static final Hashtable<Class, List<CompareMessageInterface>> defaultPermissions=new Hashtable<>();;
    
    public static final ConcurrentHashMap<IDIntegerArrayWrapper, ManagedObject> localManagedObjects=new ConcurrentHashMap<>();
    
    //public static List<ImageManagedObject> imageMOs=new ArrayList<>();
    
    
    public static HashMap<Integer, Long> effCallFreqs=new HashMap<>();
    
    public static Hashtable<ByteArrayWrapper, ByteArrayWrapper> runningMessages=new Hashtable<>();
    
    public static List<ManagedObject> allMOS=new ArrayList<>();
    
    public static MOThread[] mothreads;
    
    public static Hashtable<RunTimeObject, Long> runtimes=new Hashtable<RunTimeObject, Long>();
    
    public static void init(int numberOfThreads) throws Exception
    {
    	System.out.println("Initializing MOS with offloading="+offloading);
    	boolean master=false;
    	securityManager=new ManagedObjectSecurityManager();
    	//System.setSecurityManager(securityManager);

    	SIDMONameHash=ManagedObjectUtilities.compareHash(new byte[][]{SIDMO.class.getSimpleName().getBytes()});
    	SIDMOClassHash=ManagedObjectUtilities.hashClass(SIDMO.class);
    	intelligenceManagedObjectClassHash=ManagedObjectUtilities.hashClass(IntelligenceManagedObject.class);
    	communicationManagedObjectNameHash=ManagedObjectUtilities.compareHash(new byte[][]{CommunicationManagedObject.class.getSimpleName().getBytes()});
    	communicationManagedObjectClassHash=ManagedObjectUtilities.hashClass(CommunicationManagedObject.class);
    	mOThreadNameHash=ManagedObjectUtilities.compareHash(new byte[][]{MOThread.class.getSimpleName().getBytes()});
    	mOThreadClassHash=ManagedObjectUtilities.hashClass(MOThread.class);
    	uDPManagedObjectNameHash=ManagedObjectUtilities.compareHash(new byte[][]{UDPManagedObject.class.getSimpleName().getBytes()});
    	uDPManagedObjectClassHash=ManagedObjectUtilities.hashClass(UDPManagedObject.class);
    	systemManagedObjectNameHash=ManagedObjectUtilities.compareHash(new byte[][]{SystemManagedObject.class.getSimpleName().getBytes()});
    	systemManagedObjectClassHash=ManagedObjectUtilities.hashClass(SystemManagedObject.class);
    	systemMasterManagedObjectNameHash=ManagedObjectUtilities.compareHash(new byte[][]{SystemMasterManagedObject.class.getSimpleName().getBytes()});
    	systemMasterManagedObjectClassHash=ManagedObjectUtilities.hashClass(SystemMasterManagedObject.class);
    	printManagedObjectNameHash=ManagedObjectUtilities.compareHash(new byte[][]{PrintMO.class.getSimpleName().getBytes()});
    	printManagedObjectClassHash=ManagedObjectUtilities.hashClass(PrintMO.class);
    	/*
    	fileManagedObjectNameHash=ManagedObjectUtilities.compareHash(new byte[][]{FileManagedObject.class.getSimpleName().getBytes()});
    	fileManagedObjectClassHash=ManagedObjectUtilities.hashClass(FileManagedObject.class);
    	splitFileManagedObjectNameHash=ManagedObjectUtilities.compareHash(new byte[][]{SplitFileManagedObject.class.getSimpleName().getBytes()});;
    	splitFileManagedObjectClassHash=ManagedObjectUtilities.hashClass(SplitFileManagedObject.class);
    	storeFileManagedObjectNameHash=ManagedObjectUtilities.compareHash(new byte[][]{StoreFileManagedObject.class.getSimpleName().getBytes()});;
    	storeFileManagedObjectClassHash=ManagedObjectUtilities.hashClass(StoreFileManagedObject.class);
    	fileSystemManagedObjectNameHash=ManagedObjectUtilities.compareHash(new byte[][]{FileSystemManagedObject.class.getSimpleName().getBytes()});
    	fileSystemManagedObjectClassHash=ManagedObjectUtilities.hashClass(FileSystemManagedObject.class);
    	*/
    	if(masterPublicKey==null)
    	{
    		master=true;
	    	Security.addProvider(new BouncyCastleProvider());
	        cryptoPRNG=new CryptographicPRNG();
	        byte prKey[]=new byte[]{48,-126,4,78,2,1,0,48,-126,1,-71,6,7,42,-122,72,-50,61,2,1,48,-126,1,-84,2,1,1,48,77,6,7,42,-122,72,-50,61,1,1,2,66,1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,48,-127,-120,4,66,1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-4,4,66,0,81,-107,62,-71,97,-114,28,-102,31,-110,-102,33,-96,-74,-123,64,-18,-94,-38,114,91,-103,-77,21,-13,-72,-76,-119,-111,-114,-15,9,-31,86,25,57,81,-20,126,-109,123,22,82,-64,-67,59,-79,-65,7,53,115,-33,-120,61,44,52,-15,-17,69,31,-44,107,80,63,0,4,-127,-123,4,0,-58,-123,-114,6,-73,4,4,-23,-51,-98,62,-53,102,35,-107,-76,66,-100,100,-127,57,5,63,-75,33,-8,40,-81,96,107,77,61,-70,-95,75,94,119,-17,-25,89,40,-2,29,-63,39,-94,-1,-88,-34,51,72,-77,-63,-123,106,66,-101,-7,126,126,49,-62,-27,-67,102,1,24,57,41,106,120,-102,59,-64,4,92,-118,95,-76,44,125,27,-39,-104,-11,68,73,87,-101,68,104,23,-81,-67,23,39,62,102,44,-105,-18,114,-103,94,-12,38,64,-59,80,-71,1,63,-83,7,97,53,60,112,-122,-94,114,-62,64,-120,-66,-108,118,-97,-47,102,80,2,66,1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-6,81,-122,-121,-125,-65,47,-106,107,127,-52,1,72,-9,9,-91,-48,59,-75,-55,-72,-119,-100,71,-82,-69,111,-73,30,-111,56,100,9,2,1,1,4,-126,2,-118,48,-126,2,-122,2,1,1,4,65,-15,-69,80,125,-4,0,110,61,100,70,116,123,13,-44,-50,-32,-58,-99,-128,-12,32,-121,46,-114,-80,45,8,-49,-98,105,-71,-89,113,-19,-107,77,-117,-67,-43,88,22,-115,-43,104,54,52,-72,-54,-103,-69,96,-38,-92,87,-120,-6,40,-14,96,42,87,-18,121,-73,112,-96,-126,1,-80,48,-126,1,-84,2,1,1,48,77,6,7,42,-122,72,-50,61,1,1,2,66,1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,48,-127,-120,4,66,1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-4,4,66,0,81,-107,62,-71,97,-114,28,-102,31,-110,-102,33,-96,-74,-123,64,-18,-94,-38,114,91,-103,-77,21,-13,-72,-76,-119,-111,-114,-15,9,-31,86,25,57,81,-20,126,-109,123,22,82,-64,-67,59,-79,-65,7,53,115,-33,-120,61,44,52,-15,-17,69,31,-44,107,80,63,0,4,-127,-123,4,0,-58,-123,-114,6,-73,4,4,-23,-51,-98,62,-53,102,35,-107,-76,66,-100,100,-127,57,5,63,-75,33,-8,40,-81,96,107,77,61,-70,-95,75,94,119,-17,-25,89,40,-2,29,-63,39,-94,-1,-88,-34,51,72,-77,-63,-123,106,66,-101,-7,126,126,49,-62,-27,-67,102,1,24,57,41,106,120,-102,59,-64,4,92,-118,95,-76,44,125,27,-39,-104,-11,68,73,87,-101,68,104,23,-81,-67,23,39,62,102,44,-105,-18,114,-103,94,-12,38,64,-59,80,-71,1,63,-83,7,97,53,60,112,-122,-94,114,-62,64,-120,-66,-108,118,-97,-47,102,80,2,66,1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-6,81,-122,-121,-125,-65,47,-106,107,127,-52,1,72,-9,9,-91,-48,59,-75,-55,-72,-119,-100,71,-82,-69,111,-73,30,-111,56,100,9,2,1,1,-95,-127,-119,3,-127,-122,0,4,1,-87,105,-128,39,-23,-92,-91,119,-72,9,99,53,22,16,48,-116,-31,-11,24,-40,-44,-21,73,-12,38,-37,52,56,-123,-56,-124,-63,-54,30,-58,-47,-115,127,15,52,69,25,15,39,82,2,64,-51,-94,115,-43,8,54,-8,-82,-37,-20,-54,37,-69,-23,110,13,-48,7,0,97,47,-19,118,48,7,111,-78,75,-79,-43,38,-19,-93,117,-66,-70,112,-57,-36,34,-45,77,-54,92,-4,-57,1,-30,55,56,-67,79,-91,-108,65,69,-106,-19,-88,-73,-94,68,-58,-64,45,122,-120,66,-126,106,102,-14,-13,-49,89,93,118,-61,52,-121,94,-17,-86,14};      
	        eCDH=new EllipticCurveDiffieHellman();
	        eCDH.init(prKey);
	        SIDFull=eCDH.getKeyPairComm();
	        //printBytes(SIDFull.getPublic().getEncoded());
	        MessageDigest sha256=MessageDigest.getInstance("SHA-256");
	        SID=new ByteArrayWrapper(sha256.digest(SIDFull.getPublic().getEncoded()));
	        sha256.reset();
	        masterSID=SID;
	        masterPublicKey=SIDFull.getPublic().getEncoded();
	        masterIP=InetAddress.getByName("143.215.131.33");
    	}
    	else
    	{
    		master=false;
    		Security.addProvider(new BouncyCastleProvider());
            cryptoPRNG=new CryptographicPRNG();
            System.out.println("Enter Password");
            InputStreamReader input=new InputStreamReader(System.in);
            BufferedReader bRead=new BufferedReader(input);
            String passwordString=bRead.readLine();
            Password password=new Password(passwordString);     
            eCDH=new EllipticCurveDiffieHellman();
            byte[] passwordInformation=new byte[256];
            password.getPasswordInformation(passwordInformation);
            eCDH.init(passwordInformation);
            SIDFull=eCDH.getKeyPairComm();
            MessageDigest sha256=MessageDigest.getInstance("SHA-256");
            masterSID=new ByteArrayWrapper(sha256.digest(masterPublicKey));
            sha256.reset();
            SID=new ByteArrayWrapper(sha256.digest(eCDH.getKeyPairComm().getPublic().getEncoded()));
            masterIP=InetAddress.getByName("143.215.131.33");
    	}
        
        minManagedObject=new ManagedObject();
        maxManagedObject=new ManagedObject();
        
        int[] minAttributes=new int[26];
        for(int attrNum=0; attrNum<minAttributes.length; attrNum++)
        {
        	minAttributes[attrNum]=Integer.MIN_VALUE;
        }
        
        int[] maxAttributes=new int[26];
        for(int attrNum=0; attrNum<maxAttributes.length; attrNum++)
        {
        	maxAttributes[attrNum]=Integer.MAX_VALUE;
        }
        
        Field mOAttributes=ManagedObject.class.getDeclaredField("mOAttributes");//get mOAttributes, set to minAttributes, etc
        mOAttributes.setAccessible(true);
        mOAttributes.set(minManagedObject, minAttributes);
        mOAttributes.set(maxManagedObject, maxAttributes);
        mOAttributes.setAccessible(false);
        
        List<CompareMessageInterface> defaultPermissionsList;
        byte[] SIDMinBytes=new byte[32];
        for(int byteNum=0; byteNum<SIDMinBytes.length; byteNum++)
        {
        	SIDMinBytes[byteNum]=(byte)-128;
        }
        byte[] MORIDMinBytes=new byte[16];
        for(int byteNum=0; byteNum<MORIDMinBytes.length; byteNum++)
        {
        	MORIDMinBytes[byteNum]=(byte)-128;
        }
        byte[] intelInfoMinBytes=new byte[4];
        for(int byteNum=0; byteNum<intelInfoMinBytes.length; byteNum++)
        {
        	intelInfoMinBytes[byteNum]=(byte)-128;
        }
        byte[] eightMinBytes=new byte[8];
        for(int byteNum=0; byteNum<eightMinBytes.length; byteNum++)
        {
        	eightMinBytes[byteNum]=(byte)-128;
        }
        ByteArrayWrapper SIDMin=new ByteArrayWrapper(SIDMinBytes, MORIDMinBytes, intelInfoMinBytes, eightMinBytes, eightMinBytes, new byte[0]);
        
        byte[] SIDMaxBytes=new byte[32];
        for(int byteNum=0; byteNum<SIDMaxBytes.length; byteNum++)
        {
        	SIDMaxBytes[byteNum]=(byte)127;
        }
        byte[] MORIDMaxBytes=new byte[16];
        for(int byteNum=0; byteNum<MORIDMinBytes.length; byteNum++)
        {
        	MORIDMinBytes[byteNum]=(byte)127;
        }
        byte[] intelInfoMaxBytes=new byte[4];
        for(int byteNum=0; byteNum<intelInfoMinBytes.length; byteNum++)
        {
        	intelInfoMinBytes[byteNum]=(byte)127;
        }
        byte[] eightMaxBytes=new byte[8];
        for(int byteNum=0; byteNum<eightMinBytes.length; byteNum++)
        {
        	eightMinBytes[byteNum]=(byte)127;
        }
        ByteArrayWrapper SIDMax=new ByteArrayWrapper(SIDMaxBytes, MORIDMaxBytes, intelInfoMaxBytes, eightMaxBytes, eightMaxBytes, new byte[0]);

		defaultPermissionsList=new ArrayList<>();
        defaultPermissionsList.add(
            	new AllMessagesAllowed());
        defaultPermissions.put(ManagedObject.class, defaultPermissionsList);

        byte[] tempB=new byte[4];
        for(int attrNum=0; attrNum<mOThreadAttributes.length; attrNum++)
        {
            if(attrNum==1)
            {
                mOThreadAttributes[attrNum]=mOThreadClassHash;
                mOThreadMinAttributes[attrNum]=mOThreadClassHash;
                mOThreadMaxAttributes[attrNum]=mOThreadClassHash;
                mOThreadAttributeWeights[attrNum]=HSystem.intMaxValue*10000;
            }
            else if(attrNum==2)
            {
                mOThreadAttributes[attrNum]=Integer.MIN_VALUE; 
                mOThreadMinAttributes[attrNum]=Integer.MIN_VALUE;
                mOThreadMaxAttributes[attrNum]=Integer.MAX_VALUE;
                mOThreadAttributeWeights[attrNum]=HSystem.intMaxValue/10000;
            }
            else if(attrNum==3)
            {
                mOThreadAttributes[attrNum]=mOThreadClassHash;
                mOThreadMinAttributes[attrNum]=mOThreadClassHash-gradientNumber;
                mOThreadMaxAttributes[attrNum]=mOThreadClassHash+gradientNumber;
                mOThreadAttributeWeights[attrNum]=HSystem.intMaxValue/10000;
            }
            else if(attrNum==4)
            {
                mOThreadAttributes[attrNum]=Integer.MIN_VALUE; 
                mOThreadMinAttributes[attrNum]=Integer.MIN_VALUE;
                mOThreadMaxAttributes[attrNum]=Integer.MAX_VALUE;
                mOThreadAttributeWeights[attrNum]=HSystem.intMaxValue/100;
            }
            else if(attrNum>6 && attrNum<15)
            {
                System.arraycopy(HSystem.SID.SID, 4*(attrNum-7), tempB, 0, tempB.length);
                mOThreadAttributes[attrNum]=ManagedObjectUtilities.b8ToB10Int(tempB);
                mOThreadMinAttributes[attrNum]=mOThreadAttributes[attrNum];
                mOThreadMaxAttributes[attrNum]=mOThreadAttributes[attrNum];
                mOThreadAttributeWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum==HSystem.mOAttributesLength)
            {
                mOThreadAttributes[attrNum]=Integer.MIN_VALUE;
                mOThreadMinAttributes[attrNum]=Integer.MIN_VALUE;
                mOThreadMaxAttributes[attrNum]=Integer.MAX_VALUE;
                mOThreadAttributeWeights[attrNum]=HSystem.intMaxValue/100;
            }
            else
            {
                mOThreadMinAttributes[attrNum]=Integer.MIN_VALUE;
                mOThreadMaxAttributes[attrNum]=Integer.MAX_VALUE;
                mOThreadAttributeWeights[attrNum]=0;
            }          
        }
        for(int attrNum=0; attrNum<systemMasterManagedObjectAttributes.length; attrNum++)
        {
            if(attrNum==0)
            {
                systemMasterManagedObjectAttributes[attrNum]=systemMasterManagedObjectNameHash;
                systemMasterManagedObjectWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum==1)
            {
                systemMasterManagedObjectAttributes[attrNum]=systemMasterManagedObjectClassHash;
                systemMasterManagedObjectWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum==2)
            {
                systemMasterManagedObjectAttributes[attrNum]=Integer.MIN_VALUE;  
                systemMasterManagedObjectWeights[attrNum]=HSystem.intMaxValue/10000;
            }
            else if(attrNum>6 && attrNum<15)
            {
                System.arraycopy(HSystem.masterSID.SID, 4*(attrNum-7), tempB, 0, tempB.length);
                systemMasterManagedObjectAttributes[attrNum]=ManagedObjectUtilities.b8ToB10Int(tempB);
                systemMasterManagedObjectWeights[attrNum]=HSystem.intMaxValue;
            }
            else
            {
                systemMasterManagedObjectAttributes[attrNum]=Integer.MAX_VALUE;               
            }
        }
        for(int attrNum=0; attrNum<systemManagedObjectAttributes.length; attrNum++)
        {
            if(attrNum==0)
            {
                systemManagedObjectAttributes[attrNum]=systemManagedObjectNameHash;
                systemManagedObjectWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum==1)
            {
                systemManagedObjectAttributes[attrNum]=systemManagedObjectClassHash;
                systemManagedObjectWeights[attrNum]=HSystem.intMaxValue;
            }
            else if(attrNum==2)
            {
                systemManagedObjectAttributes[attrNum]=Integer.MIN_VALUE;  
                systemManagedObjectWeights[attrNum]=HSystem.intMaxValue/10000;
            }
            else if(attrNum>6 && attrNum<15)
            {
                System.arraycopy(HSystem.masterSID.SID, 4*(attrNum-7), tempB, 0, tempB.length);
                systemManagedObjectAttributes[attrNum]=ManagedObjectUtilities.b8ToB10Int(tempB);
                systemManagedObjectWeights[attrNum]=HSystem.intMaxValue;
            }
            else
            {
                systemManagedObjectAttributes[attrNum]=Integer.MAX_VALUE;               
            }
        }
        accountSIDs.put(SID, SID);
        
        Object[] intelComm=new Object[9];
        intelComm[0]=Integer.MAX_VALUE;
        intelComm[1]=Integer.MAX_VALUE;
        intelComm[2]=-2147483645;
        intelComm[3]=new ByteArrayWrapper();
        intelComm[4]=Integer.MAX_VALUE;
        intelComm[5]=Integer.MAX_VALUE;
        intelComm[6]=-2147483636;
        intelComm[7]=new ByteArrayWrapper();
        intelComm[8]=Integer.MAX_VALUE;
        
        //try
        //{
	        naturalIntelMessages.put(ManagedObject.class.getDeclaredMethod("addToLattice", Node.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$(), 
	        		new IntelligenceManagedObjectLatticeAdd());
        //}
        //catch(Exception e)
        //{	
        //}
        createMOAttributesAndSetSIDToSystemSID(naturalIntelMessages.get(ManagedObject.class.getDeclaredMethod("addToLattice", Node.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$()));
        
        intelComm[0]=Integer.MAX_VALUE;
        intelComm[1]=Integer.MAX_VALUE;
        intelComm[2]=-2147483645;
        intelComm[3]=new ByteArrayWrapper();
        intelComm[4]=Integer.MAX_VALUE;
        intelComm[5]=Integer.MAX_VALUE;
        intelComm[6]=-2147483623;
        intelComm[7]=new ByteArrayWrapper();
        intelComm[8]=Integer.MAX_VALUE;
        
        try
        {
	        naturalIntelMessages.put(ManagedObject.class.getDeclaredMethod("removeFromLatticeMOAttributes", Node.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$(),
	        		new IntelligenceManagedObjectLatticeRemove());  
	    }
	    catch(Exception e)
	    {	
	    }
        createMOAttributesAndSetSIDToSystemSID(naturalIntelMessages.get(ManagedObject.class.getDeclaredMethod("removeFromLatticeMOAttributes", Node.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$()));
            
        intelComm[0]=Integer.MAX_VALUE;
        intelComm[1]=Integer.MAX_VALUE;
        intelComm[2]=-2147483645;
        intelComm[3]=new ByteArrayWrapper();
        intelComm[4]=Integer.MAX_VALUE;
        intelComm[5]=Integer.MAX_VALUE;
        intelComm[6]=-2147483635;
        intelComm[7]=new ByteArrayWrapper();
        intelComm[8]=Integer.MAX_VALUE;
        
        try
        {
	        naturalIntelMessages.put(ManagedObject.class.getDeclaredMethod("addToLatticeMOAttributes", Node.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$(),
	        		new IntelligenceManagedObjectLatticeAddMOAttributes());
		}
		catch(Exception e)
		{	
		}
        createMOAttributesAndSetSIDToSystemSID(naturalIntelMessages.get(ManagedObject.class.getDeclaredMethod("addToLatticeMOAttributes", Node.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$()));
        
        intelComm[0]=Integer.MAX_VALUE;
        intelComm[1]=Integer.MAX_VALUE;
        intelComm[2]=-2147483645;
        intelComm[3]=new ByteArrayWrapper();
        intelComm[4]=Integer.MAX_VALUE;
        intelComm[5]=Integer.MAX_VALUE;
        intelComm[6]=-2147483633;
        intelComm[7]=new ByteArrayWrapper();
        intelComm[8]=Integer.MAX_VALUE;
        
        try
        {
	        naturalIntelMessages.put(ManagedObject.class.getDeclaredMethod("removeFromLatticeMOAttributes", int.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$(),
	        		new IntelligenceManagedObjectLatticeRemoveMOAttributes());
        }
		catch(Exception e)
		{	
		}
        createMOAttributesAndSetSIDToSystemSID(naturalIntelMessages.get(ManagedObject.class.getDeclaredMethod("removeFromLatticeMOAttributes", int.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$()));
        
        intelComm[0]=Integer.MAX_VALUE;
        intelComm[1]=Integer.MAX_VALUE;
        intelComm[2]=-2147483645;
        intelComm[3]=new ByteArrayWrapper();
        intelComm[4]=Integer.MAX_VALUE;
        intelComm[5]=Integer.MAX_VALUE;
        intelComm[6]=-2147483634;
        intelComm[7]=new ByteArrayWrapper();
        intelComm[8]=Integer.MAX_VALUE;
        
        try
        {
	        naturalIntelMessages.put(ManagedObject.class.getDeclaredMethod("removeFromLatticeMOAttributes", Node.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$(),
	        		new IntelligenceManagedObjectLatticeRemoveMOAttributes());
        }
		catch(Exception e)
		{	
		}
        createMOAttributesAndSetSIDToSystemSID(naturalIntelMessages.get(ManagedObject.class.getDeclaredMethod("removeFromLatticeMOAttributes", Node.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$()));
        
        intelComm=new Object[12];
        intelComm[0]=Integer.MAX_VALUE;
        intelComm[1]=Integer.MAX_VALUE;
        intelComm[2]=-2147483645;
        intelComm[3]=new ByteArrayWrapper();
        intelComm[4]=Integer.MAX_VALUE;
        intelComm[5]=Integer.MAX_VALUE;
        intelComm[6]=-2147483616;
        intelComm[7]=new ByteArrayWrapper();
        intelComm[8]=Integer.MAX_VALUE; 
        intelComm[9]=Integer.MAX_VALUE;
        intelComm[10]=Integer.MAX_VALUE;
        intelComm[11]=Integer.MAX_VALUE;
        
        try
        {
	        //naturalIntelMessages.put(ManagedObject.class.getDeclaredMethod("latticeSearch", int[].class, int.class, int.class, boolean.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$(),
	        		//new IntelligenceManagedObjectLatticeSearch());
        }
		catch(Exception e)
		{	
		}
        //createMOAttributesAndSetSIDToSystemSID(naturalIntelMessages.get(ManagedObject.class.getDeclaredMethod("latticeSearch", int[].class, int.class, int.class, boolean.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$()));
        
        try
        {
	        naturalIntelMessages.put(ManagedObject.class.getDeclaredMethod("latticeSearch", int[].class, int[].class, int[].class, int[].class, int[].class, long[].class, int.class, int.class, boolean.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$(),
	        		new IntelligenceManagedObjectLatticeSearch_24_25());
        }
		catch(Exception e)
		{	
		}
        createMOAttributesAndSetSIDToSystemSID(naturalIntelMessages.get(ManagedObject.class.getDeclaredMethod("latticeSearch", int[].class, int[].class, int[].class, int[].class, int[].class, long[].class, int.class, int.class, boolean.class, ByteArrayWrapper.class, ManagedObject.class).getAnnotation($_MANAGED_OBJECT_COMPILER_ANNOTATION_$.class).$_MANAGED_object_COMPILER_RUN_Number_$()));
        
        mothreads=new MOThread[numberOfThreads];
        if(numberOfThreads>0)
        {
	        try
	        {
	        	MOThread.$_MANAGED_object_COMPILER_CREATE_METHOD_$(null, HSystem.SID, null);
	        }
	        catch(Exception e)
	        {
	        }
	        while(HSystem.managedObjects.size()<1)
	        {	
	        	Thread.sleep(1000);
	        	System.out.println("waiting for intial MOThread to intialize");
	        }
	        mothreads[0]=(MOThread)HSystem.managedObjects.get(0);
	        
	        for(int tNum=1; tNum<mothreads.length; tNum++)
	        {
	        	MOThread.$_MANAGED_object_COMPILER_CREATE_METHOD_$(mothreads[0], HSystem.SID, mothreads[0]);
	        }
	        while(HSystem.managedObjects.size()<mothreads.length)
	        {
	        	Thread.sleep(1000);
	        	System.out.println("waiting for MOThreads to intialize");
	        }
	        for(int tNum=1; tNum<mothreads.length; tNum++)
	        {
	        	mothreads[tNum]=(MOThread)HSystem.managedObjects.get(tNum);
	        }
        }
        
        UDPManagedObject.$_MANAGED_object_COMPILER_CREATE_METHOD_$(HSystem.mothreads[0], HSystem.SID, HSystem.mothreads[0]);	
        if(master)
    	{
        	SystemMasterManagedObject.$_MANAGED_object_COMPILER_CREATE_METHOD_$(HSystem.mothreads[0], HSystem.SID, HSystem.mothreads[0]);
    	}
    	else
    	{
    		SystemManagedObject.$_MANAGED_object_COMPILER_CREATE_METHOD_$(HSystem.mothreads[0], HSystem.SID, HSystem.mothreads[0]);
    		Thread.sleep(10000);
    	}
    } 
    
    public static CompareMessage[][] getDefaultPermission(Class getPermissionFor)
    {
    	synchronized(defaultPermissions)
    	{
	    	if(defaultPermissions.get(getPermissionFor)!=null)
	    	{
	    		CompareMessage[][] permissions=new CompareMessage[defaultPermissions.get(getPermissionFor).size()][];
	    		for(int permissionNumber=0; permissionNumber<permissions.length; permissionNumber++)
	    		{
	    			try 
	    			{
						permissions[permissionNumber]=defaultPermissions.get(getPermissionFor).get(permissionNumber).createCompareMessage();
					} 
	    			catch (Exception e) 
	    			{
						e.printStackTrace();
					}
	    		}
	    		return permissions;
	    	}
	    	else
	    	{
	    		return new CompareMessage[0][];
	    	}
    	}
    }
    
    public static void addPermissionToManagedObject(Class ManagedObjectClassToAddTo, CompareMessageInterface permission, ByteArrayWrapper $_MANAGED_object_COMPILER_DATA_$, ManagedObject addingManagedObject) throws Exception
    {
    	synchronized(defaultPermissions)
    	{
	    	for(int index=0; index<HSystem.managedObjects.size(); index++)
	    	{
	    		if(ManagedObjectClassToAddTo.isAssignableFrom(HSystem.managedObjects.get(index).getClass()))
	    		{
	    			HSystem.managedObjects.get(index).addPermission(permission.createCompareMessage(), $_MANAGED_object_COMPILER_DATA_$, HSystem.managedObjects.get(index));
	    		}
	    	}
	    	if(defaultPermissions.get(ManagedObjectClassToAddTo)==null)
	    	{
	    		List<CompareMessageInterface> defaultPermissionsList=new ArrayList<>();
	    		defaultPermissionsList.add(permission);
	    		defaultPermissions.put(ManagedObjectClassToAddTo, defaultPermissionsList);
	    	}
	    	else
	    	{
	    		defaultPermissions.get(ManagedObjectClassToAddTo).add(permission);    		
	    	}
    	}
    }
    
    //TODO: remove, make sure to remove multiple copies (,equals &/| serialization?)
    
    /*
    public static synchronized void imageMOAdd(ImageManagedObject imageMO)
    {
    	imageMOs.add(imageMO);
    }
    */
    
    public static synchronized void mOAdd(ManagedObject imageMO)
    {
    	managedObjects.add(imageMO);
    	//System.out.println("added");
    }
    
    public static synchronized void mORemove(ManagedObject imageMO)
    {
    	managedObjects.remove(imageMO);
    }
    
    public static synchronized void allMOAdd(ManagedObject imageMO)
    {
    	allMOS.add(imageMO);
    	//System.out.println("added");
    }
    
    public static void createMOAttributesAndSetSIDToSystemSID(ManagedObject toSet)
    {
    	toSet.mOAttributes=new int[mOAttributesLength];
    	for(int index=7; index<15; index++)
    	{
    		byte[] sid=new byte[4];
            System.arraycopy(SID.SID, (index-7)*4, sid, 0, 4);
            toSet.mOAttributes[index]=ManagedObjectUtilities.b8ToB10Int(sid);
    	}
    }
    
    public static synchronized void incrementSuccessfulSearches()
    {
        numSuccessfulSearches++;
    }
    
    public static synchronized void incrementCompletedSearches()
    {
    	numCompletedSearches++;
    }
     
    public static void putMessageByteArrayWrapper(ByteArrayWrapper messageByteArrayWrapper)
    {
    	synchronized(runningMessages)
    	{
    		runningMessages.put(messageByteArrayWrapper, messageByteArrayWrapper);
    	}
    }
    
    public static boolean containsMessageByteArrayWrapper(ByteArrayWrapper messageByteArrayWrapper)
    {
    	synchronized(runningMessages)
    	{
    		if(runningMessages.get(messageByteArrayWrapper)!=null)
    		{
    			return runningMessages.get(messageByteArrayWrapper).equals(messageByteArrayWrapper);
    		}
    		else
    		{
    			return false;
    		}
    	}
    }
    
    public static void removeMessageByteArrayWrapper(ByteArrayWrapper messageByteArrayWrapper)
    {
    	synchronized(runningMessages)
    	{
    		if(runningMessages.get(messageByteArrayWrapper)!=null)
    		{
    			runningMessages.remove(messageByteArrayWrapper);
    		}
    	}
    }
    
    public static final Hashtable<Object, ByteArrayWrapper> locks=new Hashtable<>();
    
    public static boolean lock(Object lockObject, ByteArrayWrapper MORID)
    {
    	if(lockObject==null)
    	{
    		return true;
    	}
    	synchronized(lockObject)
    	{
    		if(locks.get(lockObject)!=null && locks.get(lockObject).equalsCallPathID(MORID))
        	{
        		return true;
        	}
    		int attempts=0;
    		while(locks.get(lockObject)!=null)
    		{
    			try 
    			{
					Thread.sleep(1);
				} 
    			catch (InterruptedException e) 
    			{
					e.printStackTrace();
				}
    			if(attempts>10)
    			{
    				return false;
    			}
    			attempts++;
    		}
	    	synchronized(locks)
	    	{
	    		locks.put(lockObject, MORID);
	    		return true;
	    	}
    	}
    }
    
    public static void unlock(Object lockObject, ByteArrayWrapper MORID)
    {
    	if(lockObject!=null)
    	{
	    	synchronized(lockObject)
	    	{
	    		if(locks.get(lockObject)!=null && locks.get(lockObject).equalsCallPathID(MORID))
	        	{
	        		locks.remove(lockObject);
	        	}
	    	}
    	}
    }
    
    public static MOThread getBestMOThread()
    {
    	int best=Integer.MAX_VALUE;
    	MOThread bestThread=null;
    	for(int index=0; index<mothreads.length; index++)
    	{
    		if(mothreads[index]!=null && mothreads[index].mOAttributes[HSystem.mOAttributesLength]<best)
    		{
    			best=mothreads[index].mOAttributes[HSystem.mOAttributesExactLength];
    			bestThread=mothreads[index];
    		}
    	}
    	if(bestThread==null)
    	{
    		int u=0;
    	}
    	return bestThread;
    }
    
    public static MOThread getWorstMOThread()
    {
    	int worst=Integer.MIN_VALUE;
    	MOThread worstThread=null;
    	for(int index=0; index<mothreads.length; index++)
    	{
    		if(mothreads[index]!=null && mothreads[index].mOAttributes[HSystem.mOAttributesLength]>worst)
    		{
    			worst=mothreads[index].mOAttributes[HSystem.mOAttributesLength];
    			worstThread=mothreads[index];
    		}
    	}
    	return worstThread;
    }
    
    private static void printBytes(byte[] bytes)
    {
    	String bytesString="[";
    	for(byte b: bytes)
    	{
    		bytesString+=b+", ";
    	}
    	bytesString=bytesString.substring(0, bytesString.length()-2)+"]";
    	System.out.println(bytesString);
    }
    
    public static boolean offload()
    {
    	return false;
    }
    
    public static final double maxCPUTemperature=60;
    
    public static boolean offload(ManagedObject managedObject, int methodNumber)
    {
    	if(!offloading)
    	{
    		return offloading;
    	}
    	RunTimeObject localRuntimeObject=new RunTimeObject(managedObject.getClass().getName(), false, methodNumber);
    	RunTimeObject offloadedRuntimeObject=new RunTimeObject(managedObject.getClass().getName(), true, methodNumber);
    	
    	long localTime=0;
    	if(runtimes.get(localRuntimeObject)!=null)
    	{
    		localTime=runtimes.get(localRuntimeObject);
    	}
    	
    	long offloadTime=0;
    	if(runtimes.get(offloadedRuntimeObject)!=null)
    	{
    		offloadTime=runtimes.get(offloadedRuntimeObject);
    	}
    	
    	if(0.005>Math.random())
    	{
    		return offloadTime>localTime;
    	}
    	else
    	{
    		return offloadTime<localTime;//*calculateRuntimeFactor();
    	}
    }
    
    public static double getAverageCPUUsage()
    {
    	return Double.NaN;
    }
    
    public static double getAverageCPUTemperature()
    {
    	return Double.NaN;
    }
    
    private static final double increaseLength=5;
    public static final double increaseMaxFactor=5;
    private static double calculateRuntimeFactor()
    {
    	double averageCPUTemperature=getAverageCPUTemperature();
    	double a=Math.max(0.0, 1.0-((maxCPUTemperature-averageCPUTemperature)/increaseLength));
    	return 1.0+a*increaseMaxFactor;
    }
    
    public static void printRunTimes()
    {
    	List<Entry<RunTimeObject, Long>> entries=new ArrayList<>();
    	for(Entry<RunTimeObject, Long> entry: runtimes.entrySet())
    	{
    		entries.add(entry);
    	}
    	Collections.sort(entries, new RunTimeEntryComparator());
    	for(int index=0; index<entries.size(); index++)
    	{
    		if(entries.get(index).getKey().offloaded)
    		{
    			double offloadTemperature=((double)entries.get(index).getValue())/((double)entries.get(index+1).getValue());
    			offloadTemperature=offloadTemperature-1.0;
    			offloadTemperature/=increaseMaxFactor;
    			offloadTemperature-=1.0;
    			offloadTemperature=-offloadTemperature;
    			offloadTemperature*=increaseLength;
    			offloadTemperature=-offloadTemperature;
    			offloadTemperature+=maxCPUTemperature;
    			System.out.println("Class: "+entries.get(index).getKey().clazz+" Method Number: "+entries.get(index).getKey().methodNumber+" Execution Offloaded: "+entries.get(index).getKey().offloaded+" Execution Time: "+entries.get(index).getValue()+" Offload At: "+offloadTemperature);
    		}
    		else
    		{
    			System.out.println("Class: "+entries.get(index).getKey().clazz+" Method Number: "+entries.get(index).getKey().methodNumber+" Execution Offloaded: "+entries.get(index).getKey().offloaded+" Execution Time: "+entries.get(index).getValue());
    		}
    		
    	}
    }
    
}

class RunTimeEntryComparator implements Comparator<Entry<RunTimeObject, Long>>
{

	public RunTimeEntryComparator()
	{
		
	}
	
	@Override
	public int compare(Entry<RunTimeObject, Long> o1, Entry<RunTimeObject, Long> o2)
	{
		if(o1.getKey().clazz.hashCode()<o2.getKey().clazz.hashCode())
		{
			return -1;
		}
		else if(o1.getKey().clazz.hashCode()>o2.getKey().clazz.hashCode())
		{
			return 1;
		}
		else if(o1.getKey().methodNumber<o2.getKey().methodNumber)
		{
			return -1;
		}
		else if(o1.getKey().methodNumber>o2.getKey().methodNumber)
		{
			return 1;
		}
		else if(o1.getKey().offloaded==false && o1.getKey().offloaded==true)
		{
			return -1;
		}
		else if(o1.getKey().offloaded==true && o1.getKey().offloaded==false)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
}

class AllMessagesAllowed implements CompareMessageInterface
{

	@Override
	public CompareMessage[] createCompareMessage() throws Exception 
	{
		return new CompareMessage[]
	    		{
            	new AnyObjectAllowed(),
            	new AnyObjectAllowed(),
            	new AnyObjectAllowed(),
            	new AnyObjectAllowed(),
        		new AnyObjectAllowed(), 
        		new AnyObjectAllowed(),
        		new AnyObjectAllowed(),
        		new AnyObjectAllowed(),
        		new AnyObjectAllowed(),
        		new AnyObjectAllowed(),
        		new AnyObjectAllowed(),
        		new AnyObjectAllowed()
        	};
	}
	
}
