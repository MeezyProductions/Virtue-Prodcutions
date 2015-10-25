/* Class172_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class172_Sub5 extends Class172
{
    int anInt9703;
    Interface34 anInterface34_9704;
    Interface36 anInterface36_9705;
    byte[] aByteArray9706 = new byte[512];
    Class173_Sub1 aClass173_Sub1_9707;
    int anInt9708;
    
    void method2132(char c, int i, int i_0_, int i_1_, boolean bool,
		    Class148 class148, int i_2_, int i_3_) {
	/* empty */
    }
    
    void method2125(char c, int i, int i_4_, int i_5_, boolean bool) {
	if (((Class172_Sub5) this).aClass173_Sub1_9707.method8687()
	    != Class336.aClass336_3575) {
	    i += ((Class172_Sub5) this).aByteArray9706[c * '\002'];
	    i_4_ += ((Class172_Sub5) this).aByteArray9706[c * '\002' + '\001'];
	    ((Class173_Sub1) ((Class172_Sub5) this).aClass173_Sub1_9707)
		.aClass371_9321.method4653
		((float) i, (float) i_4_,
		 (float) (i + ((Class172_Sub5) this).anInt9703),
		 (float) (i_4_ + ((Class172_Sub5) this).anInt9703),
		 ((float) (c % '\020') / 16.0F
		  * ((Class172_Sub5) this).anInterface34_9704.method245()),
		 ((float) (c / '\020') / 16.0F
		  * ((Class172_Sub5) this).anInterface34_9704.method217()),
		 ((float) (c % '\020' + '\001') / 16.0F
		  * ((Class172_Sub5) this).anInterface34_9704.method245()),
		 ((float) (c / '\020' + '\001') / 16.0F
		  * ((Class172_Sub5) this).anInterface34_9704.method217()),
		 ((Class172_Sub5) this).anInterface34_9704, i_5_);
	} else {
	    ((Class172_Sub5) this).aClass173_Sub1_9707.method8564();
	    ((Class172_Sub5) this).aClass173_Sub1_9707.method8479(1);
	    Class321 class321
		= (((Class173_Sub1) ((Class172_Sub5) this).aClass173_Sub1_9707)
		   .aClass321_9325);
	    class321.anInterface34_3472
		= ((Class172_Sub5) this).anInterface34_9704;
	    class321.method4204(0, i_5_);
	    float f
		= (float) ((Class172_Sub5) this).aClass173_Sub1_9707.method2403
			      ((byte) -16).method2074();
	    float f_6_
		= (float) ((Class172_Sub5) this).aClass173_Sub1_9707.method2403
			      ((byte) -93).method2070();
	    class321.aClass418_3470.method4976(2.0F / f, 2.0F / f_6_, 1.0F,
					       1.0F);
	    class321.aClass418_3470.aFloatArray4768[12]
		= (((float) i
		    + ((Class172_Sub5) this).aClass173_Sub1_9707.method8468())
		   * 2.0F / f) - 1.0F;
	    class321.aClass418_3470.aFloatArray4768[13]
		= (((float) i_4_
		    + ((Class172_Sub5) this).aClass173_Sub1_9707.method8468())
		   * 2.0F / f_6_) - 1.0F;
	    class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
	    class321.aClass418_3471.method5013();
	    class321.anInterface36_3473
		= ((Class172_Sub5) this).anInterface36_9705;
	    class321.anInt3467 = c * '\004';
	    class321.aClass344_3468
		= (((Class173_Sub1) ((Class172_Sub5) this).aClass173_Sub1_9707)
		   .aClass344_9378);
	    class321.method4206();
	}
    }
    
    void method2136(char c, int i, int i_7_, int i_8_, boolean bool,
		    Class148 class148, int i_9_, int i_10_) {
	/* empty */
    }
    
    void method2129(char c, int i, int i_11_, int i_12_, boolean bool) {
	if (((Class172_Sub5) this).aClass173_Sub1_9707.method8687()
	    != Class336.aClass336_3575) {
	    i += ((Class172_Sub5) this).aByteArray9706[c * '\002'];
	    i_11_
		+= ((Class172_Sub5) this).aByteArray9706[c * '\002' + '\001'];
	    ((Class173_Sub1) ((Class172_Sub5) this).aClass173_Sub1_9707)
		.aClass371_9321.method4653
		((float) i, (float) i_11_,
		 (float) (i + ((Class172_Sub5) this).anInt9703),
		 (float) (i_11_ + ((Class172_Sub5) this).anInt9703),
		 ((float) (c % '\020') / 16.0F
		  * ((Class172_Sub5) this).anInterface34_9704.method245()),
		 ((float) (c / '\020') / 16.0F
		  * ((Class172_Sub5) this).anInterface34_9704.method217()),
		 ((float) (c % '\020' + '\001') / 16.0F
		  * ((Class172_Sub5) this).anInterface34_9704.method245()),
		 ((float) (c / '\020' + '\001') / 16.0F
		  * ((Class172_Sub5) this).anInterface34_9704.method217()),
		 ((Class172_Sub5) this).anInterface34_9704, i_12_);
	} else {
	    ((Class172_Sub5) this).aClass173_Sub1_9707.method8564();
	    ((Class172_Sub5) this).aClass173_Sub1_9707.method8479(1);
	    Class321 class321
		= (((Class173_Sub1) ((Class172_Sub5) this).aClass173_Sub1_9707)
		   .aClass321_9325);
	    class321.anInterface34_3472
		= ((Class172_Sub5) this).anInterface34_9704;
	    class321.method4204(0, i_12_);
	    float f
		= (float) ((Class172_Sub5) this).aClass173_Sub1_9707.method2403
			      ((byte) -80).method2074();
	    float f_13_
		= (float) ((Class172_Sub5) this).aClass173_Sub1_9707.method2403
			      ((byte) -2).method2070();
	    class321.aClass418_3470.method4976(2.0F / f, 2.0F / f_13_, 1.0F,
					       1.0F);
	    class321.aClass418_3470.aFloatArray4768[12]
		= (((float) i
		    + ((Class172_Sub5) this).aClass173_Sub1_9707.method8468())
		   * 2.0F / f) - 1.0F;
	    class321.aClass418_3470.aFloatArray4768[13]
		= (((float) i_11_
		    + ((Class172_Sub5) this).aClass173_Sub1_9707.method8468())
		   * 2.0F / f_13_) - 1.0F;
	    class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
	    class321.aClass418_3471.method5013();
	    class321.anInterface36_3473
		= ((Class172_Sub5) this).anInterface36_9705;
	    class321.anInt3467 = c * '\004';
	    class321.aClass344_3468
		= (((Class173_Sub1) ((Class172_Sub5) this).aClass173_Sub1_9707)
		   .aClass344_9378);
	    class321.method4206();
	}
    }
    
    void method2134(char c, int i, int i_14_, int i_15_, boolean bool) {
	if (((Class172_Sub5) this).aClass173_Sub1_9707.method8687()
	    != Class336.aClass336_3575) {
	    i += ((Class172_Sub5) this).aByteArray9706[c * '\002'];
	    i_14_
		+= ((Class172_Sub5) this).aByteArray9706[c * '\002' + '\001'];
	    ((Class173_Sub1) ((Class172_Sub5) this).aClass173_Sub1_9707)
		.aClass371_9321.method4653
		((float) i, (float) i_14_,
		 (float) (i + ((Class172_Sub5) this).anInt9703),
		 (float) (i_14_ + ((Class172_Sub5) this).anInt9703),
		 ((float) (c % '\020') / 16.0F
		  * ((Class172_Sub5) this).anInterface34_9704.method245()),
		 ((float) (c / '\020') / 16.0F
		  * ((Class172_Sub5) this).anInterface34_9704.method217()),
		 ((float) (c % '\020' + '\001') / 16.0F
		  * ((Class172_Sub5) this).anInterface34_9704.method245()),
		 ((float) (c / '\020' + '\001') / 16.0F
		  * ((Class172_Sub5) this).anInterface34_9704.method217()),
		 ((Class172_Sub5) this).anInterface34_9704, i_15_);
	} else {
	    ((Class172_Sub5) this).aClass173_Sub1_9707.method8564();
	    ((Class172_Sub5) this).aClass173_Sub1_9707.method8479(1);
	    Class321 class321
		= (((Class173_Sub1) ((Class172_Sub5) this).aClass173_Sub1_9707)
		   .aClass321_9325);
	    class321.anInterface34_3472
		= ((Class172_Sub5) this).anInterface34_9704;
	    class321.method4204(0, i_15_);
	    float f
		= (float) ((Class172_Sub5) this).aClass173_Sub1_9707.method2403
			      ((byte) -46).method2074();
	    float f_16_
		= (float) ((Class172_Sub5) this).aClass173_Sub1_9707.method2403
			      ((byte) -22).method2070();
	    class321.aClass418_3470.method4976(2.0F / f, 2.0F / f_16_, 1.0F,
					       1.0F);
	    class321.aClass418_3470.aFloatArray4768[12]
		= (((float) i
		    + ((Class172_Sub5) this).aClass173_Sub1_9707.method8468())
		   * 2.0F / f) - 1.0F;
	    class321.aClass418_3470.aFloatArray4768[13]
		= (((float) i_14_
		    + ((Class172_Sub5) this).aClass173_Sub1_9707.method8468())
		   * 2.0F / f_16_) - 1.0F;
	    class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
	    class321.aClass418_3471.method5013();
	    class321.anInterface36_3473
		= ((Class172_Sub5) this).anInterface36_9705;
	    class321.anInt3467 = c * '\004';
	    class321.aClass344_3468
		= (((Class173_Sub1) ((Class172_Sub5) this).aClass173_Sub1_9707)
		   .aClass344_9378);
	    class321.method4206();
	}
    }
    
    void method2135(char c, int i, int i_17_, int i_18_, boolean bool) {
	if (((Class172_Sub5) this).aClass173_Sub1_9707.method8687()
	    != Class336.aClass336_3575) {
	    i += ((Class172_Sub5) this).aByteArray9706[c * '\002'];
	    i_17_
		+= ((Class172_Sub5) this).aByteArray9706[c * '\002' + '\001'];
	    ((Class173_Sub1) ((Class172_Sub5) this).aClass173_Sub1_9707)
		.aClass371_9321.method4653
		((float) i, (float) i_17_,
		 (float) (i + ((Class172_Sub5) this).anInt9703),
		 (float) (i_17_ + ((Class172_Sub5) this).anInt9703),
		 ((float) (c % '\020') / 16.0F
		  * ((Class172_Sub5) this).anInterface34_9704.method245()),
		 ((float) (c / '\020') / 16.0F
		  * ((Class172_Sub5) this).anInterface34_9704.method217()),
		 ((float) (c % '\020' + '\001') / 16.0F
		  * ((Class172_Sub5) this).anInterface34_9704.method245()),
		 ((float) (c / '\020' + '\001') / 16.0F
		  * ((Class172_Sub5) this).anInterface34_9704.method217()),
		 ((Class172_Sub5) this).anInterface34_9704, i_18_);
	} else {
	    ((Class172_Sub5) this).aClass173_Sub1_9707.method8564();
	    ((Class172_Sub5) this).aClass173_Sub1_9707.method8479(1);
	    Class321 class321
		= (((Class173_Sub1) ((Class172_Sub5) this).aClass173_Sub1_9707)
		   .aClass321_9325);
	    class321.anInterface34_3472
		= ((Class172_Sub5) this).anInterface34_9704;
	    class321.method4204(0, i_18_);
	    float f
		= (float) ((Class172_Sub5) this).aClass173_Sub1_9707.method2403
			      ((byte) -13).method2074();
	    float f_19_
		= (float) ((Class172_Sub5) this).aClass173_Sub1_9707.method2403
			      ((byte) -125).method2070();
	    class321.aClass418_3470.method4976(2.0F / f, 2.0F / f_19_, 1.0F,
					       1.0F);
	    class321.aClass418_3470.aFloatArray4768[12]
		= (((float) i
		    + ((Class172_Sub5) this).aClass173_Sub1_9707.method8468())
		   * 2.0F / f) - 1.0F;
	    class321.aClass418_3470.aFloatArray4768[13]
		= (((float) i_17_
		    + ((Class172_Sub5) this).aClass173_Sub1_9707.method8468())
		   * 2.0F / f_19_) - 1.0F;
	    class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
	    class321.aClass418_3471.method5013();
	    class321.anInterface36_3473
		= ((Class172_Sub5) this).anInterface36_9705;
	    class321.anInt3467 = c * '\004';
	    class321.aClass344_3468
		= (((Class173_Sub1) ((Class172_Sub5) this).aClass173_Sub1_9707)
		   .aClass344_9378);
	    class321.method4206();
	}
    }
    
    void method2138(char c, int i, int i_20_, int i_21_, boolean bool,
		    Class148 class148, int i_22_, int i_23_) {
	/* empty */
    }
    
    Class172_Sub5(Class173_Sub1 class173_sub1, Class1 class1,
		  Class178[] class178s, boolean bool) {
	super(class173_sub1, class1);
	((Class172_Sub5) this).aClass173_Sub1_9707 = class173_sub1;
	((Class172_Sub5) this).anInt9703 = 0;
	for (int i = 0; i < 256; i++) {
	    Class178 class178 = class178s[i];
	    if (class178.method2602() > ((Class172_Sub5) this).anInt9703)
		((Class172_Sub5) this).anInt9703 = class178.method2602();
	    if (class178.method2601() > ((Class172_Sub5) this).anInt9703)
		((Class172_Sub5) this).anInt9703 = class178.method2601();
	}
	((Class172_Sub5) this).anInt9708
	    = ((Class172_Sub5) this).anInt9703 * 16;
	if (bool) {
	    byte[] is = new byte[(((Class172_Sub5) this).anInt9708
				  * ((Class172_Sub5) this).anInt9708)];
	    for (int i = 0; i < 256; i++) {
		Class178 class178 = class178s[i];
		int i_24_ = class178.method2602();
		int i_25_ = class178.method2601();
		int i_26_ = i % 16 * ((Class172_Sub5) this).anInt9703;
		int i_27_ = i / 16 * ((Class172_Sub5) this).anInt9703;
		int i_28_ = i_27_ * ((Class172_Sub5) this).anInt9708 + i_26_;
		int i_29_ = 0;
		if (class178.method2599()) {
		    Class178_Sub2 class178_sub2 = (Class178_Sub2) class178s[i];
		    if (!class178_sub2.method2600()) {
			byte[] is_30_ = class178_sub2.aByteArray9770;
			for (int i_31_ = 0; i_31_ < i_24_; i_31_++) {
			    for (int i_32_ = 0; i_32_ < i_25_; i_32_++)
				is[i_28_++]
				    = (byte) (is_30_[i_29_++] == 0 ? 0 : -1);
			    i_28_ += ((Class172_Sub5) this).anInt9708 - i_25_;
			}
		    } else {
			byte[] is_33_ = class178_sub2.aByteArray9773;
			for (int i_34_ = 0; i_34_ < i_24_; i_34_++) {
			    for (int i_35_ = 0; i_35_ < i_25_; i_35_++)
				is[i_28_++] = is_33_[i_29_++];
			    i_28_ += ((Class172_Sub5) this).anInt9708 - i_25_;
			}
		    }
		} else {
		    Class178_Sub1 class178_sub1 = (Class178_Sub1) class178s[i];
		    int[] is_36_ = class178_sub1.method2629(false);
		    if (!class178_sub1.method2600()) {
			for (int i_37_ = 0; i_37_ < i_24_; i_37_++) {
			    for (int i_38_ = 0; i_38_ < i_25_; i_38_++) {
				int i_39_ = is_36_[i_29_++];
				byte i_40_ = (byte) (((i_39_ >> 16 & 0xff) * 3
						      + (i_39_ >> 8 & 0xff) * 4
						      + (i_39_ & 0xff))
						     >> 3);
				is[i_28_++] = i_40_;
			    }
			    i_28_ += ((Class172_Sub5) this).anInt9708 - i_25_;
			}
		    } else {
			for (int i_41_ = 0; i_41_ < i_24_; i_41_++) {
			    for (int i_42_ = 0; i_42_ < i_25_; i_42_++)
				is[i_28_++]
				    = (byte) (is_36_[i_29_++] >> 24 & 0xff);
			    i_28_ += ((Class172_Sub5) this).anInt9708 - i_25_;
			}
		    }
		}
	    }
	    int[] is_43_ = new int[is.length];
	    for (int i = 0; i < is.length; i++)
		is_43_[i] = is[i] << 24 | 0xffffff;
	    ((Class172_Sub5) this).anInterface34_9704
		= class173_sub1.method8516(((Class172_Sub5) this).anInt9708,
					   ((Class172_Sub5) this).anInt9708,
					   false, is_43_);
	} else {
	    int[] is = new int[(((Class172_Sub5) this).anInt9708
				* ((Class172_Sub5) this).anInt9708)];
	    for (int i = 0; i < 256; i++) {
		Class178 class178 = class178s[i];
		int i_44_ = class178.method2602();
		int i_45_ = class178.method2601();
		int i_46_ = i % 16 * ((Class172_Sub5) this).anInt9703;
		int i_47_ = i / 16 * ((Class172_Sub5) this).anInt9703;
		int i_48_ = i_47_ * ((Class172_Sub5) this).anInt9708 + i_46_;
		int i_49_ = 0;
		if (class178.method2599()) {
		    Class178_Sub2 class178_sub2 = (Class178_Sub2) class178s[i];
		    int[] is_50_ = class178_sub2.anIntArray9769;
		    byte[] is_51_ = class178_sub2.aByteArray9773;
		    byte[] is_52_ = class178_sub2.aByteArray9770;
		    if (is_51_ != null) {
			for (int i_53_ = 0; i_53_ < i_44_; i_53_++) {
			    for (int i_54_ = 0; i_54_ < i_45_; i_54_++) {
				is[i_48_++] = (is_51_[i_49_] << 24
					       | is_50_[is_52_[i_49_] & 0xff]);
				i_49_++;
			    }
			    i_48_ += ((Class172_Sub5) this).anInt9708 - i_45_;
			}
		    } else {
			for (int i_55_ = 0; i_55_ < i_44_; i_55_++) {
			    for (int i_56_ = 0; i_56_ < i_45_; i_56_++) {
				int i_57_;
				if ((i_57_ = is_52_[i_49_++]) != 0)
				    is[i_48_++]
					= ~0xffffff | is_50_[i_57_ & 0xff];
				else
				    i_48_++;
			    }
			    i_48_ += ((Class172_Sub5) this).anInt9708 - i_45_;
			}
		    }
		} else {
		    Class178_Sub1 class178_sub1 = (Class178_Sub1) class178s[i];
		    int[] is_58_ = class178_sub1.method2629(false);
		    if (!class178_sub1.method2600()) {
			for (int i_59_ = 0; i_59_ < i_44_; i_59_++) {
			    for (int i_60_ = 0; i_60_ < i_45_; i_60_++) {
				int i_61_ = is_58_[i_49_] & 0xffffff;
				is[i_48_++]
				    = (i_61_ == 0 ? 0 : 255) << 24 | i_61_;
				i_49_++;
			    }
			    i_48_ += ((Class172_Sub5) this).anInt9708 - i_45_;
			}
		    } else {
			for (int i_62_ = 0; i_62_ < i_44_; i_62_++) {
			    for (int i_63_ = 0; i_63_ < i_45_; i_63_++)
				is[i_48_++] = is_58_[i_49_++];
			    i_48_ += ((Class172_Sub5) this).anInt9708 - i_45_;
			}
		    }
		}
	    }
	    ((Class172_Sub5) this).anInterface34_9704
		= class173_sub1.method8516(((Class172_Sub5) this).anInt9708,
					   ((Class172_Sub5) this).anInt9708,
					   false, is);
	}
	((Class172_Sub5) this).anInterface34_9704
	    .method303(Class340.aClass340_3584);
	((Class172_Sub5) this).anInterface36_9705
	    = class173_sub1.method8549(false);
	((Class172_Sub5) this).anInterface36_9705.method258(20480, 20);
	ByteBuffer bytebuffer
	    = ((Class172_Sub5) this).aClass173_Sub1_9707.aByteBuffer9222;
	bytebuffer.clear();
	float f = (((Class172_Sub5) this).anInterface34_9704
		       .method207((float) ((Class172_Sub5) this).anInt9708)
		   / (float) ((Class172_Sub5) this).anInt9708);
	float f_64_ = (((Class172_Sub5) this).anInterface34_9704
			   .method221((float) ((Class172_Sub5) this).anInt9708)
		       / (float) ((Class172_Sub5) this).anInt9708);
	for (int i = 0; i < 256; i++) {
	    Class178 class178 = class178s[i];
	    int i_65_ = class178.method2602();
	    int i_66_ = class178.method2601();
	    int i_67_ = class178.method2605();
	    int i_68_ = class178.method2603();
	    float f_69_ = (float) (i % 16 * ((Class172_Sub5) this).anInt9703);
	    float f_70_ = (float) (i / 16 * ((Class172_Sub5) this).anInt9703);
	    float f_71_ = f_69_ * f;
	    float f_72_ = f_70_ * f_64_;
	    float f_73_ = (f_69_ + (float) i_66_) * f;
	    float f_74_ = (f_70_ + (float) i_65_) * f_64_;
	    bytebuffer.putFloat((float) i_68_);
	    bytebuffer.putFloat((float) i_67_);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(f_71_);
	    bytebuffer.putFloat(f_72_);
	    bytebuffer.putFloat((float) i_68_);
	    bytebuffer.putFloat((float) (i_67_ + i_65_));
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(f_71_);
	    bytebuffer.putFloat(f_74_);
	    bytebuffer.putFloat((float) (i_68_ + i_66_));
	    bytebuffer.putFloat((float) (i_67_ + i_65_));
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(f_73_);
	    bytebuffer.putFloat(f_74_);
	    bytebuffer.putFloat((float) (i_68_ + i_66_));
	    bytebuffer.putFloat((float) i_67_);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(f_73_);
	    bytebuffer.putFloat(f_72_);
	}
	((Class172_Sub5) this).anInterface36_9705.method197
	    (0, bytebuffer.position(),
	     ((Class172_Sub5) this).aClass173_Sub1_9707.aLong9223);
	for (int i = 0; i < 256; i++) {
	    Class178 class178 = class178s[i];
	    ((Class172_Sub5) this).aByteArray9706[i * 2]
		= (byte) class178.method2603();
	    ((Class172_Sub5) this).aByteArray9706[i * 2 + 1]
		= (byte) class178.method2605();
	}
    }
    
    void method2137(char c, int i, int i_75_, int i_76_, boolean bool,
		    Class148 class148, int i_77_, int i_78_) {
	/* empty */
    }
    
    void method2139(char c, int i, int i_79_, int i_80_, boolean bool,
		    Class148 class148, int i_81_, int i_82_) {
	/* empty */
    }
}
