/* Class172_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class172_Sub3 extends Class172
{
    int[] anIntArray9611;
    byte[][] aByteArrayArray9612;
    Class173_Sub3 aClass173_Sub3_9613;
    int[] anIntArray9614;
    int[] anIntArray9615;
    int[] anIntArray9616;
    
    void method2138(char c, int i, int i_0_, int i_1_, boolean bool,
		    Class148 class148, int i_2_, int i_3_) {
	if (null
	    != (((Class173_Sub3) ((Class172_Sub3) this).aClass173_Sub3_9613)
		.anIntArray9719)) {
	    if (null == class148)
		method2125(c, i, i_0_, i_1_, bool);
	    else {
		i += ((Class172_Sub3) this).anIntArray9611[c];
		i_0_ += ((Class172_Sub3) this).anIntArray9616[c];
		int i_4_ = ((Class172_Sub3) this).anIntArray9614[c];
		int i_5_ = ((Class172_Sub3) this).anIntArray9615[c];
		int i_6_ = (((Class173_Sub3) (((Class172_Sub3) this)
					      .aClass173_Sub3_9613)).anInt9735
			    * 111437289);
		int i_7_ = i_6_ * i_0_ + i;
		int i_8_ = i_6_ - i_4_;
		int i_9_ = 0;
		int i_10_ = 0;
		if (i_0_
		    < 592117349 * (((Class173_Sub3)
				    ((Class172_Sub3) this).aClass173_Sub3_9613)
				   .anInt9725)) {
		    int i_11_
			= 592117349 * (((Class173_Sub3) (((Class172_Sub3) this)
							 .aClass173_Sub3_9613))
				       .anInt9725) - i_0_;
		    i_5_ -= i_11_;
		    i_0_
			= 592117349 * (((Class173_Sub3) (((Class172_Sub3) this)
							 .aClass173_Sub3_9613))
				       .anInt9725);
		    i_10_ += i_4_ * i_11_;
		    i_7_ += i_11_ * i_6_;
		}
		if (i_5_ + i_0_ > (((Class173_Sub3)
				    ((Class172_Sub3) this).aClass173_Sub3_9613)
				   .anInt9726) * 6965409)
		    i_5_ -= i_0_ + i_5_ - 6965409 * (((Class173_Sub3)
						      (((Class172_Sub3) this)
						       .aClass173_Sub3_9613))
						     .anInt9726);
		if (i < (((Class173_Sub3)
			  ((Class172_Sub3) this).aClass173_Sub3_9613).anInt9723
			 * -993497119)) {
		    int i_12_
			= (-993497119 * ((Class173_Sub3)
					 (((Class172_Sub3) this)
					  .aClass173_Sub3_9613)).anInt9723
			   - i);
		    i_4_ -= i_12_;
		    i = -993497119 * (((Class173_Sub3) (((Class172_Sub3) this)
							.aClass173_Sub3_9613))
				      .anInt9723);
		    i_10_ += i_12_;
		    i_7_ += i_12_;
		    i_9_ += i_12_;
		    i_8_ += i_12_;
		}
		if (i + i_4_
		    > 630968029 * (((Class173_Sub3)
				    ((Class172_Sub3) this).aClass173_Sub3_9613)
				   .anInt9724)) {
		    int i_13_
			= i + i_4_ - (((Class173_Sub3) (((Class172_Sub3) this)
							.aClass173_Sub3_9613))
				      .anInt9724) * 630968029;
		    i_4_ -= i_13_;
		    i_9_ += i_13_;
		    i_8_ += i_13_;
		}
		if (i_4_ > 0 && i_5_ > 0)
		    method8876(((Class172_Sub3) this).aByteArrayArray9612[c],
			       (((Class173_Sub3)
				 ((Class172_Sub3) this).aClass173_Sub3_9613)
				.anIntArray9719),
			       i_1_, i_10_, i_7_, i_4_, i_5_, i_8_, i_9_, i,
			       i_0_, ((Class172_Sub3) this).anIntArray9614[c],
			       class148, i_2_, i_3_);
	    }
	}
    }
    
    Class172_Sub3(Class173_Sub3 class173_sub3, Class1 class1,
		  Class178_Sub2[] class178_sub2s, int[] is, int[] is_14_) {
	super(class173_sub3, class1);
	((Class172_Sub3) this).aClass173_Sub3_9613 = class173_sub3;
	((Class172_Sub3) this).aClass173_Sub3_9613 = class173_sub3;
	((Class172_Sub3) this).anIntArray9614 = is;
	((Class172_Sub3) this).anIntArray9615 = is_14_;
	((Class172_Sub3) this).aByteArrayArray9612
	    = new byte[class178_sub2s.length][];
	((Class172_Sub3) this).anIntArray9616 = new int[class178_sub2s.length];
	((Class172_Sub3) this).anIntArray9611 = new int[class178_sub2s.length];
	for (int i = 0; i < class178_sub2s.length; i++) {
	    Class178_Sub2 class178_sub2 = class178_sub2s[i];
	    if (null != class178_sub2.aByteArray9773)
		((Class172_Sub3) this).aByteArrayArray9612[i]
		    = class178_sub2.aByteArray9773;
	    else {
		byte[] is_15_ = class178_sub2.aByteArray9770;
		byte[] is_16_ = (((Class172_Sub3) this).aByteArrayArray9612[i]
				 = new byte[is_15_.length]);
		for (int i_17_ = 0; i_17_ < is_15_.length; i_17_++)
		    is_16_[i_17_] = (byte) (is_15_[i_17_] == 0 ? 0 : -1);
	    }
	    ((Class172_Sub3) this).anIntArray9616[i] = class178_sub2.anInt9765;
	    ((Class172_Sub3) this).anIntArray9611[i] = class178_sub2.anInt9767;
	}
    }
    
    void method2125(char c, int i, int i_18_, int i_19_, boolean bool) {
	if ((((Class173_Sub3) ((Class172_Sub3) this).aClass173_Sub3_9613)
	     .anIntArray9719)
	    != null) {
	    i += ((Class172_Sub3) this).anIntArray9611[c];
	    i_18_ += ((Class172_Sub3) this).anIntArray9616[c];
	    int i_20_ = ((Class172_Sub3) this).anIntArray9614[c];
	    int i_21_ = ((Class172_Sub3) this).anIntArray9615[c];
	    int i_22_ = (111437289
			 * ((Class173_Sub3) (((Class172_Sub3) this)
					     .aClass173_Sub3_9613)).anInt9735);
	    int i_23_ = i + i_22_ * i_18_;
	    int i_24_ = i_22_ - i_20_;
	    int i_25_ = 0;
	    int i_26_ = 0;
	    if (i_18_ < 592117349 * (((Class173_Sub3) (((Class172_Sub3) this)
						       .aClass173_Sub3_9613))
				     .anInt9725)) {
		int i_27_
		    = (592117349 * (((Class173_Sub3) (((Class172_Sub3) this)
						      .aClass173_Sub3_9613))
				    .anInt9725)
		       - i_18_);
		i_21_ -= i_27_;
		i_18_ = 592117349 * (((Class173_Sub3) (((Class172_Sub3) this)
						       .aClass173_Sub3_9613))
				     .anInt9725);
		i_26_ += i_20_ * i_27_;
		i_23_ += i_22_ * i_27_;
	    }
	    if (i_21_ + i_18_
		> (((Class173_Sub3) ((Class172_Sub3) this).aClass173_Sub3_9613)
		   .anInt9726) * 6965409)
		i_21_ -= (i_18_ + i_21_
			  - 6965409 * (((Class173_Sub3) (((Class172_Sub3) this)
							 .aClass173_Sub3_9613))
				       .anInt9726));
	    if (i < -993497119 * (((Class173_Sub3)
				   ((Class172_Sub3) this).aClass173_Sub3_9613)
				  .anInt9723)) {
		int i_28_ = ((((Class173_Sub3)
			       ((Class172_Sub3) this).aClass173_Sub3_9613)
			      .anInt9723) * -993497119
			     - i);
		i_20_ -= i_28_;
		i = (((Class173_Sub3)
		      ((Class172_Sub3) this).aClass173_Sub3_9613).anInt9723
		     * -993497119);
		i_26_ += i_28_;
		i_23_ += i_28_;
		i_25_ += i_28_;
		i_24_ += i_28_;
	    }
	    if (i + i_20_
		> 630968029 * (((Class173_Sub3)
				((Class172_Sub3) this).aClass173_Sub3_9613)
			       .anInt9724)) {
		int i_29_
		    = (i_20_ + i
		       - 630968029 * (((Class173_Sub3) (((Class172_Sub3) this)
							.aClass173_Sub3_9613))
				      .anInt9724));
		i_20_ -= i_29_;
		i_25_ += i_29_;
		i_24_ += i_29_;
	    }
	    if (i_20_ > 0 && i_21_ > 0)
		method8878(((Class172_Sub3) this).aByteArrayArray9612[c],
			   (((Class173_Sub3)
			     ((Class172_Sub3) this).aClass173_Sub3_9613)
			    .anIntArray9719),
			   i_19_, i_26_, i_23_, i_20_, i_21_, i_24_, i_25_);
	}
    }
    
    void method2132(char c, int i, int i_30_, int i_31_, boolean bool,
		    Class148 class148, int i_32_, int i_33_) {
	if (null
	    != (((Class173_Sub3) ((Class172_Sub3) this).aClass173_Sub3_9613)
		.anIntArray9719)) {
	    if (null == class148)
		method2125(c, i, i_30_, i_31_, bool);
	    else {
		i += ((Class172_Sub3) this).anIntArray9611[c];
		i_30_ += ((Class172_Sub3) this).anIntArray9616[c];
		int i_34_ = ((Class172_Sub3) this).anIntArray9614[c];
		int i_35_ = ((Class172_Sub3) this).anIntArray9615[c];
		int i_36_ = (((Class173_Sub3) (((Class172_Sub3) this)
					       .aClass173_Sub3_9613)).anInt9735
			     * 111437289);
		int i_37_ = i_36_ * i_30_ + i;
		int i_38_ = i_36_ - i_34_;
		int i_39_ = 0;
		int i_40_ = 0;
		if (i_30_
		    < 592117349 * (((Class173_Sub3)
				    ((Class172_Sub3) this).aClass173_Sub3_9613)
				   .anInt9725)) {
		    int i_41_
			= 592117349 * (((Class173_Sub3) (((Class172_Sub3) this)
							 .aClass173_Sub3_9613))
				       .anInt9725) - i_30_;
		    i_35_ -= i_41_;
		    i_30_
			= 592117349 * (((Class173_Sub3) (((Class172_Sub3) this)
							 .aClass173_Sub3_9613))
				       .anInt9725);
		    i_40_ += i_34_ * i_41_;
		    i_37_ += i_41_ * i_36_;
		}
		if (i_35_ + i_30_ > (((Class173_Sub3) (((Class172_Sub3) this)
						       .aClass173_Sub3_9613))
				     .anInt9726) * 6965409)
		    i_35_
			-= i_30_ + i_35_ - 6965409 * (((Class173_Sub3)
						       (((Class172_Sub3) this)
							.aClass173_Sub3_9613))
						      .anInt9726);
		if (i < (((Class173_Sub3)
			  ((Class172_Sub3) this).aClass173_Sub3_9613).anInt9723
			 * -993497119)) {
		    int i_42_
			= (-993497119 * ((Class173_Sub3)
					 (((Class172_Sub3) this)
					  .aClass173_Sub3_9613)).anInt9723
			   - i);
		    i_34_ -= i_42_;
		    i = -993497119 * (((Class173_Sub3) (((Class172_Sub3) this)
							.aClass173_Sub3_9613))
				      .anInt9723);
		    i_40_ += i_42_;
		    i_37_ += i_42_;
		    i_39_ += i_42_;
		    i_38_ += i_42_;
		}
		if (i + i_34_
		    > 630968029 * (((Class173_Sub3)
				    ((Class172_Sub3) this).aClass173_Sub3_9613)
				   .anInt9724)) {
		    int i_43_
			= i + i_34_ - (((Class173_Sub3) (((Class172_Sub3) this)
							 .aClass173_Sub3_9613))
				       .anInt9724) * 630968029;
		    i_34_ -= i_43_;
		    i_39_ += i_43_;
		    i_38_ += i_43_;
		}
		if (i_34_ > 0 && i_35_ > 0)
		    method8876(((Class172_Sub3) this).aByteArrayArray9612[c],
			       (((Class173_Sub3)
				 ((Class172_Sub3) this).aClass173_Sub3_9613)
				.anIntArray9719),
			       i_31_, i_40_, i_37_, i_34_, i_35_, i_38_, i_39_,
			       i, i_30_,
			       ((Class172_Sub3) this).anIntArray9614[c],
			       class148, i_32_, i_33_);
	    }
	}
    }
    
    void method8876(byte[] is, int[] is_44_, int i, int i_45_, int i_46_,
		    int i_47_, int i_48_, int i_49_, int i_50_, int i_51_,
		    int i_52_, int i_53_, Class148 class148, int i_54_,
		    int i_55_) {
	Class148_Sub1 class148_sub1 = (Class148_Sub1) class148;
	int[] is_56_ = ((Class148_Sub1) class148_sub1).anIntArray8789;
	int[] is_57_ = ((Class148_Sub1) class148_sub1).anIntArray8788;
	int i_58_
	    = (i_51_
	       - (((Class173_Sub3) ((Class172_Sub3) this).aClass173_Sub3_9613)
		  .anInt9723) * -993497119);
	int i_59_ = i_52_;
	if (i_55_ > i_59_) {
	    i_59_ = i_55_;
	    i_46_ += 111437289 * (((Class173_Sub3)
				   ((Class172_Sub3) this).aClass173_Sub3_9613)
				  .anInt9735) * (i_55_ - i_52_);
	    i_45_ += i_53_ * (i_55_ - i_52_);
	}
	int i_60_ = (is_56_.length + i_55_ < i_48_ + i_52_
		     ? i_55_ + is_56_.length : i_48_ + i_52_);
	for (int i_61_ = i_59_; i_61_ < i_60_; i_61_++) {
	    int i_62_ = i_54_ + is_56_[i_61_ - i_55_];
	    int i_63_ = is_57_[i_61_ - i_55_];
	    int i_64_ = i_47_;
	    if (i_58_ > i_62_) {
		int i_65_ = i_58_ - i_62_;
		if (i_65_ >= i_63_) {
		    i_45_ += i_50_ + i_47_;
		    i_46_ += i_49_ + i_47_;
		    continue;
		}
		i_63_ -= i_65_;
	    } else {
		int i_66_ = i_62_ - i_58_;
		if (i_66_ >= i_47_) {
		    i_45_ += i_47_ + i_50_;
		    i_46_ += i_47_ + i_49_;
		    continue;
		}
		i_45_ += i_66_;
		i_64_ -= i_66_;
		i_46_ += i_66_;
	    }
	    int i_67_ = 0;
	    if (i_64_ < i_63_)
		i_63_ = i_64_;
	    else
		i_67_ = i_64_ - i_63_;
	    for (int i_68_ = -i_63_; i_68_ < 0; i_68_++) {
		int i_69_ = is[i_45_++] & 0xff;
		if (0 != i_69_) {
		    int i_70_ = (((i_69_ * (i & 0xff00ff) & ~0xff00ff)
				  + ((i & 0xff00) * i_69_ & 0xff0000))
				 >> 8);
		    i_69_ = 256 - i_69_;
		    int i_71_ = is_44_[i_46_];
		    is_44_[i_46_++]
			= ((((i_71_ & 0xff00) * i_69_ & 0xff0000)
			    + ((i_71_ & 0xff00ff) * i_69_ & ~0xff00ff))
			   >> 8) + i_70_;
		} else
		    i_46_++;
	    }
	    i_45_ += i_67_ + i_50_;
	    i_46_ += i_49_ + i_67_;
	}
    }
    
    void method2129(char c, int i, int i_72_, int i_73_, boolean bool) {
	if ((((Class173_Sub3) ((Class172_Sub3) this).aClass173_Sub3_9613)
	     .anIntArray9719)
	    != null) {
	    i += ((Class172_Sub3) this).anIntArray9611[c];
	    i_72_ += ((Class172_Sub3) this).anIntArray9616[c];
	    int i_74_ = ((Class172_Sub3) this).anIntArray9614[c];
	    int i_75_ = ((Class172_Sub3) this).anIntArray9615[c];
	    int i_76_ = (111437289
			 * ((Class173_Sub3) (((Class172_Sub3) this)
					     .aClass173_Sub3_9613)).anInt9735);
	    int i_77_ = i + i_76_ * i_72_;
	    int i_78_ = i_76_ - i_74_;
	    int i_79_ = 0;
	    int i_80_ = 0;
	    if (i_72_ < 592117349 * (((Class173_Sub3) (((Class172_Sub3) this)
						       .aClass173_Sub3_9613))
				     .anInt9725)) {
		int i_81_
		    = (592117349 * (((Class173_Sub3) (((Class172_Sub3) this)
						      .aClass173_Sub3_9613))
				    .anInt9725)
		       - i_72_);
		i_75_ -= i_81_;
		i_72_ = 592117349 * (((Class173_Sub3) (((Class172_Sub3) this)
						       .aClass173_Sub3_9613))
				     .anInt9725);
		i_80_ += i_74_ * i_81_;
		i_77_ += i_76_ * i_81_;
	    }
	    if (i_75_ + i_72_
		> (((Class173_Sub3) ((Class172_Sub3) this).aClass173_Sub3_9613)
		   .anInt9726) * 6965409)
		i_75_ -= (i_72_ + i_75_
			  - 6965409 * (((Class173_Sub3) (((Class172_Sub3) this)
							 .aClass173_Sub3_9613))
				       .anInt9726));
	    if (i < -993497119 * (((Class173_Sub3)
				   ((Class172_Sub3) this).aClass173_Sub3_9613)
				  .anInt9723)) {
		int i_82_ = ((((Class173_Sub3)
			       ((Class172_Sub3) this).aClass173_Sub3_9613)
			      .anInt9723) * -993497119
			     - i);
		i_74_ -= i_82_;
		i = (((Class173_Sub3)
		      ((Class172_Sub3) this).aClass173_Sub3_9613).anInt9723
		     * -993497119);
		i_80_ += i_82_;
		i_77_ += i_82_;
		i_79_ += i_82_;
		i_78_ += i_82_;
	    }
	    if (i + i_74_
		> 630968029 * (((Class173_Sub3)
				((Class172_Sub3) this).aClass173_Sub3_9613)
			       .anInt9724)) {
		int i_83_
		    = (i_74_ + i
		       - 630968029 * (((Class173_Sub3) (((Class172_Sub3) this)
							.aClass173_Sub3_9613))
				      .anInt9724));
		i_74_ -= i_83_;
		i_79_ += i_83_;
		i_78_ += i_83_;
	    }
	    if (i_74_ > 0 && i_75_ > 0)
		method8878(((Class172_Sub3) this).aByteArrayArray9612[c],
			   (((Class173_Sub3)
			     ((Class172_Sub3) this).aClass173_Sub3_9613)
			    .anIntArray9719),
			   i_73_, i_80_, i_77_, i_74_, i_75_, i_78_, i_79_);
	}
    }
    
    void method2134(char c, int i, int i_84_, int i_85_, boolean bool) {
	if ((((Class173_Sub3) ((Class172_Sub3) this).aClass173_Sub3_9613)
	     .anIntArray9719)
	    != null) {
	    i += ((Class172_Sub3) this).anIntArray9611[c];
	    i_84_ += ((Class172_Sub3) this).anIntArray9616[c];
	    int i_86_ = ((Class172_Sub3) this).anIntArray9614[c];
	    int i_87_ = ((Class172_Sub3) this).anIntArray9615[c];
	    int i_88_ = (111437289
			 * ((Class173_Sub3) (((Class172_Sub3) this)
					     .aClass173_Sub3_9613)).anInt9735);
	    int i_89_ = i + i_88_ * i_84_;
	    int i_90_ = i_88_ - i_86_;
	    int i_91_ = 0;
	    int i_92_ = 0;
	    if (i_84_ < 592117349 * (((Class173_Sub3) (((Class172_Sub3) this)
						       .aClass173_Sub3_9613))
				     .anInt9725)) {
		int i_93_
		    = (592117349 * (((Class173_Sub3) (((Class172_Sub3) this)
						      .aClass173_Sub3_9613))
				    .anInt9725)
		       - i_84_);
		i_87_ -= i_93_;
		i_84_ = 592117349 * (((Class173_Sub3) (((Class172_Sub3) this)
						       .aClass173_Sub3_9613))
				     .anInt9725);
		i_92_ += i_86_ * i_93_;
		i_89_ += i_88_ * i_93_;
	    }
	    if (i_87_ + i_84_
		> (((Class173_Sub3) ((Class172_Sub3) this).aClass173_Sub3_9613)
		   .anInt9726) * 6965409)
		i_87_ -= (i_84_ + i_87_
			  - 6965409 * (((Class173_Sub3) (((Class172_Sub3) this)
							 .aClass173_Sub3_9613))
				       .anInt9726));
	    if (i < -993497119 * (((Class173_Sub3)
				   ((Class172_Sub3) this).aClass173_Sub3_9613)
				  .anInt9723)) {
		int i_94_ = ((((Class173_Sub3)
			       ((Class172_Sub3) this).aClass173_Sub3_9613)
			      .anInt9723) * -993497119
			     - i);
		i_86_ -= i_94_;
		i = (((Class173_Sub3)
		      ((Class172_Sub3) this).aClass173_Sub3_9613).anInt9723
		     * -993497119);
		i_92_ += i_94_;
		i_89_ += i_94_;
		i_91_ += i_94_;
		i_90_ += i_94_;
	    }
	    if (i + i_86_
		> 630968029 * (((Class173_Sub3)
				((Class172_Sub3) this).aClass173_Sub3_9613)
			       .anInt9724)) {
		int i_95_
		    = (i_86_ + i
		       - 630968029 * (((Class173_Sub3) (((Class172_Sub3) this)
							.aClass173_Sub3_9613))
				      .anInt9724));
		i_86_ -= i_95_;
		i_91_ += i_95_;
		i_90_ += i_95_;
	    }
	    if (i_86_ > 0 && i_87_ > 0)
		method8878(((Class172_Sub3) this).aByteArrayArray9612[c],
			   (((Class173_Sub3)
			     ((Class172_Sub3) this).aClass173_Sub3_9613)
			    .anIntArray9719),
			   i_85_, i_92_, i_89_, i_86_, i_87_, i_90_, i_91_);
	}
    }
    
    void method2135(char c, int i, int i_96_, int i_97_, boolean bool) {
	if ((((Class173_Sub3) ((Class172_Sub3) this).aClass173_Sub3_9613)
	     .anIntArray9719)
	    != null) {
	    i += ((Class172_Sub3) this).anIntArray9611[c];
	    i_96_ += ((Class172_Sub3) this).anIntArray9616[c];
	    int i_98_ = ((Class172_Sub3) this).anIntArray9614[c];
	    int i_99_ = ((Class172_Sub3) this).anIntArray9615[c];
	    int i_100_ = 111437289 * (((Class173_Sub3) (((Class172_Sub3) this)
							.aClass173_Sub3_9613))
				      .anInt9735);
	    int i_101_ = i + i_100_ * i_96_;
	    int i_102_ = i_100_ - i_98_;
	    int i_103_ = 0;
	    int i_104_ = 0;
	    if (i_96_ < 592117349 * (((Class173_Sub3) (((Class172_Sub3) this)
						       .aClass173_Sub3_9613))
				     .anInt9725)) {
		int i_105_
		    = (592117349 * (((Class173_Sub3) (((Class172_Sub3) this)
						      .aClass173_Sub3_9613))
				    .anInt9725)
		       - i_96_);
		i_99_ -= i_105_;
		i_96_ = 592117349 * (((Class173_Sub3) (((Class172_Sub3) this)
						       .aClass173_Sub3_9613))
				     .anInt9725);
		i_104_ += i_98_ * i_105_;
		i_101_ += i_100_ * i_105_;
	    }
	    if (i_99_ + i_96_
		> (((Class173_Sub3) ((Class172_Sub3) this).aClass173_Sub3_9613)
		   .anInt9726) * 6965409)
		i_99_ -= (i_96_ + i_99_
			  - 6965409 * (((Class173_Sub3) (((Class172_Sub3) this)
							 .aClass173_Sub3_9613))
				       .anInt9726));
	    if (i < -993497119 * (((Class173_Sub3)
				   ((Class172_Sub3) this).aClass173_Sub3_9613)
				  .anInt9723)) {
		int i_106_ = ((((Class173_Sub3)
				((Class172_Sub3) this).aClass173_Sub3_9613)
			       .anInt9723) * -993497119
			      - i);
		i_98_ -= i_106_;
		i = (((Class173_Sub3)
		      ((Class172_Sub3) this).aClass173_Sub3_9613).anInt9723
		     * -993497119);
		i_104_ += i_106_;
		i_101_ += i_106_;
		i_103_ += i_106_;
		i_102_ += i_106_;
	    }
	    if (i + i_98_
		> 630968029 * (((Class173_Sub3)
				((Class172_Sub3) this).aClass173_Sub3_9613)
			       .anInt9724)) {
		int i_107_
		    = (i_98_ + i
		       - 630968029 * (((Class173_Sub3) (((Class172_Sub3) this)
							.aClass173_Sub3_9613))
				      .anInt9724));
		i_98_ -= i_107_;
		i_103_ += i_107_;
		i_102_ += i_107_;
	    }
	    if (i_98_ > 0 && i_99_ > 0)
		method8878(((Class172_Sub3) this).aByteArrayArray9612[c],
			   (((Class173_Sub3)
			     ((Class172_Sub3) this).aClass173_Sub3_9613)
			    .anIntArray9719),
			   i_97_, i_104_, i_101_, i_98_, i_99_, i_102_,
			   i_103_);
	}
    }
    
    void method2136(char c, int i, int i_108_, int i_109_, boolean bool,
		    Class148 class148, int i_110_, int i_111_) {
	if (null
	    != (((Class173_Sub3) ((Class172_Sub3) this).aClass173_Sub3_9613)
		.anIntArray9719)) {
	    if (null == class148)
		method2125(c, i, i_108_, i_109_, bool);
	    else {
		i += ((Class172_Sub3) this).anIntArray9611[c];
		i_108_ += ((Class172_Sub3) this).anIntArray9616[c];
		int i_112_ = ((Class172_Sub3) this).anIntArray9614[c];
		int i_113_ = ((Class172_Sub3) this).anIntArray9615[c];
		int i_114_
		    = (((Class173_Sub3)
			((Class172_Sub3) this).aClass173_Sub3_9613).anInt9735
		       * 111437289);
		int i_115_ = i_114_ * i_108_ + i;
		int i_116_ = i_114_ - i_112_;
		int i_117_ = 0;
		int i_118_ = 0;
		if (i_108_
		    < 592117349 * (((Class173_Sub3)
				    ((Class172_Sub3) this).aClass173_Sub3_9613)
				   .anInt9725)) {
		    int i_119_
			= 592117349 * (((Class173_Sub3) (((Class172_Sub3) this)
							 .aClass173_Sub3_9613))
				       .anInt9725) - i_108_;
		    i_113_ -= i_119_;
		    i_108_
			= 592117349 * (((Class173_Sub3) (((Class172_Sub3) this)
							 .aClass173_Sub3_9613))
				       .anInt9725);
		    i_118_ += i_112_ * i_119_;
		    i_115_ += i_119_ * i_114_;
		}
		if (i_113_ + i_108_ > (((Class173_Sub3) (((Class172_Sub3) this)
							 .aClass173_Sub3_9613))
				       .anInt9726) * 6965409)
		    i_113_ -= (i_108_ + i_113_
			       - 6965409 * ((Class173_Sub3)
					    (((Class172_Sub3) this)
					     .aClass173_Sub3_9613)).anInt9726);
		if (i < (((Class173_Sub3)
			  ((Class172_Sub3) this).aClass173_Sub3_9613).anInt9723
			 * -993497119)) {
		    int i_120_
			= (-993497119 * ((Class173_Sub3)
					 (((Class172_Sub3) this)
					  .aClass173_Sub3_9613)).anInt9723
			   - i);
		    i_112_ -= i_120_;
		    i = -993497119 * (((Class173_Sub3) (((Class172_Sub3) this)
							.aClass173_Sub3_9613))
				      .anInt9723);
		    i_118_ += i_120_;
		    i_115_ += i_120_;
		    i_117_ += i_120_;
		    i_116_ += i_120_;
		}
		if (i + i_112_
		    > 630968029 * (((Class173_Sub3)
				    ((Class172_Sub3) this).aClass173_Sub3_9613)
				   .anInt9724)) {
		    int i_121_ = (i + i_112_
				  - (((Class173_Sub3) (((Class172_Sub3) this)
						       .aClass173_Sub3_9613))
				     .anInt9724) * 630968029);
		    i_112_ -= i_121_;
		    i_117_ += i_121_;
		    i_116_ += i_121_;
		}
		if (i_112_ > 0 && i_113_ > 0)
		    method8876(((Class172_Sub3) this).aByteArrayArray9612[c],
			       (((Class173_Sub3)
				 ((Class172_Sub3) this).aClass173_Sub3_9613)
				.anIntArray9719),
			       i_109_, i_118_, i_115_, i_112_, i_113_, i_116_,
			       i_117_, i, i_108_,
			       ((Class172_Sub3) this).anIntArray9614[c],
			       class148, i_110_, i_111_);
	    }
	}
    }
    
    void method8877(byte[] is, int[] is_122_, int i, int i_123_, int i_124_,
		    int i_125_, int i_126_, int i_127_, int i_128_) {
	for (int i_129_ = -i_126_; i_129_ < 0; i_129_++) {
	    for (int i_130_ = -i_125_; i_130_ < 0; i_130_++) {
		int i_131_ = is[i_123_++] & 0xff;
		if (0 != i_131_) {
		    int i_132_ = (((i_131_ * (i & 0xff00) & 0xff0000)
				   + ((i & 0xff00ff) * i_131_ & ~0xff00ff))
				  >> 8);
		    i_131_ = 256 - i_131_;
		    int i_133_ = is_122_[i_124_];
		    is_122_[i_124_++]
			= i_132_ + ((((i_133_ & 0xff00) * i_131_ & 0xff0000)
				     + (i_131_ * (i_133_ & 0xff00ff)
					& ~0xff00ff))
				    >> 8);
		} else
		    i_124_++;
	    }
	    i_124_ += i_127_;
	    i_123_ += i_128_;
	}
    }
    
    void method2137(char c, int i, int i_134_, int i_135_, boolean bool,
		    Class148 class148, int i_136_, int i_137_) {
	if (null
	    != (((Class173_Sub3) ((Class172_Sub3) this).aClass173_Sub3_9613)
		.anIntArray9719)) {
	    if (null == class148)
		method2125(c, i, i_134_, i_135_, bool);
	    else {
		i += ((Class172_Sub3) this).anIntArray9611[c];
		i_134_ += ((Class172_Sub3) this).anIntArray9616[c];
		int i_138_ = ((Class172_Sub3) this).anIntArray9614[c];
		int i_139_ = ((Class172_Sub3) this).anIntArray9615[c];
		int i_140_
		    = (((Class173_Sub3)
			((Class172_Sub3) this).aClass173_Sub3_9613).anInt9735
		       * 111437289);
		int i_141_ = i_140_ * i_134_ + i;
		int i_142_ = i_140_ - i_138_;
		int i_143_ = 0;
		int i_144_ = 0;
		if (i_134_
		    < 592117349 * (((Class173_Sub3)
				    ((Class172_Sub3) this).aClass173_Sub3_9613)
				   .anInt9725)) {
		    int i_145_
			= 592117349 * (((Class173_Sub3) (((Class172_Sub3) this)
							 .aClass173_Sub3_9613))
				       .anInt9725) - i_134_;
		    i_139_ -= i_145_;
		    i_134_
			= 592117349 * (((Class173_Sub3) (((Class172_Sub3) this)
							 .aClass173_Sub3_9613))
				       .anInt9725);
		    i_144_ += i_138_ * i_145_;
		    i_141_ += i_145_ * i_140_;
		}
		if (i_139_ + i_134_ > (((Class173_Sub3) (((Class172_Sub3) this)
							 .aClass173_Sub3_9613))
				       .anInt9726) * 6965409)
		    i_139_ -= (i_134_ + i_139_
			       - 6965409 * ((Class173_Sub3)
					    (((Class172_Sub3) this)
					     .aClass173_Sub3_9613)).anInt9726);
		if (i < (((Class173_Sub3)
			  ((Class172_Sub3) this).aClass173_Sub3_9613).anInt9723
			 * -993497119)) {
		    int i_146_
			= (-993497119 * ((Class173_Sub3)
					 (((Class172_Sub3) this)
					  .aClass173_Sub3_9613)).anInt9723
			   - i);
		    i_138_ -= i_146_;
		    i = -993497119 * (((Class173_Sub3) (((Class172_Sub3) this)
							.aClass173_Sub3_9613))
				      .anInt9723);
		    i_144_ += i_146_;
		    i_141_ += i_146_;
		    i_143_ += i_146_;
		    i_142_ += i_146_;
		}
		if (i + i_138_
		    > 630968029 * (((Class173_Sub3)
				    ((Class172_Sub3) this).aClass173_Sub3_9613)
				   .anInt9724)) {
		    int i_147_ = (i + i_138_
				  - (((Class173_Sub3) (((Class172_Sub3) this)
						       .aClass173_Sub3_9613))
				     .anInt9724) * 630968029);
		    i_138_ -= i_147_;
		    i_143_ += i_147_;
		    i_142_ += i_147_;
		}
		if (i_138_ > 0 && i_139_ > 0)
		    method8876(((Class172_Sub3) this).aByteArrayArray9612[c],
			       (((Class173_Sub3)
				 ((Class172_Sub3) this).aClass173_Sub3_9613)
				.anIntArray9719),
			       i_135_, i_144_, i_141_, i_138_, i_139_, i_142_,
			       i_143_, i, i_134_,
			       ((Class172_Sub3) this).anIntArray9614[c],
			       class148, i_136_, i_137_);
	    }
	}
    }
    
    void method2139(char c, int i, int i_148_, int i_149_, boolean bool,
		    Class148 class148, int i_150_, int i_151_) {
	if (null
	    != (((Class173_Sub3) ((Class172_Sub3) this).aClass173_Sub3_9613)
		.anIntArray9719)) {
	    if (null == class148)
		method2125(c, i, i_148_, i_149_, bool);
	    else {
		i += ((Class172_Sub3) this).anIntArray9611[c];
		i_148_ += ((Class172_Sub3) this).anIntArray9616[c];
		int i_152_ = ((Class172_Sub3) this).anIntArray9614[c];
		int i_153_ = ((Class172_Sub3) this).anIntArray9615[c];
		int i_154_
		    = (((Class173_Sub3)
			((Class172_Sub3) this).aClass173_Sub3_9613).anInt9735
		       * 111437289);
		int i_155_ = i_154_ * i_148_ + i;
		int i_156_ = i_154_ - i_152_;
		int i_157_ = 0;
		int i_158_ = 0;
		if (i_148_
		    < 592117349 * (((Class173_Sub3)
				    ((Class172_Sub3) this).aClass173_Sub3_9613)
				   .anInt9725)) {
		    int i_159_
			= 592117349 * (((Class173_Sub3) (((Class172_Sub3) this)
							 .aClass173_Sub3_9613))
				       .anInt9725) - i_148_;
		    i_153_ -= i_159_;
		    i_148_
			= 592117349 * (((Class173_Sub3) (((Class172_Sub3) this)
							 .aClass173_Sub3_9613))
				       .anInt9725);
		    i_158_ += i_152_ * i_159_;
		    i_155_ += i_159_ * i_154_;
		}
		if (i_153_ + i_148_ > (((Class173_Sub3) (((Class172_Sub3) this)
							 .aClass173_Sub3_9613))
				       .anInt9726) * 6965409)
		    i_153_ -= (i_148_ + i_153_
			       - 6965409 * ((Class173_Sub3)
					    (((Class172_Sub3) this)
					     .aClass173_Sub3_9613)).anInt9726);
		if (i < (((Class173_Sub3)
			  ((Class172_Sub3) this).aClass173_Sub3_9613).anInt9723
			 * -993497119)) {
		    int i_160_
			= (-993497119 * ((Class173_Sub3)
					 (((Class172_Sub3) this)
					  .aClass173_Sub3_9613)).anInt9723
			   - i);
		    i_152_ -= i_160_;
		    i = -993497119 * (((Class173_Sub3) (((Class172_Sub3) this)
							.aClass173_Sub3_9613))
				      .anInt9723);
		    i_158_ += i_160_;
		    i_155_ += i_160_;
		    i_157_ += i_160_;
		    i_156_ += i_160_;
		}
		if (i + i_152_
		    > 630968029 * (((Class173_Sub3)
				    ((Class172_Sub3) this).aClass173_Sub3_9613)
				   .anInt9724)) {
		    int i_161_ = (i + i_152_
				  - (((Class173_Sub3) (((Class172_Sub3) this)
						       .aClass173_Sub3_9613))
				     .anInt9724) * 630968029);
		    i_152_ -= i_161_;
		    i_157_ += i_161_;
		    i_156_ += i_161_;
		}
		if (i_152_ > 0 && i_153_ > 0)
		    method8876(((Class172_Sub3) this).aByteArrayArray9612[c],
			       (((Class173_Sub3)
				 ((Class172_Sub3) this).aClass173_Sub3_9613)
				.anIntArray9719),
			       i_149_, i_158_, i_155_, i_152_, i_153_, i_156_,
			       i_157_, i, i_148_,
			       ((Class172_Sub3) this).anIntArray9614[c],
			       class148, i_150_, i_151_);
	    }
	}
    }
    
    void method8878(byte[] is, int[] is_162_, int i, int i_163_, int i_164_,
		    int i_165_, int i_166_, int i_167_, int i_168_) {
	for (int i_169_ = -i_166_; i_169_ < 0; i_169_++) {
	    for (int i_170_ = -i_165_; i_170_ < 0; i_170_++) {
		int i_171_ = is[i_163_++] & 0xff;
		if (0 != i_171_) {
		    int i_172_ = (((i_171_ * (i & 0xff00) & 0xff0000)
				   + ((i & 0xff00ff) * i_171_ & ~0xff00ff))
				  >> 8);
		    i_171_ = 256 - i_171_;
		    int i_173_ = is_162_[i_164_];
		    is_162_[i_164_++]
			= i_172_ + ((((i_173_ & 0xff00) * i_171_ & 0xff0000)
				     + (i_171_ * (i_173_ & 0xff00ff)
					& ~0xff00ff))
				    >> 8);
		} else
		    i_164_++;
	    }
	    i_164_ += i_167_;
	    i_163_ += i_168_;
	}
    }
    
    Class172_Sub3(Class173_Sub3 class173_sub3, Class1 class1,
		  Class178_Sub1[] class178_sub1s, int[] is, int[] is_174_) {
	super(class173_sub3, class1);
	((Class172_Sub3) this).aClass173_Sub3_9613 = class173_sub3;
	((Class172_Sub3) this).aClass173_Sub3_9613 = class173_sub3;
	((Class172_Sub3) this).anIntArray9614 = is;
	((Class172_Sub3) this).anIntArray9615 = is_174_;
	((Class172_Sub3) this).aByteArrayArray9612
	    = new byte[class178_sub1s.length][];
	((Class172_Sub3) this).anIntArray9616 = new int[class178_sub1s.length];
	((Class172_Sub3) this).anIntArray9611 = new int[class178_sub1s.length];
	for (int i = 0; i < class178_sub1s.length; i++) {
	    Class178_Sub1 class178_sub1 = class178_sub1s[i];
	    int[] is_175_ = class178_sub1.method2629(false);
	    byte[] is_176_ = (((Class172_Sub3) this).aByteArrayArray9612[i]
			      = new byte[is_175_.length]);
	    for (int i_177_ = 0; i_177_ < is_175_.length; i_177_++)
		is_176_[i_177_] = (byte) (is_175_[i_177_] >> 24 & 0xff);
	    ((Class172_Sub3) this).anIntArray9616[i]
		= class178_sub1.method2605();
	    ((Class172_Sub3) this).anIntArray9611[i]
		= class178_sub1.method2603();
	}
    }
    
    void method8879(byte[] is, int[] is_178_, int i, int i_179_, int i_180_,
		    int i_181_, int i_182_, int i_183_, int i_184_) {
	for (int i_185_ = -i_182_; i_185_ < 0; i_185_++) {
	    for (int i_186_ = -i_181_; i_186_ < 0; i_186_++) {
		int i_187_ = is[i_179_++] & 0xff;
		if (0 != i_187_) {
		    int i_188_ = (((i_187_ * (i & 0xff00) & 0xff0000)
				   + ((i & 0xff00ff) * i_187_ & ~0xff00ff))
				  >> 8);
		    i_187_ = 256 - i_187_;
		    int i_189_ = is_178_[i_180_];
		    is_178_[i_180_++]
			= i_188_ + ((((i_189_ & 0xff00) * i_187_ & 0xff0000)
				     + (i_187_ * (i_189_ & 0xff00ff)
					& ~0xff00ff))
				    >> 8);
		} else
		    i_180_++;
	    }
	    i_180_ += i_183_;
	    i_179_ += i_184_;
	}
    }
    
    void method8880(byte[] is, int[] is_190_, int i, int i_191_, int i_192_,
		    int i_193_, int i_194_, int i_195_, int i_196_, int i_197_,
		    int i_198_, int i_199_, Class148 class148, int i_200_,
		    int i_201_) {
	Class148_Sub1 class148_sub1 = (Class148_Sub1) class148;
	int[] is_202_ = ((Class148_Sub1) class148_sub1).anIntArray8789;
	int[] is_203_ = ((Class148_Sub1) class148_sub1).anIntArray8788;
	int i_204_
	    = (i_197_
	       - (((Class173_Sub3) ((Class172_Sub3) this).aClass173_Sub3_9613)
		  .anInt9723) * -993497119);
	int i_205_ = i_198_;
	if (i_201_ > i_205_) {
	    i_205_ = i_201_;
	    i_192_ += 111437289 * (((Class173_Sub3)
				    ((Class172_Sub3) this).aClass173_Sub3_9613)
				   .anInt9735) * (i_201_ - i_198_);
	    i_191_ += i_199_ * (i_201_ - i_198_);
	}
	int i_206_ = (is_202_.length + i_201_ < i_194_ + i_198_
		      ? i_201_ + is_202_.length : i_194_ + i_198_);
	for (int i_207_ = i_205_; i_207_ < i_206_; i_207_++) {
	    int i_208_ = i_200_ + is_202_[i_207_ - i_201_];
	    int i_209_ = is_203_[i_207_ - i_201_];
	    int i_210_ = i_193_;
	    if (i_204_ > i_208_) {
		int i_211_ = i_204_ - i_208_;
		if (i_211_ >= i_209_) {
		    i_191_ += i_196_ + i_193_;
		    i_192_ += i_195_ + i_193_;
		    continue;
		}
		i_209_ -= i_211_;
	    } else {
		int i_212_ = i_208_ - i_204_;
		if (i_212_ >= i_193_) {
		    i_191_ += i_193_ + i_196_;
		    i_192_ += i_193_ + i_195_;
		    continue;
		}
		i_191_ += i_212_;
		i_210_ -= i_212_;
		i_192_ += i_212_;
	    }
	    int i_213_ = 0;
	    if (i_210_ < i_209_)
		i_209_ = i_210_;
	    else
		i_213_ = i_210_ - i_209_;
	    for (int i_214_ = -i_209_; i_214_ < 0; i_214_++) {
		int i_215_ = is[i_191_++] & 0xff;
		if (0 != i_215_) {
		    int i_216_ = (((i_215_ * (i & 0xff00ff) & ~0xff00ff)
				   + ((i & 0xff00) * i_215_ & 0xff0000))
				  >> 8);
		    i_215_ = 256 - i_215_;
		    int i_217_ = is_190_[i_192_];
		    is_190_[i_192_++]
			= ((((i_217_ & 0xff00) * i_215_ & 0xff0000)
			    + ((i_217_ & 0xff00ff) * i_215_ & ~0xff00ff))
			   >> 8) + i_216_;
		} else
		    i_192_++;
	    }
	    i_191_ += i_213_ + i_196_;
	    i_192_ += i_195_ + i_213_;
	}
    }
    
    static void method8881(Class58_Sub1 class58_sub1, int i) {
	class58_sub1.method9763(0, (byte) 8);
	int i_218_;
	if (Class509.anInt6957 * 1110656915 >= 96) {
	    int i_219_ = Class514.method6275((byte) 6);
	    if (i_219_ <= 103) {
		Class62.method1021(1302798317);
		i_218_ = 4;
	    } else if (i_219_ <= 501) {
		Class194.method2813(1210715563);
		i_218_ = 3;
	    } else if (i_219_ <= 1003) {
		IncomingPacket.method4816(-104225822);
		i_218_ = 2;
	    } else {
		Class239.method3310(true, (byte) -109);
		i_218_ = 1;
	    }
	    class58_sub1.method9758(0, i_219_, 676547953);
	} else {
	    Class239.method3310(true, (byte) -41);
	    i_218_ = 1;
	    class58_sub1.method9760(64, 1446039687);
	}
	if (Class514.aClass528_Sub38_6967.aClass691_Sub24_10594
		.method10014(-1824619963)
	    != 0) {
	    Class514.aClass528_Sub38_6967.method9556((Class514
						      .aClass528_Sub38_6967
						      .aClass691_Sub24_10577),
						     0, 1842531349);
	    Class186.method2754(0, false, 386771833);
	} else
	    Class514.aClass528_Sub38_6967.method9557((Class514
						      .aClass528_Sub38_6967
						      .aClass691_Sub24_10594),
						     true, (byte) -4);
	Class243.method3387(2140099482);
	class58_sub1.method9757(i_218_, (byte) 127);
    }
}
