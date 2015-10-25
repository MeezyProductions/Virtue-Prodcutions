/* Class418 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;

public final class Class418
{
    public float[] aFloatArray4768;
    public static Class418 aClass418_4769 = new Class418();
    
    public void method4972(float[] fs) {
	float f = fs[0];
	float f_0_ = fs[1];
	float f_1_ = fs[2];
	fs[0] = (aFloatArray4768[0] * f + aFloatArray4768[4] * f_0_
		 + aFloatArray4768[8] * f_1_ + aFloatArray4768[12]);
	fs[1] = (aFloatArray4768[1] * f + aFloatArray4768[5] * f_0_
		 + aFloatArray4768[9] * f_1_ + aFloatArray4768[13]);
	fs[2] = (aFloatArray4768[2] * f + aFloatArray4768[6] * f_0_
		 + aFloatArray4768[10] * f_1_ + aFloatArray4768[14]);
    }
    
    public float[] method4973(float[] fs) {
	fs[0] = aFloatArray4768[0];
	fs[1] = aFloatArray4768[4];
	fs[2] = aFloatArray4768[8];
	fs[3] = aFloatArray4768[12];
	fs[4] = aFloatArray4768[1];
	fs[5] = aFloatArray4768[5];
	fs[6] = aFloatArray4768[9];
	fs[7] = aFloatArray4768[13];
	fs[8] = aFloatArray4768[2];
	fs[9] = aFloatArray4768[6];
	fs[10] = aFloatArray4768[10];
	fs[11] = aFloatArray4768[14];
	fs[12] = aFloatArray4768[3];
	fs[13] = aFloatArray4768[7];
	fs[14] = aFloatArray4768[11];
	fs[15] = aFloatArray4768[15];
	return fs;
    }
    
    public void method4974(Class418 class418_2_) {
	float f = (aFloatArray4768[0] * class418_2_.aFloatArray4768[0]
		   + aFloatArray4768[1] * class418_2_.aFloatArray4768[4]
		   + aFloatArray4768[2] * class418_2_.aFloatArray4768[8]
		   + aFloatArray4768[3] * class418_2_.aFloatArray4768[12]);
	float f_3_ = (aFloatArray4768[0] * class418_2_.aFloatArray4768[1]
		      + aFloatArray4768[1] * class418_2_.aFloatArray4768[5]
		      + aFloatArray4768[2] * class418_2_.aFloatArray4768[9]
		      + aFloatArray4768[3] * class418_2_.aFloatArray4768[13]);
	float f_4_ = (aFloatArray4768[0] * class418_2_.aFloatArray4768[2]
		      + aFloatArray4768[1] * class418_2_.aFloatArray4768[6]
		      + aFloatArray4768[2] * class418_2_.aFloatArray4768[10]
		      + aFloatArray4768[3] * class418_2_.aFloatArray4768[14]);
	float f_5_ = (aFloatArray4768[0] * class418_2_.aFloatArray4768[3]
		      + aFloatArray4768[1] * class418_2_.aFloatArray4768[7]
		      + aFloatArray4768[2] * class418_2_.aFloatArray4768[11]
		      + aFloatArray4768[3] * class418_2_.aFloatArray4768[15]);
	float f_6_ = (aFloatArray4768[4] * class418_2_.aFloatArray4768[0]
		      + aFloatArray4768[5] * class418_2_.aFloatArray4768[4]
		      + aFloatArray4768[6] * class418_2_.aFloatArray4768[8]
		      + aFloatArray4768[7] * class418_2_.aFloatArray4768[12]);
	float f_7_ = (aFloatArray4768[4] * class418_2_.aFloatArray4768[1]
		      + aFloatArray4768[5] * class418_2_.aFloatArray4768[5]
		      + aFloatArray4768[6] * class418_2_.aFloatArray4768[9]
		      + aFloatArray4768[7] * class418_2_.aFloatArray4768[13]);
	float f_8_ = (aFloatArray4768[4] * class418_2_.aFloatArray4768[2]
		      + aFloatArray4768[5] * class418_2_.aFloatArray4768[6]
		      + aFloatArray4768[6] * class418_2_.aFloatArray4768[10]
		      + aFloatArray4768[7] * class418_2_.aFloatArray4768[14]);
	float f_9_ = (aFloatArray4768[4] * class418_2_.aFloatArray4768[3]
		      + aFloatArray4768[5] * class418_2_.aFloatArray4768[7]
		      + aFloatArray4768[6] * class418_2_.aFloatArray4768[11]
		      + aFloatArray4768[7] * class418_2_.aFloatArray4768[15]);
	float f_10_
	    = (aFloatArray4768[8] * class418_2_.aFloatArray4768[0]
	       + aFloatArray4768[9] * class418_2_.aFloatArray4768[4]
	       + aFloatArray4768[10] * class418_2_.aFloatArray4768[8]
	       + aFloatArray4768[11] * class418_2_.aFloatArray4768[12]);
	float f_11_
	    = (aFloatArray4768[8] * class418_2_.aFloatArray4768[1]
	       + aFloatArray4768[9] * class418_2_.aFloatArray4768[5]
	       + aFloatArray4768[10] * class418_2_.aFloatArray4768[9]
	       + aFloatArray4768[11] * class418_2_.aFloatArray4768[13]);
	float f_12_
	    = (aFloatArray4768[8] * class418_2_.aFloatArray4768[2]
	       + aFloatArray4768[9] * class418_2_.aFloatArray4768[6]
	       + aFloatArray4768[10] * class418_2_.aFloatArray4768[10]
	       + aFloatArray4768[11] * class418_2_.aFloatArray4768[14]);
	float f_13_
	    = (aFloatArray4768[8] * class418_2_.aFloatArray4768[3]
	       + aFloatArray4768[9] * class418_2_.aFloatArray4768[7]
	       + aFloatArray4768[10] * class418_2_.aFloatArray4768[11]
	       + aFloatArray4768[11] * class418_2_.aFloatArray4768[15]);
	float f_14_
	    = (aFloatArray4768[12] * class418_2_.aFloatArray4768[0]
	       + aFloatArray4768[13] * class418_2_.aFloatArray4768[4]
	       + aFloatArray4768[14] * class418_2_.aFloatArray4768[8]
	       + aFloatArray4768[15] * class418_2_.aFloatArray4768[12]);
	float f_15_
	    = (aFloatArray4768[12] * class418_2_.aFloatArray4768[1]
	       + aFloatArray4768[13] * class418_2_.aFloatArray4768[5]
	       + aFloatArray4768[14] * class418_2_.aFloatArray4768[9]
	       + aFloatArray4768[15] * class418_2_.aFloatArray4768[13]);
	float f_16_
	    = (aFloatArray4768[12] * class418_2_.aFloatArray4768[2]
	       + aFloatArray4768[13] * class418_2_.aFloatArray4768[6]
	       + aFloatArray4768[14] * class418_2_.aFloatArray4768[10]
	       + aFloatArray4768[15] * class418_2_.aFloatArray4768[14]);
	float f_17_
	    = (aFloatArray4768[12] * class418_2_.aFloatArray4768[3]
	       + aFloatArray4768[13] * class418_2_.aFloatArray4768[7]
	       + aFloatArray4768[14] * class418_2_.aFloatArray4768[11]
	       + aFloatArray4768[15] * class418_2_.aFloatArray4768[15]);
	aFloatArray4768[0] = f;
	aFloatArray4768[1] = f_3_;
	aFloatArray4768[2] = f_4_;
	aFloatArray4768[3] = f_5_;
	aFloatArray4768[4] = f_6_;
	aFloatArray4768[5] = f_7_;
	aFloatArray4768[6] = f_8_;
	aFloatArray4768[7] = f_9_;
	aFloatArray4768[8] = f_10_;
	aFloatArray4768[9] = f_11_;
	aFloatArray4768[10] = f_12_;
	aFloatArray4768[11] = f_13_;
	aFloatArray4768[12] = f_14_;
	aFloatArray4768[13] = f_15_;
	aFloatArray4768[14] = f_16_;
	aFloatArray4768[15] = f_17_;
    }
    
    float method4975() {
	return ((aFloatArray4768[0] * aFloatArray4768[5] * aFloatArray4768[10]
		 * aFloatArray4768[15])
		- (aFloatArray4768[0] * aFloatArray4768[5]
		   * aFloatArray4768[11] * aFloatArray4768[14])
		- (aFloatArray4768[0] * aFloatArray4768[6] * aFloatArray4768[9]
		   * aFloatArray4768[15])
		+ (aFloatArray4768[0] * aFloatArray4768[6]
		   * aFloatArray4768[11] * aFloatArray4768[13])
		+ (aFloatArray4768[0] * aFloatArray4768[7] * aFloatArray4768[9]
		   * aFloatArray4768[14])
		- (aFloatArray4768[0] * aFloatArray4768[7]
		   * aFloatArray4768[10] * aFloatArray4768[13])
		- (aFloatArray4768[1] * aFloatArray4768[4]
		   * aFloatArray4768[10] * aFloatArray4768[15])
		+ (aFloatArray4768[1] * aFloatArray4768[4]
		   * aFloatArray4768[11] * aFloatArray4768[14])
		+ (aFloatArray4768[1] * aFloatArray4768[6] * aFloatArray4768[8]
		   * aFloatArray4768[15])
		- (aFloatArray4768[1] * aFloatArray4768[6]
		   * aFloatArray4768[11] * aFloatArray4768[12])
		- (aFloatArray4768[1] * aFloatArray4768[7] * aFloatArray4768[8]
		   * aFloatArray4768[14])
		+ (aFloatArray4768[1] * aFloatArray4768[7]
		   * aFloatArray4768[10] * aFloatArray4768[12])
		+ (aFloatArray4768[2] * aFloatArray4768[4] * aFloatArray4768[9]
		   * aFloatArray4768[15])
		- (aFloatArray4768[2] * aFloatArray4768[4]
		   * aFloatArray4768[11] * aFloatArray4768[13])
		- (aFloatArray4768[2] * aFloatArray4768[5] * aFloatArray4768[8]
		   * aFloatArray4768[15])
		+ (aFloatArray4768[2] * aFloatArray4768[5]
		   * aFloatArray4768[11] * aFloatArray4768[12])
		+ (aFloatArray4768[2] * aFloatArray4768[7] * aFloatArray4768[8]
		   * aFloatArray4768[13])
		- (aFloatArray4768[2] * aFloatArray4768[7] * aFloatArray4768[9]
		   * aFloatArray4768[12])
		- (aFloatArray4768[3] * aFloatArray4768[4] * aFloatArray4768[9]
		   * aFloatArray4768[14])
		+ (aFloatArray4768[3] * aFloatArray4768[4]
		   * aFloatArray4768[10] * aFloatArray4768[13])
		+ (aFloatArray4768[3] * aFloatArray4768[5] * aFloatArray4768[8]
		   * aFloatArray4768[14])
		- (aFloatArray4768[3] * aFloatArray4768[5]
		   * aFloatArray4768[10] * aFloatArray4768[12])
		- (aFloatArray4768[3] * aFloatArray4768[6] * aFloatArray4768[8]
		   * aFloatArray4768[13])
		+ (aFloatArray4768[3] * aFloatArray4768[6] * aFloatArray4768[9]
		   * aFloatArray4768[12]));
    }
    
    public void method4976(float f, float f_18_, float f_19_, float f_20_) {
	aFloatArray4768[0] = f;
	aFloatArray4768[1] = 0.0F;
	aFloatArray4768[2] = 0.0F;
	aFloatArray4768[3] = 0.0F;
	aFloatArray4768[4] = 0.0F;
	aFloatArray4768[5] = f_18_;
	aFloatArray4768[6] = 0.0F;
	aFloatArray4768[7] = 0.0F;
	aFloatArray4768[8] = 0.0F;
	aFloatArray4768[9] = 0.0F;
	aFloatArray4768[10] = f_19_;
	aFloatArray4768[11] = 0.0F;
	aFloatArray4768[12] = 0.0F;
	aFloatArray4768[13] = 0.0F;
	aFloatArray4768[14] = 0.0F;
	aFloatArray4768[15] = f_20_;
    }
    
    public boolean method4977() {
	return (aFloatArray4768[0] == 1.0F && aFloatArray4768[1] == 0.0F
		&& aFloatArray4768[2] == 0.0F && aFloatArray4768[3] == 0.0F
		&& aFloatArray4768[4] == 0.0F && aFloatArray4768[5] == 1.0F
		&& aFloatArray4768[6] == 0.0F && aFloatArray4768[7] == 0.0F
		&& aFloatArray4768[8] == 0.0F && aFloatArray4768[9] == 0.0F
		&& aFloatArray4768[10] == 1.0F && aFloatArray4768[11] == 0.0F
		&& aFloatArray4768[12] == 0.0F && aFloatArray4768[13] == 0.0F
		&& aFloatArray4768[14] == 0.0F && aFloatArray4768[15] == 1.0F);
    }
    
    public float method4978() {
	return ((aFloatArray4768[14] - aFloatArray4768[15])
		/ (aFloatArray4768[11] - aFloatArray4768[10]));
    }
    
    public void method4979(float f, float f_21_, float f_22_, float[] fs) {
	fs[0] = (aFloatArray4768[0] * f + aFloatArray4768[4] * f_21_
		 + aFloatArray4768[8] * f_22_);
	fs[1] = (aFloatArray4768[1] * f + aFloatArray4768[5] * f_21_
		 + aFloatArray4768[9] * f_22_);
	fs[2] = (aFloatArray4768[2] * f + aFloatArray4768[6] * f_21_
		 + aFloatArray4768[10] * f_22_);
	if (fs.length > 3)
	    fs[3] = (aFloatArray4768[3] * f + aFloatArray4768[7] * f_21_
		     + aFloatArray4768[11] * f_22_);
    }
    
    public void method4980(float f, float f_23_, float f_24_, float f_25_,
			   float f_26_, float f_27_) {
	aFloatArray4768[0] = 2.0F / (f_23_ - f);
	aFloatArray4768[1] = 0.0F;
	aFloatArray4768[2] = 0.0F;
	aFloatArray4768[3] = 0.0F;
	aFloatArray4768[4] = 0.0F;
	aFloatArray4768[5] = 2.0F / (f_25_ - f_24_);
	aFloatArray4768[6] = 0.0F;
	aFloatArray4768[7] = 0.0F;
	aFloatArray4768[8] = 0.0F;
	aFloatArray4768[9] = 0.0F;
	aFloatArray4768[10] = 2.0F / (f_27_ - f_26_);
	aFloatArray4768[11] = 0.0F;
	aFloatArray4768[12] = -(f_23_ + f) / (f_23_ - f);
	aFloatArray4768[13] = -(f_25_ + f_24_) / (f_25_ - f_24_);
	aFloatArray4768[14] = -(f_27_ + f_26_) / (f_27_ - f_26_);
	aFloatArray4768[15] = 1.0F;
    }
    
    public void method4981(float f, float f_28_, float f_29_, float f_30_) {
	float f_31_ = (float) (Math.tan((double) (f_29_ / 2.0F)) * (double) f);
	float f_32_ = (float) (Math.tan((double) (f_30_ / 2.0F)) * (double) f);
	method4983(-f_31_, f_31_, -f_32_, f_32_, f, f_28_);
    }
    
    public void method4982(float f, float f_33_, float f_34_) {
	method4980(-10000.0F / f_34_, 10000.0F / f_34_, -10000.0F / f_34_,
		   10000.0F / f_34_, f, f_33_);
    }
    
    void method4983(float f, float f_35_, float f_36_, float f_37_,
		    float f_38_, float f_39_) {
	aFloatArray4768[0] = 2.0F * f_38_ / (f_35_ - f);
	aFloatArray4768[1] = 0.0F;
	aFloatArray4768[2] = 0.0F;
	aFloatArray4768[3] = 0.0F;
	aFloatArray4768[4] = 0.0F;
	aFloatArray4768[5] = 2.0F * f_38_ / (f_37_ - f_36_);
	aFloatArray4768[6] = 0.0F;
	aFloatArray4768[7] = 0.0F;
	aFloatArray4768[8] = (f_35_ + f) / (f_35_ - f);
	aFloatArray4768[9] = (f_37_ + f_36_) / (f_37_ - f_36_);
	aFloatArray4768[10] = (f_39_ + f_38_) / (f_39_ - f_38_);
	aFloatArray4768[11] = 1.0F;
	aFloatArray4768[12] = 0.0F;
	aFloatArray4768[13] = 0.0F;
	aFloatArray4768[14] = -(2.0F * f_39_ * f_38_) / (f_39_ - f_38_);
	aFloatArray4768[15] = 0.0F;
    }
    
    public void method4984(float f, float f_40_, float f_41_, float f_42_,
			   float f_43_, float f_44_, float f_45_,
			   float f_46_) {
	aFloatArray4768[0] = f_41_ * 2.0F / f_45_;
	aFloatArray4768[1] = 0.0F;
	aFloatArray4768[2] = 0.0F;
	aFloatArray4768[3] = 0.0F;
	aFloatArray4768[4] = 0.0F;
	aFloatArray4768[5] = f_42_ * 2.0F / f_46_;
	aFloatArray4768[6] = 0.0F;
	aFloatArray4768[7] = 0.0F;
	aFloatArray4768[8] = 2.0F * f / f_45_ - 1.0F;
	aFloatArray4768[9] = 2.0F * f_40_ / f_46_ - 1.0F;
	aFloatArray4768[10] = (f_44_ + f_43_) / (f_44_ - f_43_);
	aFloatArray4768[11] = 1.0F;
	aFloatArray4768[12] = 0.0F;
	aFloatArray4768[13] = 0.0F;
	aFloatArray4768[14] = 2.0F * f_44_ * f_43_ / (f_43_ - f_44_);
	aFloatArray4768[15] = 0.0F;
    }
    
    public float method4985() {
	return (-(aFloatArray4768[15] + aFloatArray4768[14])
		/ (aFloatArray4768[11] + aFloatArray4768[10]));
    }
    
    public void method4986(Class418 class418_47_) {
	System.arraycopy(class418_47_.aFloatArray4768, 0, aFloatArray4768, 0,
			 16);
    }
    
    public float[] method4987(float[] fs) {
	float f = aFloatArray4768[3] + aFloatArray4768[0];
	float f_48_ = aFloatArray4768[7] + aFloatArray4768[4];
	float f_49_ = aFloatArray4768[11] + aFloatArray4768[8];
	double d = Math.sqrt((double) (f * f + f_48_ * f_48_ + f_49_ * f_49_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_48_ / d);
	fs[2] = (float) ((double) f_49_ / d);
	fs[3] = (float) ((double) (aFloatArray4768[15] + aFloatArray4768[12])
			 / d);
	return fs;
    }
    
    public float[] method4988(float[] fs) {
	float f = aFloatArray4768[3] - aFloatArray4768[0];
	float f_50_ = aFloatArray4768[7] - aFloatArray4768[4];
	float f_51_ = aFloatArray4768[11] - aFloatArray4768[8];
	double d = Math.sqrt((double) (f * f + f_50_ * f_50_ + f_51_ * f_51_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_50_ / d);
	fs[2] = (float) ((double) f_51_ / d);
	fs[3] = (float) ((double) (aFloatArray4768[15] - aFloatArray4768[12])
			 / d);
	return fs;
    }
    
    public float[] method4989(float[] fs) {
	float f = aFloatArray4768[3] + aFloatArray4768[1];
	float f_52_ = aFloatArray4768[7] + aFloatArray4768[5];
	float f_53_ = aFloatArray4768[11] + aFloatArray4768[9];
	double d = Math.sqrt((double) (f * f + f_52_ * f_52_ + f_53_ * f_53_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_52_ / d);
	fs[2] = (float) ((double) f_53_ / d);
	fs[3] = (float) ((double) (aFloatArray4768[15] + aFloatArray4768[13])
			 / d);
	return fs;
    }
    
    public float[] method4990(float[] fs) {
	float f = aFloatArray4768[3] - aFloatArray4768[1];
	float f_54_ = aFloatArray4768[7] - aFloatArray4768[5];
	float f_55_ = aFloatArray4768[11] - aFloatArray4768[9];
	double d = Math.sqrt((double) (f * f + f_54_ * f_54_ + f_55_ * f_55_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_54_ / d);
	fs[2] = (float) ((double) f_55_ / d);
	fs[3] = (float) ((double) (aFloatArray4768[15] - aFloatArray4768[13])
			 / d);
	return fs;
    }
    
    public float[] method4991(float[] fs) {
	float f = aFloatArray4768[3] + aFloatArray4768[2];
	float f_56_ = aFloatArray4768[7] + aFloatArray4768[6];
	float f_57_ = aFloatArray4768[11] + aFloatArray4768[10];
	double d = Math.sqrt((double) (f * f + f_56_ * f_56_ + f_57_ * f_57_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_56_ / d);
	fs[2] = (float) ((double) f_57_ / d);
	fs[3] = (float) ((double) (aFloatArray4768[15] + aFloatArray4768[14])
			 / d);
	return fs;
    }
    
    public float[] method4992(float[] fs) {
	float f = aFloatArray4768[3] - aFloatArray4768[2];
	float f_58_ = aFloatArray4768[7] - aFloatArray4768[6];
	float f_59_ = aFloatArray4768[11] - aFloatArray4768[10];
	double d = Math.sqrt((double) (f * f + f_58_ * f_58_ + f_59_ * f_59_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_58_ / d);
	fs[2] = (float) ((double) f_59_ / d);
	fs[3] = (float) ((double) (aFloatArray4768[15] - aFloatArray4768[14])
			 / d);
	return fs;
    }
    
    public void method4993() {
	float f = aFloatArray4768[0];
	float f_60_ = aFloatArray4768[4];
	float f_61_ = aFloatArray4768[8];
	float f_62_ = aFloatArray4768[12];
	float f_63_ = aFloatArray4768[1];
	float f_64_ = aFloatArray4768[5];
	float f_65_ = aFloatArray4768[9];
	float f_66_ = aFloatArray4768[13];
	float f_67_ = aFloatArray4768[2];
	float f_68_ = aFloatArray4768[6];
	float f_69_ = aFloatArray4768[10];
	float f_70_ = aFloatArray4768[14];
	float f_71_ = aFloatArray4768[3];
	float f_72_ = aFloatArray4768[7];
	float f_73_ = aFloatArray4768[11];
	float f_74_ = aFloatArray4768[15];
	aFloatArray4768[0] = f;
	aFloatArray4768[1] = f_60_;
	aFloatArray4768[2] = f_61_;
	aFloatArray4768[3] = f_62_;
	aFloatArray4768[4] = f_63_;
	aFloatArray4768[5] = f_64_;
	aFloatArray4768[6] = f_65_;
	aFloatArray4768[7] = f_66_;
	aFloatArray4768[8] = f_67_;
	aFloatArray4768[9] = f_68_;
	aFloatArray4768[10] = f_69_;
	aFloatArray4768[11] = f_70_;
	aFloatArray4768[12] = f_71_;
	aFloatArray4768[13] = f_72_;
	aFloatArray4768[14] = f_73_;
	aFloatArray4768[15] = f_74_;
    }
    
    public float[] method4994(float[] fs) {
	System.arraycopy(aFloatArray4768, 0, fs, 0, 16);
	return fs;
    }
    
    public float[] method4995(float[] fs) {
	System.arraycopy(aFloatArray4768, 0, fs, 0, 16);
	fs[3] = 0.0F;
	fs[7] = 0.0F;
	fs[11] = 0.0F;
	fs[12] = 0.0F;
	fs[13] = 0.0F;
	fs[14] = 0.0F;
	fs[15] = 1.0F;
	return fs;
    }
    
    public float[] method4996(float[] fs) {
	fs[0] = aFloatArray4768[0];
	fs[1] = aFloatArray4768[1];
	fs[2] = aFloatArray4768[2];
	fs[3] = aFloatArray4768[4];
	fs[4] = aFloatArray4768[5];
	fs[5] = aFloatArray4768[6];
	fs[6] = aFloatArray4768[8];
	fs[7] = aFloatArray4768[9];
	fs[8] = aFloatArray4768[10];
	return fs;
    }
    
    public void method4997() {
	float f = aFloatArray4768[0];
	float f_75_ = aFloatArray4768[4];
	float f_76_ = aFloatArray4768[8];
	float f_77_ = aFloatArray4768[12];
	float f_78_ = aFloatArray4768[1];
	float f_79_ = aFloatArray4768[5];
	float f_80_ = aFloatArray4768[9];
	float f_81_ = aFloatArray4768[13];
	float f_82_ = aFloatArray4768[2];
	float f_83_ = aFloatArray4768[6];
	float f_84_ = aFloatArray4768[10];
	float f_85_ = aFloatArray4768[14];
	float f_86_ = aFloatArray4768[3];
	float f_87_ = aFloatArray4768[7];
	float f_88_ = aFloatArray4768[11];
	float f_89_ = aFloatArray4768[15];
	aFloatArray4768[0] = f;
	aFloatArray4768[1] = f_75_;
	aFloatArray4768[2] = f_76_;
	aFloatArray4768[3] = f_77_;
	aFloatArray4768[4] = f_78_;
	aFloatArray4768[5] = f_79_;
	aFloatArray4768[6] = f_80_;
	aFloatArray4768[7] = f_81_;
	aFloatArray4768[8] = f_82_;
	aFloatArray4768[9] = f_83_;
	aFloatArray4768[10] = f_84_;
	aFloatArray4768[11] = f_85_;
	aFloatArray4768[12] = f_86_;
	aFloatArray4768[13] = f_87_;
	aFloatArray4768[14] = f_88_;
	aFloatArray4768[15] = f_89_;
    }
    
    public void method4998(Class418 class418_90_, Class418 class418_91_) {
	float f = ((class418_90_.aFloatArray4768[0]
		    * class418_91_.aFloatArray4768[0])
		   + (class418_90_.aFloatArray4768[1]
		      * class418_91_.aFloatArray4768[4])
		   + (class418_90_.aFloatArray4768[2]
		      * class418_91_.aFloatArray4768[8])
		   + (class418_90_.aFloatArray4768[3]
		      * class418_91_.aFloatArray4768[12]));
	float f_92_ = ((class418_90_.aFloatArray4768[0]
			* class418_91_.aFloatArray4768[1])
		       + (class418_90_.aFloatArray4768[1]
			  * class418_91_.aFloatArray4768[5])
		       + (class418_90_.aFloatArray4768[2]
			  * class418_91_.aFloatArray4768[9])
		       + (class418_90_.aFloatArray4768[3]
			  * class418_91_.aFloatArray4768[13]));
	float f_93_ = ((class418_90_.aFloatArray4768[0]
			* class418_91_.aFloatArray4768[2])
		       + (class418_90_.aFloatArray4768[1]
			  * class418_91_.aFloatArray4768[6])
		       + (class418_90_.aFloatArray4768[2]
			  * class418_91_.aFloatArray4768[10])
		       + (class418_90_.aFloatArray4768[3]
			  * class418_91_.aFloatArray4768[14]));
	float f_94_ = ((class418_90_.aFloatArray4768[0]
			* class418_91_.aFloatArray4768[3])
		       + (class418_90_.aFloatArray4768[1]
			  * class418_91_.aFloatArray4768[7])
		       + (class418_90_.aFloatArray4768[2]
			  * class418_91_.aFloatArray4768[11])
		       + (class418_90_.aFloatArray4768[3]
			  * class418_91_.aFloatArray4768[15]));
	float f_95_ = ((class418_90_.aFloatArray4768[4]
			* class418_91_.aFloatArray4768[0])
		       + (class418_90_.aFloatArray4768[5]
			  * class418_91_.aFloatArray4768[4])
		       + (class418_90_.aFloatArray4768[6]
			  * class418_91_.aFloatArray4768[8])
		       + (class418_90_.aFloatArray4768[7]
			  * class418_91_.aFloatArray4768[12]));
	float f_96_ = ((class418_90_.aFloatArray4768[4]
			* class418_91_.aFloatArray4768[1])
		       + (class418_90_.aFloatArray4768[5]
			  * class418_91_.aFloatArray4768[5])
		       + (class418_90_.aFloatArray4768[6]
			  * class418_91_.aFloatArray4768[9])
		       + (class418_90_.aFloatArray4768[7]
			  * class418_91_.aFloatArray4768[13]));
	float f_97_ = ((class418_90_.aFloatArray4768[4]
			* class418_91_.aFloatArray4768[2])
		       + (class418_90_.aFloatArray4768[5]
			  * class418_91_.aFloatArray4768[6])
		       + (class418_90_.aFloatArray4768[6]
			  * class418_91_.aFloatArray4768[10])
		       + (class418_90_.aFloatArray4768[7]
			  * class418_91_.aFloatArray4768[14]));
	float f_98_ = ((class418_90_.aFloatArray4768[4]
			* class418_91_.aFloatArray4768[3])
		       + (class418_90_.aFloatArray4768[5]
			  * class418_91_.aFloatArray4768[7])
		       + (class418_90_.aFloatArray4768[6]
			  * class418_91_.aFloatArray4768[11])
		       + (class418_90_.aFloatArray4768[7]
			  * class418_91_.aFloatArray4768[15]));
	float f_99_ = ((class418_90_.aFloatArray4768[8]
			* class418_91_.aFloatArray4768[0])
		       + (class418_90_.aFloatArray4768[9]
			  * class418_91_.aFloatArray4768[4])
		       + (class418_90_.aFloatArray4768[10]
			  * class418_91_.aFloatArray4768[8])
		       + (class418_90_.aFloatArray4768[11]
			  * class418_91_.aFloatArray4768[12]));
	float f_100_ = ((class418_90_.aFloatArray4768[8]
			 * class418_91_.aFloatArray4768[1])
			+ (class418_90_.aFloatArray4768[9]
			   * class418_91_.aFloatArray4768[5])
			+ (class418_90_.aFloatArray4768[10]
			   * class418_91_.aFloatArray4768[9])
			+ (class418_90_.aFloatArray4768[11]
			   * class418_91_.aFloatArray4768[13]));
	float f_101_ = ((class418_90_.aFloatArray4768[8]
			 * class418_91_.aFloatArray4768[2])
			+ (class418_90_.aFloatArray4768[9]
			   * class418_91_.aFloatArray4768[6])
			+ (class418_90_.aFloatArray4768[10]
			   * class418_91_.aFloatArray4768[10])
			+ (class418_90_.aFloatArray4768[11]
			   * class418_91_.aFloatArray4768[14]));
	float f_102_ = ((class418_90_.aFloatArray4768[8]
			 * class418_91_.aFloatArray4768[3])
			+ (class418_90_.aFloatArray4768[9]
			   * class418_91_.aFloatArray4768[7])
			+ (class418_90_.aFloatArray4768[10]
			   * class418_91_.aFloatArray4768[11])
			+ (class418_90_.aFloatArray4768[11]
			   * class418_91_.aFloatArray4768[15]));
	float f_103_ = ((class418_90_.aFloatArray4768[12]
			 * class418_91_.aFloatArray4768[0])
			+ (class418_90_.aFloatArray4768[13]
			   * class418_91_.aFloatArray4768[4])
			+ (class418_90_.aFloatArray4768[14]
			   * class418_91_.aFloatArray4768[8])
			+ (class418_90_.aFloatArray4768[15]
			   * class418_91_.aFloatArray4768[12]));
	float f_104_ = ((class418_90_.aFloatArray4768[12]
			 * class418_91_.aFloatArray4768[1])
			+ (class418_90_.aFloatArray4768[13]
			   * class418_91_.aFloatArray4768[5])
			+ (class418_90_.aFloatArray4768[14]
			   * class418_91_.aFloatArray4768[9])
			+ (class418_90_.aFloatArray4768[15]
			   * class418_91_.aFloatArray4768[13]));
	float f_105_ = ((class418_90_.aFloatArray4768[12]
			 * class418_91_.aFloatArray4768[2])
			+ (class418_90_.aFloatArray4768[13]
			   * class418_91_.aFloatArray4768[6])
			+ (class418_90_.aFloatArray4768[14]
			   * class418_91_.aFloatArray4768[10])
			+ (class418_90_.aFloatArray4768[15]
			   * class418_91_.aFloatArray4768[14]));
	float f_106_ = ((class418_90_.aFloatArray4768[12]
			 * class418_91_.aFloatArray4768[3])
			+ (class418_90_.aFloatArray4768[13]
			   * class418_91_.aFloatArray4768[7])
			+ (class418_90_.aFloatArray4768[14]
			   * class418_91_.aFloatArray4768[11])
			+ (class418_90_.aFloatArray4768[15]
			   * class418_91_.aFloatArray4768[15]));
	aFloatArray4768[0] = f;
	aFloatArray4768[1] = f_92_;
	aFloatArray4768[2] = f_93_;
	aFloatArray4768[3] = f_94_;
	aFloatArray4768[4] = f_95_;
	aFloatArray4768[5] = f_96_;
	aFloatArray4768[6] = f_97_;
	aFloatArray4768[7] = f_98_;
	aFloatArray4768[8] = f_99_;
	aFloatArray4768[9] = f_100_;
	aFloatArray4768[10] = f_101_;
	aFloatArray4768[11] = f_102_;
	aFloatArray4768[12] = f_103_;
	aFloatArray4768[13] = f_104_;
	aFloatArray4768[14] = f_105_;
	aFloatArray4768[15] = f_106_;
    }
    
    float method4999() {
	return ((aFloatArray4768[0] * aFloatArray4768[5] * aFloatArray4768[10]
		 * aFloatArray4768[15])
		- (aFloatArray4768[0] * aFloatArray4768[5]
		   * aFloatArray4768[11] * aFloatArray4768[14])
		- (aFloatArray4768[0] * aFloatArray4768[6] * aFloatArray4768[9]
		   * aFloatArray4768[15])
		+ (aFloatArray4768[0] * aFloatArray4768[6]
		   * aFloatArray4768[11] * aFloatArray4768[13])
		+ (aFloatArray4768[0] * aFloatArray4768[7] * aFloatArray4768[9]
		   * aFloatArray4768[14])
		- (aFloatArray4768[0] * aFloatArray4768[7]
		   * aFloatArray4768[10] * aFloatArray4768[13])
		- (aFloatArray4768[1] * aFloatArray4768[4]
		   * aFloatArray4768[10] * aFloatArray4768[15])
		+ (aFloatArray4768[1] * aFloatArray4768[4]
		   * aFloatArray4768[11] * aFloatArray4768[14])
		+ (aFloatArray4768[1] * aFloatArray4768[6] * aFloatArray4768[8]
		   * aFloatArray4768[15])
		- (aFloatArray4768[1] * aFloatArray4768[6]
		   * aFloatArray4768[11] * aFloatArray4768[12])
		- (aFloatArray4768[1] * aFloatArray4768[7] * aFloatArray4768[8]
		   * aFloatArray4768[14])
		+ (aFloatArray4768[1] * aFloatArray4768[7]
		   * aFloatArray4768[10] * aFloatArray4768[12])
		+ (aFloatArray4768[2] * aFloatArray4768[4] * aFloatArray4768[9]
		   * aFloatArray4768[15])
		- (aFloatArray4768[2] * aFloatArray4768[4]
		   * aFloatArray4768[11] * aFloatArray4768[13])
		- (aFloatArray4768[2] * aFloatArray4768[5] * aFloatArray4768[8]
		   * aFloatArray4768[15])
		+ (aFloatArray4768[2] * aFloatArray4768[5]
		   * aFloatArray4768[11] * aFloatArray4768[12])
		+ (aFloatArray4768[2] * aFloatArray4768[7] * aFloatArray4768[8]
		   * aFloatArray4768[13])
		- (aFloatArray4768[2] * aFloatArray4768[7] * aFloatArray4768[9]
		   * aFloatArray4768[12])
		- (aFloatArray4768[3] * aFloatArray4768[4] * aFloatArray4768[9]
		   * aFloatArray4768[14])
		+ (aFloatArray4768[3] * aFloatArray4768[4]
		   * aFloatArray4768[10] * aFloatArray4768[13])
		+ (aFloatArray4768[3] * aFloatArray4768[5] * aFloatArray4768[8]
		   * aFloatArray4768[14])
		- (aFloatArray4768[3] * aFloatArray4768[5]
		   * aFloatArray4768[10] * aFloatArray4768[12])
		- (aFloatArray4768[3] * aFloatArray4768[6] * aFloatArray4768[8]
		   * aFloatArray4768[13])
		+ (aFloatArray4768[3] * aFloatArray4768[6] * aFloatArray4768[9]
		   * aFloatArray4768[12]));
    }
    
    public void method5000(int i, int i_107_, int i_108_, float f,
			   float f_109_, float f_110_) {
	if (i != 0) {
	    float f_111_ = Class419.aFloatArray4771[i & 0x3fff];
	    float f_112_ = Class419.aFloatArray4770[i & 0x3fff];
	    aFloatArray4768[0] = f_111_ * (float) i_107_;
	    aFloatArray4768[5] = f_111_ * (float) i_108_;
	    aFloatArray4768[1] = f_112_ * (float) i_107_;
	    aFloatArray4768[4] = -f_112_ * (float) i_108_;
	    aFloatArray4768[10] = 1.0F;
	    float[] fs = aFloatArray4768;
	    float[] fs_113_ = aFloatArray4768;
	    float[] fs_114_ = aFloatArray4768;
	    aFloatArray4768[9] = 0.0F;
	    fs_114_[8] = 0.0F;
	    fs_113_[6] = 0.0F;
	    fs[2] = 0.0F;
	} else {
	    aFloatArray4768[0] = (float) i_107_;
	    aFloatArray4768[5] = (float) i_108_;
	    aFloatArray4768[10] = 1.0F;
	    float[] fs = aFloatArray4768;
	    float[] fs_115_ = aFloatArray4768;
	    float[] fs_116_ = aFloatArray4768;
	    float[] fs_117_ = aFloatArray4768;
	    float[] fs_118_ = aFloatArray4768;
	    aFloatArray4768[9] = 0.0F;
	    fs_118_[8] = 0.0F;
	    fs_117_[6] = 0.0F;
	    fs_116_[4] = 0.0F;
	    fs_115_[2] = 0.0F;
	    fs[1] = 0.0F;
	}
	float[] fs = aFloatArray4768;
	float[] fs_119_ = aFloatArray4768;
	aFloatArray4768[11] = 0.0F;
	fs_119_[7] = 0.0F;
	fs[3] = 0.0F;
	aFloatArray4768[15] = 1.0F;
	aFloatArray4768[12] = f;
	aFloatArray4768[13] = f_109_;
	aFloatArray4768[14] = f_110_;
    }
    
    public boolean equals(Object object) {
	if (!(object instanceof Class418))
	    return false;
	Class418 class418_120_ = (Class418) object;
	for (int i = 0; i < 16; i++) {
	    if (aFloatArray4768[i] != class418_120_.aFloatArray4768[i])
		return false;
	}
	return true;
    }
    
    public boolean method5001(Object object) {
	if (!(object instanceof Class418))
	    return false;
	Class418 class418_121_ = (Class418) object;
	for (int i = 0; i < 16; i++) {
	    if (aFloatArray4768[i] != class418_121_.aFloatArray4768[i])
		return false;
	}
	return true;
    }
    
    public int method5002() {
	int i = 1;
	i = 31 * i + Arrays.hashCode(aFloatArray4768);
	return i;
    }
    
    public int method5003() {
	int i = 1;
	i = 31 * i + Arrays.hashCode(aFloatArray4768);
	return i;
    }
    
    public int method5004() {
	int i = 1;
	i = 31 * i + Arrays.hashCode(aFloatArray4768);
	return i;
    }
    
    public void method5005() {
	aFloatArray4768[0] = 1.0F;
	aFloatArray4768[1] = 0.0F;
	aFloatArray4768[2] = 0.0F;
	aFloatArray4768[3] = 0.0F;
	aFloatArray4768[4] = 0.0F;
	aFloatArray4768[5] = 1.0F;
	aFloatArray4768[6] = 0.0F;
	aFloatArray4768[7] = 0.0F;
	aFloatArray4768[8] = 0.0F;
	aFloatArray4768[9] = 0.0F;
	aFloatArray4768[10] = 1.0F;
	aFloatArray4768[11] = 0.0F;
	aFloatArray4768[12] = 0.0F;
	aFloatArray4768[13] = 0.0F;
	aFloatArray4768[14] = 0.0F;
	aFloatArray4768[15] = 1.0F;
    }
    
    public String method5006() {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i = 0; i < 4; i++) {
	    for (int i_122_ = 0; i_122_ < 4; i_122_++) {
		if (i_122_ > 0)
		    stringbuilder.append("\t");
		stringbuilder.append(aFloatArray4768[i * 4 + i_122_]);
	    }
	    stringbuilder.append("\n");
	}
	return stringbuilder.toString();
    }
    
    public String method5007() {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i = 0; i < 4; i++) {
	    for (int i_123_ = 0; i_123_ < 4; i_123_++) {
		if (i_123_ > 0)
		    stringbuilder.append("\t");
		stringbuilder.append(aFloatArray4768[i * 4 + i_123_]);
	    }
	    stringbuilder.append("\n");
	}
	return stringbuilder.toString();
    }
    
    public String method5008() {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i = 0; i < 4; i++) {
	    for (int i_124_ = 0; i_124_ < 4; i_124_++) {
		if (i_124_ > 0)
		    stringbuilder.append("\t");
		stringbuilder.append(aFloatArray4768[i * 4 + i_124_]);
	    }
	    stringbuilder.append("\n");
	}
	return stringbuilder.toString();
    }
    
    public void method5009() {
	aFloatArray4768[0] = 1.0F;
	aFloatArray4768[1] = 0.0F;
	aFloatArray4768[2] = 0.0F;
	aFloatArray4768[3] = 0.0F;
	aFloatArray4768[4] = 0.0F;
	aFloatArray4768[5] = 1.0F;
	aFloatArray4768[6] = 0.0F;
	aFloatArray4768[7] = 0.0F;
	aFloatArray4768[8] = 0.0F;
	aFloatArray4768[9] = 0.0F;
	aFloatArray4768[10] = 1.0F;
	aFloatArray4768[11] = 0.0F;
	aFloatArray4768[12] = 0.0F;
	aFloatArray4768[13] = 0.0F;
	aFloatArray4768[14] = 0.0F;
	aFloatArray4768[15] = 1.0F;
    }
    
    public void method5010() {
	aFloatArray4768[0] = 1.0F;
	aFloatArray4768[1] = 0.0F;
	aFloatArray4768[2] = 0.0F;
	aFloatArray4768[3] = 0.0F;
	aFloatArray4768[4] = 0.0F;
	aFloatArray4768[5] = 1.0F;
	aFloatArray4768[6] = 0.0F;
	aFloatArray4768[7] = 0.0F;
	aFloatArray4768[8] = 0.0F;
	aFloatArray4768[9] = 0.0F;
	aFloatArray4768[10] = 1.0F;
	aFloatArray4768[11] = 0.0F;
	aFloatArray4768[12] = 0.0F;
	aFloatArray4768[13] = 0.0F;
	aFloatArray4768[14] = 0.0F;
	aFloatArray4768[15] = 1.0F;
    }
    
    public void method5011(Class418 class418_125_) {
	System.arraycopy(class418_125_.aFloatArray4768, 0, aFloatArray4768, 0,
			 16);
    }
    
    public void method5012(Class418 class418_126_) {
	System.arraycopy(class418_126_.aFloatArray4768, 0, aFloatArray4768, 0,
			 16);
    }
    
    public int hashCode() {
	int i = 1;
	i = 31 * i + Arrays.hashCode(aFloatArray4768);
	return i;
    }
    
    public void method5013() {
	aFloatArray4768[0] = 1.0F;
	aFloatArray4768[1] = 0.0F;
	aFloatArray4768[2] = 0.0F;
	aFloatArray4768[3] = 0.0F;
	aFloatArray4768[4] = 0.0F;
	aFloatArray4768[5] = 1.0F;
	aFloatArray4768[6] = 0.0F;
	aFloatArray4768[7] = 0.0F;
	aFloatArray4768[8] = 0.0F;
	aFloatArray4768[9] = 0.0F;
	aFloatArray4768[10] = 1.0F;
	aFloatArray4768[11] = 0.0F;
	aFloatArray4768[12] = 0.0F;
	aFloatArray4768[13] = 0.0F;
	aFloatArray4768[14] = 0.0F;
	aFloatArray4768[15] = 1.0F;
    }
    
    public Class418() {
	aFloatArray4768 = new float[16];
	method5013();
    }
    
    public boolean method5014(Object object) {
	if (!(object instanceof Class418))
	    return false;
	Class418 class418_127_ = (Class418) object;
	for (int i = 0; i < 16; i++) {
	    if (aFloatArray4768[i] != class418_127_.aFloatArray4768[i])
		return false;
	}
	return true;
    }
    
    public void method5015() {
	float f = aFloatArray4768[0];
	float f_128_ = aFloatArray4768[4];
	float f_129_ = aFloatArray4768[8];
	float f_130_ = aFloatArray4768[12];
	float f_131_ = aFloatArray4768[1];
	float f_132_ = aFloatArray4768[5];
	float f_133_ = aFloatArray4768[9];
	float f_134_ = aFloatArray4768[13];
	float f_135_ = aFloatArray4768[2];
	float f_136_ = aFloatArray4768[6];
	float f_137_ = aFloatArray4768[10];
	float f_138_ = aFloatArray4768[14];
	float f_139_ = aFloatArray4768[3];
	float f_140_ = aFloatArray4768[7];
	float f_141_ = aFloatArray4768[11];
	float f_142_ = aFloatArray4768[15];
	aFloatArray4768[0] = f;
	aFloatArray4768[1] = f_128_;
	aFloatArray4768[2] = f_129_;
	aFloatArray4768[3] = f_130_;
	aFloatArray4768[4] = f_131_;
	aFloatArray4768[5] = f_132_;
	aFloatArray4768[6] = f_133_;
	aFloatArray4768[7] = f_134_;
	aFloatArray4768[8] = f_135_;
	aFloatArray4768[9] = f_136_;
	aFloatArray4768[10] = f_137_;
	aFloatArray4768[11] = f_138_;
	aFloatArray4768[12] = f_139_;
	aFloatArray4768[13] = f_140_;
	aFloatArray4768[14] = f_141_;
	aFloatArray4768[15] = f_142_;
    }
    
    float method5016() {
	return ((aFloatArray4768[0] * aFloatArray4768[5] * aFloatArray4768[10]
		 * aFloatArray4768[15])
		- (aFloatArray4768[0] * aFloatArray4768[5]
		   * aFloatArray4768[11] * aFloatArray4768[14])
		- (aFloatArray4768[0] * aFloatArray4768[6] * aFloatArray4768[9]
		   * aFloatArray4768[15])
		+ (aFloatArray4768[0] * aFloatArray4768[6]
		   * aFloatArray4768[11] * aFloatArray4768[13])
		+ (aFloatArray4768[0] * aFloatArray4768[7] * aFloatArray4768[9]
		   * aFloatArray4768[14])
		- (aFloatArray4768[0] * aFloatArray4768[7]
		   * aFloatArray4768[10] * aFloatArray4768[13])
		- (aFloatArray4768[1] * aFloatArray4768[4]
		   * aFloatArray4768[10] * aFloatArray4768[15])
		+ (aFloatArray4768[1] * aFloatArray4768[4]
		   * aFloatArray4768[11] * aFloatArray4768[14])
		+ (aFloatArray4768[1] * aFloatArray4768[6] * aFloatArray4768[8]
		   * aFloatArray4768[15])
		- (aFloatArray4768[1] * aFloatArray4768[6]
		   * aFloatArray4768[11] * aFloatArray4768[12])
		- (aFloatArray4768[1] * aFloatArray4768[7] * aFloatArray4768[8]
		   * aFloatArray4768[14])
		+ (aFloatArray4768[1] * aFloatArray4768[7]
		   * aFloatArray4768[10] * aFloatArray4768[12])
		+ (aFloatArray4768[2] * aFloatArray4768[4] * aFloatArray4768[9]
		   * aFloatArray4768[15])
		- (aFloatArray4768[2] * aFloatArray4768[4]
		   * aFloatArray4768[11] * aFloatArray4768[13])
		- (aFloatArray4768[2] * aFloatArray4768[5] * aFloatArray4768[8]
		   * aFloatArray4768[15])
		+ (aFloatArray4768[2] * aFloatArray4768[5]
		   * aFloatArray4768[11] * aFloatArray4768[12])
		+ (aFloatArray4768[2] * aFloatArray4768[7] * aFloatArray4768[8]
		   * aFloatArray4768[13])
		- (aFloatArray4768[2] * aFloatArray4768[7] * aFloatArray4768[9]
		   * aFloatArray4768[12])
		- (aFloatArray4768[3] * aFloatArray4768[4] * aFloatArray4768[9]
		   * aFloatArray4768[14])
		+ (aFloatArray4768[3] * aFloatArray4768[4]
		   * aFloatArray4768[10] * aFloatArray4768[13])
		+ (aFloatArray4768[3] * aFloatArray4768[5] * aFloatArray4768[8]
		   * aFloatArray4768[14])
		- (aFloatArray4768[3] * aFloatArray4768[5]
		   * aFloatArray4768[10] * aFloatArray4768[12])
		- (aFloatArray4768[3] * aFloatArray4768[6] * aFloatArray4768[8]
		   * aFloatArray4768[13])
		+ (aFloatArray4768[3] * aFloatArray4768[6] * aFloatArray4768[9]
		   * aFloatArray4768[12]));
    }
    
    float method5017() {
	return ((aFloatArray4768[0] * aFloatArray4768[5] * aFloatArray4768[10]
		 * aFloatArray4768[15])
		- (aFloatArray4768[0] * aFloatArray4768[5]
		   * aFloatArray4768[11] * aFloatArray4768[14])
		- (aFloatArray4768[0] * aFloatArray4768[6] * aFloatArray4768[9]
		   * aFloatArray4768[15])
		+ (aFloatArray4768[0] * aFloatArray4768[6]
		   * aFloatArray4768[11] * aFloatArray4768[13])
		+ (aFloatArray4768[0] * aFloatArray4768[7] * aFloatArray4768[9]
		   * aFloatArray4768[14])
		- (aFloatArray4768[0] * aFloatArray4768[7]
		   * aFloatArray4768[10] * aFloatArray4768[13])
		- (aFloatArray4768[1] * aFloatArray4768[4]
		   * aFloatArray4768[10] * aFloatArray4768[15])
		+ (aFloatArray4768[1] * aFloatArray4768[4]
		   * aFloatArray4768[11] * aFloatArray4768[14])
		+ (aFloatArray4768[1] * aFloatArray4768[6] * aFloatArray4768[8]
		   * aFloatArray4768[15])
		- (aFloatArray4768[1] * aFloatArray4768[6]
		   * aFloatArray4768[11] * aFloatArray4768[12])
		- (aFloatArray4768[1] * aFloatArray4768[7] * aFloatArray4768[8]
		   * aFloatArray4768[14])
		+ (aFloatArray4768[1] * aFloatArray4768[7]
		   * aFloatArray4768[10] * aFloatArray4768[12])
		+ (aFloatArray4768[2] * aFloatArray4768[4] * aFloatArray4768[9]
		   * aFloatArray4768[15])
		- (aFloatArray4768[2] * aFloatArray4768[4]
		   * aFloatArray4768[11] * aFloatArray4768[13])
		- (aFloatArray4768[2] * aFloatArray4768[5] * aFloatArray4768[8]
		   * aFloatArray4768[15])
		+ (aFloatArray4768[2] * aFloatArray4768[5]
		   * aFloatArray4768[11] * aFloatArray4768[12])
		+ (aFloatArray4768[2] * aFloatArray4768[7] * aFloatArray4768[8]
		   * aFloatArray4768[13])
		- (aFloatArray4768[2] * aFloatArray4768[7] * aFloatArray4768[9]
		   * aFloatArray4768[12])
		- (aFloatArray4768[3] * aFloatArray4768[4] * aFloatArray4768[9]
		   * aFloatArray4768[14])
		+ (aFloatArray4768[3] * aFloatArray4768[4]
		   * aFloatArray4768[10] * aFloatArray4768[13])
		+ (aFloatArray4768[3] * aFloatArray4768[5] * aFloatArray4768[8]
		   * aFloatArray4768[14])
		- (aFloatArray4768[3] * aFloatArray4768[5]
		   * aFloatArray4768[10] * aFloatArray4768[12])
		- (aFloatArray4768[3] * aFloatArray4768[6] * aFloatArray4768[8]
		   * aFloatArray4768[13])
		+ (aFloatArray4768[3] * aFloatArray4768[6] * aFloatArray4768[9]
		   * aFloatArray4768[12]));
    }
    
    float method5018() {
	return ((aFloatArray4768[0] * aFloatArray4768[5] * aFloatArray4768[10]
		 * aFloatArray4768[15])
		- (aFloatArray4768[0] * aFloatArray4768[5]
		   * aFloatArray4768[11] * aFloatArray4768[14])
		- (aFloatArray4768[0] * aFloatArray4768[6] * aFloatArray4768[9]
		   * aFloatArray4768[15])
		+ (aFloatArray4768[0] * aFloatArray4768[6]
		   * aFloatArray4768[11] * aFloatArray4768[13])
		+ (aFloatArray4768[0] * aFloatArray4768[7] * aFloatArray4768[9]
		   * aFloatArray4768[14])
		- (aFloatArray4768[0] * aFloatArray4768[7]
		   * aFloatArray4768[10] * aFloatArray4768[13])
		- (aFloatArray4768[1] * aFloatArray4768[4]
		   * aFloatArray4768[10] * aFloatArray4768[15])
		+ (aFloatArray4768[1] * aFloatArray4768[4]
		   * aFloatArray4768[11] * aFloatArray4768[14])
		+ (aFloatArray4768[1] * aFloatArray4768[6] * aFloatArray4768[8]
		   * aFloatArray4768[15])
		- (aFloatArray4768[1] * aFloatArray4768[6]
		   * aFloatArray4768[11] * aFloatArray4768[12])
		- (aFloatArray4768[1] * aFloatArray4768[7] * aFloatArray4768[8]
		   * aFloatArray4768[14])
		+ (aFloatArray4768[1] * aFloatArray4768[7]
		   * aFloatArray4768[10] * aFloatArray4768[12])
		+ (aFloatArray4768[2] * aFloatArray4768[4] * aFloatArray4768[9]
		   * aFloatArray4768[15])
		- (aFloatArray4768[2] * aFloatArray4768[4]
		   * aFloatArray4768[11] * aFloatArray4768[13])
		- (aFloatArray4768[2] * aFloatArray4768[5] * aFloatArray4768[8]
		   * aFloatArray4768[15])
		+ (aFloatArray4768[2] * aFloatArray4768[5]
		   * aFloatArray4768[11] * aFloatArray4768[12])
		+ (aFloatArray4768[2] * aFloatArray4768[7] * aFloatArray4768[8]
		   * aFloatArray4768[13])
		- (aFloatArray4768[2] * aFloatArray4768[7] * aFloatArray4768[9]
		   * aFloatArray4768[12])
		- (aFloatArray4768[3] * aFloatArray4768[4] * aFloatArray4768[9]
		   * aFloatArray4768[14])
		+ (aFloatArray4768[3] * aFloatArray4768[4]
		   * aFloatArray4768[10] * aFloatArray4768[13])
		+ (aFloatArray4768[3] * aFloatArray4768[5] * aFloatArray4768[8]
		   * aFloatArray4768[14])
		- (aFloatArray4768[3] * aFloatArray4768[5]
		   * aFloatArray4768[10] * aFloatArray4768[12])
		- (aFloatArray4768[3] * aFloatArray4768[6] * aFloatArray4768[8]
		   * aFloatArray4768[13])
		+ (aFloatArray4768[3] * aFloatArray4768[6] * aFloatArray4768[9]
		   * aFloatArray4768[12]));
    }
    
    public void method5019() {
	float f = 1.0F / method4975();
	float f_143_
	    = (aFloatArray4768[5] * aFloatArray4768[10] * aFloatArray4768[15]
	       - aFloatArray4768[5] * aFloatArray4768[11] * aFloatArray4768[14]
	       - aFloatArray4768[6] * aFloatArray4768[9] * aFloatArray4768[15]
	       + aFloatArray4768[6] * aFloatArray4768[11] * aFloatArray4768[13]
	       + aFloatArray4768[7] * aFloatArray4768[9] * aFloatArray4768[14]
	       - (aFloatArray4768[7] * aFloatArray4768[10]
		  * aFloatArray4768[13])) * f;
	float f_144_
	    = (-aFloatArray4768[1] * aFloatArray4768[10] * aFloatArray4768[15]
	       + aFloatArray4768[1] * aFloatArray4768[11] * aFloatArray4768[14]
	       + aFloatArray4768[2] * aFloatArray4768[9] * aFloatArray4768[15]
	       - aFloatArray4768[2] * aFloatArray4768[11] * aFloatArray4768[13]
	       - aFloatArray4768[3] * aFloatArray4768[9] * aFloatArray4768[14]
	       + (aFloatArray4768[3] * aFloatArray4768[10]
		  * aFloatArray4768[13])) * f;
	float f_145_
	    = ((aFloatArray4768[1] * aFloatArray4768[6] * aFloatArray4768[15]
		- aFloatArray4768[1] * aFloatArray4768[7] * aFloatArray4768[14]
		- aFloatArray4768[2] * aFloatArray4768[5] * aFloatArray4768[15]
		+ aFloatArray4768[2] * aFloatArray4768[7] * aFloatArray4768[13]
		+ aFloatArray4768[3] * aFloatArray4768[5] * aFloatArray4768[14]
		- (aFloatArray4768[3] * aFloatArray4768[6]
		   * aFloatArray4768[13]))
	       * f);
	float f_146_
	    = ((-aFloatArray4768[1] * aFloatArray4768[6] * aFloatArray4768[11]
		+ aFloatArray4768[1] * aFloatArray4768[7] * aFloatArray4768[10]
		+ aFloatArray4768[2] * aFloatArray4768[5] * aFloatArray4768[11]
		- aFloatArray4768[2] * aFloatArray4768[7] * aFloatArray4768[9]
		- aFloatArray4768[3] * aFloatArray4768[5] * aFloatArray4768[10]
		+ aFloatArray4768[3] * aFloatArray4768[6] * aFloatArray4768[9])
	       * f);
	float f_147_
	    = (-aFloatArray4768[4] * aFloatArray4768[10] * aFloatArray4768[15]
	       + aFloatArray4768[4] * aFloatArray4768[11] * aFloatArray4768[14]
	       + aFloatArray4768[6] * aFloatArray4768[8] * aFloatArray4768[15]
	       - aFloatArray4768[6] * aFloatArray4768[11] * aFloatArray4768[12]
	       - aFloatArray4768[7] * aFloatArray4768[8] * aFloatArray4768[14]
	       + (aFloatArray4768[7] * aFloatArray4768[10]
		  * aFloatArray4768[12])) * f;
	float f_148_
	    = (aFloatArray4768[0] * aFloatArray4768[10] * aFloatArray4768[15]
	       - aFloatArray4768[0] * aFloatArray4768[11] * aFloatArray4768[14]
	       - aFloatArray4768[2] * aFloatArray4768[8] * aFloatArray4768[15]
	       + aFloatArray4768[2] * aFloatArray4768[11] * aFloatArray4768[12]
	       + aFloatArray4768[3] * aFloatArray4768[8] * aFloatArray4768[14]
	       - (aFloatArray4768[3] * aFloatArray4768[10]
		  * aFloatArray4768[12])) * f;
	float f_149_
	    = ((-aFloatArray4768[0] * aFloatArray4768[6] * aFloatArray4768[15]
		+ aFloatArray4768[0] * aFloatArray4768[7] * aFloatArray4768[14]
		+ aFloatArray4768[2] * aFloatArray4768[4] * aFloatArray4768[15]
		- aFloatArray4768[2] * aFloatArray4768[7] * aFloatArray4768[12]
		- aFloatArray4768[3] * aFloatArray4768[4] * aFloatArray4768[14]
		+ (aFloatArray4768[3] * aFloatArray4768[6]
		   * aFloatArray4768[12]))
	       * f);
	float f_150_
	    = ((aFloatArray4768[0] * aFloatArray4768[6] * aFloatArray4768[11]
		- aFloatArray4768[0] * aFloatArray4768[7] * aFloatArray4768[10]
		- aFloatArray4768[2] * aFloatArray4768[4] * aFloatArray4768[11]
		+ aFloatArray4768[2] * aFloatArray4768[7] * aFloatArray4768[8]
		+ aFloatArray4768[3] * aFloatArray4768[4] * aFloatArray4768[10]
		- aFloatArray4768[3] * aFloatArray4768[6] * aFloatArray4768[8])
	       * f);
	float f_151_
	    = (aFloatArray4768[4] * aFloatArray4768[9] * aFloatArray4768[15]
	       - aFloatArray4768[4] * aFloatArray4768[11] * aFloatArray4768[13]
	       - aFloatArray4768[5] * aFloatArray4768[8] * aFloatArray4768[15]
	       + aFloatArray4768[5] * aFloatArray4768[11] * aFloatArray4768[12]
	       + aFloatArray4768[7] * aFloatArray4768[8] * aFloatArray4768[13]
	       - (aFloatArray4768[7] * aFloatArray4768[9]
		  * aFloatArray4768[12])) * f;
	float f_152_
	    = (-aFloatArray4768[0] * aFloatArray4768[9] * aFloatArray4768[15]
	       + aFloatArray4768[0] * aFloatArray4768[11] * aFloatArray4768[13]
	       + aFloatArray4768[1] * aFloatArray4768[8] * aFloatArray4768[15]
	       - aFloatArray4768[1] * aFloatArray4768[11] * aFloatArray4768[12]
	       - aFloatArray4768[3] * aFloatArray4768[8] * aFloatArray4768[13]
	       + (aFloatArray4768[3] * aFloatArray4768[9]
		  * aFloatArray4768[12])) * f;
	float f_153_
	    = ((aFloatArray4768[0] * aFloatArray4768[5] * aFloatArray4768[15]
		- aFloatArray4768[0] * aFloatArray4768[7] * aFloatArray4768[13]
		- aFloatArray4768[1] * aFloatArray4768[4] * aFloatArray4768[15]
		+ aFloatArray4768[1] * aFloatArray4768[7] * aFloatArray4768[12]
		+ aFloatArray4768[3] * aFloatArray4768[4] * aFloatArray4768[13]
		- (aFloatArray4768[3] * aFloatArray4768[5]
		   * aFloatArray4768[12]))
	       * f);
	float f_154_
	    = ((-aFloatArray4768[0] * aFloatArray4768[5] * aFloatArray4768[11]
		+ aFloatArray4768[0] * aFloatArray4768[7] * aFloatArray4768[9]
		+ aFloatArray4768[1] * aFloatArray4768[4] * aFloatArray4768[11]
		- aFloatArray4768[1] * aFloatArray4768[7] * aFloatArray4768[8]
		- aFloatArray4768[3] * aFloatArray4768[4] * aFloatArray4768[9]
		+ aFloatArray4768[3] * aFloatArray4768[5] * aFloatArray4768[8])
	       * f);
	float f_155_
	    = (-aFloatArray4768[4] * aFloatArray4768[9] * aFloatArray4768[14]
	       + aFloatArray4768[4] * aFloatArray4768[10] * aFloatArray4768[13]
	       + aFloatArray4768[5] * aFloatArray4768[8] * aFloatArray4768[14]
	       - aFloatArray4768[5] * aFloatArray4768[10] * aFloatArray4768[12]
	       - aFloatArray4768[6] * aFloatArray4768[8] * aFloatArray4768[13]
	       + (aFloatArray4768[6] * aFloatArray4768[9]
		  * aFloatArray4768[12])) * f;
	float f_156_
	    = (aFloatArray4768[0] * aFloatArray4768[9] * aFloatArray4768[14]
	       - aFloatArray4768[0] * aFloatArray4768[10] * aFloatArray4768[13]
	       - aFloatArray4768[1] * aFloatArray4768[8] * aFloatArray4768[14]
	       + aFloatArray4768[1] * aFloatArray4768[10] * aFloatArray4768[12]
	       + aFloatArray4768[2] * aFloatArray4768[8] * aFloatArray4768[13]
	       - (aFloatArray4768[2] * aFloatArray4768[9]
		  * aFloatArray4768[12])) * f;
	float f_157_
	    = ((-aFloatArray4768[0] * aFloatArray4768[5] * aFloatArray4768[14]
		+ aFloatArray4768[0] * aFloatArray4768[6] * aFloatArray4768[13]
		+ aFloatArray4768[1] * aFloatArray4768[4] * aFloatArray4768[14]
		- aFloatArray4768[1] * aFloatArray4768[6] * aFloatArray4768[12]
		- aFloatArray4768[2] * aFloatArray4768[4] * aFloatArray4768[13]
		+ (aFloatArray4768[2] * aFloatArray4768[5]
		   * aFloatArray4768[12]))
	       * f);
	float f_158_
	    = ((aFloatArray4768[0] * aFloatArray4768[5] * aFloatArray4768[10]
		- aFloatArray4768[0] * aFloatArray4768[6] * aFloatArray4768[9]
		- aFloatArray4768[1] * aFloatArray4768[4] * aFloatArray4768[10]
		+ aFloatArray4768[1] * aFloatArray4768[6] * aFloatArray4768[8]
		+ aFloatArray4768[2] * aFloatArray4768[4] * aFloatArray4768[9]
		- aFloatArray4768[2] * aFloatArray4768[5] * aFloatArray4768[8])
	       * f);
	aFloatArray4768[0] = f_143_;
	aFloatArray4768[1] = f_144_;
	aFloatArray4768[2] = f_145_;
	aFloatArray4768[3] = f_146_;
	aFloatArray4768[4] = f_147_;
	aFloatArray4768[5] = f_148_;
	aFloatArray4768[6] = f_149_;
	aFloatArray4768[7] = f_150_;
	aFloatArray4768[8] = f_151_;
	aFloatArray4768[9] = f_152_;
	aFloatArray4768[10] = f_153_;
	aFloatArray4768[11] = f_154_;
	aFloatArray4768[12] = f_155_;
	aFloatArray4768[13] = f_156_;
	aFloatArray4768[14] = f_157_;
	aFloatArray4768[15] = f_158_;
    }
    
    public void method5020() {
	float f = 1.0F / method4975();
	float f_159_
	    = (aFloatArray4768[5] * aFloatArray4768[10] * aFloatArray4768[15]
	       - aFloatArray4768[5] * aFloatArray4768[11] * aFloatArray4768[14]
	       - aFloatArray4768[6] * aFloatArray4768[9] * aFloatArray4768[15]
	       + aFloatArray4768[6] * aFloatArray4768[11] * aFloatArray4768[13]
	       + aFloatArray4768[7] * aFloatArray4768[9] * aFloatArray4768[14]
	       - (aFloatArray4768[7] * aFloatArray4768[10]
		  * aFloatArray4768[13])) * f;
	float f_160_
	    = (-aFloatArray4768[1] * aFloatArray4768[10] * aFloatArray4768[15]
	       + aFloatArray4768[1] * aFloatArray4768[11] * aFloatArray4768[14]
	       + aFloatArray4768[2] * aFloatArray4768[9] * aFloatArray4768[15]
	       - aFloatArray4768[2] * aFloatArray4768[11] * aFloatArray4768[13]
	       - aFloatArray4768[3] * aFloatArray4768[9] * aFloatArray4768[14]
	       + (aFloatArray4768[3] * aFloatArray4768[10]
		  * aFloatArray4768[13])) * f;
	float f_161_
	    = ((aFloatArray4768[1] * aFloatArray4768[6] * aFloatArray4768[15]
		- aFloatArray4768[1] * aFloatArray4768[7] * aFloatArray4768[14]
		- aFloatArray4768[2] * aFloatArray4768[5] * aFloatArray4768[15]
		+ aFloatArray4768[2] * aFloatArray4768[7] * aFloatArray4768[13]
		+ aFloatArray4768[3] * aFloatArray4768[5] * aFloatArray4768[14]
		- (aFloatArray4768[3] * aFloatArray4768[6]
		   * aFloatArray4768[13]))
	       * f);
	float f_162_
	    = ((-aFloatArray4768[1] * aFloatArray4768[6] * aFloatArray4768[11]
		+ aFloatArray4768[1] * aFloatArray4768[7] * aFloatArray4768[10]
		+ aFloatArray4768[2] * aFloatArray4768[5] * aFloatArray4768[11]
		- aFloatArray4768[2] * aFloatArray4768[7] * aFloatArray4768[9]
		- aFloatArray4768[3] * aFloatArray4768[5] * aFloatArray4768[10]
		+ aFloatArray4768[3] * aFloatArray4768[6] * aFloatArray4768[9])
	       * f);
	float f_163_
	    = (-aFloatArray4768[4] * aFloatArray4768[10] * aFloatArray4768[15]
	       + aFloatArray4768[4] * aFloatArray4768[11] * aFloatArray4768[14]
	       + aFloatArray4768[6] * aFloatArray4768[8] * aFloatArray4768[15]
	       - aFloatArray4768[6] * aFloatArray4768[11] * aFloatArray4768[12]
	       - aFloatArray4768[7] * aFloatArray4768[8] * aFloatArray4768[14]
	       + (aFloatArray4768[7] * aFloatArray4768[10]
		  * aFloatArray4768[12])) * f;
	float f_164_
	    = (aFloatArray4768[0] * aFloatArray4768[10] * aFloatArray4768[15]
	       - aFloatArray4768[0] * aFloatArray4768[11] * aFloatArray4768[14]
	       - aFloatArray4768[2] * aFloatArray4768[8] * aFloatArray4768[15]
	       + aFloatArray4768[2] * aFloatArray4768[11] * aFloatArray4768[12]
	       + aFloatArray4768[3] * aFloatArray4768[8] * aFloatArray4768[14]
	       - (aFloatArray4768[3] * aFloatArray4768[10]
		  * aFloatArray4768[12])) * f;
	float f_165_
	    = ((-aFloatArray4768[0] * aFloatArray4768[6] * aFloatArray4768[15]
		+ aFloatArray4768[0] * aFloatArray4768[7] * aFloatArray4768[14]
		+ aFloatArray4768[2] * aFloatArray4768[4] * aFloatArray4768[15]
		- aFloatArray4768[2] * aFloatArray4768[7] * aFloatArray4768[12]
		- aFloatArray4768[3] * aFloatArray4768[4] * aFloatArray4768[14]
		+ (aFloatArray4768[3] * aFloatArray4768[6]
		   * aFloatArray4768[12]))
	       * f);
	float f_166_
	    = ((aFloatArray4768[0] * aFloatArray4768[6] * aFloatArray4768[11]
		- aFloatArray4768[0] * aFloatArray4768[7] * aFloatArray4768[10]
		- aFloatArray4768[2] * aFloatArray4768[4] * aFloatArray4768[11]
		+ aFloatArray4768[2] * aFloatArray4768[7] * aFloatArray4768[8]
		+ aFloatArray4768[3] * aFloatArray4768[4] * aFloatArray4768[10]
		- aFloatArray4768[3] * aFloatArray4768[6] * aFloatArray4768[8])
	       * f);
	float f_167_
	    = (aFloatArray4768[4] * aFloatArray4768[9] * aFloatArray4768[15]
	       - aFloatArray4768[4] * aFloatArray4768[11] * aFloatArray4768[13]
	       - aFloatArray4768[5] * aFloatArray4768[8] * aFloatArray4768[15]
	       + aFloatArray4768[5] * aFloatArray4768[11] * aFloatArray4768[12]
	       + aFloatArray4768[7] * aFloatArray4768[8] * aFloatArray4768[13]
	       - (aFloatArray4768[7] * aFloatArray4768[9]
		  * aFloatArray4768[12])) * f;
	float f_168_
	    = (-aFloatArray4768[0] * aFloatArray4768[9] * aFloatArray4768[15]
	       + aFloatArray4768[0] * aFloatArray4768[11] * aFloatArray4768[13]
	       + aFloatArray4768[1] * aFloatArray4768[8] * aFloatArray4768[15]
	       - aFloatArray4768[1] * aFloatArray4768[11] * aFloatArray4768[12]
	       - aFloatArray4768[3] * aFloatArray4768[8] * aFloatArray4768[13]
	       + (aFloatArray4768[3] * aFloatArray4768[9]
		  * aFloatArray4768[12])) * f;
	float f_169_
	    = ((aFloatArray4768[0] * aFloatArray4768[5] * aFloatArray4768[15]
		- aFloatArray4768[0] * aFloatArray4768[7] * aFloatArray4768[13]
		- aFloatArray4768[1] * aFloatArray4768[4] * aFloatArray4768[15]
		+ aFloatArray4768[1] * aFloatArray4768[7] * aFloatArray4768[12]
		+ aFloatArray4768[3] * aFloatArray4768[4] * aFloatArray4768[13]
		- (aFloatArray4768[3] * aFloatArray4768[5]
		   * aFloatArray4768[12]))
	       * f);
	float f_170_
	    = ((-aFloatArray4768[0] * aFloatArray4768[5] * aFloatArray4768[11]
		+ aFloatArray4768[0] * aFloatArray4768[7] * aFloatArray4768[9]
		+ aFloatArray4768[1] * aFloatArray4768[4] * aFloatArray4768[11]
		- aFloatArray4768[1] * aFloatArray4768[7] * aFloatArray4768[8]
		- aFloatArray4768[3] * aFloatArray4768[4] * aFloatArray4768[9]
		+ aFloatArray4768[3] * aFloatArray4768[5] * aFloatArray4768[8])
	       * f);
	float f_171_
	    = (-aFloatArray4768[4] * aFloatArray4768[9] * aFloatArray4768[14]
	       + aFloatArray4768[4] * aFloatArray4768[10] * aFloatArray4768[13]
	       + aFloatArray4768[5] * aFloatArray4768[8] * aFloatArray4768[14]
	       - aFloatArray4768[5] * aFloatArray4768[10] * aFloatArray4768[12]
	       - aFloatArray4768[6] * aFloatArray4768[8] * aFloatArray4768[13]
	       + (aFloatArray4768[6] * aFloatArray4768[9]
		  * aFloatArray4768[12])) * f;
	float f_172_
	    = (aFloatArray4768[0] * aFloatArray4768[9] * aFloatArray4768[14]
	       - aFloatArray4768[0] * aFloatArray4768[10] * aFloatArray4768[13]
	       - aFloatArray4768[1] * aFloatArray4768[8] * aFloatArray4768[14]
	       + aFloatArray4768[1] * aFloatArray4768[10] * aFloatArray4768[12]
	       + aFloatArray4768[2] * aFloatArray4768[8] * aFloatArray4768[13]
	       - (aFloatArray4768[2] * aFloatArray4768[9]
		  * aFloatArray4768[12])) * f;
	float f_173_
	    = ((-aFloatArray4768[0] * aFloatArray4768[5] * aFloatArray4768[14]
		+ aFloatArray4768[0] * aFloatArray4768[6] * aFloatArray4768[13]
		+ aFloatArray4768[1] * aFloatArray4768[4] * aFloatArray4768[14]
		- aFloatArray4768[1] * aFloatArray4768[6] * aFloatArray4768[12]
		- aFloatArray4768[2] * aFloatArray4768[4] * aFloatArray4768[13]
		+ (aFloatArray4768[2] * aFloatArray4768[5]
		   * aFloatArray4768[12]))
	       * f);
	float f_174_
	    = ((aFloatArray4768[0] * aFloatArray4768[5] * aFloatArray4768[10]
		- aFloatArray4768[0] * aFloatArray4768[6] * aFloatArray4768[9]
		- aFloatArray4768[1] * aFloatArray4768[4] * aFloatArray4768[10]
		+ aFloatArray4768[1] * aFloatArray4768[6] * aFloatArray4768[8]
		+ aFloatArray4768[2] * aFloatArray4768[4] * aFloatArray4768[9]
		- aFloatArray4768[2] * aFloatArray4768[5] * aFloatArray4768[8])
	       * f);
	aFloatArray4768[0] = f_159_;
	aFloatArray4768[1] = f_160_;
	aFloatArray4768[2] = f_161_;
	aFloatArray4768[3] = f_162_;
	aFloatArray4768[4] = f_163_;
	aFloatArray4768[5] = f_164_;
	aFloatArray4768[6] = f_165_;
	aFloatArray4768[7] = f_166_;
	aFloatArray4768[8] = f_167_;
	aFloatArray4768[9] = f_168_;
	aFloatArray4768[10] = f_169_;
	aFloatArray4768[11] = f_170_;
	aFloatArray4768[12] = f_171_;
	aFloatArray4768[13] = f_172_;
	aFloatArray4768[14] = f_173_;
	aFloatArray4768[15] = f_174_;
    }
    
    public boolean method5021() {
	return (aFloatArray4768[0] == 1.0F && aFloatArray4768[1] == 0.0F
		&& aFloatArray4768[2] == 0.0F && aFloatArray4768[3] == 0.0F
		&& aFloatArray4768[4] == 0.0F && aFloatArray4768[5] == 1.0F
		&& aFloatArray4768[6] == 0.0F && aFloatArray4768[7] == 0.0F
		&& aFloatArray4768[8] == 0.0F && aFloatArray4768[9] == 0.0F
		&& aFloatArray4768[10] == 1.0F && aFloatArray4768[11] == 0.0F
		&& aFloatArray4768[12] == 0.0F && aFloatArray4768[13] == 0.0F
		&& aFloatArray4768[14] == 0.0F && aFloatArray4768[15] == 1.0F);
    }
    
    public void method5022(float f, float f_175_, float f_176_, float[] fs) {
	fs[0] = (aFloatArray4768[0] * f + aFloatArray4768[4] * f_175_
		 + aFloatArray4768[8] * f_176_ + aFloatArray4768[12]);
	fs[1] = (aFloatArray4768[1] * f + aFloatArray4768[5] * f_175_
		 + aFloatArray4768[9] * f_176_ + aFloatArray4768[13]);
	fs[2] = (aFloatArray4768[2] * f + aFloatArray4768[6] * f_175_
		 + aFloatArray4768[10] * f_176_ + aFloatArray4768[14]);
	if (fs.length > 3)
	    fs[3] = (aFloatArray4768[3] * f + aFloatArray4768[7] * f_175_
		     + aFloatArray4768[11] * f_176_ + aFloatArray4768[15]);
    }
    
    public void method5023(float[] fs) {
	float f = fs[0];
	float f_177_ = fs[1];
	float f_178_ = fs[2];
	fs[0] = (aFloatArray4768[0] * f + aFloatArray4768[4] * f_177_
		 + aFloatArray4768[8] * f_178_ + aFloatArray4768[12]);
	fs[1] = (aFloatArray4768[1] * f + aFloatArray4768[5] * f_177_
		 + aFloatArray4768[9] * f_178_ + aFloatArray4768[13]);
	fs[2] = (aFloatArray4768[2] * f + aFloatArray4768[6] * f_177_
		 + aFloatArray4768[10] * f_178_ + aFloatArray4768[14]);
    }
    
    public void method5024() {
	float f = 1.0F / method4975();
	float f_179_
	    = (aFloatArray4768[5] * aFloatArray4768[10] * aFloatArray4768[15]
	       - aFloatArray4768[5] * aFloatArray4768[11] * aFloatArray4768[14]
	       - aFloatArray4768[6] * aFloatArray4768[9] * aFloatArray4768[15]
	       + aFloatArray4768[6] * aFloatArray4768[11] * aFloatArray4768[13]
	       + aFloatArray4768[7] * aFloatArray4768[9] * aFloatArray4768[14]
	       - (aFloatArray4768[7] * aFloatArray4768[10]
		  * aFloatArray4768[13])) * f;
	float f_180_
	    = (-aFloatArray4768[1] * aFloatArray4768[10] * aFloatArray4768[15]
	       + aFloatArray4768[1] * aFloatArray4768[11] * aFloatArray4768[14]
	       + aFloatArray4768[2] * aFloatArray4768[9] * aFloatArray4768[15]
	       - aFloatArray4768[2] * aFloatArray4768[11] * aFloatArray4768[13]
	       - aFloatArray4768[3] * aFloatArray4768[9] * aFloatArray4768[14]
	       + (aFloatArray4768[3] * aFloatArray4768[10]
		  * aFloatArray4768[13])) * f;
	float f_181_
	    = ((aFloatArray4768[1] * aFloatArray4768[6] * aFloatArray4768[15]
		- aFloatArray4768[1] * aFloatArray4768[7] * aFloatArray4768[14]
		- aFloatArray4768[2] * aFloatArray4768[5] * aFloatArray4768[15]
		+ aFloatArray4768[2] * aFloatArray4768[7] * aFloatArray4768[13]
		+ aFloatArray4768[3] * aFloatArray4768[5] * aFloatArray4768[14]
		- (aFloatArray4768[3] * aFloatArray4768[6]
		   * aFloatArray4768[13]))
	       * f);
	float f_182_
	    = ((-aFloatArray4768[1] * aFloatArray4768[6] * aFloatArray4768[11]
		+ aFloatArray4768[1] * aFloatArray4768[7] * aFloatArray4768[10]
		+ aFloatArray4768[2] * aFloatArray4768[5] * aFloatArray4768[11]
		- aFloatArray4768[2] * aFloatArray4768[7] * aFloatArray4768[9]
		- aFloatArray4768[3] * aFloatArray4768[5] * aFloatArray4768[10]
		+ aFloatArray4768[3] * aFloatArray4768[6] * aFloatArray4768[9])
	       * f);
	float f_183_
	    = (-aFloatArray4768[4] * aFloatArray4768[10] * aFloatArray4768[15]
	       + aFloatArray4768[4] * aFloatArray4768[11] * aFloatArray4768[14]
	       + aFloatArray4768[6] * aFloatArray4768[8] * aFloatArray4768[15]
	       - aFloatArray4768[6] * aFloatArray4768[11] * aFloatArray4768[12]
	       - aFloatArray4768[7] * aFloatArray4768[8] * aFloatArray4768[14]
	       + (aFloatArray4768[7] * aFloatArray4768[10]
		  * aFloatArray4768[12])) * f;
	float f_184_
	    = (aFloatArray4768[0] * aFloatArray4768[10] * aFloatArray4768[15]
	       - aFloatArray4768[0] * aFloatArray4768[11] * aFloatArray4768[14]
	       - aFloatArray4768[2] * aFloatArray4768[8] * aFloatArray4768[15]
	       + aFloatArray4768[2] * aFloatArray4768[11] * aFloatArray4768[12]
	       + aFloatArray4768[3] * aFloatArray4768[8] * aFloatArray4768[14]
	       - (aFloatArray4768[3] * aFloatArray4768[10]
		  * aFloatArray4768[12])) * f;
	float f_185_
	    = ((-aFloatArray4768[0] * aFloatArray4768[6] * aFloatArray4768[15]
		+ aFloatArray4768[0] * aFloatArray4768[7] * aFloatArray4768[14]
		+ aFloatArray4768[2] * aFloatArray4768[4] * aFloatArray4768[15]
		- aFloatArray4768[2] * aFloatArray4768[7] * aFloatArray4768[12]
		- aFloatArray4768[3] * aFloatArray4768[4] * aFloatArray4768[14]
		+ (aFloatArray4768[3] * aFloatArray4768[6]
		   * aFloatArray4768[12]))
	       * f);
	float f_186_
	    = ((aFloatArray4768[0] * aFloatArray4768[6] * aFloatArray4768[11]
		- aFloatArray4768[0] * aFloatArray4768[7] * aFloatArray4768[10]
		- aFloatArray4768[2] * aFloatArray4768[4] * aFloatArray4768[11]
		+ aFloatArray4768[2] * aFloatArray4768[7] * aFloatArray4768[8]
		+ aFloatArray4768[3] * aFloatArray4768[4] * aFloatArray4768[10]
		- aFloatArray4768[3] * aFloatArray4768[6] * aFloatArray4768[8])
	       * f);
	float f_187_
	    = (aFloatArray4768[4] * aFloatArray4768[9] * aFloatArray4768[15]
	       - aFloatArray4768[4] * aFloatArray4768[11] * aFloatArray4768[13]
	       - aFloatArray4768[5] * aFloatArray4768[8] * aFloatArray4768[15]
	       + aFloatArray4768[5] * aFloatArray4768[11] * aFloatArray4768[12]
	       + aFloatArray4768[7] * aFloatArray4768[8] * aFloatArray4768[13]
	       - (aFloatArray4768[7] * aFloatArray4768[9]
		  * aFloatArray4768[12])) * f;
	float f_188_
	    = (-aFloatArray4768[0] * aFloatArray4768[9] * aFloatArray4768[15]
	       + aFloatArray4768[0] * aFloatArray4768[11] * aFloatArray4768[13]
	       + aFloatArray4768[1] * aFloatArray4768[8] * aFloatArray4768[15]
	       - aFloatArray4768[1] * aFloatArray4768[11] * aFloatArray4768[12]
	       - aFloatArray4768[3] * aFloatArray4768[8] * aFloatArray4768[13]
	       + (aFloatArray4768[3] * aFloatArray4768[9]
		  * aFloatArray4768[12])) * f;
	float f_189_
	    = ((aFloatArray4768[0] * aFloatArray4768[5] * aFloatArray4768[15]
		- aFloatArray4768[0] * aFloatArray4768[7] * aFloatArray4768[13]
		- aFloatArray4768[1] * aFloatArray4768[4] * aFloatArray4768[15]
		+ aFloatArray4768[1] * aFloatArray4768[7] * aFloatArray4768[12]
		+ aFloatArray4768[3] * aFloatArray4768[4] * aFloatArray4768[13]
		- (aFloatArray4768[3] * aFloatArray4768[5]
		   * aFloatArray4768[12]))
	       * f);
	float f_190_
	    = ((-aFloatArray4768[0] * aFloatArray4768[5] * aFloatArray4768[11]
		+ aFloatArray4768[0] * aFloatArray4768[7] * aFloatArray4768[9]
		+ aFloatArray4768[1] * aFloatArray4768[4] * aFloatArray4768[11]
		- aFloatArray4768[1] * aFloatArray4768[7] * aFloatArray4768[8]
		- aFloatArray4768[3] * aFloatArray4768[4] * aFloatArray4768[9]
		+ aFloatArray4768[3] * aFloatArray4768[5] * aFloatArray4768[8])
	       * f);
	float f_191_
	    = (-aFloatArray4768[4] * aFloatArray4768[9] * aFloatArray4768[14]
	       + aFloatArray4768[4] * aFloatArray4768[10] * aFloatArray4768[13]
	       + aFloatArray4768[5] * aFloatArray4768[8] * aFloatArray4768[14]
	       - aFloatArray4768[5] * aFloatArray4768[10] * aFloatArray4768[12]
	       - aFloatArray4768[6] * aFloatArray4768[8] * aFloatArray4768[13]
	       + (aFloatArray4768[6] * aFloatArray4768[9]
		  * aFloatArray4768[12])) * f;
	float f_192_
	    = (aFloatArray4768[0] * aFloatArray4768[9] * aFloatArray4768[14]
	       - aFloatArray4768[0] * aFloatArray4768[10] * aFloatArray4768[13]
	       - aFloatArray4768[1] * aFloatArray4768[8] * aFloatArray4768[14]
	       + aFloatArray4768[1] * aFloatArray4768[10] * aFloatArray4768[12]
	       + aFloatArray4768[2] * aFloatArray4768[8] * aFloatArray4768[13]
	       - (aFloatArray4768[2] * aFloatArray4768[9]
		  * aFloatArray4768[12])) * f;
	float f_193_
	    = ((-aFloatArray4768[0] * aFloatArray4768[5] * aFloatArray4768[14]
		+ aFloatArray4768[0] * aFloatArray4768[6] * aFloatArray4768[13]
		+ aFloatArray4768[1] * aFloatArray4768[4] * aFloatArray4768[14]
		- aFloatArray4768[1] * aFloatArray4768[6] * aFloatArray4768[12]
		- aFloatArray4768[2] * aFloatArray4768[4] * aFloatArray4768[13]
		+ (aFloatArray4768[2] * aFloatArray4768[5]
		   * aFloatArray4768[12]))
	       * f);
	float f_194_
	    = ((aFloatArray4768[0] * aFloatArray4768[5] * aFloatArray4768[10]
		- aFloatArray4768[0] * aFloatArray4768[6] * aFloatArray4768[9]
		- aFloatArray4768[1] * aFloatArray4768[4] * aFloatArray4768[10]
		+ aFloatArray4768[1] * aFloatArray4768[6] * aFloatArray4768[8]
		+ aFloatArray4768[2] * aFloatArray4768[4] * aFloatArray4768[9]
		- aFloatArray4768[2] * aFloatArray4768[5] * aFloatArray4768[8])
	       * f);
	aFloatArray4768[0] = f_179_;
	aFloatArray4768[1] = f_180_;
	aFloatArray4768[2] = f_181_;
	aFloatArray4768[3] = f_182_;
	aFloatArray4768[4] = f_183_;
	aFloatArray4768[5] = f_184_;
	aFloatArray4768[6] = f_185_;
	aFloatArray4768[7] = f_186_;
	aFloatArray4768[8] = f_187_;
	aFloatArray4768[9] = f_188_;
	aFloatArray4768[10] = f_189_;
	aFloatArray4768[11] = f_190_;
	aFloatArray4768[12] = f_191_;
	aFloatArray4768[13] = f_192_;
	aFloatArray4768[14] = f_193_;
	aFloatArray4768[15] = f_194_;
    }
    
    public void method5025(float f, float f_195_, float f_196_, float f_197_,
			   float f_198_, float f_199_, float f_200_,
			   float f_201_, float f_202_) {
	method4980(-(f * f_202_) / f_196_, f_202_ * (f_200_ - f) / f_196_,
		   -(f_195_ * f_202_) / f_197_,
		   f_202_ * (f_201_ - f_195_) / f_197_, f_198_, f_199_);
    }
    
    public float[] method5026(float[] fs) {
	fs[0] = aFloatArray4768[0];
	fs[1] = aFloatArray4768[4];
	fs[2] = aFloatArray4768[8];
	fs[3] = aFloatArray4768[12];
	fs[4] = aFloatArray4768[1];
	fs[5] = aFloatArray4768[5];
	fs[6] = aFloatArray4768[9];
	fs[7] = aFloatArray4768[13];
	return fs;
    }
    
    public Class418(Class418 class418_203_) {
	aFloatArray4768 = new float[16];
	method4986(class418_203_);
    }
    
    public void method5027(Class418 class418_204_) {
	System.arraycopy(class418_204_.aFloatArray4768, 0, aFloatArray4768, 0,
			 11);
	aFloatArray4768[3] = 0.0F;
	aFloatArray4768[7] = 0.0F;
	aFloatArray4768[11] = 0.0F;
	aFloatArray4768[12] = 0.0F;
	aFloatArray4768[13] = 0.0F;
	aFloatArray4768[14] = 0.0F;
	aFloatArray4768[15] = 1.0F;
    }
    
    public boolean method5028() {
	return (aFloatArray4768[0] == 1.0F && aFloatArray4768[1] == 0.0F
		&& aFloatArray4768[2] == 0.0F && aFloatArray4768[3] == 0.0F
		&& aFloatArray4768[4] == 0.0F && aFloatArray4768[5] == 1.0F
		&& aFloatArray4768[6] == 0.0F && aFloatArray4768[7] == 0.0F
		&& aFloatArray4768[8] == 0.0F && aFloatArray4768[9] == 0.0F
		&& aFloatArray4768[10] == 1.0F && aFloatArray4768[11] == 0.0F
		&& aFloatArray4768[12] == 0.0F && aFloatArray4768[13] == 0.0F
		&& aFloatArray4768[14] == 0.0F && aFloatArray4768[15] == 1.0F);
    }
    
    public String method5029() {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i = 0; i < 4; i++) {
	    for (int i_205_ = 0; i_205_ < 4; i_205_++) {
		if (i_205_ > 0)
		    stringbuilder.append("\t");
		stringbuilder.append(aFloatArray4768[i * 4 + i_205_]);
	    }
	    stringbuilder.append("\n");
	}
	return stringbuilder.toString();
    }
    
    public void method5030(float f, float f_206_, float f_207_, float[] fs) {
	fs[0] = (aFloatArray4768[0] * f + aFloatArray4768[4] * f_206_
		 + aFloatArray4768[8] * f_207_ + aFloatArray4768[12]);
	fs[1] = (aFloatArray4768[1] * f + aFloatArray4768[5] * f_206_
		 + aFloatArray4768[9] * f_207_ + aFloatArray4768[13]);
	fs[2] = (aFloatArray4768[2] * f + aFloatArray4768[6] * f_206_
		 + aFloatArray4768[10] * f_207_ + aFloatArray4768[14]);
	if (fs.length > 3)
	    fs[3] = (aFloatArray4768[3] * f + aFloatArray4768[7] * f_206_
		     + aFloatArray4768[11] * f_207_ + aFloatArray4768[15]);
    }
    
    public float[] method5031(float[] fs) {
	fs[0] = aFloatArray4768[0];
	fs[1] = aFloatArray4768[1];
	fs[2] = 0.0F;
	fs[3] = 0.0F;
	fs[4] = aFloatArray4768[4];
	fs[5] = aFloatArray4768[5];
	fs[6] = 0.0F;
	fs[7] = 0.0F;
	fs[8] = aFloatArray4768[12];
	fs[9] = aFloatArray4768[13];
	fs[10] = aFloatArray4768[14];
	fs[11] = 0.0F;
	fs[12] = 0.0F;
	fs[13] = 0.0F;
	fs[14] = 0.0F;
	fs[15] = 1.0F;
	return fs;
    }
    
    public void method5032(float[] fs) {
	float f = fs[0];
	float f_208_ = fs[1];
	float f_209_ = fs[2];
	fs[0] = (aFloatArray4768[0] * f + aFloatArray4768[4] * f_208_
		 + aFloatArray4768[8] * f_209_ + aFloatArray4768[12]);
	fs[1] = (aFloatArray4768[1] * f + aFloatArray4768[5] * f_208_
		 + aFloatArray4768[9] * f_209_ + aFloatArray4768[13]);
	fs[2] = (aFloatArray4768[2] * f + aFloatArray4768[6] * f_208_
		 + aFloatArray4768[10] * f_209_ + aFloatArray4768[14]);
    }
    
    public void method5033() {
	float f = aFloatArray4768[0];
	float f_210_ = aFloatArray4768[4];
	float f_211_ = aFloatArray4768[8];
	float f_212_ = aFloatArray4768[12];
	float f_213_ = aFloatArray4768[1];
	float f_214_ = aFloatArray4768[5];
	float f_215_ = aFloatArray4768[9];
	float f_216_ = aFloatArray4768[13];
	float f_217_ = aFloatArray4768[2];
	float f_218_ = aFloatArray4768[6];
	float f_219_ = aFloatArray4768[10];
	float f_220_ = aFloatArray4768[14];
	float f_221_ = aFloatArray4768[3];
	float f_222_ = aFloatArray4768[7];
	float f_223_ = aFloatArray4768[11];
	float f_224_ = aFloatArray4768[15];
	aFloatArray4768[0] = f;
	aFloatArray4768[1] = f_210_;
	aFloatArray4768[2] = f_211_;
	aFloatArray4768[3] = f_212_;
	aFloatArray4768[4] = f_213_;
	aFloatArray4768[5] = f_214_;
	aFloatArray4768[6] = f_215_;
	aFloatArray4768[7] = f_216_;
	aFloatArray4768[8] = f_217_;
	aFloatArray4768[9] = f_218_;
	aFloatArray4768[10] = f_219_;
	aFloatArray4768[11] = f_220_;
	aFloatArray4768[12] = f_221_;
	aFloatArray4768[13] = f_222_;
	aFloatArray4768[14] = f_223_;
	aFloatArray4768[15] = f_224_;
    }
    
    public float[] method5034(float[] fs) {
	fs[0] = aFloatArray4768[0];
	fs[1] = aFloatArray4768[1];
	fs[2] = aFloatArray4768[4];
	fs[3] = aFloatArray4768[5];
	fs[4] = aFloatArray4768[8];
	fs[5] = aFloatArray4768[9];
	fs[6] = aFloatArray4768[12];
	fs[7] = aFloatArray4768[13];
	return fs;
    }
    
    public void method5035(Class433 class433) {
	aFloatArray4768[0] = ((Class433) class433).aFloat4832;
	aFloatArray4768[1] = ((Class433) class433).aFloat4833;
	aFloatArray4768[2] = ((Class433) class433).aFloat4834;
	aFloatArray4768[3] = 0.0F;
	aFloatArray4768[4] = ((Class433) class433).aFloat4835;
	aFloatArray4768[5] = ((Class433) class433).aFloat4836;
	aFloatArray4768[6] = ((Class433) class433).aFloat4843;
	aFloatArray4768[7] = 0.0F;
	aFloatArray4768[8] = ((Class433) class433).aFloat4841;
	aFloatArray4768[9] = ((Class433) class433).aFloat4839;
	aFloatArray4768[10] = ((Class433) class433).aFloat4840;
	aFloatArray4768[11] = 0.0F;
	aFloatArray4768[12] = ((Class433) class433).aFloat4837;
	aFloatArray4768[13] = ((Class433) class433).aFloat4842;
	aFloatArray4768[14] = ((Class433) class433).aFloat4831;
	aFloatArray4768[15] = 1.0F;
    }
    
    public String toString() {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i = 0; i < 4; i++) {
	    for (int i_225_ = 0; i_225_ < 4; i_225_++) {
		if (i_225_ > 0)
		    stringbuilder.append("\t");
		stringbuilder.append(aFloatArray4768[i * 4 + i_225_]);
	    }
	    stringbuilder.append("\n");
	}
	return stringbuilder.toString();
    }
}
