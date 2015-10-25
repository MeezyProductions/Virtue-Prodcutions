/* Class663 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class663
{
    static int anInt8452 = 0;
    static byte[][] aByteArrayArray8453;
    static int anInt8454;
    static int[] anIntArray8455;
    static byte[][] aByteArrayArray8456;
    static byte[][] aByteArrayArray8457;
    static int anInt8458 = 0;
    
    Class663() throws Throwable {
	throw new Error();
    }
    
    public static synchronized byte[] method7883(int i, boolean bool,
						 int i_0_) {
	if ((100 == i || i < 100 && bool) && 439788743 * anInt8452 > 0) {
	    byte[] is
		= aByteArrayArray8453[(anInt8452 -= -1091248905) * 439788743];
	    aByteArrayArray8453[439788743 * anInt8452] = null;
	    return is;
	}
	if ((5000 == i || i < 5000 && bool) && anInt8458 * 1831194827 > 0) {
	    byte[] is
		= aByteArrayArray8456[(anInt8458 -= -1401416477) * 1831194827];
	    aByteArrayArray8456[1831194827 * anInt8458] = null;
	    return is;
	}
	if ((30000 == i || i < 30000 && bool) && anInt8454 * -1840138507 > 0) {
	    byte[] is = (aByteArrayArray8457
			 [(anInt8454 -= -1397832355) * -1840138507]);
	    aByteArrayArray8457[-1840138507 * anInt8454] = null;
	    return is;
	}
	if (null != Class424.aByteArrayArrayArray4788) {
	    for (int i_1_ = 0; i_1_ < Class180.anIntArray2090.length; i_1_++) {
		if ((i == Class180.anIntArray2090[i_1_]
		     || i < Class180.anIntArray2090[i_1_] && bool)
		    && anIntArray8455[i_1_] > 0) {
		    byte[] is = (Class424.aByteArrayArrayArray4788[i_1_]
				 [--anIntArray8455[i_1_]]);
		    Class424.aByteArrayArrayArray4788[i_1_][(anIntArray8455
							     [i_1_])]
			= null;
		    return is;
		}
	    }
	}
	if (bool && null != Class180.anIntArray2090) {
	    for (int i_2_ = 0; i_2_ < Class180.anIntArray2090.length; i_2_++) {
		if (i <= Class180.anIntArray2090[i_2_]
		    && (anIntArray8455[i_2_]
			< Class424.aByteArrayArrayArray4788[i_2_].length))
		    return new byte[Class180.anIntArray2090[i_2_]];
	    }
	}
	return new byte[i];
    }
    
    public static synchronized byte[] method7884(int i, int i_3_) {
	return method7883(i, false, 1239022665);
    }
    
    public static synchronized void method7885(byte[] is, int i) {
	if (is.length == 100 && 439788743 * anInt8452 < 1000)
	    aByteArrayArray8453[(anInt8452 += -1091248905) * 439788743 - 1]
		= is;
	else if (5000 == is.length && 1831194827 * anInt8458 < 250)
	    aByteArrayArray8456[(anInt8458 += -1401416477) * 1831194827 - 1]
		= is;
	else if (30000 == is.length && anInt8454 * -1840138507 < 50)
	    aByteArrayArray8457[(anInt8454 += -1397832355) * -1840138507 - 1]
		= is;
	else if (Class424.aByteArrayArrayArray4788 != null) {
	    for (int i_4_ = 0; i_4_ < Class180.anIntArray2090.length; i_4_++) {
		if (Class180.anIntArray2090[i_4_] == is.length
		    && (anIntArray8455[i_4_]
			< Class424.aByteArrayArrayArray4788[i_4_].length)) {
		    Class424.aByteArrayArrayArray4788[i_4_]
			[anIntArray8455[i_4_]++]
			= is;
		    break;
		}
	    }
	}
    }
    
    public static synchronized byte[] method7886(int i) {
	return method7883(i, false, 1239022665);
    }
    
    static {
	anInt8454 = 0;
	aByteArrayArray8453 = new byte[1000][];
	aByteArrayArray8456 = new byte[250][];
	aByteArrayArray8457 = new byte[50][];
    }
    
    public static synchronized void method7887(byte[] is) {
	if (is.length == 100 && 439788743 * anInt8452 < 1000)
	    aByteArrayArray8453[(anInt8452 += -1091248905) * 439788743 - 1]
		= is;
	else if (5000 == is.length && 1831194827 * anInt8458 < 250)
	    aByteArrayArray8456[(anInt8458 += -1401416477) * 1831194827 - 1]
		= is;
	else if (30000 == is.length && anInt8454 * -1840138507 < 50)
	    aByteArrayArray8457[(anInt8454 += -1397832355) * -1840138507 - 1]
		= is;
	else if (Class424.aByteArrayArrayArray4788 != null) {
	    for (int i = 0; i < Class180.anIntArray2090.length; i++) {
		if (Class180.anIntArray2090[i] == is.length
		    && (anIntArray8455[i]
			< Class424.aByteArrayArrayArray4788[i].length)) {
		    Class424.aByteArrayArrayArray4788[i][anIntArray8455[i]++]
			= is;
		    break;
		}
	    }
	}
    }
    
    public static void method7888(Class511 class511, Class511 class511_5_,
				  int i) {
	if (null != class511.aClass511_6966)
	    class511.method6259(1372642698);
	class511.aClass511_6966 = class511_5_;
	class511.aClass511_6965 = class511_5_.aClass511_6965;
	class511.aClass511_6966.aClass511_6965 = class511;
	class511.aClass511_6965.aClass511_6966 = class511;
    }
    
    static final void method7889(Class648 class648, int i) {
	Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967
						  .aClass691_Sub35_10597),
						 0, 1208643035);
	Class243.method3387(2140823330);
	client.aBool11161 = false;
    }
    
    public static int method7890(int i, int i_6_, boolean bool, int i_7_) {
	Class528_Sub6 class528_sub6 = IncomingPacket.method4814(i, bool, -412502685);
	if (null == class528_sub6)
	    return -1;
	if (i_6_ < 0
	    || i_6_ >= ((Class528_Sub6) class528_sub6).anIntArray10253.length)
	    return -1;
	return ((Class528_Sub6) class528_sub6).anIntArray10253[i_6_];
    }
}
