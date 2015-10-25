/* Class371 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class371
{
    int anInt3871;
    Class336 aClass336_3872 = Class336.aClass336_3576;
    Class173_Sub1 aClass173_Sub1_3873;
    int anInt3874 = 128;
    Interface34[] anInterface34Array3875;
    float[] aFloatArray3876;
    Class336 aClass336_3877;
    int[] anIntArray3878;
    int anInt3879;
    Interface36 anInterface36_3880;
    Class344 aClass344_3881;
    Interface41 anInterface41_3882;
    int[] anIntArray3883;
    
    void method4653(float f, float f_0_, float f_1_, float f_2_, float f_3_,
		    float f_4_, float f_5_, float f_6_,
		    Interface34 interface34, int i) {
	if ((i & ~0xffffff) != 0) {
	    ((Class371) this).aClass173_Sub1_3873
		.method2207(((Class371) this).anIntArray3883);
	    int i_7_ = ((Class371) this).anIntArray3883[0];
	    int i_8_ = ((Class371) this).anIntArray3883[1];
	    int i_9_ = ((Class371) this).anIntArray3883[2];
	    int i_10_ = ((Class371) this).anIntArray3883[3];
	    if (!(f > (float) i_9_) && !(f_0_ > (float) i_10_)
		&& !(f_1_ < (float) i_7_) && !(f_2_ < (float) i_8_)) {
		float f_11_ = f_1_ - f;
		float f_12_ = f_2_ - f_0_;
		float f_13_ = f_5_ - f_3_;
		float f_14_ = f_6_ - f_4_;
		if (f < (float) i_7_) {
		    f_3_ += ((float) i_7_ - f) / f_11_ * f_13_;
		    f = (float) i_7_;
		}
		if (f_0_ < (float) i_8_) {
		    f_4_ += ((float) i_8_ - f_0_) / f_12_ * f_14_;
		    f_0_ = (float) i_8_;
		}
		if (f_1_ > (float) i_9_) {
		    f_5_ -= (f_1_ - (float) i_9_) / f_11_ * f_13_;
		    f_1_ = (float) i_9_;
		}
		if (f_2_ > (float) i_10_) {
		    f_6_ -= (f_2_ - (float) i_10_) / f_12_ * f_14_;
		    f_2_ = (float) i_10_;
		}
		method4670();
		f = method4659(f);
		f_0_ = method4660(f_0_);
		f_1_ = method4659(f_1_);
		f_2_ = method4660(f_2_);
		((Class371) this).aFloatArray3876
		    [((Class371) this).anInt3871 * 16 + 0]
		    = f;
		((Class371) this).aFloatArray3876
		    [((Class371) this).anInt3871 * 16 + 1]
		    = f_0_;
		((Class371) this).aFloatArray3876
		    [((Class371) this).anInt3871 * 16 + 2]
		    = f_3_;
		((Class371) this).aFloatArray3876
		    [((Class371) this).anInt3871 * 16 + 3]
		    = f_4_;
		((Class371) this).aFloatArray3876
		    [((Class371) this).anInt3871 * 16 + 4]
		    = f_1_;
		((Class371) this).aFloatArray3876
		    [((Class371) this).anInt3871 * 16 + 5]
		    = f_0_;
		((Class371) this).aFloatArray3876
		    [((Class371) this).anInt3871 * 16 + 6]
		    = f_5_;
		((Class371) this).aFloatArray3876
		    [((Class371) this).anInt3871 * 16 + 7]
		    = f_4_;
		((Class371) this).aFloatArray3876
		    [((Class371) this).anInt3871 * 16 + 8]
		    = f;
		((Class371) this).aFloatArray3876
		    [((Class371) this).anInt3871 * 16 + 9]
		    = f_2_;
		((Class371) this).aFloatArray3876
		    [((Class371) this).anInt3871 * 16 + 10]
		    = f_3_;
		((Class371) this).aFloatArray3876
		    [((Class371) this).anInt3871 * 16 + 11]
		    = f_6_;
		((Class371) this).aFloatArray3876
		    [((Class371) this).anInt3871 * 16 + 12]
		    = f_1_;
		((Class371) this).aFloatArray3876
		    [((Class371) this).anInt3871 * 16 + 13]
		    = f_2_;
		((Class371) this).aFloatArray3876
		    [((Class371) this).anInt3871 * 16 + 14]
		    = f_5_;
		((Class371) this).aFloatArray3876
		    [((Class371) this).anInt3871 * 16 + 15]
		    = f_6_;
		((Class371) this).anInterface34Array3875[(((Class371) this)
							  .anInt3871)]
		    = interface34;
		if ((((Class173_Sub1) ((Class371) this).aClass173_Sub1_3873)
		     .anInt9377)
		    == 1)
		    ((Class371) this).anIntArray3878[(((Class371) this)
						      .anInt3871)]
			= ~0xff00ff & i | (i & 0xff) << 16 | i >> 16 & 0xff;
		else
		    ((Class371) this).anIntArray3878[(((Class371) this)
						      .anInt3871)]
			= i;
		((Class371) this).anInt3871++;
		if (((Class371) this).aClass336_3872
		    == Class336.aClass336_3574)
		    method4656();
	    }
	}
    }
    
    void method4654() {
	if (((Class371) this).aClass336_3877 != null) {
	    ((Class371) this).aClass336_3872
		= ((Class371) this).aClass336_3877;
	    ((Class371) this).aClass336_3877 = null;
	}
    }
    
    void method4655() {
	if (((Class371) this).anInt3871 != 0) {
	    ((Class371) this).aClass173_Sub1_3873.method8518();
	    ((Class371) this).aClass173_Sub1_3873.method8479(1);
	    ((Class371) this).aClass173_Sub1_3873
		.method8554(((Class371) this).anInterface41_3882);
	    ((Class371) this).aClass173_Sub1_3873
		.method8553(0, ((Class371) this).anInterface36_3880);
	    ((Class371) this).aClass173_Sub1_3873
		.method8552(((Class371) this).aClass344_3881);
	    Class323 class323
		= (((Class173_Sub1) ((Class371) this).aClass173_Sub1_3873)
		   .aClass323_9326);
	    Unsafe unsafe = ((Class371) this).aClass173_Sub1_3873.anUnsafe9221;
	    ByteBuffer bytebuffer
		= ((Class371) this).aClass173_Sub1_3873.aByteBuffer9222;
	    bytebuffer.clear();
	    ((Class371) this).aClass173_Sub1_3873.method8633()
		.method4986(Class418.aClass418_4769);
	    ((Class371) this).aClass173_Sub1_3873
		.method8534(Class358.aClass358_3820);
	    int i = ((((Class371) this).anInt3871 + ((Class371) this).anInt3879
		      - 1)
		     / ((Class371) this).anInt3879);
	    int i_15_ = 0;
	    int i_16_ = 0;
	    for (int i_17_ = 0; i_17_ < i; i_17_++) {
		int i_18_ = Math.min(((Class371) this).anInt3879,
				     ((Class371) this).anInt3871 - i_15_);
		long l = ((Class371) this).anInterface36_3880
			     .method205(0, i_18_ * 96);
		int i_19_ = i_17_ * ((Class371) this).anInt3879 + i_18_;
		for (int i_20_ = i_15_; i_20_ < i_19_; i_20_++) {
		    for (int i_21_ = 0; i_21_ < 4; i_21_++) {
			unsafe.putFloat(l, (((Class371) this).aFloatArray3876
					    [i_16_++]));
			l += 4L;
			unsafe.putFloat(l, (((Class371) this).aFloatArray3876
					    [i_16_++]));
			l += 4L;
			unsafe.putFloat(l, 0.0F);
			l += 4L;
			unsafe.putFloat(l, (((Class371) this).aFloatArray3876
					    [i_16_++]));
			l += 4L;
			unsafe.putFloat(l, (((Class371) this).aFloatArray3876
					    [i_16_++]));
			l += 4L;
			unsafe.putInt(l,
				      ((Class371) this).anIntArray3878[i_20_]);
			l += 4L;
		    }
		}
		((Class371) this).anInterface36_3880.method192();
		Interface34 interface34
		    = ((Class371) this).anInterface34Array3875[i_15_];
		int i_22_ = 1;
		int i_23_ = 0;
		for (int i_24_ = i_15_ + 1; i_24_ < i_19_; i_24_++) {
		    if (interface34
			== ((Class371) this).anInterface34Array3875[i_24_])
			i_22_++;
		    else {
			class323.anInterface34_3484 = interface34;
			class323.method4214();
			((Class371) this).aClass173_Sub1_3873.method8562
			    (((Class371) this).anInterface41_3882,
			     Class363.aClass363_3839, i_23_ * 4, i_22_ * 4,
			     i_23_ * 6, i_22_ * 2);
			interface34
			    = ((Class371) this).anInterface34Array3875[i_24_];
			i_22_ = 1;
			i_23_ = i_24_ - i_15_;
		    }
		}
		class323.anInterface34_3484 = interface34;
		class323.method4214();
		((Class371) this).aClass173_Sub1_3873.method8562
		    (((Class371) this).anInterface41_3882,
		     Class363.aClass363_3839, i_23_ * 4, i_22_ * 4, i_23_ * 6,
		     i_22_ * 2);
		i_15_ += ((Class371) this).anInt3879;
	    }
	    ((Class371) this).anInt3871 = 0;
	}
    }
    
    void method4656() {
	if (((Class371) this).anInt3871 != 0) {
	    ((Class371) this).aClass173_Sub1_3873.method8518();
	    ((Class371) this).aClass173_Sub1_3873.method8479(1);
	    ((Class371) this).aClass173_Sub1_3873
		.method8554(((Class371) this).anInterface41_3882);
	    ((Class371) this).aClass173_Sub1_3873
		.method8553(0, ((Class371) this).anInterface36_3880);
	    ((Class371) this).aClass173_Sub1_3873
		.method8552(((Class371) this).aClass344_3881);
	    Class323 class323
		= (((Class173_Sub1) ((Class371) this).aClass173_Sub1_3873)
		   .aClass323_9326);
	    Unsafe unsafe = ((Class371) this).aClass173_Sub1_3873.anUnsafe9221;
	    ByteBuffer bytebuffer
		= ((Class371) this).aClass173_Sub1_3873.aByteBuffer9222;
	    bytebuffer.clear();
	    ((Class371) this).aClass173_Sub1_3873.method8633()
		.method4986(Class418.aClass418_4769);
	    ((Class371) this).aClass173_Sub1_3873
		.method8534(Class358.aClass358_3820);
	    int i = ((((Class371) this).anInt3871 + ((Class371) this).anInt3879
		      - 1)
		     / ((Class371) this).anInt3879);
	    int i_25_ = 0;
	    int i_26_ = 0;
	    for (int i_27_ = 0; i_27_ < i; i_27_++) {
		int i_28_ = Math.min(((Class371) this).anInt3879,
				     ((Class371) this).anInt3871 - i_25_);
		long l = ((Class371) this).anInterface36_3880
			     .method205(0, i_28_ * 96);
		int i_29_ = i_27_ * ((Class371) this).anInt3879 + i_28_;
		for (int i_30_ = i_25_; i_30_ < i_29_; i_30_++) {
		    for (int i_31_ = 0; i_31_ < 4; i_31_++) {
			unsafe.putFloat(l, (((Class371) this).aFloatArray3876
					    [i_26_++]));
			l += 4L;
			unsafe.putFloat(l, (((Class371) this).aFloatArray3876
					    [i_26_++]));
			l += 4L;
			unsafe.putFloat(l, 0.0F);
			l += 4L;
			unsafe.putFloat(l, (((Class371) this).aFloatArray3876
					    [i_26_++]));
			l += 4L;
			unsafe.putFloat(l, (((Class371) this).aFloatArray3876
					    [i_26_++]));
			l += 4L;
			unsafe.putInt(l,
				      ((Class371) this).anIntArray3878[i_30_]);
			l += 4L;
		    }
		}
		((Class371) this).anInterface36_3880.method192();
		Interface34 interface34
		    = ((Class371) this).anInterface34Array3875[i_25_];
		int i_32_ = 1;
		int i_33_ = 0;
		for (int i_34_ = i_25_ + 1; i_34_ < i_29_; i_34_++) {
		    if (interface34
			== ((Class371) this).anInterface34Array3875[i_34_])
			i_32_++;
		    else {
			class323.anInterface34_3484 = interface34;
			class323.method4214();
			((Class371) this).aClass173_Sub1_3873.method8562
			    (((Class371) this).anInterface41_3882,
			     Class363.aClass363_3839, i_33_ * 4, i_32_ * 4,
			     i_33_ * 6, i_32_ * 2);
			interface34
			    = ((Class371) this).anInterface34Array3875[i_34_];
			i_32_ = 1;
			i_33_ = i_34_ - i_25_;
		    }
		}
		class323.anInterface34_3484 = interface34;
		class323.method4214();
		((Class371) this).aClass173_Sub1_3873.method8562
		    (((Class371) this).anInterface41_3882,
		     Class363.aClass363_3839, i_33_ * 4, i_32_ * 4, i_33_ * 6,
		     i_32_ * 2);
		i_25_ += ((Class371) this).anInt3879;
	    }
	    ((Class371) this).anInt3871 = 0;
	}
    }
    
    void method4657(float f, float f_35_, float f_36_, float f_37_,
		    float f_38_, float f_39_, float f_40_, float f_41_,
		    float f_42_, float f_43_, float f_44_, float f_45_,
		    float f_46_, float f_47_, float f_48_, float f_49_,
		    Interface34 interface34, int i) {
	if ((i & ~0xffffff) != 0) {
	    ((Class371) this).aClass173_Sub1_3873
		.method2207(((Class371) this).anIntArray3883);
	    int i_50_ = ((Class371) this).anIntArray3883[0];
	    int i_51_ = ((Class371) this).anIntArray3883[1];
	    int i_52_ = ((Class371) this).anIntArray3883[2];
	    int i_53_ = ((Class371) this).anIntArray3883[3];
	    int i_54_ = 0;
	    int i_55_ = ((f < (float) i_50_ ? 1 : 0)
			 + (f_36_ < (float) i_50_ ? 1 : 0)
			 + (f_38_ < (float) i_50_ ? 1 : 0)
			 + (f_40_ < (float) i_50_ ? 1 : 0));
	    if (i_55_ != 4) {
		i_54_ |= i_55_;
		i_55_ = ((f > (float) i_52_ ? 1 : 0)
			 + (f_36_ > (float) i_52_ ? 1 : 0)
			 + (f_38_ > (float) i_52_ ? 1 : 0)
			 + (f_40_ > (float) i_52_ ? 1 : 0));
		if (i_55_ != 4) {
		    i_54_ |= i_55_;
		    i_55_ = ((f_35_ < (float) i_51_ ? 1 : 0)
			     + (f_37_ < (float) i_51_ ? 1 : 0)
			     + (f_39_ < (float) i_51_ ? 1 : 0)
			     + (f_41_ < (float) i_51_ ? 1 : 0));
		    if (i_55_ != 4) {
			i_54_ |= i_55_;
			i_55_ = ((f_35_ > (float) i_53_ ? 1 : 0)
				 + (f_37_ > (float) i_53_ ? 1 : 0)
				 + (f_39_ > (float) i_53_ ? 1 : 0)
				 + (f_41_ > (float) i_53_ ? 1 : 0));
			if (i_55_ != 4) {
			    i_54_ |= i_55_;
			    if (i_54_ != 0) {
				method4656();
				((Class371) this).aClass173_Sub1_3873
				    .method2350(true);
				((Class371) this).aClass173_Sub1_3873
				    .method2204(i_50_, i_51_, i_52_, i_53_);
			    }
			    method4670();
			    f = method4659(f);
			    f_35_ = method4660(f_35_);
			    f_36_ = method4659(f_36_);
			    f_37_ = method4660(f_37_);
			    f_38_ = method4659(f_38_);
			    f_39_ = method4660(f_39_);
			    f_40_ = method4659(f_40_);
			    f_41_ = method4660(f_41_);
			    ((Class371) this).aFloatArray3876
				[((Class371) this).anInt3871 * 16 + 0]
				= f;
			    ((Class371) this).aFloatArray3876
				[((Class371) this).anInt3871 * 16 + 1]
				= f_35_;
			    ((Class371) this).aFloatArray3876
				[((Class371) this).anInt3871 * 16 + 2]
				= f_42_;
			    ((Class371) this).aFloatArray3876
				[((Class371) this).anInt3871 * 16 + 3]
				= f_43_;
			    ((Class371) this).aFloatArray3876
				[((Class371) this).anInt3871 * 16 + 4]
				= f_36_;
			    ((Class371) this).aFloatArray3876
				[((Class371) this).anInt3871 * 16 + 5]
				= f_37_;
			    ((Class371) this).aFloatArray3876
				[((Class371) this).anInt3871 * 16 + 6]
				= f_44_;
			    ((Class371) this).aFloatArray3876
				[((Class371) this).anInt3871 * 16 + 7]
				= f_45_;
			    ((Class371) this).aFloatArray3876
				[((Class371) this).anInt3871 * 16 + 8]
				= f_38_;
			    ((Class371) this).aFloatArray3876
				[((Class371) this).anInt3871 * 16 + 9]
				= f_39_;
			    ((Class371) this).aFloatArray3876
				[((Class371) this).anInt3871 * 16 + 10]
				= f_46_;
			    ((Class371) this).aFloatArray3876
				[((Class371) this).anInt3871 * 16 + 11]
				= f_47_;
			    ((Class371) this).aFloatArray3876
				[((Class371) this).anInt3871 * 16 + 12]
				= f_40_;
			    ((Class371) this).aFloatArray3876
				[((Class371) this).anInt3871 * 16 + 13]
				= f_41_;
			    ((Class371) this).aFloatArray3876
				[((Class371) this).anInt3871 * 16 + 14]
				= f_48_;
			    ((Class371) this).aFloatArray3876
				[((Class371) this).anInt3871 * 16 + 15]
				= f_49_;
			    ((Class371) this).anInterface34Array3875
				[((Class371) this).anInt3871]
				= interface34;
			    if ((((Class173_Sub1)
				  ((Class371) this).aClass173_Sub1_3873)
				 .anInt9377)
				== 1)
				((Class371) this).anIntArray3878
				    [((Class371) this).anInt3871]
				    = (~0xff00ff & i | (i & 0xff) << 16
				       | i >> 16 & 0xff);
			    else
				((Class371) this).anIntArray3878
				    [((Class371) this).anInt3871]
				    = i;
			    ((Class371) this).anInt3871++;
			    if ((((Class371) this).aClass336_3872
				 == Class336.aClass336_3574)
				|| i_54_ > 0)
				method4656();
			    if (i_54_ != 0) {
				((Class371) this).aClass173_Sub1_3873
				    .method2350(false);
				((Class371) this).aClass173_Sub1_3873
				    .method2203();
				((Class371) this).aClass173_Sub1_3873
				    .method2204(i_50_, i_51_, i_52_, i_53_);
			    }
			}
		    }
		}
	    }
	}
    }
    
    void method4658() {
	if (((Class371) this).aClass336_3877 != null) {
	    ((Class371) this).aClass336_3872
		= ((Class371) this).aClass336_3877;
	    ((Class371) this).aClass336_3877 = null;
	}
    }
    
    float method4659(float f) {
	int i = ((Class371) this).aClass173_Sub1_3873.method2403
		    ((byte) -116).method2074();
	float f_56_ = ((f + ((Class371) this).aClass173_Sub1_3873.method8468())
		       / (float) i * 2.0F) - 1.0F;
	return f_56_;
    }
    
    float method4660(float f) {
	int i = ((Class371) this).aClass173_Sub1_3873.method2403
		    ((byte) -23).method2070();
	float f_57_
	    = (1.0F - ((f + ((Class371) this).aClass173_Sub1_3873.method8468())
		       / (float) i)) * 2.0F - 1.0F;
	return f_57_;
    }
    
    void method4661() {
	((Class371) this).aClass336_3877 = ((Class371) this).aClass336_3872;
	((Class371) this).aClass336_3872 = Class336.aClass336_3575;
    }
    
    void method4662() {
	((Class371) this).aClass336_3877 = ((Class371) this).aClass336_3872;
	((Class371) this).aClass336_3872 = Class336.aClass336_3575;
    }
    
    Class336 method4663() {
	return ((Class371) this).aClass336_3872;
    }
    
    void method4664() {
	((Class371) this).anInterface36_3880.method115();
	((Class371) this).anInterface41_3882.method115();
	((Class371) this).anInterface36_3880 = null;
	((Class371) this).anInterface41_3882 = null;
	((Class371) this).aClass344_3881 = null;
	((Class371) this).anInt3871 = 0;
    }
    
    void method4665() {
	if (((Class371) this).anInt3871 != 0) {
	    ((Class371) this).aClass173_Sub1_3873.method8518();
	    ((Class371) this).aClass173_Sub1_3873.method8479(1);
	    ((Class371) this).aClass173_Sub1_3873
		.method8554(((Class371) this).anInterface41_3882);
	    ((Class371) this).aClass173_Sub1_3873
		.method8553(0, ((Class371) this).anInterface36_3880);
	    ((Class371) this).aClass173_Sub1_3873
		.method8552(((Class371) this).aClass344_3881);
	    Class323 class323
		= (((Class173_Sub1) ((Class371) this).aClass173_Sub1_3873)
		   .aClass323_9326);
	    Unsafe unsafe = ((Class371) this).aClass173_Sub1_3873.anUnsafe9221;
	    ByteBuffer bytebuffer
		= ((Class371) this).aClass173_Sub1_3873.aByteBuffer9222;
	    bytebuffer.clear();
	    ((Class371) this).aClass173_Sub1_3873.method8633()
		.method4986(Class418.aClass418_4769);
	    ((Class371) this).aClass173_Sub1_3873
		.method8534(Class358.aClass358_3820);
	    int i = ((((Class371) this).anInt3871 + ((Class371) this).anInt3879
		      - 1)
		     / ((Class371) this).anInt3879);
	    int i_58_ = 0;
	    int i_59_ = 0;
	    for (int i_60_ = 0; i_60_ < i; i_60_++) {
		int i_61_ = Math.min(((Class371) this).anInt3879,
				     ((Class371) this).anInt3871 - i_58_);
		long l = ((Class371) this).anInterface36_3880
			     .method205(0, i_61_ * 96);
		int i_62_ = i_60_ * ((Class371) this).anInt3879 + i_61_;
		for (int i_63_ = i_58_; i_63_ < i_62_; i_63_++) {
		    for (int i_64_ = 0; i_64_ < 4; i_64_++) {
			unsafe.putFloat(l, (((Class371) this).aFloatArray3876
					    [i_59_++]));
			l += 4L;
			unsafe.putFloat(l, (((Class371) this).aFloatArray3876
					    [i_59_++]));
			l += 4L;
			unsafe.putFloat(l, 0.0F);
			l += 4L;
			unsafe.putFloat(l, (((Class371) this).aFloatArray3876
					    [i_59_++]));
			l += 4L;
			unsafe.putFloat(l, (((Class371) this).aFloatArray3876
					    [i_59_++]));
			l += 4L;
			unsafe.putInt(l,
				      ((Class371) this).anIntArray3878[i_63_]);
			l += 4L;
		    }
		}
		((Class371) this).anInterface36_3880.method192();
		Interface34 interface34
		    = ((Class371) this).anInterface34Array3875[i_58_];
		int i_65_ = 1;
		int i_66_ = 0;
		for (int i_67_ = i_58_ + 1; i_67_ < i_62_; i_67_++) {
		    if (interface34
			== ((Class371) this).anInterface34Array3875[i_67_])
			i_65_++;
		    else {
			class323.anInterface34_3484 = interface34;
			class323.method4214();
			((Class371) this).aClass173_Sub1_3873.method8562
			    (((Class371) this).anInterface41_3882,
			     Class363.aClass363_3839, i_66_ * 4, i_65_ * 4,
			     i_66_ * 6, i_65_ * 2);
			interface34
			    = ((Class371) this).anInterface34Array3875[i_67_];
			i_65_ = 1;
			i_66_ = i_67_ - i_58_;
		    }
		}
		class323.anInterface34_3484 = interface34;
		class323.method4214();
		((Class371) this).aClass173_Sub1_3873.method8562
		    (((Class371) this).anInterface41_3882,
		     Class363.aClass363_3839, i_66_ * 4, i_65_ * 4, i_66_ * 6,
		     i_65_ * 2);
		i_58_ += ((Class371) this).anInt3879;
	    }
	    ((Class371) this).anInt3871 = 0;
	}
    }
    
    void method4666() {
	if (((Class371) this).anInt3871 != 0) {
	    ((Class371) this).aClass173_Sub1_3873.method8518();
	    ((Class371) this).aClass173_Sub1_3873.method8479(1);
	    ((Class371) this).aClass173_Sub1_3873
		.method8554(((Class371) this).anInterface41_3882);
	    ((Class371) this).aClass173_Sub1_3873
		.method8553(0, ((Class371) this).anInterface36_3880);
	    ((Class371) this).aClass173_Sub1_3873
		.method8552(((Class371) this).aClass344_3881);
	    Class323 class323
		= (((Class173_Sub1) ((Class371) this).aClass173_Sub1_3873)
		   .aClass323_9326);
	    Unsafe unsafe = ((Class371) this).aClass173_Sub1_3873.anUnsafe9221;
	    ByteBuffer bytebuffer
		= ((Class371) this).aClass173_Sub1_3873.aByteBuffer9222;
	    bytebuffer.clear();
	    ((Class371) this).aClass173_Sub1_3873.method8633()
		.method4986(Class418.aClass418_4769);
	    ((Class371) this).aClass173_Sub1_3873
		.method8534(Class358.aClass358_3820);
	    int i = ((((Class371) this).anInt3871 + ((Class371) this).anInt3879
		      - 1)
		     / ((Class371) this).anInt3879);
	    int i_68_ = 0;
	    int i_69_ = 0;
	    for (int i_70_ = 0; i_70_ < i; i_70_++) {
		int i_71_ = Math.min(((Class371) this).anInt3879,
				     ((Class371) this).anInt3871 - i_68_);
		long l = ((Class371) this).anInterface36_3880
			     .method205(0, i_71_ * 96);
		int i_72_ = i_70_ * ((Class371) this).anInt3879 + i_71_;
		for (int i_73_ = i_68_; i_73_ < i_72_; i_73_++) {
		    for (int i_74_ = 0; i_74_ < 4; i_74_++) {
			unsafe.putFloat(l, (((Class371) this).aFloatArray3876
					    [i_69_++]));
			l += 4L;
			unsafe.putFloat(l, (((Class371) this).aFloatArray3876
					    [i_69_++]));
			l += 4L;
			unsafe.putFloat(l, 0.0F);
			l += 4L;
			unsafe.putFloat(l, (((Class371) this).aFloatArray3876
					    [i_69_++]));
			l += 4L;
			unsafe.putFloat(l, (((Class371) this).aFloatArray3876
					    [i_69_++]));
			l += 4L;
			unsafe.putInt(l,
				      ((Class371) this).anIntArray3878[i_73_]);
			l += 4L;
		    }
		}
		((Class371) this).anInterface36_3880.method192();
		Interface34 interface34
		    = ((Class371) this).anInterface34Array3875[i_68_];
		int i_75_ = 1;
		int i_76_ = 0;
		for (int i_77_ = i_68_ + 1; i_77_ < i_72_; i_77_++) {
		    if (interface34
			== ((Class371) this).anInterface34Array3875[i_77_])
			i_75_++;
		    else {
			class323.anInterface34_3484 = interface34;
			class323.method4214();
			((Class371) this).aClass173_Sub1_3873.method8562
			    (((Class371) this).anInterface41_3882,
			     Class363.aClass363_3839, i_76_ * 4, i_75_ * 4,
			     i_76_ * 6, i_75_ * 2);
			interface34
			    = ((Class371) this).anInterface34Array3875[i_77_];
			i_75_ = 1;
			i_76_ = i_77_ - i_68_;
		    }
		}
		class323.anInterface34_3484 = interface34;
		class323.method4214();
		((Class371) this).aClass173_Sub1_3873.method8562
		    (((Class371) this).anInterface41_3882,
		     Class363.aClass363_3839, i_76_ * 4, i_75_ * 4, i_76_ * 6,
		     i_75_ * 2);
		i_68_ += ((Class371) this).anInt3879;
	    }
	    ((Class371) this).anInt3871 = 0;
	}
    }
    
    void method4667() {
	if (((Class371) this).anInt3871 == ((Class371) this).anInt3874) {
	    ((Class371) this).anInt3874 *= 2;
	    float[] fs = new float[((Class371) this).anInt3874 * 16];
	    for (int i = 0; i < ((Class371) this).anInt3871 * 16; i++)
		fs[i] = ((Class371) this).aFloatArray3876[i];
	    ((Class371) this).aFloatArray3876 = fs;
	    Interface34[] interface34s
		= new Interface34[((Class371) this).anInt3874];
	    int[] is = new int[((Class371) this).anInt3874];
	    for (int i = 0; i < ((Class371) this).anInt3871; i++) {
		interface34s[i] = ((Class371) this).anInterface34Array3875[i];
		is[i] = ((Class371) this).anIntArray3878[i];
	    }
	    ((Class371) this).anInterface34Array3875 = interface34s;
	    ((Class371) this).anIntArray3878 = is;
	}
    }
    
    void method4668() {
	((Class371) this).anInterface36_3880.method115();
	((Class371) this).anInterface41_3882.method115();
	((Class371) this).anInterface36_3880 = null;
	((Class371) this).anInterface41_3882 = null;
	((Class371) this).aClass344_3881 = null;
	((Class371) this).anInt3871 = 0;
    }
    
    float method4669(float f) {
	int i = ((Class371) this).aClass173_Sub1_3873.method2403
		    ((byte) -18).method2070();
	float f_78_
	    = (1.0F - ((f + ((Class371) this).aClass173_Sub1_3873.method8468())
		       / (float) i)) * 2.0F - 1.0F;
	return f_78_;
    }
    
    void method4670() {
	if (((Class371) this).anInt3871 == ((Class371) this).anInt3874) {
	    ((Class371) this).anInt3874 *= 2;
	    float[] fs = new float[((Class371) this).anInt3874 * 16];
	    for (int i = 0; i < ((Class371) this).anInt3871 * 16; i++)
		fs[i] = ((Class371) this).aFloatArray3876[i];
	    ((Class371) this).aFloatArray3876 = fs;
	    Interface34[] interface34s
		= new Interface34[((Class371) this).anInt3874];
	    int[] is = new int[((Class371) this).anInt3874];
	    for (int i = 0; i < ((Class371) this).anInt3871; i++) {
		interface34s[i] = ((Class371) this).anInterface34Array3875[i];
		is[i] = ((Class371) this).anIntArray3878[i];
	    }
	    ((Class371) this).anInterface34Array3875 = interface34s;
	    ((Class371) this).anIntArray3878 = is;
	}
    }
    
    float method4671(float f) {
	int i = ((Class371) this).aClass173_Sub1_3873.method2403
		    ((byte) -104).method2074();
	float f_79_ = ((f + ((Class371) this).aClass173_Sub1_3873.method8468())
		       / (float) i * 2.0F) - 1.0F;
	return f_79_;
    }
    
    void method4672() {
	if (((Class371) this).aClass336_3877 != null) {
	    ((Class371) this).aClass336_3872
		= ((Class371) this).aClass336_3877;
	    ((Class371) this).aClass336_3877 = null;
	}
    }
    
    void method4673() {
	if (((Class371) this).aClass336_3877 != null) {
	    ((Class371) this).aClass336_3872
		= ((Class371) this).aClass336_3877;
	    ((Class371) this).aClass336_3877 = null;
	}
    }
    
    void method4674() {
	if (((Class371) this).aClass336_3877 != null) {
	    ((Class371) this).aClass336_3872
		= ((Class371) this).aClass336_3877;
	    ((Class371) this).aClass336_3877 = null;
	}
    }
    
    Class371(Class173_Sub1 class173_sub1, int i) {
	((Class371) this).anInt3871 = 0;
	((Class371) this).aFloatArray3876
	    = new float[((Class371) this).anInt3874 * 16];
	((Class371) this).anInterface34Array3875
	    = new Interface34[((Class371) this).anInt3874];
	((Class371) this).anIntArray3878
	    = new int[((Class371) this).anInt3874];
	((Class371) this).anIntArray3883 = new int[4];
	((Class371) this).aClass173_Sub1_3873 = class173_sub1;
	((Class371) this).anInterface36_3880
	    = ((Class371) this).aClass173_Sub1_3873.method8549(true);
	((Class371) this).anInterface36_3880.method258(i * 96, 24);
	((Class371) this).aClass344_3881
	    = (((Class371) this).aClass173_Sub1_3873.method8543
	       (new Class345[]
		{ new Class345(new Class331[] { Class331.aClass331_3521,
						Class331.aClass331_3518,
						Class331.aClass331_3531 }) }));
	((Class371) this).anInterface41_3882
	    = ((Class371) this).aClass173_Sub1_3873.method8476(false);
	int i_80_ = i * 6;
	((Class371) this).anInterface41_3882.method311(i_80_);
	int i_81_
	    = (i_80_
	       * (((Class371) this).anInterface41_3882.method310().anInt1942
		  * -1009481111));
	ByteBuffer bytebuffer
	    = ((Class371) this).aClass173_Sub1_3873.aByteBuffer9222;
	((Class371) this).aClass173_Sub1_3873.method8451(i_81_);
	bytebuffer.clear();
	for (int i_82_ = 0; i_82_ < i; i_82_++) {
	    bytebuffer.putShort((short) (i_82_ * 4));
	    bytebuffer.putShort((short) (i_82_ * 4 + 2));
	    bytebuffer.putShort((short) (i_82_ * 4 + 1));
	    bytebuffer.putShort((short) (i_82_ * 4 + 2));
	    bytebuffer.putShort((short) (i_82_ * 4 + 3));
	    bytebuffer.putShort((short) (i_82_ * 4 + 1));
	}
	((Class371) this).anInterface41_3882.method197
	    (0,
	     (i_80_
	      * (((Class371) this).anInterface41_3882.method310().anInt1942
		 * -1009481111)),
	     ((Class371) this).aClass173_Sub1_3873.aLong9223);
	((Class371) this).anInt3879 = i;
	((Class371) this).anInt3871 = 0;
    }
    
    void method4675() {
	if (((Class371) this).aClass336_3877 != null) {
	    ((Class371) this).aClass336_3872
		= ((Class371) this).aClass336_3877;
	    ((Class371) this).aClass336_3877 = null;
	}
    }
}
