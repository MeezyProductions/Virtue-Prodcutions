/* Class528_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class528_Sub4 extends Node
{
    int anInt10219;
    int anInt10220;
    int anInt10221;
    int[] anIntArray10222;
    boolean aBool10223;
    static int[] anIntArray10224;
    
    void method9250(int i, int i_0_) {
	if (i != 0 || i_0_ != 0) {
	    if (anIntArray10224 == null
		|| (anIntArray10224.length
		    != ((Class528_Sub4) this).anIntArray10222.length))
		anIntArray10224
		    = new int[((Class528_Sub4) this).anIntArray10222.length];
	    int i_1_ = ((Class528_Sub4) this).anIntArray10222.length;
	    int i_2_ = i;
	    int i_3_ = ((Class528_Sub4) this).anInt10220 - 1;
	    int i_4_ = ((Class528_Sub4) this).anInt10220 * i_0_;
	    int i_5_ = i_1_ - 1;
	    for (int i_6_ = 0; i_6_ < i_1_;
		 i_6_ += ((Class528_Sub4) this).anInt10220) {
		int i_7_ = i_6_ + i_4_ & i_5_;
		for (int i_8_ = 0; i_8_ < ((Class528_Sub4) this).anInt10220;
		     i_8_++) {
		    int i_9_ = i_6_ + i_8_;
		    int i_10_ = i_7_ + (i_8_ + i_2_ & i_3_);
		    anIntArray10224[i_9_]
			= ((Class528_Sub4) this).anIntArray10222[i_10_];
		}
	    }
	    int[] is = ((Class528_Sub4) this).anIntArray10222;
	    ((Class528_Sub4) this).anIntArray10222 = anIntArray10224;
	    anIntArray10224 = is;
	}
    }
    
    int[] method9251() {
	return ((Class528_Sub4) this).anIntArray10222;
    }
    
    void method9252(int i, int i_11_) {
	if (i != 0 || i_11_ != 0) {
	    if (anIntArray10224 == null
		|| (anIntArray10224.length
		    != ((Class528_Sub4) this).anIntArray10222.length))
		anIntArray10224
		    = new int[((Class528_Sub4) this).anIntArray10222.length];
	    int i_12_ = ((Class528_Sub4) this).anIntArray10222.length;
	    int i_13_ = i;
	    int i_14_ = ((Class528_Sub4) this).anInt10220 - 1;
	    int i_15_ = ((Class528_Sub4) this).anInt10220 * i_11_;
	    int i_16_ = i_12_ - 1;
	    for (int i_17_ = 0; i_17_ < i_12_;
		 i_17_ += ((Class528_Sub4) this).anInt10220) {
		int i_18_ = i_17_ + i_15_ & i_16_;
		for (int i_19_ = 0; i_19_ < ((Class528_Sub4) this).anInt10220;
		     i_19_++) {
		    int i_20_ = i_17_ + i_19_;
		    int i_21_ = i_18_ + (i_19_ + i_13_ & i_14_);
		    anIntArray10224[i_20_]
			= ((Class528_Sub4) this).anIntArray10222[i_21_];
		}
	    }
	    int[] is = ((Class528_Sub4) this).anIntArray10222;
	    ((Class528_Sub4) this).anIntArray10222 = anIntArray10224;
	    anIntArray10224 = is;
	}
    }
    
    Class528_Sub4(int i, int i_22_, int[] is, boolean bool) {
	((Class528_Sub4) this).anInt10219 = i;
	((Class528_Sub4) this).anInt10220 = i_22_;
	((Class528_Sub4) this).anIntArray10222 = is;
	if (bool) {
	    int[] is_23_ = new int[((Class528_Sub4) this).anInt10220];
	    int[] is_24_ = new int[((Class528_Sub4) this).anInt10220];
	    int[] is_25_ = new int[((Class528_Sub4) this).anInt10220];
	    int[] is_26_ = new int[((Class528_Sub4) this).anInt10220];
	    if (anIntArray10224 == null
		|| (anIntArray10224.length
		    != ((Class528_Sub4) this).anIntArray10222.length))
		anIntArray10224
		    = new int[((Class528_Sub4) this).anIntArray10222.length];
	    int i_27_ = ((Class528_Sub4) this).anInt10220;
	    int i_28_ = ((Class528_Sub4) this).anInt10220;
	    int i_29_ = i_27_ - 1;
	    int i_30_ = i_28_ - 1;
	    int i_31_ = i_27_ * i_28_;
	    int i_33_;
	    int i_32_ = i_33_ = 1 * i_27_;
	    for (int i_34_ = 2; i_34_ >= 0; i_34_--) {
		for (int i_35_ = i_29_; i_35_ >= 0; i_35_--) {
		    int i_36_
			= ((Class528_Sub4) this).anIntArray10222[--i_33_];
		    is_23_[i_35_] += i_36_ >> 24 & 0xff;
		    is_24_[i_35_] += i_36_ >> 16 & 0xff;
		    is_25_[i_35_] += i_36_ >> 8 & 0xff;
		    is_26_[i_35_] += i_36_ & 0xff;
		}
		if (i_33_ == 0)
		    i_33_ = i_31_;
	    }
	    int i_37_ = i_31_;
	    for (int i_38_ = i_30_; i_38_ >= 0; i_38_--) {
		int i_39_ = 1;
		int i_40_ = 1;
		int i_41_ = 0;
		int i_42_ = 0;
		int i_43_ = 0;
		int i_44_ = 0;
		for (int i_45_ = 2; i_45_ >= 0; i_45_--) {
		    i_40_--;
		    i_44_ += is_23_[i_40_];
		    i_43_ += is_24_[i_40_];
		    i_41_ += is_25_[i_40_];
		    i_42_ += is_26_[i_40_];
		    if (i_40_ == 0)
			i_40_ = i_27_;
		}
		for (int i_46_ = i_29_; i_46_ >= 0; i_46_--) {
		    i_40_--;
		    i_39_--;
		    int i_47_ = i_44_ / 9;
		    int i_48_ = i_43_ / 9;
		    int i_49_ = i_41_ / 9;
		    int i_50_ = i_42_ / 9;
		    anIntArray10224[--i_37_]
			= i_47_ << 24 | i_48_ << 16 | i_49_ << 8 | i_50_;
		    i_44_ += is_23_[i_40_] - is_23_[i_39_];
		    i_43_ += is_24_[i_40_] - is_24_[i_39_];
		    i_42_ += is_26_[i_40_] - is_26_[i_39_];
		    i_41_ += is_25_[i_40_] - is_25_[i_39_];
		    if (i_40_ == 0)
			i_40_ = i_27_;
		    if (i_39_ == 0)
			i_39_ = i_27_;
		}
		for (int i_51_ = i_29_; i_51_ >= 0; i_51_--) {
		    int i_52_
			= ((Class528_Sub4) this).anIntArray10222[--i_33_];
		    int i_53_
			= ((Class528_Sub4) this).anIntArray10222[--i_32_];
		    is_23_[i_51_]
			+= (i_52_ >> 24 & 0xff) - (i_53_ >> 24 & 0xff);
		    is_24_[i_51_]
			+= (i_52_ >> 16 & 0xff) - (i_53_ >> 16 & 0xff);
		    is_25_[i_51_] += (i_52_ >> 8 & 0xff) - (i_53_ >> 8 & 0xff);
		    is_26_[i_51_] += (i_52_ & 0xff) - (i_53_ & 0xff);
		}
		if (i_33_ == 0)
		    i_33_ = i_31_;
		if (i_32_ == 0)
		    i_32_ = i_31_;
	    }
	    int[] is_54_ = ((Class528_Sub4) this).anIntArray10222;
	    ((Class528_Sub4) this).anIntArray10222 = anIntArray10224;
	    anIntArray10224 = is_54_;
	}
    }
    
    void method9253(int i, int i_55_) {
	if (i != 0 || i_55_ != 0) {
	    if (anIntArray10224 == null
		|| (anIntArray10224.length
		    != ((Class528_Sub4) this).anIntArray10222.length))
		anIntArray10224
		    = new int[((Class528_Sub4) this).anIntArray10222.length];
	    int i_56_ = ((Class528_Sub4) this).anIntArray10222.length;
	    int i_57_ = i;
	    int i_58_ = ((Class528_Sub4) this).anInt10220 - 1;
	    int i_59_ = ((Class528_Sub4) this).anInt10220 * i_55_;
	    int i_60_ = i_56_ - 1;
	    for (int i_61_ = 0; i_61_ < i_56_;
		 i_61_ += ((Class528_Sub4) this).anInt10220) {
		int i_62_ = i_61_ + i_59_ & i_60_;
		for (int i_63_ = 0; i_63_ < ((Class528_Sub4) this).anInt10220;
		     i_63_++) {
		    int i_64_ = i_61_ + i_63_;
		    int i_65_ = i_62_ + (i_63_ + i_57_ & i_58_);
		    anIntArray10224[i_64_]
			= ((Class528_Sub4) this).anIntArray10222[i_65_];
		}
	    }
	    int[] is = ((Class528_Sub4) this).anIntArray10222;
	    ((Class528_Sub4) this).anIntArray10222 = anIntArray10224;
	    anIntArray10224 = is;
	}
    }
    
    void method9254(int i, int i_66_) {
	if (i != 0 || i_66_ != 0) {
	    if (anIntArray10224 == null
		|| (anIntArray10224.length
		    != ((Class528_Sub4) this).anIntArray10222.length))
		anIntArray10224
		    = new int[((Class528_Sub4) this).anIntArray10222.length];
	    int i_67_ = ((Class528_Sub4) this).anIntArray10222.length;
	    int i_68_ = i;
	    int i_69_ = ((Class528_Sub4) this).anInt10220 - 1;
	    int i_70_ = ((Class528_Sub4) this).anInt10220 * i_66_;
	    int i_71_ = i_67_ - 1;
	    for (int i_72_ = 0; i_72_ < i_67_;
		 i_72_ += ((Class528_Sub4) this).anInt10220) {
		int i_73_ = i_72_ + i_70_ & i_71_;
		for (int i_74_ = 0; i_74_ < ((Class528_Sub4) this).anInt10220;
		     i_74_++) {
		    int i_75_ = i_72_ + i_74_;
		    int i_76_ = i_73_ + (i_74_ + i_68_ & i_69_);
		    anIntArray10224[i_75_]
			= ((Class528_Sub4) this).anIntArray10222[i_76_];
		}
	    }
	    int[] is = ((Class528_Sub4) this).anIntArray10222;
	    ((Class528_Sub4) this).anIntArray10222 = anIntArray10224;
	    anIntArray10224 = is;
	}
    }
    
    void method9255(int i, int i_77_) {
	if (i != 0 || i_77_ != 0) {
	    if (anIntArray10224 == null
		|| (anIntArray10224.length
		    != ((Class528_Sub4) this).anIntArray10222.length))
		anIntArray10224
		    = new int[((Class528_Sub4) this).anIntArray10222.length];
	    int i_78_ = ((Class528_Sub4) this).anIntArray10222.length;
	    int i_79_ = i;
	    int i_80_ = ((Class528_Sub4) this).anInt10220 - 1;
	    int i_81_ = ((Class528_Sub4) this).anInt10220 * i_77_;
	    int i_82_ = i_78_ - 1;
	    for (int i_83_ = 0; i_83_ < i_78_;
		 i_83_ += ((Class528_Sub4) this).anInt10220) {
		int i_84_ = i_83_ + i_81_ & i_82_;
		for (int i_85_ = 0; i_85_ < ((Class528_Sub4) this).anInt10220;
		     i_85_++) {
		    int i_86_ = i_83_ + i_85_;
		    int i_87_ = i_84_ + (i_85_ + i_79_ & i_80_);
		    anIntArray10224[i_86_]
			= ((Class528_Sub4) this).anIntArray10222[i_87_];
		}
	    }
	    int[] is = ((Class528_Sub4) this).anIntArray10222;
	    ((Class528_Sub4) this).anIntArray10222 = anIntArray10224;
	    anIntArray10224 = is;
	}
    }
}
