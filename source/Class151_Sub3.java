/* Class151_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class151_Sub3 extends Class151
{
    int anInt8927 = 0;
    Class173_Sub2 aClass173_Sub2_8928;
    Class120_Sub4_Sub1 aClass120_Sub4_Sub1_8929;
    int anInt8930;
    boolean aBool8931 = false;
    Class120_Sub4_Sub1 aClass120_Sub4_Sub1_8932;
    int anInt8933;
    int anInt8934;
    int anInt8935;
    
    public void method1765(int[] is) {
	is[0] = ((Class151_Sub3) this).anInt8933;
	is[1] = ((Class151_Sub3) this).anInt8930;
	is[2] = ((Class151_Sub3) this).anInt8935;
	is[3] = ((Class151_Sub3) this).anInt8934;
    }
    
    public int method1768() {
	return (((Class120_Sub4_Sub1)
		 ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932).anInt11215
		+ ((Class151_Sub3) this).anInt8930
		+ ((Class151_Sub3) this).anInt8934);
    }
    
    public void method1787(int i, int i_0_, int i_1_) {
	OpenGL.glPixelTransferf(3348, 0.5F);
	OpenGL.glPixelTransferf(3349, 0.499F);
	OpenGL.glPixelTransferf(3352, 0.5F);
	OpenGL.glPixelTransferf(3353, 0.499F);
	OpenGL.glPixelTransferf(3354, 0.5F);
	OpenGL.glPixelTransferf(3355, 0.499F);
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8929
	    = (Class120_Sub4_Sub1.method10320
	       (((Class151_Sub3) this).aClass173_Sub2_8928, i, i_0_,
		((Class120_Sub4_Sub1)
		 ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932).anInt11216,
		((Class120_Sub4_Sub1)
		 ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932).anInt11215));
	((Class151_Sub3) this).anInt8927 = i_1_;
	OpenGL.glPixelTransferf(3348, 1.0F);
	OpenGL.glPixelTransferf(3349, 0.0F);
	OpenGL.glPixelTransferf(3352, 1.0F);
	OpenGL.glPixelTransferf(3353, 0.0F);
	OpenGL.glPixelTransferf(3354, 1.0F);
	OpenGL.glPixelTransferf(3355, 0.0F);
    }
    
    public void method1780(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932.method1545(false);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8807();
	((Class151_Sub3) this).aClass173_Sub2_8928.method8788(i_5_);
	OpenGL.glColor4ub((byte) (i_4_ >> 16), (byte) (i_4_ >> 8), (byte) i_4_,
			  (byte) (i_4_ >> 24));
	i += ((Class151_Sub3) this).anInt8933;
	i_2_ += ((Class151_Sub3) this).anInt8930;
	if (((Class151_Sub3) this).aClass120_Sub4_Sub1_8929 == null) {
	    ((Class151_Sub3) this).aClass173_Sub2_8928
		.method8775(((Class151_Sub3) this).aClass120_Sub4_Sub1_8932);
	    ((Class151_Sub3) this).aClass173_Sub2_8928.method8776(i_3_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F,
				((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11217);
	    OpenGL.glVertex2i(i, i_2_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i,
			      i_2_ + ((Class120_Sub4_Sub1)
				      (((Class151_Sub3) this)
				       .aClass120_Sub4_Sub1_8932)).anInt11215);
	    OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11218,
				0.0F);
	    OpenGL.glVertex2i(i + ((Class120_Sub4_Sub1)
				   (((Class151_Sub3) this)
				    .aClass120_Sub4_Sub1_8932)).anInt11216,
			      i_2_ + ((Class120_Sub4_Sub1)
				      (((Class151_Sub3) this)
				       .aClass120_Sub4_Sub1_8932)).anInt11215);
	    OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11218,
				((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11217);
	    OpenGL.glVertex2i(i + ((Class120_Sub4_Sub1)
				   (((Class151_Sub3) this)
				    .aClass120_Sub4_Sub1_8932)).anInt11216,
			      i_2_);
	    OpenGL.glEnd();
	} else {
	    method8327(i_3_);
	    ((Class151_Sub3) this).aClass120_Sub4_Sub1_8929.method1545(false);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     (((Class120_Sub4_Sub1)
				       (((Class151_Sub3) this)
					.aClass120_Sub4_Sub1_8932))
				      .aFloat11217));
	    OpenGL.glTexCoord2f(0.0F,
				((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11217);
	    OpenGL.glVertex2i(i, i_2_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i,
			      i_2_ + ((Class120_Sub4_Sub1)
				      (((Class151_Sub3) this)
				       .aClass120_Sub4_Sub1_8932)).anInt11215);
	    OpenGL.glMultiTexCoord2f(33985,
				     ((Class120_Sub4_Sub1)
				      (((Class151_Sub3) this)
				       .aClass120_Sub4_Sub1_8932)).aFloat11218,
				     0.0F);
	    OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11218,
				0.0F);
	    OpenGL.glVertex2i(i + ((Class120_Sub4_Sub1)
				   (((Class151_Sub3) this)
				    .aClass120_Sub4_Sub1_8932)).anInt11216,
			      i_2_ + ((Class120_Sub4_Sub1)
				      (((Class151_Sub3) this)
				       .aClass120_Sub4_Sub1_8932)).anInt11215);
	    OpenGL.glMultiTexCoord2f(33985,
				     ((Class120_Sub4_Sub1)
				      (((Class151_Sub3) this)
				       .aClass120_Sub4_Sub1_8932)).aFloat11218,
				     (((Class120_Sub4_Sub1)
				       (((Class151_Sub3) this)
					.aClass120_Sub4_Sub1_8932))
				      .aFloat11217));
	    OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11218,
				((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11217);
	    OpenGL.glVertex2i(i + ((Class120_Sub4_Sub1)
				   (((Class151_Sub3) this)
				    .aClass120_Sub4_Sub1_8932)).anInt11216,
			      i_2_);
	    OpenGL.glEnd();
	    method8328();
	}
    }
    
    Class151_Sub3(Class173_Sub2 class173_sub2, int i, int i_6_, int[] is,
		  int i_7_, int i_8_) {
	((Class151_Sub3) this).anInt8930 = 0;
	((Class151_Sub3) this).anInt8933 = 0;
	((Class151_Sub3) this).anInt8934 = 0;
	((Class151_Sub3) this).anInt8935 = 0;
	((Class151_Sub3) this).aClass173_Sub2_8928 = class173_sub2;
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932
	    = Class120_Sub4_Sub1.method10319(class173_sub2, i, i_6_, false, is,
					     i_8_, i_7_);
    }
    
    public int method1766() {
	return (((Class120_Sub4_Sub1)
		 ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
		.anInt11216);
    }
    
    public int method40() {
	return (((Class120_Sub4_Sub1)
		 ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932).anInt11216
		+ ((Class151_Sub3) this).anInt8933
		+ ((Class151_Sub3) this).anInt8935);
    }
    
    public int method1767() {
	return (((Class120_Sub4_Sub1)
		 ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
		.anInt11215);
    }
    
    void method1797(int i, int i_9_, int i_10_, int i_11_, int i_12_,
		    int i_13_, int i_14_, int i_15_) {
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932
	    .method1545((i_15_ & 0x1) != 0);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8807();
	((Class151_Sub3) this).aClass173_Sub2_8928.method8788(i_14_);
	OpenGL.glColor4ub((byte) (i_13_ >> 16), (byte) (i_13_ >> 8),
			  (byte) i_13_, (byte) (i_13_ >> 24));
	if (((Class151_Sub3) this).aBool8931) {
	    float f = (float) i_10_ / (float) method40();
	    float f_16_ = (float) i_11_ / (float) method1768();
	    float f_17_
		= (float) i + (float) ((Class151_Sub3) this).anInt8933 * f;
	    float f_18_ = ((float) i_9_
			   + (float) ((Class151_Sub3) this).anInt8930 * f_16_);
	    float f_19_
		= (f_17_
		   + (float) (((Class120_Sub4_Sub1)
			       ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			      .anInt11216) * f);
	    float f_20_
		= (f_18_
		   + (float) (((Class120_Sub4_Sub1)
			       ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			      .anInt11215) * f_16_);
	    if (((Class151_Sub3) this).aClass120_Sub4_Sub1_8929 == null) {
		((Class151_Sub3) this).aClass173_Sub2_8928.method8775
		    (((Class151_Sub3) this).aClass120_Sub4_Sub1_8932);
		((Class151_Sub3) this).aClass173_Sub2_8928.method8776(i_12_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F,
				    ((Class120_Sub4_Sub1)
				     (((Class151_Sub3) this)
				      .aClass120_Sub4_Sub1_8932)).aFloat11217);
		OpenGL.glVertex2f(f_17_, f_18_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_17_, f_20_);
		OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				     (((Class151_Sub3) this)
				      .aClass120_Sub4_Sub1_8932)).aFloat11218,
				    0.0F);
		OpenGL.glVertex2f(f_19_, f_20_);
		OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				     (((Class151_Sub3) this)
				      .aClass120_Sub4_Sub1_8932)).aFloat11218,
				    ((Class120_Sub4_Sub1)
				     (((Class151_Sub3) this)
				      .aClass120_Sub4_Sub1_8932)).aFloat11217);
		OpenGL.glVertex2f(f_19_, f_18_);
		OpenGL.glEnd();
	    } else {
		method8327(i_12_);
		((Class151_Sub3) this).aClass120_Sub4_Sub1_8929
		    .method1545(true);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F,
					 (((Class120_Sub4_Sub1)
					   (((Class151_Sub3) this)
					    .aClass120_Sub4_Sub1_8932))
					  .aFloat11217));
		OpenGL.glTexCoord2f(0.0F,
				    ((Class120_Sub4_Sub1)
				     (((Class151_Sub3) this)
				      .aClass120_Sub4_Sub1_8932)).aFloat11217);
		OpenGL.glVertex2f(f_17_, f_18_);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_17_, f_20_);
		OpenGL.glMultiTexCoord2f(33985, (((Class120_Sub4_Sub1)
						  (((Class151_Sub3) this)
						   .aClass120_Sub4_Sub1_8932))
						 .aFloat11218), 0.0F);
		OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				     (((Class151_Sub3) this)
				      .aClass120_Sub4_Sub1_8932)).aFloat11218,
				    0.0F);
		OpenGL.glVertex2f(f_19_, f_20_);
		OpenGL.glMultiTexCoord2f(33985,
					 (((Class120_Sub4_Sub1)
					   (((Class151_Sub3) this)
					    .aClass120_Sub4_Sub1_8932))
					  .aFloat11218),
					 (((Class120_Sub4_Sub1)
					   (((Class151_Sub3) this)
					    .aClass120_Sub4_Sub1_8932))
					  .aFloat11217));
		OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				     (((Class151_Sub3) this)
				      .aClass120_Sub4_Sub1_8932)).aFloat11218,
				    ((Class120_Sub4_Sub1)
				     (((Class151_Sub3) this)
				      .aClass120_Sub4_Sub1_8932)).aFloat11217);
		OpenGL.glVertex2f(f_19_, f_18_);
		OpenGL.glEnd();
		method8328();
	    }
	} else if (((Class151_Sub3) this).aClass120_Sub4_Sub1_8929 == null) {
	    ((Class151_Sub3) this).aClass173_Sub2_8928
		.method8775(((Class151_Sub3) this).aClass120_Sub4_Sub1_8932);
	    ((Class151_Sub3) this).aClass173_Sub2_8928.method8776(i_12_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F,
				((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11217);
	    OpenGL.glVertex2i(i, i_9_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_9_ + i_11_);
	    OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11218,
				0.0F);
	    OpenGL.glVertex2i(i + i_10_, i_9_ + i_11_);
	    OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11218,
				((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11217);
	    OpenGL.glVertex2i(i + i_10_, i_9_);
	    OpenGL.glEnd();
	} else {
	    method8327(i_12_);
	    ((Class151_Sub3) this).aClass120_Sub4_Sub1_8929.method1545(true);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     (((Class120_Sub4_Sub1)
				       (((Class151_Sub3) this)
					.aClass120_Sub4_Sub1_8932))
				      .aFloat11217));
	    OpenGL.glTexCoord2f(0.0F,
				((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11217);
	    OpenGL.glVertex2i(i, i_9_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_9_ + i_11_);
	    OpenGL.glMultiTexCoord2f(33985,
				     ((Class120_Sub4_Sub1)
				      (((Class151_Sub3) this)
				       .aClass120_Sub4_Sub1_8932)).aFloat11218,
				     0.0F);
	    OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11218,
				0.0F);
	    OpenGL.glVertex2i(i + i_10_, i_9_ + i_11_);
	    OpenGL.glMultiTexCoord2f(33985,
				     ((Class120_Sub4_Sub1)
				      (((Class151_Sub3) this)
				       .aClass120_Sub4_Sub1_8932)).aFloat11218,
				     (((Class120_Sub4_Sub1)
				       (((Class151_Sub3) this)
					.aClass120_Sub4_Sub1_8932))
				      .aFloat11217));
	    OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11218,
				((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11217);
	    OpenGL.glVertex2i(i + i_10_, i_9_);
	    OpenGL.glEnd();
	    method8328();
	}
    }
    
    public void method1788(int i, int i_21_, int i_22_, int i_23_, int[] is,
			   int i_24_, int i_25_) {
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932
	    .method8264(i, i_21_, i_22_, i_23_, is, i_24_, i_25_, true);
    }
    
    public void method1803(int i, int i_26_, int i_27_, int i_28_, int i_29_) {
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932.method1545(false);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8807();
	((Class151_Sub3) this).aClass173_Sub2_8928.method8788(i_29_);
	OpenGL.glColor4ub((byte) (i_28_ >> 16), (byte) (i_28_ >> 8),
			  (byte) i_28_, (byte) (i_28_ >> 24));
	i += ((Class151_Sub3) this).anInt8933;
	i_26_ += ((Class151_Sub3) this).anInt8930;
	if (((Class151_Sub3) this).aClass120_Sub4_Sub1_8929 == null) {
	    ((Class151_Sub3) this).aClass173_Sub2_8928
		.method8775(((Class151_Sub3) this).aClass120_Sub4_Sub1_8932);
	    ((Class151_Sub3) this).aClass173_Sub2_8928.method8776(i_27_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F,
				((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11217);
	    OpenGL.glVertex2i(i, i_26_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_26_ + (((Class120_Sub4_Sub1)
					   (((Class151_Sub3) this)
					    .aClass120_Sub4_Sub1_8932))
					  .anInt11215));
	    OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11218,
				0.0F);
	    OpenGL.glVertex2i(i + ((Class120_Sub4_Sub1)
				   (((Class151_Sub3) this)
				    .aClass120_Sub4_Sub1_8932)).anInt11216,
			      i_26_ + (((Class120_Sub4_Sub1)
					(((Class151_Sub3) this)
					 .aClass120_Sub4_Sub1_8932))
				       .anInt11215));
	    OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11218,
				((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11217);
	    OpenGL.glVertex2i(i + ((Class120_Sub4_Sub1)
				   (((Class151_Sub3) this)
				    .aClass120_Sub4_Sub1_8932)).anInt11216,
			      i_26_);
	    OpenGL.glEnd();
	} else {
	    method8327(i_27_);
	    ((Class151_Sub3) this).aClass120_Sub4_Sub1_8929.method1545(false);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     (((Class120_Sub4_Sub1)
				       (((Class151_Sub3) this)
					.aClass120_Sub4_Sub1_8932))
				      .aFloat11217));
	    OpenGL.glTexCoord2f(0.0F,
				((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11217);
	    OpenGL.glVertex2i(i, i_26_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_26_ + (((Class120_Sub4_Sub1)
					   (((Class151_Sub3) this)
					    .aClass120_Sub4_Sub1_8932))
					  .anInt11215));
	    OpenGL.glMultiTexCoord2f(33985,
				     ((Class120_Sub4_Sub1)
				      (((Class151_Sub3) this)
				       .aClass120_Sub4_Sub1_8932)).aFloat11218,
				     0.0F);
	    OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11218,
				0.0F);
	    OpenGL.glVertex2i(i + ((Class120_Sub4_Sub1)
				   (((Class151_Sub3) this)
				    .aClass120_Sub4_Sub1_8932)).anInt11216,
			      i_26_ + (((Class120_Sub4_Sub1)
					(((Class151_Sub3) this)
					 .aClass120_Sub4_Sub1_8932))
				       .anInt11215));
	    OpenGL.glMultiTexCoord2f(33985,
				     ((Class120_Sub4_Sub1)
				      (((Class151_Sub3) this)
				       .aClass120_Sub4_Sub1_8932)).aFloat11218,
				     (((Class120_Sub4_Sub1)
				       (((Class151_Sub3) this)
					.aClass120_Sub4_Sub1_8932))
				      .aFloat11217));
	    OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11218,
				((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11217);
	    OpenGL.glVertex2i(i + ((Class120_Sub4_Sub1)
				   (((Class151_Sub3) this)
				    .aClass120_Sub4_Sub1_8932)).anInt11216,
			      i_26_);
	    OpenGL.glEnd();
	    method8328();
	}
    }
    
    void method8326(int i, int i_30_, int i_31_, int i_32_, int i_33_,
		    int i_34_, boolean bool) {
	if ((((Class173_Sub2) ((Class151_Sub3) this).aClass173_Sub2_8928)
	     .aBool9562)
	    && !bool) {
	    int[] is = ((Class151_Sub3) this).aClass173_Sub2_8928
			   .method2208(i_33_, i_34_, i_31_, i_32_);
	    if (is != null) {
		for (int i_35_ = 0; i_35_ < is.length; i_35_++)
		    is[i_35_] |= ~0xffffff;
		method1770(i, i_30_, i_31_, i_32_, is, 0, i_31_);
	    }
	} else
	    ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932
		.method8261(i, i_30_, i_31_, i_32_, i_33_, i_34_);
    }
    
    public void method1792(int i, int i_36_, int i_37_, int i_38_, int[] is,
			   int i_39_, int i_40_) {
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932
	    .method8264(i, i_36_, i_37_, i_38_, is, i_39_, i_40_, true);
    }
    
    public void method1784(int i, int i_41_, int i_42_, int i_43_, int i_44_,
			   int i_45_) {
	method8326(i, i_41_, i_42_, i_43_, i_44_, i_45_, false);
    }
    
    public void method1771(int i, int i_46_, int i_47_, int i_48_, int[] is,
			   int[] is_49_, int i_50_, int i_51_) {
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932
	    .method8260(i, i_46_, i_47_, i_48_, is, is_49_, i_50_);
    }
    
    void method8327(int i) {
	((Class151_Sub3) this).aClass173_Sub2_8928.method8774(1);
	((Class151_Sub3) this).aClass173_Sub2_8928
	    .method8775(((Class151_Sub3) this).aClass120_Sub4_Sub1_8932);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8754
	    (((Class151_Sub3) this).aClass173_Sub2_8928.method8874(i), 7681);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8778(1, 34167, 768);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8808(0, 34168, 770);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8774(0);
	((Class151_Sub3) this).aClass173_Sub2_8928
	    .method8775(((Class151_Sub3) this).aClass120_Sub4_Sub1_8929);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8754(34479, 7681);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8778(1, 34166, 768);
	if (((Class151_Sub3) this).anInt8927 == 0)
	    ((Class151_Sub3) this).aClass173_Sub2_8928.method8780(1.0F, 0.5F,
								  0.5F, 0.0F);
	else if (((Class151_Sub3) this).anInt8927 == 1)
	    ((Class151_Sub3) this).aClass173_Sub2_8928.method8780(0.5F, 1.0F,
								  0.5F, 0.0F);
	else if (((Class151_Sub3) this).anInt8927 == 2)
	    ((Class151_Sub3) this).aClass173_Sub2_8928.method8780(0.5F, 0.5F,
								  1.0F, 0.0F);
	else if (((Class151_Sub3) this).anInt8927 == 3)
	    ((Class151_Sub3) this).aClass173_Sub2_8928
		.method8780(128.5F, 128.5F, 128.5F, 0.0F);
    }
    
    void method8328() {
	((Class151_Sub3) this).aClass173_Sub2_8928.method8774(1);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8775(null);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8754(8448, 8448);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8778(1, 34168, 768);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8808(0, 5890, 770);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8774(0);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8778(1, 34168, 768);
    }
    
    public Interface19 method1769() {
	return ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932.method8263(0);
    }
    
    public void method1775(int i, int i_52_, Class148 class148, int i_53_,
			   int i_54_) {
	Class148_Sub3 class148_sub3 = (Class148_Sub3) class148;
	Class120_Sub4_Sub1 class120_sub4_sub1
	    = ((Class148_Sub3) class148_sub3).aClass120_Sub4_Sub1_8920;
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932.method1545(false);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8807();
	((Class151_Sub3) this).aClass173_Sub2_8928
	    .method8775(((Class151_Sub3) this).aClass120_Sub4_Sub1_8932);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8776(1);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8774(1);
	((Class151_Sub3) this).aClass173_Sub2_8928
	    .method8775(class120_sub4_sub1);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8754(7681, 8448);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8778(0, 34168, 768);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8788(1);
	i += ((Class151_Sub3) this).anInt8933;
	i_52_ += ((Class151_Sub3) this).anInt8930;
	int i_55_
	    = i + ((Class120_Sub4_Sub1)
		   ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932).anInt11216;
	int i_56_ = i_52_ + (((Class120_Sub4_Sub1)
			      ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			     .anInt11215);
	float f
	    = (((Class120_Sub4_Sub1) class120_sub4_sub1).aFloat11218
	       / (float) ((Class120_Sub4_Sub1) class120_sub4_sub1).anInt11216);
	float f_57_
	    = (((Class120_Sub4_Sub1) class120_sub4_sub1).aFloat11217
	       / (float) ((Class120_Sub4_Sub1) class120_sub4_sub1).anInt11215);
	float f_58_ = (float) (i - i_53_) * f;
	float f_59_ = (float) (i_55_ - i_53_) * f;
	float f_60_ = (((Class120_Sub4_Sub1) class120_sub4_sub1).aFloat11217
		       - (float) (i_52_ - i_54_) * f_57_);
	float f_61_ = (((Class120_Sub4_Sub1) class120_sub4_sub1).aFloat11217
		       - (float) (i_56_ - i_54_) * f_57_);
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F,
				 ((Class120_Sub4_Sub1)
				  (((Class151_Sub3) this)
				   .aClass120_Sub4_Sub1_8932)).aFloat11217);
	OpenGL.glMultiTexCoord2f(33985, f_58_, f_60_);
	OpenGL.glVertex2i(i, i_52_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_58_, f_61_);
	OpenGL.glVertex2i(i, i_52_ + ((Class120_Sub4_Sub1)
				      (((Class151_Sub3) this)
				       .aClass120_Sub4_Sub1_8932)).anInt11215);
	OpenGL.glMultiTexCoord2f(33984,
				 ((Class120_Sub4_Sub1)
				  (((Class151_Sub3) this)
				   .aClass120_Sub4_Sub1_8932)).aFloat11218,
				 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_59_, f_61_);
	OpenGL.glVertex2i(i + ((Class120_Sub4_Sub1)
			       (((Class151_Sub3) this)
				.aClass120_Sub4_Sub1_8932)).anInt11216,
			  i_52_ + ((Class120_Sub4_Sub1)
				   (((Class151_Sub3) this)
				    .aClass120_Sub4_Sub1_8932)).anInt11215);
	OpenGL.glMultiTexCoord2f(33984,
				 ((Class120_Sub4_Sub1)
				  (((Class151_Sub3) this)
				   .aClass120_Sub4_Sub1_8932)).aFloat11218,
				 ((Class120_Sub4_Sub1)
				  (((Class151_Sub3) this)
				   .aClass120_Sub4_Sub1_8932)).aFloat11217);
	OpenGL.glMultiTexCoord2f(33985, f_59_, f_60_);
	OpenGL.glVertex2i(i + ((Class120_Sub4_Sub1)
			       (((Class151_Sub3) this)
				.aClass120_Sub4_Sub1_8932)).anInt11216,
			  i_52_);
	OpenGL.glEnd();
	((Class151_Sub3) this).aClass173_Sub2_8928.method8778(0, 5890, 768);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8776(0);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8775(null);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8774(0);
    }
    
    public void method1763(int i, int i_62_, int i_63_, int i_64_) {
	((Class151_Sub3) this).anInt8933 = i;
	((Class151_Sub3) this).anInt8930 = i_62_;
	((Class151_Sub3) this).anInt8935 = i_63_;
	((Class151_Sub3) this).anInt8934 = i_64_;
	((Class151_Sub3) this).aBool8931
	    = (((Class151_Sub3) this).anInt8933 != 0
	       || ((Class151_Sub3) this).anInt8930 != 0
	       || ((Class151_Sub3) this).anInt8935 != 0
	       || ((Class151_Sub3) this).anInt8934 != 0);
    }
    
    void method1777(int i, int i_65_, int i_66_, int i_67_, int i_68_,
		    int i_69_, int i_70_, int i_71_) {
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932
	    .method1545((i_71_ & 0x1) != 0);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8807();
	((Class151_Sub3) this).aClass173_Sub2_8928.method8788(i_70_);
	OpenGL.glColor4ub((byte) (i_69_ >> 16), (byte) (i_69_ >> 8),
			  (byte) i_69_, (byte) (i_69_ >> 24));
	if (((Class151_Sub3) this).aBool8931) {
	    float f = (float) i_66_ / (float) method40();
	    float f_72_ = (float) i_67_ / (float) method1768();
	    float f_73_
		= (float) i + (float) ((Class151_Sub3) this).anInt8933 * f;
	    float f_74_ = ((float) i_65_
			   + (float) ((Class151_Sub3) this).anInt8930 * f_72_);
	    float f_75_
		= (f_73_
		   + (float) (((Class120_Sub4_Sub1)
			       ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			      .anInt11216) * f);
	    float f_76_
		= (f_74_
		   + (float) (((Class120_Sub4_Sub1)
			       ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			      .anInt11215) * f_72_);
	    if (((Class151_Sub3) this).aClass120_Sub4_Sub1_8929 == null) {
		((Class151_Sub3) this).aClass173_Sub2_8928.method8775
		    (((Class151_Sub3) this).aClass120_Sub4_Sub1_8932);
		((Class151_Sub3) this).aClass173_Sub2_8928.method8776(i_68_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F,
				    ((Class120_Sub4_Sub1)
				     (((Class151_Sub3) this)
				      .aClass120_Sub4_Sub1_8932)).aFloat11217);
		OpenGL.glVertex2f(f_73_, f_74_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_73_, f_76_);
		OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				     (((Class151_Sub3) this)
				      .aClass120_Sub4_Sub1_8932)).aFloat11218,
				    0.0F);
		OpenGL.glVertex2f(f_75_, f_76_);
		OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				     (((Class151_Sub3) this)
				      .aClass120_Sub4_Sub1_8932)).aFloat11218,
				    ((Class120_Sub4_Sub1)
				     (((Class151_Sub3) this)
				      .aClass120_Sub4_Sub1_8932)).aFloat11217);
		OpenGL.glVertex2f(f_75_, f_74_);
		OpenGL.glEnd();
	    } else {
		method8327(i_68_);
		((Class151_Sub3) this).aClass120_Sub4_Sub1_8929
		    .method1545(true);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F,
					 (((Class120_Sub4_Sub1)
					   (((Class151_Sub3) this)
					    .aClass120_Sub4_Sub1_8932))
					  .aFloat11217));
		OpenGL.glTexCoord2f(0.0F,
				    ((Class120_Sub4_Sub1)
				     (((Class151_Sub3) this)
				      .aClass120_Sub4_Sub1_8932)).aFloat11217);
		OpenGL.glVertex2f(f_73_, f_74_);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_73_, f_76_);
		OpenGL.glMultiTexCoord2f(33985, (((Class120_Sub4_Sub1)
						  (((Class151_Sub3) this)
						   .aClass120_Sub4_Sub1_8932))
						 .aFloat11218), 0.0F);
		OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				     (((Class151_Sub3) this)
				      .aClass120_Sub4_Sub1_8932)).aFloat11218,
				    0.0F);
		OpenGL.glVertex2f(f_75_, f_76_);
		OpenGL.glMultiTexCoord2f(33985,
					 (((Class120_Sub4_Sub1)
					   (((Class151_Sub3) this)
					    .aClass120_Sub4_Sub1_8932))
					  .aFloat11218),
					 (((Class120_Sub4_Sub1)
					   (((Class151_Sub3) this)
					    .aClass120_Sub4_Sub1_8932))
					  .aFloat11217));
		OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				     (((Class151_Sub3) this)
				      .aClass120_Sub4_Sub1_8932)).aFloat11218,
				    ((Class120_Sub4_Sub1)
				     (((Class151_Sub3) this)
				      .aClass120_Sub4_Sub1_8932)).aFloat11217);
		OpenGL.glVertex2f(f_75_, f_74_);
		OpenGL.glEnd();
		method8328();
	    }
	} else if (((Class151_Sub3) this).aClass120_Sub4_Sub1_8929 == null) {
	    ((Class151_Sub3) this).aClass173_Sub2_8928
		.method8775(((Class151_Sub3) this).aClass120_Sub4_Sub1_8932);
	    ((Class151_Sub3) this).aClass173_Sub2_8928.method8776(i_68_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F,
				((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11217);
	    OpenGL.glVertex2i(i, i_65_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_65_ + i_67_);
	    OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11218,
				0.0F);
	    OpenGL.glVertex2i(i + i_66_, i_65_ + i_67_);
	    OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11218,
				((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11217);
	    OpenGL.glVertex2i(i + i_66_, i_65_);
	    OpenGL.glEnd();
	} else {
	    method8327(i_68_);
	    ((Class151_Sub3) this).aClass120_Sub4_Sub1_8929.method1545(true);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     (((Class120_Sub4_Sub1)
				       (((Class151_Sub3) this)
					.aClass120_Sub4_Sub1_8932))
				      .aFloat11217));
	    OpenGL.glTexCoord2f(0.0F,
				((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11217);
	    OpenGL.glVertex2i(i, i_65_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_65_ + i_67_);
	    OpenGL.glMultiTexCoord2f(33985,
				     ((Class120_Sub4_Sub1)
				      (((Class151_Sub3) this)
				       .aClass120_Sub4_Sub1_8932)).aFloat11218,
				     0.0F);
	    OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11218,
				0.0F);
	    OpenGL.glVertex2i(i + i_66_, i_65_ + i_67_);
	    OpenGL.glMultiTexCoord2f(33985,
				     ((Class120_Sub4_Sub1)
				      (((Class151_Sub3) this)
				       .aClass120_Sub4_Sub1_8932)).aFloat11218,
				     (((Class120_Sub4_Sub1)
				       (((Class151_Sub3) this)
					.aClass120_Sub4_Sub1_8932))
				      .aFloat11217));
	    OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11218,
				((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11217);
	    OpenGL.glVertex2i(i + i_66_, i_65_);
	    OpenGL.glEnd();
	    method8328();
	}
    }
    
    void method1785(float f, float f_77_, float f_78_, float f_79_,
		    float f_80_, float f_81_, int i, int i_82_, int i_83_,
		    int i_84_) {
	if (((Class151_Sub3) this).aBool8931) {
	    float f_85_ = (float) method40();
	    float f_86_ = (float) method1768();
	    float f_87_ = (f_78_ - f) / f_85_;
	    float f_88_ = (f_79_ - f_77_) / f_85_;
	    float f_89_ = (f_80_ - f) / f_86_;
	    float f_90_ = (f_81_ - f_77_) / f_86_;
	    float f_91_ = f_89_ * (float) ((Class151_Sub3) this).anInt8930;
	    float f_92_ = f_90_ * (float) ((Class151_Sub3) this).anInt8930;
	    float f_93_ = f_87_ * (float) ((Class151_Sub3) this).anInt8933;
	    float f_94_ = f_88_ * (float) ((Class151_Sub3) this).anInt8933;
	    float f_95_ = -f_87_ * (float) ((Class151_Sub3) this).anInt8935;
	    float f_96_ = -f_88_ * (float) ((Class151_Sub3) this).anInt8935;
	    float f_97_ = -f_89_ * (float) ((Class151_Sub3) this).anInt8934;
	    float f_98_ = -f_90_ * (float) ((Class151_Sub3) this).anInt8934;
	    f = f + f_93_ + f_91_;
	    f_77_ = f_77_ + f_94_ + f_92_;
	    f_78_ = f_78_ + f_95_ + f_91_;
	    f_79_ = f_79_ + f_96_ + f_92_;
	    f_80_ = f_80_ + f_93_ + f_97_;
	    f_81_ = f_81_ + f_94_ + f_98_;
	}
	float f_99_ = f_80_ + (f_78_ - f);
	float f_100_ = f_79_ + (f_81_ - f_77_);
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932
	    .method1545((i_84_ & 0x1) != 0);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8807();
	((Class151_Sub3) this).aClass173_Sub2_8928
	    .method8775(((Class151_Sub3) this).aClass120_Sub4_Sub1_8932);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8788(i_83_);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8776(i);
	OpenGL.glColor4ub((byte) (i_82_ >> 16), (byte) (i_82_ >> 8),
			  (byte) i_82_, (byte) (i_82_ >> 24));
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F,
			    (((Class120_Sub4_Sub1)
			      ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			     .aFloat11217));
	OpenGL.glVertex2f(f, f_77_);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2f(f_80_, f_81_);
	OpenGL.glTexCoord2f((((Class120_Sub4_Sub1)
			      ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			     .aFloat11218),
			    0.0F);
	OpenGL.glVertex2f(f_99_, f_100_);
	OpenGL.glTexCoord2f((((Class120_Sub4_Sub1)
			      ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			     .aFloat11218),
			    (((Class120_Sub4_Sub1)
			      ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			     .aFloat11217));
	OpenGL.glVertex2f(f_78_, f_79_);
	OpenGL.glEnd();
    }
    
    void method1764(float f, float f_101_, float f_102_, float f_103_,
		    float f_104_, float f_105_, int i, Class148 class148,
		    int i_106_, int i_107_) {
	Class120_Sub4_Sub1 class120_sub4_sub1
	    = (((Class148_Sub3) (Class148_Sub3) class148)
	       .aClass120_Sub4_Sub1_8920);
	if (((Class151_Sub3) this).aBool8931) {
	    float f_108_ = (float) method40();
	    float f_109_ = (float) method1768();
	    float f_110_ = (f_102_ - f) / f_108_;
	    float f_111_ = (f_103_ - f_101_) / f_108_;
	    float f_112_ = (f_104_ - f) / f_109_;
	    float f_113_ = (f_105_ - f_101_) / f_109_;
	    float f_114_ = f_112_ * (float) ((Class151_Sub3) this).anInt8930;
	    float f_115_ = f_113_ * (float) ((Class151_Sub3) this).anInt8930;
	    float f_116_ = f_110_ * (float) ((Class151_Sub3) this).anInt8933;
	    float f_117_ = f_111_ * (float) ((Class151_Sub3) this).anInt8933;
	    float f_118_ = -f_110_ * (float) ((Class151_Sub3) this).anInt8935;
	    float f_119_ = -f_111_ * (float) ((Class151_Sub3) this).anInt8935;
	    float f_120_ = -f_112_ * (float) ((Class151_Sub3) this).anInt8934;
	    float f_121_ = -f_113_ * (float) ((Class151_Sub3) this).anInt8934;
	    f = f + f_116_ + f_114_;
	    f_101_ = f_101_ + f_117_ + f_115_;
	    f_102_ = f_102_ + f_118_ + f_114_;
	    f_103_ = f_103_ + f_119_ + f_115_;
	    f_104_ = f_104_ + f_116_ + f_120_;
	    f_105_ = f_105_ + f_117_ + f_121_;
	}
	float f_122_ = f_104_ + (f_102_ - f);
	float f_123_ = f_103_ + (f_105_ - f_101_);
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932
	    .method1545((i & 0x1) != 0);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8807();
	((Class151_Sub3) this).aClass173_Sub2_8928
	    .method8775(((Class151_Sub3) this).aClass120_Sub4_Sub1_8932);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8776(1);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8774(1);
	((Class151_Sub3) this).aClass173_Sub2_8928
	    .method8775(class120_sub4_sub1);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8754(7681, 8448);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8778(0, 34168, 768);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8788(1);
	float f_124_
	    = (((Class120_Sub4_Sub1) class120_sub4_sub1).aFloat11218
	       / (float) ((Class120_Sub4_Sub1) class120_sub4_sub1).anInt11216);
	float f_125_
	    = (((Class120_Sub4_Sub1) class120_sub4_sub1).aFloat11217
	       / (float) ((Class120_Sub4_Sub1) class120_sub4_sub1).anInt11215);
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F,
				 ((Class120_Sub4_Sub1)
				  (((Class151_Sub3) this)
				   .aClass120_Sub4_Sub1_8932)).aFloat11217);
	OpenGL.glMultiTexCoord2f(33985, f_124_ * (f - (float) i_106_),
				 ((((Class120_Sub4_Sub1) class120_sub4_sub1)
				   .aFloat11217)
				  - f_125_ * (f_101_ - (float) i_107_)));
	OpenGL.glVertex2f(f, f_101_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_124_ * (f_104_ - (float) i_106_),
				 ((((Class120_Sub4_Sub1) class120_sub4_sub1)
				   .aFloat11217)
				  - f_125_ * (f_105_ - (float) i_107_)));
	OpenGL.glVertex2f(f_104_, f_105_);
	OpenGL.glMultiTexCoord2f(33984,
				 ((Class120_Sub4_Sub1)
				  (((Class151_Sub3) this)
				   .aClass120_Sub4_Sub1_8932)).aFloat11218,
				 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_124_ * (f_122_ - (float) i_106_),
				 ((((Class120_Sub4_Sub1) class120_sub4_sub1)
				   .aFloat11217)
				  - f_125_ * (f_123_ - (float) i_107_)));
	OpenGL.glVertex2f(f_122_, f_123_);
	OpenGL.glMultiTexCoord2f(33984,
				 ((Class120_Sub4_Sub1)
				  (((Class151_Sub3) this)
				   .aClass120_Sub4_Sub1_8932)).aFloat11218,
				 ((Class120_Sub4_Sub1)
				  (((Class151_Sub3) this)
				   .aClass120_Sub4_Sub1_8932)).aFloat11217);
	OpenGL.glMultiTexCoord2f(33985, f_124_ * (f_102_ - (float) i_106_),
				 ((((Class120_Sub4_Sub1) class120_sub4_sub1)
				   .aFloat11217)
				  - f_125_ * (f_103_ - (float) i_107_)));
	OpenGL.glVertex2f(f_102_, f_103_);
	OpenGL.glEnd();
	((Class151_Sub3) this).aClass173_Sub2_8928.method8778(0, 5890, 768);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8776(0);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8775(null);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8774(0);
    }
    
    public Interface19 method1799() {
	return ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932.method8263(0);
    }
    
    public void method1789(int i, int i_126_, int i_127_, int i_128_, int[] is,
			   int i_129_, int i_130_) {
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932
	    .method8264(i, i_126_, i_127_, i_128_, is, i_129_, i_130_, true);
    }
    
    public void method1790(int i, int i_131_, int i_132_, int i_133_, int[] is,
			   int i_134_, int i_135_) {
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932
	    .method8264(i, i_131_, i_132_, i_133_, is, i_134_, i_135_, true);
    }
    
    public void method1791(int i, int i_136_, int i_137_, int i_138_, int[] is,
			   int i_139_, int i_140_) {
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932
	    .method8264(i, i_136_, i_137_, i_138_, is, i_139_, i_140_, true);
    }
    
    public void method1772(int[] is) {
	is[0] = ((Class151_Sub3) this).anInt8933;
	is[1] = ((Class151_Sub3) this).anInt8930;
	is[2] = ((Class151_Sub3) this).anInt8935;
	is[3] = ((Class151_Sub3) this).anInt8934;
    }
    
    void method8329() {
	((Class151_Sub3) this).aClass173_Sub2_8928.method8774(1);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8775(null);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8754(8448, 8448);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8778(1, 34168, 768);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8808(0, 5890, 770);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8774(0);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8778(1, 34168, 768);
    }
    
    public void method1795(int i, int i_141_, int i_142_, int i_143_,
			   int i_144_, int i_145_) {
	method8326(i, i_141_, i_142_, i_143_, i_144_, i_145_, false);
    }
    
    public void method1796(int i, int i_146_, int i_147_, int i_148_,
			   int i_149_, int i_150_) {
	method8326(i, i_146_, i_147_, i_148_, i_149_, i_150_, false);
    }
    
    public void method1778(int i, int i_151_, int i_152_) {
	OpenGL.glPixelTransferf(3348, 0.5F);
	OpenGL.glPixelTransferf(3349, 0.499F);
	OpenGL.glPixelTransferf(3352, 0.5F);
	OpenGL.glPixelTransferf(3353, 0.499F);
	OpenGL.glPixelTransferf(3354, 0.5F);
	OpenGL.glPixelTransferf(3355, 0.499F);
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8929
	    = (Class120_Sub4_Sub1.method10320
	       (((Class151_Sub3) this).aClass173_Sub2_8928, i, i_151_,
		((Class120_Sub4_Sub1)
		 ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932).anInt11216,
		((Class120_Sub4_Sub1)
		 ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932).anInt11215));
	((Class151_Sub3) this).anInt8927 = i_152_;
	OpenGL.glPixelTransferf(3348, 1.0F);
	OpenGL.glPixelTransferf(3349, 0.0F);
	OpenGL.glPixelTransferf(3352, 1.0F);
	OpenGL.glPixelTransferf(3353, 0.0F);
	OpenGL.glPixelTransferf(3354, 1.0F);
	OpenGL.glPixelTransferf(3355, 0.0F);
    }
    
    public void method1812(int i, int i_153_, int i_154_) {
	OpenGL.glPixelTransferf(3348, 0.5F);
	OpenGL.glPixelTransferf(3349, 0.499F);
	OpenGL.glPixelTransferf(3352, 0.5F);
	OpenGL.glPixelTransferf(3353, 0.499F);
	OpenGL.glPixelTransferf(3354, 0.5F);
	OpenGL.glPixelTransferf(3355, 0.499F);
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8929
	    = (Class120_Sub4_Sub1.method10320
	       (((Class151_Sub3) this).aClass173_Sub2_8928, i, i_153_,
		((Class120_Sub4_Sub1)
		 ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932).anInt11216,
		((Class120_Sub4_Sub1)
		 ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932).anInt11215));
	((Class151_Sub3) this).anInt8927 = i_154_;
	OpenGL.glPixelTransferf(3348, 1.0F);
	OpenGL.glPixelTransferf(3349, 0.0F);
	OpenGL.glPixelTransferf(3352, 1.0F);
	OpenGL.glPixelTransferf(3353, 0.0F);
	OpenGL.glPixelTransferf(3354, 1.0F);
	OpenGL.glPixelTransferf(3355, 0.0F);
    }
    
    public void method1802(int i, int i_155_, int i_156_, int i_157_, int[] is,
			   int[] is_158_, int i_159_, int i_160_) {
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932
	    .method8260(i, i_155_, i_156_, i_157_, is, is_158_, i_159_);
    }
    
    public Interface19 method1800() {
	return ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932.method8263(0);
    }
    
    public void method1811(int i, int i_161_, int i_162_, int i_163_,
			   int i_164_) {
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932.method1545(false);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8807();
	((Class151_Sub3) this).aClass173_Sub2_8928.method8788(i_164_);
	OpenGL.glColor4ub((byte) (i_163_ >> 16), (byte) (i_163_ >> 8),
			  (byte) i_163_, (byte) (i_163_ >> 24));
	i += ((Class151_Sub3) this).anInt8933;
	i_161_ += ((Class151_Sub3) this).anInt8930;
	if (((Class151_Sub3) this).aClass120_Sub4_Sub1_8929 == null) {
	    ((Class151_Sub3) this).aClass173_Sub2_8928
		.method8775(((Class151_Sub3) this).aClass120_Sub4_Sub1_8932);
	    ((Class151_Sub3) this).aClass173_Sub2_8928.method8776(i_162_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F,
				((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11217);
	    OpenGL.glVertex2i(i, i_161_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_161_ + (((Class120_Sub4_Sub1)
					    (((Class151_Sub3) this)
					     .aClass120_Sub4_Sub1_8932))
					   .anInt11215));
	    OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11218,
				0.0F);
	    OpenGL.glVertex2i(i + ((Class120_Sub4_Sub1)
				   (((Class151_Sub3) this)
				    .aClass120_Sub4_Sub1_8932)).anInt11216,
			      i_161_ + (((Class120_Sub4_Sub1)
					 (((Class151_Sub3) this)
					  .aClass120_Sub4_Sub1_8932))
					.anInt11215));
	    OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11218,
				((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11217);
	    OpenGL.glVertex2i(i + ((Class120_Sub4_Sub1)
				   (((Class151_Sub3) this)
				    .aClass120_Sub4_Sub1_8932)).anInt11216,
			      i_161_);
	    OpenGL.glEnd();
	} else {
	    method8327(i_162_);
	    ((Class151_Sub3) this).aClass120_Sub4_Sub1_8929.method1545(false);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     (((Class120_Sub4_Sub1)
				       (((Class151_Sub3) this)
					.aClass120_Sub4_Sub1_8932))
				      .aFloat11217));
	    OpenGL.glTexCoord2f(0.0F,
				((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11217);
	    OpenGL.glVertex2i(i, i_161_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_161_ + (((Class120_Sub4_Sub1)
					    (((Class151_Sub3) this)
					     .aClass120_Sub4_Sub1_8932))
					   .anInt11215));
	    OpenGL.glMultiTexCoord2f(33985,
				     ((Class120_Sub4_Sub1)
				      (((Class151_Sub3) this)
				       .aClass120_Sub4_Sub1_8932)).aFloat11218,
				     0.0F);
	    OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11218,
				0.0F);
	    OpenGL.glVertex2i(i + ((Class120_Sub4_Sub1)
				   (((Class151_Sub3) this)
				    .aClass120_Sub4_Sub1_8932)).anInt11216,
			      i_161_ + (((Class120_Sub4_Sub1)
					 (((Class151_Sub3) this)
					  .aClass120_Sub4_Sub1_8932))
					.anInt11215));
	    OpenGL.glMultiTexCoord2f(33985,
				     ((Class120_Sub4_Sub1)
				      (((Class151_Sub3) this)
				       .aClass120_Sub4_Sub1_8932)).aFloat11218,
				     (((Class120_Sub4_Sub1)
				       (((Class151_Sub3) this)
					.aClass120_Sub4_Sub1_8932))
				      .aFloat11217));
	    OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11218,
				((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11217);
	    OpenGL.glVertex2i(i + ((Class120_Sub4_Sub1)
				   (((Class151_Sub3) this)
				    .aClass120_Sub4_Sub1_8932)).anInt11216,
			      i_161_);
	    OpenGL.glEnd();
	    method8328();
	}
    }
    
    public void method1810(int i, int i_165_, int i_166_, int i_167_,
			   int i_168_) {
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932.method1545(false);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8807();
	((Class151_Sub3) this).aClass173_Sub2_8928.method8788(i_168_);
	OpenGL.glColor4ub((byte) (i_167_ >> 16), (byte) (i_167_ >> 8),
			  (byte) i_167_, (byte) (i_167_ >> 24));
	i += ((Class151_Sub3) this).anInt8933;
	i_165_ += ((Class151_Sub3) this).anInt8930;
	if (((Class151_Sub3) this).aClass120_Sub4_Sub1_8929 == null) {
	    ((Class151_Sub3) this).aClass173_Sub2_8928
		.method8775(((Class151_Sub3) this).aClass120_Sub4_Sub1_8932);
	    ((Class151_Sub3) this).aClass173_Sub2_8928.method8776(i_166_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F,
				((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11217);
	    OpenGL.glVertex2i(i, i_165_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_165_ + (((Class120_Sub4_Sub1)
					    (((Class151_Sub3) this)
					     .aClass120_Sub4_Sub1_8932))
					   .anInt11215));
	    OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11218,
				0.0F);
	    OpenGL.glVertex2i(i + ((Class120_Sub4_Sub1)
				   (((Class151_Sub3) this)
				    .aClass120_Sub4_Sub1_8932)).anInt11216,
			      i_165_ + (((Class120_Sub4_Sub1)
					 (((Class151_Sub3) this)
					  .aClass120_Sub4_Sub1_8932))
					.anInt11215));
	    OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11218,
				((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11217);
	    OpenGL.glVertex2i(i + ((Class120_Sub4_Sub1)
				   (((Class151_Sub3) this)
				    .aClass120_Sub4_Sub1_8932)).anInt11216,
			      i_165_);
	    OpenGL.glEnd();
	} else {
	    method8327(i_166_);
	    ((Class151_Sub3) this).aClass120_Sub4_Sub1_8929.method1545(false);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     (((Class120_Sub4_Sub1)
				       (((Class151_Sub3) this)
					.aClass120_Sub4_Sub1_8932))
				      .aFloat11217));
	    OpenGL.glTexCoord2f(0.0F,
				((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11217);
	    OpenGL.glVertex2i(i, i_165_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_165_ + (((Class120_Sub4_Sub1)
					    (((Class151_Sub3) this)
					     .aClass120_Sub4_Sub1_8932))
					   .anInt11215));
	    OpenGL.glMultiTexCoord2f(33985,
				     ((Class120_Sub4_Sub1)
				      (((Class151_Sub3) this)
				       .aClass120_Sub4_Sub1_8932)).aFloat11218,
				     0.0F);
	    OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11218,
				0.0F);
	    OpenGL.glVertex2i(i + ((Class120_Sub4_Sub1)
				   (((Class151_Sub3) this)
				    .aClass120_Sub4_Sub1_8932)).anInt11216,
			      i_165_ + (((Class120_Sub4_Sub1)
					 (((Class151_Sub3) this)
					  .aClass120_Sub4_Sub1_8932))
					.anInt11215));
	    OpenGL.glMultiTexCoord2f(33985,
				     ((Class120_Sub4_Sub1)
				      (((Class151_Sub3) this)
				       .aClass120_Sub4_Sub1_8932)).aFloat11218,
				     (((Class120_Sub4_Sub1)
				       (((Class151_Sub3) this)
					.aClass120_Sub4_Sub1_8932))
				      .aFloat11217));
	    OpenGL.glTexCoord2f(((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11218,
				((Class120_Sub4_Sub1)
				 (((Class151_Sub3) this)
				  .aClass120_Sub4_Sub1_8932)).aFloat11217);
	    OpenGL.glVertex2i(i + ((Class120_Sub4_Sub1)
				   (((Class151_Sub3) this)
				    .aClass120_Sub4_Sub1_8932)).anInt11216,
			      i_165_);
	    OpenGL.glEnd();
	    method8328();
	}
    }
    
    void method1793(float f, float f_169_, float f_170_, float f_171_,
		    float f_172_, float f_173_, int i, int i_174_, int i_175_,
		    int i_176_) {
	if (((Class151_Sub3) this).aBool8931) {
	    float f_177_ = (float) method40();
	    float f_178_ = (float) method1768();
	    float f_179_ = (f_170_ - f) / f_177_;
	    float f_180_ = (f_171_ - f_169_) / f_177_;
	    float f_181_ = (f_172_ - f) / f_178_;
	    float f_182_ = (f_173_ - f_169_) / f_178_;
	    float f_183_ = f_181_ * (float) ((Class151_Sub3) this).anInt8930;
	    float f_184_ = f_182_ * (float) ((Class151_Sub3) this).anInt8930;
	    float f_185_ = f_179_ * (float) ((Class151_Sub3) this).anInt8933;
	    float f_186_ = f_180_ * (float) ((Class151_Sub3) this).anInt8933;
	    float f_187_ = -f_179_ * (float) ((Class151_Sub3) this).anInt8935;
	    float f_188_ = -f_180_ * (float) ((Class151_Sub3) this).anInt8935;
	    float f_189_ = -f_181_ * (float) ((Class151_Sub3) this).anInt8934;
	    float f_190_ = -f_182_ * (float) ((Class151_Sub3) this).anInt8934;
	    f = f + f_185_ + f_183_;
	    f_169_ = f_169_ + f_186_ + f_184_;
	    f_170_ = f_170_ + f_187_ + f_183_;
	    f_171_ = f_171_ + f_188_ + f_184_;
	    f_172_ = f_172_ + f_185_ + f_189_;
	    f_173_ = f_173_ + f_186_ + f_190_;
	}
	float f_191_ = f_172_ + (f_170_ - f);
	float f_192_ = f_171_ + (f_173_ - f_169_);
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932
	    .method1545((i_176_ & 0x1) != 0);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8807();
	((Class151_Sub3) this).aClass173_Sub2_8928
	    .method8775(((Class151_Sub3) this).aClass120_Sub4_Sub1_8932);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8788(i_175_);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8776(i);
	OpenGL.glColor4ub((byte) (i_174_ >> 16), (byte) (i_174_ >> 8),
			  (byte) i_174_, (byte) (i_174_ >> 24));
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F,
			    (((Class120_Sub4_Sub1)
			      ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			     .aFloat11217));
	OpenGL.glVertex2f(f, f_169_);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2f(f_172_, f_173_);
	OpenGL.glTexCoord2f((((Class120_Sub4_Sub1)
			      ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			     .aFloat11218),
			    0.0F);
	OpenGL.glVertex2f(f_191_, f_192_);
	OpenGL.glTexCoord2f((((Class120_Sub4_Sub1)
			      ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			     .aFloat11218),
			    (((Class120_Sub4_Sub1)
			      ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			     .aFloat11217));
	OpenGL.glVertex2f(f_170_, f_171_);
	OpenGL.glEnd();
    }
    
    public void method1805(int i, int i_193_, Class148 class148, int i_194_,
			   int i_195_) {
	Class148_Sub3 class148_sub3 = (Class148_Sub3) class148;
	Class120_Sub4_Sub1 class120_sub4_sub1
	    = ((Class148_Sub3) class148_sub3).aClass120_Sub4_Sub1_8920;
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932.method1545(false);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8807();
	((Class151_Sub3) this).aClass173_Sub2_8928
	    .method8775(((Class151_Sub3) this).aClass120_Sub4_Sub1_8932);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8776(1);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8774(1);
	((Class151_Sub3) this).aClass173_Sub2_8928
	    .method8775(class120_sub4_sub1);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8754(7681, 8448);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8778(0, 34168, 768);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8788(1);
	i += ((Class151_Sub3) this).anInt8933;
	i_193_ += ((Class151_Sub3) this).anInt8930;
	int i_196_
	    = i + ((Class120_Sub4_Sub1)
		   ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932).anInt11216;
	int i_197_
	    = (i_193_
	       + ((Class120_Sub4_Sub1)
		  ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932).anInt11215);
	float f
	    = (((Class120_Sub4_Sub1) class120_sub4_sub1).aFloat11218
	       / (float) ((Class120_Sub4_Sub1) class120_sub4_sub1).anInt11216);
	float f_198_
	    = (((Class120_Sub4_Sub1) class120_sub4_sub1).aFloat11217
	       / (float) ((Class120_Sub4_Sub1) class120_sub4_sub1).anInt11215);
	float f_199_ = (float) (i - i_194_) * f;
	float f_200_ = (float) (i_196_ - i_194_) * f;
	float f_201_ = (((Class120_Sub4_Sub1) class120_sub4_sub1).aFloat11217
			- (float) (i_193_ - i_195_) * f_198_);
	float f_202_ = (((Class120_Sub4_Sub1) class120_sub4_sub1).aFloat11217
			- (float) (i_197_ - i_195_) * f_198_);
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F,
				 ((Class120_Sub4_Sub1)
				  (((Class151_Sub3) this)
				   .aClass120_Sub4_Sub1_8932)).aFloat11217);
	OpenGL.glMultiTexCoord2f(33985, f_199_, f_201_);
	OpenGL.glVertex2i(i, i_193_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_199_, f_202_);
	OpenGL.glVertex2i(i,
			  i_193_ + ((Class120_Sub4_Sub1)
				    (((Class151_Sub3) this)
				     .aClass120_Sub4_Sub1_8932)).anInt11215);
	OpenGL.glMultiTexCoord2f(33984,
				 ((Class120_Sub4_Sub1)
				  (((Class151_Sub3) this)
				   .aClass120_Sub4_Sub1_8932)).aFloat11218,
				 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_200_, f_202_);
	OpenGL.glVertex2i(i + ((Class120_Sub4_Sub1)
			       (((Class151_Sub3) this)
				.aClass120_Sub4_Sub1_8932)).anInt11216,
			  i_193_ + ((Class120_Sub4_Sub1)
				    (((Class151_Sub3) this)
				     .aClass120_Sub4_Sub1_8932)).anInt11215);
	OpenGL.glMultiTexCoord2f(33984,
				 ((Class120_Sub4_Sub1)
				  (((Class151_Sub3) this)
				   .aClass120_Sub4_Sub1_8932)).aFloat11218,
				 ((Class120_Sub4_Sub1)
				  (((Class151_Sub3) this)
				   .aClass120_Sub4_Sub1_8932)).aFloat11217);
	OpenGL.glMultiTexCoord2f(33985, f_200_, f_201_);
	OpenGL.glVertex2i(i + ((Class120_Sub4_Sub1)
			       (((Class151_Sub3) this)
				.aClass120_Sub4_Sub1_8932)).anInt11216,
			  i_193_);
	OpenGL.glEnd();
	((Class151_Sub3) this).aClass173_Sub2_8928.method8778(0, 5890, 768);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8776(0);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8775(null);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8774(0);
    }
    
    public int method1808() {
	return (((Class120_Sub4_Sub1)
		 ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
		.anInt11216);
    }
    
    public void method1806(int i, int i_203_, int i_204_, int i_205_) {
	((Class151_Sub3) this).anInt8933 = i;
	((Class151_Sub3) this).anInt8930 = i_203_;
	((Class151_Sub3) this).anInt8935 = i_204_;
	((Class151_Sub3) this).anInt8934 = i_205_;
	((Class151_Sub3) this).aBool8931
	    = (((Class151_Sub3) this).anInt8933 != 0
	       || ((Class151_Sub3) this).anInt8930 != 0
	       || ((Class151_Sub3) this).anInt8935 != 0
	       || ((Class151_Sub3) this).anInt8934 != 0);
    }
    
    public int method1809() {
	return (((Class120_Sub4_Sub1)
		 ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
		.anInt11216);
    }
    
    Class151_Sub3(Class173_Sub2 class173_sub2, int i, int i_206_,
		  boolean bool) {
	((Class151_Sub3) this).anInt8930 = 0;
	((Class151_Sub3) this).anInt8933 = 0;
	((Class151_Sub3) this).anInt8934 = 0;
	((Class151_Sub3) this).anInt8935 = 0;
	((Class151_Sub3) this).aClass173_Sub2_8928 = class173_sub2;
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932
	    = Class120_Sub4_Sub1.method10321(class173_sub2,
					     (bool ? Class149.aClass149_1676
					      : Class149.aClass149_1684),
					     Class169.aClass169_1935, i,
					     i_206_);
    }
    
    public void method1770(int i, int i_207_, int i_208_, int i_209_, int[] is,
			   int i_210_, int i_211_) {
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932
	    .method8264(i, i_207_, i_208_, i_209_, is, i_210_, i_211_, true);
    }
    
    public void method1779(int i, int i_212_, int i_213_, int i_214_,
			   int i_215_, int i_216_, int i_217_) {
	int i_218_ = i + i_213_;
	int i_219_ = i_212_ + i_214_;
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932.method1545(false);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8807();
	((Class151_Sub3) this).aClass173_Sub2_8928
	    .method8775(((Class151_Sub3) this).aClass120_Sub4_Sub1_8932);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8788(i_217_);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8776(i_215_);
	OpenGL.glColor4ub((byte) (i_216_ >> 16), (byte) (i_216_ >> 8),
			  (byte) i_216_, (byte) (i_216_ >> 24));
	if (((Class120_Sub4_Sub1)
	     ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932).aBool11219
	    && !((Class151_Sub3) this).aBool8931
	    && i_214_ >= (((Class120_Sub4_Sub1)
			   ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			  .anInt11215)
	    && i_213_ >= (((Class120_Sub4_Sub1)
			   ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			  .anInt11216)) {
	    float f
		= ((((Class120_Sub4_Sub1)
		     ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
		    .aFloat11217)
		   * (float) i_214_
		   / (float) (((Class120_Sub4_Sub1)
			       ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			      .anInt11215));
	    float f_220_
		= ((((Class120_Sub4_Sub1)
		     ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
		    .aFloat11218)
		   * (float) i_213_
		   / (float) (((Class120_Sub4_Sub1)
			       ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			      .anInt11216));
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, f);
	    OpenGL.glVertex2i(i, i_212_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_219_);
	    OpenGL.glTexCoord2f(f_220_, 0.0F);
	    OpenGL.glVertex2i(i_218_, i_219_);
	    OpenGL.glTexCoord2f(f_220_, f);
	    OpenGL.glVertex2i(i_218_, i_212_);
	    OpenGL.glEnd();
	} else {
	    OpenGL.glPushMatrix();
	    OpenGL.glTranslatef((float) ((Class151_Sub3) this).anInt8933,
				(float) ((Class151_Sub3) this).anInt8930,
				0.0F);
	    int i_221_ = method40();
	    int i_222_ = method1768();
	    int i_223_
		= i_212_ + (((Class120_Sub4_Sub1)
			     ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			    .anInt11215);
	    OpenGL.glBegin(7);
	    int i_224_ = i_212_;
	    for (/**/; i_223_ <= i_219_; i_223_ += i_222_) {
		int i_225_
		    = i + (((Class120_Sub4_Sub1)
			    ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			   .anInt11216);
		int i_226_ = i;
		while (i_225_ <= i_218_) {
		    OpenGL.glTexCoord2f(0.0F, (((Class120_Sub4_Sub1)
						(((Class151_Sub3) this)
						 .aClass120_Sub4_Sub1_8932))
					       .aFloat11217));
		    OpenGL.glVertex2i(i_226_, i_224_);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(i_226_, i_223_);
		    OpenGL.glTexCoord2f((((Class120_Sub4_Sub1)
					  (((Class151_Sub3) this)
					   .aClass120_Sub4_Sub1_8932))
					 .aFloat11218),
					0.0F);
		    OpenGL.glVertex2i(i_225_, i_223_);
		    OpenGL.glTexCoord2f((((Class120_Sub4_Sub1)
					  (((Class151_Sub3) this)
					   .aClass120_Sub4_Sub1_8932))
					 .aFloat11218),
					(((Class120_Sub4_Sub1)
					  (((Class151_Sub3) this)
					   .aClass120_Sub4_Sub1_8932))
					 .aFloat11217));
		    OpenGL.glVertex2i(i_225_, i_224_);
		    i_225_ += i_221_;
		    i_226_ += i_221_;
		}
		if (i_226_ < i_218_) {
		    float f
			= ((((Class120_Sub4_Sub1)
			     ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			    .aFloat11218)
			   * (float) (i_218_ - i_226_)
			   / (float) ((Class120_Sub4_Sub1)
				      (((Class151_Sub3) this)
				       .aClass120_Sub4_Sub1_8932)).anInt11216);
		    OpenGL.glTexCoord2f(0.0F, (((Class120_Sub4_Sub1)
						(((Class151_Sub3) this)
						 .aClass120_Sub4_Sub1_8932))
					       .aFloat11217));
		    OpenGL.glVertex2i(i_226_, i_224_);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(i_226_, i_223_);
		    OpenGL.glTexCoord2f(f, 0.0F);
		    OpenGL.glVertex2i(i_218_, i_223_);
		    OpenGL.glTexCoord2f(f, (((Class120_Sub4_Sub1)
					     (((Class151_Sub3) this)
					      .aClass120_Sub4_Sub1_8932))
					    .aFloat11217));
		    OpenGL.glVertex2i(i_218_, i_224_);
		}
		i_224_ += i_222_;
	    }
	    if (i_224_ < i_219_) {
		float f = ((((Class120_Sub4_Sub1)
			     ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			    .aFloat11217)
			   * (float) (((Class120_Sub4_Sub1)
				       (((Class151_Sub3) this)
					.aClass120_Sub4_Sub1_8932)).anInt11215
				      - (i_219_ - i_224_))
			   / (float) ((Class120_Sub4_Sub1)
				      (((Class151_Sub3) this)
				       .aClass120_Sub4_Sub1_8932)).anInt11215);
		int i_227_
		    = i + (((Class120_Sub4_Sub1)
			    ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			   .anInt11216);
		int i_228_ = i;
		while (i_227_ <= i_218_) {
		    OpenGL.glTexCoord2f(0.0F, (((Class120_Sub4_Sub1)
						(((Class151_Sub3) this)
						 .aClass120_Sub4_Sub1_8932))
					       .aFloat11217));
		    OpenGL.glVertex2i(i_228_, i_224_);
		    OpenGL.glTexCoord2f(0.0F, f);
		    OpenGL.glVertex2i(i_228_, i_219_);
		    OpenGL.glTexCoord2f((((Class120_Sub4_Sub1)
					  (((Class151_Sub3) this)
					   .aClass120_Sub4_Sub1_8932))
					 .aFloat11218),
					f);
		    OpenGL.glVertex2i(i_227_, i_219_);
		    OpenGL.glTexCoord2f((((Class120_Sub4_Sub1)
					  (((Class151_Sub3) this)
					   .aClass120_Sub4_Sub1_8932))
					 .aFloat11218),
					(((Class120_Sub4_Sub1)
					  (((Class151_Sub3) this)
					   .aClass120_Sub4_Sub1_8932))
					 .aFloat11217));
		    OpenGL.glVertex2i(i_227_, i_224_);
		    i_227_ += i_221_;
		    i_228_ += i_221_;
		}
		if (i_228_ < i_218_) {
		    float f_229_
			= ((((Class120_Sub4_Sub1)
			     ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			    .aFloat11218)
			   * (float) (i_218_ - i_228_)
			   / (float) ((Class120_Sub4_Sub1)
				      (((Class151_Sub3) this)
				       .aClass120_Sub4_Sub1_8932)).anInt11216);
		    OpenGL.glTexCoord2f(0.0F, (((Class120_Sub4_Sub1)
						(((Class151_Sub3) this)
						 .aClass120_Sub4_Sub1_8932))
					       .aFloat11217));
		    OpenGL.glVertex2i(i_228_, i_224_);
		    OpenGL.glTexCoord2f(0.0F, f);
		    OpenGL.glVertex2i(i_228_, i_219_);
		    OpenGL.glTexCoord2f(f_229_, f);
		    OpenGL.glVertex2i(i_218_, i_219_);
		    OpenGL.glTexCoord2f(f_229_, (((Class120_Sub4_Sub1)
						  (((Class151_Sub3) this)
						   .aClass120_Sub4_Sub1_8932))
						 .aFloat11217));
		    OpenGL.glVertex2i(i_218_, i_224_);
		}
	    }
	    OpenGL.glEnd();
	    OpenGL.glPopMatrix();
	}
    }
    
    public int method1820() {
	return (((Class120_Sub4_Sub1)
		 ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
		.anInt11215);
    }
    
    public int method38() {
	return (((Class120_Sub4_Sub1)
		 ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932).anInt11216
		+ ((Class151_Sub3) this).anInt8933
		+ ((Class151_Sub3) this).anInt8935);
    }
    
    public int method37() {
	return (((Class120_Sub4_Sub1)
		 ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932).anInt11216
		+ ((Class151_Sub3) this).anInt8933
		+ ((Class151_Sub3) this).anInt8935);
    }
    
    public int method39() {
	return (((Class120_Sub4_Sub1)
		 ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932).anInt11216
		+ ((Class151_Sub3) this).anInt8933
		+ ((Class151_Sub3) this).anInt8935);
    }
    
    public int method1819() {
	return (((Class120_Sub4_Sub1)
		 ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932).anInt11215
		+ ((Class151_Sub3) this).anInt8930
		+ ((Class151_Sub3) this).anInt8934);
    }
    
    public void method1814(int i, int i_230_, int i_231_, int i_232_,
			   int i_233_, int i_234_, int i_235_) {
	int i_236_ = i + i_231_;
	int i_237_ = i_230_ + i_232_;
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932.method1545(false);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8807();
	((Class151_Sub3) this).aClass173_Sub2_8928
	    .method8775(((Class151_Sub3) this).aClass120_Sub4_Sub1_8932);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8788(i_235_);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8776(i_233_);
	OpenGL.glColor4ub((byte) (i_234_ >> 16), (byte) (i_234_ >> 8),
			  (byte) i_234_, (byte) (i_234_ >> 24));
	if (((Class120_Sub4_Sub1)
	     ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932).aBool11219
	    && !((Class151_Sub3) this).aBool8931
	    && i_232_ >= (((Class120_Sub4_Sub1)
			   ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			  .anInt11215)
	    && i_231_ >= (((Class120_Sub4_Sub1)
			   ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			  .anInt11216)) {
	    float f
		= ((((Class120_Sub4_Sub1)
		     ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
		    .aFloat11217)
		   * (float) i_232_
		   / (float) (((Class120_Sub4_Sub1)
			       ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			      .anInt11215));
	    float f_238_
		= ((((Class120_Sub4_Sub1)
		     ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
		    .aFloat11218)
		   * (float) i_231_
		   / (float) (((Class120_Sub4_Sub1)
			       ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			      .anInt11216));
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, f);
	    OpenGL.glVertex2i(i, i_230_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_237_);
	    OpenGL.glTexCoord2f(f_238_, 0.0F);
	    OpenGL.glVertex2i(i_236_, i_237_);
	    OpenGL.glTexCoord2f(f_238_, f);
	    OpenGL.glVertex2i(i_236_, i_230_);
	    OpenGL.glEnd();
	} else {
	    OpenGL.glPushMatrix();
	    OpenGL.glTranslatef((float) ((Class151_Sub3) this).anInt8933,
				(float) ((Class151_Sub3) this).anInt8930,
				0.0F);
	    int i_239_ = method40();
	    int i_240_ = method1768();
	    int i_241_
		= i_230_ + (((Class120_Sub4_Sub1)
			     ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			    .anInt11215);
	    OpenGL.glBegin(7);
	    int i_242_ = i_230_;
	    for (/**/; i_241_ <= i_237_; i_241_ += i_240_) {
		int i_243_
		    = i + (((Class120_Sub4_Sub1)
			    ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			   .anInt11216);
		int i_244_ = i;
		while (i_243_ <= i_236_) {
		    OpenGL.glTexCoord2f(0.0F, (((Class120_Sub4_Sub1)
						(((Class151_Sub3) this)
						 .aClass120_Sub4_Sub1_8932))
					       .aFloat11217));
		    OpenGL.glVertex2i(i_244_, i_242_);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(i_244_, i_241_);
		    OpenGL.glTexCoord2f((((Class120_Sub4_Sub1)
					  (((Class151_Sub3) this)
					   .aClass120_Sub4_Sub1_8932))
					 .aFloat11218),
					0.0F);
		    OpenGL.glVertex2i(i_243_, i_241_);
		    OpenGL.glTexCoord2f((((Class120_Sub4_Sub1)
					  (((Class151_Sub3) this)
					   .aClass120_Sub4_Sub1_8932))
					 .aFloat11218),
					(((Class120_Sub4_Sub1)
					  (((Class151_Sub3) this)
					   .aClass120_Sub4_Sub1_8932))
					 .aFloat11217));
		    OpenGL.glVertex2i(i_243_, i_242_);
		    i_243_ += i_239_;
		    i_244_ += i_239_;
		}
		if (i_244_ < i_236_) {
		    float f
			= ((((Class120_Sub4_Sub1)
			     ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			    .aFloat11218)
			   * (float) (i_236_ - i_244_)
			   / (float) ((Class120_Sub4_Sub1)
				      (((Class151_Sub3) this)
				       .aClass120_Sub4_Sub1_8932)).anInt11216);
		    OpenGL.glTexCoord2f(0.0F, (((Class120_Sub4_Sub1)
						(((Class151_Sub3) this)
						 .aClass120_Sub4_Sub1_8932))
					       .aFloat11217));
		    OpenGL.glVertex2i(i_244_, i_242_);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(i_244_, i_241_);
		    OpenGL.glTexCoord2f(f, 0.0F);
		    OpenGL.glVertex2i(i_236_, i_241_);
		    OpenGL.glTexCoord2f(f, (((Class120_Sub4_Sub1)
					     (((Class151_Sub3) this)
					      .aClass120_Sub4_Sub1_8932))
					    .aFloat11217));
		    OpenGL.glVertex2i(i_236_, i_242_);
		}
		i_242_ += i_240_;
	    }
	    if (i_242_ < i_237_) {
		float f = ((((Class120_Sub4_Sub1)
			     ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			    .aFloat11217)
			   * (float) (((Class120_Sub4_Sub1)
				       (((Class151_Sub3) this)
					.aClass120_Sub4_Sub1_8932)).anInt11215
				      - (i_237_ - i_242_))
			   / (float) ((Class120_Sub4_Sub1)
				      (((Class151_Sub3) this)
				       .aClass120_Sub4_Sub1_8932)).anInt11215);
		int i_245_
		    = i + (((Class120_Sub4_Sub1)
			    ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			   .anInt11216);
		int i_246_ = i;
		while (i_245_ <= i_236_) {
		    OpenGL.glTexCoord2f(0.0F, (((Class120_Sub4_Sub1)
						(((Class151_Sub3) this)
						 .aClass120_Sub4_Sub1_8932))
					       .aFloat11217));
		    OpenGL.glVertex2i(i_246_, i_242_);
		    OpenGL.glTexCoord2f(0.0F, f);
		    OpenGL.glVertex2i(i_246_, i_237_);
		    OpenGL.glTexCoord2f((((Class120_Sub4_Sub1)
					  (((Class151_Sub3) this)
					   .aClass120_Sub4_Sub1_8932))
					 .aFloat11218),
					f);
		    OpenGL.glVertex2i(i_245_, i_237_);
		    OpenGL.glTexCoord2f((((Class120_Sub4_Sub1)
					  (((Class151_Sub3) this)
					   .aClass120_Sub4_Sub1_8932))
					 .aFloat11218),
					(((Class120_Sub4_Sub1)
					  (((Class151_Sub3) this)
					   .aClass120_Sub4_Sub1_8932))
					 .aFloat11217));
		    OpenGL.glVertex2i(i_245_, i_242_);
		    i_245_ += i_239_;
		    i_246_ += i_239_;
		}
		if (i_246_ < i_236_) {
		    float f_247_
			= ((((Class120_Sub4_Sub1)
			     ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			    .aFloat11218)
			   * (float) (i_236_ - i_246_)
			   / (float) ((Class120_Sub4_Sub1)
				      (((Class151_Sub3) this)
				       .aClass120_Sub4_Sub1_8932)).anInt11216);
		    OpenGL.glTexCoord2f(0.0F, (((Class120_Sub4_Sub1)
						(((Class151_Sub3) this)
						 .aClass120_Sub4_Sub1_8932))
					       .aFloat11217));
		    OpenGL.glVertex2i(i_246_, i_242_);
		    OpenGL.glTexCoord2f(0.0F, f);
		    OpenGL.glVertex2i(i_246_, i_237_);
		    OpenGL.glTexCoord2f(f_247_, f);
		    OpenGL.glVertex2i(i_236_, i_237_);
		    OpenGL.glTexCoord2f(f_247_, (((Class120_Sub4_Sub1)
						  (((Class151_Sub3) this)
						   .aClass120_Sub4_Sub1_8932))
						 .aFloat11217));
		    OpenGL.glVertex2i(i_236_, i_242_);
		}
	    }
	    OpenGL.glEnd();
	    OpenGL.glPopMatrix();
	}
    }
    
    void method1817(float f, float f_248_, float f_249_, float f_250_,
		    float f_251_, float f_252_, int i, Class148 class148,
		    int i_253_, int i_254_) {
	Class120_Sub4_Sub1 class120_sub4_sub1
	    = (((Class148_Sub3) (Class148_Sub3) class148)
	       .aClass120_Sub4_Sub1_8920);
	if (((Class151_Sub3) this).aBool8931) {
	    float f_255_ = (float) method40();
	    float f_256_ = (float) method1768();
	    float f_257_ = (f_249_ - f) / f_255_;
	    float f_258_ = (f_250_ - f_248_) / f_255_;
	    float f_259_ = (f_251_ - f) / f_256_;
	    float f_260_ = (f_252_ - f_248_) / f_256_;
	    float f_261_ = f_259_ * (float) ((Class151_Sub3) this).anInt8930;
	    float f_262_ = f_260_ * (float) ((Class151_Sub3) this).anInt8930;
	    float f_263_ = f_257_ * (float) ((Class151_Sub3) this).anInt8933;
	    float f_264_ = f_258_ * (float) ((Class151_Sub3) this).anInt8933;
	    float f_265_ = -f_257_ * (float) ((Class151_Sub3) this).anInt8935;
	    float f_266_ = -f_258_ * (float) ((Class151_Sub3) this).anInt8935;
	    float f_267_ = -f_259_ * (float) ((Class151_Sub3) this).anInt8934;
	    float f_268_ = -f_260_ * (float) ((Class151_Sub3) this).anInt8934;
	    f = f + f_263_ + f_261_;
	    f_248_ = f_248_ + f_264_ + f_262_;
	    f_249_ = f_249_ + f_265_ + f_261_;
	    f_250_ = f_250_ + f_266_ + f_262_;
	    f_251_ = f_251_ + f_263_ + f_267_;
	    f_252_ = f_252_ + f_264_ + f_268_;
	}
	float f_269_ = f_251_ + (f_249_ - f);
	float f_270_ = f_250_ + (f_252_ - f_248_);
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932
	    .method1545((i & 0x1) != 0);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8807();
	((Class151_Sub3) this).aClass173_Sub2_8928
	    .method8775(((Class151_Sub3) this).aClass120_Sub4_Sub1_8932);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8776(1);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8774(1);
	((Class151_Sub3) this).aClass173_Sub2_8928
	    .method8775(class120_sub4_sub1);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8754(7681, 8448);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8778(0, 34168, 768);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8788(1);
	float f_271_
	    = (((Class120_Sub4_Sub1) class120_sub4_sub1).aFloat11218
	       / (float) ((Class120_Sub4_Sub1) class120_sub4_sub1).anInt11216);
	float f_272_
	    = (((Class120_Sub4_Sub1) class120_sub4_sub1).aFloat11217
	       / (float) ((Class120_Sub4_Sub1) class120_sub4_sub1).anInt11215);
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F,
				 ((Class120_Sub4_Sub1)
				  (((Class151_Sub3) this)
				   .aClass120_Sub4_Sub1_8932)).aFloat11217);
	OpenGL.glMultiTexCoord2f(33985, f_271_ * (f - (float) i_253_),
				 ((((Class120_Sub4_Sub1) class120_sub4_sub1)
				   .aFloat11217)
				  - f_272_ * (f_248_ - (float) i_254_)));
	OpenGL.glVertex2f(f, f_248_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_271_ * (f_251_ - (float) i_253_),
				 ((((Class120_Sub4_Sub1) class120_sub4_sub1)
				   .aFloat11217)
				  - f_272_ * (f_252_ - (float) i_254_)));
	OpenGL.glVertex2f(f_251_, f_252_);
	OpenGL.glMultiTexCoord2f(33984,
				 ((Class120_Sub4_Sub1)
				  (((Class151_Sub3) this)
				   .aClass120_Sub4_Sub1_8932)).aFloat11218,
				 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_271_ * (f_269_ - (float) i_253_),
				 ((((Class120_Sub4_Sub1) class120_sub4_sub1)
				   .aFloat11217)
				  - f_272_ * (f_270_ - (float) i_254_)));
	OpenGL.glVertex2f(f_269_, f_270_);
	OpenGL.glMultiTexCoord2f(33984,
				 ((Class120_Sub4_Sub1)
				  (((Class151_Sub3) this)
				   .aClass120_Sub4_Sub1_8932)).aFloat11218,
				 ((Class120_Sub4_Sub1)
				  (((Class151_Sub3) this)
				   .aClass120_Sub4_Sub1_8932)).aFloat11217);
	OpenGL.glMultiTexCoord2f(33985, f_271_ * (f_249_ - (float) i_253_),
				 ((((Class120_Sub4_Sub1) class120_sub4_sub1)
				   .aFloat11217)
				  - f_272_ * (f_250_ - (float) i_254_)));
	OpenGL.glVertex2f(f_249_, f_250_);
	OpenGL.glEnd();
	((Class151_Sub3) this).aClass173_Sub2_8928.method8778(0, 5890, 768);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8776(0);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8775(null);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8774(0);
    }
    
    void method1815(float f, float f_273_, float f_274_, float f_275_,
		    float f_276_, float f_277_, int i, int i_278_, int i_279_,
		    int i_280_) {
	if (((Class151_Sub3) this).aBool8931) {
	    float f_281_ = (float) method40();
	    float f_282_ = (float) method1768();
	    float f_283_ = (f_274_ - f) / f_281_;
	    float f_284_ = (f_275_ - f_273_) / f_281_;
	    float f_285_ = (f_276_ - f) / f_282_;
	    float f_286_ = (f_277_ - f_273_) / f_282_;
	    float f_287_ = f_285_ * (float) ((Class151_Sub3) this).anInt8930;
	    float f_288_ = f_286_ * (float) ((Class151_Sub3) this).anInt8930;
	    float f_289_ = f_283_ * (float) ((Class151_Sub3) this).anInt8933;
	    float f_290_ = f_284_ * (float) ((Class151_Sub3) this).anInt8933;
	    float f_291_ = -f_283_ * (float) ((Class151_Sub3) this).anInt8935;
	    float f_292_ = -f_284_ * (float) ((Class151_Sub3) this).anInt8935;
	    float f_293_ = -f_285_ * (float) ((Class151_Sub3) this).anInt8934;
	    float f_294_ = -f_286_ * (float) ((Class151_Sub3) this).anInt8934;
	    f = f + f_289_ + f_287_;
	    f_273_ = f_273_ + f_290_ + f_288_;
	    f_274_ = f_274_ + f_291_ + f_287_;
	    f_275_ = f_275_ + f_292_ + f_288_;
	    f_276_ = f_276_ + f_289_ + f_293_;
	    f_277_ = f_277_ + f_290_ + f_294_;
	}
	float f_295_ = f_276_ + (f_274_ - f);
	float f_296_ = f_275_ + (f_277_ - f_273_);
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932
	    .method1545((i_280_ & 0x1) != 0);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8807();
	((Class151_Sub3) this).aClass173_Sub2_8928
	    .method8775(((Class151_Sub3) this).aClass120_Sub4_Sub1_8932);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8788(i_279_);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8776(i);
	OpenGL.glColor4ub((byte) (i_278_ >> 16), (byte) (i_278_ >> 8),
			  (byte) i_278_, (byte) (i_278_ >> 24));
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F,
			    (((Class120_Sub4_Sub1)
			      ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			     .aFloat11217));
	OpenGL.glVertex2f(f, f_273_);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2f(f_276_, f_277_);
	OpenGL.glTexCoord2f((((Class120_Sub4_Sub1)
			      ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			     .aFloat11218),
			    0.0F);
	OpenGL.glVertex2f(f_295_, f_296_);
	OpenGL.glTexCoord2f((((Class120_Sub4_Sub1)
			      ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			     .aFloat11218),
			    (((Class120_Sub4_Sub1)
			      ((Class151_Sub3) this).aClass120_Sub4_Sub1_8932)
			     .aFloat11217));
	OpenGL.glVertex2f(f_274_, f_275_);
	OpenGL.glEnd();
    }
    
    void method1816(float f, float f_297_, float f_298_, float f_299_,
		    float f_300_, float f_301_, int i, Class148 class148,
		    int i_302_, int i_303_) {
	Class120_Sub4_Sub1 class120_sub4_sub1
	    = (((Class148_Sub3) (Class148_Sub3) class148)
	       .aClass120_Sub4_Sub1_8920);
	if (((Class151_Sub3) this).aBool8931) {
	    float f_304_ = (float) method40();
	    float f_305_ = (float) method1768();
	    float f_306_ = (f_298_ - f) / f_304_;
	    float f_307_ = (f_299_ - f_297_) / f_304_;
	    float f_308_ = (f_300_ - f) / f_305_;
	    float f_309_ = (f_301_ - f_297_) / f_305_;
	    float f_310_ = f_308_ * (float) ((Class151_Sub3) this).anInt8930;
	    float f_311_ = f_309_ * (float) ((Class151_Sub3) this).anInt8930;
	    float f_312_ = f_306_ * (float) ((Class151_Sub3) this).anInt8933;
	    float f_313_ = f_307_ * (float) ((Class151_Sub3) this).anInt8933;
	    float f_314_ = -f_306_ * (float) ((Class151_Sub3) this).anInt8935;
	    float f_315_ = -f_307_ * (float) ((Class151_Sub3) this).anInt8935;
	    float f_316_ = -f_308_ * (float) ((Class151_Sub3) this).anInt8934;
	    float f_317_ = -f_309_ * (float) ((Class151_Sub3) this).anInt8934;
	    f = f + f_312_ + f_310_;
	    f_297_ = f_297_ + f_313_ + f_311_;
	    f_298_ = f_298_ + f_314_ + f_310_;
	    f_299_ = f_299_ + f_315_ + f_311_;
	    f_300_ = f_300_ + f_312_ + f_316_;
	    f_301_ = f_301_ + f_313_ + f_317_;
	}
	float f_318_ = f_300_ + (f_298_ - f);
	float f_319_ = f_299_ + (f_301_ - f_297_);
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932
	    .method1545((i & 0x1) != 0);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8807();
	((Class151_Sub3) this).aClass173_Sub2_8928
	    .method8775(((Class151_Sub3) this).aClass120_Sub4_Sub1_8932);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8776(1);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8774(1);
	((Class151_Sub3) this).aClass173_Sub2_8928
	    .method8775(class120_sub4_sub1);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8754(7681, 8448);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8778(0, 34168, 768);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8788(1);
	float f_320_
	    = (((Class120_Sub4_Sub1) class120_sub4_sub1).aFloat11218
	       / (float) ((Class120_Sub4_Sub1) class120_sub4_sub1).anInt11216);
	float f_321_
	    = (((Class120_Sub4_Sub1) class120_sub4_sub1).aFloat11217
	       / (float) ((Class120_Sub4_Sub1) class120_sub4_sub1).anInt11215);
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F,
				 ((Class120_Sub4_Sub1)
				  (((Class151_Sub3) this)
				   .aClass120_Sub4_Sub1_8932)).aFloat11217);
	OpenGL.glMultiTexCoord2f(33985, f_320_ * (f - (float) i_302_),
				 ((((Class120_Sub4_Sub1) class120_sub4_sub1)
				   .aFloat11217)
				  - f_321_ * (f_297_ - (float) i_303_)));
	OpenGL.glVertex2f(f, f_297_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_320_ * (f_300_ - (float) i_302_),
				 ((((Class120_Sub4_Sub1) class120_sub4_sub1)
				   .aFloat11217)
				  - f_321_ * (f_301_ - (float) i_303_)));
	OpenGL.glVertex2f(f_300_, f_301_);
	OpenGL.glMultiTexCoord2f(33984,
				 ((Class120_Sub4_Sub1)
				  (((Class151_Sub3) this)
				   .aClass120_Sub4_Sub1_8932)).aFloat11218,
				 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_320_ * (f_318_ - (float) i_302_),
				 ((((Class120_Sub4_Sub1) class120_sub4_sub1)
				   .aFloat11217)
				  - f_321_ * (f_319_ - (float) i_303_)));
	OpenGL.glVertex2f(f_318_, f_319_);
	OpenGL.glMultiTexCoord2f(33984,
				 ((Class120_Sub4_Sub1)
				  (((Class151_Sub3) this)
				   .aClass120_Sub4_Sub1_8932)).aFloat11218,
				 ((Class120_Sub4_Sub1)
				  (((Class151_Sub3) this)
				   .aClass120_Sub4_Sub1_8932)).aFloat11217);
	OpenGL.glMultiTexCoord2f(33985, f_320_ * (f_298_ - (float) i_302_),
				 ((((Class120_Sub4_Sub1) class120_sub4_sub1)
				   .aFloat11217)
				  - f_321_ * (f_299_ - (float) i_303_)));
	OpenGL.glVertex2f(f_298_, f_299_);
	OpenGL.glEnd();
	((Class151_Sub3) this).aClass173_Sub2_8928.method8778(0, 5890, 768);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8776(0);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8775(null);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8774(0);
    }
    
    Class151_Sub3(Class173_Sub2 class173_sub2, int i, int i_322_, int i_323_,
		  int i_324_) {
	((Class151_Sub3) this).anInt8930 = 0;
	((Class151_Sub3) this).anInt8933 = 0;
	((Class151_Sub3) this).anInt8934 = 0;
	((Class151_Sub3) this).anInt8935 = 0;
	((Class151_Sub3) this).aClass173_Sub2_8928 = class173_sub2;
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932
	    = Class120_Sub4_Sub1.method10320(class173_sub2, i, i_322_, i_323_,
					     i_324_);
    }
    
    public void method1801(int i, int i_325_, int i_326_, int i_327_) {
	((Class151_Sub3) this).anInt8933 = i;
	((Class151_Sub3) this).anInt8930 = i_325_;
	((Class151_Sub3) this).anInt8935 = i_326_;
	((Class151_Sub3) this).anInt8934 = i_327_;
	((Class151_Sub3) this).aBool8931
	    = (((Class151_Sub3) this).anInt8933 != 0
	       || ((Class151_Sub3) this).anInt8930 != 0
	       || ((Class151_Sub3) this).anInt8935 != 0
	       || ((Class151_Sub3) this).anInt8934 != 0);
    }
    
    void method8330(int i) {
	((Class151_Sub3) this).aClass173_Sub2_8928.method8774(1);
	((Class151_Sub3) this).aClass173_Sub2_8928
	    .method8775(((Class151_Sub3) this).aClass120_Sub4_Sub1_8932);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8754
	    (((Class151_Sub3) this).aClass173_Sub2_8928.method8874(i), 7681);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8778(1, 34167, 768);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8808(0, 34168, 770);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8774(0);
	((Class151_Sub3) this).aClass173_Sub2_8928
	    .method8775(((Class151_Sub3) this).aClass120_Sub4_Sub1_8929);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8754(34479, 7681);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8778(1, 34166, 768);
	if (((Class151_Sub3) this).anInt8927 == 0)
	    ((Class151_Sub3) this).aClass173_Sub2_8928.method8780(1.0F, 0.5F,
								  0.5F, 0.0F);
	else if (((Class151_Sub3) this).anInt8927 == 1)
	    ((Class151_Sub3) this).aClass173_Sub2_8928.method8780(0.5F, 1.0F,
								  0.5F, 0.0F);
	else if (((Class151_Sub3) this).anInt8927 == 2)
	    ((Class151_Sub3) this).aClass173_Sub2_8928.method8780(0.5F, 0.5F,
								  1.0F, 0.0F);
	else if (((Class151_Sub3) this).anInt8927 == 3)
	    ((Class151_Sub3) this).aClass173_Sub2_8928
		.method8780(128.5F, 128.5F, 128.5F, 0.0F);
    }
    
    void method8331() {
	((Class151_Sub3) this).aClass173_Sub2_8928.method8774(1);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8775(null);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8754(8448, 8448);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8778(1, 34168, 768);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8808(0, 5890, 770);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8774(0);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8778(1, 34168, 768);
    }
    
    void method8332() {
	((Class151_Sub3) this).aClass173_Sub2_8928.method8774(1);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8775(null);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8754(8448, 8448);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8778(1, 34168, 768);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8808(0, 5890, 770);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8774(0);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8778(1, 34168, 768);
    }
    
    public void method1798(int i, int i_328_, int i_329_, int i_330_, int[] is,
			   int[] is_331_, int i_332_, int i_333_) {
	((Class151_Sub3) this).aClass120_Sub4_Sub1_8932
	    .method8260(i, i_328_, i_329_, i_330_, is, is_331_, i_332_);
    }
    
    void method8333() {
	((Class151_Sub3) this).aClass173_Sub2_8928.method8774(1);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8775(null);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8754(8448, 8448);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8778(1, 34168, 768);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8808(0, 5890, 770);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8774(0);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8778(1, 34168, 768);
    }
    
    void method8334() {
	((Class151_Sub3) this).aClass173_Sub2_8928.method8774(1);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8775(null);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8754(8448, 8448);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8778(1, 34168, 768);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8808(0, 5890, 770);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8774(0);
	((Class151_Sub3) this).aClass173_Sub2_8928.method8778(1, 34168, 768);
    }
}
