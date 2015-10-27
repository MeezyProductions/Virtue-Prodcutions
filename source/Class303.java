/* Class303 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Class303 implements Runnable
{
    Class307[] aClass307Array3343;
    Thread aThread3344;
    volatile boolean aBool3345;
    public static Interface22 anInterface22_3346;
    
    boolean method4034(int i) {
	if (((Class303) this).aBool3345)
	    return true;
	if (((Class303) this).aThread3344 == null) {
	    ((Class303) this).aThread3344 = new Thread(this);
	    ((Class303) this).aThread3344.start();
	}
	return ((Class303) this).aBool3345;
    }
    
    Class307 method4035(int i, int i_0_) {
	if (((Class303) this).aClass307Array3343 == null || i < 0
	    || i >= ((Class303) this).aClass307Array3343.length)
	    return null;
	return ((Class303) this).aClass307Array3343[i];
    }
    
    boolean method4036() {
	if (((Class303) this).aBool3345)
	    return true;
	if (((Class303) this).aThread3344 == null) {
	    ((Class303) this).aThread3344 = new Thread(this);
	    ((Class303) this).aThread3344.start();
	}
	return ((Class303) this).aBool3345;
    }
    
    public void method4037() {
	try {
	    int i = Class629.method7524(Class646.aClass665_8386,
					Class678.aClass678_8557,
					(Class12.aClass16_182.anInt192
					 * 2027542149),
					-65534);
	    BufferedReader bufferedreader
		= (new BufferedReader
		   (new InputStreamReader
		    (new DataInputStream
		     (new URL
			  (new StringBuilder().append("http://").append
			       (Class12.aClass16_182.aString194).append
			       (":").append
			       (i).append
			       ("/news.ws?game=").append
			       (-352215983 * client.aClass673_11108.anInt8535)
			       .toString())
			  .openStream()))));
	    String string = bufferedreader.readLine();
	    ArrayList arraylist = new ArrayList();
	    for (/**/; string != null; string = bufferedreader.readLine())
		arraylist.add(string);
	    String[] strings = new String[arraylist.size()];
	    arraylist.toArray(strings);
	    if (0 != strings.length % 3)
		return;
	    ((Class303) this).aClass307Array3343
		= new Class307[strings.length / 3];
	    for (int i_1_ = 0; i_1_ < strings.length; i_1_ += 3)
		((Class303) this).aClass307Array3343[i_1_ / 3]
		    = new Class307(strings[i_1_], strings[i_1_ + 1],
				   strings[i_1_ + 2]);
	} catch (IOException ioexception) {
	    /* empty */
	}
	((Class303) this).aBool3345 = true;
    }
    
    Class303() {
	/* empty */
    }
    
    public void run() {
	try {
	    int i = Class629.method7524(Class646.aClass665_8386,
					Class678.aClass678_8557,
					(Class12.aClass16_182.anInt192
					 * 2027542149),
					-65534);
	    BufferedReader bufferedreader
		= (new BufferedReader
		   (new InputStreamReader
		    (new DataInputStream
		     (new URL
			  (new StringBuilder().append("http://").append
			       (Class12.aClass16_182.aString194).append
			       (":").append
			       (i).append
			       ("/news.ws?game=").append
			       (-352215983 * client.aClass673_11108.anInt8535)
			       .toString())
			  .openStream()))));
	    String string = bufferedreader.readLine();
	    ArrayList arraylist = new ArrayList();
	    for (/**/; string != null; string = bufferedreader.readLine())
		arraylist.add(string);
	    String[] strings = new String[arraylist.size()];
	    arraylist.toArray(strings);
	    if (0 != strings.length % 3)
		return;
	    ((Class303) this).aClass307Array3343
		= new Class307[strings.length / 3];
	    for (int i_2_ = 0; i_2_ < strings.length; i_2_ += 3)
		((Class303) this).aClass307Array3343[i_2_ / 3]
		    = new Class307(strings[i_2_], strings[i_2_ + 1],
				   strings[i_2_ + 2]);
	} catch (IOException ioexception) {
	    /* empty */
	}
	((Class303) this).aBool3345 = true;
    }
    
    boolean method4038() {
	if (((Class303) this).aBool3345)
	    return true;
	if (((Class303) this).aThread3344 == null) {
	    ((Class303) this).aThread3344 = new Thread(this);
	    ((Class303) this).aThread3344.start();
	}
	return ((Class303) this).aBool3345;
    }
    
    static boolean method4039(int i, byte i_3_) {
	return (i >= Class605.aClass605_7896.anInt7905 * 1922173025
		&& i <= Class605.aClass605_7900.anInt7905 * 1922173025);
    }
    
    static final void method4040(Class648 class648, int i) {
	int i_4_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if (2 == 1234694097 * client.anInt11158
	    && i_4_ < client.anInt11157 * -1314218023)
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= client.aClass62Array11160[i_4_].aString721;
	else
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
    }
    
    static final void method4041(int i) {
	Class578 class578 = client.gameScene.method5966(1273279609);
	Class422 class422
	    = Class495.aClass283_Sub1_5578.method3788((short) -21505);
	Class626.anInt8136
	    = ((int) class422.aFloat4780
	       - (class578.anInt7607 * 961465569 << 9)) * 1636412895;
	Class137.anInt1630 = 1124026061 * -(int) class422.aFloat4776;
	Class227.anInt2347
	    = ((int) class422.aFloat4777
	       - (class578.anInt7608 * -173815201 << 9)) * 397871753;
	Class309_Sub1.anInt9907 = ((int) ((double) Class495
						       .aClass283_Sub1_5578
						       .method3791(-212391715)
					  * 2607.5945876176133)
				   & 0x3fff) * 2028903323;
	Class653.anInt8429 = ((int) ((double) Class495.aClass283_Sub1_5578
						  .method3792(-16777216)
				     * 2607.5945876176133)
			      & 0x3fff) * -1829176741;
	Class48.anInt548 = 0;
    }
    
    static final void method4042(Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	int i_5_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class490.method5922(string, i_5_, 541603789);
    }
    
    static void method4043(int i) {
	Class54.aString640 = "";
	Class54.aString663 = "";
	Class54.aString662 = "";
	Class54.aBool671 = true;
    }
    
    static final void method4044(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 367247095 * client.anInt10981 - -2093894957 * client.anInt10980;
    }
    
    static final void method4045(Class648 class648, short i) {
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = new StringBuilder().append
		  (Class414.method4959
		   ((long) (((Class648) class648).anIntArray8394
			    [((((Class648) class648).anInt8395 -= 1239022665)
			      * 717927929)]) * 60000L,
		    Class378_Sub2.aClass668_10123.method68(), true,
		    (short) -16868))
		  .append
		  (" UTC").toString();
    }
}
