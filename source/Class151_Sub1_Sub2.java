/* Class151_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class151_Sub1_Sub2 extends Class151_Sub1
{
    int[] anIntArray11308;
    
    public void method1795(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			   int i_4_) {
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is == null)
	    throw new IllegalStateException("");
	for (int i_5_ = 0; i_5_ < i_2_; i_5_++) {
	    int i_6_
		= (i_0_ + i_5_) * ((Class151_Sub1_Sub2) this).anInt8803 + i;
	    int i_7_ = (((i_4_ + i_5_)
			 * (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					      .aClass173_Sub3_8814)).anInt9735
			    * 111437289))
			+ i_3_);
	    for (int i_8_ = 0; i_8_ < i_1_; i_8_++)
		((Class151_Sub1_Sub2) this).anIntArray11308[i_6_ + i_8_]
		    = is[i_7_ + i_8_];
	}
    }
    
    Class151_Sub1_Sub2(Class173_Sub3 class173_sub3, int[] is, int i, int i_9_,
		       int i_10_, int i_11_, boolean bool) {
	super(class173_sub3, i_10_, i_11_);
	if (bool)
	    ((Class151_Sub1_Sub2) this).anIntArray11308
		= new int[i_10_ * i_11_];
	else
	    ((Class151_Sub1_Sub2) this).anIntArray11308 = is;
	i_9_ -= ((Class151_Sub1_Sub2) this).anInt8803;
	int i_12_ = 0;
	for (int i_13_ = 0; i_13_ < i_11_; i_13_++) {
	    for (int i_14_ = 0; i_14_ < i_10_; i_14_++) {
		int i_15_ = is[i++];
		if (i_15_ >>> 24 == 255)
		    ((Class151_Sub1_Sub2) this).anIntArray11308[i_12_++]
			= (i_15_ & 0xffffff) == 0 ? -16777215 : i_15_;
		else
		    ((Class151_Sub1_Sub2) this).anIntArray11308[i_12_++] = 0;
	    }
	    i += i_9_;
	}
    }
    
    void method8294(int i, int i_16_) {
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    if (anInt8822 == 0) {
		if (anInt8825 == 0) {
		    int i_17_ = anInt8816;
		    while (i_17_ < 0) {
			int i_18_ = anInt8818;
			int i_19_ = anInt8807;
			int i_20_ = anInt8826;
			int i_21_ = anInt8809;
			if (i_19_ >= 0 && i_20_ >= 0
			    && i_19_ - (((Class151_Sub1_Sub2) this).anInt8803
					<< 12) < 0
			    && i_20_ - (((Class151_Sub1_Sub2) this).anInt8804
					<< 12) < 0) {
			    for (/**/; i_21_ < 0; i_21_++)
				method10364(((i_20_ >> 12)
					     * (((Class151_Sub1_Sub2) this)
						.anInt8803)) + (i_19_ >> 12),
					    i_18_++, is, i, i_16_);
			}
			i_17_++;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_22_ = anInt8816;
		    while (i_22_ < 0) {
			int i_23_ = anInt8818;
			int i_24_ = anInt8807;
			int i_25_ = anInt8826 + anInt8828;
			int i_26_ = anInt8809;
			if (i_24_ >= 0
			    && i_24_ - (((Class151_Sub1_Sub2) this).anInt8803
					<< 12) < 0) {
			    int i_27_;
			    if ((i_27_ = i_25_ - ((((Class151_Sub1_Sub2) this)
						   .anInt8804)
						  << 12))
				>= 0) {
				i_27_ = (anInt8825 - i_27_) / anInt8825;
				i_26_ += i_27_;
				i_25_ += anInt8825 * i_27_;
				i_23_ += i_27_;
			    }
			    if ((i_27_ = (i_25_ - anInt8825) / anInt8825)
				> i_26_)
				i_26_ = i_27_;
			    for (/**/; i_26_ < 0; i_26_++) {
				method10364(((i_25_ >> 12)
					     * (((Class151_Sub1_Sub2) this)
						.anInt8803)) + (i_24_ >> 12),
					    i_23_++, is, i, i_16_);
				i_25_ += anInt8825;
			    }
			}
			i_22_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_28_ = anInt8816;
		    while (i_28_ < 0) {
			int i_29_ = anInt8818;
			int i_30_ = anInt8807;
			int i_31_ = anInt8826 + anInt8828;
			int i_32_ = anInt8809;
			if (i_30_ >= 0
			    && i_30_ - (((Class151_Sub1_Sub2) this).anInt8803
					<< 12) < 0) {
			    if (i_31_ < 0) {
				int i_33_
				    = (anInt8825 - 1 - i_31_) / anInt8825;
				i_32_ += i_33_;
				i_31_ += anInt8825 * i_33_;
				i_29_ += i_33_;
			    }
			    int i_34_;
			    if ((i_34_
				 = (1 + i_31_
				    - (((Class151_Sub1_Sub2) this).anInt8804
				       << 12)
				    - anInt8825) / anInt8825)
				> i_32_)
				i_32_ = i_34_;
			    for (/**/; i_32_ < 0; i_32_++) {
				method10364(((i_31_ >> 12)
					     * (((Class151_Sub1_Sub2) this)
						.anInt8803)) + (i_30_ >> 12),
					    i_29_++, is, i, i_16_);
				i_31_ += anInt8825;
			    }
			}
			i_28_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8822 < 0) {
		if (anInt8825 == 0) {
		    int i_35_ = anInt8816;
		    while (i_35_ < 0) {
			int i_36_ = anInt8818;
			int i_37_ = anInt8807 + anInt8805;
			int i_38_ = anInt8826;
			int i_39_ = anInt8809;
			if (i_38_ >= 0
			    && i_38_ - (((Class151_Sub1_Sub2) this).anInt8804
					<< 12) < 0) {
			    int i_40_;
			    if ((i_40_ = i_37_ - ((((Class151_Sub1_Sub2) this)
						   .anInt8803)
						  << 12))
				>= 0) {
				i_40_ = (anInt8822 - i_40_) / anInt8822;
				i_39_ += i_40_;
				i_37_ += anInt8822 * i_40_;
				i_36_ += i_40_;
			    }
			    if ((i_40_ = (i_37_ - anInt8822) / anInt8822)
				> i_39_)
				i_39_ = i_40_;
			    for (/**/; i_39_ < 0; i_39_++) {
				method10364(((i_38_ >> 12)
					     * (((Class151_Sub1_Sub2) this)
						.anInt8803)) + (i_37_ >> 12),
					    i_36_++, is, i, i_16_);
				i_37_ += anInt8822;
			    }
			}
			i_35_++;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_41_ = anInt8816;
		    while (i_41_ < 0) {
			int i_42_ = anInt8818;
			int i_43_ = anInt8807 + anInt8805;
			int i_44_ = anInt8826 + anInt8828;
			int i_45_ = anInt8809;
			int i_46_;
			if ((i_46_
			     = i_43_ - (((Class151_Sub1_Sub2) this).anInt8803
					<< 12))
			    >= 0) {
			    i_46_ = (anInt8822 - i_46_) / anInt8822;
			    i_45_ += i_46_;
			    i_43_ += anInt8822 * i_46_;
			    i_44_ += anInt8825 * i_46_;
			    i_42_ += i_46_;
			}
			if ((i_46_ = (i_43_ - anInt8822) / anInt8822) > i_45_)
			    i_45_ = i_46_;
			if ((i_46_
			     = i_44_ - (((Class151_Sub1_Sub2) this).anInt8804
					<< 12))
			    >= 0) {
			    i_46_ = (anInt8825 - i_46_) / anInt8825;
			    i_45_ += i_46_;
			    i_43_ += anInt8822 * i_46_;
			    i_44_ += anInt8825 * i_46_;
			    i_42_ += i_46_;
			}
			if ((i_46_ = (i_44_ - anInt8825) / anInt8825) > i_45_)
			    i_45_ = i_46_;
			for (/**/; i_45_ < 0; i_45_++) {
			    method10364(((i_44_ >> 12) * ((Class151_Sub1_Sub2)
							  this).anInt8803
					 + (i_43_ >> 12)),
					i_42_++, is, i, i_16_);
			    i_43_ += anInt8822;
			    i_44_ += anInt8825;
			}
			i_41_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_47_ = anInt8816;
		    while (i_47_ < 0) {
			int i_48_ = anInt8818;
			int i_49_ = anInt8807 + anInt8805;
			int i_50_ = anInt8826 + anInt8828;
			int i_51_ = anInt8809;
			int i_52_;
			if ((i_52_
			     = i_49_ - (((Class151_Sub1_Sub2) this).anInt8803
					<< 12))
			    >= 0) {
			    i_52_ = (anInt8822 - i_52_) / anInt8822;
			    i_51_ += i_52_;
			    i_49_ += anInt8822 * i_52_;
			    i_50_ += anInt8825 * i_52_;
			    i_48_ += i_52_;
			}
			if ((i_52_ = (i_49_ - anInt8822) / anInt8822) > i_51_)
			    i_51_ = i_52_;
			if (i_50_ < 0) {
			    i_52_ = (anInt8825 - 1 - i_50_) / anInt8825;
			    i_51_ += i_52_;
			    i_49_ += anInt8822 * i_52_;
			    i_50_ += anInt8825 * i_52_;
			    i_48_ += i_52_;
			}
			if ((i_52_
			     = (1 + i_50_
				- (((Class151_Sub1_Sub2) this).anInt8804 << 12)
				- anInt8825) / anInt8825)
			    > i_51_)
			    i_51_ = i_52_;
			for (/**/; i_51_ < 0; i_51_++) {
			    method10364(((i_50_ >> 12) * ((Class151_Sub1_Sub2)
							  this).anInt8803
					 + (i_49_ >> 12)),
					i_48_++, is, i, i_16_);
			    i_49_ += anInt8822;
			    i_50_ += anInt8825;
			}
			i_47_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8825 == 0) {
		int i_53_ = anInt8816;
		while (i_53_ < 0) {
		    int i_54_ = anInt8818;
		    int i_55_ = anInt8807 + anInt8805;
		    int i_56_ = anInt8826;
		    int i_57_ = anInt8809;
		    if (i_56_ >= 0
			&& i_56_ - (((Class151_Sub1_Sub2) this).anInt8804
				    << 12) < 0) {
			if (i_55_ < 0) {
			    int i_58_ = (anInt8822 - 1 - i_55_) / anInt8822;
			    i_57_ += i_58_;
			    i_55_ += anInt8822 * i_58_;
			    i_54_ += i_58_;
			}
			int i_59_;
			if ((i_59_
			     = (1 + i_55_
				- (((Class151_Sub1_Sub2) this).anInt8803 << 12)
				- anInt8822) / anInt8822)
			    > i_57_)
			    i_57_ = i_59_;
			for (/**/; i_57_ < 0; i_57_++) {
			    method10364(((i_56_ >> 12) * ((Class151_Sub1_Sub2)
							  this).anInt8803
					 + (i_55_ >> 12)),
					i_54_++, is, i, i_16_);
			    i_55_ += anInt8822;
			}
		    }
		    i_53_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else if (anInt8825 < 0) {
		for (int i_60_ = anInt8816; i_60_ < 0; i_60_++) {
		    int i_61_ = anInt8818;
		    int i_62_ = anInt8807 + anInt8805;
		    int i_63_ = anInt8826 + anInt8828;
		    int i_64_ = anInt8809;
		    if (i_62_ < 0) {
			int i_65_ = (anInt8822 - 1 - i_62_) / anInt8822;
			i_64_ += i_65_;
			i_62_ += anInt8822 * i_65_;
			i_63_ += anInt8825 * i_65_;
			i_61_ += i_65_;
		    }
		    int i_66_;
		    if ((i_66_
			 = (1 + i_62_
			    - (((Class151_Sub1_Sub2) this).anInt8803 << 12)
			    - anInt8822) / anInt8822)
			> i_64_)
			i_64_ = i_66_;
		    if ((i_66_ = i_63_ - (((Class151_Sub1_Sub2) this).anInt8804
					  << 12))
			>= 0) {
			i_66_ = (anInt8825 - i_66_) / anInt8825;
			i_64_ += i_66_;
			i_62_ += anInt8822 * i_66_;
			i_63_ += anInt8825 * i_66_;
			i_61_ += i_66_;
		    }
		    if ((i_66_ = (i_63_ - anInt8825) / anInt8825) > i_64_)
			i_64_ = i_66_;
		    for (/**/; i_64_ < 0; i_64_++) {
			method10364((((i_63_ >> 12)
				      * ((Class151_Sub1_Sub2) this).anInt8803)
				     + (i_62_ >> 12)),
				    i_61_++, is, i, i_16_);
			i_62_ += anInt8822;
			i_63_ += anInt8825;
		    }
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else {
		for (int i_67_ = anInt8816; i_67_ < 0; i_67_++) {
		    int i_68_ = anInt8818;
		    int i_69_ = anInt8807 + anInt8805;
		    int i_70_ = anInt8826 + anInt8828;
		    int i_71_ = anInt8809;
		    if (i_69_ < 0) {
			int i_72_ = (anInt8822 - 1 - i_69_) / anInt8822;
			i_71_ += i_72_;
			i_69_ += anInt8822 * i_72_;
			i_70_ += anInt8825 * i_72_;
			i_68_ += i_72_;
		    }
		    int i_73_;
		    if ((i_73_
			 = (1 + i_69_
			    - (((Class151_Sub1_Sub2) this).anInt8803 << 12)
			    - anInt8822) / anInt8822)
			> i_71_)
			i_71_ = i_73_;
		    if (i_70_ < 0) {
			i_73_ = (anInt8825 - 1 - i_70_) / anInt8825;
			i_71_ += i_73_;
			i_69_ += anInt8822 * i_73_;
			i_70_ += anInt8825 * i_73_;
			i_68_ += i_73_;
		    }
		    if ((i_73_
			 = (1 + i_70_
			    - (((Class151_Sub1_Sub2) this).anInt8804 << 12)
			    - anInt8825) / anInt8825)
			> i_71_)
			i_71_ = i_73_;
		    for (/**/; i_71_ < 0; i_71_++) {
			method10364((((i_70_ >> 12)
				      * ((Class151_Sub1_Sub2) this).anInt8803)
				     + (i_69_ >> 12)),
				    i_68_++, is, i, i_16_);
			i_69_ += anInt8822;
			i_70_ += anInt8825;
		    }
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    }
	}
    }
    
    public void method1770(int i, int i_74_, int i_75_, int i_76_, int[] is,
			   int i_77_, int i_78_) {
	i_78_ -= i_75_;
	for (int i_79_ = 0; i_79_ < i_76_; i_79_++) {
	    int i_80_ = (i_74_ + i_79_) * i_75_ + i;
	    for (int i_81_ = 0; i_81_ < i_75_; i_81_++)
		((Class151_Sub1_Sub2) this).anIntArray11308[i_80_ + i_81_]
		    = is[i_77_++];
	    i_77_ += i_78_;
	}
    }
    
    void method10363(int i, int i_82_, int i_83_, int i_84_, int[] is,
		     int i_85_, int i_86_) {
	i_86_ -= i_83_;
	for (int i_87_ = 0; i_87_ < i_84_; i_87_++) {
	    int i_88_ = (i_82_ + i_87_) * i_83_ + i;
	    for (int i_89_ = 0; i_89_ < i_83_; i_89_++)
		is[i_85_++] = (((Class151_Sub1_Sub2) this).anIntArray11308
			       [i_88_ + i_89_]);
	    i_85_ += i_86_;
	}
    }
    
    Class151_Sub1_Sub2(Class173_Sub3 class173_sub3, int[] is, int i,
		       int i_90_) {
	super(class173_sub3, i, i_90_);
	((Class151_Sub1_Sub2) this).anIntArray11308 = is;
    }
    
    public void method1784(int i, int i_91_, int i_92_, int i_93_, int i_94_,
			   int i_95_) {
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is == null)
	    throw new IllegalStateException("");
	for (int i_96_ = 0; i_96_ < i_93_; i_96_++) {
	    int i_97_
		= (i_91_ + i_96_) * ((Class151_Sub1_Sub2) this).anInt8803 + i;
	    int i_98_ = (((i_95_ + i_96_)
			  * (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					       .aClass173_Sub3_8814)).anInt9735
			     * 111437289))
			 + i_94_);
	    for (int i_99_ = 0; i_99_ < i_92_; i_99_++)
		((Class151_Sub1_Sub2) this).anIntArray11308[i_97_ + i_99_]
		    = is[i_98_ + i_99_];
	}
    }
    
    public void method1787(int i, int i_100_, int i_101_) {
	throw new IllegalStateException("");
    }
    
    public void method1812(int i, int i_102_, int i_103_) {
	throw new IllegalStateException("");
    }
    
    public void method1780(int i, int i_104_, int i_105_, int i_106_,
			   int i_107_) {
	if (((Class151_Sub1_Sub2) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    int i_108_ = (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					    .aClass173_Sub3_8814)).anInt9735
			  * 111437289);
	    i += ((Class151_Sub1_Sub2) this).anInt8806;
	    i_104_ += ((Class151_Sub1_Sub2) this).anInt8819;
	    int i_109_ = i_104_ * i_108_ + i;
	    int i_110_ = 0;
	    int i_111_ = ((Class151_Sub1_Sub2) this).anInt8804;
	    int i_112_ = ((Class151_Sub1_Sub2) this).anInt8803;
	    int i_113_ = i_108_ - i_112_;
	    int i_114_ = 0;
	    if (i_104_ < (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					    .aClass173_Sub3_8814)).anInt9725
			  * 592117349)) {
		int i_115_ = ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						 .aClass173_Sub3_8814))
			       .anInt9725) * 592117349
			      - i_104_);
		i_111_ -= i_115_;
		i_104_ = (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					    .aClass173_Sub3_8814)).anInt9725
			  * 592117349);
		i_110_ += i_115_ * i_112_;
		i_109_ += i_115_ * i_108_;
	    }
	    if (i_104_ + i_111_
		> ((Class173_Sub3) (((Class151_Sub1_Sub2) this)
				    .aClass173_Sub3_8814)).anInt9726 * 6965409)
		i_111_ -= (i_104_ + i_111_
			   - (((Class173_Sub3)
			       ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
			      .anInt9726) * 6965409);
	    if (i < (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119)) {
		int i_116_ = ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						 .aClass173_Sub3_8814))
			       .anInt9723) * -993497119
			      - i);
		i_112_ -= i_116_;
		i = (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119);
		i_110_ += i_116_;
		i_109_ += i_116_;
		i_114_ += i_116_;
		i_113_ += i_116_;
	    }
	    if (i + i_112_ > (((Class173_Sub3)
			       ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
			      .anInt9724) * 630968029) {
		int i_117_ = (i + i_112_
			      - (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						   .aClass173_Sub3_8814))
				 .anInt9724) * 630968029);
		i_112_ -= i_117_;
		i_114_ += i_117_;
		i_113_ += i_117_;
	    }
	    if (i_112_ > 0 && i_111_ > 0) {
		if (i_107_ == 0) {
		    if (i_105_ == 1) {
			for (int i_118_ = -i_111_; i_118_ < 0; i_118_++) {
			    int i_119_ = i_109_ + i_112_ - 3;
			    while (i_109_ < i_119_) {
				is[i_109_++] = (((Class151_Sub1_Sub2) this)
						.anIntArray11308[i_110_++]);
				is[i_109_++] = (((Class151_Sub1_Sub2) this)
						.anIntArray11308[i_110_++]);
				is[i_109_++] = (((Class151_Sub1_Sub2) this)
						.anIntArray11308[i_110_++]);
				is[i_109_++] = (((Class151_Sub1_Sub2) this)
						.anIntArray11308[i_110_++]);
			    }
			    i_119_ += 3;
			    while (i_109_ < i_119_)
				is[i_109_++] = (((Class151_Sub1_Sub2) this)
						.anIntArray11308[i_110_++]);
			    i_109_ += i_113_;
			    i_110_ += i_114_;
			}
		    } else if (i_105_ == 0) {
			int i_120_ = (i_106_ & 0xff0000) >> 16;
			int i_121_ = (i_106_ & 0xff00) >> 8;
			int i_122_ = i_106_ & 0xff;
			for (int i_123_ = -i_111_; i_123_ < 0; i_123_++) {
			    for (int i_124_ = -i_112_; i_124_ < 0; i_124_++) {
				int i_125_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308[i_110_++]);
				int i_126_
				    = (i_125_ & 0xff0000) * i_120_ & ~0xffffff;
				int i_127_
				    = (i_125_ & 0xff00) * i_121_ & 0xff0000;
				int i_128_ = (i_125_ & 0xff) * i_122_ & 0xff00;
				is[i_109_++]
				    = (i_126_ | i_127_ | i_128_) >>> 8;
			    }
			    i_109_ += i_113_;
			    i_110_ += i_114_;
			}
		    } else if (i_105_ == 3) {
			for (int i_129_ = -i_111_; i_129_ < 0; i_129_++) {
			    for (int i_130_ = -i_112_; i_130_ < 0; i_130_++) {
				int i_131_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308[i_110_++]);
				int i_132_ = i_131_ + i_106_;
				int i_133_ = ((i_131_ & 0xff00ff)
					      + (i_106_ & 0xff00ff));
				int i_134_ = ((i_133_ & 0x1000100)
					      + (i_132_ - i_133_ & 0x10000));
				is[i_109_++]
				    = i_132_ - i_134_ | i_134_ - (i_134_
								  >>> 8);
			    }
			    i_109_ += i_113_;
			    i_110_ += i_114_;
			}
		    } else if (i_105_ == 2) {
			int i_135_ = i_106_ >>> 24;
			int i_136_ = 256 - i_135_;
			int i_137_ = (i_106_ & 0xff00ff) * i_136_ & ~0xff00ff;
			int i_138_ = (i_106_ & 0xff00) * i_136_ & 0xff0000;
			i_106_ = (i_137_ | i_138_) >>> 8;
			for (int i_139_ = -i_111_; i_139_ < 0; i_139_++) {
			    for (int i_140_ = -i_112_; i_140_ < 0; i_140_++) {
				int i_141_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308[i_110_++]);
				i_137_
				    = (i_141_ & 0xff00ff) * i_135_ & ~0xff00ff;
				i_138_ = (i_141_ & 0xff00) * i_135_ & 0xff0000;
				is[i_109_++]
				    = ((i_137_ | i_138_) >>> 8) + i_106_;
			    }
			    i_109_ += i_113_;
			    i_110_ += i_114_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_107_ == 1) {
		    if (i_105_ == 1) {
			for (int i_142_ = -i_111_; i_142_ < 0; i_142_++) {
			    int i_143_ = i_109_ + i_112_ - 3;
			    while (i_109_ < i_143_) {
				int i_144_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308[i_110_++]);
				if (i_144_ != 0)
				    is[i_109_++] = i_144_;
				else
				    i_109_++;
				i_144_ = (((Class151_Sub1_Sub2) this)
					  .anIntArray11308[i_110_++]);
				if (i_144_ != 0)
				    is[i_109_++] = i_144_;
				else
				    i_109_++;
				i_144_ = (((Class151_Sub1_Sub2) this)
					  .anIntArray11308[i_110_++]);
				if (i_144_ != 0)
				    is[i_109_++] = i_144_;
				else
				    i_109_++;
				i_144_ = (((Class151_Sub1_Sub2) this)
					  .anIntArray11308[i_110_++]);
				if (i_144_ != 0)
				    is[i_109_++] = i_144_;
				else
				    i_109_++;
			    }
			    i_143_ += 3;
			    while (i_109_ < i_143_) {
				int i_145_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308[i_110_++]);
				if (i_145_ != 0)
				    is[i_109_++] = i_145_;
				else
				    i_109_++;
			    }
			    i_109_ += i_113_;
			    i_110_ += i_114_;
			}
		    } else if (i_105_ == 0) {
			if ((i_106_ & 0xffffff) == 16777215) {
			    int i_146_ = i_106_ >>> 24;
			    int i_147_ = 256 - i_146_;
			    for (int i_148_ = -i_111_; i_148_ < 0; i_148_++) {
				for (int i_149_ = -i_112_; i_149_ < 0;
				     i_149_++) {
				    int i_150_ = (((Class151_Sub1_Sub2) this)
						  .anIntArray11308[i_110_++]);
				    if (i_150_ != 0) {
					int i_151_ = is[i_109_];
					is[i_109_++]
					    = ((((i_150_ & 0xff00ff) * i_146_
						 + ((i_151_ & 0xff00ff)
						    * i_147_))
						& ~0xff00ff)
					       + (((i_150_ & 0xff00) * i_146_
						   + ((i_151_ & 0xff00)
						      * i_147_))
						  & 0xff0000)) >> 8;
				    } else
					i_109_++;
				}
				i_109_ += i_113_;
				i_110_ += i_114_;
			    }
			} else {
			    int i_152_ = (i_106_ & 0xff0000) >> 16;
			    int i_153_ = (i_106_ & 0xff00) >> 8;
			    int i_154_ = i_106_ & 0xff;
			    int i_155_ = i_106_ >>> 24;
			    int i_156_ = 256 - i_155_;
			    for (int i_157_ = -i_111_; i_157_ < 0; i_157_++) {
				for (int i_158_ = -i_112_; i_158_ < 0;
				     i_158_++) {
				    int i_159_ = (((Class151_Sub1_Sub2) this)
						  .anIntArray11308[i_110_++]);
				    if (i_159_ != 0) {
					if (i_155_ != 255) {
					    int i_160_
						= ((i_159_ & 0xff0000) * i_152_
						   & ~0xffffff);
					    int i_161_
						= ((i_159_ & 0xff00) * i_153_
						   & 0xff0000);
					    int i_162_
						= ((i_159_ & 0xff) * i_154_
						   & 0xff00);
					    i_159_ = (i_160_ | i_161_
						      | i_162_) >>> 8;
					    int i_163_ = is[i_109_];
					    is[i_109_++]
						= (((((i_159_ & 0xff00ff)
						      * i_155_)
						     + ((i_163_ & 0xff00ff)
							* i_156_))
						    & ~0xff00ff)
						   + ((((i_159_ & 0xff00)
							* i_155_)
						       + ((i_163_ & 0xff00)
							  * i_156_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_164_
						= ((i_159_ & 0xff0000) * i_152_
						   & ~0xffffff);
					    int i_165_
						= ((i_159_ & 0xff00) * i_153_
						   & 0xff0000);
					    int i_166_
						= ((i_159_ & 0xff) * i_154_
						   & 0xff00);
					    is[i_109_++] = (i_164_ | i_165_
							    | i_166_) >>> 8;
					}
				    } else
					i_109_++;
				}
				i_109_ += i_113_;
				i_110_ += i_114_;
			    }
			}
		    } else if (i_105_ == 3) {
			int i_167_ = i_106_ >>> 24;
			int i_168_ = 256 - i_167_;
			for (int i_169_ = -i_111_; i_169_ < 0; i_169_++) {
			    for (int i_170_ = -i_112_; i_170_ < 0; i_170_++) {
				int i_171_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308[i_110_++]);
				int i_172_ = i_171_ + i_106_;
				int i_173_ = ((i_171_ & 0xff00ff)
					      + (i_106_ & 0xff00ff));
				int i_174_ = ((i_173_ & 0x1000100)
					      + (i_172_ - i_173_ & 0x10000));
				i_174_ = i_172_ - i_174_ | i_174_ - (i_174_
								     >>> 8);
				if (i_171_ == 0 && i_167_ != 255) {
				    i_171_ = i_174_;
				    i_174_ = is[i_109_];
				    i_174_ = ((((i_171_ & 0xff00ff) * i_167_
						+ (i_174_ & 0xff00ff) * i_168_)
					       & ~0xff00ff)
					      + (((i_171_ & 0xff00) * i_167_
						  + (i_174_ & 0xff00) * i_168_)
						 & 0xff0000)) >> 8;
				}
				is[i_109_++] = i_174_;
			    }
			    i_109_ += i_113_;
			    i_110_ += i_114_;
			}
		    } else if (i_105_ == 2) {
			int i_175_ = i_106_ >>> 24;
			int i_176_ = 256 - i_175_;
			int i_177_ = (i_106_ & 0xff00ff) * i_176_ & ~0xff00ff;
			int i_178_ = (i_106_ & 0xff00) * i_176_ & 0xff0000;
			i_106_ = (i_177_ | i_178_) >>> 8;
			for (int i_179_ = -i_111_; i_179_ < 0; i_179_++) {
			    for (int i_180_ = -i_112_; i_180_ < 0; i_180_++) {
				int i_181_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308[i_110_++]);
				if (i_181_ != 0) {
				    i_177_ = ((i_181_ & 0xff00ff) * i_175_
					      & ~0xff00ff);
				    i_178_ = ((i_181_ & 0xff00) * i_175_
					      & 0xff0000);
				    is[i_109_++]
					= ((i_177_ | i_178_) >>> 8) + i_106_;
				} else
				    i_109_++;
			    }
			    i_109_ += i_113_;
			    i_110_ += i_114_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_107_ == 2) {
		    if (i_105_ == 1) {
			for (int i_182_ = -i_111_; i_182_ < 0; i_182_++) {
			    for (int i_183_ = -i_112_; i_183_ < 0; i_183_++) {
				int i_184_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308[i_110_++]);
				if (i_184_ != 0) {
				    int i_185_ = is[i_109_];
				    int i_186_ = i_184_ + i_185_;
				    int i_187_ = ((i_184_ & 0xff00ff)
						  + (i_185_ & 0xff00ff));
				    i_185_ = ((i_187_ & 0x1000100)
					      + (i_186_ - i_187_ & 0x10000));
				    is[i_109_++]
					= i_186_ - i_185_ | i_185_ - (i_185_
								      >>> 8);
				} else
				    i_109_++;
			    }
			    i_109_ += i_113_;
			    i_110_ += i_114_;
			}
		    } else if (i_105_ == 0) {
			int i_188_ = (i_106_ & 0xff0000) >> 16;
			int i_189_ = (i_106_ & 0xff00) >> 8;
			int i_190_ = i_106_ & 0xff;
			for (int i_191_ = -i_111_; i_191_ < 0; i_191_++) {
			    for (int i_192_ = -i_112_; i_192_ < 0; i_192_++) {
				int i_193_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308[i_110_++]);
				if (i_193_ != 0) {
				    int i_194_ = ((i_193_ & 0xff0000) * i_188_
						  & ~0xffffff);
				    int i_195_ = ((i_193_ & 0xff00) * i_189_
						  & 0xff0000);
				    int i_196_
					= (i_193_ & 0xff) * i_190_ & 0xff00;
				    i_193_ = (i_194_ | i_195_ | i_196_) >>> 8;
				    int i_197_ = is[i_109_];
				    int i_198_ = i_193_ + i_197_;
				    int i_199_ = ((i_193_ & 0xff00ff)
						  + (i_197_ & 0xff00ff));
				    i_197_ = ((i_199_ & 0x1000100)
					      + (i_198_ - i_199_ & 0x10000));
				    is[i_109_++]
					= i_198_ - i_197_ | i_197_ - (i_197_
								      >>> 8);
				} else
				    i_109_++;
			    }
			    i_109_ += i_113_;
			    i_110_ += i_114_;
			}
		    } else if (i_105_ == 3) {
			for (int i_200_ = -i_111_; i_200_ < 0; i_200_++) {
			    for (int i_201_ = -i_112_; i_201_ < 0; i_201_++) {
				int i_202_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308[i_110_++]);
				int i_203_ = i_202_ + i_106_;
				int i_204_ = ((i_202_ & 0xff00ff)
					      + (i_106_ & 0xff00ff));
				int i_205_ = ((i_204_ & 0x1000100)
					      + (i_203_ - i_204_ & 0x10000));
				i_202_ = i_203_ - i_205_ | i_205_ - (i_205_
								     >>> 8);
				i_205_ = is[i_109_];
				i_203_ = i_202_ + i_205_;
				i_204_ = (i_202_ & 0xff00ff) + (i_205_
								& 0xff00ff);
				i_205_
				    = (i_204_ & 0x1000100) + (i_203_ - i_204_
							      & 0x10000);
				is[i_109_++]
				    = i_203_ - i_205_ | i_205_ - (i_205_
								  >>> 8);
			    }
			    i_109_ += i_113_;
			    i_110_ += i_114_;
			}
		    } else if (i_105_ == 2) {
			int i_206_ = i_106_ >>> 24;
			int i_207_ = 256 - i_206_;
			int i_208_ = (i_106_ & 0xff00ff) * i_207_ & ~0xff00ff;
			int i_209_ = (i_106_ & 0xff00) * i_207_ & 0xff0000;
			i_106_ = (i_208_ | i_209_) >>> 8;
			for (int i_210_ = -i_111_; i_210_ < 0; i_210_++) {
			    for (int i_211_ = -i_112_; i_211_ < 0; i_211_++) {
				int i_212_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308[i_110_++]);
				if (i_212_ != 0) {
				    i_208_ = ((i_212_ & 0xff00ff) * i_206_
					      & ~0xff00ff);
				    i_209_ = ((i_212_ & 0xff00) * i_206_
					      & 0xff0000);
				    i_212_
					= ((i_208_ | i_209_) >>> 8) + i_106_;
				    int i_213_ = is[i_109_];
				    int i_214_ = i_212_ + i_213_;
				    int i_215_ = ((i_212_ & 0xff00ff)
						  + (i_213_ & 0xff00ff));
				    i_213_ = ((i_215_ & 0x1000100)
					      + (i_214_ - i_215_ & 0x10000));
				    is[i_109_++]
					= i_214_ - i_213_ | i_213_ - (i_213_
								      >>> 8);
				} else
				    i_109_++;
			    }
			    i_109_ += i_113_;
			    i_110_ += i_114_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method8299(int i, int i_216_) {
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    if (anInt8822 == 0) {
		if (anInt8825 == 0) {
		    int i_217_ = anInt8816;
		    while (i_217_ < 0) {
			int i_218_ = anInt8818;
			int i_219_ = anInt8807;
			int i_220_ = anInt8826;
			int i_221_ = anInt8809;
			if (i_219_ >= 0 && i_220_ >= 0
			    && i_219_ - (((Class151_Sub1_Sub2) this).anInt8803
					 << 12) < 0
			    && i_220_ - (((Class151_Sub1_Sub2) this).anInt8804
					 << 12) < 0) {
			    for (/**/; i_221_ < 0; i_221_++)
				method10364(((i_220_ >> 12)
					     * (((Class151_Sub1_Sub2) this)
						.anInt8803)) + (i_219_ >> 12),
					    i_218_++, is, i, i_216_);
			}
			i_217_++;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_222_ = anInt8816;
		    while (i_222_ < 0) {
			int i_223_ = anInt8818;
			int i_224_ = anInt8807;
			int i_225_ = anInt8826 + anInt8828;
			int i_226_ = anInt8809;
			if (i_224_ >= 0
			    && i_224_ - (((Class151_Sub1_Sub2) this).anInt8803
					 << 12) < 0) {
			    int i_227_;
			    if ((i_227_
				 = (i_225_
				    - (((Class151_Sub1_Sub2) this).anInt8804
				       << 12)))
				>= 0) {
				i_227_ = (anInt8825 - i_227_) / anInt8825;
				i_226_ += i_227_;
				i_225_ += anInt8825 * i_227_;
				i_223_ += i_227_;
			    }
			    if ((i_227_ = (i_225_ - anInt8825) / anInt8825)
				> i_226_)
				i_226_ = i_227_;
			    for (/**/; i_226_ < 0; i_226_++) {
				method10364(((i_225_ >> 12)
					     * (((Class151_Sub1_Sub2) this)
						.anInt8803)) + (i_224_ >> 12),
					    i_223_++, is, i, i_216_);
				i_225_ += anInt8825;
			    }
			}
			i_222_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_228_ = anInt8816;
		    while (i_228_ < 0) {
			int i_229_ = anInt8818;
			int i_230_ = anInt8807;
			int i_231_ = anInt8826 + anInt8828;
			int i_232_ = anInt8809;
			if (i_230_ >= 0
			    && i_230_ - (((Class151_Sub1_Sub2) this).anInt8803
					 << 12) < 0) {
			    if (i_231_ < 0) {
				int i_233_
				    = (anInt8825 - 1 - i_231_) / anInt8825;
				i_232_ += i_233_;
				i_231_ += anInt8825 * i_233_;
				i_229_ += i_233_;
			    }
			    int i_234_;
			    if ((i_234_
				 = (1 + i_231_
				    - (((Class151_Sub1_Sub2) this).anInt8804
				       << 12)
				    - anInt8825) / anInt8825)
				> i_232_)
				i_232_ = i_234_;
			    for (/**/; i_232_ < 0; i_232_++) {
				method10364(((i_231_ >> 12)
					     * (((Class151_Sub1_Sub2) this)
						.anInt8803)) + (i_230_ >> 12),
					    i_229_++, is, i, i_216_);
				i_231_ += anInt8825;
			    }
			}
			i_228_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8822 < 0) {
		if (anInt8825 == 0) {
		    int i_235_ = anInt8816;
		    while (i_235_ < 0) {
			int i_236_ = anInt8818;
			int i_237_ = anInt8807 + anInt8805;
			int i_238_ = anInt8826;
			int i_239_ = anInt8809;
			if (i_238_ >= 0
			    && i_238_ - (((Class151_Sub1_Sub2) this).anInt8804
					 << 12) < 0) {
			    int i_240_;
			    if ((i_240_
				 = (i_237_
				    - (((Class151_Sub1_Sub2) this).anInt8803
				       << 12)))
				>= 0) {
				i_240_ = (anInt8822 - i_240_) / anInt8822;
				i_239_ += i_240_;
				i_237_ += anInt8822 * i_240_;
				i_236_ += i_240_;
			    }
			    if ((i_240_ = (i_237_ - anInt8822) / anInt8822)
				> i_239_)
				i_239_ = i_240_;
			    for (/**/; i_239_ < 0; i_239_++) {
				method10364(((i_238_ >> 12)
					     * (((Class151_Sub1_Sub2) this)
						.anInt8803)) + (i_237_ >> 12),
					    i_236_++, is, i, i_216_);
				i_237_ += anInt8822;
			    }
			}
			i_235_++;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_241_ = anInt8816;
		    while (i_241_ < 0) {
			int i_242_ = anInt8818;
			int i_243_ = anInt8807 + anInt8805;
			int i_244_ = anInt8826 + anInt8828;
			int i_245_ = anInt8809;
			int i_246_;
			if ((i_246_
			     = i_243_ - (((Class151_Sub1_Sub2) this).anInt8803
					 << 12))
			    >= 0) {
			    i_246_ = (anInt8822 - i_246_) / anInt8822;
			    i_245_ += i_246_;
			    i_243_ += anInt8822 * i_246_;
			    i_244_ += anInt8825 * i_246_;
			    i_242_ += i_246_;
			}
			if ((i_246_ = (i_243_ - anInt8822) / anInt8822)
			    > i_245_)
			    i_245_ = i_246_;
			if ((i_246_
			     = i_244_ - (((Class151_Sub1_Sub2) this).anInt8804
					 << 12))
			    >= 0) {
			    i_246_ = (anInt8825 - i_246_) / anInt8825;
			    i_245_ += i_246_;
			    i_243_ += anInt8822 * i_246_;
			    i_244_ += anInt8825 * i_246_;
			    i_242_ += i_246_;
			}
			if ((i_246_ = (i_244_ - anInt8825) / anInt8825)
			    > i_245_)
			    i_245_ = i_246_;
			for (/**/; i_245_ < 0; i_245_++) {
			    method10364(((i_244_ >> 12) * ((Class151_Sub1_Sub2)
							   this).anInt8803
					 + (i_243_ >> 12)),
					i_242_++, is, i, i_216_);
			    i_243_ += anInt8822;
			    i_244_ += anInt8825;
			}
			i_241_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_247_ = anInt8816;
		    while (i_247_ < 0) {
			int i_248_ = anInt8818;
			int i_249_ = anInt8807 + anInt8805;
			int i_250_ = anInt8826 + anInt8828;
			int i_251_ = anInt8809;
			int i_252_;
			if ((i_252_
			     = i_249_ - (((Class151_Sub1_Sub2) this).anInt8803
					 << 12))
			    >= 0) {
			    i_252_ = (anInt8822 - i_252_) / anInt8822;
			    i_251_ += i_252_;
			    i_249_ += anInt8822 * i_252_;
			    i_250_ += anInt8825 * i_252_;
			    i_248_ += i_252_;
			}
			if ((i_252_ = (i_249_ - anInt8822) / anInt8822)
			    > i_251_)
			    i_251_ = i_252_;
			if (i_250_ < 0) {
			    i_252_ = (anInt8825 - 1 - i_250_) / anInt8825;
			    i_251_ += i_252_;
			    i_249_ += anInt8822 * i_252_;
			    i_250_ += anInt8825 * i_252_;
			    i_248_ += i_252_;
			}
			if ((i_252_
			     = (1 + i_250_
				- (((Class151_Sub1_Sub2) this).anInt8804 << 12)
				- anInt8825) / anInt8825)
			    > i_251_)
			    i_251_ = i_252_;
			for (/**/; i_251_ < 0; i_251_++) {
			    method10364(((i_250_ >> 12) * ((Class151_Sub1_Sub2)
							   this).anInt8803
					 + (i_249_ >> 12)),
					i_248_++, is, i, i_216_);
			    i_249_ += anInt8822;
			    i_250_ += anInt8825;
			}
			i_247_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8825 == 0) {
		int i_253_ = anInt8816;
		while (i_253_ < 0) {
		    int i_254_ = anInt8818;
		    int i_255_ = anInt8807 + anInt8805;
		    int i_256_ = anInt8826;
		    int i_257_ = anInt8809;
		    if (i_256_ >= 0
			&& i_256_ - (((Class151_Sub1_Sub2) this).anInt8804
				     << 12) < 0) {
			if (i_255_ < 0) {
			    int i_258_ = (anInt8822 - 1 - i_255_) / anInt8822;
			    i_257_ += i_258_;
			    i_255_ += anInt8822 * i_258_;
			    i_254_ += i_258_;
			}
			int i_259_;
			if ((i_259_
			     = (1 + i_255_
				- (((Class151_Sub1_Sub2) this).anInt8803 << 12)
				- anInt8822) / anInt8822)
			    > i_257_)
			    i_257_ = i_259_;
			for (/**/; i_257_ < 0; i_257_++) {
			    method10364(((i_256_ >> 12) * ((Class151_Sub1_Sub2)
							   this).anInt8803
					 + (i_255_ >> 12)),
					i_254_++, is, i, i_216_);
			    i_255_ += anInt8822;
			}
		    }
		    i_253_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else if (anInt8825 < 0) {
		for (int i_260_ = anInt8816; i_260_ < 0; i_260_++) {
		    int i_261_ = anInt8818;
		    int i_262_ = anInt8807 + anInt8805;
		    int i_263_ = anInt8826 + anInt8828;
		    int i_264_ = anInt8809;
		    if (i_262_ < 0) {
			int i_265_ = (anInt8822 - 1 - i_262_) / anInt8822;
			i_264_ += i_265_;
			i_262_ += anInt8822 * i_265_;
			i_263_ += anInt8825 * i_265_;
			i_261_ += i_265_;
		    }
		    int i_266_;
		    if ((i_266_
			 = (1 + i_262_
			    - (((Class151_Sub1_Sub2) this).anInt8803 << 12)
			    - anInt8822) / anInt8822)
			> i_264_)
			i_264_ = i_266_;
		    if ((i_266_
			 = i_263_ - (((Class151_Sub1_Sub2) this).anInt8804
				     << 12))
			>= 0) {
			i_266_ = (anInt8825 - i_266_) / anInt8825;
			i_264_ += i_266_;
			i_262_ += anInt8822 * i_266_;
			i_263_ += anInt8825 * i_266_;
			i_261_ += i_266_;
		    }
		    if ((i_266_ = (i_263_ - anInt8825) / anInt8825) > i_264_)
			i_264_ = i_266_;
		    for (/**/; i_264_ < 0; i_264_++) {
			method10364((((i_263_ >> 12)
				      * ((Class151_Sub1_Sub2) this).anInt8803)
				     + (i_262_ >> 12)),
				    i_261_++, is, i, i_216_);
			i_262_ += anInt8822;
			i_263_ += anInt8825;
		    }
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else {
		for (int i_267_ = anInt8816; i_267_ < 0; i_267_++) {
		    int i_268_ = anInt8818;
		    int i_269_ = anInt8807 + anInt8805;
		    int i_270_ = anInt8826 + anInt8828;
		    int i_271_ = anInt8809;
		    if (i_269_ < 0) {
			int i_272_ = (anInt8822 - 1 - i_269_) / anInt8822;
			i_271_ += i_272_;
			i_269_ += anInt8822 * i_272_;
			i_270_ += anInt8825 * i_272_;
			i_268_ += i_272_;
		    }
		    int i_273_;
		    if ((i_273_
			 = (1 + i_269_
			    - (((Class151_Sub1_Sub2) this).anInt8803 << 12)
			    - anInt8822) / anInt8822)
			> i_271_)
			i_271_ = i_273_;
		    if (i_270_ < 0) {
			i_273_ = (anInt8825 - 1 - i_270_) / anInt8825;
			i_271_ += i_273_;
			i_269_ += anInt8822 * i_273_;
			i_270_ += anInt8825 * i_273_;
			i_268_ += i_273_;
		    }
		    if ((i_273_
			 = (1 + i_270_
			    - (((Class151_Sub1_Sub2) this).anInt8804 << 12)
			    - anInt8825) / anInt8825)
			> i_271_)
			i_271_ = i_273_;
		    for (/**/; i_271_ < 0; i_271_++) {
			method10364((((i_270_ >> 12)
				      * ((Class151_Sub1_Sub2) this).anInt8803)
				     + (i_269_ >> 12)),
				    i_268_++, is, i, i_216_);
			i_269_ += anInt8822;
			i_270_ += anInt8825;
		    }
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    }
	}
    }
    
    void method1777(int i, int i_274_, int i_275_, int i_276_, int i_277_,
		    int i_278_, int i_279_, int i_280_) {
	if (((Class151_Sub1_Sub2) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	if (i_275_ > 0 && i_276_ > 0) {
	    int[] is = (((Class173_Sub3)
			 ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
			.anIntArray9719);
	    if (is != null) {
		int i_281_ = 0;
		int i_282_ = 0;
		int i_283_
		    = (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					 .aClass173_Sub3_8814)).anInt9735
		       * 111437289);
		int i_284_ = (((Class151_Sub1_Sub2) this).anInt8806
			      + ((Class151_Sub1_Sub2) this).anInt8803
			      + ((Class151_Sub1_Sub2) this).anInt8832);
		int i_285_ = (((Class151_Sub1_Sub2) this).anInt8819
			      + ((Class151_Sub1_Sub2) this).anInt8804
			      + ((Class151_Sub1_Sub2) this).anInt8808);
		int i_286_ = (i_284_ << 16) / i_275_;
		int i_287_ = (i_285_ << 16) / i_276_;
		if (((Class151_Sub1_Sub2) this).anInt8806 > 0) {
		    int i_288_ = ((((Class151_Sub1_Sub2) this).anInt8806 << 16)
				  + i_286_ - 1) / i_286_;
		    i += i_288_;
		    i_281_
			+= (i_288_ * i_286_
			    - (((Class151_Sub1_Sub2) this).anInt8806 << 16));
		}
		if (((Class151_Sub1_Sub2) this).anInt8819 > 0) {
		    int i_289_ = ((((Class151_Sub1_Sub2) this).anInt8819 << 16)
				  + i_287_ - 1) / i_287_;
		    i_274_ += i_289_;
		    i_282_
			+= (i_289_ * i_287_
			    - (((Class151_Sub1_Sub2) this).anInt8819 << 16));
		}
		if (((Class151_Sub1_Sub2) this).anInt8803 < i_284_)
		    i_275_ = ((((Class151_Sub1_Sub2) this).anInt8803 << 16)
			      - i_281_ + i_286_ - 1) / i_286_;
		if (((Class151_Sub1_Sub2) this).anInt8804 < i_285_)
		    i_276_ = ((((Class151_Sub1_Sub2) this).anInt8804 << 16)
			      - i_282_ + i_287_ - 1) / i_287_;
		int i_290_ = i + i_274_ * i_283_;
		int i_291_ = i_283_ - i_275_;
		if (i_274_ + i_276_
		    > (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					 .aClass173_Sub3_8814)).anInt9726
		       * 6965409))
		    i_276_ -= (i_274_ + i_276_
			       - (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						    .aClass173_Sub3_8814))
				  .anInt9726) * 6965409);
		if (i_274_ < (((Class173_Sub3)
			       ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
			      .anInt9725) * 592117349) {
		    int i_292_ = (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						    .aClass173_Sub3_8814))
				  .anInt9725) * 592117349 - i_274_;
		    i_276_ -= i_292_;
		    i_290_ += i_292_ * i_283_;
		    i_282_ += i_287_ * i_292_;
		}
		if (i + i_275_ > (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						    .aClass173_Sub3_8814))
				  .anInt9724) * 630968029) {
		    int i_293_
			= (i + i_275_
			   - (((Class173_Sub3)
			       ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
			      .anInt9724) * 630968029);
		    i_275_ -= i_293_;
		    i_291_ += i_293_;
		}
		if (i < (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					   .aClass173_Sub3_8814)).anInt9723
			 * -993497119)) {
		    int i_294_ = (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						    .aClass173_Sub3_8814))
				  .anInt9723) * -993497119 - i;
		    i_275_ -= i_294_;
		    i_290_ += i_294_;
		    i_281_ += i_286_ * i_294_;
		    i_291_ += i_294_;
		}
		if (i_279_ == 0) {
		    if (i_277_ == 1) {
			int i_295_ = i_281_;
			for (int i_296_ = -i_276_; i_296_ < 0; i_296_++) {
			    int i_297_
				= ((i_282_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_298_ = -i_275_; i_298_ < 0; i_298_++) {
				is[i_290_++] = (((Class151_Sub1_Sub2) this)
						.anIntArray11308
						[(i_281_ >> 16) + i_297_]);
				i_281_ += i_286_;
			    }
			    i_282_ += i_287_;
			    i_281_ = i_295_;
			    i_290_ += i_291_;
			}
		    } else if (i_277_ == 0) {
			int i_299_ = (i_278_ & 0xff0000) >> 16;
			int i_300_ = (i_278_ & 0xff00) >> 8;
			int i_301_ = i_278_ & 0xff;
			int i_302_ = i_281_;
			for (int i_303_ = -i_276_; i_303_ < 0; i_303_++) {
			    int i_304_
				= ((i_282_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_305_ = -i_275_; i_305_ < 0; i_305_++) {
				int i_306_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308
					      [(i_281_ >> 16) + i_304_]);
				int i_307_
				    = (i_306_ & 0xff0000) * i_299_ & ~0xffffff;
				int i_308_
				    = (i_306_ & 0xff00) * i_300_ & 0xff0000;
				int i_309_ = (i_306_ & 0xff) * i_301_ & 0xff00;
				is[i_290_++]
				    = (i_307_ | i_308_ | i_309_) >>> 8;
				i_281_ += i_286_;
			    }
			    i_282_ += i_287_;
			    i_281_ = i_302_;
			    i_290_ += i_291_;
			}
		    } else if (i_277_ == 3) {
			int i_310_ = i_281_;
			for (int i_311_ = -i_276_; i_311_ < 0; i_311_++) {
			    int i_312_
				= ((i_282_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_313_ = -i_275_; i_313_ < 0; i_313_++) {
				int i_314_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308
					      [(i_281_ >> 16) + i_312_]);
				int i_315_ = i_314_ + i_278_;
				int i_316_ = ((i_314_ & 0xff00ff)
					      + (i_278_ & 0xff00ff));
				int i_317_ = ((i_316_ & 0x1000100)
					      + (i_315_ - i_316_ & 0x10000));
				is[i_290_++]
				    = i_315_ - i_317_ | i_317_ - (i_317_
								  >>> 8);
				i_281_ += i_286_;
			    }
			    i_282_ += i_287_;
			    i_281_ = i_310_;
			    i_290_ += i_291_;
			}
		    } else if (i_277_ == 2) {
			int i_318_ = i_278_ >>> 24;
			int i_319_ = 256 - i_318_;
			int i_320_ = (i_278_ & 0xff00ff) * i_319_ & ~0xff00ff;
			int i_321_ = (i_278_ & 0xff00) * i_319_ & 0xff0000;
			i_278_ = (i_320_ | i_321_) >>> 8;
			int i_322_ = i_281_;
			for (int i_323_ = -i_276_; i_323_ < 0; i_323_++) {
			    int i_324_
				= ((i_282_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_325_ = -i_275_; i_325_ < 0; i_325_++) {
				int i_326_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308
					      [(i_281_ >> 16) + i_324_]);
				i_320_
				    = (i_326_ & 0xff00ff) * i_318_ & ~0xff00ff;
				i_321_ = (i_326_ & 0xff00) * i_318_ & 0xff0000;
				is[i_290_++]
				    = ((i_320_ | i_321_) >>> 8) + i_278_;
				i_281_ += i_286_;
			    }
			    i_282_ += i_287_;
			    i_281_ = i_322_;
			    i_290_ += i_291_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_279_ == 1) {
		    if (i_277_ == 1) {
			int i_327_ = i_281_;
			for (int i_328_ = -i_276_; i_328_ < 0; i_328_++) {
			    int i_329_
				= ((i_282_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_330_ = -i_275_; i_330_ < 0; i_330_++) {
				int i_331_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308
					      [(i_281_ >> 16) + i_329_]);
				if (i_331_ != 0)
				    is[i_290_++] = i_331_;
				else
				    i_290_++;
				i_281_ += i_286_;
			    }
			    i_282_ += i_287_;
			    i_281_ = i_327_;
			    i_290_ += i_291_;
			}
		    } else if (i_277_ == 0) {
			int i_332_ = i_281_;
			if ((i_278_ & 0xffffff) == 16777215) {
			    int i_333_ = i_278_ >>> 24;
			    int i_334_ = 256 - i_333_;
			    for (int i_335_ = -i_276_; i_335_ < 0; i_335_++) {
				int i_336_ = ((i_282_ >> 16)
					      * (((Class151_Sub1_Sub2) this)
						 .anInt8803));
				for (int i_337_ = -i_275_; i_337_ < 0;
				     i_337_++) {
				    int i_338_ = (((Class151_Sub1_Sub2) this)
						  .anIntArray11308
						  [(i_281_ >> 16) + i_336_]);
				    if (i_338_ != 0) {
					int i_339_ = is[i_290_];
					is[i_290_++]
					    = ((((i_338_ & 0xff00ff) * i_333_
						 + ((i_339_ & 0xff00ff)
						    * i_334_))
						& ~0xff00ff)
					       + (((i_338_ & 0xff00) * i_333_
						   + ((i_339_ & 0xff00)
						      * i_334_))
						  & 0xff0000)) >> 8;
				    } else
					i_290_++;
				    i_281_ += i_286_;
				}
				i_282_ += i_287_;
				i_281_ = i_332_;
				i_290_ += i_291_;
			    }
			} else {
			    int i_340_ = (i_278_ & 0xff0000) >> 16;
			    int i_341_ = (i_278_ & 0xff00) >> 8;
			    int i_342_ = i_278_ & 0xff;
			    int i_343_ = i_278_ >>> 24;
			    int i_344_ = 256 - i_343_;
			    for (int i_345_ = -i_276_; i_345_ < 0; i_345_++) {
				int i_346_ = ((i_282_ >> 16)
					      * (((Class151_Sub1_Sub2) this)
						 .anInt8803));
				for (int i_347_ = -i_275_; i_347_ < 0;
				     i_347_++) {
				    int i_348_ = (((Class151_Sub1_Sub2) this)
						  .anIntArray11308
						  [(i_281_ >> 16) + i_346_]);
				    if (i_348_ != 0) {
					if (i_343_ != 255) {
					    int i_349_
						= ((i_348_ & 0xff0000) * i_340_
						   & ~0xffffff);
					    int i_350_
						= ((i_348_ & 0xff00) * i_341_
						   & 0xff0000);
					    int i_351_
						= ((i_348_ & 0xff) * i_342_
						   & 0xff00);
					    i_348_ = (i_349_ | i_350_
						      | i_351_) >>> 8;
					    int i_352_ = is[i_290_];
					    is[i_290_++]
						= (((((i_348_ & 0xff00ff)
						      * i_343_)
						     + ((i_352_ & 0xff00ff)
							* i_344_))
						    & ~0xff00ff)
						   + ((((i_348_ & 0xff00)
							* i_343_)
						       + ((i_352_ & 0xff00)
							  * i_344_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_353_
						= ((i_348_ & 0xff0000) * i_340_
						   & ~0xffffff);
					    int i_354_
						= ((i_348_ & 0xff00) * i_341_
						   & 0xff0000);
					    int i_355_
						= ((i_348_ & 0xff) * i_342_
						   & 0xff00);
					    is[i_290_++] = (i_353_ | i_354_
							    | i_355_) >>> 8;
					}
				    } else
					i_290_++;
				    i_281_ += i_286_;
				}
				i_282_ += i_287_;
				i_281_ = i_332_;
				i_290_ += i_291_;
			    }
			}
		    } else if (i_277_ == 3) {
			int i_356_ = i_281_;
			int i_357_ = i_278_ >>> 24;
			int i_358_ = 256 - i_357_;
			for (int i_359_ = -i_276_; i_359_ < 0; i_359_++) {
			    int i_360_
				= ((i_282_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_361_ = -i_275_; i_361_ < 0; i_361_++) {
				int i_362_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308
					      [(i_281_ >> 16) + i_360_]);
				int i_363_ = i_362_ + i_278_;
				int i_364_ = ((i_362_ & 0xff00ff)
					      + (i_278_ & 0xff00ff));
				int i_365_ = ((i_364_ & 0x1000100)
					      + (i_363_ - i_364_ & 0x10000));
				i_365_ = i_363_ - i_365_ | i_365_ - (i_365_
								     >>> 8);
				if (i_362_ == 0 && i_357_ != 255) {
				    i_362_ = i_365_;
				    i_365_ = is[i_290_];
				    i_365_ = ((((i_362_ & 0xff00ff) * i_357_
						+ (i_365_ & 0xff00ff) * i_358_)
					       & ~0xff00ff)
					      + (((i_362_ & 0xff00) * i_357_
						  + (i_365_ & 0xff00) * i_358_)
						 & 0xff0000)) >> 8;
				}
				is[i_290_++] = i_365_;
				i_281_ += i_286_;
			    }
			    i_282_ += i_287_;
			    i_281_ = i_356_;
			    i_290_ += i_291_;
			}
		    } else if (i_277_ == 2) {
			int i_366_ = i_278_ >>> 24;
			int i_367_ = 256 - i_366_;
			int i_368_ = (i_278_ & 0xff00ff) * i_367_ & ~0xff00ff;
			int i_369_ = (i_278_ & 0xff00) * i_367_ & 0xff0000;
			i_278_ = (i_368_ | i_369_) >>> 8;
			int i_370_ = i_281_;
			for (int i_371_ = -i_276_; i_371_ < 0; i_371_++) {
			    int i_372_
				= ((i_282_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_373_ = -i_275_; i_373_ < 0; i_373_++) {
				int i_374_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308
					      [(i_281_ >> 16) + i_372_]);
				if (i_374_ != 0) {
				    i_368_ = ((i_374_ & 0xff00ff) * i_366_
					      & ~0xff00ff);
				    i_369_ = ((i_374_ & 0xff00) * i_366_
					      & 0xff0000);
				    is[i_290_++]
					= ((i_368_ | i_369_) >>> 8) + i_278_;
				} else
				    i_290_++;
				i_281_ += i_286_;
			    }
			    i_282_ += i_287_;
			    i_281_ = i_370_;
			    i_290_ += i_291_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_279_ == 2) {
		    if (i_277_ == 1) {
			int i_375_ = i_281_;
			for (int i_376_ = -i_276_; i_376_ < 0; i_376_++) {
			    int i_377_
				= ((i_282_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_378_ = -i_275_; i_378_ < 0; i_378_++) {
				int i_379_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308
					      [(i_281_ >> 16) + i_377_]);
				if (i_379_ != 0) {
				    int i_380_ = is[i_290_];
				    int i_381_ = i_379_ + i_380_;
				    int i_382_ = ((i_379_ & 0xff00ff)
						  + (i_380_ & 0xff00ff));
				    i_380_ = ((i_382_ & 0x1000100)
					      + (i_381_ - i_382_ & 0x10000));
				    is[i_290_++]
					= i_381_ - i_380_ | i_380_ - (i_380_
								      >>> 8);
				} else
				    i_290_++;
				i_281_ += i_286_;
			    }
			    i_282_ += i_287_;
			    i_281_ = i_375_;
			    i_290_ += i_291_;
			}
		    } else if (i_277_ == 0) {
			int i_383_ = i_281_;
			int i_384_ = (i_278_ & 0xff0000) >> 16;
			int i_385_ = (i_278_ & 0xff00) >> 8;
			int i_386_ = i_278_ & 0xff;
			for (int i_387_ = -i_276_; i_387_ < 0; i_387_++) {
			    int i_388_
				= ((i_282_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_389_ = -i_275_; i_389_ < 0; i_389_++) {
				int i_390_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308
					      [(i_281_ >> 16) + i_388_]);
				if (i_390_ != 0) {
				    int i_391_ = ((i_390_ & 0xff0000) * i_384_
						  & ~0xffffff);
				    int i_392_ = ((i_390_ & 0xff00) * i_385_
						  & 0xff0000);
				    int i_393_
					= (i_390_ & 0xff) * i_386_ & 0xff00;
				    i_390_ = (i_391_ | i_392_ | i_393_) >>> 8;
				    int i_394_ = is[i_290_];
				    int i_395_ = i_390_ + i_394_;
				    int i_396_ = ((i_390_ & 0xff00ff)
						  + (i_394_ & 0xff00ff));
				    i_394_ = ((i_396_ & 0x1000100)
					      + (i_395_ - i_396_ & 0x10000));
				    is[i_290_++]
					= i_395_ - i_394_ | i_394_ - (i_394_
								      >>> 8);
				} else
				    i_290_++;
				i_281_ += i_286_;
			    }
			    i_282_ += i_287_;
			    i_281_ = i_383_;
			    i_290_ += i_291_;
			}
		    } else if (i_277_ == 3) {
			int i_397_ = i_281_;
			for (int i_398_ = -i_276_; i_398_ < 0; i_398_++) {
			    int i_399_
				= ((i_282_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_400_ = -i_275_; i_400_ < 0; i_400_++) {
				int i_401_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308
					      [(i_281_ >> 16) + i_399_]);
				int i_402_ = i_401_ + i_278_;
				int i_403_ = ((i_401_ & 0xff00ff)
					      + (i_278_ & 0xff00ff));
				int i_404_ = ((i_403_ & 0x1000100)
					      + (i_402_ - i_403_ & 0x10000));
				i_401_ = i_402_ - i_404_ | i_404_ - (i_404_
								     >>> 8);
				i_404_ = is[i_290_];
				i_402_ = i_401_ + i_404_;
				i_403_ = (i_401_ & 0xff00ff) + (i_404_
								& 0xff00ff);
				i_404_
				    = (i_403_ & 0x1000100) + (i_402_ - i_403_
							      & 0x10000);
				is[i_290_++]
				    = i_402_ - i_404_ | i_404_ - (i_404_
								  >>> 8);
				i_281_ += i_286_;
			    }
			    i_282_ += i_287_;
			    i_281_ = i_397_;
			    i_290_ += i_291_;
			}
		    } else if (i_277_ == 2) {
			int i_405_ = i_278_ >>> 24;
			int i_406_ = 256 - i_405_;
			int i_407_ = (i_278_ & 0xff00ff) * i_406_ & ~0xff00ff;
			int i_408_ = (i_278_ & 0xff00) * i_406_ & 0xff0000;
			i_278_ = (i_407_ | i_408_) >>> 8;
			int i_409_ = i_281_;
			for (int i_410_ = -i_276_; i_410_ < 0; i_410_++) {
			    int i_411_
				= ((i_282_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_412_ = -i_275_; i_412_ < 0; i_412_++) {
				int i_413_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308
					      [(i_281_ >> 16) + i_411_]);
				if (i_413_ != 0) {
				    i_407_ = ((i_413_ & 0xff00ff) * i_405_
					      & ~0xff00ff);
				    i_408_ = ((i_413_ & 0xff00) * i_405_
					      & 0xff0000);
				    i_413_
					= ((i_407_ | i_408_) >>> 8) + i_278_;
				    int i_414_ = is[i_290_];
				    int i_415_ = i_413_ + i_414_;
				    int i_416_ = ((i_413_ & 0xff00ff)
						  + (i_414_ & 0xff00ff));
				    i_414_ = ((i_416_ & 0x1000100)
					      + (i_415_ - i_416_ & 0x10000));
				    is[i_290_++]
					= i_415_ - i_414_ | i_414_ - (i_414_
								      >>> 8);
				} else
				    i_290_++;
				i_281_ += i_286_;
			    }
			    i_282_ += i_287_;
			    i_281_ = i_409_;
			    i_290_ += i_291_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method8291(boolean bool, boolean bool_417_, boolean bool_418_, int i,
		    int i_419_, float f, int i_420_, int i_421_, int i_422_,
		    int i_423_, int i_424_, int i_425_, boolean bool_426_) {
	if (i_420_ > 0 && i_421_ > 0 && (bool || bool_417_)) {
	    int i_427_ = 0;
	    int i_428_ = 0;
	    int i_429_ = (((Class151_Sub1_Sub2) this).anInt8806
			  + ((Class151_Sub1_Sub2) this).anInt8803
			  + ((Class151_Sub1_Sub2) this).anInt8832);
	    int i_430_ = (((Class151_Sub1_Sub2) this).anInt8819
			  + ((Class151_Sub1_Sub2) this).anInt8804
			  + ((Class151_Sub1_Sub2) this).anInt8808);
	    int i_431_ = (i_429_ << 16) / i_420_;
	    int i_432_ = (i_430_ << 16) / i_421_;
	    if (((Class151_Sub1_Sub2) this).anInt8806 > 0) {
		int i_433_ = (((((Class151_Sub1_Sub2) this).anInt8806 << 16)
			       + i_431_ - 1)
			      / i_431_);
		i += i_433_;
		i_427_
		    += i_433_ * i_431_ - (((Class151_Sub1_Sub2) this).anInt8806
					  << 16);
	    }
	    if (((Class151_Sub1_Sub2) this).anInt8819 > 0) {
		int i_434_ = (((((Class151_Sub1_Sub2) this).anInt8819 << 16)
			       + i_432_ - 1)
			      / i_432_);
		i_419_ += i_434_;
		i_428_
		    += i_434_ * i_432_ - (((Class151_Sub1_Sub2) this).anInt8819
					  << 16);
	    }
	    if (((Class151_Sub1_Sub2) this).anInt8803 < i_429_)
		i_420_ = ((((Class151_Sub1_Sub2) this).anInt8803 << 16)
			  - i_427_ + i_431_ - 1) / i_431_;
	    if (((Class151_Sub1_Sub2) this).anInt8804 < i_430_)
		i_421_ = ((((Class151_Sub1_Sub2) this).anInt8804 << 16)
			  - i_428_ + i_432_ - 1) / i_432_;
	    int i_435_
		= i + i_419_ * ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						   .aClass173_Sub3_8814))
				 .anInt9735)
				* 111437289);
	    int i_436_ = ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					     .aClass173_Sub3_8814)).anInt9735
			   * 111437289)
			  - i_420_);
	    if (i_419_ + i_421_
		> ((Class173_Sub3) (((Class151_Sub1_Sub2) this)
				    .aClass173_Sub3_8814)).anInt9726 * 6965409)
		i_421_ -= (i_419_ + i_421_
			   - (((Class173_Sub3)
			       ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
			      .anInt9726) * 6965409);
	    if (i_419_ < (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					    .aClass173_Sub3_8814)).anInt9725
			  * 592117349)) {
		int i_437_ = ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						 .aClass173_Sub3_8814))
			       .anInt9725) * 592117349
			      - i_419_);
		i_421_ -= i_437_;
		i_435_
		    += i_437_ * ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						    .aClass173_Sub3_8814))
				  .anInt9735)
				 * 111437289);
		i_428_ += i_432_ * i_437_;
	    }
	    if (i + i_420_ > (((Class173_Sub3)
			       ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
			      .anInt9724) * 630968029) {
		int i_438_ = (i + i_420_
			      - (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						   .aClass173_Sub3_8814))
				 .anInt9724) * 630968029);
		i_420_ -= i_438_;
		i_436_ += i_438_;
	    }
	    if (i < (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119)) {
		int i_439_ = ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						 .aClass173_Sub3_8814))
			       .anInt9723) * -993497119
			      - i);
		i_420_ -= i_439_;
		i_435_ += i_439_;
		i_427_ += i_431_ * i_439_;
		i_436_ += i_439_;
	    }
	    float[] fs = (((Class173_Sub3)
			   ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
			  .aFloatArray9716);
	    int[] is = (((Class173_Sub3)
			 ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
			.anIntArray9719);
	    if (i_424_ == 0) {
		if (i_422_ == 1) {
		    int i_440_ = i_427_;
		    for (int i_441_ = -i_421_; i_441_ < 0; i_441_++) {
			int i_442_ = ((i_428_ >> 16)
				      * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_443_ = -i_420_; i_443_ < 0; i_443_++) {
			    if (!bool_417_ || f < fs[i_435_]) {
				if (bool)
				    is[i_435_] = (((Class151_Sub1_Sub2) this)
						  .anIntArray11308
						  [(i_427_ >> 16) + i_442_]);
				if (bool_417_ && bool_426_)
				    fs[i_435_] = f;
			    }
			    i_427_ += i_431_;
			    i_435_++;
			}
			i_428_ += i_432_;
			i_427_ = i_440_;
			i_435_ += i_436_;
		    }
		} else if (i_422_ == 0) {
		    int i_444_ = (i_423_ & 0xff0000) >> 16;
		    int i_445_ = (i_423_ & 0xff00) >> 8;
		    int i_446_ = i_423_ & 0xff;
		    int i_447_ = i_427_;
		    for (int i_448_ = -i_421_; i_448_ < 0; i_448_++) {
			int i_449_ = ((i_428_ >> 16)
				      * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_450_ = -i_420_; i_450_ < 0; i_450_++) {
			    if (!bool_417_ || f < fs[i_435_]) {
				if (bool) {
				    int i_451_ = (((Class151_Sub1_Sub2) this)
						  .anIntArray11308
						  [(i_427_ >> 16) + i_449_]);
				    int i_452_ = ((i_451_ & 0xff0000) * i_444_
						  & ~0xffffff);
				    int i_453_ = ((i_451_ & 0xff00) * i_445_
						  & 0xff0000);
				    int i_454_
					= (i_451_ & 0xff) * i_446_ & 0xff00;
				    is[i_435_]
					= (i_452_ | i_453_ | i_454_) >>> 8;
				}
				if (bool_417_ && bool_426_)
				    fs[i_435_] = f;
			    }
			    i_427_ += i_431_;
			    i_435_++;
			}
			i_428_ += i_432_;
			i_427_ = i_447_;
			i_435_ += i_436_;
		    }
		} else if (i_422_ == 3) {
		    int i_455_ = i_427_;
		    for (int i_456_ = -i_421_; i_456_ < 0; i_456_++) {
			int i_457_ = ((i_428_ >> 16)
				      * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_458_ = -i_420_; i_458_ < 0; i_458_++) {
			    if (!bool_417_ || f < fs[i_435_]) {
				if (bool) {
				    int i_459_ = (((Class151_Sub1_Sub2) this)
						  .anIntArray11308
						  [(i_427_ >> 16) + i_457_]);
				    int i_460_ = i_459_ + i_423_;
				    int i_461_ = ((i_459_ & 0xff00ff)
						  + (i_423_ & 0xff00ff));
				    int i_462_
					= ((i_461_ & 0x1000100)
					   + (i_460_ - i_461_ & 0x10000));
				    is[i_435_]
					= i_460_ - i_462_ | i_462_ - (i_462_
								      >>> 8);
				}
				if (bool_417_ && bool_426_)
				    fs[i_435_] = f;
			    }
			    i_427_ += i_431_;
			    i_435_++;
			}
			i_428_ += i_432_;
			i_427_ = i_455_;
			i_435_ += i_436_;
		    }
		} else if (i_422_ == 2) {
		    int i_463_ = i_423_ >>> 24;
		    int i_464_ = 256 - i_463_;
		    int i_465_ = (i_423_ & 0xff00ff) * i_464_ & ~0xff00ff;
		    int i_466_ = (i_423_ & 0xff00) * i_464_ & 0xff0000;
		    i_423_ = (i_465_ | i_466_) >>> 8;
		    int i_467_ = i_427_;
		    for (int i_468_ = -i_421_; i_468_ < 0; i_468_++) {
			int i_469_ = ((i_428_ >> 16)
				      * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_470_ = -i_420_; i_470_ < 0; i_470_++) {
			    if (!bool_417_ || f < fs[i_435_]) {
				if (bool) {
				    int i_471_ = (((Class151_Sub1_Sub2) this)
						  .anIntArray11308
						  [(i_427_ >> 16) + i_469_]);
				    i_465_ = ((i_471_ & 0xff00ff) * i_463_
					      & ~0xff00ff);
				    i_466_ = ((i_471_ & 0xff00) * i_463_
					      & 0xff0000);
				    is[i_435_]
					= ((i_465_ | i_466_) >>> 8) + i_423_;
				}
				if (bool_417_ && bool_426_)
				    fs[i_435_] = f;
			    }
			    i_427_ += i_431_;
			    i_435_++;
			}
			i_428_ += i_432_;
			i_427_ = i_467_;
			i_435_ += i_436_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_424_ == 1) {
		if (i_422_ == 1) {
		    int i_472_ = i_427_;
		    for (int i_473_ = -i_421_; i_473_ < 0; i_473_++) {
			int i_474_ = ((i_428_ >> 16)
				      * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_475_ = -i_420_; i_475_ < 0; i_475_++) {
			    if (!bool_417_ || f < fs[i_435_]) {
				int i_476_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308
					      [(i_427_ >> 16) + i_474_]);
				if (i_476_ != 0) {
				    if (bool)
					is[i_435_] = i_476_;
				    if (bool_417_ && bool_426_)
					fs[i_435_] = f;
				}
			    }
			    i_427_ += i_431_;
			    i_435_++;
			}
			i_428_ += i_432_;
			i_427_ = i_472_;
			i_435_ += i_436_;
		    }
		} else if (i_422_ == 0) {
		    int i_477_ = i_427_;
		    if ((i_423_ & 0xffffff) == 16777215) {
			int i_478_ = i_423_ >>> 24;
			int i_479_ = 256 - i_478_;
			for (int i_480_ = -i_421_; i_480_ < 0; i_480_++) {
			    int i_481_
				= ((i_428_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_482_ = -i_420_; i_482_ < 0; i_482_++) {
				if (!bool_417_ || f < fs[i_435_]) {
				    int i_483_ = (((Class151_Sub1_Sub2) this)
						  .anIntArray11308
						  [(i_427_ >> 16) + i_481_]);
				    if (i_483_ != 0) {
					if (bool) {
					    int i_484_ = is[i_435_];
					    is[i_435_]
						= (((((i_483_ & 0xff00ff)
						      * i_478_)
						     + ((i_484_ & 0xff00ff)
							* i_479_))
						    & ~0xff00ff)
						   + ((((i_483_ & 0xff00)
							* i_478_)
						       + ((i_484_ & 0xff00)
							  * i_479_))
						      & 0xff0000)) >> 8;
					}
					if (bool_417_ && bool_426_)
					    fs[i_435_] = f;
				    }
				}
				i_427_ += i_431_;
				i_435_++;
			    }
			    i_428_ += i_432_;
			    i_427_ = i_477_;
			    i_435_ += i_436_;
			}
		    } else {
			int i_485_ = (i_423_ & 0xff0000) >> 16;
			int i_486_ = (i_423_ & 0xff00) >> 8;
			int i_487_ = i_423_ & 0xff;
			int i_488_ = i_423_ >>> 24;
			int i_489_ = 256 - i_488_;
			for (int i_490_ = -i_421_; i_490_ < 0; i_490_++) {
			    int i_491_
				= ((i_428_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_492_ = -i_420_; i_492_ < 0; i_492_++) {
				if (!bool_417_ || f < fs[i_435_]) {
				    int i_493_ = (((Class151_Sub1_Sub2) this)
						  .anIntArray11308
						  [(i_427_ >> 16) + i_491_]);
				    if (i_493_ != 0) {
					if (i_488_ != 255) {
					    if (bool) {
						int i_494_
						    = (((i_493_ & 0xff0000)
							* i_485_)
						       & ~0xffffff);
						int i_495_
						    = (((i_493_ & 0xff00)
							* i_486_)
						       & 0xff0000);
						int i_496_
						    = ((i_493_ & 0xff) * i_487_
						       & 0xff00);
						i_493_ = (i_494_ | i_495_
							  | i_496_) >>> 8;
						int i_497_ = is[i_435_];
						is[i_435_]
						    = (((((i_493_ & 0xff00ff)
							  * i_488_)
							 + ((i_497_ & 0xff00ff)
							    * i_489_))
							& ~0xff00ff)
						       + ((((i_493_ & 0xff00)
							    * i_488_)
							   + ((i_497_ & 0xff00)
							      * i_489_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_417_ && bool_426_)
						fs[i_435_] = f;
					} else {
					    if (bool) {
						int i_498_
						    = (((i_493_ & 0xff0000)
							* i_485_)
						       & ~0xffffff);
						int i_499_
						    = (((i_493_ & 0xff00)
							* i_486_)
						       & 0xff0000);
						int i_500_
						    = ((i_493_ & 0xff) * i_487_
						       & 0xff00);
						is[i_435_] = (i_498_ | i_499_
							      | i_500_) >>> 8;
					    }
					    if (bool_417_ && bool_426_)
						fs[i_435_] = f;
					}
				    }
				}
				i_427_ += i_431_;
				i_435_++;
			    }
			    i_428_ += i_432_;
			    i_427_ = i_477_;
			    i_435_ += i_436_;
			}
		    }
		} else if (i_422_ == 3) {
		    int i_501_ = i_427_;
		    int i_502_ = i_423_ >>> 24;
		    int i_503_ = 256 - i_502_;
		    for (int i_504_ = -i_421_; i_504_ < 0; i_504_++) {
			int i_505_ = ((i_428_ >> 16)
				      * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_506_ = -i_420_; i_506_ < 0; i_506_++) {
			    if (!bool_417_ || f < fs[i_435_]) {
				if (bool) {
				    int i_507_ = (((Class151_Sub1_Sub2) this)
						  .anIntArray11308
						  [(i_427_ >> 16) + i_505_]);
				    int i_508_ = i_507_ + i_423_;
				    int i_509_ = ((i_507_ & 0xff00ff)
						  + (i_423_ & 0xff00ff));
				    int i_510_
					= ((i_509_ & 0x1000100)
					   + (i_508_ - i_509_ & 0x10000));
				    i_510_
					= i_508_ - i_510_ | i_510_ - (i_510_
								      >>> 8);
				    if (i_507_ == 0 && i_502_ != 255) {
					i_507_ = i_510_;
					i_510_ = is[i_435_];
					i_510_
					    = ((((i_507_ & 0xff00ff) * i_502_
						 + ((i_510_ & 0xff00ff)
						    * i_503_))
						& ~0xff00ff)
					       + (((i_507_ & 0xff00) * i_502_
						   + ((i_510_ & 0xff00)
						      * i_503_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_435_] = i_510_;
				}
				if (bool_417_ && bool_426_)
				    fs[i_435_] = f;
			    }
			    i_427_ += i_431_;
			    i_435_++;
			}
			i_428_ += i_432_;
			i_427_ = i_501_;
			i_435_ += i_436_;
		    }
		} else if (i_422_ == 2) {
		    int i_511_ = i_423_ >>> 24;
		    int i_512_ = 256 - i_511_;
		    int i_513_ = (i_423_ & 0xff00ff) * i_512_ & ~0xff00ff;
		    int i_514_ = (i_423_ & 0xff00) * i_512_ & 0xff0000;
		    i_423_ = (i_513_ | i_514_) >>> 8;
		    int i_515_ = i_427_;
		    for (int i_516_ = -i_421_; i_516_ < 0; i_516_++) {
			int i_517_ = ((i_428_ >> 16)
				      * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_518_ = -i_420_; i_518_ < 0; i_518_++) {
			    if (!bool_417_ || f < fs[i_435_]) {
				int i_519_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308
					      [(i_427_ >> 16) + i_517_]);
				if (i_519_ != 0) {
				    if (bool) {
					i_513_ = ((i_519_ & 0xff00ff) * i_511_
						  & ~0xff00ff);
					i_514_ = ((i_519_ & 0xff00) * i_511_
						  & 0xff0000);
					is[i_435_] = (((i_513_ | i_514_) >>> 8)
						      + i_423_);
				    }
				    if (bool_417_ && bool_426_)
					fs[i_435_] = f;
				}
			    }
			    i_427_ += i_431_;
			    i_435_++;
			}
			i_428_ += i_432_;
			i_427_ = i_515_;
			i_435_ += i_436_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_424_ == 2) {
		if (i_422_ == 1) {
		    int i_520_ = i_427_;
		    for (int i_521_ = -i_421_; i_521_ < 0; i_521_++) {
			int i_522_ = ((i_428_ >> 16)
				      * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_523_ = -i_420_; i_523_ < 0; i_523_++) {
			    if (!bool_417_ || f < fs[i_435_]) {
				int i_524_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308
					      [(i_427_ >> 16) + i_522_]);
				if (i_524_ != 0) {
				    if (bool) {
					int i_525_ = is[i_435_];
					int i_526_ = i_524_ + i_525_;
					int i_527_ = ((i_524_ & 0xff00ff)
						      + (i_525_ & 0xff00ff));
					i_525_
					    = ((i_527_ & 0x1000100)
					       + (i_526_ - i_527_ & 0x10000));
					is[i_435_]
					    = (i_526_ - i_525_
					       | i_525_ - (i_525_ >>> 8));
				    }
				    if (bool_417_ && bool_426_)
					fs[i_435_] = f;
				}
			    }
			    i_427_ += i_431_;
			    i_435_++;
			}
			i_428_ += i_432_;
			i_427_ = i_520_;
			i_435_ += i_436_;
		    }
		} else if (i_422_ == 0) {
		    int i_528_ = i_427_;
		    int i_529_ = (i_423_ & 0xff0000) >> 16;
		    int i_530_ = (i_423_ & 0xff00) >> 8;
		    int i_531_ = i_423_ & 0xff;
		    for (int i_532_ = -i_421_; i_532_ < 0; i_532_++) {
			int i_533_ = ((i_428_ >> 16)
				      * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_534_ = -i_420_; i_534_ < 0; i_534_++) {
			    if (!bool_417_ || f < fs[i_435_]) {
				int i_535_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308
					      [(i_427_ >> 16) + i_533_]);
				if (i_535_ != 0) {
				    if (bool) {
					int i_536_
					    = ((i_535_ & 0xff0000) * i_529_
					       & ~0xffffff);
					int i_537_
					    = ((i_535_ & 0xff00) * i_530_
					       & 0xff0000);
					int i_538_ = ((i_535_ & 0xff) * i_531_
						      & 0xff00);
					i_535_
					    = (i_536_ | i_537_ | i_538_) >>> 8;
					int i_539_ = is[i_435_];
					int i_540_ = i_535_ + i_539_;
					int i_541_ = ((i_535_ & 0xff00ff)
						      + (i_539_ & 0xff00ff));
					i_539_
					    = ((i_541_ & 0x1000100)
					       + (i_540_ - i_541_ & 0x10000));
					is[i_435_]
					    = (i_540_ - i_539_
					       | i_539_ - (i_539_ >>> 8));
				    }
				    if (bool_417_ && bool_426_)
					fs[i_435_] = f;
				}
			    }
			    i_427_ += i_431_;
			    i_435_++;
			}
			i_428_ += i_432_;
			i_427_ = i_528_;
			i_435_ += i_436_;
		    }
		} else if (i_422_ == 3) {
		    int i_542_ = i_427_;
		    for (int i_543_ = -i_421_; i_543_ < 0; i_543_++) {
			int i_544_ = ((i_428_ >> 16)
				      * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_545_ = -i_420_; i_545_ < 0; i_545_++) {
			    if (!bool_417_ || f < fs[i_435_]) {
				if (bool) {
				    int i_546_ = (((Class151_Sub1_Sub2) this)
						  .anIntArray11308
						  [(i_427_ >> 16) + i_544_]);
				    int i_547_ = i_546_ + i_423_;
				    int i_548_ = ((i_546_ & 0xff00ff)
						  + (i_423_ & 0xff00ff));
				    int i_549_
					= ((i_548_ & 0x1000100)
					   + (i_547_ - i_548_ & 0x10000));
				    i_546_
					= i_547_ - i_549_ | i_549_ - (i_549_
								      >>> 8);
				    i_549_ = is[i_435_];
				    i_547_ = i_546_ + i_549_;
				    i_548_
					= (i_546_ & 0xff00ff) + (i_549_
								 & 0xff00ff);
				    i_549_ = ((i_548_ & 0x1000100)
					      + (i_547_ - i_548_ & 0x10000));
				    is[i_435_]
					= i_547_ - i_549_ | i_549_ - (i_549_
								      >>> 8);
				}
				if (bool_417_ && bool_426_)
				    fs[i_435_] = f;
			    }
			    i_427_ += i_431_;
			    i_435_++;
			}
			i_428_ += i_432_;
			i_427_ = i_542_;
			i_435_ += i_436_;
		    }
		} else if (i_422_ == 2) {
		    int i_550_ = i_423_ >>> 24;
		    int i_551_ = 256 - i_550_;
		    int i_552_ = (i_423_ & 0xff00ff) * i_551_ & ~0xff00ff;
		    int i_553_ = (i_423_ & 0xff00) * i_551_ & 0xff0000;
		    i_423_ = (i_552_ | i_553_) >>> 8;
		    int i_554_ = i_427_;
		    for (int i_555_ = -i_421_; i_555_ < 0; i_555_++) {
			int i_556_ = ((i_428_ >> 16)
				      * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_557_ = -i_420_; i_557_ < 0; i_557_++) {
			    if (!bool_417_ || f < fs[i_435_]) {
				int i_558_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308
					      [(i_427_ >> 16) + i_556_]);
				if (i_558_ != 0) {
				    if (bool) {
					i_552_ = ((i_558_ & 0xff00ff) * i_550_
						  & ~0xff00ff);
					i_553_ = ((i_558_ & 0xff00) * i_550_
						  & 0xff0000);
					i_558_ = (((i_552_ | i_553_) >>> 8)
						  + i_423_);
					int i_559_ = is[i_435_];
					int i_560_ = i_558_ + i_559_;
					int i_561_ = ((i_558_ & 0xff00ff)
						      + (i_559_ & 0xff00ff));
					i_559_
					    = ((i_561_ & 0x1000100)
					       + (i_560_ - i_561_ & 0x10000));
					is[i_435_]
					    = (i_560_ - i_559_
					       | i_559_ - (i_559_ >>> 8));
				    }
				    if (bool_417_ && bool_426_)
					fs[i_435_] = f;
				}
			    }
			    i_427_ += i_431_;
			    i_435_++;
			}
			i_428_ += i_432_;
			i_427_ = i_554_;
			i_435_ += i_436_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public Interface19 method1769() {
	return new Class106(((Class151_Sub1_Sub2) this).anInt8803,
			    ((Class151_Sub1_Sub2) this).anInt8804,
			    ((Class151_Sub1_Sub2) this).anIntArray11308);
    }
    
    void method8293(int[] is, int[] is_562_, int i, int i_563_) {
	int[] is_564_ = (((Class173_Sub3)
			  ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
			 .anIntArray9719);
	if (is_564_ != null) {
	    if (anInt8822 == 0) {
		if (anInt8825 == 0) {
		    int i_565_ = anInt8816;
		    while (i_565_ < 0) {
			int i_566_ = i_565_ + i_563_;
			if (i_566_ >= 0) {
			    if (i_566_ >= is.length)
				break;
			    int i_567_ = anInt8818;
			    int i_568_ = anInt8807;
			    int i_569_ = anInt8826;
			    int i_570_ = anInt8809;
			    if (i_568_ >= 0 && i_569_ >= 0
				&& (i_568_
				    - (((Class151_Sub1_Sub2) this).anInt8803
				       << 12)) < 0
				&& (i_569_
				    - (((Class151_Sub1_Sub2) this).anInt8804
				       << 12)) < 0) {
				int i_571_ = is[i_566_] - i;
				int i_572_ = -is_562_[i_566_];
				int i_573_ = i_571_ - (i_567_ - anInt8818);
				if (i_573_ > 0) {
				    i_567_ += i_573_;
				    i_570_ += i_573_;
				    i_568_ += anInt8822 * i_573_;
				    i_569_ += anInt8825 * i_573_;
				} else
				    i_572_ -= i_573_;
				if (i_570_ < i_572_)
				    i_570_ = i_572_;
				for (/**/; i_570_ < 0; i_570_++) {
				    int i_574_
					= (((Class151_Sub1_Sub2) this)
					   .anIntArray11308
					   [(((i_569_ >> 12)
					      * (((Class151_Sub1_Sub2) this)
						 .anInt8803))
					     + (i_568_ >> 12))]);
				    if (i_574_ != 0)
					is_564_[i_567_++] = i_574_;
				    else
					i_567_++;
				}
			    }
			}
			i_565_++;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_575_ = anInt8816;
		    while (i_575_ < 0) {
			int i_576_ = i_575_ + i_563_;
			if (i_576_ >= 0) {
			    if (i_576_ >= is.length)
				break;
			    int i_577_ = anInt8818;
			    int i_578_ = anInt8807;
			    int i_579_ = anInt8826 + anInt8828;
			    int i_580_ = anInt8809;
			    if (i_578_ >= 0
				&& (i_578_
				    - (((Class151_Sub1_Sub2) this).anInt8803
				       << 12)) < 0) {
				int i_581_;
				if ((i_581_
				     = i_579_ - ((((Class151_Sub1_Sub2) this)
						  .anInt8804)
						 << 12))
				    >= 0) {
				    i_581_ = (anInt8825 - i_581_) / anInt8825;
				    i_580_ += i_581_;
				    i_579_ += anInt8825 * i_581_;
				    i_577_ += i_581_;
				}
				if ((i_581_ = (i_579_ - anInt8825) / anInt8825)
				    > i_580_)
				    i_580_ = i_581_;
				int i_582_ = is[i_576_] - i;
				int i_583_ = -is_562_[i_576_];
				int i_584_ = i_582_ - (i_577_ - anInt8818);
				if (i_584_ > 0) {
				    i_577_ += i_584_;
				    i_580_ += i_584_;
				    i_578_ += anInt8822 * i_584_;
				    i_579_ += anInt8825 * i_584_;
				} else
				    i_583_ -= i_584_;
				if (i_580_ < i_583_)
				    i_580_ = i_583_;
				for (/**/; i_580_ < 0; i_580_++) {
				    int i_585_
					= (((Class151_Sub1_Sub2) this)
					   .anIntArray11308
					   [(((i_579_ >> 12)
					      * (((Class151_Sub1_Sub2) this)
						 .anInt8803))
					     + (i_578_ >> 12))]);
				    if (i_585_ != 0)
					is_564_[i_577_++] = i_585_;
				    else
					i_577_++;
				    i_579_ += anInt8825;
				}
			    }
			}
			i_575_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_586_ = anInt8816;
		    while (i_586_ < 0) {
			int i_587_ = i_586_ + i_563_;
			if (i_587_ >= 0) {
			    if (i_587_ >= is.length)
				break;
			    int i_588_ = anInt8818;
			    int i_589_ = anInt8807;
			    int i_590_ = anInt8826 + anInt8828;
			    int i_591_ = anInt8809;
			    if (i_589_ >= 0
				&& (i_589_
				    - (((Class151_Sub1_Sub2) this).anInt8803
				       << 12)) < 0) {
				if (i_590_ < 0) {
				    int i_592_
					= (anInt8825 - 1 - i_590_) / anInt8825;
				    i_591_ += i_592_;
				    i_590_ += anInt8825 * i_592_;
				    i_588_ += i_592_;
				}
				int i_593_;
				if ((i_593_ = (1 + i_590_
					       - ((((Class151_Sub1_Sub2) this)
						   .anInt8804)
						  << 12)
					       - anInt8825) / anInt8825)
				    > i_591_)
				    i_591_ = i_593_;
				int i_594_ = is[i_587_] - i;
				int i_595_ = -is_562_[i_587_];
				int i_596_ = i_594_ - (i_588_ - anInt8818);
				if (i_596_ > 0) {
				    i_588_ += i_596_;
				    i_591_ += i_596_;
				    i_589_ += anInt8822 * i_596_;
				    i_590_ += anInt8825 * i_596_;
				} else
				    i_595_ -= i_596_;
				if (i_591_ < i_595_)
				    i_591_ = i_595_;
				for (/**/; i_591_ < 0; i_591_++) {
				    int i_597_
					= (((Class151_Sub1_Sub2) this)
					   .anIntArray11308
					   [(((i_590_ >> 12)
					      * (((Class151_Sub1_Sub2) this)
						 .anInt8803))
					     + (i_589_ >> 12))]);
				    if (i_597_ != 0)
					is_564_[i_588_++] = i_597_;
				    else
					i_588_++;
				    i_590_ += anInt8825;
				}
			    }
			}
			i_586_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8822 < 0) {
		if (anInt8825 == 0) {
		    int i_598_ = anInt8816;
		    while (i_598_ < 0) {
			int i_599_ = i_598_ + i_563_;
			if (i_599_ >= 0) {
			    if (i_599_ >= is.length)
				break;
			    int i_600_ = anInt8818;
			    int i_601_ = anInt8807 + anInt8805;
			    int i_602_ = anInt8826;
			    int i_603_ = anInt8809;
			    if (i_602_ >= 0
				&& (i_602_
				    - (((Class151_Sub1_Sub2) this).anInt8804
				       << 12)) < 0) {
				int i_604_;
				if ((i_604_
				     = i_601_ - ((((Class151_Sub1_Sub2) this)
						  .anInt8803)
						 << 12))
				    >= 0) {
				    i_604_ = (anInt8822 - i_604_) / anInt8822;
				    i_603_ += i_604_;
				    i_601_ += anInt8822 * i_604_;
				    i_600_ += i_604_;
				}
				if ((i_604_ = (i_601_ - anInt8822) / anInt8822)
				    > i_603_)
				    i_603_ = i_604_;
				int i_605_ = is[i_599_] - i;
				int i_606_ = -is_562_[i_599_];
				int i_607_ = i_605_ - (i_600_ - anInt8818);
				if (i_607_ > 0) {
				    i_600_ += i_607_;
				    i_603_ += i_607_;
				    i_601_ += anInt8822 * i_607_;
				    i_602_ += anInt8825 * i_607_;
				} else
				    i_606_ -= i_607_;
				if (i_603_ < i_606_)
				    i_603_ = i_606_;
				for (/**/; i_603_ < 0; i_603_++) {
				    int i_608_
					= (((Class151_Sub1_Sub2) this)
					   .anIntArray11308
					   [(((i_602_ >> 12)
					      * (((Class151_Sub1_Sub2) this)
						 .anInt8803))
					     + (i_601_ >> 12))]);
				    if (i_608_ != 0)
					is_564_[i_600_++] = i_608_;
				    else
					i_600_++;
				    i_601_ += anInt8822;
				}
			    }
			}
			i_598_++;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_609_ = anInt8816;
		    while (i_609_ < 0) {
			int i_610_ = i_609_ + i_563_;
			if (i_610_ >= 0) {
			    if (i_610_ >= is.length)
				break;
			    int i_611_ = anInt8818;
			    int i_612_ = anInt8807 + anInt8805;
			    int i_613_ = anInt8826 + anInt8828;
			    int i_614_ = anInt8809;
			    int i_615_;
			    if ((i_615_
				 = (i_612_
				    - (((Class151_Sub1_Sub2) this).anInt8803
				       << 12)))
				>= 0) {
				i_615_ = (anInt8822 - i_615_) / anInt8822;
				i_614_ += i_615_;
				i_612_ += anInt8822 * i_615_;
				i_613_ += anInt8825 * i_615_;
				i_611_ += i_615_;
			    }
			    if ((i_615_ = (i_612_ - anInt8822) / anInt8822)
				> i_614_)
				i_614_ = i_615_;
			    if ((i_615_
				 = (i_613_
				    - (((Class151_Sub1_Sub2) this).anInt8804
				       << 12)))
				>= 0) {
				i_615_ = (anInt8825 - i_615_) / anInt8825;
				i_614_ += i_615_;
				i_612_ += anInt8822 * i_615_;
				i_613_ += anInt8825 * i_615_;
				i_611_ += i_615_;
			    }
			    if ((i_615_ = (i_613_ - anInt8825) / anInt8825)
				> i_614_)
				i_614_ = i_615_;
			    int i_616_ = is[i_610_] - i;
			    int i_617_ = -is_562_[i_610_];
			    int i_618_ = i_616_ - (i_611_ - anInt8818);
			    if (i_618_ > 0) {
				i_611_ += i_618_;
				i_614_ += i_618_;
				i_612_ += anInt8822 * i_618_;
				i_613_ += anInt8825 * i_618_;
			    } else
				i_617_ -= i_618_;
			    if (i_614_ < i_617_)
				i_614_ = i_617_;
			    for (/**/; i_614_ < 0; i_614_++) {
				int i_619_
				    = (((Class151_Sub1_Sub2) this)
				       .anIntArray11308
				       [((i_613_ >> 12) * ((Class151_Sub1_Sub2)
							   this).anInt8803
					 + (i_612_ >> 12))]);
				if (i_619_ != 0)
				    is_564_[i_611_++] = i_619_;
				else
				    i_611_++;
				i_612_ += anInt8822;
				i_613_ += anInt8825;
			    }
			}
			i_609_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_620_ = anInt8816;
		    while (i_620_ < 0) {
			int i_621_ = i_620_ + i_563_;
			if (i_621_ >= 0) {
			    if (i_621_ >= is.length)
				break;
			    int i_622_ = anInt8818;
			    int i_623_ = anInt8807 + anInt8805;
			    int i_624_ = anInt8826 + anInt8828;
			    int i_625_ = anInt8809;
			    int i_626_;
			    if ((i_626_
				 = (i_623_
				    - (((Class151_Sub1_Sub2) this).anInt8803
				       << 12)))
				>= 0) {
				i_626_ = (anInt8822 - i_626_) / anInt8822;
				i_625_ += i_626_;
				i_623_ += anInt8822 * i_626_;
				i_624_ += anInt8825 * i_626_;
				i_622_ += i_626_;
			    }
			    if ((i_626_ = (i_623_ - anInt8822) / anInt8822)
				> i_625_)
				i_625_ = i_626_;
			    if (i_624_ < 0) {
				i_626_ = (anInt8825 - 1 - i_624_) / anInt8825;
				i_625_ += i_626_;
				i_623_ += anInt8822 * i_626_;
				i_624_ += anInt8825 * i_626_;
				i_622_ += i_626_;
			    }
			    if ((i_626_
				 = (1 + i_624_
				    - (((Class151_Sub1_Sub2) this).anInt8804
				       << 12)
				    - anInt8825) / anInt8825)
				> i_625_)
				i_625_ = i_626_;
			    int i_627_ = is[i_621_] - i;
			    int i_628_ = -is_562_[i_621_];
			    int i_629_ = i_627_ - (i_622_ - anInt8818);
			    if (i_629_ > 0) {
				i_622_ += i_629_;
				i_625_ += i_629_;
				i_623_ += anInt8822 * i_629_;
				i_624_ += anInt8825 * i_629_;
			    } else
				i_628_ -= i_629_;
			    if (i_625_ < i_628_)
				i_625_ = i_628_;
			    for (/**/; i_625_ < 0; i_625_++) {
				int i_630_
				    = (((Class151_Sub1_Sub2) this)
				       .anIntArray11308
				       [((i_624_ >> 12) * ((Class151_Sub1_Sub2)
							   this).anInt8803
					 + (i_623_ >> 12))]);
				if (i_630_ != 0)
				    is_564_[i_622_++] = i_630_;
				else
				    i_622_++;
				i_623_ += anInt8822;
				i_624_ += anInt8825;
			    }
			}
			i_620_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8825 == 0) {
		int i_631_ = anInt8816;
		while (i_631_ < 0) {
		    int i_632_ = i_631_ + i_563_;
		    if (i_632_ >= 0) {
			if (i_632_ >= is.length)
			    break;
			int i_633_ = anInt8818;
			int i_634_ = anInt8807 + anInt8805;
			int i_635_ = anInt8826;
			int i_636_ = anInt8809;
			if (i_635_ >= 0
			    && i_635_ - (((Class151_Sub1_Sub2) this).anInt8804
					 << 12) < 0) {
			    if (i_634_ < 0) {
				int i_637_
				    = (anInt8822 - 1 - i_634_) / anInt8822;
				i_636_ += i_637_;
				i_634_ += anInt8822 * i_637_;
				i_633_ += i_637_;
			    }
			    int i_638_;
			    if ((i_638_
				 = (1 + i_634_
				    - (((Class151_Sub1_Sub2) this).anInt8803
				       << 12)
				    - anInt8822) / anInt8822)
				> i_636_)
				i_636_ = i_638_;
			    int i_639_ = is[i_632_] - i;
			    int i_640_ = -is_562_[i_632_];
			    int i_641_ = i_639_ - (i_633_ - anInt8818);
			    if (i_641_ > 0) {
				i_633_ += i_641_;
				i_636_ += i_641_;
				i_634_ += anInt8822 * i_641_;
				i_635_ += anInt8825 * i_641_;
			    } else
				i_640_ -= i_641_;
			    if (i_636_ < i_640_)
				i_636_ = i_640_;
			    for (/**/; i_636_ < 0; i_636_++) {
				int i_642_
				    = (((Class151_Sub1_Sub2) this)
				       .anIntArray11308
				       [((i_635_ >> 12) * ((Class151_Sub1_Sub2)
							   this).anInt8803
					 + (i_634_ >> 12))]);
				if (i_642_ != 0)
				    is_564_[i_633_++] = i_642_;
				else
				    i_633_++;
				i_634_ += anInt8822;
			    }
			}
		    }
		    i_631_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else if (anInt8825 < 0) {
		int i_643_ = anInt8816;
		while (i_643_ < 0) {
		    int i_644_ = i_643_ + i_563_;
		    if (i_644_ >= 0) {
			if (i_644_ >= is.length)
			    break;
			int i_645_ = anInt8818;
			int i_646_ = anInt8807 + anInt8805;
			int i_647_ = anInt8826 + anInt8828;
			int i_648_ = anInt8809;
			if (i_646_ < 0) {
			    int i_649_ = (anInt8822 - 1 - i_646_) / anInt8822;
			    i_648_ += i_649_;
			    i_646_ += anInt8822 * i_649_;
			    i_647_ += anInt8825 * i_649_;
			    i_645_ += i_649_;
			}
			int i_650_;
			if ((i_650_
			     = (1 + i_646_
				- (((Class151_Sub1_Sub2) this).anInt8803 << 12)
				- anInt8822) / anInt8822)
			    > i_648_)
			    i_648_ = i_650_;
			if ((i_650_
			     = i_647_ - (((Class151_Sub1_Sub2) this).anInt8804
					 << 12))
			    >= 0) {
			    i_650_ = (anInt8825 - i_650_) / anInt8825;
			    i_648_ += i_650_;
			    i_646_ += anInt8822 * i_650_;
			    i_647_ += anInt8825 * i_650_;
			    i_645_ += i_650_;
			}
			if ((i_650_ = (i_647_ - anInt8825) / anInt8825)
			    > i_648_)
			    i_648_ = i_650_;
			int i_651_ = is[i_644_] - i;
			int i_652_ = -is_562_[i_644_];
			int i_653_ = i_651_ - (i_645_ - anInt8818);
			if (i_653_ > 0) {
			    i_645_ += i_653_;
			    i_648_ += i_653_;
			    i_646_ += anInt8822 * i_653_;
			    i_647_ += anInt8825 * i_653_;
			} else
			    i_652_ -= i_653_;
			if (i_648_ < i_652_)
			    i_648_ = i_652_;
			for (/**/; i_648_ < 0; i_648_++) {
			    int i_654_
				= (((Class151_Sub1_Sub2) this).anIntArray11308
				   [(((i_647_ >> 12)
				      * ((Class151_Sub1_Sub2) this).anInt8803)
				     + (i_646_ >> 12))]);
			    if (i_654_ != 0)
				is_564_[i_645_++] = i_654_;
			    else
				i_645_++;
			    i_646_ += anInt8822;
			    i_647_ += anInt8825;
			}
		    }
		    i_643_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else {
		int i_655_ = anInt8816;
		while (i_655_ < 0) {
		    int i_656_ = i_655_ + i_563_;
		    if (i_656_ >= 0) {
			if (i_656_ >= is.length)
			    break;
			int i_657_ = anInt8818;
			int i_658_ = anInt8807 + anInt8805;
			int i_659_ = anInt8826 + anInt8828;
			int i_660_ = anInt8809;
			if (i_658_ < 0) {
			    int i_661_ = (anInt8822 - 1 - i_658_) / anInt8822;
			    i_660_ += i_661_;
			    i_658_ += anInt8822 * i_661_;
			    i_659_ += anInt8825 * i_661_;
			    i_657_ += i_661_;
			}
			int i_662_;
			if ((i_662_
			     = (1 + i_658_
				- (((Class151_Sub1_Sub2) this).anInt8803 << 12)
				- anInt8822) / anInt8822)
			    > i_660_)
			    i_660_ = i_662_;
			if (i_659_ < 0) {
			    i_662_ = (anInt8825 - 1 - i_659_) / anInt8825;
			    i_660_ += i_662_;
			    i_658_ += anInt8822 * i_662_;
			    i_659_ += anInt8825 * i_662_;
			    i_657_ += i_662_;
			}
			if ((i_662_
			     = (1 + i_659_
				- (((Class151_Sub1_Sub2) this).anInt8804 << 12)
				- anInt8825) / anInt8825)
			    > i_660_)
			    i_660_ = i_662_;
			int i_663_ = is[i_656_] - i;
			int i_664_ = -is_562_[i_656_];
			int i_665_ = i_663_ - (i_657_ - anInt8818);
			if (i_665_ > 0) {
			    i_657_ += i_665_;
			    i_660_ += i_665_;
			    i_658_ += anInt8822 * i_665_;
			    i_659_ += anInt8825 * i_665_;
			} else
			    i_664_ -= i_665_;
			if (i_660_ < i_664_)
			    i_660_ = i_664_;
			for (/**/; i_660_ < 0; i_660_++) {
			    int i_666_
				= (((Class151_Sub1_Sub2) this).anIntArray11308
				   [(((i_659_ >> 12)
				      * ((Class151_Sub1_Sub2) this).anInt8803)
				     + (i_658_ >> 12))]);
			    if (i_666_ != 0)
				is_564_[i_657_++] = i_666_;
			    else
				i_657_++;
			    i_658_ += anInt8822;
			    i_659_ += anInt8825;
			}
		    }
		    i_655_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    }
	}
    }
    
    public void method1775(int i, int i_667_, Class148 class148, int i_668_,
			   int i_669_) {
	if (((Class151_Sub1_Sub2) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    i += ((Class151_Sub1_Sub2) this).anInt8806;
	    i_667_ += ((Class151_Sub1_Sub2) this).anInt8819;
	    int i_670_ = 0;
	    int i_671_ = (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					    .aClass173_Sub3_8814)).anInt9735
			  * 111437289);
	    int i_672_ = ((Class151_Sub1_Sub2) this).anInt8803;
	    int i_673_ = ((Class151_Sub1_Sub2) this).anInt8804;
	    int i_674_ = i_671_ - i_672_;
	    int i_675_ = 0;
	    int i_676_ = i + i_667_ * i_671_;
	    if (i_667_ < (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					    .aClass173_Sub3_8814)).anInt9725
			  * 592117349)) {
		int i_677_ = ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						 .aClass173_Sub3_8814))
			       .anInt9725) * 592117349
			      - i_667_);
		i_673_ -= i_677_;
		i_667_ = (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					    .aClass173_Sub3_8814)).anInt9725
			  * 592117349);
		i_670_ += i_677_ * i_672_;
		i_676_ += i_677_ * i_671_;
	    }
	    if (i_667_ + i_673_
		> ((Class173_Sub3) (((Class151_Sub1_Sub2) this)
				    .aClass173_Sub3_8814)).anInt9726 * 6965409)
		i_673_ -= (i_667_ + i_673_
			   - (((Class173_Sub3)
			       ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
			      .anInt9726) * 6965409);
	    if (i < (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119)) {
		int i_678_ = ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						 .aClass173_Sub3_8814))
			       .anInt9723) * -993497119
			      - i);
		i_672_ -= i_678_;
		i = (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119);
		i_670_ += i_678_;
		i_676_ += i_678_;
		i_675_ += i_678_;
		i_674_ += i_678_;
	    }
	    if (i + i_672_ > (((Class173_Sub3)
			       ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
			      .anInt9724) * 630968029) {
		int i_679_ = (i + i_672_
			      - (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						   .aClass173_Sub3_8814))
				 .anInt9724) * 630968029);
		i_672_ -= i_679_;
		i_675_ += i_679_;
		i_674_ += i_679_;
	    }
	    if (i_672_ > 0 && i_673_ > 0) {
		Class148_Sub1 class148_sub1 = (Class148_Sub1) class148;
		int[] is_680_ = ((Class148_Sub1) class148_sub1).anIntArray8789;
		int[] is_681_ = ((Class148_Sub1) class148_sub1).anIntArray8788;
		int i_682_ = i_667_;
		if (i_669_ > i_682_) {
		    i_682_ = i_669_;
		    i_676_ += (i_669_ - i_667_) * i_671_;
		    i_670_ += ((i_669_ - i_667_)
			       * ((Class151_Sub1_Sub2) this).anInt8803);
		}
		int i_683_ = (i_669_ + is_680_.length < i_667_ + i_673_
			      ? i_669_ + is_680_.length : i_667_ + i_673_);
		for (int i_684_ = i_682_; i_684_ < i_683_; i_684_++) {
		    int i_685_ = is_680_[i_684_ - i_669_] + i_668_;
		    int i_686_ = is_681_[i_684_ - i_669_];
		    int i_687_ = i_672_;
		    if (i > i_685_) {
			int i_688_ = i - i_685_;
			if (i_688_ >= i_686_) {
			    i_670_ += i_672_ + i_675_;
			    i_676_ += i_672_ + i_674_;
			    continue;
			}
			i_686_ -= i_688_;
		    } else {
			int i_689_ = i_685_ - i;
			if (i_689_ >= i_672_) {
			    i_670_ += i_672_ + i_675_;
			    i_676_ += i_672_ + i_674_;
			    continue;
			}
			i_670_ += i_689_;
			i_687_ -= i_689_;
			i_676_ += i_689_;
		    }
		    int i_690_ = 0;
		    if (i_687_ < i_686_)
			i_686_ = i_687_;
		    else
			i_690_ = i_687_ - i_686_;
		    for (int i_691_ = -i_686_; i_691_ < 0; i_691_++) {
			int i_692_ = (((Class151_Sub1_Sub2) this)
				      .anIntArray11308[i_670_++]);
			if (i_692_ != 0)
			    is[i_676_++] = i_692_;
			else
			    i_676_++;
		    }
		    i_670_ += i_690_ + i_675_;
		    i_676_ += i_690_ + i_674_;
		}
	    }
	}
    }
    
    public void method1788(int i, int i_693_, int i_694_, int i_695_, int[] is,
			   int i_696_, int i_697_) {
	i_697_ -= i_694_;
	for (int i_698_ = 0; i_698_ < i_695_; i_698_++) {
	    int i_699_ = (i_693_ + i_698_) * i_694_ + i;
	    for (int i_700_ = 0; i_700_ < i_694_; i_700_++)
		((Class151_Sub1_Sub2) this).anIntArray11308[i_699_ + i_700_]
		    = is[i_696_++];
	    i_696_ += i_697_;
	}
    }
    
    public void method1789(int i, int i_701_, int i_702_, int i_703_, int[] is,
			   int i_704_, int i_705_) {
	i_705_ -= i_702_;
	for (int i_706_ = 0; i_706_ < i_703_; i_706_++) {
	    int i_707_ = (i_701_ + i_706_) * i_702_ + i;
	    for (int i_708_ = 0; i_708_ < i_702_; i_708_++)
		((Class151_Sub1_Sub2) this).anIntArray11308[i_707_ + i_708_]
		    = is[i_704_++];
	    i_704_ += i_705_;
	}
    }
    
    public void method1790(int i, int i_709_, int i_710_, int i_711_, int[] is,
			   int i_712_, int i_713_) {
	i_713_ -= i_710_;
	for (int i_714_ = 0; i_714_ < i_711_; i_714_++) {
	    int i_715_ = (i_709_ + i_714_) * i_710_ + i;
	    for (int i_716_ = 0; i_716_ < i_710_; i_716_++)
		((Class151_Sub1_Sub2) this).anIntArray11308[i_715_ + i_716_]
		    = is[i_712_++];
	    i_712_ += i_713_;
	}
    }
    
    public void method1791(int i, int i_717_, int i_718_, int i_719_, int[] is,
			   int i_720_, int i_721_) {
	i_721_ -= i_718_;
	for (int i_722_ = 0; i_722_ < i_719_; i_722_++) {
	    int i_723_ = (i_717_ + i_722_) * i_718_ + i;
	    for (int i_724_ = 0; i_724_ < i_718_; i_724_++)
		((Class151_Sub1_Sub2) this).anIntArray11308[i_723_ + i_724_]
		    = is[i_720_++];
	    i_720_ += i_721_;
	}
    }
    
    public void method1792(int i, int i_725_, int i_726_, int i_727_, int[] is,
			   int i_728_, int i_729_) {
	i_729_ -= i_726_;
	for (int i_730_ = 0; i_730_ < i_727_; i_730_++) {
	    int i_731_ = (i_725_ + i_730_) * i_726_ + i;
	    for (int i_732_ = 0; i_732_ < i_726_; i_732_++)
		((Class151_Sub1_Sub2) this).anIntArray11308[i_731_ + i_732_]
		    = is[i_728_++];
	    i_728_ += i_729_;
	}
    }
    
    public void method1805(int i, int i_733_, Class148 class148, int i_734_,
			   int i_735_) {
	if (((Class151_Sub1_Sub2) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    i += ((Class151_Sub1_Sub2) this).anInt8806;
	    i_733_ += ((Class151_Sub1_Sub2) this).anInt8819;
	    int i_736_ = 0;
	    int i_737_ = (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					    .aClass173_Sub3_8814)).anInt9735
			  * 111437289);
	    int i_738_ = ((Class151_Sub1_Sub2) this).anInt8803;
	    int i_739_ = ((Class151_Sub1_Sub2) this).anInt8804;
	    int i_740_ = i_737_ - i_738_;
	    int i_741_ = 0;
	    int i_742_ = i + i_733_ * i_737_;
	    if (i_733_ < (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					    .aClass173_Sub3_8814)).anInt9725
			  * 592117349)) {
		int i_743_ = ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						 .aClass173_Sub3_8814))
			       .anInt9725) * 592117349
			      - i_733_);
		i_739_ -= i_743_;
		i_733_ = (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					    .aClass173_Sub3_8814)).anInt9725
			  * 592117349);
		i_736_ += i_743_ * i_738_;
		i_742_ += i_743_ * i_737_;
	    }
	    if (i_733_ + i_739_
		> ((Class173_Sub3) (((Class151_Sub1_Sub2) this)
				    .aClass173_Sub3_8814)).anInt9726 * 6965409)
		i_739_ -= (i_733_ + i_739_
			   - (((Class173_Sub3)
			       ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
			      .anInt9726) * 6965409);
	    if (i < (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119)) {
		int i_744_ = ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						 .aClass173_Sub3_8814))
			       .anInt9723) * -993497119
			      - i);
		i_738_ -= i_744_;
		i = (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119);
		i_736_ += i_744_;
		i_742_ += i_744_;
		i_741_ += i_744_;
		i_740_ += i_744_;
	    }
	    if (i + i_738_ > (((Class173_Sub3)
			       ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
			      .anInt9724) * 630968029) {
		int i_745_ = (i + i_738_
			      - (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						   .aClass173_Sub3_8814))
				 .anInt9724) * 630968029);
		i_738_ -= i_745_;
		i_741_ += i_745_;
		i_740_ += i_745_;
	    }
	    if (i_738_ > 0 && i_739_ > 0) {
		Class148_Sub1 class148_sub1 = (Class148_Sub1) class148;
		int[] is_746_ = ((Class148_Sub1) class148_sub1).anIntArray8789;
		int[] is_747_ = ((Class148_Sub1) class148_sub1).anIntArray8788;
		int i_748_ = i_733_;
		if (i_735_ > i_748_) {
		    i_748_ = i_735_;
		    i_742_ += (i_735_ - i_733_) * i_737_;
		    i_736_ += ((i_735_ - i_733_)
			       * ((Class151_Sub1_Sub2) this).anInt8803);
		}
		int i_749_ = (i_735_ + is_746_.length < i_733_ + i_739_
			      ? i_735_ + is_746_.length : i_733_ + i_739_);
		for (int i_750_ = i_748_; i_750_ < i_749_; i_750_++) {
		    int i_751_ = is_746_[i_750_ - i_735_] + i_734_;
		    int i_752_ = is_747_[i_750_ - i_735_];
		    int i_753_ = i_738_;
		    if (i > i_751_) {
			int i_754_ = i - i_751_;
			if (i_754_ >= i_752_) {
			    i_736_ += i_738_ + i_741_;
			    i_742_ += i_738_ + i_740_;
			    continue;
			}
			i_752_ -= i_754_;
		    } else {
			int i_755_ = i_751_ - i;
			if (i_755_ >= i_738_) {
			    i_736_ += i_738_ + i_741_;
			    i_742_ += i_738_ + i_740_;
			    continue;
			}
			i_736_ += i_755_;
			i_753_ -= i_755_;
			i_742_ += i_755_;
		    }
		    int i_756_ = 0;
		    if (i_753_ < i_752_)
			i_752_ = i_753_;
		    else
			i_756_ = i_753_ - i_752_;
		    for (int i_757_ = -i_752_; i_757_ < 0; i_757_++) {
			int i_758_ = (((Class151_Sub1_Sub2) this)
				      .anIntArray11308[i_736_++]);
			if (i_758_ != 0)
			    is[i_742_++] = i_758_;
			else
			    i_742_++;
		    }
		    i_736_ += i_756_ + i_741_;
		    i_742_ += i_756_ + i_740_;
		}
	    }
	}
    }
    
    public void method1802(int i, int i_759_, int i_760_, int i_761_, int[] is,
			   int[] is_762_, int i_763_, int i_764_) {
	method10363(i, i_759_, i_760_, i_761_, is, i_763_, i_764_);
    }
    
    public void method1798(int i, int i_765_, int i_766_, int i_767_, int[] is,
			   int[] is_768_, int i_769_, int i_770_) {
	method10363(i, i_765_, i_766_, i_767_, is, i_769_, i_770_);
    }
    
    void method8297(boolean bool, boolean bool_771_, boolean bool_772_, int i,
		    int i_773_, float f, int i_774_, int i_775_, int i_776_,
		    int i_777_, int i_778_, int i_779_, boolean bool_780_) {
	if (i_774_ > 0 && i_775_ > 0 && (bool || bool_771_)) {
	    int i_781_ = 0;
	    int i_782_ = 0;
	    int i_783_ = (((Class151_Sub1_Sub2) this).anInt8806
			  + ((Class151_Sub1_Sub2) this).anInt8803
			  + ((Class151_Sub1_Sub2) this).anInt8832);
	    int i_784_ = (((Class151_Sub1_Sub2) this).anInt8819
			  + ((Class151_Sub1_Sub2) this).anInt8804
			  + ((Class151_Sub1_Sub2) this).anInt8808);
	    int i_785_ = (i_783_ << 16) / i_774_;
	    int i_786_ = (i_784_ << 16) / i_775_;
	    if (((Class151_Sub1_Sub2) this).anInt8806 > 0) {
		int i_787_ = (((((Class151_Sub1_Sub2) this).anInt8806 << 16)
			       + i_785_ - 1)
			      / i_785_);
		i += i_787_;
		i_781_
		    += i_787_ * i_785_ - (((Class151_Sub1_Sub2) this).anInt8806
					  << 16);
	    }
	    if (((Class151_Sub1_Sub2) this).anInt8819 > 0) {
		int i_788_ = (((((Class151_Sub1_Sub2) this).anInt8819 << 16)
			       + i_786_ - 1)
			      / i_786_);
		i_773_ += i_788_;
		i_782_
		    += i_788_ * i_786_ - (((Class151_Sub1_Sub2) this).anInt8819
					  << 16);
	    }
	    if (((Class151_Sub1_Sub2) this).anInt8803 < i_783_)
		i_774_ = ((((Class151_Sub1_Sub2) this).anInt8803 << 16)
			  - i_781_ + i_785_ - 1) / i_785_;
	    if (((Class151_Sub1_Sub2) this).anInt8804 < i_784_)
		i_775_ = ((((Class151_Sub1_Sub2) this).anInt8804 << 16)
			  - i_782_ + i_786_ - 1) / i_786_;
	    int i_789_
		= i + i_773_ * ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						   .aClass173_Sub3_8814))
				 .anInt9735)
				* 111437289);
	    int i_790_ = ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					     .aClass173_Sub3_8814)).anInt9735
			   * 111437289)
			  - i_774_);
	    if (i_773_ + i_775_
		> ((Class173_Sub3) (((Class151_Sub1_Sub2) this)
				    .aClass173_Sub3_8814)).anInt9726 * 6965409)
		i_775_ -= (i_773_ + i_775_
			   - (((Class173_Sub3)
			       ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
			      .anInt9726) * 6965409);
	    if (i_773_ < (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					    .aClass173_Sub3_8814)).anInt9725
			  * 592117349)) {
		int i_791_ = ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						 .aClass173_Sub3_8814))
			       .anInt9725) * 592117349
			      - i_773_);
		i_775_ -= i_791_;
		i_789_
		    += i_791_ * ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						    .aClass173_Sub3_8814))
				  .anInt9735)
				 * 111437289);
		i_782_ += i_786_ * i_791_;
	    }
	    if (i + i_774_ > (((Class173_Sub3)
			       ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
			      .anInt9724) * 630968029) {
		int i_792_ = (i + i_774_
			      - (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						   .aClass173_Sub3_8814))
				 .anInt9724) * 630968029);
		i_774_ -= i_792_;
		i_790_ += i_792_;
	    }
	    if (i < (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119)) {
		int i_793_ = ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						 .aClass173_Sub3_8814))
			       .anInt9723) * -993497119
			      - i);
		i_774_ -= i_793_;
		i_789_ += i_793_;
		i_781_ += i_785_ * i_793_;
		i_790_ += i_793_;
	    }
	    float[] fs = (((Class173_Sub3)
			   ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
			  .aFloatArray9716);
	    int[] is = (((Class173_Sub3)
			 ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
			.anIntArray9719);
	    if (i_778_ == 0) {
		if (i_776_ == 1) {
		    int i_794_ = i_781_;
		    for (int i_795_ = -i_775_; i_795_ < 0; i_795_++) {
			int i_796_ = ((i_782_ >> 16)
				      * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_797_ = -i_774_; i_797_ < 0; i_797_++) {
			    if (!bool_771_ || f < fs[i_789_]) {
				if (bool)
				    is[i_789_] = (((Class151_Sub1_Sub2) this)
						  .anIntArray11308
						  [(i_781_ >> 16) + i_796_]);
				if (bool_771_ && bool_780_)
				    fs[i_789_] = f;
			    }
			    i_781_ += i_785_;
			    i_789_++;
			}
			i_782_ += i_786_;
			i_781_ = i_794_;
			i_789_ += i_790_;
		    }
		} else if (i_776_ == 0) {
		    int i_798_ = (i_777_ & 0xff0000) >> 16;
		    int i_799_ = (i_777_ & 0xff00) >> 8;
		    int i_800_ = i_777_ & 0xff;
		    int i_801_ = i_781_;
		    for (int i_802_ = -i_775_; i_802_ < 0; i_802_++) {
			int i_803_ = ((i_782_ >> 16)
				      * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_804_ = -i_774_; i_804_ < 0; i_804_++) {
			    if (!bool_771_ || f < fs[i_789_]) {
				if (bool) {
				    int i_805_ = (((Class151_Sub1_Sub2) this)
						  .anIntArray11308
						  [(i_781_ >> 16) + i_803_]);
				    int i_806_ = ((i_805_ & 0xff0000) * i_798_
						  & ~0xffffff);
				    int i_807_ = ((i_805_ & 0xff00) * i_799_
						  & 0xff0000);
				    int i_808_
					= (i_805_ & 0xff) * i_800_ & 0xff00;
				    is[i_789_]
					= (i_806_ | i_807_ | i_808_) >>> 8;
				}
				if (bool_771_ && bool_780_)
				    fs[i_789_] = f;
			    }
			    i_781_ += i_785_;
			    i_789_++;
			}
			i_782_ += i_786_;
			i_781_ = i_801_;
			i_789_ += i_790_;
		    }
		} else if (i_776_ == 3) {
		    int i_809_ = i_781_;
		    for (int i_810_ = -i_775_; i_810_ < 0; i_810_++) {
			int i_811_ = ((i_782_ >> 16)
				      * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_812_ = -i_774_; i_812_ < 0; i_812_++) {
			    if (!bool_771_ || f < fs[i_789_]) {
				if (bool) {
				    int i_813_ = (((Class151_Sub1_Sub2) this)
						  .anIntArray11308
						  [(i_781_ >> 16) + i_811_]);
				    int i_814_ = i_813_ + i_777_;
				    int i_815_ = ((i_813_ & 0xff00ff)
						  + (i_777_ & 0xff00ff));
				    int i_816_
					= ((i_815_ & 0x1000100)
					   + (i_814_ - i_815_ & 0x10000));
				    is[i_789_]
					= i_814_ - i_816_ | i_816_ - (i_816_
								      >>> 8);
				}
				if (bool_771_ && bool_780_)
				    fs[i_789_] = f;
			    }
			    i_781_ += i_785_;
			    i_789_++;
			}
			i_782_ += i_786_;
			i_781_ = i_809_;
			i_789_ += i_790_;
		    }
		} else if (i_776_ == 2) {
		    int i_817_ = i_777_ >>> 24;
		    int i_818_ = 256 - i_817_;
		    int i_819_ = (i_777_ & 0xff00ff) * i_818_ & ~0xff00ff;
		    int i_820_ = (i_777_ & 0xff00) * i_818_ & 0xff0000;
		    i_777_ = (i_819_ | i_820_) >>> 8;
		    int i_821_ = i_781_;
		    for (int i_822_ = -i_775_; i_822_ < 0; i_822_++) {
			int i_823_ = ((i_782_ >> 16)
				      * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_824_ = -i_774_; i_824_ < 0; i_824_++) {
			    if (!bool_771_ || f < fs[i_789_]) {
				if (bool) {
				    int i_825_ = (((Class151_Sub1_Sub2) this)
						  .anIntArray11308
						  [(i_781_ >> 16) + i_823_]);
				    i_819_ = ((i_825_ & 0xff00ff) * i_817_
					      & ~0xff00ff);
				    i_820_ = ((i_825_ & 0xff00) * i_817_
					      & 0xff0000);
				    is[i_789_]
					= ((i_819_ | i_820_) >>> 8) + i_777_;
				}
				if (bool_771_ && bool_780_)
				    fs[i_789_] = f;
			    }
			    i_781_ += i_785_;
			    i_789_++;
			}
			i_782_ += i_786_;
			i_781_ = i_821_;
			i_789_ += i_790_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_778_ == 1) {
		if (i_776_ == 1) {
		    int i_826_ = i_781_;
		    for (int i_827_ = -i_775_; i_827_ < 0; i_827_++) {
			int i_828_ = ((i_782_ >> 16)
				      * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_829_ = -i_774_; i_829_ < 0; i_829_++) {
			    if (!bool_771_ || f < fs[i_789_]) {
				int i_830_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308
					      [(i_781_ >> 16) + i_828_]);
				if (i_830_ != 0) {
				    if (bool)
					is[i_789_] = i_830_;
				    if (bool_771_ && bool_780_)
					fs[i_789_] = f;
				}
			    }
			    i_781_ += i_785_;
			    i_789_++;
			}
			i_782_ += i_786_;
			i_781_ = i_826_;
			i_789_ += i_790_;
		    }
		} else if (i_776_ == 0) {
		    int i_831_ = i_781_;
		    if ((i_777_ & 0xffffff) == 16777215) {
			int i_832_ = i_777_ >>> 24;
			int i_833_ = 256 - i_832_;
			for (int i_834_ = -i_775_; i_834_ < 0; i_834_++) {
			    int i_835_
				= ((i_782_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_836_ = -i_774_; i_836_ < 0; i_836_++) {
				if (!bool_771_ || f < fs[i_789_]) {
				    int i_837_ = (((Class151_Sub1_Sub2) this)
						  .anIntArray11308
						  [(i_781_ >> 16) + i_835_]);
				    if (i_837_ != 0) {
					if (bool) {
					    int i_838_ = is[i_789_];
					    is[i_789_]
						= (((((i_837_ & 0xff00ff)
						      * i_832_)
						     + ((i_838_ & 0xff00ff)
							* i_833_))
						    & ~0xff00ff)
						   + ((((i_837_ & 0xff00)
							* i_832_)
						       + ((i_838_ & 0xff00)
							  * i_833_))
						      & 0xff0000)) >> 8;
					}
					if (bool_771_ && bool_780_)
					    fs[i_789_] = f;
				    }
				}
				i_781_ += i_785_;
				i_789_++;
			    }
			    i_782_ += i_786_;
			    i_781_ = i_831_;
			    i_789_ += i_790_;
			}
		    } else {
			int i_839_ = (i_777_ & 0xff0000) >> 16;
			int i_840_ = (i_777_ & 0xff00) >> 8;
			int i_841_ = i_777_ & 0xff;
			int i_842_ = i_777_ >>> 24;
			int i_843_ = 256 - i_842_;
			for (int i_844_ = -i_775_; i_844_ < 0; i_844_++) {
			    int i_845_
				= ((i_782_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_846_ = -i_774_; i_846_ < 0; i_846_++) {
				if (!bool_771_ || f < fs[i_789_]) {
				    int i_847_ = (((Class151_Sub1_Sub2) this)
						  .anIntArray11308
						  [(i_781_ >> 16) + i_845_]);
				    if (i_847_ != 0) {
					if (i_842_ != 255) {
					    if (bool) {
						int i_848_
						    = (((i_847_ & 0xff0000)
							* i_839_)
						       & ~0xffffff);
						int i_849_
						    = (((i_847_ & 0xff00)
							* i_840_)
						       & 0xff0000);
						int i_850_
						    = ((i_847_ & 0xff) * i_841_
						       & 0xff00);
						i_847_ = (i_848_ | i_849_
							  | i_850_) >>> 8;
						int i_851_ = is[i_789_];
						is[i_789_]
						    = (((((i_847_ & 0xff00ff)
							  * i_842_)
							 + ((i_851_ & 0xff00ff)
							    * i_843_))
							& ~0xff00ff)
						       + ((((i_847_ & 0xff00)
							    * i_842_)
							   + ((i_851_ & 0xff00)
							      * i_843_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_771_ && bool_780_)
						fs[i_789_] = f;
					} else {
					    if (bool) {
						int i_852_
						    = (((i_847_ & 0xff0000)
							* i_839_)
						       & ~0xffffff);
						int i_853_
						    = (((i_847_ & 0xff00)
							* i_840_)
						       & 0xff0000);
						int i_854_
						    = ((i_847_ & 0xff) * i_841_
						       & 0xff00);
						is[i_789_] = (i_852_ | i_853_
							      | i_854_) >>> 8;
					    }
					    if (bool_771_ && bool_780_)
						fs[i_789_] = f;
					}
				    }
				}
				i_781_ += i_785_;
				i_789_++;
			    }
			    i_782_ += i_786_;
			    i_781_ = i_831_;
			    i_789_ += i_790_;
			}
		    }
		} else if (i_776_ == 3) {
		    int i_855_ = i_781_;
		    int i_856_ = i_777_ >>> 24;
		    int i_857_ = 256 - i_856_;
		    for (int i_858_ = -i_775_; i_858_ < 0; i_858_++) {
			int i_859_ = ((i_782_ >> 16)
				      * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_860_ = -i_774_; i_860_ < 0; i_860_++) {
			    if (!bool_771_ || f < fs[i_789_]) {
				if (bool) {
				    int i_861_ = (((Class151_Sub1_Sub2) this)
						  .anIntArray11308
						  [(i_781_ >> 16) + i_859_]);
				    int i_862_ = i_861_ + i_777_;
				    int i_863_ = ((i_861_ & 0xff00ff)
						  + (i_777_ & 0xff00ff));
				    int i_864_
					= ((i_863_ & 0x1000100)
					   + (i_862_ - i_863_ & 0x10000));
				    i_864_
					= i_862_ - i_864_ | i_864_ - (i_864_
								      >>> 8);
				    if (i_861_ == 0 && i_856_ != 255) {
					i_861_ = i_864_;
					i_864_ = is[i_789_];
					i_864_
					    = ((((i_861_ & 0xff00ff) * i_856_
						 + ((i_864_ & 0xff00ff)
						    * i_857_))
						& ~0xff00ff)
					       + (((i_861_ & 0xff00) * i_856_
						   + ((i_864_ & 0xff00)
						      * i_857_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_789_] = i_864_;
				}
				if (bool_771_ && bool_780_)
				    fs[i_789_] = f;
			    }
			    i_781_ += i_785_;
			    i_789_++;
			}
			i_782_ += i_786_;
			i_781_ = i_855_;
			i_789_ += i_790_;
		    }
		} else if (i_776_ == 2) {
		    int i_865_ = i_777_ >>> 24;
		    int i_866_ = 256 - i_865_;
		    int i_867_ = (i_777_ & 0xff00ff) * i_866_ & ~0xff00ff;
		    int i_868_ = (i_777_ & 0xff00) * i_866_ & 0xff0000;
		    i_777_ = (i_867_ | i_868_) >>> 8;
		    int i_869_ = i_781_;
		    for (int i_870_ = -i_775_; i_870_ < 0; i_870_++) {
			int i_871_ = ((i_782_ >> 16)
				      * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_872_ = -i_774_; i_872_ < 0; i_872_++) {
			    if (!bool_771_ || f < fs[i_789_]) {
				int i_873_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308
					      [(i_781_ >> 16) + i_871_]);
				if (i_873_ != 0) {
				    if (bool) {
					i_867_ = ((i_873_ & 0xff00ff) * i_865_
						  & ~0xff00ff);
					i_868_ = ((i_873_ & 0xff00) * i_865_
						  & 0xff0000);
					is[i_789_] = (((i_867_ | i_868_) >>> 8)
						      + i_777_);
				    }
				    if (bool_771_ && bool_780_)
					fs[i_789_] = f;
				}
			    }
			    i_781_ += i_785_;
			    i_789_++;
			}
			i_782_ += i_786_;
			i_781_ = i_869_;
			i_789_ += i_790_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_778_ == 2) {
		if (i_776_ == 1) {
		    int i_874_ = i_781_;
		    for (int i_875_ = -i_775_; i_875_ < 0; i_875_++) {
			int i_876_ = ((i_782_ >> 16)
				      * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_877_ = -i_774_; i_877_ < 0; i_877_++) {
			    if (!bool_771_ || f < fs[i_789_]) {
				int i_878_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308
					      [(i_781_ >> 16) + i_876_]);
				if (i_878_ != 0) {
				    if (bool) {
					int i_879_ = is[i_789_];
					int i_880_ = i_878_ + i_879_;
					int i_881_ = ((i_878_ & 0xff00ff)
						      + (i_879_ & 0xff00ff));
					i_879_
					    = ((i_881_ & 0x1000100)
					       + (i_880_ - i_881_ & 0x10000));
					is[i_789_]
					    = (i_880_ - i_879_
					       | i_879_ - (i_879_ >>> 8));
				    }
				    if (bool_771_ && bool_780_)
					fs[i_789_] = f;
				}
			    }
			    i_781_ += i_785_;
			    i_789_++;
			}
			i_782_ += i_786_;
			i_781_ = i_874_;
			i_789_ += i_790_;
		    }
		} else if (i_776_ == 0) {
		    int i_882_ = i_781_;
		    int i_883_ = (i_777_ & 0xff0000) >> 16;
		    int i_884_ = (i_777_ & 0xff00) >> 8;
		    int i_885_ = i_777_ & 0xff;
		    for (int i_886_ = -i_775_; i_886_ < 0; i_886_++) {
			int i_887_ = ((i_782_ >> 16)
				      * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_888_ = -i_774_; i_888_ < 0; i_888_++) {
			    if (!bool_771_ || f < fs[i_789_]) {
				int i_889_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308
					      [(i_781_ >> 16) + i_887_]);
				if (i_889_ != 0) {
				    if (bool) {
					int i_890_
					    = ((i_889_ & 0xff0000) * i_883_
					       & ~0xffffff);
					int i_891_
					    = ((i_889_ & 0xff00) * i_884_
					       & 0xff0000);
					int i_892_ = ((i_889_ & 0xff) * i_885_
						      & 0xff00);
					i_889_
					    = (i_890_ | i_891_ | i_892_) >>> 8;
					int i_893_ = is[i_789_];
					int i_894_ = i_889_ + i_893_;
					int i_895_ = ((i_889_ & 0xff00ff)
						      + (i_893_ & 0xff00ff));
					i_893_
					    = ((i_895_ & 0x1000100)
					       + (i_894_ - i_895_ & 0x10000));
					is[i_789_]
					    = (i_894_ - i_893_
					       | i_893_ - (i_893_ >>> 8));
				    }
				    if (bool_771_ && bool_780_)
					fs[i_789_] = f;
				}
			    }
			    i_781_ += i_785_;
			    i_789_++;
			}
			i_782_ += i_786_;
			i_781_ = i_882_;
			i_789_ += i_790_;
		    }
		} else if (i_776_ == 3) {
		    int i_896_ = i_781_;
		    for (int i_897_ = -i_775_; i_897_ < 0; i_897_++) {
			int i_898_ = ((i_782_ >> 16)
				      * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_899_ = -i_774_; i_899_ < 0; i_899_++) {
			    if (!bool_771_ || f < fs[i_789_]) {
				if (bool) {
				    int i_900_ = (((Class151_Sub1_Sub2) this)
						  .anIntArray11308
						  [(i_781_ >> 16) + i_898_]);
				    int i_901_ = i_900_ + i_777_;
				    int i_902_ = ((i_900_ & 0xff00ff)
						  + (i_777_ & 0xff00ff));
				    int i_903_
					= ((i_902_ & 0x1000100)
					   + (i_901_ - i_902_ & 0x10000));
				    i_900_
					= i_901_ - i_903_ | i_903_ - (i_903_
								      >>> 8);
				    i_903_ = is[i_789_];
				    i_901_ = i_900_ + i_903_;
				    i_902_
					= (i_900_ & 0xff00ff) + (i_903_
								 & 0xff00ff);
				    i_903_ = ((i_902_ & 0x1000100)
					      + (i_901_ - i_902_ & 0x10000));
				    is[i_789_]
					= i_901_ - i_903_ | i_903_ - (i_903_
								      >>> 8);
				}
				if (bool_771_ && bool_780_)
				    fs[i_789_] = f;
			    }
			    i_781_ += i_785_;
			    i_789_++;
			}
			i_782_ += i_786_;
			i_781_ = i_896_;
			i_789_ += i_790_;
		    }
		} else if (i_776_ == 2) {
		    int i_904_ = i_777_ >>> 24;
		    int i_905_ = 256 - i_904_;
		    int i_906_ = (i_777_ & 0xff00ff) * i_905_ & ~0xff00ff;
		    int i_907_ = (i_777_ & 0xff00) * i_905_ & 0xff0000;
		    i_777_ = (i_906_ | i_907_) >>> 8;
		    int i_908_ = i_781_;
		    for (int i_909_ = -i_775_; i_909_ < 0; i_909_++) {
			int i_910_ = ((i_782_ >> 16)
				      * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_911_ = -i_774_; i_911_ < 0; i_911_++) {
			    if (!bool_771_ || f < fs[i_789_]) {
				int i_912_ = (((Class151_Sub1_Sub2) this)
					      .anIntArray11308
					      [(i_781_ >> 16) + i_910_]);
				if (i_912_ != 0) {
				    if (bool) {
					i_906_ = ((i_912_ & 0xff00ff) * i_904_
						  & ~0xff00ff);
					i_907_ = ((i_912_ & 0xff00) * i_904_
						  & 0xff0000);
					i_912_ = (((i_906_ | i_907_) >>> 8)
						  + i_777_);
					int i_913_ = is[i_789_];
					int i_914_ = i_912_ + i_913_;
					int i_915_ = ((i_912_ & 0xff00ff)
						      + (i_913_ & 0xff00ff));
					i_913_
					    = ((i_915_ & 0x1000100)
					       + (i_914_ - i_915_ & 0x10000));
					is[i_789_]
					    = (i_914_ - i_913_
					       | i_913_ - (i_913_ >>> 8));
				    }
				    if (bool_771_ && bool_780_)
					fs[i_789_] = f;
				}
			    }
			    i_781_ += i_785_;
			    i_789_++;
			}
			i_782_ += i_786_;
			i_781_ = i_908_;
			i_789_ += i_790_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method1796(int i, int i_916_, int i_917_, int i_918_,
			   int i_919_, int i_920_) {
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is == null)
	    throw new IllegalStateException("");
	for (int i_921_ = 0; i_921_ < i_918_; i_921_++) {
	    int i_922_
		= ((i_916_ + i_921_) * ((Class151_Sub1_Sub2) this).anInt8803
		   + i);
	    int i_923_ = ((i_920_ + i_921_)
			  * (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					       .aClass173_Sub3_8814)).anInt9735
			     * 111437289)) + i_919_;
	    for (int i_924_ = 0; i_924_ < i_917_; i_924_++)
		((Class151_Sub1_Sub2) this).anIntArray11308[i_922_ + i_924_]
		    = is[i_923_ + i_924_];
	}
    }
    
    public void method1778(int i, int i_925_, int i_926_) {
	throw new IllegalStateException("");
    }
    
    void method10364(int i, int i_927_, int[] is, int i_928_, int i_929_) {
	if (i_929_ == 0) {
	    if (i_928_ == 1)
		is[i_927_] = ((Class151_Sub1_Sub2) this).anIntArray11308[i];
	    else if (i_928_ == 0) {
		int i_930_ = ((Class151_Sub1_Sub2) this).anIntArray11308[i++];
		int i_931_ = (i_930_ & 0xff0000) * anInt8815 & ~0xffffff;
		int i_932_ = (i_930_ & 0xff00) * anInt8833 & 0xff0000;
		int i_933_ = (i_930_ & 0xff) * anInt8836 & 0xff00;
		is[i_927_] = (i_931_ | i_932_ | i_933_) >>> 8;
	    } else if (i_928_ == 3) {
		int i_934_ = ((Class151_Sub1_Sub2) this).anIntArray11308[i++];
		int i_935_ = anInt8829;
		int i_936_ = i_934_ + i_935_;
		int i_937_ = (i_934_ & 0xff00ff) + (i_935_ & 0xff00ff);
		int i_938_
		    = (i_937_ & 0x1000100) + (i_936_ - i_937_ & 0x10000);
		is[i_927_] = i_936_ - i_938_ | i_938_ - (i_938_ >>> 8);
	    } else if (i_928_ == 2) {
		int i_939_ = ((Class151_Sub1_Sub2) this).anIntArray11308[i];
		int i_940_ = (i_939_ & 0xff00ff) * anInt8830 & ~0xff00ff;
		int i_941_ = (i_939_ & 0xff00) * anInt8830 & 0xff0000;
		is[i_927_] = ((i_940_ | i_941_) >>> 8) + anInt8834;
	    } else
		throw new IllegalArgumentException();
	} else if (i_929_ == 1) {
	    if (i_928_ == 1) {
		int i_942_ = ((Class151_Sub1_Sub2) this).anIntArray11308[i];
		if (i_942_ != 0)
		    is[i_927_] = i_942_;
	    } else if (i_928_ == 0) {
		int i_943_ = ((Class151_Sub1_Sub2) this).anIntArray11308[i];
		if (i_943_ != 0) {
		    if ((anInt8829 & 0xffffff) == 16777215) {
			int i_944_ = anInt8829 >>> 24;
			int i_945_ = 256 - i_944_;
			int i_946_ = is[i_927_];
			is[i_927_] = ((((i_943_ & 0xff00ff) * i_944_
					+ (i_946_ & 0xff00ff) * i_945_)
				       & ~0xff00ff)
				      + (((i_943_ & 0xff00) * i_944_
					  + (i_946_ & 0xff00) * i_945_)
					 & 0xff0000)) >> 8;
		    } else if (anInt8830 != 255) {
			int i_947_
			    = (i_943_ & 0xff0000) * anInt8815 & ~0xffffff;
			int i_948_ = (i_943_ & 0xff00) * anInt8833 & 0xff0000;
			int i_949_ = (i_943_ & 0xff) * anInt8836 & 0xff00;
			i_943_ = (i_947_ | i_948_ | i_949_) >>> 8;
			int i_950_ = is[i_927_];
			is[i_927_] = ((((i_943_ & 0xff00ff) * anInt8830
					+ (i_950_ & 0xff00ff) * anInt8831)
				       & ~0xff00ff)
				      + (((i_943_ & 0xff00) * anInt8830
					  + (i_950_ & 0xff00) * anInt8831)
					 & 0xff0000)) >> 8;
		    } else {
			int i_951_
			    = (i_943_ & 0xff0000) * anInt8815 & ~0xffffff;
			int i_952_ = (i_943_ & 0xff00) * anInt8833 & 0xff0000;
			int i_953_ = (i_943_ & 0xff) * anInt8836 & 0xff00;
			is[i_927_] = (i_951_ | i_952_ | i_953_) >>> 8;
		    }
		}
	    } else if (i_928_ == 3) {
		int i_954_ = ((Class151_Sub1_Sub2) this).anIntArray11308[i];
		int i_955_ = anInt8829;
		int i_956_ = i_954_ + i_955_;
		int i_957_ = (i_954_ & 0xff00ff) + (i_955_ & 0xff00ff);
		int i_958_
		    = (i_957_ & 0x1000100) + (i_956_ - i_957_ & 0x10000);
		i_958_ = i_956_ - i_958_ | i_958_ - (i_958_ >>> 8);
		if (i_954_ == 0 && anInt8830 != 255) {
		    i_954_ = i_958_;
		    i_958_ = is[i_927_];
		    i_958_ = ((((i_954_ & 0xff00ff) * anInt8830
				+ (i_958_ & 0xff00ff) * anInt8831)
			       & ~0xff00ff)
			      + (((i_954_ & 0xff00) * anInt8830
				  + (i_958_ & 0xff00) * anInt8831)
				 & 0xff0000)) >> 8;
		}
		is[i_927_] = i_958_;
	    } else if (i_928_ == 2) {
		int i_959_ = ((Class151_Sub1_Sub2) this).anIntArray11308[i];
		if (i_959_ != 0) {
		    int i_960_ = (i_959_ & 0xff00ff) * anInt8830 & ~0xff00ff;
		    int i_961_ = (i_959_ & 0xff00) * anInt8830 & 0xff0000;
		    is[i_927_++] = ((i_960_ | i_961_) >>> 8) + anInt8834;
		}
	    } else
		throw new IllegalArgumentException();
	} else if (i_929_ == 2) {
	    if (i_928_ == 1) {
		int i_962_ = ((Class151_Sub1_Sub2) this).anIntArray11308[i];
		if (i_962_ != 0) {
		    int i_963_ = is[i_927_];
		    int i_964_ = i_962_ + i_963_;
		    int i_965_ = (i_962_ & 0xff00ff) + (i_963_ & 0xff00ff);
		    i_963_
			= (i_965_ & 0x1000100) + (i_964_ - i_965_ & 0x10000);
		    is[i_927_] = i_964_ - i_963_ | i_963_ - (i_963_ >>> 8);
		}
	    } else if (i_928_ == 0) {
		int i_966_ = ((Class151_Sub1_Sub2) this).anIntArray11308[i];
		if (i_966_ != 0) {
		    int i_967_ = (i_966_ & 0xff0000) * anInt8815 & ~0xffffff;
		    int i_968_ = (i_966_ & 0xff00) * anInt8833 & 0xff0000;
		    int i_969_ = (i_966_ & 0xff) * anInt8836 & 0xff00;
		    i_966_ = (i_967_ | i_968_ | i_969_) >>> 8;
		    int i_970_ = is[i_927_];
		    int i_971_ = i_966_ + i_970_;
		    int i_972_ = (i_966_ & 0xff00ff) + (i_970_ & 0xff00ff);
		    i_970_
			= (i_972_ & 0x1000100) + (i_971_ - i_972_ & 0x10000);
		    is[i_927_] = i_971_ - i_970_ | i_970_ - (i_970_ >>> 8);
		}
	    } else if (i_928_ == 3) {
		int i_973_ = ((Class151_Sub1_Sub2) this).anIntArray11308[i];
		int i_974_ = anInt8829;
		int i_975_ = i_973_ + i_974_;
		int i_976_ = (i_973_ & 0xff00ff) + (i_974_ & 0xff00ff);
		int i_977_
		    = (i_976_ & 0x1000100) + (i_975_ - i_976_ & 0x10000);
		i_973_ = i_975_ - i_977_ | i_977_ - (i_977_ >>> 8);
		i_977_ = is[i_927_];
		i_975_ = i_973_ + i_977_;
		i_976_ = (i_973_ & 0xff00ff) + (i_977_ & 0xff00ff);
		i_977_ = (i_976_ & 0x1000100) + (i_975_ - i_976_ & 0x10000);
		is[i_927_] = i_975_ - i_977_ | i_977_ - (i_977_ >>> 8);
	    } else if (i_928_ == 2) {
		int i_978_ = ((Class151_Sub1_Sub2) this).anIntArray11308[i];
		if (i_978_ != 0) {
		    int i_979_ = (i_978_ & 0xff00ff) * anInt8830 & ~0xff00ff;
		    int i_980_ = (i_978_ & 0xff00) * anInt8830 & 0xff0000;
		    i_978_ = ((i_979_ | i_980_) >>> 8) + anInt8834;
		    int i_981_ = is[i_927_];
		    int i_982_ = i_978_ + i_981_;
		    int i_983_ = (i_978_ & 0xff00ff) + (i_981_ & 0xff00ff);
		    i_981_
			= (i_983_ & 0x1000100) + (i_982_ - i_983_ & 0x10000);
		    is[i_927_] = i_982_ - i_981_ | i_981_ - (i_981_ >>> 8);
		}
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    public Interface19 method1799() {
	return new Class106(((Class151_Sub1_Sub2) this).anInt8803,
			    ((Class151_Sub1_Sub2) this).anInt8804,
			    ((Class151_Sub1_Sub2) this).anIntArray11308);
    }
    
    public void method1811(int i, int i_984_, int i_985_, int i_986_,
			   int i_987_) {
	if (((Class151_Sub1_Sub2) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    int i_988_ = (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					    .aClass173_Sub3_8814)).anInt9735
			  * 111437289);
	    i += ((Class151_Sub1_Sub2) this).anInt8806;
	    i_984_ += ((Class151_Sub1_Sub2) this).anInt8819;
	    int i_989_ = i_984_ * i_988_ + i;
	    int i_990_ = 0;
	    int i_991_ = ((Class151_Sub1_Sub2) this).anInt8804;
	    int i_992_ = ((Class151_Sub1_Sub2) this).anInt8803;
	    int i_993_ = i_988_ - i_992_;
	    int i_994_ = 0;
	    if (i_984_ < (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					    .aClass173_Sub3_8814)).anInt9725
			  * 592117349)) {
		int i_995_ = ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						 .aClass173_Sub3_8814))
			       .anInt9725) * 592117349
			      - i_984_);
		i_991_ -= i_995_;
		i_984_ = (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					    .aClass173_Sub3_8814)).anInt9725
			  * 592117349);
		i_990_ += i_995_ * i_992_;
		i_989_ += i_995_ * i_988_;
	    }
	    if (i_984_ + i_991_
		> ((Class173_Sub3) (((Class151_Sub1_Sub2) this)
				    .aClass173_Sub3_8814)).anInt9726 * 6965409)
		i_991_ -= (i_984_ + i_991_
			   - (((Class173_Sub3)
			       ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
			      .anInt9726) * 6965409);
	    if (i < (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119)) {
		int i_996_ = ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						 .aClass173_Sub3_8814))
			       .anInt9723) * -993497119
			      - i);
		i_992_ -= i_996_;
		i = (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119);
		i_990_ += i_996_;
		i_989_ += i_996_;
		i_994_ += i_996_;
		i_993_ += i_996_;
	    }
	    if (i + i_992_ > (((Class173_Sub3)
			       ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
			      .anInt9724) * 630968029) {
		int i_997_ = (i + i_992_
			      - (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						   .aClass173_Sub3_8814))
				 .anInt9724) * 630968029);
		i_992_ -= i_997_;
		i_994_ += i_997_;
		i_993_ += i_997_;
	    }
	    if (i_992_ > 0 && i_991_ > 0) {
		if (i_987_ == 0) {
		    if (i_985_ == 1) {
			for (int i_998_ = -i_991_; i_998_ < 0; i_998_++) {
			    int i_999_ = i_989_ + i_992_ - 3;
			    while (i_989_ < i_999_) {
				is[i_989_++] = (((Class151_Sub1_Sub2) this)
						.anIntArray11308[i_990_++]);
				is[i_989_++] = (((Class151_Sub1_Sub2) this)
						.anIntArray11308[i_990_++]);
				is[i_989_++] = (((Class151_Sub1_Sub2) this)
						.anIntArray11308[i_990_++]);
				is[i_989_++] = (((Class151_Sub1_Sub2) this)
						.anIntArray11308[i_990_++]);
			    }
			    i_999_ += 3;
			    while (i_989_ < i_999_)
				is[i_989_++] = (((Class151_Sub1_Sub2) this)
						.anIntArray11308[i_990_++]);
			    i_989_ += i_993_;
			    i_990_ += i_994_;
			}
		    } else if (i_985_ == 0) {
			int i_1000_ = (i_986_ & 0xff0000) >> 16;
			int i_1001_ = (i_986_ & 0xff00) >> 8;
			int i_1002_ = i_986_ & 0xff;
			for (int i_1003_ = -i_991_; i_1003_ < 0; i_1003_++) {
			    for (int i_1004_ = -i_992_; i_1004_ < 0;
				 i_1004_++) {
				int i_1005_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_990_++]);
				int i_1006_ = ((i_1005_ & 0xff0000) * i_1000_
					       & ~0xffffff);
				int i_1007_
				    = (i_1005_ & 0xff00) * i_1001_ & 0xff0000;
				int i_1008_
				    = (i_1005_ & 0xff) * i_1002_ & 0xff00;
				is[i_989_++]
				    = (i_1006_ | i_1007_ | i_1008_) >>> 8;
			    }
			    i_989_ += i_993_;
			    i_990_ += i_994_;
			}
		    } else if (i_985_ == 3) {
			for (int i_1009_ = -i_991_; i_1009_ < 0; i_1009_++) {
			    for (int i_1010_ = -i_992_; i_1010_ < 0;
				 i_1010_++) {
				int i_1011_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_990_++]);
				int i_1012_ = i_1011_ + i_986_;
				int i_1013_ = ((i_1011_ & 0xff00ff)
					       + (i_986_ & 0xff00ff));
				int i_1014_
				    = ((i_1013_ & 0x1000100)
				       + (i_1012_ - i_1013_ & 0x10000));
				is[i_989_++]
				    = i_1012_ - i_1014_ | i_1014_ - (i_1014_
								     >>> 8);
			    }
			    i_989_ += i_993_;
			    i_990_ += i_994_;
			}
		    } else if (i_985_ == 2) {
			int i_1015_ = i_986_ >>> 24;
			int i_1016_ = 256 - i_1015_;
			int i_1017_
			    = (i_986_ & 0xff00ff) * i_1016_ & ~0xff00ff;
			int i_1018_ = (i_986_ & 0xff00) * i_1016_ & 0xff0000;
			i_986_ = (i_1017_ | i_1018_) >>> 8;
			for (int i_1019_ = -i_991_; i_1019_ < 0; i_1019_++) {
			    for (int i_1020_ = -i_992_; i_1020_ < 0;
				 i_1020_++) {
				int i_1021_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_990_++]);
				i_1017_ = ((i_1021_ & 0xff00ff) * i_1015_
					   & ~0xff00ff);
				i_1018_
				    = (i_1021_ & 0xff00) * i_1015_ & 0xff0000;
				is[i_989_++]
				    = ((i_1017_ | i_1018_) >>> 8) + i_986_;
			    }
			    i_989_ += i_993_;
			    i_990_ += i_994_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_987_ == 1) {
		    if (i_985_ == 1) {
			for (int i_1022_ = -i_991_; i_1022_ < 0; i_1022_++) {
			    int i_1023_ = i_989_ + i_992_ - 3;
			    while (i_989_ < i_1023_) {
				int i_1024_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_990_++]);
				if (i_1024_ != 0)
				    is[i_989_++] = i_1024_;
				else
				    i_989_++;
				i_1024_ = (((Class151_Sub1_Sub2) this)
					   .anIntArray11308[i_990_++]);
				if (i_1024_ != 0)
				    is[i_989_++] = i_1024_;
				else
				    i_989_++;
				i_1024_ = (((Class151_Sub1_Sub2) this)
					   .anIntArray11308[i_990_++]);
				if (i_1024_ != 0)
				    is[i_989_++] = i_1024_;
				else
				    i_989_++;
				i_1024_ = (((Class151_Sub1_Sub2) this)
					   .anIntArray11308[i_990_++]);
				if (i_1024_ != 0)
				    is[i_989_++] = i_1024_;
				else
				    i_989_++;
			    }
			    i_1023_ += 3;
			    while (i_989_ < i_1023_) {
				int i_1025_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_990_++]);
				if (i_1025_ != 0)
				    is[i_989_++] = i_1025_;
				else
				    i_989_++;
			    }
			    i_989_ += i_993_;
			    i_990_ += i_994_;
			}
		    } else if (i_985_ == 0) {
			if ((i_986_ & 0xffffff) == 16777215) {
			    int i_1026_ = i_986_ >>> 24;
			    int i_1027_ = 256 - i_1026_;
			    for (int i_1028_ = -i_991_; i_1028_ < 0;
				 i_1028_++) {
				for (int i_1029_ = -i_992_; i_1029_ < 0;
				     i_1029_++) {
				    int i_1030_ = (((Class151_Sub1_Sub2) this)
						   .anIntArray11308[i_990_++]);
				    if (i_1030_ != 0) {
					int i_1031_ = is[i_989_];
					is[i_989_++]
					    = ((((i_1030_ & 0xff00ff) * i_1026_
						 + ((i_1031_ & 0xff00ff)
						    * i_1027_))
						& ~0xff00ff)
					       + (((i_1030_ & 0xff00) * i_1026_
						   + ((i_1031_ & 0xff00)
						      * i_1027_))
						  & 0xff0000)) >> 8;
				    } else
					i_989_++;
				}
				i_989_ += i_993_;
				i_990_ += i_994_;
			    }
			} else {
			    int i_1032_ = (i_986_ & 0xff0000) >> 16;
			    int i_1033_ = (i_986_ & 0xff00) >> 8;
			    int i_1034_ = i_986_ & 0xff;
			    int i_1035_ = i_986_ >>> 24;
			    int i_1036_ = 256 - i_1035_;
			    for (int i_1037_ = -i_991_; i_1037_ < 0;
				 i_1037_++) {
				for (int i_1038_ = -i_992_; i_1038_ < 0;
				     i_1038_++) {
				    int i_1039_ = (((Class151_Sub1_Sub2) this)
						   .anIntArray11308[i_990_++]);
				    if (i_1039_ != 0) {
					if (i_1035_ != 255) {
					    int i_1040_
						= (((i_1039_ & 0xff0000)
						    * i_1032_)
						   & ~0xffffff);
					    int i_1041_
						= ((i_1039_ & 0xff00) * i_1033_
						   & 0xff0000);
					    int i_1042_
						= ((i_1039_ & 0xff) * i_1034_
						   & 0xff00);
					    i_1039_ = (i_1040_ | i_1041_
						       | i_1042_) >>> 8;
					    int i_1043_ = is[i_989_];
					    is[i_989_++]
						= (((((i_1039_ & 0xff00ff)
						      * i_1035_)
						     + ((i_1043_ & 0xff00ff)
							* i_1036_))
						    & ~0xff00ff)
						   + ((((i_1039_ & 0xff00)
							* i_1035_)
						       + ((i_1043_ & 0xff00)
							  * i_1036_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1044_
						= (((i_1039_ & 0xff0000)
						    * i_1032_)
						   & ~0xffffff);
					    int i_1045_
						= ((i_1039_ & 0xff00) * i_1033_
						   & 0xff0000);
					    int i_1046_
						= ((i_1039_ & 0xff) * i_1034_
						   & 0xff00);
					    is[i_989_++] = (i_1044_ | i_1045_
							    | i_1046_) >>> 8;
					}
				    } else
					i_989_++;
				}
				i_989_ += i_993_;
				i_990_ += i_994_;
			    }
			}
		    } else if (i_985_ == 3) {
			int i_1047_ = i_986_ >>> 24;
			int i_1048_ = 256 - i_1047_;
			for (int i_1049_ = -i_991_; i_1049_ < 0; i_1049_++) {
			    for (int i_1050_ = -i_992_; i_1050_ < 0;
				 i_1050_++) {
				int i_1051_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_990_++]);
				int i_1052_ = i_1051_ + i_986_;
				int i_1053_ = ((i_1051_ & 0xff00ff)
					       + (i_986_ & 0xff00ff));
				int i_1054_
				    = ((i_1053_ & 0x1000100)
				       + (i_1052_ - i_1053_ & 0x10000));
				i_1054_
				    = i_1052_ - i_1054_ | i_1054_ - (i_1054_
								     >>> 8);
				if (i_1051_ == 0 && i_1047_ != 255) {
				    i_1051_ = i_1054_;
				    i_1054_ = is[i_989_];
				    i_1054_
					= ((((i_1051_ & 0xff00ff) * i_1047_
					     + (i_1054_ & 0xff00ff) * i_1048_)
					    & ~0xff00ff)
					   + (((i_1051_ & 0xff00) * i_1047_
					       + (i_1054_ & 0xff00) * i_1048_)
					      & 0xff0000)) >> 8;
				}
				is[i_989_++] = i_1054_;
			    }
			    i_989_ += i_993_;
			    i_990_ += i_994_;
			}
		    } else if (i_985_ == 2) {
			int i_1055_ = i_986_ >>> 24;
			int i_1056_ = 256 - i_1055_;
			int i_1057_
			    = (i_986_ & 0xff00ff) * i_1056_ & ~0xff00ff;
			int i_1058_ = (i_986_ & 0xff00) * i_1056_ & 0xff0000;
			i_986_ = (i_1057_ | i_1058_) >>> 8;
			for (int i_1059_ = -i_991_; i_1059_ < 0; i_1059_++) {
			    for (int i_1060_ = -i_992_; i_1060_ < 0;
				 i_1060_++) {
				int i_1061_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_990_++]);
				if (i_1061_ != 0) {
				    i_1057_ = ((i_1061_ & 0xff00ff) * i_1055_
					       & ~0xff00ff);
				    i_1058_ = ((i_1061_ & 0xff00) * i_1055_
					       & 0xff0000);
				    is[i_989_++]
					= ((i_1057_ | i_1058_) >>> 8) + i_986_;
				} else
				    i_989_++;
			    }
			    i_989_ += i_993_;
			    i_990_ += i_994_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_987_ == 2) {
		    if (i_985_ == 1) {
			for (int i_1062_ = -i_991_; i_1062_ < 0; i_1062_++) {
			    for (int i_1063_ = -i_992_; i_1063_ < 0;
				 i_1063_++) {
				int i_1064_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_990_++]);
				if (i_1064_ != 0) {
				    int i_1065_ = is[i_989_];
				    int i_1066_ = i_1064_ + i_1065_;
				    int i_1067_ = ((i_1064_ & 0xff00ff)
						   + (i_1065_ & 0xff00ff));
				    i_1065_
					= ((i_1067_ & 0x1000100)
					   + (i_1066_ - i_1067_ & 0x10000));
				    is[i_989_++]
					= (i_1066_ - i_1065_
					   | i_1065_ - (i_1065_ >>> 8));
				} else
				    i_989_++;
			    }
			    i_989_ += i_993_;
			    i_990_ += i_994_;
			}
		    } else if (i_985_ == 0) {
			int i_1068_ = (i_986_ & 0xff0000) >> 16;
			int i_1069_ = (i_986_ & 0xff00) >> 8;
			int i_1070_ = i_986_ & 0xff;
			for (int i_1071_ = -i_991_; i_1071_ < 0; i_1071_++) {
			    for (int i_1072_ = -i_992_; i_1072_ < 0;
				 i_1072_++) {
				int i_1073_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_990_++]);
				if (i_1073_ != 0) {
				    int i_1074_
					= ((i_1073_ & 0xff0000) * i_1068_
					   & ~0xffffff);
				    int i_1075_ = ((i_1073_ & 0xff00) * i_1069_
						   & 0xff0000);
				    int i_1076_
					= (i_1073_ & 0xff) * i_1070_ & 0xff00;
				    i_1073_
					= (i_1074_ | i_1075_ | i_1076_) >>> 8;
				    int i_1077_ = is[i_989_];
				    int i_1078_ = i_1073_ + i_1077_;
				    int i_1079_ = ((i_1073_ & 0xff00ff)
						   + (i_1077_ & 0xff00ff));
				    i_1077_
					= ((i_1079_ & 0x1000100)
					   + (i_1078_ - i_1079_ & 0x10000));
				    is[i_989_++]
					= (i_1078_ - i_1077_
					   | i_1077_ - (i_1077_ >>> 8));
				} else
				    i_989_++;
			    }
			    i_989_ += i_993_;
			    i_990_ += i_994_;
			}
		    } else if (i_985_ == 3) {
			for (int i_1080_ = -i_991_; i_1080_ < 0; i_1080_++) {
			    for (int i_1081_ = -i_992_; i_1081_ < 0;
				 i_1081_++) {
				int i_1082_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_990_++]);
				int i_1083_ = i_1082_ + i_986_;
				int i_1084_ = ((i_1082_ & 0xff00ff)
					       + (i_986_ & 0xff00ff));
				int i_1085_
				    = ((i_1084_ & 0x1000100)
				       + (i_1083_ - i_1084_ & 0x10000));
				i_1082_
				    = i_1083_ - i_1085_ | i_1085_ - (i_1085_
								     >>> 8);
				i_1085_ = is[i_989_];
				i_1083_ = i_1082_ + i_1085_;
				i_1084_ = (i_1082_ & 0xff00ff) + (i_1085_
								  & 0xff00ff);
				i_1085_ = ((i_1084_ & 0x1000100)
					   + (i_1083_ - i_1084_ & 0x10000));
				is[i_989_++]
				    = i_1083_ - i_1085_ | i_1085_ - (i_1085_
								     >>> 8);
			    }
			    i_989_ += i_993_;
			    i_990_ += i_994_;
			}
		    } else if (i_985_ == 2) {
			int i_1086_ = i_986_ >>> 24;
			int i_1087_ = 256 - i_1086_;
			int i_1088_
			    = (i_986_ & 0xff00ff) * i_1087_ & ~0xff00ff;
			int i_1089_ = (i_986_ & 0xff00) * i_1087_ & 0xff0000;
			i_986_ = (i_1088_ | i_1089_) >>> 8;
			for (int i_1090_ = -i_991_; i_1090_ < 0; i_1090_++) {
			    for (int i_1091_ = -i_992_; i_1091_ < 0;
				 i_1091_++) {
				int i_1092_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_990_++]);
				if (i_1092_ != 0) {
				    i_1088_ = ((i_1092_ & 0xff00ff) * i_1086_
					       & ~0xff00ff);
				    i_1089_ = ((i_1092_ & 0xff00) * i_1086_
					       & 0xff0000);
				    i_1092_
					= ((i_1088_ | i_1089_) >>> 8) + i_986_;
				    int i_1093_ = is[i_989_];
				    int i_1094_ = i_1092_ + i_1093_;
				    int i_1095_ = ((i_1092_ & 0xff00ff)
						   + (i_1093_ & 0xff00ff));
				    i_1093_
					= ((i_1095_ & 0x1000100)
					   + (i_1094_ - i_1095_ & 0x10000));
				    is[i_989_++]
					= (i_1094_ - i_1093_
					   | i_1093_ - (i_1093_ >>> 8));
				} else
				    i_989_++;
			    }
			    i_989_ += i_993_;
			    i_990_ += i_994_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method1810(int i, int i_1096_, int i_1097_, int i_1098_,
			   int i_1099_) {
	if (((Class151_Sub1_Sub2) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    int i_1100_ = (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					     .aClass173_Sub3_8814)).anInt9735
			   * 111437289);
	    i += ((Class151_Sub1_Sub2) this).anInt8806;
	    i_1096_ += ((Class151_Sub1_Sub2) this).anInt8819;
	    int i_1101_ = i_1096_ * i_1100_ + i;
	    int i_1102_ = 0;
	    int i_1103_ = ((Class151_Sub1_Sub2) this).anInt8804;
	    int i_1104_ = ((Class151_Sub1_Sub2) this).anInt8803;
	    int i_1105_ = i_1100_ - i_1104_;
	    int i_1106_ = 0;
	    if (i_1096_ < (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					     .aClass173_Sub3_8814)).anInt9725
			   * 592117349)) {
		int i_1107_ = ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						  .aClass173_Sub3_8814))
				.anInt9725) * 592117349
			       - i_1096_);
		i_1103_ -= i_1107_;
		i_1096_ = (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					     .aClass173_Sub3_8814)).anInt9725
			   * 592117349);
		i_1102_ += i_1107_ * i_1104_;
		i_1101_ += i_1107_ * i_1100_;
	    }
	    if (i_1096_ + i_1103_
		> ((Class173_Sub3) (((Class151_Sub1_Sub2) this)
				    .aClass173_Sub3_8814)).anInt9726 * 6965409)
		i_1103_ -= (i_1096_ + i_1103_
			    - (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						 .aClass173_Sub3_8814))
			       .anInt9726) * 6965409);
	    if (i < (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119)) {
		int i_1108_ = ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						  .aClass173_Sub3_8814))
				.anInt9723) * -993497119
			       - i);
		i_1104_ -= i_1108_;
		i = (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119);
		i_1102_ += i_1108_;
		i_1101_ += i_1108_;
		i_1106_ += i_1108_;
		i_1105_ += i_1108_;
	    }
	    if (i + i_1104_ > (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						 .aClass173_Sub3_8814))
			       .anInt9724) * 630968029) {
		int i_1109_ = (i + i_1104_
			       - (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						    .aClass173_Sub3_8814))
				  .anInt9724) * 630968029);
		i_1104_ -= i_1109_;
		i_1106_ += i_1109_;
		i_1105_ += i_1109_;
	    }
	    if (i_1104_ > 0 && i_1103_ > 0) {
		if (i_1099_ == 0) {
		    if (i_1097_ == 1) {
			for (int i_1110_ = -i_1103_; i_1110_ < 0; i_1110_++) {
			    int i_1111_ = i_1101_ + i_1104_ - 3;
			    while (i_1101_ < i_1111_) {
				is[i_1101_++] = (((Class151_Sub1_Sub2) this)
						 .anIntArray11308[i_1102_++]);
				is[i_1101_++] = (((Class151_Sub1_Sub2) this)
						 .anIntArray11308[i_1102_++]);
				is[i_1101_++] = (((Class151_Sub1_Sub2) this)
						 .anIntArray11308[i_1102_++]);
				is[i_1101_++] = (((Class151_Sub1_Sub2) this)
						 .anIntArray11308[i_1102_++]);
			    }
			    i_1111_ += 3;
			    while (i_1101_ < i_1111_)
				is[i_1101_++] = (((Class151_Sub1_Sub2) this)
						 .anIntArray11308[i_1102_++]);
			    i_1101_ += i_1105_;
			    i_1102_ += i_1106_;
			}
		    } else if (i_1097_ == 0) {
			int i_1112_ = (i_1098_ & 0xff0000) >> 16;
			int i_1113_ = (i_1098_ & 0xff00) >> 8;
			int i_1114_ = i_1098_ & 0xff;
			for (int i_1115_ = -i_1103_; i_1115_ < 0; i_1115_++) {
			    for (int i_1116_ = -i_1104_; i_1116_ < 0;
				 i_1116_++) {
				int i_1117_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_1102_++]);
				int i_1118_ = ((i_1117_ & 0xff0000) * i_1112_
					       & ~0xffffff);
				int i_1119_
				    = (i_1117_ & 0xff00) * i_1113_ & 0xff0000;
				int i_1120_
				    = (i_1117_ & 0xff) * i_1114_ & 0xff00;
				is[i_1101_++]
				    = (i_1118_ | i_1119_ | i_1120_) >>> 8;
			    }
			    i_1101_ += i_1105_;
			    i_1102_ += i_1106_;
			}
		    } else if (i_1097_ == 3) {
			for (int i_1121_ = -i_1103_; i_1121_ < 0; i_1121_++) {
			    for (int i_1122_ = -i_1104_; i_1122_ < 0;
				 i_1122_++) {
				int i_1123_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_1102_++]);
				int i_1124_ = i_1123_ + i_1098_;
				int i_1125_ = ((i_1123_ & 0xff00ff)
					       + (i_1098_ & 0xff00ff));
				int i_1126_
				    = ((i_1125_ & 0x1000100)
				       + (i_1124_ - i_1125_ & 0x10000));
				is[i_1101_++]
				    = i_1124_ - i_1126_ | i_1126_ - (i_1126_
								     >>> 8);
			    }
			    i_1101_ += i_1105_;
			    i_1102_ += i_1106_;
			}
		    } else if (i_1097_ == 2) {
			int i_1127_ = i_1098_ >>> 24;
			int i_1128_ = 256 - i_1127_;
			int i_1129_
			    = (i_1098_ & 0xff00ff) * i_1128_ & ~0xff00ff;
			int i_1130_ = (i_1098_ & 0xff00) * i_1128_ & 0xff0000;
			i_1098_ = (i_1129_ | i_1130_) >>> 8;
			for (int i_1131_ = -i_1103_; i_1131_ < 0; i_1131_++) {
			    for (int i_1132_ = -i_1104_; i_1132_ < 0;
				 i_1132_++) {
				int i_1133_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_1102_++]);
				i_1129_ = ((i_1133_ & 0xff00ff) * i_1127_
					   & ~0xff00ff);
				i_1130_
				    = (i_1133_ & 0xff00) * i_1127_ & 0xff0000;
				is[i_1101_++]
				    = ((i_1129_ | i_1130_) >>> 8) + i_1098_;
			    }
			    i_1101_ += i_1105_;
			    i_1102_ += i_1106_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1099_ == 1) {
		    if (i_1097_ == 1) {
			for (int i_1134_ = -i_1103_; i_1134_ < 0; i_1134_++) {
			    int i_1135_ = i_1101_ + i_1104_ - 3;
			    while (i_1101_ < i_1135_) {
				int i_1136_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_1102_++]);
				if (i_1136_ != 0)
				    is[i_1101_++] = i_1136_;
				else
				    i_1101_++;
				i_1136_ = (((Class151_Sub1_Sub2) this)
					   .anIntArray11308[i_1102_++]);
				if (i_1136_ != 0)
				    is[i_1101_++] = i_1136_;
				else
				    i_1101_++;
				i_1136_ = (((Class151_Sub1_Sub2) this)
					   .anIntArray11308[i_1102_++]);
				if (i_1136_ != 0)
				    is[i_1101_++] = i_1136_;
				else
				    i_1101_++;
				i_1136_ = (((Class151_Sub1_Sub2) this)
					   .anIntArray11308[i_1102_++]);
				if (i_1136_ != 0)
				    is[i_1101_++] = i_1136_;
				else
				    i_1101_++;
			    }
			    i_1135_ += 3;
			    while (i_1101_ < i_1135_) {
				int i_1137_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_1102_++]);
				if (i_1137_ != 0)
				    is[i_1101_++] = i_1137_;
				else
				    i_1101_++;
			    }
			    i_1101_ += i_1105_;
			    i_1102_ += i_1106_;
			}
		    } else if (i_1097_ == 0) {
			if ((i_1098_ & 0xffffff) == 16777215) {
			    int i_1138_ = i_1098_ >>> 24;
			    int i_1139_ = 256 - i_1138_;
			    for (int i_1140_ = -i_1103_; i_1140_ < 0;
				 i_1140_++) {
				for (int i_1141_ = -i_1104_; i_1141_ < 0;
				     i_1141_++) {
				    int i_1142_
					= (((Class151_Sub1_Sub2) this)
					   .anIntArray11308[i_1102_++]);
				    if (i_1142_ != 0) {
					int i_1143_ = is[i_1101_];
					is[i_1101_++]
					    = ((((i_1142_ & 0xff00ff) * i_1138_
						 + ((i_1143_ & 0xff00ff)
						    * i_1139_))
						& ~0xff00ff)
					       + (((i_1142_ & 0xff00) * i_1138_
						   + ((i_1143_ & 0xff00)
						      * i_1139_))
						  & 0xff0000)) >> 8;
				    } else
					i_1101_++;
				}
				i_1101_ += i_1105_;
				i_1102_ += i_1106_;
			    }
			} else {
			    int i_1144_ = (i_1098_ & 0xff0000) >> 16;
			    int i_1145_ = (i_1098_ & 0xff00) >> 8;
			    int i_1146_ = i_1098_ & 0xff;
			    int i_1147_ = i_1098_ >>> 24;
			    int i_1148_ = 256 - i_1147_;
			    for (int i_1149_ = -i_1103_; i_1149_ < 0;
				 i_1149_++) {
				for (int i_1150_ = -i_1104_; i_1150_ < 0;
				     i_1150_++) {
				    int i_1151_
					= (((Class151_Sub1_Sub2) this)
					   .anIntArray11308[i_1102_++]);
				    if (i_1151_ != 0) {
					if (i_1147_ != 255) {
					    int i_1152_
						= (((i_1151_ & 0xff0000)
						    * i_1144_)
						   & ~0xffffff);
					    int i_1153_
						= ((i_1151_ & 0xff00) * i_1145_
						   & 0xff0000);
					    int i_1154_
						= ((i_1151_ & 0xff) * i_1146_
						   & 0xff00);
					    i_1151_ = (i_1152_ | i_1153_
						       | i_1154_) >>> 8;
					    int i_1155_ = is[i_1101_];
					    is[i_1101_++]
						= (((((i_1151_ & 0xff00ff)
						      * i_1147_)
						     + ((i_1155_ & 0xff00ff)
							* i_1148_))
						    & ~0xff00ff)
						   + ((((i_1151_ & 0xff00)
							* i_1147_)
						       + ((i_1155_ & 0xff00)
							  * i_1148_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1156_
						= (((i_1151_ & 0xff0000)
						    * i_1144_)
						   & ~0xffffff);
					    int i_1157_
						= ((i_1151_ & 0xff00) * i_1145_
						   & 0xff0000);
					    int i_1158_
						= ((i_1151_ & 0xff) * i_1146_
						   & 0xff00);
					    is[i_1101_++] = (i_1156_ | i_1157_
							     | i_1158_) >>> 8;
					}
				    } else
					i_1101_++;
				}
				i_1101_ += i_1105_;
				i_1102_ += i_1106_;
			    }
			}
		    } else if (i_1097_ == 3) {
			int i_1159_ = i_1098_ >>> 24;
			int i_1160_ = 256 - i_1159_;
			for (int i_1161_ = -i_1103_; i_1161_ < 0; i_1161_++) {
			    for (int i_1162_ = -i_1104_; i_1162_ < 0;
				 i_1162_++) {
				int i_1163_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_1102_++]);
				int i_1164_ = i_1163_ + i_1098_;
				int i_1165_ = ((i_1163_ & 0xff00ff)
					       + (i_1098_ & 0xff00ff));
				int i_1166_
				    = ((i_1165_ & 0x1000100)
				       + (i_1164_ - i_1165_ & 0x10000));
				i_1166_
				    = i_1164_ - i_1166_ | i_1166_ - (i_1166_
								     >>> 8);
				if (i_1163_ == 0 && i_1159_ != 255) {
				    i_1163_ = i_1166_;
				    i_1166_ = is[i_1101_];
				    i_1166_
					= ((((i_1163_ & 0xff00ff) * i_1159_
					     + (i_1166_ & 0xff00ff) * i_1160_)
					    & ~0xff00ff)
					   + (((i_1163_ & 0xff00) * i_1159_
					       + (i_1166_ & 0xff00) * i_1160_)
					      & 0xff0000)) >> 8;
				}
				is[i_1101_++] = i_1166_;
			    }
			    i_1101_ += i_1105_;
			    i_1102_ += i_1106_;
			}
		    } else if (i_1097_ == 2) {
			int i_1167_ = i_1098_ >>> 24;
			int i_1168_ = 256 - i_1167_;
			int i_1169_
			    = (i_1098_ & 0xff00ff) * i_1168_ & ~0xff00ff;
			int i_1170_ = (i_1098_ & 0xff00) * i_1168_ & 0xff0000;
			i_1098_ = (i_1169_ | i_1170_) >>> 8;
			for (int i_1171_ = -i_1103_; i_1171_ < 0; i_1171_++) {
			    for (int i_1172_ = -i_1104_; i_1172_ < 0;
				 i_1172_++) {
				int i_1173_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_1102_++]);
				if (i_1173_ != 0) {
				    i_1169_ = ((i_1173_ & 0xff00ff) * i_1167_
					       & ~0xff00ff);
				    i_1170_ = ((i_1173_ & 0xff00) * i_1167_
					       & 0xff0000);
				    is[i_1101_++] = ((i_1169_ | i_1170_)
						     >>> 8) + i_1098_;
				} else
				    i_1101_++;
			    }
			    i_1101_ += i_1105_;
			    i_1102_ += i_1106_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1099_ == 2) {
		    if (i_1097_ == 1) {
			for (int i_1174_ = -i_1103_; i_1174_ < 0; i_1174_++) {
			    for (int i_1175_ = -i_1104_; i_1175_ < 0;
				 i_1175_++) {
				int i_1176_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_1102_++]);
				if (i_1176_ != 0) {
				    int i_1177_ = is[i_1101_];
				    int i_1178_ = i_1176_ + i_1177_;
				    int i_1179_ = ((i_1176_ & 0xff00ff)
						   + (i_1177_ & 0xff00ff));
				    i_1177_
					= ((i_1179_ & 0x1000100)
					   + (i_1178_ - i_1179_ & 0x10000));
				    is[i_1101_++]
					= (i_1178_ - i_1177_
					   | i_1177_ - (i_1177_ >>> 8));
				} else
				    i_1101_++;
			    }
			    i_1101_ += i_1105_;
			    i_1102_ += i_1106_;
			}
		    } else if (i_1097_ == 0) {
			int i_1180_ = (i_1098_ & 0xff0000) >> 16;
			int i_1181_ = (i_1098_ & 0xff00) >> 8;
			int i_1182_ = i_1098_ & 0xff;
			for (int i_1183_ = -i_1103_; i_1183_ < 0; i_1183_++) {
			    for (int i_1184_ = -i_1104_; i_1184_ < 0;
				 i_1184_++) {
				int i_1185_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_1102_++]);
				if (i_1185_ != 0) {
				    int i_1186_
					= ((i_1185_ & 0xff0000) * i_1180_
					   & ~0xffffff);
				    int i_1187_ = ((i_1185_ & 0xff00) * i_1181_
						   & 0xff0000);
				    int i_1188_
					= (i_1185_ & 0xff) * i_1182_ & 0xff00;
				    i_1185_
					= (i_1186_ | i_1187_ | i_1188_) >>> 8;
				    int i_1189_ = is[i_1101_];
				    int i_1190_ = i_1185_ + i_1189_;
				    int i_1191_ = ((i_1185_ & 0xff00ff)
						   + (i_1189_ & 0xff00ff));
				    i_1189_
					= ((i_1191_ & 0x1000100)
					   + (i_1190_ - i_1191_ & 0x10000));
				    is[i_1101_++]
					= (i_1190_ - i_1189_
					   | i_1189_ - (i_1189_ >>> 8));
				} else
				    i_1101_++;
			    }
			    i_1101_ += i_1105_;
			    i_1102_ += i_1106_;
			}
		    } else if (i_1097_ == 3) {
			for (int i_1192_ = -i_1103_; i_1192_ < 0; i_1192_++) {
			    for (int i_1193_ = -i_1104_; i_1193_ < 0;
				 i_1193_++) {
				int i_1194_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_1102_++]);
				int i_1195_ = i_1194_ + i_1098_;
				int i_1196_ = ((i_1194_ & 0xff00ff)
					       + (i_1098_ & 0xff00ff));
				int i_1197_
				    = ((i_1196_ & 0x1000100)
				       + (i_1195_ - i_1196_ & 0x10000));
				i_1194_
				    = i_1195_ - i_1197_ | i_1197_ - (i_1197_
								     >>> 8);
				i_1197_ = is[i_1101_];
				i_1195_ = i_1194_ + i_1197_;
				i_1196_ = (i_1194_ & 0xff00ff) + (i_1197_
								  & 0xff00ff);
				i_1197_ = ((i_1196_ & 0x1000100)
					   + (i_1195_ - i_1196_ & 0x10000));
				is[i_1101_++]
				    = i_1195_ - i_1197_ | i_1197_ - (i_1197_
								     >>> 8);
			    }
			    i_1101_ += i_1105_;
			    i_1102_ += i_1106_;
			}
		    } else if (i_1097_ == 2) {
			int i_1198_ = i_1098_ >>> 24;
			int i_1199_ = 256 - i_1198_;
			int i_1200_
			    = (i_1098_ & 0xff00ff) * i_1199_ & ~0xff00ff;
			int i_1201_ = (i_1098_ & 0xff00) * i_1199_ & 0xff0000;
			i_1098_ = (i_1200_ | i_1201_) >>> 8;
			for (int i_1202_ = -i_1103_; i_1202_ < 0; i_1202_++) {
			    for (int i_1203_ = -i_1104_; i_1203_ < 0;
				 i_1203_++) {
				int i_1204_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_1102_++]);
				if (i_1204_ != 0) {
				    i_1200_ = ((i_1204_ & 0xff00ff) * i_1198_
					       & ~0xff00ff);
				    i_1201_ = ((i_1204_ & 0xff00) * i_1198_
					       & 0xff0000);
				    i_1204_ = (((i_1200_ | i_1201_) >>> 8)
					       + i_1098_);
				    int i_1205_ = is[i_1101_];
				    int i_1206_ = i_1204_ + i_1205_;
				    int i_1207_ = ((i_1204_ & 0xff00ff)
						   + (i_1205_ & 0xff00ff));
				    i_1205_
					= ((i_1207_ & 0x1000100)
					   + (i_1206_ - i_1207_ & 0x10000));
				    is[i_1101_++]
					= (i_1206_ - i_1205_
					   | i_1205_ - (i_1205_ >>> 8));
				} else
				    i_1101_++;
			    }
			    i_1101_ += i_1105_;
			    i_1102_ += i_1106_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method1803(int i, int i_1208_, int i_1209_, int i_1210_,
			   int i_1211_) {
	if (((Class151_Sub1_Sub2) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    int i_1212_ = (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					     .aClass173_Sub3_8814)).anInt9735
			   * 111437289);
	    i += ((Class151_Sub1_Sub2) this).anInt8806;
	    i_1208_ += ((Class151_Sub1_Sub2) this).anInt8819;
	    int i_1213_ = i_1208_ * i_1212_ + i;
	    int i_1214_ = 0;
	    int i_1215_ = ((Class151_Sub1_Sub2) this).anInt8804;
	    int i_1216_ = ((Class151_Sub1_Sub2) this).anInt8803;
	    int i_1217_ = i_1212_ - i_1216_;
	    int i_1218_ = 0;
	    if (i_1208_ < (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					     .aClass173_Sub3_8814)).anInt9725
			   * 592117349)) {
		int i_1219_ = ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						  .aClass173_Sub3_8814))
				.anInt9725) * 592117349
			       - i_1208_);
		i_1215_ -= i_1219_;
		i_1208_ = (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					     .aClass173_Sub3_8814)).anInt9725
			   * 592117349);
		i_1214_ += i_1219_ * i_1216_;
		i_1213_ += i_1219_ * i_1212_;
	    }
	    if (i_1208_ + i_1215_
		> ((Class173_Sub3) (((Class151_Sub1_Sub2) this)
				    .aClass173_Sub3_8814)).anInt9726 * 6965409)
		i_1215_ -= (i_1208_ + i_1215_
			    - (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						 .aClass173_Sub3_8814))
			       .anInt9726) * 6965409);
	    if (i < (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119)) {
		int i_1220_ = ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						  .aClass173_Sub3_8814))
				.anInt9723) * -993497119
			       - i);
		i_1216_ -= i_1220_;
		i = (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119);
		i_1214_ += i_1220_;
		i_1213_ += i_1220_;
		i_1218_ += i_1220_;
		i_1217_ += i_1220_;
	    }
	    if (i + i_1216_ > (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						 .aClass173_Sub3_8814))
			       .anInt9724) * 630968029) {
		int i_1221_ = (i + i_1216_
			       - (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						    .aClass173_Sub3_8814))
				  .anInt9724) * 630968029);
		i_1216_ -= i_1221_;
		i_1218_ += i_1221_;
		i_1217_ += i_1221_;
	    }
	    if (i_1216_ > 0 && i_1215_ > 0) {
		if (i_1211_ == 0) {
		    if (i_1209_ == 1) {
			for (int i_1222_ = -i_1215_; i_1222_ < 0; i_1222_++) {
			    int i_1223_ = i_1213_ + i_1216_ - 3;
			    while (i_1213_ < i_1223_) {
				is[i_1213_++] = (((Class151_Sub1_Sub2) this)
						 .anIntArray11308[i_1214_++]);
				is[i_1213_++] = (((Class151_Sub1_Sub2) this)
						 .anIntArray11308[i_1214_++]);
				is[i_1213_++] = (((Class151_Sub1_Sub2) this)
						 .anIntArray11308[i_1214_++]);
				is[i_1213_++] = (((Class151_Sub1_Sub2) this)
						 .anIntArray11308[i_1214_++]);
			    }
			    i_1223_ += 3;
			    while (i_1213_ < i_1223_)
				is[i_1213_++] = (((Class151_Sub1_Sub2) this)
						 .anIntArray11308[i_1214_++]);
			    i_1213_ += i_1217_;
			    i_1214_ += i_1218_;
			}
		    } else if (i_1209_ == 0) {
			int i_1224_ = (i_1210_ & 0xff0000) >> 16;
			int i_1225_ = (i_1210_ & 0xff00) >> 8;
			int i_1226_ = i_1210_ & 0xff;
			for (int i_1227_ = -i_1215_; i_1227_ < 0; i_1227_++) {
			    for (int i_1228_ = -i_1216_; i_1228_ < 0;
				 i_1228_++) {
				int i_1229_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_1214_++]);
				int i_1230_ = ((i_1229_ & 0xff0000) * i_1224_
					       & ~0xffffff);
				int i_1231_
				    = (i_1229_ & 0xff00) * i_1225_ & 0xff0000;
				int i_1232_
				    = (i_1229_ & 0xff) * i_1226_ & 0xff00;
				is[i_1213_++]
				    = (i_1230_ | i_1231_ | i_1232_) >>> 8;
			    }
			    i_1213_ += i_1217_;
			    i_1214_ += i_1218_;
			}
		    } else if (i_1209_ == 3) {
			for (int i_1233_ = -i_1215_; i_1233_ < 0; i_1233_++) {
			    for (int i_1234_ = -i_1216_; i_1234_ < 0;
				 i_1234_++) {
				int i_1235_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_1214_++]);
				int i_1236_ = i_1235_ + i_1210_;
				int i_1237_ = ((i_1235_ & 0xff00ff)
					       + (i_1210_ & 0xff00ff));
				int i_1238_
				    = ((i_1237_ & 0x1000100)
				       + (i_1236_ - i_1237_ & 0x10000));
				is[i_1213_++]
				    = i_1236_ - i_1238_ | i_1238_ - (i_1238_
								     >>> 8);
			    }
			    i_1213_ += i_1217_;
			    i_1214_ += i_1218_;
			}
		    } else if (i_1209_ == 2) {
			int i_1239_ = i_1210_ >>> 24;
			int i_1240_ = 256 - i_1239_;
			int i_1241_
			    = (i_1210_ & 0xff00ff) * i_1240_ & ~0xff00ff;
			int i_1242_ = (i_1210_ & 0xff00) * i_1240_ & 0xff0000;
			i_1210_ = (i_1241_ | i_1242_) >>> 8;
			for (int i_1243_ = -i_1215_; i_1243_ < 0; i_1243_++) {
			    for (int i_1244_ = -i_1216_; i_1244_ < 0;
				 i_1244_++) {
				int i_1245_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_1214_++]);
				i_1241_ = ((i_1245_ & 0xff00ff) * i_1239_
					   & ~0xff00ff);
				i_1242_
				    = (i_1245_ & 0xff00) * i_1239_ & 0xff0000;
				is[i_1213_++]
				    = ((i_1241_ | i_1242_) >>> 8) + i_1210_;
			    }
			    i_1213_ += i_1217_;
			    i_1214_ += i_1218_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1211_ == 1) {
		    if (i_1209_ == 1) {
			for (int i_1246_ = -i_1215_; i_1246_ < 0; i_1246_++) {
			    int i_1247_ = i_1213_ + i_1216_ - 3;
			    while (i_1213_ < i_1247_) {
				int i_1248_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_1214_++]);
				if (i_1248_ != 0)
				    is[i_1213_++] = i_1248_;
				else
				    i_1213_++;
				i_1248_ = (((Class151_Sub1_Sub2) this)
					   .anIntArray11308[i_1214_++]);
				if (i_1248_ != 0)
				    is[i_1213_++] = i_1248_;
				else
				    i_1213_++;
				i_1248_ = (((Class151_Sub1_Sub2) this)
					   .anIntArray11308[i_1214_++]);
				if (i_1248_ != 0)
				    is[i_1213_++] = i_1248_;
				else
				    i_1213_++;
				i_1248_ = (((Class151_Sub1_Sub2) this)
					   .anIntArray11308[i_1214_++]);
				if (i_1248_ != 0)
				    is[i_1213_++] = i_1248_;
				else
				    i_1213_++;
			    }
			    i_1247_ += 3;
			    while (i_1213_ < i_1247_) {
				int i_1249_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_1214_++]);
				if (i_1249_ != 0)
				    is[i_1213_++] = i_1249_;
				else
				    i_1213_++;
			    }
			    i_1213_ += i_1217_;
			    i_1214_ += i_1218_;
			}
		    } else if (i_1209_ == 0) {
			if ((i_1210_ & 0xffffff) == 16777215) {
			    int i_1250_ = i_1210_ >>> 24;
			    int i_1251_ = 256 - i_1250_;
			    for (int i_1252_ = -i_1215_; i_1252_ < 0;
				 i_1252_++) {
				for (int i_1253_ = -i_1216_; i_1253_ < 0;
				     i_1253_++) {
				    int i_1254_
					= (((Class151_Sub1_Sub2) this)
					   .anIntArray11308[i_1214_++]);
				    if (i_1254_ != 0) {
					int i_1255_ = is[i_1213_];
					is[i_1213_++]
					    = ((((i_1254_ & 0xff00ff) * i_1250_
						 + ((i_1255_ & 0xff00ff)
						    * i_1251_))
						& ~0xff00ff)
					       + (((i_1254_ & 0xff00) * i_1250_
						   + ((i_1255_ & 0xff00)
						      * i_1251_))
						  & 0xff0000)) >> 8;
				    } else
					i_1213_++;
				}
				i_1213_ += i_1217_;
				i_1214_ += i_1218_;
			    }
			} else {
			    int i_1256_ = (i_1210_ & 0xff0000) >> 16;
			    int i_1257_ = (i_1210_ & 0xff00) >> 8;
			    int i_1258_ = i_1210_ & 0xff;
			    int i_1259_ = i_1210_ >>> 24;
			    int i_1260_ = 256 - i_1259_;
			    for (int i_1261_ = -i_1215_; i_1261_ < 0;
				 i_1261_++) {
				for (int i_1262_ = -i_1216_; i_1262_ < 0;
				     i_1262_++) {
				    int i_1263_
					= (((Class151_Sub1_Sub2) this)
					   .anIntArray11308[i_1214_++]);
				    if (i_1263_ != 0) {
					if (i_1259_ != 255) {
					    int i_1264_
						= (((i_1263_ & 0xff0000)
						    * i_1256_)
						   & ~0xffffff);
					    int i_1265_
						= ((i_1263_ & 0xff00) * i_1257_
						   & 0xff0000);
					    int i_1266_
						= ((i_1263_ & 0xff) * i_1258_
						   & 0xff00);
					    i_1263_ = (i_1264_ | i_1265_
						       | i_1266_) >>> 8;
					    int i_1267_ = is[i_1213_];
					    is[i_1213_++]
						= (((((i_1263_ & 0xff00ff)
						      * i_1259_)
						     + ((i_1267_ & 0xff00ff)
							* i_1260_))
						    & ~0xff00ff)
						   + ((((i_1263_ & 0xff00)
							* i_1259_)
						       + ((i_1267_ & 0xff00)
							  * i_1260_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1268_
						= (((i_1263_ & 0xff0000)
						    * i_1256_)
						   & ~0xffffff);
					    int i_1269_
						= ((i_1263_ & 0xff00) * i_1257_
						   & 0xff0000);
					    int i_1270_
						= ((i_1263_ & 0xff) * i_1258_
						   & 0xff00);
					    is[i_1213_++] = (i_1268_ | i_1269_
							     | i_1270_) >>> 8;
					}
				    } else
					i_1213_++;
				}
				i_1213_ += i_1217_;
				i_1214_ += i_1218_;
			    }
			}
		    } else if (i_1209_ == 3) {
			int i_1271_ = i_1210_ >>> 24;
			int i_1272_ = 256 - i_1271_;
			for (int i_1273_ = -i_1215_; i_1273_ < 0; i_1273_++) {
			    for (int i_1274_ = -i_1216_; i_1274_ < 0;
				 i_1274_++) {
				int i_1275_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_1214_++]);
				int i_1276_ = i_1275_ + i_1210_;
				int i_1277_ = ((i_1275_ & 0xff00ff)
					       + (i_1210_ & 0xff00ff));
				int i_1278_
				    = ((i_1277_ & 0x1000100)
				       + (i_1276_ - i_1277_ & 0x10000));
				i_1278_
				    = i_1276_ - i_1278_ | i_1278_ - (i_1278_
								     >>> 8);
				if (i_1275_ == 0 && i_1271_ != 255) {
				    i_1275_ = i_1278_;
				    i_1278_ = is[i_1213_];
				    i_1278_
					= ((((i_1275_ & 0xff00ff) * i_1271_
					     + (i_1278_ & 0xff00ff) * i_1272_)
					    & ~0xff00ff)
					   + (((i_1275_ & 0xff00) * i_1271_
					       + (i_1278_ & 0xff00) * i_1272_)
					      & 0xff0000)) >> 8;
				}
				is[i_1213_++] = i_1278_;
			    }
			    i_1213_ += i_1217_;
			    i_1214_ += i_1218_;
			}
		    } else if (i_1209_ == 2) {
			int i_1279_ = i_1210_ >>> 24;
			int i_1280_ = 256 - i_1279_;
			int i_1281_
			    = (i_1210_ & 0xff00ff) * i_1280_ & ~0xff00ff;
			int i_1282_ = (i_1210_ & 0xff00) * i_1280_ & 0xff0000;
			i_1210_ = (i_1281_ | i_1282_) >>> 8;
			for (int i_1283_ = -i_1215_; i_1283_ < 0; i_1283_++) {
			    for (int i_1284_ = -i_1216_; i_1284_ < 0;
				 i_1284_++) {
				int i_1285_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_1214_++]);
				if (i_1285_ != 0) {
				    i_1281_ = ((i_1285_ & 0xff00ff) * i_1279_
					       & ~0xff00ff);
				    i_1282_ = ((i_1285_ & 0xff00) * i_1279_
					       & 0xff0000);
				    is[i_1213_++] = ((i_1281_ | i_1282_)
						     >>> 8) + i_1210_;
				} else
				    i_1213_++;
			    }
			    i_1213_ += i_1217_;
			    i_1214_ += i_1218_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1211_ == 2) {
		    if (i_1209_ == 1) {
			for (int i_1286_ = -i_1215_; i_1286_ < 0; i_1286_++) {
			    for (int i_1287_ = -i_1216_; i_1287_ < 0;
				 i_1287_++) {
				int i_1288_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_1214_++]);
				if (i_1288_ != 0) {
				    int i_1289_ = is[i_1213_];
				    int i_1290_ = i_1288_ + i_1289_;
				    int i_1291_ = ((i_1288_ & 0xff00ff)
						   + (i_1289_ & 0xff00ff));
				    i_1289_
					= ((i_1291_ & 0x1000100)
					   + (i_1290_ - i_1291_ & 0x10000));
				    is[i_1213_++]
					= (i_1290_ - i_1289_
					   | i_1289_ - (i_1289_ >>> 8));
				} else
				    i_1213_++;
			    }
			    i_1213_ += i_1217_;
			    i_1214_ += i_1218_;
			}
		    } else if (i_1209_ == 0) {
			int i_1292_ = (i_1210_ & 0xff0000) >> 16;
			int i_1293_ = (i_1210_ & 0xff00) >> 8;
			int i_1294_ = i_1210_ & 0xff;
			for (int i_1295_ = -i_1215_; i_1295_ < 0; i_1295_++) {
			    for (int i_1296_ = -i_1216_; i_1296_ < 0;
				 i_1296_++) {
				int i_1297_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_1214_++]);
				if (i_1297_ != 0) {
				    int i_1298_
					= ((i_1297_ & 0xff0000) * i_1292_
					   & ~0xffffff);
				    int i_1299_ = ((i_1297_ & 0xff00) * i_1293_
						   & 0xff0000);
				    int i_1300_
					= (i_1297_ & 0xff) * i_1294_ & 0xff00;
				    i_1297_
					= (i_1298_ | i_1299_ | i_1300_) >>> 8;
				    int i_1301_ = is[i_1213_];
				    int i_1302_ = i_1297_ + i_1301_;
				    int i_1303_ = ((i_1297_ & 0xff00ff)
						   + (i_1301_ & 0xff00ff));
				    i_1301_
					= ((i_1303_ & 0x1000100)
					   + (i_1302_ - i_1303_ & 0x10000));
				    is[i_1213_++]
					= (i_1302_ - i_1301_
					   | i_1301_ - (i_1301_ >>> 8));
				} else
				    i_1213_++;
			    }
			    i_1213_ += i_1217_;
			    i_1214_ += i_1218_;
			}
		    } else if (i_1209_ == 3) {
			for (int i_1304_ = -i_1215_; i_1304_ < 0; i_1304_++) {
			    for (int i_1305_ = -i_1216_; i_1305_ < 0;
				 i_1305_++) {
				int i_1306_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_1214_++]);
				int i_1307_ = i_1306_ + i_1210_;
				int i_1308_ = ((i_1306_ & 0xff00ff)
					       + (i_1210_ & 0xff00ff));
				int i_1309_
				    = ((i_1308_ & 0x1000100)
				       + (i_1307_ - i_1308_ & 0x10000));
				i_1306_
				    = i_1307_ - i_1309_ | i_1309_ - (i_1309_
								     >>> 8);
				i_1309_ = is[i_1213_];
				i_1307_ = i_1306_ + i_1309_;
				i_1308_ = (i_1306_ & 0xff00ff) + (i_1309_
								  & 0xff00ff);
				i_1309_ = ((i_1308_ & 0x1000100)
					   + (i_1307_ - i_1308_ & 0x10000));
				is[i_1213_++]
				    = i_1307_ - i_1309_ | i_1309_ - (i_1309_
								     >>> 8);
			    }
			    i_1213_ += i_1217_;
			    i_1214_ += i_1218_;
			}
		    } else if (i_1209_ == 2) {
			int i_1310_ = i_1210_ >>> 24;
			int i_1311_ = 256 - i_1310_;
			int i_1312_
			    = (i_1210_ & 0xff00ff) * i_1311_ & ~0xff00ff;
			int i_1313_ = (i_1210_ & 0xff00) * i_1311_ & 0xff0000;
			i_1210_ = (i_1312_ | i_1313_) >>> 8;
			for (int i_1314_ = -i_1215_; i_1314_ < 0; i_1314_++) {
			    for (int i_1315_ = -i_1216_; i_1315_ < 0;
				 i_1315_++) {
				int i_1316_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308[i_1214_++]);
				if (i_1316_ != 0) {
				    i_1312_ = ((i_1316_ & 0xff00ff) * i_1310_
					       & ~0xff00ff);
				    i_1313_ = ((i_1316_ & 0xff00) * i_1310_
					       & 0xff0000);
				    i_1316_ = (((i_1312_ | i_1313_) >>> 8)
					       + i_1210_);
				    int i_1317_ = is[i_1213_];
				    int i_1318_ = i_1316_ + i_1317_;
				    int i_1319_ = ((i_1316_ & 0xff00ff)
						   + (i_1317_ & 0xff00ff));
				    i_1317_
					= ((i_1319_ & 0x1000100)
					   + (i_1318_ - i_1319_ & 0x10000));
				    is[i_1213_++]
					= (i_1318_ - i_1317_
					   | i_1317_ - (i_1317_ >>> 8));
				} else
				    i_1213_++;
			    }
			    i_1213_ += i_1217_;
			    i_1214_ += i_1218_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method10365(int i, int i_1320_, int i_1321_, int i_1322_, int[] is,
		     int i_1323_, int i_1324_) {
	i_1324_ -= i_1321_;
	for (int i_1325_ = 0; i_1325_ < i_1322_; i_1325_++) {
	    int i_1326_ = (i_1320_ + i_1325_) * i_1321_ + i;
	    for (int i_1327_ = 0; i_1327_ < i_1321_; i_1327_++)
		is[i_1323_++] = (((Class151_Sub1_Sub2) this).anIntArray11308
				 [i_1326_ + i_1327_]);
	    i_1323_ += i_1324_;
	}
    }
    
    void method1797(int i, int i_1328_, int i_1329_, int i_1330_, int i_1331_,
		    int i_1332_, int i_1333_, int i_1334_) {
	if (((Class151_Sub1_Sub2) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	if (i_1329_ > 0 && i_1330_ > 0) {
	    int[] is = (((Class173_Sub3)
			 ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
			.anIntArray9719);
	    if (is != null) {
		int i_1335_ = 0;
		int i_1336_ = 0;
		int i_1337_
		    = (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					 .aClass173_Sub3_8814)).anInt9735
		       * 111437289);
		int i_1338_ = (((Class151_Sub1_Sub2) this).anInt8806
			       + ((Class151_Sub1_Sub2) this).anInt8803
			       + ((Class151_Sub1_Sub2) this).anInt8832);
		int i_1339_ = (((Class151_Sub1_Sub2) this).anInt8819
			       + ((Class151_Sub1_Sub2) this).anInt8804
			       + ((Class151_Sub1_Sub2) this).anInt8808);
		int i_1340_ = (i_1338_ << 16) / i_1329_;
		int i_1341_ = (i_1339_ << 16) / i_1330_;
		if (((Class151_Sub1_Sub2) this).anInt8806 > 0) {
		    int i_1342_
			= (((((Class151_Sub1_Sub2) this).anInt8806 << 16)
			    + i_1340_ - 1)
			   / i_1340_);
		    i += i_1342_;
		    i_1335_
			+= (i_1342_ * i_1340_
			    - (((Class151_Sub1_Sub2) this).anInt8806 << 16));
		}
		if (((Class151_Sub1_Sub2) this).anInt8819 > 0) {
		    int i_1343_
			= (((((Class151_Sub1_Sub2) this).anInt8819 << 16)
			    + i_1341_ - 1)
			   / i_1341_);
		    i_1328_ += i_1343_;
		    i_1336_
			+= (i_1343_ * i_1341_
			    - (((Class151_Sub1_Sub2) this).anInt8819 << 16));
		}
		if (((Class151_Sub1_Sub2) this).anInt8803 < i_1338_)
		    i_1329_ = ((((Class151_Sub1_Sub2) this).anInt8803 << 16)
			       - i_1335_ + i_1340_ - 1) / i_1340_;
		if (((Class151_Sub1_Sub2) this).anInt8804 < i_1339_)
		    i_1330_ = ((((Class151_Sub1_Sub2) this).anInt8804 << 16)
			       - i_1336_ + i_1341_ - 1) / i_1341_;
		int i_1344_ = i + i_1328_ * i_1337_;
		int i_1345_ = i_1337_ - i_1329_;
		if (i_1328_ + i_1330_
		    > (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					 .aClass173_Sub3_8814)).anInt9726
		       * 6965409))
		    i_1330_
			-= (i_1328_ + i_1330_
			    - (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						 .aClass173_Sub3_8814))
			       .anInt9726) * 6965409);
		if (i_1328_ < (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						 .aClass173_Sub3_8814))
			       .anInt9725) * 592117349) {
		    int i_1346_
			= ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					      .aClass173_Sub3_8814)).anInt9725
			    * 592117349)
			   - i_1328_);
		    i_1330_ -= i_1346_;
		    i_1344_ += i_1346_ * i_1337_;
		    i_1336_ += i_1341_ * i_1346_;
		}
		if (i + i_1329_
		    > (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					 .aClass173_Sub3_8814)).anInt9724
		       * 630968029)) {
		    int i_1347_
			= (i + i_1329_
			   - (((Class173_Sub3)
			       ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
			      .anInt9724) * 630968029);
		    i_1329_ -= i_1347_;
		    i_1345_ += i_1347_;
		}
		if (i < (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					   .aClass173_Sub3_8814)).anInt9723
			 * -993497119)) {
		    int i_1348_
			= ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					      .aClass173_Sub3_8814)).anInt9723
			    * -993497119)
			   - i);
		    i_1329_ -= i_1348_;
		    i_1344_ += i_1348_;
		    i_1335_ += i_1340_ * i_1348_;
		    i_1345_ += i_1348_;
		}
		if (i_1333_ == 0) {
		    if (i_1331_ == 1) {
			int i_1349_ = i_1335_;
			for (int i_1350_ = -i_1330_; i_1350_ < 0; i_1350_++) {
			    int i_1351_
				= ((i_1336_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_1352_ = -i_1329_; i_1352_ < 0;
				 i_1352_++) {
				is[i_1344_++] = (((Class151_Sub1_Sub2) this)
						 .anIntArray11308
						 [(i_1335_ >> 16) + i_1351_]);
				i_1335_ += i_1340_;
			    }
			    i_1336_ += i_1341_;
			    i_1335_ = i_1349_;
			    i_1344_ += i_1345_;
			}
		    } else if (i_1331_ == 0) {
			int i_1353_ = (i_1332_ & 0xff0000) >> 16;
			int i_1354_ = (i_1332_ & 0xff00) >> 8;
			int i_1355_ = i_1332_ & 0xff;
			int i_1356_ = i_1335_;
			for (int i_1357_ = -i_1330_; i_1357_ < 0; i_1357_++) {
			    int i_1358_
				= ((i_1336_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_1359_ = -i_1329_; i_1359_ < 0;
				 i_1359_++) {
				int i_1360_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308
					       [(i_1335_ >> 16) + i_1358_]);
				int i_1361_ = ((i_1360_ & 0xff0000) * i_1353_
					       & ~0xffffff);
				int i_1362_
				    = (i_1360_ & 0xff00) * i_1354_ & 0xff0000;
				int i_1363_
				    = (i_1360_ & 0xff) * i_1355_ & 0xff00;
				is[i_1344_++]
				    = (i_1361_ | i_1362_ | i_1363_) >>> 8;
				i_1335_ += i_1340_;
			    }
			    i_1336_ += i_1341_;
			    i_1335_ = i_1356_;
			    i_1344_ += i_1345_;
			}
		    } else if (i_1331_ == 3) {
			int i_1364_ = i_1335_;
			for (int i_1365_ = -i_1330_; i_1365_ < 0; i_1365_++) {
			    int i_1366_
				= ((i_1336_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_1367_ = -i_1329_; i_1367_ < 0;
				 i_1367_++) {
				int i_1368_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308
					       [(i_1335_ >> 16) + i_1366_]);
				int i_1369_ = i_1368_ + i_1332_;
				int i_1370_ = ((i_1368_ & 0xff00ff)
					       + (i_1332_ & 0xff00ff));
				int i_1371_
				    = ((i_1370_ & 0x1000100)
				       + (i_1369_ - i_1370_ & 0x10000));
				is[i_1344_++]
				    = i_1369_ - i_1371_ | i_1371_ - (i_1371_
								     >>> 8);
				i_1335_ += i_1340_;
			    }
			    i_1336_ += i_1341_;
			    i_1335_ = i_1364_;
			    i_1344_ += i_1345_;
			}
		    } else if (i_1331_ == 2) {
			int i_1372_ = i_1332_ >>> 24;
			int i_1373_ = 256 - i_1372_;
			int i_1374_
			    = (i_1332_ & 0xff00ff) * i_1373_ & ~0xff00ff;
			int i_1375_ = (i_1332_ & 0xff00) * i_1373_ & 0xff0000;
			i_1332_ = (i_1374_ | i_1375_) >>> 8;
			int i_1376_ = i_1335_;
			for (int i_1377_ = -i_1330_; i_1377_ < 0; i_1377_++) {
			    int i_1378_
				= ((i_1336_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_1379_ = -i_1329_; i_1379_ < 0;
				 i_1379_++) {
				int i_1380_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308
					       [(i_1335_ >> 16) + i_1378_]);
				i_1374_ = ((i_1380_ & 0xff00ff) * i_1372_
					   & ~0xff00ff);
				i_1375_
				    = (i_1380_ & 0xff00) * i_1372_ & 0xff0000;
				is[i_1344_++]
				    = ((i_1374_ | i_1375_) >>> 8) + i_1332_;
				i_1335_ += i_1340_;
			    }
			    i_1336_ += i_1341_;
			    i_1335_ = i_1376_;
			    i_1344_ += i_1345_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1333_ == 1) {
		    if (i_1331_ == 1) {
			int i_1381_ = i_1335_;
			for (int i_1382_ = -i_1330_; i_1382_ < 0; i_1382_++) {
			    int i_1383_
				= ((i_1336_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_1384_ = -i_1329_; i_1384_ < 0;
				 i_1384_++) {
				int i_1385_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308
					       [(i_1335_ >> 16) + i_1383_]);
				if (i_1385_ != 0)
				    is[i_1344_++] = i_1385_;
				else
				    i_1344_++;
				i_1335_ += i_1340_;
			    }
			    i_1336_ += i_1341_;
			    i_1335_ = i_1381_;
			    i_1344_ += i_1345_;
			}
		    } else if (i_1331_ == 0) {
			int i_1386_ = i_1335_;
			if ((i_1332_ & 0xffffff) == 16777215) {
			    int i_1387_ = i_1332_ >>> 24;
			    int i_1388_ = 256 - i_1387_;
			    for (int i_1389_ = -i_1330_; i_1389_ < 0;
				 i_1389_++) {
				int i_1390_ = ((i_1336_ >> 16)
					       * (((Class151_Sub1_Sub2) this)
						  .anInt8803));
				for (int i_1391_ = -i_1329_; i_1391_ < 0;
				     i_1391_++) {
				    int i_1392_
					= (((Class151_Sub1_Sub2) this)
					   .anIntArray11308
					   [(i_1335_ >> 16) + i_1390_]);
				    if (i_1392_ != 0) {
					int i_1393_ = is[i_1344_];
					is[i_1344_++]
					    = ((((i_1392_ & 0xff00ff) * i_1387_
						 + ((i_1393_ & 0xff00ff)
						    * i_1388_))
						& ~0xff00ff)
					       + (((i_1392_ & 0xff00) * i_1387_
						   + ((i_1393_ & 0xff00)
						      * i_1388_))
						  & 0xff0000)) >> 8;
				    } else
					i_1344_++;
				    i_1335_ += i_1340_;
				}
				i_1336_ += i_1341_;
				i_1335_ = i_1386_;
				i_1344_ += i_1345_;
			    }
			} else {
			    int i_1394_ = (i_1332_ & 0xff0000) >> 16;
			    int i_1395_ = (i_1332_ & 0xff00) >> 8;
			    int i_1396_ = i_1332_ & 0xff;
			    int i_1397_ = i_1332_ >>> 24;
			    int i_1398_ = 256 - i_1397_;
			    for (int i_1399_ = -i_1330_; i_1399_ < 0;
				 i_1399_++) {
				int i_1400_ = ((i_1336_ >> 16)
					       * (((Class151_Sub1_Sub2) this)
						  .anInt8803));
				for (int i_1401_ = -i_1329_; i_1401_ < 0;
				     i_1401_++) {
				    int i_1402_
					= (((Class151_Sub1_Sub2) this)
					   .anIntArray11308
					   [(i_1335_ >> 16) + i_1400_]);
				    if (i_1402_ != 0) {
					if (i_1397_ != 255) {
					    int i_1403_
						= (((i_1402_ & 0xff0000)
						    * i_1394_)
						   & ~0xffffff);
					    int i_1404_
						= ((i_1402_ & 0xff00) * i_1395_
						   & 0xff0000);
					    int i_1405_
						= ((i_1402_ & 0xff) * i_1396_
						   & 0xff00);
					    i_1402_ = (i_1403_ | i_1404_
						       | i_1405_) >>> 8;
					    int i_1406_ = is[i_1344_];
					    is[i_1344_++]
						= (((((i_1402_ & 0xff00ff)
						      * i_1397_)
						     + ((i_1406_ & 0xff00ff)
							* i_1398_))
						    & ~0xff00ff)
						   + ((((i_1402_ & 0xff00)
							* i_1397_)
						       + ((i_1406_ & 0xff00)
							  * i_1398_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1407_
						= (((i_1402_ & 0xff0000)
						    * i_1394_)
						   & ~0xffffff);
					    int i_1408_
						= ((i_1402_ & 0xff00) * i_1395_
						   & 0xff0000);
					    int i_1409_
						= ((i_1402_ & 0xff) * i_1396_
						   & 0xff00);
					    is[i_1344_++] = (i_1407_ | i_1408_
							     | i_1409_) >>> 8;
					}
				    } else
					i_1344_++;
				    i_1335_ += i_1340_;
				}
				i_1336_ += i_1341_;
				i_1335_ = i_1386_;
				i_1344_ += i_1345_;
			    }
			}
		    } else if (i_1331_ == 3) {
			int i_1410_ = i_1335_;
			int i_1411_ = i_1332_ >>> 24;
			int i_1412_ = 256 - i_1411_;
			for (int i_1413_ = -i_1330_; i_1413_ < 0; i_1413_++) {
			    int i_1414_
				= ((i_1336_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_1415_ = -i_1329_; i_1415_ < 0;
				 i_1415_++) {
				int i_1416_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308
					       [(i_1335_ >> 16) + i_1414_]);
				int i_1417_ = i_1416_ + i_1332_;
				int i_1418_ = ((i_1416_ & 0xff00ff)
					       + (i_1332_ & 0xff00ff));
				int i_1419_
				    = ((i_1418_ & 0x1000100)
				       + (i_1417_ - i_1418_ & 0x10000));
				i_1419_
				    = i_1417_ - i_1419_ | i_1419_ - (i_1419_
								     >>> 8);
				if (i_1416_ == 0 && i_1411_ != 255) {
				    i_1416_ = i_1419_;
				    i_1419_ = is[i_1344_];
				    i_1419_
					= ((((i_1416_ & 0xff00ff) * i_1411_
					     + (i_1419_ & 0xff00ff) * i_1412_)
					    & ~0xff00ff)
					   + (((i_1416_ & 0xff00) * i_1411_
					       + (i_1419_ & 0xff00) * i_1412_)
					      & 0xff0000)) >> 8;
				}
				is[i_1344_++] = i_1419_;
				i_1335_ += i_1340_;
			    }
			    i_1336_ += i_1341_;
			    i_1335_ = i_1410_;
			    i_1344_ += i_1345_;
			}
		    } else if (i_1331_ == 2) {
			int i_1420_ = i_1332_ >>> 24;
			int i_1421_ = 256 - i_1420_;
			int i_1422_
			    = (i_1332_ & 0xff00ff) * i_1421_ & ~0xff00ff;
			int i_1423_ = (i_1332_ & 0xff00) * i_1421_ & 0xff0000;
			i_1332_ = (i_1422_ | i_1423_) >>> 8;
			int i_1424_ = i_1335_;
			for (int i_1425_ = -i_1330_; i_1425_ < 0; i_1425_++) {
			    int i_1426_
				= ((i_1336_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_1427_ = -i_1329_; i_1427_ < 0;
				 i_1427_++) {
				int i_1428_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308
					       [(i_1335_ >> 16) + i_1426_]);
				if (i_1428_ != 0) {
				    i_1422_ = ((i_1428_ & 0xff00ff) * i_1420_
					       & ~0xff00ff);
				    i_1423_ = ((i_1428_ & 0xff00) * i_1420_
					       & 0xff0000);
				    is[i_1344_++] = ((i_1422_ | i_1423_)
						     >>> 8) + i_1332_;
				} else
				    i_1344_++;
				i_1335_ += i_1340_;
			    }
			    i_1336_ += i_1341_;
			    i_1335_ = i_1424_;
			    i_1344_ += i_1345_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1333_ == 2) {
		    if (i_1331_ == 1) {
			int i_1429_ = i_1335_;
			for (int i_1430_ = -i_1330_; i_1430_ < 0; i_1430_++) {
			    int i_1431_
				= ((i_1336_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_1432_ = -i_1329_; i_1432_ < 0;
				 i_1432_++) {
				int i_1433_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308
					       [(i_1335_ >> 16) + i_1431_]);
				if (i_1433_ != 0) {
				    int i_1434_ = is[i_1344_];
				    int i_1435_ = i_1433_ + i_1434_;
				    int i_1436_ = ((i_1433_ & 0xff00ff)
						   + (i_1434_ & 0xff00ff));
				    i_1434_
					= ((i_1436_ & 0x1000100)
					   + (i_1435_ - i_1436_ & 0x10000));
				    is[i_1344_++]
					= (i_1435_ - i_1434_
					   | i_1434_ - (i_1434_ >>> 8));
				} else
				    i_1344_++;
				i_1335_ += i_1340_;
			    }
			    i_1336_ += i_1341_;
			    i_1335_ = i_1429_;
			    i_1344_ += i_1345_;
			}
		    } else if (i_1331_ == 0) {
			int i_1437_ = i_1335_;
			int i_1438_ = (i_1332_ & 0xff0000) >> 16;
			int i_1439_ = (i_1332_ & 0xff00) >> 8;
			int i_1440_ = i_1332_ & 0xff;
			for (int i_1441_ = -i_1330_; i_1441_ < 0; i_1441_++) {
			    int i_1442_
				= ((i_1336_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_1443_ = -i_1329_; i_1443_ < 0;
				 i_1443_++) {
				int i_1444_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308
					       [(i_1335_ >> 16) + i_1442_]);
				if (i_1444_ != 0) {
				    int i_1445_
					= ((i_1444_ & 0xff0000) * i_1438_
					   & ~0xffffff);
				    int i_1446_ = ((i_1444_ & 0xff00) * i_1439_
						   & 0xff0000);
				    int i_1447_
					= (i_1444_ & 0xff) * i_1440_ & 0xff00;
				    i_1444_
					= (i_1445_ | i_1446_ | i_1447_) >>> 8;
				    int i_1448_ = is[i_1344_];
				    int i_1449_ = i_1444_ + i_1448_;
				    int i_1450_ = ((i_1444_ & 0xff00ff)
						   + (i_1448_ & 0xff00ff));
				    i_1448_
					= ((i_1450_ & 0x1000100)
					   + (i_1449_ - i_1450_ & 0x10000));
				    is[i_1344_++]
					= (i_1449_ - i_1448_
					   | i_1448_ - (i_1448_ >>> 8));
				} else
				    i_1344_++;
				i_1335_ += i_1340_;
			    }
			    i_1336_ += i_1341_;
			    i_1335_ = i_1437_;
			    i_1344_ += i_1345_;
			}
		    } else if (i_1331_ == 3) {
			int i_1451_ = i_1335_;
			for (int i_1452_ = -i_1330_; i_1452_ < 0; i_1452_++) {
			    int i_1453_
				= ((i_1336_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_1454_ = -i_1329_; i_1454_ < 0;
				 i_1454_++) {
				int i_1455_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308
					       [(i_1335_ >> 16) + i_1453_]);
				int i_1456_ = i_1455_ + i_1332_;
				int i_1457_ = ((i_1455_ & 0xff00ff)
					       + (i_1332_ & 0xff00ff));
				int i_1458_
				    = ((i_1457_ & 0x1000100)
				       + (i_1456_ - i_1457_ & 0x10000));
				i_1455_
				    = i_1456_ - i_1458_ | i_1458_ - (i_1458_
								     >>> 8);
				i_1458_ = is[i_1344_];
				i_1456_ = i_1455_ + i_1458_;
				i_1457_ = (i_1455_ & 0xff00ff) + (i_1458_
								  & 0xff00ff);
				i_1458_ = ((i_1457_ & 0x1000100)
					   + (i_1456_ - i_1457_ & 0x10000));
				is[i_1344_++]
				    = i_1456_ - i_1458_ | i_1458_ - (i_1458_
								     >>> 8);
				i_1335_ += i_1340_;
			    }
			    i_1336_ += i_1341_;
			    i_1335_ = i_1451_;
			    i_1344_ += i_1345_;
			}
		    } else if (i_1331_ == 2) {
			int i_1459_ = i_1332_ >>> 24;
			int i_1460_ = 256 - i_1459_;
			int i_1461_
			    = (i_1332_ & 0xff00ff) * i_1460_ & ~0xff00ff;
			int i_1462_ = (i_1332_ & 0xff00) * i_1460_ & 0xff0000;
			i_1332_ = (i_1461_ | i_1462_) >>> 8;
			int i_1463_ = i_1335_;
			for (int i_1464_ = -i_1330_; i_1464_ < 0; i_1464_++) {
			    int i_1465_
				= ((i_1336_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_1466_ = -i_1329_; i_1466_ < 0;
				 i_1466_++) {
				int i_1467_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308
					       [(i_1335_ >> 16) + i_1465_]);
				if (i_1467_ != 0) {
				    i_1461_ = ((i_1467_ & 0xff00ff) * i_1459_
					       & ~0xff00ff);
				    i_1462_ = ((i_1467_ & 0xff00) * i_1459_
					       & 0xff0000);
				    i_1467_ = (((i_1461_ | i_1462_) >>> 8)
					       + i_1332_);
				    int i_1468_ = is[i_1344_];
				    int i_1469_ = i_1467_ + i_1468_;
				    int i_1470_ = ((i_1467_ & 0xff00ff)
						   + (i_1468_ & 0xff00ff));
				    i_1468_
					= ((i_1470_ & 0x1000100)
					   + (i_1469_ - i_1470_ & 0x10000));
				    is[i_1344_++]
					= (i_1469_ - i_1468_
					   | i_1468_ - (i_1468_ >>> 8));
				} else
				    i_1344_++;
				i_1335_ += i_1340_;
			    }
			    i_1336_ += i_1341_;
			    i_1335_ = i_1463_;
			    i_1344_ += i_1345_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method8290(boolean bool, boolean bool_1471_, boolean bool_1472_,
		    int i, int i_1473_, float f, int i_1474_, int i_1475_,
		    int i_1476_, int i_1477_, int i_1478_, int i_1479_,
		    boolean bool_1480_) {
	if (i_1474_ > 0 && i_1475_ > 0 && (bool || bool_1471_)) {
	    int i_1481_ = 0;
	    int i_1482_ = 0;
	    int i_1483_ = (((Class151_Sub1_Sub2) this).anInt8806
			   + ((Class151_Sub1_Sub2) this).anInt8803
			   + ((Class151_Sub1_Sub2) this).anInt8832);
	    int i_1484_ = (((Class151_Sub1_Sub2) this).anInt8819
			   + ((Class151_Sub1_Sub2) this).anInt8804
			   + ((Class151_Sub1_Sub2) this).anInt8808);
	    int i_1485_ = (i_1483_ << 16) / i_1474_;
	    int i_1486_ = (i_1484_ << 16) / i_1475_;
	    if (((Class151_Sub1_Sub2) this).anInt8806 > 0) {
		int i_1487_ = (((((Class151_Sub1_Sub2) this).anInt8806 << 16)
				+ i_1485_ - 1)
			       / i_1485_);
		i += i_1487_;
		i_1481_ += (i_1487_ * i_1485_
			    - (((Class151_Sub1_Sub2) this).anInt8806 << 16));
	    }
	    if (((Class151_Sub1_Sub2) this).anInt8819 > 0) {
		int i_1488_ = (((((Class151_Sub1_Sub2) this).anInt8819 << 16)
				+ i_1486_ - 1)
			       / i_1486_);
		i_1473_ += i_1488_;
		i_1482_ += (i_1488_ * i_1486_
			    - (((Class151_Sub1_Sub2) this).anInt8819 << 16));
	    }
	    if (((Class151_Sub1_Sub2) this).anInt8803 < i_1483_)
		i_1474_ = ((((Class151_Sub1_Sub2) this).anInt8803 << 16)
			   - i_1481_ + i_1485_ - 1) / i_1485_;
	    if (((Class151_Sub1_Sub2) this).anInt8804 < i_1484_)
		i_1475_ = ((((Class151_Sub1_Sub2) this).anInt8804 << 16)
			   - i_1482_ + i_1486_ - 1) / i_1486_;
	    int i_1489_
		= i + i_1473_ * ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						    .aClass173_Sub3_8814))
				  .anInt9735)
				 * 111437289);
	    int i_1490_ = ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					      .aClass173_Sub3_8814)).anInt9735
			    * 111437289)
			   - i_1474_);
	    if (i_1473_ + i_1475_
		> ((Class173_Sub3) (((Class151_Sub1_Sub2) this)
				    .aClass173_Sub3_8814)).anInt9726 * 6965409)
		i_1475_ -= (i_1473_ + i_1475_
			    - (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						 .aClass173_Sub3_8814))
			       .anInt9726) * 6965409);
	    if (i_1473_ < (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
					     .aClass173_Sub3_8814)).anInt9725
			   * 592117349)) {
		int i_1491_ = ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						  .aClass173_Sub3_8814))
				.anInt9725) * 592117349
			       - i_1473_);
		i_1475_ -= i_1491_;
		i_1489_ += i_1491_ * (((Class173_Sub3)
				       (((Class151_Sub1_Sub2) this)
					.aClass173_Sub3_8814)).anInt9735
				      * 111437289);
		i_1482_ += i_1486_ * i_1491_;
	    }
	    if (i + i_1474_ > (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						 .aClass173_Sub3_8814))
			       .anInt9724) * 630968029) {
		int i_1492_ = (i + i_1474_
			       - (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						    .aClass173_Sub3_8814))
				  .anInt9724) * 630968029);
		i_1474_ -= i_1492_;
		i_1490_ += i_1492_;
	    }
	    if (i < (((Class173_Sub3) (((Class151_Sub1_Sub2) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119)) {
		int i_1493_ = ((((Class173_Sub3) (((Class151_Sub1_Sub2) this)
						  .aClass173_Sub3_8814))
				.anInt9723) * -993497119
			       - i);
		i_1474_ -= i_1493_;
		i_1489_ += i_1493_;
		i_1481_ += i_1485_ * i_1493_;
		i_1490_ += i_1493_;
	    }
	    float[] fs = (((Class173_Sub3)
			   ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
			  .aFloatArray9716);
	    int[] is = (((Class173_Sub3)
			 ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
			.anIntArray9719);
	    if (i_1478_ == 0) {
		if (i_1476_ == 1) {
		    int i_1494_ = i_1481_;
		    for (int i_1495_ = -i_1475_; i_1495_ < 0; i_1495_++) {
			int i_1496_
			    = ((i_1482_ >> 16)
			       * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_1497_ = -i_1474_; i_1497_ < 0; i_1497_++) {
			    if (!bool_1471_ || f < fs[i_1489_]) {
				if (bool)
				    is[i_1489_]
					= (((Class151_Sub1_Sub2) this)
					   .anIntArray11308
					   [(i_1481_ >> 16) + i_1496_]);
				if (bool_1471_ && bool_1480_)
				    fs[i_1489_] = f;
			    }
			    i_1481_ += i_1485_;
			    i_1489_++;
			}
			i_1482_ += i_1486_;
			i_1481_ = i_1494_;
			i_1489_ += i_1490_;
		    }
		} else if (i_1476_ == 0) {
		    int i_1498_ = (i_1477_ & 0xff0000) >> 16;
		    int i_1499_ = (i_1477_ & 0xff00) >> 8;
		    int i_1500_ = i_1477_ & 0xff;
		    int i_1501_ = i_1481_;
		    for (int i_1502_ = -i_1475_; i_1502_ < 0; i_1502_++) {
			int i_1503_
			    = ((i_1482_ >> 16)
			       * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_1504_ = -i_1474_; i_1504_ < 0; i_1504_++) {
			    if (!bool_1471_ || f < fs[i_1489_]) {
				if (bool) {
				    int i_1505_
					= (((Class151_Sub1_Sub2) this)
					   .anIntArray11308
					   [(i_1481_ >> 16) + i_1503_]);
				    int i_1506_
					= ((i_1505_ & 0xff0000) * i_1498_
					   & ~0xffffff);
				    int i_1507_ = ((i_1505_ & 0xff00) * i_1499_
						   & 0xff0000);
				    int i_1508_
					= (i_1505_ & 0xff) * i_1500_ & 0xff00;
				    is[i_1489_]
					= (i_1506_ | i_1507_ | i_1508_) >>> 8;
				}
				if (bool_1471_ && bool_1480_)
				    fs[i_1489_] = f;
			    }
			    i_1481_ += i_1485_;
			    i_1489_++;
			}
			i_1482_ += i_1486_;
			i_1481_ = i_1501_;
			i_1489_ += i_1490_;
		    }
		} else if (i_1476_ == 3) {
		    int i_1509_ = i_1481_;
		    for (int i_1510_ = -i_1475_; i_1510_ < 0; i_1510_++) {
			int i_1511_
			    = ((i_1482_ >> 16)
			       * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_1512_ = -i_1474_; i_1512_ < 0; i_1512_++) {
			    if (!bool_1471_ || f < fs[i_1489_]) {
				if (bool) {
				    int i_1513_
					= (((Class151_Sub1_Sub2) this)
					   .anIntArray11308
					   [(i_1481_ >> 16) + i_1511_]);
				    int i_1514_ = i_1513_ + i_1477_;
				    int i_1515_ = ((i_1513_ & 0xff00ff)
						   + (i_1477_ & 0xff00ff));
				    int i_1516_
					= ((i_1515_ & 0x1000100)
					   + (i_1514_ - i_1515_ & 0x10000));
				    is[i_1489_]
					= (i_1514_ - i_1516_
					   | i_1516_ - (i_1516_ >>> 8));
				}
				if (bool_1471_ && bool_1480_)
				    fs[i_1489_] = f;
			    }
			    i_1481_ += i_1485_;
			    i_1489_++;
			}
			i_1482_ += i_1486_;
			i_1481_ = i_1509_;
			i_1489_ += i_1490_;
		    }
		} else if (i_1476_ == 2) {
		    int i_1517_ = i_1477_ >>> 24;
		    int i_1518_ = 256 - i_1517_;
		    int i_1519_ = (i_1477_ & 0xff00ff) * i_1518_ & ~0xff00ff;
		    int i_1520_ = (i_1477_ & 0xff00) * i_1518_ & 0xff0000;
		    i_1477_ = (i_1519_ | i_1520_) >>> 8;
		    int i_1521_ = i_1481_;
		    for (int i_1522_ = -i_1475_; i_1522_ < 0; i_1522_++) {
			int i_1523_
			    = ((i_1482_ >> 16)
			       * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_1524_ = -i_1474_; i_1524_ < 0; i_1524_++) {
			    if (!bool_1471_ || f < fs[i_1489_]) {
				if (bool) {
				    int i_1525_
					= (((Class151_Sub1_Sub2) this)
					   .anIntArray11308
					   [(i_1481_ >> 16) + i_1523_]);
				    i_1519_ = ((i_1525_ & 0xff00ff) * i_1517_
					       & ~0xff00ff);
				    i_1520_ = ((i_1525_ & 0xff00) * i_1517_
					       & 0xff0000);
				    is[i_1489_] = (((i_1519_ | i_1520_) >>> 8)
						   + i_1477_);
				}
				if (bool_1471_ && bool_1480_)
				    fs[i_1489_] = f;
			    }
			    i_1481_ += i_1485_;
			    i_1489_++;
			}
			i_1482_ += i_1486_;
			i_1481_ = i_1521_;
			i_1489_ += i_1490_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1478_ == 1) {
		if (i_1476_ == 1) {
		    int i_1526_ = i_1481_;
		    for (int i_1527_ = -i_1475_; i_1527_ < 0; i_1527_++) {
			int i_1528_
			    = ((i_1482_ >> 16)
			       * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_1529_ = -i_1474_; i_1529_ < 0; i_1529_++) {
			    if (!bool_1471_ || f < fs[i_1489_]) {
				int i_1530_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308
					       [(i_1481_ >> 16) + i_1528_]);
				if (i_1530_ != 0) {
				    if (bool)
					is[i_1489_] = i_1530_;
				    if (bool_1471_ && bool_1480_)
					fs[i_1489_] = f;
				}
			    }
			    i_1481_ += i_1485_;
			    i_1489_++;
			}
			i_1482_ += i_1486_;
			i_1481_ = i_1526_;
			i_1489_ += i_1490_;
		    }
		} else if (i_1476_ == 0) {
		    int i_1531_ = i_1481_;
		    if ((i_1477_ & 0xffffff) == 16777215) {
			int i_1532_ = i_1477_ >>> 24;
			int i_1533_ = 256 - i_1532_;
			for (int i_1534_ = -i_1475_; i_1534_ < 0; i_1534_++) {
			    int i_1535_
				= ((i_1482_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_1536_ = -i_1474_; i_1536_ < 0;
				 i_1536_++) {
				if (!bool_1471_ || f < fs[i_1489_]) {
				    int i_1537_
					= (((Class151_Sub1_Sub2) this)
					   .anIntArray11308
					   [(i_1481_ >> 16) + i_1535_]);
				    if (i_1537_ != 0) {
					if (bool) {
					    int i_1538_ = is[i_1489_];
					    is[i_1489_]
						= (((((i_1537_ & 0xff00ff)
						      * i_1532_)
						     + ((i_1538_ & 0xff00ff)
							* i_1533_))
						    & ~0xff00ff)
						   + ((((i_1537_ & 0xff00)
							* i_1532_)
						       + ((i_1538_ & 0xff00)
							  * i_1533_))
						      & 0xff0000)) >> 8;
					}
					if (bool_1471_ && bool_1480_)
					    fs[i_1489_] = f;
				    }
				}
				i_1481_ += i_1485_;
				i_1489_++;
			    }
			    i_1482_ += i_1486_;
			    i_1481_ = i_1531_;
			    i_1489_ += i_1490_;
			}
		    } else {
			int i_1539_ = (i_1477_ & 0xff0000) >> 16;
			int i_1540_ = (i_1477_ & 0xff00) >> 8;
			int i_1541_ = i_1477_ & 0xff;
			int i_1542_ = i_1477_ >>> 24;
			int i_1543_ = 256 - i_1542_;
			for (int i_1544_ = -i_1475_; i_1544_ < 0; i_1544_++) {
			    int i_1545_
				= ((i_1482_ >> 16)
				   * ((Class151_Sub1_Sub2) this).anInt8803);
			    for (int i_1546_ = -i_1474_; i_1546_ < 0;
				 i_1546_++) {
				if (!bool_1471_ || f < fs[i_1489_]) {
				    int i_1547_
					= (((Class151_Sub1_Sub2) this)
					   .anIntArray11308
					   [(i_1481_ >> 16) + i_1545_]);
				    if (i_1547_ != 0) {
					if (i_1542_ != 255) {
					    if (bool) {
						int i_1548_
						    = (((i_1547_ & 0xff0000)
							* i_1539_)
						       & ~0xffffff);
						int i_1549_
						    = (((i_1547_ & 0xff00)
							* i_1540_)
						       & 0xff0000);
						int i_1550_
						    = (((i_1547_ & 0xff)
							* i_1541_)
						       & 0xff00);
						i_1547_ = (i_1548_ | i_1549_
							   | i_1550_) >>> 8;
						int i_1551_ = is[i_1489_];
						is[i_1489_]
						    = (((((i_1547_ & 0xff00ff)
							  * i_1542_)
							 + ((i_1551_
							     & 0xff00ff)
							    * i_1543_))
							& ~0xff00ff)
						       + ((((i_1547_ & 0xff00)
							    * i_1542_)
							   + ((i_1551_
							       & 0xff00)
							      * i_1543_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_1471_ && bool_1480_)
						fs[i_1489_] = f;
					} else {
					    if (bool) {
						int i_1552_
						    = (((i_1547_ & 0xff0000)
							* i_1539_)
						       & ~0xffffff);
						int i_1553_
						    = (((i_1547_ & 0xff00)
							* i_1540_)
						       & 0xff0000);
						int i_1554_
						    = (((i_1547_ & 0xff)
							* i_1541_)
						       & 0xff00);
						is[i_1489_]
						    = (i_1552_ | i_1553_
						       | i_1554_) >>> 8;
					    }
					    if (bool_1471_ && bool_1480_)
						fs[i_1489_] = f;
					}
				    }
				}
				i_1481_ += i_1485_;
				i_1489_++;
			    }
			    i_1482_ += i_1486_;
			    i_1481_ = i_1531_;
			    i_1489_ += i_1490_;
			}
		    }
		} else if (i_1476_ == 3) {
		    int i_1555_ = i_1481_;
		    int i_1556_ = i_1477_ >>> 24;
		    int i_1557_ = 256 - i_1556_;
		    for (int i_1558_ = -i_1475_; i_1558_ < 0; i_1558_++) {
			int i_1559_
			    = ((i_1482_ >> 16)
			       * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_1560_ = -i_1474_; i_1560_ < 0; i_1560_++) {
			    if (!bool_1471_ || f < fs[i_1489_]) {
				if (bool) {
				    int i_1561_
					= (((Class151_Sub1_Sub2) this)
					   .anIntArray11308
					   [(i_1481_ >> 16) + i_1559_]);
				    int i_1562_ = i_1561_ + i_1477_;
				    int i_1563_ = ((i_1561_ & 0xff00ff)
						   + (i_1477_ & 0xff00ff));
				    int i_1564_
					= ((i_1563_ & 0x1000100)
					   + (i_1562_ - i_1563_ & 0x10000));
				    i_1564_ = (i_1562_ - i_1564_
					       | i_1564_ - (i_1564_ >>> 8));
				    if (i_1561_ == 0 && i_1556_ != 255) {
					i_1561_ = i_1564_;
					i_1564_ = is[i_1489_];
					i_1564_
					    = ((((i_1561_ & 0xff00ff) * i_1556_
						 + ((i_1564_ & 0xff00ff)
						    * i_1557_))
						& ~0xff00ff)
					       + (((i_1561_ & 0xff00) * i_1556_
						   + ((i_1564_ & 0xff00)
						      * i_1557_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_1489_] = i_1564_;
				}
				if (bool_1471_ && bool_1480_)
				    fs[i_1489_] = f;
			    }
			    i_1481_ += i_1485_;
			    i_1489_++;
			}
			i_1482_ += i_1486_;
			i_1481_ = i_1555_;
			i_1489_ += i_1490_;
		    }
		} else if (i_1476_ == 2) {
		    int i_1565_ = i_1477_ >>> 24;
		    int i_1566_ = 256 - i_1565_;
		    int i_1567_ = (i_1477_ & 0xff00ff) * i_1566_ & ~0xff00ff;
		    int i_1568_ = (i_1477_ & 0xff00) * i_1566_ & 0xff0000;
		    i_1477_ = (i_1567_ | i_1568_) >>> 8;
		    int i_1569_ = i_1481_;
		    for (int i_1570_ = -i_1475_; i_1570_ < 0; i_1570_++) {
			int i_1571_
			    = ((i_1482_ >> 16)
			       * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_1572_ = -i_1474_; i_1572_ < 0; i_1572_++) {
			    if (!bool_1471_ || f < fs[i_1489_]) {
				int i_1573_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308
					       [(i_1481_ >> 16) + i_1571_]);
				if (i_1573_ != 0) {
				    if (bool) {
					i_1567_
					    = ((i_1573_ & 0xff00ff) * i_1565_
					       & ~0xff00ff);
					i_1568_ = ((i_1573_ & 0xff00) * i_1565_
						   & 0xff0000);
					is[i_1489_] = ((i_1567_ | i_1568_)
						       >>> 8) + i_1477_;
				    }
				    if (bool_1471_ && bool_1480_)
					fs[i_1489_] = f;
				}
			    }
			    i_1481_ += i_1485_;
			    i_1489_++;
			}
			i_1482_ += i_1486_;
			i_1481_ = i_1569_;
			i_1489_ += i_1490_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1478_ == 2) {
		if (i_1476_ == 1) {
		    int i_1574_ = i_1481_;
		    for (int i_1575_ = -i_1475_; i_1575_ < 0; i_1575_++) {
			int i_1576_
			    = ((i_1482_ >> 16)
			       * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_1577_ = -i_1474_; i_1577_ < 0; i_1577_++) {
			    if (!bool_1471_ || f < fs[i_1489_]) {
				int i_1578_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308
					       [(i_1481_ >> 16) + i_1576_]);
				if (i_1578_ != 0) {
				    if (bool) {
					int i_1579_ = is[i_1489_];
					int i_1580_ = i_1578_ + i_1579_;
					int i_1581_ = ((i_1578_ & 0xff00ff)
						       + (i_1579_ & 0xff00ff));
					i_1579_ = ((i_1581_ & 0x1000100)
						   + (i_1580_ - i_1581_
						      & 0x10000));
					is[i_1489_]
					    = (i_1580_ - i_1579_
					       | i_1579_ - (i_1579_ >>> 8));
				    }
				    if (bool_1471_ && bool_1480_)
					fs[i_1489_] = f;
				}
			    }
			    i_1481_ += i_1485_;
			    i_1489_++;
			}
			i_1482_ += i_1486_;
			i_1481_ = i_1574_;
			i_1489_ += i_1490_;
		    }
		} else if (i_1476_ == 0) {
		    int i_1582_ = i_1481_;
		    int i_1583_ = (i_1477_ & 0xff0000) >> 16;
		    int i_1584_ = (i_1477_ & 0xff00) >> 8;
		    int i_1585_ = i_1477_ & 0xff;
		    for (int i_1586_ = -i_1475_; i_1586_ < 0; i_1586_++) {
			int i_1587_
			    = ((i_1482_ >> 16)
			       * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_1588_ = -i_1474_; i_1588_ < 0; i_1588_++) {
			    if (!bool_1471_ || f < fs[i_1489_]) {
				int i_1589_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308
					       [(i_1481_ >> 16) + i_1587_]);
				if (i_1589_ != 0) {
				    if (bool) {
					int i_1590_
					    = ((i_1589_ & 0xff0000) * i_1583_
					       & ~0xffffff);
					int i_1591_
					    = ((i_1589_ & 0xff00) * i_1584_
					       & 0xff0000);
					int i_1592_
					    = ((i_1589_ & 0xff) * i_1585_
					       & 0xff00);
					i_1589_ = (i_1590_ | i_1591_
						   | i_1592_) >>> 8;
					int i_1593_ = is[i_1489_];
					int i_1594_ = i_1589_ + i_1593_;
					int i_1595_ = ((i_1589_ & 0xff00ff)
						       + (i_1593_ & 0xff00ff));
					i_1593_ = ((i_1595_ & 0x1000100)
						   + (i_1594_ - i_1595_
						      & 0x10000));
					is[i_1489_]
					    = (i_1594_ - i_1593_
					       | i_1593_ - (i_1593_ >>> 8));
				    }
				    if (bool_1471_ && bool_1480_)
					fs[i_1489_] = f;
				}
			    }
			    i_1481_ += i_1485_;
			    i_1489_++;
			}
			i_1482_ += i_1486_;
			i_1481_ = i_1582_;
			i_1489_ += i_1490_;
		    }
		} else if (i_1476_ == 3) {
		    int i_1596_ = i_1481_;
		    for (int i_1597_ = -i_1475_; i_1597_ < 0; i_1597_++) {
			int i_1598_
			    = ((i_1482_ >> 16)
			       * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_1599_ = -i_1474_; i_1599_ < 0; i_1599_++) {
			    if (!bool_1471_ || f < fs[i_1489_]) {
				if (bool) {
				    int i_1600_
					= (((Class151_Sub1_Sub2) this)
					   .anIntArray11308
					   [(i_1481_ >> 16) + i_1598_]);
				    int i_1601_ = i_1600_ + i_1477_;
				    int i_1602_ = ((i_1600_ & 0xff00ff)
						   + (i_1477_ & 0xff00ff));
				    int i_1603_
					= ((i_1602_ & 0x1000100)
					   + (i_1601_ - i_1602_ & 0x10000));
				    i_1600_ = (i_1601_ - i_1603_
					       | i_1603_ - (i_1603_ >>> 8));
				    i_1603_ = is[i_1489_];
				    i_1601_ = i_1600_ + i_1603_;
				    i_1602_
					= (i_1600_ & 0xff00ff) + (i_1603_
								  & 0xff00ff);
				    i_1603_
					= ((i_1602_ & 0x1000100)
					   + (i_1601_ - i_1602_ & 0x10000));
				    is[i_1489_]
					= (i_1601_ - i_1603_
					   | i_1603_ - (i_1603_ >>> 8));
				}
				if (bool_1471_ && bool_1480_)
				    fs[i_1489_] = f;
			    }
			    i_1481_ += i_1485_;
			    i_1489_++;
			}
			i_1482_ += i_1486_;
			i_1481_ = i_1596_;
			i_1489_ += i_1490_;
		    }
		} else if (i_1476_ == 2) {
		    int i_1604_ = i_1477_ >>> 24;
		    int i_1605_ = 256 - i_1604_;
		    int i_1606_ = (i_1477_ & 0xff00ff) * i_1605_ & ~0xff00ff;
		    int i_1607_ = (i_1477_ & 0xff00) * i_1605_ & 0xff0000;
		    i_1477_ = (i_1606_ | i_1607_) >>> 8;
		    int i_1608_ = i_1481_;
		    for (int i_1609_ = -i_1475_; i_1609_ < 0; i_1609_++) {
			int i_1610_
			    = ((i_1482_ >> 16)
			       * ((Class151_Sub1_Sub2) this).anInt8803);
			for (int i_1611_ = -i_1474_; i_1611_ < 0; i_1611_++) {
			    if (!bool_1471_ || f < fs[i_1489_]) {
				int i_1612_ = (((Class151_Sub1_Sub2) this)
					       .anIntArray11308
					       [(i_1481_ >> 16) + i_1610_]);
				if (i_1612_ != 0) {
				    if (bool) {
					i_1606_
					    = ((i_1612_ & 0xff00ff) * i_1604_
					       & ~0xff00ff);
					i_1607_ = ((i_1612_ & 0xff00) * i_1604_
						   & 0xff0000);
					i_1612_ = (((i_1606_ | i_1607_) >>> 8)
						   + i_1477_);
					int i_1613_ = is[i_1489_];
					int i_1614_ = i_1612_ + i_1613_;
					int i_1615_ = ((i_1612_ & 0xff00ff)
						       + (i_1613_ & 0xff00ff));
					i_1613_ = ((i_1615_ & 0x1000100)
						   + (i_1614_ - i_1615_
						      & 0x10000));
					is[i_1489_]
					    = (i_1614_ - i_1613_
					       | i_1613_ - (i_1613_ >>> 8));
				    }
				    if (bool_1471_ && bool_1480_)
					fs[i_1489_] = f;
				}
			    }
			    i_1481_ += i_1485_;
			    i_1489_++;
			}
			i_1482_ += i_1486_;
			i_1481_ = i_1608_;
			i_1489_ += i_1490_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method8295(int i, int i_1616_) {
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    if (anInt8822 == 0) {
		if (anInt8825 == 0) {
		    int i_1617_ = anInt8816;
		    while (i_1617_ < 0) {
			int i_1618_ = anInt8818;
			int i_1619_ = anInt8807;
			int i_1620_ = anInt8826;
			int i_1621_ = anInt8809;
			if (i_1619_ >= 0 && i_1620_ >= 0
			    && i_1619_ - (((Class151_Sub1_Sub2) this).anInt8803
					  << 12) < 0
			    && i_1620_ - (((Class151_Sub1_Sub2) this).anInt8804
					  << 12) < 0) {
			    for (/**/; i_1621_ < 0; i_1621_++)
				method10364(((i_1620_ >> 12)
					     * (((Class151_Sub1_Sub2) this)
						.anInt8803)) + (i_1619_ >> 12),
					    i_1618_++, is, i, i_1616_);
			}
			i_1617_++;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_1622_ = anInt8816;
		    while (i_1622_ < 0) {
			int i_1623_ = anInt8818;
			int i_1624_ = anInt8807;
			int i_1625_ = anInt8826 + anInt8828;
			int i_1626_ = anInt8809;
			if (i_1624_ >= 0
			    && i_1624_ - (((Class151_Sub1_Sub2) this).anInt8803
					  << 12) < 0) {
			    int i_1627_;
			    if ((i_1627_
				 = (i_1625_
				    - (((Class151_Sub1_Sub2) this).anInt8804
				       << 12)))
				>= 0) {
				i_1627_ = (anInt8825 - i_1627_) / anInt8825;
				i_1626_ += i_1627_;
				i_1625_ += anInt8825 * i_1627_;
				i_1623_ += i_1627_;
			    }
			    if ((i_1627_ = (i_1625_ - anInt8825) / anInt8825)
				> i_1626_)
				i_1626_ = i_1627_;
			    for (/**/; i_1626_ < 0; i_1626_++) {
				method10364(((i_1625_ >> 12)
					     * (((Class151_Sub1_Sub2) this)
						.anInt8803)) + (i_1624_ >> 12),
					    i_1623_++, is, i, i_1616_);
				i_1625_ += anInt8825;
			    }
			}
			i_1622_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_1628_ = anInt8816;
		    while (i_1628_ < 0) {
			int i_1629_ = anInt8818;
			int i_1630_ = anInt8807;
			int i_1631_ = anInt8826 + anInt8828;
			int i_1632_ = anInt8809;
			if (i_1630_ >= 0
			    && i_1630_ - (((Class151_Sub1_Sub2) this).anInt8803
					  << 12) < 0) {
			    if (i_1631_ < 0) {
				int i_1633_
				    = (anInt8825 - 1 - i_1631_) / anInt8825;
				i_1632_ += i_1633_;
				i_1631_ += anInt8825 * i_1633_;
				i_1629_ += i_1633_;
			    }
			    int i_1634_;
			    if ((i_1634_
				 = (1 + i_1631_
				    - (((Class151_Sub1_Sub2) this).anInt8804
				       << 12)
				    - anInt8825) / anInt8825)
				> i_1632_)
				i_1632_ = i_1634_;
			    for (/**/; i_1632_ < 0; i_1632_++) {
				method10364(((i_1631_ >> 12)
					     * (((Class151_Sub1_Sub2) this)
						.anInt8803)) + (i_1630_ >> 12),
					    i_1629_++, is, i, i_1616_);
				i_1631_ += anInt8825;
			    }
			}
			i_1628_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8822 < 0) {
		if (anInt8825 == 0) {
		    int i_1635_ = anInt8816;
		    while (i_1635_ < 0) {
			int i_1636_ = anInt8818;
			int i_1637_ = anInt8807 + anInt8805;
			int i_1638_ = anInt8826;
			int i_1639_ = anInt8809;
			if (i_1638_ >= 0
			    && i_1638_ - (((Class151_Sub1_Sub2) this).anInt8804
					  << 12) < 0) {
			    int i_1640_;
			    if ((i_1640_
				 = (i_1637_
				    - (((Class151_Sub1_Sub2) this).anInt8803
				       << 12)))
				>= 0) {
				i_1640_ = (anInt8822 - i_1640_) / anInt8822;
				i_1639_ += i_1640_;
				i_1637_ += anInt8822 * i_1640_;
				i_1636_ += i_1640_;
			    }
			    if ((i_1640_ = (i_1637_ - anInt8822) / anInt8822)
				> i_1639_)
				i_1639_ = i_1640_;
			    for (/**/; i_1639_ < 0; i_1639_++) {
				method10364(((i_1638_ >> 12)
					     * (((Class151_Sub1_Sub2) this)
						.anInt8803)) + (i_1637_ >> 12),
					    i_1636_++, is, i, i_1616_);
				i_1637_ += anInt8822;
			    }
			}
			i_1635_++;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_1641_ = anInt8816;
		    while (i_1641_ < 0) {
			int i_1642_ = anInt8818;
			int i_1643_ = anInt8807 + anInt8805;
			int i_1644_ = anInt8826 + anInt8828;
			int i_1645_ = anInt8809;
			int i_1646_;
			if ((i_1646_
			     = i_1643_ - (((Class151_Sub1_Sub2) this).anInt8803
					  << 12))
			    >= 0) {
			    i_1646_ = (anInt8822 - i_1646_) / anInt8822;
			    i_1645_ += i_1646_;
			    i_1643_ += anInt8822 * i_1646_;
			    i_1644_ += anInt8825 * i_1646_;
			    i_1642_ += i_1646_;
			}
			if ((i_1646_ = (i_1643_ - anInt8822) / anInt8822)
			    > i_1645_)
			    i_1645_ = i_1646_;
			if ((i_1646_
			     = i_1644_ - (((Class151_Sub1_Sub2) this).anInt8804
					  << 12))
			    >= 0) {
			    i_1646_ = (anInt8825 - i_1646_) / anInt8825;
			    i_1645_ += i_1646_;
			    i_1643_ += anInt8822 * i_1646_;
			    i_1644_ += anInt8825 * i_1646_;
			    i_1642_ += i_1646_;
			}
			if ((i_1646_ = (i_1644_ - anInt8825) / anInt8825)
			    > i_1645_)
			    i_1645_ = i_1646_;
			for (/**/; i_1645_ < 0; i_1645_++) {
			    method10364(((i_1644_ >> 12)
					 * (((Class151_Sub1_Sub2) this)
					    .anInt8803)) + (i_1643_ >> 12),
					i_1642_++, is, i, i_1616_);
			    i_1643_ += anInt8822;
			    i_1644_ += anInt8825;
			}
			i_1641_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_1647_ = anInt8816;
		    while (i_1647_ < 0) {
			int i_1648_ = anInt8818;
			int i_1649_ = anInt8807 + anInt8805;
			int i_1650_ = anInt8826 + anInt8828;
			int i_1651_ = anInt8809;
			int i_1652_;
			if ((i_1652_
			     = i_1649_ - (((Class151_Sub1_Sub2) this).anInt8803
					  << 12))
			    >= 0) {
			    i_1652_ = (anInt8822 - i_1652_) / anInt8822;
			    i_1651_ += i_1652_;
			    i_1649_ += anInt8822 * i_1652_;
			    i_1650_ += anInt8825 * i_1652_;
			    i_1648_ += i_1652_;
			}
			if ((i_1652_ = (i_1649_ - anInt8822) / anInt8822)
			    > i_1651_)
			    i_1651_ = i_1652_;
			if (i_1650_ < 0) {
			    i_1652_ = (anInt8825 - 1 - i_1650_) / anInt8825;
			    i_1651_ += i_1652_;
			    i_1649_ += anInt8822 * i_1652_;
			    i_1650_ += anInt8825 * i_1652_;
			    i_1648_ += i_1652_;
			}
			if ((i_1652_
			     = (1 + i_1650_
				- (((Class151_Sub1_Sub2) this).anInt8804 << 12)
				- anInt8825) / anInt8825)
			    > i_1651_)
			    i_1651_ = i_1652_;
			for (/**/; i_1651_ < 0; i_1651_++) {
			    method10364(((i_1650_ >> 12)
					 * (((Class151_Sub1_Sub2) this)
					    .anInt8803)) + (i_1649_ >> 12),
					i_1648_++, is, i, i_1616_);
			    i_1649_ += anInt8822;
			    i_1650_ += anInt8825;
			}
			i_1647_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8825 == 0) {
		int i_1653_ = anInt8816;
		while (i_1653_ < 0) {
		    int i_1654_ = anInt8818;
		    int i_1655_ = anInt8807 + anInt8805;
		    int i_1656_ = anInt8826;
		    int i_1657_ = anInt8809;
		    if (i_1656_ >= 0
			&& i_1656_ - (((Class151_Sub1_Sub2) this).anInt8804
				      << 12) < 0) {
			if (i_1655_ < 0) {
			    int i_1658_
				= (anInt8822 - 1 - i_1655_) / anInt8822;
			    i_1657_ += i_1658_;
			    i_1655_ += anInt8822 * i_1658_;
			    i_1654_ += i_1658_;
			}
			int i_1659_;
			if ((i_1659_
			     = (1 + i_1655_
				- (((Class151_Sub1_Sub2) this).anInt8803 << 12)
				- anInt8822) / anInt8822)
			    > i_1657_)
			    i_1657_ = i_1659_;
			for (/**/; i_1657_ < 0; i_1657_++) {
			    method10364(((i_1656_ >> 12)
					 * (((Class151_Sub1_Sub2) this)
					    .anInt8803)) + (i_1655_ >> 12),
					i_1654_++, is, i, i_1616_);
			    i_1655_ += anInt8822;
			}
		    }
		    i_1653_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else if (anInt8825 < 0) {
		for (int i_1660_ = anInt8816; i_1660_ < 0; i_1660_++) {
		    int i_1661_ = anInt8818;
		    int i_1662_ = anInt8807 + anInt8805;
		    int i_1663_ = anInt8826 + anInt8828;
		    int i_1664_ = anInt8809;
		    if (i_1662_ < 0) {
			int i_1665_ = (anInt8822 - 1 - i_1662_) / anInt8822;
			i_1664_ += i_1665_;
			i_1662_ += anInt8822 * i_1665_;
			i_1663_ += anInt8825 * i_1665_;
			i_1661_ += i_1665_;
		    }
		    int i_1666_;
		    if ((i_1666_
			 = (1 + i_1662_
			    - (((Class151_Sub1_Sub2) this).anInt8803 << 12)
			    - anInt8822) / anInt8822)
			> i_1664_)
			i_1664_ = i_1666_;
		    if ((i_1666_
			 = i_1663_ - (((Class151_Sub1_Sub2) this).anInt8804
				      << 12))
			>= 0) {
			i_1666_ = (anInt8825 - i_1666_) / anInt8825;
			i_1664_ += i_1666_;
			i_1662_ += anInt8822 * i_1666_;
			i_1663_ += anInt8825 * i_1666_;
			i_1661_ += i_1666_;
		    }
		    if ((i_1666_ = (i_1663_ - anInt8825) / anInt8825)
			> i_1664_)
			i_1664_ = i_1666_;
		    for (/**/; i_1664_ < 0; i_1664_++) {
			method10364((((i_1663_ >> 12)
				      * ((Class151_Sub1_Sub2) this).anInt8803)
				     + (i_1662_ >> 12)),
				    i_1661_++, is, i, i_1616_);
			i_1662_ += anInt8822;
			i_1663_ += anInt8825;
		    }
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else {
		for (int i_1667_ = anInt8816; i_1667_ < 0; i_1667_++) {
		    int i_1668_ = anInt8818;
		    int i_1669_ = anInt8807 + anInt8805;
		    int i_1670_ = anInt8826 + anInt8828;
		    int i_1671_ = anInt8809;
		    if (i_1669_ < 0) {
			int i_1672_ = (anInt8822 - 1 - i_1669_) / anInt8822;
			i_1671_ += i_1672_;
			i_1669_ += anInt8822 * i_1672_;
			i_1670_ += anInt8825 * i_1672_;
			i_1668_ += i_1672_;
		    }
		    int i_1673_;
		    if ((i_1673_
			 = (1 + i_1669_
			    - (((Class151_Sub1_Sub2) this).anInt8803 << 12)
			    - anInt8822) / anInt8822)
			> i_1671_)
			i_1671_ = i_1673_;
		    if (i_1670_ < 0) {
			i_1673_ = (anInt8825 - 1 - i_1670_) / anInt8825;
			i_1671_ += i_1673_;
			i_1669_ += anInt8822 * i_1673_;
			i_1670_ += anInt8825 * i_1673_;
			i_1668_ += i_1673_;
		    }
		    if ((i_1673_
			 = (1 + i_1670_
			    - (((Class151_Sub1_Sub2) this).anInt8804 << 12)
			    - anInt8825) / anInt8825)
			> i_1671_)
			i_1671_ = i_1673_;
		    for (/**/; i_1671_ < 0; i_1671_++) {
			method10364((((i_1670_ >> 12)
				      * ((Class151_Sub1_Sub2) this).anInt8803)
				     + (i_1669_ >> 12)),
				    i_1668_++, is, i, i_1616_);
			i_1669_ += anInt8822;
			i_1670_ += anInt8825;
		    }
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    }
	}
    }
    
    public Interface19 method1800() {
	return new Class106(((Class151_Sub1_Sub2) this).anInt8803,
			    ((Class151_Sub1_Sub2) this).anInt8804,
			    ((Class151_Sub1_Sub2) this).anIntArray11308);
    }
    
    Class151_Sub1_Sub2(Class173_Sub3 class173_sub3, int i, int i_1674_) {
	super(class173_sub3, i, i_1674_);
	((Class151_Sub1_Sub2) this).anIntArray11308 = new int[i * i_1674_];
    }
    
    void method10366(int i, int i_1675_, int[] is, int i_1676_, int i_1677_) {
	if (i_1677_ == 0) {
	    if (i_1676_ == 1)
		is[i_1675_] = ((Class151_Sub1_Sub2) this).anIntArray11308[i];
	    else if (i_1676_ == 0) {
		int i_1678_ = ((Class151_Sub1_Sub2) this).anIntArray11308[i++];
		int i_1679_ = (i_1678_ & 0xff0000) * anInt8815 & ~0xffffff;
		int i_1680_ = (i_1678_ & 0xff00) * anInt8833 & 0xff0000;
		int i_1681_ = (i_1678_ & 0xff) * anInt8836 & 0xff00;
		is[i_1675_] = (i_1679_ | i_1680_ | i_1681_) >>> 8;
	    } else if (i_1676_ == 3) {
		int i_1682_ = ((Class151_Sub1_Sub2) this).anIntArray11308[i++];
		int i_1683_ = anInt8829;
		int i_1684_ = i_1682_ + i_1683_;
		int i_1685_ = (i_1682_ & 0xff00ff) + (i_1683_ & 0xff00ff);
		int i_1686_
		    = (i_1685_ & 0x1000100) + (i_1684_ - i_1685_ & 0x10000);
		is[i_1675_] = i_1684_ - i_1686_ | i_1686_ - (i_1686_ >>> 8);
	    } else if (i_1676_ == 2) {
		int i_1687_ = ((Class151_Sub1_Sub2) this).anIntArray11308[i];
		int i_1688_ = (i_1687_ & 0xff00ff) * anInt8830 & ~0xff00ff;
		int i_1689_ = (i_1687_ & 0xff00) * anInt8830 & 0xff0000;
		is[i_1675_] = ((i_1688_ | i_1689_) >>> 8) + anInt8834;
	    } else
		throw new IllegalArgumentException();
	} else if (i_1677_ == 1) {
	    if (i_1676_ == 1) {
		int i_1690_ = ((Class151_Sub1_Sub2) this).anIntArray11308[i];
		if (i_1690_ != 0)
		    is[i_1675_] = i_1690_;
	    } else if (i_1676_ == 0) {
		int i_1691_ = ((Class151_Sub1_Sub2) this).anIntArray11308[i];
		if (i_1691_ != 0) {
		    if ((anInt8829 & 0xffffff) == 16777215) {
			int i_1692_ = anInt8829 >>> 24;
			int i_1693_ = 256 - i_1692_;
			int i_1694_ = is[i_1675_];
			is[i_1675_] = ((((i_1691_ & 0xff00ff) * i_1692_
					 + (i_1694_ & 0xff00ff) * i_1693_)
					& ~0xff00ff)
				       + (((i_1691_ & 0xff00) * i_1692_
					   + (i_1694_ & 0xff00) * i_1693_)
					  & 0xff0000)) >> 8;
		    } else if (anInt8830 != 255) {
			int i_1695_
			    = (i_1691_ & 0xff0000) * anInt8815 & ~0xffffff;
			int i_1696_
			    = (i_1691_ & 0xff00) * anInt8833 & 0xff0000;
			int i_1697_ = (i_1691_ & 0xff) * anInt8836 & 0xff00;
			i_1691_ = (i_1695_ | i_1696_ | i_1697_) >>> 8;
			int i_1698_ = is[i_1675_];
			is[i_1675_] = ((((i_1691_ & 0xff00ff) * anInt8830
					 + (i_1698_ & 0xff00ff) * anInt8831)
					& ~0xff00ff)
				       + (((i_1691_ & 0xff00) * anInt8830
					   + (i_1698_ & 0xff00) * anInt8831)
					  & 0xff0000)) >> 8;
		    } else {
			int i_1699_
			    = (i_1691_ & 0xff0000) * anInt8815 & ~0xffffff;
			int i_1700_
			    = (i_1691_ & 0xff00) * anInt8833 & 0xff0000;
			int i_1701_ = (i_1691_ & 0xff) * anInt8836 & 0xff00;
			is[i_1675_] = (i_1699_ | i_1700_ | i_1701_) >>> 8;
		    }
		}
	    } else if (i_1676_ == 3) {
		int i_1702_ = ((Class151_Sub1_Sub2) this).anIntArray11308[i];
		int i_1703_ = anInt8829;
		int i_1704_ = i_1702_ + i_1703_;
		int i_1705_ = (i_1702_ & 0xff00ff) + (i_1703_ & 0xff00ff);
		int i_1706_
		    = (i_1705_ & 0x1000100) + (i_1704_ - i_1705_ & 0x10000);
		i_1706_ = i_1704_ - i_1706_ | i_1706_ - (i_1706_ >>> 8);
		if (i_1702_ == 0 && anInt8830 != 255) {
		    i_1702_ = i_1706_;
		    i_1706_ = is[i_1675_];
		    i_1706_ = ((((i_1702_ & 0xff00ff) * anInt8830
				 + (i_1706_ & 0xff00ff) * anInt8831)
				& ~0xff00ff)
			       + (((i_1702_ & 0xff00) * anInt8830
				   + (i_1706_ & 0xff00) * anInt8831)
				  & 0xff0000)) >> 8;
		}
		is[i_1675_] = i_1706_;
	    } else if (i_1676_ == 2) {
		int i_1707_ = ((Class151_Sub1_Sub2) this).anIntArray11308[i];
		if (i_1707_ != 0) {
		    int i_1708_ = (i_1707_ & 0xff00ff) * anInt8830 & ~0xff00ff;
		    int i_1709_ = (i_1707_ & 0xff00) * anInt8830 & 0xff0000;
		    is[i_1675_++] = ((i_1708_ | i_1709_) >>> 8) + anInt8834;
		}
	    } else
		throw new IllegalArgumentException();
	} else if (i_1677_ == 2) {
	    if (i_1676_ == 1) {
		int i_1710_ = ((Class151_Sub1_Sub2) this).anIntArray11308[i];
		if (i_1710_ != 0) {
		    int i_1711_ = is[i_1675_];
		    int i_1712_ = i_1710_ + i_1711_;
		    int i_1713_ = (i_1710_ & 0xff00ff) + (i_1711_ & 0xff00ff);
		    i_1711_ = (i_1713_ & 0x1000100) + (i_1712_ - i_1713_
						       & 0x10000);
		    is[i_1675_]
			= i_1712_ - i_1711_ | i_1711_ - (i_1711_ >>> 8);
		}
	    } else if (i_1676_ == 0) {
		int i_1714_ = ((Class151_Sub1_Sub2) this).anIntArray11308[i];
		if (i_1714_ != 0) {
		    int i_1715_ = (i_1714_ & 0xff0000) * anInt8815 & ~0xffffff;
		    int i_1716_ = (i_1714_ & 0xff00) * anInt8833 & 0xff0000;
		    int i_1717_ = (i_1714_ & 0xff) * anInt8836 & 0xff00;
		    i_1714_ = (i_1715_ | i_1716_ | i_1717_) >>> 8;
		    int i_1718_ = is[i_1675_];
		    int i_1719_ = i_1714_ + i_1718_;
		    int i_1720_ = (i_1714_ & 0xff00ff) + (i_1718_ & 0xff00ff);
		    i_1718_ = (i_1720_ & 0x1000100) + (i_1719_ - i_1720_
						       & 0x10000);
		    is[i_1675_]
			= i_1719_ - i_1718_ | i_1718_ - (i_1718_ >>> 8);
		}
	    } else if (i_1676_ == 3) {
		int i_1721_ = ((Class151_Sub1_Sub2) this).anIntArray11308[i];
		int i_1722_ = anInt8829;
		int i_1723_ = i_1721_ + i_1722_;
		int i_1724_ = (i_1721_ & 0xff00ff) + (i_1722_ & 0xff00ff);
		int i_1725_
		    = (i_1724_ & 0x1000100) + (i_1723_ - i_1724_ & 0x10000);
		i_1721_ = i_1723_ - i_1725_ | i_1725_ - (i_1725_ >>> 8);
		i_1725_ = is[i_1675_];
		i_1723_ = i_1721_ + i_1725_;
		i_1724_ = (i_1721_ & 0xff00ff) + (i_1725_ & 0xff00ff);
		i_1725_
		    = (i_1724_ & 0x1000100) + (i_1723_ - i_1724_ & 0x10000);
		is[i_1675_] = i_1723_ - i_1725_ | i_1725_ - (i_1725_ >>> 8);
	    } else if (i_1676_ == 2) {
		int i_1726_ = ((Class151_Sub1_Sub2) this).anIntArray11308[i];
		if (i_1726_ != 0) {
		    int i_1727_ = (i_1726_ & 0xff00ff) * anInt8830 & ~0xff00ff;
		    int i_1728_ = (i_1726_ & 0xff00) * anInt8830 & 0xff0000;
		    i_1726_ = ((i_1727_ | i_1728_) >>> 8) + anInt8834;
		    int i_1729_ = is[i_1675_];
		    int i_1730_ = i_1726_ + i_1729_;
		    int i_1731_ = (i_1726_ & 0xff00ff) + (i_1729_ & 0xff00ff);
		    i_1729_ = (i_1731_ & 0x1000100) + (i_1730_ - i_1731_
						       & 0x10000);
		    is[i_1675_]
			= i_1730_ - i_1729_ | i_1729_ - (i_1729_ >>> 8);
		}
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    void method8296(int i, int i_1732_) {
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    if (anInt8822 == 0) {
		if (anInt8825 == 0) {
		    int i_1733_ = anInt8816;
		    while (i_1733_ < 0) {
			int i_1734_ = anInt8818;
			int i_1735_ = anInt8807;
			int i_1736_ = anInt8826;
			int i_1737_ = anInt8809;
			if (i_1735_ >= 0 && i_1736_ >= 0
			    && i_1735_ - (((Class151_Sub1_Sub2) this).anInt8803
					  << 12) < 0
			    && i_1736_ - (((Class151_Sub1_Sub2) this).anInt8804
					  << 12) < 0) {
			    for (/**/; i_1737_ < 0; i_1737_++)
				method10364(((i_1736_ >> 12)
					     * (((Class151_Sub1_Sub2) this)
						.anInt8803)) + (i_1735_ >> 12),
					    i_1734_++, is, i, i_1732_);
			}
			i_1733_++;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_1738_ = anInt8816;
		    while (i_1738_ < 0) {
			int i_1739_ = anInt8818;
			int i_1740_ = anInt8807;
			int i_1741_ = anInt8826 + anInt8828;
			int i_1742_ = anInt8809;
			if (i_1740_ >= 0
			    && i_1740_ - (((Class151_Sub1_Sub2) this).anInt8803
					  << 12) < 0) {
			    int i_1743_;
			    if ((i_1743_
				 = (i_1741_
				    - (((Class151_Sub1_Sub2) this).anInt8804
				       << 12)))
				>= 0) {
				i_1743_ = (anInt8825 - i_1743_) / anInt8825;
				i_1742_ += i_1743_;
				i_1741_ += anInt8825 * i_1743_;
				i_1739_ += i_1743_;
			    }
			    if ((i_1743_ = (i_1741_ - anInt8825) / anInt8825)
				> i_1742_)
				i_1742_ = i_1743_;
			    for (/**/; i_1742_ < 0; i_1742_++) {
				method10364(((i_1741_ >> 12)
					     * (((Class151_Sub1_Sub2) this)
						.anInt8803)) + (i_1740_ >> 12),
					    i_1739_++, is, i, i_1732_);
				i_1741_ += anInt8825;
			    }
			}
			i_1738_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_1744_ = anInt8816;
		    while (i_1744_ < 0) {
			int i_1745_ = anInt8818;
			int i_1746_ = anInt8807;
			int i_1747_ = anInt8826 + anInt8828;
			int i_1748_ = anInt8809;
			if (i_1746_ >= 0
			    && i_1746_ - (((Class151_Sub1_Sub2) this).anInt8803
					  << 12) < 0) {
			    if (i_1747_ < 0) {
				int i_1749_
				    = (anInt8825 - 1 - i_1747_) / anInt8825;
				i_1748_ += i_1749_;
				i_1747_ += anInt8825 * i_1749_;
				i_1745_ += i_1749_;
			    }
			    int i_1750_;
			    if ((i_1750_
				 = (1 + i_1747_
				    - (((Class151_Sub1_Sub2) this).anInt8804
				       << 12)
				    - anInt8825) / anInt8825)
				> i_1748_)
				i_1748_ = i_1750_;
			    for (/**/; i_1748_ < 0; i_1748_++) {
				method10364(((i_1747_ >> 12)
					     * (((Class151_Sub1_Sub2) this)
						.anInt8803)) + (i_1746_ >> 12),
					    i_1745_++, is, i, i_1732_);
				i_1747_ += anInt8825;
			    }
			}
			i_1744_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8822 < 0) {
		if (anInt8825 == 0) {
		    int i_1751_ = anInt8816;
		    while (i_1751_ < 0) {
			int i_1752_ = anInt8818;
			int i_1753_ = anInt8807 + anInt8805;
			int i_1754_ = anInt8826;
			int i_1755_ = anInt8809;
			if (i_1754_ >= 0
			    && i_1754_ - (((Class151_Sub1_Sub2) this).anInt8804
					  << 12) < 0) {
			    int i_1756_;
			    if ((i_1756_
				 = (i_1753_
				    - (((Class151_Sub1_Sub2) this).anInt8803
				       << 12)))
				>= 0) {
				i_1756_ = (anInt8822 - i_1756_) / anInt8822;
				i_1755_ += i_1756_;
				i_1753_ += anInt8822 * i_1756_;
				i_1752_ += i_1756_;
			    }
			    if ((i_1756_ = (i_1753_ - anInt8822) / anInt8822)
				> i_1755_)
				i_1755_ = i_1756_;
			    for (/**/; i_1755_ < 0; i_1755_++) {
				method10364(((i_1754_ >> 12)
					     * (((Class151_Sub1_Sub2) this)
						.anInt8803)) + (i_1753_ >> 12),
					    i_1752_++, is, i, i_1732_);
				i_1753_ += anInt8822;
			    }
			}
			i_1751_++;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_1757_ = anInt8816;
		    while (i_1757_ < 0) {
			int i_1758_ = anInt8818;
			int i_1759_ = anInt8807 + anInt8805;
			int i_1760_ = anInt8826 + anInt8828;
			int i_1761_ = anInt8809;
			int i_1762_;
			if ((i_1762_
			     = i_1759_ - (((Class151_Sub1_Sub2) this).anInt8803
					  << 12))
			    >= 0) {
			    i_1762_ = (anInt8822 - i_1762_) / anInt8822;
			    i_1761_ += i_1762_;
			    i_1759_ += anInt8822 * i_1762_;
			    i_1760_ += anInt8825 * i_1762_;
			    i_1758_ += i_1762_;
			}
			if ((i_1762_ = (i_1759_ - anInt8822) / anInt8822)
			    > i_1761_)
			    i_1761_ = i_1762_;
			if ((i_1762_
			     = i_1760_ - (((Class151_Sub1_Sub2) this).anInt8804
					  << 12))
			    >= 0) {
			    i_1762_ = (anInt8825 - i_1762_) / anInt8825;
			    i_1761_ += i_1762_;
			    i_1759_ += anInt8822 * i_1762_;
			    i_1760_ += anInt8825 * i_1762_;
			    i_1758_ += i_1762_;
			}
			if ((i_1762_ = (i_1760_ - anInt8825) / anInt8825)
			    > i_1761_)
			    i_1761_ = i_1762_;
			for (/**/; i_1761_ < 0; i_1761_++) {
			    method10364(((i_1760_ >> 12)
					 * (((Class151_Sub1_Sub2) this)
					    .anInt8803)) + (i_1759_ >> 12),
					i_1758_++, is, i, i_1732_);
			    i_1759_ += anInt8822;
			    i_1760_ += anInt8825;
			}
			i_1757_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_1763_ = anInt8816;
		    while (i_1763_ < 0) {
			int i_1764_ = anInt8818;
			int i_1765_ = anInt8807 + anInt8805;
			int i_1766_ = anInt8826 + anInt8828;
			int i_1767_ = anInt8809;
			int i_1768_;
			if ((i_1768_
			     = i_1765_ - (((Class151_Sub1_Sub2) this).anInt8803
					  << 12))
			    >= 0) {
			    i_1768_ = (anInt8822 - i_1768_) / anInt8822;
			    i_1767_ += i_1768_;
			    i_1765_ += anInt8822 * i_1768_;
			    i_1766_ += anInt8825 * i_1768_;
			    i_1764_ += i_1768_;
			}
			if ((i_1768_ = (i_1765_ - anInt8822) / anInt8822)
			    > i_1767_)
			    i_1767_ = i_1768_;
			if (i_1766_ < 0) {
			    i_1768_ = (anInt8825 - 1 - i_1766_) / anInt8825;
			    i_1767_ += i_1768_;
			    i_1765_ += anInt8822 * i_1768_;
			    i_1766_ += anInt8825 * i_1768_;
			    i_1764_ += i_1768_;
			}
			if ((i_1768_
			     = (1 + i_1766_
				- (((Class151_Sub1_Sub2) this).anInt8804 << 12)
				- anInt8825) / anInt8825)
			    > i_1767_)
			    i_1767_ = i_1768_;
			for (/**/; i_1767_ < 0; i_1767_++) {
			    method10364(((i_1766_ >> 12)
					 * (((Class151_Sub1_Sub2) this)
					    .anInt8803)) + (i_1765_ >> 12),
					i_1764_++, is, i, i_1732_);
			    i_1765_ += anInt8822;
			    i_1766_ += anInt8825;
			}
			i_1763_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8825 == 0) {
		int i_1769_ = anInt8816;
		while (i_1769_ < 0) {
		    int i_1770_ = anInt8818;
		    int i_1771_ = anInt8807 + anInt8805;
		    int i_1772_ = anInt8826;
		    int i_1773_ = anInt8809;
		    if (i_1772_ >= 0
			&& i_1772_ - (((Class151_Sub1_Sub2) this).anInt8804
				      << 12) < 0) {
			if (i_1771_ < 0) {
			    int i_1774_
				= (anInt8822 - 1 - i_1771_) / anInt8822;
			    i_1773_ += i_1774_;
			    i_1771_ += anInt8822 * i_1774_;
			    i_1770_ += i_1774_;
			}
			int i_1775_;
			if ((i_1775_
			     = (1 + i_1771_
				- (((Class151_Sub1_Sub2) this).anInt8803 << 12)
				- anInt8822) / anInt8822)
			    > i_1773_)
			    i_1773_ = i_1775_;
			for (/**/; i_1773_ < 0; i_1773_++) {
			    method10364(((i_1772_ >> 12)
					 * (((Class151_Sub1_Sub2) this)
					    .anInt8803)) + (i_1771_ >> 12),
					i_1770_++, is, i, i_1732_);
			    i_1771_ += anInt8822;
			}
		    }
		    i_1769_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else if (anInt8825 < 0) {
		for (int i_1776_ = anInt8816; i_1776_ < 0; i_1776_++) {
		    int i_1777_ = anInt8818;
		    int i_1778_ = anInt8807 + anInt8805;
		    int i_1779_ = anInt8826 + anInt8828;
		    int i_1780_ = anInt8809;
		    if (i_1778_ < 0) {
			int i_1781_ = (anInt8822 - 1 - i_1778_) / anInt8822;
			i_1780_ += i_1781_;
			i_1778_ += anInt8822 * i_1781_;
			i_1779_ += anInt8825 * i_1781_;
			i_1777_ += i_1781_;
		    }
		    int i_1782_;
		    if ((i_1782_
			 = (1 + i_1778_
			    - (((Class151_Sub1_Sub2) this).anInt8803 << 12)
			    - anInt8822) / anInt8822)
			> i_1780_)
			i_1780_ = i_1782_;
		    if ((i_1782_
			 = i_1779_ - (((Class151_Sub1_Sub2) this).anInt8804
				      << 12))
			>= 0) {
			i_1782_ = (anInt8825 - i_1782_) / anInt8825;
			i_1780_ += i_1782_;
			i_1778_ += anInt8822 * i_1782_;
			i_1779_ += anInt8825 * i_1782_;
			i_1777_ += i_1782_;
		    }
		    if ((i_1782_ = (i_1779_ - anInt8825) / anInt8825)
			> i_1780_)
			i_1780_ = i_1782_;
		    for (/**/; i_1780_ < 0; i_1780_++) {
			method10364((((i_1779_ >> 12)
				      * ((Class151_Sub1_Sub2) this).anInt8803)
				     + (i_1778_ >> 12)),
				    i_1777_++, is, i, i_1732_);
			i_1778_ += anInt8822;
			i_1779_ += anInt8825;
		    }
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else {
		for (int i_1783_ = anInt8816; i_1783_ < 0; i_1783_++) {
		    int i_1784_ = anInt8818;
		    int i_1785_ = anInt8807 + anInt8805;
		    int i_1786_ = anInt8826 + anInt8828;
		    int i_1787_ = anInt8809;
		    if (i_1785_ < 0) {
			int i_1788_ = (anInt8822 - 1 - i_1785_) / anInt8822;
			i_1787_ += i_1788_;
			i_1785_ += anInt8822 * i_1788_;
			i_1786_ += anInt8825 * i_1788_;
			i_1784_ += i_1788_;
		    }
		    int i_1789_;
		    if ((i_1789_
			 = (1 + i_1785_
			    - (((Class151_Sub1_Sub2) this).anInt8803 << 12)
			    - anInt8822) / anInt8822)
			> i_1787_)
			i_1787_ = i_1789_;
		    if (i_1786_ < 0) {
			i_1789_ = (anInt8825 - 1 - i_1786_) / anInt8825;
			i_1787_ += i_1789_;
			i_1785_ += anInt8822 * i_1789_;
			i_1786_ += anInt8825 * i_1789_;
			i_1784_ += i_1789_;
		    }
		    if ((i_1789_
			 = (1 + i_1786_
			    - (((Class151_Sub1_Sub2) this).anInt8804 << 12)
			    - anInt8825) / anInt8825)
			> i_1787_)
			i_1787_ = i_1789_;
		    for (/**/; i_1787_ < 0; i_1787_++) {
			method10364((((i_1786_ >> 12)
				      * ((Class151_Sub1_Sub2) this).anInt8803)
				     + (i_1785_ >> 12)),
				    i_1784_++, is, i, i_1732_);
			i_1785_ += anInt8822;
			i_1786_ += anInt8825;
		    }
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    }
	}
    }
    
    public void method1771(int i, int i_1790_, int i_1791_, int i_1792_,
			   int[] is, int[] is_1793_, int i_1794_,
			   int i_1795_) {
	method10363(i, i_1790_, i_1791_, i_1792_, is, i_1794_, i_1795_);
    }
    
    void method8298(int[] is, int[] is_1796_, int i, int i_1797_) {
	int[] is_1798_ = (((Class173_Sub3)
			   ((Class151_Sub1_Sub2) this).aClass173_Sub3_8814)
			  .anIntArray9719);
	if (is_1798_ != null) {
	    if (anInt8822 == 0) {
		if (anInt8825 == 0) {
		    int i_1799_ = anInt8816;
		    while (i_1799_ < 0) {
			int i_1800_ = i_1799_ + i_1797_;
			if (i_1800_ >= 0) {
			    if (i_1800_ >= is.length)
				break;
			    int i_1801_ = anInt8818;
			    int i_1802_ = anInt8807;
			    int i_1803_ = anInt8826;
			    int i_1804_ = anInt8809;
			    if (i_1802_ >= 0 && i_1803_ >= 0
				&& (i_1802_
				    - (((Class151_Sub1_Sub2) this).anInt8803
				       << 12)) < 0
				&& (i_1803_
				    - (((Class151_Sub1_Sub2) this).anInt8804
				       << 12)) < 0) {
				int i_1805_ = is[i_1800_] - i;
				int i_1806_ = -is_1796_[i_1800_];
				int i_1807_ = i_1805_ - (i_1801_ - anInt8818);
				if (i_1807_ > 0) {
				    i_1801_ += i_1807_;
				    i_1804_ += i_1807_;
				    i_1802_ += anInt8822 * i_1807_;
				    i_1803_ += anInt8825 * i_1807_;
				} else
				    i_1806_ -= i_1807_;
				if (i_1804_ < i_1806_)
				    i_1804_ = i_1806_;
				for (/**/; i_1804_ < 0; i_1804_++) {
				    int i_1808_
					= (((Class151_Sub1_Sub2) this)
					   .anIntArray11308
					   [(((i_1803_ >> 12)
					      * (((Class151_Sub1_Sub2) this)
						 .anInt8803))
					     + (i_1802_ >> 12))]);
				    if (i_1808_ != 0)
					is_1798_[i_1801_++] = i_1808_;
				    else
					i_1801_++;
				}
			    }
			}
			i_1799_++;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_1809_ = anInt8816;
		    while (i_1809_ < 0) {
			int i_1810_ = i_1809_ + i_1797_;
			if (i_1810_ >= 0) {
			    if (i_1810_ >= is.length)
				break;
			    int i_1811_ = anInt8818;
			    int i_1812_ = anInt8807;
			    int i_1813_ = anInt8826 + anInt8828;
			    int i_1814_ = anInt8809;
			    if (i_1812_ >= 0
				&& (i_1812_
				    - (((Class151_Sub1_Sub2) this).anInt8803
				       << 12)) < 0) {
				int i_1815_;
				if ((i_1815_
				     = i_1813_ - ((((Class151_Sub1_Sub2) this)
						   .anInt8804)
						  << 12))
				    >= 0) {
				    i_1815_
					= (anInt8825 - i_1815_) / anInt8825;
				    i_1814_ += i_1815_;
				    i_1813_ += anInt8825 * i_1815_;
				    i_1811_ += i_1815_;
				}
				if ((i_1815_
				     = (i_1813_ - anInt8825) / anInt8825)
				    > i_1814_)
				    i_1814_ = i_1815_;
				int i_1816_ = is[i_1810_] - i;
				int i_1817_ = -is_1796_[i_1810_];
				int i_1818_ = i_1816_ - (i_1811_ - anInt8818);
				if (i_1818_ > 0) {
				    i_1811_ += i_1818_;
				    i_1814_ += i_1818_;
				    i_1812_ += anInt8822 * i_1818_;
				    i_1813_ += anInt8825 * i_1818_;
				} else
				    i_1817_ -= i_1818_;
				if (i_1814_ < i_1817_)
				    i_1814_ = i_1817_;
				for (/**/; i_1814_ < 0; i_1814_++) {
				    int i_1819_
					= (((Class151_Sub1_Sub2) this)
					   .anIntArray11308
					   [(((i_1813_ >> 12)
					      * (((Class151_Sub1_Sub2) this)
						 .anInt8803))
					     + (i_1812_ >> 12))]);
				    if (i_1819_ != 0)
					is_1798_[i_1811_++] = i_1819_;
				    else
					i_1811_++;
				    i_1813_ += anInt8825;
				}
			    }
			}
			i_1809_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_1820_ = anInt8816;
		    while (i_1820_ < 0) {
			int i_1821_ = i_1820_ + i_1797_;
			if (i_1821_ >= 0) {
			    if (i_1821_ >= is.length)
				break;
			    int i_1822_ = anInt8818;
			    int i_1823_ = anInt8807;
			    int i_1824_ = anInt8826 + anInt8828;
			    int i_1825_ = anInt8809;
			    if (i_1823_ >= 0
				&& (i_1823_
				    - (((Class151_Sub1_Sub2) this).anInt8803
				       << 12)) < 0) {
				if (i_1824_ < 0) {
				    int i_1826_ = ((anInt8825 - 1 - i_1824_)
						   / anInt8825);
				    i_1825_ += i_1826_;
				    i_1824_ += anInt8825 * i_1826_;
				    i_1822_ += i_1826_;
				}
				int i_1827_;
				if ((i_1827_ = (1 + i_1824_
						- ((((Class151_Sub1_Sub2) this)
						    .anInt8804)
						   << 12)
						- anInt8825) / anInt8825)
				    > i_1825_)
				    i_1825_ = i_1827_;
				int i_1828_ = is[i_1821_] - i;
				int i_1829_ = -is_1796_[i_1821_];
				int i_1830_ = i_1828_ - (i_1822_ - anInt8818);
				if (i_1830_ > 0) {
				    i_1822_ += i_1830_;
				    i_1825_ += i_1830_;
				    i_1823_ += anInt8822 * i_1830_;
				    i_1824_ += anInt8825 * i_1830_;
				} else
				    i_1829_ -= i_1830_;
				if (i_1825_ < i_1829_)
				    i_1825_ = i_1829_;
				for (/**/; i_1825_ < 0; i_1825_++) {
				    int i_1831_
					= (((Class151_Sub1_Sub2) this)
					   .anIntArray11308
					   [(((i_1824_ >> 12)
					      * (((Class151_Sub1_Sub2) this)
						 .anInt8803))
					     + (i_1823_ >> 12))]);
				    if (i_1831_ != 0)
					is_1798_[i_1822_++] = i_1831_;
				    else
					i_1822_++;
				    i_1824_ += anInt8825;
				}
			    }
			}
			i_1820_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8822 < 0) {
		if (anInt8825 == 0) {
		    int i_1832_ = anInt8816;
		    while (i_1832_ < 0) {
			int i_1833_ = i_1832_ + i_1797_;
			if (i_1833_ >= 0) {
			    if (i_1833_ >= is.length)
				break;
			    int i_1834_ = anInt8818;
			    int i_1835_ = anInt8807 + anInt8805;
			    int i_1836_ = anInt8826;
			    int i_1837_ = anInt8809;
			    if (i_1836_ >= 0
				&& (i_1836_
				    - (((Class151_Sub1_Sub2) this).anInt8804
				       << 12)) < 0) {
				int i_1838_;
				if ((i_1838_
				     = i_1835_ - ((((Class151_Sub1_Sub2) this)
						   .anInt8803)
						  << 12))
				    >= 0) {
				    i_1838_
					= (anInt8822 - i_1838_) / anInt8822;
				    i_1837_ += i_1838_;
				    i_1835_ += anInt8822 * i_1838_;
				    i_1834_ += i_1838_;
				}
				if ((i_1838_
				     = (i_1835_ - anInt8822) / anInt8822)
				    > i_1837_)
				    i_1837_ = i_1838_;
				int i_1839_ = is[i_1833_] - i;
				int i_1840_ = -is_1796_[i_1833_];
				int i_1841_ = i_1839_ - (i_1834_ - anInt8818);
				if (i_1841_ > 0) {
				    i_1834_ += i_1841_;
				    i_1837_ += i_1841_;
				    i_1835_ += anInt8822 * i_1841_;
				    i_1836_ += anInt8825 * i_1841_;
				} else
				    i_1840_ -= i_1841_;
				if (i_1837_ < i_1840_)
				    i_1837_ = i_1840_;
				for (/**/; i_1837_ < 0; i_1837_++) {
				    int i_1842_
					= (((Class151_Sub1_Sub2) this)
					   .anIntArray11308
					   [(((i_1836_ >> 12)
					      * (((Class151_Sub1_Sub2) this)
						 .anInt8803))
					     + (i_1835_ >> 12))]);
				    if (i_1842_ != 0)
					is_1798_[i_1834_++] = i_1842_;
				    else
					i_1834_++;
				    i_1835_ += anInt8822;
				}
			    }
			}
			i_1832_++;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_1843_ = anInt8816;
		    while (i_1843_ < 0) {
			int i_1844_ = i_1843_ + i_1797_;
			if (i_1844_ >= 0) {
			    if (i_1844_ >= is.length)
				break;
			    int i_1845_ = anInt8818;
			    int i_1846_ = anInt8807 + anInt8805;
			    int i_1847_ = anInt8826 + anInt8828;
			    int i_1848_ = anInt8809;
			    int i_1849_;
			    if ((i_1849_
				 = (i_1846_
				    - (((Class151_Sub1_Sub2) this).anInt8803
				       << 12)))
				>= 0) {
				i_1849_ = (anInt8822 - i_1849_) / anInt8822;
				i_1848_ += i_1849_;
				i_1846_ += anInt8822 * i_1849_;
				i_1847_ += anInt8825 * i_1849_;
				i_1845_ += i_1849_;
			    }
			    if ((i_1849_ = (i_1846_ - anInt8822) / anInt8822)
				> i_1848_)
				i_1848_ = i_1849_;
			    if ((i_1849_
				 = (i_1847_
				    - (((Class151_Sub1_Sub2) this).anInt8804
				       << 12)))
				>= 0) {
				i_1849_ = (anInt8825 - i_1849_) / anInt8825;
				i_1848_ += i_1849_;
				i_1846_ += anInt8822 * i_1849_;
				i_1847_ += anInt8825 * i_1849_;
				i_1845_ += i_1849_;
			    }
			    if ((i_1849_ = (i_1847_ - anInt8825) / anInt8825)
				> i_1848_)
				i_1848_ = i_1849_;
			    int i_1850_ = is[i_1844_] - i;
			    int i_1851_ = -is_1796_[i_1844_];
			    int i_1852_ = i_1850_ - (i_1845_ - anInt8818);
			    if (i_1852_ > 0) {
				i_1845_ += i_1852_;
				i_1848_ += i_1852_;
				i_1846_ += anInt8822 * i_1852_;
				i_1847_ += anInt8825 * i_1852_;
			    } else
				i_1851_ -= i_1852_;
			    if (i_1848_ < i_1851_)
				i_1848_ = i_1851_;
			    for (/**/; i_1848_ < 0; i_1848_++) {
				int i_1853_
				    = (((Class151_Sub1_Sub2) this)
				       .anIntArray11308
				       [((i_1847_ >> 12)
					 * (((Class151_Sub1_Sub2) this)
					    .anInt8803)) + (i_1846_ >> 12)]);
				if (i_1853_ != 0)
				    is_1798_[i_1845_++] = i_1853_;
				else
				    i_1845_++;
				i_1846_ += anInt8822;
				i_1847_ += anInt8825;
			    }
			}
			i_1843_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_1854_ = anInt8816;
		    while (i_1854_ < 0) {
			int i_1855_ = i_1854_ + i_1797_;
			if (i_1855_ >= 0) {
			    if (i_1855_ >= is.length)
				break;
			    int i_1856_ = anInt8818;
			    int i_1857_ = anInt8807 + anInt8805;
			    int i_1858_ = anInt8826 + anInt8828;
			    int i_1859_ = anInt8809;
			    int i_1860_;
			    if ((i_1860_
				 = (i_1857_
				    - (((Class151_Sub1_Sub2) this).anInt8803
				       << 12)))
				>= 0) {
				i_1860_ = (anInt8822 - i_1860_) / anInt8822;
				i_1859_ += i_1860_;
				i_1857_ += anInt8822 * i_1860_;
				i_1858_ += anInt8825 * i_1860_;
				i_1856_ += i_1860_;
			    }
			    if ((i_1860_ = (i_1857_ - anInt8822) / anInt8822)
				> i_1859_)
				i_1859_ = i_1860_;
			    if (i_1858_ < 0) {
				i_1860_
				    = (anInt8825 - 1 - i_1858_) / anInt8825;
				i_1859_ += i_1860_;
				i_1857_ += anInt8822 * i_1860_;
				i_1858_ += anInt8825 * i_1860_;
				i_1856_ += i_1860_;
			    }
			    if ((i_1860_
				 = (1 + i_1858_
				    - (((Class151_Sub1_Sub2) this).anInt8804
				       << 12)
				    - anInt8825) / anInt8825)
				> i_1859_)
				i_1859_ = i_1860_;
			    int i_1861_ = is[i_1855_] - i;
			    int i_1862_ = -is_1796_[i_1855_];
			    int i_1863_ = i_1861_ - (i_1856_ - anInt8818);
			    if (i_1863_ > 0) {
				i_1856_ += i_1863_;
				i_1859_ += i_1863_;
				i_1857_ += anInt8822 * i_1863_;
				i_1858_ += anInt8825 * i_1863_;
			    } else
				i_1862_ -= i_1863_;
			    if (i_1859_ < i_1862_)
				i_1859_ = i_1862_;
			    for (/**/; i_1859_ < 0; i_1859_++) {
				int i_1864_
				    = (((Class151_Sub1_Sub2) this)
				       .anIntArray11308
				       [((i_1858_ >> 12)
					 * (((Class151_Sub1_Sub2) this)
					    .anInt8803)) + (i_1857_ >> 12)]);
				if (i_1864_ != 0)
				    is_1798_[i_1856_++] = i_1864_;
				else
				    i_1856_++;
				i_1857_ += anInt8822;
				i_1858_ += anInt8825;
			    }
			}
			i_1854_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8825 == 0) {
		int i_1865_ = anInt8816;
		while (i_1865_ < 0) {
		    int i_1866_ = i_1865_ + i_1797_;
		    if (i_1866_ >= 0) {
			if (i_1866_ >= is.length)
			    break;
			int i_1867_ = anInt8818;
			int i_1868_ = anInt8807 + anInt8805;
			int i_1869_ = anInt8826;
			int i_1870_ = anInt8809;
			if (i_1869_ >= 0
			    && i_1869_ - (((Class151_Sub1_Sub2) this).anInt8804
					  << 12) < 0) {
			    if (i_1868_ < 0) {
				int i_1871_
				    = (anInt8822 - 1 - i_1868_) / anInt8822;
				i_1870_ += i_1871_;
				i_1868_ += anInt8822 * i_1871_;
				i_1867_ += i_1871_;
			    }
			    int i_1872_;
			    if ((i_1872_
				 = (1 + i_1868_
				    - (((Class151_Sub1_Sub2) this).anInt8803
				       << 12)
				    - anInt8822) / anInt8822)
				> i_1870_)
				i_1870_ = i_1872_;
			    int i_1873_ = is[i_1866_] - i;
			    int i_1874_ = -is_1796_[i_1866_];
			    int i_1875_ = i_1873_ - (i_1867_ - anInt8818);
			    if (i_1875_ > 0) {
				i_1867_ += i_1875_;
				i_1870_ += i_1875_;
				i_1868_ += anInt8822 * i_1875_;
				i_1869_ += anInt8825 * i_1875_;
			    } else
				i_1874_ -= i_1875_;
			    if (i_1870_ < i_1874_)
				i_1870_ = i_1874_;
			    for (/**/; i_1870_ < 0; i_1870_++) {
				int i_1876_
				    = (((Class151_Sub1_Sub2) this)
				       .anIntArray11308
				       [((i_1869_ >> 12)
					 * (((Class151_Sub1_Sub2) this)
					    .anInt8803)) + (i_1868_ >> 12)]);
				if (i_1876_ != 0)
				    is_1798_[i_1867_++] = i_1876_;
				else
				    i_1867_++;
				i_1868_ += anInt8822;
			    }
			}
		    }
		    i_1865_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else if (anInt8825 < 0) {
		int i_1877_ = anInt8816;
		while (i_1877_ < 0) {
		    int i_1878_ = i_1877_ + i_1797_;
		    if (i_1878_ >= 0) {
			if (i_1878_ >= is.length)
			    break;
			int i_1879_ = anInt8818;
			int i_1880_ = anInt8807 + anInt8805;
			int i_1881_ = anInt8826 + anInt8828;
			int i_1882_ = anInt8809;
			if (i_1880_ < 0) {
			    int i_1883_
				= (anInt8822 - 1 - i_1880_) / anInt8822;
			    i_1882_ += i_1883_;
			    i_1880_ += anInt8822 * i_1883_;
			    i_1881_ += anInt8825 * i_1883_;
			    i_1879_ += i_1883_;
			}
			int i_1884_;
			if ((i_1884_
			     = (1 + i_1880_
				- (((Class151_Sub1_Sub2) this).anInt8803 << 12)
				- anInt8822) / anInt8822)
			    > i_1882_)
			    i_1882_ = i_1884_;
			if ((i_1884_
			     = i_1881_ - (((Class151_Sub1_Sub2) this).anInt8804
					  << 12))
			    >= 0) {
			    i_1884_ = (anInt8825 - i_1884_) / anInt8825;
			    i_1882_ += i_1884_;
			    i_1880_ += anInt8822 * i_1884_;
			    i_1881_ += anInt8825 * i_1884_;
			    i_1879_ += i_1884_;
			}
			if ((i_1884_ = (i_1881_ - anInt8825) / anInt8825)
			    > i_1882_)
			    i_1882_ = i_1884_;
			int i_1885_ = is[i_1878_] - i;
			int i_1886_ = -is_1796_[i_1878_];
			int i_1887_ = i_1885_ - (i_1879_ - anInt8818);
			if (i_1887_ > 0) {
			    i_1879_ += i_1887_;
			    i_1882_ += i_1887_;
			    i_1880_ += anInt8822 * i_1887_;
			    i_1881_ += anInt8825 * i_1887_;
			} else
			    i_1886_ -= i_1887_;
			if (i_1882_ < i_1886_)
			    i_1882_ = i_1886_;
			for (/**/; i_1882_ < 0; i_1882_++) {
			    int i_1888_
				= (((Class151_Sub1_Sub2) this).anIntArray11308
				   [(((i_1881_ >> 12)
				      * ((Class151_Sub1_Sub2) this).anInt8803)
				     + (i_1880_ >> 12))]);
			    if (i_1888_ != 0)
				is_1798_[i_1879_++] = i_1888_;
			    else
				i_1879_++;
			    i_1880_ += anInt8822;
			    i_1881_ += anInt8825;
			}
		    }
		    i_1877_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else {
		int i_1889_ = anInt8816;
		while (i_1889_ < 0) {
		    int i_1890_ = i_1889_ + i_1797_;
		    if (i_1890_ >= 0) {
			if (i_1890_ >= is.length)
			    break;
			int i_1891_ = anInt8818;
			int i_1892_ = anInt8807 + anInt8805;
			int i_1893_ = anInt8826 + anInt8828;
			int i_1894_ = anInt8809;
			if (i_1892_ < 0) {
			    int i_1895_
				= (anInt8822 - 1 - i_1892_) / anInt8822;
			    i_1894_ += i_1895_;
			    i_1892_ += anInt8822 * i_1895_;
			    i_1893_ += anInt8825 * i_1895_;
			    i_1891_ += i_1895_;
			}
			int i_1896_;
			if ((i_1896_
			     = (1 + i_1892_
				- (((Class151_Sub1_Sub2) this).anInt8803 << 12)
				- anInt8822) / anInt8822)
			    > i_1894_)
			    i_1894_ = i_1896_;
			if (i_1893_ < 0) {
			    i_1896_ = (anInt8825 - 1 - i_1893_) / anInt8825;
			    i_1894_ += i_1896_;
			    i_1892_ += anInt8822 * i_1896_;
			    i_1893_ += anInt8825 * i_1896_;
			    i_1891_ += i_1896_;
			}
			if ((i_1896_
			     = (1 + i_1893_
				- (((Class151_Sub1_Sub2) this).anInt8804 << 12)
				- anInt8825) / anInt8825)
			    > i_1894_)
			    i_1894_ = i_1896_;
			int i_1897_ = is[i_1890_] - i;
			int i_1898_ = -is_1796_[i_1890_];
			int i_1899_ = i_1897_ - (i_1891_ - anInt8818);
			if (i_1899_ > 0) {
			    i_1891_ += i_1899_;
			    i_1894_ += i_1899_;
			    i_1892_ += anInt8822 * i_1899_;
			    i_1893_ += anInt8825 * i_1899_;
			} else
			    i_1898_ -= i_1899_;
			if (i_1894_ < i_1898_)
			    i_1894_ = i_1898_;
			for (/**/; i_1894_ < 0; i_1894_++) {
			    int i_1900_
				= (((Class151_Sub1_Sub2) this).anIntArray11308
				   [(((i_1893_ >> 12)
				      * ((Class151_Sub1_Sub2) this).anInt8803)
				     + (i_1892_ >> 12))]);
			    if (i_1900_ != 0)
				is_1798_[i_1891_++] = i_1900_;
			    else
				i_1891_++;
			    i_1892_ += anInt8822;
			    i_1893_ += anInt8825;
			}
		    }
		    i_1889_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    }
	}
    }
}
