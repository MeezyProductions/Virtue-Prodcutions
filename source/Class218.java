/* Class218 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Class218
{
    Interface55 anInterface55_2292;
    static final int anInt2293 = 8192;
    static final int anInt2294 = 16384;
    boolean aBool2295;
    HashMap aHashMap2296;
    List aList2297;
    static final int anInt2298 = 4096;
    Interface55 anInterface55_2299;
    static final int anInt2300 = 8192;
    List aList2301;
    HashMap aHashMap2302;
    HashMap aHashMap2303;
    static final int anInt2304 = 0;
    Class186 aClass186_2305;
    Class186 aClass186_2306;
    Class186 aClass186_2307;
    Interface55 anInterface55_2308;
    Class422 aClass422_2309;
    int anInt2310;
    int anInt2311;
    static final int anInt2312 = 16384;
    Class469 aClass469_2313;
    boolean aBool2314;
    int anInt2315;
    static final int anInt2316 = 4096;
    boolean aBool2317;
    Interface55 anInterface55_2318;
    Class469 aClass469_2319;
    int anInt2320;
    List aList2321 = new ArrayList();
    
    Class469 method3081(Interface67 interface67, byte i) {
	if (!((Class218) this).aBool2295)
	    return null;
	int i_0_ = 0;
	Iterator iterator = ((Class218) this).aList2321.iterator();
	while (iterator.hasNext()) {
	    Class469 class469 = (Class469) iterator.next();
	    i_0_++;
	    if (class469.method5747((byte) 1) == Class473.aClass473_5424) {
		class469.method5739(interface67, 937834506);
		return class469;
	    }
	}
	if (i_0_ >= -651759513 * ((Class218) this).anInt2320)
	    return null;
	Class469 class469 = interface67.method438(-1354201626);
	((Class218) this).aList2321.add(class469);
	return class469;
    }
    
    List method3082(byte i) {
	return ((Class218) this).aList2297;
    }
    
    Class186 method3083(int i) {
	return ((Class218) this).aClass186_2305;
    }
    
    Class186 method3084(int i) {
	return ((Class218) this).aClass186_2306;
    }
    
    Class422 method3085(int i) {
	return ((Class218) this).aClass422_2309;
    }
    
    public Class218() {
	((Class218) this).aList2301 = new ArrayList();
	((Class218) this).aHashMap2302 = new HashMap();
	((Class218) this).aHashMap2303 = new HashMap();
	((Class218) this).aList2297 = new ArrayList();
	((Class218) this).aHashMap2296 = new HashMap();
	((Class218) this).aClass469_2313 = null;
	((Class218) this).aBool2314 = false;
	((Class218) this).anInterface55_2318 = new Class189(this);
	((Class218) this).anInterface55_2299 = new Class193(this);
	((Class218) this).anInterface55_2292 = new Class199(this);
	((Class218) this).anInterface55_2308 = new Class192(this);
    }
    
    public void method3086(int i, int i_1_, int i_2_) {
	if (!((Class218) this).aBool2295) {
	    ((Class218) this).anInt2320 = i * 832908119;
	    ((Class218) this).aClass186_2305 = new Class186(i_1_, 100);
	    ((Class218) this).aClass186_2306 = new Class186(10);
	    ((Class218) this).aClass186_2305.method2726(new Class184(this),
							-1372240693);
	    Class642 class642 = new Class642(Class359.aClass359_3826);
	    Class278.method3731(class642, -1625308870);
	    method3091((byte) 117);
	    ((Class218) this).anInt2311 = -2002439981;
	    ((Class218) this).aBool2295 = true;
	}
    }
    
    public void method3087() {
	Class466.method5645(717927929);
    }
    
    public void method3088(int i, int i_3_) {
	Class220 class220
	    = ((Class220)
	       ((Class218) this).aHashMap2296.get(Integer.valueOf(i)));
	if (class220 != null) {
	    List list = class220.method3147((short) -1753);
	    Iterator iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class469 class469 = (Class469) iterator.next();
		if (!class469.method5737(-337662480))
		    class469.method5741((byte) -125);
	    }
	}
    }
    
    public void method3089(int i, int i_4_) {
	Class220 class220
	    = ((Class220)
	       ((Class218) this).aHashMap2296.get(Integer.valueOf(i)));
	if (class220 != null) {
	    List list = class220.method3147((short) -17243);
	    Iterator iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class469 class469 = (Class469) iterator.next();
		class469.method5742(50, 2022255626);
	    }
	}
    }
    
    public void method3090(int i, int i_5_) {
	Class220 class220
	    = ((Class220)
	       ((Class218) this).aHashMap2296.get(Integer.valueOf(i)));
	if (null != class220) {
	    List list = class220.method3147((short) -15669);
	    Iterator iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class469 class469 = (Class469) iterator.next();
		class469.method5740((byte) -73);
	    }
	}
    }
    
    void method3091(byte i) {
	Class201 class201 = new Class201(this);
	Class183 class183 = new Class183(this);
	Class221 class221 = new Class221(this);
	Class208 class208 = new Class208(this);
	Class222 class222 = new Class222(this);
	Class109.method1402(Class191.aClass191_2167.method2788(-2047561991),
			    Class191.aClass191_2165.method2788(-2027558736),
			    0.2F, class201, -2033156126);
	Class109.method1402(Class191.aClass191_2166.method2788(-1707314798),
			    Class191.aClass191_2165.method2788(-1885324797),
			    1.0F, class183, -2031913115);
	Class109.method1402(Class191.aClass191_2168.method2788(-1702325323),
			    Class191.aClass191_2165.method2788(-1895146753),
			    1.0F, class221, -2091968486);
	Class109.method1402(Class191.aClass191_2164.method2788(-1943429594),
			    Class191.aClass191_2165.method2788(-1853582705),
			    0.8F, class208, -2077211564);
	Class109.method1402(Class191.aClass191_2169.method2788(-1747903747),
			    Class191.aClass191_2165.method2788(-1952052503),
			    1.0F, class222, -2016079697);
	Class109.method1402(Class188.aClass188_2131.method2758(-1560776500),
			    Class191.aClass191_2166.method2788(-2100477172),
			    1.0F, null, -2130388923);
	Class109.method1402(Class188.aClass188_2128.method2758(-1560776500),
			    Class191.aClass191_2169.method2788(-2137826718),
			    1.0F, null, -2041392065);
	Class109.method1402(Class188.aClass188_2130.method2758(-1560776500),
			    Class191.aClass191_2167.method2788(-1749485484),
			    1.0F, null, -2041627972);
	Class109.method1402(Class188.aClass188_2137.method2758(-1560776500),
			    Class191.aClass191_2167.method2788(-1750988887),
			    1.0F, null, -2037453482);
	Class109.method1402(Class188.aClass188_2132.method2758(-1560776500),
			    Class191.aClass191_2167.method2788(-2087762978),
			    1.0F, null, -2050081104);
	Class109.method1402(Class188.aClass188_2133.method2758(-1560776500),
			    Class191.aClass191_2167.method2788(-1894726511),
			    1.0F, null, -2081732021);
	Class109.method1402(Class188.aClass188_2129.method2758(-1560776500),
			    Class191.aClass191_2167.method2788(-1886781353),
			    1.0F, null, -2142941636);
	Class109.method1402(Class188.aClass188_2135.method2758(-1560776500),
			    Class191.aClass191_2164.method2788(-2093282411),
			    1.0F, null, -2124137684);
	Class109.method1402(Class188.aClass188_2134.method2758(-1560776500),
			    Class188.aClass188_2135.method2758(-1560776500),
			    1.0F, null, -2056428641);
	Class109.method1402(Class188.aClass188_2136.method2758(-1560776500),
			    Class188.aClass188_2135.method2758(-1560776500),
			    1.0F, null, -1989719196);
	Class537.method6528
	    (Class188.aClass188_2131.method2758(-1560776500), (byte) 0)
	    .method4555(0.75F, -1284989175);
    }
    
    public void method3092(int i, int i_6_, int i_7_, int i_8_) {
	int i_9_ = Class191.aClass191_2165.method2788(-1714676988);
	if (Class537.method6528(i, (byte) 0) == null
	    && (i_9_ == i_6_ || Class537.method6528(i_6_, (byte) 0) != null)) {
	    float f = 1.5258789E-5F * (float) i_7_;
	    Class109.method1402(i, i_9_ == i_6_ ? -1 : i_6_, f, null,
				-1991804599);
	}
    }
    
    public void method3093(int i) {
	Class466.method5645(717927929);
    }
    
    float method3094(int i, byte i_10_) {
	Class351 class351 = Class537.method6528(i, (byte) 0);
	float f = 1.0F;
	for (/**/; class351 != null;
	     class351 = class351.method4561(1519561111))
	    f *= class351.method4554(144195984);
	return f;
    }
    
    public void method3095(int i, byte i_11_) {
	Iterator iterator = ((Class218) this).aList2301.iterator();
	while (iterator.hasNext()) {
	    Class469 class469 = (Class469) iterator.next();
	    int i_12_ = class469.method5788((byte) 8);
	    boolean bool = Class551_Sub1.method9745(i_12_, i, (byte) 94);
	    if (bool)
		class469.method5742(50, 2114505197);
	}
    }
    
    void method3096(int[] is, int i) {
	if (((Class218) this).aBool2295 && is != null) {
	    int[] is_13_ = is;
	    for (int i_14_ = 0; i_14_ < is_13_.length; i_14_++) {
		int i_15_ = is_13_[i_14_];
		method3097(i_15_, -765610249);
	    }
	}
    }
    
    public void method3097(int i, int i_16_) {
	if (((Class218) this).aBool2295 && i >= 0)
	    method3099(i, false, 688317872);
    }
    
    Interface67 method3098(int i, boolean bool, byte i_17_) {
	if (!((Class218) this).aBool2295)
	    return null;
	Interface67 interface67
	    = ((Interface67)
	       (bool ? ((Class218) this).aClass186_2306.method2727((long) i)
		: ((Class218) this).aClass186_2305.method2727((long) i)));
	if (interface67 == null) {
	    if (bool)
		interface67 = (Interface67) ((Class218) this).aHashMap2303
						.get(Integer.valueOf(i));
	    else
		interface67 = (Interface67) ((Class218) this).aHashMap2302
						.get(Integer.valueOf(i));
	}
	return interface67;
    }
    
    Interface67 method3099(int i, boolean bool, int i_18_) {
	if (!((Class218) this).aBool2295)
	    return null;
	Interface67 interface67 = method3098(i, bool, (byte) 16);
	if (null == interface67) {
	    Class223 class223 = new Class223(this);
	    interface67
		= Class651.method7749((bool ? Class528_Sub20.aClass446_10405
				       : Class475.aClass446_5430),
				      i, class223, bool,
				      ((Class218) this).aClass186_2307,
				      (byte) 10);
	    if (bool)
		((Class218) this).aHashMap2303.put(Integer.valueOf(i),
						   interface67);
	    else
		((Class218) this).aHashMap2302.put(Integer.valueOf(i),
						   interface67);
	}
	return interface67;
    }
    
    public void method3100(int i, int i_19_) {
	if (((Class218) this).aBool2295
	    && (!((Class218) this).aBool2317
		|| i != -423237413 * ((Class218) this).anInt2310)) {
	    if (((Class218) this).aBool2317
		&& i != ((Class218) this).anInt2310 * -423237413) {
		Iterator iterator = ((Class218) this).aList2321.iterator();
		while (iterator.hasNext()) {
		    Class469 class469 = (Class469) iterator.next();
		    if (class469.method5749((byte) -8)
			== Class196.aClass196_2193) {
			class469.method5782((byte) 119);
			((Class218) this).aList2301.remove(class469);
			((Class218) this).aBool2317 = false;
			break;
		    }
		}
	    }
	    if (0 != i_19_ && i != -1) {
		if (!((Class218) this).aBool2317
		    && null != ((Class218) this).aClass469_2319)
		    ((Class218) this).aClass469_2319.method5743((byte) 0);
		Class469 class469
		    = method3103(Class196.aClass196_2193, this, i, 0, i_19_,
				 Class188.aClass188_2131
				     .method2758(-1560776500),
				 Class202.aClass202_2211, 0.0F, 0.0F, null, 0,
				 255, true, 2124285797);
		if (class469 != null) {
		    class469.method5741((byte) -125);
		    method3101(class469, 1894590822);
		    ((Class218) this).aBool2317 = true;
		    ((Class218) this).anInt2310 = -527707309 * i;
		}
	    }
	}
    }
    
    public void method3101(Class469 class469, int i) {
	class469.method5787(this, 1556436646);
	((Class218) this).aList2301.add(class469);
    }
    
    boolean method3102(Class422 class422, Class422 class422_20_, float f,
		       int i) {
	Class422 class422_21_ = Class422.method5065(class422_20_, class422);
	if (class422_21_.method5069() >= f)
	    return false;
	return true;
    }
    
    public Class469 method3103
	(Class196 class196, Object object, int i, int i_22_, int i_23_,
	 int i_24_, Class202 class202, float f, float f_25_, Class422 class422,
	 int i_26_, int i_27_, boolean bool, int i_28_) {
	if (!((Class218) this).aBool2295)
	    return null;
	if (null == object)
	    return null;
	i_23_ = Math.max(0, Math.min(i_23_, 255));
	i_27_ = Math.max(0, i_27_);
	if (class202 != Class202.aClass202_2211
	    && !method3102(((Class218) this).aClass422_2309, class422, f_25_,
			   -371728129))
	    return null;
	if (i_27_ <= 0)
	    i_27_ = 255;
	float f_29_ = (float) i_23_ / 255.0F;
	float f_30_ = (float) i_27_ / 255.0F;
	Interface67 interface67 = method3099(i, bool, 412565578);
	Class469 class469 = method3081(interface67, (byte) 0);
	if (class469 == null)
	    return null;
	class469.method5787(object, -329631592);
	class469.method5750(i_24_, 1440350926);
	if (class202 != Class202.aClass202_2211) {
	    class469.method5751(true, -1074311225);
	    class469.method5755(class422, 1979950732);
	    class469.method5757(f, -1383255192);
	    class469.method5776(f_25_, -21646874);
	    if (Class202.aClass202_2212 == class202)
		class469.method5753(((Class218) this).anInterface55_2299,
				    (byte) -26);
	    else if (Class202.aClass202_2214 == class202)
		class469.method5753(((Class218) this).anInterface55_2308,
				    (byte) -64);
	    else if (class202 == Class202.aClass202_2215)
		class469.method5753(((Class218) this).anInterface55_2318,
				    (byte) -65);
	    else if (Class202.aClass202_2213 == class202)
		class469.method5753(((Class218) this).anInterface55_2292,
				    (byte) -31);
	    else
		class469.method5751(false, -1158193430);
	}
	class469.method5767(f_29_, 0, -258110330);
	class469.method5763(i_22_ > 1 || i_22_ < 0,
			    i_22_ > 0 ? i_22_ - 1 : i_22_, -174640465);
	class469.method5764(f_30_, -1897849949);
	class469.method5778(class196, (short) 22868);
	return class469;
    }
    
    public void method3104(Class196 class196, int i, int i_31_, int i_32_,
			   int i_33_, Class202 class202, float f, float f_34_,
			   Class422 class422, int i_35_, int i_36_, int i_37_,
			   int i_38_) {
	if (((Class218) this).aBool2295) {
	    Class469 class469 = method3103(class196, this, i, i_31_, i_32_,
					   i_33_, class202, f, f_34_, class422,
					   i_35_, i_36_, false, 1862066393);
	    if (null != class469) {
		if (i_37_ == 0)
		    class469.method5741((byte) -125);
		else
		    class469.method5759(i_37_, false, 1461657764);
		method3101(class469, 2140176555);
	    }
	}
    }
    
    void method3105() {
	Class201 class201 = new Class201(this);
	Class183 class183 = new Class183(this);
	Class221 class221 = new Class221(this);
	Class208 class208 = new Class208(this);
	Class222 class222 = new Class222(this);
	Class109.method1402(Class191.aClass191_2167.method2788(-2031748319),
			    Class191.aClass191_2165.method2788(-1701372648),
			    0.2F, class201, -2095829154);
	Class109.method1402(Class191.aClass191_2166.method2788(-2016708877),
			    Class191.aClass191_2165.method2788(-2121925611),
			    1.0F, class183, -2065757578);
	Class109.method1402(Class191.aClass191_2168.method2788(-1773804309),
			    Class191.aClass191_2165.method2788(-1834704928),
			    1.0F, class221, -2113665177);
	Class109.method1402(Class191.aClass191_2164.method2788(-2131076359),
			    Class191.aClass191_2165.method2788(-2010339186),
			    0.8F, class208, -2012547048);
	Class109.method1402(Class191.aClass191_2169.method2788(-1998243583),
			    Class191.aClass191_2165.method2788(-2134440371),
			    1.0F, class222, -2065617408);
	Class109.method1402(Class188.aClass188_2131.method2758(-1560776500),
			    Class191.aClass191_2166.method2788(-2131348364),
			    1.0F, null, -2061083889);
	Class109.method1402(Class188.aClass188_2128.method2758(-1560776500),
			    Class191.aClass191_2169.method2788(-2130907484),
			    1.0F, null, -2009713825);
	Class109.method1402(Class188.aClass188_2130.method2758(-1560776500),
			    Class191.aClass191_2167.method2788(-1859783671),
			    1.0F, null, -2114655837);
	Class109.method1402(Class188.aClass188_2137.method2758(-1560776500),
			    Class191.aClass191_2167.method2788(-2031697139),
			    1.0F, null, -2119162145);
	Class109.method1402(Class188.aClass188_2132.method2758(-1560776500),
			    Class191.aClass191_2167.method2788(-1897631068),
			    1.0F, null, -2132179454);
	Class109.method1402(Class188.aClass188_2133.method2758(-1560776500),
			    Class191.aClass191_2167.method2788(-2041326224),
			    1.0F, null, -2108987365);
	Class109.method1402(Class188.aClass188_2129.method2758(-1560776500),
			    Class191.aClass191_2167.method2788(-1886139302),
			    1.0F, null, -2060414942);
	Class109.method1402(Class188.aClass188_2135.method2758(-1560776500),
			    Class191.aClass191_2164.method2788(-2050979259),
			    1.0F, null, -2082526888);
	Class109.method1402(Class188.aClass188_2134.method2758(-1560776500),
			    Class188.aClass188_2135.method2758(-1560776500),
			    1.0F, null, -2146319805);
	Class109.method1402(Class188.aClass188_2136.method2758(-1560776500),
			    Class188.aClass188_2135.method2758(-1560776500),
			    1.0F, null, -1978651623);
	Class537.method6528
	    (Class188.aClass188_2131.method2758(-1560776500), (byte) 0)
	    .method4555(0.75F, -1284989175);
    }
    
    public void method3106(int i, int i_39_) {
	((Class218) this).anInt2315 = 359829173 * i;
    }
    
    public int method3107(int i) {
	return ((Class218) this).anInt2315 * -970559587;
    }
    
    public void method3108(int i, int i_40_, boolean bool, int i_41_,
			   int i_42_, int i_43_, int i_44_, int i_45_,
			   byte i_46_) {
	if (((Class218) this).aBool2295
	    && i != ((Class218) this).anInt2311 * -1461364571) {
	    if (((Class218) this).aBool2317
		&& ((Class218) this).aClass469_2319 != null
		&& i != ((Class218) this).anInt2311 * -1461364571) {
		((Class218) this).aClass469_2319.method5781(-2144387641);
		((Class218) this).aClass469_2319.method5782((byte) 64);
		((Class218) this).aList2301
		    .remove(((Class218) this).aClass469_2319);
	    }
	    Class469 class469 = method3136(-689099029);
	    if (null != class469
		&& (class469.method5752(-1442163193).method415((byte) -94)
		    == i)) {
		((Class218) this).aClass469_2319 = class469;
		((Class218) this).anInt2311
		    = (class469.method5752(63218051).method415((byte) -108)
		       * 2002439981);
	    } else {
		boolean bool_47_ = false;
		if (-1461364571 * ((Class218) this).anInt2311 >= 0) {
		    Iterator iterator = ((Class218) this).aList2301.iterator();
		    while (iterator.hasNext()) {
			Class469 class469_48_ = (Class469) iterator.next();
			if (class469_48_.method5749((byte) -83)
			    == Class196.aClass196_2194) {
			    class469_48_.method5742(2000, 2028031290);
			    bool_47_ = true;
			}
		    }
		}
		((Class218) this).aClass469_2319 = null;
		((Class218) this).anInt2311 = -2002439981;
		Class469 class469_49_ = null;
		if (((Class218) this).aClass469_2313 != null
		    && ((Class218) this).aClass469_2313
			   .method5752(-1156696025) != null
		    && ((Class218) this).aClass469_2313.method5752
			   (-275586426).method415((byte) -62) == i
		    && (((Class218) this).aClass469_2313.method5747((byte) 1)
			== Class473.aClass473_5421)) {
		    class469_49_ = ((Class218) this).aClass469_2313;
		    ((Class218) this).aClass469_2313 = null;
		    ((Class218) this).aBool2314 = false;
		}
		if (null == class469_49_) {
		    if (bool) {
			float f = (float) i_44_;
			float f_50_ = (float) i_45_;
			Class422 class422
			    = new Class422((float) i_42_, 0.0F, (float) i_43_);
			class469_49_
			    = method3103(Class196.aClass196_2194, this, i, 0,
					 bool_47_ ? 0 : i_40_,
					 (i == (-970559587
						* ((Class218) this).anInt2315)
					  ? Class191.aClass191_2168
						.method2788(-2111900362)
					  : Class188.aClass188_2131
						.method2758(-1560776500)),
					 Class202.aClass202_2213, f, f_50_,
					 class422, i_41_, 255, true,
					 1250596297);
		    } else
			class469_49_
			    = method3103(Class196.aClass196_2194, this, i, 0,
					 bool_47_ ? 0 : i_40_,
					 ((((Class218) this).anInt2315
					   * -970559587) == i
					  ? Class191.aClass191_2168
						.method2788(-2083850894)
					  : Class188.aClass188_2131
						.method2758(-1560776500)),
					 Class202.aClass202_2211, 0.0F, 0.0F,
					 null, 0, 255, true, 1697859951);
		}
		if (null != class469_49_) {
		    if (bool_47_) {
			float f = (float) i_40_ / 255.0F;
			class469_49_.method5767(f, 2000, -1035922286);
		    }
		    class469_49_.method5741((byte) -125);
		    method3101(class469_49_, 1234716300);
		    ((Class218) this).aClass469_2319 = class469_49_;
		    ((Class218) this).anInt2311 = i * 2002439981;
		    if (((Class218) this).aBool2317)
			((Class218) this).aClass469_2319.method5743((byte) 0);
		    if (client.aClass109_10930.aClass10_1379 != null
			&& Class622.method7419(client.anInt10876 * 175711435,
					       (byte) -56)) {
			Class528_Sub34 class528_sub34
			    = Class656.method7845(OutgoingOpcode.aClass403_4540,
						  (client.aClass109_10930
						   .aClass10_1379),
						  -1899953134);
			class528_sub34.aClass528_Sub42_Sub2_10481.writeInt
			    (-1461364571 * ((Class218) this).anInt2311,
			     2073811861);
			client.aClass109_10930.method1380(class528_sub34,
							  1221397837);
		    }
		}
	    }
	}
    }
    
    public void method3109(int i, int i_51_, byte i_52_) {
	method3108(i, i_51_, false, 0, 0, 0, 0, 0, (byte) -69);
    }
    
    public void method3110(int i) {
	if (((Class218) this).aBool2295 && i >= 0)
	    method3099(i, false, 907919058);
    }
    
    public void method3111(int i) {
	Iterator iterator = ((Class218) this).aList2301.iterator();
	while (iterator.hasNext()) {
	    Class469 class469 = (Class469) iterator.next();
	    if (class469.method5749((byte) -43) == Class196.aClass196_2194) {
		class469.method5742(500, 1998829434);
		if (class469.method5752(-1530961662).method415((byte) 1)
		    == ((Class218) this).anInt2311 * -1461364571) {
		    method3119(((Class218) this).anInt2311 * -1461364571,
			       717023181);
		    break;
		}
	    }
	}
	((Class218) this).aClass469_2319 = null;
	((Class218) this).anInt2311 = -2002439981;
    }
    
    public void method3112(Class190 class190, int i,
			   Class645_Sub1 class645_sub1, int i_53_) {
	if (class190 != null && null != class190.anIntArrayArray2157
	    && i < class190.anIntArrayArray2157.length
	    && class190.anIntArrayArray2157[i] != null
	    && (class645_sub1.aByte10675
		== Class108.myPlayer.aByte10675)
	    && class645_sub1.method9770((byte) -63)) {
	    int i_54_ = class190.anIntArrayArray2157[i][0];
	    int i_55_ = i_54_ >> 8;
	    int i_56_ = i_54_ >> 5 & 0x7;
	    int i_57_ = i_54_ & 0x1f;
	    if (class190.anIntArrayArray2157[i].length > 1) {
		int i_58_ = (int) (Math.random()
				   * (double) (class190.anIntArrayArray2157
					       [i]).length);
		if (i_58_ > 0)
		    i_55_ = class190.anIntArrayArray2157[i][i_58_];
	    }
	    int i_59_ = 256;
	    if (class190.anIntArray2160 != null
		&& null != class190.anIntArray2149)
		i_59_ = ((int) (Math.random()
				* (double) (class190.anIntArray2149[i]
					    - class190.anIntArray2160[i]))
			 + class190.anIntArray2160[i]);
	    int i_60_ = (class190.anIntArray2159 == null ? 255
			 : class190.anIntArray2159[i]);
	    if (i_57_ == 0) {
		if (class645_sub1
		    == Class108.myPlayer)
		    method3104(Class196.aClass196_2189, i_55_, i_56_, i_60_,
			       Class188.aClass188_2137.method2758(-1560776500),
			       Class202.aClass202_2211, 0.0F, 0.0F, null,
			       class645_sub1.aByte10675, i_59_, 0, 1102877142);
	    } else {
		if (Class108.myPlayer
		    == class645_sub1) {
		    if (Class514.aClass528_Sub38_6967.aClass691_Sub34_10591
			    .method10132((byte) 6)
			== 0)
			return;
		} else if (Class514.aClass528_Sub38_6967
			       .aClass691_Sub34_10604.method10132((byte) 63)
			   == 0)
		    return;
		if (-1 != -1676000301 * class190.anInt2148) {
		    int i_61_ = 0;
		    if (class645_sub1 instanceof Entity)
			i_61_ = ((Entity) class645_sub1)
				    .method10687(1600226731);
		    else if (class645_sub1 instanceof Class645_Sub1_Sub5_Sub4)
			i_61_ = ((Class645_Sub1_Sub5_Sub4) class645_sub1)
				    .method10845(-1918712915);
		    else if (class645_sub1 instanceof Class645_Sub1_Sub5_Sub6)
			i_61_ = ((Class645_Sub1_Sub5_Sub6) class645_sub1)
				    .method10878((byte) 27);
		    if (i_61_ != 0
			&& i_61_ != Class108
					.myPlayer
					.method10687(1600226731)
			&& i_61_ != 712301817 * client.anInt10872) {
			i_60_
			    = i_60_ * (-1676000301 * class190.anInt2148) / 100;
			if (i_60_ < 0)
			    i_60_ = 0;
			else if (i_60_ > 255)
			    i_60_ = 255;
		    }
		}
		Class422 class422 = class645_sub1.method7693().aClass422_4868;
		int i_62_ = (int) class422.aFloat4780 - 256 >> 9;
		int i_63_ = (int) class422.aFloat4777 - 256 >> 9;
		Class422 class422_64_
		    = new Class422((float) (i_62_ << 9), 0.0F,
				   (float) (i_63_ << 9));
		int i_65_ = class645_sub1.aByte10675 << 24;
		method3104(Class196.aClass196_2184, i_55_, i_56_, i_60_,
			   Class188.aClass188_2132.method2758(-1560776500),
			   ((Class108.myPlayer
			     != class645_sub1)
			    ? Class202.aClass202_2215
			    : Class202.aClass202_2211),
			   0.0F, (float) (i_57_ << 9), class422_64_, i_65_,
			   i_59_, 0, 1356737921);
	    }
	}
    }
    
    public void method3113(Class469 class469, int i, int i_66_, int i_67_) {
	if (null != class469) {
	    Class220 class220
		= ((Class220)
		   ((Class218) this).aHashMap2296.get(Integer.valueOf(i)));
	    if (class220 == null) {
		class220 = new Class220(this);
		((Class218) this).aHashMap2296.put(Integer.valueOf(i),
						   class220);
	    }
	    if (!class220.method3149(class469, (byte) 88)) {
		class469.method5759(i_66_, true, 511793107);
		class220.method3148(class469, 88964119);
	    }
	}
    }
    
    List method3114(byte i) {
	return ((Class218) this).aList2301;
    }
    
    public void method3115(int i, int i_68_, int i_69_) {
	if (i != ((Class218) this).anInt2311 * -1461364571) {
	    if (((Class218) this).aClass469_2313 != null) {
		((Class218) this).aClass469_2313.method5742(0, 2019794157);
		method3101(((Class218) this).aClass469_2313, 1742569386);
		((Class218) this).aClass469_2313 = null;
	    }
	    Class469 class469
		= method3103(Class196.aClass196_2194, this, i, 0, i_68_,
			     Class188.aClass188_2131.method2758(-1560776500),
			     Class202.aClass202_2211, 0.0F, 0.0F, null, 0, 255,
			     true, 1918752755);
	    if (null != class469) {
		class469.method5740((byte) -81);
		((Class218) this).aClass469_2313 = class469;
	    }
	    ((Class218) this).aBool2314 = false;
	}
    }
    
    public void method3116() {
	if (((Class218) this).aBool2295) {
	    if (Class641.aClass364_8273 != null)
		Class641.aClass364_8273.method4606(-801078573);
	    if (null != Class108.myPlayer
		&& (Class108.myPlayer.method7693()
		    != null)) {
		if (((Class218) this).aClass422_2309 == null)
		    ((Class218) this).aClass422_2309 = new Class422();
		((Class218) this).aClass422_2309.aFloat4780
		    = (Class108.myPlayer.method7693()
		       .aClass422_4868.aFloat4780);
		((Class218) this).aClass422_2309.aFloat4776 = 0.0F;
		((Class218) this).aClass422_2309.aFloat4777
		    = (Class108.myPlayer.method7693()
		       .aClass422_4868.aFloat4777);
	    }
	    Iterator iterator
		= ((Class218) this).aHashMap2302.values().iterator();
	    while (iterator.hasNext()) {
		Interface67 interface67 = (Interface67) iterator.next();
		interface67.method309(1991502885);
	    }
	    iterator = ((Class218) this).aHashMap2303.values().iterator();
	    while (iterator.hasNext()) {
		Interface67 interface67 = (Interface67) iterator.next();
		interface67.method309(1991502885);
	    }
	    iterator = ((Class218) this).aList2297.iterator();
	    while (iterator.hasNext()) {
		Interface67 interface67 = (Interface67) iterator.next();
		if (interface67.method411(865860517))
		    ((Class218) this).aHashMap2303.remove
			(Integer.valueOf(interface67.method415((byte) -8)));
		else
		    ((Class218) this).aHashMap2302.remove
			(Integer.valueOf(interface67.method415((byte) -13)));
	    }
	    ((Class218) this).aList2297.clear();
	    if (((Class218) this).aClass469_2313 != null
		&& (((Class218) this).aClass469_2313.method5747((byte) 1)
		    == Class473.aClass473_5421)
		&& false == ((Class218) this).aBool2314
		&& client.aClass109_10930.aClass10_1379 != null
		&& Class622.method7419(client.anInt10876 * 175711435,
				       (byte) -77)) {
		Class528_Sub34 class528_sub34
		    = Class656.method7845(OutgoingOpcode.aClass403_4540,
					  client.aClass109_10930.aClass10_1379,
					  -2096158358);
		class528_sub34.aClass528_Sub42_Sub2_10481.writeInt
		    (((Class218) this).aClass469_2313.method5752(134828403)
			 .method415((byte) -4),
		     2049550150);
		client.aClass109_10930.method1380(class528_sub34, 1011650218);
		((Class218) this).aBool2314 = true;
	    }
	    iterator = ((Class218) this).aList2321.iterator();
	    while (iterator.hasNext()) {
		Class469 class469 = (Class469) iterator.next();
		class469.method5761(-1771635587);
		class469.method5746(1929634418);
		Class473 class473 = class469.method5747((byte) 1);
		if (class469.method5748(1864301681) == this) {
		    if (class473 == Class473.aClass473_5422
			|| class473 == Class473.aClass473_5423) {
			if ((class469.method5749((byte) -54)
			     == Class196.aClass196_2194)
			    || (class469.method5749((byte) -47)
				== Class196.aClass196_2193)) {
			    if (class469 == ((Class218) this).aClass469_2313) {
				((Class218) this).aBool2314 = false;
				((Class218) this).aClass469_2313 = null;
				class469.method5782((byte) 107);
				((Class218) this).aList2301.remove(class469);
			    } else {
				int i = class469.method5752(-1357955389)
					    .method415((byte) -113);
				boolean bool
				    = (method3094(Class188.aClass188_2131
						      .method2758(-1560776500),
						  (byte) -12)
				       > 0.0F);
				if (!((Class218) this).aBool2317 && bool) {
				    if ((-1461364571
					 * ((Class218) this).anInt2311)
					== i) {
					method3119(i, 1822678603);
					((Class218) this).anInt2311
					    = -2002439981;
				    }
				    class469.method5782((byte) 42);
				    ((Class218) this).aList2301
					.remove(class469);
				} else if (i == (((Class218) this).anInt2310
						 * -423237413)) {
				    ((Class218) this).anInt2310 = 527707309;
				    ((Class218) this).aBool2317 = false;
				    class469.method5782((byte) 92);
				    ((Class218) this).aList2301
					.remove(class469);
				    Iterator iterator_70_
					= ((Class218) this).aList2321
					      .iterator();
				    while (iterator_70_.hasNext()) {
					Class469 class469_71_
					    = (Class469) iterator_70_.next();
					if (class469_71_.method5749((byte) -62)
					    == Class196.aClass196_2194) {
					    int i_72_
						= class469_71_.method5752
						      (-1741717764)
						      .method415((byte) -90);
					    if ((i_72_ == (-1461364571
							   * (((Class218) this)
							      .anInt2311))
						 && (class469_71_
							 .method5747((byte) 1)
						     == (Class473
							 .aClass473_5422)))
						|| (class469_71_
							.method5747((byte) 1)
						    == Class473.aClass473_5417)
						|| (class469_71_
							.method5747((byte) 1)
						    == Class473.aClass473_5418)
						|| (class469_71_
							.method5747((byte) 1)
						    == (Class473
							.aClass473_5421))) {
						if (class469_71_
							.method5747((byte) 1)
						    == Class473.aClass473_5422)
						    class469_71_.method5781
							(-2144512445);
						else
						    class469_71_.method5741
							((byte) -125);
						break;
					    }
					}
				    }
				} else if (bool) {
				    if (!((Class218) this).aBool2317
					|| i != (((Class218) this).anInt2311
						 * -1461364571)) {
					class469.method5782((byte) 110);
					((Class218) this).aList2301
					    .remove(class469);
				    }
				    if (!((Class218) this).aBool2317
					&& -1461364571 * (((Class218) this)
							  .anInt2311) == i) {
					((Class218) this).anInt2311
					    = -2002439981;
					((Class218) this).aClass469_2319
					    = null;
				    }
				}
			    }
			} else {
			    Iterator iterator_73_
				= ((Class218) this).aHashMap2296.keySet()
				      .iterator();
			    while (iterator_73_.hasNext()) {
				int i = ((Integer) iterator_73_.next())
					    .intValue();
				Class220 class220
				    = (Class220) ((Class218) this)
						     .aHashMap2296
						     .get(Integer.valueOf(i));
				if (class220.method3147((short) -4760)
					.contains(class469)) {
				    class220.method3146(class469, -1742065927);
				    break;
				}
			    }
			    class469.method5782((byte) 43);
			    ((Class218) this).aList2301.remove(class469);
			}
		    } else if ((class469.method5747((byte) 1)
				!= Class473.aClass473_5416)
			       && (class469.method5788((byte) 8)
				   == Class188.aClass188_2131
					  .method2758(-1560776500))) {
			boolean bool = method3094(Class188.aClass188_2131
						      .method2758(-1560776500),
						  (byte) 23) > 1.0E-4F;
			if (!bool)
			    class469.method5742(150, 2089575906);
		    }
		}
	    }
	}
    }
    
    public void method3117() {
	if (((Class218) this).aBool2295) {
	    if (Class641.aClass364_8273 != null)
		Class641.aClass364_8273.method4606(1176872741);
	    if (null != Class108.myPlayer
		&& (Class108.myPlayer.method7693()
		    != null)) {
		if (((Class218) this).aClass422_2309 == null)
		    ((Class218) this).aClass422_2309 = new Class422();
		((Class218) this).aClass422_2309.aFloat4780
		    = (Class108.myPlayer.method7693()
		       .aClass422_4868.aFloat4780);
		((Class218) this).aClass422_2309.aFloat4776 = 0.0F;
		((Class218) this).aClass422_2309.aFloat4777
		    = (Class108.myPlayer.method7693()
		       .aClass422_4868.aFloat4777);
	    }
	    Iterator iterator
		= ((Class218) this).aHashMap2302.values().iterator();
	    while (iterator.hasNext()) {
		Interface67 interface67 = (Interface67) iterator.next();
		interface67.method309(1991502885);
	    }
	    iterator = ((Class218) this).aHashMap2303.values().iterator();
	    while (iterator.hasNext()) {
		Interface67 interface67 = (Interface67) iterator.next();
		interface67.method309(1991502885);
	    }
	    iterator = ((Class218) this).aList2297.iterator();
	    while (iterator.hasNext()) {
		Interface67 interface67 = (Interface67) iterator.next();
		if (interface67.method411(865860517))
		    ((Class218) this).aHashMap2303.remove
			(Integer.valueOf(interface67.method415((byte) -28)));
		else
		    ((Class218) this).aHashMap2302.remove
			(Integer.valueOf(interface67.method415((byte) -54)));
	    }
	    ((Class218) this).aList2297.clear();
	    if (((Class218) this).aClass469_2313 != null
		&& (((Class218) this).aClass469_2313.method5747((byte) 1)
		    == Class473.aClass473_5421)
		&& false == ((Class218) this).aBool2314
		&& client.aClass109_10930.aClass10_1379 != null
		&& Class622.method7419(client.anInt10876 * 175711435,
				       (byte) -90)) {
		Class528_Sub34 class528_sub34
		    = Class656.method7845(OutgoingOpcode.aClass403_4540,
					  client.aClass109_10930.aClass10_1379,
					  -2043082031);
		class528_sub34.aClass528_Sub42_Sub2_10481.writeInt
		    (((Class218) this).aClass469_2313.method5752
			 (-1920402259).method415((byte) -90),
		     2114628279);
		client.aClass109_10930.method1380(class528_sub34, 370361200);
		((Class218) this).aBool2314 = true;
	    }
	    iterator = ((Class218) this).aList2321.iterator();
	    while (iterator.hasNext()) {
		Class469 class469 = (Class469) iterator.next();
		class469.method5761(1475116265);
		class469.method5746(1929634418);
		Class473 class473 = class469.method5747((byte) 1);
		if (class469.method5748(1864301681) == this) {
		    if (class473 == Class473.aClass473_5422
			|| class473 == Class473.aClass473_5423) {
			if ((class469.method5749((byte) 6)
			     == Class196.aClass196_2194)
			    || (class469.method5749((byte) -4)
				== Class196.aClass196_2193)) {
			    if (class469 == ((Class218) this).aClass469_2313) {
				((Class218) this).aBool2314 = false;
				((Class218) this).aClass469_2313 = null;
				class469.method5782((byte) 55);
				((Class218) this).aList2301.remove(class469);
			    } else {
				int i = class469.method5752(-81603975)
					    .method415((byte) -113);
				boolean bool
				    = (method3094(Class188.aClass188_2131
						      .method2758(-1560776500),
						  (byte) 17)
				       > 0.0F);
				if (!((Class218) this).aBool2317 && bool) {
				    if ((-1461364571
					 * ((Class218) this).anInt2311)
					== i) {
					method3119(i, -1270707455);
					((Class218) this).anInt2311
					    = -2002439981;
				    }
				    class469.method5782((byte) 58);
				    ((Class218) this).aList2301
					.remove(class469);
				} else if (i == (((Class218) this).anInt2310
						 * -423237413)) {
				    ((Class218) this).anInt2310 = 527707309;
				    ((Class218) this).aBool2317 = false;
				    class469.method5782((byte) 109);
				    ((Class218) this).aList2301
					.remove(class469);
				    Iterator iterator_74_
					= ((Class218) this).aList2321
					      .iterator();
				    while (iterator_74_.hasNext()) {
					Class469 class469_75_
					    = (Class469) iterator_74_.next();
					if (class469_75_.method5749((byte) -47)
					    == Class196.aClass196_2194) {
					    int i_76_
						= class469_75_.method5752
						      (-1942842846)
						      .method415((byte) -78);
					    if ((i_76_ == (-1461364571
							   * (((Class218) this)
							      .anInt2311))
						 && (class469_75_
							 .method5747((byte) 1)
						     == (Class473
							 .aClass473_5422)))
						|| (class469_75_
							.method5747((byte) 1)
						    == Class473.aClass473_5417)
						|| (class469_75_
							.method5747((byte) 1)
						    == Class473.aClass473_5418)
						|| (class469_75_
							.method5747((byte) 1)
						    == (Class473
							.aClass473_5421))) {
						if (class469_75_
							.method5747((byte) 1)
						    == Class473.aClass473_5422)
						    class469_75_.method5781
							(-2147419446);
						else
						    class469_75_.method5741
							((byte) -125);
						break;
					    }
					}
				    }
				} else if (bool) {
				    if (!((Class218) this).aBool2317
					|| i != (((Class218) this).anInt2311
						 * -1461364571)) {
					class469.method5782((byte) 42);
					((Class218) this).aList2301
					    .remove(class469);
				    }
				    if (!((Class218) this).aBool2317
					&& -1461364571 * (((Class218) this)
							  .anInt2311) == i) {
					((Class218) this).anInt2311
					    = -2002439981;
					((Class218) this).aClass469_2319
					    = null;
				    }
				}
			    }
			} else {
			    Iterator iterator_77_
				= ((Class218) this).aHashMap2296.keySet()
				      .iterator();
			    while (iterator_77_.hasNext()) {
				int i = ((Integer) iterator_77_.next())
					    .intValue();
				Class220 class220
				    = (Class220) ((Class218) this)
						     .aHashMap2296
						     .get(Integer.valueOf(i));
				if (class220.method3147((short) -23689)
					.contains(class469)) {
				    class220.method3146(class469, -1298578308);
				    break;
				}
			    }
			    class469.method5782((byte) 30);
			    ((Class218) this).aList2301.remove(class469);
			}
		    } else if ((class469.method5747((byte) 1)
				!= Class473.aClass473_5416)
			       && (class469.method5788((byte) 8)
				   == Class188.aClass188_2131
					  .method2758(-1560776500))) {
			boolean bool = method3094(Class188.aClass188_2131
						      .method2758(-1560776500),
						  (byte) 81) > 1.0E-4F;
			if (!bool)
			    class469.method5742(150, 2069092868);
		    }
		}
	    }
	}
    }
    
    public void method3118() {
	Iterator iterator = ((Class218) this).aList2301.iterator();
	while (iterator.hasNext()) {
	    Class469 class469 = (Class469) iterator.next();
	    if (class469.method5749((byte) -32) == Class196.aClass196_2194) {
		class469.method5742(500, 2133238472);
		if (class469.method5752(-119278857).method415((byte) -25)
		    == ((Class218) this).anInt2311 * -1461364571) {
		    method3119(((Class218) this).anInt2311 * -1461364571,
			       -1426947333);
		    break;
		}
	    }
	}
	((Class218) this).aClass469_2319 = null;
	((Class218) this).anInt2311 = -2002439981;
    }
    
    void method3119(int i, int i_78_) {
	if (client.aClass109_10930.aClass10_1379 != null
	    && Class622.method7419(175711435 * client.anInt10876,
				   (byte) -14)) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4513,
				      client.aClass109_10930.aClass10_1379,
				      -1895009192);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeInt(i,
								 2071702387);
	    client.aClass109_10930.method1380(class528_sub34, 1442770569);
	}
    }
    
    public void method3120() {
	Class466.method5645(717927929);
    }
    
    public void method3121(int i) {
	Class220 class220
	    = ((Class220)
	       ((Class218) this).aHashMap2296.get(Integer.valueOf(i)));
	if (class220 != null) {
	    List list = class220.method3147((short) -711);
	    Iterator iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class469 class469 = (Class469) iterator.next();
		if (!class469.method5737(519328808))
		    class469.method5741((byte) -125);
	    }
	}
    }
    
    public void method3122(int i, int i_79_) {
	method3109(i, 255, (byte) 28);
    }
    
    void method3123() {
	Class201 class201 = new Class201(this);
	Class183 class183 = new Class183(this);
	Class221 class221 = new Class221(this);
	Class208 class208 = new Class208(this);
	Class222 class222 = new Class222(this);
	Class109.method1402(Class191.aClass191_2167.method2788(-2115182289),
			    Class191.aClass191_2165.method2788(-1712933184),
			    0.2F, class201, -2037932612);
	Class109.method1402(Class191.aClass191_2166.method2788(-1750210727),
			    Class191.aClass191_2165.method2788(-1709688986),
			    1.0F, class183, -2145179787);
	Class109.method1402(Class191.aClass191_2168.method2788(-1704555094),
			    Class191.aClass191_2165.method2788(-2044421072),
			    1.0F, class221, -1998587580);
	Class109.method1402(Class191.aClass191_2164.method2788(-1749093848),
			    Class191.aClass191_2165.method2788(-1944350978),
			    0.8F, class208, -2096081173);
	Class109.method1402(Class191.aClass191_2169.method2788(-1838142581),
			    Class191.aClass191_2165.method2788(-1904468366),
			    1.0F, class222, -2087908345);
	Class109.method1402(Class188.aClass188_2131.method2758(-1560776500),
			    Class191.aClass191_2166.method2788(-1826028874),
			    1.0F, null, -2142742394);
	Class109.method1402(Class188.aClass188_2128.method2758(-1560776500),
			    Class191.aClass191_2169.method2788(-1922123923),
			    1.0F, null, -1990700261);
	Class109.method1402(Class188.aClass188_2130.method2758(-1560776500),
			    Class191.aClass191_2167.method2788(-1970434982),
			    1.0F, null, -2098344291);
	Class109.method1402(Class188.aClass188_2137.method2758(-1560776500),
			    Class191.aClass191_2167.method2788(-1733148630),
			    1.0F, null, -2109039017);
	Class109.method1402(Class188.aClass188_2132.method2758(-1560776500),
			    Class191.aClass191_2167.method2788(-2006348858),
			    1.0F, null, -2083288081);
	Class109.method1402(Class188.aClass188_2133.method2758(-1560776500),
			    Class191.aClass191_2167.method2788(-2079454468),
			    1.0F, null, -2087891938);
	Class109.method1402(Class188.aClass188_2129.method2758(-1560776500),
			    Class191.aClass191_2167.method2788(-2077921819),
			    1.0F, null, -2074225796);
	Class109.method1402(Class188.aClass188_2135.method2758(-1560776500),
			    Class191.aClass191_2164.method2788(-1865472094),
			    1.0F, null, -2044875264);
	Class109.method1402(Class188.aClass188_2134.method2758(-1560776500),
			    Class188.aClass188_2135.method2758(-1560776500),
			    1.0F, null, -2056828611);
	Class109.method1402(Class188.aClass188_2136.method2758(-1560776500),
			    Class188.aClass188_2135.method2758(-1560776500),
			    1.0F, null, -2066556517);
	Class537.method6528
	    (Class188.aClass188_2131.method2758(-1560776500), (byte) 0)
	    .method4555(0.75F, -1284989175);
    }
    
    public void method3124(Class190 class190, int i, int i_80_) {
	if (class190 != null && class190.anIntArrayArray2157 != null
	    && i < class190.anIntArrayArray2157.length
	    && class190.anIntArrayArray2157[i] != null) {
	    int i_81_ = class190.anIntArrayArray2157[i][0];
	    int i_82_ = i_81_ >> 8;
	    int i_83_ = i_81_ >> 5 & 0x7;
	    if (class190.anIntArrayArray2157[i].length > 1) {
		int i_84_ = (int) (Math.random()
				   * (double) (class190.anIntArrayArray2157
					       [i]).length);
		if (i_84_ > 0)
		    i_82_ = class190.anIntArrayArray2157[i][i_84_];
	    }
	    int i_85_ = 256;
	    if (null != class190.anIntArray2160
		&& null != class190.anIntArray2149)
		i_85_ = (int) ((double) class190.anIntArray2160[i]
			       + (Math.random()
				  * (double) (class190.anIntArray2149[i]
					      - class190.anIntArray2160[i])));
	    int i_86_ = (class190.anIntArray2159 == null ? 255
			 : class190.anIntArray2159[i]);
	    method3104(Class196.aClass196_2195, i_82_, i_83_, i_86_,
		       Class188.aClass188_2132.method2758(-1560776500),
		       Class202.aClass202_2211, 0.0F, 0.0F, null, 0, i_85_, 0,
		       -1216903882);
	}
    }
    
    public void method3125(int i) {
	if (((Class218) this).aBool2295) {
	    if (Class641.aClass364_8273 != null)
		Class641.aClass364_8273.method4606(-27330934);
	    if (null != Class108.myPlayer
		&& (Class108.myPlayer.method7693()
		    != null)) {
		if (((Class218) this).aClass422_2309 == null)
		    ((Class218) this).aClass422_2309 = new Class422();
		((Class218) this).aClass422_2309.aFloat4780
		    = (Class108.myPlayer.method7693()
		       .aClass422_4868.aFloat4780);
		((Class218) this).aClass422_2309.aFloat4776 = 0.0F;
		((Class218) this).aClass422_2309.aFloat4777
		    = (Class108.myPlayer.method7693()
		       .aClass422_4868.aFloat4777);
	    }
	    Iterator iterator
		= ((Class218) this).aHashMap2302.values().iterator();
	    while (iterator.hasNext()) {
		Interface67 interface67 = (Interface67) iterator.next();
		interface67.method309(1991502885);
	    }
	    iterator = ((Class218) this).aHashMap2303.values().iterator();
	    while (iterator.hasNext()) {
		Interface67 interface67 = (Interface67) iterator.next();
		interface67.method309(1991502885);
	    }
	    iterator = ((Class218) this).aList2297.iterator();
	    while (iterator.hasNext()) {
		Interface67 interface67 = (Interface67) iterator.next();
		if (interface67.method411(865860517))
		    ((Class218) this).aHashMap2303.remove
			(Integer.valueOf(interface67.method415((byte) -39)));
		else
		    ((Class218) this).aHashMap2302.remove
			(Integer.valueOf(interface67.method415((byte) -26)));
	    }
	    ((Class218) this).aList2297.clear();
	    if (((Class218) this).aClass469_2313 != null
		&& (((Class218) this).aClass469_2313.method5747((byte) 1)
		    == Class473.aClass473_5421)
		&& false == ((Class218) this).aBool2314
		&& client.aClass109_10930.aClass10_1379 != null
		&& Class622.method7419(client.anInt10876 * 175711435,
				       (byte) -37)) {
		Class528_Sub34 class528_sub34
		    = Class656.method7845(OutgoingOpcode.aClass403_4540,
					  client.aClass109_10930.aClass10_1379,
					  -2009644292);
		class528_sub34.aClass528_Sub42_Sub2_10481.writeInt
		    (((Class218) this).aClass469_2313.method5752
			 (-284216163).method415((byte) -55),
		     2018978706);
		client.aClass109_10930.method1380(class528_sub34, 702904916);
		((Class218) this).aBool2314 = true;
	    }
	    iterator = ((Class218) this).aList2321.iterator();
	    while (iterator.hasNext()) {
		Class469 class469 = (Class469) iterator.next();
		class469.method5761(-1150564602);
		class469.method5746(1929634418);
		Class473 class473 = class469.method5747((byte) 1);
		if (class469.method5748(1864301681) == this) {
		    if (class473 == Class473.aClass473_5422
			|| class473 == Class473.aClass473_5423) {
			if ((class469.method5749((byte) -122)
			     == Class196.aClass196_2194)
			    || (class469.method5749((byte) -55)
				== Class196.aClass196_2193)) {
			    if (class469 == ((Class218) this).aClass469_2313) {
				((Class218) this).aBool2314 = false;
				((Class218) this).aClass469_2313 = null;
				class469.method5782((byte) 52);
				((Class218) this).aList2301.remove(class469);
			    } else {
				int i_87_ = class469.method5752
						(-1437278889)
						.method415((byte) -105);
				boolean bool
				    = (method3094(Class188.aClass188_2131
						      .method2758(-1560776500),
						  (byte) -21)
				       > 0.0F);
				if (!((Class218) this).aBool2317 && bool) {
				    if ((-1461364571
					 * ((Class218) this).anInt2311)
					== i_87_) {
					method3119(i_87_, 988165123);
					((Class218) this).anInt2311
					    = -2002439981;
				    }
				    class469.method5782((byte) 65);
				    ((Class218) this).aList2301
					.remove(class469);
				} else if (i_87_
					   == (((Class218) this).anInt2310
					       * -423237413)) {
				    ((Class218) this).anInt2310 = 527707309;
				    ((Class218) this).aBool2317 = false;
				    class469.method5782((byte) 89);
				    ((Class218) this).aList2301
					.remove(class469);
				    Iterator iterator_88_
					= ((Class218) this).aList2321
					      .iterator();
				    while (iterator_88_.hasNext()) {
					Class469 class469_89_
					    = (Class469) iterator_88_.next();
					if (class469_89_.method5749((byte) -19)
					    == Class196.aClass196_2194) {
					    int i_90_
						= class469_89_.method5752
						      (253161309)
						      .method415((byte) -122);
					    if ((i_90_ == (-1461364571
							   * (((Class218) this)
							      .anInt2311))
						 && (class469_89_
							 .method5747((byte) 1)
						     == (Class473
							 .aClass473_5422)))
						|| (class469_89_
							.method5747((byte) 1)
						    == Class473.aClass473_5417)
						|| (class469_89_
							.method5747((byte) 1)
						    == Class473.aClass473_5418)
						|| (class469_89_
							.method5747((byte) 1)
						    == (Class473
							.aClass473_5421))) {
						if (class469_89_
							.method5747((byte) 1)
						    == Class473.aClass473_5422)
						    class469_89_.method5781
							(-2142316681);
						else
						    class469_89_.method5741
							((byte) -125);
						break;
					    }
					}
				    }
				} else if (bool) {
				    if (!((Class218) this).aBool2317
					|| (i_87_
					    != (((Class218) this).anInt2311
						* -1461364571))) {
					class469.method5782((byte) 99);
					((Class218) this).aList2301
					    .remove(class469);
				    }
				    if (!((Class218) this).aBool2317
					&& ((-1461364571
					     * ((Class218) this).anInt2311)
					    == i_87_)) {
					((Class218) this).anInt2311
					    = -2002439981;
					((Class218) this).aClass469_2319
					    = null;
				    }
				}
			    }
			} else {
			    Iterator iterator_91_
				= ((Class218) this).aHashMap2296.keySet()
				      .iterator();
			    while (iterator_91_.hasNext()) {
				int i_92_ = ((Integer) iterator_91_.next())
						.intValue();
				Class220 class220
				    = ((Class220)
				       ((Class218) this).aHashMap2296
					   .get(Integer.valueOf(i_92_)));
				if (class220.method3147((short) -14133)
					.contains(class469)) {
				    class220.method3146(class469, -1410686863);
				    break;
				}
			    }
			    class469.method5782((byte) 125);
			    ((Class218) this).aList2301.remove(class469);
			}
		    } else if ((class469.method5747((byte) 1)
				!= Class473.aClass473_5416)
			       && (class469.method5788((byte) 8)
				   == Class188.aClass188_2131
					  .method2758(-1560776500))) {
			boolean bool = method3094(Class188.aClass188_2131
						      .method2758(-1560776500),
						  (byte) -91) > 1.0E-4F;
			if (!bool)
			    class469.method5742(150, 2085376853);
		    }
		}
	    }
	}
    }
    
    public void method3126(int i, int i_93_, int i_94_) {
	if (((Class218) this).aBool2295
	    && (!((Class218) this).aBool2317
		|| i != -423237413 * ((Class218) this).anInt2310)) {
	    if (((Class218) this).aBool2317
		&& i != ((Class218) this).anInt2310 * -423237413) {
		Iterator iterator = ((Class218) this).aList2321.iterator();
		while (iterator.hasNext()) {
		    Class469 class469 = (Class469) iterator.next();
		    if (class469.method5749((byte) -53)
			== Class196.aClass196_2193) {
			class469.method5782((byte) 72);
			((Class218) this).aList2301.remove(class469);
			((Class218) this).aBool2317 = false;
			break;
		    }
		}
	    }
	    if (0 != i_93_ && i != -1) {
		if (!((Class218) this).aBool2317
		    && null != ((Class218) this).aClass469_2319)
		    ((Class218) this).aClass469_2319.method5743((byte) 0);
		Class469 class469
		    = method3103(Class196.aClass196_2193, this, i, 0, i_93_,
				 Class188.aClass188_2131
				     .method2758(-1560776500),
				 Class202.aClass202_2211, 0.0F, 0.0F, null, 0,
				 255, true, 1719566027);
		if (class469 != null) {
		    class469.method5741((byte) -125);
		    method3101(class469, 2106102922);
		    ((Class218) this).aBool2317 = true;
		    ((Class218) this).anInt2310 = -527707309 * i;
		}
	    }
	}
    }
    
    public void method3127(int i, int i_95_, int i_96_) {
	Class351 class351 = Class537.method6528(i, (byte) 0);
	if (class351 != null) {
	    float f = (float) i_95_ * 1.5258789E-5F;
	    class351.method4555(f, -1284989175);
	}
    }
    
    public void method3128() {
	if (((Class218) this).aBool2295) {
	    if (Class641.aClass364_8273 != null)
		Class641.aClass364_8273.method4606(-541823629);
	    if (null != Class108.myPlayer
		&& (Class108.myPlayer.method7693()
		    != null)) {
		if (((Class218) this).aClass422_2309 == null)
		    ((Class218) this).aClass422_2309 = new Class422();
		((Class218) this).aClass422_2309.aFloat4780
		    = (Class108.myPlayer.method7693()
		       .aClass422_4868.aFloat4780);
		((Class218) this).aClass422_2309.aFloat4776 = 0.0F;
		((Class218) this).aClass422_2309.aFloat4777
		    = (Class108.myPlayer.method7693()
		       .aClass422_4868.aFloat4777);
	    }
	    Iterator iterator
		= ((Class218) this).aHashMap2302.values().iterator();
	    while (iterator.hasNext()) {
		Interface67 interface67 = (Interface67) iterator.next();
		interface67.method309(1991502885);
	    }
	    iterator = ((Class218) this).aHashMap2303.values().iterator();
	    while (iterator.hasNext()) {
		Interface67 interface67 = (Interface67) iterator.next();
		interface67.method309(1991502885);
	    }
	    iterator = ((Class218) this).aList2297.iterator();
	    while (iterator.hasNext()) {
		Interface67 interface67 = (Interface67) iterator.next();
		if (interface67.method411(865860517))
		    ((Class218) this).aHashMap2303.remove
			(Integer.valueOf(interface67.method415((byte) -10)));
		else
		    ((Class218) this).aHashMap2302.remove
			(Integer.valueOf(interface67.method415((byte) 0)));
	    }
	    ((Class218) this).aList2297.clear();
	    if (((Class218) this).aClass469_2313 != null
		&& (((Class218) this).aClass469_2313.method5747((byte) 1)
		    == Class473.aClass473_5421)
		&& false == ((Class218) this).aBool2314
		&& client.aClass109_10930.aClass10_1379 != null
		&& Class622.method7419(client.anInt10876 * 175711435,
				       (byte) -13)) {
		Class528_Sub34 class528_sub34
		    = Class656.method7845(OutgoingOpcode.aClass403_4540,
					  client.aClass109_10930.aClass10_1379,
					  -1898176984);
		class528_sub34.aClass528_Sub42_Sub2_10481.writeInt
		    (((Class218) this).aClass469_2313.method5752
			 (-1275464373).method415((byte) -90),
		     2081524318);
		client.aClass109_10930.method1380(class528_sub34, 488227491);
		((Class218) this).aBool2314 = true;
	    }
	    iterator = ((Class218) this).aList2321.iterator();
	    while (iterator.hasNext()) {
		Class469 class469 = (Class469) iterator.next();
		class469.method5761(1414814677);
		class469.method5746(1929634418);
		Class473 class473 = class469.method5747((byte) 1);
		if (class469.method5748(1864301681) == this) {
		    if (class473 == Class473.aClass473_5422
			|| class473 == Class473.aClass473_5423) {
			if ((class469.method5749((byte) -74)
			     == Class196.aClass196_2194)
			    || (class469.method5749((byte) -53)
				== Class196.aClass196_2193)) {
			    if (class469 == ((Class218) this).aClass469_2313) {
				((Class218) this).aBool2314 = false;
				((Class218) this).aClass469_2313 = null;
				class469.method5782((byte) 66);
				((Class218) this).aList2301.remove(class469);
			    } else {
				int i = class469.method5752(-2127116460)
					    .method415((byte) -126);
				boolean bool
				    = (method3094(Class188.aClass188_2131
						      .method2758(-1560776500),
						  (byte) -98)
				       > 0.0F);
				if (!((Class218) this).aBool2317 && bool) {
				    if ((-1461364571
					 * ((Class218) this).anInt2311)
					== i) {
					method3119(i, 1732661638);
					((Class218) this).anInt2311
					    = -2002439981;
				    }
				    class469.method5782((byte) 38);
				    ((Class218) this).aList2301
					.remove(class469);
				} else if (i == (((Class218) this).anInt2310
						 * -423237413)) {
				    ((Class218) this).anInt2310 = 527707309;
				    ((Class218) this).aBool2317 = false;
				    class469.method5782((byte) 59);
				    ((Class218) this).aList2301
					.remove(class469);
				    Iterator iterator_97_
					= ((Class218) this).aList2321
					      .iterator();
				    while (iterator_97_.hasNext()) {
					Class469 class469_98_
					    = (Class469) iterator_97_.next();
					if (class469_98_.method5749((byte) -40)
					    == Class196.aClass196_2194) {
					    int i_99_
						= class469_98_.method5752
						      (-1599760169)
						      .method415((byte) -17);
					    if ((i_99_ == (-1461364571
							   * (((Class218) this)
							      .anInt2311))
						 && (class469_98_
							 .method5747((byte) 1)
						     == (Class473
							 .aClass473_5422)))
						|| (class469_98_
							.method5747((byte) 1)
						    == Class473.aClass473_5417)
						|| (class469_98_
							.method5747((byte) 1)
						    == Class473.aClass473_5418)
						|| (class469_98_
							.method5747((byte) 1)
						    == (Class473
							.aClass473_5421))) {
						if (class469_98_
							.method5747((byte) 1)
						    == Class473.aClass473_5422)
						    class469_98_.method5781
							(-2146633557);
						else
						    class469_98_.method5741
							((byte) -125);
						break;
					    }
					}
				    }
				} else if (bool) {
				    if (!((Class218) this).aBool2317
					|| i != (((Class218) this).anInt2311
						 * -1461364571)) {
					class469.method5782((byte) 109);
					((Class218) this).aList2301
					    .remove(class469);
				    }
				    if (!((Class218) this).aBool2317
					&& -1461364571 * (((Class218) this)
							  .anInt2311) == i) {
					((Class218) this).anInt2311
					    = -2002439981;
					((Class218) this).aClass469_2319
					    = null;
				    }
				}
			    }
			} else {
			    Iterator iterator_100_
				= ((Class218) this).aHashMap2296.keySet()
				      .iterator();
			    while (iterator_100_.hasNext()) {
				int i = ((Integer) iterator_100_.next())
					    .intValue();
				Class220 class220
				    = (Class220) ((Class218) this)
						     .aHashMap2296
						     .get(Integer.valueOf(i));
				if (class220.method3147((short) -21782)
					.contains(class469)) {
				    class220.method3146(class469, -1848475813);
				    break;
				}
			    }
			    class469.method5782((byte) 74);
			    ((Class218) this).aList2301.remove(class469);
			}
		    } else if ((class469.method5747((byte) 1)
				!= Class473.aClass473_5416)
			       && (class469.method5788((byte) 8)
				   == Class188.aClass188_2131
					  .method2758(-1560776500))) {
			boolean bool = method3094(Class188.aClass188_2131
						      .method2758(-1560776500),
						  (byte) 26) > 1.0E-4F;
			if (!bool)
			    class469.method5742(150, 2012778150);
		    }
		}
	    }
	}
    }
    
    public void method3129(int i, int i_101_) {
	if (i != ((Class218) this).anInt2311 * -1461364571) {
	    if (((Class218) this).aClass469_2313 != null) {
		((Class218) this).aClass469_2313.method5742(0, 2097227973);
		method3101(((Class218) this).aClass469_2313, 1249912037);
		((Class218) this).aClass469_2313 = null;
	    }
	    Class469 class469
		= method3103(Class196.aClass196_2194, this, i, 0, i_101_,
			     Class188.aClass188_2131.method2758(-1560776500),
			     Class202.aClass202_2211, 0.0F, 0.0F, null, 0, 255,
			     true, 1398634796);
	    if (null != class469) {
		class469.method5740((byte) -39);
		((Class218) this).aClass469_2313 = class469;
	    }
	    ((Class218) this).aBool2314 = false;
	}
    }
    
    public void method3130(int i, int i_102_) {
	if (i != ((Class218) this).anInt2311 * -1461364571) {
	    if (((Class218) this).aClass469_2313 != null) {
		((Class218) this).aClass469_2313.method5742(0, 2013092833);
		method3101(((Class218) this).aClass469_2313, 1752014907);
		((Class218) this).aClass469_2313 = null;
	    }
	    Class469 class469
		= method3103(Class196.aClass196_2194, this, i, 0, i_102_,
			     Class188.aClass188_2131.method2758(-1560776500),
			     Class202.aClass202_2211, 0.0F, 0.0F, null, 0, 255,
			     true, 1540166159);
	    if (null != class469) {
		class469.method5740((byte) -79);
		((Class218) this).aClass469_2313 = class469;
	    }
	    ((Class218) this).aBool2314 = false;
	}
    }
    
    public void method3131(int i) {
	((Class218) this).anInt2315 = 359829173 * i;
    }
    
    public void method3132(int i) {
	((Class218) this).anInt2315 = 359829173 * i;
    }
    
    public void method3133(int i, int i_103_) {
	method3108(i, i_103_, false, 0, 0, 0, 0, 0, (byte) -3);
    }
    
    public void method3134(int i, int i_104_) {
	if (((Class218) this).aBool2295
	    && (!((Class218) this).aBool2317
		|| i != -423237413 * ((Class218) this).anInt2310)) {
	    if (((Class218) this).aBool2317
		&& i != ((Class218) this).anInt2310 * -423237413) {
		Iterator iterator = ((Class218) this).aList2321.iterator();
		while (iterator.hasNext()) {
		    Class469 class469 = (Class469) iterator.next();
		    if (class469.method5749((byte) -58)
			== Class196.aClass196_2193) {
			class469.method5782((byte) 21);
			((Class218) this).aList2301.remove(class469);
			((Class218) this).aBool2317 = false;
			break;
		    }
		}
	    }
	    if (0 != i_104_ && i != -1) {
		if (!((Class218) this).aBool2317
		    && null != ((Class218) this).aClass469_2319)
		    ((Class218) this).aClass469_2319.method5743((byte) 0);
		Class469 class469
		    = method3103(Class196.aClass196_2193, this, i, 0, i_104_,
				 Class188.aClass188_2131
				     .method2758(-1560776500),
				 Class202.aClass202_2211, 0.0F, 0.0F, null, 0,
				 255, true, 1757887988);
		if (class469 != null) {
		    class469.method5741((byte) -125);
		    method3101(class469, 1543066440);
		    ((Class218) this).aBool2317 = true;
		    ((Class218) this).anInt2310 = -527707309 * i;
		}
	    }
	}
    }
    
    public void method3135(int i, int i_105_) {
	if (((Class218) this).aBool2295
	    && (!((Class218) this).aBool2317
		|| i != -423237413 * ((Class218) this).anInt2310)) {
	    if (((Class218) this).aBool2317
		&& i != ((Class218) this).anInt2310 * -423237413) {
		Iterator iterator = ((Class218) this).aList2321.iterator();
		while (iterator.hasNext()) {
		    Class469 class469 = (Class469) iterator.next();
		    if (class469.method5749((byte) -89)
			== Class196.aClass196_2193) {
			class469.method5782((byte) 77);
			((Class218) this).aList2301.remove(class469);
			((Class218) this).aBool2317 = false;
			break;
		    }
		}
	    }
	    if (0 != i_105_ && i != -1) {
		if (!((Class218) this).aBool2317
		    && null != ((Class218) this).aClass469_2319)
		    ((Class218) this).aClass469_2319.method5743((byte) 0);
		Class469 class469
		    = method3103(Class196.aClass196_2193, this, i, 0, i_105_,
				 Class188.aClass188_2131
				     .method2758(-1560776500),
				 Class202.aClass202_2211, 0.0F, 0.0F, null, 0,
				 255, true, 1668821659);
		if (class469 != null) {
		    class469.method5741((byte) -125);
		    method3101(class469, 1723922059);
		    ((Class218) this).aBool2317 = true;
		    ((Class218) this).anInt2310 = -527707309 * i;
		}
	    }
	}
    }
    
    Class469 method3136(int i) {
	Iterator iterator = ((Class218) this).aList2301.iterator();
	while (iterator.hasNext()) {
	    Class469 class469 = (Class469) iterator.next();
	    if (class469.method5749((byte) -99) == Class196.aClass196_2194
		&& class469.method5747((byte) 1) == Class473.aClass473_5420)
		return class469;
	}
	return null;
    }
    
    public int method3137(int i) {
	return ((Class218) this).anInt2311 * -1461364571;
    }
    
    public void method3138() {
	Class466.method5645(717927929);
    }
    
    public static Class501 method3139(byte i) {
	Class501_Sub2 class501_sub2;
	try {
	    class501_sub2 = new Class501_Sub2();
	} catch (Throwable throwable) {
	    return new Class501_Sub1();
	}
	return class501_sub2;
    }
    
    static final void method3140(Class648 class648, byte i) {
	int i_106_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class528_Sub34 class528_sub34
	    = Class656.method7845(OutgoingOpcode.aClass403_4481,
				  client.aClass109_10930.aClass10_1379,
				  -2033172833);
	class528_sub34.aClass528_Sub42_Sub2_10481.method9717(i_106_, (byte) 5);
	client.aClass109_10930.method1380(class528_sub34, 1607107782);
    }
    
    static final void method3141(Class648 class648, int i) {
	int i_107_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	NPC class645_sub1_sub5_sub1_sub1
	    = ((NPC)
	       ((Class648) class648).aClass645_Sub1_Sub5_Sub1_8389);
	int i_108_
	    = class645_sub1_sub5_sub1_sub1.method10905(i_107_, -1074302335);
	int i_109_
	    = class645_sub1_sub5_sub1_sub1.method10906(i_107_, (byte) 1);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = i_108_;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = i_109_;
    }
    
    static final void method3142(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	class229.aString2420
	    = (String) (((Class648) class648).anObjectArray8396
			[((((Class648) class648).anInt8410 -= 1600226731)
			  * -520794877)]);
    }
}
