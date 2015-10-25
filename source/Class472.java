/* Class472 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class472
{
    int anInt5406;
    public static Class472 aClass472_5407;
    public static Class472 aClass472_5408;
    public static Class472 aClass472_5409;
    static Class472 aClass472_5410;
    public static Class472 aClass472_5411;
    static Class472 aClass472_5412;
    static Class472 aClass472_5413;
    static Class472 aClass472_5414;
    static Class472 aClass472_5415 = new Class472(0);
    
    static {
	aClass472_5407 = new Class472(1);
	aClass472_5410 = new Class472(2);
	aClass472_5409 = new Class472(3);
	aClass472_5408 = new Class472(4);
	aClass472_5411 = new Class472(5);
	aClass472_5412 = new Class472(6);
	aClass472_5413 = new Class472(7);
	aClass472_5414 = new Class472(8);
    }
    
    Class472(int i) {
	((Class472) this).anInt5406 = -793030073 * i;
    }
    
    public static int method5817(int i, int i_0_, int i_1_, byte i_2_) {
	int i_3_ = 255 - i_1_;
	i_0_ = (i_1_ * (i_0_ & 0xff00ff) & ~0xff00ff
		| i_1_ * (i_0_ & 0xff00) & 0xff0000) >>> 8;
	return i_0_ + (((i & 0xff00ff) * i_3_ & ~0xff00ff
			| i_3_ * (i & 0xff00) & 0xff0000)
		       >>> 8);
    }
    
    public static int method5818(int i, byte i_4_) {
	double d = (double) (i >> 16 & 0xff) / 256.0;
	double d_5_ = (double) (i >> 8 & 0xff) / 256.0;
	double d_6_ = (double) (i & 0xff) / 256.0;
	double d_7_ = d;
	if (d_5_ < d_7_)
	    d_7_ = d_5_;
	if (d_6_ < d_7_)
	    d_7_ = d_6_;
	double d_8_ = d;
	if (d_5_ > d_8_)
	    d_8_ = d_5_;
	if (d_6_ > d_8_)
	    d_8_ = d_6_;
	double d_9_ = 0.0;
	double d_10_ = 0.0;
	double d_11_ = (d_8_ + d_7_) / 2.0;
	if (d_8_ != d_7_) {
	    if (d_11_ < 0.5)
		d_10_ = (d_8_ - d_7_) / (d_8_ + d_7_);
	    if (d_11_ >= 0.5)
		d_10_ = (d_8_ - d_7_) / (2.0 - d_8_ - d_7_);
	    if (d == d_8_)
		d_9_ = (d_5_ - d_6_) / (d_8_ - d_7_);
	    else if (d_5_ == d_8_)
		d_9_ = (d_6_ - d) / (d_8_ - d_7_) + 2.0;
	    else if (d_8_ == d_6_)
		d_9_ = 4.0 + (d - d_5_) / (d_8_ - d_7_);
	}
	d_9_ /= 6.0;
	int i_12_ = (int) (d_9_ * 256.0);
	int i_13_ = (int) (d_10_ * 256.0);
	int i_14_ = (int) (d_11_ * 256.0);
	if (i_13_ < 0)
	    i_13_ = 0;
	else if (i_13_ > 255)
	    i_13_ = 255;
	if (i_14_ < 0)
	    i_14_ = 0;
	else if (i_14_ > 255)
	    i_14_ = 255;
	if (i_14_ > 243)
	    i_13_ >>= 4;
	else if (i_14_ > 217)
	    i_13_ >>= 3;
	else if (i_14_ > 192)
	    i_13_ >>= 2;
	else if (i_14_ > 179)
	    i_13_ >>= 1;
	return (i_13_ >> 5 << 7) + ((i_12_ & 0xff) >> 2 << 10) + (i_14_ >> 1);
    }
    
    static final void method5819(Class648 class648, int i) {
	int i_15_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_15_, (byte) 65);
	Class226 class226 = Class380.aClass226Array3970[i_15_ >> 16];
	Class496.method6055(class229, class226, class648, -947398110);
    }
    
    static final void method5820(Class648 class648, int i) {
	int i_16_ = client.aClass692_11097.method8139((short) 20203);
	if (-1 != client.anInt10978 * 2088127151)
	    i_16_++;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = i_16_;
    }
    
    static final void method5821(Class229 class229, Class226 class226,
				 Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= -1155798602;
	class229.anInt2462
	    = (((Class648) class648).anIntArray8394
	       [((Class648) class648).anInt8395 * 717927929]) * 1199329933;
	class229.anInt2423
	    = (((Class648) class648).anIntArray8394
	       [((Class648) class648).anInt8395 * 717927929 + 1]) * 587238829;
	class229.anInt2424
	    = (-2006486103
	       * (((Class648) class648).anIntArray8394
		  [((Class648) class648).anInt8395 * 717927929 + 2]));
	class229.anInt2517
	    = (((Class648) class648).anIntArray8394
	       [3 + ((Class648) class648).anInt8395 * 717927929]) * -776502595;
	class229.anInt2426
	    = (((Class648) class648).anIntArray8394
	       [4 + 717927929 * ((Class648) class648).anInt8395]) * 754234821;
	class229.anInt2430
	    = -44552751 * (((Class648) class648).anIntArray8394
			   [5 + ((Class648) class648).anInt8395 * 717927929]);
	Class39.method811(class229, 1435904523);
	if (class229.anInt2377 * 1835803215 == -1 && !class226.aBool2335) {
	    Class550.method6688(class229.anInt2376 * 306930455, -1203793876);
	    Class528_Sub2.method9239(306930455 * class229.anInt2376,
				     405578927);
	}
    }
    
    static void method5822(int i, int i_17_, int i_18_) {
	if (Class184.aClass622_2103.aBool8083
	    || (-1024340783 * Class28.anInt303 != 1
		&& (!Class213.aBool2255 || 2 != -1024340783 * Class28.anInt303
		    || !(((Class528_Sub21_Sub11)
			  Class492.aClass528_Sub21_Sub11_5522)
			     .aString11585.equals
			 (Class39.aClass39_475.method807((Class378_Sub2
							  .aClass668_10123),
							 (byte) 102)))))) {
	    Class1 class1 = Class106.method1359(-220968233);
	    int i_19_ = class1.method490((Class39.aClass39_472.method807
					  (Class378_Sub2.aClass668_10123,
					   (byte) 102)),
					 941026227);
	    int i_20_;
	    if (!Class28.aBool264) {
		for (Class528_Sub21_Sub11 class528_sub21_sub11
			 = ((Class528_Sub21_Sub11)
			    Class28.aClass688_274.method8034(1569153380));
		     null != class528_sub21_sub11;
		     class528_sub21_sub11
			 = ((Class528_Sub21_Sub11)
			    Class28.aClass688_274.method8037(-1827528548))) {
		    int i_21_ = Class703.method8242(class528_sub21_sub11,
						    class1, -1615471330);
		    if (i_21_ > i_19_)
			i_19_ = i_21_;
		}
		i_19_ += 8;
		i_20_ = 21 + (Class28.anInt260 * -812992221
			      * (-1024340783 * Class28.anInt303));
		Class528_Sub24.anInt10419
		    = 1624432087 * ((Class28.aBool257 ? 26 : 22)
				    + (-1024340783 * Class28.anInt303
				       * (-812992221 * Class28.anInt260)));
	    } else {
		for (Class528_Sub21_Sub5 class528_sub21_sub5
			 = ((Class528_Sub21_Sub5)
			    Class28.aClass679_276.method7960(-1550587110));
		     null != class528_sub21_sub5;
		     class528_sub21_sub5
			 = ((Class528_Sub21_Sub5)
			    Class28.aClass679_276.method7969(-1682704885))) {
		    int i_22_;
		    if (1 == (((Class528_Sub21_Sub5) class528_sub21_sub5)
			      .anInt11534) * 942428025)
			i_22_ = Class703.method8242(((Class528_Sub21_Sub11)
						     (((Class528_Sub21_Sub5)
						       class528_sub21_sub5)
						      .aClass679_11535
						      .aClass528_Sub21_8561
						      .aClass528_Sub21_10408)),
						    class1, -1369328372);
		    else
			i_22_ = Class574.method6871(class528_sub21_sub5,
						    class1, 715900047);
		    if (i_22_ > i_19_)
			i_19_ = i_22_;
		}
		i_19_ += 8;
		i_20_ = 773625589 * Class28.anInt261 * (Class28.anInt260
							* -812992221) + 21;
		Class528_Sub24.anInt10419
		    = (-812992221 * Class28.anInt260 * (Class28.anInt261
							* 773625589)
		       + (Class28.aBool257 ? 26 : 22)) * 1624432087;
	    }
	    i_19_ += 10;
	    int i_23_ = i - i_19_ / 2;
	    if (i_19_ + i_23_ > -1117838587 * Class411.anInt4713)
		i_23_ = -1117838587 * Class411.anInt4713 - i_19_;
	    if (i_23_ < 0)
		i_23_ = 0;
	    int i_24_ = i_17_;
	    if (i_20_ + i_24_ > -2142152407 * Class509.anInt6933)
		i_24_ = Class509.anInt6933 * -2142152407 - i_20_;
	    if (i_24_ < 0)
		i_24_ = 0;
	    Class32.anInt309 = 987804859 * i_23_;
	    Class25.anInt239 = i_24_ * -1996626819;
	    Class369.anInt3868 = i_19_ * 130596583;
	    Class28.anInt292 = (int) (Math.random() * 24.0) * -567433625;
	    Class28.aBool273 = true;
	}
    }
}
