/* Class332 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class332
{
    Interface36 anInterface36_3533;
    static float aFloat3534;
    int anInt3535;
    Interface41 anInterface41_3536;
    int anInt3537 = 64;
    int anInt3538 = 768;
    int anInt3539 = 1600;
    Class344 aClass344_3540;
    int anInt3541 = 64;
    int[] anIntArray3542;
    int[] anIntArray3543;
    int[] anIntArray3544;
    Class511_Sub2_Sub1[][] aClass511_Sub2_Sub1ArrayArray3545;
    Class511_Sub2_Sub1[][] aClass511_Sub2_Sub1ArrayArray3546;
    int anInt3547;
    Interface36 anInterface36_3548;
    
    Class332(Class173_Sub1 class173_sub1) {
	((Class332) this).anInt3535 = Class296.method3974(1600, 219596669);
	((Class332) this).anInt3541 = 64;
	((Class332) this).anIntArray3542 = new int[8191];
	((Class332) this).anIntArray3543 = new int[1600];
	((Class332) this).anIntArray3544 = new int[64];
	((Class332) this).aClass511_Sub2_Sub1ArrayArray3545
	    = new Class511_Sub2_Sub1[1600][64];
	((Class332) this).aClass511_Sub2_Sub1ArrayArray3546
	    = new Class511_Sub2_Sub1[64][768];
	((Class332) this).anInt3547 = 0;
	((Class332) this).aClass344_3540
	    = (class173_sub1.method8543
	       (new Class345[]
		{ new Class345(new Class331[] { Class331.aClass331_3521,
						Class331.aClass331_3531,
						Class331.aClass331_3518 }),
		  new Class345(Class331.aClass331_3515) }));
	((Class332) this).anInterface36_3548 = class173_sub1.method8549(true);
	((Class332) this).anInterface36_3533 = class173_sub1.method8549(false);
	((Class332) this).anInterface36_3533.method258(393168, 12);
	((Class332) this).anInterface41_3536 = class173_sub1.method8476(false);
	((Class332) this).anInterface41_3536.method311(49146);
	ByteBuffer bytebuffer = class173_sub1.aByteBuffer9222;
	bytebuffer.clear();
	for (int i = 0; i < 8191; i++) {
	    int i_0_ = i * 4;
	    bytebuffer.putShort((short) i_0_);
	    bytebuffer.putShort((short) (i_0_ + 1));
	    bytebuffer.putShort((short) (i_0_ + 2));
	    bytebuffer.putShort((short) (i_0_ + 2));
	    bytebuffer.putShort((short) (i_0_ + 3));
	    bytebuffer.putShort((short) i_0_);
	}
	((Class332) this).anInterface41_3536
	    .method197(0, bytebuffer.position(), class173_sub1.aLong9223);
	bytebuffer.clear();
	for (int i = 0; i < 8191; i++) {
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(-1.0F);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(-1.0F);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(-1.0F);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(-1.0F);
	    bytebuffer.putFloat(0.0F);
	}
	((Class332) this).anInterface36_3533
	    .method197(0, bytebuffer.position(), class173_sub1.aLong9223);
    }
    
    void method4331(Class173_Sub1 class173_sub1) {
	((Class332) this).anInterface36_3548.method258(786336, 24);
    }
    
    void method4332() {
	((Class332) this).anInterface36_3548.method115();
    }
    
    void method4333(Class173_Sub1 class173_sub1, Class171 class171) {
	class173_sub1.method2283(false);
	aFloat3534 = class173_sub1.aFloat9298;
	float f = class173_sub1.aClass418_9381.aFloatArray4768[2];
	float f_1_ = class173_sub1.aClass418_9381.aFloatArray4768[6];
	float f_2_ = class173_sub1.aClass418_9381.aFloatArray4768[10];
	float f_3_ = class173_sub1.aClass418_9381.aFloatArray4768[14];
	int i = 0;
	int i_4_ = 2147483647;
	int i_5_ = 0;
	Class511_Sub2 class511_sub2
	    = class171.aClass685_1959.aClass511_Sub2_8608;
	for (Class511_Sub2 class511_sub2_6_
		 = class511_sub2.aClass511_Sub2_10263;
	     class511_sub2_6_ != class511_sub2;
	     class511_sub2_6_ = class511_sub2_6_.aClass511_Sub2_10263) {
	    Class511_Sub2_Sub1 class511_sub2_sub1
		= (Class511_Sub2_Sub1) class511_sub2_6_;
	    int i_7_
		= (int) (f * (float) (class511_sub2_sub1.anInt11511 >> 12)
			 + f_1_ * (float) (class511_sub2_sub1.anInt11512 >> 12)
			 + f_2_ * (float) (class511_sub2_sub1.anInt11509 >> 12)
			 + f_3_);
	    if (i_7_ > i_5_)
		i_5_ = i_7_;
	    if (i_7_ < i_4_)
		i_4_ = i_7_;
	    ((Class332) this).anIntArray3542[i++] = i_7_;
	}
	int i_8_ = i_5_ - i_4_;
	int i_9_;
	if (i_8_ + 2 > 1600) {
	    i_9_ = (1 + Class296.method3974(i_8_, 1509207181)
		    - ((Class332) this).anInt3535);
	    i_8_ = (i_8_ >> i_9_) + 2;
	} else {
	    i_9_ = 0;
	    i_8_ += 2;
	}
	class173_sub1.method8554(((Class332) this).anInterface41_3536);
	Class317 class317 = ((Class173_Sub1) class173_sub1).aClass317_9327;
	class317.method4180(Class418.aClass418_4769);
	class317.aClass418_3456.method5013();
	class317.anInt3454 = -1;
	boolean bool = class173_sub1.anInt9236 > 0;
	if (bool) {
	    class317.aClass425_3457.method5120(0.0F, 0.0F, 1.0F,
					       -class173_sub1.aFloat9347);
	    class317.aClass422_3455.method5057
		((float) (class173_sub1.anInt9344 >> 16 & 0xff) / 255.0F,
		 (float) (class173_sub1.anInt9344 >> 8 & 0xff) / 255.0F,
		 (float) (class173_sub1.anInt9344 >> 0 & 0xff) / 255.0F);
	    class317.aClass425_3457
		.method5126(((Class173_Sub1) class173_sub1).aClass418_9330);
	    class317.aClass425_3457.method5136(1.0F
					       / (class173_sub1.aFloat9348
						  - class173_sub1.aFloat9347));
	} else {
	    class317.aClass425_3457.method5120(0.0F, 0.0F, 0.0F, 0.0F);
	    class317.aClass422_3455.method5057(0.0F, 0.0F, 0.0F);
	}
	method4337(class173_sub1, class511_sub2, i_8_, i_4_, i_9_, class317,
		   bool);
	if (class173_sub1.aFloat9298 != aFloat3534)
	    class173_sub1.method2477(aFloat3534);
	class173_sub1.method2283(true);
    }
    
    void method4334(int i, Class511_Sub2_Sub1 class511_sub2_sub1) {
	if (i < 1600) {
	    if (((Class332) this).anIntArray3543[i] < 64)
		((Class332) this).aClass511_Sub2_Sub1ArrayArray3545[i]
		    [((Class332) this).anIntArray3543[i]++]
		    = class511_sub2_sub1;
	    else {
		if (((Class332) this).anIntArray3543[i] == 64) {
		    if (((Class332) this).anInt3547 == 64)
			return;
		    ((Class332) this).anIntArray3543[i]
			+= 1 + ((Class332) this).anInt3547++;
		}
		((Class332) this).aClass511_Sub2_Sub1ArrayArray3546
		    [((Class332) this).anIntArray3543[i] - 64 - 1]
		    [((Class332) this).anIntArray3544
			 [((Class332) this).anIntArray3543[i] - 64 - 1]++]
		    = class511_sub2_sub1;
	    }
	}
    }
    
    void method4335() {
	((Class332) this).anInterface36_3548.method115();
    }
    
    void method4336() {
	((Class332) this).anInterface36_3548.method115();
    }
    
    void method4337(Class173_Sub1 class173_sub1, Class511_Sub2 class511_sub2,
		    int i, int i_10_, int i_11_, Class317 class317,
		    boolean bool) {
	Class511_Sub2 class511_sub2_12_ = class511_sub2.aClass511_Sub2_10263;
	int i_13_ = 0;
	int i_14_ = -2;
	boolean bool_15_ = true;
	boolean bool_16_ = true;
	while (class511_sub2_12_ != class511_sub2) {
	    ((Class332) this).anInt3547 = 0;
	    for (int i_17_ = 0; i_17_ < i; i_17_++)
		((Class332) this).anIntArray3543[i_17_] = 0;
	    for (int i_18_ = 0; i_18_ < 64; i_18_++)
		((Class332) this).anIntArray3544[i_18_] = 0;
	    for (/**/; class511_sub2_12_ != class511_sub2;
		 class511_sub2_12_ = class511_sub2_12_.aClass511_Sub2_10263) {
		Class511_Sub2_Sub1 class511_sub2_sub1
		    = (Class511_Sub2_Sub1) class511_sub2_12_;
		if (bool_16_) {
		    i_14_ = class511_sub2_sub1.anInt11515;
		    bool_15_ = class511_sub2_sub1.aBool11510;
		    bool_16_ = false;
		}
		if (i_13_ > 0
		    && (i_14_ != class511_sub2_sub1.anInt11515
			|| bool_15_ != class511_sub2_sub1.aBool11510)) {
		    bool_16_ = true;
		    break;
		}
		method4334((((Class332) this).anIntArray3542[i_13_++] - i_10_
			    >> i_11_),
			   class511_sub2_sub1);
	    }
	    class317.anInterface34_3453 = null;
	    if (i_14_ >= 0) {
		Class160 class160
		    = class173_sub1.aClass165_1984.method2093(i_14_,
							      (byte) -56);
		if (class160.aBool1768)
		    class317.anInterface34_3453
			= ((Class173_Sub1) class173_sub1).aClass329_9315
			      .method4265(class160);
		byte i_19_ = 0;
		if (class160.aClass583_1771 == Class583.aClass583_7696)
		    i_19_ = class160.aByte1779;
		class173_sub1.method8544(i_19_);
	    }
	    if (bool_15_ && class173_sub1.aFloat9298 != aFloat3534)
		class173_sub1.method2477(aFloat3534);
	    else if (class173_sub1.aFloat9298 != 1.0F)
		class173_sub1.method2477(1.0F);
	    method4338(class173_sub1, i, bool);
	}
    }
    
    void method4338(Class173_Sub1 class173_sub1, int i, boolean bool) {
	int i_20_ = 0;
	Class418 class418 = class173_sub1.aClass418_9381;
	float f = class418.aFloatArray4768[0];
	float f_21_ = class418.aFloatArray4768[4];
	float f_22_ = class418.aFloatArray4768[8];
	float f_23_ = class418.aFloatArray4768[1];
	float f_24_ = class418.aFloatArray4768[5];
	float f_25_ = class418.aFloatArray4768[9];
	float f_26_ = f + f_23_;
	float f_27_ = f_21_ + f_24_;
	float f_28_ = f_22_ + f_25_;
	float f_29_ = f - f_23_;
	float f_30_ = f_21_ - f_24_;
	float f_31_ = f_22_ - f_25_;
	float f_32_ = f_23_ - f;
	float f_33_ = f_24_ - f_21_;
	float f_34_ = f_25_ - f_22_;
	float[] fs = new float[3];
	float[] fs_35_ = new float[3];
	class173_sub1.aClass418_9243
	    .method5027(((Class173_Sub1) class173_sub1).aClass418_9363);
	ByteBuffer bytebuffer = class173_sub1.aByteBuffer9222;
	bytebuffer.clear();
	for (int i_36_ = i - 1; i_36_ >= 0; i_36_--) {
	    int i_37_ = (((Class332) this).anIntArray3543[i_36_] > 64 ? 64
			 : ((Class332) this).anIntArray3543[i_36_]);
	    if (i_37_ > 0) {
		for (int i_38_ = i_37_ - 1; i_38_ >= 0; i_38_--) {
		    Class511_Sub2_Sub1 class511_sub2_sub1
			= (((Class332) this).aClass511_Sub2_Sub1ArrayArray3545
			   [i_36_][i_38_]);
		    int i_39_ = class511_sub2_sub1.anInt11513;
		    byte i_40_ = (byte) (i_39_ >> 16);
		    byte i_41_ = (byte) (i_39_ >> 8);
		    byte i_42_ = (byte) i_39_;
		    byte i_43_ = (byte) (i_39_ >>> 24);
		    if (((Class173_Sub1) class173_sub1).anInt9377 == 0) {
			byte i_44_ = i_40_;
			i_40_ = i_42_;
			i_42_ = i_44_;
		    }
		    float f_45_
			= (float) (class511_sub2_sub1.anInt11511 >> 12);
		    float f_46_
			= (float) (class511_sub2_sub1.anInt11512 >> 12);
		    float f_47_
			= (float) (class511_sub2_sub1.anInt11509 >> 12);
		    int i_48_ = class511_sub2_sub1.anInt11508 >> 12;
		    if (class511_sub2_sub1.aShort11516 != 0) {
			((Class173_Sub1) class173_sub1).aClass418_9244
			    .method5000
			    (class511_sub2_sub1.aShort11516, i_48_, i_48_,
			     0.0F, 0.0F, 0.0F);
			((Class173_Sub1) class173_sub1).aClass418_9244
			    .method4974(class173_sub1.aClass418_9243);
			((Class173_Sub1) class173_sub1).aClass418_9244
			    .method5030(1.0F, 0.0F, 0.0F, fs);
			((Class173_Sub1) class173_sub1).aClass418_9244
			    .method5030(0.0F, 1.0F, 0.0F, fs_35_);
			bytebuffer.putFloat(f_45_ - fs[0] - fs_35_[0]);
			bytebuffer.putFloat(f_46_ - fs[1] - fs_35_[1]);
			bytebuffer.putFloat(f_47_ - fs[2] - fs_35_[2]);
			bytebuffer.put(i_40_);
			bytebuffer.put(i_41_);
			bytebuffer.put(i_42_);
			bytebuffer.put(i_43_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_45_ - fs[0] + fs_35_[0]);
			bytebuffer.putFloat(f_46_ - fs[1] + fs_35_[1]);
			bytebuffer.putFloat(f_47_ - fs[2] + fs_35_[2]);
			bytebuffer.put(i_40_);
			bytebuffer.put(i_41_);
			bytebuffer.put(i_42_);
			bytebuffer.put(i_43_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_45_ + fs[0] + fs_35_[0]);
			bytebuffer.putFloat(f_46_ + fs[1] + fs_35_[1]);
			bytebuffer.putFloat(f_47_ + fs[2] + fs_35_[2]);
			bytebuffer.put(i_40_);
			bytebuffer.put(i_41_);
			bytebuffer.put(i_42_);
			bytebuffer.put(i_43_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_45_ + fs[0] - fs_35_[0]);
			bytebuffer.putFloat(f_46_ + fs[1] - fs_35_[1]);
			bytebuffer.putFloat(f_47_ + fs[2] - fs_35_[2]);
			bytebuffer.put(i_40_);
			bytebuffer.put(i_41_);
			bytebuffer.put(i_42_);
			bytebuffer.put(i_43_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(0.0F);
		    } else {
			bytebuffer.putFloat(f_45_ + f_26_ * (float) -i_48_);
			bytebuffer.putFloat(f_46_ + f_27_ * (float) -i_48_);
			bytebuffer.putFloat(f_47_ + f_28_ * (float) -i_48_);
			bytebuffer.put(i_40_);
			bytebuffer.put(i_41_);
			bytebuffer.put(i_42_);
			bytebuffer.put(i_43_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_45_ + f_32_ * (float) i_48_);
			bytebuffer.putFloat(f_46_ + f_33_ * (float) i_48_);
			bytebuffer.putFloat(f_47_ + f_34_ * (float) i_48_);
			bytebuffer.put(i_40_);
			bytebuffer.put(i_41_);
			bytebuffer.put(i_42_);
			bytebuffer.put(i_43_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_45_ + f_26_ * (float) i_48_);
			bytebuffer.putFloat(f_46_ + f_27_ * (float) i_48_);
			bytebuffer.putFloat(f_47_ + f_28_ * (float) i_48_);
			bytebuffer.put(i_40_);
			bytebuffer.put(i_41_);
			bytebuffer.put(i_42_);
			bytebuffer.put(i_43_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_45_ + f_29_ * (float) i_48_);
			bytebuffer.putFloat(f_46_ + f_30_ * (float) i_48_);
			bytebuffer.putFloat(f_47_ + f_31_ * (float) i_48_);
			bytebuffer.put(i_40_);
			bytebuffer.put(i_41_);
			bytebuffer.put(i_42_);
			bytebuffer.put(i_43_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(0.0F);
		    }
		    i_20_++;
		}
		if (((Class332) this).anIntArray3543[i_36_] > 64) {
		    int i_49_
			= ((Class332) this).anIntArray3543[i_36_] - 64 - 1;
		    for (int i_50_
			     = ((Class332) this).anIntArray3544[i_49_] - 1;
			 i_50_ >= 0; i_50_--) {
			Class511_Sub2_Sub1 class511_sub2_sub1
			    = (((Class332) this)
			       .aClass511_Sub2_Sub1ArrayArray3546[i_49_]
			       [i_50_]);
			int i_51_ = class511_sub2_sub1.anInt11513;
			byte i_52_ = (byte) (i_51_ >> 16);
			byte i_53_ = (byte) (i_51_ >> 8);
			byte i_54_ = (byte) i_51_;
			byte i_55_ = (byte) (i_51_ >>> 24);
			float f_56_
			    = (float) (class511_sub2_sub1.anInt11511 >> 12);
			float f_57_
			    = (float) (class511_sub2_sub1.anInt11512 >> 12);
			float f_58_
			    = (float) (class511_sub2_sub1.anInt11509 >> 12);
			int i_59_ = class511_sub2_sub1.anInt11508 >> 12;
			if (((Class173_Sub1) class173_sub1).anInt9377 == 0) {
			    byte i_60_ = i_52_;
			    i_52_ = i_54_;
			    i_54_ = i_60_;
			}
			if (class511_sub2_sub1.aShort11516 != 0) {
			    ((Class173_Sub1) class173_sub1).aClass418_9244
				.method5000
				(class511_sub2_sub1.aShort11516, i_59_, i_59_,
				 0.0F, 0.0F, 0.0F);
			    ((Class173_Sub1) class173_sub1).aClass418_9244
				.method4974(class173_sub1.aClass418_9243);
			    ((Class173_Sub1) class173_sub1).aClass418_9244
				.method5030(1.0F, 0.0F, 0.0F, fs);
			    ((Class173_Sub1) class173_sub1).aClass418_9244
				.method5030(0.0F, 1.0F, 0.0F, fs_35_);
			    bytebuffer.putFloat(f_56_ - fs[0] - fs_35_[0]);
			    bytebuffer.putFloat(f_57_ - fs[1] - fs_35_[1]);
			    bytebuffer.putFloat(f_58_ - fs[2] - fs_35_[2]);
			    bytebuffer.put(i_52_);
			    bytebuffer.put(i_53_);
			    bytebuffer.put(i_54_);
			    bytebuffer.put(i_55_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(f_56_ - fs[0] + fs_35_[0]);
			    bytebuffer.putFloat(f_57_ - fs[1] + fs_35_[1]);
			    bytebuffer.putFloat(f_58_ - fs[2] + fs_35_[2]);
			    bytebuffer.put(i_52_);
			    bytebuffer.put(i_53_);
			    bytebuffer.put(i_54_);
			    bytebuffer.put(i_55_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_56_ + fs[0] + fs_35_[0]);
			    bytebuffer.putFloat(f_57_ + fs[1] + fs_35_[1]);
			    bytebuffer.putFloat(f_58_ + fs[2] + fs_35_[2]);
			    bytebuffer.put(i_52_);
			    bytebuffer.put(i_53_);
			    bytebuffer.put(i_54_);
			    bytebuffer.put(i_55_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_56_ + fs[0] - fs_35_[0]);
			    bytebuffer.putFloat(f_57_ + fs[1] - fs_35_[1]);
			    bytebuffer.putFloat(f_58_ + fs[2] - fs_35_[2]);
			    bytebuffer.put(i_52_);
			    bytebuffer.put(i_53_);
			    bytebuffer.put(i_54_);
			    bytebuffer.put(i_55_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(0.0F);
			} else {
			    bytebuffer
				.putFloat(f_56_ + f_26_ * (float) -i_59_);
			    bytebuffer
				.putFloat(f_57_ + f_27_ * (float) -i_59_);
			    bytebuffer
				.putFloat(f_58_ + f_28_ * (float) -i_59_);
			    bytebuffer.put(i_52_);
			    bytebuffer.put(i_53_);
			    bytebuffer.put(i_54_);
			    bytebuffer.put(i_55_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(f_56_ + f_32_ * (float) i_59_);
			    bytebuffer.putFloat(f_57_ + f_33_ * (float) i_59_);
			    bytebuffer.putFloat(f_58_ + f_34_ * (float) i_59_);
			    bytebuffer.put(i_52_);
			    bytebuffer.put(i_53_);
			    bytebuffer.put(i_54_);
			    bytebuffer.put(i_55_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_56_ + f_26_ * (float) i_59_);
			    bytebuffer.putFloat(f_57_ + f_27_ * (float) i_59_);
			    bytebuffer.putFloat(f_58_ + f_28_ * (float) i_59_);
			    bytebuffer.put(i_52_);
			    bytebuffer.put(i_53_);
			    bytebuffer.put(i_54_);
			    bytebuffer.put(i_55_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_56_ + f_29_ * (float) i_59_);
			    bytebuffer.putFloat(f_57_ + f_30_ * (float) i_59_);
			    bytebuffer.putFloat(f_58_ + f_31_ * (float) i_59_);
			    bytebuffer.put(i_52_);
			    bytebuffer.put(i_53_);
			    bytebuffer.put(i_54_);
			    bytebuffer.put(i_55_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(0.0F);
			}
			i_20_++;
		    }
		}
	    }
	}
	((Class332) this).anInterface36_3548
	    .method197(0, bytebuffer.position(), class173_sub1.aLong9223);
	class173_sub1.method8553(0, ((Class332) this).anInterface36_3548);
	class173_sub1.method8553(1, ((Class332) this).anInterface36_3533);
	class173_sub1.method8552(((Class332) this).aClass344_3540);
	Class317 class317 = ((Class173_Sub1) class173_sub1).aClass317_9327;
	class317.method4186(i_20_, bool);
    }
}
