/* Class245 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class245
{
    int[] anIntArray2738;
    int[] anIntArray2739;
    int anInt2740;
    int anInt2741;
    int[] anIntArray2742;
    int anInt2743 = 0;
    int anInt2744 = 0;
    float[][] aFloatArrayArray2745;
    
    void method3393() {
	int[] is = new int[((Class245) this).anInt2741];
	int[] is_0_ = new int[33];
	for (int i = 0; i < ((Class245) this).anInt2741; i++) {
	    int i_1_ = ((Class245) this).anIntArray2739[i];
	    if (i_1_ != 0) {
		int i_2_ = 1 << 32 - i_1_;
		int i_3_ = is_0_[i_1_];
		is[i] = i_3_;
		int i_4_;
		if ((i_3_ & i_2_) != 0)
		    i_4_ = is_0_[i_1_ - 1];
		else {
		    i_4_ = i_3_ | i_2_;
		    for (int i_5_ = i_1_ - 1; i_5_ >= 1; i_5_--) {
			int i_6_ = is_0_[i_5_];
			if (i_6_ != i_3_)
			    break;
			int i_7_ = 1 << 32 - i_5_;
			if ((i_6_ & i_7_) != 0) {
			    is_0_[i_5_] = is_0_[i_5_ - 1];
			    break;
			}
			is_0_[i_5_] = i_6_ | i_7_;
		    }
		}
		is_0_[i_1_] = i_4_;
		for (int i_8_ = i_1_ + 1; i_8_ <= 32; i_8_++) {
		    int i_9_ = is_0_[i_8_];
		    if (i_9_ == i_3_)
			is_0_[i_8_] = i_4_;
		}
	    }
	}
	((Class245) this).anIntArray2738 = new int[8];
	int i = 0;
	for (int i_10_ = 0; i_10_ < ((Class245) this).anInt2741; i_10_++) {
	    int i_11_ = ((Class245) this).anIntArray2739[i_10_];
	    if (i_11_ != 0) {
		int i_12_ = is[i_10_];
		int i_13_ = 0;
		for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
		    int i_15_ = -2147483648 >>> i_14_;
		    if ((i_12_ & i_15_) != 0) {
			if (((Class245) this).anIntArray2738[i_13_] == 0)
			    ((Class245) this).anIntArray2738[i_13_] = i;
			i_13_ = ((Class245) this).anIntArray2738[i_13_];
		    } else
			i_13_++;
		    if (i_13_ >= ((Class245) this).anIntArray2738.length) {
			int[] is_16_
			    = (new int
			       [((Class245) this).anIntArray2738.length * 2]);
			for (int i_17_ = 0;
			     i_17_ < ((Class245) this).anIntArray2738.length;
			     i_17_++)
			    is_16_[i_17_]
				= ((Class245) this).anIntArray2738[i_17_];
			((Class245) this).anIntArray2738 = is_16_;
		    }
		    i_15_ >>>= 1;
		}
		((Class245) this).anIntArray2738[i_13_] = i_10_ ^ 0xffffffff;
		if (i_13_ >= i)
		    i = i_13_ + 1;
	    }
	}
    }
    
    static int method3394(int i, int i_18_) {
	int i_19_;
	for (i_19_ = (int) Math.pow((double) i, 1.0 / (double) i_18_) + 1;
	     Class7.method564(i_19_, i_18_, 1716921822) > i; i_19_--) {
	    /* empty */
	}
	return i_19_;
    }
    
    void method3395() {
	int[] is = new int[((Class245) this).anInt2741];
	int[] is_20_ = new int[33];
	for (int i = 0; i < ((Class245) this).anInt2741; i++) {
	    int i_21_ = ((Class245) this).anIntArray2739[i];
	    if (i_21_ != 0) {
		int i_22_ = 1 << 32 - i_21_;
		int i_23_ = is_20_[i_21_];
		is[i] = i_23_;
		int i_24_;
		if ((i_23_ & i_22_) != 0)
		    i_24_ = is_20_[i_21_ - 1];
		else {
		    i_24_ = i_23_ | i_22_;
		    for (int i_25_ = i_21_ - 1; i_25_ >= 1; i_25_--) {
			int i_26_ = is_20_[i_25_];
			if (i_26_ != i_23_)
			    break;
			int i_27_ = 1 << 32 - i_25_;
			if ((i_26_ & i_27_) != 0) {
			    is_20_[i_25_] = is_20_[i_25_ - 1];
			    break;
			}
			is_20_[i_25_] = i_26_ | i_27_;
		    }
		}
		is_20_[i_21_] = i_24_;
		for (int i_28_ = i_21_ + 1; i_28_ <= 32; i_28_++) {
		    int i_29_ = is_20_[i_28_];
		    if (i_29_ == i_23_)
			is_20_[i_28_] = i_24_;
		}
	    }
	}
	((Class245) this).anIntArray2738 = new int[8];
	int i = 0;
	for (int i_30_ = 0; i_30_ < ((Class245) this).anInt2741; i_30_++) {
	    int i_31_ = ((Class245) this).anIntArray2739[i_30_];
	    if (i_31_ != 0) {
		int i_32_ = is[i_30_];
		int i_33_ = 0;
		for (int i_34_ = 0; i_34_ < i_31_; i_34_++) {
		    int i_35_ = -2147483648 >>> i_34_;
		    if ((i_32_ & i_35_) != 0) {
			if (((Class245) this).anIntArray2738[i_33_] == 0)
			    ((Class245) this).anIntArray2738[i_33_] = i;
			i_33_ = ((Class245) this).anIntArray2738[i_33_];
		    } else
			i_33_++;
		    if (i_33_ >= ((Class245) this).anIntArray2738.length) {
			int[] is_36_
			    = (new int
			       [((Class245) this).anIntArray2738.length * 2]);
			for (int i_37_ = 0;
			     i_37_ < ((Class245) this).anIntArray2738.length;
			     i_37_++)
			    is_36_[i_37_]
				= ((Class245) this).anIntArray2738[i_37_];
			((Class245) this).anIntArray2738 = is_36_;
		    }
		    i_35_ >>>= 1;
		}
		((Class245) this).anIntArray2738[i_33_] = i_30_ ^ 0xffffffff;
		if (i_33_ >= i)
		    i = i_33_ + 1;
	    }
	}
    }
    
    void method3396(Class241 class241) {
	int i = class241.method3333();
	int i_38_ = class241.method3332();
	class241.method3336(24);
	((Class245) this).anInt2740 = class241.method3336(16);
	((Class245) this).anInt2741 = class241.method3336(24);
	if (((Class245) this).anIntArray2739 == null
	    || (((Class245) this).anIntArray2739.length
		!= ((Class245) this).anInt2741))
	    ((Class245) this).anIntArray2739
		= new int[((Class245) this).anInt2741];
	boolean bool = class241.method3335() != 0;
	if (bool) {
	    int i_39_ = 0;
	    int i_40_ = class241.method3336(5) + 1;
	    while (i_39_ < ((Class245) this).anInt2741) {
		int i_41_
		    = class241.method3336(Class296.method3974((((Class245)
								this).anInt2741
							       - i_39_),
							      1979227548));
		for (int i_42_ = 0; i_42_ < i_41_; i_42_++)
		    ((Class245) this).anIntArray2739[i_39_++] = i_40_;
		i_40_++;
	    }
	} else {
	    boolean bool_43_ = class241.method3335() != 0;
	    for (int i_44_ = 0; i_44_ < ((Class245) this).anInt2741; i_44_++) {
		if (bool_43_ && class241.method3335() == 0)
		    ((Class245) this).anIntArray2739[i_44_] = 0;
		else
		    ((Class245) this).anIntArray2739[i_44_]
			= class241.method3336(5) + 1;
	    }
	}
	method3395();
	int i_45_ = class241.method3336(4);
	if (i_45_ > 0) {
	    float f = class241.method3334(class241.method3336(32));
	    float f_46_ = class241.method3334(class241.method3336(32));
	    int i_47_ = class241.method3336(4) + 1;
	    boolean bool_48_ = class241.method3335() != 0;
	    int i_49_;
	    if (i_45_ == 1)
		i_49_ = method3394(((Class245) this).anInt2741,
				   ((Class245) this).anInt2740);
	    else
		i_49_ = (((Class245) this).anInt2741
			 * ((Class245) this).anInt2740);
	    ((Class245) this).anIntArray2742 = new int[i_49_];
	    for (int i_50_ = 0; i_50_ < i_49_; i_50_++)
		((Class245) this).anIntArray2742[i_50_]
		    = class241.method3336(i_47_);
	    ((Class245) this).aFloatArrayArray2745
		= (new float[((Class245) this).anInt2741]
		   [((Class245) this).anInt2740]);
	    if (i_45_ == 1) {
		for (int i_51_ = 0; i_51_ < ((Class245) this).anInt2741;
		     i_51_++) {
		    float f_52_ = 0.0F;
		    int i_53_ = 1;
		    for (int i_54_ = 0; i_54_ < ((Class245) this).anInt2740;
			 i_54_++) {
			int i_55_ = i_51_ / i_53_ % i_49_;
			float f_56_
			    = (((float) ((Class245) this).anIntArray2742[i_55_]
				* f_46_)
			       + f + f_52_);
			((Class245) this).aFloatArrayArray2745[i_51_][i_54_]
			    = f_56_;
			if (bool_48_)
			    f_52_ = f_56_;
			i_53_ *= i_49_;
		    }
		}
	    } else {
		for (int i_57_ = 0; i_57_ < ((Class245) this).anInt2741;
		     i_57_++) {
		    float f_58_ = 0.0F;
		    int i_59_ = i_57_ * ((Class245) this).anInt2740;
		    for (int i_60_ = 0; i_60_ < ((Class245) this).anInt2740;
			 i_60_++) {
			float f_61_
			    = (((float) ((Class245) this).anIntArray2742[i_59_]
				* f_46_)
			       + f + f_58_);
			((Class245) this).aFloatArrayArray2745[i_57_][i_60_]
			    = f_61_;
			if (bool_48_)
			    f_58_ = f_61_;
			i_59_++;
		    }
		}
	    }
	}
	((Class245) this).anInt2744 = class241.method3333() - i;
	((Class245) this).anInt2743 = class241.method3332() - i_38_;
    }
    
    void method3397() {
	int[] is = new int[((Class245) this).anInt2741];
	int[] is_62_ = new int[33];
	for (int i = 0; i < ((Class245) this).anInt2741; i++) {
	    int i_63_ = ((Class245) this).anIntArray2739[i];
	    if (i_63_ != 0) {
		int i_64_ = 1 << 32 - i_63_;
		int i_65_ = is_62_[i_63_];
		is[i] = i_65_;
		int i_66_;
		if ((i_65_ & i_64_) != 0)
		    i_66_ = is_62_[i_63_ - 1];
		else {
		    i_66_ = i_65_ | i_64_;
		    for (int i_67_ = i_63_ - 1; i_67_ >= 1; i_67_--) {
			int i_68_ = is_62_[i_67_];
			if (i_68_ != i_65_)
			    break;
			int i_69_ = 1 << 32 - i_67_;
			if ((i_68_ & i_69_) != 0) {
			    is_62_[i_67_] = is_62_[i_67_ - 1];
			    break;
			}
			is_62_[i_67_] = i_68_ | i_69_;
		    }
		}
		is_62_[i_63_] = i_66_;
		for (int i_70_ = i_63_ + 1; i_70_ <= 32; i_70_++) {
		    int i_71_ = is_62_[i_70_];
		    if (i_71_ == i_65_)
			is_62_[i_70_] = i_66_;
		}
	    }
	}
	((Class245) this).anIntArray2738 = new int[8];
	int i = 0;
	for (int i_72_ = 0; i_72_ < ((Class245) this).anInt2741; i_72_++) {
	    int i_73_ = ((Class245) this).anIntArray2739[i_72_];
	    if (i_73_ != 0) {
		int i_74_ = is[i_72_];
		int i_75_ = 0;
		for (int i_76_ = 0; i_76_ < i_73_; i_76_++) {
		    int i_77_ = -2147483648 >>> i_76_;
		    if ((i_74_ & i_77_) != 0) {
			if (((Class245) this).anIntArray2738[i_75_] == 0)
			    ((Class245) this).anIntArray2738[i_75_] = i;
			i_75_ = ((Class245) this).anIntArray2738[i_75_];
		    } else
			i_75_++;
		    if (i_75_ >= ((Class245) this).anIntArray2738.length) {
			int[] is_78_
			    = (new int
			       [((Class245) this).anIntArray2738.length * 2]);
			for (int i_79_ = 0;
			     i_79_ < ((Class245) this).anIntArray2738.length;
			     i_79_++)
			    is_78_[i_79_]
				= ((Class245) this).anIntArray2738[i_79_];
			((Class245) this).anIntArray2738 = is_78_;
		    }
		    i_77_ >>>= 1;
		}
		((Class245) this).anIntArray2738[i_75_] = i_72_ ^ 0xffffffff;
		if (i_75_ >= i)
		    i = i_75_ + 1;
	    }
	}
    }
    
    int method3398(Class241 class241) {
	int i;
	for (i = 0; ((Class245) this).anIntArray2738[i] >= 0;
	     i = (class241.method3335() != 0
		  ? ((Class245) this).anIntArray2738[i] : i + 1)) {
	    /* empty */
	}
	return ((Class245) this).anIntArray2738[i] ^ 0xffffffff;
    }
    
    float[] method3399(Class241 class241) {
	return ((Class245) this).aFloatArrayArray2745[method3398(class241)];
    }
    
    static int method3400(int i, int i_80_) {
	int i_81_;
	for (i_81_ = (int) Math.pow((double) i, 1.0 / (double) i_80_) + 1;
	     Class7.method564(i_81_, i_80_, -1821995862) > i; i_81_--) {
	    /* empty */
	}
	return i_81_;
    }
    
    static int method3401(int i, int i_82_) {
	int i_83_;
	for (i_83_ = (int) Math.pow((double) i, 1.0 / (double) i_82_) + 1;
	     Class7.method564(i_83_, i_82_, 51054260) > i; i_83_--) {
	    /* empty */
	}
	return i_83_;
    }
    
    static int method3402(int i, int i_84_) {
	int i_85_;
	for (i_85_ = (int) Math.pow((double) i, 1.0 / (double) i_84_) + 1;
	     Class7.method564(i_85_, i_84_, 525258392) > i; i_85_--) {
	    /* empty */
	}
	return i_85_;
    }
    
    static int method3403(int i, int i_86_) {
	int i_87_;
	for (i_87_ = (int) Math.pow((double) i, 1.0 / (double) i_86_) + 1;
	     Class7.method564(i_87_, i_86_, -889473004) > i; i_87_--) {
	    /* empty */
	}
	return i_87_;
    }
    
    void method3404() {
	int[] is = new int[((Class245) this).anInt2741];
	int[] is_88_ = new int[33];
	for (int i = 0; i < ((Class245) this).anInt2741; i++) {
	    int i_89_ = ((Class245) this).anIntArray2739[i];
	    if (i_89_ != 0) {
		int i_90_ = 1 << 32 - i_89_;
		int i_91_ = is_88_[i_89_];
		is[i] = i_91_;
		int i_92_;
		if ((i_91_ & i_90_) != 0)
		    i_92_ = is_88_[i_89_ - 1];
		else {
		    i_92_ = i_91_ | i_90_;
		    for (int i_93_ = i_89_ - 1; i_93_ >= 1; i_93_--) {
			int i_94_ = is_88_[i_93_];
			if (i_94_ != i_91_)
			    break;
			int i_95_ = 1 << 32 - i_93_;
			if ((i_94_ & i_95_) != 0) {
			    is_88_[i_93_] = is_88_[i_93_ - 1];
			    break;
			}
			is_88_[i_93_] = i_94_ | i_95_;
		    }
		}
		is_88_[i_89_] = i_92_;
		for (int i_96_ = i_89_ + 1; i_96_ <= 32; i_96_++) {
		    int i_97_ = is_88_[i_96_];
		    if (i_97_ == i_91_)
			is_88_[i_96_] = i_92_;
		}
	    }
	}
	((Class245) this).anIntArray2738 = new int[8];
	int i = 0;
	for (int i_98_ = 0; i_98_ < ((Class245) this).anInt2741; i_98_++) {
	    int i_99_ = ((Class245) this).anIntArray2739[i_98_];
	    if (i_99_ != 0) {
		int i_100_ = is[i_98_];
		int i_101_ = 0;
		for (int i_102_ = 0; i_102_ < i_99_; i_102_++) {
		    int i_103_ = -2147483648 >>> i_102_;
		    if ((i_100_ & i_103_) != 0) {
			if (((Class245) this).anIntArray2738[i_101_] == 0)
			    ((Class245) this).anIntArray2738[i_101_] = i;
			i_101_ = ((Class245) this).anIntArray2738[i_101_];
		    } else
			i_101_++;
		    if (i_101_ >= ((Class245) this).anIntArray2738.length) {
			int[] is_104_
			    = (new int
			       [((Class245) this).anIntArray2738.length * 2]);
			for (int i_105_ = 0;
			     i_105_ < ((Class245) this).anIntArray2738.length;
			     i_105_++)
			    is_104_[i_105_]
				= ((Class245) this).anIntArray2738[i_105_];
			((Class245) this).anIntArray2738 = is_104_;
		    }
		    i_103_ >>>= 1;
		}
		((Class245) this).anIntArray2738[i_101_] = i_98_ ^ 0xffffffff;
		if (i_101_ >= i)
		    i = i_101_ + 1;
	    }
	}
    }
    
    void method3405(Class241 class241) {
	class241.method3336(((Class245) this).anInt2743 * 8
			    + ((Class245) this).anInt2744);
    }
    
    Class245() {
	/* empty */
    }
    
    static int method3406(int i, int i_106_) {
	int i_107_;
	for (i_107_ = (int) Math.pow((double) i, 1.0 / (double) i_106_) + 1;
	     Class7.method564(i_107_, i_106_, -445521521) > i; i_107_--) {
	    /* empty */
	}
	return i_107_;
    }
}
