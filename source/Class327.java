/* Class327 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class327
{
    static final int anInt3498 = 2048;
    static final int anInt3499 = 11;
    static final int anInt3500 = 2;
    static final int anInt3501 = 6;
    static int[] anIntArray3502 = new int[512];
    
    static {
	int i = 9;
	for (int i_0_ = i - 1; i_0_ >= 0; i_0_--) {
	    int i_1_ = 1 << i - i_0_ - 1;
	    int i_2_ = 1 << i - i_0_;
	    for (int i_3_ = i_1_; i_3_ < i_2_; i_3_++)
		anIntArray3502[i_3_]
		    = (i_2_ - i_3_ << 6 >>> i - i_0_ - 1) + (i_0_ << 6);
	}
    }
    
    static final void method4257(Class648 class648, byte i) {
	int i_4_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_4_, (byte) -60);
	Class226 class226 = Class380.aClass226Array3970[i_4_ >> 16];
	Class572.method6861(class229, class226, class648, -1786136707);
    }
    
    static final void method4258(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= 1239022665;
	int i_5_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class528_Sub22.method9433(i_5_, (byte) -41);
    }
    
    public static int method4259(int i, int i_6_) {
	i = --i | i >>> 1;
	i |= i >>> 2;
	i |= i >>> 4;
	i |= i >>> 8;
	i |= i >>> 16;
	return 1 + i;
    }
    
    static void method4260(int i) {
	if (Class72.anIntArray777 == null)
	    Class72.anIntArray777 = new int[65536];
	else
	    return;
	double d = 0.7 + (Math.random() * 0.03 - 0.015);
	int i_7_ = 0;
	for (int i_8_ = 0; i_8_ < 512; i_8_++) {
	    float f = 360.0F * ((float) (i_8_ >> 3) / 64.0F + 0.0078125F);
	    float f_9_ = 0.0625F + (float) (i_8_ & 0x7) / 8.0F;
	    for (int i_10_ = 0; i_10_ < 128; i_10_++) {
		float f_11_ = (float) i_10_ / 128.0F;
		float f_12_ = 0.0F;
		float f_13_ = 0.0F;
		float f_14_ = 0.0F;
		float f_15_ = f / 60.0F;
		int i_16_ = (int) f_15_;
		int i_17_ = i_16_ % 6;
		float f_18_ = f_15_ - (float) i_16_;
		float f_19_ = (1.0F - f_9_) * f_11_;
		float f_20_ = (1.0F - f_9_ * f_18_) * f_11_;
		float f_21_ = f_11_ * (1.0F - (1.0F - f_18_) * f_9_);
		if (i_17_ == 0) {
		    f_12_ = f_11_;
		    f_13_ = f_21_;
		    f_14_ = f_19_;
		} else if (1 == i_17_) {
		    f_12_ = f_20_;
		    f_13_ = f_11_;
		    f_14_ = f_19_;
		} else if (i_17_ == 2) {
		    f_12_ = f_19_;
		    f_13_ = f_11_;
		    f_14_ = f_21_;
		} else if (3 == i_17_) {
		    f_12_ = f_19_;
		    f_13_ = f_20_;
		    f_14_ = f_11_;
		} else if (i_17_ == 4) {
		    f_12_ = f_21_;
		    f_13_ = f_19_;
		    f_14_ = f_11_;
		} else if (i_17_ == 5) {
		    f_12_ = f_11_;
		    f_13_ = f_19_;
		    f_14_ = f_20_;
		}
		f_12_ = (float) Math.pow((double) f_12_, d);
		f_13_ = (float) Math.pow((double) f_13_, d);
		f_14_ = (float) Math.pow((double) f_14_, d);
		int i_22_ = (int) (f_12_ * 256.0F);
		int i_23_ = (int) (256.0F * f_13_);
		int i_24_ = (int) (f_14_ * 256.0F);
		int i_25_ = (i_23_ << 8) + ((i_22_ << 16) + -16777216) + i_24_;
		Class72.anIntArray777[i_7_++] = i_25_;
	    }
	}
    }
    
    static final boolean method4261(char c, int i) {
	if (Character.isISOControl(c))
	    return false;
	if (Class578.method6913(c, (byte) -107))
	    return true;
	char[] cs = Class86.aCharArray859;
	for (int i_26_ = 0; i_26_ < cs.length; i_26_++) {
	    char c_27_ = cs[i_26_];
	    if (c == c_27_)
		return true;
	}
	cs = Class86.aCharArray860;
	for (int i_28_ = 0; i_28_ < cs.length; i_28_++) {
	    char c_29_ = cs[i_28_];
	    if (c == c_29_)
		return true;
	}
	return false;
    }
    
    static void method4262(int i) {
	Class71.aClass283_Sub1_774 = null;
	Class71.aBool776 = false;
    }
}
