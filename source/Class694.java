/* Class694 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class694
{
    static final int anInt8698 = 0;
    static final int anInt8699 = 1;
    static final int anInt8700 = 23;
    static final int anInt8701 = 16;
    static final int anInt8702 = 4096;
    static final int anInt8703 = 6;
    static final int anInt8704 = 50;
    static Class687 aClass687_8705 = new Class687();
    
    static byte method8166(Class687 class687) {
	return (byte) method8170(8, class687);
    }
    
    public static int method8167(byte[] is, int i, byte[] is_0_, int i_1_,
				 int i_2_) {
	synchronized (aClass687_8705) {
	    ((Class687) aClass687_8705).aByteArray8645 = is_0_;
	    ((Class687) aClass687_8705).anInt8632 = i_2_ * -1784821705;
	    ((Class687) aClass687_8705).aByteArray8625 = is;
	    ((Class687) aClass687_8705).anInt8622 = 0;
	    ((Class687) aClass687_8705).anInt8627 = i * 1082849625;
	    ((Class687) aClass687_8705).anInt8631 = 0;
	    ((Class687) aClass687_8705).anInt8637 = 0;
	    ((Class687) aClass687_8705).anInt8624 = 0;
	    ((Class687) aClass687_8705).anInt8628 = 0;
	    method8168(aClass687_8705);
	    i -= ((Class687) aClass687_8705).anInt8627 * 1051442921;
	    ((Class687) aClass687_8705).aByteArray8645 = null;
	    ((Class687) aClass687_8705).aByteArray8625 = null;
	    int i_3_ = i;
	    return i_3_;
	}
    }
    
    static void method8168(Class687 class687) {
	boolean bool = false;
	boolean bool_4_ = false;
	boolean bool_5_ = false;
	boolean bool_6_ = false;
	boolean bool_7_ = false;
	boolean bool_8_ = false;
	boolean bool_9_ = false;
	boolean bool_10_ = false;
	boolean bool_11_ = false;
	boolean bool_12_ = false;
	boolean bool_13_ = false;
	boolean bool_14_ = false;
	boolean bool_15_ = false;
	boolean bool_16_ = false;
	boolean bool_17_ = false;
	boolean bool_18_ = false;
	boolean bool_19_ = false;
	boolean bool_20_ = false;
	int i = 0;
	int[] is = null;
	int[] is_21_ = null;
	int[] is_22_ = null;
	((Class687) class687).anInt8633 = 876843499;
	if (Class558.anIntArray7479 == null)
	    Class558.anIntArray7479
		= new int[((Class687) class687).anInt8633 * 551963616];
	boolean bool_23_ = true;
	while (bool_23_) {
	    byte i_24_ = method8166(class687);
	    if (i_24_ == 23)
		break;
	    i_24_ = method8166(class687);
	    i_24_ = method8166(class687);
	    i_24_ = method8166(class687);
	    i_24_ = method8166(class687);
	    i_24_ = method8166(class687);
	    i_24_ = method8166(class687);
	    i_24_ = method8166(class687);
	    i_24_ = method8166(class687);
	    i_24_ = method8166(class687);
	    i_24_ = method8172(class687);
	    if (i_24_ == 0) {
		/* empty */
	    }
	    ((Class687) class687).anInt8634 = 0;
	    int i_25_ = method8166(class687);
	    ((Class687) class687).anInt8634
		= (((Class687) class687).anInt8634 * 878045701 << 8
		   | i_25_ & 0xff) * -140094771;
	    i_25_ = method8166(class687);
	    ((Class687) class687).anInt8634
		= (((Class687) class687).anInt8634 * 878045701 << 8
		   | i_25_ & 0xff) * -140094771;
	    i_25_ = method8166(class687);
	    ((Class687) class687).anInt8634
		= (((Class687) class687).anInt8634 * 878045701 << 8
		   | i_25_ & 0xff) * -140094771;
	    for (int i_26_ = 0; i_26_ < 16; i_26_++) {
		i_24_ = method8172(class687);
		if (i_24_ == 1)
		    ((Class687) class687).aBoolArray8642[i_26_] = true;
		else
		    ((Class687) class687).aBoolArray8642[i_26_] = false;
	    }
	    for (int i_27_ = 0; i_27_ < 256; i_27_++)
		((Class687) class687).aBoolArray8653[i_27_] = false;
	    for (int i_28_ = 0; i_28_ < 16; i_28_++) {
		if (((Class687) class687).aBoolArray8642[i_28_]) {
		    for (int i_29_ = 0; i_29_ < 16; i_29_++) {
			i_24_ = method8172(class687);
			if (i_24_ == 1)
			    ((Class687) class687).aBoolArray8653[(i_28_ * 16
								  + i_29_)]
				= true;
		    }
		}
	    }
	    method8169(class687);
	    int i_30_ = ((Class687) class687).anInt8640 * 2050536175 + 2;
	    int i_31_ = method8170(3, class687);
	    int i_32_ = method8170(15, class687);
	    for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
		int i_34_ = 0;
		for (;;) {
		    i_24_ = method8172(class687);
		    if (i_24_ == 0)
			break;
		    i_34_++;
		}
		((Class687) class687).aByteArray8638[i_33_] = (byte) i_34_;
	    }
	    byte[] is_35_ = new byte[6];
	    for (byte i_36_ = 0; i_36_ < i_31_; i_36_++)
		is_35_[i_36_] = i_36_;
	    for (int i_37_ = 0; i_37_ < i_32_; i_37_++) {
		byte i_38_ = ((Class687) class687).aByteArray8638[i_37_];
		byte i_39_ = is_35_[i_38_];
		for (/**/; i_38_ > 0; i_38_--)
		    is_35_[i_38_] = is_35_[i_38_ - 1];
		is_35_[0] = i_39_;
		((Class687) class687).aByteArray8646[i_37_] = i_39_;
	    }
	    for (int i_40_ = 0; i_40_ < i_31_; i_40_++) {
		int i_41_ = method8170(5, class687);
		for (int i_42_ = 0; i_42_ < i_30_; i_42_++) {
		    for (;;) {
			i_24_ = method8172(class687);
			if (i_24_ == 0)
			    break;
			i_24_ = method8172(class687);
			if (i_24_ == 0)
			    i_41_++;
			else
			    i_41_--;
		    }
		    ((Class687) class687).aByteArrayArray8648[i_40_][i_42_]
			= (byte) i_41_;
		}
	    }
	    for (int i_43_ = 0; i_43_ < i_31_; i_43_++) {
		int i_44_ = 32;
		byte i_45_ = 0;
		for (int i_46_ = 0; i_46_ < i_30_; i_46_++) {
		    if (((Class687) class687).aByteArrayArray8648[i_43_][i_46_]
			> i_45_)
			i_45_ = (((Class687) class687).aByteArrayArray8648
				 [i_43_][i_46_]);
		    if (((Class687) class687).aByteArrayArray8648[i_43_][i_46_]
			< i_44_)
			i_44_ = (((Class687) class687).aByteArrayArray8648
				 [i_43_][i_46_]);
		}
		method8171(((Class687) class687).anIntArrayArray8649[i_43_],
			   ((Class687) class687).anIntArrayArray8650[i_43_],
			   ((Class687) class687).anIntArrayArray8651[i_43_],
			   ((Class687) class687).aByteArrayArray8648[i_43_],
			   i_44_, i_45_, i_30_);
		((Class687) class687).anIntArray8652[i_43_] = i_44_;
	    }
	    int i_47_ = ((Class687) class687).anInt8640 * 2050536175 + 1;
	    int i_48_ = -1;
	    int i_49_ = 0;
	    for (int i_50_ = 0; i_50_ <= 255; i_50_++)
		((Class687) class687).anIntArray8626[i_50_] = 0;
	    int i_51_ = 4095;
	    for (int i_52_ = 15; i_52_ >= 0; i_52_--) {
		for (int i_53_ = 15; i_53_ >= 0; i_53_--) {
		    ((Class687) class687).aByteArray8644[i_51_]
			= (byte) (i_52_ * 16 + i_53_);
		    i_51_--;
		}
		((Class687) class687).anIntArray8629[i_52_] = i_51_ + 1;
	    }
	    int i_54_ = 0;
	    if (i_49_ == 0) {
		i_48_++;
		i_49_ = 50;
		byte i_55_ = ((Class687) class687).aByteArray8646[i_48_];
		i = ((Class687) class687).anIntArray8652[i_55_];
		is = ((Class687) class687).anIntArrayArray8649[i_55_];
		is_22_ = ((Class687) class687).anIntArrayArray8651[i_55_];
		is_21_ = ((Class687) class687).anIntArrayArray8650[i_55_];
	    }
	    i_49_--;
	    int i_56_ = i;
	    int i_57_;
	    int i_58_;
	    for (i_58_ = method8170(i_56_, class687); i_58_ > is[i_56_];
		 i_58_ = i_58_ << 1 | i_57_) {
		i_56_++;
		i_57_ = method8172(class687);
	    }
	    int i_59_ = is_22_[i_58_ - is_21_[i_56_]];
	    while (i_59_ != i_47_) {
		if (i_59_ == 0 || i_59_ == 1) {
		    int i_60_ = -1;
		    int i_61_ = 1;
		    do {
			if (i_59_ == 0)
			    i_60_ += 1 * i_61_;
			else if (i_59_ == 1)
			    i_60_ += 2 * i_61_;
			i_61_ *= 2;
			if (i_49_ == 0) {
			    i_48_++;
			    i_49_ = 50;
			    byte i_62_
				= ((Class687) class687).aByteArray8646[i_48_];
			    i = ((Class687) class687).anIntArray8652[i_62_];
			    is = (((Class687) class687).anIntArrayArray8649
				  [i_62_]);
			    is_22_ = (((Class687) class687).anIntArrayArray8651
				      [i_62_]);
			    is_21_ = (((Class687) class687).anIntArrayArray8650
				      [i_62_]);
			}
			i_49_--;
			i_56_ = i;
			for (i_58_ = method8170(i_56_, class687);
			     i_58_ > is[i_56_]; i_58_ = i_58_ << 1 | i_57_) {
			    i_56_++;
			    i_57_ = method8172(class687);
			}
			i_59_ = is_22_[i_58_ - is_21_[i_56_]];
		    } while (i_59_ == 0 || i_59_ == 1);
		    i_60_++;
		    i_25_ = (((Class687) class687).aByteArray8643
			     [((((Class687) class687).aByteArray8644
				[((Class687) class687).anIntArray8629[0]])
			       & 0xff)]);
		    ((Class687) class687).anIntArray8626[i_25_ & 0xff]
			+= i_60_;
		    for (/**/; i_60_ > 0; i_60_--) {
			Class558.anIntArray7479[i_54_] = i_25_ & 0xff;
			i_54_++;
		    }
		} else {
		    int i_63_ = i_59_ - 1;
		    if (i_63_ < 16) {
			int i_64_ = ((Class687) class687).anIntArray8629[0];
			i_24_ = (((Class687) class687).aByteArray8644
				 [i_64_ + i_63_]);
			for (/**/; i_63_ > 3; i_63_ -= 4) {
			    int i_65_ = i_64_ + i_63_;
			    ((Class687) class687).aByteArray8644[i_65_]
				= (((Class687) class687).aByteArray8644
				   [i_65_ - 1]);
			    ((Class687) class687).aByteArray8644[i_65_ - 1]
				= (((Class687) class687).aByteArray8644
				   [i_65_ - 2]);
			    ((Class687) class687).aByteArray8644[i_65_ - 2]
				= (((Class687) class687).aByteArray8644
				   [i_65_ - 3]);
			    ((Class687) class687).aByteArray8644[i_65_ - 3]
				= (((Class687) class687).aByteArray8644
				   [i_65_ - 4]);
			}
			for (/**/; i_63_ > 0; i_63_--)
			    ((Class687) class687).aByteArray8644[i_64_ + i_63_]
				= (((Class687) class687).aByteArray8644
				   [i_64_ + i_63_ - 1]);
			((Class687) class687).aByteArray8644[i_64_] = i_24_;
		    } else {
			int i_66_ = i_63_ / 16;
			int i_67_ = i_63_ % 16;
			int i_68_
			    = (((Class687) class687).anIntArray8629[i_66_]
			       + i_67_);
			i_24_ = ((Class687) class687).aByteArray8644[i_68_];
			for (/**/;
			     (i_68_
			      > ((Class687) class687).anIntArray8629[i_66_]);
			     i_68_--)
			    ((Class687) class687).aByteArray8644[i_68_]
				= (((Class687) class687).aByteArray8644
				   [i_68_ - 1]);
			((Class687) class687).anIntArray8629[i_66_]++;
			for (/**/; i_66_ > 0; i_66_--) {
			    ((Class687) class687).anIntArray8629[i_66_]--;
			    ((Class687) class687).aByteArray8644
				[((Class687) class687).anIntArray8629[i_66_]]
				= (((Class687) class687).aByteArray8644
				   [(((Class687) class687).anIntArray8629
				     [i_66_ - 1]) + 16 - 1]);
			}
			((Class687) class687).anIntArray8629[0]--;
			((Class687) class687).aByteArray8644
			    [((Class687) class687).anIntArray8629[0]]
			    = i_24_;
			if (((Class687) class687).anIntArray8629[0] == 0) {
			    i_51_ = 4095;
			    for (int i_69_ = 15; i_69_ >= 0; i_69_--) {
				for (int i_70_ = 15; i_70_ >= 0; i_70_--) {
				    ((Class687) class687).aByteArray8644[i_51_]
					= (((Class687) class687).aByteArray8644
					   [(((Class687) class687)
					     .anIntArray8629[i_69_]) + i_70_]);
				    i_51_--;
				}
				((Class687) class687).anIntArray8629[i_69_]
				    = i_51_ + 1;
			    }
			}
		    }
		    ((Class687) class687).anIntArray8626
			[(((Class687) class687).aByteArray8643[i_24_ & 0xff]
			  & 0xff)]++;
		    Class558.anIntArray7479[i_54_]
			= (((Class687) class687).aByteArray8643[i_24_ & 0xff]
			   & 0xff);
		    i_54_++;
		    if (i_49_ == 0) {
			i_48_++;
			i_49_ = 50;
			byte i_71_
			    = ((Class687) class687).aByteArray8646[i_48_];
			i = ((Class687) class687).anIntArray8652[i_71_];
			is = ((Class687) class687).anIntArrayArray8649[i_71_];
			is_22_
			    = ((Class687) class687).anIntArrayArray8651[i_71_];
			is_21_
			    = ((Class687) class687).anIntArrayArray8650[i_71_];
		    }
		    i_49_--;
		    i_56_ = i;
		    for (i_58_ = method8170(i_56_, class687);
			 i_58_ > is[i_56_]; i_58_ = i_58_ << 1 | i_57_) {
			i_56_++;
			i_57_ = method8172(class687);
		    }
		    i_59_ = is_22_[i_58_ - is_21_[i_56_]];
		}
	    }
	    ((Class687) class687).anInt8630 = 0;
	    ((Class687) class687).aByte8619 = (byte) 0;
	    ((Class687) class687).anIntArray8639[0] = 0;
	    for (int i_72_ = 1; i_72_ <= 256; i_72_++)
		((Class687) class687).anIntArray8639[i_72_]
		    = ((Class687) class687).anIntArray8626[i_72_ - 1];
	    for (int i_73_ = 1; i_73_ <= 256; i_73_++)
		((Class687) class687).anIntArray8639[i_73_]
		    += ((Class687) class687).anIntArray8639[i_73_ - 1];
	    for (int i_74_ = 0; i_74_ < i_54_; i_74_++) {
		i_25_ = (byte) (Class558.anIntArray7479[i_74_] & 0xff);
		Class558.anIntArray7479[(((Class687) class687).anIntArray8639
					 [i_25_ & 0xff])]
		    |= i_74_ << 8;
		((Class687) class687).anIntArray8639[i_25_ & 0xff]++;
	    }
	    ((Class687) class687).anInt8635
		= ((Class558.anIntArray7479
		    [((Class687) class687).anInt8634 * 878045701])
		   >> 8) * -2037340563;
	    ((Class687) class687).anInt8616 = 0;
	    ((Class687) class687).anInt8635
		= Class558.anIntArray7479[(((Class687) class687).anInt8635
					   * -415411355)] * -2037340563;
	    ((Class687) class687).anInt8618
		= ((byte) (((Class687) class687).anInt8635 * -415411355 & 0xff)
		   * -1155655003);
	    Class687 class687_75_;
	    ((Class687) (class687_75_ = class687)).anInt8635
		= ((((Class687) class687_75_).anInt8635 * -415411355 >> 8)
		   * -2037340563);
	    ((Class687) class687).anInt8616 += 298991137;
	    ((Class687) class687).anInt8636 = i_54_ * -2128768147;
	    method8173(class687);
	    if ((((Class687) class687).anInt8616 * 1869137377
		 == ((Class687) class687).anInt8636 * -932417947 + 1)
		&& ((Class687) class687).anInt8630 * 1741776463 == 0)
		bool_23_ = true;
	    else
		bool_23_ = false;
	}
    }
    
    static void method8169(Class687 class687) {
	((Class687) class687).anInt8640 = 0;
	for (int i = 0; i < 256; i++) {
	    if (((Class687) class687).aBoolArray8653[i]) {
		((Class687) class687).aByteArray8643
		    [((Class687) class687).anInt8640 * 2050536175]
		    = (byte) i;
		((Class687) class687).anInt8640 += 1763359759;
	    }
	}
    }
    
    static int method8170(int i, Class687 class687) {
	for (;;) {
	    if (((Class687) class687).anInt8631 * -215825161 >= i) {
		int i_76_
		    = ((((Class687) class687).anInt8637 * 1108628467
			>> ((Class687) class687).anInt8631 * -215825161 - i)
		       & (1 << i) - 1);
		((Class687) class687).anInt8631 -= i * -739689273;
		return i_76_;
	    }
	    ((Class687) class687).anInt8637
		= ((((Class687) class687).anInt8637 * 1108628467 << 8
		    | (((Class687) class687).aByteArray8645
		       [((Class687) class687).anInt8632 * -757830265]) & 0xff)
		   * 1646361915);
	    ((Class687) class687).anInt8631 += -1622546888;
	    ((Class687) class687).anInt8632 += -1784821705;
	    ((Class687) class687).anInt8624 += 568938857;
	    if (((Class687) class687).anInt8624 * -578007335 == 0) {
		/* empty */
	    }
	}
    }
    
    static void method8171(int[] is, int[] is_77_, int[] is_78_, byte[] is_79_,
			   int i, int i_80_, int i_81_) {
	int i_82_ = 0;
	for (int i_83_ = i; i_83_ <= i_80_; i_83_++) {
	    for (int i_84_ = 0; i_84_ < i_81_; i_84_++) {
		if (is_79_[i_84_] == i_83_) {
		    is_78_[i_82_] = i_84_;
		    i_82_++;
		}
	    }
	}
	for (int i_85_ = 0; i_85_ < 23; i_85_++)
	    is_77_[i_85_] = 0;
	for (int i_86_ = 0; i_86_ < i_81_; i_86_++)
	    is_77_[is_79_[i_86_] + 1]++;
	for (int i_87_ = 1; i_87_ < 23; i_87_++)
	    is_77_[i_87_] += is_77_[i_87_ - 1];
	for (int i_88_ = 0; i_88_ < 23; i_88_++)
	    is[i_88_] = 0;
	int i_89_ = 0;
	for (int i_90_ = i; i_90_ <= i_80_; i_90_++) {
	    i_89_ += is_77_[i_90_ + 1] - is_77_[i_90_];
	    is[i_90_] = i_89_ - 1;
	    i_89_ <<= 1;
	}
	for (int i_91_ = i + 1; i_91_ <= i_80_; i_91_++)
	    is_77_[i_91_] = (is[i_91_ - 1] + 1 << 1) - is_77_[i_91_];
    }
    
    static byte method8172(Class687 class687) {
	return (byte) method8170(1, class687);
    }
    
    static void method8173(Class687 class687) {
	byte i = ((Class687) class687).aByte8619;
	int i_92_ = ((Class687) class687).anInt8630 * 1741776463;
	int i_93_ = ((Class687) class687).anInt8616 * 1869137377;
	int i_94_ = ((Class687) class687).anInt8618 * -13877971;
	int[] is = Class558.anIntArray7479;
	int i_95_ = ((Class687) class687).anInt8635 * -415411355;
	byte[] is_96_ = ((Class687) class687).aByteArray8625;
	int i_97_ = ((Class687) class687).anInt8622 * 1285574585;
	int i_98_ = ((Class687) class687).anInt8627 * 1051442921;
	int i_99_ = i_98_;
	int i_100_ = ((Class687) class687).anInt8636 * -932417947 + 1;
    while_57_:
	for (;;) {
	    if (i_92_ > 0) {
		for (;;) {
		    if (i_98_ == 0)
			break while_57_;
		    if (i_92_ == 1)
			break;
		    is_96_[i_97_] = i;
		    i_92_--;
		    i_97_++;
		    i_98_--;
		}
		if (i_98_ == 0) {
		    i_92_ = 1;
		    break;
		}
		is_96_[i_97_] = i;
		i_97_++;
		i_98_--;
	    }
	    for (;;) {
		if (i_93_ == i_100_) {
		    i_92_ = 0;
		    break while_57_;
		}
		i = (byte) i_94_;
		i_95_ = is[i_95_];
		int i_101_ = (byte) i_95_;
		i_95_ >>= 8;
		i_93_++;
		if (i_101_ != i_94_) {
		    i_94_ = i_101_;
		    if (i_98_ == 0) {
			i_92_ = 1;
			break while_57_;
		    }
		    is_96_[i_97_] = i;
		    i_97_++;
		    i_98_--;
		} else {
		    if (i_93_ != i_100_)
			break;
		    if (i_98_ == 0) {
			i_92_ = 1;
			break while_57_;
		    }
		    is_96_[i_97_] = i;
		    i_97_++;
		    i_98_--;
		}
	    }
	    i_92_ = 2;
	    i_95_ = is[i_95_];
	    int i_102_ = (byte) i_95_;
	    i_95_ >>= 8;
	    if (++i_93_ != i_100_) {
		if (i_102_ != i_94_)
		    i_94_ = i_102_;
		else {
		    i_92_ = 3;
		    i_95_ = is[i_95_];
		    i_102_ = (byte) i_95_;
		    i_95_ >>= 8;
		    if (++i_93_ != i_100_) {
			if (i_102_ != i_94_)
			    i_94_ = i_102_;
			else {
			    i_95_ = is[i_95_];
			    i_102_ = (byte) i_95_;
			    i_95_ >>= 8;
			    i_93_++;
			    i_92_ = (i_102_ & 0xff) + 4;
			    i_95_ = is[i_95_];
			    i_94_ = (byte) i_95_;
			    i_95_ >>= 8;
			    i_93_++;
			}
		    }
		}
	    }
	}
	int i_103_ = ((Class687) class687).anInt8628 * -1324463885;
	((Class687) class687).anInt8628 += (i_99_ - i_98_) * 667029563;
	if (((Class687) class687).anInt8628 * -1324463885 >= i_103_) {
	    /* empty */
	}
	((Class687) class687).aByte8619 = i;
	((Class687) class687).anInt8630 = i_92_ * -1379929937;
	((Class687) class687).anInt8616 = i_93_ * 298991137;
	((Class687) class687).anInt8618 = i_94_ * -1155655003;
	Class558.anIntArray7479 = is;
	((Class687) class687).anInt8635 = i_95_ * -2037340563;
	((Class687) class687).aByteArray8625 = is_96_;
	((Class687) class687).anInt8622 = i_97_ * 1418659465;
	((Class687) class687).anInt8627 = i_98_ * 1082849625;
    }
    
    Class694() throws Throwable {
	throw new Error();
    }
}
