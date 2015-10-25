/* Class172_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class172_Sub1 extends Class172
{
    int[] anIntArray9108;
    int[] anIntArray9109;
    int[] anIntArray9110;
    int[] anIntArray9111;
    byte[][] aByteArrayArray9112;
    Class173_Sub3 aClass173_Sub3_9113;
    
    void method2138(char c, int i, int i_0_, int i_1_, boolean bool,
		    Class148 class148, int i_2_, int i_3_) {
	if (null
	    != (((Class173_Sub3) ((Class172_Sub1) this).aClass173_Sub3_9113)
		.anIntArray9719)) {
	    if (class148 == null)
		method2125(c, i, i_0_, i_1_, bool);
	    else {
		i += ((Class172_Sub1) this).anIntArray9108[c];
		i_0_ += ((Class172_Sub1) this).anIntArray9109[c];
		int i_4_ = ((Class172_Sub1) this).anIntArray9110[c];
		int i_5_ = ((Class172_Sub1) this).anIntArray9111[c];
		int i_6_
		    = (111437289
		       * ((Class173_Sub3) (((Class172_Sub1) this)
					   .aClass173_Sub3_9113)).anInt9735);
		int i_7_ = i_0_ * i_6_ + i;
		int i_8_ = i_6_ - i_4_;
		int i_9_ = 0;
		int i_10_ = 0;
		if (i_0_ < (((Class173_Sub3) (((Class172_Sub1) this)
					      .aClass173_Sub3_9113)).anInt9725
			    * 592117349)) {
		    int i_11_ = ((((Class173_Sub3)
				   ((Class172_Sub1) this).aClass173_Sub3_9113)
				  .anInt9725) * 592117349
				 - i_0_);
		    i_5_ -= i_11_;
		    i_0_ = (((Class173_Sub3) (((Class172_Sub1) this)
					      .aClass173_Sub3_9113)).anInt9725
			    * 592117349);
		    i_10_ += i_4_ * i_11_;
		    i_7_ += i_11_ * i_6_;
		}
		if (i_5_ + i_0_ > (((Class173_Sub3)
				    ((Class172_Sub1) this).aClass173_Sub3_9113)
				   .anInt9726) * 6965409)
		    i_5_ -= i_0_ + i_5_ - 6965409 * (((Class173_Sub3)
						      (((Class172_Sub1) this)
						       .aClass173_Sub3_9113))
						     .anInt9726);
		if (i < (((Class173_Sub3)
			  ((Class172_Sub1) this).aClass173_Sub3_9113).anInt9723
			 * -993497119)) {
		    int i_12_ = ((((Class173_Sub3)
				   ((Class172_Sub1) this).aClass173_Sub3_9113)
				  .anInt9723) * -993497119
				 - i);
		    i_4_ -= i_12_;
		    i = (((Class173_Sub3)
			  ((Class172_Sub1) this).aClass173_Sub3_9113).anInt9723
			 * -993497119);
		    i_10_ += i_12_;
		    i_7_ += i_12_;
		    i_9_ += i_12_;
		    i_8_ += i_12_;
		}
		if (i_4_ + i
		    > 630968029 * (((Class173_Sub3)
				    ((Class172_Sub1) this).aClass173_Sub3_9113)
				   .anInt9724)) {
		    int i_13_
			= (i_4_ + i
			   - 630968029 * ((Class173_Sub3)
					  (((Class172_Sub1) this)
					   .aClass173_Sub3_9113)).anInt9724);
		    i_4_ -= i_13_;
		    i_9_ += i_13_;
		    i_8_ += i_13_;
		}
		if (i_4_ > 0 && i_5_ > 0) {
		    if (-16777216 == (i_1_ & ~0xffffff))
			method8394((((Class172_Sub1) this).aByteArrayArray9112
				    [c]),
				   (((Class173_Sub3) (((Class172_Sub1) this)
						      .aClass173_Sub3_9113))
				    .anIntArray9719),
				   i_1_, i_10_, i_7_, i_4_, i_5_, i_8_, i_9_,
				   i, i_0_,
				   ((Class172_Sub1) this).anIntArray9110[c],
				   class148, i_2_, i_3_);
		    else
			method8393((((Class172_Sub1) this).aByteArrayArray9112
				    [c]),
				   (((Class173_Sub3) (((Class172_Sub1) this)
						      .aClass173_Sub3_9113))
				    .anIntArray9719),
				   i_1_, i_10_, i_7_, i_4_, i_5_, i_8_, i_9_,
				   i, i_0_,
				   ((Class172_Sub1) this).anIntArray9110[c],
				   class148, i_2_, i_3_);
		}
	    }
	}
    }
    
    Class172_Sub1(Class173_Sub3 class173_sub3, Class1 class1,
		  Class178_Sub1[] class178_sub1s, int[] is, int[] is_14_) {
	super(class173_sub3, class1);
	((Class172_Sub1) this).aClass173_Sub3_9113 = class173_sub3;
	((Class172_Sub1) this).anIntArray9110 = is;
	((Class172_Sub1) this).anIntArray9111 = is_14_;
	((Class172_Sub1) this).aByteArrayArray9112
	    = new byte[class178_sub1s.length][];
	((Class172_Sub1) this).anIntArray9109 = new int[class178_sub1s.length];
	((Class172_Sub1) this).anIntArray9108 = new int[class178_sub1s.length];
	for (int i = 0; i < class178_sub1s.length; i++) {
	    int[] is_15_ = class178_sub1s[i].method2629(false);
	    byte[] is_16_ = (((Class172_Sub1) this).aByteArrayArray9112[i]
			     = new byte[is_15_.length]);
	    for (int i_17_ = 0; i_17_ < is_15_.length; i_17_++) {
		int i_18_ = is_15_[i_17_];
		byte i_19_
		    = (byte) ((4 * (i_18_ >> 8 & 0xff)
			       + 3 * (i_18_ >> 16 & 0xff) + (i_18_ & 0xff))
			      >> 3);
		is_16_[i_17_] = i_19_;
	    }
	    ((Class172_Sub1) this).anIntArray9109[i]
		= class178_sub1s[i].method2605();
	    ((Class172_Sub1) this).anIntArray9108[i]
		= class178_sub1s[i].method2603();
	}
    }
    
    void method8389(byte[] is, int[] is_20_, int i, int i_21_, int i_22_,
		    int i_23_, int i_24_, int i_25_, int i_26_, int i_27_,
		    int i_28_, int i_29_, Class148 class148, int i_30_,
		    int i_31_) {
	Class148_Sub1 class148_sub1 = (Class148_Sub1) class148;
	int[] is_32_ = ((Class148_Sub1) class148_sub1).anIntArray8789;
	int[] is_33_ = ((Class148_Sub1) class148_sub1).anIntArray8788;
	int i_34_
	    = i_27_ - -993497119 * (((Class173_Sub3) (((Class172_Sub1) this)
						      .aClass173_Sub3_9113))
				    .anInt9723);
	int i_35_ = i_28_;
	if (i_31_ > i_35_) {
	    i_35_ = i_31_;
	    i_22_ += 111437289 * (((Class173_Sub3)
				   ((Class172_Sub1) this).aClass173_Sub3_9113)
				  .anInt9735) * (i_31_ - i_28_);
	    i_21_ += i_29_ * (i_31_ - i_28_);
	}
	int i_36_ = (is_32_.length + i_31_ < i_28_ + i_24_
		     ? is_32_.length + i_31_ : i_24_ + i_28_);
	int i_37_ = i >>> 24;
	int i_38_ = 255 - i_37_;
	for (int i_39_ = i_35_; i_39_ < i_36_; i_39_++) {
	    int i_40_ = i_30_ + is_32_[i_39_ - i_31_];
	    int i_41_ = is_33_[i_39_ - i_31_];
	    int i_42_ = i_23_;
	    if (i_34_ > i_40_) {
		int i_43_ = i_34_ - i_40_;
		if (i_43_ >= i_41_) {
		    i_21_ += i_23_ + i_26_;
		    i_22_ += i_23_ + i_25_;
		    continue;
		}
		i_41_ -= i_43_;
	    } else {
		int i_44_ = i_40_ - i_34_;
		if (i_44_ >= i_23_) {
		    i_21_ += i_26_ + i_23_;
		    i_22_ += i_23_ + i_25_;
		    continue;
		}
		i_21_ += i_44_;
		i_42_ -= i_44_;
		i_22_ += i_44_;
	    }
	    int i_45_ = 0;
	    if (i_42_ < i_41_)
		i_41_ = i_42_;
	    else
		i_45_ = i_42_ - i_41_;
	    for (int i_46_ = -i_41_; i_46_ < 0; i_46_++) {
		if (is[i_21_++] != 0) {
		    int i_47_ = (((i_37_ * (i & 0xff00) & 0xff0000)
				  + (i_37_ * (i & 0xff00ff) & ~0xff00ff))
				 >> 8);
		    int i_48_ = is_20_[i_22_];
		    is_20_[i_22_++]
			= i_47_ + ((((i_48_ & 0xff00) * i_38_ & 0xff0000)
				    + ((i_48_ & 0xff00ff) * i_38_ & ~0xff00ff))
				   >> 8);
		} else
		    i_22_++;
	    }
	    i_21_ += i_45_ + i_26_;
	    i_22_ += i_25_ + i_45_;
	}
    }
    
    void method8390(byte[] is, int[] is_49_, int i, int i_50_, int i_51_,
		    int i_52_, int i_53_, int i_54_, int i_55_) {
	int i_56_ = -(i_52_ >> 2);
	i_52_ = -(i_52_ & 0x3);
	for (int i_57_ = -i_53_; i_57_ < 0; i_57_++) {
	    for (int i_58_ = i_56_; i_58_ < 0; i_58_++) {
		if (is[i_50_++] != 0)
		    is_49_[i_51_++] = i;
		else
		    i_51_++;
		if (is[i_50_++] != 0)
		    is_49_[i_51_++] = i;
		else
		    i_51_++;
		if (is[i_50_++] != 0)
		    is_49_[i_51_++] = i;
		else
		    i_51_++;
		if (is[i_50_++] != 0)
		    is_49_[i_51_++] = i;
		else
		    i_51_++;
	    }
	    for (int i_59_ = i_52_; i_59_ < 0; i_59_++) {
		if (is[i_50_++] != 0)
		    is_49_[i_51_++] = i;
		else
		    i_51_++;
	    }
	    i_51_ += i_54_;
	    i_50_ += i_55_;
	}
    }
    
    void method8391(byte[] is, int[] is_60_, int i, int i_61_, int i_62_,
		    int i_63_, int i_64_, int i_65_, int i_66_) {
	int i_67_ = i >>> 24;
	int i_68_ = 255 - i_67_;
	for (int i_69_ = -i_64_; i_69_ < 0; i_69_++) {
	    for (int i_70_ = -i_63_; i_70_ < 0; i_70_++) {
		if (is[i_61_++] != 0) {
		    int i_71_ = ((((i & 0xff00ff) * i_67_ & ~0xff00ff)
				  + (i_67_ * (i & 0xff00) & 0xff0000))
				 >> 8);
		    int i_72_ = is_60_[i_62_];
		    is_60_[i_62_++]
			= ((((i_72_ & 0xff00ff) * i_68_ & ~0xff00ff)
			    + ((i_72_ & 0xff00) * i_68_ & 0xff0000))
			   >> 8) + i_71_;
		} else
		    i_62_++;
	    }
	    i_62_ += i_65_;
	    i_61_ += i_66_;
	}
    }
    
    void method2132(char c, int i, int i_73_, int i_74_, boolean bool,
		    Class148 class148, int i_75_, int i_76_) {
	if (null
	    != (((Class173_Sub3) ((Class172_Sub1) this).aClass173_Sub3_9113)
		.anIntArray9719)) {
	    if (class148 == null)
		method2125(c, i, i_73_, i_74_, bool);
	    else {
		i += ((Class172_Sub1) this).anIntArray9108[c];
		i_73_ += ((Class172_Sub1) this).anIntArray9109[c];
		int i_77_ = ((Class172_Sub1) this).anIntArray9110[c];
		int i_78_ = ((Class172_Sub1) this).anIntArray9111[c];
		int i_79_
		    = (111437289
		       * ((Class173_Sub3) (((Class172_Sub1) this)
					   .aClass173_Sub3_9113)).anInt9735);
		int i_80_ = i_73_ * i_79_ + i;
		int i_81_ = i_79_ - i_77_;
		int i_82_ = 0;
		int i_83_ = 0;
		if (i_73_ < (((Class173_Sub3) (((Class172_Sub1) this)
					       .aClass173_Sub3_9113)).anInt9725
			     * 592117349)) {
		    int i_84_ = ((((Class173_Sub3)
				   ((Class172_Sub1) this).aClass173_Sub3_9113)
				  .anInt9725) * 592117349
				 - i_73_);
		    i_78_ -= i_84_;
		    i_73_ = (((Class173_Sub3) (((Class172_Sub1) this)
					       .aClass173_Sub3_9113)).anInt9725
			     * 592117349);
		    i_83_ += i_77_ * i_84_;
		    i_80_ += i_84_ * i_79_;
		}
		if (i_78_ + i_73_ > (((Class173_Sub3) (((Class172_Sub1) this)
						       .aClass173_Sub3_9113))
				     .anInt9726) * 6965409)
		    i_78_
			-= i_73_ + i_78_ - 6965409 * (((Class173_Sub3)
						       (((Class172_Sub1) this)
							.aClass173_Sub3_9113))
						      .anInt9726);
		if (i < (((Class173_Sub3)
			  ((Class172_Sub1) this).aClass173_Sub3_9113).anInt9723
			 * -993497119)) {
		    int i_85_ = ((((Class173_Sub3)
				   ((Class172_Sub1) this).aClass173_Sub3_9113)
				  .anInt9723) * -993497119
				 - i);
		    i_77_ -= i_85_;
		    i = (((Class173_Sub3)
			  ((Class172_Sub1) this).aClass173_Sub3_9113).anInt9723
			 * -993497119);
		    i_83_ += i_85_;
		    i_80_ += i_85_;
		    i_82_ += i_85_;
		    i_81_ += i_85_;
		}
		if (i_77_ + i
		    > 630968029 * (((Class173_Sub3)
				    ((Class172_Sub1) this).aClass173_Sub3_9113)
				   .anInt9724)) {
		    int i_86_
			= (i_77_ + i
			   - 630968029 * ((Class173_Sub3)
					  (((Class172_Sub1) this)
					   .aClass173_Sub3_9113)).anInt9724);
		    i_77_ -= i_86_;
		    i_82_ += i_86_;
		    i_81_ += i_86_;
		}
		if (i_77_ > 0 && i_78_ > 0) {
		    if (-16777216 == (i_74_ & ~0xffffff))
			method8394((((Class172_Sub1) this).aByteArrayArray9112
				    [c]),
				   (((Class173_Sub3) (((Class172_Sub1) this)
						      .aClass173_Sub3_9113))
				    .anIntArray9719),
				   i_74_, i_83_, i_80_, i_77_, i_78_, i_81_,
				   i_82_, i, i_73_,
				   ((Class172_Sub1) this).anIntArray9110[c],
				   class148, i_75_, i_76_);
		    else
			method8393((((Class172_Sub1) this).aByteArrayArray9112
				    [c]),
				   (((Class173_Sub3) (((Class172_Sub1) this)
						      .aClass173_Sub3_9113))
				    .anIntArray9719),
				   i_74_, i_83_, i_80_, i_77_, i_78_, i_81_,
				   i_82_, i, i_73_,
				   ((Class172_Sub1) this).anIntArray9110[c],
				   class148, i_75_, i_76_);
		}
	    }
	}
    }
    
    void method8392(byte[] is, int[] is_87_, int i, int i_88_, int i_89_,
		    int i_90_, int i_91_, int i_92_, int i_93_) {
	int i_94_ = -(i_90_ >> 2);
	i_90_ = -(i_90_ & 0x3);
	for (int i_95_ = -i_91_; i_95_ < 0; i_95_++) {
	    for (int i_96_ = i_94_; i_96_ < 0; i_96_++) {
		if (is[i_88_++] != 0)
		    is_87_[i_89_++] = i;
		else
		    i_89_++;
		if (is[i_88_++] != 0)
		    is_87_[i_89_++] = i;
		else
		    i_89_++;
		if (is[i_88_++] != 0)
		    is_87_[i_89_++] = i;
		else
		    i_89_++;
		if (is[i_88_++] != 0)
		    is_87_[i_89_++] = i;
		else
		    i_89_++;
	    }
	    for (int i_97_ = i_90_; i_97_ < 0; i_97_++) {
		if (is[i_88_++] != 0)
		    is_87_[i_89_++] = i;
		else
		    i_89_++;
	    }
	    i_89_ += i_92_;
	    i_88_ += i_93_;
	}
    }
    
    void method8393(byte[] is, int[] is_98_, int i, int i_99_, int i_100_,
		    int i_101_, int i_102_, int i_103_, int i_104_, int i_105_,
		    int i_106_, int i_107_, Class148 class148, int i_108_,
		    int i_109_) {
	Class148_Sub1 class148_sub1 = (Class148_Sub1) class148;
	int[] is_110_ = ((Class148_Sub1) class148_sub1).anIntArray8789;
	int[] is_111_ = ((Class148_Sub1) class148_sub1).anIntArray8788;
	int i_112_
	    = i_105_ - -993497119 * (((Class173_Sub3) (((Class172_Sub1) this)
						       .aClass173_Sub3_9113))
				     .anInt9723);
	int i_113_ = i_106_;
	if (i_109_ > i_113_) {
	    i_113_ = i_109_;
	    i_100_ += 111437289 * (((Class173_Sub3)
				    ((Class172_Sub1) this).aClass173_Sub3_9113)
				   .anInt9735) * (i_109_ - i_106_);
	    i_99_ += i_107_ * (i_109_ - i_106_);
	}
	int i_114_ = (is_110_.length + i_109_ < i_106_ + i_102_
		      ? is_110_.length + i_109_ : i_102_ + i_106_);
	int i_115_ = i >>> 24;
	int i_116_ = 255 - i_115_;
	for (int i_117_ = i_113_; i_117_ < i_114_; i_117_++) {
	    int i_118_ = i_108_ + is_110_[i_117_ - i_109_];
	    int i_119_ = is_111_[i_117_ - i_109_];
	    int i_120_ = i_101_;
	    if (i_112_ > i_118_) {
		int i_121_ = i_112_ - i_118_;
		if (i_121_ >= i_119_) {
		    i_99_ += i_101_ + i_104_;
		    i_100_ += i_101_ + i_103_;
		    continue;
		}
		i_119_ -= i_121_;
	    } else {
		int i_122_ = i_118_ - i_112_;
		if (i_122_ >= i_101_) {
		    i_99_ += i_104_ + i_101_;
		    i_100_ += i_101_ + i_103_;
		    continue;
		}
		i_99_ += i_122_;
		i_120_ -= i_122_;
		i_100_ += i_122_;
	    }
	    int i_123_ = 0;
	    if (i_120_ < i_119_)
		i_119_ = i_120_;
	    else
		i_123_ = i_120_ - i_119_;
	    for (int i_124_ = -i_119_; i_124_ < 0; i_124_++) {
		if (is[i_99_++] != 0) {
		    int i_125_ = (((i_115_ * (i & 0xff00) & 0xff0000)
				   + (i_115_ * (i & 0xff00ff) & ~0xff00ff))
				  >> 8);
		    int i_126_ = is_98_[i_100_];
		    is_98_[i_100_++]
			= i_125_ + ((((i_126_ & 0xff00) * i_116_ & 0xff0000)
				     + ((i_126_ & 0xff00ff) * i_116_
					& ~0xff00ff))
				    >> 8);
		} else
		    i_100_++;
	    }
	    i_99_ += i_123_ + i_104_;
	    i_100_ += i_103_ + i_123_;
	}
    }
    
    void method8394(byte[] is, int[] is_127_, int i, int i_128_, int i_129_,
		    int i_130_, int i_131_, int i_132_, int i_133_, int i_134_,
		    int i_135_, int i_136_, Class148 class148, int i_137_,
		    int i_138_) {
	Class148_Sub1 class148_sub1 = (Class148_Sub1) class148;
	int[] is_139_ = ((Class148_Sub1) class148_sub1).anIntArray8789;
	int[] is_140_ = ((Class148_Sub1) class148_sub1).anIntArray8788;
	int i_141_ = i_135_;
	if (i_138_ > i_141_) {
	    i_141_ = i_138_;
	    i_129_ += 111437289 * (((Class173_Sub3)
				    ((Class172_Sub1) this).aClass173_Sub3_9113)
				   .anInt9735) * (i_138_ - i_135_);
	    i_128_ += (i_138_ - i_135_) * i_136_;
	}
	int i_142_ = (is_139_.length + i_138_ < i_131_ + i_135_
		      ? i_138_ + is_139_.length : i_131_ + i_135_);
	for (int i_143_ = i_141_; i_143_ < i_142_; i_143_++) {
	    int i_144_ = is_139_[i_143_ - i_138_] + i_137_;
	    int i_145_ = is_140_[i_143_ - i_138_];
	    int i_146_ = i_130_;
	    if (i_134_ > i_144_) {
		int i_147_ = i_134_ - i_144_;
		if (i_147_ >= i_145_) {
		    i_128_ += i_133_ + i_130_;
		    i_129_ += i_132_ + i_130_;
		    continue;
		}
		i_145_ -= i_147_;
	    } else {
		int i_148_ = i_144_ - i_134_;
		if (i_148_ >= i_130_) {
		    i_128_ += i_130_ + i_133_;
		    i_129_ += i_130_ + i_132_;
		    continue;
		}
		i_128_ += i_148_;
		i_146_ -= i_148_;
		i_129_ += i_148_;
	    }
	    int i_149_ = 0;
	    if (i_146_ < i_145_)
		i_145_ = i_146_;
	    else
		i_149_ = i_146_ - i_145_;
	    for (int i_150_ = 0; i_150_ < i_145_; i_150_++) {
		if (is[i_128_++] != 0)
		    is_127_[i_129_++] = i;
		else
		    i_129_++;
	    }
	    i_128_ += i_133_ + i_149_;
	    i_129_ += i_132_ + i_149_;
	}
    }
    
    void method2134(char c, int i, int i_151_, int i_152_, boolean bool) {
	if (null
	    != (((Class173_Sub3) ((Class172_Sub1) this).aClass173_Sub3_9113)
		.anIntArray9719)) {
	    i += ((Class172_Sub1) this).anIntArray9108[c];
	    i_151_ += ((Class172_Sub1) this).anIntArray9109[c];
	    int i_153_ = ((Class172_Sub1) this).anIntArray9110[c];
	    int i_154_ = ((Class172_Sub1) this).anIntArray9111[c];
	    int i_155_
		= (((Class173_Sub3) ((Class172_Sub1) this).aClass173_Sub3_9113)
		   .anInt9735) * 111437289;
	    int i_156_ = i + i_155_ * i_151_;
	    int i_157_ = i_155_ - i_153_;
	    int i_158_ = 0;
	    int i_159_ = 0;
	    if (i_151_ < 592117349 * (((Class173_Sub3) (((Class172_Sub1) this)
							.aClass173_Sub3_9113))
				      .anInt9725)) {
		int i_160_ = ((((Class173_Sub3)
				((Class172_Sub1) this).aClass173_Sub3_9113)
			       .anInt9725) * 592117349
			      - i_151_);
		i_154_ -= i_160_;
		i_151_ = 592117349 * (((Class173_Sub3) (((Class172_Sub1) this)
							.aClass173_Sub3_9113))
				      .anInt9725);
		i_159_ += i_160_ * i_153_;
		i_156_ += i_155_ * i_160_;
	    }
	    if (i_151_ + i_154_
		> 6965409 * ((Class173_Sub3) (((Class172_Sub1) this)
					      .aClass173_Sub3_9113)).anInt9726)
		i_154_ -= i_154_ + i_151_ - 6965409 * (((Class173_Sub3)
							(((Class172_Sub1) this)
							 .aClass173_Sub3_9113))
						       .anInt9726);
	    if (i < -993497119 * (((Class173_Sub3)
				   ((Class172_Sub1) this).aClass173_Sub3_9113)
				  .anInt9723)) {
		int i_161_ = ((((Class173_Sub3)
				((Class172_Sub1) this).aClass173_Sub3_9113)
			       .anInt9723) * -993497119
			      - i);
		i_153_ -= i_161_;
		i = -993497119 * (((Class173_Sub3)
				   ((Class172_Sub1) this).aClass173_Sub3_9113)
				  .anInt9723);
		i_159_ += i_161_;
		i_156_ += i_161_;
		i_158_ += i_161_;
		i_157_ += i_161_;
	    }
	    if (i_153_ + i
		> (((Class173_Sub3) ((Class172_Sub1) this).aClass173_Sub3_9113)
		   .anInt9724) * 630968029) {
		int i_162_
		    = (i_153_ + i
		       - 630968029 * (((Class173_Sub3) (((Class172_Sub1) this)
							.aClass173_Sub3_9113))
				      .anInt9724));
		i_153_ -= i_162_;
		i_158_ += i_162_;
		i_157_ += i_162_;
	    }
	    if (i_153_ > 0 && i_154_ > 0) {
		if ((i_152_ & ~0xffffff) == -16777216)
		    method8390(((Class172_Sub1) this).aByteArrayArray9112[c],
			       (((Class173_Sub3)
				 ((Class172_Sub1) this).aClass173_Sub3_9113)
				.anIntArray9719),
			       i_152_, i_159_, i_156_, i_153_, i_154_, i_157_,
			       i_158_);
		else if ((i_152_ & ~0xffffff) != 0)
		    method8391(((Class172_Sub1) this).aByteArrayArray9112[c],
			       (((Class173_Sub3)
				 ((Class172_Sub1) this).aClass173_Sub3_9113)
				.anIntArray9719),
			       i_152_, i_159_, i_156_, i_153_, i_154_, i_157_,
			       i_158_);
	    }
	}
    }
    
    void method2135(char c, int i, int i_163_, int i_164_, boolean bool) {
	if (null
	    != (((Class173_Sub3) ((Class172_Sub1) this).aClass173_Sub3_9113)
		.anIntArray9719)) {
	    i += ((Class172_Sub1) this).anIntArray9108[c];
	    i_163_ += ((Class172_Sub1) this).anIntArray9109[c];
	    int i_165_ = ((Class172_Sub1) this).anIntArray9110[c];
	    int i_166_ = ((Class172_Sub1) this).anIntArray9111[c];
	    int i_167_
		= (((Class173_Sub3) ((Class172_Sub1) this).aClass173_Sub3_9113)
		   .anInt9735) * 111437289;
	    int i_168_ = i + i_167_ * i_163_;
	    int i_169_ = i_167_ - i_165_;
	    int i_170_ = 0;
	    int i_171_ = 0;
	    if (i_163_ < 592117349 * (((Class173_Sub3) (((Class172_Sub1) this)
							.aClass173_Sub3_9113))
				      .anInt9725)) {
		int i_172_ = ((((Class173_Sub3)
				((Class172_Sub1) this).aClass173_Sub3_9113)
			       .anInt9725) * 592117349
			      - i_163_);
		i_166_ -= i_172_;
		i_163_ = 592117349 * (((Class173_Sub3) (((Class172_Sub1) this)
							.aClass173_Sub3_9113))
				      .anInt9725);
		i_171_ += i_172_ * i_165_;
		i_168_ += i_167_ * i_172_;
	    }
	    if (i_163_ + i_166_
		> 6965409 * ((Class173_Sub3) (((Class172_Sub1) this)
					      .aClass173_Sub3_9113)).anInt9726)
		i_166_ -= i_166_ + i_163_ - 6965409 * (((Class173_Sub3)
							(((Class172_Sub1) this)
							 .aClass173_Sub3_9113))
						       .anInt9726);
	    if (i < -993497119 * (((Class173_Sub3)
				   ((Class172_Sub1) this).aClass173_Sub3_9113)
				  .anInt9723)) {
		int i_173_ = ((((Class173_Sub3)
				((Class172_Sub1) this).aClass173_Sub3_9113)
			       .anInt9723) * -993497119
			      - i);
		i_165_ -= i_173_;
		i = -993497119 * (((Class173_Sub3)
				   ((Class172_Sub1) this).aClass173_Sub3_9113)
				  .anInt9723);
		i_171_ += i_173_;
		i_168_ += i_173_;
		i_170_ += i_173_;
		i_169_ += i_173_;
	    }
	    if (i_165_ + i
		> (((Class173_Sub3) ((Class172_Sub1) this).aClass173_Sub3_9113)
		   .anInt9724) * 630968029) {
		int i_174_
		    = (i_165_ + i
		       - 630968029 * (((Class173_Sub3) (((Class172_Sub1) this)
							.aClass173_Sub3_9113))
				      .anInt9724));
		i_165_ -= i_174_;
		i_170_ += i_174_;
		i_169_ += i_174_;
	    }
	    if (i_165_ > 0 && i_166_ > 0) {
		if ((i_164_ & ~0xffffff) == -16777216)
		    method8390(((Class172_Sub1) this).aByteArrayArray9112[c],
			       (((Class173_Sub3)
				 ((Class172_Sub1) this).aClass173_Sub3_9113)
				.anIntArray9719),
			       i_164_, i_171_, i_168_, i_165_, i_166_, i_169_,
			       i_170_);
		else if ((i_164_ & ~0xffffff) != 0)
		    method8391(((Class172_Sub1) this).aByteArrayArray9112[c],
			       (((Class173_Sub3)
				 ((Class172_Sub1) this).aClass173_Sub3_9113)
				.anIntArray9719),
			       i_164_, i_171_, i_168_, i_165_, i_166_, i_169_,
			       i_170_);
	    }
	}
    }
    
    void method2125(char c, int i, int i_175_, int i_176_, boolean bool) {
	if (null
	    != (((Class173_Sub3) ((Class172_Sub1) this).aClass173_Sub3_9113)
		.anIntArray9719)) {
	    i += ((Class172_Sub1) this).anIntArray9108[c];
	    i_175_ += ((Class172_Sub1) this).anIntArray9109[c];
	    int i_177_ = ((Class172_Sub1) this).anIntArray9110[c];
	    int i_178_ = ((Class172_Sub1) this).anIntArray9111[c];
	    int i_179_
		= (((Class173_Sub3) ((Class172_Sub1) this).aClass173_Sub3_9113)
		   .anInt9735) * 111437289;
	    int i_180_ = i + i_179_ * i_175_;
	    int i_181_ = i_179_ - i_177_;
	    int i_182_ = 0;
	    int i_183_ = 0;
	    if (i_175_ < 592117349 * (((Class173_Sub3) (((Class172_Sub1) this)
							.aClass173_Sub3_9113))
				      .anInt9725)) {
		int i_184_ = ((((Class173_Sub3)
				((Class172_Sub1) this).aClass173_Sub3_9113)
			       .anInt9725) * 592117349
			      - i_175_);
		i_178_ -= i_184_;
		i_175_ = 592117349 * (((Class173_Sub3) (((Class172_Sub1) this)
							.aClass173_Sub3_9113))
				      .anInt9725);
		i_183_ += i_184_ * i_177_;
		i_180_ += i_179_ * i_184_;
	    }
	    if (i_175_ + i_178_
		> 6965409 * ((Class173_Sub3) (((Class172_Sub1) this)
					      .aClass173_Sub3_9113)).anInt9726)
		i_178_ -= i_178_ + i_175_ - 6965409 * (((Class173_Sub3)
							(((Class172_Sub1) this)
							 .aClass173_Sub3_9113))
						       .anInt9726);
	    if (i < -993497119 * (((Class173_Sub3)
				   ((Class172_Sub1) this).aClass173_Sub3_9113)
				  .anInt9723)) {
		int i_185_ = ((((Class173_Sub3)
				((Class172_Sub1) this).aClass173_Sub3_9113)
			       .anInt9723) * -993497119
			      - i);
		i_177_ -= i_185_;
		i = -993497119 * (((Class173_Sub3)
				   ((Class172_Sub1) this).aClass173_Sub3_9113)
				  .anInt9723);
		i_183_ += i_185_;
		i_180_ += i_185_;
		i_182_ += i_185_;
		i_181_ += i_185_;
	    }
	    if (i_177_ + i
		> (((Class173_Sub3) ((Class172_Sub1) this).aClass173_Sub3_9113)
		   .anInt9724) * 630968029) {
		int i_186_
		    = (i_177_ + i
		       - 630968029 * (((Class173_Sub3) (((Class172_Sub1) this)
							.aClass173_Sub3_9113))
				      .anInt9724));
		i_177_ -= i_186_;
		i_182_ += i_186_;
		i_181_ += i_186_;
	    }
	    if (i_177_ > 0 && i_178_ > 0) {
		if ((i_176_ & ~0xffffff) == -16777216)
		    method8390(((Class172_Sub1) this).aByteArrayArray9112[c],
			       (((Class173_Sub3)
				 ((Class172_Sub1) this).aClass173_Sub3_9113)
				.anIntArray9719),
			       i_176_, i_183_, i_180_, i_177_, i_178_, i_181_,
			       i_182_);
		else if ((i_176_ & ~0xffffff) != 0)
		    method8391(((Class172_Sub1) this).aByteArrayArray9112[c],
			       (((Class173_Sub3)
				 ((Class172_Sub1) this).aClass173_Sub3_9113)
				.anIntArray9719),
			       i_176_, i_183_, i_180_, i_177_, i_178_, i_181_,
			       i_182_);
	    }
	}
    }
    
    void method2137(char c, int i, int i_187_, int i_188_, boolean bool,
		    Class148 class148, int i_189_, int i_190_) {
	if (null
	    != (((Class173_Sub3) ((Class172_Sub1) this).aClass173_Sub3_9113)
		.anIntArray9719)) {
	    if (class148 == null)
		method2125(c, i, i_187_, i_188_, bool);
	    else {
		i += ((Class172_Sub1) this).anIntArray9108[c];
		i_187_ += ((Class172_Sub1) this).anIntArray9109[c];
		int i_191_ = ((Class172_Sub1) this).anIntArray9110[c];
		int i_192_ = ((Class172_Sub1) this).anIntArray9111[c];
		int i_193_
		    = (111437289
		       * ((Class173_Sub3) (((Class172_Sub1) this)
					   .aClass173_Sub3_9113)).anInt9735);
		int i_194_ = i_187_ * i_193_ + i;
		int i_195_ = i_193_ - i_191_;
		int i_196_ = 0;
		int i_197_ = 0;
		if (i_187_ < (((Class173_Sub3)
			       ((Class172_Sub1) this).aClass173_Sub3_9113)
			      .anInt9725) * 592117349) {
		    int i_198_ = ((((Class173_Sub3)
				    ((Class172_Sub1) this).aClass173_Sub3_9113)
				   .anInt9725) * 592117349
				  - i_187_);
		    i_192_ -= i_198_;
		    i_187_ = (((Class173_Sub3)
			       ((Class172_Sub1) this).aClass173_Sub3_9113)
			      .anInt9725) * 592117349;
		    i_197_ += i_191_ * i_198_;
		    i_194_ += i_198_ * i_193_;
		}
		if (i_192_ + i_187_ > (((Class173_Sub3) (((Class172_Sub1) this)
							 .aClass173_Sub3_9113))
				       .anInt9726) * 6965409)
		    i_192_ -= (i_187_ + i_192_
			       - 6965409 * ((Class173_Sub3)
					    (((Class172_Sub1) this)
					     .aClass173_Sub3_9113)).anInt9726);
		if (i < (((Class173_Sub3)
			  ((Class172_Sub1) this).aClass173_Sub3_9113).anInt9723
			 * -993497119)) {
		    int i_199_ = ((((Class173_Sub3)
				    ((Class172_Sub1) this).aClass173_Sub3_9113)
				   .anInt9723) * -993497119
				  - i);
		    i_191_ -= i_199_;
		    i = (((Class173_Sub3)
			  ((Class172_Sub1) this).aClass173_Sub3_9113).anInt9723
			 * -993497119);
		    i_197_ += i_199_;
		    i_194_ += i_199_;
		    i_196_ += i_199_;
		    i_195_ += i_199_;
		}
		if (i_191_ + i
		    > 630968029 * (((Class173_Sub3)
				    ((Class172_Sub1) this).aClass173_Sub3_9113)
				   .anInt9724)) {
		    int i_200_
			= (i_191_ + i
			   - 630968029 * ((Class173_Sub3)
					  (((Class172_Sub1) this)
					   .aClass173_Sub3_9113)).anInt9724);
		    i_191_ -= i_200_;
		    i_196_ += i_200_;
		    i_195_ += i_200_;
		}
		if (i_191_ > 0 && i_192_ > 0) {
		    if (-16777216 == (i_188_ & ~0xffffff))
			method8394((((Class172_Sub1) this).aByteArrayArray9112
				    [c]),
				   (((Class173_Sub3) (((Class172_Sub1) this)
						      .aClass173_Sub3_9113))
				    .anIntArray9719),
				   i_188_, i_197_, i_194_, i_191_, i_192_,
				   i_195_, i_196_, i, i_187_,
				   ((Class172_Sub1) this).anIntArray9110[c],
				   class148, i_189_, i_190_);
		    else
			method8393((((Class172_Sub1) this).aByteArrayArray9112
				    [c]),
				   (((Class173_Sub3) (((Class172_Sub1) this)
						      .aClass173_Sub3_9113))
				    .anIntArray9719),
				   i_188_, i_197_, i_194_, i_191_, i_192_,
				   i_195_, i_196_, i, i_187_,
				   ((Class172_Sub1) this).anIntArray9110[c],
				   class148, i_189_, i_190_);
		}
	    }
	}
    }
    
    void method2136(char c, int i, int i_201_, int i_202_, boolean bool,
		    Class148 class148, int i_203_, int i_204_) {
	if (null
	    != (((Class173_Sub3) ((Class172_Sub1) this).aClass173_Sub3_9113)
		.anIntArray9719)) {
	    if (class148 == null)
		method2125(c, i, i_201_, i_202_, bool);
	    else {
		i += ((Class172_Sub1) this).anIntArray9108[c];
		i_201_ += ((Class172_Sub1) this).anIntArray9109[c];
		int i_205_ = ((Class172_Sub1) this).anIntArray9110[c];
		int i_206_ = ((Class172_Sub1) this).anIntArray9111[c];
		int i_207_
		    = (111437289
		       * ((Class173_Sub3) (((Class172_Sub1) this)
					   .aClass173_Sub3_9113)).anInt9735);
		int i_208_ = i_201_ * i_207_ + i;
		int i_209_ = i_207_ - i_205_;
		int i_210_ = 0;
		int i_211_ = 0;
		if (i_201_ < (((Class173_Sub3)
			       ((Class172_Sub1) this).aClass173_Sub3_9113)
			      .anInt9725) * 592117349) {
		    int i_212_ = ((((Class173_Sub3)
				    ((Class172_Sub1) this).aClass173_Sub3_9113)
				   .anInt9725) * 592117349
				  - i_201_);
		    i_206_ -= i_212_;
		    i_201_ = (((Class173_Sub3)
			       ((Class172_Sub1) this).aClass173_Sub3_9113)
			      .anInt9725) * 592117349;
		    i_211_ += i_205_ * i_212_;
		    i_208_ += i_212_ * i_207_;
		}
		if (i_206_ + i_201_ > (((Class173_Sub3) (((Class172_Sub1) this)
							 .aClass173_Sub3_9113))
				       .anInt9726) * 6965409)
		    i_206_ -= (i_201_ + i_206_
			       - 6965409 * ((Class173_Sub3)
					    (((Class172_Sub1) this)
					     .aClass173_Sub3_9113)).anInt9726);
		if (i < (((Class173_Sub3)
			  ((Class172_Sub1) this).aClass173_Sub3_9113).anInt9723
			 * -993497119)) {
		    int i_213_ = ((((Class173_Sub3)
				    ((Class172_Sub1) this).aClass173_Sub3_9113)
				   .anInt9723) * -993497119
				  - i);
		    i_205_ -= i_213_;
		    i = (((Class173_Sub3)
			  ((Class172_Sub1) this).aClass173_Sub3_9113).anInt9723
			 * -993497119);
		    i_211_ += i_213_;
		    i_208_ += i_213_;
		    i_210_ += i_213_;
		    i_209_ += i_213_;
		}
		if (i_205_ + i
		    > 630968029 * (((Class173_Sub3)
				    ((Class172_Sub1) this).aClass173_Sub3_9113)
				   .anInt9724)) {
		    int i_214_
			= (i_205_ + i
			   - 630968029 * ((Class173_Sub3)
					  (((Class172_Sub1) this)
					   .aClass173_Sub3_9113)).anInt9724);
		    i_205_ -= i_214_;
		    i_210_ += i_214_;
		    i_209_ += i_214_;
		}
		if (i_205_ > 0 && i_206_ > 0) {
		    if (-16777216 == (i_202_ & ~0xffffff))
			method8394((((Class172_Sub1) this).aByteArrayArray9112
				    [c]),
				   (((Class173_Sub3) (((Class172_Sub1) this)
						      .aClass173_Sub3_9113))
				    .anIntArray9719),
				   i_202_, i_211_, i_208_, i_205_, i_206_,
				   i_209_, i_210_, i, i_201_,
				   ((Class172_Sub1) this).anIntArray9110[c],
				   class148, i_203_, i_204_);
		    else
			method8393((((Class172_Sub1) this).aByteArrayArray9112
				    [c]),
				   (((Class173_Sub3) (((Class172_Sub1) this)
						      .aClass173_Sub3_9113))
				    .anIntArray9719),
				   i_202_, i_211_, i_208_, i_205_, i_206_,
				   i_209_, i_210_, i, i_201_,
				   ((Class172_Sub1) this).anIntArray9110[c],
				   class148, i_203_, i_204_);
		}
	    }
	}
    }
    
    void method2139(char c, int i, int i_215_, int i_216_, boolean bool,
		    Class148 class148, int i_217_, int i_218_) {
	if (null
	    != (((Class173_Sub3) ((Class172_Sub1) this).aClass173_Sub3_9113)
		.anIntArray9719)) {
	    if (class148 == null)
		method2125(c, i, i_215_, i_216_, bool);
	    else {
		i += ((Class172_Sub1) this).anIntArray9108[c];
		i_215_ += ((Class172_Sub1) this).anIntArray9109[c];
		int i_219_ = ((Class172_Sub1) this).anIntArray9110[c];
		int i_220_ = ((Class172_Sub1) this).anIntArray9111[c];
		int i_221_
		    = (111437289
		       * ((Class173_Sub3) (((Class172_Sub1) this)
					   .aClass173_Sub3_9113)).anInt9735);
		int i_222_ = i_215_ * i_221_ + i;
		int i_223_ = i_221_ - i_219_;
		int i_224_ = 0;
		int i_225_ = 0;
		if (i_215_ < (((Class173_Sub3)
			       ((Class172_Sub1) this).aClass173_Sub3_9113)
			      .anInt9725) * 592117349) {
		    int i_226_ = ((((Class173_Sub3)
				    ((Class172_Sub1) this).aClass173_Sub3_9113)
				   .anInt9725) * 592117349
				  - i_215_);
		    i_220_ -= i_226_;
		    i_215_ = (((Class173_Sub3)
			       ((Class172_Sub1) this).aClass173_Sub3_9113)
			      .anInt9725) * 592117349;
		    i_225_ += i_219_ * i_226_;
		    i_222_ += i_226_ * i_221_;
		}
		if (i_220_ + i_215_ > (((Class173_Sub3) (((Class172_Sub1) this)
							 .aClass173_Sub3_9113))
				       .anInt9726) * 6965409)
		    i_220_ -= (i_215_ + i_220_
			       - 6965409 * ((Class173_Sub3)
					    (((Class172_Sub1) this)
					     .aClass173_Sub3_9113)).anInt9726);
		if (i < (((Class173_Sub3)
			  ((Class172_Sub1) this).aClass173_Sub3_9113).anInt9723
			 * -993497119)) {
		    int i_227_ = ((((Class173_Sub3)
				    ((Class172_Sub1) this).aClass173_Sub3_9113)
				   .anInt9723) * -993497119
				  - i);
		    i_219_ -= i_227_;
		    i = (((Class173_Sub3)
			  ((Class172_Sub1) this).aClass173_Sub3_9113).anInt9723
			 * -993497119);
		    i_225_ += i_227_;
		    i_222_ += i_227_;
		    i_224_ += i_227_;
		    i_223_ += i_227_;
		}
		if (i_219_ + i
		    > 630968029 * (((Class173_Sub3)
				    ((Class172_Sub1) this).aClass173_Sub3_9113)
				   .anInt9724)) {
		    int i_228_
			= (i_219_ + i
			   - 630968029 * ((Class173_Sub3)
					  (((Class172_Sub1) this)
					   .aClass173_Sub3_9113)).anInt9724);
		    i_219_ -= i_228_;
		    i_224_ += i_228_;
		    i_223_ += i_228_;
		}
		if (i_219_ > 0 && i_220_ > 0) {
		    if (-16777216 == (i_216_ & ~0xffffff))
			method8394((((Class172_Sub1) this).aByteArrayArray9112
				    [c]),
				   (((Class173_Sub3) (((Class172_Sub1) this)
						      .aClass173_Sub3_9113))
				    .anIntArray9719),
				   i_216_, i_225_, i_222_, i_219_, i_220_,
				   i_223_, i_224_, i, i_215_,
				   ((Class172_Sub1) this).anIntArray9110[c],
				   class148, i_217_, i_218_);
		    else
			method8393((((Class172_Sub1) this).aByteArrayArray9112
				    [c]),
				   (((Class173_Sub3) (((Class172_Sub1) this)
						      .aClass173_Sub3_9113))
				    .anIntArray9719),
				   i_216_, i_225_, i_222_, i_219_, i_220_,
				   i_223_, i_224_, i, i_215_,
				   ((Class172_Sub1) this).anIntArray9110[c],
				   class148, i_217_, i_218_);
		}
	    }
	}
    }
    
    void method8395(byte[] is, int[] is_229_, int i, int i_230_, int i_231_,
		    int i_232_, int i_233_, int i_234_, int i_235_) {
	int i_236_ = i >>> 24;
	int i_237_ = 255 - i_236_;
	for (int i_238_ = -i_233_; i_238_ < 0; i_238_++) {
	    for (int i_239_ = -i_232_; i_239_ < 0; i_239_++) {
		if (is[i_230_++] != 0) {
		    int i_240_ = ((((i & 0xff00ff) * i_236_ & ~0xff00ff)
				   + (i_236_ * (i & 0xff00) & 0xff0000))
				  >> 8);
		    int i_241_ = is_229_[i_231_];
		    is_229_[i_231_++]
			= ((((i_241_ & 0xff00ff) * i_237_ & ~0xff00ff)
			    + ((i_241_ & 0xff00) * i_237_ & 0xff0000))
			   >> 8) + i_240_;
		} else
		    i_231_++;
	    }
	    i_231_ += i_234_;
	    i_230_ += i_235_;
	}
    }
    
    Class172_Sub1(Class173_Sub3 class173_sub3, Class1 class1,
		  Class178_Sub2[] class178_sub2s, int[] is, int[] is_242_) {
	super(class173_sub3, class1);
	((Class172_Sub1) this).aClass173_Sub3_9113 = class173_sub3;
	((Class172_Sub1) this).anIntArray9110 = is;
	((Class172_Sub1) this).anIntArray9111 = is_242_;
	((Class172_Sub1) this).aByteArrayArray9112
	    = new byte[class178_sub2s.length][];
	((Class172_Sub1) this).anIntArray9109 = new int[class178_sub2s.length];
	((Class172_Sub1) this).anIntArray9108 = new int[class178_sub2s.length];
	for (int i = 0; i < class178_sub2s.length; i++) {
	    ((Class172_Sub1) this).aByteArrayArray9112[i]
		= class178_sub2s[i].aByteArray9770;
	    ((Class172_Sub1) this).anIntArray9109[i]
		= class178_sub2s[i].anInt9765;
	    ((Class172_Sub1) this).anIntArray9108[i]
		= class178_sub2s[i].anInt9767;
	}
    }
    
    void method2129(char c, int i, int i_243_, int i_244_, boolean bool) {
	if (null
	    != (((Class173_Sub3) ((Class172_Sub1) this).aClass173_Sub3_9113)
		.anIntArray9719)) {
	    i += ((Class172_Sub1) this).anIntArray9108[c];
	    i_243_ += ((Class172_Sub1) this).anIntArray9109[c];
	    int i_245_ = ((Class172_Sub1) this).anIntArray9110[c];
	    int i_246_ = ((Class172_Sub1) this).anIntArray9111[c];
	    int i_247_
		= (((Class173_Sub3) ((Class172_Sub1) this).aClass173_Sub3_9113)
		   .anInt9735) * 111437289;
	    int i_248_ = i + i_247_ * i_243_;
	    int i_249_ = i_247_ - i_245_;
	    int i_250_ = 0;
	    int i_251_ = 0;
	    if (i_243_ < 592117349 * (((Class173_Sub3) (((Class172_Sub1) this)
							.aClass173_Sub3_9113))
				      .anInt9725)) {
		int i_252_ = ((((Class173_Sub3)
				((Class172_Sub1) this).aClass173_Sub3_9113)
			       .anInt9725) * 592117349
			      - i_243_);
		i_246_ -= i_252_;
		i_243_ = 592117349 * (((Class173_Sub3) (((Class172_Sub1) this)
							.aClass173_Sub3_9113))
				      .anInt9725);
		i_251_ += i_252_ * i_245_;
		i_248_ += i_247_ * i_252_;
	    }
	    if (i_243_ + i_246_
		> 6965409 * ((Class173_Sub3) (((Class172_Sub1) this)
					      .aClass173_Sub3_9113)).anInt9726)
		i_246_ -= i_246_ + i_243_ - 6965409 * (((Class173_Sub3)
							(((Class172_Sub1) this)
							 .aClass173_Sub3_9113))
						       .anInt9726);
	    if (i < -993497119 * (((Class173_Sub3)
				   ((Class172_Sub1) this).aClass173_Sub3_9113)
				  .anInt9723)) {
		int i_253_ = ((((Class173_Sub3)
				((Class172_Sub1) this).aClass173_Sub3_9113)
			       .anInt9723) * -993497119
			      - i);
		i_245_ -= i_253_;
		i = -993497119 * (((Class173_Sub3)
				   ((Class172_Sub1) this).aClass173_Sub3_9113)
				  .anInt9723);
		i_251_ += i_253_;
		i_248_ += i_253_;
		i_250_ += i_253_;
		i_249_ += i_253_;
	    }
	    if (i_245_ + i
		> (((Class173_Sub3) ((Class172_Sub1) this).aClass173_Sub3_9113)
		   .anInt9724) * 630968029) {
		int i_254_
		    = (i_245_ + i
		       - 630968029 * (((Class173_Sub3) (((Class172_Sub1) this)
							.aClass173_Sub3_9113))
				      .anInt9724));
		i_245_ -= i_254_;
		i_250_ += i_254_;
		i_249_ += i_254_;
	    }
	    if (i_245_ > 0 && i_246_ > 0) {
		if ((i_244_ & ~0xffffff) == -16777216)
		    method8390(((Class172_Sub1) this).aByteArrayArray9112[c],
			       (((Class173_Sub3)
				 ((Class172_Sub1) this).aClass173_Sub3_9113)
				.anIntArray9719),
			       i_244_, i_251_, i_248_, i_245_, i_246_, i_249_,
			       i_250_);
		else if ((i_244_ & ~0xffffff) != 0)
		    method8391(((Class172_Sub1) this).aByteArrayArray9112[c],
			       (((Class173_Sub3)
				 ((Class172_Sub1) this).aClass173_Sub3_9113)
				.anIntArray9719),
			       i_244_, i_251_, i_248_, i_245_, i_246_, i_249_,
			       i_250_);
	    }
	}
    }
}
