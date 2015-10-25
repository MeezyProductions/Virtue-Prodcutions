/* Class172 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public abstract class Class172
{
    static int anInt1961;
    Class173 aClass173_1962;
    static int anInt1963;
    public static final int anInt1964 = 1;
    public static final int anInt1965 = 0;
    Class1 aClass1_1966;
    static int anInt1967;
    static int anInt1968;
    static int anInt1969;
    static int anInt1970 = 1651859741;
    public static final int anInt1971 = 0;
    static int anInt1972;
    static int anInt1973;
    static String[] aStringArray1974;
    
    public void method2119(String string, int i, int i_0_, int i_1_, int i_2_,
			   byte i_3_) {
	if (null != string) {
	    method2128(i_1_, i_2_, -587137048);
	    method2133(string,
		       i - ((Class172) this).aClass1_1966.method490(string,
								    941026227),
		       i_0_, null, null, null, 0, 0, -1909531961);
	}
    }
    
    public void method2120(String string, int i, int i_4_, int i_5_, int i_6_,
			   byte i_7_) {
	if (string != null) {
	    method2128(i_5_, i_6_, -1730143037);
	    method2133(string, i, i_4_, null, null, null, 0, 0, -1301263617);
	}
    }
    
    public int method2121(String string, int i, int i_8_, int i_9_, int i_10_,
			  int i_11_, int i_12_, int i_13_, int i_14_,
			  int i_15_, int i_16_, Class151[] class151s, int[] is,
			  Class148 class148, int i_17_, int i_18_, int i_19_) {
	if (null == string)
	    return 0;
	method2128(i_11_, i_12_, 1704679687);
	if (i_15_ == 0)
	    i_15_ = -167621951 * ((Class172) this).aClass1_1966.anInt10;
	int[] is_20_;
	if ((i_10_
	     < i_15_ + (((Class172) this).aClass1_1966.anInt12 * -55898191
			+ ((Class172) this).aClass1_1966.anInt13 * -46594681))
	    && i_10_ < i_15_ + i_15_)
	    is_20_ = null;
	else
	    is_20_ = new int[] { i_9_ };
	int i_21_
	    = ((Class172) this).aClass1_1966.method492(string, is_20_,
						       aStringArray1974,
						       class151s, -1711164004);
	if (i_16_ == -1) {
	    i_16_ = i_10_ / i_15_;
	    if (i_16_ <= 0)
		i_16_ = 1;
	}
	if (i_16_ > 0 && i_21_ >= i_16_) {
	    aStringArray1974[i_16_ - 1]
		= ((Class172) this).aClass1_1966.method491((aStringArray1974
							    [i_16_ - 1]),
							   i_9_, class151s,
							   (byte) 1);
	    i_21_ = i_16_;
	}
	if (i_14_ == 3 && i_21_ == 1)
	    i_14_ = 1;
	int i_22_;
	if (0 == i_14_)
	    i_22_ = -55898191 * ((Class172) this).aClass1_1966.anInt12 + i_8_;
	else if (i_14_ == 1)
	    i_22_ = (((Class172) this).aClass1_1966.anInt12 * -55898191 + i_8_
		     + (i_10_
			- ((Class172) this).aClass1_1966.anInt12 * -55898191
			- ((Class172) this).aClass1_1966.anInt13 * -46594681
			- i_15_ * (i_21_ - 1)) / 2);
	else if (2 == i_14_)
	    i_22_ = (i_10_ + i_8_
		     - -46594681 * ((Class172) this).aClass1_1966.anInt13
		     - (i_21_ - 1) * i_15_);
	else {
	    int i_23_
		= ((i_10_ - ((Class172) this).aClass1_1966.anInt12 * -55898191
		    - -46594681 * ((Class172) this).aClass1_1966.anInt13
		    - i_15_ * (i_21_ - 1))
		   / (1 + i_21_));
	    if (i_23_ < 0)
		i_23_ = 0;
	    i_22_ = (((Class172) this).aClass1_1966.anInt12 * -55898191 + i_8_
		     + i_23_);
	    i_15_ += i_23_;
	}
	for (int i_24_ = 0; i_24_ < i_21_; i_24_++) {
	    if (i_13_ == 0)
		method2133(aStringArray1974[i_24_], i, i_22_, class151s, is,
			   class148, i_17_, i_18_, 266323237);
	    else if (1 == i_13_)
		method2133(aStringArray1974[i_24_],
			   i + (i_9_
				- (((Class172) this).aClass1_1966.method490
				   (aStringArray1974[i_24_], 941026227))) / 2,
			   i_22_, class151s, is, class148, i_17_, i_18_,
			   -1949058167);
	    else if (2 == i_13_)
		method2133(aStringArray1974[i_24_],
			   i_9_ + i - (((Class172) this).aClass1_1966.method490
				       (aStringArray1974[i_24_], 941026227)),
			   i_22_, class151s, is, class148, i_17_, i_18_,
			   503640515);
	    else if (i_21_ - 1 == i_24_)
		method2133(aStringArray1974[i_24_], i, i_22_, class151s, is,
			   class148, i_17_, i_18_, -853635808);
	    else {
		method2142(aStringArray1974[i_24_], i_9_, (byte) 64);
		method2133(aStringArray1974[i_24_], i, i_22_, class151s, is,
			   class148, i_17_, i_18_, 933210198);
		anInt1972 = 0;
	    }
	    i_22_ += i_15_;
	}
	return i_21_;
    }
    
    public int method2122(String string, int i, int i_25_, int i_26_,
			  int i_27_, int i_28_, int i_29_, int i_30_,
			  int i_31_, int i_32_, Class151[] class151s, int[] is,
			  Class148 class148, int i_33_, int i_34_, int i_35_) {
	return method2121(string, i, i_25_, i_26_, i_27_, i_28_, i_29_, i_30_,
			  i_31_, i_32_, 0, class151s, is, class148, i_33_,
			  i_34_, -2120012000);
    }
    
    public void method2123(String string, int i, int i_36_, int i_37_,
			   int i_38_, int i_39_, byte i_40_) {
	if (string != null) {
	    method2128(i_37_, i_38_, 808326036);
	    int i_41_ = string.length();
	    int[] is = new int[i_41_];
	    for (int i_42_ = 0; i_42_ < i_41_; i_42_++)
		is[i_42_] = (int) (Math.sin((double) i_39_ / 5.0
					    + (double) i_42_ / 2.0)
				   * 5.0);
	    method2131(string,
		       i - (((Class172) this).aClass1_1966.method490(string,
								     941026227)
			    / 2),
		       i_36_, null, null, null, is, 2125098601);
	}
    }
    
    void method2124(int i, int i_43_) {
	anInt1970 = 1651859741;
	anInt1967 = -11360215;
	anInt1961 = (anInt1968 = i * -1094515537) * -1914189939;
	anInt1972 = 0;
	anInt1973 = 0;
	if (i_43_ == -1)
	    i_43_ = 0;
	anInt1963 = (anInt1969 = 465440183 * i_43_) * -1616624007;
    }
    
    abstract void method2125(char c, int i, int i_44_, int i_45_,
			     boolean bool);
    
    public int method2126(String string, int i, int i_46_, int i_47_,
			  int i_48_, Random random, int i_49_,
			  Class151[] class151s, int[] is, int i_50_) {
	if (string == null)
	    return 0;
	random.setSeed((long) i_49_);
	int i_51_ = 192 + (random.nextInt() & 0x1f);
	method2128(i_51_ << 24 | i_47_ & 0xffffff,
		   i_51_ << 24 | i_48_ & 0xffffff, -612393602);
	int i_52_ = string.length();
	int[] is_53_ = new int[i_52_];
	int i_54_ = 0;
	for (int i_55_ = 0; i_55_ < i_52_; i_55_++) {
	    is_53_[i_55_] = i_54_;
	    if ((random.nextInt() & 0x3) == 0)
		i_54_++;
	}
	method2131(string, i, i_46_, class151s, is, is_53_, null, 2121355603);
	return i_54_;
    }
    
    public int method2127(String string, int i, int i_56_, int i_57_,
			  int i_58_, int i_59_, int i_60_, int i_61_,
			  int i_62_, Random random, int i_63_, int[] is,
			  Class151[] class151s, int[] is_64_, int i_65_) {
	if (null == string)
	    return 0;
	random.setSeed((long) i_63_);
	int i_66_ = 192 + (random.nextInt() & 0x1f);
	method2128(i_66_ << 24 | i_59_ & 0xffffff,
		   -1 == i_60_ ? 0 : i_66_ << 24 | i_60_ & 0xffffff,
		   122499130);
	int i_67_ = string.length();
	int[] is_68_ = new int[i_67_];
	int i_69_ = 0;
	for (int i_70_ = 0; i_70_ < i_67_; i_70_++) {
	    is_68_[i_70_] = i_69_;
	    if ((random.nextInt() & 0x3) == 0)
		i_69_++;
	}
	int i_71_ = i;
	int i_72_ = i_56_ + -55898191 * ((Class172) this).aClass1_1966.anInt12;
	int i_73_ = -1;
	if (i_62_ == 1)
	    i_72_
		+= (i_58_ - ((Class172) this).aClass1_1966.anInt12 * -55898191
		    - ((Class172) this).aClass1_1966.anInt13 * -46594681) / 2;
	else if (2 == i_62_)
	    i_72_ = (i_56_ + i_58_
		     - -46594681 * ((Class172) this).aClass1_1966.anInt13);
	if (1 == i_61_) {
	    i_73_
		= (((Class172) this).aClass1_1966.method490(string, 941026227)
		   + i_69_);
	    i_71_ += (i_57_ - i_73_) / 2;
	} else if (i_61_ == 2) {
	    i_73_
		= (((Class172) this).aClass1_1966.method490(string, 941026227)
		   + i_69_);
	    i_71_ += i_57_ - i_73_;
	}
	method2131(string, i_71_, i_72_, class151s, is_64_, is_68_, null,
		   2135788380);
	if (is != null) {
	    if (-1 == i_73_)
		i_73_ = (((Class172) this).aClass1_1966.method490(string,
								  941026227)
			 + i_69_);
	    is[0] = i_71_;
	    is[1] = i_72_ - ((Class172) this).aClass1_1966.anInt12 * -55898191;
	    is[2] = i_73_;
	    is[3] = (((Class172) this).aClass1_1966.anInt12 * -55898191
		     + -46594681 * ((Class172) this).aClass1_1966.anInt13);
	}
	return i_69_;
    }
    
    void method2128(int i, int i_74_, int i_75_) {
	anInt1970 = 1651859741;
	anInt1967 = -11360215;
	anInt1961 = (anInt1968 = i * -1094515537) * -1914189939;
	anInt1972 = 0;
	anInt1973 = 0;
	if (i_74_ == -1)
	    i_74_ = 0;
	anInt1963 = (anInt1969 = 465440183 * i_74_) * -1616624007;
    }
    
    abstract void method2129(char c, int i, int i_76_, int i_77_,
			     boolean bool);
    
    public void method2130(String string, int i, int i_78_, int i_79_,
			   int i_80_, byte i_81_) {
	if (null != string) {
	    method2128(i_79_, i_80_, -1099565465);
	    method2133(string,
		       i - (((Class172) this).aClass1_1966.method490(string,
								     941026227)
			    / 2),
		       i_78_, null, null, null, 0, 0, 1715005253);
	}
    }
    
    void method2131(String string, int i, int i_82_, Class151[] class151s,
		    int[] is, int[] is_83_, int[] is_84_, int i_85_) {
	i_82_ -= ((Class172) this).aClass1_1966.anInt10 * -167621951;
	int i_86_ = -1;
	int i_87_ = -1;
	int i_88_ = 0;
	int i_89_ = string.length();
	for (int i_90_ = 0; i_90_ < i_89_; i_90_++) {
	    char c
		= (char) (Class450.method5438(string.charAt(i_90_), -217505068)
			  & 0xff);
	    if (60 == c)
		i_86_ = i_90_;
	    else {
		if (62 == c && i_86_ != -1) {
		    String string_91_ = string.substring(i_86_ + 1, i_90_);
		    i_86_ = -1;
		    if (string_91_.equals("lt"))
			c = '<';
		    else if (string_91_.equals("gt"))
			c = '>';
		    else if (string_91_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_91_.equals("shy"))
			c = '\u00ad';
		    else if (string_91_.equals("times"))
			c = '\u00d7';
		    else if (string_91_.equals("euro"))
			c = '\u20ac';
		    else if (string_91_.equals("copy"))
			c = '\u00a9';
		    else if (string_91_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_91_.startsWith("img=")) {
			    try {
				int i_92_;
				if (is_83_ != null)
				    i_92_ = is_83_[i_88_];
				else
				    i_92_ = 0;
				int i_93_;
				if (null != is_84_)
				    i_93_ = is_84_[i_88_];
				else
				    i_93_ = 0;
				i_88_++;
				int i_94_
				    = Class454.method5495(string_91_
							      .substring(4),
							  717927929);
				Class151 class151 = class151s[i_94_];
				int i_95_ = (is != null ? is[i_94_]
					     : class151.method1768());
				class151.method1780(i + i_92_,
						    (i_93_
						     + ((-167621951
							 * (((Class172) this)
							    .aClass1_1966
							    .anInt10))
							+ i_82_ - i_95_)),
						    1, -1, 1);
				i += class151s[i_94_].method40();
				i_87_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else if (string_91_.startsWith("sprite=")) {
			    if (null != (((Class172) this).aClass1_1966
					 .anInterface75_15)) {
				try {
				    int i_96_ = -1;
				    int i_97_ = 0;
				    int i_98_ = string_91_.indexOf(',');
				    if (-1 == i_98_)
					i_96_ = (Class454.method5495
						 (string_91_.substring(7),
						  717927929));
				    else {
					i_96_
					    = (Class454.method5495
					       (string_91_.substring(7, i_98_),
						717927929));
					i_97_ = (Class454.method5495
						 (string_91_
						      .substring(i_98_ + 1),
						  717927929));
				    }
				    int i_99_;
				    if (null != is_83_)
					i_99_ = is_83_[i_88_];
				    else
					i_99_ = 0;
				    int i_100_;
				    if (null != is_84_)
					i_100_ = is_84_[i_88_];
				    else
					i_100_ = 0;
				    i_88_++;
				    Class151[] class151s_101_
					= (((Class172) this).aClass1_1966
					       .anInterface75_15.method482
					   (((Class172) this).aClass173_1962,
					    i_96_, 1275575765));
				    if (class151s_101_ != null) {
					int i_102_
					    = Math.min(class151s_101_
							   [i_97_]
							   .method1768(),
						       ((-55898191
							 * (((Class172) this)
							    .aClass1_1966
							    .anInt12))
							+ ((((Class172) this)
							    .aClass1_1966
							    .anInt13)
							   * -46594681)));
					class151s_101_[i_97_].method1780
					    (i + i_99_,
					     (i_82_ + 3
					      + (((Class172) this).aClass1_1966
						 .anInt10) * -167621951
					      - i_102_ + i_100_),
					     1, -1, 1);
					i += class151s_101_[i_97_].method40();
				    }
				    i_87_ = -1;
				} catch (Exception exception) {
				    /* empty */
				}
			    }
			} else
			    method2140(string_91_, -1907305508);
			continue;
		    }
		}
		if (i_86_ == -1) {
		    if (i_87_ != -1)
			i += ((Class172) this).aClass1_1966
				 .method497(i_87_, c, (byte) 1);
		    int i_103_;
		    if (null != is_83_)
			i_103_ = is_83_[i_88_];
		    else
			i_103_ = 0;
		    int i_104_;
		    if (null != is_84_)
			i_104_ = is_84_[i_88_];
		    else
			i_104_ = 0;
		    i_88_++;
		    if (c != 32) {
			if ((758200959 * anInt1963 & ~0xffffff) != 0)
			    method2125(c, i_103_ + (1 + i), i_82_ + 1 + i_104_,
				       758200959 * anInt1963, true);
			method2125(c, i + i_103_, i_104_ + i_82_,
				   1692912715 * anInt1961, false);
		    } else if (1831234435 * anInt1972 > 0) {
			anInt1973 += -1605311111 * anInt1972;
			i += anInt1973 * 2000471515 >> 8;
			anInt1973
			    = (2000471515 * anInt1973 & 0xff) * -373051821;
		    }
		    int i_105_
			= ((Class172) this).aClass1_1966.method489(c,
								   (byte) -28);
		    if (anInt1970 * -334915893 != -1)
			((Class172) this).aClass173_1962.method2384
			    (i,
			     (int) ((double) (-167621951
					      * (((Class172) this).aClass1_1966
						 .anInt10))
				    * 0.7) + i_82_,
			     i_105_, anInt1970 * -334915893, -1318242689);
		    if (-172192793 * anInt1967 != -1)
			((Class172) this).aClass173_1962.method2384
			    (i,
			     (((Class172) this).aClass1_1966.anInt10
			      * -167621951) + i_82_,
			     i_105_, anInt1967 * -172192793, -1318242689);
		    i += i_105_;
		    i_87_ = c;
		}
	    }
	}
    }
    
    abstract void method2132(char c, int i, int i_106_, int i_107_,
			     boolean bool, Class148 class148, int i_108_,
			     int i_109_);
    
    void method2133(String string, int i, int i_110_, Class151[] class151s,
		    int[] is, Class148 class148, int i_111_, int i_112_,
		    int i_113_) {
	i_110_ -= ((Class172) this).aClass1_1966.anInt10 * -167621951;
	int i_114_ = -1;
	int i_115_ = -1;
	int i_116_ = string.length();
	for (int i_117_ = 0; i_117_ < i_116_; i_117_++) {
	    char c
		= (char) (Class450.method5438(string.charAt(i_117_), 914815619)
			  & 0xff);
	    if (c == 60)
		i_114_ = i_117_;
	    else {
		if (c == 62 && -1 != i_114_) {
		    String string_118_ = string.substring(1 + i_114_, i_117_);
		    i_114_ = -1;
		    if (string_118_.equals("lt"))
			c = '<';
		    else if (string_118_.equals("gt"))
			c = '>';
		    else if (string_118_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_118_.equals("shy"))
			c = '\u00ad';
		    else if (string_118_.equals("times"))
			c = '\u00d7';
		    else if (string_118_.equals("euro"))
			c = '\u20ac';
		    else if (string_118_.equals("copy"))
			c = '\u00a9';
		    else if (string_118_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_118_.startsWith("img=")) {
			    try {
				int i_119_
				    = Class454.method5495(string_118_
							      .substring(4),
							  717927929);
				Class151 class151 = class151s[i_119_];
				int i_120_ = (null != is ? is[i_119_]
					      : class151.method1768());
				if ((anInt1961 * 1692912715 & ~0xffffff)
				    == -16777216)
				    class151.method1780(i,
							(((((Class172) this)
							   .aClass1_1966
							   .anInt10)
							  * -167621951)
							 + i_110_ - i_120_),
							1, -1, 1);
				else
				    class151.method1780
					(i,
					 (i_110_
					  + -167621951 * (((Class172) this)
							  .aClass1_1966
							  .anInt10)
					  - i_120_),
					 0,
					 (1692912715 * anInt1961 & ~0xffffff
					  | 0xffffff),
					 1);
				i += class151s[i_119_].method40();
				i_115_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else if (string_118_.startsWith("sprite=")) {
			    if (null != (((Class172) this).aClass1_1966
					 .anInterface75_15)) {
				try {
				    int i_121_ = -1;
				    int i_122_ = 0;
				    int i_123_ = string_118_.indexOf(',');
				    if (i_123_ == -1)
					i_121_ = (Class454.method5495
						  (string_118_.substring(7),
						   717927929));
				    else {
					i_121_
					    = (Class454.method5495
					       (string_118_.substring(7,
								      i_123_),
						717927929));
					i_122_ = (Class454.method5495
						  (string_118_
						       .substring(i_123_ + 1),
						   717927929));
				    }
				    Class151[] class151s_124_
					= (((Class172) this).aClass1_1966
					       .anInterface75_15.method482
					   (((Class172) this).aClass173_1962,
					    i_121_, 1519029737));
				    if (null != class151s_124_) {
					int i_125_
					    = Math.min(class151s_124_
							   [i_122_]
							   .method1768(),
						       ((-55898191
							 * (((Class172) this)
							    .aClass1_1966
							    .anInt12))
							+ ((((Class172) this)
							    .aClass1_1966
							    .anInt13)
							   * -46594681)));
					if (-16777216
					    == (1692912715 * anInt1961
						& ~0xffffff))
					    class151s_124_[i_122_].method1780
						(i,
						 (((((Class172) this)
						    .aClass1_1966.anInt10)
						   * -167621951)
						  + (i_110_ + 2) - i_125_),
						 1, -1, 1);
					else
					    class151s_124_[i_122_].method1780
						(i,
						 (((((Class172) this)
						    .aClass1_1966.anInt10)
						   * -167621951)
						  + (2 + i_110_) - i_125_),
						 0,
						 (anInt1961 * 1692912715
						  & ~0xffffff) | 0xffffff,
						 1);
					i += class151s_124_[i_122_].method40();
				    }
				    i_115_ = -1;
				} catch (Exception exception) {
				    /* empty */
				}
			    }
			} else
			    method2140(string_118_, -1641677664);
			continue;
		    }
		}
		if (i_114_ == -1) {
		    if (i_115_ != -1)
			i += ((Class172) this).aClass1_1966
				 .method497(i_115_, c, (byte) 1);
		    if (32 != c) {
			if (null == class148) {
			    if (0 != (anInt1963 * 758200959 & ~0xffffff))
				method2125(c, 1 + i, 1 + i_110_,
					   anInt1963 * 758200959, true);
			    method2125(c, i, i_110_, 1692912715 * anInt1961,
				       false);
			} else {
			    if ((758200959 * anInt1963 & ~0xffffff) != 0)
				method2132(c, i + 1, i_110_ + 1,
					   758200959 * anInt1963, true,
					   class148, i_111_, i_112_);
			    method2132(c, i, i_110_, 1692912715 * anInt1961,
				       false, class148, i_111_, i_112_);
			}
		    } else if (anInt1972 * 1831234435 > 0) {
			anInt1973 += -1605311111 * anInt1972;
			i += 2000471515 * anInt1973 >> 8;
			anInt1973
			    = (2000471515 * anInt1973 & 0xff) * -373051821;
		    }
		    int i_126_
			= ((Class172) this).aClass1_1966.method489(c,
								   (byte) -88);
		    if (-1 != -334915893 * anInt1970)
			((Class172) this).aClass173_1962.method2384
			    (i,
			     (int) ((double) ((((Class172) this).aClass1_1966
					       .anInt10)
					      * -167621951)
				    * 0.7) + i_110_,
			     i_126_, anInt1970 * -334915893, -1318242689);
		    if (-1 != -172192793 * anInt1967)
			((Class172) this).aClass173_1962.method2384
			    (i,
			     i_110_ + -167621951 * (((Class172) this)
						    .aClass1_1966.anInt10) + 1,
			     i_126_, -172192793 * anInt1967, -1318242689);
		    i += i_126_;
		    i_115_ = c;
		}
	    }
	}
    }
    
    abstract void method2134(char c, int i, int i_127_, int i_128_,
			     boolean bool);
    
    abstract void method2135(char c, int i, int i_129_, int i_130_,
			     boolean bool);
    
    abstract void method2136(char c, int i, int i_131_, int i_132_,
			     boolean bool, Class148 class148, int i_133_,
			     int i_134_);
    
    abstract void method2137(char c, int i, int i_135_, int i_136_,
			     boolean bool, Class148 class148, int i_137_,
			     int i_138_);
    
    abstract void method2138(char c, int i, int i_139_, int i_140_,
			     boolean bool, Class148 class148, int i_141_,
			     int i_142_);
    
    abstract void method2139(char c, int i, int i_143_, int i_144_,
			     boolean bool, Class148 class148, int i_145_,
			     int i_146_);
    
    void method2140(String string, int i) {
	try {
	    if (string.startsWith("col="))
		anInt1961 = ((1692912715 * anInt1961 & ~0xffffff
			      | Class544.method6657(string.substring(4), 16,
						    -180074388) & 0xffffff)
			     * 1190567267);
	    else if (string.equals("/col"))
		anInt1961 = 1190567267 * (1692912715 * anInt1961 & ~0xffffff
					  | anInt1968 * 1780929103 & 0xffffff);
	    if (string.startsWith("argb="))
		anInt1961 = Class544.method6657(string.substring(5), 16,
						1240072061) * 1190567267;
	    else if (string.equals("/argb"))
		anInt1961 = -1914189939 * anInt1968;
	    else if (string.startsWith("str="))
		anInt1970 = (anInt1961 * 1692912715 & ~0xffffff
			     | Class544.method6657(string.substring(4), 16,
						   1063299499)) * -1651859741;
	    else if (string.equals("str"))
		anInt1970 = ((1692912715 * anInt1961 & ~0xffffff | 0x800000)
			     * -1651859741);
	    else if (string.equals("/str"))
		anInt1970 = 1651859741;
	    else if (string.startsWith("u="))
		anInt1967 = (1692912715 * anInt1961 & ~0xffffff
			     | Class544.method6657(string.substring(2), 16,
						   655969257)) * 11360215;
	    else if (string.equals("u"))
		anInt1967 = (1692912715 * anInt1961 & ~0xffffff) * 11360215;
	    else if (string.equals("/u"))
		anInt1967 = -11360215;
	    else if (string.equalsIgnoreCase("shad=-1"))
		anInt1963 = 0;
	    else if (string.startsWith("shad="))
		anInt1963 = (anInt1961 * 1692912715 & ~0xffffff
			     | Class544.method6657(string.substring(5), 16,
						   665985671)) * -2033154689;
	    else if (string.equals("shad"))
		anInt1963 = -2033154689 * (1692912715 * anInt1961 & ~0xffffff);
	    else if (string.equals("/shad"))
		anInt1963 = -1616624007 * anInt1969;
	    else if (string.equals("br"))
		method2128(anInt1968 * 1780929103, 748642311 * anInt1969,
			   1484034841);
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    Class172(Class173 class173, Class1 class1) {
	((Class172) this).aClass173_1962 = class173;
	((Class172) this).aClass1_1966 = class1;
    }
    
    public void method2141(String string, int i, int i_147_, int i_148_,
			   int i_149_, int i_150_, int i_151_, byte i_152_) {
	if (null != string) {
	    method2128(i_148_, i_149_, 2086275394);
	    double d = 7.0 - (double) i_151_ / 8.0;
	    if (d < 0.0)
		d = 0.0;
	    int i_153_ = string.length();
	    int[] is = new int[i_153_];
	    for (int i_154_ = 0; i_154_ < i_153_; i_154_++)
		is[i_154_] = (int) (Math.sin((double) i_150_ / 1.0
					     + (double) i_154_ / 1.5)
				    * d);
	    method2131(string,
		       i - (((Class172) this).aClass1_1966.method490(string,
								     941026227)
			    / 2),
		       i_147_, null, null, null, is, 2146350233);
	}
    }
    
    void method2142(String string, int i, byte i_155_) {
	int i_156_ = 0;
	boolean bool = false;
	for (int i_157_ = 0; i_157_ < string.length(); i_157_++) {
	    char c = string.charAt(i_157_);
	    if (c == '<')
		bool = true;
	    else if (c == '>')
		bool = false;
	    else if (!bool && c == ' ')
		i_156_++;
	}
	if (i_156_ > 0)
	    anInt1972
		= (i - ((Class172) this).aClass1_1966.method490(string,
								941026227)
		   << 8) / i_156_ * 1850506027;
    }
    
    void method2143(int i, int i_158_) {
	anInt1970 = 1651859741;
	anInt1967 = -11360215;
	anInt1961 = (anInt1968 = i * -1094515537) * -1914189939;
	anInt1972 = 0;
	anInt1973 = 0;
	if (i_158_ == -1)
	    i_158_ = 0;
	anInt1963 = (anInt1969 = 465440183 * i_158_) * -1616624007;
    }
    
    static {
	anInt1967 = -11360215;
	anInt1968 = 0;
	anInt1961 = 0;
	anInt1969 = 0;
	anInt1963 = 0;
	anInt1972 = 0;
	anInt1973 = 0;
	aStringArray1974 = new String[100];
    }
    
    public void method2144(String string, int i, int i_159_, int i_160_,
			   int i_161_, int i_162_, int i_163_) {
	if (null != string) {
	    method2128(i_160_, i_161_, 1588828508);
	    int i_164_ = string.length();
	    int[] is = new int[i_164_];
	    int[] is_165_ = new int[i_164_];
	    for (int i_166_ = 0; i_166_ < i_164_; i_166_++) {
		is[i_166_] = (int) (Math.sin((double) i_166_ / 5.0
					     + (double) i_162_ / 5.0)
				    * 5.0);
		is_165_[i_166_] = (int) (Math.sin((double) i_162_ / 5.0
						  + (double) i_166_ / 3.0)
					 * 5.0);
	    }
	    method2131(string,
		       i - (((Class172) this).aClass1_1966.method490(string,
								     941026227)
			    / 2),
		       i_159_, null, null, is, is_165_, 2143228989);
	}
    }
    
    static final void method2145(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_167_ = 10;
	byte[] is = { (byte) ((Class648) class648).anIntArray8394
			     [717927929 * ((Class648) class648).anInt8395] };
	byte[] is_168_
	    = { (byte) ((Class648) class648).anIntArray8394
		       [717927929 * ((Class648) class648).anInt8395 + 1] };
	Class199.method2841(class229, i_167_, is, is_168_, class648, (byte) 1);
    }
    
    static final void method2146(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_169_ = (((Class648) class648).anIntArray8394
		      [((Class648) class648).anInt8395 * 717927929]);
	int i_170_ = (((Class648) class648).anIntArray8394
		      [1 + ((Class648) class648).anInt8395 * 717927929]);
	Class79 class79
	    = ((Class79)
	       Class208.aClass5_Sub10_2239.method63(i_170_, -1710082330));
	if (class79.method1140((short) 255))
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= ((Class528_Sub21_Sub1)
		   Class555.aClass25_Sub2_7452.method63(i_169_, -2116230089))
		      .method10273(i_170_, class79.aString811, 1934995076);
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= (((Class528_Sub21_Sub1)
		    Class555.aClass25_Sub2_7452.method63(i_169_, -1243403511))
		       .method10272
		   (i_170_, 1875093329 * class79.anInt809, -787435681));
    }
    
    static final void method2147(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub21_10583
		  .method9981(-1411350868) ? 1 : 0;
    }
    
    static final void method2148(Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	Class96.aClass259_1226.method3551(string, 1736216336);
    }
    
    static final void method2149(Class648 class648, int i) {
	int i_171_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_171_, (byte) 65);
	Class109.method1398(class229, class648, 1416333817);
    }
}
