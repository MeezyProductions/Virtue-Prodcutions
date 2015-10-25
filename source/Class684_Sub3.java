/* Class684_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class684_Sub3 extends Class684
{
    Class432[] aClass432Array10792;
    int[] anIntArray10793;
    float[] aFloatArray10794;
    float aFloat10795;
    float aFloat10796;
    int anInt10797 = 0;
    
    abstract void method10085(int i);
    
    public void method10086(Class432 class432, int i, float f, int i_0_) {
	if (((Class684_Sub3) this).aClass432Array10792 == null) {
	    ((Class684_Sub3) this).aClass432Array10792
		= new Class432[] { class432 };
	    ((Class684_Sub3) this).aFloatArray10794 = new float[] { f };
	    ((Class684_Sub3) this).anIntArray10793 = new int[] { i };
	} else {
	    Class432[] class432s
		= (new Class432
		   [1 + ((Class684_Sub3) this).aClass432Array10792.length]);
	    float[] fs
		= (new float
		   [1 + ((Class684_Sub3) this).aClass432Array10792.length]);
	    int[] is
		= (new int
		   [1 + ((Class684_Sub3) this).aClass432Array10792.length]);
	    System.arraycopy(((Class684_Sub3) this).aClass432Array10792, 0,
			     class432s, 0,
			     (((Class684_Sub3) this)
			      .aClass432Array10792).length);
	    System.arraycopy(((Class684_Sub3) this).aFloatArray10794, 0, fs, 0,
			     (((Class684_Sub3) this)
			      .aClass432Array10792).length);
	    System.arraycopy(((Class684_Sub3) this).anIntArray10793, 0, is, 0,
			     (((Class684_Sub3) this)
			      .aClass432Array10792).length);
	    ((Class684_Sub3) this).aClass432Array10792 = class432s;
	    ((Class684_Sub3) this).aFloatArray10794 = fs;
	    ((Class684_Sub3) this).anIntArray10793 = is;
	    ((Class684_Sub3) this).aClass432Array10792
		[((Class684_Sub3) this).aClass432Array10792.length - 1]
		= class432;
	    ((Class684_Sub3) this).aFloatArray10794
		[((Class684_Sub3) this).aFloatArray10794.length - 1]
		= f;
	    ((Class684_Sub3) this).anIntArray10793
		[((Class684_Sub3) this).anIntArray10793.length - 1]
		= i;
	}
    }
    
    public void method8004(float f, int i) {
	Class432 class432 = (((Class684_Sub3) this).aClass432Array10792
			     [((Class684_Sub3) this).anInt10797 * 80581487]);
	if ((((Class684_Sub3) this).aFloatArray10794
	     [((Class684_Sub3) this).anInt10797 * 80581487])
	    > 0.0F) {
	    if ((((Class684_Sub3) this).aFloatArray10794
		 [((Class684_Sub3) this).anInt10797 * 80581487])
		>= f) {
		((Class684_Sub3) this).aFloatArray10794
		    [80581487 * ((Class684_Sub3) this).anInt10797]
		    -= f;
		return;
	    }
	    f -= (((Class684_Sub3) this).aFloatArray10794
		  [80581487 * ((Class684_Sub3) this).anInt10797]);
	    ((Class684_Sub3) this).aFloatArray10794
		[80581487 * ((Class684_Sub3) this).anInt10797]
		= 0.0F;
	}
	float f_1_ = 1.0F / (float) Class262.method3646(-1942229634);
	while (f > 0.0F) {
	    float f_2_ = class432.method5211();
	    if (((Class684_Sub3) this).aFloat10795 >= f_2_) {
		if (((Class684_Sub3) this).aClass432Array10792.length
		    == 1 + ((Class684_Sub3) this).anInt10797 * 80581487)
		    break;
		if ((((Class684_Sub3) this).aFloatArray10794
		     [1 + 80581487 * ((Class684_Sub3) this).anInt10797])
		    >= f) {
		    ((Class684_Sub3) this).aFloatArray10794
			[((Class684_Sub3) this).anInt10797 * 80581487 + 1]
			-= f;
		    break;
		}
		((Class684_Sub3) this).anInt10797 += -846648433;
		f -= (((Class684_Sub3) this).aFloatArray10794
		      [80581487 * ((Class684_Sub3) this).anInt10797]);
		((Class684_Sub3) this).aFloatArray10794
		    [((Class684_Sub3) this).anInt10797 * 80581487]
		    = 0.0F;
		method10085(1632800383);
		((Class684_Sub3) this).aFloat10795 = 0.0F;
		((Class684_Sub3) this).aFloat10796 = 0.0F;
		class432 = (((Class684_Sub3) this).aClass432Array10792
			    [((Class684_Sub3) this).anInt10797 * 80581487]);
		f_2_ = class432.method5211();
	    }
	    while (f > 0.0F && ((Class684_Sub3) this).aFloat10795 < f_2_) {
		((Class684_Sub3) this).aFloat10796
		    = method10088(f_2_, ((Class684_Sub3) this).aFloat10796,
				  Math.min(f, f_1_), -596997190);
		f -= f_1_;
		method10087(((Class684_Sub3) this).aFloat10796, f_2_,
			    867560813);
	    }
	}
    }
    
    void method10087(float f, float f_3_, int i) {
	((Class684_Sub3) this).aFloat10795 += f;
	if (((Class684_Sub3) this).aFloat10795 > f_3_)
	    ((Class684_Sub3) this).aFloat10795 = f_3_;
    }
    
    abstract float method10088(float f, float f_4_, float f_5_, int i);
    
    double[] method10089(int i) {
	return ((Class684_Sub3) this).aClass432Array10792
		   [80581487 * ((Class684_Sub3) this).anInt10797]
		   .method5204(((Class684_Sub3) this).aFloat10795);
    }
    
    public boolean method7986(int i) {
	return null != ((Class684_Sub3) this).aClass432Array10792;
    }
    
    abstract void method10090();
    
    public void method7994(float f) {
	Class432 class432 = (((Class684_Sub3) this).aClass432Array10792
			     [((Class684_Sub3) this).anInt10797 * 80581487]);
	if ((((Class684_Sub3) this).aFloatArray10794
	     [((Class684_Sub3) this).anInt10797 * 80581487])
	    > 0.0F) {
	    if ((((Class684_Sub3) this).aFloatArray10794
		 [((Class684_Sub3) this).anInt10797 * 80581487])
		>= f) {
		((Class684_Sub3) this).aFloatArray10794
		    [80581487 * ((Class684_Sub3) this).anInt10797]
		    -= f;
		return;
	    }
	    f -= (((Class684_Sub3) this).aFloatArray10794
		  [80581487 * ((Class684_Sub3) this).anInt10797]);
	    ((Class684_Sub3) this).aFloatArray10794
		[80581487 * ((Class684_Sub3) this).anInt10797]
		= 0.0F;
	}
	float f_6_ = 1.0F / (float) Class262.method3646(-1901407155);
	while (f > 0.0F) {
	    float f_7_ = class432.method5211();
	    if (((Class684_Sub3) this).aFloat10795 >= f_7_) {
		if (((Class684_Sub3) this).aClass432Array10792.length
		    == 1 + ((Class684_Sub3) this).anInt10797 * 80581487)
		    break;
		if ((((Class684_Sub3) this).aFloatArray10794
		     [1 + 80581487 * ((Class684_Sub3) this).anInt10797])
		    >= f) {
		    ((Class684_Sub3) this).aFloatArray10794
			[((Class684_Sub3) this).anInt10797 * 80581487 + 1]
			-= f;
		    break;
		}
		((Class684_Sub3) this).anInt10797 += -846648433;
		f -= (((Class684_Sub3) this).aFloatArray10794
		      [80581487 * ((Class684_Sub3) this).anInt10797]);
		((Class684_Sub3) this).aFloatArray10794
		    [((Class684_Sub3) this).anInt10797 * 80581487]
		    = 0.0F;
		method10085(-23888567);
		((Class684_Sub3) this).aFloat10795 = 0.0F;
		((Class684_Sub3) this).aFloat10796 = 0.0F;
		class432 = (((Class684_Sub3) this).aClass432Array10792
			    [((Class684_Sub3) this).anInt10797 * 80581487]);
		f_7_ = class432.method5211();
	    }
	    while (f > 0.0F && ((Class684_Sub3) this).aFloat10795 < f_7_) {
		((Class684_Sub3) this).aFloat10796
		    = method10088(f_7_, ((Class684_Sub3) this).aFloat10796,
				  Math.min(f, f_6_), -951285496);
		f -= f_6_;
		method10087(((Class684_Sub3) this).aFloat10796, f_7_,
			    1407703444);
	    }
	}
    }
    
    public Class422 method7988(int i) {
	return method7987(-1914997382);
    }
    
    public Class422 method8000() {
	return method7987(-1914997382);
    }
    
    double[] method10091() {
	return ((Class684_Sub3) this).aClass432Array10792
		   [80581487 * ((Class684_Sub3) this).anInt10797]
		   .method5204(((Class684_Sub3) this).aFloat10795);
    }
    
    abstract void method10092(ByteBuffer class528_sub42, int i, int i_8_);
    
    abstract float method10093(float f, float f_9_, float f_10_);
    
    public void method7990(ByteBuffer class528_sub42, int i) {
	((Class684_Sub3) this).aFloat10795 = 0.0F;
	((Class684_Sub3) this).aFloat10796 = 0.0F;
	((Class684_Sub3) this).anInt10797 = 0;
	int i_11_ = class528_sub42.readUnsignedByte((byte) 103);
	((Class684_Sub3) this).aClass432Array10792 = new Class432[i_11_];
	((Class684_Sub3) this).aFloatArray10794 = new float[i_11_];
	for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
	    ((Class684_Sub3) this).aClass432Array10792[i_12_]
		= new Class432(class528_sub42);
	    ((Class684_Sub3) this).aFloatArray10794[i_12_]
		= class528_sub42.method9635(-2121914844);
	}
	method10092(class528_sub42, i_11_, 416512550);
    }
    
    public Class422 method7987(int i) {
	Class422 class422 = Class422.method5100();
	double[] ds = ((Class684_Sub3) this).aClass432Array10792
			  [80581487 * ((Class684_Sub3) this).anInt10797]
			  .method5204(((Class684_Sub3) this).aFloat10795);
	class422.aFloat4780 = (float) ds[0];
	class422.aFloat4776 = (float) ds[1];
	class422.aFloat4777 = (float) ds[2];
	return class422;
    }
    
    abstract void method10094(ByteBuffer class528_sub42, int i);
    
    public void method7991(float f) {
	Class432 class432 = (((Class684_Sub3) this).aClass432Array10792
			     [((Class684_Sub3) this).anInt10797 * 80581487]);
	if ((((Class684_Sub3) this).aFloatArray10794
	     [((Class684_Sub3) this).anInt10797 * 80581487])
	    > 0.0F) {
	    if ((((Class684_Sub3) this).aFloatArray10794
		 [((Class684_Sub3) this).anInt10797 * 80581487])
		>= f) {
		((Class684_Sub3) this).aFloatArray10794
		    [80581487 * ((Class684_Sub3) this).anInt10797]
		    -= f;
		return;
	    }
	    f -= (((Class684_Sub3) this).aFloatArray10794
		  [80581487 * ((Class684_Sub3) this).anInt10797]);
	    ((Class684_Sub3) this).aFloatArray10794
		[80581487 * ((Class684_Sub3) this).anInt10797]
		= 0.0F;
	}
	float f_13_ = 1.0F / (float) Class262.method3646(-2067073266);
	while (f > 0.0F) {
	    float f_14_ = class432.method5211();
	    if (((Class684_Sub3) this).aFloat10795 >= f_14_) {
		if (((Class684_Sub3) this).aClass432Array10792.length
		    == 1 + ((Class684_Sub3) this).anInt10797 * 80581487)
		    break;
		if ((((Class684_Sub3) this).aFloatArray10794
		     [1 + 80581487 * ((Class684_Sub3) this).anInt10797])
		    >= f) {
		    ((Class684_Sub3) this).aFloatArray10794
			[((Class684_Sub3) this).anInt10797 * 80581487 + 1]
			-= f;
		    break;
		}
		((Class684_Sub3) this).anInt10797 += -846648433;
		f -= (((Class684_Sub3) this).aFloatArray10794
		      [80581487 * ((Class684_Sub3) this).anInt10797]);
		((Class684_Sub3) this).aFloatArray10794
		    [((Class684_Sub3) this).anInt10797 * 80581487]
		    = 0.0F;
		method10085(707374045);
		((Class684_Sub3) this).aFloat10795 = 0.0F;
		((Class684_Sub3) this).aFloat10796 = 0.0F;
		class432 = (((Class684_Sub3) this).aClass432Array10792
			    [((Class684_Sub3) this).anInt10797 * 80581487]);
		f_14_ = class432.method5211();
	    }
	    while (f > 0.0F && ((Class684_Sub3) this).aFloat10795 < f_14_) {
		((Class684_Sub3) this).aFloat10796
		    = method10088(f_14_, ((Class684_Sub3) this).aFloat10796,
				  Math.min(f, f_13_), -1751017010);
		f -= f_13_;
		method10087(((Class684_Sub3) this).aFloat10796, f_14_,
			    1234285643);
	    }
	}
    }
    
    public void method7999(float f) {
	Class432 class432 = (((Class684_Sub3) this).aClass432Array10792
			     [((Class684_Sub3) this).anInt10797 * 80581487]);
	if ((((Class684_Sub3) this).aFloatArray10794
	     [((Class684_Sub3) this).anInt10797 * 80581487])
	    > 0.0F) {
	    if ((((Class684_Sub3) this).aFloatArray10794
		 [((Class684_Sub3) this).anInt10797 * 80581487])
		>= f) {
		((Class684_Sub3) this).aFloatArray10794
		    [80581487 * ((Class684_Sub3) this).anInt10797]
		    -= f;
		return;
	    }
	    f -= (((Class684_Sub3) this).aFloatArray10794
		  [80581487 * ((Class684_Sub3) this).anInt10797]);
	    ((Class684_Sub3) this).aFloatArray10794
		[80581487 * ((Class684_Sub3) this).anInt10797]
		= 0.0F;
	}
	float f_15_ = 1.0F / (float) Class262.method3646(-1951344613);
	while (f > 0.0F) {
	    float f_16_ = class432.method5211();
	    if (((Class684_Sub3) this).aFloat10795 >= f_16_) {
		if (((Class684_Sub3) this).aClass432Array10792.length
		    == 1 + ((Class684_Sub3) this).anInt10797 * 80581487)
		    break;
		if ((((Class684_Sub3) this).aFloatArray10794
		     [1 + 80581487 * ((Class684_Sub3) this).anInt10797])
		    >= f) {
		    ((Class684_Sub3) this).aFloatArray10794
			[((Class684_Sub3) this).anInt10797 * 80581487 + 1]
			-= f;
		    break;
		}
		((Class684_Sub3) this).anInt10797 += -846648433;
		f -= (((Class684_Sub3) this).aFloatArray10794
		      [80581487 * ((Class684_Sub3) this).anInt10797]);
		((Class684_Sub3) this).aFloatArray10794
		    [((Class684_Sub3) this).anInt10797 * 80581487]
		    = 0.0F;
		method10085(1842786230);
		((Class684_Sub3) this).aFloat10795 = 0.0F;
		((Class684_Sub3) this).aFloat10796 = 0.0F;
		class432 = (((Class684_Sub3) this).aClass432Array10792
			    [((Class684_Sub3) this).anInt10797 * 80581487]);
		f_16_ = class432.method5211();
	    }
	    while (f > 0.0F && ((Class684_Sub3) this).aFloat10795 < f_16_) {
		((Class684_Sub3) this).aFloat10796
		    = method10088(f_16_, ((Class684_Sub3) this).aFloat10796,
				  Math.min(f, f_15_), -926689327);
		f -= f_15_;
		method10087(((Class684_Sub3) this).aFloat10796, f_16_,
			    1380886444);
	    }
	}
    }
    
    public void method7993(float f) {
	Class432 class432 = (((Class684_Sub3) this).aClass432Array10792
			     [((Class684_Sub3) this).anInt10797 * 80581487]);
	if ((((Class684_Sub3) this).aFloatArray10794
	     [((Class684_Sub3) this).anInt10797 * 80581487])
	    > 0.0F) {
	    if ((((Class684_Sub3) this).aFloatArray10794
		 [((Class684_Sub3) this).anInt10797 * 80581487])
		>= f) {
		((Class684_Sub3) this).aFloatArray10794
		    [80581487 * ((Class684_Sub3) this).anInt10797]
		    -= f;
		return;
	    }
	    f -= (((Class684_Sub3) this).aFloatArray10794
		  [80581487 * ((Class684_Sub3) this).anInt10797]);
	    ((Class684_Sub3) this).aFloatArray10794
		[80581487 * ((Class684_Sub3) this).anInt10797]
		= 0.0F;
	}
	float f_17_ = 1.0F / (float) Class262.method3646(-1892653026);
	while (f > 0.0F) {
	    float f_18_ = class432.method5211();
	    if (((Class684_Sub3) this).aFloat10795 >= f_18_) {
		if (((Class684_Sub3) this).aClass432Array10792.length
		    == 1 + ((Class684_Sub3) this).anInt10797 * 80581487)
		    break;
		if ((((Class684_Sub3) this).aFloatArray10794
		     [1 + 80581487 * ((Class684_Sub3) this).anInt10797])
		    >= f) {
		    ((Class684_Sub3) this).aFloatArray10794
			[((Class684_Sub3) this).anInt10797 * 80581487 + 1]
			-= f;
		    break;
		}
		((Class684_Sub3) this).anInt10797 += -846648433;
		f -= (((Class684_Sub3) this).aFloatArray10794
		      [80581487 * ((Class684_Sub3) this).anInt10797]);
		((Class684_Sub3) this).aFloatArray10794
		    [((Class684_Sub3) this).anInt10797 * 80581487]
		    = 0.0F;
		method10085(2128650751);
		((Class684_Sub3) this).aFloat10795 = 0.0F;
		((Class684_Sub3) this).aFloat10796 = 0.0F;
		class432 = (((Class684_Sub3) this).aClass432Array10792
			    [((Class684_Sub3) this).anInt10797 * 80581487]);
		f_18_ = class432.method5211();
	    }
	    while (f > 0.0F && ((Class684_Sub3) this).aFloat10795 < f_18_) {
		((Class684_Sub3) this).aFloat10796
		    = method10088(f_18_, ((Class684_Sub3) this).aFloat10796,
				  Math.min(f, f_17_), -2053737574);
		f -= f_17_;
		method10087(((Class684_Sub3) this).aFloat10796, f_18_,
			    1986716288);
	    }
	}
    }
    
    abstract void method10095();
    
    public boolean method7995() {
	return null != ((Class684_Sub3) this).aClass432Array10792;
    }
    
    public Class422 method7998() {
	Class422 class422 = Class422.method5100();
	double[] ds = ((Class684_Sub3) this).aClass432Array10792
			  [80581487 * ((Class684_Sub3) this).anInt10797]
			  .method5204(((Class684_Sub3) this).aFloat10795);
	class422.aFloat4780 = (float) ds[0];
	class422.aFloat4776 = (float) ds[1];
	class422.aFloat4777 = (float) ds[2];
	return class422;
    }
    
    public void method7997(Class284 class284, Class433 class433, int i,
			   int i_19_, float f) {
	double[] ds
	    = ((Class684_Sub3) this).aClass283_8607.method3795((byte) 72);
	ds[0] -= (double) i;
	ds[2] -= (double) i_19_;
	double[] ds_20_ = method10089(1948022950);
	ds_20_[0] -= (double) i;
	ds_20_[2] -= (double) i_19_;
	ds[1] *= -1.0;
	ds_20_[1] *= -1.0;
	Class422 class422 = Class422.method5100();
	class422.aFloat4780 = (float) (ds_20_[0] - ds[0]);
	class422.aFloat4776 = (float) (ds_20_[1] - ds[1]);
	class422.aFloat4777 = (float) (ds_20_[2] - ds[2]);
	class422.method5062();
	Class430 class430 = new Class430();
	class430.method5167(class422, f);
	Class422 class422_21_ = Class422.method5051(0.0F, 1.0F, 0.0F);
	Class422 class422_22_ = Class422.method5068(class422, class422_21_);
	class422_21_ = Class422.method5068(class422_22_, class422);
	class422_21_.method5075(class430);
	class433.method5220(ds[0], ds[1], ds[2], ds_20_[0], ds_20_[1],
			    ds_20_[2], class422_21_.aFloat4780,
			    class422_21_.aFloat4776, class422_21_.aFloat4777);
	class422_21_.method5054();
    }
    
    public Class422 method7992() {
	Class422 class422 = Class422.method5100();
	double[] ds = ((Class684_Sub3) this).aClass432Array10792
			  [80581487 * ((Class684_Sub3) this).anInt10797]
			  .method5204(((Class684_Sub3) this).aFloat10795);
	class422.aFloat4780 = (float) ds[0];
	class422.aFloat4776 = (float) ds[1];
	class422.aFloat4777 = (float) ds[2];
	return class422;
    }
    
    public void method7996(Class284 class284, Class433 class433, int i,
			   int i_23_, float f) {
	double[] ds
	    = ((Class684_Sub3) this).aClass283_8607.method3795((byte) 83);
	ds[0] -= (double) i;
	ds[2] -= (double) i_23_;
	double[] ds_24_ = method10089(1948022950);
	ds_24_[0] -= (double) i;
	ds_24_[2] -= (double) i_23_;
	ds[1] *= -1.0;
	ds_24_[1] *= -1.0;
	Class422 class422 = Class422.method5100();
	class422.aFloat4780 = (float) (ds_24_[0] - ds[0]);
	class422.aFloat4776 = (float) (ds_24_[1] - ds[1]);
	class422.aFloat4777 = (float) (ds_24_[2] - ds[2]);
	class422.method5062();
	Class430 class430 = new Class430();
	class430.method5167(class422, f);
	Class422 class422_25_ = Class422.method5051(0.0F, 1.0F, 0.0F);
	Class422 class422_26_ = Class422.method5068(class422, class422_25_);
	class422_25_ = Class422.method5068(class422_26_, class422);
	class422_25_.method5075(class430);
	class433.method5220(ds[0], ds[1], ds[2], ds_24_[0], ds_24_[1],
			    ds_24_[2], class422_25_.aFloat4780,
			    class422_25_.aFloat4776, class422_25_.aFloat4777);
	class422_25_.method5054();
    }
    
    public Class422 method7985() {
	Class422 class422 = Class422.method5100();
	double[] ds = ((Class684_Sub3) this).aClass432Array10792
			  [80581487 * ((Class684_Sub3) this).anInt10797]
			  .method5204(((Class684_Sub3) this).aFloat10795);
	class422.aFloat4780 = (float) ds[0];
	class422.aFloat4776 = (float) ds[1];
	class422.aFloat4777 = (float) ds[2];
	return class422;
    }
    
    public Class422 method8001() {
	Class422 class422 = Class422.method5100();
	double[] ds = ((Class684_Sub3) this).aClass432Array10792
			  [80581487 * ((Class684_Sub3) this).anInt10797]
			  .method5204(((Class684_Sub3) this).aFloat10795);
	class422.aFloat4780 = (float) ds[0];
	class422.aFloat4776 = (float) ds[1];
	class422.aFloat4777 = (float) ds[2];
	return class422;
    }
    
    Class684_Sub3(Class283 class283) {
	super(class283);
	((Class684_Sub3) this).aFloat10795 = 0.0F;
	((Class684_Sub3) this).aFloat10796 = 0.0F;
    }
    
    public void method8003(ByteBuffer class528_sub42) {
	((Class684_Sub3) this).aFloat10795 = 0.0F;
	((Class684_Sub3) this).aFloat10796 = 0.0F;
	((Class684_Sub3) this).anInt10797 = 0;
	int i = class528_sub42.readUnsignedByte((byte) 57);
	((Class684_Sub3) this).aClass432Array10792 = new Class432[i];
	((Class684_Sub3) this).aFloatArray10794 = new float[i];
	for (int i_27_ = 0; i_27_ < i; i_27_++) {
	    ((Class684_Sub3) this).aClass432Array10792[i_27_]
		= new Class432(class528_sub42);
	    ((Class684_Sub3) this).aFloatArray10794[i_27_]
		= class528_sub42.method9635(-1820774286);
	}
	method10092(class528_sub42, i, -1815662309);
    }
    
    public void method8002(ByteBuffer class528_sub42) {
	((Class684_Sub3) this).aFloat10795 = 0.0F;
	((Class684_Sub3) this).aFloat10796 = 0.0F;
	((Class684_Sub3) this).anInt10797 = 0;
	int i = class528_sub42.readUnsignedByte((byte) 7);
	((Class684_Sub3) this).aClass432Array10792 = new Class432[i];
	((Class684_Sub3) this).aFloatArray10794 = new float[i];
	for (int i_28_ = 0; i_28_ < i; i_28_++) {
	    ((Class684_Sub3) this).aClass432Array10792[i_28_]
		= new Class432(class528_sub42);
	    ((Class684_Sub3) this).aFloatArray10794[i_28_]
		= class528_sub42.method9635(-2055499693);
	}
	method10092(class528_sub42, i, 1688868086);
    }
    
    public void method8005(ByteBuffer class528_sub42) {
	((Class684_Sub3) this).aFloat10795 = 0.0F;
	((Class684_Sub3) this).aFloat10796 = 0.0F;
	((Class684_Sub3) this).anInt10797 = 0;
	int i = class528_sub42.readUnsignedByte((byte) 50);
	((Class684_Sub3) this).aClass432Array10792 = new Class432[i];
	((Class684_Sub3) this).aFloatArray10794 = new float[i];
	for (int i_29_ = 0; i_29_ < i; i_29_++) {
	    ((Class684_Sub3) this).aClass432Array10792[i_29_]
		= new Class432(class528_sub42);
	    ((Class684_Sub3) this).aFloatArray10794[i_29_]
		= class528_sub42.method9635(-1508676639);
	}
	method10092(class528_sub42, i, 1305404281);
    }
    
    void method10096(float f, float f_30_) {
	((Class684_Sub3) this).aFloat10795 += f;
	if (((Class684_Sub3) this).aFloat10795 > f_30_)
	    ((Class684_Sub3) this).aFloat10795 = f_30_;
    }
    
    public void method7989(Class284 class284, Class433 class433, int i,
			   int i_31_, float f, short i_32_) {
	double[] ds
	    = ((Class684_Sub3) this).aClass283_8607.method3795((byte) 98);
	ds[0] -= (double) i;
	ds[2] -= (double) i_31_;
	double[] ds_33_ = method10089(1948022950);
	ds_33_[0] -= (double) i;
	ds_33_[2] -= (double) i_31_;
	ds[1] *= -1.0;
	ds_33_[1] *= -1.0;
	Class422 class422 = Class422.method5100();
	class422.aFloat4780 = (float) (ds_33_[0] - ds[0]);
	class422.aFloat4776 = (float) (ds_33_[1] - ds[1]);
	class422.aFloat4777 = (float) (ds_33_[2] - ds[2]);
	class422.method5062();
	Class430 class430 = new Class430();
	class430.method5167(class422, f);
	Class422 class422_34_ = Class422.method5051(0.0F, 1.0F, 0.0F);
	Class422 class422_35_ = Class422.method5068(class422, class422_34_);
	class422_34_ = Class422.method5068(class422_35_, class422);
	class422_34_.method5075(class430);
	class433.method5220(ds[0], ds[1], ds[2], ds_33_[0], ds_33_[1],
			    ds_33_[2], class422_34_.aFloat4780,
			    class422_34_.aFloat4776, class422_34_.aFloat4777);
	class422_34_.method5054();
    }
    
    double[] method10097() {
	return ((Class684_Sub3) this).aClass432Array10792
		   [80581487 * ((Class684_Sub3) this).anInt10797]
		   .method5204(((Class684_Sub3) this).aFloat10795);
    }
}
