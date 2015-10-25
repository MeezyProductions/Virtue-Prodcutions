/* Class200 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class200 implements Interface4
{
    Class186 aClass186_2208 = new Class186(100);
    Interface12 anInterface12_2209;
    
    Class528_Sub21_Sub16 method2844(int i, byte i_0_) {
	Class528_Sub21_Sub16 class528_sub21_sub16;
	synchronized (((Class200) this).aClass186_2208) {
	    class528_sub21_sub16
		= ((Class528_Sub21_Sub16)
		   ((Class200) this).aClass186_2208.method2727((long) i));
	    if (null == class528_sub21_sub16) {
		class528_sub21_sub16 = new Class528_Sub21_Sub16(i);
		((Class200) this).aClass186_2208
		    .method2729(class528_sub21_sub16, (long) i);
	    }
	    if (!class528_sub21_sub16.method10579(1468913189)) {
		Class528_Sub21_Sub16 class528_sub21_sub16_1_ = null;
		return class528_sub21_sub16_1_;
	    }
	}
	return class528_sub21_sub16;
    }
    
    void method2845(int i) {
	synchronized (((Class200) this).aClass186_2208) {
	    ((Class200) this).aClass186_2208.method2731(-1613873569);
	}
    }
    
    void method2846(int i, int i_2_) {
	synchronized (((Class200) this).aClass186_2208) {
	    ((Class200) this).aClass186_2208.method2747(i, -1708456419);
	}
    }
    
    void method2847(int i) {
	synchronized (((Class200) this).aClass186_2208) {
	    ((Class200) this).aClass186_2208.method2735(619817384);
	}
    }
    
    void method2848() {
	synchronized (((Class200) this).aClass186_2208) {
	    ((Class200) this).aClass186_2208.method2735(-1799131228);
	}
    }
    
    void method2849() {
	synchronized (((Class200) this).aClass186_2208) {
	    ((Class200) this).aClass186_2208.method2731(-2139929183);
	}
    }
    
    void method2850() {
	synchronized (((Class200) this).aClass186_2208) {
	    ((Class200) this).aClass186_2208.method2735(2075300441);
	}
    }
    
    void method2851() {
	synchronized (((Class200) this).aClass186_2208) {
	    ((Class200) this).aClass186_2208.method2731(-1550861189);
	}
    }
    
    void method2852(int i) {
	synchronized (((Class200) this).aClass186_2208) {
	    ((Class200) this).aClass186_2208.method2747(i, 227711136);
	}
    }
    
    void method2853(int i) {
	synchronized (((Class200) this).aClass186_2208) {
	    ((Class200) this).aClass186_2208.method2747(i, -289881840);
	}
    }
    
    Class200(Interface12 interface12, Class446 class446,
	     Class446 class446_3_) {
	((Class200) this).anInterface12_2209 = interface12;
	Class655.method7843(class446, class446_3_, 2, 939068291);
    }
    
    void method2854() {
	synchronized (((Class200) this).aClass186_2208) {
	    ((Class200) this).aClass186_2208.method2735(1860389371);
	}
    }
    
    static final void method2855(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class530.method6464(class229, class648, 65280);
    }
    
    static final void method2856(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub27_10568
		  .method10040((byte) -70);
    }
    
    static void method2857(Class229 class229, int i, int i_4_, boolean bool,
			   int i_5_) {
	int i_6_ = class229.anInt2476 * -1352480433;
	int i_7_ = class229.anInt2458 * 1661025435;
	if (class229.aByte2452 == 0)
	    class229.anInt2476 = 1856903427 * class229.anInt2386;
	else if (class229.aByte2452 == 1)
	    class229.anInt2476
		= 2016587183 * (i - class229.anInt2386 * 2038633197);
	else if (class229.aByte2452 == 2)
	    class229.anInt2476
		= 2016587183 * (class229.anInt2386 * 2038633197 * i >> 14);
	if (class229.aByte2526 == 0)
	    class229.anInt2458 = class229.anInt2387 * -1036214629;
	else if (1 == class229.aByte2526)
	    class229.anInt2458
		= (i_4_ - 1601919961 * class229.anInt2387) * -1222227565;
	else if (2 == class229.aByte2526)
	    class229.anInt2458
		= (class229.anInt2387 * 1601919961 * i_4_ >> 14) * -1222227565;
	if (class229.aByte2452 == 4)
	    class229.anInt2476
		= 2016587183 * (class229.anInt2392 * 654476447
				* (class229.anInt2458 * 1661025435)
				/ (1196092957 * class229.anInt2393));
	if (class229.aByte2526 == 4)
	    class229.anInt2458
		= -1222227565 * (1196092957 * class229.anInt2393
				 * (-1352480433 * class229.anInt2476)
				 / (class229.anInt2392 * 654476447));
	if (client.aBool11062
	    && (client.method10201(class229).anInt10455 * -450987711 != 0
		|| -319431967 * class229.anInt2378 == 0)) {
	    if (1661025435 * class229.anInt2458 < 5
		&& class229.anInt2476 * -1352480433 < 5) {
		class229.anInt2458 = -1816170529;
		class229.anInt2476 = 1493001323;
	    } else {
		if (1661025435 * class229.anInt2458 <= 0)
		    class229.anInt2458 = -1816170529;
		if (class229.anInt2476 * -1352480433 <= 0)
		    class229.anInt2476 = 1493001323;
	    }
	}
	if (Class229.anInt2356 * -1948898659
	    == -1257480855 * class229.anInt2474)
	    client.aClass229_11027 = class229;
	if (bool && class229.anObjectArray2523 != null
	    && (class229.anInt2476 * -1352480433 != i_6_
		|| i_7_ != class229.anInt2458 * 1661025435)) {
	    Class528_Sub30 class528_sub30 = new Class528_Sub30();
	    class528_sub30.aClass229_10461 = class229;
	    class528_sub30.anObjectArray10460 = class229.anObjectArray2523;
	    client.aClass688_10992.method8031(class528_sub30, (byte) 86);
	}
    }
}
