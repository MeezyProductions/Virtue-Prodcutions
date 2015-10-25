/* Class151_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class151_Sub1_Sub3 extends Class151_Sub1
{
    int[] anIntArray11309;
    
    public void method1796(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			   int i_4_) {
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is == null)
	    throw new IllegalStateException("");
	for (int i_5_ = 0; i_5_ < i_2_; i_5_++) {
	    int i_6_ = (i_0_ + i_5_) * i_1_ + i;
	    int i_7_ = (i_4_ + i_5_) * i_1_ + i_3_;
	    for (int i_8_ = 0; i_8_ < i_1_; i_8_++)
		((Class151_Sub1_Sub3) this).anIntArray11309[i_6_ + i_8_]
		    = is[i_7_ + i_8_] & 0xffffff;
	}
    }
    
    Class151_Sub1_Sub3(Class173_Sub3 class173_sub3, int[] is, int i, int i_9_,
		       int i_10_, int i_11_, boolean bool) {
	super(class173_sub3, i_10_, i_11_);
	if (bool)
	    ((Class151_Sub1_Sub3) this).anIntArray11309
		= new int[i_10_ * i_11_];
	else
	    ((Class151_Sub1_Sub3) this).anIntArray11309 = is;
	i_9_ -= ((Class151_Sub1_Sub3) this).anInt8803;
	int i_12_ = 0;
	for (int i_13_ = 0; i_13_ < i_11_; i_13_++) {
	    for (int i_14_ = 0; i_14_ < i_10_; i_14_++)
		((Class151_Sub1_Sub3) this).anIntArray11309[i_12_++] = is[i++];
	    i += i_9_;
	}
    }
    
    Class151_Sub1_Sub3(Class173_Sub3 class173_sub3, int[] is, int i,
		       int i_15_) {
	super(class173_sub3, i, i_15_);
	((Class151_Sub1_Sub3) this).anIntArray11309 = is;
    }
    
    public void method1790(int i, int i_16_, int i_17_, int i_18_, int[] is,
			   int i_19_, int i_20_) {
	i_20_ -= i_17_;
	for (int i_21_ = 0; i_21_ < i_18_; i_21_++) {
	    int i_22_ = (i_16_ + i_21_) * i_17_ + i;
	    for (int i_23_ = 0; i_23_ < i_17_; i_23_++)
		((Class151_Sub1_Sub3) this).anIntArray11309[i_22_ + i_23_]
		    = is[i_19_++];
	    i_19_ += i_20_;
	}
    }
    
    void method1777(int i, int i_24_, int i_25_, int i_26_, int i_27_,
		    int i_28_, int i_29_, int i_30_) {
	if (((Class151_Sub1_Sub3) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	if (i_25_ > 0 && i_26_ > 0) {
	    int[] is = (((Class173_Sub3)
			 ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
			.anIntArray9719);
	    if (is != null) {
		int i_31_ = 0;
		int i_32_ = 0;
		int i_33_ = (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					       .aClass173_Sub3_8814)).anInt9735
			     * 111437289);
		int i_34_ = (((Class151_Sub1_Sub3) this).anInt8806
			     + ((Class151_Sub1_Sub3) this).anInt8803
			     + ((Class151_Sub1_Sub3) this).anInt8832);
		int i_35_ = (((Class151_Sub1_Sub3) this).anInt8819
			     + ((Class151_Sub1_Sub3) this).anInt8804
			     + ((Class151_Sub1_Sub3) this).anInt8808);
		int i_36_ = (i_34_ << 16) / i_25_;
		int i_37_ = (i_35_ << 16) / i_26_;
		if (((Class151_Sub1_Sub3) this).anInt8806 > 0) {
		    int i_38_ = (((((Class151_Sub1_Sub3) this).anInt8806 << 16)
				  + i_36_ - 1)
				 / i_36_);
		    i += i_38_;
		    i_31_ += (i_38_ * i_36_
			      - (((Class151_Sub1_Sub3) this).anInt8806 << 16));
		}
		if (((Class151_Sub1_Sub3) this).anInt8819 > 0) {
		    int i_39_ = (((((Class151_Sub1_Sub3) this).anInt8819 << 16)
				  + i_37_ - 1)
				 / i_37_);
		    i_24_ += i_39_;
		    i_32_ += (i_39_ * i_37_
			      - (((Class151_Sub1_Sub3) this).anInt8819 << 16));
		}
		if (((Class151_Sub1_Sub3) this).anInt8803 < i_34_)
		    i_25_ = ((((Class151_Sub1_Sub3) this).anInt8803 << 16)
			     - i_31_ + i_36_ - 1) / i_36_;
		if (((Class151_Sub1_Sub3) this).anInt8804 < i_35_)
		    i_26_ = ((((Class151_Sub1_Sub3) this).anInt8804 << 16)
			     - i_32_ + i_37_ - 1) / i_37_;
		int i_40_ = i + i_24_ * i_33_;
		int i_41_ = i_33_ - i_25_;
		if (i_24_ + i_26_
		    > (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					 .aClass173_Sub3_8814)).anInt9726
		       * 6965409))
		    i_26_ -= (i_24_ + i_26_
			      - (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						   .aClass173_Sub3_8814))
				 .anInt9726) * 6965409);
		if (i_24_ < (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					       .aClass173_Sub3_8814)).anInt9725
			     * 592117349)) {
		    int i_42_ = ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						    .aClass173_Sub3_8814))
				  .anInt9725) * 592117349
				 - i_24_);
		    i_26_ -= i_42_;
		    i_40_ += i_42_ * i_33_;
		    i_32_ += i_37_ * i_42_;
		}
		if (i + i_25_ > (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						   .aClass173_Sub3_8814))
				 .anInt9724) * 630968029) {
		    int i_43_
			= (i + i_25_
			   - (((Class173_Sub3)
			       ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
			      .anInt9724) * 630968029);
		    i_25_ -= i_43_;
		    i_41_ += i_43_;
		}
		if (i < (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					   .aClass173_Sub3_8814)).anInt9723
			 * -993497119)) {
		    int i_44_ = ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						    .aClass173_Sub3_8814))
				  .anInt9723) * -993497119
				 - i);
		    i_25_ -= i_44_;
		    i_40_ += i_44_;
		    i_31_ += i_36_ * i_44_;
		    i_41_ += i_44_;
		}
		if (i_29_ == 0) {
		    if (i_27_ == 1) {
			int i_45_ = i_31_;
			for (int i_46_ = -i_26_; i_46_ < 0; i_46_++) {
			    int i_47_
				= ((i_32_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_48_ = -i_25_; i_48_ < 0; i_48_++) {
				is[i_40_++] = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309
					       [(i_31_ >> 16) + i_47_]);
				i_31_ += i_36_;
			    }
			    i_32_ += i_37_;
			    i_31_ = i_45_;
			    i_40_ += i_41_;
			}
		    } else if (i_27_ == 0) {
			int i_49_ = (i_28_ & 0xff0000) >> 16;
			int i_50_ = (i_28_ & 0xff00) >> 8;
			int i_51_ = i_28_ & 0xff;
			int i_52_ = i_31_;
			for (int i_53_ = -i_26_; i_53_ < 0; i_53_++) {
			    int i_54_
				= ((i_32_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_55_ = -i_25_; i_55_ < 0; i_55_++) {
				int i_56_ = (((Class151_Sub1_Sub3) this)
					     .anIntArray11309
					     [(i_31_ >> 16) + i_54_]);
				int i_57_
				    = (i_56_ & 0xff0000) * i_49_ & ~0xffffff;
				int i_58_
				    = (i_56_ & 0xff00) * i_50_ & 0xff0000;
				int i_59_ = (i_56_ & 0xff) * i_51_ & 0xff00;
				is[i_40_++] = (i_57_ | i_58_ | i_59_) >>> 8;
				i_31_ += i_36_;
			    }
			    i_32_ += i_37_;
			    i_31_ = i_52_;
			    i_40_ += i_41_;
			}
		    } else if (i_27_ == 3) {
			int i_60_ = i_31_;
			for (int i_61_ = -i_26_; i_61_ < 0; i_61_++) {
			    int i_62_
				= ((i_32_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_63_ = -i_25_; i_63_ < 0; i_63_++) {
				int i_64_ = (((Class151_Sub1_Sub3) this)
					     .anIntArray11309
					     [(i_31_ >> 16) + i_62_]);
				int i_65_ = i_64_ + i_28_;
				int i_66_
				    = (i_64_ & 0xff00ff) + (i_28_ & 0xff00ff);
				int i_67_ = ((i_66_ & 0x1000100)
					     + (i_65_ - i_66_ & 0x10000));
				is[i_40_++]
				    = i_65_ - i_67_ | i_67_ - (i_67_ >>> 8);
				i_31_ += i_36_;
			    }
			    i_32_ += i_37_;
			    i_31_ = i_60_;
			    i_40_ += i_41_;
			}
		    } else if (i_27_ == 2) {
			int i_68_ = i_28_ >>> 24;
			int i_69_ = 256 - i_68_;
			int i_70_ = (i_28_ & 0xff00ff) * i_69_ & ~0xff00ff;
			int i_71_ = (i_28_ & 0xff00) * i_69_ & 0xff0000;
			i_28_ = (i_70_ | i_71_) >>> 8;
			int i_72_ = i_31_;
			for (int i_73_ = -i_26_; i_73_ < 0; i_73_++) {
			    int i_74_
				= ((i_32_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_75_ = -i_25_; i_75_ < 0; i_75_++) {
				int i_76_ = (((Class151_Sub1_Sub3) this)
					     .anIntArray11309
					     [(i_31_ >> 16) + i_74_]);
				i_70_ = (i_76_ & 0xff00ff) * i_68_ & ~0xff00ff;
				i_71_ = (i_76_ & 0xff00) * i_68_ & 0xff0000;
				is[i_40_++] = ((i_70_ | i_71_) >>> 8) + i_28_;
				i_31_ += i_36_;
			    }
			    i_32_ += i_37_;
			    i_31_ = i_72_;
			    i_40_ += i_41_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_29_ == 1) {
		    if (i_27_ == 1) {
			int i_77_ = i_31_;
			for (int i_78_ = -i_26_; i_78_ < 0; i_78_++) {
			    int i_79_
				= ((i_32_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_80_ = -i_25_; i_80_ < 0; i_80_++) {
				int i_81_ = (((Class151_Sub1_Sub3) this)
					     .anIntArray11309
					     [(i_31_ >> 16) + i_79_]);
				int i_82_ = i_81_ >>> 24;
				int i_83_ = 256 - i_82_;
				int i_84_ = is[i_40_];
				is[i_40_++]
				    = (((((i_81_ & 0xff00ff) * i_82_
					  + (i_84_ & 0xff00ff) * i_83_)
					 & ~0xff00ff)
					>> 8)
				       + ((((i_81_ & ~0xff00ff) >>> 8) * i_82_
					   + (((i_84_ & ~0xff00ff) >>> 8)
					      * i_83_))
					  & ~0xff00ff));
				i_31_ += i_36_;
			    }
			    i_32_ += i_37_;
			    i_31_ = i_77_;
			    i_40_ += i_41_;
			}
		    } else if (i_27_ == 0) {
			int i_85_ = i_31_;
			if ((i_28_ & 0xffffff) == 16777215) {
			    for (int i_86_ = -i_26_; i_86_ < 0; i_86_++) {
				int i_87_ = ((i_32_ >> 16)
					     * (((Class151_Sub1_Sub3) this)
						.anInt8803));
				for (int i_88_ = -i_25_; i_88_ < 0; i_88_++) {
				    int i_89_ = (((Class151_Sub1_Sub3) this)
						 .anIntArray11309
						 [(i_31_ >> 16) + i_87_]);
				    int i_90_
					= (i_89_ >>> 24) * (i_28_ >>> 24) >> 8;
				    int i_91_ = 256 - i_90_;
				    int i_92_ = is[i_40_];
				    is[i_40_++]
					= ((((i_89_ & 0xff00ff) * i_90_
					     + (i_92_ & 0xff00ff) * i_91_)
					    & ~0xff00ff)
					   + (((i_89_ & 0xff00) * i_90_
					       + (i_92_ & 0xff00) * i_91_)
					      & 0xff0000)) >> 8;
				    i_31_ += i_36_;
				}
				i_32_ += i_37_;
				i_31_ = i_85_;
				i_40_ += i_41_;
			    }
			} else {
			    int i_93_ = (i_28_ & 0xff0000) >> 16;
			    int i_94_ = (i_28_ & 0xff00) >> 8;
			    int i_95_ = i_28_ & 0xff;
			    for (int i_96_ = -i_26_; i_96_ < 0; i_96_++) {
				int i_97_ = ((i_32_ >> 16)
					     * (((Class151_Sub1_Sub3) this)
						.anInt8803));
				for (int i_98_ = -i_25_; i_98_ < 0; i_98_++) {
				    int i_99_ = (((Class151_Sub1_Sub3) this)
						 .anIntArray11309
						 [(i_31_ >> 16) + i_97_]);
				    int i_100_
					= (i_99_ >>> 24) * (i_28_ >>> 24) >> 8;
				    int i_101_ = 256 - i_100_;
				    if (i_100_ != 255) {
					int i_102_
					    = ((i_99_ & 0xff0000) * i_93_
					       & ~0xffffff);
					int i_103_ = ((i_99_ & 0xff00) * i_94_
						      & 0xff0000);
					int i_104_
					    = (i_99_ & 0xff) * i_95_ & 0xff00;
					i_99_
					    = (i_102_ | i_103_ | i_104_) >>> 8;
					int i_105_ = is[i_40_];
					is[i_40_++]
					    = ((((i_99_ & 0xff00ff) * i_100_
						 + ((i_105_ & 0xff00ff)
						    * i_101_))
						& ~0xff00ff)
					       + (((i_99_ & 0xff00) * i_100_
						   + ((i_105_ & 0xff00)
						      * i_101_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_106_
					    = ((i_99_ & 0xff0000) * i_93_
					       & ~0xffffff);
					int i_107_ = ((i_99_ & 0xff00) * i_94_
						      & 0xff0000);
					int i_108_
					    = (i_99_ & 0xff) * i_95_ & 0xff00;
					is[i_40_++]
					    = (i_106_ | i_107_ | i_108_) >>> 8;
				    }
				    i_31_ += i_36_;
				}
				i_32_ += i_37_;
				i_31_ = i_85_;
				i_40_ += i_41_;
			    }
			}
		    } else if (i_27_ == 3) {
			int i_109_ = i_31_;
			for (int i_110_ = -i_26_; i_110_ < 0; i_110_++) {
			    int i_111_
				= ((i_32_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_112_ = -i_25_; i_112_ < 0; i_112_++) {
				int i_113_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309
					      [(i_31_ >> 16) + i_111_]);
				int i_114_ = i_113_ + i_28_;
				int i_115_
				    = (i_113_ & 0xff00ff) + (i_28_ & 0xff00ff);
				int i_116_ = ((i_115_ & 0x1000100)
					      + (i_114_ - i_115_ & 0x10000));
				i_116_ = i_114_ - i_116_ | i_116_ - (i_116_
								     >>> 8);
				int i_117_
				    = (i_116_ >>> 24) * (i_28_ >>> 24) >> 8;
				int i_118_ = 256 - i_117_;
				if (i_117_ != 255) {
				    i_113_ = i_116_;
				    i_116_ = is[i_40_];
				    i_116_ = ((((i_113_ & 0xff00ff) * i_117_
						+ (i_116_ & 0xff00ff) * i_118_)
					       & ~0xff00ff)
					      + (((i_113_ & 0xff00) * i_117_
						  + (i_116_ & 0xff00) * i_118_)
						 & 0xff0000)) >> 8;
				}
				is[i_40_++] = i_116_;
				i_31_ += i_36_;
			    }
			    i_32_ += i_37_;
			    i_31_ = i_109_;
			    i_40_ += i_41_;
			}
		    } else if (i_27_ == 2) {
			int i_119_ = i_28_ >>> 24;
			int i_120_ = 256 - i_119_;
			int i_121_ = (i_28_ & 0xff00ff) * i_120_ & ~0xff00ff;
			int i_122_ = (i_28_ & 0xff00) * i_120_ & 0xff0000;
			i_28_ = (i_121_ | i_122_) >>> 8;
			int i_123_ = i_31_;
			for (int i_124_ = -i_26_; i_124_ < 0; i_124_++) {
			    int i_125_
				= ((i_32_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_126_ = -i_25_; i_126_ < 0; i_126_++) {
				int i_127_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309
					      [(i_31_ >> 16) + i_125_]);
				int i_128_ = i_127_ >>> 24;
				int i_129_ = 256 - i_128_;
				i_121_
				    = (i_127_ & 0xff00ff) * i_119_ & ~0xff00ff;
				i_122_ = (i_127_ & 0xff00) * i_119_ & 0xff0000;
				i_127_ = ((i_121_ | i_122_) >>> 8) + i_28_;
				int i_130_ = is[i_40_];
				is[i_40_++]
				    = ((((i_127_ & 0xff00ff) * i_128_
					 + (i_130_ & 0xff00ff) * i_129_)
					& ~0xff00ff)
				       + (((i_127_ & 0xff00) * i_128_
					   + (i_130_ & 0xff00) * i_129_)
					  & 0xff0000)) >> 8;
				i_31_ += i_36_;
			    }
			    i_32_ += i_37_;
			    i_31_ = i_123_;
			    i_40_ += i_41_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_29_ == 2) {
		    if (i_27_ == 1) {
			int i_131_ = i_31_;
			for (int i_132_ = -i_26_; i_132_ < 0; i_132_++) {
			    int i_133_
				= ((i_32_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_134_ = -i_25_; i_134_ < 0; i_134_++) {
				int i_135_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309
					      [(i_31_ >> 16) + i_133_]);
				if (i_135_ != 0) {
				    int i_136_ = is[i_40_];
				    int i_137_ = i_135_ + i_136_;
				    int i_138_ = ((i_135_ & 0xff00ff)
						  + (i_136_ & 0xff00ff));
				    i_136_ = ((i_138_ & 0x1000100)
					      + (i_137_ - i_138_ & 0x10000));
				    is[i_40_++]
					= i_137_ - i_136_ | i_136_ - (i_136_
								      >>> 8);
				} else
				    i_40_++;
				i_31_ += i_36_;
			    }
			    i_32_ += i_37_;
			    i_31_ = i_131_;
			    i_40_ += i_41_;
			}
		    } else if (i_27_ == 0) {
			int i_139_ = i_31_;
			int i_140_ = (i_28_ & 0xff0000) >> 16;
			int i_141_ = (i_28_ & 0xff00) >> 8;
			int i_142_ = i_28_ & 0xff;
			for (int i_143_ = -i_26_; i_143_ < 0; i_143_++) {
			    int i_144_
				= ((i_32_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_145_ = -i_25_; i_145_ < 0; i_145_++) {
				int i_146_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309
					      [(i_31_ >> 16) + i_144_]);
				if (i_146_ != 0) {
				    int i_147_ = ((i_146_ & 0xff0000) * i_140_
						  & ~0xffffff);
				    int i_148_ = ((i_146_ & 0xff00) * i_141_
						  & 0xff0000);
				    int i_149_
					= (i_146_ & 0xff) * i_142_ & 0xff00;
				    i_146_ = (i_147_ | i_148_ | i_149_) >>> 8;
				    int i_150_ = is[i_40_];
				    int i_151_ = i_146_ + i_150_;
				    int i_152_ = ((i_146_ & 0xff00ff)
						  + (i_150_ & 0xff00ff));
				    i_150_ = ((i_152_ & 0x1000100)
					      + (i_151_ - i_152_ & 0x10000));
				    is[i_40_++]
					= i_151_ - i_150_ | i_150_ - (i_150_
								      >>> 8);
				} else
				    i_40_++;
				i_31_ += i_36_;
			    }
			    i_32_ += i_37_;
			    i_31_ = i_139_;
			    i_40_ += i_41_;
			}
		    } else if (i_27_ == 3) {
			int i_153_ = i_31_;
			for (int i_154_ = -i_26_; i_154_ < 0; i_154_++) {
			    int i_155_
				= ((i_32_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_156_ = -i_25_; i_156_ < 0; i_156_++) {
				int i_157_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309
					      [(i_31_ >> 16) + i_155_]);
				int i_158_ = i_157_ + i_28_;
				int i_159_
				    = (i_157_ & 0xff00ff) + (i_28_ & 0xff00ff);
				int i_160_ = ((i_159_ & 0x1000100)
					      + (i_158_ - i_159_ & 0x10000));
				i_157_ = i_158_ - i_160_ | i_160_ - (i_160_
								     >>> 8);
				i_160_ = is[i_40_];
				i_158_ = i_157_ + i_160_;
				i_159_ = (i_157_ & 0xff00ff) + (i_160_
								& 0xff00ff);
				i_160_
				    = (i_159_ & 0x1000100) + (i_158_ - i_159_
							      & 0x10000);
				is[i_40_++]
				    = i_158_ - i_160_ | i_160_ - (i_160_
								  >>> 8);
				i_31_ += i_36_;
			    }
			    i_32_ += i_37_;
			    i_31_ = i_153_;
			    i_40_ += i_41_;
			}
		    } else if (i_27_ == 2) {
			int i_161_ = i_28_ >>> 24;
			int i_162_ = 256 - i_161_;
			int i_163_ = (i_28_ & 0xff00ff) * i_162_ & ~0xff00ff;
			int i_164_ = (i_28_ & 0xff00) * i_162_ & 0xff0000;
			i_28_ = (i_163_ | i_164_) >>> 8;
			int i_165_ = i_31_;
			for (int i_166_ = -i_26_; i_166_ < 0; i_166_++) {
			    int i_167_
				= ((i_32_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_168_ = -i_25_; i_168_ < 0; i_168_++) {
				int i_169_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309
					      [(i_31_ >> 16) + i_167_]);
				if (i_169_ != 0) {
				    i_163_ = ((i_169_ & 0xff00ff) * i_161_
					      & ~0xff00ff);
				    i_164_ = ((i_169_ & 0xff00) * i_161_
					      & 0xff0000);
				    i_169_ = ((i_163_ | i_164_) >>> 8) + i_28_;
				    int i_170_ = is[i_40_];
				    int i_171_ = i_169_ + i_170_;
				    int i_172_ = ((i_169_ & 0xff00ff)
						  + (i_170_ & 0xff00ff));
				    i_170_ = ((i_172_ & 0x1000100)
					      + (i_171_ - i_172_ & 0x10000));
				    is[i_40_++]
					= i_171_ - i_170_ | i_170_ - (i_170_
								      >>> 8);
				} else
				    i_40_++;
				i_31_ += i_36_;
			    }
			    i_32_ += i_37_;
			    i_31_ = i_165_;
			    i_40_ += i_41_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method1802(int i, int i_173_, int i_174_, int i_175_, int[] is,
			   int[] is_176_, int i_177_, int i_178_) {
	method10368(i, i_173_, i_174_, i_175_, is, i_177_, i_178_);
    }
    
    public void method1784(int i, int i_179_, int i_180_, int i_181_,
			   int i_182_, int i_183_) {
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is == null)
	    throw new IllegalStateException("");
	for (int i_184_ = 0; i_184_ < i_181_; i_184_++) {
	    int i_185_ = (i_179_ + i_184_) * i_180_ + i;
	    int i_186_ = (i_183_ + i_184_) * i_180_ + i_182_;
	    for (int i_187_ = 0; i_187_ < i_180_; i_187_++)
		((Class151_Sub1_Sub3) this).anIntArray11309[i_185_ + i_187_]
		    = is[i_186_ + i_187_] & 0xffffff;
	}
    }
    
    public void method1787(int i, int i_188_, int i_189_) {
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is == null)
	    throw new IllegalStateException("");
	if (i_189_ == 0) {
	    for (int i_190_ = 0;
		 i_190_ < ((Class151_Sub1_Sub3) this).anInt8804; i_190_++) {
		int i_191_ = i_190_ * ((Class151_Sub1_Sub3) this).anInt8803;
		int i_192_
		    = (((i_188_ + i_190_)
			* (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					     .aClass173_Sub3_8814)).anInt9735
			   * 111437289))
		       + i);
		for (int i_193_ = 0;
		     i_193_ < ((Class151_Sub1_Sub3) this).anInt8803; i_193_++)
		    ((Class151_Sub1_Sub3) this).anIntArray11309[(i_191_
								 + i_193_)]
			= ((((Class151_Sub1_Sub3) this).anIntArray11309
			    [i_191_ + i_193_]) & 0xffffff
			   | is[i_192_ + i_193_] << 8 & ~0xffffff);
	    }
	} else if (i_189_ == 1) {
	    for (int i_194_ = 0;
		 i_194_ < ((Class151_Sub1_Sub3) this).anInt8804; i_194_++) {
		int i_195_ = i_194_ * ((Class151_Sub1_Sub3) this).anInt8803;
		int i_196_
		    = (((i_188_ + i_194_)
			* (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					     .aClass173_Sub3_8814)).anInt9735
			   * 111437289))
		       + i);
		for (int i_197_ = 0;
		     i_197_ < ((Class151_Sub1_Sub3) this).anInt8803; i_197_++)
		    ((Class151_Sub1_Sub3) this).anIntArray11309[(i_195_
								 + i_197_)]
			= ((((Class151_Sub1_Sub3) this).anIntArray11309
			    [i_195_ + i_197_]) & 0xffffff
			   | is[i_196_ + i_197_] << 16 & ~0xffffff);
	    }
	} else if (i_189_ == 2) {
	    for (int i_198_ = 0;
		 i_198_ < ((Class151_Sub1_Sub3) this).anInt8804; i_198_++) {
		int i_199_ = i_198_ * ((Class151_Sub1_Sub3) this).anInt8803;
		int i_200_
		    = (((i_188_ + i_198_)
			* (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					     .aClass173_Sub3_8814)).anInt9735
			   * 111437289))
		       + i);
		for (int i_201_ = 0;
		     i_201_ < ((Class151_Sub1_Sub3) this).anInt8803; i_201_++)
		    ((Class151_Sub1_Sub3) this).anIntArray11309[(i_199_
								 + i_201_)]
			= ((((Class151_Sub1_Sub3) this).anIntArray11309
			    [i_199_ + i_201_]) & 0xffffff
			   | is[i_200_ + i_201_] << 24 & ~0xffffff);
	    }
	} else if (i_189_ == 3) {
	    for (int i_202_ = 0;
		 i_202_ < ((Class151_Sub1_Sub3) this).anInt8804; i_202_++) {
		int i_203_ = i_202_ * ((Class151_Sub1_Sub3) this).anInt8803;
		int i_204_
		    = (((i_188_ + i_202_)
			* (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					     .aClass173_Sub3_8814)).anInt9735
			   * 111437289))
		       + i);
		for (int i_205_ = 0;
		     i_205_ < ((Class151_Sub1_Sub3) this).anInt8803; i_205_++)
		    ((Class151_Sub1_Sub3) this).anIntArray11309[(i_203_
								 + i_205_)]
			= ((((Class151_Sub1_Sub3) this).anIntArray11309
			    [i_203_ + i_205_]) & 0xffffff
			   | (is[i_204_ + i_205_] != 0 ? -16777216 : 0));
	    }
	}
    }
    
    public void method1770(int i, int i_206_, int i_207_, int i_208_, int[] is,
			   int i_209_, int i_210_) {
	i_210_ -= i_207_;
	for (int i_211_ = 0; i_211_ < i_208_; i_211_++) {
	    int i_212_ = (i_206_ + i_211_) * i_207_ + i;
	    for (int i_213_ = 0; i_213_ < i_207_; i_213_++)
		((Class151_Sub1_Sub3) this).anIntArray11309[i_212_ + i_213_]
		    = is[i_209_++];
	    i_209_ += i_210_;
	}
    }
    
    void method10367(int i, int i_214_, int[] is, int i_215_, int i_216_) {
	if (i_216_ == 0) {
	    if (i_215_ == 1)
		is[i_214_] = ((Class151_Sub1_Sub3) this).anIntArray11309[i];
	    else if (i_215_ == 0) {
		int i_217_ = ((Class151_Sub1_Sub3) this).anIntArray11309[i++];
		int i_218_ = (i_217_ & 0xff0000) * anInt8815 & ~0xffffff;
		int i_219_ = (i_217_ & 0xff00) * anInt8833 & 0xff0000;
		int i_220_ = (i_217_ & 0xff) * anInt8836 & 0xff00;
		is[i_214_] = (i_218_ | i_219_ | i_220_) >>> 8;
	    } else if (i_215_ == 3) {
		int i_221_ = ((Class151_Sub1_Sub3) this).anIntArray11309[i++];
		int i_222_ = anInt8829;
		int i_223_ = i_221_ + i_222_;
		int i_224_ = (i_221_ & 0xff00ff) + (i_222_ & 0xff00ff);
		int i_225_
		    = (i_224_ & 0x1000100) + (i_223_ - i_224_ & 0x10000);
		is[i_214_] = i_223_ - i_225_ | i_225_ - (i_225_ >>> 8);
	    } else if (i_215_ == 2) {
		int i_226_ = ((Class151_Sub1_Sub3) this).anIntArray11309[i];
		int i_227_ = (i_226_ & 0xff00ff) * anInt8830 & ~0xff00ff;
		int i_228_ = (i_226_ & 0xff00) * anInt8830 & 0xff0000;
		is[i_214_] = ((i_227_ | i_228_) >>> 8) + anInt8834;
	    } else
		throw new IllegalArgumentException();
	} else if (i_216_ == 1) {
	    if (i_215_ == 1) {
		int i_229_ = ((Class151_Sub1_Sub3) this).anIntArray11309[i];
		int i_230_ = i_229_ >>> 24;
		int i_231_ = 256 - i_230_;
		int i_232_ = is[i_214_];
		is[i_214_] = ((((i_229_ & 0xff00ff) * i_230_
				+ (i_232_ & 0xff00ff) * i_231_)
			       & ~0xff00ff)
			      + (((i_229_ & 0xff00) * i_230_
				  + (i_232_ & 0xff00) * i_231_)
				 & 0xff0000)) >> 8;
	    } else if (i_215_ == 0) {
		int i_233_ = ((Class151_Sub1_Sub3) this).anIntArray11309[i];
		int i_234_ = (i_233_ >>> 24) * anInt8830 >> 8;
		int i_235_ = 256 - i_234_;
		if ((anInt8829 & 0xffffff) == 16777215) {
		    int i_236_ = is[i_214_];
		    is[i_214_] = ((((i_233_ & 0xff00ff) * i_234_
				    + (i_236_ & 0xff00ff) * i_235_)
				   & ~0xff00ff)
				  + (((i_233_ & 0xff00) * i_234_
				      + (i_236_ & 0xff00) * i_235_)
				     & 0xff0000)) >> 8;
		} else if (i_234_ != 255) {
		    int i_237_ = (i_233_ & 0xff0000) * anInt8815 & ~0xffffff;
		    int i_238_ = (i_233_ & 0xff00) * anInt8833 & 0xff0000;
		    int i_239_ = (i_233_ & 0xff) * anInt8836 & 0xff00;
		    i_233_ = (i_237_ | i_238_ | i_239_) >>> 8;
		    int i_240_ = is[i_214_];
		    is[i_214_] = ((((i_233_ & 0xff00ff) * i_234_
				    + (i_240_ & 0xff00ff) * i_235_)
				   & ~0xff00ff)
				  + (((i_233_ & 0xff00) * i_234_
				      + (i_240_ & 0xff00) * i_235_)
				     & 0xff0000)) >> 8;
		} else {
		    int i_241_ = (i_233_ & 0xff0000) * anInt8815 & ~0xffffff;
		    int i_242_ = (i_233_ & 0xff00) * anInt8833 & 0xff0000;
		    int i_243_ = (i_233_ & 0xff) * anInt8836 & 0xff00;
		    is[i_214_] = (i_241_ | i_242_ | i_243_) >>> 8;
		}
	    } else if (i_215_ == 3) {
		int i_244_ = ((Class151_Sub1_Sub3) this).anIntArray11309[i];
		int i_245_ = anInt8829;
		int i_246_ = i_244_ + i_245_;
		int i_247_ = (i_244_ & 0xff00ff) + (i_245_ & 0xff00ff);
		int i_248_
		    = (i_247_ & 0x1000100) + (i_246_ - i_247_ & 0x10000);
		i_248_ = i_246_ - i_248_ | i_248_ - (i_248_ >>> 8);
		int i_249_ = (i_244_ >>> 24) * anInt8830 >> 8;
		int i_250_ = 256 - i_249_;
		if (i_249_ != 255) {
		    i_244_ = i_248_;
		    i_248_ = is[i_214_];
		    i_248_ = ((((i_244_ & 0xff00ff) * i_249_
				+ (i_248_ & 0xff00ff) * i_250_)
			       & ~0xff00ff)
			      + (((i_244_ & 0xff00) * i_249_
				  + (i_248_ & 0xff00) * i_250_)
				 & 0xff0000)) >> 8;
		}
		is[i_214_] = i_248_;
	    } else if (i_215_ == 2) {
		int i_251_ = ((Class151_Sub1_Sub3) this).anIntArray11309[i];
		int i_252_ = i_251_ >>> 24;
		int i_253_ = 256 - i_252_;
		int i_254_ = (i_251_ & 0xff00ff) * anInt8830 & ~0xff00ff;
		int i_255_ = (i_251_ & 0xff00) * anInt8830 & 0xff0000;
		i_251_ = ((i_254_ | i_255_) >>> 8) + anInt8834;
		int i_256_ = is[i_214_];
		is[i_214_] = ((((i_251_ & 0xff00ff) * i_252_
				+ (i_256_ & 0xff00ff) * i_253_)
			       & ~0xff00ff)
			      + (((i_251_ & 0xff00) * i_252_
				  + (i_256_ & 0xff00) * i_253_)
				 & 0xff0000)) >> 8;
	    } else
		throw new IllegalArgumentException();
	} else if (i_216_ == 2) {
	    if (i_215_ == 1) {
		int i_257_ = ((Class151_Sub1_Sub3) this).anIntArray11309[i];
		int i_258_ = is[i_214_];
		int i_259_ = i_257_ + i_258_;
		int i_260_ = (i_257_ & 0xff00ff) + (i_258_ & 0xff00ff);
		i_258_ = (i_260_ & 0x1000100) + (i_259_ - i_260_ & 0x10000);
		is[i_214_] = i_259_ - i_258_ | i_258_ - (i_258_ >>> 8);
	    } else if (i_215_ == 0) {
		int i_261_ = ((Class151_Sub1_Sub3) this).anIntArray11309[i];
		int i_262_ = (i_261_ & 0xff0000) * anInt8815 & ~0xffffff;
		int i_263_ = (i_261_ & 0xff00) * anInt8833 & 0xff0000;
		int i_264_ = (i_261_ & 0xff) * anInt8836 & 0xff00;
		i_261_ = (i_262_ | i_263_ | i_264_) >>> 8;
		int i_265_ = is[i_214_];
		int i_266_ = i_261_ + i_265_;
		int i_267_ = (i_261_ & 0xff00ff) + (i_265_ & 0xff00ff);
		i_265_ = (i_267_ & 0x1000100) + (i_266_ - i_267_ & 0x10000);
		is[i_214_] = i_266_ - i_265_ | i_265_ - (i_265_ >>> 8);
	    } else if (i_215_ == 3) {
		int i_268_ = ((Class151_Sub1_Sub3) this).anIntArray11309[i];
		int i_269_ = anInt8829;
		int i_270_ = i_268_ + i_269_;
		int i_271_ = (i_268_ & 0xff00ff) + (i_269_ & 0xff00ff);
		int i_272_
		    = (i_271_ & 0x1000100) + (i_270_ - i_271_ & 0x10000);
		i_268_ = i_270_ - i_272_ | i_272_ - (i_272_ >>> 8);
		i_272_ = is[i_214_];
		i_270_ = i_268_ + i_272_;
		i_271_ = (i_268_ & 0xff00ff) + (i_272_ & 0xff00ff);
		i_272_ = (i_271_ & 0x1000100) + (i_270_ - i_271_ & 0x10000);
		is[i_214_] = i_270_ - i_272_ | i_272_ - (i_272_ >>> 8);
	    } else if (i_215_ == 2) {
		int i_273_ = ((Class151_Sub1_Sub3) this).anIntArray11309[i];
		int i_274_ = (i_273_ & 0xff00ff) * anInt8830 & ~0xff00ff;
		int i_275_ = (i_273_ & 0xff00) * anInt8830 & 0xff0000;
		i_273_ = ((i_274_ | i_275_) >>> 8) + anInt8834;
		int i_276_ = is[i_214_];
		int i_277_ = i_273_ + i_276_;
		int i_278_ = (i_273_ & 0xff00ff) + (i_276_ & 0xff00ff);
		i_276_ = (i_278_ & 0x1000100) + (i_277_ - i_278_ & 0x10000);
		is[i_214_] = i_277_ - i_276_ | i_276_ - (i_276_ >>> 8);
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    public void method1775(int i, int i_279_, Class148 class148, int i_280_,
			   int i_281_) {
	if (((Class151_Sub1_Sub3) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    i += ((Class151_Sub1_Sub3) this).anInt8806;
	    i_279_ += ((Class151_Sub1_Sub3) this).anInt8819;
	    int i_282_ = 0;
	    int i_283_ = (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					    .aClass173_Sub3_8814)).anInt9735
			  * 111437289);
	    int i_284_ = ((Class151_Sub1_Sub3) this).anInt8803;
	    int i_285_ = ((Class151_Sub1_Sub3) this).anInt8804;
	    int i_286_ = i_283_ - i_284_;
	    int i_287_ = 0;
	    int i_288_ = i + i_279_ * i_283_;
	    if (i_279_ < (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					    .aClass173_Sub3_8814)).anInt9725
			  * 592117349)) {
		int i_289_ = ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						 .aClass173_Sub3_8814))
			       .anInt9725) * 592117349
			      - i_279_);
		i_285_ -= i_289_;
		i_279_ = (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					    .aClass173_Sub3_8814)).anInt9725
			  * 592117349);
		i_282_ += i_289_ * i_284_;
		i_288_ += i_289_ * i_283_;
	    }
	    if (i_279_ + i_285_
		> ((Class173_Sub3) (((Class151_Sub1_Sub3) this)
				    .aClass173_Sub3_8814)).anInt9726 * 6965409)
		i_285_ -= (i_279_ + i_285_
			   - (((Class173_Sub3)
			       ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
			      .anInt9726) * 6965409);
	    if (i < (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119)) {
		int i_290_ = ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						 .aClass173_Sub3_8814))
			       .anInt9723) * -993497119
			      - i);
		i_284_ -= i_290_;
		i = (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119);
		i_282_ += i_290_;
		i_288_ += i_290_;
		i_287_ += i_290_;
		i_286_ += i_290_;
	    }
	    if (i + i_284_ > (((Class173_Sub3)
			       ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
			      .anInt9724) * 630968029) {
		int i_291_ = (i + i_284_
			      - (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						   .aClass173_Sub3_8814))
				 .anInt9724) * 630968029);
		i_284_ -= i_291_;
		i_287_ += i_291_;
		i_286_ += i_291_;
	    }
	    if (i_284_ > 0 && i_285_ > 0) {
		Class148_Sub1 class148_sub1 = (Class148_Sub1) class148;
		int[] is_292_ = ((Class148_Sub1) class148_sub1).anIntArray8789;
		int[] is_293_ = ((Class148_Sub1) class148_sub1).anIntArray8788;
		int i_294_ = i_279_;
		if (i_281_ > i_294_) {
		    i_294_ = i_281_;
		    i_288_ += (i_281_ - i_279_) * i_283_;
		    i_282_ += ((i_281_ - i_279_)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
		}
		int i_295_ = (i_281_ + is_292_.length < i_279_ + i_285_
			      ? i_281_ + is_292_.length : i_279_ + i_285_);
		for (int i_296_ = i_294_; i_296_ < i_295_; i_296_++) {
		    int i_297_ = is_292_[i_296_ - i_281_] + i_280_;
		    int i_298_ = is_293_[i_296_ - i_281_];
		    int i_299_ = i_284_;
		    if (i > i_297_) {
			int i_300_ = i - i_297_;
			if (i_300_ >= i_298_) {
			    i_282_ += i_284_ + i_287_;
			    i_288_ += i_284_ + i_286_;
			    continue;
			}
			i_298_ -= i_300_;
		    } else {
			int i_301_ = i_297_ - i;
			if (i_301_ >= i_284_) {
			    i_282_ += i_284_ + i_287_;
			    i_288_ += i_284_ + i_286_;
			    continue;
			}
			i_282_ += i_301_;
			i_299_ -= i_301_;
			i_288_ += i_301_;
		    }
		    int i_302_ = 0;
		    if (i_299_ < i_298_)
			i_298_ = i_299_;
		    else
			i_302_ = i_299_ - i_298_;
		    for (int i_303_ = -i_298_; i_303_ < 0; i_303_++) {
			int i_304_ = (((Class151_Sub1_Sub3) this)
				      .anIntArray11309[i_282_++]);
			int i_305_ = i_304_ >>> 24;
			int i_306_ = 256 - i_305_;
			int i_307_ = is[i_288_];
			is[i_288_++] = ((((i_304_ & 0xff00ff) * i_305_
					  + (i_307_ & 0xff00ff) * i_306_)
					 & ~0xff00ff)
					+ (((i_304_ & 0xff00) * i_305_
					    + (i_307_ & 0xff00) * i_306_)
					   & 0xff0000)) >> 8;
		    }
		    i_282_ += i_302_ + i_287_;
		    i_288_ += i_302_ + i_286_;
		}
	    }
	}
    }
    
    void method8296(int i, int i_308_) {
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    if (anInt8822 == 0) {
		if (anInt8825 == 0) {
		    int i_309_ = anInt8816;
		    while (i_309_ < 0) {
			int i_310_ = anInt8818;
			int i_311_ = anInt8807;
			int i_312_ = anInt8826;
			int i_313_ = anInt8809;
			if (i_311_ >= 0 && i_312_ >= 0
			    && i_311_ - (((Class151_Sub1_Sub3) this).anInt8803
					 << 12) < 0
			    && i_312_ - (((Class151_Sub1_Sub3) this).anInt8804
					 << 12) < 0) {
			    for (/**/; i_313_ < 0; i_313_++)
				method10367(((i_312_ >> 12)
					     * (((Class151_Sub1_Sub3) this)
						.anInt8803)) + (i_311_ >> 12),
					    i_310_++, is, i, i_308_);
			}
			i_309_++;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_314_ = anInt8816;
		    while (i_314_ < 0) {
			int i_315_ = anInt8818;
			int i_316_ = anInt8807;
			int i_317_ = anInt8826 + anInt8828;
			int i_318_ = anInt8809;
			if (i_316_ >= 0
			    && i_316_ - (((Class151_Sub1_Sub3) this).anInt8803
					 << 12) < 0) {
			    int i_319_;
			    if ((i_319_
				 = (i_317_
				    - (((Class151_Sub1_Sub3) this).anInt8804
				       << 12)))
				>= 0) {
				i_319_ = (anInt8825 - i_319_) / anInt8825;
				i_318_ += i_319_;
				i_317_ += anInt8825 * i_319_;
				i_315_ += i_319_;
			    }
			    if ((i_319_ = (i_317_ - anInt8825) / anInt8825)
				> i_318_)
				i_318_ = i_319_;
			    for (/**/; i_318_ < 0; i_318_++) {
				method10367(((i_317_ >> 12)
					     * (((Class151_Sub1_Sub3) this)
						.anInt8803)) + (i_316_ >> 12),
					    i_315_++, is, i, i_308_);
				i_317_ += anInt8825;
			    }
			}
			i_314_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_320_ = anInt8816;
		    while (i_320_ < 0) {
			int i_321_ = anInt8818;
			int i_322_ = anInt8807;
			int i_323_ = anInt8826 + anInt8828;
			int i_324_ = anInt8809;
			if (i_322_ >= 0
			    && i_322_ - (((Class151_Sub1_Sub3) this).anInt8803
					 << 12) < 0) {
			    if (i_323_ < 0) {
				int i_325_
				    = (anInt8825 - 1 - i_323_) / anInt8825;
				i_324_ += i_325_;
				i_323_ += anInt8825 * i_325_;
				i_321_ += i_325_;
			    }
			    int i_326_;
			    if ((i_326_
				 = (1 + i_323_
				    - (((Class151_Sub1_Sub3) this).anInt8804
				       << 12)
				    - anInt8825) / anInt8825)
				> i_324_)
				i_324_ = i_326_;
			    for (/**/; i_324_ < 0; i_324_++) {
				method10367(((i_323_ >> 12)
					     * (((Class151_Sub1_Sub3) this)
						.anInt8803)) + (i_322_ >> 12),
					    i_321_++, is, i, i_308_);
				i_323_ += anInt8825;
			    }
			}
			i_320_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8822 < 0) {
		if (anInt8825 == 0) {
		    int i_327_ = anInt8816;
		    while (i_327_ < 0) {
			int i_328_ = anInt8818;
			int i_329_ = anInt8807 + anInt8805;
			int i_330_ = anInt8826;
			int i_331_ = anInt8809;
			if (i_330_ >= 0
			    && i_330_ - (((Class151_Sub1_Sub3) this).anInt8804
					 << 12) < 0) {
			    int i_332_;
			    if ((i_332_
				 = (i_329_
				    - (((Class151_Sub1_Sub3) this).anInt8803
				       << 12)))
				>= 0) {
				i_332_ = (anInt8822 - i_332_) / anInt8822;
				i_331_ += i_332_;
				i_329_ += anInt8822 * i_332_;
				i_328_ += i_332_;
			    }
			    if ((i_332_ = (i_329_ - anInt8822) / anInt8822)
				> i_331_)
				i_331_ = i_332_;
			    for (/**/; i_331_ < 0; i_331_++) {
				method10367(((i_330_ >> 12)
					     * (((Class151_Sub1_Sub3) this)
						.anInt8803)) + (i_329_ >> 12),
					    i_328_++, is, i, i_308_);
				i_329_ += anInt8822;
			    }
			}
			i_327_++;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_333_ = anInt8816;
		    while (i_333_ < 0) {
			int i_334_ = anInt8818;
			int i_335_ = anInt8807 + anInt8805;
			int i_336_ = anInt8826 + anInt8828;
			int i_337_ = anInt8809;
			int i_338_;
			if ((i_338_
			     = i_335_ - (((Class151_Sub1_Sub3) this).anInt8803
					 << 12))
			    >= 0) {
			    i_338_ = (anInt8822 - i_338_) / anInt8822;
			    i_337_ += i_338_;
			    i_335_ += anInt8822 * i_338_;
			    i_336_ += anInt8825 * i_338_;
			    i_334_ += i_338_;
			}
			if ((i_338_ = (i_335_ - anInt8822) / anInt8822)
			    > i_337_)
			    i_337_ = i_338_;
			if ((i_338_
			     = i_336_ - (((Class151_Sub1_Sub3) this).anInt8804
					 << 12))
			    >= 0) {
			    i_338_ = (anInt8825 - i_338_) / anInt8825;
			    i_337_ += i_338_;
			    i_335_ += anInt8822 * i_338_;
			    i_336_ += anInt8825 * i_338_;
			    i_334_ += i_338_;
			}
			if ((i_338_ = (i_336_ - anInt8825) / anInt8825)
			    > i_337_)
			    i_337_ = i_338_;
			for (/**/; i_337_ < 0; i_337_++) {
			    method10367(((i_336_ >> 12) * ((Class151_Sub1_Sub3)
							   this).anInt8803
					 + (i_335_ >> 12)),
					i_334_++, is, i, i_308_);
			    i_335_ += anInt8822;
			    i_336_ += anInt8825;
			}
			i_333_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_339_ = anInt8816;
		    while (i_339_ < 0) {
			int i_340_ = anInt8818;
			int i_341_ = anInt8807 + anInt8805;
			int i_342_ = anInt8826 + anInt8828;
			int i_343_ = anInt8809;
			int i_344_;
			if ((i_344_
			     = i_341_ - (((Class151_Sub1_Sub3) this).anInt8803
					 << 12))
			    >= 0) {
			    i_344_ = (anInt8822 - i_344_) / anInt8822;
			    i_343_ += i_344_;
			    i_341_ += anInt8822 * i_344_;
			    i_342_ += anInt8825 * i_344_;
			    i_340_ += i_344_;
			}
			if ((i_344_ = (i_341_ - anInt8822) / anInt8822)
			    > i_343_)
			    i_343_ = i_344_;
			if (i_342_ < 0) {
			    i_344_ = (anInt8825 - 1 - i_342_) / anInt8825;
			    i_343_ += i_344_;
			    i_341_ += anInt8822 * i_344_;
			    i_342_ += anInt8825 * i_344_;
			    i_340_ += i_344_;
			}
			if ((i_344_
			     = (1 + i_342_
				- (((Class151_Sub1_Sub3) this).anInt8804 << 12)
				- anInt8825) / anInt8825)
			    > i_343_)
			    i_343_ = i_344_;
			for (/**/; i_343_ < 0; i_343_++) {
			    method10367(((i_342_ >> 12) * ((Class151_Sub1_Sub3)
							   this).anInt8803
					 + (i_341_ >> 12)),
					i_340_++, is, i, i_308_);
			    i_341_ += anInt8822;
			    i_342_ += anInt8825;
			}
			i_339_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8825 == 0) {
		int i_345_ = anInt8816;
		while (i_345_ < 0) {
		    int i_346_ = anInt8818;
		    int i_347_ = anInt8807 + anInt8805;
		    int i_348_ = anInt8826;
		    int i_349_ = anInt8809;
		    if (i_348_ >= 0
			&& i_348_ - (((Class151_Sub1_Sub3) this).anInt8804
				     << 12) < 0) {
			if (i_347_ < 0) {
			    int i_350_ = (anInt8822 - 1 - i_347_) / anInt8822;
			    i_349_ += i_350_;
			    i_347_ += anInt8822 * i_350_;
			    i_346_ += i_350_;
			}
			int i_351_;
			if ((i_351_
			     = (1 + i_347_
				- (((Class151_Sub1_Sub3) this).anInt8803 << 12)
				- anInt8822) / anInt8822)
			    > i_349_)
			    i_349_ = i_351_;
			for (/**/; i_349_ < 0; i_349_++) {
			    method10367(((i_348_ >> 12) * ((Class151_Sub1_Sub3)
							   this).anInt8803
					 + (i_347_ >> 12)),
					i_346_++, is, i, i_308_);
			    i_347_ += anInt8822;
			}
		    }
		    i_345_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else if (anInt8825 < 0) {
		for (int i_352_ = anInt8816; i_352_ < 0; i_352_++) {
		    int i_353_ = anInt8818;
		    int i_354_ = anInt8807 + anInt8805;
		    int i_355_ = anInt8826 + anInt8828;
		    int i_356_ = anInt8809;
		    if (i_354_ < 0) {
			int i_357_ = (anInt8822 - 1 - i_354_) / anInt8822;
			i_356_ += i_357_;
			i_354_ += anInt8822 * i_357_;
			i_355_ += anInt8825 * i_357_;
			i_353_ += i_357_;
		    }
		    int i_358_;
		    if ((i_358_
			 = (1 + i_354_
			    - (((Class151_Sub1_Sub3) this).anInt8803 << 12)
			    - anInt8822) / anInt8822)
			> i_356_)
			i_356_ = i_358_;
		    if ((i_358_
			 = i_355_ - (((Class151_Sub1_Sub3) this).anInt8804
				     << 12))
			>= 0) {
			i_358_ = (anInt8825 - i_358_) / anInt8825;
			i_356_ += i_358_;
			i_354_ += anInt8822 * i_358_;
			i_355_ += anInt8825 * i_358_;
			i_353_ += i_358_;
		    }
		    if ((i_358_ = (i_355_ - anInt8825) / anInt8825) > i_356_)
			i_356_ = i_358_;
		    for (/**/; i_356_ < 0; i_356_++) {
			method10367((((i_355_ >> 12)
				      * ((Class151_Sub1_Sub3) this).anInt8803)
				     + (i_354_ >> 12)),
				    i_353_++, is, i, i_308_);
			i_354_ += anInt8822;
			i_355_ += anInt8825;
		    }
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else {
		for (int i_359_ = anInt8816; i_359_ < 0; i_359_++) {
		    int i_360_ = anInt8818;
		    int i_361_ = anInt8807 + anInt8805;
		    int i_362_ = anInt8826 + anInt8828;
		    int i_363_ = anInt8809;
		    if (i_361_ < 0) {
			int i_364_ = (anInt8822 - 1 - i_361_) / anInt8822;
			i_363_ += i_364_;
			i_361_ += anInt8822 * i_364_;
			i_362_ += anInt8825 * i_364_;
			i_360_ += i_364_;
		    }
		    int i_365_;
		    if ((i_365_
			 = (1 + i_361_
			    - (((Class151_Sub1_Sub3) this).anInt8803 << 12)
			    - anInt8822) / anInt8822)
			> i_363_)
			i_363_ = i_365_;
		    if (i_362_ < 0) {
			i_365_ = (anInt8825 - 1 - i_362_) / anInt8825;
			i_363_ += i_365_;
			i_361_ += anInt8822 * i_365_;
			i_362_ += anInt8825 * i_365_;
			i_360_ += i_365_;
		    }
		    if ((i_365_
			 = (1 + i_362_
			    - (((Class151_Sub1_Sub3) this).anInt8804 << 12)
			    - anInt8825) / anInt8825)
			> i_363_)
			i_363_ = i_365_;
		    for (/**/; i_363_ < 0; i_363_++) {
			method10367((((i_362_ >> 12)
				      * ((Class151_Sub1_Sub3) this).anInt8803)
				     + (i_361_ >> 12)),
				    i_360_++, is, i, i_308_);
			i_361_ += anInt8822;
			i_362_ += anInt8825;
		    }
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    }
	}
    }
    
    public void method1771(int i, int i_366_, int i_367_, int i_368_, int[] is,
			   int[] is_369_, int i_370_, int i_371_) {
	method10368(i, i_366_, i_367_, i_368_, is, i_370_, i_371_);
    }
    
    void method8299(int i, int i_372_) {
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    if (anInt8822 == 0) {
		if (anInt8825 == 0) {
		    int i_373_ = anInt8816;
		    while (i_373_ < 0) {
			int i_374_ = anInt8818;
			int i_375_ = anInt8807;
			int i_376_ = anInt8826;
			int i_377_ = anInt8809;
			if (i_375_ >= 0 && i_376_ >= 0
			    && i_375_ - (((Class151_Sub1_Sub3) this).anInt8803
					 << 12) < 0
			    && i_376_ - (((Class151_Sub1_Sub3) this).anInt8804
					 << 12) < 0) {
			    for (/**/; i_377_ < 0; i_377_++)
				method10367(((i_376_ >> 12)
					     * (((Class151_Sub1_Sub3) this)
						.anInt8803)) + (i_375_ >> 12),
					    i_374_++, is, i, i_372_);
			}
			i_373_++;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_378_ = anInt8816;
		    while (i_378_ < 0) {
			int i_379_ = anInt8818;
			int i_380_ = anInt8807;
			int i_381_ = anInt8826 + anInt8828;
			int i_382_ = anInt8809;
			if (i_380_ >= 0
			    && i_380_ - (((Class151_Sub1_Sub3) this).anInt8803
					 << 12) < 0) {
			    int i_383_;
			    if ((i_383_
				 = (i_381_
				    - (((Class151_Sub1_Sub3) this).anInt8804
				       << 12)))
				>= 0) {
				i_383_ = (anInt8825 - i_383_) / anInt8825;
				i_382_ += i_383_;
				i_381_ += anInt8825 * i_383_;
				i_379_ += i_383_;
			    }
			    if ((i_383_ = (i_381_ - anInt8825) / anInt8825)
				> i_382_)
				i_382_ = i_383_;
			    for (/**/; i_382_ < 0; i_382_++) {
				method10367(((i_381_ >> 12)
					     * (((Class151_Sub1_Sub3) this)
						.anInt8803)) + (i_380_ >> 12),
					    i_379_++, is, i, i_372_);
				i_381_ += anInt8825;
			    }
			}
			i_378_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_384_ = anInt8816;
		    while (i_384_ < 0) {
			int i_385_ = anInt8818;
			int i_386_ = anInt8807;
			int i_387_ = anInt8826 + anInt8828;
			int i_388_ = anInt8809;
			if (i_386_ >= 0
			    && i_386_ - (((Class151_Sub1_Sub3) this).anInt8803
					 << 12) < 0) {
			    if (i_387_ < 0) {
				int i_389_
				    = (anInt8825 - 1 - i_387_) / anInt8825;
				i_388_ += i_389_;
				i_387_ += anInt8825 * i_389_;
				i_385_ += i_389_;
			    }
			    int i_390_;
			    if ((i_390_
				 = (1 + i_387_
				    - (((Class151_Sub1_Sub3) this).anInt8804
				       << 12)
				    - anInt8825) / anInt8825)
				> i_388_)
				i_388_ = i_390_;
			    for (/**/; i_388_ < 0; i_388_++) {
				method10367(((i_387_ >> 12)
					     * (((Class151_Sub1_Sub3) this)
						.anInt8803)) + (i_386_ >> 12),
					    i_385_++, is, i, i_372_);
				i_387_ += anInt8825;
			    }
			}
			i_384_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8822 < 0) {
		if (anInt8825 == 0) {
		    int i_391_ = anInt8816;
		    while (i_391_ < 0) {
			int i_392_ = anInt8818;
			int i_393_ = anInt8807 + anInt8805;
			int i_394_ = anInt8826;
			int i_395_ = anInt8809;
			if (i_394_ >= 0
			    && i_394_ - (((Class151_Sub1_Sub3) this).anInt8804
					 << 12) < 0) {
			    int i_396_;
			    if ((i_396_
				 = (i_393_
				    - (((Class151_Sub1_Sub3) this).anInt8803
				       << 12)))
				>= 0) {
				i_396_ = (anInt8822 - i_396_) / anInt8822;
				i_395_ += i_396_;
				i_393_ += anInt8822 * i_396_;
				i_392_ += i_396_;
			    }
			    if ((i_396_ = (i_393_ - anInt8822) / anInt8822)
				> i_395_)
				i_395_ = i_396_;
			    for (/**/; i_395_ < 0; i_395_++) {
				method10367(((i_394_ >> 12)
					     * (((Class151_Sub1_Sub3) this)
						.anInt8803)) + (i_393_ >> 12),
					    i_392_++, is, i, i_372_);
				i_393_ += anInt8822;
			    }
			}
			i_391_++;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_397_ = anInt8816;
		    while (i_397_ < 0) {
			int i_398_ = anInt8818;
			int i_399_ = anInt8807 + anInt8805;
			int i_400_ = anInt8826 + anInt8828;
			int i_401_ = anInt8809;
			int i_402_;
			if ((i_402_
			     = i_399_ - (((Class151_Sub1_Sub3) this).anInt8803
					 << 12))
			    >= 0) {
			    i_402_ = (anInt8822 - i_402_) / anInt8822;
			    i_401_ += i_402_;
			    i_399_ += anInt8822 * i_402_;
			    i_400_ += anInt8825 * i_402_;
			    i_398_ += i_402_;
			}
			if ((i_402_ = (i_399_ - anInt8822) / anInt8822)
			    > i_401_)
			    i_401_ = i_402_;
			if ((i_402_
			     = i_400_ - (((Class151_Sub1_Sub3) this).anInt8804
					 << 12))
			    >= 0) {
			    i_402_ = (anInt8825 - i_402_) / anInt8825;
			    i_401_ += i_402_;
			    i_399_ += anInt8822 * i_402_;
			    i_400_ += anInt8825 * i_402_;
			    i_398_ += i_402_;
			}
			if ((i_402_ = (i_400_ - anInt8825) / anInt8825)
			    > i_401_)
			    i_401_ = i_402_;
			for (/**/; i_401_ < 0; i_401_++) {
			    method10367(((i_400_ >> 12) * ((Class151_Sub1_Sub3)
							   this).anInt8803
					 + (i_399_ >> 12)),
					i_398_++, is, i, i_372_);
			    i_399_ += anInt8822;
			    i_400_ += anInt8825;
			}
			i_397_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_403_ = anInt8816;
		    while (i_403_ < 0) {
			int i_404_ = anInt8818;
			int i_405_ = anInt8807 + anInt8805;
			int i_406_ = anInt8826 + anInt8828;
			int i_407_ = anInt8809;
			int i_408_;
			if ((i_408_
			     = i_405_ - (((Class151_Sub1_Sub3) this).anInt8803
					 << 12))
			    >= 0) {
			    i_408_ = (anInt8822 - i_408_) / anInt8822;
			    i_407_ += i_408_;
			    i_405_ += anInt8822 * i_408_;
			    i_406_ += anInt8825 * i_408_;
			    i_404_ += i_408_;
			}
			if ((i_408_ = (i_405_ - anInt8822) / anInt8822)
			    > i_407_)
			    i_407_ = i_408_;
			if (i_406_ < 0) {
			    i_408_ = (anInt8825 - 1 - i_406_) / anInt8825;
			    i_407_ += i_408_;
			    i_405_ += anInt8822 * i_408_;
			    i_406_ += anInt8825 * i_408_;
			    i_404_ += i_408_;
			}
			if ((i_408_
			     = (1 + i_406_
				- (((Class151_Sub1_Sub3) this).anInt8804 << 12)
				- anInt8825) / anInt8825)
			    > i_407_)
			    i_407_ = i_408_;
			for (/**/; i_407_ < 0; i_407_++) {
			    method10367(((i_406_ >> 12) * ((Class151_Sub1_Sub3)
							   this).anInt8803
					 + (i_405_ >> 12)),
					i_404_++, is, i, i_372_);
			    i_405_ += anInt8822;
			    i_406_ += anInt8825;
			}
			i_403_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8825 == 0) {
		int i_409_ = anInt8816;
		while (i_409_ < 0) {
		    int i_410_ = anInt8818;
		    int i_411_ = anInt8807 + anInt8805;
		    int i_412_ = anInt8826;
		    int i_413_ = anInt8809;
		    if (i_412_ >= 0
			&& i_412_ - (((Class151_Sub1_Sub3) this).anInt8804
				     << 12) < 0) {
			if (i_411_ < 0) {
			    int i_414_ = (anInt8822 - 1 - i_411_) / anInt8822;
			    i_413_ += i_414_;
			    i_411_ += anInt8822 * i_414_;
			    i_410_ += i_414_;
			}
			int i_415_;
			if ((i_415_
			     = (1 + i_411_
				- (((Class151_Sub1_Sub3) this).anInt8803 << 12)
				- anInt8822) / anInt8822)
			    > i_413_)
			    i_413_ = i_415_;
			for (/**/; i_413_ < 0; i_413_++) {
			    method10367(((i_412_ >> 12) * ((Class151_Sub1_Sub3)
							   this).anInt8803
					 + (i_411_ >> 12)),
					i_410_++, is, i, i_372_);
			    i_411_ += anInt8822;
			}
		    }
		    i_409_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else if (anInt8825 < 0) {
		for (int i_416_ = anInt8816; i_416_ < 0; i_416_++) {
		    int i_417_ = anInt8818;
		    int i_418_ = anInt8807 + anInt8805;
		    int i_419_ = anInt8826 + anInt8828;
		    int i_420_ = anInt8809;
		    if (i_418_ < 0) {
			int i_421_ = (anInt8822 - 1 - i_418_) / anInt8822;
			i_420_ += i_421_;
			i_418_ += anInt8822 * i_421_;
			i_419_ += anInt8825 * i_421_;
			i_417_ += i_421_;
		    }
		    int i_422_;
		    if ((i_422_
			 = (1 + i_418_
			    - (((Class151_Sub1_Sub3) this).anInt8803 << 12)
			    - anInt8822) / anInt8822)
			> i_420_)
			i_420_ = i_422_;
		    if ((i_422_
			 = i_419_ - (((Class151_Sub1_Sub3) this).anInt8804
				     << 12))
			>= 0) {
			i_422_ = (anInt8825 - i_422_) / anInt8825;
			i_420_ += i_422_;
			i_418_ += anInt8822 * i_422_;
			i_419_ += anInt8825 * i_422_;
			i_417_ += i_422_;
		    }
		    if ((i_422_ = (i_419_ - anInt8825) / anInt8825) > i_420_)
			i_420_ = i_422_;
		    for (/**/; i_420_ < 0; i_420_++) {
			method10367((((i_419_ >> 12)
				      * ((Class151_Sub1_Sub3) this).anInt8803)
				     + (i_418_ >> 12)),
				    i_417_++, is, i, i_372_);
			i_418_ += anInt8822;
			i_419_ += anInt8825;
		    }
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else {
		for (int i_423_ = anInt8816; i_423_ < 0; i_423_++) {
		    int i_424_ = anInt8818;
		    int i_425_ = anInt8807 + anInt8805;
		    int i_426_ = anInt8826 + anInt8828;
		    int i_427_ = anInt8809;
		    if (i_425_ < 0) {
			int i_428_ = (anInt8822 - 1 - i_425_) / anInt8822;
			i_427_ += i_428_;
			i_425_ += anInt8822 * i_428_;
			i_426_ += anInt8825 * i_428_;
			i_424_ += i_428_;
		    }
		    int i_429_;
		    if ((i_429_
			 = (1 + i_425_
			    - (((Class151_Sub1_Sub3) this).anInt8803 << 12)
			    - anInt8822) / anInt8822)
			> i_427_)
			i_427_ = i_429_;
		    if (i_426_ < 0) {
			i_429_ = (anInt8825 - 1 - i_426_) / anInt8825;
			i_427_ += i_429_;
			i_425_ += anInt8822 * i_429_;
			i_426_ += anInt8825 * i_429_;
			i_424_ += i_429_;
		    }
		    if ((i_429_
			 = (1 + i_426_
			    - (((Class151_Sub1_Sub3) this).anInt8804 << 12)
			    - anInt8825) / anInt8825)
			> i_427_)
			i_427_ = i_429_;
		    for (/**/; i_427_ < 0; i_427_++) {
			method10367((((i_426_ >> 12)
				      * ((Class151_Sub1_Sub3) this).anInt8803)
				     + (i_425_ >> 12)),
				    i_424_++, is, i, i_372_);
			i_425_ += anInt8822;
			i_426_ += anInt8825;
		    }
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    }
	}
    }
    
    void method8293(int[] is, int[] is_430_, int i, int i_431_) {
	int[] is_432_ = (((Class173_Sub3)
			  ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
			 .anIntArray9719);
	if (is_432_ != null) {
	    if (anInt8822 == 0) {
		if (anInt8825 == 0) {
		    int i_433_ = anInt8816;
		    while (i_433_ < 0) {
			int i_434_ = i_433_ + i_431_;
			if (i_434_ >= 0) {
			    if (i_434_ >= is.length)
				break;
			    int i_435_ = anInt8818;
			    int i_436_ = anInt8807;
			    int i_437_ = anInt8826;
			    int i_438_ = anInt8809;
			    if (i_436_ >= 0 && i_437_ >= 0
				&& (i_436_
				    - (((Class151_Sub1_Sub3) this).anInt8803
				       << 12)) < 0
				&& (i_437_
				    - (((Class151_Sub1_Sub3) this).anInt8804
				       << 12)) < 0) {
				int i_439_ = is[i_434_] - i;
				int i_440_ = -is_430_[i_434_];
				int i_441_ = i_439_ - (i_435_ - anInt8818);
				if (i_441_ > 0) {
				    i_435_ += i_441_;
				    i_438_ += i_441_;
				    i_436_ += anInt8822 * i_441_;
				    i_437_ += anInt8825 * i_441_;
				} else
				    i_440_ -= i_441_;
				if (i_438_ < i_440_)
				    i_438_ = i_440_;
				for (/**/; i_438_ < 0; i_438_++) {
				    int i_442_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(((i_437_ >> 12)
					      * (((Class151_Sub1_Sub3) this)
						 .anInt8803))
					     + (i_436_ >> 12))]);
				    int i_443_ = i_442_ >>> 24;
				    int i_444_ = 256 - i_443_;
				    int i_445_ = is_432_[i_435_];
				    is_432_[i_435_++]
					= ((((i_442_ & 0xff00ff) * i_443_
					     + (i_445_ & 0xff00ff) * i_444_)
					    & ~0xff00ff)
					   + (((i_442_ & 0xff00) * i_443_
					       + (i_445_ & 0xff00) * i_444_)
					      & 0xff0000)) >> 8;
				}
			    }
			}
			i_433_++;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_446_ = anInt8816;
		    while (i_446_ < 0) {
			int i_447_ = i_446_ + i_431_;
			if (i_447_ >= 0) {
			    if (i_447_ >= is.length)
				break;
			    int i_448_ = anInt8818;
			    int i_449_ = anInt8807;
			    int i_450_ = anInt8826 + anInt8828;
			    int i_451_ = anInt8809;
			    if (i_449_ >= 0
				&& (i_449_
				    - (((Class151_Sub1_Sub3) this).anInt8803
				       << 12)) < 0) {
				int i_452_;
				if ((i_452_
				     = i_450_ - ((((Class151_Sub1_Sub3) this)
						  .anInt8804)
						 << 12))
				    >= 0) {
				    i_452_ = (anInt8825 - i_452_) / anInt8825;
				    i_451_ += i_452_;
				    i_450_ += anInt8825 * i_452_;
				    i_448_ += i_452_;
				}
				if ((i_452_ = (i_450_ - anInt8825) / anInt8825)
				    > i_451_)
				    i_451_ = i_452_;
				int i_453_ = is[i_447_] - i;
				int i_454_ = -is_430_[i_447_];
				int i_455_ = i_453_ - (i_448_ - anInt8818);
				if (i_455_ > 0) {
				    i_448_ += i_455_;
				    i_451_ += i_455_;
				    i_449_ += anInt8822 * i_455_;
				    i_450_ += anInt8825 * i_455_;
				} else
				    i_454_ -= i_455_;
				if (i_451_ < i_454_)
				    i_451_ = i_454_;
				for (/**/; i_451_ < 0; i_451_++) {
				    int i_456_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(((i_450_ >> 12)
					      * (((Class151_Sub1_Sub3) this)
						 .anInt8803))
					     + (i_449_ >> 12))]);
				    int i_457_ = i_456_ >>> 24;
				    int i_458_ = 256 - i_457_;
				    int i_459_ = is_432_[i_448_];
				    is_432_[i_448_++]
					= ((((i_456_ & 0xff00ff) * i_457_
					     + (i_459_ & 0xff00ff) * i_458_)
					    & ~0xff00ff)
					   + (((i_456_ & 0xff00) * i_457_
					       + (i_459_ & 0xff00) * i_458_)
					      & 0xff0000)) >> 8;
				    i_450_ += anInt8825;
				}
			    }
			}
			i_446_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_460_ = anInt8816;
		    while (i_460_ < 0) {
			int i_461_ = i_460_ + i_431_;
			if (i_461_ >= 0) {
			    if (i_461_ >= is.length)
				break;
			    int i_462_ = anInt8818;
			    int i_463_ = anInt8807;
			    int i_464_ = anInt8826 + anInt8828;
			    int i_465_ = anInt8809;
			    if (i_463_ >= 0
				&& (i_463_
				    - (((Class151_Sub1_Sub3) this).anInt8803
				       << 12)) < 0) {
				if (i_464_ < 0) {
				    int i_466_
					= (anInt8825 - 1 - i_464_) / anInt8825;
				    i_465_ += i_466_;
				    i_464_ += anInt8825 * i_466_;
				    i_462_ += i_466_;
				}
				int i_467_;
				if ((i_467_ = (1 + i_464_
					       - ((((Class151_Sub1_Sub3) this)
						   .anInt8804)
						  << 12)
					       - anInt8825) / anInt8825)
				    > i_465_)
				    i_465_ = i_467_;
				int i_468_ = is[i_461_] - i;
				int i_469_ = -is_430_[i_461_];
				int i_470_ = i_468_ - (i_462_ - anInt8818);
				if (i_470_ > 0) {
				    i_462_ += i_470_;
				    i_465_ += i_470_;
				    i_463_ += anInt8822 * i_470_;
				    i_464_ += anInt8825 * i_470_;
				} else
				    i_469_ -= i_470_;
				if (i_465_ < i_469_)
				    i_465_ = i_469_;
				for (/**/; i_465_ < 0; i_465_++) {
				    int i_471_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(((i_464_ >> 12)
					      * (((Class151_Sub1_Sub3) this)
						 .anInt8803))
					     + (i_463_ >> 12))]);
				    int i_472_ = i_471_ >>> 24;
				    int i_473_ = 256 - i_472_;
				    int i_474_ = is_432_[i_462_];
				    is_432_[i_462_++]
					= ((((i_471_ & 0xff00ff) * i_472_
					     + (i_474_ & 0xff00ff) * i_473_)
					    & ~0xff00ff)
					   + (((i_471_ & 0xff00) * i_472_
					       + (i_474_ & 0xff00) * i_473_)
					      & 0xff0000)) >> 8;
				    i_464_ += anInt8825;
				}
			    }
			}
			i_460_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8822 < 0) {
		if (anInt8825 == 0) {
		    int i_475_ = anInt8816;
		    while (i_475_ < 0) {
			int i_476_ = i_475_ + i_431_;
			if (i_476_ >= 0) {
			    if (i_476_ >= is.length)
				break;
			    int i_477_ = anInt8818;
			    int i_478_ = anInt8807 + anInt8805;
			    int i_479_ = anInt8826;
			    int i_480_ = anInt8809;
			    if (i_479_ >= 0
				&& (i_479_
				    - (((Class151_Sub1_Sub3) this).anInt8804
				       << 12)) < 0) {
				int i_481_;
				if ((i_481_
				     = i_478_ - ((((Class151_Sub1_Sub3) this)
						  .anInt8803)
						 << 12))
				    >= 0) {
				    i_481_ = (anInt8822 - i_481_) / anInt8822;
				    i_480_ += i_481_;
				    i_478_ += anInt8822 * i_481_;
				    i_477_ += i_481_;
				}
				if ((i_481_ = (i_478_ - anInt8822) / anInt8822)
				    > i_480_)
				    i_480_ = i_481_;
				int i_482_ = is[i_476_] - i;
				int i_483_ = -is_430_[i_476_];
				int i_484_ = i_482_ - (i_477_ - anInt8818);
				if (i_484_ > 0) {
				    i_477_ += i_484_;
				    i_480_ += i_484_;
				    i_478_ += anInt8822 * i_484_;
				    i_479_ += anInt8825 * i_484_;
				} else
				    i_483_ -= i_484_;
				if (i_480_ < i_483_)
				    i_480_ = i_483_;
				for (/**/; i_480_ < 0; i_480_++) {
				    int i_485_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(((i_479_ >> 12)
					      * (((Class151_Sub1_Sub3) this)
						 .anInt8803))
					     + (i_478_ >> 12))]);
				    int i_486_ = i_485_ >>> 24;
				    int i_487_ = 256 - i_486_;
				    int i_488_ = is_432_[i_477_];
				    is_432_[i_477_++]
					= ((((i_485_ & 0xff00ff) * i_486_
					     + (i_488_ & 0xff00ff) * i_487_)
					    & ~0xff00ff)
					   + (((i_485_ & 0xff00) * i_486_
					       + (i_488_ & 0xff00) * i_487_)
					      & 0xff0000)) >> 8;
				    i_478_ += anInt8822;
				}
			    }
			}
			i_475_++;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_489_ = anInt8816;
		    while (i_489_ < 0) {
			int i_490_ = i_489_ + i_431_;
			if (i_490_ >= 0) {
			    if (i_490_ >= is.length)
				break;
			    int i_491_ = anInt8818;
			    int i_492_ = anInt8807 + anInt8805;
			    int i_493_ = anInt8826 + anInt8828;
			    int i_494_ = anInt8809;
			    int i_495_;
			    if ((i_495_
				 = (i_492_
				    - (((Class151_Sub1_Sub3) this).anInt8803
				       << 12)))
				>= 0) {
				i_495_ = (anInt8822 - i_495_) / anInt8822;
				i_494_ += i_495_;
				i_492_ += anInt8822 * i_495_;
				i_493_ += anInt8825 * i_495_;
				i_491_ += i_495_;
			    }
			    if ((i_495_ = (i_492_ - anInt8822) / anInt8822)
				> i_494_)
				i_494_ = i_495_;
			    if ((i_495_
				 = (i_493_
				    - (((Class151_Sub1_Sub3) this).anInt8804
				       << 12)))
				>= 0) {
				i_495_ = (anInt8825 - i_495_) / anInt8825;
				i_494_ += i_495_;
				i_492_ += anInt8822 * i_495_;
				i_493_ += anInt8825 * i_495_;
				i_491_ += i_495_;
			    }
			    if ((i_495_ = (i_493_ - anInt8825) / anInt8825)
				> i_494_)
				i_494_ = i_495_;
			    int i_496_ = is[i_490_] - i;
			    int i_497_ = -is_430_[i_490_];
			    int i_498_ = i_496_ - (i_491_ - anInt8818);
			    if (i_498_ > 0) {
				i_491_ += i_498_;
				i_494_ += i_498_;
				i_492_ += anInt8822 * i_498_;
				i_493_ += anInt8825 * i_498_;
			    } else
				i_497_ -= i_498_;
			    if (i_494_ < i_497_)
				i_494_ = i_497_;
			    for (/**/; i_494_ < 0; i_494_++) {
				int i_499_
				    = (((Class151_Sub1_Sub3) this)
				       .anIntArray11309
				       [((i_493_ >> 12) * ((Class151_Sub1_Sub3)
							   this).anInt8803
					 + (i_492_ >> 12))]);
				int i_500_ = i_499_ >>> 24;
				int i_501_ = 256 - i_500_;
				int i_502_ = is_432_[i_491_];
				is_432_[i_491_++]
				    = ((((i_499_ & 0xff00ff) * i_500_
					 + (i_502_ & 0xff00ff) * i_501_)
					& ~0xff00ff)
				       + (((i_499_ & 0xff00) * i_500_
					   + (i_502_ & 0xff00) * i_501_)
					  & 0xff0000)) >> 8;
				i_492_ += anInt8822;
				i_493_ += anInt8825;
			    }
			}
			i_489_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_503_ = anInt8816;
		    while (i_503_ < 0) {
			int i_504_ = i_503_ + i_431_;
			if (i_504_ >= 0) {
			    if (i_504_ >= is.length)
				break;
			    int i_505_ = anInt8818;
			    int i_506_ = anInt8807 + anInt8805;
			    int i_507_ = anInt8826 + anInt8828;
			    int i_508_ = anInt8809;
			    int i_509_;
			    if ((i_509_
				 = (i_506_
				    - (((Class151_Sub1_Sub3) this).anInt8803
				       << 12)))
				>= 0) {
				i_509_ = (anInt8822 - i_509_) / anInt8822;
				i_508_ += i_509_;
				i_506_ += anInt8822 * i_509_;
				i_507_ += anInt8825 * i_509_;
				i_505_ += i_509_;
			    }
			    if ((i_509_ = (i_506_ - anInt8822) / anInt8822)
				> i_508_)
				i_508_ = i_509_;
			    if (i_507_ < 0) {
				i_509_ = (anInt8825 - 1 - i_507_) / anInt8825;
				i_508_ += i_509_;
				i_506_ += anInt8822 * i_509_;
				i_507_ += anInt8825 * i_509_;
				i_505_ += i_509_;
			    }
			    if ((i_509_
				 = (1 + i_507_
				    - (((Class151_Sub1_Sub3) this).anInt8804
				       << 12)
				    - anInt8825) / anInt8825)
				> i_508_)
				i_508_ = i_509_;
			    int i_510_ = is[i_504_] - i;
			    int i_511_ = -is_430_[i_504_];
			    int i_512_ = i_510_ - (i_505_ - anInt8818);
			    if (i_512_ > 0) {
				i_505_ += i_512_;
				i_508_ += i_512_;
				i_506_ += anInt8822 * i_512_;
				i_507_ += anInt8825 * i_512_;
			    } else
				i_511_ -= i_512_;
			    if (i_508_ < i_511_)
				i_508_ = i_511_;
			    for (/**/; i_508_ < 0; i_508_++) {
				int i_513_
				    = (((Class151_Sub1_Sub3) this)
				       .anIntArray11309
				       [((i_507_ >> 12) * ((Class151_Sub1_Sub3)
							   this).anInt8803
					 + (i_506_ >> 12))]);
				int i_514_ = i_513_ >>> 24;
				int i_515_ = 256 - i_514_;
				int i_516_ = is_432_[i_505_];
				is_432_[i_505_++]
				    = ((((i_513_ & 0xff00ff) * i_514_
					 + (i_516_ & 0xff00ff) * i_515_)
					& ~0xff00ff)
				       + (((i_513_ & 0xff00) * i_514_
					   + (i_516_ & 0xff00) * i_515_)
					  & 0xff0000)) >> 8;
				i_506_ += anInt8822;
				i_507_ += anInt8825;
			    }
			}
			i_503_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8825 == 0) {
		int i_517_ = anInt8816;
		while (i_517_ < 0) {
		    int i_518_ = i_517_ + i_431_;
		    if (i_518_ >= 0) {
			if (i_518_ >= is.length)
			    break;
			int i_519_ = anInt8818;
			int i_520_ = anInt8807 + anInt8805;
			int i_521_ = anInt8826;
			int i_522_ = anInt8809;
			if (i_521_ >= 0
			    && i_521_ - (((Class151_Sub1_Sub3) this).anInt8804
					 << 12) < 0) {
			    if (i_520_ < 0) {
				int i_523_
				    = (anInt8822 - 1 - i_520_) / anInt8822;
				i_522_ += i_523_;
				i_520_ += anInt8822 * i_523_;
				i_519_ += i_523_;
			    }
			    int i_524_;
			    if ((i_524_
				 = (1 + i_520_
				    - (((Class151_Sub1_Sub3) this).anInt8803
				       << 12)
				    - anInt8822) / anInt8822)
				> i_522_)
				i_522_ = i_524_;
			    int i_525_ = is[i_518_] - i;
			    int i_526_ = -is_430_[i_518_];
			    int i_527_ = i_525_ - (i_519_ - anInt8818);
			    if (i_527_ > 0) {
				i_519_ += i_527_;
				i_522_ += i_527_;
				i_520_ += anInt8822 * i_527_;
				i_521_ += anInt8825 * i_527_;
			    } else
				i_526_ -= i_527_;
			    if (i_522_ < i_526_)
				i_522_ = i_526_;
			    for (/**/; i_522_ < 0; i_522_++) {
				int i_528_
				    = (((Class151_Sub1_Sub3) this)
				       .anIntArray11309
				       [((i_521_ >> 12) * ((Class151_Sub1_Sub3)
							   this).anInt8803
					 + (i_520_ >> 12))]);
				int i_529_ = i_528_ >>> 24;
				int i_530_ = 256 - i_529_;
				int i_531_ = is_432_[i_519_];
				is_432_[i_519_++]
				    = ((((i_528_ & 0xff00ff) * i_529_
					 + (i_531_ & 0xff00ff) * i_530_)
					& ~0xff00ff)
				       + (((i_528_ & 0xff00) * i_529_
					   + (i_531_ & 0xff00) * i_530_)
					  & 0xff0000)) >> 8;
				i_520_ += anInt8822;
			    }
			}
		    }
		    i_517_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else if (anInt8825 < 0) {
		int i_532_ = anInt8816;
		while (i_532_ < 0) {
		    int i_533_ = i_532_ + i_431_;
		    if (i_533_ >= 0) {
			if (i_533_ >= is.length)
			    break;
			int i_534_ = anInt8818;
			int i_535_ = anInt8807 + anInt8805;
			int i_536_ = anInt8826 + anInt8828;
			int i_537_ = anInt8809;
			if (i_535_ < 0) {
			    int i_538_ = (anInt8822 - 1 - i_535_) / anInt8822;
			    i_537_ += i_538_;
			    i_535_ += anInt8822 * i_538_;
			    i_536_ += anInt8825 * i_538_;
			    i_534_ += i_538_;
			}
			int i_539_;
			if ((i_539_
			     = (1 + i_535_
				- (((Class151_Sub1_Sub3) this).anInt8803 << 12)
				- anInt8822) / anInt8822)
			    > i_537_)
			    i_537_ = i_539_;
			if ((i_539_
			     = i_536_ - (((Class151_Sub1_Sub3) this).anInt8804
					 << 12))
			    >= 0) {
			    i_539_ = (anInt8825 - i_539_) / anInt8825;
			    i_537_ += i_539_;
			    i_535_ += anInt8822 * i_539_;
			    i_536_ += anInt8825 * i_539_;
			    i_534_ += i_539_;
			}
			if ((i_539_ = (i_536_ - anInt8825) / anInt8825)
			    > i_537_)
			    i_537_ = i_539_;
			int i_540_ = is[i_533_] - i;
			int i_541_ = -is_430_[i_533_];
			int i_542_ = i_540_ - (i_534_ - anInt8818);
			if (i_542_ > 0) {
			    i_534_ += i_542_;
			    i_537_ += i_542_;
			    i_535_ += anInt8822 * i_542_;
			    i_536_ += anInt8825 * i_542_;
			} else
			    i_541_ -= i_542_;
			if (i_537_ < i_541_)
			    i_537_ = i_541_;
			for (/**/; i_537_ < 0; i_537_++) {
			    int i_543_
				= (((Class151_Sub1_Sub3) this).anIntArray11309
				   [(((i_536_ >> 12)
				      * ((Class151_Sub1_Sub3) this).anInt8803)
				     + (i_535_ >> 12))]);
			    int i_544_ = i_543_ >>> 24;
			    int i_545_ = 256 - i_544_;
			    int i_546_ = is_432_[i_534_];
			    is_432_[i_534_++]
				= ((((i_543_ & 0xff00ff) * i_544_
				     + (i_546_ & 0xff00ff) * i_545_)
				    & ~0xff00ff)
				   + (((i_543_ & 0xff00) * i_544_
				       + (i_546_ & 0xff00) * i_545_)
				      & 0xff0000)) >> 8;
			    i_535_ += anInt8822;
			    i_536_ += anInt8825;
			}
		    }
		    i_532_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else {
		int i_547_ = anInt8816;
		while (i_547_ < 0) {
		    int i_548_ = i_547_ + i_431_;
		    if (i_548_ >= 0) {
			if (i_548_ >= is.length)
			    break;
			int i_549_ = anInt8818;
			int i_550_ = anInt8807 + anInt8805;
			int i_551_ = anInt8826 + anInt8828;
			int i_552_ = anInt8809;
			if (i_550_ < 0) {
			    int i_553_ = (anInt8822 - 1 - i_550_) / anInt8822;
			    i_552_ += i_553_;
			    i_550_ += anInt8822 * i_553_;
			    i_551_ += anInt8825 * i_553_;
			    i_549_ += i_553_;
			}
			int i_554_;
			if ((i_554_
			     = (1 + i_550_
				- (((Class151_Sub1_Sub3) this).anInt8803 << 12)
				- anInt8822) / anInt8822)
			    > i_552_)
			    i_552_ = i_554_;
			if (i_551_ < 0) {
			    i_554_ = (anInt8825 - 1 - i_551_) / anInt8825;
			    i_552_ += i_554_;
			    i_550_ += anInt8822 * i_554_;
			    i_551_ += anInt8825 * i_554_;
			    i_549_ += i_554_;
			}
			if ((i_554_
			     = (1 + i_551_
				- (((Class151_Sub1_Sub3) this).anInt8804 << 12)
				- anInt8825) / anInt8825)
			    > i_552_)
			    i_552_ = i_554_;
			int i_555_ = is[i_548_] - i;
			int i_556_ = -is_430_[i_548_];
			int i_557_ = i_555_ - (i_549_ - anInt8818);
			if (i_557_ > 0) {
			    i_549_ += i_557_;
			    i_552_ += i_557_;
			    i_550_ += anInt8822 * i_557_;
			    i_551_ += anInt8825 * i_557_;
			} else
			    i_556_ -= i_557_;
			if (i_552_ < i_556_)
			    i_552_ = i_556_;
			for (/**/; i_552_ < 0; i_552_++) {
			    int i_558_
				= (((Class151_Sub1_Sub3) this).anIntArray11309
				   [(((i_551_ >> 12)
				      * ((Class151_Sub1_Sub3) this).anInt8803)
				     + (i_550_ >> 12))]);
			    int i_559_ = i_558_ >>> 24;
			    int i_560_ = 256 - i_559_;
			    int i_561_ = is_432_[i_549_];
			    is_432_[i_549_++]
				= ((((i_558_ & 0xff00ff) * i_559_
				     + (i_561_ & 0xff00ff) * i_560_)
				    & ~0xff00ff)
				   + (((i_558_ & 0xff00) * i_559_
				       + (i_561_ & 0xff00) * i_560_)
				      & 0xff0000)) >> 8;
			    i_550_ += anInt8822;
			    i_551_ += anInt8825;
			}
		    }
		    i_547_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    }
	}
    }
    
    public void method1812(int i, int i_562_, int i_563_) {
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is == null)
	    throw new IllegalStateException("");
	if (i_563_ == 0) {
	    for (int i_564_ = 0;
		 i_564_ < ((Class151_Sub1_Sub3) this).anInt8804; i_564_++) {
		int i_565_ = i_564_ * ((Class151_Sub1_Sub3) this).anInt8803;
		int i_566_
		    = (((i_562_ + i_564_)
			* (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					     .aClass173_Sub3_8814)).anInt9735
			   * 111437289))
		       + i);
		for (int i_567_ = 0;
		     i_567_ < ((Class151_Sub1_Sub3) this).anInt8803; i_567_++)
		    ((Class151_Sub1_Sub3) this).anIntArray11309[(i_565_
								 + i_567_)]
			= ((((Class151_Sub1_Sub3) this).anIntArray11309
			    [i_565_ + i_567_]) & 0xffffff
			   | is[i_566_ + i_567_] << 8 & ~0xffffff);
	    }
	} else if (i_563_ == 1) {
	    for (int i_568_ = 0;
		 i_568_ < ((Class151_Sub1_Sub3) this).anInt8804; i_568_++) {
		int i_569_ = i_568_ * ((Class151_Sub1_Sub3) this).anInt8803;
		int i_570_
		    = (((i_562_ + i_568_)
			* (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					     .aClass173_Sub3_8814)).anInt9735
			   * 111437289))
		       + i);
		for (int i_571_ = 0;
		     i_571_ < ((Class151_Sub1_Sub3) this).anInt8803; i_571_++)
		    ((Class151_Sub1_Sub3) this).anIntArray11309[(i_569_
								 + i_571_)]
			= ((((Class151_Sub1_Sub3) this).anIntArray11309
			    [i_569_ + i_571_]) & 0xffffff
			   | is[i_570_ + i_571_] << 16 & ~0xffffff);
	    }
	} else if (i_563_ == 2) {
	    for (int i_572_ = 0;
		 i_572_ < ((Class151_Sub1_Sub3) this).anInt8804; i_572_++) {
		int i_573_ = i_572_ * ((Class151_Sub1_Sub3) this).anInt8803;
		int i_574_
		    = (((i_562_ + i_572_)
			* (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					     .aClass173_Sub3_8814)).anInt9735
			   * 111437289))
		       + i);
		for (int i_575_ = 0;
		     i_575_ < ((Class151_Sub1_Sub3) this).anInt8803; i_575_++)
		    ((Class151_Sub1_Sub3) this).anIntArray11309[(i_573_
								 + i_575_)]
			= ((((Class151_Sub1_Sub3) this).anIntArray11309
			    [i_573_ + i_575_]) & 0xffffff
			   | is[i_574_ + i_575_] << 24 & ~0xffffff);
	    }
	} else if (i_563_ == 3) {
	    for (int i_576_ = 0;
		 i_576_ < ((Class151_Sub1_Sub3) this).anInt8804; i_576_++) {
		int i_577_ = i_576_ * ((Class151_Sub1_Sub3) this).anInt8803;
		int i_578_
		    = (((i_562_ + i_576_)
			* (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					     .aClass173_Sub3_8814)).anInt9735
			   * 111437289))
		       + i);
		for (int i_579_ = 0;
		     i_579_ < ((Class151_Sub1_Sub3) this).anInt8803; i_579_++)
		    ((Class151_Sub1_Sub3) this).anIntArray11309[(i_577_
								 + i_579_)]
			= ((((Class151_Sub1_Sub3) this).anIntArray11309
			    [i_577_ + i_579_]) & 0xffffff
			   | (is[i_578_ + i_579_] != 0 ? -16777216 : 0));
	    }
	}
    }
    
    public void method1788(int i, int i_580_, int i_581_, int i_582_, int[] is,
			   int i_583_, int i_584_) {
	i_584_ -= i_581_;
	for (int i_585_ = 0; i_585_ < i_582_; i_585_++) {
	    int i_586_ = (i_580_ + i_585_) * i_581_ + i;
	    for (int i_587_ = 0; i_587_ < i_581_; i_587_++)
		((Class151_Sub1_Sub3) this).anIntArray11309[i_586_ + i_587_]
		    = is[i_583_++];
	    i_583_ += i_584_;
	}
    }
    
    Class151_Sub1_Sub3(Class173_Sub3 class173_sub3, int i, int i_588_) {
	super(class173_sub3, i, i_588_);
	((Class151_Sub1_Sub3) this).anIntArray11309 = new int[i * i_588_];
    }
    
    public void method1778(int i, int i_589_, int i_590_) {
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is == null)
	    throw new IllegalStateException("");
	if (i_590_ == 0) {
	    for (int i_591_ = 0;
		 i_591_ < ((Class151_Sub1_Sub3) this).anInt8804; i_591_++) {
		int i_592_ = i_591_ * ((Class151_Sub1_Sub3) this).anInt8803;
		int i_593_
		    = (((i_589_ + i_591_)
			* (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					     .aClass173_Sub3_8814)).anInt9735
			   * 111437289))
		       + i);
		for (int i_594_ = 0;
		     i_594_ < ((Class151_Sub1_Sub3) this).anInt8803; i_594_++)
		    ((Class151_Sub1_Sub3) this).anIntArray11309[(i_592_
								 + i_594_)]
			= ((((Class151_Sub1_Sub3) this).anIntArray11309
			    [i_592_ + i_594_]) & 0xffffff
			   | is[i_593_ + i_594_] << 8 & ~0xffffff);
	    }
	} else if (i_590_ == 1) {
	    for (int i_595_ = 0;
		 i_595_ < ((Class151_Sub1_Sub3) this).anInt8804; i_595_++) {
		int i_596_ = i_595_ * ((Class151_Sub1_Sub3) this).anInt8803;
		int i_597_
		    = (((i_589_ + i_595_)
			* (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					     .aClass173_Sub3_8814)).anInt9735
			   * 111437289))
		       + i);
		for (int i_598_ = 0;
		     i_598_ < ((Class151_Sub1_Sub3) this).anInt8803; i_598_++)
		    ((Class151_Sub1_Sub3) this).anIntArray11309[(i_596_
								 + i_598_)]
			= ((((Class151_Sub1_Sub3) this).anIntArray11309
			    [i_596_ + i_598_]) & 0xffffff
			   | is[i_597_ + i_598_] << 16 & ~0xffffff);
	    }
	} else if (i_590_ == 2) {
	    for (int i_599_ = 0;
		 i_599_ < ((Class151_Sub1_Sub3) this).anInt8804; i_599_++) {
		int i_600_ = i_599_ * ((Class151_Sub1_Sub3) this).anInt8803;
		int i_601_
		    = (((i_589_ + i_599_)
			* (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					     .aClass173_Sub3_8814)).anInt9735
			   * 111437289))
		       + i);
		for (int i_602_ = 0;
		     i_602_ < ((Class151_Sub1_Sub3) this).anInt8803; i_602_++)
		    ((Class151_Sub1_Sub3) this).anIntArray11309[(i_600_
								 + i_602_)]
			= ((((Class151_Sub1_Sub3) this).anIntArray11309
			    [i_600_ + i_602_]) & 0xffffff
			   | is[i_601_ + i_602_] << 24 & ~0xffffff);
	    }
	} else if (i_590_ == 3) {
	    for (int i_603_ = 0;
		 i_603_ < ((Class151_Sub1_Sub3) this).anInt8804; i_603_++) {
		int i_604_ = i_603_ * ((Class151_Sub1_Sub3) this).anInt8803;
		int i_605_
		    = (((i_589_ + i_603_)
			* (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					     .aClass173_Sub3_8814)).anInt9735
			   * 111437289))
		       + i);
		for (int i_606_ = 0;
		     i_606_ < ((Class151_Sub1_Sub3) this).anInt8803; i_606_++)
		    ((Class151_Sub1_Sub3) this).anIntArray11309[(i_604_
								 + i_606_)]
			= ((((Class151_Sub1_Sub3) this).anIntArray11309
			    [i_604_ + i_606_]) & 0xffffff
			   | (is[i_605_ + i_606_] != 0 ? -16777216 : 0));
	    }
	}
    }
    
    public void method1791(int i, int i_607_, int i_608_, int i_609_, int[] is,
			   int i_610_, int i_611_) {
	i_611_ -= i_608_;
	for (int i_612_ = 0; i_612_ < i_609_; i_612_++) {
	    int i_613_ = (i_607_ + i_612_) * i_608_ + i;
	    for (int i_614_ = 0; i_614_ < i_608_; i_614_++)
		((Class151_Sub1_Sub3) this).anIntArray11309[i_613_ + i_614_]
		    = is[i_610_++];
	    i_610_ += i_611_;
	}
    }
    
    public void method1792(int i, int i_615_, int i_616_, int i_617_, int[] is,
			   int i_618_, int i_619_) {
	i_619_ -= i_616_;
	for (int i_620_ = 0; i_620_ < i_617_; i_620_++) {
	    int i_621_ = (i_615_ + i_620_) * i_616_ + i;
	    for (int i_622_ = 0; i_622_ < i_616_; i_622_++)
		((Class151_Sub1_Sub3) this).anIntArray11309[i_621_ + i_622_]
		    = is[i_618_++];
	    i_618_ += i_619_;
	}
    }
    
    public Interface19 method1769() {
	return new Class106(((Class151_Sub1_Sub3) this).anInt8803,
			    ((Class151_Sub1_Sub3) this).anInt8804,
			    ((Class151_Sub1_Sub3) this).anIntArray11309);
    }
    
    public void method1798(int i, int i_623_, int i_624_, int i_625_, int[] is,
			   int[] is_626_, int i_627_, int i_628_) {
	method10368(i, i_623_, i_624_, i_625_, is, i_627_, i_628_);
    }
    
    public void method1795(int i, int i_629_, int i_630_, int i_631_,
			   int i_632_, int i_633_) {
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is == null)
	    throw new IllegalStateException("");
	for (int i_634_ = 0; i_634_ < i_631_; i_634_++) {
	    int i_635_ = (i_629_ + i_634_) * i_630_ + i;
	    int i_636_ = (i_633_ + i_634_) * i_630_ + i_632_;
	    for (int i_637_ = 0; i_637_ < i_630_; i_637_++)
		((Class151_Sub1_Sub3) this).anIntArray11309[i_635_ + i_637_]
		    = is[i_636_ + i_637_] & 0xffffff;
	}
    }
    
    void method10368(int i, int i_638_, int i_639_, int i_640_, int[] is,
		     int i_641_, int i_642_) {
	i_642_ -= i_639_;
	for (int i_643_ = 0; i_643_ < i_640_; i_643_++) {
	    int i_644_ = (i_638_ + i_643_) * i_639_ + i;
	    for (int i_645_ = 0; i_645_ < i_639_; i_645_++)
		is[i_641_++] = (((Class151_Sub1_Sub3) this).anIntArray11309
				[i_644_ + i_645_]);
	    i_641_ += i_642_;
	}
    }
    
    public void method1780(int i, int i_646_, int i_647_, int i_648_,
			   int i_649_) {
	if (((Class151_Sub1_Sub3) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    int i_650_ = (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					    .aClass173_Sub3_8814)).anInt9735
			  * 111437289);
	    i += ((Class151_Sub1_Sub3) this).anInt8806;
	    i_646_ += ((Class151_Sub1_Sub3) this).anInt8819;
	    int i_651_ = i_646_ * i_650_ + i;
	    int i_652_ = 0;
	    int i_653_ = ((Class151_Sub1_Sub3) this).anInt8804;
	    int i_654_ = ((Class151_Sub1_Sub3) this).anInt8803;
	    int i_655_ = i_650_ - i_654_;
	    int i_656_ = 0;
	    if (i_646_ < (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					    .aClass173_Sub3_8814)).anInt9725
			  * 592117349)) {
		int i_657_ = ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						 .aClass173_Sub3_8814))
			       .anInt9725) * 592117349
			      - i_646_);
		i_653_ -= i_657_;
		i_646_ = (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					    .aClass173_Sub3_8814)).anInt9725
			  * 592117349);
		i_652_ += i_657_ * i_654_;
		i_651_ += i_657_ * i_650_;
	    }
	    if (i_646_ + i_653_
		> ((Class173_Sub3) (((Class151_Sub1_Sub3) this)
				    .aClass173_Sub3_8814)).anInt9726 * 6965409)
		i_653_ -= (i_646_ + i_653_
			   - (((Class173_Sub3)
			       ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
			      .anInt9726) * 6965409);
	    if (i < (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119)) {
		int i_658_ = ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						 .aClass173_Sub3_8814))
			       .anInt9723) * -993497119
			      - i);
		i_654_ -= i_658_;
		i = (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119);
		i_652_ += i_658_;
		i_651_ += i_658_;
		i_656_ += i_658_;
		i_655_ += i_658_;
	    }
	    if (i + i_654_ > (((Class173_Sub3)
			       ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
			      .anInt9724) * 630968029) {
		int i_659_ = (i + i_654_
			      - (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						   .aClass173_Sub3_8814))
				 .anInt9724) * 630968029);
		i_654_ -= i_659_;
		i_656_ += i_659_;
		i_655_ += i_659_;
	    }
	    if (i_654_ > 0 && i_653_ > 0) {
		if (i_649_ == 0) {
		    if (i_647_ == 1) {
			for (int i_660_ = -i_653_; i_660_ < 0; i_660_++) {
			    int i_661_ = i_651_ + i_654_ - 3;
			    while (i_651_ < i_661_) {
				is[i_651_++] = (((Class151_Sub1_Sub3) this)
						.anIntArray11309[i_652_++]);
				is[i_651_++] = (((Class151_Sub1_Sub3) this)
						.anIntArray11309[i_652_++]);
				is[i_651_++] = (((Class151_Sub1_Sub3) this)
						.anIntArray11309[i_652_++]);
				is[i_651_++] = (((Class151_Sub1_Sub3) this)
						.anIntArray11309[i_652_++]);
			    }
			    i_661_ += 3;
			    while (i_651_ < i_661_)
				is[i_651_++] = (((Class151_Sub1_Sub3) this)
						.anIntArray11309[i_652_++]);
			    i_651_ += i_655_;
			    i_652_ += i_656_;
			}
		    } else if (i_647_ == 0) {
			int i_662_ = (i_648_ & 0xff0000) >> 16;
			int i_663_ = (i_648_ & 0xff00) >> 8;
			int i_664_ = i_648_ & 0xff;
			for (int i_665_ = -i_653_; i_665_ < 0; i_665_++) {
			    for (int i_666_ = -i_654_; i_666_ < 0; i_666_++) {
				int i_667_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_652_++]);
				int i_668_
				    = (i_667_ & 0xff0000) * i_662_ & ~0xffffff;
				int i_669_
				    = (i_667_ & 0xff00) * i_663_ & 0xff0000;
				int i_670_ = (i_667_ & 0xff) * i_664_ & 0xff00;
				is[i_651_++]
				    = (i_668_ | i_669_ | i_670_) >>> 8;
			    }
			    i_651_ += i_655_;
			    i_652_ += i_656_;
			}
		    } else if (i_647_ == 3) {
			for (int i_671_ = -i_653_; i_671_ < 0; i_671_++) {
			    for (int i_672_ = -i_654_; i_672_ < 0; i_672_++) {
				int i_673_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_652_++]);
				int i_674_ = i_673_ + i_648_;
				int i_675_ = ((i_673_ & 0xff00ff)
					      + (i_648_ & 0xff00ff));
				int i_676_ = ((i_675_ & 0x1000100)
					      + (i_674_ - i_675_ & 0x10000));
				is[i_651_++]
				    = i_674_ - i_676_ | i_676_ - (i_676_
								  >>> 8);
			    }
			    i_651_ += i_655_;
			    i_652_ += i_656_;
			}
		    } else if (i_647_ == 2) {
			int i_677_ = i_648_ >>> 24;
			int i_678_ = 256 - i_677_;
			int i_679_ = (i_648_ & 0xff00ff) * i_678_ & ~0xff00ff;
			int i_680_ = (i_648_ & 0xff00) * i_678_ & 0xff0000;
			i_648_ = (i_679_ | i_680_) >>> 8;
			for (int i_681_ = -i_653_; i_681_ < 0; i_681_++) {
			    for (int i_682_ = -i_654_; i_682_ < 0; i_682_++) {
				int i_683_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_652_++]);
				i_679_
				    = (i_683_ & 0xff00ff) * i_677_ & ~0xff00ff;
				i_680_ = (i_683_ & 0xff00) * i_677_ & 0xff0000;
				is[i_651_++]
				    = ((i_679_ | i_680_) >>> 8) + i_648_;
			    }
			    i_651_ += i_655_;
			    i_652_ += i_656_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_649_ == 1) {
		    if (i_647_ == 1) {
			for (int i_684_ = -i_653_; i_684_ < 0; i_684_++) {
			    for (int i_685_ = -i_654_; i_685_ < 0; i_685_++) {
				int i_686_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_652_++]);
				int i_687_ = i_686_ >>> 24;
				int i_688_ = 256 - i_687_;
				int i_689_ = is[i_651_];
				is[i_651_++]
				    = (((((i_686_ & 0xff00ff) * i_687_
					  + (i_689_ & 0xff00ff) * i_688_)
					 & ~0xff00ff)
					>> 8)
				       + (((((i_686_ & ~0xff00ff) >>> 8)
					    * i_687_)
					   + (((i_689_ & ~0xff00ff) >>> 8)
					      * i_688_))
					  & ~0xff00ff));
			    }
			    i_651_ += i_655_;
			    i_652_ += i_656_;
			}
		    } else if (i_647_ == 0) {
			if ((i_648_ & 0xffffff) == 16777215) {
			    for (int i_690_ = -i_653_; i_690_ < 0; i_690_++) {
				for (int i_691_ = -i_654_; i_691_ < 0;
				     i_691_++) {
				    int i_692_ = (((Class151_Sub1_Sub3) this)
						  .anIntArray11309[i_652_++]);
				    int i_693_
					= ((i_692_ >>> 24) * (i_648_ >>> 24)
					   >> 8);
				    int i_694_ = 256 - i_693_;
				    int i_695_ = is[i_651_];
				    is[i_651_++]
					= ((((i_692_ & 0xff00ff) * i_693_
					     + (i_695_ & 0xff00ff) * i_694_)
					    & ~0xff00ff)
					   + (((i_692_ & 0xff00) * i_693_
					       + (i_695_ & 0xff00) * i_694_)
					      & 0xff0000)) >> 8;
				}
				i_651_ += i_655_;
				i_652_ += i_656_;
			    }
			} else {
			    int i_696_ = (i_648_ & 0xff0000) >> 16;
			    int i_697_ = (i_648_ & 0xff00) >> 8;
			    int i_698_ = i_648_ & 0xff;
			    for (int i_699_ = -i_653_; i_699_ < 0; i_699_++) {
				for (int i_700_ = -i_654_; i_700_ < 0;
				     i_700_++) {
				    int i_701_ = (((Class151_Sub1_Sub3) this)
						  .anIntArray11309[i_652_++]);
				    int i_702_
					= ((i_701_ >>> 24) * (i_648_ >>> 24)
					   >> 8);
				    int i_703_ = 256 - i_702_;
				    if (i_702_ != 255) {
					int i_704_
					    = ((i_701_ & 0xff0000) * i_696_
					       & ~0xffffff);
					int i_705_
					    = ((i_701_ & 0xff00) * i_697_
					       & 0xff0000);
					int i_706_ = ((i_701_ & 0xff) * i_698_
						      & 0xff00);
					i_701_
					    = (i_704_ | i_705_ | i_706_) >>> 8;
					int i_707_ = is[i_651_];
					is[i_651_++]
					    = ((((i_701_ & 0xff00ff) * i_702_
						 + ((i_707_ & 0xff00ff)
						    * i_703_))
						& ~0xff00ff)
					       + (((i_701_ & 0xff00) * i_702_
						   + ((i_707_ & 0xff00)
						      * i_703_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_708_
					    = ((i_701_ & 0xff0000) * i_696_
					       & ~0xffffff);
					int i_709_
					    = ((i_701_ & 0xff00) * i_697_
					       & 0xff0000);
					int i_710_ = ((i_701_ & 0xff) * i_698_
						      & 0xff00);
					is[i_651_++]
					    = (i_708_ | i_709_ | i_710_) >>> 8;
				    }
				}
				i_651_ += i_655_;
				i_652_ += i_656_;
			    }
			}
		    } else if (i_647_ == 3) {
			for (int i_711_ = -i_653_; i_711_ < 0; i_711_++) {
			    for (int i_712_ = -i_654_; i_712_ < 0; i_712_++) {
				int i_713_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_652_++]);
				int i_714_ = i_713_ + i_648_;
				int i_715_ = ((i_713_ & 0xff00ff)
					      + (i_648_ & 0xff00ff));
				int i_716_ = ((i_715_ & 0x1000100)
					      + (i_714_ - i_715_ & 0x10000));
				i_716_ = i_714_ - i_716_ | i_716_ - (i_716_
								     >>> 8);
				int i_717_
				    = (i_716_ >>> 24) * (i_648_ >>> 24) >> 8;
				int i_718_ = 256 - i_717_;
				if (i_717_ != 255) {
				    i_713_ = i_716_;
				    i_716_ = is[i_651_];
				    i_716_ = ((((i_713_ & 0xff00ff) * i_717_
						+ (i_716_ & 0xff00ff) * i_718_)
					       & ~0xff00ff)
					      + (((i_713_ & 0xff00) * i_717_
						  + (i_716_ & 0xff00) * i_718_)
						 & 0xff0000)) >> 8;
				}
				is[i_651_++] = i_716_;
			    }
			    i_651_ += i_655_;
			    i_652_ += i_656_;
			}
		    } else if (i_647_ == 2) {
			int i_719_ = i_648_ >>> 24;
			int i_720_ = 256 - i_719_;
			int i_721_ = (i_648_ & 0xff00ff) * i_720_ & ~0xff00ff;
			int i_722_ = (i_648_ & 0xff00) * i_720_ & 0xff0000;
			i_648_ = (i_721_ | i_722_) >>> 8;
			for (int i_723_ = -i_653_; i_723_ < 0; i_723_++) {
			    for (int i_724_ = -i_654_; i_724_ < 0; i_724_++) {
				int i_725_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_652_++]);
				int i_726_ = i_725_ >>> 24;
				int i_727_ = 256 - i_726_;
				i_721_
				    = (i_725_ & 0xff00ff) * i_719_ & ~0xff00ff;
				i_722_ = (i_725_ & 0xff00) * i_719_ & 0xff0000;
				i_725_ = ((i_721_ | i_722_) >>> 8) + i_648_;
				int i_728_ = is[i_651_];
				is[i_651_++]
				    = ((((i_725_ & 0xff00ff) * i_726_
					 + (i_728_ & 0xff00ff) * i_727_)
					& ~0xff00ff)
				       + (((i_725_ & 0xff00) * i_726_
					   + (i_728_ & 0xff00) * i_727_)
					  & 0xff0000)) >> 8;
			    }
			    i_651_ += i_655_;
			    i_652_ += i_656_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_649_ == 2) {
		    if (i_647_ == 1) {
			for (int i_729_ = -i_653_; i_729_ < 0; i_729_++) {
			    for (int i_730_ = -i_654_; i_730_ < 0; i_730_++) {
				int i_731_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_652_++]);
				if (i_731_ != 0) {
				    int i_732_ = is[i_651_];
				    int i_733_ = i_731_ + i_732_;
				    int i_734_ = ((i_731_ & 0xff00ff)
						  + (i_732_ & 0xff00ff));
				    i_732_ = ((i_734_ & 0x1000100)
					      + (i_733_ - i_734_ & 0x10000));
				    is[i_651_++]
					= i_733_ - i_732_ | i_732_ - (i_732_
								      >>> 8);
				} else
				    i_651_++;
			    }
			    i_651_ += i_655_;
			    i_652_ += i_656_;
			}
		    } else if (i_647_ == 0) {
			int i_735_ = (i_648_ & 0xff0000) >> 16;
			int i_736_ = (i_648_ & 0xff00) >> 8;
			int i_737_ = i_648_ & 0xff;
			for (int i_738_ = -i_653_; i_738_ < 0; i_738_++) {
			    for (int i_739_ = -i_654_; i_739_ < 0; i_739_++) {
				int i_740_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_652_++]);
				if (i_740_ != 0) {
				    int i_741_ = ((i_740_ & 0xff0000) * i_735_
						  & ~0xffffff);
				    int i_742_ = ((i_740_ & 0xff00) * i_736_
						  & 0xff0000);
				    int i_743_
					= (i_740_ & 0xff) * i_737_ & 0xff00;
				    i_740_ = (i_741_ | i_742_ | i_743_) >>> 8;
				    int i_744_ = is[i_651_];
				    int i_745_ = i_740_ + i_744_;
				    int i_746_ = ((i_740_ & 0xff00ff)
						  + (i_744_ & 0xff00ff));
				    i_744_ = ((i_746_ & 0x1000100)
					      + (i_745_ - i_746_ & 0x10000));
				    is[i_651_++]
					= i_745_ - i_744_ | i_744_ - (i_744_
								      >>> 8);
				} else
				    i_651_++;
			    }
			    i_651_ += i_655_;
			    i_652_ += i_656_;
			}
		    } else if (i_647_ == 3) {
			for (int i_747_ = -i_653_; i_747_ < 0; i_747_++) {
			    for (int i_748_ = -i_654_; i_748_ < 0; i_748_++) {
				int i_749_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_652_++]);
				int i_750_ = i_749_ + i_648_;
				int i_751_ = ((i_749_ & 0xff00ff)
					      + (i_648_ & 0xff00ff));
				int i_752_ = ((i_751_ & 0x1000100)
					      + (i_750_ - i_751_ & 0x10000));
				i_749_ = i_750_ - i_752_ | i_752_ - (i_752_
								     >>> 8);
				i_752_ = is[i_651_];
				i_750_ = i_749_ + i_752_;
				i_751_ = (i_749_ & 0xff00ff) + (i_752_
								& 0xff00ff);
				i_752_
				    = (i_751_ & 0x1000100) + (i_750_ - i_751_
							      & 0x10000);
				is[i_651_++]
				    = i_750_ - i_752_ | i_752_ - (i_752_
								  >>> 8);
			    }
			    i_651_ += i_655_;
			    i_652_ += i_656_;
			}
		    } else if (i_647_ == 2) {
			int i_753_ = i_648_ >>> 24;
			int i_754_ = 256 - i_753_;
			int i_755_ = (i_648_ & 0xff00ff) * i_754_ & ~0xff00ff;
			int i_756_ = (i_648_ & 0xff00) * i_754_ & 0xff0000;
			i_648_ = (i_755_ | i_756_) >>> 8;
			for (int i_757_ = -i_653_; i_757_ < 0; i_757_++) {
			    for (int i_758_ = -i_654_; i_758_ < 0; i_758_++) {
				int i_759_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_652_++]);
				if (i_759_ != 0) {
				    i_755_ = ((i_759_ & 0xff00ff) * i_753_
					      & ~0xff00ff);
				    i_756_ = ((i_759_ & 0xff00) * i_753_
					      & 0xff0000);
				    i_759_
					= ((i_755_ | i_756_) >>> 8) + i_648_;
				    int i_760_ = is[i_651_];
				    int i_761_ = i_759_ + i_760_;
				    int i_762_ = ((i_759_ & 0xff00ff)
						  + (i_760_ & 0xff00ff));
				    i_760_ = ((i_762_ & 0x1000100)
					      + (i_761_ - i_762_ & 0x10000));
				    is[i_651_++]
					= i_761_ - i_760_ | i_760_ - (i_760_
								      >>> 8);
				} else
				    i_651_++;
			    }
			    i_651_ += i_655_;
			    i_652_ += i_656_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method1803(int i, int i_763_, int i_764_, int i_765_,
			   int i_766_) {
	if (((Class151_Sub1_Sub3) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    int i_767_ = (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					    .aClass173_Sub3_8814)).anInt9735
			  * 111437289);
	    i += ((Class151_Sub1_Sub3) this).anInt8806;
	    i_763_ += ((Class151_Sub1_Sub3) this).anInt8819;
	    int i_768_ = i_763_ * i_767_ + i;
	    int i_769_ = 0;
	    int i_770_ = ((Class151_Sub1_Sub3) this).anInt8804;
	    int i_771_ = ((Class151_Sub1_Sub3) this).anInt8803;
	    int i_772_ = i_767_ - i_771_;
	    int i_773_ = 0;
	    if (i_763_ < (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					    .aClass173_Sub3_8814)).anInt9725
			  * 592117349)) {
		int i_774_ = ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						 .aClass173_Sub3_8814))
			       .anInt9725) * 592117349
			      - i_763_);
		i_770_ -= i_774_;
		i_763_ = (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					    .aClass173_Sub3_8814)).anInt9725
			  * 592117349);
		i_769_ += i_774_ * i_771_;
		i_768_ += i_774_ * i_767_;
	    }
	    if (i_763_ + i_770_
		> ((Class173_Sub3) (((Class151_Sub1_Sub3) this)
				    .aClass173_Sub3_8814)).anInt9726 * 6965409)
		i_770_ -= (i_763_ + i_770_
			   - (((Class173_Sub3)
			       ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
			      .anInt9726) * 6965409);
	    if (i < (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119)) {
		int i_775_ = ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						 .aClass173_Sub3_8814))
			       .anInt9723) * -993497119
			      - i);
		i_771_ -= i_775_;
		i = (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119);
		i_769_ += i_775_;
		i_768_ += i_775_;
		i_773_ += i_775_;
		i_772_ += i_775_;
	    }
	    if (i + i_771_ > (((Class173_Sub3)
			       ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
			      .anInt9724) * 630968029) {
		int i_776_ = (i + i_771_
			      - (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						   .aClass173_Sub3_8814))
				 .anInt9724) * 630968029);
		i_771_ -= i_776_;
		i_773_ += i_776_;
		i_772_ += i_776_;
	    }
	    if (i_771_ > 0 && i_770_ > 0) {
		if (i_766_ == 0) {
		    if (i_764_ == 1) {
			for (int i_777_ = -i_770_; i_777_ < 0; i_777_++) {
			    int i_778_ = i_768_ + i_771_ - 3;
			    while (i_768_ < i_778_) {
				is[i_768_++] = (((Class151_Sub1_Sub3) this)
						.anIntArray11309[i_769_++]);
				is[i_768_++] = (((Class151_Sub1_Sub3) this)
						.anIntArray11309[i_769_++]);
				is[i_768_++] = (((Class151_Sub1_Sub3) this)
						.anIntArray11309[i_769_++]);
				is[i_768_++] = (((Class151_Sub1_Sub3) this)
						.anIntArray11309[i_769_++]);
			    }
			    i_778_ += 3;
			    while (i_768_ < i_778_)
				is[i_768_++] = (((Class151_Sub1_Sub3) this)
						.anIntArray11309[i_769_++]);
			    i_768_ += i_772_;
			    i_769_ += i_773_;
			}
		    } else if (i_764_ == 0) {
			int i_779_ = (i_765_ & 0xff0000) >> 16;
			int i_780_ = (i_765_ & 0xff00) >> 8;
			int i_781_ = i_765_ & 0xff;
			for (int i_782_ = -i_770_; i_782_ < 0; i_782_++) {
			    for (int i_783_ = -i_771_; i_783_ < 0; i_783_++) {
				int i_784_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_769_++]);
				int i_785_
				    = (i_784_ & 0xff0000) * i_779_ & ~0xffffff;
				int i_786_
				    = (i_784_ & 0xff00) * i_780_ & 0xff0000;
				int i_787_ = (i_784_ & 0xff) * i_781_ & 0xff00;
				is[i_768_++]
				    = (i_785_ | i_786_ | i_787_) >>> 8;
			    }
			    i_768_ += i_772_;
			    i_769_ += i_773_;
			}
		    } else if (i_764_ == 3) {
			for (int i_788_ = -i_770_; i_788_ < 0; i_788_++) {
			    for (int i_789_ = -i_771_; i_789_ < 0; i_789_++) {
				int i_790_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_769_++]);
				int i_791_ = i_790_ + i_765_;
				int i_792_ = ((i_790_ & 0xff00ff)
					      + (i_765_ & 0xff00ff));
				int i_793_ = ((i_792_ & 0x1000100)
					      + (i_791_ - i_792_ & 0x10000));
				is[i_768_++]
				    = i_791_ - i_793_ | i_793_ - (i_793_
								  >>> 8);
			    }
			    i_768_ += i_772_;
			    i_769_ += i_773_;
			}
		    } else if (i_764_ == 2) {
			int i_794_ = i_765_ >>> 24;
			int i_795_ = 256 - i_794_;
			int i_796_ = (i_765_ & 0xff00ff) * i_795_ & ~0xff00ff;
			int i_797_ = (i_765_ & 0xff00) * i_795_ & 0xff0000;
			i_765_ = (i_796_ | i_797_) >>> 8;
			for (int i_798_ = -i_770_; i_798_ < 0; i_798_++) {
			    for (int i_799_ = -i_771_; i_799_ < 0; i_799_++) {
				int i_800_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_769_++]);
				i_796_
				    = (i_800_ & 0xff00ff) * i_794_ & ~0xff00ff;
				i_797_ = (i_800_ & 0xff00) * i_794_ & 0xff0000;
				is[i_768_++]
				    = ((i_796_ | i_797_) >>> 8) + i_765_;
			    }
			    i_768_ += i_772_;
			    i_769_ += i_773_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_766_ == 1) {
		    if (i_764_ == 1) {
			for (int i_801_ = -i_770_; i_801_ < 0; i_801_++) {
			    for (int i_802_ = -i_771_; i_802_ < 0; i_802_++) {
				int i_803_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_769_++]);
				int i_804_ = i_803_ >>> 24;
				int i_805_ = 256 - i_804_;
				int i_806_ = is[i_768_];
				is[i_768_++]
				    = (((((i_803_ & 0xff00ff) * i_804_
					  + (i_806_ & 0xff00ff) * i_805_)
					 & ~0xff00ff)
					>> 8)
				       + (((((i_803_ & ~0xff00ff) >>> 8)
					    * i_804_)
					   + (((i_806_ & ~0xff00ff) >>> 8)
					      * i_805_))
					  & ~0xff00ff));
			    }
			    i_768_ += i_772_;
			    i_769_ += i_773_;
			}
		    } else if (i_764_ == 0) {
			if ((i_765_ & 0xffffff) == 16777215) {
			    for (int i_807_ = -i_770_; i_807_ < 0; i_807_++) {
				for (int i_808_ = -i_771_; i_808_ < 0;
				     i_808_++) {
				    int i_809_ = (((Class151_Sub1_Sub3) this)
						  .anIntArray11309[i_769_++]);
				    int i_810_
					= ((i_809_ >>> 24) * (i_765_ >>> 24)
					   >> 8);
				    int i_811_ = 256 - i_810_;
				    int i_812_ = is[i_768_];
				    is[i_768_++]
					= ((((i_809_ & 0xff00ff) * i_810_
					     + (i_812_ & 0xff00ff) * i_811_)
					    & ~0xff00ff)
					   + (((i_809_ & 0xff00) * i_810_
					       + (i_812_ & 0xff00) * i_811_)
					      & 0xff0000)) >> 8;
				}
				i_768_ += i_772_;
				i_769_ += i_773_;
			    }
			} else {
			    int i_813_ = (i_765_ & 0xff0000) >> 16;
			    int i_814_ = (i_765_ & 0xff00) >> 8;
			    int i_815_ = i_765_ & 0xff;
			    for (int i_816_ = -i_770_; i_816_ < 0; i_816_++) {
				for (int i_817_ = -i_771_; i_817_ < 0;
				     i_817_++) {
				    int i_818_ = (((Class151_Sub1_Sub3) this)
						  .anIntArray11309[i_769_++]);
				    int i_819_
					= ((i_818_ >>> 24) * (i_765_ >>> 24)
					   >> 8);
				    int i_820_ = 256 - i_819_;
				    if (i_819_ != 255) {
					int i_821_
					    = ((i_818_ & 0xff0000) * i_813_
					       & ~0xffffff);
					int i_822_
					    = ((i_818_ & 0xff00) * i_814_
					       & 0xff0000);
					int i_823_ = ((i_818_ & 0xff) * i_815_
						      & 0xff00);
					i_818_
					    = (i_821_ | i_822_ | i_823_) >>> 8;
					int i_824_ = is[i_768_];
					is[i_768_++]
					    = ((((i_818_ & 0xff00ff) * i_819_
						 + ((i_824_ & 0xff00ff)
						    * i_820_))
						& ~0xff00ff)
					       + (((i_818_ & 0xff00) * i_819_
						   + ((i_824_ & 0xff00)
						      * i_820_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_825_
					    = ((i_818_ & 0xff0000) * i_813_
					       & ~0xffffff);
					int i_826_
					    = ((i_818_ & 0xff00) * i_814_
					       & 0xff0000);
					int i_827_ = ((i_818_ & 0xff) * i_815_
						      & 0xff00);
					is[i_768_++]
					    = (i_825_ | i_826_ | i_827_) >>> 8;
				    }
				}
				i_768_ += i_772_;
				i_769_ += i_773_;
			    }
			}
		    } else if (i_764_ == 3) {
			for (int i_828_ = -i_770_; i_828_ < 0; i_828_++) {
			    for (int i_829_ = -i_771_; i_829_ < 0; i_829_++) {
				int i_830_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_769_++]);
				int i_831_ = i_830_ + i_765_;
				int i_832_ = ((i_830_ & 0xff00ff)
					      + (i_765_ & 0xff00ff));
				int i_833_ = ((i_832_ & 0x1000100)
					      + (i_831_ - i_832_ & 0x10000));
				i_833_ = i_831_ - i_833_ | i_833_ - (i_833_
								     >>> 8);
				int i_834_
				    = (i_833_ >>> 24) * (i_765_ >>> 24) >> 8;
				int i_835_ = 256 - i_834_;
				if (i_834_ != 255) {
				    i_830_ = i_833_;
				    i_833_ = is[i_768_];
				    i_833_ = ((((i_830_ & 0xff00ff) * i_834_
						+ (i_833_ & 0xff00ff) * i_835_)
					       & ~0xff00ff)
					      + (((i_830_ & 0xff00) * i_834_
						  + (i_833_ & 0xff00) * i_835_)
						 & 0xff0000)) >> 8;
				}
				is[i_768_++] = i_833_;
			    }
			    i_768_ += i_772_;
			    i_769_ += i_773_;
			}
		    } else if (i_764_ == 2) {
			int i_836_ = i_765_ >>> 24;
			int i_837_ = 256 - i_836_;
			int i_838_ = (i_765_ & 0xff00ff) * i_837_ & ~0xff00ff;
			int i_839_ = (i_765_ & 0xff00) * i_837_ & 0xff0000;
			i_765_ = (i_838_ | i_839_) >>> 8;
			for (int i_840_ = -i_770_; i_840_ < 0; i_840_++) {
			    for (int i_841_ = -i_771_; i_841_ < 0; i_841_++) {
				int i_842_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_769_++]);
				int i_843_ = i_842_ >>> 24;
				int i_844_ = 256 - i_843_;
				i_838_
				    = (i_842_ & 0xff00ff) * i_836_ & ~0xff00ff;
				i_839_ = (i_842_ & 0xff00) * i_836_ & 0xff0000;
				i_842_ = ((i_838_ | i_839_) >>> 8) + i_765_;
				int i_845_ = is[i_768_];
				is[i_768_++]
				    = ((((i_842_ & 0xff00ff) * i_843_
					 + (i_845_ & 0xff00ff) * i_844_)
					& ~0xff00ff)
				       + (((i_842_ & 0xff00) * i_843_
					   + (i_845_ & 0xff00) * i_844_)
					  & 0xff0000)) >> 8;
			    }
			    i_768_ += i_772_;
			    i_769_ += i_773_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_766_ == 2) {
		    if (i_764_ == 1) {
			for (int i_846_ = -i_770_; i_846_ < 0; i_846_++) {
			    for (int i_847_ = -i_771_; i_847_ < 0; i_847_++) {
				int i_848_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_769_++]);
				if (i_848_ != 0) {
				    int i_849_ = is[i_768_];
				    int i_850_ = i_848_ + i_849_;
				    int i_851_ = ((i_848_ & 0xff00ff)
						  + (i_849_ & 0xff00ff));
				    i_849_ = ((i_851_ & 0x1000100)
					      + (i_850_ - i_851_ & 0x10000));
				    is[i_768_++]
					= i_850_ - i_849_ | i_849_ - (i_849_
								      >>> 8);
				} else
				    i_768_++;
			    }
			    i_768_ += i_772_;
			    i_769_ += i_773_;
			}
		    } else if (i_764_ == 0) {
			int i_852_ = (i_765_ & 0xff0000) >> 16;
			int i_853_ = (i_765_ & 0xff00) >> 8;
			int i_854_ = i_765_ & 0xff;
			for (int i_855_ = -i_770_; i_855_ < 0; i_855_++) {
			    for (int i_856_ = -i_771_; i_856_ < 0; i_856_++) {
				int i_857_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_769_++]);
				if (i_857_ != 0) {
				    int i_858_ = ((i_857_ & 0xff0000) * i_852_
						  & ~0xffffff);
				    int i_859_ = ((i_857_ & 0xff00) * i_853_
						  & 0xff0000);
				    int i_860_
					= (i_857_ & 0xff) * i_854_ & 0xff00;
				    i_857_ = (i_858_ | i_859_ | i_860_) >>> 8;
				    int i_861_ = is[i_768_];
				    int i_862_ = i_857_ + i_861_;
				    int i_863_ = ((i_857_ & 0xff00ff)
						  + (i_861_ & 0xff00ff));
				    i_861_ = ((i_863_ & 0x1000100)
					      + (i_862_ - i_863_ & 0x10000));
				    is[i_768_++]
					= i_862_ - i_861_ | i_861_ - (i_861_
								      >>> 8);
				} else
				    i_768_++;
			    }
			    i_768_ += i_772_;
			    i_769_ += i_773_;
			}
		    } else if (i_764_ == 3) {
			for (int i_864_ = -i_770_; i_864_ < 0; i_864_++) {
			    for (int i_865_ = -i_771_; i_865_ < 0; i_865_++) {
				int i_866_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_769_++]);
				int i_867_ = i_866_ + i_765_;
				int i_868_ = ((i_866_ & 0xff00ff)
					      + (i_765_ & 0xff00ff));
				int i_869_ = ((i_868_ & 0x1000100)
					      + (i_867_ - i_868_ & 0x10000));
				i_866_ = i_867_ - i_869_ | i_869_ - (i_869_
								     >>> 8);
				i_869_ = is[i_768_];
				i_867_ = i_866_ + i_869_;
				i_868_ = (i_866_ & 0xff00ff) + (i_869_
								& 0xff00ff);
				i_869_
				    = (i_868_ & 0x1000100) + (i_867_ - i_868_
							      & 0x10000);
				is[i_768_++]
				    = i_867_ - i_869_ | i_869_ - (i_869_
								  >>> 8);
			    }
			    i_768_ += i_772_;
			    i_769_ += i_773_;
			}
		    } else if (i_764_ == 2) {
			int i_870_ = i_765_ >>> 24;
			int i_871_ = 256 - i_870_;
			int i_872_ = (i_765_ & 0xff00ff) * i_871_ & ~0xff00ff;
			int i_873_ = (i_765_ & 0xff00) * i_871_ & 0xff0000;
			i_765_ = (i_872_ | i_873_) >>> 8;
			for (int i_874_ = -i_770_; i_874_ < 0; i_874_++) {
			    for (int i_875_ = -i_771_; i_875_ < 0; i_875_++) {
				int i_876_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_769_++]);
				if (i_876_ != 0) {
				    i_872_ = ((i_876_ & 0xff00ff) * i_870_
					      & ~0xff00ff);
				    i_873_ = ((i_876_ & 0xff00) * i_870_
					      & 0xff0000);
				    i_876_
					= ((i_872_ | i_873_) >>> 8) + i_765_;
				    int i_877_ = is[i_768_];
				    int i_878_ = i_876_ + i_877_;
				    int i_879_ = ((i_876_ & 0xff00ff)
						  + (i_877_ & 0xff00ff));
				    i_877_ = ((i_879_ & 0x1000100)
					      + (i_878_ - i_879_ & 0x10000));
				    is[i_768_++]
					= i_878_ - i_877_ | i_877_ - (i_877_
								      >>> 8);
				} else
				    i_768_++;
			    }
			    i_768_ += i_772_;
			    i_769_ += i_773_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public Interface19 method1799() {
	return new Class106(((Class151_Sub1_Sub3) this).anInt8803,
			    ((Class151_Sub1_Sub3) this).anInt8804,
			    ((Class151_Sub1_Sub3) this).anIntArray11309);
    }
    
    public Interface19 method1800() {
	return new Class106(((Class151_Sub1_Sub3) this).anInt8803,
			    ((Class151_Sub1_Sub3) this).anInt8804,
			    ((Class151_Sub1_Sub3) this).anIntArray11309);
    }
    
    public void method1811(int i, int i_880_, int i_881_, int i_882_,
			   int i_883_) {
	if (((Class151_Sub1_Sub3) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    int i_884_ = (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					    .aClass173_Sub3_8814)).anInt9735
			  * 111437289);
	    i += ((Class151_Sub1_Sub3) this).anInt8806;
	    i_880_ += ((Class151_Sub1_Sub3) this).anInt8819;
	    int i_885_ = i_880_ * i_884_ + i;
	    int i_886_ = 0;
	    int i_887_ = ((Class151_Sub1_Sub3) this).anInt8804;
	    int i_888_ = ((Class151_Sub1_Sub3) this).anInt8803;
	    int i_889_ = i_884_ - i_888_;
	    int i_890_ = 0;
	    if (i_880_ < (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					    .aClass173_Sub3_8814)).anInt9725
			  * 592117349)) {
		int i_891_ = ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						 .aClass173_Sub3_8814))
			       .anInt9725) * 592117349
			      - i_880_);
		i_887_ -= i_891_;
		i_880_ = (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					    .aClass173_Sub3_8814)).anInt9725
			  * 592117349);
		i_886_ += i_891_ * i_888_;
		i_885_ += i_891_ * i_884_;
	    }
	    if (i_880_ + i_887_
		> ((Class173_Sub3) (((Class151_Sub1_Sub3) this)
				    .aClass173_Sub3_8814)).anInt9726 * 6965409)
		i_887_ -= (i_880_ + i_887_
			   - (((Class173_Sub3)
			       ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
			      .anInt9726) * 6965409);
	    if (i < (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119)) {
		int i_892_ = ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						 .aClass173_Sub3_8814))
			       .anInt9723) * -993497119
			      - i);
		i_888_ -= i_892_;
		i = (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119);
		i_886_ += i_892_;
		i_885_ += i_892_;
		i_890_ += i_892_;
		i_889_ += i_892_;
	    }
	    if (i + i_888_ > (((Class173_Sub3)
			       ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
			      .anInt9724) * 630968029) {
		int i_893_ = (i + i_888_
			      - (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						   .aClass173_Sub3_8814))
				 .anInt9724) * 630968029);
		i_888_ -= i_893_;
		i_890_ += i_893_;
		i_889_ += i_893_;
	    }
	    if (i_888_ > 0 && i_887_ > 0) {
		if (i_883_ == 0) {
		    if (i_881_ == 1) {
			for (int i_894_ = -i_887_; i_894_ < 0; i_894_++) {
			    int i_895_ = i_885_ + i_888_ - 3;
			    while (i_885_ < i_895_) {
				is[i_885_++] = (((Class151_Sub1_Sub3) this)
						.anIntArray11309[i_886_++]);
				is[i_885_++] = (((Class151_Sub1_Sub3) this)
						.anIntArray11309[i_886_++]);
				is[i_885_++] = (((Class151_Sub1_Sub3) this)
						.anIntArray11309[i_886_++]);
				is[i_885_++] = (((Class151_Sub1_Sub3) this)
						.anIntArray11309[i_886_++]);
			    }
			    i_895_ += 3;
			    while (i_885_ < i_895_)
				is[i_885_++] = (((Class151_Sub1_Sub3) this)
						.anIntArray11309[i_886_++]);
			    i_885_ += i_889_;
			    i_886_ += i_890_;
			}
		    } else if (i_881_ == 0) {
			int i_896_ = (i_882_ & 0xff0000) >> 16;
			int i_897_ = (i_882_ & 0xff00) >> 8;
			int i_898_ = i_882_ & 0xff;
			for (int i_899_ = -i_887_; i_899_ < 0; i_899_++) {
			    for (int i_900_ = -i_888_; i_900_ < 0; i_900_++) {
				int i_901_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_886_++]);
				int i_902_
				    = (i_901_ & 0xff0000) * i_896_ & ~0xffffff;
				int i_903_
				    = (i_901_ & 0xff00) * i_897_ & 0xff0000;
				int i_904_ = (i_901_ & 0xff) * i_898_ & 0xff00;
				is[i_885_++]
				    = (i_902_ | i_903_ | i_904_) >>> 8;
			    }
			    i_885_ += i_889_;
			    i_886_ += i_890_;
			}
		    } else if (i_881_ == 3) {
			for (int i_905_ = -i_887_; i_905_ < 0; i_905_++) {
			    for (int i_906_ = -i_888_; i_906_ < 0; i_906_++) {
				int i_907_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_886_++]);
				int i_908_ = i_907_ + i_882_;
				int i_909_ = ((i_907_ & 0xff00ff)
					      + (i_882_ & 0xff00ff));
				int i_910_ = ((i_909_ & 0x1000100)
					      + (i_908_ - i_909_ & 0x10000));
				is[i_885_++]
				    = i_908_ - i_910_ | i_910_ - (i_910_
								  >>> 8);
			    }
			    i_885_ += i_889_;
			    i_886_ += i_890_;
			}
		    } else if (i_881_ == 2) {
			int i_911_ = i_882_ >>> 24;
			int i_912_ = 256 - i_911_;
			int i_913_ = (i_882_ & 0xff00ff) * i_912_ & ~0xff00ff;
			int i_914_ = (i_882_ & 0xff00) * i_912_ & 0xff0000;
			i_882_ = (i_913_ | i_914_) >>> 8;
			for (int i_915_ = -i_887_; i_915_ < 0; i_915_++) {
			    for (int i_916_ = -i_888_; i_916_ < 0; i_916_++) {
				int i_917_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_886_++]);
				i_913_
				    = (i_917_ & 0xff00ff) * i_911_ & ~0xff00ff;
				i_914_ = (i_917_ & 0xff00) * i_911_ & 0xff0000;
				is[i_885_++]
				    = ((i_913_ | i_914_) >>> 8) + i_882_;
			    }
			    i_885_ += i_889_;
			    i_886_ += i_890_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_883_ == 1) {
		    if (i_881_ == 1) {
			for (int i_918_ = -i_887_; i_918_ < 0; i_918_++) {
			    for (int i_919_ = -i_888_; i_919_ < 0; i_919_++) {
				int i_920_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_886_++]);
				int i_921_ = i_920_ >>> 24;
				int i_922_ = 256 - i_921_;
				int i_923_ = is[i_885_];
				is[i_885_++]
				    = (((((i_920_ & 0xff00ff) * i_921_
					  + (i_923_ & 0xff00ff) * i_922_)
					 & ~0xff00ff)
					>> 8)
				       + (((((i_920_ & ~0xff00ff) >>> 8)
					    * i_921_)
					   + (((i_923_ & ~0xff00ff) >>> 8)
					      * i_922_))
					  & ~0xff00ff));
			    }
			    i_885_ += i_889_;
			    i_886_ += i_890_;
			}
		    } else if (i_881_ == 0) {
			if ((i_882_ & 0xffffff) == 16777215) {
			    for (int i_924_ = -i_887_; i_924_ < 0; i_924_++) {
				for (int i_925_ = -i_888_; i_925_ < 0;
				     i_925_++) {
				    int i_926_ = (((Class151_Sub1_Sub3) this)
						  .anIntArray11309[i_886_++]);
				    int i_927_
					= ((i_926_ >>> 24) * (i_882_ >>> 24)
					   >> 8);
				    int i_928_ = 256 - i_927_;
				    int i_929_ = is[i_885_];
				    is[i_885_++]
					= ((((i_926_ & 0xff00ff) * i_927_
					     + (i_929_ & 0xff00ff) * i_928_)
					    & ~0xff00ff)
					   + (((i_926_ & 0xff00) * i_927_
					       + (i_929_ & 0xff00) * i_928_)
					      & 0xff0000)) >> 8;
				}
				i_885_ += i_889_;
				i_886_ += i_890_;
			    }
			} else {
			    int i_930_ = (i_882_ & 0xff0000) >> 16;
			    int i_931_ = (i_882_ & 0xff00) >> 8;
			    int i_932_ = i_882_ & 0xff;
			    for (int i_933_ = -i_887_; i_933_ < 0; i_933_++) {
				for (int i_934_ = -i_888_; i_934_ < 0;
				     i_934_++) {
				    int i_935_ = (((Class151_Sub1_Sub3) this)
						  .anIntArray11309[i_886_++]);
				    int i_936_
					= ((i_935_ >>> 24) * (i_882_ >>> 24)
					   >> 8);
				    int i_937_ = 256 - i_936_;
				    if (i_936_ != 255) {
					int i_938_
					    = ((i_935_ & 0xff0000) * i_930_
					       & ~0xffffff);
					int i_939_
					    = ((i_935_ & 0xff00) * i_931_
					       & 0xff0000);
					int i_940_ = ((i_935_ & 0xff) * i_932_
						      & 0xff00);
					i_935_
					    = (i_938_ | i_939_ | i_940_) >>> 8;
					int i_941_ = is[i_885_];
					is[i_885_++]
					    = ((((i_935_ & 0xff00ff) * i_936_
						 + ((i_941_ & 0xff00ff)
						    * i_937_))
						& ~0xff00ff)
					       + (((i_935_ & 0xff00) * i_936_
						   + ((i_941_ & 0xff00)
						      * i_937_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_942_
					    = ((i_935_ & 0xff0000) * i_930_
					       & ~0xffffff);
					int i_943_
					    = ((i_935_ & 0xff00) * i_931_
					       & 0xff0000);
					int i_944_ = ((i_935_ & 0xff) * i_932_
						      & 0xff00);
					is[i_885_++]
					    = (i_942_ | i_943_ | i_944_) >>> 8;
				    }
				}
				i_885_ += i_889_;
				i_886_ += i_890_;
			    }
			}
		    } else if (i_881_ == 3) {
			for (int i_945_ = -i_887_; i_945_ < 0; i_945_++) {
			    for (int i_946_ = -i_888_; i_946_ < 0; i_946_++) {
				int i_947_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_886_++]);
				int i_948_ = i_947_ + i_882_;
				int i_949_ = ((i_947_ & 0xff00ff)
					      + (i_882_ & 0xff00ff));
				int i_950_ = ((i_949_ & 0x1000100)
					      + (i_948_ - i_949_ & 0x10000));
				i_950_ = i_948_ - i_950_ | i_950_ - (i_950_
								     >>> 8);
				int i_951_
				    = (i_950_ >>> 24) * (i_882_ >>> 24) >> 8;
				int i_952_ = 256 - i_951_;
				if (i_951_ != 255) {
				    i_947_ = i_950_;
				    i_950_ = is[i_885_];
				    i_950_ = ((((i_947_ & 0xff00ff) * i_951_
						+ (i_950_ & 0xff00ff) * i_952_)
					       & ~0xff00ff)
					      + (((i_947_ & 0xff00) * i_951_
						  + (i_950_ & 0xff00) * i_952_)
						 & 0xff0000)) >> 8;
				}
				is[i_885_++] = i_950_;
			    }
			    i_885_ += i_889_;
			    i_886_ += i_890_;
			}
		    } else if (i_881_ == 2) {
			int i_953_ = i_882_ >>> 24;
			int i_954_ = 256 - i_953_;
			int i_955_ = (i_882_ & 0xff00ff) * i_954_ & ~0xff00ff;
			int i_956_ = (i_882_ & 0xff00) * i_954_ & 0xff0000;
			i_882_ = (i_955_ | i_956_) >>> 8;
			for (int i_957_ = -i_887_; i_957_ < 0; i_957_++) {
			    for (int i_958_ = -i_888_; i_958_ < 0; i_958_++) {
				int i_959_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_886_++]);
				int i_960_ = i_959_ >>> 24;
				int i_961_ = 256 - i_960_;
				i_955_
				    = (i_959_ & 0xff00ff) * i_953_ & ~0xff00ff;
				i_956_ = (i_959_ & 0xff00) * i_953_ & 0xff0000;
				i_959_ = ((i_955_ | i_956_) >>> 8) + i_882_;
				int i_962_ = is[i_885_];
				is[i_885_++]
				    = ((((i_959_ & 0xff00ff) * i_960_
					 + (i_962_ & 0xff00ff) * i_961_)
					& ~0xff00ff)
				       + (((i_959_ & 0xff00) * i_960_
					   + (i_962_ & 0xff00) * i_961_)
					  & 0xff0000)) >> 8;
			    }
			    i_885_ += i_889_;
			    i_886_ += i_890_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_883_ == 2) {
		    if (i_881_ == 1) {
			for (int i_963_ = -i_887_; i_963_ < 0; i_963_++) {
			    for (int i_964_ = -i_888_; i_964_ < 0; i_964_++) {
				int i_965_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_886_++]);
				if (i_965_ != 0) {
				    int i_966_ = is[i_885_];
				    int i_967_ = i_965_ + i_966_;
				    int i_968_ = ((i_965_ & 0xff00ff)
						  + (i_966_ & 0xff00ff));
				    i_966_ = ((i_968_ & 0x1000100)
					      + (i_967_ - i_968_ & 0x10000));
				    is[i_885_++]
					= i_967_ - i_966_ | i_966_ - (i_966_
								      >>> 8);
				} else
				    i_885_++;
			    }
			    i_885_ += i_889_;
			    i_886_ += i_890_;
			}
		    } else if (i_881_ == 0) {
			int i_969_ = (i_882_ & 0xff0000) >> 16;
			int i_970_ = (i_882_ & 0xff00) >> 8;
			int i_971_ = i_882_ & 0xff;
			for (int i_972_ = -i_887_; i_972_ < 0; i_972_++) {
			    for (int i_973_ = -i_888_; i_973_ < 0; i_973_++) {
				int i_974_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_886_++]);
				if (i_974_ != 0) {
				    int i_975_ = ((i_974_ & 0xff0000) * i_969_
						  & ~0xffffff);
				    int i_976_ = ((i_974_ & 0xff00) * i_970_
						  & 0xff0000);
				    int i_977_
					= (i_974_ & 0xff) * i_971_ & 0xff00;
				    i_974_ = (i_975_ | i_976_ | i_977_) >>> 8;
				    int i_978_ = is[i_885_];
				    int i_979_ = i_974_ + i_978_;
				    int i_980_ = ((i_974_ & 0xff00ff)
						  + (i_978_ & 0xff00ff));
				    i_978_ = ((i_980_ & 0x1000100)
					      + (i_979_ - i_980_ & 0x10000));
				    is[i_885_++]
					= i_979_ - i_978_ | i_978_ - (i_978_
								      >>> 8);
				} else
				    i_885_++;
			    }
			    i_885_ += i_889_;
			    i_886_ += i_890_;
			}
		    } else if (i_881_ == 3) {
			for (int i_981_ = -i_887_; i_981_ < 0; i_981_++) {
			    for (int i_982_ = -i_888_; i_982_ < 0; i_982_++) {
				int i_983_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_886_++]);
				int i_984_ = i_983_ + i_882_;
				int i_985_ = ((i_983_ & 0xff00ff)
					      + (i_882_ & 0xff00ff));
				int i_986_ = ((i_985_ & 0x1000100)
					      + (i_984_ - i_985_ & 0x10000));
				i_983_ = i_984_ - i_986_ | i_986_ - (i_986_
								     >>> 8);
				i_986_ = is[i_885_];
				i_984_ = i_983_ + i_986_;
				i_985_ = (i_983_ & 0xff00ff) + (i_986_
								& 0xff00ff);
				i_986_
				    = (i_985_ & 0x1000100) + (i_984_ - i_985_
							      & 0x10000);
				is[i_885_++]
				    = i_984_ - i_986_ | i_986_ - (i_986_
								  >>> 8);
			    }
			    i_885_ += i_889_;
			    i_886_ += i_890_;
			}
		    } else if (i_881_ == 2) {
			int i_987_ = i_882_ >>> 24;
			int i_988_ = 256 - i_987_;
			int i_989_ = (i_882_ & 0xff00ff) * i_988_ & ~0xff00ff;
			int i_990_ = (i_882_ & 0xff00) * i_988_ & 0xff0000;
			i_882_ = (i_989_ | i_990_) >>> 8;
			for (int i_991_ = -i_887_; i_991_ < 0; i_991_++) {
			    for (int i_992_ = -i_888_; i_992_ < 0; i_992_++) {
				int i_993_ = (((Class151_Sub1_Sub3) this)
					      .anIntArray11309[i_886_++]);
				if (i_993_ != 0) {
				    i_989_ = ((i_993_ & 0xff00ff) * i_987_
					      & ~0xff00ff);
				    i_990_ = ((i_993_ & 0xff00) * i_987_
					      & 0xff0000);
				    i_993_
					= ((i_989_ | i_990_) >>> 8) + i_882_;
				    int i_994_ = is[i_885_];
				    int i_995_ = i_993_ + i_994_;
				    int i_996_ = ((i_993_ & 0xff00ff)
						  + (i_994_ & 0xff00ff));
				    i_994_ = ((i_996_ & 0x1000100)
					      + (i_995_ - i_996_ & 0x10000));
				    is[i_885_++]
					= i_995_ - i_994_ | i_994_ - (i_994_
								      >>> 8);
				} else
				    i_885_++;
			    }
			    i_885_ += i_889_;
			    i_886_ += i_890_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method1810(int i, int i_997_, int i_998_, int i_999_,
			   int i_1000_) {
	if (((Class151_Sub1_Sub3) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    int i_1001_ = (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					     .aClass173_Sub3_8814)).anInt9735
			   * 111437289);
	    i += ((Class151_Sub1_Sub3) this).anInt8806;
	    i_997_ += ((Class151_Sub1_Sub3) this).anInt8819;
	    int i_1002_ = i_997_ * i_1001_ + i;
	    int i_1003_ = 0;
	    int i_1004_ = ((Class151_Sub1_Sub3) this).anInt8804;
	    int i_1005_ = ((Class151_Sub1_Sub3) this).anInt8803;
	    int i_1006_ = i_1001_ - i_1005_;
	    int i_1007_ = 0;
	    if (i_997_ < (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					    .aClass173_Sub3_8814)).anInt9725
			  * 592117349)) {
		int i_1008_ = ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						  .aClass173_Sub3_8814))
				.anInt9725) * 592117349
			       - i_997_);
		i_1004_ -= i_1008_;
		i_997_ = (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					    .aClass173_Sub3_8814)).anInt9725
			  * 592117349);
		i_1003_ += i_1008_ * i_1005_;
		i_1002_ += i_1008_ * i_1001_;
	    }
	    if (i_997_ + i_1004_
		> ((Class173_Sub3) (((Class151_Sub1_Sub3) this)
				    .aClass173_Sub3_8814)).anInt9726 * 6965409)
		i_1004_ -= (i_997_ + i_1004_
			    - (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						 .aClass173_Sub3_8814))
			       .anInt9726) * 6965409);
	    if (i < (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119)) {
		int i_1009_ = ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						  .aClass173_Sub3_8814))
				.anInt9723) * -993497119
			       - i);
		i_1005_ -= i_1009_;
		i = (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119);
		i_1003_ += i_1009_;
		i_1002_ += i_1009_;
		i_1007_ += i_1009_;
		i_1006_ += i_1009_;
	    }
	    if (i + i_1005_ > (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						 .aClass173_Sub3_8814))
			       .anInt9724) * 630968029) {
		int i_1010_ = (i + i_1005_
			       - (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						    .aClass173_Sub3_8814))
				  .anInt9724) * 630968029);
		i_1005_ -= i_1010_;
		i_1007_ += i_1010_;
		i_1006_ += i_1010_;
	    }
	    if (i_1005_ > 0 && i_1004_ > 0) {
		if (i_1000_ == 0) {
		    if (i_998_ == 1) {
			for (int i_1011_ = -i_1004_; i_1011_ < 0; i_1011_++) {
			    int i_1012_ = i_1002_ + i_1005_ - 3;
			    while (i_1002_ < i_1012_) {
				is[i_1002_++] = (((Class151_Sub1_Sub3) this)
						 .anIntArray11309[i_1003_++]);
				is[i_1002_++] = (((Class151_Sub1_Sub3) this)
						 .anIntArray11309[i_1003_++]);
				is[i_1002_++] = (((Class151_Sub1_Sub3) this)
						 .anIntArray11309[i_1003_++]);
				is[i_1002_++] = (((Class151_Sub1_Sub3) this)
						 .anIntArray11309[i_1003_++]);
			    }
			    i_1012_ += 3;
			    while (i_1002_ < i_1012_)
				is[i_1002_++] = (((Class151_Sub1_Sub3) this)
						 .anIntArray11309[i_1003_++]);
			    i_1002_ += i_1006_;
			    i_1003_ += i_1007_;
			}
		    } else if (i_998_ == 0) {
			int i_1013_ = (i_999_ & 0xff0000) >> 16;
			int i_1014_ = (i_999_ & 0xff00) >> 8;
			int i_1015_ = i_999_ & 0xff;
			for (int i_1016_ = -i_1004_; i_1016_ < 0; i_1016_++) {
			    for (int i_1017_ = -i_1005_; i_1017_ < 0;
				 i_1017_++) {
				int i_1018_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309[i_1003_++]);
				int i_1019_ = ((i_1018_ & 0xff0000) * i_1013_
					       & ~0xffffff);
				int i_1020_
				    = (i_1018_ & 0xff00) * i_1014_ & 0xff0000;
				int i_1021_
				    = (i_1018_ & 0xff) * i_1015_ & 0xff00;
				is[i_1002_++]
				    = (i_1019_ | i_1020_ | i_1021_) >>> 8;
			    }
			    i_1002_ += i_1006_;
			    i_1003_ += i_1007_;
			}
		    } else if (i_998_ == 3) {
			for (int i_1022_ = -i_1004_; i_1022_ < 0; i_1022_++) {
			    for (int i_1023_ = -i_1005_; i_1023_ < 0;
				 i_1023_++) {
				int i_1024_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309[i_1003_++]);
				int i_1025_ = i_1024_ + i_999_;
				int i_1026_ = ((i_1024_ & 0xff00ff)
					       + (i_999_ & 0xff00ff));
				int i_1027_
				    = ((i_1026_ & 0x1000100)
				       + (i_1025_ - i_1026_ & 0x10000));
				is[i_1002_++]
				    = i_1025_ - i_1027_ | i_1027_ - (i_1027_
								     >>> 8);
			    }
			    i_1002_ += i_1006_;
			    i_1003_ += i_1007_;
			}
		    } else if (i_998_ == 2) {
			int i_1028_ = i_999_ >>> 24;
			int i_1029_ = 256 - i_1028_;
			int i_1030_
			    = (i_999_ & 0xff00ff) * i_1029_ & ~0xff00ff;
			int i_1031_ = (i_999_ & 0xff00) * i_1029_ & 0xff0000;
			i_999_ = (i_1030_ | i_1031_) >>> 8;
			for (int i_1032_ = -i_1004_; i_1032_ < 0; i_1032_++) {
			    for (int i_1033_ = -i_1005_; i_1033_ < 0;
				 i_1033_++) {
				int i_1034_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309[i_1003_++]);
				i_1030_ = ((i_1034_ & 0xff00ff) * i_1028_
					   & ~0xff00ff);
				i_1031_
				    = (i_1034_ & 0xff00) * i_1028_ & 0xff0000;
				is[i_1002_++]
				    = ((i_1030_ | i_1031_) >>> 8) + i_999_;
			    }
			    i_1002_ += i_1006_;
			    i_1003_ += i_1007_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1000_ == 1) {
		    if (i_998_ == 1) {
			for (int i_1035_ = -i_1004_; i_1035_ < 0; i_1035_++) {
			    for (int i_1036_ = -i_1005_; i_1036_ < 0;
				 i_1036_++) {
				int i_1037_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309[i_1003_++]);
				int i_1038_ = i_1037_ >>> 24;
				int i_1039_ = 256 - i_1038_;
				int i_1040_ = is[i_1002_];
				is[i_1002_++]
				    = (((((i_1037_ & 0xff00ff) * i_1038_
					  + (i_1040_ & 0xff00ff) * i_1039_)
					 & ~0xff00ff)
					>> 8)
				       + (((((i_1037_ & ~0xff00ff) >>> 8)
					    * i_1038_)
					   + (((i_1040_ & ~0xff00ff) >>> 8)
					      * i_1039_))
					  & ~0xff00ff));
			    }
			    i_1002_ += i_1006_;
			    i_1003_ += i_1007_;
			}
		    } else if (i_998_ == 0) {
			if ((i_999_ & 0xffffff) == 16777215) {
			    for (int i_1041_ = -i_1004_; i_1041_ < 0;
				 i_1041_++) {
				for (int i_1042_ = -i_1005_; i_1042_ < 0;
				     i_1042_++) {
				    int i_1043_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309[i_1003_++]);
				    int i_1044_
					= ((i_1043_ >>> 24) * (i_999_ >>> 24)
					   >> 8);
				    int i_1045_ = 256 - i_1044_;
				    int i_1046_ = is[i_1002_];
				    is[i_1002_++]
					= ((((i_1043_ & 0xff00ff) * i_1044_
					     + (i_1046_ & 0xff00ff) * i_1045_)
					    & ~0xff00ff)
					   + (((i_1043_ & 0xff00) * i_1044_
					       + (i_1046_ & 0xff00) * i_1045_)
					      & 0xff0000)) >> 8;
				}
				i_1002_ += i_1006_;
				i_1003_ += i_1007_;
			    }
			} else {
			    int i_1047_ = (i_999_ & 0xff0000) >> 16;
			    int i_1048_ = (i_999_ & 0xff00) >> 8;
			    int i_1049_ = i_999_ & 0xff;
			    for (int i_1050_ = -i_1004_; i_1050_ < 0;
				 i_1050_++) {
				for (int i_1051_ = -i_1005_; i_1051_ < 0;
				     i_1051_++) {
				    int i_1052_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309[i_1003_++]);
				    int i_1053_
					= ((i_1052_ >>> 24) * (i_999_ >>> 24)
					   >> 8);
				    int i_1054_ = 256 - i_1053_;
				    if (i_1053_ != 255) {
					int i_1055_
					    = ((i_1052_ & 0xff0000) * i_1047_
					       & ~0xffffff);
					int i_1056_
					    = ((i_1052_ & 0xff00) * i_1048_
					       & 0xff0000);
					int i_1057_
					    = ((i_1052_ & 0xff) * i_1049_
					       & 0xff00);
					i_1052_ = (i_1055_ | i_1056_
						   | i_1057_) >>> 8;
					int i_1058_ = is[i_1002_];
					is[i_1002_++]
					    = ((((i_1052_ & 0xff00ff) * i_1053_
						 + ((i_1058_ & 0xff00ff)
						    * i_1054_))
						& ~0xff00ff)
					       + (((i_1052_ & 0xff00) * i_1053_
						   + ((i_1058_ & 0xff00)
						      * i_1054_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_1059_
					    = ((i_1052_ & 0xff0000) * i_1047_
					       & ~0xffffff);
					int i_1060_
					    = ((i_1052_ & 0xff00) * i_1048_
					       & 0xff0000);
					int i_1061_
					    = ((i_1052_ & 0xff) * i_1049_
					       & 0xff00);
					is[i_1002_++] = (i_1059_ | i_1060_
							 | i_1061_) >>> 8;
				    }
				}
				i_1002_ += i_1006_;
				i_1003_ += i_1007_;
			    }
			}
		    } else if (i_998_ == 3) {
			for (int i_1062_ = -i_1004_; i_1062_ < 0; i_1062_++) {
			    for (int i_1063_ = -i_1005_; i_1063_ < 0;
				 i_1063_++) {
				int i_1064_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309[i_1003_++]);
				int i_1065_ = i_1064_ + i_999_;
				int i_1066_ = ((i_1064_ & 0xff00ff)
					       + (i_999_ & 0xff00ff));
				int i_1067_
				    = ((i_1066_ & 0x1000100)
				       + (i_1065_ - i_1066_ & 0x10000));
				i_1067_
				    = i_1065_ - i_1067_ | i_1067_ - (i_1067_
								     >>> 8);
				int i_1068_
				    = (i_1067_ >>> 24) * (i_999_ >>> 24) >> 8;
				int i_1069_ = 256 - i_1068_;
				if (i_1068_ != 255) {
				    i_1064_ = i_1067_;
				    i_1067_ = is[i_1002_];
				    i_1067_
					= ((((i_1064_ & 0xff00ff) * i_1068_
					     + (i_1067_ & 0xff00ff) * i_1069_)
					    & ~0xff00ff)
					   + (((i_1064_ & 0xff00) * i_1068_
					       + (i_1067_ & 0xff00) * i_1069_)
					      & 0xff0000)) >> 8;
				}
				is[i_1002_++] = i_1067_;
			    }
			    i_1002_ += i_1006_;
			    i_1003_ += i_1007_;
			}
		    } else if (i_998_ == 2) {
			int i_1070_ = i_999_ >>> 24;
			int i_1071_ = 256 - i_1070_;
			int i_1072_
			    = (i_999_ & 0xff00ff) * i_1071_ & ~0xff00ff;
			int i_1073_ = (i_999_ & 0xff00) * i_1071_ & 0xff0000;
			i_999_ = (i_1072_ | i_1073_) >>> 8;
			for (int i_1074_ = -i_1004_; i_1074_ < 0; i_1074_++) {
			    for (int i_1075_ = -i_1005_; i_1075_ < 0;
				 i_1075_++) {
				int i_1076_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309[i_1003_++]);
				int i_1077_ = i_1076_ >>> 24;
				int i_1078_ = 256 - i_1077_;
				i_1072_ = ((i_1076_ & 0xff00ff) * i_1070_
					   & ~0xff00ff);
				i_1073_
				    = (i_1076_ & 0xff00) * i_1070_ & 0xff0000;
				i_1076_ = ((i_1072_ | i_1073_) >>> 8) + i_999_;
				int i_1079_ = is[i_1002_];
				is[i_1002_++]
				    = ((((i_1076_ & 0xff00ff) * i_1077_
					 + (i_1079_ & 0xff00ff) * i_1078_)
					& ~0xff00ff)
				       + (((i_1076_ & 0xff00) * i_1077_
					   + (i_1079_ & 0xff00) * i_1078_)
					  & 0xff0000)) >> 8;
			    }
			    i_1002_ += i_1006_;
			    i_1003_ += i_1007_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1000_ == 2) {
		    if (i_998_ == 1) {
			for (int i_1080_ = -i_1004_; i_1080_ < 0; i_1080_++) {
			    for (int i_1081_ = -i_1005_; i_1081_ < 0;
				 i_1081_++) {
				int i_1082_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309[i_1003_++]);
				if (i_1082_ != 0) {
				    int i_1083_ = is[i_1002_];
				    int i_1084_ = i_1082_ + i_1083_;
				    int i_1085_ = ((i_1082_ & 0xff00ff)
						   + (i_1083_ & 0xff00ff));
				    i_1083_
					= ((i_1085_ & 0x1000100)
					   + (i_1084_ - i_1085_ & 0x10000));
				    is[i_1002_++]
					= (i_1084_ - i_1083_
					   | i_1083_ - (i_1083_ >>> 8));
				} else
				    i_1002_++;
			    }
			    i_1002_ += i_1006_;
			    i_1003_ += i_1007_;
			}
		    } else if (i_998_ == 0) {
			int i_1086_ = (i_999_ & 0xff0000) >> 16;
			int i_1087_ = (i_999_ & 0xff00) >> 8;
			int i_1088_ = i_999_ & 0xff;
			for (int i_1089_ = -i_1004_; i_1089_ < 0; i_1089_++) {
			    for (int i_1090_ = -i_1005_; i_1090_ < 0;
				 i_1090_++) {
				int i_1091_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309[i_1003_++]);
				if (i_1091_ != 0) {
				    int i_1092_
					= ((i_1091_ & 0xff0000) * i_1086_
					   & ~0xffffff);
				    int i_1093_ = ((i_1091_ & 0xff00) * i_1087_
						   & 0xff0000);
				    int i_1094_
					= (i_1091_ & 0xff) * i_1088_ & 0xff00;
				    i_1091_
					= (i_1092_ | i_1093_ | i_1094_) >>> 8;
				    int i_1095_ = is[i_1002_];
				    int i_1096_ = i_1091_ + i_1095_;
				    int i_1097_ = ((i_1091_ & 0xff00ff)
						   + (i_1095_ & 0xff00ff));
				    i_1095_
					= ((i_1097_ & 0x1000100)
					   + (i_1096_ - i_1097_ & 0x10000));
				    is[i_1002_++]
					= (i_1096_ - i_1095_
					   | i_1095_ - (i_1095_ >>> 8));
				} else
				    i_1002_++;
			    }
			    i_1002_ += i_1006_;
			    i_1003_ += i_1007_;
			}
		    } else if (i_998_ == 3) {
			for (int i_1098_ = -i_1004_; i_1098_ < 0; i_1098_++) {
			    for (int i_1099_ = -i_1005_; i_1099_ < 0;
				 i_1099_++) {
				int i_1100_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309[i_1003_++]);
				int i_1101_ = i_1100_ + i_999_;
				int i_1102_ = ((i_1100_ & 0xff00ff)
					       + (i_999_ & 0xff00ff));
				int i_1103_
				    = ((i_1102_ & 0x1000100)
				       + (i_1101_ - i_1102_ & 0x10000));
				i_1100_
				    = i_1101_ - i_1103_ | i_1103_ - (i_1103_
								     >>> 8);
				i_1103_ = is[i_1002_];
				i_1101_ = i_1100_ + i_1103_;
				i_1102_ = (i_1100_ & 0xff00ff) + (i_1103_
								  & 0xff00ff);
				i_1103_ = ((i_1102_ & 0x1000100)
					   + (i_1101_ - i_1102_ & 0x10000));
				is[i_1002_++]
				    = i_1101_ - i_1103_ | i_1103_ - (i_1103_
								     >>> 8);
			    }
			    i_1002_ += i_1006_;
			    i_1003_ += i_1007_;
			}
		    } else if (i_998_ == 2) {
			int i_1104_ = i_999_ >>> 24;
			int i_1105_ = 256 - i_1104_;
			int i_1106_
			    = (i_999_ & 0xff00ff) * i_1105_ & ~0xff00ff;
			int i_1107_ = (i_999_ & 0xff00) * i_1105_ & 0xff0000;
			i_999_ = (i_1106_ | i_1107_) >>> 8;
			for (int i_1108_ = -i_1004_; i_1108_ < 0; i_1108_++) {
			    for (int i_1109_ = -i_1005_; i_1109_ < 0;
				 i_1109_++) {
				int i_1110_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309[i_1003_++]);
				if (i_1110_ != 0) {
				    i_1106_ = ((i_1110_ & 0xff00ff) * i_1104_
					       & ~0xff00ff);
				    i_1107_ = ((i_1110_ & 0xff00) * i_1104_
					       & 0xff0000);
				    i_1110_
					= ((i_1106_ | i_1107_) >>> 8) + i_999_;
				    int i_1111_ = is[i_1002_];
				    int i_1112_ = i_1110_ + i_1111_;
				    int i_1113_ = ((i_1110_ & 0xff00ff)
						   + (i_1111_ & 0xff00ff));
				    i_1111_
					= ((i_1113_ & 0x1000100)
					   + (i_1112_ - i_1113_ & 0x10000));
				    is[i_1002_++]
					= (i_1112_ - i_1111_
					   | i_1111_ - (i_1111_ >>> 8));
				} else
				    i_1002_++;
			    }
			    i_1002_ += i_1006_;
			    i_1003_ += i_1007_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method8291(boolean bool, boolean bool_1114_, boolean bool_1115_,
		    int i, int i_1116_, float f, int i_1117_, int i_1118_,
		    int i_1119_, int i_1120_, int i_1121_, int i_1122_,
		    boolean bool_1123_) {
	if (i_1117_ > 0 && i_1118_ > 0 && (bool || bool_1114_)) {
	    int i_1124_ = 0;
	    int i_1125_ = 0;
	    int i_1126_ = (((Class151_Sub1_Sub3) this).anInt8806
			   + ((Class151_Sub1_Sub3) this).anInt8803
			   + ((Class151_Sub1_Sub3) this).anInt8832);
	    int i_1127_ = (((Class151_Sub1_Sub3) this).anInt8819
			   + ((Class151_Sub1_Sub3) this).anInt8804
			   + ((Class151_Sub1_Sub3) this).anInt8808);
	    int i_1128_ = (i_1126_ << 16) / i_1117_;
	    int i_1129_ = (i_1127_ << 16) / i_1118_;
	    if (((Class151_Sub1_Sub3) this).anInt8806 > 0) {
		int i_1130_ = (((((Class151_Sub1_Sub3) this).anInt8806 << 16)
				+ i_1128_ - 1)
			       / i_1128_);
		i += i_1130_;
		i_1124_ += (i_1130_ * i_1128_
			    - (((Class151_Sub1_Sub3) this).anInt8806 << 16));
	    }
	    if (((Class151_Sub1_Sub3) this).anInt8819 > 0) {
		int i_1131_ = (((((Class151_Sub1_Sub3) this).anInt8819 << 16)
				+ i_1129_ - 1)
			       / i_1129_);
		i_1116_ += i_1131_;
		i_1125_ += (i_1131_ * i_1129_
			    - (((Class151_Sub1_Sub3) this).anInt8819 << 16));
	    }
	    if (((Class151_Sub1_Sub3) this).anInt8803 < i_1126_)
		i_1117_ = ((((Class151_Sub1_Sub3) this).anInt8803 << 16)
			   - i_1124_ + i_1128_ - 1) / i_1128_;
	    if (((Class151_Sub1_Sub3) this).anInt8804 < i_1127_)
		i_1118_ = ((((Class151_Sub1_Sub3) this).anInt8804 << 16)
			   - i_1125_ + i_1129_ - 1) / i_1129_;
	    int i_1132_
		= i + i_1116_ * ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						    .aClass173_Sub3_8814))
				  .anInt9735)
				 * 111437289);
	    int i_1133_ = ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					      .aClass173_Sub3_8814)).anInt9735
			    * 111437289)
			   - i_1117_);
	    if (i_1116_ + i_1118_
		> ((Class173_Sub3) (((Class151_Sub1_Sub3) this)
				    .aClass173_Sub3_8814)).anInt9726 * 6965409)
		i_1118_ -= (i_1116_ + i_1118_
			    - (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						 .aClass173_Sub3_8814))
			       .anInt9726) * 6965409);
	    if (i_1116_ < (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					     .aClass173_Sub3_8814)).anInt9725
			   * 592117349)) {
		int i_1134_ = ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						  .aClass173_Sub3_8814))
				.anInt9725) * 592117349
			       - i_1116_);
		i_1118_ -= i_1134_;
		i_1132_ += i_1134_ * (((Class173_Sub3)
				       (((Class151_Sub1_Sub3) this)
					.aClass173_Sub3_8814)).anInt9735
				      * 111437289);
		i_1125_ += i_1129_ * i_1134_;
	    }
	    if (i + i_1117_ > (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						 .aClass173_Sub3_8814))
			       .anInt9724) * 630968029) {
		int i_1135_ = (i + i_1117_
			       - (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						    .aClass173_Sub3_8814))
				  .anInt9724) * 630968029);
		i_1117_ -= i_1135_;
		i_1133_ += i_1135_;
	    }
	    if (i < (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119)) {
		int i_1136_ = ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						  .aClass173_Sub3_8814))
				.anInt9723) * -993497119
			       - i);
		i_1117_ -= i_1136_;
		i_1132_ += i_1136_;
		i_1124_ += i_1128_ * i_1136_;
		i_1133_ += i_1136_;
	    }
	    float[] fs = (((Class173_Sub3)
			   ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
			  .aFloatArray9716);
	    int[] is = (((Class173_Sub3)
			 ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
			.anIntArray9719);
	    if (i_1121_ == 0) {
		if (i_1119_ == 1) {
		    int i_1137_ = i_1124_;
		    for (int i_1138_ = -i_1118_; i_1138_ < 0; i_1138_++) {
			int i_1139_
			    = ((i_1125_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1140_ = -i_1117_; i_1140_ < 0; i_1140_++) {
			    if (!bool_1114_ || f < fs[i_1132_]) {
				if (bool)
				    is[i_1132_]
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1124_ >> 16) + i_1139_]);
				if (bool_1114_ && bool_1123_)
				    fs[i_1132_] = f;
			    }
			    i_1124_ += i_1128_;
			    i_1132_++;
			}
			i_1125_ += i_1129_;
			i_1124_ = i_1137_;
			i_1132_ += i_1133_;
		    }
		} else if (i_1119_ == 0) {
		    int i_1141_ = (i_1120_ & 0xff0000) >> 16;
		    int i_1142_ = (i_1120_ & 0xff00) >> 8;
		    int i_1143_ = i_1120_ & 0xff;
		    int i_1144_ = i_1124_;
		    for (int i_1145_ = -i_1118_; i_1145_ < 0; i_1145_++) {
			int i_1146_
			    = ((i_1125_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1147_ = -i_1117_; i_1147_ < 0; i_1147_++) {
			    if (!bool_1114_ || f < fs[i_1132_]) {
				if (bool) {
				    int i_1148_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1124_ >> 16) + i_1146_]);
				    int i_1149_
					= ((i_1148_ & 0xff0000) * i_1141_
					   & ~0xffffff);
				    int i_1150_ = ((i_1148_ & 0xff00) * i_1142_
						   & 0xff0000);
				    int i_1151_
					= (i_1148_ & 0xff) * i_1143_ & 0xff00;
				    is[i_1132_]
					= (i_1149_ | i_1150_ | i_1151_) >>> 8;
				}
				if (bool_1114_ && bool_1123_)
				    fs[i_1132_] = f;
			    }
			    i_1124_ += i_1128_;
			    i_1132_++;
			}
			i_1125_ += i_1129_;
			i_1124_ = i_1144_;
			i_1132_ += i_1133_;
		    }
		} else if (i_1119_ == 3) {
		    int i_1152_ = i_1124_;
		    for (int i_1153_ = -i_1118_; i_1153_ < 0; i_1153_++) {
			int i_1154_
			    = ((i_1125_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1155_ = -i_1117_; i_1155_ < 0; i_1155_++) {
			    if (!bool_1114_ || f < fs[i_1132_]) {
				if (bool) {
				    int i_1156_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1124_ >> 16) + i_1154_]);
				    int i_1157_ = i_1156_ + i_1120_;
				    int i_1158_ = ((i_1156_ & 0xff00ff)
						   + (i_1120_ & 0xff00ff));
				    int i_1159_
					= ((i_1158_ & 0x1000100)
					   + (i_1157_ - i_1158_ & 0x10000));
				    is[i_1132_]
					= (i_1157_ - i_1159_
					   | i_1159_ - (i_1159_ >>> 8));
				}
				if (bool_1114_ && bool_1123_)
				    fs[i_1132_] = f;
			    }
			    i_1124_ += i_1128_;
			    i_1132_++;
			}
			i_1125_ += i_1129_;
			i_1124_ = i_1152_;
			i_1132_ += i_1133_;
		    }
		} else if (i_1119_ == 2) {
		    int i_1160_ = i_1120_ >>> 24;
		    int i_1161_ = 256 - i_1160_;
		    int i_1162_ = (i_1120_ & 0xff00ff) * i_1161_ & ~0xff00ff;
		    int i_1163_ = (i_1120_ & 0xff00) * i_1161_ & 0xff0000;
		    i_1120_ = (i_1162_ | i_1163_) >>> 8;
		    int i_1164_ = i_1124_;
		    for (int i_1165_ = -i_1118_; i_1165_ < 0; i_1165_++) {
			int i_1166_
			    = ((i_1125_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1167_ = -i_1117_; i_1167_ < 0; i_1167_++) {
			    if (!bool_1114_ || f < fs[i_1132_]) {
				if (bool) {
				    int i_1168_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1124_ >> 16) + i_1166_]);
				    i_1162_ = ((i_1168_ & 0xff00ff) * i_1160_
					       & ~0xff00ff);
				    i_1163_ = ((i_1168_ & 0xff00) * i_1160_
					       & 0xff0000);
				    is[i_1132_] = (((i_1162_ | i_1163_) >>> 8)
						   + i_1120_);
				}
				if (bool_1114_ && bool_1123_)
				    fs[i_1132_] = f;
			    }
			    i_1124_ += i_1128_;
			    i_1132_++;
			}
			i_1125_ += i_1129_;
			i_1124_ = i_1164_;
			i_1132_ += i_1133_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1121_ == 1) {
		if (i_1119_ == 1) {
		    int i_1169_ = i_1124_;
		    for (int i_1170_ = -i_1118_; i_1170_ < 0; i_1170_++) {
			int i_1171_
			    = ((i_1125_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1172_ = -i_1117_; i_1172_ < 0; i_1172_++) {
			    if (!bool_1114_ || f < fs[i_1132_]) {
				if (bool) {
				    int i_1173_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1124_ >> 16) + i_1171_]);
				    int i_1174_ = i_1173_ >>> 24;
				    int i_1175_ = 256 - i_1174_;
				    int i_1176_ = is[i_1132_];
				    is[i_1132_]
					= (((((i_1173_ & 0xff00ff) * i_1174_
					      + (i_1176_ & 0xff00ff) * i_1175_)
					     & ~0xff00ff)
					    >> 8)
					   + (((((i_1173_ & ~0xff00ff) >>> 8)
						* i_1174_)
					       + (((i_1176_ & ~0xff00ff) >>> 8)
						  * i_1175_))
					      & ~0xff00ff));
				}
				if (bool_1114_ && bool_1123_)
				    fs[i_1132_] = f;
			    }
			    i_1124_ += i_1128_;
			    i_1132_++;
			}
			i_1125_ += i_1129_;
			i_1124_ = i_1169_;
			i_1132_ += i_1133_;
		    }
		} else if (i_1119_ == 0) {
		    int i_1177_ = i_1124_;
		    if ((i_1120_ & 0xffffff) == 16777215) {
			for (int i_1178_ = -i_1118_; i_1178_ < 0; i_1178_++) {
			    int i_1179_
				= ((i_1125_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_1180_ = -i_1117_; i_1180_ < 0;
				 i_1180_++) {
				if (!bool_1114_ || f < fs[i_1132_]) {
				    if (bool) {
					int i_1181_
					    = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309
					       [(i_1124_ >> 16) + i_1179_]);
					int i_1182_
					    = ((i_1181_ >>> 24) * (i_1120_
								   >>> 24)
					       >> 8);
					int i_1183_ = 256 - i_1182_;
					int i_1184_ = is[i_1132_];
					is[i_1132_]
					    = ((((i_1181_ & 0xff00ff) * i_1182_
						 + ((i_1184_ & 0xff00ff)
						    * i_1183_))
						& ~0xff00ff)
					       + (((i_1181_ & 0xff00) * i_1182_
						   + ((i_1184_ & 0xff00)
						      * i_1183_))
						  & 0xff0000)) >> 8;
				    }
				    if (bool_1114_ && bool_1123_)
					fs[i_1132_] = f;
				}
				i_1124_ += i_1128_;
				i_1132_++;
			    }
			    i_1125_ += i_1129_;
			    i_1124_ = i_1177_;
			    i_1132_ += i_1133_;
			}
		    } else {
			int i_1185_ = (i_1120_ & 0xff0000) >> 16;
			int i_1186_ = (i_1120_ & 0xff00) >> 8;
			int i_1187_ = i_1120_ & 0xff;
			for (int i_1188_ = -i_1118_; i_1188_ < 0; i_1188_++) {
			    int i_1189_
				= ((i_1125_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_1190_ = -i_1117_; i_1190_ < 0;
				 i_1190_++) {
				if (!bool_1114_ || f < fs[i_1132_]) {
				    int i_1191_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1124_ >> 16) + i_1189_]);
				    int i_1192_
					= ((i_1191_ >>> 24) * (i_1120_ >>> 24)
					   >> 8);
				    int i_1193_ = 256 - i_1192_;
				    if (i_1192_ != 255) {
					if (bool) {
					    int i_1194_
						= (((i_1191_ & 0xff0000)
						    * i_1185_)
						   & ~0xffffff);
					    int i_1195_
						= ((i_1191_ & 0xff00) * i_1186_
						   & 0xff0000);
					    int i_1196_
						= ((i_1191_ & 0xff) * i_1187_
						   & 0xff00);
					    i_1191_ = (i_1194_ | i_1195_
						       | i_1196_) >>> 8;
					    int i_1197_ = is[i_1132_];
					    is[i_1132_]
						= (((((i_1191_ & 0xff00ff)
						      * i_1192_)
						     + ((i_1197_ & 0xff00ff)
							* i_1193_))
						    & ~0xff00ff)
						   + ((((i_1191_ & 0xff00)
							* i_1192_)
						       + ((i_1197_ & 0xff00)
							  * i_1193_))
						      & 0xff0000)) >> 8;
					    if (bool_1115_) {
						int i_1198_ = ((i_1197_ >>> 24)
							       + i_1192_);
						if (i_1198_ > 255)
						    i_1198_ = 255;
						is[i_1132_] |= i_1198_ << 24;
					    }
					}
					if (bool_1114_ && bool_1123_)
					    fs[i_1132_] = f;
				    } else {
					if (bool) {
					    int i_1199_
						= (((i_1191_ & 0xff0000)
						    * i_1185_)
						   & ~0xffffff);
					    int i_1200_
						= ((i_1191_ & 0xff00) * i_1186_
						   & 0xff0000);
					    int i_1201_
						= ((i_1191_ & 0xff) * i_1187_
						   & 0xff00);
					    is[i_1132_] = (i_1199_ | i_1200_
							   | i_1201_) >>> 8;
					}
					if (bool_1114_ && bool_1123_)
					    fs[i_1132_] = f;
				    }
				}
				i_1124_ += i_1128_;
				i_1132_++;
			    }
			    i_1125_ += i_1129_;
			    i_1124_ = i_1177_;
			    i_1132_ += i_1133_;
			}
		    }
		} else if (i_1119_ == 3) {
		    int i_1202_ = i_1124_;
		    for (int i_1203_ = -i_1118_; i_1203_ < 0; i_1203_++) {
			int i_1204_
			    = ((i_1125_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1205_ = -i_1117_; i_1205_ < 0; i_1205_++) {
			    if (!bool_1114_ || f < fs[i_1132_]) {
				if (bool) {
				    int i_1206_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1124_ >> 16) + i_1204_]);
				    int i_1207_ = i_1206_ + i_1120_;
				    int i_1208_ = ((i_1206_ & 0xff00ff)
						   + (i_1120_ & 0xff00ff));
				    int i_1209_
					= ((i_1208_ & 0x1000100)
					   + (i_1207_ - i_1208_ & 0x10000));
				    i_1209_ = (i_1207_ - i_1209_
					       | i_1209_ - (i_1209_ >>> 8));
				    int i_1210_
					= ((i_1209_ >>> 24) * (i_1120_ >>> 24)
					   >> 8);
				    int i_1211_ = 256 - i_1210_;
				    if (i_1210_ != 255) {
					i_1206_ = i_1209_;
					i_1209_ = is[i_1132_];
					i_1209_
					    = ((((i_1206_ & 0xff00ff) * i_1210_
						 + ((i_1209_ & 0xff00ff)
						    * i_1211_))
						& ~0xff00ff)
					       + (((i_1206_ & 0xff00) * i_1210_
						   + ((i_1209_ & 0xff00)
						      * i_1211_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_1132_] = i_1209_;
				}
				if (bool_1114_ && bool_1123_)
				    fs[i_1132_] = f;
			    }
			    i_1124_ += i_1128_;
			    i_1132_++;
			}
			i_1125_ += i_1129_;
			i_1124_ = i_1202_;
			i_1132_ += i_1133_;
		    }
		} else if (i_1119_ == 2) {
		    int i_1212_ = i_1120_ >>> 24;
		    int i_1213_ = 256 - i_1212_;
		    int i_1214_ = (i_1120_ & 0xff00ff) * i_1213_ & ~0xff00ff;
		    int i_1215_ = (i_1120_ & 0xff00) * i_1213_ & 0xff0000;
		    i_1120_ = (i_1214_ | i_1215_) >>> 8;
		    int i_1216_ = i_1124_;
		    for (int i_1217_ = -i_1118_; i_1217_ < 0; i_1217_++) {
			int i_1218_
			    = ((i_1125_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1219_ = -i_1117_; i_1219_ < 0; i_1219_++) {
			    if (!bool_1114_ || f < fs[i_1132_]) {
				if (bool) {
				    int i_1220_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1124_ >> 16) + i_1218_]);
				    int i_1221_ = i_1220_ >>> 24;
				    int i_1222_ = 256 - i_1221_;
				    i_1214_ = ((i_1220_ & 0xff00ff) * i_1212_
					       & ~0xff00ff);
				    i_1215_ = ((i_1220_ & 0xff00) * i_1212_
					       & 0xff0000);
				    i_1220_ = (((i_1214_ | i_1215_) >>> 8)
					       + i_1120_);
				    int i_1223_ = is[i_1132_];
				    is[i_1132_]
					= ((((i_1220_ & 0xff00ff) * i_1221_
					     + (i_1223_ & 0xff00ff) * i_1222_)
					    & ~0xff00ff)
					   + (((i_1220_ & 0xff00) * i_1221_
					       + (i_1223_ & 0xff00) * i_1222_)
					      & 0xff0000)) >> 8;
				}
				if (bool_1114_ && bool_1123_)
				    fs[i_1132_] = f;
			    }
			    i_1124_ += i_1128_;
			    i_1132_++;
			}
			i_1125_ += i_1129_;
			i_1124_ = i_1216_;
			i_1132_ += i_1133_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1121_ == 2) {
		if (i_1119_ == 1) {
		    int i_1224_ = i_1124_;
		    for (int i_1225_ = -i_1118_; i_1225_ < 0; i_1225_++) {
			int i_1226_
			    = ((i_1125_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1227_ = -i_1117_; i_1227_ < 0; i_1227_++) {
			    if (!bool_1114_ || f < fs[i_1132_]) {
				int i_1228_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309
					       [(i_1124_ >> 16) + i_1226_]);
				if (i_1228_ != 0) {
				    if (bool) {
					int i_1229_ = is[i_1132_];
					int i_1230_ = i_1228_ + i_1229_;
					int i_1231_ = ((i_1228_ & 0xff00ff)
						       + (i_1229_ & 0xff00ff));
					i_1229_ = ((i_1231_ & 0x1000100)
						   + (i_1230_ - i_1231_
						      & 0x10000));
					is[i_1132_]
					    = (i_1230_ - i_1229_
					       | i_1229_ - (i_1229_ >>> 8));
				    }
				    if (bool_1114_ && bool_1123_)
					fs[i_1132_] = f;
				}
			    }
			    i_1124_ += i_1128_;
			    i_1132_++;
			}
			i_1125_ += i_1129_;
			i_1124_ = i_1224_;
			i_1132_ += i_1133_;
		    }
		} else if (i_1119_ == 0) {
		    int i_1232_ = i_1124_;
		    int i_1233_ = (i_1120_ & 0xff0000) >> 16;
		    int i_1234_ = (i_1120_ & 0xff00) >> 8;
		    int i_1235_ = i_1120_ & 0xff;
		    for (int i_1236_ = -i_1118_; i_1236_ < 0; i_1236_++) {
			int i_1237_
			    = ((i_1125_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1238_ = -i_1117_; i_1238_ < 0; i_1238_++) {
			    if (!bool_1114_ || f < fs[i_1132_]) {
				int i_1239_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309
					       [(i_1124_ >> 16) + i_1237_]);
				if (i_1239_ != 0) {
				    if (bool) {
					int i_1240_
					    = ((i_1239_ & 0xff0000) * i_1233_
					       & ~0xffffff);
					int i_1241_
					    = ((i_1239_ & 0xff00) * i_1234_
					       & 0xff0000);
					int i_1242_
					    = ((i_1239_ & 0xff) * i_1235_
					       & 0xff00);
					i_1239_ = (i_1240_ | i_1241_
						   | i_1242_) >>> 8;
					int i_1243_ = is[i_1132_];
					int i_1244_ = i_1239_ + i_1243_;
					int i_1245_ = ((i_1239_ & 0xff00ff)
						       + (i_1243_ & 0xff00ff));
					i_1243_ = ((i_1245_ & 0x1000100)
						   + (i_1244_ - i_1245_
						      & 0x10000));
					is[i_1132_]
					    = (i_1244_ - i_1243_
					       | i_1243_ - (i_1243_ >>> 8));
				    }
				    if (bool_1114_ && bool_1123_)
					fs[i_1132_] = f;
				}
			    }
			    i_1124_ += i_1128_;
			    i_1132_++;
			}
			i_1125_ += i_1129_;
			i_1124_ = i_1232_;
			i_1132_ += i_1133_;
		    }
		} else if (i_1119_ == 3) {
		    int i_1246_ = i_1124_;
		    for (int i_1247_ = -i_1118_; i_1247_ < 0; i_1247_++) {
			int i_1248_
			    = ((i_1125_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1249_ = -i_1117_; i_1249_ < 0; i_1249_++) {
			    if (!bool_1114_ || f < fs[i_1132_]) {
				if (bool) {
				    int i_1250_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1124_ >> 16) + i_1248_]);
				    int i_1251_ = i_1250_ + i_1120_;
				    int i_1252_ = ((i_1250_ & 0xff00ff)
						   + (i_1120_ & 0xff00ff));
				    int i_1253_
					= ((i_1252_ & 0x1000100)
					   + (i_1251_ - i_1252_ & 0x10000));
				    i_1250_ = (i_1251_ - i_1253_
					       | i_1253_ - (i_1253_ >>> 8));
				    i_1253_ = is[i_1132_];
				    i_1251_ = i_1250_ + i_1253_;
				    i_1252_
					= (i_1250_ & 0xff00ff) + (i_1253_
								  & 0xff00ff);
				    i_1253_
					= ((i_1252_ & 0x1000100)
					   + (i_1251_ - i_1252_ & 0x10000));
				    is[i_1132_]
					= (i_1251_ - i_1253_
					   | i_1253_ - (i_1253_ >>> 8));
				}
				if (bool_1114_ && bool_1123_)
				    fs[i_1132_] = f;
			    }
			    i_1124_ += i_1128_;
			    i_1132_++;
			}
			i_1125_ += i_1129_;
			i_1124_ = i_1246_;
			i_1132_ += i_1133_;
		    }
		} else if (i_1119_ == 2) {
		    int i_1254_ = i_1120_ >>> 24;
		    int i_1255_ = 256 - i_1254_;
		    int i_1256_ = (i_1120_ & 0xff00ff) * i_1255_ & ~0xff00ff;
		    int i_1257_ = (i_1120_ & 0xff00) * i_1255_ & 0xff0000;
		    i_1120_ = (i_1256_ | i_1257_) >>> 8;
		    int i_1258_ = i_1124_;
		    for (int i_1259_ = -i_1118_; i_1259_ < 0; i_1259_++) {
			int i_1260_
			    = ((i_1125_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1261_ = -i_1117_; i_1261_ < 0; i_1261_++) {
			    if (!bool_1114_ || f < fs[i_1132_]) {
				int i_1262_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309
					       [(i_1124_ >> 16) + i_1260_]);
				if (i_1262_ != 0) {
				    if (bool) {
					i_1256_
					    = ((i_1262_ & 0xff00ff) * i_1254_
					       & ~0xff00ff);
					i_1257_ = ((i_1262_ & 0xff00) * i_1254_
						   & 0xff0000);
					i_1262_ = (((i_1256_ | i_1257_) >>> 8)
						   + i_1120_);
					int i_1263_ = is[i_1132_];
					int i_1264_ = i_1262_ + i_1263_;
					int i_1265_ = ((i_1262_ & 0xff00ff)
						       + (i_1263_ & 0xff00ff));
					i_1263_ = ((i_1265_ & 0x1000100)
						   + (i_1264_ - i_1265_
						      & 0x10000));
					is[i_1132_]
					    = (i_1264_ - i_1263_
					       | i_1263_ - (i_1263_ >>> 8));
				    }
				    if (bool_1114_ && bool_1123_)
					fs[i_1132_] = f;
				}
			    }
			    i_1124_ += i_1128_;
			    i_1132_++;
			}
			i_1125_ += i_1129_;
			i_1124_ = i_1258_;
			i_1132_ += i_1133_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method1805(int i, int i_1266_, Class148 class148, int i_1267_,
			   int i_1268_) {
	if (((Class151_Sub1_Sub3) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    i += ((Class151_Sub1_Sub3) this).anInt8806;
	    i_1266_ += ((Class151_Sub1_Sub3) this).anInt8819;
	    int i_1269_ = 0;
	    int i_1270_ = (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					     .aClass173_Sub3_8814)).anInt9735
			   * 111437289);
	    int i_1271_ = ((Class151_Sub1_Sub3) this).anInt8803;
	    int i_1272_ = ((Class151_Sub1_Sub3) this).anInt8804;
	    int i_1273_ = i_1270_ - i_1271_;
	    int i_1274_ = 0;
	    int i_1275_ = i + i_1266_ * i_1270_;
	    if (i_1266_ < (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					     .aClass173_Sub3_8814)).anInt9725
			   * 592117349)) {
		int i_1276_ = ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						  .aClass173_Sub3_8814))
				.anInt9725) * 592117349
			       - i_1266_);
		i_1272_ -= i_1276_;
		i_1266_ = (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					     .aClass173_Sub3_8814)).anInt9725
			   * 592117349);
		i_1269_ += i_1276_ * i_1271_;
		i_1275_ += i_1276_ * i_1270_;
	    }
	    if (i_1266_ + i_1272_
		> ((Class173_Sub3) (((Class151_Sub1_Sub3) this)
				    .aClass173_Sub3_8814)).anInt9726 * 6965409)
		i_1272_ -= (i_1266_ + i_1272_
			    - (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						 .aClass173_Sub3_8814))
			       .anInt9726) * 6965409);
	    if (i < (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119)) {
		int i_1277_ = ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						  .aClass173_Sub3_8814))
				.anInt9723) * -993497119
			       - i);
		i_1271_ -= i_1277_;
		i = (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119);
		i_1269_ += i_1277_;
		i_1275_ += i_1277_;
		i_1274_ += i_1277_;
		i_1273_ += i_1277_;
	    }
	    if (i + i_1271_ > (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						 .aClass173_Sub3_8814))
			       .anInt9724) * 630968029) {
		int i_1278_ = (i + i_1271_
			       - (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						    .aClass173_Sub3_8814))
				  .anInt9724) * 630968029);
		i_1271_ -= i_1278_;
		i_1274_ += i_1278_;
		i_1273_ += i_1278_;
	    }
	    if (i_1271_ > 0 && i_1272_ > 0) {
		Class148_Sub1 class148_sub1 = (Class148_Sub1) class148;
		int[] is_1279_
		    = ((Class148_Sub1) class148_sub1).anIntArray8789;
		int[] is_1280_
		    = ((Class148_Sub1) class148_sub1).anIntArray8788;
		int i_1281_ = i_1266_;
		if (i_1268_ > i_1281_) {
		    i_1281_ = i_1268_;
		    i_1275_ += (i_1268_ - i_1266_) * i_1270_;
		    i_1269_ += ((i_1268_ - i_1266_)
				* ((Class151_Sub1_Sub3) this).anInt8803);
		}
		int i_1282_
		    = (i_1268_ + is_1279_.length < i_1266_ + i_1272_
		       ? i_1268_ + is_1279_.length : i_1266_ + i_1272_);
		for (int i_1283_ = i_1281_; i_1283_ < i_1282_; i_1283_++) {
		    int i_1284_ = is_1279_[i_1283_ - i_1268_] + i_1267_;
		    int i_1285_ = is_1280_[i_1283_ - i_1268_];
		    int i_1286_ = i_1271_;
		    if (i > i_1284_) {
			int i_1287_ = i - i_1284_;
			if (i_1287_ >= i_1285_) {
			    i_1269_ += i_1271_ + i_1274_;
			    i_1275_ += i_1271_ + i_1273_;
			    continue;
			}
			i_1285_ -= i_1287_;
		    } else {
			int i_1288_ = i_1284_ - i;
			if (i_1288_ >= i_1271_) {
			    i_1269_ += i_1271_ + i_1274_;
			    i_1275_ += i_1271_ + i_1273_;
			    continue;
			}
			i_1269_ += i_1288_;
			i_1286_ -= i_1288_;
			i_1275_ += i_1288_;
		    }
		    int i_1289_ = 0;
		    if (i_1286_ < i_1285_)
			i_1285_ = i_1286_;
		    else
			i_1289_ = i_1286_ - i_1285_;
		    for (int i_1290_ = -i_1285_; i_1290_ < 0; i_1290_++) {
			int i_1291_ = (((Class151_Sub1_Sub3) this)
				       .anIntArray11309[i_1269_++]);
			int i_1292_ = i_1291_ >>> 24;
			int i_1293_ = 256 - i_1292_;
			int i_1294_ = is[i_1275_];
			is[i_1275_++] = ((((i_1291_ & 0xff00ff) * i_1292_
					   + (i_1294_ & 0xff00ff) * i_1293_)
					  & ~0xff00ff)
					 + (((i_1291_ & 0xff00) * i_1292_
					     + (i_1294_ & 0xff00) * i_1293_)
					    & 0xff0000)) >> 8;
		    }
		    i_1269_ += i_1289_ + i_1274_;
		    i_1275_ += i_1289_ + i_1273_;
		}
	    }
	}
    }
    
    void method1797(int i, int i_1295_, int i_1296_, int i_1297_, int i_1298_,
		    int i_1299_, int i_1300_, int i_1301_) {
	if (((Class151_Sub1_Sub3) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	if (i_1296_ > 0 && i_1297_ > 0) {
	    int[] is = (((Class173_Sub3)
			 ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
			.anIntArray9719);
	    if (is != null) {
		int i_1302_ = 0;
		int i_1303_ = 0;
		int i_1304_
		    = (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					 .aClass173_Sub3_8814)).anInt9735
		       * 111437289);
		int i_1305_ = (((Class151_Sub1_Sub3) this).anInt8806
			       + ((Class151_Sub1_Sub3) this).anInt8803
			       + ((Class151_Sub1_Sub3) this).anInt8832);
		int i_1306_ = (((Class151_Sub1_Sub3) this).anInt8819
			       + ((Class151_Sub1_Sub3) this).anInt8804
			       + ((Class151_Sub1_Sub3) this).anInt8808);
		int i_1307_ = (i_1305_ << 16) / i_1296_;
		int i_1308_ = (i_1306_ << 16) / i_1297_;
		if (((Class151_Sub1_Sub3) this).anInt8806 > 0) {
		    int i_1309_
			= (((((Class151_Sub1_Sub3) this).anInt8806 << 16)
			    + i_1307_ - 1)
			   / i_1307_);
		    i += i_1309_;
		    i_1302_
			+= (i_1309_ * i_1307_
			    - (((Class151_Sub1_Sub3) this).anInt8806 << 16));
		}
		if (((Class151_Sub1_Sub3) this).anInt8819 > 0) {
		    int i_1310_
			= (((((Class151_Sub1_Sub3) this).anInt8819 << 16)
			    + i_1308_ - 1)
			   / i_1308_);
		    i_1295_ += i_1310_;
		    i_1303_
			+= (i_1310_ * i_1308_
			    - (((Class151_Sub1_Sub3) this).anInt8819 << 16));
		}
		if (((Class151_Sub1_Sub3) this).anInt8803 < i_1305_)
		    i_1296_ = ((((Class151_Sub1_Sub3) this).anInt8803 << 16)
			       - i_1302_ + i_1307_ - 1) / i_1307_;
		if (((Class151_Sub1_Sub3) this).anInt8804 < i_1306_)
		    i_1297_ = ((((Class151_Sub1_Sub3) this).anInt8804 << 16)
			       - i_1303_ + i_1308_ - 1) / i_1308_;
		int i_1311_ = i + i_1295_ * i_1304_;
		int i_1312_ = i_1304_ - i_1296_;
		if (i_1295_ + i_1297_
		    > (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					 .aClass173_Sub3_8814)).anInt9726
		       * 6965409))
		    i_1297_
			-= (i_1295_ + i_1297_
			    - (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						 .aClass173_Sub3_8814))
			       .anInt9726) * 6965409);
		if (i_1295_ < (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						 .aClass173_Sub3_8814))
			       .anInt9725) * 592117349) {
		    int i_1313_
			= ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					      .aClass173_Sub3_8814)).anInt9725
			    * 592117349)
			   - i_1295_);
		    i_1297_ -= i_1313_;
		    i_1311_ += i_1313_ * i_1304_;
		    i_1303_ += i_1308_ * i_1313_;
		}
		if (i + i_1296_
		    > (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					 .aClass173_Sub3_8814)).anInt9724
		       * 630968029)) {
		    int i_1314_
			= (i + i_1296_
			   - (((Class173_Sub3)
			       ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
			      .anInt9724) * 630968029);
		    i_1296_ -= i_1314_;
		    i_1312_ += i_1314_;
		}
		if (i < (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					   .aClass173_Sub3_8814)).anInt9723
			 * -993497119)) {
		    int i_1315_
			= ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					      .aClass173_Sub3_8814)).anInt9723
			    * -993497119)
			   - i);
		    i_1296_ -= i_1315_;
		    i_1311_ += i_1315_;
		    i_1302_ += i_1307_ * i_1315_;
		    i_1312_ += i_1315_;
		}
		if (i_1300_ == 0) {
		    if (i_1298_ == 1) {
			int i_1316_ = i_1302_;
			for (int i_1317_ = -i_1297_; i_1317_ < 0; i_1317_++) {
			    int i_1318_
				= ((i_1303_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_1319_ = -i_1296_; i_1319_ < 0;
				 i_1319_++) {
				is[i_1311_++] = (((Class151_Sub1_Sub3) this)
						 .anIntArray11309
						 [(i_1302_ >> 16) + i_1318_]);
				i_1302_ += i_1307_;
			    }
			    i_1303_ += i_1308_;
			    i_1302_ = i_1316_;
			    i_1311_ += i_1312_;
			}
		    } else if (i_1298_ == 0) {
			int i_1320_ = (i_1299_ & 0xff0000) >> 16;
			int i_1321_ = (i_1299_ & 0xff00) >> 8;
			int i_1322_ = i_1299_ & 0xff;
			int i_1323_ = i_1302_;
			for (int i_1324_ = -i_1297_; i_1324_ < 0; i_1324_++) {
			    int i_1325_
				= ((i_1303_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_1326_ = -i_1296_; i_1326_ < 0;
				 i_1326_++) {
				int i_1327_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309
					       [(i_1302_ >> 16) + i_1325_]);
				int i_1328_ = ((i_1327_ & 0xff0000) * i_1320_
					       & ~0xffffff);
				int i_1329_
				    = (i_1327_ & 0xff00) * i_1321_ & 0xff0000;
				int i_1330_
				    = (i_1327_ & 0xff) * i_1322_ & 0xff00;
				is[i_1311_++]
				    = (i_1328_ | i_1329_ | i_1330_) >>> 8;
				i_1302_ += i_1307_;
			    }
			    i_1303_ += i_1308_;
			    i_1302_ = i_1323_;
			    i_1311_ += i_1312_;
			}
		    } else if (i_1298_ == 3) {
			int i_1331_ = i_1302_;
			for (int i_1332_ = -i_1297_; i_1332_ < 0; i_1332_++) {
			    int i_1333_
				= ((i_1303_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_1334_ = -i_1296_; i_1334_ < 0;
				 i_1334_++) {
				int i_1335_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309
					       [(i_1302_ >> 16) + i_1333_]);
				int i_1336_ = i_1335_ + i_1299_;
				int i_1337_ = ((i_1335_ & 0xff00ff)
					       + (i_1299_ & 0xff00ff));
				int i_1338_
				    = ((i_1337_ & 0x1000100)
				       + (i_1336_ - i_1337_ & 0x10000));
				is[i_1311_++]
				    = i_1336_ - i_1338_ | i_1338_ - (i_1338_
								     >>> 8);
				i_1302_ += i_1307_;
			    }
			    i_1303_ += i_1308_;
			    i_1302_ = i_1331_;
			    i_1311_ += i_1312_;
			}
		    } else if (i_1298_ == 2) {
			int i_1339_ = i_1299_ >>> 24;
			int i_1340_ = 256 - i_1339_;
			int i_1341_
			    = (i_1299_ & 0xff00ff) * i_1340_ & ~0xff00ff;
			int i_1342_ = (i_1299_ & 0xff00) * i_1340_ & 0xff0000;
			i_1299_ = (i_1341_ | i_1342_) >>> 8;
			int i_1343_ = i_1302_;
			for (int i_1344_ = -i_1297_; i_1344_ < 0; i_1344_++) {
			    int i_1345_
				= ((i_1303_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_1346_ = -i_1296_; i_1346_ < 0;
				 i_1346_++) {
				int i_1347_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309
					       [(i_1302_ >> 16) + i_1345_]);
				i_1341_ = ((i_1347_ & 0xff00ff) * i_1339_
					   & ~0xff00ff);
				i_1342_
				    = (i_1347_ & 0xff00) * i_1339_ & 0xff0000;
				is[i_1311_++]
				    = ((i_1341_ | i_1342_) >>> 8) + i_1299_;
				i_1302_ += i_1307_;
			    }
			    i_1303_ += i_1308_;
			    i_1302_ = i_1343_;
			    i_1311_ += i_1312_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1300_ == 1) {
		    if (i_1298_ == 1) {
			int i_1348_ = i_1302_;
			for (int i_1349_ = -i_1297_; i_1349_ < 0; i_1349_++) {
			    int i_1350_
				= ((i_1303_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_1351_ = -i_1296_; i_1351_ < 0;
				 i_1351_++) {
				int i_1352_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309
					       [(i_1302_ >> 16) + i_1350_]);
				int i_1353_ = i_1352_ >>> 24;
				int i_1354_ = 256 - i_1353_;
				int i_1355_ = is[i_1311_];
				is[i_1311_++]
				    = (((((i_1352_ & 0xff00ff) * i_1353_
					  + (i_1355_ & 0xff00ff) * i_1354_)
					 & ~0xff00ff)
					>> 8)
				       + (((((i_1352_ & ~0xff00ff) >>> 8)
					    * i_1353_)
					   + (((i_1355_ & ~0xff00ff) >>> 8)
					      * i_1354_))
					  & ~0xff00ff));
				i_1302_ += i_1307_;
			    }
			    i_1303_ += i_1308_;
			    i_1302_ = i_1348_;
			    i_1311_ += i_1312_;
			}
		    } else if (i_1298_ == 0) {
			int i_1356_ = i_1302_;
			if ((i_1299_ & 0xffffff) == 16777215) {
			    for (int i_1357_ = -i_1297_; i_1357_ < 0;
				 i_1357_++) {
				int i_1358_ = ((i_1303_ >> 16)
					       * (((Class151_Sub1_Sub3) this)
						  .anInt8803));
				for (int i_1359_ = -i_1296_; i_1359_ < 0;
				     i_1359_++) {
				    int i_1360_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1302_ >> 16) + i_1358_]);
				    int i_1361_
					= ((i_1360_ >>> 24) * (i_1299_ >>> 24)
					   >> 8);
				    int i_1362_ = 256 - i_1361_;
				    int i_1363_ = is[i_1311_];
				    is[i_1311_++]
					= ((((i_1360_ & 0xff00ff) * i_1361_
					     + (i_1363_ & 0xff00ff) * i_1362_)
					    & ~0xff00ff)
					   + (((i_1360_ & 0xff00) * i_1361_
					       + (i_1363_ & 0xff00) * i_1362_)
					      & 0xff0000)) >> 8;
				    i_1302_ += i_1307_;
				}
				i_1303_ += i_1308_;
				i_1302_ = i_1356_;
				i_1311_ += i_1312_;
			    }
			} else {
			    int i_1364_ = (i_1299_ & 0xff0000) >> 16;
			    int i_1365_ = (i_1299_ & 0xff00) >> 8;
			    int i_1366_ = i_1299_ & 0xff;
			    for (int i_1367_ = -i_1297_; i_1367_ < 0;
				 i_1367_++) {
				int i_1368_ = ((i_1303_ >> 16)
					       * (((Class151_Sub1_Sub3) this)
						  .anInt8803));
				for (int i_1369_ = -i_1296_; i_1369_ < 0;
				     i_1369_++) {
				    int i_1370_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1302_ >> 16) + i_1368_]);
				    int i_1371_
					= ((i_1370_ >>> 24) * (i_1299_ >>> 24)
					   >> 8);
				    int i_1372_ = 256 - i_1371_;
				    if (i_1371_ != 255) {
					int i_1373_
					    = ((i_1370_ & 0xff0000) * i_1364_
					       & ~0xffffff);
					int i_1374_
					    = ((i_1370_ & 0xff00) * i_1365_
					       & 0xff0000);
					int i_1375_
					    = ((i_1370_ & 0xff) * i_1366_
					       & 0xff00);
					i_1370_ = (i_1373_ | i_1374_
						   | i_1375_) >>> 8;
					int i_1376_ = is[i_1311_];
					is[i_1311_++]
					    = ((((i_1370_ & 0xff00ff) * i_1371_
						 + ((i_1376_ & 0xff00ff)
						    * i_1372_))
						& ~0xff00ff)
					       + (((i_1370_ & 0xff00) * i_1371_
						   + ((i_1376_ & 0xff00)
						      * i_1372_))
						  & 0xff0000)) >> 8;
				    } else {
					int i_1377_
					    = ((i_1370_ & 0xff0000) * i_1364_
					       & ~0xffffff);
					int i_1378_
					    = ((i_1370_ & 0xff00) * i_1365_
					       & 0xff0000);
					int i_1379_
					    = ((i_1370_ & 0xff) * i_1366_
					       & 0xff00);
					is[i_1311_++] = (i_1377_ | i_1378_
							 | i_1379_) >>> 8;
				    }
				    i_1302_ += i_1307_;
				}
				i_1303_ += i_1308_;
				i_1302_ = i_1356_;
				i_1311_ += i_1312_;
			    }
			}
		    } else if (i_1298_ == 3) {
			int i_1380_ = i_1302_;
			for (int i_1381_ = -i_1297_; i_1381_ < 0; i_1381_++) {
			    int i_1382_
				= ((i_1303_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_1383_ = -i_1296_; i_1383_ < 0;
				 i_1383_++) {
				int i_1384_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309
					       [(i_1302_ >> 16) + i_1382_]);
				int i_1385_ = i_1384_ + i_1299_;
				int i_1386_ = ((i_1384_ & 0xff00ff)
					       + (i_1299_ & 0xff00ff));
				int i_1387_
				    = ((i_1386_ & 0x1000100)
				       + (i_1385_ - i_1386_ & 0x10000));
				i_1387_
				    = i_1385_ - i_1387_ | i_1387_ - (i_1387_
								     >>> 8);
				int i_1388_
				    = (i_1387_ >>> 24) * (i_1299_ >>> 24) >> 8;
				int i_1389_ = 256 - i_1388_;
				if (i_1388_ != 255) {
				    i_1384_ = i_1387_;
				    i_1387_ = is[i_1311_];
				    i_1387_
					= ((((i_1384_ & 0xff00ff) * i_1388_
					     + (i_1387_ & 0xff00ff) * i_1389_)
					    & ~0xff00ff)
					   + (((i_1384_ & 0xff00) * i_1388_
					       + (i_1387_ & 0xff00) * i_1389_)
					      & 0xff0000)) >> 8;
				}
				is[i_1311_++] = i_1387_;
				i_1302_ += i_1307_;
			    }
			    i_1303_ += i_1308_;
			    i_1302_ = i_1380_;
			    i_1311_ += i_1312_;
			}
		    } else if (i_1298_ == 2) {
			int i_1390_ = i_1299_ >>> 24;
			int i_1391_ = 256 - i_1390_;
			int i_1392_
			    = (i_1299_ & 0xff00ff) * i_1391_ & ~0xff00ff;
			int i_1393_ = (i_1299_ & 0xff00) * i_1391_ & 0xff0000;
			i_1299_ = (i_1392_ | i_1393_) >>> 8;
			int i_1394_ = i_1302_;
			for (int i_1395_ = -i_1297_; i_1395_ < 0; i_1395_++) {
			    int i_1396_
				= ((i_1303_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_1397_ = -i_1296_; i_1397_ < 0;
				 i_1397_++) {
				int i_1398_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309
					       [(i_1302_ >> 16) + i_1396_]);
				int i_1399_ = i_1398_ >>> 24;
				int i_1400_ = 256 - i_1399_;
				i_1392_ = ((i_1398_ & 0xff00ff) * i_1390_
					   & ~0xff00ff);
				i_1393_
				    = (i_1398_ & 0xff00) * i_1390_ & 0xff0000;
				i_1398_
				    = ((i_1392_ | i_1393_) >>> 8) + i_1299_;
				int i_1401_ = is[i_1311_];
				is[i_1311_++]
				    = ((((i_1398_ & 0xff00ff) * i_1399_
					 + (i_1401_ & 0xff00ff) * i_1400_)
					& ~0xff00ff)
				       + (((i_1398_ & 0xff00) * i_1399_
					   + (i_1401_ & 0xff00) * i_1400_)
					  & 0xff0000)) >> 8;
				i_1302_ += i_1307_;
			    }
			    i_1303_ += i_1308_;
			    i_1302_ = i_1394_;
			    i_1311_ += i_1312_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1300_ == 2) {
		    if (i_1298_ == 1) {
			int i_1402_ = i_1302_;
			for (int i_1403_ = -i_1297_; i_1403_ < 0; i_1403_++) {
			    int i_1404_
				= ((i_1303_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_1405_ = -i_1296_; i_1405_ < 0;
				 i_1405_++) {
				int i_1406_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309
					       [(i_1302_ >> 16) + i_1404_]);
				if (i_1406_ != 0) {
				    int i_1407_ = is[i_1311_];
				    int i_1408_ = i_1406_ + i_1407_;
				    int i_1409_ = ((i_1406_ & 0xff00ff)
						   + (i_1407_ & 0xff00ff));
				    i_1407_
					= ((i_1409_ & 0x1000100)
					   + (i_1408_ - i_1409_ & 0x10000));
				    is[i_1311_++]
					= (i_1408_ - i_1407_
					   | i_1407_ - (i_1407_ >>> 8));
				} else
				    i_1311_++;
				i_1302_ += i_1307_;
			    }
			    i_1303_ += i_1308_;
			    i_1302_ = i_1402_;
			    i_1311_ += i_1312_;
			}
		    } else if (i_1298_ == 0) {
			int i_1410_ = i_1302_;
			int i_1411_ = (i_1299_ & 0xff0000) >> 16;
			int i_1412_ = (i_1299_ & 0xff00) >> 8;
			int i_1413_ = i_1299_ & 0xff;
			for (int i_1414_ = -i_1297_; i_1414_ < 0; i_1414_++) {
			    int i_1415_
				= ((i_1303_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_1416_ = -i_1296_; i_1416_ < 0;
				 i_1416_++) {
				int i_1417_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309
					       [(i_1302_ >> 16) + i_1415_]);
				if (i_1417_ != 0) {
				    int i_1418_
					= ((i_1417_ & 0xff0000) * i_1411_
					   & ~0xffffff);
				    int i_1419_ = ((i_1417_ & 0xff00) * i_1412_
						   & 0xff0000);
				    int i_1420_
					= (i_1417_ & 0xff) * i_1413_ & 0xff00;
				    i_1417_
					= (i_1418_ | i_1419_ | i_1420_) >>> 8;
				    int i_1421_ = is[i_1311_];
				    int i_1422_ = i_1417_ + i_1421_;
				    int i_1423_ = ((i_1417_ & 0xff00ff)
						   + (i_1421_ & 0xff00ff));
				    i_1421_
					= ((i_1423_ & 0x1000100)
					   + (i_1422_ - i_1423_ & 0x10000));
				    is[i_1311_++]
					= (i_1422_ - i_1421_
					   | i_1421_ - (i_1421_ >>> 8));
				} else
				    i_1311_++;
				i_1302_ += i_1307_;
			    }
			    i_1303_ += i_1308_;
			    i_1302_ = i_1410_;
			    i_1311_ += i_1312_;
			}
		    } else if (i_1298_ == 3) {
			int i_1424_ = i_1302_;
			for (int i_1425_ = -i_1297_; i_1425_ < 0; i_1425_++) {
			    int i_1426_
				= ((i_1303_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_1427_ = -i_1296_; i_1427_ < 0;
				 i_1427_++) {
				int i_1428_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309
					       [(i_1302_ >> 16) + i_1426_]);
				int i_1429_ = i_1428_ + i_1299_;
				int i_1430_ = ((i_1428_ & 0xff00ff)
					       + (i_1299_ & 0xff00ff));
				int i_1431_
				    = ((i_1430_ & 0x1000100)
				       + (i_1429_ - i_1430_ & 0x10000));
				i_1428_
				    = i_1429_ - i_1431_ | i_1431_ - (i_1431_
								     >>> 8);
				i_1431_ = is[i_1311_];
				i_1429_ = i_1428_ + i_1431_;
				i_1430_ = (i_1428_ & 0xff00ff) + (i_1431_
								  & 0xff00ff);
				i_1431_ = ((i_1430_ & 0x1000100)
					   + (i_1429_ - i_1430_ & 0x10000));
				is[i_1311_++]
				    = i_1429_ - i_1431_ | i_1431_ - (i_1431_
								     >>> 8);
				i_1302_ += i_1307_;
			    }
			    i_1303_ += i_1308_;
			    i_1302_ = i_1424_;
			    i_1311_ += i_1312_;
			}
		    } else if (i_1298_ == 2) {
			int i_1432_ = i_1299_ >>> 24;
			int i_1433_ = 256 - i_1432_;
			int i_1434_
			    = (i_1299_ & 0xff00ff) * i_1433_ & ~0xff00ff;
			int i_1435_ = (i_1299_ & 0xff00) * i_1433_ & 0xff0000;
			i_1299_ = (i_1434_ | i_1435_) >>> 8;
			int i_1436_ = i_1302_;
			for (int i_1437_ = -i_1297_; i_1437_ < 0; i_1437_++) {
			    int i_1438_
				= ((i_1303_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_1439_ = -i_1296_; i_1439_ < 0;
				 i_1439_++) {
				int i_1440_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309
					       [(i_1302_ >> 16) + i_1438_]);
				if (i_1440_ != 0) {
				    i_1434_ = ((i_1440_ & 0xff00ff) * i_1432_
					       & ~0xff00ff);
				    i_1435_ = ((i_1440_ & 0xff00) * i_1432_
					       & 0xff0000);
				    i_1440_ = (((i_1434_ | i_1435_) >>> 8)
					       + i_1299_);
				    int i_1441_ = is[i_1311_];
				    int i_1442_ = i_1440_ + i_1441_;
				    int i_1443_ = ((i_1440_ & 0xff00ff)
						   + (i_1441_ & 0xff00ff));
				    i_1441_
					= ((i_1443_ & 0x1000100)
					   + (i_1442_ - i_1443_ & 0x10000));
				    is[i_1311_++]
					= (i_1442_ - i_1441_
					   | i_1441_ - (i_1441_ >>> 8));
				} else
				    i_1311_++;
				i_1302_ += i_1307_;
			    }
			    i_1303_ += i_1308_;
			    i_1302_ = i_1436_;
			    i_1311_ += i_1312_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method8294(int i, int i_1444_) {
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    if (anInt8822 == 0) {
		if (anInt8825 == 0) {
		    int i_1445_ = anInt8816;
		    while (i_1445_ < 0) {
			int i_1446_ = anInt8818;
			int i_1447_ = anInt8807;
			int i_1448_ = anInt8826;
			int i_1449_ = anInt8809;
			if (i_1447_ >= 0 && i_1448_ >= 0
			    && i_1447_ - (((Class151_Sub1_Sub3) this).anInt8803
					  << 12) < 0
			    && i_1448_ - (((Class151_Sub1_Sub3) this).anInt8804
					  << 12) < 0) {
			    for (/**/; i_1449_ < 0; i_1449_++)
				method10367(((i_1448_ >> 12)
					     * (((Class151_Sub1_Sub3) this)
						.anInt8803)) + (i_1447_ >> 12),
					    i_1446_++, is, i, i_1444_);
			}
			i_1445_++;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_1450_ = anInt8816;
		    while (i_1450_ < 0) {
			int i_1451_ = anInt8818;
			int i_1452_ = anInt8807;
			int i_1453_ = anInt8826 + anInt8828;
			int i_1454_ = anInt8809;
			if (i_1452_ >= 0
			    && i_1452_ - (((Class151_Sub1_Sub3) this).anInt8803
					  << 12) < 0) {
			    int i_1455_;
			    if ((i_1455_
				 = (i_1453_
				    - (((Class151_Sub1_Sub3) this).anInt8804
				       << 12)))
				>= 0) {
				i_1455_ = (anInt8825 - i_1455_) / anInt8825;
				i_1454_ += i_1455_;
				i_1453_ += anInt8825 * i_1455_;
				i_1451_ += i_1455_;
			    }
			    if ((i_1455_ = (i_1453_ - anInt8825) / anInt8825)
				> i_1454_)
				i_1454_ = i_1455_;
			    for (/**/; i_1454_ < 0; i_1454_++) {
				method10367(((i_1453_ >> 12)
					     * (((Class151_Sub1_Sub3) this)
						.anInt8803)) + (i_1452_ >> 12),
					    i_1451_++, is, i, i_1444_);
				i_1453_ += anInt8825;
			    }
			}
			i_1450_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_1456_ = anInt8816;
		    while (i_1456_ < 0) {
			int i_1457_ = anInt8818;
			int i_1458_ = anInt8807;
			int i_1459_ = anInt8826 + anInt8828;
			int i_1460_ = anInt8809;
			if (i_1458_ >= 0
			    && i_1458_ - (((Class151_Sub1_Sub3) this).anInt8803
					  << 12) < 0) {
			    if (i_1459_ < 0) {
				int i_1461_
				    = (anInt8825 - 1 - i_1459_) / anInt8825;
				i_1460_ += i_1461_;
				i_1459_ += anInt8825 * i_1461_;
				i_1457_ += i_1461_;
			    }
			    int i_1462_;
			    if ((i_1462_
				 = (1 + i_1459_
				    - (((Class151_Sub1_Sub3) this).anInt8804
				       << 12)
				    - anInt8825) / anInt8825)
				> i_1460_)
				i_1460_ = i_1462_;
			    for (/**/; i_1460_ < 0; i_1460_++) {
				method10367(((i_1459_ >> 12)
					     * (((Class151_Sub1_Sub3) this)
						.anInt8803)) + (i_1458_ >> 12),
					    i_1457_++, is, i, i_1444_);
				i_1459_ += anInt8825;
			    }
			}
			i_1456_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8822 < 0) {
		if (anInt8825 == 0) {
		    int i_1463_ = anInt8816;
		    while (i_1463_ < 0) {
			int i_1464_ = anInt8818;
			int i_1465_ = anInt8807 + anInt8805;
			int i_1466_ = anInt8826;
			int i_1467_ = anInt8809;
			if (i_1466_ >= 0
			    && i_1466_ - (((Class151_Sub1_Sub3) this).anInt8804
					  << 12) < 0) {
			    int i_1468_;
			    if ((i_1468_
				 = (i_1465_
				    - (((Class151_Sub1_Sub3) this).anInt8803
				       << 12)))
				>= 0) {
				i_1468_ = (anInt8822 - i_1468_) / anInt8822;
				i_1467_ += i_1468_;
				i_1465_ += anInt8822 * i_1468_;
				i_1464_ += i_1468_;
			    }
			    if ((i_1468_ = (i_1465_ - anInt8822) / anInt8822)
				> i_1467_)
				i_1467_ = i_1468_;
			    for (/**/; i_1467_ < 0; i_1467_++) {
				method10367(((i_1466_ >> 12)
					     * (((Class151_Sub1_Sub3) this)
						.anInt8803)) + (i_1465_ >> 12),
					    i_1464_++, is, i, i_1444_);
				i_1465_ += anInt8822;
			    }
			}
			i_1463_++;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_1469_ = anInt8816;
		    while (i_1469_ < 0) {
			int i_1470_ = anInt8818;
			int i_1471_ = anInt8807 + anInt8805;
			int i_1472_ = anInt8826 + anInt8828;
			int i_1473_ = anInt8809;
			int i_1474_;
			if ((i_1474_
			     = i_1471_ - (((Class151_Sub1_Sub3) this).anInt8803
					  << 12))
			    >= 0) {
			    i_1474_ = (anInt8822 - i_1474_) / anInt8822;
			    i_1473_ += i_1474_;
			    i_1471_ += anInt8822 * i_1474_;
			    i_1472_ += anInt8825 * i_1474_;
			    i_1470_ += i_1474_;
			}
			if ((i_1474_ = (i_1471_ - anInt8822) / anInt8822)
			    > i_1473_)
			    i_1473_ = i_1474_;
			if ((i_1474_
			     = i_1472_ - (((Class151_Sub1_Sub3) this).anInt8804
					  << 12))
			    >= 0) {
			    i_1474_ = (anInt8825 - i_1474_) / anInt8825;
			    i_1473_ += i_1474_;
			    i_1471_ += anInt8822 * i_1474_;
			    i_1472_ += anInt8825 * i_1474_;
			    i_1470_ += i_1474_;
			}
			if ((i_1474_ = (i_1472_ - anInt8825) / anInt8825)
			    > i_1473_)
			    i_1473_ = i_1474_;
			for (/**/; i_1473_ < 0; i_1473_++) {
			    method10367(((i_1472_ >> 12)
					 * (((Class151_Sub1_Sub3) this)
					    .anInt8803)) + (i_1471_ >> 12),
					i_1470_++, is, i, i_1444_);
			    i_1471_ += anInt8822;
			    i_1472_ += anInt8825;
			}
			i_1469_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_1475_ = anInt8816;
		    while (i_1475_ < 0) {
			int i_1476_ = anInt8818;
			int i_1477_ = anInt8807 + anInt8805;
			int i_1478_ = anInt8826 + anInt8828;
			int i_1479_ = anInt8809;
			int i_1480_;
			if ((i_1480_
			     = i_1477_ - (((Class151_Sub1_Sub3) this).anInt8803
					  << 12))
			    >= 0) {
			    i_1480_ = (anInt8822 - i_1480_) / anInt8822;
			    i_1479_ += i_1480_;
			    i_1477_ += anInt8822 * i_1480_;
			    i_1478_ += anInt8825 * i_1480_;
			    i_1476_ += i_1480_;
			}
			if ((i_1480_ = (i_1477_ - anInt8822) / anInt8822)
			    > i_1479_)
			    i_1479_ = i_1480_;
			if (i_1478_ < 0) {
			    i_1480_ = (anInt8825 - 1 - i_1478_) / anInt8825;
			    i_1479_ += i_1480_;
			    i_1477_ += anInt8822 * i_1480_;
			    i_1478_ += anInt8825 * i_1480_;
			    i_1476_ += i_1480_;
			}
			if ((i_1480_
			     = (1 + i_1478_
				- (((Class151_Sub1_Sub3) this).anInt8804 << 12)
				- anInt8825) / anInt8825)
			    > i_1479_)
			    i_1479_ = i_1480_;
			for (/**/; i_1479_ < 0; i_1479_++) {
			    method10367(((i_1478_ >> 12)
					 * (((Class151_Sub1_Sub3) this)
					    .anInt8803)) + (i_1477_ >> 12),
					i_1476_++, is, i, i_1444_);
			    i_1477_ += anInt8822;
			    i_1478_ += anInt8825;
			}
			i_1475_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8825 == 0) {
		int i_1481_ = anInt8816;
		while (i_1481_ < 0) {
		    int i_1482_ = anInt8818;
		    int i_1483_ = anInt8807 + anInt8805;
		    int i_1484_ = anInt8826;
		    int i_1485_ = anInt8809;
		    if (i_1484_ >= 0
			&& i_1484_ - (((Class151_Sub1_Sub3) this).anInt8804
				      << 12) < 0) {
			if (i_1483_ < 0) {
			    int i_1486_
				= (anInt8822 - 1 - i_1483_) / anInt8822;
			    i_1485_ += i_1486_;
			    i_1483_ += anInt8822 * i_1486_;
			    i_1482_ += i_1486_;
			}
			int i_1487_;
			if ((i_1487_
			     = (1 + i_1483_
				- (((Class151_Sub1_Sub3) this).anInt8803 << 12)
				- anInt8822) / anInt8822)
			    > i_1485_)
			    i_1485_ = i_1487_;
			for (/**/; i_1485_ < 0; i_1485_++) {
			    method10367(((i_1484_ >> 12)
					 * (((Class151_Sub1_Sub3) this)
					    .anInt8803)) + (i_1483_ >> 12),
					i_1482_++, is, i, i_1444_);
			    i_1483_ += anInt8822;
			}
		    }
		    i_1481_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else if (anInt8825 < 0) {
		for (int i_1488_ = anInt8816; i_1488_ < 0; i_1488_++) {
		    int i_1489_ = anInt8818;
		    int i_1490_ = anInt8807 + anInt8805;
		    int i_1491_ = anInt8826 + anInt8828;
		    int i_1492_ = anInt8809;
		    if (i_1490_ < 0) {
			int i_1493_ = (anInt8822 - 1 - i_1490_) / anInt8822;
			i_1492_ += i_1493_;
			i_1490_ += anInt8822 * i_1493_;
			i_1491_ += anInt8825 * i_1493_;
			i_1489_ += i_1493_;
		    }
		    int i_1494_;
		    if ((i_1494_
			 = (1 + i_1490_
			    - (((Class151_Sub1_Sub3) this).anInt8803 << 12)
			    - anInt8822) / anInt8822)
			> i_1492_)
			i_1492_ = i_1494_;
		    if ((i_1494_
			 = i_1491_ - (((Class151_Sub1_Sub3) this).anInt8804
				      << 12))
			>= 0) {
			i_1494_ = (anInt8825 - i_1494_) / anInt8825;
			i_1492_ += i_1494_;
			i_1490_ += anInt8822 * i_1494_;
			i_1491_ += anInt8825 * i_1494_;
			i_1489_ += i_1494_;
		    }
		    if ((i_1494_ = (i_1491_ - anInt8825) / anInt8825)
			> i_1492_)
			i_1492_ = i_1494_;
		    for (/**/; i_1492_ < 0; i_1492_++) {
			method10367((((i_1491_ >> 12)
				      * ((Class151_Sub1_Sub3) this).anInt8803)
				     + (i_1490_ >> 12)),
				    i_1489_++, is, i, i_1444_);
			i_1490_ += anInt8822;
			i_1491_ += anInt8825;
		    }
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else {
		for (int i_1495_ = anInt8816; i_1495_ < 0; i_1495_++) {
		    int i_1496_ = anInt8818;
		    int i_1497_ = anInt8807 + anInt8805;
		    int i_1498_ = anInt8826 + anInt8828;
		    int i_1499_ = anInt8809;
		    if (i_1497_ < 0) {
			int i_1500_ = (anInt8822 - 1 - i_1497_) / anInt8822;
			i_1499_ += i_1500_;
			i_1497_ += anInt8822 * i_1500_;
			i_1498_ += anInt8825 * i_1500_;
			i_1496_ += i_1500_;
		    }
		    int i_1501_;
		    if ((i_1501_
			 = (1 + i_1497_
			    - (((Class151_Sub1_Sub3) this).anInt8803 << 12)
			    - anInt8822) / anInt8822)
			> i_1499_)
			i_1499_ = i_1501_;
		    if (i_1498_ < 0) {
			i_1501_ = (anInt8825 - 1 - i_1498_) / anInt8825;
			i_1499_ += i_1501_;
			i_1497_ += anInt8822 * i_1501_;
			i_1498_ += anInt8825 * i_1501_;
			i_1496_ += i_1501_;
		    }
		    if ((i_1501_
			 = (1 + i_1498_
			    - (((Class151_Sub1_Sub3) this).anInt8804 << 12)
			    - anInt8825) / anInt8825)
			> i_1499_)
			i_1499_ = i_1501_;
		    for (/**/; i_1499_ < 0; i_1499_++) {
			method10367((((i_1498_ >> 12)
				      * ((Class151_Sub1_Sub3) this).anInt8803)
				     + (i_1497_ >> 12)),
				    i_1496_++, is, i, i_1444_);
			i_1497_ += anInt8822;
			i_1498_ += anInt8825;
		    }
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    }
	}
    }
    
    void method8295(int i, int i_1502_) {
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    if (anInt8822 == 0) {
		if (anInt8825 == 0) {
		    int i_1503_ = anInt8816;
		    while (i_1503_ < 0) {
			int i_1504_ = anInt8818;
			int i_1505_ = anInt8807;
			int i_1506_ = anInt8826;
			int i_1507_ = anInt8809;
			if (i_1505_ >= 0 && i_1506_ >= 0
			    && i_1505_ - (((Class151_Sub1_Sub3) this).anInt8803
					  << 12) < 0
			    && i_1506_ - (((Class151_Sub1_Sub3) this).anInt8804
					  << 12) < 0) {
			    for (/**/; i_1507_ < 0; i_1507_++)
				method10367(((i_1506_ >> 12)
					     * (((Class151_Sub1_Sub3) this)
						.anInt8803)) + (i_1505_ >> 12),
					    i_1504_++, is, i, i_1502_);
			}
			i_1503_++;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_1508_ = anInt8816;
		    while (i_1508_ < 0) {
			int i_1509_ = anInt8818;
			int i_1510_ = anInt8807;
			int i_1511_ = anInt8826 + anInt8828;
			int i_1512_ = anInt8809;
			if (i_1510_ >= 0
			    && i_1510_ - (((Class151_Sub1_Sub3) this).anInt8803
					  << 12) < 0) {
			    int i_1513_;
			    if ((i_1513_
				 = (i_1511_
				    - (((Class151_Sub1_Sub3) this).anInt8804
				       << 12)))
				>= 0) {
				i_1513_ = (anInt8825 - i_1513_) / anInt8825;
				i_1512_ += i_1513_;
				i_1511_ += anInt8825 * i_1513_;
				i_1509_ += i_1513_;
			    }
			    if ((i_1513_ = (i_1511_ - anInt8825) / anInt8825)
				> i_1512_)
				i_1512_ = i_1513_;
			    for (/**/; i_1512_ < 0; i_1512_++) {
				method10367(((i_1511_ >> 12)
					     * (((Class151_Sub1_Sub3) this)
						.anInt8803)) + (i_1510_ >> 12),
					    i_1509_++, is, i, i_1502_);
				i_1511_ += anInt8825;
			    }
			}
			i_1508_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_1514_ = anInt8816;
		    while (i_1514_ < 0) {
			int i_1515_ = anInt8818;
			int i_1516_ = anInt8807;
			int i_1517_ = anInt8826 + anInt8828;
			int i_1518_ = anInt8809;
			if (i_1516_ >= 0
			    && i_1516_ - (((Class151_Sub1_Sub3) this).anInt8803
					  << 12) < 0) {
			    if (i_1517_ < 0) {
				int i_1519_
				    = (anInt8825 - 1 - i_1517_) / anInt8825;
				i_1518_ += i_1519_;
				i_1517_ += anInt8825 * i_1519_;
				i_1515_ += i_1519_;
			    }
			    int i_1520_;
			    if ((i_1520_
				 = (1 + i_1517_
				    - (((Class151_Sub1_Sub3) this).anInt8804
				       << 12)
				    - anInt8825) / anInt8825)
				> i_1518_)
				i_1518_ = i_1520_;
			    for (/**/; i_1518_ < 0; i_1518_++) {
				method10367(((i_1517_ >> 12)
					     * (((Class151_Sub1_Sub3) this)
						.anInt8803)) + (i_1516_ >> 12),
					    i_1515_++, is, i, i_1502_);
				i_1517_ += anInt8825;
			    }
			}
			i_1514_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8822 < 0) {
		if (anInt8825 == 0) {
		    int i_1521_ = anInt8816;
		    while (i_1521_ < 0) {
			int i_1522_ = anInt8818;
			int i_1523_ = anInt8807 + anInt8805;
			int i_1524_ = anInt8826;
			int i_1525_ = anInt8809;
			if (i_1524_ >= 0
			    && i_1524_ - (((Class151_Sub1_Sub3) this).anInt8804
					  << 12) < 0) {
			    int i_1526_;
			    if ((i_1526_
				 = (i_1523_
				    - (((Class151_Sub1_Sub3) this).anInt8803
				       << 12)))
				>= 0) {
				i_1526_ = (anInt8822 - i_1526_) / anInt8822;
				i_1525_ += i_1526_;
				i_1523_ += anInt8822 * i_1526_;
				i_1522_ += i_1526_;
			    }
			    if ((i_1526_ = (i_1523_ - anInt8822) / anInt8822)
				> i_1525_)
				i_1525_ = i_1526_;
			    for (/**/; i_1525_ < 0; i_1525_++) {
				method10367(((i_1524_ >> 12)
					     * (((Class151_Sub1_Sub3) this)
						.anInt8803)) + (i_1523_ >> 12),
					    i_1522_++, is, i, i_1502_);
				i_1523_ += anInt8822;
			    }
			}
			i_1521_++;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_1527_ = anInt8816;
		    while (i_1527_ < 0) {
			int i_1528_ = anInt8818;
			int i_1529_ = anInt8807 + anInt8805;
			int i_1530_ = anInt8826 + anInt8828;
			int i_1531_ = anInt8809;
			int i_1532_;
			if ((i_1532_
			     = i_1529_ - (((Class151_Sub1_Sub3) this).anInt8803
					  << 12))
			    >= 0) {
			    i_1532_ = (anInt8822 - i_1532_) / anInt8822;
			    i_1531_ += i_1532_;
			    i_1529_ += anInt8822 * i_1532_;
			    i_1530_ += anInt8825 * i_1532_;
			    i_1528_ += i_1532_;
			}
			if ((i_1532_ = (i_1529_ - anInt8822) / anInt8822)
			    > i_1531_)
			    i_1531_ = i_1532_;
			if ((i_1532_
			     = i_1530_ - (((Class151_Sub1_Sub3) this).anInt8804
					  << 12))
			    >= 0) {
			    i_1532_ = (anInt8825 - i_1532_) / anInt8825;
			    i_1531_ += i_1532_;
			    i_1529_ += anInt8822 * i_1532_;
			    i_1530_ += anInt8825 * i_1532_;
			    i_1528_ += i_1532_;
			}
			if ((i_1532_ = (i_1530_ - anInt8825) / anInt8825)
			    > i_1531_)
			    i_1531_ = i_1532_;
			for (/**/; i_1531_ < 0; i_1531_++) {
			    method10367(((i_1530_ >> 12)
					 * (((Class151_Sub1_Sub3) this)
					    .anInt8803)) + (i_1529_ >> 12),
					i_1528_++, is, i, i_1502_);
			    i_1529_ += anInt8822;
			    i_1530_ += anInt8825;
			}
			i_1527_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_1533_ = anInt8816;
		    while (i_1533_ < 0) {
			int i_1534_ = anInt8818;
			int i_1535_ = anInt8807 + anInt8805;
			int i_1536_ = anInt8826 + anInt8828;
			int i_1537_ = anInt8809;
			int i_1538_;
			if ((i_1538_
			     = i_1535_ - (((Class151_Sub1_Sub3) this).anInt8803
					  << 12))
			    >= 0) {
			    i_1538_ = (anInt8822 - i_1538_) / anInt8822;
			    i_1537_ += i_1538_;
			    i_1535_ += anInt8822 * i_1538_;
			    i_1536_ += anInt8825 * i_1538_;
			    i_1534_ += i_1538_;
			}
			if ((i_1538_ = (i_1535_ - anInt8822) / anInt8822)
			    > i_1537_)
			    i_1537_ = i_1538_;
			if (i_1536_ < 0) {
			    i_1538_ = (anInt8825 - 1 - i_1536_) / anInt8825;
			    i_1537_ += i_1538_;
			    i_1535_ += anInt8822 * i_1538_;
			    i_1536_ += anInt8825 * i_1538_;
			    i_1534_ += i_1538_;
			}
			if ((i_1538_
			     = (1 + i_1536_
				- (((Class151_Sub1_Sub3) this).anInt8804 << 12)
				- anInt8825) / anInt8825)
			    > i_1537_)
			    i_1537_ = i_1538_;
			for (/**/; i_1537_ < 0; i_1537_++) {
			    method10367(((i_1536_ >> 12)
					 * (((Class151_Sub1_Sub3) this)
					    .anInt8803)) + (i_1535_ >> 12),
					i_1534_++, is, i, i_1502_);
			    i_1535_ += anInt8822;
			    i_1536_ += anInt8825;
			}
			i_1533_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8825 == 0) {
		int i_1539_ = anInt8816;
		while (i_1539_ < 0) {
		    int i_1540_ = anInt8818;
		    int i_1541_ = anInt8807 + anInt8805;
		    int i_1542_ = anInt8826;
		    int i_1543_ = anInt8809;
		    if (i_1542_ >= 0
			&& i_1542_ - (((Class151_Sub1_Sub3) this).anInt8804
				      << 12) < 0) {
			if (i_1541_ < 0) {
			    int i_1544_
				= (anInt8822 - 1 - i_1541_) / anInt8822;
			    i_1543_ += i_1544_;
			    i_1541_ += anInt8822 * i_1544_;
			    i_1540_ += i_1544_;
			}
			int i_1545_;
			if ((i_1545_
			     = (1 + i_1541_
				- (((Class151_Sub1_Sub3) this).anInt8803 << 12)
				- anInt8822) / anInt8822)
			    > i_1543_)
			    i_1543_ = i_1545_;
			for (/**/; i_1543_ < 0; i_1543_++) {
			    method10367(((i_1542_ >> 12)
					 * (((Class151_Sub1_Sub3) this)
					    .anInt8803)) + (i_1541_ >> 12),
					i_1540_++, is, i, i_1502_);
			    i_1541_ += anInt8822;
			}
		    }
		    i_1539_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else if (anInt8825 < 0) {
		for (int i_1546_ = anInt8816; i_1546_ < 0; i_1546_++) {
		    int i_1547_ = anInt8818;
		    int i_1548_ = anInt8807 + anInt8805;
		    int i_1549_ = anInt8826 + anInt8828;
		    int i_1550_ = anInt8809;
		    if (i_1548_ < 0) {
			int i_1551_ = (anInt8822 - 1 - i_1548_) / anInt8822;
			i_1550_ += i_1551_;
			i_1548_ += anInt8822 * i_1551_;
			i_1549_ += anInt8825 * i_1551_;
			i_1547_ += i_1551_;
		    }
		    int i_1552_;
		    if ((i_1552_
			 = (1 + i_1548_
			    - (((Class151_Sub1_Sub3) this).anInt8803 << 12)
			    - anInt8822) / anInt8822)
			> i_1550_)
			i_1550_ = i_1552_;
		    if ((i_1552_
			 = i_1549_ - (((Class151_Sub1_Sub3) this).anInt8804
				      << 12))
			>= 0) {
			i_1552_ = (anInt8825 - i_1552_) / anInt8825;
			i_1550_ += i_1552_;
			i_1548_ += anInt8822 * i_1552_;
			i_1549_ += anInt8825 * i_1552_;
			i_1547_ += i_1552_;
		    }
		    if ((i_1552_ = (i_1549_ - anInt8825) / anInt8825)
			> i_1550_)
			i_1550_ = i_1552_;
		    for (/**/; i_1550_ < 0; i_1550_++) {
			method10367((((i_1549_ >> 12)
				      * ((Class151_Sub1_Sub3) this).anInt8803)
				     + (i_1548_ >> 12)),
				    i_1547_++, is, i, i_1502_);
			i_1548_ += anInt8822;
			i_1549_ += anInt8825;
		    }
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else {
		for (int i_1553_ = anInt8816; i_1553_ < 0; i_1553_++) {
		    int i_1554_ = anInt8818;
		    int i_1555_ = anInt8807 + anInt8805;
		    int i_1556_ = anInt8826 + anInt8828;
		    int i_1557_ = anInt8809;
		    if (i_1555_ < 0) {
			int i_1558_ = (anInt8822 - 1 - i_1555_) / anInt8822;
			i_1557_ += i_1558_;
			i_1555_ += anInt8822 * i_1558_;
			i_1556_ += anInt8825 * i_1558_;
			i_1554_ += i_1558_;
		    }
		    int i_1559_;
		    if ((i_1559_
			 = (1 + i_1555_
			    - (((Class151_Sub1_Sub3) this).anInt8803 << 12)
			    - anInt8822) / anInt8822)
			> i_1557_)
			i_1557_ = i_1559_;
		    if (i_1556_ < 0) {
			i_1559_ = (anInt8825 - 1 - i_1556_) / anInt8825;
			i_1557_ += i_1559_;
			i_1555_ += anInt8822 * i_1559_;
			i_1556_ += anInt8825 * i_1559_;
			i_1554_ += i_1559_;
		    }
		    if ((i_1559_
			 = (1 + i_1556_
			    - (((Class151_Sub1_Sub3) this).anInt8804 << 12)
			    - anInt8825) / anInt8825)
			> i_1557_)
			i_1557_ = i_1559_;
		    for (/**/; i_1557_ < 0; i_1557_++) {
			method10367((((i_1556_ >> 12)
				      * ((Class151_Sub1_Sub3) this).anInt8803)
				     + (i_1555_ >> 12)),
				    i_1554_++, is, i, i_1502_);
			i_1555_ += anInt8822;
			i_1556_ += anInt8825;
		    }
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    }
	}
    }
    
    public void method1789(int i, int i_1560_, int i_1561_, int i_1562_,
			   int[] is, int i_1563_, int i_1564_) {
	i_1564_ -= i_1561_;
	for (int i_1565_ = 0; i_1565_ < i_1562_; i_1565_++) {
	    int i_1566_ = (i_1560_ + i_1565_) * i_1561_ + i;
	    for (int i_1567_ = 0; i_1567_ < i_1561_; i_1567_++)
		((Class151_Sub1_Sub3) this).anIntArray11309[i_1566_ + i_1567_]
		    = is[i_1563_++];
	    i_1563_ += i_1564_;
	}
    }
    
    void method10369(int i, int i_1568_, int i_1569_, int i_1570_, int[] is,
		     int i_1571_, int i_1572_) {
	i_1572_ -= i_1569_;
	for (int i_1573_ = 0; i_1573_ < i_1570_; i_1573_++) {
	    int i_1574_ = (i_1568_ + i_1573_) * i_1569_ + i;
	    for (int i_1575_ = 0; i_1575_ < i_1569_; i_1575_++)
		is[i_1571_++] = (((Class151_Sub1_Sub3) this).anIntArray11309
				 [i_1574_ + i_1575_]);
	    i_1571_ += i_1572_;
	}
    }
    
    void method8290(boolean bool, boolean bool_1576_, boolean bool_1577_,
		    int i, int i_1578_, float f, int i_1579_, int i_1580_,
		    int i_1581_, int i_1582_, int i_1583_, int i_1584_,
		    boolean bool_1585_) {
	if (i_1579_ > 0 && i_1580_ > 0 && (bool || bool_1576_)) {
	    int i_1586_ = 0;
	    int i_1587_ = 0;
	    int i_1588_ = (((Class151_Sub1_Sub3) this).anInt8806
			   + ((Class151_Sub1_Sub3) this).anInt8803
			   + ((Class151_Sub1_Sub3) this).anInt8832);
	    int i_1589_ = (((Class151_Sub1_Sub3) this).anInt8819
			   + ((Class151_Sub1_Sub3) this).anInt8804
			   + ((Class151_Sub1_Sub3) this).anInt8808);
	    int i_1590_ = (i_1588_ << 16) / i_1579_;
	    int i_1591_ = (i_1589_ << 16) / i_1580_;
	    if (((Class151_Sub1_Sub3) this).anInt8806 > 0) {
		int i_1592_ = (((((Class151_Sub1_Sub3) this).anInt8806 << 16)
				+ i_1590_ - 1)
			       / i_1590_);
		i += i_1592_;
		i_1586_ += (i_1592_ * i_1590_
			    - (((Class151_Sub1_Sub3) this).anInt8806 << 16));
	    }
	    if (((Class151_Sub1_Sub3) this).anInt8819 > 0) {
		int i_1593_ = (((((Class151_Sub1_Sub3) this).anInt8819 << 16)
				+ i_1591_ - 1)
			       / i_1591_);
		i_1578_ += i_1593_;
		i_1587_ += (i_1593_ * i_1591_
			    - (((Class151_Sub1_Sub3) this).anInt8819 << 16));
	    }
	    if (((Class151_Sub1_Sub3) this).anInt8803 < i_1588_)
		i_1579_ = ((((Class151_Sub1_Sub3) this).anInt8803 << 16)
			   - i_1586_ + i_1590_ - 1) / i_1590_;
	    if (((Class151_Sub1_Sub3) this).anInt8804 < i_1589_)
		i_1580_ = ((((Class151_Sub1_Sub3) this).anInt8804 << 16)
			   - i_1587_ + i_1591_ - 1) / i_1591_;
	    int i_1594_
		= i + i_1578_ * ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						    .aClass173_Sub3_8814))
				  .anInt9735)
				 * 111437289);
	    int i_1595_ = ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					      .aClass173_Sub3_8814)).anInt9735
			    * 111437289)
			   - i_1579_);
	    if (i_1578_ + i_1580_
		> ((Class173_Sub3) (((Class151_Sub1_Sub3) this)
				    .aClass173_Sub3_8814)).anInt9726 * 6965409)
		i_1580_ -= (i_1578_ + i_1580_
			    - (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						 .aClass173_Sub3_8814))
			       .anInt9726) * 6965409);
	    if (i_1578_ < (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					     .aClass173_Sub3_8814)).anInt9725
			   * 592117349)) {
		int i_1596_ = ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						  .aClass173_Sub3_8814))
				.anInt9725) * 592117349
			       - i_1578_);
		i_1580_ -= i_1596_;
		i_1594_ += i_1596_ * (((Class173_Sub3)
				       (((Class151_Sub1_Sub3) this)
					.aClass173_Sub3_8814)).anInt9735
				      * 111437289);
		i_1587_ += i_1591_ * i_1596_;
	    }
	    if (i + i_1579_ > (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						 .aClass173_Sub3_8814))
			       .anInt9724) * 630968029) {
		int i_1597_ = (i + i_1579_
			       - (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						    .aClass173_Sub3_8814))
				  .anInt9724) * 630968029);
		i_1579_ -= i_1597_;
		i_1595_ += i_1597_;
	    }
	    if (i < (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119)) {
		int i_1598_ = ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						  .aClass173_Sub3_8814))
				.anInt9723) * -993497119
			       - i);
		i_1579_ -= i_1598_;
		i_1594_ += i_1598_;
		i_1586_ += i_1590_ * i_1598_;
		i_1595_ += i_1598_;
	    }
	    float[] fs = (((Class173_Sub3)
			   ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
			  .aFloatArray9716);
	    int[] is = (((Class173_Sub3)
			 ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
			.anIntArray9719);
	    if (i_1583_ == 0) {
		if (i_1581_ == 1) {
		    int i_1599_ = i_1586_;
		    for (int i_1600_ = -i_1580_; i_1600_ < 0; i_1600_++) {
			int i_1601_
			    = ((i_1587_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1602_ = -i_1579_; i_1602_ < 0; i_1602_++) {
			    if (!bool_1576_ || f < fs[i_1594_]) {
				if (bool)
				    is[i_1594_]
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1586_ >> 16) + i_1601_]);
				if (bool_1576_ && bool_1585_)
				    fs[i_1594_] = f;
			    }
			    i_1586_ += i_1590_;
			    i_1594_++;
			}
			i_1587_ += i_1591_;
			i_1586_ = i_1599_;
			i_1594_ += i_1595_;
		    }
		} else if (i_1581_ == 0) {
		    int i_1603_ = (i_1582_ & 0xff0000) >> 16;
		    int i_1604_ = (i_1582_ & 0xff00) >> 8;
		    int i_1605_ = i_1582_ & 0xff;
		    int i_1606_ = i_1586_;
		    for (int i_1607_ = -i_1580_; i_1607_ < 0; i_1607_++) {
			int i_1608_
			    = ((i_1587_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1609_ = -i_1579_; i_1609_ < 0; i_1609_++) {
			    if (!bool_1576_ || f < fs[i_1594_]) {
				if (bool) {
				    int i_1610_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1586_ >> 16) + i_1608_]);
				    int i_1611_
					= ((i_1610_ & 0xff0000) * i_1603_
					   & ~0xffffff);
				    int i_1612_ = ((i_1610_ & 0xff00) * i_1604_
						   & 0xff0000);
				    int i_1613_
					= (i_1610_ & 0xff) * i_1605_ & 0xff00;
				    is[i_1594_]
					= (i_1611_ | i_1612_ | i_1613_) >>> 8;
				}
				if (bool_1576_ && bool_1585_)
				    fs[i_1594_] = f;
			    }
			    i_1586_ += i_1590_;
			    i_1594_++;
			}
			i_1587_ += i_1591_;
			i_1586_ = i_1606_;
			i_1594_ += i_1595_;
		    }
		} else if (i_1581_ == 3) {
		    int i_1614_ = i_1586_;
		    for (int i_1615_ = -i_1580_; i_1615_ < 0; i_1615_++) {
			int i_1616_
			    = ((i_1587_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1617_ = -i_1579_; i_1617_ < 0; i_1617_++) {
			    if (!bool_1576_ || f < fs[i_1594_]) {
				if (bool) {
				    int i_1618_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1586_ >> 16) + i_1616_]);
				    int i_1619_ = i_1618_ + i_1582_;
				    int i_1620_ = ((i_1618_ & 0xff00ff)
						   + (i_1582_ & 0xff00ff));
				    int i_1621_
					= ((i_1620_ & 0x1000100)
					   + (i_1619_ - i_1620_ & 0x10000));
				    is[i_1594_]
					= (i_1619_ - i_1621_
					   | i_1621_ - (i_1621_ >>> 8));
				}
				if (bool_1576_ && bool_1585_)
				    fs[i_1594_] = f;
			    }
			    i_1586_ += i_1590_;
			    i_1594_++;
			}
			i_1587_ += i_1591_;
			i_1586_ = i_1614_;
			i_1594_ += i_1595_;
		    }
		} else if (i_1581_ == 2) {
		    int i_1622_ = i_1582_ >>> 24;
		    int i_1623_ = 256 - i_1622_;
		    int i_1624_ = (i_1582_ & 0xff00ff) * i_1623_ & ~0xff00ff;
		    int i_1625_ = (i_1582_ & 0xff00) * i_1623_ & 0xff0000;
		    i_1582_ = (i_1624_ | i_1625_) >>> 8;
		    int i_1626_ = i_1586_;
		    for (int i_1627_ = -i_1580_; i_1627_ < 0; i_1627_++) {
			int i_1628_
			    = ((i_1587_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1629_ = -i_1579_; i_1629_ < 0; i_1629_++) {
			    if (!bool_1576_ || f < fs[i_1594_]) {
				if (bool) {
				    int i_1630_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1586_ >> 16) + i_1628_]);
				    i_1624_ = ((i_1630_ & 0xff00ff) * i_1622_
					       & ~0xff00ff);
				    i_1625_ = ((i_1630_ & 0xff00) * i_1622_
					       & 0xff0000);
				    is[i_1594_] = (((i_1624_ | i_1625_) >>> 8)
						   + i_1582_);
				}
				if (bool_1576_ && bool_1585_)
				    fs[i_1594_] = f;
			    }
			    i_1586_ += i_1590_;
			    i_1594_++;
			}
			i_1587_ += i_1591_;
			i_1586_ = i_1626_;
			i_1594_ += i_1595_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1583_ == 1) {
		if (i_1581_ == 1) {
		    int i_1631_ = i_1586_;
		    for (int i_1632_ = -i_1580_; i_1632_ < 0; i_1632_++) {
			int i_1633_
			    = ((i_1587_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1634_ = -i_1579_; i_1634_ < 0; i_1634_++) {
			    if (!bool_1576_ || f < fs[i_1594_]) {
				if (bool) {
				    int i_1635_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1586_ >> 16) + i_1633_]);
				    int i_1636_ = i_1635_ >>> 24;
				    int i_1637_ = 256 - i_1636_;
				    int i_1638_ = is[i_1594_];
				    is[i_1594_]
					= (((((i_1635_ & 0xff00ff) * i_1636_
					      + (i_1638_ & 0xff00ff) * i_1637_)
					     & ~0xff00ff)
					    >> 8)
					   + (((((i_1635_ & ~0xff00ff) >>> 8)
						* i_1636_)
					       + (((i_1638_ & ~0xff00ff) >>> 8)
						  * i_1637_))
					      & ~0xff00ff));
				}
				if (bool_1576_ && bool_1585_)
				    fs[i_1594_] = f;
			    }
			    i_1586_ += i_1590_;
			    i_1594_++;
			}
			i_1587_ += i_1591_;
			i_1586_ = i_1631_;
			i_1594_ += i_1595_;
		    }
		} else if (i_1581_ == 0) {
		    int i_1639_ = i_1586_;
		    if ((i_1582_ & 0xffffff) == 16777215) {
			for (int i_1640_ = -i_1580_; i_1640_ < 0; i_1640_++) {
			    int i_1641_
				= ((i_1587_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_1642_ = -i_1579_; i_1642_ < 0;
				 i_1642_++) {
				if (!bool_1576_ || f < fs[i_1594_]) {
				    if (bool) {
					int i_1643_
					    = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309
					       [(i_1586_ >> 16) + i_1641_]);
					int i_1644_
					    = ((i_1643_ >>> 24) * (i_1582_
								   >>> 24)
					       >> 8);
					int i_1645_ = 256 - i_1644_;
					int i_1646_ = is[i_1594_];
					is[i_1594_]
					    = ((((i_1643_ & 0xff00ff) * i_1644_
						 + ((i_1646_ & 0xff00ff)
						    * i_1645_))
						& ~0xff00ff)
					       + (((i_1643_ & 0xff00) * i_1644_
						   + ((i_1646_ & 0xff00)
						      * i_1645_))
						  & 0xff0000)) >> 8;
				    }
				    if (bool_1576_ && bool_1585_)
					fs[i_1594_] = f;
				}
				i_1586_ += i_1590_;
				i_1594_++;
			    }
			    i_1587_ += i_1591_;
			    i_1586_ = i_1639_;
			    i_1594_ += i_1595_;
			}
		    } else {
			int i_1647_ = (i_1582_ & 0xff0000) >> 16;
			int i_1648_ = (i_1582_ & 0xff00) >> 8;
			int i_1649_ = i_1582_ & 0xff;
			for (int i_1650_ = -i_1580_; i_1650_ < 0; i_1650_++) {
			    int i_1651_
				= ((i_1587_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_1652_ = -i_1579_; i_1652_ < 0;
				 i_1652_++) {
				if (!bool_1576_ || f < fs[i_1594_]) {
				    int i_1653_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1586_ >> 16) + i_1651_]);
				    int i_1654_
					= ((i_1653_ >>> 24) * (i_1582_ >>> 24)
					   >> 8);
				    int i_1655_ = 256 - i_1654_;
				    if (i_1654_ != 255) {
					if (bool) {
					    int i_1656_
						= (((i_1653_ & 0xff0000)
						    * i_1647_)
						   & ~0xffffff);
					    int i_1657_
						= ((i_1653_ & 0xff00) * i_1648_
						   & 0xff0000);
					    int i_1658_
						= ((i_1653_ & 0xff) * i_1649_
						   & 0xff00);
					    i_1653_ = (i_1656_ | i_1657_
						       | i_1658_) >>> 8;
					    int i_1659_ = is[i_1594_];
					    is[i_1594_]
						= (((((i_1653_ & 0xff00ff)
						      * i_1654_)
						     + ((i_1659_ & 0xff00ff)
							* i_1655_))
						    & ~0xff00ff)
						   + ((((i_1653_ & 0xff00)
							* i_1654_)
						       + ((i_1659_ & 0xff00)
							  * i_1655_))
						      & 0xff0000)) >> 8;
					    if (bool_1577_) {
						int i_1660_ = ((i_1659_ >>> 24)
							       + i_1654_);
						if (i_1660_ > 255)
						    i_1660_ = 255;
						is[i_1594_] |= i_1660_ << 24;
					    }
					}
					if (bool_1576_ && bool_1585_)
					    fs[i_1594_] = f;
				    } else {
					if (bool) {
					    int i_1661_
						= (((i_1653_ & 0xff0000)
						    * i_1647_)
						   & ~0xffffff);
					    int i_1662_
						= ((i_1653_ & 0xff00) * i_1648_
						   & 0xff0000);
					    int i_1663_
						= ((i_1653_ & 0xff) * i_1649_
						   & 0xff00);
					    is[i_1594_] = (i_1661_ | i_1662_
							   | i_1663_) >>> 8;
					}
					if (bool_1576_ && bool_1585_)
					    fs[i_1594_] = f;
				    }
				}
				i_1586_ += i_1590_;
				i_1594_++;
			    }
			    i_1587_ += i_1591_;
			    i_1586_ = i_1639_;
			    i_1594_ += i_1595_;
			}
		    }
		} else if (i_1581_ == 3) {
		    int i_1664_ = i_1586_;
		    for (int i_1665_ = -i_1580_; i_1665_ < 0; i_1665_++) {
			int i_1666_
			    = ((i_1587_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1667_ = -i_1579_; i_1667_ < 0; i_1667_++) {
			    if (!bool_1576_ || f < fs[i_1594_]) {
				if (bool) {
				    int i_1668_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1586_ >> 16) + i_1666_]);
				    int i_1669_ = i_1668_ + i_1582_;
				    int i_1670_ = ((i_1668_ & 0xff00ff)
						   + (i_1582_ & 0xff00ff));
				    int i_1671_
					= ((i_1670_ & 0x1000100)
					   + (i_1669_ - i_1670_ & 0x10000));
				    i_1671_ = (i_1669_ - i_1671_
					       | i_1671_ - (i_1671_ >>> 8));
				    int i_1672_
					= ((i_1671_ >>> 24) * (i_1582_ >>> 24)
					   >> 8);
				    int i_1673_ = 256 - i_1672_;
				    if (i_1672_ != 255) {
					i_1668_ = i_1671_;
					i_1671_ = is[i_1594_];
					i_1671_
					    = ((((i_1668_ & 0xff00ff) * i_1672_
						 + ((i_1671_ & 0xff00ff)
						    * i_1673_))
						& ~0xff00ff)
					       + (((i_1668_ & 0xff00) * i_1672_
						   + ((i_1671_ & 0xff00)
						      * i_1673_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_1594_] = i_1671_;
				}
				if (bool_1576_ && bool_1585_)
				    fs[i_1594_] = f;
			    }
			    i_1586_ += i_1590_;
			    i_1594_++;
			}
			i_1587_ += i_1591_;
			i_1586_ = i_1664_;
			i_1594_ += i_1595_;
		    }
		} else if (i_1581_ == 2) {
		    int i_1674_ = i_1582_ >>> 24;
		    int i_1675_ = 256 - i_1674_;
		    int i_1676_ = (i_1582_ & 0xff00ff) * i_1675_ & ~0xff00ff;
		    int i_1677_ = (i_1582_ & 0xff00) * i_1675_ & 0xff0000;
		    i_1582_ = (i_1676_ | i_1677_) >>> 8;
		    int i_1678_ = i_1586_;
		    for (int i_1679_ = -i_1580_; i_1679_ < 0; i_1679_++) {
			int i_1680_
			    = ((i_1587_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1681_ = -i_1579_; i_1681_ < 0; i_1681_++) {
			    if (!bool_1576_ || f < fs[i_1594_]) {
				if (bool) {
				    int i_1682_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1586_ >> 16) + i_1680_]);
				    int i_1683_ = i_1682_ >>> 24;
				    int i_1684_ = 256 - i_1683_;
				    i_1676_ = ((i_1682_ & 0xff00ff) * i_1674_
					       & ~0xff00ff);
				    i_1677_ = ((i_1682_ & 0xff00) * i_1674_
					       & 0xff0000);
				    i_1682_ = (((i_1676_ | i_1677_) >>> 8)
					       + i_1582_);
				    int i_1685_ = is[i_1594_];
				    is[i_1594_]
					= ((((i_1682_ & 0xff00ff) * i_1683_
					     + (i_1685_ & 0xff00ff) * i_1684_)
					    & ~0xff00ff)
					   + (((i_1682_ & 0xff00) * i_1683_
					       + (i_1685_ & 0xff00) * i_1684_)
					      & 0xff0000)) >> 8;
				}
				if (bool_1576_ && bool_1585_)
				    fs[i_1594_] = f;
			    }
			    i_1586_ += i_1590_;
			    i_1594_++;
			}
			i_1587_ += i_1591_;
			i_1586_ = i_1678_;
			i_1594_ += i_1595_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1583_ == 2) {
		if (i_1581_ == 1) {
		    int i_1686_ = i_1586_;
		    for (int i_1687_ = -i_1580_; i_1687_ < 0; i_1687_++) {
			int i_1688_
			    = ((i_1587_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1689_ = -i_1579_; i_1689_ < 0; i_1689_++) {
			    if (!bool_1576_ || f < fs[i_1594_]) {
				int i_1690_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309
					       [(i_1586_ >> 16) + i_1688_]);
				if (i_1690_ != 0) {
				    if (bool) {
					int i_1691_ = is[i_1594_];
					int i_1692_ = i_1690_ + i_1691_;
					int i_1693_ = ((i_1690_ & 0xff00ff)
						       + (i_1691_ & 0xff00ff));
					i_1691_ = ((i_1693_ & 0x1000100)
						   + (i_1692_ - i_1693_
						      & 0x10000));
					is[i_1594_]
					    = (i_1692_ - i_1691_
					       | i_1691_ - (i_1691_ >>> 8));
				    }
				    if (bool_1576_ && bool_1585_)
					fs[i_1594_] = f;
				}
			    }
			    i_1586_ += i_1590_;
			    i_1594_++;
			}
			i_1587_ += i_1591_;
			i_1586_ = i_1686_;
			i_1594_ += i_1595_;
		    }
		} else if (i_1581_ == 0) {
		    int i_1694_ = i_1586_;
		    int i_1695_ = (i_1582_ & 0xff0000) >> 16;
		    int i_1696_ = (i_1582_ & 0xff00) >> 8;
		    int i_1697_ = i_1582_ & 0xff;
		    for (int i_1698_ = -i_1580_; i_1698_ < 0; i_1698_++) {
			int i_1699_
			    = ((i_1587_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1700_ = -i_1579_; i_1700_ < 0; i_1700_++) {
			    if (!bool_1576_ || f < fs[i_1594_]) {
				int i_1701_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309
					       [(i_1586_ >> 16) + i_1699_]);
				if (i_1701_ != 0) {
				    if (bool) {
					int i_1702_
					    = ((i_1701_ & 0xff0000) * i_1695_
					       & ~0xffffff);
					int i_1703_
					    = ((i_1701_ & 0xff00) * i_1696_
					       & 0xff0000);
					int i_1704_
					    = ((i_1701_ & 0xff) * i_1697_
					       & 0xff00);
					i_1701_ = (i_1702_ | i_1703_
						   | i_1704_) >>> 8;
					int i_1705_ = is[i_1594_];
					int i_1706_ = i_1701_ + i_1705_;
					int i_1707_ = ((i_1701_ & 0xff00ff)
						       + (i_1705_ & 0xff00ff));
					i_1705_ = ((i_1707_ & 0x1000100)
						   + (i_1706_ - i_1707_
						      & 0x10000));
					is[i_1594_]
					    = (i_1706_ - i_1705_
					       | i_1705_ - (i_1705_ >>> 8));
				    }
				    if (bool_1576_ && bool_1585_)
					fs[i_1594_] = f;
				}
			    }
			    i_1586_ += i_1590_;
			    i_1594_++;
			}
			i_1587_ += i_1591_;
			i_1586_ = i_1694_;
			i_1594_ += i_1595_;
		    }
		} else if (i_1581_ == 3) {
		    int i_1708_ = i_1586_;
		    for (int i_1709_ = -i_1580_; i_1709_ < 0; i_1709_++) {
			int i_1710_
			    = ((i_1587_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1711_ = -i_1579_; i_1711_ < 0; i_1711_++) {
			    if (!bool_1576_ || f < fs[i_1594_]) {
				if (bool) {
				    int i_1712_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1586_ >> 16) + i_1710_]);
				    int i_1713_ = i_1712_ + i_1582_;
				    int i_1714_ = ((i_1712_ & 0xff00ff)
						   + (i_1582_ & 0xff00ff));
				    int i_1715_
					= ((i_1714_ & 0x1000100)
					   + (i_1713_ - i_1714_ & 0x10000));
				    i_1712_ = (i_1713_ - i_1715_
					       | i_1715_ - (i_1715_ >>> 8));
				    i_1715_ = is[i_1594_];
				    i_1713_ = i_1712_ + i_1715_;
				    i_1714_
					= (i_1712_ & 0xff00ff) + (i_1715_
								  & 0xff00ff);
				    i_1715_
					= ((i_1714_ & 0x1000100)
					   + (i_1713_ - i_1714_ & 0x10000));
				    is[i_1594_]
					= (i_1713_ - i_1715_
					   | i_1715_ - (i_1715_ >>> 8));
				}
				if (bool_1576_ && bool_1585_)
				    fs[i_1594_] = f;
			    }
			    i_1586_ += i_1590_;
			    i_1594_++;
			}
			i_1587_ += i_1591_;
			i_1586_ = i_1708_;
			i_1594_ += i_1595_;
		    }
		} else if (i_1581_ == 2) {
		    int i_1716_ = i_1582_ >>> 24;
		    int i_1717_ = 256 - i_1716_;
		    int i_1718_ = (i_1582_ & 0xff00ff) * i_1717_ & ~0xff00ff;
		    int i_1719_ = (i_1582_ & 0xff00) * i_1717_ & 0xff0000;
		    i_1582_ = (i_1718_ | i_1719_) >>> 8;
		    int i_1720_ = i_1586_;
		    for (int i_1721_ = -i_1580_; i_1721_ < 0; i_1721_++) {
			int i_1722_
			    = ((i_1587_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1723_ = -i_1579_; i_1723_ < 0; i_1723_++) {
			    if (!bool_1576_ || f < fs[i_1594_]) {
				int i_1724_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309
					       [(i_1586_ >> 16) + i_1722_]);
				if (i_1724_ != 0) {
				    if (bool) {
					i_1718_
					    = ((i_1724_ & 0xff00ff) * i_1716_
					       & ~0xff00ff);
					i_1719_ = ((i_1724_ & 0xff00) * i_1716_
						   & 0xff0000);
					i_1724_ = (((i_1718_ | i_1719_) >>> 8)
						   + i_1582_);
					int i_1725_ = is[i_1594_];
					int i_1726_ = i_1724_ + i_1725_;
					int i_1727_ = ((i_1724_ & 0xff00ff)
						       + (i_1725_ & 0xff00ff));
					i_1725_ = ((i_1727_ & 0x1000100)
						   + (i_1726_ - i_1727_
						      & 0x10000));
					is[i_1594_]
					    = (i_1726_ - i_1725_
					       | i_1725_ - (i_1725_ >>> 8));
				    }
				    if (bool_1576_ && bool_1585_)
					fs[i_1594_] = f;
				}
			    }
			    i_1586_ += i_1590_;
			    i_1594_++;
			}
			i_1587_ += i_1591_;
			i_1586_ = i_1720_;
			i_1594_ += i_1595_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method8297(boolean bool, boolean bool_1728_, boolean bool_1729_,
		    int i, int i_1730_, float f, int i_1731_, int i_1732_,
		    int i_1733_, int i_1734_, int i_1735_, int i_1736_,
		    boolean bool_1737_) {
	if (i_1731_ > 0 && i_1732_ > 0 && (bool || bool_1728_)) {
	    int i_1738_ = 0;
	    int i_1739_ = 0;
	    int i_1740_ = (((Class151_Sub1_Sub3) this).anInt8806
			   + ((Class151_Sub1_Sub3) this).anInt8803
			   + ((Class151_Sub1_Sub3) this).anInt8832);
	    int i_1741_ = (((Class151_Sub1_Sub3) this).anInt8819
			   + ((Class151_Sub1_Sub3) this).anInt8804
			   + ((Class151_Sub1_Sub3) this).anInt8808);
	    int i_1742_ = (i_1740_ << 16) / i_1731_;
	    int i_1743_ = (i_1741_ << 16) / i_1732_;
	    if (((Class151_Sub1_Sub3) this).anInt8806 > 0) {
		int i_1744_ = (((((Class151_Sub1_Sub3) this).anInt8806 << 16)
				+ i_1742_ - 1)
			       / i_1742_);
		i += i_1744_;
		i_1738_ += (i_1744_ * i_1742_
			    - (((Class151_Sub1_Sub3) this).anInt8806 << 16));
	    }
	    if (((Class151_Sub1_Sub3) this).anInt8819 > 0) {
		int i_1745_ = (((((Class151_Sub1_Sub3) this).anInt8819 << 16)
				+ i_1743_ - 1)
			       / i_1743_);
		i_1730_ += i_1745_;
		i_1739_ += (i_1745_ * i_1743_
			    - (((Class151_Sub1_Sub3) this).anInt8819 << 16));
	    }
	    if (((Class151_Sub1_Sub3) this).anInt8803 < i_1740_)
		i_1731_ = ((((Class151_Sub1_Sub3) this).anInt8803 << 16)
			   - i_1738_ + i_1742_ - 1) / i_1742_;
	    if (((Class151_Sub1_Sub3) this).anInt8804 < i_1741_)
		i_1732_ = ((((Class151_Sub1_Sub3) this).anInt8804 << 16)
			   - i_1739_ + i_1743_ - 1) / i_1743_;
	    int i_1746_
		= i + i_1730_ * ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						    .aClass173_Sub3_8814))
				  .anInt9735)
				 * 111437289);
	    int i_1747_ = ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					      .aClass173_Sub3_8814)).anInt9735
			    * 111437289)
			   - i_1731_);
	    if (i_1730_ + i_1732_
		> ((Class173_Sub3) (((Class151_Sub1_Sub3) this)
				    .aClass173_Sub3_8814)).anInt9726 * 6965409)
		i_1732_ -= (i_1730_ + i_1732_
			    - (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						 .aClass173_Sub3_8814))
			       .anInt9726) * 6965409);
	    if (i_1730_ < (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
					     .aClass173_Sub3_8814)).anInt9725
			   * 592117349)) {
		int i_1748_ = ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						  .aClass173_Sub3_8814))
				.anInt9725) * 592117349
			       - i_1730_);
		i_1732_ -= i_1748_;
		i_1746_ += i_1748_ * (((Class173_Sub3)
				       (((Class151_Sub1_Sub3) this)
					.aClass173_Sub3_8814)).anInt9735
				      * 111437289);
		i_1739_ += i_1743_ * i_1748_;
	    }
	    if (i + i_1731_ > (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						 .aClass173_Sub3_8814))
			       .anInt9724) * 630968029) {
		int i_1749_ = (i + i_1731_
			       - (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						    .aClass173_Sub3_8814))
				  .anInt9724) * 630968029);
		i_1731_ -= i_1749_;
		i_1747_ += i_1749_;
	    }
	    if (i < (((Class173_Sub3) (((Class151_Sub1_Sub3) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119)) {
		int i_1750_ = ((((Class173_Sub3) (((Class151_Sub1_Sub3) this)
						  .aClass173_Sub3_8814))
				.anInt9723) * -993497119
			       - i);
		i_1731_ -= i_1750_;
		i_1746_ += i_1750_;
		i_1738_ += i_1742_ * i_1750_;
		i_1747_ += i_1750_;
	    }
	    float[] fs = (((Class173_Sub3)
			   ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
			  .aFloatArray9716);
	    int[] is = (((Class173_Sub3)
			 ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
			.anIntArray9719);
	    if (i_1735_ == 0) {
		if (i_1733_ == 1) {
		    int i_1751_ = i_1738_;
		    for (int i_1752_ = -i_1732_; i_1752_ < 0; i_1752_++) {
			int i_1753_
			    = ((i_1739_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1754_ = -i_1731_; i_1754_ < 0; i_1754_++) {
			    if (!bool_1728_ || f < fs[i_1746_]) {
				if (bool)
				    is[i_1746_]
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1738_ >> 16) + i_1753_]);
				if (bool_1728_ && bool_1737_)
				    fs[i_1746_] = f;
			    }
			    i_1738_ += i_1742_;
			    i_1746_++;
			}
			i_1739_ += i_1743_;
			i_1738_ = i_1751_;
			i_1746_ += i_1747_;
		    }
		} else if (i_1733_ == 0) {
		    int i_1755_ = (i_1734_ & 0xff0000) >> 16;
		    int i_1756_ = (i_1734_ & 0xff00) >> 8;
		    int i_1757_ = i_1734_ & 0xff;
		    int i_1758_ = i_1738_;
		    for (int i_1759_ = -i_1732_; i_1759_ < 0; i_1759_++) {
			int i_1760_
			    = ((i_1739_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1761_ = -i_1731_; i_1761_ < 0; i_1761_++) {
			    if (!bool_1728_ || f < fs[i_1746_]) {
				if (bool) {
				    int i_1762_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1738_ >> 16) + i_1760_]);
				    int i_1763_
					= ((i_1762_ & 0xff0000) * i_1755_
					   & ~0xffffff);
				    int i_1764_ = ((i_1762_ & 0xff00) * i_1756_
						   & 0xff0000);
				    int i_1765_
					= (i_1762_ & 0xff) * i_1757_ & 0xff00;
				    is[i_1746_]
					= (i_1763_ | i_1764_ | i_1765_) >>> 8;
				}
				if (bool_1728_ && bool_1737_)
				    fs[i_1746_] = f;
			    }
			    i_1738_ += i_1742_;
			    i_1746_++;
			}
			i_1739_ += i_1743_;
			i_1738_ = i_1758_;
			i_1746_ += i_1747_;
		    }
		} else if (i_1733_ == 3) {
		    int i_1766_ = i_1738_;
		    for (int i_1767_ = -i_1732_; i_1767_ < 0; i_1767_++) {
			int i_1768_
			    = ((i_1739_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1769_ = -i_1731_; i_1769_ < 0; i_1769_++) {
			    if (!bool_1728_ || f < fs[i_1746_]) {
				if (bool) {
				    int i_1770_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1738_ >> 16) + i_1768_]);
				    int i_1771_ = i_1770_ + i_1734_;
				    int i_1772_ = ((i_1770_ & 0xff00ff)
						   + (i_1734_ & 0xff00ff));
				    int i_1773_
					= ((i_1772_ & 0x1000100)
					   + (i_1771_ - i_1772_ & 0x10000));
				    is[i_1746_]
					= (i_1771_ - i_1773_
					   | i_1773_ - (i_1773_ >>> 8));
				}
				if (bool_1728_ && bool_1737_)
				    fs[i_1746_] = f;
			    }
			    i_1738_ += i_1742_;
			    i_1746_++;
			}
			i_1739_ += i_1743_;
			i_1738_ = i_1766_;
			i_1746_ += i_1747_;
		    }
		} else if (i_1733_ == 2) {
		    int i_1774_ = i_1734_ >>> 24;
		    int i_1775_ = 256 - i_1774_;
		    int i_1776_ = (i_1734_ & 0xff00ff) * i_1775_ & ~0xff00ff;
		    int i_1777_ = (i_1734_ & 0xff00) * i_1775_ & 0xff0000;
		    i_1734_ = (i_1776_ | i_1777_) >>> 8;
		    int i_1778_ = i_1738_;
		    for (int i_1779_ = -i_1732_; i_1779_ < 0; i_1779_++) {
			int i_1780_
			    = ((i_1739_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1781_ = -i_1731_; i_1781_ < 0; i_1781_++) {
			    if (!bool_1728_ || f < fs[i_1746_]) {
				if (bool) {
				    int i_1782_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1738_ >> 16) + i_1780_]);
				    i_1776_ = ((i_1782_ & 0xff00ff) * i_1774_
					       & ~0xff00ff);
				    i_1777_ = ((i_1782_ & 0xff00) * i_1774_
					       & 0xff0000);
				    is[i_1746_] = (((i_1776_ | i_1777_) >>> 8)
						   + i_1734_);
				}
				if (bool_1728_ && bool_1737_)
				    fs[i_1746_] = f;
			    }
			    i_1738_ += i_1742_;
			    i_1746_++;
			}
			i_1739_ += i_1743_;
			i_1738_ = i_1778_;
			i_1746_ += i_1747_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1735_ == 1) {
		if (i_1733_ == 1) {
		    int i_1783_ = i_1738_;
		    for (int i_1784_ = -i_1732_; i_1784_ < 0; i_1784_++) {
			int i_1785_
			    = ((i_1739_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1786_ = -i_1731_; i_1786_ < 0; i_1786_++) {
			    if (!bool_1728_ || f < fs[i_1746_]) {
				if (bool) {
				    int i_1787_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1738_ >> 16) + i_1785_]);
				    int i_1788_ = i_1787_ >>> 24;
				    int i_1789_ = 256 - i_1788_;
				    int i_1790_ = is[i_1746_];
				    is[i_1746_]
					= (((((i_1787_ & 0xff00ff) * i_1788_
					      + (i_1790_ & 0xff00ff) * i_1789_)
					     & ~0xff00ff)
					    >> 8)
					   + (((((i_1787_ & ~0xff00ff) >>> 8)
						* i_1788_)
					       + (((i_1790_ & ~0xff00ff) >>> 8)
						  * i_1789_))
					      & ~0xff00ff));
				}
				if (bool_1728_ && bool_1737_)
				    fs[i_1746_] = f;
			    }
			    i_1738_ += i_1742_;
			    i_1746_++;
			}
			i_1739_ += i_1743_;
			i_1738_ = i_1783_;
			i_1746_ += i_1747_;
		    }
		} else if (i_1733_ == 0) {
		    int i_1791_ = i_1738_;
		    if ((i_1734_ & 0xffffff) == 16777215) {
			for (int i_1792_ = -i_1732_; i_1792_ < 0; i_1792_++) {
			    int i_1793_
				= ((i_1739_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_1794_ = -i_1731_; i_1794_ < 0;
				 i_1794_++) {
				if (!bool_1728_ || f < fs[i_1746_]) {
				    if (bool) {
					int i_1795_
					    = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309
					       [(i_1738_ >> 16) + i_1793_]);
					int i_1796_
					    = ((i_1795_ >>> 24) * (i_1734_
								   >>> 24)
					       >> 8);
					int i_1797_ = 256 - i_1796_;
					int i_1798_ = is[i_1746_];
					is[i_1746_]
					    = ((((i_1795_ & 0xff00ff) * i_1796_
						 + ((i_1798_ & 0xff00ff)
						    * i_1797_))
						& ~0xff00ff)
					       + (((i_1795_ & 0xff00) * i_1796_
						   + ((i_1798_ & 0xff00)
						      * i_1797_))
						  & 0xff0000)) >> 8;
				    }
				    if (bool_1728_ && bool_1737_)
					fs[i_1746_] = f;
				}
				i_1738_ += i_1742_;
				i_1746_++;
			    }
			    i_1739_ += i_1743_;
			    i_1738_ = i_1791_;
			    i_1746_ += i_1747_;
			}
		    } else {
			int i_1799_ = (i_1734_ & 0xff0000) >> 16;
			int i_1800_ = (i_1734_ & 0xff00) >> 8;
			int i_1801_ = i_1734_ & 0xff;
			for (int i_1802_ = -i_1732_; i_1802_ < 0; i_1802_++) {
			    int i_1803_
				= ((i_1739_ >> 16)
				   * ((Class151_Sub1_Sub3) this).anInt8803);
			    for (int i_1804_ = -i_1731_; i_1804_ < 0;
				 i_1804_++) {
				if (!bool_1728_ || f < fs[i_1746_]) {
				    int i_1805_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1738_ >> 16) + i_1803_]);
				    int i_1806_
					= ((i_1805_ >>> 24) * (i_1734_ >>> 24)
					   >> 8);
				    int i_1807_ = 256 - i_1806_;
				    if (i_1806_ != 255) {
					if (bool) {
					    int i_1808_
						= (((i_1805_ & 0xff0000)
						    * i_1799_)
						   & ~0xffffff);
					    int i_1809_
						= ((i_1805_ & 0xff00) * i_1800_
						   & 0xff0000);
					    int i_1810_
						= ((i_1805_ & 0xff) * i_1801_
						   & 0xff00);
					    i_1805_ = (i_1808_ | i_1809_
						       | i_1810_) >>> 8;
					    int i_1811_ = is[i_1746_];
					    is[i_1746_]
						= (((((i_1805_ & 0xff00ff)
						      * i_1806_)
						     + ((i_1811_ & 0xff00ff)
							* i_1807_))
						    & ~0xff00ff)
						   + ((((i_1805_ & 0xff00)
							* i_1806_)
						       + ((i_1811_ & 0xff00)
							  * i_1807_))
						      & 0xff0000)) >> 8;
					    if (bool_1729_) {
						int i_1812_ = ((i_1811_ >>> 24)
							       + i_1806_);
						if (i_1812_ > 255)
						    i_1812_ = 255;
						is[i_1746_] |= i_1812_ << 24;
					    }
					}
					if (bool_1728_ && bool_1737_)
					    fs[i_1746_] = f;
				    } else {
					if (bool) {
					    int i_1813_
						= (((i_1805_ & 0xff0000)
						    * i_1799_)
						   & ~0xffffff);
					    int i_1814_
						= ((i_1805_ & 0xff00) * i_1800_
						   & 0xff0000);
					    int i_1815_
						= ((i_1805_ & 0xff) * i_1801_
						   & 0xff00);
					    is[i_1746_] = (i_1813_ | i_1814_
							   | i_1815_) >>> 8;
					}
					if (bool_1728_ && bool_1737_)
					    fs[i_1746_] = f;
				    }
				}
				i_1738_ += i_1742_;
				i_1746_++;
			    }
			    i_1739_ += i_1743_;
			    i_1738_ = i_1791_;
			    i_1746_ += i_1747_;
			}
		    }
		} else if (i_1733_ == 3) {
		    int i_1816_ = i_1738_;
		    for (int i_1817_ = -i_1732_; i_1817_ < 0; i_1817_++) {
			int i_1818_
			    = ((i_1739_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1819_ = -i_1731_; i_1819_ < 0; i_1819_++) {
			    if (!bool_1728_ || f < fs[i_1746_]) {
				if (bool) {
				    int i_1820_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1738_ >> 16) + i_1818_]);
				    int i_1821_ = i_1820_ + i_1734_;
				    int i_1822_ = ((i_1820_ & 0xff00ff)
						   + (i_1734_ & 0xff00ff));
				    int i_1823_
					= ((i_1822_ & 0x1000100)
					   + (i_1821_ - i_1822_ & 0x10000));
				    i_1823_ = (i_1821_ - i_1823_
					       | i_1823_ - (i_1823_ >>> 8));
				    int i_1824_
					= ((i_1823_ >>> 24) * (i_1734_ >>> 24)
					   >> 8);
				    int i_1825_ = 256 - i_1824_;
				    if (i_1824_ != 255) {
					i_1820_ = i_1823_;
					i_1823_ = is[i_1746_];
					i_1823_
					    = ((((i_1820_ & 0xff00ff) * i_1824_
						 + ((i_1823_ & 0xff00ff)
						    * i_1825_))
						& ~0xff00ff)
					       + (((i_1820_ & 0xff00) * i_1824_
						   + ((i_1823_ & 0xff00)
						      * i_1825_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_1746_] = i_1823_;
				}
				if (bool_1728_ && bool_1737_)
				    fs[i_1746_] = f;
			    }
			    i_1738_ += i_1742_;
			    i_1746_++;
			}
			i_1739_ += i_1743_;
			i_1738_ = i_1816_;
			i_1746_ += i_1747_;
		    }
		} else if (i_1733_ == 2) {
		    int i_1826_ = i_1734_ >>> 24;
		    int i_1827_ = 256 - i_1826_;
		    int i_1828_ = (i_1734_ & 0xff00ff) * i_1827_ & ~0xff00ff;
		    int i_1829_ = (i_1734_ & 0xff00) * i_1827_ & 0xff0000;
		    i_1734_ = (i_1828_ | i_1829_) >>> 8;
		    int i_1830_ = i_1738_;
		    for (int i_1831_ = -i_1732_; i_1831_ < 0; i_1831_++) {
			int i_1832_
			    = ((i_1739_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1833_ = -i_1731_; i_1833_ < 0; i_1833_++) {
			    if (!bool_1728_ || f < fs[i_1746_]) {
				if (bool) {
				    int i_1834_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1738_ >> 16) + i_1832_]);
				    int i_1835_ = i_1834_ >>> 24;
				    int i_1836_ = 256 - i_1835_;
				    i_1828_ = ((i_1834_ & 0xff00ff) * i_1826_
					       & ~0xff00ff);
				    i_1829_ = ((i_1834_ & 0xff00) * i_1826_
					       & 0xff0000);
				    i_1834_ = (((i_1828_ | i_1829_) >>> 8)
					       + i_1734_);
				    int i_1837_ = is[i_1746_];
				    is[i_1746_]
					= ((((i_1834_ & 0xff00ff) * i_1835_
					     + (i_1837_ & 0xff00ff) * i_1836_)
					    & ~0xff00ff)
					   + (((i_1834_ & 0xff00) * i_1835_
					       + (i_1837_ & 0xff00) * i_1836_)
					      & 0xff0000)) >> 8;
				}
				if (bool_1728_ && bool_1737_)
				    fs[i_1746_] = f;
			    }
			    i_1738_ += i_1742_;
			    i_1746_++;
			}
			i_1739_ += i_1743_;
			i_1738_ = i_1830_;
			i_1746_ += i_1747_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1735_ == 2) {
		if (i_1733_ == 1) {
		    int i_1838_ = i_1738_;
		    for (int i_1839_ = -i_1732_; i_1839_ < 0; i_1839_++) {
			int i_1840_
			    = ((i_1739_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1841_ = -i_1731_; i_1841_ < 0; i_1841_++) {
			    if (!bool_1728_ || f < fs[i_1746_]) {
				int i_1842_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309
					       [(i_1738_ >> 16) + i_1840_]);
				if (i_1842_ != 0) {
				    if (bool) {
					int i_1843_ = is[i_1746_];
					int i_1844_ = i_1842_ + i_1843_;
					int i_1845_ = ((i_1842_ & 0xff00ff)
						       + (i_1843_ & 0xff00ff));
					i_1843_ = ((i_1845_ & 0x1000100)
						   + (i_1844_ - i_1845_
						      & 0x10000));
					is[i_1746_]
					    = (i_1844_ - i_1843_
					       | i_1843_ - (i_1843_ >>> 8));
				    }
				    if (bool_1728_ && bool_1737_)
					fs[i_1746_] = f;
				}
			    }
			    i_1738_ += i_1742_;
			    i_1746_++;
			}
			i_1739_ += i_1743_;
			i_1738_ = i_1838_;
			i_1746_ += i_1747_;
		    }
		} else if (i_1733_ == 0) {
		    int i_1846_ = i_1738_;
		    int i_1847_ = (i_1734_ & 0xff0000) >> 16;
		    int i_1848_ = (i_1734_ & 0xff00) >> 8;
		    int i_1849_ = i_1734_ & 0xff;
		    for (int i_1850_ = -i_1732_; i_1850_ < 0; i_1850_++) {
			int i_1851_
			    = ((i_1739_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1852_ = -i_1731_; i_1852_ < 0; i_1852_++) {
			    if (!bool_1728_ || f < fs[i_1746_]) {
				int i_1853_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309
					       [(i_1738_ >> 16) + i_1851_]);
				if (i_1853_ != 0) {
				    if (bool) {
					int i_1854_
					    = ((i_1853_ & 0xff0000) * i_1847_
					       & ~0xffffff);
					int i_1855_
					    = ((i_1853_ & 0xff00) * i_1848_
					       & 0xff0000);
					int i_1856_
					    = ((i_1853_ & 0xff) * i_1849_
					       & 0xff00);
					i_1853_ = (i_1854_ | i_1855_
						   | i_1856_) >>> 8;
					int i_1857_ = is[i_1746_];
					int i_1858_ = i_1853_ + i_1857_;
					int i_1859_ = ((i_1853_ & 0xff00ff)
						       + (i_1857_ & 0xff00ff));
					i_1857_ = ((i_1859_ & 0x1000100)
						   + (i_1858_ - i_1859_
						      & 0x10000));
					is[i_1746_]
					    = (i_1858_ - i_1857_
					       | i_1857_ - (i_1857_ >>> 8));
				    }
				    if (bool_1728_ && bool_1737_)
					fs[i_1746_] = f;
				}
			    }
			    i_1738_ += i_1742_;
			    i_1746_++;
			}
			i_1739_ += i_1743_;
			i_1738_ = i_1846_;
			i_1746_ += i_1747_;
		    }
		} else if (i_1733_ == 3) {
		    int i_1860_ = i_1738_;
		    for (int i_1861_ = -i_1732_; i_1861_ < 0; i_1861_++) {
			int i_1862_
			    = ((i_1739_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1863_ = -i_1731_; i_1863_ < 0; i_1863_++) {
			    if (!bool_1728_ || f < fs[i_1746_]) {
				if (bool) {
				    int i_1864_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(i_1738_ >> 16) + i_1862_]);
				    int i_1865_ = i_1864_ + i_1734_;
				    int i_1866_ = ((i_1864_ & 0xff00ff)
						   + (i_1734_ & 0xff00ff));
				    int i_1867_
					= ((i_1866_ & 0x1000100)
					   + (i_1865_ - i_1866_ & 0x10000));
				    i_1864_ = (i_1865_ - i_1867_
					       | i_1867_ - (i_1867_ >>> 8));
				    i_1867_ = is[i_1746_];
				    i_1865_ = i_1864_ + i_1867_;
				    i_1866_
					= (i_1864_ & 0xff00ff) + (i_1867_
								  & 0xff00ff);
				    i_1867_
					= ((i_1866_ & 0x1000100)
					   + (i_1865_ - i_1866_ & 0x10000));
				    is[i_1746_]
					= (i_1865_ - i_1867_
					   | i_1867_ - (i_1867_ >>> 8));
				}
				if (bool_1728_ && bool_1737_)
				    fs[i_1746_] = f;
			    }
			    i_1738_ += i_1742_;
			    i_1746_++;
			}
			i_1739_ += i_1743_;
			i_1738_ = i_1860_;
			i_1746_ += i_1747_;
		    }
		} else if (i_1733_ == 2) {
		    int i_1868_ = i_1734_ >>> 24;
		    int i_1869_ = 256 - i_1868_;
		    int i_1870_ = (i_1734_ & 0xff00ff) * i_1869_ & ~0xff00ff;
		    int i_1871_ = (i_1734_ & 0xff00) * i_1869_ & 0xff0000;
		    i_1734_ = (i_1870_ | i_1871_) >>> 8;
		    int i_1872_ = i_1738_;
		    for (int i_1873_ = -i_1732_; i_1873_ < 0; i_1873_++) {
			int i_1874_
			    = ((i_1739_ >> 16)
			       * ((Class151_Sub1_Sub3) this).anInt8803);
			for (int i_1875_ = -i_1731_; i_1875_ < 0; i_1875_++) {
			    if (!bool_1728_ || f < fs[i_1746_]) {
				int i_1876_ = (((Class151_Sub1_Sub3) this)
					       .anIntArray11309
					       [(i_1738_ >> 16) + i_1874_]);
				if (i_1876_ != 0) {
				    if (bool) {
					i_1870_
					    = ((i_1876_ & 0xff00ff) * i_1868_
					       & ~0xff00ff);
					i_1871_ = ((i_1876_ & 0xff00) * i_1868_
						   & 0xff0000);
					i_1876_ = (((i_1870_ | i_1871_) >>> 8)
						   + i_1734_);
					int i_1877_ = is[i_1746_];
					int i_1878_ = i_1876_ + i_1877_;
					int i_1879_ = ((i_1876_ & 0xff00ff)
						       + (i_1877_ & 0xff00ff));
					i_1877_ = ((i_1879_ & 0x1000100)
						   + (i_1878_ - i_1879_
						      & 0x10000));
					is[i_1746_]
					    = (i_1878_ - i_1877_
					       | i_1877_ - (i_1877_ >>> 8));
				    }
				    if (bool_1728_ && bool_1737_)
					fs[i_1746_] = f;
				}
			    }
			    i_1738_ += i_1742_;
			    i_1746_++;
			}
			i_1739_ += i_1743_;
			i_1738_ = i_1872_;
			i_1746_ += i_1747_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method8298(int[] is, int[] is_1880_, int i, int i_1881_) {
	int[] is_1882_ = (((Class173_Sub3)
			   ((Class151_Sub1_Sub3) this).aClass173_Sub3_8814)
			  .anIntArray9719);
	if (is_1882_ != null) {
	    if (anInt8822 == 0) {
		if (anInt8825 == 0) {
		    int i_1883_ = anInt8816;
		    while (i_1883_ < 0) {
			int i_1884_ = i_1883_ + i_1881_;
			if (i_1884_ >= 0) {
			    if (i_1884_ >= is.length)
				break;
			    int i_1885_ = anInt8818;
			    int i_1886_ = anInt8807;
			    int i_1887_ = anInt8826;
			    int i_1888_ = anInt8809;
			    if (i_1886_ >= 0 && i_1887_ >= 0
				&& (i_1886_
				    - (((Class151_Sub1_Sub3) this).anInt8803
				       << 12)) < 0
				&& (i_1887_
				    - (((Class151_Sub1_Sub3) this).anInt8804
				       << 12)) < 0) {
				int i_1889_ = is[i_1884_] - i;
				int i_1890_ = -is_1880_[i_1884_];
				int i_1891_ = i_1889_ - (i_1885_ - anInt8818);
				if (i_1891_ > 0) {
				    i_1885_ += i_1891_;
				    i_1888_ += i_1891_;
				    i_1886_ += anInt8822 * i_1891_;
				    i_1887_ += anInt8825 * i_1891_;
				} else
				    i_1890_ -= i_1891_;
				if (i_1888_ < i_1890_)
				    i_1888_ = i_1890_;
				for (/**/; i_1888_ < 0; i_1888_++) {
				    int i_1892_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(((i_1887_ >> 12)
					      * (((Class151_Sub1_Sub3) this)
						 .anInt8803))
					     + (i_1886_ >> 12))]);
				    int i_1893_ = i_1892_ >>> 24;
				    int i_1894_ = 256 - i_1893_;
				    int i_1895_ = is_1882_[i_1885_];
				    is_1882_[i_1885_++]
					= ((((i_1892_ & 0xff00ff) * i_1893_
					     + (i_1895_ & 0xff00ff) * i_1894_)
					    & ~0xff00ff)
					   + (((i_1892_ & 0xff00) * i_1893_
					       + (i_1895_ & 0xff00) * i_1894_)
					      & 0xff0000)) >> 8;
				}
			    }
			}
			i_1883_++;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_1896_ = anInt8816;
		    while (i_1896_ < 0) {
			int i_1897_ = i_1896_ + i_1881_;
			if (i_1897_ >= 0) {
			    if (i_1897_ >= is.length)
				break;
			    int i_1898_ = anInt8818;
			    int i_1899_ = anInt8807;
			    int i_1900_ = anInt8826 + anInt8828;
			    int i_1901_ = anInt8809;
			    if (i_1899_ >= 0
				&& (i_1899_
				    - (((Class151_Sub1_Sub3) this).anInt8803
				       << 12)) < 0) {
				int i_1902_;
				if ((i_1902_
				     = i_1900_ - ((((Class151_Sub1_Sub3) this)
						   .anInt8804)
						  << 12))
				    >= 0) {
				    i_1902_
					= (anInt8825 - i_1902_) / anInt8825;
				    i_1901_ += i_1902_;
				    i_1900_ += anInt8825 * i_1902_;
				    i_1898_ += i_1902_;
				}
				if ((i_1902_
				     = (i_1900_ - anInt8825) / anInt8825)
				    > i_1901_)
				    i_1901_ = i_1902_;
				int i_1903_ = is[i_1897_] - i;
				int i_1904_ = -is_1880_[i_1897_];
				int i_1905_ = i_1903_ - (i_1898_ - anInt8818);
				if (i_1905_ > 0) {
				    i_1898_ += i_1905_;
				    i_1901_ += i_1905_;
				    i_1899_ += anInt8822 * i_1905_;
				    i_1900_ += anInt8825 * i_1905_;
				} else
				    i_1904_ -= i_1905_;
				if (i_1901_ < i_1904_)
				    i_1901_ = i_1904_;
				for (/**/; i_1901_ < 0; i_1901_++) {
				    int i_1906_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(((i_1900_ >> 12)
					      * (((Class151_Sub1_Sub3) this)
						 .anInt8803))
					     + (i_1899_ >> 12))]);
				    int i_1907_ = i_1906_ >>> 24;
				    int i_1908_ = 256 - i_1907_;
				    int i_1909_ = is_1882_[i_1898_];
				    is_1882_[i_1898_++]
					= ((((i_1906_ & 0xff00ff) * i_1907_
					     + (i_1909_ & 0xff00ff) * i_1908_)
					    & ~0xff00ff)
					   + (((i_1906_ & 0xff00) * i_1907_
					       + (i_1909_ & 0xff00) * i_1908_)
					      & 0xff0000)) >> 8;
				    i_1900_ += anInt8825;
				}
			    }
			}
			i_1896_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_1910_ = anInt8816;
		    while (i_1910_ < 0) {
			int i_1911_ = i_1910_ + i_1881_;
			if (i_1911_ >= 0) {
			    if (i_1911_ >= is.length)
				break;
			    int i_1912_ = anInt8818;
			    int i_1913_ = anInt8807;
			    int i_1914_ = anInt8826 + anInt8828;
			    int i_1915_ = anInt8809;
			    if (i_1913_ >= 0
				&& (i_1913_
				    - (((Class151_Sub1_Sub3) this).anInt8803
				       << 12)) < 0) {
				if (i_1914_ < 0) {
				    int i_1916_ = ((anInt8825 - 1 - i_1914_)
						   / anInt8825);
				    i_1915_ += i_1916_;
				    i_1914_ += anInt8825 * i_1916_;
				    i_1912_ += i_1916_;
				}
				int i_1917_;
				if ((i_1917_ = (1 + i_1914_
						- ((((Class151_Sub1_Sub3) this)
						    .anInt8804)
						   << 12)
						- anInt8825) / anInt8825)
				    > i_1915_)
				    i_1915_ = i_1917_;
				int i_1918_ = is[i_1911_] - i;
				int i_1919_ = -is_1880_[i_1911_];
				int i_1920_ = i_1918_ - (i_1912_ - anInt8818);
				if (i_1920_ > 0) {
				    i_1912_ += i_1920_;
				    i_1915_ += i_1920_;
				    i_1913_ += anInt8822 * i_1920_;
				    i_1914_ += anInt8825 * i_1920_;
				} else
				    i_1919_ -= i_1920_;
				if (i_1915_ < i_1919_)
				    i_1915_ = i_1919_;
				for (/**/; i_1915_ < 0; i_1915_++) {
				    int i_1921_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(((i_1914_ >> 12)
					      * (((Class151_Sub1_Sub3) this)
						 .anInt8803))
					     + (i_1913_ >> 12))]);
				    int i_1922_ = i_1921_ >>> 24;
				    int i_1923_ = 256 - i_1922_;
				    int i_1924_ = is_1882_[i_1912_];
				    is_1882_[i_1912_++]
					= ((((i_1921_ & 0xff00ff) * i_1922_
					     + (i_1924_ & 0xff00ff) * i_1923_)
					    & ~0xff00ff)
					   + (((i_1921_ & 0xff00) * i_1922_
					       + (i_1924_ & 0xff00) * i_1923_)
					      & 0xff0000)) >> 8;
				    i_1914_ += anInt8825;
				}
			    }
			}
			i_1910_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8822 < 0) {
		if (anInt8825 == 0) {
		    int i_1925_ = anInt8816;
		    while (i_1925_ < 0) {
			int i_1926_ = i_1925_ + i_1881_;
			if (i_1926_ >= 0) {
			    if (i_1926_ >= is.length)
				break;
			    int i_1927_ = anInt8818;
			    int i_1928_ = anInt8807 + anInt8805;
			    int i_1929_ = anInt8826;
			    int i_1930_ = anInt8809;
			    if (i_1929_ >= 0
				&& (i_1929_
				    - (((Class151_Sub1_Sub3) this).anInt8804
				       << 12)) < 0) {
				int i_1931_;
				if ((i_1931_
				     = i_1928_ - ((((Class151_Sub1_Sub3) this)
						   .anInt8803)
						  << 12))
				    >= 0) {
				    i_1931_
					= (anInt8822 - i_1931_) / anInt8822;
				    i_1930_ += i_1931_;
				    i_1928_ += anInt8822 * i_1931_;
				    i_1927_ += i_1931_;
				}
				if ((i_1931_
				     = (i_1928_ - anInt8822) / anInt8822)
				    > i_1930_)
				    i_1930_ = i_1931_;
				int i_1932_ = is[i_1926_] - i;
				int i_1933_ = -is_1880_[i_1926_];
				int i_1934_ = i_1932_ - (i_1927_ - anInt8818);
				if (i_1934_ > 0) {
				    i_1927_ += i_1934_;
				    i_1930_ += i_1934_;
				    i_1928_ += anInt8822 * i_1934_;
				    i_1929_ += anInt8825 * i_1934_;
				} else
				    i_1933_ -= i_1934_;
				if (i_1930_ < i_1933_)
				    i_1930_ = i_1933_;
				for (/**/; i_1930_ < 0; i_1930_++) {
				    int i_1935_
					= (((Class151_Sub1_Sub3) this)
					   .anIntArray11309
					   [(((i_1929_ >> 12)
					      * (((Class151_Sub1_Sub3) this)
						 .anInt8803))
					     + (i_1928_ >> 12))]);
				    int i_1936_ = i_1935_ >>> 24;
				    int i_1937_ = 256 - i_1936_;
				    int i_1938_ = is_1882_[i_1927_];
				    is_1882_[i_1927_++]
					= ((((i_1935_ & 0xff00ff) * i_1936_
					     + (i_1938_ & 0xff00ff) * i_1937_)
					    & ~0xff00ff)
					   + (((i_1935_ & 0xff00) * i_1936_
					       + (i_1938_ & 0xff00) * i_1937_)
					      & 0xff0000)) >> 8;
				    i_1928_ += anInt8822;
				}
			    }
			}
			i_1925_++;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_1939_ = anInt8816;
		    while (i_1939_ < 0) {
			int i_1940_ = i_1939_ + i_1881_;
			if (i_1940_ >= 0) {
			    if (i_1940_ >= is.length)
				break;
			    int i_1941_ = anInt8818;
			    int i_1942_ = anInt8807 + anInt8805;
			    int i_1943_ = anInt8826 + anInt8828;
			    int i_1944_ = anInt8809;
			    int i_1945_;
			    if ((i_1945_
				 = (i_1942_
				    - (((Class151_Sub1_Sub3) this).anInt8803
				       << 12)))
				>= 0) {
				i_1945_ = (anInt8822 - i_1945_) / anInt8822;
				i_1944_ += i_1945_;
				i_1942_ += anInt8822 * i_1945_;
				i_1943_ += anInt8825 * i_1945_;
				i_1941_ += i_1945_;
			    }
			    if ((i_1945_ = (i_1942_ - anInt8822) / anInt8822)
				> i_1944_)
				i_1944_ = i_1945_;
			    if ((i_1945_
				 = (i_1943_
				    - (((Class151_Sub1_Sub3) this).anInt8804
				       << 12)))
				>= 0) {
				i_1945_ = (anInt8825 - i_1945_) / anInt8825;
				i_1944_ += i_1945_;
				i_1942_ += anInt8822 * i_1945_;
				i_1943_ += anInt8825 * i_1945_;
				i_1941_ += i_1945_;
			    }
			    if ((i_1945_ = (i_1943_ - anInt8825) / anInt8825)
				> i_1944_)
				i_1944_ = i_1945_;
			    int i_1946_ = is[i_1940_] - i;
			    int i_1947_ = -is_1880_[i_1940_];
			    int i_1948_ = i_1946_ - (i_1941_ - anInt8818);
			    if (i_1948_ > 0) {
				i_1941_ += i_1948_;
				i_1944_ += i_1948_;
				i_1942_ += anInt8822 * i_1948_;
				i_1943_ += anInt8825 * i_1948_;
			    } else
				i_1947_ -= i_1948_;
			    if (i_1944_ < i_1947_)
				i_1944_ = i_1947_;
			    for (/**/; i_1944_ < 0; i_1944_++) {
				int i_1949_
				    = (((Class151_Sub1_Sub3) this)
				       .anIntArray11309
				       [((i_1943_ >> 12)
					 * (((Class151_Sub1_Sub3) this)
					    .anInt8803)) + (i_1942_ >> 12)]);
				int i_1950_ = i_1949_ >>> 24;
				int i_1951_ = 256 - i_1950_;
				int i_1952_ = is_1882_[i_1941_];
				is_1882_[i_1941_++]
				    = ((((i_1949_ & 0xff00ff) * i_1950_
					 + (i_1952_ & 0xff00ff) * i_1951_)
					& ~0xff00ff)
				       + (((i_1949_ & 0xff00) * i_1950_
					   + (i_1952_ & 0xff00) * i_1951_)
					  & 0xff0000)) >> 8;
				i_1942_ += anInt8822;
				i_1943_ += anInt8825;
			    }
			}
			i_1939_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_1953_ = anInt8816;
		    while (i_1953_ < 0) {
			int i_1954_ = i_1953_ + i_1881_;
			if (i_1954_ >= 0) {
			    if (i_1954_ >= is.length)
				break;
			    int i_1955_ = anInt8818;
			    int i_1956_ = anInt8807 + anInt8805;
			    int i_1957_ = anInt8826 + anInt8828;
			    int i_1958_ = anInt8809;
			    int i_1959_;
			    if ((i_1959_
				 = (i_1956_
				    - (((Class151_Sub1_Sub3) this).anInt8803
				       << 12)))
				>= 0) {
				i_1959_ = (anInt8822 - i_1959_) / anInt8822;
				i_1958_ += i_1959_;
				i_1956_ += anInt8822 * i_1959_;
				i_1957_ += anInt8825 * i_1959_;
				i_1955_ += i_1959_;
			    }
			    if ((i_1959_ = (i_1956_ - anInt8822) / anInt8822)
				> i_1958_)
				i_1958_ = i_1959_;
			    if (i_1957_ < 0) {
				i_1959_
				    = (anInt8825 - 1 - i_1957_) / anInt8825;
				i_1958_ += i_1959_;
				i_1956_ += anInt8822 * i_1959_;
				i_1957_ += anInt8825 * i_1959_;
				i_1955_ += i_1959_;
			    }
			    if ((i_1959_
				 = (1 + i_1957_
				    - (((Class151_Sub1_Sub3) this).anInt8804
				       << 12)
				    - anInt8825) / anInt8825)
				> i_1958_)
				i_1958_ = i_1959_;
			    int i_1960_ = is[i_1954_] - i;
			    int i_1961_ = -is_1880_[i_1954_];
			    int i_1962_ = i_1960_ - (i_1955_ - anInt8818);
			    if (i_1962_ > 0) {
				i_1955_ += i_1962_;
				i_1958_ += i_1962_;
				i_1956_ += anInt8822 * i_1962_;
				i_1957_ += anInt8825 * i_1962_;
			    } else
				i_1961_ -= i_1962_;
			    if (i_1958_ < i_1961_)
				i_1958_ = i_1961_;
			    for (/**/; i_1958_ < 0; i_1958_++) {
				int i_1963_
				    = (((Class151_Sub1_Sub3) this)
				       .anIntArray11309
				       [((i_1957_ >> 12)
					 * (((Class151_Sub1_Sub3) this)
					    .anInt8803)) + (i_1956_ >> 12)]);
				int i_1964_ = i_1963_ >>> 24;
				int i_1965_ = 256 - i_1964_;
				int i_1966_ = is_1882_[i_1955_];
				is_1882_[i_1955_++]
				    = ((((i_1963_ & 0xff00ff) * i_1964_
					 + (i_1966_ & 0xff00ff) * i_1965_)
					& ~0xff00ff)
				       + (((i_1963_ & 0xff00) * i_1964_
					   + (i_1966_ & 0xff00) * i_1965_)
					  & 0xff0000)) >> 8;
				i_1956_ += anInt8822;
				i_1957_ += anInt8825;
			    }
			}
			i_1953_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8825 == 0) {
		int i_1967_ = anInt8816;
		while (i_1967_ < 0) {
		    int i_1968_ = i_1967_ + i_1881_;
		    if (i_1968_ >= 0) {
			if (i_1968_ >= is.length)
			    break;
			int i_1969_ = anInt8818;
			int i_1970_ = anInt8807 + anInt8805;
			int i_1971_ = anInt8826;
			int i_1972_ = anInt8809;
			if (i_1971_ >= 0
			    && i_1971_ - (((Class151_Sub1_Sub3) this).anInt8804
					  << 12) < 0) {
			    if (i_1970_ < 0) {
				int i_1973_
				    = (anInt8822 - 1 - i_1970_) / anInt8822;
				i_1972_ += i_1973_;
				i_1970_ += anInt8822 * i_1973_;
				i_1969_ += i_1973_;
			    }
			    int i_1974_;
			    if ((i_1974_
				 = (1 + i_1970_
				    - (((Class151_Sub1_Sub3) this).anInt8803
				       << 12)
				    - anInt8822) / anInt8822)
				> i_1972_)
				i_1972_ = i_1974_;
			    int i_1975_ = is[i_1968_] - i;
			    int i_1976_ = -is_1880_[i_1968_];
			    int i_1977_ = i_1975_ - (i_1969_ - anInt8818);
			    if (i_1977_ > 0) {
				i_1969_ += i_1977_;
				i_1972_ += i_1977_;
				i_1970_ += anInt8822 * i_1977_;
				i_1971_ += anInt8825 * i_1977_;
			    } else
				i_1976_ -= i_1977_;
			    if (i_1972_ < i_1976_)
				i_1972_ = i_1976_;
			    for (/**/; i_1972_ < 0; i_1972_++) {
				int i_1978_
				    = (((Class151_Sub1_Sub3) this)
				       .anIntArray11309
				       [((i_1971_ >> 12)
					 * (((Class151_Sub1_Sub3) this)
					    .anInt8803)) + (i_1970_ >> 12)]);
				int i_1979_ = i_1978_ >>> 24;
				int i_1980_ = 256 - i_1979_;
				int i_1981_ = is_1882_[i_1969_];
				is_1882_[i_1969_++]
				    = ((((i_1978_ & 0xff00ff) * i_1979_
					 + (i_1981_ & 0xff00ff) * i_1980_)
					& ~0xff00ff)
				       + (((i_1978_ & 0xff00) * i_1979_
					   + (i_1981_ & 0xff00) * i_1980_)
					  & 0xff0000)) >> 8;
				i_1970_ += anInt8822;
			    }
			}
		    }
		    i_1967_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else if (anInt8825 < 0) {
		int i_1982_ = anInt8816;
		while (i_1982_ < 0) {
		    int i_1983_ = i_1982_ + i_1881_;
		    if (i_1983_ >= 0) {
			if (i_1983_ >= is.length)
			    break;
			int i_1984_ = anInt8818;
			int i_1985_ = anInt8807 + anInt8805;
			int i_1986_ = anInt8826 + anInt8828;
			int i_1987_ = anInt8809;
			if (i_1985_ < 0) {
			    int i_1988_
				= (anInt8822 - 1 - i_1985_) / anInt8822;
			    i_1987_ += i_1988_;
			    i_1985_ += anInt8822 * i_1988_;
			    i_1986_ += anInt8825 * i_1988_;
			    i_1984_ += i_1988_;
			}
			int i_1989_;
			if ((i_1989_
			     = (1 + i_1985_
				- (((Class151_Sub1_Sub3) this).anInt8803 << 12)
				- anInt8822) / anInt8822)
			    > i_1987_)
			    i_1987_ = i_1989_;
			if ((i_1989_
			     = i_1986_ - (((Class151_Sub1_Sub3) this).anInt8804
					  << 12))
			    >= 0) {
			    i_1989_ = (anInt8825 - i_1989_) / anInt8825;
			    i_1987_ += i_1989_;
			    i_1985_ += anInt8822 * i_1989_;
			    i_1986_ += anInt8825 * i_1989_;
			    i_1984_ += i_1989_;
			}
			if ((i_1989_ = (i_1986_ - anInt8825) / anInt8825)
			    > i_1987_)
			    i_1987_ = i_1989_;
			int i_1990_ = is[i_1983_] - i;
			int i_1991_ = -is_1880_[i_1983_];
			int i_1992_ = i_1990_ - (i_1984_ - anInt8818);
			if (i_1992_ > 0) {
			    i_1984_ += i_1992_;
			    i_1987_ += i_1992_;
			    i_1985_ += anInt8822 * i_1992_;
			    i_1986_ += anInt8825 * i_1992_;
			} else
			    i_1991_ -= i_1992_;
			if (i_1987_ < i_1991_)
			    i_1987_ = i_1991_;
			for (/**/; i_1987_ < 0; i_1987_++) {
			    int i_1993_
				= (((Class151_Sub1_Sub3) this).anIntArray11309
				   [(((i_1986_ >> 12)
				      * ((Class151_Sub1_Sub3) this).anInt8803)
				     + (i_1985_ >> 12))]);
			    int i_1994_ = i_1993_ >>> 24;
			    int i_1995_ = 256 - i_1994_;
			    int i_1996_ = is_1882_[i_1984_];
			    is_1882_[i_1984_++]
				= ((((i_1993_ & 0xff00ff) * i_1994_
				     + (i_1996_ & 0xff00ff) * i_1995_)
				    & ~0xff00ff)
				   + (((i_1993_ & 0xff00) * i_1994_
				       + (i_1996_ & 0xff00) * i_1995_)
				      & 0xff0000)) >> 8;
			    i_1985_ += anInt8822;
			    i_1986_ += anInt8825;
			}
		    }
		    i_1982_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else {
		int i_1997_ = anInt8816;
		while (i_1997_ < 0) {
		    int i_1998_ = i_1997_ + i_1881_;
		    if (i_1998_ >= 0) {
			if (i_1998_ >= is.length)
			    break;
			int i_1999_ = anInt8818;
			int i_2000_ = anInt8807 + anInt8805;
			int i_2001_ = anInt8826 + anInt8828;
			int i_2002_ = anInt8809;
			if (i_2000_ < 0) {
			    int i_2003_
				= (anInt8822 - 1 - i_2000_) / anInt8822;
			    i_2002_ += i_2003_;
			    i_2000_ += anInt8822 * i_2003_;
			    i_2001_ += anInt8825 * i_2003_;
			    i_1999_ += i_2003_;
			}
			int i_2004_;
			if ((i_2004_
			     = (1 + i_2000_
				- (((Class151_Sub1_Sub3) this).anInt8803 << 12)
				- anInt8822) / anInt8822)
			    > i_2002_)
			    i_2002_ = i_2004_;
			if (i_2001_ < 0) {
			    i_2004_ = (anInt8825 - 1 - i_2001_) / anInt8825;
			    i_2002_ += i_2004_;
			    i_2000_ += anInt8822 * i_2004_;
			    i_2001_ += anInt8825 * i_2004_;
			    i_1999_ += i_2004_;
			}
			if ((i_2004_
			     = (1 + i_2001_
				- (((Class151_Sub1_Sub3) this).anInt8804 << 12)
				- anInt8825) / anInt8825)
			    > i_2002_)
			    i_2002_ = i_2004_;
			int i_2005_ = is[i_1998_] - i;
			int i_2006_ = -is_1880_[i_1998_];
			int i_2007_ = i_2005_ - (i_1999_ - anInt8818);
			if (i_2007_ > 0) {
			    i_1999_ += i_2007_;
			    i_2002_ += i_2007_;
			    i_2000_ += anInt8822 * i_2007_;
			    i_2001_ += anInt8825 * i_2007_;
			} else
			    i_2006_ -= i_2007_;
			if (i_2002_ < i_2006_)
			    i_2002_ = i_2006_;
			for (/**/; i_2002_ < 0; i_2002_++) {
			    int i_2008_
				= (((Class151_Sub1_Sub3) this).anIntArray11309
				   [(((i_2001_ >> 12)
				      * ((Class151_Sub1_Sub3) this).anInt8803)
				     + (i_2000_ >> 12))]);
			    int i_2009_ = i_2008_ >>> 24;
			    int i_2010_ = 256 - i_2009_;
			    int i_2011_ = is_1882_[i_1999_];
			    is_1882_[i_1999_++]
				= ((((i_2008_ & 0xff00ff) * i_2009_
				     + (i_2011_ & 0xff00ff) * i_2010_)
				    & ~0xff00ff)
				   + (((i_2008_ & 0xff00) * i_2009_
				       + (i_2011_ & 0xff00) * i_2010_)
				      & 0xff0000)) >> 8;
			    i_2000_ += anInt8822;
			    i_2001_ += anInt8825;
			}
		    }
		    i_1997_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    }
	}
    }
    
    void method10370(int i, int i_2012_, int[] is, int i_2013_, int i_2014_) {
	if (i_2014_ == 0) {
	    if (i_2013_ == 1)
		is[i_2012_] = ((Class151_Sub1_Sub3) this).anIntArray11309[i];
	    else if (i_2013_ == 0) {
		int i_2015_ = ((Class151_Sub1_Sub3) this).anIntArray11309[i++];
		int i_2016_ = (i_2015_ & 0xff0000) * anInt8815 & ~0xffffff;
		int i_2017_ = (i_2015_ & 0xff00) * anInt8833 & 0xff0000;
		int i_2018_ = (i_2015_ & 0xff) * anInt8836 & 0xff00;
		is[i_2012_] = (i_2016_ | i_2017_ | i_2018_) >>> 8;
	    } else if (i_2013_ == 3) {
		int i_2019_ = ((Class151_Sub1_Sub3) this).anIntArray11309[i++];
		int i_2020_ = anInt8829;
		int i_2021_ = i_2019_ + i_2020_;
		int i_2022_ = (i_2019_ & 0xff00ff) + (i_2020_ & 0xff00ff);
		int i_2023_
		    = (i_2022_ & 0x1000100) + (i_2021_ - i_2022_ & 0x10000);
		is[i_2012_] = i_2021_ - i_2023_ | i_2023_ - (i_2023_ >>> 8);
	    } else if (i_2013_ == 2) {
		int i_2024_ = ((Class151_Sub1_Sub3) this).anIntArray11309[i];
		int i_2025_ = (i_2024_ & 0xff00ff) * anInt8830 & ~0xff00ff;
		int i_2026_ = (i_2024_ & 0xff00) * anInt8830 & 0xff0000;
		is[i_2012_] = ((i_2025_ | i_2026_) >>> 8) + anInt8834;
	    } else
		throw new IllegalArgumentException();
	} else if (i_2014_ == 1) {
	    if (i_2013_ == 1) {
		int i_2027_ = ((Class151_Sub1_Sub3) this).anIntArray11309[i];
		int i_2028_ = i_2027_ >>> 24;
		int i_2029_ = 256 - i_2028_;
		int i_2030_ = is[i_2012_];
		is[i_2012_] = ((((i_2027_ & 0xff00ff) * i_2028_
				 + (i_2030_ & 0xff00ff) * i_2029_)
				& ~0xff00ff)
			       + (((i_2027_ & 0xff00) * i_2028_
				   + (i_2030_ & 0xff00) * i_2029_)
				  & 0xff0000)) >> 8;
	    } else if (i_2013_ == 0) {
		int i_2031_ = ((Class151_Sub1_Sub3) this).anIntArray11309[i];
		int i_2032_ = (i_2031_ >>> 24) * anInt8830 >> 8;
		int i_2033_ = 256 - i_2032_;
		if ((anInt8829 & 0xffffff) == 16777215) {
		    int i_2034_ = is[i_2012_];
		    is[i_2012_] = ((((i_2031_ & 0xff00ff) * i_2032_
				     + (i_2034_ & 0xff00ff) * i_2033_)
				    & ~0xff00ff)
				   + (((i_2031_ & 0xff00) * i_2032_
				       + (i_2034_ & 0xff00) * i_2033_)
				      & 0xff0000)) >> 8;
		} else if (i_2032_ != 255) {
		    int i_2035_ = (i_2031_ & 0xff0000) * anInt8815 & ~0xffffff;
		    int i_2036_ = (i_2031_ & 0xff00) * anInt8833 & 0xff0000;
		    int i_2037_ = (i_2031_ & 0xff) * anInt8836 & 0xff00;
		    i_2031_ = (i_2035_ | i_2036_ | i_2037_) >>> 8;
		    int i_2038_ = is[i_2012_];
		    is[i_2012_] = ((((i_2031_ & 0xff00ff) * i_2032_
				     + (i_2038_ & 0xff00ff) * i_2033_)
				    & ~0xff00ff)
				   + (((i_2031_ & 0xff00) * i_2032_
				       + (i_2038_ & 0xff00) * i_2033_)
				      & 0xff0000)) >> 8;
		} else {
		    int i_2039_ = (i_2031_ & 0xff0000) * anInt8815 & ~0xffffff;
		    int i_2040_ = (i_2031_ & 0xff00) * anInt8833 & 0xff0000;
		    int i_2041_ = (i_2031_ & 0xff) * anInt8836 & 0xff00;
		    is[i_2012_] = (i_2039_ | i_2040_ | i_2041_) >>> 8;
		}
	    } else if (i_2013_ == 3) {
		int i_2042_ = ((Class151_Sub1_Sub3) this).anIntArray11309[i];
		int i_2043_ = anInt8829;
		int i_2044_ = i_2042_ + i_2043_;
		int i_2045_ = (i_2042_ & 0xff00ff) + (i_2043_ & 0xff00ff);
		int i_2046_
		    = (i_2045_ & 0x1000100) + (i_2044_ - i_2045_ & 0x10000);
		i_2046_ = i_2044_ - i_2046_ | i_2046_ - (i_2046_ >>> 8);
		int i_2047_ = (i_2042_ >>> 24) * anInt8830 >> 8;
		int i_2048_ = 256 - i_2047_;
		if (i_2047_ != 255) {
		    i_2042_ = i_2046_;
		    i_2046_ = is[i_2012_];
		    i_2046_ = ((((i_2042_ & 0xff00ff) * i_2047_
				 + (i_2046_ & 0xff00ff) * i_2048_)
				& ~0xff00ff)
			       + (((i_2042_ & 0xff00) * i_2047_
				   + (i_2046_ & 0xff00) * i_2048_)
				  & 0xff0000)) >> 8;
		}
		is[i_2012_] = i_2046_;
	    } else if (i_2013_ == 2) {
		int i_2049_ = ((Class151_Sub1_Sub3) this).anIntArray11309[i];
		int i_2050_ = i_2049_ >>> 24;
		int i_2051_ = 256 - i_2050_;
		int i_2052_ = (i_2049_ & 0xff00ff) * anInt8830 & ~0xff00ff;
		int i_2053_ = (i_2049_ & 0xff00) * anInt8830 & 0xff0000;
		i_2049_ = ((i_2052_ | i_2053_) >>> 8) + anInt8834;
		int i_2054_ = is[i_2012_];
		is[i_2012_] = ((((i_2049_ & 0xff00ff) * i_2050_
				 + (i_2054_ & 0xff00ff) * i_2051_)
				& ~0xff00ff)
			       + (((i_2049_ & 0xff00) * i_2050_
				   + (i_2054_ & 0xff00) * i_2051_)
				  & 0xff0000)) >> 8;
	    } else
		throw new IllegalArgumentException();
	} else if (i_2014_ == 2) {
	    if (i_2013_ == 1) {
		int i_2055_ = ((Class151_Sub1_Sub3) this).anIntArray11309[i];
		int i_2056_ = is[i_2012_];
		int i_2057_ = i_2055_ + i_2056_;
		int i_2058_ = (i_2055_ & 0xff00ff) + (i_2056_ & 0xff00ff);
		i_2056_
		    = (i_2058_ & 0x1000100) + (i_2057_ - i_2058_ & 0x10000);
		is[i_2012_] = i_2057_ - i_2056_ | i_2056_ - (i_2056_ >>> 8);
	    } else if (i_2013_ == 0) {
		int i_2059_ = ((Class151_Sub1_Sub3) this).anIntArray11309[i];
		int i_2060_ = (i_2059_ & 0xff0000) * anInt8815 & ~0xffffff;
		int i_2061_ = (i_2059_ & 0xff00) * anInt8833 & 0xff0000;
		int i_2062_ = (i_2059_ & 0xff) * anInt8836 & 0xff00;
		i_2059_ = (i_2060_ | i_2061_ | i_2062_) >>> 8;
		int i_2063_ = is[i_2012_];
		int i_2064_ = i_2059_ + i_2063_;
		int i_2065_ = (i_2059_ & 0xff00ff) + (i_2063_ & 0xff00ff);
		i_2063_
		    = (i_2065_ & 0x1000100) + (i_2064_ - i_2065_ & 0x10000);
		is[i_2012_] = i_2064_ - i_2063_ | i_2063_ - (i_2063_ >>> 8);
	    } else if (i_2013_ == 3) {
		int i_2066_ = ((Class151_Sub1_Sub3) this).anIntArray11309[i];
		int i_2067_ = anInt8829;
		int i_2068_ = i_2066_ + i_2067_;
		int i_2069_ = (i_2066_ & 0xff00ff) + (i_2067_ & 0xff00ff);
		int i_2070_
		    = (i_2069_ & 0x1000100) + (i_2068_ - i_2069_ & 0x10000);
		i_2066_ = i_2068_ - i_2070_ | i_2070_ - (i_2070_ >>> 8);
		i_2070_ = is[i_2012_];
		i_2068_ = i_2066_ + i_2070_;
		i_2069_ = (i_2066_ & 0xff00ff) + (i_2070_ & 0xff00ff);
		i_2070_
		    = (i_2069_ & 0x1000100) + (i_2068_ - i_2069_ & 0x10000);
		is[i_2012_] = i_2068_ - i_2070_ | i_2070_ - (i_2070_ >>> 8);
	    } else if (i_2013_ == 2) {
		int i_2071_ = ((Class151_Sub1_Sub3) this).anIntArray11309[i];
		int i_2072_ = (i_2071_ & 0xff00ff) * anInt8830 & ~0xff00ff;
		int i_2073_ = (i_2071_ & 0xff00) * anInt8830 & 0xff0000;
		i_2071_ = ((i_2072_ | i_2073_) >>> 8) + anInt8834;
		int i_2074_ = is[i_2012_];
		int i_2075_ = i_2071_ + i_2074_;
		int i_2076_ = (i_2071_ & 0xff00ff) + (i_2074_ & 0xff00ff);
		i_2074_
		    = (i_2076_ & 0x1000100) + (i_2075_ - i_2076_ & 0x10000);
		is[i_2012_] = i_2075_ - i_2074_ | i_2074_ - (i_2074_ >>> 8);
	    }
	} else
	    throw new IllegalArgumentException();
    }
}
