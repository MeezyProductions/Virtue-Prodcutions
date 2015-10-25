/* Class151_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class151_Sub1_Sub1 extends Class151_Sub1
{
    int[] anIntArray11257;
    byte[] aByteArray11258;
    
    public Interface19 method1769() {
	throw new IllegalStateException();
    }
    
    public void method1770(int i, int i_0_, int i_1_, int i_2_, int[] is,
			   int i_3_, int i_4_) {
	throw new IllegalStateException();
    }
    
    public void method1771(int i, int i_5_, int i_6_, int i_7_, int[] is,
			   int[] is_8_, int i_9_, int i_10_) {
	throw new IllegalStateException();
    }
    
    public void method1784(int i, int i_11_, int i_12_, int i_13_, int i_14_,
			   int i_15_) {
	throw new IllegalStateException();
    }
    
    public void method1795(int i, int i_16_, int i_17_, int i_18_, int i_19_,
			   int i_20_) {
	throw new IllegalStateException();
    }
    
    public void method1792(int i, int i_21_, int i_22_, int i_23_, int[] is,
			   int i_24_, int i_25_) {
	throw new IllegalStateException();
    }
    
    public void method1780(int i, int i_26_, int i_27_, int i_28_, int i_29_) {
	if (((Class151_Sub1_Sub1) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    int i_30_ = (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					   .aClass173_Sub3_8814)).anInt9735
			 * 111437289);
	    i += ((Class151_Sub1_Sub1) this).anInt8806;
	    i_26_ += ((Class151_Sub1_Sub1) this).anInt8819;
	    int i_31_ = i_26_ * i_30_ + i;
	    int i_32_ = 0;
	    int i_33_ = ((Class151_Sub1_Sub1) this).anInt8804;
	    int i_34_ = ((Class151_Sub1_Sub1) this).anInt8803;
	    int i_35_ = i_30_ - i_34_;
	    int i_36_ = 0;
	    if (i_26_ < (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					   .aClass173_Sub3_8814)).anInt9725
			 * 592117349)) {
		int i_37_ = ((((Class173_Sub3)
			       ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
			      .anInt9725) * 592117349
			     - i_26_);
		i_33_ -= i_37_;
		i_26_ = (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					   .aClass173_Sub3_8814)).anInt9725
			 * 592117349);
		i_32_ += i_37_ * i_34_;
		i_31_ += i_37_ * i_30_;
	    }
	    if (i_26_ + i_33_
		> ((Class173_Sub3) (((Class151_Sub1_Sub1) this)
				    .aClass173_Sub3_8814)).anInt9726 * 6965409)
		i_33_ -= (i_26_ + i_33_
			  - (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					       .aClass173_Sub3_8814)).anInt9726
			     * 6965409));
	    if (i < (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119)) {
		int i_38_ = ((((Class173_Sub3)
			       ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
			      .anInt9723) * -993497119
			     - i);
		i_34_ -= i_38_;
		i = (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119);
		i_32_ += i_38_;
		i_31_ += i_38_;
		i_36_ += i_38_;
		i_35_ += i_38_;
	    }
	    if (i + i_34_ > (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					       .aClass173_Sub3_8814)).anInt9724
			     * 630968029)) {
		int i_39_ = (i + i_34_
			     - (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						  .aClass173_Sub3_8814))
				.anInt9724) * 630968029);
		i_34_ -= i_39_;
		i_36_ += i_39_;
		i_35_ += i_39_;
	    }
	    if (i_34_ > 0 && i_33_ > 0) {
		if (i_29_ == 0) {
		    if (i_27_ == 1) {
			for (int i_40_ = -i_33_; i_40_ < 0; i_40_++) {
			    int i_41_ = i_31_ + i_34_ - 3;
			    while (i_31_ < i_41_) {
				is[i_31_++]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_32_++]) & 0xff]);
				is[i_31_++]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_32_++]) & 0xff]);
				is[i_31_++]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_32_++]) & 0xff]);
				is[i_31_++]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_32_++]) & 0xff]);
			    }
			    i_41_ += 3;
			    while (i_31_ < i_41_)
				is[i_31_++]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_32_++]) & 0xff]);
			    i_31_ += i_35_;
			    i_32_ += i_36_;
			}
		    } else if (i_27_ == 0) {
			int i_42_ = (i_28_ & 0xff0000) >> 16;
			int i_43_ = (i_28_ & 0xff00) >> 8;
			int i_44_ = i_28_ & 0xff;
			for (int i_45_ = -i_33_; i_45_ < 0; i_45_++) {
			    for (int i_46_ = -i_34_; i_46_ < 0; i_46_++) {
				int i_47_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_32_++]) & 0xff]);
				int i_48_
				    = (i_47_ & 0xff0000) * i_42_ & ~0xffffff;
				int i_49_
				    = (i_47_ & 0xff00) * i_43_ & 0xff0000;
				int i_50_ = (i_47_ & 0xff) * i_44_ & 0xff00;
				is[i_31_++] = (i_48_ | i_49_ | i_50_) >>> 8;
			    }
			    i_31_ += i_35_;
			    i_32_ += i_36_;
			}
		    } else if (i_27_ == 3) {
			for (int i_51_ = -i_33_; i_51_ < 0; i_51_++) {
			    for (int i_52_ = -i_34_; i_52_ < 0; i_52_++) {
				int i_53_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_32_++]) & 0xff]);
				int i_54_ = i_53_ + i_28_;
				int i_55_
				    = (i_53_ & 0xff00ff) + (i_28_ & 0xff00ff);
				int i_56_ = ((i_55_ & 0x1000100)
					     + (i_54_ - i_55_ & 0x10000));
				is[i_31_++]
				    = i_54_ - i_56_ | i_56_ - (i_56_ >>> 8);
			    }
			    i_31_ += i_35_;
			    i_32_ += i_36_;
			}
		    } else if (i_27_ == 2) {
			int i_57_ = i_28_ >>> 24;
			int i_58_ = 256 - i_57_;
			int i_59_ = (i_28_ & 0xff00ff) * i_58_ & ~0xff00ff;
			int i_60_ = (i_28_ & 0xff00) * i_58_ & 0xff0000;
			i_28_ = (i_59_ | i_60_) >>> 8;
			for (int i_61_ = -i_33_; i_61_ < 0; i_61_++) {
			    for (int i_62_ = -i_34_; i_62_ < 0; i_62_++) {
				int i_63_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_32_++]) & 0xff]);
				i_59_ = (i_63_ & 0xff00ff) * i_57_ & ~0xff00ff;
				i_60_ = (i_63_ & 0xff00) * i_57_ & 0xff0000;
				is[i_31_++] = ((i_59_ | i_60_) >>> 8) + i_28_;
			    }
			    i_31_ += i_35_;
			    i_32_ += i_36_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_29_ == 1) {
		    if (i_27_ == 1) {
			for (int i_64_ = -i_33_; i_64_ < 0; i_64_++) {
			    for (int i_65_ = -i_34_; i_65_ < 0; i_65_++) {
				int i_66_ = (((Class151_Sub1_Sub1) this)
					     .aByteArray11258[i_32_++]);
				if (i_66_ != 0) {
				    int i_67_
					= ((((Class151_Sub1_Sub1) this)
					    .anIntArray11257[i_66_ & 0xff])
					   | ~0xffffff);
				    int i_68_ = 255;
				    int i_69_ = 0;
				    int i_70_ = is[i_31_];
				    is[i_31_++]
					= (((((i_67_ & 0xff00ff) * i_68_
					      + (i_70_ & 0xff00ff) * i_69_)
					     & ~0xff00ff)
					    >> 8)
					   + (((((i_67_ & ~0xff00ff) >>> 8)
						* i_68_)
					       + (((i_70_ & ~0xff00ff) >>> 8)
						  * i_69_))
					      & ~0xff00ff));
				} else
				    i_31_++;
			    }
			    i_31_ += i_35_;
			    i_32_ += i_36_;
			}
		    } else if (i_27_ == 0) {
			if ((i_28_ & 0xffffff) == 16777215) {
			    int i_71_ = i_28_ >>> 24;
			    int i_72_ = 256 - i_71_;
			    for (int i_73_ = -i_33_; i_73_ < 0; i_73_++) {
				for (int i_74_ = -i_34_; i_74_ < 0; i_74_++) {
				    int i_75_ = (((Class151_Sub1_Sub1) this)
						 .aByteArray11258[i_32_++]);
				    if (i_75_ != 0) {
					int i_76_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257[i_75_ & 0xff]);
					int i_77_ = is[i_31_];
					is[i_31_++]
					    = ((((i_76_ & 0xff00ff) * i_71_
						 + (i_77_ & 0xff00ff) * i_72_)
						& ~0xff00ff)
					       + (((i_76_ & 0xff00) * i_71_
						   + (i_77_ & 0xff00) * i_72_)
						  & 0xff0000)) >> 8;
				    } else
					i_31_++;
				}
				i_31_ += i_35_;
				i_32_ += i_36_;
			    }
			} else {
			    int i_78_ = (i_28_ & 0xff0000) >> 16;
			    int i_79_ = (i_28_ & 0xff00) >> 8;
			    int i_80_ = i_28_ & 0xff;
			    int i_81_ = i_28_ >>> 24;
			    int i_82_ = 256 - i_81_;
			    for (int i_83_ = -i_33_; i_83_ < 0; i_83_++) {
				for (int i_84_ = -i_34_; i_84_ < 0; i_84_++) {
				    int i_85_ = (((Class151_Sub1_Sub1) this)
						 .aByteArray11258[i_32_++]);
				    if (i_85_ != 0) {
					int i_86_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257[i_85_ & 0xff]);
					if (i_81_ != 255) {
					    int i_87_
						= ((i_86_ & 0xff0000) * i_78_
						   & ~0xffffff);
					    int i_88_
						= ((i_86_ & 0xff00) * i_79_
						   & 0xff0000);
					    int i_89_ = ((i_86_ & 0xff) * i_80_
							 & 0xff00);
					    i_86_ = ((i_87_ | i_88_ | i_89_)
						     >>> 8);
					    int i_90_ = is[i_31_];
					    is[i_31_++]
						= ((((i_86_ & 0xff00ff) * i_81_
						     + ((i_90_ & 0xff00ff)
							* i_82_))
						    & ~0xff00ff)
						   + (((i_86_ & 0xff00) * i_81_
						       + ((i_90_ & 0xff00)
							  * i_82_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_91_
						= ((i_86_ & 0xff0000) * i_78_
						   & ~0xffffff);
					    int i_92_
						= ((i_86_ & 0xff00) * i_79_
						   & 0xff0000);
					    int i_93_ = ((i_86_ & 0xff) * i_80_
							 & 0xff00);
					    is[i_31_++] = (i_91_ | i_92_
							   | i_93_) >>> 8;
					}
				    } else
					i_31_++;
				}
				i_31_ += i_35_;
				i_32_ += i_36_;
			    }
			}
		    } else if (i_27_ == 3) {
			int i_94_ = i_28_ >>> 24;
			int i_95_ = 256 - i_94_;
			for (int i_96_ = -i_33_; i_96_ < 0; i_96_++) {
			    for (int i_97_ = -i_34_; i_97_ < 0; i_97_++) {
				byte i_98_ = (((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_32_++]);
				int i_99_ = (i_98_ > 0
					     ? (((Class151_Sub1_Sub1) this)
						.anIntArray11257[i_98_])
					     : 0);
				int i_100_ = i_99_ + i_28_;
				int i_101_
				    = (i_99_ & 0xff00ff) + (i_28_ & 0xff00ff);
				int i_102_ = ((i_101_ & 0x1000100)
					      + (i_100_ - i_101_ & 0x10000));
				i_102_ = i_100_ - i_102_ | i_102_ - (i_102_
								     >>> 8);
				if (i_99_ == 0 && i_94_ != 255) {
				    i_99_ = i_102_;
				    i_102_ = is[i_31_];
				    i_102_ = ((((i_99_ & 0xff00ff) * i_94_
						+ (i_102_ & 0xff00ff) * i_95_)
					       & ~0xff00ff)
					      + (((i_99_ & 0xff00) * i_94_
						  + (i_102_ & 0xff00) * i_95_)
						 & 0xff0000)) >> 8;
				}
				is[i_31_++] = i_102_;
			    }
			    i_31_ += i_35_;
			    i_32_ += i_36_;
			}
		    } else if (i_27_ == 2) {
			int i_103_ = i_28_ >>> 24;
			int i_104_ = 256 - i_103_;
			int i_105_ = (i_28_ & 0xff00ff) * i_104_ & ~0xff00ff;
			int i_106_ = (i_28_ & 0xff00) * i_104_ & 0xff0000;
			i_28_ = (i_105_ | i_106_) >>> 8;
			for (int i_107_ = -i_33_; i_107_ < 0; i_107_++) {
			    for (int i_108_ = -i_34_; i_108_ < 0; i_108_++) {
				int i_109_ = (((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_32_++]);
				if (i_109_ != 0) {
				    int i_110_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_109_ & 0xff]);
				    i_105_ = ((i_110_ & 0xff00ff) * i_103_
					      & ~0xff00ff);
				    i_106_ = ((i_110_ & 0xff00) * i_103_
					      & 0xff0000);
				    is[i_31_++]
					= ((i_105_ | i_106_) >>> 8) + i_28_;
				} else
				    i_31_++;
			    }
			    i_31_ += i_35_;
			    i_32_ += i_36_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_29_ == 2) {
		    if (i_27_ == 1) {
			for (int i_111_ = -i_33_; i_111_ < 0; i_111_++) {
			    for (int i_112_ = -i_34_; i_112_ < 0; i_112_++) {
				int i_113_ = (((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_32_++]);
				if (i_113_ != 0) {
				    int i_114_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_113_ & 0xff]);
				    int i_115_ = is[i_31_];
				    int i_116_ = i_114_ + i_115_;
				    int i_117_ = ((i_114_ & 0xff00ff)
						  + (i_115_ & 0xff00ff));
				    i_115_ = ((i_117_ & 0x1000100)
					      + (i_116_ - i_117_ & 0x10000));
				    is[i_31_++]
					= i_116_ - i_115_ | i_115_ - (i_115_
								      >>> 8);
				} else
				    i_31_++;
			    }
			    i_31_ += i_35_;
			    i_32_ += i_36_;
			}
		    } else if (i_27_ == 0) {
			int i_118_ = (i_28_ & 0xff0000) >> 16;
			int i_119_ = (i_28_ & 0xff00) >> 8;
			int i_120_ = i_28_ & 0xff;
			for (int i_121_ = -i_33_; i_121_ < 0; i_121_++) {
			    for (int i_122_ = -i_34_; i_122_ < 0; i_122_++) {
				int i_123_ = (((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_32_++]);
				if (i_123_ != 0) {
				    int i_124_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_123_ & 0xff]);
				    int i_125_ = ((i_124_ & 0xff0000) * i_118_
						  & ~0xffffff);
				    int i_126_ = ((i_124_ & 0xff00) * i_119_
						  & 0xff0000);
				    int i_127_
					= (i_124_ & 0xff) * i_120_ & 0xff00;
				    i_124_ = (i_125_ | i_126_ | i_127_) >>> 8;
				    int i_128_ = is[i_31_];
				    int i_129_ = i_124_ + i_128_;
				    int i_130_ = ((i_124_ & 0xff00ff)
						  + (i_128_ & 0xff00ff));
				    i_128_ = ((i_130_ & 0x1000100)
					      + (i_129_ - i_130_ & 0x10000));
				    is[i_31_++]
					= i_129_ - i_128_ | i_128_ - (i_128_
								      >>> 8);
				} else
				    i_31_++;
			    }
			    i_31_ += i_35_;
			    i_32_ += i_36_;
			}
		    } else if (i_27_ == 3) {
			for (int i_131_ = -i_33_; i_131_ < 0; i_131_++) {
			    for (int i_132_ = -i_34_; i_132_ < 0; i_132_++) {
				byte i_133_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_32_++]);
				int i_134_ = (i_133_ > 0
					      ? (((Class151_Sub1_Sub1) this)
						 .anIntArray11257[i_133_])
					      : 0);
				int i_135_ = i_134_ + i_28_;
				int i_136_
				    = (i_134_ & 0xff00ff) + (i_28_ & 0xff00ff);
				int i_137_ = ((i_136_ & 0x1000100)
					      + (i_135_ - i_136_ & 0x10000));
				i_134_ = i_135_ - i_137_ | i_137_ - (i_137_
								     >>> 8);
				i_137_ = is[i_31_];
				i_135_ = i_134_ + i_137_;
				i_136_ = (i_134_ & 0xff00ff) + (i_137_
								& 0xff00ff);
				i_137_
				    = (i_136_ & 0x1000100) + (i_135_ - i_136_
							      & 0x10000);
				is[i_31_++]
				    = i_135_ - i_137_ | i_137_ - (i_137_
								  >>> 8);
			    }
			    i_31_ += i_35_;
			    i_32_ += i_36_;
			}
		    } else if (i_27_ == 2) {
			int i_138_ = i_28_ >>> 24;
			int i_139_ = 256 - i_138_;
			int i_140_ = (i_28_ & 0xff00ff) * i_139_ & ~0xff00ff;
			int i_141_ = (i_28_ & 0xff00) * i_139_ & 0xff0000;
			i_28_ = (i_140_ | i_141_) >>> 8;
			for (int i_142_ = -i_33_; i_142_ < 0; i_142_++) {
			    for (int i_143_ = -i_34_; i_143_ < 0; i_143_++) {
				int i_144_ = (((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_32_++]);
				if (i_144_ != 0) {
				    int i_145_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_144_ & 0xff]);
				    i_140_ = ((i_145_ & 0xff00ff) * i_138_
					      & ~0xff00ff);
				    i_141_ = ((i_145_ & 0xff00) * i_138_
					      & 0xff0000);
				    i_145_ = ((i_140_ | i_141_) >>> 8) + i_28_;
				    int i_146_ = is[i_31_];
				    int i_147_ = i_145_ + i_146_;
				    int i_148_ = ((i_145_ & 0xff00ff)
						  + (i_146_ & 0xff00ff));
				    i_146_ = ((i_148_ & 0x1000100)
					      + (i_147_ - i_148_ & 0x10000));
				    is[i_31_++]
					= i_147_ - i_146_ | i_146_ - (i_146_
								      >>> 8);
				} else
				    i_31_++;
			    }
			    i_31_ += i_35_;
			    i_32_ += i_36_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method1775(int i, int i_149_, Class148 class148, int i_150_,
			   int i_151_) {
	if (((Class151_Sub1_Sub1) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    i += ((Class151_Sub1_Sub1) this).anInt8806;
	    i_149_ += ((Class151_Sub1_Sub1) this).anInt8819;
	    int i_152_ = 0;
	    int i_153_ = (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					    .aClass173_Sub3_8814)).anInt9735
			  * 111437289);
	    int i_154_ = ((Class151_Sub1_Sub1) this).anInt8803;
	    int i_155_ = ((Class151_Sub1_Sub1) this).anInt8804;
	    int i_156_ = i_153_ - i_154_;
	    int i_157_ = 0;
	    int i_158_ = i + i_149_ * i_153_;
	    if (i_149_ < (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					    .aClass173_Sub3_8814)).anInt9725
			  * 592117349)) {
		int i_159_ = ((((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						 .aClass173_Sub3_8814))
			       .anInt9725) * 592117349
			      - i_149_);
		i_155_ -= i_159_;
		i_149_ = (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					    .aClass173_Sub3_8814)).anInt9725
			  * 592117349);
		i_152_ += i_159_ * i_154_;
		i_158_ += i_159_ * i_153_;
	    }
	    if (i_149_ + i_155_
		> ((Class173_Sub3) (((Class151_Sub1_Sub1) this)
				    .aClass173_Sub3_8814)).anInt9726 * 6965409)
		i_155_ -= (i_149_ + i_155_
			   - (((Class173_Sub3)
			       ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
			      .anInt9726) * 6965409);
	    if (i < (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119)) {
		int i_160_ = ((((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						 .aClass173_Sub3_8814))
			       .anInt9723) * -993497119
			      - i);
		i_154_ -= i_160_;
		i = (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119);
		i_152_ += i_160_;
		i_158_ += i_160_;
		i_157_ += i_160_;
		i_156_ += i_160_;
	    }
	    if (i + i_154_ > (((Class173_Sub3)
			       ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
			      .anInt9724) * 630968029) {
		int i_161_ = (i + i_154_
			      - (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						   .aClass173_Sub3_8814))
				 .anInt9724) * 630968029);
		i_154_ -= i_161_;
		i_157_ += i_161_;
		i_156_ += i_161_;
	    }
	    if (i_154_ > 0 && i_155_ > 0) {
		Class148_Sub1 class148_sub1 = (Class148_Sub1) class148;
		int[] is_162_ = ((Class148_Sub1) class148_sub1).anIntArray8789;
		int[] is_163_ = ((Class148_Sub1) class148_sub1).anIntArray8788;
		int i_164_ = i_149_;
		if (i_151_ > i_164_) {
		    i_164_ = i_151_;
		    i_158_ += (i_151_ - i_149_) * i_153_;
		    i_152_ += ((i_151_ - i_149_)
			       * ((Class151_Sub1_Sub1) this).anInt8803);
		}
		int i_165_ = (i_151_ + is_162_.length < i_149_ + i_155_
			      ? i_151_ + is_162_.length : i_149_ + i_155_);
		for (int i_166_ = i_164_; i_166_ < i_165_; i_166_++) {
		    int i_167_ = is_162_[i_166_ - i_151_] + i_150_;
		    int i_168_ = is_163_[i_166_ - i_151_];
		    int i_169_ = i_154_;
		    if (i > i_167_) {
			int i_170_ = i - i_167_;
			if (i_170_ >= i_168_) {
			    i_152_ += i_154_ + i_157_;
			    i_158_ += i_154_ + i_156_;
			    continue;
			}
			i_168_ -= i_170_;
		    } else {
			int i_171_ = i_167_ - i;
			if (i_171_ >= i_154_) {
			    i_152_ += i_154_ + i_157_;
			    i_158_ += i_154_ + i_156_;
			    continue;
			}
			i_152_ += i_171_;
			i_169_ -= i_171_;
			i_158_ += i_171_;
		    }
		    int i_172_ = 0;
		    if (i_169_ < i_168_)
			i_168_ = i_169_;
		    else
			i_172_ = i_169_ - i_168_;
		    for (int i_173_ = -i_168_; i_173_ < 0; i_173_++) {
			int i_174_ = (((Class151_Sub1_Sub1) this)
				      .aByteArray11258[i_152_++]);
			if (i_174_ != 0)
			    is[i_158_++] = (((Class151_Sub1_Sub1) this)
					    .anIntArray11257[i_174_ & 0xff]);
			else
			    i_158_++;
		    }
		    i_152_ += i_172_ + i_157_;
		    i_158_ += i_172_ + i_156_;
		}
	    }
	}
    }
    
    void method8291(boolean bool, boolean bool_175_, boolean bool_176_, int i,
		    int i_177_, float f, int i_178_, int i_179_, int i_180_,
		    int i_181_, int i_182_, int i_183_, boolean bool_184_) {
	if (i_178_ > 0 && i_179_ > 0 && (bool || bool_175_)) {
	    int i_185_ = 0;
	    int i_186_ = 0;
	    int i_187_ = (((Class151_Sub1_Sub1) this).anInt8806
			  + ((Class151_Sub1_Sub1) this).anInt8803
			  + ((Class151_Sub1_Sub1) this).anInt8832);
	    int i_188_ = (((Class151_Sub1_Sub1) this).anInt8819
			  + ((Class151_Sub1_Sub1) this).anInt8804
			  + ((Class151_Sub1_Sub1) this).anInt8808);
	    int i_189_ = (i_187_ << 16) / i_178_;
	    int i_190_ = (i_188_ << 16) / i_179_;
	    if (((Class151_Sub1_Sub1) this).anInt8806 > 0) {
		int i_191_ = (((((Class151_Sub1_Sub1) this).anInt8806 << 16)
			       + i_189_ - 1)
			      / i_189_);
		i += i_191_;
		i_185_
		    += i_191_ * i_189_ - (((Class151_Sub1_Sub1) this).anInt8806
					  << 16);
	    }
	    if (((Class151_Sub1_Sub1) this).anInt8819 > 0) {
		int i_192_ = (((((Class151_Sub1_Sub1) this).anInt8819 << 16)
			       + i_190_ - 1)
			      / i_190_);
		i_177_ += i_192_;
		i_186_
		    += i_192_ * i_190_ - (((Class151_Sub1_Sub1) this).anInt8819
					  << 16);
	    }
	    if (((Class151_Sub1_Sub1) this).anInt8803 < i_187_)
		i_178_ = ((((Class151_Sub1_Sub1) this).anInt8803 << 16)
			  - i_185_ + i_189_ - 1) / i_189_;
	    if (((Class151_Sub1_Sub1) this).anInt8804 < i_188_)
		i_179_ = ((((Class151_Sub1_Sub1) this).anInt8804 << 16)
			  - i_186_ + i_190_ - 1) / i_190_;
	    int i_193_
		= i + i_177_ * ((((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						   .aClass173_Sub3_8814))
				 .anInt9735)
				* 111437289);
	    int i_194_ = ((((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					     .aClass173_Sub3_8814)).anInt9735
			   * 111437289)
			  - i_178_);
	    if (i_177_ + i_179_
		> ((Class173_Sub3) (((Class151_Sub1_Sub1) this)
				    .aClass173_Sub3_8814)).anInt9726 * 6965409)
		i_179_ -= (i_177_ + i_179_
			   - (((Class173_Sub3)
			       ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
			      .anInt9726) * 6965409);
	    if (i_177_ < (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					    .aClass173_Sub3_8814)).anInt9725
			  * 592117349)) {
		int i_195_ = ((((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						 .aClass173_Sub3_8814))
			       .anInt9725) * 592117349
			      - i_177_);
		i_179_ -= i_195_;
		i_193_
		    += i_195_ * ((((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						    .aClass173_Sub3_8814))
				  .anInt9735)
				 * 111437289);
		i_186_ += i_190_ * i_195_;
	    }
	    if (i + i_178_ > (((Class173_Sub3)
			       ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
			      .anInt9724) * 630968029) {
		int i_196_ = (i + i_178_
			      - (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						   .aClass173_Sub3_8814))
				 .anInt9724) * 630968029);
		i_178_ -= i_196_;
		i_194_ += i_196_;
	    }
	    if (i < (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119)) {
		int i_197_ = ((((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						 .aClass173_Sub3_8814))
			       .anInt9723) * -993497119
			      - i);
		i_178_ -= i_197_;
		i_193_ += i_197_;
		i_185_ += i_189_ * i_197_;
		i_194_ += i_197_;
	    }
	    float[] fs = (((Class173_Sub3)
			   ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
			  .aFloatArray9716);
	    int[] is = (((Class173_Sub3)
			 ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
			.anIntArray9719);
	    if (i_182_ == 0) {
		if (i_180_ == 1) {
		    int i_198_ = i_185_;
		    for (int i_199_ = -i_179_; i_199_ < 0; i_199_++) {
			int i_200_ = ((i_186_ >> 16)
				      * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_201_ = -i_178_; i_201_ < 0; i_201_++) {
			    if (!bool_175_ || f < fs[i_193_]) {
				if (bool)
				    is[i_193_]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258
					      [(i_185_ >> 16) + i_200_])
					     & 0xff)]);
				if (bool_175_ && bool_184_)
				    fs[i_193_] = f;
			    }
			    i_185_ += i_189_;
			    i_193_++;
			}
			i_186_ += i_190_;
			i_185_ = i_198_;
			i_193_ += i_194_;
		    }
		} else if (i_180_ == 0) {
		    int i_202_ = (i_181_ & 0xff0000) >> 16;
		    int i_203_ = (i_181_ & 0xff00) >> 8;
		    int i_204_ = i_181_ & 0xff;
		    int i_205_ = i_185_;
		    for (int i_206_ = -i_179_; i_206_ < 0; i_206_++) {
			int i_207_ = ((i_186_ >> 16)
				      * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_208_ = -i_178_; i_208_ < 0; i_208_++) {
			    if (!bool_175_ || f < fs[i_193_]) {
				if (bool) {
				    int i_209_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258
					      [(i_185_ >> 16) + i_207_])
					     & 0xff)]);
				    int i_210_ = ((i_209_ & 0xff0000) * i_202_
						  & ~0xffffff);
				    int i_211_ = ((i_209_ & 0xff00) * i_203_
						  & 0xff0000);
				    int i_212_
					= (i_209_ & 0xff) * i_204_ & 0xff00;
				    is[i_193_]
					= (i_210_ | i_211_ | i_212_) >>> 8;
				}
				if (bool_175_ && bool_184_)
				    fs[i_193_] = f;
			    }
			    i_185_ += i_189_;
			    i_193_++;
			}
			i_186_ += i_190_;
			i_185_ = i_205_;
			i_193_ += i_194_;
		    }
		} else if (i_180_ == 3) {
		    int i_213_ = i_185_;
		    for (int i_214_ = -i_179_; i_214_ < 0; i_214_++) {
			int i_215_ = ((i_186_ >> 16)
				      * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_216_ = -i_178_; i_216_ < 0; i_216_++) {
			    if (!bool_175_ || f < fs[i_193_]) {
				if (bool) {
				    byte i_217_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258
						   [(i_185_ >> 16) + i_215_]);
				    int i_218_
					= (i_217_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_217_])
					   : 0);
				    int i_219_ = i_218_ + i_181_;
				    int i_220_ = ((i_218_ & 0xff00ff)
						  + (i_181_ & 0xff00ff));
				    int i_221_
					= ((i_220_ & 0x1000100)
					   + (i_219_ - i_220_ & 0x10000));
				    is[i_193_]
					= i_219_ - i_221_ | i_221_ - (i_221_
								      >>> 8);
				}
				if (bool_175_ && bool_184_)
				    fs[i_193_] = f;
			    }
			    i_185_ += i_189_;
			    i_193_++;
			}
			i_186_ += i_190_;
			i_185_ = i_213_;
			i_193_ += i_194_;
		    }
		} else if (i_180_ == 2) {
		    int i_222_ = i_181_ >>> 24;
		    int i_223_ = 256 - i_222_;
		    int i_224_ = (i_181_ & 0xff00ff) * i_223_ & ~0xff00ff;
		    int i_225_ = (i_181_ & 0xff00) * i_223_ & 0xff0000;
		    i_181_ = (i_224_ | i_225_) >>> 8;
		    int i_226_ = i_185_;
		    for (int i_227_ = -i_179_; i_227_ < 0; i_227_++) {
			int i_228_ = ((i_186_ >> 16)
				      * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_229_ = -i_178_; i_229_ < 0; i_229_++) {
			    if (!bool_175_ || f < fs[i_193_]) {
				if (bool) {
				    int i_230_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258
					      [(i_185_ >> 16) + i_228_])
					     & 0xff)]);
				    i_224_ = ((i_230_ & 0xff00ff) * i_222_
					      & ~0xff00ff);
				    i_225_ = ((i_230_ & 0xff00) * i_222_
					      & 0xff0000);
				    is[i_193_]
					= ((i_224_ | i_225_) >>> 8) + i_181_;
				}
				if (bool_175_ && bool_184_)
				    fs[i_193_] = f;
			    }
			    i_185_ += i_189_;
			    i_193_++;
			}
			i_186_ += i_190_;
			i_185_ = i_226_;
			i_193_ += i_194_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_182_ == 1) {
		if (i_180_ == 1) {
		    int i_231_ = i_185_;
		    for (int i_232_ = -i_179_; i_232_ < 0; i_232_++) {
			int i_233_ = ((i_186_ >> 16)
				      * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_234_ = -i_178_; i_234_ < 0; i_234_++) {
			    if (!bool_175_ || f < fs[i_193_]) {
				int i_235_ = (((Class151_Sub1_Sub1) this)
					      .aByteArray11258
					      [(i_185_ >> 16) + i_233_]);
				if (i_235_ != 0) {
				    if (bool)
					is[i_193_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_235_ & 0xff]);
				    if (bool_175_ && bool_184_)
					fs[i_193_] = f;
				}
			    }
			    i_185_ += i_189_;
			    i_193_++;
			}
			i_186_ += i_190_;
			i_185_ = i_231_;
			i_193_ += i_194_;
		    }
		} else if (i_180_ == 0) {
		    int i_236_ = i_185_;
		    if ((i_181_ & 0xffffff) == 16777215) {
			int i_237_ = i_181_ >>> 24;
			int i_238_ = 256 - i_237_;
			for (int i_239_ = -i_179_; i_239_ < 0; i_239_++) {
			    int i_240_
				= ((i_186_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_241_ = -i_178_; i_241_ < 0; i_241_++) {
				if (!bool_175_ || f < fs[i_193_]) {
				    int i_242_ = (((Class151_Sub1_Sub1) this)
						  .aByteArray11258
						  [(i_185_ >> 16) + i_240_]);
				    if (i_242_ != 0) {
					if (bool) {
					    int i_243_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_242_ & 0xff]);
					    int i_244_ = is[i_193_];
					    is[i_193_]
						= (((((i_243_ & 0xff00ff)
						      * i_237_)
						     + ((i_244_ & 0xff00ff)
							* i_238_))
						    & ~0xff00ff)
						   + ((((i_243_ & 0xff00)
							* i_237_)
						       + ((i_244_ & 0xff00)
							  * i_238_))
						      & 0xff0000)) >> 8;
					}
					if (bool_175_ && bool_184_)
					    fs[i_193_] = f;
				    }
				}
				i_185_ += i_189_;
				i_193_++;
			    }
			    i_186_ += i_190_;
			    i_185_ = i_236_;
			    i_193_ += i_194_;
			}
		    } else {
			int i_245_ = (i_181_ & 0xff0000) >> 16;
			int i_246_ = (i_181_ & 0xff00) >> 8;
			int i_247_ = i_181_ & 0xff;
			int i_248_ = i_181_ >>> 24;
			int i_249_ = 256 - i_248_;
			for (int i_250_ = -i_179_; i_250_ < 0; i_250_++) {
			    int i_251_
				= ((i_186_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_252_ = -i_178_; i_252_ < 0; i_252_++) {
				if (!bool_175_ || f < fs[i_193_]) {
				    int i_253_ = (((Class151_Sub1_Sub1) this)
						  .aByteArray11258
						  [(i_185_ >> 16) + i_251_]);
				    if (i_253_ != 0) {
					int i_254_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_253_ & 0xff]);
					if (i_248_ != 255) {
					    if (bool) {
						int i_255_
						    = (((i_254_ & 0xff0000)
							* i_245_)
						       & ~0xffffff);
						int i_256_
						    = (((i_254_ & 0xff00)
							* i_246_)
						       & 0xff0000);
						int i_257_
						    = ((i_254_ & 0xff) * i_247_
						       & 0xff00);
						i_254_ = (i_255_ | i_256_
							  | i_257_) >>> 8;
						int i_258_ = is[i_193_];
						is[i_193_]
						    = (((((i_254_ & 0xff00ff)
							  * i_248_)
							 + ((i_258_ & 0xff00ff)
							    * i_249_))
							& ~0xff00ff)
						       + ((((i_254_ & 0xff00)
							    * i_248_)
							   + ((i_258_ & 0xff00)
							      * i_249_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_175_ && bool_184_)
						fs[i_193_] = f;
					} else {
					    if (bool) {
						int i_259_
						    = (((i_254_ & 0xff0000)
							* i_245_)
						       & ~0xffffff);
						int i_260_
						    = (((i_254_ & 0xff00)
							* i_246_)
						       & 0xff0000);
						int i_261_
						    = ((i_254_ & 0xff) * i_247_
						       & 0xff00);
						is[i_193_] = (i_259_ | i_260_
							      | i_261_) >>> 8;
					    }
					    if (bool_175_ && bool_184_)
						fs[i_193_] = f;
					}
				    }
				}
				i_185_ += i_189_;
				i_193_++;
			    }
			    i_186_ += i_190_;
			    i_185_ = i_236_;
			    i_193_ += i_194_;
			}
		    }
		} else if (i_180_ == 3) {
		    int i_262_ = i_185_;
		    int i_263_ = i_181_ >>> 24;
		    int i_264_ = 256 - i_263_;
		    for (int i_265_ = -i_179_; i_265_ < 0; i_265_++) {
			int i_266_ = ((i_186_ >> 16)
				      * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_267_ = -i_178_; i_267_ < 0; i_267_++) {
			    if (!bool_175_ || f < fs[i_193_]) {
				if (bool) {
				    byte i_268_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258
						   [(i_185_ >> 16) + i_266_]);
				    int i_269_
					= (i_268_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_268_])
					   : 0);
				    int i_270_ = i_269_ + i_181_;
				    int i_271_ = ((i_269_ & 0xff00ff)
						  + (i_181_ & 0xff00ff));
				    int i_272_
					= ((i_271_ & 0x1000100)
					   + (i_270_ - i_271_ & 0x10000));
				    i_272_
					= i_270_ - i_272_ | i_272_ - (i_272_
								      >>> 8);
				    if (i_269_ == 0 && i_263_ != 255) {
					i_269_ = i_272_;
					i_272_ = is[i_193_];
					i_272_
					    = ((((i_269_ & 0xff00ff) * i_263_
						 + ((i_272_ & 0xff00ff)
						    * i_264_))
						& ~0xff00ff)
					       + (((i_269_ & 0xff00) * i_263_
						   + ((i_272_ & 0xff00)
						      * i_264_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_193_] = i_272_;
				}
				if (bool_175_ && bool_184_)
				    fs[i_193_] = f;
			    }
			    i_185_ += i_189_;
			    i_193_++;
			}
			i_186_ += i_190_;
			i_185_ = i_262_;
			i_193_ += i_194_;
		    }
		} else if (i_180_ == 2) {
		    int i_273_ = i_181_ >>> 24;
		    int i_274_ = 256 - i_273_;
		    int i_275_ = (i_181_ & 0xff00ff) * i_274_ & ~0xff00ff;
		    int i_276_ = (i_181_ & 0xff00) * i_274_ & 0xff0000;
		    i_181_ = (i_275_ | i_276_) >>> 8;
		    int i_277_ = i_185_;
		    for (int i_278_ = -i_179_; i_278_ < 0; i_278_++) {
			int i_279_ = ((i_186_ >> 16)
				      * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_280_ = -i_178_; i_280_ < 0; i_280_++) {
			    if (!bool_175_ || f < fs[i_193_]) {
				int i_281_ = (((Class151_Sub1_Sub1) this)
					      .aByteArray11258
					      [(i_185_ >> 16) + i_279_]);
				if (i_281_ != 0) {
				    if (bool) {
					int i_282_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_281_ & 0xff]);
					i_275_ = ((i_282_ & 0xff00ff) * i_273_
						  & ~0xff00ff);
					i_276_ = ((i_282_ & 0xff00) * i_273_
						  & 0xff0000);
					is[i_193_] = (((i_275_ | i_276_) >>> 8)
						      + i_181_);
				    }
				    if (bool_175_ && bool_184_)
					fs[i_193_] = f;
				}
			    }
			    i_185_ += i_189_;
			    i_193_++;
			}
			i_186_ += i_190_;
			i_185_ = i_277_;
			i_193_ += i_194_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_182_ == 2) {
		if (i_180_ == 1) {
		    int i_283_ = i_185_;
		    for (int i_284_ = -i_179_; i_284_ < 0; i_284_++) {
			int i_285_ = ((i_186_ >> 16)
				      * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_286_ = -i_178_; i_286_ < 0; i_286_++) {
			    if (!bool_175_ || f < fs[i_193_]) {
				int i_287_ = (((Class151_Sub1_Sub1) this)
					      .aByteArray11258
					      [(i_185_ >> 16) + i_285_]);
				if (i_287_ != 0) {
				    if (bool) {
					int i_288_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_287_ & 0xff]);
					int i_289_ = is[i_193_];
					int i_290_ = i_288_ + i_289_;
					int i_291_ = ((i_288_ & 0xff00ff)
						      + (i_289_ & 0xff00ff));
					i_289_
					    = ((i_291_ & 0x1000100)
					       + (i_290_ - i_291_ & 0x10000));
					is[i_193_]
					    = (i_290_ - i_289_
					       | i_289_ - (i_289_ >>> 8));
				    }
				    if (bool_175_ && bool_184_)
					fs[i_193_] = f;
				}
			    }
			    i_185_ += i_189_;
			    i_193_++;
			}
			i_186_ += i_190_;
			i_185_ = i_283_;
			i_193_ += i_194_;
		    }
		} else if (i_180_ == 0) {
		    int i_292_ = i_185_;
		    int i_293_ = (i_181_ & 0xff0000) >> 16;
		    int i_294_ = (i_181_ & 0xff00) >> 8;
		    int i_295_ = i_181_ & 0xff;
		    for (int i_296_ = -i_179_; i_296_ < 0; i_296_++) {
			int i_297_ = ((i_186_ >> 16)
				      * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_298_ = -i_178_; i_298_ < 0; i_298_++) {
			    if (!bool_175_ || f < fs[i_193_]) {
				int i_299_ = (((Class151_Sub1_Sub1) this)
					      .aByteArray11258
					      [(i_185_ >> 16) + i_297_]);
				if (i_299_ != 0) {
				    if (bool) {
					int i_300_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_299_ & 0xff]);
					int i_301_
					    = ((i_300_ & 0xff0000) * i_293_
					       & ~0xffffff);
					int i_302_
					    = ((i_300_ & 0xff00) * i_294_
					       & 0xff0000);
					int i_303_ = ((i_300_ & 0xff) * i_295_
						      & 0xff00);
					i_300_
					    = (i_301_ | i_302_ | i_303_) >>> 8;
					int i_304_ = is[i_193_];
					int i_305_ = i_300_ + i_304_;
					int i_306_ = ((i_300_ & 0xff00ff)
						      + (i_304_ & 0xff00ff));
					i_304_
					    = ((i_306_ & 0x1000100)
					       + (i_305_ - i_306_ & 0x10000));
					is[i_193_]
					    = (i_305_ - i_304_
					       | i_304_ - (i_304_ >>> 8));
				    }
				    if (bool_175_ && bool_184_)
					fs[i_193_] = f;
				}
			    }
			    i_185_ += i_189_;
			    i_193_++;
			}
			i_186_ += i_190_;
			i_185_ = i_292_;
			i_193_ += i_194_;
		    }
		} else if (i_180_ == 3) {
		    int i_307_ = i_185_;
		    for (int i_308_ = -i_179_; i_308_ < 0; i_308_++) {
			int i_309_ = ((i_186_ >> 16)
				      * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_310_ = -i_178_; i_310_ < 0; i_310_++) {
			    if (!bool_175_ || f < fs[i_193_]) {
				if (bool) {
				    byte i_311_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258
						   [(i_185_ >> 16) + i_309_]);
				    int i_312_
					= (i_311_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_311_])
					   : 0);
				    int i_313_ = i_312_ + i_181_;
				    int i_314_ = ((i_312_ & 0xff00ff)
						  + (i_181_ & 0xff00ff));
				    int i_315_
					= ((i_314_ & 0x1000100)
					   + (i_313_ - i_314_ & 0x10000));
				    i_312_
					= i_313_ - i_315_ | i_315_ - (i_315_
								      >>> 8);
				    i_315_ = is[i_193_];
				    i_313_ = i_312_ + i_315_;
				    i_314_
					= (i_312_ & 0xff00ff) + (i_315_
								 & 0xff00ff);
				    i_315_ = ((i_314_ & 0x1000100)
					      + (i_313_ - i_314_ & 0x10000));
				    is[i_193_]
					= i_313_ - i_315_ | i_315_ - (i_315_
								      >>> 8);
				}
				if (bool_175_ && bool_184_)
				    fs[i_193_] = f;
			    }
			    i_185_ += i_189_;
			    i_193_++;
			}
			i_186_ += i_190_;
			i_185_ = i_307_;
			i_193_ += i_194_;
		    }
		} else if (i_180_ == 2) {
		    int i_316_ = i_181_ >>> 24;
		    int i_317_ = 256 - i_316_;
		    int i_318_ = (i_181_ & 0xff00ff) * i_317_ & ~0xff00ff;
		    int i_319_ = (i_181_ & 0xff00) * i_317_ & 0xff0000;
		    i_181_ = (i_318_ | i_319_) >>> 8;
		    int i_320_ = i_185_;
		    for (int i_321_ = -i_179_; i_321_ < 0; i_321_++) {
			int i_322_ = ((i_186_ >> 16)
				      * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_323_ = -i_178_; i_323_ < 0; i_323_++) {
			    if (!bool_175_ || f < fs[i_193_]) {
				int i_324_ = (((Class151_Sub1_Sub1) this)
					      .aByteArray11258
					      [(i_185_ >> 16) + i_322_]);
				if (i_324_ != 0) {
				    if (bool) {
					int i_325_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_324_ & 0xff]);
					i_318_ = ((i_325_ & 0xff00ff) * i_316_
						  & ~0xff00ff);
					i_319_ = ((i_325_ & 0xff00) * i_316_
						  & 0xff0000);
					i_325_ = (((i_318_ | i_319_) >>> 8)
						  + i_181_);
					int i_326_ = is[i_193_];
					int i_327_ = i_325_ + i_326_;
					int i_328_ = ((i_325_ & 0xff00ff)
						      + (i_326_ & 0xff00ff));
					i_326_
					    = ((i_328_ & 0x1000100)
					       + (i_327_ - i_328_ & 0x10000));
					is[i_193_]
					    = (i_327_ - i_326_
					       | i_326_ - (i_326_ >>> 8));
				    }
				    if (bool_175_ && bool_184_)
					fs[i_193_] = f;
				}
			    }
			    i_185_ += i_189_;
			    i_193_++;
			}
			i_186_ += i_190_;
			i_185_ = i_320_;
			i_193_ += i_194_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method1777(int i, int i_329_, int i_330_, int i_331_, int i_332_,
		    int i_333_, int i_334_, int i_335_) {
	if (((Class151_Sub1_Sub1) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	if (i_330_ > 0 && i_331_ > 0) {
	    int[] is = (((Class173_Sub3)
			 ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
			.anIntArray9719);
	    if (is != null) {
		int i_336_ = 0;
		int i_337_ = 0;
		int i_338_
		    = (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					 .aClass173_Sub3_8814)).anInt9735
		       * 111437289);
		int i_339_ = (((Class151_Sub1_Sub1) this).anInt8806
			      + ((Class151_Sub1_Sub1) this).anInt8803
			      + ((Class151_Sub1_Sub1) this).anInt8832);
		int i_340_ = (((Class151_Sub1_Sub1) this).anInt8819
			      + ((Class151_Sub1_Sub1) this).anInt8804
			      + ((Class151_Sub1_Sub1) this).anInt8808);
		int i_341_ = (i_339_ << 16) / i_330_;
		int i_342_ = (i_340_ << 16) / i_331_;
		if (((Class151_Sub1_Sub1) this).anInt8806 > 0) {
		    int i_343_ = ((((Class151_Sub1_Sub1) this).anInt8806 << 16)
				  + i_341_ - 1) / i_341_;
		    i += i_343_;
		    i_336_
			+= (i_343_ * i_341_
			    - (((Class151_Sub1_Sub1) this).anInt8806 << 16));
		}
		if (((Class151_Sub1_Sub1) this).anInt8819 > 0) {
		    int i_344_ = ((((Class151_Sub1_Sub1) this).anInt8819 << 16)
				  + i_342_ - 1) / i_342_;
		    i_329_ += i_344_;
		    i_337_
			+= (i_344_ * i_342_
			    - (((Class151_Sub1_Sub1) this).anInt8819 << 16));
		}
		if (((Class151_Sub1_Sub1) this).anInt8803 < i_339_)
		    i_330_ = ((((Class151_Sub1_Sub1) this).anInt8803 << 16)
			      - i_336_ + i_341_ - 1) / i_341_;
		if (((Class151_Sub1_Sub1) this).anInt8804 < i_340_)
		    i_331_ = ((((Class151_Sub1_Sub1) this).anInt8804 << 16)
			      - i_337_ + i_342_ - 1) / i_342_;
		int i_345_ = i + i_329_ * i_338_;
		int i_346_ = i_338_ - i_330_;
		if (i_329_ + i_331_
		    > (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					 .aClass173_Sub3_8814)).anInt9726
		       * 6965409))
		    i_331_ -= (i_329_ + i_331_
			       - (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						    .aClass173_Sub3_8814))
				  .anInt9726) * 6965409);
		if (i_329_ < (((Class173_Sub3)
			       ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
			      .anInt9725) * 592117349) {
		    int i_347_ = (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						    .aClass173_Sub3_8814))
				  .anInt9725) * 592117349 - i_329_;
		    i_331_ -= i_347_;
		    i_345_ += i_347_ * i_338_;
		    i_337_ += i_342_ * i_347_;
		}
		if (i + i_330_ > (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						    .aClass173_Sub3_8814))
				  .anInt9724) * 630968029) {
		    int i_348_
			= (i + i_330_
			   - (((Class173_Sub3)
			       ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
			      .anInt9724) * 630968029);
		    i_330_ -= i_348_;
		    i_346_ += i_348_;
		}
		if (i < (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					   .aClass173_Sub3_8814)).anInt9723
			 * -993497119)) {
		    int i_349_ = (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						    .aClass173_Sub3_8814))
				  .anInt9723) * -993497119 - i;
		    i_330_ -= i_349_;
		    i_345_ += i_349_;
		    i_336_ += i_341_ * i_349_;
		    i_346_ += i_349_;
		}
		if (i_334_ == 0) {
		    if (i_332_ == 1) {
			int i_350_ = i_336_;
			for (int i_351_ = -i_331_; i_351_ < 0; i_351_++) {
			    int i_352_
				= ((i_337_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_353_ = -i_330_; i_353_ < 0; i_353_++) {
				is[i_345_++]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258
					 [(i_336_ >> 16) + i_352_]) & 0xff]);
				i_336_ += i_341_;
			    }
			    i_337_ += i_342_;
			    i_336_ = i_350_;
			    i_345_ += i_346_;
			}
		    } else if (i_332_ == 0) {
			int i_354_ = (i_333_ & 0xff0000) >> 16;
			int i_355_ = (i_333_ & 0xff00) >> 8;
			int i_356_ = i_333_ & 0xff;
			int i_357_ = i_336_;
			for (int i_358_ = -i_331_; i_358_ < 0; i_358_++) {
			    int i_359_
				= ((i_337_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_360_ = -i_330_; i_360_ < 0; i_360_++) {
				int i_361_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258
					 [(i_336_ >> 16) + i_359_]) & 0xff]);
				int i_362_
				    = (i_361_ & 0xff0000) * i_354_ & ~0xffffff;
				int i_363_
				    = (i_361_ & 0xff00) * i_355_ & 0xff0000;
				int i_364_ = (i_361_ & 0xff) * i_356_ & 0xff00;
				is[i_345_++]
				    = (i_362_ | i_363_ | i_364_) >>> 8;
				i_336_ += i_341_;
			    }
			    i_337_ += i_342_;
			    i_336_ = i_357_;
			    i_345_ += i_346_;
			}
		    } else if (i_332_ == 3) {
			int i_365_ = i_336_;
			for (int i_366_ = -i_331_; i_366_ < 0; i_366_++) {
			    int i_367_
				= ((i_337_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_368_ = -i_330_; i_368_ < 0; i_368_++) {
				byte i_369_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258
					       [(i_336_ >> 16) + i_367_]);
				int i_370_ = (i_369_ > 0
					      ? (((Class151_Sub1_Sub1) this)
						 .anIntArray11257[i_369_])
					      : 0);
				int i_371_ = i_370_ + i_333_;
				int i_372_ = ((i_370_ & 0xff00ff)
					      + (i_333_ & 0xff00ff));
				int i_373_ = ((i_372_ & 0x1000100)
					      + (i_371_ - i_372_ & 0x10000));
				is[i_345_++]
				    = i_371_ - i_373_ | i_373_ - (i_373_
								  >>> 8);
				i_336_ += i_341_;
			    }
			    i_337_ += i_342_;
			    i_336_ = i_365_;
			    i_345_ += i_346_;
			}
		    } else if (i_332_ == 2) {
			int i_374_ = i_333_ >>> 24;
			int i_375_ = 256 - i_374_;
			int i_376_ = (i_333_ & 0xff00ff) * i_375_ & ~0xff00ff;
			int i_377_ = (i_333_ & 0xff00) * i_375_ & 0xff0000;
			i_333_ = (i_376_ | i_377_) >>> 8;
			int i_378_ = i_336_;
			for (int i_379_ = -i_331_; i_379_ < 0; i_379_++) {
			    int i_380_
				= ((i_337_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_381_ = -i_330_; i_381_ < 0; i_381_++) {
				int i_382_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258
					 [(i_336_ >> 16) + i_380_]) & 0xff]);
				i_376_
				    = (i_382_ & 0xff00ff) * i_374_ & ~0xff00ff;
				i_377_ = (i_382_ & 0xff00) * i_374_ & 0xff0000;
				is[i_345_++]
				    = ((i_376_ | i_377_) >>> 8) + i_333_;
				i_336_ += i_341_;
			    }
			    i_337_ += i_342_;
			    i_336_ = i_378_;
			    i_345_ += i_346_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_334_ == 1) {
		    if (i_332_ == 1) {
			int i_383_ = i_336_;
			for (int i_384_ = -i_331_; i_384_ < 0; i_384_++) {
			    int i_385_
				= ((i_337_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_386_ = -i_330_; i_386_ < 0; i_386_++) {
				int i_387_ = (((Class151_Sub1_Sub1) this)
					      .aByteArray11258
					      [(i_336_ >> 16) + i_385_]);
				if (i_387_ != 0)
				    is[i_345_++]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_387_ & 0xff]);
				else
				    i_345_++;
				i_336_ += i_341_;
			    }
			    i_337_ += i_342_;
			    i_336_ = i_383_;
			    i_345_ += i_346_;
			}
		    } else if (i_332_ == 0) {
			int i_388_ = i_336_;
			if ((i_333_ & 0xffffff) == 16777215) {
			    int i_389_ = i_333_ >>> 24;
			    int i_390_ = 256 - i_389_;
			    for (int i_391_ = -i_331_; i_391_ < 0; i_391_++) {
				int i_392_ = ((i_337_ >> 16)
					      * (((Class151_Sub1_Sub1) this)
						 .anInt8803));
				for (int i_393_ = -i_330_; i_393_ < 0;
				     i_393_++) {
				    int i_394_ = (((Class151_Sub1_Sub1) this)
						  .aByteArray11258
						  [(i_336_ >> 16) + i_392_]);
				    if (i_394_ != 0) {
					int i_395_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_394_ & 0xff]);
					int i_396_ = is[i_345_];
					is[i_345_++]
					    = ((((i_395_ & 0xff00ff) * i_389_
						 + ((i_396_ & 0xff00ff)
						    * i_390_))
						& ~0xff00ff)
					       + (((i_395_ & 0xff00) * i_389_
						   + ((i_396_ & 0xff00)
						      * i_390_))
						  & 0xff0000)) >> 8;
				    } else
					i_345_++;
				    i_336_ += i_341_;
				}
				i_337_ += i_342_;
				i_336_ = i_388_;
				i_345_ += i_346_;
			    }
			} else {
			    int i_397_ = (i_333_ & 0xff0000) >> 16;
			    int i_398_ = (i_333_ & 0xff00) >> 8;
			    int i_399_ = i_333_ & 0xff;
			    int i_400_ = i_333_ >>> 24;
			    int i_401_ = 256 - i_400_;
			    for (int i_402_ = -i_331_; i_402_ < 0; i_402_++) {
				int i_403_ = ((i_337_ >> 16)
					      * (((Class151_Sub1_Sub1) this)
						 .anInt8803));
				for (int i_404_ = -i_330_; i_404_ < 0;
				     i_404_++) {
				    int i_405_ = (((Class151_Sub1_Sub1) this)
						  .aByteArray11258
						  [(i_336_ >> 16) + i_403_]);
				    if (i_405_ != 0) {
					int i_406_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_405_ & 0xff]);
					if (i_400_ != 255) {
					    int i_407_
						= ((i_406_ & 0xff0000) * i_397_
						   & ~0xffffff);
					    int i_408_
						= ((i_406_ & 0xff00) * i_398_
						   & 0xff0000);
					    int i_409_
						= ((i_406_ & 0xff) * i_399_
						   & 0xff00);
					    i_406_ = (i_407_ | i_408_
						      | i_409_) >>> 8;
					    int i_410_ = is[i_345_];
					    is[i_345_++]
						= (((((i_406_ & 0xff00ff)
						      * i_400_)
						     + ((i_410_ & 0xff00ff)
							* i_401_))
						    & ~0xff00ff)
						   + ((((i_406_ & 0xff00)
							* i_400_)
						       + ((i_410_ & 0xff00)
							  * i_401_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_411_
						= ((i_406_ & 0xff0000) * i_397_
						   & ~0xffffff);
					    int i_412_
						= ((i_406_ & 0xff00) * i_398_
						   & 0xff0000);
					    int i_413_
						= ((i_406_ & 0xff) * i_399_
						   & 0xff00);
					    is[i_345_++] = (i_411_ | i_412_
							    | i_413_) >>> 8;
					}
				    } else
					i_345_++;
				    i_336_ += i_341_;
				}
				i_337_ += i_342_;
				i_336_ = i_388_;
				i_345_ += i_346_;
			    }
			}
		    } else if (i_332_ == 3) {
			int i_414_ = i_336_;
			int i_415_ = i_333_ >>> 24;
			int i_416_ = 256 - i_415_;
			for (int i_417_ = -i_331_; i_417_ < 0; i_417_++) {
			    int i_418_
				= ((i_337_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_419_ = -i_330_; i_419_ < 0; i_419_++) {
				byte i_420_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258
					       [(i_336_ >> 16) + i_418_]);
				int i_421_ = (i_420_ > 0
					      ? (((Class151_Sub1_Sub1) this)
						 .anIntArray11257[i_420_])
					      : 0);
				int i_422_ = i_421_ + i_333_;
				int i_423_ = ((i_421_ & 0xff00ff)
					      + (i_333_ & 0xff00ff));
				int i_424_ = ((i_423_ & 0x1000100)
					      + (i_422_ - i_423_ & 0x10000));
				i_424_ = i_422_ - i_424_ | i_424_ - (i_424_
								     >>> 8);
				if (i_421_ == 0 && i_415_ != 255) {
				    i_421_ = i_424_;
				    i_424_ = is[i_345_];
				    i_424_ = ((((i_421_ & 0xff00ff) * i_415_
						+ (i_424_ & 0xff00ff) * i_416_)
					       & ~0xff00ff)
					      + (((i_421_ & 0xff00) * i_415_
						  + (i_424_ & 0xff00) * i_416_)
						 & 0xff0000)) >> 8;
				}
				is[i_345_++] = i_424_;
				i_336_ += i_341_;
			    }
			    i_337_ += i_342_;
			    i_336_ = i_414_;
			    i_345_ += i_346_;
			}
		    } else if (i_332_ == 2) {
			int i_425_ = i_333_ >>> 24;
			int i_426_ = 256 - i_425_;
			int i_427_ = (i_333_ & 0xff00ff) * i_426_ & ~0xff00ff;
			int i_428_ = (i_333_ & 0xff00) * i_426_ & 0xff0000;
			i_333_ = (i_427_ | i_428_) >>> 8;
			int i_429_ = i_336_;
			for (int i_430_ = -i_331_; i_430_ < 0; i_430_++) {
			    int i_431_
				= ((i_337_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_432_ = -i_330_; i_432_ < 0; i_432_++) {
				int i_433_ = (((Class151_Sub1_Sub1) this)
					      .aByteArray11258
					      [(i_336_ >> 16) + i_431_]);
				if (i_433_ != 0) {
				    int i_434_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_433_ & 0xff]);
				    i_427_ = ((i_434_ & 0xff00ff) * i_425_
					      & ~0xff00ff);
				    i_428_ = ((i_434_ & 0xff00) * i_425_
					      & 0xff0000);
				    is[i_345_++]
					= ((i_427_ | i_428_) >>> 8) + i_333_;
				} else
				    i_345_++;
				i_336_ += i_341_;
			    }
			    i_337_ += i_342_;
			    i_336_ = i_429_;
			    i_345_ += i_346_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_334_ == 2) {
		    if (i_332_ == 1) {
			int i_435_ = i_336_;
			for (int i_436_ = -i_331_; i_436_ < 0; i_436_++) {
			    int i_437_
				= ((i_337_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_438_ = -i_330_; i_438_ < 0; i_438_++) {
				int i_439_ = (((Class151_Sub1_Sub1) this)
					      .aByteArray11258
					      [(i_336_ >> 16) + i_437_]);
				if (i_439_ != 0) {
				    int i_440_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_439_ & 0xff]);
				    int i_441_ = is[i_345_];
				    int i_442_ = i_440_ + i_441_;
				    int i_443_ = ((i_440_ & 0xff00ff)
						  + (i_441_ & 0xff00ff));
				    i_441_ = ((i_443_ & 0x1000100)
					      + (i_442_ - i_443_ & 0x10000));
				    is[i_345_++]
					= i_442_ - i_441_ | i_441_ - (i_441_
								      >>> 8);
				} else
				    i_345_++;
				i_336_ += i_341_;
			    }
			    i_337_ += i_342_;
			    i_336_ = i_435_;
			    i_345_ += i_346_;
			}
		    } else if (i_332_ == 0) {
			int i_444_ = i_336_;
			int i_445_ = (i_333_ & 0xff0000) >> 16;
			int i_446_ = (i_333_ & 0xff00) >> 8;
			int i_447_ = i_333_ & 0xff;
			for (int i_448_ = -i_331_; i_448_ < 0; i_448_++) {
			    int i_449_
				= ((i_337_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_450_ = -i_330_; i_450_ < 0; i_450_++) {
				int i_451_ = (((Class151_Sub1_Sub1) this)
					      .aByteArray11258
					      [(i_336_ >> 16) + i_449_]);
				if (i_451_ != 0) {
				    int i_452_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_451_ & 0xff]);
				    int i_453_ = ((i_452_ & 0xff0000) * i_445_
						  & ~0xffffff);
				    int i_454_ = ((i_452_ & 0xff00) * i_446_
						  & 0xff0000);
				    int i_455_
					= (i_452_ & 0xff) * i_447_ & 0xff00;
				    i_452_ = (i_453_ | i_454_ | i_455_) >>> 8;
				    int i_456_ = is[i_345_];
				    int i_457_ = i_452_ + i_456_;
				    int i_458_ = ((i_452_ & 0xff00ff)
						  + (i_456_ & 0xff00ff));
				    i_456_ = ((i_458_ & 0x1000100)
					      + (i_457_ - i_458_ & 0x10000));
				    is[i_345_++]
					= i_457_ - i_456_ | i_456_ - (i_456_
								      >>> 8);
				} else
				    i_345_++;
				i_336_ += i_341_;
			    }
			    i_337_ += i_342_;
			    i_336_ = i_444_;
			    i_345_ += i_346_;
			}
		    } else if (i_332_ == 3) {
			int i_459_ = i_336_;
			for (int i_460_ = -i_331_; i_460_ < 0; i_460_++) {
			    int i_461_
				= ((i_337_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_462_ = -i_330_; i_462_ < 0; i_462_++) {
				byte i_463_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258
					       [(i_336_ >> 16) + i_461_]);
				int i_464_ = (i_463_ > 0
					      ? (((Class151_Sub1_Sub1) this)
						 .anIntArray11257[i_463_])
					      : 0);
				int i_465_ = i_464_ + i_333_;
				int i_466_ = ((i_464_ & 0xff00ff)
					      + (i_333_ & 0xff00ff));
				int i_467_ = ((i_466_ & 0x1000100)
					      + (i_465_ - i_466_ & 0x10000));
				i_464_ = i_465_ - i_467_ | i_467_ - (i_467_
								     >>> 8);
				i_467_ = is[i_345_];
				i_465_ = i_464_ + i_467_;
				i_466_ = (i_464_ & 0xff00ff) + (i_467_
								& 0xff00ff);
				i_467_
				    = (i_466_ & 0x1000100) + (i_465_ - i_466_
							      & 0x10000);
				is[i_345_++]
				    = i_465_ - i_467_ | i_467_ - (i_467_
								  >>> 8);
				i_336_ += i_341_;
			    }
			    i_337_ += i_342_;
			    i_336_ = i_459_;
			    i_345_ += i_346_;
			}
		    } else if (i_332_ == 2) {
			int i_468_ = i_333_ >>> 24;
			int i_469_ = 256 - i_468_;
			int i_470_ = (i_333_ & 0xff00ff) * i_469_ & ~0xff00ff;
			int i_471_ = (i_333_ & 0xff00) * i_469_ & 0xff0000;
			i_333_ = (i_470_ | i_471_) >>> 8;
			int i_472_ = i_336_;
			for (int i_473_ = -i_331_; i_473_ < 0; i_473_++) {
			    int i_474_
				= ((i_337_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_475_ = -i_330_; i_475_ < 0; i_475_++) {
				int i_476_ = (((Class151_Sub1_Sub1) this)
					      .aByteArray11258
					      [(i_336_ >> 16) + i_474_]);
				if (i_476_ != 0) {
				    int i_477_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_476_ & 0xff]);
				    i_470_ = ((i_477_ & 0xff00ff) * i_468_
					      & ~0xff00ff);
				    i_471_ = ((i_477_ & 0xff00) * i_468_
					      & 0xff0000);
				    i_477_
					= ((i_470_ | i_471_) >>> 8) + i_333_;
				    int i_478_ = is[i_345_];
				    int i_479_ = i_477_ + i_478_;
				    int i_480_ = ((i_477_ & 0xff00ff)
						  + (i_478_ & 0xff00ff));
				    i_478_ = ((i_480_ & 0x1000100)
					      + (i_479_ - i_480_ & 0x10000));
				    is[i_345_++]
					= i_479_ - i_478_ | i_478_ - (i_478_
								      >>> 8);
				} else
				    i_345_++;
				i_336_ += i_341_;
			    }
			    i_337_ += i_342_;
			    i_336_ = i_472_;
			    i_345_ += i_346_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method1802(int i, int i_481_, int i_482_, int i_483_, int[] is,
			   int[] is_484_, int i_485_, int i_486_) {
	throw new IllegalStateException();
    }
    
    void method8293(int[] is, int[] is_487_, int i, int i_488_) {
	int[] is_489_ = (((Class173_Sub3)
			  ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
			 .anIntArray9719);
	if (is_489_ != null) {
	    if (anInt8822 == 0) {
		if (anInt8825 == 0) {
		    int i_490_ = anInt8816;
		    while (i_490_ < 0) {
			int i_491_ = i_490_ + i_488_;
			if (i_491_ >= 0) {
			    if (i_491_ >= is.length)
				break;
			    int i_492_ = anInt8818;
			    int i_493_ = anInt8807;
			    int i_494_ = anInt8826;
			    int i_495_ = anInt8809;
			    if (i_493_ >= 0 && i_494_ >= 0
				&& (i_493_
				    - (((Class151_Sub1_Sub1) this).anInt8803
				       << 12)) < 0
				&& (i_494_
				    - (((Class151_Sub1_Sub1) this).anInt8804
				       << 12)) < 0) {
				int i_496_ = is[i_491_] - i;
				int i_497_ = -is_487_[i_491_];
				int i_498_ = i_496_ - (i_492_ - anInt8818);
				if (i_498_ > 0) {
				    i_492_ += i_498_;
				    i_495_ += i_498_;
				    i_493_ += anInt8822 * i_498_;
				    i_494_ += anInt8825 * i_498_;
				} else
				    i_497_ -= i_498_;
				if (i_495_ < i_497_)
				    i_495_ = i_497_;
				for (/**/; i_495_ < 0; i_495_++) {
				    int i_499_
					= (((Class151_Sub1_Sub1) this)
					   .aByteArray11258
					   [(((i_494_ >> 12)
					      * (((Class151_Sub1_Sub1) this)
						 .anInt8803))
					     + (i_493_ >> 12))]);
				    if (i_499_ != 0)
					is_489_[i_492_++]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_499_ & 0xff]);
				    else
					i_492_++;
				}
			    }
			}
			i_490_++;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_500_ = anInt8816;
		    while (i_500_ < 0) {
			int i_501_ = i_500_ + i_488_;
			if (i_501_ >= 0) {
			    if (i_501_ >= is.length)
				break;
			    int i_502_ = anInt8818;
			    int i_503_ = anInt8807;
			    int i_504_ = anInt8826 + anInt8828;
			    int i_505_ = anInt8809;
			    if (i_503_ >= 0
				&& (i_503_
				    - (((Class151_Sub1_Sub1) this).anInt8803
				       << 12)) < 0) {
				int i_506_;
				if ((i_506_
				     = i_504_ - ((((Class151_Sub1_Sub1) this)
						  .anInt8804)
						 << 12))
				    >= 0) {
				    i_506_ = (anInt8825 - i_506_) / anInt8825;
				    i_505_ += i_506_;
				    i_504_ += anInt8825 * i_506_;
				    i_502_ += i_506_;
				}
				if ((i_506_ = (i_504_ - anInt8825) / anInt8825)
				    > i_505_)
				    i_505_ = i_506_;
				int i_507_ = is[i_501_] - i;
				int i_508_ = -is_487_[i_501_];
				int i_509_ = i_507_ - (i_502_ - anInt8818);
				if (i_509_ > 0) {
				    i_502_ += i_509_;
				    i_505_ += i_509_;
				    i_503_ += anInt8822 * i_509_;
				    i_504_ += anInt8825 * i_509_;
				} else
				    i_508_ -= i_509_;
				if (i_505_ < i_508_)
				    i_505_ = i_508_;
				for (/**/; i_505_ < 0; i_505_++) {
				    int i_510_
					= (((Class151_Sub1_Sub1) this)
					   .aByteArray11258
					   [(((i_504_ >> 12)
					      * (((Class151_Sub1_Sub1) this)
						 .anInt8803))
					     + (i_503_ >> 12))]);
				    if (i_510_ != 0)
					is_489_[i_502_++]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_510_ & 0xff]);
				    else
					i_502_++;
				    i_504_ += anInt8825;
				}
			    }
			}
			i_500_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_511_ = anInt8816;
		    while (i_511_ < 0) {
			int i_512_ = i_511_ + i_488_;
			if (i_512_ >= 0) {
			    if (i_512_ >= is.length)
				break;
			    int i_513_ = anInt8818;
			    int i_514_ = anInt8807;
			    int i_515_ = anInt8826 + anInt8828;
			    int i_516_ = anInt8809;
			    if (i_514_ >= 0
				&& (i_514_
				    - (((Class151_Sub1_Sub1) this).anInt8803
				       << 12)) < 0) {
				if (i_515_ < 0) {
				    int i_517_
					= (anInt8825 - 1 - i_515_) / anInt8825;
				    i_516_ += i_517_;
				    i_515_ += anInt8825 * i_517_;
				    i_513_ += i_517_;
				}
				int i_518_;
				if ((i_518_ = (1 + i_515_
					       - ((((Class151_Sub1_Sub1) this)
						   .anInt8804)
						  << 12)
					       - anInt8825) / anInt8825)
				    > i_516_)
				    i_516_ = i_518_;
				int i_519_ = is[i_512_] - i;
				int i_520_ = -is_487_[i_512_];
				int i_521_ = i_519_ - (i_513_ - anInt8818);
				if (i_521_ > 0) {
				    i_513_ += i_521_;
				    i_516_ += i_521_;
				    i_514_ += anInt8822 * i_521_;
				    i_515_ += anInt8825 * i_521_;
				} else
				    i_520_ -= i_521_;
				if (i_516_ < i_520_)
				    i_516_ = i_520_;
				for (/**/; i_516_ < 0; i_516_++) {
				    int i_522_
					= (((Class151_Sub1_Sub1) this)
					   .aByteArray11258
					   [(((i_515_ >> 12)
					      * (((Class151_Sub1_Sub1) this)
						 .anInt8803))
					     + (i_514_ >> 12))]);
				    if (i_522_ != 0)
					is_489_[i_513_++]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_522_ & 0xff]);
				    else
					i_513_++;
				    i_515_ += anInt8825;
				}
			    }
			}
			i_511_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8822 < 0) {
		if (anInt8825 == 0) {
		    int i_523_ = anInt8816;
		    while (i_523_ < 0) {
			int i_524_ = i_523_ + i_488_;
			if (i_524_ >= 0) {
			    if (i_524_ >= is.length)
				break;
			    int i_525_ = anInt8818;
			    int i_526_ = anInt8807 + anInt8805;
			    int i_527_ = anInt8826;
			    int i_528_ = anInt8809;
			    if (i_527_ >= 0
				&& (i_527_
				    - (((Class151_Sub1_Sub1) this).anInt8804
				       << 12)) < 0) {
				int i_529_;
				if ((i_529_
				     = i_526_ - ((((Class151_Sub1_Sub1) this)
						  .anInt8803)
						 << 12))
				    >= 0) {
				    i_529_ = (anInt8822 - i_529_) / anInt8822;
				    i_528_ += i_529_;
				    i_526_ += anInt8822 * i_529_;
				    i_525_ += i_529_;
				}
				if ((i_529_ = (i_526_ - anInt8822) / anInt8822)
				    > i_528_)
				    i_528_ = i_529_;
				int i_530_ = is[i_524_] - i;
				int i_531_ = -is_487_[i_524_];
				int i_532_ = i_530_ - (i_525_ - anInt8818);
				if (i_532_ > 0) {
				    i_525_ += i_532_;
				    i_528_ += i_532_;
				    i_526_ += anInt8822 * i_532_;
				    i_527_ += anInt8825 * i_532_;
				} else
				    i_531_ -= i_532_;
				if (i_528_ < i_531_)
				    i_528_ = i_531_;
				for (/**/; i_528_ < 0; i_528_++) {
				    int i_533_
					= (((Class151_Sub1_Sub1) this)
					   .aByteArray11258
					   [(((i_527_ >> 12)
					      * (((Class151_Sub1_Sub1) this)
						 .anInt8803))
					     + (i_526_ >> 12))]);
				    if (i_533_ != 0)
					is_489_[i_525_++]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_533_ & 0xff]);
				    else
					i_525_++;
				    i_526_ += anInt8822;
				}
			    }
			}
			i_523_++;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_534_ = anInt8816;
		    while (i_534_ < 0) {
			int i_535_ = i_534_ + i_488_;
			if (i_535_ >= 0) {
			    if (i_535_ >= is.length)
				break;
			    int i_536_ = anInt8818;
			    int i_537_ = anInt8807 + anInt8805;
			    int i_538_ = anInt8826 + anInt8828;
			    int i_539_ = anInt8809;
			    int i_540_;
			    if ((i_540_
				 = (i_537_
				    - (((Class151_Sub1_Sub1) this).anInt8803
				       << 12)))
				>= 0) {
				i_540_ = (anInt8822 - i_540_) / anInt8822;
				i_539_ += i_540_;
				i_537_ += anInt8822 * i_540_;
				i_538_ += anInt8825 * i_540_;
				i_536_ += i_540_;
			    }
			    if ((i_540_ = (i_537_ - anInt8822) / anInt8822)
				> i_539_)
				i_539_ = i_540_;
			    if ((i_540_
				 = (i_538_
				    - (((Class151_Sub1_Sub1) this).anInt8804
				       << 12)))
				>= 0) {
				i_540_ = (anInt8825 - i_540_) / anInt8825;
				i_539_ += i_540_;
				i_537_ += anInt8822 * i_540_;
				i_538_ += anInt8825 * i_540_;
				i_536_ += i_540_;
			    }
			    if ((i_540_ = (i_538_ - anInt8825) / anInt8825)
				> i_539_)
				i_539_ = i_540_;
			    int i_541_ = is[i_535_] - i;
			    int i_542_ = -is_487_[i_535_];
			    int i_543_ = i_541_ - (i_536_ - anInt8818);
			    if (i_543_ > 0) {
				i_536_ += i_543_;
				i_539_ += i_543_;
				i_537_ += anInt8822 * i_543_;
				i_538_ += anInt8825 * i_543_;
			    } else
				i_542_ -= i_543_;
			    if (i_539_ < i_542_)
				i_539_ = i_542_;
			    for (/**/; i_539_ < 0; i_539_++) {
				int i_544_
				    = (((Class151_Sub1_Sub1) this)
				       .aByteArray11258
				       [((i_538_ >> 12) * ((Class151_Sub1_Sub1)
							   this).anInt8803
					 + (i_537_ >> 12))]);
				if (i_544_ != 0)
				    is_489_[i_536_++]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_544_ & 0xff]);
				else
				    i_536_++;
				i_537_ += anInt8822;
				i_538_ += anInt8825;
			    }
			}
			i_534_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_545_ = anInt8816;
		    while (i_545_ < 0) {
			int i_546_ = i_545_ + i_488_;
			if (i_546_ >= 0) {
			    if (i_546_ >= is.length)
				break;
			    int i_547_ = anInt8818;
			    int i_548_ = anInt8807 + anInt8805;
			    int i_549_ = anInt8826 + anInt8828;
			    int i_550_ = anInt8809;
			    int i_551_;
			    if ((i_551_
				 = (i_548_
				    - (((Class151_Sub1_Sub1) this).anInt8803
				       << 12)))
				>= 0) {
				i_551_ = (anInt8822 - i_551_) / anInt8822;
				i_550_ += i_551_;
				i_548_ += anInt8822 * i_551_;
				i_549_ += anInt8825 * i_551_;
				i_547_ += i_551_;
			    }
			    if ((i_551_ = (i_548_ - anInt8822) / anInt8822)
				> i_550_)
				i_550_ = i_551_;
			    if (i_549_ < 0) {
				i_551_ = (anInt8825 - 1 - i_549_) / anInt8825;
				i_550_ += i_551_;
				i_548_ += anInt8822 * i_551_;
				i_549_ += anInt8825 * i_551_;
				i_547_ += i_551_;
			    }
			    if ((i_551_
				 = (1 + i_549_
				    - (((Class151_Sub1_Sub1) this).anInt8804
				       << 12)
				    - anInt8825) / anInt8825)
				> i_550_)
				i_550_ = i_551_;
			    int i_552_ = is[i_546_] - i;
			    int i_553_ = -is_487_[i_546_];
			    int i_554_ = i_552_ - (i_547_ - anInt8818);
			    if (i_554_ > 0) {
				i_547_ += i_554_;
				i_550_ += i_554_;
				i_548_ += anInt8822 * i_554_;
				i_549_ += anInt8825 * i_554_;
			    } else
				i_553_ -= i_554_;
			    if (i_550_ < i_553_)
				i_550_ = i_553_;
			    for (/**/; i_550_ < 0; i_550_++) {
				int i_555_
				    = (((Class151_Sub1_Sub1) this)
				       .aByteArray11258
				       [((i_549_ >> 12) * ((Class151_Sub1_Sub1)
							   this).anInt8803
					 + (i_548_ >> 12))]);
				if (i_555_ != 0)
				    is_489_[i_547_++]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_555_ & 0xff]);
				else
				    i_547_++;
				i_548_ += anInt8822;
				i_549_ += anInt8825;
			    }
			}
			i_545_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8825 == 0) {
		int i_556_ = anInt8816;
		while (i_556_ < 0) {
		    int i_557_ = i_556_ + i_488_;
		    if (i_557_ >= 0) {
			if (i_557_ >= is.length)
			    break;
			int i_558_ = anInt8818;
			int i_559_ = anInt8807 + anInt8805;
			int i_560_ = anInt8826;
			int i_561_ = anInt8809;
			if (i_560_ >= 0
			    && i_560_ - (((Class151_Sub1_Sub1) this).anInt8804
					 << 12) < 0) {
			    if (i_559_ < 0) {
				int i_562_
				    = (anInt8822 - 1 - i_559_) / anInt8822;
				i_561_ += i_562_;
				i_559_ += anInt8822 * i_562_;
				i_558_ += i_562_;
			    }
			    int i_563_;
			    if ((i_563_
				 = (1 + i_559_
				    - (((Class151_Sub1_Sub1) this).anInt8803
				       << 12)
				    - anInt8822) / anInt8822)
				> i_561_)
				i_561_ = i_563_;
			    int i_564_ = is[i_557_] - i;
			    int i_565_ = -is_487_[i_557_];
			    int i_566_ = i_564_ - (i_558_ - anInt8818);
			    if (i_566_ > 0) {
				i_558_ += i_566_;
				i_561_ += i_566_;
				i_559_ += anInt8822 * i_566_;
				i_560_ += anInt8825 * i_566_;
			    } else
				i_565_ -= i_566_;
			    if (i_561_ < i_565_)
				i_561_ = i_565_;
			    for (/**/; i_561_ < 0; i_561_++) {
				int i_567_
				    = (((Class151_Sub1_Sub1) this)
				       .aByteArray11258
				       [((i_560_ >> 12) * ((Class151_Sub1_Sub1)
							   this).anInt8803
					 + (i_559_ >> 12))]);
				if (i_567_ != 0)
				    is_489_[i_558_++]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_567_ & 0xff]);
				else
				    i_558_++;
				i_559_ += anInt8822;
			    }
			}
		    }
		    i_556_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else if (anInt8825 < 0) {
		int i_568_ = anInt8816;
		while (i_568_ < 0) {
		    int i_569_ = i_568_ + i_488_;
		    if (i_569_ >= 0) {
			if (i_569_ >= is.length)
			    break;
			int i_570_ = anInt8818;
			int i_571_ = anInt8807 + anInt8805;
			int i_572_ = anInt8826 + anInt8828;
			int i_573_ = anInt8809;
			if (i_571_ < 0) {
			    int i_574_ = (anInt8822 - 1 - i_571_) / anInt8822;
			    i_573_ += i_574_;
			    i_571_ += anInt8822 * i_574_;
			    i_572_ += anInt8825 * i_574_;
			    i_570_ += i_574_;
			}
			int i_575_;
			if ((i_575_
			     = (1 + i_571_
				- (((Class151_Sub1_Sub1) this).anInt8803 << 12)
				- anInt8822) / anInt8822)
			    > i_573_)
			    i_573_ = i_575_;
			if ((i_575_
			     = i_572_ - (((Class151_Sub1_Sub1) this).anInt8804
					 << 12))
			    >= 0) {
			    i_575_ = (anInt8825 - i_575_) / anInt8825;
			    i_573_ += i_575_;
			    i_571_ += anInt8822 * i_575_;
			    i_572_ += anInt8825 * i_575_;
			    i_570_ += i_575_;
			}
			if ((i_575_ = (i_572_ - anInt8825) / anInt8825)
			    > i_573_)
			    i_573_ = i_575_;
			int i_576_ = is[i_569_] - i;
			int i_577_ = -is_487_[i_569_];
			int i_578_ = i_576_ - (i_570_ - anInt8818);
			if (i_578_ > 0) {
			    i_570_ += i_578_;
			    i_573_ += i_578_;
			    i_571_ += anInt8822 * i_578_;
			    i_572_ += anInt8825 * i_578_;
			} else
			    i_577_ -= i_578_;
			if (i_573_ < i_577_)
			    i_573_ = i_577_;
			for (/**/; i_573_ < 0; i_573_++) {
			    int i_579_
				= (((Class151_Sub1_Sub1) this).aByteArray11258
				   [(((i_572_ >> 12)
				      * ((Class151_Sub1_Sub1) this).anInt8803)
				     + (i_571_ >> 12))]);
			    if (i_579_ != 0)
				is_489_[i_570_++]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257[i_579_ & 0xff]);
			    else
				i_570_++;
			    i_571_ += anInt8822;
			    i_572_ += anInt8825;
			}
		    }
		    i_568_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else {
		int i_580_ = anInt8816;
		while (i_580_ < 0) {
		    int i_581_ = i_580_ + i_488_;
		    if (i_581_ >= 0) {
			if (i_581_ >= is.length)
			    break;
			int i_582_ = anInt8818;
			int i_583_ = anInt8807 + anInt8805;
			int i_584_ = anInt8826 + anInt8828;
			int i_585_ = anInt8809;
			if (i_583_ < 0) {
			    int i_586_ = (anInt8822 - 1 - i_583_) / anInt8822;
			    i_585_ += i_586_;
			    i_583_ += anInt8822 * i_586_;
			    i_584_ += anInt8825 * i_586_;
			    i_582_ += i_586_;
			}
			int i_587_;
			if ((i_587_
			     = (1 + i_583_
				- (((Class151_Sub1_Sub1) this).anInt8803 << 12)
				- anInt8822) / anInt8822)
			    > i_585_)
			    i_585_ = i_587_;
			if (i_584_ < 0) {
			    i_587_ = (anInt8825 - 1 - i_584_) / anInt8825;
			    i_585_ += i_587_;
			    i_583_ += anInt8822 * i_587_;
			    i_584_ += anInt8825 * i_587_;
			    i_582_ += i_587_;
			}
			if ((i_587_
			     = (1 + i_584_
				- (((Class151_Sub1_Sub1) this).anInt8804 << 12)
				- anInt8825) / anInt8825)
			    > i_585_)
			    i_585_ = i_587_;
			int i_588_ = is[i_581_] - i;
			int i_589_ = -is_487_[i_581_];
			int i_590_ = i_588_ - (i_582_ - anInt8818);
			if (i_590_ > 0) {
			    i_582_ += i_590_;
			    i_585_ += i_590_;
			    i_583_ += anInt8822 * i_590_;
			    i_584_ += anInt8825 * i_590_;
			} else
			    i_589_ -= i_590_;
			if (i_585_ < i_589_)
			    i_585_ = i_589_;
			for (/**/; i_585_ < 0; i_585_++) {
			    int i_591_
				= (((Class151_Sub1_Sub1) this).aByteArray11258
				   [(((i_584_ >> 12)
				      * ((Class151_Sub1_Sub1) this).anInt8803)
				     + (i_583_ >> 12))]);
			    if (i_591_ != 0)
				is_489_[i_582_++]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257[i_591_ & 0xff]);
			    else
				i_582_++;
			    i_583_ += anInt8822;
			    i_584_ += anInt8825;
			}
		    }
		    i_580_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    }
	}
    }
    
    public void method1788(int i, int i_592_, int i_593_, int i_594_, int[] is,
			   int i_595_, int i_596_) {
	throw new IllegalStateException();
    }
    
    public void method1789(int i, int i_597_, int i_598_, int i_599_, int[] is,
			   int i_600_, int i_601_) {
	throw new IllegalStateException();
    }
    
    public void method1790(int i, int i_602_, int i_603_, int i_604_, int[] is,
			   int i_605_, int i_606_) {
	throw new IllegalStateException();
    }
    
    Class151_Sub1_Sub1(Class173_Sub3 class173_sub3, byte[] is, int[] is_607_,
		       int i, int i_608_) {
	super(class173_sub3, i, i_608_);
	((Class151_Sub1_Sub1) this).aByteArray11258 = is;
	((Class151_Sub1_Sub1) this).anIntArray11257 = is_607_;
    }
    
    public Interface19 method1800() {
	throw new IllegalStateException();
    }
    
    void method8296(int i, int i_609_) {
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    if (anInt8822 == 0) {
		if (anInt8825 == 0) {
		    int i_610_ = anInt8816;
		    while (i_610_ < 0) {
			int i_611_ = anInt8818;
			int i_612_ = anInt8807;
			int i_613_ = anInt8826;
			int i_614_ = anInt8809;
			if (i_612_ >= 0 && i_613_ >= 0
			    && i_612_ - (((Class151_Sub1_Sub1) this).anInt8803
					 << 12) < 0
			    && i_613_ - (((Class151_Sub1_Sub1) this).anInt8804
					 << 12) < 0) {
			    for (/**/; i_614_ < 0; i_614_++) {
				int i_615_
				    = ((i_613_ >> 12) * ((Class151_Sub1_Sub1)
							 this).anInt8803
				       + (i_612_ >> 12));
				int i_616_ = i_611_++;
				if (i_609_ == 0) {
				    if (i == 1)
					is[i_616_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_615_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_617_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_615_])
						 & 0xff)]);
					int i_618_
					    = ((i_617_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_619_
					    = ((i_617_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_620_
					    = ((i_617_ & 0xff) * anInt8836
					       & 0xff00);
					is[i_616_]
					    = (i_618_ | i_619_ | i_620_) >>> 8;
				    } else if (i == 3) {
					int i_621_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_615_])
						 & 0xff)]);
					int i_622_ = anInt8829;
					int i_623_ = i_621_ + i_622_;
					int i_624_ = ((i_621_ & 0xff00ff)
						      + (i_622_ & 0xff00ff));
					int i_625_
					    = ((i_624_ & 0x1000100)
					       + (i_623_ - i_624_ & 0x10000));
					is[i_616_]
					    = (i_623_ - i_625_
					       | i_625_ - (i_625_ >>> 8));
				    } else if (i == 2) {
					int i_626_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_615_])
						 & 0xff)]);
					int i_627_
					    = ((i_626_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_628_
					    = ((i_626_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_616_] = (((i_627_ | i_628_) >>> 8)
						      + anInt8834);
				    } else
					throw new IllegalArgumentException();
				} else if (i_609_ == 1) {
				    if (i == 1) {
					int i_629_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_615_]);
					if (i_629_ != 0)
					    is[i_616_]
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_629_ & 0xff]);
				    } else if (i == 0) {
					int i_630_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_615_]);
					if (i_630_ != 0) {
					    int i_631_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_630_ & 0xff]);
					    if ((anInt8829 & 0xffffff)
						== 16777215) {
						int i_632_ = anInt8829 >>> 24;
						int i_633_ = 256 - i_632_;
						int i_634_ = is[i_616_];
						is[i_616_]
						    = (((((i_631_ & 0xff00ff)
							  * i_632_)
							 + ((i_634_ & 0xff00ff)
							    * i_633_))
							& ~0xff00ff)
						       + ((((i_631_ & 0xff00)
							    * i_632_)
							   + ((i_634_ & 0xff00)
							      * i_633_))
							  & 0xff0000)) >> 8;
					    } else if (anInt8830 != 255) {
						int i_635_
						    = (((i_631_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_636_
						    = (((i_631_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_637_ = (((i_631_ & 0xff)
							       * anInt8836)
							      & 0xff00);
						i_631_ = (i_635_ | i_636_
							  | i_637_) >>> 8;
						int i_638_ = is[i_616_];
						is[i_616_]
						    = (((((i_631_ & 0xff00ff)
							  * anInt8830)
							 + ((i_638_ & 0xff00ff)
							    * anInt8831))
							& ~0xff00ff)
						       + ((((i_631_ & 0xff00)
							    * anInt8830)
							   + ((i_638_ & 0xff00)
							      * anInt8831))
							  & 0xff0000)) >> 8;
					    } else {
						int i_639_
						    = (((i_631_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_640_
						    = (((i_631_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_641_ = (((i_631_ & 0xff)
							       * anInt8836)
							      & 0xff00);
						is[i_616_] = (i_639_ | i_640_
							      | i_641_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_642_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_615_]);
					int i_643_
					    = (i_642_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_642_])
					       : 0);
					int i_644_ = anInt8829;
					int i_645_ = i_643_ + i_644_;
					int i_646_ = ((i_643_ & 0xff00ff)
						      + (i_644_ & 0xff00ff));
					int i_647_
					    = ((i_646_ & 0x1000100)
					       + (i_645_ - i_646_ & 0x10000));
					i_647_ = (i_645_ - i_647_
						  | i_647_ - (i_647_ >>> 8));
					if (i_643_ == 0 && anInt8830 != 255) {
					    i_643_ = i_647_;
					    i_647_ = is[i_616_];
					    i_647_ = (((((i_643_ & 0xff00ff)
							 * anInt8830)
							+ ((i_647_ & 0xff00ff)
							   * anInt8831))
						       & ~0xff00ff)
						      + ((((i_643_ & 0xff00)
							   * anInt8830)
							  + ((i_647_ & 0xff00)
							     * anInt8831))
							 & 0xff0000)) >> 8;
					}
					is[i_616_] = i_647_;
				    } else if (i == 2) {
					int i_648_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_615_]);
					if (i_648_ != 0) {
					    int i_649_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_648_ & 0xff]);
					    int i_650_ = (((i_649_ & 0xff00ff)
							   * anInt8830)
							  & ~0xff00ff);
					    int i_651_ = (((i_649_ & 0xff00)
							   * anInt8830)
							  & 0xff0000);
					    is[i_616_++] = ((i_650_ | i_651_)
							    >>> 8) + anInt8834;
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_609_ == 2) {
				    if (i == 1) {
					int i_652_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_615_]);
					if (i_652_ != 0) {
					    int i_653_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_652_ & 0xff]);
					    int i_654_ = is[i_616_];
					    int i_655_ = i_653_ + i_654_;
					    int i_656_
						= ((i_653_ & 0xff00ff)
						   + (i_654_ & 0xff00ff));
					    i_654_ = ((i_656_ & 0x1000100)
						      + (i_655_ - i_656_
							 & 0x10000));
					    is[i_616_]
						= (i_655_ - i_654_
						   | i_654_ - (i_654_ >>> 8));
					}
				    } else if (i == 0) {
					int i_657_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_615_]);
					if (i_657_ != 0) {
					    int i_658_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_657_ & 0xff]);
					    int i_659_ = (((i_658_ & 0xff0000)
							   * anInt8815)
							  & ~0xffffff);
					    int i_660_ = (((i_658_ & 0xff00)
							   * anInt8833)
							  & 0xff0000);
					    int i_661_
						= ((i_658_ & 0xff) * anInt8836
						   & 0xff00);
					    i_658_ = (i_659_ | i_660_
						      | i_661_) >>> 8;
					    int i_662_ = is[i_616_];
					    int i_663_ = i_658_ + i_662_;
					    int i_664_
						= ((i_658_ & 0xff00ff)
						   + (i_662_ & 0xff00ff));
					    i_662_ = ((i_664_ & 0x1000100)
						      + (i_663_ - i_664_
							 & 0x10000));
					    is[i_616_]
						= (i_663_ - i_662_
						   | i_662_ - (i_662_ >>> 8));
					}
				    } else if (i == 3) {
					byte i_665_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_615_]);
					int i_666_
					    = (i_665_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_665_])
					       : 0);
					int i_667_ = anInt8829;
					int i_668_ = i_666_ + i_667_;
					int i_669_ = ((i_666_ & 0xff00ff)
						      + (i_667_ & 0xff00ff));
					int i_670_
					    = ((i_669_ & 0x1000100)
					       + (i_668_ - i_669_ & 0x10000));
					i_670_ = (i_668_ - i_670_
						  | i_670_ - (i_670_ >>> 8));
					if (i_666_ == 0 && anInt8830 != 255) {
					    i_666_ = i_670_;
					    i_670_ = is[i_616_];
					    i_670_ = (((((i_666_ & 0xff00ff)
							 * anInt8830)
							+ ((i_670_ & 0xff00ff)
							   * anInt8831))
						       & ~0xff00ff)
						      + ((((i_666_ & 0xff00)
							   * anInt8830)
							  + ((i_670_ & 0xff00)
							     * anInt8831))
							 & 0xff0000)) >> 8;
					}
					is[i_616_] = i_670_;
				    } else if (i == 2) {
					int i_671_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_615_]);
					if (i_671_ != 0) {
					    int i_672_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_671_ & 0xff]);
					    int i_673_ = (((i_672_ & 0xff00ff)
							   * anInt8830)
							  & ~0xff00ff);
					    int i_674_ = (((i_672_ & 0xff00)
							   * anInt8830)
							  & 0xff0000);
					    i_672_ = (((i_673_ | i_674_) >>> 8)
						      + anInt8834);
					    int i_675_ = is[i_616_];
					    int i_676_ = i_672_ + i_675_;
					    int i_677_
						= ((i_672_ & 0xff00ff)
						   + (i_675_ & 0xff00ff));
					    i_675_ = ((i_677_ & 0x1000100)
						      + (i_676_ - i_677_
							 & 0x10000));
					    is[i_616_]
						= (i_676_ - i_675_
						   | i_675_ - (i_675_ >>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
			    }
			}
			i_610_++;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_678_ = anInt8816;
		    while (i_678_ < 0) {
			int i_679_ = anInt8818;
			int i_680_ = anInt8807;
			int i_681_ = anInt8826 + anInt8828;
			int i_682_ = anInt8809;
			if (i_680_ >= 0
			    && i_680_ - (((Class151_Sub1_Sub1) this).anInt8803
					 << 12) < 0) {
			    int i_683_;
			    if ((i_683_
				 = (i_681_
				    - (((Class151_Sub1_Sub1) this).anInt8804
				       << 12)))
				>= 0) {
				i_683_ = (anInt8825 - i_683_) / anInt8825;
				i_682_ += i_683_;
				i_681_ += anInt8825 * i_683_;
				i_679_ += i_683_;
			    }
			    if ((i_683_ = (i_681_ - anInt8825) / anInt8825)
				> i_682_)
				i_682_ = i_683_;
			    for (/**/; i_682_ < 0; i_682_++) {
				int i_684_
				    = ((i_681_ >> 12) * ((Class151_Sub1_Sub1)
							 this).anInt8803
				       + (i_680_ >> 12));
				int i_685_ = i_679_++;
				if (i_609_ == 0) {
				    if (i == 1)
					is[i_685_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_684_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_686_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_684_])
						 & 0xff)]);
					int i_687_
					    = ((i_686_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_688_
					    = ((i_686_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_689_
					    = ((i_686_ & 0xff) * anInt8836
					       & 0xff00);
					is[i_685_]
					    = (i_687_ | i_688_ | i_689_) >>> 8;
				    } else if (i == 3) {
					int i_690_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_684_])
						 & 0xff)]);
					int i_691_ = anInt8829;
					int i_692_ = i_690_ + i_691_;
					int i_693_ = ((i_690_ & 0xff00ff)
						      + (i_691_ & 0xff00ff));
					int i_694_
					    = ((i_693_ & 0x1000100)
					       + (i_692_ - i_693_ & 0x10000));
					is[i_685_]
					    = (i_692_ - i_694_
					       | i_694_ - (i_694_ >>> 8));
				    } else if (i == 2) {
					int i_695_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_684_])
						 & 0xff)]);
					int i_696_
					    = ((i_695_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_697_
					    = ((i_695_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_685_] = (((i_696_ | i_697_) >>> 8)
						      + anInt8834);
				    } else
					throw new IllegalArgumentException();
				} else if (i_609_ == 1) {
				    if (i == 1) {
					int i_698_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_684_]);
					if (i_698_ != 0)
					    is[i_685_]
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_698_ & 0xff]);
				    } else if (i == 0) {
					int i_699_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_684_]);
					if (i_699_ != 0) {
					    int i_700_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_699_ & 0xff]);
					    if ((anInt8829 & 0xffffff)
						== 16777215) {
						int i_701_ = anInt8829 >>> 24;
						int i_702_ = 256 - i_701_;
						int i_703_ = is[i_685_];
						is[i_685_]
						    = (((((i_700_ & 0xff00ff)
							  * i_701_)
							 + ((i_703_ & 0xff00ff)
							    * i_702_))
							& ~0xff00ff)
						       + ((((i_700_ & 0xff00)
							    * i_701_)
							   + ((i_703_ & 0xff00)
							      * i_702_))
							  & 0xff0000)) >> 8;
					    } else if (anInt8830 != 255) {
						int i_704_
						    = (((i_700_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_705_
						    = (((i_700_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_706_ = (((i_700_ & 0xff)
							       * anInt8836)
							      & 0xff00);
						i_700_ = (i_704_ | i_705_
							  | i_706_) >>> 8;
						int i_707_ = is[i_685_];
						is[i_685_]
						    = (((((i_700_ & 0xff00ff)
							  * anInt8830)
							 + ((i_707_ & 0xff00ff)
							    * anInt8831))
							& ~0xff00ff)
						       + ((((i_700_ & 0xff00)
							    * anInt8830)
							   + ((i_707_ & 0xff00)
							      * anInt8831))
							  & 0xff0000)) >> 8;
					    } else {
						int i_708_
						    = (((i_700_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_709_
						    = (((i_700_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_710_ = (((i_700_ & 0xff)
							       * anInt8836)
							      & 0xff00);
						is[i_685_] = (i_708_ | i_709_
							      | i_710_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_711_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_684_]);
					int i_712_
					    = (i_711_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_711_])
					       : 0);
					int i_713_ = anInt8829;
					int i_714_ = i_712_ + i_713_;
					int i_715_ = ((i_712_ & 0xff00ff)
						      + (i_713_ & 0xff00ff));
					int i_716_
					    = ((i_715_ & 0x1000100)
					       + (i_714_ - i_715_ & 0x10000));
					i_716_ = (i_714_ - i_716_
						  | i_716_ - (i_716_ >>> 8));
					if (i_712_ == 0 && anInt8830 != 255) {
					    i_712_ = i_716_;
					    i_716_ = is[i_685_];
					    i_716_ = (((((i_712_ & 0xff00ff)
							 * anInt8830)
							+ ((i_716_ & 0xff00ff)
							   * anInt8831))
						       & ~0xff00ff)
						      + ((((i_712_ & 0xff00)
							   * anInt8830)
							  + ((i_716_ & 0xff00)
							     * anInt8831))
							 & 0xff0000)) >> 8;
					}
					is[i_685_] = i_716_;
				    } else if (i == 2) {
					int i_717_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_684_]);
					if (i_717_ != 0) {
					    int i_718_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_717_ & 0xff]);
					    int i_719_ = (((i_718_ & 0xff00ff)
							   * anInt8830)
							  & ~0xff00ff);
					    int i_720_ = (((i_718_ & 0xff00)
							   * anInt8830)
							  & 0xff0000);
					    is[i_685_++] = ((i_719_ | i_720_)
							    >>> 8) + anInt8834;
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_609_ == 2) {
				    if (i == 1) {
					int i_721_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_684_]);
					if (i_721_ != 0) {
					    int i_722_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_721_ & 0xff]);
					    int i_723_ = is[i_685_];
					    int i_724_ = i_722_ + i_723_;
					    int i_725_
						= ((i_722_ & 0xff00ff)
						   + (i_723_ & 0xff00ff));
					    i_723_ = ((i_725_ & 0x1000100)
						      + (i_724_ - i_725_
							 & 0x10000));
					    is[i_685_]
						= (i_724_ - i_723_
						   | i_723_ - (i_723_ >>> 8));
					}
				    } else if (i == 0) {
					int i_726_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_684_]);
					if (i_726_ != 0) {
					    int i_727_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_726_ & 0xff]);
					    int i_728_ = (((i_727_ & 0xff0000)
							   * anInt8815)
							  & ~0xffffff);
					    int i_729_ = (((i_727_ & 0xff00)
							   * anInt8833)
							  & 0xff0000);
					    int i_730_
						= ((i_727_ & 0xff) * anInt8836
						   & 0xff00);
					    i_727_ = (i_728_ | i_729_
						      | i_730_) >>> 8;
					    int i_731_ = is[i_685_];
					    int i_732_ = i_727_ + i_731_;
					    int i_733_
						= ((i_727_ & 0xff00ff)
						   + (i_731_ & 0xff00ff));
					    i_731_ = ((i_733_ & 0x1000100)
						      + (i_732_ - i_733_
							 & 0x10000));
					    is[i_685_]
						= (i_732_ - i_731_
						   | i_731_ - (i_731_ >>> 8));
					}
				    } else if (i == 3) {
					byte i_734_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_684_]);
					int i_735_
					    = (i_734_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_734_])
					       : 0);
					int i_736_ = anInt8829;
					int i_737_ = i_735_ + i_736_;
					int i_738_ = ((i_735_ & 0xff00ff)
						      + (i_736_ & 0xff00ff));
					int i_739_
					    = ((i_738_ & 0x1000100)
					       + (i_737_ - i_738_ & 0x10000));
					i_739_ = (i_737_ - i_739_
						  | i_739_ - (i_739_ >>> 8));
					if (i_735_ == 0 && anInt8830 != 255) {
					    i_735_ = i_739_;
					    i_739_ = is[i_685_];
					    i_739_ = (((((i_735_ & 0xff00ff)
							 * anInt8830)
							+ ((i_739_ & 0xff00ff)
							   * anInt8831))
						       & ~0xff00ff)
						      + ((((i_735_ & 0xff00)
							   * anInt8830)
							  + ((i_739_ & 0xff00)
							     * anInt8831))
							 & 0xff0000)) >> 8;
					}
					is[i_685_] = i_739_;
				    } else if (i == 2) {
					int i_740_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_684_]);
					if (i_740_ != 0) {
					    int i_741_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_740_ & 0xff]);
					    int i_742_ = (((i_741_ & 0xff00ff)
							   * anInt8830)
							  & ~0xff00ff);
					    int i_743_ = (((i_741_ & 0xff00)
							   * anInt8830)
							  & 0xff0000);
					    i_741_ = (((i_742_ | i_743_) >>> 8)
						      + anInt8834);
					    int i_744_ = is[i_685_];
					    int i_745_ = i_741_ + i_744_;
					    int i_746_
						= ((i_741_ & 0xff00ff)
						   + (i_744_ & 0xff00ff));
					    i_744_ = ((i_746_ & 0x1000100)
						      + (i_745_ - i_746_
							 & 0x10000));
					    is[i_685_]
						= (i_745_ - i_744_
						   | i_744_ - (i_744_ >>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_681_ += anInt8825;
			    }
			}
			i_678_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_747_ = anInt8816;
		    while (i_747_ < 0) {
			int i_748_ = anInt8818;
			int i_749_ = anInt8807;
			int i_750_ = anInt8826 + anInt8828;
			int i_751_ = anInt8809;
			if (i_749_ >= 0
			    && i_749_ - (((Class151_Sub1_Sub1) this).anInt8803
					 << 12) < 0) {
			    if (i_750_ < 0) {
				int i_752_
				    = (anInt8825 - 1 - i_750_) / anInt8825;
				i_751_ += i_752_;
				i_750_ += anInt8825 * i_752_;
				i_748_ += i_752_;
			    }
			    int i_753_;
			    if ((i_753_
				 = (1 + i_750_
				    - (((Class151_Sub1_Sub1) this).anInt8804
				       << 12)
				    - anInt8825) / anInt8825)
				> i_751_)
				i_751_ = i_753_;
			    for (/**/; i_751_ < 0; i_751_++) {
				int i_754_
				    = ((i_750_ >> 12) * ((Class151_Sub1_Sub1)
							 this).anInt8803
				       + (i_749_ >> 12));
				int i_755_ = i_748_++;
				if (i_609_ == 0) {
				    if (i == 1)
					is[i_755_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_754_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_756_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_754_])
						 & 0xff)]);
					int i_757_
					    = ((i_756_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_758_
					    = ((i_756_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_759_
					    = ((i_756_ & 0xff) * anInt8836
					       & 0xff00);
					is[i_755_]
					    = (i_757_ | i_758_ | i_759_) >>> 8;
				    } else if (i == 3) {
					int i_760_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_754_])
						 & 0xff)]);
					int i_761_ = anInt8829;
					int i_762_ = i_760_ + i_761_;
					int i_763_ = ((i_760_ & 0xff00ff)
						      + (i_761_ & 0xff00ff));
					int i_764_
					    = ((i_763_ & 0x1000100)
					       + (i_762_ - i_763_ & 0x10000));
					is[i_755_]
					    = (i_762_ - i_764_
					       | i_764_ - (i_764_ >>> 8));
				    } else if (i == 2) {
					int i_765_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_754_])
						 & 0xff)]);
					int i_766_
					    = ((i_765_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_767_
					    = ((i_765_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_755_] = (((i_766_ | i_767_) >>> 8)
						      + anInt8834);
				    } else
					throw new IllegalArgumentException();
				} else if (i_609_ == 1) {
				    if (i == 1) {
					int i_768_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_754_]);
					if (i_768_ != 0)
					    is[i_755_]
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_768_ & 0xff]);
				    } else if (i == 0) {
					int i_769_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_754_]);
					if (i_769_ != 0) {
					    int i_770_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_769_ & 0xff]);
					    if ((anInt8829 & 0xffffff)
						== 16777215) {
						int i_771_ = anInt8829 >>> 24;
						int i_772_ = 256 - i_771_;
						int i_773_ = is[i_755_];
						is[i_755_]
						    = (((((i_770_ & 0xff00ff)
							  * i_771_)
							 + ((i_773_ & 0xff00ff)
							    * i_772_))
							& ~0xff00ff)
						       + ((((i_770_ & 0xff00)
							    * i_771_)
							   + ((i_773_ & 0xff00)
							      * i_772_))
							  & 0xff0000)) >> 8;
					    } else if (anInt8830 != 255) {
						int i_774_
						    = (((i_770_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_775_
						    = (((i_770_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_776_ = (((i_770_ & 0xff)
							       * anInt8836)
							      & 0xff00);
						i_770_ = (i_774_ | i_775_
							  | i_776_) >>> 8;
						int i_777_ = is[i_755_];
						is[i_755_]
						    = (((((i_770_ & 0xff00ff)
							  * anInt8830)
							 + ((i_777_ & 0xff00ff)
							    * anInt8831))
							& ~0xff00ff)
						       + ((((i_770_ & 0xff00)
							    * anInt8830)
							   + ((i_777_ & 0xff00)
							      * anInt8831))
							  & 0xff0000)) >> 8;
					    } else {
						int i_778_
						    = (((i_770_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_779_
						    = (((i_770_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_780_ = (((i_770_ & 0xff)
							       * anInt8836)
							      & 0xff00);
						is[i_755_] = (i_778_ | i_779_
							      | i_780_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_781_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_754_]);
					int i_782_
					    = (i_781_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_781_])
					       : 0);
					int i_783_ = anInt8829;
					int i_784_ = i_782_ + i_783_;
					int i_785_ = ((i_782_ & 0xff00ff)
						      + (i_783_ & 0xff00ff));
					int i_786_
					    = ((i_785_ & 0x1000100)
					       + (i_784_ - i_785_ & 0x10000));
					i_786_ = (i_784_ - i_786_
						  | i_786_ - (i_786_ >>> 8));
					if (i_782_ == 0 && anInt8830 != 255) {
					    i_782_ = i_786_;
					    i_786_ = is[i_755_];
					    i_786_ = (((((i_782_ & 0xff00ff)
							 * anInt8830)
							+ ((i_786_ & 0xff00ff)
							   * anInt8831))
						       & ~0xff00ff)
						      + ((((i_782_ & 0xff00)
							   * anInt8830)
							  + ((i_786_ & 0xff00)
							     * anInt8831))
							 & 0xff0000)) >> 8;
					}
					is[i_755_] = i_786_;
				    } else if (i == 2) {
					int i_787_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_754_]);
					if (i_787_ != 0) {
					    int i_788_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_787_ & 0xff]);
					    int i_789_ = (((i_788_ & 0xff00ff)
							   * anInt8830)
							  & ~0xff00ff);
					    int i_790_ = (((i_788_ & 0xff00)
							   * anInt8830)
							  & 0xff0000);
					    is[i_755_++] = ((i_789_ | i_790_)
							    >>> 8) + anInt8834;
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_609_ == 2) {
				    if (i == 1) {
					int i_791_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_754_]);
					if (i_791_ != 0) {
					    int i_792_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_791_ & 0xff]);
					    int i_793_ = is[i_755_];
					    int i_794_ = i_792_ + i_793_;
					    int i_795_
						= ((i_792_ & 0xff00ff)
						   + (i_793_ & 0xff00ff));
					    i_793_ = ((i_795_ & 0x1000100)
						      + (i_794_ - i_795_
							 & 0x10000));
					    is[i_755_]
						= (i_794_ - i_793_
						   | i_793_ - (i_793_ >>> 8));
					}
				    } else if (i == 0) {
					int i_796_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_754_]);
					if (i_796_ != 0) {
					    int i_797_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_796_ & 0xff]);
					    int i_798_ = (((i_797_ & 0xff0000)
							   * anInt8815)
							  & ~0xffffff);
					    int i_799_ = (((i_797_ & 0xff00)
							   * anInt8833)
							  & 0xff0000);
					    int i_800_
						= ((i_797_ & 0xff) * anInt8836
						   & 0xff00);
					    i_797_ = (i_798_ | i_799_
						      | i_800_) >>> 8;
					    int i_801_ = is[i_755_];
					    int i_802_ = i_797_ + i_801_;
					    int i_803_
						= ((i_797_ & 0xff00ff)
						   + (i_801_ & 0xff00ff));
					    i_801_ = ((i_803_ & 0x1000100)
						      + (i_802_ - i_803_
							 & 0x10000));
					    is[i_755_]
						= (i_802_ - i_801_
						   | i_801_ - (i_801_ >>> 8));
					}
				    } else if (i == 3) {
					byte i_804_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_754_]);
					int i_805_
					    = (i_804_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_804_])
					       : 0);
					int i_806_ = anInt8829;
					int i_807_ = i_805_ + i_806_;
					int i_808_ = ((i_805_ & 0xff00ff)
						      + (i_806_ & 0xff00ff));
					int i_809_
					    = ((i_808_ & 0x1000100)
					       + (i_807_ - i_808_ & 0x10000));
					i_809_ = (i_807_ - i_809_
						  | i_809_ - (i_809_ >>> 8));
					if (i_805_ == 0 && anInt8830 != 255) {
					    i_805_ = i_809_;
					    i_809_ = is[i_755_];
					    i_809_ = (((((i_805_ & 0xff00ff)
							 * anInt8830)
							+ ((i_809_ & 0xff00ff)
							   * anInt8831))
						       & ~0xff00ff)
						      + ((((i_805_ & 0xff00)
							   * anInt8830)
							  + ((i_809_ & 0xff00)
							     * anInt8831))
							 & 0xff0000)) >> 8;
					}
					is[i_755_] = i_809_;
				    } else if (i == 2) {
					int i_810_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_754_]);
					if (i_810_ != 0) {
					    int i_811_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_810_ & 0xff]);
					    int i_812_ = (((i_811_ & 0xff00ff)
							   * anInt8830)
							  & ~0xff00ff);
					    int i_813_ = (((i_811_ & 0xff00)
							   * anInt8830)
							  & 0xff0000);
					    i_811_ = (((i_812_ | i_813_) >>> 8)
						      + anInt8834);
					    int i_814_ = is[i_755_];
					    int i_815_ = i_811_ + i_814_;
					    int i_816_
						= ((i_811_ & 0xff00ff)
						   + (i_814_ & 0xff00ff));
					    i_814_ = ((i_816_ & 0x1000100)
						      + (i_815_ - i_816_
							 & 0x10000));
					    is[i_755_]
						= (i_815_ - i_814_
						   | i_814_ - (i_814_ >>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_750_ += anInt8825;
			    }
			}
			i_747_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8822 < 0) {
		if (anInt8825 == 0) {
		    int i_817_ = anInt8816;
		    while (i_817_ < 0) {
			int i_818_ = anInt8818;
			int i_819_ = anInt8807 + anInt8805;
			int i_820_ = anInt8826;
			int i_821_ = anInt8809;
			if (i_820_ >= 0
			    && i_820_ - (((Class151_Sub1_Sub1) this).anInt8804
					 << 12) < 0) {
			    int i_822_;
			    if ((i_822_
				 = (i_819_
				    - (((Class151_Sub1_Sub1) this).anInt8803
				       << 12)))
				>= 0) {
				i_822_ = (anInt8822 - i_822_) / anInt8822;
				i_821_ += i_822_;
				i_819_ += anInt8822 * i_822_;
				i_818_ += i_822_;
			    }
			    if ((i_822_ = (i_819_ - anInt8822) / anInt8822)
				> i_821_)
				i_821_ = i_822_;
			    for (/**/; i_821_ < 0; i_821_++) {
				int i_823_
				    = ((i_820_ >> 12) * ((Class151_Sub1_Sub1)
							 this).anInt8803
				       + (i_819_ >> 12));
				int i_824_ = i_818_++;
				if (i_609_ == 0) {
				    if (i == 1)
					is[i_824_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_823_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_825_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_823_])
						 & 0xff)]);
					int i_826_
					    = ((i_825_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_827_
					    = ((i_825_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_828_
					    = ((i_825_ & 0xff) * anInt8836
					       & 0xff00);
					is[i_824_]
					    = (i_826_ | i_827_ | i_828_) >>> 8;
				    } else if (i == 3) {
					int i_829_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_823_])
						 & 0xff)]);
					int i_830_ = anInt8829;
					int i_831_ = i_829_ + i_830_;
					int i_832_ = ((i_829_ & 0xff00ff)
						      + (i_830_ & 0xff00ff));
					int i_833_
					    = ((i_832_ & 0x1000100)
					       + (i_831_ - i_832_ & 0x10000));
					is[i_824_]
					    = (i_831_ - i_833_
					       | i_833_ - (i_833_ >>> 8));
				    } else if (i == 2) {
					int i_834_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_823_])
						 & 0xff)]);
					int i_835_
					    = ((i_834_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_836_
					    = ((i_834_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_824_] = (((i_835_ | i_836_) >>> 8)
						      + anInt8834);
				    } else
					throw new IllegalArgumentException();
				} else if (i_609_ == 1) {
				    if (i == 1) {
					int i_837_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_823_]);
					if (i_837_ != 0)
					    is[i_824_]
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_837_ & 0xff]);
				    } else if (i == 0) {
					int i_838_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_823_]);
					if (i_838_ != 0) {
					    int i_839_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_838_ & 0xff]);
					    if ((anInt8829 & 0xffffff)
						== 16777215) {
						int i_840_ = anInt8829 >>> 24;
						int i_841_ = 256 - i_840_;
						int i_842_ = is[i_824_];
						is[i_824_]
						    = (((((i_839_ & 0xff00ff)
							  * i_840_)
							 + ((i_842_ & 0xff00ff)
							    * i_841_))
							& ~0xff00ff)
						       + ((((i_839_ & 0xff00)
							    * i_840_)
							   + ((i_842_ & 0xff00)
							      * i_841_))
							  & 0xff0000)) >> 8;
					    } else if (anInt8830 != 255) {
						int i_843_
						    = (((i_839_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_844_
						    = (((i_839_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_845_ = (((i_839_ & 0xff)
							       * anInt8836)
							      & 0xff00);
						i_839_ = (i_843_ | i_844_
							  | i_845_) >>> 8;
						int i_846_ = is[i_824_];
						is[i_824_]
						    = (((((i_839_ & 0xff00ff)
							  * anInt8830)
							 + ((i_846_ & 0xff00ff)
							    * anInt8831))
							& ~0xff00ff)
						       + ((((i_839_ & 0xff00)
							    * anInt8830)
							   + ((i_846_ & 0xff00)
							      * anInt8831))
							  & 0xff0000)) >> 8;
					    } else {
						int i_847_
						    = (((i_839_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_848_
						    = (((i_839_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_849_ = (((i_839_ & 0xff)
							       * anInt8836)
							      & 0xff00);
						is[i_824_] = (i_847_ | i_848_
							      | i_849_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_850_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_823_]);
					int i_851_
					    = (i_850_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_850_])
					       : 0);
					int i_852_ = anInt8829;
					int i_853_ = i_851_ + i_852_;
					int i_854_ = ((i_851_ & 0xff00ff)
						      + (i_852_ & 0xff00ff));
					int i_855_
					    = ((i_854_ & 0x1000100)
					       + (i_853_ - i_854_ & 0x10000));
					i_855_ = (i_853_ - i_855_
						  | i_855_ - (i_855_ >>> 8));
					if (i_851_ == 0 && anInt8830 != 255) {
					    i_851_ = i_855_;
					    i_855_ = is[i_824_];
					    i_855_ = (((((i_851_ & 0xff00ff)
							 * anInt8830)
							+ ((i_855_ & 0xff00ff)
							   * anInt8831))
						       & ~0xff00ff)
						      + ((((i_851_ & 0xff00)
							   * anInt8830)
							  + ((i_855_ & 0xff00)
							     * anInt8831))
							 & 0xff0000)) >> 8;
					}
					is[i_824_] = i_855_;
				    } else if (i == 2) {
					int i_856_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_823_]);
					if (i_856_ != 0) {
					    int i_857_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_856_ & 0xff]);
					    int i_858_ = (((i_857_ & 0xff00ff)
							   * anInt8830)
							  & ~0xff00ff);
					    int i_859_ = (((i_857_ & 0xff00)
							   * anInt8830)
							  & 0xff0000);
					    is[i_824_++] = ((i_858_ | i_859_)
							    >>> 8) + anInt8834;
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_609_ == 2) {
				    if (i == 1) {
					int i_860_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_823_]);
					if (i_860_ != 0) {
					    int i_861_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_860_ & 0xff]);
					    int i_862_ = is[i_824_];
					    int i_863_ = i_861_ + i_862_;
					    int i_864_
						= ((i_861_ & 0xff00ff)
						   + (i_862_ & 0xff00ff));
					    i_862_ = ((i_864_ & 0x1000100)
						      + (i_863_ - i_864_
							 & 0x10000));
					    is[i_824_]
						= (i_863_ - i_862_
						   | i_862_ - (i_862_ >>> 8));
					}
				    } else if (i == 0) {
					int i_865_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_823_]);
					if (i_865_ != 0) {
					    int i_866_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_865_ & 0xff]);
					    int i_867_ = (((i_866_ & 0xff0000)
							   * anInt8815)
							  & ~0xffffff);
					    int i_868_ = (((i_866_ & 0xff00)
							   * anInt8833)
							  & 0xff0000);
					    int i_869_
						= ((i_866_ & 0xff) * anInt8836
						   & 0xff00);
					    i_866_ = (i_867_ | i_868_
						      | i_869_) >>> 8;
					    int i_870_ = is[i_824_];
					    int i_871_ = i_866_ + i_870_;
					    int i_872_
						= ((i_866_ & 0xff00ff)
						   + (i_870_ & 0xff00ff));
					    i_870_ = ((i_872_ & 0x1000100)
						      + (i_871_ - i_872_
							 & 0x10000));
					    is[i_824_]
						= (i_871_ - i_870_
						   | i_870_ - (i_870_ >>> 8));
					}
				    } else if (i == 3) {
					byte i_873_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_823_]);
					int i_874_
					    = (i_873_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_873_])
					       : 0);
					int i_875_ = anInt8829;
					int i_876_ = i_874_ + i_875_;
					int i_877_ = ((i_874_ & 0xff00ff)
						      + (i_875_ & 0xff00ff));
					int i_878_
					    = ((i_877_ & 0x1000100)
					       + (i_876_ - i_877_ & 0x10000));
					i_878_ = (i_876_ - i_878_
						  | i_878_ - (i_878_ >>> 8));
					if (i_874_ == 0 && anInt8830 != 255) {
					    i_874_ = i_878_;
					    i_878_ = is[i_824_];
					    i_878_ = (((((i_874_ & 0xff00ff)
							 * anInt8830)
							+ ((i_878_ & 0xff00ff)
							   * anInt8831))
						       & ~0xff00ff)
						      + ((((i_874_ & 0xff00)
							   * anInt8830)
							  + ((i_878_ & 0xff00)
							     * anInt8831))
							 & 0xff0000)) >> 8;
					}
					is[i_824_] = i_878_;
				    } else if (i == 2) {
					int i_879_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_823_]);
					if (i_879_ != 0) {
					    int i_880_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_879_ & 0xff]);
					    int i_881_ = (((i_880_ & 0xff00ff)
							   * anInt8830)
							  & ~0xff00ff);
					    int i_882_ = (((i_880_ & 0xff00)
							   * anInt8830)
							  & 0xff0000);
					    i_880_ = (((i_881_ | i_882_) >>> 8)
						      + anInt8834);
					    int i_883_ = is[i_824_];
					    int i_884_ = i_880_ + i_883_;
					    int i_885_
						= ((i_880_ & 0xff00ff)
						   + (i_883_ & 0xff00ff));
					    i_883_ = ((i_885_ & 0x1000100)
						      + (i_884_ - i_885_
							 & 0x10000));
					    is[i_824_]
						= (i_884_ - i_883_
						   | i_883_ - (i_883_ >>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_819_ += anInt8822;
			    }
			}
			i_817_++;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_886_ = anInt8816;
		    while (i_886_ < 0) {
			int i_887_ = anInt8818;
			int i_888_ = anInt8807 + anInt8805;
			int i_889_ = anInt8826 + anInt8828;
			int i_890_ = anInt8809;
			int i_891_;
			if ((i_891_
			     = i_888_ - (((Class151_Sub1_Sub1) this).anInt8803
					 << 12))
			    >= 0) {
			    i_891_ = (anInt8822 - i_891_) / anInt8822;
			    i_890_ += i_891_;
			    i_888_ += anInt8822 * i_891_;
			    i_889_ += anInt8825 * i_891_;
			    i_887_ += i_891_;
			}
			if ((i_891_ = (i_888_ - anInt8822) / anInt8822)
			    > i_890_)
			    i_890_ = i_891_;
			if ((i_891_
			     = i_889_ - (((Class151_Sub1_Sub1) this).anInt8804
					 << 12))
			    >= 0) {
			    i_891_ = (anInt8825 - i_891_) / anInt8825;
			    i_890_ += i_891_;
			    i_888_ += anInt8822 * i_891_;
			    i_889_ += anInt8825 * i_891_;
			    i_887_ += i_891_;
			}
			if ((i_891_ = (i_889_ - anInt8825) / anInt8825)
			    > i_890_)
			    i_890_ = i_891_;
			for (/**/; i_890_ < 0; i_890_++) {
			    int i_892_
				= (((i_889_ >> 12)
				    * ((Class151_Sub1_Sub1) this).anInt8803)
				   + (i_888_ >> 12));
			    int i_893_ = i_887_++;
			    if (i_609_ == 0) {
				if (i == 1)
				    is[i_893_] = (((Class151_Sub1_Sub1) this)
						  .anIntArray11257
						  [(((Class151_Sub1_Sub1) this)
						    .aByteArray11258
						    [i_892_]) & 0xff]);
				else if (i == 0) {
				    int i_894_ = (((Class151_Sub1_Sub1) this)
						  .anIntArray11257
						  [(((Class151_Sub1_Sub1) this)
						    .aByteArray11258
						    [i_892_]) & 0xff]);
				    int i_895_
					= ((i_894_ & 0xff0000) * anInt8815
					   & ~0xffffff);
				    int i_896_ = ((i_894_ & 0xff00) * anInt8833
						  & 0xff0000);
				    int i_897_
					= (i_894_ & 0xff) * anInt8836 & 0xff00;
				    is[i_893_]
					= (i_895_ | i_896_ | i_897_) >>> 8;
				} else if (i == 3) {
				    int i_898_ = (((Class151_Sub1_Sub1) this)
						  .anIntArray11257
						  [(((Class151_Sub1_Sub1) this)
						    .aByteArray11258
						    [i_892_]) & 0xff]);
				    int i_899_ = anInt8829;
				    int i_900_ = i_898_ + i_899_;
				    int i_901_ = ((i_898_ & 0xff00ff)
						  + (i_899_ & 0xff00ff));
				    int i_902_
					= ((i_901_ & 0x1000100)
					   + (i_900_ - i_901_ & 0x10000));
				    is[i_893_]
					= i_900_ - i_902_ | i_902_ - (i_902_
								      >>> 8);
				} else if (i == 2) {
				    int i_903_ = (((Class151_Sub1_Sub1) this)
						  .anIntArray11257
						  [(((Class151_Sub1_Sub1) this)
						    .aByteArray11258
						    [i_892_]) & 0xff]);
				    int i_904_
					= ((i_903_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_905_ = ((i_903_ & 0xff00) * anInt8830
						  & 0xff0000);
				    is[i_893_] = (((i_904_ | i_905_) >>> 8)
						  + anInt8834);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_609_ == 1) {
				if (i == 1) {
				    int i_906_ = (((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_892_]);
				    if (i_906_ != 0)
					is[i_893_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_906_ & 0xff]);
				} else if (i == 0) {
				    int i_907_ = (((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_892_]);
				    if (i_907_ != 0) {
					int i_908_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_907_ & 0xff]);
					if ((anInt8829 & 0xffffff)
					    == 16777215) {
					    int i_909_ = anInt8829 >>> 24;
					    int i_910_ = 256 - i_909_;
					    int i_911_ = is[i_893_];
					    is[i_893_]
						= (((((i_908_ & 0xff00ff)
						      * i_909_)
						     + ((i_911_ & 0xff00ff)
							* i_910_))
						    & ~0xff00ff)
						   + ((((i_908_ & 0xff00)
							* i_909_)
						       + ((i_911_ & 0xff00)
							  * i_910_))
						      & 0xff0000)) >> 8;
					} else if (anInt8830 != 255) {
					    int i_912_ = (((i_908_ & 0xff0000)
							   * anInt8815)
							  & ~0xffffff);
					    int i_913_ = (((i_908_ & 0xff00)
							   * anInt8833)
							  & 0xff0000);
					    int i_914_
						= ((i_908_ & 0xff) * anInt8836
						   & 0xff00);
					    i_908_ = (i_912_ | i_913_
						      | i_914_) >>> 8;
					    int i_915_ = is[i_893_];
					    is[i_893_]
						= (((((i_908_ & 0xff00ff)
						      * anInt8830)
						     + ((i_915_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_908_ & 0xff00)
							* anInt8830)
						       + ((i_915_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					} else {
					    int i_916_ = (((i_908_ & 0xff0000)
							   * anInt8815)
							  & ~0xffffff);
					    int i_917_ = (((i_908_ & 0xff00)
							   * anInt8833)
							  & 0xff0000);
					    int i_918_
						= ((i_908_ & 0xff) * anInt8836
						   & 0xff00);
					    is[i_893_] = (i_916_ | i_917_
							  | i_918_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_919_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_892_]);
				    int i_920_
					= (i_919_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_919_])
					   : 0);
				    int i_921_ = anInt8829;
				    int i_922_ = i_920_ + i_921_;
				    int i_923_ = ((i_920_ & 0xff00ff)
						  + (i_921_ & 0xff00ff));
				    int i_924_
					= ((i_923_ & 0x1000100)
					   + (i_922_ - i_923_ & 0x10000));
				    i_924_
					= i_922_ - i_924_ | i_924_ - (i_924_
								      >>> 8);
				    if (i_920_ == 0 && anInt8830 != 255) {
					i_920_ = i_924_;
					i_924_ = is[i_893_];
					i_924_ = (((((i_920_ & 0xff00ff)
						     * anInt8830)
						    + ((i_924_ & 0xff00ff)
						       * anInt8831))
						   & ~0xff00ff)
						  + ((((i_920_ & 0xff00)
						       * anInt8830)
						      + ((i_924_ & 0xff00)
							 * anInt8831))
						     & 0xff0000)) >> 8;
				    }
				    is[i_893_] = i_924_;
				} else if (i == 2) {
				    int i_925_ = (((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_892_]);
				    if (i_925_ != 0) {
					int i_926_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_925_ & 0xff]);
					int i_927_
					    = ((i_926_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_928_
					    = ((i_926_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_893_++] = ((i_927_ | i_928_)
							>>> 8) + anInt8834;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_609_ == 2) {
				if (i == 1) {
				    int i_929_ = (((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_892_]);
				    if (i_929_ != 0) {
					int i_930_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_929_ & 0xff]);
					int i_931_ = is[i_893_];
					int i_932_ = i_930_ + i_931_;
					int i_933_ = ((i_930_ & 0xff00ff)
						      + (i_931_ & 0xff00ff));
					i_931_
					    = ((i_933_ & 0x1000100)
					       + (i_932_ - i_933_ & 0x10000));
					is[i_893_]
					    = (i_932_ - i_931_
					       | i_931_ - (i_931_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_934_ = (((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_892_]);
				    if (i_934_ != 0) {
					int i_935_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_934_ & 0xff]);
					int i_936_
					    = ((i_935_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_937_
					    = ((i_935_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_938_
					    = ((i_935_ & 0xff) * anInt8836
					       & 0xff00);
					i_935_
					    = (i_936_ | i_937_ | i_938_) >>> 8;
					int i_939_ = is[i_893_];
					int i_940_ = i_935_ + i_939_;
					int i_941_ = ((i_935_ & 0xff00ff)
						      + (i_939_ & 0xff00ff));
					i_939_
					    = ((i_941_ & 0x1000100)
					       + (i_940_ - i_941_ & 0x10000));
					is[i_893_]
					    = (i_940_ - i_939_
					       | i_939_ - (i_939_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_942_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_892_]);
				    int i_943_
					= (i_942_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_942_])
					   : 0);
				    int i_944_ = anInt8829;
				    int i_945_ = i_943_ + i_944_;
				    int i_946_ = ((i_943_ & 0xff00ff)
						  + (i_944_ & 0xff00ff));
				    int i_947_
					= ((i_946_ & 0x1000100)
					   + (i_945_ - i_946_ & 0x10000));
				    i_947_
					= i_945_ - i_947_ | i_947_ - (i_947_
								      >>> 8);
				    if (i_943_ == 0 && anInt8830 != 255) {
					i_943_ = i_947_;
					i_947_ = is[i_893_];
					i_947_ = (((((i_943_ & 0xff00ff)
						     * anInt8830)
						    + ((i_947_ & 0xff00ff)
						       * anInt8831))
						   & ~0xff00ff)
						  + ((((i_943_ & 0xff00)
						       * anInt8830)
						      + ((i_947_ & 0xff00)
							 * anInt8831))
						     & 0xff0000)) >> 8;
				    }
				    is[i_893_] = i_947_;
				} else if (i == 2) {
				    int i_948_ = (((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_892_]);
				    if (i_948_ != 0) {
					int i_949_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_948_ & 0xff]);
					int i_950_
					    = ((i_949_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_951_
					    = ((i_949_ & 0xff00) * anInt8830
					       & 0xff0000);
					i_949_ = (((i_950_ | i_951_) >>> 8)
						  + anInt8834);
					int i_952_ = is[i_893_];
					int i_953_ = i_949_ + i_952_;
					int i_954_ = ((i_949_ & 0xff00ff)
						      + (i_952_ & 0xff00ff));
					i_952_
					    = ((i_954_ & 0x1000100)
					       + (i_953_ - i_954_ & 0x10000));
					is[i_893_]
					    = (i_953_ - i_952_
					       | i_952_ - (i_952_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_888_ += anInt8822;
			    i_889_ += anInt8825;
			}
			i_886_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_955_ = anInt8816;
		    while (i_955_ < 0) {
			int i_956_ = anInt8818;
			int i_957_ = anInt8807 + anInt8805;
			int i_958_ = anInt8826 + anInt8828;
			int i_959_ = anInt8809;
			int i_960_;
			if ((i_960_
			     = i_957_ - (((Class151_Sub1_Sub1) this).anInt8803
					 << 12))
			    >= 0) {
			    i_960_ = (anInt8822 - i_960_) / anInt8822;
			    i_959_ += i_960_;
			    i_957_ += anInt8822 * i_960_;
			    i_958_ += anInt8825 * i_960_;
			    i_956_ += i_960_;
			}
			if ((i_960_ = (i_957_ - anInt8822) / anInt8822)
			    > i_959_)
			    i_959_ = i_960_;
			if (i_958_ < 0) {
			    i_960_ = (anInt8825 - 1 - i_958_) / anInt8825;
			    i_959_ += i_960_;
			    i_957_ += anInt8822 * i_960_;
			    i_958_ += anInt8825 * i_960_;
			    i_956_ += i_960_;
			}
			if ((i_960_
			     = (1 + i_958_
				- (((Class151_Sub1_Sub1) this).anInt8804 << 12)
				- anInt8825) / anInt8825)
			    > i_959_)
			    i_959_ = i_960_;
			for (/**/; i_959_ < 0; i_959_++) {
			    int i_961_
				= (((i_958_ >> 12)
				    * ((Class151_Sub1_Sub1) this).anInt8803)
				   + (i_957_ >> 12));
			    int i_962_ = i_956_++;
			    if (i_609_ == 0) {
				if (i == 1)
				    is[i_962_] = (((Class151_Sub1_Sub1) this)
						  .anIntArray11257
						  [(((Class151_Sub1_Sub1) this)
						    .aByteArray11258
						    [i_961_]) & 0xff]);
				else if (i == 0) {
				    int i_963_ = (((Class151_Sub1_Sub1) this)
						  .anIntArray11257
						  [(((Class151_Sub1_Sub1) this)
						    .aByteArray11258
						    [i_961_]) & 0xff]);
				    int i_964_
					= ((i_963_ & 0xff0000) * anInt8815
					   & ~0xffffff);
				    int i_965_ = ((i_963_ & 0xff00) * anInt8833
						  & 0xff0000);
				    int i_966_
					= (i_963_ & 0xff) * anInt8836 & 0xff00;
				    is[i_962_]
					= (i_964_ | i_965_ | i_966_) >>> 8;
				} else if (i == 3) {
				    int i_967_ = (((Class151_Sub1_Sub1) this)
						  .anIntArray11257
						  [(((Class151_Sub1_Sub1) this)
						    .aByteArray11258
						    [i_961_]) & 0xff]);
				    int i_968_ = anInt8829;
				    int i_969_ = i_967_ + i_968_;
				    int i_970_ = ((i_967_ & 0xff00ff)
						  + (i_968_ & 0xff00ff));
				    int i_971_
					= ((i_970_ & 0x1000100)
					   + (i_969_ - i_970_ & 0x10000));
				    is[i_962_]
					= i_969_ - i_971_ | i_971_ - (i_971_
								      >>> 8);
				} else if (i == 2) {
				    int i_972_ = (((Class151_Sub1_Sub1) this)
						  .anIntArray11257
						  [(((Class151_Sub1_Sub1) this)
						    .aByteArray11258
						    [i_961_]) & 0xff]);
				    int i_973_
					= ((i_972_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_974_ = ((i_972_ & 0xff00) * anInt8830
						  & 0xff0000);
				    is[i_962_] = (((i_973_ | i_974_) >>> 8)
						  + anInt8834);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_609_ == 1) {
				if (i == 1) {
				    int i_975_ = (((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_961_]);
				    if (i_975_ != 0)
					is[i_962_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_975_ & 0xff]);
				} else if (i == 0) {
				    int i_976_ = (((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_961_]);
				    if (i_976_ != 0) {
					int i_977_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_976_ & 0xff]);
					if ((anInt8829 & 0xffffff)
					    == 16777215) {
					    int i_978_ = anInt8829 >>> 24;
					    int i_979_ = 256 - i_978_;
					    int i_980_ = is[i_962_];
					    is[i_962_]
						= (((((i_977_ & 0xff00ff)
						      * i_978_)
						     + ((i_980_ & 0xff00ff)
							* i_979_))
						    & ~0xff00ff)
						   + ((((i_977_ & 0xff00)
							* i_978_)
						       + ((i_980_ & 0xff00)
							  * i_979_))
						      & 0xff0000)) >> 8;
					} else if (anInt8830 != 255) {
					    int i_981_ = (((i_977_ & 0xff0000)
							   * anInt8815)
							  & ~0xffffff);
					    int i_982_ = (((i_977_ & 0xff00)
							   * anInt8833)
							  & 0xff0000);
					    int i_983_
						= ((i_977_ & 0xff) * anInt8836
						   & 0xff00);
					    i_977_ = (i_981_ | i_982_
						      | i_983_) >>> 8;
					    int i_984_ = is[i_962_];
					    is[i_962_]
						= (((((i_977_ & 0xff00ff)
						      * anInt8830)
						     + ((i_984_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_977_ & 0xff00)
							* anInt8830)
						       + ((i_984_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					} else {
					    int i_985_ = (((i_977_ & 0xff0000)
							   * anInt8815)
							  & ~0xffffff);
					    int i_986_ = (((i_977_ & 0xff00)
							   * anInt8833)
							  & 0xff0000);
					    int i_987_
						= ((i_977_ & 0xff) * anInt8836
						   & 0xff00);
					    is[i_962_] = (i_985_ | i_986_
							  | i_987_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_988_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_961_]);
				    int i_989_
					= (i_988_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_988_])
					   : 0);
				    int i_990_ = anInt8829;
				    int i_991_ = i_989_ + i_990_;
				    int i_992_ = ((i_989_ & 0xff00ff)
						  + (i_990_ & 0xff00ff));
				    int i_993_
					= ((i_992_ & 0x1000100)
					   + (i_991_ - i_992_ & 0x10000));
				    i_993_
					= i_991_ - i_993_ | i_993_ - (i_993_
								      >>> 8);
				    if (i_989_ == 0 && anInt8830 != 255) {
					i_989_ = i_993_;
					i_993_ = is[i_962_];
					i_993_ = (((((i_989_ & 0xff00ff)
						     * anInt8830)
						    + ((i_993_ & 0xff00ff)
						       * anInt8831))
						   & ~0xff00ff)
						  + ((((i_989_ & 0xff00)
						       * anInt8830)
						      + ((i_993_ & 0xff00)
							 * anInt8831))
						     & 0xff0000)) >> 8;
				    }
				    is[i_962_] = i_993_;
				} else if (i == 2) {
				    int i_994_ = (((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_961_]);
				    if (i_994_ != 0) {
					int i_995_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_994_ & 0xff]);
					int i_996_
					    = ((i_995_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_997_
					    = ((i_995_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_962_++] = ((i_996_ | i_997_)
							>>> 8) + anInt8834;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_609_ == 2) {
				if (i == 1) {
				    int i_998_ = (((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_961_]);
				    if (i_998_ != 0) {
					int i_999_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_998_ & 0xff]);
					int i_1000_ = is[i_962_];
					int i_1001_ = i_999_ + i_1000_;
					int i_1002_ = ((i_999_ & 0xff00ff)
						       + (i_1000_ & 0xff00ff));
					i_1000_ = ((i_1002_ & 0x1000100)
						   + (i_1001_ - i_1002_
						      & 0x10000));
					is[i_962_]
					    = (i_1001_ - i_1000_
					       | i_1000_ - (i_1000_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_1003_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_961_]);
				    if (i_1003_ != 0) {
					int i_1004_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_1003_ & 0xff]);
					int i_1005_
					    = ((i_1004_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_1006_
					    = ((i_1004_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_1007_
					    = ((i_1004_ & 0xff) * anInt8836
					       & 0xff00);
					i_1004_ = (i_1005_ | i_1006_
						   | i_1007_) >>> 8;
					int i_1008_ = is[i_962_];
					int i_1009_ = i_1004_ + i_1008_;
					int i_1010_ = ((i_1004_ & 0xff00ff)
						       + (i_1008_ & 0xff00ff));
					i_1008_ = ((i_1010_ & 0x1000100)
						   + (i_1009_ - i_1010_
						      & 0x10000));
					is[i_962_]
					    = (i_1009_ - i_1008_
					       | i_1008_ - (i_1008_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_1011_ = (((Class151_Sub1_Sub1) this)
						    .aByteArray11258[i_961_]);
				    int i_1012_
					= (i_1011_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_1011_])
					   : 0);
				    int i_1013_ = anInt8829;
				    int i_1014_ = i_1012_ + i_1013_;
				    int i_1015_ = ((i_1012_ & 0xff00ff)
						   + (i_1013_ & 0xff00ff));
				    int i_1016_
					= ((i_1015_ & 0x1000100)
					   + (i_1014_ - i_1015_ & 0x10000));
				    i_1016_ = (i_1014_ - i_1016_
					       | i_1016_ - (i_1016_ >>> 8));
				    if (i_1012_ == 0 && anInt8830 != 255) {
					i_1012_ = i_1016_;
					i_1016_ = is[i_962_];
					i_1016_ = (((((i_1012_ & 0xff00ff)
						      * anInt8830)
						     + ((i_1016_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_1012_ & 0xff00)
							* anInt8830)
						       + ((i_1016_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
				    }
				    is[i_962_] = i_1016_;
				} else if (i == 2) {
				    int i_1017_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_961_]);
				    if (i_1017_ != 0) {
					int i_1018_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_1017_ & 0xff]);
					int i_1019_
					    = ((i_1018_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_1020_
					    = ((i_1018_ & 0xff00) * anInt8830
					       & 0xff0000);
					i_1018_ = (((i_1019_ | i_1020_) >>> 8)
						   + anInt8834);
					int i_1021_ = is[i_962_];
					int i_1022_ = i_1018_ + i_1021_;
					int i_1023_ = ((i_1018_ & 0xff00ff)
						       + (i_1021_ & 0xff00ff));
					i_1021_ = ((i_1023_ & 0x1000100)
						   + (i_1022_ - i_1023_
						      & 0x10000));
					is[i_962_]
					    = (i_1022_ - i_1021_
					       | i_1021_ - (i_1021_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_957_ += anInt8822;
			    i_958_ += anInt8825;
			}
			i_955_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8825 == 0) {
		int i_1024_ = anInt8816;
		while (i_1024_ < 0) {
		    int i_1025_ = anInt8818;
		    int i_1026_ = anInt8807 + anInt8805;
		    int i_1027_ = anInt8826;
		    int i_1028_ = anInt8809;
		    if (i_1027_ >= 0
			&& i_1027_ - (((Class151_Sub1_Sub1) this).anInt8804
				      << 12) < 0) {
			if (i_1026_ < 0) {
			    int i_1029_
				= (anInt8822 - 1 - i_1026_) / anInt8822;
			    i_1028_ += i_1029_;
			    i_1026_ += anInt8822 * i_1029_;
			    i_1025_ += i_1029_;
			}
			int i_1030_;
			if ((i_1030_
			     = (1 + i_1026_
				- (((Class151_Sub1_Sub1) this).anInt8803 << 12)
				- anInt8822) / anInt8822)
			    > i_1028_)
			    i_1028_ = i_1030_;
			for (/**/; i_1028_ < 0; i_1028_++) {
			    int i_1031_
				= (((i_1027_ >> 12)
				    * ((Class151_Sub1_Sub1) this).anInt8803)
				   + (i_1026_ >> 12));
			    int i_1032_ = i_1025_++;
			    if (i_609_ == 0) {
				if (i == 1)
				    is[i_1032_]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_1031_])
					     & 0xff)]);
				else if (i == 0) {
				    int i_1033_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_1031_])
					     & 0xff)]);
				    int i_1034_
					= ((i_1033_ & 0xff0000) * anInt8815
					   & ~0xffffff);
				    int i_1035_
					= ((i_1033_ & 0xff00) * anInt8833
					   & 0xff0000);
				    int i_1036_ = ((i_1033_ & 0xff) * anInt8836
						   & 0xff00);
				    is[i_1032_]
					= (i_1034_ | i_1035_ | i_1036_) >>> 8;
				} else if (i == 3) {
				    int i_1037_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_1031_])
					     & 0xff)]);
				    int i_1038_ = anInt8829;
				    int i_1039_ = i_1037_ + i_1038_;
				    int i_1040_ = ((i_1037_ & 0xff00ff)
						   + (i_1038_ & 0xff00ff));
				    int i_1041_
					= ((i_1040_ & 0x1000100)
					   + (i_1039_ - i_1040_ & 0x10000));
				    is[i_1032_]
					= (i_1039_ - i_1041_
					   | i_1041_ - (i_1041_ >>> 8));
				} else if (i == 2) {
				    int i_1042_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_1031_])
					     & 0xff)]);
				    int i_1043_
					= ((i_1042_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_1044_
					= ((i_1042_ & 0xff00) * anInt8830
					   & 0xff0000);
				    is[i_1032_] = (((i_1043_ | i_1044_) >>> 8)
						   + anInt8834);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_609_ == 1) {
				if (i == 1) {
				    int i_1045_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_1031_]);
				    if (i_1045_ != 0)
					is[i_1032_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_1045_ & 0xff]);
				} else if (i == 0) {
				    int i_1046_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_1031_]);
				    if (i_1046_ != 0) {
					int i_1047_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_1046_ & 0xff]);
					if ((anInt8829 & 0xffffff)
					    == 16777215) {
					    int i_1048_ = anInt8829 >>> 24;
					    int i_1049_ = 256 - i_1048_;
					    int i_1050_ = is[i_1032_];
					    is[i_1032_]
						= (((((i_1047_ & 0xff00ff)
						      * i_1048_)
						     + ((i_1050_ & 0xff00ff)
							* i_1049_))
						    & ~0xff00ff)
						   + ((((i_1047_ & 0xff00)
							* i_1048_)
						       + ((i_1050_ & 0xff00)
							  * i_1049_))
						      & 0xff0000)) >> 8;
					} else if (anInt8830 != 255) {
					    int i_1051_
						= (((i_1047_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_1052_ = (((i_1047_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_1053_
						= ((i_1047_ & 0xff) * anInt8836
						   & 0xff00);
					    i_1047_ = (i_1051_ | i_1052_
						       | i_1053_) >>> 8;
					    int i_1054_ = is[i_1032_];
					    is[i_1032_]
						= (((((i_1047_ & 0xff00ff)
						      * anInt8830)
						     + ((i_1054_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_1047_ & 0xff00)
							* anInt8830)
						       + ((i_1054_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1055_
						= (((i_1047_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_1056_ = (((i_1047_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_1057_
						= ((i_1047_ & 0xff) * anInt8836
						   & 0xff00);
					    is[i_1032_] = (i_1055_ | i_1056_
							   | i_1057_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_1058_ = (((Class151_Sub1_Sub1) this)
						    .aByteArray11258[i_1031_]);
				    int i_1059_
					= (i_1058_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_1058_])
					   : 0);
				    int i_1060_ = anInt8829;
				    int i_1061_ = i_1059_ + i_1060_;
				    int i_1062_ = ((i_1059_ & 0xff00ff)
						   + (i_1060_ & 0xff00ff));
				    int i_1063_
					= ((i_1062_ & 0x1000100)
					   + (i_1061_ - i_1062_ & 0x10000));
				    i_1063_ = (i_1061_ - i_1063_
					       | i_1063_ - (i_1063_ >>> 8));
				    if (i_1059_ == 0 && anInt8830 != 255) {
					i_1059_ = i_1063_;
					i_1063_ = is[i_1032_];
					i_1063_ = (((((i_1059_ & 0xff00ff)
						      * anInt8830)
						     + ((i_1063_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_1059_ & 0xff00)
							* anInt8830)
						       + ((i_1063_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
				    }
				    is[i_1032_] = i_1063_;
				} else if (i == 2) {
				    int i_1064_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_1031_]);
				    if (i_1064_ != 0) {
					int i_1065_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_1064_ & 0xff]);
					int i_1066_
					    = ((i_1065_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_1067_
					    = ((i_1065_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_1032_++] = ((i_1066_ | i_1067_)
							 >>> 8) + anInt8834;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_609_ == 2) {
				if (i == 1) {
				    int i_1068_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_1031_]);
				    if (i_1068_ != 0) {
					int i_1069_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_1068_ & 0xff]);
					int i_1070_ = is[i_1032_];
					int i_1071_ = i_1069_ + i_1070_;
					int i_1072_ = ((i_1069_ & 0xff00ff)
						       + (i_1070_ & 0xff00ff));
					i_1070_ = ((i_1072_ & 0x1000100)
						   + (i_1071_ - i_1072_
						      & 0x10000));
					is[i_1032_]
					    = (i_1071_ - i_1070_
					       | i_1070_ - (i_1070_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_1073_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_1031_]);
				    if (i_1073_ != 0) {
					int i_1074_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_1073_ & 0xff]);
					int i_1075_
					    = ((i_1074_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_1076_
					    = ((i_1074_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_1077_
					    = ((i_1074_ & 0xff) * anInt8836
					       & 0xff00);
					i_1074_ = (i_1075_ | i_1076_
						   | i_1077_) >>> 8;
					int i_1078_ = is[i_1032_];
					int i_1079_ = i_1074_ + i_1078_;
					int i_1080_ = ((i_1074_ & 0xff00ff)
						       + (i_1078_ & 0xff00ff));
					i_1078_ = ((i_1080_ & 0x1000100)
						   + (i_1079_ - i_1080_
						      & 0x10000));
					is[i_1032_]
					    = (i_1079_ - i_1078_
					       | i_1078_ - (i_1078_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_1081_ = (((Class151_Sub1_Sub1) this)
						    .aByteArray11258[i_1031_]);
				    int i_1082_
					= (i_1081_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_1081_])
					   : 0);
				    int i_1083_ = anInt8829;
				    int i_1084_ = i_1082_ + i_1083_;
				    int i_1085_ = ((i_1082_ & 0xff00ff)
						   + (i_1083_ & 0xff00ff));
				    int i_1086_
					= ((i_1085_ & 0x1000100)
					   + (i_1084_ - i_1085_ & 0x10000));
				    i_1086_ = (i_1084_ - i_1086_
					       | i_1086_ - (i_1086_ >>> 8));
				    if (i_1082_ == 0 && anInt8830 != 255) {
					i_1082_ = i_1086_;
					i_1086_ = is[i_1032_];
					i_1086_ = (((((i_1082_ & 0xff00ff)
						      * anInt8830)
						     + ((i_1086_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_1082_ & 0xff00)
							* anInt8830)
						       + ((i_1086_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
				    }
				    is[i_1032_] = i_1086_;
				} else if (i == 2) {
				    int i_1087_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_1031_]);
				    if (i_1087_ != 0) {
					int i_1088_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_1087_ & 0xff]);
					int i_1089_
					    = ((i_1088_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_1090_
					    = ((i_1088_ & 0xff00) * anInt8830
					       & 0xff0000);
					i_1088_ = (((i_1089_ | i_1090_) >>> 8)
						   + anInt8834);
					int i_1091_ = is[i_1032_];
					int i_1092_ = i_1088_ + i_1091_;
					int i_1093_ = ((i_1088_ & 0xff00ff)
						       + (i_1091_ & 0xff00ff));
					i_1091_ = ((i_1093_ & 0x1000100)
						   + (i_1092_ - i_1093_
						      & 0x10000));
					is[i_1032_]
					    = (i_1092_ - i_1091_
					       | i_1091_ - (i_1091_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_1026_ += anInt8822;
			}
		    }
		    i_1024_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else if (anInt8825 < 0) {
		for (int i_1094_ = anInt8816; i_1094_ < 0; i_1094_++) {
		    int i_1095_ = anInt8818;
		    int i_1096_ = anInt8807 + anInt8805;
		    int i_1097_ = anInt8826 + anInt8828;
		    int i_1098_ = anInt8809;
		    if (i_1096_ < 0) {
			int i_1099_ = (anInt8822 - 1 - i_1096_) / anInt8822;
			i_1098_ += i_1099_;
			i_1096_ += anInt8822 * i_1099_;
			i_1097_ += anInt8825 * i_1099_;
			i_1095_ += i_1099_;
		    }
		    int i_1100_;
		    if ((i_1100_
			 = (1 + i_1096_
			    - (((Class151_Sub1_Sub1) this).anInt8803 << 12)
			    - anInt8822) / anInt8822)
			> i_1098_)
			i_1098_ = i_1100_;
		    if ((i_1100_
			 = i_1097_ - (((Class151_Sub1_Sub1) this).anInt8804
				      << 12))
			>= 0) {
			i_1100_ = (anInt8825 - i_1100_) / anInt8825;
			i_1098_ += i_1100_;
			i_1096_ += anInt8822 * i_1100_;
			i_1097_ += anInt8825 * i_1100_;
			i_1095_ += i_1100_;
		    }
		    if ((i_1100_ = (i_1097_ - anInt8825) / anInt8825)
			> i_1098_)
			i_1098_ = i_1100_;
		    for (/**/; i_1098_ < 0; i_1098_++) {
			int i_1101_
			    = (((i_1097_ >> 12)
				* ((Class151_Sub1_Sub1) this).anInt8803)
			       + (i_1096_ >> 12));
			int i_1102_ = i_1095_++;
			if (i_609_ == 0) {
			    if (i == 1)
				is[i_1102_]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1101_]) & 0xff]);
			    else if (i == 0) {
				int i_1103_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1101_]) & 0xff]);
				int i_1104_ = ((i_1103_ & 0xff0000) * anInt8815
					       & ~0xffffff);
				int i_1105_ = ((i_1103_ & 0xff00) * anInt8833
					       & 0xff0000);
				int i_1106_
				    = (i_1103_ & 0xff) * anInt8836 & 0xff00;
				is[i_1102_]
				    = (i_1104_ | i_1105_ | i_1106_) >>> 8;
			    } else if (i == 3) {
				int i_1107_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1101_]) & 0xff]);
				int i_1108_ = anInt8829;
				int i_1109_ = i_1107_ + i_1108_;
				int i_1110_ = ((i_1107_ & 0xff00ff)
					       + (i_1108_ & 0xff00ff));
				int i_1111_
				    = ((i_1110_ & 0x1000100)
				       + (i_1109_ - i_1110_ & 0x10000));
				is[i_1102_]
				    = i_1109_ - i_1111_ | i_1111_ - (i_1111_
								     >>> 8);
			    } else if (i == 2) {
				int i_1112_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1101_]) & 0xff]);
				int i_1113_ = ((i_1112_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
				int i_1114_ = ((i_1112_ & 0xff00) * anInt8830
					       & 0xff0000);
				is[i_1102_]
				    = ((i_1113_ | i_1114_) >>> 8) + anInt8834;
			    } else
				throw new IllegalArgumentException();
			} else if (i_609_ == 1) {
			    if (i == 1) {
				int i_1115_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_1101_]);
				if (i_1115_ != 0)
				    is[i_1102_]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1115_ & 0xff]);
			    } else if (i == 0) {
				int i_1116_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_1101_]);
				if (i_1116_ != 0) {
				    int i_1117_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1116_ & 0xff]);
				    if ((anInt8829 & 0xffffff) == 16777215) {
					int i_1118_ = anInt8829 >>> 24;
					int i_1119_ = 256 - i_1118_;
					int i_1120_ = is[i_1102_];
					is[i_1102_]
					    = ((((i_1117_ & 0xff00ff) * i_1118_
						 + ((i_1120_ & 0xff00ff)
						    * i_1119_))
						& ~0xff00ff)
					       + (((i_1117_ & 0xff00) * i_1118_
						   + ((i_1120_ & 0xff00)
						      * i_1119_))
						  & 0xff0000)) >> 8;
				    } else if (anInt8830 != 255) {
					int i_1121_
					    = ((i_1117_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_1122_
					    = ((i_1117_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_1123_
					    = ((i_1117_ & 0xff) * anInt8836
					       & 0xff00);
					i_1117_ = (i_1121_ | i_1122_
						   | i_1123_) >>> 8;
					int i_1124_ = is[i_1102_];
					is[i_1102_]
					    = (((((i_1117_ & 0xff00ff)
						  * anInt8830)
						 + ((i_1124_ & 0xff00ff)
						    * anInt8831))
						& ~0xff00ff)
					       + ((((i_1117_ & 0xff00)
						    * anInt8830)
						   + ((i_1124_ & 0xff00)
						      * anInt8831))
						  & 0xff0000)) >> 8;
				    } else {
					int i_1125_
					    = ((i_1117_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_1126_
					    = ((i_1117_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_1127_
					    = ((i_1117_ & 0xff) * anInt8836
					       & 0xff00);
					is[i_1102_] = (i_1125_ | i_1126_
						       | i_1127_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_1128_ = (((Class151_Sub1_Sub1) this)
						.aByteArray11258[i_1101_]);
				int i_1129_ = (i_1128_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_1128_])
					       : 0);
				int i_1130_ = anInt8829;
				int i_1131_ = i_1129_ + i_1130_;
				int i_1132_ = ((i_1129_ & 0xff00ff)
					       + (i_1130_ & 0xff00ff));
				int i_1133_
				    = ((i_1132_ & 0x1000100)
				       + (i_1131_ - i_1132_ & 0x10000));
				i_1133_
				    = i_1131_ - i_1133_ | i_1133_ - (i_1133_
								     >>> 8);
				if (i_1129_ == 0 && anInt8830 != 255) {
				    i_1129_ = i_1133_;
				    i_1133_ = is[i_1102_];
				    i_1133_
					= ((((i_1129_ & 0xff00ff) * anInt8830
					     + ((i_1133_ & 0xff00ff)
						* anInt8831))
					    & ~0xff00ff)
					   + (((i_1129_ & 0xff00) * anInt8830
					       + ((i_1133_ & 0xff00)
						  * anInt8831))
					      & 0xff0000)) >> 8;
				}
				is[i_1102_] = i_1133_;
			    } else if (i == 2) {
				int i_1134_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_1101_]);
				if (i_1134_ != 0) {
				    int i_1135_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1134_ & 0xff]);
				    int i_1136_
					= ((i_1135_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_1137_
					= ((i_1135_ & 0xff00) * anInt8830
					   & 0xff0000);
				    is[i_1102_++] = ((i_1136_ | i_1137_)
						     >>> 8) + anInt8834;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_609_ == 2) {
			    if (i == 1) {
				int i_1138_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_1101_]);
				if (i_1138_ != 0) {
				    int i_1139_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1138_ & 0xff]);
				    int i_1140_ = is[i_1102_];
				    int i_1141_ = i_1139_ + i_1140_;
				    int i_1142_ = ((i_1139_ & 0xff00ff)
						   + (i_1140_ & 0xff00ff));
				    i_1140_
					= ((i_1142_ & 0x1000100)
					   + (i_1141_ - i_1142_ & 0x10000));
				    is[i_1102_]
					= (i_1141_ - i_1140_
					   | i_1140_ - (i_1140_ >>> 8));
				}
			    } else if (i == 0) {
				int i_1143_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_1101_]);
				if (i_1143_ != 0) {
				    int i_1144_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1143_ & 0xff]);
				    int i_1145_
					= ((i_1144_ & 0xff0000) * anInt8815
					   & ~0xffffff);
				    int i_1146_
					= ((i_1144_ & 0xff00) * anInt8833
					   & 0xff0000);
				    int i_1147_ = ((i_1144_ & 0xff) * anInt8836
						   & 0xff00);
				    i_1144_
					= (i_1145_ | i_1146_ | i_1147_) >>> 8;
				    int i_1148_ = is[i_1102_];
				    int i_1149_ = i_1144_ + i_1148_;
				    int i_1150_ = ((i_1144_ & 0xff00ff)
						   + (i_1148_ & 0xff00ff));
				    i_1148_
					= ((i_1150_ & 0x1000100)
					   + (i_1149_ - i_1150_ & 0x10000));
				    is[i_1102_]
					= (i_1149_ - i_1148_
					   | i_1148_ - (i_1148_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_1151_ = (((Class151_Sub1_Sub1) this)
						.aByteArray11258[i_1101_]);
				int i_1152_ = (i_1151_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_1151_])
					       : 0);
				int i_1153_ = anInt8829;
				int i_1154_ = i_1152_ + i_1153_;
				int i_1155_ = ((i_1152_ & 0xff00ff)
					       + (i_1153_ & 0xff00ff));
				int i_1156_
				    = ((i_1155_ & 0x1000100)
				       + (i_1154_ - i_1155_ & 0x10000));
				i_1156_
				    = i_1154_ - i_1156_ | i_1156_ - (i_1156_
								     >>> 8);
				if (i_1152_ == 0 && anInt8830 != 255) {
				    i_1152_ = i_1156_;
				    i_1156_ = is[i_1102_];
				    i_1156_
					= ((((i_1152_ & 0xff00ff) * anInt8830
					     + ((i_1156_ & 0xff00ff)
						* anInt8831))
					    & ~0xff00ff)
					   + (((i_1152_ & 0xff00) * anInt8830
					       + ((i_1156_ & 0xff00)
						  * anInt8831))
					      & 0xff0000)) >> 8;
				}
				is[i_1102_] = i_1156_;
			    } else if (i == 2) {
				int i_1157_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_1101_]);
				if (i_1157_ != 0) {
				    int i_1158_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1157_ & 0xff]);
				    int i_1159_
					= ((i_1158_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_1160_
					= ((i_1158_ & 0xff00) * anInt8830
					   & 0xff0000);
				    i_1158_ = (((i_1159_ | i_1160_) >>> 8)
					       + anInt8834);
				    int i_1161_ = is[i_1102_];
				    int i_1162_ = i_1158_ + i_1161_;
				    int i_1163_ = ((i_1158_ & 0xff00ff)
						   + (i_1161_ & 0xff00ff));
				    i_1161_
					= ((i_1163_ & 0x1000100)
					   + (i_1162_ - i_1163_ & 0x10000));
				    is[i_1102_]
					= (i_1162_ - i_1161_
					   | i_1161_ - (i_1161_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_1096_ += anInt8822;
			i_1097_ += anInt8825;
		    }
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else {
		for (int i_1164_ = anInt8816; i_1164_ < 0; i_1164_++) {
		    int i_1165_ = anInt8818;
		    int i_1166_ = anInt8807 + anInt8805;
		    int i_1167_ = anInt8826 + anInt8828;
		    int i_1168_ = anInt8809;
		    if (i_1166_ < 0) {
			int i_1169_ = (anInt8822 - 1 - i_1166_) / anInt8822;
			i_1168_ += i_1169_;
			i_1166_ += anInt8822 * i_1169_;
			i_1167_ += anInt8825 * i_1169_;
			i_1165_ += i_1169_;
		    }
		    int i_1170_;
		    if ((i_1170_
			 = (1 + i_1166_
			    - (((Class151_Sub1_Sub1) this).anInt8803 << 12)
			    - anInt8822) / anInt8822)
			> i_1168_)
			i_1168_ = i_1170_;
		    if (i_1167_ < 0) {
			i_1170_ = (anInt8825 - 1 - i_1167_) / anInt8825;
			i_1168_ += i_1170_;
			i_1166_ += anInt8822 * i_1170_;
			i_1167_ += anInt8825 * i_1170_;
			i_1165_ += i_1170_;
		    }
		    if ((i_1170_
			 = (1 + i_1167_
			    - (((Class151_Sub1_Sub1) this).anInt8804 << 12)
			    - anInt8825) / anInt8825)
			> i_1168_)
			i_1168_ = i_1170_;
		    for (/**/; i_1168_ < 0; i_1168_++) {
			int i_1171_
			    = (((i_1167_ >> 12)
				* ((Class151_Sub1_Sub1) this).anInt8803)
			       + (i_1166_ >> 12));
			int i_1172_ = i_1165_++;
			if (i_609_ == 0) {
			    if (i == 1)
				is[i_1172_]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1171_]) & 0xff]);
			    else if (i == 0) {
				int i_1173_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1171_]) & 0xff]);
				int i_1174_ = ((i_1173_ & 0xff0000) * anInt8815
					       & ~0xffffff);
				int i_1175_ = ((i_1173_ & 0xff00) * anInt8833
					       & 0xff0000);
				int i_1176_
				    = (i_1173_ & 0xff) * anInt8836 & 0xff00;
				is[i_1172_]
				    = (i_1174_ | i_1175_ | i_1176_) >>> 8;
			    } else if (i == 3) {
				int i_1177_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1171_]) & 0xff]);
				int i_1178_ = anInt8829;
				int i_1179_ = i_1177_ + i_1178_;
				int i_1180_ = ((i_1177_ & 0xff00ff)
					       + (i_1178_ & 0xff00ff));
				int i_1181_
				    = ((i_1180_ & 0x1000100)
				       + (i_1179_ - i_1180_ & 0x10000));
				is[i_1172_]
				    = i_1179_ - i_1181_ | i_1181_ - (i_1181_
								     >>> 8);
			    } else if (i == 2) {
				int i_1182_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1171_]) & 0xff]);
				int i_1183_ = ((i_1182_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
				int i_1184_ = ((i_1182_ & 0xff00) * anInt8830
					       & 0xff0000);
				is[i_1172_]
				    = ((i_1183_ | i_1184_) >>> 8) + anInt8834;
			    } else
				throw new IllegalArgumentException();
			} else if (i_609_ == 1) {
			    if (i == 1) {
				int i_1185_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_1171_]);
				if (i_1185_ != 0)
				    is[i_1172_]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1185_ & 0xff]);
			    } else if (i == 0) {
				int i_1186_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_1171_]);
				if (i_1186_ != 0) {
				    int i_1187_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1186_ & 0xff]);
				    if ((anInt8829 & 0xffffff) == 16777215) {
					int i_1188_ = anInt8829 >>> 24;
					int i_1189_ = 256 - i_1188_;
					int i_1190_ = is[i_1172_];
					is[i_1172_]
					    = ((((i_1187_ & 0xff00ff) * i_1188_
						 + ((i_1190_ & 0xff00ff)
						    * i_1189_))
						& ~0xff00ff)
					       + (((i_1187_ & 0xff00) * i_1188_
						   + ((i_1190_ & 0xff00)
						      * i_1189_))
						  & 0xff0000)) >> 8;
				    } else if (anInt8830 != 255) {
					int i_1191_
					    = ((i_1187_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_1192_
					    = ((i_1187_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_1193_
					    = ((i_1187_ & 0xff) * anInt8836
					       & 0xff00);
					i_1187_ = (i_1191_ | i_1192_
						   | i_1193_) >>> 8;
					int i_1194_ = is[i_1172_];
					is[i_1172_]
					    = (((((i_1187_ & 0xff00ff)
						  * anInt8830)
						 + ((i_1194_ & 0xff00ff)
						    * anInt8831))
						& ~0xff00ff)
					       + ((((i_1187_ & 0xff00)
						    * anInt8830)
						   + ((i_1194_ & 0xff00)
						      * anInt8831))
						  & 0xff0000)) >> 8;
				    } else {
					int i_1195_
					    = ((i_1187_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_1196_
					    = ((i_1187_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_1197_
					    = ((i_1187_ & 0xff) * anInt8836
					       & 0xff00);
					is[i_1172_] = (i_1195_ | i_1196_
						       | i_1197_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_1198_ = (((Class151_Sub1_Sub1) this)
						.aByteArray11258[i_1171_]);
				int i_1199_ = (i_1198_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_1198_])
					       : 0);
				int i_1200_ = anInt8829;
				int i_1201_ = i_1199_ + i_1200_;
				int i_1202_ = ((i_1199_ & 0xff00ff)
					       + (i_1200_ & 0xff00ff));
				int i_1203_
				    = ((i_1202_ & 0x1000100)
				       + (i_1201_ - i_1202_ & 0x10000));
				i_1203_
				    = i_1201_ - i_1203_ | i_1203_ - (i_1203_
								     >>> 8);
				if (i_1199_ == 0 && anInt8830 != 255) {
				    i_1199_ = i_1203_;
				    i_1203_ = is[i_1172_];
				    i_1203_
					= ((((i_1199_ & 0xff00ff) * anInt8830
					     + ((i_1203_ & 0xff00ff)
						* anInt8831))
					    & ~0xff00ff)
					   + (((i_1199_ & 0xff00) * anInt8830
					       + ((i_1203_ & 0xff00)
						  * anInt8831))
					      & 0xff0000)) >> 8;
				}
				is[i_1172_] = i_1203_;
			    } else if (i == 2) {
				int i_1204_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_1171_]);
				if (i_1204_ != 0) {
				    int i_1205_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1204_ & 0xff]);
				    int i_1206_
					= ((i_1205_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_1207_
					= ((i_1205_ & 0xff00) * anInt8830
					   & 0xff0000);
				    is[i_1172_++] = ((i_1206_ | i_1207_)
						     >>> 8) + anInt8834;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_609_ == 2) {
			    if (i == 1) {
				int i_1208_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_1171_]);
				if (i_1208_ != 0) {
				    int i_1209_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1208_ & 0xff]);
				    int i_1210_ = is[i_1172_];
				    int i_1211_ = i_1209_ + i_1210_;
				    int i_1212_ = ((i_1209_ & 0xff00ff)
						   + (i_1210_ & 0xff00ff));
				    i_1210_
					= ((i_1212_ & 0x1000100)
					   + (i_1211_ - i_1212_ & 0x10000));
				    is[i_1172_]
					= (i_1211_ - i_1210_
					   | i_1210_ - (i_1210_ >>> 8));
				}
			    } else if (i == 0) {
				int i_1213_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_1171_]);
				if (i_1213_ != 0) {
				    int i_1214_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1213_ & 0xff]);
				    int i_1215_
					= ((i_1214_ & 0xff0000) * anInt8815
					   & ~0xffffff);
				    int i_1216_
					= ((i_1214_ & 0xff00) * anInt8833
					   & 0xff0000);
				    int i_1217_ = ((i_1214_ & 0xff) * anInt8836
						   & 0xff00);
				    i_1214_
					= (i_1215_ | i_1216_ | i_1217_) >>> 8;
				    int i_1218_ = is[i_1172_];
				    int i_1219_ = i_1214_ + i_1218_;
				    int i_1220_ = ((i_1214_ & 0xff00ff)
						   + (i_1218_ & 0xff00ff));
				    i_1218_
					= ((i_1220_ & 0x1000100)
					   + (i_1219_ - i_1220_ & 0x10000));
				    is[i_1172_]
					= (i_1219_ - i_1218_
					   | i_1218_ - (i_1218_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_1221_ = (((Class151_Sub1_Sub1) this)
						.aByteArray11258[i_1171_]);
				int i_1222_ = (i_1221_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_1221_])
					       : 0);
				int i_1223_ = anInt8829;
				int i_1224_ = i_1222_ + i_1223_;
				int i_1225_ = ((i_1222_ & 0xff00ff)
					       + (i_1223_ & 0xff00ff));
				int i_1226_
				    = ((i_1225_ & 0x1000100)
				       + (i_1224_ - i_1225_ & 0x10000));
				i_1226_
				    = i_1224_ - i_1226_ | i_1226_ - (i_1226_
								     >>> 8);
				if (i_1222_ == 0 && anInt8830 != 255) {
				    i_1222_ = i_1226_;
				    i_1226_ = is[i_1172_];
				    i_1226_
					= ((((i_1222_ & 0xff00ff) * anInt8830
					     + ((i_1226_ & 0xff00ff)
						* anInt8831))
					    & ~0xff00ff)
					   + (((i_1222_ & 0xff00) * anInt8830
					       + ((i_1226_ & 0xff00)
						  * anInt8831))
					      & 0xff0000)) >> 8;
				}
				is[i_1172_] = i_1226_;
			    } else if (i == 2) {
				int i_1227_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_1171_]);
				if (i_1227_ != 0) {
				    int i_1228_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1227_ & 0xff]);
				    int i_1229_
					= ((i_1228_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_1230_
					= ((i_1228_ & 0xff00) * anInt8830
					   & 0xff0000);
				    i_1228_ = (((i_1229_ | i_1230_) >>> 8)
					       + anInt8834);
				    int i_1231_ = is[i_1172_];
				    int i_1232_ = i_1228_ + i_1231_;
				    int i_1233_ = ((i_1228_ & 0xff00ff)
						   + (i_1231_ & 0xff00ff));
				    i_1231_
					= ((i_1233_ & 0x1000100)
					   + (i_1232_ - i_1233_ & 0x10000));
				    is[i_1172_]
					= (i_1232_ - i_1231_
					   | i_1231_ - (i_1231_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_1166_ += anInt8822;
			i_1167_ += anInt8825;
		    }
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    }
	}
    }
    
    void method8298(int[] is, int[] is_1234_, int i, int i_1235_) {
	int[] is_1236_ = (((Class173_Sub3)
			   ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
			  .anIntArray9719);
	if (is_1236_ != null) {
	    if (anInt8822 == 0) {
		if (anInt8825 == 0) {
		    int i_1237_ = anInt8816;
		    while (i_1237_ < 0) {
			int i_1238_ = i_1237_ + i_1235_;
			if (i_1238_ >= 0) {
			    if (i_1238_ >= is.length)
				break;
			    int i_1239_ = anInt8818;
			    int i_1240_ = anInt8807;
			    int i_1241_ = anInt8826;
			    int i_1242_ = anInt8809;
			    if (i_1240_ >= 0 && i_1241_ >= 0
				&& (i_1240_
				    - (((Class151_Sub1_Sub1) this).anInt8803
				       << 12)) < 0
				&& (i_1241_
				    - (((Class151_Sub1_Sub1) this).anInt8804
				       << 12)) < 0) {
				int i_1243_ = is[i_1238_] - i;
				int i_1244_ = -is_1234_[i_1238_];
				int i_1245_ = i_1243_ - (i_1239_ - anInt8818);
				if (i_1245_ > 0) {
				    i_1239_ += i_1245_;
				    i_1242_ += i_1245_;
				    i_1240_ += anInt8822 * i_1245_;
				    i_1241_ += anInt8825 * i_1245_;
				} else
				    i_1244_ -= i_1245_;
				if (i_1242_ < i_1244_)
				    i_1242_ = i_1244_;
				for (/**/; i_1242_ < 0; i_1242_++) {
				    int i_1246_
					= (((Class151_Sub1_Sub1) this)
					   .aByteArray11258
					   [(((i_1241_ >> 12)
					      * (((Class151_Sub1_Sub1) this)
						 .anInt8803))
					     + (i_1240_ >> 12))]);
				    if (i_1246_ != 0)
					is_1236_[i_1239_++]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_1246_ & 0xff]);
				    else
					i_1239_++;
				}
			    }
			}
			i_1237_++;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_1247_ = anInt8816;
		    while (i_1247_ < 0) {
			int i_1248_ = i_1247_ + i_1235_;
			if (i_1248_ >= 0) {
			    if (i_1248_ >= is.length)
				break;
			    int i_1249_ = anInt8818;
			    int i_1250_ = anInt8807;
			    int i_1251_ = anInt8826 + anInt8828;
			    int i_1252_ = anInt8809;
			    if (i_1250_ >= 0
				&& (i_1250_
				    - (((Class151_Sub1_Sub1) this).anInt8803
				       << 12)) < 0) {
				int i_1253_;
				if ((i_1253_
				     = i_1251_ - ((((Class151_Sub1_Sub1) this)
						   .anInt8804)
						  << 12))
				    >= 0) {
				    i_1253_
					= (anInt8825 - i_1253_) / anInt8825;
				    i_1252_ += i_1253_;
				    i_1251_ += anInt8825 * i_1253_;
				    i_1249_ += i_1253_;
				}
				if ((i_1253_
				     = (i_1251_ - anInt8825) / anInt8825)
				    > i_1252_)
				    i_1252_ = i_1253_;
				int i_1254_ = is[i_1248_] - i;
				int i_1255_ = -is_1234_[i_1248_];
				int i_1256_ = i_1254_ - (i_1249_ - anInt8818);
				if (i_1256_ > 0) {
				    i_1249_ += i_1256_;
				    i_1252_ += i_1256_;
				    i_1250_ += anInt8822 * i_1256_;
				    i_1251_ += anInt8825 * i_1256_;
				} else
				    i_1255_ -= i_1256_;
				if (i_1252_ < i_1255_)
				    i_1252_ = i_1255_;
				for (/**/; i_1252_ < 0; i_1252_++) {
				    int i_1257_
					= (((Class151_Sub1_Sub1) this)
					   .aByteArray11258
					   [(((i_1251_ >> 12)
					      * (((Class151_Sub1_Sub1) this)
						 .anInt8803))
					     + (i_1250_ >> 12))]);
				    if (i_1257_ != 0)
					is_1236_[i_1249_++]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_1257_ & 0xff]);
				    else
					i_1249_++;
				    i_1251_ += anInt8825;
				}
			    }
			}
			i_1247_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_1258_ = anInt8816;
		    while (i_1258_ < 0) {
			int i_1259_ = i_1258_ + i_1235_;
			if (i_1259_ >= 0) {
			    if (i_1259_ >= is.length)
				break;
			    int i_1260_ = anInt8818;
			    int i_1261_ = anInt8807;
			    int i_1262_ = anInt8826 + anInt8828;
			    int i_1263_ = anInt8809;
			    if (i_1261_ >= 0
				&& (i_1261_
				    - (((Class151_Sub1_Sub1) this).anInt8803
				       << 12)) < 0) {
				if (i_1262_ < 0) {
				    int i_1264_ = ((anInt8825 - 1 - i_1262_)
						   / anInt8825);
				    i_1263_ += i_1264_;
				    i_1262_ += anInt8825 * i_1264_;
				    i_1260_ += i_1264_;
				}
				int i_1265_;
				if ((i_1265_ = (1 + i_1262_
						- ((((Class151_Sub1_Sub1) this)
						    .anInt8804)
						   << 12)
						- anInt8825) / anInt8825)
				    > i_1263_)
				    i_1263_ = i_1265_;
				int i_1266_ = is[i_1259_] - i;
				int i_1267_ = -is_1234_[i_1259_];
				int i_1268_ = i_1266_ - (i_1260_ - anInt8818);
				if (i_1268_ > 0) {
				    i_1260_ += i_1268_;
				    i_1263_ += i_1268_;
				    i_1261_ += anInt8822 * i_1268_;
				    i_1262_ += anInt8825 * i_1268_;
				} else
				    i_1267_ -= i_1268_;
				if (i_1263_ < i_1267_)
				    i_1263_ = i_1267_;
				for (/**/; i_1263_ < 0; i_1263_++) {
				    int i_1269_
					= (((Class151_Sub1_Sub1) this)
					   .aByteArray11258
					   [(((i_1262_ >> 12)
					      * (((Class151_Sub1_Sub1) this)
						 .anInt8803))
					     + (i_1261_ >> 12))]);
				    if (i_1269_ != 0)
					is_1236_[i_1260_++]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_1269_ & 0xff]);
				    else
					i_1260_++;
				    i_1262_ += anInt8825;
				}
			    }
			}
			i_1258_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8822 < 0) {
		if (anInt8825 == 0) {
		    int i_1270_ = anInt8816;
		    while (i_1270_ < 0) {
			int i_1271_ = i_1270_ + i_1235_;
			if (i_1271_ >= 0) {
			    if (i_1271_ >= is.length)
				break;
			    int i_1272_ = anInt8818;
			    int i_1273_ = anInt8807 + anInt8805;
			    int i_1274_ = anInt8826;
			    int i_1275_ = anInt8809;
			    if (i_1274_ >= 0
				&& (i_1274_
				    - (((Class151_Sub1_Sub1) this).anInt8804
				       << 12)) < 0) {
				int i_1276_;
				if ((i_1276_
				     = i_1273_ - ((((Class151_Sub1_Sub1) this)
						   .anInt8803)
						  << 12))
				    >= 0) {
				    i_1276_
					= (anInt8822 - i_1276_) / anInt8822;
				    i_1275_ += i_1276_;
				    i_1273_ += anInt8822 * i_1276_;
				    i_1272_ += i_1276_;
				}
				if ((i_1276_
				     = (i_1273_ - anInt8822) / anInt8822)
				    > i_1275_)
				    i_1275_ = i_1276_;
				int i_1277_ = is[i_1271_] - i;
				int i_1278_ = -is_1234_[i_1271_];
				int i_1279_ = i_1277_ - (i_1272_ - anInt8818);
				if (i_1279_ > 0) {
				    i_1272_ += i_1279_;
				    i_1275_ += i_1279_;
				    i_1273_ += anInt8822 * i_1279_;
				    i_1274_ += anInt8825 * i_1279_;
				} else
				    i_1278_ -= i_1279_;
				if (i_1275_ < i_1278_)
				    i_1275_ = i_1278_;
				for (/**/; i_1275_ < 0; i_1275_++) {
				    int i_1280_
					= (((Class151_Sub1_Sub1) this)
					   .aByteArray11258
					   [(((i_1274_ >> 12)
					      * (((Class151_Sub1_Sub1) this)
						 .anInt8803))
					     + (i_1273_ >> 12))]);
				    if (i_1280_ != 0)
					is_1236_[i_1272_++]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_1280_ & 0xff]);
				    else
					i_1272_++;
				    i_1273_ += anInt8822;
				}
			    }
			}
			i_1270_++;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_1281_ = anInt8816;
		    while (i_1281_ < 0) {
			int i_1282_ = i_1281_ + i_1235_;
			if (i_1282_ >= 0) {
			    if (i_1282_ >= is.length)
				break;
			    int i_1283_ = anInt8818;
			    int i_1284_ = anInt8807 + anInt8805;
			    int i_1285_ = anInt8826 + anInt8828;
			    int i_1286_ = anInt8809;
			    int i_1287_;
			    if ((i_1287_
				 = (i_1284_
				    - (((Class151_Sub1_Sub1) this).anInt8803
				       << 12)))
				>= 0) {
				i_1287_ = (anInt8822 - i_1287_) / anInt8822;
				i_1286_ += i_1287_;
				i_1284_ += anInt8822 * i_1287_;
				i_1285_ += anInt8825 * i_1287_;
				i_1283_ += i_1287_;
			    }
			    if ((i_1287_ = (i_1284_ - anInt8822) / anInt8822)
				> i_1286_)
				i_1286_ = i_1287_;
			    if ((i_1287_
				 = (i_1285_
				    - (((Class151_Sub1_Sub1) this).anInt8804
				       << 12)))
				>= 0) {
				i_1287_ = (anInt8825 - i_1287_) / anInt8825;
				i_1286_ += i_1287_;
				i_1284_ += anInt8822 * i_1287_;
				i_1285_ += anInt8825 * i_1287_;
				i_1283_ += i_1287_;
			    }
			    if ((i_1287_ = (i_1285_ - anInt8825) / anInt8825)
				> i_1286_)
				i_1286_ = i_1287_;
			    int i_1288_ = is[i_1282_] - i;
			    int i_1289_ = -is_1234_[i_1282_];
			    int i_1290_ = i_1288_ - (i_1283_ - anInt8818);
			    if (i_1290_ > 0) {
				i_1283_ += i_1290_;
				i_1286_ += i_1290_;
				i_1284_ += anInt8822 * i_1290_;
				i_1285_ += anInt8825 * i_1290_;
			    } else
				i_1289_ -= i_1290_;
			    if (i_1286_ < i_1289_)
				i_1286_ = i_1289_;
			    for (/**/; i_1286_ < 0; i_1286_++) {
				int i_1291_
				    = (((Class151_Sub1_Sub1) this)
				       .aByteArray11258
				       [((i_1285_ >> 12)
					 * (((Class151_Sub1_Sub1) this)
					    .anInt8803)) + (i_1284_ >> 12)]);
				if (i_1291_ != 0)
				    is_1236_[i_1283_++]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1291_ & 0xff]);
				else
				    i_1283_++;
				i_1284_ += anInt8822;
				i_1285_ += anInt8825;
			    }
			}
			i_1281_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_1292_ = anInt8816;
		    while (i_1292_ < 0) {
			int i_1293_ = i_1292_ + i_1235_;
			if (i_1293_ >= 0) {
			    if (i_1293_ >= is.length)
				break;
			    int i_1294_ = anInt8818;
			    int i_1295_ = anInt8807 + anInt8805;
			    int i_1296_ = anInt8826 + anInt8828;
			    int i_1297_ = anInt8809;
			    int i_1298_;
			    if ((i_1298_
				 = (i_1295_
				    - (((Class151_Sub1_Sub1) this).anInt8803
				       << 12)))
				>= 0) {
				i_1298_ = (anInt8822 - i_1298_) / anInt8822;
				i_1297_ += i_1298_;
				i_1295_ += anInt8822 * i_1298_;
				i_1296_ += anInt8825 * i_1298_;
				i_1294_ += i_1298_;
			    }
			    if ((i_1298_ = (i_1295_ - anInt8822) / anInt8822)
				> i_1297_)
				i_1297_ = i_1298_;
			    if (i_1296_ < 0) {
				i_1298_
				    = (anInt8825 - 1 - i_1296_) / anInt8825;
				i_1297_ += i_1298_;
				i_1295_ += anInt8822 * i_1298_;
				i_1296_ += anInt8825 * i_1298_;
				i_1294_ += i_1298_;
			    }
			    if ((i_1298_
				 = (1 + i_1296_
				    - (((Class151_Sub1_Sub1) this).anInt8804
				       << 12)
				    - anInt8825) / anInt8825)
				> i_1297_)
				i_1297_ = i_1298_;
			    int i_1299_ = is[i_1293_] - i;
			    int i_1300_ = -is_1234_[i_1293_];
			    int i_1301_ = i_1299_ - (i_1294_ - anInt8818);
			    if (i_1301_ > 0) {
				i_1294_ += i_1301_;
				i_1297_ += i_1301_;
				i_1295_ += anInt8822 * i_1301_;
				i_1296_ += anInt8825 * i_1301_;
			    } else
				i_1300_ -= i_1301_;
			    if (i_1297_ < i_1300_)
				i_1297_ = i_1300_;
			    for (/**/; i_1297_ < 0; i_1297_++) {
				int i_1302_
				    = (((Class151_Sub1_Sub1) this)
				       .aByteArray11258
				       [((i_1296_ >> 12)
					 * (((Class151_Sub1_Sub1) this)
					    .anInt8803)) + (i_1295_ >> 12)]);
				if (i_1302_ != 0)
				    is_1236_[i_1294_++]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1302_ & 0xff]);
				else
				    i_1294_++;
				i_1295_ += anInt8822;
				i_1296_ += anInt8825;
			    }
			}
			i_1292_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8825 == 0) {
		int i_1303_ = anInt8816;
		while (i_1303_ < 0) {
		    int i_1304_ = i_1303_ + i_1235_;
		    if (i_1304_ >= 0) {
			if (i_1304_ >= is.length)
			    break;
			int i_1305_ = anInt8818;
			int i_1306_ = anInt8807 + anInt8805;
			int i_1307_ = anInt8826;
			int i_1308_ = anInt8809;
			if (i_1307_ >= 0
			    && i_1307_ - (((Class151_Sub1_Sub1) this).anInt8804
					  << 12) < 0) {
			    if (i_1306_ < 0) {
				int i_1309_
				    = (anInt8822 - 1 - i_1306_) / anInt8822;
				i_1308_ += i_1309_;
				i_1306_ += anInt8822 * i_1309_;
				i_1305_ += i_1309_;
			    }
			    int i_1310_;
			    if ((i_1310_
				 = (1 + i_1306_
				    - (((Class151_Sub1_Sub1) this).anInt8803
				       << 12)
				    - anInt8822) / anInt8822)
				> i_1308_)
				i_1308_ = i_1310_;
			    int i_1311_ = is[i_1304_] - i;
			    int i_1312_ = -is_1234_[i_1304_];
			    int i_1313_ = i_1311_ - (i_1305_ - anInt8818);
			    if (i_1313_ > 0) {
				i_1305_ += i_1313_;
				i_1308_ += i_1313_;
				i_1306_ += anInt8822 * i_1313_;
				i_1307_ += anInt8825 * i_1313_;
			    } else
				i_1312_ -= i_1313_;
			    if (i_1308_ < i_1312_)
				i_1308_ = i_1312_;
			    for (/**/; i_1308_ < 0; i_1308_++) {
				int i_1314_
				    = (((Class151_Sub1_Sub1) this)
				       .aByteArray11258
				       [((i_1307_ >> 12)
					 * (((Class151_Sub1_Sub1) this)
					    .anInt8803)) + (i_1306_ >> 12)]);
				if (i_1314_ != 0)
				    is_1236_[i_1305_++]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1314_ & 0xff]);
				else
				    i_1305_++;
				i_1306_ += anInt8822;
			    }
			}
		    }
		    i_1303_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else if (anInt8825 < 0) {
		int i_1315_ = anInt8816;
		while (i_1315_ < 0) {
		    int i_1316_ = i_1315_ + i_1235_;
		    if (i_1316_ >= 0) {
			if (i_1316_ >= is.length)
			    break;
			int i_1317_ = anInt8818;
			int i_1318_ = anInt8807 + anInt8805;
			int i_1319_ = anInt8826 + anInt8828;
			int i_1320_ = anInt8809;
			if (i_1318_ < 0) {
			    int i_1321_
				= (anInt8822 - 1 - i_1318_) / anInt8822;
			    i_1320_ += i_1321_;
			    i_1318_ += anInt8822 * i_1321_;
			    i_1319_ += anInt8825 * i_1321_;
			    i_1317_ += i_1321_;
			}
			int i_1322_;
			if ((i_1322_
			     = (1 + i_1318_
				- (((Class151_Sub1_Sub1) this).anInt8803 << 12)
				- anInt8822) / anInt8822)
			    > i_1320_)
			    i_1320_ = i_1322_;
			if ((i_1322_
			     = i_1319_ - (((Class151_Sub1_Sub1) this).anInt8804
					  << 12))
			    >= 0) {
			    i_1322_ = (anInt8825 - i_1322_) / anInt8825;
			    i_1320_ += i_1322_;
			    i_1318_ += anInt8822 * i_1322_;
			    i_1319_ += anInt8825 * i_1322_;
			    i_1317_ += i_1322_;
			}
			if ((i_1322_ = (i_1319_ - anInt8825) / anInt8825)
			    > i_1320_)
			    i_1320_ = i_1322_;
			int i_1323_ = is[i_1316_] - i;
			int i_1324_ = -is_1234_[i_1316_];
			int i_1325_ = i_1323_ - (i_1317_ - anInt8818);
			if (i_1325_ > 0) {
			    i_1317_ += i_1325_;
			    i_1320_ += i_1325_;
			    i_1318_ += anInt8822 * i_1325_;
			    i_1319_ += anInt8825 * i_1325_;
			} else
			    i_1324_ -= i_1325_;
			if (i_1320_ < i_1324_)
			    i_1320_ = i_1324_;
			for (/**/; i_1320_ < 0; i_1320_++) {
			    int i_1326_
				= (((Class151_Sub1_Sub1) this).aByteArray11258
				   [(((i_1319_ >> 12)
				      * ((Class151_Sub1_Sub1) this).anInt8803)
				     + (i_1318_ >> 12))]);
			    if (i_1326_ != 0)
				is_1236_[i_1317_++]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257[i_1326_ & 0xff]);
			    else
				i_1317_++;
			    i_1318_ += anInt8822;
			    i_1319_ += anInt8825;
			}
		    }
		    i_1315_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else {
		int i_1327_ = anInt8816;
		while (i_1327_ < 0) {
		    int i_1328_ = i_1327_ + i_1235_;
		    if (i_1328_ >= 0) {
			if (i_1328_ >= is.length)
			    break;
			int i_1329_ = anInt8818;
			int i_1330_ = anInt8807 + anInt8805;
			int i_1331_ = anInt8826 + anInt8828;
			int i_1332_ = anInt8809;
			if (i_1330_ < 0) {
			    int i_1333_
				= (anInt8822 - 1 - i_1330_) / anInt8822;
			    i_1332_ += i_1333_;
			    i_1330_ += anInt8822 * i_1333_;
			    i_1331_ += anInt8825 * i_1333_;
			    i_1329_ += i_1333_;
			}
			int i_1334_;
			if ((i_1334_
			     = (1 + i_1330_
				- (((Class151_Sub1_Sub1) this).anInt8803 << 12)
				- anInt8822) / anInt8822)
			    > i_1332_)
			    i_1332_ = i_1334_;
			if (i_1331_ < 0) {
			    i_1334_ = (anInt8825 - 1 - i_1331_) / anInt8825;
			    i_1332_ += i_1334_;
			    i_1330_ += anInt8822 * i_1334_;
			    i_1331_ += anInt8825 * i_1334_;
			    i_1329_ += i_1334_;
			}
			if ((i_1334_
			     = (1 + i_1331_
				- (((Class151_Sub1_Sub1) this).anInt8804 << 12)
				- anInt8825) / anInt8825)
			    > i_1332_)
			    i_1332_ = i_1334_;
			int i_1335_ = is[i_1328_] - i;
			int i_1336_ = -is_1234_[i_1328_];
			int i_1337_ = i_1335_ - (i_1329_ - anInt8818);
			if (i_1337_ > 0) {
			    i_1329_ += i_1337_;
			    i_1332_ += i_1337_;
			    i_1330_ += anInt8822 * i_1337_;
			    i_1331_ += anInt8825 * i_1337_;
			} else
			    i_1336_ -= i_1337_;
			if (i_1332_ < i_1336_)
			    i_1332_ = i_1336_;
			for (/**/; i_1332_ < 0; i_1332_++) {
			    int i_1338_
				= (((Class151_Sub1_Sub1) this).aByteArray11258
				   [(((i_1331_ >> 12)
				      * ((Class151_Sub1_Sub1) this).anInt8803)
				     + (i_1330_ >> 12))]);
			    if (i_1338_ != 0)
				is_1236_[i_1329_++]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257[i_1338_ & 0xff]);
			    else
				i_1329_++;
			    i_1330_ += anInt8822;
			    i_1331_ += anInt8825;
			}
		    }
		    i_1327_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    }
	}
    }
    
    public void method1811(int i, int i_1339_, int i_1340_, int i_1341_,
			   int i_1342_) {
	if (((Class151_Sub1_Sub1) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    int i_1343_ = (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					     .aClass173_Sub3_8814)).anInt9735
			   * 111437289);
	    i += ((Class151_Sub1_Sub1) this).anInt8806;
	    i_1339_ += ((Class151_Sub1_Sub1) this).anInt8819;
	    int i_1344_ = i_1339_ * i_1343_ + i;
	    int i_1345_ = 0;
	    int i_1346_ = ((Class151_Sub1_Sub1) this).anInt8804;
	    int i_1347_ = ((Class151_Sub1_Sub1) this).anInt8803;
	    int i_1348_ = i_1343_ - i_1347_;
	    int i_1349_ = 0;
	    if (i_1339_ < (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					     .aClass173_Sub3_8814)).anInt9725
			   * 592117349)) {
		int i_1350_ = ((((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						  .aClass173_Sub3_8814))
				.anInt9725) * 592117349
			       - i_1339_);
		i_1346_ -= i_1350_;
		i_1339_ = (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					     .aClass173_Sub3_8814)).anInt9725
			   * 592117349);
		i_1345_ += i_1350_ * i_1347_;
		i_1344_ += i_1350_ * i_1343_;
	    }
	    if (i_1339_ + i_1346_
		> ((Class173_Sub3) (((Class151_Sub1_Sub1) this)
				    .aClass173_Sub3_8814)).anInt9726 * 6965409)
		i_1346_ -= (i_1339_ + i_1346_
			    - (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						 .aClass173_Sub3_8814))
			       .anInt9726) * 6965409);
	    if (i < (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119)) {
		int i_1351_ = ((((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						  .aClass173_Sub3_8814))
				.anInt9723) * -993497119
			       - i);
		i_1347_ -= i_1351_;
		i = (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119);
		i_1345_ += i_1351_;
		i_1344_ += i_1351_;
		i_1349_ += i_1351_;
		i_1348_ += i_1351_;
	    }
	    if (i + i_1347_ > (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						 .aClass173_Sub3_8814))
			       .anInt9724) * 630968029) {
		int i_1352_ = (i + i_1347_
			       - (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						    .aClass173_Sub3_8814))
				  .anInt9724) * 630968029);
		i_1347_ -= i_1352_;
		i_1349_ += i_1352_;
		i_1348_ += i_1352_;
	    }
	    if (i_1347_ > 0 && i_1346_ > 0) {
		if (i_1342_ == 0) {
		    if (i_1340_ == 1) {
			for (int i_1353_ = -i_1346_; i_1353_ < 0; i_1353_++) {
			    int i_1354_ = i_1344_ + i_1347_ - 3;
			    while (i_1344_ < i_1354_) {
				is[i_1344_++]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1345_++]) & 0xff]);
				is[i_1344_++]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1345_++]) & 0xff]);
				is[i_1344_++]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1345_++]) & 0xff]);
				is[i_1344_++]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1345_++]) & 0xff]);
			    }
			    i_1354_ += 3;
			    while (i_1344_ < i_1354_)
				is[i_1344_++]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1345_++]) & 0xff]);
			    i_1344_ += i_1348_;
			    i_1345_ += i_1349_;
			}
		    } else if (i_1340_ == 0) {
			int i_1355_ = (i_1341_ & 0xff0000) >> 16;
			int i_1356_ = (i_1341_ & 0xff00) >> 8;
			int i_1357_ = i_1341_ & 0xff;
			for (int i_1358_ = -i_1346_; i_1358_ < 0; i_1358_++) {
			    for (int i_1359_ = -i_1347_; i_1359_ < 0;
				 i_1359_++) {
				int i_1360_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1345_++]) & 0xff]);
				int i_1361_ = ((i_1360_ & 0xff0000) * i_1355_
					       & ~0xffffff);
				int i_1362_
				    = (i_1360_ & 0xff00) * i_1356_ & 0xff0000;
				int i_1363_
				    = (i_1360_ & 0xff) * i_1357_ & 0xff00;
				is[i_1344_++]
				    = (i_1361_ | i_1362_ | i_1363_) >>> 8;
			    }
			    i_1344_ += i_1348_;
			    i_1345_ += i_1349_;
			}
		    } else if (i_1340_ == 3) {
			for (int i_1364_ = -i_1346_; i_1364_ < 0; i_1364_++) {
			    for (int i_1365_ = -i_1347_; i_1365_ < 0;
				 i_1365_++) {
				int i_1366_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1345_++]) & 0xff]);
				int i_1367_ = i_1366_ + i_1341_;
				int i_1368_ = ((i_1366_ & 0xff00ff)
					       + (i_1341_ & 0xff00ff));
				int i_1369_
				    = ((i_1368_ & 0x1000100)
				       + (i_1367_ - i_1368_ & 0x10000));
				is[i_1344_++]
				    = i_1367_ - i_1369_ | i_1369_ - (i_1369_
								     >>> 8);
			    }
			    i_1344_ += i_1348_;
			    i_1345_ += i_1349_;
			}
		    } else if (i_1340_ == 2) {
			int i_1370_ = i_1341_ >>> 24;
			int i_1371_ = 256 - i_1370_;
			int i_1372_
			    = (i_1341_ & 0xff00ff) * i_1371_ & ~0xff00ff;
			int i_1373_ = (i_1341_ & 0xff00) * i_1371_ & 0xff0000;
			i_1341_ = (i_1372_ | i_1373_) >>> 8;
			for (int i_1374_ = -i_1346_; i_1374_ < 0; i_1374_++) {
			    for (int i_1375_ = -i_1347_; i_1375_ < 0;
				 i_1375_++) {
				int i_1376_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1345_++]) & 0xff]);
				i_1372_ = ((i_1376_ & 0xff00ff) * i_1370_
					   & ~0xff00ff);
				i_1373_
				    = (i_1376_ & 0xff00) * i_1370_ & 0xff0000;
				is[i_1344_++]
				    = ((i_1372_ | i_1373_) >>> 8) + i_1341_;
			    }
			    i_1344_ += i_1348_;
			    i_1345_ += i_1349_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1342_ == 1) {
		    if (i_1340_ == 1) {
			for (int i_1377_ = -i_1346_; i_1377_ < 0; i_1377_++) {
			    for (int i_1378_ = -i_1347_; i_1378_ < 0;
				 i_1378_++) {
				int i_1379_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_1345_++]);
				if (i_1379_ != 0) {
				    int i_1380_
					= ((((Class151_Sub1_Sub1) this)
					    .anIntArray11257[i_1379_ & 0xff])
					   | ~0xffffff);
				    int i_1381_ = 255;
				    int i_1382_ = 0;
				    int i_1383_ = is[i_1344_];
				    is[i_1344_++]
					= (((((i_1380_ & 0xff00ff) * i_1381_
					      + (i_1383_ & 0xff00ff) * i_1382_)
					     & ~0xff00ff)
					    >> 8)
					   + (((((i_1380_ & ~0xff00ff) >>> 8)
						* i_1381_)
					       + (((i_1383_ & ~0xff00ff) >>> 8)
						  * i_1382_))
					      & ~0xff00ff));
				} else
				    i_1344_++;
			    }
			    i_1344_ += i_1348_;
			    i_1345_ += i_1349_;
			}
		    } else if (i_1340_ == 0) {
			if ((i_1341_ & 0xffffff) == 16777215) {
			    int i_1384_ = i_1341_ >>> 24;
			    int i_1385_ = 256 - i_1384_;
			    for (int i_1386_ = -i_1346_; i_1386_ < 0;
				 i_1386_++) {
				for (int i_1387_ = -i_1347_; i_1387_ < 0;
				     i_1387_++) {
				    int i_1388_
					= (((Class151_Sub1_Sub1) this)
					   .aByteArray11258[i_1345_++]);
				    if (i_1388_ != 0) {
					int i_1389_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_1388_ & 0xff]);
					int i_1390_ = is[i_1344_];
					is[i_1344_++]
					    = ((((i_1389_ & 0xff00ff) * i_1384_
						 + ((i_1390_ & 0xff00ff)
						    * i_1385_))
						& ~0xff00ff)
					       + (((i_1389_ & 0xff00) * i_1384_
						   + ((i_1390_ & 0xff00)
						      * i_1385_))
						  & 0xff0000)) >> 8;
				    } else
					i_1344_++;
				}
				i_1344_ += i_1348_;
				i_1345_ += i_1349_;
			    }
			} else {
			    int i_1391_ = (i_1341_ & 0xff0000) >> 16;
			    int i_1392_ = (i_1341_ & 0xff00) >> 8;
			    int i_1393_ = i_1341_ & 0xff;
			    int i_1394_ = i_1341_ >>> 24;
			    int i_1395_ = 256 - i_1394_;
			    for (int i_1396_ = -i_1346_; i_1396_ < 0;
				 i_1396_++) {
				for (int i_1397_ = -i_1347_; i_1397_ < 0;
				     i_1397_++) {
				    int i_1398_
					= (((Class151_Sub1_Sub1) this)
					   .aByteArray11258[i_1345_++]);
				    if (i_1398_ != 0) {
					int i_1399_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_1398_ & 0xff]);
					if (i_1394_ != 255) {
					    int i_1400_
						= (((i_1399_ & 0xff0000)
						    * i_1391_)
						   & ~0xffffff);
					    int i_1401_
						= ((i_1399_ & 0xff00) * i_1392_
						   & 0xff0000);
					    int i_1402_
						= ((i_1399_ & 0xff) * i_1393_
						   & 0xff00);
					    i_1399_ = (i_1400_ | i_1401_
						       | i_1402_) >>> 8;
					    int i_1403_ = is[i_1344_];
					    is[i_1344_++]
						= (((((i_1399_ & 0xff00ff)
						      * i_1394_)
						     + ((i_1403_ & 0xff00ff)
							* i_1395_))
						    & ~0xff00ff)
						   + ((((i_1399_ & 0xff00)
							* i_1394_)
						       + ((i_1403_ & 0xff00)
							  * i_1395_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1404_
						= (((i_1399_ & 0xff0000)
						    * i_1391_)
						   & ~0xffffff);
					    int i_1405_
						= ((i_1399_ & 0xff00) * i_1392_
						   & 0xff0000);
					    int i_1406_
						= ((i_1399_ & 0xff) * i_1393_
						   & 0xff00);
					    is[i_1344_++] = (i_1404_ | i_1405_
							     | i_1406_) >>> 8;
					}
				    } else
					i_1344_++;
				}
				i_1344_ += i_1348_;
				i_1345_ += i_1349_;
			    }
			}
		    } else if (i_1340_ == 3) {
			int i_1407_ = i_1341_ >>> 24;
			int i_1408_ = 256 - i_1407_;
			for (int i_1409_ = -i_1346_; i_1409_ < 0; i_1409_++) {
			    for (int i_1410_ = -i_1347_; i_1410_ < 0;
				 i_1410_++) {
				byte i_1411_ = (((Class151_Sub1_Sub1) this)
						.aByteArray11258[i_1345_++]);
				int i_1412_ = (i_1411_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_1411_])
					       : 0);
				int i_1413_ = i_1412_ + i_1341_;
				int i_1414_ = ((i_1412_ & 0xff00ff)
					       + (i_1341_ & 0xff00ff));
				int i_1415_
				    = ((i_1414_ & 0x1000100)
				       + (i_1413_ - i_1414_ & 0x10000));
				i_1415_
				    = i_1413_ - i_1415_ | i_1415_ - (i_1415_
								     >>> 8);
				if (i_1412_ == 0 && i_1407_ != 255) {
				    i_1412_ = i_1415_;
				    i_1415_ = is[i_1344_];
				    i_1415_
					= ((((i_1412_ & 0xff00ff) * i_1407_
					     + (i_1415_ & 0xff00ff) * i_1408_)
					    & ~0xff00ff)
					   + (((i_1412_ & 0xff00) * i_1407_
					       + (i_1415_ & 0xff00) * i_1408_)
					      & 0xff0000)) >> 8;
				}
				is[i_1344_++] = i_1415_;
			    }
			    i_1344_ += i_1348_;
			    i_1345_ += i_1349_;
			}
		    } else if (i_1340_ == 2) {
			int i_1416_ = i_1341_ >>> 24;
			int i_1417_ = 256 - i_1416_;
			int i_1418_
			    = (i_1341_ & 0xff00ff) * i_1417_ & ~0xff00ff;
			int i_1419_ = (i_1341_ & 0xff00) * i_1417_ & 0xff0000;
			i_1341_ = (i_1418_ | i_1419_) >>> 8;
			for (int i_1420_ = -i_1346_; i_1420_ < 0; i_1420_++) {
			    for (int i_1421_ = -i_1347_; i_1421_ < 0;
				 i_1421_++) {
				int i_1422_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_1345_++]);
				if (i_1422_ != 0) {
				    int i_1423_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1422_ & 0xff]);
				    i_1418_ = ((i_1423_ & 0xff00ff) * i_1416_
					       & ~0xff00ff);
				    i_1419_ = ((i_1423_ & 0xff00) * i_1416_
					       & 0xff0000);
				    is[i_1344_++] = ((i_1418_ | i_1419_)
						     >>> 8) + i_1341_;
				} else
				    i_1344_++;
			    }
			    i_1344_ += i_1348_;
			    i_1345_ += i_1349_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1342_ == 2) {
		    if (i_1340_ == 1) {
			for (int i_1424_ = -i_1346_; i_1424_ < 0; i_1424_++) {
			    for (int i_1425_ = -i_1347_; i_1425_ < 0;
				 i_1425_++) {
				int i_1426_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_1345_++]);
				if (i_1426_ != 0) {
				    int i_1427_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1426_ & 0xff]);
				    int i_1428_ = is[i_1344_];
				    int i_1429_ = i_1427_ + i_1428_;
				    int i_1430_ = ((i_1427_ & 0xff00ff)
						   + (i_1428_ & 0xff00ff));
				    i_1428_
					= ((i_1430_ & 0x1000100)
					   + (i_1429_ - i_1430_ & 0x10000));
				    is[i_1344_++]
					= (i_1429_ - i_1428_
					   | i_1428_ - (i_1428_ >>> 8));
				} else
				    i_1344_++;
			    }
			    i_1344_ += i_1348_;
			    i_1345_ += i_1349_;
			}
		    } else if (i_1340_ == 0) {
			int i_1431_ = (i_1341_ & 0xff0000) >> 16;
			int i_1432_ = (i_1341_ & 0xff00) >> 8;
			int i_1433_ = i_1341_ & 0xff;
			for (int i_1434_ = -i_1346_; i_1434_ < 0; i_1434_++) {
			    for (int i_1435_ = -i_1347_; i_1435_ < 0;
				 i_1435_++) {
				int i_1436_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_1345_++]);
				if (i_1436_ != 0) {
				    int i_1437_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1436_ & 0xff]);
				    int i_1438_
					= ((i_1437_ & 0xff0000) * i_1431_
					   & ~0xffffff);
				    int i_1439_ = ((i_1437_ & 0xff00) * i_1432_
						   & 0xff0000);
				    int i_1440_
					= (i_1437_ & 0xff) * i_1433_ & 0xff00;
				    i_1437_
					= (i_1438_ | i_1439_ | i_1440_) >>> 8;
				    int i_1441_ = is[i_1344_];
				    int i_1442_ = i_1437_ + i_1441_;
				    int i_1443_ = ((i_1437_ & 0xff00ff)
						   + (i_1441_ & 0xff00ff));
				    i_1441_
					= ((i_1443_ & 0x1000100)
					   + (i_1442_ - i_1443_ & 0x10000));
				    is[i_1344_++]
					= (i_1442_ - i_1441_
					   | i_1441_ - (i_1441_ >>> 8));
				} else
				    i_1344_++;
			    }
			    i_1344_ += i_1348_;
			    i_1345_ += i_1349_;
			}
		    } else if (i_1340_ == 3) {
			for (int i_1444_ = -i_1346_; i_1444_ < 0; i_1444_++) {
			    for (int i_1445_ = -i_1347_; i_1445_ < 0;
				 i_1445_++) {
				byte i_1446_ = (((Class151_Sub1_Sub1) this)
						.aByteArray11258[i_1345_++]);
				int i_1447_ = (i_1446_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_1446_])
					       : 0);
				int i_1448_ = i_1447_ + i_1341_;
				int i_1449_ = ((i_1447_ & 0xff00ff)
					       + (i_1341_ & 0xff00ff));
				int i_1450_
				    = ((i_1449_ & 0x1000100)
				       + (i_1448_ - i_1449_ & 0x10000));
				i_1447_
				    = i_1448_ - i_1450_ | i_1450_ - (i_1450_
								     >>> 8);
				i_1450_ = is[i_1344_];
				i_1448_ = i_1447_ + i_1450_;
				i_1449_ = (i_1447_ & 0xff00ff) + (i_1450_
								  & 0xff00ff);
				i_1450_ = ((i_1449_ & 0x1000100)
					   + (i_1448_ - i_1449_ & 0x10000));
				is[i_1344_++]
				    = i_1448_ - i_1450_ | i_1450_ - (i_1450_
								     >>> 8);
			    }
			    i_1344_ += i_1348_;
			    i_1345_ += i_1349_;
			}
		    } else if (i_1340_ == 2) {
			int i_1451_ = i_1341_ >>> 24;
			int i_1452_ = 256 - i_1451_;
			int i_1453_
			    = (i_1341_ & 0xff00ff) * i_1452_ & ~0xff00ff;
			int i_1454_ = (i_1341_ & 0xff00) * i_1452_ & 0xff0000;
			i_1341_ = (i_1453_ | i_1454_) >>> 8;
			for (int i_1455_ = -i_1346_; i_1455_ < 0; i_1455_++) {
			    for (int i_1456_ = -i_1347_; i_1456_ < 0;
				 i_1456_++) {
				int i_1457_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_1345_++]);
				if (i_1457_ != 0) {
				    int i_1458_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1457_ & 0xff]);
				    i_1453_ = ((i_1458_ & 0xff00ff) * i_1451_
					       & ~0xff00ff);
				    i_1454_ = ((i_1458_ & 0xff00) * i_1451_
					       & 0xff0000);
				    i_1458_ = (((i_1453_ | i_1454_) >>> 8)
					       + i_1341_);
				    int i_1459_ = is[i_1344_];
				    int i_1460_ = i_1458_ + i_1459_;
				    int i_1461_ = ((i_1458_ & 0xff00ff)
						   + (i_1459_ & 0xff00ff));
				    i_1459_
					= ((i_1461_ & 0x1000100)
					   + (i_1460_ - i_1461_ & 0x10000));
				    is[i_1344_++]
					= (i_1460_ - i_1459_
					   | i_1459_ - (i_1459_ >>> 8));
				} else
				    i_1344_++;
			    }
			    i_1344_ += i_1348_;
			    i_1345_ += i_1349_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method1796(int i, int i_1462_, int i_1463_, int i_1464_,
			   int i_1465_, int i_1466_) {
	throw new IllegalStateException();
    }
    
    public void method1778(int i, int i_1467_, int i_1468_) {
	throw new IllegalStateException();
    }
    
    public void method1812(int i, int i_1469_, int i_1470_) {
	throw new IllegalStateException();
    }
    
    public Interface19 method1799() {
	throw new IllegalStateException();
    }
    
    public void method1791(int i, int i_1471_, int i_1472_, int i_1473_,
			   int[] is, int i_1474_, int i_1475_) {
	throw new IllegalStateException();
    }
    
    void method8290(boolean bool, boolean bool_1476_, boolean bool_1477_,
		    int i, int i_1478_, float f, int i_1479_, int i_1480_,
		    int i_1481_, int i_1482_, int i_1483_, int i_1484_,
		    boolean bool_1485_) {
	if (i_1479_ > 0 && i_1480_ > 0 && (bool || bool_1476_)) {
	    int i_1486_ = 0;
	    int i_1487_ = 0;
	    int i_1488_ = (((Class151_Sub1_Sub1) this).anInt8806
			   + ((Class151_Sub1_Sub1) this).anInt8803
			   + ((Class151_Sub1_Sub1) this).anInt8832);
	    int i_1489_ = (((Class151_Sub1_Sub1) this).anInt8819
			   + ((Class151_Sub1_Sub1) this).anInt8804
			   + ((Class151_Sub1_Sub1) this).anInt8808);
	    int i_1490_ = (i_1488_ << 16) / i_1479_;
	    int i_1491_ = (i_1489_ << 16) / i_1480_;
	    if (((Class151_Sub1_Sub1) this).anInt8806 > 0) {
		int i_1492_ = (((((Class151_Sub1_Sub1) this).anInt8806 << 16)
				+ i_1490_ - 1)
			       / i_1490_);
		i += i_1492_;
		i_1486_ += (i_1492_ * i_1490_
			    - (((Class151_Sub1_Sub1) this).anInt8806 << 16));
	    }
	    if (((Class151_Sub1_Sub1) this).anInt8819 > 0) {
		int i_1493_ = (((((Class151_Sub1_Sub1) this).anInt8819 << 16)
				+ i_1491_ - 1)
			       / i_1491_);
		i_1478_ += i_1493_;
		i_1487_ += (i_1493_ * i_1491_
			    - (((Class151_Sub1_Sub1) this).anInt8819 << 16));
	    }
	    if (((Class151_Sub1_Sub1) this).anInt8803 < i_1488_)
		i_1479_ = ((((Class151_Sub1_Sub1) this).anInt8803 << 16)
			   - i_1486_ + i_1490_ - 1) / i_1490_;
	    if (((Class151_Sub1_Sub1) this).anInt8804 < i_1489_)
		i_1480_ = ((((Class151_Sub1_Sub1) this).anInt8804 << 16)
			   - i_1487_ + i_1491_ - 1) / i_1491_;
	    int i_1494_
		= i + i_1478_ * ((((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						    .aClass173_Sub3_8814))
				  .anInt9735)
				 * 111437289);
	    int i_1495_ = ((((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					      .aClass173_Sub3_8814)).anInt9735
			    * 111437289)
			   - i_1479_);
	    if (i_1478_ + i_1480_
		> ((Class173_Sub3) (((Class151_Sub1_Sub1) this)
				    .aClass173_Sub3_8814)).anInt9726 * 6965409)
		i_1480_ -= (i_1478_ + i_1480_
			    - (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						 .aClass173_Sub3_8814))
			       .anInt9726) * 6965409);
	    if (i_1478_ < (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					     .aClass173_Sub3_8814)).anInt9725
			   * 592117349)) {
		int i_1496_ = ((((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						  .aClass173_Sub3_8814))
				.anInt9725) * 592117349
			       - i_1478_);
		i_1480_ -= i_1496_;
		i_1494_ += i_1496_ * (((Class173_Sub3)
				       (((Class151_Sub1_Sub1) this)
					.aClass173_Sub3_8814)).anInt9735
				      * 111437289);
		i_1487_ += i_1491_ * i_1496_;
	    }
	    if (i + i_1479_ > (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						 .aClass173_Sub3_8814))
			       .anInt9724) * 630968029) {
		int i_1497_ = (i + i_1479_
			       - (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						    .aClass173_Sub3_8814))
				  .anInt9724) * 630968029);
		i_1479_ -= i_1497_;
		i_1495_ += i_1497_;
	    }
	    if (i < (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119)) {
		int i_1498_ = ((((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						  .aClass173_Sub3_8814))
				.anInt9723) * -993497119
			       - i);
		i_1479_ -= i_1498_;
		i_1494_ += i_1498_;
		i_1486_ += i_1490_ * i_1498_;
		i_1495_ += i_1498_;
	    }
	    float[] fs = (((Class173_Sub3)
			   ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
			  .aFloatArray9716);
	    int[] is = (((Class173_Sub3)
			 ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
			.anIntArray9719);
	    if (i_1483_ == 0) {
		if (i_1481_ == 1) {
		    int i_1499_ = i_1486_;
		    for (int i_1500_ = -i_1480_; i_1500_ < 0; i_1500_++) {
			int i_1501_
			    = ((i_1487_ >> 16)
			       * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_1502_ = -i_1479_; i_1502_ < 0; i_1502_++) {
			    if (!bool_1476_ || f < fs[i_1494_]) {
				if (bool)
				    is[i_1494_]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258
					      [(i_1486_ >> 16) + i_1501_])
					     & 0xff)]);
				if (bool_1476_ && bool_1485_)
				    fs[i_1494_] = f;
			    }
			    i_1486_ += i_1490_;
			    i_1494_++;
			}
			i_1487_ += i_1491_;
			i_1486_ = i_1499_;
			i_1494_ += i_1495_;
		    }
		} else if (i_1481_ == 0) {
		    int i_1503_ = (i_1482_ & 0xff0000) >> 16;
		    int i_1504_ = (i_1482_ & 0xff00) >> 8;
		    int i_1505_ = i_1482_ & 0xff;
		    int i_1506_ = i_1486_;
		    for (int i_1507_ = -i_1480_; i_1507_ < 0; i_1507_++) {
			int i_1508_
			    = ((i_1487_ >> 16)
			       * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_1509_ = -i_1479_; i_1509_ < 0; i_1509_++) {
			    if (!bool_1476_ || f < fs[i_1494_]) {
				if (bool) {
				    int i_1510_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258
					      [(i_1486_ >> 16) + i_1508_])
					     & 0xff)]);
				    int i_1511_
					= ((i_1510_ & 0xff0000) * i_1503_
					   & ~0xffffff);
				    int i_1512_ = ((i_1510_ & 0xff00) * i_1504_
						   & 0xff0000);
				    int i_1513_
					= (i_1510_ & 0xff) * i_1505_ & 0xff00;
				    is[i_1494_]
					= (i_1511_ | i_1512_ | i_1513_) >>> 8;
				}
				if (bool_1476_ && bool_1485_)
				    fs[i_1494_] = f;
			    }
			    i_1486_ += i_1490_;
			    i_1494_++;
			}
			i_1487_ += i_1491_;
			i_1486_ = i_1506_;
			i_1494_ += i_1495_;
		    }
		} else if (i_1481_ == 3) {
		    int i_1514_ = i_1486_;
		    for (int i_1515_ = -i_1480_; i_1515_ < 0; i_1515_++) {
			int i_1516_
			    = ((i_1487_ >> 16)
			       * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_1517_ = -i_1479_; i_1517_ < 0; i_1517_++) {
			    if (!bool_1476_ || f < fs[i_1494_]) {
				if (bool) {
				    byte i_1518_
					= (((Class151_Sub1_Sub1) this)
					   .aByteArray11258
					   [(i_1486_ >> 16) + i_1516_]);
				    int i_1519_
					= (i_1518_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_1518_])
					   : 0);
				    int i_1520_ = i_1519_ + i_1482_;
				    int i_1521_ = ((i_1519_ & 0xff00ff)
						   + (i_1482_ & 0xff00ff));
				    int i_1522_
					= ((i_1521_ & 0x1000100)
					   + (i_1520_ - i_1521_ & 0x10000));
				    is[i_1494_]
					= (i_1520_ - i_1522_
					   | i_1522_ - (i_1522_ >>> 8));
				}
				if (bool_1476_ && bool_1485_)
				    fs[i_1494_] = f;
			    }
			    i_1486_ += i_1490_;
			    i_1494_++;
			}
			i_1487_ += i_1491_;
			i_1486_ = i_1514_;
			i_1494_ += i_1495_;
		    }
		} else if (i_1481_ == 2) {
		    int i_1523_ = i_1482_ >>> 24;
		    int i_1524_ = 256 - i_1523_;
		    int i_1525_ = (i_1482_ & 0xff00ff) * i_1524_ & ~0xff00ff;
		    int i_1526_ = (i_1482_ & 0xff00) * i_1524_ & 0xff0000;
		    i_1482_ = (i_1525_ | i_1526_) >>> 8;
		    int i_1527_ = i_1486_;
		    for (int i_1528_ = -i_1480_; i_1528_ < 0; i_1528_++) {
			int i_1529_
			    = ((i_1487_ >> 16)
			       * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_1530_ = -i_1479_; i_1530_ < 0; i_1530_++) {
			    if (!bool_1476_ || f < fs[i_1494_]) {
				if (bool) {
				    int i_1531_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258
					      [(i_1486_ >> 16) + i_1529_])
					     & 0xff)]);
				    i_1525_ = ((i_1531_ & 0xff00ff) * i_1523_
					       & ~0xff00ff);
				    i_1526_ = ((i_1531_ & 0xff00) * i_1523_
					       & 0xff0000);
				    is[i_1494_] = (((i_1525_ | i_1526_) >>> 8)
						   + i_1482_);
				}
				if (bool_1476_ && bool_1485_)
				    fs[i_1494_] = f;
			    }
			    i_1486_ += i_1490_;
			    i_1494_++;
			}
			i_1487_ += i_1491_;
			i_1486_ = i_1527_;
			i_1494_ += i_1495_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1483_ == 1) {
		if (i_1481_ == 1) {
		    int i_1532_ = i_1486_;
		    for (int i_1533_ = -i_1480_; i_1533_ < 0; i_1533_++) {
			int i_1534_
			    = ((i_1487_ >> 16)
			       * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_1535_ = -i_1479_; i_1535_ < 0; i_1535_++) {
			    if (!bool_1476_ || f < fs[i_1494_]) {
				int i_1536_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258
					       [(i_1486_ >> 16) + i_1534_]);
				if (i_1536_ != 0) {
				    if (bool)
					is[i_1494_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_1536_ & 0xff]);
				    if (bool_1476_ && bool_1485_)
					fs[i_1494_] = f;
				}
			    }
			    i_1486_ += i_1490_;
			    i_1494_++;
			}
			i_1487_ += i_1491_;
			i_1486_ = i_1532_;
			i_1494_ += i_1495_;
		    }
		} else if (i_1481_ == 0) {
		    int i_1537_ = i_1486_;
		    if ((i_1482_ & 0xffffff) == 16777215) {
			int i_1538_ = i_1482_ >>> 24;
			int i_1539_ = 256 - i_1538_;
			for (int i_1540_ = -i_1480_; i_1540_ < 0; i_1540_++) {
			    int i_1541_
				= ((i_1487_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_1542_ = -i_1479_; i_1542_ < 0;
				 i_1542_++) {
				if (!bool_1476_ || f < fs[i_1494_]) {
				    int i_1543_
					= (((Class151_Sub1_Sub1) this)
					   .aByteArray11258
					   [(i_1486_ >> 16) + i_1541_]);
				    if (i_1543_ != 0) {
					if (bool) {
					    int i_1544_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_1543_ & 0xff]);
					    int i_1545_ = is[i_1494_];
					    is[i_1494_]
						= (((((i_1544_ & 0xff00ff)
						      * i_1538_)
						     + ((i_1545_ & 0xff00ff)
							* i_1539_))
						    & ~0xff00ff)
						   + ((((i_1544_ & 0xff00)
							* i_1538_)
						       + ((i_1545_ & 0xff00)
							  * i_1539_))
						      & 0xff0000)) >> 8;
					}
					if (bool_1476_ && bool_1485_)
					    fs[i_1494_] = f;
				    }
				}
				i_1486_ += i_1490_;
				i_1494_++;
			    }
			    i_1487_ += i_1491_;
			    i_1486_ = i_1537_;
			    i_1494_ += i_1495_;
			}
		    } else {
			int i_1546_ = (i_1482_ & 0xff0000) >> 16;
			int i_1547_ = (i_1482_ & 0xff00) >> 8;
			int i_1548_ = i_1482_ & 0xff;
			int i_1549_ = i_1482_ >>> 24;
			int i_1550_ = 256 - i_1549_;
			for (int i_1551_ = -i_1480_; i_1551_ < 0; i_1551_++) {
			    int i_1552_
				= ((i_1487_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_1553_ = -i_1479_; i_1553_ < 0;
				 i_1553_++) {
				if (!bool_1476_ || f < fs[i_1494_]) {
				    int i_1554_
					= (((Class151_Sub1_Sub1) this)
					   .aByteArray11258
					   [(i_1486_ >> 16) + i_1552_]);
				    if (i_1554_ != 0) {
					int i_1555_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_1554_ & 0xff]);
					if (i_1549_ != 255) {
					    if (bool) {
						int i_1556_
						    = (((i_1555_ & 0xff0000)
							* i_1546_)
						       & ~0xffffff);
						int i_1557_
						    = (((i_1555_ & 0xff00)
							* i_1547_)
						       & 0xff0000);
						int i_1558_
						    = (((i_1555_ & 0xff)
							* i_1548_)
						       & 0xff00);
						i_1555_ = (i_1556_ | i_1557_
							   | i_1558_) >>> 8;
						int i_1559_ = is[i_1494_];
						is[i_1494_]
						    = (((((i_1555_ & 0xff00ff)
							  * i_1549_)
							 + ((i_1559_
							     & 0xff00ff)
							    * i_1550_))
							& ~0xff00ff)
						       + ((((i_1555_ & 0xff00)
							    * i_1549_)
							   + ((i_1559_
							       & 0xff00)
							      * i_1550_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_1476_ && bool_1485_)
						fs[i_1494_] = f;
					} else {
					    if (bool) {
						int i_1560_
						    = (((i_1555_ & 0xff0000)
							* i_1546_)
						       & ~0xffffff);
						int i_1561_
						    = (((i_1555_ & 0xff00)
							* i_1547_)
						       & 0xff0000);
						int i_1562_
						    = (((i_1555_ & 0xff)
							* i_1548_)
						       & 0xff00);
						is[i_1494_]
						    = (i_1560_ | i_1561_
						       | i_1562_) >>> 8;
					    }
					    if (bool_1476_ && bool_1485_)
						fs[i_1494_] = f;
					}
				    }
				}
				i_1486_ += i_1490_;
				i_1494_++;
			    }
			    i_1487_ += i_1491_;
			    i_1486_ = i_1537_;
			    i_1494_ += i_1495_;
			}
		    }
		} else if (i_1481_ == 3) {
		    int i_1563_ = i_1486_;
		    int i_1564_ = i_1482_ >>> 24;
		    int i_1565_ = 256 - i_1564_;
		    for (int i_1566_ = -i_1480_; i_1566_ < 0; i_1566_++) {
			int i_1567_
			    = ((i_1487_ >> 16)
			       * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_1568_ = -i_1479_; i_1568_ < 0; i_1568_++) {
			    if (!bool_1476_ || f < fs[i_1494_]) {
				if (bool) {
				    byte i_1569_
					= (((Class151_Sub1_Sub1) this)
					   .aByteArray11258
					   [(i_1486_ >> 16) + i_1567_]);
				    int i_1570_
					= (i_1569_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_1569_])
					   : 0);
				    int i_1571_ = i_1570_ + i_1482_;
				    int i_1572_ = ((i_1570_ & 0xff00ff)
						   + (i_1482_ & 0xff00ff));
				    int i_1573_
					= ((i_1572_ & 0x1000100)
					   + (i_1571_ - i_1572_ & 0x10000));
				    i_1573_ = (i_1571_ - i_1573_
					       | i_1573_ - (i_1573_ >>> 8));
				    if (i_1570_ == 0 && i_1564_ != 255) {
					i_1570_ = i_1573_;
					i_1573_ = is[i_1494_];
					i_1573_
					    = ((((i_1570_ & 0xff00ff) * i_1564_
						 + ((i_1573_ & 0xff00ff)
						    * i_1565_))
						& ~0xff00ff)
					       + (((i_1570_ & 0xff00) * i_1564_
						   + ((i_1573_ & 0xff00)
						      * i_1565_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_1494_] = i_1573_;
				}
				if (bool_1476_ && bool_1485_)
				    fs[i_1494_] = f;
			    }
			    i_1486_ += i_1490_;
			    i_1494_++;
			}
			i_1487_ += i_1491_;
			i_1486_ = i_1563_;
			i_1494_ += i_1495_;
		    }
		} else if (i_1481_ == 2) {
		    int i_1574_ = i_1482_ >>> 24;
		    int i_1575_ = 256 - i_1574_;
		    int i_1576_ = (i_1482_ & 0xff00ff) * i_1575_ & ~0xff00ff;
		    int i_1577_ = (i_1482_ & 0xff00) * i_1575_ & 0xff0000;
		    i_1482_ = (i_1576_ | i_1577_) >>> 8;
		    int i_1578_ = i_1486_;
		    for (int i_1579_ = -i_1480_; i_1579_ < 0; i_1579_++) {
			int i_1580_
			    = ((i_1487_ >> 16)
			       * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_1581_ = -i_1479_; i_1581_ < 0; i_1581_++) {
			    if (!bool_1476_ || f < fs[i_1494_]) {
				int i_1582_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258
					       [(i_1486_ >> 16) + i_1580_]);
				if (i_1582_ != 0) {
				    if (bool) {
					int i_1583_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_1582_ & 0xff]);
					i_1576_
					    = ((i_1583_ & 0xff00ff) * i_1574_
					       & ~0xff00ff);
					i_1577_ = ((i_1583_ & 0xff00) * i_1574_
						   & 0xff0000);
					is[i_1494_] = ((i_1576_ | i_1577_)
						       >>> 8) + i_1482_;
				    }
				    if (bool_1476_ && bool_1485_)
					fs[i_1494_] = f;
				}
			    }
			    i_1486_ += i_1490_;
			    i_1494_++;
			}
			i_1487_ += i_1491_;
			i_1486_ = i_1578_;
			i_1494_ += i_1495_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_1483_ == 2) {
		if (i_1481_ == 1) {
		    int i_1584_ = i_1486_;
		    for (int i_1585_ = -i_1480_; i_1585_ < 0; i_1585_++) {
			int i_1586_
			    = ((i_1487_ >> 16)
			       * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_1587_ = -i_1479_; i_1587_ < 0; i_1587_++) {
			    if (!bool_1476_ || f < fs[i_1494_]) {
				int i_1588_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258
					       [(i_1486_ >> 16) + i_1586_]);
				if (i_1588_ != 0) {
				    if (bool) {
					int i_1589_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_1588_ & 0xff]);
					int i_1590_ = is[i_1494_];
					int i_1591_ = i_1589_ + i_1590_;
					int i_1592_ = ((i_1589_ & 0xff00ff)
						       + (i_1590_ & 0xff00ff));
					i_1590_ = ((i_1592_ & 0x1000100)
						   + (i_1591_ - i_1592_
						      & 0x10000));
					is[i_1494_]
					    = (i_1591_ - i_1590_
					       | i_1590_ - (i_1590_ >>> 8));
				    }
				    if (bool_1476_ && bool_1485_)
					fs[i_1494_] = f;
				}
			    }
			    i_1486_ += i_1490_;
			    i_1494_++;
			}
			i_1487_ += i_1491_;
			i_1486_ = i_1584_;
			i_1494_ += i_1495_;
		    }
		} else if (i_1481_ == 0) {
		    int i_1593_ = i_1486_;
		    int i_1594_ = (i_1482_ & 0xff0000) >> 16;
		    int i_1595_ = (i_1482_ & 0xff00) >> 8;
		    int i_1596_ = i_1482_ & 0xff;
		    for (int i_1597_ = -i_1480_; i_1597_ < 0; i_1597_++) {
			int i_1598_
			    = ((i_1487_ >> 16)
			       * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_1599_ = -i_1479_; i_1599_ < 0; i_1599_++) {
			    if (!bool_1476_ || f < fs[i_1494_]) {
				int i_1600_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258
					       [(i_1486_ >> 16) + i_1598_]);
				if (i_1600_ != 0) {
				    if (bool) {
					int i_1601_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_1600_ & 0xff]);
					int i_1602_
					    = ((i_1601_ & 0xff0000) * i_1594_
					       & ~0xffffff);
					int i_1603_
					    = ((i_1601_ & 0xff00) * i_1595_
					       & 0xff0000);
					int i_1604_
					    = ((i_1601_ & 0xff) * i_1596_
					       & 0xff00);
					i_1601_ = (i_1602_ | i_1603_
						   | i_1604_) >>> 8;
					int i_1605_ = is[i_1494_];
					int i_1606_ = i_1601_ + i_1605_;
					int i_1607_ = ((i_1601_ & 0xff00ff)
						       + (i_1605_ & 0xff00ff));
					i_1605_ = ((i_1607_ & 0x1000100)
						   + (i_1606_ - i_1607_
						      & 0x10000));
					is[i_1494_]
					    = (i_1606_ - i_1605_
					       | i_1605_ - (i_1605_ >>> 8));
				    }
				    if (bool_1476_ && bool_1485_)
					fs[i_1494_] = f;
				}
			    }
			    i_1486_ += i_1490_;
			    i_1494_++;
			}
			i_1487_ += i_1491_;
			i_1486_ = i_1593_;
			i_1494_ += i_1495_;
		    }
		} else if (i_1481_ == 3) {
		    int i_1608_ = i_1486_;
		    for (int i_1609_ = -i_1480_; i_1609_ < 0; i_1609_++) {
			int i_1610_
			    = ((i_1487_ >> 16)
			       * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_1611_ = -i_1479_; i_1611_ < 0; i_1611_++) {
			    if (!bool_1476_ || f < fs[i_1494_]) {
				if (bool) {
				    byte i_1612_
					= (((Class151_Sub1_Sub1) this)
					   .aByteArray11258
					   [(i_1486_ >> 16) + i_1610_]);
				    int i_1613_
					= (i_1612_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_1612_])
					   : 0);
				    int i_1614_ = i_1613_ + i_1482_;
				    int i_1615_ = ((i_1613_ & 0xff00ff)
						   + (i_1482_ & 0xff00ff));
				    int i_1616_
					= ((i_1615_ & 0x1000100)
					   + (i_1614_ - i_1615_ & 0x10000));
				    i_1613_ = (i_1614_ - i_1616_
					       | i_1616_ - (i_1616_ >>> 8));
				    i_1616_ = is[i_1494_];
				    i_1614_ = i_1613_ + i_1616_;
				    i_1615_
					= (i_1613_ & 0xff00ff) + (i_1616_
								  & 0xff00ff);
				    i_1616_
					= ((i_1615_ & 0x1000100)
					   + (i_1614_ - i_1615_ & 0x10000));
				    is[i_1494_]
					= (i_1614_ - i_1616_
					   | i_1616_ - (i_1616_ >>> 8));
				}
				if (bool_1476_ && bool_1485_)
				    fs[i_1494_] = f;
			    }
			    i_1486_ += i_1490_;
			    i_1494_++;
			}
			i_1487_ += i_1491_;
			i_1486_ = i_1608_;
			i_1494_ += i_1495_;
		    }
		} else if (i_1481_ == 2) {
		    int i_1617_ = i_1482_ >>> 24;
		    int i_1618_ = 256 - i_1617_;
		    int i_1619_ = (i_1482_ & 0xff00ff) * i_1618_ & ~0xff00ff;
		    int i_1620_ = (i_1482_ & 0xff00) * i_1618_ & 0xff0000;
		    i_1482_ = (i_1619_ | i_1620_) >>> 8;
		    int i_1621_ = i_1486_;
		    for (int i_1622_ = -i_1480_; i_1622_ < 0; i_1622_++) {
			int i_1623_
			    = ((i_1487_ >> 16)
			       * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_1624_ = -i_1479_; i_1624_ < 0; i_1624_++) {
			    if (!bool_1476_ || f < fs[i_1494_]) {
				int i_1625_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258
					       [(i_1486_ >> 16) + i_1623_]);
				if (i_1625_ != 0) {
				    if (bool) {
					int i_1626_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_1625_ & 0xff]);
					i_1619_
					    = ((i_1626_ & 0xff00ff) * i_1617_
					       & ~0xff00ff);
					i_1620_ = ((i_1626_ & 0xff00) * i_1617_
						   & 0xff0000);
					i_1626_ = (((i_1619_ | i_1620_) >>> 8)
						   + i_1482_);
					int i_1627_ = is[i_1494_];
					int i_1628_ = i_1626_ + i_1627_;
					int i_1629_ = ((i_1626_ & 0xff00ff)
						       + (i_1627_ & 0xff00ff));
					i_1627_ = ((i_1629_ & 0x1000100)
						   + (i_1628_ - i_1629_
						      & 0x10000));
					is[i_1494_]
					    = (i_1628_ - i_1627_
					       | i_1627_ - (i_1627_ >>> 8));
				    }
				    if (bool_1476_ && bool_1485_)
					fs[i_1494_] = f;
				}
			    }
			    i_1486_ += i_1490_;
			    i_1494_++;
			}
			i_1487_ += i_1491_;
			i_1486_ = i_1621_;
			i_1494_ += i_1495_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method1810(int i, int i_1630_, int i_1631_, int i_1632_,
			   int i_1633_) {
	if (((Class151_Sub1_Sub1) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    int i_1634_ = (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					     .aClass173_Sub3_8814)).anInt9735
			   * 111437289);
	    i += ((Class151_Sub1_Sub1) this).anInt8806;
	    i_1630_ += ((Class151_Sub1_Sub1) this).anInt8819;
	    int i_1635_ = i_1630_ * i_1634_ + i;
	    int i_1636_ = 0;
	    int i_1637_ = ((Class151_Sub1_Sub1) this).anInt8804;
	    int i_1638_ = ((Class151_Sub1_Sub1) this).anInt8803;
	    int i_1639_ = i_1634_ - i_1638_;
	    int i_1640_ = 0;
	    if (i_1630_ < (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					     .aClass173_Sub3_8814)).anInt9725
			   * 592117349)) {
		int i_1641_ = ((((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						  .aClass173_Sub3_8814))
				.anInt9725) * 592117349
			       - i_1630_);
		i_1637_ -= i_1641_;
		i_1630_ = (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					     .aClass173_Sub3_8814)).anInt9725
			   * 592117349);
		i_1636_ += i_1641_ * i_1638_;
		i_1635_ += i_1641_ * i_1634_;
	    }
	    if (i_1630_ + i_1637_
		> ((Class173_Sub3) (((Class151_Sub1_Sub1) this)
				    .aClass173_Sub3_8814)).anInt9726 * 6965409)
		i_1637_ -= (i_1630_ + i_1637_
			    - (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						 .aClass173_Sub3_8814))
			       .anInt9726) * 6965409);
	    if (i < (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119)) {
		int i_1642_ = ((((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						  .aClass173_Sub3_8814))
				.anInt9723) * -993497119
			       - i);
		i_1638_ -= i_1642_;
		i = (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119);
		i_1636_ += i_1642_;
		i_1635_ += i_1642_;
		i_1640_ += i_1642_;
		i_1639_ += i_1642_;
	    }
	    if (i + i_1638_ > (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						 .aClass173_Sub3_8814))
			       .anInt9724) * 630968029) {
		int i_1643_ = (i + i_1638_
			       - (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						    .aClass173_Sub3_8814))
				  .anInt9724) * 630968029);
		i_1638_ -= i_1643_;
		i_1640_ += i_1643_;
		i_1639_ += i_1643_;
	    }
	    if (i_1638_ > 0 && i_1637_ > 0) {
		if (i_1633_ == 0) {
		    if (i_1631_ == 1) {
			for (int i_1644_ = -i_1637_; i_1644_ < 0; i_1644_++) {
			    int i_1645_ = i_1635_ + i_1638_ - 3;
			    while (i_1635_ < i_1645_) {
				is[i_1635_++]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1636_++]) & 0xff]);
				is[i_1635_++]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1636_++]) & 0xff]);
				is[i_1635_++]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1636_++]) & 0xff]);
				is[i_1635_++]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1636_++]) & 0xff]);
			    }
			    i_1645_ += 3;
			    while (i_1635_ < i_1645_)
				is[i_1635_++]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1636_++]) & 0xff]);
			    i_1635_ += i_1639_;
			    i_1636_ += i_1640_;
			}
		    } else if (i_1631_ == 0) {
			int i_1646_ = (i_1632_ & 0xff0000) >> 16;
			int i_1647_ = (i_1632_ & 0xff00) >> 8;
			int i_1648_ = i_1632_ & 0xff;
			for (int i_1649_ = -i_1637_; i_1649_ < 0; i_1649_++) {
			    for (int i_1650_ = -i_1638_; i_1650_ < 0;
				 i_1650_++) {
				int i_1651_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1636_++]) & 0xff]);
				int i_1652_ = ((i_1651_ & 0xff0000) * i_1646_
					       & ~0xffffff);
				int i_1653_
				    = (i_1651_ & 0xff00) * i_1647_ & 0xff0000;
				int i_1654_
				    = (i_1651_ & 0xff) * i_1648_ & 0xff00;
				is[i_1635_++]
				    = (i_1652_ | i_1653_ | i_1654_) >>> 8;
			    }
			    i_1635_ += i_1639_;
			    i_1636_ += i_1640_;
			}
		    } else if (i_1631_ == 3) {
			for (int i_1655_ = -i_1637_; i_1655_ < 0; i_1655_++) {
			    for (int i_1656_ = -i_1638_; i_1656_ < 0;
				 i_1656_++) {
				int i_1657_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1636_++]) & 0xff]);
				int i_1658_ = i_1657_ + i_1632_;
				int i_1659_ = ((i_1657_ & 0xff00ff)
					       + (i_1632_ & 0xff00ff));
				int i_1660_
				    = ((i_1659_ & 0x1000100)
				       + (i_1658_ - i_1659_ & 0x10000));
				is[i_1635_++]
				    = i_1658_ - i_1660_ | i_1660_ - (i_1660_
								     >>> 8);
			    }
			    i_1635_ += i_1639_;
			    i_1636_ += i_1640_;
			}
		    } else if (i_1631_ == 2) {
			int i_1661_ = i_1632_ >>> 24;
			int i_1662_ = 256 - i_1661_;
			int i_1663_
			    = (i_1632_ & 0xff00ff) * i_1662_ & ~0xff00ff;
			int i_1664_ = (i_1632_ & 0xff00) * i_1662_ & 0xff0000;
			i_1632_ = (i_1663_ | i_1664_) >>> 8;
			for (int i_1665_ = -i_1637_; i_1665_ < 0; i_1665_++) {
			    for (int i_1666_ = -i_1638_; i_1666_ < 0;
				 i_1666_++) {
				int i_1667_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1636_++]) & 0xff]);
				i_1663_ = ((i_1667_ & 0xff00ff) * i_1661_
					   & ~0xff00ff);
				i_1664_
				    = (i_1667_ & 0xff00) * i_1661_ & 0xff0000;
				is[i_1635_++]
				    = ((i_1663_ | i_1664_) >>> 8) + i_1632_;
			    }
			    i_1635_ += i_1639_;
			    i_1636_ += i_1640_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1633_ == 1) {
		    if (i_1631_ == 1) {
			for (int i_1668_ = -i_1637_; i_1668_ < 0; i_1668_++) {
			    for (int i_1669_ = -i_1638_; i_1669_ < 0;
				 i_1669_++) {
				int i_1670_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_1636_++]);
				if (i_1670_ != 0) {
				    int i_1671_
					= ((((Class151_Sub1_Sub1) this)
					    .anIntArray11257[i_1670_ & 0xff])
					   | ~0xffffff);
				    int i_1672_ = 255;
				    int i_1673_ = 0;
				    int i_1674_ = is[i_1635_];
				    is[i_1635_++]
					= (((((i_1671_ & 0xff00ff) * i_1672_
					      + (i_1674_ & 0xff00ff) * i_1673_)
					     & ~0xff00ff)
					    >> 8)
					   + (((((i_1671_ & ~0xff00ff) >>> 8)
						* i_1672_)
					       + (((i_1674_ & ~0xff00ff) >>> 8)
						  * i_1673_))
					      & ~0xff00ff));
				} else
				    i_1635_++;
			    }
			    i_1635_ += i_1639_;
			    i_1636_ += i_1640_;
			}
		    } else if (i_1631_ == 0) {
			if ((i_1632_ & 0xffffff) == 16777215) {
			    int i_1675_ = i_1632_ >>> 24;
			    int i_1676_ = 256 - i_1675_;
			    for (int i_1677_ = -i_1637_; i_1677_ < 0;
				 i_1677_++) {
				for (int i_1678_ = -i_1638_; i_1678_ < 0;
				     i_1678_++) {
				    int i_1679_
					= (((Class151_Sub1_Sub1) this)
					   .aByteArray11258[i_1636_++]);
				    if (i_1679_ != 0) {
					int i_1680_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_1679_ & 0xff]);
					int i_1681_ = is[i_1635_];
					is[i_1635_++]
					    = ((((i_1680_ & 0xff00ff) * i_1675_
						 + ((i_1681_ & 0xff00ff)
						    * i_1676_))
						& ~0xff00ff)
					       + (((i_1680_ & 0xff00) * i_1675_
						   + ((i_1681_ & 0xff00)
						      * i_1676_))
						  & 0xff0000)) >> 8;
				    } else
					i_1635_++;
				}
				i_1635_ += i_1639_;
				i_1636_ += i_1640_;
			    }
			} else {
			    int i_1682_ = (i_1632_ & 0xff0000) >> 16;
			    int i_1683_ = (i_1632_ & 0xff00) >> 8;
			    int i_1684_ = i_1632_ & 0xff;
			    int i_1685_ = i_1632_ >>> 24;
			    int i_1686_ = 256 - i_1685_;
			    for (int i_1687_ = -i_1637_; i_1687_ < 0;
				 i_1687_++) {
				for (int i_1688_ = -i_1638_; i_1688_ < 0;
				     i_1688_++) {
				    int i_1689_
					= (((Class151_Sub1_Sub1) this)
					   .aByteArray11258[i_1636_++]);
				    if (i_1689_ != 0) {
					int i_1690_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_1689_ & 0xff]);
					if (i_1685_ != 255) {
					    int i_1691_
						= (((i_1690_ & 0xff0000)
						    * i_1682_)
						   & ~0xffffff);
					    int i_1692_
						= ((i_1690_ & 0xff00) * i_1683_
						   & 0xff0000);
					    int i_1693_
						= ((i_1690_ & 0xff) * i_1684_
						   & 0xff00);
					    i_1690_ = (i_1691_ | i_1692_
						       | i_1693_) >>> 8;
					    int i_1694_ = is[i_1635_];
					    is[i_1635_++]
						= (((((i_1690_ & 0xff00ff)
						      * i_1685_)
						     + ((i_1694_ & 0xff00ff)
							* i_1686_))
						    & ~0xff00ff)
						   + ((((i_1690_ & 0xff00)
							* i_1685_)
						       + ((i_1694_ & 0xff00)
							  * i_1686_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1695_
						= (((i_1690_ & 0xff0000)
						    * i_1682_)
						   & ~0xffffff);
					    int i_1696_
						= ((i_1690_ & 0xff00) * i_1683_
						   & 0xff0000);
					    int i_1697_
						= ((i_1690_ & 0xff) * i_1684_
						   & 0xff00);
					    is[i_1635_++] = (i_1695_ | i_1696_
							     | i_1697_) >>> 8;
					}
				    } else
					i_1635_++;
				}
				i_1635_ += i_1639_;
				i_1636_ += i_1640_;
			    }
			}
		    } else if (i_1631_ == 3) {
			int i_1698_ = i_1632_ >>> 24;
			int i_1699_ = 256 - i_1698_;
			for (int i_1700_ = -i_1637_; i_1700_ < 0; i_1700_++) {
			    for (int i_1701_ = -i_1638_; i_1701_ < 0;
				 i_1701_++) {
				byte i_1702_ = (((Class151_Sub1_Sub1) this)
						.aByteArray11258[i_1636_++]);
				int i_1703_ = (i_1702_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_1702_])
					       : 0);
				int i_1704_ = i_1703_ + i_1632_;
				int i_1705_ = ((i_1703_ & 0xff00ff)
					       + (i_1632_ & 0xff00ff));
				int i_1706_
				    = ((i_1705_ & 0x1000100)
				       + (i_1704_ - i_1705_ & 0x10000));
				i_1706_
				    = i_1704_ - i_1706_ | i_1706_ - (i_1706_
								     >>> 8);
				if (i_1703_ == 0 && i_1698_ != 255) {
				    i_1703_ = i_1706_;
				    i_1706_ = is[i_1635_];
				    i_1706_
					= ((((i_1703_ & 0xff00ff) * i_1698_
					     + (i_1706_ & 0xff00ff) * i_1699_)
					    & ~0xff00ff)
					   + (((i_1703_ & 0xff00) * i_1698_
					       + (i_1706_ & 0xff00) * i_1699_)
					      & 0xff0000)) >> 8;
				}
				is[i_1635_++] = i_1706_;
			    }
			    i_1635_ += i_1639_;
			    i_1636_ += i_1640_;
			}
		    } else if (i_1631_ == 2) {
			int i_1707_ = i_1632_ >>> 24;
			int i_1708_ = 256 - i_1707_;
			int i_1709_
			    = (i_1632_ & 0xff00ff) * i_1708_ & ~0xff00ff;
			int i_1710_ = (i_1632_ & 0xff00) * i_1708_ & 0xff0000;
			i_1632_ = (i_1709_ | i_1710_) >>> 8;
			for (int i_1711_ = -i_1637_; i_1711_ < 0; i_1711_++) {
			    for (int i_1712_ = -i_1638_; i_1712_ < 0;
				 i_1712_++) {
				int i_1713_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_1636_++]);
				if (i_1713_ != 0) {
				    int i_1714_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1713_ & 0xff]);
				    i_1709_ = ((i_1714_ & 0xff00ff) * i_1707_
					       & ~0xff00ff);
				    i_1710_ = ((i_1714_ & 0xff00) * i_1707_
					       & 0xff0000);
				    is[i_1635_++] = ((i_1709_ | i_1710_)
						     >>> 8) + i_1632_;
				} else
				    i_1635_++;
			    }
			    i_1635_ += i_1639_;
			    i_1636_ += i_1640_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1633_ == 2) {
		    if (i_1631_ == 1) {
			for (int i_1715_ = -i_1637_; i_1715_ < 0; i_1715_++) {
			    for (int i_1716_ = -i_1638_; i_1716_ < 0;
				 i_1716_++) {
				int i_1717_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_1636_++]);
				if (i_1717_ != 0) {
				    int i_1718_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1717_ & 0xff]);
				    int i_1719_ = is[i_1635_];
				    int i_1720_ = i_1718_ + i_1719_;
				    int i_1721_ = ((i_1718_ & 0xff00ff)
						   + (i_1719_ & 0xff00ff));
				    i_1719_
					= ((i_1721_ & 0x1000100)
					   + (i_1720_ - i_1721_ & 0x10000));
				    is[i_1635_++]
					= (i_1720_ - i_1719_
					   | i_1719_ - (i_1719_ >>> 8));
				} else
				    i_1635_++;
			    }
			    i_1635_ += i_1639_;
			    i_1636_ += i_1640_;
			}
		    } else if (i_1631_ == 0) {
			int i_1722_ = (i_1632_ & 0xff0000) >> 16;
			int i_1723_ = (i_1632_ & 0xff00) >> 8;
			int i_1724_ = i_1632_ & 0xff;
			for (int i_1725_ = -i_1637_; i_1725_ < 0; i_1725_++) {
			    for (int i_1726_ = -i_1638_; i_1726_ < 0;
				 i_1726_++) {
				int i_1727_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_1636_++]);
				if (i_1727_ != 0) {
				    int i_1728_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1727_ & 0xff]);
				    int i_1729_
					= ((i_1728_ & 0xff0000) * i_1722_
					   & ~0xffffff);
				    int i_1730_ = ((i_1728_ & 0xff00) * i_1723_
						   & 0xff0000);
				    int i_1731_
					= (i_1728_ & 0xff) * i_1724_ & 0xff00;
				    i_1728_
					= (i_1729_ | i_1730_ | i_1731_) >>> 8;
				    int i_1732_ = is[i_1635_];
				    int i_1733_ = i_1728_ + i_1732_;
				    int i_1734_ = ((i_1728_ & 0xff00ff)
						   + (i_1732_ & 0xff00ff));
				    i_1732_
					= ((i_1734_ & 0x1000100)
					   + (i_1733_ - i_1734_ & 0x10000));
				    is[i_1635_++]
					= (i_1733_ - i_1732_
					   | i_1732_ - (i_1732_ >>> 8));
				} else
				    i_1635_++;
			    }
			    i_1635_ += i_1639_;
			    i_1636_ += i_1640_;
			}
		    } else if (i_1631_ == 3) {
			for (int i_1735_ = -i_1637_; i_1735_ < 0; i_1735_++) {
			    for (int i_1736_ = -i_1638_; i_1736_ < 0;
				 i_1736_++) {
				byte i_1737_ = (((Class151_Sub1_Sub1) this)
						.aByteArray11258[i_1636_++]);
				int i_1738_ = (i_1737_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_1737_])
					       : 0);
				int i_1739_ = i_1738_ + i_1632_;
				int i_1740_ = ((i_1738_ & 0xff00ff)
					       + (i_1632_ & 0xff00ff));
				int i_1741_
				    = ((i_1740_ & 0x1000100)
				       + (i_1739_ - i_1740_ & 0x10000));
				i_1738_
				    = i_1739_ - i_1741_ | i_1741_ - (i_1741_
								     >>> 8);
				i_1741_ = is[i_1635_];
				i_1739_ = i_1738_ + i_1741_;
				i_1740_ = (i_1738_ & 0xff00ff) + (i_1741_
								  & 0xff00ff);
				i_1741_ = ((i_1740_ & 0x1000100)
					   + (i_1739_ - i_1740_ & 0x10000));
				is[i_1635_++]
				    = i_1739_ - i_1741_ | i_1741_ - (i_1741_
								     >>> 8);
			    }
			    i_1635_ += i_1639_;
			    i_1636_ += i_1640_;
			}
		    } else if (i_1631_ == 2) {
			int i_1742_ = i_1632_ >>> 24;
			int i_1743_ = 256 - i_1742_;
			int i_1744_
			    = (i_1632_ & 0xff00ff) * i_1743_ & ~0xff00ff;
			int i_1745_ = (i_1632_ & 0xff00) * i_1743_ & 0xff0000;
			i_1632_ = (i_1744_ | i_1745_) >>> 8;
			for (int i_1746_ = -i_1637_; i_1746_ < 0; i_1746_++) {
			    for (int i_1747_ = -i_1638_; i_1747_ < 0;
				 i_1747_++) {
				int i_1748_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_1636_++]);
				if (i_1748_ != 0) {
				    int i_1749_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1748_ & 0xff]);
				    i_1744_ = ((i_1749_ & 0xff00ff) * i_1742_
					       & ~0xff00ff);
				    i_1745_ = ((i_1749_ & 0xff00) * i_1742_
					       & 0xff0000);
				    i_1749_ = (((i_1744_ | i_1745_) >>> 8)
					       + i_1632_);
				    int i_1750_ = is[i_1635_];
				    int i_1751_ = i_1749_ + i_1750_;
				    int i_1752_ = ((i_1749_ & 0xff00ff)
						   + (i_1750_ & 0xff00ff));
				    i_1750_
					= ((i_1752_ & 0x1000100)
					   + (i_1751_ - i_1752_ & 0x10000));
				    is[i_1635_++]
					= (i_1751_ - i_1750_
					   | i_1750_ - (i_1750_ >>> 8));
				} else
				    i_1635_++;
			    }
			    i_1635_ += i_1639_;
			    i_1636_ += i_1640_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method1803(int i, int i_1753_, int i_1754_, int i_1755_,
			   int i_1756_) {
	if (((Class151_Sub1_Sub1) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    int i_1757_ = (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					     .aClass173_Sub3_8814)).anInt9735
			   * 111437289);
	    i += ((Class151_Sub1_Sub1) this).anInt8806;
	    i_1753_ += ((Class151_Sub1_Sub1) this).anInt8819;
	    int i_1758_ = i_1753_ * i_1757_ + i;
	    int i_1759_ = 0;
	    int i_1760_ = ((Class151_Sub1_Sub1) this).anInt8804;
	    int i_1761_ = ((Class151_Sub1_Sub1) this).anInt8803;
	    int i_1762_ = i_1757_ - i_1761_;
	    int i_1763_ = 0;
	    if (i_1753_ < (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					     .aClass173_Sub3_8814)).anInt9725
			   * 592117349)) {
		int i_1764_ = ((((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						  .aClass173_Sub3_8814))
				.anInt9725) * 592117349
			       - i_1753_);
		i_1760_ -= i_1764_;
		i_1753_ = (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					     .aClass173_Sub3_8814)).anInt9725
			   * 592117349);
		i_1759_ += i_1764_ * i_1761_;
		i_1758_ += i_1764_ * i_1757_;
	    }
	    if (i_1753_ + i_1760_
		> ((Class173_Sub3) (((Class151_Sub1_Sub1) this)
				    .aClass173_Sub3_8814)).anInt9726 * 6965409)
		i_1760_ -= (i_1753_ + i_1760_
			    - (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						 .aClass173_Sub3_8814))
			       .anInt9726) * 6965409);
	    if (i < (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119)) {
		int i_1765_ = ((((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						  .aClass173_Sub3_8814))
				.anInt9723) * -993497119
			       - i);
		i_1761_ -= i_1765_;
		i = (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119);
		i_1759_ += i_1765_;
		i_1758_ += i_1765_;
		i_1763_ += i_1765_;
		i_1762_ += i_1765_;
	    }
	    if (i + i_1761_ > (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						 .aClass173_Sub3_8814))
			       .anInt9724) * 630968029) {
		int i_1766_ = (i + i_1761_
			       - (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						    .aClass173_Sub3_8814))
				  .anInt9724) * 630968029);
		i_1761_ -= i_1766_;
		i_1763_ += i_1766_;
		i_1762_ += i_1766_;
	    }
	    if (i_1761_ > 0 && i_1760_ > 0) {
		if (i_1756_ == 0) {
		    if (i_1754_ == 1) {
			for (int i_1767_ = -i_1760_; i_1767_ < 0; i_1767_++) {
			    int i_1768_ = i_1758_ + i_1761_ - 3;
			    while (i_1758_ < i_1768_) {
				is[i_1758_++]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1759_++]) & 0xff]);
				is[i_1758_++]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1759_++]) & 0xff]);
				is[i_1758_++]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1759_++]) & 0xff]);
				is[i_1758_++]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1759_++]) & 0xff]);
			    }
			    i_1768_ += 3;
			    while (i_1758_ < i_1768_)
				is[i_1758_++]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1759_++]) & 0xff]);
			    i_1758_ += i_1762_;
			    i_1759_ += i_1763_;
			}
		    } else if (i_1754_ == 0) {
			int i_1769_ = (i_1755_ & 0xff0000) >> 16;
			int i_1770_ = (i_1755_ & 0xff00) >> 8;
			int i_1771_ = i_1755_ & 0xff;
			for (int i_1772_ = -i_1760_; i_1772_ < 0; i_1772_++) {
			    for (int i_1773_ = -i_1761_; i_1773_ < 0;
				 i_1773_++) {
				int i_1774_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1759_++]) & 0xff]);
				int i_1775_ = ((i_1774_ & 0xff0000) * i_1769_
					       & ~0xffffff);
				int i_1776_
				    = (i_1774_ & 0xff00) * i_1770_ & 0xff0000;
				int i_1777_
				    = (i_1774_ & 0xff) * i_1771_ & 0xff00;
				is[i_1758_++]
				    = (i_1775_ | i_1776_ | i_1777_) >>> 8;
			    }
			    i_1758_ += i_1762_;
			    i_1759_ += i_1763_;
			}
		    } else if (i_1754_ == 3) {
			for (int i_1778_ = -i_1760_; i_1778_ < 0; i_1778_++) {
			    for (int i_1779_ = -i_1761_; i_1779_ < 0;
				 i_1779_++) {
				int i_1780_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1759_++]) & 0xff]);
				int i_1781_ = i_1780_ + i_1755_;
				int i_1782_ = ((i_1780_ & 0xff00ff)
					       + (i_1755_ & 0xff00ff));
				int i_1783_
				    = ((i_1782_ & 0x1000100)
				       + (i_1781_ - i_1782_ & 0x10000));
				is[i_1758_++]
				    = i_1781_ - i_1783_ | i_1783_ - (i_1783_
								     >>> 8);
			    }
			    i_1758_ += i_1762_;
			    i_1759_ += i_1763_;
			}
		    } else if (i_1754_ == 2) {
			int i_1784_ = i_1755_ >>> 24;
			int i_1785_ = 256 - i_1784_;
			int i_1786_
			    = (i_1755_ & 0xff00ff) * i_1785_ & ~0xff00ff;
			int i_1787_ = (i_1755_ & 0xff00) * i_1785_ & 0xff0000;
			i_1755_ = (i_1786_ | i_1787_) >>> 8;
			for (int i_1788_ = -i_1760_; i_1788_ < 0; i_1788_++) {
			    for (int i_1789_ = -i_1761_; i_1789_ < 0;
				 i_1789_++) {
				int i_1790_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_1759_++]) & 0xff]);
				i_1786_ = ((i_1790_ & 0xff00ff) * i_1784_
					   & ~0xff00ff);
				i_1787_
				    = (i_1790_ & 0xff00) * i_1784_ & 0xff0000;
				is[i_1758_++]
				    = ((i_1786_ | i_1787_) >>> 8) + i_1755_;
			    }
			    i_1758_ += i_1762_;
			    i_1759_ += i_1763_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1756_ == 1) {
		    if (i_1754_ == 1) {
			for (int i_1791_ = -i_1760_; i_1791_ < 0; i_1791_++) {
			    for (int i_1792_ = -i_1761_; i_1792_ < 0;
				 i_1792_++) {
				int i_1793_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_1759_++]);
				if (i_1793_ != 0) {
				    int i_1794_
					= ((((Class151_Sub1_Sub1) this)
					    .anIntArray11257[i_1793_ & 0xff])
					   | ~0xffffff);
				    int i_1795_ = 255;
				    int i_1796_ = 0;
				    int i_1797_ = is[i_1758_];
				    is[i_1758_++]
					= (((((i_1794_ & 0xff00ff) * i_1795_
					      + (i_1797_ & 0xff00ff) * i_1796_)
					     & ~0xff00ff)
					    >> 8)
					   + (((((i_1794_ & ~0xff00ff) >>> 8)
						* i_1795_)
					       + (((i_1797_ & ~0xff00ff) >>> 8)
						  * i_1796_))
					      & ~0xff00ff));
				} else
				    i_1758_++;
			    }
			    i_1758_ += i_1762_;
			    i_1759_ += i_1763_;
			}
		    } else if (i_1754_ == 0) {
			if ((i_1755_ & 0xffffff) == 16777215) {
			    int i_1798_ = i_1755_ >>> 24;
			    int i_1799_ = 256 - i_1798_;
			    for (int i_1800_ = -i_1760_; i_1800_ < 0;
				 i_1800_++) {
				for (int i_1801_ = -i_1761_; i_1801_ < 0;
				     i_1801_++) {
				    int i_1802_
					= (((Class151_Sub1_Sub1) this)
					   .aByteArray11258[i_1759_++]);
				    if (i_1802_ != 0) {
					int i_1803_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_1802_ & 0xff]);
					int i_1804_ = is[i_1758_];
					is[i_1758_++]
					    = ((((i_1803_ & 0xff00ff) * i_1798_
						 + ((i_1804_ & 0xff00ff)
						    * i_1799_))
						& ~0xff00ff)
					       + (((i_1803_ & 0xff00) * i_1798_
						   + ((i_1804_ & 0xff00)
						      * i_1799_))
						  & 0xff0000)) >> 8;
				    } else
					i_1758_++;
				}
				i_1758_ += i_1762_;
				i_1759_ += i_1763_;
			    }
			} else {
			    int i_1805_ = (i_1755_ & 0xff0000) >> 16;
			    int i_1806_ = (i_1755_ & 0xff00) >> 8;
			    int i_1807_ = i_1755_ & 0xff;
			    int i_1808_ = i_1755_ >>> 24;
			    int i_1809_ = 256 - i_1808_;
			    for (int i_1810_ = -i_1760_; i_1810_ < 0;
				 i_1810_++) {
				for (int i_1811_ = -i_1761_; i_1811_ < 0;
				     i_1811_++) {
				    int i_1812_
					= (((Class151_Sub1_Sub1) this)
					   .aByteArray11258[i_1759_++]);
				    if (i_1812_ != 0) {
					int i_1813_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_1812_ & 0xff]);
					if (i_1808_ != 255) {
					    int i_1814_
						= (((i_1813_ & 0xff0000)
						    * i_1805_)
						   & ~0xffffff);
					    int i_1815_
						= ((i_1813_ & 0xff00) * i_1806_
						   & 0xff0000);
					    int i_1816_
						= ((i_1813_ & 0xff) * i_1807_
						   & 0xff00);
					    i_1813_ = (i_1814_ | i_1815_
						       | i_1816_) >>> 8;
					    int i_1817_ = is[i_1758_];
					    is[i_1758_++]
						= (((((i_1813_ & 0xff00ff)
						      * i_1808_)
						     + ((i_1817_ & 0xff00ff)
							* i_1809_))
						    & ~0xff00ff)
						   + ((((i_1813_ & 0xff00)
							* i_1808_)
						       + ((i_1817_ & 0xff00)
							  * i_1809_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1818_
						= (((i_1813_ & 0xff0000)
						    * i_1805_)
						   & ~0xffffff);
					    int i_1819_
						= ((i_1813_ & 0xff00) * i_1806_
						   & 0xff0000);
					    int i_1820_
						= ((i_1813_ & 0xff) * i_1807_
						   & 0xff00);
					    is[i_1758_++] = (i_1818_ | i_1819_
							     | i_1820_) >>> 8;
					}
				    } else
					i_1758_++;
				}
				i_1758_ += i_1762_;
				i_1759_ += i_1763_;
			    }
			}
		    } else if (i_1754_ == 3) {
			int i_1821_ = i_1755_ >>> 24;
			int i_1822_ = 256 - i_1821_;
			for (int i_1823_ = -i_1760_; i_1823_ < 0; i_1823_++) {
			    for (int i_1824_ = -i_1761_; i_1824_ < 0;
				 i_1824_++) {
				byte i_1825_ = (((Class151_Sub1_Sub1) this)
						.aByteArray11258[i_1759_++]);
				int i_1826_ = (i_1825_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_1825_])
					       : 0);
				int i_1827_ = i_1826_ + i_1755_;
				int i_1828_ = ((i_1826_ & 0xff00ff)
					       + (i_1755_ & 0xff00ff));
				int i_1829_
				    = ((i_1828_ & 0x1000100)
				       + (i_1827_ - i_1828_ & 0x10000));
				i_1829_
				    = i_1827_ - i_1829_ | i_1829_ - (i_1829_
								     >>> 8);
				if (i_1826_ == 0 && i_1821_ != 255) {
				    i_1826_ = i_1829_;
				    i_1829_ = is[i_1758_];
				    i_1829_
					= ((((i_1826_ & 0xff00ff) * i_1821_
					     + (i_1829_ & 0xff00ff) * i_1822_)
					    & ~0xff00ff)
					   + (((i_1826_ & 0xff00) * i_1821_
					       + (i_1829_ & 0xff00) * i_1822_)
					      & 0xff0000)) >> 8;
				}
				is[i_1758_++] = i_1829_;
			    }
			    i_1758_ += i_1762_;
			    i_1759_ += i_1763_;
			}
		    } else if (i_1754_ == 2) {
			int i_1830_ = i_1755_ >>> 24;
			int i_1831_ = 256 - i_1830_;
			int i_1832_
			    = (i_1755_ & 0xff00ff) * i_1831_ & ~0xff00ff;
			int i_1833_ = (i_1755_ & 0xff00) * i_1831_ & 0xff0000;
			i_1755_ = (i_1832_ | i_1833_) >>> 8;
			for (int i_1834_ = -i_1760_; i_1834_ < 0; i_1834_++) {
			    for (int i_1835_ = -i_1761_; i_1835_ < 0;
				 i_1835_++) {
				int i_1836_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_1759_++]);
				if (i_1836_ != 0) {
				    int i_1837_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1836_ & 0xff]);
				    i_1832_ = ((i_1837_ & 0xff00ff) * i_1830_
					       & ~0xff00ff);
				    i_1833_ = ((i_1837_ & 0xff00) * i_1830_
					       & 0xff0000);
				    is[i_1758_++] = ((i_1832_ | i_1833_)
						     >>> 8) + i_1755_;
				} else
				    i_1758_++;
			    }
			    i_1758_ += i_1762_;
			    i_1759_ += i_1763_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1756_ == 2) {
		    if (i_1754_ == 1) {
			for (int i_1838_ = -i_1760_; i_1838_ < 0; i_1838_++) {
			    for (int i_1839_ = -i_1761_; i_1839_ < 0;
				 i_1839_++) {
				int i_1840_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_1759_++]);
				if (i_1840_ != 0) {
				    int i_1841_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1840_ & 0xff]);
				    int i_1842_ = is[i_1758_];
				    int i_1843_ = i_1841_ + i_1842_;
				    int i_1844_ = ((i_1841_ & 0xff00ff)
						   + (i_1842_ & 0xff00ff));
				    i_1842_
					= ((i_1844_ & 0x1000100)
					   + (i_1843_ - i_1844_ & 0x10000));
				    is[i_1758_++]
					= (i_1843_ - i_1842_
					   | i_1842_ - (i_1842_ >>> 8));
				} else
				    i_1758_++;
			    }
			    i_1758_ += i_1762_;
			    i_1759_ += i_1763_;
			}
		    } else if (i_1754_ == 0) {
			int i_1845_ = (i_1755_ & 0xff0000) >> 16;
			int i_1846_ = (i_1755_ & 0xff00) >> 8;
			int i_1847_ = i_1755_ & 0xff;
			for (int i_1848_ = -i_1760_; i_1848_ < 0; i_1848_++) {
			    for (int i_1849_ = -i_1761_; i_1849_ < 0;
				 i_1849_++) {
				int i_1850_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_1759_++]);
				if (i_1850_ != 0) {
				    int i_1851_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1850_ & 0xff]);
				    int i_1852_
					= ((i_1851_ & 0xff0000) * i_1845_
					   & ~0xffffff);
				    int i_1853_ = ((i_1851_ & 0xff00) * i_1846_
						   & 0xff0000);
				    int i_1854_
					= (i_1851_ & 0xff) * i_1847_ & 0xff00;
				    i_1851_
					= (i_1852_ | i_1853_ | i_1854_) >>> 8;
				    int i_1855_ = is[i_1758_];
				    int i_1856_ = i_1851_ + i_1855_;
				    int i_1857_ = ((i_1851_ & 0xff00ff)
						   + (i_1855_ & 0xff00ff));
				    i_1855_
					= ((i_1857_ & 0x1000100)
					   + (i_1856_ - i_1857_ & 0x10000));
				    is[i_1758_++]
					= (i_1856_ - i_1855_
					   | i_1855_ - (i_1855_ >>> 8));
				} else
				    i_1758_++;
			    }
			    i_1758_ += i_1762_;
			    i_1759_ += i_1763_;
			}
		    } else if (i_1754_ == 3) {
			for (int i_1858_ = -i_1760_; i_1858_ < 0; i_1858_++) {
			    for (int i_1859_ = -i_1761_; i_1859_ < 0;
				 i_1859_++) {
				byte i_1860_ = (((Class151_Sub1_Sub1) this)
						.aByteArray11258[i_1759_++]);
				int i_1861_ = (i_1860_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_1860_])
					       : 0);
				int i_1862_ = i_1861_ + i_1755_;
				int i_1863_ = ((i_1861_ & 0xff00ff)
					       + (i_1755_ & 0xff00ff));
				int i_1864_
				    = ((i_1863_ & 0x1000100)
				       + (i_1862_ - i_1863_ & 0x10000));
				i_1861_
				    = i_1862_ - i_1864_ | i_1864_ - (i_1864_
								     >>> 8);
				i_1864_ = is[i_1758_];
				i_1862_ = i_1861_ + i_1864_;
				i_1863_ = (i_1861_ & 0xff00ff) + (i_1864_
								  & 0xff00ff);
				i_1864_ = ((i_1863_ & 0x1000100)
					   + (i_1862_ - i_1863_ & 0x10000));
				is[i_1758_++]
				    = i_1862_ - i_1864_ | i_1864_ - (i_1864_
								     >>> 8);
			    }
			    i_1758_ += i_1762_;
			    i_1759_ += i_1763_;
			}
		    } else if (i_1754_ == 2) {
			int i_1865_ = i_1755_ >>> 24;
			int i_1866_ = 256 - i_1865_;
			int i_1867_
			    = (i_1755_ & 0xff00ff) * i_1866_ & ~0xff00ff;
			int i_1868_ = (i_1755_ & 0xff00) * i_1866_ & 0xff0000;
			i_1755_ = (i_1867_ | i_1868_) >>> 8;
			for (int i_1869_ = -i_1760_; i_1869_ < 0; i_1869_++) {
			    for (int i_1870_ = -i_1761_; i_1870_ < 0;
				 i_1870_++) {
				int i_1871_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_1759_++]);
				if (i_1871_ != 0) {
				    int i_1872_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1871_ & 0xff]);
				    i_1867_ = ((i_1872_ & 0xff00ff) * i_1865_
					       & ~0xff00ff);
				    i_1868_ = ((i_1872_ & 0xff00) * i_1865_
					       & 0xff0000);
				    i_1872_ = (((i_1867_ | i_1868_) >>> 8)
					       + i_1755_);
				    int i_1873_ = is[i_1758_];
				    int i_1874_ = i_1872_ + i_1873_;
				    int i_1875_ = ((i_1872_ & 0xff00ff)
						   + (i_1873_ & 0xff00ff));
				    i_1873_
					= ((i_1875_ & 0x1000100)
					   + (i_1874_ - i_1875_ & 0x10000));
				    is[i_1758_++]
					= (i_1874_ - i_1873_
					   | i_1873_ - (i_1873_ >>> 8));
				} else
				    i_1758_++;
			    }
			    i_1758_ += i_1762_;
			    i_1759_ += i_1763_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method1805(int i, int i_1876_, Class148 class148, int i_1877_,
			   int i_1878_) {
	if (((Class151_Sub1_Sub1) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    i += ((Class151_Sub1_Sub1) this).anInt8806;
	    i_1876_ += ((Class151_Sub1_Sub1) this).anInt8819;
	    int i_1879_ = 0;
	    int i_1880_ = (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					     .aClass173_Sub3_8814)).anInt9735
			   * 111437289);
	    int i_1881_ = ((Class151_Sub1_Sub1) this).anInt8803;
	    int i_1882_ = ((Class151_Sub1_Sub1) this).anInt8804;
	    int i_1883_ = i_1880_ - i_1881_;
	    int i_1884_ = 0;
	    int i_1885_ = i + i_1876_ * i_1880_;
	    if (i_1876_ < (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					     .aClass173_Sub3_8814)).anInt9725
			   * 592117349)) {
		int i_1886_ = ((((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						  .aClass173_Sub3_8814))
				.anInt9725) * 592117349
			       - i_1876_);
		i_1882_ -= i_1886_;
		i_1876_ = (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					     .aClass173_Sub3_8814)).anInt9725
			   * 592117349);
		i_1879_ += i_1886_ * i_1881_;
		i_1885_ += i_1886_ * i_1880_;
	    }
	    if (i_1876_ + i_1882_
		> ((Class173_Sub3) (((Class151_Sub1_Sub1) this)
				    .aClass173_Sub3_8814)).anInt9726 * 6965409)
		i_1882_ -= (i_1876_ + i_1882_
			    - (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						 .aClass173_Sub3_8814))
			       .anInt9726) * 6965409);
	    if (i < (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119)) {
		int i_1887_ = ((((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						  .aClass173_Sub3_8814))
				.anInt9723) * -993497119
			       - i);
		i_1881_ -= i_1887_;
		i = (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119);
		i_1879_ += i_1887_;
		i_1885_ += i_1887_;
		i_1884_ += i_1887_;
		i_1883_ += i_1887_;
	    }
	    if (i + i_1881_ > (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						 .aClass173_Sub3_8814))
			       .anInt9724) * 630968029) {
		int i_1888_ = (i + i_1881_
			       - (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						    .aClass173_Sub3_8814))
				  .anInt9724) * 630968029);
		i_1881_ -= i_1888_;
		i_1884_ += i_1888_;
		i_1883_ += i_1888_;
	    }
	    if (i_1881_ > 0 && i_1882_ > 0) {
		Class148_Sub1 class148_sub1 = (Class148_Sub1) class148;
		int[] is_1889_
		    = ((Class148_Sub1) class148_sub1).anIntArray8789;
		int[] is_1890_
		    = ((Class148_Sub1) class148_sub1).anIntArray8788;
		int i_1891_ = i_1876_;
		if (i_1878_ > i_1891_) {
		    i_1891_ = i_1878_;
		    i_1885_ += (i_1878_ - i_1876_) * i_1880_;
		    i_1879_ += ((i_1878_ - i_1876_)
				* ((Class151_Sub1_Sub1) this).anInt8803);
		}
		int i_1892_
		    = (i_1878_ + is_1889_.length < i_1876_ + i_1882_
		       ? i_1878_ + is_1889_.length : i_1876_ + i_1882_);
		for (int i_1893_ = i_1891_; i_1893_ < i_1892_; i_1893_++) {
		    int i_1894_ = is_1889_[i_1893_ - i_1878_] + i_1877_;
		    int i_1895_ = is_1890_[i_1893_ - i_1878_];
		    int i_1896_ = i_1881_;
		    if (i > i_1894_) {
			int i_1897_ = i - i_1894_;
			if (i_1897_ >= i_1895_) {
			    i_1879_ += i_1881_ + i_1884_;
			    i_1885_ += i_1881_ + i_1883_;
			    continue;
			}
			i_1895_ -= i_1897_;
		    } else {
			int i_1898_ = i_1894_ - i;
			if (i_1898_ >= i_1881_) {
			    i_1879_ += i_1881_ + i_1884_;
			    i_1885_ += i_1881_ + i_1883_;
			    continue;
			}
			i_1879_ += i_1898_;
			i_1896_ -= i_1898_;
			i_1885_ += i_1898_;
		    }
		    int i_1899_ = 0;
		    if (i_1896_ < i_1895_)
			i_1895_ = i_1896_;
		    else
			i_1899_ = i_1896_ - i_1895_;
		    for (int i_1900_ = -i_1895_; i_1900_ < 0; i_1900_++) {
			int i_1901_ = (((Class151_Sub1_Sub1) this)
				       .aByteArray11258[i_1879_++]);
			if (i_1901_ != 0)
			    is[i_1885_++] = (((Class151_Sub1_Sub1) this)
					     .anIntArray11257[i_1901_ & 0xff]);
			else
			    i_1885_++;
		    }
		    i_1879_ += i_1899_ + i_1884_;
		    i_1885_ += i_1899_ + i_1883_;
		}
	    }
	}
    }
    
    void method1797(int i, int i_1902_, int i_1903_, int i_1904_, int i_1905_,
		    int i_1906_, int i_1907_, int i_1908_) {
	if (((Class151_Sub1_Sub1) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	if (i_1903_ > 0 && i_1904_ > 0) {
	    int[] is = (((Class173_Sub3)
			 ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
			.anIntArray9719);
	    if (is != null) {
		int i_1909_ = 0;
		int i_1910_ = 0;
		int i_1911_
		    = (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					 .aClass173_Sub3_8814)).anInt9735
		       * 111437289);
		int i_1912_ = (((Class151_Sub1_Sub1) this).anInt8806
			       + ((Class151_Sub1_Sub1) this).anInt8803
			       + ((Class151_Sub1_Sub1) this).anInt8832);
		int i_1913_ = (((Class151_Sub1_Sub1) this).anInt8819
			       + ((Class151_Sub1_Sub1) this).anInt8804
			       + ((Class151_Sub1_Sub1) this).anInt8808);
		int i_1914_ = (i_1912_ << 16) / i_1903_;
		int i_1915_ = (i_1913_ << 16) / i_1904_;
		if (((Class151_Sub1_Sub1) this).anInt8806 > 0) {
		    int i_1916_
			= (((((Class151_Sub1_Sub1) this).anInt8806 << 16)
			    + i_1914_ - 1)
			   / i_1914_);
		    i += i_1916_;
		    i_1909_
			+= (i_1916_ * i_1914_
			    - (((Class151_Sub1_Sub1) this).anInt8806 << 16));
		}
		if (((Class151_Sub1_Sub1) this).anInt8819 > 0) {
		    int i_1917_
			= (((((Class151_Sub1_Sub1) this).anInt8819 << 16)
			    + i_1915_ - 1)
			   / i_1915_);
		    i_1902_ += i_1917_;
		    i_1910_
			+= (i_1917_ * i_1915_
			    - (((Class151_Sub1_Sub1) this).anInt8819 << 16));
		}
		if (((Class151_Sub1_Sub1) this).anInt8803 < i_1912_)
		    i_1903_ = ((((Class151_Sub1_Sub1) this).anInt8803 << 16)
			       - i_1909_ + i_1914_ - 1) / i_1914_;
		if (((Class151_Sub1_Sub1) this).anInt8804 < i_1913_)
		    i_1904_ = ((((Class151_Sub1_Sub1) this).anInt8804 << 16)
			       - i_1910_ + i_1915_ - 1) / i_1915_;
		int i_1918_ = i + i_1902_ * i_1911_;
		int i_1919_ = i_1911_ - i_1903_;
		if (i_1902_ + i_1904_
		    > (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					 .aClass173_Sub3_8814)).anInt9726
		       * 6965409))
		    i_1904_
			-= (i_1902_ + i_1904_
			    - (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						 .aClass173_Sub3_8814))
			       .anInt9726) * 6965409);
		if (i_1902_ < (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						 .aClass173_Sub3_8814))
			       .anInt9725) * 592117349) {
		    int i_1920_
			= ((((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					      .aClass173_Sub3_8814)).anInt9725
			    * 592117349)
			   - i_1902_);
		    i_1904_ -= i_1920_;
		    i_1918_ += i_1920_ * i_1911_;
		    i_1910_ += i_1915_ * i_1920_;
		}
		if (i + i_1903_
		    > (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					 .aClass173_Sub3_8814)).anInt9724
		       * 630968029)) {
		    int i_1921_
			= (i + i_1903_
			   - (((Class173_Sub3)
			       ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
			      .anInt9724) * 630968029);
		    i_1903_ -= i_1921_;
		    i_1919_ += i_1921_;
		}
		if (i < (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					   .aClass173_Sub3_8814)).anInt9723
			 * -993497119)) {
		    int i_1922_
			= ((((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					      .aClass173_Sub3_8814)).anInt9723
			    * -993497119)
			   - i);
		    i_1903_ -= i_1922_;
		    i_1918_ += i_1922_;
		    i_1909_ += i_1914_ * i_1922_;
		    i_1919_ += i_1922_;
		}
		if (i_1907_ == 0) {
		    if (i_1905_ == 1) {
			int i_1923_ = i_1909_;
			for (int i_1924_ = -i_1904_; i_1924_ < 0; i_1924_++) {
			    int i_1925_
				= ((i_1910_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_1926_ = -i_1903_; i_1926_ < 0;
				 i_1926_++) {
				is[i_1918_++]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258
					 [(i_1909_ >> 16) + i_1925_]) & 0xff]);
				i_1909_ += i_1914_;
			    }
			    i_1910_ += i_1915_;
			    i_1909_ = i_1923_;
			    i_1918_ += i_1919_;
			}
		    } else if (i_1905_ == 0) {
			int i_1927_ = (i_1906_ & 0xff0000) >> 16;
			int i_1928_ = (i_1906_ & 0xff00) >> 8;
			int i_1929_ = i_1906_ & 0xff;
			int i_1930_ = i_1909_;
			for (int i_1931_ = -i_1904_; i_1931_ < 0; i_1931_++) {
			    int i_1932_
				= ((i_1910_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_1933_ = -i_1903_; i_1933_ < 0;
				 i_1933_++) {
				int i_1934_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258
					 [(i_1909_ >> 16) + i_1932_]) & 0xff]);
				int i_1935_ = ((i_1934_ & 0xff0000) * i_1927_
					       & ~0xffffff);
				int i_1936_
				    = (i_1934_ & 0xff00) * i_1928_ & 0xff0000;
				int i_1937_
				    = (i_1934_ & 0xff) * i_1929_ & 0xff00;
				is[i_1918_++]
				    = (i_1935_ | i_1936_ | i_1937_) >>> 8;
				i_1909_ += i_1914_;
			    }
			    i_1910_ += i_1915_;
			    i_1909_ = i_1930_;
			    i_1918_ += i_1919_;
			}
		    } else if (i_1905_ == 3) {
			int i_1938_ = i_1909_;
			for (int i_1939_ = -i_1904_; i_1939_ < 0; i_1939_++) {
			    int i_1940_
				= ((i_1910_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_1941_ = -i_1903_; i_1941_ < 0;
				 i_1941_++) {
				byte i_1942_ = (((Class151_Sub1_Sub1) this)
						.aByteArray11258
						[(i_1909_ >> 16) + i_1940_]);
				int i_1943_ = (i_1942_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_1942_])
					       : 0);
				int i_1944_ = i_1943_ + i_1906_;
				int i_1945_ = ((i_1943_ & 0xff00ff)
					       + (i_1906_ & 0xff00ff));
				int i_1946_
				    = ((i_1945_ & 0x1000100)
				       + (i_1944_ - i_1945_ & 0x10000));
				is[i_1918_++]
				    = i_1944_ - i_1946_ | i_1946_ - (i_1946_
								     >>> 8);
				i_1909_ += i_1914_;
			    }
			    i_1910_ += i_1915_;
			    i_1909_ = i_1938_;
			    i_1918_ += i_1919_;
			}
		    } else if (i_1905_ == 2) {
			int i_1947_ = i_1906_ >>> 24;
			int i_1948_ = 256 - i_1947_;
			int i_1949_
			    = (i_1906_ & 0xff00ff) * i_1948_ & ~0xff00ff;
			int i_1950_ = (i_1906_ & 0xff00) * i_1948_ & 0xff0000;
			i_1906_ = (i_1949_ | i_1950_) >>> 8;
			int i_1951_ = i_1909_;
			for (int i_1952_ = -i_1904_; i_1952_ < 0; i_1952_++) {
			    int i_1953_
				= ((i_1910_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_1954_ = -i_1903_; i_1954_ < 0;
				 i_1954_++) {
				int i_1955_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258
					 [(i_1909_ >> 16) + i_1953_]) & 0xff]);
				i_1949_ = ((i_1955_ & 0xff00ff) * i_1947_
					   & ~0xff00ff);
				i_1950_
				    = (i_1955_ & 0xff00) * i_1947_ & 0xff0000;
				is[i_1918_++]
				    = ((i_1949_ | i_1950_) >>> 8) + i_1906_;
				i_1909_ += i_1914_;
			    }
			    i_1910_ += i_1915_;
			    i_1909_ = i_1951_;
			    i_1918_ += i_1919_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1907_ == 1) {
		    if (i_1905_ == 1) {
			int i_1956_ = i_1909_;
			for (int i_1957_ = -i_1904_; i_1957_ < 0; i_1957_++) {
			    int i_1958_
				= ((i_1910_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_1959_ = -i_1903_; i_1959_ < 0;
				 i_1959_++) {
				int i_1960_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258
					       [(i_1909_ >> 16) + i_1958_]);
				if (i_1960_ != 0)
				    is[i_1918_++]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_1960_ & 0xff]);
				else
				    i_1918_++;
				i_1909_ += i_1914_;
			    }
			    i_1910_ += i_1915_;
			    i_1909_ = i_1956_;
			    i_1918_ += i_1919_;
			}
		    } else if (i_1905_ == 0) {
			int i_1961_ = i_1909_;
			if ((i_1906_ & 0xffffff) == 16777215) {
			    int i_1962_ = i_1906_ >>> 24;
			    int i_1963_ = 256 - i_1962_;
			    for (int i_1964_ = -i_1904_; i_1964_ < 0;
				 i_1964_++) {
				int i_1965_ = ((i_1910_ >> 16)
					       * (((Class151_Sub1_Sub1) this)
						  .anInt8803));
				for (int i_1966_ = -i_1903_; i_1966_ < 0;
				     i_1966_++) {
				    int i_1967_
					= (((Class151_Sub1_Sub1) this)
					   .aByteArray11258
					   [(i_1909_ >> 16) + i_1965_]);
				    if (i_1967_ != 0) {
					int i_1968_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_1967_ & 0xff]);
					int i_1969_ = is[i_1918_];
					is[i_1918_++]
					    = ((((i_1968_ & 0xff00ff) * i_1962_
						 + ((i_1969_ & 0xff00ff)
						    * i_1963_))
						& ~0xff00ff)
					       + (((i_1968_ & 0xff00) * i_1962_
						   + ((i_1969_ & 0xff00)
						      * i_1963_))
						  & 0xff0000)) >> 8;
				    } else
					i_1918_++;
				    i_1909_ += i_1914_;
				}
				i_1910_ += i_1915_;
				i_1909_ = i_1961_;
				i_1918_ += i_1919_;
			    }
			} else {
			    int i_1970_ = (i_1906_ & 0xff0000) >> 16;
			    int i_1971_ = (i_1906_ & 0xff00) >> 8;
			    int i_1972_ = i_1906_ & 0xff;
			    int i_1973_ = i_1906_ >>> 24;
			    int i_1974_ = 256 - i_1973_;
			    for (int i_1975_ = -i_1904_; i_1975_ < 0;
				 i_1975_++) {
				int i_1976_ = ((i_1910_ >> 16)
					       * (((Class151_Sub1_Sub1) this)
						  .anInt8803));
				for (int i_1977_ = -i_1903_; i_1977_ < 0;
				     i_1977_++) {
				    int i_1978_
					= (((Class151_Sub1_Sub1) this)
					   .aByteArray11258
					   [(i_1909_ >> 16) + i_1976_]);
				    if (i_1978_ != 0) {
					int i_1979_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_1978_ & 0xff]);
					if (i_1973_ != 255) {
					    int i_1980_
						= (((i_1979_ & 0xff0000)
						    * i_1970_)
						   & ~0xffffff);
					    int i_1981_
						= ((i_1979_ & 0xff00) * i_1971_
						   & 0xff0000);
					    int i_1982_
						= ((i_1979_ & 0xff) * i_1972_
						   & 0xff00);
					    i_1979_ = (i_1980_ | i_1981_
						       | i_1982_) >>> 8;
					    int i_1983_ = is[i_1918_];
					    is[i_1918_++]
						= (((((i_1979_ & 0xff00ff)
						      * i_1973_)
						     + ((i_1983_ & 0xff00ff)
							* i_1974_))
						    & ~0xff00ff)
						   + ((((i_1979_ & 0xff00)
							* i_1973_)
						       + ((i_1983_ & 0xff00)
							  * i_1974_))
						      & 0xff0000)) >> 8;
					} else {
					    int i_1984_
						= (((i_1979_ & 0xff0000)
						    * i_1970_)
						   & ~0xffffff);
					    int i_1985_
						= ((i_1979_ & 0xff00) * i_1971_
						   & 0xff0000);
					    int i_1986_
						= ((i_1979_ & 0xff) * i_1972_
						   & 0xff00);
					    is[i_1918_++] = (i_1984_ | i_1985_
							     | i_1986_) >>> 8;
					}
				    } else
					i_1918_++;
				    i_1909_ += i_1914_;
				}
				i_1910_ += i_1915_;
				i_1909_ = i_1961_;
				i_1918_ += i_1919_;
			    }
			}
		    } else if (i_1905_ == 3) {
			int i_1987_ = i_1909_;
			int i_1988_ = i_1906_ >>> 24;
			int i_1989_ = 256 - i_1988_;
			for (int i_1990_ = -i_1904_; i_1990_ < 0; i_1990_++) {
			    int i_1991_
				= ((i_1910_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_1992_ = -i_1903_; i_1992_ < 0;
				 i_1992_++) {
				byte i_1993_ = (((Class151_Sub1_Sub1) this)
						.aByteArray11258
						[(i_1909_ >> 16) + i_1991_]);
				int i_1994_ = (i_1993_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_1993_])
					       : 0);
				int i_1995_ = i_1994_ + i_1906_;
				int i_1996_ = ((i_1994_ & 0xff00ff)
					       + (i_1906_ & 0xff00ff));
				int i_1997_
				    = ((i_1996_ & 0x1000100)
				       + (i_1995_ - i_1996_ & 0x10000));
				i_1997_
				    = i_1995_ - i_1997_ | i_1997_ - (i_1997_
								     >>> 8);
				if (i_1994_ == 0 && i_1988_ != 255) {
				    i_1994_ = i_1997_;
				    i_1997_ = is[i_1918_];
				    i_1997_
					= ((((i_1994_ & 0xff00ff) * i_1988_
					     + (i_1997_ & 0xff00ff) * i_1989_)
					    & ~0xff00ff)
					   + (((i_1994_ & 0xff00) * i_1988_
					       + (i_1997_ & 0xff00) * i_1989_)
					      & 0xff0000)) >> 8;
				}
				is[i_1918_++] = i_1997_;
				i_1909_ += i_1914_;
			    }
			    i_1910_ += i_1915_;
			    i_1909_ = i_1987_;
			    i_1918_ += i_1919_;
			}
		    } else if (i_1905_ == 2) {
			int i_1998_ = i_1906_ >>> 24;
			int i_1999_ = 256 - i_1998_;
			int i_2000_
			    = (i_1906_ & 0xff00ff) * i_1999_ & ~0xff00ff;
			int i_2001_ = (i_1906_ & 0xff00) * i_1999_ & 0xff0000;
			i_1906_ = (i_2000_ | i_2001_) >>> 8;
			int i_2002_ = i_1909_;
			for (int i_2003_ = -i_1904_; i_2003_ < 0; i_2003_++) {
			    int i_2004_
				= ((i_1910_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_2005_ = -i_1903_; i_2005_ < 0;
				 i_2005_++) {
				int i_2006_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258
					       [(i_1909_ >> 16) + i_2004_]);
				if (i_2006_ != 0) {
				    int i_2007_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_2006_ & 0xff]);
				    i_2000_ = ((i_2007_ & 0xff00ff) * i_1998_
					       & ~0xff00ff);
				    i_2001_ = ((i_2007_ & 0xff00) * i_1998_
					       & 0xff0000);
				    is[i_1918_++] = ((i_2000_ | i_2001_)
						     >>> 8) + i_1906_;
				} else
				    i_1918_++;
				i_1909_ += i_1914_;
			    }
			    i_1910_ += i_1915_;
			    i_1909_ = i_2002_;
			    i_1918_ += i_1919_;
			}
		    } else
			throw new IllegalArgumentException();
		} else if (i_1907_ == 2) {
		    if (i_1905_ == 1) {
			int i_2008_ = i_1909_;
			for (int i_2009_ = -i_1904_; i_2009_ < 0; i_2009_++) {
			    int i_2010_
				= ((i_1910_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_2011_ = -i_1903_; i_2011_ < 0;
				 i_2011_++) {
				int i_2012_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258
					       [(i_1909_ >> 16) + i_2010_]);
				if (i_2012_ != 0) {
				    int i_2013_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_2012_ & 0xff]);
				    int i_2014_ = is[i_1918_];
				    int i_2015_ = i_2013_ + i_2014_;
				    int i_2016_ = ((i_2013_ & 0xff00ff)
						   + (i_2014_ & 0xff00ff));
				    i_2014_
					= ((i_2016_ & 0x1000100)
					   + (i_2015_ - i_2016_ & 0x10000));
				    is[i_1918_++]
					= (i_2015_ - i_2014_
					   | i_2014_ - (i_2014_ >>> 8));
				} else
				    i_1918_++;
				i_1909_ += i_1914_;
			    }
			    i_1910_ += i_1915_;
			    i_1909_ = i_2008_;
			    i_1918_ += i_1919_;
			}
		    } else if (i_1905_ == 0) {
			int i_2017_ = i_1909_;
			int i_2018_ = (i_1906_ & 0xff0000) >> 16;
			int i_2019_ = (i_1906_ & 0xff00) >> 8;
			int i_2020_ = i_1906_ & 0xff;
			for (int i_2021_ = -i_1904_; i_2021_ < 0; i_2021_++) {
			    int i_2022_
				= ((i_1910_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_2023_ = -i_1903_; i_2023_ < 0;
				 i_2023_++) {
				int i_2024_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258
					       [(i_1909_ >> 16) + i_2022_]);
				if (i_2024_ != 0) {
				    int i_2025_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_2024_ & 0xff]);
				    int i_2026_
					= ((i_2025_ & 0xff0000) * i_2018_
					   & ~0xffffff);
				    int i_2027_ = ((i_2025_ & 0xff00) * i_2019_
						   & 0xff0000);
				    int i_2028_
					= (i_2025_ & 0xff) * i_2020_ & 0xff00;
				    i_2025_
					= (i_2026_ | i_2027_ | i_2028_) >>> 8;
				    int i_2029_ = is[i_1918_];
				    int i_2030_ = i_2025_ + i_2029_;
				    int i_2031_ = ((i_2025_ & 0xff00ff)
						   + (i_2029_ & 0xff00ff));
				    i_2029_
					= ((i_2031_ & 0x1000100)
					   + (i_2030_ - i_2031_ & 0x10000));
				    is[i_1918_++]
					= (i_2030_ - i_2029_
					   | i_2029_ - (i_2029_ >>> 8));
				} else
				    i_1918_++;
				i_1909_ += i_1914_;
			    }
			    i_1910_ += i_1915_;
			    i_1909_ = i_2017_;
			    i_1918_ += i_1919_;
			}
		    } else if (i_1905_ == 3) {
			int i_2032_ = i_1909_;
			for (int i_2033_ = -i_1904_; i_2033_ < 0; i_2033_++) {
			    int i_2034_
				= ((i_1910_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_2035_ = -i_1903_; i_2035_ < 0;
				 i_2035_++) {
				byte i_2036_ = (((Class151_Sub1_Sub1) this)
						.aByteArray11258
						[(i_1909_ >> 16) + i_2034_]);
				int i_2037_ = (i_2036_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_2036_])
					       : 0);
				int i_2038_ = i_2037_ + i_1906_;
				int i_2039_ = ((i_2037_ & 0xff00ff)
					       + (i_1906_ & 0xff00ff));
				int i_2040_
				    = ((i_2039_ & 0x1000100)
				       + (i_2038_ - i_2039_ & 0x10000));
				i_2037_
				    = i_2038_ - i_2040_ | i_2040_ - (i_2040_
								     >>> 8);
				i_2040_ = is[i_1918_];
				i_2038_ = i_2037_ + i_2040_;
				i_2039_ = (i_2037_ & 0xff00ff) + (i_2040_
								  & 0xff00ff);
				i_2040_ = ((i_2039_ & 0x1000100)
					   + (i_2038_ - i_2039_ & 0x10000));
				is[i_1918_++]
				    = i_2038_ - i_2040_ | i_2040_ - (i_2040_
								     >>> 8);
				i_1909_ += i_1914_;
			    }
			    i_1910_ += i_1915_;
			    i_1909_ = i_2032_;
			    i_1918_ += i_1919_;
			}
		    } else if (i_1905_ == 2) {
			int i_2041_ = i_1906_ >>> 24;
			int i_2042_ = 256 - i_2041_;
			int i_2043_
			    = (i_1906_ & 0xff00ff) * i_2042_ & ~0xff00ff;
			int i_2044_ = (i_1906_ & 0xff00) * i_2042_ & 0xff0000;
			i_1906_ = (i_2043_ | i_2044_) >>> 8;
			int i_2045_ = i_1909_;
			for (int i_2046_ = -i_1904_; i_2046_ < 0; i_2046_++) {
			    int i_2047_
				= ((i_1910_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_2048_ = -i_1903_; i_2048_ < 0;
				 i_2048_++) {
				int i_2049_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258
					       [(i_1909_ >> 16) + i_2047_]);
				if (i_2049_ != 0) {
				    int i_2050_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_2049_ & 0xff]);
				    i_2043_ = ((i_2050_ & 0xff00ff) * i_2041_
					       & ~0xff00ff);
				    i_2044_ = ((i_2050_ & 0xff00) * i_2041_
					       & 0xff0000);
				    i_2050_ = (((i_2043_ | i_2044_) >>> 8)
					       + i_1906_);
				    int i_2051_ = is[i_1918_];
				    int i_2052_ = i_2050_ + i_2051_;
				    int i_2053_ = ((i_2050_ & 0xff00ff)
						   + (i_2051_ & 0xff00ff));
				    i_2051_
					= ((i_2053_ & 0x1000100)
					   + (i_2052_ - i_2053_ & 0x10000));
				    is[i_1918_++]
					= (i_2052_ - i_2051_
					   | i_2051_ - (i_2051_ >>> 8));
				} else
				    i_1918_++;
				i_1909_ += i_1914_;
			    }
			    i_1910_ += i_1915_;
			    i_1909_ = i_2045_;
			    i_1918_ += i_1919_;
			}
		    } else
			throw new IllegalArgumentException();
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method8294(int i, int i_2054_) {
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    if (anInt8822 == 0) {
		if (anInt8825 == 0) {
		    int i_2055_ = anInt8816;
		    while (i_2055_ < 0) {
			int i_2056_ = anInt8818;
			int i_2057_ = anInt8807;
			int i_2058_ = anInt8826;
			int i_2059_ = anInt8809;
			if (i_2057_ >= 0 && i_2058_ >= 0
			    && i_2057_ - (((Class151_Sub1_Sub1) this).anInt8803
					  << 12) < 0
			    && i_2058_ - (((Class151_Sub1_Sub1) this).anInt8804
					  << 12) < 0) {
			    for (/**/; i_2059_ < 0; i_2059_++) {
				int i_2060_
				    = ((i_2058_ >> 12) * ((Class151_Sub1_Sub1)
							  this).anInt8803
				       + (i_2057_ >> 12));
				int i_2061_ = i_2056_++;
				if (i_2054_ == 0) {
				    if (i == 1)
					is[i_2061_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2060_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_2062_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2060_])
						 & 0xff)]);
					int i_2063_
					    = ((i_2062_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_2064_
					    = ((i_2062_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_2065_
					    = ((i_2062_ & 0xff) * anInt8836
					       & 0xff00);
					is[i_2061_] = (i_2063_ | i_2064_
						       | i_2065_) >>> 8;
				    } else if (i == 3) {
					int i_2066_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2060_])
						 & 0xff)]);
					int i_2067_ = anInt8829;
					int i_2068_ = i_2066_ + i_2067_;
					int i_2069_ = ((i_2066_ & 0xff00ff)
						       + (i_2067_ & 0xff00ff));
					int i_2070_ = ((i_2069_ & 0x1000100)
						       + (i_2068_ - i_2069_
							  & 0x10000));
					is[i_2061_]
					    = (i_2068_ - i_2070_
					       | i_2070_ - (i_2070_ >>> 8));
				    } else if (i == 2) {
					int i_2071_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2060_])
						 & 0xff)]);
					int i_2072_
					    = ((i_2071_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_2073_
					    = ((i_2071_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_2061_] = ((i_2072_ | i_2073_)
						       >>> 8) + anInt8834;
				    } else
					throw new IllegalArgumentException();
				} else if (i_2054_ == 1) {
				    if (i == 1) {
					int i_2074_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2060_]);
					if (i_2074_ != 0)
					    is[i_2061_]
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2074_ & 0xff]);
				    } else if (i == 0) {
					int i_2075_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2060_]);
					if (i_2075_ != 0) {
					    int i_2076_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2075_ & 0xff]);
					    if ((anInt8829 & 0xffffff)
						== 16777215) {
						int i_2077_ = anInt8829 >>> 24;
						int i_2078_ = 256 - i_2077_;
						int i_2079_ = is[i_2061_];
						is[i_2061_]
						    = (((((i_2076_ & 0xff00ff)
							  * i_2077_)
							 + ((i_2079_
							     & 0xff00ff)
							    * i_2078_))
							& ~0xff00ff)
						       + ((((i_2076_ & 0xff00)
							    * i_2077_)
							   + ((i_2079_
							       & 0xff00)
							      * i_2078_))
							  & 0xff0000)) >> 8;
					    } else if (anInt8830 != 255) {
						int i_2080_
						    = (((i_2076_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_2081_
						    = (((i_2076_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_2082_
						    = (((i_2076_ & 0xff)
							* anInt8836)
						       & 0xff00);
						i_2076_ = (i_2080_ | i_2081_
							   | i_2082_) >>> 8;
						int i_2083_ = is[i_2061_];
						is[i_2061_]
						    = (((((i_2076_ & 0xff00ff)
							  * anInt8830)
							 + ((i_2083_
							     & 0xff00ff)
							    * anInt8831))
							& ~0xff00ff)
						       + ((((i_2076_ & 0xff00)
							    * anInt8830)
							   + ((i_2083_
							       & 0xff00)
							      * anInt8831))
							  & 0xff0000)) >> 8;
					    } else {
						int i_2084_
						    = (((i_2076_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_2085_
						    = (((i_2076_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_2086_
						    = (((i_2076_ & 0xff)
							* anInt8836)
						       & 0xff00);
						is[i_2061_]
						    = (i_2084_ | i_2085_
						       | i_2086_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_2087_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2060_]);
					int i_2088_
					    = (i_2087_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_2087_])
					       : 0);
					int i_2089_ = anInt8829;
					int i_2090_ = i_2088_ + i_2089_;
					int i_2091_ = ((i_2088_ & 0xff00ff)
						       + (i_2089_ & 0xff00ff));
					int i_2092_ = ((i_2091_ & 0x1000100)
						       + (i_2090_ - i_2091_
							  & 0x10000));
					i_2092_
					    = (i_2090_ - i_2092_
					       | i_2092_ - (i_2092_ >>> 8));
					if (i_2088_ == 0 && anInt8830 != 255) {
					    i_2088_ = i_2092_;
					    i_2092_ = is[i_2061_];
					    i_2092_
						= (((((i_2088_ & 0xff00ff)
						      * anInt8830)
						     + ((i_2092_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_2088_ & 0xff00)
							* anInt8830)
						       + ((i_2092_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					}
					is[i_2061_] = i_2092_;
				    } else if (i == 2) {
					int i_2093_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2060_]);
					if (i_2093_ != 0) {
					    int i_2094_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2093_ & 0xff]);
					    int i_2095_
						= (((i_2094_ & 0xff00ff)
						    * anInt8830)
						   & ~0xff00ff);
					    int i_2096_ = (((i_2094_ & 0xff00)
							    * anInt8830)
							   & 0xff0000);
					    is[i_2061_++]
						= (((i_2095_ | i_2096_) >>> 8)
						   + anInt8834);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_2054_ == 2) {
				    if (i == 1) {
					int i_2097_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2060_]);
					if (i_2097_ != 0) {
					    int i_2098_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2097_ & 0xff]);
					    int i_2099_ = is[i_2061_];
					    int i_2100_ = i_2098_ + i_2099_;
					    int i_2101_
						= ((i_2098_ & 0xff00ff)
						   + (i_2099_ & 0xff00ff));
					    i_2099_ = ((i_2101_ & 0x1000100)
						       + (i_2100_ - i_2101_
							  & 0x10000));
					    is[i_2061_]
						= (i_2100_ - i_2099_
						   | i_2099_ - (i_2099_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_2102_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2060_]);
					if (i_2102_ != 0) {
					    int i_2103_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2102_ & 0xff]);
					    int i_2104_
						= (((i_2103_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_2105_ = (((i_2103_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_2106_
						= ((i_2103_ & 0xff) * anInt8836
						   & 0xff00);
					    i_2103_ = (i_2104_ | i_2105_
						       | i_2106_) >>> 8;
					    int i_2107_ = is[i_2061_];
					    int i_2108_ = i_2103_ + i_2107_;
					    int i_2109_
						= ((i_2103_ & 0xff00ff)
						   + (i_2107_ & 0xff00ff));
					    i_2107_ = ((i_2109_ & 0x1000100)
						       + (i_2108_ - i_2109_
							  & 0x10000));
					    is[i_2061_]
						= (i_2108_ - i_2107_
						   | i_2107_ - (i_2107_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_2110_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2060_]);
					int i_2111_
					    = (i_2110_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_2110_])
					       : 0);
					int i_2112_ = anInt8829;
					int i_2113_ = i_2111_ + i_2112_;
					int i_2114_ = ((i_2111_ & 0xff00ff)
						       + (i_2112_ & 0xff00ff));
					int i_2115_ = ((i_2114_ & 0x1000100)
						       + (i_2113_ - i_2114_
							  & 0x10000));
					i_2115_
					    = (i_2113_ - i_2115_
					       | i_2115_ - (i_2115_ >>> 8));
					if (i_2111_ == 0 && anInt8830 != 255) {
					    i_2111_ = i_2115_;
					    i_2115_ = is[i_2061_];
					    i_2115_
						= (((((i_2111_ & 0xff00ff)
						      * anInt8830)
						     + ((i_2115_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_2111_ & 0xff00)
							* anInt8830)
						       + ((i_2115_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					}
					is[i_2061_] = i_2115_;
				    } else if (i == 2) {
					int i_2116_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2060_]);
					if (i_2116_ != 0) {
					    int i_2117_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2116_ & 0xff]);
					    int i_2118_
						= (((i_2117_ & 0xff00ff)
						    * anInt8830)
						   & ~0xff00ff);
					    int i_2119_ = (((i_2117_ & 0xff00)
							    * anInt8830)
							   & 0xff0000);
					    i_2117_ = ((i_2118_ | i_2119_)
						       >>> 8) + anInt8834;
					    int i_2120_ = is[i_2061_];
					    int i_2121_ = i_2117_ + i_2120_;
					    int i_2122_
						= ((i_2117_ & 0xff00ff)
						   + (i_2120_ & 0xff00ff));
					    i_2120_ = ((i_2122_ & 0x1000100)
						       + (i_2121_ - i_2122_
							  & 0x10000));
					    is[i_2061_]
						= (i_2121_ - i_2120_
						   | i_2120_ - (i_2120_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
			    }
			}
			i_2055_++;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_2123_ = anInt8816;
		    while (i_2123_ < 0) {
			int i_2124_ = anInt8818;
			int i_2125_ = anInt8807;
			int i_2126_ = anInt8826 + anInt8828;
			int i_2127_ = anInt8809;
			if (i_2125_ >= 0
			    && i_2125_ - (((Class151_Sub1_Sub1) this).anInt8803
					  << 12) < 0) {
			    int i_2128_;
			    if ((i_2128_
				 = (i_2126_
				    - (((Class151_Sub1_Sub1) this).anInt8804
				       << 12)))
				>= 0) {
				i_2128_ = (anInt8825 - i_2128_) / anInt8825;
				i_2127_ += i_2128_;
				i_2126_ += anInt8825 * i_2128_;
				i_2124_ += i_2128_;
			    }
			    if ((i_2128_ = (i_2126_ - anInt8825) / anInt8825)
				> i_2127_)
				i_2127_ = i_2128_;
			    for (/**/; i_2127_ < 0; i_2127_++) {
				int i_2129_
				    = ((i_2126_ >> 12) * ((Class151_Sub1_Sub1)
							  this).anInt8803
				       + (i_2125_ >> 12));
				int i_2130_ = i_2124_++;
				if (i_2054_ == 0) {
				    if (i == 1)
					is[i_2130_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2129_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_2131_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2129_])
						 & 0xff)]);
					int i_2132_
					    = ((i_2131_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_2133_
					    = ((i_2131_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_2134_
					    = ((i_2131_ & 0xff) * anInt8836
					       & 0xff00);
					is[i_2130_] = (i_2132_ | i_2133_
						       | i_2134_) >>> 8;
				    } else if (i == 3) {
					int i_2135_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2129_])
						 & 0xff)]);
					int i_2136_ = anInt8829;
					int i_2137_ = i_2135_ + i_2136_;
					int i_2138_ = ((i_2135_ & 0xff00ff)
						       + (i_2136_ & 0xff00ff));
					int i_2139_ = ((i_2138_ & 0x1000100)
						       + (i_2137_ - i_2138_
							  & 0x10000));
					is[i_2130_]
					    = (i_2137_ - i_2139_
					       | i_2139_ - (i_2139_ >>> 8));
				    } else if (i == 2) {
					int i_2140_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2129_])
						 & 0xff)]);
					int i_2141_
					    = ((i_2140_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_2142_
					    = ((i_2140_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_2130_] = ((i_2141_ | i_2142_)
						       >>> 8) + anInt8834;
				    } else
					throw new IllegalArgumentException();
				} else if (i_2054_ == 1) {
				    if (i == 1) {
					int i_2143_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2129_]);
					if (i_2143_ != 0)
					    is[i_2130_]
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2143_ & 0xff]);
				    } else if (i == 0) {
					int i_2144_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2129_]);
					if (i_2144_ != 0) {
					    int i_2145_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2144_ & 0xff]);
					    if ((anInt8829 & 0xffffff)
						== 16777215) {
						int i_2146_ = anInt8829 >>> 24;
						int i_2147_ = 256 - i_2146_;
						int i_2148_ = is[i_2130_];
						is[i_2130_]
						    = (((((i_2145_ & 0xff00ff)
							  * i_2146_)
							 + ((i_2148_
							     & 0xff00ff)
							    * i_2147_))
							& ~0xff00ff)
						       + ((((i_2145_ & 0xff00)
							    * i_2146_)
							   + ((i_2148_
							       & 0xff00)
							      * i_2147_))
							  & 0xff0000)) >> 8;
					    } else if (anInt8830 != 255) {
						int i_2149_
						    = (((i_2145_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_2150_
						    = (((i_2145_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_2151_
						    = (((i_2145_ & 0xff)
							* anInt8836)
						       & 0xff00);
						i_2145_ = (i_2149_ | i_2150_
							   | i_2151_) >>> 8;
						int i_2152_ = is[i_2130_];
						is[i_2130_]
						    = (((((i_2145_ & 0xff00ff)
							  * anInt8830)
							 + ((i_2152_
							     & 0xff00ff)
							    * anInt8831))
							& ~0xff00ff)
						       + ((((i_2145_ & 0xff00)
							    * anInt8830)
							   + ((i_2152_
							       & 0xff00)
							      * anInt8831))
							  & 0xff0000)) >> 8;
					    } else {
						int i_2153_
						    = (((i_2145_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_2154_
						    = (((i_2145_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_2155_
						    = (((i_2145_ & 0xff)
							* anInt8836)
						       & 0xff00);
						is[i_2130_]
						    = (i_2153_ | i_2154_
						       | i_2155_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_2156_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2129_]);
					int i_2157_
					    = (i_2156_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_2156_])
					       : 0);
					int i_2158_ = anInt8829;
					int i_2159_ = i_2157_ + i_2158_;
					int i_2160_ = ((i_2157_ & 0xff00ff)
						       + (i_2158_ & 0xff00ff));
					int i_2161_ = ((i_2160_ & 0x1000100)
						       + (i_2159_ - i_2160_
							  & 0x10000));
					i_2161_
					    = (i_2159_ - i_2161_
					       | i_2161_ - (i_2161_ >>> 8));
					if (i_2157_ == 0 && anInt8830 != 255) {
					    i_2157_ = i_2161_;
					    i_2161_ = is[i_2130_];
					    i_2161_
						= (((((i_2157_ & 0xff00ff)
						      * anInt8830)
						     + ((i_2161_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_2157_ & 0xff00)
							* anInt8830)
						       + ((i_2161_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					}
					is[i_2130_] = i_2161_;
				    } else if (i == 2) {
					int i_2162_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2129_]);
					if (i_2162_ != 0) {
					    int i_2163_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2162_ & 0xff]);
					    int i_2164_
						= (((i_2163_ & 0xff00ff)
						    * anInt8830)
						   & ~0xff00ff);
					    int i_2165_ = (((i_2163_ & 0xff00)
							    * anInt8830)
							   & 0xff0000);
					    is[i_2130_++]
						= (((i_2164_ | i_2165_) >>> 8)
						   + anInt8834);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_2054_ == 2) {
				    if (i == 1) {
					int i_2166_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2129_]);
					if (i_2166_ != 0) {
					    int i_2167_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2166_ & 0xff]);
					    int i_2168_ = is[i_2130_];
					    int i_2169_ = i_2167_ + i_2168_;
					    int i_2170_
						= ((i_2167_ & 0xff00ff)
						   + (i_2168_ & 0xff00ff));
					    i_2168_ = ((i_2170_ & 0x1000100)
						       + (i_2169_ - i_2170_
							  & 0x10000));
					    is[i_2130_]
						= (i_2169_ - i_2168_
						   | i_2168_ - (i_2168_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_2171_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2129_]);
					if (i_2171_ != 0) {
					    int i_2172_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2171_ & 0xff]);
					    int i_2173_
						= (((i_2172_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_2174_ = (((i_2172_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_2175_
						= ((i_2172_ & 0xff) * anInt8836
						   & 0xff00);
					    i_2172_ = (i_2173_ | i_2174_
						       | i_2175_) >>> 8;
					    int i_2176_ = is[i_2130_];
					    int i_2177_ = i_2172_ + i_2176_;
					    int i_2178_
						= ((i_2172_ & 0xff00ff)
						   + (i_2176_ & 0xff00ff));
					    i_2176_ = ((i_2178_ & 0x1000100)
						       + (i_2177_ - i_2178_
							  & 0x10000));
					    is[i_2130_]
						= (i_2177_ - i_2176_
						   | i_2176_ - (i_2176_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_2179_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2129_]);
					int i_2180_
					    = (i_2179_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_2179_])
					       : 0);
					int i_2181_ = anInt8829;
					int i_2182_ = i_2180_ + i_2181_;
					int i_2183_ = ((i_2180_ & 0xff00ff)
						       + (i_2181_ & 0xff00ff));
					int i_2184_ = ((i_2183_ & 0x1000100)
						       + (i_2182_ - i_2183_
							  & 0x10000));
					i_2184_
					    = (i_2182_ - i_2184_
					       | i_2184_ - (i_2184_ >>> 8));
					if (i_2180_ == 0 && anInt8830 != 255) {
					    i_2180_ = i_2184_;
					    i_2184_ = is[i_2130_];
					    i_2184_
						= (((((i_2180_ & 0xff00ff)
						      * anInt8830)
						     + ((i_2184_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_2180_ & 0xff00)
							* anInt8830)
						       + ((i_2184_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					}
					is[i_2130_] = i_2184_;
				    } else if (i == 2) {
					int i_2185_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2129_]);
					if (i_2185_ != 0) {
					    int i_2186_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2185_ & 0xff]);
					    int i_2187_
						= (((i_2186_ & 0xff00ff)
						    * anInt8830)
						   & ~0xff00ff);
					    int i_2188_ = (((i_2186_ & 0xff00)
							    * anInt8830)
							   & 0xff0000);
					    i_2186_ = ((i_2187_ | i_2188_)
						       >>> 8) + anInt8834;
					    int i_2189_ = is[i_2130_];
					    int i_2190_ = i_2186_ + i_2189_;
					    int i_2191_
						= ((i_2186_ & 0xff00ff)
						   + (i_2189_ & 0xff00ff));
					    i_2189_ = ((i_2191_ & 0x1000100)
						       + (i_2190_ - i_2191_
							  & 0x10000));
					    is[i_2130_]
						= (i_2190_ - i_2189_
						   | i_2189_ - (i_2189_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_2126_ += anInt8825;
			    }
			}
			i_2123_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_2192_ = anInt8816;
		    while (i_2192_ < 0) {
			int i_2193_ = anInt8818;
			int i_2194_ = anInt8807;
			int i_2195_ = anInt8826 + anInt8828;
			int i_2196_ = anInt8809;
			if (i_2194_ >= 0
			    && i_2194_ - (((Class151_Sub1_Sub1) this).anInt8803
					  << 12) < 0) {
			    if (i_2195_ < 0) {
				int i_2197_
				    = (anInt8825 - 1 - i_2195_) / anInt8825;
				i_2196_ += i_2197_;
				i_2195_ += anInt8825 * i_2197_;
				i_2193_ += i_2197_;
			    }
			    int i_2198_;
			    if ((i_2198_
				 = (1 + i_2195_
				    - (((Class151_Sub1_Sub1) this).anInt8804
				       << 12)
				    - anInt8825) / anInt8825)
				> i_2196_)
				i_2196_ = i_2198_;
			    for (/**/; i_2196_ < 0; i_2196_++) {
				int i_2199_
				    = ((i_2195_ >> 12) * ((Class151_Sub1_Sub1)
							  this).anInt8803
				       + (i_2194_ >> 12));
				int i_2200_ = i_2193_++;
				if (i_2054_ == 0) {
				    if (i == 1)
					is[i_2200_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2199_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_2201_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2199_])
						 & 0xff)]);
					int i_2202_
					    = ((i_2201_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_2203_
					    = ((i_2201_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_2204_
					    = ((i_2201_ & 0xff) * anInt8836
					       & 0xff00);
					is[i_2200_] = (i_2202_ | i_2203_
						       | i_2204_) >>> 8;
				    } else if (i == 3) {
					int i_2205_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2199_])
						 & 0xff)]);
					int i_2206_ = anInt8829;
					int i_2207_ = i_2205_ + i_2206_;
					int i_2208_ = ((i_2205_ & 0xff00ff)
						       + (i_2206_ & 0xff00ff));
					int i_2209_ = ((i_2208_ & 0x1000100)
						       + (i_2207_ - i_2208_
							  & 0x10000));
					is[i_2200_]
					    = (i_2207_ - i_2209_
					       | i_2209_ - (i_2209_ >>> 8));
				    } else if (i == 2) {
					int i_2210_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2199_])
						 & 0xff)]);
					int i_2211_
					    = ((i_2210_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_2212_
					    = ((i_2210_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_2200_] = ((i_2211_ | i_2212_)
						       >>> 8) + anInt8834;
				    } else
					throw new IllegalArgumentException();
				} else if (i_2054_ == 1) {
				    if (i == 1) {
					int i_2213_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2199_]);
					if (i_2213_ != 0)
					    is[i_2200_]
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2213_ & 0xff]);
				    } else if (i == 0) {
					int i_2214_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2199_]);
					if (i_2214_ != 0) {
					    int i_2215_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2214_ & 0xff]);
					    if ((anInt8829 & 0xffffff)
						== 16777215) {
						int i_2216_ = anInt8829 >>> 24;
						int i_2217_ = 256 - i_2216_;
						int i_2218_ = is[i_2200_];
						is[i_2200_]
						    = (((((i_2215_ & 0xff00ff)
							  * i_2216_)
							 + ((i_2218_
							     & 0xff00ff)
							    * i_2217_))
							& ~0xff00ff)
						       + ((((i_2215_ & 0xff00)
							    * i_2216_)
							   + ((i_2218_
							       & 0xff00)
							      * i_2217_))
							  & 0xff0000)) >> 8;
					    } else if (anInt8830 != 255) {
						int i_2219_
						    = (((i_2215_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_2220_
						    = (((i_2215_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_2221_
						    = (((i_2215_ & 0xff)
							* anInt8836)
						       & 0xff00);
						i_2215_ = (i_2219_ | i_2220_
							   | i_2221_) >>> 8;
						int i_2222_ = is[i_2200_];
						is[i_2200_]
						    = (((((i_2215_ & 0xff00ff)
							  * anInt8830)
							 + ((i_2222_
							     & 0xff00ff)
							    * anInt8831))
							& ~0xff00ff)
						       + ((((i_2215_ & 0xff00)
							    * anInt8830)
							   + ((i_2222_
							       & 0xff00)
							      * anInt8831))
							  & 0xff0000)) >> 8;
					    } else {
						int i_2223_
						    = (((i_2215_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_2224_
						    = (((i_2215_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_2225_
						    = (((i_2215_ & 0xff)
							* anInt8836)
						       & 0xff00);
						is[i_2200_]
						    = (i_2223_ | i_2224_
						       | i_2225_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_2226_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2199_]);
					int i_2227_
					    = (i_2226_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_2226_])
					       : 0);
					int i_2228_ = anInt8829;
					int i_2229_ = i_2227_ + i_2228_;
					int i_2230_ = ((i_2227_ & 0xff00ff)
						       + (i_2228_ & 0xff00ff));
					int i_2231_ = ((i_2230_ & 0x1000100)
						       + (i_2229_ - i_2230_
							  & 0x10000));
					i_2231_
					    = (i_2229_ - i_2231_
					       | i_2231_ - (i_2231_ >>> 8));
					if (i_2227_ == 0 && anInt8830 != 255) {
					    i_2227_ = i_2231_;
					    i_2231_ = is[i_2200_];
					    i_2231_
						= (((((i_2227_ & 0xff00ff)
						      * anInt8830)
						     + ((i_2231_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_2227_ & 0xff00)
							* anInt8830)
						       + ((i_2231_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					}
					is[i_2200_] = i_2231_;
				    } else if (i == 2) {
					int i_2232_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2199_]);
					if (i_2232_ != 0) {
					    int i_2233_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2232_ & 0xff]);
					    int i_2234_
						= (((i_2233_ & 0xff00ff)
						    * anInt8830)
						   & ~0xff00ff);
					    int i_2235_ = (((i_2233_ & 0xff00)
							    * anInt8830)
							   & 0xff0000);
					    is[i_2200_++]
						= (((i_2234_ | i_2235_) >>> 8)
						   + anInt8834);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_2054_ == 2) {
				    if (i == 1) {
					int i_2236_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2199_]);
					if (i_2236_ != 0) {
					    int i_2237_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2236_ & 0xff]);
					    int i_2238_ = is[i_2200_];
					    int i_2239_ = i_2237_ + i_2238_;
					    int i_2240_
						= ((i_2237_ & 0xff00ff)
						   + (i_2238_ & 0xff00ff));
					    i_2238_ = ((i_2240_ & 0x1000100)
						       + (i_2239_ - i_2240_
							  & 0x10000));
					    is[i_2200_]
						= (i_2239_ - i_2238_
						   | i_2238_ - (i_2238_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_2241_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2199_]);
					if (i_2241_ != 0) {
					    int i_2242_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2241_ & 0xff]);
					    int i_2243_
						= (((i_2242_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_2244_ = (((i_2242_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_2245_
						= ((i_2242_ & 0xff) * anInt8836
						   & 0xff00);
					    i_2242_ = (i_2243_ | i_2244_
						       | i_2245_) >>> 8;
					    int i_2246_ = is[i_2200_];
					    int i_2247_ = i_2242_ + i_2246_;
					    int i_2248_
						= ((i_2242_ & 0xff00ff)
						   + (i_2246_ & 0xff00ff));
					    i_2246_ = ((i_2248_ & 0x1000100)
						       + (i_2247_ - i_2248_
							  & 0x10000));
					    is[i_2200_]
						= (i_2247_ - i_2246_
						   | i_2246_ - (i_2246_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_2249_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2199_]);
					int i_2250_
					    = (i_2249_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_2249_])
					       : 0);
					int i_2251_ = anInt8829;
					int i_2252_ = i_2250_ + i_2251_;
					int i_2253_ = ((i_2250_ & 0xff00ff)
						       + (i_2251_ & 0xff00ff));
					int i_2254_ = ((i_2253_ & 0x1000100)
						       + (i_2252_ - i_2253_
							  & 0x10000));
					i_2254_
					    = (i_2252_ - i_2254_
					       | i_2254_ - (i_2254_ >>> 8));
					if (i_2250_ == 0 && anInt8830 != 255) {
					    i_2250_ = i_2254_;
					    i_2254_ = is[i_2200_];
					    i_2254_
						= (((((i_2250_ & 0xff00ff)
						      * anInt8830)
						     + ((i_2254_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_2250_ & 0xff00)
							* anInt8830)
						       + ((i_2254_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					}
					is[i_2200_] = i_2254_;
				    } else if (i == 2) {
					int i_2255_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2199_]);
					if (i_2255_ != 0) {
					    int i_2256_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2255_ & 0xff]);
					    int i_2257_
						= (((i_2256_ & 0xff00ff)
						    * anInt8830)
						   & ~0xff00ff);
					    int i_2258_ = (((i_2256_ & 0xff00)
							    * anInt8830)
							   & 0xff0000);
					    i_2256_ = ((i_2257_ | i_2258_)
						       >>> 8) + anInt8834;
					    int i_2259_ = is[i_2200_];
					    int i_2260_ = i_2256_ + i_2259_;
					    int i_2261_
						= ((i_2256_ & 0xff00ff)
						   + (i_2259_ & 0xff00ff));
					    i_2259_ = ((i_2261_ & 0x1000100)
						       + (i_2260_ - i_2261_
							  & 0x10000));
					    is[i_2200_]
						= (i_2260_ - i_2259_
						   | i_2259_ - (i_2259_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_2195_ += anInt8825;
			    }
			}
			i_2192_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8822 < 0) {
		if (anInt8825 == 0) {
		    int i_2262_ = anInt8816;
		    while (i_2262_ < 0) {
			int i_2263_ = anInt8818;
			int i_2264_ = anInt8807 + anInt8805;
			int i_2265_ = anInt8826;
			int i_2266_ = anInt8809;
			if (i_2265_ >= 0
			    && i_2265_ - (((Class151_Sub1_Sub1) this).anInt8804
					  << 12) < 0) {
			    int i_2267_;
			    if ((i_2267_
				 = (i_2264_
				    - (((Class151_Sub1_Sub1) this).anInt8803
				       << 12)))
				>= 0) {
				i_2267_ = (anInt8822 - i_2267_) / anInt8822;
				i_2266_ += i_2267_;
				i_2264_ += anInt8822 * i_2267_;
				i_2263_ += i_2267_;
			    }
			    if ((i_2267_ = (i_2264_ - anInt8822) / anInt8822)
				> i_2266_)
				i_2266_ = i_2267_;
			    for (/**/; i_2266_ < 0; i_2266_++) {
				int i_2268_
				    = ((i_2265_ >> 12) * ((Class151_Sub1_Sub1)
							  this).anInt8803
				       + (i_2264_ >> 12));
				int i_2269_ = i_2263_++;
				if (i_2054_ == 0) {
				    if (i == 1)
					is[i_2269_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2268_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_2270_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2268_])
						 & 0xff)]);
					int i_2271_
					    = ((i_2270_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_2272_
					    = ((i_2270_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_2273_
					    = ((i_2270_ & 0xff) * anInt8836
					       & 0xff00);
					is[i_2269_] = (i_2271_ | i_2272_
						       | i_2273_) >>> 8;
				    } else if (i == 3) {
					int i_2274_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2268_])
						 & 0xff)]);
					int i_2275_ = anInt8829;
					int i_2276_ = i_2274_ + i_2275_;
					int i_2277_ = ((i_2274_ & 0xff00ff)
						       + (i_2275_ & 0xff00ff));
					int i_2278_ = ((i_2277_ & 0x1000100)
						       + (i_2276_ - i_2277_
							  & 0x10000));
					is[i_2269_]
					    = (i_2276_ - i_2278_
					       | i_2278_ - (i_2278_ >>> 8));
				    } else if (i == 2) {
					int i_2279_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2268_])
						 & 0xff)]);
					int i_2280_
					    = ((i_2279_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_2281_
					    = ((i_2279_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_2269_] = ((i_2280_ | i_2281_)
						       >>> 8) + anInt8834;
				    } else
					throw new IllegalArgumentException();
				} else if (i_2054_ == 1) {
				    if (i == 1) {
					int i_2282_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2268_]);
					if (i_2282_ != 0)
					    is[i_2269_]
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2282_ & 0xff]);
				    } else if (i == 0) {
					int i_2283_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2268_]);
					if (i_2283_ != 0) {
					    int i_2284_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2283_ & 0xff]);
					    if ((anInt8829 & 0xffffff)
						== 16777215) {
						int i_2285_ = anInt8829 >>> 24;
						int i_2286_ = 256 - i_2285_;
						int i_2287_ = is[i_2269_];
						is[i_2269_]
						    = (((((i_2284_ & 0xff00ff)
							  * i_2285_)
							 + ((i_2287_
							     & 0xff00ff)
							    * i_2286_))
							& ~0xff00ff)
						       + ((((i_2284_ & 0xff00)
							    * i_2285_)
							   + ((i_2287_
							       & 0xff00)
							      * i_2286_))
							  & 0xff0000)) >> 8;
					    } else if (anInt8830 != 255) {
						int i_2288_
						    = (((i_2284_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_2289_
						    = (((i_2284_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_2290_
						    = (((i_2284_ & 0xff)
							* anInt8836)
						       & 0xff00);
						i_2284_ = (i_2288_ | i_2289_
							   | i_2290_) >>> 8;
						int i_2291_ = is[i_2269_];
						is[i_2269_]
						    = (((((i_2284_ & 0xff00ff)
							  * anInt8830)
							 + ((i_2291_
							     & 0xff00ff)
							    * anInt8831))
							& ~0xff00ff)
						       + ((((i_2284_ & 0xff00)
							    * anInt8830)
							   + ((i_2291_
							       & 0xff00)
							      * anInt8831))
							  & 0xff0000)) >> 8;
					    } else {
						int i_2292_
						    = (((i_2284_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_2293_
						    = (((i_2284_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_2294_
						    = (((i_2284_ & 0xff)
							* anInt8836)
						       & 0xff00);
						is[i_2269_]
						    = (i_2292_ | i_2293_
						       | i_2294_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_2295_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2268_]);
					int i_2296_
					    = (i_2295_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_2295_])
					       : 0);
					int i_2297_ = anInt8829;
					int i_2298_ = i_2296_ + i_2297_;
					int i_2299_ = ((i_2296_ & 0xff00ff)
						       + (i_2297_ & 0xff00ff));
					int i_2300_ = ((i_2299_ & 0x1000100)
						       + (i_2298_ - i_2299_
							  & 0x10000));
					i_2300_
					    = (i_2298_ - i_2300_
					       | i_2300_ - (i_2300_ >>> 8));
					if (i_2296_ == 0 && anInt8830 != 255) {
					    i_2296_ = i_2300_;
					    i_2300_ = is[i_2269_];
					    i_2300_
						= (((((i_2296_ & 0xff00ff)
						      * anInt8830)
						     + ((i_2300_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_2296_ & 0xff00)
							* anInt8830)
						       + ((i_2300_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					}
					is[i_2269_] = i_2300_;
				    } else if (i == 2) {
					int i_2301_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2268_]);
					if (i_2301_ != 0) {
					    int i_2302_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2301_ & 0xff]);
					    int i_2303_
						= (((i_2302_ & 0xff00ff)
						    * anInt8830)
						   & ~0xff00ff);
					    int i_2304_ = (((i_2302_ & 0xff00)
							    * anInt8830)
							   & 0xff0000);
					    is[i_2269_++]
						= (((i_2303_ | i_2304_) >>> 8)
						   + anInt8834);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_2054_ == 2) {
				    if (i == 1) {
					int i_2305_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2268_]);
					if (i_2305_ != 0) {
					    int i_2306_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2305_ & 0xff]);
					    int i_2307_ = is[i_2269_];
					    int i_2308_ = i_2306_ + i_2307_;
					    int i_2309_
						= ((i_2306_ & 0xff00ff)
						   + (i_2307_ & 0xff00ff));
					    i_2307_ = ((i_2309_ & 0x1000100)
						       + (i_2308_ - i_2309_
							  & 0x10000));
					    is[i_2269_]
						= (i_2308_ - i_2307_
						   | i_2307_ - (i_2307_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_2310_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2268_]);
					if (i_2310_ != 0) {
					    int i_2311_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2310_ & 0xff]);
					    int i_2312_
						= (((i_2311_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_2313_ = (((i_2311_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_2314_
						= ((i_2311_ & 0xff) * anInt8836
						   & 0xff00);
					    i_2311_ = (i_2312_ | i_2313_
						       | i_2314_) >>> 8;
					    int i_2315_ = is[i_2269_];
					    int i_2316_ = i_2311_ + i_2315_;
					    int i_2317_
						= ((i_2311_ & 0xff00ff)
						   + (i_2315_ & 0xff00ff));
					    i_2315_ = ((i_2317_ & 0x1000100)
						       + (i_2316_ - i_2317_
							  & 0x10000));
					    is[i_2269_]
						= (i_2316_ - i_2315_
						   | i_2315_ - (i_2315_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_2318_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2268_]);
					int i_2319_
					    = (i_2318_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_2318_])
					       : 0);
					int i_2320_ = anInt8829;
					int i_2321_ = i_2319_ + i_2320_;
					int i_2322_ = ((i_2319_ & 0xff00ff)
						       + (i_2320_ & 0xff00ff));
					int i_2323_ = ((i_2322_ & 0x1000100)
						       + (i_2321_ - i_2322_
							  & 0x10000));
					i_2323_
					    = (i_2321_ - i_2323_
					       | i_2323_ - (i_2323_ >>> 8));
					if (i_2319_ == 0 && anInt8830 != 255) {
					    i_2319_ = i_2323_;
					    i_2323_ = is[i_2269_];
					    i_2323_
						= (((((i_2319_ & 0xff00ff)
						      * anInt8830)
						     + ((i_2323_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_2319_ & 0xff00)
							* anInt8830)
						       + ((i_2323_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					}
					is[i_2269_] = i_2323_;
				    } else if (i == 2) {
					int i_2324_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2268_]);
					if (i_2324_ != 0) {
					    int i_2325_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2324_ & 0xff]);
					    int i_2326_
						= (((i_2325_ & 0xff00ff)
						    * anInt8830)
						   & ~0xff00ff);
					    int i_2327_ = (((i_2325_ & 0xff00)
							    * anInt8830)
							   & 0xff0000);
					    i_2325_ = ((i_2326_ | i_2327_)
						       >>> 8) + anInt8834;
					    int i_2328_ = is[i_2269_];
					    int i_2329_ = i_2325_ + i_2328_;
					    int i_2330_
						= ((i_2325_ & 0xff00ff)
						   + (i_2328_ & 0xff00ff));
					    i_2328_ = ((i_2330_ & 0x1000100)
						       + (i_2329_ - i_2330_
							  & 0x10000));
					    is[i_2269_]
						= (i_2329_ - i_2328_
						   | i_2328_ - (i_2328_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_2264_ += anInt8822;
			    }
			}
			i_2262_++;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_2331_ = anInt8816;
		    while (i_2331_ < 0) {
			int i_2332_ = anInt8818;
			int i_2333_ = anInt8807 + anInt8805;
			int i_2334_ = anInt8826 + anInt8828;
			int i_2335_ = anInt8809;
			int i_2336_;
			if ((i_2336_
			     = i_2333_ - (((Class151_Sub1_Sub1) this).anInt8803
					  << 12))
			    >= 0) {
			    i_2336_ = (anInt8822 - i_2336_) / anInt8822;
			    i_2335_ += i_2336_;
			    i_2333_ += anInt8822 * i_2336_;
			    i_2334_ += anInt8825 * i_2336_;
			    i_2332_ += i_2336_;
			}
			if ((i_2336_ = (i_2333_ - anInt8822) / anInt8822)
			    > i_2335_)
			    i_2335_ = i_2336_;
			if ((i_2336_
			     = i_2334_ - (((Class151_Sub1_Sub1) this).anInt8804
					  << 12))
			    >= 0) {
			    i_2336_ = (anInt8825 - i_2336_) / anInt8825;
			    i_2335_ += i_2336_;
			    i_2333_ += anInt8822 * i_2336_;
			    i_2334_ += anInt8825 * i_2336_;
			    i_2332_ += i_2336_;
			}
			if ((i_2336_ = (i_2334_ - anInt8825) / anInt8825)
			    > i_2335_)
			    i_2335_ = i_2336_;
			for (/**/; i_2335_ < 0; i_2335_++) {
			    int i_2337_
				= (((i_2334_ >> 12)
				    * ((Class151_Sub1_Sub1) this).anInt8803)
				   + (i_2333_ >> 12));
			    int i_2338_ = i_2332_++;
			    if (i_2054_ == 0) {
				if (i == 1)
				    is[i_2338_]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_2337_])
					     & 0xff)]);
				else if (i == 0) {
				    int i_2339_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_2337_])
					     & 0xff)]);
				    int i_2340_
					= ((i_2339_ & 0xff0000) * anInt8815
					   & ~0xffffff);
				    int i_2341_
					= ((i_2339_ & 0xff00) * anInt8833
					   & 0xff0000);
				    int i_2342_ = ((i_2339_ & 0xff) * anInt8836
						   & 0xff00);
				    is[i_2338_]
					= (i_2340_ | i_2341_ | i_2342_) >>> 8;
				} else if (i == 3) {
				    int i_2343_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_2337_])
					     & 0xff)]);
				    int i_2344_ = anInt8829;
				    int i_2345_ = i_2343_ + i_2344_;
				    int i_2346_ = ((i_2343_ & 0xff00ff)
						   + (i_2344_ & 0xff00ff));
				    int i_2347_
					= ((i_2346_ & 0x1000100)
					   + (i_2345_ - i_2346_ & 0x10000));
				    is[i_2338_]
					= (i_2345_ - i_2347_
					   | i_2347_ - (i_2347_ >>> 8));
				} else if (i == 2) {
				    int i_2348_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_2337_])
					     & 0xff)]);
				    int i_2349_
					= ((i_2348_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_2350_
					= ((i_2348_ & 0xff00) * anInt8830
					   & 0xff0000);
				    is[i_2338_] = (((i_2349_ | i_2350_) >>> 8)
						   + anInt8834);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2054_ == 1) {
				if (i == 1) {
				    int i_2351_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_2337_]);
				    if (i_2351_ != 0)
					is[i_2338_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_2351_ & 0xff]);
				} else if (i == 0) {
				    int i_2352_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_2337_]);
				    if (i_2352_ != 0) {
					int i_2353_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_2352_ & 0xff]);
					if ((anInt8829 & 0xffffff)
					    == 16777215) {
					    int i_2354_ = anInt8829 >>> 24;
					    int i_2355_ = 256 - i_2354_;
					    int i_2356_ = is[i_2338_];
					    is[i_2338_]
						= (((((i_2353_ & 0xff00ff)
						      * i_2354_)
						     + ((i_2356_ & 0xff00ff)
							* i_2355_))
						    & ~0xff00ff)
						   + ((((i_2353_ & 0xff00)
							* i_2354_)
						       + ((i_2356_ & 0xff00)
							  * i_2355_))
						      & 0xff0000)) >> 8;
					} else if (anInt8830 != 255) {
					    int i_2357_
						= (((i_2353_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_2358_ = (((i_2353_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_2359_
						= ((i_2353_ & 0xff) * anInt8836
						   & 0xff00);
					    i_2353_ = (i_2357_ | i_2358_
						       | i_2359_) >>> 8;
					    int i_2360_ = is[i_2338_];
					    is[i_2338_]
						= (((((i_2353_ & 0xff00ff)
						      * anInt8830)
						     + ((i_2360_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_2353_ & 0xff00)
							* anInt8830)
						       + ((i_2360_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					} else {
					    int i_2361_
						= (((i_2353_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_2362_ = (((i_2353_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_2363_
						= ((i_2353_ & 0xff) * anInt8836
						   & 0xff00);
					    is[i_2338_] = (i_2361_ | i_2362_
							   | i_2363_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_2364_ = (((Class151_Sub1_Sub1) this)
						    .aByteArray11258[i_2337_]);
				    int i_2365_
					= (i_2364_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_2364_])
					   : 0);
				    int i_2366_ = anInt8829;
				    int i_2367_ = i_2365_ + i_2366_;
				    int i_2368_ = ((i_2365_ & 0xff00ff)
						   + (i_2366_ & 0xff00ff));
				    int i_2369_
					= ((i_2368_ & 0x1000100)
					   + (i_2367_ - i_2368_ & 0x10000));
				    i_2369_ = (i_2367_ - i_2369_
					       | i_2369_ - (i_2369_ >>> 8));
				    if (i_2365_ == 0 && anInt8830 != 255) {
					i_2365_ = i_2369_;
					i_2369_ = is[i_2338_];
					i_2369_ = (((((i_2365_ & 0xff00ff)
						      * anInt8830)
						     + ((i_2369_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_2365_ & 0xff00)
							* anInt8830)
						       + ((i_2369_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2338_] = i_2369_;
				} else if (i == 2) {
				    int i_2370_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_2337_]);
				    if (i_2370_ != 0) {
					int i_2371_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_2370_ & 0xff]);
					int i_2372_
					    = ((i_2371_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_2373_
					    = ((i_2371_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_2338_++] = ((i_2372_ | i_2373_)
							 >>> 8) + anInt8834;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2054_ == 2) {
				if (i == 1) {
				    int i_2374_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_2337_]);
				    if (i_2374_ != 0) {
					int i_2375_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_2374_ & 0xff]);
					int i_2376_ = is[i_2338_];
					int i_2377_ = i_2375_ + i_2376_;
					int i_2378_ = ((i_2375_ & 0xff00ff)
						       + (i_2376_ & 0xff00ff));
					i_2376_ = ((i_2378_ & 0x1000100)
						   + (i_2377_ - i_2378_
						      & 0x10000));
					is[i_2338_]
					    = (i_2377_ - i_2376_
					       | i_2376_ - (i_2376_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_2379_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_2337_]);
				    if (i_2379_ != 0) {
					int i_2380_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_2379_ & 0xff]);
					int i_2381_
					    = ((i_2380_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_2382_
					    = ((i_2380_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_2383_
					    = ((i_2380_ & 0xff) * anInt8836
					       & 0xff00);
					i_2380_ = (i_2381_ | i_2382_
						   | i_2383_) >>> 8;
					int i_2384_ = is[i_2338_];
					int i_2385_ = i_2380_ + i_2384_;
					int i_2386_ = ((i_2380_ & 0xff00ff)
						       + (i_2384_ & 0xff00ff));
					i_2384_ = ((i_2386_ & 0x1000100)
						   + (i_2385_ - i_2386_
						      & 0x10000));
					is[i_2338_]
					    = (i_2385_ - i_2384_
					       | i_2384_ - (i_2384_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_2387_ = (((Class151_Sub1_Sub1) this)
						    .aByteArray11258[i_2337_]);
				    int i_2388_
					= (i_2387_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_2387_])
					   : 0);
				    int i_2389_ = anInt8829;
				    int i_2390_ = i_2388_ + i_2389_;
				    int i_2391_ = ((i_2388_ & 0xff00ff)
						   + (i_2389_ & 0xff00ff));
				    int i_2392_
					= ((i_2391_ & 0x1000100)
					   + (i_2390_ - i_2391_ & 0x10000));
				    i_2392_ = (i_2390_ - i_2392_
					       | i_2392_ - (i_2392_ >>> 8));
				    if (i_2388_ == 0 && anInt8830 != 255) {
					i_2388_ = i_2392_;
					i_2392_ = is[i_2338_];
					i_2392_ = (((((i_2388_ & 0xff00ff)
						      * anInt8830)
						     + ((i_2392_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_2388_ & 0xff00)
							* anInt8830)
						       + ((i_2392_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2338_] = i_2392_;
				} else if (i == 2) {
				    int i_2393_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_2337_]);
				    if (i_2393_ != 0) {
					int i_2394_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_2393_ & 0xff]);
					int i_2395_
					    = ((i_2394_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_2396_
					    = ((i_2394_ & 0xff00) * anInt8830
					       & 0xff0000);
					i_2394_ = (((i_2395_ | i_2396_) >>> 8)
						   + anInt8834);
					int i_2397_ = is[i_2338_];
					int i_2398_ = i_2394_ + i_2397_;
					int i_2399_ = ((i_2394_ & 0xff00ff)
						       + (i_2397_ & 0xff00ff));
					i_2397_ = ((i_2399_ & 0x1000100)
						   + (i_2398_ - i_2399_
						      & 0x10000));
					is[i_2338_]
					    = (i_2398_ - i_2397_
					       | i_2397_ - (i_2397_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_2333_ += anInt8822;
			    i_2334_ += anInt8825;
			}
			i_2331_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_2400_ = anInt8816;
		    while (i_2400_ < 0) {
			int i_2401_ = anInt8818;
			int i_2402_ = anInt8807 + anInt8805;
			int i_2403_ = anInt8826 + anInt8828;
			int i_2404_ = anInt8809;
			int i_2405_;
			if ((i_2405_
			     = i_2402_ - (((Class151_Sub1_Sub1) this).anInt8803
					  << 12))
			    >= 0) {
			    i_2405_ = (anInt8822 - i_2405_) / anInt8822;
			    i_2404_ += i_2405_;
			    i_2402_ += anInt8822 * i_2405_;
			    i_2403_ += anInt8825 * i_2405_;
			    i_2401_ += i_2405_;
			}
			if ((i_2405_ = (i_2402_ - anInt8822) / anInt8822)
			    > i_2404_)
			    i_2404_ = i_2405_;
			if (i_2403_ < 0) {
			    i_2405_ = (anInt8825 - 1 - i_2403_) / anInt8825;
			    i_2404_ += i_2405_;
			    i_2402_ += anInt8822 * i_2405_;
			    i_2403_ += anInt8825 * i_2405_;
			    i_2401_ += i_2405_;
			}
			if ((i_2405_
			     = (1 + i_2403_
				- (((Class151_Sub1_Sub1) this).anInt8804 << 12)
				- anInt8825) / anInt8825)
			    > i_2404_)
			    i_2404_ = i_2405_;
			for (/**/; i_2404_ < 0; i_2404_++) {
			    int i_2406_
				= (((i_2403_ >> 12)
				    * ((Class151_Sub1_Sub1) this).anInt8803)
				   + (i_2402_ >> 12));
			    int i_2407_ = i_2401_++;
			    if (i_2054_ == 0) {
				if (i == 1)
				    is[i_2407_]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_2406_])
					     & 0xff)]);
				else if (i == 0) {
				    int i_2408_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_2406_])
					     & 0xff)]);
				    int i_2409_
					= ((i_2408_ & 0xff0000) * anInt8815
					   & ~0xffffff);
				    int i_2410_
					= ((i_2408_ & 0xff00) * anInt8833
					   & 0xff0000);
				    int i_2411_ = ((i_2408_ & 0xff) * anInt8836
						   & 0xff00);
				    is[i_2407_]
					= (i_2409_ | i_2410_ | i_2411_) >>> 8;
				} else if (i == 3) {
				    int i_2412_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_2406_])
					     & 0xff)]);
				    int i_2413_ = anInt8829;
				    int i_2414_ = i_2412_ + i_2413_;
				    int i_2415_ = ((i_2412_ & 0xff00ff)
						   + (i_2413_ & 0xff00ff));
				    int i_2416_
					= ((i_2415_ & 0x1000100)
					   + (i_2414_ - i_2415_ & 0x10000));
				    is[i_2407_]
					= (i_2414_ - i_2416_
					   | i_2416_ - (i_2416_ >>> 8));
				} else if (i == 2) {
				    int i_2417_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_2406_])
					     & 0xff)]);
				    int i_2418_
					= ((i_2417_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_2419_
					= ((i_2417_ & 0xff00) * anInt8830
					   & 0xff0000);
				    is[i_2407_] = (((i_2418_ | i_2419_) >>> 8)
						   + anInt8834);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2054_ == 1) {
				if (i == 1) {
				    int i_2420_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_2406_]);
				    if (i_2420_ != 0)
					is[i_2407_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_2420_ & 0xff]);
				} else if (i == 0) {
				    int i_2421_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_2406_]);
				    if (i_2421_ != 0) {
					int i_2422_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_2421_ & 0xff]);
					if ((anInt8829 & 0xffffff)
					    == 16777215) {
					    int i_2423_ = anInt8829 >>> 24;
					    int i_2424_ = 256 - i_2423_;
					    int i_2425_ = is[i_2407_];
					    is[i_2407_]
						= (((((i_2422_ & 0xff00ff)
						      * i_2423_)
						     + ((i_2425_ & 0xff00ff)
							* i_2424_))
						    & ~0xff00ff)
						   + ((((i_2422_ & 0xff00)
							* i_2423_)
						       + ((i_2425_ & 0xff00)
							  * i_2424_))
						      & 0xff0000)) >> 8;
					} else if (anInt8830 != 255) {
					    int i_2426_
						= (((i_2422_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_2427_ = (((i_2422_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_2428_
						= ((i_2422_ & 0xff) * anInt8836
						   & 0xff00);
					    i_2422_ = (i_2426_ | i_2427_
						       | i_2428_) >>> 8;
					    int i_2429_ = is[i_2407_];
					    is[i_2407_]
						= (((((i_2422_ & 0xff00ff)
						      * anInt8830)
						     + ((i_2429_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_2422_ & 0xff00)
							* anInt8830)
						       + ((i_2429_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					} else {
					    int i_2430_
						= (((i_2422_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_2431_ = (((i_2422_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_2432_
						= ((i_2422_ & 0xff) * anInt8836
						   & 0xff00);
					    is[i_2407_] = (i_2430_ | i_2431_
							   | i_2432_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_2433_ = (((Class151_Sub1_Sub1) this)
						    .aByteArray11258[i_2406_]);
				    int i_2434_
					= (i_2433_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_2433_])
					   : 0);
				    int i_2435_ = anInt8829;
				    int i_2436_ = i_2434_ + i_2435_;
				    int i_2437_ = ((i_2434_ & 0xff00ff)
						   + (i_2435_ & 0xff00ff));
				    int i_2438_
					= ((i_2437_ & 0x1000100)
					   + (i_2436_ - i_2437_ & 0x10000));
				    i_2438_ = (i_2436_ - i_2438_
					       | i_2438_ - (i_2438_ >>> 8));
				    if (i_2434_ == 0 && anInt8830 != 255) {
					i_2434_ = i_2438_;
					i_2438_ = is[i_2407_];
					i_2438_ = (((((i_2434_ & 0xff00ff)
						      * anInt8830)
						     + ((i_2438_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_2434_ & 0xff00)
							* anInt8830)
						       + ((i_2438_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2407_] = i_2438_;
				} else if (i == 2) {
				    int i_2439_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_2406_]);
				    if (i_2439_ != 0) {
					int i_2440_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_2439_ & 0xff]);
					int i_2441_
					    = ((i_2440_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_2442_
					    = ((i_2440_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_2407_++] = ((i_2441_ | i_2442_)
							 >>> 8) + anInt8834;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2054_ == 2) {
				if (i == 1) {
				    int i_2443_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_2406_]);
				    if (i_2443_ != 0) {
					int i_2444_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_2443_ & 0xff]);
					int i_2445_ = is[i_2407_];
					int i_2446_ = i_2444_ + i_2445_;
					int i_2447_ = ((i_2444_ & 0xff00ff)
						       + (i_2445_ & 0xff00ff));
					i_2445_ = ((i_2447_ & 0x1000100)
						   + (i_2446_ - i_2447_
						      & 0x10000));
					is[i_2407_]
					    = (i_2446_ - i_2445_
					       | i_2445_ - (i_2445_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_2448_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_2406_]);
				    if (i_2448_ != 0) {
					int i_2449_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_2448_ & 0xff]);
					int i_2450_
					    = ((i_2449_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_2451_
					    = ((i_2449_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_2452_
					    = ((i_2449_ & 0xff) * anInt8836
					       & 0xff00);
					i_2449_ = (i_2450_ | i_2451_
						   | i_2452_) >>> 8;
					int i_2453_ = is[i_2407_];
					int i_2454_ = i_2449_ + i_2453_;
					int i_2455_ = ((i_2449_ & 0xff00ff)
						       + (i_2453_ & 0xff00ff));
					i_2453_ = ((i_2455_ & 0x1000100)
						   + (i_2454_ - i_2455_
						      & 0x10000));
					is[i_2407_]
					    = (i_2454_ - i_2453_
					       | i_2453_ - (i_2453_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_2456_ = (((Class151_Sub1_Sub1) this)
						    .aByteArray11258[i_2406_]);
				    int i_2457_
					= (i_2456_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_2456_])
					   : 0);
				    int i_2458_ = anInt8829;
				    int i_2459_ = i_2457_ + i_2458_;
				    int i_2460_ = ((i_2457_ & 0xff00ff)
						   + (i_2458_ & 0xff00ff));
				    int i_2461_
					= ((i_2460_ & 0x1000100)
					   + (i_2459_ - i_2460_ & 0x10000));
				    i_2461_ = (i_2459_ - i_2461_
					       | i_2461_ - (i_2461_ >>> 8));
				    if (i_2457_ == 0 && anInt8830 != 255) {
					i_2457_ = i_2461_;
					i_2461_ = is[i_2407_];
					i_2461_ = (((((i_2457_ & 0xff00ff)
						      * anInt8830)
						     + ((i_2461_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_2457_ & 0xff00)
							* anInt8830)
						       + ((i_2461_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2407_] = i_2461_;
				} else if (i == 2) {
				    int i_2462_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_2406_]);
				    if (i_2462_ != 0) {
					int i_2463_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_2462_ & 0xff]);
					int i_2464_
					    = ((i_2463_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_2465_
					    = ((i_2463_ & 0xff00) * anInt8830
					       & 0xff0000);
					i_2463_ = (((i_2464_ | i_2465_) >>> 8)
						   + anInt8834);
					int i_2466_ = is[i_2407_];
					int i_2467_ = i_2463_ + i_2466_;
					int i_2468_ = ((i_2463_ & 0xff00ff)
						       + (i_2466_ & 0xff00ff));
					i_2466_ = ((i_2468_ & 0x1000100)
						   + (i_2467_ - i_2468_
						      & 0x10000));
					is[i_2407_]
					    = (i_2467_ - i_2466_
					       | i_2466_ - (i_2466_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_2402_ += anInt8822;
			    i_2403_ += anInt8825;
			}
			i_2400_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8825 == 0) {
		int i_2469_ = anInt8816;
		while (i_2469_ < 0) {
		    int i_2470_ = anInt8818;
		    int i_2471_ = anInt8807 + anInt8805;
		    int i_2472_ = anInt8826;
		    int i_2473_ = anInt8809;
		    if (i_2472_ >= 0
			&& i_2472_ - (((Class151_Sub1_Sub1) this).anInt8804
				      << 12) < 0) {
			if (i_2471_ < 0) {
			    int i_2474_
				= (anInt8822 - 1 - i_2471_) / anInt8822;
			    i_2473_ += i_2474_;
			    i_2471_ += anInt8822 * i_2474_;
			    i_2470_ += i_2474_;
			}
			int i_2475_;
			if ((i_2475_
			     = (1 + i_2471_
				- (((Class151_Sub1_Sub1) this).anInt8803 << 12)
				- anInt8822) / anInt8822)
			    > i_2473_)
			    i_2473_ = i_2475_;
			for (/**/; i_2473_ < 0; i_2473_++) {
			    int i_2476_
				= (((i_2472_ >> 12)
				    * ((Class151_Sub1_Sub1) this).anInt8803)
				   + (i_2471_ >> 12));
			    int i_2477_ = i_2470_++;
			    if (i_2054_ == 0) {
				if (i == 1)
				    is[i_2477_]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_2476_])
					     & 0xff)]);
				else if (i == 0) {
				    int i_2478_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_2476_])
					     & 0xff)]);
				    int i_2479_
					= ((i_2478_ & 0xff0000) * anInt8815
					   & ~0xffffff);
				    int i_2480_
					= ((i_2478_ & 0xff00) * anInt8833
					   & 0xff0000);
				    int i_2481_ = ((i_2478_ & 0xff) * anInt8836
						   & 0xff00);
				    is[i_2477_]
					= (i_2479_ | i_2480_ | i_2481_) >>> 8;
				} else if (i == 3) {
				    int i_2482_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_2476_])
					     & 0xff)]);
				    int i_2483_ = anInt8829;
				    int i_2484_ = i_2482_ + i_2483_;
				    int i_2485_ = ((i_2482_ & 0xff00ff)
						   + (i_2483_ & 0xff00ff));
				    int i_2486_
					= ((i_2485_ & 0x1000100)
					   + (i_2484_ - i_2485_ & 0x10000));
				    is[i_2477_]
					= (i_2484_ - i_2486_
					   | i_2486_ - (i_2486_ >>> 8));
				} else if (i == 2) {
				    int i_2487_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_2476_])
					     & 0xff)]);
				    int i_2488_
					= ((i_2487_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_2489_
					= ((i_2487_ & 0xff00) * anInt8830
					   & 0xff0000);
				    is[i_2477_] = (((i_2488_ | i_2489_) >>> 8)
						   + anInt8834);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2054_ == 1) {
				if (i == 1) {
				    int i_2490_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_2476_]);
				    if (i_2490_ != 0)
					is[i_2477_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_2490_ & 0xff]);
				} else if (i == 0) {
				    int i_2491_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_2476_]);
				    if (i_2491_ != 0) {
					int i_2492_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_2491_ & 0xff]);
					if ((anInt8829 & 0xffffff)
					    == 16777215) {
					    int i_2493_ = anInt8829 >>> 24;
					    int i_2494_ = 256 - i_2493_;
					    int i_2495_ = is[i_2477_];
					    is[i_2477_]
						= (((((i_2492_ & 0xff00ff)
						      * i_2493_)
						     + ((i_2495_ & 0xff00ff)
							* i_2494_))
						    & ~0xff00ff)
						   + ((((i_2492_ & 0xff00)
							* i_2493_)
						       + ((i_2495_ & 0xff00)
							  * i_2494_))
						      & 0xff0000)) >> 8;
					} else if (anInt8830 != 255) {
					    int i_2496_
						= (((i_2492_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_2497_ = (((i_2492_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_2498_
						= ((i_2492_ & 0xff) * anInt8836
						   & 0xff00);
					    i_2492_ = (i_2496_ | i_2497_
						       | i_2498_) >>> 8;
					    int i_2499_ = is[i_2477_];
					    is[i_2477_]
						= (((((i_2492_ & 0xff00ff)
						      * anInt8830)
						     + ((i_2499_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_2492_ & 0xff00)
							* anInt8830)
						       + ((i_2499_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					} else {
					    int i_2500_
						= (((i_2492_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_2501_ = (((i_2492_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_2502_
						= ((i_2492_ & 0xff) * anInt8836
						   & 0xff00);
					    is[i_2477_] = (i_2500_ | i_2501_
							   | i_2502_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_2503_ = (((Class151_Sub1_Sub1) this)
						    .aByteArray11258[i_2476_]);
				    int i_2504_
					= (i_2503_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_2503_])
					   : 0);
				    int i_2505_ = anInt8829;
				    int i_2506_ = i_2504_ + i_2505_;
				    int i_2507_ = ((i_2504_ & 0xff00ff)
						   + (i_2505_ & 0xff00ff));
				    int i_2508_
					= ((i_2507_ & 0x1000100)
					   + (i_2506_ - i_2507_ & 0x10000));
				    i_2508_ = (i_2506_ - i_2508_
					       | i_2508_ - (i_2508_ >>> 8));
				    if (i_2504_ == 0 && anInt8830 != 255) {
					i_2504_ = i_2508_;
					i_2508_ = is[i_2477_];
					i_2508_ = (((((i_2504_ & 0xff00ff)
						      * anInt8830)
						     + ((i_2508_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_2504_ & 0xff00)
							* anInt8830)
						       + ((i_2508_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2477_] = i_2508_;
				} else if (i == 2) {
				    int i_2509_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_2476_]);
				    if (i_2509_ != 0) {
					int i_2510_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_2509_ & 0xff]);
					int i_2511_
					    = ((i_2510_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_2512_
					    = ((i_2510_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_2477_++] = ((i_2511_ | i_2512_)
							 >>> 8) + anInt8834;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2054_ == 2) {
				if (i == 1) {
				    int i_2513_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_2476_]);
				    if (i_2513_ != 0) {
					int i_2514_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_2513_ & 0xff]);
					int i_2515_ = is[i_2477_];
					int i_2516_ = i_2514_ + i_2515_;
					int i_2517_ = ((i_2514_ & 0xff00ff)
						       + (i_2515_ & 0xff00ff));
					i_2515_ = ((i_2517_ & 0x1000100)
						   + (i_2516_ - i_2517_
						      & 0x10000));
					is[i_2477_]
					    = (i_2516_ - i_2515_
					       | i_2515_ - (i_2515_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_2518_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_2476_]);
				    if (i_2518_ != 0) {
					int i_2519_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_2518_ & 0xff]);
					int i_2520_
					    = ((i_2519_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_2521_
					    = ((i_2519_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_2522_
					    = ((i_2519_ & 0xff) * anInt8836
					       & 0xff00);
					i_2519_ = (i_2520_ | i_2521_
						   | i_2522_) >>> 8;
					int i_2523_ = is[i_2477_];
					int i_2524_ = i_2519_ + i_2523_;
					int i_2525_ = ((i_2519_ & 0xff00ff)
						       + (i_2523_ & 0xff00ff));
					i_2523_ = ((i_2525_ & 0x1000100)
						   + (i_2524_ - i_2525_
						      & 0x10000));
					is[i_2477_]
					    = (i_2524_ - i_2523_
					       | i_2523_ - (i_2523_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_2526_ = (((Class151_Sub1_Sub1) this)
						    .aByteArray11258[i_2476_]);
				    int i_2527_
					= (i_2526_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_2526_])
					   : 0);
				    int i_2528_ = anInt8829;
				    int i_2529_ = i_2527_ + i_2528_;
				    int i_2530_ = ((i_2527_ & 0xff00ff)
						   + (i_2528_ & 0xff00ff));
				    int i_2531_
					= ((i_2530_ & 0x1000100)
					   + (i_2529_ - i_2530_ & 0x10000));
				    i_2531_ = (i_2529_ - i_2531_
					       | i_2531_ - (i_2531_ >>> 8));
				    if (i_2527_ == 0 && anInt8830 != 255) {
					i_2527_ = i_2531_;
					i_2531_ = is[i_2477_];
					i_2531_ = (((((i_2527_ & 0xff00ff)
						      * anInt8830)
						     + ((i_2531_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_2527_ & 0xff00)
							* anInt8830)
						       + ((i_2531_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2477_] = i_2531_;
				} else if (i == 2) {
				    int i_2532_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_2476_]);
				    if (i_2532_ != 0) {
					int i_2533_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_2532_ & 0xff]);
					int i_2534_
					    = ((i_2533_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_2535_
					    = ((i_2533_ & 0xff00) * anInt8830
					       & 0xff0000);
					i_2533_ = (((i_2534_ | i_2535_) >>> 8)
						   + anInt8834);
					int i_2536_ = is[i_2477_];
					int i_2537_ = i_2533_ + i_2536_;
					int i_2538_ = ((i_2533_ & 0xff00ff)
						       + (i_2536_ & 0xff00ff));
					i_2536_ = ((i_2538_ & 0x1000100)
						   + (i_2537_ - i_2538_
						      & 0x10000));
					is[i_2477_]
					    = (i_2537_ - i_2536_
					       | i_2536_ - (i_2536_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_2471_ += anInt8822;
			}
		    }
		    i_2469_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else if (anInt8825 < 0) {
		for (int i_2539_ = anInt8816; i_2539_ < 0; i_2539_++) {
		    int i_2540_ = anInt8818;
		    int i_2541_ = anInt8807 + anInt8805;
		    int i_2542_ = anInt8826 + anInt8828;
		    int i_2543_ = anInt8809;
		    if (i_2541_ < 0) {
			int i_2544_ = (anInt8822 - 1 - i_2541_) / anInt8822;
			i_2543_ += i_2544_;
			i_2541_ += anInt8822 * i_2544_;
			i_2542_ += anInt8825 * i_2544_;
			i_2540_ += i_2544_;
		    }
		    int i_2545_;
		    if ((i_2545_
			 = (1 + i_2541_
			    - (((Class151_Sub1_Sub1) this).anInt8803 << 12)
			    - anInt8822) / anInt8822)
			> i_2543_)
			i_2543_ = i_2545_;
		    if ((i_2545_
			 = i_2542_ - (((Class151_Sub1_Sub1) this).anInt8804
				      << 12))
			>= 0) {
			i_2545_ = (anInt8825 - i_2545_) / anInt8825;
			i_2543_ += i_2545_;
			i_2541_ += anInt8822 * i_2545_;
			i_2542_ += anInt8825 * i_2545_;
			i_2540_ += i_2545_;
		    }
		    if ((i_2545_ = (i_2542_ - anInt8825) / anInt8825)
			> i_2543_)
			i_2543_ = i_2545_;
		    for (/**/; i_2543_ < 0; i_2543_++) {
			int i_2546_
			    = (((i_2542_ >> 12)
				* ((Class151_Sub1_Sub1) this).anInt8803)
			       + (i_2541_ >> 12));
			int i_2547_ = i_2540_++;
			if (i_2054_ == 0) {
			    if (i == 1)
				is[i_2547_]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_2546_]) & 0xff]);
			    else if (i == 0) {
				int i_2548_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_2546_]) & 0xff]);
				int i_2549_ = ((i_2548_ & 0xff0000) * anInt8815
					       & ~0xffffff);
				int i_2550_ = ((i_2548_ & 0xff00) * anInt8833
					       & 0xff0000);
				int i_2551_
				    = (i_2548_ & 0xff) * anInt8836 & 0xff00;
				is[i_2547_]
				    = (i_2549_ | i_2550_ | i_2551_) >>> 8;
			    } else if (i == 3) {
				int i_2552_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_2546_]) & 0xff]);
				int i_2553_ = anInt8829;
				int i_2554_ = i_2552_ + i_2553_;
				int i_2555_ = ((i_2552_ & 0xff00ff)
					       + (i_2553_ & 0xff00ff));
				int i_2556_
				    = ((i_2555_ & 0x1000100)
				       + (i_2554_ - i_2555_ & 0x10000));
				is[i_2547_]
				    = i_2554_ - i_2556_ | i_2556_ - (i_2556_
								     >>> 8);
			    } else if (i == 2) {
				int i_2557_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_2546_]) & 0xff]);
				int i_2558_ = ((i_2557_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
				int i_2559_ = ((i_2557_ & 0xff00) * anInt8830
					       & 0xff0000);
				is[i_2547_]
				    = ((i_2558_ | i_2559_) >>> 8) + anInt8834;
			    } else
				throw new IllegalArgumentException();
			} else if (i_2054_ == 1) {
			    if (i == 1) {
				int i_2560_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2546_]);
				if (i_2560_ != 0)
				    is[i_2547_]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_2560_ & 0xff]);
			    } else if (i == 0) {
				int i_2561_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2546_]);
				if (i_2561_ != 0) {
				    int i_2562_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_2561_ & 0xff]);
				    if ((anInt8829 & 0xffffff) == 16777215) {
					int i_2563_ = anInt8829 >>> 24;
					int i_2564_ = 256 - i_2563_;
					int i_2565_ = is[i_2547_];
					is[i_2547_]
					    = ((((i_2562_ & 0xff00ff) * i_2563_
						 + ((i_2565_ & 0xff00ff)
						    * i_2564_))
						& ~0xff00ff)
					       + (((i_2562_ & 0xff00) * i_2563_
						   + ((i_2565_ & 0xff00)
						      * i_2564_))
						  & 0xff0000)) >> 8;
				    } else if (anInt8830 != 255) {
					int i_2566_
					    = ((i_2562_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_2567_
					    = ((i_2562_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_2568_
					    = ((i_2562_ & 0xff) * anInt8836
					       & 0xff00);
					i_2562_ = (i_2566_ | i_2567_
						   | i_2568_) >>> 8;
					int i_2569_ = is[i_2547_];
					is[i_2547_]
					    = (((((i_2562_ & 0xff00ff)
						  * anInt8830)
						 + ((i_2569_ & 0xff00ff)
						    * anInt8831))
						& ~0xff00ff)
					       + ((((i_2562_ & 0xff00)
						    * anInt8830)
						   + ((i_2569_ & 0xff00)
						      * anInt8831))
						  & 0xff0000)) >> 8;
				    } else {
					int i_2570_
					    = ((i_2562_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_2571_
					    = ((i_2562_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_2572_
					    = ((i_2562_ & 0xff) * anInt8836
					       & 0xff00);
					is[i_2547_] = (i_2570_ | i_2571_
						       | i_2572_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_2573_ = (((Class151_Sub1_Sub1) this)
						.aByteArray11258[i_2546_]);
				int i_2574_ = (i_2573_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_2573_])
					       : 0);
				int i_2575_ = anInt8829;
				int i_2576_ = i_2574_ + i_2575_;
				int i_2577_ = ((i_2574_ & 0xff00ff)
					       + (i_2575_ & 0xff00ff));
				int i_2578_
				    = ((i_2577_ & 0x1000100)
				       + (i_2576_ - i_2577_ & 0x10000));
				i_2578_
				    = i_2576_ - i_2578_ | i_2578_ - (i_2578_
								     >>> 8);
				if (i_2574_ == 0 && anInt8830 != 255) {
				    i_2574_ = i_2578_;
				    i_2578_ = is[i_2547_];
				    i_2578_
					= ((((i_2574_ & 0xff00ff) * anInt8830
					     + ((i_2578_ & 0xff00ff)
						* anInt8831))
					    & ~0xff00ff)
					   + (((i_2574_ & 0xff00) * anInt8830
					       + ((i_2578_ & 0xff00)
						  * anInt8831))
					      & 0xff0000)) >> 8;
				}
				is[i_2547_] = i_2578_;
			    } else if (i == 2) {
				int i_2579_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2546_]);
				if (i_2579_ != 0) {
				    int i_2580_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_2579_ & 0xff]);
				    int i_2581_
					= ((i_2580_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_2582_
					= ((i_2580_ & 0xff00) * anInt8830
					   & 0xff0000);
				    is[i_2547_++] = ((i_2581_ | i_2582_)
						     >>> 8) + anInt8834;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_2054_ == 2) {
			    if (i == 1) {
				int i_2583_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2546_]);
				if (i_2583_ != 0) {
				    int i_2584_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_2583_ & 0xff]);
				    int i_2585_ = is[i_2547_];
				    int i_2586_ = i_2584_ + i_2585_;
				    int i_2587_ = ((i_2584_ & 0xff00ff)
						   + (i_2585_ & 0xff00ff));
				    i_2585_
					= ((i_2587_ & 0x1000100)
					   + (i_2586_ - i_2587_ & 0x10000));
				    is[i_2547_]
					= (i_2586_ - i_2585_
					   | i_2585_ - (i_2585_ >>> 8));
				}
			    } else if (i == 0) {
				int i_2588_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2546_]);
				if (i_2588_ != 0) {
				    int i_2589_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_2588_ & 0xff]);
				    int i_2590_
					= ((i_2589_ & 0xff0000) * anInt8815
					   & ~0xffffff);
				    int i_2591_
					= ((i_2589_ & 0xff00) * anInt8833
					   & 0xff0000);
				    int i_2592_ = ((i_2589_ & 0xff) * anInt8836
						   & 0xff00);
				    i_2589_
					= (i_2590_ | i_2591_ | i_2592_) >>> 8;
				    int i_2593_ = is[i_2547_];
				    int i_2594_ = i_2589_ + i_2593_;
				    int i_2595_ = ((i_2589_ & 0xff00ff)
						   + (i_2593_ & 0xff00ff));
				    i_2593_
					= ((i_2595_ & 0x1000100)
					   + (i_2594_ - i_2595_ & 0x10000));
				    is[i_2547_]
					= (i_2594_ - i_2593_
					   | i_2593_ - (i_2593_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_2596_ = (((Class151_Sub1_Sub1) this)
						.aByteArray11258[i_2546_]);
				int i_2597_ = (i_2596_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_2596_])
					       : 0);
				int i_2598_ = anInt8829;
				int i_2599_ = i_2597_ + i_2598_;
				int i_2600_ = ((i_2597_ & 0xff00ff)
					       + (i_2598_ & 0xff00ff));
				int i_2601_
				    = ((i_2600_ & 0x1000100)
				       + (i_2599_ - i_2600_ & 0x10000));
				i_2601_
				    = i_2599_ - i_2601_ | i_2601_ - (i_2601_
								     >>> 8);
				if (i_2597_ == 0 && anInt8830 != 255) {
				    i_2597_ = i_2601_;
				    i_2601_ = is[i_2547_];
				    i_2601_
					= ((((i_2597_ & 0xff00ff) * anInt8830
					     + ((i_2601_ & 0xff00ff)
						* anInt8831))
					    & ~0xff00ff)
					   + (((i_2597_ & 0xff00) * anInt8830
					       + ((i_2601_ & 0xff00)
						  * anInt8831))
					      & 0xff0000)) >> 8;
				}
				is[i_2547_] = i_2601_;
			    } else if (i == 2) {
				int i_2602_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2546_]);
				if (i_2602_ != 0) {
				    int i_2603_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_2602_ & 0xff]);
				    int i_2604_
					= ((i_2603_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_2605_
					= ((i_2603_ & 0xff00) * anInt8830
					   & 0xff0000);
				    i_2603_ = (((i_2604_ | i_2605_) >>> 8)
					       + anInt8834);
				    int i_2606_ = is[i_2547_];
				    int i_2607_ = i_2603_ + i_2606_;
				    int i_2608_ = ((i_2603_ & 0xff00ff)
						   + (i_2606_ & 0xff00ff));
				    i_2606_
					= ((i_2608_ & 0x1000100)
					   + (i_2607_ - i_2608_ & 0x10000));
				    is[i_2547_]
					= (i_2607_ - i_2606_
					   | i_2606_ - (i_2606_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_2541_ += anInt8822;
			i_2542_ += anInt8825;
		    }
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else {
		for (int i_2609_ = anInt8816; i_2609_ < 0; i_2609_++) {
		    int i_2610_ = anInt8818;
		    int i_2611_ = anInt8807 + anInt8805;
		    int i_2612_ = anInt8826 + anInt8828;
		    int i_2613_ = anInt8809;
		    if (i_2611_ < 0) {
			int i_2614_ = (anInt8822 - 1 - i_2611_) / anInt8822;
			i_2613_ += i_2614_;
			i_2611_ += anInt8822 * i_2614_;
			i_2612_ += anInt8825 * i_2614_;
			i_2610_ += i_2614_;
		    }
		    int i_2615_;
		    if ((i_2615_
			 = (1 + i_2611_
			    - (((Class151_Sub1_Sub1) this).anInt8803 << 12)
			    - anInt8822) / anInt8822)
			> i_2613_)
			i_2613_ = i_2615_;
		    if (i_2612_ < 0) {
			i_2615_ = (anInt8825 - 1 - i_2612_) / anInt8825;
			i_2613_ += i_2615_;
			i_2611_ += anInt8822 * i_2615_;
			i_2612_ += anInt8825 * i_2615_;
			i_2610_ += i_2615_;
		    }
		    if ((i_2615_
			 = (1 + i_2612_
			    - (((Class151_Sub1_Sub1) this).anInt8804 << 12)
			    - anInt8825) / anInt8825)
			> i_2613_)
			i_2613_ = i_2615_;
		    for (/**/; i_2613_ < 0; i_2613_++) {
			int i_2616_
			    = (((i_2612_ >> 12)
				* ((Class151_Sub1_Sub1) this).anInt8803)
			       + (i_2611_ >> 12));
			int i_2617_ = i_2610_++;
			if (i_2054_ == 0) {
			    if (i == 1)
				is[i_2617_]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_2616_]) & 0xff]);
			    else if (i == 0) {
				int i_2618_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_2616_]) & 0xff]);
				int i_2619_ = ((i_2618_ & 0xff0000) * anInt8815
					       & ~0xffffff);
				int i_2620_ = ((i_2618_ & 0xff00) * anInt8833
					       & 0xff0000);
				int i_2621_
				    = (i_2618_ & 0xff) * anInt8836 & 0xff00;
				is[i_2617_]
				    = (i_2619_ | i_2620_ | i_2621_) >>> 8;
			    } else if (i == 3) {
				int i_2622_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_2616_]) & 0xff]);
				int i_2623_ = anInt8829;
				int i_2624_ = i_2622_ + i_2623_;
				int i_2625_ = ((i_2622_ & 0xff00ff)
					       + (i_2623_ & 0xff00ff));
				int i_2626_
				    = ((i_2625_ & 0x1000100)
				       + (i_2624_ - i_2625_ & 0x10000));
				is[i_2617_]
				    = i_2624_ - i_2626_ | i_2626_ - (i_2626_
								     >>> 8);
			    } else if (i == 2) {
				int i_2627_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_2616_]) & 0xff]);
				int i_2628_ = ((i_2627_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
				int i_2629_ = ((i_2627_ & 0xff00) * anInt8830
					       & 0xff0000);
				is[i_2617_]
				    = ((i_2628_ | i_2629_) >>> 8) + anInt8834;
			    } else
				throw new IllegalArgumentException();
			} else if (i_2054_ == 1) {
			    if (i == 1) {
				int i_2630_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2616_]);
				if (i_2630_ != 0)
				    is[i_2617_]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_2630_ & 0xff]);
			    } else if (i == 0) {
				int i_2631_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2616_]);
				if (i_2631_ != 0) {
				    int i_2632_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_2631_ & 0xff]);
				    if ((anInt8829 & 0xffffff) == 16777215) {
					int i_2633_ = anInt8829 >>> 24;
					int i_2634_ = 256 - i_2633_;
					int i_2635_ = is[i_2617_];
					is[i_2617_]
					    = ((((i_2632_ & 0xff00ff) * i_2633_
						 + ((i_2635_ & 0xff00ff)
						    * i_2634_))
						& ~0xff00ff)
					       + (((i_2632_ & 0xff00) * i_2633_
						   + ((i_2635_ & 0xff00)
						      * i_2634_))
						  & 0xff0000)) >> 8;
				    } else if (anInt8830 != 255) {
					int i_2636_
					    = ((i_2632_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_2637_
					    = ((i_2632_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_2638_
					    = ((i_2632_ & 0xff) * anInt8836
					       & 0xff00);
					i_2632_ = (i_2636_ | i_2637_
						   | i_2638_) >>> 8;
					int i_2639_ = is[i_2617_];
					is[i_2617_]
					    = (((((i_2632_ & 0xff00ff)
						  * anInt8830)
						 + ((i_2639_ & 0xff00ff)
						    * anInt8831))
						& ~0xff00ff)
					       + ((((i_2632_ & 0xff00)
						    * anInt8830)
						   + ((i_2639_ & 0xff00)
						      * anInt8831))
						  & 0xff0000)) >> 8;
				    } else {
					int i_2640_
					    = ((i_2632_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_2641_
					    = ((i_2632_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_2642_
					    = ((i_2632_ & 0xff) * anInt8836
					       & 0xff00);
					is[i_2617_] = (i_2640_ | i_2641_
						       | i_2642_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_2643_ = (((Class151_Sub1_Sub1) this)
						.aByteArray11258[i_2616_]);
				int i_2644_ = (i_2643_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_2643_])
					       : 0);
				int i_2645_ = anInt8829;
				int i_2646_ = i_2644_ + i_2645_;
				int i_2647_ = ((i_2644_ & 0xff00ff)
					       + (i_2645_ & 0xff00ff));
				int i_2648_
				    = ((i_2647_ & 0x1000100)
				       + (i_2646_ - i_2647_ & 0x10000));
				i_2648_
				    = i_2646_ - i_2648_ | i_2648_ - (i_2648_
								     >>> 8);
				if (i_2644_ == 0 && anInt8830 != 255) {
				    i_2644_ = i_2648_;
				    i_2648_ = is[i_2617_];
				    i_2648_
					= ((((i_2644_ & 0xff00ff) * anInt8830
					     + ((i_2648_ & 0xff00ff)
						* anInt8831))
					    & ~0xff00ff)
					   + (((i_2644_ & 0xff00) * anInt8830
					       + ((i_2648_ & 0xff00)
						  * anInt8831))
					      & 0xff0000)) >> 8;
				}
				is[i_2617_] = i_2648_;
			    } else if (i == 2) {
				int i_2649_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2616_]);
				if (i_2649_ != 0) {
				    int i_2650_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_2649_ & 0xff]);
				    int i_2651_
					= ((i_2650_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_2652_
					= ((i_2650_ & 0xff00) * anInt8830
					   & 0xff0000);
				    is[i_2617_++] = ((i_2651_ | i_2652_)
						     >>> 8) + anInt8834;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_2054_ == 2) {
			    if (i == 1) {
				int i_2653_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2616_]);
				if (i_2653_ != 0) {
				    int i_2654_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_2653_ & 0xff]);
				    int i_2655_ = is[i_2617_];
				    int i_2656_ = i_2654_ + i_2655_;
				    int i_2657_ = ((i_2654_ & 0xff00ff)
						   + (i_2655_ & 0xff00ff));
				    i_2655_
					= ((i_2657_ & 0x1000100)
					   + (i_2656_ - i_2657_ & 0x10000));
				    is[i_2617_]
					= (i_2656_ - i_2655_
					   | i_2655_ - (i_2655_ >>> 8));
				}
			    } else if (i == 0) {
				int i_2658_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2616_]);
				if (i_2658_ != 0) {
				    int i_2659_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_2658_ & 0xff]);
				    int i_2660_
					= ((i_2659_ & 0xff0000) * anInt8815
					   & ~0xffffff);
				    int i_2661_
					= ((i_2659_ & 0xff00) * anInt8833
					   & 0xff0000);
				    int i_2662_ = ((i_2659_ & 0xff) * anInt8836
						   & 0xff00);
				    i_2659_
					= (i_2660_ | i_2661_ | i_2662_) >>> 8;
				    int i_2663_ = is[i_2617_];
				    int i_2664_ = i_2659_ + i_2663_;
				    int i_2665_ = ((i_2659_ & 0xff00ff)
						   + (i_2663_ & 0xff00ff));
				    i_2663_
					= ((i_2665_ & 0x1000100)
					   + (i_2664_ - i_2665_ & 0x10000));
				    is[i_2617_]
					= (i_2664_ - i_2663_
					   | i_2663_ - (i_2663_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_2666_ = (((Class151_Sub1_Sub1) this)
						.aByteArray11258[i_2616_]);
				int i_2667_ = (i_2666_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_2666_])
					       : 0);
				int i_2668_ = anInt8829;
				int i_2669_ = i_2667_ + i_2668_;
				int i_2670_ = ((i_2667_ & 0xff00ff)
					       + (i_2668_ & 0xff00ff));
				int i_2671_
				    = ((i_2670_ & 0x1000100)
				       + (i_2669_ - i_2670_ & 0x10000));
				i_2671_
				    = i_2669_ - i_2671_ | i_2671_ - (i_2671_
								     >>> 8);
				if (i_2667_ == 0 && anInt8830 != 255) {
				    i_2667_ = i_2671_;
				    i_2671_ = is[i_2617_];
				    i_2671_
					= ((((i_2667_ & 0xff00ff) * anInt8830
					     + ((i_2671_ & 0xff00ff)
						* anInt8831))
					    & ~0xff00ff)
					   + (((i_2667_ & 0xff00) * anInt8830
					       + ((i_2671_ & 0xff00)
						  * anInt8831))
					      & 0xff0000)) >> 8;
				}
				is[i_2617_] = i_2671_;
			    } else if (i == 2) {
				int i_2672_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2616_]);
				if (i_2672_ != 0) {
				    int i_2673_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_2672_ & 0xff]);
				    int i_2674_
					= ((i_2673_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_2675_
					= ((i_2673_ & 0xff00) * anInt8830
					   & 0xff0000);
				    i_2673_ = (((i_2674_ | i_2675_) >>> 8)
					       + anInt8834);
				    int i_2676_ = is[i_2617_];
				    int i_2677_ = i_2673_ + i_2676_;
				    int i_2678_ = ((i_2673_ & 0xff00ff)
						   + (i_2676_ & 0xff00ff));
				    i_2676_
					= ((i_2678_ & 0x1000100)
					   + (i_2677_ - i_2678_ & 0x10000));
				    is[i_2617_]
					= (i_2677_ - i_2676_
					   | i_2676_ - (i_2676_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_2611_ += anInt8822;
			i_2612_ += anInt8825;
		    }
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    }
	}
    }
    
    void method8299(int i, int i_2679_) {
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    if (anInt8822 == 0) {
		if (anInt8825 == 0) {
		    int i_2680_ = anInt8816;
		    while (i_2680_ < 0) {
			int i_2681_ = anInt8818;
			int i_2682_ = anInt8807;
			int i_2683_ = anInt8826;
			int i_2684_ = anInt8809;
			if (i_2682_ >= 0 && i_2683_ >= 0
			    && i_2682_ - (((Class151_Sub1_Sub1) this).anInt8803
					  << 12) < 0
			    && i_2683_ - (((Class151_Sub1_Sub1) this).anInt8804
					  << 12) < 0) {
			    for (/**/; i_2684_ < 0; i_2684_++) {
				int i_2685_
				    = ((i_2683_ >> 12) * ((Class151_Sub1_Sub1)
							  this).anInt8803
				       + (i_2682_ >> 12));
				int i_2686_ = i_2681_++;
				if (i_2679_ == 0) {
				    if (i == 1)
					is[i_2686_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2685_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_2687_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2685_])
						 & 0xff)]);
					int i_2688_
					    = ((i_2687_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_2689_
					    = ((i_2687_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_2690_
					    = ((i_2687_ & 0xff) * anInt8836
					       & 0xff00);
					is[i_2686_] = (i_2688_ | i_2689_
						       | i_2690_) >>> 8;
				    } else if (i == 3) {
					int i_2691_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2685_])
						 & 0xff)]);
					int i_2692_ = anInt8829;
					int i_2693_ = i_2691_ + i_2692_;
					int i_2694_ = ((i_2691_ & 0xff00ff)
						       + (i_2692_ & 0xff00ff));
					int i_2695_ = ((i_2694_ & 0x1000100)
						       + (i_2693_ - i_2694_
							  & 0x10000));
					is[i_2686_]
					    = (i_2693_ - i_2695_
					       | i_2695_ - (i_2695_ >>> 8));
				    } else if (i == 2) {
					int i_2696_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2685_])
						 & 0xff)]);
					int i_2697_
					    = ((i_2696_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_2698_
					    = ((i_2696_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_2686_] = ((i_2697_ | i_2698_)
						       >>> 8) + anInt8834;
				    } else
					throw new IllegalArgumentException();
				} else if (i_2679_ == 1) {
				    if (i == 1) {
					int i_2699_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2685_]);
					if (i_2699_ != 0)
					    is[i_2686_]
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2699_ & 0xff]);
				    } else if (i == 0) {
					int i_2700_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2685_]);
					if (i_2700_ != 0) {
					    int i_2701_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2700_ & 0xff]);
					    if ((anInt8829 & 0xffffff)
						== 16777215) {
						int i_2702_ = anInt8829 >>> 24;
						int i_2703_ = 256 - i_2702_;
						int i_2704_ = is[i_2686_];
						is[i_2686_]
						    = (((((i_2701_ & 0xff00ff)
							  * i_2702_)
							 + ((i_2704_
							     & 0xff00ff)
							    * i_2703_))
							& ~0xff00ff)
						       + ((((i_2701_ & 0xff00)
							    * i_2702_)
							   + ((i_2704_
							       & 0xff00)
							      * i_2703_))
							  & 0xff0000)) >> 8;
					    } else if (anInt8830 != 255) {
						int i_2705_
						    = (((i_2701_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_2706_
						    = (((i_2701_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_2707_
						    = (((i_2701_ & 0xff)
							* anInt8836)
						       & 0xff00);
						i_2701_ = (i_2705_ | i_2706_
							   | i_2707_) >>> 8;
						int i_2708_ = is[i_2686_];
						is[i_2686_]
						    = (((((i_2701_ & 0xff00ff)
							  * anInt8830)
							 + ((i_2708_
							     & 0xff00ff)
							    * anInt8831))
							& ~0xff00ff)
						       + ((((i_2701_ & 0xff00)
							    * anInt8830)
							   + ((i_2708_
							       & 0xff00)
							      * anInt8831))
							  & 0xff0000)) >> 8;
					    } else {
						int i_2709_
						    = (((i_2701_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_2710_
						    = (((i_2701_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_2711_
						    = (((i_2701_ & 0xff)
							* anInt8836)
						       & 0xff00);
						is[i_2686_]
						    = (i_2709_ | i_2710_
						       | i_2711_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_2712_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2685_]);
					int i_2713_
					    = (i_2712_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_2712_])
					       : 0);
					int i_2714_ = anInt8829;
					int i_2715_ = i_2713_ + i_2714_;
					int i_2716_ = ((i_2713_ & 0xff00ff)
						       + (i_2714_ & 0xff00ff));
					int i_2717_ = ((i_2716_ & 0x1000100)
						       + (i_2715_ - i_2716_
							  & 0x10000));
					i_2717_
					    = (i_2715_ - i_2717_
					       | i_2717_ - (i_2717_ >>> 8));
					if (i_2713_ == 0 && anInt8830 != 255) {
					    i_2713_ = i_2717_;
					    i_2717_ = is[i_2686_];
					    i_2717_
						= (((((i_2713_ & 0xff00ff)
						      * anInt8830)
						     + ((i_2717_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_2713_ & 0xff00)
							* anInt8830)
						       + ((i_2717_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					}
					is[i_2686_] = i_2717_;
				    } else if (i == 2) {
					int i_2718_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2685_]);
					if (i_2718_ != 0) {
					    int i_2719_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2718_ & 0xff]);
					    int i_2720_
						= (((i_2719_ & 0xff00ff)
						    * anInt8830)
						   & ~0xff00ff);
					    int i_2721_ = (((i_2719_ & 0xff00)
							    * anInt8830)
							   & 0xff0000);
					    is[i_2686_++]
						= (((i_2720_ | i_2721_) >>> 8)
						   + anInt8834);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_2679_ == 2) {
				    if (i == 1) {
					int i_2722_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2685_]);
					if (i_2722_ != 0) {
					    int i_2723_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2722_ & 0xff]);
					    int i_2724_ = is[i_2686_];
					    int i_2725_ = i_2723_ + i_2724_;
					    int i_2726_
						= ((i_2723_ & 0xff00ff)
						   + (i_2724_ & 0xff00ff));
					    i_2724_ = ((i_2726_ & 0x1000100)
						       + (i_2725_ - i_2726_
							  & 0x10000));
					    is[i_2686_]
						= (i_2725_ - i_2724_
						   | i_2724_ - (i_2724_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_2727_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2685_]);
					if (i_2727_ != 0) {
					    int i_2728_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2727_ & 0xff]);
					    int i_2729_
						= (((i_2728_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_2730_ = (((i_2728_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_2731_
						= ((i_2728_ & 0xff) * anInt8836
						   & 0xff00);
					    i_2728_ = (i_2729_ | i_2730_
						       | i_2731_) >>> 8;
					    int i_2732_ = is[i_2686_];
					    int i_2733_ = i_2728_ + i_2732_;
					    int i_2734_
						= ((i_2728_ & 0xff00ff)
						   + (i_2732_ & 0xff00ff));
					    i_2732_ = ((i_2734_ & 0x1000100)
						       + (i_2733_ - i_2734_
							  & 0x10000));
					    is[i_2686_]
						= (i_2733_ - i_2732_
						   | i_2732_ - (i_2732_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_2735_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2685_]);
					int i_2736_
					    = (i_2735_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_2735_])
					       : 0);
					int i_2737_ = anInt8829;
					int i_2738_ = i_2736_ + i_2737_;
					int i_2739_ = ((i_2736_ & 0xff00ff)
						       + (i_2737_ & 0xff00ff));
					int i_2740_ = ((i_2739_ & 0x1000100)
						       + (i_2738_ - i_2739_
							  & 0x10000));
					i_2740_
					    = (i_2738_ - i_2740_
					       | i_2740_ - (i_2740_ >>> 8));
					if (i_2736_ == 0 && anInt8830 != 255) {
					    i_2736_ = i_2740_;
					    i_2740_ = is[i_2686_];
					    i_2740_
						= (((((i_2736_ & 0xff00ff)
						      * anInt8830)
						     + ((i_2740_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_2736_ & 0xff00)
							* anInt8830)
						       + ((i_2740_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					}
					is[i_2686_] = i_2740_;
				    } else if (i == 2) {
					int i_2741_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2685_]);
					if (i_2741_ != 0) {
					    int i_2742_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2741_ & 0xff]);
					    int i_2743_
						= (((i_2742_ & 0xff00ff)
						    * anInt8830)
						   & ~0xff00ff);
					    int i_2744_ = (((i_2742_ & 0xff00)
							    * anInt8830)
							   & 0xff0000);
					    i_2742_ = ((i_2743_ | i_2744_)
						       >>> 8) + anInt8834;
					    int i_2745_ = is[i_2686_];
					    int i_2746_ = i_2742_ + i_2745_;
					    int i_2747_
						= ((i_2742_ & 0xff00ff)
						   + (i_2745_ & 0xff00ff));
					    i_2745_ = ((i_2747_ & 0x1000100)
						       + (i_2746_ - i_2747_
							  & 0x10000));
					    is[i_2686_]
						= (i_2746_ - i_2745_
						   | i_2745_ - (i_2745_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
			    }
			}
			i_2680_++;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_2748_ = anInt8816;
		    while (i_2748_ < 0) {
			int i_2749_ = anInt8818;
			int i_2750_ = anInt8807;
			int i_2751_ = anInt8826 + anInt8828;
			int i_2752_ = anInt8809;
			if (i_2750_ >= 0
			    && i_2750_ - (((Class151_Sub1_Sub1) this).anInt8803
					  << 12) < 0) {
			    int i_2753_;
			    if ((i_2753_
				 = (i_2751_
				    - (((Class151_Sub1_Sub1) this).anInt8804
				       << 12)))
				>= 0) {
				i_2753_ = (anInt8825 - i_2753_) / anInt8825;
				i_2752_ += i_2753_;
				i_2751_ += anInt8825 * i_2753_;
				i_2749_ += i_2753_;
			    }
			    if ((i_2753_ = (i_2751_ - anInt8825) / anInt8825)
				> i_2752_)
				i_2752_ = i_2753_;
			    for (/**/; i_2752_ < 0; i_2752_++) {
				int i_2754_
				    = ((i_2751_ >> 12) * ((Class151_Sub1_Sub1)
							  this).anInt8803
				       + (i_2750_ >> 12));
				int i_2755_ = i_2749_++;
				if (i_2679_ == 0) {
				    if (i == 1)
					is[i_2755_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2754_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_2756_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2754_])
						 & 0xff)]);
					int i_2757_
					    = ((i_2756_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_2758_
					    = ((i_2756_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_2759_
					    = ((i_2756_ & 0xff) * anInt8836
					       & 0xff00);
					is[i_2755_] = (i_2757_ | i_2758_
						       | i_2759_) >>> 8;
				    } else if (i == 3) {
					int i_2760_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2754_])
						 & 0xff)]);
					int i_2761_ = anInt8829;
					int i_2762_ = i_2760_ + i_2761_;
					int i_2763_ = ((i_2760_ & 0xff00ff)
						       + (i_2761_ & 0xff00ff));
					int i_2764_ = ((i_2763_ & 0x1000100)
						       + (i_2762_ - i_2763_
							  & 0x10000));
					is[i_2755_]
					    = (i_2762_ - i_2764_
					       | i_2764_ - (i_2764_ >>> 8));
				    } else if (i == 2) {
					int i_2765_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2754_])
						 & 0xff)]);
					int i_2766_
					    = ((i_2765_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_2767_
					    = ((i_2765_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_2755_] = ((i_2766_ | i_2767_)
						       >>> 8) + anInt8834;
				    } else
					throw new IllegalArgumentException();
				} else if (i_2679_ == 1) {
				    if (i == 1) {
					int i_2768_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2754_]);
					if (i_2768_ != 0)
					    is[i_2755_]
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2768_ & 0xff]);
				    } else if (i == 0) {
					int i_2769_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2754_]);
					if (i_2769_ != 0) {
					    int i_2770_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2769_ & 0xff]);
					    if ((anInt8829 & 0xffffff)
						== 16777215) {
						int i_2771_ = anInt8829 >>> 24;
						int i_2772_ = 256 - i_2771_;
						int i_2773_ = is[i_2755_];
						is[i_2755_]
						    = (((((i_2770_ & 0xff00ff)
							  * i_2771_)
							 + ((i_2773_
							     & 0xff00ff)
							    * i_2772_))
							& ~0xff00ff)
						       + ((((i_2770_ & 0xff00)
							    * i_2771_)
							   + ((i_2773_
							       & 0xff00)
							      * i_2772_))
							  & 0xff0000)) >> 8;
					    } else if (anInt8830 != 255) {
						int i_2774_
						    = (((i_2770_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_2775_
						    = (((i_2770_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_2776_
						    = (((i_2770_ & 0xff)
							* anInt8836)
						       & 0xff00);
						i_2770_ = (i_2774_ | i_2775_
							   | i_2776_) >>> 8;
						int i_2777_ = is[i_2755_];
						is[i_2755_]
						    = (((((i_2770_ & 0xff00ff)
							  * anInt8830)
							 + ((i_2777_
							     & 0xff00ff)
							    * anInt8831))
							& ~0xff00ff)
						       + ((((i_2770_ & 0xff00)
							    * anInt8830)
							   + ((i_2777_
							       & 0xff00)
							      * anInt8831))
							  & 0xff0000)) >> 8;
					    } else {
						int i_2778_
						    = (((i_2770_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_2779_
						    = (((i_2770_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_2780_
						    = (((i_2770_ & 0xff)
							* anInt8836)
						       & 0xff00);
						is[i_2755_]
						    = (i_2778_ | i_2779_
						       | i_2780_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_2781_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2754_]);
					int i_2782_
					    = (i_2781_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_2781_])
					       : 0);
					int i_2783_ = anInt8829;
					int i_2784_ = i_2782_ + i_2783_;
					int i_2785_ = ((i_2782_ & 0xff00ff)
						       + (i_2783_ & 0xff00ff));
					int i_2786_ = ((i_2785_ & 0x1000100)
						       + (i_2784_ - i_2785_
							  & 0x10000));
					i_2786_
					    = (i_2784_ - i_2786_
					       | i_2786_ - (i_2786_ >>> 8));
					if (i_2782_ == 0 && anInt8830 != 255) {
					    i_2782_ = i_2786_;
					    i_2786_ = is[i_2755_];
					    i_2786_
						= (((((i_2782_ & 0xff00ff)
						      * anInt8830)
						     + ((i_2786_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_2782_ & 0xff00)
							* anInt8830)
						       + ((i_2786_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					}
					is[i_2755_] = i_2786_;
				    } else if (i == 2) {
					int i_2787_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2754_]);
					if (i_2787_ != 0) {
					    int i_2788_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2787_ & 0xff]);
					    int i_2789_
						= (((i_2788_ & 0xff00ff)
						    * anInt8830)
						   & ~0xff00ff);
					    int i_2790_ = (((i_2788_ & 0xff00)
							    * anInt8830)
							   & 0xff0000);
					    is[i_2755_++]
						= (((i_2789_ | i_2790_) >>> 8)
						   + anInt8834);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_2679_ == 2) {
				    if (i == 1) {
					int i_2791_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2754_]);
					if (i_2791_ != 0) {
					    int i_2792_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2791_ & 0xff]);
					    int i_2793_ = is[i_2755_];
					    int i_2794_ = i_2792_ + i_2793_;
					    int i_2795_
						= ((i_2792_ & 0xff00ff)
						   + (i_2793_ & 0xff00ff));
					    i_2793_ = ((i_2795_ & 0x1000100)
						       + (i_2794_ - i_2795_
							  & 0x10000));
					    is[i_2755_]
						= (i_2794_ - i_2793_
						   | i_2793_ - (i_2793_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_2796_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2754_]);
					if (i_2796_ != 0) {
					    int i_2797_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2796_ & 0xff]);
					    int i_2798_
						= (((i_2797_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_2799_ = (((i_2797_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_2800_
						= ((i_2797_ & 0xff) * anInt8836
						   & 0xff00);
					    i_2797_ = (i_2798_ | i_2799_
						       | i_2800_) >>> 8;
					    int i_2801_ = is[i_2755_];
					    int i_2802_ = i_2797_ + i_2801_;
					    int i_2803_
						= ((i_2797_ & 0xff00ff)
						   + (i_2801_ & 0xff00ff));
					    i_2801_ = ((i_2803_ & 0x1000100)
						       + (i_2802_ - i_2803_
							  & 0x10000));
					    is[i_2755_]
						= (i_2802_ - i_2801_
						   | i_2801_ - (i_2801_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_2804_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2754_]);
					int i_2805_
					    = (i_2804_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_2804_])
					       : 0);
					int i_2806_ = anInt8829;
					int i_2807_ = i_2805_ + i_2806_;
					int i_2808_ = ((i_2805_ & 0xff00ff)
						       + (i_2806_ & 0xff00ff));
					int i_2809_ = ((i_2808_ & 0x1000100)
						       + (i_2807_ - i_2808_
							  & 0x10000));
					i_2809_
					    = (i_2807_ - i_2809_
					       | i_2809_ - (i_2809_ >>> 8));
					if (i_2805_ == 0 && anInt8830 != 255) {
					    i_2805_ = i_2809_;
					    i_2809_ = is[i_2755_];
					    i_2809_
						= (((((i_2805_ & 0xff00ff)
						      * anInt8830)
						     + ((i_2809_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_2805_ & 0xff00)
							* anInt8830)
						       + ((i_2809_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					}
					is[i_2755_] = i_2809_;
				    } else if (i == 2) {
					int i_2810_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2754_]);
					if (i_2810_ != 0) {
					    int i_2811_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2810_ & 0xff]);
					    int i_2812_
						= (((i_2811_ & 0xff00ff)
						    * anInt8830)
						   & ~0xff00ff);
					    int i_2813_ = (((i_2811_ & 0xff00)
							    * anInt8830)
							   & 0xff0000);
					    i_2811_ = ((i_2812_ | i_2813_)
						       >>> 8) + anInt8834;
					    int i_2814_ = is[i_2755_];
					    int i_2815_ = i_2811_ + i_2814_;
					    int i_2816_
						= ((i_2811_ & 0xff00ff)
						   + (i_2814_ & 0xff00ff));
					    i_2814_ = ((i_2816_ & 0x1000100)
						       + (i_2815_ - i_2816_
							  & 0x10000));
					    is[i_2755_]
						= (i_2815_ - i_2814_
						   | i_2814_ - (i_2814_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_2751_ += anInt8825;
			    }
			}
			i_2748_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_2817_ = anInt8816;
		    while (i_2817_ < 0) {
			int i_2818_ = anInt8818;
			int i_2819_ = anInt8807;
			int i_2820_ = anInt8826 + anInt8828;
			int i_2821_ = anInt8809;
			if (i_2819_ >= 0
			    && i_2819_ - (((Class151_Sub1_Sub1) this).anInt8803
					  << 12) < 0) {
			    if (i_2820_ < 0) {
				int i_2822_
				    = (anInt8825 - 1 - i_2820_) / anInt8825;
				i_2821_ += i_2822_;
				i_2820_ += anInt8825 * i_2822_;
				i_2818_ += i_2822_;
			    }
			    int i_2823_;
			    if ((i_2823_
				 = (1 + i_2820_
				    - (((Class151_Sub1_Sub1) this).anInt8804
				       << 12)
				    - anInt8825) / anInt8825)
				> i_2821_)
				i_2821_ = i_2823_;
			    for (/**/; i_2821_ < 0; i_2821_++) {
				int i_2824_
				    = ((i_2820_ >> 12) * ((Class151_Sub1_Sub1)
							  this).anInt8803
				       + (i_2819_ >> 12));
				int i_2825_ = i_2818_++;
				if (i_2679_ == 0) {
				    if (i == 1)
					is[i_2825_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2824_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_2826_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2824_])
						 & 0xff)]);
					int i_2827_
					    = ((i_2826_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_2828_
					    = ((i_2826_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_2829_
					    = ((i_2826_ & 0xff) * anInt8836
					       & 0xff00);
					is[i_2825_] = (i_2827_ | i_2828_
						       | i_2829_) >>> 8;
				    } else if (i == 3) {
					int i_2830_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2824_])
						 & 0xff)]);
					int i_2831_ = anInt8829;
					int i_2832_ = i_2830_ + i_2831_;
					int i_2833_ = ((i_2830_ & 0xff00ff)
						       + (i_2831_ & 0xff00ff));
					int i_2834_ = ((i_2833_ & 0x1000100)
						       + (i_2832_ - i_2833_
							  & 0x10000));
					is[i_2825_]
					    = (i_2832_ - i_2834_
					       | i_2834_ - (i_2834_ >>> 8));
				    } else if (i == 2) {
					int i_2835_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2824_])
						 & 0xff)]);
					int i_2836_
					    = ((i_2835_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_2837_
					    = ((i_2835_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_2825_] = ((i_2836_ | i_2837_)
						       >>> 8) + anInt8834;
				    } else
					throw new IllegalArgumentException();
				} else if (i_2679_ == 1) {
				    if (i == 1) {
					int i_2838_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2824_]);
					if (i_2838_ != 0)
					    is[i_2825_]
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2838_ & 0xff]);
				    } else if (i == 0) {
					int i_2839_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2824_]);
					if (i_2839_ != 0) {
					    int i_2840_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2839_ & 0xff]);
					    if ((anInt8829 & 0xffffff)
						== 16777215) {
						int i_2841_ = anInt8829 >>> 24;
						int i_2842_ = 256 - i_2841_;
						int i_2843_ = is[i_2825_];
						is[i_2825_]
						    = (((((i_2840_ & 0xff00ff)
							  * i_2841_)
							 + ((i_2843_
							     & 0xff00ff)
							    * i_2842_))
							& ~0xff00ff)
						       + ((((i_2840_ & 0xff00)
							    * i_2841_)
							   + ((i_2843_
							       & 0xff00)
							      * i_2842_))
							  & 0xff0000)) >> 8;
					    } else if (anInt8830 != 255) {
						int i_2844_
						    = (((i_2840_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_2845_
						    = (((i_2840_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_2846_
						    = (((i_2840_ & 0xff)
							* anInt8836)
						       & 0xff00);
						i_2840_ = (i_2844_ | i_2845_
							   | i_2846_) >>> 8;
						int i_2847_ = is[i_2825_];
						is[i_2825_]
						    = (((((i_2840_ & 0xff00ff)
							  * anInt8830)
							 + ((i_2847_
							     & 0xff00ff)
							    * anInt8831))
							& ~0xff00ff)
						       + ((((i_2840_ & 0xff00)
							    * anInt8830)
							   + ((i_2847_
							       & 0xff00)
							      * anInt8831))
							  & 0xff0000)) >> 8;
					    } else {
						int i_2848_
						    = (((i_2840_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_2849_
						    = (((i_2840_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_2850_
						    = (((i_2840_ & 0xff)
							* anInt8836)
						       & 0xff00);
						is[i_2825_]
						    = (i_2848_ | i_2849_
						       | i_2850_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_2851_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2824_]);
					int i_2852_
					    = (i_2851_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_2851_])
					       : 0);
					int i_2853_ = anInt8829;
					int i_2854_ = i_2852_ + i_2853_;
					int i_2855_ = ((i_2852_ & 0xff00ff)
						       + (i_2853_ & 0xff00ff));
					int i_2856_ = ((i_2855_ & 0x1000100)
						       + (i_2854_ - i_2855_
							  & 0x10000));
					i_2856_
					    = (i_2854_ - i_2856_
					       | i_2856_ - (i_2856_ >>> 8));
					if (i_2852_ == 0 && anInt8830 != 255) {
					    i_2852_ = i_2856_;
					    i_2856_ = is[i_2825_];
					    i_2856_
						= (((((i_2852_ & 0xff00ff)
						      * anInt8830)
						     + ((i_2856_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_2852_ & 0xff00)
							* anInt8830)
						       + ((i_2856_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					}
					is[i_2825_] = i_2856_;
				    } else if (i == 2) {
					int i_2857_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2824_]);
					if (i_2857_ != 0) {
					    int i_2858_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2857_ & 0xff]);
					    int i_2859_
						= (((i_2858_ & 0xff00ff)
						    * anInt8830)
						   & ~0xff00ff);
					    int i_2860_ = (((i_2858_ & 0xff00)
							    * anInt8830)
							   & 0xff0000);
					    is[i_2825_++]
						= (((i_2859_ | i_2860_) >>> 8)
						   + anInt8834);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_2679_ == 2) {
				    if (i == 1) {
					int i_2861_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2824_]);
					if (i_2861_ != 0) {
					    int i_2862_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2861_ & 0xff]);
					    int i_2863_ = is[i_2825_];
					    int i_2864_ = i_2862_ + i_2863_;
					    int i_2865_
						= ((i_2862_ & 0xff00ff)
						   + (i_2863_ & 0xff00ff));
					    i_2863_ = ((i_2865_ & 0x1000100)
						       + (i_2864_ - i_2865_
							  & 0x10000));
					    is[i_2825_]
						= (i_2864_ - i_2863_
						   | i_2863_ - (i_2863_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_2866_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2824_]);
					if (i_2866_ != 0) {
					    int i_2867_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2866_ & 0xff]);
					    int i_2868_
						= (((i_2867_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_2869_ = (((i_2867_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_2870_
						= ((i_2867_ & 0xff) * anInt8836
						   & 0xff00);
					    i_2867_ = (i_2868_ | i_2869_
						       | i_2870_) >>> 8;
					    int i_2871_ = is[i_2825_];
					    int i_2872_ = i_2867_ + i_2871_;
					    int i_2873_
						= ((i_2867_ & 0xff00ff)
						   + (i_2871_ & 0xff00ff));
					    i_2871_ = ((i_2873_ & 0x1000100)
						       + (i_2872_ - i_2873_
							  & 0x10000));
					    is[i_2825_]
						= (i_2872_ - i_2871_
						   | i_2871_ - (i_2871_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_2874_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2824_]);
					int i_2875_
					    = (i_2874_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_2874_])
					       : 0);
					int i_2876_ = anInt8829;
					int i_2877_ = i_2875_ + i_2876_;
					int i_2878_ = ((i_2875_ & 0xff00ff)
						       + (i_2876_ & 0xff00ff));
					int i_2879_ = ((i_2878_ & 0x1000100)
						       + (i_2877_ - i_2878_
							  & 0x10000));
					i_2879_
					    = (i_2877_ - i_2879_
					       | i_2879_ - (i_2879_ >>> 8));
					if (i_2875_ == 0 && anInt8830 != 255) {
					    i_2875_ = i_2879_;
					    i_2879_ = is[i_2825_];
					    i_2879_
						= (((((i_2875_ & 0xff00ff)
						      * anInt8830)
						     + ((i_2879_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_2875_ & 0xff00)
							* anInt8830)
						       + ((i_2879_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					}
					is[i_2825_] = i_2879_;
				    } else if (i == 2) {
					int i_2880_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2824_]);
					if (i_2880_ != 0) {
					    int i_2881_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2880_ & 0xff]);
					    int i_2882_
						= (((i_2881_ & 0xff00ff)
						    * anInt8830)
						   & ~0xff00ff);
					    int i_2883_ = (((i_2881_ & 0xff00)
							    * anInt8830)
							   & 0xff0000);
					    i_2881_ = ((i_2882_ | i_2883_)
						       >>> 8) + anInt8834;
					    int i_2884_ = is[i_2825_];
					    int i_2885_ = i_2881_ + i_2884_;
					    int i_2886_
						= ((i_2881_ & 0xff00ff)
						   + (i_2884_ & 0xff00ff));
					    i_2884_ = ((i_2886_ & 0x1000100)
						       + (i_2885_ - i_2886_
							  & 0x10000));
					    is[i_2825_]
						= (i_2885_ - i_2884_
						   | i_2884_ - (i_2884_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_2820_ += anInt8825;
			    }
			}
			i_2817_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8822 < 0) {
		if (anInt8825 == 0) {
		    int i_2887_ = anInt8816;
		    while (i_2887_ < 0) {
			int i_2888_ = anInt8818;
			int i_2889_ = anInt8807 + anInt8805;
			int i_2890_ = anInt8826;
			int i_2891_ = anInt8809;
			if (i_2890_ >= 0
			    && i_2890_ - (((Class151_Sub1_Sub1) this).anInt8804
					  << 12) < 0) {
			    int i_2892_;
			    if ((i_2892_
				 = (i_2889_
				    - (((Class151_Sub1_Sub1) this).anInt8803
				       << 12)))
				>= 0) {
				i_2892_ = (anInt8822 - i_2892_) / anInt8822;
				i_2891_ += i_2892_;
				i_2889_ += anInt8822 * i_2892_;
				i_2888_ += i_2892_;
			    }
			    if ((i_2892_ = (i_2889_ - anInt8822) / anInt8822)
				> i_2891_)
				i_2891_ = i_2892_;
			    for (/**/; i_2891_ < 0; i_2891_++) {
				int i_2893_
				    = ((i_2890_ >> 12) * ((Class151_Sub1_Sub1)
							  this).anInt8803
				       + (i_2889_ >> 12));
				int i_2894_ = i_2888_++;
				if (i_2679_ == 0) {
				    if (i == 1)
					is[i_2894_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2893_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_2895_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2893_])
						 & 0xff)]);
					int i_2896_
					    = ((i_2895_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_2897_
					    = ((i_2895_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_2898_
					    = ((i_2895_ & 0xff) * anInt8836
					       & 0xff00);
					is[i_2894_] = (i_2896_ | i_2897_
						       | i_2898_) >>> 8;
				    } else if (i == 3) {
					int i_2899_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2893_])
						 & 0xff)]);
					int i_2900_ = anInt8829;
					int i_2901_ = i_2899_ + i_2900_;
					int i_2902_ = ((i_2899_ & 0xff00ff)
						       + (i_2900_ & 0xff00ff));
					int i_2903_ = ((i_2902_ & 0x1000100)
						       + (i_2901_ - i_2902_
							  & 0x10000));
					is[i_2894_]
					    = (i_2901_ - i_2903_
					       | i_2903_ - (i_2903_ >>> 8));
				    } else if (i == 2) {
					int i_2904_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_2893_])
						 & 0xff)]);
					int i_2905_
					    = ((i_2904_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_2906_
					    = ((i_2904_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_2894_] = ((i_2905_ | i_2906_)
						       >>> 8) + anInt8834;
				    } else
					throw new IllegalArgumentException();
				} else if (i_2679_ == 1) {
				    if (i == 1) {
					int i_2907_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2893_]);
					if (i_2907_ != 0)
					    is[i_2894_]
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2907_ & 0xff]);
				    } else if (i == 0) {
					int i_2908_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2893_]);
					if (i_2908_ != 0) {
					    int i_2909_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2908_ & 0xff]);
					    if ((anInt8829 & 0xffffff)
						== 16777215) {
						int i_2910_ = anInt8829 >>> 24;
						int i_2911_ = 256 - i_2910_;
						int i_2912_ = is[i_2894_];
						is[i_2894_]
						    = (((((i_2909_ & 0xff00ff)
							  * i_2910_)
							 + ((i_2912_
							     & 0xff00ff)
							    * i_2911_))
							& ~0xff00ff)
						       + ((((i_2909_ & 0xff00)
							    * i_2910_)
							   + ((i_2912_
							       & 0xff00)
							      * i_2911_))
							  & 0xff0000)) >> 8;
					    } else if (anInt8830 != 255) {
						int i_2913_
						    = (((i_2909_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_2914_
						    = (((i_2909_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_2915_
						    = (((i_2909_ & 0xff)
							* anInt8836)
						       & 0xff00);
						i_2909_ = (i_2913_ | i_2914_
							   | i_2915_) >>> 8;
						int i_2916_ = is[i_2894_];
						is[i_2894_]
						    = (((((i_2909_ & 0xff00ff)
							  * anInt8830)
							 + ((i_2916_
							     & 0xff00ff)
							    * anInt8831))
							& ~0xff00ff)
						       + ((((i_2909_ & 0xff00)
							    * anInt8830)
							   + ((i_2916_
							       & 0xff00)
							      * anInt8831))
							  & 0xff0000)) >> 8;
					    } else {
						int i_2917_
						    = (((i_2909_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_2918_
						    = (((i_2909_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_2919_
						    = (((i_2909_ & 0xff)
							* anInt8836)
						       & 0xff00);
						is[i_2894_]
						    = (i_2917_ | i_2918_
						       | i_2919_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_2920_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2893_]);
					int i_2921_
					    = (i_2920_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_2920_])
					       : 0);
					int i_2922_ = anInt8829;
					int i_2923_ = i_2921_ + i_2922_;
					int i_2924_ = ((i_2921_ & 0xff00ff)
						       + (i_2922_ & 0xff00ff));
					int i_2925_ = ((i_2924_ & 0x1000100)
						       + (i_2923_ - i_2924_
							  & 0x10000));
					i_2925_
					    = (i_2923_ - i_2925_
					       | i_2925_ - (i_2925_ >>> 8));
					if (i_2921_ == 0 && anInt8830 != 255) {
					    i_2921_ = i_2925_;
					    i_2925_ = is[i_2894_];
					    i_2925_
						= (((((i_2921_ & 0xff00ff)
						      * anInt8830)
						     + ((i_2925_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_2921_ & 0xff00)
							* anInt8830)
						       + ((i_2925_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					}
					is[i_2894_] = i_2925_;
				    } else if (i == 2) {
					int i_2926_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2893_]);
					if (i_2926_ != 0) {
					    int i_2927_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2926_ & 0xff]);
					    int i_2928_
						= (((i_2927_ & 0xff00ff)
						    * anInt8830)
						   & ~0xff00ff);
					    int i_2929_ = (((i_2927_ & 0xff00)
							    * anInt8830)
							   & 0xff0000);
					    is[i_2894_++]
						= (((i_2928_ | i_2929_) >>> 8)
						   + anInt8834);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_2679_ == 2) {
				    if (i == 1) {
					int i_2930_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2893_]);
					if (i_2930_ != 0) {
					    int i_2931_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2930_ & 0xff]);
					    int i_2932_ = is[i_2894_];
					    int i_2933_ = i_2931_ + i_2932_;
					    int i_2934_
						= ((i_2931_ & 0xff00ff)
						   + (i_2932_ & 0xff00ff));
					    i_2932_ = ((i_2934_ & 0x1000100)
						       + (i_2933_ - i_2934_
							  & 0x10000));
					    is[i_2894_]
						= (i_2933_ - i_2932_
						   | i_2932_ - (i_2932_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_2935_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2893_]);
					if (i_2935_ != 0) {
					    int i_2936_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2935_ & 0xff]);
					    int i_2937_
						= (((i_2936_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_2938_ = (((i_2936_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_2939_
						= ((i_2936_ & 0xff) * anInt8836
						   & 0xff00);
					    i_2936_ = (i_2937_ | i_2938_
						       | i_2939_) >>> 8;
					    int i_2940_ = is[i_2894_];
					    int i_2941_ = i_2936_ + i_2940_;
					    int i_2942_
						= ((i_2936_ & 0xff00ff)
						   + (i_2940_ & 0xff00ff));
					    i_2940_ = ((i_2942_ & 0x1000100)
						       + (i_2941_ - i_2942_
							  & 0x10000));
					    is[i_2894_]
						= (i_2941_ - i_2940_
						   | i_2940_ - (i_2940_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_2943_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2893_]);
					int i_2944_
					    = (i_2943_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_2943_])
					       : 0);
					int i_2945_ = anInt8829;
					int i_2946_ = i_2944_ + i_2945_;
					int i_2947_ = ((i_2944_ & 0xff00ff)
						       + (i_2945_ & 0xff00ff));
					int i_2948_ = ((i_2947_ & 0x1000100)
						       + (i_2946_ - i_2947_
							  & 0x10000));
					i_2948_
					    = (i_2946_ - i_2948_
					       | i_2948_ - (i_2948_ >>> 8));
					if (i_2944_ == 0 && anInt8830 != 255) {
					    i_2944_ = i_2948_;
					    i_2948_ = is[i_2894_];
					    i_2948_
						= (((((i_2944_ & 0xff00ff)
						      * anInt8830)
						     + ((i_2948_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_2944_ & 0xff00)
							* anInt8830)
						       + ((i_2948_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					}
					is[i_2894_] = i_2948_;
				    } else if (i == 2) {
					int i_2949_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_2893_]);
					if (i_2949_ != 0) {
					    int i_2950_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_2949_ & 0xff]);
					    int i_2951_
						= (((i_2950_ & 0xff00ff)
						    * anInt8830)
						   & ~0xff00ff);
					    int i_2952_ = (((i_2950_ & 0xff00)
							    * anInt8830)
							   & 0xff0000);
					    i_2950_ = ((i_2951_ | i_2952_)
						       >>> 8) + anInt8834;
					    int i_2953_ = is[i_2894_];
					    int i_2954_ = i_2950_ + i_2953_;
					    int i_2955_
						= ((i_2950_ & 0xff00ff)
						   + (i_2953_ & 0xff00ff));
					    i_2953_ = ((i_2955_ & 0x1000100)
						       + (i_2954_ - i_2955_
							  & 0x10000));
					    is[i_2894_]
						= (i_2954_ - i_2953_
						   | i_2953_ - (i_2953_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_2889_ += anInt8822;
			    }
			}
			i_2887_++;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_2956_ = anInt8816;
		    while (i_2956_ < 0) {
			int i_2957_ = anInt8818;
			int i_2958_ = anInt8807 + anInt8805;
			int i_2959_ = anInt8826 + anInt8828;
			int i_2960_ = anInt8809;
			int i_2961_;
			if ((i_2961_
			     = i_2958_ - (((Class151_Sub1_Sub1) this).anInt8803
					  << 12))
			    >= 0) {
			    i_2961_ = (anInt8822 - i_2961_) / anInt8822;
			    i_2960_ += i_2961_;
			    i_2958_ += anInt8822 * i_2961_;
			    i_2959_ += anInt8825 * i_2961_;
			    i_2957_ += i_2961_;
			}
			if ((i_2961_ = (i_2958_ - anInt8822) / anInt8822)
			    > i_2960_)
			    i_2960_ = i_2961_;
			if ((i_2961_
			     = i_2959_ - (((Class151_Sub1_Sub1) this).anInt8804
					  << 12))
			    >= 0) {
			    i_2961_ = (anInt8825 - i_2961_) / anInt8825;
			    i_2960_ += i_2961_;
			    i_2958_ += anInt8822 * i_2961_;
			    i_2959_ += anInt8825 * i_2961_;
			    i_2957_ += i_2961_;
			}
			if ((i_2961_ = (i_2959_ - anInt8825) / anInt8825)
			    > i_2960_)
			    i_2960_ = i_2961_;
			for (/**/; i_2960_ < 0; i_2960_++) {
			    int i_2962_
				= (((i_2959_ >> 12)
				    * ((Class151_Sub1_Sub1) this).anInt8803)
				   + (i_2958_ >> 12));
			    int i_2963_ = i_2957_++;
			    if (i_2679_ == 0) {
				if (i == 1)
				    is[i_2963_]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_2962_])
					     & 0xff)]);
				else if (i == 0) {
				    int i_2964_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_2962_])
					     & 0xff)]);
				    int i_2965_
					= ((i_2964_ & 0xff0000) * anInt8815
					   & ~0xffffff);
				    int i_2966_
					= ((i_2964_ & 0xff00) * anInt8833
					   & 0xff0000);
				    int i_2967_ = ((i_2964_ & 0xff) * anInt8836
						   & 0xff00);
				    is[i_2963_]
					= (i_2965_ | i_2966_ | i_2967_) >>> 8;
				} else if (i == 3) {
				    int i_2968_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_2962_])
					     & 0xff)]);
				    int i_2969_ = anInt8829;
				    int i_2970_ = i_2968_ + i_2969_;
				    int i_2971_ = ((i_2968_ & 0xff00ff)
						   + (i_2969_ & 0xff00ff));
				    int i_2972_
					= ((i_2971_ & 0x1000100)
					   + (i_2970_ - i_2971_ & 0x10000));
				    is[i_2963_]
					= (i_2970_ - i_2972_
					   | i_2972_ - (i_2972_ >>> 8));
				} else if (i == 2) {
				    int i_2973_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_2962_])
					     & 0xff)]);
				    int i_2974_
					= ((i_2973_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_2975_
					= ((i_2973_ & 0xff00) * anInt8830
					   & 0xff0000);
				    is[i_2963_] = (((i_2974_ | i_2975_) >>> 8)
						   + anInt8834);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2679_ == 1) {
				if (i == 1) {
				    int i_2976_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_2962_]);
				    if (i_2976_ != 0)
					is[i_2963_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_2976_ & 0xff]);
				} else if (i == 0) {
				    int i_2977_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_2962_]);
				    if (i_2977_ != 0) {
					int i_2978_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_2977_ & 0xff]);
					if ((anInt8829 & 0xffffff)
					    == 16777215) {
					    int i_2979_ = anInt8829 >>> 24;
					    int i_2980_ = 256 - i_2979_;
					    int i_2981_ = is[i_2963_];
					    is[i_2963_]
						= (((((i_2978_ & 0xff00ff)
						      * i_2979_)
						     + ((i_2981_ & 0xff00ff)
							* i_2980_))
						    & ~0xff00ff)
						   + ((((i_2978_ & 0xff00)
							* i_2979_)
						       + ((i_2981_ & 0xff00)
							  * i_2980_))
						      & 0xff0000)) >> 8;
					} else if (anInt8830 != 255) {
					    int i_2982_
						= (((i_2978_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_2983_ = (((i_2978_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_2984_
						= ((i_2978_ & 0xff) * anInt8836
						   & 0xff00);
					    i_2978_ = (i_2982_ | i_2983_
						       | i_2984_) >>> 8;
					    int i_2985_ = is[i_2963_];
					    is[i_2963_]
						= (((((i_2978_ & 0xff00ff)
						      * anInt8830)
						     + ((i_2985_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_2978_ & 0xff00)
							* anInt8830)
						       + ((i_2985_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					} else {
					    int i_2986_
						= (((i_2978_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_2987_ = (((i_2978_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_2988_
						= ((i_2978_ & 0xff) * anInt8836
						   & 0xff00);
					    is[i_2963_] = (i_2986_ | i_2987_
							   | i_2988_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_2989_ = (((Class151_Sub1_Sub1) this)
						    .aByteArray11258[i_2962_]);
				    int i_2990_
					= (i_2989_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_2989_])
					   : 0);
				    int i_2991_ = anInt8829;
				    int i_2992_ = i_2990_ + i_2991_;
				    int i_2993_ = ((i_2990_ & 0xff00ff)
						   + (i_2991_ & 0xff00ff));
				    int i_2994_
					= ((i_2993_ & 0x1000100)
					   + (i_2992_ - i_2993_ & 0x10000));
				    i_2994_ = (i_2992_ - i_2994_
					       | i_2994_ - (i_2994_ >>> 8));
				    if (i_2990_ == 0 && anInt8830 != 255) {
					i_2990_ = i_2994_;
					i_2994_ = is[i_2963_];
					i_2994_ = (((((i_2990_ & 0xff00ff)
						      * anInt8830)
						     + ((i_2994_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_2990_ & 0xff00)
							* anInt8830)
						       + ((i_2994_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2963_] = i_2994_;
				} else if (i == 2) {
				    int i_2995_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_2962_]);
				    if (i_2995_ != 0) {
					int i_2996_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_2995_ & 0xff]);
					int i_2997_
					    = ((i_2996_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_2998_
					    = ((i_2996_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_2963_++] = ((i_2997_ | i_2998_)
							 >>> 8) + anInt8834;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2679_ == 2) {
				if (i == 1) {
				    int i_2999_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_2962_]);
				    if (i_2999_ != 0) {
					int i_3000_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_2999_ & 0xff]);
					int i_3001_ = is[i_2963_];
					int i_3002_ = i_3000_ + i_3001_;
					int i_3003_ = ((i_3000_ & 0xff00ff)
						       + (i_3001_ & 0xff00ff));
					i_3001_ = ((i_3003_ & 0x1000100)
						   + (i_3002_ - i_3003_
						      & 0x10000));
					is[i_2963_]
					    = (i_3002_ - i_3001_
					       | i_3001_ - (i_3001_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_3004_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_2962_]);
				    if (i_3004_ != 0) {
					int i_3005_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3004_ & 0xff]);
					int i_3006_
					    = ((i_3005_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_3007_
					    = ((i_3005_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_3008_
					    = ((i_3005_ & 0xff) * anInt8836
					       & 0xff00);
					i_3005_ = (i_3006_ | i_3007_
						   | i_3008_) >>> 8;
					int i_3009_ = is[i_2963_];
					int i_3010_ = i_3005_ + i_3009_;
					int i_3011_ = ((i_3005_ & 0xff00ff)
						       + (i_3009_ & 0xff00ff));
					i_3009_ = ((i_3011_ & 0x1000100)
						   + (i_3010_ - i_3011_
						      & 0x10000));
					is[i_2963_]
					    = (i_3010_ - i_3009_
					       | i_3009_ - (i_3009_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_3012_ = (((Class151_Sub1_Sub1) this)
						    .aByteArray11258[i_2962_]);
				    int i_3013_
					= (i_3012_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_3012_])
					   : 0);
				    int i_3014_ = anInt8829;
				    int i_3015_ = i_3013_ + i_3014_;
				    int i_3016_ = ((i_3013_ & 0xff00ff)
						   + (i_3014_ & 0xff00ff));
				    int i_3017_
					= ((i_3016_ & 0x1000100)
					   + (i_3015_ - i_3016_ & 0x10000));
				    i_3017_ = (i_3015_ - i_3017_
					       | i_3017_ - (i_3017_ >>> 8));
				    if (i_3013_ == 0 && anInt8830 != 255) {
					i_3013_ = i_3017_;
					i_3017_ = is[i_2963_];
					i_3017_ = (((((i_3013_ & 0xff00ff)
						      * anInt8830)
						     + ((i_3017_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_3013_ & 0xff00)
							* anInt8830)
						       + ((i_3017_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
				    }
				    is[i_2963_] = i_3017_;
				} else if (i == 2) {
				    int i_3018_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_2962_]);
				    if (i_3018_ != 0) {
					int i_3019_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3018_ & 0xff]);
					int i_3020_
					    = ((i_3019_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_3021_
					    = ((i_3019_ & 0xff00) * anInt8830
					       & 0xff0000);
					i_3019_ = (((i_3020_ | i_3021_) >>> 8)
						   + anInt8834);
					int i_3022_ = is[i_2963_];
					int i_3023_ = i_3019_ + i_3022_;
					int i_3024_ = ((i_3019_ & 0xff00ff)
						       + (i_3022_ & 0xff00ff));
					i_3022_ = ((i_3024_ & 0x1000100)
						   + (i_3023_ - i_3024_
						      & 0x10000));
					is[i_2963_]
					    = (i_3023_ - i_3022_
					       | i_3022_ - (i_3022_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_2958_ += anInt8822;
			    i_2959_ += anInt8825;
			}
			i_2956_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_3025_ = anInt8816;
		    while (i_3025_ < 0) {
			int i_3026_ = anInt8818;
			int i_3027_ = anInt8807 + anInt8805;
			int i_3028_ = anInt8826 + anInt8828;
			int i_3029_ = anInt8809;
			int i_3030_;
			if ((i_3030_
			     = i_3027_ - (((Class151_Sub1_Sub1) this).anInt8803
					  << 12))
			    >= 0) {
			    i_3030_ = (anInt8822 - i_3030_) / anInt8822;
			    i_3029_ += i_3030_;
			    i_3027_ += anInt8822 * i_3030_;
			    i_3028_ += anInt8825 * i_3030_;
			    i_3026_ += i_3030_;
			}
			if ((i_3030_ = (i_3027_ - anInt8822) / anInt8822)
			    > i_3029_)
			    i_3029_ = i_3030_;
			if (i_3028_ < 0) {
			    i_3030_ = (anInt8825 - 1 - i_3028_) / anInt8825;
			    i_3029_ += i_3030_;
			    i_3027_ += anInt8822 * i_3030_;
			    i_3028_ += anInt8825 * i_3030_;
			    i_3026_ += i_3030_;
			}
			if ((i_3030_
			     = (1 + i_3028_
				- (((Class151_Sub1_Sub1) this).anInt8804 << 12)
				- anInt8825) / anInt8825)
			    > i_3029_)
			    i_3029_ = i_3030_;
			for (/**/; i_3029_ < 0; i_3029_++) {
			    int i_3031_
				= (((i_3028_ >> 12)
				    * ((Class151_Sub1_Sub1) this).anInt8803)
				   + (i_3027_ >> 12));
			    int i_3032_ = i_3026_++;
			    if (i_2679_ == 0) {
				if (i == 1)
				    is[i_3032_]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_3031_])
					     & 0xff)]);
				else if (i == 0) {
				    int i_3033_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_3031_])
					     & 0xff)]);
				    int i_3034_
					= ((i_3033_ & 0xff0000) * anInt8815
					   & ~0xffffff);
				    int i_3035_
					= ((i_3033_ & 0xff00) * anInt8833
					   & 0xff0000);
				    int i_3036_ = ((i_3033_ & 0xff) * anInt8836
						   & 0xff00);
				    is[i_3032_]
					= (i_3034_ | i_3035_ | i_3036_) >>> 8;
				} else if (i == 3) {
				    int i_3037_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_3031_])
					     & 0xff)]);
				    int i_3038_ = anInt8829;
				    int i_3039_ = i_3037_ + i_3038_;
				    int i_3040_ = ((i_3037_ & 0xff00ff)
						   + (i_3038_ & 0xff00ff));
				    int i_3041_
					= ((i_3040_ & 0x1000100)
					   + (i_3039_ - i_3040_ & 0x10000));
				    is[i_3032_]
					= (i_3039_ - i_3041_
					   | i_3041_ - (i_3041_ >>> 8));
				} else if (i == 2) {
				    int i_3042_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_3031_])
					     & 0xff)]);
				    int i_3043_
					= ((i_3042_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_3044_
					= ((i_3042_ & 0xff00) * anInt8830
					   & 0xff0000);
				    is[i_3032_] = (((i_3043_ | i_3044_) >>> 8)
						   + anInt8834);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2679_ == 1) {
				if (i == 1) {
				    int i_3045_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3031_]);
				    if (i_3045_ != 0)
					is[i_3032_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3045_ & 0xff]);
				} else if (i == 0) {
				    int i_3046_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3031_]);
				    if (i_3046_ != 0) {
					int i_3047_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3046_ & 0xff]);
					if ((anInt8829 & 0xffffff)
					    == 16777215) {
					    int i_3048_ = anInt8829 >>> 24;
					    int i_3049_ = 256 - i_3048_;
					    int i_3050_ = is[i_3032_];
					    is[i_3032_]
						= (((((i_3047_ & 0xff00ff)
						      * i_3048_)
						     + ((i_3050_ & 0xff00ff)
							* i_3049_))
						    & ~0xff00ff)
						   + ((((i_3047_ & 0xff00)
							* i_3048_)
						       + ((i_3050_ & 0xff00)
							  * i_3049_))
						      & 0xff0000)) >> 8;
					} else if (anInt8830 != 255) {
					    int i_3051_
						= (((i_3047_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_3052_ = (((i_3047_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_3053_
						= ((i_3047_ & 0xff) * anInt8836
						   & 0xff00);
					    i_3047_ = (i_3051_ | i_3052_
						       | i_3053_) >>> 8;
					    int i_3054_ = is[i_3032_];
					    is[i_3032_]
						= (((((i_3047_ & 0xff00ff)
						      * anInt8830)
						     + ((i_3054_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_3047_ & 0xff00)
							* anInt8830)
						       + ((i_3054_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					} else {
					    int i_3055_
						= (((i_3047_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_3056_ = (((i_3047_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_3057_
						= ((i_3047_ & 0xff) * anInt8836
						   & 0xff00);
					    is[i_3032_] = (i_3055_ | i_3056_
							   | i_3057_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_3058_ = (((Class151_Sub1_Sub1) this)
						    .aByteArray11258[i_3031_]);
				    int i_3059_
					= (i_3058_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_3058_])
					   : 0);
				    int i_3060_ = anInt8829;
				    int i_3061_ = i_3059_ + i_3060_;
				    int i_3062_ = ((i_3059_ & 0xff00ff)
						   + (i_3060_ & 0xff00ff));
				    int i_3063_
					= ((i_3062_ & 0x1000100)
					   + (i_3061_ - i_3062_ & 0x10000));
				    i_3063_ = (i_3061_ - i_3063_
					       | i_3063_ - (i_3063_ >>> 8));
				    if (i_3059_ == 0 && anInt8830 != 255) {
					i_3059_ = i_3063_;
					i_3063_ = is[i_3032_];
					i_3063_ = (((((i_3059_ & 0xff00ff)
						      * anInt8830)
						     + ((i_3063_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_3059_ & 0xff00)
							* anInt8830)
						       + ((i_3063_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3032_] = i_3063_;
				} else if (i == 2) {
				    int i_3064_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3031_]);
				    if (i_3064_ != 0) {
					int i_3065_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3064_ & 0xff]);
					int i_3066_
					    = ((i_3065_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_3067_
					    = ((i_3065_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_3032_++] = ((i_3066_ | i_3067_)
							 >>> 8) + anInt8834;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2679_ == 2) {
				if (i == 1) {
				    int i_3068_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3031_]);
				    if (i_3068_ != 0) {
					int i_3069_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3068_ & 0xff]);
					int i_3070_ = is[i_3032_];
					int i_3071_ = i_3069_ + i_3070_;
					int i_3072_ = ((i_3069_ & 0xff00ff)
						       + (i_3070_ & 0xff00ff));
					i_3070_ = ((i_3072_ & 0x1000100)
						   + (i_3071_ - i_3072_
						      & 0x10000));
					is[i_3032_]
					    = (i_3071_ - i_3070_
					       | i_3070_ - (i_3070_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_3073_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3031_]);
				    if (i_3073_ != 0) {
					int i_3074_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3073_ & 0xff]);
					int i_3075_
					    = ((i_3074_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_3076_
					    = ((i_3074_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_3077_
					    = ((i_3074_ & 0xff) * anInt8836
					       & 0xff00);
					i_3074_ = (i_3075_ | i_3076_
						   | i_3077_) >>> 8;
					int i_3078_ = is[i_3032_];
					int i_3079_ = i_3074_ + i_3078_;
					int i_3080_ = ((i_3074_ & 0xff00ff)
						       + (i_3078_ & 0xff00ff));
					i_3078_ = ((i_3080_ & 0x1000100)
						   + (i_3079_ - i_3080_
						      & 0x10000));
					is[i_3032_]
					    = (i_3079_ - i_3078_
					       | i_3078_ - (i_3078_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_3081_ = (((Class151_Sub1_Sub1) this)
						    .aByteArray11258[i_3031_]);
				    int i_3082_
					= (i_3081_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_3081_])
					   : 0);
				    int i_3083_ = anInt8829;
				    int i_3084_ = i_3082_ + i_3083_;
				    int i_3085_ = ((i_3082_ & 0xff00ff)
						   + (i_3083_ & 0xff00ff));
				    int i_3086_
					= ((i_3085_ & 0x1000100)
					   + (i_3084_ - i_3085_ & 0x10000));
				    i_3086_ = (i_3084_ - i_3086_
					       | i_3086_ - (i_3086_ >>> 8));
				    if (i_3082_ == 0 && anInt8830 != 255) {
					i_3082_ = i_3086_;
					i_3086_ = is[i_3032_];
					i_3086_ = (((((i_3082_ & 0xff00ff)
						      * anInt8830)
						     + ((i_3086_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_3082_ & 0xff00)
							* anInt8830)
						       + ((i_3086_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3032_] = i_3086_;
				} else if (i == 2) {
				    int i_3087_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3031_]);
				    if (i_3087_ != 0) {
					int i_3088_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3087_ & 0xff]);
					int i_3089_
					    = ((i_3088_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_3090_
					    = ((i_3088_ & 0xff00) * anInt8830
					       & 0xff0000);
					i_3088_ = (((i_3089_ | i_3090_) >>> 8)
						   + anInt8834);
					int i_3091_ = is[i_3032_];
					int i_3092_ = i_3088_ + i_3091_;
					int i_3093_ = ((i_3088_ & 0xff00ff)
						       + (i_3091_ & 0xff00ff));
					i_3091_ = ((i_3093_ & 0x1000100)
						   + (i_3092_ - i_3093_
						      & 0x10000));
					is[i_3032_]
					    = (i_3092_ - i_3091_
					       | i_3091_ - (i_3091_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_3027_ += anInt8822;
			    i_3028_ += anInt8825;
			}
			i_3025_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8825 == 0) {
		int i_3094_ = anInt8816;
		while (i_3094_ < 0) {
		    int i_3095_ = anInt8818;
		    int i_3096_ = anInt8807 + anInt8805;
		    int i_3097_ = anInt8826;
		    int i_3098_ = anInt8809;
		    if (i_3097_ >= 0
			&& i_3097_ - (((Class151_Sub1_Sub1) this).anInt8804
				      << 12) < 0) {
			if (i_3096_ < 0) {
			    int i_3099_
				= (anInt8822 - 1 - i_3096_) / anInt8822;
			    i_3098_ += i_3099_;
			    i_3096_ += anInt8822 * i_3099_;
			    i_3095_ += i_3099_;
			}
			int i_3100_;
			if ((i_3100_
			     = (1 + i_3096_
				- (((Class151_Sub1_Sub1) this).anInt8803 << 12)
				- anInt8822) / anInt8822)
			    > i_3098_)
			    i_3098_ = i_3100_;
			for (/**/; i_3098_ < 0; i_3098_++) {
			    int i_3101_
				= (((i_3097_ >> 12)
				    * ((Class151_Sub1_Sub1) this).anInt8803)
				   + (i_3096_ >> 12));
			    int i_3102_ = i_3095_++;
			    if (i_2679_ == 0) {
				if (i == 1)
				    is[i_3102_]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_3101_])
					     & 0xff)]);
				else if (i == 0) {
				    int i_3103_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_3101_])
					     & 0xff)]);
				    int i_3104_
					= ((i_3103_ & 0xff0000) * anInt8815
					   & ~0xffffff);
				    int i_3105_
					= ((i_3103_ & 0xff00) * anInt8833
					   & 0xff0000);
				    int i_3106_ = ((i_3103_ & 0xff) * anInt8836
						   & 0xff00);
				    is[i_3102_]
					= (i_3104_ | i_3105_ | i_3106_) >>> 8;
				} else if (i == 3) {
				    int i_3107_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_3101_])
					     & 0xff)]);
				    int i_3108_ = anInt8829;
				    int i_3109_ = i_3107_ + i_3108_;
				    int i_3110_ = ((i_3107_ & 0xff00ff)
						   + (i_3108_ & 0xff00ff));
				    int i_3111_
					= ((i_3110_ & 0x1000100)
					   + (i_3109_ - i_3110_ & 0x10000));
				    is[i_3102_]
					= (i_3109_ - i_3111_
					   | i_3111_ - (i_3111_ >>> 8));
				} else if (i == 2) {
				    int i_3112_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_3101_])
					     & 0xff)]);
				    int i_3113_
					= ((i_3112_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_3114_
					= ((i_3112_ & 0xff00) * anInt8830
					   & 0xff0000);
				    is[i_3102_] = (((i_3113_ | i_3114_) >>> 8)
						   + anInt8834);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2679_ == 1) {
				if (i == 1) {
				    int i_3115_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3101_]);
				    if (i_3115_ != 0)
					is[i_3102_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3115_ & 0xff]);
				} else if (i == 0) {
				    int i_3116_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3101_]);
				    if (i_3116_ != 0) {
					int i_3117_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3116_ & 0xff]);
					if ((anInt8829 & 0xffffff)
					    == 16777215) {
					    int i_3118_ = anInt8829 >>> 24;
					    int i_3119_ = 256 - i_3118_;
					    int i_3120_ = is[i_3102_];
					    is[i_3102_]
						= (((((i_3117_ & 0xff00ff)
						      * i_3118_)
						     + ((i_3120_ & 0xff00ff)
							* i_3119_))
						    & ~0xff00ff)
						   + ((((i_3117_ & 0xff00)
							* i_3118_)
						       + ((i_3120_ & 0xff00)
							  * i_3119_))
						      & 0xff0000)) >> 8;
					} else if (anInt8830 != 255) {
					    int i_3121_
						= (((i_3117_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_3122_ = (((i_3117_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_3123_
						= ((i_3117_ & 0xff) * anInt8836
						   & 0xff00);
					    i_3117_ = (i_3121_ | i_3122_
						       | i_3123_) >>> 8;
					    int i_3124_ = is[i_3102_];
					    is[i_3102_]
						= (((((i_3117_ & 0xff00ff)
						      * anInt8830)
						     + ((i_3124_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_3117_ & 0xff00)
							* anInt8830)
						       + ((i_3124_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					} else {
					    int i_3125_
						= (((i_3117_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_3126_ = (((i_3117_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_3127_
						= ((i_3117_ & 0xff) * anInt8836
						   & 0xff00);
					    is[i_3102_] = (i_3125_ | i_3126_
							   | i_3127_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_3128_ = (((Class151_Sub1_Sub1) this)
						    .aByteArray11258[i_3101_]);
				    int i_3129_
					= (i_3128_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_3128_])
					   : 0);
				    int i_3130_ = anInt8829;
				    int i_3131_ = i_3129_ + i_3130_;
				    int i_3132_ = ((i_3129_ & 0xff00ff)
						   + (i_3130_ & 0xff00ff));
				    int i_3133_
					= ((i_3132_ & 0x1000100)
					   + (i_3131_ - i_3132_ & 0x10000));
				    i_3133_ = (i_3131_ - i_3133_
					       | i_3133_ - (i_3133_ >>> 8));
				    if (i_3129_ == 0 && anInt8830 != 255) {
					i_3129_ = i_3133_;
					i_3133_ = is[i_3102_];
					i_3133_ = (((((i_3129_ & 0xff00ff)
						      * anInt8830)
						     + ((i_3133_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_3129_ & 0xff00)
							* anInt8830)
						       + ((i_3133_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3102_] = i_3133_;
				} else if (i == 2) {
				    int i_3134_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3101_]);
				    if (i_3134_ != 0) {
					int i_3135_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3134_ & 0xff]);
					int i_3136_
					    = ((i_3135_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_3137_
					    = ((i_3135_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_3102_++] = ((i_3136_ | i_3137_)
							 >>> 8) + anInt8834;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_2679_ == 2) {
				if (i == 1) {
				    int i_3138_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3101_]);
				    if (i_3138_ != 0) {
					int i_3139_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3138_ & 0xff]);
					int i_3140_ = is[i_3102_];
					int i_3141_ = i_3139_ + i_3140_;
					int i_3142_ = ((i_3139_ & 0xff00ff)
						       + (i_3140_ & 0xff00ff));
					i_3140_ = ((i_3142_ & 0x1000100)
						   + (i_3141_ - i_3142_
						      & 0x10000));
					is[i_3102_]
					    = (i_3141_ - i_3140_
					       | i_3140_ - (i_3140_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_3143_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3101_]);
				    if (i_3143_ != 0) {
					int i_3144_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3143_ & 0xff]);
					int i_3145_
					    = ((i_3144_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_3146_
					    = ((i_3144_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_3147_
					    = ((i_3144_ & 0xff) * anInt8836
					       & 0xff00);
					i_3144_ = (i_3145_ | i_3146_
						   | i_3147_) >>> 8;
					int i_3148_ = is[i_3102_];
					int i_3149_ = i_3144_ + i_3148_;
					int i_3150_ = ((i_3144_ & 0xff00ff)
						       + (i_3148_ & 0xff00ff));
					i_3148_ = ((i_3150_ & 0x1000100)
						   + (i_3149_ - i_3150_
						      & 0x10000));
					is[i_3102_]
					    = (i_3149_ - i_3148_
					       | i_3148_ - (i_3148_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_3151_ = (((Class151_Sub1_Sub1) this)
						    .aByteArray11258[i_3101_]);
				    int i_3152_
					= (i_3151_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_3151_])
					   : 0);
				    int i_3153_ = anInt8829;
				    int i_3154_ = i_3152_ + i_3153_;
				    int i_3155_ = ((i_3152_ & 0xff00ff)
						   + (i_3153_ & 0xff00ff));
				    int i_3156_
					= ((i_3155_ & 0x1000100)
					   + (i_3154_ - i_3155_ & 0x10000));
				    i_3156_ = (i_3154_ - i_3156_
					       | i_3156_ - (i_3156_ >>> 8));
				    if (i_3152_ == 0 && anInt8830 != 255) {
					i_3152_ = i_3156_;
					i_3156_ = is[i_3102_];
					i_3156_ = (((((i_3152_ & 0xff00ff)
						      * anInt8830)
						     + ((i_3156_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_3152_ & 0xff00)
							* anInt8830)
						       + ((i_3156_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3102_] = i_3156_;
				} else if (i == 2) {
				    int i_3157_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3101_]);
				    if (i_3157_ != 0) {
					int i_3158_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3157_ & 0xff]);
					int i_3159_
					    = ((i_3158_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_3160_
					    = ((i_3158_ & 0xff00) * anInt8830
					       & 0xff0000);
					i_3158_ = (((i_3159_ | i_3160_) >>> 8)
						   + anInt8834);
					int i_3161_ = is[i_3102_];
					int i_3162_ = i_3158_ + i_3161_;
					int i_3163_ = ((i_3158_ & 0xff00ff)
						       + (i_3161_ & 0xff00ff));
					i_3161_ = ((i_3163_ & 0x1000100)
						   + (i_3162_ - i_3163_
						      & 0x10000));
					is[i_3102_]
					    = (i_3162_ - i_3161_
					       | i_3161_ - (i_3161_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_3096_ += anInt8822;
			}
		    }
		    i_3094_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else if (anInt8825 < 0) {
		for (int i_3164_ = anInt8816; i_3164_ < 0; i_3164_++) {
		    int i_3165_ = anInt8818;
		    int i_3166_ = anInt8807 + anInt8805;
		    int i_3167_ = anInt8826 + anInt8828;
		    int i_3168_ = anInt8809;
		    if (i_3166_ < 0) {
			int i_3169_ = (anInt8822 - 1 - i_3166_) / anInt8822;
			i_3168_ += i_3169_;
			i_3166_ += anInt8822 * i_3169_;
			i_3167_ += anInt8825 * i_3169_;
			i_3165_ += i_3169_;
		    }
		    int i_3170_;
		    if ((i_3170_
			 = (1 + i_3166_
			    - (((Class151_Sub1_Sub1) this).anInt8803 << 12)
			    - anInt8822) / anInt8822)
			> i_3168_)
			i_3168_ = i_3170_;
		    if ((i_3170_
			 = i_3167_ - (((Class151_Sub1_Sub1) this).anInt8804
				      << 12))
			>= 0) {
			i_3170_ = (anInt8825 - i_3170_) / anInt8825;
			i_3168_ += i_3170_;
			i_3166_ += anInt8822 * i_3170_;
			i_3167_ += anInt8825 * i_3170_;
			i_3165_ += i_3170_;
		    }
		    if ((i_3170_ = (i_3167_ - anInt8825) / anInt8825)
			> i_3168_)
			i_3168_ = i_3170_;
		    for (/**/; i_3168_ < 0; i_3168_++) {
			int i_3171_
			    = (((i_3167_ >> 12)
				* ((Class151_Sub1_Sub1) this).anInt8803)
			       + (i_3166_ >> 12));
			int i_3172_ = i_3165_++;
			if (i_2679_ == 0) {
			    if (i == 1)
				is[i_3172_]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_3171_]) & 0xff]);
			    else if (i == 0) {
				int i_3173_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_3171_]) & 0xff]);
				int i_3174_ = ((i_3173_ & 0xff0000) * anInt8815
					       & ~0xffffff);
				int i_3175_ = ((i_3173_ & 0xff00) * anInt8833
					       & 0xff0000);
				int i_3176_
				    = (i_3173_ & 0xff) * anInt8836 & 0xff00;
				is[i_3172_]
				    = (i_3174_ | i_3175_ | i_3176_) >>> 8;
			    } else if (i == 3) {
				int i_3177_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_3171_]) & 0xff]);
				int i_3178_ = anInt8829;
				int i_3179_ = i_3177_ + i_3178_;
				int i_3180_ = ((i_3177_ & 0xff00ff)
					       + (i_3178_ & 0xff00ff));
				int i_3181_
				    = ((i_3180_ & 0x1000100)
				       + (i_3179_ - i_3180_ & 0x10000));
				is[i_3172_]
				    = i_3179_ - i_3181_ | i_3181_ - (i_3181_
								     >>> 8);
			    } else if (i == 2) {
				int i_3182_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_3171_]) & 0xff]);
				int i_3183_ = ((i_3182_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
				int i_3184_ = ((i_3182_ & 0xff00) * anInt8830
					       & 0xff0000);
				is[i_3172_]
				    = ((i_3183_ | i_3184_) >>> 8) + anInt8834;
			    } else
				throw new IllegalArgumentException();
			} else if (i_2679_ == 1) {
			    if (i == 1) {
				int i_3185_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3171_]);
				if (i_3185_ != 0)
				    is[i_3172_]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_3185_ & 0xff]);
			    } else if (i == 0) {
				int i_3186_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3171_]);
				if (i_3186_ != 0) {
				    int i_3187_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_3186_ & 0xff]);
				    if ((anInt8829 & 0xffffff) == 16777215) {
					int i_3188_ = anInt8829 >>> 24;
					int i_3189_ = 256 - i_3188_;
					int i_3190_ = is[i_3172_];
					is[i_3172_]
					    = ((((i_3187_ & 0xff00ff) * i_3188_
						 + ((i_3190_ & 0xff00ff)
						    * i_3189_))
						& ~0xff00ff)
					       + (((i_3187_ & 0xff00) * i_3188_
						   + ((i_3190_ & 0xff00)
						      * i_3189_))
						  & 0xff0000)) >> 8;
				    } else if (anInt8830 != 255) {
					int i_3191_
					    = ((i_3187_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_3192_
					    = ((i_3187_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_3193_
					    = ((i_3187_ & 0xff) * anInt8836
					       & 0xff00);
					i_3187_ = (i_3191_ | i_3192_
						   | i_3193_) >>> 8;
					int i_3194_ = is[i_3172_];
					is[i_3172_]
					    = (((((i_3187_ & 0xff00ff)
						  * anInt8830)
						 + ((i_3194_ & 0xff00ff)
						    * anInt8831))
						& ~0xff00ff)
					       + ((((i_3187_ & 0xff00)
						    * anInt8830)
						   + ((i_3194_ & 0xff00)
						      * anInt8831))
						  & 0xff0000)) >> 8;
				    } else {
					int i_3195_
					    = ((i_3187_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_3196_
					    = ((i_3187_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_3197_
					    = ((i_3187_ & 0xff) * anInt8836
					       & 0xff00);
					is[i_3172_] = (i_3195_ | i_3196_
						       | i_3197_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_3198_ = (((Class151_Sub1_Sub1) this)
						.aByteArray11258[i_3171_]);
				int i_3199_ = (i_3198_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_3198_])
					       : 0);
				int i_3200_ = anInt8829;
				int i_3201_ = i_3199_ + i_3200_;
				int i_3202_ = ((i_3199_ & 0xff00ff)
					       + (i_3200_ & 0xff00ff));
				int i_3203_
				    = ((i_3202_ & 0x1000100)
				       + (i_3201_ - i_3202_ & 0x10000));
				i_3203_
				    = i_3201_ - i_3203_ | i_3203_ - (i_3203_
								     >>> 8);
				if (i_3199_ == 0 && anInt8830 != 255) {
				    i_3199_ = i_3203_;
				    i_3203_ = is[i_3172_];
				    i_3203_
					= ((((i_3199_ & 0xff00ff) * anInt8830
					     + ((i_3203_ & 0xff00ff)
						* anInt8831))
					    & ~0xff00ff)
					   + (((i_3199_ & 0xff00) * anInt8830
					       + ((i_3203_ & 0xff00)
						  * anInt8831))
					      & 0xff0000)) >> 8;
				}
				is[i_3172_] = i_3203_;
			    } else if (i == 2) {
				int i_3204_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3171_]);
				if (i_3204_ != 0) {
				    int i_3205_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_3204_ & 0xff]);
				    int i_3206_
					= ((i_3205_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_3207_
					= ((i_3205_ & 0xff00) * anInt8830
					   & 0xff0000);
				    is[i_3172_++] = ((i_3206_ | i_3207_)
						     >>> 8) + anInt8834;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_2679_ == 2) {
			    if (i == 1) {
				int i_3208_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3171_]);
				if (i_3208_ != 0) {
				    int i_3209_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_3208_ & 0xff]);
				    int i_3210_ = is[i_3172_];
				    int i_3211_ = i_3209_ + i_3210_;
				    int i_3212_ = ((i_3209_ & 0xff00ff)
						   + (i_3210_ & 0xff00ff));
				    i_3210_
					= ((i_3212_ & 0x1000100)
					   + (i_3211_ - i_3212_ & 0x10000));
				    is[i_3172_]
					= (i_3211_ - i_3210_
					   | i_3210_ - (i_3210_ >>> 8));
				}
			    } else if (i == 0) {
				int i_3213_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3171_]);
				if (i_3213_ != 0) {
				    int i_3214_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_3213_ & 0xff]);
				    int i_3215_
					= ((i_3214_ & 0xff0000) * anInt8815
					   & ~0xffffff);
				    int i_3216_
					= ((i_3214_ & 0xff00) * anInt8833
					   & 0xff0000);
				    int i_3217_ = ((i_3214_ & 0xff) * anInt8836
						   & 0xff00);
				    i_3214_
					= (i_3215_ | i_3216_ | i_3217_) >>> 8;
				    int i_3218_ = is[i_3172_];
				    int i_3219_ = i_3214_ + i_3218_;
				    int i_3220_ = ((i_3214_ & 0xff00ff)
						   + (i_3218_ & 0xff00ff));
				    i_3218_
					= ((i_3220_ & 0x1000100)
					   + (i_3219_ - i_3220_ & 0x10000));
				    is[i_3172_]
					= (i_3219_ - i_3218_
					   | i_3218_ - (i_3218_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_3221_ = (((Class151_Sub1_Sub1) this)
						.aByteArray11258[i_3171_]);
				int i_3222_ = (i_3221_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_3221_])
					       : 0);
				int i_3223_ = anInt8829;
				int i_3224_ = i_3222_ + i_3223_;
				int i_3225_ = ((i_3222_ & 0xff00ff)
					       + (i_3223_ & 0xff00ff));
				int i_3226_
				    = ((i_3225_ & 0x1000100)
				       + (i_3224_ - i_3225_ & 0x10000));
				i_3226_
				    = i_3224_ - i_3226_ | i_3226_ - (i_3226_
								     >>> 8);
				if (i_3222_ == 0 && anInt8830 != 255) {
				    i_3222_ = i_3226_;
				    i_3226_ = is[i_3172_];
				    i_3226_
					= ((((i_3222_ & 0xff00ff) * anInt8830
					     + ((i_3226_ & 0xff00ff)
						* anInt8831))
					    & ~0xff00ff)
					   + (((i_3222_ & 0xff00) * anInt8830
					       + ((i_3226_ & 0xff00)
						  * anInt8831))
					      & 0xff0000)) >> 8;
				}
				is[i_3172_] = i_3226_;
			    } else if (i == 2) {
				int i_3227_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3171_]);
				if (i_3227_ != 0) {
				    int i_3228_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_3227_ & 0xff]);
				    int i_3229_
					= ((i_3228_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_3230_
					= ((i_3228_ & 0xff00) * anInt8830
					   & 0xff0000);
				    i_3228_ = (((i_3229_ | i_3230_) >>> 8)
					       + anInt8834);
				    int i_3231_ = is[i_3172_];
				    int i_3232_ = i_3228_ + i_3231_;
				    int i_3233_ = ((i_3228_ & 0xff00ff)
						   + (i_3231_ & 0xff00ff));
				    i_3231_
					= ((i_3233_ & 0x1000100)
					   + (i_3232_ - i_3233_ & 0x10000));
				    is[i_3172_]
					= (i_3232_ - i_3231_
					   | i_3231_ - (i_3231_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_3166_ += anInt8822;
			i_3167_ += anInt8825;
		    }
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else {
		for (int i_3234_ = anInt8816; i_3234_ < 0; i_3234_++) {
		    int i_3235_ = anInt8818;
		    int i_3236_ = anInt8807 + anInt8805;
		    int i_3237_ = anInt8826 + anInt8828;
		    int i_3238_ = anInt8809;
		    if (i_3236_ < 0) {
			int i_3239_ = (anInt8822 - 1 - i_3236_) / anInt8822;
			i_3238_ += i_3239_;
			i_3236_ += anInt8822 * i_3239_;
			i_3237_ += anInt8825 * i_3239_;
			i_3235_ += i_3239_;
		    }
		    int i_3240_;
		    if ((i_3240_
			 = (1 + i_3236_
			    - (((Class151_Sub1_Sub1) this).anInt8803 << 12)
			    - anInt8822) / anInt8822)
			> i_3238_)
			i_3238_ = i_3240_;
		    if (i_3237_ < 0) {
			i_3240_ = (anInt8825 - 1 - i_3237_) / anInt8825;
			i_3238_ += i_3240_;
			i_3236_ += anInt8822 * i_3240_;
			i_3237_ += anInt8825 * i_3240_;
			i_3235_ += i_3240_;
		    }
		    if ((i_3240_
			 = (1 + i_3237_
			    - (((Class151_Sub1_Sub1) this).anInt8804 << 12)
			    - anInt8825) / anInt8825)
			> i_3238_)
			i_3238_ = i_3240_;
		    for (/**/; i_3238_ < 0; i_3238_++) {
			int i_3241_
			    = (((i_3237_ >> 12)
				* ((Class151_Sub1_Sub1) this).anInt8803)
			       + (i_3236_ >> 12));
			int i_3242_ = i_3235_++;
			if (i_2679_ == 0) {
			    if (i == 1)
				is[i_3242_]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_3241_]) & 0xff]);
			    else if (i == 0) {
				int i_3243_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_3241_]) & 0xff]);
				int i_3244_ = ((i_3243_ & 0xff0000) * anInt8815
					       & ~0xffffff);
				int i_3245_ = ((i_3243_ & 0xff00) * anInt8833
					       & 0xff0000);
				int i_3246_
				    = (i_3243_ & 0xff) * anInt8836 & 0xff00;
				is[i_3242_]
				    = (i_3244_ | i_3245_ | i_3246_) >>> 8;
			    } else if (i == 3) {
				int i_3247_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_3241_]) & 0xff]);
				int i_3248_ = anInt8829;
				int i_3249_ = i_3247_ + i_3248_;
				int i_3250_ = ((i_3247_ & 0xff00ff)
					       + (i_3248_ & 0xff00ff));
				int i_3251_
				    = ((i_3250_ & 0x1000100)
				       + (i_3249_ - i_3250_ & 0x10000));
				is[i_3242_]
				    = i_3249_ - i_3251_ | i_3251_ - (i_3251_
								     >>> 8);
			    } else if (i == 2) {
				int i_3252_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_3241_]) & 0xff]);
				int i_3253_ = ((i_3252_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
				int i_3254_ = ((i_3252_ & 0xff00) * anInt8830
					       & 0xff0000);
				is[i_3242_]
				    = ((i_3253_ | i_3254_) >>> 8) + anInt8834;
			    } else
				throw new IllegalArgumentException();
			} else if (i_2679_ == 1) {
			    if (i == 1) {
				int i_3255_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3241_]);
				if (i_3255_ != 0)
				    is[i_3242_]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_3255_ & 0xff]);
			    } else if (i == 0) {
				int i_3256_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3241_]);
				if (i_3256_ != 0) {
				    int i_3257_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_3256_ & 0xff]);
				    if ((anInt8829 & 0xffffff) == 16777215) {
					int i_3258_ = anInt8829 >>> 24;
					int i_3259_ = 256 - i_3258_;
					int i_3260_ = is[i_3242_];
					is[i_3242_]
					    = ((((i_3257_ & 0xff00ff) * i_3258_
						 + ((i_3260_ & 0xff00ff)
						    * i_3259_))
						& ~0xff00ff)
					       + (((i_3257_ & 0xff00) * i_3258_
						   + ((i_3260_ & 0xff00)
						      * i_3259_))
						  & 0xff0000)) >> 8;
				    } else if (anInt8830 != 255) {
					int i_3261_
					    = ((i_3257_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_3262_
					    = ((i_3257_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_3263_
					    = ((i_3257_ & 0xff) * anInt8836
					       & 0xff00);
					i_3257_ = (i_3261_ | i_3262_
						   | i_3263_) >>> 8;
					int i_3264_ = is[i_3242_];
					is[i_3242_]
					    = (((((i_3257_ & 0xff00ff)
						  * anInt8830)
						 + ((i_3264_ & 0xff00ff)
						    * anInt8831))
						& ~0xff00ff)
					       + ((((i_3257_ & 0xff00)
						    * anInt8830)
						   + ((i_3264_ & 0xff00)
						      * anInt8831))
						  & 0xff0000)) >> 8;
				    } else {
					int i_3265_
					    = ((i_3257_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_3266_
					    = ((i_3257_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_3267_
					    = ((i_3257_ & 0xff) * anInt8836
					       & 0xff00);
					is[i_3242_] = (i_3265_ | i_3266_
						       | i_3267_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_3268_ = (((Class151_Sub1_Sub1) this)
						.aByteArray11258[i_3241_]);
				int i_3269_ = (i_3268_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_3268_])
					       : 0);
				int i_3270_ = anInt8829;
				int i_3271_ = i_3269_ + i_3270_;
				int i_3272_ = ((i_3269_ & 0xff00ff)
					       + (i_3270_ & 0xff00ff));
				int i_3273_
				    = ((i_3272_ & 0x1000100)
				       + (i_3271_ - i_3272_ & 0x10000));
				i_3273_
				    = i_3271_ - i_3273_ | i_3273_ - (i_3273_
								     >>> 8);
				if (i_3269_ == 0 && anInt8830 != 255) {
				    i_3269_ = i_3273_;
				    i_3273_ = is[i_3242_];
				    i_3273_
					= ((((i_3269_ & 0xff00ff) * anInt8830
					     + ((i_3273_ & 0xff00ff)
						* anInt8831))
					    & ~0xff00ff)
					   + (((i_3269_ & 0xff00) * anInt8830
					       + ((i_3273_ & 0xff00)
						  * anInt8831))
					      & 0xff0000)) >> 8;
				}
				is[i_3242_] = i_3273_;
			    } else if (i == 2) {
				int i_3274_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3241_]);
				if (i_3274_ != 0) {
				    int i_3275_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_3274_ & 0xff]);
				    int i_3276_
					= ((i_3275_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_3277_
					= ((i_3275_ & 0xff00) * anInt8830
					   & 0xff0000);
				    is[i_3242_++] = ((i_3276_ | i_3277_)
						     >>> 8) + anInt8834;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_2679_ == 2) {
			    if (i == 1) {
				int i_3278_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3241_]);
				if (i_3278_ != 0) {
				    int i_3279_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_3278_ & 0xff]);
				    int i_3280_ = is[i_3242_];
				    int i_3281_ = i_3279_ + i_3280_;
				    int i_3282_ = ((i_3279_ & 0xff00ff)
						   + (i_3280_ & 0xff00ff));
				    i_3280_
					= ((i_3282_ & 0x1000100)
					   + (i_3281_ - i_3282_ & 0x10000));
				    is[i_3242_]
					= (i_3281_ - i_3280_
					   | i_3280_ - (i_3280_ >>> 8));
				}
			    } else if (i == 0) {
				int i_3283_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3241_]);
				if (i_3283_ != 0) {
				    int i_3284_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_3283_ & 0xff]);
				    int i_3285_
					= ((i_3284_ & 0xff0000) * anInt8815
					   & ~0xffffff);
				    int i_3286_
					= ((i_3284_ & 0xff00) * anInt8833
					   & 0xff0000);
				    int i_3287_ = ((i_3284_ & 0xff) * anInt8836
						   & 0xff00);
				    i_3284_
					= (i_3285_ | i_3286_ | i_3287_) >>> 8;
				    int i_3288_ = is[i_3242_];
				    int i_3289_ = i_3284_ + i_3288_;
				    int i_3290_ = ((i_3284_ & 0xff00ff)
						   + (i_3288_ & 0xff00ff));
				    i_3288_
					= ((i_3290_ & 0x1000100)
					   + (i_3289_ - i_3290_ & 0x10000));
				    is[i_3242_]
					= (i_3289_ - i_3288_
					   | i_3288_ - (i_3288_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_3291_ = (((Class151_Sub1_Sub1) this)
						.aByteArray11258[i_3241_]);
				int i_3292_ = (i_3291_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_3291_])
					       : 0);
				int i_3293_ = anInt8829;
				int i_3294_ = i_3292_ + i_3293_;
				int i_3295_ = ((i_3292_ & 0xff00ff)
					       + (i_3293_ & 0xff00ff));
				int i_3296_
				    = ((i_3295_ & 0x1000100)
				       + (i_3294_ - i_3295_ & 0x10000));
				i_3296_
				    = i_3294_ - i_3296_ | i_3296_ - (i_3296_
								     >>> 8);
				if (i_3292_ == 0 && anInt8830 != 255) {
				    i_3292_ = i_3296_;
				    i_3296_ = is[i_3242_];
				    i_3296_
					= ((((i_3292_ & 0xff00ff) * anInt8830
					     + ((i_3296_ & 0xff00ff)
						* anInt8831))
					    & ~0xff00ff)
					   + (((i_3292_ & 0xff00) * anInt8830
					       + ((i_3296_ & 0xff00)
						  * anInt8831))
					      & 0xff0000)) >> 8;
				}
				is[i_3242_] = i_3296_;
			    } else if (i == 2) {
				int i_3297_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3241_]);
				if (i_3297_ != 0) {
				    int i_3298_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_3297_ & 0xff]);
				    int i_3299_
					= ((i_3298_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_3300_
					= ((i_3298_ & 0xff00) * anInt8830
					   & 0xff0000);
				    i_3298_ = (((i_3299_ | i_3300_) >>> 8)
					       + anInt8834);
				    int i_3301_ = is[i_3242_];
				    int i_3302_ = i_3298_ + i_3301_;
				    int i_3303_ = ((i_3298_ & 0xff00ff)
						   + (i_3301_ & 0xff00ff));
				    i_3301_
					= ((i_3303_ & 0x1000100)
					   + (i_3302_ - i_3303_ & 0x10000));
				    is[i_3242_]
					= (i_3302_ - i_3301_
					   | i_3301_ - (i_3301_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_3236_ += anInt8822;
			i_3237_ += anInt8825;
		    }
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    }
	}
    }
    
    void method8295(int i, int i_3304_) {
	int[] is = (((Class173_Sub3)
		     ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
		    .anIntArray9719);
	if (is != null) {
	    if (anInt8822 == 0) {
		if (anInt8825 == 0) {
		    int i_3305_ = anInt8816;
		    while (i_3305_ < 0) {
			int i_3306_ = anInt8818;
			int i_3307_ = anInt8807;
			int i_3308_ = anInt8826;
			int i_3309_ = anInt8809;
			if (i_3307_ >= 0 && i_3308_ >= 0
			    && i_3307_ - (((Class151_Sub1_Sub1) this).anInt8803
					  << 12) < 0
			    && i_3308_ - (((Class151_Sub1_Sub1) this).anInt8804
					  << 12) < 0) {
			    for (/**/; i_3309_ < 0; i_3309_++) {
				int i_3310_
				    = ((i_3308_ >> 12) * ((Class151_Sub1_Sub1)
							  this).anInt8803
				       + (i_3307_ >> 12));
				int i_3311_ = i_3306_++;
				if (i_3304_ == 0) {
				    if (i == 1)
					is[i_3311_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_3310_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_3312_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_3310_])
						 & 0xff)]);
					int i_3313_
					    = ((i_3312_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_3314_
					    = ((i_3312_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_3315_
					    = ((i_3312_ & 0xff) * anInt8836
					       & 0xff00);
					is[i_3311_] = (i_3313_ | i_3314_
						       | i_3315_) >>> 8;
				    } else if (i == 3) {
					int i_3316_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_3310_])
						 & 0xff)]);
					int i_3317_ = anInt8829;
					int i_3318_ = i_3316_ + i_3317_;
					int i_3319_ = ((i_3316_ & 0xff00ff)
						       + (i_3317_ & 0xff00ff));
					int i_3320_ = ((i_3319_ & 0x1000100)
						       + (i_3318_ - i_3319_
							  & 0x10000));
					is[i_3311_]
					    = (i_3318_ - i_3320_
					       | i_3320_ - (i_3320_ >>> 8));
				    } else if (i == 2) {
					int i_3321_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_3310_])
						 & 0xff)]);
					int i_3322_
					    = ((i_3321_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_3323_
					    = ((i_3321_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_3311_] = ((i_3322_ | i_3323_)
						       >>> 8) + anInt8834;
				    } else
					throw new IllegalArgumentException();
				} else if (i_3304_ == 1) {
				    if (i == 1) {
					int i_3324_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3310_]);
					if (i_3324_ != 0)
					    is[i_3311_]
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_3324_ & 0xff]);
				    } else if (i == 0) {
					int i_3325_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3310_]);
					if (i_3325_ != 0) {
					    int i_3326_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_3325_ & 0xff]);
					    if ((anInt8829 & 0xffffff)
						== 16777215) {
						int i_3327_ = anInt8829 >>> 24;
						int i_3328_ = 256 - i_3327_;
						int i_3329_ = is[i_3311_];
						is[i_3311_]
						    = (((((i_3326_ & 0xff00ff)
							  * i_3327_)
							 + ((i_3329_
							     & 0xff00ff)
							    * i_3328_))
							& ~0xff00ff)
						       + ((((i_3326_ & 0xff00)
							    * i_3327_)
							   + ((i_3329_
							       & 0xff00)
							      * i_3328_))
							  & 0xff0000)) >> 8;
					    } else if (anInt8830 != 255) {
						int i_3330_
						    = (((i_3326_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_3331_
						    = (((i_3326_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_3332_
						    = (((i_3326_ & 0xff)
							* anInt8836)
						       & 0xff00);
						i_3326_ = (i_3330_ | i_3331_
							   | i_3332_) >>> 8;
						int i_3333_ = is[i_3311_];
						is[i_3311_]
						    = (((((i_3326_ & 0xff00ff)
							  * anInt8830)
							 + ((i_3333_
							     & 0xff00ff)
							    * anInt8831))
							& ~0xff00ff)
						       + ((((i_3326_ & 0xff00)
							    * anInt8830)
							   + ((i_3333_
							       & 0xff00)
							      * anInt8831))
							  & 0xff0000)) >> 8;
					    } else {
						int i_3334_
						    = (((i_3326_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_3335_
						    = (((i_3326_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_3336_
						    = (((i_3326_ & 0xff)
							* anInt8836)
						       & 0xff00);
						is[i_3311_]
						    = (i_3334_ | i_3335_
						       | i_3336_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_3337_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3310_]);
					int i_3338_
					    = (i_3337_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_3337_])
					       : 0);
					int i_3339_ = anInt8829;
					int i_3340_ = i_3338_ + i_3339_;
					int i_3341_ = ((i_3338_ & 0xff00ff)
						       + (i_3339_ & 0xff00ff));
					int i_3342_ = ((i_3341_ & 0x1000100)
						       + (i_3340_ - i_3341_
							  & 0x10000));
					i_3342_
					    = (i_3340_ - i_3342_
					       | i_3342_ - (i_3342_ >>> 8));
					if (i_3338_ == 0 && anInt8830 != 255) {
					    i_3338_ = i_3342_;
					    i_3342_ = is[i_3311_];
					    i_3342_
						= (((((i_3338_ & 0xff00ff)
						      * anInt8830)
						     + ((i_3342_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_3338_ & 0xff00)
							* anInt8830)
						       + ((i_3342_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					}
					is[i_3311_] = i_3342_;
				    } else if (i == 2) {
					int i_3343_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3310_]);
					if (i_3343_ != 0) {
					    int i_3344_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_3343_ & 0xff]);
					    int i_3345_
						= (((i_3344_ & 0xff00ff)
						    * anInt8830)
						   & ~0xff00ff);
					    int i_3346_ = (((i_3344_ & 0xff00)
							    * anInt8830)
							   & 0xff0000);
					    is[i_3311_++]
						= (((i_3345_ | i_3346_) >>> 8)
						   + anInt8834);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_3304_ == 2) {
				    if (i == 1) {
					int i_3347_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3310_]);
					if (i_3347_ != 0) {
					    int i_3348_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_3347_ & 0xff]);
					    int i_3349_ = is[i_3311_];
					    int i_3350_ = i_3348_ + i_3349_;
					    int i_3351_
						= ((i_3348_ & 0xff00ff)
						   + (i_3349_ & 0xff00ff));
					    i_3349_ = ((i_3351_ & 0x1000100)
						       + (i_3350_ - i_3351_
							  & 0x10000));
					    is[i_3311_]
						= (i_3350_ - i_3349_
						   | i_3349_ - (i_3349_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_3352_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3310_]);
					if (i_3352_ != 0) {
					    int i_3353_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_3352_ & 0xff]);
					    int i_3354_
						= (((i_3353_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_3355_ = (((i_3353_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_3356_
						= ((i_3353_ & 0xff) * anInt8836
						   & 0xff00);
					    i_3353_ = (i_3354_ | i_3355_
						       | i_3356_) >>> 8;
					    int i_3357_ = is[i_3311_];
					    int i_3358_ = i_3353_ + i_3357_;
					    int i_3359_
						= ((i_3353_ & 0xff00ff)
						   + (i_3357_ & 0xff00ff));
					    i_3357_ = ((i_3359_ & 0x1000100)
						       + (i_3358_ - i_3359_
							  & 0x10000));
					    is[i_3311_]
						= (i_3358_ - i_3357_
						   | i_3357_ - (i_3357_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_3360_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3310_]);
					int i_3361_
					    = (i_3360_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_3360_])
					       : 0);
					int i_3362_ = anInt8829;
					int i_3363_ = i_3361_ + i_3362_;
					int i_3364_ = ((i_3361_ & 0xff00ff)
						       + (i_3362_ & 0xff00ff));
					int i_3365_ = ((i_3364_ & 0x1000100)
						       + (i_3363_ - i_3364_
							  & 0x10000));
					i_3365_
					    = (i_3363_ - i_3365_
					       | i_3365_ - (i_3365_ >>> 8));
					if (i_3361_ == 0 && anInt8830 != 255) {
					    i_3361_ = i_3365_;
					    i_3365_ = is[i_3311_];
					    i_3365_
						= (((((i_3361_ & 0xff00ff)
						      * anInt8830)
						     + ((i_3365_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_3361_ & 0xff00)
							* anInt8830)
						       + ((i_3365_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					}
					is[i_3311_] = i_3365_;
				    } else if (i == 2) {
					int i_3366_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3310_]);
					if (i_3366_ != 0) {
					    int i_3367_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_3366_ & 0xff]);
					    int i_3368_
						= (((i_3367_ & 0xff00ff)
						    * anInt8830)
						   & ~0xff00ff);
					    int i_3369_ = (((i_3367_ & 0xff00)
							    * anInt8830)
							   & 0xff0000);
					    i_3367_ = ((i_3368_ | i_3369_)
						       >>> 8) + anInt8834;
					    int i_3370_ = is[i_3311_];
					    int i_3371_ = i_3367_ + i_3370_;
					    int i_3372_
						= ((i_3367_ & 0xff00ff)
						   + (i_3370_ & 0xff00ff));
					    i_3370_ = ((i_3372_ & 0x1000100)
						       + (i_3371_ - i_3372_
							  & 0x10000));
					    is[i_3311_]
						= (i_3371_ - i_3370_
						   | i_3370_ - (i_3370_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
			    }
			}
			i_3305_++;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_3373_ = anInt8816;
		    while (i_3373_ < 0) {
			int i_3374_ = anInt8818;
			int i_3375_ = anInt8807;
			int i_3376_ = anInt8826 + anInt8828;
			int i_3377_ = anInt8809;
			if (i_3375_ >= 0
			    && i_3375_ - (((Class151_Sub1_Sub1) this).anInt8803
					  << 12) < 0) {
			    int i_3378_;
			    if ((i_3378_
				 = (i_3376_
				    - (((Class151_Sub1_Sub1) this).anInt8804
				       << 12)))
				>= 0) {
				i_3378_ = (anInt8825 - i_3378_) / anInt8825;
				i_3377_ += i_3378_;
				i_3376_ += anInt8825 * i_3378_;
				i_3374_ += i_3378_;
			    }
			    if ((i_3378_ = (i_3376_ - anInt8825) / anInt8825)
				> i_3377_)
				i_3377_ = i_3378_;
			    for (/**/; i_3377_ < 0; i_3377_++) {
				int i_3379_
				    = ((i_3376_ >> 12) * ((Class151_Sub1_Sub1)
							  this).anInt8803
				       + (i_3375_ >> 12));
				int i_3380_ = i_3374_++;
				if (i_3304_ == 0) {
				    if (i == 1)
					is[i_3380_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_3379_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_3381_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_3379_])
						 & 0xff)]);
					int i_3382_
					    = ((i_3381_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_3383_
					    = ((i_3381_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_3384_
					    = ((i_3381_ & 0xff) * anInt8836
					       & 0xff00);
					is[i_3380_] = (i_3382_ | i_3383_
						       | i_3384_) >>> 8;
				    } else if (i == 3) {
					int i_3385_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_3379_])
						 & 0xff)]);
					int i_3386_ = anInt8829;
					int i_3387_ = i_3385_ + i_3386_;
					int i_3388_ = ((i_3385_ & 0xff00ff)
						       + (i_3386_ & 0xff00ff));
					int i_3389_ = ((i_3388_ & 0x1000100)
						       + (i_3387_ - i_3388_
							  & 0x10000));
					is[i_3380_]
					    = (i_3387_ - i_3389_
					       | i_3389_ - (i_3389_ >>> 8));
				    } else if (i == 2) {
					int i_3390_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_3379_])
						 & 0xff)]);
					int i_3391_
					    = ((i_3390_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_3392_
					    = ((i_3390_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_3380_] = ((i_3391_ | i_3392_)
						       >>> 8) + anInt8834;
				    } else
					throw new IllegalArgumentException();
				} else if (i_3304_ == 1) {
				    if (i == 1) {
					int i_3393_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3379_]);
					if (i_3393_ != 0)
					    is[i_3380_]
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_3393_ & 0xff]);
				    } else if (i == 0) {
					int i_3394_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3379_]);
					if (i_3394_ != 0) {
					    int i_3395_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_3394_ & 0xff]);
					    if ((anInt8829 & 0xffffff)
						== 16777215) {
						int i_3396_ = anInt8829 >>> 24;
						int i_3397_ = 256 - i_3396_;
						int i_3398_ = is[i_3380_];
						is[i_3380_]
						    = (((((i_3395_ & 0xff00ff)
							  * i_3396_)
							 + ((i_3398_
							     & 0xff00ff)
							    * i_3397_))
							& ~0xff00ff)
						       + ((((i_3395_ & 0xff00)
							    * i_3396_)
							   + ((i_3398_
							       & 0xff00)
							      * i_3397_))
							  & 0xff0000)) >> 8;
					    } else if (anInt8830 != 255) {
						int i_3399_
						    = (((i_3395_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_3400_
						    = (((i_3395_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_3401_
						    = (((i_3395_ & 0xff)
							* anInt8836)
						       & 0xff00);
						i_3395_ = (i_3399_ | i_3400_
							   | i_3401_) >>> 8;
						int i_3402_ = is[i_3380_];
						is[i_3380_]
						    = (((((i_3395_ & 0xff00ff)
							  * anInt8830)
							 + ((i_3402_
							     & 0xff00ff)
							    * anInt8831))
							& ~0xff00ff)
						       + ((((i_3395_ & 0xff00)
							    * anInt8830)
							   + ((i_3402_
							       & 0xff00)
							      * anInt8831))
							  & 0xff0000)) >> 8;
					    } else {
						int i_3403_
						    = (((i_3395_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_3404_
						    = (((i_3395_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_3405_
						    = (((i_3395_ & 0xff)
							* anInt8836)
						       & 0xff00);
						is[i_3380_]
						    = (i_3403_ | i_3404_
						       | i_3405_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_3406_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3379_]);
					int i_3407_
					    = (i_3406_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_3406_])
					       : 0);
					int i_3408_ = anInt8829;
					int i_3409_ = i_3407_ + i_3408_;
					int i_3410_ = ((i_3407_ & 0xff00ff)
						       + (i_3408_ & 0xff00ff));
					int i_3411_ = ((i_3410_ & 0x1000100)
						       + (i_3409_ - i_3410_
							  & 0x10000));
					i_3411_
					    = (i_3409_ - i_3411_
					       | i_3411_ - (i_3411_ >>> 8));
					if (i_3407_ == 0 && anInt8830 != 255) {
					    i_3407_ = i_3411_;
					    i_3411_ = is[i_3380_];
					    i_3411_
						= (((((i_3407_ & 0xff00ff)
						      * anInt8830)
						     + ((i_3411_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_3407_ & 0xff00)
							* anInt8830)
						       + ((i_3411_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					}
					is[i_3380_] = i_3411_;
				    } else if (i == 2) {
					int i_3412_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3379_]);
					if (i_3412_ != 0) {
					    int i_3413_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_3412_ & 0xff]);
					    int i_3414_
						= (((i_3413_ & 0xff00ff)
						    * anInt8830)
						   & ~0xff00ff);
					    int i_3415_ = (((i_3413_ & 0xff00)
							    * anInt8830)
							   & 0xff0000);
					    is[i_3380_++]
						= (((i_3414_ | i_3415_) >>> 8)
						   + anInt8834);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_3304_ == 2) {
				    if (i == 1) {
					int i_3416_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3379_]);
					if (i_3416_ != 0) {
					    int i_3417_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_3416_ & 0xff]);
					    int i_3418_ = is[i_3380_];
					    int i_3419_ = i_3417_ + i_3418_;
					    int i_3420_
						= ((i_3417_ & 0xff00ff)
						   + (i_3418_ & 0xff00ff));
					    i_3418_ = ((i_3420_ & 0x1000100)
						       + (i_3419_ - i_3420_
							  & 0x10000));
					    is[i_3380_]
						= (i_3419_ - i_3418_
						   | i_3418_ - (i_3418_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_3421_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3379_]);
					if (i_3421_ != 0) {
					    int i_3422_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_3421_ & 0xff]);
					    int i_3423_
						= (((i_3422_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_3424_ = (((i_3422_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_3425_
						= ((i_3422_ & 0xff) * anInt8836
						   & 0xff00);
					    i_3422_ = (i_3423_ | i_3424_
						       | i_3425_) >>> 8;
					    int i_3426_ = is[i_3380_];
					    int i_3427_ = i_3422_ + i_3426_;
					    int i_3428_
						= ((i_3422_ & 0xff00ff)
						   + (i_3426_ & 0xff00ff));
					    i_3426_ = ((i_3428_ & 0x1000100)
						       + (i_3427_ - i_3428_
							  & 0x10000));
					    is[i_3380_]
						= (i_3427_ - i_3426_
						   | i_3426_ - (i_3426_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_3429_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3379_]);
					int i_3430_
					    = (i_3429_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_3429_])
					       : 0);
					int i_3431_ = anInt8829;
					int i_3432_ = i_3430_ + i_3431_;
					int i_3433_ = ((i_3430_ & 0xff00ff)
						       + (i_3431_ & 0xff00ff));
					int i_3434_ = ((i_3433_ & 0x1000100)
						       + (i_3432_ - i_3433_
							  & 0x10000));
					i_3434_
					    = (i_3432_ - i_3434_
					       | i_3434_ - (i_3434_ >>> 8));
					if (i_3430_ == 0 && anInt8830 != 255) {
					    i_3430_ = i_3434_;
					    i_3434_ = is[i_3380_];
					    i_3434_
						= (((((i_3430_ & 0xff00ff)
						      * anInt8830)
						     + ((i_3434_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_3430_ & 0xff00)
							* anInt8830)
						       + ((i_3434_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					}
					is[i_3380_] = i_3434_;
				    } else if (i == 2) {
					int i_3435_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3379_]);
					if (i_3435_ != 0) {
					    int i_3436_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_3435_ & 0xff]);
					    int i_3437_
						= (((i_3436_ & 0xff00ff)
						    * anInt8830)
						   & ~0xff00ff);
					    int i_3438_ = (((i_3436_ & 0xff00)
							    * anInt8830)
							   & 0xff0000);
					    i_3436_ = ((i_3437_ | i_3438_)
						       >>> 8) + anInt8834;
					    int i_3439_ = is[i_3380_];
					    int i_3440_ = i_3436_ + i_3439_;
					    int i_3441_
						= ((i_3436_ & 0xff00ff)
						   + (i_3439_ & 0xff00ff));
					    i_3439_ = ((i_3441_ & 0x1000100)
						       + (i_3440_ - i_3441_
							  & 0x10000));
					    is[i_3380_]
						= (i_3440_ - i_3439_
						   | i_3439_ - (i_3439_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_3376_ += anInt8825;
			    }
			}
			i_3373_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_3442_ = anInt8816;
		    while (i_3442_ < 0) {
			int i_3443_ = anInt8818;
			int i_3444_ = anInt8807;
			int i_3445_ = anInt8826 + anInt8828;
			int i_3446_ = anInt8809;
			if (i_3444_ >= 0
			    && i_3444_ - (((Class151_Sub1_Sub1) this).anInt8803
					  << 12) < 0) {
			    if (i_3445_ < 0) {
				int i_3447_
				    = (anInt8825 - 1 - i_3445_) / anInt8825;
				i_3446_ += i_3447_;
				i_3445_ += anInt8825 * i_3447_;
				i_3443_ += i_3447_;
			    }
			    int i_3448_;
			    if ((i_3448_
				 = (1 + i_3445_
				    - (((Class151_Sub1_Sub1) this).anInt8804
				       << 12)
				    - anInt8825) / anInt8825)
				> i_3446_)
				i_3446_ = i_3448_;
			    for (/**/; i_3446_ < 0; i_3446_++) {
				int i_3449_
				    = ((i_3445_ >> 12) * ((Class151_Sub1_Sub1)
							  this).anInt8803
				       + (i_3444_ >> 12));
				int i_3450_ = i_3443_++;
				if (i_3304_ == 0) {
				    if (i == 1)
					is[i_3450_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_3449_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_3451_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_3449_])
						 & 0xff)]);
					int i_3452_
					    = ((i_3451_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_3453_
					    = ((i_3451_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_3454_
					    = ((i_3451_ & 0xff) * anInt8836
					       & 0xff00);
					is[i_3450_] = (i_3452_ | i_3453_
						       | i_3454_) >>> 8;
				    } else if (i == 3) {
					int i_3455_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_3449_])
						 & 0xff)]);
					int i_3456_ = anInt8829;
					int i_3457_ = i_3455_ + i_3456_;
					int i_3458_ = ((i_3455_ & 0xff00ff)
						       + (i_3456_ & 0xff00ff));
					int i_3459_ = ((i_3458_ & 0x1000100)
						       + (i_3457_ - i_3458_
							  & 0x10000));
					is[i_3450_]
					    = (i_3457_ - i_3459_
					       | i_3459_ - (i_3459_ >>> 8));
				    } else if (i == 2) {
					int i_3460_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_3449_])
						 & 0xff)]);
					int i_3461_
					    = ((i_3460_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_3462_
					    = ((i_3460_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_3450_] = ((i_3461_ | i_3462_)
						       >>> 8) + anInt8834;
				    } else
					throw new IllegalArgumentException();
				} else if (i_3304_ == 1) {
				    if (i == 1) {
					int i_3463_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3449_]);
					if (i_3463_ != 0)
					    is[i_3450_]
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_3463_ & 0xff]);
				    } else if (i == 0) {
					int i_3464_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3449_]);
					if (i_3464_ != 0) {
					    int i_3465_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_3464_ & 0xff]);
					    if ((anInt8829 & 0xffffff)
						== 16777215) {
						int i_3466_ = anInt8829 >>> 24;
						int i_3467_ = 256 - i_3466_;
						int i_3468_ = is[i_3450_];
						is[i_3450_]
						    = (((((i_3465_ & 0xff00ff)
							  * i_3466_)
							 + ((i_3468_
							     & 0xff00ff)
							    * i_3467_))
							& ~0xff00ff)
						       + ((((i_3465_ & 0xff00)
							    * i_3466_)
							   + ((i_3468_
							       & 0xff00)
							      * i_3467_))
							  & 0xff0000)) >> 8;
					    } else if (anInt8830 != 255) {
						int i_3469_
						    = (((i_3465_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_3470_
						    = (((i_3465_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_3471_
						    = (((i_3465_ & 0xff)
							* anInt8836)
						       & 0xff00);
						i_3465_ = (i_3469_ | i_3470_
							   | i_3471_) >>> 8;
						int i_3472_ = is[i_3450_];
						is[i_3450_]
						    = (((((i_3465_ & 0xff00ff)
							  * anInt8830)
							 + ((i_3472_
							     & 0xff00ff)
							    * anInt8831))
							& ~0xff00ff)
						       + ((((i_3465_ & 0xff00)
							    * anInt8830)
							   + ((i_3472_
							       & 0xff00)
							      * anInt8831))
							  & 0xff0000)) >> 8;
					    } else {
						int i_3473_
						    = (((i_3465_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_3474_
						    = (((i_3465_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_3475_
						    = (((i_3465_ & 0xff)
							* anInt8836)
						       & 0xff00);
						is[i_3450_]
						    = (i_3473_ | i_3474_
						       | i_3475_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_3476_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3449_]);
					int i_3477_
					    = (i_3476_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_3476_])
					       : 0);
					int i_3478_ = anInt8829;
					int i_3479_ = i_3477_ + i_3478_;
					int i_3480_ = ((i_3477_ & 0xff00ff)
						       + (i_3478_ & 0xff00ff));
					int i_3481_ = ((i_3480_ & 0x1000100)
						       + (i_3479_ - i_3480_
							  & 0x10000));
					i_3481_
					    = (i_3479_ - i_3481_
					       | i_3481_ - (i_3481_ >>> 8));
					if (i_3477_ == 0 && anInt8830 != 255) {
					    i_3477_ = i_3481_;
					    i_3481_ = is[i_3450_];
					    i_3481_
						= (((((i_3477_ & 0xff00ff)
						      * anInt8830)
						     + ((i_3481_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_3477_ & 0xff00)
							* anInt8830)
						       + ((i_3481_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					}
					is[i_3450_] = i_3481_;
				    } else if (i == 2) {
					int i_3482_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3449_]);
					if (i_3482_ != 0) {
					    int i_3483_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_3482_ & 0xff]);
					    int i_3484_
						= (((i_3483_ & 0xff00ff)
						    * anInt8830)
						   & ~0xff00ff);
					    int i_3485_ = (((i_3483_ & 0xff00)
							    * anInt8830)
							   & 0xff0000);
					    is[i_3450_++]
						= (((i_3484_ | i_3485_) >>> 8)
						   + anInt8834);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_3304_ == 2) {
				    if (i == 1) {
					int i_3486_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3449_]);
					if (i_3486_ != 0) {
					    int i_3487_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_3486_ & 0xff]);
					    int i_3488_ = is[i_3450_];
					    int i_3489_ = i_3487_ + i_3488_;
					    int i_3490_
						= ((i_3487_ & 0xff00ff)
						   + (i_3488_ & 0xff00ff));
					    i_3488_ = ((i_3490_ & 0x1000100)
						       + (i_3489_ - i_3490_
							  & 0x10000));
					    is[i_3450_]
						= (i_3489_ - i_3488_
						   | i_3488_ - (i_3488_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_3491_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3449_]);
					if (i_3491_ != 0) {
					    int i_3492_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_3491_ & 0xff]);
					    int i_3493_
						= (((i_3492_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_3494_ = (((i_3492_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_3495_
						= ((i_3492_ & 0xff) * anInt8836
						   & 0xff00);
					    i_3492_ = (i_3493_ | i_3494_
						       | i_3495_) >>> 8;
					    int i_3496_ = is[i_3450_];
					    int i_3497_ = i_3492_ + i_3496_;
					    int i_3498_
						= ((i_3492_ & 0xff00ff)
						   + (i_3496_ & 0xff00ff));
					    i_3496_ = ((i_3498_ & 0x1000100)
						       + (i_3497_ - i_3498_
							  & 0x10000));
					    is[i_3450_]
						= (i_3497_ - i_3496_
						   | i_3496_ - (i_3496_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_3499_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3449_]);
					int i_3500_
					    = (i_3499_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_3499_])
					       : 0);
					int i_3501_ = anInt8829;
					int i_3502_ = i_3500_ + i_3501_;
					int i_3503_ = ((i_3500_ & 0xff00ff)
						       + (i_3501_ & 0xff00ff));
					int i_3504_ = ((i_3503_ & 0x1000100)
						       + (i_3502_ - i_3503_
							  & 0x10000));
					i_3504_
					    = (i_3502_ - i_3504_
					       | i_3504_ - (i_3504_ >>> 8));
					if (i_3500_ == 0 && anInt8830 != 255) {
					    i_3500_ = i_3504_;
					    i_3504_ = is[i_3450_];
					    i_3504_
						= (((((i_3500_ & 0xff00ff)
						      * anInt8830)
						     + ((i_3504_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_3500_ & 0xff00)
							* anInt8830)
						       + ((i_3504_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					}
					is[i_3450_] = i_3504_;
				    } else if (i == 2) {
					int i_3505_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3449_]);
					if (i_3505_ != 0) {
					    int i_3506_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_3505_ & 0xff]);
					    int i_3507_
						= (((i_3506_ & 0xff00ff)
						    * anInt8830)
						   & ~0xff00ff);
					    int i_3508_ = (((i_3506_ & 0xff00)
							    * anInt8830)
							   & 0xff0000);
					    i_3506_ = ((i_3507_ | i_3508_)
						       >>> 8) + anInt8834;
					    int i_3509_ = is[i_3450_];
					    int i_3510_ = i_3506_ + i_3509_;
					    int i_3511_
						= ((i_3506_ & 0xff00ff)
						   + (i_3509_ & 0xff00ff));
					    i_3509_ = ((i_3511_ & 0x1000100)
						       + (i_3510_ - i_3511_
							  & 0x10000));
					    is[i_3450_]
						= (i_3510_ - i_3509_
						   | i_3509_ - (i_3509_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_3445_ += anInt8825;
			    }
			}
			i_3442_++;
			anInt8807 += anInt8821;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8822 < 0) {
		if (anInt8825 == 0) {
		    int i_3512_ = anInt8816;
		    while (i_3512_ < 0) {
			int i_3513_ = anInt8818;
			int i_3514_ = anInt8807 + anInt8805;
			int i_3515_ = anInt8826;
			int i_3516_ = anInt8809;
			if (i_3515_ >= 0
			    && i_3515_ - (((Class151_Sub1_Sub1) this).anInt8804
					  << 12) < 0) {
			    int i_3517_;
			    if ((i_3517_
				 = (i_3514_
				    - (((Class151_Sub1_Sub1) this).anInt8803
				       << 12)))
				>= 0) {
				i_3517_ = (anInt8822 - i_3517_) / anInt8822;
				i_3516_ += i_3517_;
				i_3514_ += anInt8822 * i_3517_;
				i_3513_ += i_3517_;
			    }
			    if ((i_3517_ = (i_3514_ - anInt8822) / anInt8822)
				> i_3516_)
				i_3516_ = i_3517_;
			    for (/**/; i_3516_ < 0; i_3516_++) {
				int i_3518_
				    = ((i_3515_ >> 12) * ((Class151_Sub1_Sub1)
							  this).anInt8803
				       + (i_3514_ >> 12));
				int i_3519_ = i_3513_++;
				if (i_3304_ == 0) {
				    if (i == 1)
					is[i_3519_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_3518_])
						 & 0xff)]);
				    else if (i == 0) {
					int i_3520_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_3518_])
						 & 0xff)]);
					int i_3521_
					    = ((i_3520_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_3522_
					    = ((i_3520_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_3523_
					    = ((i_3520_ & 0xff) * anInt8836
					       & 0xff00);
					is[i_3519_] = (i_3521_ | i_3522_
						       | i_3523_) >>> 8;
				    } else if (i == 3) {
					int i_3524_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_3518_])
						 & 0xff)]);
					int i_3525_ = anInt8829;
					int i_3526_ = i_3524_ + i_3525_;
					int i_3527_ = ((i_3524_ & 0xff00ff)
						       + (i_3525_ & 0xff00ff));
					int i_3528_ = ((i_3527_ & 0x1000100)
						       + (i_3526_ - i_3527_
							  & 0x10000));
					is[i_3519_]
					    = (i_3526_ - i_3528_
					       | i_3528_ - (i_3528_ >>> 8));
				    } else if (i == 2) {
					int i_3529_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [((((Class151_Sub1_Sub1) this)
						  .aByteArray11258[i_3518_])
						 & 0xff)]);
					int i_3530_
					    = ((i_3529_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_3531_
					    = ((i_3529_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_3519_] = ((i_3530_ | i_3531_)
						       >>> 8) + anInt8834;
				    } else
					throw new IllegalArgumentException();
				} else if (i_3304_ == 1) {
				    if (i == 1) {
					int i_3532_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3518_]);
					if (i_3532_ != 0)
					    is[i_3519_]
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_3532_ & 0xff]);
				    } else if (i == 0) {
					int i_3533_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3518_]);
					if (i_3533_ != 0) {
					    int i_3534_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_3533_ & 0xff]);
					    if ((anInt8829 & 0xffffff)
						== 16777215) {
						int i_3535_ = anInt8829 >>> 24;
						int i_3536_ = 256 - i_3535_;
						int i_3537_ = is[i_3519_];
						is[i_3519_]
						    = (((((i_3534_ & 0xff00ff)
							  * i_3535_)
							 + ((i_3537_
							     & 0xff00ff)
							    * i_3536_))
							& ~0xff00ff)
						       + ((((i_3534_ & 0xff00)
							    * i_3535_)
							   + ((i_3537_
							       & 0xff00)
							      * i_3536_))
							  & 0xff0000)) >> 8;
					    } else if (anInt8830 != 255) {
						int i_3538_
						    = (((i_3534_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_3539_
						    = (((i_3534_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_3540_
						    = (((i_3534_ & 0xff)
							* anInt8836)
						       & 0xff00);
						i_3534_ = (i_3538_ | i_3539_
							   | i_3540_) >>> 8;
						int i_3541_ = is[i_3519_];
						is[i_3519_]
						    = (((((i_3534_ & 0xff00ff)
							  * anInt8830)
							 + ((i_3541_
							     & 0xff00ff)
							    * anInt8831))
							& ~0xff00ff)
						       + ((((i_3534_ & 0xff00)
							    * anInt8830)
							   + ((i_3541_
							       & 0xff00)
							      * anInt8831))
							  & 0xff0000)) >> 8;
					    } else {
						int i_3542_
						    = (((i_3534_ & 0xff0000)
							* anInt8815)
						       & ~0xffffff);
						int i_3543_
						    = (((i_3534_ & 0xff00)
							* anInt8833)
						       & 0xff0000);
						int i_3544_
						    = (((i_3534_ & 0xff)
							* anInt8836)
						       & 0xff00);
						is[i_3519_]
						    = (i_3542_ | i_3543_
						       | i_3544_) >>> 8;
					    }
					}
				    } else if (i == 3) {
					byte i_3545_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3518_]);
					int i_3546_
					    = (i_3545_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_3545_])
					       : 0);
					int i_3547_ = anInt8829;
					int i_3548_ = i_3546_ + i_3547_;
					int i_3549_ = ((i_3546_ & 0xff00ff)
						       + (i_3547_ & 0xff00ff));
					int i_3550_ = ((i_3549_ & 0x1000100)
						       + (i_3548_ - i_3549_
							  & 0x10000));
					i_3550_
					    = (i_3548_ - i_3550_
					       | i_3550_ - (i_3550_ >>> 8));
					if (i_3546_ == 0 && anInt8830 != 255) {
					    i_3546_ = i_3550_;
					    i_3550_ = is[i_3519_];
					    i_3550_
						= (((((i_3546_ & 0xff00ff)
						      * anInt8830)
						     + ((i_3550_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_3546_ & 0xff00)
							* anInt8830)
						       + ((i_3550_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					}
					is[i_3519_] = i_3550_;
				    } else if (i == 2) {
					int i_3551_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3518_]);
					if (i_3551_ != 0) {
					    int i_3552_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_3551_ & 0xff]);
					    int i_3553_
						= (((i_3552_ & 0xff00ff)
						    * anInt8830)
						   & ~0xff00ff);
					    int i_3554_ = (((i_3552_ & 0xff00)
							    * anInt8830)
							   & 0xff0000);
					    is[i_3519_++]
						= (((i_3553_ | i_3554_) >>> 8)
						   + anInt8834);
					}
				    } else
					throw new IllegalArgumentException();
				} else if (i_3304_ == 2) {
				    if (i == 1) {
					int i_3555_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3518_]);
					if (i_3555_ != 0) {
					    int i_3556_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_3555_ & 0xff]);
					    int i_3557_ = is[i_3519_];
					    int i_3558_ = i_3556_ + i_3557_;
					    int i_3559_
						= ((i_3556_ & 0xff00ff)
						   + (i_3557_ & 0xff00ff));
					    i_3557_ = ((i_3559_ & 0x1000100)
						       + (i_3558_ - i_3559_
							  & 0x10000));
					    is[i_3519_]
						= (i_3558_ - i_3557_
						   | i_3557_ - (i_3557_
								>>> 8));
					}
				    } else if (i == 0) {
					int i_3560_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3518_]);
					if (i_3560_ != 0) {
					    int i_3561_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_3560_ & 0xff]);
					    int i_3562_
						= (((i_3561_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_3563_ = (((i_3561_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_3564_
						= ((i_3561_ & 0xff) * anInt8836
						   & 0xff00);
					    i_3561_ = (i_3562_ | i_3563_
						       | i_3564_) >>> 8;
					    int i_3565_ = is[i_3519_];
					    int i_3566_ = i_3561_ + i_3565_;
					    int i_3567_
						= ((i_3561_ & 0xff00ff)
						   + (i_3565_ & 0xff00ff));
					    i_3565_ = ((i_3567_ & 0x1000100)
						       + (i_3566_ - i_3567_
							  & 0x10000));
					    is[i_3519_]
						= (i_3566_ - i_3565_
						   | i_3565_ - (i_3565_
								>>> 8));
					}
				    } else if (i == 3) {
					byte i_3568_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3518_]);
					int i_3569_
					    = (i_3568_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_3568_])
					       : 0);
					int i_3570_ = anInt8829;
					int i_3571_ = i_3569_ + i_3570_;
					int i_3572_ = ((i_3569_ & 0xff00ff)
						       + (i_3570_ & 0xff00ff));
					int i_3573_ = ((i_3572_ & 0x1000100)
						       + (i_3571_ - i_3572_
							  & 0x10000));
					i_3573_
					    = (i_3571_ - i_3573_
					       | i_3573_ - (i_3573_ >>> 8));
					if (i_3569_ == 0 && anInt8830 != 255) {
					    i_3569_ = i_3573_;
					    i_3573_ = is[i_3519_];
					    i_3573_
						= (((((i_3569_ & 0xff00ff)
						      * anInt8830)
						     + ((i_3573_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_3569_ & 0xff00)
							* anInt8830)
						       + ((i_3573_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					}
					is[i_3519_] = i_3573_;
				    } else if (i == 2) {
					int i_3574_
					    = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3518_]);
					if (i_3574_ != 0) {
					    int i_3575_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_3574_ & 0xff]);
					    int i_3576_
						= (((i_3575_ & 0xff00ff)
						    * anInt8830)
						   & ~0xff00ff);
					    int i_3577_ = (((i_3575_ & 0xff00)
							    * anInt8830)
							   & 0xff0000);
					    i_3575_ = ((i_3576_ | i_3577_)
						       >>> 8) + anInt8834;
					    int i_3578_ = is[i_3519_];
					    int i_3579_ = i_3575_ + i_3578_;
					    int i_3580_
						= ((i_3575_ & 0xff00ff)
						   + (i_3578_ & 0xff00ff));
					    i_3578_ = ((i_3580_ & 0x1000100)
						       + (i_3579_ - i_3580_
							  & 0x10000));
					    is[i_3519_]
						= (i_3579_ - i_3578_
						   | i_3578_ - (i_3578_
								>>> 8));
					}
				    }
				} else
				    throw new IllegalArgumentException();
				i_3514_ += anInt8822;
			    }
			}
			i_3512_++;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else if (anInt8825 < 0) {
		    int i_3581_ = anInt8816;
		    while (i_3581_ < 0) {
			int i_3582_ = anInt8818;
			int i_3583_ = anInt8807 + anInt8805;
			int i_3584_ = anInt8826 + anInt8828;
			int i_3585_ = anInt8809;
			int i_3586_;
			if ((i_3586_
			     = i_3583_ - (((Class151_Sub1_Sub1) this).anInt8803
					  << 12))
			    >= 0) {
			    i_3586_ = (anInt8822 - i_3586_) / anInt8822;
			    i_3585_ += i_3586_;
			    i_3583_ += anInt8822 * i_3586_;
			    i_3584_ += anInt8825 * i_3586_;
			    i_3582_ += i_3586_;
			}
			if ((i_3586_ = (i_3583_ - anInt8822) / anInt8822)
			    > i_3585_)
			    i_3585_ = i_3586_;
			if ((i_3586_
			     = i_3584_ - (((Class151_Sub1_Sub1) this).anInt8804
					  << 12))
			    >= 0) {
			    i_3586_ = (anInt8825 - i_3586_) / anInt8825;
			    i_3585_ += i_3586_;
			    i_3583_ += anInt8822 * i_3586_;
			    i_3584_ += anInt8825 * i_3586_;
			    i_3582_ += i_3586_;
			}
			if ((i_3586_ = (i_3584_ - anInt8825) / anInt8825)
			    > i_3585_)
			    i_3585_ = i_3586_;
			for (/**/; i_3585_ < 0; i_3585_++) {
			    int i_3587_
				= (((i_3584_ >> 12)
				    * ((Class151_Sub1_Sub1) this).anInt8803)
				   + (i_3583_ >> 12));
			    int i_3588_ = i_3582_++;
			    if (i_3304_ == 0) {
				if (i == 1)
				    is[i_3588_]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_3587_])
					     & 0xff)]);
				else if (i == 0) {
				    int i_3589_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_3587_])
					     & 0xff)]);
				    int i_3590_
					= ((i_3589_ & 0xff0000) * anInt8815
					   & ~0xffffff);
				    int i_3591_
					= ((i_3589_ & 0xff00) * anInt8833
					   & 0xff0000);
				    int i_3592_ = ((i_3589_ & 0xff) * anInt8836
						   & 0xff00);
				    is[i_3588_]
					= (i_3590_ | i_3591_ | i_3592_) >>> 8;
				} else if (i == 3) {
				    int i_3593_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_3587_])
					     & 0xff)]);
				    int i_3594_ = anInt8829;
				    int i_3595_ = i_3593_ + i_3594_;
				    int i_3596_ = ((i_3593_ & 0xff00ff)
						   + (i_3594_ & 0xff00ff));
				    int i_3597_
					= ((i_3596_ & 0x1000100)
					   + (i_3595_ - i_3596_ & 0x10000));
				    is[i_3588_]
					= (i_3595_ - i_3597_
					   | i_3597_ - (i_3597_ >>> 8));
				} else if (i == 2) {
				    int i_3598_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_3587_])
					     & 0xff)]);
				    int i_3599_
					= ((i_3598_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_3600_
					= ((i_3598_ & 0xff00) * anInt8830
					   & 0xff0000);
				    is[i_3588_] = (((i_3599_ | i_3600_) >>> 8)
						   + anInt8834);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3304_ == 1) {
				if (i == 1) {
				    int i_3601_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3587_]);
				    if (i_3601_ != 0)
					is[i_3588_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3601_ & 0xff]);
				} else if (i == 0) {
				    int i_3602_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3587_]);
				    if (i_3602_ != 0) {
					int i_3603_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3602_ & 0xff]);
					if ((anInt8829 & 0xffffff)
					    == 16777215) {
					    int i_3604_ = anInt8829 >>> 24;
					    int i_3605_ = 256 - i_3604_;
					    int i_3606_ = is[i_3588_];
					    is[i_3588_]
						= (((((i_3603_ & 0xff00ff)
						      * i_3604_)
						     + ((i_3606_ & 0xff00ff)
							* i_3605_))
						    & ~0xff00ff)
						   + ((((i_3603_ & 0xff00)
							* i_3604_)
						       + ((i_3606_ & 0xff00)
							  * i_3605_))
						      & 0xff0000)) >> 8;
					} else if (anInt8830 != 255) {
					    int i_3607_
						= (((i_3603_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_3608_ = (((i_3603_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_3609_
						= ((i_3603_ & 0xff) * anInt8836
						   & 0xff00);
					    i_3603_ = (i_3607_ | i_3608_
						       | i_3609_) >>> 8;
					    int i_3610_ = is[i_3588_];
					    is[i_3588_]
						= (((((i_3603_ & 0xff00ff)
						      * anInt8830)
						     + ((i_3610_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_3603_ & 0xff00)
							* anInt8830)
						       + ((i_3610_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					} else {
					    int i_3611_
						= (((i_3603_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_3612_ = (((i_3603_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_3613_
						= ((i_3603_ & 0xff) * anInt8836
						   & 0xff00);
					    is[i_3588_] = (i_3611_ | i_3612_
							   | i_3613_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_3614_ = (((Class151_Sub1_Sub1) this)
						    .aByteArray11258[i_3587_]);
				    int i_3615_
					= (i_3614_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_3614_])
					   : 0);
				    int i_3616_ = anInt8829;
				    int i_3617_ = i_3615_ + i_3616_;
				    int i_3618_ = ((i_3615_ & 0xff00ff)
						   + (i_3616_ & 0xff00ff));
				    int i_3619_
					= ((i_3618_ & 0x1000100)
					   + (i_3617_ - i_3618_ & 0x10000));
				    i_3619_ = (i_3617_ - i_3619_
					       | i_3619_ - (i_3619_ >>> 8));
				    if (i_3615_ == 0 && anInt8830 != 255) {
					i_3615_ = i_3619_;
					i_3619_ = is[i_3588_];
					i_3619_ = (((((i_3615_ & 0xff00ff)
						      * anInt8830)
						     + ((i_3619_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_3615_ & 0xff00)
							* anInt8830)
						       + ((i_3619_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3588_] = i_3619_;
				} else if (i == 2) {
				    int i_3620_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3587_]);
				    if (i_3620_ != 0) {
					int i_3621_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3620_ & 0xff]);
					int i_3622_
					    = ((i_3621_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_3623_
					    = ((i_3621_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_3588_++] = ((i_3622_ | i_3623_)
							 >>> 8) + anInt8834;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3304_ == 2) {
				if (i == 1) {
				    int i_3624_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3587_]);
				    if (i_3624_ != 0) {
					int i_3625_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3624_ & 0xff]);
					int i_3626_ = is[i_3588_];
					int i_3627_ = i_3625_ + i_3626_;
					int i_3628_ = ((i_3625_ & 0xff00ff)
						       + (i_3626_ & 0xff00ff));
					i_3626_ = ((i_3628_ & 0x1000100)
						   + (i_3627_ - i_3628_
						      & 0x10000));
					is[i_3588_]
					    = (i_3627_ - i_3626_
					       | i_3626_ - (i_3626_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_3629_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3587_]);
				    if (i_3629_ != 0) {
					int i_3630_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3629_ & 0xff]);
					int i_3631_
					    = ((i_3630_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_3632_
					    = ((i_3630_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_3633_
					    = ((i_3630_ & 0xff) * anInt8836
					       & 0xff00);
					i_3630_ = (i_3631_ | i_3632_
						   | i_3633_) >>> 8;
					int i_3634_ = is[i_3588_];
					int i_3635_ = i_3630_ + i_3634_;
					int i_3636_ = ((i_3630_ & 0xff00ff)
						       + (i_3634_ & 0xff00ff));
					i_3634_ = ((i_3636_ & 0x1000100)
						   + (i_3635_ - i_3636_
						      & 0x10000));
					is[i_3588_]
					    = (i_3635_ - i_3634_
					       | i_3634_ - (i_3634_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_3637_ = (((Class151_Sub1_Sub1) this)
						    .aByteArray11258[i_3587_]);
				    int i_3638_
					= (i_3637_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_3637_])
					   : 0);
				    int i_3639_ = anInt8829;
				    int i_3640_ = i_3638_ + i_3639_;
				    int i_3641_ = ((i_3638_ & 0xff00ff)
						   + (i_3639_ & 0xff00ff));
				    int i_3642_
					= ((i_3641_ & 0x1000100)
					   + (i_3640_ - i_3641_ & 0x10000));
				    i_3642_ = (i_3640_ - i_3642_
					       | i_3642_ - (i_3642_ >>> 8));
				    if (i_3638_ == 0 && anInt8830 != 255) {
					i_3638_ = i_3642_;
					i_3642_ = is[i_3588_];
					i_3642_ = (((((i_3638_ & 0xff00ff)
						      * anInt8830)
						     + ((i_3642_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_3638_ & 0xff00)
							* anInt8830)
						       + ((i_3642_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3588_] = i_3642_;
				} else if (i == 2) {
				    int i_3643_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3587_]);
				    if (i_3643_ != 0) {
					int i_3644_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3643_ & 0xff]);
					int i_3645_
					    = ((i_3644_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_3646_
					    = ((i_3644_ & 0xff00) * anInt8830
					       & 0xff0000);
					i_3644_ = (((i_3645_ | i_3646_) >>> 8)
						   + anInt8834);
					int i_3647_ = is[i_3588_];
					int i_3648_ = i_3644_ + i_3647_;
					int i_3649_ = ((i_3644_ & 0xff00ff)
						       + (i_3647_ & 0xff00ff));
					i_3647_ = ((i_3649_ & 0x1000100)
						   + (i_3648_ - i_3649_
						      & 0x10000));
					is[i_3588_]
					    = (i_3648_ - i_3647_
					       | i_3647_ - (i_3647_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_3583_ += anInt8822;
			    i_3584_ += anInt8825;
			}
			i_3581_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		} else {
		    int i_3650_ = anInt8816;
		    while (i_3650_ < 0) {
			int i_3651_ = anInt8818;
			int i_3652_ = anInt8807 + anInt8805;
			int i_3653_ = anInt8826 + anInt8828;
			int i_3654_ = anInt8809;
			int i_3655_;
			if ((i_3655_
			     = i_3652_ - (((Class151_Sub1_Sub1) this).anInt8803
					  << 12))
			    >= 0) {
			    i_3655_ = (anInt8822 - i_3655_) / anInt8822;
			    i_3654_ += i_3655_;
			    i_3652_ += anInt8822 * i_3655_;
			    i_3653_ += anInt8825 * i_3655_;
			    i_3651_ += i_3655_;
			}
			if ((i_3655_ = (i_3652_ - anInt8822) / anInt8822)
			    > i_3654_)
			    i_3654_ = i_3655_;
			if (i_3653_ < 0) {
			    i_3655_ = (anInt8825 - 1 - i_3653_) / anInt8825;
			    i_3654_ += i_3655_;
			    i_3652_ += anInt8822 * i_3655_;
			    i_3653_ += anInt8825 * i_3655_;
			    i_3651_ += i_3655_;
			}
			if ((i_3655_
			     = (1 + i_3653_
				- (((Class151_Sub1_Sub1) this).anInt8804 << 12)
				- anInt8825) / anInt8825)
			    > i_3654_)
			    i_3654_ = i_3655_;
			for (/**/; i_3654_ < 0; i_3654_++) {
			    int i_3656_
				= (((i_3653_ >> 12)
				    * ((Class151_Sub1_Sub1) this).anInt8803)
				   + (i_3652_ >> 12));
			    int i_3657_ = i_3651_++;
			    if (i_3304_ == 0) {
				if (i == 1)
				    is[i_3657_]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_3656_])
					     & 0xff)]);
				else if (i == 0) {
				    int i_3658_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_3656_])
					     & 0xff)]);
				    int i_3659_
					= ((i_3658_ & 0xff0000) * anInt8815
					   & ~0xffffff);
				    int i_3660_
					= ((i_3658_ & 0xff00) * anInt8833
					   & 0xff0000);
				    int i_3661_ = ((i_3658_ & 0xff) * anInt8836
						   & 0xff00);
				    is[i_3657_]
					= (i_3659_ | i_3660_ | i_3661_) >>> 8;
				} else if (i == 3) {
				    int i_3662_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_3656_])
					     & 0xff)]);
				    int i_3663_ = anInt8829;
				    int i_3664_ = i_3662_ + i_3663_;
				    int i_3665_ = ((i_3662_ & 0xff00ff)
						   + (i_3663_ & 0xff00ff));
				    int i_3666_
					= ((i_3665_ & 0x1000100)
					   + (i_3664_ - i_3665_ & 0x10000));
				    is[i_3657_]
					= (i_3664_ - i_3666_
					   | i_3666_ - (i_3666_ >>> 8));
				} else if (i == 2) {
				    int i_3667_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_3656_])
					     & 0xff)]);
				    int i_3668_
					= ((i_3667_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_3669_
					= ((i_3667_ & 0xff00) * anInt8830
					   & 0xff0000);
				    is[i_3657_] = (((i_3668_ | i_3669_) >>> 8)
						   + anInt8834);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3304_ == 1) {
				if (i == 1) {
				    int i_3670_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3656_]);
				    if (i_3670_ != 0)
					is[i_3657_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3670_ & 0xff]);
				} else if (i == 0) {
				    int i_3671_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3656_]);
				    if (i_3671_ != 0) {
					int i_3672_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3671_ & 0xff]);
					if ((anInt8829 & 0xffffff)
					    == 16777215) {
					    int i_3673_ = anInt8829 >>> 24;
					    int i_3674_ = 256 - i_3673_;
					    int i_3675_ = is[i_3657_];
					    is[i_3657_]
						= (((((i_3672_ & 0xff00ff)
						      * i_3673_)
						     + ((i_3675_ & 0xff00ff)
							* i_3674_))
						    & ~0xff00ff)
						   + ((((i_3672_ & 0xff00)
							* i_3673_)
						       + ((i_3675_ & 0xff00)
							  * i_3674_))
						      & 0xff0000)) >> 8;
					} else if (anInt8830 != 255) {
					    int i_3676_
						= (((i_3672_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_3677_ = (((i_3672_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_3678_
						= ((i_3672_ & 0xff) * anInt8836
						   & 0xff00);
					    i_3672_ = (i_3676_ | i_3677_
						       | i_3678_) >>> 8;
					    int i_3679_ = is[i_3657_];
					    is[i_3657_]
						= (((((i_3672_ & 0xff00ff)
						      * anInt8830)
						     + ((i_3679_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_3672_ & 0xff00)
							* anInt8830)
						       + ((i_3679_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					} else {
					    int i_3680_
						= (((i_3672_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_3681_ = (((i_3672_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_3682_
						= ((i_3672_ & 0xff) * anInt8836
						   & 0xff00);
					    is[i_3657_] = (i_3680_ | i_3681_
							   | i_3682_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_3683_ = (((Class151_Sub1_Sub1) this)
						    .aByteArray11258[i_3656_]);
				    int i_3684_
					= (i_3683_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_3683_])
					   : 0);
				    int i_3685_ = anInt8829;
				    int i_3686_ = i_3684_ + i_3685_;
				    int i_3687_ = ((i_3684_ & 0xff00ff)
						   + (i_3685_ & 0xff00ff));
				    int i_3688_
					= ((i_3687_ & 0x1000100)
					   + (i_3686_ - i_3687_ & 0x10000));
				    i_3688_ = (i_3686_ - i_3688_
					       | i_3688_ - (i_3688_ >>> 8));
				    if (i_3684_ == 0 && anInt8830 != 255) {
					i_3684_ = i_3688_;
					i_3688_ = is[i_3657_];
					i_3688_ = (((((i_3684_ & 0xff00ff)
						      * anInt8830)
						     + ((i_3688_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_3684_ & 0xff00)
							* anInt8830)
						       + ((i_3688_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3657_] = i_3688_;
				} else if (i == 2) {
				    int i_3689_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3656_]);
				    if (i_3689_ != 0) {
					int i_3690_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3689_ & 0xff]);
					int i_3691_
					    = ((i_3690_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_3692_
					    = ((i_3690_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_3657_++] = ((i_3691_ | i_3692_)
							 >>> 8) + anInt8834;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3304_ == 2) {
				if (i == 1) {
				    int i_3693_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3656_]);
				    if (i_3693_ != 0) {
					int i_3694_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3693_ & 0xff]);
					int i_3695_ = is[i_3657_];
					int i_3696_ = i_3694_ + i_3695_;
					int i_3697_ = ((i_3694_ & 0xff00ff)
						       + (i_3695_ & 0xff00ff));
					i_3695_ = ((i_3697_ & 0x1000100)
						   + (i_3696_ - i_3697_
						      & 0x10000));
					is[i_3657_]
					    = (i_3696_ - i_3695_
					       | i_3695_ - (i_3695_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_3698_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3656_]);
				    if (i_3698_ != 0) {
					int i_3699_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3698_ & 0xff]);
					int i_3700_
					    = ((i_3699_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_3701_
					    = ((i_3699_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_3702_
					    = ((i_3699_ & 0xff) * anInt8836
					       & 0xff00);
					i_3699_ = (i_3700_ | i_3701_
						   | i_3702_) >>> 8;
					int i_3703_ = is[i_3657_];
					int i_3704_ = i_3699_ + i_3703_;
					int i_3705_ = ((i_3699_ & 0xff00ff)
						       + (i_3703_ & 0xff00ff));
					i_3703_ = ((i_3705_ & 0x1000100)
						   + (i_3704_ - i_3705_
						      & 0x10000));
					is[i_3657_]
					    = (i_3704_ - i_3703_
					       | i_3703_ - (i_3703_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_3706_ = (((Class151_Sub1_Sub1) this)
						    .aByteArray11258[i_3656_]);
				    int i_3707_
					= (i_3706_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_3706_])
					   : 0);
				    int i_3708_ = anInt8829;
				    int i_3709_ = i_3707_ + i_3708_;
				    int i_3710_ = ((i_3707_ & 0xff00ff)
						   + (i_3708_ & 0xff00ff));
				    int i_3711_
					= ((i_3710_ & 0x1000100)
					   + (i_3709_ - i_3710_ & 0x10000));
				    i_3711_ = (i_3709_ - i_3711_
					       | i_3711_ - (i_3711_ >>> 8));
				    if (i_3707_ == 0 && anInt8830 != 255) {
					i_3707_ = i_3711_;
					i_3711_ = is[i_3657_];
					i_3711_ = (((((i_3707_ & 0xff00ff)
						      * anInt8830)
						     + ((i_3711_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_3707_ & 0xff00)
							* anInt8830)
						       + ((i_3711_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3657_] = i_3711_;
				} else if (i == 2) {
				    int i_3712_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3656_]);
				    if (i_3712_ != 0) {
					int i_3713_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3712_ & 0xff]);
					int i_3714_
					    = ((i_3713_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_3715_
					    = ((i_3713_ & 0xff00) * anInt8830
					       & 0xff0000);
					i_3713_ = (((i_3714_ | i_3715_) >>> 8)
						   + anInt8834);
					int i_3716_ = is[i_3657_];
					int i_3717_ = i_3713_ + i_3716_;
					int i_3718_ = ((i_3713_ & 0xff00ff)
						       + (i_3716_ & 0xff00ff));
					i_3716_ = ((i_3718_ & 0x1000100)
						   + (i_3717_ - i_3718_
						      & 0x10000));
					is[i_3657_]
					    = (i_3717_ - i_3716_
					       | i_3716_ - (i_3716_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_3652_ += anInt8822;
			    i_3653_ += anInt8825;
			}
			i_3650_++;
			anInt8807 += anInt8821;
			anInt8826 += anInt8802;
			anInt8818 += anInt8817;
		    }
		}
	    } else if (anInt8825 == 0) {
		int i_3719_ = anInt8816;
		while (i_3719_ < 0) {
		    int i_3720_ = anInt8818;
		    int i_3721_ = anInt8807 + anInt8805;
		    int i_3722_ = anInt8826;
		    int i_3723_ = anInt8809;
		    if (i_3722_ >= 0
			&& i_3722_ - (((Class151_Sub1_Sub1) this).anInt8804
				      << 12) < 0) {
			if (i_3721_ < 0) {
			    int i_3724_
				= (anInt8822 - 1 - i_3721_) / anInt8822;
			    i_3723_ += i_3724_;
			    i_3721_ += anInt8822 * i_3724_;
			    i_3720_ += i_3724_;
			}
			int i_3725_;
			if ((i_3725_
			     = (1 + i_3721_
				- (((Class151_Sub1_Sub1) this).anInt8803 << 12)
				- anInt8822) / anInt8822)
			    > i_3723_)
			    i_3723_ = i_3725_;
			for (/**/; i_3723_ < 0; i_3723_++) {
			    int i_3726_
				= (((i_3722_ >> 12)
				    * ((Class151_Sub1_Sub1) this).anInt8803)
				   + (i_3721_ >> 12));
			    int i_3727_ = i_3720_++;
			    if (i_3304_ == 0) {
				if (i == 1)
				    is[i_3727_]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_3726_])
					     & 0xff)]);
				else if (i == 0) {
				    int i_3728_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_3726_])
					     & 0xff)]);
				    int i_3729_
					= ((i_3728_ & 0xff0000) * anInt8815
					   & ~0xffffff);
				    int i_3730_
					= ((i_3728_ & 0xff00) * anInt8833
					   & 0xff0000);
				    int i_3731_ = ((i_3728_ & 0xff) * anInt8836
						   & 0xff00);
				    is[i_3727_]
					= (i_3729_ | i_3730_ | i_3731_) >>> 8;
				} else if (i == 3) {
				    int i_3732_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_3726_])
					     & 0xff)]);
				    int i_3733_ = anInt8829;
				    int i_3734_ = i_3732_ + i_3733_;
				    int i_3735_ = ((i_3732_ & 0xff00ff)
						   + (i_3733_ & 0xff00ff));
				    int i_3736_
					= ((i_3735_ & 0x1000100)
					   + (i_3734_ - i_3735_ & 0x10000));
				    is[i_3727_]
					= (i_3734_ - i_3736_
					   | i_3736_ - (i_3736_ >>> 8));
				} else if (i == 2) {
				    int i_3737_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258[i_3726_])
					     & 0xff)]);
				    int i_3738_
					= ((i_3737_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_3739_
					= ((i_3737_ & 0xff00) * anInt8830
					   & 0xff0000);
				    is[i_3727_] = (((i_3738_ | i_3739_) >>> 8)
						   + anInt8834);
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3304_ == 1) {
				if (i == 1) {
				    int i_3740_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3726_]);
				    if (i_3740_ != 0)
					is[i_3727_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3740_ & 0xff]);
				} else if (i == 0) {
				    int i_3741_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3726_]);
				    if (i_3741_ != 0) {
					int i_3742_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3741_ & 0xff]);
					if ((anInt8829 & 0xffffff)
					    == 16777215) {
					    int i_3743_ = anInt8829 >>> 24;
					    int i_3744_ = 256 - i_3743_;
					    int i_3745_ = is[i_3727_];
					    is[i_3727_]
						= (((((i_3742_ & 0xff00ff)
						      * i_3743_)
						     + ((i_3745_ & 0xff00ff)
							* i_3744_))
						    & ~0xff00ff)
						   + ((((i_3742_ & 0xff00)
							* i_3743_)
						       + ((i_3745_ & 0xff00)
							  * i_3744_))
						      & 0xff0000)) >> 8;
					} else if (anInt8830 != 255) {
					    int i_3746_
						= (((i_3742_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_3747_ = (((i_3742_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_3748_
						= ((i_3742_ & 0xff) * anInt8836
						   & 0xff00);
					    i_3742_ = (i_3746_ | i_3747_
						       | i_3748_) >>> 8;
					    int i_3749_ = is[i_3727_];
					    is[i_3727_]
						= (((((i_3742_ & 0xff00ff)
						      * anInt8830)
						     + ((i_3749_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_3742_ & 0xff00)
							* anInt8830)
						       + ((i_3749_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
					} else {
					    int i_3750_
						= (((i_3742_ & 0xff0000)
						    * anInt8815)
						   & ~0xffffff);
					    int i_3751_ = (((i_3742_ & 0xff00)
							    * anInt8833)
							   & 0xff0000);
					    int i_3752_
						= ((i_3742_ & 0xff) * anInt8836
						   & 0xff00);
					    is[i_3727_] = (i_3750_ | i_3751_
							   | i_3752_) >>> 8;
					}
				    }
				} else if (i == 3) {
				    byte i_3753_ = (((Class151_Sub1_Sub1) this)
						    .aByteArray11258[i_3726_]);
				    int i_3754_
					= (i_3753_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_3753_])
					   : 0);
				    int i_3755_ = anInt8829;
				    int i_3756_ = i_3754_ + i_3755_;
				    int i_3757_ = ((i_3754_ & 0xff00ff)
						   + (i_3755_ & 0xff00ff));
				    int i_3758_
					= ((i_3757_ & 0x1000100)
					   + (i_3756_ - i_3757_ & 0x10000));
				    i_3758_ = (i_3756_ - i_3758_
					       | i_3758_ - (i_3758_ >>> 8));
				    if (i_3754_ == 0 && anInt8830 != 255) {
					i_3754_ = i_3758_;
					i_3758_ = is[i_3727_];
					i_3758_ = (((((i_3754_ & 0xff00ff)
						      * anInt8830)
						     + ((i_3758_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_3754_ & 0xff00)
							* anInt8830)
						       + ((i_3758_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3727_] = i_3758_;
				} else if (i == 2) {
				    int i_3759_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3726_]);
				    if (i_3759_ != 0) {
					int i_3760_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3759_ & 0xff]);
					int i_3761_
					    = ((i_3760_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_3762_
					    = ((i_3760_ & 0xff00) * anInt8830
					       & 0xff0000);
					is[i_3727_++] = ((i_3761_ | i_3762_)
							 >>> 8) + anInt8834;
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (i_3304_ == 2) {
				if (i == 1) {
				    int i_3763_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3726_]);
				    if (i_3763_ != 0) {
					int i_3764_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3763_ & 0xff]);
					int i_3765_ = is[i_3727_];
					int i_3766_ = i_3764_ + i_3765_;
					int i_3767_ = ((i_3764_ & 0xff00ff)
						       + (i_3765_ & 0xff00ff));
					i_3765_ = ((i_3767_ & 0x1000100)
						   + (i_3766_ - i_3767_
						      & 0x10000));
					is[i_3727_]
					    = (i_3766_ - i_3765_
					       | i_3765_ - (i_3765_ >>> 8));
				    }
				} else if (i == 0) {
				    int i_3768_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3726_]);
				    if (i_3768_ != 0) {
					int i_3769_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3768_ & 0xff]);
					int i_3770_
					    = ((i_3769_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_3771_
					    = ((i_3769_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_3772_
					    = ((i_3769_ & 0xff) * anInt8836
					       & 0xff00);
					i_3769_ = (i_3770_ | i_3771_
						   | i_3772_) >>> 8;
					int i_3773_ = is[i_3727_];
					int i_3774_ = i_3769_ + i_3773_;
					int i_3775_ = ((i_3769_ & 0xff00ff)
						       + (i_3773_ & 0xff00ff));
					i_3773_ = ((i_3775_ & 0x1000100)
						   + (i_3774_ - i_3775_
						      & 0x10000));
					is[i_3727_]
					    = (i_3774_ - i_3773_
					       | i_3773_ - (i_3773_ >>> 8));
				    }
				} else if (i == 3) {
				    byte i_3776_ = (((Class151_Sub1_Sub1) this)
						    .aByteArray11258[i_3726_]);
				    int i_3777_
					= (i_3776_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_3776_])
					   : 0);
				    int i_3778_ = anInt8829;
				    int i_3779_ = i_3777_ + i_3778_;
				    int i_3780_ = ((i_3777_ & 0xff00ff)
						   + (i_3778_ & 0xff00ff));
				    int i_3781_
					= ((i_3780_ & 0x1000100)
					   + (i_3779_ - i_3780_ & 0x10000));
				    i_3781_ = (i_3779_ - i_3781_
					       | i_3781_ - (i_3781_ >>> 8));
				    if (i_3777_ == 0 && anInt8830 != 255) {
					i_3777_ = i_3781_;
					i_3781_ = is[i_3727_];
					i_3781_ = (((((i_3777_ & 0xff00ff)
						      * anInt8830)
						     + ((i_3781_ & 0xff00ff)
							* anInt8831))
						    & ~0xff00ff)
						   + ((((i_3777_ & 0xff00)
							* anInt8830)
						       + ((i_3781_ & 0xff00)
							  * anInt8831))
						      & 0xff0000)) >> 8;
				    }
				    is[i_3727_] = i_3781_;
				} else if (i == 2) {
				    int i_3782_ = (((Class151_Sub1_Sub1) this)
						   .aByteArray11258[i_3726_]);
				    if (i_3782_ != 0) {
					int i_3783_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3782_ & 0xff]);
					int i_3784_
					    = ((i_3783_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
					int i_3785_
					    = ((i_3783_ & 0xff00) * anInt8830
					       & 0xff0000);
					i_3783_ = (((i_3784_ | i_3785_) >>> 8)
						   + anInt8834);
					int i_3786_ = is[i_3727_];
					int i_3787_ = i_3783_ + i_3786_;
					int i_3788_ = ((i_3783_ & 0xff00ff)
						       + (i_3786_ & 0xff00ff));
					i_3786_ = ((i_3788_ & 0x1000100)
						   + (i_3787_ - i_3788_
						      & 0x10000));
					is[i_3727_]
					    = (i_3787_ - i_3786_
					       | i_3786_ - (i_3786_ >>> 8));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    i_3721_ += anInt8822;
			}
		    }
		    i_3719_++;
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else if (anInt8825 < 0) {
		for (int i_3789_ = anInt8816; i_3789_ < 0; i_3789_++) {
		    int i_3790_ = anInt8818;
		    int i_3791_ = anInt8807 + anInt8805;
		    int i_3792_ = anInt8826 + anInt8828;
		    int i_3793_ = anInt8809;
		    if (i_3791_ < 0) {
			int i_3794_ = (anInt8822 - 1 - i_3791_) / anInt8822;
			i_3793_ += i_3794_;
			i_3791_ += anInt8822 * i_3794_;
			i_3792_ += anInt8825 * i_3794_;
			i_3790_ += i_3794_;
		    }
		    int i_3795_;
		    if ((i_3795_
			 = (1 + i_3791_
			    - (((Class151_Sub1_Sub1) this).anInt8803 << 12)
			    - anInt8822) / anInt8822)
			> i_3793_)
			i_3793_ = i_3795_;
		    if ((i_3795_
			 = i_3792_ - (((Class151_Sub1_Sub1) this).anInt8804
				      << 12))
			>= 0) {
			i_3795_ = (anInt8825 - i_3795_) / anInt8825;
			i_3793_ += i_3795_;
			i_3791_ += anInt8822 * i_3795_;
			i_3792_ += anInt8825 * i_3795_;
			i_3790_ += i_3795_;
		    }
		    if ((i_3795_ = (i_3792_ - anInt8825) / anInt8825)
			> i_3793_)
			i_3793_ = i_3795_;
		    for (/**/; i_3793_ < 0; i_3793_++) {
			int i_3796_
			    = (((i_3792_ >> 12)
				* ((Class151_Sub1_Sub1) this).anInt8803)
			       + (i_3791_ >> 12));
			int i_3797_ = i_3790_++;
			if (i_3304_ == 0) {
			    if (i == 1)
				is[i_3797_]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_3796_]) & 0xff]);
			    else if (i == 0) {
				int i_3798_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_3796_]) & 0xff]);
				int i_3799_ = ((i_3798_ & 0xff0000) * anInt8815
					       & ~0xffffff);
				int i_3800_ = ((i_3798_ & 0xff00) * anInt8833
					       & 0xff0000);
				int i_3801_
				    = (i_3798_ & 0xff) * anInt8836 & 0xff00;
				is[i_3797_]
				    = (i_3799_ | i_3800_ | i_3801_) >>> 8;
			    } else if (i == 3) {
				int i_3802_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_3796_]) & 0xff]);
				int i_3803_ = anInt8829;
				int i_3804_ = i_3802_ + i_3803_;
				int i_3805_ = ((i_3802_ & 0xff00ff)
					       + (i_3803_ & 0xff00ff));
				int i_3806_
				    = ((i_3805_ & 0x1000100)
				       + (i_3804_ - i_3805_ & 0x10000));
				is[i_3797_]
				    = i_3804_ - i_3806_ | i_3806_ - (i_3806_
								     >>> 8);
			    } else if (i == 2) {
				int i_3807_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_3796_]) & 0xff]);
				int i_3808_ = ((i_3807_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
				int i_3809_ = ((i_3807_ & 0xff00) * anInt8830
					       & 0xff0000);
				is[i_3797_]
				    = ((i_3808_ | i_3809_) >>> 8) + anInt8834;
			    } else
				throw new IllegalArgumentException();
			} else if (i_3304_ == 1) {
			    if (i == 1) {
				int i_3810_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3796_]);
				if (i_3810_ != 0)
				    is[i_3797_]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_3810_ & 0xff]);
			    } else if (i == 0) {
				int i_3811_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3796_]);
				if (i_3811_ != 0) {
				    int i_3812_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_3811_ & 0xff]);
				    if ((anInt8829 & 0xffffff) == 16777215) {
					int i_3813_ = anInt8829 >>> 24;
					int i_3814_ = 256 - i_3813_;
					int i_3815_ = is[i_3797_];
					is[i_3797_]
					    = ((((i_3812_ & 0xff00ff) * i_3813_
						 + ((i_3815_ & 0xff00ff)
						    * i_3814_))
						& ~0xff00ff)
					       + (((i_3812_ & 0xff00) * i_3813_
						   + ((i_3815_ & 0xff00)
						      * i_3814_))
						  & 0xff0000)) >> 8;
				    } else if (anInt8830 != 255) {
					int i_3816_
					    = ((i_3812_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_3817_
					    = ((i_3812_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_3818_
					    = ((i_3812_ & 0xff) * anInt8836
					       & 0xff00);
					i_3812_ = (i_3816_ | i_3817_
						   | i_3818_) >>> 8;
					int i_3819_ = is[i_3797_];
					is[i_3797_]
					    = (((((i_3812_ & 0xff00ff)
						  * anInt8830)
						 + ((i_3819_ & 0xff00ff)
						    * anInt8831))
						& ~0xff00ff)
					       + ((((i_3812_ & 0xff00)
						    * anInt8830)
						   + ((i_3819_ & 0xff00)
						      * anInt8831))
						  & 0xff0000)) >> 8;
				    } else {
					int i_3820_
					    = ((i_3812_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_3821_
					    = ((i_3812_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_3822_
					    = ((i_3812_ & 0xff) * anInt8836
					       & 0xff00);
					is[i_3797_] = (i_3820_ | i_3821_
						       | i_3822_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_3823_ = (((Class151_Sub1_Sub1) this)
						.aByteArray11258[i_3796_]);
				int i_3824_ = (i_3823_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_3823_])
					       : 0);
				int i_3825_ = anInt8829;
				int i_3826_ = i_3824_ + i_3825_;
				int i_3827_ = ((i_3824_ & 0xff00ff)
					       + (i_3825_ & 0xff00ff));
				int i_3828_
				    = ((i_3827_ & 0x1000100)
				       + (i_3826_ - i_3827_ & 0x10000));
				i_3828_
				    = i_3826_ - i_3828_ | i_3828_ - (i_3828_
								     >>> 8);
				if (i_3824_ == 0 && anInt8830 != 255) {
				    i_3824_ = i_3828_;
				    i_3828_ = is[i_3797_];
				    i_3828_
					= ((((i_3824_ & 0xff00ff) * anInt8830
					     + ((i_3828_ & 0xff00ff)
						* anInt8831))
					    & ~0xff00ff)
					   + (((i_3824_ & 0xff00) * anInt8830
					       + ((i_3828_ & 0xff00)
						  * anInt8831))
					      & 0xff0000)) >> 8;
				}
				is[i_3797_] = i_3828_;
			    } else if (i == 2) {
				int i_3829_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3796_]);
				if (i_3829_ != 0) {
				    int i_3830_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_3829_ & 0xff]);
				    int i_3831_
					= ((i_3830_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_3832_
					= ((i_3830_ & 0xff00) * anInt8830
					   & 0xff0000);
				    is[i_3797_++] = ((i_3831_ | i_3832_)
						     >>> 8) + anInt8834;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_3304_ == 2) {
			    if (i == 1) {
				int i_3833_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3796_]);
				if (i_3833_ != 0) {
				    int i_3834_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_3833_ & 0xff]);
				    int i_3835_ = is[i_3797_];
				    int i_3836_ = i_3834_ + i_3835_;
				    int i_3837_ = ((i_3834_ & 0xff00ff)
						   + (i_3835_ & 0xff00ff));
				    i_3835_
					= ((i_3837_ & 0x1000100)
					   + (i_3836_ - i_3837_ & 0x10000));
				    is[i_3797_]
					= (i_3836_ - i_3835_
					   | i_3835_ - (i_3835_ >>> 8));
				}
			    } else if (i == 0) {
				int i_3838_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3796_]);
				if (i_3838_ != 0) {
				    int i_3839_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_3838_ & 0xff]);
				    int i_3840_
					= ((i_3839_ & 0xff0000) * anInt8815
					   & ~0xffffff);
				    int i_3841_
					= ((i_3839_ & 0xff00) * anInt8833
					   & 0xff0000);
				    int i_3842_ = ((i_3839_ & 0xff) * anInt8836
						   & 0xff00);
				    i_3839_
					= (i_3840_ | i_3841_ | i_3842_) >>> 8;
				    int i_3843_ = is[i_3797_];
				    int i_3844_ = i_3839_ + i_3843_;
				    int i_3845_ = ((i_3839_ & 0xff00ff)
						   + (i_3843_ & 0xff00ff));
				    i_3843_
					= ((i_3845_ & 0x1000100)
					   + (i_3844_ - i_3845_ & 0x10000));
				    is[i_3797_]
					= (i_3844_ - i_3843_
					   | i_3843_ - (i_3843_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_3846_ = (((Class151_Sub1_Sub1) this)
						.aByteArray11258[i_3796_]);
				int i_3847_ = (i_3846_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_3846_])
					       : 0);
				int i_3848_ = anInt8829;
				int i_3849_ = i_3847_ + i_3848_;
				int i_3850_ = ((i_3847_ & 0xff00ff)
					       + (i_3848_ & 0xff00ff));
				int i_3851_
				    = ((i_3850_ & 0x1000100)
				       + (i_3849_ - i_3850_ & 0x10000));
				i_3851_
				    = i_3849_ - i_3851_ | i_3851_ - (i_3851_
								     >>> 8);
				if (i_3847_ == 0 && anInt8830 != 255) {
				    i_3847_ = i_3851_;
				    i_3851_ = is[i_3797_];
				    i_3851_
					= ((((i_3847_ & 0xff00ff) * anInt8830
					     + ((i_3851_ & 0xff00ff)
						* anInt8831))
					    & ~0xff00ff)
					   + (((i_3847_ & 0xff00) * anInt8830
					       + ((i_3851_ & 0xff00)
						  * anInt8831))
					      & 0xff0000)) >> 8;
				}
				is[i_3797_] = i_3851_;
			    } else if (i == 2) {
				int i_3852_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3796_]);
				if (i_3852_ != 0) {
				    int i_3853_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_3852_ & 0xff]);
				    int i_3854_
					= ((i_3853_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_3855_
					= ((i_3853_ & 0xff00) * anInt8830
					   & 0xff0000);
				    i_3853_ = (((i_3854_ | i_3855_) >>> 8)
					       + anInt8834);
				    int i_3856_ = is[i_3797_];
				    int i_3857_ = i_3853_ + i_3856_;
				    int i_3858_ = ((i_3853_ & 0xff00ff)
						   + (i_3856_ & 0xff00ff));
				    i_3856_
					= ((i_3858_ & 0x1000100)
					   + (i_3857_ - i_3858_ & 0x10000));
				    is[i_3797_]
					= (i_3857_ - i_3856_
					   | i_3856_ - (i_3856_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_3791_ += anInt8822;
			i_3792_ += anInt8825;
		    }
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    } else {
		for (int i_3859_ = anInt8816; i_3859_ < 0; i_3859_++) {
		    int i_3860_ = anInt8818;
		    int i_3861_ = anInt8807 + anInt8805;
		    int i_3862_ = anInt8826 + anInt8828;
		    int i_3863_ = anInt8809;
		    if (i_3861_ < 0) {
			int i_3864_ = (anInt8822 - 1 - i_3861_) / anInt8822;
			i_3863_ += i_3864_;
			i_3861_ += anInt8822 * i_3864_;
			i_3862_ += anInt8825 * i_3864_;
			i_3860_ += i_3864_;
		    }
		    int i_3865_;
		    if ((i_3865_
			 = (1 + i_3861_
			    - (((Class151_Sub1_Sub1) this).anInt8803 << 12)
			    - anInt8822) / anInt8822)
			> i_3863_)
			i_3863_ = i_3865_;
		    if (i_3862_ < 0) {
			i_3865_ = (anInt8825 - 1 - i_3862_) / anInt8825;
			i_3863_ += i_3865_;
			i_3861_ += anInt8822 * i_3865_;
			i_3862_ += anInt8825 * i_3865_;
			i_3860_ += i_3865_;
		    }
		    if ((i_3865_
			 = (1 + i_3862_
			    - (((Class151_Sub1_Sub1) this).anInt8804 << 12)
			    - anInt8825) / anInt8825)
			> i_3863_)
			i_3863_ = i_3865_;
		    for (/**/; i_3863_ < 0; i_3863_++) {
			int i_3866_
			    = (((i_3862_ >> 12)
				* ((Class151_Sub1_Sub1) this).anInt8803)
			       + (i_3861_ >> 12));
			int i_3867_ = i_3860_++;
			if (i_3304_ == 0) {
			    if (i == 1)
				is[i_3867_]
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_3866_]) & 0xff]);
			    else if (i == 0) {
				int i_3868_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_3866_]) & 0xff]);
				int i_3869_ = ((i_3868_ & 0xff0000) * anInt8815
					       & ~0xffffff);
				int i_3870_ = ((i_3868_ & 0xff00) * anInt8833
					       & 0xff0000);
				int i_3871_
				    = (i_3868_ & 0xff) * anInt8836 & 0xff00;
				is[i_3867_]
				    = (i_3869_ | i_3870_ | i_3871_) >>> 8;
			    } else if (i == 3) {
				int i_3872_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_3866_]) & 0xff]);
				int i_3873_ = anInt8829;
				int i_3874_ = i_3872_ + i_3873_;
				int i_3875_ = ((i_3872_ & 0xff00ff)
					       + (i_3873_ & 0xff00ff));
				int i_3876_
				    = ((i_3875_ & 0x1000100)
				       + (i_3874_ - i_3875_ & 0x10000));
				is[i_3867_]
				    = i_3874_ - i_3876_ | i_3876_ - (i_3876_
								     >>> 8);
			    } else if (i == 2) {
				int i_3877_
				    = (((Class151_Sub1_Sub1) this)
				       .anIntArray11257
				       [(((Class151_Sub1_Sub1) this)
					 .aByteArray11258[i_3866_]) & 0xff]);
				int i_3878_ = ((i_3877_ & 0xff00ff) * anInt8830
					       & ~0xff00ff);
				int i_3879_ = ((i_3877_ & 0xff00) * anInt8830
					       & 0xff0000);
				is[i_3867_]
				    = ((i_3878_ | i_3879_) >>> 8) + anInt8834;
			    } else
				throw new IllegalArgumentException();
			} else if (i_3304_ == 1) {
			    if (i == 1) {
				int i_3880_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3866_]);
				if (i_3880_ != 0)
				    is[i_3867_]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_3880_ & 0xff]);
			    } else if (i == 0) {
				int i_3881_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3866_]);
				if (i_3881_ != 0) {
				    int i_3882_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_3881_ & 0xff]);
				    if ((anInt8829 & 0xffffff) == 16777215) {
					int i_3883_ = anInt8829 >>> 24;
					int i_3884_ = 256 - i_3883_;
					int i_3885_ = is[i_3867_];
					is[i_3867_]
					    = ((((i_3882_ & 0xff00ff) * i_3883_
						 + ((i_3885_ & 0xff00ff)
						    * i_3884_))
						& ~0xff00ff)
					       + (((i_3882_ & 0xff00) * i_3883_
						   + ((i_3885_ & 0xff00)
						      * i_3884_))
						  & 0xff0000)) >> 8;
				    } else if (anInt8830 != 255) {
					int i_3886_
					    = ((i_3882_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_3887_
					    = ((i_3882_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_3888_
					    = ((i_3882_ & 0xff) * anInt8836
					       & 0xff00);
					i_3882_ = (i_3886_ | i_3887_
						   | i_3888_) >>> 8;
					int i_3889_ = is[i_3867_];
					is[i_3867_]
					    = (((((i_3882_ & 0xff00ff)
						  * anInt8830)
						 + ((i_3889_ & 0xff00ff)
						    * anInt8831))
						& ~0xff00ff)
					       + ((((i_3882_ & 0xff00)
						    * anInt8830)
						   + ((i_3889_ & 0xff00)
						      * anInt8831))
						  & 0xff0000)) >> 8;
				    } else {
					int i_3890_
					    = ((i_3882_ & 0xff0000) * anInt8815
					       & ~0xffffff);
					int i_3891_
					    = ((i_3882_ & 0xff00) * anInt8833
					       & 0xff0000);
					int i_3892_
					    = ((i_3882_ & 0xff) * anInt8836
					       & 0xff00);
					is[i_3867_] = (i_3890_ | i_3891_
						       | i_3892_) >>> 8;
				    }
				}
			    } else if (i == 3) {
				byte i_3893_ = (((Class151_Sub1_Sub1) this)
						.aByteArray11258[i_3866_]);
				int i_3894_ = (i_3893_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_3893_])
					       : 0);
				int i_3895_ = anInt8829;
				int i_3896_ = i_3894_ + i_3895_;
				int i_3897_ = ((i_3894_ & 0xff00ff)
					       + (i_3895_ & 0xff00ff));
				int i_3898_
				    = ((i_3897_ & 0x1000100)
				       + (i_3896_ - i_3897_ & 0x10000));
				i_3898_
				    = i_3896_ - i_3898_ | i_3898_ - (i_3898_
								     >>> 8);
				if (i_3894_ == 0 && anInt8830 != 255) {
				    i_3894_ = i_3898_;
				    i_3898_ = is[i_3867_];
				    i_3898_
					= ((((i_3894_ & 0xff00ff) * anInt8830
					     + ((i_3898_ & 0xff00ff)
						* anInt8831))
					    & ~0xff00ff)
					   + (((i_3894_ & 0xff00) * anInt8830
					       + ((i_3898_ & 0xff00)
						  * anInt8831))
					      & 0xff0000)) >> 8;
				}
				is[i_3867_] = i_3898_;
			    } else if (i == 2) {
				int i_3899_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3866_]);
				if (i_3899_ != 0) {
				    int i_3900_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_3899_ & 0xff]);
				    int i_3901_
					= ((i_3900_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_3902_
					= ((i_3900_ & 0xff00) * anInt8830
					   & 0xff0000);
				    is[i_3867_++] = ((i_3901_ | i_3902_)
						     >>> 8) + anInt8834;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (i_3304_ == 2) {
			    if (i == 1) {
				int i_3903_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3866_]);
				if (i_3903_ != 0) {
				    int i_3904_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_3903_ & 0xff]);
				    int i_3905_ = is[i_3867_];
				    int i_3906_ = i_3904_ + i_3905_;
				    int i_3907_ = ((i_3904_ & 0xff00ff)
						   + (i_3905_ & 0xff00ff));
				    i_3905_
					= ((i_3907_ & 0x1000100)
					   + (i_3906_ - i_3907_ & 0x10000));
				    is[i_3867_]
					= (i_3906_ - i_3905_
					   | i_3905_ - (i_3905_ >>> 8));
				}
			    } else if (i == 0) {
				int i_3908_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3866_]);
				if (i_3908_ != 0) {
				    int i_3909_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_3908_ & 0xff]);
				    int i_3910_
					= ((i_3909_ & 0xff0000) * anInt8815
					   & ~0xffffff);
				    int i_3911_
					= ((i_3909_ & 0xff00) * anInt8833
					   & 0xff0000);
				    int i_3912_ = ((i_3909_ & 0xff) * anInt8836
						   & 0xff00);
				    i_3909_
					= (i_3910_ | i_3911_ | i_3912_) >>> 8;
				    int i_3913_ = is[i_3867_];
				    int i_3914_ = i_3909_ + i_3913_;
				    int i_3915_ = ((i_3909_ & 0xff00ff)
						   + (i_3913_ & 0xff00ff));
				    i_3913_
					= ((i_3915_ & 0x1000100)
					   + (i_3914_ - i_3915_ & 0x10000));
				    is[i_3867_]
					= (i_3914_ - i_3913_
					   | i_3913_ - (i_3913_ >>> 8));
				}
			    } else if (i == 3) {
				byte i_3916_ = (((Class151_Sub1_Sub1) this)
						.aByteArray11258[i_3866_]);
				int i_3917_ = (i_3916_ > 0
					       ? (((Class151_Sub1_Sub1) this)
						  .anIntArray11257[i_3916_])
					       : 0);
				int i_3918_ = anInt8829;
				int i_3919_ = i_3917_ + i_3918_;
				int i_3920_ = ((i_3917_ & 0xff00ff)
					       + (i_3918_ & 0xff00ff));
				int i_3921_
				    = ((i_3920_ & 0x1000100)
				       + (i_3919_ - i_3920_ & 0x10000));
				i_3921_
				    = i_3919_ - i_3921_ | i_3921_ - (i_3921_
								     >>> 8);
				if (i_3917_ == 0 && anInt8830 != 255) {
				    i_3917_ = i_3921_;
				    i_3921_ = is[i_3867_];
				    i_3921_
					= ((((i_3917_ & 0xff00ff) * anInt8830
					     + ((i_3921_ & 0xff00ff)
						* anInt8831))
					    & ~0xff00ff)
					   + (((i_3917_ & 0xff00) * anInt8830
					       + ((i_3921_ & 0xff00)
						  * anInt8831))
					      & 0xff0000)) >> 8;
				}
				is[i_3867_] = i_3921_;
			    } else if (i == 2) {
				int i_3922_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258[i_3866_]);
				if (i_3922_ != 0) {
				    int i_3923_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257[i_3922_ & 0xff]);
				    int i_3924_
					= ((i_3923_ & 0xff00ff) * anInt8830
					   & ~0xff00ff);
				    int i_3925_
					= ((i_3923_ & 0xff00) * anInt8830
					   & 0xff0000);
				    i_3923_ = (((i_3924_ | i_3925_) >>> 8)
					       + anInt8834);
				    int i_3926_ = is[i_3867_];
				    int i_3927_ = i_3923_ + i_3926_;
				    int i_3928_ = ((i_3923_ & 0xff00ff)
						   + (i_3926_ & 0xff00ff));
				    i_3926_
					= ((i_3928_ & 0x1000100)
					   + (i_3927_ - i_3928_ & 0x10000));
				    is[i_3867_]
					= (i_3927_ - i_3926_
					   | i_3926_ - (i_3926_ >>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			i_3861_ += anInt8822;
			i_3862_ += anInt8825;
		    }
		    anInt8807 += anInt8821;
		    anInt8826 += anInt8802;
		    anInt8818 += anInt8817;
		}
	    }
	}
    }
    
    public void method1787(int i, int i_3929_, int i_3930_) {
	throw new IllegalStateException();
    }
    
    void method8297(boolean bool, boolean bool_3931_, boolean bool_3932_,
		    int i, int i_3933_, float f, int i_3934_, int i_3935_,
		    int i_3936_, int i_3937_, int i_3938_, int i_3939_,
		    boolean bool_3940_) {
	if (i_3934_ > 0 && i_3935_ > 0 && (bool || bool_3931_)) {
	    int i_3941_ = 0;
	    int i_3942_ = 0;
	    int i_3943_ = (((Class151_Sub1_Sub1) this).anInt8806
			   + ((Class151_Sub1_Sub1) this).anInt8803
			   + ((Class151_Sub1_Sub1) this).anInt8832);
	    int i_3944_ = (((Class151_Sub1_Sub1) this).anInt8819
			   + ((Class151_Sub1_Sub1) this).anInt8804
			   + ((Class151_Sub1_Sub1) this).anInt8808);
	    int i_3945_ = (i_3943_ << 16) / i_3934_;
	    int i_3946_ = (i_3944_ << 16) / i_3935_;
	    if (((Class151_Sub1_Sub1) this).anInt8806 > 0) {
		int i_3947_ = (((((Class151_Sub1_Sub1) this).anInt8806 << 16)
				+ i_3945_ - 1)
			       / i_3945_);
		i += i_3947_;
		i_3941_ += (i_3947_ * i_3945_
			    - (((Class151_Sub1_Sub1) this).anInt8806 << 16));
	    }
	    if (((Class151_Sub1_Sub1) this).anInt8819 > 0) {
		int i_3948_ = (((((Class151_Sub1_Sub1) this).anInt8819 << 16)
				+ i_3946_ - 1)
			       / i_3946_);
		i_3933_ += i_3948_;
		i_3942_ += (i_3948_ * i_3946_
			    - (((Class151_Sub1_Sub1) this).anInt8819 << 16));
	    }
	    if (((Class151_Sub1_Sub1) this).anInt8803 < i_3943_)
		i_3934_ = ((((Class151_Sub1_Sub1) this).anInt8803 << 16)
			   - i_3941_ + i_3945_ - 1) / i_3945_;
	    if (((Class151_Sub1_Sub1) this).anInt8804 < i_3944_)
		i_3935_ = ((((Class151_Sub1_Sub1) this).anInt8804 << 16)
			   - i_3942_ + i_3946_ - 1) / i_3946_;
	    int i_3949_
		= i + i_3933_ * ((((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						    .aClass173_Sub3_8814))
				  .anInt9735)
				 * 111437289);
	    int i_3950_ = ((((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					      .aClass173_Sub3_8814)).anInt9735
			    * 111437289)
			   - i_3934_);
	    if (i_3933_ + i_3935_
		> ((Class173_Sub3) (((Class151_Sub1_Sub1) this)
				    .aClass173_Sub3_8814)).anInt9726 * 6965409)
		i_3935_ -= (i_3933_ + i_3935_
			    - (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						 .aClass173_Sub3_8814))
			       .anInt9726) * 6965409);
	    if (i_3933_ < (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
					     .aClass173_Sub3_8814)).anInt9725
			   * 592117349)) {
		int i_3951_ = ((((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						  .aClass173_Sub3_8814))
				.anInt9725) * 592117349
			       - i_3933_);
		i_3935_ -= i_3951_;
		i_3949_ += i_3951_ * (((Class173_Sub3)
				       (((Class151_Sub1_Sub1) this)
					.aClass173_Sub3_8814)).anInt9735
				      * 111437289);
		i_3942_ += i_3946_ * i_3951_;
	    }
	    if (i + i_3934_ > (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						 .aClass173_Sub3_8814))
			       .anInt9724) * 630968029) {
		int i_3952_ = (i + i_3934_
			       - (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						    .aClass173_Sub3_8814))
				  .anInt9724) * 630968029);
		i_3934_ -= i_3952_;
		i_3950_ += i_3952_;
	    }
	    if (i < (((Class173_Sub3) (((Class151_Sub1_Sub1) this)
				       .aClass173_Sub3_8814)).anInt9723
		     * -993497119)) {
		int i_3953_ = ((((Class173_Sub3) (((Class151_Sub1_Sub1) this)
						  .aClass173_Sub3_8814))
				.anInt9723) * -993497119
			       - i);
		i_3934_ -= i_3953_;
		i_3949_ += i_3953_;
		i_3941_ += i_3945_ * i_3953_;
		i_3950_ += i_3953_;
	    }
	    float[] fs = (((Class173_Sub3)
			   ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
			  .aFloatArray9716);
	    int[] is = (((Class173_Sub3)
			 ((Class151_Sub1_Sub1) this).aClass173_Sub3_8814)
			.anIntArray9719);
	    if (i_3938_ == 0) {
		if (i_3936_ == 1) {
		    int i_3954_ = i_3941_;
		    for (int i_3955_ = -i_3935_; i_3955_ < 0; i_3955_++) {
			int i_3956_
			    = ((i_3942_ >> 16)
			       * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_3957_ = -i_3934_; i_3957_ < 0; i_3957_++) {
			    if (!bool_3931_ || f < fs[i_3949_]) {
				if (bool)
				    is[i_3949_]
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258
					      [(i_3941_ >> 16) + i_3956_])
					     & 0xff)]);
				if (bool_3931_ && bool_3940_)
				    fs[i_3949_] = f;
			    }
			    i_3941_ += i_3945_;
			    i_3949_++;
			}
			i_3942_ += i_3946_;
			i_3941_ = i_3954_;
			i_3949_ += i_3950_;
		    }
		} else if (i_3936_ == 0) {
		    int i_3958_ = (i_3937_ & 0xff0000) >> 16;
		    int i_3959_ = (i_3937_ & 0xff00) >> 8;
		    int i_3960_ = i_3937_ & 0xff;
		    int i_3961_ = i_3941_;
		    for (int i_3962_ = -i_3935_; i_3962_ < 0; i_3962_++) {
			int i_3963_
			    = ((i_3942_ >> 16)
			       * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_3964_ = -i_3934_; i_3964_ < 0; i_3964_++) {
			    if (!bool_3931_ || f < fs[i_3949_]) {
				if (bool) {
				    int i_3965_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258
					      [(i_3941_ >> 16) + i_3963_])
					     & 0xff)]);
				    int i_3966_
					= ((i_3965_ & 0xff0000) * i_3958_
					   & ~0xffffff);
				    int i_3967_ = ((i_3965_ & 0xff00) * i_3959_
						   & 0xff0000);
				    int i_3968_
					= (i_3965_ & 0xff) * i_3960_ & 0xff00;
				    is[i_3949_]
					= (i_3966_ | i_3967_ | i_3968_) >>> 8;
				}
				if (bool_3931_ && bool_3940_)
				    fs[i_3949_] = f;
			    }
			    i_3941_ += i_3945_;
			    i_3949_++;
			}
			i_3942_ += i_3946_;
			i_3941_ = i_3961_;
			i_3949_ += i_3950_;
		    }
		} else if (i_3936_ == 3) {
		    int i_3969_ = i_3941_;
		    for (int i_3970_ = -i_3935_; i_3970_ < 0; i_3970_++) {
			int i_3971_
			    = ((i_3942_ >> 16)
			       * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_3972_ = -i_3934_; i_3972_ < 0; i_3972_++) {
			    if (!bool_3931_ || f < fs[i_3949_]) {
				if (bool) {
				    byte i_3973_
					= (((Class151_Sub1_Sub1) this)
					   .aByteArray11258
					   [(i_3941_ >> 16) + i_3971_]);
				    int i_3974_
					= (i_3973_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_3973_])
					   : 0);
				    int i_3975_ = i_3974_ + i_3937_;
				    int i_3976_ = ((i_3974_ & 0xff00ff)
						   + (i_3937_ & 0xff00ff));
				    int i_3977_
					= ((i_3976_ & 0x1000100)
					   + (i_3975_ - i_3976_ & 0x10000));
				    is[i_3949_]
					= (i_3975_ - i_3977_
					   | i_3977_ - (i_3977_ >>> 8));
				}
				if (bool_3931_ && bool_3940_)
				    fs[i_3949_] = f;
			    }
			    i_3941_ += i_3945_;
			    i_3949_++;
			}
			i_3942_ += i_3946_;
			i_3941_ = i_3969_;
			i_3949_ += i_3950_;
		    }
		} else if (i_3936_ == 2) {
		    int i_3978_ = i_3937_ >>> 24;
		    int i_3979_ = 256 - i_3978_;
		    int i_3980_ = (i_3937_ & 0xff00ff) * i_3979_ & ~0xff00ff;
		    int i_3981_ = (i_3937_ & 0xff00) * i_3979_ & 0xff0000;
		    i_3937_ = (i_3980_ | i_3981_) >>> 8;
		    int i_3982_ = i_3941_;
		    for (int i_3983_ = -i_3935_; i_3983_ < 0; i_3983_++) {
			int i_3984_
			    = ((i_3942_ >> 16)
			       * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_3985_ = -i_3934_; i_3985_ < 0; i_3985_++) {
			    if (!bool_3931_ || f < fs[i_3949_]) {
				if (bool) {
				    int i_3986_
					= (((Class151_Sub1_Sub1) this)
					   .anIntArray11257
					   [((((Class151_Sub1_Sub1) this)
					      .aByteArray11258
					      [(i_3941_ >> 16) + i_3984_])
					     & 0xff)]);
				    i_3980_ = ((i_3986_ & 0xff00ff) * i_3978_
					       & ~0xff00ff);
				    i_3981_ = ((i_3986_ & 0xff00) * i_3978_
					       & 0xff0000);
				    is[i_3949_] = (((i_3980_ | i_3981_) >>> 8)
						   + i_3937_);
				}
				if (bool_3931_ && bool_3940_)
				    fs[i_3949_] = f;
			    }
			    i_3941_ += i_3945_;
			    i_3949_++;
			}
			i_3942_ += i_3946_;
			i_3941_ = i_3982_;
			i_3949_ += i_3950_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_3938_ == 1) {
		if (i_3936_ == 1) {
		    int i_3987_ = i_3941_;
		    for (int i_3988_ = -i_3935_; i_3988_ < 0; i_3988_++) {
			int i_3989_
			    = ((i_3942_ >> 16)
			       * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_3990_ = -i_3934_; i_3990_ < 0; i_3990_++) {
			    if (!bool_3931_ || f < fs[i_3949_]) {
				int i_3991_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258
					       [(i_3941_ >> 16) + i_3989_]);
				if (i_3991_ != 0) {
				    if (bool)
					is[i_3949_]
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_3991_ & 0xff]);
				    if (bool_3931_ && bool_3940_)
					fs[i_3949_] = f;
				}
			    }
			    i_3941_ += i_3945_;
			    i_3949_++;
			}
			i_3942_ += i_3946_;
			i_3941_ = i_3987_;
			i_3949_ += i_3950_;
		    }
		} else if (i_3936_ == 0) {
		    int i_3992_ = i_3941_;
		    if ((i_3937_ & 0xffffff) == 16777215) {
			int i_3993_ = i_3937_ >>> 24;
			int i_3994_ = 256 - i_3993_;
			for (int i_3995_ = -i_3935_; i_3995_ < 0; i_3995_++) {
			    int i_3996_
				= ((i_3942_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_3997_ = -i_3934_; i_3997_ < 0;
				 i_3997_++) {
				if (!bool_3931_ || f < fs[i_3949_]) {
				    int i_3998_
					= (((Class151_Sub1_Sub1) this)
					   .aByteArray11258
					   [(i_3941_ >> 16) + i_3996_]);
				    if (i_3998_ != 0) {
					if (bool) {
					    int i_3999_
						= (((Class151_Sub1_Sub1) this)
						   .anIntArray11257
						   [i_3998_ & 0xff]);
					    int i_4000_ = is[i_3949_];
					    is[i_3949_]
						= (((((i_3999_ & 0xff00ff)
						      * i_3993_)
						     + ((i_4000_ & 0xff00ff)
							* i_3994_))
						    & ~0xff00ff)
						   + ((((i_3999_ & 0xff00)
							* i_3993_)
						       + ((i_4000_ & 0xff00)
							  * i_3994_))
						      & 0xff0000)) >> 8;
					}
					if (bool_3931_ && bool_3940_)
					    fs[i_3949_] = f;
				    }
				}
				i_3941_ += i_3945_;
				i_3949_++;
			    }
			    i_3942_ += i_3946_;
			    i_3941_ = i_3992_;
			    i_3949_ += i_3950_;
			}
		    } else {
			int i_4001_ = (i_3937_ & 0xff0000) >> 16;
			int i_4002_ = (i_3937_ & 0xff00) >> 8;
			int i_4003_ = i_3937_ & 0xff;
			int i_4004_ = i_3937_ >>> 24;
			int i_4005_ = 256 - i_4004_;
			for (int i_4006_ = -i_3935_; i_4006_ < 0; i_4006_++) {
			    int i_4007_
				= ((i_3942_ >> 16)
				   * ((Class151_Sub1_Sub1) this).anInt8803);
			    for (int i_4008_ = -i_3934_; i_4008_ < 0;
				 i_4008_++) {
				if (!bool_3931_ || f < fs[i_3949_]) {
				    int i_4009_
					= (((Class151_Sub1_Sub1) this)
					   .aByteArray11258
					   [(i_3941_ >> 16) + i_4007_]);
				    if (i_4009_ != 0) {
					int i_4010_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_4009_ & 0xff]);
					if (i_4004_ != 255) {
					    if (bool) {
						int i_4011_
						    = (((i_4010_ & 0xff0000)
							* i_4001_)
						       & ~0xffffff);
						int i_4012_
						    = (((i_4010_ & 0xff00)
							* i_4002_)
						       & 0xff0000);
						int i_4013_
						    = (((i_4010_ & 0xff)
							* i_4003_)
						       & 0xff00);
						i_4010_ = (i_4011_ | i_4012_
							   | i_4013_) >>> 8;
						int i_4014_ = is[i_3949_];
						is[i_3949_]
						    = (((((i_4010_ & 0xff00ff)
							  * i_4004_)
							 + ((i_4014_
							     & 0xff00ff)
							    * i_4005_))
							& ~0xff00ff)
						       + ((((i_4010_ & 0xff00)
							    * i_4004_)
							   + ((i_4014_
							       & 0xff00)
							      * i_4005_))
							  & 0xff0000)) >> 8;
					    }
					    if (bool_3931_ && bool_3940_)
						fs[i_3949_] = f;
					} else {
					    if (bool) {
						int i_4015_
						    = (((i_4010_ & 0xff0000)
							* i_4001_)
						       & ~0xffffff);
						int i_4016_
						    = (((i_4010_ & 0xff00)
							* i_4002_)
						       & 0xff0000);
						int i_4017_
						    = (((i_4010_ & 0xff)
							* i_4003_)
						       & 0xff00);
						is[i_3949_]
						    = (i_4015_ | i_4016_
						       | i_4017_) >>> 8;
					    }
					    if (bool_3931_ && bool_3940_)
						fs[i_3949_] = f;
					}
				    }
				}
				i_3941_ += i_3945_;
				i_3949_++;
			    }
			    i_3942_ += i_3946_;
			    i_3941_ = i_3992_;
			    i_3949_ += i_3950_;
			}
		    }
		} else if (i_3936_ == 3) {
		    int i_4018_ = i_3941_;
		    int i_4019_ = i_3937_ >>> 24;
		    int i_4020_ = 256 - i_4019_;
		    for (int i_4021_ = -i_3935_; i_4021_ < 0; i_4021_++) {
			int i_4022_
			    = ((i_3942_ >> 16)
			       * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_4023_ = -i_3934_; i_4023_ < 0; i_4023_++) {
			    if (!bool_3931_ || f < fs[i_3949_]) {
				if (bool) {
				    byte i_4024_
					= (((Class151_Sub1_Sub1) this)
					   .aByteArray11258
					   [(i_3941_ >> 16) + i_4022_]);
				    int i_4025_
					= (i_4024_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_4024_])
					   : 0);
				    int i_4026_ = i_4025_ + i_3937_;
				    int i_4027_ = ((i_4025_ & 0xff00ff)
						   + (i_3937_ & 0xff00ff));
				    int i_4028_
					= ((i_4027_ & 0x1000100)
					   + (i_4026_ - i_4027_ & 0x10000));
				    i_4028_ = (i_4026_ - i_4028_
					       | i_4028_ - (i_4028_ >>> 8));
				    if (i_4025_ == 0 && i_4019_ != 255) {
					i_4025_ = i_4028_;
					i_4028_ = is[i_3949_];
					i_4028_
					    = ((((i_4025_ & 0xff00ff) * i_4019_
						 + ((i_4028_ & 0xff00ff)
						    * i_4020_))
						& ~0xff00ff)
					       + (((i_4025_ & 0xff00) * i_4019_
						   + ((i_4028_ & 0xff00)
						      * i_4020_))
						  & 0xff0000)) >> 8;
				    }
				    is[i_3949_] = i_4028_;
				}
				if (bool_3931_ && bool_3940_)
				    fs[i_3949_] = f;
			    }
			    i_3941_ += i_3945_;
			    i_3949_++;
			}
			i_3942_ += i_3946_;
			i_3941_ = i_4018_;
			i_3949_ += i_3950_;
		    }
		} else if (i_3936_ == 2) {
		    int i_4029_ = i_3937_ >>> 24;
		    int i_4030_ = 256 - i_4029_;
		    int i_4031_ = (i_3937_ & 0xff00ff) * i_4030_ & ~0xff00ff;
		    int i_4032_ = (i_3937_ & 0xff00) * i_4030_ & 0xff0000;
		    i_3937_ = (i_4031_ | i_4032_) >>> 8;
		    int i_4033_ = i_3941_;
		    for (int i_4034_ = -i_3935_; i_4034_ < 0; i_4034_++) {
			int i_4035_
			    = ((i_3942_ >> 16)
			       * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_4036_ = -i_3934_; i_4036_ < 0; i_4036_++) {
			    if (!bool_3931_ || f < fs[i_3949_]) {
				int i_4037_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258
					       [(i_3941_ >> 16) + i_4035_]);
				if (i_4037_ != 0) {
				    if (bool) {
					int i_4038_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_4037_ & 0xff]);
					i_4031_
					    = ((i_4038_ & 0xff00ff) * i_4029_
					       & ~0xff00ff);
					i_4032_ = ((i_4038_ & 0xff00) * i_4029_
						   & 0xff0000);
					is[i_3949_] = ((i_4031_ | i_4032_)
						       >>> 8) + i_3937_;
				    }
				    if (bool_3931_ && bool_3940_)
					fs[i_3949_] = f;
				}
			    }
			    i_3941_ += i_3945_;
			    i_3949_++;
			}
			i_3942_ += i_3946_;
			i_3941_ = i_4033_;
			i_3949_ += i_3950_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else if (i_3938_ == 2) {
		if (i_3936_ == 1) {
		    int i_4039_ = i_3941_;
		    for (int i_4040_ = -i_3935_; i_4040_ < 0; i_4040_++) {
			int i_4041_
			    = ((i_3942_ >> 16)
			       * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_4042_ = -i_3934_; i_4042_ < 0; i_4042_++) {
			    if (!bool_3931_ || f < fs[i_3949_]) {
				int i_4043_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258
					       [(i_3941_ >> 16) + i_4041_]);
				if (i_4043_ != 0) {
				    if (bool) {
					int i_4044_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_4043_ & 0xff]);
					int i_4045_ = is[i_3949_];
					int i_4046_ = i_4044_ + i_4045_;
					int i_4047_ = ((i_4044_ & 0xff00ff)
						       + (i_4045_ & 0xff00ff));
					i_4045_ = ((i_4047_ & 0x1000100)
						   + (i_4046_ - i_4047_
						      & 0x10000));
					is[i_3949_]
					    = (i_4046_ - i_4045_
					       | i_4045_ - (i_4045_ >>> 8));
				    }
				    if (bool_3931_ && bool_3940_)
					fs[i_3949_] = f;
				}
			    }
			    i_3941_ += i_3945_;
			    i_3949_++;
			}
			i_3942_ += i_3946_;
			i_3941_ = i_4039_;
			i_3949_ += i_3950_;
		    }
		} else if (i_3936_ == 0) {
		    int i_4048_ = i_3941_;
		    int i_4049_ = (i_3937_ & 0xff0000) >> 16;
		    int i_4050_ = (i_3937_ & 0xff00) >> 8;
		    int i_4051_ = i_3937_ & 0xff;
		    for (int i_4052_ = -i_3935_; i_4052_ < 0; i_4052_++) {
			int i_4053_
			    = ((i_3942_ >> 16)
			       * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_4054_ = -i_3934_; i_4054_ < 0; i_4054_++) {
			    if (!bool_3931_ || f < fs[i_3949_]) {
				int i_4055_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258
					       [(i_3941_ >> 16) + i_4053_]);
				if (i_4055_ != 0) {
				    if (bool) {
					int i_4056_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_4055_ & 0xff]);
					int i_4057_
					    = ((i_4056_ & 0xff0000) * i_4049_
					       & ~0xffffff);
					int i_4058_
					    = ((i_4056_ & 0xff00) * i_4050_
					       & 0xff0000);
					int i_4059_
					    = ((i_4056_ & 0xff) * i_4051_
					       & 0xff00);
					i_4056_ = (i_4057_ | i_4058_
						   | i_4059_) >>> 8;
					int i_4060_ = is[i_3949_];
					int i_4061_ = i_4056_ + i_4060_;
					int i_4062_ = ((i_4056_ & 0xff00ff)
						       + (i_4060_ & 0xff00ff));
					i_4060_ = ((i_4062_ & 0x1000100)
						   + (i_4061_ - i_4062_
						      & 0x10000));
					is[i_3949_]
					    = (i_4061_ - i_4060_
					       | i_4060_ - (i_4060_ >>> 8));
				    }
				    if (bool_3931_ && bool_3940_)
					fs[i_3949_] = f;
				}
			    }
			    i_3941_ += i_3945_;
			    i_3949_++;
			}
			i_3942_ += i_3946_;
			i_3941_ = i_4048_;
			i_3949_ += i_3950_;
		    }
		} else if (i_3936_ == 3) {
		    int i_4063_ = i_3941_;
		    for (int i_4064_ = -i_3935_; i_4064_ < 0; i_4064_++) {
			int i_4065_
			    = ((i_3942_ >> 16)
			       * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_4066_ = -i_3934_; i_4066_ < 0; i_4066_++) {
			    if (!bool_3931_ || f < fs[i_3949_]) {
				if (bool) {
				    byte i_4067_
					= (((Class151_Sub1_Sub1) this)
					   .aByteArray11258
					   [(i_3941_ >> 16) + i_4065_]);
				    int i_4068_
					= (i_4067_ > 0
					   ? (((Class151_Sub1_Sub1) this)
					      .anIntArray11257[i_4067_])
					   : 0);
				    int i_4069_ = i_4068_ + i_3937_;
				    int i_4070_ = ((i_4068_ & 0xff00ff)
						   + (i_3937_ & 0xff00ff));
				    int i_4071_
					= ((i_4070_ & 0x1000100)
					   + (i_4069_ - i_4070_ & 0x10000));
				    i_4068_ = (i_4069_ - i_4071_
					       | i_4071_ - (i_4071_ >>> 8));
				    i_4071_ = is[i_3949_];
				    i_4069_ = i_4068_ + i_4071_;
				    i_4070_
					= (i_4068_ & 0xff00ff) + (i_4071_
								  & 0xff00ff);
				    i_4071_
					= ((i_4070_ & 0x1000100)
					   + (i_4069_ - i_4070_ & 0x10000));
				    is[i_3949_]
					= (i_4069_ - i_4071_
					   | i_4071_ - (i_4071_ >>> 8));
				}
				if (bool_3931_ && bool_3940_)
				    fs[i_3949_] = f;
			    }
			    i_3941_ += i_3945_;
			    i_3949_++;
			}
			i_3942_ += i_3946_;
			i_3941_ = i_4063_;
			i_3949_ += i_3950_;
		    }
		} else if (i_3936_ == 2) {
		    int i_4072_ = i_3937_ >>> 24;
		    int i_4073_ = 256 - i_4072_;
		    int i_4074_ = (i_3937_ & 0xff00ff) * i_4073_ & ~0xff00ff;
		    int i_4075_ = (i_3937_ & 0xff00) * i_4073_ & 0xff0000;
		    i_3937_ = (i_4074_ | i_4075_) >>> 8;
		    int i_4076_ = i_3941_;
		    for (int i_4077_ = -i_3935_; i_4077_ < 0; i_4077_++) {
			int i_4078_
			    = ((i_3942_ >> 16)
			       * ((Class151_Sub1_Sub1) this).anInt8803);
			for (int i_4079_ = -i_3934_; i_4079_ < 0; i_4079_++) {
			    if (!bool_3931_ || f < fs[i_3949_]) {
				int i_4080_ = (((Class151_Sub1_Sub1) this)
					       .aByteArray11258
					       [(i_3941_ >> 16) + i_4078_]);
				if (i_4080_ != 0) {
				    if (bool) {
					int i_4081_
					    = (((Class151_Sub1_Sub1) this)
					       .anIntArray11257
					       [i_4080_ & 0xff]);
					i_4074_
					    = ((i_4081_ & 0xff00ff) * i_4072_
					       & ~0xff00ff);
					i_4075_ = ((i_4081_ & 0xff00) * i_4072_
						   & 0xff0000);
					i_4081_ = (((i_4074_ | i_4075_) >>> 8)
						   + i_3937_);
					int i_4082_ = is[i_3949_];
					int i_4083_ = i_4081_ + i_4082_;
					int i_4084_ = ((i_4081_ & 0xff00ff)
						       + (i_4082_ & 0xff00ff));
					i_4082_ = ((i_4084_ & 0x1000100)
						   + (i_4083_ - i_4084_
						      & 0x10000));
					is[i_3949_]
					    = (i_4083_ - i_4082_
					       | i_4082_ - (i_4082_ >>> 8));
				    }
				    if (bool_3931_ && bool_3940_)
					fs[i_3949_] = f;
				}
			    }
			    i_3941_ += i_3945_;
			    i_3949_++;
			}
			i_3942_ += i_3946_;
			i_3941_ = i_4076_;
			i_3949_ += i_3950_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method1798(int i, int i_4085_, int i_4086_, int i_4087_,
			   int[] is, int[] is_4088_, int i_4089_,
			   int i_4090_) {
	throw new IllegalStateException();
    }
}
