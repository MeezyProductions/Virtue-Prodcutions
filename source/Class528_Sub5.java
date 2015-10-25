/* Class528_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class528_Sub5 extends Node
{
    float[][] aFloatArrayArray10231;
    Class173_Sub2 aClass173_Sub2_10232;
    Class528_Sub12 aClass528_Sub12_10233;
    int anInt10234;
    int anInt10235;
    float[][] aFloatArrayArray10236;
    int anInt10237;
    int anInt10238;
    int anInt10239;
    Interface16 anInterface16_10240;
    Interface14 anInterface14_10241;
    Class122 aClass122_10242;
    int anInt10243;
    Class137_Sub3 aClass137_Sub3_10244;
    Class122 aClass122_10245;
    float[][] aFloatArrayArray10246;
    ByteBuffer aClass528_Sub42_10247;
    Class528_Sub42_Sub1 aClass528_Sub42_Sub1_10248;
    Class692 aClass692_10249;
    
    void method9259(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
	long l = -1L;
	int i_5_ = i_3_ + (i_1_ << (((Class528_Sub5) this).aClass137_Sub3_10244
				    .anInt1625) * 1543345989);
	int i_6_ = i_4_ + (i_2_ << (((Class528_Sub5) this).aClass137_Sub3_10244
				    .anInt1625) * 1543345989);
	int i_7_ = ((Class528_Sub5) this).aClass137_Sub3_10244
		       .method1656(i_5_, i_6_, 2054410055);
	if ((i_3_ & 0x7f) == 0 || (i_4_ & 0x7f) == 0) {
	    l = ((long) i_6_ & 0xffffL) << 16 | (long) i_5_ & 0xffffL;
	    Class528_Sub18 class528_sub18
		= ((Class528_Sub18)
		   ((Class528_Sub5) this).aClass692_10249.method8137(l));
	    if (class528_sub18 != null) {
		method9262(class528_sub18.aShort10389);
		return;
	    }
	}
	short i_8_ = (short) ((Class528_Sub5) this).anInt10238++;
	if (l != -1L)
	    ((Class528_Sub5) this).aClass692_10249
		.method8142(new Class528_Sub18(i_8_), l);
	float f;
	float f_9_;
	float f_10_;
	if (i_3_ == 0 && i_4_ == 0) {
	    f = ((Class528_Sub5) this).aFloatArrayArray10231[i][i_0_];
	    f_9_ = ((Class528_Sub5) this).aFloatArrayArray10236[i][i_0_];
	    f_10_ = ((Class528_Sub5) this).aFloatArrayArray10246[i][i_0_];
	} else if (i_3_ == (((Class528_Sub5) this).aClass137_Sub3_10244
			    .anInt1628) * 2130003981
		   && i_4_ == 0) {
	    f = ((Class528_Sub5) this).aFloatArrayArray10231[i + 1][i_0_];
	    f_9_ = ((Class528_Sub5) this).aFloatArrayArray10236[i + 1][i_0_];
	    f_10_ = ((Class528_Sub5) this).aFloatArrayArray10246[i + 1][i_0_];
	} else if (i_3_ == (((Class528_Sub5) this).aClass137_Sub3_10244
			    .anInt1628) * 2130003981
		   && i_4_ == (((Class528_Sub5) this).aClass137_Sub3_10244
			       .anInt1628) * 2130003981) {
	    f = ((Class528_Sub5) this).aFloatArrayArray10231[i + 1][i_0_ + 1];
	    f_9_ = (((Class528_Sub5) this).aFloatArrayArray10236[i + 1]
		    [i_0_ + 1]);
	    f_10_ = (((Class528_Sub5) this).aFloatArrayArray10246[i + 1]
		     [i_0_ + 1]);
	} else if (i_3_ == 0
		   && i_4_ == (((Class528_Sub5) this).aClass137_Sub3_10244
			       .anInt1628) * 2130003981) {
	    f = ((Class528_Sub5) this).aFloatArrayArray10231[i][i_0_ + 1];
	    f_9_ = ((Class528_Sub5) this).aFloatArrayArray10236[i][i_0_ + 1];
	    f_10_ = ((Class528_Sub5) this).aFloatArrayArray10246[i][i_0_ + 1];
	} else {
	    float f_11_
		= (float) i_3_ / (float) ((((Class528_Sub5) this)
					   .aClass137_Sub3_10244.anInt1628)
					  * 2130003981);
	    float f_12_
		= (float) i_4_ / (float) ((((Class528_Sub5) this)
					   .aClass137_Sub3_10244.anInt1628)
					  * 2130003981);
	    float f_13_
		= ((Class528_Sub5) this).aFloatArrayArray10231[i][i_0_];
	    float f_14_
		= ((Class528_Sub5) this).aFloatArrayArray10236[i][i_0_];
	    float f_15_
		= ((Class528_Sub5) this).aFloatArrayArray10246[i][i_0_];
	    float f_16_
		= ((Class528_Sub5) this).aFloatArrayArray10231[i + 1][i_0_];
	    float f_17_
		= ((Class528_Sub5) this).aFloatArrayArray10236[i + 1][i_0_];
	    float f_18_
		= ((Class528_Sub5) this).aFloatArrayArray10246[i + 1][i_0_];
	    f_13_ += (((Class528_Sub5) this).aFloatArrayArray10231[i][i_0_ + 1]
		      - f_13_) * f_11_;
	    f_14_ += (((Class528_Sub5) this).aFloatArrayArray10236[i][i_0_ + 1]
		      - f_14_) * f_11_;
	    f_15_ += (((Class528_Sub5) this).aFloatArrayArray10246[i][i_0_ + 1]
		      - f_15_) * f_11_;
	    f_16_ += ((((Class528_Sub5) this).aFloatArrayArray10231[i + 1]
		       [i_0_ + 1])
		      - f_16_) * f_11_;
	    f_17_ += ((((Class528_Sub5) this).aFloatArrayArray10236[i + 1]
		       [i_0_ + 1])
		      - f_17_) * f_11_;
	    f_18_ += ((((Class528_Sub5) this).aFloatArrayArray10246[i + 1]
		       [i_0_ + 1])
		      - f_18_) * f_11_;
	    f = f_13_ + (f_16_ - f_13_) * f_12_;
	    f_9_ = f_14_ + (f_17_ - f_14_) * f_12_;
	    f_10_ = f_15_ + (f_18_ - f_15_) * f_12_;
	}
	float f_19_ = (float) (((Class528_Sub5) this).aClass528_Sub12_10233
				   .method9366(1948370957)
			       - i_5_);
	float f_20_ = (float) (((Class528_Sub5) this).aClass528_Sub12_10233
				   .method9360(-1375654801)
			       - i_7_);
	float f_21_ = (float) (((Class528_Sub5) this).aClass528_Sub12_10233
				   .method9370(1221114533)
			       - i_6_);
	float f_22_ = (float) Math.sqrt((double) (f_19_ * f_19_ + f_20_ * f_20_
						  + f_21_ * f_21_));
	float f_23_ = 1.0F / f_22_;
	f_19_ *= f_23_;
	f_20_ *= f_23_;
	f_21_ *= f_23_;
	float f_24_
	    = f_22_ / (float) ((Class528_Sub5) this).aClass528_Sub12_10233
				  .method9357(1138540166);
	float f_25_ = 1.0F - f_24_ * f_24_;
	if (f_25_ < 0.0F)
	    f_25_ = 0.0F;
	float f_26_ = f_19_ * f + f_20_ * f_9_ + f_21_ * f_10_;
	if (f_26_ < 0.0F)
	    f_26_ = 0.0F;
	float f_27_ = f_26_ * f_25_ * 2.0F;
	if (f_27_ > 1.0F)
	    f_27_ = 1.0F;
	int i_28_ = ((Class528_Sub5) this).aClass528_Sub12_10233
			.method9361((byte) 3);
	int i_29_ = (int) (f_27_ * (float) (i_28_ >> 16 & 0xff));
	if (i_29_ > 255)
	    i_29_ = 255;
	int i_30_ = (int) (f_27_ * (float) (i_28_ >> 8 & 0xff));
	if (i_30_ > 255)
	    i_30_ = 255;
	int i_31_ = (int) (f_27_ * (float) (i_28_ & 0xff));
	if (i_31_ > 255)
	    i_31_ = 255;
	if (((Class173_Sub2) ((Class528_Sub5) this).aClass173_Sub2_10232)
	    .aBool9561) {
	    ((Class528_Sub5) this).aClass528_Sub42_Sub1_10248
		.method10615((float) i_5_);
	    ((Class528_Sub5) this).aClass528_Sub42_Sub1_10248
		.method10615((float) i_7_);
	    ((Class528_Sub5) this).aClass528_Sub42_Sub1_10248
		.method10615((float) i_6_);
	} else {
	    ((Class528_Sub5) this).aClass528_Sub42_Sub1_10248
		.method10614((float) i_5_);
	    ((Class528_Sub5) this).aClass528_Sub42_Sub1_10248
		.method10614((float) i_7_);
	    ((Class528_Sub5) this).aClass528_Sub42_Sub1_10248
		.method10614((float) i_6_);
	}
	((Class528_Sub5) this).aClass528_Sub42_Sub1_10248
	    .writeByte(i_29_, (byte) -20);
	((Class528_Sub5) this).aClass528_Sub42_Sub1_10248
	    .writeByte(i_30_, (byte) -53);
	((Class528_Sub5) this).aClass528_Sub42_Sub1_10248
	    .writeByte(i_31_, (byte) 76);
	((Class528_Sub5) this).aClass528_Sub42_Sub1_10248
	    .writeByte(255, (byte) -11);
	method9262(i_8_);
    }
    
    void method9260(int i, int i_32_, int i_33_, boolean[][] bools) {
	if (((Class528_Sub5) this).anInterface16_10240 != null
	    && ((Class528_Sub5) this).anInt10235 <= i + i_33_
	    && ((Class528_Sub5) this).anInt10243 >= i - i_33_
	    && ((Class528_Sub5) this).anInt10234 <= i_32_ + i_33_
	    && ((Class528_Sub5) this).anInt10237 >= i_32_ - i_33_) {
	    for (int i_34_ = ((Class528_Sub5) this).anInt10234;
		 i_34_ <= ((Class528_Sub5) this).anInt10237; i_34_++) {
		for (int i_35_ = ((Class528_Sub5) this).anInt10235;
		     i_35_ <= ((Class528_Sub5) this).anInt10243; i_35_++) {
		    int i_36_ = i_35_ - i;
		    int i_37_ = i_34_ - i_32_;
		    if (i_36_ > -i_33_ && i_36_ < i_33_ && i_37_ > -i_33_
			&& i_37_ < i_33_
			&& bools[i_36_ + i_33_][i_37_ + i_33_]) {
			((Class528_Sub5) this).aClass173_Sub2_10232.method8804
			    ((int) (((Class528_Sub5) this)
					.aClass528_Sub12_10233
					.method9362(1995725822)
				    * 255.0F) << 24);
			((Class528_Sub5) this).aClass173_Sub2_10232.method8779
			    (((Class528_Sub5) this).aClass122_10245, null,
			     ((Class528_Sub5) this).aClass122_10242, null);
			((Class528_Sub5) this).aClass173_Sub2_10232.method8769
			    (((Class528_Sub5) this).anInterface16_10240, 4, 0,
			     ((Class528_Sub5) this).anInt10239);
			return;
		    }
		}
	    }
	}
    }
    
    void method9261(short i) {
	if (((Class173_Sub2) ((Class528_Sub5) this).aClass173_Sub2_10232)
	    .aBool9561)
	    ((Class528_Sub5) this).aClass528_Sub42_10247
		.method9717(i, (byte) 111);
	else
	    ((Class528_Sub5) this).aClass528_Sub42_10247
		.writeLEShort(i, -1102718643);
    }
    
    void method9262(short i) {
	if (((Class173_Sub2) ((Class528_Sub5) this).aClass173_Sub2_10232)
	    .aBool9561)
	    ((Class528_Sub5) this).aClass528_Sub42_10247
		.method9717(i, (byte) -24);
	else
	    ((Class528_Sub5) this).aClass528_Sub42_10247
		.writeLEShort(i, -1102718643);
    }
    
    void method9263(short i) {
	if (((Class173_Sub2) ((Class528_Sub5) this).aClass173_Sub2_10232)
	    .aBool9561)
	    ((Class528_Sub5) this).aClass528_Sub42_10247
		.method9717(i, (byte) -61);
	else
	    ((Class528_Sub5) this).aClass528_Sub42_10247
		.writeLEShort(i, -1102718643);
    }
    
    Class528_Sub5(Class173_Sub2 class173_sub2, Class137_Sub3 class137_sub3,
		  Class528_Sub12 class528_sub12, int[] is) {
	((Class528_Sub5) this).aClass173_Sub2_10232 = class173_sub2;
	((Class528_Sub5) this).aClass528_Sub12_10233 = class528_sub12;
	((Class528_Sub5) this).aClass137_Sub3_10244 = class137_sub3;
	int i = (((Class528_Sub5) this).aClass528_Sub12_10233
		     .method9357(1577951825)
		 - (class137_sub3.anInt1628 * 2130003981 >> 1));
	((Class528_Sub5) this).anInt10235
	    = (((Class528_Sub5) this).aClass528_Sub12_10233
		   .method9366(2029346205) - i
	       >> class137_sub3.anInt1625 * 1543345989);
	((Class528_Sub5) this).anInt10243
	    = (((Class528_Sub5) this).aClass528_Sub12_10233
		   .method9366(2117679611) + i
	       >> class137_sub3.anInt1625 * 1543345989);
	((Class528_Sub5) this).anInt10234
	    = (((Class528_Sub5) this).aClass528_Sub12_10233
		   .method9370(1221114533) - i
	       >> class137_sub3.anInt1625 * 1543345989);
	((Class528_Sub5) this).anInt10237
	    = (((Class528_Sub5) this).aClass528_Sub12_10233
		   .method9370(1221114533) + i
	       >> class137_sub3.anInt1625 * 1543345989);
	int i_38_ = (((Class528_Sub5) this).anInt10243
		     - ((Class528_Sub5) this).anInt10235 + 1);
	int i_39_ = (((Class528_Sub5) this).anInt10237
		     - ((Class528_Sub5) this).anInt10234 + 1);
	((Class528_Sub5) this).aFloatArrayArray10231
	    = new float[i_38_ + 1][i_39_ + 1];
	((Class528_Sub5) this).aFloatArrayArray10236
	    = new float[i_38_ + 1][i_39_ + 1];
	((Class528_Sub5) this).aFloatArrayArray10246
	    = new float[i_38_ + 1][i_39_ + 1];
	for (int i_40_ = 0; i_40_ <= i_39_; i_40_++) {
	    int i_41_ = i_40_ + ((Class528_Sub5) this).anInt10234;
	    if (i_41_ > 0
		&& i_41_ < (((Class528_Sub5) this).aClass137_Sub3_10244
			    .anInt1626) * 1769495707 - 1) {
		for (int i_42_ = 0; i_42_ <= i_38_; i_42_++) {
		    int i_43_ = i_42_ + ((Class528_Sub5) this).anInt10235;
		    if (i_43_ > 0
			&& i_43_ < (((Class528_Sub5) this).aClass137_Sub3_10244
				    .anInt1627) * -657933437 - 1) {
			int i_44_
			    = (class137_sub3.method1669(i_43_ + 1, i_41_,
							(byte) 0)
			       - class137_sub3.method1669(i_43_ - 1, i_41_,
							  (byte) 0));
			int i_45_
			    = (class137_sub3.method1669(i_43_, i_41_ + 1,
							(byte) 0)
			       - class137_sub3.method1669(i_43_, i_41_ - 1,
							  (byte) 0));
			float f
			    = (float) (1.0
				       / Math.sqrt((double) (i_44_ * i_44_
							     + 65536
							     + (i_45_
								* i_45_))));
			((Class528_Sub5) this).aFloatArrayArray10231[i_42_]
			    [i_40_]
			    = (float) i_44_ * f;
			((Class528_Sub5) this).aFloatArrayArray10236[i_42_]
			    [i_40_]
			    = -256.0F * f;
			((Class528_Sub5) this).aFloatArrayArray10246[i_42_]
			    [i_40_]
			    = (float) i_45_ * f;
		    }
		}
	    }
	}
	int i_46_ = 0;
	for (int i_47_ = ((Class528_Sub5) this).anInt10234;
	     i_47_ <= ((Class528_Sub5) this).anInt10237; i_47_++) {
	    if (i_47_ >= 0 && i_47_ < class137_sub3.anInt1626 * 1769495707) {
		for (int i_48_ = ((Class528_Sub5) this).anInt10235;
		     i_48_ <= ((Class528_Sub5) this).anInt10243; i_48_++) {
		    if (i_48_ >= 0
			&& i_48_ < class137_sub3.anInt1627 * -657933437) {
			int i_49_ = is[i_46_];
			int[] is_50_
			    = (((Class137_Sub3) class137_sub3)
			       .anIntArrayArrayArray9008[i_48_][i_47_]);
			if (is_50_ != null && i_49_ != 0) {
			    if (i_49_ == 1) {
				for (int i_51_ = 0; i_51_ < is_50_.length;
				     i_51_ += 3) {
				    if (is_50_[i_51_] != -1
					&& is_50_[i_51_ + 1] != -1
					&& is_50_[i_51_ + 2] != -1)
					((Class528_Sub5) this).anInt10239 += 3;
				}
			    } else
				((Class528_Sub5) this).anInt10239 += 3;
			}
		    }
		    i_46_++;
		}
	    } else
		i_46_ += (((Class528_Sub5) this).anInt10243
			  - ((Class528_Sub5) this).anInt10235);
	}
	if (((Class528_Sub5) this).anInt10239 > 0) {
	    ((Class528_Sub5) this).aClass528_Sub42_10247
		= new ByteBuffer(((Class528_Sub5) this).anInt10239 * 2);
	    ((Class528_Sub5) this).aClass528_Sub42_Sub1_10248
		= new Class528_Sub42_Sub1(((Class528_Sub5) this).anInt10239
					  * 16);
	    ((Class528_Sub5) this).aClass692_10249
		= new Class692(Class327.method4259((((Class528_Sub5) this)
						    .anInt10239),
						   -2134279851));
	    int i_52_ = 0;
	    i_46_ = 0;
	    for (int i_53_ = ((Class528_Sub5) this).anInt10234;
		 i_53_ <= ((Class528_Sub5) this).anInt10237; i_53_++) {
		if (i_53_ >= 0
		    && i_53_ < class137_sub3.anInt1626 * 1769495707) {
		    int i_54_ = 0;
		    for (int i_55_ = ((Class528_Sub5) this).anInt10235;
			 i_55_ <= ((Class528_Sub5) this).anInt10243; i_55_++) {
			if (i_55_ >= 0
			    && i_55_ < class137_sub3.anInt1627 * -657933437) {
			    int i_56_ = is[i_46_];
			    int[] is_57_
				= (((Class137_Sub3) class137_sub3)
				   .anIntArrayArrayArray9008[i_55_][i_53_]);
			    if (is_57_ != null && i_56_ != 0) {
				if (i_56_ == 1) {
				    int[] is_58_
					= (((Class137_Sub3) class137_sub3)
					   .anIntArrayArrayArray8998[i_55_]
					   [i_53_]);
				    int[] is_59_
					= (((Class137_Sub3) class137_sub3)
					   .anIntArrayArrayArray9002[i_55_]
					   [i_53_]);
				    int i_60_ = 0;
				    while (i_60_ < is_57_.length) {
					if (is_57_[i_60_] != -1
					    && is_57_[i_60_ + 1] != -1
					    && is_57_[i_60_ + 2] != -1) {
					    method9259(i_54_, i_52_, i_55_,
						       i_53_, is_58_[i_60_],
						       is_59_[i_60_]);
					    i_60_++;
					    method9259(i_54_, i_52_, i_55_,
						       i_53_, is_58_[i_60_],
						       is_59_[i_60_]);
					    i_60_++;
					    method9259(i_54_, i_52_, i_55_,
						       i_53_, is_58_[i_60_],
						       is_59_[i_60_]);
					    i_60_++;
					} else
					    i_60_ += 3;
				    }
				} else if (i_56_ == 3) {
				    method9259(i_54_, i_52_, i_55_, i_53_, 0,
					       0);
				    method9259(i_54_, i_52_, i_55_, i_53_,
					       (class137_sub3.anInt1628
						* 2130003981),
					       0);
				    method9259(i_54_, i_52_, i_55_, i_53_, 0,
					       (class137_sub3.anInt1628
						* 2130003981));
				} else if (i_56_ == 2) {
				    method9259(i_54_, i_52_, i_55_, i_53_,
					       (class137_sub3.anInt1628
						* 2130003981),
					       0);
				    method9259(i_54_, i_52_, i_55_, i_53_,
					       (class137_sub3.anInt1628
						* 2130003981),
					       (class137_sub3.anInt1628
						* 2130003981));
				    method9259(i_54_, i_52_, i_55_, i_53_, 0,
					       0);
				} else if (i_56_ == 5) {
				    method9259(i_54_, i_52_, i_55_, i_53_,
					       (class137_sub3.anInt1628
						* 2130003981),
					       (class137_sub3.anInt1628
						* 2130003981));
				    method9259(i_54_, i_52_, i_55_, i_53_, 0,
					       (class137_sub3.anInt1628
						* 2130003981));
				    method9259(i_54_, i_52_, i_55_, i_53_,
					       (class137_sub3.anInt1628
						* 2130003981),
					       0);
				} else if (i_56_ == 4) {
				    method9259(i_54_, i_52_, i_55_, i_53_, 0,
					       (class137_sub3.anInt1628
						* 2130003981));
				    method9259(i_54_, i_52_, i_55_, i_53_, 0,
					       0);
				    method9259(i_54_, i_52_, i_55_, i_53_,
					       (class137_sub3.anInt1628
						* 2130003981),
					       (class137_sub3.anInt1628
						* 2130003981));
				}
			    }
			}
			i_46_++;
			i_54_++;
		    }
		} else
		    i_46_ += (((Class528_Sub5) this).anInt10243
			      - ((Class528_Sub5) this).anInt10235);
		i_52_++;
	    }
	    ((Class528_Sub5) this).anInterface16_10240
		= (((Class528_Sub5) this).aClass173_Sub2_10232.method8815
		   (5123,
		    (((Class528_Sub5) this).aClass528_Sub42_10247
		     .payload),
		    (((Class528_Sub5) this).aClass528_Sub42_10247.pointer
		     * -185904669),
		    false));
	    ((Class528_Sub5) this).anInterface14_10241
		= (((Class528_Sub5) this).aClass173_Sub2_10232.method8770
		   (16,
		    (((Class528_Sub5) this).aClass528_Sub42_Sub1_10248
		     .payload),
		    (((Class528_Sub5) this).aClass528_Sub42_Sub1_10248
		     .pointer) * -185904669,
		    false));
	    ((Class528_Sub5) this).aClass122_10245
		= new Class122(((Class528_Sub5) this).anInterface14_10241,
			       5126, 3, 0);
	    ((Class528_Sub5) this).aClass122_10242
		= new Class122(((Class528_Sub5) this).anInterface14_10241,
			       5121, 4, 12);
	} else {
	    ((Class528_Sub5) this).anInterface16_10240 = null;
	    ((Class528_Sub5) this).anInterface14_10241 = null;
	    ((Class528_Sub5) this).aClass122_10245 = null;
	    ((Class528_Sub5) this).aClass122_10242 = null;
	}
	((Class528_Sub5) this).aClass528_Sub42_Sub1_10248 = null;
	((Class528_Sub5) this).aClass528_Sub42_10247 = null;
	((Class528_Sub5) this).aClass692_10249 = null;
	((Class528_Sub5) this).aFloatArrayArray10246 = null;
	((Class528_Sub5) this).aFloatArrayArray10236 = null;
	((Class528_Sub5) this).aFloatArrayArray10231 = null;
    }
}
