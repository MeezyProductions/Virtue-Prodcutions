/* Class465 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Container;
import java.util.Comparator;

class Class465 implements Comparator
{
    Class463 this$0;
    
    public int method5618(Object object, Object object_0_) {
	return method5620((Class443) object, (Class443) object_0_, 1150270643);
    }
    
    public int compare(Object object, Object object_1_) {
	return method5620((Class443) object, (Class443) object_1_, 1723240607);
    }
    
    public boolean equals(Object object) {
	return super.equals(object);
    }
    
    public int method5619(Object object, Object object_2_) {
	return method5620((Class443) object, (Class443) object_2_, 1927401862);
    }
    
    int method5620(Class443 class443, Class443 class443_3_, int i) {
	if (1764050934023832073L * ((Class443) class443).aLong4912
	    > 1764050934023832073L * ((Class443) class443_3_).aLong4912)
	    return 1;
	if (1764050934023832073L * ((Class443) class443).aLong4912
	    < ((Class443) class443_3_).aLong4912 * 1764050934023832073L)
	    return -1;
	return 0;
    }
    
    public int method5621(Object object, Object object_4_) {
	return method5620((Class443) object, (Class443) object_4_, 1495797936);
    }
    
    public int method5622(Object object, Object object_5_) {
	return method5620((Class443) object, (Class443) object_5_, 1519565694);
    }
    
    public boolean method5623(Object object) {
	return super.equals(object);
    }
    
    public boolean method5624(Object object) {
	return super.equals(object);
    }
    
    Class465(Class463 class463) {
	((Class465) this).this$0 = class463;
    }
    
    public static Container method5625(int i) {
	if (Class207.aFrame2236 != null)
	    return Class207.aFrame2236;
	if (null != Class196.aFrame2197)
	    return Class196.aFrame2197;
	return Class196.anApplet2198;
    }
    
    static final void method5626(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= 1239022665;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = -1;
    }
    
    static final void method5627(Class229[] class229s, int i, int i_6_) {
	for (int i_7_ = 0; i_7_ < class229s.length; i_7_++) {
	    Class229 class229 = class229s[i_7_];
	    if (null != class229 && i == -1027873541 * class229.anInt2522
		&& !client.method10203(class229)) {
		if (0 == class229.anInt2378 * -319431967) {
		    method5627(class229s, class229.anInt2376 * 306930455,
			       -824655212);
		    if (class229.aClass229Array2390 != null)
			method5627(class229.aClass229Array2390,
				   306930455 * class229.anInt2376, -824655212);
		    Class528_Sub39 class528_sub39
			= ((Class528_Sub39)
			   (client.aClass692_11097.method8137
			    ((long) (306930455 * class229.anInt2376))));
		    if (class528_sub39 != null)
			Class97.method1291((class528_sub39.anInt10625
					    * 905908359),
					   (short) 16384);
		}
		if (-319431967 * class229.anInt2378 == 6
		    && -1 != 1986515517 * class229.anInt2440) {
		    if (null == class229.aClass690_2541) {
			class229.aClass690_2541 = new Class690_Sub2();
			class229.aClass690_2541.method8069((1986515517
							    * (class229
							       .anInt2440)),
							   (byte) 12);
		    }
		    if (class229.aClass690_2541.method8080((client.anInt10971
							    * -178309515),
							   (byte) 11)
			&& class229.aClass690_2541.method8082(-1736961962))
			class229.aClass690_2541.method8084(-1658634388);
		}
	    }
	}
    }
    
    public static void method5628
	(float f, Class422 class422, Class430 class430, Class422 class422_8_,
	 Class422 class422_9_, Class422 class422_10_, Class422 class422_11_,
	 float f_12_, float f_13_, float f_14_, float f_15_, int i) {
	if (!class422_8_.method5060(class422)) {
	    Class422 class422_16_ = Class422.method5051(0.0F, 0.0F, 0.0F);
	    Class422 class422_17_
		= Class422.method5052(Class422.method5065(class422_8_,
							  class422));
	    class422_17_.method5075(class430);
	    Class422 class422_18_
		= Class422.method5065(class422_17_, class422_16_);
	    float f_19_ = class422_18_.method5069();
	    if (f_12_ > 0.0F) {
		class422_10_ = Class422.method5052(class422_10_);
		class422_10_.method5095(f_13_ * (f_19_ / f_12_));
	    }
	    if (class422_10_.aFloat4780 == Float.POSITIVE_INFINITY
		|| Float.isNaN(class422.aFloat4780) || f_19_ > f_14_
		|| f_19_ < f_15_) {
		class422.method5058(class422_8_);
		class422_9_.method5059();
	    } else {
		class430.method5170();
		Class422 class422_20_ = Class422.method5051(1.0F, 0.0F, 0.0F);
		Class422 class422_21_ = Class422.method5051(0.0F, 1.0F, 0.0F);
		Class422 class422_22_ = Class422.method5051(0.0F, 0.0F, 1.0F);
		class422_20_.method5075(class430);
		class422_21_.method5075(class430);
		class422_22_.method5075(class430);
		Class422 class422_23_
		    = Class422.method5051(Class422.method5085(class422_20_,
							      class422_9_),
					  Class422.method5085(class422_21_,
							      class422_9_),
					  Class422.method5085(class422_22_,
							      class422_9_));
		Class422 class422_24_ = Class422.method5052(class422_23_);
		class422_24_.method5070();
		Class422 class422_25_
		    = Class422.method5078(Class422.method5091(class422_24_,
							      class422_24_),
					  Class422.method5084(class422_10_,
							      2.0F));
		Class422 class422_26_ = Class422.method5052(class422_18_);
		class422_26_.method5070();
		Class422 class422_27_ = Class422.method5052(class422_23_);
		if (class422_25_.aFloat4780 > class422_26_.aFloat4780) {
		    if (class422_18_.aFloat4780 < 0.0F) {
			class422_27_.aFloat4780 += f * class422_10_.aFloat4780;
			if (class422_27_.aFloat4780 > 0.0F)
			    class422_27_.aFloat4780 = 0.0F;
		    } else {
			class422_27_.aFloat4780 -= class422_10_.aFloat4780 * f;
			if (class422_27_.aFloat4780 < 0.0F)
			    class422_27_.aFloat4780 = 0.0F;
		    }
		} else if (class422_24_.aFloat4780 < class422_11_.aFloat4780) {
		    if (class422_18_.aFloat4780 < 0.0F) {
			class422_27_.aFloat4780 -= f * class422_10_.aFloat4780;
			if (class422_27_.aFloat4780 < -class422_11_.aFloat4780)
			    class422_27_.aFloat4780 = -class422_11_.aFloat4780;
		    } else {
			class422_27_.aFloat4780 += f * class422_10_.aFloat4780;
			if (class422_27_.aFloat4780 > class422_11_.aFloat4780)
			    class422_27_.aFloat4780 = class422_11_.aFloat4780;
		    }
		}
		if (class422_25_.aFloat4776 > class422_26_.aFloat4776) {
		    if (class422_18_.aFloat4776 < 0.0F) {
			class422_27_.aFloat4776 += class422_10_.aFloat4776 * f;
			if (class422_27_.aFloat4776 > 0.0F)
			    class422_27_.aFloat4776 = 0.0F;
		    } else {
			class422_27_.aFloat4776 -= class422_10_.aFloat4776 * f;
			if (class422_27_.aFloat4776 < 0.0F)
			    class422_27_.aFloat4776 = 0.0F;
		    }
		} else if (class422_24_.aFloat4776 < class422_11_.aFloat4776) {
		    if (class422_18_.aFloat4776 < 0.0F) {
			class422_27_.aFloat4776 -= class422_10_.aFloat4776 * f;
			if (class422_27_.aFloat4776 < -class422_11_.aFloat4776)
			    class422_27_.aFloat4776 = -class422_11_.aFloat4776;
		    } else {
			class422_27_.aFloat4776 += f * class422_10_.aFloat4776;
			if (class422_27_.aFloat4776 > class422_11_.aFloat4776)
			    class422_27_.aFloat4776 = class422_11_.aFloat4776;
		    }
		}
		if (class422_25_.aFloat4777 > class422_26_.aFloat4777) {
		    if (class422_18_.aFloat4777 < 0.0F) {
			class422_27_.aFloat4777 += f * class422_10_.aFloat4777;
			if (class422_27_.aFloat4777 > 0.0F)
			    class422_27_.aFloat4777 = 0.0F;
		    } else {
			class422_27_.aFloat4777 -= f * class422_10_.aFloat4777;
			if (class422_27_.aFloat4777 < 0.0F)
			    class422_27_.aFloat4777 = 0.0F;
		    }
		} else if (class422_24_.aFloat4777 < class422_11_.aFloat4777) {
		    if (class422_18_.aFloat4777 < 0.0F) {
			class422_27_.aFloat4777 -= class422_10_.aFloat4777 * f;
			if (class422_27_.aFloat4777 < -class422_11_.aFloat4777)
			    class422_27_.aFloat4777 = -class422_11_.aFloat4777;
		    } else {
			class422_27_.aFloat4777 += f * class422_10_.aFloat4777;
			if (class422_27_.aFloat4777 > class422_11_.aFloat4777)
			    class422_27_.aFloat4777 = class422_11_.aFloat4777;
		    }
		}
		Class422 class422_28_
		    = Class422.method5084(class422_20_,
					  class422_27_.aFloat4780);
		class422_28_.method5064(class422_21_, class422_27_.aFloat4776);
		class422_28_.method5064(class422_22_, class422_27_.aFloat4777);
		class422_9_.method5093(class422_28_, 0.8F);
		class422.method5063(Class422.method5084(class422_9_, f));
		class422_24_.method5054();
		class422_27_.method5054();
		class422_26_.method5054();
	    }
	}
    }
    
    static final void method5629(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class203.method2865(class229, class648, -239302471);
    }
}
