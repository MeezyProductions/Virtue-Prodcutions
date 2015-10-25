/* Class435 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class435
{
    float[] aFloatArray4845;
    float aFloat4846;
    Class422[] aClass422Array4847 = new Class422[4];
    
    Class435() {
	for (int i = 0; i < 4; i++)
	    ((Class435) this).aClass422Array4847[i] = new Class422();
	method5263();
    }
    
    void method5263() {
	((Class435) this).aFloat4846 = -1.0F;
	((Class435) this).aFloatArray4845 = null;
    }
    
    Class422 method5264(int i) {
	return ((Class435) this).aClass422Array4847[i];
    }
    
    float method5265() {
	if (((Class435) this).aFloat4846 == -1.0F)
	    method5268();
	return ((Class435) this).aFloat4846;
    }
    
    float method5266() {
	if (((Class435) this).aFloat4846 == -1.0F)
	    method5268();
	return ((Class435) this).aFloat4846;
    }
    
    float method5267(float f) {
	if (((Class435) this).aFloat4846 == -1.0F)
	    method5268();
	if (f <= 0.0F)
	    return 0.0F;
	if (f >= ((Class435) this).aFloat4846)
	    return 1.0F;
	float f_0_ = 0.0F;
	float f_1_ = ((Class435) this).aFloatArray4845[0];
	for (int i = 1; i < ((Class435) this).aFloatArray4845.length; i++) {
	    if (f < f_1_) {
		float f_2_ = (f - f_0_) / (f_1_ - f_0_);
		float f_3_
		    = ((float) (i - 1)
		       / (float) ((Class435) this).aFloatArray4845.length);
		float f_4_
		    = ((float) i
		       / (float) ((Class435) this).aFloatArray4845.length);
		return f_3_ + (f_4_ - f_3_) * f_2_;
	    }
	    f_0_ = f_1_;
	    f_1_ += ((Class435) this).aFloatArray4845[i];
	}
	float f_5_ = (f - f_0_) / (f_1_ - f_0_);
	float f_6_ = ((float) (((Class435) this).aFloatArray4845.length - 1)
		      / (float) ((Class435) this).aFloatArray4845.length);
	return f_6_ + (1.0F - f_6_) * f_5_;
    }
    
    void method5268() {
	int i = 20;
	double[] ds = method5269(0.0F);
	float f = 0.0F;
	Class422 class422 = Class422.method5100();
	for (int i_7_ = 1; i_7_ <= i; i_7_++) {
	    double[] ds_8_ = method5269((float) i_7_ / (float) i);
	    class422.aFloat4780 = (float) (ds_8_[0] - ds[0]);
	    class422.aFloat4776 = (float) (ds_8_[1] - ds[1]);
	    class422.aFloat4777 = (float) (ds_8_[2] - ds[2]);
	    f += class422.method5069();
	    ds = ds_8_;
	}
	int i_9_ = (int) (f / 20.0F);
	if (i_9_ < i)
	    i_9_ = i;
	((Class435) this).aFloatArray4845 = new float[i_9_];
	ds = method5269(0.0F);
	float f_10_ = 0.0F;
	for (int i_11_ = 1; i_11_ <= i_9_; i_11_++) {
	    double[] ds_12_ = method5269((float) i_11_ / (float) i_9_);
	    class422.aFloat4780 = (float) (ds_12_[0] - ds[0]);
	    class422.aFloat4776 = (float) (ds_12_[1] - ds[1]);
	    class422.aFloat4777 = (float) (ds_12_[2] - ds[2]);
	    float f_13_ = class422.method5069();
	    f_10_ += f_13_;
	    ((Class435) this).aFloatArray4845[i_11_ - 1] = f_13_;
	    ds = ds_12_;
	}
	((Class435) this).aFloat4846 = f_10_;
    }
    
    double[] method5269(float f) {
	double[] ds = new double[3];
	float f_14_ = f * f;
	float f_15_ = f_14_ * f;
	double d
	    = (double) (3.0F
			* (((Class435) this).aClass422Array4847[1].aFloat4780
			   - (((Class435) this).aClass422Array4847[0]
			      .aFloat4780)));
	double d_16_
	    = ((double) (3.0F
			 * (((Class435) this).aClass422Array4847[2].aFloat4780
			    - (((Class435) this).aClass422Array4847[1]
			       .aFloat4780)))
	       - d);
	double d_17_
	    = ((double) (((Class435) this).aClass422Array4847[3].aFloat4780
			 - ((Class435) this).aClass422Array4847[0].aFloat4780)
	       - d - d_16_);
	ds[0]
	    = (d_17_ * (double) f_15_ + d_16_ * (double) f_14_ + d * (double) f
	       + (double) ((Class435) this).aClass422Array4847[0].aFloat4780);
	d = (double) (3.0F
		      * (((Class435) this).aClass422Array4847[1].aFloat4776
			 - (((Class435) this).aClass422Array4847[0]
			    .aFloat4776)));
	d_16_ = (double) (3.0F
			  * (((Class435) this).aClass422Array4847[2].aFloat4776
			     - (((Class435) this).aClass422Array4847[1]
				.aFloat4776))) - d;
	d_17_
	    = ((double) (((Class435) this).aClass422Array4847[3].aFloat4776
			 - ((Class435) this).aClass422Array4847[0].aFloat4776)
	       - d - d_16_);
	ds[1]
	    = (d_17_ * (double) f_15_ + d_16_ * (double) f_14_ + d * (double) f
	       + (double) ((Class435) this).aClass422Array4847[0].aFloat4776);
	d = (double) (3.0F
		      * (((Class435) this).aClass422Array4847[1].aFloat4777
			 - (((Class435) this).aClass422Array4847[0]
			    .aFloat4777)));
	d_16_ = (double) (3.0F
			  * (((Class435) this).aClass422Array4847[2].aFloat4777
			     - (((Class435) this).aClass422Array4847[1]
				.aFloat4777))) - d;
	d_17_
	    = ((double) (((Class435) this).aClass422Array4847[3].aFloat4777
			 - ((Class435) this).aClass422Array4847[0].aFloat4777)
	       - d - d_16_);
	ds[2]
	    = (d_17_ * (double) f_15_ + d_16_ * (double) f_14_ + d * (double) f
	       + (double) ((Class435) this).aClass422Array4847[0].aFloat4777);
	return ds;
    }
    
    void method5270() {
	((Class435) this).aFloat4846 = -1.0F;
	((Class435) this).aFloatArray4845 = null;
    }
    
    void method5271() {
	int i = 20;
	double[] ds = method5269(0.0F);
	float f = 0.0F;
	Class422 class422 = Class422.method5100();
	for (int i_18_ = 1; i_18_ <= i; i_18_++) {
	    double[] ds_19_ = method5269((float) i_18_ / (float) i);
	    class422.aFloat4780 = (float) (ds_19_[0] - ds[0]);
	    class422.aFloat4776 = (float) (ds_19_[1] - ds[1]);
	    class422.aFloat4777 = (float) (ds_19_[2] - ds[2]);
	    f += class422.method5069();
	    ds = ds_19_;
	}
	int i_20_ = (int) (f / 20.0F);
	if (i_20_ < i)
	    i_20_ = i;
	((Class435) this).aFloatArray4845 = new float[i_20_];
	ds = method5269(0.0F);
	float f_21_ = 0.0F;
	for (int i_22_ = 1; i_22_ <= i_20_; i_22_++) {
	    double[] ds_23_ = method5269((float) i_22_ / (float) i_20_);
	    class422.aFloat4780 = (float) (ds_23_[0] - ds[0]);
	    class422.aFloat4776 = (float) (ds_23_[1] - ds[1]);
	    class422.aFloat4777 = (float) (ds_23_[2] - ds[2]);
	    float f_24_ = class422.method5069();
	    f_21_ += f_24_;
	    ((Class435) this).aFloatArray4845[i_22_ - 1] = f_24_;
	    ds = ds_23_;
	}
	((Class435) this).aFloat4846 = f_21_;
    }
    
    float method5272(float f) {
	if (((Class435) this).aFloat4846 == -1.0F)
	    method5268();
	if (f <= 0.0F)
	    return 0.0F;
	if (f >= ((Class435) this).aFloat4846)
	    return 1.0F;
	float f_25_ = 0.0F;
	float f_26_ = ((Class435) this).aFloatArray4845[0];
	for (int i = 1; i < ((Class435) this).aFloatArray4845.length; i++) {
	    if (f < f_26_) {
		float f_27_ = (f - f_25_) / (f_26_ - f_25_);
		float f_28_
		    = ((float) (i - 1)
		       / (float) ((Class435) this).aFloatArray4845.length);
		float f_29_
		    = ((float) i
		       / (float) ((Class435) this).aFloatArray4845.length);
		return f_28_ + (f_29_ - f_28_) * f_27_;
	    }
	    f_25_ = f_26_;
	    f_26_ += ((Class435) this).aFloatArray4845[i];
	}
	float f_30_ = (f - f_25_) / (f_26_ - f_25_);
	float f_31_ = ((float) (((Class435) this).aFloatArray4845.length - 1)
		       / (float) ((Class435) this).aFloatArray4845.length);
	return f_31_ + (1.0F - f_31_) * f_30_;
    }
    
    void method5273(int i, Class422 class422) {
	((Class435) this).aClass422Array4847[i].method5058(class422);
	method5263();
    }
    
    float method5274() {
	if (((Class435) this).aFloat4846 == -1.0F)
	    method5268();
	return ((Class435) this).aFloat4846;
    }
    
    void method5275() {
	((Class435) this).aFloat4846 = -1.0F;
	((Class435) this).aFloatArray4845 = null;
    }
    
    float method5276(float f) {
	if (((Class435) this).aFloat4846 == -1.0F)
	    method5268();
	if (f <= 0.0F)
	    return 0.0F;
	if (f >= ((Class435) this).aFloat4846)
	    return 1.0F;
	float f_32_ = 0.0F;
	float f_33_ = ((Class435) this).aFloatArray4845[0];
	for (int i = 1; i < ((Class435) this).aFloatArray4845.length; i++) {
	    if (f < f_33_) {
		float f_34_ = (f - f_32_) / (f_33_ - f_32_);
		float f_35_
		    = ((float) (i - 1)
		       / (float) ((Class435) this).aFloatArray4845.length);
		float f_36_
		    = ((float) i
		       / (float) ((Class435) this).aFloatArray4845.length);
		return f_35_ + (f_36_ - f_35_) * f_34_;
	    }
	    f_32_ = f_33_;
	    f_33_ += ((Class435) this).aFloatArray4845[i];
	}
	float f_37_ = (f - f_32_) / (f_33_ - f_32_);
	float f_38_ = ((float) (((Class435) this).aFloatArray4845.length - 1)
		       / (float) ((Class435) this).aFloatArray4845.length);
	return f_38_ + (1.0F - f_38_) * f_37_;
    }
    
    void method5277() {
	int i = 20;
	double[] ds = method5269(0.0F);
	float f = 0.0F;
	Class422 class422 = Class422.method5100();
	for (int i_39_ = 1; i_39_ <= i; i_39_++) {
	    double[] ds_40_ = method5269((float) i_39_ / (float) i);
	    class422.aFloat4780 = (float) (ds_40_[0] - ds[0]);
	    class422.aFloat4776 = (float) (ds_40_[1] - ds[1]);
	    class422.aFloat4777 = (float) (ds_40_[2] - ds[2]);
	    f += class422.method5069();
	    ds = ds_40_;
	}
	int i_41_ = (int) (f / 20.0F);
	if (i_41_ < i)
	    i_41_ = i;
	((Class435) this).aFloatArray4845 = new float[i_41_];
	ds = method5269(0.0F);
	float f_42_ = 0.0F;
	for (int i_43_ = 1; i_43_ <= i_41_; i_43_++) {
	    double[] ds_44_ = method5269((float) i_43_ / (float) i_41_);
	    class422.aFloat4780 = (float) (ds_44_[0] - ds[0]);
	    class422.aFloat4776 = (float) (ds_44_[1] - ds[1]);
	    class422.aFloat4777 = (float) (ds_44_[2] - ds[2]);
	    float f_45_ = class422.method5069();
	    f_42_ += f_45_;
	    ((Class435) this).aFloatArray4845[i_43_ - 1] = f_45_;
	    ds = ds_44_;
	}
	((Class435) this).aFloat4846 = f_42_;
    }
    
    void method5278() {
	((Class435) this).aFloat4846 = -1.0F;
	((Class435) this).aFloatArray4845 = null;
    }
    
    void method5279() {
	int i = 20;
	double[] ds = method5269(0.0F);
	float f = 0.0F;
	Class422 class422 = Class422.method5100();
	for (int i_46_ = 1; i_46_ <= i; i_46_++) {
	    double[] ds_47_ = method5269((float) i_46_ / (float) i);
	    class422.aFloat4780 = (float) (ds_47_[0] - ds[0]);
	    class422.aFloat4776 = (float) (ds_47_[1] - ds[1]);
	    class422.aFloat4777 = (float) (ds_47_[2] - ds[2]);
	    f += class422.method5069();
	    ds = ds_47_;
	}
	int i_48_ = (int) (f / 20.0F);
	if (i_48_ < i)
	    i_48_ = i;
	((Class435) this).aFloatArray4845 = new float[i_48_];
	ds = method5269(0.0F);
	float f_49_ = 0.0F;
	for (int i_50_ = 1; i_50_ <= i_48_; i_50_++) {
	    double[] ds_51_ = method5269((float) i_50_ / (float) i_48_);
	    class422.aFloat4780 = (float) (ds_51_[0] - ds[0]);
	    class422.aFloat4776 = (float) (ds_51_[1] - ds[1]);
	    class422.aFloat4777 = (float) (ds_51_[2] - ds[2]);
	    float f_52_ = class422.method5069();
	    f_49_ += f_52_;
	    ((Class435) this).aFloatArray4845[i_50_ - 1] = f_52_;
	    ds = ds_51_;
	}
	((Class435) this).aFloat4846 = f_49_;
    }
    
    void method5280() {
	int i = 20;
	double[] ds = method5269(0.0F);
	float f = 0.0F;
	Class422 class422 = Class422.method5100();
	for (int i_53_ = 1; i_53_ <= i; i_53_++) {
	    double[] ds_54_ = method5269((float) i_53_ / (float) i);
	    class422.aFloat4780 = (float) (ds_54_[0] - ds[0]);
	    class422.aFloat4776 = (float) (ds_54_[1] - ds[1]);
	    class422.aFloat4777 = (float) (ds_54_[2] - ds[2]);
	    f += class422.method5069();
	    ds = ds_54_;
	}
	int i_55_ = (int) (f / 20.0F);
	if (i_55_ < i)
	    i_55_ = i;
	((Class435) this).aFloatArray4845 = new float[i_55_];
	ds = method5269(0.0F);
	float f_56_ = 0.0F;
	for (int i_57_ = 1; i_57_ <= i_55_; i_57_++) {
	    double[] ds_58_ = method5269((float) i_57_ / (float) i_55_);
	    class422.aFloat4780 = (float) (ds_58_[0] - ds[0]);
	    class422.aFloat4776 = (float) (ds_58_[1] - ds[1]);
	    class422.aFloat4777 = (float) (ds_58_[2] - ds[2]);
	    float f_59_ = class422.method5069();
	    f_56_ += f_59_;
	    ((Class435) this).aFloatArray4845[i_57_ - 1] = f_59_;
	    ds = ds_58_;
	}
	((Class435) this).aFloat4846 = f_56_;
    }
}
