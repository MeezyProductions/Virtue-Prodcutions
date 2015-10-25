/* Class326_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class326_Sub3 extends Class326
{
    float aFloat10057;
    Class432[] aClass432Array10058;
    int anInt10059 = 0;
    float aFloat10060 = 0.0F;
    float[] aFloatArray10061;
    int[] anIntArray10062;
    
    public float method9126(short i) {
	return ((Class326_Sub3) this).aClass432Array10058
		   [-418730201 * ((Class326_Sub3) this).anInt10059]
		   .method5205(((Class326_Sub3) this).aFloat10060);
    }
    
    Class326_Sub3(Class283 class283) {
	super(class283);
	((Class326_Sub3) this).aFloat10057 = 0.0F;
    }
    
    public boolean method4238(int i) {
	return null != ((Class326_Sub3) this).aClass432Array10058;
    }
    
    void method9127(float f, float f_0_, int i) {
	((Class326_Sub3) this).aFloat10060 += f;
	if (((Class326_Sub3) this).aFloat10060 > f_0_)
	    ((Class326_Sub3) this).aFloat10060 = f_0_;
    }
    
    abstract float method9128(float f, float f_1_, float f_2_, int i);
    
    abstract void method9129(int i);
    
    public void method4242(Class284 class284, int i, int i_3_) {
	Class422 class422 = method4236((byte) 24);
	class284.anInt3118 = ((int) class422.aFloat4780 - i) * 330589953;
	class284.anInt3116 = -160556263 * (int) -class422.aFloat4776;
	class284.anInt3117 = ((int) class422.aFloat4777 - i_3_) * 1998082863;
    }
    
    public void method4251(float f, int[][][] is, Class466 class466, int i,
			   int i_4_, int i_5_) {
	Class432 class432 = (((Class326_Sub3) this).aClass432Array10058
			     [((Class326_Sub3) this).anInt10059 * -418730201]);
	if ((((Class326_Sub3) this).aFloatArray10061
	     [-418730201 * ((Class326_Sub3) this).anInt10059])
	    > 0.0F) {
	    if ((((Class326_Sub3) this).aFloatArray10061
		 [-418730201 * ((Class326_Sub3) this).anInt10059])
		>= f) {
		((Class326_Sub3) this).aFloatArray10061
		    [-418730201 * ((Class326_Sub3) this).anInt10059]
		    -= f;
		return;
	    }
	    f -= (((Class326_Sub3) this).aFloatArray10061
		  [-418730201 * ((Class326_Sub3) this).anInt10059]);
	    ((Class326_Sub3) this).aFloatArray10061
		[((Class326_Sub3) this).anInt10059 * -418730201]
		= 0.0F;
	}
	float f_6_ = 1.0F / (float) Class262.method3646(-1929379754);
	while (f > 0.0F) {
	    float f_7_ = class432.method5211();
	    if (((Class326_Sub3) this).aFloat10060 >= f_7_) {
		if (1 + ((Class326_Sub3) this).anInt10059 * -418730201
		    == ((Class326_Sub3) this).aClass432Array10058.length)
		    break;
		if ((((Class326_Sub3) this).aFloatArray10061
		     [((Class326_Sub3) this).anInt10059 * -418730201 + 1])
		    >= f) {
		    ((Class326_Sub3) this).aFloatArray10061
			[1 + ((Class326_Sub3) this).anInt10059 * -418730201]
			-= f;
		    break;
		}
		((Class326_Sub3) this).anInt10059 += -1872375657;
		f -= (((Class326_Sub3) this).aFloatArray10061
		      [-418730201 * ((Class326_Sub3) this).anInt10059]);
		((Class326_Sub3) this).aFloatArray10061
		    [-418730201 * ((Class326_Sub3) this).anInt10059]
		    = 0.0F;
		method9129(1497889520);
		((Class326_Sub3) this).aFloat10060 = 0.0F;
		((Class326_Sub3) this).aFloat10057 = 0.0F;
		class432 = (((Class326_Sub3) this).aClass432Array10058
			    [((Class326_Sub3) this).anInt10059 * -418730201]);
		f_7_ = class432.method5211();
	    }
	    while (f > 0.0F && ((Class326_Sub3) this).aFloat10060 < f_7_) {
		((Class326_Sub3) this).aFloat10057
		    = method9128(f_7_, ((Class326_Sub3) this).aFloat10057,
				 Math.min(f, f_6_), 1668482188);
		f -= f_6_;
		method9127(((Class326_Sub3) this).aFloat10057, f_7_, 65534);
	    }
	}
    }
    
    public float method9130() {
	return ((Class326_Sub3) this).aClass432Array10058
		   [-418730201 * ((Class326_Sub3) this).anInt10059]
		   .method5205(((Class326_Sub3) this).aFloat10060);
    }
    
    public double[] method4240(int i) {
	return ((Class326_Sub3) this).aClass432Array10058
		   [((Class326_Sub3) this).anInt10059 * -418730201]
		   .method5204(((Class326_Sub3) this).aFloat10060);
    }
    
    public float method9131() {
	return ((Class326_Sub3) this).aClass432Array10058
		   [-418730201 * ((Class326_Sub3) this).anInt10059]
		   .method5205(((Class326_Sub3) this).aFloat10060);
    }
    
    public float method4250(int i) {
	return ((Class326_Sub3) this).aClass432Array10058
		   [-418730201 * ((Class326_Sub3) this).anInt10059]
		   .method5214(((Class326_Sub3) this).aFloat10060);
    }
    
    public void method4239(Class284 class284, int i, int i_8_, byte i_9_) {
	Class422 class422 = method4236((byte) 95);
	class284.anInt3118 = ((int) class422.aFloat4780 - i) * 330589953;
	class284.anInt3116 = -160556263 * (int) -class422.aFloat4776;
	class284.anInt3117 = ((int) class422.aFloat4777 - i_8_) * 1998082863;
    }
    
    public void method4244(ByteBuffer class528_sub42, byte i) {
	((Class326_Sub3) this).aFloat10060 = 0.0F;
	((Class326_Sub3) this).aFloat10057 = 0.0F;
	((Class326_Sub3) this).anInt10059 = 0;
	int i_10_ = class528_sub42.readUnsignedByte((byte) 54);
	((Class326_Sub3) this).aClass432Array10058 = new Class432[i_10_];
	((Class326_Sub3) this).aFloatArray10061 = new float[i_10_];
	for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
	    ((Class326_Sub3) this).aClass432Array10058[i_11_]
		= new Class432(class528_sub42);
	    ((Class326_Sub3) this).aFloatArray10061[i_11_]
		= class528_sub42.method9635(-1610707009);
	}
	method9139(class528_sub42, i_10_, (byte) 55);
    }
    
    abstract void method9132(ByteBuffer class528_sub42, int i);
    
    abstract float method9133(float f, float f_12_, float f_13_);
    
    abstract void method9134();
    
    public Class422 method4236(byte i) {
	Class422 class422 = Class422.method5100();
	double[] ds = ((Class326_Sub3) this).aClass432Array10058
			  [-418730201 * ((Class326_Sub3) this).anInt10059]
			  .method5204(((Class326_Sub3) this).aFloat10060);
	class422.aFloat4780 = (float) ds[0];
	class422.aFloat4776 = (float) ds[1];
	class422.aFloat4777 = (float) ds[2];
	return class422;
    }
    
    public void method9135(Class432 class432, int i, float f, int i_14_) {
	if (null == ((Class326_Sub3) this).aClass432Array10058) {
	    ((Class326_Sub3) this).aClass432Array10058
		= new Class432[] { class432 };
	    ((Class326_Sub3) this).aFloatArray10061 = new float[] { f };
	    ((Class326_Sub3) this).anIntArray10062 = new int[] { i };
	} else {
	    Class432[] class432s
		= (new Class432
		   [1 + ((Class326_Sub3) this).aClass432Array10058.length]);
	    float[] fs
		= (new float
		   [1 + ((Class326_Sub3) this).aClass432Array10058.length]);
	    int[] is
		= (new int
		   [((Class326_Sub3) this).aClass432Array10058.length + 1]);
	    System.arraycopy(((Class326_Sub3) this).aClass432Array10058, 0,
			     class432s, 0,
			     (((Class326_Sub3) this)
			      .aClass432Array10058).length);
	    System.arraycopy(((Class326_Sub3) this).aFloatArray10061, 0, fs, 0,
			     (((Class326_Sub3) this)
			      .aClass432Array10058).length);
	    System.arraycopy(((Class326_Sub3) this).anIntArray10062, 0, is, 0,
			     (((Class326_Sub3) this)
			      .aClass432Array10058).length);
	    ((Class326_Sub3) this).aClass432Array10058 = class432s;
	    ((Class326_Sub3) this).aFloatArray10061 = fs;
	    ((Class326_Sub3) this).anIntArray10062 = is;
	    ((Class326_Sub3) this).aClass432Array10058
		[((Class326_Sub3) this).aClass432Array10058.length - 1]
		= class432;
	    ((Class326_Sub3) this).aFloatArray10061
		[((Class326_Sub3) this).aFloatArray10061.length - 1]
		= f;
	    ((Class326_Sub3) this).anIntArray10062
		[((Class326_Sub3) this).anIntArray10062.length - 1]
		= i;
	}
    }
    
    public void method4245(float f, int[][][] is, Class466 class466, int i,
			   int i_15_) {
	Class432 class432 = (((Class326_Sub3) this).aClass432Array10058
			     [((Class326_Sub3) this).anInt10059 * -418730201]);
	if ((((Class326_Sub3) this).aFloatArray10061
	     [-418730201 * ((Class326_Sub3) this).anInt10059])
	    > 0.0F) {
	    if ((((Class326_Sub3) this).aFloatArray10061
		 [-418730201 * ((Class326_Sub3) this).anInt10059])
		>= f) {
		((Class326_Sub3) this).aFloatArray10061
		    [-418730201 * ((Class326_Sub3) this).anInt10059]
		    -= f;
		return;
	    }
	    f -= (((Class326_Sub3) this).aFloatArray10061
		  [-418730201 * ((Class326_Sub3) this).anInt10059]);
	    ((Class326_Sub3) this).aFloatArray10061
		[((Class326_Sub3) this).anInt10059 * -418730201]
		= 0.0F;
	}
	float f_16_ = 1.0F / (float) Class262.method3646(-1888480003);
	while (f > 0.0F) {
	    float f_17_ = class432.method5211();
	    if (((Class326_Sub3) this).aFloat10060 >= f_17_) {
		if (1 + ((Class326_Sub3) this).anInt10059 * -418730201
		    == ((Class326_Sub3) this).aClass432Array10058.length)
		    break;
		if ((((Class326_Sub3) this).aFloatArray10061
		     [((Class326_Sub3) this).anInt10059 * -418730201 + 1])
		    >= f) {
		    ((Class326_Sub3) this).aFloatArray10061
			[1 + ((Class326_Sub3) this).anInt10059 * -418730201]
			-= f;
		    break;
		}
		((Class326_Sub3) this).anInt10059 += -1872375657;
		f -= (((Class326_Sub3) this).aFloatArray10061
		      [-418730201 * ((Class326_Sub3) this).anInt10059]);
		((Class326_Sub3) this).aFloatArray10061
		    [-418730201 * ((Class326_Sub3) this).anInt10059]
		    = 0.0F;
		method9129(-1742484351);
		((Class326_Sub3) this).aFloat10060 = 0.0F;
		((Class326_Sub3) this).aFloat10057 = 0.0F;
		class432 = (((Class326_Sub3) this).aClass432Array10058
			    [((Class326_Sub3) this).anInt10059 * -418730201]);
		f_17_ = class432.method5211();
	    }
	    while (f > 0.0F && ((Class326_Sub3) this).aFloat10060 < f_17_) {
		((Class326_Sub3) this).aFloat10057
		    = method9128(f_17_, ((Class326_Sub3) this).aFloat10057,
				 Math.min(f, f_16_), 491708621);
		f -= f_16_;
		method9127(((Class326_Sub3) this).aFloat10057, f_17_, 65534);
	    }
	}
    }
    
    public boolean method4246() {
	return null != ((Class326_Sub3) this).aClass432Array10058;
    }
    
    public boolean method4247() {
	return null != ((Class326_Sub3) this).aClass432Array10058;
    }
    
    public Class422 method4248() {
	Class422 class422 = Class422.method5100();
	double[] ds = ((Class326_Sub3) this).aClass432Array10058
			  [-418730201 * ((Class326_Sub3) this).anInt10059]
			  .method5204(((Class326_Sub3) this).aFloat10060);
	class422.aFloat4780 = (float) ds[0];
	class422.aFloat4776 = (float) ds[1];
	class422.aFloat4777 = (float) ds[2];
	return class422;
    }
    
    public Class422 method4254() {
	Class422 class422 = Class422.method5100();
	double[] ds = ((Class326_Sub3) this).aClass432Array10058
			  [-418730201 * ((Class326_Sub3) this).anInt10059]
			  .method5204(((Class326_Sub3) this).aFloat10060);
	class422.aFloat4780 = (float) ds[0];
	class422.aFloat4776 = (float) ds[1];
	class422.aFloat4777 = (float) ds[2];
	return class422;
    }
    
    public double[] method4237() {
	return ((Class326_Sub3) this).aClass432Array10058
		   [((Class326_Sub3) this).anInt10059 * -418730201]
		   .method5204(((Class326_Sub3) this).aFloat10060);
    }
    
    public Class528_Sub19 method4243() {
	Class422 class422 = method4236((byte) 99);
	return new Class528_Sub19(0, (int) class422.aFloat4780,
				  (int) class422.aFloat4776,
				  (int) class422.aFloat4777);
    }
    
    public void method4252(Class284 class284, int i, int i_18_) {
	Class422 class422 = method4236((byte) 52);
	class284.anInt3118 = ((int) class422.aFloat4780 - i) * 330589953;
	class284.anInt3116 = -160556263 * (int) -class422.aFloat4776;
	class284.anInt3117 = ((int) class422.aFloat4777 - i_18_) * 1998082863;
    }
    
    public void method4249(ByteBuffer class528_sub42) {
	((Class326_Sub3) this).aFloat10060 = 0.0F;
	((Class326_Sub3) this).aFloat10057 = 0.0F;
	((Class326_Sub3) this).anInt10059 = 0;
	int i = class528_sub42.readUnsignedByte((byte) 107);
	((Class326_Sub3) this).aClass432Array10058 = new Class432[i];
	((Class326_Sub3) this).aFloatArray10061 = new float[i];
	for (int i_19_ = 0; i_19_ < i; i_19_++) {
	    ((Class326_Sub3) this).aClass432Array10058[i_19_]
		= new Class432(class528_sub42);
	    ((Class326_Sub3) this).aFloatArray10061[i_19_]
		= class528_sub42.method9635(-1842672034);
	}
	method9139(class528_sub42, i, (byte) 8);
    }
    
    abstract void method9136(ByteBuffer class528_sub42, int i);
    
    public void method4253(ByteBuffer class528_sub42) {
	((Class326_Sub3) this).aFloat10060 = 0.0F;
	((Class326_Sub3) this).aFloat10057 = 0.0F;
	((Class326_Sub3) this).anInt10059 = 0;
	int i = class528_sub42.readUnsignedByte((byte) 43);
	((Class326_Sub3) this).aClass432Array10058 = new Class432[i];
	((Class326_Sub3) this).aFloatArray10061 = new float[i];
	for (int i_20_ = 0; i_20_ < i; i_20_++) {
	    ((Class326_Sub3) this).aClass432Array10058[i_20_]
		= new Class432(class528_sub42);
	    ((Class326_Sub3) this).aFloatArray10061[i_20_]
		= class528_sub42.method9635(-1873675227);
	}
	method9139(class528_sub42, i, (byte) -33);
    }
    
    public float method4255() {
	return ((Class326_Sub3) this).aClass432Array10058
		   [-418730201 * ((Class326_Sub3) this).anInt10059]
		   .method5214(((Class326_Sub3) this).aFloat10060);
    }
    
    void method9137(float f, float f_21_) {
	((Class326_Sub3) this).aFloat10060 += f;
	if (((Class326_Sub3) this).aFloat10060 > f_21_)
	    ((Class326_Sub3) this).aFloat10060 = f_21_;
    }
    
    void method9138(float f, float f_22_) {
	((Class326_Sub3) this).aFloat10060 += f;
	if (((Class326_Sub3) this).aFloat10060 > f_22_)
	    ((Class326_Sub3) this).aFloat10060 = f_22_;
    }
    
    abstract void method9139(ByteBuffer class528_sub42, int i, byte i_23_);
    
    public float method9140() {
	return ((Class326_Sub3) this).aClass432Array10058
		   [-418730201 * ((Class326_Sub3) this).anInt10059]
		   .method5205(((Class326_Sub3) this).aFloat10060);
    }
    
    public Class528_Sub19 method4241(int i) {
	Class422 class422 = method4236((byte) 4);
	return new Class528_Sub19(0, (int) class422.aFloat4780,
				  (int) class422.aFloat4776,
				  (int) class422.aFloat4777);
    }
    
    public float method9141() {
	return ((Class326_Sub3) this).aClass432Array10058
		   [-418730201 * ((Class326_Sub3) this).anInt10059]
		   .method5205(((Class326_Sub3) this).aFloat10060);
    }
}
