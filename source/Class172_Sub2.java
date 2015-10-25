/* Class172_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class172_Sub2 extends Class172
{
    Class173_Sub3 aClass173_Sub3_9392;
    byte[][] aByteArrayArray9393;
    int[] anIntArray9394;
    int[] anIntArray9395;
    int[] anIntArray9396;
    int[] anIntArray9397;
    int[] anIntArray9398;
    
    void method2125(char c, int i, int i_0_, int i_1_, boolean bool) {
	if (null
	    != (((Class173_Sub3) ((Class172_Sub2) this).aClass173_Sub3_9392)
		.anIntArray9719)) {
	    i += ((Class172_Sub2) this).anIntArray9397[c];
	    i_0_ += ((Class172_Sub2) this).anIntArray9396[c];
	    int i_2_ = ((Class172_Sub2) this).anIntArray9395[c];
	    int i_3_ = ((Class172_Sub2) this).anIntArray9398[c];
	    int i_4_ = (111437289
			* ((Class173_Sub3) (((Class172_Sub2) this)
					    .aClass173_Sub3_9392)).anInt9735);
	    int i_5_ = i_4_ * i_0_ + i;
	    int i_6_ = i_4_ - i_2_;
	    int i_7_ = 0;
	    int i_8_ = 0;
	    if (i_0_
		< (((Class173_Sub3) ((Class172_Sub2) this).aClass173_Sub3_9392)
		   .anInt9725) * 592117349) {
		int i_9_ = ((((Class173_Sub3) (((Class172_Sub2) this)
					       .aClass173_Sub3_9392)).anInt9725
			     * 592117349)
			    - i_0_);
		i_3_ -= i_9_;
		i_0_ = 592117349 * (((Class173_Sub3) (((Class172_Sub2) this)
						      .aClass173_Sub3_9392))
				    .anInt9725);
		i_8_ += i_2_ * i_9_;
		i_5_ += i_4_ * i_9_;
	    }
	    if (i_3_ + i_0_
		> 6965409 * ((Class173_Sub3) (((Class172_Sub2) this)
					      .aClass173_Sub3_9392)).anInt9726)
		i_3_ -= (i_0_ + i_3_
			 - 6965409 * (((Class173_Sub3) (((Class172_Sub2) this)
							.aClass173_Sub3_9392))
				      .anInt9726));
	    if (i
		< (((Class173_Sub3) ((Class172_Sub2) this).aClass173_Sub3_9392)
		   .anInt9723) * -993497119) {
		int i_10_
		    = (-993497119 * (((Class173_Sub3) (((Class172_Sub2) this)
						       .aClass173_Sub3_9392))
				     .anInt9723)
		       - i);
		i_2_ -= i_10_;
		i = -993497119 * (((Class173_Sub3)
				   ((Class172_Sub2) this).aClass173_Sub3_9392)
				  .anInt9723);
		i_8_ += i_10_;
		i_5_ += i_10_;
		i_7_ += i_10_;
		i_6_ += i_10_;
	    }
	    if (i + i_2_
		> (((Class173_Sub3) ((Class172_Sub2) this).aClass173_Sub3_9392)
		   .anInt9724) * 630968029) {
		int i_11_
		    = (i + i_2_
		       - 630968029 * (((Class173_Sub3) (((Class172_Sub2) this)
							.aClass173_Sub3_9392))
				      .anInt9724));
		i_2_ -= i_11_;
		i_7_ += i_11_;
		i_6_ += i_11_;
	    }
	    if (i_2_ > 0 && i_3_ > 0) {
		if (bool)
		    method8731(((Class172_Sub2) this).aByteArrayArray9393[c],
			       (((Class173_Sub3)
				 ((Class172_Sub2) this).aClass173_Sub3_9392)
				.anIntArray9719),
			       i_1_, i_8_, i_5_, i_2_, i_3_, i_6_, i_7_);
		else
		    method8730(((Class172_Sub2) this).aByteArrayArray9393[c],
			       (((Class173_Sub3)
				 ((Class172_Sub2) this).aClass173_Sub3_9392)
				.anIntArray9719),
			       ((Class172_Sub2) this).anIntArray9394, i_8_,
			       i_5_, i_2_, i_3_, i_6_, i_7_);
	    }
	}
    }
    
    void method8730(byte[] is, int[] is_12_, int[] is_13_, int i, int i_14_,
		    int i_15_, int i_16_, int i_17_, int i_18_) {
	int i_19_ = -(i_15_ >> 2);
	i_15_ = -(i_15_ & 0x3);
	boolean bool = false;
	for (int i_20_ = -i_16_; i_20_ < 0; i_20_++) {
	    for (int i_21_ = i_19_; i_21_ < 0; i_21_++) {
		int i_22_;
		if ((i_22_ = is[i++]) != 0)
		    is_12_[i_14_++] = is_13_[i_22_ & 0xff];
		else
		    i_14_++;
		if ((i_22_ = is[i++]) != 0)
		    is_12_[i_14_++] = is_13_[i_22_ & 0xff];
		else
		    i_14_++;
		if ((i_22_ = is[i++]) != 0)
		    is_12_[i_14_++] = is_13_[i_22_ & 0xff];
		else
		    i_14_++;
		if ((i_22_ = is[i++]) != 0)
		    is_12_[i_14_++] = is_13_[i_22_ & 0xff];
		else
		    i_14_++;
	    }
	    for (int i_23_ = i_15_; i_23_ < 0; i_23_++) {
		int i_24_;
		if ((i_24_ = is[i++]) != 0)
		    is_12_[i_14_++] = is_13_[i_24_ & 0xff];
		else
		    i_14_++;
	    }
	    i_14_ += i_17_;
	    i += i_18_;
	}
    }
    
    void method8731(byte[] is, int[] is_25_, int i, int i_26_, int i_27_,
		    int i_28_, int i_29_, int i_30_, int i_31_) {
	int i_32_ = -(i_28_ >> 2);
	i_28_ = -(i_28_ & 0x3);
	for (int i_33_ = -i_29_; i_33_ < 0; i_33_++) {
	    for (int i_34_ = i_32_; i_34_ < 0; i_34_++) {
		if (is[i_26_++] != 0)
		    is_25_[i_27_++] = i;
		else
		    i_27_++;
		if (is[i_26_++] != 0)
		    is_25_[i_27_++] = i;
		else
		    i_27_++;
		if (is[i_26_++] != 0)
		    is_25_[i_27_++] = i;
		else
		    i_27_++;
		if (is[i_26_++] != 0)
		    is_25_[i_27_++] = i;
		else
		    i_27_++;
	    }
	    for (int i_35_ = i_28_; i_35_ < 0; i_35_++) {
		if (is[i_26_++] != 0)
		    is_25_[i_27_++] = i;
		else
		    i_27_++;
	    }
	    i_27_ += i_30_;
	    i_26_ += i_31_;
	}
    }
    
    void method2132(char c, int i, int i_36_, int i_37_, boolean bool,
		    Class148 class148, int i_38_, int i_39_) {
	if (null
	    != (((Class173_Sub3) ((Class172_Sub2) this).aClass173_Sub3_9392)
		.anIntArray9719)) {
	    if (null == class148)
		method2125(c, i, i_36_, i_37_, bool);
	    else {
		i += ((Class172_Sub2) this).anIntArray9397[c];
		i_36_ += ((Class172_Sub2) this).anIntArray9396[c];
		int i_40_ = ((Class172_Sub2) this).anIntArray9395[c];
		int i_41_ = ((Class172_Sub2) this).anIntArray9398[c];
		int i_42_
		    = (111437289
		       * ((Class173_Sub3) (((Class172_Sub2) this)
					   .aClass173_Sub3_9392)).anInt9735);
		int i_43_ = i_42_ * i_36_ + i;
		int i_44_ = i_42_ - i_40_;
		int i_45_ = 0;
		int i_46_ = 0;
		if (i_36_ < (((Class173_Sub3) (((Class172_Sub2) this)
					       .aClass173_Sub3_9392)).anInt9725
			     * 592117349)) {
		    int i_47_ = ((((Class173_Sub3)
				   ((Class172_Sub2) this).aClass173_Sub3_9392)
				  .anInt9725) * 592117349
				 - i_36_);
		    i_41_ -= i_47_;
		    i_36_
			= 592117349 * (((Class173_Sub3) (((Class172_Sub2) this)
							 .aClass173_Sub3_9392))
				       .anInt9725);
		    i_46_ += i_47_ * i_40_;
		    i_43_ += i_47_ * i_42_;
		}
		if (i_36_ + i_41_
		    > 6965409 * (((Class173_Sub3)
				  ((Class172_Sub2) this).aClass173_Sub3_9392)
				 .anInt9726))
		    i_41_ -= (i_41_ + i_36_
			      - (((Class173_Sub3)
				  ((Class172_Sub2) this).aClass173_Sub3_9392)
				 .anInt9726) * 6965409);
		if (i < (((Class173_Sub3)
			  ((Class172_Sub2) this).aClass173_Sub3_9392).anInt9723
			 * -993497119)) {
		    int i_48_ = ((((Class173_Sub3)
				   ((Class172_Sub2) this).aClass173_Sub3_9392)
				  .anInt9723) * -993497119
				 - i);
		    i_40_ -= i_48_;
		    i = (((Class173_Sub3)
			  ((Class172_Sub2) this).aClass173_Sub3_9392).anInt9723
			 * -993497119);
		    i_46_ += i_48_;
		    i_43_ += i_48_;
		    i_45_ += i_48_;
		    i_44_ += i_48_;
		}
		if (i_40_ + i > (((Class173_Sub3)
				  ((Class172_Sub2) this).aClass173_Sub3_9392)
				 .anInt9724) * 630968029) {
		    int i_49_
			= (i_40_ + i
			   - 630968029 * ((Class173_Sub3)
					  (((Class172_Sub2) this)
					   .aClass173_Sub3_9392)).anInt9724);
		    i_40_ -= i_49_;
		    i_45_ += i_49_;
		    i_44_ += i_49_;
		}
		if (i_40_ > 0 && i_41_ > 0) {
		    if (bool)
			method8732((((Class172_Sub2) this).aByteArrayArray9393
				    [c]),
				   (((Class173_Sub3) (((Class172_Sub2) this)
						      .aClass173_Sub3_9392))
				    .anIntArray9719),
				   i_37_, i_46_, i_43_, i_40_, i_41_, i_44_,
				   i_45_, i, i_36_,
				   ((Class172_Sub2) this).anIntArray9395[c],
				   class148, i_38_, i_39_);
		    else
			method8733((((Class172_Sub2) this).aByteArrayArray9393
				    [c]),
				   (((Class173_Sub3) (((Class172_Sub2) this)
						      .aClass173_Sub3_9392))
				    .anIntArray9719),
				   ((Class172_Sub2) this).anIntArray9394,
				   i_37_, i_46_, i_43_, i_40_, i_41_, i_44_,
				   i_45_, i, i_36_,
				   ((Class172_Sub2) this).anIntArray9395[c],
				   class148, i_38_, i_39_);
		}
	    }
	}
    }
    
    void method2137(char c, int i, int i_50_, int i_51_, boolean bool,
		    Class148 class148, int i_52_, int i_53_) {
	if (null
	    != (((Class173_Sub3) ((Class172_Sub2) this).aClass173_Sub3_9392)
		.anIntArray9719)) {
	    if (null == class148)
		method2125(c, i, i_50_, i_51_, bool);
	    else {
		i += ((Class172_Sub2) this).anIntArray9397[c];
		i_50_ += ((Class172_Sub2) this).anIntArray9396[c];
		int i_54_ = ((Class172_Sub2) this).anIntArray9395[c];
		int i_55_ = ((Class172_Sub2) this).anIntArray9398[c];
		int i_56_
		    = (111437289
		       * ((Class173_Sub3) (((Class172_Sub2) this)
					   .aClass173_Sub3_9392)).anInt9735);
		int i_57_ = i_56_ * i_50_ + i;
		int i_58_ = i_56_ - i_54_;
		int i_59_ = 0;
		int i_60_ = 0;
		if (i_50_ < (((Class173_Sub3) (((Class172_Sub2) this)
					       .aClass173_Sub3_9392)).anInt9725
			     * 592117349)) {
		    int i_61_ = ((((Class173_Sub3)
				   ((Class172_Sub2) this).aClass173_Sub3_9392)
				  .anInt9725) * 592117349
				 - i_50_);
		    i_55_ -= i_61_;
		    i_50_
			= 592117349 * (((Class173_Sub3) (((Class172_Sub2) this)
							 .aClass173_Sub3_9392))
				       .anInt9725);
		    i_60_ += i_61_ * i_54_;
		    i_57_ += i_61_ * i_56_;
		}
		if (i_50_ + i_55_
		    > 6965409 * (((Class173_Sub3)
				  ((Class172_Sub2) this).aClass173_Sub3_9392)
				 .anInt9726))
		    i_55_ -= (i_55_ + i_50_
			      - (((Class173_Sub3)
				  ((Class172_Sub2) this).aClass173_Sub3_9392)
				 .anInt9726) * 6965409);
		if (i < (((Class173_Sub3)
			  ((Class172_Sub2) this).aClass173_Sub3_9392).anInt9723
			 * -993497119)) {
		    int i_62_ = ((((Class173_Sub3)
				   ((Class172_Sub2) this).aClass173_Sub3_9392)
				  .anInt9723) * -993497119
				 - i);
		    i_54_ -= i_62_;
		    i = (((Class173_Sub3)
			  ((Class172_Sub2) this).aClass173_Sub3_9392).anInt9723
			 * -993497119);
		    i_60_ += i_62_;
		    i_57_ += i_62_;
		    i_59_ += i_62_;
		    i_58_ += i_62_;
		}
		if (i_54_ + i > (((Class173_Sub3)
				  ((Class172_Sub2) this).aClass173_Sub3_9392)
				 .anInt9724) * 630968029) {
		    int i_63_
			= (i_54_ + i
			   - 630968029 * ((Class173_Sub3)
					  (((Class172_Sub2) this)
					   .aClass173_Sub3_9392)).anInt9724);
		    i_54_ -= i_63_;
		    i_59_ += i_63_;
		    i_58_ += i_63_;
		}
		if (i_54_ > 0 && i_55_ > 0) {
		    if (bool)
			method8732((((Class172_Sub2) this).aByteArrayArray9393
				    [c]),
				   (((Class173_Sub3) (((Class172_Sub2) this)
						      .aClass173_Sub3_9392))
				    .anIntArray9719),
				   i_51_, i_60_, i_57_, i_54_, i_55_, i_58_,
				   i_59_, i, i_50_,
				   ((Class172_Sub2) this).anIntArray9395[c],
				   class148, i_52_, i_53_);
		    else
			method8733((((Class172_Sub2) this).aByteArrayArray9393
				    [c]),
				   (((Class173_Sub3) (((Class172_Sub2) this)
						      .aClass173_Sub3_9392))
				    .anIntArray9719),
				   ((Class172_Sub2) this).anIntArray9394,
				   i_51_, i_60_, i_57_, i_54_, i_55_, i_58_,
				   i_59_, i, i_50_,
				   ((Class172_Sub2) this).anIntArray9395[c],
				   class148, i_52_, i_53_);
		}
	    }
	}
    }
    
    void method8732(byte[] is, int[] is_64_, int i, int i_65_, int i_66_,
		    int i_67_, int i_68_, int i_69_, int i_70_, int i_71_,
		    int i_72_, int i_73_, Class148 class148, int i_74_,
		    int i_75_) {
	Class148_Sub1 class148_sub1 = (Class148_Sub1) class148;
	int[] is_76_ = ((Class148_Sub1) class148_sub1).anIntArray8789;
	int[] is_77_ = ((Class148_Sub1) class148_sub1).anIntArray8788;
	int i_78_
	    = (i_71_
	       - (((Class173_Sub3) ((Class172_Sub2) this).aClass173_Sub3_9392)
		  .anInt9723) * -993497119);
	int i_79_ = i_72_;
	if (i_75_ > i_79_) {
	    i_79_ = i_75_;
	    i_66_ += ((i_75_ - i_72_)
		      * (111437289 * (((Class173_Sub3) (((Class172_Sub2) this)
							.aClass173_Sub3_9392))
				      .anInt9735)));
	    i_65_ += i_73_ * (i_75_ - i_72_);
	}
	int i_80_ = (is_76_.length + i_75_ < i_68_ + i_72_
		     ? i_75_ + is_76_.length : i_68_ + i_72_);
	for (int i_81_ = i_79_; i_81_ < i_80_; i_81_++) {
	    int i_82_ = i_74_ + is_76_[i_81_ - i_75_];
	    int i_83_ = is_77_[i_81_ - i_75_];
	    int i_84_ = i_67_;
	    if (i_78_ > i_82_) {
		int i_85_ = i_78_ - i_82_;
		if (i_85_ >= i_83_) {
		    i_65_ += i_70_ + i_67_;
		    i_66_ += i_67_ + i_69_;
		    continue;
		}
		i_83_ -= i_85_;
	    } else {
		int i_86_ = i_82_ - i_78_;
		if (i_86_ >= i_67_) {
		    i_65_ += i_67_ + i_70_;
		    i_66_ += i_67_ + i_69_;
		    continue;
		}
		i_65_ += i_86_;
		i_84_ -= i_86_;
		i_66_ += i_86_;
	    }
	    int i_87_ = 0;
	    if (i_84_ < i_83_)
		i_83_ = i_84_;
	    else
		i_87_ = i_84_ - i_83_;
	    for (int i_88_ = -i_83_; i_88_ < 0; i_88_++) {
		if (is[i_65_++] != 0)
		    is_64_[i_66_++] = i;
		else
		    i_66_++;
	    }
	    i_65_ += i_65_ + i_87_;
	    i_66_ += i_87_ + i_69_;
	}
    }
    
    void method2129(char c, int i, int i_89_, int i_90_, boolean bool) {
	if (null
	    != (((Class173_Sub3) ((Class172_Sub2) this).aClass173_Sub3_9392)
		.anIntArray9719)) {
	    i += ((Class172_Sub2) this).anIntArray9397[c];
	    i_89_ += ((Class172_Sub2) this).anIntArray9396[c];
	    int i_91_ = ((Class172_Sub2) this).anIntArray9395[c];
	    int i_92_ = ((Class172_Sub2) this).anIntArray9398[c];
	    int i_93_ = (111437289
			 * ((Class173_Sub3) (((Class172_Sub2) this)
					     .aClass173_Sub3_9392)).anInt9735);
	    int i_94_ = i_93_ * i_89_ + i;
	    int i_95_ = i_93_ - i_91_;
	    int i_96_ = 0;
	    int i_97_ = 0;
	    if (i_89_
		< (((Class173_Sub3) ((Class172_Sub2) this).aClass173_Sub3_9392)
		   .anInt9725) * 592117349) {
		int i_98_ = ((((Class173_Sub3)
			       ((Class172_Sub2) this).aClass173_Sub3_9392)
			      .anInt9725) * 592117349
			     - i_89_);
		i_92_ -= i_98_;
		i_89_ = 592117349 * (((Class173_Sub3) (((Class172_Sub2) this)
						       .aClass173_Sub3_9392))
				     .anInt9725);
		i_97_ += i_91_ * i_98_;
		i_94_ += i_93_ * i_98_;
	    }
	    if (i_92_ + i_89_
		> 6965409 * ((Class173_Sub3) (((Class172_Sub2) this)
					      .aClass173_Sub3_9392)).anInt9726)
		i_92_ -= (i_89_ + i_92_
			  - 6965409 * (((Class173_Sub3) (((Class172_Sub2) this)
							 .aClass173_Sub3_9392))
				       .anInt9726));
	    if (i
		< (((Class173_Sub3) ((Class172_Sub2) this).aClass173_Sub3_9392)
		   .anInt9723) * -993497119) {
		int i_99_
		    = (-993497119 * (((Class173_Sub3) (((Class172_Sub2) this)
						       .aClass173_Sub3_9392))
				     .anInt9723)
		       - i);
		i_91_ -= i_99_;
		i = -993497119 * (((Class173_Sub3)
				   ((Class172_Sub2) this).aClass173_Sub3_9392)
				  .anInt9723);
		i_97_ += i_99_;
		i_94_ += i_99_;
		i_96_ += i_99_;
		i_95_ += i_99_;
	    }
	    if (i + i_91_
		> (((Class173_Sub3) ((Class172_Sub2) this).aClass173_Sub3_9392)
		   .anInt9724) * 630968029) {
		int i_100_
		    = (i + i_91_
		       - 630968029 * (((Class173_Sub3) (((Class172_Sub2) this)
							.aClass173_Sub3_9392))
				      .anInt9724));
		i_91_ -= i_100_;
		i_96_ += i_100_;
		i_95_ += i_100_;
	    }
	    if (i_91_ > 0 && i_92_ > 0) {
		if (bool)
		    method8731(((Class172_Sub2) this).aByteArrayArray9393[c],
			       (((Class173_Sub3)
				 ((Class172_Sub2) this).aClass173_Sub3_9392)
				.anIntArray9719),
			       i_90_, i_97_, i_94_, i_91_, i_92_, i_95_,
			       i_96_);
		else
		    method8730(((Class172_Sub2) this).aByteArrayArray9393[c],
			       (((Class173_Sub3)
				 ((Class172_Sub2) this).aClass173_Sub3_9392)
				.anIntArray9719),
			       ((Class172_Sub2) this).anIntArray9394, i_97_,
			       i_94_, i_91_, i_92_, i_95_, i_96_);
	    }
	}
    }
    
    void method2139(char c, int i, int i_101_, int i_102_, boolean bool,
		    Class148 class148, int i_103_, int i_104_) {
	if (null
	    != (((Class173_Sub3) ((Class172_Sub2) this).aClass173_Sub3_9392)
		.anIntArray9719)) {
	    if (null == class148)
		method2125(c, i, i_101_, i_102_, bool);
	    else {
		i += ((Class172_Sub2) this).anIntArray9397[c];
		i_101_ += ((Class172_Sub2) this).anIntArray9396[c];
		int i_105_ = ((Class172_Sub2) this).anIntArray9395[c];
		int i_106_ = ((Class172_Sub2) this).anIntArray9398[c];
		int i_107_
		    = (111437289
		       * ((Class173_Sub3) (((Class172_Sub2) this)
					   .aClass173_Sub3_9392)).anInt9735);
		int i_108_ = i_107_ * i_101_ + i;
		int i_109_ = i_107_ - i_105_;
		int i_110_ = 0;
		int i_111_ = 0;
		if (i_101_ < (((Class173_Sub3)
			       ((Class172_Sub2) this).aClass173_Sub3_9392)
			      .anInt9725) * 592117349) {
		    int i_112_ = ((((Class173_Sub3)
				    ((Class172_Sub2) this).aClass173_Sub3_9392)
				   .anInt9725) * 592117349
				  - i_101_);
		    i_106_ -= i_112_;
		    i_101_
			= 592117349 * (((Class173_Sub3) (((Class172_Sub2) this)
							 .aClass173_Sub3_9392))
				       .anInt9725);
		    i_111_ += i_112_ * i_105_;
		    i_108_ += i_112_ * i_107_;
		}
		if (i_101_ + i_106_
		    > 6965409 * (((Class173_Sub3)
				  ((Class172_Sub2) this).aClass173_Sub3_9392)
				 .anInt9726))
		    i_106_ -= (i_106_ + i_101_
			       - (((Class173_Sub3)
				   ((Class172_Sub2) this).aClass173_Sub3_9392)
				  .anInt9726) * 6965409);
		if (i < (((Class173_Sub3)
			  ((Class172_Sub2) this).aClass173_Sub3_9392).anInt9723
			 * -993497119)) {
		    int i_113_ = ((((Class173_Sub3)
				    ((Class172_Sub2) this).aClass173_Sub3_9392)
				   .anInt9723) * -993497119
				  - i);
		    i_105_ -= i_113_;
		    i = (((Class173_Sub3)
			  ((Class172_Sub2) this).aClass173_Sub3_9392).anInt9723
			 * -993497119);
		    i_111_ += i_113_;
		    i_108_ += i_113_;
		    i_110_ += i_113_;
		    i_109_ += i_113_;
		}
		if (i_105_ + i > (((Class173_Sub3)
				   ((Class172_Sub2) this).aClass173_Sub3_9392)
				  .anInt9724) * 630968029) {
		    int i_114_
			= (i_105_ + i
			   - 630968029 * ((Class173_Sub3)
					  (((Class172_Sub2) this)
					   .aClass173_Sub3_9392)).anInt9724);
		    i_105_ -= i_114_;
		    i_110_ += i_114_;
		    i_109_ += i_114_;
		}
		if (i_105_ > 0 && i_106_ > 0) {
		    if (bool)
			method8732((((Class172_Sub2) this).aByteArrayArray9393
				    [c]),
				   (((Class173_Sub3) (((Class172_Sub2) this)
						      .aClass173_Sub3_9392))
				    .anIntArray9719),
				   i_102_, i_111_, i_108_, i_105_, i_106_,
				   i_109_, i_110_, i, i_101_,
				   ((Class172_Sub2) this).anIntArray9395[c],
				   class148, i_103_, i_104_);
		    else
			method8733((((Class172_Sub2) this).aByteArrayArray9393
				    [c]),
				   (((Class173_Sub3) (((Class172_Sub2) this)
						      .aClass173_Sub3_9392))
				    .anIntArray9719),
				   ((Class172_Sub2) this).anIntArray9394,
				   i_102_, i_111_, i_108_, i_105_, i_106_,
				   i_109_, i_110_, i, i_101_,
				   ((Class172_Sub2) this).anIntArray9395[c],
				   class148, i_103_, i_104_);
		}
	    }
	}
    }
    
    void method2136(char c, int i, int i_115_, int i_116_, boolean bool,
		    Class148 class148, int i_117_, int i_118_) {
	if (null
	    != (((Class173_Sub3) ((Class172_Sub2) this).aClass173_Sub3_9392)
		.anIntArray9719)) {
	    if (null == class148)
		method2125(c, i, i_115_, i_116_, bool);
	    else {
		i += ((Class172_Sub2) this).anIntArray9397[c];
		i_115_ += ((Class172_Sub2) this).anIntArray9396[c];
		int i_119_ = ((Class172_Sub2) this).anIntArray9395[c];
		int i_120_ = ((Class172_Sub2) this).anIntArray9398[c];
		int i_121_
		    = (111437289
		       * ((Class173_Sub3) (((Class172_Sub2) this)
					   .aClass173_Sub3_9392)).anInt9735);
		int i_122_ = i_121_ * i_115_ + i;
		int i_123_ = i_121_ - i_119_;
		int i_124_ = 0;
		int i_125_ = 0;
		if (i_115_ < (((Class173_Sub3)
			       ((Class172_Sub2) this).aClass173_Sub3_9392)
			      .anInt9725) * 592117349) {
		    int i_126_ = ((((Class173_Sub3)
				    ((Class172_Sub2) this).aClass173_Sub3_9392)
				   .anInt9725) * 592117349
				  - i_115_);
		    i_120_ -= i_126_;
		    i_115_
			= 592117349 * (((Class173_Sub3) (((Class172_Sub2) this)
							 .aClass173_Sub3_9392))
				       .anInt9725);
		    i_125_ += i_126_ * i_119_;
		    i_122_ += i_126_ * i_121_;
		}
		if (i_115_ + i_120_
		    > 6965409 * (((Class173_Sub3)
				  ((Class172_Sub2) this).aClass173_Sub3_9392)
				 .anInt9726))
		    i_120_ -= (i_120_ + i_115_
			       - (((Class173_Sub3)
				   ((Class172_Sub2) this).aClass173_Sub3_9392)
				  .anInt9726) * 6965409);
		if (i < (((Class173_Sub3)
			  ((Class172_Sub2) this).aClass173_Sub3_9392).anInt9723
			 * -993497119)) {
		    int i_127_ = ((((Class173_Sub3)
				    ((Class172_Sub2) this).aClass173_Sub3_9392)
				   .anInt9723) * -993497119
				  - i);
		    i_119_ -= i_127_;
		    i = (((Class173_Sub3)
			  ((Class172_Sub2) this).aClass173_Sub3_9392).anInt9723
			 * -993497119);
		    i_125_ += i_127_;
		    i_122_ += i_127_;
		    i_124_ += i_127_;
		    i_123_ += i_127_;
		}
		if (i_119_ + i > (((Class173_Sub3)
				   ((Class172_Sub2) this).aClass173_Sub3_9392)
				  .anInt9724) * 630968029) {
		    int i_128_
			= (i_119_ + i
			   - 630968029 * ((Class173_Sub3)
					  (((Class172_Sub2) this)
					   .aClass173_Sub3_9392)).anInt9724);
		    i_119_ -= i_128_;
		    i_124_ += i_128_;
		    i_123_ += i_128_;
		}
		if (i_119_ > 0 && i_120_ > 0) {
		    if (bool)
			method8732((((Class172_Sub2) this).aByteArrayArray9393
				    [c]),
				   (((Class173_Sub3) (((Class172_Sub2) this)
						      .aClass173_Sub3_9392))
				    .anIntArray9719),
				   i_116_, i_125_, i_122_, i_119_, i_120_,
				   i_123_, i_124_, i, i_115_,
				   ((Class172_Sub2) this).anIntArray9395[c],
				   class148, i_117_, i_118_);
		    else
			method8733((((Class172_Sub2) this).aByteArrayArray9393
				    [c]),
				   (((Class173_Sub3) (((Class172_Sub2) this)
						      .aClass173_Sub3_9392))
				    .anIntArray9719),
				   ((Class172_Sub2) this).anIntArray9394,
				   i_116_, i_125_, i_122_, i_119_, i_120_,
				   i_123_, i_124_, i, i_115_,
				   ((Class172_Sub2) this).anIntArray9395[c],
				   class148, i_117_, i_118_);
		}
	    }
	}
    }
    
    Class172_Sub2(Class173_Sub3 class173_sub3, Class1 class1,
		  Class178_Sub2[] class178_sub2s, int[] is, int[] is_129_) {
	super(class173_sub3, class1);
	((Class172_Sub2) this).aClass173_Sub3_9392 = class173_sub3;
	((Class172_Sub2) this).aClass173_Sub3_9392 = class173_sub3;
	((Class172_Sub2) this).anIntArray9395 = is;
	((Class172_Sub2) this).anIntArray9398 = is_129_;
	((Class172_Sub2) this).aByteArrayArray9393
	    = new byte[class178_sub2s.length][];
	((Class172_Sub2) this).anIntArray9396 = new int[class178_sub2s.length];
	((Class172_Sub2) this).anIntArray9397 = new int[class178_sub2s.length];
	for (int i = 0; i < class178_sub2s.length; i++) {
	    ((Class172_Sub2) this).aByteArrayArray9393[i]
		= class178_sub2s[i].aByteArray9770;
	    ((Class172_Sub2) this).anIntArray9396[i]
		= class178_sub2s[i].anInt9765;
	    ((Class172_Sub2) this).anIntArray9397[i]
		= class178_sub2s[i].anInt9767;
	}
	((Class172_Sub2) this).anIntArray9394
	    = class178_sub2s[0].anIntArray9769;
    }
    
    void method2138(char c, int i, int i_130_, int i_131_, boolean bool,
		    Class148 class148, int i_132_, int i_133_) {
	if (null
	    != (((Class173_Sub3) ((Class172_Sub2) this).aClass173_Sub3_9392)
		.anIntArray9719)) {
	    if (null == class148)
		method2125(c, i, i_130_, i_131_, bool);
	    else {
		i += ((Class172_Sub2) this).anIntArray9397[c];
		i_130_ += ((Class172_Sub2) this).anIntArray9396[c];
		int i_134_ = ((Class172_Sub2) this).anIntArray9395[c];
		int i_135_ = ((Class172_Sub2) this).anIntArray9398[c];
		int i_136_
		    = (111437289
		       * ((Class173_Sub3) (((Class172_Sub2) this)
					   .aClass173_Sub3_9392)).anInt9735);
		int i_137_ = i_136_ * i_130_ + i;
		int i_138_ = i_136_ - i_134_;
		int i_139_ = 0;
		int i_140_ = 0;
		if (i_130_ < (((Class173_Sub3)
			       ((Class172_Sub2) this).aClass173_Sub3_9392)
			      .anInt9725) * 592117349) {
		    int i_141_ = ((((Class173_Sub3)
				    ((Class172_Sub2) this).aClass173_Sub3_9392)
				   .anInt9725) * 592117349
				  - i_130_);
		    i_135_ -= i_141_;
		    i_130_
			= 592117349 * (((Class173_Sub3) (((Class172_Sub2) this)
							 .aClass173_Sub3_9392))
				       .anInt9725);
		    i_140_ += i_141_ * i_134_;
		    i_137_ += i_141_ * i_136_;
		}
		if (i_130_ + i_135_
		    > 6965409 * (((Class173_Sub3)
				  ((Class172_Sub2) this).aClass173_Sub3_9392)
				 .anInt9726))
		    i_135_ -= (i_135_ + i_130_
			       - (((Class173_Sub3)
				   ((Class172_Sub2) this).aClass173_Sub3_9392)
				  .anInt9726) * 6965409);
		if (i < (((Class173_Sub3)
			  ((Class172_Sub2) this).aClass173_Sub3_9392).anInt9723
			 * -993497119)) {
		    int i_142_ = ((((Class173_Sub3)
				    ((Class172_Sub2) this).aClass173_Sub3_9392)
				   .anInt9723) * -993497119
				  - i);
		    i_134_ -= i_142_;
		    i = (((Class173_Sub3)
			  ((Class172_Sub2) this).aClass173_Sub3_9392).anInt9723
			 * -993497119);
		    i_140_ += i_142_;
		    i_137_ += i_142_;
		    i_139_ += i_142_;
		    i_138_ += i_142_;
		}
		if (i_134_ + i > (((Class173_Sub3)
				   ((Class172_Sub2) this).aClass173_Sub3_9392)
				  .anInt9724) * 630968029) {
		    int i_143_
			= (i_134_ + i
			   - 630968029 * ((Class173_Sub3)
					  (((Class172_Sub2) this)
					   .aClass173_Sub3_9392)).anInt9724);
		    i_134_ -= i_143_;
		    i_139_ += i_143_;
		    i_138_ += i_143_;
		}
		if (i_134_ > 0 && i_135_ > 0) {
		    if (bool)
			method8732((((Class172_Sub2) this).aByteArrayArray9393
				    [c]),
				   (((Class173_Sub3) (((Class172_Sub2) this)
						      .aClass173_Sub3_9392))
				    .anIntArray9719),
				   i_131_, i_140_, i_137_, i_134_, i_135_,
				   i_138_, i_139_, i, i_130_,
				   ((Class172_Sub2) this).anIntArray9395[c],
				   class148, i_132_, i_133_);
		    else
			method8733((((Class172_Sub2) this).aByteArrayArray9393
				    [c]),
				   (((Class173_Sub3) (((Class172_Sub2) this)
						      .aClass173_Sub3_9392))
				    .anIntArray9719),
				   ((Class172_Sub2) this).anIntArray9394,
				   i_131_, i_140_, i_137_, i_134_, i_135_,
				   i_138_, i_139_, i, i_130_,
				   ((Class172_Sub2) this).anIntArray9395[c],
				   class148, i_132_, i_133_);
		}
	    }
	}
    }
    
    void method2134(char c, int i, int i_144_, int i_145_, boolean bool) {
	if (null
	    != (((Class173_Sub3) ((Class172_Sub2) this).aClass173_Sub3_9392)
		.anIntArray9719)) {
	    i += ((Class172_Sub2) this).anIntArray9397[c];
	    i_144_ += ((Class172_Sub2) this).anIntArray9396[c];
	    int i_146_ = ((Class172_Sub2) this).anIntArray9395[c];
	    int i_147_ = ((Class172_Sub2) this).anIntArray9398[c];
	    int i_148_ = 111437289 * (((Class173_Sub3) (((Class172_Sub2) this)
							.aClass173_Sub3_9392))
				      .anInt9735);
	    int i_149_ = i_148_ * i_144_ + i;
	    int i_150_ = i_148_ - i_146_;
	    int i_151_ = 0;
	    int i_152_ = 0;
	    if (i_144_
		< (((Class173_Sub3) ((Class172_Sub2) this).aClass173_Sub3_9392)
		   .anInt9725) * 592117349) {
		int i_153_ = ((((Class173_Sub3)
				((Class172_Sub2) this).aClass173_Sub3_9392)
			       .anInt9725) * 592117349
			      - i_144_);
		i_147_ -= i_153_;
		i_144_ = 592117349 * (((Class173_Sub3) (((Class172_Sub2) this)
							.aClass173_Sub3_9392))
				      .anInt9725);
		i_152_ += i_146_ * i_153_;
		i_149_ += i_148_ * i_153_;
	    }
	    if (i_147_ + i_144_
		> 6965409 * ((Class173_Sub3) (((Class172_Sub2) this)
					      .aClass173_Sub3_9392)).anInt9726)
		i_147_ -= i_144_ + i_147_ - 6965409 * (((Class173_Sub3)
							(((Class172_Sub2) this)
							 .aClass173_Sub3_9392))
						       .anInt9726);
	    if (i
		< (((Class173_Sub3) ((Class172_Sub2) this).aClass173_Sub3_9392)
		   .anInt9723) * -993497119) {
		int i_154_
		    = (-993497119 * (((Class173_Sub3) (((Class172_Sub2) this)
						       .aClass173_Sub3_9392))
				     .anInt9723)
		       - i);
		i_146_ -= i_154_;
		i = -993497119 * (((Class173_Sub3)
				   ((Class172_Sub2) this).aClass173_Sub3_9392)
				  .anInt9723);
		i_152_ += i_154_;
		i_149_ += i_154_;
		i_151_ += i_154_;
		i_150_ += i_154_;
	    }
	    if (i + i_146_
		> (((Class173_Sub3) ((Class172_Sub2) this).aClass173_Sub3_9392)
		   .anInt9724) * 630968029) {
		int i_155_
		    = (i + i_146_
		       - 630968029 * (((Class173_Sub3) (((Class172_Sub2) this)
							.aClass173_Sub3_9392))
				      .anInt9724));
		i_146_ -= i_155_;
		i_151_ += i_155_;
		i_150_ += i_155_;
	    }
	    if (i_146_ > 0 && i_147_ > 0) {
		if (bool)
		    method8731(((Class172_Sub2) this).aByteArrayArray9393[c],
			       (((Class173_Sub3)
				 ((Class172_Sub2) this).aClass173_Sub3_9392)
				.anIntArray9719),
			       i_145_, i_152_, i_149_, i_146_, i_147_, i_150_,
			       i_151_);
		else
		    method8730(((Class172_Sub2) this).aByteArrayArray9393[c],
			       (((Class173_Sub3)
				 ((Class172_Sub2) this).aClass173_Sub3_9392)
				.anIntArray9719),
			       ((Class172_Sub2) this).anIntArray9394, i_152_,
			       i_149_, i_146_, i_147_, i_150_, i_151_);
	    }
	}
    }
    
    void method2135(char c, int i, int i_156_, int i_157_, boolean bool) {
	if (null
	    != (((Class173_Sub3) ((Class172_Sub2) this).aClass173_Sub3_9392)
		.anIntArray9719)) {
	    i += ((Class172_Sub2) this).anIntArray9397[c];
	    i_156_ += ((Class172_Sub2) this).anIntArray9396[c];
	    int i_158_ = ((Class172_Sub2) this).anIntArray9395[c];
	    int i_159_ = ((Class172_Sub2) this).anIntArray9398[c];
	    int i_160_ = 111437289 * (((Class173_Sub3) (((Class172_Sub2) this)
							.aClass173_Sub3_9392))
				      .anInt9735);
	    int i_161_ = i_160_ * i_156_ + i;
	    int i_162_ = i_160_ - i_158_;
	    int i_163_ = 0;
	    int i_164_ = 0;
	    if (i_156_
		< (((Class173_Sub3) ((Class172_Sub2) this).aClass173_Sub3_9392)
		   .anInt9725) * 592117349) {
		int i_165_ = ((((Class173_Sub3)
				((Class172_Sub2) this).aClass173_Sub3_9392)
			       .anInt9725) * 592117349
			      - i_156_);
		i_159_ -= i_165_;
		i_156_ = 592117349 * (((Class173_Sub3) (((Class172_Sub2) this)
							.aClass173_Sub3_9392))
				      .anInt9725);
		i_164_ += i_158_ * i_165_;
		i_161_ += i_160_ * i_165_;
	    }
	    if (i_159_ + i_156_
		> 6965409 * ((Class173_Sub3) (((Class172_Sub2) this)
					      .aClass173_Sub3_9392)).anInt9726)
		i_159_ -= i_156_ + i_159_ - 6965409 * (((Class173_Sub3)
							(((Class172_Sub2) this)
							 .aClass173_Sub3_9392))
						       .anInt9726);
	    if (i
		< (((Class173_Sub3) ((Class172_Sub2) this).aClass173_Sub3_9392)
		   .anInt9723) * -993497119) {
		int i_166_
		    = (-993497119 * (((Class173_Sub3) (((Class172_Sub2) this)
						       .aClass173_Sub3_9392))
				     .anInt9723)
		       - i);
		i_158_ -= i_166_;
		i = -993497119 * (((Class173_Sub3)
				   ((Class172_Sub2) this).aClass173_Sub3_9392)
				  .anInt9723);
		i_164_ += i_166_;
		i_161_ += i_166_;
		i_163_ += i_166_;
		i_162_ += i_166_;
	    }
	    if (i + i_158_
		> (((Class173_Sub3) ((Class172_Sub2) this).aClass173_Sub3_9392)
		   .anInt9724) * 630968029) {
		int i_167_
		    = (i + i_158_
		       - 630968029 * (((Class173_Sub3) (((Class172_Sub2) this)
							.aClass173_Sub3_9392))
				      .anInt9724));
		i_158_ -= i_167_;
		i_163_ += i_167_;
		i_162_ += i_167_;
	    }
	    if (i_158_ > 0 && i_159_ > 0) {
		if (bool)
		    method8731(((Class172_Sub2) this).aByteArrayArray9393[c],
			       (((Class173_Sub3)
				 ((Class172_Sub2) this).aClass173_Sub3_9392)
				.anIntArray9719),
			       i_157_, i_164_, i_161_, i_158_, i_159_, i_162_,
			       i_163_);
		else
		    method8730(((Class172_Sub2) this).aByteArrayArray9393[c],
			       (((Class173_Sub3)
				 ((Class172_Sub2) this).aClass173_Sub3_9392)
				.anIntArray9719),
			       ((Class172_Sub2) this).anIntArray9394, i_164_,
			       i_161_, i_158_, i_159_, i_162_, i_163_);
	    }
	}
    }
    
    void method8733(byte[] is, int[] is_168_, int[] is_169_, int i, int i_170_,
		    int i_171_, int i_172_, int i_173_, int i_174_, int i_175_,
		    int i_176_, int i_177_, int i_178_, Class148 class148,
		    int i_179_, int i_180_) {
	Class148_Sub1 class148_sub1 = (Class148_Sub1) class148;
	int[] is_181_ = ((Class148_Sub1) class148_sub1).anIntArray8789;
	int[] is_182_ = ((Class148_Sub1) class148_sub1).anIntArray8788;
	int i_183_
	    = i_176_ - -993497119 * (((Class173_Sub3) (((Class172_Sub2) this)
						       .aClass173_Sub3_9392))
				     .anInt9723);
	int i_184_ = i_177_;
	if (i_180_ > i_184_) {
	    i_184_ = i_180_;
	    i_171_ += (((Class173_Sub3)
			((Class172_Sub2) this).aClass173_Sub3_9392).anInt9735
		       * 111437289 * (i_180_ - i_177_));
	    i_170_ += (i_180_ - i_177_) * i_178_;
	}
	int i_185_ = (is_181_.length + i_180_ < i_173_ + i_177_
		      ? i_180_ + is_181_.length : i_173_ + i_177_);
	boolean bool = false;
	for (int i_186_ = i_184_; i_186_ < i_185_; i_186_++) {
	    int i_187_ = is_181_[i_186_ - i_180_] + i_179_;
	    int i_188_ = is_182_[i_186_ - i_180_];
	    int i_189_ = i_172_;
	    if (i_183_ > i_187_) {
		int i_190_ = i_183_ - i_187_;
		if (i_190_ >= i_188_) {
		    i_170_ += i_175_ + i_172_;
		    i_171_ += i_174_ + i_172_;
		    continue;
		}
		i_188_ -= i_190_;
	    } else {
		int i_191_ = i_187_ - i_183_;
		if (i_191_ >= i_172_) {
		    i_170_ += i_175_ + i_172_;
		    i_171_ += i_172_ + i_174_;
		    continue;
		}
		i_170_ += i_191_;
		i_189_ -= i_191_;
		i_171_ += i_191_;
	    }
	    int i_192_ = 0;
	    if (i_189_ < i_188_)
		i_188_ = i_189_;
	    else
		i_192_ = i_189_ - i_188_;
	    for (int i_193_ = -i_188_; i_193_ < 0; i_193_++) {
		int i_194_;
		if ((i_194_ = is[i_170_++]) != 0)
		    is_168_[i_171_++] = is_169_[i_194_ & 0xff];
		else
		    i_171_++;
	    }
	    i_170_ += i_175_ + i_192_;
	    i_171_ += i_192_ + i_174_;
	}
    }
    
    static final void method8734(Class648 class648, byte i) {
	((Class648) class648).anInt8410 -= -1094513834;
	String string
	    = (String) (((Class648) class648).anObjectArray8396
			[-520794877 * ((Class648) class648).anInt8410]);
	String string_195_
	    = (String) (((Class648) class648).anObjectArray8396
			[((Class648) class648).anInt8410 * -520794877 + 1]);
	if (Class108.myPlayer.model != null
	    && (Class108.myPlayer.model
		.aBool7967))
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= string_195_;
	else
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= string;
    }
}
