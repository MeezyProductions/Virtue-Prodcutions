/* Class334 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class334
{
    int anInt3564;
    Class333[][] aClass333ArrayArray3565;
    Class173_Sub1 aClass173_Sub1_3566;
    int anInt3567;
    byte[] aByteArray3568;
    int anInt3569;
    Class137_Sub2 aClass137_Sub2_3570;
    int anInt3571;
    int anInt3572;
    
    void method4342(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
		    int i_0_) {
	Class528_Sub21_Sub12_Sub1 class528_sub21_sub12_sub1
	    = (Class528_Sub21_Sub12_Sub1) class528_sub21_sub12;
	i += (((Class528_Sub21_Sub12_Sub1) class528_sub21_sub12_sub1)
	      .anInt11982) + 1;
	i_0_ += (((Class528_Sub21_Sub12_Sub1) class528_sub21_sub12_sub1)
		 .anInt11985) + 1;
	int i_1_ = i + i_0_ * ((Class334) this).anInt3567;
	int i_2_ = 0;
	int i_3_ = (((Class528_Sub21_Sub12_Sub1) class528_sub21_sub12_sub1)
		    .anInt11986);
	int i_4_ = (((Class528_Sub21_Sub12_Sub1) class528_sub21_sub12_sub1)
		    .anInt11984);
	int i_5_ = ((Class334) this).anInt3567 - i_4_;
	int i_6_ = 0;
	if (i_0_ <= 0) {
	    int i_7_ = 1 - i_0_;
	    i_3_ -= i_7_;
	    i_2_ += i_7_ * i_4_;
	    i_1_ += i_7_ * ((Class334) this).anInt3567;
	    i_0_ = 1;
	}
	if (i_0_ + i_3_ >= ((Class334) this).anInt3572) {
	    int i_8_ = i_0_ + i_3_ + 1 - ((Class334) this).anInt3572;
	    i_3_ -= i_8_;
	}
	if (i <= 0) {
	    int i_9_ = 1 - i;
	    i_4_ -= i_9_;
	    i_2_ += i_9_;
	    i_1_ += i_9_;
	    i_6_ += i_9_;
	    i_5_ += i_9_;
	    i = 1;
	}
	if (i + i_4_ >= ((Class334) this).anInt3567) {
	    int i_10_ = i + i_4_ + 1 - ((Class334) this).anInt3567;
	    i_4_ -= i_10_;
	    i_6_ += i_10_;
	    i_5_ += i_10_;
	}
	if (i_4_ > 0 && i_3_ > 0) {
	    method4347(((Class334) this).aByteArray3568,
		       (((Class528_Sub21_Sub12_Sub1) class528_sub21_sub12_sub1)
			.aByteArray11987),
		       i_2_, i_1_, i_4_, i_3_, i_5_, i_6_);
	    method4353(i, i_0_, i_4_, i_3_);
	}
    }
    
    void method4343(Class306 class306, int i, int i_11_, int i_12_,
		    boolean[][] bools, boolean bool) {
	((Class334) this).aClass173_Sub1_3566.method2283(false);
	float f
	    = 1.0F / (float) (((Class173_Sub1)
			       ((Class334) this).aClass173_Sub1_3566).anInt9214
			      * 128);
	if (bool) {
	    for (int i_13_ = 0; i_13_ < ((Class334) this).anInt3564; i_13_++) {
		int i_14_ = i_13_ << ((Class334) this).anInt3571;
		int i_15_ = i_13_ + 1 << ((Class334) this).anInt3571;
		for (int i_16_ = 0; i_16_ < ((Class334) this).anInt3569;
		     i_16_++) {
		    if (((Class334) this).aClass333ArrayArray3565[i_16_][i_13_]
			!= null) {
			int i_17_ = i_16_ << ((Class334) this).anInt3571;
			int i_18_ = i_16_ + 1 << ((Class334) this).anInt3571;
		    while_8_:
			for (int i_19_ = i_17_; i_19_ < i_18_; i_19_++) {
			    if (i_19_ - i >= -i_12_ && i_19_ - i <= i_12_) {
				for (int i_20_ = i_14_; i_20_ < i_15_;
				     i_20_++) {
				    if (i_20_ - i_11_ >= -i_12_
					&& i_20_ - i_11_ <= i_12_
					&& (bools[i_19_ - i + i_12_]
					    [i_20_ - i_11_ + i_12_])) {
					class306.aClass418_3358
					    .method4976(f, f, 1.0F, 1.0F);
					class306.aClass418_3358
					    .aFloatArray4768[12]
					    = (float) -i_16_;
					class306.aClass418_3358
					    .aFloatArray4768[13]
					    = (float) -i_13_;
					((Class334) this)
					    .aClass333ArrayArray3565[i_16_]
					    [i_13_].method4341(class306);
					break while_8_;
				    }
				}
			    }
			}
		    }
		}
	    }
	} else {
	    int[] is = new int[(((Class334) this).anInt3564
				* ((Class334) this).anInt3569)];
	    ByteBuffer bytebuffer
		= ((Class334) this).aClass173_Sub1_3566.aByteBuffer9222;
	    bytebuffer.clear();
	    int i_21_ = 0;
	    for (int i_22_ = 0; i_22_ < ((Class334) this).anInt3564; i_22_++) {
		int i_23_ = i_22_ << ((Class334) this).anInt3571;
		int i_24_ = i_22_ + 1 << ((Class334) this).anInt3571;
		for (int i_25_ = 0; i_25_ < ((Class334) this).anInt3569;
		     i_25_++) {
		    Class333 class333
			= (((Class334) this).aClass333ArrayArray3565[i_25_]
			   [i_22_]);
		    int i_26_ = 0;
		    if (class333 != null) {
			int i_27_ = i_25_ << ((Class334) this).anInt3571;
			int i_28_ = i_25_ + 1 << ((Class334) this).anInt3571;
			for (int i_29_ = i_23_; i_29_ < i_24_; i_29_++) {
			    if (i_29_ - i_11_ >= -i_12_
				&& i_29_ - i_11_ <= i_12_) {
				int i_30_
				    = i_29_ * ((((Class334) this)
						.aClass137_Sub2_3570.anInt1627)
					       * -657933437) + i_27_;
				for (int i_31_ = i_27_; i_31_ < i_28_;
				     i_31_++) {
				    if (i_31_ - i >= -i_12_
					&& i_31_ - i <= i_12_
					&& (bools[i_31_ - i + i_12_]
					    [i_29_ - i_11_ + i_12_])) {
					short[] is_32_
					    = (((Class137_Sub2)
						(((Class334) this)
						 .aClass137_Sub2_3570))
					       .aShortArrayArray8967[i_30_]);
					if (is_32_ != null) {
					    for (int i_33_ = 0;
						 i_33_ < is_32_.length;
						 i_33_++) {
						bytebuffer
						    .putShort(is_32_[i_33_]);
						i_26_++;
					    }
					}
				    }
				    i_30_++;
				}
			    }
			}
		    }
		    is[i_21_] = i_26_;
		    i_21_++;
		}
	    }
	    if (bytebuffer.position() != 0) {
		int i_34_ = bytebuffer.position();
		Interface41 interface41 = ((Class334) this)
					      .aClass173_Sub1_3566
					      .method8478(i_34_ / 2);
		interface41.method197(0, i_34_,
				      (((Class334) this).aClass173_Sub1_3566
				       .aLong9223));
		int i_35_ = 0;
		i_21_ = 0;
		for (int i_36_ = 0; i_36_ < ((Class334) this).anInt3564;
		     i_36_++) {
		    for (int i_37_ = 0; i_37_ < ((Class334) this).anInt3569;
			 i_37_++) {
			if (is[i_21_] != 0) {
			    class306.aClass418_3358.method4976(f, f, 1.0F,
							       1.0F);
			    class306.aClass418_3358.aFloatArray4768[12]
				= (float) -i_37_;
			    class306.aClass418_3358.aFloatArray4768[13]
				= (float) -i_36_;
			    ((Class334) this).aClass333ArrayArray3565
				[i_37_][i_36_].method4340
				(class306, interface41, i_35_, is[i_21_] / 3);
			    i_35_ += is[i_21_];
			}
			i_21_++;
		    }
		}
	    }
	}
	((Class334) this).aClass173_Sub1_3566.method2283(true);
    }
    
    void method4344(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
		    int i_38_) {
	Class528_Sub21_Sub12_Sub1 class528_sub21_sub12_sub1
	    = (Class528_Sub21_Sub12_Sub1) class528_sub21_sub12;
	i += (((Class528_Sub21_Sub12_Sub1) class528_sub21_sub12_sub1)
	      .anInt11982) + 1;
	i_38_ += (((Class528_Sub21_Sub12_Sub1) class528_sub21_sub12_sub1)
		  .anInt11985) + 1;
	int i_39_ = i + i_38_ * ((Class334) this).anInt3567;
	int i_40_ = 0;
	int i_41_ = (((Class528_Sub21_Sub12_Sub1) class528_sub21_sub12_sub1)
		     .anInt11986);
	int i_42_ = (((Class528_Sub21_Sub12_Sub1) class528_sub21_sub12_sub1)
		     .anInt11984);
	int i_43_ = ((Class334) this).anInt3567 - i_42_;
	int i_44_ = 0;
	if (i_38_ <= 0) {
	    int i_45_ = 1 - i_38_;
	    i_41_ -= i_45_;
	    i_40_ += i_45_ * i_42_;
	    i_39_ += i_45_ * ((Class334) this).anInt3567;
	    i_38_ = 1;
	}
	if (i_38_ + i_41_ >= ((Class334) this).anInt3572) {
	    int i_46_ = i_38_ + i_41_ + 1 - ((Class334) this).anInt3572;
	    i_41_ -= i_46_;
	}
	if (i <= 0) {
	    int i_47_ = 1 - i;
	    i_42_ -= i_47_;
	    i_40_ += i_47_;
	    i_39_ += i_47_;
	    i_44_ += i_47_;
	    i_43_ += i_47_;
	    i = 1;
	}
	if (i + i_42_ >= ((Class334) this).anInt3567) {
	    int i_48_ = i + i_42_ + 1 - ((Class334) this).anInt3567;
	    i_42_ -= i_48_;
	    i_44_ += i_48_;
	    i_43_ += i_48_;
	}
	if (i_42_ > 0 && i_41_ > 0) {
	    method4346(((Class334) this).aByteArray3568,
		       (((Class528_Sub21_Sub12_Sub1) class528_sub21_sub12_sub1)
			.aByteArray11987),
		       i_40_, i_39_, i_42_, i_41_, i_43_, i_44_);
	    method4353(i, i_38_, i_42_, i_41_);
	}
    }
    
    boolean method4345(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
		       int i_49_) {
	Class528_Sub21_Sub12_Sub1 class528_sub21_sub12_sub1
	    = (Class528_Sub21_Sub12_Sub1) class528_sub21_sub12;
	i += (((Class528_Sub21_Sub12_Sub1) class528_sub21_sub12_sub1)
	      .anInt11982) + 1;
	i_49_ += (((Class528_Sub21_Sub12_Sub1) class528_sub21_sub12_sub1)
		  .anInt11985) + 1;
	int i_50_ = i + i_49_ * ((Class334) this).anInt3567;
	int i_51_ = (((Class528_Sub21_Sub12_Sub1) class528_sub21_sub12_sub1)
		     .anInt11986);
	int i_52_ = (((Class528_Sub21_Sub12_Sub1) class528_sub21_sub12_sub1)
		     .anInt11984);
	int i_53_ = ((Class334) this).anInt3567 - i_52_;
	if (i_49_ <= 0) {
	    int i_54_ = 1 - i_49_;
	    i_51_ -= i_54_;
	    i_50_ += i_54_ * ((Class334) this).anInt3567;
	    i_49_ = 1;
	}
	if (i_49_ + i_51_ >= ((Class334) this).anInt3572) {
	    int i_55_ = i_49_ + i_51_ + 1 - ((Class334) this).anInt3572;
	    i_51_ -= i_55_;
	}
	if (i <= 0) {
	    int i_56_ = 1 - i;
	    i_52_ -= i_56_;
	    i_50_ += i_56_;
	    i_53_ += i_56_;
	    i = 1;
	}
	if (i + i_52_ >= ((Class334) this).anInt3567) {
	    int i_57_ = i + i_52_ + 1 - ((Class334) this).anInt3567;
	    i_52_ -= i_57_;
	    i_53_ += i_57_;
	}
	if (i_52_ <= 0 || i_51_ <= 0)
	    return false;
	int i_58_ = 8;
	i_53_ += (i_58_ - 1) * ((Class334) this).anInt3567;
	return method4354(((Class334) this).aByteArray3568, i_50_, i_52_,
			  i_51_, i_53_, i_58_);
    }
    
    static final void method4346(byte[] is, byte[] is_59_, int i, int i_60_,
				 int i_61_, int i_62_, int i_63_, int i_64_) {
	int i_65_ = -(i_61_ >> 2);
	i_61_ = -(i_61_ & 0x3);
	for (int i_66_ = -i_62_; i_66_ < 0; i_66_++) {
	    for (int i_67_ = i_65_; i_67_ < 0; i_67_++) {
		is[i_60_++] += is_59_[i++];
		is[i_60_++] += is_59_[i++];
		is[i_60_++] += is_59_[i++];
		is[i_60_++] += is_59_[i++];
	    }
	    for (int i_68_ = i_61_; i_68_ < 0; i_68_++)
		is[i_60_++] += is_59_[i++];
	    i_60_ += i_63_;
	    i += i_64_;
	}
    }
    
    static final void method4347(byte[] is, byte[] is_69_, int i, int i_70_,
				 int i_71_, int i_72_, int i_73_, int i_74_) {
	int i_75_ = -(i_71_ >> 2);
	i_71_ = -(i_71_ & 0x3);
	for (int i_76_ = -i_72_; i_76_ < 0; i_76_++) {
	    for (int i_77_ = i_75_; i_77_ < 0; i_77_++) {
		is[i_70_++] -= is_69_[i++];
		is[i_70_++] -= is_69_[i++];
		is[i_70_++] -= is_69_[i++];
		is[i_70_++] -= is_69_[i++];
	    }
	    for (int i_78_ = i_71_; i_78_ < 0; i_78_++)
		is[i_70_++] -= is_69_[i++];
	    i_70_ += i_73_;
	    i += i_74_;
	}
    }
    
    void method4348(int i, int i_79_, int i_80_, int i_81_) {
	if (((Class334) this).aClass333ArrayArray3565 != null) {
	    int i_82_ = i - 1 >> 7;
	    int i_83_ = i - 1 + i_80_ - 1 >> 7;
	    int i_84_ = i_79_ - 1 >> 7;
	    int i_85_ = i_79_ - 1 + i_81_ - 1 >> 7;
	    for (int i_86_ = i_82_; i_86_ <= i_83_; i_86_++) {
		Class333[] class333s
		    = ((Class334) this).aClass333ArrayArray3565[i_86_];
		for (int i_87_ = i_84_; i_87_ <= i_85_; i_87_++) {
		    if (class333s[i_87_] != null)
			((Class333) class333s[i_87_]).aBool3563 = true;
		}
	    }
	}
    }
    
    void method4349() {
	((Class334) this).aClass333ArrayArray3565
	    = (new Class333[((Class334) this).anInt3569]
	       [((Class334) this).anInt3564]);
	for (int i = 0; i < ((Class334) this).anInt3564; i++) {
	    for (int i_88_ = 0; i_88_ < ((Class334) this).anInt3569; i_88_++) {
		((Class334) this).aClass333ArrayArray3565[i_88_][i]
		    = new Class333(((Class334) this).aClass173_Sub1_3566, this,
				   ((Class334) this).aClass137_Sub2_3570,
				   i_88_, i, ((Class334) this).anInt3571,
				   i_88_ * 128 + 1, i * 128 + 1);
		if (((Class333) (((Class334) this).aClass333ArrayArray3565
				 [i_88_][i])).anInt3551
		    == 0)
		    ((Class334) this).aClass333ArrayArray3565[i_88_][i] = null;
	    }
	}
    }
    
    void method4350() {
	((Class334) this).aClass333ArrayArray3565
	    = (new Class333[((Class334) this).anInt3569]
	       [((Class334) this).anInt3564]);
	for (int i = 0; i < ((Class334) this).anInt3564; i++) {
	    for (int i_89_ = 0; i_89_ < ((Class334) this).anInt3569; i_89_++) {
		((Class334) this).aClass333ArrayArray3565[i_89_][i]
		    = new Class333(((Class334) this).aClass173_Sub1_3566, this,
				   ((Class334) this).aClass137_Sub2_3570,
				   i_89_, i, ((Class334) this).anInt3571,
				   i_89_ * 128 + 1, i * 128 + 1);
		if (((Class333) (((Class334) this).aClass333ArrayArray3565
				 [i_89_][i])).anInt3551
		    == 0)
		    ((Class334) this).aClass333ArrayArray3565[i_89_][i] = null;
	    }
	}
    }
    
    void method4351(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
		    int i_90_) {
	Class528_Sub21_Sub12_Sub1 class528_sub21_sub12_sub1
	    = (Class528_Sub21_Sub12_Sub1) class528_sub21_sub12;
	i += (((Class528_Sub21_Sub12_Sub1) class528_sub21_sub12_sub1)
	      .anInt11982) + 1;
	i_90_ += (((Class528_Sub21_Sub12_Sub1) class528_sub21_sub12_sub1)
		  .anInt11985) + 1;
	int i_91_ = i + i_90_ * ((Class334) this).anInt3567;
	int i_92_ = 0;
	int i_93_ = (((Class528_Sub21_Sub12_Sub1) class528_sub21_sub12_sub1)
		     .anInt11986);
	int i_94_ = (((Class528_Sub21_Sub12_Sub1) class528_sub21_sub12_sub1)
		     .anInt11984);
	int i_95_ = ((Class334) this).anInt3567 - i_94_;
	int i_96_ = 0;
	if (i_90_ <= 0) {
	    int i_97_ = 1 - i_90_;
	    i_93_ -= i_97_;
	    i_92_ += i_97_ * i_94_;
	    i_91_ += i_97_ * ((Class334) this).anInt3567;
	    i_90_ = 1;
	}
	if (i_90_ + i_93_ >= ((Class334) this).anInt3572) {
	    int i_98_ = i_90_ + i_93_ + 1 - ((Class334) this).anInt3572;
	    i_93_ -= i_98_;
	}
	if (i <= 0) {
	    int i_99_ = 1 - i;
	    i_94_ -= i_99_;
	    i_92_ += i_99_;
	    i_91_ += i_99_;
	    i_96_ += i_99_;
	    i_95_ += i_99_;
	    i = 1;
	}
	if (i + i_94_ >= ((Class334) this).anInt3567) {
	    int i_100_ = i + i_94_ + 1 - ((Class334) this).anInt3567;
	    i_94_ -= i_100_;
	    i_96_ += i_100_;
	    i_95_ += i_100_;
	}
	if (i_94_ > 0 && i_93_ > 0) {
	    method4346(((Class334) this).aByteArray3568,
		       (((Class528_Sub21_Sub12_Sub1) class528_sub21_sub12_sub1)
			.aByteArray11987),
		       i_92_, i_91_, i_94_, i_93_, i_95_, i_96_);
	    method4353(i, i_90_, i_94_, i_93_);
	}
    }
    
    void method4352() {
	((Class334) this).aClass333ArrayArray3565
	    = (new Class333[((Class334) this).anInt3569]
	       [((Class334) this).anInt3564]);
	for (int i = 0; i < ((Class334) this).anInt3564; i++) {
	    for (int i_101_ = 0; i_101_ < ((Class334) this).anInt3569;
		 i_101_++) {
		((Class334) this).aClass333ArrayArray3565[i_101_][i]
		    = new Class333(((Class334) this).aClass173_Sub1_3566, this,
				   ((Class334) this).aClass137_Sub2_3570,
				   i_101_, i, ((Class334) this).anInt3571,
				   i_101_ * 128 + 1, i * 128 + 1);
		if (((Class333) (((Class334) this).aClass333ArrayArray3565
				 [i_101_][i])).anInt3551
		    == 0)
		    ((Class334) this).aClass333ArrayArray3565[i_101_][i]
			= null;
	    }
	}
    }
    
    void method4353(int i, int i_102_, int i_103_, int i_104_) {
	if (((Class334) this).aClass333ArrayArray3565 != null) {
	    int i_105_ = i - 1 >> 7;
	    int i_106_ = i - 1 + i_103_ - 1 >> 7;
	    int i_107_ = i_102_ - 1 >> 7;
	    int i_108_ = i_102_ - 1 + i_104_ - 1 >> 7;
	    for (int i_109_ = i_105_; i_109_ <= i_106_; i_109_++) {
		Class333[] class333s
		    = ((Class334) this).aClass333ArrayArray3565[i_109_];
		for (int i_110_ = i_107_; i_110_ <= i_108_; i_110_++) {
		    if (class333s[i_110_] != null)
			((Class333) class333s[i_110_]).aBool3563 = true;
		}
	    }
	}
    }
    
    static final boolean method4354(byte[] is, int i, int i_111_, int i_112_,
				    int i_113_, int i_114_) {
	int i_115_ = i_111_ % i_114_;
	int i_116_;
	if (i_115_ != 0)
	    i_116_ = i_114_ - i_115_;
	else
	    i_116_ = 0;
	int i_117_ = -((i_112_ + i_114_ - 1) / i_114_);
	int i_118_ = -((i_111_ + i_114_ - 1) / i_114_);
	for (int i_119_ = i_117_; i_119_ < 0; i_119_++) {
	    for (int i_120_ = i_118_; i_120_ < 0; i_120_++) {
		if (is[i] == 0)
		    return true;
		i += i_114_;
	    }
	    i -= i_116_;
	    if (is[i - 1] == 0)
		return true;
	    i += i_113_;
	}
	return false;
    }
    
    static final void method4355(byte[] is, byte[] is_121_, int i, int i_122_,
				 int i_123_, int i_124_, int i_125_,
				 int i_126_) {
	int i_127_ = -(i_123_ >> 2);
	i_123_ = -(i_123_ & 0x3);
	for (int i_128_ = -i_124_; i_128_ < 0; i_128_++) {
	    for (int i_129_ = i_127_; i_129_ < 0; i_129_++) {
		is[i_122_++] += is_121_[i++];
		is[i_122_++] += is_121_[i++];
		is[i_122_++] += is_121_[i++];
		is[i_122_++] += is_121_[i++];
	    }
	    for (int i_130_ = i_123_; i_130_ < 0; i_130_++)
		is[i_122_++] += is_121_[i++];
	    i_122_ += i_125_;
	    i += i_126_;
	}
    }
    
    Class334(Class173_Sub1 class173_sub1, Class137_Sub2 class137_sub2) {
	((Class334) this).aClass173_Sub1_3566 = class173_sub1;
	((Class334) this).aClass137_Sub2_3570 = class137_sub2;
	((Class334) this).anInt3567
	    = 2 + ((((Class334) this).aClass137_Sub2_3570.anInt1627
		    * -657933437
		    * (((Class334) this).aClass137_Sub2_3570.anInt1628
		       * 2130003981))
		   >> (((Class173_Sub1) ((Class334) this).aClass173_Sub1_3566)
		       .anInt9305));
	((Class334) this).anInt3572
	    = 2 + ((((Class334) this).aClass137_Sub2_3570.anInt1626
		    * 1769495707
		    * (((Class334) this).aClass137_Sub2_3570.anInt1628
		       * 2130003981))
		   >> (((Class173_Sub1) ((Class334) this).aClass173_Sub1_3566)
		       .anInt9305));
	((Class334) this).aByteArray3568
	    = (new byte
	       [((Class334) this).anInt3567 * ((Class334) this).anInt3572]);
	((Class334) this).anInt3571
	    = (7
	       + (((Class173_Sub1) ((Class334) this).aClass173_Sub1_3566)
		  .anInt9305)
	       - ((Class334) this).aClass137_Sub2_3570.anInt1625 * 1543345989);
	((Class334) this).anInt3569
	    = (((Class334) this).aClass137_Sub2_3570.anInt1627 * -657933437
	       >> ((Class334) this).anInt3571);
	((Class334) this).anInt3564
	    = (((Class334) this).aClass137_Sub2_3570.anInt1626 * 1769495707
	       >> ((Class334) this).anInt3571);
    }
}
