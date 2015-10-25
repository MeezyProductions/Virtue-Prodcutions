/* PlayerModel - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class PlayerModel
{
    int[] anIntArray7955;
    public static final int anInt7956 = 1073741824;
    public int[] anIntArray7957;
    public static final int anInt7958 = 10;
    public static final int anInt7959 = 10;
    public static final int anInt7960 = 4;
    public static final int anInt7961 = 4;
    int anInt7962;
    ItemStyleOverride[] aClass4Array7963;
    public static final int anInt7964 = -2147483648;
    public int[] anIntArray7965;
    static int[] anIntArray7966 = { 8, 11, 4, 6, 9, 7, 10, 0 };
    public boolean aBool7967;
    public int anInt7968 = -1905614067;
    long aLong7969;
    long aLong7970;
    static Class186 aClass186_7971;
    static Class186 aClass186_7972 = new Class186(260);
    static final int anInt7973 = 1073741823;
    
    public void method7270(int i, int[] is, ItemStyleOverride[] class4s, int[] is_0_,
			   int[] is_1_, boolean bool, int i_2_, int i_3_) {
	if (i != -2066333261 * ((PlayerModel) this).anInt7962)
	    ((PlayerModel) this).anInt7962 = 113923451 * i;
	((PlayerModel) this).anIntArray7955 = is;
	((PlayerModel) this).aClass4Array7963 = class4s;
	anIntArray7965 = is_0_;
	anIntArray7957 = is_1_;
	aBool7967 = bool;
	anInt7968 = 1905614067 * i_2_;
	method7276(2146790857);
    }
    
    public void method7271(int i, int i_4_, int i_5_) {
	anIntArray7965[i] = i_4_;
	method7276(2122561415);
    }
    
    public void method7272(boolean bool, int i) {
	aBool7967 = bool;
	method7276(2119122880);
    }
    
    public void method7273(int i, int i_6_, int i_7_) {
	anIntArray7957[i] = i_6_;
	method7276(2131511214);
    }
    
    public static void method7274() {
	synchronized (aClass186_7972) {
	    aClass186_7972.method2735(-33037906);
	}
	synchronized (aClass186_7971) {
	    aClass186_7971.method2735(792545870);
	}
    }
    
    public void method7275(boolean bool) {
	aBool7967 = bool;
	method7276(2095793979);
    }
    
    void method7276(int i) {
	long[] ls = ByteBuffer.aLongArray10662;
	((PlayerModel) this).aLong7969 = 5193132579426245715L;
	((PlayerModel) this).aLong7969
	    = (-5193132579426245715L
	       * (((PlayerModel) this).aLong7969 * 5568320381081679909L >>> 8
		  ^ ls[(int) (((5568320381081679909L
				* ((PlayerModel) this).aLong7969)
			       ^ (long) ((((PlayerModel) this).anInt7962
					  * -2066333261)
					 >> 8))
			      & 0xffL)]));
	((PlayerModel) this).aLong7969
	    = (-5193132579426245715L
	       * (5568320381081679909L * ((PlayerModel) this).aLong7969 >>> 8
		  ^ ls[(int) (((5568320381081679909L
				* ((PlayerModel) this).aLong7969)
			       ^ (long) (((PlayerModel) this).anInt7962
					 * -2066333261))
			      & 0xffL)]));
	for (int i_8_ = 0; i_8_ < ((PlayerModel) this).anIntArray7955.length;
	     i_8_++) {
	    ((PlayerModel) this).aLong7969
		= (-5193132579426245715L
		   * (5568320381081679909L * ((PlayerModel) this).aLong7969 >>> 8
		      ^ ls[(int) (((((PlayerModel) this).aLong7969
				    * 5568320381081679909L)
				   ^ (long) ((((PlayerModel) this).anIntArray7955
					      [i_8_])
					     >> 24))
				  & 0xffL)]));
	    ((PlayerModel) this).aLong7969
		= (-5193132579426245715L
		   * (5568320381081679909L * ((PlayerModel) this).aLong7969 >>> 8
		      ^ ls[(int) (((((PlayerModel) this).aLong7969
				    * 5568320381081679909L)
				   ^ (long) ((((PlayerModel) this).anIntArray7955
					      [i_8_])
					     >> 16))
				  & 0xffL)]));
	    ((PlayerModel) this).aLong7969
		= (-5193132579426245715L
		   * (5568320381081679909L * ((PlayerModel) this).aLong7969 >>> 8
		      ^ ls[(int) (((((PlayerModel) this).aLong7969
				    * 5568320381081679909L)
				   ^ (long) ((((PlayerModel) this).anIntArray7955
					      [i_8_])
					     >> 8))
				  & 0xffL)]));
	    ((PlayerModel) this).aLong7969
		= (-5193132579426245715L
		   * (((PlayerModel) this).aLong7969 * 5568320381081679909L >>> 8
		      ^ ls[(int) (((((PlayerModel) this).aLong7969
				    * 5568320381081679909L)
				   ^ (long) (((PlayerModel) this).anIntArray7955
					     [i_8_]))
				  & 0xffL)]));
	}
	if (null != ((PlayerModel) this).aClass4Array7963) {
	    for (int i_9_ = 0;
		 i_9_ < ((PlayerModel) this).aClass4Array7963.length; i_9_++) {
		if (null != ((PlayerModel) this).aClass4Array7963[i_9_]) {
		    int[] is;
		    int[] is_10_;
		    if (aBool7967) {
			is = (((PlayerModel) this).aClass4Array7963[i_9_]
			      .anIntArray111);
			is_10_ = (((PlayerModel) this).aClass4Array7963[i_9_]
				  .anIntArray105);
		    } else {
			is = (((PlayerModel) this).aClass4Array7963[i_9_]
			      .anIntArray109);
			is_10_ = (((PlayerModel) this).aClass4Array7963[i_9_]
				  .anIntArray112);
		    }
		    if (is != null) {
			for (int i_11_ = 0; i_11_ < is.length; i_11_++) {
			    ((PlayerModel) this).aLong7969
				= (-5193132579426245715L
				   * ((5568320381081679909L
				       * ((PlayerModel) this).aLong7969) >>> 8
				      ^ ls[(int) (((((PlayerModel) this).aLong7969
						    * 5568320381081679909L)
						   ^ (long) (is[i_11_] >> 8))
						  & 0xffL)]));
			    ((PlayerModel) this).aLong7969
				= (-5193132579426245715L
				   * ((((PlayerModel) this).aLong7969
				       * 5568320381081679909L) >>> 8
				      ^ ls[(int) (((5568320381081679909L
						    * (((PlayerModel) this)
						       .aLong7969))
						   ^ (long) is[i_11_])
						  & 0xffL)]));
			}
		    }
		    if (null != is_10_) {
			for (int i_12_ = 0; i_12_ < is_10_.length; i_12_++) {
			    ((PlayerModel) this).aLong7969
				= (((5568320381081679909L
				     * ((PlayerModel) this).aLong7969) >>> 8
				    ^ ls[(int) (((((PlayerModel) this).aLong7969
						  * 5568320381081679909L)
						 ^ (long) (is_10_[i_12_] >> 8))
						& 0xffL)])
				   * -5193132579426245715L);
			    ((PlayerModel) this).aLong7969
				= (((((PlayerModel) this).aLong7969
				     * 5568320381081679909L) >>> 8
				    ^ (ls
				       [(int) (((5568320381081679909L
						 * ((PlayerModel) this).aLong7969)
						^ (long) is_10_[i_12_])
					       & 0xffL)]))
				   * -5193132579426245715L);
			}
		    }
		    if (null != (((PlayerModel) this).aClass4Array7963[i_9_]
				 .aShortArray114)) {
			for (int i_13_ = 0;
			     i_13_ < (((PlayerModel) this).aClass4Array7963[i_9_]
				      .aShortArray114).length;
			     i_13_++) {
			    ((PlayerModel) this).aLong7969
				= (((((PlayerModel) this).aLong7969
				     * 5568320381081679909L) >>> 8
				    ^ (ls
				       [(int) (((5568320381081679909L
						 * ((PlayerModel) this).aLong7969)
						^ (long) ((((PlayerModel) this)
							   .aClass4Array7963
							   [i_9_]
							   .aShortArray114
							   [i_13_])
							  >> 8))
					       & 0xffL)]))
				   * -5193132579426245715L);
			    ((PlayerModel) this).aLong7969
				= (((5568320381081679909L
				     * ((PlayerModel) this).aLong7969) >>> 8
				    ^ ls[(int) (((((PlayerModel) this).aLong7969
						  * 5568320381081679909L)
						 ^ (long) (((PlayerModel) this)
							   .aClass4Array7963
							   [i_9_]
							   .aShortArray114
							   [i_13_]))
						& 0xffL)])
				   * -5193132579426245715L);
			}
		    }
		    if (null != (((PlayerModel) this).aClass4Array7963[i_9_]
				 .aShortArray115)) {
			for (int i_14_ = 0;
			     i_14_ < (((PlayerModel) this).aClass4Array7963[i_9_]
				      .aShortArray115).length;
			     i_14_++) {
			    ((PlayerModel) this).aLong7969
				= (((5568320381081679909L
				     * ((PlayerModel) this).aLong7969) >>> 8
				    ^ (ls
				       [(int) (((5568320381081679909L
						 * ((PlayerModel) this).aLong7969)
						^ (long) ((((PlayerModel) this)
							   .aClass4Array7963
							   [i_9_]
							   .aShortArray115
							   [i_14_])
							  >> 8))
					       & 0xffL)]))
				   * -5193132579426245715L);
			    ((PlayerModel) this).aLong7969
				= (((5568320381081679909L
				     * ((PlayerModel) this).aLong7969) >>> 8
				    ^ (ls
				       [(int) (((5568320381081679909L
						 * ((PlayerModel) this).aLong7969)
						^ (long) (((PlayerModel) this)
							  .aClass4Array7963
							  [i_9_].aShortArray115
							  [i_14_]))
					       & 0xffL)]))
				   * -5193132579426245715L);
			}
		    }
		}
	    }
	}
	for (int i_15_ = 0; i_15_ < 10; i_15_++)
	    ((PlayerModel) this).aLong7969
		= (-5193132579426245715L
		   * (5568320381081679909L * ((PlayerModel) this).aLong7969 >>> 8
		      ^ ls[(int) (((((PlayerModel) this).aLong7969
				    * 5568320381081679909L)
				   ^ (long) anIntArray7965[i_15_])
				  & 0xffL)]));
	for (int i_16_ = 0; i_16_ < 10; i_16_++)
	    ((PlayerModel) this).aLong7969
		= (5568320381081679909L * ((PlayerModel) this).aLong7969 >>> 8
		   ^ ls[(int) (((((PlayerModel) this).aLong7969
				 * 5568320381081679909L)
				^ (long) anIntArray7957[i_16_])
			       & 0xffL)]) * -5193132579426245715L;
	((PlayerModel) this).aLong7969
	    = (((PlayerModel) this).aLong7969 * 5568320381081679909L >>> 8
	       ^ ls[(int) ((((PlayerModel) this).aLong7969 * 5568320381081679909L
			    ^ (long) (aBool7967 ? 1 : 0))
			   & 0xffL)]) * -5193132579426245715L;
    }
    
    public static int method7277() {
	synchronized (aClass186_7972) {
	    int i = aClass186_7972.method2734(-1201543434);
	    return i;
	}
    }
    
    public Class157 method7278
	(Class173 class173, int i, Class5_Sub7 class5_sub7,
	 Class5_Sub8 class5_sub8, Class5_Sub13 class5_sub13,
	 IMultiVarDefinitionsLoader iMultiVarDefinitionsLoader, IMultiVarValueReader iMultiVarValueReader, Class690 class690,
	 int i_17_) {
	if (-1 != 674438203 * anInt7968)
	    return (((Class299)
		     class5_sub8.method63(anInt7968 * 674438203, 1070042322))
			.method4004
		    (class173, i, iMultiVarDefinitionsLoader, iMultiVarValueReader, class690, null,
		     -520357358));
	int i_18_ = null != class690 ? i | class690.method8078(-79591129) : i;
	Class157 class157;
	synchronized (aClass186_7971) {
	    class157
		= ((Class157)
		   aClass186_7971.method2727(5568320381081679909L
					     * ((PlayerModel) this).aLong7969));
	}
	if (null == class157
	    || class173.method2245(class157.method1874(), i_18_) != 0) {
	    if (null != class157)
		i_18_ = class173.method2366(i_18_, class157.method1874());
	    int i_19_ = i_18_;
	    boolean bool = false;
	    for (int i_20_ = 0;
		 i_20_ < ((PlayerModel) this).anIntArray7955.length; i_20_++) {
		int i_21_ = ((PlayerModel) this).anIntArray7955[i_20_];
		ItemStyleOverride itemStyleOverride = null;
		if ((i_21_ & 0x40000000) != 0) {
		    if (null != ((PlayerModel) this).aClass4Array7963
			&& ((PlayerModel) this).aClass4Array7963[i_20_] != null)
			itemStyleOverride = ((PlayerModel) this).aClass4Array7963[i_20_];
		    if (!((ItemType)
			  class5_sub13.method63(i_21_ & 0x3fffffff, 231640451))
			     .method520(aBool7967, itemStyleOverride, (byte) 66))
			bool = true;
		} else if ((i_21_ & ~0x7fffffff) != 0
			   && !((Class282)
				class5_sub7.method63(i_21_ & 0x3fffffff,
						     402046373))
				   .method3748((byte) 23))
		    bool = true;
	    }
	    if (bool)
		return null;
	    Class177[] class177s
		= new Class177[((PlayerModel) this).anIntArray7955.length];
	    int i_22_ = 0;
	    for (int i_23_ = 0;
		 i_23_ < ((PlayerModel) this).anIntArray7955.length; i_23_++) {
		int i_24_ = ((PlayerModel) this).anIntArray7955[i_23_];
		ItemStyleOverride itemStyleOverride = null;
		if (0 != (i_24_ & 0x40000000)) {
		    if (null != ((PlayerModel) this).aClass4Array7963
			&& null != ((PlayerModel) this).aClass4Array7963[i_23_])
			itemStyleOverride = ((PlayerModel) this).aClass4Array7963[i_23_];
		    Class177 class177
			= ((ItemType) class5_sub13.method63(i_24_ & 0x3fffffff,
							  506575846))
			      .method521(aBool7967, itemStyleOverride, (byte) 83);
		    if (null != class177)
			class177s[i_22_++] = class177;
		} else if ((i_24_ & ~0x7fffffff) != 0) {
		    Class177 class177
			= ((Class282)
			   class5_sub7.method63(i_24_ & 0x3fffffff, 299450997))
			      .method3749((byte) -97);
		    if (null != class177)
			class177s[i_22_++] = class177;
		}
	    }
	    Class177 class177 = new Class177(class177s, i_22_);
	    i_19_ |= 0x4000;
	    class157 = class173.method2244(class177, i_19_,
					   -1318734145 * Class570.anInt7558,
					   64, 768);
	    for (int i_25_ = 0; i_25_ < 10; i_25_++) {
		for (int i_26_ = 0;
		     i_26_ < Class590.aShortArrayArray7735[i_25_].length;
		     i_26_++) {
		    if (anIntArray7965[i_25_]
			< (Class73.aShortArrayArrayArray782[i_25_]
			   [i_26_]).length)
			class157.method1914((Class590.aShortArrayArray7735
					     [i_25_][i_26_]),
					    (Class73.aShortArrayArrayArray782
					     [i_25_][i_26_]
					     [anIntArray7965[i_25_]]));
		}
	    }
	    for (int i_27_ = 0; i_27_ < 10; i_27_++) {
		for (int i_28_ = 0;
		     i_28_ < Class439.aShortArrayArray4897[i_27_].length;
		     i_28_++) {
		    if (anIntArray7957[i_27_]
			< (Class101.aShortArrayArrayArray1287[i_27_]
			   [i_28_]).length)
			class157.method1916((Class439.aShortArrayArray4897
					     [i_27_][i_28_]),
					    (Class101.aShortArrayArrayArray1287
					     [i_27_][i_28_]
					     [anIntArray7957[i_27_]]));
		}
	    }
	    class157.method1873(i_18_);
	    synchronized (aClass186_7971) {
		aClass186_7971.method2729(class157,
					  (5568320381081679909L
					   * ((PlayerModel) this).aLong7969));
	    }
	}
	if (class690 == null)
	    return class157;
	Class157 class157_29_ = class157.method1951((byte) 4, i_18_, true);
	class690.method8079(class157_29_, 0, -1054270866);
	return class157_29_;
    }
    
    public Class157 method7279(Class173 class173, int i,
			       Class5_Sub7 class5_sub7,
			       Class5_Sub4 class5_sub4, Class690 class690,
			       int i_30_, int i_31_, int i_32_, byte i_33_) {
	int i_34_ = null != class690 ? i | class690.method8078(1155860871) : i;
	long l = (long) i_32_ << 32 | (long) (i_31_ << 16) | (long) i_30_;
	Class157 class157;
	synchronized (aClass186_7971) {
	    class157 = (Class157) aClass186_7971.method2727(l);
	}
	if (null == class157
	    || class173.method2245(class157.method1874(), i_34_) != 0) {
	    if (class157 != null)
		i_34_ = class173.method2366(i_34_, class157.method1874());
	    int i_35_ = i_34_;
	    Class177[] class177s = new Class177[3];
	    int i_36_ = 0;
	    if (((Class282) class5_sub7.method63(i_30_, -1782896796))
		    .method3748((byte) 31)
		&& ((Class282) class5_sub7.method63(i_31_, 1840891443))
		       .method3748((byte) 31)
		&& ((Class282) class5_sub7.method63(i_32_, 1978026618))
		       .method3748((byte) -30)) {
		Class177 class177
		    = ((Class282) class5_sub7.method63(i_30_, -253468420))
			  .method3749((byte) -57);
		if (class177 != null)
		    class177s[i_36_++] = class177;
		class177 = ((Class282) class5_sub7.method63(i_31_, -253220583))
			       .method3749((byte) -25);
		if (null != class177)
		    class177s[i_36_++] = class177;
		class177 = ((Class282) class5_sub7.method63(i_32_, 1811750376))
			       .method3749((byte) 66);
		if (null != class177)
		    class177s[i_36_++] = class177;
		class177 = new Class177(class177s, i_36_);
		i_35_ |= 0x4000;
		class157
		    = class173.method2244(class177, i_35_,
					  -1318734145 * Class570.anInt7558, 64,
					  768);
		for (int i_37_ = 0; i_37_ < 10; i_37_++) {
		    for (int i_38_ = 0;
			 i_38_ < Class590.aShortArrayArray7735[i_37_].length;
			 i_38_++) {
			if (anIntArray7965[i_37_]
			    < (Class73.aShortArrayArrayArray782[i_37_]
			       [i_38_]).length)
			    class157.method1914((Class590.aShortArrayArray7735
						 [i_37_][i_38_]),
						(Class73
						 .aShortArrayArrayArray782
						 [i_37_][i_38_]
						 [anIntArray7965[i_37_]]));
		    }
		}
		for (int i_39_ = 0; i_39_ < 10; i_39_++) {
		    for (int i_40_ = 0;
			 i_40_ < Class439.aShortArrayArray4897[i_39_].length;
			 i_40_++) {
			if (anIntArray7957[i_39_]
			    < (Class101.aShortArrayArrayArray1287[i_39_]
			       [i_40_]).length)
			    class157.method1916((Class439.aShortArrayArray4897
						 [i_39_][i_40_]),
						(Class101
						 .aShortArrayArrayArray1287
						 [i_39_][i_40_]
						 [anIntArray7957[i_39_]]));
		    }
		}
		class157.method1873(i_34_);
		synchronized (aClass186_7971) {
		    aClass186_7971.method2729(class157, l);
		}
	    } else
		return null;
	}
	if (class690 == null)
	    return class157;
	class157 = class157.method1951((byte) 4, i_34_, true);
	class690.method8079(class157, 0, 1952367934);
	return class157;
    }
    
    static {
	aClass186_7971 = new Class186(5);
    }
    
    public void method7280(int i, int i_41_) {
	anIntArray7965[i] = i_41_;
	method7276(2145703949);
    }
    
    public void method7281(int i, int i_42_) {
	anIntArray7957[i] = i_42_;
	method7276(2115691218);
    }
    
    public void method7282(int i, int i_43_, Class5_Sub7 class5_sub7,
			   byte i_44_) {
	int i_45_ = anIntArray7966[i];
	if (class5_sub7.method63(i_43_, 1793139292) != null) {
	    ((PlayerModel) this).anIntArray7955[i_45_] = i_43_ | ~0x7fffffff;
	    method7276(2143966628);
	}
    }
    
    public void method7283(boolean bool) {
	aBool7967 = bool;
	method7276(2099278064);
    }
    
    public static void method7284() {
	synchronized (aClass186_7972) {
	    aClass186_7972.method2731(-1742847587);
	}
	synchronized (aClass186_7971) {
	    aClass186_7971.method2731(-1321248715);
	}
    }
    
    public void method7285(int i, int i_46_) {
	anIntArray7957[i] = i_46_;
	method7276(2145537612);
    }
    
    public static int method7286() {
	synchronized (aClass186_7972) {
	    int i = aClass186_7972.method2734(1809639686);
	    return i;
	}
    }
    
    public Class157 method7287
	(Class173 class173, int i, Class5_Sub14 class5_sub14,
	 Class5_Sub7 class5_sub7, Class5_Sub8 class5_sub8,
	 Class5_Sub13 class5_sub13, IMultiVarDefinitionsLoader iMultiVarDefinitionsLoader,
	 IMultiVarValueReader iMultiVarValueReader, Class690 class690, Class690 class690_47_,
	 Class690[] class690s, int[] is, int i_48_, boolean bool,
	 Class624 class624, int i_49_) {
	if (anInt7968 * 674438203 != -1)
	    return (((Class299)
		     class5_sub8.method63(anInt7968 * 674438203, 1163844738))
			.method3994
		    (class173, i, class5_sub14, iMultiVarDefinitionsLoader, iMultiVarValueReader,
		     class690, class690_47_, class690s, is, i_48_, null,
		     (byte) -104));
	int i_50_ = i;
	long l = ((PlayerModel) this).aLong7969 * 5568320381081679909L;
	int[] is_51_ = ((PlayerModel) this).anIntArray7955;
	boolean bool_52_ = false;
	boolean bool_53_ = false;
	if (null != class690) {
	    Class190 class190 = class690.method8073(1464073726);
	    if (null != class190 && (-1137918919 * class190.anInt2151 >= 0
				     || class190.anInt2152 * 661760407 >= 0)) {
		is_51_ = new int[((PlayerModel) this).anIntArray7955.length];
		for (int i_54_ = 0; i_54_ < is_51_.length; i_54_++)
		    is_51_[i_54_] = ((PlayerModel) this).anIntArray7955[i_54_];
		if (-1137918919 * class190.anInt2151 >= 0
		    && -635588361 * class624.anInt8127 != -1) {
		    bool_52_ = true;
		    if (class190.anInt2151 * -1137918919 == 65535) {
			is_51_[-635588361 * class624.anInt8127] = 0;
			for (int i_55_ = 0;
			     i_55_ < class624.anIntArray8126.length; i_55_++)
			    is_51_[class624.anIntArray8126[i_55_]] = 0;
			l ^= ~0xffffffffL;
		    } else {
			is_51_[-635588361 * class624.anInt8127]
			    = class190.anInt2151 * -1137918919 | 0x40000000;
			for (int i_56_ = 0;
			     i_56_ < class624.anIntArray8126.length; i_56_++)
			    is_51_[class624.anIntArray8126[i_56_]] = 0;
			l ^= ((long) is_51_[-635588361 * class624.anInt8127]
			      << 32);
		    }
		}
		if (661760407 * class190.anInt2152 >= 0
		    && class624.anInt8125 * 964526417 != -1) {
		    bool_53_ = true;
		    if (65535 == 661760407 * class190.anInt2152) {
			is_51_[964526417 * class624.anInt8125] = 0;
			for (int i_57_ = 0;
			     i_57_ < class624.anIntArray8121.length; i_57_++)
			    is_51_[class624.anIntArray8121[i_57_]] = 0;
			l ^= 0xffffffffL;
		    } else {
			is_51_[class624.anInt8125 * 964526417]
			    = class190.anInt2152 * 661760407 | 0x40000000;
			for (int i_58_ = 0;
			     i_58_ < class624.anIntArray8121.length; i_58_++)
			    is_51_[class624.anIntArray8121[i_58_]] = 0;
			l ^= (long) is_51_[964526417 * class624.anInt8125];
		    }
		}
	    }
	}
	boolean bool_59_ = false;
	int i_60_ = class690s != null ? class690s.length : 0;
	for (int i_61_ = 0; i_61_ < i_60_; i_61_++) {
	    if (class690s[i_61_] != null) {
		i_50_ |= class690s[i_61_].method8078(553074945);
		bool_59_ = true;
	    }
	}
	if (null != class690) {
	    i_50_ |= class690.method8078(2103200080);
	    bool_59_ = true;
	}
	if (class690_47_ != null) {
	    i_50_ |= class690_47_.method8078(998571271);
	    bool_59_ = true;
	}
	boolean bool_62_ = false;
	if (is != null) {
	    for (int i_63_ = 0; i_63_ < is.length; i_63_++) {
		if (is[i_63_] != -1) {
		    i_50_ |= 0x20;
		    bool_62_ = true;
		}
	    }
	}
	Class157 class157;
	synchronized (aClass186_7972) {
	    class157 = (Class157) aClass186_7972.method2727(l);
	}
	RenderType renderType = null;
	if (((PlayerModel) this).anInt7962 * -2066333261 != -1)
	    renderType = ((RenderType)
			class5_sub14.method63((-2066333261
					       * ((PlayerModel) this).anInt7962),
					      265589100));
	if (null == class157
	    || class173.method2245(class157.method1874(), i_50_) != 0) {
	    if (null != class157)
		i_50_ = class173.method2366(i_50_, class157.method1874());
	    int i_64_ = i_50_;
	    boolean bool_65_ = false;
	    for (int i_66_ = 0; i_66_ < is_51_.length; i_66_++) {
		int i_67_ = is_51_[i_66_];
		ItemStyleOverride itemStyleOverride = null;
		boolean bool_68_ = false;
		if (bool_52_) {
		    if (i_66_ == -635588361 * class624.anInt8127)
			bool_68_ = true;
		    else {
			for (int i_69_ = 0;
			     i_69_ < class624.anIntArray8126.length; i_69_++) {
			    if (class624.anIntArray8126[i_69_] == i_66_) {
				bool_68_ = true;
				break;
			    }
			}
		    }
		}
		if (bool_53_) {
		    if (i_66_ == 964526417 * class624.anInt8125)
			bool_68_ = true;
		    else {
			for (int i_70_ = 0;
			     i_70_ < class624.anIntArray8121.length; i_70_++) {
			    if (i_66_ == class624.anIntArray8121[i_70_]) {
				bool_68_ = true;
				break;
			    }
			}
		    }
		}
		if ((i_67_ & 0x40000000) != 0) {
		    if (!bool_68_ && ((PlayerModel) this).aClass4Array7963 != null
			&& ((PlayerModel) this).aClass4Array7963[i_66_] != null)
			itemStyleOverride = ((PlayerModel) this).aClass4Array7963[i_66_];
		    if (!((ItemType) class5_sub13.method63(i_67_ & 0x3fffffff,
							 1432540520))
			     .method511(aBool7967, itemStyleOverride, -1828652472))
			bool_65_ = true;
		} else if ((i_67_ & ~0x7fffffff) != 0
			   && !((Class282)
				class5_sub7.method63(i_67_ & 0x3fffffff,
						     783282822))
				   .method3744(-1970957856))
		    bool_65_ = true;
	    }
	    if (bool_65_) {
		if (((PlayerModel) this).aLong7970 * -8198917926296401495L
		    != -1L) {
		    synchronized (aClass186_7972) {
			class157 = (Class157) (aClass186_7972.method2727
					       (((PlayerModel) this).aLong7970
						* -8198917926296401495L));
		    }
		}
		if (class157 == null
		    || class173.method2245(class157.method1874(), i_50_) != 0)
		    return null;
	    } else {
		Class177[] class177s = new Class177[is_51_.length];
		for (int i_71_ = 0; i_71_ < is_51_.length; i_71_++) {
		    int i_72_ = is_51_[i_71_];
		    ItemStyleOverride itemStyleOverride = null;
		    boolean bool_73_
			= 5 == i_71_ && bool_52_ || i_71_ == 3 && bool_53_;
		    if (0 != (i_72_ & 0x40000000)) {
			if (!bool_73_
			    && null != ((PlayerModel) this).aClass4Array7963
			    && (null
				!= ((PlayerModel) this).aClass4Array7963[i_71_]))
			    itemStyleOverride = ((PlayerModel) this).aClass4Array7963[i_71_];
			Class177 class177
			    = ((ItemType)
			       class5_sub13.method63(i_72_ & 0x3fffffff,
						     2117970282))
				  .method519(aBool7967, itemStyleOverride, -935032143);
			if (null != class177)
			    class177s[i_71_] = class177;
		    } else if (0 != (i_72_ & ~0x7fffffff)) {
			Class177 class177
			    = ((Class282)
			       class5_sub7.method63(i_72_ & 0x3fffffff,
						    -1639895580))
				  .method3747((short) 15);
			if (class177 != null)
			    class177s[i_71_] = class177;
		    }
		}
		if (renderType != null && renderType.anIntArrayArray7678 != null) {
		    for (int i_74_ = 0;
			 i_74_ < renderType.anIntArrayArray7678.length;
			 i_74_++) {
			if (null != class177s[i_74_]) {
			    int i_75_ = 0;
			    int i_76_ = 0;
			    int i_77_ = 0;
			    int i_78_ = 0;
			    int i_79_ = 0;
			    int i_80_ = 0;
			    if (renderType.anIntArrayArray7678[i_74_] != null) {
				i_75_ = renderType.anIntArrayArray7678[i_74_][0];
				i_76_ = renderType.anIntArrayArray7678[i_74_][1];
				i_77_ = renderType.anIntArrayArray7678[i_74_][2];
				i_78_ = (renderType.anIntArrayArray7678[i_74_][3]
					 << 3);
				i_79_ = (renderType.anIntArrayArray7678[i_74_][4]
					 << 3);
				i_80_ = (renderType.anIntArrayArray7678[i_74_][5]
					 << 3);
			    }
			    if (0 != i_78_ || 0 != i_79_ || i_80_ != 0)
				class177s[i_74_].method2578(i_78_, i_79_,
							    i_80_);
			    if (0 != i_75_ || 0 != i_76_ || i_77_ != 0)
				class177s[i_74_].method2572(i_75_, i_76_,
							    i_77_);
			}
		    }
		}
		Class177 class177 = new Class177(class177s, class177s.length);
		i_64_ |= 0x4000;
		class157
		    = class173.method2244(class177, i_64_,
					  Class570.anInt7558 * -1318734145, 64,
					  850);
		for (int i_81_ = 0; i_81_ < 10; i_81_++) {
		    for (int i_82_ = 0;
			 i_82_ < Class590.aShortArrayArray7735[i_81_].length;
			 i_82_++) {
			if (anIntArray7965[i_81_]
			    < (Class73.aShortArrayArrayArray782[i_81_]
			       [i_82_]).length)
			    class157.method1914((Class590.aShortArrayArray7735
						 [i_81_][i_82_]),
						(Class73
						 .aShortArrayArrayArray782
						 [i_81_][i_82_]
						 [anIntArray7965[i_81_]]));
		    }
		}
		for (int i_83_ = 0; i_83_ < 10; i_83_++) {
		    for (int i_84_ = 0;
			 i_84_ < Class439.aShortArrayArray4897[i_83_].length;
			 i_84_++) {
			if (anIntArray7957[i_83_]
			    < (Class101.aShortArrayArrayArray1287[i_83_]
			       [i_84_]).length)
			    class157.method1916((Class439.aShortArrayArray4897
						 [i_83_][i_84_]),
						(Class101
						 .aShortArrayArrayArray1287
						 [i_83_][i_84_]
						 [anIntArray7957[i_83_]]));
		    }
		}
		class157.method1909();
		if (bool) {
		    class157.method1873(i_50_);
		    synchronized (aClass186_7972) {
			aClass186_7972.method2729(class157, l);
		    }
		    ((PlayerModel) this).aLong7970 = l * -6112664595778803047L;
		}
	    }
	}
	Class157 class157_85_ = class157.method1951((byte) 4, i_50_, true);
	if (!bool_59_ && !bool_62_)
	    return class157_85_;
	Class433[] class433s = null;
	if (null != renderType)
	    class433s = renderType.method6982(382624735);
	if (bool_62_ && class433s != null) {
	    for (int i_86_ = 0; i_86_ < is.length; i_86_++) {
		if (null != class433s[i_86_])
		    class157_85_.method2005(class433s[i_86_], 1 << i_86_,
					    true);
	    }
	}
	int i_87_ = 0;
	int i_88_ = 1;
	while (i_87_ < i_60_) {
	    if (class690s[i_87_] != null)
		class690s[i_87_].method8093(class157_85_, 0, i_88_,
					    -1041765858);
	    i_87_++;
	    i_88_ <<= 1;
	}
	if (bool_62_) {
	    for (i_87_ = 0; i_87_ < is.length; i_87_++) {
		if (is[i_87_] != -1) {
		    i_88_ = is[i_87_] - i_48_;
		    i_88_ &= 0x3fff;
		    Class433 class433 = new Class433();
		    class433.method5224(0.0F, 1.0F, 0.0F,
					Class417.method4970(i_88_));
		    class157_85_.method2005(class433, 1 << i_87_, false);
		}
	    }
	}
	if (bool_62_ && null != class433s) {
	    for (i_87_ = 0; i_87_ < is.length; i_87_++) {
		if (class433s[i_87_] != null)
		    class157_85_.method2005(class433s[i_87_], 1 << i_87_,
					    false);
	    }
	}
	if (null != class690 && null != class690_47_)
	    Class283.method3834(class157_85_, class690, class690_47_,
				1375190342);
	else if (class690 != null)
	    class690.method8079(class157_85_, 0, -1277641294);
	else if (null != class690_47_)
	    class690_47_.method8079(class157_85_, 0, -748094477);
	return class157_85_;
    }
    
    public static int method7288() {
	synchronized (aClass186_7972) {
	    int i = aClass186_7972.method2734(-782210430);
	    return i;
	}
    }
    
    public void method7289(int i, int i_89_, Class5_Sub13 class5_sub13,
			   int i_90_) {
	if (-1 == i_89_)
	    ((PlayerModel) this).anIntArray7955[i] = 0;
	else if (class5_sub13.method63(i_89_, -1361751346) != null) {
	    ((PlayerModel) this).anIntArray7955[i] = i_89_ | 0x40000000;
	    method7276(2094847763);
	}
    }
    
    public static void method7290(int i) {
	Class570.anInt7558 = -1961313985 * i;
	synchronized (aClass186_7971) {
	    aClass186_7971.method2731(-957718462);
	}
	synchronized (aClass186_7972) {
	    aClass186_7972.method2731(-1174100721);
	}
    }
    
    public static void method7291() {
	synchronized (aClass186_7972) {
	    aClass186_7972.method2731(-1935560530);
	}
	synchronized (aClass186_7971) {
	    aClass186_7971.method2731(-1728808127);
	}
    }
    
    public static void method7292() {
	synchronized (aClass186_7972) {
	    aClass186_7972.method2731(-1042527337);
	}
	synchronized (aClass186_7971) {
	    aClass186_7971.method2731(-1937056764);
	}
    }
    
    public static void method7293() {
	synchronized (aClass186_7972) {
	    aClass186_7972.method2731(-1175444234);
	}
	synchronized (aClass186_7971) {
	    aClass186_7971.method2731(-1043433233);
	}
    }
    
    public static void method7294(int i) {
	synchronized (aClass186_7972) {
	    aClass186_7972.method2747(i, -1295641571);
	}
	synchronized (aClass186_7971) {
	    aClass186_7971.method2747(i, -1692838108);
	}
    }
    
    public static void method7295(int i) {
	synchronized (aClass186_7972) {
	    aClass186_7972.method2747(i, -766727823);
	}
	synchronized (aClass186_7971) {
	    aClass186_7971.method2747(i, -807546753);
	}
    }
    
    static final void method7296(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_91_ = (((Class648) class648).anIntArray8394
		     [((Class648) class648).anInt8395 * 717927929]);
	int i_92_ = (((Class648) class648).anIntArray8394
		     [1 + ((Class648) class648).anInt8395 * 717927929]);
	Class528_Sub21_Sub6 class528_sub21_sub6
	    = Class196.aClass447_2200.method5401(i_91_, -438432000);
	int i_93_ = class528_sub21_sub6.anIntArray11541[i_92_];
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = i_93_;
    }
    
    static final void method7297(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub1_10571
		  .method9538((byte) -64);
    }
    
    static void method7298(int i) {
	for (int i_94_ = 0; i_94_ < 102; i_94_++)
	    client.aBoolArray10855[i_94_] = true;
    }
    
    public static final void method7299(String string, int i) {
	if (null != string) {
	    String string_95_
		= Class487.method5889(string, Class688.aClass77_8657,
				      (byte) -22);
	    if (string_95_ != null) {
		for (int i_96_ = 0; i_96_ < -1314218023 * client.anInt11157;
		     i_96_++) {
		    Class62 class62 = client.aClass62Array11160[i_96_];
		    String string_97_ = class62.aString720;
		    String string_98_
			= Class487.method5889(string_97_,
					      Class688.aClass77_8657,
					      (byte) -23);
		    if (Class27.method721(string, string_95_, string_97_,
					  string_98_, (byte) 70)) {
			client.anInt11157 -= 600961129;
			for (int i_99_ = i_96_;
			     i_99_ < -1314218023 * client.anInt11157; i_99_++)
			    client.aClass62Array11160[i_99_]
				= client.aClass62Array11160[1 + i_99_];
			client.anInt11166 = client.anInt11018 * -943047031;
			Class109 class109 = Class591.method7078((byte) 125);
			Class528_Sub34 class528_sub34
			    = Class656.method7845(OutgoingOpcode.aClass403_4545,
						  class109.aClass10_1379,
						  -2012397066);
			class528_sub34.aClass528_Sub42_Sub2_10481.writeByte
			    (Class14.method627(string, -523841808),
			     (byte) -19);
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .writeString(string, -1936289654);
			class109.method1380(class528_sub34, 1399081357);
			break;
		    }
		}
	    }
	}
    }
    
    public static int method7300(int i, int i_100_, byte i_101_) {
	i_100_ = (i & 0x7f) * i_100_ >> 7;
	if (i_100_ < 2)
	    i_100_ = 2;
	else if (i_100_ > 126)
	    i_100_ = 126;
	return (i & 0xff80) + i_100_;
    }
    
    static void method7301(int i, int i_102_, int[] is, int[] is_103_,
			   float[] fs, float[] fs_104_, int i_105_, int i_106_,
			   int i_107_, int i_108_, int i_109_, int i_110_,
			   int i_111_) {
	int i_112_ = i_106_ * i + i_105_;
	int i_113_ = i_102_ * i_108_ + i_107_;
	int i_114_ = i - i_109_;
	int i_115_ = i_102_ - i_109_;
	if (is == null) {
	    for (int i_116_ = 0; i_116_ < i_110_; i_116_++) {
		int i_117_ = i_112_ + i_109_;
		while (i_112_ < i_117_)
		    fs_104_[i_113_++] = fs[i_112_++];
		i_112_ += i_114_;
		i_113_ += i_115_;
	    }
	} else if (null == fs) {
	    for (int i_118_ = 0; i_118_ < i_110_; i_118_++) {
		int i_119_ = i_109_ + i_112_;
		while (i_112_ < i_119_)
		    is_103_[i_113_++] = is[i_112_++];
		i_112_ += i_114_;
		i_113_ += i_115_;
	    }
	} else {
	    for (int i_120_ = 0; i_120_ < i_110_; i_120_++) {
		int i_121_ = i_112_ + i_109_;
		while (i_112_ < i_121_) {
		    is_103_[i_113_] = is[i_112_];
		    fs_104_[i_113_++] = fs[i_112_++];
		}
		i_112_ += i_114_;
		i_113_ += i_115_;
	    }
	}
    }
}
