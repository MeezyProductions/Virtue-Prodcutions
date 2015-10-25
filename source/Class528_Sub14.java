/* Class528_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class528_Sub14 extends Node
{
    int anInt10355;
    Class137_Sub2 aClass137_Sub2_10356;
    Class528_Sub12 aClass528_Sub12_10357;
    int anInt10358;
    int anInt10359;
    int anInt10360;
    Class173_Sub1 aClass173_Sub1_10361;
    int anInt10362 = 0;
    float[][] aFloatArrayArray10363;
    int anInt10364;
    int anInt10365;
    Interface36 anInterface36_10366;
    float[][] aFloatArrayArray10367;
    float[][] aFloatArrayArray10368;
    Interface41 anInterface41_10369;
    Class692 aClass692_10370;
    ByteBuffer aByteBuffer10371;
    
    void method9390(Class306 class306, Interface41 interface41, int i) {
	class306.anInt3370 = 0;
	class306.anInt3354 = ((Class528_Sub14) this).anInt10362;
	class306.anInt3351 = 0;
	class306.anInt3373 = ((Class528_Sub14) this).anInt10364 / 3;
	class306.anInterface34_3355
	    = ((Class528_Sub14) this).aClass173_Sub1_10361.anInterface34_9316;
	float f = ((Class528_Sub14) this).aClass528_Sub12_10357
		      .method9362(1918196352);
	class306.aClass422_3363.method5057(f, f, f);
	((Class528_Sub14) this).aClass173_Sub1_10361
	    .method8553(0, ((Class528_Sub14) this).anInterface36_10366);
	((Class528_Sub14) this).aClass173_Sub1_10361.method8552
	    (((Class173_Sub1) ((Class528_Sub14) this).aClass173_Sub1_10361)
	     .aClass344_9379);
	((Class528_Sub14) this).aClass173_Sub1_10361
	    .method8554(((Class528_Sub14) this).anInterface41_10369);
	class306.method4059(0);
    }
    
    Class528_Sub14(Class173_Sub1 class173_sub1, Class137_Sub2 class137_sub2,
		   Class528_Sub12 class528_sub12, int[] is) {
	((Class528_Sub14) this).anInt10355 = 0;
	((Class528_Sub14) this).anInt10364 = 0;
	((Class528_Sub14) this).aClass173_Sub1_10361 = class173_sub1;
	((Class528_Sub14) this).aClass528_Sub12_10357 = class528_sub12;
	((Class528_Sub14) this).aClass137_Sub2_10356 = class137_sub2;
	int i = (((Class528_Sub14) this).aClass528_Sub12_10357
		     .method9357(1560068267)
		 - (class137_sub2.anInt1628 * 2130003981 >> 1));
	((Class528_Sub14) this).anInt10358
	    = (((Class528_Sub14) this).aClass528_Sub12_10357
		   .method9366(2049980444) - i
	       >> class137_sub2.anInt1625 * 1543345989);
	((Class528_Sub14) this).anInt10359
	    = (((Class528_Sub14) this).aClass528_Sub12_10357
		   .method9366(1970780469) + i
	       >> class137_sub2.anInt1625 * 1543345989);
	((Class528_Sub14) this).anInt10360
	    = (((Class528_Sub14) this).aClass528_Sub12_10357
		   .method9370(1221114533) - i
	       >> class137_sub2.anInt1625 * 1543345989);
	((Class528_Sub14) this).anInt10365
	    = (((Class528_Sub14) this).aClass528_Sub12_10357
		   .method9370(1221114533) + i
	       >> class137_sub2.anInt1625 * 1543345989);
	int i_0_ = (((Class528_Sub14) this).anInt10359
		    - ((Class528_Sub14) this).anInt10358 + 1);
	int i_1_ = (((Class528_Sub14) this).anInt10365
		    - ((Class528_Sub14) this).anInt10360 + 1);
	((Class528_Sub14) this).aFloatArrayArray10368
	    = new float[i_0_ + 1][i_1_ + 1];
	((Class528_Sub14) this).aFloatArrayArray10367
	    = new float[i_0_ + 1][i_1_ + 1];
	((Class528_Sub14) this).aFloatArrayArray10363
	    = new float[i_0_ + 1][i_1_ + 1];
	for (int i_2_ = 0; i_2_ <= i_1_; i_2_++) {
	    int i_3_ = i_2_ + ((Class528_Sub14) this).anInt10360;
	    if (i_3_ > 0
		&& i_3_ < (((Class528_Sub14) this).aClass137_Sub2_10356
			   .anInt1626) * 1769495707 - 1) {
		for (int i_4_ = 0; i_4_ <= i_0_; i_4_++) {
		    int i_5_ = i_4_ + ((Class528_Sub14) this).anInt10358;
		    if (i_5_ > 0
			&& i_5_ < (((Class528_Sub14) this).aClass137_Sub2_10356
				   .anInt1627) * -657933437 - 1) {
			int i_6_ = (class137_sub2.method1669(i_5_ + 1, i_3_,
							     (byte) 0)
				    - class137_sub2.method1669(i_5_ - 1, i_3_,
							       (byte) 0));
			int i_7_ = (class137_sub2.method1669(i_5_, i_3_ + 1,
							     (byte) 0)
				    - class137_sub2.method1669(i_5_, i_3_ - 1,
							       (byte) 0));
			float f
			    = (float) (1.0
				       / Math.sqrt((double) (i_6_ * i_6_
							     + 65536
							     + i_7_ * i_7_)));
			((Class528_Sub14) this).aFloatArrayArray10368[i_4_]
			    [i_2_]
			    = (float) i_6_ * f;
			((Class528_Sub14) this).aFloatArrayArray10367[i_4_]
			    [i_2_]
			    = -256.0F * f;
			((Class528_Sub14) this).aFloatArrayArray10363[i_4_]
			    [i_2_]
			    = (float) i_7_ * f;
		    }
		}
	    }
	}
	int i_8_ = 0;
	for (int i_9_ = ((Class528_Sub14) this).anInt10360;
	     i_9_ <= ((Class528_Sub14) this).anInt10365; i_9_++) {
	    if (i_9_ >= 0 && i_9_ < class137_sub2.anInt1626 * 1769495707) {
		for (int i_10_ = ((Class528_Sub14) this).anInt10358;
		     i_10_ <= ((Class528_Sub14) this).anInt10359; i_10_++) {
		    if (i_10_ >= 0
			&& i_10_ < class137_sub2.anInt1627 * -657933437) {
			int i_11_ = is[i_8_];
			int[] is_12_
			    = (((Class137_Sub2) class137_sub2)
			       .anIntArrayArrayArray8968[i_10_][i_9_]);
			if (is_12_ != null && i_11_ != 0) {
			    if (i_11_ == 1) {
				for (int i_13_ = 0; i_13_ < is_12_.length;
				     i_13_ += 3) {
				    if (is_12_[i_13_] != -1
					&& is_12_[i_13_ + 1] != -1
					&& is_12_[i_13_ + 2] != -1)
					((Class528_Sub14) this).anInt10355
					    += 3;
				}
			    } else
				((Class528_Sub14) this).anInt10355 += 3;
			}
		    }
		    i_8_++;
		}
	    } else
		i_8_ += (((Class528_Sub14) this).anInt10359
			 - ((Class528_Sub14) this).anInt10358);
	}
	if (((Class528_Sub14) this).anInt10355 > 0) {
	    ((Class528_Sub14) this).aClass692_10370
		= new Class692(Class327.method4259((((Class528_Sub14) this)
						    .anInt10355),
						   -2134279851));
	    ((Class528_Sub14) this).aByteBuffer10371
		= ((Class528_Sub14) this).aClass173_Sub1_10361.aByteBuffer9222;
	    ((Class528_Sub14) this).aByteBuffer10371.clear();
	    ((Class528_Sub14) this).aByteBuffer10371.position
		(((Class173_Sub1) (((Class528_Sub14) this)
				   .aClass173_Sub1_10361)).anInt9270 >> 1);
	    ((Class528_Sub14) this).aByteBuffer10371.slice();
	    ((Class528_Sub14) this).aByteBuffer10371.position(0);
	    ((Class528_Sub14) this).aByteBuffer10371.limit
		(((Class173_Sub1) (((Class528_Sub14) this)
				   .aClass173_Sub1_10361)).anInt9270 >> 1);
	    int i_14_ = 0;
	    i_8_ = 0;
	    for (int i_15_ = ((Class528_Sub14) this).anInt10360;
		 i_15_ <= ((Class528_Sub14) this).anInt10365; i_15_++) {
		if (i_15_ >= 0
		    && i_15_ < class137_sub2.anInt1626 * 1769495707) {
		    int i_16_ = 0;
		    for (int i_17_ = ((Class528_Sub14) this).anInt10358;
			 i_17_ <= ((Class528_Sub14) this).anInt10359;
			 i_17_++) {
			if (i_17_ >= 0
			    && i_17_ < class137_sub2.anInt1627 * -657933437) {
			    int i_18_ = is[i_8_];
			    int[] is_19_
				= (((Class137_Sub2) class137_sub2)
				   .anIntArrayArrayArray8968[i_17_][i_15_]);
			    if (is_19_ != null && i_18_ != 0) {
				if (i_18_ == 1) {
				    int[] is_20_
					= (((Class137_Sub2) class137_sub2)
					   .anIntArrayArrayArray8970[i_17_]
					   [i_15_]);
				    int[] is_21_
					= (((Class137_Sub2) class137_sub2)
					   .anIntArrayArrayArray8989[i_17_]
					   [i_15_]);
				    int i_22_ = 0;
				    while (i_22_ < is_19_.length) {
					if (is_19_[i_22_] != -1
					    && is_19_[i_22_ + 1] != -1
					    && is_19_[i_22_ + 2] != -1) {
					    method9391(i_16_, i_14_, i_17_,
						       i_15_, is_20_[i_22_],
						       is_21_[i_22_]);
					    i_22_++;
					    method9391(i_16_, i_14_, i_17_,
						       i_15_, is_20_[i_22_],
						       is_21_[i_22_]);
					    i_22_++;
					    method9391(i_16_, i_14_, i_17_,
						       i_15_, is_20_[i_22_],
						       is_21_[i_22_]);
					    i_22_++;
					} else
					    i_22_ += 3;
				    }
				} else if (i_18_ == 3) {
				    method9391(i_16_, i_14_, i_17_, i_15_, 0,
					       0);
				    method9391(i_16_, i_14_, i_17_, i_15_,
					       (class137_sub2.anInt1628
						* 2130003981),
					       0);
				    method9391(i_16_, i_14_, i_17_, i_15_, 0,
					       (class137_sub2.anInt1628
						* 2130003981));
				} else if (i_18_ == 2) {
				    method9391(i_16_, i_14_, i_17_, i_15_,
					       (class137_sub2.anInt1628
						* 2130003981),
					       0);
				    method9391(i_16_, i_14_, i_17_, i_15_,
					       (class137_sub2.anInt1628
						* 2130003981),
					       (class137_sub2.anInt1628
						* 2130003981));
				    method9391(i_16_, i_14_, i_17_, i_15_, 0,
					       0);
				} else if (i_18_ == 5) {
				    method9391(i_16_, i_14_, i_17_, i_15_,
					       (class137_sub2.anInt1628
						* 2130003981),
					       (class137_sub2.anInt1628
						* 2130003981));
				    method9391(i_16_, i_14_, i_17_, i_15_, 0,
					       (class137_sub2.anInt1628
						* 2130003981));
				    method9391(i_16_, i_14_, i_17_, i_15_,
					       (class137_sub2.anInt1628
						* 2130003981),
					       0);
				} else if (i_18_ == 4) {
				    method9391(i_16_, i_14_, i_17_, i_15_, 0,
					       (class137_sub2.anInt1628
						* 2130003981));
				    method9391(i_16_, i_14_, i_17_, i_15_, 0,
					       0);
				    method9391(i_16_, i_14_, i_17_, i_15_,
					       (class137_sub2.anInt1628
						* 2130003981),
					       (class137_sub2.anInt1628
						* 2130003981));
				}
			    }
			}
			i_8_++;
			i_16_++;
		    }
		} else
		    i_8_ += (((Class528_Sub14) this).anInt10359
			     - ((Class528_Sub14) this).anInt10358);
		i_14_++;
	    }
	    method9393();
	} else {
	    ((Class528_Sub14) this).anInterface36_10366 = null;
	    ((Class528_Sub14) this).anInterface41_10369 = null;
	}
	((Class528_Sub14) this).aClass692_10370 = null;
	((Class528_Sub14) this).aFloatArrayArray10363 = null;
	((Class528_Sub14) this).aFloatArrayArray10367 = null;
	((Class528_Sub14) this).aFloatArrayArray10368 = null;
    }
    
    void method9391(int i, int i_23_, int i_24_, int i_25_, int i_26_,
		    int i_27_) {
	long l = -1L;
	int i_28_
	    = i_26_ + (i_24_ << (((Class528_Sub14) this).aClass137_Sub2_10356
				 .anInt1625) * 1543345989);
	int i_29_
	    = i_27_ + (i_25_ << (((Class528_Sub14) this).aClass137_Sub2_10356
				 .anInt1625) * 1543345989);
	int i_30_ = ((Class528_Sub14) this).aClass137_Sub2_10356
			.method1656(i_28_, i_29_, 1104933021);
	if ((i_26_ & 0x7f) == 0 || (i_27_ & 0x7f) == 0) {
	    l = ((long) i_29_ & 0xffffL) << 16 | (long) i_28_ & 0xffffL;
	    Node node
		= ((Class528_Sub14) this).aClass692_10370.method8137(l);
	    if (node != null) {
		Unsafe unsafe = (((Class528_Sub14) this).aClass173_Sub1_10361
				 .anUnsafe9221);
		unsafe.putShort(((((Class528_Sub14) this).aClass173_Sub1_10361
				  .aLong9223)
				 + (long) (((Class173_Sub1)
					    (((Class528_Sub14) this)
					     .aClass173_Sub1_10361)).anInt9270
					   >> 1)
				 + (long) (((Class528_Sub14) this).anInt10364
					   * 2)),
				((Class528_Sub18) node).aShort10389);
		((Class528_Sub14) this).anInt10364++;
		return;
	    }
	}
	short i_31_ = (short) ((Class528_Sub14) this).anInt10362;
	if (l != -1L)
	    ((Class528_Sub14) this).aClass692_10370
		.method8142(new Class528_Sub18(i_31_), l);
	float f;
	float f_32_;
	float f_33_;
	if (i_26_ == 0 && i_27_ == 0) {
	    f = ((Class528_Sub14) this).aFloatArrayArray10368[i][i_23_];
	    f_32_ = ((Class528_Sub14) this).aFloatArrayArray10367[i][i_23_];
	    f_33_ = ((Class528_Sub14) this).aFloatArrayArray10363[i][i_23_];
	} else if (i_26_ == (((Class528_Sub14) this).aClass137_Sub2_10356
			     .anInt1628) * 2130003981
		   && i_27_ == 0) {
	    f = ((Class528_Sub14) this).aFloatArrayArray10368[i + 1][i_23_];
	    f_32_
		= ((Class528_Sub14) this).aFloatArrayArray10367[i + 1][i_23_];
	    f_33_
		= ((Class528_Sub14) this).aFloatArrayArray10363[i + 1][i_23_];
	} else if (i_26_ == (((Class528_Sub14) this).aClass137_Sub2_10356
			     .anInt1628) * 2130003981
		   && i_27_ == (((Class528_Sub14) this).aClass137_Sub2_10356
				.anInt1628) * 2130003981) {
	    f = (((Class528_Sub14) this).aFloatArrayArray10368[i + 1]
		 [i_23_ + 1]);
	    f_32_ = (((Class528_Sub14) this).aFloatArrayArray10367[i + 1]
		     [i_23_ + 1]);
	    f_33_ = (((Class528_Sub14) this).aFloatArrayArray10363[i + 1]
		     [i_23_ + 1]);
	} else if (i_26_ == 0
		   && i_27_ == (((Class528_Sub14) this).aClass137_Sub2_10356
				.anInt1628) * 2130003981) {
	    f = ((Class528_Sub14) this).aFloatArrayArray10368[i][i_23_ + 1];
	    f_32_
		= ((Class528_Sub14) this).aFloatArrayArray10367[i][i_23_ + 1];
	    f_33_
		= ((Class528_Sub14) this).aFloatArrayArray10363[i][i_23_ + 1];
	} else {
	    float f_34_
		= (float) i_26_ / (float) ((((Class528_Sub14) this)
					    .aClass137_Sub2_10356.anInt1628)
					   * 2130003981);
	    float f_35_
		= (float) i_27_ / (float) ((((Class528_Sub14) this)
					    .aClass137_Sub2_10356.anInt1628)
					   * 2130003981);
	    float f_36_
		= ((Class528_Sub14) this).aFloatArrayArray10368[i][i_23_];
	    float f_37_
		= ((Class528_Sub14) this).aFloatArrayArray10367[i][i_23_];
	    float f_38_
		= ((Class528_Sub14) this).aFloatArrayArray10363[i][i_23_];
	    float f_39_
		= ((Class528_Sub14) this).aFloatArrayArray10368[i + 1][i_23_];
	    float f_40_
		= ((Class528_Sub14) this).aFloatArrayArray10367[i + 1][i_23_];
	    float f_41_
		= ((Class528_Sub14) this).aFloatArrayArray10363[i + 1][i_23_];
	    f_36_
		+= (((Class528_Sub14) this).aFloatArrayArray10368[i][i_23_ + 1]
		    - f_36_) * f_34_;
	    f_37_
		+= (((Class528_Sub14) this).aFloatArrayArray10367[i][i_23_ + 1]
		    - f_37_) * f_34_;
	    f_38_
		+= (((Class528_Sub14) this).aFloatArrayArray10363[i][i_23_ + 1]
		    - f_38_) * f_34_;
	    f_39_ += ((((Class528_Sub14) this).aFloatArrayArray10368[i + 1]
		       [i_23_ + 1])
		      - f_39_) * f_34_;
	    f_40_ += ((((Class528_Sub14) this).aFloatArrayArray10367[i + 1]
		       [i_23_ + 1])
		      - f_40_) * f_34_;
	    f_41_ += ((((Class528_Sub14) this).aFloatArrayArray10363[i + 1]
		       [i_23_ + 1])
		      - f_41_) * f_34_;
	    f = f_36_ + (f_39_ - f_36_) * f_35_;
	    f_32_ = f_37_ + (f_40_ - f_37_) * f_35_;
	    f_33_ = f_38_ + (f_41_ - f_38_) * f_35_;
	}
	float f_42_ = (float) (((Class528_Sub14) this)
				   .aClass528_Sub12_10357
				   .method9366(1079630985)
			       - i_28_);
	float f_43_ = (float) (((Class528_Sub14) this)
				   .aClass528_Sub12_10357
				   .method9360(-1375654801)
			       - i_30_);
	float f_44_ = (float) (((Class528_Sub14) this)
				   .aClass528_Sub12_10357
				   .method9370(1221114533)
			       - i_29_);
	float f_45_ = (float) Math.sqrt((double) (f_42_ * f_42_ + f_43_ * f_43_
						  + f_44_ * f_44_));
	float f_46_ = 1.0F / f_45_;
	f_42_ *= f_46_;
	f_43_ *= f_46_;
	f_44_ *= f_46_;
	float f_47_
	    = f_45_ / (float) ((Class528_Sub14) this).aClass528_Sub12_10357
				  .method9357(967235945);
	float f_48_ = 1.0F - f_47_ * f_47_;
	if (f_48_ < 0.0F)
	    f_48_ = 0.0F;
	float f_49_ = f_42_ * f + f_43_ * f_32_ + f_44_ * f_33_;
	if (f_49_ < 0.0F)
	    f_49_ = 0.0F;
	float f_50_ = f_49_ * f_48_ * 2.0F;
	if (f_50_ > 1.0F)
	    f_50_ = 1.0F;
	int i_51_ = ((Class528_Sub14) this).aClass528_Sub12_10357
			.method9361((byte) -5);
	int i_52_ = (int) (f_50_ * (float) (i_51_ >> 16 & 0xff));
	if (i_52_ > 255)
	    i_52_ = 255;
	int i_53_ = (int) (f_50_ * (float) (i_51_ >> 8 & 0xff));
	if (i_53_ > 255)
	    i_53_ = 255;
	int i_54_ = (int) (f_50_ * (float) (i_51_ & 0xff));
	if (i_54_ > 255)
	    i_54_ = 255;
	Unsafe unsafe
	    = ((Class528_Sub14) this).aClass173_Sub1_10361.anUnsafe9221;
	unsafe.putFloat((((Class528_Sub14) this).aClass173_Sub1_10361.aLong9223
			 + (long) (((Class528_Sub14) this).anInt10362 * 16)),
			(float) i_28_);
	unsafe.putFloat((((Class528_Sub14) this).aClass173_Sub1_10361.aLong9223
			 + (long) (((Class528_Sub14) this).anInt10362 * 16)
			 + 4L),
			(float) i_30_);
	unsafe.putFloat((((Class528_Sub14) this).aClass173_Sub1_10361.aLong9223
			 + (long) (((Class528_Sub14) this).anInt10362 * 16)
			 + 8L),
			(float) i_29_);
	if ((((Class173_Sub1) ((Class528_Sub14) this).aClass173_Sub1_10361)
	     .anInt9377)
	    == 0) {
	    unsafe.putByte(((((Class528_Sub14) this).aClass173_Sub1_10361
			     .aLong9223)
			    + (long) (((Class528_Sub14) this).anInt10362 * 16)
			    + 12L),
			   (byte) i_54_);
	    unsafe.putByte(((((Class528_Sub14) this).aClass173_Sub1_10361
			     .aLong9223)
			    + (long) (((Class528_Sub14) this).anInt10362 * 16)
			    + 13L),
			   (byte) i_53_);
	    unsafe.putByte(((((Class528_Sub14) this).aClass173_Sub1_10361
			     .aLong9223)
			    + (long) (((Class528_Sub14) this).anInt10362 * 16)
			    + 14L),
			   (byte) i_52_);
	} else {
	    unsafe.putByte(((((Class528_Sub14) this).aClass173_Sub1_10361
			     .aLong9223)
			    + (long) (((Class528_Sub14) this).anInt10362 * 16)
			    + 12L),
			   (byte) i_52_);
	    unsafe.putByte(((((Class528_Sub14) this).aClass173_Sub1_10361
			     .aLong9223)
			    + (long) (((Class528_Sub14) this).anInt10362 * 16)
			    + 13L),
			   (byte) i_53_);
	    unsafe.putByte(((((Class528_Sub14) this).aClass173_Sub1_10361
			     .aLong9223)
			    + (long) (((Class528_Sub14) this).anInt10362 * 16)
			    + 14L),
			   (byte) i_54_);
	}
	unsafe.putByte((((Class528_Sub14) this).aClass173_Sub1_10361.aLong9223
			+ (long) (((Class528_Sub14) this).anInt10362 * 16)
			+ 15L),
		       (byte) -1);
	((Class528_Sub14) this).anInt10362++;
	unsafe.putShort((((Class528_Sub14) this).aClass173_Sub1_10361.aLong9223
			 + (long) ((((Class173_Sub1) (((Class528_Sub14) this)
						      .aClass173_Sub1_10361))
				    .anInt9270)
				   >> 1)
			 + (long) (((Class528_Sub14) this).anInt10364 * 2)),
			i_31_);
	((Class528_Sub14) this).anInt10364++;
    }
    
    void method9392(Class306 class306, int i, int i_55_, int i_56_,
		    boolean[][] bools, boolean bool) {
	if (((Class528_Sub14) this).anInterface41_10369 != null
	    && ((Class528_Sub14) this).anInt10358 <= i + i_56_
	    && ((Class528_Sub14) this).anInt10359 >= i - i_56_
	    && ((Class528_Sub14) this).anInt10360 <= i_55_ + i_56_
	    && ((Class528_Sub14) this).anInt10365 >= i_55_ - i_56_) {
	    if (bool) {
		for (int i_57_ = ((Class528_Sub14) this).anInt10358;
		     i_57_ <= ((Class528_Sub14) this).anInt10359; i_57_++) {
		    if (i_57_ - i >= -i_56_ && i_57_ - i <= i_56_) {
			for (int i_58_ = ((Class528_Sub14) this).anInt10360;
			     i_58_ <= ((Class528_Sub14) this).anInt10365;
			     i_58_++) {
			    if (i_58_ - i_55_ >= -i_56_
				&& i_58_ - i_55_ <= i_56_
				&& (bools[i_57_ - i + i_56_]
				    [i_58_ - i_55_ + i_56_])) {
				method9390(class306,
					   (((Class528_Sub14) this)
					    .anInterface41_10369),
					   (((Class528_Sub14) this).anInt10364
					    / 3));
				return;
			    }
			}
		    }
		}
	    } else {
		int i_59_ = 0;
		ByteBuffer bytebuffer
		    = (((Class528_Sub14) this).aClass173_Sub1_10361
		       .aByteBuffer9222);
		bytebuffer.clear();
		for (int i_60_ = ((Class528_Sub14) this).anInt10360;
		     i_60_ <= ((Class528_Sub14) this).anInt10365; i_60_++) {
		    if (i_60_ - i_55_ >= -i_56_ && i_60_ - i_55_ <= i_56_) {
			int i_61_ = (i_60_ * ((((Class528_Sub14) this)
					       .aClass137_Sub2_10356.anInt1627)
					      * -657933437)
				     + ((Class528_Sub14) this).anInt10358);
			for (int i_62_ = ((Class528_Sub14) this).anInt10358;
			     i_62_ <= ((Class528_Sub14) this).anInt10359;
			     i_62_++) {
			    if (i_62_ - i >= -i_56_ && i_62_ - i <= i_56_
				&& (bools[i_62_ - i + i_56_]
				    [i_60_ - i_55_ + i_56_])) {
				short[] is = (((Class137_Sub2)
					       (((Class528_Sub14) this)
						.aClass137_Sub2_10356))
					      .aShortArrayArray8967[i_61_]);
				if (is != null) {
				    for (int i_63_ = 0; i_63_ < is.length;
					 i_63_++) {
					bytebuffer.putShort(is[i_63_]);
					i_59_++;
				    }
				}
			    }
			    i_61_++;
			}
		    }
		}
		if (bytebuffer.position() != 0 && i_59_ != 0) {
		    int i_64_ = bytebuffer.position();
		    Interface41 interface41
			= ((Class528_Sub14) this).aClass173_Sub1_10361
			      .method8478(i_64_ / 2);
		    interface41.method197(0, i_64_,
					  (((Class528_Sub14) this)
					   .aClass173_Sub1_10361.aLong9223));
		    method9390(class306, interface41, i_59_ / 3);
		}
	    }
	}
    }
    
    void method9393() {
	((Class528_Sub14) this).anInterface41_10369
	    = ((Class528_Sub14) this).aClass173_Sub1_10361.method8476(false);
	((Class528_Sub14) this).anInterface41_10369
	    .method311(((Class528_Sub14) this).anInt10364);
	((Class528_Sub14) this).anInterface36_10366
	    = ((Class528_Sub14) this).aClass173_Sub1_10361.method8549(false);
	((Class528_Sub14) this).anInterface36_10366
	    .method258(((Class528_Sub14) this).anInt10362 * 16, 16);
	((Class528_Sub14) this).anInterface36_10366.method197
	    (0, ((Class528_Sub14) this).anInt10362 * 16,
	     ((Class528_Sub14) this).aClass173_Sub1_10361.aLong9223);
	((Class528_Sub14) this).anInterface41_10369.method197
	    (0, ((Class528_Sub14) this).anInt10364 * 2,
	     (((Class528_Sub14) this).aClass173_Sub1_10361.aLong9223
	      + (long) (((Class173_Sub1) (((Class528_Sub14) this)
					  .aClass173_Sub1_10361)).anInt9270
			>> 1)));
    }
    
    void method9394() {
	((Class528_Sub14) this).anInterface41_10369
	    = ((Class528_Sub14) this).aClass173_Sub1_10361.method8476(false);
	((Class528_Sub14) this).anInterface41_10369
	    .method311(((Class528_Sub14) this).anInt10364);
	((Class528_Sub14) this).anInterface36_10366
	    = ((Class528_Sub14) this).aClass173_Sub1_10361.method8549(false);
	((Class528_Sub14) this).anInterface36_10366
	    .method258(((Class528_Sub14) this).anInt10362 * 16, 16);
	((Class528_Sub14) this).anInterface36_10366.method197
	    (0, ((Class528_Sub14) this).anInt10362 * 16,
	     ((Class528_Sub14) this).aClass173_Sub1_10361.aLong9223);
	((Class528_Sub14) this).anInterface41_10369.method197
	    (0, ((Class528_Sub14) this).anInt10364 * 2,
	     (((Class528_Sub14) this).aClass173_Sub1_10361.aLong9223
	      + (long) (((Class173_Sub1) (((Class528_Sub14) this)
					  .aClass173_Sub1_10361)).anInt9270
			>> 1)));
    }
}
