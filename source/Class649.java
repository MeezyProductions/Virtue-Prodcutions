/* Class649 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class649
{
    static int anInt8419;
    public static int[] anIntArray8420;
    static int anInt8421 = 0;
    
    static {
	anInt8419 = 0;
    }
    
    Class649() throws Throwable {
	throw new Error();
    }
    
    static void method7717() {
	if (Class72.anIntArray777 == null)
	    Class72.anIntArray777 = new int[65536];
	else
	    return;
	double d = 0.7 + (Math.random() * 0.03 - 0.015);
	int i = 0;
	for (int i_0_ = 0; i_0_ < 512; i_0_++) {
	    float f = 360.0F * ((float) (i_0_ >> 3) / 64.0F + 0.0078125F);
	    float f_1_ = 0.0625F + (float) (i_0_ & 0x7) / 8.0F;
	    for (int i_2_ = 0; i_2_ < 128; i_2_++) {
		float f_3_ = (float) i_2_ / 128.0F;
		float f_4_ = 0.0F;
		float f_5_ = 0.0F;
		float f_6_ = 0.0F;
		float f_7_ = f / 60.0F;
		int i_8_ = (int) f_7_;
		int i_9_ = i_8_ % 6;
		float f_10_ = f_7_ - (float) i_8_;
		float f_11_ = (1.0F - f_1_) * f_3_;
		float f_12_ = (1.0F - f_1_ * f_10_) * f_3_;
		float f_13_ = f_3_ * (1.0F - (1.0F - f_10_) * f_1_);
		if (i_9_ == 0) {
		    f_4_ = f_3_;
		    f_5_ = f_13_;
		    f_6_ = f_11_;
		} else if (1 == i_9_) {
		    f_4_ = f_12_;
		    f_5_ = f_3_;
		    f_6_ = f_11_;
		} else if (i_9_ == 2) {
		    f_4_ = f_11_;
		    f_5_ = f_3_;
		    f_6_ = f_13_;
		} else if (3 == i_9_) {
		    f_4_ = f_11_;
		    f_5_ = f_12_;
		    f_6_ = f_3_;
		} else if (i_9_ == 4) {
		    f_4_ = f_13_;
		    f_5_ = f_11_;
		    f_6_ = f_3_;
		} else if (i_9_ == 5) {
		    f_4_ = f_3_;
		    f_5_ = f_11_;
		    f_6_ = f_12_;
		}
		f_4_ = (float) Math.pow((double) f_4_, d);
		f_5_ = (float) Math.pow((double) f_5_, d);
		f_6_ = (float) Math.pow((double) f_6_, d);
		int i_14_ = (int) (f_4_ * 256.0F);
		int i_15_ = (int) (256.0F * f_5_);
		int i_16_ = (int) (f_6_ * 256.0F);
		int i_17_ = (i_15_ << 8) + ((i_14_ << 16) + -16777216) + i_16_;
		Class72.anIntArray777[i++] = i_17_;
	    }
	}
    }
    
    static void method7718() {
	if (Class72.anIntArray777 == null)
	    Class72.anIntArray777 = new int[65536];
	else
	    return;
	double d = 0.7 + (Math.random() * 0.03 - 0.015);
	int i = 0;
	for (int i_18_ = 0; i_18_ < 512; i_18_++) {
	    float f = 360.0F * ((float) (i_18_ >> 3) / 64.0F + 0.0078125F);
	    float f_19_ = 0.0625F + (float) (i_18_ & 0x7) / 8.0F;
	    for (int i_20_ = 0; i_20_ < 128; i_20_++) {
		float f_21_ = (float) i_20_ / 128.0F;
		float f_22_ = 0.0F;
		float f_23_ = 0.0F;
		float f_24_ = 0.0F;
		float f_25_ = f / 60.0F;
		int i_26_ = (int) f_25_;
		int i_27_ = i_26_ % 6;
		float f_28_ = f_25_ - (float) i_26_;
		float f_29_ = (1.0F - f_19_) * f_21_;
		float f_30_ = (1.0F - f_19_ * f_28_) * f_21_;
		float f_31_ = f_21_ * (1.0F - (1.0F - f_28_) * f_19_);
		if (i_27_ == 0) {
		    f_22_ = f_21_;
		    f_23_ = f_31_;
		    f_24_ = f_29_;
		} else if (1 == i_27_) {
		    f_22_ = f_30_;
		    f_23_ = f_21_;
		    f_24_ = f_29_;
		} else if (i_27_ == 2) {
		    f_22_ = f_29_;
		    f_23_ = f_21_;
		    f_24_ = f_31_;
		} else if (3 == i_27_) {
		    f_22_ = f_29_;
		    f_23_ = f_30_;
		    f_24_ = f_21_;
		} else if (i_27_ == 4) {
		    f_22_ = f_31_;
		    f_23_ = f_29_;
		    f_24_ = f_21_;
		} else if (i_27_ == 5) {
		    f_22_ = f_21_;
		    f_23_ = f_29_;
		    f_24_ = f_30_;
		}
		f_22_ = (float) Math.pow((double) f_22_, d);
		f_23_ = (float) Math.pow((double) f_23_, d);
		f_24_ = (float) Math.pow((double) f_24_, d);
		int i_32_ = (int) (f_22_ * 256.0F);
		int i_33_ = (int) (256.0F * f_23_);
		int i_34_ = (int) (f_24_ * 256.0F);
		int i_35_ = (i_33_ << 8) + ((i_32_ << 16) + -16777216) + i_34_;
		Class72.anIntArray777[i++] = i_35_;
	    }
	}
    }
    
    public static int method7719(int i, int i_36_) {
	i_36_ = (i & 0x7f) * i_36_ >> 7;
	if (i_36_ < 2)
	    i_36_ = 2;
	else if (i_36_ > 126)
	    i_36_ = 126;
	return (i & 0xff80) + i_36_;
    }
    
    static void method7720() {
	if (anIntArray8420 == null) {
	    anIntArray8420 = new int[65536];
	    RuntimeException_Sub2.anIntArray11922 = new int[65536];
	    double d = 0.7 + (Math.random() * 0.03 - 0.015);
	    for (int i = 0; i < 65536; i++) {
		double d_37_ = (double) (i >> 10 & 0x3f) / 64.0 + 0.0078125;
		double d_38_ = 0.0625 + (double) (i >> 7 & 0x7) / 8.0;
		double d_39_ = (double) (i & 0x7f) / 128.0;
		double d_40_ = d_39_;
		double d_41_ = d_39_;
		double d_42_ = d_39_;
		if (d_38_ != 0.0) {
		    double d_43_;
		    if (d_39_ < 0.5)
			d_43_ = (d_38_ + 1.0) * d_39_;
		    else
			d_43_ = d_38_ + d_39_ - d_38_ * d_39_;
		    double d_44_ = d_39_ * 2.0 - d_43_;
		    double d_45_ = d_37_ + 0.3333333333333333;
		    if (d_45_ > 1.0)
			d_45_--;
		    double d_46_ = d_37_;
		    double d_47_ = d_37_ - 0.3333333333333333;
		    if (d_47_ < 0.0)
			d_47_++;
		    if (6.0 * d_45_ < 1.0)
			d_40_ = (d_43_ - d_44_) * 6.0 * d_45_ + d_44_;
		    else if (2.0 * d_45_ < 1.0)
			d_40_ = d_43_;
		    else if (d_45_ * 3.0 < 2.0)
			d_40_ = d_44_ + ((d_43_ - d_44_)
					 * (0.6666666666666666 - d_45_) * 6.0);
		    else
			d_40_ = d_44_;
		    if (d_46_ * 6.0 < 1.0)
			d_41_ = 6.0 * (d_43_ - d_44_) * d_46_ + d_44_;
		    else if (d_46_ * 2.0 < 1.0)
			d_41_ = d_43_;
		    else if (3.0 * d_46_ < 2.0)
			d_41_ = ((0.6666666666666666 - d_46_) * (d_43_ - d_44_)
				 * 6.0) + d_44_;
		    else
			d_41_ = d_44_;
		    if (6.0 * d_47_ < 1.0)
			d_42_ = 6.0 * (d_43_ - d_44_) * d_47_ + d_44_;
		    else if (d_47_ * 2.0 < 1.0)
			d_42_ = d_43_;
		    else if (3.0 * d_47_ < 2.0)
			d_42_ = 6.0 * ((d_43_ - d_44_)
				       * (0.6666666666666666 - d_47_)) + d_44_;
		    else
			d_42_ = d_44_;
		}
		d_40_ = Math.pow(d_40_, d);
		d_41_ = Math.pow(d_41_, d);
		d_42_ = Math.pow(d_42_, d);
		int i_48_ = (int) (d_40_ * 256.0);
		int i_49_ = (int) (d_41_ * 256.0);
		int i_50_ = (int) (256.0 * d_42_);
		int i_51_ = i_50_ + ((i_48_ << 16) + (i_49_ << 8));
		anIntArray8420[i] = i_51_ & 0xffffff;
		int i_52_ = i_48_ + ((i_50_ << 16) + (i_49_ << 8));
		RuntimeException_Sub2.anIntArray11922[i] = i_52_;
	    }
	}
    }
    
    public static int method7721(int i, int i_53_) {
	i_53_ = (i & 0x7f) * i_53_ >> 7;
	if (i_53_ < 2)
	    i_53_ = 2;
	else if (i_53_ > 126)
	    i_53_ = 126;
	return (i & 0xff80) + i_53_;
    }
    
    public static final int method7722(int i, int i_54_) {
	if (-2 == i)
	    return 12345678;
	if (-1 == i) {
	    if (i_54_ < 2)
		i_54_ = 2;
	    else if (i_54_ > 126)
		i_54_ = 126;
	    return i_54_;
	}
	i_54_ = i_54_ * (i & 0x7f) >> 7;
	if (i_54_ < 2)
	    i_54_ = 2;
	else if (i_54_ > 126)
	    i_54_ = 126;
	return i_54_ + (i & 0xff80);
    }
    
    public static final int method7723(int i, int i_55_) {
	if (-2 == i)
	    return 12345678;
	if (-1 == i) {
	    if (i_55_ < 2)
		i_55_ = 2;
	    else if (i_55_ > 126)
		i_55_ = 126;
	    return i_55_;
	}
	i_55_ = i_55_ * (i & 0x7f) >> 7;
	if (i_55_ < 2)
	    i_55_ = 2;
	else if (i_55_ > 126)
	    i_55_ = 126;
	return i_55_ + (i & 0xff80);
    }
    
    public static int method7724(int i, int i_56_) {
	int i_57_ = i_56_ >>> 24;
	int i_58_ = 255 - i_57_;
	i_56_ = (i_57_ * (i_56_ & 0xff00ff) & ~0xff00ff
		 | i_57_ * (i_56_ & 0xff00) & 0xff0000) >>> 8;
	return i_56_ + ((i_58_ * (i & 0xff00ff) & ~0xff00ff
			 | (i & 0xff00) * i_58_ & 0xff0000)
			>>> 8);
    }
    
    public static final int method7725(int i, int i_59_) {
	if (-2 == i)
	    return 12345678;
	if (-1 == i) {
	    if (i_59_ < 2)
		i_59_ = 2;
	    else if (i_59_ > 126)
		i_59_ = 126;
	    return i_59_;
	}
	i_59_ = i_59_ * (i & 0x7f) >> 7;
	if (i_59_ < 2)
	    i_59_ = 2;
	else if (i_59_ > 126)
	    i_59_ = 126;
	return i_59_ + (i & 0xff80);
    }
    
    public static void method7726(boolean bool, boolean bool_60_) {
	if (bool) {
	    anInt8421 += -1217565889;
	    Class327.method4260(-1980673625);
	}
	if (bool_60_) {
	    anInt8419 += -1925305261;
	    Class622.method7418(220702414);
	}
    }
    
    public static int method7727(int i, int i_61_, int i_62_) {
	int i_63_ = 255 - i_62_;
	i_61_ = (i_62_ * (i_61_ & 0xff00ff) & ~0xff00ff
		 | i_62_ * (i_61_ & 0xff00) & 0xff0000) >>> 8;
	return i_61_ + (((i & 0xff00ff) * i_63_ & ~0xff00ff
			 | i_63_ * (i & 0xff00) & 0xff0000)
			>>> 8);
    }
    
    static final void method7728(Class648 class648, byte i) {
	int i_64_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_64_, (byte) 2);
	Class226 class226 = Class380.aClass226Array3970[i_64_ >> 16];
	Class160.method2059(class229, class226, true, 2, class648,
			    -1649643344);
    }
    
    static final void method7729(Class648 class648, int i) {
	if (!Class495.aClass283_Sub1_5578.method3787((byte) -72)
		 .method3977(2061175062))
	    throw new RuntimeException();
	Class326_Sub3 class326_sub3
	    = ((Class326_Sub3)
	       Class495.aClass283_Sub1_5578.method3811(-1358900478));
	class326_sub3.method9135(Class693.aClass432_8695, -1, 0.0F,
				 -1479184898);
	client.aBool10982 = true;
    }
    
    public static boolean method7730(char c, int i) {
	return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
    }
    
    static final void method7731(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= 1239022665;
    }
    
    public static final void method7732(String string, int i) {
	if (null != Class5_Sub19.aClass89Array10849) {
	    Class109 class109 = Class591.method7078((byte) 104);
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4476,
				      class109.aClass10_1379, -1964698659);
	    class528_sub34.aClass528_Sub42_Sub2_10481
		.writeByte(Class14.method627(string, 673174068), (byte) -115);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeString(string,
								 -1936289654);
	    class109.method1380(class528_sub34, 1203650228);
	}
    }
    
    public static final boolean method7733(char c, byte i) {
	return (c >= '!' && c < '0' || c >= ':' && c <= '@' && '<' != c
		|| c >= '[' && c <= '_' || c >= '{');
    }
    
    public static void method7734(int i, int i_65_) {
	ClientPacket class528_sub21_sub7
	    = Class79.method1146(12, (long) i);
	class528_sub21_sub7.method10495(-616416812);
    }
}
