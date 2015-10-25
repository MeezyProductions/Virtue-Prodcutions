/* Class326_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class326_Sub1 extends Class326
{
    Class422 aClass422_10030;
    Class422 aClass422_10031 = new Class422();
    public Class430 aClass430_10032 = new Class430();
    boolean aBool10033;
    Class422 aClass422_10034;
    int anInt10035;
    Class430 aClass430_10036;
    Class422 aClass422_10037;
    Interface30 anInterface30_10038;
    int anInt10039 = 1141557224;
    
    public void method9084(Interface30 interface30, Class422 class422,
			   Class430 class430, boolean bool, int i,
			   int[][][] is, Class466 class466, int i_0_, int i_1_,
			   int i_2_) {
	((Class326_Sub1) this).anInterface30_10038 = interface30;
	((Class326_Sub1) this).aClass422_10031.method5058(class422);
	aClass430_10032.method5187(class430);
	((Class326_Sub1) this).aBool10033 = bool;
	((Class326_Sub1) this).anInt10039 = -939185019 * i;
	((Class326_Sub1) this).anInt10035
	    = (((Class326_Sub1) this).anInterface30_10038.method169
	       (-1052110068).anInt10392) * -359274267;
	method9086(is, class466, i_0_, i_1_, (byte) 1);
    }
    
    public Class528_Sub19 method4243() {
	Class422 class422 = method4236((byte) 23);
	Class528_Sub19 class528_sub19
	    = new Class528_Sub19((2004236697
				  * ((Class326_Sub1) this).anInt10035),
				 (int) class422.aFloat4780,
				 (int) class422.aFloat4776,
				 (int) class422.aFloat4777);
	class422.method5054();
	return class528_sub19;
    }
    
    Class430 method9085(int i) {
	Class430 class430 = Class430.method5163(aClass430_10032);
	if (((Class326_Sub1) this).aBool10033) {
	    Class422 class422 = ((Class326_Sub1) this).anInterface30_10038
				    .method171(1292186605);
	    if (class422.method5069()
		< (float) (((Class326_Sub1) this).anInt10039 * 805039181)) {
		class422 = Class422.method5051(0.0F, 0.0F, 1.0F);
		Class430 class430_3_
		    = ((Class326_Sub1) this).anInterface30_10038
			  .method170((byte) 0);
		class422.method5075(class430_3_);
	    }
	    class422.aFloat4776 = 0.0F;
	    float f = (float) Math.atan2((double) class422.aFloat4780,
					 (double) class422.aFloat4777);
	    class422.method5054();
	    Class430 class430_4_ = new Class430();
	    class430_4_.method5168(0.0F, 1.0F, 0.0F, f);
	    class430.method5176(class430_4_);
	}
	return class430;
    }
    
    void method9086(int[][][] is, Class466 class466, int i, int i_5_,
		    byte i_6_) {
	if (method4238(1486149147)
	    && (((Class326_Sub1) this).aClass283_3496.method3798(-825969279)
		|| ((Class326_Sub1) this).aClass283_3496
		       .method3799(-1636708989))) {
	    Class528_Sub19 class528_sub19
		= ((Class326_Sub1) this).anInterface30_10038
		      .method169(-1155149802);
	    ((Class326_Sub1) this).anInt10035
		= class528_sub19.anInt10392 * -359274267;
	    int i_7_ = ((Class326_Sub1) this).anInt10035 * 2004236697;
	    boolean bool = true;
	    if (((Class326_Sub1) this).anInt10035 * 2004236697 == 3)
		bool = false;
	    else if (class466 != null
		     && (class466.method5633
			 (class528_sub19.anInt10390 * 124815955 - i >> 9,
			  class528_sub19.anInt10393 * -1852661307 - i_5_ >> 9,
			  (short) 9799))) {
		i_7_ = 1 + 2004236697 * ((Class326_Sub1) this).anInt10035;
		bool = false;
	    }
	    if (((Class326_Sub1) this).aClass283_3496.method3799(-505551600)
		&& is != null) {
		float f = method9096(is, class466, i, i_5_, i_7_, bool,
				     -278690199);
		if (!Float.isNaN(f)) {
		    if (f > 0.0F) {
			float f_8_ = 3.1415927F;
			Class422 class422
			    = Class422.method5051(0.0F, 0.0F, 1.0F);
			class422.method5075(aClass430_10032);
			Class422 class422_9_
			    = Class422.method5051(class422.aFloat4780, 0.0F,
						  class422.aFloat4777);
			class422_9_.method5062();
			float f_10_
			    = Class422.method5085(class422, class422_9_);
			for (int i_11_ = 0; i_11_ < 10; i_11_++) {
			    float f_12_ = (f_8_ + f_10_) / 2.0F - f_10_;
			    float f_13_ = f_12_;
			    if (f > 0.0F)
				f_13_ *= -1.0F;
			    Class422 class422_14_
				= Class422.method5051(1.0F, 0.0F, 0.0F);
			    class422_14_.method5075(aClass430_10032);
			    Class430 class430 = Class430.method5188();
			    class430.method5167(class422_14_, f_13_);
			    aClass430_10032.method5176(class430);
			    aClass430_10032.method5172();
			    class422_14_.method5054();
			    class430.method5194();
			    f = method9096(is, class466, i, i_5_, i_7_, bool,
					   1288541096);
			    if (Float.isNaN(f))
				break;
			    if (f > 0.0F)
				f_10_ += f_12_;
			    else
				f_8_ -= f_12_;
			}
		    }
		}
	    }
	}
    }
    
    public boolean method4238(int i) {
	return !Float.isNaN(((Class326_Sub1) this).aClass422_10030.aFloat4780);
    }
    
    Class422 method9087(Class430 class430, int i) {
	Class422 class422
	    = Class422.method5052(((Class326_Sub1) this).aClass422_10031);
	class422.method5075(class430);
	Class422 class422_15_
	    = Class422.method5094(((Class326_Sub1) this).aClass422_10037,
				  class422);
	class422.method5054();
	return class422_15_;
    }
    
    public Class422 method4254() {
	Class422 class422
	    = Class422.method5052(((Class326_Sub1) this).aClass422_10031);
	class422.method5075(((Class326_Sub1) this).aClass430_10036);
	Class422 class422_16_
	    = Class422.method5094(((Class326_Sub1) this).aClass422_10030,
				  class422);
	class422.method5054();
	return class422_16_;
    }
    
    public Class422 method4236(byte i) {
	Class422 class422
	    = Class422.method5052(((Class326_Sub1) this).aClass422_10031);
	class422.method5075(((Class326_Sub1) this).aClass430_10036);
	Class422 class422_17_
	    = Class422.method5094(((Class326_Sub1) this).aClass422_10030,
				  class422);
	class422.method5054();
	return class422_17_;
    }
    
    public double[] method4240(int i) {
	double[] ds = new double[3];
	Class422 class422 = method4236((byte) 72);
	ds[0] = (double) class422.aFloat4780;
	ds[1] = (double) class422.aFloat4776;
	ds[2] = (double) class422.aFloat4777;
	return ds;
    }
    
    public Class528_Sub19 method4241(int i) {
	Class422 class422 = method4236((byte) 124);
	Class528_Sub19 class528_sub19
	    = new Class528_Sub19((2004236697
				  * ((Class326_Sub1) this).anInt10035),
				 (int) class422.aFloat4780,
				 (int) class422.aFloat4776,
				 (int) class422.aFloat4777);
	class422.method5054();
	return class528_sub19;
    }
    
    public Class422 method9088(byte i) {
	return ((Class326_Sub1) this).aClass422_10030;
    }
    
    public Class422 method9089(byte i) {
	return ((Class326_Sub1) this).aClass422_10031;
    }
    
    public float method9090(byte i) {
	return Class589.method7073(aClass430_10032, -306568619);
    }
    
    public float method9091(int i) {
	return Class190.method2783(aClass430_10032, -1939563022);
    }
    
    public void method4244(ByteBuffer class528_sub42, byte i) {
	Class295 class295
	    = Class95_Sub1_Sub2.method10305(class528_sub42
						.readUnsignedByte((byte) 107),
					    (byte) 125);
	int i_18_ = class528_sub42.readUnsignedShort(-1829150330);
	((Class326_Sub1) this).aClass422_10031.method5056(class528_sub42);
	aClass430_10032.method5201(class528_sub42);
	if (class528_sub42.readUnsignedByte((byte) 100) == 1)
	    ((Class326_Sub1) this).aBool10033 = true;
	else
	    ((Class326_Sub1) this).aBool10033 = false;
	((Class326_Sub1) this).anInt10039
	    = class528_sub42.readUnsignedShort(41908246) * -939185019;
	((Class326_Sub1) this).anInterface30_10038
	    = ((Class326_Sub1) this).aClass283_3496.method3825((byte) 1)
		  .method164(class295, i_18_, (byte) -8);
    }
    
    public void method4239(Class284 class284, int i, int i_19_, byte i_20_) {
	Class422 class422 = method4236((byte) 38);
	class284.anInt3118 = 330589953 * ((int) class422.aFloat4780 - i);
	class284.anInt3116 = (int) -class422.aFloat4776 * -160556263;
	class284.anInt3117 = 1998082863 * ((int) class422.aFloat4777 - i_19_);
	class422.method5054();
    }
    
    public void method4251(float f, int[][][] is, Class466 class466, int i,
			   int i_21_, int i_22_) {
	if (((Class326_Sub1) this).anInterface30_10038 != null) {
	    method9086(is, class466, i, i_21_, (byte) 1);
	    Class430 class430 = method9085(-1352780726);
	    ((Class326_Sub1) this).aClass430_10036.method5166
		(class430,
		 ((Class326_Sub1) this).aClass283_3496.method3817(116817450));
	    if (Float.isNaN(((Class326_Sub1) this).aClass430_10036.aFloat4816))
		((Class326_Sub1) this).aClass430_10036.method5187(class430);
	    class430.method5194();
	    ((Class326_Sub1) this).aClass422_10037.method5058
		(((Class326_Sub1) this).anInterface30_10038.method169
		     (-1161261051).method9411(1364199453));
	    ((Class326_Sub1) this).aClass283_3496.method3761
		(true, f, ((Class326_Sub1) this).aClass422_10030,
		 ((Class326_Sub1) this).aClass283_3496.method3793((byte) 15),
		 ((Class326_Sub1) this).aClass422_10037,
		 ((Class326_Sub1) this).aClass422_10034, 1443542524);
	}
    }
    
    public void method9092() {
	if (null != ((Class326_Sub1) this).anInterface30_10038)
	    ((Class326_Sub1) this).anInterface30_10038
		= (((Class326_Sub1) this).aClass283_3496.method3825
		       ((byte) 1).method164
		   (((Class326_Sub1) this).anInterface30_10038
			.method175((byte) -85),
		    ((Class326_Sub1) this).anInterface30_10038
			.method168(-943950641),
		    (byte) -114));
    }
    
    public boolean method4246() {
	return !Float.isNaN(((Class326_Sub1) this).aClass422_10030.aFloat4780);
    }
    
    public boolean method4247() {
	return !Float.isNaN(((Class326_Sub1) this).aClass422_10030.aFloat4780);
    }
    
    public Class422 method4248() {
	Class422 class422
	    = Class422.method5052(((Class326_Sub1) this).aClass422_10031);
	class422.method5075(((Class326_Sub1) this).aClass430_10036);
	Class422 class422_23_
	    = Class422.method5094(((Class326_Sub1) this).aClass422_10030,
				  class422);
	class422.method5054();
	return class422_23_;
    }
    
    public void method9093() {
	if (null != ((Class326_Sub1) this).anInterface30_10038)
	    ((Class326_Sub1) this).anInterface30_10038
		= (((Class326_Sub1) this).aClass283_3496.method3825
		       ((byte) 1).method164
		   (((Class326_Sub1) this).anInterface30_10038
			.method175((byte) -71),
		    ((Class326_Sub1) this).anInterface30_10038
			.method168(-943950641),
		    (byte) -87));
    }
    
    public Class326_Sub1(Class283 class283) {
	super(class283);
	((Class326_Sub1) this).aClass422_10030
	    = new Class422(Float.NaN, Float.NaN, Float.NaN);
	((Class326_Sub1) this).aClass422_10037
	    = new Class422(Float.NaN, Float.NaN, Float.NaN);
	((Class326_Sub1) this).aClass422_10034 = new Class422();
	((Class326_Sub1) this).aClass430_10036 = new Class430();
    }
    
    public void method4249(ByteBuffer class528_sub42) {
	Class295 class295
	    = Class95_Sub1_Sub2.method10305(class528_sub42
						.readUnsignedByte((byte) 35),
					    (byte) 44);
	int i = class528_sub42.readUnsignedShort(348670139);
	((Class326_Sub1) this).aClass422_10031.method5056(class528_sub42);
	aClass430_10032.method5201(class528_sub42);
	if (class528_sub42.readUnsignedByte((byte) 30) == 1)
	    ((Class326_Sub1) this).aBool10033 = true;
	else
	    ((Class326_Sub1) this).aBool10033 = false;
	((Class326_Sub1) this).anInt10039
	    = class528_sub42.readUnsignedShort(-37644110) * -939185019;
	((Class326_Sub1) this).anInterface30_10038
	    = ((Class326_Sub1) this).aClass283_3496.method3825((byte) 1)
		  .method164(class295, i, (byte) -31);
    }
    
    public void method4242(Class284 class284, int i, int i_24_) {
	Class422 class422 = method4236((byte) 10);
	class284.anInt3118 = 330589953 * ((int) class422.aFloat4780 - i);
	class284.anInt3116 = (int) -class422.aFloat4776 * -160556263;
	class284.anInt3117 = 1998082863 * ((int) class422.aFloat4777 - i_24_);
	class422.method5054();
    }
    
    public double[] method4237() {
	double[] ds = new double[3];
	Class422 class422 = method4236((byte) 50);
	ds[0] = (double) class422.aFloat4780;
	ds[1] = (double) class422.aFloat4776;
	ds[2] = (double) class422.aFloat4777;
	return ds;
    }
    
    public void method9094(int i) {
	if (null != ((Class326_Sub1) this).anInterface30_10038)
	    ((Class326_Sub1) this).anInterface30_10038
		= (((Class326_Sub1) this).aClass283_3496.method3825
		       ((byte) 1).method164
		   (((Class326_Sub1) this).anInterface30_10038
			.method175((byte) -125),
		    ((Class326_Sub1) this).anInterface30_10038
			.method168(-943950641),
		    (byte) -42));
    }
    
    public void method4253(ByteBuffer class528_sub42) {
	Class295 class295
	    = Class95_Sub1_Sub2.method10305(class528_sub42
						.readUnsignedByte((byte) 27),
					    (byte) 12);
	int i = class528_sub42.readUnsignedShort(-1721968789);
	((Class326_Sub1) this).aClass422_10031.method5056(class528_sub42);
	aClass430_10032.method5201(class528_sub42);
	if (class528_sub42.readUnsignedByte((byte) 86) == 1)
	    ((Class326_Sub1) this).aBool10033 = true;
	else
	    ((Class326_Sub1) this).aBool10033 = false;
	((Class326_Sub1) this).anInt10039
	    = class528_sub42.readUnsignedShort(-1123739550) * -939185019;
	((Class326_Sub1) this).anInterface30_10038
	    = ((Class326_Sub1) this).aClass283_3496.method3825((byte) 1)
		  .method164(class295, i, (byte) -109);
    }
    
    public float method4255() {
	return 0.0F;
    }
    
    public float method9095() {
	return Class190.method2783(aClass430_10032, -1872952949);
    }
    
    float method9096(int[][][] is, Class466 class466, int i, int i_25_,
		     int i_26_, boolean bool, int i_27_) {
	Class430 class430 = method9085(-1595162624);
	Class422 class422 = method9087(class430, -1227308001);
	class430.method5194();
	int i_28_ = (int) class422.aFloat4780 - i >> 9;
	int i_29_ = (int) class422.aFloat4777 - i_25_ >> 9;
	if (i_28_ >= 0 && i_29_ >= 0 && 1 + i_28_ < is[0].length
	    && i_29_ + 1 < is[0][0].length) {
	    int i_30_ = i_26_;
	    if (bool && class466.method5633(i_28_, i_29_, (short) -6002))
		i_30_ = i_26_ + 1;
	    long l = (long) class422.aFloat4780 % 512L;
	    long l_31_ = (long) class422.aFloat4777 % 512L;
	    long l_32_
		= (long) is[i_30_][i_28_][i_29_] * (512L - l) * (512L - l_31_);
	    l_32_ += (512L - l_31_) * ((long) is[i_30_][i_28_ + 1][i_29_] * l);
	    l_32_ += (512L - l) * (long) is[i_30_][i_28_][i_29_ + 1] * l_31_;
	    l_32_ += l_31_ * (l * (long) is[i_30_][i_28_ + 1][i_29_ + 1]);
	    l_32_ /= 262144L;
	    l_32_ -= 1024L;
	    float f = (float) -l_32_ - class422.aFloat4776;
	    class422.method5054();
	    return f;
	}
	class422.method5054();
	return Float.NaN;
    }
    
    public void method9097() {
	if (null != ((Class326_Sub1) this).anInterface30_10038)
	    ((Class326_Sub1) this).anInterface30_10038
		= (((Class326_Sub1) this).aClass283_3496.method3825
		       ((byte) 1).method164
		   (((Class326_Sub1) this).anInterface30_10038
			.method175((byte) -122),
		    ((Class326_Sub1) this).anInterface30_10038
			.method168(-943950641),
		    (byte) -115));
    }
    
    public void method9098() {
	if (null != ((Class326_Sub1) this).anInterface30_10038)
	    ((Class326_Sub1) this).anInterface30_10038
		= (((Class326_Sub1) this).aClass283_3496.method3825
		       ((byte) 1).method164
		   (((Class326_Sub1) this).anInterface30_10038
			.method175((byte) -68),
		    ((Class326_Sub1) this).anInterface30_10038
			.method168(-943950641),
		    (byte) -87));
    }
    
    public void method4252(Class284 class284, int i, int i_33_) {
	Class422 class422 = method4236((byte) 55);
	class284.anInt3118 = 330589953 * ((int) class422.aFloat4780 - i);
	class284.anInt3116 = (int) -class422.aFloat4776 * -160556263;
	class284.anInt3117 = 1998082863 * ((int) class422.aFloat4777 - i_33_);
	class422.method5054();
    }
    
    public float method4250(int i) {
	return 0.0F;
    }
    
    public void method4245(float f, int[][][] is, Class466 class466, int i,
			   int i_34_) {
	if (((Class326_Sub1) this).anInterface30_10038 != null) {
	    method9086(is, class466, i, i_34_, (byte) 1);
	    Class430 class430 = method9085(-970165692);
	    ((Class326_Sub1) this).aClass430_10036.method5166
		(class430,
		 ((Class326_Sub1) this).aClass283_3496.method3817(116817450));
	    if (Float.isNaN(((Class326_Sub1) this).aClass430_10036.aFloat4816))
		((Class326_Sub1) this).aClass430_10036.method5187(class430);
	    class430.method5194();
	    ((Class326_Sub1) this).aClass422_10037.method5058
		(((Class326_Sub1) this).anInterface30_10038.method169
		     (902379917).method9411(292632903));
	    ((Class326_Sub1) this).aClass283_3496.method3761
		(true, f, ((Class326_Sub1) this).aClass422_10030,
		 ((Class326_Sub1) this).aClass283_3496.method3793((byte) 87),
		 ((Class326_Sub1) this).aClass422_10037,
		 ((Class326_Sub1) this).aClass422_10034, -2033497433);
	}
    }
    
    public float method9099() {
	return Class589.method7073(aClass430_10032, 61883860);
    }
    
    public float method9100() {
	return Class589.method7073(aClass430_10032, -797999533);
    }
    
    public float method9101() {
	return Class589.method7073(aClass430_10032, 342422773);
    }
    
    public float method9102() {
	return Class190.method2783(aClass430_10032, -2023113041);
    }
    
    static final void method9104(Class648 class648, byte i) {
	Class684_Sub2.method10083(((Class645_Sub1)
				   ((Class648) class648).anInterface60_8408),
				  class648, (byte) 27);
    }
    
    static final void method9105(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_43_ = (((Class648) class648).anIntArray8394
		     [((Class648) class648).anInt8395 * 717927929]);
	int i_44_ = (((Class648) class648).anIntArray8394
		     [1 + ((Class648) class648).anInt8395 * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = client.aClass217_11028.method3071(i_43_, -477595974)
		  .method2873(i_44_, (byte) 51) ? 1 : 0;
    }
}
