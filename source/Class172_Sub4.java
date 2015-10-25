/* Class172_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class172_Sub4 extends Class172
{
    Class111 aClass111_9617;
    Class120_Sub4_Sub1 aClass120_Sub4_Sub1_9618;
    boolean aBool9619;
    Class173_Sub2 aClass173_Sub2_9620;
    
    void method2136(char c, int i, int i_0_, int i_1_, boolean bool,
		    Class148 class148, int i_2_, int i_3_) {
	Class148_Sub3 class148_sub3 = (Class148_Sub3) class148;
	Class120_Sub4_Sub1 class120_sub4_sub1
	    = ((Class148_Sub3) class148_sub3).aClass120_Sub4_Sub1_8920;
	((Class172_Sub4) this).aClass173_Sub2_9620.method8771();
	((Class172_Sub4) this).aClass173_Sub2_9620
	    .method8775(((Class172_Sub4) this).aClass120_Sub4_Sub1_9618);
	if (((Class172_Sub4) this).aBool9619 || bool) {
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8754(7681, 8448);
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 34168,
								  768);
	} else
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8754(7681, 7681);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8774(1);
	((Class172_Sub4) this).aClass173_Sub2_9620
	    .method8775(class120_sub4_sub1);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8754(7681, 8448);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 34168, 768);
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glTexGeni(8193, 9472, 9216);
	float f
	    = (((Class120_Sub4_Sub1) class120_sub4_sub1).aFloat11218
	       / (float) ((Class120_Sub4_Sub1) class120_sub4_sub1).anInt11216);
	float f_4_
	    = (((Class120_Sub4_Sub1) class120_sub4_sub1).aFloat11217
	       / (float) ((Class120_Sub4_Sub1) class120_sub4_sub1).anInt11215);
	OpenGL.glTexGenfv(8192, 9474,
			  new float[] { f, 0.0F, 0.0F, (float) -i_2_ * f }, 0);
	OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_4_, 0.0F,
						    (float) -i_3_ * f_4_ }, 0);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	OpenGL.glColor4ub((byte) (i_1_ >> 16), (byte) (i_1_ >> 8), (byte) i_1_,
			  (byte) (i_1_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_0_, 0.0F);
	((Class172_Sub4) this).aClass111_9617.method1428(c);
	OpenGL.glLoadIdentity();
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 5890, 768);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8754(8448, 8448);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8775(null);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8774(0);
	if (((Class172_Sub4) this).aBool9619 || bool)
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 5890,
								  768);
    }
    
    void method2125(char c, int i, int i_5_, int i_6_, boolean bool) {
	((Class172_Sub4) this).aClass173_Sub2_9620.method8771();
	((Class172_Sub4) this).aClass173_Sub2_9620
	    .method8775(((Class172_Sub4) this).aClass120_Sub4_Sub1_9618);
	if (((Class172_Sub4) this).aBool9619 || bool) {
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8754(7681, 8448);
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 34168,
								  768);
	} else
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8754(7681, 7681);
	OpenGL.glColor4ub((byte) (i_6_ >> 16), (byte) (i_6_ >> 8), (byte) i_6_,
			  (byte) (i_6_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_5_, 0.0F);
	((Class172_Sub4) this).aClass111_9617.method1428(c);
	OpenGL.glLoadIdentity();
	if (((Class172_Sub4) this).aBool9619 || bool)
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 5890,
								  768);
    }
    
    Class172_Sub4(Class173_Sub2 class173_sub2, Class1 class1,
		  Class178[] class178s, boolean bool) {
	super(class173_sub2, class1);
	((Class172_Sub4) this).aClass173_Sub2_9620 = class173_sub2;
	int i = 0;
	for (int i_7_ = 0; i_7_ < 256; i_7_++) {
	    Class178 class178 = class178s[i_7_];
	    if (class178.method2602() > i)
		i = class178.method2602();
	    if (class178.method2601() > i)
		i = class178.method2601();
	}
	int i_8_ = i * 16;
	if (bool) {
	    byte[] is = new byte[i_8_ * i_8_];
	    for (int i_9_ = 0; i_9_ < 256; i_9_++) {
		Class178 class178 = class178s[i_9_];
		int i_10_ = class178.method2602();
		int i_11_ = class178.method2601();
		int i_12_ = i_9_ % 16 * i;
		int i_13_ = i_9_ / 16 * i;
		int i_14_ = i_13_ * i_8_ + i_12_;
		int i_15_ = 0;
		if (class178.method2599()) {
		    Class178_Sub2 class178_sub2
			= (Class178_Sub2) class178s[i_9_];
		    if (!class178_sub2.method2600()) {
			byte[] is_16_ = class178_sub2.aByteArray9770;
			for (int i_17_ = 0; i_17_ < i_10_; i_17_++) {
			    for (int i_18_ = 0; i_18_ < i_11_; i_18_++)
				is[i_14_++]
				    = (byte) (is_16_[i_15_++] == 0 ? 0 : -1);
			    i_14_ += i_8_ - i_11_;
			}
		    } else {
			byte[] is_19_ = class178_sub2.aByteArray9773;
			for (int i_20_ = 0; i_20_ < i_10_; i_20_++) {
			    for (int i_21_ = 0; i_21_ < i_11_; i_21_++)
				is[i_14_++] = is_19_[i_15_++];
			    i_14_ += i_8_ - i_11_;
			}
		    }
		} else {
		    Class178_Sub1 class178_sub1
			= (Class178_Sub1) class178s[i_9_];
		    int[] is_22_ = class178_sub1.method2629(false);
		    if (!class178_sub1.method2600()) {
			for (int i_23_ = 0; i_23_ < i_10_; i_23_++) {
			    for (int i_24_ = 0; i_24_ < i_11_; i_24_++) {
				int i_25_ = is_22_[i_15_++];
				byte i_26_ = (byte) (((i_25_ >> 16 & 0xff) * 3
						      + (i_25_ >> 8 & 0xff) * 4
						      + (i_25_ & 0xff))
						     >> 3);
				is[i_14_++] = i_26_;
			    }
			    i_14_ += i_8_ - i_11_;
			}
		    } else {
			for (int i_27_ = 0; i_27_ < i_10_; i_27_++) {
			    for (int i_28_ = 0; i_28_ < i_11_; i_28_++)
				is[i_14_++]
				    = (byte) (is_22_[i_15_++] >> 24 & 0xff);
			    i_14_ += i_8_ - i_11_;
			}
		    }
		}
	    }
	    ((Class172_Sub4) this).aClass120_Sub4_Sub1_9618
		= Class120_Sub4_Sub1.method10318(class173_sub2,
						 Class149.aClass149_1677,
						 Class169.aClass169_1935, i_8_,
						 i_8_, false, is,
						 Class149.aClass149_1677);
	    ((Class172_Sub4) this).aBool9619 = true;
	} else {
	    int[] is = new int[i_8_ * i_8_];
	    for (int i_29_ = 0; i_29_ < 256; i_29_++) {
		Class178 class178 = class178s[i_29_];
		int i_30_ = class178.method2602();
		int i_31_ = class178.method2601();
		int i_32_ = i_29_ % 16 * i;
		int i_33_ = i_29_ / 16 * i;
		int i_34_ = i_33_ * i_8_ + i_32_;
		int i_35_ = 0;
		if (class178.method2599()) {
		    Class178_Sub2 class178_sub2
			= (Class178_Sub2) class178s[i_29_];
		    int[] is_36_ = class178_sub2.anIntArray9769;
		    byte[] is_37_ = class178_sub2.aByteArray9773;
		    byte[] is_38_ = class178_sub2.aByteArray9770;
		    if (is_37_ != null) {
			for (int i_39_ = 0; i_39_ < i_30_; i_39_++) {
			    for (int i_40_ = 0; i_40_ < i_31_; i_40_++) {
				is[i_34_++] = (is_37_[i_35_] << 24
					       | is_36_[is_38_[i_35_] & 0xff]);
				i_35_++;
			    }
			    i_34_ += i_8_ - i_31_;
			}
		    } else {
			for (int i_41_ = 0; i_41_ < i_30_; i_41_++) {
			    for (int i_42_ = 0; i_42_ < i_31_; i_42_++) {
				int i_43_;
				if ((i_43_ = is_38_[i_35_++]) != 0)
				    is[i_34_++]
					= ~0xffffff | is_36_[i_43_ & 0xff];
				else
				    i_34_++;
			    }
			    i_34_ += i_8_ - i_31_;
			}
		    }
		} else {
		    Class178_Sub1 class178_sub1
			= (Class178_Sub1) class178s[i_29_];
		    int[] is_44_ = class178_sub1.method2629(false);
		    if (!class178_sub1.method2600()) {
			for (int i_45_ = 0; i_45_ < i_30_; i_45_++) {
			    for (int i_46_ = 0; i_46_ < i_31_; i_46_++) {
				int i_47_ = is_44_[i_35_] & 0xffffff;
				is[i_34_++]
				    = (i_47_ == 0 ? 0 : 255) << 24 | i_47_;
				i_35_++;
			    }
			    i_34_ += i_8_ - i_31_;
			}
		    } else {
			for (int i_48_ = 0; i_48_ < i_30_; i_48_++) {
			    for (int i_49_ = 0; i_49_ < i_31_; i_49_++)
				is[i_34_++] = is_44_[i_35_++];
			    i_34_ += i_8_ - i_31_;
			}
		    }
		}
	    }
	    ((Class172_Sub4) this).aClass120_Sub4_Sub1_9618
		= Class120_Sub4_Sub1.method10319(class173_sub2, i_8_, i_8_,
						 false, is, 0, 0);
	    ((Class172_Sub4) this).aBool9619 = false;
	}
	((Class172_Sub4) this).aClass120_Sub4_Sub1_9618.method1545(false);
	((Class172_Sub4) this).aClass111_9617
	    = new Class111(class173_sub2, 256);
	float f
	    = (((Class120_Sub4_Sub1)
		((Class172_Sub4) this).aClass120_Sub4_Sub1_9618).aFloat11218
	       / (float) (((Class120_Sub4_Sub1)
			   ((Class172_Sub4) this).aClass120_Sub4_Sub1_9618)
			  .anInt11216));
	float f_50_
	    = (((Class120_Sub4_Sub1)
		((Class172_Sub4) this).aClass120_Sub4_Sub1_9618).aFloat11217
	       / (float) (((Class120_Sub4_Sub1)
			   ((Class172_Sub4) this).aClass120_Sub4_Sub1_9618)
			  .anInt11215));
	for (int i_51_ = 0; i_51_ < 256; i_51_++) {
	    Class178 class178 = class178s[i_51_];
	    int i_52_ = class178.method2602();
	    int i_53_ = class178.method2601();
	    int i_54_ = class178.method2605();
	    int i_55_ = class178.method2603();
	    float f_56_ = (float) (i_51_ % 16 * i);
	    float f_57_ = (float) (i_51_ / 16 * i);
	    float f_58_ = f_56_ * f;
	    float f_59_ = f_57_ * f_50_;
	    float f_60_ = (f_56_ + (float) i_53_) * f;
	    float f_61_ = (f_57_ + (float) i_52_) * f_50_;
	    ((Class172_Sub4) this).aClass111_9617.method1426(i_51_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(f_58_, (((Class120_Sub4_Sub1)
					 (((Class172_Sub4) this)
					  .aClass120_Sub4_Sub1_9618))
					.aFloat11217) - f_59_);
	    OpenGL.glVertex2i(i_55_, i_54_);
	    OpenGL.glTexCoord2f(f_58_, (((Class120_Sub4_Sub1)
					 (((Class172_Sub4) this)
					  .aClass120_Sub4_Sub1_9618))
					.aFloat11217) - f_61_);
	    OpenGL.glVertex2i(i_55_, i_54_ + i_52_);
	    OpenGL.glTexCoord2f(f_60_, (((Class120_Sub4_Sub1)
					 (((Class172_Sub4) this)
					  .aClass120_Sub4_Sub1_9618))
					.aFloat11217) - f_61_);
	    OpenGL.glVertex2i(i_55_ + i_53_, i_54_ + i_52_);
	    OpenGL.glTexCoord2f(f_60_, (((Class120_Sub4_Sub1)
					 (((Class172_Sub4) this)
					  .aClass120_Sub4_Sub1_9618))
					.aFloat11217) - f_59_);
	    OpenGL.glVertex2i(i_55_ + i_53_, i_54_);
	    OpenGL.glEnd();
	    ((Class172_Sub4) this).aClass111_9617.method1425();
	}
    }
    
    void method2132(char c, int i, int i_62_, int i_63_, boolean bool,
		    Class148 class148, int i_64_, int i_65_) {
	Class148_Sub3 class148_sub3 = (Class148_Sub3) class148;
	Class120_Sub4_Sub1 class120_sub4_sub1
	    = ((Class148_Sub3) class148_sub3).aClass120_Sub4_Sub1_8920;
	((Class172_Sub4) this).aClass173_Sub2_9620.method8771();
	((Class172_Sub4) this).aClass173_Sub2_9620
	    .method8775(((Class172_Sub4) this).aClass120_Sub4_Sub1_9618);
	if (((Class172_Sub4) this).aBool9619 || bool) {
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8754(7681, 8448);
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 34168,
								  768);
	} else
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8754(7681, 7681);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8774(1);
	((Class172_Sub4) this).aClass173_Sub2_9620
	    .method8775(class120_sub4_sub1);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8754(7681, 8448);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 34168, 768);
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glTexGeni(8193, 9472, 9216);
	float f
	    = (((Class120_Sub4_Sub1) class120_sub4_sub1).aFloat11218
	       / (float) ((Class120_Sub4_Sub1) class120_sub4_sub1).anInt11216);
	float f_66_
	    = (((Class120_Sub4_Sub1) class120_sub4_sub1).aFloat11217
	       / (float) ((Class120_Sub4_Sub1) class120_sub4_sub1).anInt11215);
	OpenGL.glTexGenfv(8192, 9474,
			  new float[] { f, 0.0F, 0.0F, (float) -i_64_ * f },
			  0);
	OpenGL.glTexGenfv(8193, 9474,
			  new float[] { 0.0F, f_66_, 0.0F,
					(float) -i_65_ * f_66_ },
			  0);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	OpenGL.glColor4ub((byte) (i_63_ >> 16), (byte) (i_63_ >> 8),
			  (byte) i_63_, (byte) (i_63_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_62_, 0.0F);
	((Class172_Sub4) this).aClass111_9617.method1428(c);
	OpenGL.glLoadIdentity();
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 5890, 768);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8754(8448, 8448);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8775(null);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8774(0);
	if (((Class172_Sub4) this).aBool9619 || bool)
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 5890,
								  768);
    }
    
    void method2134(char c, int i, int i_67_, int i_68_, boolean bool) {
	((Class172_Sub4) this).aClass173_Sub2_9620.method8771();
	((Class172_Sub4) this).aClass173_Sub2_9620
	    .method8775(((Class172_Sub4) this).aClass120_Sub4_Sub1_9618);
	if (((Class172_Sub4) this).aBool9619 || bool) {
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8754(7681, 8448);
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 34168,
								  768);
	} else
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8754(7681, 7681);
	OpenGL.glColor4ub((byte) (i_68_ >> 16), (byte) (i_68_ >> 8),
			  (byte) i_68_, (byte) (i_68_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_67_, 0.0F);
	((Class172_Sub4) this).aClass111_9617.method1428(c);
	OpenGL.glLoadIdentity();
	if (((Class172_Sub4) this).aBool9619 || bool)
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 5890,
								  768);
    }
    
    void method2135(char c, int i, int i_69_, int i_70_, boolean bool) {
	((Class172_Sub4) this).aClass173_Sub2_9620.method8771();
	((Class172_Sub4) this).aClass173_Sub2_9620
	    .method8775(((Class172_Sub4) this).aClass120_Sub4_Sub1_9618);
	if (((Class172_Sub4) this).aBool9619 || bool) {
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8754(7681, 8448);
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 34168,
								  768);
	} else
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8754(7681, 7681);
	OpenGL.glColor4ub((byte) (i_70_ >> 16), (byte) (i_70_ >> 8),
			  (byte) i_70_, (byte) (i_70_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_69_, 0.0F);
	((Class172_Sub4) this).aClass111_9617.method1428(c);
	OpenGL.glLoadIdentity();
	if (((Class172_Sub4) this).aBool9619 || bool)
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 5890,
								  768);
    }
    
    void method2139(char c, int i, int i_71_, int i_72_, boolean bool,
		    Class148 class148, int i_73_, int i_74_) {
	Class148_Sub3 class148_sub3 = (Class148_Sub3) class148;
	Class120_Sub4_Sub1 class120_sub4_sub1
	    = ((Class148_Sub3) class148_sub3).aClass120_Sub4_Sub1_8920;
	((Class172_Sub4) this).aClass173_Sub2_9620.method8771();
	((Class172_Sub4) this).aClass173_Sub2_9620
	    .method8775(((Class172_Sub4) this).aClass120_Sub4_Sub1_9618);
	if (((Class172_Sub4) this).aBool9619 || bool) {
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8754(7681, 8448);
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 34168,
								  768);
	} else
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8754(7681, 7681);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8774(1);
	((Class172_Sub4) this).aClass173_Sub2_9620
	    .method8775(class120_sub4_sub1);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8754(7681, 8448);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 34168, 768);
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glTexGeni(8193, 9472, 9216);
	float f
	    = (((Class120_Sub4_Sub1) class120_sub4_sub1).aFloat11218
	       / (float) ((Class120_Sub4_Sub1) class120_sub4_sub1).anInt11216);
	float f_75_
	    = (((Class120_Sub4_Sub1) class120_sub4_sub1).aFloat11217
	       / (float) ((Class120_Sub4_Sub1) class120_sub4_sub1).anInt11215);
	OpenGL.glTexGenfv(8192, 9474,
			  new float[] { f, 0.0F, 0.0F, (float) -i_73_ * f },
			  0);
	OpenGL.glTexGenfv(8193, 9474,
			  new float[] { 0.0F, f_75_, 0.0F,
					(float) -i_74_ * f_75_ },
			  0);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	OpenGL.glColor4ub((byte) (i_72_ >> 16), (byte) (i_72_ >> 8),
			  (byte) i_72_, (byte) (i_72_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_71_, 0.0F);
	((Class172_Sub4) this).aClass111_9617.method1428(c);
	OpenGL.glLoadIdentity();
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 5890, 768);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8754(8448, 8448);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8775(null);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8774(0);
	if (((Class172_Sub4) this).aBool9619 || bool)
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 5890,
								  768);
    }
    
    void method2137(char c, int i, int i_76_, int i_77_, boolean bool,
		    Class148 class148, int i_78_, int i_79_) {
	Class148_Sub3 class148_sub3 = (Class148_Sub3) class148;
	Class120_Sub4_Sub1 class120_sub4_sub1
	    = ((Class148_Sub3) class148_sub3).aClass120_Sub4_Sub1_8920;
	((Class172_Sub4) this).aClass173_Sub2_9620.method8771();
	((Class172_Sub4) this).aClass173_Sub2_9620
	    .method8775(((Class172_Sub4) this).aClass120_Sub4_Sub1_9618);
	if (((Class172_Sub4) this).aBool9619 || bool) {
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8754(7681, 8448);
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 34168,
								  768);
	} else
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8754(7681, 7681);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8774(1);
	((Class172_Sub4) this).aClass173_Sub2_9620
	    .method8775(class120_sub4_sub1);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8754(7681, 8448);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 34168, 768);
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glTexGeni(8193, 9472, 9216);
	float f
	    = (((Class120_Sub4_Sub1) class120_sub4_sub1).aFloat11218
	       / (float) ((Class120_Sub4_Sub1) class120_sub4_sub1).anInt11216);
	float f_80_
	    = (((Class120_Sub4_Sub1) class120_sub4_sub1).aFloat11217
	       / (float) ((Class120_Sub4_Sub1) class120_sub4_sub1).anInt11215);
	OpenGL.glTexGenfv(8192, 9474,
			  new float[] { f, 0.0F, 0.0F, (float) -i_78_ * f },
			  0);
	OpenGL.glTexGenfv(8193, 9474,
			  new float[] { 0.0F, f_80_, 0.0F,
					(float) -i_79_ * f_80_ },
			  0);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	OpenGL.glColor4ub((byte) (i_77_ >> 16), (byte) (i_77_ >> 8),
			  (byte) i_77_, (byte) (i_77_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_76_, 0.0F);
	((Class172_Sub4) this).aClass111_9617.method1428(c);
	OpenGL.glLoadIdentity();
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 5890, 768);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8754(8448, 8448);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8775(null);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8774(0);
	if (((Class172_Sub4) this).aBool9619 || bool)
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 5890,
								  768);
    }
    
    void method2138(char c, int i, int i_81_, int i_82_, boolean bool,
		    Class148 class148, int i_83_, int i_84_) {
	Class148_Sub3 class148_sub3 = (Class148_Sub3) class148;
	Class120_Sub4_Sub1 class120_sub4_sub1
	    = ((Class148_Sub3) class148_sub3).aClass120_Sub4_Sub1_8920;
	((Class172_Sub4) this).aClass173_Sub2_9620.method8771();
	((Class172_Sub4) this).aClass173_Sub2_9620
	    .method8775(((Class172_Sub4) this).aClass120_Sub4_Sub1_9618);
	if (((Class172_Sub4) this).aBool9619 || bool) {
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8754(7681, 8448);
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 34168,
								  768);
	} else
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8754(7681, 7681);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8774(1);
	((Class172_Sub4) this).aClass173_Sub2_9620
	    .method8775(class120_sub4_sub1);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8754(7681, 8448);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 34168, 768);
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glTexGeni(8193, 9472, 9216);
	float f
	    = (((Class120_Sub4_Sub1) class120_sub4_sub1).aFloat11218
	       / (float) ((Class120_Sub4_Sub1) class120_sub4_sub1).anInt11216);
	float f_85_
	    = (((Class120_Sub4_Sub1) class120_sub4_sub1).aFloat11217
	       / (float) ((Class120_Sub4_Sub1) class120_sub4_sub1).anInt11215);
	OpenGL.glTexGenfv(8192, 9474,
			  new float[] { f, 0.0F, 0.0F, (float) -i_83_ * f },
			  0);
	OpenGL.glTexGenfv(8193, 9474,
			  new float[] { 0.0F, f_85_, 0.0F,
					(float) -i_84_ * f_85_ },
			  0);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	OpenGL.glColor4ub((byte) (i_82_ >> 16), (byte) (i_82_ >> 8),
			  (byte) i_82_, (byte) (i_82_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_81_, 0.0F);
	((Class172_Sub4) this).aClass111_9617.method1428(c);
	OpenGL.glLoadIdentity();
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 5890, 768);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8754(8448, 8448);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8775(null);
	((Class172_Sub4) this).aClass173_Sub2_9620.method8774(0);
	if (((Class172_Sub4) this).aBool9619 || bool)
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 5890,
								  768);
    }
    
    void method2129(char c, int i, int i_86_, int i_87_, boolean bool) {
	((Class172_Sub4) this).aClass173_Sub2_9620.method8771();
	((Class172_Sub4) this).aClass173_Sub2_9620
	    .method8775(((Class172_Sub4) this).aClass120_Sub4_Sub1_9618);
	if (((Class172_Sub4) this).aBool9619 || bool) {
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8754(7681, 8448);
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 34168,
								  768);
	} else
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8754(7681, 7681);
	OpenGL.glColor4ub((byte) (i_87_ >> 16), (byte) (i_87_ >> 8),
			  (byte) i_87_, (byte) (i_87_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_86_, 0.0F);
	((Class172_Sub4) this).aClass111_9617.method1428(c);
	OpenGL.glLoadIdentity();
	if (((Class172_Sub4) this).aBool9619 || bool)
	    ((Class172_Sub4) this).aClass173_Sub2_9620.method8778(0, 5890,
								  768);
    }
}
