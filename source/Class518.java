/* Class518 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class Class518
{
    public static int anInt6972;
    protected static int anInt6973;
    static byte[] aByteArray6974;
    protected static Class5_Sub6 aClass5_Sub6_6975;
    protected static Class5_Sub16 aClass5_Sub16_6976;
    protected static IMultiVarValueReader anInterface18_6977;
    protected static IMultiVarDefinitionsLoader anInterface15_6978;
    public static Class615 aClass615_6979;
    static Class5_Sub11 aClass5_Sub11_6980;
    static Class446 aClass446_6981;
    protected static int anInt6982;
    static Class692 aClass692_6983 = new Class692(16);
    static int[] anIntArray6984;
    protected static int anInt6985;
    static int[][] anIntArrayArray6986;
    protected static int anInt6987;
    static int[] anIntArray6988;
    static byte[] aByteArray6989;
    protected static boolean aBool6990;
    public static float aFloat6991;
    protected static Class533 aClass533_6992;
    protected static Class688 aClass688_6993;
    protected static Class186 aClass186_6994;
    public static int anInt6995;
    static boolean[] aBoolArray6996;
    protected static int anInt6997;
    protected static byte[][][] aByteArrayArrayArray6998;
    static short[] aShortArray6999;
    static Object[] anObjectArray7000;
    static short[] aShortArray7001;
    static short[] aShortArray7002;
    static ArrayList anArrayList7003;
    protected static int anInt7004 = (int) (Math.random() * 11.0) - 5;
    static byte[] aByteArray7005;
    protected static Class446 aClass446_7006;
    protected static boolean aBool7007;
    static HashMap[][][] aHashMapArrayArrayArray7008;
    protected static int anInt7009;
    static int anInt7010;
    static int anInt7011;
    static int anInt7012;
    static int anInt7013;
    static int anInt7014;
    static int anInt7015;
    static int anInt7016;
    public static Class528_Sub21_Sub17 aClass528_Sub21_Sub17_7017;
    protected static Class186 aClass186_7018;
    protected static int anInt7019;
    static Class5_Sub18 aClass5_Sub18_7020;
    static final int anInt7021 = 64;
    static int[] anIntArray7022;
    public static float aFloat7023;
    static byte[] aByteArray7024;
    protected static int anInt7025;
    static int anInt7026;
    static ByteBuffer aClass528_Sub42_7027;
    protected static Class186 aClass186_7028;
    static int anInt7029;
    static int[] anIntArray7030;
    static int[] anIntArray7031;
    protected static Class5_Sub15 aClass5_Sub15_7032;
    protected static int anInt7033;
    protected static int anInt7034;
    protected static int anInt7035;
    protected static int anInt7036;
    protected static int anInt7037;
    static boolean[][] aBoolArrayArray7038;
    static int anInt7039;
    static int anInt7040;
    static int anInt7041;
    static ByteBuffer aClass528_Sub42_7042;
    
    static void method6284(Class173 class173, boolean bool, boolean bool_0_,
			   int i, int i_1_, int i_2_, int i_3_,
			   boolean bool_4_, boolean bool_5_) {
	int i_6_ = anInt7034 - anInt6973;
	int i_7_ = anInt7033 - anInt7035;
	if (anInt7034 < anInt6982)
	    i_6_++;
	if (anInt7033 < anInt6997)
	    i_7_++;
	int i_8_ = anInt6973 / 64;
	int i_9_ = anInt7035 / 64;
	int i_10_ = (anInt6973 + i_6_) / 64;
	int i_11_ = (anInt7035 + i_7_) / 64;
	int i_12_;
	int i_13_;
	if (bool_5_) {
	    i_12_ = (anInt7009 - anInt7036) / ((anInt7034 - anInt6973) / 64);
	    i_13_ = i_12_;
	} else {
	    i_12_ = method6307();
	    i_13_ = (int) Math.ceil((double) (64.0F * aFloat7023 / 2.0F));
	}
	anArrayList7003.clear();
	int i_14_ = 0;
	int i_15_ = i_12_ * i_12_;
	for (int i_16_ = i_8_; i_16_ <= i_10_; i_16_++) {
	    for (int i_17_ = i_9_; i_17_ <= i_11_; i_17_++) {
		int i_18_ = (i_16_ << 16) + i_17_;
		int i_19_ = method6333((long) i_18_);
		if (i_19_ != i_12_) {
		    if (i_16_ < 0 || i_16_ * 64 >= anInt6982 || i_17_ < 0
			|| i_17_ * 64 >= anInt6997)
			method6298(class173, i_16_, i_17_, i_12_, i_18_);
		    else if (i_19_ == -1) {
			method6318(i_16_, i_17_, i_12_, i_18_, bool, bool_0_,
				   bool_4_, class173);
			i_14_ += i_15_;
		    } else
			anArrayList7003.add(Integer.valueOf(i_18_));
		}
	    }
	}
	if (!anArrayList7003.isEmpty() && i_14_ < anInt7039) {
	    for (Iterator iterator = anArrayList7003.iterator();
		 i_14_ < anInt7039 && iterator.hasNext(); i_14_ += i_15_) {
		int i_20_ = ((Integer) iterator.next()).intValue();
		int i_21_ = i_20_ >> 16 & 0xffff;
		int i_22_ = i_20_ & 0xffff;
		method6318(i_21_, i_22_, i_12_, i_20_, bool, bool_0_, bool_4_,
			   class173);
	    }
	}
	for (int i_23_ = i_8_; i_23_ <= i_10_; i_23_++) {
	    int i_24_ = i_23_ * 64;
	    int i_25_ = i_24_ - anInt6973;
	    int i_26_ = i_13_;
	    int i_27_ = (i_2_ + i * i_25_ >> 16) + anInt7036;
	    int i_28_ = (i_2_ + i * (i_25_ + 64) >> 16) + anInt7036;
	    if (i_27_ + i_26_ != i_28_)
		i_26_ = i_28_ - i_27_;
	    for (int i_29_ = i_9_; i_29_ <= i_11_; i_29_++) {
		int i_30_ = i_29_ * 64;
		int i_31_ = i_30_ - anInt7035;
		int i_32_ = (i_23_ << 16) + i_29_;
		int i_33_ = i_13_;
		int i_34_ = anInt7019 - (i_3_ + i_1_ * i_31_ >> 16);
		int i_35_ = anInt7019 - (i_3_ + i_1_ * (i_31_ + 64) >> 16);
		if (i_34_ - i_33_ != i_35_)
		    i_33_ = i_34_ - i_35_;
		i_34_ -= i_33_;
		Class151 class151
		    = (Class151) aClass186_6994.method2727((long) i_32_);
		if (class151 == null)
		    throw new RuntimeException();
		if (class151.method1766() == i_26_
		    && class151.method1767() == i_33_)
		    class151.method1773(i_27_, i_34_);
		else
		    class151.method1774(i_27_, i_34_, i_26_, i_33_);
	    }
	}
    }
    
    static boolean method6285(int i, int i_36_) {
	int i_37_ = i >> 3;
	int i_38_ = i_36_ >> 3;
	if (i_37_ < 0 || i_38_ < 0 || i_37_ >= aBoolArrayArray7038.length
	    || i_38_ >= aBoolArrayArray7038[i_37_].length)
	    return false;
	return aBoolArrayArray7038[i_37_][i_38_];
    }
    
    static void method6286() {
	aShortArray6999 = new short[anInt6982 * anInt6997];
	aShortArray7002 = new short[anInt6982 * anInt6997];
	aByteArray7005 = new byte[anInt6982 * anInt6997];
	anObjectArray7000 = new Object[anInt6982 * anInt6997];
	aByteArray6974 = new byte[anInt6982 * anInt6997];
	aHashMapArrayArrayArray7008
	    = new HashMap[3][anInt6982 >> 6][anInt6997 >> 6];
	anIntArray7022
	    = new int[aClass5_Sub11_6980.anInt116 * -1906415229 + 1];
	aBoolArrayArray7038 = new boolean[anInt6982 / 8][anInt6997 / 8];
    }
    
    static void method6287() {
	aShortArray6999 = null;
	aByteArray7024 = null;
	aShortArray7001 = null;
	aShortArray7002 = null;
	aByteArray7005 = null;
	anObjectArray7000 = null;
	aByteArray6974 = null;
	aHashMapArrayArrayArray7008 = null;
	anIntArray7022 = null;
	aBoolArrayArray7038 = null;
    }
    
    static void method6288(int i) {
	Class528_Sub21_Sub17 class528_sub21_sub17
	    = (Class528_Sub21_Sub17) aClass692_6983.method8137((long) i);
	if (class528_sub21_sub17 != null
	    && class528_sub21_sub17 != aClass528_Sub21_Sub17_7017) {
	    aClass528_Sub21_Sub17_7017 = class528_sub21_sub17;
	    aBool6990 = (aClass528_Sub21_Sub17_7017.anInt11644 * 2000200341
			 == aClass615_6979.anInt8023 * 1905168445);
	}
    }
    
    static void method6289(Class173 class173, boolean bool, boolean bool_39_,
			   boolean bool_40_, boolean bool_41_) {
	int i = anInt7034 - anInt6973;
	int i_42_ = anInt7033 - anInt7035;
	int i_43_ = (anInt7009 - anInt7036 << 16) / i;
	int i_44_ = (anInt7019 - anInt7037 << 16) / i_42_;
	method6284(class173, bool, bool_39_, i_43_, i_44_, 0, 0, bool_40_,
		   bool_41_);
    }
    
    public static Class528_Sub21_Sub17 method6290(int i, int i_45_) {
	for (Class528_Sub21_Sub17 class528_sub21_sub17
		 = ((Class528_Sub21_Sub17)
		    aClass692_6983.method8146(-1942855841));
	     class528_sub21_sub17 != null;
	     class528_sub21_sub17 = ((Class528_Sub21_Sub17)
				     aClass692_6983.method8138(1930961083))) {
	    if (((Class528_Sub21_Sub17) class528_sub21_sub17).aBool11647
		&& class528_sub21_sub17.method10583(i, i_45_, -1267535992))
		return class528_sub21_sub17;
	}
	return null;
    }
    
    public static Class528_Sub21_Sub17 method6291(int i) {
	return (Class528_Sub21_Sub17) aClass692_6983.method8137((long) i);
    }
    
    static void method6292(int[] is, int i, int i_46_, int i_47_, int i_48_,
			   int i_49_, int i_50_) {
	for (int i_51_ = 0; i_51_ < aClass615_6979.anInt8027 * 419427269;
	     i_51_++) {
	    int i_52_ = i_51_;
	    if (i_50_ == anInt7010 || i_50_ == anInt7012)
		i_52_ = aClass615_6979.anInt8027 * 419427269 - i_51_ - 1;
	    for (int i_53_ = 0; i_53_ < aClass615_6979.anInt8027 * 419427269;
		 i_53_++) {
		int i_54_ = i_53_;
		if (i_50_ == anInt7012 || i_50_ == anInt7014)
		    i_54_ = aClass615_6979.anInt8027 * 419427269 - i_53_ - 1;
		int i_55_ = anIntArrayArray6986[i_52_][i_54_];
		if (i_55_ != 0) {
		    if (i_55_ == 1) {
			int i_56_ = is[((i_47_ - i_46_ - i_53_ - 1) * i_47_ + i
					+ i_51_)];
			if (i_56_ != anInt7040) {
			    anInt7040 = i_56_;
			    anInt7041
				= (~0xffffff
				   | ((((aClass615_6979.anInt8018 * -1889554731
					 & 0xff00ff) * i_48_
					+ (i_56_ & 0xff00ff) * i_49_)
				       & ~0xff00ff)
				      + ((((aClass615_6979.anInt8018
					    * -1889554731)
					   & 0xff00) * i_48_
					  + (i_56_ & 0xff00) * i_49_)
					 & 0xff0000)) >> 8);
			}
			is[(i_47_ - i_46_ - i_53_ - 1) * i_47_ + i + i_51_]
			    = anInt7041;
		    } else if (i_55_ == 2)
			is[(i_47_ - i_46_ - i_53_ - 1) * i_47_ + i + i_51_]
			    = aClass615_6979.anInt8025 * 217061563;
		}
	    }
	}
    }
    
    static int method6293(Class165 class165, int i, int i_57_, int i_58_) {
	return method6294(aClass5_Sub11_6980, class165, i, i_57_, i_58_);
    }
    
    static int method6294(Interface12 interface12, Class165 class165, int i,
			  int i_59_, int i_60_) {
	Class636 class636 = (Class636) interface12.method63(i, -530371870);
	if (class636 == null)
	    return 0;
	int i_61_ = class636.anInt8228 * 1038388161;
	if (i_61_ >= 0 && class165.method2093(i_61_, (byte) -94).aBool1800)
	    i_61_ = -1;
	int i_62_;
	if (class636.anInt8233 * -685171829 >= 0) {
	    int i_63_ = class636.anInt8233 * -685171829;
	    int i_64_ = (i_63_ & 0x7f) + i_60_;
	    if (i_64_ < 0)
		i_64_ = 0;
	    else if (i_64_ > 127)
		i_64_ = 127;
	    int i_65_ = (i_63_ + i_59_ & 0xfc00) + (i_63_ & 0x380) + i_64_;
	    i_62_ = (~0xffffff
		     | (Class72.anIntArray777
			[Class516.method6283(Class585.method6998(i_65_, 96,
								 (byte) -71),
					     515814180) & 0xffff]));
	} else if (i_61_ >= 0)
	    i_62_
		= (~0xffffff
		   | (Class72.anIntArray777
		      [Class516.method6283(Class585.method6998((class165
								    .method2093
								(i_61_,
								 (byte) -68)
								.aShort1804),
							       96, (byte) -12),
					   515814180) & 0xffff]));
	else if (class636.anInt8230 * 491679725 == -1)
	    i_62_ = 0;
	else {
	    int i_66_ = class636.anInt8230 * 491679725;
	    int i_67_ = (i_66_ & 0x7f) + i_60_;
	    if (i_67_ < 0)
		i_67_ = 0;
	    else if (i_67_ > 127)
		i_67_ = 127;
	    int i_68_ = (i_66_ + i_59_ & 0xfc00) + (i_66_ & 0x380) + i_67_;
	    i_62_ = (~0xffffff
		     | (Class72.anIntArray777
			[Class516.method6283(Class585.method6998(i_68_, 96,
								 (byte) -31),
					     515814180) & 0xffff]));
	}
	return i_62_;
    }
    
    static void method6295() {
	for (int i = 0; i < anInt6982; i++) {
	    for (int i_69_ = 0; i_69_ < anInt6997; i_69_++) {
		Object object = anObjectArray7000[i + i_69_ * anInt6982];
		if (object != null) {
		    if (object instanceof Class528_Sub13) {
			Class528_Sub13 class528_sub13
			    = (Class528_Sub13) object;
			if (class528_sub13 != null) {
			    for (int i_70_ = 0;
				 i_70_ < (((Class528_Sub13) class528_sub13)
					  .anIntArray10353).length;
				 i_70_++) {
				Class596 class596
				    = ((Class596)
				       (aClass5_Sub15_7032.method63
					((((Class528_Sub13) class528_sub13)
					  .anIntArray10353[i_70_]),
					 -896164662)));
				int i_71_ = class596.anInt7777 * 667283375;
				if (class596.anIntArray7767 != null) {
				    class596
					= (class596.method7099
					   (anInterface15_6978,
					    anInterface18_6977, 1583881480));
				    if (class596 != null)
					i_71_ = class596.anInt7777 * 667283375;
				}
				if (i_71_ != -1) {
				    Class528_Sub25 class528_sub25
					= new Class528_Sub25(i_71_);
				    class528_sub25.anInt10424 = i * 1722731049;
				    class528_sub25.anInt10423
					= i_69_ * 1851578459;
				    aClass688_6993.method8031(class528_sub25,
							      (byte) 44);
				}
			    }
			}
		    } else {
			Integer integer = (Integer) object;
			Class596 class596
			    = ((Class596)
			       aClass5_Sub15_7032.method63(integer.intValue(),
							   132252278));
			int i_72_ = class596.anInt7777 * 667283375;
			if (class596.anIntArray7767 != null) {
			    class596 = class596.method7099(anInterface15_6978,
							   anInterface18_6977,
							   1432525679);
			    if (class596 != null)
				i_72_ = class596.anInt7777 * 667283375;
			}
			if (i_72_ != -1) {
			    Class528_Sub25 class528_sub25
				= new Class528_Sub25(i_72_);
			    class528_sub25.anInt10424 = i * 1722731049;
			    class528_sub25.anInt10423 = i_69_ * 1851578459;
			    aClass688_6993.method8031(class528_sub25,
						      (byte) 32);
			}
		    }
		}
	    }
	}
	for (int i = 0; i < 3; i++) {
	    for (int i_73_ = 0; i_73_ < aHashMapArrayArrayArray7008[0].length;
		 i_73_++) {
		for (int i_74_ = 0;
		     i_74_ < aHashMapArrayArrayArray7008[0][0].length;
		     i_74_++) {
		    HashMap hashmap
			= aHashMapArrayArrayArray7008[i][i_73_][i_74_];
		    if (hashmap != null) {
			Iterator iterator = hashmap.values().iterator();
			while (iterator.hasNext()) {
			    Class536 class536 = (Class536) iterator.next();
			    if (((Class536) class536).anIntArray7145 != null) {
				for (int i_75_ = 0;
				     i_75_ < (((Class536) class536)
					      .anIntArray7145).length;
				     i_75_++) {
				    Class596 class596
					= ((Class596)
					   (aClass5_Sub15_7032.method63
					    ((((Class536) class536)
					      .anIntArray7145[i_75_]),
					     345158207)));
				    int i_76_ = class596.anInt7777 * 667283375;
				    if (class596.anIntArray7767 != null) {
					class596 = (class596.method7099
						    (anInterface15_6978,
						     anInterface18_6977,
						     1718239965));
					if (class596 != null)
					    i_76_ = (class596.anInt7777
						     * 667283375);
				    }
				    if (i_76_ != -1) {
					Class528_Sub25 class528_sub25
					    = new Class528_Sub25(i_76_);
					class528_sub25.anInt10424
					    = ((i_73_ + (anInt6972 >> 6)) * 64
					       + (((Class536) class536)
						  .aByte7143)
					       - anInt6972) * 1722731049;
					class528_sub25.anInt10423
					    = ((i_74_ + (anInt6995 >> 6)) * 64
					       + (((Class536) class536)
						  .aByte7141)
					       - anInt6995) * 1851578459;
					aClass688_6993.method8031
					    (class528_sub25, (byte) -34);
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    static void method6296() {
	int[] is = new int[3];
	for (int i = 0; i < aClass533_6992.anInt7130 * -595383187; i++) {
	    boolean bool
		= (aClass528_Sub21_Sub17_7017.method10589
		   (aClass533_6992.anIntArray7129[i] >> 28 & 0x3,
		    aClass533_6992.anIntArray7129[i] >> 14 & 0x3fff,
		    aClass533_6992.anIntArray7129[i] & 0x3fff, is, (byte) 50));
	    if (bool) {
		Class528_Sub25 class528_sub25
		    = new Class528_Sub25(aClass533_6992.anIntArray7131[i]);
		class528_sub25.anInt10424 = (is[1] - anInt6972) * 1722731049;
		class528_sub25.anInt10423 = (is[2] - anInt6995) * 1851578459;
		aClass688_6993.method8031(class528_sub25, (byte) -62);
	    }
	}
    }
    
    Class518() throws Throwable {
	throw new Error();
    }
    
    static void method6297(int[] is, int i, int i_77_, int i_78_, int i_79_,
			   int i_80_, int i_81_) {
	for (int i_82_ = i; i_82_ <= i_77_; i_82_++) {
	    for (int i_83_ = i_78_; i_83_ <= i_79_; i_83_++)
		is[(i_80_ - i_83_ - 1) * i_80_ + i_82_] = i_81_;
	}
    }
    
    static void method6298(Class173 class173, int i, int i_84_, int i_85_,
			   int i_86_) {
	Class151 class151 = (Class151) aClass186_6994.method2727(-1L);
	if (class151 == null || class151.method1766() != i_85_) {
	    int i_87_;
	    if ((((Class528_Sub21_Sub17) aClass528_Sub21_Sub17_7017).anInt11641
		 * -913658145)
		!= -1)
		i_87_ = (~0xffffff
			 | (((Class528_Sub21_Sub17) aClass528_Sub21_Sub17_7017)
			    .anInt11641) * -913658145);
	    else
		i_87_ = -16777216;
	    if (anIntArray6984 == null
		|| anIntArray6984.length != i_85_ * i_85_)
		anIntArray6984 = new int[i_85_ * i_85_];
	    Arrays.fill(anIntArray6984, i_87_);
	    class151 = class173.method2382(anIntArray6984, 0, i_85_, i_85_,
					   i_85_, true);
	    aClass186_6994.method2729(class151, -1L);
	}
	aClass186_6994.method2729(class151, (long) i_86_);
    }
    
    static void method6299(int i) {
	Class528_Sub21_Sub17 class528_sub21_sub17
	    = (Class528_Sub21_Sub17) aClass692_6983.method8137((long) i);
	if (class528_sub21_sub17 != null
	    && class528_sub21_sub17 != aClass528_Sub21_Sub17_7017) {
	    aClass528_Sub21_Sub17_7017 = class528_sub21_sub17;
	    aBool6990 = (aClass528_Sub21_Sub17_7017.anInt11644 * 2000200341
			 == aClass615_6979.anInt8023 * 1905168445);
	}
    }
    
    static void method6300(int[] is, int i, int i_88_, int i_89_, int i_90_,
			   int i_91_, boolean bool, int i_92_, int i_93_,
			   int i_94_, int[] is_95_, byte[] is_96_,
			   boolean bool_97_) {
	if (bool_97_ || i_92_ != 0 || i_93_ > 0) {
	    if (i_93_ == 0)
		method6297(is, i, i_88_, i_89_, i_90_, i_91_,
			   i_92_ | ~0xffffff);
	    else {
		int i_98_ = i_94_ & 0x3f;
		if (i_98_ == 0 || anInt6987 == 0) {
		    int i_99_ = anIntArray7022[i_93_];
		    if (bool_97_ || i_99_ != 0)
			method6297(is, i, i_88_, i_89_, i_90_, i_91_,
				   i_99_ | ~0xffffff);
		} else {
		    int i_100_ = bool_97_ ? 0 : 1;
		    int i_101_ = Class95.method1258(i_94_ >> 6 & 0x3, i_98_,
						    (short) 25571);
		    i_98_ = Class638.method7584(i_98_, 595353972);
		    method6314(is, i, i_88_, i_89_, i_90_, i_91_, i_92_,
			       anIntArray7022[i_93_],
			       aByteArrayArrayArray6998[i_98_ - 1][i_101_],
			       anInt6987, i_100_);
		}
	    }
	}
	if (bool && is_95_ != null) {
	    int i_102_ = i_88_ - i + 1;
	    int i_103_ = i_90_ - i_89_ + 1;
	    for (int i_104_ = 0; i_104_ < is_95_.length; i_104_++) {
		int i_105_ = is_96_[i_104_] & 0x3f;
		if (i_105_ == Class605.aClass605_7907.anInt7905 * 1922173025
		    || i_105_ == Class605.aClass605_7891.anInt7905 * 1922173025
		    || i_105_ == Class605.aClass605_7911.anInt7905 * 1922173025
		    || (i_105_
			== Class605.aClass605_7909.anInt7905 * 1922173025)) {
		    Class596 class596
			= ((Class596)
			   aClass5_Sub15_7032.method63(is_95_[i_104_],
						       -827496873));
		    if (class596.anInt7801 * 2063502347 == -1) {
			int i_106_ = -3355444;
			if (class596.anInt7785 * 567849393 == 1)
			    i_106_ = -3407872;
			int i_107_ = is_96_[i_104_] >> 6 & 0x3;
			if (i_105_ == (Class605.aClass605_7907.anInt7905
				       * 1922173025)) {
			    if (i_107_ == 0)
				method6316(is, i, i_90_, i_103_, i_91_,
					   i_106_);
			    else if (i_107_ == 1)
				method6315(is, i, i_90_, i_102_, i_91_,
					   i_106_);
			    else if (i_107_ == 2)
				method6316(is, i_88_, i_90_, i_103_, i_91_,
					   i_106_);
			    else
				method6315(is, i, i_89_, i_102_, i_91_,
					   i_106_);
			} else if (i_105_ == (Class605.aClass605_7891.anInt7905
					      * 1922173025)) {
			    if (i_107_ == 0) {
				method6316(is, i, i_90_, i_103_, i_91_, -1);
				method6315(is, i, i_90_, i_102_, i_91_,
					   i_106_);
			    } else if (i_107_ == 1) {
				method6316(is, i_88_, i_90_, i_103_, i_91_,
					   -1);
				method6315(is, i, i_90_, i_102_, i_91_,
					   i_106_);
			    } else if (i_107_ == 2) {
				method6316(is, i_88_, i_90_, i_103_, i_91_,
					   -1);
				method6315(is, i, i_89_, i_102_, i_91_,
					   i_106_);
			    } else {
				method6316(is, i, i_90_, i_103_, i_91_, -1);
				method6315(is, i, i_89_, i_102_, i_91_,
					   i_106_);
			    }
			} else if (i_105_ == (Class605.aClass605_7911.anInt7905
					      * 1922173025)) {
			    if (i_107_ == 0)
				method6315(is, i, i_90_, 1, i_91_, i_106_);
			    else if (i_107_ == 1)
				method6315(is, i_88_, i_90_, 1, i_91_, i_106_);
			    else if (i_107_ == 2)
				method6315(is, i_88_, i_89_, 1, i_91_, i_106_);
			    else
				method6315(is, i, i_89_, 1, i_91_, i_106_);
			} else if (i_105_ == (Class605.aClass605_7909.anInt7905
					      * 1922173025)) {
			    if (i_107_ == 0 || i_107_ == 2) {
				for (int i_108_ = 0; i_108_ < i_103_; i_108_++)
				    method6315(is, i + i_108_, i_89_ + i_108_,
					       1, i_91_, i_106_);
			    } else {
				for (int i_109_ = 0; i_109_ < i_103_; i_109_++)
				    method6315(is, i + i_109_, i_90_ - i_109_,
					       1, i_91_, i_106_);
			    }
			}
		    }
		}
	    }
	}
    }
    
    static void method6301(Class173 class173, int[] is, int i, int i_110_,
			   int i_111_, int i_112_, int i_113_, int i_114_) {
	Object object = anObjectArray7000[i_114_];
	if (object != null) {
	    if (object instanceof Class528_Sub13) {
		Class528_Sub13 class528_sub13 = (Class528_Sub13) object;
		if (class528_sub13 != null)
		    method6332(class173, is, i, i_110_, i_111_,
			       (((Class528_Sub13) class528_sub13)
				.anIntArray10353),
			       (((Class528_Sub13) class528_sub13)
				.aByteArray10354));
	    } else {
		Integer integer = (Integer) object;
		anIntArray6988[0] = integer.intValue();
		aByteArray6989[0]
		    = aByteArray6974[i_112_ + i_113_ * anInt6982];
		method6332(class173, is, i, i_110_, i_111_, anIntArray6988,
			   aByteArray6989);
	    }
	}
    }
    
    static Class688 method6302(Class173 class173) {
	int i = anInt7034 - anInt6973;
	int i_115_ = anInt7033 - anInt7035;
	int i_116_ = (anInt7009 - anInt7036 << 16) / i;
	int i_117_ = (anInt7019 - anInt7037 << 16) / i_115_;
	return method6303(class173, i_116_, i_117_, 0, 0);
    }
    
    static Class688 method6303(Class173 class173, int i, int i_118_,
			       int i_119_, int i_120_) {
	for (Class528_Sub25 class528_sub25
		 = (Class528_Sub25) aClass688_6993.method8034(1427582798);
	     class528_sub25 != null;
	     class528_sub25
		 = (Class528_Sub25) aClass688_6993.method8037(365706242))
	    method6304(class173, class528_sub25, i, i_118_, i_119_, i_120_);
	return aClass688_6993;
    }
    
    static void method6304(Class173 class173, Class528_Sub25 class528_sub25,
			   int i, int i_121_, int i_122_, int i_123_) {
	class528_sub25.anInt10425
	    = (anInt7036
	       + (i_122_ + i * (class528_sub25.anInt10424 * -1196920295
				- anInt6973)
		  >> 16)) * -1376781143;
	class528_sub25.anInt10422
	    = (anInt7019
	       - (i_123_ + i_121_ * (class528_sub25.anInt10423 * 1481938899
				     - anInt7035)
		  >> 16)) * -468655001;
    }
    
    static void method6305(Class173 class173, Class528_Sub25 class528_sub25,
			   Class239 class239) {
	if (class239.anIntArray2632 != null) {
	    int[] is = new int[class239.anIntArray2632.length];
	    for (int i = 0; i < is.length / 2; i++) {
		int i_124_ = (class239.anIntArray2632[i * 2]
			      + class528_sub25.anInt10424 * -1196920295);
		int i_125_ = (class239.anIntArray2632[i * 2 + 1]
			      + class528_sub25.anInt10423 * 1481938899);
		is[i * 2] = anInt7036 + ((anInt7009 - anInt7036)
					 * (i_124_ - anInt6973)
					 / (anInt7034 - anInt6973));
		is[i * 2 + 1] = anInt7019 - ((anInt7019 - anInt7037)
					     * (i_125_ - anInt7035)
					     / (anInt7033 - anInt7035));
	    }
	    Class158.method2049(class173, is, class239.anInt2640 * 892082507);
	    if (class239.anInt2638 * -1459473585 > 0) {
		for (int i = 0; i < is.length / 2 - 1; i++) {
		    int i_126_ = is[i * 2];
		    int i_127_ = is[i * 2 + 1];
		    int i_128_ = is[(i + 1) * 2];
		    int i_129_ = is[(i + 1) * 2 + 1];
		    if (i_128_ < i_126_) {
			int i_130_ = i_126_;
			int i_131_ = i_127_;
			i_126_ = i_128_;
			i_127_ = i_129_;
			i_128_ = i_130_;
			i_129_ = i_131_;
		    } else if (i_128_ == i_126_ && i_129_ < i_127_) {
			int i_132_ = i_127_;
			i_127_ = i_129_;
			i_129_ = i_132_;
		    }
		    class173.method2221(i_126_, i_127_, i_128_, i_129_,
					(class239.anIntArray2648
					 [class239.aByteArray2646[i] & 0xff]),
					1, class239.anInt2638 * -1459473585,
					class239.anInt2615 * -408396417,
					class239.anInt2621 * 1012770115);
		}
		int i = is[is.length - 2];
		int i_133_ = is[is.length - 1];
		int i_134_ = is[0];
		int i_135_ = is[1];
		if (i_134_ < i) {
		    int i_136_ = i;
		    int i_137_ = i_133_;
		    i = i_134_;
		    i_133_ = i_135_;
		    i_134_ = i_136_;
		    i_135_ = i_137_;
		} else if (i_134_ == i && i_135_ < i_133_) {
		    int i_138_ = i_133_;
		    i_133_ = i_135_;
		    i_135_ = i_138_;
		}
		class173.method2221(i, i_133_, i_134_, i_135_,
				    (class239.anIntArray2648
				     [((class239.aByteArray2646
					[class239.aByteArray2646.length - 1])
				       & 0xff)]),
				    1, class239.anInt2638 * -1459473585,
				    class239.anInt2615 * -408396417,
				    class239.anInt2621 * 1012770115);
	    } else {
		for (int i = 0; i < is.length / 2 - 1; i++)
		    class173.method2214(is[i * 2], is[i * 2 + 1],
					is[(i + 1) * 2], is[(i + 1) * 2 + 1],
					(class239.anIntArray2648
					 [class239.aByteArray2646[i] & 0xff]),
					(byte) 42);
		class173.method2214(is[is.length - 2], is[is.length - 1],
				    is[0], is[1],
				    (class239.anIntArray2648
				     [((class239.aByteArray2646
					[class239.aByteArray2646.length - 1])
				       & 0xff)]),
				    (byte) 20);
	    }
	}
    }
    
    static boolean method6306(int i, int i_139_) {
	int i_140_ = i >> 3;
	int i_141_ = i_139_ >> 3;
	if (i_140_ < 0 || i_141_ < 0 || i_140_ >= aBoolArrayArray7038.length
	    || i_141_ >= aBoolArrayArray7038[i_140_].length)
	    return false;
	return aBoolArrayArray7038[i_140_][i_141_];
    }
    
    static int method6307() {
	return (int) (64.0F * aFloat6991 / 2.0F);
    }
    
    static void method6308(short[] is, byte[] is_142_, short[] is_143_, int i,
			   int i_144_) {
	int[] is_145_ = new int[anInt6997];
	int[] is_146_ = new int[anInt6997];
	int[] is_147_ = new int[anInt6997];
	int[] is_148_ = new int[anInt6997];
	int[] is_149_ = new int[anInt6997];
	for (int i_150_ = -5; i_150_ < anInt6982; i_150_++) {
	    int i_151_ = i_150_ + 5;
	    int i_152_ = i_150_ - 5;
	    for (int i_153_ = 0; i_153_ < anInt6997; i_153_++) {
		if (i_151_ < anInt6982) {
		    short i_154_ = is[i_151_ + i_153_ * anInt6982];
		    if (i_154_ > 0) {
			Class680 class680
			    = ((Class680)
			       aClass5_Sub18_7020.method63(i_154_ - 1,
							   455569234));
			is_145_[i_153_] += class680.anInt8570 * -1363610569;
			is_146_[i_153_] += class680.anInt8571 * -207840443;
			is_147_[i_153_] += class680.anInt8572 * -1393069609;
			is_148_[i_153_] += class680.anInt8568 * -1145682321;
			is_149_[i_153_]++;
		    }
		}
		if (i_152_ >= 0) {
		    short i_155_ = is[i_152_ + i_153_ * anInt6982];
		    if (i_155_ > 0) {
			Class680 class680
			    = ((Class680)
			       aClass5_Sub18_7020.method63(i_155_ - 1,
							   -1377325930));
			is_145_[i_153_] -= class680.anInt8570 * -1363610569;
			is_146_[i_153_] -= class680.anInt8571 * -207840443;
			is_147_[i_153_] -= class680.anInt8572 * -1393069609;
			is_148_[i_153_] -= class680.anInt8568 * -1145682321;
			is_149_[i_153_]--;
		    }
		}
	    }
	    if (i_150_ >= 0) {
		int i_156_ = 0;
		int i_157_ = 0;
		int i_158_ = 0;
		int i_159_ = 0;
		int i_160_ = 0;
		for (int i_161_ = -5; i_161_ < anInt6997; i_161_++) {
		    int i_162_ = i_161_ + 5;
		    if (i_162_ < anInt6997) {
			i_156_ += is_145_[i_162_];
			i_157_ += is_146_[i_162_];
			i_158_ += is_147_[i_162_];
			i_159_ += is_148_[i_162_];
			i_160_ += is_149_[i_162_];
		    }
		    int i_163_ = i_161_ - 5;
		    if (i_163_ >= 0) {
			i_156_ -= is_145_[i_163_];
			i_157_ -= is_146_[i_163_];
			i_158_ -= is_147_[i_163_];
			i_159_ -= is_148_[i_163_];
			i_160_ -= is_149_[i_163_];
		    }
		    if (i_161_ >= 0 && i_160_ > 0) {
			if (is[i_150_ + i_161_ * anInt6982] == 0) {
			    int i_164_ = i_150_ + i_161_ * anInt6982;
			    is_142_[i_164_] = (byte) 0;
			    is_143_[i_164_] = (short) 0;
			} else {
			    int i_165_
				= (i_159_ == 0 ? 0
				   : Class637.method7579(i_156_ * 256 / i_159_,
							 i_157_ / i_160_,
							 i_158_ / i_160_,
							 1673946678));
			    int i_166_ = (i_165_ & 0x7f) + i_144_;
			    if (i_166_ < 0)
				i_166_ = 0;
			    else if (i_166_ > 127)
				i_166_ = 127;
			    int i_167_ = ((i_165_ + i & 0xfc00)
					  + (i_165_ & 0x380) + i_166_);
			    int i_168_ = i_150_ + i_161_ * anInt6982;
			    int i_169_ = (Class72.anIntArray777
					  [(Class516.method6283
					    (Class185.method2721(i_167_, 96,
								 2076069925),
					     515814180)) & 0xffff]);
			    is_142_[i_168_] = (byte) (i_169_ >> 16 & 0xff);
			    is_143_[i_168_] = (short) (i_169_ & 0xffff);
			}
		    }
		}
	    }
	}
    }
    
    static void method6309(int[] is, int i, int i_170_, int i_171_, int i_172_,
			   int i_173_) {
	int i_174_ = aClass615_6979.anInt8018 * -1889554731 >> 24 & 0xff;
	int i_175_ = 255 - i_174_;
	if ((!aBoolArray6996[anInt7029]
	     || !aBoolArray6996[anInt7011] && !aBoolArray6996[anInt7015])
	    && (!aBoolArray6996[anInt7013]
		|| !aBoolArray6996[anInt7011] && !aBoolArray6996[anInt7015])) {
	    method6310(is, i, i_170_, i_171_, i_172_, i_173_, i_174_, i_175_,
		       true, true, true, true);
	    if (aBoolArray6996[anInt7010]) {
		is[(i_173_ - i_172_ - 1) * i_173_ + i_170_]
		    = aClass615_6979.anInt8025 * 217061563;
		is[(i_173_ - i_172_) * i_173_ + i_170_]
		    = aClass615_6979.anInt8025 * 217061563;
		is[(i_173_ - i_172_ - 1) * i_173_ + i_170_ - 1]
		    = aClass615_6979.anInt8025 * 217061563;
	    }
	    if (aBoolArray6996[anInt7012]) {
		is[(i_173_ - i_171_ - 1) * i_173_ + i_170_]
		    = aClass615_6979.anInt8025 * 217061563;
		is[(i_173_ - i_171_ - 2) * i_173_ + i_170_]
		    = aClass615_6979.anInt8025 * 217061563;
		is[(i_173_ - i_171_ - 1) * i_173_ + i_170_ - 1]
		    = aClass615_6979.anInt8025 * 217061563;
	    }
	    if (aBoolArray6996[anInt7014]) {
		is[(i_173_ - i_171_ - 1) * i_173_ + i]
		    = aClass615_6979.anInt8025 * 217061563;
		is[(i_173_ - i_171_ - 2) * i_173_ + i]
		    = aClass615_6979.anInt8025 * 217061563;
		is[(i_173_ - i_171_ - 1) * i_173_ + i + 1]
		    = aClass615_6979.anInt8025 * 217061563;
	    }
	    if (aBoolArray6996[anInt7016]) {
		is[(i_173_ - i_172_ - 1) * i_173_ + i]
		    = aClass615_6979.anInt8025 * 217061563;
		is[(i_173_ - i_172_) * i_173_ + i]
		    = aClass615_6979.anInt8025 * 217061563;
		is[(i_173_ - i_172_ - 1) * i_173_ + i + 1]
		    = aClass615_6979.anInt8025 * 217061563;
	    }
	} else {
	    if (aBoolArray6996[anInt7029] && aBoolArray6996[anInt7011])
		method6292(is,
			   i_170_ - aClass615_6979.anInt8027 * 419427269 + 1,
			   i_172_ - aClass615_6979.anInt8027 * 419427269 + 1,
			   i_173_, i_174_, i_175_, anInt7010);
	    else {
		method6310(is,
			   i_170_ - aClass615_6979.anInt8027 * 419427269 + 1,
			   i_170_,
			   i_172_ - aClass615_6979.anInt8027 * 419427269 + 1,
			   i_172_, i_173_, i_174_, i_175_, true, true, false,
			   false);
		if (aBoolArray6996[anInt7010]) {
		    is[(i_173_ - i_172_ - 1) * i_173_ + i_170_]
			= aClass615_6979.anInt8025 * 217061563;
		    is[(i_173_ - i_172_) * i_173_ + i_170_]
			= aClass615_6979.anInt8025 * 217061563;
		    is[(i_173_ - i_172_ - 1) * i_173_ + i_170_ - 1]
			= aClass615_6979.anInt8025 * 217061563;
		}
	    }
	    if (aBoolArray6996[anInt7013] && aBoolArray6996[anInt7011])
		method6292(is,
			   i_170_ - aClass615_6979.anInt8027 * 419427269 + 1,
			   i_171_, i_173_, i_174_, i_175_, anInt7012);
	    else {
		method6310(is,
			   i_170_ - aClass615_6979.anInt8027 * 419427269 + 1,
			   i_170_, i_171_,
			   i_171_ + aClass615_6979.anInt8027 * 419427269 - 1,
			   i_173_, i_174_, i_175_, false, true, true, false);
		if (aBoolArray6996[anInt7012]) {
		    is[(i_173_ - i_171_ - 1) * i_173_ + i_170_]
			= aClass615_6979.anInt8025 * 217061563;
		    is[(i_173_ - i_171_ - 2) * i_173_ + i_170_]
			= aClass615_6979.anInt8025 * 217061563;
		    is[(i_173_ - i_171_ - 1) * i_173_ + i_170_ - 1]
			= aClass615_6979.anInt8025 * 217061563;
		}
	    }
	    if (aBoolArray6996[anInt7013] && aBoolArray6996[anInt7015])
		method6292(is, i, i_171_, i_173_, i_174_, i_175_, anInt7014);
	    else {
		method6310(is, i, i + aClass615_6979.anInt8027 * 419427269 - 1,
			   i_171_,
			   i_171_ + aClass615_6979.anInt8027 * 419427269 - 1,
			   i_173_, i_174_, i_175_, false, false, true, true);
		if (aBoolArray6996[anInt7014]) {
		    is[(i_173_ - i_171_ - 1) * i_173_ + i]
			= aClass615_6979.anInt8025 * 217061563;
		    is[(i_173_ - i_171_ - 2) * i_173_ + i]
			= aClass615_6979.anInt8025 * 217061563;
		    is[(i_173_ - i_171_ - 1) * i_173_ + i + 1]
			= aClass615_6979.anInt8025 * 217061563;
		}
	    }
	    if (aBoolArray6996[anInt7029] && aBoolArray6996[anInt7015])
		method6292(is, i,
			   i_172_ - aClass615_6979.anInt8027 * 419427269 + 1,
			   i_173_, i_174_, i_175_, anInt7016);
	    else {
		method6310(is, i, i + aClass615_6979.anInt8027 * 419427269 - 1,
			   i_172_ - aClass615_6979.anInt8027 * 419427269 + 1,
			   i_172_, i_173_, i_174_, i_175_, true, false, false,
			   true);
		if (aBoolArray6996[anInt7016]) {
		    is[(i_173_ - i_172_ - 1) * i_173_ + i]
			= aClass615_6979.anInt8025 * 217061563;
		    is[(i_173_ - i_172_) * i_173_ + i]
			= aClass615_6979.anInt8025 * 217061563;
		    is[(i_173_ - i_172_ - 1) * i_173_ + i + 1]
			= aClass615_6979.anInt8025 * 217061563;
		}
	    }
	    if (i + aClass615_6979.anInt8027 * 419427269
		< i_170_ - aClass615_6979.anInt8027 * 419427269)
		method6310(is, i + aClass615_6979.anInt8027 * 419427269,
			   i_170_ - aClass615_6979.anInt8027 * 419427269,
			   i_171_, i_172_, i_173_, i_174_, i_175_, true, false,
			   true, false);
	    if (i_171_ + aClass615_6979.anInt8027 * 419427269 + 1
		< i_172_ - aClass615_6979.anInt8027 * 419427269 - 1) {
		method6310(is, i, i + aClass615_6979.anInt8027 * 419427269 - 1,
			   i_171_ + aClass615_6979.anInt8027 * 419427269,
			   i_172_ - aClass615_6979.anInt8027 * 419427269,
			   i_173_, i_174_, i_175_, false, false, false, true);
		method6310(is,
			   i_170_ - aClass615_6979.anInt8027 * 419427269 + 1,
			   i_170_,
			   i_171_ + aClass615_6979.anInt8027 * 419427269,
			   i_172_ - aClass615_6979.anInt8027 * 419427269,
			   i_173_, i_174_, i_175_, false, true, false, false);
	    }
	}
    }
    
    static void method6310(int[] is, int i, int i_176_, int i_177_, int i_178_,
			   int i_179_, int i_180_, int i_181_, boolean bool,
			   boolean bool_182_, boolean bool_183_,
			   boolean bool_184_) {
	for (int i_185_ = i; i_185_ <= i_176_; i_185_++) {
	    boolean bool_186_
		= bool_182_ ? (aBoolArray6996[anInt7011]
			       && i_176_ - i_185_ < (aClass615_6979.anInt8019
						     * -630260861)) : false;
	    boolean bool_187_
		= (bool_184_
		   ? (aBoolArray6996[anInt7015]
		      && i_185_ - i < aClass615_6979.anInt8019 * -630260861)
		   : false);
	    for (int i_188_ = i_177_; i_188_ <= i_178_; i_188_++) {
		if (bool_186_ || bool_187_)
		    is[(i_179_ - i_188_ - 1) * i_179_ + i_185_]
			= aClass615_6979.anInt8025 * 217061563;
		else {
		    boolean bool_189_
			= (bool
			   ? (aBoolArray6996[anInt7029]
			      && (i_178_ - i_188_
				  < aClass615_6979.anInt8019 * -630260861))
			   : false);
		    boolean bool_190_
			= (bool_183_
			   ? (aBoolArray6996[anInt7013]
			      && (i_188_ - i_177_
				  < aClass615_6979.anInt8019 * -630260861))
			   : false);
		    if (bool_189_ || bool_190_)
			is[(i_179_ - i_188_ - 1) * i_179_ + i_185_]
			    = aClass615_6979.anInt8025 * 217061563;
		    else {
			int i_191_
			    = is[(i_179_ - i_188_ - 1) * i_179_ + i_185_];
			if (i_191_ != anInt7040) {
			    anInt7040 = i_191_;
			    anInt7041
				= (~0xffffff
				   | ((((aClass615_6979.anInt8018 * -1889554731
					 & 0xff00ff) * i_180_
					+ (i_191_ & 0xff00ff) * i_181_)
				       & ~0xff00ff)
				      + ((((aClass615_6979.anInt8018
					    * -1889554731)
					   & 0xff00) * i_180_
					  + (i_191_ & 0xff00) * i_181_)
					 & 0xff0000)) >> 8);
			}
			is[(i_179_ - i_188_ - 1) * i_179_ + i_185_]
			    = anInt7041;
		    }
		}
	    }
	}
    }
    
    static void method6311() {
	int[] is = new int[3];
	for (int i = 0; i < aClass533_6992.anInt7130 * -595383187; i++) {
	    boolean bool
		= (aClass528_Sub21_Sub17_7017.method10589
		   (aClass533_6992.anIntArray7129[i] >> 28 & 0x3,
		    aClass533_6992.anIntArray7129[i] >> 14 & 0x3fff,
		    aClass533_6992.anIntArray7129[i] & 0x3fff, is, (byte) 50));
	    if (bool) {
		Class528_Sub25 class528_sub25
		    = new Class528_Sub25(aClass533_6992.anIntArray7131[i]);
		class528_sub25.anInt10424 = (is[1] - anInt6972) * 1722731049;
		class528_sub25.anInt10423 = (is[2] - anInt6995) * 1851578459;
		aClass688_6993.method8031(class528_sub25, (byte) 60);
	    }
	}
    }
    
    static boolean method6312(Class173 class173, int i, int i_192_,
			      boolean bool) {
	long l = Class249.method3417(1947042068);
	if (anInt7025 == 0) {
	    if (aClass528_Sub21_Sub17_7017.anInt11644 * 2000200341
		== aClass615_6979.anInt8028 * -5824517) {
		int i_193_
		    = aClass446_7006.method5362((aClass528_Sub21_Sub17_7017
						 .aString11639),
						(byte) -14);
		if (aClass528_Sub42_7042 == null)
		    aClass528_Sub42_7042
			= new ByteBuffer(aClass446_7006.method5348
					     (i_193_, 0, -1591589782));
		aClass528_Sub42_7027 = aClass528_Sub42_7042;
		aClass528_Sub42_7027.pointer = 0;
	    } else {
		int i_194_
		    = aClass446_7006.method5362((aClass528_Sub21_Sub17_7017
						 .aString11639),
						(byte) 107);
		aClass528_Sub42_7027
		    = (new ByteBuffer
		       (aClass446_7006.method5348(i_194_, 0, -439372070)));
	    }
	    int i_195_ = aClass528_Sub42_7027.readUnsignedByte((byte) 114);
	    anIntArray7030 = new int[i_195_];
	    for (int i_196_ = 0; i_196_ < i_195_; i_196_++)
		anIntArray7030[i_196_]
		    = aClass528_Sub42_7027.method9719(65280);
	    int i_197_ = aClass528_Sub42_7027.readUnsignedByte((byte) 26);
	    anIntArray7031 = new int[i_197_];
	    for (int i_198_ = 0; i_198_ < i_197_; i_198_++)
		anIntArray7031[i_198_]
		    = aClass528_Sub42_7027.method9719(65280);
	}
	while (aClass528_Sub42_7027 != null
	       && (aClass528_Sub42_7027.pointer * -185904669
		   < aClass528_Sub42_7027.payload.length)
	       && (!bool || (Class249.method3417(1963473653)
			     < l + (long) anInt7026))) {
	    if (aClass528_Sub42_7027.readUnsignedByte((byte) 48) == 0) {
		int i_199_ = aClass528_Sub42_7027.readUnsignedByte((byte) 117);
		int i_200_ = aClass528_Sub42_7027.readUnsignedByte((byte) 59);
		for (int i_201_ = 0; i_201_ < 8; i_201_++) {
		    int i_202_ = aClass528_Sub42_7027.readUnsignedByte((byte) 112);
		    int i_203_ = i_199_ * 8 + i_201_ - anInt6972 / 8;
		    for (int i_204_ = 0; i_204_ < 8; i_204_++) {
			int i_205_ = i_200_ * 8 + i_204_ - anInt6995 / 8;
			aBoolArrayArray7038[i_203_][i_205_]
			    = (i_202_ & 1 << i_204_) != 0;
		    }
		}
		for (int i_206_ = 0; i_206_ < 64; i_206_++) {
		    for (int i_207_ = 0; i_207_ < 64; i_207_++) {
			int i_208_ = i_199_ * 64 + i_206_ - anInt6972;
			int i_209_ = i_200_ * 64 + i_207_ - anInt6995;
			method6334(class173, aClass528_Sub42_7027, i_199_,
				   i_200_, i_208_, i_209_, anIntArray7030,
				   anIntArray7031);
		    }
		}
	    } else {
		int i_210_ = aClass528_Sub42_7027.readUnsignedByte((byte) 61);
		int i_211_ = aClass528_Sub42_7027.readUnsignedByte((byte) 99);
		int i_212_ = aClass528_Sub42_7027.readUnsignedByte((byte) 33);
		int i_213_ = aClass528_Sub42_7027.readUnsignedByte((byte) 77);
		aBoolArrayArray7038[i_210_ * 8 + i_212_ - anInt6972 / 8]
		    [i_211_ * 8 + i_213_ - anInt6995 / 8]
		    = aClass528_Sub42_7027.readUnsignedByte((byte) 77) != 0;
		for (int i_214_ = 0; i_214_ < 8; i_214_++) {
		    for (int i_215_ = 0; i_215_ < 8; i_215_++) {
			int i_216_
			    = i_210_ * 64 + i_212_ * 8 + i_214_ - anInt6972;
			int i_217_
			    = i_211_ * 64 + i_213_ * 8 + i_215_ - anInt6995;
			method6334(class173, aClass528_Sub42_7027, i_210_,
				   i_211_, i_216_, i_217_, anIntArray7030,
				   anIntArray7031);
		    }
		}
	    }
	}
	if (aClass528_Sub42_7027 != null) {
	    anInt7025 = aClass528_Sub42_7027.pointer * -185904669;
	    if (aClass528_Sub42_7027.pointer * -185904669
		< aClass528_Sub42_7027.payload.length)
		return false;
	}
	aClass528_Sub42_7027 = null;
	anIntArray7031 = null;
	anIntArray7030 = null;
	if (aShortArray6999 != null) {
	    aByteArray7024 = new byte[anInt6982 * anInt6997];
	    aShortArray7001 = new short[anInt6982 * anInt6997];
	    for (int i_218_ = 0; i_218_ < 3; i_218_++) {
		short[] is = new short[anInt6982 * anInt6997];
		for (int i_219_ = 0;
		     i_219_ < aHashMapArrayArrayArray7008[i_218_].length;
		     i_219_++) {
		    for (int i_220_ = 0;
			 (i_220_
			  < aHashMapArrayArrayArray7008[i_218_][0].length);
			 i_220_++) {
			HashMap hashmap = (aHashMapArrayArrayArray7008[i_218_]
					   [i_219_][i_220_]);
			if (hashmap != null) {
			    Iterator iterator = hashmap.values().iterator();
			    while (iterator.hasNext()) {
				Class536 class536 = (Class536) iterator.next();
				is[(i_219_ * 64
				    + ((Class536) class536).aByte7143
				    + ((i_220_ * 64
					+ ((Class536) class536).aByte7141)
				       * anInt6982))]
				    = (short) ((Class536) class536).anInt7142;
			    }
			}
		    }
		}
		method6308(is, aByteArray7024, aShortArray7001, i, i_192_);
		for (int i_221_ = 0;
		     i_221_ < aHashMapArrayArrayArray7008[i_218_].length;
		     i_221_++) {
		    for (int i_222_ = 0;
			 (i_222_
			  < aHashMapArrayArrayArray7008[i_218_][0].length);
			 i_222_++) {
			HashMap hashmap = (aHashMapArrayArrayArray7008[i_218_]
					   [i_221_][i_222_]);
			if (hashmap != null) {
			    Iterator iterator = hashmap.values().iterator();
			    while (iterator.hasNext()) {
				Class536 class536 = (Class536) iterator.next();
				int i_223_
				    = (i_221_ * 64
				       + ((Class536) class536).aByte7143
				       + ((i_222_ * 64
					   + ((Class536) class536).aByte7141)
					  * anInt6982));
				((Class536) class536).anInt7142
				    = ((aByteArray7024[i_223_] & 0xff) << 16
				       | aShortArray7001[i_223_] & 0xffff);
				if (((Class536) class536).anInt7142 != 0)
				    ((Class536) class536).anInt7142
					|= ~0xffffff;
			    }
			}
		    }
		}
	    }
	    method6308(aShortArray6999, aByteArray7024, aShortArray7001, i,
		       i_192_);
	    aShortArray6999 = null;
	}
	if (!bool || Class249.method3417(2082378883) < l + (long) anInt7026) {
	    method6295();
	    return true;
	}
	return false;
    }
    
    static void method6313(int[] is, int i, int i_224_, int i_225_, int i_226_,
			   int i_227_) {
	int i_228_ = aClass615_6979.anInt8018 * -1889554731 >> 24 & 0xff;
	int i_229_ = 255 - i_228_;
	for (int i_230_ = i; i_230_ <= i_224_; i_230_++) {
	    for (int i_231_ = i_225_; i_231_ <= i_226_; i_231_++) {
		int i_232_ = is[(i_227_ - i_231_ - 1) * i_227_ + i_230_];
		if (i_232_ != anInt7040) {
		    anInt7040 = i_232_;
		    anInt7041 = (~0xffffff
				 | ((((aClass615_6979.anInt8018 * -1889554731
				       & 0xff00ff) * i_228_
				      + (i_232_ & 0xff00ff) * i_229_)
				     & ~0xff00ff)
				    + (((aClass615_6979.anInt8018 * -1889554731
					 & 0xff00) * i_228_
					+ (i_232_ & 0xff00) * i_229_)
				       & 0xff0000)) >> 8);
		}
		is[(i_227_ - i_231_ - 1) * i_227_ + i_230_] = anInt7041;
	    }
	}
    }
    
    static void method6314(int[] is, int i, int i_233_, int i_234_, int i_235_,
			   int i_236_, int i_237_, int i_238_, byte[] is_239_,
			   int i_240_, int i_241_) {
	int i_242_ = 0;
	int i_243_ = 0;
	int i_244_ = i_233_ - i + 1;
	int i_245_ = i_235_ - i_234_ + 1;
	int i_246_ = (i_240_ << 16) / i_244_;
	int i_247_ = (is_239_.length / i_240_ << 16) / i_245_;
	int i_248_ = i + (i_236_ - i_235_ - 1) * i_236_;
	int i_249_ = i_237_ >> 24;
	int i_250_ = i_238_ >> 24;
	if (i_241_ == 0 || i_241_ == 1 && i_249_ == 255 && i_250_ == 255) {
	    int i_251_ = i_242_;
	    for (int i_252_ = -i_245_; i_252_ < 0; i_252_++) {
		int i_253_ = (i_243_ >> 16) * i_240_;
		for (int i_254_ = -i_244_; i_254_ < 0; i_254_++) {
		    if (is_239_[(i_242_ >> 16) + i_253_] != 0)
			is[i_248_++] = i_238_;
		    else
			is[i_248_++] = i_237_;
		    i_242_ += i_246_;
		}
		i_243_ += i_247_;
		i_242_ = i_251_;
		i_248_ += i_236_ - i_244_;
	    }
	} else if (i_241_ == 1) {
	    int i_255_ = i_242_;
	    for (int i_256_ = -i_245_; i_256_ < 0; i_256_++) {
		int i_257_ = (i_243_ >> 16) * i_240_;
		for (int i_258_ = -i_244_; i_258_ < 0; i_258_++) {
		    int i_259_ = i_237_;
		    if (is_239_[(i_242_ >> 16) + i_257_] != 0)
			i_259_ = i_238_;
		    int i_260_ = i_259_ >>> 24;
		    int i_261_ = 255 - i_260_;
		    int i_262_ = is[i_248_];
		    is[i_248_++]
			= ~0xffffff | ((((i_259_ & 0xff00ff) * i_260_
					 + (i_262_ & 0xff00ff) * i_261_)
					& ~0xff00ff)
				       + (((i_259_ & 0xff00) * i_260_
					   + (i_262_ & 0xff00) * i_261_)
					  & 0xff0000)) >> 8;
		    i_242_ += i_246_;
		}
		i_243_ += i_247_;
		i_242_ = i_255_;
		i_248_ += i_236_ - i_244_;
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    static void method6315(int[] is, int i, int i_263_, int i_264_, int i_265_,
			   int i_266_) {
	int i_267_ = i + (i_265_ - i_263_ - 1) * i_265_;
	for (int i_268_ = 0; i_268_ < i_264_; i_268_++)
	    is[i_267_ + i_268_] = i_266_;
    }
    
    static void method6316(int[] is, int i, int i_269_, int i_270_, int i_271_,
			   int i_272_) {
	int i_273_ = i + (i_271_ - i_269_ - 1) * i_271_;
	for (int i_274_ = 0; i_274_ < i_270_; i_274_++)
	    is[i_273_ + i_274_ * i_271_] = i_272_;
    }
    
    static {
	anInt6985 = (int) (Math.random() * 17.0) - 8;
	anIntArray6988 = new int[1];
	aByteArray6989 = new byte[1];
	aClass688_6993 = new Class688();
	aBool6990 = true;
	anIntArrayArray6986
	    = new int[][] { { 2, 2, 0, 0, 0, 0 }, { 2, 2, 2, 0, 0, 0 },
			    { 1, 2, 2, 2, 0, 0 }, { 1, 1, 1, 2, 2, 0 },
			    { 1, 1, 1, 2, 2, 2 }, { 1, 1, 1, 1, 2, 2 } };
	anInt7029 = Class657.aClass657_8436.method68();
	anInt7010 = Class657.aClass657_8437.method68();
	anInt7011 = Class657.aClass657_8444.method68();
	anInt7012 = Class657.aClass657_8438.method68();
	anInt7013 = Class657.aClass657_8439.method68();
	anInt7014 = Class657.aClass657_8440.method68();
	anInt7015 = Class657.aClass657_8441.method68();
	anInt7016 = Class657.aClass657_8435.method68();
	aClass186_7018 = new Class186(4096, 256);
	aClass186_7028 = new Class186(4096, 1024);
	aClass186_6994 = aClass186_7018;
	anArrayList7003 = new ArrayList();
	anInt7039 = 262144;
	anInt7025 = 0;
	anInt7026 = 5;
	aClass528_Sub42_7027 = null;
	aClass528_Sub42_7042 = null;
	aBool7007 = true;
	new Date();
	anInt7040 = 0;
	anInt7041 = 0;
	aBoolArray6996 = new boolean[8];
    }
    
    static void method6317() {
	aShortArray6999 = new short[anInt6982 * anInt6997];
	aShortArray7002 = new short[anInt6982 * anInt6997];
	aByteArray7005 = new byte[anInt6982 * anInt6997];
	anObjectArray7000 = new Object[anInt6982 * anInt6997];
	aByteArray6974 = new byte[anInt6982 * anInt6997];
	aHashMapArrayArrayArray7008
	    = new HashMap[3][anInt6982 >> 6][anInt6997 >> 6];
	anIntArray7022
	    = new int[aClass5_Sub11_6980.anInt116 * -1906415229 + 1];
	aBoolArrayArray7038 = new boolean[anInt6982 / 8][anInt6997 / 8];
    }
    
    static void method6318(int i, int i_275_, int i_276_, int i_277_,
			   boolean bool, boolean bool_278_, boolean bool_279_,
			   Class173 class173) {
	int i_280_ = i * 64;
	int i_281_ = i_275_ * 64;
	if (anIntArray6984 == null || anIntArray6984.length != i_276_ * i_276_)
	    anIntArray6984 = new int[i_276_ * i_276_];
	boolean bool_282_ = aBool6990 && !bool_279_;
	for (int i_283_ = 0; i_283_ < 64; i_283_++) {
	    int i_284_ = i_280_ + i_283_;
	    int i_285_ = i_283_ * i_276_ / 64;
	    int i_286_ = (i_283_ + 1) * i_276_ / 64 - 1;
	    if (i_286_ < i_285_)
		i_286_ = i_285_;
	    for (int i_287_ = 0; i_287_ < 64; i_287_++) {
		int i_288_ = i_281_ + i_287_;
		boolean bool_289_ = bool;
		if (bool_282_ && !method6306(i_284_, i_288_))
		    bool_289_ = false;
		int i_290_ = i_284_ + i_288_ * anInt6982;
		boolean bool_291_ = false;
		boolean bool_292_ = false;
		Object object = null;
		int i_293_ = ((aByteArray7024[i_290_] & 0xff) << 16
			      | aShortArray7001[i_290_] & 0xffff);
		if (i_293_ != 0)
		    i_293_ |= ~0xffffff;
		short i_294_ = aShortArray7002[i_290_];
		object = anObjectArray7000[i_290_];
		int i_295_ = i_287_ * i_276_ / 64;
		int i_296_ = (i_287_ + 1) * i_276_ / 64 - 1;
		if (i_296_ < i_295_)
		    i_296_ = i_295_;
		if (object != null) {
		    if (object instanceof Class528_Sub13) {
			Class528_Sub13 class528_sub13
			    = (Class528_Sub13) object;
			if (class528_sub13 != null)
			    method6300(anIntArray6984, i_285_, i_286_, i_295_,
				       i_296_, i_276_, bool_289_, i_293_,
				       i_294_, aByteArray7005[i_290_],
				       (((Class528_Sub13) class528_sub13)
					.anIntArray10353),
				       (((Class528_Sub13) class528_sub13)
					.aByteArray10354),
				       true);
		    } else {
			Integer integer = (Integer) object;
			anIntArray6988[0] = integer.intValue();
			aByteArray6989[0] = aByteArray6974[i_290_];
			method6300(anIntArray6984, i_285_, i_286_, i_295_,
				   i_296_, i_276_, bool_289_, i_293_, i_294_,
				   aByteArray7005[i_290_], anIntArray6988,
				   aByteArray6989, true);
		    }
		} else
		    method6300(anIntArray6984, i_285_, i_286_, i_295_, i_296_,
			       i_276_, bool_289_, i_293_, i_294_,
			       aByteArray7005[i_290_], null, null, true);
	    }
	}
	if (bool_278_) {
	    for (int i_297_ = 0; i_297_ < 64; i_297_++) {
		int i_298_ = i_280_ + i_297_;
		boolean bool_299_ = i_297_ == 0 && i_298_ != 0;
		for (int i_300_ = 0; i_300_ < 64; i_300_++) {
		    int i_301_ = i_281_ + i_300_;
		    if (!bool_282_ || method6306(i_298_, i_301_)) {
			boolean bool_302_ = i_300_ == 0 && i_301_ != 0;
			int i_303_ = i_298_ + i_301_ * anInt6982;
			if (bool_299_ && bool_302_)
			    method6301(class173, anIntArray6984, i_276_, -1,
				       -1, i_298_ - 1, i_301_ - 1,
				       i_303_ - 1 - anInt6982);
			if (bool_299_)
			    method6301(class173, anIntArray6984, i_276_, -1,
				       i_300_, i_298_ - 1, i_301_, i_303_ - 1);
			if (bool_302_)
			    method6301(class173, anIntArray6984, i_276_,
				       i_297_, -1, i_298_, i_301_ - 1,
				       i_303_ - anInt6982);
			method6301(class173, anIntArray6984, i_276_, i_297_,
				   i_300_, i_298_, i_301_, i_303_);
		    }
		}
	    }
	}
	int i_304_ = i * 64 / 64;
	int i_305_ = i_275_ * 64 / 64;
	for (int i_306_ = 0; i_306_ < 3; i_306_++) {
	    for (int i_307_ = 0; i_307_ < 64; i_307_++) {
		int i_308_ = i_280_ + i_307_;
		int i_309_ = i_308_ & 0x3f;
		int i_310_ = i_307_ * i_276_ / 64;
		int i_311_ = (i_307_ + 1) * i_276_ / 64 - 1;
		if (i_311_ < i_310_)
		    i_311_ = i_310_;
		for (int i_312_ = 0; i_312_ < 64; i_312_++) {
		    int i_313_ = i_281_ + i_312_;
		    boolean bool_314_ = bool;
		    if (bool_282_ && !method6306(i_308_, i_313_))
			bool_314_ = false;
		    int i_315_ = i_313_ & 0x3f;
		    int i_316_ = i_312_ * i_276_ / 64;
		    int i_317_ = (i_312_ + 1) * i_276_ / 64 - 1;
		    if (i_317_ < i_316_)
			i_317_ = i_316_;
		    HashMap hashmap
			= aHashMapArrayArrayArray7008[i_306_][i_304_][i_305_];
		    if (hashmap != null) {
			Class536 class536
			    = ((Class536)
			       hashmap.get(Integer.valueOf((i_309_ << 8)
							   + i_315_)));
			if (class536 != null)
			    method6300(anIntArray6984, i_310_, i_311_, i_316_,
				       i_317_, i_276_, bool_314_,
				       ((Class536) class536).anInt7142,
				       ((Class536) class536).aShort7140,
				       ((Class536) class536).aByte7144,
				       ((Class536) class536).anIntArray7145,
				       ((Class536) class536).aByteArray7146,
				       false);
		    }
		}
	    }
	    for (int i_318_ = 0; i_318_ < 64; i_318_++) {
		int i_319_ = i_280_ + i_318_;
		int i_320_ = i_319_ & 0x3f;
		for (int i_321_ = 0; i_321_ < 64; i_321_++) {
		    int i_322_ = i_281_ + i_321_;
		    if (!bool_282_ || method6306(i_319_, i_322_)) {
			int i_323_ = i_322_ & 0x3f;
			HashMap hashmap = (aHashMapArrayArrayArray7008[i_306_]
					   [i_304_][i_305_]);
			if (hashmap != null) {
			    Class536 class536
				= ((Class536)
				   hashmap.get(Integer.valueOf((i_320_ << 8)
							       + i_323_)));
			    if (class536 != null)
				method6332(class173, anIntArray6984, i_276_,
					   i_318_, i_321_,
					   (((Class536) class536)
					    .anIntArray7145),
					   (((Class536) class536)
					    .aByteArray7146));
			}
		    }
		}
	    }
	}
	if (bool_282_) {
	    int i_324_ = 8;
	    for (int i_325_ = 0; i_325_ < i_324_; i_325_++) {
		int i_326_ = i_280_ + i_325_ * 8;
		int i_327_ = i_325_ * i_276_ / i_324_;
		int i_328_ = (i_325_ + 1) * i_276_ / i_324_ - 1;
		for (int i_329_ = 0; i_329_ < i_324_; i_329_++) {
		    int i_330_ = i_281_ + i_329_ * 8;
		    if (!method6306(i_326_, i_330_)) {
			int i_331_ = i_329_ * i_276_ / i_324_;
			int i_332_ = (i_329_ + 1) * i_276_ / i_324_ - 1;
			if (i_276_ < 64)
			    method6313(anIntArray6984, i_327_, i_328_, i_331_,
				       i_332_, i_276_);
			else {
			    aBoolArray6996[anInt7029]
				= method6306(i_326_, i_330_ + 8);
			    aBoolArray6996[anInt7010]
				= method6306(i_326_ + 8, i_330_ + 8);
			    aBoolArray6996[anInt7011]
				= method6306(i_326_ + 8, i_330_);
			    aBoolArray6996[anInt7012]
				= method6306(i_326_ + 8, i_330_ - 8);
			    aBoolArray6996[anInt7013]
				= method6306(i_326_, i_330_ - 8);
			    aBoolArray6996[anInt7014]
				= method6306(i_326_ - 8, i_330_ - 8);
			    aBoolArray6996[anInt7015]
				= method6306(i_326_ - 8, i_330_);
			    aBoolArray6996[anInt7016]
				= method6306(i_326_ - 8, i_330_ + 8);
			    method6309(anIntArray6984, i_327_, i_328_, i_331_,
				       i_332_, i_276_);
			}
		    }
		}
	    }
	}
	aClass186_6994.method2729(class173.method2382(anIntArray6984, 0,
						      i_276_, i_276_, i_276_,
						      true),
				  (long) i_277_);
    }
    
    static void method6319() {
	aShortArray6999 = null;
	aByteArray7024 = null;
	aShortArray7001 = null;
	aShortArray7002 = null;
	aByteArray7005 = null;
	anObjectArray7000 = null;
	aByteArray6974 = null;
	aHashMapArrayArrayArray7008 = null;
	anIntArray7022 = null;
	aBoolArrayArray7038 = null;
    }
    
    static void method6320() {
	aShortArray6999 = null;
	aByteArray7024 = null;
	aShortArray7001 = null;
	aShortArray7002 = null;
	aByteArray7005 = null;
	anObjectArray7000 = null;
	aByteArray6974 = null;
	aHashMapArrayArrayArray7008 = null;
	anIntArray7022 = null;
	aBoolArrayArray7038 = null;
    }
    
    static void method6321() {
	aShortArray6999 = null;
	aByteArray7024 = null;
	aShortArray7001 = null;
	aShortArray7002 = null;
	aByteArray7005 = null;
	anObjectArray7000 = null;
	aByteArray6974 = null;
	aHashMapArrayArrayArray7008 = null;
	anIntArray7022 = null;
	aBoolArrayArray7038 = null;
    }
    
    static void method6322() {
	aShortArray6999 = new short[anInt6982 * anInt6997];
	aShortArray7002 = new short[anInt6982 * anInt6997];
	aByteArray7005 = new byte[anInt6982 * anInt6997];
	anObjectArray7000 = new Object[anInt6982 * anInt6997];
	aByteArray6974 = new byte[anInt6982 * anInt6997];
	aHashMapArrayArrayArray7008
	    = new HashMap[3][anInt6982 >> 6][anInt6997 >> 6];
	anIntArray7022
	    = new int[aClass5_Sub11_6980.anInt116 * -1906415229 + 1];
	aBoolArrayArray7038 = new boolean[anInt6982 / 8][anInt6997 / 8];
    }
    
    static void method6323(int i) {
	Class528_Sub21_Sub17 class528_sub21_sub17
	    = (Class528_Sub21_Sub17) aClass692_6983.method8137((long) i);
	if (class528_sub21_sub17 != null
	    && class528_sub21_sub17 != aClass528_Sub21_Sub17_7017) {
	    aClass528_Sub21_Sub17_7017 = class528_sub21_sub17;
	    aBool6990 = (aClass528_Sub21_Sub17_7017.anInt11644 * 2000200341
			 == aClass615_6979.anInt8023 * 1905168445);
	}
    }
    
    static void method6324(int i, int i_333_, int i_334_, int i_335_,
			   int i_336_, int i_337_, int i_338_, int i_339_) {
	anInt6973 = i - anInt6972;
	anInt7033 = i_333_ - anInt6995;
	anInt7034 = i_334_ - anInt6972;
	anInt7035 = i_335_ - anInt6995;
	anInt7036 = i_336_;
	anInt7037 = i_337_;
	anInt7009 = i_338_;
	anInt7019 = i_339_;
    }
    
    static boolean method6325(Class528_Sub21_Sub17 class528_sub21_sub17) {
	if (class528_sub21_sub17 != null
	    && class528_sub21_sub17 != aClass528_Sub21_Sub17_7017) {
	    aClass528_Sub21_Sub17_7017 = class528_sub21_sub17;
	    aBool6990 = (aClass528_Sub21_Sub17_7017.anInt11644 * 2000200341
			 == aClass615_6979.anInt8023 * 1905168445);
	    return true;
	}
	return false;
    }
    
    public static void method6326
	(Class446 class446, Class446 class446_340_, Class5_Sub11 class5_sub11,
	 Class5_Sub18 class5_sub18, Class5_Sub15 class5_sub15,
	 Class5_Sub6 class5_sub6, Class5_Sub16 class5_sub16,
	 IMultiVarDefinitionsLoader iMultiVarDefinitionsLoader, IMultiVarValueReader iMultiVarValueReader) {
	aClass446_6981 = class446;
	aClass446_7006 = class446_340_;
	aClass5_Sub11_6980 = class5_sub11;
	aClass5_Sub18_7020 = class5_sub18;
	aClass5_Sub15_7032 = class5_sub15;
	aClass5_Sub6_6975 = class5_sub6;
	aClass5_Sub16_6976 = class5_sub16;
	anInterface15_6978 = iMultiVarDefinitionsLoader;
	anInterface18_6977 = iMultiVarValueReader;
	aClass692_6983.method8141(2125198869);
	int[] is
	    = aClass446_6981.method5361(Class632.aClass632_8197.method68(),
					(byte) -10);
	if (is != null) {
	    for (int i = 0; i < is.length; i++) {
		Class528_Sub21_Sub17 class528_sub21_sub17
		    = Class684_Sub2.method10084(aClass446_6981, is[i],
						-1733895633);
		aClass692_6983.method8142(class528_sub21_sub17,
					  (long) ((class528_sub21_sub17
						   .anInt11644)
						  * 2000200341));
	    }
	}
	Class224.method3169(true, false, -49041031);
    }
    
    static void method6327() {
	for (int i = 0; i < anInt6982; i++) {
	    for (int i_341_ = 0; i_341_ < anInt6997; i_341_++) {
		Object object = anObjectArray7000[i + i_341_ * anInt6982];
		if (object != null) {
		    if (object instanceof Class528_Sub13) {
			Class528_Sub13 class528_sub13
			    = (Class528_Sub13) object;
			if (class528_sub13 != null) {
			    for (int i_342_ = 0;
				 i_342_ < (((Class528_Sub13) class528_sub13)
					   .anIntArray10353).length;
				 i_342_++) {
				Class596 class596
				    = ((Class596)
				       (aClass5_Sub15_7032.method63
					((((Class528_Sub13) class528_sub13)
					  .anIntArray10353[i_342_]),
					 1219212538)));
				int i_343_ = class596.anInt7777 * 667283375;
				if (class596.anIntArray7767 != null) {
				    class596
					= (class596.method7099
					   (anInterface15_6978,
					    anInterface18_6977, 1494331465));
				    if (class596 != null)
					i_343_
					    = class596.anInt7777 * 667283375;
				}
				if (i_343_ != -1) {
				    Class528_Sub25 class528_sub25
					= new Class528_Sub25(i_343_);
				    class528_sub25.anInt10424 = i * 1722731049;
				    class528_sub25.anInt10423
					= i_341_ * 1851578459;
				    aClass688_6993.method8031(class528_sub25,
							      (byte) -38);
				}
			    }
			}
		    } else {
			Integer integer = (Integer) object;
			Class596 class596
			    = ((Class596)
			       aClass5_Sub15_7032.method63(integer.intValue(),
							   1444008853));
			int i_344_ = class596.anInt7777 * 667283375;
			if (class596.anIntArray7767 != null) {
			    class596 = class596.method7099(anInterface15_6978,
							   anInterface18_6977,
							   203996999);
			    if (class596 != null)
				i_344_ = class596.anInt7777 * 667283375;
			}
			if (i_344_ != -1) {
			    Class528_Sub25 class528_sub25
				= new Class528_Sub25(i_344_);
			    class528_sub25.anInt10424 = i * 1722731049;
			    class528_sub25.anInt10423 = i_341_ * 1851578459;
			    aClass688_6993.method8031(class528_sub25,
						      (byte) 18);
			}
		    }
		}
	    }
	}
	for (int i = 0; i < 3; i++) {
	    for (int i_345_ = 0;
		 i_345_ < aHashMapArrayArrayArray7008[0].length; i_345_++) {
		for (int i_346_ = 0;
		     i_346_ < aHashMapArrayArrayArray7008[0][0].length;
		     i_346_++) {
		    HashMap hashmap
			= aHashMapArrayArrayArray7008[i][i_345_][i_346_];
		    if (hashmap != null) {
			Iterator iterator = hashmap.values().iterator();
			while (iterator.hasNext()) {
			    Class536 class536 = (Class536) iterator.next();
			    if (((Class536) class536).anIntArray7145 != null) {
				for (int i_347_ = 0;
				     i_347_ < (((Class536) class536)
					       .anIntArray7145).length;
				     i_347_++) {
				    Class596 class596
					= ((Class596)
					   (aClass5_Sub15_7032.method63
					    ((((Class536) class536)
					      .anIntArray7145[i_347_]),
					     1836524290)));
				    int i_348_
					= class596.anInt7777 * 667283375;
				    if (class596.anIntArray7767 != null) {
					class596 = (class596.method7099
						    (anInterface15_6978,
						     anInterface18_6977,
						     500093939));
					if (class596 != null)
					    i_348_ = (class596.anInt7777
						      * 667283375);
				    }
				    if (i_348_ != -1) {
					Class528_Sub25 class528_sub25
					    = new Class528_Sub25(i_348_);
					class528_sub25.anInt10424
					    = ((i_345_ + (anInt6972 >> 6)) * 64
					       + (((Class536) class536)
						  .aByte7143)
					       - anInt6972) * 1722731049;
					class528_sub25.anInt10423
					    = ((i_346_ + (anInt6995 >> 6)) * 64
					       + (((Class536) class536)
						  .aByte7141)
					       - anInt6995) * 1851578459;
					aClass688_6993.method8031
					    (class528_sub25, (byte) -81);
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    static void method6328() {
	for (int i = 0; i < anInt6982; i++) {
	    for (int i_349_ = 0; i_349_ < anInt6997; i_349_++) {
		Object object = anObjectArray7000[i + i_349_ * anInt6982];
		if (object != null) {
		    if (object instanceof Class528_Sub13) {
			Class528_Sub13 class528_sub13
			    = (Class528_Sub13) object;
			if (class528_sub13 != null) {
			    for (int i_350_ = 0;
				 i_350_ < (((Class528_Sub13) class528_sub13)
					   .anIntArray10353).length;
				 i_350_++) {
				Class596 class596
				    = ((Class596)
				       (aClass5_Sub15_7032.method63
					((((Class528_Sub13) class528_sub13)
					  .anIntArray10353[i_350_]),
					 -158747796)));
				int i_351_ = class596.anInt7777 * 667283375;
				if (class596.anIntArray7767 != null) {
				    class596
					= (class596.method7099
					   (anInterface15_6978,
					    anInterface18_6977, 1849820886));
				    if (class596 != null)
					i_351_
					    = class596.anInt7777 * 667283375;
				}
				if (i_351_ != -1) {
				    Class528_Sub25 class528_sub25
					= new Class528_Sub25(i_351_);
				    class528_sub25.anInt10424 = i * 1722731049;
				    class528_sub25.anInt10423
					= i_349_ * 1851578459;
				    aClass688_6993.method8031(class528_sub25,
							      (byte) -90);
				}
			    }
			}
		    } else {
			Integer integer = (Integer) object;
			Class596 class596
			    = ((Class596)
			       aClass5_Sub15_7032.method63(integer.intValue(),
							   1384939116));
			int i_352_ = class596.anInt7777 * 667283375;
			if (class596.anIntArray7767 != null) {
			    class596 = class596.method7099(anInterface15_6978,
							   anInterface18_6977,
							   339507692);
			    if (class596 != null)
				i_352_ = class596.anInt7777 * 667283375;
			}
			if (i_352_ != -1) {
			    Class528_Sub25 class528_sub25
				= new Class528_Sub25(i_352_);
			    class528_sub25.anInt10424 = i * 1722731049;
			    class528_sub25.anInt10423 = i_349_ * 1851578459;
			    aClass688_6993.method8031(class528_sub25,
						      (byte) 24);
			}
		    }
		}
	    }
	}
	for (int i = 0; i < 3; i++) {
	    for (int i_353_ = 0;
		 i_353_ < aHashMapArrayArrayArray7008[0].length; i_353_++) {
		for (int i_354_ = 0;
		     i_354_ < aHashMapArrayArrayArray7008[0][0].length;
		     i_354_++) {
		    HashMap hashmap
			= aHashMapArrayArrayArray7008[i][i_353_][i_354_];
		    if (hashmap != null) {
			Iterator iterator = hashmap.values().iterator();
			while (iterator.hasNext()) {
			    Class536 class536 = (Class536) iterator.next();
			    if (((Class536) class536).anIntArray7145 != null) {
				for (int i_355_ = 0;
				     i_355_ < (((Class536) class536)
					       .anIntArray7145).length;
				     i_355_++) {
				    Class596 class596
					= ((Class596)
					   (aClass5_Sub15_7032.method63
					    ((((Class536) class536)
					      .anIntArray7145[i_355_]),
					     975346324)));
				    int i_356_
					= class596.anInt7777 * 667283375;
				    if (class596.anIntArray7767 != null) {
					class596 = (class596.method7099
						    (anInterface15_6978,
						     anInterface18_6977,
						     528761228));
					if (class596 != null)
					    i_356_ = (class596.anInt7777
						      * 667283375);
				    }
				    if (i_356_ != -1) {
					Class528_Sub25 class528_sub25
					    = new Class528_Sub25(i_356_);
					class528_sub25.anInt10424
					    = ((i_353_ + (anInt6972 >> 6)) * 64
					       + (((Class536) class536)
						  .aByte7143)
					       - anInt6972) * 1722731049;
					class528_sub25.anInt10423
					    = ((i_354_ + (anInt6995 >> 6)) * 64
					       + (((Class536) class536)
						  .aByte7141)
					       - anInt6995) * 1851578459;
					aClass688_6993.method8031
					    (class528_sub25, (byte) 30);
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    static void method6329() {
	int[] is = new int[3];
	for (int i = 0; i < aClass533_6992.anInt7130 * -595383187; i++) {
	    boolean bool
		= (aClass528_Sub21_Sub17_7017.method10589
		   (aClass533_6992.anIntArray7129[i] >> 28 & 0x3,
		    aClass533_6992.anIntArray7129[i] >> 14 & 0x3fff,
		    aClass533_6992.anIntArray7129[i] & 0x3fff, is, (byte) 50));
	    if (bool) {
		Class528_Sub25 class528_sub25
		    = new Class528_Sub25(aClass533_6992.anIntArray7131[i]);
		class528_sub25.anInt10424 = (is[1] - anInt6972) * 1722731049;
		class528_sub25.anInt10423 = (is[2] - anInt6995) * 1851578459;
		aClass688_6993.method8031(class528_sub25, (byte) 26);
	    }
	}
    }
    
    public static Class679 method6330(int i, int i_357_) {
	Class679 class679 = new Class679();
	for (Class528_Sub21_Sub17 class528_sub21_sub17
		 = ((Class528_Sub21_Sub17)
		    aClass692_6983.method8146(-1942855841));
	     class528_sub21_sub17 != null;
	     class528_sub21_sub17 = ((Class528_Sub21_Sub17)
				     aClass692_6983.method8138(13934191))) {
	    if (((Class528_Sub21_Sub17) class528_sub21_sub17).aBool11647
		&& class528_sub21_sub17.method10583(i, i_357_, -612836189))
		class679.method7959(class528_sub21_sub17, -1940456445);
	}
	return class679;
    }
    
    static void method6331(Class165 class165, int i, int i_358_) {
	for (int i_359_ = 0;
	     i_359_ < aClass5_Sub11_6980.anInt116 * -1906415229; i_359_++)
	    anIntArray7022[i_359_ + 1]
		= method6293(class165, i_359_, i, i_358_);
    }
    
    static void method6332(Class173 class173, int[] is, int i, int i_360_,
			   int i_361_, int[] is_362_, byte[] is_363_) {
	if (is_362_ != null) {
	    for (int i_364_ = 0; i_364_ < is_362_.length; i_364_++) {
		Class596 class596
		    = (Class596) aClass5_Sub15_7032.method63(is_362_[i_364_],
							     1430836160);
		int i_365_ = class596.anInt7801 * 2063502347;
		if (i_365_ != -1) {
		    Class53 class53
			= ((Class53)
			   aClass5_Sub16_6976.method63(i_365_, 444786238));
		    Class151 class151
			= class53.method920(class173,
					    (class596.aBool7792
					     ? is_363_[i_364_] >> 6 & 0x3 : 0),
					    (class596.aBool7804
					     ? class596.aBool7805 : false),
					    (byte) -128);
		    int[] is_366_
			= class53.method921(class173,
					    (class596.aBool7792
					     ? is_363_[i_364_] >> 6 & 0x3 : 0),
					    (class596.aBool7804
					     ? class596.aBool7805 : false),
					    2142227509);
		    if (class151 != null) {
			int i_367_ = class151.method40();
			int i_368_ = class151.method1768();
			int i_369_ = i * i_367_ / 64 >> 2;
			int i_370_ = i * i_368_ / 64 >> 2;
			if (class53.aBool620) {
			    int i_371_ = class596.anInt7812 * -267660407;
			    int i_372_ = class596.anInt7843 * 423043053;
			    if ((is_363_[i_364_] >> 6 & 0x1) == 1) {
				int i_373_ = i_371_;
				i_371_ = i_372_;
				i_372_ = i_373_;
			    }
			    i_369_ = i_371_ * i / 64;
			    i_370_ = i_372_ * i / 64;
			}
			if (i_369_ != 0 && i_370_ != 0) {
			    int i_374_ = i_360_ * i / 64;
			    int i_375_ = (64 - i_361_) * i / 64 - i_370_ + 1;
			    for (int i_376_ = 0; i_376_ < i_369_; i_376_++) {
				int i_377_ = i_376_ + i_374_;
				if (i_377_ >= 0) {
				    if (i_377_ >= i)
					break;
				    for (int i_378_ = 0; i_378_ < i_370_;
					 i_378_++) {
					int i_379_ = i_378_ + i_375_;
					if (i_379_ >= 0) {
					    if (i_379_ >= i)
						break;
					    int i_380_
						= (is_366_
						   [(i_376_ * i_367_ / i_369_
						     + i_367_ * (i_378_
								 * i_368_
								 / i_370_))]);
					    int i_381_ = i_380_ >> 24 & 0xff;
					    if (i_381_ != 0)
						is[i_377_ + i * i_379_]
						    = i_380_;
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    static int method6333(long l) {
	Class151 class151 = (Class151) aClass186_6994.method2727(l);
	if (class151 != null)
	    return class151.method1766();
	return -1;
    }
    
    static void method6334(Class173 class173, ByteBuffer class528_sub42,
			   int i, int i_382_, int i_383_, int i_384_, int[] is,
			   int[] is_385_) {
	int i_386_ = class528_sub42.readUnsignedByte((byte) 81);
	if ((i_386_ & 0x1) == 0) {
	    boolean bool = (i_386_ & 0x2) == 0;
	    int i_387_ = i_386_ >> 2 & 0x3f;
	    if (i_387_ != 62) {
		if (i_387_ == 63)
		    i_387_ = class528_sub42.method9719(65280);
		else if (bool)
		    i_387_ = is[i_387_];
		else
		    i_387_ = is_385_[i_387_];
		if (bool) {
		    aShortArray6999[i_383_ + i_384_ * anInt6982]
			= (short) i_387_;
		    aShortArray7002[i_383_ + i_384_ * anInt6982] = (short) 0;
		} else {
		    aShortArray7002[i_383_ + i_384_ * anInt6982]
			= (short) i_387_;
		    aByteArray7005[i_383_ + i_384_ * anInt6982] = (byte) 0;
		    aShortArray6999[i_383_ + i_384_ * anInt6982]
			= (short) class528_sub42.method9719(65280);
		}
	    }
	} else {
	    int i_388_ = (i_386_ >> 1 & 0x3) + 1;
	    boolean bool = (i_386_ & 0x8) != 0;
	    boolean bool_389_ = (i_386_ & 0x10) != 0;
	    for (int i_390_ = 0; i_390_ < i_388_; i_390_++) {
		int i_391_ = class528_sub42.method9719(65280);
		int i_392_ = 0;
		int i_393_ = 0;
		if (bool) {
		    i_392_ = class528_sub42.method9719(65280);
		    i_393_ = class528_sub42.readUnsignedByte((byte) 115);
		}
		int i_394_ = 0;
		if (bool_389_)
		    i_394_ = class528_sub42.readUnsignedByte((byte) 27);
		if (i_390_ == 0) {
		    aShortArray6999[i_383_ + i_384_ * anInt6982]
			= (short) i_391_;
		    aShortArray7002[i_383_ + i_384_ * anInt6982]
			= (short) i_392_;
		    aByteArray7005[i_383_ + i_384_ * anInt6982]
			= (byte) i_393_;
		    if (i_394_ == 1) {
			anObjectArray7000[i_383_ + i_384_ * anInt6982]
			    = new Integer(class528_sub42
					      .method9645((short) -11044));
			aByteArray6974[i_383_ + i_384_ * anInt6982]
			    = class528_sub42.method9627(-1352583161);
		    } else if (i_394_ > 1) {
			int[] is_395_ = new int[i_394_];
			byte[] is_396_ = new byte[i_394_];
			for (int i_397_ = 0; i_397_ < i_394_; i_397_++) {
			    is_395_[i_397_]
				= class528_sub42.method9645((short) -3494);
			    is_396_[i_397_]
				= class528_sub42.method9627(-1880270582);
			}
			anObjectArray7000[i_383_ + i_384_ * anInt6982]
			    = new Class528_Sub13(is_395_, is_396_);
		    }
		} else {
		    int[] is_398_ = null;
		    byte[] is_399_ = null;
		    if (i_394_ > 0) {
			is_398_ = new int[i_394_];
			is_399_ = new byte[i_394_];
			for (int i_400_ = 0; i_400_ < i_394_; i_400_++) {
			    is_398_[i_400_]
				= class528_sub42.method9645((short) -21293);
			    is_399_[i_400_]
				= class528_sub42.method9627(-1849995783);
			}
		    }
		    if ((aHashMapArrayArrayArray7008[i_390_ - 1]
			 [i - (anInt6972 >> 6)][i_382_ - (anInt6995 >> 6)])
			== null)
			aHashMapArrayArrayArray7008[i_390_ - 1]
			    [i - (anInt6972 >> 6)][i_382_ - (anInt6995 >> 6)]
			    = new HashMap();
		    int i_401_ = ((i_383_ & 0x3f) << 8) + (i_384_ & 0x3f);
		    Class536 class536
			= new Class536(i_383_ & 0x3f, i_384_ & 0x3f, i_391_,
				       i_392_, i_393_, is_398_, is_399_);
		    aHashMapArrayArrayArray7008[i_390_ - 1]
			[i - (anInt6972 >> 6)][i_382_ - (anInt6995 >> 6)]
			.put(Integer.valueOf(i_401_), class536);
		}
	    }
	}
    }
    
    static void method6335() {
	aShortArray6999 = new short[anInt6982 * anInt6997];
	aShortArray7002 = new short[anInt6982 * anInt6997];
	aByteArray7005 = new byte[anInt6982 * anInt6997];
	anObjectArray7000 = new Object[anInt6982 * anInt6997];
	aByteArray6974 = new byte[anInt6982 * anInt6997];
	aHashMapArrayArrayArray7008
	    = new HashMap[3][anInt6982 >> 6][anInt6997 >> 6];
	anIntArray7022
	    = new int[aClass5_Sub11_6980.anInt116 * -1906415229 + 1];
	aBoolArrayArray7038 = new boolean[anInt6982 / 8][anInt6997 / 8];
    }
    
    static boolean method6336(int i, int i_402_) {
	int i_403_ = i >> 3;
	int i_404_ = i_402_ >> 3;
	if (i_403_ < 0 || i_404_ < 0 || i_403_ >= aBoolArrayArray7038.length
	    || i_404_ >= aBoolArrayArray7038[i_403_].length)
	    return false;
	return aBoolArrayArray7038[i_403_][i_404_];
    }
    
    static int method6337() {
	return (int) (64.0F * aFloat6991 / 2.0F);
    }
}
