/* Class173 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class Class173
{
    public static final int anInt1975 = 5;
    protected int anInt1976;
    protected static final int anInt1977 = 1;
    public static final int anInt1978 = 3;
    protected static final int anInt1979 = 2;
    static final int anInt1980 = 8;
    static boolean[] aBoolArray1981 = new boolean[8];
    protected static final int anInt1982 = 4;
    public Interface44 anInterface44_1983;
    public Class165 aClass165_1984;
    public int anInt1985;
    public static final int anInt1986 = 0;
    public static final int anInt1987 = 1;
    public static final int anInt1988 = 1;
    public static final int anInt1989 = 2;
    protected int anInt1990;
    public Interface22 anInterface22_1991;
    protected static final int anInt1992 = 32;
    protected static final int anInt1993 = 8;
    protected static final int anInt1994 = 16;
    public static final int anInt1995 = 2;
    static final int anInt1996 = 4;
    int anInt1997 = 426177279;
    protected Class163 aClass163_1998;
    protected Class163_Sub2 aClass163_Sub2_1999;
    protected Hashtable aHashtable2000 = new Hashtable();
    Class163_Sub1[] aClass163_Sub1Array2001 = new Class163_Sub1[4];
    public int anInt2002;
    protected int anInt2003;
    public static final int anInt2004 = 0;
    public Interface45 anInterface45_2005;
    protected int anInt2006;
    public int anInt2007;
    public float aFloat2008;
    
    public abstract Interface21 method2150(int i, int i_0_);
    
    public abstract Class433 method2151();
    
    public abstract void method2152(int i, Class164 class164);
    
    public abstract Class151 method2153(int i, int i_1_, boolean bool,
					boolean bool_2_);
    
    abstract void method2154(int i, int i_3_) throws Exception_Sub5;
    
    public abstract void method2155();
    
    public void method2156(int i) {
	aBoolArray1981[1967042207 * anInt1985] = false;
	Enumeration enumeration = aHashtable2000.keys();
	while (enumeration.hasMoreElements()) {
	    Canvas canvas = (Canvas) enumeration.nextElement();
	    Class163_Sub2 class163_sub2
		= (Class163_Sub2) aHashtable2000.get(canvas);
	    class163_sub2.method115();
	}
	method2199();
    }
    
    public abstract void method2157(Class433 class433, Class159 class159,
				    Class431 class431);
    
    public abstract void method2158(int i);
    
    public abstract int method2159();
    
    public abstract void method2160(int i, float f, float f_4_, float f_5_,
				    float f_6_, float f_7_);
    
    public abstract boolean method2161();
    
    public abstract boolean method2162();
    
    public abstract boolean method2163();
    
    public abstract boolean method2164();
    
    public abstract boolean method2165();
    
    public abstract boolean method2166();
    
    public abstract boolean method2167();
    
    public abstract boolean method2168();
    
    public abstract String method2169();
    
    public abstract void method2170(int i, int i_8_, int i_9_, int i_10_,
				    int i_11_, int i_12_);
    
    public abstract int method2171();
    
    public abstract int[] method2172();
    
    public abstract Class151 method2173(int i, int i_13_, int i_14_, int i_15_,
					boolean bool);
    
    public final void method2174(Canvas canvas, int i, int i_16_, int i_17_) {
	if (!aHashtable2000.containsKey(canvas)) {
	    Class607.method7232(canvas, 1994650596);
	    method2387(canvas, method2253(canvas, i, i_16_), (byte) 29);
	}
    }
    
    public abstract boolean method2175();
    
    public final void method2176(Canvas canvas, int i) {
	if (aHashtable2000.containsKey(canvas)) {
	    Class163_Sub2 class163_sub2
		= (Class163_Sub2) aHashtable2000.get(canvas);
	    class163_sub2.method115();
	    aHashtable2000.remove(canvas);
	}
    }
    
    public final void method2177(Canvas canvas, short i) {
	Class163_Sub2 class163_sub2
	    = (Class163_Sub2) aHashtable2000.get(canvas);
	if (null == class163_sub2)
	    throw new RuntimeException();
	if (((Class173) this).anInt1997 * 252703489 > 0
	    || aClass163_Sub2_1999 != aClass163_1998)
	    throw new RuntimeException();
	if (null != aClass163_1998)
	    aClass163_1998.method2072();
	if (252703489 * ((Class173) this).anInt1997 < 0)
	    aClass163_1998 = class163_sub2;
	aClass163_Sub2_1999 = class163_sub2;
	class163_sub2.method335();
    }
    
    public final void method2178(Canvas canvas, int i, int i_18_, byte i_19_) {
	Class163_Sub2 class163_sub2
	    = (Class163_Sub2) aHashtable2000.get(canvas);
	if (class163_sub2 == null)
	    throw new RuntimeException("");
	class163_sub2.method8921(i, i_18_);
    }
    
    public final void method2179(Class163_Sub1 class163_sub1, int i) {
	if (252703489 * ((Class173) this).anInt1997 >= 3)
	    throw new RuntimeException();
	if (((Class173) this).anInt1997 * 252703489 >= 0)
	    ((Class173) this).aClass163_Sub1Array2001
		[((Class173) this).anInt1997 * 252703489].method2072();
	else
	    aClass163_Sub2_1999.method2072();
	aClass163_1998
	    = ((Class173) this).aClass163_Sub1Array2001
		  [(((Class173) this).anInt1997 += -426177279) * 252703489]
	    = class163_sub1;
	class163_sub1.method335();
    }
    
    public final void method2180(Class163_Sub1 class163_sub1, int i) {
	if (252703489 * ((Class173) this).anInt1997 < 0
	    || (((Class173) this).aClass163_Sub1Array2001
		[252703489 * ((Class173) this).anInt1997]) != class163_sub1)
	    throw new RuntimeException();
	((Class173) this).aClass163_Sub1Array2001
	    [(((Class173) this).anInt1997 -= -426177279) * 252703489 + 1]
	    = null;
	class163_sub1.method2072();
	if (252703489 * ((Class173) this).anInt1997 >= 0) {
	    aClass163_1998 = (((Class173) this).aClass163_Sub1Array2001
			      [((Class173) this).anInt1997 * 252703489]);
	    ((Class173) this).aClass163_Sub1Array2001
		[252703489 * ((Class173) this).anInt1997].method335();
	} else {
	    aClass163_1998 = aClass163_Sub2_1999;
	    aClass163_Sub2_1999.method335();
	}
    }
    
    public abstract void method2181(Class162 class162, float f,
				    Class162 class162_20_, float f_21_,
				    Class162 class162_22_, float f_23_);
    
    abstract void method2182(int i, int i_24_, int i_25_, int i_26_,
			     int i_27_);
    
    public void method2183(int[] is) {
	if (aClass163_Sub2_1999 != null) {
	    is[0] = aClass163_Sub2_1999.method2074();
	    is[1] = aClass163_Sub2_1999.method2070();
	} else {
	    int[] is_28_ = is;
	    is[1] = 0;
	    is_28_[0] = 0;
	}
    }
    
    public abstract Interface21 method2184(int i, int i_29_);
    
    public abstract int method2185();
    
    public abstract void method2186();
    
    public abstract Class418 method2187();
    
    public abstract boolean method2188();
    
    public abstract boolean method2189();
    
    public abstract Class151 method2190(int[] is, int i, int i_30_, int i_31_,
					int i_32_, boolean bool);
    
    public abstract Class151 method2191(int i, int i_33_, boolean bool,
					boolean bool_34_);
    
    public abstract void method2192(Class162 class162, float f,
				    Class162 class162_35_, float f_36_,
				    Class162 class162_37_, float f_38_);
    
    public abstract void method2193(int i, int i_39_, int i_40_);
    
    public abstract long method2194(int i, int i_41_);
    
    public abstract void method2195(Class528_Sub23 class528_sub23);
    
    public abstract void method2196(int i, int i_42_, int[] is, int[] is_43_);
    
    void method2197(int i, int i_44_, byte i_45_) {
	anInt1976 = i * 2131804577;
	anInt2003 = i_44_ * 925087609;
	float f = ((float) aClass163_1998.method2074()
		   / (float) aClass163_1998.method2070());
	float f_46_ = ((float) (anInt1976 * 1361535585)
		       / (float) (anInt2003 * 171311817));
	if (f < f_46_) {
	    anInt2006
		= (int) (f * (float) (171311817 * anInt2003)) * 740819173;
	    anInt1990 = -469657883 * anInt2003;
	} else {
	    anInt2006 = anInt1976 * -1553792827;
	    anInt1990
		= (int) ((float) (1361535585 * anInt1976) / f) * -1142094531;
	}
	aFloat2008 = ((float) (857980141 * anInt2006)
		      / (float) aClass163_1998.method2074());
	anInt2002 = ((1361535585 * anInt1976 - anInt2006 * 857980141) / 2
		     * -636243809);
	anInt2007 = ((anInt2003 * 171311817 - -649725419 * anInt1990) / 2
		     * 1899080399);
    }
    
    public int[] method2198(int i, int i_47_, int i_48_, int i_49_, int[] is,
			    int i_50_, int i_51_, int i_52_) {
	int[] is_53_ = new int[i_48_ * i_49_];
	if (i_51_ == 0)
	    i_51_ = i;
	for (int i_54_ = 0; i_54_ < i_49_; i_54_++) {
	    if (i_54_ < i_47_) {
		int i_55_ = i_50_ + i_54_ * i_51_;
		for (int i_56_ = 0; i_56_ < i; i_56_++)
		    is_53_[i_56_ + i_54_ * i_48_] = is[i_56_ + i_55_];
		int i_57_ = is[i_55_ + (i - 1)];
		for (int i_58_ = i; i_58_ < i_48_; i_58_++)
		    is_53_[i_54_ * i_48_ + i_58_] = i_57_;
	    } else {
		int i_59_ = (i_47_ - 1) * i_48_;
		for (int i_60_ = 0; i_60_ < i_48_; i_60_++)
		    is_53_[i_60_ + i_48_ * i_54_] = is_53_[i_60_ + i_59_];
	    }
	}
	return is_53_;
    }
    
    abstract void method2199();
    
    public abstract void method2200(int i, float f, float f_61_, float f_62_,
				    float f_63_, float f_64_);
    
    public abstract boolean method2201();
    
    public abstract Interface21 method2202(int i, int i_65_, int i_66_);
    
    public abstract void method2203();
    
    public abstract void method2204(int i, int i_67_, int i_68_, int i_69_);
    
    public abstract void method2205(int i, int i_70_, int i_71_, int i_72_);
    
    public final void method2206(int i, int i_73_, int i_74_, int i_75_,
				 int i_76_, int i_77_) {
	method2215(i, i_73_, i_74_, i_75_, i_76_, 1);
    }
    
    public abstract void method2207(int[] is);
    
    public abstract int[] method2208(int i, int i_78_, int i_79_, int i_80_);
    
    public abstract void method2209(Class171 class171);
    
    public final void method2210(int i, int i_81_, int i_82_, int i_83_,
				 int i_84_, int i_85_) {
	method2216(i, i_81_, i_82_, i_83_, i_84_, 1);
    }
    
    public abstract int method2211();
    
    public abstract void method2212(float f, float f_86_);
    
    public abstract void method2213(float f, float f_87_);
    
    public final void method2214(int i, int i_88_, int i_89_, int i_90_,
				 int i_91_, byte i_92_) {
	method2219(i, i_88_, i_89_, i_90_, i_91_, 1);
    }
    
    public abstract void method2215(int i, int i_93_, int i_94_, int i_95_,
				    int i_96_, int i_97_);
    
    public abstract void method2216(int i, int i_98_, int i_99_, int i_100_,
				    int i_101_, int i_102_);
    
    abstract void method2217(int i, int i_103_, int i_104_, int i_105_,
			     int i_106_);
    
    abstract void method2218(int i, int i_107_, int i_108_, int i_109_,
			     int i_110_);
    
    public abstract void method2219(int i, int i_111_, int i_112_, int i_113_,
				    int i_114_, int i_115_);
    
    public abstract void method2220(int i, int i_116_, int i_117_, int i_118_,
				    int i_119_, int i_120_, Class148 class148,
				    int i_121_, int i_122_);
    
    public abstract void method2221(int i, int i_123_, int i_124_, int i_125_,
				    int i_126_, int i_127_, int i_128_,
				    int i_129_, int i_130_);
    
    public abstract void method2222(int i, int i_131_, int i_132_, int i_133_,
				    int i_134_, int i_135_, Class148 class148,
				    int i_136_, int i_137_, int i_138_,
				    int i_139_, int i_140_);
    
    public abstract void method2223(int i, int i_141_, int i_142_, int i_143_,
				    int i_144_, int i_145_, int i_146_);
    
    public abstract int method2224(int i, int i_147_, int i_148_, int i_149_,
				   int i_150_, int i_151_);
    
    public boolean method2225(int i, int i_152_, Class433 class433,
			      Class431 class431, byte i_153_) {
	return method2226(i, i_152_, 0, 0, class433, class431);
    }
    
    abstract boolean method2226(int i, int i_154_, int i_155_, int i_156_,
				Class433 class433, Class431 class431);
    
    public abstract void method2227(Class433 class433, Class159 class159,
				    Class431 class431);
    
    public abstract Class528_Sub23 method2228(int i);
    
    public abstract void method2229(int i);
    
    public Class151 method2230(int i, int i_157_, boolean bool, byte i_158_) {
	return method2191(i, i_157_, bool, false);
    }
    
    public abstract void method2231();
    
    public abstract void method2232();
    
    public abstract void method2233(int i, Class528_Sub12[] class528_sub12s);
    
    public abstract Class151 method2234(int i, int i_159_, int i_160_,
					int i_161_, boolean bool);
    
    public void method2235() {
	/* empty */
    }
    
    public abstract Class163_Sub1 method2236();
    
    public void method2237() {
	/* empty */
    }
    
    public abstract Class148 method2238(int i, int i_162_, int[] is,
					int[] is_163_);
    
    public abstract void method2239(int i, Class148 class148, int i_164_,
				    int i_165_);
    
    public abstract Class172 method2240(Class1 class1, Class178[] class178s,
					boolean bool);
    
    public abstract Class418 method2241();
    
    public abstract void method2242(int i, int i_166_, int i_167_, int i_168_,
				    int i_169_, int i_170_);
    
    public abstract void method2243(boolean bool);
    
    public abstract Class157 method2244(Class177 class177, int i, int i_171_,
					int i_172_, int i_173_);
    
    public abstract int method2245(int i, int i_174_);
    
    abstract void method2246(float f, float f_175_, float f_176_, float f_177_,
			     float f_178_, float f_179_);
    
    public abstract Class168 method2247(int i);
    
    public boolean method2248(int i) {
	return true;
    }
    
    public abstract Interface21 method2249(int i, int i_180_);
    
    public Class528_Sub12 method2250(int i, int i_181_, int i_182_, int i_183_,
				     int i_184_, float f) {
	return new Class528_Sub12(i, i_181_, i_182_, i_183_, i_184_, f);
    }
    
    public void method2251(boolean bool) {
	/* empty */
    }
    
    public abstract void method2252(Class418 class418);
    
    abstract Class163_Sub2 method2253(Canvas canvas, int i, int i_185_);
    
    public void method2254() {
	/* empty */
    }
    
    public void method2255() {
	/* empty */
    }
    
    public abstract int method2256();
    
    public abstract boolean method2257();
    
    public abstract void method2258(int i, Class528_Sub12[] class528_sub12s);
    
    public abstract Class168 method2259(int i);
    
    public abstract void method2260(int i);
    
    public abstract void method2261(Class168 class168);
    
    public abstract void method2262(int i, int i_186_, int i_187_, int i_188_);
    
    public abstract void method2263(int i, int i_189_);
    
    public abstract boolean method2264();
    
    public abstract void method2265(float f, float f_190_, float f_191_,
				    float f_192_, float f_193_);
    
    public abstract Class162 method2266(int[] is);
    
    public abstract boolean method2267();
    
    public abstract void method2268(int i, int i_194_);
    
    public abstract boolean method2269();
    
    public abstract Class433 method2270();
    
    public abstract boolean method2271();
    
    public abstract void method2272(int i, float f, float f_195_, float f_196_,
				    float f_197_, float f_198_);
    
    public final void method2273(int i) throws Exception_Sub5 {
	method2154(0, 0);
    }
    
    public abstract void method2274(int i, Class164 class164);
    
    public abstract void method2275(int i, int i_199_, int i_200_, int i_201_);
    
    public abstract void method2276();
    
    public abstract void method2277(float f, float f_202_, float f_203_,
				    float[] fs);
    
    public abstract void method2278();
    
    public float[] method2279(int i, int i_204_, int i_205_, int i_206_,
			      float[] fs, int i_207_, int i_208_, int i_209_,
			      int i_210_) {
	float[] fs_211_ = new float[i_209_ * (i_206_ * i_205_)];
	if (i_208_ == 0)
	    i_208_ = i * i_209_;
	for (int i_212_ = 0; i_212_ < i_206_; i_212_++) {
	    if (i_212_ < i_204_) {
		int i_213_ = i_207_ + i_208_ * i_212_;
		for (int i_214_ = 0; i_214_ < i; i_214_++) {
		    for (int i_215_ = 0; i_215_ < i_209_; i_215_++)
			fs_211_[(i_209_ * (i_205_ * i_212_) + i_214_ * i_209_
				 + i_215_)]
			    = fs[i_215_ + (i_213_ + i_214_ * i_209_)];
		}
		float[] fs_216_ = new float[i_209_];
		for (int i_217_ = 0; i_217_ < i_209_; i_217_++)
		    fs_216_[i_217_] = fs[(i - 1) * i_209_ + i_213_ + i_217_];
		for (int i_218_ = i; i_218_ < i_205_; i_218_++) {
		    for (int i_219_ = 0; i_219_ < i_209_; i_219_++)
			fs_211_[i_219_ + (i_212_ * i_205_ * i_209_
					  + i_209_ * i_218_)]
			    = fs_216_[i_219_];
		}
	    } else {
		int i_220_ = i_209_ * (i_205_ * (i_204_ - 1));
		for (int i_221_ = 0; i_221_ < i_205_; i_221_++) {
		    for (int i_222_ = 0; i_222_ < i_209_; i_222_++)
			fs_211_[(i_221_ * i_209_ + i_205_ * i_212_ * i_209_
				 + i_222_)]
			    = fs_211_[i_220_ + i_221_ * i_209_ + i_222_];
		}
	    }
	}
	return fs_211_;
    }
    
    public byte[] method2280(int i, int i_223_, int i_224_, int i_225_,
			     byte[] is, int i_226_, int i_227_, int i_228_,
			     int i_229_) {
	byte[] is_230_ = new byte[i_228_ * (i_225_ * i_224_)];
	if (i_227_ == 0)
	    i_227_ = i_228_ * i;
	for (int i_231_ = 0; i_231_ < i_225_; i_231_++) {
	    if (i_231_ < i_223_) {
		int i_232_ = i_231_ * i_227_ + i_226_;
		for (int i_233_ = 0; i_233_ < i; i_233_++) {
		    for (int i_234_ = 0; i_234_ < i_228_; i_234_++)
			is_230_[i_234_ + (i_233_ * i_228_
					  + i_231_ * i_224_ * i_228_)]
			    = is[i_232_ + i_233_ * i_228_ + i_234_];
		}
		byte[] is_235_ = new byte[i_228_];
		for (int i_236_ = 0; i_236_ < i_228_; i_236_++)
		    is_235_[i_236_] = is[(i - 1) * i_228_ + i_232_ + i_236_];
		for (int i_237_ = i; i_237_ < i_224_; i_237_++) {
		    for (int i_238_ = 0; i_238_ < i_228_; i_238_++)
			is_230_[i_238_ + (i_228_ * (i_224_ * i_231_)
					  + i_237_ * i_228_)]
			    = is_235_[i_238_];
		}
	    } else {
		int i_239_ = i_228_ * (i_224_ * (i_223_ - 1));
		for (int i_240_ = 0; i_240_ < i_224_; i_240_++) {
		    for (int i_241_ = 0; i_241_ < i_228_; i_241_++)
			is_230_[(i_224_ * i_231_ * i_228_ + i_240_ * i_228_
				 + i_241_)]
			    = is_230_[i_228_ * i_240_ + i_239_ + i_241_];
		}
	    }
	}
	return is_230_;
    }
    
    public abstract void method2281(boolean bool);
    
    public abstract Class152 method2282();
    
    public abstract void method2283(boolean bool);
    
    public abstract void method2284();
    
    public abstract void method2285();
    
    public abstract void method2286();
    
    abstract void method2287();
    
    abstract void method2288();
    
    public abstract void method2289(int i);
    
    public abstract boolean method2290();
    
    abstract void method2291(int i, int i_242_, int i_243_, int i_244_,
			     int i_245_);
    
    static synchronized Class173 method2292
	(int i, Canvas canvas, Class165 class165, Interface22 interface22,
	 Interface44 interface44, Interface45 interface45,
	 Interface46 interface46, Class446 class446, int i_246_, int i_247_,
	 int i_248_, byte i_249_) {
	if (0 == i)
	    return Class604.method7193(canvas, class165, interface22,
				       interface44, interface45, interface46,
				       i_247_, i_248_, -889048537);
	if (i == 1)
	    return Class136.method1649(canvas, class165, interface22,
				       interface44, interface45, interface46,
				       i_246_);
	if (5 == i)
	    return Class484.method5871(canvas, class165, interface22,
				       interface44, interface45, interface46,
				       class446, i_246_);
	if (3 == i)
	    return Class410.method4899(canvas, class165, interface22,
				       interface44, interface45, interface46,
				       class446, i_246_);
	throw new IllegalArgumentException("");
    }
    
    public abstract boolean method2293();
    
    public abstract boolean method2294();
    
    public abstract void method2295(int[] is);
    
    public abstract boolean method2296();
    
    public abstract boolean method2297();
    
    public abstract boolean method2298();
    
    public abstract boolean method2299();
    
    public abstract boolean method2300();
    
    public abstract boolean method2301();
    
    public abstract boolean method2302();
    
    public abstract boolean method2303();
    
    public abstract void method2304();
    
    public final void method2305(int i, int i_250_, int i_251_, int i_252_,
				 int i_253_) {
	method2217(i, i_250_, i_251_, i_252_, 1);
    }
    
    public abstract void method2306(Class433 class433);
    
    public abstract void method2307(boolean bool);
    
    public abstract void method2308(int[] is);
    
    public abstract void method2309(boolean bool);
    
    abstract Class163_Sub2 method2310(Canvas canvas, int i, int i_254_);
    
    public abstract int[] method2311(int i, int i_255_, int i_256_,
				     int i_257_);
    
    public abstract boolean method2312();
    
    public abstract Class163_Sub1 method2313();
    
    public abstract boolean method2314();
    
    public abstract boolean method2315();
    
    public abstract boolean method2316();
    
    public abstract boolean method2317();
    
    public abstract int method2318();
    
    public abstract void method2319(int i, int i_258_, int i_259_);
    
    public abstract void method2320(int i, int i_260_, int i_261_);
    
    public abstract void method2321();
    
    public abstract void method2322(float f, float f_262_, float f_263_,
				    float[] fs);
    
    public abstract void method2323();
    
    public abstract long method2324(int i, int i_264_);
    
    public abstract void method2325(int i, int i_265_);
    
    public abstract long method2326(int i, int i_266_);
    
    public abstract void method2327(long l);
    
    public abstract void method2328(long l);
    
    public abstract void method2329(long l);
    
    public abstract boolean method2330();
    
    public abstract void method2331(int i, int i_267_, int[] is,
				    int[] is_268_);
    
    public abstract void method2332();
    
    public abstract void method2333();
    
    public abstract Class151 method2334(Class178 class178, boolean bool);
    
    public abstract Class148 method2335(int i, int i_269_, int[] is,
					int[] is_270_);
    
    public abstract Interface19 method2336
	(int i, int i_271_, Class149 class149, Class169 class169, int i_272_);
    
    public abstract Interface21 method2337(int i, int i_273_);
    
    public abstract void method2338();
    
    public abstract void method2339();
    
    public abstract void method2340(int i, int i_274_, int i_275_, int i_276_);
    
    public abstract void method2341(int[] is);
    
    public abstract void method2342();
    
    public abstract void method2343(int[] is);
    
    public abstract void method2344(float f, float f_277_);
    
    public abstract void method2345(int[] is);
    
    public abstract void method2346();
    
    public abstract void method2347(int i, int i_278_, int i_279_, int i_280_);
    
    public abstract void method2348(int i, int i_281_, int i_282_, int i_283_);
    
    public abstract void method2349(int i, int i_284_, int i_285_, int i_286_);
    
    public void method2350(boolean bool) {
	/* empty */
    }
    
    public abstract void method2351();
    
    public abstract void method2352(long l);
    
    public abstract void method2353(int i, int i_287_, int i_288_, int i_289_,
				    int i_290_, int i_291_);
    
    public abstract void method2354(int i, int i_292_, int i_293_, int i_294_,
				    int i_295_, int i_296_);
    
    abstract void method2355(int i, int i_297_, int i_298_, int i_299_,
			     int i_300_);
    
    public abstract void method2356(Class433 class433);
    
    public final Class163_Sub2 method2357(int i) {
	return aClass163_Sub2_1999;
    }
    
    abstract void method2358(int i, int i_301_, int i_302_, int i_303_,
			     int i_304_);
    
    public abstract void method2359(int i, int i_305_, int i_306_, int i_307_,
				    int i_308_, int i_309_);
    
    public abstract void method2360(int i, int i_310_, int i_311_, int i_312_,
				    int i_313_, int i_314_);
    
    public abstract boolean method2361();
    
    public abstract Interface19 method2362
	(int i, int i_315_, Class149 class149, Class169 class169, int i_316_);
    
    public abstract void method2363(int i, int i_317_, int i_318_, int i_319_,
				    int i_320_, int i_321_);
    
    public abstract void method2364(int i, int i_322_, int i_323_, int i_324_,
				    int i_325_, int i_326_, Class148 class148,
				    int i_327_, int i_328_);
    
    public abstract void method2365(int i, int i_329_, int i_330_, int i_331_,
				    int i_332_, int i_333_, Class148 class148,
				    int i_334_, int i_335_, int i_336_,
				    int i_337_, int i_338_);
    
    public abstract int method2366(int i, int i_339_);
    
    abstract boolean method2367(int i, int i_340_, int i_341_, int i_342_,
				Class433 class433, Class431 class431);
    
    public abstract Class168 method2368(Class168 class168,
					Class168 class168_343_, float f,
					Class168 class168_344_);
    
    public abstract Class137 method2369(int i, int i_345_, int[][] is,
					int[][] is_346_, int i_347_,
					int i_348_, int i_349_);
    
    public abstract void method2370(Class433 class433, Class159 class159,
				    Class431 class431);
    
    public abstract Class528_Sub23 method2371(int i);
    
    public abstract Class528_Sub23 method2372(int i);
    
    public abstract void method2373(Class528_Sub23 class528_sub23);
    
    public abstract void method2374(Class528_Sub23 class528_sub23);
    
    public abstract Class151 method2375(int i, int i_350_, boolean bool,
					boolean bool_351_);
    
    public abstract Class151 method2376(int i, int i_352_, boolean bool,
					boolean bool_353_);
    
    public void method2377(float f, float f_354_, float f_355_, int i) {
	method2435(f, f_354_, f_355_, 0.0F, 1.0F, 1.0F);
    }
    
    public abstract int method2378();
    
    public abstract Class151 method2379(int[] is, int i, int i_356_,
					int i_357_, int i_358_, boolean bool);
    
    public abstract Class151 method2380(int[] is, int i, int i_359_,
					int i_360_, int i_361_, boolean bool);
    
    public abstract Class151 method2381(Class178 class178, boolean bool);
    
    public abstract Class151 method2382(int[] is, int i, int i_362_,
					int i_363_, int i_364_, boolean bool);
    
    public abstract Class151 method2383(int i, int i_365_, int i_366_,
					int i_367_, boolean bool);
    
    public final void method2384(int i, int i_368_, int i_369_, int i_370_,
				 int i_371_) {
	method2218(i, i_368_, i_369_, i_370_, 1);
    }
    
    public abstract Class151 method2385(int i, int i_372_, int i_373_,
					int i_374_, boolean bool);
    
    public abstract Class151 method2386(int i, int i_375_, int i_376_,
					int i_377_, boolean bool);
    
    final void method2387(Canvas canvas, Class163_Sub2 class163_sub2, byte i) {
	if (class163_sub2 == null)
	    throw new RuntimeException("");
	aHashtable2000.put(canvas, class163_sub2);
    }
    
    public abstract Class172 method2388(Class1 class1, Class178[] class178s,
					boolean bool);
    
    public abstract void method2389(int i, int i_378_, float f, int i_379_,
				    int i_380_, float f_381_, int i_382_,
				    int i_383_, float f_384_, int i_385_,
				    int i_386_, int i_387_, int i_388_);
    
    public abstract int method2390(int i, int i_389_);
    
    public abstract int method2391(int i, int i_390_);
    
    public abstract int method2392(int i, int i_391_);
    
    public abstract int method2393(int i, int i_392_);
    
    public abstract int method2394(int i, int i_393_);
    
    abstract void method2395(int i, int i_394_, int i_395_, int i_396_,
			     int i_397_);
    
    public abstract int method2396(int i, int i_398_);
    
    public abstract int method2397(int i, int i_399_);
    
    public abstract Class137 method2398(int i, int i_400_, int[][] is,
					int[][] is_401_, int i_402_,
					int i_403_, int i_404_);
    
    public abstract Class418 method2399();
    
    public abstract void method2400();
    
    public abstract int method2401(int i, int i_405_);
    
    public abstract Class433 method2402();
    
    public final Class163 method2403(byte i) {
	return aClass163_1998;
    }
    
    abstract void method2404(int i, int i_406_, int i_407_, int i_408_,
			     int i_409_);
    
    public abstract void method2405(int i, Class528_Sub12[] class528_sub12s);
    
    public abstract int method2406();
    
    public Class528_Sub12 method2407(int i, int i_410_, int i_411_, int i_412_,
				     int i_413_, float f) {
	return new Class528_Sub12(i, i_410_, i_411_, i_412_, i_413_, f);
    }
    
    public Class528_Sub12 method2408(int i, int i_414_, int i_415_, int i_416_,
				     int i_417_, float f) {
	return new Class528_Sub12(i, i_414_, i_415_, i_416_, i_417_, f);
    }
    
    public abstract boolean method2409();
    
    public abstract Class168 method2410(Class168 class168,
					Class168 class168_418_, float f,
					Class168 class168_419_);
    
    public abstract Interface21 method2411(int i, int i_420_, int i_421_);
    
    public abstract void method2412(Class171 class171);
    
    public abstract void method2413(Class171 class171);
    
    public abstract void method2414(int i, int i_422_, float f, int i_423_,
				    int i_424_, float f_425_, int i_426_,
				    int i_427_, float f_428_, int i_429_,
				    int i_430_, int i_431_, int i_432_);
    
    public abstract Class433 method2415();
    
    public abstract Interface19 method2416
	(int i, int i_433_, Class149 class149, Class169 class169, int i_434_);
    
    public abstract Class433 method2417();
    
    public Class151 method2418(int[] is, int i, int i_435_, int i_436_,
			       int i_437_, int i_438_) {
	return method2382(is, i, i_435_, i_436_, i_437_, true);
    }
    
    public abstract Class433 method2419();
    
    public abstract Class433 method2420();
    
    public abstract void method2421(Class418 class418);
    
    public abstract void method2422(Class418 class418);
    
    public abstract Class418 method2423();
    
    public abstract Class418 method2424();
    
    public abstract Class418 method2425();
    
    public abstract boolean method2426();
    
    public abstract int method2427();
    
    public abstract void method2428(int i);
    
    public abstract void method2429(int i);
    
    public abstract void method2430(int i, int i_439_, int i_440_);
    
    public abstract void method2431(int i, Class164 class164);
    
    public abstract int method2432();
    
    public abstract Class168 method2433(Class168 class168,
					Class168 class168_441_, float f,
					Class168 class168_442_);
    
    public abstract Class168 method2434(Class168 class168,
					Class168 class168_443_, float f,
					Class168 class168_444_);
    
    abstract void method2435(float f, float f_445_, float f_446_, float f_447_,
			     float f_448_, float f_449_);
    
    public abstract Class168 method2436(Class168 class168,
					Class168 class168_450_, float f,
					Class168 class168_451_);
    
    public abstract void method2437(boolean bool);
    
    public abstract void method2438(Class168 class168);
    
    public abstract void method2439(Class168 class168);
    
    public abstract void method2440(Class168 class168);
    
    public abstract void method2441(int i, int i_452_, int i_453_, int i_454_);
    
    public abstract void method2442(int i, int i_455_, int i_456_, int i_457_);
    
    public abstract void method2443(int i, int i_458_);
    
    public abstract void method2444(int i, int i_459_);
    
    public abstract boolean method2445();
    
    public abstract void method2446();
    
    public abstract boolean method2447();
    
    public abstract boolean method2448();
    
    public abstract void method2449(float f, float f_460_, float f_461_,
				    float f_462_, float f_463_);
    
    public abstract void method2450(float f, float f_464_, float f_465_,
				    float f_466_, float f_467_);
    
    public abstract Class162 method2451(int[] is);
    
    public abstract Class162 method2452(int[] is);
    
    public abstract boolean method2453();
    
    public void finalize() {
	method2156(-1372793801);
    }
    
    public abstract Class151 method2454(Class178 class178, boolean bool);
    
    public abstract void method2455(Class162 class162, float f,
				    Class162 class162_468_, float f_469_,
				    Class162 class162_470_, float f_471_);
    
    public abstract void method2456(Class162 class162, float f,
				    Class162 class162_472_, float f_473_,
				    Class162 class162_474_, float f_475_);
    
    public abstract boolean method2457();
    
    public abstract boolean method2458();
    
    public abstract void method2459();
    
    public abstract void method2460();
    
    public abstract void method2461(int i);
    
    public abstract void method2462();
    
    public abstract boolean method2463();
    
    public abstract boolean method2464();
    
    public abstract void method2465(Class433 class433);
    
    abstract void method2466(float f, float f_476_, float f_477_, float f_478_,
			     float f_479_, float f_480_);
    
    public abstract boolean method2467();
    
    public abstract void method2468(int i, Class164 class164);
    
    public abstract void method2469();
    
    public abstract void method2470(int i, Class164 class164);
    
    public abstract void method2471(int i, int i_481_, float f, int i_482_,
				    int i_483_, float f_484_, int i_485_,
				    int i_486_, float f_487_, int i_488_,
				    int i_489_, int i_490_, int i_491_);
    
    public abstract void method2472(int i, int i_492_, float f, int i_493_,
				    int i_494_, float f_495_, int i_496_,
				    int i_497_, float f_498_, int i_499_,
				    int i_500_, int i_501_, int i_502_);
    
    public abstract int[] method2473();
    
    public abstract void method2474();
    
    public abstract void method2475(float f, float f_503_, float f_504_,
				    float[] fs);
    
    public abstract void method2476(float f, float f_505_, float f_506_,
				    float[] fs);
    
    public abstract void method2477(float f);
    
    public abstract Class163_Sub1 method2478();
    
    public abstract Class433 method2479();
    
    public abstract void method2480(float f);
    
    public abstract void method2481();
    
    public abstract Interface19 method2482
	(int i, int i_507_, Class149 class149, Class169 class169, int i_508_);
    
    public abstract Interface19 method2483
	(int i, int i_509_, Class149 class149, Class169 class169, int i_510_);
    
    void method2484() {
	method2156(-1372793801);
    }
    
    public abstract void method2485(int[] is);
    
    public abstract void method2486(int i, Class148 class148, int i_511_,
				    int i_512_);
    
    public abstract Class433 method2487();
    
    public abstract long method2488(int i, int i_513_);
    
    void method2489() {
	method2156(-1372793801);
    }
    
    public abstract void method2490(int i, int i_514_, int i_515_, int i_516_);
    
    void method2491() {
	method2156(-1372793801);
    }
    
    void method2492() {
	method2156(-1372793801);
    }
    
    abstract void method2493(int i, int i_517_) throws Exception_Sub5;
    
    abstract void method2494(int i, int i_518_) throws Exception_Sub5;
    
    abstract void method2495(int i, int i_519_) throws Exception_Sub5;
    
    public abstract boolean method2496();
    
    public abstract boolean method2497();
    
    public abstract boolean method2498();
    
    public abstract boolean method2499();
    
    public abstract void method2500();
    
    public abstract void method2501();
    
    public abstract boolean method2502();
    
    public abstract void method2503(int i);
    
    public abstract void method2504(int i, int i_520_, int i_521_, int i_522_,
				    int i_523_, int i_524_);
    
    public abstract void method2505(int i, int i_525_, int i_526_, int i_527_,
				    int i_528_, int i_529_, int i_530_,
				    int i_531_, int i_532_);
    
    public abstract void method2506(int i, int i_533_, int i_534_, int i_535_,
				    int i_536_, int i_537_, int i_538_);
    
    public abstract void method2507(int i, int i_539_, int i_540_, int i_541_,
				    int i_542_, int i_543_, int i_544_);
    
    public abstract void method2508(int i, int i_545_, int i_546_, int i_547_,
				    int i_548_, int i_549_, int i_550_);
    
    public abstract void method2509(int i, int i_551_, int i_552_, int i_553_,
				    int i_554_, int i_555_, int i_556_);
    
    public abstract void method2510(int i, int i_557_, int i_558_, int i_559_,
				    int i_560_, int i_561_, int i_562_);
    
    public abstract void method2511(boolean bool);
    
    public abstract void method2512(float f, float f_563_, float f_564_,
				    float[] fs);
    
    public abstract Class157 method2513(Class177 class177, int i, int i_565_,
					int i_566_, int i_567_);
    
    public abstract Class157 method2514(Class177 class177, int i, int i_568_,
					int i_569_, int i_570_);
    
    public abstract Class157 method2515(Class177 class177, int i, int i_571_,
					int i_572_, int i_573_);
    
    abstract boolean method2516(int i, int i_574_, int i_575_, int i_576_,
				Class433 class433, Class431 class431);
    
    public abstract void method2517();
    
    public abstract void method2518(boolean bool);
    
    public abstract void method2519(boolean bool);
    
    Class173(Class165 class165, Interface22 interface22,
	     Interface44 interface44, Interface45 interface45,
	     Interface46 interface46) {
	anInt1990 = 0;
	aFloat2008 = 0.0F;
	aClass165_1984 = class165;
	anInterface22_1991 = interface22;
	anInterface44_1983 = interface44;
	anInterface45_2005 = interface45;
	int i = -1;
	for (int i_577_ = 0; i_577_ < 8; i_577_++) {
	    if (!aBoolArray1981[i_577_]) {
		aBoolArray1981[i_577_] = true;
		i = i_577_;
		break;
	    }
	}
	if (-1 == i)
	    throw new IllegalStateException("");
	anInt1985 = 1433202015 * i;
    }
    
    public abstract boolean method2520();
    
    public abstract boolean method2521();
    
    public final void method2522(int i, int i_578_, int i_579_, int i_580_,
				 byte i_581_) {
	method2395(i, i_578_, i_579_, i_580_, 1);
    }
    
    public abstract void method2523(int i, int i_582_, int i_583_);
    
    public abstract void method2524(int i);
    
    public void method2525(int[] is) {
	if (aClass163_Sub2_1999 != null) {
	    is[0] = aClass163_Sub2_1999.method2074();
	    is[1] = aClass163_Sub2_1999.method2070();
	} else {
	    int[] is_584_ = is;
	    is[1] = 0;
	    is_584_[0] = 0;
	}
    }
    
    public abstract Class528_Sub23 method2526(int i);
    
    public abstract void method2527();
    
    public abstract Class152 method2528();
    
    public abstract Class433 method2529();
    
    public abstract void method2530(float f, float f_585_, float f_586_,
				    float[] fs);
    
    public abstract boolean method2531();
    
    public void method2532(boolean bool) {
	/* empty */
    }
    
    public abstract void method2533(Class168 class168);
    
    public abstract Class137 method2534(int i, int i_587_, int[][] is,
					int[][] is_588_, int i_589_,
					int i_590_, int i_591_);
    
    public abstract Class152 method2535();
    
    public abstract String method2536();
    
    public abstract void method2537(int i);
    
    public Class528_Sub12 method2538(int i, int i_592_, int i_593_, int i_594_,
				     int i_595_, float f) {
	return new Class528_Sub12(i, i_592_, i_593_, i_594_, i_595_, f);
    }
    
    public abstract void method2539(float f, float f_596_, float f_597_,
				    float[] fs);
    
    public abstract Class163_Sub1 method2540();
    
    abstract void method2541(int i, int i_598_, int i_599_, int i_600_,
			     int i_601_);
    
    public abstract void method2542(int i);
    
    public void method2543() {
	/* empty */
    }
    
    public abstract void method2544(float f, float f_602_, float f_603_,
				    float[] fs);
    
    public abstract Class418 method2545();
    
    public void method2546() {
	/* empty */
    }
    
    public abstract int method2547(int i, int i_604_, int i_605_, int i_606_,
				   int i_607_, int i_608_);
    
    public abstract Interface21 method2548(int i, int i_609_, int i_610_);
    
    public abstract void method2549(int i, int i_611_, int i_612_);
    
    public abstract void method2550(int i, int i_613_, int[] is,
				    int[] is_614_);
    
    public static int method2551(ByteBuffer class528_sub42, String string,
				 byte i) {
	int i_615_ = -185904669 * class528_sub42.pointer;
	byte[] is = Class183.method2706(string, 56670677);
	class528_sub42.method9622(is.length, 980539535);
	class528_sub42.pointer
	    += Class276.aClass254_3040.method3440(is, 0, is.length,
						  (class528_sub42
						   .payload),
						  -185904669 * (class528_sub42
								.pointer),
						  1239022665) * 2015001547;
	return -185904669 * class528_sub42.pointer - i_615_;
    }
    
    public static boolean method2552(int i) {
	return Class293.aBool3219;
    }
    
    static final void method2553(Class648 class648, byte i) {
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = ((Class648) class648).aClass528_Sub36_8416.aString10501;
    }
    
    static final void method2554(Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	Class450.method5439(string, true, -395628305);
    }
    
    public static void method2555(String string, int i) {
	ModeWhere.method7898(0, 0, "", "", "", string, null, 1427824809);
    }
}
