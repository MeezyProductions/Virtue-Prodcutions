/* Class412 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public abstract class Class412
{
    short[] aShortArray4714;
    static final int anInt4715 = 4096;
    public static int[] anIntArray4716 = new int[4096];
    static final int anInt4717 = 4095;
    short[] aShortArray4718 = new short[512];
    int anInt4719 = 0;
    int anInt4720 = 4;
    int anInt4721 = 4;
    int anInt4722 = 4;
    int anInt4723 = 4;
    static final int anInt4724 = 12;
    
    void method4907(int i, int i_0_, int i_1_) {
	int[] is = new int[i];
	int[] is_2_ = new int[i_0_];
	int[] is_3_ = new int[i_1_];
	for (int i_4_ = 0; i_4_ < i; i_4_++)
	    is[i_4_] = (i_4_ << 12) / i;
	for (int i_5_ = 0; i_5_ < i_0_; i_5_++)
	    is_2_[i_5_] = (i_5_ << 12) / i_0_;
	for (int i_6_ = 0; i_6_ < i_1_; i_6_++)
	    is_3_[i_6_] = (i_6_ << 12) / i_1_;
	method4916();
	for (int i_7_ = 0; i_7_ < i_1_; i_7_++) {
	    for (int i_8_ = 0; i_8_ < i_0_; i_8_++) {
		for (int i_9_ = 0; i_9_ < i; i_9_++) {
		    for (int i_10_ = 0; i_10_ < ((Class412) this).anInt4723;
			 i_10_++) {
			int i_11_
			    = ((Class412) this).aShortArray4714[i_10_] << 12;
			int i_12_ = ((Class412) this).anInt4720 * i_11_ >> 12;
			int i_13_ = ((Class412) this).anInt4721 * i_11_ >> 12;
			int i_14_ = ((Class412) this).anInt4722 * i_11_ >> 12;
			int i_15_ = is[i_9_] * i_11_ >> 12;
			int i_16_ = is_2_[i_8_] * i_11_ >> 12;
			int i_17_ = is_3_[i_7_] * i_11_ >> 12;
			i_15_ *= ((Class412) this).anInt4720;
			i_16_ *= ((Class412) this).anInt4721;
			i_17_ *= ((Class412) this).anInt4722;
			int i_18_ = i_15_ >> 12;
			int i_19_ = i_18_ + 1;
			i_18_ &= 0xff;
			int i_20_ = i_16_ >> 12;
			int i_21_ = i_20_ + 1;
			i_20_ &= 0xff;
			int i_22_ = i_17_ >> 12;
			int i_23_ = i_22_ + 1;
			i_22_ &= 0xff;
			if (i_19_ >= i_12_)
			    i_19_ = 0;
			else
			    i_19_ &= 0xff;
			if (i_21_ >= i_13_)
			    i_21_ = 0;
			else
			    i_21_ &= 0xff;
			if (i_23_ >= i_14_)
			    i_23_ = 0;
			else
			    i_23_ &= 0xff;
			i_15_ &= 0xfff;
			i_16_ &= 0xfff;
			i_17_ &= 0xfff;
			int i_24_ = anIntArray4716[i_15_];
			int i_25_ = anIntArray4716[i_16_];
			int i_26_ = anIntArray4716[i_17_];
			int i_27_ = i_15_ - 4096;
			int i_28_ = i_16_ - 4096;
			int i_29_ = i_17_ - 4096;
			int i_30_ = ((Class412) this).aShortArray4718[i_22_];
			int i_31_ = ((Class412) this).aShortArray4718[i_23_];
			int i_32_
			    = ((Class412) this).aShortArray4718[i_20_ + i_30_];
			int i_33_
			    = ((Class412) this).aShortArray4718[i_21_ + i_30_];
			int i_34_
			    = ((Class412) this).aShortArray4718[i_20_ + i_31_];
			int i_35_
			    = ((Class412) this).aShortArray4718[i_21_ + i_31_];
			int i_36_
			    = method4915((((Class412) this).aShortArray4718
					  [i_18_ + i_32_]),
					 i_15_, i_16_, i_17_);
			int i_37_
			    = method4915((((Class412) this).aShortArray4718
					  [i_19_ + i_32_]),
					 i_27_, i_16_, i_17_);
			int i_38_ = i_36_ + (i_24_ * (i_37_ - i_36_) >> 12);
			i_36_ = method4915((((Class412) this).aShortArray4718
					    [i_18_ + i_33_]),
					   i_15_, i_28_, i_17_);
			i_37_ = method4915((((Class412) this).aShortArray4718
					    [i_19_ + i_33_]),
					   i_27_, i_28_, i_17_);
			int i_39_ = i_36_ + (i_24_ * (i_37_ - i_36_) >> 12);
			int i_40_ = i_38_ + (i_25_ * (i_39_ - i_38_) >> 12);
			i_36_ = method4915((((Class412) this).aShortArray4718
					    [i_18_ + i_34_]),
					   i_15_, i_16_, i_29_);
			i_37_ = method4915((((Class412) this).aShortArray4718
					    [i_19_ + i_34_]),
					   i_27_, i_16_, i_29_);
			i_38_ = i_36_ + (i_24_ * (i_37_ - i_36_) >> 12);
			i_36_ = method4915((((Class412) this).aShortArray4718
					    [i_18_ + i_35_]),
					   i_15_, i_28_, i_29_);
			i_37_ = method4915((((Class412) this).aShortArray4718
					    [i_19_ + i_35_]),
					   i_27_, i_28_, i_29_);
			i_39_ = i_36_ + (i_24_ * (i_37_ - i_36_) >> 12);
			int i_41_ = i_38_ + (i_25_ * (i_39_ - i_38_) >> 12);
			method4910(i_10_,
				   i_40_ + (i_26_ * (i_41_ - i_40_) >> 12));
		    }
		    method4912();
		}
	    }
	}
    }
    
    void method4908() {
	Random random = new Random((long) ((Class412) this).anInt4719);
	for (int i = 0; i < 255; i++)
	    ((Class412) this).aShortArray4718[i] = (short) i;
	for (int i = 0; i < 255; i++) {
	    int i_42_ = 255 - i;
	    int i_43_ = Class511_Sub6.method9346(random, i_42_, -625940207);
	    short i_44_ = ((Class412) this).aShortArray4718[i_43_];
	    ((Class412) this).aShortArray4718[i_43_]
		= ((Class412) this).aShortArray4718[i_42_];
	    ((Class412) this).aShortArray4718[i_42_]
		= ((Class412) this).aShortArray4718[i_42_ + 256] = i_44_;
	}
    }
    
    abstract void method4909(int i, int i_45_);
    
    abstract void method4910(int i, int i_46_);
    
    void method4911() {
	((Class412) this).aShortArray4714
	    = new short[((Class412) this).anInt4723];
	for (int i = 0; i < ((Class412) this).anInt4723; i++)
	    ((Class412) this).aShortArray4714[i]
		= (short) (int) Math.pow(2.0, (double) i);
    }
    
    abstract void method4912();
    
    static {
	for (int i = 0; i < 4096; i++)
	    anIntArray4716[i] = method4913(i);
    }
    
    static final int method4913(int i) {
	int i_47_ = i * (i * i >> 12) >> 12;
	int i_48_ = i * 6 - 61440;
	int i_49_ = 40960 + (i_48_ * i >> 12);
	return i_49_ * i_47_ >> 12;
    }
    
    abstract void method4914();
    
    static int method4915(int i, int i_50_, int i_51_, int i_52_) {
	int i_53_ = i & 0xf;
	int i_54_ = i_53_ < 8 ? i_50_ : i_51_;
	int i_55_
	    = i_53_ < 4 ? i_51_ : i_53_ == 12 || i_53_ == 14 ? i_50_ : i_52_;
	return (((i_53_ & 0x1) == 0 ? i_54_ : -i_54_)
		+ ((i_53_ & 0x2) == 0 ? i_55_ : -i_55_));
    }
    
    abstract void method4916();
    
    abstract void method4917();
    
    abstract void method4918();
    
    abstract void method4919(int i, int i_56_);
    
    abstract void method4920(int i, int i_57_);
    
    void method4921(int i, int i_58_, int i_59_) {
	int[] is = new int[i];
	int[] is_60_ = new int[i_58_];
	int[] is_61_ = new int[i_59_];
	for (int i_62_ = 0; i_62_ < i; i_62_++)
	    is[i_62_] = (i_62_ << 12) / i;
	for (int i_63_ = 0; i_63_ < i_58_; i_63_++)
	    is_60_[i_63_] = (i_63_ << 12) / i_58_;
	for (int i_64_ = 0; i_64_ < i_59_; i_64_++)
	    is_61_[i_64_] = (i_64_ << 12) / i_59_;
	method4916();
	for (int i_65_ = 0; i_65_ < i_59_; i_65_++) {
	    for (int i_66_ = 0; i_66_ < i_58_; i_66_++) {
		for (int i_67_ = 0; i_67_ < i; i_67_++) {
		    for (int i_68_ = 0; i_68_ < ((Class412) this).anInt4723;
			 i_68_++) {
			int i_69_
			    = ((Class412) this).aShortArray4714[i_68_] << 12;
			int i_70_ = ((Class412) this).anInt4720 * i_69_ >> 12;
			int i_71_ = ((Class412) this).anInt4721 * i_69_ >> 12;
			int i_72_ = ((Class412) this).anInt4722 * i_69_ >> 12;
			int i_73_ = is[i_67_] * i_69_ >> 12;
			int i_74_ = is_60_[i_66_] * i_69_ >> 12;
			int i_75_ = is_61_[i_65_] * i_69_ >> 12;
			i_73_ *= ((Class412) this).anInt4720;
			i_74_ *= ((Class412) this).anInt4721;
			i_75_ *= ((Class412) this).anInt4722;
			int i_76_ = i_73_ >> 12;
			int i_77_ = i_76_ + 1;
			i_76_ &= 0xff;
			int i_78_ = i_74_ >> 12;
			int i_79_ = i_78_ + 1;
			i_78_ &= 0xff;
			int i_80_ = i_75_ >> 12;
			int i_81_ = i_80_ + 1;
			i_80_ &= 0xff;
			if (i_77_ >= i_70_)
			    i_77_ = 0;
			else
			    i_77_ &= 0xff;
			if (i_79_ >= i_71_)
			    i_79_ = 0;
			else
			    i_79_ &= 0xff;
			if (i_81_ >= i_72_)
			    i_81_ = 0;
			else
			    i_81_ &= 0xff;
			i_73_ &= 0xfff;
			i_74_ &= 0xfff;
			i_75_ &= 0xfff;
			int i_82_ = anIntArray4716[i_73_];
			int i_83_ = anIntArray4716[i_74_];
			int i_84_ = anIntArray4716[i_75_];
			int i_85_ = i_73_ - 4096;
			int i_86_ = i_74_ - 4096;
			int i_87_ = i_75_ - 4096;
			int i_88_ = ((Class412) this).aShortArray4718[i_80_];
			int i_89_ = ((Class412) this).aShortArray4718[i_81_];
			int i_90_
			    = ((Class412) this).aShortArray4718[i_78_ + i_88_];
			int i_91_
			    = ((Class412) this).aShortArray4718[i_79_ + i_88_];
			int i_92_
			    = ((Class412) this).aShortArray4718[i_78_ + i_89_];
			int i_93_
			    = ((Class412) this).aShortArray4718[i_79_ + i_89_];
			int i_94_
			    = method4915((((Class412) this).aShortArray4718
					  [i_76_ + i_90_]),
					 i_73_, i_74_, i_75_);
			int i_95_
			    = method4915((((Class412) this).aShortArray4718
					  [i_77_ + i_90_]),
					 i_85_, i_74_, i_75_);
			int i_96_ = i_94_ + (i_82_ * (i_95_ - i_94_) >> 12);
			i_94_ = method4915((((Class412) this).aShortArray4718
					    [i_76_ + i_91_]),
					   i_73_, i_86_, i_75_);
			i_95_ = method4915((((Class412) this).aShortArray4718
					    [i_77_ + i_91_]),
					   i_85_, i_86_, i_75_);
			int i_97_ = i_94_ + (i_82_ * (i_95_ - i_94_) >> 12);
			int i_98_ = i_96_ + (i_83_ * (i_97_ - i_96_) >> 12);
			i_94_ = method4915((((Class412) this).aShortArray4718
					    [i_76_ + i_92_]),
					   i_73_, i_74_, i_87_);
			i_95_ = method4915((((Class412) this).aShortArray4718
					    [i_77_ + i_92_]),
					   i_85_, i_74_, i_87_);
			i_96_ = i_94_ + (i_82_ * (i_95_ - i_94_) >> 12);
			i_94_ = method4915((((Class412) this).aShortArray4718
					    [i_76_ + i_93_]),
					   i_73_, i_86_, i_87_);
			i_95_ = method4915((((Class412) this).aShortArray4718
					    [i_77_ + i_93_]),
					   i_85_, i_86_, i_87_);
			i_97_ = i_94_ + (i_82_ * (i_95_ - i_94_) >> 12);
			int i_99_ = i_96_ + (i_83_ * (i_97_ - i_96_) >> 12);
			method4910(i_68_,
				   i_98_ + (i_84_ * (i_99_ - i_98_) >> 12));
		    }
		    method4912();
		}
	    }
	}
    }
    
    void method4922() {
	((Class412) this).aShortArray4714
	    = new short[((Class412) this).anInt4723];
	for (int i = 0; i < ((Class412) this).anInt4723; i++)
	    ((Class412) this).aShortArray4714[i]
		= (short) (int) Math.pow(2.0, (double) i);
    }
    
    Class412(int i, int i_100_, int i_101_, int i_102_, int i_103_) {
	((Class412) this).anInt4719 = i;
	((Class412) this).anInt4720 = i_101_;
	((Class412) this).anInt4721 = i_102_;
	((Class412) this).anInt4722 = i_103_;
	((Class412) this).anInt4723 = i_100_;
	method4911();
	method4908();
    }
    
    void method4923() {
	Random random = new Random((long) ((Class412) this).anInt4719);
	for (int i = 0; i < 255; i++)
	    ((Class412) this).aShortArray4718[i] = (short) i;
	for (int i = 0; i < 255; i++) {
	    int i_104_ = 255 - i;
	    int i_105_ = Class511_Sub6.method9346(random, i_104_, -2103532578);
	    short i_106_ = ((Class412) this).aShortArray4718[i_105_];
	    ((Class412) this).aShortArray4718[i_105_]
		= ((Class412) this).aShortArray4718[i_104_];
	    ((Class412) this).aShortArray4718[i_104_]
		= ((Class412) this).aShortArray4718[i_104_ + 256] = i_106_;
	}
    }
    
    void method4924() {
	Random random = new Random((long) ((Class412) this).anInt4719);
	for (int i = 0; i < 255; i++)
	    ((Class412) this).aShortArray4718[i] = (short) i;
	for (int i = 0; i < 255; i++) {
	    int i_107_ = 255 - i;
	    int i_108_ = Class511_Sub6.method9346(random, i_107_, -350234240);
	    short i_109_ = ((Class412) this).aShortArray4718[i_108_];
	    ((Class412) this).aShortArray4718[i_108_]
		= ((Class412) this).aShortArray4718[i_107_];
	    ((Class412) this).aShortArray4718[i_107_]
		= ((Class412) this).aShortArray4718[i_107_ + 256] = i_109_;
	}
    }
    
    static final int method4925(int i) {
	int i_110_ = i * (i * i >> 12) >> 12;
	int i_111_ = i * 6 - 61440;
	int i_112_ = 40960 + (i_111_ * i >> 12);
	return i_112_ * i_110_ >> 12;
    }
}
