/* Class120_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class120_Sub4 extends Class120
{
    int anInt8776;
    int anInt8777;
    
    void method8258(int i, int i_0_, int i_1_, int i_2_, byte[] is,
		    Class149 class149, int i_3_, int i_4_, boolean bool) {
	if (i_4_ == 0)
	    i_4_ = i_1_;
	if (bool) {
	    int i_5_ = class149.anInt1686 * 427009899;
	    int i_6_ = i_5_ * i_1_;
	    int i_7_ = i_5_ * i_4_;
	    byte[] is_8_ = new byte[i_6_ * i_2_];
	    for (int i_9_ = 0; i_9_ < i_2_; i_9_++) {
		int i_10_ = i_9_ * i_6_;
		int i_11_ = (i_2_ - i_9_ - 1) * i_7_ + i_3_;
		for (int i_12_ = 0; i_12_ < i_6_; i_12_++)
		    is_8_[i_10_++] = is[i_11_++];
	    }
	    is = is_8_;
	}
	((Class120_Sub4) this).aClass173_Sub2_1491.method8775(this);
	OpenGL.glPixelStorei(3317, 1);
	if (i_4_ != i_1_)
	    OpenGL.glPixelStorei(3314, i_4_);
	OpenGL.glTexSubImage2Dub(((Class120_Sub4) this).anInt1493, 0, i,
				 (((Class120_Sub4) this).anInt8776 - i_0_
				  - i_2_),
				 i_1_, i_2_,
				 Class173_Sub2.method8797(class149), 5121, is,
				 i_3_);
	if (i_4_ != i_1_)
	    OpenGL.glPixelStorei(3314, 0);
	OpenGL.glPixelStorei(3317, 4);
    }
    
    Class120_Sub4(Class173_Sub2 class173_sub2, int i, int i_13_, int i_14_,
		  boolean bool, int[] is, int i_15_, int i_16_,
		  boolean bool_17_) {
	super(class173_sub2, i, Class149.aClass149_1676,
	      Class169.aClass169_1935, i_13_ * i_14_, bool);
	((Class120_Sub4) this).anInt8777 = i_13_;
	((Class120_Sub4) this).anInt8776 = i_14_;
	if (bool_17_) {
	    int[] is_18_ = new int[is.length];
	    for (int i_19_ = 0; i_19_ < i_14_; i_19_++) {
		int i_20_ = i_19_ * i_13_;
		int i_21_ = (i_14_ - i_19_ - 1) * i_13_;
		for (int i_22_ = 0; i_22_ < i_13_; i_22_++)
		    is_18_[i_20_++] = is[i_21_++];
	    }
	    is = is_18_;
	}
	((Class120_Sub4) this).aClass173_Sub2_1491.method8775(this);
	if (((Class120_Sub4) this).anInt1493 == 34037 || !bool || i_15_ != 0
	    || i_16_ != 0) {
	    OpenGL.glPixelStorei(3314, i_15_);
	    OpenGL.glTexImage2Di(((Class120_Sub4) this).anInt1493, 0,
				 (Class173_Sub2.method8798
				  (((Class120_Sub4) this).aClass149_1486,
				   ((Class120_Sub4) this).aClass169_1495)),
				 ((Class120_Sub4) this).anInt8777,
				 ((Class120_Sub4) this).anInt8776, 0, 32993,
				 (((Class173_Sub2)
				   ((Class120_Sub4) this).aClass173_Sub2_1491)
				  .anInt9586),
				 is, i_16_ * 4);
	    OpenGL.glPixelStorei(3314, 0);
	    method1569(false);
	} else {
	    method1552(((Class120_Sub4) this).anInt1493,
		       Class173_Sub2.method8798((((Class120_Sub4) this)
						 .aClass149_1486),
						(((Class120_Sub4) this)
						 .aClass169_1495)),
		       ((Class120_Sub4) this).anInt8777,
		       ((Class120_Sub4) this).anInt8776, 32993,
		       ((Class173_Sub2)
			((Class120_Sub4) this).aClass173_Sub2_1491).anInt9586,
		       is);
	    method1569(true);
	}
	method1545(true);
    }
    
    Class120_Sub4(Class173_Sub2 class173_sub2, int i, Class149 class149,
		  Class169 class169, int i_23_, int i_24_, boolean bool,
		  byte[] is, Class149 class149_25_, boolean bool_26_) {
	super(class173_sub2, i, class149, class169, i_23_ * i_24_, bool);
	((Class120_Sub4) this).anInt8777 = i_23_;
	((Class120_Sub4) this).anInt8776 = i_24_;
	if (bool_26_) {
	    byte[] is_27_ = new byte[is.length];
	    for (int i_28_ = 0; i_28_ < i_24_; i_28_++) {
		int i_29_ = i_28_ * i_23_;
		int i_30_ = (i_24_ - i_28_ - 1) * i_23_;
		for (int i_31_ = 0; i_31_ < i_23_; i_31_++)
		    is_27_[i_29_++] = is[i_30_++];
	    }
	    is = is_27_;
	}
	((Class120_Sub4) this).aClass173_Sub2_1491.method8775(this);
	OpenGL.glPixelStorei(3317, 1);
	if (bool && ((Class120_Sub4) this).anInt1493 != 34037) {
	    method1553(i,
		       Class173_Sub2.method8798((((Class120_Sub4) this)
						 .aClass149_1486),
						(((Class120_Sub4) this)
						 .aClass169_1495)),
		       i_23_, i_24_, class149_25_, is);
	    method1569(true);
	} else {
	    OpenGL.glTexImage2Dub(((Class120_Sub4) this).anInt1493, 0,
				  (Class173_Sub2.method8798
				   (((Class120_Sub4) this).aClass149_1486,
				    ((Class120_Sub4) this).aClass169_1495)),
				  ((Class120_Sub4) this).anInt8777,
				  ((Class120_Sub4) this).anInt8776, 0,
				  Class173_Sub2.method8797(class149_25_), 5121,
				  is, 0);
	    method1569(false);
	}
	OpenGL.glPixelStorei(3317, 4);
	method1545(true);
    }
    
    Class120_Sub4(Class173_Sub2 class173_sub2, int i, Class149 class149,
		  Class169 class169, int i_32_, int i_33_, boolean bool,
		  float[] fs, Class149 class149_34_) {
	super(class173_sub2, i, class149, class169, i_32_ * i_33_, bool);
	((Class120_Sub4) this).anInt8777 = i_32_;
	((Class120_Sub4) this).anInt8776 = i_33_;
	((Class120_Sub4) this).aClass173_Sub2_1491.method8775(this);
	if (bool && ((Class120_Sub4) this).anInt1493 != 34037) {
	    method1554(i,
		       Class173_Sub2.method8798((((Class120_Sub4) this)
						 .aClass149_1486),
						(((Class120_Sub4) this)
						 .aClass169_1495)),
		       i_32_, i_33_, class149_34_, fs);
	    method1569(true);
	} else {
	    OpenGL.glTexImage2Df(((Class120_Sub4) this).anInt1493, 0,
				 (Class173_Sub2.method8798
				  (((Class120_Sub4) this).aClass149_1486,
				   ((Class120_Sub4) this).aClass169_1495)),
				 ((Class120_Sub4) this).anInt8777,
				 ((Class120_Sub4) this).anInt8776, 0,
				 Class173_Sub2.method8797(class149_34_), 5126,
				 fs, 0);
	    method1569(false);
	}
	method1545(true);
    }
    
    void method8259(boolean bool, boolean bool_35_) {
	if (((Class120_Sub4) this).anInt1493 == 3553) {
	    ((Class120_Sub4) this).aClass173_Sub2_1491.method8775(this);
	    OpenGL.glTexParameteri(((Class120_Sub4) this).anInt1493, 10242,
				   bool ? 10497 : 33071);
	    OpenGL.glTexParameteri(((Class120_Sub4) this).anInt1493, 10243,
				   bool_35_ ? 10497 : 33071);
	}
    }
    
    Class120_Sub4(Class173_Sub2 class173_sub2, int i, Class149 class149,
		  Class169 class169, int i_36_, int i_37_) {
	super(class173_sub2, i, class149, class169, i_36_ * i_37_, false);
	((Class120_Sub4) this).anInt8777 = i_36_;
	((Class120_Sub4) this).anInt8776 = i_37_;
	((Class120_Sub4) this).aClass173_Sub2_1491.method8775(this);
	OpenGL.glTexImage2Dub
	    (((Class120_Sub4) this).anInt1493, 0,
	     Class173_Sub2.method8798(((Class120_Sub4) this).aClass149_1486,
				      ((Class120_Sub4) this).aClass169_1495),
	     i_36_, i_37_, 0,
	     Class173_Sub2.method8797(((Class120_Sub4) this).aClass149_1486),
	     5121, null, 0);
	method1545(true);
    }
    
    void method8260(int i, int i_38_, int i_39_, int i_40_, int[] is,
		    int[] is_41_, int i_42_) {
	int[] is_43_ = (is_41_ == null
			? new int[(((Class120_Sub4) this).anInt8777
				   * ((Class120_Sub4) this).anInt8776)]
			: is_41_);
	((Class120_Sub4) this).aClass173_Sub2_1491.method8775(this);
	OpenGL.glGetTexImagei(((Class120_Sub4) this).anInt1493, 0, 32993, 5121,
			      is_43_, 0);
	for (int i_44_ = 0; i_44_ < i_40_; i_44_++)
	    System.arraycopy(is_43_,
			     ((i_38_ + (i_40_ - 1) - i_44_)
			      * ((Class120_Sub4) this).anInt8777),
			     is, i_42_ + i_44_ * i_39_, i_39_);
    }
    
    void method8261(int i, int i_45_, int i_46_, int i_47_, int i_48_,
		    int i_49_) {
	Class163 class163 = ((Class120_Sub4) this).aClass173_Sub2_1491
				.method2403((byte) -42);
	if (class163 != null) {
	    int i_50_ = class163.method2070() - (i_49_ + i_47_);
	    ((Class120_Sub4) this).aClass173_Sub2_1491.method8775(this);
	    OpenGL.glCopyTexSubImage2D(((Class120_Sub4) this).anInt1493, 0, i,
				       (((Class120_Sub4) this).anInt8776
					- (i_45_ + i_47_)),
				       i_48_, i_50_, i_46_, i_47_);
	    OpenGL.glFlush();
	}
    }
    
    Interface21 method8262(int i) {
	return new Class139(this, i);
    }
    
    Interface19 method8263(int i) {
	return new Class139(this, i);
    }
    
    void method8264(int i, int i_51_, int i_52_, int i_53_, int[] is,
		    int i_54_, int i_55_, boolean bool) {
	if (i_55_ == 0)
	    i_55_ = i_52_;
	if (bool) {
	    int[] is_56_ = new int[i_52_ * i_53_];
	    for (int i_57_ = 0; i_57_ < i_53_; i_57_++) {
		int i_58_ = i_57_ * i_52_;
		int i_59_ = (i_53_ - i_57_ - 1) * i_55_ + i_54_;
		for (int i_60_ = 0; i_60_ < i_52_; i_60_++)
		    is_56_[i_58_++] = is[i_59_++];
	    }
	    is = is_56_;
	}
	((Class120_Sub4) this).aClass173_Sub2_1491.method8775(this);
	if (i_52_ != i_55_)
	    OpenGL.glPixelStorei(3314, i_55_);
	OpenGL.glTexSubImage2Di(((Class120_Sub4) this).anInt1493, 0, i,
				(((Class120_Sub4) this).anInt8776 - i_51_
				 - i_53_),
				i_52_, i_53_, 32993,
				(((Class173_Sub2)
				  ((Class120_Sub4) this).aClass173_Sub2_1491)
				 .anInt9586),
				is, i_54_);
	if (i_52_ != i_55_)
	    OpenGL.glPixelStorei(3314, 0);
    }
    
    Class120_Sub4(Class173_Sub2 class173_sub2, int i, int i_61_, int i_62_,
		  int i_63_, int i_64_) {
	super(class173_sub2, i, Class149.aClass149_1684,
	      Class169.aClass169_1935, i_63_ * i_64_, false);
	((Class120_Sub4) this).anInt8777 = i_63_;
	((Class120_Sub4) this).anInt8776 = i_64_;
	((Class120_Sub4) this).aClass173_Sub2_1491.method8775(this);
	Class163 class163 = ((Class120_Sub4) this).aClass173_Sub2_1491
				.method2403((byte) -69);
	if (class163 != null) {
	    int i_65_ = class163.method2070() - (i_62_ + i_64_);
	    int i_66_ = Class173_Sub2.method8798((((Class120_Sub4) this)
						  .aClass149_1486),
						 (((Class120_Sub4) this)
						  .aClass169_1495));
	    OpenGL.glCopyTexImage2D(((Class120_Sub4) this).anInt1493, 0, i_66_,
				    i_61_, i_65_, i_63_, i_64_, 0);
	}
	method1545(true);
    }
}
