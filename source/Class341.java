/* Class341 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class341
{
    static final int anInt3586 = 128;
    static final int anInt3587 = 128;
    public static final int anInt3588 = 16;
    Class173_Sub1 aClass173_Sub1_3589;
    public boolean aBool3590;
    Interface34[] anInterface34Array3591 = null;
    Interface32 anInterface32_3592 = null;
    public Interface34[] anInterface34Array3593 = null;
    public Interface32 anInterface32_3594 = null;
    static Object anObject3595;
    public Interface32 anInterface32_3596 = null;
    static Object anObject3597;
    static Object anObject3598;
    
    Class341(Class173_Sub1 class173_sub1) {
	((Class341) this).aClass173_Sub1_3589 = class173_sub1;
	aBool3590 = ((Class341) this).aClass173_Sub1_3589.aBool9368;
	if (aBool3590 && !((Class341) this).aClass173_Sub1_3589.aBool9359)
	    aBool3590 = false;
	if (aBool3590 && !(((Class341) this).aClass173_Sub1_3589.method8577
			   (Class149.aClass149_1679, Class169.aClass169_1935)))
	    aBool3590 = false;
	if (aBool3590
	    || (((Class341) this).aClass173_Sub1_3589.method8514
		(Class149.aClass149_1679, Class169.aClass169_1935))) {
	    method4494();
	    if (!aBool3590) {
		((Class341) this).anInterface34Array3591 = new Interface34[16];
		for (int i = 0; i < 16; i++) {
		    byte[] is = Class255.method3451(anObject3598, i * 32768,
						    32768, (byte) 47);
		    ((Class341) this).anInterface34Array3591[i]
			= (((Class341) this).aClass173_Sub1_3589.method8517
			   (Class149.aClass149_1679, 128, 128, true, is));
		}
		anInterface34Array3593 = new Interface34[16];
		for (int i = 0; i < 16; i++) {
		    byte[] is = Class255.method3451(anObject3597, i * 32768,
						    32768, (byte) 48);
		    anInterface34Array3593[i]
			= (((Class341) this).aClass173_Sub1_3589.method8517
			   (Class149.aClass149_1679, 128, 128, true, is));
		}
	    } else {
		byte[] is
		    = Class653.method7795(anObject3598, false, (byte) -22);
		((Class341) this).anInterface32_3592
		    = (((Class341) this).aClass173_Sub1_3589.method8469
		       (Class149.aClass149_1679, 128, 128, 16, true, is));
		is = Class653.method7795(anObject3597, false, (byte) -4);
		anInterface32_3594
		    = (((Class341) this).aClass173_Sub1_3589.method8469
		       (Class149.aClass149_1679, 128, 128, 16, true, is));
	    }
	}
    }
    
    static void method4485() {
	if (anObject3598 == null) {
	    Class412_Sub2_Sub2 class412_sub2_sub2 = new Class412_Sub2_Sub2();
	    byte[] is = class412_sub2_sub2.method10426(128, 128, 16);
	    anObject3598 = Class36.method788(is, false, (byte) 64);
	}
	if (anObject3597 == null) {
	    Class412_Sub1_Sub1 class412_sub1_sub1 = new Class412_Sub1_Sub1();
	    byte[] is = class412_sub1_sub1.method10430(128, 128, 16);
	    anObject3597 = Class36.method788(is, false, (byte) 57);
	}
    }
    
    public boolean method4486() {
	return (aBool3590 ? ((Class341) this).anInterface32_3592 != null
		: ((Class341) this).anInterface34Array3591 != null);
    }
    
    public boolean method4487() {
	if (!((Class341) this).aClass173_Sub1_3589.aBool9368)
	    return false;
	if (anInterface32_3596 == null) {
	    if (anObject3595 == null) {
		byte[] is = Class515.method6279(128, 128, 16, 8,
						new Class512_Sub1(419684),
						4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
		anObject3595 = Class36.method788(is, false, (byte) -33);
	    }
	    byte[] is = Class653.method7795(anObject3595, false, (byte) -42);
	    byte[] is_0_ = new byte[is.length * 4];
	    int i = 0;
	    for (int i_1_ = 0; i_1_ < 16; i_1_++) {
		int i_2_ = i_1_ * 16384;
		int i_3_ = i_2_;
		for (int i_4_ = 0; i_4_ < 128; i_4_++) {
		    int i_5_ = i_3_ + i_4_ * 128;
		    int i_6_ = i_3_ + (i_4_ - 1 & 0x7f) * 128;
		    int i_7_ = i_3_ + (i_4_ + 1 & 0x7f) * 128;
		    for (int i_8_ = 0; i_8_ < 128; i_8_++) {
			float f = (float) ((is[i_6_ + i_8_] & 0xff)
					   - (is[i_7_ + i_8_] & 0xff));
			float f_9_
			    = (float) ((is[i_5_ + (i_8_ - 1 & 0x7f)] & 0xff)
				       - (is[i_5_ + (i_8_ + 1 & 0x7f)]
					  & 0xff));
			float f_10_
			    = (float) (128.0 / Math.sqrt((double) (f_9_ * f_9_
								   + 16384.0F
								   + f * f)));
			is_0_[i++] = (byte) (int) (f_9_ * f_10_ + 127.0F);
			is_0_[i++] = (byte) (int) (128.0F * f_10_ + 127.0F);
			is_0_[i++] = (byte) (int) (f * f_10_ + 127.0F);
			is_0_[i++] = is[i_2_++];
		    }
		}
	    }
	    anInterface32_3596
		= (((Class341) this).aClass173_Sub1_3589.method8469
		   (Class149.aClass149_1676, 128, 128, 16, true, is_0_));
	}
	return anInterface32_3596 != null;
    }
    
    static void method4488() {
	if (anObject3598 == null) {
	    Class412_Sub2_Sub2 class412_sub2_sub2 = new Class412_Sub2_Sub2();
	    byte[] is = class412_sub2_sub2.method10426(128, 128, 16);
	    anObject3598 = Class36.method788(is, false, (byte) -26);
	}
	if (anObject3597 == null) {
	    Class412_Sub1_Sub1 class412_sub1_sub1 = new Class412_Sub1_Sub1();
	    byte[] is = class412_sub1_sub1.method10430(128, 128, 16);
	    anObject3597 = Class36.method788(is, false, (byte) 65);
	}
    }
    
    public boolean method4489() {
	if (!((Class341) this).aClass173_Sub1_3589.aBool9368)
	    return false;
	if (anInterface32_3596 == null) {
	    if (anObject3595 == null) {
		byte[] is = Class515.method6279(128, 128, 16, 8,
						new Class512_Sub1(419684),
						4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
		anObject3595 = Class36.method788(is, false, (byte) -2);
	    }
	    byte[] is = Class653.method7795(anObject3595, false, (byte) -36);
	    byte[] is_11_ = new byte[is.length * 4];
	    int i = 0;
	    for (int i_12_ = 0; i_12_ < 16; i_12_++) {
		int i_13_ = i_12_ * 16384;
		int i_14_ = i_13_;
		for (int i_15_ = 0; i_15_ < 128; i_15_++) {
		    int i_16_ = i_14_ + i_15_ * 128;
		    int i_17_ = i_14_ + (i_15_ - 1 & 0x7f) * 128;
		    int i_18_ = i_14_ + (i_15_ + 1 & 0x7f) * 128;
		    for (int i_19_ = 0; i_19_ < 128; i_19_++) {
			float f = (float) ((is[i_17_ + i_19_] & 0xff)
					   - (is[i_18_ + i_19_] & 0xff));
			float f_20_
			    = (float) ((is[i_16_ + (i_19_ - 1 & 0x7f)] & 0xff)
				       - (is[i_16_ + (i_19_ + 1 & 0x7f)]
					  & 0xff));
			float f_21_
			    = (float) (128.0
				       / Math.sqrt((double) (f_20_ * f_20_
							     + 16384.0F
							     + f * f)));
			is_11_[i++] = (byte) (int) (f_20_ * f_21_ + 127.0F);
			is_11_[i++] = (byte) (int) (128.0F * f_21_ + 127.0F);
			is_11_[i++] = (byte) (int) (f * f_21_ + 127.0F);
			is_11_[i++] = is[i_13_++];
		    }
		}
	    }
	    anInterface32_3596
		= (((Class341) this).aClass173_Sub1_3589.method8469
		   (Class149.aClass149_1676, 128, 128, 16, true, is_11_));
	}
	return anInterface32_3596 != null;
    }
    
    static void method4490() {
	if (anObject3598 == null) {
	    Class412_Sub2_Sub2 class412_sub2_sub2 = new Class412_Sub2_Sub2();
	    byte[] is = class412_sub2_sub2.method10426(128, 128, 16);
	    anObject3598 = Class36.method788(is, false, (byte) 82);
	}
	if (anObject3597 == null) {
	    Class412_Sub1_Sub1 class412_sub1_sub1 = new Class412_Sub1_Sub1();
	    byte[] is = class412_sub1_sub1.method10430(128, 128, 16);
	    anObject3597 = Class36.method788(is, false, (byte) 46);
	}
    }
    
    public boolean method4491() {
	return (aBool3590 ? ((Class341) this).anInterface32_3592 != null
		: ((Class341) this).anInterface34Array3591 != null);
    }
    
    public boolean method4492() {
	return (aBool3590 ? ((Class341) this).anInterface32_3592 != null
		: ((Class341) this).anInterface34Array3591 != null);
    }
    
    public boolean method4493() {
	if (!((Class341) this).aClass173_Sub1_3589.aBool9368)
	    return false;
	if (anInterface32_3596 == null) {
	    if (anObject3595 == null) {
		byte[] is = Class515.method6279(128, 128, 16, 8,
						new Class512_Sub1(419684),
						4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
		anObject3595 = Class36.method788(is, false, (byte) -3);
	    }
	    byte[] is = Class653.method7795(anObject3595, false, (byte) -104);
	    byte[] is_22_ = new byte[is.length * 4];
	    int i = 0;
	    for (int i_23_ = 0; i_23_ < 16; i_23_++) {
		int i_24_ = i_23_ * 16384;
		int i_25_ = i_24_;
		for (int i_26_ = 0; i_26_ < 128; i_26_++) {
		    int i_27_ = i_25_ + i_26_ * 128;
		    int i_28_ = i_25_ + (i_26_ - 1 & 0x7f) * 128;
		    int i_29_ = i_25_ + (i_26_ + 1 & 0x7f) * 128;
		    for (int i_30_ = 0; i_30_ < 128; i_30_++) {
			float f = (float) ((is[i_28_ + i_30_] & 0xff)
					   - (is[i_29_ + i_30_] & 0xff));
			float f_31_
			    = (float) ((is[i_27_ + (i_30_ - 1 & 0x7f)] & 0xff)
				       - (is[i_27_ + (i_30_ + 1 & 0x7f)]
					  & 0xff));
			float f_32_
			    = (float) (128.0
				       / Math.sqrt((double) (f_31_ * f_31_
							     + 16384.0F
							     + f * f)));
			is_22_[i++] = (byte) (int) (f_31_ * f_32_ + 127.0F);
			is_22_[i++] = (byte) (int) (128.0F * f_32_ + 127.0F);
			is_22_[i++] = (byte) (int) (f * f_32_ + 127.0F);
			is_22_[i++] = is[i_24_++];
		    }
		}
	    }
	    anInterface32_3596
		= (((Class341) this).aClass173_Sub1_3589.method8469
		   (Class149.aClass149_1676, 128, 128, 16, true, is_22_));
	}
	return anInterface32_3596 != null;
    }
    
    static void method4494() {
	if (anObject3598 == null) {
	    Class412_Sub2_Sub2 class412_sub2_sub2 = new Class412_Sub2_Sub2();
	    byte[] is = class412_sub2_sub2.method10426(128, 128, 16);
	    anObject3598 = Class36.method788(is, false, (byte) -27);
	}
	if (anObject3597 == null) {
	    Class412_Sub1_Sub1 class412_sub1_sub1 = new Class412_Sub1_Sub1();
	    byte[] is = class412_sub1_sub1.method10430(128, 128, 16);
	    anObject3597 = Class36.method788(is, false, (byte) 44);
	}
    }
    
    public boolean method4495() {
	if (!((Class341) this).aClass173_Sub1_3589.aBool9368)
	    return false;
	if (anInterface32_3596 == null) {
	    if (anObject3595 == null) {
		byte[] is = Class515.method6279(128, 128, 16, 8,
						new Class512_Sub1(419684),
						4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
		anObject3595 = Class36.method788(is, false, (byte) 59);
	    }
	    byte[] is = Class653.method7795(anObject3595, false, (byte) -66);
	    byte[] is_33_ = new byte[is.length * 4];
	    int i = 0;
	    for (int i_34_ = 0; i_34_ < 16; i_34_++) {
		int i_35_ = i_34_ * 16384;
		int i_36_ = i_35_;
		for (int i_37_ = 0; i_37_ < 128; i_37_++) {
		    int i_38_ = i_36_ + i_37_ * 128;
		    int i_39_ = i_36_ + (i_37_ - 1 & 0x7f) * 128;
		    int i_40_ = i_36_ + (i_37_ + 1 & 0x7f) * 128;
		    for (int i_41_ = 0; i_41_ < 128; i_41_++) {
			float f = (float) ((is[i_39_ + i_41_] & 0xff)
					   - (is[i_40_ + i_41_] & 0xff));
			float f_42_
			    = (float) ((is[i_38_ + (i_41_ - 1 & 0x7f)] & 0xff)
				       - (is[i_38_ + (i_41_ + 1 & 0x7f)]
					  & 0xff));
			float f_43_
			    = (float) (128.0
				       / Math.sqrt((double) (f_42_ * f_42_
							     + 16384.0F
							     + f * f)));
			is_33_[i++] = (byte) (int) (f_42_ * f_43_ + 127.0F);
			is_33_[i++] = (byte) (int) (128.0F * f_43_ + 127.0F);
			is_33_[i++] = (byte) (int) (f * f_43_ + 127.0F);
			is_33_[i++] = is[i_35_++];
		    }
		}
	    }
	    anInterface32_3596
		= (((Class341) this).aClass173_Sub1_3589.method8469
		   (Class149.aClass149_1676, 128, 128, 16, true, is_33_));
	}
	return anInterface32_3596 != null;
    }
}
