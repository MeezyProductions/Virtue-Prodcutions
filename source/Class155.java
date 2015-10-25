/* Class155 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class155
{
    int anInt1724;
    Class137_Sub3 aClass137_Sub3_1725;
    Class173_Sub2 aClass173_Sub2_1726;
    byte[] aByteArray1727;
    int anInt1728;
    int anInt1729;
    int anInt1730;
    int anInt1731;
    Class131[][] aClass131ArrayArray1732;
    
    static final boolean method1838(byte[] is, int i, int i_0_, int i_1_,
				    int i_2_, int i_3_) {
	int i_4_ = i_0_ % i_3_;
	int i_5_;
	if (i_4_ != 0)
	    i_5_ = i_3_ - i_4_;
	else
	    i_5_ = 0;
	int i_6_ = -((i_1_ + i_3_ - 1) / i_3_);
	int i_7_ = -((i_0_ + i_3_ - 1) / i_3_);
	for (int i_8_ = i_6_; i_8_ < 0; i_8_++) {
	    for (int i_9_ = i_7_; i_9_ < 0; i_9_++) {
		if (is[i] == 0)
		    return true;
		i += i_3_;
	    }
	    i -= i_5_;
	    if (is[i - 1] == 0)
		return true;
	    i += i_2_;
	}
	return false;
    }
    
    void method1839(int i, int i_10_, int i_11_, boolean[][] bools,
		    boolean bool) {
	((Class155) this).aClass173_Sub2_1726.method8784(false);
	((Class155) this).aClass173_Sub2_1726.method8787(false);
	((Class155) this).aClass173_Sub2_1726.method8840(-2);
	((Class155) this).aClass173_Sub2_1726.method8776(1);
	((Class155) this).aClass173_Sub2_1726.method8788(1);
	float f
	    = 1.0F / (float) (((Class173_Sub2)
			       ((Class155) this).aClass173_Sub2_1726).anInt9456
			      * 128);
	if (bool) {
	    for (int i_12_ = 0; i_12_ < ((Class155) this).anInt1730; i_12_++) {
		int i_13_ = i_12_ << ((Class155) this).anInt1731;
		int i_14_ = i_12_ + 1 << ((Class155) this).anInt1731;
		for (int i_15_ = 0; i_15_ < ((Class155) this).anInt1724;
		     i_15_++) {
		    int i_16_ = i_15_ << ((Class155) this).anInt1731;
		    int i_17_ = i_15_ + 1 << ((Class155) this).anInt1731;
		while_31_:
		    for (int i_18_ = i_16_; i_18_ < i_17_; i_18_++) {
			if (i_18_ - i >= -i_11_ && i_18_ - i <= i_11_) {
			    for (int i_19_ = i_13_; i_19_ < i_14_; i_19_++) {
				if (i_19_ - i_10_ >= -i_11_
				    && i_19_ - i_10_ <= i_11_
				    && (bools[i_18_ - i + i_11_]
					[i_19_ - i_10_ + i_11_])) {
				    OpenGL.glMatrixMode(5890);
				    OpenGL.glLoadIdentity();
				    OpenGL.glScalef(f, f, 1.0F);
				    OpenGL.glTranslatef((float) -i_15_ / f,
							(float) -i_12_ / f,
							1.0F);
				    OpenGL.glMatrixMode(5888);
				    ((Class155) this)
					.aClass131ArrayArray1732[i_15_][i_12_]
					.method1625();
				    break while_31_;
				}
			    }
			}
		    }
		}
	    }
	} else {
	    for (int i_20_ = 0; i_20_ < ((Class155) this).anInt1730; i_20_++) {
		int i_21_ = i_20_ << ((Class155) this).anInt1731;
		int i_22_ = i_20_ + 1 << ((Class155) this).anInt1731;
		for (int i_23_ = 0; i_23_ < ((Class155) this).anInt1724;
		     i_23_++) {
		    int i_24_ = 0;
		    int i_25_ = i_23_ << ((Class155) this).anInt1731;
		    int i_26_ = i_23_ + 1 << ((Class155) this).anInt1731;
		    Class528_Sub42_Sub1 class528_sub42_sub1
			= (((Class173_Sub2)
			    ((Class155) this).aClass173_Sub2_1726)
			   .aClass528_Sub42_Sub1_9597);
		    class528_sub42_sub1.pointer = 0;
		    for (int i_27_ = i_21_; i_27_ < i_22_; i_27_++) {
			if (i_27_ - i_10_ >= -i_11_
			    && i_27_ - i_10_ <= i_11_) {
			    int i_28_
				= (i_27_ * ((((Class155) this)
					     .aClass137_Sub3_1725.anInt1627)
					    * -657933437)
				   + i_25_);
			    for (int i_29_ = i_25_; i_29_ < i_26_; i_29_++) {
				if (i_29_ - i >= -i_11_ && i_29_ - i <= i_11_
				    && (bools[i_29_ - i + i_11_]
					[i_27_ - i_10_ + i_11_])) {
				    short[] is
					= (((Class137_Sub3)
					    (((Class155) this)
					     .aClass137_Sub3_1725))
					   .aShortArrayArray9006[i_28_]);
				    if (is != null) {
					if (((Class173_Sub2)
					     (((Class155) this)
					      .aClass173_Sub2_1726))
					    .aBool9561) {
					    for (int i_30_ = 0;
						 i_30_ < is.length; i_30_++) {
						class528_sub42_sub1.method9717
						    (is[i_30_] & 0xffff,
						     (byte) -77);
						i_24_++;
					    }
					} else {
					    for (int i_31_ = 0;
						 i_31_ < is.length; i_31_++) {
						class528_sub42_sub1.writeLEShort
						    (is[i_31_] & 0xffff,
						     -1102718643);
						i_24_++;
					    }
					}
				    }
				}
				i_28_++;
			    }
			}
		    }
		    if (i_24_ > 0) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glScalef(f, f, 1.0F);
			OpenGL.glTranslatef((float) -i_23_ / f,
					    (float) -i_20_ / f, 1.0F);
			OpenGL.glMatrixMode(5888);
			((Class155) this).aClass131ArrayArray1732[i_23_]
			    [i_20_].method1627
			    (class528_sub42_sub1.payload, i_24_);
		    }
		}
	    }
	}
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
    }
    
    void method1840(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
		    int i_32_) {
	Class528_Sub21_Sub12_Sub2 class528_sub21_sub12_sub2
	    = (Class528_Sub21_Sub12_Sub2) class528_sub21_sub12;
	i += (((Class528_Sub21_Sub12_Sub2) class528_sub21_sub12_sub2)
	      .anInt12004) + 1;
	i_32_ += (((Class528_Sub21_Sub12_Sub2) class528_sub21_sub12_sub2)
		  .anInt12005) + 1;
	int i_33_ = i + i_32_ * ((Class155) this).anInt1729;
	int i_34_ = 0;
	int i_35_ = (((Class528_Sub21_Sub12_Sub2) class528_sub21_sub12_sub2)
		     .anInt12006);
	int i_36_ = (((Class528_Sub21_Sub12_Sub2) class528_sub21_sub12_sub2)
		     .anInt12002);
	int i_37_ = ((Class155) this).anInt1729 - i_36_;
	int i_38_ = 0;
	if (i_32_ <= 0) {
	    int i_39_ = 1 - i_32_;
	    i_35_ -= i_39_;
	    i_34_ += i_39_ * i_36_;
	    i_33_ += i_39_ * ((Class155) this).anInt1729;
	    i_32_ = 1;
	}
	if (i_32_ + i_35_ >= ((Class155) this).anInt1728) {
	    int i_40_ = i_32_ + i_35_ + 1 - ((Class155) this).anInt1728;
	    i_35_ -= i_40_;
	}
	if (i <= 0) {
	    int i_41_ = 1 - i;
	    i_36_ -= i_41_;
	    i_34_ += i_41_;
	    i_33_ += i_41_;
	    i_38_ += i_41_;
	    i_37_ += i_41_;
	    i = 1;
	}
	if (i + i_36_ >= ((Class155) this).anInt1729) {
	    int i_42_ = i + i_36_ + 1 - ((Class155) this).anInt1729;
	    i_36_ -= i_42_;
	    i_38_ += i_42_;
	    i_37_ += i_42_;
	}
	if (i_36_ > 0 && i_35_ > 0) {
	    method1844(((Class155) this).aByteArray1727,
		       (((Class528_Sub21_Sub12_Sub2) class528_sub21_sub12_sub2)
			.aByteArray12003),
		       i_34_, i_33_, i_36_, i_35_, i_37_, i_38_);
	    method1843(i, i_32_, i_36_, i_35_);
	}
    }
    
    void method1841(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
		    int i_43_) {
	Class528_Sub21_Sub12_Sub2 class528_sub21_sub12_sub2
	    = (Class528_Sub21_Sub12_Sub2) class528_sub21_sub12;
	i += (((Class528_Sub21_Sub12_Sub2) class528_sub21_sub12_sub2)
	      .anInt12004) + 1;
	i_43_ += (((Class528_Sub21_Sub12_Sub2) class528_sub21_sub12_sub2)
		  .anInt12005) + 1;
	int i_44_ = i + i_43_ * ((Class155) this).anInt1729;
	int i_45_ = 0;
	int i_46_ = (((Class528_Sub21_Sub12_Sub2) class528_sub21_sub12_sub2)
		     .anInt12006);
	int i_47_ = (((Class528_Sub21_Sub12_Sub2) class528_sub21_sub12_sub2)
		     .anInt12002);
	int i_48_ = ((Class155) this).anInt1729 - i_47_;
	int i_49_ = 0;
	if (i_43_ <= 0) {
	    int i_50_ = 1 - i_43_;
	    i_46_ -= i_50_;
	    i_45_ += i_50_ * i_47_;
	    i_44_ += i_50_ * ((Class155) this).anInt1729;
	    i_43_ = 1;
	}
	if (i_43_ + i_46_ >= ((Class155) this).anInt1728) {
	    int i_51_ = i_43_ + i_46_ + 1 - ((Class155) this).anInt1728;
	    i_46_ -= i_51_;
	}
	if (i <= 0) {
	    int i_52_ = 1 - i;
	    i_47_ -= i_52_;
	    i_45_ += i_52_;
	    i_44_ += i_52_;
	    i_49_ += i_52_;
	    i_48_ += i_52_;
	    i = 1;
	}
	if (i + i_47_ >= ((Class155) this).anInt1729) {
	    int i_53_ = i + i_47_ + 1 - ((Class155) this).anInt1729;
	    i_47_ -= i_53_;
	    i_49_ += i_53_;
	    i_48_ += i_53_;
	}
	if (i_47_ > 0 && i_46_ > 0) {
	    method1845(((Class155) this).aByteArray1727,
		       (((Class528_Sub21_Sub12_Sub2) class528_sub21_sub12_sub2)
			.aByteArray12003),
		       i_45_, i_44_, i_47_, i_46_, i_48_, i_49_);
	    method1843(i, i_43_, i_47_, i_46_);
	}
    }
    
    boolean method1842(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
		       int i_54_) {
	Class528_Sub21_Sub12_Sub2 class528_sub21_sub12_sub2
	    = (Class528_Sub21_Sub12_Sub2) class528_sub21_sub12;
	i += (((Class528_Sub21_Sub12_Sub2) class528_sub21_sub12_sub2)
	      .anInt12004) + 1;
	i_54_ += (((Class528_Sub21_Sub12_Sub2) class528_sub21_sub12_sub2)
		  .anInt12005) + 1;
	int i_55_ = i + i_54_ * ((Class155) this).anInt1729;
	int i_56_ = (((Class528_Sub21_Sub12_Sub2) class528_sub21_sub12_sub2)
		     .anInt12006);
	int i_57_ = (((Class528_Sub21_Sub12_Sub2) class528_sub21_sub12_sub2)
		     .anInt12002);
	int i_58_ = ((Class155) this).anInt1729 - i_57_;
	if (i_54_ <= 0) {
	    int i_59_ = 1 - i_54_;
	    i_56_ -= i_59_;
	    i_55_ += i_59_ * ((Class155) this).anInt1729;
	    i_54_ = 1;
	}
	if (i_54_ + i_56_ >= ((Class155) this).anInt1728) {
	    int i_60_ = i_54_ + i_56_ + 1 - ((Class155) this).anInt1728;
	    i_56_ -= i_60_;
	}
	if (i <= 0) {
	    int i_61_ = 1 - i;
	    i_57_ -= i_61_;
	    i_55_ += i_61_;
	    i_58_ += i_61_;
	    i = 1;
	}
	if (i + i_57_ >= ((Class155) this).anInt1729) {
	    int i_62_ = i + i_57_ + 1 - ((Class155) this).anInt1729;
	    i_57_ -= i_62_;
	    i_58_ += i_62_;
	}
	if (i_57_ <= 0 || i_56_ <= 0)
	    return false;
	int i_63_ = 8;
	i_58_ += (i_63_ - 1) * ((Class155) this).anInt1729;
	return method1838(((Class155) this).aByteArray1727, i_55_, i_57_,
			  i_56_, i_58_, i_63_);
    }
    
    void method1843(int i, int i_64_, int i_65_, int i_66_) {
	if (((Class155) this).aClass131ArrayArray1732 != null) {
	    int i_67_ = i - 1 >> 7;
	    int i_68_ = i - 1 + i_65_ - 1 >> 7;
	    int i_69_ = i_64_ - 1 >> 7;
	    int i_70_ = i_64_ - 1 + i_66_ - 1 >> 7;
	    for (int i_71_ = i_67_; i_71_ <= i_68_; i_71_++) {
		Class131[] class131s
		    = ((Class155) this).aClass131ArrayArray1732[i_71_];
		for (int i_72_ = i_69_; i_72_ <= i_70_; i_72_++)
		    ((Class131) class131s[i_72_]).aBool1602 = true;
	    }
	}
    }
    
    static final void method1844(byte[] is, byte[] is_73_, int i, int i_74_,
				 int i_75_, int i_76_, int i_77_, int i_78_) {
	int i_79_ = -(i_75_ >> 2);
	i_75_ = -(i_75_ & 0x3);
	for (int i_80_ = -i_76_; i_80_ < 0; i_80_++) {
	    for (int i_81_ = i_79_; i_81_ < 0; i_81_++) {
		is[i_74_++] += is_73_[i++];
		is[i_74_++] += is_73_[i++];
		is[i_74_++] += is_73_[i++];
		is[i_74_++] += is_73_[i++];
	    }
	    for (int i_82_ = i_75_; i_82_ < 0; i_82_++)
		is[i_74_++] += is_73_[i++];
	    i_74_ += i_77_;
	    i += i_78_;
	}
    }
    
    static final void method1845(byte[] is, byte[] is_83_, int i, int i_84_,
				 int i_85_, int i_86_, int i_87_, int i_88_) {
	int i_89_ = -(i_85_ >> 2);
	i_85_ = -(i_85_ & 0x3);
	for (int i_90_ = -i_86_; i_90_ < 0; i_90_++) {
	    for (int i_91_ = i_89_; i_91_ < 0; i_91_++) {
		is[i_84_++] -= is_83_[i++];
		is[i_84_++] -= is_83_[i++];
		is[i_84_++] -= is_83_[i++];
		is[i_84_++] -= is_83_[i++];
	    }
	    for (int i_92_ = i_85_; i_92_ < 0; i_92_++)
		is[i_84_++] -= is_83_[i++];
	    i_84_ += i_87_;
	    i += i_88_;
	}
    }
    
    void method1846() {
	((Class155) this).aClass131ArrayArray1732
	    = (new Class131[((Class155) this).anInt1724]
	       [((Class155) this).anInt1730]);
	for (int i = 0; i < ((Class155) this).anInt1730; i++) {
	    for (int i_93_ = 0; i_93_ < ((Class155) this).anInt1724; i_93_++)
		((Class155) this).aClass131ArrayArray1732[i_93_][i]
		    = new Class131(((Class155) this).aClass173_Sub2_1726, this,
				   ((Class155) this).aClass137_Sub3_1725,
				   i_93_, i, ((Class155) this).anInt1731,
				   i_93_ * 128 + 1, i * 128 + 1);
	}
    }
    
    Class155(Class173_Sub2 class173_sub2, Class137_Sub3 class137_sub3) {
	((Class155) this).aClass173_Sub2_1726 = class173_sub2;
	((Class155) this).aClass137_Sub3_1725 = class137_sub3;
	((Class155) this).anInt1729
	    = 2 + ((((Class155) this).aClass137_Sub3_1725.anInt1627
		    * -657933437
		    * (((Class155) this).aClass137_Sub3_1725.anInt1628
		       * 2130003981))
		   >> (((Class173_Sub2) ((Class155) this).aClass173_Sub2_1726)
		       .anInt9438));
	((Class155) this).anInt1728
	    = 2 + ((((Class155) this).aClass137_Sub3_1725.anInt1626
		    * 1769495707
		    * (((Class155) this).aClass137_Sub3_1725.anInt1628
		       * 2130003981))
		   >> (((Class173_Sub2) ((Class155) this).aClass173_Sub2_1726)
		       .anInt9438));
	((Class155) this).aByteArray1727
	    = (new byte
	       [((Class155) this).anInt1729 * ((Class155) this).anInt1728]);
	((Class155) this).anInt1731
	    = (7
	       + (((Class173_Sub2) ((Class155) this).aClass173_Sub2_1726)
		  .anInt9438)
	       - ((Class155) this).aClass137_Sub3_1725.anInt1625 * 1543345989);
	((Class155) this).anInt1724
	    = (((Class155) this).aClass137_Sub3_1725.anInt1627 * -657933437
	       >> ((Class155) this).anInt1731);
	((Class155) this).anInt1730
	    = (((Class155) this).aClass137_Sub3_1725.anInt1626 * 1769495707
	       >> ((Class155) this).anInt1731);
    }
    
    void method1847(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
		    int i_94_) {
	Class528_Sub21_Sub12_Sub2 class528_sub21_sub12_sub2
	    = (Class528_Sub21_Sub12_Sub2) class528_sub21_sub12;
	i += (((Class528_Sub21_Sub12_Sub2) class528_sub21_sub12_sub2)
	      .anInt12004) + 1;
	i_94_ += (((Class528_Sub21_Sub12_Sub2) class528_sub21_sub12_sub2)
		  .anInt12005) + 1;
	int i_95_ = i + i_94_ * ((Class155) this).anInt1729;
	int i_96_ = 0;
	int i_97_ = (((Class528_Sub21_Sub12_Sub2) class528_sub21_sub12_sub2)
		     .anInt12006);
	int i_98_ = (((Class528_Sub21_Sub12_Sub2) class528_sub21_sub12_sub2)
		     .anInt12002);
	int i_99_ = ((Class155) this).anInt1729 - i_98_;
	int i_100_ = 0;
	if (i_94_ <= 0) {
	    int i_101_ = 1 - i_94_;
	    i_97_ -= i_101_;
	    i_96_ += i_101_ * i_98_;
	    i_95_ += i_101_ * ((Class155) this).anInt1729;
	    i_94_ = 1;
	}
	if (i_94_ + i_97_ >= ((Class155) this).anInt1728) {
	    int i_102_ = i_94_ + i_97_ + 1 - ((Class155) this).anInt1728;
	    i_97_ -= i_102_;
	}
	if (i <= 0) {
	    int i_103_ = 1 - i;
	    i_98_ -= i_103_;
	    i_96_ += i_103_;
	    i_95_ += i_103_;
	    i_100_ += i_103_;
	    i_99_ += i_103_;
	    i = 1;
	}
	if (i + i_98_ >= ((Class155) this).anInt1729) {
	    int i_104_ = i + i_98_ + 1 - ((Class155) this).anInt1729;
	    i_98_ -= i_104_;
	    i_100_ += i_104_;
	    i_99_ += i_104_;
	}
	if (i_98_ > 0 && i_97_ > 0) {
	    method1845(((Class155) this).aByteArray1727,
		       (((Class528_Sub21_Sub12_Sub2) class528_sub21_sub12_sub2)
			.aByteArray12003),
		       i_96_, i_95_, i_98_, i_97_, i_99_, i_100_);
	    method1843(i, i_94_, i_98_, i_97_);
	}
    }
    
    void method1848(int i, int i_105_, int i_106_, int i_107_) {
	if (((Class155) this).aClass131ArrayArray1732 != null) {
	    int i_108_ = i - 1 >> 7;
	    int i_109_ = i - 1 + i_106_ - 1 >> 7;
	    int i_110_ = i_105_ - 1 >> 7;
	    int i_111_ = i_105_ - 1 + i_107_ - 1 >> 7;
	    for (int i_112_ = i_108_; i_112_ <= i_109_; i_112_++) {
		Class131[] class131s
		    = ((Class155) this).aClass131ArrayArray1732[i_112_];
		for (int i_113_ = i_110_; i_113_ <= i_111_; i_113_++)
		    ((Class131) class131s[i_113_]).aBool1602 = true;
	    }
	}
    }
    
    static final void method1849(byte[] is, byte[] is_114_, int i, int i_115_,
				 int i_116_, int i_117_, int i_118_,
				 int i_119_) {
	int i_120_ = -(i_116_ >> 2);
	i_116_ = -(i_116_ & 0x3);
	for (int i_121_ = -i_117_; i_121_ < 0; i_121_++) {
	    for (int i_122_ = i_120_; i_122_ < 0; i_122_++) {
		is[i_115_++] -= is_114_[i++];
		is[i_115_++] -= is_114_[i++];
		is[i_115_++] -= is_114_[i++];
		is[i_115_++] -= is_114_[i++];
	    }
	    for (int i_123_ = i_116_; i_123_ < 0; i_123_++)
		is[i_115_++] -= is_114_[i++];
	    i_115_ += i_118_;
	    i += i_119_;
	}
    }
    
    void method1850() {
	((Class155) this).aClass131ArrayArray1732
	    = (new Class131[((Class155) this).anInt1724]
	       [((Class155) this).anInt1730]);
	for (int i = 0; i < ((Class155) this).anInt1730; i++) {
	    for (int i_124_ = 0; i_124_ < ((Class155) this).anInt1724;
		 i_124_++)
		((Class155) this).aClass131ArrayArray1732[i_124_][i]
		    = new Class131(((Class155) this).aClass173_Sub2_1726, this,
				   ((Class155) this).aClass137_Sub3_1725,
				   i_124_, i, ((Class155) this).anInt1731,
				   i_124_ * 128 + 1, i * 128 + 1);
	}
    }
}
