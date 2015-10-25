/* Class452 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Class452
{
    Class449 this$0;
    byte[] aByteArray4973;
    static long aLong4974;
    
    byte[] method5444(byte i) {
	return ((Class452) this).aByteArray4973;
    }
    
    Class452(Class449 class449, InputStream inputstream,
	     Class528_Sub21_Sub9_Sub1 class528_sub21_sub9_sub1, URL url) {
	((Class452) this).this$0 = class449;
	((Class452) this).aByteArray4973 = null;
	if (null != inputstream) {
	    int i = 10240;
	    ByteBuffer class528_sub42 = new ByteBuffer(i, true);
	    int i_0_ = 0;
	    byte[] is = Class663.method7884(1024, 1449297656);
	    while (i_0_ >= 0) {
		try {
		    i_0_ = inputstream.read(is);
		} catch (IOException ioexception) {
		    ioexception.printStackTrace();
		    i_0_ = -1;
		}
		if (i_0_ > 0) {
		    if (class528_sub42.pointer * -185904669 + i_0_
			>= class528_sub42.payload.length) {
			int i_1_
			    = 10240 + class528_sub42.payload.length;
			byte[] is_2_
			    = Class663.method7883(i_1_, true, 1239022665);
			System.arraycopy(class528_sub42.payload, 0,
					 is_2_, 0,
					 (-185904669
					  * class528_sub42.pointer));
			Class663.method7885(class528_sub42.payload,
					    -1704625200);
			class528_sub42.payload = is_2_;
		    }
		    class528_sub42.method9618(is, 0, i_0_, -406188723);
		}
	    }
	    for (int i_3_ = 0;
		 i_3_ < 1824459271 * ((Class528_Sub21_Sub9_Sub1)
				      class528_sub21_sub9_sub1).anInt11948;
		 i_3_++)
		class528_sub42.writeByte(0, (byte) -49);
	    byte[] is_4_ = new byte[class528_sub42.pointer * -185904669];
	    System.arraycopy(class528_sub42.payload, 0, is_4_, 0,
			     -185904669 * class528_sub42.pointer);
	    class528_sub42.method9632((byte) -86);
	    Object object = null;
	    Class663.method7885(is, 610208932);
	    Object object_5_ = null;
	    ((Class452) this).aByteArray4973 = is_4_;
	    try {
		inputstream.close();
	    } catch (IOException ioexception) {
		ioexception.printStackTrace();
	    }
	}
	((Class528_Sub21_Sub9_Sub1) class528_sub21_sub9_sub1).aBool11576
	    = false;
	class449.method5414(-970651229);
    }
    
    static void method5445(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class90.method1213(-937779523) ? 1 : 0;
    }
    
    static final void method5446(Class648 class648, int i) {
	int i_6_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_6_, (byte) 111);
	Class226 class226 = Class380.aClass226Array3970[i_6_ >> 16];
	Class596.method7122(class229, class226, class648, -1513625329);
    }
    
    static final void method5447(Class648 class648, int i) {
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = Class108.myPlayer
		  .method10718(-1939943257);
    }
    
    static final void method5448(Class648 class648, int i) {
	int i_7_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if (i_7_ == 0)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= Class518_Sub1.aBool10703 ? 1 : 0;
	else if (1 == i_7_)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= Class518_Sub1.aBool10682 ? 1 : 0;
	else if (2 == i_7_)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= Class518_Sub1.aBool10704 ? 1 : 0;
	else
	    throw new RuntimeException();
    }
    
    public static void method5449(Class702 class702, Frame frame, int i) {
	class702.method8224(-792579929);
	frame.setVisible(false);
	frame.dispose();
    }
    
    static void method5450(int i) {
	client.anInt10942 = 0;
	client.anInt11040 = 0;
	client.anInt11092 = 0;
	client.anInt11094 = 0;
	client.anInt11021 = 0;
	client.anInt10996 = 0;
	client.anInt11099 = 0;
	client.anInt11166 = 0;
	client.anInt11101 = 0;
	client.anInt11102 = 0;
	client.anInt11103 = 0;
	client.anInt10854 = 0;
	client.anInt11105 = 0;
	client.anInt11106 = 0;
	client.anInt11107 = 0;
    }
}
