/* Class40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public class Class40 implements Runnable
{
    Thread aThread519;
    volatile boolean aBool520;
    Queue aQueue521 = new LinkedList();
    public static Class151 aClass151_522;
    
    void method812(int i) {
	((Class40) this).aBool520 = true;
	try {
	    synchronized (this) {
		this.notify();
	    }
	    ((Class40) this).aThread519.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    public void run() {
	while (!((Class40) this).aBool520) {
	    try {
		Class105 class105;
		synchronized (this) {
		    class105 = (Class105) ((Class40) this).aQueue521.poll();
		    if (null == class105) {
			try {
			    this.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
			continue;
		    }
		}
		try {
		    URLConnection urlconnection
			= ((Class105) class105).anURL1309.openConnection();
		    urlconnection.setConnectTimeout(30000);
		    int i = urlconnection.getContentLength();
		    if (i >= 0) {
			byte[] is = new byte[i];
			new DataInputStream(urlconnection.getInputStream())
			    .readFully(is);
			((Class105) class105).aByteArray1310 = is;
		    }
		    ((Class105) class105).aBool1308 = true;
		} catch (IOException ioexception) {
		    ((Class105) class105).aBool1308 = true;
		}
	    } catch (Exception exception) {
		VarDomainType.method5340(null, exception, 1776608663);
	    }
	}
    }
    
    Class105 method813(URL url, int i) {
	Class105 class105 = new Class105(url);
	synchronized (this) {
	    ((Class40) this).aQueue521.add(class105);
	    this.notify();
	}
	return class105;
    }
    
    public void method814() {
	while (!((Class40) this).aBool520) {
	    try {
		Class105 class105;
		synchronized (this) {
		    class105 = (Class105) ((Class40) this).aQueue521.poll();
		    if (null == class105) {
			try {
			    this.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
			continue;
		    }
		}
		try {
		    URLConnection urlconnection
			= ((Class105) class105).anURL1309.openConnection();
		    urlconnection.setConnectTimeout(30000);
		    int i = urlconnection.getContentLength();
		    if (i >= 0) {
			byte[] is = new byte[i];
			new DataInputStream(urlconnection.getInputStream())
			    .readFully(is);
			((Class105) class105).aByteArray1310 = is;
		    }
		    ((Class105) class105).aBool1308 = true;
		} catch (IOException ioexception) {
		    ((Class105) class105).aBool1308 = true;
		}
	    } catch (Exception exception) {
		VarDomainType.method5340(null, exception, 2131173897);
	    }
	}
    }
    
    Class40() {
	((Class40) this).aThread519 = new Thread(this);
	((Class40) this).aThread519.setPriority(1);
	((Class40) this).aThread519.start();
    }
    
    void method815() {
	((Class40) this).aBool520 = true;
	try {
	    synchronized (this) {
		this.notify();
	    }
	    ((Class40) this).aThread519.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    static Class151 method816(byte[] is, int i) {
	if (null == is)
	    throw new RuntimeException("");
	Class151 class151;
	for (;;) {
	    try {
		Image image = Toolkit.getDefaultToolkit().createImage(is);
		java.awt.Container container = Class465.method5625(312287159);
		MediaTracker mediatracker = new MediaTracker(container);
		mediatracker.addImage(image, 0);
		mediatracker.waitForAll();
		int i_0_ = image.getWidth(container);
		int i_1_ = image.getHeight(container);
		if (mediatracker.isErrorAny() || i_0_ < 0 || i_1_ < 0)
		    throw new RuntimeException("");
		int[] is_2_ = new int[i_0_ * i_1_];
		PixelGrabber pixelgrabber
		    = new PixelGrabber(image, 0, 0, i_0_, i_1_, is_2_, 0,
				       i_0_);
		pixelgrabber.grabPixels();
		class151
		    = Class587.aClass173_7714.method2418(is_2_, 0, i_0_, i_0_,
							 i_1_, 394445991);
		break;
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	}
	return class151;
    }
    
    static float method817(float f, float f_3_, float f_4_, float f_5_,
			   float f_6_, float f_7_, int i, byte i_8_) {
	float f_9_ = 0.0F;
	float f_10_ = f_5_ - f;
	float f_11_ = f_6_ - f_3_;
	float f_12_ = f_7_ - f_4_;
	float f_13_ = 0.0F;
	float f_14_ = 0.0F;
	float f_15_ = 0.0F;
	Class538 class538 = client.aClass495_10935.method5973((byte) 2);
	for (/**/; f_9_ < 1.1F; f_9_ += 0.1F) {
	    float f_16_ = f_9_ * f_10_ + f;
	    float f_17_ = f_3_ + f_9_ * f_11_;
	    float f_18_ = f_9_ * f_12_ + f_4_;
	    int i_19_ = (int) f_16_ >> 9;
	    int i_20_ = (int) f_18_ >> 9;
	    if (i_19_ > 0 && i_20_ > 0
		&& i_19_ < client.aClass495_10935.method6029((short) 3481)
		&& i_20_ < client.aClass495_10935.method5967(47707871)) {
		int i_21_
		    = Class108.myPlayer.aByte10675;
		if (i_21_ < 3 && ((client.aClass495_10935.method6006((byte) 0)
				   .aByteArrayArrayArray5312[1][i_19_][i_20_])
				  & 0x2) != 0)
		    i_21_++;
		int i_22_
		    = class538.aClass137Array7163[i_21_]
			  .method1656((int) f_16_, (int) f_18_, 1982615971);
		if ((float) i_22_ < f_17_) {
		    if (i >= 2)
			return (f_9_ - 0.1F
				+ method817(f_13_, f_14_, f_15_, f_16_, f_17_,
					    f_18_, i - 1, (byte) -34) * 0.1F);
		    return f_9_;
		}
	    }
	    f_13_ = f_16_;
	    f_14_ = f_17_;
	    f_15_ = f_18_;
	}
	return -1.0F;
    }
    
    static final void method818(Class648 class648, int i) {
	boolean bool
	    = ((((Class648) class648).anIntArray8394
		[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	       != 0);
	int i_23_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = Class312.method4145((long) i_23_, 0, bool,
				  Class378_Sub2.aClass668_10123, 1928965110);
    }
    
    static final void method819(Class229 class229, Class226 class226,
				Class648 class648, int i) {
	int i_24_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	int i_25_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if (i_25_ >= 1 && i_25_ <= 10)
	    class229.method3205(i_25_ - 1, i_24_, (short) 245);
    }
    
    static final void method820(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class593.method7085(class229, class226, class648, -335371861);
    }
    
    static void method821(int i, int i_26_) {
	Class67.anInt765 = i * -328946021;
	Class528_Sub33_Sub1.aClass528_Sub33_Sub1Array11598
	    = new Class528_Sub33_Sub1[i];
	Class5_Sub3.anInt10786 = 0;
    }
}
