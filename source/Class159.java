/* Class159 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class159
{
    public int anInt1748;
    public int anInt1749;
    public int anInt1750;
    public boolean aBool1751 = false;
    public int anInt1752;
    public int anInt1753;
    
    public void method2056(Class431 class431, Class418 class418,
			   Class418 class418_0_, float f, float f_1_,
			   float f_2_, float f_3_) {
	boolean bool = false;
	aBool1751 = true;
	int i = (int) (class431.aFloat4824 + class431.aFloat4823) >> 1;
	int i_4_ = (int) (class431.aFloat4822 + class431.aFloat4825) >> 1;
	int i_5_ = i;
	int i_6_ = (int) class431.aFloat4826;
	int i_7_ = i_4_;
	float f_8_ = (class418_0_.aFloatArray4768[0] * (float) i_5_
		      + class418_0_.aFloatArray4768[4] * (float) i_6_
		      + class418_0_.aFloatArray4768[8] * (float) i_7_
		      + class418_0_.aFloatArray4768[12]);
	float f_9_ = (class418_0_.aFloatArray4768[1] * (float) i_5_
		      + class418_0_.aFloatArray4768[5] * (float) i_6_
		      + class418_0_.aFloatArray4768[9] * (float) i_7_
		      + class418_0_.aFloatArray4768[13]);
	float f_10_ = (class418_0_.aFloatArray4768[2] * (float) i_5_
		       + class418_0_.aFloatArray4768[6] * (float) i_6_
		       + class418_0_.aFloatArray4768[10] * (float) i_7_
		       + class418_0_.aFloatArray4768[14]);
	float f_11_ = (class418_0_.aFloatArray4768[3] * (float) i_5_
		       + class418_0_.aFloatArray4768[7] * (float) i_6_
		       + class418_0_.aFloatArray4768[11] * (float) i_7_
		       + class418_0_.aFloatArray4768[15]);
	if (f_10_ >= -f_11_) {
	    anInt1748 = (int) (f + f_2_ * f_8_ / f_11_);
	    anInt1750 = (int) (f_1_ + f_3_ * f_9_ / f_11_);
	} else
	    bool = true;
	i_5_ = i;
	i_6_ = (int) class431.aFloat4827;
	i_7_ = i_4_;
	float f_12_ = (class418_0_.aFloatArray4768[0] * (float) i_5_
		       + class418_0_.aFloatArray4768[4] * (float) i_6_
		       + class418_0_.aFloatArray4768[8] * (float) i_7_
		       + class418_0_.aFloatArray4768[12]);
	float f_13_ = (class418_0_.aFloatArray4768[1] * (float) i_5_
		       + class418_0_.aFloatArray4768[5] * (float) i_6_
		       + class418_0_.aFloatArray4768[9] * (float) i_7_
		       + class418_0_.aFloatArray4768[13]);
	float f_14_ = (class418_0_.aFloatArray4768[2] * (float) i_5_
		       + class418_0_.aFloatArray4768[6] * (float) i_6_
		       + class418_0_.aFloatArray4768[10] * (float) i_7_
		       + class418_0_.aFloatArray4768[14]);
	float f_15_ = (class418_0_.aFloatArray4768[3] * (float) i_5_
		       + class418_0_.aFloatArray4768[7] * (float) i_6_
		       + class418_0_.aFloatArray4768[11] * (float) i_7_
		       + class418_0_.aFloatArray4768[15]);
	if (f_14_ >= -f_15_) {
	    anInt1749 = (int) (f + f_2_ * f_12_ / f_15_);
	    anInt1752 = (int) (f_1_ + f_3_ * f_13_ / f_15_);
	} else
	    bool = true;
	if (bool) {
	    if (f_10_ < -f_11_ && f_14_ < -f_15_)
		aBool1751 = false;
	    else if (f_10_ < -f_11_) {
		float f_16_ = (f_10_ + f_11_) / (f_14_ + f_15_) - 1.0F;
		float f_17_ = f_8_ + f_16_ * (f_12_ - f_8_);
		float f_18_ = f_9_ + f_16_ * (f_13_ - f_9_);
		float f_19_ = f_11_ + f_16_ * (f_15_ - f_11_);
		anInt1748 = (int) (f + f_2_ * f_17_ / f_19_);
		anInt1750 = (int) (f_1_ + f_3_ * f_18_ / f_19_);
	    } else if (f_14_ < -f_15_) {
		float f_20_ = (f_14_ + f_15_) / (f_10_ + f_11_) - 1.0F;
		float f_21_ = f_12_ + f_20_ * (f_8_ - f_12_);
		float f_22_ = f_13_ + f_20_ * (f_9_ - f_13_);
		float f_23_ = f_15_ + f_20_ * (f_11_ - f_15_);
		anInt1749 = (int) (f + f_2_ * f_21_ / f_23_);
		anInt1752 = (int) (f_1_ + f_3_ * f_22_ / f_23_);
	    }
	}
	if (aBool1751) {
	    float f_24_
		= ((float) Math.sqrt(Math.pow((double) (class431.aFloat4823
							- class431.aFloat4824),
					      2.0)
				     + Math.pow((double) (class431.aFloat4825
							  - (class431
							     .aFloat4822)),
						2.0))
		   / 2.0F);
	    if (f_10_ / f_11_ > f_14_ / f_15_) {
		float f_25_ = (f_8_ + class418.aFloatArray4768[0] * f_24_
			       + class418.aFloatArray4768[12]);
		float f_26_ = (f_11_ + class418.aFloatArray4768[3] * f_24_
			       + class418.aFloatArray4768[15]);
		anInt1753
		    = (int) (f - (float) anInt1748 + f_2_ * f_25_ / f_26_);
	    } else {
		float f_27_ = (f_12_ + class418.aFloatArray4768[0] * f_24_
			       + class418.aFloatArray4768[12]);
		float f_28_ = (f_15_ + class418.aFloatArray4768[3] * f_24_
			       + class418.aFloatArray4768[15]);
		anInt1753
		    = (int) (f - (float) anInt1749 + f_2_ * f_27_ / f_28_);
	    }
	    aBool1751 = true;
	}
    }
    
    public boolean method2057(int i, int i_29_) {
	if (!aBool1751)
	    return false;
	int i_30_ = anInt1749 - anInt1748;
	int i_31_ = anInt1752 - anInt1750;
	int i_32_ = i_30_ * i_30_ + i_31_ * i_31_;
	int i_33_ = (i * i_30_ + i_29_ * i_31_
		     - (anInt1748 * i_30_ + anInt1750 * i_31_));
	if (i_33_ <= 0) {
	    int i_34_ = anInt1748 - i;
	    int i_35_ = anInt1750 - i_29_;
	    return i_34_ * i_34_ + i_35_ * i_35_ < anInt1753 * anInt1753;
	}
	if (i_33_ > i_32_) {
	    int i_36_ = anInt1749 - i;
	    int i_37_ = anInt1752 - i_29_;
	    return i_36_ * i_36_ + i_37_ * i_37_ < anInt1753 * anInt1753;
	}
	int i_38_ = 10;
	if (i_33_ != (i_33_ & 0x1fffff))
	    i_38_ = 5;
	i_33_ = (i_33_ << i_38_) / i_32_;
	int i_39_ = anInt1748 + (i_30_ * i_33_ >> i_38_) - i;
	int i_40_ = anInt1750 + (i_31_ * i_33_ >> i_38_) - i_29_;
	return i_39_ * i_39_ + i_40_ * i_40_ < anInt1753 * anInt1753;
    }
}
