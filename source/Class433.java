/* Class433 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class433
{
    float aFloat4831;
    float aFloat4832;
    float aFloat4833;
    float aFloat4834;
    float aFloat4835;
    float aFloat4836;
    float aFloat4837;
    public static Class433 aClass433_4838 = new Class433();
    float aFloat4839;
    float aFloat4840;
    float aFloat4841;
    float aFloat4842;
    float aFloat4843;
    
    public void method5217(Class433 class433_0_) {
	((Class433) this).aFloat4832 = ((Class433) class433_0_).aFloat4832;
	((Class433) this).aFloat4835 = ((Class433) class433_0_).aFloat4835;
	((Class433) this).aFloat4841 = ((Class433) class433_0_).aFloat4841;
	((Class433) this).aFloat4837 = ((Class433) class433_0_).aFloat4837;
	((Class433) this).aFloat4833 = ((Class433) class433_0_).aFloat4833;
	((Class433) this).aFloat4836 = ((Class433) class433_0_).aFloat4836;
	((Class433) this).aFloat4839 = ((Class433) class433_0_).aFloat4839;
	((Class433) this).aFloat4842 = ((Class433) class433_0_).aFloat4842;
	((Class433) this).aFloat4834 = ((Class433) class433_0_).aFloat4834;
	((Class433) this).aFloat4843 = ((Class433) class433_0_).aFloat4843;
	((Class433) this).aFloat4840 = ((Class433) class433_0_).aFloat4840;
	((Class433) this).aFloat4831 = ((Class433) class433_0_).aFloat4831;
    }
    
    public void method5218(Class437 class437) {
	method5246(class437.aClass430_4869);
	method5229(class437.aClass422_4868);
    }
    
    public void method5219() {
	((Class433) this).aFloat4831 = 0.0F;
	((Class433) this).aFloat4842 = 0.0F;
	((Class433) this).aFloat4837 = 0.0F;
	((Class433) this).aFloat4839 = 0.0F;
	((Class433) this).aFloat4841 = 0.0F;
	((Class433) this).aFloat4843 = 0.0F;
	((Class433) this).aFloat4835 = 0.0F;
	((Class433) this).aFloat4834 = 0.0F;
	((Class433) this).aFloat4833 = 0.0F;
	((Class433) this).aFloat4840 = 1.0F;
	((Class433) this).aFloat4836 = 1.0F;
	((Class433) this).aFloat4832 = 1.0F;
    }
    
    public void method5220(double d, double d_1_, double d_2_, double d_3_,
			   double d_4_, double d_5_, float f, float f_6_,
			   float f_7_) {
	float f_8_ = (float) (d_3_ - d);
	float f_9_ = (float) (d_4_ - d_1_);
	float f_10_ = (float) (d_5_ - d_2_);
	float f_11_ = f_6_ * f_10_ - f_7_ * f_9_;
	float f_12_ = f_7_ * f_8_ - f * f_10_;
	float f_13_ = f * f_9_ - f_6_ * f_8_;
	float f_14_
	    = (float) (1.0 / Math.sqrt((double) (f_11_ * f_11_ + f_12_ * f_12_
						 + f_13_ * f_13_)));
	float f_15_
	    = (float) (1.0 / Math.sqrt((double) (f_8_ * f_8_ + f_9_ * f_9_
						 + f_10_ * f_10_)));
	((Class433) this).aFloat4832 = f_11_ * f_14_;
	((Class433) this).aFloat4835 = f_12_ * f_14_;
	((Class433) this).aFloat4841 = f_13_ * f_14_;
	((Class433) this).aFloat4834 = f_8_ * f_15_;
	((Class433) this).aFloat4843 = f_9_ * f_15_;
	((Class433) this).aFloat4840 = f_10_ * f_15_;
	((Class433) this).aFloat4833
	    = (((Class433) this).aFloat4843 * ((Class433) this).aFloat4841
	       - ((Class433) this).aFloat4840 * ((Class433) this).aFloat4835);
	((Class433) this).aFloat4836
	    = (((Class433) this).aFloat4840 * ((Class433) this).aFloat4832
	       - ((Class433) this).aFloat4834 * ((Class433) this).aFloat4841);
	((Class433) this).aFloat4839
	    = (((Class433) this).aFloat4834 * ((Class433) this).aFloat4835
	       - ((Class433) this).aFloat4843 * ((Class433) this).aFloat4832);
	((Class433) this).aFloat4837
	    = -(float) (d * (double) ((Class433) this).aFloat4832
			+ d_1_ * (double) ((Class433) this).aFloat4835
			+ d_2_ * (double) ((Class433) this).aFloat4841);
	((Class433) this).aFloat4842
	    = -(float) (d * (double) ((Class433) this).aFloat4833
			+ d_1_ * (double) ((Class433) this).aFloat4836
			+ d_2_ * (double) ((Class433) this).aFloat4839);
	((Class433) this).aFloat4831
	    = -(float) (d * (double) ((Class433) this).aFloat4834
			+ d_1_ * (double) ((Class433) this).aFloat4843
			+ d_2_ * (double) ((Class433) this).aFloat4840);
    }
    
    public void method5221(int i, int i_16_, int i_17_, float f, float f_18_,
			   float f_19_) {
	if (i != 0) {
	    float f_20_ = Class419.aFloatArray4771[i & 0x3fff];
	    float f_21_ = Class419.aFloatArray4770[i & 0x3fff];
	    ((Class433) this).aFloat4840 = 1.0F;
	    ((Class433) this).aFloat4839 = 0.0F;
	    ((Class433) this).aFloat4841 = 0.0F;
	    ((Class433) this).aFloat4843 = 0.0F;
	    ((Class433) this).aFloat4834 = 0.0F;
	    ((Class433) this).aFloat4832 = 2.0F * f_20_ * (float) i_16_;
	    ((Class433) this).aFloat4836 = 2.0F * f_20_ * (float) i_17_;
	    ((Class433) this).aFloat4833 = 2.0F * f_21_ * (float) i_16_;
	    ((Class433) this).aFloat4835 = -2.0F * f_21_ * (float) i_17_;
	    ((Class433) this).aFloat4837
		= (float) (2 * i_16_) * (0.5F * f_21_ - 0.5F * f_20_) + f;
	    ((Class433) this).aFloat4842
		= (float) (2 * i_17_) * (-0.5F * f_21_ - 0.5F * f_20_) + f_18_;
	    ((Class433) this).aFloat4831 = f_19_;
	} else {
	    ((Class433) this).aFloat4839 = 0.0F;
	    ((Class433) this).aFloat4841 = 0.0F;
	    ((Class433) this).aFloat4843 = 0.0F;
	    ((Class433) this).aFloat4835 = 0.0F;
	    ((Class433) this).aFloat4834 = 0.0F;
	    ((Class433) this).aFloat4833 = 0.0F;
	    ((Class433) this).aFloat4832 = (float) (2 * i_16_);
	    ((Class433) this).aFloat4836 = (float) (2 * i_17_);
	    ((Class433) this).aFloat4840 = 1.0F;
	    ((Class433) this).aFloat4837 = f - (float) i_16_;
	    ((Class433) this).aFloat4842 = f_18_ - (float) i_17_;
	    ((Class433) this).aFloat4831 = f_19_;
	}
    }
    
    public void method5222(float f, float f_22_, float f_23_, float f_24_,
			   float f_25_, float f_26_, float f_27_, float f_28_,
			   float f_29_) {
	((Class433) this).aFloat4832 = f;
	((Class433) this).aFloat4835 = f_24_;
	((Class433) this).aFloat4841 = f_27_;
	((Class433) this).aFloat4837 = 0.0F;
	((Class433) this).aFloat4833 = f_22_;
	((Class433) this).aFloat4836 = f_25_;
	((Class433) this).aFloat4839 = f_28_;
	((Class433) this).aFloat4842 = 0.0F;
	((Class433) this).aFloat4834 = f_23_;
	((Class433) this).aFloat4843 = f_26_;
	((Class433) this).aFloat4840 = f_29_;
	((Class433) this).aFloat4831 = 0.0F;
    }
    
    public void method5223() {
	float f = ((Class433) this).aFloat4837;
	float f_30_ = ((Class433) this).aFloat4842;
	float f_31_ = ((Class433) this).aFloat4835;
	((Class433) this).aFloat4835 = ((Class433) this).aFloat4833;
	((Class433) this).aFloat4833 = f_31_;
	float f_32_ = ((Class433) this).aFloat4841;
	((Class433) this).aFloat4841 = ((Class433) this).aFloat4834;
	((Class433) this).aFloat4834 = f_32_;
	float f_33_ = ((Class433) this).aFloat4839;
	((Class433) this).aFloat4839 = ((Class433) this).aFloat4843;
	((Class433) this).aFloat4843 = f_33_;
	((Class433) this).aFloat4837
	    = -(f * ((Class433) this).aFloat4832
		+ f_30_ * ((Class433) this).aFloat4835
		+ ((Class433) this).aFloat4831 * ((Class433) this).aFloat4841);
	((Class433) this).aFloat4842
	    = -(f * ((Class433) this).aFloat4833
		+ f_30_ * ((Class433) this).aFloat4836
		+ ((Class433) this).aFloat4831 * ((Class433) this).aFloat4839);
	((Class433) this).aFloat4831
	    = -(f * ((Class433) this).aFloat4834
		+ f_30_ * ((Class433) this).aFloat4843
		+ ((Class433) this).aFloat4831 * ((Class433) this).aFloat4840);
    }
    
    public void method5224(float f, float f_34_, float f_35_, float f_36_) {
	float f_37_ = (float) Math.cos((double) f_36_);
	float f_38_ = (float) Math.sin((double) f_36_);
	((Class433) this).aFloat4832 = f_37_ + f * f * (1.0F - f_37_);
	((Class433) this).aFloat4833
	    = f_35_ * f_38_ + f_34_ * f * (1.0F - f_37_);
	((Class433) this).aFloat4834
	    = -f_34_ * f_38_ + f_35_ * f * (1.0F - f_37_);
	((Class433) this).aFloat4835
	    = -f_35_ * f_38_ + f * f_34_ * (1.0F - f_37_);
	((Class433) this).aFloat4836 = f_37_ + f_34_ * f_34_ * (1.0F - f_37_);
	((Class433) this).aFloat4843
	    = f * f_38_ + f_35_ * f_34_ * (1.0F - f_37_);
	((Class433) this).aFloat4841
	    = f_34_ * f_38_ + f * f_35_ * (1.0F - f_37_);
	((Class433) this).aFloat4839
	    = -f * f_38_ + f_34_ * f_35_ * (1.0F - f_37_);
	((Class433) this).aFloat4840 = f_37_ + f_35_ * f_35_ * (1.0F - f_37_);
	((Class433) this).aFloat4831 = 0.0F;
	((Class433) this).aFloat4842 = 0.0F;
	((Class433) this).aFloat4837 = 0.0F;
    }
    
    void method5225(float f, float f_39_, float f_40_, float f_41_) {
	float f_42_ = f * f;
	float f_43_ = f * f_39_;
	float f_44_ = f * f_40_;
	float f_45_ = f * f_41_;
	float f_46_ = f_39_ * f_39_;
	float f_47_ = f_39_ * f_40_;
	float f_48_ = f_39_ * f_41_;
	float f_49_ = f_40_ * f_40_;
	float f_50_ = f_40_ * f_41_;
	((Class433) this).aFloat4832 = 1.0F - 2.0F * (f_46_ + f_49_);
	((Class433) this).aFloat4835 = 2.0F * (f_43_ - f_50_);
	((Class433) this).aFloat4841 = 2.0F * (f_44_ + f_48_);
	((Class433) this).aFloat4833 = 2.0F * (f_43_ + f_50_);
	((Class433) this).aFloat4836 = 1.0F - 2.0F * (f_42_ + f_49_);
	((Class433) this).aFloat4839 = 2.0F * (f_47_ - f_45_);
	((Class433) this).aFloat4834 = 2.0F * (f_44_ - f_48_);
	((Class433) this).aFloat4843 = 2.0F * (f_47_ + f_45_);
	((Class433) this).aFloat4840 = 1.0F - 2.0F * (f_42_ + f_46_);
	((Class433) this).aFloat4831 = 0.0F;
	((Class433) this).aFloat4842 = 0.0F;
	((Class433) this).aFloat4837 = 0.0F;
    }
    
    public void method5226() {
	float f = ((Class433) this).aFloat4837;
	float f_51_ = ((Class433) this).aFloat4842;
	float f_52_ = ((Class433) this).aFloat4835;
	((Class433) this).aFloat4835 = ((Class433) this).aFloat4833;
	((Class433) this).aFloat4833 = f_52_;
	float f_53_ = ((Class433) this).aFloat4841;
	((Class433) this).aFloat4841 = ((Class433) this).aFloat4834;
	((Class433) this).aFloat4834 = f_53_;
	float f_54_ = ((Class433) this).aFloat4839;
	((Class433) this).aFloat4839 = ((Class433) this).aFloat4843;
	((Class433) this).aFloat4843 = f_54_;
	((Class433) this).aFloat4837
	    = -(f * ((Class433) this).aFloat4832
		+ f_51_ * ((Class433) this).aFloat4835
		+ ((Class433) this).aFloat4831 * ((Class433) this).aFloat4841);
	((Class433) this).aFloat4842
	    = -(f * ((Class433) this).aFloat4833
		+ f_51_ * ((Class433) this).aFloat4836
		+ ((Class433) this).aFloat4831 * ((Class433) this).aFloat4839);
	((Class433) this).aFloat4831
	    = -(f * ((Class433) this).aFloat4834
		+ f_51_ * ((Class433) this).aFloat4843
		+ ((Class433) this).aFloat4831 * ((Class433) this).aFloat4840);
    }
    
    public void method5227(float f, float f_55_, float f_56_) {
	((Class433) this).aFloat4832 = f;
	((Class433) this).aFloat4835 = 0.0F;
	((Class433) this).aFloat4841 = 0.0F;
	((Class433) this).aFloat4837 = 0.0F;
	((Class433) this).aFloat4833 = 0.0F;
	((Class433) this).aFloat4836 = f_55_;
	((Class433) this).aFloat4839 = 0.0F;
	((Class433) this).aFloat4842 = 0.0F;
	((Class433) this).aFloat4834 = 0.0F;
	((Class433) this).aFloat4843 = 0.0F;
	((Class433) this).aFloat4840 = f_56_;
	((Class433) this).aFloat4831 = 0.0F;
    }
    
    public void method5228(float f, float f_57_, float f_58_) {
	((Class433) this).aFloat4839 = 0.0F;
	((Class433) this).aFloat4841 = 0.0F;
	((Class433) this).aFloat4843 = 0.0F;
	((Class433) this).aFloat4835 = 0.0F;
	((Class433) this).aFloat4834 = 0.0F;
	((Class433) this).aFloat4833 = 0.0F;
	((Class433) this).aFloat4840 = 1.0F;
	((Class433) this).aFloat4836 = 1.0F;
	((Class433) this).aFloat4832 = 1.0F;
	((Class433) this).aFloat4837 = f;
	((Class433) this).aFloat4842 = f_57_;
	((Class433) this).aFloat4831 = f_58_;
    }
    
    public void method5229(Class422 class422) {
	method5252(class422.aFloat4780, class422.aFloat4776,
		   class422.aFloat4777);
    }
    
    public void method5230(float[] fs) {
	float f = fs[0] - ((Class433) this).aFloat4837;
	float f_59_ = fs[1] - ((Class433) this).aFloat4842;
	float f_60_ = fs[2] - ((Class433) this).aFloat4831;
	fs[0] = (float) (int) (((Class433) this).aFloat4832 * f
			       + ((Class433) this).aFloat4833 * f_59_
			       + ((Class433) this).aFloat4834 * f_60_);
	fs[1] = (float) (int) (((Class433) this).aFloat4835 * f
			       + ((Class433) this).aFloat4836 * f_59_
			       + ((Class433) this).aFloat4843 * f_60_);
	fs[2] = (float) (int) (((Class433) this).aFloat4841 * f
			       + ((Class433) this).aFloat4839 * f_59_
			       + ((Class433) this).aFloat4840 * f_60_);
    }
    
    public void method5231(Class433 class433_61_) {
	float f = ((Class433) this).aFloat4832;
	float f_62_ = ((Class433) this).aFloat4833;
	float f_63_ = ((Class433) this).aFloat4835;
	float f_64_ = ((Class433) this).aFloat4836;
	float f_65_ = ((Class433) this).aFloat4841;
	float f_66_ = ((Class433) this).aFloat4839;
	float f_67_ = ((Class433) this).aFloat4837;
	float f_68_ = ((Class433) this).aFloat4842;
	float f_69_ = ((Class433) this).aFloat4834;
	float f_70_ = ((Class433) this).aFloat4843;
	float f_71_ = ((Class433) this).aFloat4840;
	float f_72_ = ((Class433) this).aFloat4831;
	((Class433) this).aFloat4832
	    = (f * ((Class433) class433_61_).aFloat4832
	       + f_62_ * ((Class433) class433_61_).aFloat4835
	       + f_69_ * ((Class433) class433_61_).aFloat4841);
	((Class433) this).aFloat4833
	    = (f * ((Class433) class433_61_).aFloat4833
	       + f_62_ * ((Class433) class433_61_).aFloat4836
	       + f_69_ * ((Class433) class433_61_).aFloat4839);
	((Class433) this).aFloat4834
	    = (f * ((Class433) class433_61_).aFloat4834
	       + f_62_ * ((Class433) class433_61_).aFloat4843
	       + f_69_ * ((Class433) class433_61_).aFloat4840);
	((Class433) this).aFloat4835
	    = (f_63_ * ((Class433) class433_61_).aFloat4832
	       + f_64_ * ((Class433) class433_61_).aFloat4835
	       + f_70_ * ((Class433) class433_61_).aFloat4841);
	((Class433) this).aFloat4836
	    = (f_63_ * ((Class433) class433_61_).aFloat4833
	       + f_64_ * ((Class433) class433_61_).aFloat4836
	       + f_70_ * ((Class433) class433_61_).aFloat4839);
	((Class433) this).aFloat4843
	    = (f_63_ * ((Class433) class433_61_).aFloat4834
	       + f_64_ * ((Class433) class433_61_).aFloat4843
	       + f_70_ * ((Class433) class433_61_).aFloat4840);
	((Class433) this).aFloat4841
	    = (f_65_ * ((Class433) class433_61_).aFloat4832
	       + f_66_ * ((Class433) class433_61_).aFloat4835
	       + f_71_ * ((Class433) class433_61_).aFloat4841);
	((Class433) this).aFloat4839
	    = (f_65_ * ((Class433) class433_61_).aFloat4833
	       + f_66_ * ((Class433) class433_61_).aFloat4836
	       + f_71_ * ((Class433) class433_61_).aFloat4839);
	((Class433) this).aFloat4840
	    = (f_65_ * ((Class433) class433_61_).aFloat4834
	       + f_66_ * ((Class433) class433_61_).aFloat4843
	       + f_71_ * ((Class433) class433_61_).aFloat4840);
	((Class433) this).aFloat4837
	    = (f_67_ * ((Class433) class433_61_).aFloat4832
	       + f_68_ * ((Class433) class433_61_).aFloat4835
	       + f_72_ * ((Class433) class433_61_).aFloat4841
	       + ((Class433) class433_61_).aFloat4837);
	((Class433) this).aFloat4842
	    = (f_67_ * ((Class433) class433_61_).aFloat4833
	       + f_68_ * ((Class433) class433_61_).aFloat4836
	       + f_72_ * ((Class433) class433_61_).aFloat4839
	       + ((Class433) class433_61_).aFloat4842);
	((Class433) this).aFloat4831
	    = (f_67_ * ((Class433) class433_61_).aFloat4834
	       + f_68_ * ((Class433) class433_61_).aFloat4843
	       + f_72_ * ((Class433) class433_61_).aFloat4840
	       + ((Class433) class433_61_).aFloat4831);
    }
    
    public String method5232() {
	return new StringBuilder().append(((Class433) this).aFloat4832).append
		   (",").append
		   (((Class433) this).aFloat4835).append
		   (",").append
		   (((Class433) this).aFloat4841).append
		   (",").append
		   (((Class433) this).aFloat4837).append
		   (" - ").append
		   (((Class433) this).aFloat4833).append
		   (",").append
		   (((Class433) this).aFloat4836).append
		   (",").append
		   (((Class433) this).aFloat4839).append
		   (",").append
		   (((Class433) this).aFloat4842).append
		   (" - ").append
		   (((Class433) this).aFloat4834).append
		   (",").append
		   (((Class433) this).aFloat4843).append
		   (",").append
		   (((Class433) this).aFloat4840).append
		   (",").append
		   (((Class433) this).aFloat4831).toString();
    }
    
    public void method5233(float f, float f_73_, float f_74_, float[] fs) {
	fs[0] = (((Class433) this).aFloat4832 * f
		 + ((Class433) this).aFloat4835 * f_73_
		 + ((Class433) this).aFloat4841 * f_74_
		 + ((Class433) this).aFloat4837);
	fs[1] = (((Class433) this).aFloat4833 * f
		 + ((Class433) this).aFloat4836 * f_73_
		 + ((Class433) this).aFloat4839 * f_74_
		 + ((Class433) this).aFloat4842);
	fs[2] = (((Class433) this).aFloat4834 * f
		 + ((Class433) this).aFloat4843 * f_73_
		 + ((Class433) this).aFloat4840 * f_74_
		 + ((Class433) this).aFloat4831);
    }
    
    public void method5234(float f, float f_75_, float f_76_, float[] fs) {
	f -= ((Class433) this).aFloat4837;
	f_75_ -= ((Class433) this).aFloat4842;
	f_76_ -= ((Class433) this).aFloat4831;
	fs[0] = (float) (int) (((Class433) this).aFloat4832 * f
			       + ((Class433) this).aFloat4833 * f_75_
			       + ((Class433) this).aFloat4834 * f_76_);
	fs[1] = (float) (int) (((Class433) this).aFloat4835 * f
			       + ((Class433) this).aFloat4836 * f_75_
			       + ((Class433) this).aFloat4843 * f_76_);
	fs[2] = (float) (int) (((Class433) this).aFloat4841 * f
			       + ((Class433) this).aFloat4839 * f_75_
			       + ((Class433) this).aFloat4840 * f_76_);
    }
    
    public Class433(Class433 class433_77_) {
	method5217(class433_77_);
    }
    
    public float[] method5235(float[] fs) {
	fs[0] = ((Class433) this).aFloat4837;
	fs[1] = ((Class433) this).aFloat4842;
	fs[2] = ((Class433) this).aFloat4831;
	return fs;
    }
    
    public float[] method5236(float[] fs) {
	fs[0] = ((Class433) this).aFloat4832;
	fs[1] = ((Class433) this).aFloat4833;
	fs[2] = ((Class433) this).aFloat4834;
	fs[3] = ((Class433) this).aFloat4835;
	fs[4] = ((Class433) this).aFloat4836;
	fs[5] = ((Class433) this).aFloat4843;
	fs[6] = ((Class433) this).aFloat4841;
	fs[7] = ((Class433) this).aFloat4839;
	fs[8] = ((Class433) this).aFloat4840;
	return fs;
    }
    
    public void method5237(Class433 class433_78_) {
	float f = ((Class433) this).aFloat4832;
	float f_79_ = ((Class433) this).aFloat4833;
	float f_80_ = ((Class433) this).aFloat4835;
	float f_81_ = ((Class433) this).aFloat4836;
	float f_82_ = ((Class433) this).aFloat4841;
	float f_83_ = ((Class433) this).aFloat4839;
	float f_84_ = ((Class433) this).aFloat4837;
	float f_85_ = ((Class433) this).aFloat4842;
	float f_86_ = ((Class433) this).aFloat4834;
	float f_87_ = ((Class433) this).aFloat4843;
	float f_88_ = ((Class433) this).aFloat4840;
	float f_89_ = ((Class433) this).aFloat4831;
	((Class433) this).aFloat4832
	    = (f * ((Class433) class433_78_).aFloat4832
	       + f_79_ * ((Class433) class433_78_).aFloat4835
	       + f_86_ * ((Class433) class433_78_).aFloat4841);
	((Class433) this).aFloat4833
	    = (f * ((Class433) class433_78_).aFloat4833
	       + f_79_ * ((Class433) class433_78_).aFloat4836
	       + f_86_ * ((Class433) class433_78_).aFloat4839);
	((Class433) this).aFloat4834
	    = (f * ((Class433) class433_78_).aFloat4834
	       + f_79_ * ((Class433) class433_78_).aFloat4843
	       + f_86_ * ((Class433) class433_78_).aFloat4840);
	((Class433) this).aFloat4835
	    = (f_80_ * ((Class433) class433_78_).aFloat4832
	       + f_81_ * ((Class433) class433_78_).aFloat4835
	       + f_87_ * ((Class433) class433_78_).aFloat4841);
	((Class433) this).aFloat4836
	    = (f_80_ * ((Class433) class433_78_).aFloat4833
	       + f_81_ * ((Class433) class433_78_).aFloat4836
	       + f_87_ * ((Class433) class433_78_).aFloat4839);
	((Class433) this).aFloat4843
	    = (f_80_ * ((Class433) class433_78_).aFloat4834
	       + f_81_ * ((Class433) class433_78_).aFloat4843
	       + f_87_ * ((Class433) class433_78_).aFloat4840);
	((Class433) this).aFloat4841
	    = (f_82_ * ((Class433) class433_78_).aFloat4832
	       + f_83_ * ((Class433) class433_78_).aFloat4835
	       + f_88_ * ((Class433) class433_78_).aFloat4841);
	((Class433) this).aFloat4839
	    = (f_82_ * ((Class433) class433_78_).aFloat4833
	       + f_83_ * ((Class433) class433_78_).aFloat4836
	       + f_88_ * ((Class433) class433_78_).aFloat4839);
	((Class433) this).aFloat4840
	    = (f_82_ * ((Class433) class433_78_).aFloat4834
	       + f_83_ * ((Class433) class433_78_).aFloat4843
	       + f_88_ * ((Class433) class433_78_).aFloat4840);
	((Class433) this).aFloat4837
	    = (f_84_ * ((Class433) class433_78_).aFloat4832
	       + f_85_ * ((Class433) class433_78_).aFloat4835
	       + f_89_ * ((Class433) class433_78_).aFloat4841
	       + ((Class433) class433_78_).aFloat4837);
	((Class433) this).aFloat4842
	    = (f_84_ * ((Class433) class433_78_).aFloat4833
	       + f_85_ * ((Class433) class433_78_).aFloat4836
	       + f_89_ * ((Class433) class433_78_).aFloat4839
	       + ((Class433) class433_78_).aFloat4842);
	((Class433) this).aFloat4831
	    = (f_84_ * ((Class433) class433_78_).aFloat4834
	       + f_85_ * ((Class433) class433_78_).aFloat4843
	       + f_89_ * ((Class433) class433_78_).aFloat4840
	       + ((Class433) class433_78_).aFloat4831);
    }
    
    public String method5238() {
	return new StringBuilder().append(((Class433) this).aFloat4832).append
		   (",").append
		   (((Class433) this).aFloat4835).append
		   (",").append
		   (((Class433) this).aFloat4841).append
		   (",").append
		   (((Class433) this).aFloat4837).append
		   (" - ").append
		   (((Class433) this).aFloat4833).append
		   (",").append
		   (((Class433) this).aFloat4836).append
		   (",").append
		   (((Class433) this).aFloat4839).append
		   (",").append
		   (((Class433) this).aFloat4842).append
		   (" - ").append
		   (((Class433) this).aFloat4834).append
		   (",").append
		   (((Class433) this).aFloat4843).append
		   (",").append
		   (((Class433) this).aFloat4840).append
		   (",").append
		   (((Class433) this).aFloat4831).toString();
    }
    
    public String method5239() {
	return new StringBuilder().append(((Class433) this).aFloat4832).append
		   (",").append
		   (((Class433) this).aFloat4835).append
		   (",").append
		   (((Class433) this).aFloat4841).append
		   (",").append
		   (((Class433) this).aFloat4837).append
		   (" - ").append
		   (((Class433) this).aFloat4833).append
		   (",").append
		   (((Class433) this).aFloat4836).append
		   (",").append
		   (((Class433) this).aFloat4839).append
		   (",").append
		   (((Class433) this).aFloat4842).append
		   (" - ").append
		   (((Class433) this).aFloat4834).append
		   (",").append
		   (((Class433) this).aFloat4843).append
		   (",").append
		   (((Class433) this).aFloat4840).append
		   (",").append
		   (((Class433) this).aFloat4831).toString();
    }
    
    public void method5240(float[] fs) {
	float f = fs[0];
	float f_90_ = fs[1];
	float f_91_ = fs[2];
	fs[0] = (((Class433) this).aFloat4832 * f
		 + ((Class433) this).aFloat4833 * f_90_
		 + ((Class433) this).aFloat4834 * f_91_);
	fs[1] = (((Class433) this).aFloat4835 * f
		 + ((Class433) this).aFloat4836 * f_90_
		 + ((Class433) this).aFloat4843 * f_91_);
	fs[2] = (((Class433) this).aFloat4841 * f
		 + ((Class433) this).aFloat4839 * f_90_
		 + ((Class433) this).aFloat4840 * f_91_);
    }
    
    public void method5241(Class437 class437) {
	float f = (class437.aClass430_4869.aFloat4815
		   * class437.aClass430_4869.aFloat4815);
	float f_92_ = (class437.aClass430_4869.aFloat4815
		       * class437.aClass430_4869.aFloat4816);
	float f_93_ = (class437.aClass430_4869.aFloat4815
		       * class437.aClass430_4869.aFloat4819);
	float f_94_ = (class437.aClass430_4869.aFloat4815
		       * class437.aClass430_4869.aFloat4818);
	float f_95_ = (class437.aClass430_4869.aFloat4816
		       * class437.aClass430_4869.aFloat4816);
	float f_96_ = (class437.aClass430_4869.aFloat4816
		       * class437.aClass430_4869.aFloat4819);
	float f_97_ = (class437.aClass430_4869.aFloat4816
		       * class437.aClass430_4869.aFloat4818);
	float f_98_ = (class437.aClass430_4869.aFloat4819
		       * class437.aClass430_4869.aFloat4819);
	float f_99_ = (class437.aClass430_4869.aFloat4819
		       * class437.aClass430_4869.aFloat4818);
	float f_100_ = (class437.aClass430_4869.aFloat4818
			* class437.aClass430_4869.aFloat4818);
	((Class433) this).aFloat4832 = f_95_ + f - f_100_ - f_98_;
	((Class433) this).aFloat4833 = f_96_ + f_94_ + f_96_ + f_94_;
	((Class433) this).aFloat4834 = f_97_ - f_93_ - f_93_ + f_97_;
	((Class433) this).aFloat4835 = f_96_ - f_94_ - f_94_ + f_96_;
	((Class433) this).aFloat4836 = f_98_ + f - f_95_ - f_100_;
	((Class433) this).aFloat4843 = f_99_ + f_92_ + f_99_ + f_92_;
	((Class433) this).aFloat4841 = f_97_ + f_93_ + f_97_ + f_93_;
	((Class433) this).aFloat4839 = f_99_ - f_92_ - f_92_ + f_99_;
	((Class433) this).aFloat4840 = f_100_ + f - f_98_ - f_95_;
	((Class433) this).aFloat4837 = class437.aClass422_4868.aFloat4780;
	((Class433) this).aFloat4842 = class437.aClass422_4868.aFloat4776;
	((Class433) this).aFloat4831 = class437.aClass422_4868.aFloat4777;
    }
    
    public String toString() {
	return new StringBuilder().append(((Class433) this).aFloat4832).append
		   (",").append
		   (((Class433) this).aFloat4835).append
		   (",").append
		   (((Class433) this).aFloat4841).append
		   (",").append
		   (((Class433) this).aFloat4837).append
		   (" - ").append
		   (((Class433) this).aFloat4833).append
		   (",").append
		   (((Class433) this).aFloat4836).append
		   (",").append
		   (((Class433) this).aFloat4839).append
		   (",").append
		   (((Class433) this).aFloat4842).append
		   (" - ").append
		   (((Class433) this).aFloat4834).append
		   (",").append
		   (((Class433) this).aFloat4843).append
		   (",").append
		   (((Class433) this).aFloat4840).append
		   (",").append
		   (((Class433) this).aFloat4831).toString();
    }
    
    public void method5242(Class437 class437) {
	float f = (class437.aClass430_4869.aFloat4815
		   * class437.aClass430_4869.aFloat4815);
	float f_101_ = (class437.aClass430_4869.aFloat4815
			* class437.aClass430_4869.aFloat4816);
	float f_102_ = (class437.aClass430_4869.aFloat4815
			* class437.aClass430_4869.aFloat4819);
	float f_103_ = (class437.aClass430_4869.aFloat4815
			* class437.aClass430_4869.aFloat4818);
	float f_104_ = (class437.aClass430_4869.aFloat4816
			* class437.aClass430_4869.aFloat4816);
	float f_105_ = (class437.aClass430_4869.aFloat4816
			* class437.aClass430_4869.aFloat4819);
	float f_106_ = (class437.aClass430_4869.aFloat4816
			* class437.aClass430_4869.aFloat4818);
	float f_107_ = (class437.aClass430_4869.aFloat4819
			* class437.aClass430_4869.aFloat4819);
	float f_108_ = (class437.aClass430_4869.aFloat4819
			* class437.aClass430_4869.aFloat4818);
	float f_109_ = (class437.aClass430_4869.aFloat4818
			* class437.aClass430_4869.aFloat4818);
	((Class433) this).aFloat4832 = f_104_ + f - f_109_ - f_107_;
	((Class433) this).aFloat4833 = f_105_ + f_103_ + f_105_ + f_103_;
	((Class433) this).aFloat4834 = f_106_ - f_102_ - f_102_ + f_106_;
	((Class433) this).aFloat4835 = f_105_ - f_103_ - f_103_ + f_105_;
	((Class433) this).aFloat4836 = f_107_ + f - f_104_ - f_109_;
	((Class433) this).aFloat4843 = f_108_ + f_101_ + f_108_ + f_101_;
	((Class433) this).aFloat4841 = f_106_ + f_102_ + f_106_ + f_102_;
	((Class433) this).aFloat4839 = f_108_ - f_101_ - f_101_ + f_108_;
	((Class433) this).aFloat4840 = f_109_ + f - f_107_ - f_104_;
	((Class433) this).aFloat4837 = class437.aClass422_4868.aFloat4780;
	((Class433) this).aFloat4842 = class437.aClass422_4868.aFloat4776;
	((Class433) this).aFloat4831 = class437.aClass422_4868.aFloat4777;
    }
    
    public void method5243(Class433 class433_110_) {
	float f = ((Class433) this).aFloat4832;
	float f_111_ = ((Class433) this).aFloat4833;
	float f_112_ = ((Class433) this).aFloat4835;
	float f_113_ = ((Class433) this).aFloat4836;
	float f_114_ = ((Class433) this).aFloat4841;
	float f_115_ = ((Class433) this).aFloat4839;
	float f_116_ = ((Class433) this).aFloat4837;
	float f_117_ = ((Class433) this).aFloat4842;
	float f_118_ = ((Class433) this).aFloat4834;
	float f_119_ = ((Class433) this).aFloat4843;
	float f_120_ = ((Class433) this).aFloat4840;
	float f_121_ = ((Class433) this).aFloat4831;
	((Class433) this).aFloat4832
	    = (f * ((Class433) class433_110_).aFloat4832
	       + f_111_ * ((Class433) class433_110_).aFloat4835
	       + f_118_ * ((Class433) class433_110_).aFloat4841);
	((Class433) this).aFloat4833
	    = (f * ((Class433) class433_110_).aFloat4833
	       + f_111_ * ((Class433) class433_110_).aFloat4836
	       + f_118_ * ((Class433) class433_110_).aFloat4839);
	((Class433) this).aFloat4834
	    = (f * ((Class433) class433_110_).aFloat4834
	       + f_111_ * ((Class433) class433_110_).aFloat4843
	       + f_118_ * ((Class433) class433_110_).aFloat4840);
	((Class433) this).aFloat4835
	    = (f_112_ * ((Class433) class433_110_).aFloat4832
	       + f_113_ * ((Class433) class433_110_).aFloat4835
	       + f_119_ * ((Class433) class433_110_).aFloat4841);
	((Class433) this).aFloat4836
	    = (f_112_ * ((Class433) class433_110_).aFloat4833
	       + f_113_ * ((Class433) class433_110_).aFloat4836
	       + f_119_ * ((Class433) class433_110_).aFloat4839);
	((Class433) this).aFloat4843
	    = (f_112_ * ((Class433) class433_110_).aFloat4834
	       + f_113_ * ((Class433) class433_110_).aFloat4843
	       + f_119_ * ((Class433) class433_110_).aFloat4840);
	((Class433) this).aFloat4841
	    = (f_114_ * ((Class433) class433_110_).aFloat4832
	       + f_115_ * ((Class433) class433_110_).aFloat4835
	       + f_120_ * ((Class433) class433_110_).aFloat4841);
	((Class433) this).aFloat4839
	    = (f_114_ * ((Class433) class433_110_).aFloat4833
	       + f_115_ * ((Class433) class433_110_).aFloat4836
	       + f_120_ * ((Class433) class433_110_).aFloat4839);
	((Class433) this).aFloat4840
	    = (f_114_ * ((Class433) class433_110_).aFloat4834
	       + f_115_ * ((Class433) class433_110_).aFloat4843
	       + f_120_ * ((Class433) class433_110_).aFloat4840);
	((Class433) this).aFloat4837
	    = (f_116_ * ((Class433) class433_110_).aFloat4832
	       + f_117_ * ((Class433) class433_110_).aFloat4835
	       + f_121_ * ((Class433) class433_110_).aFloat4841
	       + ((Class433) class433_110_).aFloat4837);
	((Class433) this).aFloat4842
	    = (f_116_ * ((Class433) class433_110_).aFloat4833
	       + f_117_ * ((Class433) class433_110_).aFloat4836
	       + f_121_ * ((Class433) class433_110_).aFloat4839
	       + ((Class433) class433_110_).aFloat4842);
	((Class433) this).aFloat4831
	    = (f_116_ * ((Class433) class433_110_).aFloat4834
	       + f_117_ * ((Class433) class433_110_).aFloat4843
	       + f_121_ * ((Class433) class433_110_).aFloat4840
	       + ((Class433) class433_110_).aFloat4831);
    }
    
    public void method5244(Class433 class433_122_) {
	if (class433_122_ == this)
	    method5223();
	else {
	    ((Class433) this).aFloat4832
		= ((Class433) class433_122_).aFloat4832;
	    ((Class433) this).aFloat4835
		= ((Class433) class433_122_).aFloat4833;
	    ((Class433) this).aFloat4841
		= ((Class433) class433_122_).aFloat4834;
	    ((Class433) this).aFloat4833
		= ((Class433) class433_122_).aFloat4835;
	    ((Class433) this).aFloat4836
		= ((Class433) class433_122_).aFloat4836;
	    ((Class433) this).aFloat4839
		= ((Class433) class433_122_).aFloat4843;
	    ((Class433) this).aFloat4834
		= ((Class433) class433_122_).aFloat4841;
	    ((Class433) this).aFloat4843
		= ((Class433) class433_122_).aFloat4839;
	    ((Class433) this).aFloat4840
		= ((Class433) class433_122_).aFloat4840;
	    ((Class433) this).aFloat4837
		= -((((Class433) class433_122_).aFloat4837
		     * ((Class433) this).aFloat4832)
		    + (((Class433) class433_122_).aFloat4842
		       * ((Class433) this).aFloat4835)
		    + (((Class433) class433_122_).aFloat4831
		       * ((Class433) this).aFloat4841));
	    ((Class433) this).aFloat4842
		= -((((Class433) class433_122_).aFloat4837
		     * ((Class433) this).aFloat4833)
		    + (((Class433) class433_122_).aFloat4842
		       * ((Class433) this).aFloat4836)
		    + (((Class433) class433_122_).aFloat4831
		       * ((Class433) this).aFloat4839));
	    ((Class433) this).aFloat4831
		= -((((Class433) class433_122_).aFloat4837
		     * ((Class433) this).aFloat4834)
		    + (((Class433) class433_122_).aFloat4842
		       * ((Class433) this).aFloat4843)
		    + (((Class433) class433_122_).aFloat4831
		       * ((Class433) this).aFloat4840));
	}
    }
    
    public void method5245() {
	float f = ((Class433) this).aFloat4837;
	float f_123_ = ((Class433) this).aFloat4842;
	float f_124_ = ((Class433) this).aFloat4835;
	((Class433) this).aFloat4835 = ((Class433) this).aFloat4833;
	((Class433) this).aFloat4833 = f_124_;
	float f_125_ = ((Class433) this).aFloat4841;
	((Class433) this).aFloat4841 = ((Class433) this).aFloat4834;
	((Class433) this).aFloat4834 = f_125_;
	float f_126_ = ((Class433) this).aFloat4839;
	((Class433) this).aFloat4839 = ((Class433) this).aFloat4843;
	((Class433) this).aFloat4843 = f_126_;
	((Class433) this).aFloat4837
	    = -(f * ((Class433) this).aFloat4832
		+ f_123_ * ((Class433) this).aFloat4835
		+ ((Class433) this).aFloat4831 * ((Class433) this).aFloat4841);
	((Class433) this).aFloat4842
	    = -(f * ((Class433) this).aFloat4833
		+ f_123_ * ((Class433) this).aFloat4836
		+ ((Class433) this).aFloat4831 * ((Class433) this).aFloat4839);
	((Class433) this).aFloat4831
	    = -(f * ((Class433) this).aFloat4834
		+ f_123_ * ((Class433) this).aFloat4843
		+ ((Class433) this).aFloat4831 * ((Class433) this).aFloat4840);
    }
    
    public void method5246(Class430 class430) {
	method5225(class430.aFloat4816, class430.aFloat4819,
		   class430.aFloat4818, class430.aFloat4815);
    }
    
    public void method5247() {
	float f = ((Class433) this).aFloat4837;
	float f_127_ = ((Class433) this).aFloat4842;
	float f_128_ = ((Class433) this).aFloat4835;
	((Class433) this).aFloat4835 = ((Class433) this).aFloat4833;
	((Class433) this).aFloat4833 = f_128_;
	float f_129_ = ((Class433) this).aFloat4841;
	((Class433) this).aFloat4841 = ((Class433) this).aFloat4834;
	((Class433) this).aFloat4834 = f_129_;
	float f_130_ = ((Class433) this).aFloat4839;
	((Class433) this).aFloat4839 = ((Class433) this).aFloat4843;
	((Class433) this).aFloat4843 = f_130_;
	((Class433) this).aFloat4837
	    = -(f * ((Class433) this).aFloat4832
		+ f_127_ * ((Class433) this).aFloat4835
		+ ((Class433) this).aFloat4831 * ((Class433) this).aFloat4841);
	((Class433) this).aFloat4842
	    = -(f * ((Class433) this).aFloat4833
		+ f_127_ * ((Class433) this).aFloat4836
		+ ((Class433) this).aFloat4831 * ((Class433) this).aFloat4839);
	((Class433) this).aFloat4831
	    = -(f * ((Class433) this).aFloat4834
		+ f_127_ * ((Class433) this).aFloat4843
		+ ((Class433) this).aFloat4831 * ((Class433) this).aFloat4840);
    }
    
    public void method5248(float f, float f_131_, float f_132_) {
	((Class433) this).aFloat4839 = 0.0F;
	((Class433) this).aFloat4841 = 0.0F;
	((Class433) this).aFloat4843 = 0.0F;
	((Class433) this).aFloat4835 = 0.0F;
	((Class433) this).aFloat4834 = 0.0F;
	((Class433) this).aFloat4833 = 0.0F;
	((Class433) this).aFloat4840 = 1.0F;
	((Class433) this).aFloat4836 = 1.0F;
	((Class433) this).aFloat4832 = 1.0F;
	((Class433) this).aFloat4837 = f;
	((Class433) this).aFloat4842 = f_131_;
	((Class433) this).aFloat4831 = f_132_;
    }
    
    public void method5249(float f, float f_133_, float f_134_) {
	((Class433) this).aFloat4832 *= f;
	((Class433) this).aFloat4835 *= f;
	((Class433) this).aFloat4841 *= f;
	((Class433) this).aFloat4837 *= f;
	((Class433) this).aFloat4833 *= f_133_;
	((Class433) this).aFloat4836 *= f_133_;
	((Class433) this).aFloat4839 *= f_133_;
	((Class433) this).aFloat4842 *= f_133_;
	((Class433) this).aFloat4834 *= f_134_;
	((Class433) this).aFloat4843 *= f_134_;
	((Class433) this).aFloat4840 *= f_134_;
	((Class433) this).aFloat4831 *= f_134_;
    }
    
    public void method5250(Class433 class433_135_, Class433 class433_136_) {
	((Class433) this).aFloat4832
	    = ((((Class433) class433_135_).aFloat4832
		* ((Class433) class433_136_).aFloat4832)
	       + (((Class433) class433_135_).aFloat4833
		  * ((Class433) class433_136_).aFloat4835)
	       + (((Class433) class433_135_).aFloat4834
		  * ((Class433) class433_136_).aFloat4841));
	((Class433) this).aFloat4833
	    = ((((Class433) class433_135_).aFloat4832
		* ((Class433) class433_136_).aFloat4833)
	       + (((Class433) class433_135_).aFloat4833
		  * ((Class433) class433_136_).aFloat4836)
	       + (((Class433) class433_135_).aFloat4834
		  * ((Class433) class433_136_).aFloat4839));
	((Class433) this).aFloat4834
	    = ((((Class433) class433_135_).aFloat4832
		* ((Class433) class433_136_).aFloat4834)
	       + (((Class433) class433_135_).aFloat4833
		  * ((Class433) class433_136_).aFloat4843)
	       + (((Class433) class433_135_).aFloat4834
		  * ((Class433) class433_136_).aFloat4840));
	((Class433) this).aFloat4835
	    = ((((Class433) class433_135_).aFloat4835
		* ((Class433) class433_136_).aFloat4832)
	       + (((Class433) class433_135_).aFloat4836
		  * ((Class433) class433_136_).aFloat4835)
	       + (((Class433) class433_135_).aFloat4843
		  * ((Class433) class433_136_).aFloat4841));
	((Class433) this).aFloat4836
	    = ((((Class433) class433_135_).aFloat4835
		* ((Class433) class433_136_).aFloat4833)
	       + (((Class433) class433_135_).aFloat4836
		  * ((Class433) class433_136_).aFloat4836)
	       + (((Class433) class433_135_).aFloat4843
		  * ((Class433) class433_136_).aFloat4839));
	((Class433) this).aFloat4843
	    = ((((Class433) class433_135_).aFloat4835
		* ((Class433) class433_136_).aFloat4834)
	       + (((Class433) class433_135_).aFloat4836
		  * ((Class433) class433_136_).aFloat4843)
	       + (((Class433) class433_135_).aFloat4843
		  * ((Class433) class433_136_).aFloat4840));
	((Class433) this).aFloat4841
	    = ((((Class433) class433_135_).aFloat4841
		* ((Class433) class433_136_).aFloat4832)
	       + (((Class433) class433_135_).aFloat4839
		  * ((Class433) class433_136_).aFloat4835)
	       + (((Class433) class433_135_).aFloat4840
		  * ((Class433) class433_136_).aFloat4841));
	((Class433) this).aFloat4839
	    = ((((Class433) class433_135_).aFloat4841
		* ((Class433) class433_136_).aFloat4833)
	       + (((Class433) class433_135_).aFloat4839
		  * ((Class433) class433_136_).aFloat4836)
	       + (((Class433) class433_135_).aFloat4840
		  * ((Class433) class433_136_).aFloat4839));
	((Class433) this).aFloat4840
	    = ((((Class433) class433_135_).aFloat4841
		* ((Class433) class433_136_).aFloat4834)
	       + (((Class433) class433_135_).aFloat4839
		  * ((Class433) class433_136_).aFloat4843)
	       + (((Class433) class433_135_).aFloat4840
		  * ((Class433) class433_136_).aFloat4840));
	((Class433) this).aFloat4837
	    = ((((Class433) class433_135_).aFloat4837
		* ((Class433) class433_136_).aFloat4832)
	       + (((Class433) class433_135_).aFloat4842
		  * ((Class433) class433_136_).aFloat4835)
	       + (((Class433) class433_135_).aFloat4831
		  * ((Class433) class433_136_).aFloat4841)
	       + ((Class433) class433_136_).aFloat4837);
	((Class433) this).aFloat4842
	    = ((((Class433) class433_135_).aFloat4837
		* ((Class433) class433_136_).aFloat4833)
	       + (((Class433) class433_135_).aFloat4842
		  * ((Class433) class433_136_).aFloat4836)
	       + (((Class433) class433_135_).aFloat4831
		  * ((Class433) class433_136_).aFloat4839)
	       + ((Class433) class433_136_).aFloat4842);
	((Class433) this).aFloat4831
	    = ((((Class433) class433_135_).aFloat4837
		* ((Class433) class433_136_).aFloat4834)
	       + (((Class433) class433_135_).aFloat4842
		  * ((Class433) class433_136_).aFloat4843)
	       + (((Class433) class433_135_).aFloat4831
		  * ((Class433) class433_136_).aFloat4840)
	       + ((Class433) class433_136_).aFloat4831);
    }
    
    public void method5251(float f, float f_137_, float f_138_, float[] fs) {
	f -= ((Class433) this).aFloat4837;
	f_137_ -= ((Class433) this).aFloat4842;
	f_138_ -= ((Class433) this).aFloat4831;
	fs[0] = (float) (int) (((Class433) this).aFloat4832 * f
			       + ((Class433) this).aFloat4833 * f_137_
			       + ((Class433) this).aFloat4834 * f_138_);
	fs[1] = (float) (int) (((Class433) this).aFloat4835 * f
			       + ((Class433) this).aFloat4836 * f_137_
			       + ((Class433) this).aFloat4843 * f_138_);
	fs[2] = (float) (int) (((Class433) this).aFloat4841 * f
			       + ((Class433) this).aFloat4839 * f_137_
			       + ((Class433) this).aFloat4840 * f_138_);
    }
    
    public void method5252(float f, float f_139_, float f_140_) {
	((Class433) this).aFloat4837 += f;
	((Class433) this).aFloat4842 += f_139_;
	((Class433) this).aFloat4831 += f_140_;
    }
    
    public Class433() {
	method5219();
    }
    
    public void method5253(float[] fs) {
	float f = fs[0];
	float f_141_ = fs[1];
	float f_142_ = fs[2];
	fs[0] = (((Class433) this).aFloat4832 * f
		 + ((Class433) this).aFloat4833 * f_141_
		 + ((Class433) this).aFloat4834 * f_142_);
	fs[1] = (((Class433) this).aFloat4835 * f
		 + ((Class433) this).aFloat4836 * f_141_
		 + ((Class433) this).aFloat4843 * f_142_);
	fs[2] = (((Class433) this).aFloat4841 * f
		 + ((Class433) this).aFloat4839 * f_141_
		 + ((Class433) this).aFloat4840 * f_142_);
    }
    
    public void method5254() {
	((Class433) this).aFloat4831 = 0.0F;
	((Class433) this).aFloat4842 = 0.0F;
	((Class433) this).aFloat4837 = 0.0F;
	((Class433) this).aFloat4839 = 0.0F;
	((Class433) this).aFloat4841 = 0.0F;
	((Class433) this).aFloat4843 = 0.0F;
	((Class433) this).aFloat4835 = 0.0F;
	((Class433) this).aFloat4834 = 0.0F;
	((Class433) this).aFloat4833 = 0.0F;
	((Class433) this).aFloat4840 = 1.0F;
	((Class433) this).aFloat4836 = 1.0F;
	((Class433) this).aFloat4832 = 1.0F;
    }
    
    public String method5255() {
	return new StringBuilder().append(((Class433) this).aFloat4832).append
		   (",").append
		   (((Class433) this).aFloat4835).append
		   (",").append
		   (((Class433) this).aFloat4841).append
		   (",").append
		   (((Class433) this).aFloat4837).append
		   (" - ").append
		   (((Class433) this).aFloat4833).append
		   (",").append
		   (((Class433) this).aFloat4836).append
		   (",").append
		   (((Class433) this).aFloat4839).append
		   (",").append
		   (((Class433) this).aFloat4842).append
		   (" - ").append
		   (((Class433) this).aFloat4834).append
		   (",").append
		   (((Class433) this).aFloat4843).append
		   (",").append
		   (((Class433) this).aFloat4840).append
		   (",").append
		   (((Class433) this).aFloat4831).toString();
    }
    
    public void method5256(float f, float f_143_, float f_144_, float f_145_) {
	float f_146_ = (float) Math.cos((double) f_145_);
	float f_147_ = (float) Math.sin((double) f_145_);
	float f_148_ = f_146_ + f * f * (1.0F - f_146_);
	float f_149_ = f_144_ * f_147_ + f_143_ * f * (1.0F - f_146_);
	float f_150_ = -f_143_ * f_147_ + f_144_ * f * (1.0F - f_146_);
	float f_151_ = -f_144_ * f_147_ + f * f_143_ * (1.0F - f_146_);
	float f_152_ = f_146_ + f_143_ * f_143_ * (1.0F - f_146_);
	float f_153_ = f * f_147_ + f_144_ * f_143_ * (1.0F - f_146_);
	float f_154_ = f_143_ * f_147_ + f * f_144_ * (1.0F - f_146_);
	float f_155_ = -f * f_147_ + f_143_ * f_144_ * (1.0F - f_146_);
	float f_156_ = f_146_ + f_144_ * f_144_ * (1.0F - f_146_);
	float f_157_ = ((Class433) this).aFloat4832;
	float f_158_ = ((Class433) this).aFloat4833;
	float f_159_ = ((Class433) this).aFloat4835;
	float f_160_ = ((Class433) this).aFloat4836;
	float f_161_ = ((Class433) this).aFloat4841;
	float f_162_ = ((Class433) this).aFloat4839;
	float f_163_ = ((Class433) this).aFloat4837;
	float f_164_ = ((Class433) this).aFloat4842;
	((Class433) this).aFloat4832
	    = (f_157_ * f_148_ + f_158_ * f_151_
	       + ((Class433) this).aFloat4834 * f_154_);
	((Class433) this).aFloat4833
	    = (f_157_ * f_149_ + f_158_ * f_152_
	       + ((Class433) this).aFloat4834 * f_155_);
	((Class433) this).aFloat4834
	    = (f_157_ * f_150_ + f_158_ * f_153_
	       + ((Class433) this).aFloat4834 * f_156_);
	((Class433) this).aFloat4835
	    = (f_159_ * f_148_ + f_160_ * f_151_
	       + ((Class433) this).aFloat4843 * f_154_);
	((Class433) this).aFloat4836
	    = (f_159_ * f_149_ + f_160_ * f_152_
	       + ((Class433) this).aFloat4843 * f_155_);
	((Class433) this).aFloat4843
	    = (f_159_ * f_150_ + f_160_ * f_153_
	       + ((Class433) this).aFloat4843 * f_156_);
	((Class433) this).aFloat4841
	    = (f_161_ * f_148_ + f_162_ * f_151_
	       + ((Class433) this).aFloat4840 * f_154_);
	((Class433) this).aFloat4839
	    = (f_161_ * f_149_ + f_162_ * f_152_
	       + ((Class433) this).aFloat4840 * f_155_);
	((Class433) this).aFloat4840
	    = (f_161_ * f_150_ + f_162_ * f_153_
	       + ((Class433) this).aFloat4840 * f_156_);
	((Class433) this).aFloat4837
	    = (f_163_ * f_148_ + f_164_ * f_151_
	       + ((Class433) this).aFloat4831 * f_154_);
	((Class433) this).aFloat4842
	    = (f_163_ * f_149_ + f_164_ * f_152_
	       + ((Class433) this).aFloat4831 * f_155_);
	((Class433) this).aFloat4831
	    = (f_163_ * f_150_ + f_164_ * f_153_
	       + ((Class433) this).aFloat4831 * f_156_);
    }
    
    public void method5257(float[] fs) {
	float f = fs[0];
	float f_165_ = fs[1];
	float f_166_ = fs[2];
	fs[0] = (((Class433) this).aFloat4832 * f
		 + ((Class433) this).aFloat4833 * f_165_
		 + ((Class433) this).aFloat4834 * f_166_);
	fs[1] = (((Class433) this).aFloat4835 * f
		 + ((Class433) this).aFloat4836 * f_165_
		 + ((Class433) this).aFloat4843 * f_166_);
	fs[2] = (((Class433) this).aFloat4841 * f
		 + ((Class433) this).aFloat4839 * f_165_
		 + ((Class433) this).aFloat4840 * f_166_);
    }
}
