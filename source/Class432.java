/* Class432 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class432
{
    float[] aFloatArray4829;
    Class435[] aClass435Array4830 = new Class435[1];
    
    public Class432(ByteBuffer class528_sub42) {
	((Class432) this).aFloatArray4829 = new float[2];
	int i = class528_sub42.method9719(65280);
	((Class432) this).aClass435Array4830[0] = new Class435();
	((Class432) this).aClass435Array4830[0]
	    .method5273(0, Class422.method5053(class528_sub42));
	((Class432) this).aClass435Array4830[0]
	    .method5273(1, Class422.method5053(class528_sub42));
	((Class432) this).aFloatArray4829[0]
	    = class528_sub42.method9635(-1834791172);
	Class422 class422 = Class422.method5053(class528_sub42);
	Class422 class422_0_ = Class422.method5053(class528_sub42);
	Class422 class422_1_ = Class422.method5065(class422, class422_0_);
	class422_0_.method5054();
	class422_0_ = class422_1_;
	class422_0_.method5063(class422);
	((Class432) this).aClass435Array4830[0].method5273(3, class422);
	((Class432) this).aClass435Array4830[0].method5273(2, class422_0_);
	((Class432) this).aFloatArray4829[1]
	    = class528_sub42.method9635(-1939520799);
	for (int i_2_ = 2; i_2_ < i; i_2_++) {
	    Class422 class422_3_ = Class422.method5053(class528_sub42);
	    Class422 class422_4_ = Class422.method5053(class528_sub42);
	    Class422 class422_5_
		= Class422.method5065(class422_3_, class422_4_);
	    class422_4_.method5054();
	    class422_4_ = class422_5_;
	    class422_4_.method5063(class422_3_);
	    method5203(class422_3_, class422_4_,
		       class528_sub42.method9635(-2117135387));
	}
    }
    
    void method5203(Class422 class422, Class422 class422_6_, float f) {
	Class435[] class435s
	    = new Class435[((Class432) this).aClass435Array4830.length + 1];
	System.arraycopy(((Class432) this).aClass435Array4830, 0, class435s, 0,
			 ((Class432) this).aClass435Array4830.length);
	Class435 class435 = new Class435();
	Class435 class435_7_
	    = (((Class432) this).aClass435Array4830
	       [((Class432) this).aClass435Array4830.length - 1]);
	class435.method5273(0, class435_7_.method5264(3));
	Class422 class422_8_ = Class422.method5065(class435_7_.method5264(3),
						   class435_7_.method5264(2));
	class435.method5273(1, Class422.method5094(class435_7_.method5264(3),
						   class422_8_));
	class435.method5273(3, class422);
	class435.method5273(2, class422_6_);
	class435s[class435s.length - 1] = class435;
	((Class432) this).aClass435Array4830 = class435s;
	float[] fs = new float[((Class432) this).aFloatArray4829.length + 1];
	System.arraycopy(((Class432) this).aFloatArray4829, 0, fs, 0,
			 ((Class432) this).aFloatArray4829.length);
	fs[fs.length - 1] = f;
	((Class432) this).aFloatArray4829 = fs;
    }
    
    public double[] method5204(float f) {
	float f_9_ = 0.0F;
	float f_10_ = 0.0F;
	for (int i = 0; i < ((Class432) this).aClass435Array4830.length; i++) {
	    f_10_ += ((Class432) this).aClass435Array4830[i].method5266();
	    if (f < f_10_) {
		float f_11_ = ((Class432) this).aClass435Array4830[i]
				  .method5267(f - f_9_);
		return ((Class432) this).aClass435Array4830[i]
			   .method5269(f_11_);
	    }
	    f_9_ = f_10_;
	}
	return ((Class432) this).aClass435Array4830
		   [((Class432) this).aClass435Array4830.length - 1]
		   .method5269(1.0F);
    }
    
    public float method5205(float f) {
	float f_12_ = 0.0F;
	float f_13_ = 0.0F;
	for (int i = 0; i < ((Class432) this).aClass435Array4830.length; i++) {
	    f_13_ += ((Class432) this).aClass435Array4830[i].method5266();
	    if (f < f_13_)
		return (((Class432) this).aClass435Array4830[i]
			    .method5267(f - f_12_)
			+ (float) i);
	    f_12_ = f_13_;
	}
	return (float) ((Class432) this).aClass435Array4830.length;
    }
    
    public double[] method5206(float f) {
	int i = (int) f;
	if (i < ((Class432) this).aClass435Array4830.length)
	    return ((Class432) this).aClass435Array4830[i]
		       .method5269(f - (float) i);
	return ((Class432) this).aClass435Array4830
		   [((Class432) this).aClass435Array4830.length - 1]
		   .method5269(1.0F);
    }
    
    public float method5207(float f) {
	int i = (int) f;
	if (i + 1 < ((Class432) this).aFloatArray4829.length) {
	    float f_14_ = ((Class432) this).aFloatArray4829[i];
	    float f_15_ = ((Class432) this).aFloatArray4829[i + 1];
	    float f_16_ = f - (float) i;
	    return (1.0F - f_16_) * f_14_ + f_16_ * f_15_;
	}
	return (((Class432) this).aFloatArray4829
		[((Class432) this).aFloatArray4829.length - 1]);
    }
    
    public int method5208() {
	return ((Class432) this).aClass435Array4830.length;
    }
    
    public int method5209() {
	return ((Class432) this).aClass435Array4830.length;
    }
    
    public float method5210() {
	float f = 0.0F;
	for (int i = 0; i < ((Class432) this).aClass435Array4830.length; i++)
	    f += ((Class432) this).aClass435Array4830[i].method5266();
	return f;
    }
    
    public float method5211() {
	float f = 0.0F;
	for (int i = 0; i < ((Class432) this).aClass435Array4830.length; i++)
	    f += ((Class432) this).aClass435Array4830[i].method5266();
	return f;
    }
    
    public float method5212(float f) {
	float f_17_ = 0.0F;
	float f_18_ = 0.0F;
	for (int i = 0; i < ((Class432) this).aClass435Array4830.length; i++) {
	    f_18_ += ((Class432) this).aClass435Array4830[i].method5266();
	    if (f < f_18_)
		return (((Class432) this).aClass435Array4830[i]
			    .method5267(f - f_17_)
			+ (float) i);
	    f_17_ = f_18_;
	}
	return (float) ((Class432) this).aClass435Array4830.length;
    }
    
    public float method5213(float f) {
	return method5207(method5205(f));
    }
    
    public float method5214(float f) {
	return method5207(method5205(f));
    }
    
    public float method5215(float f) {
	float f_19_ = 0.0F;
	float f_20_ = 0.0F;
	for (int i = 0; i < ((Class432) this).aClass435Array4830.length; i++) {
	    f_20_ += ((Class432) this).aClass435Array4830[i].method5266();
	    if (f < f_20_)
		return (((Class432) this).aClass435Array4830[i]
			    .method5267(f - f_19_)
			+ (float) i);
	    f_19_ = f_20_;
	}
	return (float) ((Class432) this).aClass435Array4830.length;
    }
    
    public float method5216(float f) {
	int i = (int) f;
	if (i + 1 < ((Class432) this).aFloatArray4829.length) {
	    float f_21_ = ((Class432) this).aFloatArray4829[i];
	    float f_22_ = ((Class432) this).aFloatArray4829[i + 1];
	    float f_23_ = f - (float) i;
	    return (1.0F - f_23_) * f_21_ + f_23_ * f_22_;
	}
	return (((Class432) this).aFloatArray4829
		[((Class432) this).aFloatArray4829.length - 1]);
    }
}
