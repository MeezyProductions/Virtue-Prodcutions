/* Class257 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class257 implements IClientEnum
{
    static Class257 aClass257_2829;
    public static Class257 aClass257_2830 = new Class257(2, 0);
    int anInt2831;
    public int anInt2832;
    public static Class257 aClass257_2833 = new Class257(1, 1);
    
    public int method68() {
	return ((Class257) this).anInt2831 * 1242555121;
    }
    
    Class257(int i, int i_0_) {
	anInt2832 = 749775315 * i;
	((Class257) this).anInt2831 = i_0_ * -1449865711;
    }
    
    static {
	aClass257_2829 = new Class257(0, 2);
    }
    
    public int method5() {
	return ((Class257) this).anInt2831 * 1242555121;
    }
    
    public int method6() {
	return ((Class257) this).anInt2831 * 1242555121;
    }
    
    public int method72() {
	return ((Class257) this).anInt2831 * 1242555121;
    }
    
    public int method71() {
	return ((Class257) this).anInt2831 * 1242555121;
    }
    
    public int method73() {
	return ((Class257) this).anInt2831 * 1242555121;
    }
    
    static final void method3470(Class648 class648, byte i) {
	int i_1_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class528_Sub21_Sub17 class528_sub21_sub17 = Class518.method6291(i_1_);
	if (class528_sub21_sub17 == null)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -1;
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= class528_sub21_sub17.anInt11642 * 537517007;
    }
    
    public static void method3471(int[] is, int[] is_2_, int i) {
	if (null == is || null == is_2_) {
	    Class180.anIntArray2090 = null;
	    Class663.anIntArray8455 = null;
	    Class424.aByteArrayArrayArray4788 = null;
	} else {
	    Class180.anIntArray2090 = is;
	    Class663.anIntArray8455 = new int[is.length];
	    Class424.aByteArrayArrayArray4788 = new byte[is.length][][];
	    for (int i_3_ = 0; i_3_ < Class180.anIntArray2090.length; i_3_++)
		Class424.aByteArrayArrayArray4788[i_3_]
		    = new byte[is_2_[i_3_]][];
	}
    }
    
    static final void method3472(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -577899301;
	if (Class495.aClass283_Sub1_5578.method3786((byte) -65)
	    != Class294.aClass294_3227)
	    throw new RuntimeException();
	((Class684_Sub4) Class495.aClass283_Sub1_5578.method3785((byte) 29))
	    .method10115
	    ((((Class648) class648).anIntArray8394
	      [717927929 * ((Class648) class648).anInt8395]),
	     (((Class648) class648).anIntArray8394
	      [((Class648) class648).anInt8395 * 717927929 + 1]),
	     (((Class648) class648).anIntArray8394
	      [717927929 * ((Class648) class648).anInt8395 + 2]),
	     -799036115);
    }
    
    static final byte[] method3473(byte[] is, byte i) {
	ByteBuffer class528_sub42 = new ByteBuffer(is);
	Class464 class464 = new Class464(class528_sub42);
	Class442 class442 = class464.method5604(1151072428);
	int i_4_ = class464.method5607((byte) 72);
	if (i_4_ < 0 || (0 != 92443121 * Class446.anInt4944
			 && i_4_ > 92443121 * Class446.anInt4944))
	    throw new RuntimeException();
	if (class442 == Class442.aClass442_4908) {
	    byte[] is_5_ = new byte[i_4_];
	    class528_sub42.method9718(is_5_, 0, i_4_, -1456124512);
	    return is_5_;
	}
	int i_6_ = class464.method5605(-1965902293);
	if (i_6_ < 0 || (Class446.anInt4944 * 92443121 != 0
			 && i_6_ > 92443121 * Class446.anInt4944))
	    throw new RuntimeException();
	byte[] is_7_;
	if (Class442.aClass442_4905 == class442) {
	    is_7_ = new byte[i_6_];
	    Class694.method8167(is_7_, i_6_, is, i_4_, 9);
	} else if (Class442.aClass442_4904 == class442) {
	    is_7_ = new byte[i_6_];
	    synchronized (Class446.aClass78_4941) {
		Class446.aClass78_4941.method1136(class528_sub42, is_7_,
						  -1588163259);
	    }
	} else if (Class442.aClass442_4907 == class442) {
	    try {
		is_7_ = Class211.method2958(class528_sub42, i_6_, 518020218);
	    } catch (IOException ioexception) {
		throw new RuntimeException(ioexception);
	    }
	} else
	    throw new RuntimeException();
	return is_7_;
    }
    
    public static final void method3474(short i) {
	if (!client.aBool11187) {
	    client.aFloat11037 += (-12.0F - client.aFloat11037) / 2.0F;
	    client.aBool10982 = true;
	    client.aBool11187 = true;
	}
    }
    
    static final void method3475(Class648 class648, int i) {
	int i_8_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (((Class648) class648).aClass308_8391.aBoolArray3395[i_8_] ? 1
	       : 0);
    }
    
    static final void method3476(Class648 class648, short i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (712301817 * client.anInt10872
	       == ((Class648) class648).aClass645_Sub1_Sub5_Sub1_8389
		      .method10687(1600226731)) ? 1 : 0;
    }
}
