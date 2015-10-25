/* Class158 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class158
{
    static int anInt1740;
    static int anInt1741;
    static int[] anIntArray1742;
    static int anInt1743;
    static int anInt1744;
    static int anInt1745;
    static int anInt1746;
    static int anInt1747;
    
    static void method2038(int i, int i_0_) {
	if (i_0_ > i + 4) {
	    int i_1_ = i;
	    int i_2_ = anIntArray1742[i_1_];
	    int i_3_ = anIntArray1742[i_1_ + 1];
	    int i_4_ = anIntArray1742[i_1_ + 2];
	    int i_5_ = anIntArray1742[i_1_ + 3];
	    for (int i_6_ = i + 4; i_6_ < i_0_; i_6_ += 4) {
		int i_7_ = anIntArray1742[i_6_ + 1];
		if (i_7_ < i_3_) {
		    anIntArray1742[i_1_] = anIntArray1742[i_6_];
		    anIntArray1742[i_1_ + 1] = i_7_;
		    anIntArray1742[i_1_ + 2] = anIntArray1742[i_6_ + 2];
		    anIntArray1742[i_1_ + 3] = anIntArray1742[i_6_ + 3];
		    i_1_ += 4;
		    anIntArray1742[i_6_] = anIntArray1742[i_1_];
		    anIntArray1742[i_6_ + 1] = anIntArray1742[i_1_ + 1];
		    anIntArray1742[i_6_ + 2] = anIntArray1742[i_1_ + 2];
		    anIntArray1742[i_6_ + 3] = anIntArray1742[i_1_ + 3];
		}
	    }
	    anIntArray1742[i_1_] = i_2_;
	    anIntArray1742[i_1_ + 1] = i_3_;
	    anIntArray1742[i_1_ + 2] = i_4_;
	    anIntArray1742[i_1_ + 3] = i_5_;
	    method2038(i, i_1_);
	    method2038(i_1_ + 4, i_0_);
	}
    }
    
    static boolean method2039(int i) {
	int i_8_ = anInt1746;
	int i_9_ = anInt1747;
	int i_10_ = anInt1740;
	int i_11_;
	for (/**/; i_9_ >= i_8_; i_9_ = i_11_) {
	    anInt1740 = ++i_10_;
	    if (i_10_ >= i)
		return false;
	    i_11_ = anInt1745;
	    for (/**/; i_8_ < anInt1744; i_8_ += 4) {
		int i_12_ = anIntArray1742[i_8_ + 1];
		if (i_10_ < i_12_)
		    break;
		int i_13_ = anIntArray1742[i_8_];
		int i_14_ = anIntArray1742[i_8_ + 2];
		int i_15_ = anIntArray1742[i_8_ + 3];
		int i_16_ = (i_14_ - i_13_ << 16) / (i_15_ - i_12_);
		int i_17_ = (i_13_ << 16) + 32768;
		anIntArray1742[i_8_] = i_17_;
		anIntArray1742[i_8_ + 2] = i_16_;
	    }
	    for (int i_18_ = i_11_; i_18_ < i_8_; i_18_ += 4) {
		int i_19_ = anIntArray1742[i_18_ + 3];
		if (i_10_ >= i_19_) {
		    anIntArray1742[i_18_] = anIntArray1742[i_11_];
		    anIntArray1742[i_18_ + 1] = anIntArray1742[i_11_ + 1];
		    anIntArray1742[i_18_ + 2] = anIntArray1742[i_11_ + 2];
		    anIntArray1742[i_18_ + 3] = anIntArray1742[i_11_ + 3];
		    i_11_ += 4;
		}
	    }
	    if (i_11_ == anInt1744) {
		anInt1744 = 0;
		return false;
	    }
	    method2046(i_11_, i_8_);
	    anInt1745 = i_11_;
	    anInt1746 = i_8_;
	}
	anInt1743 = anIntArray1742[i_9_] >> 16;
	anInt1741 = anIntArray1742[i_9_ + 4] >> 16;
	anIntArray1742[i_9_] += anIntArray1742[i_9_ + 2];
	anIntArray1742[i_9_ + 4] += anIntArray1742[i_9_ + 6];
	i_9_ += 8;
	anInt1747 = i_9_;
	return true;
    }
    
    public static void method2040(Class173 class173, int[] is, int i,
				  int[] is_20_, int[] is_21_) {
	method2041(class173, is, 0, is.length, i, is_20_, is_21_);
    }
    
    static void method2041(Class173 class173, int[] is, int i, int i_22_,
			   int i_23_, int[] is_24_, int[] is_25_) {
	int[] is_26_ = new int[4];
	class173.method2207(is_26_);
	if (is_24_ != null && is_26_[3] - is_26_[1] != is_24_.length)
	    throw new IllegalStateException();
	method2042();
	method2055(is, i, i_22_);
	method2043(is_26_[1]);
	while (method2050(is_26_[3])) {
	    int i_27_ = anInt1743;
	    int i_28_ = anInt1741;
	    int i_29_ = anInt1740;
	    if (is_24_ != null) {
		int i_30_ = i_29_ - is_26_[1];
		if (i_27_ < is_24_[i_30_] + is_26_[0])
		    i_27_ = is_24_[i_30_] + is_26_[0];
		if (i_28_ > is_24_[i_30_] + is_25_[i_30_] + is_26_[0])
		    i_28_ = is_24_[i_30_] + is_25_[i_30_] + is_26_[0];
		if (i_28_ - i_27_ <= 0)
		    continue;
	    }
	    class173.method2218(i_27_, i_29_, i_28_ - i_27_, i_23_, 1);
	}
    }
    
    static void method2042() {
	anInt1744 = 0;
    }
    
    static void method2043(int i) {
	if (anInt1744 < 0) {
	    anInt1747 = 0;
	    anInt1746 = 0;
	    anInt1745 = 0;
	    anInt1740 = 2147483646;
	} else {
	    method2038(0, anInt1744);
	    int i_31_ = anIntArray1742[1];
	    if (i_31_ < i)
		i_31_ = i;
	    int i_32_ = 0;
	    int i_33_;
	    for (i_33_ = 0; i_33_ < anInt1744; i_33_ += 4) {
		int i_34_ = anIntArray1742[i_33_ + 1];
		if (i_31_ < i_34_)
		    break;
		int i_35_ = anIntArray1742[i_33_];
		int i_36_ = anIntArray1742[i_33_ + 2];
		int i_37_ = anIntArray1742[i_33_ + 3];
		int i_38_ = (i_36_ - i_35_ << 16) / (i_37_ - i_34_);
		int i_39_ = (i_35_ << 16) + 32768;
		anIntArray1742[i_33_] = i_39_ + (i_31_ - i_34_) * i_38_;
		anIntArray1742[i_33_ + 2] = i_38_;
	    }
	    anInt1745 = i_32_;
	    anInt1746 = i_33_;
	    anInt1747 = i_33_;
	    anInt1740 = i_31_ - 1;
	}
    }
    
    static void method2044(int i, int i_40_) {
	if (i_40_ > i + 4) {
	    int i_41_ = i;
	    int i_42_ = anIntArray1742[i_41_];
	    int i_43_ = anIntArray1742[i_41_ + 1];
	    int i_44_ = anIntArray1742[i_41_ + 2];
	    int i_45_ = anIntArray1742[i_41_ + 3];
	    for (int i_46_ = i + 4; i_46_ < i_40_; i_46_ += 4) {
		int i_47_ = anIntArray1742[i_46_ + 1];
		if (i_47_ < i_43_) {
		    anIntArray1742[i_41_] = anIntArray1742[i_46_];
		    anIntArray1742[i_41_ + 1] = i_47_;
		    anIntArray1742[i_41_ + 2] = anIntArray1742[i_46_ + 2];
		    anIntArray1742[i_41_ + 3] = anIntArray1742[i_46_ + 3];
		    i_41_ += 4;
		    anIntArray1742[i_46_] = anIntArray1742[i_41_];
		    anIntArray1742[i_46_ + 1] = anIntArray1742[i_41_ + 1];
		    anIntArray1742[i_46_ + 2] = anIntArray1742[i_41_ + 2];
		    anIntArray1742[i_46_ + 3] = anIntArray1742[i_41_ + 3];
		}
	    }
	    anIntArray1742[i_41_] = i_42_;
	    anIntArray1742[i_41_ + 1] = i_43_;
	    anIntArray1742[i_41_ + 2] = i_44_;
	    anIntArray1742[i_41_ + 3] = i_45_;
	    method2038(i, i_41_);
	    method2038(i_41_ + 4, i_40_);
	}
    }
    
    static void method2045() {
	anInt1744 = 0;
    }
    
    static void method2046(int i, int i_48_) {
	for (/**/; i_48_ >= i + 8; i_48_ -= 4) {
	    boolean bool = true;
	    for (int i_49_ = i + 4; i_49_ < i_48_; i_49_ += 4) {
		int i_50_ = anIntArray1742[i_49_ - 4];
		int i_51_ = anIntArray1742[i_49_];
		if (i_50_ > i_51_) {
		    bool = false;
		    anIntArray1742[i_49_ - 4] = i_51_;
		    anIntArray1742[i_49_] = i_50_;
		    i_50_ = anIntArray1742[i_49_ - 2];
		    anIntArray1742[i_49_ - 2] = anIntArray1742[i_49_ + 2];
		    anIntArray1742[i_49_ + 2] = i_50_;
		    i_50_ = anIntArray1742[i_49_ - 1];
		    anIntArray1742[i_49_ - 1] = anIntArray1742[i_49_ + 3];
		    anIntArray1742[i_49_ + 3] = i_50_;
		}
	    }
	    if (bool)
		break;
	}
    }
    
    static void method2047(int i) {
	if (anInt1744 < 0) {
	    anInt1747 = 0;
	    anInt1746 = 0;
	    anInt1745 = 0;
	    anInt1740 = 2147483646;
	} else {
	    method2038(0, anInt1744);
	    int i_52_ = anIntArray1742[1];
	    if (i_52_ < i)
		i_52_ = i;
	    int i_53_ = 0;
	    int i_54_;
	    for (i_54_ = 0; i_54_ < anInt1744; i_54_ += 4) {
		int i_55_ = anIntArray1742[i_54_ + 1];
		if (i_52_ < i_55_)
		    break;
		int i_56_ = anIntArray1742[i_54_];
		int i_57_ = anIntArray1742[i_54_ + 2];
		int i_58_ = anIntArray1742[i_54_ + 3];
		int i_59_ = (i_57_ - i_56_ << 16) / (i_58_ - i_55_);
		int i_60_ = (i_56_ << 16) + 32768;
		anIntArray1742[i_54_] = i_60_ + (i_52_ - i_55_) * i_59_;
		anIntArray1742[i_54_ + 2] = i_59_;
	    }
	    anInt1745 = i_53_;
	    anInt1746 = i_54_;
	    anInt1747 = i_54_;
	    anInt1740 = i_52_ - 1;
	}
    }
    
    static void method2048(int[] is, int i, int i_61_) {
	int i_62_ = anInt1744 + (i_61_ << 1);
	if (anIntArray1742 == null || anIntArray1742.length < i_62_) {
	    int[] is_63_ = new int[i_62_];
	    for (int i_64_ = 0; i_64_ < anInt1744; i_64_++)
		is_63_[i_64_] = anIntArray1742[i_64_];
	    anIntArray1742 = is_63_;
	}
	i_61_ += i;
	int i_65_ = i_61_ - 2;
	for (int i_66_ = i; i_66_ < i_61_; i_66_ += 2) {
	    int i_67_ = is[i_65_ + 1];
	    int i_68_ = is[i_66_ + 1];
	    if (i_67_ < i_68_) {
		anIntArray1742[anInt1744++] = is[i_65_];
		anIntArray1742[anInt1744++] = i_67_;
		anIntArray1742[anInt1744++] = is[i_66_];
		anIntArray1742[anInt1744++] = i_68_;
	    } else if (i_68_ < i_67_) {
		anIntArray1742[anInt1744++] = is[i_66_];
		anIntArray1742[anInt1744++] = i_68_;
		anIntArray1742[anInt1744++] = is[i_65_];
		anIntArray1742[anInt1744++] = i_67_;
	    }
	    i_65_ = i_66_;
	}
    }
    
    public static void method2049(Class173 class173, int[] is, int i) {
	method2041(class173, is, 0, is.length, i, null, null);
    }
    
    static boolean method2050(int i) {
	int i_69_ = anInt1746;
	int i_70_ = anInt1747;
	int i_71_ = anInt1740;
	int i_72_;
	for (/**/; i_70_ >= i_69_; i_70_ = i_72_) {
	    anInt1740 = ++i_71_;
	    if (i_71_ >= i)
		return false;
	    i_72_ = anInt1745;
	    for (/**/; i_69_ < anInt1744; i_69_ += 4) {
		int i_73_ = anIntArray1742[i_69_ + 1];
		if (i_71_ < i_73_)
		    break;
		int i_74_ = anIntArray1742[i_69_];
		int i_75_ = anIntArray1742[i_69_ + 2];
		int i_76_ = anIntArray1742[i_69_ + 3];
		int i_77_ = (i_75_ - i_74_ << 16) / (i_76_ - i_73_);
		int i_78_ = (i_74_ << 16) + 32768;
		anIntArray1742[i_69_] = i_78_;
		anIntArray1742[i_69_ + 2] = i_77_;
	    }
	    for (int i_79_ = i_72_; i_79_ < i_69_; i_79_ += 4) {
		int i_80_ = anIntArray1742[i_79_ + 3];
		if (i_71_ >= i_80_) {
		    anIntArray1742[i_79_] = anIntArray1742[i_72_];
		    anIntArray1742[i_79_ + 1] = anIntArray1742[i_72_ + 1];
		    anIntArray1742[i_79_ + 2] = anIntArray1742[i_72_ + 2];
		    anIntArray1742[i_79_ + 3] = anIntArray1742[i_72_ + 3];
		    i_72_ += 4;
		}
	    }
	    if (i_72_ == anInt1744) {
		anInt1744 = 0;
		return false;
	    }
	    method2046(i_72_, i_69_);
	    anInt1745 = i_72_;
	    anInt1746 = i_69_;
	}
	anInt1743 = anIntArray1742[i_70_] >> 16;
	anInt1741 = anIntArray1742[i_70_ + 4] >> 16;
	anIntArray1742[i_70_] += anIntArray1742[i_70_ + 2];
	anIntArray1742[i_70_ + 4] += anIntArray1742[i_70_ + 6];
	i_70_ += 8;
	anInt1747 = i_70_;
	return true;
    }
    
    static void method2051(int i) {
	if (anInt1744 < 0) {
	    anInt1747 = 0;
	    anInt1746 = 0;
	    anInt1745 = 0;
	    anInt1740 = 2147483646;
	} else {
	    method2038(0, anInt1744);
	    int i_81_ = anIntArray1742[1];
	    if (i_81_ < i)
		i_81_ = i;
	    int i_82_ = 0;
	    int i_83_;
	    for (i_83_ = 0; i_83_ < anInt1744; i_83_ += 4) {
		int i_84_ = anIntArray1742[i_83_ + 1];
		if (i_81_ < i_84_)
		    break;
		int i_85_ = anIntArray1742[i_83_];
		int i_86_ = anIntArray1742[i_83_ + 2];
		int i_87_ = anIntArray1742[i_83_ + 3];
		int i_88_ = (i_86_ - i_85_ << 16) / (i_87_ - i_84_);
		int i_89_ = (i_85_ << 16) + 32768;
		anIntArray1742[i_83_] = i_89_ + (i_81_ - i_84_) * i_88_;
		anIntArray1742[i_83_ + 2] = i_88_;
	    }
	    anInt1745 = i_82_;
	    anInt1746 = i_83_;
	    anInt1747 = i_83_;
	    anInt1740 = i_81_ - 1;
	}
    }
    
    static void method2052(int i, int i_90_) {
	for (/**/; i_90_ >= i + 8; i_90_ -= 4) {
	    boolean bool = true;
	    for (int i_91_ = i + 4; i_91_ < i_90_; i_91_ += 4) {
		int i_92_ = anIntArray1742[i_91_ - 4];
		int i_93_ = anIntArray1742[i_91_];
		if (i_92_ > i_93_) {
		    bool = false;
		    anIntArray1742[i_91_ - 4] = i_93_;
		    anIntArray1742[i_91_] = i_92_;
		    i_92_ = anIntArray1742[i_91_ - 2];
		    anIntArray1742[i_91_ - 2] = anIntArray1742[i_91_ + 2];
		    anIntArray1742[i_91_ + 2] = i_92_;
		    i_92_ = anIntArray1742[i_91_ - 1];
		    anIntArray1742[i_91_ - 1] = anIntArray1742[i_91_ + 3];
		    anIntArray1742[i_91_ + 3] = i_92_;
		}
	    }
	    if (bool)
		break;
	}
    }
    
    Class158() throws Throwable {
	throw new Error();
    }
    
    static void method2053(int i, int i_94_) {
	for (/**/; i_94_ >= i + 8; i_94_ -= 4) {
	    boolean bool = true;
	    for (int i_95_ = i + 4; i_95_ < i_94_; i_95_ += 4) {
		int i_96_ = anIntArray1742[i_95_ - 4];
		int i_97_ = anIntArray1742[i_95_];
		if (i_96_ > i_97_) {
		    bool = false;
		    anIntArray1742[i_95_ - 4] = i_97_;
		    anIntArray1742[i_95_] = i_96_;
		    i_96_ = anIntArray1742[i_95_ - 2];
		    anIntArray1742[i_95_ - 2] = anIntArray1742[i_95_ + 2];
		    anIntArray1742[i_95_ + 2] = i_96_;
		    i_96_ = anIntArray1742[i_95_ - 1];
		    anIntArray1742[i_95_ - 1] = anIntArray1742[i_95_ + 3];
		    anIntArray1742[i_95_ + 3] = i_96_;
		}
	    }
	    if (bool)
		break;
	}
    }
    
    static void method2054(int i, int i_98_) {
	for (/**/; i_98_ >= i + 8; i_98_ -= 4) {
	    boolean bool = true;
	    for (int i_99_ = i + 4; i_99_ < i_98_; i_99_ += 4) {
		int i_100_ = anIntArray1742[i_99_ - 4];
		int i_101_ = anIntArray1742[i_99_];
		if (i_100_ > i_101_) {
		    bool = false;
		    anIntArray1742[i_99_ - 4] = i_101_;
		    anIntArray1742[i_99_] = i_100_;
		    i_100_ = anIntArray1742[i_99_ - 2];
		    anIntArray1742[i_99_ - 2] = anIntArray1742[i_99_ + 2];
		    anIntArray1742[i_99_ + 2] = i_100_;
		    i_100_ = anIntArray1742[i_99_ - 1];
		    anIntArray1742[i_99_ - 1] = anIntArray1742[i_99_ + 3];
		    anIntArray1742[i_99_ + 3] = i_100_;
		}
	    }
	    if (bool)
		break;
	}
    }
    
    static void method2055(int[] is, int i, int i_102_) {
	int i_103_ = anInt1744 + (i_102_ << 1);
	if (anIntArray1742 == null || anIntArray1742.length < i_103_) {
	    int[] is_104_ = new int[i_103_];
	    for (int i_105_ = 0; i_105_ < anInt1744; i_105_++)
		is_104_[i_105_] = anIntArray1742[i_105_];
	    anIntArray1742 = is_104_;
	}
	i_102_ += i;
	int i_106_ = i_102_ - 2;
	for (int i_107_ = i; i_107_ < i_102_; i_107_ += 2) {
	    int i_108_ = is[i_106_ + 1];
	    int i_109_ = is[i_107_ + 1];
	    if (i_108_ < i_109_) {
		anIntArray1742[anInt1744++] = is[i_106_];
		anIntArray1742[anInt1744++] = i_108_;
		anIntArray1742[anInt1744++] = is[i_107_];
		anIntArray1742[anInt1744++] = i_109_;
	    } else if (i_109_ < i_108_) {
		anIntArray1742[anInt1744++] = is[i_107_];
		anIntArray1742[anInt1744++] = i_109_;
		anIntArray1742[anInt1744++] = is[i_106_];
		anIntArray1742[anInt1744++] = i_108_;
	    }
	    i_106_ = i_107_;
	}
    }
}
