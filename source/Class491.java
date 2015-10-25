/* Class491 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class491
{
    public int anInt5512;
    public int anInt5513;
    public int anInt5514;
    public int anInt5515;
    
    Class491() {
	anInt5514 = (32 + (int) (Math.random() * 4.0)) * 635381971;
	anInt5512 = (3 + (int) (Math.random() * 2.0)) * 424036667;
	anInt5513 = (16 + (int) (Math.random() * 3.0)) * -2124718371;
	if (Class514.aClass528_Sub38_6967.aClass691_Sub12_10590
		.method9915((byte) 1)
	    == 1)
	    anInt5515 = (int) (Math.random() * 6.0) * -716385149;
	else
	    anInt5515 = (int) (Math.random() * 12.0) * -716385149;
    }
    
    Class491(int i, int i_0_, int i_1_, int i_2_) {
	anInt5514 = i * 635381971;
	anInt5512 = i_0_ * 424036667;
	anInt5513 = -2124718371 * i_1_;
	anInt5515 = i_2_ * -716385149;
    }
    
    static final void method5925(Class648 class648, int i) {
	Class514.aClass528_Sub38_6967.method9556
	    (Class514.aClass528_Sub38_6967.aClass691_Sub4_10578,
	     ((((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	      == 1) ? 1 : 0,
	     386520408);
	client.aClass495_10935.method5989(2016078152);
	Class243.method3387(2142449207);
	client.aBool11161 = false;
    }
    
    static final void method5926(Class648 class648, byte i) {
	int i_3_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if (2 == client.anInt11158 * 1234694097
	    && i_3_ < client.anInt11157 * -1314218023) {
	    Class62 class62 = client.aClass62Array11160[i_3_];
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= class62.aString720;
	    if (class62.aString715 != null)
		((Class648) class648).anObjectArray8396
		    [((((Class648) class648).anInt8410 += 1600226731)
		      * -520794877) - 1]
		    = class62.aString715;
	    else
		((Class648) class648).anObjectArray8396
		    [((((Class648) class648).anInt8410 += 1600226731)
		      * -520794877) - 1]
		    = "";
	} else {
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
	}
    }
    
    public static int method5927(int i) {
	return (Class581.aTwitchWebcamDeviceArray7641 == null ? 0
		: Class581.aTwitchWebcamDeviceArray7641.length);
    }
    
    public static int method5928(int i, int i_4_, int i_5_) {
	int i_6_ = i_4_ >>> 24;
	int i_7_ = 255 - i_6_;
	i_4_ = (i_6_ * (i_4_ & 0xff00ff) & ~0xff00ff
		| i_6_ * (i_4_ & 0xff00) & 0xff0000) >>> 8;
	return i_4_ + ((i_7_ * (i & 0xff00ff) & ~0xff00ff
			| (i & 0xff00) * i_7_ & 0xff0000)
		       >>> 8);
    }
    
    static final void method5929(Class648 class648, int i) {
	int i_8_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_8_, (byte) -85);
	Class226 class226 = Class380.aClass226Array3970[i_8_ >> 16];
	Class172.method2145(class229, class226, class648, -271126006);
    }
    
    static final void method5930(Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	if (string.startsWith(Class411.method4906(0, (byte) 38))
	    || string.startsWith(Class411.method4906(1, (byte) 90)))
	    string = string.substring(7);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class553.method6733(string, 857373519);
    }
    
    public static void method5931(int i, int i_9_) {
	if (14 == client.anInt10876 * 175711435) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4504,
				      client.aClass109_11162.aClass10_1379,
				      -2025248406);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeByte(i,
								 (byte) -14);
	    client.aClass109_11162.method1380(class528_sub34, 585192031);
	}
    }
    
    static int decodeSkip(BitBuffer class528_sub42_sub2, byte i) {
	int i_10_ = class528_sub42_sub2.readBits(2, (byte) -105);
	int i_11_;
	if (0 == i_10_)
	    i_11_ = 0;
	else if (1 == i_10_)
	    i_11_ = class528_sub42_sub2.readBits(5, (byte) -37);
	else if (i_10_ == 2)
	    i_11_ = class528_sub42_sub2.readBits(8, (byte) -77);
	else
	    i_11_ = class528_sub42_sub2.readBits(11, (byte) -64);
	return i_11_;
    }
}
