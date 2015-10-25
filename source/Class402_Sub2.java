/* Class402_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;

public class Class402_Sub2 extends Class402 implements Interface34
{
    int anInt10115;
    int anInt10116;
    float aFloat10117;
    float aFloat10118;
    boolean aBool10119;
    boolean aBool10120;
    
    public void method234(int i, int i_0_, int i_1_, int i_2_, byte[] is,
			  Class149 class149, int i_3_, int i_4_) {
	if (((Class402_Sub2) this).aClass149_4449 != class149
	    || (((Class402_Sub2) this).aClass169_4451
		!= Class169.aClass169_1935))
	    throw new RuntimeException();
	if (i_4_ == 0)
	    i_4_ = i_1_;
	((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.method8451
	    (i_4_ * i_2_ * (((Class402_Sub2) this).aClass149_4449.anInt1686
			    * 427009899));
	ByteBuffer bytebuffer
	    = ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.aByteBuffer9222;
	bytebuffer.clear();
	bytebuffer.put(is, i_3_, i_4_ * i_2_);
	IDirect3DTexture.Upload
	    (((Class402_Sub2) this).aLong4453, 0, i, i_0_, i_1_, i_2_,
	     i_4_ * (((Class402_Sub2) this).aClass149_4449.anInt1686
		     * 427009899),
	     0, ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.aLong9223);
    }
    
    public void method219(int i, int i_5_, int i_6_, int i_7_, int[] is,
			  int i_8_) {
	if (((Class402_Sub2) this).aClass149_4449 != Class149.aClass149_1676
	    || (((Class402_Sub2) this).aClass169_4451
		!= Class169.aClass169_1935))
	    throw new RuntimeException();
	((Class402_Sub2) this).aClass173_Sub1_Sub2_4452
	    .method8451(i_6_ * i_7_ * 4);
	ByteBuffer bytebuffer
	    = ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.aByteBuffer9222;
	bytebuffer.clear();
	IDirect3DTexture.Download(((Class402_Sub2) this).aLong4453, 0, i, i_5_,
				  i_6_, i_7_, i_6_ * 4, 0,
				  (((Class402_Sub2) this)
				   .aClass173_Sub1_Sub2_4452.aLong9223));
	bytebuffer.asIntBuffer().get(is, i_8_, i_6_ * i_7_);
    }
    
    public float method210() {
	return ((Class402_Sub2) this).aFloat10117;
    }
    
    Class402_Sub2(Class173_Sub1_Sub2 class173_sub1_sub2, Class149 class149,
		  int i, int i_9_, boolean bool, byte[] is, int i_10_,
		  int i_11_) {
	super(class173_sub1_sub2, class149, Class169.aClass169_1935,
	      bool && ((Class173_Sub1_Sub2) class173_sub1_sub2).aBool11387,
	      i * i_9_);
	if (!((Class173_Sub1_Sub2)
	      ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452).aBool11384) {
	    ((Class402_Sub2) this).anInt10115
		= Class327.method4259(i, -2134279851);
	    ((Class402_Sub2) this).anInt10116
		= Class327.method4259(i_9_, -2134279851);
	    ((Class402_Sub2) this).aFloat10117
		= (float) i / (float) ((Class402_Sub2) this).anInt10115;
	    ((Class402_Sub2) this).aFloat10118
		= (float) i_9_ / (float) ((Class402_Sub2) this).anInt10116;
	    if (i != ((Class402_Sub2) this).anInt10115
		|| i_9_ != ((Class402_Sub2) this).anInt10116) {
		is = (((Class402_Sub2) this).aClass173_Sub1_Sub2_4452
			  .method2280
		      (i, i_9_, ((Class402_Sub2) this).anInt10115,
		       ((Class402_Sub2) this).anInt10116, is, i_10_, i_11_,
		       class149.anInt1686 * 427009899, -1796350185));
		i_10_ = 0;
		i_11_ = ((Class402_Sub2) this).anInt10115;
	    }
	} else {
	    ((Class402_Sub2) this).anInt10115 = i;
	    ((Class402_Sub2) this).anInt10116 = i_9_;
	    ((Class402_Sub2) this).aFloat10117 = 1.0F;
	    ((Class402_Sub2) this).aFloat10118 = 1.0F;
	}
	if (bool)
	    ((Class402_Sub2) this).aLong4453
		= (IDirect3DDevice.CreateTexture
		   ((((Class173_Sub1_Sub2)
		      ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452)
		     .aLong11378),
		    ((Class402_Sub2) this).anInt10115,
		    ((Class402_Sub2) this).anInt10116, 0, 1024,
		    Class173_Sub1_Sub2.method10394((((Class402_Sub2) this)
						    .aClass149_4449),
						   Class169.aClass169_1935),
		    1));
	else
	    ((Class402_Sub2) this).aLong4453
		= (IDirect3DDevice.CreateTexture
		   ((((Class173_Sub1_Sub2)
		      ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452)
		     .aLong11378),
		    ((Class402_Sub2) this).anInt10115,
		    ((Class402_Sub2) this).anInt10116, 1, 0,
		    Class173_Sub1_Sub2.method10394((((Class402_Sub2) this)
						    .aClass149_4449),
						   Class169.aClass169_1935),
		    1));
	if (i_11_ == 0)
	    i_11_ = ((Class402_Sub2) this).anInt10115;
	((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.method8451
	    (i_11_ * ((Class402_Sub2) this).anInt10116
	     * (((Class402_Sub2) this).aClass149_4449.anInt1686 * 427009899));
	ByteBuffer bytebuffer
	    = ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.aByteBuffer9222;
	bytebuffer.clear();
	if (((Class402_Sub2) this).aClass149_4449 == Class149.aClass149_1678) {
	    bytebuffer.put(is, i_10_,
			   (((Class402_Sub2) this).anInt10116
			    * ((Class402_Sub2) this).anInt10115 / 2));
	    IDirect3DTexture.Upload(((Class402_Sub2) this).aLong4453, 0, 0, 0,
				    ((Class402_Sub2) this).anInt10115,
				    ((Class402_Sub2) this).anInt10116 / 4,
				    ((Class402_Sub2) this).anInt10115 / 4 * 8,
				    0,
				    (((Class402_Sub2) this)
				     .aClass173_Sub1_Sub2_4452.aLong9223));
	} else if (((Class402_Sub2) this).aClass149_4449
		   == Class149.aClass149_1675) {
	    bytebuffer.put(is, i_10_, (((Class402_Sub2) this).anInt10116
				       * ((Class402_Sub2) this).anInt10115));
	    IDirect3DTexture.Upload(((Class402_Sub2) this).aLong4453, 0, 0, 0,
				    ((Class402_Sub2) this).anInt10115,
				    ((Class402_Sub2) this).anInt10116 / 4,
				    ((Class402_Sub2) this).anInt10115 / 4 * 16,
				    0,
				    (((Class402_Sub2) this)
				     .aClass173_Sub1_Sub2_4452.aLong9223));
	} else {
	    bytebuffer.put(is, i_10_,
			   i_11_ * ((Class402_Sub2) this).anInt10116);
	    IDirect3DTexture.Upload(((Class402_Sub2) this).aLong4453, 0, 0, 0,
				    ((Class402_Sub2) this).anInt10115,
				    ((Class402_Sub2) this).anInt10116,
				    i_11_ * ((((Class402_Sub2) this)
					      .aClass149_4449.anInt1686)
					     * 427009899),
				    0,
				    (((Class402_Sub2) this)
				     .aClass173_Sub1_Sub2_4452.aLong9223));
	}
    }
    
    Class402_Sub2(Class173_Sub1_Sub2 class173_sub1_sub2, Class149 class149,
		  Class169 class169, int i, int i_12_) {
	this(class173_sub1_sub2, class149, class169, i, i_12_, 0, 1);
    }
    
    public void method247(int i, int i_13_, int i_14_, int i_15_, int[] is,
			  int[] is_16_, int i_17_) {
	if (((Class402_Sub2) this).aClass149_4449 != Class149.aClass149_1676
	    || (((Class402_Sub2) this).aClass169_4451
		!= Class169.aClass169_1935))
	    throw new RuntimeException();
	method206(i, i_13_, i_14_, i_15_, is, null, i_17_);
    }
    
    public void method236(int i, int i_18_, int i_19_, int i_20_, int[] is,
			  int i_21_) {
	if (((Class402_Sub2) this).aClass149_4449 != Class149.aClass149_1676
	    || (((Class402_Sub2) this).aClass169_4451
		!= Class169.aClass169_1935))
	    throw new RuntimeException();
	((Class402_Sub2) this).aClass173_Sub1_Sub2_4452
	    .method8451(i_19_ * i_20_ * 4);
	ByteBuffer bytebuffer
	    = ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.aByteBuffer9222;
	bytebuffer.clear();
	IDirect3DTexture.Download(((Class402_Sub2) this).aLong4453, 0, i,
				  i_18_, i_19_, i_20_, i_19_ * 4, 0,
				  (((Class402_Sub2) this)
				   .aClass173_Sub1_Sub2_4452.aLong9223));
	bytebuffer.asIntBuffer().get(is, i_21_, i_19_ * i_20_);
    }
    
    public boolean method218() {
	return false;
    }
    
    public void method307(Class340 class340) {
	super.method303(class340);
    }
    
    public float method245() {
	return ((Class402_Sub2) this).aFloat10117;
    }
    
    public void method116() {
	super.method115();
    }
    
    public float method207(float f) {
	return f / (float) ((Class402_Sub2) this).anInt10115;
    }
    
    long method4848() {
	return ((Class402_Sub2) this).aLong4453;
    }
    
    public void method303(Class340 class340) {
	super.method303(class340);
    }
    
    public void method220(boolean bool, boolean bool_22_) {
	((Class402_Sub2) this).aBool10119 = bool;
	((Class402_Sub2) this).aBool10120 = bool_22_;
    }
    
    public void method211(int i, int i_23_, int i_24_, int i_25_, int[] is,
			  int i_26_, int i_27_) {
	if (((Class402_Sub2) this).aClass149_4449 != Class149.aClass149_1676
	    || (((Class402_Sub2) this).aClass169_4451
		!= Class169.aClass169_1935))
	    throw new RuntimeException();
	if (i_27_ == 0)
	    i_27_ = i_24_;
	((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.method8451
	    (i_27_ * i_25_ * (((Class402_Sub2) this).aClass149_4449.anInt1686
			      * 427009899));
	ByteBuffer bytebuffer
	    = ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.aByteBuffer9222;
	bytebuffer.clear();
	bytebuffer.asIntBuffer().put(is, i_26_, i_27_ * i_25_);
	IDirect3DTexture.Upload
	    (((Class402_Sub2) this).aLong4453, 0, i, i_23_, i_24_, i_25_,
	     i_27_ * (((Class402_Sub2) this).aClass149_4449.anInt1686
		      * 427009899),
	     0, ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.aLong9223);
    }
    
    public void method212(int i, int i_28_, int i_29_, int i_30_, byte[] is,
			  Class149 class149, int i_31_, int i_32_) {
	if (((Class402_Sub2) this).aClass149_4449 != class149
	    || (((Class402_Sub2) this).aClass169_4451
		!= Class169.aClass169_1935))
	    throw new RuntimeException();
	if (i_32_ == 0)
	    i_32_ = i_29_;
	((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.method8451
	    (i_32_ * i_30_ * (((Class402_Sub2) this).aClass149_4449.anInt1686
			      * 427009899));
	ByteBuffer bytebuffer
	    = ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.aByteBuffer9222;
	bytebuffer.clear();
	bytebuffer.put(is, i_31_, i_32_ * i_30_);
	IDirect3DTexture.Upload
	    (((Class402_Sub2) this).aLong4453, 0, i, i_28_, i_29_, i_30_,
	     i_32_ * (((Class402_Sub2) this).aClass149_4449.anInt1686
		      * 427009899),
	     0, ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.aLong9223);
    }
    
    public int method246() {
	return ((Class402_Sub2) this).anInt10115;
    }
    
    public void method206(int i, int i_33_, int i_34_, int i_35_, int[] is,
			  int[] is_36_, int i_37_) {
	if (((Class402_Sub2) this).aClass149_4449 != Class149.aClass149_1676
	    || (((Class402_Sub2) this).aClass169_4451
		!= Class169.aClass169_1935))
	    throw new RuntimeException();
	method206(i, i_33_, i_34_, i_35_, is, null, i_37_);
    }
    
    public void method216(int i, int i_38_, int i_39_, int i_40_, int i_41_,
			  int i_42_) {
	int[] is = ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452
		       .method2208(i_41_, i_42_, i_39_, i_40_);
	if (is != null) {
	    for (int i_43_ = 0; i_43_ < is.length; i_43_++)
		is[i_43_] |= ~0xffffff;
	    method211(i, i_38_, i_39_, i_40_, is, 0, i_39_);
	}
    }
    
    public void method308() {
	((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.method10388(this);
    }
    
    Class402_Sub2(Class173_Sub1_Sub2 class173_sub1_sub2, Class149 class149,
		  int i, int i_44_, boolean bool, float[] fs, int i_45_,
		  int i_46_) {
	super(class173_sub1_sub2, class149, Class169.aClass169_1935,
	      bool && ((Class173_Sub1_Sub2) class173_sub1_sub2).aBool11387,
	      i * i_44_);
	if (!((Class173_Sub1_Sub2)
	      ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452).aBool11384) {
	    ((Class402_Sub2) this).anInt10115
		= Class327.method4259(i, -2134279851);
	    ((Class402_Sub2) this).anInt10116
		= Class327.method4259(i_44_, -2134279851);
	    ((Class402_Sub2) this).aFloat10117
		= (float) i / (float) ((Class402_Sub2) this).anInt10115;
	    ((Class402_Sub2) this).aFloat10118
		= (float) i_44_ / (float) ((Class402_Sub2) this).anInt10116;
	    if (i != ((Class402_Sub2) this).anInt10115
		|| i_44_ != ((Class402_Sub2) this).anInt10116) {
		fs = (((Class402_Sub2) this).aClass173_Sub1_Sub2_4452
			  .method2279
		      (i, i_44_, ((Class402_Sub2) this).anInt10115,
		       ((Class402_Sub2) this).anInt10116, fs, i_45_, i_46_,
		       class149.anInt1686 * 427009899, -553026162));
		i_45_ = 0;
		i_46_ = ((Class402_Sub2) this).anInt10115;
	    }
	} else {
	    ((Class402_Sub2) this).anInt10115 = i;
	    ((Class402_Sub2) this).anInt10116 = i_44_;
	    ((Class402_Sub2) this).aFloat10117 = 1.0F;
	    ((Class402_Sub2) this).aFloat10118 = 1.0F;
	}
	if (bool)
	    ((Class402_Sub2) this).aLong4453
		= (IDirect3DDevice.CreateTexture
		   ((((Class173_Sub1_Sub2)
		      ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452)
		     .aLong11378),
		    ((Class402_Sub2) this).anInt10115,
		    ((Class402_Sub2) this).anInt10116, 0, 1024,
		    Class173_Sub1_Sub2.method10394((((Class402_Sub2) this)
						    .aClass149_4449),
						   Class169.aClass169_1940),
		    1));
	else
	    ((Class402_Sub2) this).aLong4453
		= (IDirect3DDevice.CreateTexture
		   ((((Class173_Sub1_Sub2)
		      ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452)
		     .aLong11378),
		    ((Class402_Sub2) this).anInt10115,
		    ((Class402_Sub2) this).anInt10116, 1, 0,
		    Class173_Sub1_Sub2.method10394((((Class402_Sub2) this)
						    .aClass149_4449),
						   Class169.aClass169_1940),
		    1));
	if (i_46_ == 0)
	    i_46_ = ((Class402_Sub2) this).anInt10115;
	((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.method8451
	    (i_46_ * ((Class402_Sub2) this).anInt10116
	     * (((Class402_Sub2) this).aClass149_4449.anInt1686 * 427009899)
	     * 4);
	ByteBuffer bytebuffer
	    = ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.aByteBuffer9222;
	bytebuffer.clear();
	bytebuffer.asFloatBuffer().put(fs, i_45_,
				       (i_46_
					* ((Class402_Sub2) this).anInt10116
					* ((((Class402_Sub2) this)
					    .aClass149_4449.anInt1686)
					   * 427009899)));
	IDirect3DTexture.Upload(((Class402_Sub2) this).aLong4453, 0, 0, 0,
				((Class402_Sub2) this).anInt10115,
				((Class402_Sub2) this).anInt10116,
				i_46_ * ((((Class402_Sub2) this).aClass149_4449
					  .anInt1686)
					 * 427009899) * 4,
				0,
				(((Class402_Sub2) this)
				 .aClass173_Sub1_Sub2_4452.aLong9223));
    }
    
    public void method115() {
	super.method115();
    }
    
    public float method221(float f) {
	return f / (float) ((Class402_Sub2) this).anInt10116;
    }
    
    public float method239() {
	return ((Class402_Sub2) this).aFloat10117;
    }
    
    public int method215() {
	return ((Class402_Sub2) this).anInt10115;
    }
    
    public boolean method209() {
	return false;
    }
    
    public int method222() {
	return ((Class402_Sub2) this).anInt10115;
    }
    
    Class402_Sub2(Class173_Sub1_Sub2 class173_sub1_sub2, int i, int i_47_,
		  boolean bool, int[] is, int i_48_, int i_49_) {
	super(class173_sub1_sub2, Class149.aClass149_1676,
	      Class169.aClass169_1935,
	      bool && ((Class173_Sub1_Sub2) class173_sub1_sub2).aBool11387,
	      i * i_47_);
	if (!((Class173_Sub1_Sub2)
	      ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452).aBool11384) {
	    ((Class402_Sub2) this).anInt10115
		= Class327.method4259(i, -2134279851);
	    ((Class402_Sub2) this).anInt10116
		= Class327.method4259(i_47_, -2134279851);
	    ((Class402_Sub2) this).aFloat10117
		= (float) i / (float) ((Class402_Sub2) this).anInt10115;
	    ((Class402_Sub2) this).aFloat10118
		= (float) i_47_ / (float) ((Class402_Sub2) this).anInt10116;
	    if (i != ((Class402_Sub2) this).anInt10115
		|| i_47_ != ((Class402_Sub2) this).anInt10116) {
		is = (((Class402_Sub2) this).aClass173_Sub1_Sub2_4452
			  .method2198
		      (i, i_47_, ((Class402_Sub2) this).anInt10115,
		       ((Class402_Sub2) this).anInt10116, is, i_48_, i_49_,
		       -1993172951));
		i_48_ = 0;
		i_49_ = ((Class402_Sub2) this).anInt10115;
	    }
	} else {
	    ((Class402_Sub2) this).anInt10115 = i;
	    ((Class402_Sub2) this).anInt10116 = i_47_;
	    ((Class402_Sub2) this).aFloat10117 = 1.0F;
	    ((Class402_Sub2) this).aFloat10118 = 1.0F;
	}
	if (bool)
	    ((Class402_Sub2) this).aLong4453
		= (IDirect3DDevice.CreateTexture
		   ((((Class173_Sub1_Sub2)
		      ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452)
		     .aLong11378),
		    ((Class402_Sub2) this).anInt10115,
		    ((Class402_Sub2) this).anInt10116, 0, 1024, 21, 1));
	else
	    ((Class402_Sub2) this).aLong4453
		= (IDirect3DDevice.CreateTexture
		   ((((Class173_Sub1_Sub2)
		      ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452)
		     .aLong11378),
		    ((Class402_Sub2) this).anInt10115,
		    ((Class402_Sub2) this).anInt10116, 1, 0, 21, 1));
	if (i_49_ == 0)
	    i_49_ = ((Class402_Sub2) this).anInt10115;
	((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.method8451
	    (i_49_ * ((Class402_Sub2) this).anInt10116
	     * (((Class402_Sub2) this).aClass149_4449.anInt1686 * 427009899));
	ByteBuffer bytebuffer
	    = ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.aByteBuffer9222;
	bytebuffer.clear();
	bytebuffer.asIntBuffer()
	    .put(is, i_48_, i_49_ * ((Class402_Sub2) this).anInt10116);
	IDirect3DTexture.Upload(((Class402_Sub2) this).aLong4453, 0, 0, 0,
				((Class402_Sub2) this).anInt10115,
				((Class402_Sub2) this).anInt10116,
				i_49_ * ((((Class402_Sub2) this).aClass149_4449
					  .anInt1686)
					 * 427009899),
				0,
				(((Class402_Sub2) this)
				 .aClass173_Sub1_Sub2_4452.aLong9223));
    }
    
    public int method224() {
	return ((Class402_Sub2) this).anInt10116;
    }
    
    public int method225() {
	return ((Class402_Sub2) this).anInt10116;
    }
    
    public float method226(float f) {
	return f / (float) ((Class402_Sub2) this).anInt10115;
    }
    
    public float method208(float f) {
	return f / (float) ((Class402_Sub2) this).anInt10115;
    }
    
    public float method228(float f) {
	return f / (float) ((Class402_Sub2) this).anInt10116;
    }
    
    public float method229(float f) {
	return f / (float) ((Class402_Sub2) this).anInt10116;
    }
    
    public float method213(float f) {
	return f / (float) ((Class402_Sub2) this).anInt10116;
    }
    
    public void method233(int i, int i_50_, int i_51_, int i_52_, int[] is,
			  int i_53_, int i_54_) {
	if (((Class402_Sub2) this).aClass149_4449 != Class149.aClass149_1676
	    || (((Class402_Sub2) this).aClass169_4451
		!= Class169.aClass169_1935))
	    throw new RuntimeException();
	if (i_54_ == 0)
	    i_54_ = i_51_;
	((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.method8451
	    (i_54_ * i_52_ * (((Class402_Sub2) this).aClass149_4449.anInt1686
			      * 427009899));
	ByteBuffer bytebuffer
	    = ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.aByteBuffer9222;
	bytebuffer.clear();
	bytebuffer.asIntBuffer().put(is, i_53_, i_54_ * i_52_);
	IDirect3DTexture.Upload
	    (((Class402_Sub2) this).aLong4453, 0, i, i_50_, i_51_, i_52_,
	     i_54_ * (((Class402_Sub2) this).aClass149_4449.anInt1686
		      * 427009899),
	     0, ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.aLong9223);
    }
    
    public void method231(boolean bool, boolean bool_55_) {
	((Class402_Sub2) this).aBool10119 = bool;
	((Class402_Sub2) this).aBool10120 = bool_55_;
    }
    
    public float method254() {
	return ((Class402_Sub2) this).aFloat10118;
    }
    
    public float method255() {
	return ((Class402_Sub2) this).aFloat10118;
    }
    
    public float method217() {
	return ((Class402_Sub2) this).aFloat10118;
    }
    
    public void method235(int i, int i_56_, int i_57_, int i_58_, byte[] is,
			  Class149 class149, int i_59_, int i_60_) {
	if (((Class402_Sub2) this).aClass149_4449 != class149
	    || (((Class402_Sub2) this).aClass169_4451
		!= Class169.aClass169_1935))
	    throw new RuntimeException();
	if (i_60_ == 0)
	    i_60_ = i_57_;
	((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.method8451
	    (i_60_ * i_58_ * (((Class402_Sub2) this).aClass149_4449.anInt1686
			      * 427009899));
	ByteBuffer bytebuffer
	    = ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.aByteBuffer9222;
	bytebuffer.clear();
	bytebuffer.put(is, i_59_, i_60_ * i_58_);
	IDirect3DTexture.Upload
	    (((Class402_Sub2) this).aLong4453, 0, i, i_56_, i_57_, i_58_,
	     i_60_ * (((Class402_Sub2) this).aClass149_4449.anInt1686
		      * 427009899),
	     0, ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.aLong9223);
    }
    
    public int method250() {
	return ((Class402_Sub2) this).anInt10115;
    }
    
    public void method237(int i, int i_61_, int i_62_, int i_63_, int[] is,
			  int i_64_) {
	if (((Class402_Sub2) this).aClass149_4449 != Class149.aClass149_1676
	    || (((Class402_Sub2) this).aClass169_4451
		!= Class169.aClass169_1935))
	    throw new RuntimeException();
	((Class402_Sub2) this).aClass173_Sub1_Sub2_4452
	    .method8451(i_62_ * i_63_ * 4);
	ByteBuffer bytebuffer
	    = ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.aByteBuffer9222;
	bytebuffer.clear();
	IDirect3DTexture.Download(((Class402_Sub2) this).aLong4453, 0, i,
				  i_61_, i_62_, i_63_, i_62_ * 4, 0,
				  (((Class402_Sub2) this)
				   .aClass173_Sub1_Sub2_4452.aLong9223));
	bytebuffer.asIntBuffer().get(is, i_64_, i_62_ * i_63_);
    }
    
    public void method238(int i, int i_65_, int i_66_, int i_67_, int[] is,
			  int i_68_) {
	if (((Class402_Sub2) this).aClass149_4449 != Class149.aClass149_1676
	    || (((Class402_Sub2) this).aClass169_4451
		!= Class169.aClass169_1935))
	    throw new RuntimeException();
	((Class402_Sub2) this).aClass173_Sub1_Sub2_4452
	    .method8451(i_66_ * i_67_ * 4);
	ByteBuffer bytebuffer
	    = ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.aByteBuffer9222;
	bytebuffer.clear();
	IDirect3DTexture.Download(((Class402_Sub2) this).aLong4453, 0, i,
				  i_65_, i_66_, i_67_, i_66_ * 4, 0,
				  (((Class402_Sub2) this)
				   .aClass173_Sub1_Sub2_4452.aLong9223));
	bytebuffer.asIntBuffer().get(is, i_68_, i_66_ * i_67_);
    }
    
    public void method302(Class340 class340) {
	super.method303(class340);
    }
    
    public void method227(int i, int i_69_, int i_70_, int i_71_, int[] is,
			  int[] is_72_, int i_73_) {
	if (((Class402_Sub2) this).aClass149_4449 != Class149.aClass149_1676
	    || (((Class402_Sub2) this).aClass169_4451
		!= Class169.aClass169_1935))
	    throw new RuntimeException();
	method206(i, i_69_, i_70_, i_71_, is, null, i_73_);
    }
    
    public void method241(int i, int i_74_, int i_75_, int i_76_, int[] is,
			  int[] is_77_, int i_78_) {
	if (((Class402_Sub2) this).aClass149_4449 != Class149.aClass149_1676
	    || (((Class402_Sub2) this).aClass169_4451
		!= Class169.aClass169_1935))
	    throw new RuntimeException();
	method206(i, i_74_, i_75_, i_76_, is, null, i_78_);
    }
    
    public void method242(int i, int i_79_, int i_80_, int i_81_, int[] is,
			  int[] is_82_, int i_83_) {
	if (((Class402_Sub2) this).aClass149_4449 != Class149.aClass149_1676
	    || (((Class402_Sub2) this).aClass169_4451
		!= Class169.aClass169_1935))
	    throw new RuntimeException();
	method206(i, i_79_, i_80_, i_81_, is, null, i_83_);
    }
    
    public void method243(int i, int i_84_, int i_85_, int i_86_, int i_87_,
			  int i_88_) {
	int[] is = ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452
		       .method2208(i_87_, i_88_, i_85_, i_86_);
	if (is != null) {
	    for (int i_89_ = 0; i_89_ < is.length; i_89_++)
		is[i_89_] |= ~0xffffff;
	    method211(i, i_84_, i_85_, i_86_, is, 0, i_85_);
	}
    }
    
    public int method1() {
	return ((Class402_Sub2) this).anInt10115;
    }
    
    public int method68() {
	return ((Class402_Sub2) this).anInt10116;
    }
    
    public void method244(int i, int i_90_, int i_91_, int i_92_, int i_93_,
			  int i_94_) {
	int[] is = ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452
		       .method2208(i_93_, i_94_, i_91_, i_92_);
	if (is != null) {
	    for (int i_95_ = 0; i_95_ < is.length; i_95_++)
		is[i_95_] |= ~0xffffff;
	    method211(i, i_90_, i_91_, i_92_, is, 0, i_91_);
	}
    }
    
    public float method214() {
	return ((Class402_Sub2) this).aFloat10117;
    }
    
    public boolean method248() {
	return false;
    }
    
    public boolean method249() {
	return false;
    }
    
    public boolean method252() {
	return false;
    }
    
    public boolean method251() {
	return false;
    }
    
    public void method256(int i, int i_96_, int i_97_, int i_98_, int[] is,
			  int i_99_, int i_100_) {
	if (((Class402_Sub2) this).aClass149_4449 != Class149.aClass149_1676
	    || (((Class402_Sub2) this).aClass169_4451
		!= Class169.aClass169_1935))
	    throw new RuntimeException();
	if (i_100_ == 0)
	    i_100_ = i_97_;
	((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.method8451
	    (i_100_ * i_98_ * (((Class402_Sub2) this).aClass149_4449.anInt1686
			       * 427009899));
	ByteBuffer bytebuffer
	    = ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.aByteBuffer9222;
	bytebuffer.clear();
	bytebuffer.asIntBuffer().put(is, i_99_, i_100_ * i_98_);
	IDirect3DTexture.Upload
	    (((Class402_Sub2) this).aLong4453, 0, i, i_96_, i_97_, i_98_,
	     i_100_ * (((Class402_Sub2) this).aClass149_4449.anInt1686
		       * 427009899),
	     0, ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.aLong9223);
    }
    
    public void method306() {
	((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.method10388(this);
    }
    
    public void method305() {
	((Class402_Sub2) this).aClass173_Sub1_Sub2_4452.method10388(this);
    }
    
    Class402_Sub2(Class173_Sub1_Sub2 class173_sub1_sub2, Class149 class149,
		  Class169 class169, int i, int i_101_, int i_102_,
		  int i_103_) {
	super(class173_sub1_sub2, class149, class169, false, i * i_101_);
	if (!((Class173_Sub1_Sub2)
	      ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452).aBool11384) {
	    ((Class402_Sub2) this).anInt10115
		= Class327.method4259(i, -2134279851);
	    ((Class402_Sub2) this).anInt10116
		= Class327.method4259(i_101_, -2134279851);
	    ((Class402_Sub2) this).aFloat10117
		= (float) i / (float) ((Class402_Sub2) this).anInt10115;
	    ((Class402_Sub2) this).aFloat10118
		= (float) i_101_ / (float) ((Class402_Sub2) this).anInt10116;
	} else {
	    ((Class402_Sub2) this).anInt10115 = i;
	    ((Class402_Sub2) this).anInt10116 = i_101_;
	    ((Class402_Sub2) this).aFloat10117 = 1.0F;
	    ((Class402_Sub2) this).aFloat10118 = 1.0F;
	}
	((Class402_Sub2) this).aLong4453
	    = (IDirect3DDevice.CreateTexture
	       (((Class173_Sub1_Sub2)
		 ((Class402_Sub2) this).aClass173_Sub1_Sub2_4452).aLong11378,
		((Class402_Sub2) this).anInt10115,
		((Class402_Sub2) this).anInt10116, 0, i_102_,
		Class173_Sub1_Sub2.method10394((((Class402_Sub2) this)
						.aClass149_4449),
					       (((Class402_Sub2) this)
						.aClass169_4451)),
		i_103_));
    }
    
    long method4853() {
	return ((Class402_Sub2) this).aLong4453;
    }
    
    public boolean method232() {
	return true;
    }
    
    public void method304(Class340 class340) {
	super.method303(class340);
    }
    
    public float method253() {
	return ((Class402_Sub2) this).aFloat10118;
    }
    
    public int method223() {
	return ((Class402_Sub2) this).anInt10116;
    }
    
    public boolean method230() {
	return true;
    }
    
    public float method240() {
	return ((Class402_Sub2) this).aFloat10118;
    }
}
