/* Class470_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class470_Sub3 extends Class470 implements Interface43
{
    float aFloat10098;
    int anInt10099;
    int anInt10100;
    float aFloat10101;
    
    public float method229(float f) {
	return f / (float) ((Class470_Sub3) this).anInt10099;
    }
    
    Class470_Sub3(Class173_Sub1_Sub1 class173_sub1_sub1, int i, int i_0_,
		  boolean bool, int[] is, int i_1_, int i_2_) {
	super(class173_sub1_sub1, 3553, Class149.aClass149_1676,
	      Class169.aClass169_1935, i * i_0_, bool);
	if (!((Class173_Sub1_Sub1)
	      ((Class470_Sub3) this).aClass173_Sub1_Sub1_5389).aBool11289) {
	    ((Class470_Sub3) this).anInt10100
		= Class327.method4259(i, -2134279851);
	    ((Class470_Sub3) this).anInt10099
		= Class327.method4259(i_0_, -2134279851);
	    ((Class470_Sub3) this).aFloat10098
		= (float) i / (float) ((Class470_Sub3) this).anInt10100;
	    ((Class470_Sub3) this).aFloat10101
		= (float) i_0_ / (float) ((Class470_Sub3) this).anInt10099;
	    if (i != ((Class470_Sub3) this).anInt10100
		|| i_0_ != ((Class470_Sub3) this).anInt10099) {
		is = (((Class470_Sub3) this).aClass173_Sub1_Sub1_5389
			  .method2198
		      (i, i_0_, ((Class470_Sub3) this).anInt10100,
		       ((Class470_Sub3) this).anInt10099, is, i_1_, i_2_,
		       -1386083595));
		i_1_ = 0;
		i_2_ = ((Class470_Sub3) this).anInt10100;
	    }
	} else {
	    ((Class470_Sub3) this).anInt10100 = i;
	    ((Class470_Sub3) this).anInt10099 = i_0_;
	    ((Class470_Sub3) this).aFloat10098 = 1.0F;
	    ((Class470_Sub3) this).aFloat10101 = 1.0F;
	}
	((Class470_Sub3) this).aClass173_Sub1_Sub1_5389.method8526(this);
	if (!bool || i_2_ != 0 || i_1_ != 0) {
	    OpenGL.glPixelStorei(3314, i_2_);
	    OpenGL.glTexImage2Di(((Class470_Sub3) this).anInt5395, 0, 6408,
				 ((Class470_Sub3) this).anInt10100,
				 ((Class470_Sub3) this).anInt10099, 0, 32993,
				 ((Class173_Sub1_Sub1)
				  (((Class470_Sub3) this)
				   .aClass173_Sub1_Sub1_5389)).anInt11294,
				 is, i_1_ * 4);
	    OpenGL.glPixelStorei(3314, 0);
	} else
	    method5802(((Class470_Sub3) this).anInt5395, i, i_0_, is);
    }
    
    public void method242(int i, int i_3_, int i_4_, int i_5_, int[] is,
			  int[] is_6_, int i_7_) {
	int[] is_8_ = (is_6_ == null
		       ? new int[(((Class470_Sub3) this).anInt10100
				  * ((Class470_Sub3) this).anInt10099)]
		       : is_6_);
	((Class470_Sub3) this).aClass173_Sub1_Sub1_5389.method8526(this);
	OpenGL.glGetTexImagei(((Class470_Sub3) this).anInt5395, 0, 32993, 5121,
			      is_8_, 0);
	for (int i_9_ = 0; i_9_ < i_5_; i_9_++)
	    System.arraycopy(is_8_, i_9_ * ((Class470_Sub3) this).anInt10100,
			     is, i_7_ + i_9_ * i_4_, i_4_);
    }
    
    Class470_Sub3(Class173_Sub1_Sub1 class173_sub1_sub1, Class149 class149,
		  int i, int i_10_, boolean bool, float[] fs, int i_11_,
		  int i_12_) {
	super(class173_sub1_sub1, 3553, class149, Class169.aClass169_1940,
	      i * i_10_, bool);
	if (!((Class173_Sub1_Sub1)
	      ((Class470_Sub3) this).aClass173_Sub1_Sub1_5389).aBool11289) {
	    ((Class470_Sub3) this).anInt10100
		= Class327.method4259(i, -2134279851);
	    ((Class470_Sub3) this).anInt10099
		= Class327.method4259(i_10_, -2134279851);
	    ((Class470_Sub3) this).aFloat10098
		= (float) i / (float) ((Class470_Sub3) this).anInt10100;
	    ((Class470_Sub3) this).aFloat10101
		= (float) i_10_ / (float) ((Class470_Sub3) this).anInt10099;
	    if (i != ((Class470_Sub3) this).anInt10100
		|| i_10_ != ((Class470_Sub3) this).anInt10099) {
		fs = (((Class470_Sub3) this).aClass173_Sub1_Sub1_5389
			  .method2279
		      (i, i_10_, ((Class470_Sub3) this).anInt10100,
		       ((Class470_Sub3) this).anInt10099, fs, i_11_, i_12_,
		       class149.anInt1686 * 427009899, -1231712128));
		i_11_ = 0;
		i_12_ = ((Class470_Sub3) this).anInt10100;
	    }
	} else {
	    ((Class470_Sub3) this).anInt10100 = i;
	    ((Class470_Sub3) this).anInt10099 = i_10_;
	    ((Class470_Sub3) this).aFloat10098 = 1.0F;
	    ((Class470_Sub3) this).aFloat10101 = 1.0F;
	}
	((Class470_Sub3) this).aClass173_Sub1_Sub1_5389.method8526(this);
	if (!bool || i_12_ != 0 || i_11_ != 0) {
	    OpenGL.glPixelStorei(3314, i_12_);
	    OpenGL.glTexImage2Df
		(((Class470_Sub3) this).anInt5395, 0,
		 Class173_Sub1_Sub1.method10357((((Class470_Sub3) this)
						 .aClass149_5398),
						(((Class470_Sub3) this)
						 .aClass169_5397)),
		 i, i_10_, 0,
		 Class173_Sub1_Sub1
		     .method10356(((Class470_Sub3) this).aClass149_5398),
		 5126, fs, i_11_ * 4);
	    OpenGL.glPixelStorei(3314, 0);
	} else
	    method5793(((Class470_Sub3) this).anInt5395, i, i_10_, fs);
    }
    
    public void method212(int i, int i_13_, int i_14_, int i_15_, byte[] is,
			  Class149 class149, int i_16_, int i_17_) {
	((Class470_Sub3) this).aClass173_Sub1_Sub1_5389.method8526(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glPixelStorei(3314, i_17_);
	OpenGL.glTexSubImage2Dub(((Class470_Sub3) this).anInt5395, 0, i, i_13_,
				 i_14_, i_15_,
				 Class173_Sub1_Sub1.method10356(class149),
				 5121, is, i_16_);
	OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    public int method68() {
	return ((Class470_Sub3) this).anInt10099;
    }
    
    public void method236(int i, int i_18_, int i_19_, int i_20_, int[] is,
			  int i_21_) {
	method206(i, i_18_, i_19_, i_20_, is, null, i_21_);
    }
    
    public float method221(float f) {
	return f / (float) ((Class470_Sub3) this).anInt10099;
    }
    
    public float method245() {
	return ((Class470_Sub3) this).aFloat10098;
    }
    
    public float method217() {
	return ((Class470_Sub3) this).aFloat10101;
    }
    
    public boolean method232() {
	return true;
    }
    
    public void method206(int i, int i_22_, int i_23_, int i_24_, int[] is,
			  int[] is_25_, int i_26_) {
	int[] is_27_ = (is_25_ == null
			? new int[(((Class470_Sub3) this).anInt10100
				   * ((Class470_Sub3) this).anInt10099)]
			: is_25_);
	((Class470_Sub3) this).aClass173_Sub1_Sub1_5389.method8526(this);
	OpenGL.glGetTexImagei(((Class470_Sub3) this).anInt5395, 0, 32993, 5121,
			      is_27_, 0);
	for (int i_28_ = 0; i_28_ < i_24_; i_28_++)
	    System.arraycopy(is_27_, i_28_ * ((Class470_Sub3) this).anInt10100,
			     is, i_26_ + i_28_ * i_23_, i_23_);
    }
    
    public void method211(int i, int i_29_, int i_30_, int i_31_, int[] is,
			  int i_32_, int i_33_) {
	((Class470_Sub3) this).aClass173_Sub1_Sub1_5389.method8526(this);
	OpenGL.glPixelStorei(3314, i_33_);
	OpenGL.glTexSubImage2Di(((Class470_Sub3) this).anInt5395, 0, i, i_29_,
				i_30_, i_31_, 32993,
				((Class173_Sub1_Sub1)
				 (((Class470_Sub3) this)
				  .aClass173_Sub1_Sub1_5389)).anInt11294,
				is, i_32_);
	OpenGL.glPixelStorei(3314, 0);
    }
    
    public void method220(boolean bool, boolean bool_34_) {
	((Class470_Sub3) this).aClass173_Sub1_Sub1_5389.method8526(this);
	OpenGL.glTexParameteri(((Class470_Sub3) this).anInt5395, 10242,
			       bool ? 10497 : 33071);
	OpenGL.glTexParameteri(((Class470_Sub3) this).anInt5395, 10243,
			       bool_34_ ? 10497 : 33071);
    }
    
    public void method302(Class340 class340) {
	super.method303(class340);
    }
    
    public float method226(float f) {
	return f / (float) ((Class470_Sub3) this).anInt10100;
    }
    
    public void method216(int i, int i_35_, int i_36_, int i_37_, int i_38_,
			  int i_39_) {
	((Class470_Sub3) this).aClass173_Sub1_Sub1_5389.method8526(this);
	Class163 class163 = ((Class470_Sub3) this).aClass173_Sub1_Sub1_5389
				.method2403((byte) -5);
	if (class163 != null) {
	    int i_40_ = class163.method2070() - (i_39_ + i_37_);
	    int i_41_ = Class173_Sub1_Sub1.method10357((((Class470_Sub3) this)
							.aClass149_5398),
						       (((Class470_Sub3) this)
							.aClass169_5397));
	    OpenGL.glCopyTexImage2D(((Class470_Sub3) this).anInt5395, 0, i_41_,
				    i_38_, i_40_, i_36_, i_37_, 0);
	}
    }
    
    public void method233(int i, int i_42_, int i_43_, int i_44_, int[] is,
			  int i_45_, int i_46_) {
	((Class470_Sub3) this).aClass173_Sub1_Sub1_5389.method8526(this);
	OpenGL.glPixelStorei(3314, i_46_);
	OpenGL.glTexSubImage2Di(((Class470_Sub3) this).anInt5395, 0, i, i_42_,
				i_43_, i_44_, 32993,
				((Class173_Sub1_Sub1)
				 (((Class470_Sub3) this)
				  .aClass173_Sub1_Sub1_5389)).anInt11294,
				is, i_45_);
	OpenGL.glPixelStorei(3314, 0);
    }
    
    public boolean method218() {
	return super.method218();
    }
    
    public void method308() {
	super.method308();
    }
    
    public void method303(Class340 class340) {
	super.method303(class340);
    }
    
    Class470_Sub3(Class173_Sub1_Sub1 class173_sub1_sub1, Class149 class149,
		  int i, int i_47_, boolean bool, byte[] is, int i_48_,
		  int i_49_) {
	super(class173_sub1_sub1, 3553, class149, Class169.aClass169_1935,
	      i * i_47_, bool);
	if (!((Class173_Sub1_Sub1)
	      ((Class470_Sub3) this).aClass173_Sub1_Sub1_5389).aBool11289) {
	    ((Class470_Sub3) this).anInt10100
		= Class327.method4259(i, -2134279851);
	    ((Class470_Sub3) this).anInt10099
		= Class327.method4259(i_47_, -2134279851);
	    ((Class470_Sub3) this).aFloat10098
		= (float) i / (float) ((Class470_Sub3) this).anInt10100;
	    ((Class470_Sub3) this).aFloat10101
		= (float) i_47_ / (float) ((Class470_Sub3) this).anInt10099;
	    if (i != ((Class470_Sub3) this).anInt10100
		|| i_47_ != ((Class470_Sub3) this).anInt10099) {
		is = (((Class470_Sub3) this).aClass173_Sub1_Sub1_5389
			  .method2280
		      (i, i_47_, ((Class470_Sub3) this).anInt10100,
		       ((Class470_Sub3) this).anInt10099, is, i_48_, i_49_,
		       class149.anInt1686 * 427009899, -1999743362));
		i_48_ = 0;
		i_49_ = ((Class470_Sub3) this).anInt10100;
	    }
	} else {
	    ((Class470_Sub3) this).anInt10100 = i;
	    ((Class470_Sub3) this).anInt10099 = i_47_;
	    ((Class470_Sub3) this).aFloat10098 = 1.0F;
	    ((Class470_Sub3) this).aFloat10101 = 1.0F;
	}
	((Class470_Sub3) this).aClass173_Sub1_Sub1_5389.method8526(this);
	OpenGL.glPixelStorei(3317, 1);
	if (!bool || i_49_ != 0 || i_48_ != 0) {
	    OpenGL.glPixelStorei(3314, i_49_);
	    if (((Class470_Sub3) this).aClass149_5398
		== Class149.aClass149_1678)
		OpenGL.glCompressedTexImage2Dub((((Class470_Sub3) this)
						 .anInt5395),
						0, 33777, i, i_47_, 0,
						i * i_47_ / 2, is, i_48_);
	    else if (((Class470_Sub3) this).aClass149_5398
		     == Class149.aClass149_1675)
		OpenGL.glCompressedTexImage2Dub((((Class470_Sub3) this)
						 .anInt5395),
						0, 33779, i, i_47_, 0,
						i * i_47_, is, i_48_);
	    else
		OpenGL.glTexImage2Dub
		    (((Class470_Sub3) this).anInt5395, 0,
		     Class173_Sub1_Sub1.method10357((((Class470_Sub3) this)
						     .aClass149_5398),
						    (((Class470_Sub3) this)
						     .aClass169_5397)),
		     i, i_47_, 0,
		     Class173_Sub1_Sub1
			 .method10356(((Class470_Sub3) this).aClass149_5398),
		     5121, is, i_48_);
	    OpenGL.glPixelStorei(3314, 0);
	} else
	    method5803(((Class470_Sub3) this).anInt5395, i, i_47_, is);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    public Interface19 method320(int i) {
	return new Class477(this, i);
    }
    
    public int method250() {
	return ((Class470_Sub3) this).anInt10100;
    }
    
    public int method215() {
	return ((Class470_Sub3) this).anInt10100;
    }
    
    public void method256(int i, int i_50_, int i_51_, int i_52_, int[] is,
			  int i_53_, int i_54_) {
	((Class470_Sub3) this).aClass173_Sub1_Sub1_5389.method8526(this);
	OpenGL.glPixelStorei(3314, i_54_);
	OpenGL.glTexSubImage2Di(((Class470_Sub3) this).anInt5395, 0, i, i_50_,
				i_51_, i_52_, 32993,
				((Class173_Sub1_Sub1)
				 (((Class470_Sub3) this)
				  .aClass173_Sub1_Sub1_5389)).anInt11294,
				is, i_53_);
	OpenGL.glPixelStorei(3314, 0);
    }
    
    public int method222() {
	return ((Class470_Sub3) this).anInt10100;
    }
    
    public int method223() {
	return ((Class470_Sub3) this).anInt10099;
    }
    
    public int method224() {
	return ((Class470_Sub3) this).anInt10099;
    }
    
    public int method225() {
	return ((Class470_Sub3) this).anInt10099;
    }
    
    public int method1() {
	return ((Class470_Sub3) this).anInt10100;
    }
    
    public float method239() {
	return ((Class470_Sub3) this).aFloat10098;
    }
    
    public float method240() {
	return ((Class470_Sub3) this).aFloat10101;
    }
    
    public void method231(boolean bool, boolean bool_55_) {
	((Class470_Sub3) this).aClass173_Sub1_Sub1_5389.method8526(this);
	OpenGL.glTexParameteri(((Class470_Sub3) this).anInt5395, 10242,
			       bool ? 10497 : 33071);
	OpenGL.glTexParameteri(((Class470_Sub3) this).anInt5395, 10243,
			       bool_55_ ? 10497 : 33071);
    }
    
    public float method213(float f) {
	return f / (float) ((Class470_Sub3) this).anInt10099;
    }
    
    public void method116() {
	super.method115();
    }
    
    public int method246() {
	return ((Class470_Sub3) this).anInt10100;
    }
    
    public void method115() {
	super.method115();
    }
    
    public void method238(int i, int i_56_, int i_57_, int i_58_, int[] is,
			  int i_59_) {
	method206(i, i_56_, i_57_, i_58_, is, null, i_59_);
    }
    
    public void method234(int i, int i_60_, int i_61_, int i_62_, byte[] is,
			  Class149 class149, int i_63_, int i_64_) {
	((Class470_Sub3) this).aClass173_Sub1_Sub1_5389.method8526(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glPixelStorei(3314, i_64_);
	OpenGL.glTexSubImage2Dub(((Class470_Sub3) this).anInt5395, 0, i, i_60_,
				 i_61_, i_62_,
				 Class173_Sub1_Sub1.method10356(class149),
				 5121, is, i_63_);
	OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    public void method235(int i, int i_65_, int i_66_, int i_67_, byte[] is,
			  Class149 class149, int i_68_, int i_69_) {
	((Class470_Sub3) this).aClass173_Sub1_Sub1_5389.method8526(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glPixelStorei(3314, i_69_);
	OpenGL.glTexSubImage2Dub(((Class470_Sub3) this).anInt5395, 0, i, i_65_,
				 i_66_, i_67_,
				 Class173_Sub1_Sub1.method10356(class149),
				 5121, is, i_68_);
	OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    public float method208(float f) {
	return f / (float) ((Class470_Sub3) this).anInt10100;
    }
    
    public float method228(float f) {
	return f / (float) ((Class470_Sub3) this).anInt10099;
    }
    
    public float method207(float f) {
	return f / (float) ((Class470_Sub3) this).anInt10100;
    }
    
    public void method247(int i, int i_70_, int i_71_, int i_72_, int[] is,
			  int[] is_73_, int i_74_) {
	int[] is_75_ = (is_73_ == null
			? new int[(((Class470_Sub3) this).anInt10100
				   * ((Class470_Sub3) this).anInt10099)]
			: is_73_);
	((Class470_Sub3) this).aClass173_Sub1_Sub1_5389.method8526(this);
	OpenGL.glGetTexImagei(((Class470_Sub3) this).anInt5395, 0, 32993, 5121,
			      is_75_, 0);
	for (int i_76_ = 0; i_76_ < i_72_; i_76_++)
	    System.arraycopy(is_75_, i_76_ * ((Class470_Sub3) this).anInt10100,
			     is, i_74_ + i_76_ * i_71_, i_71_);
    }
    
    Class470_Sub3(Class173_Sub1_Sub1 class173_sub1_sub1, Class149 class149,
		  Class169 class169, int i, int i_77_) {
	super(class173_sub1_sub1, 3553, class149, class169, i * i_77_, false);
	if (!((Class173_Sub1_Sub1)
	      ((Class470_Sub3) this).aClass173_Sub1_Sub1_5389).aBool11289) {
	    ((Class470_Sub3) this).anInt10100
		= Class327.method4259(i, -2134279851);
	    ((Class470_Sub3) this).anInt10099
		= Class327.method4259(i_77_, -2134279851);
	    ((Class470_Sub3) this).aFloat10098
		= (float) i / (float) ((Class470_Sub3) this).anInt10100;
	    ((Class470_Sub3) this).aFloat10101
		= (float) i_77_ / (float) ((Class470_Sub3) this).anInt10099;
	} else {
	    ((Class470_Sub3) this).anInt10100 = i;
	    ((Class470_Sub3) this).anInt10099 = i_77_;
	    ((Class470_Sub3) this).aFloat10098 = 1.0F;
	    ((Class470_Sub3) this).aFloat10101 = 1.0F;
	}
	((Class470_Sub3) this).aClass173_Sub1_Sub1_5389.method8526(this);
	OpenGL.glTexImage2Dub
	    (((Class470_Sub3) this).anInt5395, 0,
	     Class173_Sub1_Sub1.method10357((((Class470_Sub3) this)
					     .aClass149_5398),
					    (((Class470_Sub3) this)
					     .aClass169_5397)),
	     i, i_77_, 0,
	     Class173_Sub1_Sub1
		 .method10356(((Class470_Sub3) this).aClass149_5398),
	     Class173_Sub1_Sub1
		 .method10360(((Class470_Sub3) this).aClass169_5397),
	     null, 0);
    }
    
    public void method241(int i, int i_78_, int i_79_, int i_80_, int[] is,
			  int[] is_81_, int i_82_) {
	int[] is_83_ = (is_81_ == null
			? new int[(((Class470_Sub3) this).anInt10100
				   * ((Class470_Sub3) this).anInt10099)]
			: is_81_);
	((Class470_Sub3) this).aClass173_Sub1_Sub1_5389.method8526(this);
	OpenGL.glGetTexImagei(((Class470_Sub3) this).anInt5395, 0, 32993, 5121,
			      is_83_, 0);
	for (int i_84_ = 0; i_84_ < i_80_; i_84_++)
	    System.arraycopy(is_83_, i_84_ * ((Class470_Sub3) this).anInt10100,
			     is, i_82_ + i_84_ * i_79_, i_79_);
    }
    
    public boolean method230() {
	return true;
    }
    
    public void method243(int i, int i_85_, int i_86_, int i_87_, int i_88_,
			  int i_89_) {
	((Class470_Sub3) this).aClass173_Sub1_Sub1_5389.method8526(this);
	Class163 class163 = ((Class470_Sub3) this).aClass173_Sub1_Sub1_5389
				.method2403((byte) -67);
	if (class163 != null) {
	    int i_90_ = class163.method2070() - (i_89_ + i_87_);
	    int i_91_ = Class173_Sub1_Sub1.method10357((((Class470_Sub3) this)
							.aClass149_5398),
						       (((Class470_Sub3) this)
							.aClass169_5397));
	    OpenGL.glCopyTexImage2D(((Class470_Sub3) this).anInt5395, 0, i_91_,
				    i_88_, i_90_, i_86_, i_87_, 0);
	}
    }
    
    public void method244(int i, int i_92_, int i_93_, int i_94_, int i_95_,
			  int i_96_) {
	((Class470_Sub3) this).aClass173_Sub1_Sub1_5389.method8526(this);
	Class163 class163 = ((Class470_Sub3) this).aClass173_Sub1_Sub1_5389
				.method2403((byte) -26);
	if (class163 != null) {
	    int i_97_ = class163.method2070() - (i_96_ + i_94_);
	    int i_98_ = Class173_Sub1_Sub1.method10357((((Class470_Sub3) this)
							.aClass149_5398),
						       (((Class470_Sub3) this)
							.aClass169_5397));
	    OpenGL.glCopyTexImage2D(((Class470_Sub3) this).anInt5395, 0, i_98_,
				    i_95_, i_97_, i_93_, i_94_, 0);
	}
    }
    
    public float method210() {
	return ((Class470_Sub3) this).aFloat10098;
    }
    
    public void method227(int i, int i_99_, int i_100_, int i_101_, int[] is,
			  int[] is_102_, int i_103_) {
	int[] is_104_ = (is_102_ == null
			 ? new int[(((Class470_Sub3) this).anInt10100
				    * ((Class470_Sub3) this).anInt10099)]
			 : is_102_);
	((Class470_Sub3) this).aClass173_Sub1_Sub1_5389.method8526(this);
	OpenGL.glGetTexImagei(((Class470_Sub3) this).anInt5395, 0, 32993, 5121,
			      is_104_, 0);
	for (int i_105_ = 0; i_105_ < i_101_; i_105_++)
	    System.arraycopy(is_104_,
			     i_105_ * ((Class470_Sub3) this).anInt10100, is,
			     i_103_ + i_105_ * i_100_, i_100_);
    }
    
    public float method214() {
	return ((Class470_Sub3) this).aFloat10098;
    }
    
    public boolean method248() {
	return super.method218();
    }
    
    public boolean method249() {
	return super.method218();
    }
    
    public void method307(Class340 class340) {
	super.method303(class340);
    }
    
    public boolean method251() {
	return super.method218();
    }
    
    public boolean method209() {
	return super.method218();
    }
    
    public void method306() {
	super.method308();
    }
    
    public void method305() {
	super.method308();
    }
    
    public boolean method252() {
	return super.method218();
    }
    
    public void method237(int i, int i_106_, int i_107_, int i_108_, int[] is,
			  int i_109_) {
	method206(i, i_106_, i_107_, i_108_, is, null, i_109_);
    }
    
    public void method304(Class340 class340) {
	super.method303(class340);
    }
    
    public Interface19 method321(int i) {
	return new Class477(this, i);
    }
    
    public float method253() {
	return ((Class470_Sub3) this).aFloat10101;
    }
    
    public float method254() {
	return ((Class470_Sub3) this).aFloat10101;
    }
    
    public float method255() {
	return ((Class470_Sub3) this).aFloat10101;
    }
    
    public void method219(int i, int i_110_, int i_111_, int i_112_, int[] is,
			  int i_113_) {
	method206(i, i_110_, i_111_, i_112_, is, null, i_113_);
    }
}
