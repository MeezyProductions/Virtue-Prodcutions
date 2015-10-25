/* Class157 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class157
{
    public boolean aBool1737;
    protected boolean aBool1738 = false;
    static final float aFloat1739 = 3.1415927F;
    
    public abstract void method1865(short i, short i_0_);
    
    static void method1866(int i, int i_1_, int i_2_, int i_3_, int i_4_,
			   int i_5_, float[] fs, int i_6_, float f,
			   float[] fs_7_) {
	i -= i_3_;
	i_1_ -= i_4_;
	i_2_ -= i_5_;
	float f_8_
	    = (float) i * fs[0] + (float) i_1_ * fs[1] + (float) i_2_ * fs[2];
	float f_9_
	    = (float) i * fs[3] + (float) i_1_ * fs[4] + (float) i_2_ * fs[5];
	float f_10_
	    = (float) i * fs[6] + (float) i_1_ * fs[7] + (float) i_2_ * fs[8];
	float f_11_ = (float) Math.sqrt((double) (f_8_ * f_8_ + f_9_ * f_9_
						  + f_10_ * f_10_));
	float f_12_
	    = ((float) Math.atan2((double) f_8_, (double) f_10_) / 6.2831855F
	       + 0.5F);
	float f_13_ = ((float) Math.asin((double) (f_9_ / f_11_)) / 3.1415927F
		       + 0.5F + f);
	if (i_6_ == 1) {
	    float f_14_ = f_12_;
	    f_12_ = -f_13_;
	    f_13_ = f_14_;
	} else if (i_6_ == 2) {
	    f_12_ = -f_12_;
	    f_13_ = -f_13_;
	} else if (i_6_ == 3) {
	    float f_15_ = f_12_;
	    f_12_ = f_13_;
	    f_13_ = -f_15_;
	}
	fs_7_[0] = f_12_;
	fs_7_[1] = f_13_;
    }
    
    static void method1867(int i, int i_16_, int i_17_, int i_18_, int i_19_,
			   int i_20_, float[] fs, float f, int i_21_,
			   float f_22_, float[] fs_23_) {
	i -= i_18_;
	i_16_ -= i_19_;
	i_17_ -= i_20_;
	float f_24_ = ((float) i * fs[0] + (float) i_16_ * fs[1]
		       + (float) i_17_ * fs[2]);
	float f_25_ = ((float) i * fs[3] + (float) i_16_ * fs[4]
		       + (float) i_17_ * fs[5]);
	float f_26_ = ((float) i * fs[6] + (float) i_16_ * fs[7]
		       + (float) i_17_ * fs[8]);
	float f_27_
	    = ((float) Math.atan2((double) f_24_, (double) f_26_) / 6.2831855F
	       + 0.5F);
	if (f != 1.0F)
	    f_27_ *= f;
	float f_28_ = f_25_ + 0.5F + f_22_;
	if (i_21_ == 1) {
	    float f_29_ = f_27_;
	    f_27_ = -f_28_;
	    f_28_ = f_29_;
	} else if (i_21_ == 2) {
	    f_27_ = -f_27_;
	    f_28_ = -f_28_;
	} else if (i_21_ == 3) {
	    float f_30_ = f_27_;
	    f_27_ = f_28_;
	    f_28_ = -f_30_;
	}
	fs_23_[0] = f_27_;
	fs_23_[1] = f_28_;
    }
    
    abstract void method1868();
    
    static void method1869(int i, int i_31_, int i_32_, int i_33_, int i_34_,
			   int i_35_, int i_36_, float[] fs, int i_37_,
			   float f, float f_38_, float f_39_, float[] fs_40_) {
	i -= i_33_;
	i_31_ -= i_34_;
	i_32_ -= i_35_;
	float f_41_ = ((float) i * fs[0] + (float) i_31_ * fs[1]
		       + (float) i_32_ * fs[2]);
	float f_42_ = ((float) i * fs[3] + (float) i_31_ * fs[4]
		       + (float) i_32_ * fs[5]);
	float f_43_ = ((float) i * fs[6] + (float) i_31_ * fs[7]
		       + (float) i_32_ * fs[8]);
	float f_44_;
	float f_45_;
	if (i_36_ == 0) {
	    f_44_ = f_41_ + f + 0.5F;
	    f_45_ = -f_43_ + f_39_ + 0.5F;
	} else if (i_36_ == 1) {
	    f_44_ = f_41_ + f + 0.5F;
	    f_45_ = f_43_ + f_39_ + 0.5F;
	} else if (i_36_ == 2) {
	    f_44_ = -f_41_ + f + 0.5F;
	    f_45_ = -f_42_ + f_38_ + 0.5F;
	} else if (i_36_ == 3) {
	    f_44_ = f_41_ + f + 0.5F;
	    f_45_ = -f_42_ + f_38_ + 0.5F;
	} else if (i_36_ == 4) {
	    f_44_ = f_43_ + f_39_ + 0.5F;
	    f_45_ = -f_42_ + f_38_ + 0.5F;
	} else {
	    f_44_ = -f_43_ + f_39_ + 0.5F;
	    f_45_ = -f_42_ + f_38_ + 0.5F;
	}
	if (i_37_ == 1) {
	    float f_46_ = f_44_;
	    f_44_ = -f_45_;
	    f_45_ = f_46_;
	} else if (i_37_ == 2) {
	    f_44_ = -f_44_;
	    f_45_ = -f_45_;
	} else if (i_37_ == 3) {
	    float f_47_ = f_44_;
	    f_44_ = f_45_;
	    f_45_ = -f_47_;
	}
	fs_40_[0] = f_44_;
	fs_40_[1] = f_45_;
    }
    
    public abstract void method1870(int i);
    
    abstract void method1871();
    
    public abstract void method1872(Class157 class157_48_, int i, int i_49_,
				    int i_50_, boolean bool);
    
    public abstract void method1873(int i);
    
    public abstract int method1874();
    
    public abstract void method1875();
    
    abstract boolean method1876();
    
    public abstract void method1877(int i);
    
    public abstract void method1878(int i);
    
    public abstract void method1879(int i);
    
    public abstract void method1880(int i, int i_51_, int i_52_);
    
    Class167 method1881(Class177 class177, int[] is, int i) {
	int[] is_53_ = null;
	int[] is_54_ = null;
	int[] is_55_ = null;
	float[][] fs = null;
	if (class177.aShortArray2057 != null) {
	    int i_56_ = ((Class177) class177).anInt2065;
	    int[] is_57_ = new int[i_56_];
	    int[] is_58_ = new int[i_56_];
	    int[] is_59_ = new int[i_56_];
	    int[] is_60_ = new int[i_56_];
	    int[] is_61_ = new int[i_56_];
	    int[] is_62_ = new int[i_56_];
	    for (int i_63_ = 0; i_63_ < i_56_; i_63_++) {
		is_57_[i_63_] = 2147483647;
		is_58_[i_63_] = -2147483647;
		is_59_[i_63_] = 2147483647;
		is_60_[i_63_] = -2147483647;
		is_61_[i_63_] = 2147483647;
		is_62_[i_63_] = -2147483647;
	    }
	    for (int i_64_ = 0; i_64_ < i; i_64_++) {
		int i_65_ = is[i_64_];
		short i_66_ = class177.aShortArray2057[i_65_];
		if (i_66_ > -1 && i_66_ < 32766) {
		    for (int i_67_ = 0; i_67_ < 3; i_67_++) {
			short i_68_;
			if (i_67_ == 0)
			    i_68_ = class177.aShortArray2067[i_65_];
			else if (i_67_ == 1)
			    i_68_ = class177.aShortArray2049[i_65_];
			else
			    i_68_ = class177.aShortArray2050[i_65_];
			int i_69_ = class177.anIntArray2038[i_68_];
			int i_70_ = class177.anIntArray2068[i_68_];
			int i_71_ = class177.anIntArray2044[i_68_];
			if (i_69_ < is_57_[i_66_])
			    is_57_[i_66_] = i_69_;
			if (i_69_ > is_58_[i_66_])
			    is_58_[i_66_] = i_69_;
			if (i_70_ < is_59_[i_66_])
			    is_59_[i_66_] = i_70_;
			if (i_70_ > is_60_[i_66_])
			    is_60_[i_66_] = i_70_;
			if (i_71_ < is_61_[i_66_])
			    is_61_[i_66_] = i_71_;
			if (i_71_ > is_62_[i_66_])
			    is_62_[i_66_] = i_71_;
		    }
		}
	    }
	    is_53_ = new int[i_56_];
	    is_54_ = new int[i_56_];
	    is_55_ = new int[i_56_];
	    fs = new float[i_56_][];
	    for (int i_72_ = 0; i_72_ < i_56_; i_72_++) {
		byte i_73_ = class177.aByteArray2076[i_72_];
		if (i_73_ > 0) {
		    is_53_[i_72_] = (is_57_[i_72_] + is_58_[i_72_]) / 2;
		    is_54_[i_72_] = (is_59_[i_72_] + is_60_[i_72_]) / 2;
		    is_55_[i_72_] = (is_61_[i_72_] + is_62_[i_72_]) / 2;
		    float f;
		    float f_74_;
		    float f_75_;
		    if (i_73_ == 1) {
			int i_76_ = class177.anIntArray2070[i_72_];
			if (i_76_ == 0) {
			    f = 1.0F;
			    f_75_ = 1.0F;
			} else if (i_76_ > 0) {
			    f = 1.0F;
			    f_75_ = (float) i_76_ / 1024.0F;
			} else {
			    f_75_ = 1.0F;
			    f = (float) -i_76_ / 1024.0F;
			}
			f_74_ = 64.0F / (float) class177.anIntArray2071[i_72_];
		    } else if (i_73_ == 2) {
			f = 64.0F / (float) class177.anIntArray2070[i_72_];
			f_74_ = 64.0F / (float) class177.anIntArray2071[i_72_];
			f_75_ = 64.0F / (float) class177.anIntArray2072[i_72_];
		    } else {
			f = (float) class177.anIntArray2070[i_72_] / 1024.0F;
			f_74_
			    = (float) class177.anIntArray2071[i_72_] / 1024.0F;
			f_75_
			    = (float) class177.anIntArray2072[i_72_] / 1024.0F;
		    }
		    fs[i_72_] = method2031(class177.aShortArray2064[i_72_],
					   class177.aShortArray2077[i_72_],
					   class177.aShortArray2069[i_72_],
					   (((Class177) class177)
					    .aByteArray2039[i_72_]) & 0xff,
					   f, f_74_, f_75_);
		}
	    }
	}
	return new Class167(this, is_53_, is_54_, is_55_, fs);
    }
    
    public abstract int method1882();
    
    public abstract void method1883(int i, int i_77_, Class137 class137,
				    Class137 class137_78_, int i_79_,
				    int i_80_, int i_81_);
    
    void method1884(Class137 class137, int i, int i_82_, int i_83_, int i_84_,
		    int i_85_, int i_86_, int i_87_) {
	boolean bool = false;
	boolean bool_88_ = false;
	boolean bool_89_ = false;
	int i_90_ = -i_84_ / 2;
	int i_91_ = -i_85_ / 2;
	int i_92_ = class137.method1657(i + i_90_, i_83_ + i_91_, 1559166994);
	int i_93_ = i_84_ / 2;
	int i_94_ = -i_85_ / 2;
	int i_95_ = class137.method1657(i + i_93_, i_83_ + i_94_, 1810163872);
	int i_96_ = -i_84_ / 2;
	int i_97_ = i_85_ / 2;
	int i_98_ = class137.method1657(i + i_96_, i_83_ + i_97_, 941860079);
	int i_99_ = i_84_ / 2;
	int i_100_ = i_85_ / 2;
	int i_101_
	    = class137.method1657(i + i_99_, i_83_ + i_100_, 2007446213);
	int i_102_ = i_92_ < i_95_ ? i_92_ : i_95_;
	int i_103_ = i_98_ < i_101_ ? i_98_ : i_101_;
	int i_104_ = i_95_ < i_101_ ? i_95_ : i_101_;
	int i_105_ = i_92_ < i_98_ ? i_92_ : i_98_;
	if (i_85_ != 0) {
	    int i_106_
		= (int) (Math.atan2((double) (i_102_ - i_103_), (double) i_85_)
			 * 2607.5945876176133) & 0x3fff;
	    if (i_106_ != 0) {
		if (i_86_ != 0) {
		    if (i_106_ > 8192) {
			int i_107_ = 16384 - i_86_;
			if (i_106_ < i_107_)
			    i_106_ = i_107_;
		    } else if (i_106_ > i_86_)
			i_106_ = i_86_;
		}
		method1934(i_106_);
	    }
	}
	if (i_84_ != 0) {
	    int i_108_
		= (int) (Math.atan2((double) (i_105_ - i_104_), (double) i_84_)
			 * 2607.5945876176133) & 0x3fff;
	    if (i_108_ != 0) {
		if (i_87_ != 0) {
		    if (i_108_ > 8192) {
			int i_109_ = 16384 - i_87_;
			if (i_108_ < i_109_)
			    i_108_ = i_109_;
		    } else if (i_108_ > i_87_)
			i_108_ = i_87_;
		}
		method1879(i_108_);
	    }
	}
	int i_110_ = i_92_ + i_101_;
	if (i_95_ + i_98_ < i_110_)
	    i_110_ = i_95_ + i_98_;
	i_110_ = (i_110_ >> 1) - i_82_;
	if (i_110_ != 0)
	    method1880(0, i_110_, 0);
    }
    
    abstract void method1885();
    
    abstract void method1886();
    
    void method1887(Class528_Sub16 class528_sub16, Class161 class161,
		    Class161 class161_111_, int i, int i_112_, int i_113_,
		    boolean[] bools, boolean bool, boolean bool_114_,
		    int i_115_, int[] is) {
	if (class161_111_ == null || i == 0) {
	    for (int i_116_ = 0; i_116_ < ((Class161) class161).anInt1813;
		 i_116_++) {
		short i_117_ = ((Class161) class161).aShortArray1814[i_116_];
		if (bools == null || bools[i_117_] == bool
		    || (((Class528_Sub16) class528_sub16).anIntArray10384
			[i_117_]) == 0) {
		    short i_118_
			= ((Class161) class161).aShortArray1818[i_116_];
		    if (i_118_ != -1)
			method1890(0,
				   (((Class528_Sub16) class528_sub16)
				    .anIntArrayArray10385[i_118_]),
				   0, 0, 0, i_113_, bool_114_,
				   i_115_ & (((Class528_Sub16) class528_sub16)
					     .anIntArray10387[i_118_]),
				   is);
		    method1890((((Class528_Sub16) class528_sub16)
				.anIntArray10384[i_117_]),
			       (((Class528_Sub16) class528_sub16)
				.anIntArrayArray10385[i_117_]),
			       ((Class161) class161).aShortArray1815[i_116_],
			       ((Class161) class161).aShortArray1816[i_116_],
			       ((Class161) class161).aShortArray1817[i_116_],
			       i_113_, bool_114_,
			       i_115_ & (((Class528_Sub16) class528_sub16)
					 .anIntArray10387[i_117_]),
			       is);
		}
	    }
	} else {
	    int i_119_ = 0;
	    int i_120_ = 0;
	    for (int i_121_ = 0;
		 (i_121_
		  < ((Class528_Sub16) class528_sub16).anInt10383 * 1947712853);
		 i_121_++) {
		boolean bool_122_ = false;
		if (i_119_ < ((Class161) class161).anInt1813
		    && ((Class161) class161).aShortArray1814[i_119_] == i_121_)
		    bool_122_ = true;
		boolean bool_123_ = false;
		if (i_120_ < ((Class161) class161_111_).anInt1813
		    && (((Class161) class161_111_).aShortArray1814[i_120_]
			== i_121_))
		    bool_123_ = true;
		if (bool_122_ || bool_123_) {
		    if (bools != null && bools[i_121_] != bool
			&& (((Class528_Sub16) class528_sub16).anIntArray10384
			    [i_121_]) != 0) {
			if (bool_122_)
			    i_119_++;
			if (bool_123_)
			    i_120_++;
		    } else {
			int i_124_ = 0;
			int i_125_ = (((Class528_Sub16) class528_sub16)
				      .anIntArray10384[i_121_]);
			if (i_125_ == 3 || i_125_ == 10)
			    i_124_ = 128;
			int i_126_;
			int i_127_;
			int i_128_;
			short i_129_;
			byte i_130_;
			if (bool_122_) {
			    i_126_ = (((Class161) class161).aShortArray1815
				      [i_119_]);
			    i_127_ = (((Class161) class161).aShortArray1816
				      [i_119_]);
			    i_128_ = (((Class161) class161).aShortArray1817
				      [i_119_]);
			    i_129_ = (((Class161) class161).aShortArray1818
				      [i_119_]);
			    i_130_
				= ((Class161) class161).aByteArray1819[i_119_];
			    i_119_++;
			} else {
			    i_126_ = i_124_;
			    i_127_ = i_124_;
			    i_128_ = i_124_;
			    i_129_ = (short) -1;
			    i_130_ = (byte) 0;
			}
			int i_131_;
			int i_132_;
			int i_133_;
			short i_134_;
			byte i_135_;
			if (bool_123_) {
			    i_131_ = (((Class161) class161_111_)
				      .aShortArray1815[i_120_]);
			    i_132_ = (((Class161) class161_111_)
				      .aShortArray1816[i_120_]);
			    i_133_ = (((Class161) class161_111_)
				      .aShortArray1817[i_120_]);
			    i_134_ = (((Class161) class161_111_)
				      .aShortArray1818[i_120_]);
			    i_135_ = (((Class161) class161_111_).aByteArray1819
				      [i_120_]);
			    i_120_++;
			} else {
			    i_131_ = i_124_;
			    i_132_ = i_124_;
			    i_133_ = i_124_;
			    i_134_ = (short) -1;
			    i_135_ = (byte) 0;
			}
			int i_136_;
			int i_137_;
			int i_138_;
			if ((i_130_ & 0x2) != 0 || (i_135_ & 0x1) != 0) {
			    i_136_ = i_126_;
			    i_137_ = i_127_;
			    i_138_ = i_128_;
			} else if (i_125_ == 2) {
			    int i_139_ = i_131_ - i_126_ & 0x3fff;
			    int i_140_ = i_132_ - i_127_ & 0x3fff;
			    int i_141_ = i_133_ - i_128_ & 0x3fff;
			    if (i_139_ >= 8192)
				i_139_ -= 16384;
			    if (i_140_ >= 8192)
				i_140_ -= 16384;
			    if (i_141_ >= 8192)
				i_141_ -= 16384;
			    i_136_ = i_126_ + i_139_ * i / i_112_ & 0x3fff;
			    i_137_ = i_127_ + i_140_ * i / i_112_ & 0x3fff;
			    i_138_ = i_128_ + i_141_ * i / i_112_ & 0x3fff;
			} else if (i_125_ == 9) {
			    int i_142_ = i_131_ - i_126_ & 0x3fff;
			    if (i_142_ >= 8192)
				i_142_ -= 16384;
			    i_136_ = i_126_ + i_142_ * i / i_112_ & 0x3fff;
			    i_138_ = 0;
			    i_137_ = 0;
			} else if (i_125_ == 7) {
			    int i_143_ = i_131_ - i_126_ & 0x3f;
			    if (i_143_ >= 32)
				i_143_ -= 64;
			    i_136_ = i_126_ + i_143_ * i / i_112_ & 0x3f;
			    i_137_ = i_127_ + (i_132_ - i_127_) * i / i_112_;
			    i_138_ = i_128_ + (i_133_ - i_128_) * i / i_112_;
			} else {
			    i_136_ = i_126_ + (i_131_ - i_126_) * i / i_112_;
			    i_137_ = i_127_ + (i_132_ - i_127_) * i / i_112_;
			    i_138_ = i_128_ + (i_133_ - i_128_) * i / i_112_;
			}
			if (i_129_ != -1)
			    method1890(0,
				       (((Class528_Sub16) class528_sub16)
					.anIntArrayArray10385[i_129_]),
				       0, 0, 0, i_113_, bool_114_,
				       (i_115_
					& (((Class528_Sub16) class528_sub16)
					   .anIntArray10387[i_129_])),
				       is);
			else if (i_134_ != -1)
			    method1890(0,
				       (((Class528_Sub16) class528_sub16)
					.anIntArrayArray10385[i_134_]),
				       0, 0, 0, i_113_, bool_114_,
				       (i_115_
					& (((Class528_Sub16) class528_sub16)
					   .anIntArray10387[i_134_])),
				       is);
			method1890(i_125_,
				   (((Class528_Sub16) class528_sub16)
				    .anIntArrayArray10385[i_121_]),
				   i_136_, i_137_, i_138_, i_113_, bool_114_,
				   i_115_ & (((Class528_Sub16) class528_sub16)
					     .anIntArray10387[i_121_]),
				   is);
		    }
		}
	    }
	}
    }
    
    public final void method1888
	(Class528_Sub21_Sub16 class528_sub21_sub16, int i,
	 Class528_Sub21_Sub16 class528_sub21_sub16_144_, int i_145_,
	 int i_146_, int i_147_, int i_148_, int i_149_, boolean bool,
	 int[] is) {
	if (i != -1) {
	    method1885();
	    if (!method1876())
		method1886();
	    else {
		Class161 class161
		    = (((Class528_Sub21_Sub16) class528_sub21_sub16)
		       .aClass161Array11635[i]);
		Class528_Sub16 class528_sub16
		    = ((Class161) class161).aClass528_Sub16_1810;
		Class161 class161_150_ = null;
		if (class528_sub21_sub16_144_ != null) {
		    class161_150_
			= (((Class528_Sub21_Sub16) class528_sub21_sub16_144_)
			   .aClass161Array11635[i_145_]);
		    if (((Class161) class161_150_).aClass528_Sub16_1810
			!= class528_sub16)
			class161_150_ = null;
		}
		method1887(class528_sub16, class161, class161_150_, i_146_,
			   i_147_, i_148_, null, false, bool, i_149_, is);
		method1895();
		method1886();
	    }
	}
    }
    
    abstract boolean method1889();
    
    void method1890(int i, int[] is, int i_151_, int i_152_, int i_153_,
		    int i_154_, boolean bool, int i_155_, int[] is_156_) {
	if (i_154_ == 1) {
	    if (i == 0 || i == 1) {
		int i_157_ = -i_151_;
		i_151_ = i_153_;
		i_153_ = i_157_;
	    } else if (i == 3) {
		int i_158_ = i_151_;
		i_151_ = i_153_;
		i_153_ = i_158_;
	    } else if (i == 2) {
		int i_159_ = i_151_;
		i_151_ = -i_153_ & 0x3fff;
		i_153_ = i_159_ & 0x3fff;
	    }
	} else if (i_154_ == 2) {
	    if (i == 0 || i == 1) {
		i_151_ = -i_151_;
		i_153_ = -i_153_;
	    } else if (i == 2) {
		i_151_ = -i_151_ & 0x3fff;
		i_153_ = -i_153_ & 0x3fff;
	    }
	} else if (i_154_ == 3) {
	    if (i == 0 || i == 1) {
		int i_160_ = i_151_;
		i_151_ = -i_153_;
		i_153_ = i_160_;
	    } else if (i == 3) {
		int i_161_ = i_151_;
		i_151_ = i_153_;
		i_153_ = i_161_;
	    } else if (i == 2) {
		int i_162_ = i_151_;
		i_151_ = i_153_ & 0x3fff;
		i_153_ = -i_162_ & 0x3fff;
	    }
	}
	if (i_155_ != 65535)
	    method1893(i, is, i_151_, i_152_, i_153_, bool, i_155_, is_156_);
	else
	    method1892(i, is, i_151_, i_152_, i_153_, i_154_, bool);
    }
    
    public abstract int method1891();
    
    abstract void method1892(int i, int[] is, int i_163_, int i_164_,
			     int i_165_, int i_166_, boolean bool);
    
    abstract void method1893(int i, int[] is, int i_167_, int i_168_,
			     int i_169_, boolean bool, int i_170_,
			     int[] is_171_);
    
    abstract void method1894(int i, int i_172_, int i_173_, int i_174_);
    
    abstract void method1895();
    
    public abstract int method1896();
    
    public abstract void method1897(Class433 class433, Class159 class159,
				    int i);
    
    public abstract int method1898();
    
    public abstract Class528_Sub21_Sub12 method1899
	(Class528_Sub21_Sub12 class528_sub21_sub12);
    
    public abstract int method1900();
    
    public abstract int method1901();
    
    public abstract int method1902();
    
    public abstract int method1903();
    
    public abstract void method1904(int i, int i_175_, Class137 class137,
				    Class137 class137_176_, int i_177_,
				    int i_178_, int i_179_);
    
    public abstract int method1905();
    
    abstract void method1906();
    
    public abstract int method1907();
    
    public abstract void method1908(int i);
    
    public abstract void method1909();
    
    public abstract void method1910(int i);
    
    public abstract byte[] method1911();
    
    public abstract int method1912();
    
    public abstract byte[] method1913();
    
    public abstract void method1914(short i, short i_180_);
    
    public abstract void method1915(int i);
    
    public abstract void method1916(short i, short i_181_);
    
    public abstract void method1917(int i, int i_182_, int i_183_, int i_184_);
    
    abstract void method1918(int i, int[] is, int i_185_, int i_186_,
			     int i_187_, boolean bool, int i_188_,
			     int[] is_189_);
    
    public abstract boolean method1919();
    
    public abstract boolean method1920();
    
    public abstract void method1921(Class433 class433);
    
    public abstract Class170[] method1922();
    
    public abstract Class144[] method1923();
    
    public abstract void method1924(short i, short i_190_);
    
    public abstract void method1925(Class157 class157_191_, int i, int i_192_,
				    int i_193_, boolean bool);
    
    public abstract Class157 method1926(byte i, int i_194_, boolean bool);
    
    public abstract Class157 method1927(byte i, int i_195_, boolean bool);
    
    public abstract int method1928();
    
    public abstract int method1929();
    
    public abstract int method1930();
    
    public abstract void method1931(int i);
    
    public abstract void method1932(int i);
    
    abstract void method1933();
    
    public abstract void method1934(int i);
    
    public abstract void method1935();
    
    public abstract void method1936();
    
    public abstract int method1937();
    
    abstract void method1938();
    
    public abstract void method1939(int i);
    
    public abstract void method1940(int i);
    
    public abstract void method1941(int i);
    
    public abstract void method1942(int i);
    
    public abstract boolean method1943(int i, int i_196_, Class433 class433,
				       boolean bool, int i_197_);
    
    public abstract void method1944(int i);
    
    public abstract void method1945(byte i, byte[] is);
    
    public abstract void method1946(int i, int i_198_, int i_199_);
    
    public abstract void method1947(int i, int i_200_, int i_201_);
    
    public abstract int method1948();
    
    public abstract int method1949();
    
    public abstract boolean method1950();
    
    public abstract Class157 method1951(byte i, int i_202_, boolean bool);
    
    abstract void method1952();
    
    abstract boolean method1953();
    
    public abstract int method1954();
    
    abstract boolean method1955();
    
    abstract void method1956();
    
    public abstract void method1957();
    
    abstract void method1958();
    
    abstract void method1959(int i, int[] is, int i_203_, int i_204_,
			     int i_205_, int i_206_, boolean bool);
    
    abstract void method1960(int i, int[] is, int i_207_, int i_208_,
			     int i_209_, boolean bool, int i_210_,
			     int[] is_211_);
    
    abstract void method1961(int i, int i_212_, int i_213_, int i_214_);
    
    abstract void method1962(int i, int i_215_, int i_216_, int i_217_);
    
    public abstract void method1963(Class433 class433, int i, boolean bool);
    
    public abstract void method1964(Class433 class433, Class159 class159,
				    int i);
    
    public abstract void method1965(Class433 class433, Class159 class159,
				    int i);
    
    public abstract void method1966(Class433 class433, Class159 class159,
				    int i);
    
    public abstract boolean method1967();
    
    public abstract void method1968(Class433 class433);
    
    public abstract Class528_Sub21_Sub12 method1969
	(Class528_Sub21_Sub12 class528_sub21_sub12);
    
    public abstract Class528_Sub21_Sub12 method1970
	(Class528_Sub21_Sub12 class528_sub21_sub12);
    
    public abstract void method1971();
    
    public abstract void method1972(int i);
    
    public abstract int method1973();
    
    public abstract void method1974(short i, short i_218_);
    
    public abstract int method1975();
    
    public abstract int method1976();
    
    public abstract int method1977();
    
    public abstract int method1978();
    
    public abstract int method1979();
    
    public abstract int method1980();
    
    public abstract int method1981();
    
    public abstract int method1982();
    
    public abstract int method1983();
    
    public abstract int method1984();
    
    public abstract Class144[] method1985();
    
    public abstract void method1986(int i);
    
    public abstract void method1987(int i);
    
    public final void method1988(Class528_Sub21_Sub16 class528_sub21_sub16,
				 int i) {
	if (i != -1) {
	    method1885();
	    if (!method1876())
		method1886();
	    else {
		Class161 class161
		    = (((Class528_Sub21_Sub16) class528_sub21_sub16)
		       .aClass161Array11635[i]);
		Class528_Sub16 class528_sub16
		    = ((Class161) class161).aClass528_Sub16_1810;
		for (int i_219_ = 0; i_219_ < ((Class161) class161).anInt1813;
		     i_219_++) {
		    short i_220_
			= ((Class161) class161).aShortArray1814[i_219_];
		    if (((Class528_Sub16) class528_sub16).aBoolArray10386
			[i_220_]) {
			if (((Class161) class161).aShortArray1818[i_219_]
			    != -1)
			    method1894(0, 0, 0, 0);
			method1894
			    ((((Class528_Sub16) class528_sub16).anIntArray10384
			      [i_220_]),
			     ((Class161) class161).aShortArray1815[i_219_],
			     ((Class161) class161).aShortArray1816[i_219_],
			     ((Class161) class161).aShortArray1817[i_219_]);
		    }
		}
		method1895();
		method1886();
	    }
	}
    }
    
    public abstract void method1989(int i);
    
    public abstract void method1990(int i);
    
    public abstract void method1991(int i);
    
    public abstract int method1992();
    
    static int method1993(float f, float f_221_, float f_222_) {
	float f_223_ = f < 0.0F ? -f : f;
	float f_224_ = f_221_ < 0.0F ? -f_221_ : f_221_;
	float f_225_ = f_222_ < 0.0F ? -f_222_ : f_222_;
	if (f_224_ > f_223_ && f_224_ > f_225_) {
	    if (f_221_ > 0.0F)
		return 0;
	    return 1;
	}
	if (f_225_ > f_223_ && f_225_ > f_224_) {
	    if (f_222_ > 0.0F)
		return 2;
	    return 3;
	}
	if (f > 0.0F)
	    return 4;
	return 5;
    }
    
    public abstract int method1994();
    
    public abstract void method1995(int i);
    
    public abstract byte[] method1996();
    
    public abstract void method1997(byte i, byte[] is);
    
    public abstract void method1998(byte i, byte[] is);
    
    public abstract void method1999(byte i, byte[] is);
    
    public abstract boolean method2000(int i, int i_226_, Class433 class433,
				       boolean bool, int i_227_);
    
    public abstract void method2001(short i, short i_228_);
    
    public abstract void method2002();
    
    public abstract void method2003(short i, short i_229_);
    
    public abstract int method2004();
    
    public abstract void method2005(Class433 class433, int i, boolean bool);
    
    public abstract void method2006(int i, int i_230_, int i_231_, int i_232_);
    
    public abstract void method2007(int i, int i_233_, int i_234_, int i_235_);
    
    public abstract Class170[] method2008();
    
    public final void method2009
	(Class528_Sub21_Sub16 class528_sub21_sub16, int i,
	 Class528_Sub21_Sub16 class528_sub21_sub16_236_, int i_237_,
	 int i_238_, int i_239_,
	 Class528_Sub21_Sub16 class528_sub21_sub16_240_, int i_241_,
	 Class528_Sub21_Sub16 class528_sub21_sub16_242_, int i_243_,
	 int i_244_, int i_245_, boolean[] bools, boolean bool) {
	if (i != -1) {
	    if (bools == null || i_241_ == -1)
		method2025(class528_sub21_sub16, i, class528_sub21_sub16_236_,
			   i_237_, i_238_, i_239_, 0, bool);
	    else {
		method1885();
		if (!method1876())
		    method1886();
		else {
		    Class161 class161
			= (((Class528_Sub21_Sub16) class528_sub21_sub16)
			   .aClass161Array11635[i]);
		    Class528_Sub16 class528_sub16
			= ((Class161) class161).aClass528_Sub16_1810;
		    Class161 class161_246_ = null;
		    if (class528_sub21_sub16_236_ != null) {
			class161_246_ = (((Class528_Sub21_Sub16)
					  class528_sub21_sub16_236_)
					 .aClass161Array11635[i_237_]);
			if (((Class161) class161_246_).aClass528_Sub16_1810
			    != class528_sub16)
			    class161_246_ = null;
		    }
		    method1887(class528_sub16, class161, class161_246_, i_238_,
			       i_239_, 0, bools, false, bool, 65535, null);
		    Class161 class161_247_
			= (((Class528_Sub21_Sub16) class528_sub21_sub16_240_)
			   .aClass161Array11635[i_241_]);
		    Class161 class161_248_ = null;
		    if (class528_sub21_sub16_242_ != null) {
			class161_248_ = (((Class528_Sub21_Sub16)
					  class528_sub21_sub16_242_)
					 .aClass161Array11635[i_243_]);
			if (((Class161) class161_248_).aClass528_Sub16_1810
			    != class528_sub16)
			    class161_248_ = null;
		    }
		    method1892(0, new int[0], 0, 0, 0, 0, bool);
		    method1887(((Class161) class161_247_).aClass528_Sub16_1810,
			       class161_247_, class161_248_, i_244_, i_245_, 0,
			       bools, true, bool, 65535, null);
		    method1895();
		    method1886();
		}
	    }
	}
    }
    
    public abstract Class144[] method2010();
    
    public abstract void method2011(int i, int i_249_, int i_250_);
    
    public abstract Class144[] method2012();
    
    public abstract boolean method2013();
    
    public abstract boolean method2014();
    
    public abstract void method2015(int i);
    
    public abstract boolean method2016();
    
    public abstract boolean method2017();
    
    public abstract int method2018();
    
    public abstract void method2019(int i, int i_251_, int i_252_);
    
    public abstract int method2020();
    
    public abstract boolean method2021();
    
    public abstract int method2022();
    
    public abstract int method2023();
    
    public abstract void method2024(int i, int i_253_, int i_254_, int i_255_);
    
    public final void method2025
	(Class528_Sub21_Sub16 class528_sub21_sub16, int i,
	 Class528_Sub21_Sub16 class528_sub21_sub16_256_, int i_257_,
	 int i_258_, int i_259_, int i_260_, boolean bool) {
	if (i != -1) {
	    method1885();
	    if (!method1876())
		method1886();
	    else {
		Class161 class161
		    = (((Class528_Sub21_Sub16) class528_sub21_sub16)
		       .aClass161Array11635[i]);
		Class528_Sub16 class528_sub16
		    = ((Class161) class161).aClass528_Sub16_1810;
		Class161 class161_261_ = null;
		if (class528_sub21_sub16_256_ != null) {
		    class161_261_
			= (((Class528_Sub21_Sub16) class528_sub21_sub16_256_)
			   .aClass161Array11635[i_257_]);
		    if (((Class161) class161_261_).aClass528_Sub16_1810
			!= class528_sub16)
			class161_261_ = null;
		}
		method1887(class528_sub16, class161, class161_261_, i_258_,
			   i_259_, i_260_, null, false, bool, 65535, null);
		method1895();
		method1886();
	    }
	}
    }
    
    public abstract void method2026();
    
    abstract void method2027();
    
    abstract void method2028();
    
    abstract void method2029();
    
    abstract void method2030();
    
    static float[] method2031(int i, int i_262_, int i_263_, int i_264_,
			      float f, float f_265_, float f_266_) {
	float[] fs = new float[9];
	float[] fs_267_ = new float[9];
	float f_268_
	    = (float) Math.cos((double) ((float) i_264_ * 0.024543693F));
	float f_269_
	    = (float) Math.sin((double) ((float) i_264_ * 0.024543693F));
	float f_270_ = 1.0F - f_268_;
	fs[0] = f_268_;
	fs[1] = 0.0F;
	fs[2] = f_269_;
	fs[3] = 0.0F;
	fs[4] = 1.0F;
	fs[5] = 0.0F;
	fs[6] = -f_269_;
	fs[7] = 0.0F;
	fs[8] = f_268_;
	float[] fs_271_ = new float[9];
	float f_272_ = 1.0F;
	float f_273_ = 0.0F;
	f_268_ = (float) i_262_ / 32767.0F;
	f_269_ = -(float) Math.sqrt((double) (1.0F - f_268_ * f_268_));
	f_270_ = 1.0F - f_268_;
	float f_274_ = (float) Math.sqrt((double) (i * i + i_263_ * i_263_));
	if (f_274_ == 0.0F && f_268_ == 0.0F)
	    fs_267_ = fs;
	else {
	    if (f_274_ != 0.0F) {
		f_272_ = (float) -i_263_ / f_274_;
		f_273_ = (float) i / f_274_;
	    }
	    fs_271_[0] = f_268_ + f_272_ * f_272_ * f_270_;
	    fs_271_[1] = f_273_ * f_269_;
	    fs_271_[2] = f_273_ * f_272_ * f_270_;
	    fs_271_[3] = -f_273_ * f_269_;
	    fs_271_[4] = f_268_;
	    fs_271_[5] = f_272_ * f_269_;
	    fs_271_[6] = f_272_ * f_273_ * f_270_;
	    fs_271_[7] = -f_272_ * f_269_;
	    fs_271_[8] = f_268_ + f_273_ * f_273_ * f_270_;
	    fs_267_[0]
		= fs[0] * fs_271_[0] + fs[1] * fs_271_[3] + fs[2] * fs_271_[6];
	    fs_267_[1]
		= fs[0] * fs_271_[1] + fs[1] * fs_271_[4] + fs[2] * fs_271_[7];
	    fs_267_[2]
		= fs[0] * fs_271_[2] + fs[1] * fs_271_[5] + fs[2] * fs_271_[8];
	    fs_267_[3]
		= fs[3] * fs_271_[0] + fs[4] * fs_271_[3] + fs[5] * fs_271_[6];
	    fs_267_[4]
		= fs[3] * fs_271_[1] + fs[4] * fs_271_[4] + fs[5] * fs_271_[7];
	    fs_267_[5]
		= fs[3] * fs_271_[2] + fs[4] * fs_271_[5] + fs[5] * fs_271_[8];
	    fs_267_[6]
		= fs[6] * fs_271_[0] + fs[7] * fs_271_[3] + fs[8] * fs_271_[6];
	    fs_267_[7]
		= fs[6] * fs_271_[1] + fs[7] * fs_271_[4] + fs[8] * fs_271_[7];
	    fs_267_[8]
		= fs[6] * fs_271_[2] + fs[7] * fs_271_[5] + fs[8] * fs_271_[8];
	}
	fs_267_[0] *= f;
	fs_267_[1] *= f;
	fs_267_[2] *= f;
	fs_267_[3] *= f_265_;
	fs_267_[4] *= f_265_;
	fs_267_[5] *= f_265_;
	fs_267_[6] *= f_266_;
	fs_267_[7] *= f_266_;
	fs_267_[8] *= f_266_;
	return fs_267_;
    }
    
    public abstract int method2032();
    
    public abstract Class144[] method2033();
    
    abstract void method2034();
    
    public abstract void method2035(int i);
    
    public abstract void method2036(short i, short i_275_);
    
    Class157() {
	aBool1737 = true;
    }
    
    public abstract void method2037(int i, int i_276_, int i_277_, int i_278_);
}
