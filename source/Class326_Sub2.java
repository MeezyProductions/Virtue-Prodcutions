/* Class326_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class326_Sub2 extends Class326
{
    int anInt10040;
    Class422 aClass422_10041 = new Class422(Float.NaN, Float.NaN, Float.NaN);
    Class422 aClass422_10042 = new Class422(Float.NaN, Float.NaN, Float.NaN);
    Class422 aClass422_10043 = new Class422();
    boolean aBool10044 = false;
    static int anInt10045;
    
    public boolean method4247() {
	return !Float.isNaN(((Class326_Sub2) this).aClass422_10041.aFloat4780);
    }
    
    public Class422 method4248() {
	return Class422.method5052(((Class326_Sub2) this).aClass422_10041);
    }
    
    public void method4251(float f, int[][][] is, Class466 class466, int i,
			   int i_0_, int i_1_) {
	if (((Class326_Sub2) this).aBool10044)
	    method9107(is, class466, i, i_0_, -391446044);
	((Class326_Sub2) this).aClass283_3496.method3761
	    (true, f, ((Class326_Sub2) this).aClass422_10041,
	     ((Class326_Sub2) this).aClass283_3496.method3793((byte) -61),
	     ((Class326_Sub2) this).aClass422_10042,
	     ((Class326_Sub2) this).aClass422_10043, 352551649);
    }
    
    public Class422 method4236(byte i) {
	return Class422.method5052(((Class326_Sub2) this).aClass422_10041);
    }
    
    public double[] method4240(int i) {
	double[] ds = new double[3];
	Class422 class422 = method4236((byte) 43);
	ds[0] = (double) class422.aFloat4780;
	ds[1] = (double) class422.aFloat4776;
	ds[2] = (double) class422.aFloat4777;
	return ds;
    }
    
    public Class528_Sub19 method4241(int i) {
	return (new Class528_Sub19
		(((Class326_Sub2) this).anInt10040 * 1281585829,
		 (int) ((Class326_Sub2) this).aClass422_10041.aFloat4780,
		 (int) ((Class326_Sub2) this).aClass422_10041.aFloat4776,
		 (int) ((Class326_Sub2) this).aClass422_10041.aFloat4777));
    }
    
    public float method4250(int i) {
	return 0.0F;
    }
    
    public void method4239(Class284 class284, int i, int i_2_, byte i_3_) {
	class284.anInt3118 = 330589953 * ((int) (((Class326_Sub2) this)
						 .aClass422_10041.aFloat4780)
					  - i);
	class284.anInt3116 = -160556263 * (int) -(((Class326_Sub2) this)
						  .aClass422_10041.aFloat4776);
	class284.anInt3117
	    = (((int) ((Class326_Sub2) this).aClass422_10041.aFloat4777 - i_2_)
	       * 1998082863);
    }
    
    public void method4244(ByteBuffer class528_sub42, byte i) {
	((Class326_Sub2) this).aClass422_10042.method5056(class528_sub42);
    }
    
    public void method9106(boolean bool, byte i) {
	((Class326_Sub2) this).aBool10044 = bool;
    }
    
    void method9107(int[][][] is, Class466 class466, int i, int i_4_,
		    int i_5_) {
	if (method4238(1486149147)
	    && (((Class326_Sub2) this).aClass283_3496.method3798(-296893426)
		|| ((Class326_Sub2) this).aClass283_3496
		       .method3799(-390660518))
	    && ((Class326_Sub2) this).aClass283_3496.method3799(-1991393180)
	    && is != null) {
	    int i_6_
		= ((int) ((Class326_Sub2) this).aClass422_10042.aFloat4780 - i
		   >> 9);
	    int i_7_ = ((int) ((Class326_Sub2) this).aClass422_10042.aFloat4777
			- i_4_) >> 9;
	    if (i_6_ >= 0 && i_7_ >= 0 && i_6_ + 1 < is[0].length
		&& i_7_ + 1 < is[0][0].length) {
		int i_8_ = 1281585829 * ((Class326_Sub2) this).anInt10040;
		if (class466.method5633(i_6_, i_7_, (short) -7284))
		    i_8_ = 1 + 1281585829 * ((Class326_Sub2) this).anInt10040;
		long l
		    = ((long) ((Class326_Sub2) this).aClass422_10042.aFloat4780
		       % 512L);
		long l_9_
		    = ((long) ((Class326_Sub2) this).aClass422_10042.aFloat4777
		       % 512L);
		long l_10_
		    = (512L - l) * (long) is[i_8_][i_6_][i_7_] * (512L - l_9_);
		l_10_ += (512L - l_9_) * (l * (long) is[i_8_][1 + i_6_][i_7_]);
		l_10_ += (long) is[i_8_][i_6_][1 + i_7_] * (512L - l) * l_9_;
		l_10_ += l_9_ * ((long) is[i_8_][i_6_ + 1][1 + i_7_] * l);
		l_10_ /= 262144L;
		l_10_ -= 512L;
		float f
		    = ((float) -l_10_
		       - ((Class326_Sub2) this).aClass422_10042.aFloat4776);
		if (f > 0.0F)
		    ((Class326_Sub2) this).aClass422_10042.aFloat4776
			= (float) -l_10_;
	    }
	}
    }
    
    public void method4245(float f, int[][][] is, Class466 class466, int i,
			   int i_11_) {
	if (((Class326_Sub2) this).aBool10044)
	    method9107(is, class466, i, i_11_, 2068143623);
	((Class326_Sub2) this).aClass283_3496.method3761
	    (true, f, ((Class326_Sub2) this).aClass422_10041,
	     ((Class326_Sub2) this).aClass283_3496.method3793((byte) 33),
	     ((Class326_Sub2) this).aClass422_10042,
	     ((Class326_Sub2) this).aClass422_10043, -633580717);
    }
    
    public Class326_Sub2(Class283 class283) {
	super(class283);
    }
    
    public double[] method4237() {
	double[] ds = new double[3];
	Class422 class422 = method4236((byte) 58);
	ds[0] = (double) class422.aFloat4780;
	ds[1] = (double) class422.aFloat4776;
	ds[2] = (double) class422.aFloat4777;
	return ds;
    }
    
    public void method4242(Class284 class284, int i, int i_12_) {
	class284.anInt3118 = 330589953 * ((int) (((Class326_Sub2) this)
						 .aClass422_10041.aFloat4780)
					  - i);
	class284.anInt3116 = -160556263 * (int) -(((Class326_Sub2) this)
						  .aClass422_10041.aFloat4776);
	class284.anInt3117
	    = ((int) ((Class326_Sub2) this).aClass422_10041.aFloat4777
	       - i_12_) * 1998082863;
    }
    
    public void method9108(Class528_Sub19 class528_sub19, int i) {
	((Class326_Sub2) this).aClass422_10042.aFloat4780
	    = (float) (124815955 * class528_sub19.anInt10390);
	((Class326_Sub2) this).aClass422_10042.aFloat4776
	    = (float) (1385495327 * class528_sub19.anInt10394);
	((Class326_Sub2) this).aClass422_10042.aFloat4777
	    = (float) (class528_sub19.anInt10393 * -1852661307);
	if (Float.isNaN(((Class326_Sub2) this).aClass422_10041.aFloat4780)) {
	    ((Class326_Sub2) this).aClass422_10041
		.method5058(((Class326_Sub2) this).aClass422_10042);
	    ((Class326_Sub2) this).aClass422_10043.method5059();
	}
	((Class326_Sub2) this).anInt10040
	    = class528_sub19.anInt10392 * 1758527705;
    }
    
    public float method4255() {
	return 0.0F;
    }
    
    public boolean method4238(int i) {
	return !Float.isNaN(((Class326_Sub2) this).aClass422_10041.aFloat4780);
    }
    
    public void method4252(Class284 class284, int i, int i_13_) {
	class284.anInt3118 = 330589953 * ((int) (((Class326_Sub2) this)
						 .aClass422_10041.aFloat4780)
					  - i);
	class284.anInt3116 = -160556263 * (int) -(((Class326_Sub2) this)
						  .aClass422_10041.aFloat4776);
	class284.anInt3117
	    = ((int) ((Class326_Sub2) this).aClass422_10041.aFloat4777
	       - i_13_) * 1998082863;
    }
    
    public Class528_Sub19 method4243() {
	return (new Class528_Sub19
		(((Class326_Sub2) this).anInt10040 * 1281585829,
		 (int) ((Class326_Sub2) this).aClass422_10041.aFloat4780,
		 (int) ((Class326_Sub2) this).aClass422_10041.aFloat4776,
		 (int) ((Class326_Sub2) this).aClass422_10041.aFloat4777));
    }
    
    public void method4249(ByteBuffer class528_sub42) {
	((Class326_Sub2) this).aClass422_10042.method5056(class528_sub42);
    }
    
    public void method4253(ByteBuffer class528_sub42) {
	((Class326_Sub2) this).aClass422_10042.method5056(class528_sub42);
    }
    
    public boolean method4246() {
	return !Float.isNaN(((Class326_Sub2) this).aClass422_10041.aFloat4780);
    }
    
    public void method9109(boolean bool) {
	((Class326_Sub2) this).aBool10044 = bool;
    }
    
    public Class422 method4254() {
	return Class422.method5052(((Class326_Sub2) this).aClass422_10041);
    }
    
    static final void method9110(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	int i_14_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	i_14_--;
	if (class229.aStringArray2545 == null
	    || i_14_ >= class229.aStringArray2545.length
	    || class229.aStringArray2545[i_14_] == null)
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
	else
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= class229.aStringArray2545[i_14_];
    }
    
    static final void method9111(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	int[] is = Class494.method5957(string, class648, (short) 520);
	if (null != is)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2504
	    = Class181_Sub23.method8999(string, class648, (byte) 5);
	class229.anIntArray2505 = is;
	class229.aBool2483 = true;
    }
}
