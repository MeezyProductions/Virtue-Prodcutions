/* Class156 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Class156 implements Interface22
{
    static int[] anIntArray1733;
    static double aDouble1734 = -1.0;
    public static String aString1735;
    public static Class446 aClass446_1736;
    
    abstract byte[] method1851(Class600 class600, int i, byte i_0_);
    
    public abstract boolean method122(Class600 class600, int i,
				      Class595 class595, float f, int i_1_,
				      int i_2_, boolean bool, byte i_3_);
    
    public int[] method126(Class600 class600, int i, float f, int i_4_,
			   int i_5_, boolean bool) {
	return method1852(class600, i, (double) f);
    }
    
    int[] method1852(Class600 class600, int i, double d) {
	byte[] is = method1851(class600, i, (byte) 54);
	if (null == is)
	    return null;
	int[] is_6_;
	try {
	    byte i_7_ = (byte) (is[0] & 0xff);
	    if (Class600.aClass600_7867 == class600) {
		if (i_7_ != 6)
		    return null;
		int[] is_8_ = null;
		int i_9_ = 1;
		for (int i_10_ = 0; i_10_ < 6; i_10_++) {
		    int i_11_
			= ((is[i_9_] & 0xff) << 24
			   | (is[i_9_ + 1] & 0xff) << 16
			   | (is[2 + i_9_] & 0xff) << 8 | is[i_9_ + 3] & 0xff);
		    byte[] is_12_ = new byte[i_11_];
		    System.arraycopy(is, 4 + i_9_, is_12_, 0, i_11_);
		    int[] is_13_ = method1855(is_12_, false, 1976437513);
		    if (0 == i_10_)
			is_8_ = new int[6 * is_13_.length];
		    System.arraycopy(is_13_, 0, is_8_, i_10_ * is_13_.length,
				     is_13_.length);
		    i_9_ += i_11_ + 4;
		}
		if (1.0 != d)
		    Class181_Sub1.method8398(is_8_, d);
		return is_8_;
	    }
	    if (i_7_ != 1)
		return null;
	    byte[] is_14_ = new byte[is.length - 5];
	    System.arraycopy(is, 5, is_14_, 0, is.length - 5);
	    int[] is_15_ = method1855(is_14_, false, 1468671344);
	    if (null == is_15_)
		return null;
	    if (1.0 != d)
		Class181_Sub1.method8398(is_15_, d);
	    is_6_ = is_15_;
	} catch (IOException ioexception) {
	    return null;
	}
	return is_6_;
    }
    
    float[] method1853(Class600 class600, int i, double d) {
	if (Class600.aClass600_7866 != class600)
	    return null;
	int[] is = method1852(class600, i, d);
	if (is == null)
	    return null;
	int[] is_16_ = null;
	byte[] is_17_ = method1851(Class600.aClass600_7868, i, (byte) 48);
	if (null != is_17_) {
	    try {
		byte i_18_ = (byte) (is_17_[0] & 0xff);
		if (1 != i_18_)
		    return null;
		byte[] is_19_ = new byte[is_17_.length - 5];
		System.arraycopy(is_17_, 5, is_19_, 0, is_17_.length - 5);
		is_16_ = method1855(is_19_, false, 1519918776);
		for (int i_20_ = 0; i_20_ < is_16_.length; i_20_++)
		    is_16_[i_20_] = is_16_[i_20_] & 0xff;
	    } catch (IOException ioexception) {
		/* empty */
	    }
	}
	if (is_16_ == null)
	    is_16_ = new int[is.length];
	float[] fs = new float[4 * is.length];
	int i_21_ = 0;
	for (int i_22_ = 0; i_22_ < is.length; i_22_++) {
	    int i_23_ = is[i_22_];
	    int i_24_ = i_23_ >>> 24;
	    int i_25_ = (i_23_ & 0xff0000) >> 16;
	    int i_26_ = (i_23_ & 0xff00) >> 8;
	    int i_27_ = i_23_ & 0xff;
	    float f = 1.0F + 31.0F * (float) is_16_[i_22_] / 255.0F;
	    fs[i_21_++] = (float) i_25_ * f / 255.0F;
	    fs[i_21_++] = f * (float) i_26_ / 255.0F;
	    fs[i_21_++] = f * (float) i_27_ / 255.0F;
	    fs[i_21_++] = (float) i_24_ / 255.0F;
	}
	return fs;
    }
    
    public void method27(byte i) {
	/* empty */
    }
    
    public int[] method117(Class600 class600, int i, float f, int i_28_,
			   int i_29_, boolean bool, int i_30_) {
	return method1854(class600, i, (double) f);
    }
    
    public abstract boolean method120(Class600 class600, int i,
				      Class595 class595, float f, int i_31_,
				      int i_32_, boolean bool);
    
    int[] method1854(Class600 class600, int i, double d) {
	int[] is = method1852(class600, i, d);
	if (is == null)
	    return null;
	for (int i_33_ = 0; i_33_ < is.length; i_33_++) {
	    if (0 != (is[i_33_] & 0xffffff))
		is[i_33_] = is[i_33_] | ~0xffffff;
	    else
		is[i_33_] = is[i_33_] & 0xffffff;
	}
	return is;
    }
    
    int[] method1855(byte[] is, boolean bool, int i) throws IOException {
	BufferedImage bufferedimage
	    = ImageIO.read(new ByteArrayInputStream(is));
	if (null == bufferedimage)
	    return null;
	int[] is_34_ = Class207.method2927(bufferedimage, -1687604580);
	if (bool) {
	    for (int i_35_ = bufferedimage.getHeight() - 1; i_35_ >= 0;
		 i_35_--) {
		int i_36_ = i_35_ * bufferedimage.getWidth();
		for (int i_37_ = (i_35_ + 1) * bufferedimage.getWidth();
		     i_36_ < i_37_; i_36_++) {
		    i_37_--;
		    int i_38_ = is_34_[i_36_];
		    is_34_[i_36_] = is_34_[i_37_];
		    is_34_[i_37_] = i_38_;
		}
	    }
	}
	return is_34_;
    }
    
    static {
	anIntArray1733 = new int[256];
    }
    
    public float[] method119(Class600 class600, int i, float f, int i_39_,
			     int i_40_, boolean bool, int i_41_) {
	return method1853(class600, i, (double) f);
    }
    
    abstract byte[] method1856(Class600 class600, int i);
    
    Class156() {
	/* empty */
    }
    
    public int[] method127(Class600 class600, int i, float f, int i_42_,
			   int i_43_, boolean bool, byte i_44_) {
	return method1852(class600, i, (double) f);
    }
    
    public void method26() {
	/* empty */
    }
    
    public void method124() {
	/* empty */
    }
    
    public abstract boolean method118(Class600 class600, int i,
				      Class595 class595, float f, int i_45_,
				      int i_46_, boolean bool);
    
    public int[] method123(Class600 class600, int i, float f, int i_47_,
			   int i_48_, boolean bool) {
	return method1854(class600, i, (double) f);
    }
    
    public int[] method125(Class600 class600, int i, float f, int i_49_,
			   int i_50_, boolean bool) {
	return method1852(class600, i, (double) f);
    }
    
    abstract byte[] method1857(Class600 class600, int i);
    
    public int[] method121(Class600 class600, int i, float f, int i_51_,
			   int i_52_, boolean bool) {
	return method1852(class600, i, (double) f);
    }
    
    static void method1858(byte[] is, byte i) {
	ByteBuffer class528_sub42 = new ByteBuffer(is);
	for (;;) {
	    int i_53_ = class528_sub42.readUnsignedByte((byte) 116);
	    if (0 == i_53_)
		break;
	    if (i_53_ == 1) {
		int i_54_ = class528_sub42.readUnsignedShort(275343407);
		Class365.aClass218_3848.method3106(i_54_, 1696277467);
	    }
	}
    }
    
    static final void method1859(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class229.aBool2488 ? 1 : 0;
    }
    
    static void method1860(int i, int i_55_, int i_56_, boolean bool,
			   int i_57_, boolean bool_58_, int i_59_) {
	if (i < i_55_) {
	    int i_60_ = (i_55_ + i) / 2;
	    int i_61_ = i;
	    Class602_Sub1 class602_sub1
		= Class12.aClass602_Sub1Array180[i_60_];
	    Class12.aClass602_Sub1Array180[i_60_]
		= Class12.aClass602_Sub1Array180[i_55_];
	    Class12.aClass602_Sub1Array180[i_55_] = class602_sub1;
	    for (int i_62_ = i; i_62_ < i_55_; i_62_++) {
		if (method1862(Class12.aClass602_Sub1Array180[i_62_],
			       class602_sub1, i_56_, bool, i_57_, bool_58_,
			       568869704)
		    <= 0) {
		    Class602_Sub1 class602_sub1_63_
			= Class12.aClass602_Sub1Array180[i_62_];
		    Class12.aClass602_Sub1Array180[i_62_]
			= Class12.aClass602_Sub1Array180[i_61_];
		    Class12.aClass602_Sub1Array180[i_61_++]
			= class602_sub1_63_;
		}
	    }
	    Class12.aClass602_Sub1Array180[i_55_]
		= Class12.aClass602_Sub1Array180[i_61_];
	    Class12.aClass602_Sub1Array180[i_61_] = class602_sub1;
	    method1860(i, i_61_ - 1, i_56_, bool, i_57_, bool_58_, 1726040172);
	    method1860(i_61_ + 1, i_55_, i_56_, bool, i_57_, bool_58_,
		       -655238428);
	}
    }
    
    public static void method1861(int i) {
	if (!Class101.aBool1286) {
	    Class282.method3757((client.gameScene.method5973((byte) 47)
				 .aClass546ArrayArrayArray7162),
				2094365823);
	    if ((client.gameScene.method5973((byte) 10)
		 .aClass546ArrayArrayArray7164)
		!= null)
		Class282.method3757((client.gameScene.method5973
				     ((byte) 122)
				     .aClass546ArrayArrayArray7164),
				    1910994865);
	    Class101.aBool1286 = true;
	}
    }
    
    static int method1862(Class602_Sub1 class602_sub1,
			  Class602_Sub1 class602_sub1_64_, int i, boolean bool,
			  int i_65_, boolean bool_66_, int i_67_) {
	int i_68_ = Class624.method7442(class602_sub1, class602_sub1_64_, i,
					bool, (byte) -35);
	if (i_68_ != 0) {
	    if (bool)
		return -i_68_;
	    return i_68_;
	}
	if (i_65_ == -1)
	    return 0;
	int i_69_ = Class624.method7442(class602_sub1, class602_sub1_64_,
					i_65_, bool_66_, (byte) -55);
	if (bool_66_)
	    return -i_69_;
	return i_69_;
    }
    
    static final void method1863(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class54.anInt674 * 109946311;
    }
    
    static final void method1864(Class648 class648, int i) {
	int i_70_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class691_Sub32.aClass216_10805.method3028(i_70_, -2068647323)
		  .method3000(1264800468);
    }
}
