/* Class173_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class Class173_Sub3 extends Class173
{
    float[] aFloatArray9716;
    int anInt9717;
    boolean aBool9718;
    int[] anIntArray9719;
    int anInt9720;
    boolean aBool9721 = false;
    Class418 aClass418_9722;
    int anInt9723;
    int anInt9724;
    int anInt9725;
    int anInt9726;
    int anInt9727;
    int anInt9728;
    int anInt9729;
    Class163_Sub1 aClass163_Sub1_9730;
    Class107[] aClass107Array9731;
    int anInt9732;
    Class433 aClass433_9733;
    Class418 aClass418_9734;
    int anInt9735;
    Class418 aClass418_9736;
    float[][] aFloatArrayArray9737;
    int anInt9738;
    int anInt9739;
    int anInt9740;
    int anInt9741;
    float aFloat9742;
    float aFloat9743;
    float aFloat9744;
    int anInt9745;
    float aFloat9746;
    float aFloat9747;
    int anInt9748;
    int anInt9749;
    Class186 aClass186_9750;
    float aFloat9751;
    Class186 aClass186_9752;
    Class151 aClass151_9753;
    Class151 aClass151_9754;
    int anInt9755;
    public static Class618 aClass618_9756;
    
    public void method2400() {
	((Class173_Sub3) this).aClass163_Sub1_9730 = null;
	((Class173_Sub3) this).aClass151_9753 = null;
    }
    
    byte method8925(int i) {
	return aClass165_1984.method2093(i, (byte) -28).aByte1779;
    }
    
    public Class152 method2528() {
	return new Class152(0, "Pure Java", 1, "CPU", 0L, false);
    }
    
    void method2154(int i, int i_0_) throws Exception_Sub5 {
	aClass163_Sub2_1999.method8924(i, i_0_);
	if (anInterface22_1991 != null)
	    anInterface22_1991.method27((byte) -6);
    }
    
    public void method2155() {
	/* empty */
    }
    
    public void method2243(boolean bool) {
	/* empty */
    }
    
    public void method2158(int i) {
	int i_1_ = i - ((Class173_Sub3) this).anInt9717 * 1133111151;
	for (Class528_Sub4 class528_sub4
		 = (Class528_Sub4) ((Class173_Sub3) this).aClass186_9750
				       .method2742(526384140);
	     class528_sub4 != null;
	     class528_sub4
		 = (Class528_Sub4) ((Class173_Sub3) this).aClass186_9750
				       .method2749(1006809078)) {
	    if (((Class528_Sub4) class528_sub4).aBool10223) {
		((Class528_Sub4) class528_sub4).anInt10221 += i_1_;
		int i_2_ = ((Class528_Sub4) class528_sub4).anInt10221 / 50;
		if (i_2_ > 0) {
		    Class160 class160
			= aClass165_1984.method2093(((Class528_Sub4)
						     class528_sub4).anInt10219,
						    (byte) -111);
		    float f = (float) (class160.anInt1774 * -726179659);
		    class528_sub4.method9252
			((int) ((float) i_1_ / 1000.0F
				* (float) class160.aByte1775 / 64.0F * f),
			 (int) (f * ((float) class160.aByte1776
				     * ((float) i_1_ / 1000.0F) / 64.0F)));
		    ((Class528_Sub4) class528_sub4).anInt10221 -= i_2_ * 50;
		}
		((Class528_Sub4) class528_sub4).aBool10223 = false;
	    }
	}
	((Class173_Sub3) this).anInt9717 = i * -868264049;
	((Class173_Sub3) this).aClass186_9752.method2747(5, -597008139);
	((Class173_Sub3) this).aClass186_9750.method2747(5, 436819619);
    }
    
    public int method2159() {
	return 0;
    }
    
    public void method2512(float f, float f_3_, float f_4_, float[] fs) {
	float f_5_
	    = (f * ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[2]
	       + ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[14]
	       + (f_3_
		  * ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[6])
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[10]
		  * f_4_));
	float f_6_
	    = (f_4_ * ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[11]
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[3] * f
		  + ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[15]
		  + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[7]
		     * f_3_)));
	if (f_5_ < -f_6_ || f_5_ > f_6_) {
	    float[] fs_7_ = fs;
	    float[] fs_8_ = fs;
	    fs[2] = Float.NaN;
	    fs_8_[1] = Float.NaN;
	    fs_7_[0] = Float.NaN;
	} else {
	    float f_9_ = (f_4_ * (((Class173_Sub3) this).aClass418_9736
				  .aFloatArray4768[8])
			  + (f_3_ * (((Class173_Sub3) this).aClass418_9736
				     .aFloatArray4768[4])
			     + ((((Class173_Sub3) this).aClass418_9736
				 .aFloatArray4768[0]) * f
				+ (((Class173_Sub3) this).aClass418_9736
				   .aFloatArray4768[12]))));
	    if (f_9_ < -f_6_ || f_9_ > f_6_) {
		float[] fs_10_ = fs;
		float[] fs_11_ = fs;
		fs[2] = Float.NaN;
		fs_11_[1] = Float.NaN;
		fs_10_[0] = Float.NaN;
	    } else {
		float f_12_ = (f_4_ * (((Class173_Sub3) this).aClass418_9736
				       .aFloatArray4768[9])
			       + ((((Class173_Sub3) this).aClass418_9736
				   .aFloatArray4768[5]) * f_3_
				  + ((((Class173_Sub3) this).aClass418_9736
				      .aFloatArray4768[13])
				     + (((Class173_Sub3) this).aClass418_9736
					.aFloatArray4768[1]) * f)));
		if (f_12_ < -f_6_ || f_12_ > f_6_) {
		    float[] fs_13_ = fs;
		    float[] fs_14_ = fs;
		    fs[2] = Float.NaN;
		    fs_14_[1] = Float.NaN;
		    fs_13_[0] = Float.NaN;
		} else {
		    float f_15_
			= ((((Class173_Sub3) this).aClass418_9734
			    .aFloatArray4768[10]) * f_4_
			   + ((((Class173_Sub3) this).aClass418_9734
			       .aFloatArray4768[6]) * f_3_
			      + ((((Class173_Sub3) this).aClass418_9734
				  .aFloatArray4768[14])
				 + f * (((Class173_Sub3) this).aClass418_9734
					.aFloatArray4768[2]))));
		    fs[0]
			= (((Class173_Sub3) this).aFloat9743
			   + ((Class173_Sub3) this).aFloat9742 * f_9_ / f_6_);
		    fs[1] = (f_12_ * ((Class173_Sub3) this).aFloat9744 / f_6_
			     + ((Class173_Sub3) this).aFloat9751);
		    fs[2] = f_15_;
		}
	    }
	}
    }
    
    int[] method8926(int i) {
	Class528_Sub4 class528_sub4;
	synchronized (((Class173_Sub3) this).aClass186_9750) {
	    class528_sub4 = ((Class528_Sub4)
			     (((Class173_Sub3) this).aClass186_9750.method2727
			      ((long) (i & 0xffff) | ~0x7fffffffffffffffL)));
	    if (null == class528_sub4) {
		Class160 class160 = aClass165_1984.method2093(i, (byte) -51);
		int i_16_ = class160.anInt1774 * -726179659;
		if (!anInterface22_1991.method122(Class600.aClass600_7866, i,
						  Class595.aClass595_7761,
						  0.7F, i_16_, i_16_, true,
						  (byte) 64)) {
		    int[] is = null;
		    return is;
		}
		int[] is;
		if (class160.aClass583_1771 != Class583.aClass583_7695)
		    is = anInterface22_1991.method127(Class600.aClass600_7866,
						      i, 0.7F, i_16_, i_16_,
						      true, (byte) 9);
		else
		    is = anInterface22_1991.method117(Class600.aClass600_7866,
						      i, 0.7F, i_16_, i_16_,
						      true, 1853317156);
		class528_sub4
		    = new Class528_Sub4(i, i_16_, is,
					(Class583.aClass583_7696
					 != class160.aClass583_1771));
		((Class173_Sub3) this).aClass186_9750.method2730
		    (class528_sub4, (long) (i & 0xffff) | ~0x7fffffffffffffffL,
		     i_16_ * i_16_, -1226267209);
	    }
	}
	((Class528_Sub4) class528_sub4).aBool10223 = true;
	return class528_sub4.method9251();
    }
    
    boolean method8927(int i) {
	Class160 class160 = aClass165_1984.method2093(i, (byte) -88);
	return anInterface22_1991.method122(Class600.aClass600_7866, i,
					    Class595.aClass595_7761, 0.7F,
					    -726179659 * class160.anInt1774,
					    class160.anInt1774 * -726179659,
					    true, (byte) 124);
    }
    
    void method8928() {
	((Class173_Sub3) this).aClass418_9734
	    .method5035(((Class173_Sub3) this).aClass433_9733);
	((Class173_Sub3) this).aClass418_9736
	    .method4986(((Class173_Sub3) this).aClass418_9734);
	((Class173_Sub3) this).aClass418_9736
	    .method4974(((Class173_Sub3) this).aClass418_9722);
	((Class173_Sub3) this).aClass418_9736
	    .method4991(((Class173_Sub3) this).aFloatArrayArray9737[0]);
	((Class173_Sub3) this).aClass418_9736
	    .method4992(((Class173_Sub3) this).aFloatArrayArray9737[1]);
	((Class173_Sub3) this).aClass418_9736
	    .method4987(((Class173_Sub3) this).aFloatArrayArray9737[2]);
	((Class173_Sub3) this).aClass418_9736
	    .method4988(((Class173_Sub3) this).aFloatArrayArray9737[3]);
	((Class173_Sub3) this).aClass418_9736
	    .method4989(((Class173_Sub3) this).aFloatArrayArray9737[4]);
	((Class173_Sub3) this).aClass418_9736
	    .method4990(((Class173_Sub3) this).aFloatArrayArray9737[5]);
	float f = ((Class173_Sub3) this).aClass418_9722.method4978();
	float f_17_
	    = (((f - 255.0F)
		* ((Class173_Sub3) this).aClass418_9722.aFloatArray4768[10])
	       + ((Class173_Sub3) this).aClass418_9722.aFloatArray4768[14]);
	float f_18_
	    = (((Class173_Sub3) this).aClass418_9722.aFloatArray4768[14]
	       + (((Class173_Sub3) this).aClass418_9722.aFloatArray4768[10]
		  * f));
	float f_19_ = f_18_ - f_17_;
	for (int i = 0; i < -1585405167 * ((Class173_Sub3) this).anInt9745;
	     i++) {
	    Class107 class107 = ((Class173_Sub3) this).aClass107Array9731[i];
	    ((Class107) class107).aFloat1320 = f_17_;
	    ((Class107) class107).aFloat1321 = f_19_;
	}
    }
    
    Class583 method8929(int i) {
	return aClass165_1984.method2093(i, (byte) -19).aClass583_1771;
    }
    
    public void method2265(float f, float f_20_, float f_21_, float f_22_,
			   float f_23_) {
	/* empty */
    }
    
    public void method2351() {
	for (int i = 0; i < ((Class173_Sub3) this).aClass107Array9731.length;
	     i++) {
	    ((Class107) ((Class173_Sub3) this).aClass107Array9731[i]).anInt1342
		= (-1052647419
		   * (((Class107) ((Class173_Sub3) this).aClass107Array9731[i])
		      .anInt1355));
	    ((Class107) ((Class173_Sub3) this).aClass107Array9731[i]).aBool1324
		= false;
	}
    }
    
    void method2287() {
	if (((Class173_Sub3) this).aBool9718) {
	    Class294.method3967(true, false, (byte) 2);
	    ((Class173_Sub3) this).aBool9718 = false;
	}
	((Class173_Sub3) this).aBool9721 = true;
    }
    
    public boolean method2161() {
	return false;
    }
    
    public Class433 method2529() {
	return new Class433(((Class173_Sub3) this).aClass433_9733);
    }
    
    public void method2209(Class171 class171) {
	method8940(((Class173_Sub3) this).anIntArray9719 != null,
		   null != ((Class173_Sub3) this).aFloatArray9716, false,
		   class171);
    }
    
    public boolean method2165() {
	return false;
    }
    
    public boolean method2163() {
	return false;
    }
    
    public boolean method2166() {
	return false;
    }
    
    public void method2192(Class162 class162, float f, Class162 class162_24_,
			   float f_25_, Class162 class162_26_, float f_27_) {
	/* empty */
    }
    
    public Class151 method2234(int i, int i_28_, int i_29_, int i_30_,
			       boolean bool) {
	if (null == ((Class173_Sub3) this).anIntArray9719)
	    throw new IllegalStateException("");
	int[] is = new int[i_29_ * i_30_];
	int i_31_ = i_28_ * (111437289 * ((Class173_Sub3) this).anInt9735) + i;
	int i_32_ = ((Class173_Sub3) this).anInt9735 * 111437289 - i_29_;
	for (int i_33_ = 0; i_33_ < i_30_; i_33_++) {
	    int i_34_ = i_29_ * i_33_;
	    for (int i_35_ = 0; i_35_ < i_29_; i_35_++)
		is[i_35_ + i_34_]
		    = ((Class173_Sub3) this).anIntArray9719[i_31_++];
	    i_31_ += i_32_;
	}
	if (bool)
	    return new Class151_Sub1_Sub3(this, is, i_29_, i_30_);
	return new Class151_Sub1_Sub2(this, is, i_29_, i_30_);
    }
    
    public boolean method2499() {
	return true;
    }
    
    public int method2432() {
	return 0;
    }
    
    public int method2396(int i, int i_36_) {
	return i | i_36_;
    }
    
    public void method2281(boolean bool) {
	/* empty */
    }
    
    Class163_Sub2 method2253(Canvas canvas, int i, int i_37_) {
	return Class179.method2667(this, canvas, i, i_37_, -335336078);
    }
    
    public Class528_Sub12 method2250(int i, int i_38_, int i_39_, int i_40_,
				     int i_41_, float f) {
	return null;
    }
    
    public int[] method2208(int i, int i_42_, int i_43_, int i_44_) {
	if (null == ((Class173_Sub3) this).anIntArray9719)
	    throw new IllegalStateException("");
	int[] is = new int[i_44_ * i_43_];
	int i_45_ = 0;
	for (int i_46_ = 0; i_46_ < i_44_; i_46_++) {
	    int i_47_
		= (111437289 * ((Class173_Sub3) this).anInt9735 * (i_46_
								   + i_42_)
		   + i);
	    for (int i_48_ = 0; i_48_ < i_43_; i_48_++)
		is[i_45_++]
		    = ((Class173_Sub3) this).anIntArray9719[i_48_ + i_47_];
	}
	return is;
    }
    
    void method8930(int i, int i_49_, int[] is, float[] fs) {
	((Class173_Sub3) this).anInt9735 = i * 1441710681;
	((Class173_Sub3) this).anInt9748 = -1347166275 * i_49_;
	((Class173_Sub3) this).anIntArray9719 = is;
	((Class173_Sub3) this).aFloatArray9716 = fs;
	for (int i_50_ = 0;
	     i_50_ < -1585405167 * ((Class173_Sub3) this).anInt9745; i_50_++)
	    ((Class173_Sub3) this).aClass107Array9731[i_50_]
		.method1367((byte) -100);
	method2203();
	method2527();
    }
    
    public void method2183(int[] is) {
	is[0] = 111437289 * ((Class173_Sub3) this).anInt9735;
	is[1] = 434033557 * ((Class173_Sub3) this).anInt9748;
    }
    
    public boolean method2426() {
	return false;
    }
    
    public boolean method2188() {
	return true;
    }
    
    void method2291(int i, int i_51_, int i_52_, int i_53_, int i_54_) {
	if (null != ((Class173_Sub3) this).anIntArray9719
	    && (i >= ((Class173_Sub3) this).anInt9723 * -993497119
		&& i < ((Class173_Sub3) this).anInt9724 * 630968029)) {
	    if (i_51_ < ((Class173_Sub3) this).anInt9725 * 592117349) {
		i_52_ -= 592117349 * ((Class173_Sub3) this).anInt9725 - i_51_;
		i_51_ = ((Class173_Sub3) this).anInt9725 * 592117349;
	    }
	    if (i_52_ + i_51_ > 6965409 * ((Class173_Sub3) this).anInt9726)
		i_52_ = ((Class173_Sub3) this).anInt9726 * 6965409 - i_51_;
	    int i_55_
		= i + ((Class173_Sub3) this).anInt9735 * 111437289 * i_51_;
	    int i_56_ = i_53_ >>> 24;
	    if (i_54_ == 0 || 1 == i_54_ && i_56_ == 255) {
		for (int i_57_ = 0; i_57_ < i_52_; i_57_++)
		    ((Class173_Sub3) this).anIntArray9719
			[i_55_ + (((Class173_Sub3) this).anInt9735 * 111437289
				  * i_57_)]
			= i_53_;
	    } else if (1 == i_54_) {
		i_53_ = ((i_56_ << 24)
			 + (((i_53_ & 0xff00ff) * i_56_ >> 8 & 0xff00ff)
			    + ((i_53_ & 0xff00) * i_56_ >> 8 & 0xff00)));
		int i_58_ = 256 - i_56_;
		for (int i_59_ = 0; i_59_ < i_52_; i_59_++) {
		    int i_60_
			= (((Class173_Sub3) this).anInt9735 * 111437289 * i_59_
			   + i_55_);
		    int i_61_ = ((Class173_Sub3) this).anIntArray9719[i_60_];
		    i_61_ = (((i_61_ & 0xff00) * i_58_ >> 8 & 0xff00)
			     + (i_58_ * (i_61_ & 0xff00ff) >> 8 & 0xff00ff));
		    ((Class173_Sub3) this).anIntArray9719[i_60_]
			= i_61_ + i_53_;
		}
	    } else if (i_54_ == 2) {
		for (int i_62_ = 0; i_62_ < i_52_; i_62_++) {
		    int i_63_ = (i_62_ * (((Class173_Sub3) this).anInt9735
					  * 111437289)
				 + i_55_);
		    int i_64_ = ((Class173_Sub3) this).anIntArray9719[i_63_];
		    int i_65_ = i_53_ + i_64_;
		    int i_66_ = (i_53_ & 0xff00ff) + (i_64_ & 0xff00ff);
		    i_64_ = (i_65_ - i_66_ & 0x10000) + (i_66_ & 0x1000100);
		    ((Class173_Sub3) this).anIntArray9719[i_63_]
			= i_65_ - i_64_ | i_64_ - (i_64_ >>> 8);
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public boolean method2531() {
	return false;
    }
    
    public void method2160(int i, float f, float f_67_, float f_68_,
			   float f_69_, float f_70_) {
	((Class173_Sub3) this).anInt9749 = (int) (65535.0F * f) * 1513006813;
	((Class173_Sub3) this).anInt9755
	    = (int) (f_67_ * 65535.0F) * 1854566841;
	float f_71_
	    = (float) Math.sqrt((double) (f_70_ * f_70_
					  + (f_68_ * f_68_ + f_69_ * f_69_)));
	((Class173_Sub3) this).anInt9727
	    = (int) (f_68_ * 65535.0F / f_71_) * 1034742405;
	((Class173_Sub3) this).anInt9728
	    = (int) (f_69_ * 65535.0F / f_71_) * -1100133035;
	((Class173_Sub3) this).anInt9729
	    = 1890740575 * (int) (f_70_ * 65535.0F / f_71_);
    }
    
    public void method2193(int i, int i_72_, int i_73_) {
	/* empty */
    }
    
    public void method2232() {
	/* empty */
    }
    
    public Class528_Sub12 method2407(int i, int i_74_, int i_75_, int i_76_,
				     int i_77_, float f) {
	return null;
    }
    
    void method8931(int i, int i_78_, int i_79_, int i_80_, int i_81_,
		    int i_82_, int i_83_, int i_84_) {
	if (null != ((Class173_Sub3) this).anIntArray9719
	    && (i >= -993497119 * ((Class173_Sub3) this).anInt9723
		&& i < ((Class173_Sub3) this).anInt9724 * 630968029)) {
	    int i_85_
		= i + ((Class173_Sub3) this).anInt9735 * 111437289 * i_78_;
	    int i_86_ = i_80_ >>> 24;
	    int i_87_ = i_83_ + i_82_;
	    int i_88_ = i_84_ % i_87_;
	    if (0 == i_81_ || i_81_ == 1 && 255 == i_86_) {
		int i_89_ = 0;
		while (i_89_ < i_79_) {
		    if ((i_78_ + i_89_
			 >= 592117349 * ((Class173_Sub3) this).anInt9725)
			&& (i_78_ + i_89_
			    < 6965409 * ((Class173_Sub3) this).anInt9726)
			&& i_88_ < i_82_)
			((Class173_Sub3) this).anIntArray9719
			    [(111437289 * ((Class173_Sub3) this).anInt9735
			      * i_89_) + i_85_]
			    = i_80_;
		    i_89_++;
		    i_88_ = ++i_88_ % i_87_;
		}
	    } else if (i_81_ == 1) {
		i_80_ = ((i_86_ << 24)
			 + (((i_80_ & 0xff00ff) * i_86_ >> 8 & 0xff00ff)
			    + (i_86_ * (i_80_ & 0xff00) >> 8 & 0xff00)));
		int i_90_ = 256 - i_86_;
		int i_91_ = 0;
		while (i_91_ < i_79_) {
		    if ((i_78_ + i_91_
			 >= ((Class173_Sub3) this).anInt9725 * 592117349)
			&& (i_91_ + i_78_
			    < 6965409 * ((Class173_Sub3) this).anInt9726)
			&& i_88_ < i_82_) {
			int i_92_ = (i_91_ * (((Class173_Sub3) this).anInt9735
					      * 111437289)
				     + i_85_);
			int i_93_
			    = ((Class173_Sub3) this).anIntArray9719[i_92_];
			i_93_ = (((i_93_ & 0xff00ff) * i_90_ >> 8 & 0xff00ff)
				 + (i_90_ * (i_93_ & 0xff00) >> 8 & 0xff00));
			((Class173_Sub3) this).anIntArray9719[i_92_]
			    = i_80_ + i_93_;
		    }
		    i_91_++;
		    i_88_ = ++i_88_ % i_87_;
		}
	    } else if (i_81_ == 2) {
		int i_94_ = 0;
		while (i_94_ < i_79_) {
		    if ((i_78_ + i_94_
			 >= 592117349 * ((Class173_Sub3) this).anInt9725)
			&& (i_78_ + i_94_
			    < 6965409 * ((Class173_Sub3) this).anInt9726)
			&& i_88_ < i_82_) {
			int i_95_ = ((((Class173_Sub3) this).anInt9735
				      * 111437289 * i_94_)
				     + i_85_);
			int i_96_
			    = ((Class173_Sub3) this).anIntArray9719[i_95_];
			int i_97_ = i_80_ + i_96_;
			int i_98_ = (i_80_ & 0xff00ff) + (i_96_ & 0xff00ff);
			i_96_
			    = (i_97_ - i_98_ & 0x10000) + (i_98_ & 0x1000100);
			((Class173_Sub3) this).anIntArray9719[i_95_]
			    = i_97_ - i_96_ | i_96_ - (i_96_ >>> 8);
		    }
		    i_94_++;
		    i_88_ = ++i_88_ % i_87_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method2443(int i, int i_99_) {
	/* empty */
    }
    
    public void method2507(int i, int i_100_, int i_101_, int i_102_,
			   int i_103_, int i_104_, int i_105_) {
	if (null != ((Class173_Sub3) this).anIntArray9719) {
	    Class107 class107 = method8939(Thread.currentThread());
	    Class121 class121 = ((Class107) class107).aClass121_1330;
	    int i_106_ = i_101_ - i;
	    int i_107_ = i_102_ - i_100_;
	    int i_108_ = i_106_ >= 0 ? i_106_ : -i_106_;
	    int i_109_ = i_107_ >= 0 ? i_107_ : -i_107_;
	    int i_110_ = i_108_;
	    if (i_110_ < i_109_)
		i_110_ = i_109_;
	    if (0 != i_110_) {
		int i_111_ = (i_106_ << 16) / i_110_;
		int i_112_ = (i_107_ << 16) / i_110_;
		i_106_ += i_111_ >> 16;
		i_107_ += i_112_ >> 16;
		if (i_112_ <= i_111_)
		    i_111_ = -i_111_;
		else
		    i_112_ = -i_112_;
		int i_113_ = i_104_ * i_112_ >> 17;
		int i_114_ = 1 + i_104_ * i_112_ >> 17;
		int i_115_ = i_104_ * i_111_ >> 17;
		int i_116_ = 1 + i_104_ * i_111_ >> 17;
		i -= class121.method1593();
		i_100_ -= class121.method1577();
		int i_117_ = i_113_ + i;
		int i_118_ = i - i_114_;
		int i_119_ = i + i_106_ - i_114_;
		int i_120_ = i_113_ + (i_106_ + i);
		int i_121_ = i_100_ + i_115_;
		int i_122_ = i_100_ - i_116_;
		int i_123_ = i_107_ + i_100_ - i_116_;
		int i_124_ = i_107_ + i_100_ + i_115_;
		if (i_105_ == 0)
		    ((Class121) class121).anInt1526 = 0;
		else if (1 == i_105_)
		    ((Class121) class121).anInt1526 = 255 - (i_103_ >>> 24);
		else
		    throw new IllegalArgumentException();
		method2283(false);
		((Class121) class121).aBool1504
		    = (i_117_ < 0 || i_117_ > ((Class121) class121).anInt1513
		       || i_118_ < 0
		       || i_118_ > ((Class121) class121).anInt1513
		       || i_119_ < 0
		       || i_119_ > ((Class121) class121).anInt1513);
		class121.method1582(true, false, false, (float) i_121_,
				    (float) i_122_, (float) i_123_,
				    (float) i_117_, (float) i_118_,
				    (float) i_119_, 100.0F, 100.0F, 100.0F,
				    i_103_);
		((Class121) class121).aBool1504
		    = (i_117_ < 0 || i_117_ > ((Class121) class121).anInt1513
		       || i_119_ < 0
		       || i_119_ > ((Class121) class121).anInt1513
		       || i_120_ < 0
		       || i_120_ > ((Class121) class121).anInt1513);
		class121.method1582(true, false, false, (float) i_121_,
				    (float) i_123_, (float) i_124_,
				    (float) i_117_, (float) i_119_,
				    (float) i_120_, 100.0F, 100.0F, 100.0F,
				    i_103_);
		method2283(true);
	    }
	}
    }
    
    void method8932() {
	if (((Class173_Sub3) this).aFloatArray9716 != null) {
	    if (0 == -993497119 * ((Class173_Sub3) this).anInt9723
		&& (((Class173_Sub3) this).anInt9735 * 111437289
		    == ((Class173_Sub3) this).anInt9724 * 630968029)
		&& 0 == 592117349 * ((Class173_Sub3) this).anInt9725
		&& (((Class173_Sub3) this).anInt9726 * 6965409
		    == ((Class173_Sub3) this).anInt9748 * 434033557)) {
		int i = ((Class173_Sub3) this).aFloatArray9716.length;
		int i_125_ = i - (i & 0x7);
		int i_126_ = 0;
		while (i_126_ < i_125_) {
		    ((Class173_Sub3) this).aFloatArray9716[i_126_++]
			= 2.14748365E9F;
		    ((Class173_Sub3) this).aFloatArray9716[i_126_++]
			= 2.14748365E9F;
		    ((Class173_Sub3) this).aFloatArray9716[i_126_++]
			= 2.14748365E9F;
		    ((Class173_Sub3) this).aFloatArray9716[i_126_++]
			= 2.14748365E9F;
		    ((Class173_Sub3) this).aFloatArray9716[i_126_++]
			= 2.14748365E9F;
		    ((Class173_Sub3) this).aFloatArray9716[i_126_++]
			= 2.14748365E9F;
		    ((Class173_Sub3) this).aFloatArray9716[i_126_++]
			= 2.14748365E9F;
		    ((Class173_Sub3) this).aFloatArray9716[i_126_++]
			= 2.14748365E9F;
		}
		while (i_126_ < i)
		    ((Class173_Sub3) this).aFloatArray9716[i_126_++]
			= 2.14748365E9F;
	    } else {
		int i = (((Class173_Sub3) this).anInt9724 * 630968029
			 - ((Class173_Sub3) this).anInt9723 * -993497119);
		int i_127_ = (6965409 * ((Class173_Sub3) this).anInt9726
			      - 592117349 * ((Class173_Sub3) this).anInt9725);
		int i_128_ = 111437289 * ((Class173_Sub3) this).anInt9735 - i;
		int i_129_
		    = ((((Class173_Sub3) this).anInt9725 * 592117349
			* (111437289 * ((Class173_Sub3) this).anInt9735))
		       + ((Class173_Sub3) this).anInt9723 * -993497119);
		int i_130_ = i >> 3;
		int i_131_ = i & 0x7;
		i = i_129_ - 1;
		for (int i_132_ = -i_127_; i_132_ < 0; i_132_++) {
		    if (i_130_ > 0) {
			int i_133_ = i_130_;
			do {
			    ((Class173_Sub3) this).aFloatArray9716[++i]
				= 2.14748365E9F;
			    ((Class173_Sub3) this).aFloatArray9716[++i]
				= 2.14748365E9F;
			    ((Class173_Sub3) this).aFloatArray9716[++i]
				= 2.14748365E9F;
			    ((Class173_Sub3) this).aFloatArray9716[++i]
				= 2.14748365E9F;
			    ((Class173_Sub3) this).aFloatArray9716[++i]
				= 2.14748365E9F;
			    ((Class173_Sub3) this).aFloatArray9716[++i]
				= 2.14748365E9F;
			    ((Class173_Sub3) this).aFloatArray9716[++i]
				= 2.14748365E9F;
			    ((Class173_Sub3) this).aFloatArray9716[++i]
				= 2.14748365E9F;
			} while (--i_133_ > 0);
		    }
		    if (i_131_ > 0) {
			int i_134_ = i_131_;
			do
			    ((Class173_Sub3) this).aFloatArray9716[++i]
				= 2.14748365E9F;
			while (--i_134_ > 0);
		    }
		    i += i_128_;
		}
	    }
	}
    }
    
    public void method2283(boolean bool) {
	Class107 class107 = method8939(Thread.currentThread());
	((Class107) class107).aBool1344 = bool;
    }
    
    public void method2527() {
	((Class173_Sub3) this).anInt9738 = 0;
	((Class173_Sub3) this).anInt9739 = 0;
	((Class173_Sub3) this).anInt9740
	    = ((Class173_Sub3) this).anInt9735 * -1844567151;
	((Class173_Sub3) this).anInt9741
	    = -1733649543 * ((Class173_Sub3) this).anInt9748;
	method8934();
    }
    
    public void method2275(int i, int i_135_, int i_136_, int i_137_) {
	((Class173_Sub3) this).anInt9738 = 2003104125 * i;
	((Class173_Sub3) this).anInt9739 = -1753532917 * i_135_;
	((Class173_Sub3) this).anInt9740 = -1280557207 * i_136_;
	((Class173_Sub3) this).anInt9741 = i_137_ * -1073860779;
	method8934();
    }
    
    void method8933() {
	if (((Class173_Sub3) this).aFloatArray9716 != null) {
	    if (0 == -993497119 * ((Class173_Sub3) this).anInt9723
		&& (((Class173_Sub3) this).anInt9735 * 111437289
		    == ((Class173_Sub3) this).anInt9724 * 630968029)
		&& 0 == 592117349 * ((Class173_Sub3) this).anInt9725
		&& (((Class173_Sub3) this).anInt9726 * 6965409
		    == ((Class173_Sub3) this).anInt9748 * 434033557)) {
		int i = ((Class173_Sub3) this).aFloatArray9716.length;
		int i_138_ = i - (i & 0x7);
		int i_139_ = 0;
		while (i_139_ < i_138_) {
		    ((Class173_Sub3) this).aFloatArray9716[i_139_++]
			= 2.14748365E9F;
		    ((Class173_Sub3) this).aFloatArray9716[i_139_++]
			= 2.14748365E9F;
		    ((Class173_Sub3) this).aFloatArray9716[i_139_++]
			= 2.14748365E9F;
		    ((Class173_Sub3) this).aFloatArray9716[i_139_++]
			= 2.14748365E9F;
		    ((Class173_Sub3) this).aFloatArray9716[i_139_++]
			= 2.14748365E9F;
		    ((Class173_Sub3) this).aFloatArray9716[i_139_++]
			= 2.14748365E9F;
		    ((Class173_Sub3) this).aFloatArray9716[i_139_++]
			= 2.14748365E9F;
		    ((Class173_Sub3) this).aFloatArray9716[i_139_++]
			= 2.14748365E9F;
		}
		while (i_139_ < i)
		    ((Class173_Sub3) this).aFloatArray9716[i_139_++]
			= 2.14748365E9F;
	    } else {
		int i = (((Class173_Sub3) this).anInt9724 * 630968029
			 - ((Class173_Sub3) this).anInt9723 * -993497119);
		int i_140_ = (6965409 * ((Class173_Sub3) this).anInt9726
			      - 592117349 * ((Class173_Sub3) this).anInt9725);
		int i_141_ = 111437289 * ((Class173_Sub3) this).anInt9735 - i;
		int i_142_
		    = ((((Class173_Sub3) this).anInt9725 * 592117349
			* (111437289 * ((Class173_Sub3) this).anInt9735))
		       + ((Class173_Sub3) this).anInt9723 * -993497119);
		int i_143_ = i >> 3;
		int i_144_ = i & 0x7;
		i = i_142_ - 1;
		for (int i_145_ = -i_140_; i_145_ < 0; i_145_++) {
		    if (i_143_ > 0) {
			int i_146_ = i_143_;
			do {
			    ((Class173_Sub3) this).aFloatArray9716[++i]
				= 2.14748365E9F;
			    ((Class173_Sub3) this).aFloatArray9716[++i]
				= 2.14748365E9F;
			    ((Class173_Sub3) this).aFloatArray9716[++i]
				= 2.14748365E9F;
			    ((Class173_Sub3) this).aFloatArray9716[++i]
				= 2.14748365E9F;
			    ((Class173_Sub3) this).aFloatArray9716[++i]
				= 2.14748365E9F;
			    ((Class173_Sub3) this).aFloatArray9716[++i]
				= 2.14748365E9F;
			    ((Class173_Sub3) this).aFloatArray9716[++i]
				= 2.14748365E9F;
			    ((Class173_Sub3) this).aFloatArray9716[++i]
				= 2.14748365E9F;
			} while (--i_146_ > 0);
		    }
		    if (i_144_ > 0) {
			int i_147_ = i_144_;
			do
			    ((Class173_Sub3) this).aFloatArray9716[++i]
				= 2.14748365E9F;
			while (--i_147_ > 0);
		    }
		    i += i_141_;
		}
	    }
	}
    }
    
    public boolean method2167() {
	return false;
    }
    
    void method8934() {
	int i = (((Class173_Sub3) this).anInt9724 * 630968029
		 - -993497119 * ((Class173_Sub3) this).anInt9723);
	int i_148_ = (6965409 * ((Class173_Sub3) this).anInt9726
		      - ((Class173_Sub3) this).anInt9725 * 592117349);
	float f = (((Class173_Sub3) this).aFloat9742
		   = ((float) (((Class173_Sub3) this).anInt9740 * 1233404121)
		      / 2.0F));
	float f_149_ = (((Class173_Sub3) this).aFloat9744
			= (float) (((Class173_Sub3) this).anInt9741
				   * 600069629) / 2.0F);
	((Class173_Sub3) this).aFloat9743
	    = f + (float) (-1930702891 * ((Class173_Sub3) this).anInt9738);
	((Class173_Sub3) this).aFloat9751
	    = f_149_ + (float) (542582179 * ((Class173_Sub3) this).anInt9739);
	for (int i_150_ = 0;
	     i_150_ < ((Class173_Sub3) this).anInt9745 * -1585405167;
	     i_150_++) {
	    Class107 class107
		= ((Class173_Sub3) this).aClass107Array9731[i_150_];
	    Class121 class121 = ((Class107) class107).aClass121_1330;
	    ((Class121) class121).aFloat1508 = f;
	    ((Class121) class121).aFloat1510 = f_149_;
	    ((Class121) class121).aFloat1507
		= (((Class173_Sub3) this).aFloat9743
		   - (float) (((Class173_Sub3) this).anInt9723 * -993497119));
	    ((Class121) class121).aFloat1512
		= (((Class173_Sub3) this).aFloat9751
		   - (float) (((Class173_Sub3) this).anInt9725 * 592117349));
	    ((Class121) class121).anInt1513 = i;
	    ((Class121) class121).anInt1520 = i_148_;
	}
	int i_151_ = ((((Class173_Sub3) this).anInt9735 * 111437289
		       * (((Class173_Sub3) this).anInt9725 * 592117349))
		      + -993497119 * ((Class173_Sub3) this).anInt9723);
	for (int i_152_ = 592117349 * ((Class173_Sub3) this).anInt9725;
	     i_152_ < 6965409 * ((Class173_Sub3) this).anInt9726; i_152_++) {
	    for (int i_153_ = 0;
		 i_153_ < ((Class173_Sub3) this).anInt9745 * -1585405167;
		 i_153_++)
		((Class121) (((Class107) (((Class173_Sub3) this)
					  .aClass107Array9731[i_153_]))
			     .aClass121_1330))
		    .anIntArray1506
		    [i_152_ - 592117349 * ((Class173_Sub3) this).anInt9725]
		    = i_151_;
	    i_151_ += 111437289 * ((Class173_Sub3) this).anInt9735;
	}
    }
    
    public boolean method2293() {
	return false;
    }
    
    public void method2204(int i, int i_154_, int i_155_, int i_156_) {
	if (i < 0)
	    i = 0;
	if (i_154_ < 0)
	    i_154_ = 0;
	if (i_155_ > 111437289 * ((Class173_Sub3) this).anInt9735)
	    i_155_ = 111437289 * ((Class173_Sub3) this).anInt9735;
	if (i_156_ > 434033557 * ((Class173_Sub3) this).anInt9748)
	    i_156_ = ((Class173_Sub3) this).anInt9748 * 434033557;
	((Class173_Sub3) this).anInt9723 = -1762913247 * i;
	((Class173_Sub3) this).anInt9724 = -1932232331 * i_155_;
	((Class173_Sub3) this).anInt9725 = -988511379 * i_154_;
	((Class173_Sub3) this).anInt9726 = -2128503967 * i_156_;
	method8934();
    }
    
    public void method2205(int i, int i_157_, int i_158_, int i_159_) {
	if (-993497119 * ((Class173_Sub3) this).anInt9723 < i)
	    ((Class173_Sub3) this).anInt9723 = i * -1762913247;
	if (((Class173_Sub3) this).anInt9725 * 592117349 < i_157_)
	    ((Class173_Sub3) this).anInt9725 = -988511379 * i_157_;
	if (((Class173_Sub3) this).anInt9724 * 630968029 > i_158_)
	    ((Class173_Sub3) this).anInt9724 = -1932232331 * i_158_;
	if (((Class173_Sub3) this).anInt9726 * 6965409 > i_159_)
	    ((Class173_Sub3) this).anInt9726 = -2128503967 * i_159_;
	method8934();
    }
    
    public void method2207(int[] is) {
	is[0] = ((Class173_Sub3) this).anInt9723 * -993497119;
	is[1] = 592117349 * ((Class173_Sub3) this).anInt9725;
	is[2] = ((Class173_Sub3) this).anInt9724 * 630968029;
	is[3] = 6965409 * ((Class173_Sub3) this).anInt9726;
    }
    
    public void method2268(int i, int i_160_) {
	if ((i & 0x1) != 0)
	    method2216(0, 0, ((Class173_Sub3) this).anInt9735 * 111437289,
		       434033557 * ((Class173_Sub3) this).anInt9748, i_160_,
		       0);
	if (0 != (i & 0x2))
	    method8932();
    }
    
    public void method2215(int i, int i_161_, int i_162_, int i_163_,
			   int i_164_, int i_165_) {
	method2218(i, i_161_, i_162_, i_164_, i_165_);
	method2218(i, i_163_ + i_161_ - 1, i_162_, i_164_, i_165_);
	method2395(i, 1 + i_161_, i_163_ - 2, i_164_, i_165_);
	method2395(i + i_162_ - 1, 1 + i_161_, i_163_ - 2, i_164_, i_165_);
    }
    
    public void method2216(int i, int i_166_, int i_167_, int i_168_,
			   int i_169_, int i_170_) {
	if (((Class173_Sub3) this).anIntArray9719 != null) {
	    if (i < ((Class173_Sub3) this).anInt9723 * -993497119) {
		i_167_ -= -993497119 * ((Class173_Sub3) this).anInt9723 - i;
		i = ((Class173_Sub3) this).anInt9723 * -993497119;
	    }
	    if (i_166_ < ((Class173_Sub3) this).anInt9725 * 592117349) {
		i_168_
		    -= ((Class173_Sub3) this).anInt9725 * 592117349 - i_166_;
		i_166_ = ((Class173_Sub3) this).anInt9725 * 592117349;
	    }
	    if (i + i_167_ > ((Class173_Sub3) this).anInt9724 * 630968029)
		i_167_ = 630968029 * ((Class173_Sub3) this).anInt9724 - i;
	    if (i_166_ + i_168_ > ((Class173_Sub3) this).anInt9726 * 6965409)
		i_168_ = 6965409 * ((Class173_Sub3) this).anInt9726 - i_166_;
	    if (i_167_ > 0 && i_168_ > 0
		&& i <= 630968029 * ((Class173_Sub3) this).anInt9724
		&& i_166_ <= 6965409 * ((Class173_Sub3) this).anInt9726) {
		int i_171_
		    = ((Class173_Sub3) this).anInt9735 * 111437289 - i_167_;
		int i_172_
		    = (i_166_ * (((Class173_Sub3) this).anInt9735 * 111437289)
		       + i);
		int i_173_ = i_169_ >>> 24;
		if (0 == i_170_ || i_170_ == 1 && i_173_ == 255) {
		    int i_174_ = i_167_ >> 3;
		    int i_175_ = i_167_ & 0x7;
		    i_167_ = i_172_ - 1;
		    for (int i_176_ = -i_168_; i_176_ < 0; i_176_++) {
			if (i_174_ > 0) {
			    i = i_174_;
			    do {
				((Class173_Sub3) this).anIntArray9719[++i_167_]
				    = i_169_;
				((Class173_Sub3) this).anIntArray9719[++i_167_]
				    = i_169_;
				((Class173_Sub3) this).anIntArray9719[++i_167_]
				    = i_169_;
				((Class173_Sub3) this).anIntArray9719[++i_167_]
				    = i_169_;
				((Class173_Sub3) this).anIntArray9719[++i_167_]
				    = i_169_;
				((Class173_Sub3) this).anIntArray9719[++i_167_]
				    = i_169_;
				((Class173_Sub3) this).anIntArray9719[++i_167_]
				    = i_169_;
				((Class173_Sub3) this).anIntArray9719[++i_167_]
				    = i_169_;
			    } while (--i > 0);
			}
			if (i_175_ > 0) {
			    i = i_175_;
			    do
				((Class173_Sub3) this).anIntArray9719[++i_167_]
				    = i_169_;
			    while (--i > 0);
			}
			i_167_ += i_171_;
		    }
		} else if (1 == i_170_) {
		    i_169_ = ((i_173_ * (i_169_ & 0xff00ff) >> 8 & 0xff00ff)
			      + (((i_169_ & ~0xff00ff) >>> 8) * i_173_
				 & ~0xff00ff));
		    int i_177_ = 256 - i_173_;
		    for (int i_178_ = 0; i_178_ < i_168_; i_178_++) {
			for (int i_179_ = -i_167_; i_179_ < 0; i_179_++) {
			    int i_180_ = (((Class173_Sub3) this).anIntArray9719
					  [i_172_]);
			    i_180_ = ((i_177_ * ((i_180_ & ~0xff00ff) >>> 8)
				       & ~0xff00ff)
				      + (i_177_ * (i_180_ & 0xff00ff) >> 8
					 & 0xff00ff));
			    ((Class173_Sub3) this).anIntArray9719[i_172_++]
				= i_169_ + i_180_;
			}
			i_172_ += i_171_;
		    }
		} else if (2 == i_170_) {
		    for (int i_181_ = 0; i_181_ < i_168_; i_181_++) {
			for (int i_182_ = -i_167_; i_182_ < 0; i_182_++) {
			    int i_183_ = (((Class173_Sub3) this).anIntArray9719
					  [i_172_]);
			    int i_184_ = i_183_ + i_169_;
			    int i_185_
				= (i_169_ & 0xff00ff) + (i_183_ & 0xff00ff);
			    i_183_ = (i_185_ & 0x1000100) + (i_184_ - i_185_
							     & 0x10000);
			    ((Class173_Sub3) this).anIntArray9719[i_172_++]
				= i_184_ - i_183_ | i_183_ - (i_183_ >>> 8);
			}
			i_172_ += i_171_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method2217(int i, int i_186_, int i_187_, int i_188_, int i_189_) {
	if (null != ((Class173_Sub3) this).anIntArray9719) {
	    if (i_187_ < 0)
		i_187_ = -i_187_;
	    int i_190_ = i_186_ - i_187_;
	    if (i_190_ < ((Class173_Sub3) this).anInt9725 * 592117349)
		i_190_ = ((Class173_Sub3) this).anInt9725 * 592117349;
	    int i_191_ = i_186_ + i_187_ + 1;
	    if (i_191_ > ((Class173_Sub3) this).anInt9726 * 6965409)
		i_191_ = ((Class173_Sub3) this).anInt9726 * 6965409;
	    int i_192_ = i_190_;
	    int i_193_ = i_187_ * i_187_;
	    int i_194_ = 0;
	    int i_195_ = i_186_ - i_192_;
	    int i_196_ = i_195_ * i_195_;
	    int i_197_ = i_196_ - i_195_;
	    if (i_186_ > i_191_)
		i_186_ = i_191_;
	    int i_198_ = i_188_ >>> 24;
	    if (i_189_ == 0 || 1 == i_189_ && 255 == i_198_) {
		while (i_192_ < i_186_) {
		    for (/**/; i_197_ <= i_193_ || i_196_ <= i_193_;
			 i_197_ += i_194_++ + i_194_)
			i_196_ += i_194_ + i_194_;
		    int i_199_ = 1 + (i - i_194_);
		    if (i_199_ < ((Class173_Sub3) this).anInt9723 * -993497119)
			i_199_ = -993497119 * ((Class173_Sub3) this).anInt9723;
		    int i_200_ = i_194_ + i;
		    if (i_200_ > ((Class173_Sub3) this).anInt9724 * 630968029)
			i_200_ = ((Class173_Sub3) this).anInt9724 * 630968029;
		    int i_201_ = (i_192_ * (111437289
					    * ((Class173_Sub3) this).anInt9735)
				  + i_199_);
		    for (int i_202_ = i_199_; i_202_ < i_200_; i_202_++)
			((Class173_Sub3) this).anIntArray9719[i_201_++]
			    = i_188_;
		    i_192_++;
		    i_196_ -= i_195_-- + i_195_;
		    i_197_ -= i_195_ + i_195_;
		}
		i_194_ = i_187_;
		i_195_ = i_192_ - i_186_;
		i_197_ = i_193_ + i_195_ * i_195_;
		i_196_ = i_197_ - i_194_;
		i_197_ -= i_195_;
		while (i_192_ < i_191_) {
		    for (/**/; i_197_ > i_193_ && i_196_ > i_193_;
			 i_196_ -= i_194_ + i_194_)
			i_197_ -= i_194_-- + i_194_;
		    int i_203_ = i - i_194_;
		    if (i_203_ < -993497119 * ((Class173_Sub3) this).anInt9723)
			i_203_ = -993497119 * ((Class173_Sub3) this).anInt9723;
		    int i_204_ = i_194_ + i;
		    if (i_204_
			> 630968029 * ((Class173_Sub3) this).anInt9724 - 1)
			i_204_
			    = ((Class173_Sub3) this).anInt9724 * 630968029 - 1;
		    int i_205_ = i_203_ + (111437289
					   * ((Class173_Sub3) this).anInt9735
					   * i_192_);
		    for (int i_206_ = i_203_; i_206_ <= i_204_; i_206_++)
			((Class173_Sub3) this).anIntArray9719[i_205_++]
			    = i_188_;
		    i_192_++;
		    i_197_ += i_195_ + i_195_;
		    i_196_ += i_195_++ + i_195_;
		}
	    } else if (i_189_ == 1) {
		i_188_ = ((i_198_ << 24)
			  + (((i_188_ & 0xff00ff) * i_198_ >> 8 & 0xff00ff)
			     + (i_198_ * (i_188_ & 0xff00) >> 8 & 0xff00)));
		int i_207_ = 256 - i_198_;
		while (i_192_ < i_186_) {
		    for (/**/; i_197_ <= i_193_ || i_196_ <= i_193_;
			 i_197_ += i_194_++ + i_194_)
			i_196_ += i_194_ + i_194_;
		    int i_208_ = 1 + (i - i_194_);
		    if (i_208_ < ((Class173_Sub3) this).anInt9723 * -993497119)
			i_208_ = ((Class173_Sub3) this).anInt9723 * -993497119;
		    int i_209_ = i + i_194_;
		    if (i_209_ > ((Class173_Sub3) this).anInt9724 * 630968029)
			i_209_ = ((Class173_Sub3) this).anInt9724 * 630968029;
		    int i_210_ = (i_192_ * (((Class173_Sub3) this).anInt9735
					    * 111437289)
				  + i_208_);
		    for (int i_211_ = i_208_; i_211_ < i_209_; i_211_++) {
			int i_212_
			    = ((Class173_Sub3) this).anIntArray9719[i_210_];
			i_212_ = (((i_212_ & 0xff00) * i_207_ >> 8 & 0xff00)
				  + (i_207_ * (i_212_ & 0xff00ff) >> 8
				     & 0xff00ff));
			((Class173_Sub3) this).anIntArray9719[i_210_++]
			    = i_188_ + i_212_;
		    }
		    i_192_++;
		    i_196_ -= i_195_-- + i_195_;
		    i_197_ -= i_195_ + i_195_;
		}
		i_194_ = i_187_;
		i_195_ = -i_195_;
		i_197_ = i_195_ * i_195_ + i_193_;
		i_196_ = i_197_ - i_194_;
		i_197_ -= i_195_;
		while (i_192_ < i_191_) {
		    for (/**/; i_197_ > i_193_ && i_196_ > i_193_;
			 i_196_ -= i_194_ + i_194_)
			i_197_ -= i_194_-- + i_194_;
		    int i_213_ = i - i_194_;
		    if (i_213_ < ((Class173_Sub3) this).anInt9723 * -993497119)
			i_213_ = ((Class173_Sub3) this).anInt9723 * -993497119;
		    int i_214_ = i + i_194_;
		    if (i_214_
			> 630968029 * ((Class173_Sub3) this).anInt9724 - 1)
			i_214_
			    = ((Class173_Sub3) this).anInt9724 * 630968029 - 1;
		    int i_215_ = (i_192_ * (((Class173_Sub3) this).anInt9735
					    * 111437289)
				  + i_213_);
		    for (int i_216_ = i_213_; i_216_ <= i_214_; i_216_++) {
			int i_217_
			    = ((Class173_Sub3) this).anIntArray9719[i_215_];
			i_217_ = (((i_217_ & 0xff00) * i_207_ >> 8 & 0xff00)
				  + (i_207_ * (i_217_ & 0xff00ff) >> 8
				     & 0xff00ff));
			((Class173_Sub3) this).anIntArray9719[i_215_++]
			    = i_188_ + i_217_;
		    }
		    i_192_++;
		    i_197_ += i_195_ + i_195_;
		    i_196_ += i_195_++ + i_195_;
		}
	    } else if (2 == i_189_) {
		while (i_192_ < i_186_) {
		    for (/**/; i_197_ <= i_193_ || i_196_ <= i_193_;
			 i_197_ += i_194_++ + i_194_)
			i_196_ += i_194_ + i_194_;
		    int i_218_ = i - i_194_ + 1;
		    if (i_218_ < ((Class173_Sub3) this).anInt9723 * -993497119)
			i_218_ = -993497119 * ((Class173_Sub3) this).anInt9723;
		    int i_219_ = i + i_194_;
		    if (i_219_ > 630968029 * ((Class173_Sub3) this).anInt9724)
			i_219_ = 630968029 * ((Class173_Sub3) this).anInt9724;
		    int i_220_
			= (i_218_
			   + i_192_ * (111437289
				       * ((Class173_Sub3) this).anInt9735));
		    for (int i_221_ = i_218_; i_221_ < i_219_; i_221_++) {
			int i_222_
			    = ((Class173_Sub3) this).anIntArray9719[i_220_];
			int i_223_ = i_222_ + i_188_;
			int i_224_ = (i_222_ & 0xff00ff) + (i_188_ & 0xff00ff);
			i_222_ = (i_223_ - i_224_ & 0x10000) + (i_224_
								& 0x1000100);
			((Class173_Sub3) this).anIntArray9719[i_220_++]
			    = i_223_ - i_222_ | i_222_ - (i_222_ >>> 8);
		    }
		    i_192_++;
		    i_196_ -= i_195_-- + i_195_;
		    i_197_ -= i_195_ + i_195_;
		}
		i_194_ = i_187_;
		i_195_ = -i_195_;
		i_197_ = i_195_ * i_195_ + i_193_;
		i_196_ = i_197_ - i_194_;
		i_197_ -= i_195_;
		while (i_192_ < i_191_) {
		    for (/**/; i_197_ > i_193_ && i_196_ > i_193_;
			 i_196_ -= i_194_ + i_194_)
			i_197_ -= i_194_-- + i_194_;
		    int i_225_ = i - i_194_;
		    if (i_225_ < ((Class173_Sub3) this).anInt9723 * -993497119)
			i_225_ = -993497119 * ((Class173_Sub3) this).anInt9723;
		    int i_226_ = i_194_ + i;
		    if (i_226_
			> ((Class173_Sub3) this).anInt9724 * 630968029 - 1)
			i_226_
			    = 630968029 * ((Class173_Sub3) this).anInt9724 - 1;
		    int i_227_ = i_225_ + (((Class173_Sub3) this).anInt9735
					   * 111437289 * i_192_);
		    for (int i_228_ = i_225_; i_228_ <= i_226_; i_228_++) {
			int i_229_
			    = ((Class173_Sub3) this).anIntArray9719[i_227_];
			int i_230_ = i_188_ + i_229_;
			int i_231_ = (i_188_ & 0xff00ff) + (i_229_ & 0xff00ff);
			i_229_ = (i_231_ & 0x1000100) + (i_230_ - i_231_
							 & 0x10000);
			((Class173_Sub3) this).anIntArray9719[i_227_++]
			    = i_230_ - i_229_ | i_229_ - (i_229_ >>> 8);
		    }
		    i_192_++;
		    i_197_ += i_195_ + i_195_;
		    i_196_ += i_195_++ + i_195_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method2460() {
	/* empty */
    }
    
    void method8935(int i, int i_232_, int i_233_, int i_234_, int i_235_,
		    int i_236_, int i_237_, int i_238_) {
	if (null != ((Class173_Sub3) this).anIntArray9719
	    && (i_232_ >= ((Class173_Sub3) this).anInt9725 * 592117349
		&& i_232_ < ((Class173_Sub3) this).anInt9726 * 6965409)) {
	    int i_239_
		= i_232_ * (111437289 * ((Class173_Sub3) this).anInt9735) + i;
	    int i_240_ = i_234_ >>> 24;
	    int i_241_ = i_236_ + i_237_;
	    int i_242_ = i_238_ % i_241_;
	    if (0 == i_235_ || i_235_ == 1 && i_240_ == 255) {
		int i_243_ = 0;
		while (i_243_ < i_233_) {
		    if ((i + i_243_
			 >= -993497119 * ((Class173_Sub3) this).anInt9723)
			&& (i + i_243_
			    < 630968029 * ((Class173_Sub3) this).anInt9724)
			&& i_242_ < i_236_)
			((Class173_Sub3) this).anIntArray9719[i_239_ + i_243_]
			    = i_234_;
		    i_243_++;
		    i_242_ = ++i_242_ % i_241_;
		}
	    } else if (i_235_ == 1) {
		i_234_ = ((i_240_ * (i_234_ & 0xff00ff) >> 8 & 0xff00ff)
			  + ((i_234_ & 0xff00) * i_240_ >> 8 & 0xff00)
			  + (i_240_ << 24));
		int i_244_ = 256 - i_240_;
		int i_245_ = 0;
		while (i_245_ < i_233_) {
		    if ((i + i_245_
			 >= ((Class173_Sub3) this).anInt9723 * -993497119)
			&& (i + i_245_
			    < ((Class173_Sub3) this).anInt9724 * 630968029)
			&& i_242_ < i_236_) {
			int i_246_ = (((Class173_Sub3) this).anIntArray9719
				      [i_239_ + i_245_]);
			i_246_
			    = ((i_244_ * (i_246_ & 0xff00ff) >> 8 & 0xff00ff)
			       + (i_244_ * (i_246_ & 0xff00) >> 8 & 0xff00));
			((Class173_Sub3) this).anIntArray9719[i_239_ + i_245_]
			    = i_246_ + i_234_;
		    }
		    i_245_++;
		    i_242_ = ++i_242_ % i_241_;
		}
	    } else if (2 == i_235_) {
		int i_247_ = 0;
		while (i_247_ < i_233_) {
		    if ((i + i_247_
			 >= -993497119 * ((Class173_Sub3) this).anInt9723)
			&& (i_247_ + i
			    < ((Class173_Sub3) this).anInt9724 * 630968029)
			&& i_242_ < i_236_) {
			int i_248_ = (((Class173_Sub3) this).anIntArray9719
				      [i_239_ + i_247_]);
			int i_249_ = i_234_ + i_248_;
			int i_250_ = (i_248_ & 0xff00ff) + (i_234_ & 0xff00ff);
			i_248_ = (i_250_ & 0x1000100) + (i_249_ - i_250_
							 & 0x10000);
			((Class173_Sub3) this).anIntArray9719[i_239_ + i_247_]
			    = i_249_ - i_248_ | i_248_ - (i_248_ >>> 8);
		    }
		    i_247_++;
		    i_242_ = ++i_242_ % i_241_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method2395(int i, int i_251_, int i_252_, int i_253_, int i_254_) {
	if (null != ((Class173_Sub3) this).anIntArray9719
	    && (i >= ((Class173_Sub3) this).anInt9723 * -993497119
		&& i < ((Class173_Sub3) this).anInt9724 * 630968029)) {
	    if (i_251_ < ((Class173_Sub3) this).anInt9725 * 592117349) {
		i_252_
		    -= 592117349 * ((Class173_Sub3) this).anInt9725 - i_251_;
		i_251_ = ((Class173_Sub3) this).anInt9725 * 592117349;
	    }
	    if (i_252_ + i_251_ > 6965409 * ((Class173_Sub3) this).anInt9726)
		i_252_ = ((Class173_Sub3) this).anInt9726 * 6965409 - i_251_;
	    int i_255_
		= i + ((Class173_Sub3) this).anInt9735 * 111437289 * i_251_;
	    int i_256_ = i_253_ >>> 24;
	    if (i_254_ == 0 || 1 == i_254_ && i_256_ == 255) {
		for (int i_257_ = 0; i_257_ < i_252_; i_257_++)
		    ((Class173_Sub3) this).anIntArray9719
			[i_255_ + (((Class173_Sub3) this).anInt9735 * 111437289
				   * i_257_)]
			= i_253_;
	    } else if (1 == i_254_) {
		i_253_ = ((i_256_ << 24)
			  + (((i_253_ & 0xff00ff) * i_256_ >> 8 & 0xff00ff)
			     + ((i_253_ & 0xff00) * i_256_ >> 8 & 0xff00)));
		int i_258_ = 256 - i_256_;
		for (int i_259_ = 0; i_259_ < i_252_; i_259_++) {
		    int i_260_ = ((((Class173_Sub3) this).anInt9735 * 111437289
				   * i_259_)
				  + i_255_);
		    int i_261_ = ((Class173_Sub3) this).anIntArray9719[i_260_];
		    i_261_
			= (((i_261_ & 0xff00) * i_258_ >> 8 & 0xff00)
			   + (i_258_ * (i_261_ & 0xff00ff) >> 8 & 0xff00ff));
		    ((Class173_Sub3) this).anIntArray9719[i_260_]
			= i_261_ + i_253_;
		}
	    } else if (i_254_ == 2) {
		for (int i_262_ = 0; i_262_ < i_252_; i_262_++) {
		    int i_263_ = (i_262_ * (((Class173_Sub3) this).anInt9735
					    * 111437289)
				  + i_255_);
		    int i_264_ = ((Class173_Sub3) this).anIntArray9719[i_263_];
		    int i_265_ = i_253_ + i_264_;
		    int i_266_ = (i_253_ & 0xff00ff) + (i_264_ & 0xff00ff);
		    i_264_
			= (i_265_ - i_266_ & 0x10000) + (i_266_ & 0x1000100);
		    ((Class173_Sub3) this).anIntArray9719[i_263_]
			= i_265_ - i_264_ | i_264_ - (i_264_ >>> 8);
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public boolean method2463() {
	return false;
    }
    
    public void method2219(int i, int i_267_, int i_268_, int i_269_,
			   int i_270_, int i_271_) {
	if (((Class173_Sub3) this).anIntArray9719 != null) {
	    i_268_ -= i;
	    i_269_ -= i_267_;
	    if (0 == i_269_) {
		if (i_268_ >= 0)
		    method2218(i, i_267_, i_268_ + 1, i_270_, i_271_);
		else
		    method2218(i + i_268_, i_267_, -i_268_ + 1, i_270_,
			       i_271_);
	    } else if (i_268_ == 0) {
		if (i_269_ >= 0)
		    method2395(i, i_267_, i_269_ + 1, i_270_, i_271_);
		else
		    method2395(i, i_269_ + i_267_, -i_269_ + 1, i_270_,
			       i_271_);
	    } else {
		if (i_269_ + i_268_ < 0) {
		    i += i_268_;
		    i_268_ = -i_268_;
		    i_267_ += i_269_;
		    i_269_ = -i_269_;
		}
		if (i_268_ > i_269_) {
		    i_267_ <<= 16;
		    i_267_ += 32768;
		    i_269_ <<= 16;
		    int i_272_ = (int) Math.floor(0.5 + ((double) i_269_
							 / (double) i_268_));
		    i_268_ += i;
		    if (i < ((Class173_Sub3) this).anInt9723 * -993497119) {
			i_267_
			    += (-993497119 * ((Class173_Sub3) this).anInt9723
				- i) * i_272_;
			i = ((Class173_Sub3) this).anInt9723 * -993497119;
		    }
		    if (i_268_ >= 630968029 * ((Class173_Sub3) this).anInt9724)
			i_268_
			    = ((Class173_Sub3) this).anInt9724 * 630968029 - 1;
		    int i_273_ = i_270_ >>> 24;
		    if (0 == i_271_ || 1 == i_271_ && 255 == i_273_) {
			for (/**/; i <= i_268_; i++) {
			    int i_274_ = i_267_ >> 16;
			    if (i_274_ >= (592117349
					   * ((Class173_Sub3) this).anInt9725)
				&& i_274_ < 6965409 * (((Class173_Sub3) this)
						       .anInt9726))
				((Class173_Sub3) this).anIntArray9719
				    [i_274_ * (((Class173_Sub3) this).anInt9735
					       * 111437289) + i]
				    = i_270_;
			    i_267_ += i_272_;
			}
		    } else if (1 == i_271_) {
			i_270_
			    = (((i_270_ & 0xff00ff) * i_273_ >> 8 & 0xff00ff)
			       + ((i_270_ & 0xff00) * i_273_ >> 8 & 0xff00)
			       + (i_273_ << 24));
			int i_275_ = 256 - i_273_;
			for (/**/; i <= i_268_; i++) {
			    int i_276_ = i_267_ >> 16;
			    if (i_276_ >= (592117349
					   * ((Class173_Sub3) this).anInt9725)
				&& i_276_ < 6965409 * (((Class173_Sub3) this)
						       .anInt9726)) {
				int i_277_
				    = i + i_276_ * (111437289
						    * (((Class173_Sub3) this)
						       .anInt9735));
				int i_278_ = (((Class173_Sub3) this)
					      .anIntArray9719[i_277_]);
				i_278_ = (((i_278_ & 0xff00ff) * i_275_ >> 8
					   & 0xff00ff)
					  + (i_275_ * (i_278_ & 0xff00) >> 8
					     & 0xff00));
				((Class173_Sub3) this).anIntArray9719[i_277_]
				    = i_278_ + i_270_;
			    }
			    i_267_ += i_272_;
			}
		    } else if (i_271_ == 2) {
			for (/**/; i <= i_268_; i++) {
			    int i_279_ = i_267_ >> 16;
			    if (i_279_ >= (((Class173_Sub3) this).anInt9725
					   * 592117349)
				&& i_279_ < (((Class173_Sub3) this).anInt9726
					     * 6965409)) {
				int i_280_
				    = i + i_279_ * (111437289
						    * (((Class173_Sub3) this)
						       .anInt9735));
				int i_281_ = (((Class173_Sub3) this)
					      .anIntArray9719[i_280_]);
				int i_282_ = i_281_ + i_270_;
				int i_283_ = ((i_270_ & 0xff00ff)
					      + (i_281_ & 0xff00ff));
				i_281_ = ((i_282_ - i_283_ & 0x10000)
					  + (i_283_ & 0x1000100));
				((Class173_Sub3) this).anIntArray9719[i_280_]
				    = i_282_ - i_281_ | i_281_ - (i_281_
								  >>> 8);
			    }
			    i_267_ += i_272_;
			}
		    } else
			throw new IllegalArgumentException();
		} else {
		    i <<= 16;
		    i += 32768;
		    i_268_ <<= 16;
		    int i_284_
			= (int) Math.floor((double) i_268_ / (double) i_269_
					   + 0.5);
		    i_269_ += i_267_;
		    if (i_267_
			< ((Class173_Sub3) this).anInt9725 * 592117349) {
			i += (i_284_
			      * (((Class173_Sub3) this).anInt9725 * 592117349
				 - i_267_));
			i_267_ = ((Class173_Sub3) this).anInt9725 * 592117349;
		    }
		    if (i_269_ >= 6965409 * ((Class173_Sub3) this).anInt9726)
			i_269_
			    = ((Class173_Sub3) this).anInt9726 * 6965409 - 1;
		    int i_285_ = i_270_ >>> 24;
		    if (i_271_ == 0 || 1 == i_271_ && i_285_ == 255) {
			for (/**/; i_267_ <= i_269_; i_267_++) {
			    int i_286_ = i >> 16;
			    if (i_286_ >= (((Class173_Sub3) this).anInt9723
					   * -993497119)
				&& i_286_ < 630968029 * (((Class173_Sub3) this)
							 .anInt9724))
				((Class173_Sub3) this).anIntArray9719
				    [i_286_ + i_267_ * ((((Class173_Sub3) this)
							 .anInt9735)
							* 111437289)]
				    = i_270_;
			    i += i_284_;
			}
		    } else if (i_271_ == 1) {
			i_270_ = ((i_285_ << 24)
				  + ((i_285_ * (i_270_ & 0xff00) >> 8 & 0xff00)
				     + ((i_270_ & 0xff00ff) * i_285_ >> 8
					& 0xff00ff)));
			int i_287_ = 256 - i_285_;
			for (/**/; i_267_ <= i_269_; i_267_++) {
			    int i_288_ = i >> 16;
			    if (i_288_ >= (((Class173_Sub3) this).anInt9723
					   * -993497119)
				&& i_288_ < 630968029 * (((Class173_Sub3) this)
							 .anInt9724)) {
				int i_289_
				    = (i_288_
				       + (i_267_
					  * (((Class173_Sub3) this).anInt9735
					     * 111437289)));
				int i_290_ = (((Class173_Sub3) this)
					      .anIntArray9719[i_289_]);
				i_290_ = ((i_287_ * (i_290_ & 0xff00) >> 8
					   & 0xff00)
					  + ((i_290_ & 0xff00ff) * i_287_ >> 8
					     & 0xff00ff));
				((Class173_Sub3) this).anIntArray9719
				    [i_288_ + (((Class173_Sub3) this).anInt9735
					       * 111437289 * i_267_)]
				    = i_270_ + i_290_;
			    }
			    i += i_284_;
			}
		    } else if (2 == i_271_) {
			for (/**/; i_267_ <= i_269_; i_267_++) {
			    int i_291_ = i >> 16;
			    if (i_291_ >= (-993497119
					   * ((Class173_Sub3) this).anInt9723)
				&& i_291_ < (((Class173_Sub3) this).anInt9724
					     * 630968029)) {
				int i_292_
				    = ((111437289
					* ((Class173_Sub3) this).anInt9735
					* i_267_)
				       + i_291_);
				int i_293_ = (((Class173_Sub3) this)
					      .anIntArray9719[i_292_]);
				int i_294_ = i_293_ + i_270_;
				int i_295_ = ((i_270_ & 0xff00ff)
					      + (i_293_ & 0xff00ff));
				i_293_ = ((i_294_ - i_295_ & 0x10000)
					  + (i_295_ & 0x1000100));
				((Class173_Sub3) this).anIntArray9719[i_292_]
				    = i_294_ - i_293_ | i_293_ - (i_293_
								  >>> 8);
			    }
			    i += i_284_;
			}
		    } else
			throw new IllegalArgumentException();
		}
	    }
	}
    }
    
    public void method2286() {
	/* empty */
    }
    
    public void method2220(int i, int i_296_, int i_297_, int i_298_,
			   int i_299_, int i_300_, Class148 class148,
			   int i_301_, int i_302_) {
	if (((Class173_Sub3) this).anIntArray9719 != null) {
	    Class148_Sub1 class148_sub1 = (Class148_Sub1) class148;
	    int[] is = ((Class148_Sub1) class148_sub1).anIntArray8789;
	    int[] is_303_ = ((Class148_Sub1) class148_sub1).anIntArray8788;
	    int i_304_
		= (((Class173_Sub3) this).anInt9725 * 592117349 > i_302_
		   ? 592117349 * ((Class173_Sub3) this).anInt9725 : i_302_);
	    int i_305_ = ((((Class173_Sub3) this).anInt9726 * 6965409
			   < i_302_ + is.length)
			  ? ((Class173_Sub3) this).anInt9726 * 6965409
			  : is.length + i_302_);
	    i_297_ -= i;
	    i_298_ -= i_296_;
	    if (i_297_ + i_298_ < 0) {
		i += i_297_;
		i_297_ = -i_297_;
		i_296_ += i_298_;
		i_298_ = -i_298_;
	    }
	    if (i_297_ > i_298_) {
		i_296_ <<= 16;
		i_296_ += 32768;
		i_298_ <<= 16;
		int i_306_ = (int) Math.floor(0.5 + ((double) i_298_
						     / (double) i_297_));
		i_297_ += i;
		if (i < -993497119 * ((Class173_Sub3) this).anInt9723) {
		    i_296_ += (i_306_
			       * (((Class173_Sub3) this).anInt9723 * -993497119
				  - i));
		    i = ((Class173_Sub3) this).anInt9723 * -993497119;
		}
		if (i_297_ >= 630968029 * ((Class173_Sub3) this).anInt9724)
		    i_297_ = 630968029 * ((Class173_Sub3) this).anInt9724 - 1;
		int i_307_ = i_299_ >>> 24;
		if (i_300_ == 0 || 1 == i_300_ && 255 == i_307_) {
		    for (/**/; i <= i_297_; i++) {
			int i_308_ = i_296_ >> 16;
			int i_309_ = i_308_ - i_302_;
			if (i_308_ >= i_304_ && i_308_ < i_305_) {
			    int i_310_ = is[i_309_] + i_301_;
			    if (i >= i_310_ && i < i_310_ + is_303_[i_309_])
				((Class173_Sub3) this).anIntArray9719
				    [i + (((Class173_Sub3) this).anInt9735
					  * 111437289 * i_308_)]
				    = i_299_;
			}
			i_296_ += i_306_;
		    }
		} else if (i_300_ == 1) {
		    i_299_
			= ((i_307_ << 24)
			   + (((i_299_ & 0xff00ff) * i_307_ >> 8 & 0xff00ff)
			      + (i_307_ * (i_299_ & 0xff00) >> 8 & 0xff00)));
		    int i_311_ = 256 - i_307_;
		    for (/**/; i <= i_297_; i++) {
			int i_312_ = i_296_ >> 16;
			int i_313_ = i_312_ - i_302_;
			if (i_312_ >= i_304_ && i_312_ < i_305_) {
			    int i_314_ = is[i_313_] + i_301_;
			    if (i >= i_314_ && i < is_303_[i_313_] + i_314_) {
				int i_315_ = (i_312_ * ((((Class173_Sub3) this)
							 .anInt9735)
							* 111437289)
					      + i);
				int i_316_ = (((Class173_Sub3) this)
					      .anIntArray9719[i_315_]);
				i_316_ = (((i_316_ & 0xff00) * i_311_ >> 8
					   & 0xff00)
					  + (i_311_ * (i_316_ & 0xff00ff) >> 8
					     & 0xff00ff));
				((Class173_Sub3) this).anIntArray9719[i_315_]
				    = i_316_ + i_299_;
			    }
			}
			i_296_ += i_306_;
		    }
		} else if (2 == i_300_) {
		    for (/**/; i <= i_297_; i++) {
			int i_317_ = i_296_ >> 16;
			int i_318_ = i_317_ - i_302_;
			if (i_317_ >= i_304_ && i_317_ < i_305_) {
			    int i_319_ = i_301_ + is[i_318_];
			    if (i >= i_319_ && i < is_303_[i_318_] + i_319_) {
				int i_320_
				    = i + (i_317_
					   * (((Class173_Sub3) this).anInt9735
					      * 111437289));
				int i_321_ = (((Class173_Sub3) this)
					      .anIntArray9719[i_320_]);
				int i_322_ = i_299_ + i_321_;
				int i_323_ = ((i_321_ & 0xff00ff)
					      + (i_299_ & 0xff00ff));
				i_321_
				    = (i_323_ & 0x1000100) + (i_322_ - i_323_
							      & 0x10000);
				((Class173_Sub3) this).anIntArray9719[i_320_]
				    = i_322_ - i_321_ | i_321_ - (i_321_
								  >>> 8);
			    }
			}
			i_296_ += i_306_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else {
		i <<= 16;
		i += 32768;
		i_297_ <<= 16;
		int i_324_ = (int) Math.floor(0.5 + ((double) i_297_
						     / (double) i_298_));
		i_298_ += i_296_;
		if (i_296_ < i_304_) {
		    i += (i_304_ - i_296_) * i_324_;
		    i_296_ = i_304_;
		}
		if (i_298_ >= i_305_)
		    i_298_ = i_305_ - 1;
		int i_325_ = i_299_ >>> 24;
		if (0 == i_300_ || 1 == i_300_ && 255 == i_325_) {
		    for (/**/; i_296_ <= i_298_; i_296_++) {
			int i_326_ = i >> 16;
			int i_327_ = i_296_ - i_302_;
			int i_328_ = i_301_ + is[i_327_];
			if ((i_326_
			     >= -993497119 * ((Class173_Sub3) this).anInt9723)
			    && (i_326_
				< 630968029 * ((Class173_Sub3) this).anInt9724)
			    && i_326_ >= i_328_
			    && i_326_ < is_303_[i_327_] + i_328_)
			    ((Class173_Sub3) this).anIntArray9719
				[i_326_ + (((Class173_Sub3) this).anInt9735
					   * 111437289 * i_296_)]
				= i_299_;
			i += i_324_;
		    }
		} else if (i_300_ == 1) {
		    i_299_ = ((i_325_ * (i_299_ & 0xff00) >> 8 & 0xff00)
			      + ((i_299_ & 0xff00ff) * i_325_ >> 8 & 0xff00ff)
			      + (i_325_ << 24));
		    int i_329_ = 256 - i_325_;
		    for (/**/; i_296_ <= i_298_; i_296_++) {
			int i_330_ = i >> 16;
			int i_331_ = i_296_ - i_302_;
			int i_332_ = is[i_331_] + i_301_;
			if ((i_330_
			     >= ((Class173_Sub3) this).anInt9723 * -993497119)
			    && (i_330_
				< ((Class173_Sub3) this).anInt9724 * 630968029)
			    && i_330_ >= i_332_
			    && i_330_ < i_332_ + is_303_[i_331_]) {
			    int i_333_
				= (i_330_
				   + i_296_ * (((Class173_Sub3) this).anInt9735
					       * 111437289));
			    int i_334_ = (((Class173_Sub3) this).anIntArray9719
					  [i_333_]);
			    i_334_
				= ((i_329_ * (i_334_ & 0xff00) >> 8 & 0xff00)
				   + ((i_334_ & 0xff00ff) * i_329_ >> 8
				      & 0xff00ff));
			    ((Class173_Sub3) this).anIntArray9719
				[i_330_ + i_296_ * (111437289
						    * (((Class173_Sub3) this)
						       .anInt9735))]
				= i_299_ + i_334_;
			}
			i += i_324_;
		    }
		} else if (i_300_ == 2) {
		    for (/**/; i_296_ <= i_298_; i_296_++) {
			int i_335_ = i >> 16;
			int i_336_ = i_296_ - i_302_;
			int i_337_ = is[i_336_] + i_301_;
			if ((i_335_
			     >= ((Class173_Sub3) this).anInt9723 * -993497119)
			    && (i_335_
				< ((Class173_Sub3) this).anInt9724 * 630968029)
			    && i_335_ >= i_337_
			    && i_335_ < is_303_[i_336_] + i_337_) {
			    int i_338_
				= i_335_ + (((Class173_Sub3) this).anInt9735
					    * 111437289 * i_296_);
			    int i_339_ = (((Class173_Sub3) this).anIntArray9719
					  [i_338_]);
			    int i_340_ = i_339_ + i_299_;
			    int i_341_
				= (i_299_ & 0xff00ff) + (i_339_ & 0xff00ff);
			    i_339_
				= (i_340_ - i_341_ & 0x10000) + (i_341_
								 & 0x1000100);
			    ((Class173_Sub3) this).anIntArray9719[i_338_]
				= i_340_ - i_339_ | i_339_ - (i_339_ >>> 8);
			}
			i += i_324_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2222(int i, int i_342_, int i_343_, int i_344_,
			   int i_345_, int i_346_, Class148 class148,
			   int i_347_, int i_348_, int i_349_, int i_350_,
			   int i_351_) {
	if (null != ((Class173_Sub3) this).anIntArray9719) {
	    Class148_Sub1 class148_sub1 = (Class148_Sub1) class148;
	    int[] is = ((Class148_Sub1) class148_sub1).anIntArray8789;
	    int[] is_352_ = ((Class148_Sub1) class148_sub1).anIntArray8788;
	    int i_353_
		= (((Class173_Sub3) this).anInt9725 * 592117349 > i_348_
		   ? ((Class173_Sub3) this).anInt9725 * 592117349 : i_348_);
	    int i_354_ = ((((Class173_Sub3) this).anInt9726 * 6965409
			   < i_348_ + is.length)
			  ? ((Class173_Sub3) this).anInt9726 * 6965409
			  : is.length + i_348_);
	    i_351_ <<= 8;
	    i_349_ <<= 8;
	    i_350_ <<= 8;
	    int i_355_ = i_350_ + i_349_;
	    i_351_ %= i_355_;
	    i_343_ -= i;
	    i_344_ -= i_342_;
	    if (i_344_ + i_343_ < 0) {
		int i_356_ = (int) (Math.sqrt((double) (i_343_ * i_343_
							+ i_344_ * i_344_))
				    * 256.0);
		int i_357_ = i_356_ % i_355_;
		i_351_ = i_355_ + i_349_ - i_351_ - i_357_;
		i_351_ %= i_355_;
		if (i_351_ < 0)
		    i_351_ += i_355_;
		i += i_343_;
		i_343_ = -i_343_;
		i_342_ += i_344_;
		i_344_ = -i_344_;
	    }
	    if (i_343_ > i_344_) {
		i_342_ <<= 16;
		i_342_ += 32768;
		i_344_ <<= 16;
		int i_358_ = (int) Math.floor((double) i_344_ / (double) i_343_
					      + 0.5);
		i_343_ += i;
		int i_359_ = i_345_ >>> 24;
		int i_360_
		    = (int) Math.sqrt((double) (65536
						+ (i_358_ >> 8) * (i_358_
								   >> 8)));
		if (i_346_ == 0 || i_346_ == 1 && 255 == i_359_) {
		    while (i <= i_343_) {
			int i_361_ = i_342_ >> 16;
			int i_362_ = i_361_ - i_348_;
			if (i >= ((Class173_Sub3) this).anInt9723 * -993497119
			    && i < ((Class173_Sub3) this).anInt9724 * 630968029
			    && i_361_ >= i_353_ && i_361_ < i_354_
			    && i_351_ < i_349_) {
			    int i_363_ = i_347_ + is[i_362_];
			    if (i >= i_363_ && i < i_363_ + is_352_[i_362_])
				((Class173_Sub3) this).anIntArray9719
				    [i + (i_361_
					  * (((Class173_Sub3) this).anInt9735
					     * 111437289))]
				    = i_345_;
			}
			i_342_ += i_358_;
			i++;
			i_351_ += i_360_;
			i_351_ %= i_355_;
		    }
		} else if (i_346_ == 1) {
		    i_345_
			= ((i_359_ << 24)
			   + ((i_359_ * (i_345_ & 0xff00ff) >> 8 & 0xff00ff)
			      + (i_359_ * (i_345_ & 0xff00) >> 8 & 0xff00)));
		    int i_364_ = 256 - i_359_;
		    while (i <= i_343_) {
			int i_365_ = i_342_ >> 16;
			int i_366_ = i_365_ - i_348_;
			if (i >= -993497119 * ((Class173_Sub3) this).anInt9723
			    && i < 630968029 * ((Class173_Sub3) this).anInt9724
			    && i_365_ >= i_353_ && i_365_ < i_354_
			    && i_351_ < i_349_) {
			    int i_367_ = i_347_ + is[i_366_];
			    if (i >= i_367_ && i < i_367_ + is_352_[i_366_]) {
				int i_368_
				    = i + (111437289
					   * ((Class173_Sub3) this).anInt9735
					   * i_365_);
				int i_369_ = (((Class173_Sub3) this)
					      .anIntArray9719[i_368_]);
				i_369_ = ((i_364_ * (i_369_ & 0xff00ff) >> 8
					   & 0xff00ff)
					  + (i_364_ * (i_369_ & 0xff00) >> 8
					     & 0xff00));
				((Class173_Sub3) this).anIntArray9719[i_368_]
				    = i_369_ + i_345_;
			    }
			}
			i_342_ += i_358_;
			i++;
			i_351_ += i_360_;
			i_351_ %= i_355_;
		    }
		} else if (i_346_ == 2) {
		    while (i <= i_343_) {
			int i_370_ = i_342_ >> 16;
			int i_371_ = i_370_ - i_348_;
			if (i >= -993497119 * ((Class173_Sub3) this).anInt9723
			    && i < 630968029 * ((Class173_Sub3) this).anInt9724
			    && i_370_ >= i_353_ && i_370_ < i_354_
			    && i_351_ < i_349_) {
			    int i_372_ = is[i_371_] + i_347_;
			    if (i >= i_372_ && i < is_352_[i_371_] + i_372_) {
				int i_373_
				    = ((i_370_
					* (111437289
					   * ((Class173_Sub3) this).anInt9735))
				       + i);
				int i_374_ = (((Class173_Sub3) this)
					      .anIntArray9719[i_373_]);
				int i_375_ = i_374_ + i_345_;
				int i_376_ = ((i_374_ & 0xff00ff)
					      + (i_345_ & 0xff00ff));
				i_374_ = ((i_375_ - i_376_ & 0x10000)
					  + (i_376_ & 0x1000100));
				((Class173_Sub3) this).anIntArray9719[i_373_]
				    = i_375_ - i_374_ | i_374_ - (i_374_
								  >>> 8);
			    }
			}
			i_342_ += i_358_;
			i++;
			i_351_ += i_360_;
			i_351_ %= i_355_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else {
		i <<= 16;
		i += 32768;
		i_343_ <<= 16;
		int i_377_ = (int) Math.floor(0.5 + ((double) i_343_
						     / (double) i_344_));
		int i_378_
		    = (int) Math.sqrt((double) (65536
						+ (i_377_ >> 8) * (i_377_
								   >> 8)));
		i_344_ += i_342_;
		int i_379_ = i_345_ >>> 24;
		if (0 == i_346_ || 1 == i_346_ && i_379_ == 255) {
		    while (i_342_ <= i_344_) {
			int i_380_ = i >> 16;
			int i_381_ = i_342_ - i_348_;
			if (i_342_ >= i_353_ && i_342_ < i_354_
			    && i_380_ >= (((Class173_Sub3) this).anInt9723
					  * -993497119)
			    && (i_380_
				< 630968029 * ((Class173_Sub3) this).anInt9724)
			    && i_351_ < i_349_ && i_380_ >= i_347_ + is[i_381_]
			    && i_380_ < is[i_381_] + i_347_ + is_352_[i_381_])
			    ((Class173_Sub3) this).anIntArray9719
				[i_342_ * (((Class173_Sub3) this).anInt9735
					   * 111437289) + i_380_]
				= i_345_;
			i += i_377_;
			i_342_++;
			i_351_ += i_378_;
			i_351_ %= i_355_;
		    }
		} else if (i_346_ == 1) {
		    i_345_ = ((i_379_ << 24)
			      + ((i_379_ * (i_345_ & 0xff00) >> 8 & 0xff00)
				 + ((i_345_ & 0xff00ff) * i_379_ >> 8
				    & 0xff00ff)));
		    int i_382_ = 256 - i_379_;
		    while (i_342_ <= i_344_) {
			int i_383_ = i >> 16;
			int i_384_ = i_342_ - i_348_;
			if (i_342_ >= i_353_ && i_342_ < i_354_
			    && i_383_ >= (((Class173_Sub3) this).anInt9723
					  * -993497119)
			    && (i_383_
				< 630968029 * ((Class173_Sub3) this).anInt9724)
			    && i_351_ < i_349_ && i_383_ >= is[i_384_] + i_347_
			    && i_383_ < is_352_[i_384_] + (i_347_
							   + is[i_384_])) {
			    int i_385_
				= (i_383_
				   + i_342_ * (((Class173_Sub3) this).anInt9735
					       * 111437289));
			    int i_386_ = (((Class173_Sub3) this).anIntArray9719
					  [i_385_]);
			    i_386_
				= (((i_386_ & 0xff00) * i_382_ >> 8 & 0xff00)
				   + ((i_386_ & 0xff00ff) * i_382_ >> 8
				      & 0xff00ff));
			    ((Class173_Sub3) this).anIntArray9719
				[(i_342_ * (111437289
					    * ((Class173_Sub3) this).anInt9735)
				  + i_383_)]
				= i_386_ + i_345_;
			}
			i += i_377_;
			i_342_++;
			i_351_ += i_378_;
			i_351_ %= i_355_;
		    }
		} else if (2 == i_346_) {
		    while (i_342_ <= i_344_) {
			int i_387_ = i >> 16;
			int i_388_ = i_342_ - i_348_;
			if (i_342_ >= i_353_ && i_342_ < i_354_
			    && i_387_ >= (((Class173_Sub3) this).anInt9723
					  * -993497119)
			    && (i_387_
				< 630968029 * ((Class173_Sub3) this).anInt9724)
			    && i_351_ < i_349_ && i_387_ >= is[i_388_] + i_347_
			    && (i_387_
				< i_347_ + is[i_388_] + is_352_[i_388_])) {
			    int i_389_
				= i_387_ + i_342_ * (111437289
						     * (((Class173_Sub3) this)
							.anInt9735));
			    int i_390_ = (((Class173_Sub3) this).anIntArray9719
					  [i_389_]);
			    int i_391_ = i_345_ + i_390_;
			    int i_392_
				= (i_345_ & 0xff00ff) + (i_390_ & 0xff00ff);
			    i_390_ = (i_392_ & 0x1000100) + (i_391_ - i_392_
							     & 0x10000);
			    ((Class173_Sub3) this).anIntArray9719[i_389_]
				= i_391_ - i_390_ | i_390_ - (i_390_ >>> 8);
			}
			i += i_377_;
			i_342_++;
			i_351_ += i_378_;
			i_351_ %= i_355_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    int method8936(int i) {
	return aClass165_1984.method2093(i, (byte) -45).aShort1804 & 0xffff;
    }
    
    public int method2224(int i, int i_393_, int i_394_, int i_395_,
			  int i_396_, int i_397_) {
	int i_398_ = 0;
	float f
	    = ((((Class173_Sub3) this).aClass418_9736.aFloatArray4768[6]
		* (float) i_393_)
	       + ((((Class173_Sub3) this).aClass418_9736.aFloatArray4768[2]
		   * (float) i)
		  + ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[14])
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[10]
		  * (float) i_394_));
	float f_399_
	    = (((float) i_397_
		* ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[10])
	       + ((((Class173_Sub3) this).aClass418_9736.aFloatArray4768[6]
		   * (float) i_396_)
		  + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[14]
		     + (float) i_395_ * (((Class173_Sub3) this).aClass418_9736
					 .aFloatArray4768[2]))));
	float f_400_
	    = (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[15]
	       + ((float) i
		  * ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[3])
	       + ((float) i_393_
		  * ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[7])
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[11]
		  * (float) i_394_));
	float f_401_
	    = (((float) i_397_
		* ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[11])
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[15]
		  + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[3]
		     * (float) i_395_)
		  + (float) i_396_ * (((Class173_Sub3) this).aClass418_9736
				      .aFloatArray4768[7])));
	if (f < -f_400_ && f_399_ < -f_401_)
	    i_398_ |= 0x10;
	else if (f > f_400_ && f_399_ > f_401_)
	    i_398_ |= 0x20;
	float f_402_
	    = ((((Class173_Sub3) this).aClass418_9736.aFloatArray4768[0]
		* (float) i)
	       + ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[12]
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[4]
		  * (float) i_393_)
	       + ((float) i_394_
		  * ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[8]));
	float f_403_
	    = (((float) i_395_
		* ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[0])
	       + ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[12]
	       + ((float) i_396_
		  * ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[4])
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[8]
		  * (float) i_397_));
	if (f_402_ < -f_400_ && f_403_ < -f_401_)
	    i_398_ |= 0x1;
	if (f_402_ > f_400_ && f_403_ > f_401_)
	    i_398_ |= 0x2;
	float f_404_
	    = (((float) i_394_
		* ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[9])
	       + ((((Class173_Sub3) this).aClass418_9736.aFloatArray4768[5]
		   * (float) i_393_)
		  + ((((Class173_Sub3) this).aClass418_9736.aFloatArray4768[1]
		      * (float) i)
		     + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768
			[13]))));
	float f_405_
	    = (((float) i_397_
		* ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[9])
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[13]
		  + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[1]
		     * (float) i_395_)
		  + (float) i_396_ * (((Class173_Sub3) this).aClass418_9736
				      .aFloatArray4768[5])));
	if (f_404_ < -f_400_ && f_405_ < -f_401_)
	    i_398_ |= 0x4;
	if (f_404_ > f_400_ && f_405_ > f_401_)
	    i_398_ |= 0x8;
	return i_398_;
    }
    
    boolean method2226(int i, int i_406_, int i_407_, int i_408_,
		       Class433 class433, Class431 class431) {
	Class418 class418 = method2241();
	class418.method5035(class433);
	class418.method4974(((Class173_Sub3) this).aClass418_9736);
	return class431.method5202(i, i_406_, i_407_, i_408_, class418,
				   ((Class173_Sub3) this).aFloat9743,
				   ((Class173_Sub3) this).aFloat9751,
				   ((Class173_Sub3) this).aFloat9742,
				   ((Class173_Sub3) this).aFloat9744);
    }
    
    public void method2470(int i, Class164 class164) {
	Class107 class107 = method8939(Thread.currentThread());
	((Class107) class107).anInt1325 = -951681461 * i;
	((Class107) class107).anInt1342 = -666266923 * class164.anInt1827;
	((Class107) class107).anInt1345 = -959556207 * class164.anInt1828;
    }
    
    public boolean method2330() {
	return false;
    }
    
    public void method2469() {
	((Class173_Sub3) this).aClass163_Sub1_9730 = null;
	((Class173_Sub3) this).aClass151_9753 = null;
    }
    
    public Class151 method2191(int i, int i_409_, boolean bool,
			       boolean bool_410_) {
	if (bool)
	    return new Class151_Sub1_Sub3(this, i, i_409_);
	return new Class151_Sub1_Sub2(this, i, i_409_);
    }
    
    public Class151 method2382(int[] is, int i, int i_411_, int i_412_,
			       int i_413_, boolean bool) {
	boolean bool_414_ = false;
	int i_415_ = i;
    while_0_:
	for (int i_416_ = 0; i_416_ < i_413_; i_416_++) {
	    for (int i_417_ = 0; i_417_ < i_412_; i_417_++) {
		int i_418_ = is[i_415_++] >>> 24;
		if (0 != i_418_ && 255 != i_418_) {
		    bool_414_ = true;
		    break while_0_;
		}
	    }
	}
	if (bool_414_)
	    return new Class151_Sub1_Sub3(this, is, i, i_411_, i_412_, i_413_,
					  bool);
	return new Class151_Sub1_Sub2(this, is, i, i_411_, i_412_, i_413_,
				      bool);
    }
    
    public Class151 method2334(Class178 class178, boolean bool) {
	int i = class178.method2601();
	int i_419_ = class178.method2602();
	Class151_Sub1 class151_sub1;
	if (bool && !class178.method2600() && class178.method2599()) {
	    Class178_Sub2 class178_sub2 = (Class178_Sub2) class178;
	    int[] is = new int[class178_sub2.anIntArray9769.length];
	    byte[] is_420_ = new byte[i * i_419_];
	    for (int i_421_ = 0; i_421_ < i_419_; i_421_++) {
		int i_422_ = i * i_421_;
		for (int i_423_ = 0; i_423_ < i; i_423_++)
		    is_420_[i_422_ + i_423_]
			= class178_sub2.aByteArray9770[i_423_ + i_422_];
	    }
	    for (int i_424_ = 0; i_424_ < class178_sub2.anIntArray9769.length;
		 i_424_++)
		is[i_424_] = class178_sub2.anIntArray9769[i_424_];
	    class151_sub1
		= new Class151_Sub1_Sub1(this, is_420_, is, i, i_419_);
	} else {
	    int[] is = class178.method2629(false);
	    if (class178.method2600())
		class151_sub1 = new Class151_Sub1_Sub3(this, is, i, i_419_);
	    else
		class151_sub1 = new Class151_Sub1_Sub2(this, is, i, i_419_);
	}
	class151_sub1.method1801(class178.method2603(), class178.method2605(),
				 class178.method2604(), class178.method2606());
	return class151_sub1;
    }
    
    public int method2318() {
	return -1;
    }
    
    public void method2239(int i, Class148 class148, int i_425_, int i_426_) {
	if (null != ((Class173_Sub3) this).anIntArray9719) {
	    Class148_Sub1 class148_sub1 = (Class148_Sub1) class148;
	    int[] is = ((Class148_Sub1) class148_sub1).anIntArray8789;
	    int[] is_427_ = ((Class148_Sub1) class148_sub1).anIntArray8788;
	    int i_428_;
	    if (((Class173_Sub3) this).anInt9726 * 6965409
		< is.length + i_426_)
		i_428_ = 6965409 * ((Class173_Sub3) this).anInt9726 - i_426_;
	    else
		i_428_ = is.length;
	    int i_429_;
	    if (592117349 * ((Class173_Sub3) this).anInt9725 > i_426_) {
		i_429_ = 592117349 * ((Class173_Sub3) this).anInt9725 - i_426_;
		i_426_ = ((Class173_Sub3) this).anInt9725 * 592117349;
	    } else
		i_429_ = 0;
	    if (i_428_ - i_429_ > 0) {
		int i_430_
		    = i_426_ * (111437289 * ((Class173_Sub3) this).anInt9735);
		for (int i_431_ = i_429_; i_431_ < i_428_; i_431_++) {
		    int i_432_ = is[i_431_] + i_425_;
		    int i_433_ = is_427_[i_431_];
		    if (((Class173_Sub3) this).anInt9723 * -993497119
			> i_432_) {
			i_433_
			    -= (-993497119 * ((Class173_Sub3) this).anInt9723
				- i_432_);
			i_432_ = -993497119 * ((Class173_Sub3) this).anInt9723;
		    }
		    if (630968029 * ((Class173_Sub3) this).anInt9724
			< i_432_ + i_433_)
			i_433_ = (630968029 * ((Class173_Sub3) this).anInt9724
				  - i_432_);
		    i_432_ += i_430_;
		    for (int i_434_ = -i_433_; i_434_ < 0; i_434_++)
			((Class173_Sub3) this).anIntArray9719[i_432_++] = i;
		    i_430_ += ((Class173_Sub3) this).anInt9735 * 111437289;
		}
	    }
	}
    }
    
    public Class172 method2240(Class1 class1, Class178[] class178s,
			       boolean bool) {
	int[] is = new int[class178s.length];
	int[] is_435_ = new int[class178s.length];
	boolean bool_436_ = false;
	boolean bool_437_ = false;
	for (int i = 0; i < class178s.length; i++) {
	    is[i] = class178s[i].method2601();
	    is_435_[i] = class178s[i].method2602();
	    if (class178s[i].method2600())
		bool_436_ = true;
	    if (class178s[i].method2599())
		bool_437_ = true;
	}
	if (bool) {
	    if (bool_437_) {
		if (bool_436_)
		    return new Class172_Sub3(this, class1,
					     (Class178_Sub2[]) class178s, is,
					     is_435_);
		return new Class172_Sub1(this, class1,
					 (Class178_Sub2[]) class178s, is,
					 is_435_);
	    }
	    if (bool_436_)
		return new Class172_Sub3(this, class1,
					 (Class178_Sub1[]) class178s, is,
					 is_435_);
	    return new Class172_Sub1(this, class1, (Class178_Sub1[]) class178s,
				     is, is_435_);
	}
	if (bool_437_) {
	    if (bool_436_)
		throw new IllegalArgumentException("");
	    return new Class172_Sub2(this, class1, (Class178_Sub2[]) class178s,
				     is, is_435_);
	}
	return new Class172_Sub6(this, class1, (Class178_Sub1[]) class178s, is,
				 is_435_);
    }
    
    public void method2503(int i) {
	Class157_Sub2.anInt9138 = Class157_Sub2.anInt9124 = i;
	if (-1585405167 * ((Class173_Sub3) this).anInt9745 > 1)
	    throw new IllegalStateException();
	method8938(-1585405167 * ((Class173_Sub3) this).anInt9745);
	method8937(0);
    }
    
    public Class157 method2244(Class177 class177, int i, int i_438_,
			       int i_439_, int i_440_) {
	return new Class157_Sub2(this, class177, i, i_439_, i_440_, i_438_);
    }
    
    public int method2245(int i, int i_441_) {
	i |= 0x20800;
	return i & i_441_ ^ i_441_;
    }
    
    public void method2501() {
	/* empty */
    }
    
    public Interface21 method2411(int i, int i_442_, int i_443_) {
	return new Class112(i, i_442_);
    }
    
    public Class418 method2241() {
	Class107 class107 = method8939(Thread.currentThread());
	return ((Class107) class107).aClass418_1336;
    }
    
    public Class433 method2479() {
	Class107 class107 = method8939(Thread.currentThread());
	return ((Class107) class107).aClass433_1346;
    }
    
    public int method2256() {
	return 0;
    }
    
    public void method2414(int i, int i_444_, float f, int i_445_, int i_446_,
			   float f_447_, int i_448_, int i_449_, float f_450_,
			   int i_451_, int i_452_, int i_453_, int i_454_) {
	boolean bool = ((Class173_Sub3) this).anIntArray9719 != null;
	boolean bool_455_ = ((Class173_Sub3) this).aFloatArray9716 != null;
	if (bool || bool_455_) {
	    Class107 class107 = method8939(Thread.currentThread());
	    Class121 class121 = ((Class107) class107).aClass121_1330;
	    ((Class121) class121).aBool1501 = false;
	    i -= -993497119 * ((Class173_Sub3) this).anInt9723;
	    i_445_ -= -993497119 * ((Class173_Sub3) this).anInt9723;
	    i_448_ -= -993497119 * ((Class173_Sub3) this).anInt9723;
	    i_444_ -= 592117349 * ((Class173_Sub3) this).anInt9725;
	    i_446_ -= ((Class173_Sub3) this).anInt9725 * 592117349;
	    i_449_ -= ((Class173_Sub3) this).anInt9725 * 592117349;
	    ((Class121) class121).aBool1504
		= (i < 0 || i > ((Class121) class121).anInt1513 || i_445_ < 0
		   || i_445_ > ((Class121) class121).anInt1513 || i_448_ < 0
		   || i_448_ > ((Class121) class121).anInt1513);
	    int i_456_ = i_451_ >>> 24;
	    if (i_454_ == 0 || i_454_ == 1 && 255 == i_456_) {
		((Class121) class121).anInt1526 = 0;
		((Class121) class121).aBool1502 = false;
		class121.method1580(bool, bool_455_, false, (float) i_444_,
				    (float) i_446_, (float) i_449_, (float) i,
				    (float) i_445_, (float) i_448_, f, f_447_,
				    f_450_, i_451_, i_452_, i_453_);
	    } else if (1 == i_454_) {
		((Class121) class121).anInt1526 = 255 - i_456_;
		((Class121) class121).aBool1502 = false;
		class121.method1580(bool, bool_455_, false, (float) i_444_,
				    (float) i_446_, (float) i_449_, (float) i,
				    (float) i_445_, (float) i_448_, f, f_447_,
				    f_450_, i_451_, i_452_, i_453_);
	    } else if (i_454_ == 2) {
		((Class121) class121).anInt1526 = 128;
		((Class121) class121).aBool1502 = true;
		class121.method1580(bool, bool_455_, false, (float) i_444_,
				    (float) i_446_, (float) i_449_, (float) i,
				    (float) i_445_, (float) i_448_, f, f_447_,
				    f_450_, i_451_, i_452_, i_453_);
	    } else
		throw new IllegalArgumentException();
	    ((Class121) class121).aBool1501 = true;
	}
    }
    
    public void method2258(int i, Class528_Sub12[] class528_sub12s) {
	/* empty */
    }
    
    void method8937(int i) {
	((Class173_Sub3) this).aClass107Array9731[i]
	    .method1365(Thread.currentThread(), -804447707);
    }
    
    void method8938(int i) {
	((Class173_Sub3) this).anInt9745 = i * -462115343;
	((Class173_Sub3) this).aClass107Array9731
	    = new Class107[((Class173_Sub3) this).anInt9745 * -1585405167];
	for (int i_457_ = 0;
	     i_457_ < -1585405167 * ((Class173_Sub3) this).anInt9745; i_457_++)
	    ((Class173_Sub3) this).aClass107Array9731[i_457_]
		= new Class107(this);
    }
    
    Class107 method8939(Runnable runnable) {
	for (int i = 0; i < ((Class173_Sub3) this).anInt9745 * -1585405167;
	     i++) {
	    if (runnable
		== (((Class107) ((Class173_Sub3) this).aClass107Array9731[i])
		    .aRunnable1341))
		return ((Class173_Sub3) this).aClass107Array9731[i];
	}
	return null;
    }
    
    public void method2272(int i, float f, float f_458_, float f_459_,
			   float f_460_, float f_461_) {
	((Class173_Sub3) this).anInt9749 = (int) (65535.0F * f) * 1513006813;
	((Class173_Sub3) this).anInt9755
	    = (int) (f_458_ * 65535.0F) * 1854566841;
	float f_462_ = (float) Math.sqrt((double) (f_461_ * f_461_
						   + (f_459_ * f_459_
						      + f_460_ * f_460_)));
	((Class173_Sub3) this).anInt9727
	    = (int) (f_459_ * 65535.0F / f_462_) * 1034742405;
	((Class173_Sub3) this).anInt9728
	    = (int) (f_460_ * 65535.0F / f_462_) * -1100133035;
	((Class173_Sub3) this).anInt9729
	    = 1890740575 * (int) (f_461_ * 65535.0F / f_462_);
    }
    
    void method8940(boolean bool, boolean bool_463_, boolean bool_464_,
		    Class171 class171) {
	Class107 class107 = method8939(Thread.currentThread());
	for (Class511_Sub2_Sub1 class511_sub2_sub1
		 = ((Class511_Sub2_Sub1)
		    class171.aClass685_1959.method8009(1094286708));
	     null != class511_sub2_sub1;
	     class511_sub2_sub1
		 = ((Class511_Sub2_Sub1)
		    class171.aClass685_1959.method8011((byte) 126))) {
	    int i = class511_sub2_sub1.anInt11511 >> 12;
	    int i_465_ = class511_sub2_sub1.anInt11512 >> 12;
	    int i_466_ = class511_sub2_sub1.anInt11509 >> 12;
	    float f
		= ((float) i_466_ * (((Class173_Sub3) this).aClass418_9736
				     .aFloatArray4768[10])
		   + ((((Class173_Sub3) this).aClass418_9736.aFloatArray4768[2]
		       * (float) i)
		      + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768
			 [6]) * (float) i_465_)
		   + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768
		      [14]));
	    float f_467_
		= ((float) i_466_ * (((Class173_Sub3) this).aClass418_9736
				     .aFloatArray4768[11])
		   + ((((Class173_Sub3) this).aClass418_9736.aFloatArray4768[7]
		       * (float) i_465_)
		      + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768
			 [3]) * (float) i)
		   + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768
		      [15]));
	    if (!(f < -f_467_)) {
		float f_468_
		    = (((Class173_Sub3) this).aFloat9747
		       + f * ((Class173_Sub3) this).aFloat9746 / f_467_);
		if (!(f > ((Class107) class107).aFloat1320)) {
		    float f_469_ = ((float) i_466_ * (((Class173_Sub3) this)
						      .aClass418_9736
						      .aFloatArray4768[8])
				    + ((float) i_465_ * (((Class173_Sub3) this)
							 .aClass418_9736
							 .aFloatArray4768[4])
				       + (((Class173_Sub3) this).aClass418_9736
					  .aFloatArray4768[0]) * (float) i)
				    + (((Class173_Sub3) this).aClass418_9736
				       .aFloatArray4768[12]));
		    float f_470_
			= ((((Class173_Sub3) this).aClass418_9736
			    .aFloatArray4768[9]) * (float) i_466_
			   + ((((Class173_Sub3) this).aClass418_9736
			       .aFloatArray4768[1]) * (float) i
			      + (((Class173_Sub3) this).aClass418_9736
				 .aFloatArray4768[5]) * (float) i_465_)
			   + (((Class173_Sub3) this).aClass418_9736
			      .aFloatArray4768[13]));
		    if (!(f_469_ < -f_467_) && !(f_469_ > f_467_)
			&& !(f_470_ < -f_467_) && !(f_470_ > f_467_)) {
			float f_471_
			    = (float) class511_sub2_sub1.anInt11508 / 4096.0F;
			float f_472_
			    = f_469_ + f_471_ * (((Class173_Sub3) this)
						 .aClass418_9722
						 .aFloatArray4768[0]);
			float f_473_
			    = f_467_ + (((Class173_Sub3) this).aClass418_9722
					.aFloatArray4768[3]) * f_471_;
			float f_474_ = (((Class173_Sub3) this).aFloat9743
					+ (((Class173_Sub3) this).aFloat9742
					   * f_469_ / f_467_));
			float f_475_ = ((((Class173_Sub3) this).aFloat9744
					 * f_470_ / f_467_)
					+ ((Class173_Sub3) this).aFloat9751);
			float f_476_
			    = (((Class173_Sub3) this).aFloat9743
			       + (f_472_ * ((Class173_Sub3) this).aFloat9742
				  / f_473_));
			method8941(bool, bool_463_, bool_464_,
				   class511_sub2_sub1, (int) f_474_,
				   (int) f_475_, f_468_,
				   (int) (f_476_ < f_474_ ? f_474_ - f_476_
					  : f_476_ - f_474_));
		    }
		}
	    }
	}
    }
    
    void method8941(boolean bool, boolean bool_477_, boolean bool_478_,
		    Class511_Sub2_Sub1 class511_sub2_sub1, int i, int i_479_,
		    float f, int i_480_) {
	int i_481_ = class511_sub2_sub1.anInt11515;
	int i_482_ = i_480_;
	i_480_ <<= 1;
	if (i_481_ == -1)
	    method8953(bool_477_, i, i_479_, f, i_482_,
		       class511_sub2_sub1.anInt11513, 1);
	else {
	    if (i_481_ != ((Class173_Sub3) this).anInt9720 * -1522891157) {
		Class151 class151
		    = (Class151) ((Class173_Sub3) this).aClass186_9752
				     .method2727((long) i_481_);
		if (null == class151) {
		    Class160 class160
			= aClass165_1984.method2093(i_481_, (byte) -99);
		    int[] is = method8926(i_481_);
		    if (null != is) {
			int i_483_ = -726179659 * class160.anInt1774;
			class151 = method2418(is, 0, i_483_, i_483_, i_483_,
					      -258461828);
			((Class173_Sub3) this).aClass186_9752
			    .method2729(class151, (long) i_481_);
		    } else
			return;
		}
		((Class173_Sub3) this).anInt9720 = -2037582269 * i_481_;
		((Class173_Sub3) this).aClass151_9754 = class151;
	    }
	    i_480_++;
	    ((Class151_Sub1) ((Class173_Sub3) this).aClass151_9754).method8291
		(bool, bool_477_, bool_478_, i - i_482_, i_479_ - i_482_, f,
		 i_480_, i_480_, 0, class511_sub2_sub1.anInt11513, 1, 1,
		 false);
	}
    }
    
    void method8942(boolean bool, boolean bool_484_, boolean bool_485_, int i,
		    int i_486_, float f, int i_487_, int i_488_, short i_489_,
		    int i_490_, int i_491_, int i_492_) {
	if (i_487_ != 0 && 0 != i_488_) {
	    if (-1 != i_489_) {
		Class160 class160
		    = aClass165_1984.method2093(i_489_, (byte) -57);
		if (!class160.aBool1800) {
		    if (i_489_
			!= ((Class173_Sub3) this).anInt9720 * -1522891157) {
			Class151 class151
			    = (Class151) ((Class173_Sub3) this)
					     .aClass186_9752
					     .method2727((long) i_489_);
			if (class151 == null) {
			    int[] is = method8926(i_489_);
			    if (is == null)
				return;
			    int i_493_ = -726179659 * class160.anInt1774;
			    class151 = method2418(is, 0, i_493_, i_493_,
						  i_493_, 54487806);
			    ((Class173_Sub3) this).aClass186_9752
				.method2729(class151, (long) i_489_);
			}
			((Class173_Sub3) this).anInt9720
			    = i_489_ * -2037582269;
			((Class173_Sub3) this).aClass151_9754 = class151;
		    }
		    ((Class151_Sub1) ((Class173_Sub3) this).aClass151_9754)
			.method8291
			(bool, bool_484_, bool_485_, i - i_487_,
			 i_486_ - i_488_, f, i_487_ << 1, i_488_ << 1, i_491_,
			 i_490_, i_492_, 1,
			 class160.aClass583_1771 != Class583.aClass583_7697);
		    return;
		}
	    }
	    method8953(bool_484_, i, i_486_, f, i_487_, i_490_, i_492_);
	}
    }
    
    void method2494(int i, int i_494_) throws Exception_Sub5 {
	aClass163_Sub2_1999.method8924(i, i_494_);
	if (anInterface22_1991 != null)
	    anInterface22_1991.method27((byte) 66);
    }
    
    public void method2389(int i, int i_495_, float f, int i_496_, int i_497_,
			   float f_498_, int i_499_, int i_500_, float f_501_,
			   int i_502_, int i_503_, int i_504_, int i_505_) {
	boolean bool = ((Class173_Sub3) this).anIntArray9719 != null;
	boolean bool_506_ = ((Class173_Sub3) this).aFloatArray9716 != null;
	if (bool || bool_506_) {
	    Class107 class107 = method8939(Thread.currentThread());
	    Class121 class121 = ((Class107) class107).aClass121_1330;
	    ((Class121) class121).aBool1501 = false;
	    i -= -993497119 * ((Class173_Sub3) this).anInt9723;
	    i_496_ -= -993497119 * ((Class173_Sub3) this).anInt9723;
	    i_499_ -= -993497119 * ((Class173_Sub3) this).anInt9723;
	    i_495_ -= 592117349 * ((Class173_Sub3) this).anInt9725;
	    i_497_ -= ((Class173_Sub3) this).anInt9725 * 592117349;
	    i_500_ -= ((Class173_Sub3) this).anInt9725 * 592117349;
	    ((Class121) class121).aBool1504
		= (i < 0 || i > ((Class121) class121).anInt1513 || i_496_ < 0
		   || i_496_ > ((Class121) class121).anInt1513 || i_499_ < 0
		   || i_499_ > ((Class121) class121).anInt1513);
	    int i_507_ = i_502_ >>> 24;
	    if (i_505_ == 0 || i_505_ == 1 && 255 == i_507_) {
		((Class121) class121).anInt1526 = 0;
		((Class121) class121).aBool1502 = false;
		class121.method1580(bool, bool_506_, false, (float) i_495_,
				    (float) i_497_, (float) i_500_, (float) i,
				    (float) i_496_, (float) i_499_, f, f_498_,
				    f_501_, i_502_, i_503_, i_504_);
	    } else if (1 == i_505_) {
		((Class121) class121).anInt1526 = 255 - i_507_;
		((Class121) class121).aBool1502 = false;
		class121.method1580(bool, bool_506_, false, (float) i_495_,
				    (float) i_497_, (float) i_500_, (float) i,
				    (float) i_496_, (float) i_499_, f, f_498_,
				    f_501_, i_502_, i_503_, i_504_);
	    } else if (i_505_ == 2) {
		((Class121) class121).anInt1526 = 128;
		((Class121) class121).aBool1502 = true;
		class121.method1580(bool, bool_506_, false, (float) i_495_,
				    (float) i_497_, (float) i_500_, (float) i,
				    (float) i_496_, (float) i_499_, f, f_498_,
				    f_501_, i_502_, i_503_, i_504_);
	    } else
		throw new IllegalArgumentException();
	    ((Class121) class121).aBool1501 = true;
	}
    }
    
    public void method2338() {
	((Class173_Sub3) this).anInt9738 = 0;
	((Class173_Sub3) this).anInt9739 = 0;
	((Class173_Sub3) this).anInt9740
	    = ((Class173_Sub3) this).anInt9735 * -1844567151;
	((Class173_Sub3) this).anInt9741
	    = -1733649543 * ((Class173_Sub3) this).anInt9748;
	method8934();
    }
    
    public void method2252(Class418 class418) {
	((Class173_Sub3) this).aClass418_9722.method4986(class418);
	method8943();
    }
    
    public Class418 method2187() {
	return new Class418(((Class173_Sub3) this).aClass418_9722);
    }
    
    public void method2477(float f) {
	((Class173_Sub3) this).anInt9732 = (int) (65535.0F * f) * 682635763;
    }
    
    public void method2485(int[] is) {
	is[0] = -1930702891 * ((Class173_Sub3) this).anInt9738;
	is[1] = ((Class173_Sub3) this).anInt9739 * 542582179;
	is[2] = 1233404121 * ((Class173_Sub3) this).anInt9740;
	is[3] = 600069629 * ((Class173_Sub3) this).anInt9741;
    }
    
    public void method2549(int i, int i_508_, int i_509_) {
	for (int i_510_ = 0;
	     i_510_ < ((Class173_Sub3) this).aClass107Array9731.length;
	     i_510_++) {
	    Class107 class107
		= ((Class173_Sub3) this).aClass107Array9731[i_510_];
	    ((Class107) class107).anInt1342 = (i & 0xffffff) * -1114118045;
	    int i_511_
		= ((Class107) class107).anInt1342 * -1050551989 >>> 16 & 0xff;
	    if (i_511_ < 2)
		i_511_ = 2;
	    int i_512_
		= ((Class107) class107).anInt1342 * -1050551989 >> 8 & 0xff;
	    if (i_512_ < 2)
		i_512_ = 2;
	    int i_513_ = ((Class107) class107).anInt1342 * -1050551989 & 0xff;
	    if (i_513_ < 2)
		i_513_ = 2;
	    ((Class107) class107).anInt1342
		= -1114118045 * (i_511_ << 16 | i_512_ << 8 | i_513_);
	    if (i_508_ < 0)
		((Class107) class107).aBool1327 = false;
	    else
		((Class107) class107).aBool1327 = true;
	}
    }
    
    void method8943() {
	((Class173_Sub3) this).aClass418_9734
	    .method5035(((Class173_Sub3) this).aClass433_9733);
	((Class173_Sub3) this).aClass418_9736
	    .method4986(((Class173_Sub3) this).aClass418_9734);
	((Class173_Sub3) this).aClass418_9736
	    .method4974(((Class173_Sub3) this).aClass418_9722);
	((Class173_Sub3) this).aClass418_9736
	    .method4991(((Class173_Sub3) this).aFloatArrayArray9737[0]);
	((Class173_Sub3) this).aClass418_9736
	    .method4992(((Class173_Sub3) this).aFloatArrayArray9737[1]);
	((Class173_Sub3) this).aClass418_9736
	    .method4987(((Class173_Sub3) this).aFloatArrayArray9737[2]);
	((Class173_Sub3) this).aClass418_9736
	    .method4988(((Class173_Sub3) this).aFloatArrayArray9737[3]);
	((Class173_Sub3) this).aClass418_9736
	    .method4989(((Class173_Sub3) this).aFloatArrayArray9737[4]);
	((Class173_Sub3) this).aClass418_9736
	    .method4990(((Class173_Sub3) this).aFloatArrayArray9737[5]);
	float f = ((Class173_Sub3) this).aClass418_9722.method4978();
	float f_514_
	    = (((f - 255.0F)
		* ((Class173_Sub3) this).aClass418_9722.aFloatArray4768[10])
	       + ((Class173_Sub3) this).aClass418_9722.aFloatArray4768[14]);
	float f_515_
	    = (((Class173_Sub3) this).aClass418_9722.aFloatArray4768[14]
	       + (((Class173_Sub3) this).aClass418_9722.aFloatArray4768[10]
		  * f));
	float f_516_ = f_515_ - f_514_;
	for (int i = 0; i < -1585405167 * ((Class173_Sub3) this).anInt9745;
	     i++) {
	    Class107 class107 = ((Class173_Sub3) this).aClass107Array9731[i];
	    ((Class107) class107).aFloat1320 = f_514_;
	    ((Class107) class107).aFloat1321 = f_516_;
	}
    }
    
    public Class168 method2259(int i) {
	return null;
    }
    
    public Class168 method2368(Class168 class168, Class168 class168_517_,
			       float f, Class168 class168_518_) {
	return null;
    }
    
    public void method2261(Class168 class168) {
	/* empty */
    }
    
    public void method2262(int i, int i_519_, int i_520_, int i_521_) {
	/* empty */
    }
    
    Class173_Sub3(Class165 class165, Interface22 interface22,
		  Interface44 interface44, Interface45 interface45,
		  Interface46 interface46) {
	super(class165, interface22, interface44, interface45, interface46);
	((Class173_Sub3) this).aBool9718 = false;
	((Class173_Sub3) this).anInt9723 = 0;
	((Class173_Sub3) this).anInt9724 = 0;
	((Class173_Sub3) this).anInt9725 = 0;
	((Class173_Sub3) this).anInt9726 = 0;
	((Class173_Sub3) this).anInt9749 = 1149100067;
	((Class173_Sub3) this).anInt9755 = -1653927646;
	((Class173_Sub3) this).anInt9732 = -1204903654;
	((Class173_Sub3) this).aFloatArrayArray9737 = new float[6][4];
	((Class173_Sub3) this).aFloat9746 = 1.0F;
	((Class173_Sub3) this).aFloat9747 = 0.0F;
	((Class173_Sub3) this).aClass186_9752 = new Class186(16);
	((Class173_Sub3) this).anInt9720 = 2037582269;
	try {
	    ((Class173_Sub3) this).aClass186_9750
		= new Class186(10485760, 256);
	    ((Class173_Sub3) this).aClass433_9733 = new Class433();
	    ((Class173_Sub3) this).aClass418_9734 = new Class418();
	    ((Class173_Sub3) this).aClass418_9722 = new Class418();
	    ((Class173_Sub3) this).aClass418_9736 = new Class418();
	    method8938(1);
	    method8937(0);
	    Class224.method3169(true, true, 1132776419);
	    ((Class173_Sub3) this).aBool9718 = true;
	    ((Class173_Sub3) this).anInt9717
		= (int) Class249.method3417(2107296790) * -868264049;
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    method2156(-1372793801);
	    throw new RuntimeException("");
	}
    }
    
    public boolean method2264() {
	return false;
    }
    
    public Interface21 method2249(int i, int i_522_) {
	return new Class112(i, i_522_);
    }
    
    public boolean method2301() {
	return false;
    }
    
    public Class162 method2266(int[] is) {
	return null;
    }
    
    public boolean method2267() {
	return false;
    }
    
    public long method2194(int i, int i_523_) {
	return 0L;
    }
    
    public boolean method2269() {
	return false;
    }
    
    public void method2231() {
	/* empty */
    }
    
    public boolean method2271() {
	return false;
    }
    
    void method2182(int i, int i_524_, int i_525_, int i_526_, int i_527_) {
	if (((Class173_Sub3) this).anIntArray9719 != null
	    && (i_524_ >= 592117349 * ((Class173_Sub3) this).anInt9725
		&& i_524_ < 6965409 * ((Class173_Sub3) this).anInt9726)) {
	    if (i < -993497119 * ((Class173_Sub3) this).anInt9723) {
		i_525_ -= ((Class173_Sub3) this).anInt9723 * -993497119 - i;
		i = -993497119 * ((Class173_Sub3) this).anInt9723;
	    }
	    if (i_525_ + i > 630968029 * ((Class173_Sub3) this).anInt9724)
		i_525_ = 630968029 * ((Class173_Sub3) this).anInt9724 - i;
	    int i_528_
		= i_524_ * (111437289 * ((Class173_Sub3) this).anInt9735) + i;
	    int i_529_ = i_526_ >>> 24;
	    if (i_527_ == 0 || 1 == i_527_ && i_529_ == 255) {
		for (int i_530_ = 0; i_530_ < i_525_; i_530_++)
		    ((Class173_Sub3) this).anIntArray9719[i_528_ + i_530_]
			= i_526_;
	    } else if (1 == i_527_) {
		i_526_ = (i_529_ << 24) + ((i_529_ * (i_526_ & 0xff00) >> 8
					    & 0xff00)
					   + ((i_526_ & 0xff00ff) * i_529_ >> 8
					      & 0xff00ff));
		int i_531_ = 256 - i_529_;
		for (int i_532_ = 0; i_532_ < i_525_; i_532_++) {
		    int i_533_ = (((Class173_Sub3) this).anIntArray9719
				  [i_528_ + i_532_]);
		    i_533_
			= (((i_533_ & 0xff00) * i_531_ >> 8 & 0xff00)
			   + ((i_533_ & 0xff00ff) * i_531_ >> 8 & 0xff00ff));
		    ((Class173_Sub3) this).anIntArray9719[i_532_ + i_528_]
			= i_526_ + i_533_;
		}
	    } else if (2 == i_527_) {
		for (int i_534_ = 0; i_534_ < i_525_; i_534_++) {
		    int i_535_ = (((Class173_Sub3) this).anIntArray9719
				  [i_528_ + i_534_]);
		    int i_536_ = i_526_ + i_535_;
		    int i_537_ = (i_526_ & 0xff00ff) + (i_535_ & 0xff00ff);
		    i_535_
			= (i_537_ & 0x1000100) + (i_536_ - i_537_ & 0x10000);
		    ((Class173_Sub3) this).anIntArray9719[i_528_ + i_534_]
			= i_536_ - i_535_ | i_535_ - (i_535_ >>> 8);
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method2274(int i, Class164 class164) {
	for (int i_538_ = 0;
	     i_538_ < ((Class173_Sub3) this).aClass107Array9731.length;
	     i_538_++) {
	    ((Class107) ((Class173_Sub3) this).aClass107Array9731[i_538_])
		.anInt1355
		= -524292915 * (((Class107) (((Class173_Sub3) this)
					     .aClass107Array9731[i_538_]))
				.anInt1342);
	    ((Class107) ((Class173_Sub3) this).aClass107Array9731[i_538_])
		.anInt1325
		= i * -951681461;
	    ((Class107) ((Class173_Sub3) this).aClass107Array9731[i_538_])
		.anInt1342
		= class164.anInt1827 * -666266923;
	    ((Class107) ((Class173_Sub3) this).aClass107Array9731[i_538_])
		.anInt1345
		= -959556207 * class164.anInt1828;
	    ((Class107) ((Class173_Sub3) this).aClass107Array9731[i_538_])
		.aBool1324
		= true;
	}
    }
    
    public void method2152(int i, Class164 class164) {
	Class107 class107 = method8939(Thread.currentThread());
	((Class107) class107).anInt1325 = -951681461 * i;
	((Class107) class107).anInt1342 = -666266923 * class164.anInt1827;
	((Class107) class107).anInt1345 = -959556207 * class164.anInt1828;
    }
    
    public void method2276() {
	for (int i = 0; i < ((Class173_Sub3) this).aClass107Array9731.length;
	     i++) {
	    ((Class107) ((Class173_Sub3) this).aClass107Array9731[i]).anInt1342
		= (-1052647419
		   * (((Class107) ((Class173_Sub3) this).aClass107Array9731[i])
		      .anInt1355));
	    ((Class107) ((Class173_Sub3) this).aClass107Array9731[i]).aBool1324
		= false;
	}
    }
    
    public void method2229(int i) {
	/* empty */
    }
    
    public void method2322(float f, float f_539_, float f_540_, float[] fs) {
	float f_541_
	    = ((f_539_
		* ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[7])
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[15]
		  + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[3]
		     * f))
	       + f_540_ * (((Class173_Sub3) this).aClass418_9736
			   .aFloatArray4768[11]));
	float f_542_
	    = (f * ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[0]
	       + ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[12]
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[4]
		  * f_539_)
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[8]
		  * f_540_));
	float f_543_
	    = ((((Class173_Sub3) this).aClass418_9736.aFloatArray4768[9]
		* f_540_)
	       + ((f_539_
		   * ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[5])
		  + ((((Class173_Sub3) this).aClass418_9736.aFloatArray4768[1]
		      * f)
		     + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768
			[13]))));
	float f_544_
	    = ((((Class173_Sub3) this).aClass418_9734.aFloatArray4768[10]
		* f_540_)
	       + (f * ((Class173_Sub3) this).aClass418_9734.aFloatArray4768[2]
		  + ((Class173_Sub3) this).aClass418_9734.aFloatArray4768[14]
		  + (((Class173_Sub3) this).aClass418_9734.aFloatArray4768[6]
		     * f_539_)));
	fs[0] = (((Class173_Sub3) this).aFloat9743
		 + f_542_ * ((Class173_Sub3) this).aFloat9742 / f_541_);
	fs[1] = (((Class173_Sub3) this).aFloat9751
		 + ((Class173_Sub3) this).aFloat9744 * f_543_ / f_541_);
	fs[2] = f_544_;
    }
    
    public void method2277(float f, float f_545_, float f_546_, float[] fs) {
	float f_547_
	    = (f * ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[2]
	       + ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[14]
	       + (f_545_
		  * ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[6])
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[10]
		  * f_546_));
	float f_548_
	    = ((f_546_
		* ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[11])
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[3] * f
		  + ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[15]
		  + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[7]
		     * f_545_)));
	if (f_547_ < -f_548_ || f_547_ > f_548_) {
	    float[] fs_549_ = fs;
	    float[] fs_550_ = fs;
	    fs[2] = Float.NaN;
	    fs_550_[1] = Float.NaN;
	    fs_549_[0] = Float.NaN;
	} else {
	    float f_551_ = (f_546_ * (((Class173_Sub3) this).aClass418_9736
				      .aFloatArray4768[8])
			    + (f_545_ * (((Class173_Sub3) this).aClass418_9736
					 .aFloatArray4768[4])
			       + ((((Class173_Sub3) this).aClass418_9736
				   .aFloatArray4768[0]) * f
				  + (((Class173_Sub3) this).aClass418_9736
				     .aFloatArray4768[12]))));
	    if (f_551_ < -f_548_ || f_551_ > f_548_) {
		float[] fs_552_ = fs;
		float[] fs_553_ = fs;
		fs[2] = Float.NaN;
		fs_553_[1] = Float.NaN;
		fs_552_[0] = Float.NaN;
	    } else {
		float f_554_ = (f_546_ * (((Class173_Sub3) this).aClass418_9736
					  .aFloatArray4768[9])
				+ ((((Class173_Sub3) this).aClass418_9736
				    .aFloatArray4768[5]) * f_545_
				   + ((((Class173_Sub3) this).aClass418_9736
				       .aFloatArray4768[13])
				      + (((Class173_Sub3) this).aClass418_9736
					 .aFloatArray4768[1]) * f)));
		if (f_554_ < -f_548_ || f_554_ > f_548_) {
		    float[] fs_555_ = fs;
		    float[] fs_556_ = fs;
		    fs[2] = Float.NaN;
		    fs_556_[1] = Float.NaN;
		    fs_555_[0] = Float.NaN;
		} else {
		    float f_557_
			= ((((Class173_Sub3) this).aClass418_9734
			    .aFloatArray4768[10]) * f_546_
			   + ((((Class173_Sub3) this).aClass418_9734
			       .aFloatArray4768[6]) * f_545_
			      + ((((Class173_Sub3) this).aClass418_9734
				  .aFloatArray4768[14])
				 + f * (((Class173_Sub3) this).aClass418_9734
					.aFloatArray4768[2]))));
		    fs[0] = (((Class173_Sub3) this).aFloat9743
			     + (((Class173_Sub3) this).aFloat9742 * f_551_
				/ f_548_));
		    fs[1]
			= (f_554_ * ((Class173_Sub3) this).aFloat9744 / f_548_
			   + ((Class173_Sub3) this).aFloat9751);
		    fs[2] = f_557_;
		}
	    }
	}
    }
    
    public Class163_Sub1 method2236() {
	return new Class163_Sub1_Sub2(this);
    }
    
    public void method2450(float f, float f_558_, float f_559_, float f_560_,
			   float f_561_) {
	/* empty */
    }
    
    public Interface19 method2416(int i, int i_562_, Class149 class149,
				  Class169 class169, int i_563_) {
	return method8946(i, i_562_);
    }
    
    public Interface21 method2184(int i, int i_564_) {
	return new Class112(i, i_564_);
    }
    
    public void method2519(boolean bool) {
	Class107 class107 = method8939(Thread.currentThread());
	((Class107) class107).aBool1344 = bool;
    }
    
    public Class152 method2282() {
	return new Class152(0, "Pure Java", 1, "CPU", 0L, false);
    }
    
    public Class152 method2535() {
	return new Class152(0, "Pure Java", 1, "CPU", 0L, false);
    }
    
    public Class148 method2238(int i, int i_565_, int[] is, int[] is_566_) {
	return new Class148_Sub1(i, i_565_, is, is_566_);
    }
    
    public void method2285() {
	/* empty */
    }
    
    Class163_Sub2 method2310(Canvas canvas, int i, int i_567_) {
	return Class179.method2667(this, canvas, i, i_567_, -1662664348);
    }
    
    boolean method2516(int i, int i_568_, int i_569_, int i_570_,
		       Class433 class433, Class431 class431) {
	Class418 class418 = method2241();
	class418.method5035(class433);
	class418.method4974(((Class173_Sub3) this).aClass418_9736);
	return class431.method5202(i, i_568_, i_569_, i_570_, class418,
				   ((Class173_Sub3) this).aFloat9743,
				   ((Class173_Sub3) this).aFloat9751,
				   ((Class173_Sub3) this).aFloat9742,
				   ((Class173_Sub3) this).aFloat9744);
    }
    
    void method2288() {
	if (((Class173_Sub3) this).aBool9718) {
	    Class294.method3967(true, false, (byte) 2);
	    ((Class173_Sub3) this).aBool9718 = false;
	}
	((Class173_Sub3) this).aBool9721 = true;
    }
    
    public void method2289(int i) {
	int i_571_ = i - ((Class173_Sub3) this).anInt9717 * 1133111151;
	for (Class528_Sub4 class528_sub4
		 = (Class528_Sub4) ((Class173_Sub3) this).aClass186_9750
				       .method2742(-623667531);
	     class528_sub4 != null;
	     class528_sub4
		 = (Class528_Sub4) ((Class173_Sub3) this).aClass186_9750
				       .method2749(-1939519592)) {
	    if (((Class528_Sub4) class528_sub4).aBool10223) {
		((Class528_Sub4) class528_sub4).anInt10221 += i_571_;
		int i_572_ = ((Class528_Sub4) class528_sub4).anInt10221 / 50;
		if (i_572_ > 0) {
		    Class160 class160
			= aClass165_1984.method2093(((Class528_Sub4)
						     class528_sub4).anInt10219,
						    (byte) -80);
		    float f = (float) (class160.anInt1774 * -726179659);
		    class528_sub4.method9252
			((int) ((float) i_571_ / 1000.0F
				* (float) class160.aByte1775 / 64.0F * f),
			 (int) (f * ((float) class160.aByte1776
				     * ((float) i_571_ / 1000.0F) / 64.0F)));
		    ((Class528_Sub4) class528_sub4).anInt10221 -= i_572_ * 50;
		}
		((Class528_Sub4) class528_sub4).aBool10223 = false;
	    }
	}
	((Class173_Sub3) this).anInt9717 = i * -868264049;
	((Class173_Sub3) this).aClass186_9752.method2747(5, 608069580);
	((Class173_Sub3) this).aClass186_9750.method2747(5, 1529081634);
    }
    
    public void method2260(int i) {
	int i_573_ = i - ((Class173_Sub3) this).anInt9717 * 1133111151;
	for (Class528_Sub4 class528_sub4
		 = (Class528_Sub4) ((Class173_Sub3) this).aClass186_9750
				       .method2742(485535862);
	     class528_sub4 != null;
	     class528_sub4
		 = (Class528_Sub4) ((Class173_Sub3) this).aClass186_9750
				       .method2749(821692137)) {
	    if (((Class528_Sub4) class528_sub4).aBool10223) {
		((Class528_Sub4) class528_sub4).anInt10221 += i_573_;
		int i_574_ = ((Class528_Sub4) class528_sub4).anInt10221 / 50;
		if (i_574_ > 0) {
		    Class160 class160
			= aClass165_1984.method2093(((Class528_Sub4)
						     class528_sub4).anInt10219,
						    (byte) -47);
		    float f = (float) (class160.anInt1774 * -726179659);
		    class528_sub4.method9252
			((int) ((float) i_573_ / 1000.0F
				* (float) class160.aByte1775 / 64.0F * f),
			 (int) (f * ((float) class160.aByte1776
				     * ((float) i_573_ / 1000.0F) / 64.0F)));
		    ((Class528_Sub4) class528_sub4).anInt10221 -= i_574_ * 50;
		}
		((Class528_Sub4) class528_sub4).aBool10223 = false;
	    }
	}
	((Class173_Sub3) this).anInt9717 = i * -868264049;
	((Class173_Sub3) this).aClass186_9752.method2747(5, -2124838729);
	((Class173_Sub3) this).aClass186_9750.method2747(5, -330952410);
    }
    
    public void method2323() {
	/* empty */
    }
    
    Class173_Sub3(Canvas canvas, Class165 class165, Interface22 interface22,
		  Interface44 interface44, Interface45 interface45,
		  Interface46 interface46, int i, int i_575_) {
	this(class165, interface22, interface44, interface45, interface46);
	try {
	    method2174(canvas, i, i_575_, 2046888200);
	    method2177(canvas, (short) 168);
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    method2156(-1372793801);
	    throw new RuntimeException("");
	}
    }
    
    public void method2412(Class171 class171) {
	method8940(((Class173_Sub3) this).anIntArray9719 != null,
		   null != ((Class173_Sub3) this).aFloatArray9716, false,
		   class171);
    }
    
    public boolean method2312() {
	return false;
    }
    
    public Interface21 method2150(int i, int i_576_) {
	return new Class112(i, i_576_);
    }
    
    public void method2356(Class433 class433) {
	((Class173_Sub3) this).aClass433_9733 = class433;
	method8943();
    }
    
    public boolean method2502() {
	return false;
    }
    
    public boolean method2294() {
	return false;
    }
    
    public boolean method2409() {
	return false;
    }
    
    public boolean method2296() {
	return false;
    }
    
    public boolean method2297() {
	return true;
    }
    
    public boolean method2298() {
	return false;
    }
    
    public boolean method2299() {
	return false;
    }
    
    public boolean method2300() {
	return false;
    }
    
    public void method2461(int i) {
	int i_577_ = i - ((Class173_Sub3) this).anInt9717 * 1133111151;
	for (Class528_Sub4 class528_sub4
		 = (Class528_Sub4) ((Class173_Sub3) this).aClass186_9750
				       .method2742(355650741);
	     class528_sub4 != null;
	     class528_sub4
		 = (Class528_Sub4) ((Class173_Sub3) this).aClass186_9750
				       .method2749(215212225)) {
	    if (((Class528_Sub4) class528_sub4).aBool10223) {
		((Class528_Sub4) class528_sub4).anInt10221 += i_577_;
		int i_578_ = ((Class528_Sub4) class528_sub4).anInt10221 / 50;
		if (i_578_ > 0) {
		    Class160 class160
			= aClass165_1984.method2093(((Class528_Sub4)
						     class528_sub4).anInt10219,
						    (byte) -54);
		    float f = (float) (class160.anInt1774 * -726179659);
		    class528_sub4.method9252
			((int) ((float) i_577_ / 1000.0F
				* (float) class160.aByte1775 / 64.0F * f),
			 (int) (f * ((float) class160.aByte1776
				     * ((float) i_577_ / 1000.0F) / 64.0F)));
		    ((Class528_Sub4) class528_sub4).anInt10221 -= i_578_ * 50;
		}
		((Class528_Sub4) class528_sub4).aBool10223 = false;
	    }
	}
	((Class173_Sub3) this).anInt9717 = i * -868264049;
	((Class173_Sub3) this).aClass186_9752.method2747(5, -576046308);
	((Class173_Sub3) this).aClass186_9750.method2747(5, 646787633);
    }
    
    public Class151 method2385(int i, int i_579_, int i_580_, int i_581_,
			       boolean bool) {
	if (null == ((Class173_Sub3) this).anIntArray9719)
	    throw new IllegalStateException("");
	int[] is = new int[i_580_ * i_581_];
	int i_582_
	    = i_579_ * (111437289 * ((Class173_Sub3) this).anInt9735) + i;
	int i_583_ = ((Class173_Sub3) this).anInt9735 * 111437289 - i_580_;
	for (int i_584_ = 0; i_584_ < i_581_; i_584_++) {
	    int i_585_ = i_580_ * i_584_;
	    for (int i_586_ = 0; i_586_ < i_580_; i_586_++)
		is[i_586_ + i_585_]
		    = ((Class173_Sub3) this).anIntArray9719[i_582_++];
	    i_582_ += i_583_;
	}
	if (bool)
	    return new Class151_Sub1_Sub3(this, is, i_580_, i_581_);
	return new Class151_Sub1_Sub2(this, is, i_580_, i_581_);
    }
    
    public boolean method2303() {
	return false;
    }
    
    public Class151 method2376(int i, int i_587_, boolean bool,
			       boolean bool_588_) {
	if (bool)
	    return new Class151_Sub1_Sub3(this, i, i_587_);
	return new Class151_Sub1_Sub2(this, i, i_587_);
    }
    
    public void method2480(float f) {
	((Class173_Sub3) this).anInt9732 = (int) (65535.0F * f) * 682635763;
    }
    
    public void method2511(boolean bool) {
	/* empty */
    }
    
    public void method2307(boolean bool) {
	/* empty */
    }
    
    public Class433 method2419() {
	return new Class433(((Class173_Sub3) this).aClass433_9733);
    }
    
    public void method2437(boolean bool) {
	/* empty */
    }
    
    public void method2309(boolean bool) {
	/* empty */
    }
    
    public Class151 method2380(int[] is, int i, int i_589_, int i_590_,
			       int i_591_, boolean bool) {
	boolean bool_592_ = false;
	int i_593_ = i;
    while_1_:
	for (int i_594_ = 0; i_594_ < i_591_; i_594_++) {
	    for (int i_595_ = 0; i_595_ < i_590_; i_595_++) {
		int i_596_ = is[i_593_++] >>> 24;
		if (0 != i_596_ && 255 != i_596_) {
		    bool_592_ = true;
		    break while_1_;
		}
	    }
	}
	if (bool_592_)
	    return new Class151_Sub1_Sub3(this, is, i, i_589_, i_590_, i_591_,
					  bool);
	return new Class151_Sub1_Sub2(this, is, i, i_589_, i_590_, i_591_,
				      bool);
    }
    
    public Class148 method2335(int i, int i_597_, int[] is, int[] is_598_) {
	return new Class148_Sub1(i, i_597_, is, is_598_);
    }
    
    public void method2157(Class433 class433, Class159 class159,
			   Class431 class431) {
	Class418 class418 = method2241();
	class418.method5035(class433);
	class418.method4974(((Class173_Sub3) this).aClass418_9736);
	class159.method2056(class431, ((Class173_Sub3) this).aClass418_9722,
			    class418, ((Class173_Sub3) this).aFloat9743,
			    ((Class173_Sub3) this).aFloat9751,
			    ((Class173_Sub3) this).aFloat9742,
			    ((Class173_Sub3) this).aFloat9744);
    }
    
    public boolean method2162() {
	return false;
    }
    
    public boolean method2314() {
	return false;
    }
    
    public boolean method2315() {
	return true;
    }
    
    public boolean method2316() {
	return true;
    }
    
    public void method2342() {
	((Class173_Sub3) this).aClass163_Sub1_9730 = null;
	((Class173_Sub3) this).aClass151_9753 = null;
    }
    
    public Class151 method2381(Class178 class178, boolean bool) {
	int i = class178.method2601();
	int i_599_ = class178.method2602();
	Class151_Sub1 class151_sub1;
	if (bool && !class178.method2600() && class178.method2599()) {
	    Class178_Sub2 class178_sub2 = (Class178_Sub2) class178;
	    int[] is = new int[class178_sub2.anIntArray9769.length];
	    byte[] is_600_ = new byte[i * i_599_];
	    for (int i_601_ = 0; i_601_ < i_599_; i_601_++) {
		int i_602_ = i * i_601_;
		for (int i_603_ = 0; i_603_ < i; i_603_++)
		    is_600_[i_602_ + i_603_]
			= class178_sub2.aByteArray9770[i_603_ + i_602_];
	    }
	    for (int i_604_ = 0; i_604_ < class178_sub2.anIntArray9769.length;
		 i_604_++)
		is[i_604_] = class178_sub2.anIntArray9769[i_604_];
	    class151_sub1
		= new Class151_Sub1_Sub1(this, is_600_, is, i, i_599_);
	} else {
	    int[] is = class178.method2629(false);
	    if (class178.method2600())
		class151_sub1 = new Class151_Sub1_Sub3(this, is, i, i_599_);
	    else
		class151_sub1 = new Class151_Sub1_Sub2(this, is, i, i_599_);
	}
	class151_sub1.method1801(class178.method2603(), class178.method2605(),
				 class178.method2604(), class178.method2606());
	return class151_sub1;
    }
    
    public void method2319(int i, int i_605_, int i_606_) {
	/* empty */
    }
    
    public void method2320(int i, int i_607_, int i_608_) {
	/* empty */
    }
    
    public void method2321() {
	/* empty */
    }
    
    public void method2304() {
	/* empty */
    }
    
    public Class157 method2515(Class177 class177, int i, int i_609_,
			       int i_610_, int i_611_) {
	return new Class157_Sub2(this, class177, i, i_610_, i_611_, i_609_);
    }
    
    public void method2525(int[] is) {
	is[0] = 111437289 * ((Class173_Sub3) this).anInt9735;
	is[1] = 434033557 * ((Class173_Sub3) this).anInt9748;
    }
    
    public long method2488(int i, int i_612_) {
	return 0L;
    }
    
    public long method2326(int i, int i_613_) {
	return 0L;
    }
    
    public void method2327(long l) {
	/* empty */
    }
    
    public String method2169() {
	return "";
    }
    
    public void method2186() {
	/* empty */
    }
    
    public void method2550(int i, int i_614_, int[] is, int[] is_615_) {
	method2197(i, i_614_, (byte) 1);
	if (((Class173_Sub3) this).aClass151_9753 == null
	    || ((Class173_Sub3) this).aClass151_9753.method1766() != i
	    || ((Class173_Sub3) this).aClass151_9753.method1767() != i_614_) {
	    ((Class173_Sub3) this).aClass151_9753
		= method2191(i, i_614_, true, true);
	    ((Class173_Sub3) this).aClass163_Sub1_9730 = null;
	}
	if (((Class173_Sub3) this).aClass163_Sub1_9730 == null) {
	    ((Class173_Sub3) this).aClass163_Sub1_9730 = method2236();
	    ((Class173_Sub3) this).aClass163_Sub1_9730.method8898
		(0, ((Class173_Sub3) this).aClass151_9753.method1769());
	}
	Class151_Sub1_Sub3 class151_sub1_sub3
	    = new Class151_Sub1_Sub3(this,
				     ((Class173_Sub3) this).anIntArray9719,
				     (((Class173_Sub3) this).anInt9735
				      * 111437289),
				     (434033557
				      * ((Class173_Sub3) this).anInt9748));
	method2179(((Class173_Sub3) this).aClass163_Sub1_9730, -843798982);
	method2268(1, -16777216);
	class151_sub1_sub3.method1777(anInt2002 * 1354853215,
				      anInt2007 * -2074272721,
				      anInt2006 * 857980141,
				      -649725419 * anInt1990, 1, 0, 0, 0);
	((Class173_Sub3) this).aClass151_9753.method1771(0, 0, i, i_614_, is,
							 is_615_, 0, i);
	method2180(((Class173_Sub3) this).aClass163_Sub1_9730, -1489305553);
    }
    
    public boolean method2168() {
	return true;
    }
    
    public void method2332() {
	((Class173_Sub3) this).aClass163_Sub1_9730 = null;
	((Class173_Sub3) this).aClass151_9753 = null;
    }
    
    public void method2333() {
	((Class173_Sub3) this).aClass163_Sub1_9730 = null;
	((Class173_Sub3) this).aClass151_9753 = null;
    }
    
    public void method2345(int[] is) {
	is[0] = -1930702891 * ((Class173_Sub3) this).anInt9738;
	is[1] = ((Class173_Sub3) this).anInt9739 * 542582179;
	is[2] = 1233404121 * ((Class173_Sub3) this).anInt9740;
	is[3] = 600069629 * ((Class173_Sub3) this).anInt9741;
    }
    
    public void method2405(int i, Class528_Sub12[] class528_sub12s) {
	/* empty */
    }
    
    void method2218(int i, int i_616_, int i_617_, int i_618_, int i_619_) {
	if (((Class173_Sub3) this).anIntArray9719 != null
	    && (i_616_ >= 592117349 * ((Class173_Sub3) this).anInt9725
		&& i_616_ < 6965409 * ((Class173_Sub3) this).anInt9726)) {
	    if (i < -993497119 * ((Class173_Sub3) this).anInt9723) {
		i_617_ -= ((Class173_Sub3) this).anInt9723 * -993497119 - i;
		i = -993497119 * ((Class173_Sub3) this).anInt9723;
	    }
	    if (i_617_ + i > 630968029 * ((Class173_Sub3) this).anInt9724)
		i_617_ = 630968029 * ((Class173_Sub3) this).anInt9724 - i;
	    int i_620_
		= i_616_ * (111437289 * ((Class173_Sub3) this).anInt9735) + i;
	    int i_621_ = i_618_ >>> 24;
	    if (i_619_ == 0 || 1 == i_619_ && i_621_ == 255) {
		for (int i_622_ = 0; i_622_ < i_617_; i_622_++)
		    ((Class173_Sub3) this).anIntArray9719[i_620_ + i_622_]
			= i_618_;
	    } else if (1 == i_619_) {
		i_618_ = (i_621_ << 24) + ((i_621_ * (i_618_ & 0xff00) >> 8
					    & 0xff00)
					   + ((i_618_ & 0xff00ff) * i_621_ >> 8
					      & 0xff00ff));
		int i_623_ = 256 - i_621_;
		for (int i_624_ = 0; i_624_ < i_617_; i_624_++) {
		    int i_625_ = (((Class173_Sub3) this).anIntArray9719
				  [i_620_ + i_624_]);
		    i_625_
			= (((i_625_ & 0xff00) * i_623_ >> 8 & 0xff00)
			   + ((i_625_ & 0xff00ff) * i_623_ >> 8 & 0xff00ff));
		    ((Class173_Sub3) this).anIntArray9719[i_624_ + i_620_]
			= i_618_ + i_625_;
		}
	    } else if (2 == i_619_) {
		for (int i_626_ = 0; i_626_ < i_617_; i_626_++) {
		    int i_627_ = (((Class173_Sub3) this).anIntArray9719
				  [i_620_ + i_626_]);
		    int i_628_ = i_618_ + i_627_;
		    int i_629_ = (i_618_ & 0xff00ff) + (i_627_ & 0xff00ff);
		    i_627_
			= (i_629_ & 0x1000100) + (i_628_ - i_629_ & 0x10000);
		    ((Class173_Sub3) this).anIntArray9719[i_620_ + i_626_]
			= i_628_ - i_627_ | i_627_ - (i_627_ >>> 8);
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method2199() {
	if (((Class173_Sub3) this).aBool9718) {
	    Class294.method3967(true, false, (byte) 2);
	    ((Class173_Sub3) this).aBool9718 = false;
	}
	((Class173_Sub3) this).aBool9721 = true;
    }
    
    public void method2328(long l) {
	/* empty */
    }
    
    public void method2446() {
	((Class173_Sub3) this).aClass163_Sub1_9730 = null;
	((Class173_Sub3) this).aClass151_9753 = null;
    }
    
    public void method2263(int i, int i_630_) {
	/* empty */
    }
    
    public void method2341(int[] is) {
	is[0] = -1930702891 * ((Class173_Sub3) this).anInt9738;
	is[1] = ((Class173_Sub3) this).anInt9739 * 542582179;
	is[2] = 1233404121 * ((Class173_Sub3) this).anInt9740;
	is[3] = 600069629 * ((Class173_Sub3) this).anInt9741;
    }
    
    public void method2227(Class433 class433, Class159 class159,
			   Class431 class431) {
	Class418 class418 = method2241();
	class418.method5035(class433);
	class418.method4974(((Class173_Sub3) this).aClass418_9736);
	class159.method2056(class431, ((Class173_Sub3) this).aClass418_9722,
			    class418, ((Class173_Sub3) this).aFloat9743,
			    ((Class173_Sub3) this).aFloat9751,
			    ((Class173_Sub3) this).aFloat9742,
			    ((Class173_Sub3) this).aFloat9744);
    }
    
    public void method2344(float f, float f_631_) {
	((Class173_Sub3) this).aFloat9746 = f_631_ - f;
	((Class173_Sub3) this).aFloat9747 = f_631_ + f - 1.0F;
	for (int i = 0; i < ((Class173_Sub3) this).anInt9745 * -1585405167;
	     i++) {
	    Class107 class107 = ((Class173_Sub3) this).aClass107Array9731[i];
	    Class121 class121 = ((Class107) class107).aClass121_1330;
	    ((Class121) class121).aFloat1503
		= ((Class173_Sub3) this).aFloat9746;
	    ((Class121) class121).aFloat1511
		= ((Class173_Sub3) this).aFloat9747;
	}
    }
    
    public boolean method2467() {
	return true;
    }
    
    public boolean method2257() {
	return false;
    }
    
    public void method2346() {
	((Class173_Sub3) this).anInt9723 = 0;
	((Class173_Sub3) this).anInt9725 = 0;
	((Class173_Sub3) this).anInt9724
	    = -1908296579 * ((Class173_Sub3) this).anInt9735;
	((Class173_Sub3) this).anInt9726
	    = ((Class173_Sub3) this).anInt9748 * 314466933;
	method8934();
    }
    
    public void method2347(int i, int i_632_, int i_633_, int i_634_) {
	if (i < 0)
	    i = 0;
	if (i_632_ < 0)
	    i_632_ = 0;
	if (i_633_ > 111437289 * ((Class173_Sub3) this).anInt9735)
	    i_633_ = 111437289 * ((Class173_Sub3) this).anInt9735;
	if (i_634_ > 434033557 * ((Class173_Sub3) this).anInt9748)
	    i_634_ = ((Class173_Sub3) this).anInt9748 * 434033557;
	((Class173_Sub3) this).anInt9723 = -1762913247 * i;
	((Class173_Sub3) this).anInt9724 = -1932232331 * i_633_;
	((Class173_Sub3) this).anInt9725 = -988511379 * i_632_;
	((Class173_Sub3) this).anInt9726 = -2128503967 * i_634_;
	method8934();
    }
    
    public void method2490(int i, int i_635_, int i_636_, int i_637_) {
	if (i < 0)
	    i = 0;
	if (i_635_ < 0)
	    i_635_ = 0;
	if (i_636_ > 111437289 * ((Class173_Sub3) this).anInt9735)
	    i_636_ = 111437289 * ((Class173_Sub3) this).anInt9735;
	if (i_637_ > 434033557 * ((Class173_Sub3) this).anInt9748)
	    i_637_ = ((Class173_Sub3) this).anInt9748 * 434033557;
	((Class173_Sub3) this).anInt9723 = -1762913247 * i;
	((Class173_Sub3) this).anInt9724 = -1932232331 * i_636_;
	((Class173_Sub3) this).anInt9725 = -988511379 * i_635_;
	((Class173_Sub3) this).anInt9726 = -2128503967 * i_637_;
	method8934();
    }
    
    public void method2509(int i, int i_638_, int i_639_, int i_640_,
			   int i_641_, int i_642_, int i_643_) {
	if (null != ((Class173_Sub3) this).anIntArray9719) {
	    Class107 class107 = method8939(Thread.currentThread());
	    Class121 class121 = ((Class107) class107).aClass121_1330;
	    int i_644_ = i_639_ - i;
	    int i_645_ = i_640_ - i_638_;
	    int i_646_ = i_644_ >= 0 ? i_644_ : -i_644_;
	    int i_647_ = i_645_ >= 0 ? i_645_ : -i_645_;
	    int i_648_ = i_646_;
	    if (i_648_ < i_647_)
		i_648_ = i_647_;
	    if (0 != i_648_) {
		int i_649_ = (i_644_ << 16) / i_648_;
		int i_650_ = (i_645_ << 16) / i_648_;
		i_644_ += i_649_ >> 16;
		i_645_ += i_650_ >> 16;
		if (i_650_ <= i_649_)
		    i_649_ = -i_649_;
		else
		    i_650_ = -i_650_;
		int i_651_ = i_642_ * i_650_ >> 17;
		int i_652_ = 1 + i_642_ * i_650_ >> 17;
		int i_653_ = i_642_ * i_649_ >> 17;
		int i_654_ = 1 + i_642_ * i_649_ >> 17;
		i -= class121.method1593();
		i_638_ -= class121.method1577();
		int i_655_ = i_651_ + i;
		int i_656_ = i - i_652_;
		int i_657_ = i + i_644_ - i_652_;
		int i_658_ = i_651_ + (i_644_ + i);
		int i_659_ = i_638_ + i_653_;
		int i_660_ = i_638_ - i_654_;
		int i_661_ = i_645_ + i_638_ - i_654_;
		int i_662_ = i_645_ + i_638_ + i_653_;
		if (i_643_ == 0)
		    ((Class121) class121).anInt1526 = 0;
		else if (1 == i_643_)
		    ((Class121) class121).anInt1526 = 255 - (i_641_ >>> 24);
		else
		    throw new IllegalArgumentException();
		method2283(false);
		((Class121) class121).aBool1504
		    = (i_655_ < 0 || i_655_ > ((Class121) class121).anInt1513
		       || i_656_ < 0
		       || i_656_ > ((Class121) class121).anInt1513
		       || i_657_ < 0
		       || i_657_ > ((Class121) class121).anInt1513);
		class121.method1582(true, false, false, (float) i_659_,
				    (float) i_660_, (float) i_661_,
				    (float) i_655_, (float) i_656_,
				    (float) i_657_, 100.0F, 100.0F, 100.0F,
				    i_641_);
		((Class121) class121).aBool1504
		    = (i_655_ < 0 || i_655_ > ((Class121) class121).anInt1513
		       || i_657_ < 0
		       || i_657_ > ((Class121) class121).anInt1513
		       || i_658_ < 0
		       || i_658_ > ((Class121) class121).anInt1513);
		class121.method1582(true, false, false, (float) i_659_,
				    (float) i_661_, (float) i_662_,
				    (float) i_655_, (float) i_657_,
				    (float) i_658_, 100.0F, 100.0F, 100.0F,
				    i_641_);
		method2283(true);
	    }
	}
    }
    
    public void method2349(int i, int i_663_, int i_664_, int i_665_) {
	if (-993497119 * ((Class173_Sub3) this).anInt9723 < i)
	    ((Class173_Sub3) this).anInt9723 = i * -1762913247;
	if (((Class173_Sub3) this).anInt9725 * 592117349 < i_663_)
	    ((Class173_Sub3) this).anInt9725 = -988511379 * i_663_;
	if (((Class173_Sub3) this).anInt9724 * 630968029 > i_664_)
	    ((Class173_Sub3) this).anInt9724 = -1932232331 * i_664_;
	if (((Class173_Sub3) this).anInt9726 * 6965409 > i_665_)
	    ((Class173_Sub3) this).anInt9726 = -2128503967 * i_665_;
	method8934();
    }
    
    public void method2295(int[] is) {
	is[0] = ((Class173_Sub3) this).anInt9723 * -993497119;
	is[1] = 592117349 * ((Class173_Sub3) this).anInt9725;
	is[2] = ((Class173_Sub3) this).anInt9724 * 630968029;
	is[3] = 6965409 * ((Class173_Sub3) this).anInt9726;
    }
    
    public void method2539(float f, float f_666_, float f_667_, float[] fs) {
	float f_668_
	    = (f * ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[2]
	       + ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[14]
	       + (f_666_
		  * ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[6])
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[10]
		  * f_667_));
	float f_669_
	    = ((f_667_
		* ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[11])
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[3] * f
		  + ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[15]
		  + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[7]
		     * f_666_)));
	if (f_668_ < -f_669_ || f_668_ > f_669_) {
	    float[] fs_670_ = fs;
	    float[] fs_671_ = fs;
	    fs[2] = Float.NaN;
	    fs_671_[1] = Float.NaN;
	    fs_670_[0] = Float.NaN;
	} else {
	    float f_672_ = (f_667_ * (((Class173_Sub3) this).aClass418_9736
				      .aFloatArray4768[8])
			    + (f_666_ * (((Class173_Sub3) this).aClass418_9736
					 .aFloatArray4768[4])
			       + ((((Class173_Sub3) this).aClass418_9736
				   .aFloatArray4768[0]) * f
				  + (((Class173_Sub3) this).aClass418_9736
				     .aFloatArray4768[12]))));
	    if (f_672_ < -f_669_ || f_672_ > f_669_) {
		float[] fs_673_ = fs;
		float[] fs_674_ = fs;
		fs[2] = Float.NaN;
		fs_674_[1] = Float.NaN;
		fs_673_[0] = Float.NaN;
	    } else {
		float f_675_ = (f_667_ * (((Class173_Sub3) this).aClass418_9736
					  .aFloatArray4768[9])
				+ ((((Class173_Sub3) this).aClass418_9736
				    .aFloatArray4768[5]) * f_666_
				   + ((((Class173_Sub3) this).aClass418_9736
				       .aFloatArray4768[13])
				      + (((Class173_Sub3) this).aClass418_9736
					 .aFloatArray4768[1]) * f)));
		if (f_675_ < -f_669_ || f_675_ > f_669_) {
		    float[] fs_676_ = fs;
		    float[] fs_677_ = fs;
		    fs[2] = Float.NaN;
		    fs_677_[1] = Float.NaN;
		    fs_676_[0] = Float.NaN;
		} else {
		    float f_678_
			= ((((Class173_Sub3) this).aClass418_9734
			    .aFloatArray4768[10]) * f_667_
			   + ((((Class173_Sub3) this).aClass418_9734
			       .aFloatArray4768[6]) * f_666_
			      + ((((Class173_Sub3) this).aClass418_9734
				  .aFloatArray4768[14])
				 + f * (((Class173_Sub3) this).aClass418_9734
					.aFloatArray4768[2]))));
		    fs[0] = (((Class173_Sub3) this).aFloat9743
			     + (((Class173_Sub3) this).aFloat9742 * f_672_
				/ f_669_));
		    fs[1]
			= (f_675_ * ((Class173_Sub3) this).aFloat9744 / f_669_
			   + ((Class173_Sub3) this).aFloat9751);
		    fs[2] = f_678_;
		}
	    }
	}
    }
    
    public void method2343(int[] is) {
	is[0] = -1930702891 * ((Class173_Sub3) this).anInt9738;
	is[1] = ((Class173_Sub3) this).anInt9739 * 542582179;
	is[2] = 1233404121 * ((Class173_Sub3) this).anInt9740;
	is[3] = 600069629 * ((Class173_Sub3) this).anInt9741;
    }
    
    public void method2353(int i, int i_679_, int i_680_, int i_681_,
			   int i_682_, int i_683_) {
	method2218(i, i_679_, i_680_, i_682_, i_683_);
	method2218(i, i_681_ + i_679_ - 1, i_680_, i_682_, i_683_);
	method2395(i, 1 + i_679_, i_681_ - 2, i_682_, i_683_);
	method2395(i + i_680_ - 1, 1 + i_679_, i_681_ - 2, i_682_, i_683_);
    }
    
    public boolean method2164() {
	return false;
    }
    
    void method2355(int i, int i_684_, int i_685_, int i_686_, int i_687_) {
	if (((Class173_Sub3) this).anIntArray9719 != null
	    && (i_684_ >= 592117349 * ((Class173_Sub3) this).anInt9725
		&& i_684_ < 6965409 * ((Class173_Sub3) this).anInt9726)) {
	    if (i < -993497119 * ((Class173_Sub3) this).anInt9723) {
		i_685_ -= ((Class173_Sub3) this).anInt9723 * -993497119 - i;
		i = -993497119 * ((Class173_Sub3) this).anInt9723;
	    }
	    if (i_685_ + i > 630968029 * ((Class173_Sub3) this).anInt9724)
		i_685_ = 630968029 * ((Class173_Sub3) this).anInt9724 - i;
	    int i_688_
		= i_684_ * (111437289 * ((Class173_Sub3) this).anInt9735) + i;
	    int i_689_ = i_686_ >>> 24;
	    if (i_687_ == 0 || 1 == i_687_ && i_689_ == 255) {
		for (int i_690_ = 0; i_690_ < i_685_; i_690_++)
		    ((Class173_Sub3) this).anIntArray9719[i_688_ + i_690_]
			= i_686_;
	    } else if (1 == i_687_) {
		i_686_ = (i_689_ << 24) + ((i_689_ * (i_686_ & 0xff00) >> 8
					    & 0xff00)
					   + ((i_686_ & 0xff00ff) * i_689_ >> 8
					      & 0xff00ff));
		int i_691_ = 256 - i_689_;
		for (int i_692_ = 0; i_692_ < i_685_; i_692_++) {
		    int i_693_ = (((Class173_Sub3) this).anIntArray9719
				  [i_688_ + i_692_]);
		    i_693_
			= (((i_693_ & 0xff00) * i_691_ >> 8 & 0xff00)
			   + ((i_693_ & 0xff00ff) * i_691_ >> 8 & 0xff00ff));
		    ((Class173_Sub3) this).anIntArray9719[i_692_ + i_688_]
			= i_686_ + i_693_;
		}
	    } else if (2 == i_687_) {
		for (int i_694_ = 0; i_694_ < i_685_; i_694_++) {
		    int i_695_ = (((Class173_Sub3) this).anIntArray9719
				  [i_688_ + i_694_]);
		    int i_696_ = i_686_ + i_695_;
		    int i_697_ = (i_686_ & 0xff00ff) + (i_695_ & 0xff00ff);
		    i_695_
			= (i_697_ & 0x1000100) + (i_696_ - i_697_ & 0x10000);
		    ((Class173_Sub3) this).anIntArray9719[i_688_ + i_694_]
			= i_696_ - i_695_ | i_695_ - (i_695_ >>> 8);
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method2195(Class528_Sub23 class528_sub23) {
	/* empty */
    }
    
    public void method2203() {
	((Class173_Sub3) this).anInt9723 = 0;
	((Class173_Sub3) this).anInt9725 = 0;
	((Class173_Sub3) this).anInt9724
	    = -1908296579 * ((Class173_Sub3) this).anInt9735;
	((Class173_Sub3) this).anInt9726
	    = ((Class173_Sub3) this).anInt9748 * 314466933;
	method8934();
    }
    
    void method2358(int i, int i_698_, int i_699_, int i_700_, int i_701_) {
	if (null != ((Class173_Sub3) this).anIntArray9719
	    && (i >= ((Class173_Sub3) this).anInt9723 * -993497119
		&& i < ((Class173_Sub3) this).anInt9724 * 630968029)) {
	    if (i_698_ < ((Class173_Sub3) this).anInt9725 * 592117349) {
		i_699_
		    -= 592117349 * ((Class173_Sub3) this).anInt9725 - i_698_;
		i_698_ = ((Class173_Sub3) this).anInt9725 * 592117349;
	    }
	    if (i_699_ + i_698_ > 6965409 * ((Class173_Sub3) this).anInt9726)
		i_699_ = ((Class173_Sub3) this).anInt9726 * 6965409 - i_698_;
	    int i_702_
		= i + ((Class173_Sub3) this).anInt9735 * 111437289 * i_698_;
	    int i_703_ = i_700_ >>> 24;
	    if (i_701_ == 0 || 1 == i_701_ && i_703_ == 255) {
		for (int i_704_ = 0; i_704_ < i_699_; i_704_++)
		    ((Class173_Sub3) this).anIntArray9719
			[i_702_ + (((Class173_Sub3) this).anInt9735 * 111437289
				   * i_704_)]
			= i_700_;
	    } else if (1 == i_701_) {
		i_700_ = ((i_703_ << 24)
			  + (((i_700_ & 0xff00ff) * i_703_ >> 8 & 0xff00ff)
			     + ((i_700_ & 0xff00) * i_703_ >> 8 & 0xff00)));
		int i_705_ = 256 - i_703_;
		for (int i_706_ = 0; i_706_ < i_699_; i_706_++) {
		    int i_707_ = ((((Class173_Sub3) this).anInt9735 * 111437289
				   * i_706_)
				  + i_702_);
		    int i_708_ = ((Class173_Sub3) this).anIntArray9719[i_707_];
		    i_708_
			= (((i_708_ & 0xff00) * i_705_ >> 8 & 0xff00)
			   + (i_705_ * (i_708_ & 0xff00ff) >> 8 & 0xff00ff));
		    ((Class173_Sub3) this).anIntArray9719[i_707_]
			= i_708_ + i_700_;
		}
	    } else if (i_701_ == 2) {
		for (int i_709_ = 0; i_709_ < i_699_; i_709_++) {
		    int i_710_ = (i_709_ * (((Class173_Sub3) this).anInt9735
					    * 111437289)
				  + i_702_);
		    int i_711_ = ((Class173_Sub3) this).anIntArray9719[i_710_];
		    int i_712_ = i_700_ + i_711_;
		    int i_713_ = (i_700_ & 0xff00ff) + (i_711_ & 0xff00ff);
		    i_711_
			= (i_712_ - i_713_ & 0x10000) + (i_713_ & 0x1000100);
		    ((Class173_Sub3) this).anIntArray9719[i_710_]
			= i_712_ - i_711_ | i_711_ - (i_711_ >>> 8);
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public Class157 method2514(Class177 class177, int i, int i_714_,
			       int i_715_, int i_716_) {
	return new Class157_Sub2(this, class177, i, i_715_, i_716_, i_714_);
    }
    
    public int method2366(int i, int i_717_) {
	return i | i_717_;
    }
    
    public void method2471(int i, int i_718_, float f, int i_719_, int i_720_,
			   float f_721_, int i_722_, int i_723_, float f_724_,
			   int i_725_, int i_726_, int i_727_, int i_728_) {
	boolean bool = ((Class173_Sub3) this).anIntArray9719 != null;
	boolean bool_729_ = ((Class173_Sub3) this).aFloatArray9716 != null;
	if (bool || bool_729_) {
	    Class107 class107 = method8939(Thread.currentThread());
	    Class121 class121 = ((Class107) class107).aClass121_1330;
	    ((Class121) class121).aBool1501 = false;
	    i -= -993497119 * ((Class173_Sub3) this).anInt9723;
	    i_719_ -= -993497119 * ((Class173_Sub3) this).anInt9723;
	    i_722_ -= -993497119 * ((Class173_Sub3) this).anInt9723;
	    i_718_ -= 592117349 * ((Class173_Sub3) this).anInt9725;
	    i_720_ -= ((Class173_Sub3) this).anInt9725 * 592117349;
	    i_723_ -= ((Class173_Sub3) this).anInt9725 * 592117349;
	    ((Class121) class121).aBool1504
		= (i < 0 || i > ((Class121) class121).anInt1513 || i_719_ < 0
		   || i_719_ > ((Class121) class121).anInt1513 || i_722_ < 0
		   || i_722_ > ((Class121) class121).anInt1513);
	    int i_730_ = i_725_ >>> 24;
	    if (i_728_ == 0 || i_728_ == 1 && 255 == i_730_) {
		((Class121) class121).anInt1526 = 0;
		((Class121) class121).aBool1502 = false;
		class121.method1580(bool, bool_729_, false, (float) i_718_,
				    (float) i_720_, (float) i_723_, (float) i,
				    (float) i_719_, (float) i_722_, f, f_721_,
				    f_724_, i_725_, i_726_, i_727_);
	    } else if (1 == i_728_) {
		((Class121) class121).anInt1526 = 255 - i_730_;
		((Class121) class121).aBool1502 = false;
		class121.method1580(bool, bool_729_, false, (float) i_718_,
				    (float) i_720_, (float) i_723_, (float) i,
				    (float) i_719_, (float) i_722_, f, f_721_,
				    f_724_, i_725_, i_726_, i_727_);
	    } else if (i_728_ == 2) {
		((Class121) class121).anInt1526 = 128;
		((Class121) class121).aBool1502 = true;
		class121.method1580(bool, bool_729_, false, (float) i_718_,
				    (float) i_720_, (float) i_723_, (float) i,
				    (float) i_719_, (float) i_722_, f, f_721_,
				    f_724_, i_725_, i_726_, i_727_);
	    } else
		throw new IllegalArgumentException();
	    ((Class121) class121).aBool1501 = true;
	}
    }
    
    public void method2359(int i, int i_731_, int i_732_, int i_733_,
			   int i_734_, int i_735_) {
	if (((Class173_Sub3) this).anIntArray9719 != null) {
	    i_732_ -= i;
	    i_733_ -= i_731_;
	    if (0 == i_733_) {
		if (i_732_ >= 0)
		    method2218(i, i_731_, i_732_ + 1, i_734_, i_735_);
		else
		    method2218(i + i_732_, i_731_, -i_732_ + 1, i_734_,
			       i_735_);
	    } else if (i_732_ == 0) {
		if (i_733_ >= 0)
		    method2395(i, i_731_, i_733_ + 1, i_734_, i_735_);
		else
		    method2395(i, i_733_ + i_731_, -i_733_ + 1, i_734_,
			       i_735_);
	    } else {
		if (i_733_ + i_732_ < 0) {
		    i += i_732_;
		    i_732_ = -i_732_;
		    i_731_ += i_733_;
		    i_733_ = -i_733_;
		}
		if (i_732_ > i_733_) {
		    i_731_ <<= 16;
		    i_731_ += 32768;
		    i_733_ <<= 16;
		    int i_736_ = (int) Math.floor(0.5 + ((double) i_733_
							 / (double) i_732_));
		    i_732_ += i;
		    if (i < ((Class173_Sub3) this).anInt9723 * -993497119) {
			i_731_
			    += (-993497119 * ((Class173_Sub3) this).anInt9723
				- i) * i_736_;
			i = ((Class173_Sub3) this).anInt9723 * -993497119;
		    }
		    if (i_732_ >= 630968029 * ((Class173_Sub3) this).anInt9724)
			i_732_
			    = ((Class173_Sub3) this).anInt9724 * 630968029 - 1;
		    int i_737_ = i_734_ >>> 24;
		    if (0 == i_735_ || 1 == i_735_ && 255 == i_737_) {
			for (/**/; i <= i_732_; i++) {
			    int i_738_ = i_731_ >> 16;
			    if (i_738_ >= (592117349
					   * ((Class173_Sub3) this).anInt9725)
				&& i_738_ < 6965409 * (((Class173_Sub3) this)
						       .anInt9726))
				((Class173_Sub3) this).anIntArray9719
				    [i_738_ * (((Class173_Sub3) this).anInt9735
					       * 111437289) + i]
				    = i_734_;
			    i_731_ += i_736_;
			}
		    } else if (1 == i_735_) {
			i_734_
			    = (((i_734_ & 0xff00ff) * i_737_ >> 8 & 0xff00ff)
			       + ((i_734_ & 0xff00) * i_737_ >> 8 & 0xff00)
			       + (i_737_ << 24));
			int i_739_ = 256 - i_737_;
			for (/**/; i <= i_732_; i++) {
			    int i_740_ = i_731_ >> 16;
			    if (i_740_ >= (592117349
					   * ((Class173_Sub3) this).anInt9725)
				&& i_740_ < 6965409 * (((Class173_Sub3) this)
						       .anInt9726)) {
				int i_741_
				    = i + i_740_ * (111437289
						    * (((Class173_Sub3) this)
						       .anInt9735));
				int i_742_ = (((Class173_Sub3) this)
					      .anIntArray9719[i_741_]);
				i_742_ = (((i_742_ & 0xff00ff) * i_739_ >> 8
					   & 0xff00ff)
					  + (i_739_ * (i_742_ & 0xff00) >> 8
					     & 0xff00));
				((Class173_Sub3) this).anIntArray9719[i_741_]
				    = i_742_ + i_734_;
			    }
			    i_731_ += i_736_;
			}
		    } else if (i_735_ == 2) {
			for (/**/; i <= i_732_; i++) {
			    int i_743_ = i_731_ >> 16;
			    if (i_743_ >= (((Class173_Sub3) this).anInt9725
					   * 592117349)
				&& i_743_ < (((Class173_Sub3) this).anInt9726
					     * 6965409)) {
				int i_744_
				    = i + i_743_ * (111437289
						    * (((Class173_Sub3) this)
						       .anInt9735));
				int i_745_ = (((Class173_Sub3) this)
					      .anIntArray9719[i_744_]);
				int i_746_ = i_745_ + i_734_;
				int i_747_ = ((i_734_ & 0xff00ff)
					      + (i_745_ & 0xff00ff));
				i_745_ = ((i_746_ - i_747_ & 0x10000)
					  + (i_747_ & 0x1000100));
				((Class173_Sub3) this).anIntArray9719[i_744_]
				    = i_746_ - i_745_ | i_745_ - (i_745_
								  >>> 8);
			    }
			    i_731_ += i_736_;
			}
		    } else
			throw new IllegalArgumentException();
		} else {
		    i <<= 16;
		    i += 32768;
		    i_732_ <<= 16;
		    int i_748_
			= (int) Math.floor((double) i_732_ / (double) i_733_
					   + 0.5);
		    i_733_ += i_731_;
		    if (i_731_
			< ((Class173_Sub3) this).anInt9725 * 592117349) {
			i += (i_748_
			      * (((Class173_Sub3) this).anInt9725 * 592117349
				 - i_731_));
			i_731_ = ((Class173_Sub3) this).anInt9725 * 592117349;
		    }
		    if (i_733_ >= 6965409 * ((Class173_Sub3) this).anInt9726)
			i_733_
			    = ((Class173_Sub3) this).anInt9726 * 6965409 - 1;
		    int i_749_ = i_734_ >>> 24;
		    if (i_735_ == 0 || 1 == i_735_ && i_749_ == 255) {
			for (/**/; i_731_ <= i_733_; i_731_++) {
			    int i_750_ = i >> 16;
			    if (i_750_ >= (((Class173_Sub3) this).anInt9723
					   * -993497119)
				&& i_750_ < 630968029 * (((Class173_Sub3) this)
							 .anInt9724))
				((Class173_Sub3) this).anIntArray9719
				    [i_750_ + i_731_ * ((((Class173_Sub3) this)
							 .anInt9735)
							* 111437289)]
				    = i_734_;
			    i += i_748_;
			}
		    } else if (i_735_ == 1) {
			i_734_ = ((i_749_ << 24)
				  + ((i_749_ * (i_734_ & 0xff00) >> 8 & 0xff00)
				     + ((i_734_ & 0xff00ff) * i_749_ >> 8
					& 0xff00ff)));
			int i_751_ = 256 - i_749_;
			for (/**/; i_731_ <= i_733_; i_731_++) {
			    int i_752_ = i >> 16;
			    if (i_752_ >= (((Class173_Sub3) this).anInt9723
					   * -993497119)
				&& i_752_ < 630968029 * (((Class173_Sub3) this)
							 .anInt9724)) {
				int i_753_
				    = (i_752_
				       + (i_731_
					  * (((Class173_Sub3) this).anInt9735
					     * 111437289)));
				int i_754_ = (((Class173_Sub3) this)
					      .anIntArray9719[i_753_]);
				i_754_ = ((i_751_ * (i_754_ & 0xff00) >> 8
					   & 0xff00)
					  + ((i_754_ & 0xff00ff) * i_751_ >> 8
					     & 0xff00ff));
				((Class173_Sub3) this).anIntArray9719
				    [i_752_ + (((Class173_Sub3) this).anInt9735
					       * 111437289 * i_731_)]
				    = i_734_ + i_754_;
			    }
			    i += i_748_;
			}
		    } else if (2 == i_735_) {
			for (/**/; i_731_ <= i_733_; i_731_++) {
			    int i_755_ = i >> 16;
			    if (i_755_ >= (-993497119
					   * ((Class173_Sub3) this).anInt9723)
				&& i_755_ < (((Class173_Sub3) this).anInt9724
					     * 630968029)) {
				int i_756_
				    = ((111437289
					* ((Class173_Sub3) this).anInt9735
					* i_731_)
				       + i_755_);
				int i_757_ = (((Class173_Sub3) this)
					      .anIntArray9719[i_756_]);
				int i_758_ = i_757_ + i_734_;
				int i_759_ = ((i_734_ & 0xff00ff)
					      + (i_757_ & 0xff00ff));
				i_757_ = ((i_758_ - i_759_ & 0x10000)
					  + (i_759_ & 0x1000100));
				((Class173_Sub3) this).anIntArray9719[i_756_]
				    = i_758_ - i_757_ | i_757_ - (i_757_
								  >>> 8);
			    }
			    i += i_748_;
			}
		    } else
			throw new IllegalArgumentException();
		}
	    }
	}
    }
    
    public void method2360(int i, int i_760_, int i_761_, int i_762_,
			   int i_763_, int i_764_) {
	if (((Class173_Sub3) this).anIntArray9719 != null) {
	    i_761_ -= i;
	    i_762_ -= i_760_;
	    if (0 == i_762_) {
		if (i_761_ >= 0)
		    method2218(i, i_760_, i_761_ + 1, i_763_, i_764_);
		else
		    method2218(i + i_761_, i_760_, -i_761_ + 1, i_763_,
			       i_764_);
	    } else if (i_761_ == 0) {
		if (i_762_ >= 0)
		    method2395(i, i_760_, i_762_ + 1, i_763_, i_764_);
		else
		    method2395(i, i_762_ + i_760_, -i_762_ + 1, i_763_,
			       i_764_);
	    } else {
		if (i_762_ + i_761_ < 0) {
		    i += i_761_;
		    i_761_ = -i_761_;
		    i_760_ += i_762_;
		    i_762_ = -i_762_;
		}
		if (i_761_ > i_762_) {
		    i_760_ <<= 16;
		    i_760_ += 32768;
		    i_762_ <<= 16;
		    int i_765_ = (int) Math.floor(0.5 + ((double) i_762_
							 / (double) i_761_));
		    i_761_ += i;
		    if (i < ((Class173_Sub3) this).anInt9723 * -993497119) {
			i_760_
			    += (-993497119 * ((Class173_Sub3) this).anInt9723
				- i) * i_765_;
			i = ((Class173_Sub3) this).anInt9723 * -993497119;
		    }
		    if (i_761_ >= 630968029 * ((Class173_Sub3) this).anInt9724)
			i_761_
			    = ((Class173_Sub3) this).anInt9724 * 630968029 - 1;
		    int i_766_ = i_763_ >>> 24;
		    if (0 == i_764_ || 1 == i_764_ && 255 == i_766_) {
			for (/**/; i <= i_761_; i++) {
			    int i_767_ = i_760_ >> 16;
			    if (i_767_ >= (592117349
					   * ((Class173_Sub3) this).anInt9725)
				&& i_767_ < 6965409 * (((Class173_Sub3) this)
						       .anInt9726))
				((Class173_Sub3) this).anIntArray9719
				    [i_767_ * (((Class173_Sub3) this).anInt9735
					       * 111437289) + i]
				    = i_763_;
			    i_760_ += i_765_;
			}
		    } else if (1 == i_764_) {
			i_763_
			    = (((i_763_ & 0xff00ff) * i_766_ >> 8 & 0xff00ff)
			       + ((i_763_ & 0xff00) * i_766_ >> 8 & 0xff00)
			       + (i_766_ << 24));
			int i_768_ = 256 - i_766_;
			for (/**/; i <= i_761_; i++) {
			    int i_769_ = i_760_ >> 16;
			    if (i_769_ >= (592117349
					   * ((Class173_Sub3) this).anInt9725)
				&& i_769_ < 6965409 * (((Class173_Sub3) this)
						       .anInt9726)) {
				int i_770_
				    = i + i_769_ * (111437289
						    * (((Class173_Sub3) this)
						       .anInt9735));
				int i_771_ = (((Class173_Sub3) this)
					      .anIntArray9719[i_770_]);
				i_771_ = (((i_771_ & 0xff00ff) * i_768_ >> 8
					   & 0xff00ff)
					  + (i_768_ * (i_771_ & 0xff00) >> 8
					     & 0xff00));
				((Class173_Sub3) this).anIntArray9719[i_770_]
				    = i_771_ + i_763_;
			    }
			    i_760_ += i_765_;
			}
		    } else if (i_764_ == 2) {
			for (/**/; i <= i_761_; i++) {
			    int i_772_ = i_760_ >> 16;
			    if (i_772_ >= (((Class173_Sub3) this).anInt9725
					   * 592117349)
				&& i_772_ < (((Class173_Sub3) this).anInt9726
					     * 6965409)) {
				int i_773_
				    = i + i_772_ * (111437289
						    * (((Class173_Sub3) this)
						       .anInt9735));
				int i_774_ = (((Class173_Sub3) this)
					      .anIntArray9719[i_773_]);
				int i_775_ = i_774_ + i_763_;
				int i_776_ = ((i_763_ & 0xff00ff)
					      + (i_774_ & 0xff00ff));
				i_774_ = ((i_775_ - i_776_ & 0x10000)
					  + (i_776_ & 0x1000100));
				((Class173_Sub3) this).anIntArray9719[i_773_]
				    = i_775_ - i_774_ | i_774_ - (i_774_
								  >>> 8);
			    }
			    i_760_ += i_765_;
			}
		    } else
			throw new IllegalArgumentException();
		} else {
		    i <<= 16;
		    i += 32768;
		    i_761_ <<= 16;
		    int i_777_
			= (int) Math.floor((double) i_761_ / (double) i_762_
					   + 0.5);
		    i_762_ += i_760_;
		    if (i_760_
			< ((Class173_Sub3) this).anInt9725 * 592117349) {
			i += (i_777_
			      * (((Class173_Sub3) this).anInt9725 * 592117349
				 - i_760_));
			i_760_ = ((Class173_Sub3) this).anInt9725 * 592117349;
		    }
		    if (i_762_ >= 6965409 * ((Class173_Sub3) this).anInt9726)
			i_762_
			    = ((Class173_Sub3) this).anInt9726 * 6965409 - 1;
		    int i_778_ = i_763_ >>> 24;
		    if (i_764_ == 0 || 1 == i_764_ && i_778_ == 255) {
			for (/**/; i_760_ <= i_762_; i_760_++) {
			    int i_779_ = i >> 16;
			    if (i_779_ >= (((Class173_Sub3) this).anInt9723
					   * -993497119)
				&& i_779_ < 630968029 * (((Class173_Sub3) this)
							 .anInt9724))
				((Class173_Sub3) this).anIntArray9719
				    [i_779_ + i_760_ * ((((Class173_Sub3) this)
							 .anInt9735)
							* 111437289)]
				    = i_763_;
			    i += i_777_;
			}
		    } else if (i_764_ == 1) {
			i_763_ = ((i_778_ << 24)
				  + ((i_778_ * (i_763_ & 0xff00) >> 8 & 0xff00)
				     + ((i_763_ & 0xff00ff) * i_778_ >> 8
					& 0xff00ff)));
			int i_780_ = 256 - i_778_;
			for (/**/; i_760_ <= i_762_; i_760_++) {
			    int i_781_ = i >> 16;
			    if (i_781_ >= (((Class173_Sub3) this).anInt9723
					   * -993497119)
				&& i_781_ < 630968029 * (((Class173_Sub3) this)
							 .anInt9724)) {
				int i_782_
				    = (i_781_
				       + (i_760_
					  * (((Class173_Sub3) this).anInt9735
					     * 111437289)));
				int i_783_ = (((Class173_Sub3) this)
					      .anIntArray9719[i_782_]);
				i_783_ = ((i_780_ * (i_783_ & 0xff00) >> 8
					   & 0xff00)
					  + ((i_783_ & 0xff00ff) * i_780_ >> 8
					     & 0xff00ff));
				((Class173_Sub3) this).anIntArray9719
				    [i_781_ + (((Class173_Sub3) this).anInt9735
					       * 111437289 * i_760_)]
				    = i_763_ + i_783_;
			    }
			    i += i_777_;
			}
		    } else if (2 == i_764_) {
			for (/**/; i_760_ <= i_762_; i_760_++) {
			    int i_784_ = i >> 16;
			    if (i_784_ >= (-993497119
					   * ((Class173_Sub3) this).anInt9723)
				&& i_784_ < (((Class173_Sub3) this).anInt9724
					     * 630968029)) {
				int i_785_
				    = ((111437289
					* ((Class173_Sub3) this).anInt9735
					* i_760_)
				       + i_784_);
				int i_786_ = (((Class173_Sub3) this)
					      .anIntArray9719[i_785_]);
				int i_787_ = i_786_ + i_763_;
				int i_788_ = ((i_763_ & 0xff00ff)
					      + (i_786_ & 0xff00ff));
				i_786_ = ((i_787_ - i_788_ & 0x10000)
					  + (i_788_ & 0x1000100));
				((Class173_Sub3) this).anIntArray9719[i_785_]
				    = i_787_ - i_786_ | i_786_ - (i_786_
								  >>> 8);
			    }
			    i += i_777_;
			}
		    } else
			throw new IllegalArgumentException();
		}
	    }
	}
    }
    
    public void method2242(int i, int i_789_, int i_790_, int i_791_,
			   int i_792_, int i_793_) {
	if (((Class173_Sub3) this).anIntArray9719 != null) {
	    i_790_ -= i;
	    i_791_ -= i_789_;
	    if (0 == i_791_) {
		if (i_790_ >= 0)
		    method2218(i, i_789_, i_790_ + 1, i_792_, i_793_);
		else
		    method2218(i + i_790_, i_789_, -i_790_ + 1, i_792_,
			       i_793_);
	    } else if (i_790_ == 0) {
		if (i_791_ >= 0)
		    method2395(i, i_789_, i_791_ + 1, i_792_, i_793_);
		else
		    method2395(i, i_791_ + i_789_, -i_791_ + 1, i_792_,
			       i_793_);
	    } else {
		if (i_791_ + i_790_ < 0) {
		    i += i_790_;
		    i_790_ = -i_790_;
		    i_789_ += i_791_;
		    i_791_ = -i_791_;
		}
		if (i_790_ > i_791_) {
		    i_789_ <<= 16;
		    i_789_ += 32768;
		    i_791_ <<= 16;
		    int i_794_ = (int) Math.floor(0.5 + ((double) i_791_
							 / (double) i_790_));
		    i_790_ += i;
		    if (i < ((Class173_Sub3) this).anInt9723 * -993497119) {
			i_789_
			    += (-993497119 * ((Class173_Sub3) this).anInt9723
				- i) * i_794_;
			i = ((Class173_Sub3) this).anInt9723 * -993497119;
		    }
		    if (i_790_ >= 630968029 * ((Class173_Sub3) this).anInt9724)
			i_790_
			    = ((Class173_Sub3) this).anInt9724 * 630968029 - 1;
		    int i_795_ = i_792_ >>> 24;
		    if (0 == i_793_ || 1 == i_793_ && 255 == i_795_) {
			for (/**/; i <= i_790_; i++) {
			    int i_796_ = i_789_ >> 16;
			    if (i_796_ >= (592117349
					   * ((Class173_Sub3) this).anInt9725)
				&& i_796_ < 6965409 * (((Class173_Sub3) this)
						       .anInt9726))
				((Class173_Sub3) this).anIntArray9719
				    [i_796_ * (((Class173_Sub3) this).anInt9735
					       * 111437289) + i]
				    = i_792_;
			    i_789_ += i_794_;
			}
		    } else if (1 == i_793_) {
			i_792_
			    = (((i_792_ & 0xff00ff) * i_795_ >> 8 & 0xff00ff)
			       + ((i_792_ & 0xff00) * i_795_ >> 8 & 0xff00)
			       + (i_795_ << 24));
			int i_797_ = 256 - i_795_;
			for (/**/; i <= i_790_; i++) {
			    int i_798_ = i_789_ >> 16;
			    if (i_798_ >= (592117349
					   * ((Class173_Sub3) this).anInt9725)
				&& i_798_ < 6965409 * (((Class173_Sub3) this)
						       .anInt9726)) {
				int i_799_
				    = i + i_798_ * (111437289
						    * (((Class173_Sub3) this)
						       .anInt9735));
				int i_800_ = (((Class173_Sub3) this)
					      .anIntArray9719[i_799_]);
				i_800_ = (((i_800_ & 0xff00ff) * i_797_ >> 8
					   & 0xff00ff)
					  + (i_797_ * (i_800_ & 0xff00) >> 8
					     & 0xff00));
				((Class173_Sub3) this).anIntArray9719[i_799_]
				    = i_800_ + i_792_;
			    }
			    i_789_ += i_794_;
			}
		    } else if (i_793_ == 2) {
			for (/**/; i <= i_790_; i++) {
			    int i_801_ = i_789_ >> 16;
			    if (i_801_ >= (((Class173_Sub3) this).anInt9725
					   * 592117349)
				&& i_801_ < (((Class173_Sub3) this).anInt9726
					     * 6965409)) {
				int i_802_
				    = i + i_801_ * (111437289
						    * (((Class173_Sub3) this)
						       .anInt9735));
				int i_803_ = (((Class173_Sub3) this)
					      .anIntArray9719[i_802_]);
				int i_804_ = i_803_ + i_792_;
				int i_805_ = ((i_792_ & 0xff00ff)
					      + (i_803_ & 0xff00ff));
				i_803_ = ((i_804_ - i_805_ & 0x10000)
					  + (i_805_ & 0x1000100));
				((Class173_Sub3) this).anIntArray9719[i_802_]
				    = i_804_ - i_803_ | i_803_ - (i_803_
								  >>> 8);
			    }
			    i_789_ += i_794_;
			}
		    } else
			throw new IllegalArgumentException();
		} else {
		    i <<= 16;
		    i += 32768;
		    i_790_ <<= 16;
		    int i_806_
			= (int) Math.floor((double) i_790_ / (double) i_791_
					   + 0.5);
		    i_791_ += i_789_;
		    if (i_789_
			< ((Class173_Sub3) this).anInt9725 * 592117349) {
			i += (i_806_
			      * (((Class173_Sub3) this).anInt9725 * 592117349
				 - i_789_));
			i_789_ = ((Class173_Sub3) this).anInt9725 * 592117349;
		    }
		    if (i_791_ >= 6965409 * ((Class173_Sub3) this).anInt9726)
			i_791_
			    = ((Class173_Sub3) this).anInt9726 * 6965409 - 1;
		    int i_807_ = i_792_ >>> 24;
		    if (i_793_ == 0 || 1 == i_793_ && i_807_ == 255) {
			for (/**/; i_789_ <= i_791_; i_789_++) {
			    int i_808_ = i >> 16;
			    if (i_808_ >= (((Class173_Sub3) this).anInt9723
					   * -993497119)
				&& i_808_ < 630968029 * (((Class173_Sub3) this)
							 .anInt9724))
				((Class173_Sub3) this).anIntArray9719
				    [i_808_ + i_789_ * ((((Class173_Sub3) this)
							 .anInt9735)
							* 111437289)]
				    = i_792_;
			    i += i_806_;
			}
		    } else if (i_793_ == 1) {
			i_792_ = ((i_807_ << 24)
				  + ((i_807_ * (i_792_ & 0xff00) >> 8 & 0xff00)
				     + ((i_792_ & 0xff00ff) * i_807_ >> 8
					& 0xff00ff)));
			int i_809_ = 256 - i_807_;
			for (/**/; i_789_ <= i_791_; i_789_++) {
			    int i_810_ = i >> 16;
			    if (i_810_ >= (((Class173_Sub3) this).anInt9723
					   * -993497119)
				&& i_810_ < 630968029 * (((Class173_Sub3) this)
							 .anInt9724)) {
				int i_811_
				    = (i_810_
				       + (i_789_
					  * (((Class173_Sub3) this).anInt9735
					     * 111437289)));
				int i_812_ = (((Class173_Sub3) this)
					      .anIntArray9719[i_811_]);
				i_812_ = ((i_809_ * (i_812_ & 0xff00) >> 8
					   & 0xff00)
					  + ((i_812_ & 0xff00ff) * i_809_ >> 8
					     & 0xff00ff));
				((Class173_Sub3) this).anIntArray9719
				    [i_810_ + (((Class173_Sub3) this).anInt9735
					       * 111437289 * i_789_)]
				    = i_792_ + i_812_;
			    }
			    i += i_806_;
			}
		    } else if (2 == i_793_) {
			for (/**/; i_789_ <= i_791_; i_789_++) {
			    int i_813_ = i >> 16;
			    if (i_813_ >= (-993497119
					   * ((Class173_Sub3) this).anInt9723)
				&& i_813_ < (((Class173_Sub3) this).anInt9724
					     * 630968029)) {
				int i_814_
				    = ((111437289
					* ((Class173_Sub3) this).anInt9735
					* i_789_)
				       + i_813_);
				int i_815_ = (((Class173_Sub3) this)
					      .anIntArray9719[i_814_]);
				int i_816_ = i_815_ + i_792_;
				int i_817_ = ((i_792_ & 0xff00ff)
					      + (i_815_ & 0xff00ff));
				i_815_ = ((i_816_ - i_817_ & 0x10000)
					  + (i_817_ & 0x1000100));
				((Class173_Sub3) this).anIntArray9719[i_814_]
				    = i_816_ - i_815_ | i_815_ - (i_815_
								  >>> 8);
			    }
			    i += i_806_;
			}
		    } else
			throw new IllegalArgumentException();
		}
	    }
	}
    }
    
    public void method2170(int i, int i_818_, int i_819_, int i_820_,
			   int i_821_, int i_822_) {
	if (((Class173_Sub3) this).anIntArray9719 != null) {
	    i_819_ -= i;
	    i_820_ -= i_818_;
	    if (0 == i_820_) {
		if (i_819_ >= 0)
		    method2218(i, i_818_, i_819_ + 1, i_821_, i_822_);
		else
		    method2218(i + i_819_, i_818_, -i_819_ + 1, i_821_,
			       i_822_);
	    } else if (i_819_ == 0) {
		if (i_820_ >= 0)
		    method2395(i, i_818_, i_820_ + 1, i_821_, i_822_);
		else
		    method2395(i, i_820_ + i_818_, -i_820_ + 1, i_821_,
			       i_822_);
	    } else {
		if (i_820_ + i_819_ < 0) {
		    i += i_819_;
		    i_819_ = -i_819_;
		    i_818_ += i_820_;
		    i_820_ = -i_820_;
		}
		if (i_819_ > i_820_) {
		    i_818_ <<= 16;
		    i_818_ += 32768;
		    i_820_ <<= 16;
		    int i_823_ = (int) Math.floor(0.5 + ((double) i_820_
							 / (double) i_819_));
		    i_819_ += i;
		    if (i < ((Class173_Sub3) this).anInt9723 * -993497119) {
			i_818_
			    += (-993497119 * ((Class173_Sub3) this).anInt9723
				- i) * i_823_;
			i = ((Class173_Sub3) this).anInt9723 * -993497119;
		    }
		    if (i_819_ >= 630968029 * ((Class173_Sub3) this).anInt9724)
			i_819_
			    = ((Class173_Sub3) this).anInt9724 * 630968029 - 1;
		    int i_824_ = i_821_ >>> 24;
		    if (0 == i_822_ || 1 == i_822_ && 255 == i_824_) {
			for (/**/; i <= i_819_; i++) {
			    int i_825_ = i_818_ >> 16;
			    if (i_825_ >= (592117349
					   * ((Class173_Sub3) this).anInt9725)
				&& i_825_ < 6965409 * (((Class173_Sub3) this)
						       .anInt9726))
				((Class173_Sub3) this).anIntArray9719
				    [i_825_ * (((Class173_Sub3) this).anInt9735
					       * 111437289) + i]
				    = i_821_;
			    i_818_ += i_823_;
			}
		    } else if (1 == i_822_) {
			i_821_
			    = (((i_821_ & 0xff00ff) * i_824_ >> 8 & 0xff00ff)
			       + ((i_821_ & 0xff00) * i_824_ >> 8 & 0xff00)
			       + (i_824_ << 24));
			int i_826_ = 256 - i_824_;
			for (/**/; i <= i_819_; i++) {
			    int i_827_ = i_818_ >> 16;
			    if (i_827_ >= (592117349
					   * ((Class173_Sub3) this).anInt9725)
				&& i_827_ < 6965409 * (((Class173_Sub3) this)
						       .anInt9726)) {
				int i_828_
				    = i + i_827_ * (111437289
						    * (((Class173_Sub3) this)
						       .anInt9735));
				int i_829_ = (((Class173_Sub3) this)
					      .anIntArray9719[i_828_]);
				i_829_ = (((i_829_ & 0xff00ff) * i_826_ >> 8
					   & 0xff00ff)
					  + (i_826_ * (i_829_ & 0xff00) >> 8
					     & 0xff00));
				((Class173_Sub3) this).anIntArray9719[i_828_]
				    = i_829_ + i_821_;
			    }
			    i_818_ += i_823_;
			}
		    } else if (i_822_ == 2) {
			for (/**/; i <= i_819_; i++) {
			    int i_830_ = i_818_ >> 16;
			    if (i_830_ >= (((Class173_Sub3) this).anInt9725
					   * 592117349)
				&& i_830_ < (((Class173_Sub3) this).anInt9726
					     * 6965409)) {
				int i_831_
				    = i + i_830_ * (111437289
						    * (((Class173_Sub3) this)
						       .anInt9735));
				int i_832_ = (((Class173_Sub3) this)
					      .anIntArray9719[i_831_]);
				int i_833_ = i_832_ + i_821_;
				int i_834_ = ((i_821_ & 0xff00ff)
					      + (i_832_ & 0xff00ff));
				i_832_ = ((i_833_ - i_834_ & 0x10000)
					  + (i_834_ & 0x1000100));
				((Class173_Sub3) this).anIntArray9719[i_831_]
				    = i_833_ - i_832_ | i_832_ - (i_832_
								  >>> 8);
			    }
			    i_818_ += i_823_;
			}
		    } else
			throw new IllegalArgumentException();
		} else {
		    i <<= 16;
		    i += 32768;
		    i_819_ <<= 16;
		    int i_835_
			= (int) Math.floor((double) i_819_ / (double) i_820_
					   + 0.5);
		    i_820_ += i_818_;
		    if (i_818_
			< ((Class173_Sub3) this).anInt9725 * 592117349) {
			i += (i_835_
			      * (((Class173_Sub3) this).anInt9725 * 592117349
				 - i_818_));
			i_818_ = ((Class173_Sub3) this).anInt9725 * 592117349;
		    }
		    if (i_820_ >= 6965409 * ((Class173_Sub3) this).anInt9726)
			i_820_
			    = ((Class173_Sub3) this).anInt9726 * 6965409 - 1;
		    int i_836_ = i_821_ >>> 24;
		    if (i_822_ == 0 || 1 == i_822_ && i_836_ == 255) {
			for (/**/; i_818_ <= i_820_; i_818_++) {
			    int i_837_ = i >> 16;
			    if (i_837_ >= (((Class173_Sub3) this).anInt9723
					   * -993497119)
				&& i_837_ < 630968029 * (((Class173_Sub3) this)
							 .anInt9724))
				((Class173_Sub3) this).anIntArray9719
				    [i_837_ + i_818_ * ((((Class173_Sub3) this)
							 .anInt9735)
							* 111437289)]
				    = i_821_;
			    i += i_835_;
			}
		    } else if (i_822_ == 1) {
			i_821_ = ((i_836_ << 24)
				  + ((i_836_ * (i_821_ & 0xff00) >> 8 & 0xff00)
				     + ((i_821_ & 0xff00ff) * i_836_ >> 8
					& 0xff00ff)));
			int i_838_ = 256 - i_836_;
			for (/**/; i_818_ <= i_820_; i_818_++) {
			    int i_839_ = i >> 16;
			    if (i_839_ >= (((Class173_Sub3) this).anInt9723
					   * -993497119)
				&& i_839_ < 630968029 * (((Class173_Sub3) this)
							 .anInt9724)) {
				int i_840_
				    = (i_839_
				       + (i_818_
					  * (((Class173_Sub3) this).anInt9735
					     * 111437289)));
				int i_841_ = (((Class173_Sub3) this)
					      .anIntArray9719[i_840_]);
				i_841_ = ((i_838_ * (i_841_ & 0xff00) >> 8
					   & 0xff00)
					  + ((i_841_ & 0xff00ff) * i_838_ >> 8
					     & 0xff00ff));
				((Class173_Sub3) this).anIntArray9719
				    [i_839_ + (((Class173_Sub3) this).anInt9735
					       * 111437289 * i_818_)]
				    = i_821_ + i_841_;
			    }
			    i += i_835_;
			}
		    } else if (2 == i_822_) {
			for (/**/; i_818_ <= i_820_; i_818_++) {
			    int i_842_ = i >> 16;
			    if (i_842_ >= (-993497119
					   * ((Class173_Sub3) this).anInt9723)
				&& i_842_ < (((Class173_Sub3) this).anInt9724
					     * 630968029)) {
				int i_843_
				    = ((111437289
					* ((Class173_Sub3) this).anInt9735
					* i_818_)
				       + i_842_);
				int i_844_ = (((Class173_Sub3) this)
					      .anIntArray9719[i_843_]);
				int i_845_ = i_844_ + i_821_;
				int i_846_ = ((i_821_ & 0xff00ff)
					      + (i_844_ & 0xff00ff));
				i_844_ = ((i_845_ - i_846_ & 0x10000)
					  + (i_846_ & 0x1000100));
				((Class173_Sub3) this).anIntArray9719[i_843_]
				    = i_845_ - i_844_ | i_844_ - (i_844_
								  >>> 8);
			    }
			    i += i_835_;
			}
		    } else
			throw new IllegalArgumentException();
		}
	    }
	}
    }
    
    public void method2364(int i, int i_847_, int i_848_, int i_849_,
			   int i_850_, int i_851_, Class148 class148,
			   int i_852_, int i_853_) {
	if (((Class173_Sub3) this).anIntArray9719 != null) {
	    Class148_Sub1 class148_sub1 = (Class148_Sub1) class148;
	    int[] is = ((Class148_Sub1) class148_sub1).anIntArray8789;
	    int[] is_854_ = ((Class148_Sub1) class148_sub1).anIntArray8788;
	    int i_855_
		= (((Class173_Sub3) this).anInt9725 * 592117349 > i_853_
		   ? 592117349 * ((Class173_Sub3) this).anInt9725 : i_853_);
	    int i_856_ = ((((Class173_Sub3) this).anInt9726 * 6965409
			   < i_853_ + is.length)
			  ? ((Class173_Sub3) this).anInt9726 * 6965409
			  : is.length + i_853_);
	    i_848_ -= i;
	    i_849_ -= i_847_;
	    if (i_848_ + i_849_ < 0) {
		i += i_848_;
		i_848_ = -i_848_;
		i_847_ += i_849_;
		i_849_ = -i_849_;
	    }
	    if (i_848_ > i_849_) {
		i_847_ <<= 16;
		i_847_ += 32768;
		i_849_ <<= 16;
		int i_857_ = (int) Math.floor(0.5 + ((double) i_849_
						     / (double) i_848_));
		i_848_ += i;
		if (i < -993497119 * ((Class173_Sub3) this).anInt9723) {
		    i_847_ += (i_857_
			       * (((Class173_Sub3) this).anInt9723 * -993497119
				  - i));
		    i = ((Class173_Sub3) this).anInt9723 * -993497119;
		}
		if (i_848_ >= 630968029 * ((Class173_Sub3) this).anInt9724)
		    i_848_ = 630968029 * ((Class173_Sub3) this).anInt9724 - 1;
		int i_858_ = i_850_ >>> 24;
		if (i_851_ == 0 || 1 == i_851_ && 255 == i_858_) {
		    for (/**/; i <= i_848_; i++) {
			int i_859_ = i_847_ >> 16;
			int i_860_ = i_859_ - i_853_;
			if (i_859_ >= i_855_ && i_859_ < i_856_) {
			    int i_861_ = is[i_860_] + i_852_;
			    if (i >= i_861_ && i < i_861_ + is_854_[i_860_])
				((Class173_Sub3) this).anIntArray9719
				    [i + (((Class173_Sub3) this).anInt9735
					  * 111437289 * i_859_)]
				    = i_850_;
			}
			i_847_ += i_857_;
		    }
		} else if (i_851_ == 1) {
		    i_850_
			= ((i_858_ << 24)
			   + (((i_850_ & 0xff00ff) * i_858_ >> 8 & 0xff00ff)
			      + (i_858_ * (i_850_ & 0xff00) >> 8 & 0xff00)));
		    int i_862_ = 256 - i_858_;
		    for (/**/; i <= i_848_; i++) {
			int i_863_ = i_847_ >> 16;
			int i_864_ = i_863_ - i_853_;
			if (i_863_ >= i_855_ && i_863_ < i_856_) {
			    int i_865_ = is[i_864_] + i_852_;
			    if (i >= i_865_ && i < is_854_[i_864_] + i_865_) {
				int i_866_ = (i_863_ * ((((Class173_Sub3) this)
							 .anInt9735)
							* 111437289)
					      + i);
				int i_867_ = (((Class173_Sub3) this)
					      .anIntArray9719[i_866_]);
				i_867_ = (((i_867_ & 0xff00) * i_862_ >> 8
					   & 0xff00)
					  + (i_862_ * (i_867_ & 0xff00ff) >> 8
					     & 0xff00ff));
				((Class173_Sub3) this).anIntArray9719[i_866_]
				    = i_867_ + i_850_;
			    }
			}
			i_847_ += i_857_;
		    }
		} else if (2 == i_851_) {
		    for (/**/; i <= i_848_; i++) {
			int i_868_ = i_847_ >> 16;
			int i_869_ = i_868_ - i_853_;
			if (i_868_ >= i_855_ && i_868_ < i_856_) {
			    int i_870_ = i_852_ + is[i_869_];
			    if (i >= i_870_ && i < is_854_[i_869_] + i_870_) {
				int i_871_
				    = i + (i_868_
					   * (((Class173_Sub3) this).anInt9735
					      * 111437289));
				int i_872_ = (((Class173_Sub3) this)
					      .anIntArray9719[i_871_]);
				int i_873_ = i_850_ + i_872_;
				int i_874_ = ((i_872_ & 0xff00ff)
					      + (i_850_ & 0xff00ff));
				i_872_
				    = (i_874_ & 0x1000100) + (i_873_ - i_874_
							      & 0x10000);
				((Class173_Sub3) this).anIntArray9719[i_871_]
				    = i_873_ - i_872_ | i_872_ - (i_872_
								  >>> 8);
			    }
			}
			i_847_ += i_857_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else {
		i <<= 16;
		i += 32768;
		i_848_ <<= 16;
		int i_875_ = (int) Math.floor(0.5 + ((double) i_848_
						     / (double) i_849_));
		i_849_ += i_847_;
		if (i_847_ < i_855_) {
		    i += (i_855_ - i_847_) * i_875_;
		    i_847_ = i_855_;
		}
		if (i_849_ >= i_856_)
		    i_849_ = i_856_ - 1;
		int i_876_ = i_850_ >>> 24;
		if (0 == i_851_ || 1 == i_851_ && 255 == i_876_) {
		    for (/**/; i_847_ <= i_849_; i_847_++) {
			int i_877_ = i >> 16;
			int i_878_ = i_847_ - i_853_;
			int i_879_ = i_852_ + is[i_878_];
			if ((i_877_
			     >= -993497119 * ((Class173_Sub3) this).anInt9723)
			    && (i_877_
				< 630968029 * ((Class173_Sub3) this).anInt9724)
			    && i_877_ >= i_879_
			    && i_877_ < is_854_[i_878_] + i_879_)
			    ((Class173_Sub3) this).anIntArray9719
				[i_877_ + (((Class173_Sub3) this).anInt9735
					   * 111437289 * i_847_)]
				= i_850_;
			i += i_875_;
		    }
		} else if (i_851_ == 1) {
		    i_850_ = ((i_876_ * (i_850_ & 0xff00) >> 8 & 0xff00)
			      + ((i_850_ & 0xff00ff) * i_876_ >> 8 & 0xff00ff)
			      + (i_876_ << 24));
		    int i_880_ = 256 - i_876_;
		    for (/**/; i_847_ <= i_849_; i_847_++) {
			int i_881_ = i >> 16;
			int i_882_ = i_847_ - i_853_;
			int i_883_ = is[i_882_] + i_852_;
			if ((i_881_
			     >= ((Class173_Sub3) this).anInt9723 * -993497119)
			    && (i_881_
				< ((Class173_Sub3) this).anInt9724 * 630968029)
			    && i_881_ >= i_883_
			    && i_881_ < i_883_ + is_854_[i_882_]) {
			    int i_884_
				= (i_881_
				   + i_847_ * (((Class173_Sub3) this).anInt9735
					       * 111437289));
			    int i_885_ = (((Class173_Sub3) this).anIntArray9719
					  [i_884_]);
			    i_885_
				= ((i_880_ * (i_885_ & 0xff00) >> 8 & 0xff00)
				   + ((i_885_ & 0xff00ff) * i_880_ >> 8
				      & 0xff00ff));
			    ((Class173_Sub3) this).anIntArray9719
				[i_881_ + i_847_ * (111437289
						    * (((Class173_Sub3) this)
						       .anInt9735))]
				= i_850_ + i_885_;
			}
			i += i_875_;
		    }
		} else if (i_851_ == 2) {
		    for (/**/; i_847_ <= i_849_; i_847_++) {
			int i_886_ = i >> 16;
			int i_887_ = i_847_ - i_853_;
			int i_888_ = is[i_887_] + i_852_;
			if ((i_886_
			     >= ((Class173_Sub3) this).anInt9723 * -993497119)
			    && (i_886_
				< ((Class173_Sub3) this).anInt9724 * 630968029)
			    && i_886_ >= i_888_
			    && i_886_ < is_854_[i_887_] + i_888_) {
			    int i_889_
				= i_886_ + (((Class173_Sub3) this).anInt9735
					    * 111437289 * i_847_);
			    int i_890_ = (((Class173_Sub3) this).anIntArray9719
					  [i_889_]);
			    int i_891_ = i_890_ + i_850_;
			    int i_892_
				= (i_850_ & 0xff00ff) + (i_890_ & 0xff00ff);
			    i_890_
				= (i_891_ - i_892_ & 0x10000) + (i_892_
								 & 0x1000100);
			    ((Class173_Sub3) this).anIntArray9719[i_889_]
				= i_891_ - i_890_ | i_890_ - (i_890_ >>> 8);
			}
			i += i_875_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public int[] method2473() {
	return null;
    }
    
    public int method2547(int i, int i_893_, int i_894_, int i_895_,
			  int i_896_, int i_897_) {
	int i_898_ = 0;
	float f
	    = ((((Class173_Sub3) this).aClass418_9736.aFloatArray4768[6]
		* (float) i_893_)
	       + ((((Class173_Sub3) this).aClass418_9736.aFloatArray4768[2]
		   * (float) i)
		  + ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[14])
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[10]
		  * (float) i_894_));
	float f_899_
	    = (((float) i_897_
		* ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[10])
	       + ((((Class173_Sub3) this).aClass418_9736.aFloatArray4768[6]
		   * (float) i_896_)
		  + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[14]
		     + (float) i_895_ * (((Class173_Sub3) this).aClass418_9736
					 .aFloatArray4768[2]))));
	float f_900_
	    = (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[15]
	       + ((float) i
		  * ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[3])
	       + ((float) i_893_
		  * ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[7])
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[11]
		  * (float) i_894_));
	float f_901_
	    = (((float) i_897_
		* ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[11])
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[15]
		  + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[3]
		     * (float) i_895_)
		  + (float) i_896_ * (((Class173_Sub3) this).aClass418_9736
				      .aFloatArray4768[7])));
	if (f < -f_900_ && f_899_ < -f_901_)
	    i_898_ |= 0x10;
	else if (f > f_900_ && f_899_ > f_901_)
	    i_898_ |= 0x20;
	float f_902_
	    = ((((Class173_Sub3) this).aClass418_9736.aFloatArray4768[0]
		* (float) i)
	       + ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[12]
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[4]
		  * (float) i_893_)
	       + ((float) i_894_
		  * ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[8]));
	float f_903_
	    = (((float) i_895_
		* ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[0])
	       + ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[12]
	       + ((float) i_896_
		  * ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[4])
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[8]
		  * (float) i_897_));
	if (f_902_ < -f_900_ && f_903_ < -f_901_)
	    i_898_ |= 0x1;
	if (f_902_ > f_900_ && f_903_ > f_901_)
	    i_898_ |= 0x2;
	float f_904_
	    = (((float) i_894_
		* ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[9])
	       + ((((Class173_Sub3) this).aClass418_9736.aFloatArray4768[5]
		   * (float) i_893_)
		  + ((((Class173_Sub3) this).aClass418_9736.aFloatArray4768[1]
		      * (float) i)
		     + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768
			[13]))));
	float f_905_
	    = (((float) i_897_
		* ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[9])
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[13]
		  + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[1]
		     * (float) i_895_)
		  + (float) i_896_ * (((Class173_Sub3) this).aClass418_9736
				      .aFloatArray4768[5])));
	if (f_904_ < -f_900_ && f_905_ < -f_901_)
	    i_898_ |= 0x4;
	if (f_904_ > f_900_ && f_905_ > f_901_)
	    i_898_ |= 0x8;
	return i_898_;
    }
    
    boolean method2367(int i, int i_906_, int i_907_, int i_908_,
		       Class433 class433, Class431 class431) {
	Class418 class418 = method2241();
	class418.method5035(class433);
	class418.method4974(((Class173_Sub3) this).aClass418_9736);
	return class431.method5202(i, i_906_, i_907_, i_908_, class418,
				   ((Class173_Sub3) this).aFloat9743,
				   ((Class173_Sub3) this).aFloat9751,
				   ((Class173_Sub3) this).aFloat9742,
				   ((Class173_Sub3) this).aFloat9744);
    }
    
    public boolean method2201() {
	return false;
    }
    
    public Class528_Sub23 method2228(int i) {
	return null;
    }
    
    boolean method8944(int i) {
	Class160 class160 = aClass165_1984.method2093(i, (byte) -9);
	return 0 != class160.aByte1780 || class160.aByte1781 != 0;
    }
    
    public Class528_Sub23 method2371(int i) {
	return null;
    }
    
    public Class528_Sub23 method2372(int i) {
	return null;
    }
    
    public Class528_Sub23 method2526(int i) {
	return null;
    }
    
    public void method2373(Class528_Sub23 class528_sub23) {
	/* empty */
    }
    
    public void method2374(Class528_Sub23 class528_sub23) {
	/* empty */
    }
    
    public Class151 method2375(int i, int i_909_, boolean bool,
			       boolean bool_910_) {
	if (bool)
	    return new Class151_Sub1_Sub3(this, i, i_909_);
	return new Class151_Sub1_Sub2(this, i, i_909_);
    }
    
    boolean method8945() {
	return ((Class173_Sub3) this).aBool9721;
    }
    
    public Class151 method2153(int i, int i_911_, boolean bool,
			       boolean bool_912_) {
	if (bool)
	    return new Class151_Sub1_Sub3(this, i, i_911_);
	return new Class151_Sub1_Sub2(this, i, i_911_);
    }
    
    public Class151 method2190(int[] is, int i, int i_913_, int i_914_,
			       int i_915_, boolean bool) {
	boolean bool_916_ = false;
	int i_917_ = i;
    while_2_:
	for (int i_918_ = 0; i_918_ < i_915_; i_918_++) {
	    for (int i_919_ = 0; i_919_ < i_914_; i_919_++) {
		int i_920_ = is[i_917_++] >>> 24;
		if (0 != i_920_ && 255 != i_920_) {
		    bool_916_ = true;
		    break while_2_;
		}
	    }
	}
	if (bool_916_)
	    return new Class151_Sub1_Sub3(this, is, i, i_913_, i_914_, i_915_,
					  bool);
	return new Class151_Sub1_Sub2(this, is, i, i_913_, i_914_, i_915_,
				      bool);
    }
    
    public Class151 method2379(int[] is, int i, int i_921_, int i_922_,
			       int i_923_, boolean bool) {
	boolean bool_924_ = false;
	int i_925_ = i;
    while_3_:
	for (int i_926_ = 0; i_926_ < i_923_; i_926_++) {
	    for (int i_927_ = 0; i_927_ < i_922_; i_927_++) {
		int i_928_ = is[i_925_++] >>> 24;
		if (0 != i_928_ && 255 != i_928_) {
		    bool_924_ = true;
		    break while_3_;
		}
	    }
	}
	if (bool_924_)
	    return new Class151_Sub1_Sub3(this, is, i, i_921_, i_922_, i_923_,
					  bool);
	return new Class151_Sub1_Sub2(this, is, i, i_921_, i_922_, i_923_,
				      bool);
    }
    
    public Interface21 method2548(int i, int i_929_, int i_930_) {
	return new Class112(i, i_929_);
    }
    
    public void method2465(Class433 class433) {
	((Class173_Sub3) this).aClass433_9733 = class433;
	method8943();
    }
    
    public Class151 method2454(Class178 class178, boolean bool) {
	int i = class178.method2601();
	int i_931_ = class178.method2602();
	Class151_Sub1 class151_sub1;
	if (bool && !class178.method2600() && class178.method2599()) {
	    Class178_Sub2 class178_sub2 = (Class178_Sub2) class178;
	    int[] is = new int[class178_sub2.anIntArray9769.length];
	    byte[] is_932_ = new byte[i * i_931_];
	    for (int i_933_ = 0; i_933_ < i_931_; i_933_++) {
		int i_934_ = i * i_933_;
		for (int i_935_ = 0; i_935_ < i; i_935_++)
		    is_932_[i_934_ + i_935_]
			= class178_sub2.aByteArray9770[i_935_ + i_934_];
	    }
	    for (int i_936_ = 0; i_936_ < class178_sub2.anIntArray9769.length;
		 i_936_++)
		is[i_936_] = class178_sub2.anIntArray9769[i_936_];
	    class151_sub1
		= new Class151_Sub1_Sub1(this, is_932_, is, i, i_931_);
	} else {
	    int[] is = class178.method2629(false);
	    if (class178.method2600())
		class151_sub1 = new Class151_Sub1_Sub3(this, is, i, i_931_);
	    else
		class151_sub1 = new Class151_Sub1_Sub2(this, is, i, i_931_);
	}
	class151_sub1.method1801(class178.method2603(), class178.method2605(),
				 class178.method2604(), class178.method2606());
	return class151_sub1;
    }
    
    public Class151 method2383(int i, int i_937_, int i_938_, int i_939_,
			       boolean bool) {
	if (null == ((Class173_Sub3) this).anIntArray9719)
	    throw new IllegalStateException("");
	int[] is = new int[i_938_ * i_939_];
	int i_940_
	    = i_937_ * (111437289 * ((Class173_Sub3) this).anInt9735) + i;
	int i_941_ = ((Class173_Sub3) this).anInt9735 * 111437289 - i_938_;
	for (int i_942_ = 0; i_942_ < i_939_; i_942_++) {
	    int i_943_ = i_938_ * i_942_;
	    for (int i_944_ = 0; i_944_ < i_938_; i_944_++)
		is[i_944_ + i_943_]
		    = ((Class173_Sub3) this).anIntArray9719[i_940_++];
	    i_940_ += i_941_;
	}
	if (bool)
	    return new Class151_Sub1_Sub3(this, is, i_938_, i_939_);
	return new Class151_Sub1_Sub2(this, is, i_938_, i_939_);
    }
    
    public int[] method2311(int i, int i_945_, int i_946_, int i_947_) {
	if (null == ((Class173_Sub3) this).anIntArray9719)
	    throw new IllegalStateException("");
	int[] is = new int[i_947_ * i_946_];
	int i_948_ = 0;
	for (int i_949_ = 0; i_949_ < i_947_; i_949_++) {
	    int i_950_
		= (111437289 * ((Class173_Sub3) this).anInt9735 * (i_949_
								   + i_945_)
		   + i);
	    for (int i_951_ = 0; i_951_ < i_946_; i_951_++)
		is[i_948_++]
		    = ((Class173_Sub3) this).anIntArray9719[i_951_ + i_950_];
	}
	return is;
    }
    
    public int method2185() {
	return 0;
    }
    
    public Class151 method2386(int i, int i_952_, int i_953_, int i_954_,
			       boolean bool) {
	if (null == ((Class173_Sub3) this).anIntArray9719)
	    throw new IllegalStateException("");
	int[] is = new int[i_953_ * i_954_];
	int i_955_
	    = i_952_ * (111437289 * ((Class173_Sub3) this).anInt9735) + i;
	int i_956_ = ((Class173_Sub3) this).anInt9735 * 111437289 - i_953_;
	for (int i_957_ = 0; i_957_ < i_954_; i_957_++) {
	    int i_958_ = i_953_ * i_957_;
	    for (int i_959_ = 0; i_959_ < i_953_; i_959_++)
		is[i_959_ + i_958_]
		    = ((Class173_Sub3) this).anIntArray9719[i_955_++];
	    i_955_ += i_956_;
	}
	if (bool)
	    return new Class151_Sub1_Sub3(this, is, i_953_, i_954_);
	return new Class151_Sub1_Sub2(this, is, i_953_, i_954_);
    }
    
    public Class163_Sub1 method2540() {
	return new Class163_Sub1_Sub2(this);
    }
    
    public void method2486(int i, Class148 class148, int i_960_, int i_961_) {
	if (null != ((Class173_Sub3) this).anIntArray9719) {
	    Class148_Sub1 class148_sub1 = (Class148_Sub1) class148;
	    int[] is = ((Class148_Sub1) class148_sub1).anIntArray8789;
	    int[] is_962_ = ((Class148_Sub1) class148_sub1).anIntArray8788;
	    int i_963_;
	    if (((Class173_Sub3) this).anInt9726 * 6965409
		< is.length + i_961_)
		i_963_ = 6965409 * ((Class173_Sub3) this).anInt9726 - i_961_;
	    else
		i_963_ = is.length;
	    int i_964_;
	    if (592117349 * ((Class173_Sub3) this).anInt9725 > i_961_) {
		i_964_ = 592117349 * ((Class173_Sub3) this).anInt9725 - i_961_;
		i_961_ = ((Class173_Sub3) this).anInt9725 * 592117349;
	    } else
		i_964_ = 0;
	    if (i_963_ - i_964_ > 0) {
		int i_965_
		    = i_961_ * (111437289 * ((Class173_Sub3) this).anInt9735);
		for (int i_966_ = i_964_; i_966_ < i_963_; i_966_++) {
		    int i_967_ = is[i_966_] + i_960_;
		    int i_968_ = is_962_[i_966_];
		    if (((Class173_Sub3) this).anInt9723 * -993497119
			> i_967_) {
			i_968_
			    -= (-993497119 * ((Class173_Sub3) this).anInt9723
				- i_967_);
			i_967_ = -993497119 * ((Class173_Sub3) this).anInt9723;
		    }
		    if (630968029 * ((Class173_Sub3) this).anInt9724
			< i_967_ + i_968_)
			i_968_ = (630968029 * ((Class173_Sub3) this).anInt9724
				  - i_967_);
		    i_967_ += i_965_;
		    for (int i_969_ = -i_968_; i_969_ < 0; i_969_++)
			((Class173_Sub3) this).anIntArray9719[i_967_++] = i;
		    i_965_ += ((Class173_Sub3) this).anInt9735 * 111437289;
		}
	    }
	}
    }
    
    public Class172 method2388(Class1 class1, Class178[] class178s,
			       boolean bool) {
	int[] is = new int[class178s.length];
	int[] is_970_ = new int[class178s.length];
	boolean bool_971_ = false;
	boolean bool_972_ = false;
	for (int i = 0; i < class178s.length; i++) {
	    is[i] = class178s[i].method2601();
	    is_970_[i] = class178s[i].method2602();
	    if (class178s[i].method2600())
		bool_971_ = true;
	    if (class178s[i].method2599())
		bool_972_ = true;
	}
	if (bool) {
	    if (bool_972_) {
		if (bool_971_)
		    return new Class172_Sub3(this, class1,
					     (Class178_Sub2[]) class178s, is,
					     is_970_);
		return new Class172_Sub1(this, class1,
					 (Class178_Sub2[]) class178s, is,
					 is_970_);
	    }
	    if (bool_971_)
		return new Class172_Sub3(this, class1,
					 (Class178_Sub1[]) class178s, is,
					 is_970_);
	    return new Class172_Sub1(this, class1, (Class178_Sub1[]) class178s,
				     is, is_970_);
	}
	if (bool_972_) {
	    if (bool_971_)
		throw new IllegalArgumentException("");
	    return new Class172_Sub2(this, class1, (Class178_Sub2[]) class178s,
				     is, is_970_);
	}
	return new Class172_Sub6(this, class1, (Class178_Sub1[]) class178s, is,
				 is_970_);
    }
    
    public void method2542(int i) {
	Class157_Sub2.anInt9138 = Class157_Sub2.anInt9124 = i;
	if (-1585405167 * ((Class173_Sub3) this).anInt9745 > 1)
	    throw new IllegalStateException();
	method8938(-1585405167 * ((Class173_Sub3) this).anInt9745);
	method8937(0);
    }
    
    public int method2390(int i, int i_973_) {
	i |= 0x20800;
	return i & i_973_ ^ i_973_;
    }
    
    public int method2391(int i, int i_974_) {
	i |= 0x20800;
	return i & i_974_ ^ i_974_;
    }
    
    public int method2392(int i, int i_975_) {
	i |= 0x20800;
	return i & i_975_ ^ i_975_;
    }
    
    public int method2393(int i, int i_976_) {
	i |= 0x20800;
	return i & i_976_ ^ i_976_;
    }
    
    public int method2394(int i, int i_977_) {
	i |= 0x20800;
	return i & i_977_ ^ i_977_;
    }
    
    public int method2401(int i, int i_978_) {
	i |= 0x20800;
	return i & i_978_ ^ i_978_;
    }
    
    public boolean method2458() {
	return false;
    }
    
    public int method2397(int i, int i_979_) {
	return i | i_979_;
    }
    
    public Class137 method2398(int i, int i_980_, int[][] is, int[][] is_981_,
			       int i_982_, int i_983_, int i_984_) {
	return new Class137_Sub1(this, i_983_, i_984_, i, i_980_, is, is_981_,
				 i_982_);
    }
    
    public void method2429(int i) {
	/* empty */
    }
    
    public Class418 method2399() {
	Class107 class107 = method8939(Thread.currentThread());
	return ((Class107) class107).aClass418_1336;
    }
    
    public Class418 method2545() {
	Class107 class107 = method8939(Thread.currentThread());
	return ((Class107) class107).aClass418_1336;
    }
    
    public Class433 method2151() {
	Class107 class107 = method8939(Thread.currentThread());
	return ((Class107) class107).aClass433_1346;
    }
    
    public Class433 method2402() {
	Class107 class107 = method8939(Thread.currentThread());
	return ((Class107) class107).aClass433_1346;
    }
    
    public void method2354(int i, int i_985_, int i_986_, int i_987_,
			   int i_988_, int i_989_) {
	method2218(i, i_985_, i_986_, i_988_, i_989_);
	method2218(i, i_987_ + i_985_ - 1, i_986_, i_988_, i_989_);
	method2395(i, 1 + i_985_, i_987_ - 2, i_988_, i_989_);
	method2395(i + i_986_ - 1, 1 + i_985_, i_987_ - 2, i_988_, i_989_);
    }
    
    public int method2378() {
	return 0;
    }
    
    public int method2171() {
	return 0;
    }
    
    public void method2517() {
	for (int i = 0; i < ((Class173_Sub3) this).aClass107Array9731.length;
	     i++) {
	    ((Class107) ((Class173_Sub3) this).aClass107Array9731[i]).anInt1342
		= (-1052647419
		   * (((Class107) ((Class173_Sub3) this).aClass107Array9731[i])
		      .anInt1355));
	    ((Class107) ((Class173_Sub3) this).aClass107Array9731[i]).aBool1324
		= false;
	}
    }
    
    public int method2406() {
	return 0;
    }
    
    public void method2472(int i, int i_990_, float f, int i_991_, int i_992_,
			   float f_993_, int i_994_, int i_995_, float f_996_,
			   int i_997_, int i_998_, int i_999_, int i_1000_) {
	boolean bool = ((Class173_Sub3) this).anIntArray9719 != null;
	boolean bool_1001_ = ((Class173_Sub3) this).aFloatArray9716 != null;
	if (bool || bool_1001_) {
	    Class107 class107 = method8939(Thread.currentThread());
	    Class121 class121 = ((Class107) class107).aClass121_1330;
	    ((Class121) class121).aBool1501 = false;
	    i -= -993497119 * ((Class173_Sub3) this).anInt9723;
	    i_991_ -= -993497119 * ((Class173_Sub3) this).anInt9723;
	    i_994_ -= -993497119 * ((Class173_Sub3) this).anInt9723;
	    i_990_ -= 592117349 * ((Class173_Sub3) this).anInt9725;
	    i_992_ -= ((Class173_Sub3) this).anInt9725 * 592117349;
	    i_995_ -= ((Class173_Sub3) this).anInt9725 * 592117349;
	    ((Class121) class121).aBool1504
		= (i < 0 || i > ((Class121) class121).anInt1513 || i_991_ < 0
		   || i_991_ > ((Class121) class121).anInt1513 || i_994_ < 0
		   || i_994_ > ((Class121) class121).anInt1513);
	    int i_1002_ = i_997_ >>> 24;
	    if (i_1000_ == 0 || i_1000_ == 1 && 255 == i_1002_) {
		((Class121) class121).anInt1526 = 0;
		((Class121) class121).aBool1502 = false;
		class121.method1580(bool, bool_1001_, false, (float) i_990_,
				    (float) i_992_, (float) i_995_, (float) i,
				    (float) i_991_, (float) i_994_, f, f_993_,
				    f_996_, i_997_, i_998_, i_999_);
	    } else if (1 == i_1000_) {
		((Class121) class121).anInt1526 = 255 - i_1002_;
		((Class121) class121).aBool1502 = false;
		class121.method1580(bool, bool_1001_, false, (float) i_990_,
				    (float) i_992_, (float) i_995_, (float) i,
				    (float) i_991_, (float) i_994_, f, f_993_,
				    f_996_, i_997_, i_998_, i_999_);
	    } else if (i_1000_ == 2) {
		((Class121) class121).anInt1526 = 128;
		((Class121) class121).aBool1502 = true;
		class121.method1580(bool, bool_1001_, false, (float) i_990_,
				    (float) i_992_, (float) i_995_, (float) i,
				    (float) i_991_, (float) i_994_, f, f_993_,
				    f_996_, i_997_, i_998_, i_999_);
	    } else
		throw new IllegalArgumentException();
	    ((Class121) class121).aBool1501 = true;
	}
    }
    
    public Class528_Sub12 method2408(int i, int i_1003_, int i_1004_,
				     int i_1005_, int i_1006_, float f) {
	return null;
    }
    
    public Class528_Sub12 method2538(int i, int i_1007_, int i_1008_,
				     int i_1009_, int i_1010_, float f) {
	return null;
    }
    
    public void method2233(int i, Class528_Sub12[] class528_sub12s) {
	/* empty */
    }
    
    public void method2196(int i, int i_1011_, int[] is, int[] is_1012_) {
	method2197(i, i_1011_, (byte) 1);
	if (((Class173_Sub3) this).aClass151_9753 == null
	    || ((Class173_Sub3) this).aClass151_9753.method1766() != i
	    || ((Class173_Sub3) this).aClass151_9753.method1767() != i_1011_) {
	    ((Class173_Sub3) this).aClass151_9753
		= method2191(i, i_1011_, true, true);
	    ((Class173_Sub3) this).aClass163_Sub1_9730 = null;
	}
	if (((Class173_Sub3) this).aClass163_Sub1_9730 == null) {
	    ((Class173_Sub3) this).aClass163_Sub1_9730 = method2236();
	    ((Class173_Sub3) this).aClass163_Sub1_9730.method8898
		(0, ((Class173_Sub3) this).aClass151_9753.method1769());
	}
	Class151_Sub1_Sub3 class151_sub1_sub3
	    = new Class151_Sub1_Sub3(this,
				     ((Class173_Sub3) this).anIntArray9719,
				     (((Class173_Sub3) this).anInt9735
				      * 111437289),
				     (434033557
				      * ((Class173_Sub3) this).anInt9748));
	method2179(((Class173_Sub3) this).aClass163_Sub1_9730, -1578017239);
	method2268(1, -16777216);
	class151_sub1_sub3.method1777(anInt2002 * 1354853215,
				      anInt2007 * -2074272721,
				      anInt2006 * 857980141,
				      -649725419 * anInt1990, 1, 0, 0, 0);
	((Class173_Sub3) this).aClass151_9753.method1771(0, 0, i, i_1011_, is,
							 is_1012_, 0, i);
	method2180(((Class173_Sub3) this).aClass163_Sub1_9730, -27808419);
    }
    
    Interface19 method8946(int i, int i_1013_) {
	return new Class106(i, i_1013_);
    }
    
    void method8947(int i) {
	((Class173_Sub3) this).anInt9745 = i * -462115343;
	((Class173_Sub3) this).aClass107Array9731
	    = new Class107[((Class173_Sub3) this).anInt9745 * -1585405167];
	for (int i_1014_ = 0;
	     i_1014_ < -1585405167 * ((Class173_Sub3) this).anInt9745;
	     i_1014_++)
	    ((Class173_Sub3) this).aClass107Array9731[i_1014_]
		= new Class107(this);
    }
    
    public void method2331(int i, int i_1015_, int[] is, int[] is_1016_) {
	method2197(i, i_1015_, (byte) 1);
	if (((Class173_Sub3) this).aClass151_9753 == null
	    || ((Class173_Sub3) this).aClass151_9753.method1766() != i
	    || ((Class173_Sub3) this).aClass151_9753.method1767() != i_1015_) {
	    ((Class173_Sub3) this).aClass151_9753
		= method2191(i, i_1015_, true, true);
	    ((Class173_Sub3) this).aClass163_Sub1_9730 = null;
	}
	if (((Class173_Sub3) this).aClass163_Sub1_9730 == null) {
	    ((Class173_Sub3) this).aClass163_Sub1_9730 = method2236();
	    ((Class173_Sub3) this).aClass163_Sub1_9730.method8898
		(0, ((Class173_Sub3) this).aClass151_9753.method1769());
	}
	Class151_Sub1_Sub3 class151_sub1_sub3
	    = new Class151_Sub1_Sub3(this,
				     ((Class173_Sub3) this).anIntArray9719,
				     (((Class173_Sub3) this).anInt9735
				      * 111437289),
				     (434033557
				      * ((Class173_Sub3) this).anInt9748));
	method2179(((Class173_Sub3) this).aClass163_Sub1_9730, -1193270486);
	method2268(1, -16777216);
	class151_sub1_sub3.method1777(anInt2002 * 1354853215,
				      anInt2007 * -2074272721,
				      anInt2006 * 857980141,
				      -649725419 * anInt1990, 1, 0, 0, 0);
	((Class173_Sub3) this).aClass151_9753.method1771(0, 0, i, i_1015_, is,
							 is_1016_, 0, i);
	method2180(((Class173_Sub3) this).aClass163_Sub1_9730, 1033976128);
    }
    
    public void method2474() {
	/* empty */
    }
    
    public void method2413(Class171 class171) {
	method8940(((Class173_Sub3) this).anIntArray9719 != null,
		   null != ((Class173_Sub3) this).aFloatArray9716, false,
		   class171);
    }
    
    public void method2284() {
	/* empty */
    }
    
    public void method2500() {
	/* empty */
    }
    
    public boolean method2317() {
	return false;
    }
    
    public int method2211() {
	return 0;
    }
    
    public boolean method2189() {
	return false;
    }
    
    public Class157 method2513(Class177 class177, int i, int i_1017_,
			       int i_1018_, int i_1019_) {
	return new Class157_Sub2(this, class177, i, i_1018_, i_1019_, i_1017_);
    }
    
    public void method2306(Class433 class433) {
	((Class173_Sub3) this).aClass433_9733 = class433;
	method8943();
    }
    
    public Class433 method2415() {
	return new Class433(((Class173_Sub3) this).aClass433_9733);
    }
    
    public void method2325(int i, int i_1020_) {
	if ((i & 0x1) != 0)
	    method2216(0, 0, ((Class173_Sub3) this).anInt9735 * 111437289,
		       434033557 * ((Class173_Sub3) this).anInt9748, i_1020_,
		       0);
	if (0 != (i & 0x2))
	    method8932();
    }
    
    public Class433 method2417() {
	return new Class433(((Class173_Sub3) this).aClass433_9733);
    }
    
    public Class433 method2487() {
	return new Class433(((Class173_Sub3) this).aClass433_9733);
    }
    
    public void method2530(float f, float f_1021_, float f_1022_, float[] fs) {
	float f_1023_
	    = ((f_1021_
		* ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[7])
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[15]
		  + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[3]
		     * f))
	       + f_1022_ * (((Class173_Sub3) this).aClass418_9736
			    .aFloatArray4768[11]));
	float f_1024_
	    = (f * ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[0]
	       + ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[12]
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[4]
		  * f_1021_)
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[8]
		  * f_1022_));
	float f_1025_
	    = ((((Class173_Sub3) this).aClass418_9736.aFloatArray4768[9]
		* f_1022_)
	       + ((f_1021_
		   * ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[5])
		  + ((((Class173_Sub3) this).aClass418_9736.aFloatArray4768[1]
		      * f)
		     + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768
			[13]))));
	float f_1026_
	    = ((((Class173_Sub3) this).aClass418_9734.aFloatArray4768[10]
		* f_1022_)
	       + (f * ((Class173_Sub3) this).aClass418_9734.aFloatArray4768[2]
		  + ((Class173_Sub3) this).aClass418_9734.aFloatArray4768[14]
		  + (((Class173_Sub3) this).aClass418_9734.aFloatArray4768[6]
		     * f_1021_)));
	fs[0] = (((Class173_Sub3) this).aFloat9743
		 + f_1024_ * ((Class173_Sub3) this).aFloat9742 / f_1023_);
	fs[1] = (((Class173_Sub3) this).aFloat9751
		 + ((Class173_Sub3) this).aFloat9744 * f_1025_ / f_1023_);
	fs[2] = f_1026_;
    }
    
    public Class433 method2420() {
	return new Class433(((Class173_Sub3) this).aClass433_9733);
    }
    
    public void method2421(Class418 class418) {
	((Class173_Sub3) this).aClass418_9722.method4986(class418);
	method8943();
    }
    
    public void method2422(Class418 class418) {
	((Class173_Sub3) this).aClass418_9722.method4986(class418);
	method8943();
    }
    
    public Class418 method2423() {
	return new Class418(((Class173_Sub3) this).aClass418_9722);
    }
    
    public Class418 method2424() {
	return new Class418(((Class173_Sub3) this).aClass418_9722);
    }
    
    public Class418 method2425() {
	return new Class418(((Class173_Sub3) this).aClass418_9722);
    }
    
    public void method2212(float f, float f_1027_) {
	((Class173_Sub3) this).aFloat9746 = f_1027_ - f;
	((Class173_Sub3) this).aFloat9747 = f_1027_ + f - 1.0F;
	for (int i = 0; i < ((Class173_Sub3) this).anInt9745 * -1585405167;
	     i++) {
	    Class107 class107 = ((Class173_Sub3) this).aClass107Array9731[i];
	    Class121 class121 = ((Class107) class107).aClass121_1330;
	    ((Class121) class121).aFloat1503
		= ((Class173_Sub3) this).aFloat9746;
	    ((Class121) class121).aFloat1511
		= ((Class173_Sub3) this).aFloat9747;
	}
    }
    
    public void method2524(int i) {
	/* empty */
    }
    
    public void method2428(int i) {
	/* empty */
    }
    
    public boolean method2361() {
	return false;
    }
    
    public void method2430(int i, int i_1028_, int i_1029_) {
	for (int i_1030_ = 0;
	     i_1030_ < ((Class173_Sub3) this).aClass107Array9731.length;
	     i_1030_++) {
	    Class107 class107
		= ((Class173_Sub3) this).aClass107Array9731[i_1030_];
	    ((Class107) class107).anInt1342 = (i & 0xffffff) * -1114118045;
	    int i_1031_
		= ((Class107) class107).anInt1342 * -1050551989 >>> 16 & 0xff;
	    if (i_1031_ < 2)
		i_1031_ = 2;
	    int i_1032_
		= ((Class107) class107).anInt1342 * -1050551989 >> 8 & 0xff;
	    if (i_1032_ < 2)
		i_1032_ = 2;
	    int i_1033_ = ((Class107) class107).anInt1342 * -1050551989 & 0xff;
	    if (i_1033_ < 2)
		i_1033_ = 2;
	    ((Class107) class107).anInt1342
		= -1114118045 * (i_1031_ << 16 | i_1032_ << 8 | i_1033_);
	    if (i_1028_ < 0)
		((Class107) class107).aBool1327 = false;
	    else
		((Class107) class107).aBool1327 = true;
	}
    }
    
    public void method2523(int i, int i_1034_, int i_1035_) {
	for (int i_1036_ = 0;
	     i_1036_ < ((Class173_Sub3) this).aClass107Array9731.length;
	     i_1036_++) {
	    Class107 class107
		= ((Class173_Sub3) this).aClass107Array9731[i_1036_];
	    ((Class107) class107).anInt1342 = (i & 0xffffff) * -1114118045;
	    int i_1037_
		= ((Class107) class107).anInt1342 * -1050551989 >>> 16 & 0xff;
	    if (i_1037_ < 2)
		i_1037_ = 2;
	    int i_1038_
		= ((Class107) class107).anInt1342 * -1050551989 >> 8 & 0xff;
	    if (i_1038_ < 2)
		i_1038_ = 2;
	    int i_1039_ = ((Class107) class107).anInt1342 * -1050551989 & 0xff;
	    if (i_1039_ < 2)
		i_1039_ = 2;
	    ((Class107) class107).anInt1342
		= -1114118045 * (i_1037_ << 16 | i_1038_ << 8 | i_1039_);
	    if (i_1034_ < 0)
		((Class107) class107).aBool1327 = false;
	    else
		((Class107) class107).aBool1327 = true;
	}
    }
    
    void method8948() {
	((Class173_Sub3) this).aClass418_9734
	    .method5035(((Class173_Sub3) this).aClass433_9733);
	((Class173_Sub3) this).aClass418_9736
	    .method4986(((Class173_Sub3) this).aClass418_9734);
	((Class173_Sub3) this).aClass418_9736
	    .method4974(((Class173_Sub3) this).aClass418_9722);
	((Class173_Sub3) this).aClass418_9736
	    .method4991(((Class173_Sub3) this).aFloatArrayArray9737[0]);
	((Class173_Sub3) this).aClass418_9736
	    .method4992(((Class173_Sub3) this).aFloatArrayArray9737[1]);
	((Class173_Sub3) this).aClass418_9736
	    .method4987(((Class173_Sub3) this).aFloatArrayArray9737[2]);
	((Class173_Sub3) this).aClass418_9736
	    .method4988(((Class173_Sub3) this).aFloatArrayArray9737[3]);
	((Class173_Sub3) this).aClass418_9736
	    .method4989(((Class173_Sub3) this).aFloatArrayArray9737[4]);
	((Class173_Sub3) this).aClass418_9736
	    .method4990(((Class173_Sub3) this).aFloatArrayArray9737[5]);
	float f = ((Class173_Sub3) this).aClass418_9722.method4978();
	float f_1040_
	    = (((f - 255.0F)
		* ((Class173_Sub3) this).aClass418_9722.aFloatArray4768[10])
	       + ((Class173_Sub3) this).aClass418_9722.aFloatArray4768[14]);
	float f_1041_
	    = (((Class173_Sub3) this).aClass418_9722.aFloatArray4768[14]
	       + (((Class173_Sub3) this).aClass418_9722.aFloatArray4768[10]
		  * f));
	float f_1042_ = f_1041_ - f_1040_;
	for (int i = 0; i < -1585405167 * ((Class173_Sub3) this).anInt9745;
	     i++) {
	    Class107 class107 = ((Class173_Sub3) this).aClass107Array9731[i];
	    ((Class107) class107).aFloat1320 = f_1040_;
	    ((Class107) class107).aFloat1321 = f_1042_;
	}
    }
    
    public void method2352(long l) {
	/* empty */
    }
    
    void method8949() {
	((Class173_Sub3) this).aClass418_9734
	    .method5035(((Class173_Sub3) this).aClass433_9733);
	((Class173_Sub3) this).aClass418_9736
	    .method4986(((Class173_Sub3) this).aClass418_9734);
	((Class173_Sub3) this).aClass418_9736
	    .method4974(((Class173_Sub3) this).aClass418_9722);
	((Class173_Sub3) this).aClass418_9736
	    .method4991(((Class173_Sub3) this).aFloatArrayArray9737[0]);
	((Class173_Sub3) this).aClass418_9736
	    .method4992(((Class173_Sub3) this).aFloatArrayArray9737[1]);
	((Class173_Sub3) this).aClass418_9736
	    .method4987(((Class173_Sub3) this).aFloatArrayArray9737[2]);
	((Class173_Sub3) this).aClass418_9736
	    .method4988(((Class173_Sub3) this).aFloatArrayArray9737[3]);
	((Class173_Sub3) this).aClass418_9736
	    .method4989(((Class173_Sub3) this).aFloatArrayArray9737[4]);
	((Class173_Sub3) this).aClass418_9736
	    .method4990(((Class173_Sub3) this).aFloatArrayArray9737[5]);
	float f = ((Class173_Sub3) this).aClass418_9722.method4978();
	float f_1043_
	    = (((f - 255.0F)
		* ((Class173_Sub3) this).aClass418_9722.aFloatArray4768[10])
	       + ((Class173_Sub3) this).aClass418_9722.aFloatArray4768[14]);
	float f_1044_
	    = (((Class173_Sub3) this).aClass418_9722.aFloatArray4768[14]
	       + (((Class173_Sub3) this).aClass418_9722.aFloatArray4768[10]
		  * f));
	float f_1045_ = f_1044_ - f_1043_;
	for (int i = 0; i < -1585405167 * ((Class173_Sub3) this).anInt9745;
	     i++) {
	    Class107 class107 = ((Class173_Sub3) this).aClass107Array9731[i];
	    ((Class107) class107).aFloat1320 = f_1043_;
	    ((Class107) class107).aFloat1321 = f_1045_;
	}
    }
    
    public Class168 method2247(int i) {
	return null;
    }
    
    public Class168 method2433(Class168 class168, Class168 class168_1046_,
			       float f, Class168 class168_1047_) {
	return null;
    }
    
    public Class168 method2434(Class168 class168, Class168 class168_1048_,
			       float f, Class168 class168_1049_) {
	return null;
    }
    
    public Class168 method2410(Class168 class168, Class168 class168_1050_,
			       float f, Class168 class168_1051_) {
	return null;
    }
    
    public Class168 method2436(Class168 class168, Class168 class168_1052_,
			       float f, Class168 class168_1053_) {
	return null;
    }
    
    public void method2533(Class168 class168) {
	/* empty */
    }
    
    public void method2438(Class168 class168) {
	/* empty */
    }
    
    public void method2439(Class168 class168) {
	/* empty */
    }
    
    public void method2440(Class168 class168) {
	/* empty */
    }
    
    public void method2441(int i, int i_1054_, int i_1055_, int i_1056_) {
	/* empty */
    }
    
    public void method2442(int i, int i_1057_, int i_1058_, int i_1059_) {
	/* empty */
    }
    
    public void method2278() {
	((Class173_Sub3) this).aClass163_Sub1_9730 = null;
	((Class173_Sub3) this).aClass151_9753 = null;
    }
    
    public void method2444(int i, int i_1060_) {
	/* empty */
    }
    
    public boolean method2445() {
	return false;
    }
    
    public void method2475(float f, float f_1061_, float f_1062_, float[] fs) {
	float f_1063_
	    = ((f_1061_
		* ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[7])
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[15]
		  + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[3]
		     * f))
	       + f_1062_ * (((Class173_Sub3) this).aClass418_9736
			    .aFloatArray4768[11]));
	float f_1064_
	    = (f * ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[0]
	       + ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[12]
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[4]
		  * f_1061_)
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[8]
		  * f_1062_));
	float f_1065_
	    = ((((Class173_Sub3) this).aClass418_9736.aFloatArray4768[9]
		* f_1062_)
	       + ((f_1061_
		   * ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[5])
		  + ((((Class173_Sub3) this).aClass418_9736.aFloatArray4768[1]
		      * f)
		     + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768
			[13]))));
	float f_1066_
	    = ((((Class173_Sub3) this).aClass418_9734.aFloatArray4768[10]
		* f_1062_)
	       + (f * ((Class173_Sub3) this).aClass418_9734.aFloatArray4768[2]
		  + ((Class173_Sub3) this).aClass418_9734.aFloatArray4768[14]
		  + (((Class173_Sub3) this).aClass418_9734.aFloatArray4768[6]
		     * f_1061_)));
	fs[0] = (((Class173_Sub3) this).aFloat9743
		 + f_1064_ * ((Class173_Sub3) this).aFloat9742 / f_1063_);
	fs[1] = (((Class173_Sub3) this).aFloat9751
		 + ((Class173_Sub3) this).aFloat9744 * f_1065_ / f_1063_);
	fs[2] = f_1066_;
    }
    
    public boolean method2447() {
	return false;
    }
    
    public boolean method2448() {
	return false;
    }
    
    public void method2449(float f, float f_1067_, float f_1068_,
			   float f_1069_, float f_1070_) {
	/* empty */
    }
    
    public boolean method2453() {
	return false;
    }
    
    public Class162 method2451(int[] is) {
	return null;
    }
    
    public Class162 method2452(int[] is) {
	return null;
    }
    
    int method8950(int i) {
	return aClass165_1984.method2093(i, (byte) -92).anInt1774 * -726179659;
    }
    
    public boolean method2521() {
	return false;
    }
    
    public void method2181(Class162 class162, float f, Class162 class162_1071_,
			   float f_1072_, Class162 class162_1073_,
			   float f_1074_) {
	/* empty */
    }
    
    public void method2455(Class162 class162, float f, Class162 class162_1075_,
			   float f_1076_, Class162 class162_1077_,
			   float f_1078_) {
	/* empty */
    }
    
    public void method2456(Class162 class162, float f, Class162 class162_1079_,
			   float f_1080_, Class162 class162_1081_,
			   float f_1082_) {
	/* empty */
    }
    
    public boolean method2457() {
	return false;
    }
    
    public Class151 method2173(int i, int i_1083_, int i_1084_, int i_1085_,
			       boolean bool) {
	if (null == ((Class173_Sub3) this).anIntArray9719)
	    throw new IllegalStateException("");
	int[] is = new int[i_1084_ * i_1085_];
	int i_1086_
	    = i_1083_ * (111437289 * ((Class173_Sub3) this).anInt9735) + i;
	int i_1087_ = ((Class173_Sub3) this).anInt9735 * 111437289 - i_1084_;
	for (int i_1088_ = 0; i_1088_ < i_1085_; i_1088_++) {
	    int i_1089_ = i_1084_ * i_1088_;
	    for (int i_1090_ = 0; i_1090_ < i_1084_; i_1090_++)
		is[i_1090_ + i_1089_]
		    = ((Class173_Sub3) this).anIntArray9719[i_1086_++];
	    i_1086_ += i_1087_;
	}
	if (bool)
	    return new Class151_Sub1_Sub3(this, is, i_1084_, i_1085_);
	return new Class151_Sub1_Sub2(this, is, i_1084_, i_1085_);
    }
    
    public void method2459() {
	/* empty */
    }
    
    public String method2536() {
	return "";
    }
    
    public void method2462() {
	/* empty */
    }
    
    public void method2363(int i, int i_1091_, int i_1092_, int i_1093_,
			   int i_1094_, int i_1095_) {
	if (((Class173_Sub3) this).anIntArray9719 != null) {
	    i_1092_ -= i;
	    i_1093_ -= i_1091_;
	    if (0 == i_1093_) {
		if (i_1092_ >= 0)
		    method2218(i, i_1091_, i_1092_ + 1, i_1094_, i_1095_);
		else
		    method2218(i + i_1092_, i_1091_, -i_1092_ + 1, i_1094_,
			       i_1095_);
	    } else if (i_1092_ == 0) {
		if (i_1093_ >= 0)
		    method2395(i, i_1091_, i_1093_ + 1, i_1094_, i_1095_);
		else
		    method2395(i, i_1093_ + i_1091_, -i_1093_ + 1, i_1094_,
			       i_1095_);
	    } else {
		if (i_1093_ + i_1092_ < 0) {
		    i += i_1092_;
		    i_1092_ = -i_1092_;
		    i_1091_ += i_1093_;
		    i_1093_ = -i_1093_;
		}
		if (i_1092_ > i_1093_) {
		    i_1091_ <<= 16;
		    i_1091_ += 32768;
		    i_1093_ <<= 16;
		    int i_1096_ = (int) Math.floor(0.5 + ((double) i_1093_
							  / (double) i_1092_));
		    i_1092_ += i;
		    if (i < ((Class173_Sub3) this).anInt9723 * -993497119) {
			i_1091_
			    += (-993497119 * ((Class173_Sub3) this).anInt9723
				- i) * i_1096_;
			i = ((Class173_Sub3) this).anInt9723 * -993497119;
		    }
		    if (i_1092_
			>= 630968029 * ((Class173_Sub3) this).anInt9724)
			i_1092_
			    = ((Class173_Sub3) this).anInt9724 * 630968029 - 1;
		    int i_1097_ = i_1094_ >>> 24;
		    if (0 == i_1095_ || 1 == i_1095_ && 255 == i_1097_) {
			for (/**/; i <= i_1092_; i++) {
			    int i_1098_ = i_1091_ >> 16;
			    if (i_1098_ >= (592117349
					    * ((Class173_Sub3) this).anInt9725)
				&& i_1098_ < 6965409 * (((Class173_Sub3) this)
							.anInt9726))
				((Class173_Sub3) this).anIntArray9719
				    [(i_1098_
				      * (((Class173_Sub3) this).anInt9735
					 * 111437289)) + i]
				    = i_1094_;
			    i_1091_ += i_1096_;
			}
		    } else if (1 == i_1095_) {
			i_1094_
			    = (((i_1094_ & 0xff00ff) * i_1097_ >> 8 & 0xff00ff)
			       + ((i_1094_ & 0xff00) * i_1097_ >> 8 & 0xff00)
			       + (i_1097_ << 24));
			int i_1099_ = 256 - i_1097_;
			for (/**/; i <= i_1092_; i++) {
			    int i_1100_ = i_1091_ >> 16;
			    if (i_1100_ >= (592117349
					    * ((Class173_Sub3) this).anInt9725)
				&& i_1100_ < 6965409 * (((Class173_Sub3) this)
							.anInt9726)) {
				int i_1101_
				    = i + i_1100_ * (111437289
						     * (((Class173_Sub3) this)
							.anInt9735));
				int i_1102_ = (((Class173_Sub3) this)
					       .anIntArray9719[i_1101_]);
				i_1102_ = (((i_1102_ & 0xff00ff) * i_1099_ >> 8
					    & 0xff00ff)
					   + (i_1099_ * (i_1102_ & 0xff00) >> 8
					      & 0xff00));
				((Class173_Sub3) this).anIntArray9719[i_1101_]
				    = i_1102_ + i_1094_;
			    }
			    i_1091_ += i_1096_;
			}
		    } else if (i_1095_ == 2) {
			for (/**/; i <= i_1092_; i++) {
			    int i_1103_ = i_1091_ >> 16;
			    if (i_1103_ >= (((Class173_Sub3) this).anInt9725
					    * 592117349)
				&& i_1103_ < (((Class173_Sub3) this).anInt9726
					      * 6965409)) {
				int i_1104_
				    = i + i_1103_ * (111437289
						     * (((Class173_Sub3) this)
							.anInt9735));
				int i_1105_ = (((Class173_Sub3) this)
					       .anIntArray9719[i_1104_]);
				int i_1106_ = i_1105_ + i_1094_;
				int i_1107_ = ((i_1094_ & 0xff00ff)
					       + (i_1105_ & 0xff00ff));
				i_1105_ = ((i_1106_ - i_1107_ & 0x10000)
					   + (i_1107_ & 0x1000100));
				((Class173_Sub3) this).anIntArray9719[i_1104_]
				    = i_1106_ - i_1105_ | i_1105_ - (i_1105_
								     >>> 8);
			    }
			    i_1091_ += i_1096_;
			}
		    } else
			throw new IllegalArgumentException();
		} else {
		    i <<= 16;
		    i += 32768;
		    i_1092_ <<= 16;
		    int i_1108_
			= (int) Math.floor((double) i_1092_ / (double) i_1093_
					   + 0.5);
		    i_1093_ += i_1091_;
		    if (i_1091_
			< ((Class173_Sub3) this).anInt9725 * 592117349) {
			i += (i_1108_
			      * (((Class173_Sub3) this).anInt9725 * 592117349
				 - i_1091_));
			i_1091_ = ((Class173_Sub3) this).anInt9725 * 592117349;
		    }
		    if (i_1093_ >= 6965409 * ((Class173_Sub3) this).anInt9726)
			i_1093_
			    = ((Class173_Sub3) this).anInt9726 * 6965409 - 1;
		    int i_1109_ = i_1094_ >>> 24;
		    if (i_1095_ == 0 || 1 == i_1095_ && i_1109_ == 255) {
			for (/**/; i_1091_ <= i_1093_; i_1091_++) {
			    int i_1110_ = i >> 16;
			    if (i_1110_ >= (((Class173_Sub3) this).anInt9723
					    * -993497119)
				&& i_1110_ < 630968029 * ((Class173_Sub3)
							  this).anInt9724)
				((Class173_Sub3) this).anIntArray9719
				    [i_1110_ + i_1091_ * (((Class173_Sub3)
							   this).anInt9735
							  * 111437289)]
				    = i_1094_;
			    i += i_1108_;
			}
		    } else if (i_1095_ == 1) {
			i_1094_
			    = ((i_1109_ << 24)
			       + ((i_1109_ * (i_1094_ & 0xff00) >> 8 & 0xff00)
				  + ((i_1094_ & 0xff00ff) * i_1109_ >> 8
				     & 0xff00ff)));
			int i_1111_ = 256 - i_1109_;
			for (/**/; i_1091_ <= i_1093_; i_1091_++) {
			    int i_1112_ = i >> 16;
			    if (i_1112_ >= (((Class173_Sub3) this).anInt9723
					    * -993497119)
				&& i_1112_ < 630968029 * ((Class173_Sub3)
							  this).anInt9724) {
				int i_1113_
				    = (i_1112_
				       + (i_1091_
					  * (((Class173_Sub3) this).anInt9735
					     * 111437289)));
				int i_1114_ = (((Class173_Sub3) this)
					       .anIntArray9719[i_1113_]);
				i_1114_
				    = ((i_1111_ * (i_1114_ & 0xff00) >> 8
					& 0xff00)
				       + ((i_1114_ & 0xff00ff) * i_1111_ >> 8
					  & 0xff00ff));
				((Class173_Sub3) this).anIntArray9719
				    [(i_1112_
				      + (((Class173_Sub3) this).anInt9735
					 * 111437289 * i_1091_))]
				    = i_1094_ + i_1114_;
			    }
			    i += i_1108_;
			}
		    } else if (2 == i_1095_) {
			for (/**/; i_1091_ <= i_1093_; i_1091_++) {
			    int i_1115_ = i >> 16;
			    if (i_1115_ >= (-993497119
					    * ((Class173_Sub3) this).anInt9723)
				&& i_1115_ < (((Class173_Sub3) this).anInt9724
					      * 630968029)) {
				int i_1116_
				    = ((111437289
					* ((Class173_Sub3) this).anInt9735
					* i_1091_)
				       + i_1115_);
				int i_1117_ = (((Class173_Sub3) this)
					       .anIntArray9719[i_1116_]);
				int i_1118_ = i_1117_ + i_1094_;
				int i_1119_ = ((i_1094_ & 0xff00ff)
					       + (i_1117_ & 0xff00ff));
				i_1117_ = ((i_1118_ - i_1119_ & 0x10000)
					   + (i_1119_ & 0x1000100));
				((Class173_Sub3) this).anIntArray9719[i_1116_]
				    = i_1118_ - i_1117_ | i_1117_ - (i_1117_
								     >>> 8);
			    }
			    i += i_1108_;
			}
		    } else
			throw new IllegalArgumentException();
		}
	    }
	}
    }
    
    public boolean method2464() {
	return false;
    }
    
    public boolean method2290() {
	return false;
    }
    
    void method2466(float f, float f_1120_, float f_1121_, float f_1122_,
		    float f_1123_, float f_1124_) {
	/* empty */
    }
    
    void method2246(float f, float f_1125_, float f_1126_, float f_1127_,
		    float f_1128_, float f_1129_) {
	/* empty */
    }
    
    public void method2468(int i, Class164 class164) {
	for (int i_1130_ = 0;
	     i_1130_ < ((Class173_Sub3) this).aClass107Array9731.length;
	     i_1130_++) {
	    ((Class107) ((Class173_Sub3) this).aClass107Array9731[i_1130_])
		.anInt1355
		= -524292915 * (((Class107) (((Class173_Sub3) this)
					     .aClass107Array9731[i_1130_]))
				.anInt1342);
	    ((Class107) ((Class173_Sub3) this).aClass107Array9731[i_1130_])
		.anInt1325
		= i * -951681461;
	    ((Class107) ((Class173_Sub3) this).aClass107Array9731[i_1130_])
		.anInt1342
		= class164.anInt1827 * -666266923;
	    ((Class107) ((Class173_Sub3) this).aClass107Array9731[i_1130_])
		.anInt1345
		= -959556207 * class164.anInt1828;
	    ((Class107) ((Class173_Sub3) this).aClass107Array9731[i_1130_])
		.aBool1324
		= true;
	}
    }
    
    public void method2431(int i, Class164 class164) {
	for (int i_1131_ = 0;
	     i_1131_ < ((Class173_Sub3) this).aClass107Array9731.length;
	     i_1131_++) {
	    ((Class107) ((Class173_Sub3) this).aClass107Array9731[i_1131_])
		.anInt1355
		= -524292915 * (((Class107) (((Class173_Sub3) this)
					     .aClass107Array9731[i_1131_]))
				.anInt1342);
	    ((Class107) ((Class173_Sub3) this).aClass107Array9731[i_1131_])
		.anInt1325
		= i * -951681461;
	    ((Class107) ((Class173_Sub3) this).aClass107Array9731[i_1131_])
		.anInt1342
		= class164.anInt1827 * -666266923;
	    ((Class107) ((Class173_Sub3) this).aClass107Array9731[i_1131_])
		.anInt1345
		= -959556207 * class164.anInt1828;
	    ((Class107) ((Class173_Sub3) this).aClass107Array9731[i_1131_])
		.aBool1324
		= true;
	}
    }
    
    public int[] method2172() {
	return null;
    }
    
    void method8951() {
	int i = (((Class173_Sub3) this).anInt9724 * 630968029
		 - -993497119 * ((Class173_Sub3) this).anInt9723);
	int i_1132_ = (6965409 * ((Class173_Sub3) this).anInt9726
		       - ((Class173_Sub3) this).anInt9725 * 592117349);
	float f = (((Class173_Sub3) this).aFloat9742
		   = ((float) (((Class173_Sub3) this).anInt9740 * 1233404121)
		      / 2.0F));
	float f_1133_ = (((Class173_Sub3) this).aFloat9744
			 = (float) (((Class173_Sub3) this).anInt9741
				    * 600069629) / 2.0F);
	((Class173_Sub3) this).aFloat9743
	    = f + (float) (-1930702891 * ((Class173_Sub3) this).anInt9738);
	((Class173_Sub3) this).aFloat9751
	    = f_1133_ + (float) (542582179 * ((Class173_Sub3) this).anInt9739);
	for (int i_1134_ = 0;
	     i_1134_ < ((Class173_Sub3) this).anInt9745 * -1585405167;
	     i_1134_++) {
	    Class107 class107
		= ((Class173_Sub3) this).aClass107Array9731[i_1134_];
	    Class121 class121 = ((Class107) class107).aClass121_1330;
	    ((Class121) class121).aFloat1508 = f;
	    ((Class121) class121).aFloat1510 = f_1133_;
	    ((Class121) class121).aFloat1507
		= (((Class173_Sub3) this).aFloat9743
		   - (float) (((Class173_Sub3) this).anInt9723 * -993497119));
	    ((Class121) class121).aFloat1512
		= (((Class173_Sub3) this).aFloat9751
		   - (float) (((Class173_Sub3) this).anInt9725 * 592117349));
	    ((Class121) class121).anInt1513 = i;
	    ((Class121) class121).anInt1520 = i_1132_;
	}
	int i_1135_ = ((((Class173_Sub3) this).anInt9735 * 111437289
			* (((Class173_Sub3) this).anInt9725 * 592117349))
		       + -993497119 * ((Class173_Sub3) this).anInt9723);
	for (int i_1136_ = 592117349 * ((Class173_Sub3) this).anInt9725;
	     i_1136_ < 6965409 * ((Class173_Sub3) this).anInt9726; i_1136_++) {
	    for (int i_1137_ = 0;
		 i_1137_ < ((Class173_Sub3) this).anInt9745 * -1585405167;
		 i_1137_++)
		((Class121) (((Class107) (((Class173_Sub3) this)
					  .aClass107Array9731[i_1137_]))
			     .aClass121_1330))
		    .anIntArray1506
		    [i_1136_ - 592117349 * ((Class173_Sub3) this).anInt9725]
		    = i_1135_;
	    i_1135_ += 111437289 * ((Class173_Sub3) this).anInt9735;
	}
    }
    
    public int method2427() {
	return -1;
    }
    
    public void method2370(Class433 class433, Class159 class159,
			   Class431 class431) {
	Class418 class418 = method2241();
	class418.method5035(class433);
	class418.method4974(((Class173_Sub3) this).aClass418_9736);
	class159.method2056(class431, ((Class173_Sub3) this).aClass418_9722,
			    class418, ((Class173_Sub3) this).aFloat9743,
			    ((Class173_Sub3) this).aFloat9751,
			    ((Class173_Sub3) this).aFloat9742,
			    ((Class173_Sub3) this).aFloat9744);
    }
    
    public void method2476(float f, float f_1138_, float f_1139_, float[] fs) {
	float f_1140_
	    = ((f_1138_
		* ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[7])
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[15]
		  + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[3]
		     * f))
	       + f_1139_ * (((Class173_Sub3) this).aClass418_9736
			    .aFloatArray4768[11]));
	float f_1141_
	    = (f * ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[0]
	       + ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[12]
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[4]
		  * f_1138_)
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[8]
		  * f_1139_));
	float f_1142_
	    = ((((Class173_Sub3) this).aClass418_9736.aFloatArray4768[9]
		* f_1139_)
	       + ((f_1138_
		   * ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[5])
		  + ((((Class173_Sub3) this).aClass418_9736.aFloatArray4768[1]
		      * f)
		     + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768
			[13]))));
	float f_1143_
	    = ((((Class173_Sub3) this).aClass418_9734.aFloatArray4768[10]
		* f_1139_)
	       + (f * ((Class173_Sub3) this).aClass418_9734.aFloatArray4768[2]
		  + ((Class173_Sub3) this).aClass418_9734.aFloatArray4768[14]
		  + (((Class173_Sub3) this).aClass418_9734.aFloatArray4768[6]
		     * f_1138_)));
	fs[0] = (((Class173_Sub3) this).aFloat9743
		 + f_1141_ * ((Class173_Sub3) this).aFloat9742 / f_1140_);
	fs[1] = (((Class173_Sub3) this).aFloat9751
		 + ((Class173_Sub3) this).aFloat9744 * f_1142_ / f_1140_);
	fs[2] = f_1143_;
    }
    
    void method8952() {
	if (((Class173_Sub3) this).aFloatArray9716 != null) {
	    if (0 == -993497119 * ((Class173_Sub3) this).anInt9723
		&& (((Class173_Sub3) this).anInt9735 * 111437289
		    == ((Class173_Sub3) this).anInt9724 * 630968029)
		&& 0 == 592117349 * ((Class173_Sub3) this).anInt9725
		&& (((Class173_Sub3) this).anInt9726 * 6965409
		    == ((Class173_Sub3) this).anInt9748 * 434033557)) {
		int i = ((Class173_Sub3) this).aFloatArray9716.length;
		int i_1144_ = i - (i & 0x7);
		int i_1145_ = 0;
		while (i_1145_ < i_1144_) {
		    ((Class173_Sub3) this).aFloatArray9716[i_1145_++]
			= 2.14748365E9F;
		    ((Class173_Sub3) this).aFloatArray9716[i_1145_++]
			= 2.14748365E9F;
		    ((Class173_Sub3) this).aFloatArray9716[i_1145_++]
			= 2.14748365E9F;
		    ((Class173_Sub3) this).aFloatArray9716[i_1145_++]
			= 2.14748365E9F;
		    ((Class173_Sub3) this).aFloatArray9716[i_1145_++]
			= 2.14748365E9F;
		    ((Class173_Sub3) this).aFloatArray9716[i_1145_++]
			= 2.14748365E9F;
		    ((Class173_Sub3) this).aFloatArray9716[i_1145_++]
			= 2.14748365E9F;
		    ((Class173_Sub3) this).aFloatArray9716[i_1145_++]
			= 2.14748365E9F;
		}
		while (i_1145_ < i)
		    ((Class173_Sub3) this).aFloatArray9716[i_1145_++]
			= 2.14748365E9F;
	    } else {
		int i = (((Class173_Sub3) this).anInt9724 * 630968029
			 - ((Class173_Sub3) this).anInt9723 * -993497119);
		int i_1146_ = (6965409 * ((Class173_Sub3) this).anInt9726
			       - 592117349 * ((Class173_Sub3) this).anInt9725);
		int i_1147_ = 111437289 * ((Class173_Sub3) this).anInt9735 - i;
		int i_1148_
		    = ((((Class173_Sub3) this).anInt9725 * 592117349
			* (111437289 * ((Class173_Sub3) this).anInt9735))
		       + ((Class173_Sub3) this).anInt9723 * -993497119);
		int i_1149_ = i >> 3;
		int i_1150_ = i & 0x7;
		i = i_1148_ - 1;
		for (int i_1151_ = -i_1146_; i_1151_ < 0; i_1151_++) {
		    if (i_1149_ > 0) {
			int i_1152_ = i_1149_;
			do {
			    ((Class173_Sub3) this).aFloatArray9716[++i]
				= 2.14748365E9F;
			    ((Class173_Sub3) this).aFloatArray9716[++i]
				= 2.14748365E9F;
			    ((Class173_Sub3) this).aFloatArray9716[++i]
				= 2.14748365E9F;
			    ((Class173_Sub3) this).aFloatArray9716[++i]
				= 2.14748365E9F;
			    ((Class173_Sub3) this).aFloatArray9716[++i]
				= 2.14748365E9F;
			    ((Class173_Sub3) this).aFloatArray9716[++i]
				= 2.14748365E9F;
			    ((Class173_Sub3) this).aFloatArray9716[++i]
				= 2.14748365E9F;
			    ((Class173_Sub3) this).aFloatArray9716[++i]
				= 2.14748365E9F;
			} while (--i_1152_ > 0);
		    }
		    if (i_1150_ > 0) {
			int i_1153_ = i_1150_;
			do
			    ((Class173_Sub3) this).aFloatArray9716[++i]
				= 2.14748365E9F;
			while (--i_1153_ > 0);
		    }
		    i += i_1147_;
		}
	    }
	}
    }
    
    public Class163_Sub1 method2478() {
	return new Class163_Sub1_Sub2(this);
    }
    
    public void method2340(int i, int i_1154_, int i_1155_, int i_1156_) {
	((Class173_Sub3) this).anInt9738 = 2003104125 * i;
	((Class173_Sub3) this).anInt9739 = -1753532917 * i_1154_;
	((Class173_Sub3) this).anInt9740 = -1280557207 * i_1155_;
	((Class173_Sub3) this).anInt9741 = i_1156_ * -1073860779;
	method8934();
    }
    
    public Interface19 method2336(int i, int i_1157_, Class149 class149,
				  Class169 class169, int i_1158_) {
	return method8946(i, i_1157_);
    }
    
    public Interface19 method2362(int i, int i_1159_, Class149 class149,
				  Class169 class169, int i_1160_) {
	return method8946(i, i_1159_);
    }
    
    public Interface19 method2482(int i, int i_1161_, Class149 class149,
				  Class169 class169, int i_1162_) {
	return method8946(i, i_1161_);
    }
    
    public Interface19 method2483(int i, int i_1163_, Class149 class149,
				  Class169 class169, int i_1164_) {
	return method8946(i, i_1163_);
    }
    
    public void method2339() {
	/* empty */
    }
    
    public Interface21 method2337(int i, int i_1165_) {
	return new Class112(i, i_1165_);
    }
    
    public void method2223(int i, int i_1166_, int i_1167_, int i_1168_,
			   int i_1169_, int i_1170_, int i_1171_) {
	if (null != ((Class173_Sub3) this).anIntArray9719) {
	    Class107 class107 = method8939(Thread.currentThread());
	    Class121 class121 = ((Class107) class107).aClass121_1330;
	    int i_1172_ = i_1167_ - i;
	    int i_1173_ = i_1168_ - i_1166_;
	    int i_1174_ = i_1172_ >= 0 ? i_1172_ : -i_1172_;
	    int i_1175_ = i_1173_ >= 0 ? i_1173_ : -i_1173_;
	    int i_1176_ = i_1174_;
	    if (i_1176_ < i_1175_)
		i_1176_ = i_1175_;
	    if (0 != i_1176_) {
		int i_1177_ = (i_1172_ << 16) / i_1176_;
		int i_1178_ = (i_1173_ << 16) / i_1176_;
		i_1172_ += i_1177_ >> 16;
		i_1173_ += i_1178_ >> 16;
		if (i_1178_ <= i_1177_)
		    i_1177_ = -i_1177_;
		else
		    i_1178_ = -i_1178_;
		int i_1179_ = i_1170_ * i_1178_ >> 17;
		int i_1180_ = 1 + i_1170_ * i_1178_ >> 17;
		int i_1181_ = i_1170_ * i_1177_ >> 17;
		int i_1182_ = 1 + i_1170_ * i_1177_ >> 17;
		i -= class121.method1593();
		i_1166_ -= class121.method1577();
		int i_1183_ = i_1179_ + i;
		int i_1184_ = i - i_1180_;
		int i_1185_ = i + i_1172_ - i_1180_;
		int i_1186_ = i_1179_ + (i_1172_ + i);
		int i_1187_ = i_1166_ + i_1181_;
		int i_1188_ = i_1166_ - i_1182_;
		int i_1189_ = i_1173_ + i_1166_ - i_1182_;
		int i_1190_ = i_1173_ + i_1166_ + i_1181_;
		if (i_1171_ == 0)
		    ((Class121) class121).anInt1526 = 0;
		else if (1 == i_1171_)
		    ((Class121) class121).anInt1526 = 255 - (i_1169_ >>> 24);
		else
		    throw new IllegalArgumentException();
		method2283(false);
		((Class121) class121).aBool1504
		    = (i_1183_ < 0 || i_1183_ > ((Class121) class121).anInt1513
		       || i_1184_ < 0
		       || i_1184_ > ((Class121) class121).anInt1513
		       || i_1185_ < 0
		       || i_1185_ > ((Class121) class121).anInt1513);
		class121.method1582(true, false, false, (float) i_1187_,
				    (float) i_1188_, (float) i_1189_,
				    (float) i_1183_, (float) i_1184_,
				    (float) i_1185_, 100.0F, 100.0F, 100.0F,
				    i_1169_);
		((Class121) class121).aBool1504
		    = (i_1183_ < 0 || i_1183_ > ((Class121) class121).anInt1513
		       || i_1185_ < 0
		       || i_1185_ > ((Class121) class121).anInt1513
		       || i_1186_ < 0
		       || i_1186_ > ((Class121) class121).anInt1513);
		class121.method1582(true, false, false, (float) i_1187_,
				    (float) i_1189_, (float) i_1190_,
				    (float) i_1183_, (float) i_1185_,
				    (float) i_1186_, 100.0F, 100.0F, 100.0F,
				    i_1169_);
		method2283(true);
	    }
	}
    }
    
    void method2493(int i, int i_1191_) throws Exception_Sub5 {
	aClass163_Sub2_1999.method8924(i, i_1191_);
	if (anInterface22_1991 != null)
	    anInterface22_1991.method27((byte) 46);
    }
    
    public Class433 method2270() {
	return new Class433(((Class173_Sub3) this).aClass433_9733);
    }
    
    void method2495(int i, int i_1192_) throws Exception_Sub5 {
	aClass163_Sub2_1999.method8924(i, i_1192_);
	if (anInterface22_1991 != null)
	    anInterface22_1991.method27((byte) 31);
    }
    
    public boolean method2496() {
	return false;
    }
    
    public boolean method2497() {
	return false;
    }
    
    public boolean method2498() {
	return true;
    }
    
    public void method2348(int i, int i_1193_, int i_1194_, int i_1195_) {
	if (-993497119 * ((Class173_Sub3) this).anInt9723 < i)
	    ((Class173_Sub3) this).anInt9723 = i * -1762913247;
	if (((Class173_Sub3) this).anInt9725 * 592117349 < i_1193_)
	    ((Class173_Sub3) this).anInt9725 = -988511379 * i_1193_;
	if (((Class173_Sub3) this).anInt9724 * 630968029 > i_1194_)
	    ((Class173_Sub3) this).anInt9724 = -1932232331 * i_1194_;
	if (((Class173_Sub3) this).anInt9726 * 6965409 > i_1195_)
	    ((Class173_Sub3) this).anInt9726 = -2128503967 * i_1195_;
	method8934();
    }
    
    public void method2213(float f, float f_1196_) {
	((Class173_Sub3) this).aFloat9746 = f_1196_ - f;
	((Class173_Sub3) this).aFloat9747 = f_1196_ + f - 1.0F;
	for (int i = 0; i < ((Class173_Sub3) this).anInt9745 * -1585405167;
	     i++) {
	    Class107 class107 = ((Class173_Sub3) this).aClass107Array9731[i];
	    Class121 class121 = ((Class107) class107).aClass121_1330;
	    ((Class121) class121).aFloat1503
		= ((Class173_Sub3) this).aFloat9746;
	    ((Class121) class121).aFloat1511
		= ((Class173_Sub3) this).aFloat9747;
	}
    }
    
    public void method2537(int i) {
	/* empty */
    }
    
    void method8953(boolean bool, int i, int i_1197_, float f, int i_1198_,
		    int i_1199_, int i_1200_) {
	if (((Class173_Sub3) this).anIntArray9719 != null) {
	    if (i_1198_ < 0)
		i_1198_ = -i_1198_;
	    int i_1201_ = i_1197_ - i_1198_;
	    if (i_1201_ < 592117349 * ((Class173_Sub3) this).anInt9725)
		i_1201_ = ((Class173_Sub3) this).anInt9725 * 592117349;
	    int i_1202_ = i_1197_ + i_1198_ + 1;
	    if (i_1202_ > 6965409 * ((Class173_Sub3) this).anInt9726)
		i_1202_ = 6965409 * ((Class173_Sub3) this).anInt9726;
	    int i_1203_ = i_1201_;
	    int i_1204_ = i_1198_ * i_1198_;
	    int i_1205_ = 0;
	    int i_1206_ = i_1197_ - i_1203_;
	    int i_1207_ = i_1206_ * i_1206_;
	    int i_1208_ = i_1207_ - i_1206_;
	    if (i_1197_ > i_1202_)
		i_1197_ = i_1202_;
	    int i_1209_ = i_1199_ >>> 24;
	    if (0 == i_1200_ || 1 == i_1200_ && 255 == i_1209_) {
		while (i_1203_ < i_1197_) {
		    for (/**/; i_1208_ <= i_1204_ || i_1207_ <= i_1204_;
			 i_1208_ += i_1205_++ + i_1205_)
			i_1207_ += i_1205_ + i_1205_;
		    int i_1210_ = 1 + (i - i_1205_);
		    if (i_1210_
			< -993497119 * ((Class173_Sub3) this).anInt9723)
			i_1210_
			    = -993497119 * ((Class173_Sub3) this).anInt9723;
		    int i_1211_ = i_1205_ + i;
		    if (i_1211_ > ((Class173_Sub3) this).anInt9724 * 630968029)
			i_1211_ = ((Class173_Sub3) this).anInt9724 * 630968029;
		    int i_1212_
			= i_1210_ + i_1203_ * (((Class173_Sub3) this).anInt9735
					       * 111437289);
		    for (int i_1213_ = i_1210_; i_1213_ < i_1211_; i_1213_++) {
			if (!bool || f < (((Class173_Sub3) this)
					  .aFloatArray9716[i_1212_]))
			    ((Class173_Sub3) this).anIntArray9719[i_1212_]
				= i_1199_;
			i_1212_++;
		    }
		    i_1203_++;
		    i_1207_ -= i_1206_-- + i_1206_;
		    i_1208_ -= i_1206_ + i_1206_;
		}
		i_1205_ = i_1198_;
		i_1206_ = i_1203_ - i_1197_;
		i_1208_ = i_1206_ * i_1206_ + i_1204_;
		i_1207_ = i_1208_ - i_1205_;
		i_1208_ -= i_1206_;
		while (i_1203_ < i_1202_) {
		    for (/**/; i_1208_ > i_1204_ && i_1207_ > i_1204_;
			 i_1207_ -= i_1205_ + i_1205_)
			i_1208_ -= i_1205_-- + i_1205_;
		    int i_1214_ = i - i_1205_;
		    if (i_1214_
			< -993497119 * ((Class173_Sub3) this).anInt9723)
			i_1214_
			    = -993497119 * ((Class173_Sub3) this).anInt9723;
		    int i_1215_ = i + i_1205_;
		    if (i_1215_
			> ((Class173_Sub3) this).anInt9724 * 630968029 - 1)
			i_1215_
			    = 630968029 * ((Class173_Sub3) this).anInt9724 - 1;
		    int i_1216_ = (i_1203_ * (((Class173_Sub3) this).anInt9735
					      * 111437289)
				   + i_1214_);
		    for (int i_1217_ = i_1214_; i_1217_ <= i_1215_;
			 i_1217_++) {
			if (!bool || f < (((Class173_Sub3) this)
					  .aFloatArray9716[i_1216_]))
			    ((Class173_Sub3) this).anIntArray9719[i_1216_]
				= i_1199_;
			i_1216_++;
		    }
		    i_1203_++;
		    i_1208_ += i_1206_ + i_1206_;
		    i_1207_ += i_1206_++ + i_1206_;
		}
	    } else if (1 == i_1200_) {
		i_1199_ = ((i_1209_ << 24)
			   + ((i_1209_ * (i_1199_ & 0xff00ff) >> 8 & 0xff00ff)
			      + ((i_1199_ & 0xff00) * i_1209_ >> 8 & 0xff00)));
		int i_1218_ = 256 - i_1209_;
		while (i_1203_ < i_1197_) {
		    for (/**/; i_1208_ <= i_1204_ || i_1207_ <= i_1204_;
			 i_1208_ += i_1205_++ + i_1205_)
			i_1207_ += i_1205_ + i_1205_;
		    int i_1219_ = i - i_1205_ + 1;
		    if (i_1219_
			< ((Class173_Sub3) this).anInt9723 * -993497119)
			i_1219_
			    = ((Class173_Sub3) this).anInt9723 * -993497119;
		    int i_1220_ = i + i_1205_;
		    if (i_1220_ > ((Class173_Sub3) this).anInt9724 * 630968029)
			i_1220_ = 630968029 * ((Class173_Sub3) this).anInt9724;
		    int i_1221_ = i_1219_ + (111437289
					     * ((Class173_Sub3) this).anInt9735
					     * i_1203_);
		    for (int i_1222_ = i_1219_; i_1222_ < i_1220_; i_1222_++) {
			if (!bool || f < (((Class173_Sub3) this)
					  .aFloatArray9716[i_1221_])) {
			    int i_1223_ = (((Class173_Sub3) this)
					   .anIntArray9719[i_1221_]);
			    i_1223_ = ((i_1218_ * (i_1223_ & 0xff00ff) >> 8
					& 0xff00ff)
				       + ((i_1223_ & 0xff00) * i_1218_ >> 8
					  & 0xff00));
			    ((Class173_Sub3) this).anIntArray9719[i_1221_]
				= i_1223_ + i_1199_;
			}
			i_1221_++;
		    }
		    i_1203_++;
		    i_1207_ -= i_1206_-- + i_1206_;
		    i_1208_ -= i_1206_ + i_1206_;
		}
		i_1205_ = i_1198_;
		i_1206_ = -i_1206_;
		i_1208_ = i_1204_ + i_1206_ * i_1206_;
		i_1207_ = i_1208_ - i_1205_;
		i_1208_ -= i_1206_;
		while (i_1203_ < i_1202_) {
		    for (/**/; i_1208_ > i_1204_ && i_1207_ > i_1204_;
			 i_1207_ -= i_1205_ + i_1205_)
			i_1208_ -= i_1205_-- + i_1205_;
		    int i_1224_ = i - i_1205_;
		    if (i_1224_
			< -993497119 * ((Class173_Sub3) this).anInt9723)
			i_1224_
			    = ((Class173_Sub3) this).anInt9723 * -993497119;
		    int i_1225_ = i + i_1205_;
		    if (i_1225_
			> ((Class173_Sub3) this).anInt9724 * 630968029 - 1)
			i_1225_
			    = ((Class173_Sub3) this).anInt9724 * 630968029 - 1;
		    int i_1226_ = (111437289 * ((Class173_Sub3) this).anInt9735
				   * i_1203_) + i_1224_;
		    for (int i_1227_ = i_1224_; i_1227_ <= i_1225_;
			 i_1227_++) {
			if (!bool || f < (((Class173_Sub3) this)
					  .aFloatArray9716[i_1226_])) {
			    int i_1228_ = (((Class173_Sub3) this)
					   .anIntArray9719[i_1226_]);
			    i_1228_ = ((i_1218_ * (i_1228_ & 0xff00ff) >> 8
					& 0xff00ff)
				       + (i_1218_ * (i_1228_ & 0xff00) >> 8
					  & 0xff00));
			    ((Class173_Sub3) this).anIntArray9719[i_1226_]
				= i_1199_ + i_1228_;
			}
			i_1226_++;
		    }
		    i_1203_++;
		    i_1208_ += i_1206_ + i_1206_;
		    i_1207_ += i_1206_++ + i_1206_;
		}
	    } else if (i_1200_ == 2) {
		while (i_1203_ < i_1197_) {
		    for (/**/; i_1208_ <= i_1204_ || i_1207_ <= i_1204_;
			 i_1208_ += i_1205_++ + i_1205_)
			i_1207_ += i_1205_ + i_1205_;
		    int i_1229_ = 1 + (i - i_1205_);
		    if (i_1229_
			< ((Class173_Sub3) this).anInt9723 * -993497119)
			i_1229_
			    = -993497119 * ((Class173_Sub3) this).anInt9723;
		    int i_1230_ = i_1205_ + i;
		    if (i_1230_ > 630968029 * ((Class173_Sub3) this).anInt9724)
			i_1230_ = 630968029 * ((Class173_Sub3) this).anInt9724;
		    int i_1231_ = ((((Class173_Sub3) this).anInt9735
				    * 111437289 * i_1203_)
				   + i_1229_);
		    for (int i_1232_ = i_1229_; i_1232_ < i_1230_; i_1232_++) {
			if (!bool || f < (((Class173_Sub3) this)
					  .aFloatArray9716[i_1231_])) {
			    int i_1233_ = (((Class173_Sub3) this)
					   .anIntArray9719[i_1231_]);
			    int i_1234_ = i_1233_ + i_1199_;
			    int i_1235_
				= (i_1199_ & 0xff00ff) + (i_1233_ & 0xff00ff);
			    i_1233_
				= (i_1235_ & 0x1000100) + (i_1234_ - i_1235_
							   & 0x10000);
			    ((Class173_Sub3) this).anIntArray9719[i_1231_]
				= i_1234_ - i_1233_ | i_1233_ - (i_1233_
								 >>> 8);
			}
			i_1231_++;
		    }
		    i_1203_++;
		    i_1207_ -= i_1206_-- + i_1206_;
		    i_1208_ -= i_1206_ + i_1206_;
		}
		i_1205_ = i_1198_;
		i_1206_ = -i_1206_;
		i_1208_ = i_1206_ * i_1206_ + i_1204_;
		i_1207_ = i_1208_ - i_1205_;
		i_1208_ -= i_1206_;
		while (i_1203_ < i_1202_) {
		    for (/**/; i_1208_ > i_1204_ && i_1207_ > i_1204_;
			 i_1207_ -= i_1205_ + i_1205_)
			i_1208_ -= i_1205_-- + i_1205_;
		    int i_1236_ = i - i_1205_;
		    if (i_1236_
			< -993497119 * ((Class173_Sub3) this).anInt9723)
			i_1236_
			    = -993497119 * ((Class173_Sub3) this).anInt9723;
		    int i_1237_ = i_1205_ + i;
		    if (i_1237_
			> ((Class173_Sub3) this).anInt9724 * 630968029 - 1)
			i_1237_
			    = 630968029 * ((Class173_Sub3) this).anInt9724 - 1;
		    int i_1238_ = (111437289 * ((Class173_Sub3) this).anInt9735
				   * i_1203_) + i_1236_;
		    for (int i_1239_ = i_1236_; i_1239_ <= i_1237_;
			 i_1239_++) {
			if (!bool || f < (((Class173_Sub3) this)
					  .aFloatArray9716[i_1238_])) {
			    int i_1240_ = (((Class173_Sub3) this)
					   .anIntArray9719[i_1238_]);
			    int i_1241_ = i_1240_ + i_1199_;
			    int i_1242_
				= (i_1199_ & 0xff00ff) + (i_1240_ & 0xff00ff);
			    i_1240_ = ((i_1241_ - i_1242_ & 0x10000)
				       + (i_1242_ & 0x1000100));
			    ((Class173_Sub3) this).anIntArray9719[i_1238_]
				= i_1241_ - i_1240_ | i_1240_ - (i_1240_
								 >>> 8);
			}
			i_1238_++;
		    }
		    i_1203_++;
		    i_1208_ += i_1206_ + i_1206_;
		    i_1207_ += i_1206_++ + i_1206_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public boolean method2175() {
	return false;
    }
    
    public void method2504(int i, int i_1243_, int i_1244_, int i_1245_,
			   int i_1246_, int i_1247_) {
	if (((Class173_Sub3) this).anIntArray9719 != null) {
	    if (i < ((Class173_Sub3) this).anInt9723 * -993497119) {
		i_1244_ -= -993497119 * ((Class173_Sub3) this).anInt9723 - i;
		i = ((Class173_Sub3) this).anInt9723 * -993497119;
	    }
	    if (i_1243_ < ((Class173_Sub3) this).anInt9725 * 592117349) {
		i_1245_
		    -= ((Class173_Sub3) this).anInt9725 * 592117349 - i_1243_;
		i_1243_ = ((Class173_Sub3) this).anInt9725 * 592117349;
	    }
	    if (i + i_1244_ > ((Class173_Sub3) this).anInt9724 * 630968029)
		i_1244_ = 630968029 * ((Class173_Sub3) this).anInt9724 - i;
	    if (i_1243_ + i_1245_ > ((Class173_Sub3) this).anInt9726 * 6965409)
		i_1245_ = 6965409 * ((Class173_Sub3) this).anInt9726 - i_1243_;
	    if (i_1244_ > 0 && i_1245_ > 0
		&& i <= 630968029 * ((Class173_Sub3) this).anInt9724
		&& i_1243_ <= 6965409 * ((Class173_Sub3) this).anInt9726) {
		int i_1248_
		    = ((Class173_Sub3) this).anInt9735 * 111437289 - i_1244_;
		int i_1249_
		    = (i_1243_ * (((Class173_Sub3) this).anInt9735 * 111437289)
		       + i);
		int i_1250_ = i_1246_ >>> 24;
		if (0 == i_1247_ || i_1247_ == 1 && i_1250_ == 255) {
		    int i_1251_ = i_1244_ >> 3;
		    int i_1252_ = i_1244_ & 0x7;
		    i_1244_ = i_1249_ - 1;
		    for (int i_1253_ = -i_1245_; i_1253_ < 0; i_1253_++) {
			if (i_1251_ > 0) {
			    i = i_1251_;
			    do {
				((Class173_Sub3) this).anIntArray9719
				    [++i_1244_]
				    = i_1246_;
				((Class173_Sub3) this).anIntArray9719
				    [++i_1244_]
				    = i_1246_;
				((Class173_Sub3) this).anIntArray9719
				    [++i_1244_]
				    = i_1246_;
				((Class173_Sub3) this).anIntArray9719
				    [++i_1244_]
				    = i_1246_;
				((Class173_Sub3) this).anIntArray9719
				    [++i_1244_]
				    = i_1246_;
				((Class173_Sub3) this).anIntArray9719
				    [++i_1244_]
				    = i_1246_;
				((Class173_Sub3) this).anIntArray9719
				    [++i_1244_]
				    = i_1246_;
				((Class173_Sub3) this).anIntArray9719
				    [++i_1244_]
				    = i_1246_;
			    } while (--i > 0);
			}
			if (i_1252_ > 0) {
			    i = i_1252_;
			    do
				((Class173_Sub3) this).anIntArray9719
				    [++i_1244_]
				    = i_1246_;
			    while (--i > 0);
			}
			i_1244_ += i_1248_;
		    }
		} else if (1 == i_1247_) {
		    i_1246_ = ((i_1250_ * (i_1246_ & 0xff00ff) >> 8 & 0xff00ff)
			       + (((i_1246_ & ~0xff00ff) >>> 8) * i_1250_
				  & ~0xff00ff));
		    int i_1254_ = 256 - i_1250_;
		    for (int i_1255_ = 0; i_1255_ < i_1245_; i_1255_++) {
			for (int i_1256_ = -i_1244_; i_1256_ < 0; i_1256_++) {
			    int i_1257_ = (((Class173_Sub3) this)
					   .anIntArray9719[i_1249_]);
			    i_1257_ = ((i_1254_ * ((i_1257_ & ~0xff00ff) >>> 8)
					& ~0xff00ff)
				       + (i_1254_ * (i_1257_ & 0xff00ff) >> 8
					  & 0xff00ff));
			    ((Class173_Sub3) this).anIntArray9719[i_1249_++]
				= i_1246_ + i_1257_;
			}
			i_1249_ += i_1248_;
		    }
		} else if (2 == i_1247_) {
		    for (int i_1258_ = 0; i_1258_ < i_1245_; i_1258_++) {
			for (int i_1259_ = -i_1244_; i_1259_ < 0; i_1259_++) {
			    int i_1260_ = (((Class173_Sub3) this)
					   .anIntArray9719[i_1249_]);
			    int i_1261_ = i_1260_ + i_1246_;
			    int i_1262_
				= (i_1246_ & 0xff00ff) + (i_1260_ & 0xff00ff);
			    i_1260_
				= (i_1262_ & 0x1000100) + (i_1261_ - i_1262_
							   & 0x10000);
			    ((Class173_Sub3) this).anIntArray9719[i_1249_++]
				= i_1261_ - i_1260_ | i_1260_ - (i_1260_
								 >>> 8);
			}
			i_1249_ += i_1248_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2505(int i, int i_1263_, int i_1264_, int i_1265_,
			   int i_1266_, int i_1267_, int i_1268_, int i_1269_,
			   int i_1270_) {
	if (((Class173_Sub3) this).anIntArray9719 != null) {
	    i_1264_ -= i;
	    i_1265_ -= i_1263_;
	    if (i_1265_ == 0) {
		if (i_1264_ >= 0)
		    method8935(i, i_1263_, i_1264_ + 1, i_1266_, i_1267_,
			       i_1268_, i_1269_, i_1270_);
		else {
		    int i_1271_ = i_1269_ + i_1268_;
		    i_1270_ %= i_1271_;
		    i_1270_ = (i_1271_ + i_1268_ - i_1270_
			       - (1 + -i_1264_) % i_1271_);
		    i_1270_ %= i_1271_;
		    if (i_1270_ < 0)
			i_1270_ += i_1271_;
		    method8935(i + i_1264_, i_1263_, -i_1264_ + 1, i_1266_,
			       i_1267_, i_1268_, i_1269_, i_1270_);
		}
	    } else if (i_1264_ == 0) {
		if (i_1265_ >= 0)
		    method8931(i, i_1263_, i_1265_ + 1, i_1266_, i_1267_,
			       i_1268_, i_1269_, i_1270_);
		else {
		    int i_1272_ = i_1269_ + i_1268_;
		    i_1270_ %= i_1272_;
		    i_1270_ = (i_1272_ + i_1268_ - i_1270_
			       - (1 + -i_1265_) % i_1272_);
		    i_1270_ %= i_1272_;
		    if (i_1270_ < 0)
			i_1270_ += i_1272_;
		    method8931(i, i_1263_ + i_1265_, 1 + -i_1265_, i_1266_,
			       i_1267_, i_1268_, i_1269_, i_1270_);
		}
	    } else {
		i_1270_ <<= 8;
		i_1268_ <<= 8;
		i_1269_ <<= 8;
		int i_1273_ = i_1269_ + i_1268_;
		i_1270_ %= i_1273_;
		if (i_1265_ + i_1264_ < 0) {
		    int i_1274_
			= (int) (Math.sqrt((double) (i_1265_ * i_1265_
						     + i_1264_ * i_1264_))
				 * 256.0);
		    int i_1275_ = i_1274_ % i_1273_;
		    i_1270_ = i_1273_ + i_1268_ - i_1270_ - i_1275_;
		    i_1270_ %= i_1273_;
		    if (i_1270_ < 0)
			i_1270_ += i_1273_;
		    i += i_1264_;
		    i_1264_ = -i_1264_;
		    i_1263_ += i_1265_;
		    i_1265_ = -i_1265_;
		}
		if (i_1264_ > i_1265_) {
		    i_1263_ <<= 16;
		    i_1263_ += 32768;
		    i_1265_ <<= 16;
		    int i_1276_ = (int) Math.floor(0.5 + ((double) i_1265_
							  / (double) i_1264_));
		    i_1264_ += i;
		    int i_1277_ = i_1266_ >>> 24;
		    int i_1278_
			= (int) Math.sqrt((double) (65536
						    + ((i_1276_ >> 8)
						       * (i_1276_ >> 8))));
		    if (i_1267_ == 0 || 1 == i_1267_ && i_1277_ == 255) {
			while (i <= i_1264_) {
			    int i_1279_ = i_1263_ >> 16;
			    if (i >= (-993497119
				      * ((Class173_Sub3) this).anInt9723)
				&& i < (630968029
					* ((Class173_Sub3) this).anInt9724)
				&& i_1279_ >= 592117349 * ((Class173_Sub3)
							   this).anInt9725
				&& i_1279_ < 6965409 * (((Class173_Sub3) this)
							.anInt9726)
				&& i_1270_ < i_1268_)
				((Class173_Sub3) this).anIntArray9719
				    [i + (111437289
					  * ((Class173_Sub3) this).anInt9735
					  * i_1279_)]
				    = i_1266_;
			    i_1263_ += i_1276_;
			    i++;
			    i_1270_ += i_1278_;
			    i_1270_ %= i_1273_;
			}
		    } else if (i_1267_ == 1) {
			i_1266_ = ((i_1277_ << 24)
				   + (((i_1266_ & 0xff00ff) * i_1277_ >> 8
				       & 0xff00ff)
				      + ((i_1266_ & 0xff00) * i_1277_ >> 8
					 & 0xff00)));
			int i_1280_ = 256 - i_1277_;
			while (i <= i_1264_) {
			    int i_1281_ = i_1263_ >> 16;
			    if (i >= (((Class173_Sub3) this).anInt9723
				      * -993497119)
				&& i < (630968029
					* ((Class173_Sub3) this).anInt9724)
				&& i_1281_ >= 592117349 * ((Class173_Sub3)
							   this).anInt9725
				&& i_1281_ < (((Class173_Sub3) this).anInt9726
					      * 6965409)
				&& i_1270_ < i_1268_) {
				int i_1282_
				    = i + (i_1281_
					   * (((Class173_Sub3) this).anInt9735
					      * 111437289));
				int i_1283_ = (((Class173_Sub3) this)
					       .anIntArray9719[i_1282_]);
				i_1283_
				    = (((i_1283_ & 0xff00) * i_1280_ >> 8
					& 0xff00)
				       + ((i_1283_ & 0xff00ff) * i_1280_ >> 8
					  & 0xff00ff));
				((Class173_Sub3) this).anIntArray9719[i_1282_]
				    = i_1266_ + i_1283_;
			    }
			    i_1263_ += i_1276_;
			    i++;
			    i_1270_ += i_1278_;
			    i_1270_ %= i_1273_;
			}
		    } else if (i_1267_ == 2) {
			while (i <= i_1264_) {
			    int i_1284_ = i_1263_ >> 16;
			    if (i >= (-993497119
				      * ((Class173_Sub3) this).anInt9723)
				&& i < (((Class173_Sub3) this).anInt9724
					* 630968029)
				&& i_1284_ >= 592117349 * ((Class173_Sub3)
							   this).anInt9725
				&& i_1284_ < (((Class173_Sub3) this).anInt9726
					      * 6965409)
				&& i_1270_ < i_1268_) {
				int i_1285_ = (((Class173_Sub3) this).anInt9735
					       * 111437289 * i_1284_) + i;
				int i_1286_ = (((Class173_Sub3) this)
					       .anIntArray9719[i_1285_]);
				int i_1287_ = i_1286_ + i_1266_;
				int i_1288_ = ((i_1266_ & 0xff00ff)
					       + (i_1286_ & 0xff00ff));
				i_1286_ = ((i_1287_ - i_1288_ & 0x10000)
					   + (i_1288_ & 0x1000100));
				((Class173_Sub3) this).anIntArray9719[i_1285_]
				    = i_1287_ - i_1286_ | i_1286_ - (i_1286_
								     >>> 8);
			    }
			    i_1263_ += i_1276_;
			    i++;
			    i_1270_ += i_1278_;
			    i_1270_ %= i_1273_;
			}
		    } else
			throw new IllegalArgumentException();
		} else {
		    i <<= 16;
		    i += 32768;
		    i_1264_ <<= 16;
		    int i_1289_ = (int) Math.floor(0.5 + ((double) i_1264_
							  / (double) i_1265_));
		    i_1265_ += i_1263_;
		    int i_1290_ = i_1266_ >>> 24;
		    int i_1291_
			= (int) Math.sqrt((double) ((i_1289_ >> 8) * (i_1289_
								      >> 8)
						    + 65536));
		    if (i_1267_ == 0 || 1 == i_1267_ && 255 == i_1290_) {
			while (i_1263_ <= i_1265_) {
			    int i_1292_ = i >> 16;
			    if (i_1263_ >= (592117349
					    * ((Class173_Sub3) this).anInt9725)
				&& i_1263_ < (((Class173_Sub3) this).anInt9726
					      * 6965409)
				&& i_1292_ >= (((Class173_Sub3) this).anInt9723
					       * -993497119)
				&& i_1292_ < 630968029 * ((Class173_Sub3)
							  this).anInt9724
				&& i_1270_ < i_1268_)
				((Class173_Sub3) this).anIntArray9719
				    [(i_1292_
				      + (111437289
					 * ((Class173_Sub3) this).anInt9735
					 * i_1263_))]
				    = i_1266_;
			    i += i_1289_;
			    i_1263_++;
			    i_1270_ += i_1291_;
			    i_1270_ %= i_1273_;
			}
		    } else if (i_1267_ == 1) {
			i_1266_ = ((i_1290_ * (i_1266_ & 0xff00) >> 8 & 0xff00)
				   + (i_1290_ * (i_1266_ & 0xff00ff) >> 8
				      & 0xff00ff)
				   + (i_1290_ << 24));
			int i_1293_ = 256 - i_1290_;
			while (i_1263_ <= i_1265_) {
			    int i_1294_ = i >> 16;
			    if (i_1263_ >= (((Class173_Sub3) this).anInt9725
					    * 592117349)
				&& i_1263_ < 6965409 * (((Class173_Sub3) this)
							.anInt9726)
				&& i_1294_ >= (((Class173_Sub3) this).anInt9723
					       * -993497119)
				&& i_1294_ < 630968029 * ((Class173_Sub3)
							  this).anInt9724
				&& i_1270_ < i_1268_) {
				int i_1295_
				    = (i_1294_
				       + (((Class173_Sub3) this).anInt9735
					  * 111437289 * i_1263_));
				int i_1296_ = (((Class173_Sub3) this)
					       .anIntArray9719[i_1295_]);
				i_1296_
				    = ((i_1293_ * (i_1296_ & 0xff00) >> 8
					& 0xff00)
				       + (i_1293_ * (i_1296_ & 0xff00ff) >> 8
					  & 0xff00ff));
				((Class173_Sub3) this).anIntArray9719
				    [(i_1294_
				      + (111437289
					 * ((Class173_Sub3) this).anInt9735
					 * i_1263_))]
				    = i_1266_ + i_1296_;
			    }
			    i += i_1289_;
			    i_1263_++;
			    i_1270_ += i_1291_;
			    i_1270_ %= i_1273_;
			}
		    } else if (2 == i_1267_) {
			while (i_1263_ <= i_1265_) {
			    int i_1297_ = i >> 16;
			    if (i_1263_ >= (592117349
					    * ((Class173_Sub3) this).anInt9725)
				&& i_1263_ < (((Class173_Sub3) this).anInt9726
					      * 6965409)
				&& i_1297_ >= (((Class173_Sub3) this).anInt9723
					       * -993497119)
				&& i_1297_ < (((Class173_Sub3) this).anInt9724
					      * 630968029)
				&& i_1270_ < i_1268_) {
				int i_1298_
				    = ((i_1263_
					* (111437289
					   * ((Class173_Sub3) this).anInt9735))
				       + i_1297_);
				int i_1299_ = (((Class173_Sub3) this)
					       .anIntArray9719[i_1298_]);
				int i_1300_ = i_1266_ + i_1299_;
				int i_1301_ = ((i_1266_ & 0xff00ff)
					       + (i_1299_ & 0xff00ff));
				i_1299_ = ((i_1301_ & 0x1000100)
					   + (i_1300_ - i_1301_ & 0x10000));
				((Class173_Sub3) this).anIntArray9719[i_1298_]
				    = i_1300_ - i_1299_ | i_1299_ - (i_1299_
								     >>> 8);
			    }
			    i += i_1289_;
			    i_1263_++;
			    i_1270_ += i_1291_;
			    i_1270_ %= i_1273_;
			}
		    } else
			throw new IllegalArgumentException();
		}
	    }
	}
    }
    
    public void method2506(int i, int i_1302_, int i_1303_, int i_1304_,
			   int i_1305_, int i_1306_, int i_1307_) {
	if (null != ((Class173_Sub3) this).anIntArray9719) {
	    Class107 class107 = method8939(Thread.currentThread());
	    Class121 class121 = ((Class107) class107).aClass121_1330;
	    int i_1308_ = i_1303_ - i;
	    int i_1309_ = i_1304_ - i_1302_;
	    int i_1310_ = i_1308_ >= 0 ? i_1308_ : -i_1308_;
	    int i_1311_ = i_1309_ >= 0 ? i_1309_ : -i_1309_;
	    int i_1312_ = i_1310_;
	    if (i_1312_ < i_1311_)
		i_1312_ = i_1311_;
	    if (0 != i_1312_) {
		int i_1313_ = (i_1308_ << 16) / i_1312_;
		int i_1314_ = (i_1309_ << 16) / i_1312_;
		i_1308_ += i_1313_ >> 16;
		i_1309_ += i_1314_ >> 16;
		if (i_1314_ <= i_1313_)
		    i_1313_ = -i_1313_;
		else
		    i_1314_ = -i_1314_;
		int i_1315_ = i_1306_ * i_1314_ >> 17;
		int i_1316_ = 1 + i_1306_ * i_1314_ >> 17;
		int i_1317_ = i_1306_ * i_1313_ >> 17;
		int i_1318_ = 1 + i_1306_ * i_1313_ >> 17;
		i -= class121.method1593();
		i_1302_ -= class121.method1577();
		int i_1319_ = i_1315_ + i;
		int i_1320_ = i - i_1316_;
		int i_1321_ = i + i_1308_ - i_1316_;
		int i_1322_ = i_1315_ + (i_1308_ + i);
		int i_1323_ = i_1302_ + i_1317_;
		int i_1324_ = i_1302_ - i_1318_;
		int i_1325_ = i_1309_ + i_1302_ - i_1318_;
		int i_1326_ = i_1309_ + i_1302_ + i_1317_;
		if (i_1307_ == 0)
		    ((Class121) class121).anInt1526 = 0;
		else if (1 == i_1307_)
		    ((Class121) class121).anInt1526 = 255 - (i_1305_ >>> 24);
		else
		    throw new IllegalArgumentException();
		method2283(false);
		((Class121) class121).aBool1504
		    = (i_1319_ < 0 || i_1319_ > ((Class121) class121).anInt1513
		       || i_1320_ < 0
		       || i_1320_ > ((Class121) class121).anInt1513
		       || i_1321_ < 0
		       || i_1321_ > ((Class121) class121).anInt1513);
		class121.method1582(true, false, false, (float) i_1323_,
				    (float) i_1324_, (float) i_1325_,
				    (float) i_1319_, (float) i_1320_,
				    (float) i_1321_, 100.0F, 100.0F, 100.0F,
				    i_1305_);
		((Class121) class121).aBool1504
		    = (i_1319_ < 0 || i_1319_ > ((Class121) class121).anInt1513
		       || i_1321_ < 0
		       || i_1321_ > ((Class121) class121).anInt1513
		       || i_1322_ < 0
		       || i_1322_ > ((Class121) class121).anInt1513);
		class121.method1582(true, false, false, (float) i_1323_,
				    (float) i_1325_, (float) i_1326_,
				    (float) i_1319_, (float) i_1321_,
				    (float) i_1322_, 100.0F, 100.0F, 100.0F,
				    i_1305_);
		method2283(true);
	    }
	}
    }
    
    public Class137 method2534(int i, int i_1327_, int[][] is,
			       int[][] is_1328_, int i_1329_, int i_1330_,
			       int i_1331_) {
	return new Class137_Sub1(this, i_1330_, i_1331_, i, i_1327_, is,
				 is_1328_, i_1329_);
    }
    
    public void method2508(int i, int i_1332_, int i_1333_, int i_1334_,
			   int i_1335_, int i_1336_, int i_1337_) {
	if (null != ((Class173_Sub3) this).anIntArray9719) {
	    Class107 class107 = method8939(Thread.currentThread());
	    Class121 class121 = ((Class107) class107).aClass121_1330;
	    int i_1338_ = i_1333_ - i;
	    int i_1339_ = i_1334_ - i_1332_;
	    int i_1340_ = i_1338_ >= 0 ? i_1338_ : -i_1338_;
	    int i_1341_ = i_1339_ >= 0 ? i_1339_ : -i_1339_;
	    int i_1342_ = i_1340_;
	    if (i_1342_ < i_1341_)
		i_1342_ = i_1341_;
	    if (0 != i_1342_) {
		int i_1343_ = (i_1338_ << 16) / i_1342_;
		int i_1344_ = (i_1339_ << 16) / i_1342_;
		i_1338_ += i_1343_ >> 16;
		i_1339_ += i_1344_ >> 16;
		if (i_1344_ <= i_1343_)
		    i_1343_ = -i_1343_;
		else
		    i_1344_ = -i_1344_;
		int i_1345_ = i_1336_ * i_1344_ >> 17;
		int i_1346_ = 1 + i_1336_ * i_1344_ >> 17;
		int i_1347_ = i_1336_ * i_1343_ >> 17;
		int i_1348_ = 1 + i_1336_ * i_1343_ >> 17;
		i -= class121.method1593();
		i_1332_ -= class121.method1577();
		int i_1349_ = i_1345_ + i;
		int i_1350_ = i - i_1346_;
		int i_1351_ = i + i_1338_ - i_1346_;
		int i_1352_ = i_1345_ + (i_1338_ + i);
		int i_1353_ = i_1332_ + i_1347_;
		int i_1354_ = i_1332_ - i_1348_;
		int i_1355_ = i_1339_ + i_1332_ - i_1348_;
		int i_1356_ = i_1339_ + i_1332_ + i_1347_;
		if (i_1337_ == 0)
		    ((Class121) class121).anInt1526 = 0;
		else if (1 == i_1337_)
		    ((Class121) class121).anInt1526 = 255 - (i_1335_ >>> 24);
		else
		    throw new IllegalArgumentException();
		method2283(false);
		((Class121) class121).aBool1504
		    = (i_1349_ < 0 || i_1349_ > ((Class121) class121).anInt1513
		       || i_1350_ < 0
		       || i_1350_ > ((Class121) class121).anInt1513
		       || i_1351_ < 0
		       || i_1351_ > ((Class121) class121).anInt1513);
		class121.method1582(true, false, false, (float) i_1353_,
				    (float) i_1354_, (float) i_1355_,
				    (float) i_1349_, (float) i_1350_,
				    (float) i_1351_, 100.0F, 100.0F, 100.0F,
				    i_1335_);
		((Class121) class121).aBool1504
		    = (i_1349_ < 0 || i_1349_ > ((Class121) class121).anInt1513
		       || i_1351_ < 0
		       || i_1351_ > ((Class121) class121).anInt1513
		       || i_1352_ < 0
		       || i_1352_ > ((Class121) class121).anInt1513);
		class121.method1582(true, false, false, (float) i_1353_,
				    (float) i_1355_, (float) i_1356_,
				    (float) i_1349_, (float) i_1351_,
				    (float) i_1352_, 100.0F, 100.0F, 100.0F,
				    i_1335_);
		method2283(true);
	    }
	}
    }
    
    public void method2544(float f, float f_1357_, float f_1358_, float[] fs) {
	float f_1359_
	    = (f * ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[2]
	       + ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[14]
	       + (f_1357_
		  * ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[6])
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[10]
		  * f_1358_));
	float f_1360_
	    = ((f_1358_
		* ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[11])
	       + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[3] * f
		  + ((Class173_Sub3) this).aClass418_9736.aFloatArray4768[15]
		  + (((Class173_Sub3) this).aClass418_9736.aFloatArray4768[7]
		     * f_1357_)));
	if (f_1359_ < -f_1360_ || f_1359_ > f_1360_) {
	    float[] fs_1361_ = fs;
	    float[] fs_1362_ = fs;
	    fs[2] = Float.NaN;
	    fs_1362_[1] = Float.NaN;
	    fs_1361_[0] = Float.NaN;
	} else {
	    float f_1363_ = (f_1358_ * (((Class173_Sub3) this).aClass418_9736
					.aFloatArray4768[8])
			     + (f_1357_ * (((Class173_Sub3) this)
					   .aClass418_9736.aFloatArray4768[4])
				+ ((((Class173_Sub3) this).aClass418_9736
				    .aFloatArray4768[0]) * f
				   + (((Class173_Sub3) this).aClass418_9736
				      .aFloatArray4768[12]))));
	    if (f_1363_ < -f_1360_ || f_1363_ > f_1360_) {
		float[] fs_1364_ = fs;
		float[] fs_1365_ = fs;
		fs[2] = Float.NaN;
		fs_1365_[1] = Float.NaN;
		fs_1364_[0] = Float.NaN;
	    } else {
		float f_1366_ = (f_1358_ * (((Class173_Sub3) this)
					    .aClass418_9736.aFloatArray4768[9])
				 + ((((Class173_Sub3) this).aClass418_9736
				     .aFloatArray4768[5]) * f_1357_
				    + ((((Class173_Sub3) this).aClass418_9736
					.aFloatArray4768[13])
				       + (((Class173_Sub3) this).aClass418_9736
					  .aFloatArray4768[1]) * f)));
		if (f_1366_ < -f_1360_ || f_1366_ > f_1360_) {
		    float[] fs_1367_ = fs;
		    float[] fs_1368_ = fs;
		    fs[2] = Float.NaN;
		    fs_1368_[1] = Float.NaN;
		    fs_1367_[0] = Float.NaN;
		} else {
		    float f_1369_
			= ((((Class173_Sub3) this).aClass418_9734
			    .aFloatArray4768[10]) * f_1358_
			   + ((((Class173_Sub3) this).aClass418_9734
			       .aFloatArray4768[6]) * f_1357_
			      + ((((Class173_Sub3) this).aClass418_9734
				  .aFloatArray4768[14])
				 + f * (((Class173_Sub3) this).aClass418_9734
					.aFloatArray4768[2]))));
		    fs[0] = (((Class173_Sub3) this).aFloat9743
			     + (((Class173_Sub3) this).aFloat9742 * f_1363_
				/ f_1360_));
		    fs[1] = (f_1366_ * ((Class173_Sub3) this).aFloat9744
			     / f_1360_) + ((Class173_Sub3) this).aFloat9751;
		    fs[2] = f_1369_;
		}
	    }
	}
    }
    
    public void method2510(int i, int i_1370_, int i_1371_, int i_1372_,
			   int i_1373_, int i_1374_, int i_1375_) {
	if (null != ((Class173_Sub3) this).anIntArray9719) {
	    Class107 class107 = method8939(Thread.currentThread());
	    Class121 class121 = ((Class107) class107).aClass121_1330;
	    int i_1376_ = i_1371_ - i;
	    int i_1377_ = i_1372_ - i_1370_;
	    int i_1378_ = i_1376_ >= 0 ? i_1376_ : -i_1376_;
	    int i_1379_ = i_1377_ >= 0 ? i_1377_ : -i_1377_;
	    int i_1380_ = i_1378_;
	    if (i_1380_ < i_1379_)
		i_1380_ = i_1379_;
	    if (0 != i_1380_) {
		int i_1381_ = (i_1376_ << 16) / i_1380_;
		int i_1382_ = (i_1377_ << 16) / i_1380_;
		i_1376_ += i_1381_ >> 16;
		i_1377_ += i_1382_ >> 16;
		if (i_1382_ <= i_1381_)
		    i_1381_ = -i_1381_;
		else
		    i_1382_ = -i_1382_;
		int i_1383_ = i_1374_ * i_1382_ >> 17;
		int i_1384_ = 1 + i_1374_ * i_1382_ >> 17;
		int i_1385_ = i_1374_ * i_1381_ >> 17;
		int i_1386_ = 1 + i_1374_ * i_1381_ >> 17;
		i -= class121.method1593();
		i_1370_ -= class121.method1577();
		int i_1387_ = i_1383_ + i;
		int i_1388_ = i - i_1384_;
		int i_1389_ = i + i_1376_ - i_1384_;
		int i_1390_ = i_1383_ + (i_1376_ + i);
		int i_1391_ = i_1370_ + i_1385_;
		int i_1392_ = i_1370_ - i_1386_;
		int i_1393_ = i_1377_ + i_1370_ - i_1386_;
		int i_1394_ = i_1377_ + i_1370_ + i_1385_;
		if (i_1375_ == 0)
		    ((Class121) class121).anInt1526 = 0;
		else if (1 == i_1375_)
		    ((Class121) class121).anInt1526 = 255 - (i_1373_ >>> 24);
		else
		    throw new IllegalArgumentException();
		method2283(false);
		((Class121) class121).aBool1504
		    = (i_1387_ < 0 || i_1387_ > ((Class121) class121).anInt1513
		       || i_1388_ < 0
		       || i_1388_ > ((Class121) class121).anInt1513
		       || i_1389_ < 0
		       || i_1389_ > ((Class121) class121).anInt1513);
		class121.method1582(true, false, false, (float) i_1391_,
				    (float) i_1392_, (float) i_1393_,
				    (float) i_1387_, (float) i_1388_,
				    (float) i_1389_, 100.0F, 100.0F, 100.0F,
				    i_1373_);
		((Class121) class121).aBool1504
		    = (i_1387_ < 0 || i_1387_ > ((Class121) class121).anInt1513
		       || i_1389_ < 0
		       || i_1389_ > ((Class121) class121).anInt1513
		       || i_1390_ < 0
		       || i_1390_ > ((Class121) class121).anInt1513);
		class121.method1582(true, false, false, (float) i_1391_,
				    (float) i_1393_, (float) i_1394_,
				    (float) i_1387_, (float) i_1389_,
				    (float) i_1390_, 100.0F, 100.0F, 100.0F,
				    i_1373_);
		method2283(true);
	    }
	}
    }
    
    public Class137 method2369(int i, int i_1395_, int[][] is,
			       int[][] is_1396_, int i_1397_, int i_1398_,
			       int i_1399_) {
	return new Class137_Sub1(this, i_1398_, i_1399_, i, i_1395_, is,
				 is_1396_, i_1397_);
    }
    
    void method2435(float f, float f_1400_, float f_1401_, float f_1402_,
		    float f_1403_, float f_1404_) {
	/* empty */
    }
    
    public void method2329(long l) {
	/* empty */
    }
    
    public long method2324(int i, int i_1405_) {
	return 0L;
    }
    
    public Interface21 method2202(int i, int i_1406_, int i_1407_) {
	return new Class112(i, i_1406_);
    }
    
    public void method2365(int i, int i_1408_, int i_1409_, int i_1410_,
			   int i_1411_, int i_1412_, Class148 class148,
			   int i_1413_, int i_1414_, int i_1415_, int i_1416_,
			   int i_1417_) {
	if (null != ((Class173_Sub3) this).anIntArray9719) {
	    Class148_Sub1 class148_sub1 = (Class148_Sub1) class148;
	    int[] is = ((Class148_Sub1) class148_sub1).anIntArray8789;
	    int[] is_1418_ = ((Class148_Sub1) class148_sub1).anIntArray8788;
	    int i_1419_
		= (((Class173_Sub3) this).anInt9725 * 592117349 > i_1414_
		   ? ((Class173_Sub3) this).anInt9725 * 592117349 : i_1414_);
	    int i_1420_ = ((((Class173_Sub3) this).anInt9726 * 6965409
			    < i_1414_ + is.length)
			   ? ((Class173_Sub3) this).anInt9726 * 6965409
			   : is.length + i_1414_);
	    i_1417_ <<= 8;
	    i_1415_ <<= 8;
	    i_1416_ <<= 8;
	    int i_1421_ = i_1416_ + i_1415_;
	    i_1417_ %= i_1421_;
	    i_1409_ -= i;
	    i_1410_ -= i_1408_;
	    if (i_1410_ + i_1409_ < 0) {
		int i_1422_ = (int) (Math.sqrt((double) (i_1409_ * i_1409_
							 + i_1410_ * i_1410_))
				     * 256.0);
		int i_1423_ = i_1422_ % i_1421_;
		i_1417_ = i_1421_ + i_1415_ - i_1417_ - i_1423_;
		i_1417_ %= i_1421_;
		if (i_1417_ < 0)
		    i_1417_ += i_1421_;
		i += i_1409_;
		i_1409_ = -i_1409_;
		i_1408_ += i_1410_;
		i_1410_ = -i_1410_;
	    }
	    if (i_1409_ > i_1410_) {
		i_1408_ <<= 16;
		i_1408_ += 32768;
		i_1410_ <<= 16;
		int i_1424_
		    = (int) Math.floor((double) i_1410_ / (double) i_1409_
				       + 0.5);
		i_1409_ += i;
		int i_1425_ = i_1411_ >>> 24;
		int i_1426_
		    = (int) Math.sqrt((double) (65536
						+ (i_1424_ >> 8) * (i_1424_
								    >> 8)));
		if (i_1412_ == 0 || i_1412_ == 1 && 255 == i_1425_) {
		    while (i <= i_1409_) {
			int i_1427_ = i_1408_ >> 16;
			int i_1428_ = i_1427_ - i_1414_;
			if (i >= ((Class173_Sub3) this).anInt9723 * -993497119
			    && i < ((Class173_Sub3) this).anInt9724 * 630968029
			    && i_1427_ >= i_1419_ && i_1427_ < i_1420_
			    && i_1417_ < i_1415_) {
			    int i_1429_ = i_1413_ + is[i_1428_];
			    if (i >= i_1429_
				&& i < i_1429_ + is_1418_[i_1428_])
				((Class173_Sub3) this).anIntArray9719
				    [i + (i_1427_
					  * (((Class173_Sub3) this).anInt9735
					     * 111437289))]
				    = i_1411_;
			}
			i_1408_ += i_1424_;
			i++;
			i_1417_ += i_1426_;
			i_1417_ %= i_1421_;
		    }
		} else if (i_1412_ == 1) {
		    i_1411_
			= ((i_1425_ << 24)
			   + ((i_1425_ * (i_1411_ & 0xff00ff) >> 8 & 0xff00ff)
			      + (i_1425_ * (i_1411_ & 0xff00) >> 8 & 0xff00)));
		    int i_1430_ = 256 - i_1425_;
		    while (i <= i_1409_) {
			int i_1431_ = i_1408_ >> 16;
			int i_1432_ = i_1431_ - i_1414_;
			if (i >= -993497119 * ((Class173_Sub3) this).anInt9723
			    && i < 630968029 * ((Class173_Sub3) this).anInt9724
			    && i_1431_ >= i_1419_ && i_1431_ < i_1420_
			    && i_1417_ < i_1415_) {
			    int i_1433_ = i_1413_ + is[i_1432_];
			    if (i >= i_1433_
				&& i < i_1433_ + is_1418_[i_1432_]) {
				int i_1434_
				    = i + (111437289
					   * ((Class173_Sub3) this).anInt9735
					   * i_1431_);
				int i_1435_ = (((Class173_Sub3) this)
					       .anIntArray9719[i_1434_]);
				i_1435_ = ((i_1430_ * (i_1435_ & 0xff00ff) >> 8
					    & 0xff00ff)
					   + (i_1430_ * (i_1435_ & 0xff00) >> 8
					      & 0xff00));
				((Class173_Sub3) this).anIntArray9719[i_1434_]
				    = i_1435_ + i_1411_;
			    }
			}
			i_1408_ += i_1424_;
			i++;
			i_1417_ += i_1426_;
			i_1417_ %= i_1421_;
		    }
		} else if (i_1412_ == 2) {
		    while (i <= i_1409_) {
			int i_1436_ = i_1408_ >> 16;
			int i_1437_ = i_1436_ - i_1414_;
			if (i >= -993497119 * ((Class173_Sub3) this).anInt9723
			    && i < 630968029 * ((Class173_Sub3) this).anInt9724
			    && i_1436_ >= i_1419_ && i_1436_ < i_1420_
			    && i_1417_ < i_1415_) {
			    int i_1438_ = is[i_1437_] + i_1413_;
			    if (i >= i_1438_
				&& i < is_1418_[i_1437_] + i_1438_) {
				int i_1439_
				    = ((i_1436_
					* (111437289
					   * ((Class173_Sub3) this).anInt9735))
				       + i);
				int i_1440_ = (((Class173_Sub3) this)
					       .anIntArray9719[i_1439_]);
				int i_1441_ = i_1440_ + i_1411_;
				int i_1442_ = ((i_1440_ & 0xff00ff)
					       + (i_1411_ & 0xff00ff));
				i_1440_ = ((i_1441_ - i_1442_ & 0x10000)
					   + (i_1442_ & 0x1000100));
				((Class173_Sub3) this).anIntArray9719[i_1439_]
				    = i_1441_ - i_1440_ | i_1440_ - (i_1440_
								     >>> 8);
			    }
			}
			i_1408_ += i_1424_;
			i++;
			i_1417_ += i_1426_;
			i_1417_ %= i_1421_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else {
		i <<= 16;
		i += 32768;
		i_1409_ <<= 16;
		int i_1443_ = (int) Math.floor(0.5 + ((double) i_1409_
						      / (double) i_1410_));
		int i_1444_
		    = (int) Math.sqrt((double) (65536
						+ (i_1443_ >> 8) * (i_1443_
								    >> 8)));
		i_1410_ += i_1408_;
		int i_1445_ = i_1411_ >>> 24;
		if (0 == i_1412_ || 1 == i_1412_ && i_1445_ == 255) {
		    while (i_1408_ <= i_1410_) {
			int i_1446_ = i >> 16;
			int i_1447_ = i_1408_ - i_1414_;
			if (i_1408_ >= i_1419_ && i_1408_ < i_1420_
			    && i_1446_ >= (((Class173_Sub3) this).anInt9723
					   * -993497119)
			    && (i_1446_
				< 630968029 * ((Class173_Sub3) this).anInt9724)
			    && i_1417_ < i_1415_
			    && i_1446_ >= i_1413_ + is[i_1447_]
			    && (i_1446_
				< is[i_1447_] + i_1413_ + is_1418_[i_1447_]))
			    ((Class173_Sub3) this).anIntArray9719
				[i_1408_ * (((Class173_Sub3) this).anInt9735
					    * 111437289) + i_1446_]
				= i_1411_;
			i += i_1443_;
			i_1408_++;
			i_1417_ += i_1444_;
			i_1417_ %= i_1421_;
		    }
		} else if (i_1412_ == 1) {
		    i_1411_ = ((i_1445_ << 24)
			       + ((i_1445_ * (i_1411_ & 0xff00) >> 8 & 0xff00)
				  + ((i_1411_ & 0xff00ff) * i_1445_ >> 8
				     & 0xff00ff)));
		    int i_1448_ = 256 - i_1445_;
		    while (i_1408_ <= i_1410_) {
			int i_1449_ = i >> 16;
			int i_1450_ = i_1408_ - i_1414_;
			if (i_1408_ >= i_1419_ && i_1408_ < i_1420_
			    && i_1449_ >= (((Class173_Sub3) this).anInt9723
					   * -993497119)
			    && (i_1449_
				< 630968029 * ((Class173_Sub3) this).anInt9724)
			    && i_1417_ < i_1415_
			    && i_1449_ >= is[i_1450_] + i_1413_
			    && i_1449_ < is_1418_[i_1450_] + (i_1413_
							      + is[i_1450_])) {
			    int i_1451_
				= i_1449_ + i_1408_ * ((((Class173_Sub3) this)
							.anInt9735)
						       * 111437289);
			    int i_1452_ = (((Class173_Sub3) this)
					   .anIntArray9719[i_1451_]);
			    i_1452_
				= (((i_1452_ & 0xff00) * i_1448_ >> 8 & 0xff00)
				   + ((i_1452_ & 0xff00ff) * i_1448_ >> 8
				      & 0xff00ff));
			    ((Class173_Sub3) this).anIntArray9719
				[i_1408_ * (111437289
					    * (((Class173_Sub3) this)
					       .anInt9735)) + i_1449_]
				= i_1452_ + i_1411_;
			}
			i += i_1443_;
			i_1408_++;
			i_1417_ += i_1444_;
			i_1417_ %= i_1421_;
		    }
		} else if (2 == i_1412_) {
		    while (i_1408_ <= i_1410_) {
			int i_1453_ = i >> 16;
			int i_1454_ = i_1408_ - i_1414_;
			if (i_1408_ >= i_1419_ && i_1408_ < i_1420_
			    && i_1453_ >= (((Class173_Sub3) this).anInt9723
					   * -993497119)
			    && (i_1453_
				< 630968029 * ((Class173_Sub3) this).anInt9724)
			    && i_1417_ < i_1415_
			    && i_1453_ >= is[i_1454_] + i_1413_
			    && (i_1453_
				< i_1413_ + is[i_1454_] + is_1418_[i_1454_])) {
			    int i_1455_
				= (i_1453_
				   + (i_1408_
				      * (111437289
					 * ((Class173_Sub3) this).anInt9735)));
			    int i_1456_ = (((Class173_Sub3) this)
					   .anIntArray9719[i_1455_]);
			    int i_1457_ = i_1411_ + i_1456_;
			    int i_1458_
				= (i_1411_ & 0xff00ff) + (i_1456_ & 0xff00ff);
			    i_1456_
				= (i_1458_ & 0x1000100) + (i_1457_ - i_1458_
							   & 0x10000);
			    ((Class173_Sub3) this).anIntArray9719[i_1455_]
				= i_1457_ - i_1456_ | i_1456_ - (i_1456_
								 >>> 8);
			}
			i += i_1443_;
			i_1408_++;
			i_1417_ += i_1444_;
			i_1417_ %= i_1421_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method2308(int[] is) {
	is[0] = ((Class173_Sub3) this).anInt9723 * -993497119;
	is[1] = 592117349 * ((Class173_Sub3) this).anInt9725;
	is[2] = ((Class173_Sub3) this).anInt9724 * 630968029;
	is[3] = 6965409 * ((Class173_Sub3) this).anInt9726;
    }
    
    public void method2518(boolean bool) {
	Class107 class107 = method8939(Thread.currentThread());
	((Class107) class107).aBool1344 = bool;
    }
    
    public void method2221(int i, int i_1459_, int i_1460_, int i_1461_,
			   int i_1462_, int i_1463_, int i_1464_, int i_1465_,
			   int i_1466_) {
	if (((Class173_Sub3) this).anIntArray9719 != null) {
	    i_1460_ -= i;
	    i_1461_ -= i_1459_;
	    if (i_1461_ == 0) {
		if (i_1460_ >= 0)
		    method8935(i, i_1459_, i_1460_ + 1, i_1462_, i_1463_,
			       i_1464_, i_1465_, i_1466_);
		else {
		    int i_1467_ = i_1465_ + i_1464_;
		    i_1466_ %= i_1467_;
		    i_1466_ = (i_1467_ + i_1464_ - i_1466_
			       - (1 + -i_1460_) % i_1467_);
		    i_1466_ %= i_1467_;
		    if (i_1466_ < 0)
			i_1466_ += i_1467_;
		    method8935(i + i_1460_, i_1459_, -i_1460_ + 1, i_1462_,
			       i_1463_, i_1464_, i_1465_, i_1466_);
		}
	    } else if (i_1460_ == 0) {
		if (i_1461_ >= 0)
		    method8931(i, i_1459_, i_1461_ + 1, i_1462_, i_1463_,
			       i_1464_, i_1465_, i_1466_);
		else {
		    int i_1468_ = i_1465_ + i_1464_;
		    i_1466_ %= i_1468_;
		    i_1466_ = (i_1468_ + i_1464_ - i_1466_
			       - (1 + -i_1461_) % i_1468_);
		    i_1466_ %= i_1468_;
		    if (i_1466_ < 0)
			i_1466_ += i_1468_;
		    method8931(i, i_1459_ + i_1461_, 1 + -i_1461_, i_1462_,
			       i_1463_, i_1464_, i_1465_, i_1466_);
		}
	    } else {
		i_1466_ <<= 8;
		i_1464_ <<= 8;
		i_1465_ <<= 8;
		int i_1469_ = i_1465_ + i_1464_;
		i_1466_ %= i_1469_;
		if (i_1461_ + i_1460_ < 0) {
		    int i_1470_
			= (int) (Math.sqrt((double) (i_1461_ * i_1461_
						     + i_1460_ * i_1460_))
				 * 256.0);
		    int i_1471_ = i_1470_ % i_1469_;
		    i_1466_ = i_1469_ + i_1464_ - i_1466_ - i_1471_;
		    i_1466_ %= i_1469_;
		    if (i_1466_ < 0)
			i_1466_ += i_1469_;
		    i += i_1460_;
		    i_1460_ = -i_1460_;
		    i_1459_ += i_1461_;
		    i_1461_ = -i_1461_;
		}
		if (i_1460_ > i_1461_) {
		    i_1459_ <<= 16;
		    i_1459_ += 32768;
		    i_1461_ <<= 16;
		    int i_1472_ = (int) Math.floor(0.5 + ((double) i_1461_
							  / (double) i_1460_));
		    i_1460_ += i;
		    int i_1473_ = i_1462_ >>> 24;
		    int i_1474_
			= (int) Math.sqrt((double) (65536
						    + ((i_1472_ >> 8)
						       * (i_1472_ >> 8))));
		    if (i_1463_ == 0 || 1 == i_1463_ && i_1473_ == 255) {
			while (i <= i_1460_) {
			    int i_1475_ = i_1459_ >> 16;
			    if (i >= (-993497119
				      * ((Class173_Sub3) this).anInt9723)
				&& i < (630968029
					* ((Class173_Sub3) this).anInt9724)
				&& i_1475_ >= 592117349 * ((Class173_Sub3)
							   this).anInt9725
				&& i_1475_ < 6965409 * (((Class173_Sub3) this)
							.anInt9726)
				&& i_1466_ < i_1464_)
				((Class173_Sub3) this).anIntArray9719
				    [i + (111437289
					  * ((Class173_Sub3) this).anInt9735
					  * i_1475_)]
				    = i_1462_;
			    i_1459_ += i_1472_;
			    i++;
			    i_1466_ += i_1474_;
			    i_1466_ %= i_1469_;
			}
		    } else if (i_1463_ == 1) {
			i_1462_ = ((i_1473_ << 24)
				   + (((i_1462_ & 0xff00ff) * i_1473_ >> 8
				       & 0xff00ff)
				      + ((i_1462_ & 0xff00) * i_1473_ >> 8
					 & 0xff00)));
			int i_1476_ = 256 - i_1473_;
			while (i <= i_1460_) {
			    int i_1477_ = i_1459_ >> 16;
			    if (i >= (((Class173_Sub3) this).anInt9723
				      * -993497119)
				&& i < (630968029
					* ((Class173_Sub3) this).anInt9724)
				&& i_1477_ >= 592117349 * ((Class173_Sub3)
							   this).anInt9725
				&& i_1477_ < (((Class173_Sub3) this).anInt9726
					      * 6965409)
				&& i_1466_ < i_1464_) {
				int i_1478_
				    = i + (i_1477_
					   * (((Class173_Sub3) this).anInt9735
					      * 111437289));
				int i_1479_ = (((Class173_Sub3) this)
					       .anIntArray9719[i_1478_]);
				i_1479_
				    = (((i_1479_ & 0xff00) * i_1476_ >> 8
					& 0xff00)
				       + ((i_1479_ & 0xff00ff) * i_1476_ >> 8
					  & 0xff00ff));
				((Class173_Sub3) this).anIntArray9719[i_1478_]
				    = i_1462_ + i_1479_;
			    }
			    i_1459_ += i_1472_;
			    i++;
			    i_1466_ += i_1474_;
			    i_1466_ %= i_1469_;
			}
		    } else if (i_1463_ == 2) {
			while (i <= i_1460_) {
			    int i_1480_ = i_1459_ >> 16;
			    if (i >= (-993497119
				      * ((Class173_Sub3) this).anInt9723)
				&& i < (((Class173_Sub3) this).anInt9724
					* 630968029)
				&& i_1480_ >= 592117349 * ((Class173_Sub3)
							   this).anInt9725
				&& i_1480_ < (((Class173_Sub3) this).anInt9726
					      * 6965409)
				&& i_1466_ < i_1464_) {
				int i_1481_ = (((Class173_Sub3) this).anInt9735
					       * 111437289 * i_1480_) + i;
				int i_1482_ = (((Class173_Sub3) this)
					       .anIntArray9719[i_1481_]);
				int i_1483_ = i_1482_ + i_1462_;
				int i_1484_ = ((i_1462_ & 0xff00ff)
					       + (i_1482_ & 0xff00ff));
				i_1482_ = ((i_1483_ - i_1484_ & 0x10000)
					   + (i_1484_ & 0x1000100));
				((Class173_Sub3) this).anIntArray9719[i_1481_]
				    = i_1483_ - i_1482_ | i_1482_ - (i_1482_
								     >>> 8);
			    }
			    i_1459_ += i_1472_;
			    i++;
			    i_1466_ += i_1474_;
			    i_1466_ %= i_1469_;
			}
		    } else
			throw new IllegalArgumentException();
		} else {
		    i <<= 16;
		    i += 32768;
		    i_1460_ <<= 16;
		    int i_1485_ = (int) Math.floor(0.5 + ((double) i_1460_
							  / (double) i_1461_));
		    i_1461_ += i_1459_;
		    int i_1486_ = i_1462_ >>> 24;
		    int i_1487_
			= (int) Math.sqrt((double) ((i_1485_ >> 8) * (i_1485_
								      >> 8)
						    + 65536));
		    if (i_1463_ == 0 || 1 == i_1463_ && 255 == i_1486_) {
			while (i_1459_ <= i_1461_) {
			    int i_1488_ = i >> 16;
			    if (i_1459_ >= (592117349
					    * ((Class173_Sub3) this).anInt9725)
				&& i_1459_ < (((Class173_Sub3) this).anInt9726
					      * 6965409)
				&& i_1488_ >= (((Class173_Sub3) this).anInt9723
					       * -993497119)
				&& i_1488_ < 630968029 * ((Class173_Sub3)
							  this).anInt9724
				&& i_1466_ < i_1464_)
				((Class173_Sub3) this).anIntArray9719
				    [(i_1488_
				      + (111437289
					 * ((Class173_Sub3) this).anInt9735
					 * i_1459_))]
				    = i_1462_;
			    i += i_1485_;
			    i_1459_++;
			    i_1466_ += i_1487_;
			    i_1466_ %= i_1469_;
			}
		    } else if (i_1463_ == 1) {
			i_1462_ = ((i_1486_ * (i_1462_ & 0xff00) >> 8 & 0xff00)
				   + (i_1486_ * (i_1462_ & 0xff00ff) >> 8
				      & 0xff00ff)
				   + (i_1486_ << 24));
			int i_1489_ = 256 - i_1486_;
			while (i_1459_ <= i_1461_) {
			    int i_1490_ = i >> 16;
			    if (i_1459_ >= (((Class173_Sub3) this).anInt9725
					    * 592117349)
				&& i_1459_ < 6965409 * (((Class173_Sub3) this)
							.anInt9726)
				&& i_1490_ >= (((Class173_Sub3) this).anInt9723
					       * -993497119)
				&& i_1490_ < 630968029 * ((Class173_Sub3)
							  this).anInt9724
				&& i_1466_ < i_1464_) {
				int i_1491_
				    = (i_1490_
				       + (((Class173_Sub3) this).anInt9735
					  * 111437289 * i_1459_));
				int i_1492_ = (((Class173_Sub3) this)
					       .anIntArray9719[i_1491_]);
				i_1492_
				    = ((i_1489_ * (i_1492_ & 0xff00) >> 8
					& 0xff00)
				       + (i_1489_ * (i_1492_ & 0xff00ff) >> 8
					  & 0xff00ff));
				((Class173_Sub3) this).anIntArray9719
				    [(i_1490_
				      + (111437289
					 * ((Class173_Sub3) this).anInt9735
					 * i_1459_))]
				    = i_1462_ + i_1492_;
			    }
			    i += i_1485_;
			    i_1459_++;
			    i_1466_ += i_1487_;
			    i_1466_ %= i_1469_;
			}
		    } else if (2 == i_1463_) {
			while (i_1459_ <= i_1461_) {
			    int i_1493_ = i >> 16;
			    if (i_1459_ >= (592117349
					    * ((Class173_Sub3) this).anInt9725)
				&& i_1459_ < (((Class173_Sub3) this).anInt9726
					      * 6965409)
				&& i_1493_ >= (((Class173_Sub3) this).anInt9723
					       * -993497119)
				&& i_1493_ < (((Class173_Sub3) this).anInt9724
					      * 630968029)
				&& i_1466_ < i_1464_) {
				int i_1494_
				    = ((i_1459_
					* (111437289
					   * ((Class173_Sub3) this).anInt9735))
				       + i_1493_);
				int i_1495_ = (((Class173_Sub3) this)
					       .anIntArray9719[i_1494_]);
				int i_1496_ = i_1462_ + i_1495_;
				int i_1497_ = ((i_1462_ & 0xff00ff)
					       + (i_1495_ & 0xff00ff));
				i_1495_ = ((i_1497_ & 0x1000100)
					   + (i_1496_ - i_1497_ & 0x10000));
				((Class173_Sub3) this).anIntArray9719[i_1494_]
				    = i_1496_ - i_1495_ | i_1495_ - (i_1495_
								     >>> 8);
			    }
			    i += i_1485_;
			    i_1459_++;
			    i_1466_ += i_1487_;
			    i_1466_ %= i_1469_;
			}
		    } else
			throw new IllegalArgumentException();
		}
	    }
	}
    }
    
    public Class163_Sub1 method2313() {
	return new Class163_Sub1_Sub2(this);
    }
    
    public boolean method2520() {
	return false;
    }
    
    public void method2481() {
	((Class173_Sub3) this).anInt9738 = 0;
	((Class173_Sub3) this).anInt9739 = 0;
	((Class173_Sub3) this).anInt9740
	    = ((Class173_Sub3) this).anInt9735 * -1844567151;
	((Class173_Sub3) this).anInt9741
	    = -1733649543 * ((Class173_Sub3) this).anInt9748;
	method8934();
    }
    
    void method2404(int i, int i_1498_, int i_1499_, int i_1500_,
		    int i_1501_) {
	if (null != ((Class173_Sub3) this).anIntArray9719) {
	    if (i_1499_ < 0)
		i_1499_ = -i_1499_;
	    int i_1502_ = i_1498_ - i_1499_;
	    if (i_1502_ < ((Class173_Sub3) this).anInt9725 * 592117349)
		i_1502_ = ((Class173_Sub3) this).anInt9725 * 592117349;
	    int i_1503_ = i_1498_ + i_1499_ + 1;
	    if (i_1503_ > ((Class173_Sub3) this).anInt9726 * 6965409)
		i_1503_ = ((Class173_Sub3) this).anInt9726 * 6965409;
	    int i_1504_ = i_1502_;
	    int i_1505_ = i_1499_ * i_1499_;
	    int i_1506_ = 0;
	    int i_1507_ = i_1498_ - i_1504_;
	    int i_1508_ = i_1507_ * i_1507_;
	    int i_1509_ = i_1508_ - i_1507_;
	    if (i_1498_ > i_1503_)
		i_1498_ = i_1503_;
	    int i_1510_ = i_1500_ >>> 24;
	    if (i_1501_ == 0 || 1 == i_1501_ && 255 == i_1510_) {
		while (i_1504_ < i_1498_) {
		    for (/**/; i_1509_ <= i_1505_ || i_1508_ <= i_1505_;
			 i_1509_ += i_1506_++ + i_1506_)
			i_1508_ += i_1506_ + i_1506_;
		    int i_1511_ = 1 + (i - i_1506_);
		    if (i_1511_
			< ((Class173_Sub3) this).anInt9723 * -993497119)
			i_1511_
			    = -993497119 * ((Class173_Sub3) this).anInt9723;
		    int i_1512_ = i_1506_ + i;
		    if (i_1512_ > ((Class173_Sub3) this).anInt9724 * 630968029)
			i_1512_ = ((Class173_Sub3) this).anInt9724 * 630968029;
		    int i_1513_
			= (i_1504_ * (111437289
				      * ((Class173_Sub3) this).anInt9735)
			   + i_1511_);
		    for (int i_1514_ = i_1511_; i_1514_ < i_1512_; i_1514_++)
			((Class173_Sub3) this).anIntArray9719[i_1513_++]
			    = i_1500_;
		    i_1504_++;
		    i_1508_ -= i_1507_-- + i_1507_;
		    i_1509_ -= i_1507_ + i_1507_;
		}
		i_1506_ = i_1499_;
		i_1507_ = i_1504_ - i_1498_;
		i_1509_ = i_1505_ + i_1507_ * i_1507_;
		i_1508_ = i_1509_ - i_1506_;
		i_1509_ -= i_1507_;
		while (i_1504_ < i_1503_) {
		    for (/**/; i_1509_ > i_1505_ && i_1508_ > i_1505_;
			 i_1508_ -= i_1506_ + i_1506_)
			i_1509_ -= i_1506_-- + i_1506_;
		    int i_1515_ = i - i_1506_;
		    if (i_1515_
			< -993497119 * ((Class173_Sub3) this).anInt9723)
			i_1515_
			    = -993497119 * ((Class173_Sub3) this).anInt9723;
		    int i_1516_ = i_1506_ + i;
		    if (i_1516_
			> 630968029 * ((Class173_Sub3) this).anInt9724 - 1)
			i_1516_
			    = ((Class173_Sub3) this).anInt9724 * 630968029 - 1;
		    int i_1517_ = i_1515_ + (111437289
					     * ((Class173_Sub3) this).anInt9735
					     * i_1504_);
		    for (int i_1518_ = i_1515_; i_1518_ <= i_1516_; i_1518_++)
			((Class173_Sub3) this).anIntArray9719[i_1517_++]
			    = i_1500_;
		    i_1504_++;
		    i_1509_ += i_1507_ + i_1507_;
		    i_1508_ += i_1507_++ + i_1507_;
		}
	    } else if (i_1501_ == 1) {
		i_1500_ = ((i_1510_ << 24)
			   + (((i_1500_ & 0xff00ff) * i_1510_ >> 8 & 0xff00ff)
			      + (i_1510_ * (i_1500_ & 0xff00) >> 8 & 0xff00)));
		int i_1519_ = 256 - i_1510_;
		while (i_1504_ < i_1498_) {
		    for (/**/; i_1509_ <= i_1505_ || i_1508_ <= i_1505_;
			 i_1509_ += i_1506_++ + i_1506_)
			i_1508_ += i_1506_ + i_1506_;
		    int i_1520_ = 1 + (i - i_1506_);
		    if (i_1520_
			< ((Class173_Sub3) this).anInt9723 * -993497119)
			i_1520_
			    = ((Class173_Sub3) this).anInt9723 * -993497119;
		    int i_1521_ = i + i_1506_;
		    if (i_1521_ > ((Class173_Sub3) this).anInt9724 * 630968029)
			i_1521_ = ((Class173_Sub3) this).anInt9724 * 630968029;
		    int i_1522_ = (i_1504_ * (((Class173_Sub3) this).anInt9735
					      * 111437289)
				   + i_1520_);
		    for (int i_1523_ = i_1520_; i_1523_ < i_1521_; i_1523_++) {
			int i_1524_
			    = ((Class173_Sub3) this).anIntArray9719[i_1522_];
			i_1524_ = (((i_1524_ & 0xff00) * i_1519_ >> 8 & 0xff00)
				   + (i_1519_ * (i_1524_ & 0xff00ff) >> 8
				      & 0xff00ff));
			((Class173_Sub3) this).anIntArray9719[i_1522_++]
			    = i_1500_ + i_1524_;
		    }
		    i_1504_++;
		    i_1508_ -= i_1507_-- + i_1507_;
		    i_1509_ -= i_1507_ + i_1507_;
		}
		i_1506_ = i_1499_;
		i_1507_ = -i_1507_;
		i_1509_ = i_1507_ * i_1507_ + i_1505_;
		i_1508_ = i_1509_ - i_1506_;
		i_1509_ -= i_1507_;
		while (i_1504_ < i_1503_) {
		    for (/**/; i_1509_ > i_1505_ && i_1508_ > i_1505_;
			 i_1508_ -= i_1506_ + i_1506_)
			i_1509_ -= i_1506_-- + i_1506_;
		    int i_1525_ = i - i_1506_;
		    if (i_1525_
			< ((Class173_Sub3) this).anInt9723 * -993497119)
			i_1525_
			    = ((Class173_Sub3) this).anInt9723 * -993497119;
		    int i_1526_ = i + i_1506_;
		    if (i_1526_
			> 630968029 * ((Class173_Sub3) this).anInt9724 - 1)
			i_1526_
			    = ((Class173_Sub3) this).anInt9724 * 630968029 - 1;
		    int i_1527_ = (i_1504_ * (((Class173_Sub3) this).anInt9735
					      * 111437289)
				   + i_1525_);
		    for (int i_1528_ = i_1525_; i_1528_ <= i_1526_;
			 i_1528_++) {
			int i_1529_
			    = ((Class173_Sub3) this).anIntArray9719[i_1527_];
			i_1529_ = (((i_1529_ & 0xff00) * i_1519_ >> 8 & 0xff00)
				   + (i_1519_ * (i_1529_ & 0xff00ff) >> 8
				      & 0xff00ff));
			((Class173_Sub3) this).anIntArray9719[i_1527_++]
			    = i_1500_ + i_1529_;
		    }
		    i_1504_++;
		    i_1509_ += i_1507_ + i_1507_;
		    i_1508_ += i_1507_++ + i_1507_;
		}
	    } else if (2 == i_1501_) {
		while (i_1504_ < i_1498_) {
		    for (/**/; i_1509_ <= i_1505_ || i_1508_ <= i_1505_;
			 i_1509_ += i_1506_++ + i_1506_)
			i_1508_ += i_1506_ + i_1506_;
		    int i_1530_ = i - i_1506_ + 1;
		    if (i_1530_
			< ((Class173_Sub3) this).anInt9723 * -993497119)
			i_1530_
			    = -993497119 * ((Class173_Sub3) this).anInt9723;
		    int i_1531_ = i + i_1506_;
		    if (i_1531_ > 630968029 * ((Class173_Sub3) this).anInt9724)
			i_1531_ = 630968029 * ((Class173_Sub3) this).anInt9724;
		    int i_1532_
			= (i_1530_
			   + i_1504_ * (111437289
					* ((Class173_Sub3) this).anInt9735));
		    for (int i_1533_ = i_1530_; i_1533_ < i_1531_; i_1533_++) {
			int i_1534_
			    = ((Class173_Sub3) this).anIntArray9719[i_1532_];
			int i_1535_ = i_1534_ + i_1500_;
			int i_1536_
			    = (i_1534_ & 0xff00ff) + (i_1500_ & 0xff00ff);
			i_1534_
			    = (i_1535_ - i_1536_ & 0x10000) + (i_1536_
							       & 0x1000100);
			((Class173_Sub3) this).anIntArray9719[i_1532_++]
			    = i_1535_ - i_1534_ | i_1534_ - (i_1534_ >>> 8);
		    }
		    i_1504_++;
		    i_1508_ -= i_1507_-- + i_1507_;
		    i_1509_ -= i_1507_ + i_1507_;
		}
		i_1506_ = i_1499_;
		i_1507_ = -i_1507_;
		i_1509_ = i_1507_ * i_1507_ + i_1505_;
		i_1508_ = i_1509_ - i_1506_;
		i_1509_ -= i_1507_;
		while (i_1504_ < i_1503_) {
		    for (/**/; i_1509_ > i_1505_ && i_1508_ > i_1505_;
			 i_1508_ -= i_1506_ + i_1506_)
			i_1509_ -= i_1506_-- + i_1506_;
		    int i_1537_ = i - i_1506_;
		    if (i_1537_
			< ((Class173_Sub3) this).anInt9723 * -993497119)
			i_1537_
			    = -993497119 * ((Class173_Sub3) this).anInt9723;
		    int i_1538_ = i_1506_ + i;
		    if (i_1538_
			> ((Class173_Sub3) this).anInt9724 * 630968029 - 1)
			i_1538_
			    = 630968029 * ((Class173_Sub3) this).anInt9724 - 1;
		    int i_1539_ = i_1537_ + (((Class173_Sub3) this).anInt9735
					     * 111437289 * i_1504_);
		    for (int i_1540_ = i_1537_; i_1540_ <= i_1538_;
			 i_1540_++) {
			int i_1541_
			    = ((Class173_Sub3) this).anIntArray9719[i_1539_];
			int i_1542_ = i_1500_ + i_1541_;
			int i_1543_
			    = (i_1500_ & 0xff00ff) + (i_1541_ & 0xff00ff);
			i_1541_ = (i_1543_ & 0x1000100) + (i_1542_ - i_1543_
							   & 0x10000);
			((Class173_Sub3) this).anIntArray9719[i_1539_++]
			    = i_1542_ - i_1541_ | i_1541_ - (i_1541_ >>> 8);
		    }
		    i_1504_++;
		    i_1509_ += i_1507_ + i_1507_;
		    i_1508_ += i_1507_++ + i_1507_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method2541(int i, int i_1544_, int i_1545_, int i_1546_,
		    int i_1547_) {
	if (null != ((Class173_Sub3) this).anIntArray9719) {
	    if (i_1545_ < 0)
		i_1545_ = -i_1545_;
	    int i_1548_ = i_1544_ - i_1545_;
	    if (i_1548_ < ((Class173_Sub3) this).anInt9725 * 592117349)
		i_1548_ = ((Class173_Sub3) this).anInt9725 * 592117349;
	    int i_1549_ = i_1544_ + i_1545_ + 1;
	    if (i_1549_ > ((Class173_Sub3) this).anInt9726 * 6965409)
		i_1549_ = ((Class173_Sub3) this).anInt9726 * 6965409;
	    int i_1550_ = i_1548_;
	    int i_1551_ = i_1545_ * i_1545_;
	    int i_1552_ = 0;
	    int i_1553_ = i_1544_ - i_1550_;
	    int i_1554_ = i_1553_ * i_1553_;
	    int i_1555_ = i_1554_ - i_1553_;
	    if (i_1544_ > i_1549_)
		i_1544_ = i_1549_;
	    int i_1556_ = i_1546_ >>> 24;
	    if (i_1547_ == 0 || 1 == i_1547_ && 255 == i_1556_) {
		while (i_1550_ < i_1544_) {
		    for (/**/; i_1555_ <= i_1551_ || i_1554_ <= i_1551_;
			 i_1555_ += i_1552_++ + i_1552_)
			i_1554_ += i_1552_ + i_1552_;
		    int i_1557_ = 1 + (i - i_1552_);
		    if (i_1557_
			< ((Class173_Sub3) this).anInt9723 * -993497119)
			i_1557_
			    = -993497119 * ((Class173_Sub3) this).anInt9723;
		    int i_1558_ = i_1552_ + i;
		    if (i_1558_ > ((Class173_Sub3) this).anInt9724 * 630968029)
			i_1558_ = ((Class173_Sub3) this).anInt9724 * 630968029;
		    int i_1559_
			= (i_1550_ * (111437289
				      * ((Class173_Sub3) this).anInt9735)
			   + i_1557_);
		    for (int i_1560_ = i_1557_; i_1560_ < i_1558_; i_1560_++)
			((Class173_Sub3) this).anIntArray9719[i_1559_++]
			    = i_1546_;
		    i_1550_++;
		    i_1554_ -= i_1553_-- + i_1553_;
		    i_1555_ -= i_1553_ + i_1553_;
		}
		i_1552_ = i_1545_;
		i_1553_ = i_1550_ - i_1544_;
		i_1555_ = i_1551_ + i_1553_ * i_1553_;
		i_1554_ = i_1555_ - i_1552_;
		i_1555_ -= i_1553_;
		while (i_1550_ < i_1549_) {
		    for (/**/; i_1555_ > i_1551_ && i_1554_ > i_1551_;
			 i_1554_ -= i_1552_ + i_1552_)
			i_1555_ -= i_1552_-- + i_1552_;
		    int i_1561_ = i - i_1552_;
		    if (i_1561_
			< -993497119 * ((Class173_Sub3) this).anInt9723)
			i_1561_
			    = -993497119 * ((Class173_Sub3) this).anInt9723;
		    int i_1562_ = i_1552_ + i;
		    if (i_1562_
			> 630968029 * ((Class173_Sub3) this).anInt9724 - 1)
			i_1562_
			    = ((Class173_Sub3) this).anInt9724 * 630968029 - 1;
		    int i_1563_ = i_1561_ + (111437289
					     * ((Class173_Sub3) this).anInt9735
					     * i_1550_);
		    for (int i_1564_ = i_1561_; i_1564_ <= i_1562_; i_1564_++)
			((Class173_Sub3) this).anIntArray9719[i_1563_++]
			    = i_1546_;
		    i_1550_++;
		    i_1555_ += i_1553_ + i_1553_;
		    i_1554_ += i_1553_++ + i_1553_;
		}
	    } else if (i_1547_ == 1) {
		i_1546_ = ((i_1556_ << 24)
			   + (((i_1546_ & 0xff00ff) * i_1556_ >> 8 & 0xff00ff)
			      + (i_1556_ * (i_1546_ & 0xff00) >> 8 & 0xff00)));
		int i_1565_ = 256 - i_1556_;
		while (i_1550_ < i_1544_) {
		    for (/**/; i_1555_ <= i_1551_ || i_1554_ <= i_1551_;
			 i_1555_ += i_1552_++ + i_1552_)
			i_1554_ += i_1552_ + i_1552_;
		    int i_1566_ = 1 + (i - i_1552_);
		    if (i_1566_
			< ((Class173_Sub3) this).anInt9723 * -993497119)
			i_1566_
			    = ((Class173_Sub3) this).anInt9723 * -993497119;
		    int i_1567_ = i + i_1552_;
		    if (i_1567_ > ((Class173_Sub3) this).anInt9724 * 630968029)
			i_1567_ = ((Class173_Sub3) this).anInt9724 * 630968029;
		    int i_1568_ = (i_1550_ * (((Class173_Sub3) this).anInt9735
					      * 111437289)
				   + i_1566_);
		    for (int i_1569_ = i_1566_; i_1569_ < i_1567_; i_1569_++) {
			int i_1570_
			    = ((Class173_Sub3) this).anIntArray9719[i_1568_];
			i_1570_ = (((i_1570_ & 0xff00) * i_1565_ >> 8 & 0xff00)
				   + (i_1565_ * (i_1570_ & 0xff00ff) >> 8
				      & 0xff00ff));
			((Class173_Sub3) this).anIntArray9719[i_1568_++]
			    = i_1546_ + i_1570_;
		    }
		    i_1550_++;
		    i_1554_ -= i_1553_-- + i_1553_;
		    i_1555_ -= i_1553_ + i_1553_;
		}
		i_1552_ = i_1545_;
		i_1553_ = -i_1553_;
		i_1555_ = i_1553_ * i_1553_ + i_1551_;
		i_1554_ = i_1555_ - i_1552_;
		i_1555_ -= i_1553_;
		while (i_1550_ < i_1549_) {
		    for (/**/; i_1555_ > i_1551_ && i_1554_ > i_1551_;
			 i_1554_ -= i_1552_ + i_1552_)
			i_1555_ -= i_1552_-- + i_1552_;
		    int i_1571_ = i - i_1552_;
		    if (i_1571_
			< ((Class173_Sub3) this).anInt9723 * -993497119)
			i_1571_
			    = ((Class173_Sub3) this).anInt9723 * -993497119;
		    int i_1572_ = i + i_1552_;
		    if (i_1572_
			> 630968029 * ((Class173_Sub3) this).anInt9724 - 1)
			i_1572_
			    = ((Class173_Sub3) this).anInt9724 * 630968029 - 1;
		    int i_1573_ = (i_1550_ * (((Class173_Sub3) this).anInt9735
					      * 111437289)
				   + i_1571_);
		    for (int i_1574_ = i_1571_; i_1574_ <= i_1572_;
			 i_1574_++) {
			int i_1575_
			    = ((Class173_Sub3) this).anIntArray9719[i_1573_];
			i_1575_ = (((i_1575_ & 0xff00) * i_1565_ >> 8 & 0xff00)
				   + (i_1565_ * (i_1575_ & 0xff00ff) >> 8
				      & 0xff00ff));
			((Class173_Sub3) this).anIntArray9719[i_1573_++]
			    = i_1546_ + i_1575_;
		    }
		    i_1550_++;
		    i_1555_ += i_1553_ + i_1553_;
		    i_1554_ += i_1553_++ + i_1553_;
		}
	    } else if (2 == i_1547_) {
		while (i_1550_ < i_1544_) {
		    for (/**/; i_1555_ <= i_1551_ || i_1554_ <= i_1551_;
			 i_1555_ += i_1552_++ + i_1552_)
			i_1554_ += i_1552_ + i_1552_;
		    int i_1576_ = i - i_1552_ + 1;
		    if (i_1576_
			< ((Class173_Sub3) this).anInt9723 * -993497119)
			i_1576_
			    = -993497119 * ((Class173_Sub3) this).anInt9723;
		    int i_1577_ = i + i_1552_;
		    if (i_1577_ > 630968029 * ((Class173_Sub3) this).anInt9724)
			i_1577_ = 630968029 * ((Class173_Sub3) this).anInt9724;
		    int i_1578_
			= (i_1576_
			   + i_1550_ * (111437289
					* ((Class173_Sub3) this).anInt9735));
		    for (int i_1579_ = i_1576_; i_1579_ < i_1577_; i_1579_++) {
			int i_1580_
			    = ((Class173_Sub3) this).anIntArray9719[i_1578_];
			int i_1581_ = i_1580_ + i_1546_;
			int i_1582_
			    = (i_1580_ & 0xff00ff) + (i_1546_ & 0xff00ff);
			i_1580_
			    = (i_1581_ - i_1582_ & 0x10000) + (i_1582_
							       & 0x1000100);
			((Class173_Sub3) this).anIntArray9719[i_1578_++]
			    = i_1581_ - i_1580_ | i_1580_ - (i_1580_ >>> 8);
		    }
		    i_1550_++;
		    i_1554_ -= i_1553_-- + i_1553_;
		    i_1555_ -= i_1553_ + i_1553_;
		}
		i_1552_ = i_1545_;
		i_1553_ = -i_1553_;
		i_1555_ = i_1553_ * i_1553_ + i_1551_;
		i_1554_ = i_1555_ - i_1552_;
		i_1555_ -= i_1553_;
		while (i_1550_ < i_1549_) {
		    for (/**/; i_1555_ > i_1551_ && i_1554_ > i_1551_;
			 i_1554_ -= i_1552_ + i_1552_)
			i_1555_ -= i_1552_-- + i_1552_;
		    int i_1583_ = i - i_1552_;
		    if (i_1583_
			< ((Class173_Sub3) this).anInt9723 * -993497119)
			i_1583_
			    = -993497119 * ((Class173_Sub3) this).anInt9723;
		    int i_1584_ = i_1552_ + i;
		    if (i_1584_
			> ((Class173_Sub3) this).anInt9724 * 630968029 - 1)
			i_1584_
			    = 630968029 * ((Class173_Sub3) this).anInt9724 - 1;
		    int i_1585_ = i_1583_ + (((Class173_Sub3) this).anInt9735
					     * 111437289 * i_1550_);
		    for (int i_1586_ = i_1583_; i_1586_ <= i_1584_;
			 i_1586_++) {
			int i_1587_
			    = ((Class173_Sub3) this).anIntArray9719[i_1585_];
			int i_1588_ = i_1546_ + i_1587_;
			int i_1589_
			    = (i_1546_ & 0xff00ff) + (i_1587_ & 0xff00ff);
			i_1587_ = (i_1589_ & 0x1000100) + (i_1588_ - i_1589_
							   & 0x10000);
			((Class173_Sub3) this).anIntArray9719[i_1585_++]
			    = i_1588_ - i_1587_ | i_1587_ - (i_1587_ >>> 8);
		    }
		    i_1550_++;
		    i_1555_ += i_1553_ + i_1553_;
		    i_1554_ += i_1553_++ + i_1553_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method2200(int i, float f, float f_1590_, float f_1591_,
			   float f_1592_, float f_1593_) {
	((Class173_Sub3) this).anInt9749 = (int) (65535.0F * f) * 1513006813;
	((Class173_Sub3) this).anInt9755
	    = (int) (f_1590_ * 65535.0F) * 1854566841;
	float f_1594_ = (float) Math.sqrt((double) (f_1593_ * f_1593_
						    + (f_1591_ * f_1591_
						       + f_1592_ * f_1592_)));
	((Class173_Sub3) this).anInt9727
	    = (int) (f_1591_ * 65535.0F / f_1594_) * 1034742405;
	((Class173_Sub3) this).anInt9728
	    = (int) (f_1592_ * 65535.0F / f_1594_) * -1100133035;
	((Class173_Sub3) this).anInt9729
	    = 1890740575 * (int) (f_1593_ * 65535.0F / f_1594_);
    }
    
    public boolean method2302() {
	return false;
    }
    
    static final void method8954(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 1188055743 * Class676.anInt8551;
    }
    
    static void method8955(Class648 class648, int i) {
	int i_1595_
	    = Class691_Sub7.method9880((((Class648) class648).anIntArray8394
					[(((Class648) class648).anInt8395
					  -= 1239022665) * 717927929]),
				       (short) -8571);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = i_1595_;
    }
}
