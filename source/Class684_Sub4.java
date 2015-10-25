/* Class684_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class684_Sub4 extends Class684
{
    static float aFloat10812;
    static float aFloat10813;
    Class430 aClass430_10814;
    static int anInt10815;
    Class430 aClass430_10816 = new Class430();
    static int anInt10817;
    static int anInt10818;
    static float aFloat10819;
    static int anInt10820 = 0;
    static float aFloat10821;
    static float aFloat10822;
    static float aFloat10823;
    
    public void method7993(float f) {
	Class430 class430 = method10117(-1239247106);
	if (0 != 1102261925 * anInt10820 || 0 != anInt10815 * -1663029263) {
	    Class430 class430_0_ = Class430.method5188();
	    class430_0_.method5168(1.0F, 0.0F, 0.0F,
				   (float) (3.141592653589793
					    * (double) (anInt10820
							* 1102261925)
					    * 2.0) / 16384.0F);
	    class430.method5176(class430_0_);
	    Class422 class422 = Class422.method5051(0.0F, 1.0F, 0.0F);
	    class422.method5075(class430);
	    Class430 class430_1_ = Class430.method5188();
	    class422.method5062();
	    class430_1_.method5167(class422,
				   ((float) (2.0
					     * (3.141592653589793
						* (double) (anInt10815
							    * -1663029263)))
				    / 16384.0F));
	    class430.method5176(class430_1_);
	    method10110(class430, 1276637395);
	    anInt10820 = 0;
	    anInt10815 = 0;
	}
	if ((((Class684_Sub4) this).aClass283_8607.method3787((byte) -70)
	     == Class297.aClass297_3255)
	    && (-661492479 * anInt10818 != 0
		|| anInt10817 * 1048448131 != 0)) {
	    class430.method5170();
	    Class326_Sub2 class326_sub2
		= (Class326_Sub2) ((Class684_Sub4) this).aClass283_8607
				      .method3811(-1703989523);
	    Class528_Sub19 class528_sub19
		= class326_sub2.method4241(497487405);
	    Class422 class422 = class528_sub19.method9411(300596279);
	    Class422 class422_2_
		= Class422.method5051(0.0F, 0.0F,
				      (float) (anInt10817 * 1048448131));
	    class422_2_.method5075(class430);
	    class422_2_.aFloat4776 *= -1.0F;
	    class422.method5063(class422_2_);
	    Class422 class422_3_
		= Class422.method5051((float) (-661492479 * anInt10818), 0.0F,
				      0.0F);
	    class422_3_.method5075(class430);
	    class422_3_.aFloat4776 *= -1.0F;
	    class422.method5063(class422_3_);
	    method10130(class422, -1693621108);
	    class326_sub2.method9108
		(new Class528_Sub19(class528_sub19.anInt10392 * 1627467229,
				    (int) class422.aFloat4780,
				    (int) class422.aFloat4776,
				    (int) class422.aFloat4777),
		 1215949729);
	    anInt10818 = 0;
	    anInt10817 = 0;
	}
    }
    
    public void method10110(Class430 class430, int i) {
	((Class684_Sub4) this).aClass430_10814.aFloat4816
	    = class430.aFloat4816;
	((Class684_Sub4) this).aClass430_10814.aFloat4819
	    = class430.aFloat4819;
	((Class684_Sub4) this).aClass430_10814.aFloat4818
	    = class430.aFloat4818;
	((Class684_Sub4) this).aClass430_10814.aFloat4815
	    = class430.aFloat4815;
	((Class684_Sub4) this).aClass430_10816
	    .method5187(((Class684_Sub4) this).aClass430_10814);
    }
    
    public void method10111(int i, byte i_4_) {
	anInt10820 = i * -1713829587;
    }
    
    public void method10112(int i, int i_5_) {
	anInt10815 = -191176431 * i;
    }
    
    public void method10113(int i, int i_6_) {
	anInt10818 = i * -187264255;
    }
    
    public void method10114(int i, int i_7_) {
	anInt10817 = i * 757309995;
    }
    
    public Class422 method7988(int i) {
	Class422 class422 = new Class422(0.0F, 0.0F, 1000.0F);
	class422.method5075(Class430.method5171(((Class684_Sub4) this)
						.aClass430_10814));
	class422.aFloat4776 *= -1.0F;
	class422.method5063(((Class684_Sub4) this).aClass283_8607
				.method3788((short) -10564));
	return class422;
    }
    
    public void method10115(int i, int i_8_, int i_9_, int i_10_) {
	Class433 class433 = new Class433();
	class433.method5220(0.0, 0.0, 0.0, (double) i, (double) -i_8_,
			    (double) i_9_, 0.0F, 1.0F, 0.0F);
	Class434 class434 = new Class434();
	class433.method5236(class434.aFloatArray4844);
	Class430 class430 = class434.method5259();
	class430.method5170();
	((Class684_Sub4) this).aClass430_10816.method5187(class430);
    }
    
    public void method10116(int i) {
	anInt10820 = i * -1713829587;
    }
    
    public Class684_Sub4(Class283 class283) {
	super(class283);
	((Class684_Sub4) this).aClass430_10814
	    = new Class430(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    }
    
    public Class422 method7985() {
	Class422 class422 = new Class422(0.0F, 0.0F, 1000.0F);
	class422.method5075(Class430.method5171(((Class684_Sub4) this)
						.aClass430_10816));
	class422.aFloat4776 *= -1.0F;
	class422.method5063(((Class684_Sub4) this).aClass283_8607
				.method3788((short) -21701));
	return class422;
    }
    
    public boolean method7995() {
	return (!Float.isNaN(((Class684_Sub4) this).aClass430_10816.aFloat4816)
		&& ((Class684_Sub4) this).aClass283_8607
		       .method3788((short) 16278) != null);
    }
    
    public boolean method7986(int i) {
	return (!Float.isNaN(((Class684_Sub4) this).aClass430_10816.aFloat4816)
		&& ((Class684_Sub4) this).aClass283_8607
		       .method3788((short) -25278) != null);
    }
    
    public Class430 method10117(int i) {
	return new Class430(((Class684_Sub4) this).aClass430_10816);
    }
    
    public void method7989(Class284 class284, Class433 class433, int i,
			   int i_11_, float f, short i_12_) {
	Class422 class422
	    = Class422.method5052(((Class684_Sub4) this).aClass283_8607
				      .method3788((short) 4802));
	class422.aFloat4780 -= (float) i;
	class422.aFloat4777 -= (float) i_11_;
	class422.aFloat4776 *= -1.0F;
	class433.method5246(Class430.method5171(((Class684_Sub4) this)
						.aClass430_10816));
	class433.method5229(class422);
	class433.method5223();
	class422.method5054();
    }
    
    public void method7990(ByteBuffer class528_sub42, int i) {
	((Class684_Sub4) this).aClass430_10816.method5201(class528_sub42);
    }
    
    static {
	anInt10815 = 0;
	anInt10818 = 0;
	anInt10817 = 0;
	aFloat10823 = -1.0F;
	aFloat10819 = -1.0F;
	aFloat10813 = -1.0F;
	aFloat10821 = -1.0F;
	aFloat10822 = -1.0F;
	aFloat10812 = -1.0F;
    }
    
    public void method10118(Class422 class422, int i, int i_13_, int i_14_,
			    int i_15_, int i_16_, int i_17_, int i_18_) {
	aFloat10823
	    = i == -1 ? -1.0F : class422.aFloat4780 - (float) (512 * i);
	aFloat10819 = (-1 == i_13_ ? -1.0F
		       : (float) (512 * i_13_) + class422.aFloat4780);
	aFloat10813
	    = i_16_ == -1 ? -1.0F : -class422.aFloat4776 - (float) (512
								    * i_16_);
	aFloat10821
	    = -1 == i_17_ ? -1.0F : -class422.aFloat4776 + (float) (512
								    * i_17_);
	aFloat10822
	    = i_14_ == -1 ? -1.0F : class422.aFloat4777 - (float) (i_14_
								   * 512);
	aFloat10812
	    = -1 == i_15_ ? -1.0F : class422.aFloat4777 + (float) (i_15_
								   * 512);
    }
    
    public Class422 method8000() {
	Class422 class422 = new Class422(0.0F, 0.0F, 1000.0F);
	class422.method5075(Class430.method5171(((Class684_Sub4) this)
						.aClass430_10814));
	class422.aFloat4776 *= -1.0F;
	class422.method5063(((Class684_Sub4) this).aClass283_8607
				.method3788((short) -22561));
	return class422;
    }
    
    public void method7991(float f) {
	Class430 class430 = method10117(-1141554206);
	if (0 != 1102261925 * anInt10820 || 0 != anInt10815 * -1663029263) {
	    Class430 class430_19_ = Class430.method5188();
	    class430_19_.method5168(1.0F, 0.0F, 0.0F,
				    (float) (3.141592653589793
					     * (double) (anInt10820
							 * 1102261925)
					     * 2.0) / 16384.0F);
	    class430.method5176(class430_19_);
	    Class422 class422 = Class422.method5051(0.0F, 1.0F, 0.0F);
	    class422.method5075(class430);
	    Class430 class430_20_ = Class430.method5188();
	    class422.method5062();
	    class430_20_.method5167(class422,
				    ((float) (2.0
					      * (3.141592653589793
						 * (double) (anInt10815
							     * -1663029263)))
				     / 16384.0F));
	    class430.method5176(class430_20_);
	    method10110(class430, -650325032);
	    anInt10820 = 0;
	    anInt10815 = 0;
	}
	if ((((Class684_Sub4) this).aClass283_8607.method3787((byte) -33)
	     == Class297.aClass297_3255)
	    && (-661492479 * anInt10818 != 0
		|| anInt10817 * 1048448131 != 0)) {
	    class430.method5170();
	    Class326_Sub2 class326_sub2
		= (Class326_Sub2) ((Class684_Sub4) this).aClass283_8607
				      .method3811(-1554931077);
	    Class528_Sub19 class528_sub19
		= class326_sub2.method4241(-763613633);
	    Class422 class422 = class528_sub19.method9411(842943992);
	    Class422 class422_21_
		= Class422.method5051(0.0F, 0.0F,
				      (float) (anInt10817 * 1048448131));
	    class422_21_.method5075(class430);
	    class422_21_.aFloat4776 *= -1.0F;
	    class422.method5063(class422_21_);
	    Class422 class422_22_
		= Class422.method5051((float) (-661492479 * anInt10818), 0.0F,
				      0.0F);
	    class422_22_.method5075(class430);
	    class422_22_.aFloat4776 *= -1.0F;
	    class422.method5063(class422_22_);
	    method10130(class422, 1417100897);
	    class326_sub2.method9108
		(new Class528_Sub19(class528_sub19.anInt10392 * 1627467229,
				    (int) class422.aFloat4780,
				    (int) class422.aFloat4776,
				    (int) class422.aFloat4777),
		 1549398342);
	    anInt10818 = 0;
	    anInt10817 = 0;
	}
    }
    
    public void method7994(float f) {
	Class430 class430 = method10117(-1777228048);
	if (0 != 1102261925 * anInt10820 || 0 != anInt10815 * -1663029263) {
	    Class430 class430_23_ = Class430.method5188();
	    class430_23_.method5168(1.0F, 0.0F, 0.0F,
				    (float) (3.141592653589793
					     * (double) (anInt10820
							 * 1102261925)
					     * 2.0) / 16384.0F);
	    class430.method5176(class430_23_);
	    Class422 class422 = Class422.method5051(0.0F, 1.0F, 0.0F);
	    class422.method5075(class430);
	    Class430 class430_24_ = Class430.method5188();
	    class422.method5062();
	    class430_24_.method5167(class422,
				    ((float) (2.0
					      * (3.141592653589793
						 * (double) (anInt10815
							     * -1663029263)))
				     / 16384.0F));
	    class430.method5176(class430_24_);
	    method10110(class430, 383626651);
	    anInt10820 = 0;
	    anInt10815 = 0;
	}
	if ((((Class684_Sub4) this).aClass283_8607.method3787((byte) -68)
	     == Class297.aClass297_3255)
	    && (-661492479 * anInt10818 != 0
		|| anInt10817 * 1048448131 != 0)) {
	    class430.method5170();
	    Class326_Sub2 class326_sub2
		= (Class326_Sub2) ((Class684_Sub4) this).aClass283_8607
				      .method3811(-708529936);
	    Class528_Sub19 class528_sub19
		= class326_sub2.method4241(125103370);
	    Class422 class422 = class528_sub19.method9411(-852812325);
	    Class422 class422_25_
		= Class422.method5051(0.0F, 0.0F,
				      (float) (anInt10817 * 1048448131));
	    class422_25_.method5075(class430);
	    class422_25_.aFloat4776 *= -1.0F;
	    class422.method5063(class422_25_);
	    Class422 class422_26_
		= Class422.method5051((float) (-661492479 * anInt10818), 0.0F,
				      0.0F);
	    class422_26_.method5075(class430);
	    class422_26_.aFloat4776 *= -1.0F;
	    class422.method5063(class422_26_);
	    method10130(class422, -1693600888);
	    class326_sub2.method9108
		(new Class528_Sub19(class528_sub19.anInt10392 * 1627467229,
				    (int) class422.aFloat4780,
				    (int) class422.aFloat4776,
				    (int) class422.aFloat4777),
		 -1212179643);
	    anInt10818 = 0;
	    anInt10817 = 0;
	}
    }
    
    public void method7996(Class284 class284, Class433 class433, int i,
			   int i_27_, float f) {
	Class422 class422
	    = Class422.method5052(((Class684_Sub4) this).aClass283_8607
				      .method3788((short) 8690));
	class422.aFloat4780 -= (float) i;
	class422.aFloat4777 -= (float) i_27_;
	class422.aFloat4776 *= -1.0F;
	class433.method5246(Class430.method5171(((Class684_Sub4) this)
						.aClass430_10816));
	class433.method5229(class422);
	class433.method5223();
	class422.method5054();
    }
    
    public void method8002(ByteBuffer class528_sub42) {
	((Class684_Sub4) this).aClass430_10816.method5201(class528_sub42);
    }
    
    public Class422 method7992() {
	Class422 class422 = new Class422(0.0F, 0.0F, 1000.0F);
	class422.method5075(Class430.method5171(((Class684_Sub4) this)
						.aClass430_10816));
	class422.aFloat4776 *= -1.0F;
	class422.method5063(((Class684_Sub4) this).aClass283_8607
				.method3788((short) -8995));
	return class422;
    }
    
    public Class422 method7998() {
	Class422 class422 = new Class422(0.0F, 0.0F, 1000.0F);
	class422.method5075(Class430.method5171(((Class684_Sub4) this)
						.aClass430_10816));
	class422.aFloat4776 *= -1.0F;
	class422.method5063(((Class684_Sub4) this).aClass283_8607
				.method3788((short) 4347));
	return class422;
    }
    
    public void method10119(int i, int i_28_, int i_29_) {
	Class433 class433 = new Class433();
	class433.method5220(0.0, 0.0, 0.0, (double) i, (double) -i_28_,
			    (double) i_29_, 0.0F, 1.0F, 0.0F);
	Class434 class434 = new Class434();
	class433.method5236(class434.aFloatArray4844);
	Class430 class430 = class434.method5259();
	class430.method5170();
	((Class684_Sub4) this).aClass430_10816.method5187(class430);
    }
    
    public Class422 method8001() {
	Class422 class422 = new Class422(0.0F, 0.0F, 1000.0F);
	class422.method5075(Class430.method5171(((Class684_Sub4) this)
						.aClass430_10816));
	class422.aFloat4776 *= -1.0F;
	class422.method5063(((Class684_Sub4) this).aClass283_8607
				.method3788((short) -20626));
	return class422;
    }
    
    public void method8003(ByteBuffer class528_sub42) {
	((Class684_Sub4) this).aClass430_10816.method5201(class528_sub42);
    }
    
    public void method10120(int i) {
	anInt10817 = i * 757309995;
    }
    
    public void method10121(Class430 class430) {
	((Class684_Sub4) this).aClass430_10814.aFloat4816
	    = class430.aFloat4816;
	((Class684_Sub4) this).aClass430_10814.aFloat4819
	    = class430.aFloat4819;
	((Class684_Sub4) this).aClass430_10814.aFloat4818
	    = class430.aFloat4818;
	((Class684_Sub4) this).aClass430_10814.aFloat4815
	    = class430.aFloat4815;
	((Class684_Sub4) this).aClass430_10816
	    .method5187(((Class684_Sub4) this).aClass430_10814);
    }
    
    public void method10122(int i) {
	anInt10820 = i * -1713829587;
    }
    
    public void method10123(int i, int i_30_, int i_31_) {
	Class433 class433 = new Class433();
	class433.method5220(0.0, 0.0, 0.0, (double) i, (double) -i_30_,
			    (double) i_31_, 0.0F, 1.0F, 0.0F);
	Class434 class434 = new Class434();
	class433.method5236(class434.aFloatArray4844);
	Class430 class430 = class434.method5259();
	class430.method5170();
	((Class684_Sub4) this).aClass430_10816.method5187(class430);
    }
    
    public void method10124(int i) {
	anInt10820 = i * -1713829587;
    }
    
    public void method10125(int i) {
	anInt10815 = -191176431 * i;
    }
    
    public void method10126(int i) {
	anInt10815 = -191176431 * i;
    }
    
    public void method10127(int i) {
	anInt10818 = i * -187264255;
    }
    
    public void method7997(Class284 class284, Class433 class433, int i,
			   int i_32_, float f) {
	Class422 class422
	    = Class422.method5052(((Class684_Sub4) this).aClass283_8607
				      .method3788((short) -21764));
	class422.aFloat4780 -= (float) i;
	class422.aFloat4777 -= (float) i_32_;
	class422.aFloat4776 *= -1.0F;
	class433.method5246(Class430.method5171(((Class684_Sub4) this)
						.aClass430_10816));
	class433.method5229(class422);
	class433.method5223();
	class422.method5054();
    }
    
    public void method10128(int i) {
	anInt10817 = i * 757309995;
    }
    
    public void method8004(float f, int i) {
	Class430 class430 = method10117(-1347818771);
	if (0 != 1102261925 * anInt10820 || 0 != anInt10815 * -1663029263) {
	    Class430 class430_33_ = Class430.method5188();
	    class430_33_.method5168(1.0F, 0.0F, 0.0F,
				    (float) (3.141592653589793
					     * (double) (anInt10820
							 * 1102261925)
					     * 2.0) / 16384.0F);
	    class430.method5176(class430_33_);
	    Class422 class422 = Class422.method5051(0.0F, 1.0F, 0.0F);
	    class422.method5075(class430);
	    Class430 class430_34_ = Class430.method5188();
	    class422.method5062();
	    class430_34_.method5167(class422,
				    ((float) (2.0
					      * (3.141592653589793
						 * (double) (anInt10815
							     * -1663029263)))
				     / 16384.0F));
	    class430.method5176(class430_34_);
	    method10110(class430, -72341629);
	    anInt10820 = 0;
	    anInt10815 = 0;
	}
	if ((((Class684_Sub4) this).aClass283_8607.method3787((byte) -103)
	     == Class297.aClass297_3255)
	    && (-661492479 * anInt10818 != 0
		|| anInt10817 * 1048448131 != 0)) {
	    class430.method5170();
	    Class326_Sub2 class326_sub2
		= (Class326_Sub2) ((Class684_Sub4) this).aClass283_8607
				      .method3811(-1886647363);
	    Class528_Sub19 class528_sub19
		= class326_sub2.method4241(-390630265);
	    Class422 class422 = class528_sub19.method9411(-714585565);
	    Class422 class422_35_
		= Class422.method5051(0.0F, 0.0F,
				      (float) (anInt10817 * 1048448131));
	    class422_35_.method5075(class430);
	    class422_35_.aFloat4776 *= -1.0F;
	    class422.method5063(class422_35_);
	    Class422 class422_36_
		= Class422.method5051((float) (-661492479 * anInt10818), 0.0F,
				      0.0F);
	    class422_36_.method5075(class430);
	    class422_36_.aFloat4776 *= -1.0F;
	    class422.method5063(class422_36_);
	    method10130(class422, 1972945536);
	    class326_sub2.method9108
		(new Class528_Sub19(class528_sub19.anInt10392 * 1627467229,
				    (int) class422.aFloat4780,
				    (int) class422.aFloat4776,
				    (int) class422.aFloat4777),
		 1998418705);
	    anInt10818 = 0;
	    anInt10817 = 0;
	}
    }
    
    public Class422 method7987(int i) {
	Class422 class422 = new Class422(0.0F, 0.0F, 1000.0F);
	class422.method5075(Class430.method5171(((Class684_Sub4) this)
						.aClass430_10816));
	class422.aFloat4776 *= -1.0F;
	class422.method5063(((Class684_Sub4) this).aClass283_8607
				.method3788((short) -4939));
	return class422;
    }
    
    public void method10129(int i) {
	anInt10817 = i * 757309995;
    }
    
    void method10130(Class422 class422, int i) {
	if (aFloat10823 != -1.0F && class422.aFloat4780 < aFloat10823)
	    class422.aFloat4780 = aFloat10823;
	if (-1.0F != aFloat10819 && class422.aFloat4780 > aFloat10819)
	    class422.aFloat4780 = aFloat10819;
	if (-1.0F != aFloat10813 && class422.aFloat4776 < aFloat10813)
	    class422.aFloat4776 = aFloat10813;
	if (aFloat10821 != -1.0F && class422.aFloat4776 > aFloat10821)
	    class422.aFloat4776 = aFloat10821;
	if (aFloat10822 != -1.0F && class422.aFloat4777 < aFloat10822)
	    class422.aFloat4777 = aFloat10822;
	if (aFloat10812 != -1.0F && class422.aFloat4777 > aFloat10812)
	    class422.aFloat4777 = aFloat10812;
    }
    
    public void method7999(float f) {
	Class430 class430 = method10117(-1759145146);
	if (0 != 1102261925 * anInt10820 || 0 != anInt10815 * -1663029263) {
	    Class430 class430_37_ = Class430.method5188();
	    class430_37_.method5168(1.0F, 0.0F, 0.0F,
				    (float) (3.141592653589793
					     * (double) (anInt10820
							 * 1102261925)
					     * 2.0) / 16384.0F);
	    class430.method5176(class430_37_);
	    Class422 class422 = Class422.method5051(0.0F, 1.0F, 0.0F);
	    class422.method5075(class430);
	    Class430 class430_38_ = Class430.method5188();
	    class422.method5062();
	    class430_38_.method5167(class422,
				    ((float) (2.0
					      * (3.141592653589793
						 * (double) (anInt10815
							     * -1663029263)))
				     / 16384.0F));
	    class430.method5176(class430_38_);
	    method10110(class430, -180481885);
	    anInt10820 = 0;
	    anInt10815 = 0;
	}
	if ((((Class684_Sub4) this).aClass283_8607.method3787((byte) -59)
	     == Class297.aClass297_3255)
	    && (-661492479 * anInt10818 != 0
		|| anInt10817 * 1048448131 != 0)) {
	    class430.method5170();
	    Class326_Sub2 class326_sub2
		= (Class326_Sub2) ((Class684_Sub4) this).aClass283_8607
				      .method3811(-1526862049);
	    Class528_Sub19 class528_sub19
		= class326_sub2.method4241(2146465227);
	    Class422 class422 = class528_sub19.method9411(1650174264);
	    Class422 class422_39_
		= Class422.method5051(0.0F, 0.0F,
				      (float) (anInt10817 * 1048448131));
	    class422_39_.method5075(class430);
	    class422_39_.aFloat4776 *= -1.0F;
	    class422.method5063(class422_39_);
	    Class422 class422_40_
		= Class422.method5051((float) (-661492479 * anInt10818), 0.0F,
				      0.0F);
	    class422_40_.method5075(class430);
	    class422_40_.aFloat4776 *= -1.0F;
	    class422.method5063(class422_40_);
	    method10130(class422, -1324334661);
	    class326_sub2.method9108
		(new Class528_Sub19(class528_sub19.anInt10392 * 1627467229,
				    (int) class422.aFloat4780,
				    (int) class422.aFloat4776,
				    (int) class422.aFloat4777),
		 444609499);
	    anInt10818 = 0;
	    anInt10817 = 0;
	}
    }
    
    public void method8005(ByteBuffer class528_sub42) {
	((Class684_Sub4) this).aClass430_10816.method5201(class528_sub42);
    }
    
    static void method10131(long[] ls, int[] is, int i, int i_41_, int i_42_) {
	if (i < i_41_) {
	    int i_43_ = (i + i_41_) / 2;
	    int i_44_ = i;
	    long l = ls[i_43_];
	    ls[i_43_] = ls[i_41_];
	    ls[i_41_] = l;
	    int i_45_ = is[i_43_];
	    is[i_43_] = is[i_41_];
	    is[i_41_] = i_45_;
	    int i_46_ = l == 9223372036854775807L ? 0 : 1;
	    for (int i_47_ = i; i_47_ < i_41_; i_47_++) {
		if (ls[i_47_] < (long) (i_47_ & i_46_) + l) {
		    long l_48_ = ls[i_47_];
		    ls[i_47_] = ls[i_44_];
		    ls[i_44_] = l_48_;
		    int i_49_ = is[i_47_];
		    is[i_47_] = is[i_44_];
		    is[i_44_++] = i_49_;
		}
	    }
	    ls[i_41_] = ls[i_44_];
	    ls[i_44_] = l;
	    is[i_41_] = is[i_44_];
	    is[i_44_] = i_45_;
	    method10131(ls, is, i, i_44_ - 1, 1695628694);
	    method10131(ls, is, 1 + i_44_, i_41_, 2086884432);
	}
    }
}
