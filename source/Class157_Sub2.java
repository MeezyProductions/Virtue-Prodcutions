/* Class157_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class157_Sub2 extends Class157
{
    float[] aFloatArray9119;
    boolean aBool9120 = false;
    Class107 aClass107_9121;
    Class170[] aClass170Array9122;
    Class108[] aClass108Array9123;
    static int anInt9124 = 4096;
    Class144[] aClass144Array9125;
    float[] aFloatArray9126;
    static final int anInt9127 = -2;
    Class157_Sub2[] aClass157_Sub2Array9128;
    static final int anInt9129 = 7;
    Class173_Sub3 aClass173_Sub3_9130;
    static final int anInt9131 = 618648;
    int anInt9132;
    int anInt9133;
    int anInt9134;
    int anInt9135 = 0;
    int anInt9136 = 0;
    float[] aFloatArray9137;
    static int anInt9138 = 4096;
    static final int anInt9139 = 4;
    short[] aShortArray9140;
    Class103[] aClass103Array9141;
    Class103[] aClass103Array9142;
    int anInt9143 = 0;
    short aShort9144;
    short[] aShortArray9145;
    short[] aShortArray9146;
    short[] aShortArray9147;
    static final int anInt9148 = 618520;
    float[][] aFloatArrayArray9149;
    int[] anIntArray9150;
    int[] anIntArray9151;
    int anInt9152;
    static final int anInt9153 = 0;
    static final int anInt9154 = 1;
    int[] anIntArray9155;
    Class90[] aClass90Array9156;
    float[][] aFloatArrayArray9157;
    byte[] aByteArray9158;
    byte[] aByteArray9159;
    byte[] aByteArray9160;
    static final int anInt9161 = 2;
    short[] aShortArray9162;
    short[] aShortArray9163;
    short[] aShortArray9164;
    int[][] anIntArrayArray9165;
    int[][] anIntArrayArray9166;
    static final int anInt9167 = -1;
    boolean aBool9168;
    int anInt9169;
    int anInt9170;
    int anInt9171;
    boolean aBool9172;
    int[] anIntArray9173;
    int[] anIntArray9174;
    int anInt9175;
    Class107 aClass107_9176;
    int[] anIntArray9177;
    int[][] anIntArrayArray9178;
    boolean aBool9179;
    short aShort9180;
    short aShort9181;
    short aShort9182;
    short aShort9183;
    short aShort9184;
    short aShort9185;
    short aShort9186;
    boolean aBool9187;
    int[] anIntArray9188;
    short aShort9189;
    boolean aBool9190;
    Class157_Sub2[] aClass157_Sub2Array9191;
    static int anInt9192 = 0;
    int[] anIntArray9193;
    int[] anIntArray9194;
    boolean aBool9195;
    Class104[] aClass104Array9196;
    float[] aFloatArray9197;
    int anInt9198 = 0;
    boolean aBool9199;
    Class121 aClass121_9200;
    int[] anIntArray9201;
    int[] anIntArray9202;
    int[] anIntArray9203;
    int[] anIntArray9204;
    short[] aShortArray9205;
    
    boolean method1889() {
	if (((Class157_Sub2) this).anIntArrayArray9165 == null)
	    return false;
	((Class157_Sub2) this).anInt9169 = 0;
	((Class157_Sub2) this).anInt9170 = 0;
	((Class157_Sub2) this).anInt9171 = 0;
	return true;
    }
    
    void method1892(int i, int[] is, int i_0_, int i_1_, int i_2_, int i_3_,
		    boolean bool) {
	int i_4_ = is.length;
	if (i == 0) {
	    i_0_ <<= 4;
	    i_1_ <<= 4;
	    i_2_ <<= 4;
	    if (!((Class157_Sub2) this).aBool9168) {
		for (int i_5_ = 0; i_5_ < ((Class157_Sub2) this).anInt9135;
		     i_5_++) {
		    ((Class157_Sub2) this).anIntArray9203[i_5_] <<= 4;
		    ((Class157_Sub2) this).anIntArray9204[i_5_] <<= 4;
		    ((Class157_Sub2) this).anIntArray9177[i_5_] <<= 4;
		}
		((Class157_Sub2) this).aBool9168 = true;
	    }
	    int i_6_ = 0;
	    ((Class157_Sub2) this).anInt9169 = 0;
	    ((Class157_Sub2) this).anInt9170 = 0;
	    ((Class157_Sub2) this).anInt9171 = 0;
	    for (int i_7_ = 0; i_7_ < i_4_; i_7_++) {
		int i_8_ = is[i_7_];
		if (i_8_ < ((Class157_Sub2) this).anIntArrayArray9165.length) {
		    int[] is_9_
			= ((Class157_Sub2) this).anIntArrayArray9165[i_8_];
		    for (int i_10_ = 0; i_10_ < is_9_.length; i_10_++) {
			int i_11_ = is_9_[i_10_];
			((Class157_Sub2) this).anInt9169
			    += ((Class157_Sub2) this).anIntArray9203[i_11_];
			((Class157_Sub2) this).anInt9170
			    += ((Class157_Sub2) this).anIntArray9204[i_11_];
			((Class157_Sub2) this).anInt9171
			    += ((Class157_Sub2) this).anIntArray9177[i_11_];
			i_6_++;
		    }
		}
	    }
	    if (i_6_ > 0) {
		((Class157_Sub2) this).anInt9169
		    = ((Class157_Sub2) this).anInt9169 / i_6_ + i_0_;
		((Class157_Sub2) this).anInt9170
		    = ((Class157_Sub2) this).anInt9170 / i_6_ + i_1_;
		((Class157_Sub2) this).anInt9171
		    = ((Class157_Sub2) this).anInt9171 / i_6_ + i_2_;
	    } else {
		((Class157_Sub2) this).anInt9169 = i_0_;
		((Class157_Sub2) this).anInt9170 = i_1_;
		((Class157_Sub2) this).anInt9171 = i_2_;
	    }
	} else if (i == 1) {
	    i_0_ <<= 4;
	    i_1_ <<= 4;
	    i_2_ <<= 4;
	    if (!((Class157_Sub2) this).aBool9168) {
		for (int i_12_ = 0; i_12_ < ((Class157_Sub2) this).anInt9135;
		     i_12_++) {
		    ((Class157_Sub2) this).anIntArray9203[i_12_] <<= 4;
		    ((Class157_Sub2) this).anIntArray9204[i_12_] <<= 4;
		    ((Class157_Sub2) this).anIntArray9177[i_12_] <<= 4;
		}
		((Class157_Sub2) this).aBool9168 = true;
	    }
	    for (int i_13_ = 0; i_13_ < i_4_; i_13_++) {
		int i_14_ = is[i_13_];
		if (i_14_
		    < ((Class157_Sub2) this).anIntArrayArray9165.length) {
		    int[] is_15_
			= ((Class157_Sub2) this).anIntArrayArray9165[i_14_];
		    for (int i_16_ = 0; i_16_ < is_15_.length; i_16_++) {
			int i_17_ = is_15_[i_16_];
			((Class157_Sub2) this).anIntArray9203[i_17_] += i_0_;
			((Class157_Sub2) this).anIntArray9204[i_17_] += i_1_;
			((Class157_Sub2) this).anIntArray9177[i_17_] += i_2_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_18_ = 0; i_18_ < i_4_; i_18_++) {
		int i_19_ = is[i_18_];
		if (i_19_
		    < ((Class157_Sub2) this).anIntArrayArray9165.length) {
		    int[] is_20_
			= ((Class157_Sub2) this).anIntArrayArray9165[i_19_];
		    if ((i_3_ & 0x1) == 0) {
			for (int i_21_ = 0; i_21_ < is_20_.length; i_21_++) {
			    int i_22_ = is_20_[i_21_];
			    ((Class157_Sub2) this).anIntArray9203[i_22_]
				-= ((Class157_Sub2) this).anInt9169;
			    ((Class157_Sub2) this).anIntArray9204[i_22_]
				-= ((Class157_Sub2) this).anInt9170;
			    ((Class157_Sub2) this).anIntArray9177[i_22_]
				-= ((Class157_Sub2) this).anInt9171;
			    if (i_2_ != 0) {
				int i_23_ = Class417.anIntArray4766[i_2_];
				int i_24_ = Class417.anIntArray4767[i_2_];
				int i_25_ = ((((Class157_Sub2) this)
					      .anIntArray9204[i_22_]) * i_23_
					     + (((Class157_Sub2) this)
						.anIntArray9203[i_22_]) * i_24_
					     + 16383) >> 14;
				((Class157_Sub2) this).anIntArray9204[i_22_]
				    = ((((Class157_Sub2) this).anIntArray9204
					[i_22_]) * i_24_
				       - (((Class157_Sub2) this).anIntArray9203
					  [i_22_]) * i_23_
				       + 16383) >> 14;
				((Class157_Sub2) this).anIntArray9203[i_22_]
				    = i_25_;
			    }
			    if (i_0_ != 0) {
				int i_26_ = Class417.anIntArray4766[i_0_];
				int i_27_ = Class417.anIntArray4767[i_0_];
				int i_28_ = ((((Class157_Sub2) this)
					      .anIntArray9204[i_22_]) * i_27_
					     - (((Class157_Sub2) this)
						.anIntArray9177[i_22_]) * i_26_
					     + 16383) >> 14;
				((Class157_Sub2) this).anIntArray9177[i_22_]
				    = ((((Class157_Sub2) this).anIntArray9204
					[i_22_]) * i_26_
				       + (((Class157_Sub2) this).anIntArray9177
					  [i_22_]) * i_27_
				       + 16383) >> 14;
				((Class157_Sub2) this).anIntArray9204[i_22_]
				    = i_28_;
			    }
			    if (i_1_ != 0) {
				int i_29_ = Class417.anIntArray4766[i_1_];
				int i_30_ = Class417.anIntArray4767[i_1_];
				int i_31_ = ((((Class157_Sub2) this)
					      .anIntArray9177[i_22_]) * i_29_
					     + (((Class157_Sub2) this)
						.anIntArray9203[i_22_]) * i_30_
					     + 16383) >> 14;
				((Class157_Sub2) this).anIntArray9177[i_22_]
				    = ((((Class157_Sub2) this).anIntArray9177
					[i_22_]) * i_30_
				       - (((Class157_Sub2) this).anIntArray9203
					  [i_22_]) * i_29_
				       + 16383) >> 14;
				((Class157_Sub2) this).anIntArray9203[i_22_]
				    = i_31_;
			    }
			    ((Class157_Sub2) this).anIntArray9203[i_22_]
				+= ((Class157_Sub2) this).anInt9169;
			    ((Class157_Sub2) this).anIntArray9204[i_22_]
				+= ((Class157_Sub2) this).anInt9170;
			    ((Class157_Sub2) this).anIntArray9177[i_22_]
				+= ((Class157_Sub2) this).anInt9171;
			}
		    } else {
			for (int i_32_ = 0; i_32_ < is_20_.length; i_32_++) {
			    int i_33_ = is_20_[i_32_];
			    ((Class157_Sub2) this).anIntArray9203[i_33_]
				-= ((Class157_Sub2) this).anInt9169;
			    ((Class157_Sub2) this).anIntArray9204[i_33_]
				-= ((Class157_Sub2) this).anInt9170;
			    ((Class157_Sub2) this).anIntArray9177[i_33_]
				-= ((Class157_Sub2) this).anInt9171;
			    if (i_0_ != 0) {
				int i_34_ = Class417.anIntArray4766[i_0_];
				int i_35_ = Class417.anIntArray4767[i_0_];
				int i_36_ = ((((Class157_Sub2) this)
					      .anIntArray9204[i_33_]) * i_35_
					     - (((Class157_Sub2) this)
						.anIntArray9177[i_33_]) * i_34_
					     + 16383) >> 14;
				((Class157_Sub2) this).anIntArray9177[i_33_]
				    = ((((Class157_Sub2) this).anIntArray9204
					[i_33_]) * i_34_
				       + (((Class157_Sub2) this).anIntArray9177
					  [i_33_]) * i_35_
				       + 16383) >> 14;
				((Class157_Sub2) this).anIntArray9204[i_33_]
				    = i_36_;
			    }
			    if (i_2_ != 0) {
				int i_37_ = Class417.anIntArray4766[i_2_];
				int i_38_ = Class417.anIntArray4767[i_2_];
				int i_39_ = ((((Class157_Sub2) this)
					      .anIntArray9204[i_33_]) * i_37_
					     + (((Class157_Sub2) this)
						.anIntArray9203[i_33_]) * i_38_
					     + 16383) >> 14;
				((Class157_Sub2) this).anIntArray9204[i_33_]
				    = ((((Class157_Sub2) this).anIntArray9204
					[i_33_]) * i_38_
				       - (((Class157_Sub2) this).anIntArray9203
					  [i_33_]) * i_37_
				       + 16383) >> 14;
				((Class157_Sub2) this).anIntArray9203[i_33_]
				    = i_39_;
			    }
			    if (i_1_ != 0) {
				int i_40_ = Class417.anIntArray4766[i_1_];
				int i_41_ = Class417.anIntArray4767[i_1_];
				int i_42_ = ((((Class157_Sub2) this)
					      .anIntArray9177[i_33_]) * i_40_
					     + (((Class157_Sub2) this)
						.anIntArray9203[i_33_]) * i_41_
					     + 16383) >> 14;
				((Class157_Sub2) this).anIntArray9177[i_33_]
				    = ((((Class157_Sub2) this).anIntArray9177
					[i_33_]) * i_41_
				       - (((Class157_Sub2) this).anIntArray9203
					  [i_33_]) * i_40_
				       + 16383) >> 14;
				((Class157_Sub2) this).anIntArray9203[i_33_]
				    = i_42_;
			    }
			    ((Class157_Sub2) this).anIntArray9203[i_33_]
				+= ((Class157_Sub2) this).anInt9169;
			    ((Class157_Sub2) this).anIntArray9204[i_33_]
				+= ((Class157_Sub2) this).anInt9170;
			    ((Class157_Sub2) this).anIntArray9177[i_33_]
				+= ((Class157_Sub2) this).anInt9171;
			}
		    }
		}
	    }
	} else if (i == 3) {
	    for (int i_43_ = 0; i_43_ < i_4_; i_43_++) {
		int i_44_ = is[i_43_];
		if (i_44_
		    < ((Class157_Sub2) this).anIntArrayArray9165.length) {
		    int[] is_45_
			= ((Class157_Sub2) this).anIntArrayArray9165[i_44_];
		    for (int i_46_ = 0; i_46_ < is_45_.length; i_46_++) {
			int i_47_ = is_45_[i_46_];
			((Class157_Sub2) this).anIntArray9203[i_47_]
			    -= ((Class157_Sub2) this).anInt9169;
			((Class157_Sub2) this).anIntArray9204[i_47_]
			    -= ((Class157_Sub2) this).anInt9170;
			((Class157_Sub2) this).anIntArray9177[i_47_]
			    -= ((Class157_Sub2) this).anInt9171;
			((Class157_Sub2) this).anIntArray9203[i_47_]
			    = (((Class157_Sub2) this).anIntArray9203[i_47_]
			       * i_0_ / 128);
			((Class157_Sub2) this).anIntArray9204[i_47_]
			    = (((Class157_Sub2) this).anIntArray9204[i_47_]
			       * i_1_ / 128);
			((Class157_Sub2) this).anIntArray9177[i_47_]
			    = (((Class157_Sub2) this).anIntArray9177[i_47_]
			       * i_2_ / 128);
			((Class157_Sub2) this).anIntArray9203[i_47_]
			    += ((Class157_Sub2) this).anInt9169;
			((Class157_Sub2) this).anIntArray9204[i_47_]
			    += ((Class157_Sub2) this).anInt9170;
			((Class157_Sub2) this).anIntArray9177[i_47_]
			    += ((Class157_Sub2) this).anInt9171;
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class157_Sub2) this).anIntArrayArray9166 != null
		&& ((Class157_Sub2) this).aByteArray9160 != null) {
		for (int i_48_ = 0; i_48_ < i_4_; i_48_++) {
		    int i_49_ = is[i_48_];
		    if (i_49_
			< ((Class157_Sub2) this).anIntArrayArray9166.length) {
			int[] is_50_ = (((Class157_Sub2) this)
					.anIntArrayArray9166[i_49_]);
			for (int i_51_ = 0; i_51_ < is_50_.length; i_51_++) {
			    int i_52_ = is_50_[i_51_];
			    int i_53_
				= (((Class157_Sub2) this).aByteArray9160[i_52_]
				   & 0xff) + i_0_ * 8;
			    if (i_53_ < 0)
				i_53_ = 0;
			    else if (i_53_ > 255)
				i_53_ = 255;
			    ((Class157_Sub2) this).aByteArray9160[i_52_]
				= (byte) i_53_;
			}
		    }
		}
		if (((Class157_Sub2) this).aClass90Array9156 != null) {
		    for (int i_54_ = 0;
			 i_54_ < ((Class157_Sub2) this).anInt9175; i_54_++) {
			Class90 class90
			    = ((Class157_Sub2) this).aClass90Array9156[i_54_];
			Class108 class108
			    = ((Class157_Sub2) this).aClass108Array9123[i_54_];
			((Class108) class108).anInt1368
			    = ((((Class108) class108).anInt1368 * -1351793475
				& 0xffffff)
			       | 255 - ((((Class157_Sub2) this).aByteArray9160
					 [(((Class90) class90).anInt1142
					   * 1037728387)])
					& 0xff) << 24) * 323344021;
		    }
		}
	    }
	} else if (i == 7) {
	    if (((Class157_Sub2) this).anIntArrayArray9166 != null) {
		for (int i_55_ = 0; i_55_ < i_4_; i_55_++) {
		    int i_56_ = is[i_55_];
		    if (i_56_
			< ((Class157_Sub2) this).anIntArrayArray9166.length) {
			int[] is_57_ = (((Class157_Sub2) this)
					.anIntArrayArray9166[i_56_]);
			for (int i_58_ = 0; i_58_ < is_57_.length; i_58_++) {
			    int i_59_ = is_57_[i_58_];
			    int i_60_ = ((((Class157_Sub2) this)
					  .aShortArray9162[i_59_])
					 & 0xffff);
			    int i_61_ = i_60_ >> 10 & 0x3f;
			    int i_62_ = i_60_ >> 7 & 0x7;
			    int i_63_ = i_60_ & 0x7f;
			    i_61_ = i_61_ + i_0_ & 0x3f;
			    i_62_ += i_1_;
			    if (i_62_ < 0)
				i_62_ = 0;
			    else if (i_62_ > 7)
				i_62_ = 7;
			    i_63_ += i_2_;
			    if (i_63_ < 0)
				i_63_ = 0;
			    else if (i_63_ > 127)
				i_63_ = 127;
			    ((Class157_Sub2) this).aShortArray9162[i_59_]
				= (short) (i_61_ << 10 | i_62_ << 7 | i_63_);
			}
			((Class157_Sub2) this).aBool9195 = true;
		    }
		}
		if (((Class157_Sub2) this).aClass90Array9156 != null) {
		    for (int i_64_ = 0;
			 i_64_ < ((Class157_Sub2) this).anInt9175; i_64_++) {
			Class90 class90
			    = ((Class157_Sub2) this).aClass90Array9156[i_64_];
			Class108 class108
			    = ((Class157_Sub2) this).aClass108Array9123[i_64_];
			((Class108) class108).anInt1368
			    = (((((Class108) class108).anInt1368 * -1351793475
				 & ~0xffffff)
				| (Class72.anIntArray777
				   [(Class516.method6283
				     ((((Class157_Sub2) this).aShortArray9162
				       [(((Class90) class90).anInt1142
					 * 1037728387)]) & 0xffff,
				      515814180)) & 0xffff]) & 0xffffff)
			       * 323344021);
		    }
		}
	    }
	} else if (i == 8) {
	    if (((Class157_Sub2) this).anIntArrayArray9178 != null) {
		for (int i_65_ = 0; i_65_ < i_4_; i_65_++) {
		    int i_66_ = is[i_65_];
		    if (i_66_
			< ((Class157_Sub2) this).anIntArrayArray9178.length) {
			int[] is_67_ = (((Class157_Sub2) this)
					.anIntArrayArray9178[i_66_]);
			for (int i_68_ = 0; i_68_ < is_67_.length; i_68_++) {
			    Class108 class108
				= (((Class157_Sub2) this).aClass108Array9123
				   [is_67_[i_68_]]);
			    ((Class108) class108).anInt1365
				+= i_0_ * -731787657;
			    ((Class108) class108).anInt1366
				+= i_1_ * 1335672291;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class157_Sub2) this).anIntArrayArray9178 != null) {
		for (int i_69_ = 0; i_69_ < i_4_; i_69_++) {
		    int i_70_ = is[i_69_];
		    if (i_70_
			< ((Class157_Sub2) this).anIntArrayArray9178.length) {
			int[] is_71_ = (((Class157_Sub2) this)
					.anIntArrayArray9178[i_70_]);
			for (int i_72_ = 0; i_72_ < is_71_.length; i_72_++) {
			    Class108 class108
				= (((Class157_Sub2) this).aClass108Array9123
				   [is_71_[i_72_]]);
			    ((Class108) class108).aFloat1363
				= (((Class108) class108).aFloat1363
				   * (float) i_0_ / 128.0F);
			    ((Class108) class108).aFloat1364
				= (((Class108) class108).aFloat1364
				   * (float) i_1_ / 128.0F);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class157_Sub2) this).anIntArrayArray9178 != null) {
		for (int i_73_ = 0; i_73_ < i_4_; i_73_++) {
		    int i_74_ = is[i_73_];
		    if (i_74_
			< ((Class157_Sub2) this).anIntArrayArray9178.length) {
			int[] is_75_ = (((Class157_Sub2) this)
					.anIntArrayArray9178[i_74_]);
			for (int i_76_ = 0; i_76_ < is_75_.length; i_76_++) {
			    Class108 class108
				= (((Class157_Sub2) this).aClass108Array9123
				   [is_75_[i_76_]]);
			    ((Class108) class108).anInt1367
				= ((((Class108) class108).anInt1367 * 337890173
				    + i_0_)
				   & 0x3fff) * 1644905941;
			}
		    }
		}
	    }
	}
    }
    
    void method8400() {
	if (((Class157_Sub2) this).anInt9152 == 0
	    && ((Class157_Sub2) this).aClass103Array9141 == null) {
	    if ((((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
		 .anInt9745) * -1585405167
		> 1) {
		synchronized (this) {
		    method8435();
		}
	    } else
		method8435();
	}
    }
    
    void method8401(Class107 class107) {
	((Class157_Sub2) this).aClass121_9200
	    = ((Class107) class107).aClass121_1330;
	if (class107 != ((Class157_Sub2) this).aClass107_9121) {
	    ((Class157_Sub2) this).aClass107_9121 = class107;
	    ((Class157_Sub2) this).anIntArray9174
		= (((Class107) ((Class157_Sub2) this).aClass107_9121)
		   .anIntArray1334);
	    ((Class157_Sub2) this).aFloatArray9126
		= (((Class107) ((Class157_Sub2) this).aClass107_9121)
		   .aFloatArray1317);
	    ((Class157_Sub2) this).aFloatArray9119
		= (((Class107) ((Class157_Sub2) this).aClass107_9121)
		   .aFloatArray1316);
	    ((Class157_Sub2) this).aFloatArray9137
		= (((Class107) ((Class157_Sub2) this).aClass107_9121)
		   .aFloatArray1332);
	    ((Class157_Sub2) this).aFloatArray9197
		= (((Class107) ((Class157_Sub2) this).aClass107_9121)
		   .aFloatArray1338);
	    ((Class157_Sub2) this).anIntArray9173
		= (((Class107) ((Class157_Sub2) this).aClass107_9121)
		   .anIntArray1339);
	    ((Class157_Sub2) this).anIntArray9155
		= (((Class107) ((Class157_Sub2) this).aClass107_9121)
		   .anIntArray1340);
	    ((Class157_Sub2) this).anIntArray9194
		= (((Class107) ((Class157_Sub2) this).aClass107_9121)
		   .anIntArray1337);
	    ((Class157_Sub2) this).anIntArray9201
		= (((Class107) ((Class157_Sub2) this).aClass107_9121)
		   .anIntArray1328);
	    ((Class157_Sub2) this).anIntArray9202
		= (((Class107) ((Class157_Sub2) this).aClass107_9121)
		   .anIntArray1343);
	    ((Class157_Sub2) this).anIntArray9193
		= (((Class107) ((Class157_Sub2) this).aClass107_9121)
		   .anIntArray1335);
	}
    }
    
    void method8402(boolean bool) {
	if ((((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
	     .anInt9745) * -1585405167
	    > 1) {
	    synchronized (this) {
		method8403(bool);
	    }
	} else
	    method8403(bool);
    }
    
    void method8403(boolean bool) {
	if (((Class157_Sub2) this).anInt9152 == 1)
	    method8406();
	else if (((Class157_Sub2) this).anInt9152 == 2) {
	    if ((((Class157_Sub2) this).anInt9132 & 0x97098) == 0
		&& ((Class157_Sub2) this).aFloatArrayArray9157 == null)
		((Class157_Sub2) this).aShortArray9162 = null;
	    if (bool)
		((Class157_Sub2) this).aByteArray9158 = null;
	} else {
	    method8400();
	    int i
		= (((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
		   .anInt9727) * 911244877;
	    int i_77_
		= (((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
		   .anInt9728) * -949467139;
	    int i_78_
		= (((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
		   .anInt9729) * -1327222113;
	    int i_79_
		= (((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
		   .anInt9732) * -868495557 >> 8;
	    int i_80_ = 0;
	    int i_81_ = 0;
	    if (((Class157_Sub2) this).anInt9134 != 0) {
		i_80_ = (((Class173_Sub3)
			  ((Class157_Sub2) this).aClass173_Sub3_9130).anInt9749
			 * 220487424 / ((Class157_Sub2) this).anInt9134);
		i_81_ = (((Class173_Sub3)
			  ((Class157_Sub2) this).aClass173_Sub3_9130).anInt9755
			 * -53634304 / ((Class157_Sub2) this).anInt9134);
	    }
	    if (((Class157_Sub2) this).anIntArray9150 == null) {
		((Class157_Sub2) this).anIntArray9150
		    = new int[((Class157_Sub2) this).anInt9143];
		((Class157_Sub2) this).anIntArray9151
		    = new int[((Class157_Sub2) this).anInt9143];
		((Class157_Sub2) this).anIntArray9188
		    = new int[((Class157_Sub2) this).anInt9143];
	    }
	    for (int i_82_ = 0; i_82_ < ((Class157_Sub2) this).anInt9143;
		 i_82_++) {
		byte i_83_;
		if (((Class157_Sub2) this).aByteArray9158 == null)
		    i_83_ = (byte) 0;
		else
		    i_83_ = ((Class157_Sub2) this).aByteArray9158[i_82_];
		byte i_84_;
		if (((Class157_Sub2) this).aByteArray9160 == null)
		    i_84_ = (byte) 0;
		else
		    i_84_ = ((Class157_Sub2) this).aByteArray9160[i_82_];
		short i_85_;
		if (((Class157_Sub2) this).aShortArray9205 == null)
		    i_85_ = (short) -1;
		else
		    i_85_ = ((Class157_Sub2) this).aShortArray9205[i_82_];
		if (i_84_ == -2)
		    i_83_ = (byte) 3;
		if (i_84_ == -1)
		    i_83_ = (byte) 2;
		if (i_85_ == -1) {
		    if (i_83_ == 0) {
			int i_86_
			    = (((Class157_Sub2) this).aShortArray9162[i_82_]
			       & 0xffff);
			int i_87_ = (((i_86_ & 0x7f)
				      * ((Class157_Sub2) this).anInt9133)
				     >> 7);
			short i_88_
			    = Class516.method6283(i_86_ & ~0x7f | i_87_,
						  515814180);
			Class103 class103;
			if (((Class157_Sub2) this).aClass103Array9142 != null
			    && (((Class157_Sub2) this).aClass103Array9142
				[(((Class157_Sub2) this).aShortArray9145
				  [i_82_])]) != null)
			    class103
				= (((Class157_Sub2) this).aClass103Array9142
				   [(((Class157_Sub2) this).aShortArray9145
				     [i_82_])]);
			else
			    class103
				= (((Class157_Sub2) this).aClass103Array9141
				   [(((Class157_Sub2) this).aShortArray9145
				     [i_82_])]);
			int i_89_
			    = (((i * ((Class103) class103).anInt1300
				 + i_77_ * ((Class103) class103).anInt1301
				 + i_78_ * ((Class103) class103).anInt1299)
				/ ((Class103) class103).anInt1302)
			       >> 16);
			int i_90_ = i_89_ > 256 ? i_80_ : i_81_;
			int i_91_ = (i_79_ >> 1) + (i_90_ * i_89_ >> 17);
			((Class157_Sub2) this).anIntArray9150[i_82_]
			    = i_91_ << 17 | PlayerModel.method7300(i_88_, i_91_,
								(byte) -119);
			if (((Class157_Sub2) this).aClass103Array9142 != null
			    && (((Class157_Sub2) this).aClass103Array9142
				[(((Class157_Sub2) this).aShortArray9146
				  [i_82_])]) != null)
			    class103
				= (((Class157_Sub2) this).aClass103Array9142
				   [(((Class157_Sub2) this).aShortArray9146
				     [i_82_])]);
			else
			    class103
				= (((Class157_Sub2) this).aClass103Array9141
				   [(((Class157_Sub2) this).aShortArray9146
				     [i_82_])]);
			i_89_ = ((i * ((Class103) class103).anInt1300
				  + i_77_ * ((Class103) class103).anInt1301
				  + i_78_ * ((Class103) class103).anInt1299)
				 / ((Class103) class103).anInt1302) >> 16;
			i_90_ = i_89_ > 256 ? i_80_ : i_81_;
			i_91_ = (i_79_ >> 1) + (i_90_ * i_89_ >> 17);
			((Class157_Sub2) this).anIntArray9151[i_82_]
			    = i_91_ << 17 | PlayerModel.method7300(i_88_, i_91_,
								(byte) -8);
			if (((Class157_Sub2) this).aClass103Array9142 != null
			    && (((Class157_Sub2) this).aClass103Array9142
				[(((Class157_Sub2) this).aShortArray9147
				  [i_82_])]) != null)
			    class103
				= (((Class157_Sub2) this).aClass103Array9142
				   [(((Class157_Sub2) this).aShortArray9147
				     [i_82_])]);
			else
			    class103
				= (((Class157_Sub2) this).aClass103Array9141
				   [(((Class157_Sub2) this).aShortArray9147
				     [i_82_])]);
			i_89_ = ((i * ((Class103) class103).anInt1300
				  + i_77_ * ((Class103) class103).anInt1301
				  + i_78_ * ((Class103) class103).anInt1299)
				 / ((Class103) class103).anInt1302) >> 16;
			i_90_ = i_89_ > 256 ? i_80_ : i_81_;
			i_91_ = (i_79_ >> 1) + (i_90_ * i_89_ >> 17);
			((Class157_Sub2) this).anIntArray9188[i_82_]
			    = i_91_ << 17 | PlayerModel.method7300(i_88_, i_91_,
								(byte) -41);
		    } else if (i_83_ == 1) {
			int i_92_
			    = (((Class157_Sub2) this).aShortArray9162[i_82_]
			       & 0xffff);
			int i_93_ = (((i_92_ & 0x7f)
				      * ((Class157_Sub2) this).anInt9133)
				     >> 7);
			short i_94_
			    = Class516.method6283(i_92_ & ~0x7f | i_93_,
						  515814180);
			Class104 class104
			    = ((Class157_Sub2) this).aClass104Array9196[i_82_];
			int i_95_
			    = ((i * ((Class104) class104).anInt1305
				+ i_77_ * ((Class104) class104).anInt1306
				+ i_78_ * ((Class104) class104).anInt1307)
			       >> 16);
			int i_96_ = i_95_ > 256 ? i_80_ : i_81_;
			int i_97_ = (i_79_ >> 1) + (i_96_ * i_95_ >> 17);
			((Class157_Sub2) this).anIntArray9150[i_82_]
			    = i_97_ << 17 | PlayerModel.method7300(i_94_, i_97_,
								(byte) -36);
			((Class157_Sub2) this).anIntArray9188[i_82_] = -1;
		    } else if (i_83_ == 3) {
			((Class157_Sub2) this).anIntArray9150[i_82_] = 128;
			((Class157_Sub2) this).anIntArray9188[i_82_] = -1;
		    } else
			((Class157_Sub2) this).anIntArray9188[i_82_] = -2;
		} else {
		    int i_98_ = (((Class157_Sub2) this).aShortArray9162[i_82_]
				 & 0xffff);
		    if (i_83_ == 0) {
			Class103 class103;
			if (((Class157_Sub2) this).aClass103Array9142 != null
			    && (((Class157_Sub2) this).aClass103Array9142
				[(((Class157_Sub2) this).aShortArray9145
				  [i_82_])]) != null)
			    class103
				= (((Class157_Sub2) this).aClass103Array9142
				   [(((Class157_Sub2) this).aShortArray9145
				     [i_82_])]);
			else
			    class103
				= (((Class157_Sub2) this).aClass103Array9141
				   [(((Class157_Sub2) this).aShortArray9145
				     [i_82_])]);
			int i_99_
			    = (((i * ((Class103) class103).anInt1300
				 + i_77_ * ((Class103) class103).anInt1301
				 + i_78_ * ((Class103) class103).anInt1299)
				/ ((Class103) class103).anInt1302)
			       >> 16);
			int i_100_ = i_99_ > 256 ? i_80_ : i_81_;
			int i_101_ = method8405((i_79_ >> 2) + (i_100_ * i_99_
								>> 18));
			((Class157_Sub2) this).anIntArray9150[i_82_]
			    = i_101_ << 24 | method8429(i_98_, i_85_, i_101_);
			if (((Class157_Sub2) this).aClass103Array9142 != null
			    && (((Class157_Sub2) this).aClass103Array9142
				[(((Class157_Sub2) this).aShortArray9146
				  [i_82_])]) != null)
			    class103
				= (((Class157_Sub2) this).aClass103Array9142
				   [(((Class157_Sub2) this).aShortArray9146
				     [i_82_])]);
			else
			    class103
				= (((Class157_Sub2) this).aClass103Array9141
				   [(((Class157_Sub2) this).aShortArray9146
				     [i_82_])]);
			i_99_ = ((i * ((Class103) class103).anInt1300
				  + i_77_ * ((Class103) class103).anInt1301
				  + i_78_ * ((Class103) class103).anInt1299)
				 / ((Class103) class103).anInt1302) >> 16;
			i_100_ = i_99_ > 256 ? i_80_ : i_81_;
			i_101_ = method8405((i_79_ >> 2) + (i_100_ * i_99_
							    >> 18));
			((Class157_Sub2) this).anIntArray9151[i_82_]
			    = i_101_ << 24 | method8429(i_98_, i_85_, i_101_);
			if (((Class157_Sub2) this).aClass103Array9142 != null
			    && (((Class157_Sub2) this).aClass103Array9142
				[(((Class157_Sub2) this).aShortArray9147
				  [i_82_])]) != null)
			    class103
				= (((Class157_Sub2) this).aClass103Array9142
				   [(((Class157_Sub2) this).aShortArray9147
				     [i_82_])]);
			else
			    class103
				= (((Class157_Sub2) this).aClass103Array9141
				   [(((Class157_Sub2) this).aShortArray9147
				     [i_82_])]);
			i_99_ = ((i * ((Class103) class103).anInt1300
				  + i_77_ * ((Class103) class103).anInt1301
				  + i_78_ * ((Class103) class103).anInt1299)
				 / ((Class103) class103).anInt1302) >> 16;
			i_100_ = i_99_ > 256 ? i_80_ : i_81_;
			i_101_ = method8405((i_79_ >> 2) + (i_100_ * i_99_
							    >> 18));
			((Class157_Sub2) this).anIntArray9188[i_82_]
			    = i_101_ << 24 | method8429(i_98_, i_85_, i_101_);
		    } else if (i_83_ == 1) {
			Class104 class104
			    = ((Class157_Sub2) this).aClass104Array9196[i_82_];
			int i_102_
			    = ((i * ((Class104) class104).anInt1305
				+ i_77_ * ((Class104) class104).anInt1306
				+ i_78_ * ((Class104) class104).anInt1307)
			       >> 16);
			int i_103_ = i_102_ > 256 ? i_80_ : i_81_;
			int i_104_ = method8405((i_79_ >> 2) + (i_103_ * i_102_
								>> 18));
			((Class157_Sub2) this).anIntArray9150[i_82_]
			    = i_104_ << 24 | method8429(i_98_, i_85_, i_104_);
			((Class157_Sub2) this).anIntArray9188[i_82_] = -1;
		    } else
			((Class157_Sub2) this).anIntArray9188[i_82_] = -2;
		}
	    }
	    ((Class157_Sub2) this).aClass103Array9141 = null;
	    ((Class157_Sub2) this).aClass103Array9142 = null;
	    ((Class157_Sub2) this).aClass104Array9196 = null;
	    if ((((Class157_Sub2) this).anInt9132 & 0x97098) == 0
		&& ((Class157_Sub2) this).aFloatArrayArray9157 == null)
		((Class157_Sub2) this).aShortArray9162 = null;
	    if (bool)
		((Class157_Sub2) this).aByteArray9158 = null;
	    ((Class157_Sub2) this).anInt9152 = 2;
	}
    }
    
    int method8404(int i, int i_105_) {
	i_105_ = i_105_ * (i & 0x7f) >> 7;
	if (i_105_ < 2)
	    i_105_ = 2;
	else if (i_105_ > 126)
	    i_105_ = 126;
	return (i & 0xff80) + i_105_;
    }
    
    int method8405(int i) {
	if (i < 2)
	    i = 2;
	else if (i > 126)
	    i = 126;
	return i;
    }
    
    void method8406() {
	if (((Class157_Sub2) this).anInt9152 == 0)
	    method8402(false);
	else if ((((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
		  .anInt9745) * -1585405167
		 > 1) {
	    synchronized (this) {
		method8407();
	    }
	} else
	    method8407();
    }
    
    void method8407() {
	for (int i = 0; i < ((Class157_Sub2) this).anInt9143; i++) {
	    short i_106_
		= (((Class157_Sub2) this).aShortArray9205 != null
		   ? ((Class157_Sub2) this).aShortArray9205[i] : (short) -1);
	    if (i_106_ == -1) {
		int i_107_
		    = ((Class157_Sub2) this).aShortArray9162[i] & 0xffff;
		int i_108_
		    = (i_107_ & 0x7f) * ((Class157_Sub2) this).anInt9133 >> 7;
		short i_109_
		    = Class516.method6283(i_107_ & ~0x7f | i_108_, 515814180);
		if (((Class157_Sub2) this).anIntArray9188[i] == -1) {
		    int i_110_
			= ((Class157_Sub2) this).anIntArray9150[i] & ~0x1ffff;
		    ((Class157_Sub2) this).anIntArray9150[i]
			= i_110_ | PlayerModel.method7300(i_109_, i_110_ >> 17,
						       (byte) -43);
		} else if (((Class157_Sub2) this).anIntArray9188[i] != -2) {
		    int i_111_
			= ((Class157_Sub2) this).anIntArray9150[i] & ~0x1ffff;
		    ((Class157_Sub2) this).anIntArray9150[i]
			= i_111_ | PlayerModel.method7300(i_109_, i_111_ >> 17,
						       (byte) 14);
		    i_111_
			= ((Class157_Sub2) this).anIntArray9151[i] & ~0x1ffff;
		    ((Class157_Sub2) this).anIntArray9151[i]
			= i_111_ | PlayerModel.method7300(i_109_, i_111_ >> 17,
						       (byte) 5);
		    i_111_
			= ((Class157_Sub2) this).anIntArray9188[i] & ~0x1ffff;
		    ((Class157_Sub2) this).anIntArray9188[i]
			= i_111_ | PlayerModel.method7300(i_109_, i_111_ >> 17,
						       (byte) -36);
		}
	    }
	}
	((Class157_Sub2) this).anInt9152 = 2;
    }
    
    public void method1872(Class157 class157, int i, int i_112_, int i_113_,
			   boolean bool) {
	Class157_Sub2 class157_sub2_114_ = (Class157_Sub2) class157;
	if ((((Class157_Sub2) this).anInt9132 & 0x10000) != 65536)
	    throw new IllegalStateException("");
	if ((((Class157_Sub2) class157_sub2_114_).anInt9132 & 0x10000)
	    != 65536)
	    throw new IllegalStateException("");
	method8401(((Class157_Sub2) this).aClass173_Sub3_9130
		       .method8939(Thread.currentThread()));
	method8420();
	method8400();
	class157_sub2_114_.method8420();
	class157_sub2_114_.method8400();
	anInt9192++;
	int i_115_ = 0;
	int[] is = ((Class157_Sub2) class157_sub2_114_).anIntArray9203;
	int i_116_ = ((Class157_Sub2) class157_sub2_114_).anInt9136;
	for (int i_117_ = 0; i_117_ < ((Class157_Sub2) this).anInt9136;
	     i_117_++) {
	    Class103 class103
		= ((Class157_Sub2) this).aClass103Array9141[i_117_];
	    if (((Class103) class103).anInt1302 != 0) {
		int i_118_
		    = ((Class157_Sub2) this).anIntArray9204[i_117_] - i_112_;
		if (i_118_ >= ((Class157_Sub2) class157_sub2_114_).aShort9182
		    && (i_118_
			<= ((Class157_Sub2) class157_sub2_114_).aShort9183)) {
		    int i_119_
			= ((Class157_Sub2) this).anIntArray9203[i_117_] - i;
		    if ((i_119_
			 >= ((Class157_Sub2) class157_sub2_114_).aShort9184)
			&& i_119_ <= (((Class157_Sub2) class157_sub2_114_)
				      .aShort9185)) {
			int i_120_
			    = (((Class157_Sub2) this).anIntArray9177[i_117_]
			       - i_113_);
			if (i_120_ >= (((Class157_Sub2) class157_sub2_114_)
				       .aShort9186)
			    && i_120_ <= (((Class157_Sub2) class157_sub2_114_)
					  .aShort9144)) {
			    for (int i_121_ = 0; i_121_ < i_116_; i_121_++) {
				Class103 class103_122_
				    = (((Class157_Sub2) class157_sub2_114_)
				       .aClass103Array9141[i_121_]);
				if (i_119_ == is[i_121_]
				    && i_120_ == (((Class157_Sub2)
						   class157_sub2_114_)
						  .anIntArray9177[i_121_])
				    && i_118_ == (((Class157_Sub2)
						   class157_sub2_114_)
						  .anIntArray9204[i_121_])
				    && (((Class103) class103_122_).anInt1302
					!= 0)) {
				    if ((((Class157_Sub2) this)
					 .aClass103Array9142)
					== null)
					((Class157_Sub2) this)
					    .aClass103Array9142
					    = new Class103[((Class157_Sub2)
							    this).anInt9136];
				    if ((((Class157_Sub2) class157_sub2_114_)
					 .aClass103Array9142)
					== null)
					((Class157_Sub2) class157_sub2_114_)
					    .aClass103Array9142
					    = new Class103[i_116_];
				    Class103 class103_123_
					= (((Class157_Sub2) this)
					   .aClass103Array9142[i_117_]);
				    if (class103_123_ == null)
					class103_123_
					    = ((Class157_Sub2) this)
						  .aClass103Array9142[i_117_]
					    = new Class103(class103);
				    Class103 class103_124_
					= (((Class157_Sub2) class157_sub2_114_)
					   .aClass103Array9142[i_121_]);
				    if (class103_124_ == null)
					class103_124_
					    = ((Class157_Sub2)
					       class157_sub2_114_)
						  .aClass103Array9142[i_121_]
					    = new Class103(class103_122_);
				    ((Class103) class103_123_).anInt1300
					+= (((Class103) class103_122_)
					    .anInt1300);
				    ((Class103) class103_123_).anInt1301
					+= (((Class103) class103_122_)
					    .anInt1301);
				    ((Class103) class103_123_).anInt1299
					+= (((Class103) class103_122_)
					    .anInt1299);
				    ((Class103) class103_123_).anInt1302
					+= (((Class103) class103_122_)
					    .anInt1302);
				    ((Class103) class103_124_).anInt1300
					+= ((Class103) class103).anInt1300;
				    ((Class103) class103_124_).anInt1301
					+= ((Class103) class103).anInt1301;
				    ((Class103) class103_124_).anInt1299
					+= ((Class103) class103).anInt1299;
				    ((Class103) class103_124_).anInt1302
					+= ((Class103) class103).anInt1302;
				    i_115_++;
				    ((Class157_Sub2) this).anIntArray9201
					[i_117_]
					= anInt9192;
				    ((Class157_Sub2) this).anIntArray9202
					[i_121_]
					= anInt9192;
				}
			    }
			}
		    }
		}
	    }
	}
	if (i_115_ >= 3 && bool) {
	    for (int i_125_ = 0; i_125_ < ((Class157_Sub2) this).anInt9143;
		 i_125_++) {
		if (((((Class157_Sub2) this).anIntArray9201
		      [((Class157_Sub2) this).aShortArray9145[i_125_]])
		     == anInt9192)
		    && ((((Class157_Sub2) this).anIntArray9201
			 [((Class157_Sub2) this).aShortArray9146[i_125_]])
			== anInt9192)
		    && ((((Class157_Sub2) this).anIntArray9201
			 [((Class157_Sub2) this).aShortArray9147[i_125_]])
			== anInt9192)) {
		    if (((Class157_Sub2) this).aByteArray9158 == null)
			((Class157_Sub2) this).aByteArray9158
			    = new byte[((Class157_Sub2) this).anInt9143];
		    ((Class157_Sub2) this).aByteArray9158[i_125_] = (byte) 2;
		}
	    }
	    for (int i_126_ = 0;
		 i_126_ < ((Class157_Sub2) class157_sub2_114_).anInt9143;
		 i_126_++) {
		if ((((Class157_Sub2) this).anIntArray9202
		     [(((Class157_Sub2) class157_sub2_114_).aShortArray9145
		       [i_126_])]) == anInt9192
		    && (((Class157_Sub2) this).anIntArray9202
			[(((Class157_Sub2) class157_sub2_114_).aShortArray9146
			  [i_126_])]) == anInt9192
		    && (((Class157_Sub2) this).anIntArray9202
			[(((Class157_Sub2) class157_sub2_114_).aShortArray9147
			  [i_126_])]) == anInt9192) {
		    if (((Class157_Sub2) class157_sub2_114_).aByteArray9158
			== null)
			((Class157_Sub2) class157_sub2_114_).aByteArray9158
			    = new byte[(((Class157_Sub2) class157_sub2_114_)
					.anInt9143)];
		    ((Class157_Sub2) class157_sub2_114_).aByteArray9158[i_126_]
			= (byte) 2;
		}
	    }
	}
    }
    
    void method1960(int i, int[] is, int i_127_, int i_128_, int i_129_,
		    boolean bool, int i_130_, int[] is_131_) {
	int i_132_ = is.length;
	if (i == 0) {
	    i_127_ <<= 4;
	    i_128_ <<= 4;
	    i_129_ <<= 4;
	    if (!((Class157_Sub2) this).aBool9168) {
		for (int i_133_ = 0; i_133_ < ((Class157_Sub2) this).anInt9135;
		     i_133_++) {
		    ((Class157_Sub2) this).anIntArray9203[i_133_] <<= 4;
		    ((Class157_Sub2) this).anIntArray9204[i_133_] <<= 4;
		    ((Class157_Sub2) this).anIntArray9177[i_133_] <<= 4;
		}
		((Class157_Sub2) this).aBool9168 = true;
	    }
	    int i_134_ = 0;
	    ((Class157_Sub2) this).anInt9169 = 0;
	    ((Class157_Sub2) this).anInt9170 = 0;
	    ((Class157_Sub2) this).anInt9171 = 0;
	    for (int i_135_ = 0; i_135_ < i_132_; i_135_++) {
		int i_136_ = is[i_135_];
		if (i_136_
		    < ((Class157_Sub2) this).anIntArrayArray9165.length) {
		    int[] is_137_
			= ((Class157_Sub2) this).anIntArrayArray9165[i_136_];
		    for (int i_138_ = 0; i_138_ < is_137_.length; i_138_++) {
			int i_139_ = is_137_[i_138_];
			if (((Class157_Sub2) this).aShortArray9140 == null
			    || (i_130_ & (((Class157_Sub2) this)
					  .aShortArray9140[i_139_])) != 0) {
			    ((Class157_Sub2) this).anInt9169
				+= (((Class157_Sub2) this).anIntArray9203
				    [i_139_]);
			    ((Class157_Sub2) this).anInt9170
				+= (((Class157_Sub2) this).anIntArray9204
				    [i_139_]);
			    ((Class157_Sub2) this).anInt9171
				+= (((Class157_Sub2) this).anIntArray9177
				    [i_139_]);
			    i_134_++;
			}
		    }
		}
	    }
	    if (i_134_ > 0) {
		((Class157_Sub2) this).anInt9169
		    = ((Class157_Sub2) this).anInt9169 / i_134_ + i_127_;
		((Class157_Sub2) this).anInt9170
		    = ((Class157_Sub2) this).anInt9170 / i_134_ + i_128_;
		((Class157_Sub2) this).anInt9171
		    = ((Class157_Sub2) this).anInt9171 / i_134_ + i_129_;
		((Class157_Sub2) this).aBool9172 = true;
	    } else {
		((Class157_Sub2) this).anInt9169 = i_127_;
		((Class157_Sub2) this).anInt9170 = i_128_;
		((Class157_Sub2) this).anInt9171 = i_129_;
	    }
	} else if (i == 1) {
	    if (is_131_ != null) {
		int i_140_ = ((is_131_[0] * i_127_ + is_131_[1] * i_128_
			       + is_131_[2] * i_129_ + 8192)
			      >> 14);
		int i_141_ = ((is_131_[3] * i_127_ + is_131_[4] * i_128_
			       + is_131_[5] * i_129_ + 8192)
			      >> 14);
		int i_142_ = ((is_131_[6] * i_127_ + is_131_[7] * i_128_
			       + is_131_[8] * i_129_ + 8192)
			      >> 14);
		i_127_ = i_140_;
		i_128_ = i_141_;
		i_129_ = i_142_;
	    }
	    i_127_ <<= 4;
	    i_128_ <<= 4;
	    i_129_ <<= 4;
	    if (!((Class157_Sub2) this).aBool9168) {
		for (int i_143_ = 0; i_143_ < ((Class157_Sub2) this).anInt9135;
		     i_143_++) {
		    ((Class157_Sub2) this).anIntArray9203[i_143_] <<= 4;
		    ((Class157_Sub2) this).anIntArray9204[i_143_] <<= 4;
		    ((Class157_Sub2) this).anIntArray9177[i_143_] <<= 4;
		}
		((Class157_Sub2) this).aBool9168 = true;
	    }
	    for (int i_144_ = 0; i_144_ < i_132_; i_144_++) {
		int i_145_ = is[i_144_];
		if (i_145_
		    < ((Class157_Sub2) this).anIntArrayArray9165.length) {
		    int[] is_146_
			= ((Class157_Sub2) this).anIntArrayArray9165[i_145_];
		    for (int i_147_ = 0; i_147_ < is_146_.length; i_147_++) {
			int i_148_ = is_146_[i_147_];
			if (((Class157_Sub2) this).aShortArray9140 == null
			    || (i_130_ & (((Class157_Sub2) this)
					  .aShortArray9140[i_148_])) != 0) {
			    ((Class157_Sub2) this).anIntArray9203[i_148_]
				+= i_127_;
			    ((Class157_Sub2) this).anIntArray9204[i_148_]
				+= i_128_;
			    ((Class157_Sub2) this).anIntArray9177[i_148_]
				+= i_129_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_131_ != null) {
		if (!((Class157_Sub2) this).aBool9168) {
		    for (int i_149_ = 0;
			 i_149_ < ((Class157_Sub2) this).anInt9135; i_149_++) {
			((Class157_Sub2) this).anIntArray9203[i_149_] <<= 4;
			((Class157_Sub2) this).anIntArray9204[i_149_] <<= 4;
			((Class157_Sub2) this).anIntArray9177[i_149_] <<= 4;
		    }
		    ((Class157_Sub2) this).aBool9168 = true;
		}
		int i_150_ = is_131_[9] << 4;
		int i_151_ = is_131_[10] << 4;
		int i_152_ = is_131_[11] << 4;
		int i_153_ = is_131_[12] << 4;
		int i_154_ = is_131_[13] << 4;
		int i_155_ = is_131_[14] << 4;
		if (((Class157_Sub2) this).aBool9172) {
		    int i_156_
			= ((is_131_[0] * ((Class157_Sub2) this).anInt9169
			    + is_131_[3] * ((Class157_Sub2) this).anInt9170
			    + is_131_[6] * ((Class157_Sub2) this).anInt9171
			    + 8192)
			   >> 14);
		    int i_157_
			= ((is_131_[1] * ((Class157_Sub2) this).anInt9169
			    + is_131_[4] * ((Class157_Sub2) this).anInt9170
			    + is_131_[7] * ((Class157_Sub2) this).anInt9171
			    + 8192)
			   >> 14);
		    int i_158_
			= ((is_131_[2] * ((Class157_Sub2) this).anInt9169
			    + is_131_[5] * ((Class157_Sub2) this).anInt9170
			    + is_131_[8] * ((Class157_Sub2) this).anInt9171
			    + 8192)
			   >> 14);
		    i_156_ += i_153_;
		    i_157_ += i_154_;
		    i_158_ += i_155_;
		    ((Class157_Sub2) this).anInt9169 = i_156_;
		    ((Class157_Sub2) this).anInt9170 = i_157_;
		    ((Class157_Sub2) this).anInt9171 = i_158_;
		    ((Class157_Sub2) this).aBool9172 = false;
		}
		int[] is_159_ = new int[9];
		int i_160_ = Class417.anIntArray4767[i_127_];
		int i_161_ = Class417.anIntArray4766[i_127_];
		int i_162_ = Class417.anIntArray4767[i_128_];
		int i_163_ = Class417.anIntArray4766[i_128_];
		int i_164_ = Class417.anIntArray4767[i_129_];
		int i_165_ = Class417.anIntArray4766[i_129_];
		int i_166_ = i_161_ * i_164_ + 8192 >> 14;
		int i_167_ = i_161_ * i_165_ + 8192 >> 14;
		is_159_[0] = i_162_ * i_164_ + i_163_ * i_167_ + 8192 >> 14;
		is_159_[1] = -i_162_ * i_165_ + i_163_ * i_166_ + 8192 >> 14;
		is_159_[2] = i_163_ * i_160_ + 8192 >> 14;
		is_159_[3] = i_160_ * i_165_ + 8192 >> 14;
		is_159_[4] = i_160_ * i_164_ + 8192 >> 14;
		is_159_[5] = -i_161_;
		is_159_[6] = -i_163_ * i_164_ + i_162_ * i_167_ + 8192 >> 14;
		is_159_[7] = i_163_ * i_165_ + i_162_ * i_166_ + 8192 >> 14;
		is_159_[8] = i_162_ * i_160_ + 8192 >> 14;
		int i_168_ = ((is_159_[0] * -((Class157_Sub2) this).anInt9169
			       + is_159_[1] * -((Class157_Sub2) this).anInt9170
			       + is_159_[2] * -((Class157_Sub2) this).anInt9171
			       + 8192)
			      >> 14);
		int i_169_ = ((is_159_[3] * -((Class157_Sub2) this).anInt9169
			       + is_159_[4] * -((Class157_Sub2) this).anInt9170
			       + is_159_[5] * -((Class157_Sub2) this).anInt9171
			       + 8192)
			      >> 14);
		int i_170_ = ((is_159_[6] * -((Class157_Sub2) this).anInt9169
			       + is_159_[7] * -((Class157_Sub2) this).anInt9170
			       + is_159_[8] * -((Class157_Sub2) this).anInt9171
			       + 8192)
			      >> 14);
		int i_171_ = i_168_ + ((Class157_Sub2) this).anInt9169;
		int i_172_ = i_169_ + ((Class157_Sub2) this).anInt9170;
		int i_173_ = i_170_ + ((Class157_Sub2) this).anInt9171;
		int[] is_174_ = new int[9];
		for (int i_175_ = 0; i_175_ < 3; i_175_++) {
		    for (int i_176_ = 0; i_176_ < 3; i_176_++) {
			int i_177_ = 0;
			for (int i_178_ = 0; i_178_ < 3; i_178_++)
			    i_177_ += (is_159_[i_175_ * 3 + i_178_]
				       * is_131_[i_176_ * 3 + i_178_]);
			is_174_[i_175_ * 3 + i_176_] = i_177_ + 8192 >> 14;
		    }
		}
		int i_179_ = ((is_159_[0] * i_153_ + is_159_[1] * i_154_
			       + is_159_[2] * i_155_ + 8192)
			      >> 14);
		int i_180_ = ((is_159_[3] * i_153_ + is_159_[4] * i_154_
			       + is_159_[5] * i_155_ + 8192)
			      >> 14);
		int i_181_ = ((is_159_[6] * i_153_ + is_159_[7] * i_154_
			       + is_159_[8] * i_155_ + 8192)
			      >> 14);
		i_179_ += i_171_;
		i_180_ += i_172_;
		i_181_ += i_173_;
		int[] is_182_ = new int[9];
		for (int i_183_ = 0; i_183_ < 3; i_183_++) {
		    for (int i_184_ = 0; i_184_ < 3; i_184_++) {
			int i_185_ = 0;
			for (int i_186_ = 0; i_186_ < 3; i_186_++)
			    i_185_ += (is_131_[i_183_ * 3 + i_186_]
				       * is_174_[i_184_ + i_186_ * 3]);
			is_182_[i_183_ * 3 + i_184_] = i_185_ + 8192 >> 14;
		    }
		}
		int i_187_ = ((is_131_[0] * i_179_ + is_131_[1] * i_180_
			       + is_131_[2] * i_181_ + 8192)
			      >> 14);
		int i_188_ = ((is_131_[3] * i_179_ + is_131_[4] * i_180_
			       + is_131_[5] * i_181_ + 8192)
			      >> 14);
		int i_189_ = ((is_131_[6] * i_179_ + is_131_[7] * i_180_
			       + is_131_[8] * i_181_ + 8192)
			      >> 14);
		i_187_ += i_150_;
		i_188_ += i_151_;
		i_189_ += i_152_;
		for (int i_190_ = 0; i_190_ < i_132_; i_190_++) {
		    int i_191_ = is[i_190_];
		    if (i_191_
			< ((Class157_Sub2) this).anIntArrayArray9165.length) {
			int[] is_192_ = (((Class157_Sub2) this)
					 .anIntArrayArray9165[i_191_]);
			for (int i_193_ = 0; i_193_ < is_192_.length;
			     i_193_++) {
			    int i_194_ = is_192_[i_193_];
			    if (((Class157_Sub2) this).aShortArray9140 == null
				|| ((i_130_ & (((Class157_Sub2) this)
					       .aShortArray9140[i_194_]))
				    != 0)) {
				int i_195_
				    = (is_182_[0] * (((Class157_Sub2) this)
						     .anIntArray9203[i_194_])
				       + is_182_[1] * (((Class157_Sub2) this)
						       .anIntArray9204[i_194_])
				       + is_182_[2] * (((Class157_Sub2) this)
						       .anIntArray9177[i_194_])
				       + 8192) >> 14;
				int i_196_
				    = (is_182_[3] * (((Class157_Sub2) this)
						     .anIntArray9203[i_194_])
				       + is_182_[4] * (((Class157_Sub2) this)
						       .anIntArray9204[i_194_])
				       + is_182_[5] * (((Class157_Sub2) this)
						       .anIntArray9177[i_194_])
				       + 8192) >> 14;
				int i_197_
				    = (is_182_[6] * (((Class157_Sub2) this)
						     .anIntArray9203[i_194_])
				       + is_182_[7] * (((Class157_Sub2) this)
						       .anIntArray9204[i_194_])
				       + is_182_[8] * (((Class157_Sub2) this)
						       .anIntArray9177[i_194_])
				       + 8192) >> 14;
				i_195_ += i_187_;
				i_196_ += i_188_;
				i_197_ += i_189_;
				((Class157_Sub2) this).anIntArray9203[i_194_]
				    = i_195_;
				((Class157_Sub2) this).anIntArray9204[i_194_]
				    = i_196_;
				((Class157_Sub2) this).anIntArray9177[i_194_]
				    = i_197_;
			    }
			}
		    }
		}
	    } else {
		for (int i_198_ = 0; i_198_ < i_132_; i_198_++) {
		    int i_199_ = is[i_198_];
		    if (i_199_
			< ((Class157_Sub2) this).anIntArrayArray9165.length) {
			int[] is_200_ = (((Class157_Sub2) this)
					 .anIntArrayArray9165[i_199_]);
			for (int i_201_ = 0; i_201_ < is_200_.length;
			     i_201_++) {
			    int i_202_ = is_200_[i_201_];
			    if (((Class157_Sub2) this).aShortArray9140 == null
				|| ((i_130_ & (((Class157_Sub2) this)
					       .aShortArray9140[i_202_]))
				    != 0)) {
				((Class157_Sub2) this).anIntArray9203[i_202_]
				    -= ((Class157_Sub2) this).anInt9169;
				((Class157_Sub2) this).anIntArray9204[i_202_]
				    -= ((Class157_Sub2) this).anInt9170;
				((Class157_Sub2) this).anIntArray9177[i_202_]
				    -= ((Class157_Sub2) this).anInt9171;
				if (i_129_ != 0) {
				    int i_203_
					= Class417.anIntArray4766[i_129_];
				    int i_204_
					= Class417.anIntArray4767[i_129_];
				    int i_205_
					= ((((Class157_Sub2) this)
					    .anIntArray9204[i_202_]) * i_203_
					   + (((Class157_Sub2) this)
					      .anIntArray9203[i_202_]) * i_204_
					   + 16383) >> 14;
				    ((Class157_Sub2) this).anIntArray9204
					[i_202_]
					= ((((Class157_Sub2) this)
					    .anIntArray9204[i_202_]) * i_204_
					   - (((Class157_Sub2) this)
					      .anIntArray9203[i_202_]) * i_203_
					   + 16383) >> 14;
				    ((Class157_Sub2) this).anIntArray9203
					[i_202_]
					= i_205_;
				}
				if (i_127_ != 0) {
				    int i_206_
					= Class417.anIntArray4766[i_127_];
				    int i_207_
					= Class417.anIntArray4767[i_127_];
				    int i_208_
					= ((((Class157_Sub2) this)
					    .anIntArray9204[i_202_]) * i_207_
					   - (((Class157_Sub2) this)
					      .anIntArray9177[i_202_]) * i_206_
					   + 16383) >> 14;
				    ((Class157_Sub2) this).anIntArray9177
					[i_202_]
					= ((((Class157_Sub2) this)
					    .anIntArray9204[i_202_]) * i_206_
					   + (((Class157_Sub2) this)
					      .anIntArray9177[i_202_]) * i_207_
					   + 16383) >> 14;
				    ((Class157_Sub2) this).anIntArray9204
					[i_202_]
					= i_208_;
				}
				if (i_128_ != 0) {
				    int i_209_
					= Class417.anIntArray4766[i_128_];
				    int i_210_
					= Class417.anIntArray4767[i_128_];
				    int i_211_
					= ((((Class157_Sub2) this)
					    .anIntArray9177[i_202_]) * i_209_
					   + (((Class157_Sub2) this)
					      .anIntArray9203[i_202_]) * i_210_
					   + 16383) >> 14;
				    ((Class157_Sub2) this).anIntArray9177
					[i_202_]
					= ((((Class157_Sub2) this)
					    .anIntArray9177[i_202_]) * i_210_
					   - (((Class157_Sub2) this)
					      .anIntArray9203[i_202_]) * i_209_
					   + 16383) >> 14;
				    ((Class157_Sub2) this).anIntArray9203
					[i_202_]
					= i_211_;
				}
				((Class157_Sub2) this).anIntArray9203[i_202_]
				    += ((Class157_Sub2) this).anInt9169;
				((Class157_Sub2) this).anIntArray9204[i_202_]
				    += ((Class157_Sub2) this).anInt9170;
				((Class157_Sub2) this).anIntArray9177[i_202_]
				    += ((Class157_Sub2) this).anInt9171;
			    }
			}
		    }
		}
	    }
	} else if (i == 3) {
	    if (is_131_ != null) {
		if (!((Class157_Sub2) this).aBool9168) {
		    for (int i_212_ = 0;
			 i_212_ < ((Class157_Sub2) this).anInt9135; i_212_++) {
			((Class157_Sub2) this).anIntArray9203[i_212_] <<= 4;
			((Class157_Sub2) this).anIntArray9204[i_212_] <<= 4;
			((Class157_Sub2) this).anIntArray9177[i_212_] <<= 4;
		    }
		    ((Class157_Sub2) this).aBool9168 = true;
		}
		int i_213_ = is_131_[9] << 4;
		int i_214_ = is_131_[10] << 4;
		int i_215_ = is_131_[11] << 4;
		int i_216_ = is_131_[12] << 4;
		int i_217_ = is_131_[13] << 4;
		int i_218_ = is_131_[14] << 4;
		if (((Class157_Sub2) this).aBool9172) {
		    int i_219_
			= ((is_131_[0] * ((Class157_Sub2) this).anInt9169
			    + is_131_[3] * ((Class157_Sub2) this).anInt9170
			    + is_131_[6] * ((Class157_Sub2) this).anInt9171
			    + 8192)
			   >> 14);
		    int i_220_
			= ((is_131_[1] * ((Class157_Sub2) this).anInt9169
			    + is_131_[4] * ((Class157_Sub2) this).anInt9170
			    + is_131_[7] * ((Class157_Sub2) this).anInt9171
			    + 8192)
			   >> 14);
		    int i_221_
			= ((is_131_[2] * ((Class157_Sub2) this).anInt9169
			    + is_131_[5] * ((Class157_Sub2) this).anInt9170
			    + is_131_[8] * ((Class157_Sub2) this).anInt9171
			    + 8192)
			   >> 14);
		    i_219_ += i_216_;
		    i_220_ += i_217_;
		    i_221_ += i_218_;
		    ((Class157_Sub2) this).anInt9169 = i_219_;
		    ((Class157_Sub2) this).anInt9170 = i_220_;
		    ((Class157_Sub2) this).anInt9171 = i_221_;
		    ((Class157_Sub2) this).aBool9172 = false;
		}
		int i_222_ = i_127_ << 15 >> 7;
		int i_223_ = i_128_ << 15 >> 7;
		int i_224_ = i_129_ << 15 >> 7;
		int i_225_
		    = i_222_ * -((Class157_Sub2) this).anInt9169 + 8192 >> 14;
		int i_226_
		    = i_223_ * -((Class157_Sub2) this).anInt9170 + 8192 >> 14;
		int i_227_
		    = i_224_ * -((Class157_Sub2) this).anInt9171 + 8192 >> 14;
		int i_228_ = i_225_ + ((Class157_Sub2) this).anInt9169;
		int i_229_ = i_226_ + ((Class157_Sub2) this).anInt9170;
		int i_230_ = i_227_ + ((Class157_Sub2) this).anInt9171;
		int[] is_231_ = new int[9];
		is_231_[0] = i_222_ * is_131_[0] + 8192 >> 14;
		is_231_[1] = i_222_ * is_131_[3] + 8192 >> 14;
		is_231_[2] = i_222_ * is_131_[6] + 8192 >> 14;
		is_231_[3] = i_223_ * is_131_[1] + 8192 >> 14;
		is_231_[4] = i_223_ * is_131_[4] + 8192 >> 14;
		is_231_[5] = i_223_ * is_131_[7] + 8192 >> 14;
		is_231_[6] = i_224_ * is_131_[2] + 8192 >> 14;
		is_231_[7] = i_224_ * is_131_[5] + 8192 >> 14;
		is_231_[8] = i_224_ * is_131_[8] + 8192 >> 14;
		int i_232_ = i_222_ * i_216_ + 8192 >> 14;
		int i_233_ = i_223_ * i_217_ + 8192 >> 14;
		int i_234_ = i_224_ * i_218_ + 8192 >> 14;
		i_232_ += i_228_;
		i_233_ += i_229_;
		i_234_ += i_230_;
		int[] is_235_ = new int[9];
		for (int i_236_ = 0; i_236_ < 3; i_236_++) {
		    for (int i_237_ = 0; i_237_ < 3; i_237_++) {
			int i_238_ = 0;
			for (int i_239_ = 0; i_239_ < 3; i_239_++)
			    i_238_ += (is_131_[i_236_ * 3 + i_239_]
				       * is_231_[i_237_ + i_239_ * 3]);
			is_235_[i_236_ * 3 + i_237_] = i_238_ + 8192 >> 14;
		    }
		}
		int i_240_ = ((is_131_[0] * i_232_ + is_131_[1] * i_233_
			       + is_131_[2] * i_234_ + 8192)
			      >> 14);
		int i_241_ = ((is_131_[3] * i_232_ + is_131_[4] * i_233_
			       + is_131_[5] * i_234_ + 8192)
			      >> 14);
		int i_242_ = ((is_131_[6] * i_232_ + is_131_[7] * i_233_
			       + is_131_[8] * i_234_ + 8192)
			      >> 14);
		i_240_ += i_213_;
		i_241_ += i_214_;
		i_242_ += i_215_;
		for (int i_243_ = 0; i_243_ < i_132_; i_243_++) {
		    int i_244_ = is[i_243_];
		    if (i_244_
			< ((Class157_Sub2) this).anIntArrayArray9165.length) {
			int[] is_245_ = (((Class157_Sub2) this)
					 .anIntArrayArray9165[i_244_]);
			for (int i_246_ = 0; i_246_ < is_245_.length;
			     i_246_++) {
			    int i_247_ = is_245_[i_246_];
			    if (((Class157_Sub2) this).aShortArray9140 == null
				|| ((i_130_ & (((Class157_Sub2) this)
					       .aShortArray9140[i_247_]))
				    != 0)) {
				int i_248_
				    = (is_235_[0] * (((Class157_Sub2) this)
						     .anIntArray9203[i_247_])
				       + is_235_[1] * (((Class157_Sub2) this)
						       .anIntArray9204[i_247_])
				       + is_235_[2] * (((Class157_Sub2) this)
						       .anIntArray9177[i_247_])
				       + 8192) >> 14;
				int i_249_
				    = (is_235_[3] * (((Class157_Sub2) this)
						     .anIntArray9203[i_247_])
				       + is_235_[4] * (((Class157_Sub2) this)
						       .anIntArray9204[i_247_])
				       + is_235_[5] * (((Class157_Sub2) this)
						       .anIntArray9177[i_247_])
				       + 8192) >> 14;
				int i_250_
				    = (is_235_[6] * (((Class157_Sub2) this)
						     .anIntArray9203[i_247_])
				       + is_235_[7] * (((Class157_Sub2) this)
						       .anIntArray9204[i_247_])
				       + is_235_[8] * (((Class157_Sub2) this)
						       .anIntArray9177[i_247_])
				       + 8192) >> 14;
				i_248_ += i_240_;
				i_249_ += i_241_;
				i_250_ += i_242_;
				((Class157_Sub2) this).anIntArray9203[i_247_]
				    = i_248_;
				((Class157_Sub2) this).anIntArray9204[i_247_]
				    = i_249_;
				((Class157_Sub2) this).anIntArray9177[i_247_]
				    = i_250_;
			    }
			}
		    }
		}
	    } else {
		for (int i_251_ = 0; i_251_ < i_132_; i_251_++) {
		    int i_252_ = is[i_251_];
		    if (i_252_
			< ((Class157_Sub2) this).anIntArrayArray9165.length) {
			int[] is_253_ = (((Class157_Sub2) this)
					 .anIntArrayArray9165[i_252_]);
			for (int i_254_ = 0; i_254_ < is_253_.length;
			     i_254_++) {
			    int i_255_ = is_253_[i_254_];
			    if (((Class157_Sub2) this).aShortArray9140 == null
				|| ((i_130_ & (((Class157_Sub2) this)
					       .aShortArray9140[i_255_]))
				    != 0)) {
				((Class157_Sub2) this).anIntArray9203[i_255_]
				    -= ((Class157_Sub2) this).anInt9169;
				((Class157_Sub2) this).anIntArray9204[i_255_]
				    -= ((Class157_Sub2) this).anInt9170;
				((Class157_Sub2) this).anIntArray9177[i_255_]
				    -= ((Class157_Sub2) this).anInt9171;
				((Class157_Sub2) this).anIntArray9203[i_255_]
				    = (((Class157_Sub2) this).anIntArray9203
				       [i_255_]) * i_127_ / 128;
				((Class157_Sub2) this).anIntArray9204[i_255_]
				    = (((Class157_Sub2) this).anIntArray9204
				       [i_255_]) * i_128_ / 128;
				((Class157_Sub2) this).anIntArray9177[i_255_]
				    = (((Class157_Sub2) this).anIntArray9177
				       [i_255_]) * i_129_ / 128;
				((Class157_Sub2) this).anIntArray9203[i_255_]
				    += ((Class157_Sub2) this).anInt9169;
				((Class157_Sub2) this).anIntArray9204[i_255_]
				    += ((Class157_Sub2) this).anInt9170;
				((Class157_Sub2) this).anIntArray9177[i_255_]
				    += ((Class157_Sub2) this).anInt9171;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class157_Sub2) this).anIntArrayArray9166 != null
		&& ((Class157_Sub2) this).aByteArray9160 != null) {
		for (int i_256_ = 0; i_256_ < i_132_; i_256_++) {
		    int i_257_ = is[i_256_];
		    if (i_257_
			< ((Class157_Sub2) this).anIntArrayArray9166.length) {
			int[] is_258_ = (((Class157_Sub2) this)
					 .anIntArrayArray9166[i_257_]);
			for (int i_259_ = 0; i_259_ < is_258_.length;
			     i_259_++) {
			    int i_260_ = is_258_[i_259_];
			    if (((Class157_Sub2) this).aShortArray9163 == null
				|| ((i_130_ & (((Class157_Sub2) this)
					       .aShortArray9163[i_260_]))
				    != 0)) {
				int i_261_ = (((((Class157_Sub2) this)
						.aByteArray9160[i_260_])
					       & 0xff)
					      + i_127_ * 8);
				if (i_261_ < 0)
				    i_261_ = 0;
				else if (i_261_ > 255)
				    i_261_ = 255;
				((Class157_Sub2) this).aByteArray9160[i_260_]
				    = (byte) i_261_;
			    }
			}
		    }
		}
		if (((Class157_Sub2) this).aClass90Array9156 != null) {
		    for (int i_262_ = 0;
			 i_262_ < ((Class157_Sub2) this).anInt9175; i_262_++) {
			Class90 class90
			    = ((Class157_Sub2) this).aClass90Array9156[i_262_];
			Class108 class108 = (((Class157_Sub2) this)
					     .aClass108Array9123[i_262_]);
			((Class108) class108).anInt1368
			    = ((((Class108) class108).anInt1368 * -1351793475
				& 0xffffff)
			       | 255 - ((((Class157_Sub2) this).aByteArray9160
					 [(((Class90) class90).anInt1142
					   * 1037728387)])
					& 0xff) << 24) * 323344021;
		    }
		}
	    }
	} else if (i == 7) {
	    if (((Class157_Sub2) this).anIntArrayArray9166 != null) {
		for (int i_263_ = 0; i_263_ < i_132_; i_263_++) {
		    int i_264_ = is[i_263_];
		    if (i_264_
			< ((Class157_Sub2) this).anIntArrayArray9166.length) {
			int[] is_265_ = (((Class157_Sub2) this)
					 .anIntArrayArray9166[i_264_]);
			for (int i_266_ = 0; i_266_ < is_265_.length;
			     i_266_++) {
			    int i_267_ = is_265_[i_266_];
			    if (((Class157_Sub2) this).aShortArray9163 == null
				|| ((i_130_ & (((Class157_Sub2) this)
					       .aShortArray9163[i_267_]))
				    != 0)) {
				int i_268_ = ((((Class157_Sub2) this)
					       .aShortArray9162[i_267_])
					      & 0xffff);
				int i_269_ = i_268_ >> 10 & 0x3f;
				int i_270_ = i_268_ >> 7 & 0x7;
				int i_271_ = i_268_ & 0x7f;
				i_269_ = i_269_ + i_127_ & 0x3f;
				i_270_ += i_128_;
				if (i_270_ < 0)
				    i_270_ = 0;
				else if (i_270_ > 7)
				    i_270_ = 7;
				i_271_ += i_129_;
				if (i_271_ < 0)
				    i_271_ = 0;
				else if (i_271_ > 127)
				    i_271_ = 127;
				((Class157_Sub2) this).aShortArray9162[i_267_]
				    = (short) (i_269_ << 10 | i_270_ << 7
					       | i_271_);
			    }
			}
			((Class157_Sub2) this).aBool9195 = true;
		    }
		}
		if (((Class157_Sub2) this).aClass90Array9156 != null) {
		    for (int i_272_ = 0;
			 i_272_ < ((Class157_Sub2) this).anInt9175; i_272_++) {
			Class90 class90
			    = ((Class157_Sub2) this).aClass90Array9156[i_272_];
			Class108 class108 = (((Class157_Sub2) this)
					     .aClass108Array9123[i_272_]);
			((Class108) class108).anInt1368
			    = (((((Class108) class108).anInt1368 * -1351793475
				 & ~0xffffff)
				| (Class72.anIntArray777
				   [(Class516.method6283
				     ((((Class157_Sub2) this).aShortArray9162
				       [(((Class90) class90).anInt1142
					 * 1037728387)]) & 0xffff,
				      515814180)) & 0xffff]) & 0xffffff)
			       * 323344021);
		    }
		}
	    }
	} else if (i == 8) {
	    if (((Class157_Sub2) this).anIntArrayArray9178 != null) {
		for (int i_273_ = 0; i_273_ < i_132_; i_273_++) {
		    int i_274_ = is[i_273_];
		    if (i_274_
			< ((Class157_Sub2) this).anIntArrayArray9178.length) {
			int[] is_275_ = (((Class157_Sub2) this)
					 .anIntArrayArray9178[i_274_]);
			for (int i_276_ = 0; i_276_ < is_275_.length;
			     i_276_++) {
			    Class108 class108
				= (((Class157_Sub2) this).aClass108Array9123
				   [is_275_[i_276_]]);
			    ((Class108) class108).anInt1365
				+= i_127_ * -731787657;
			    ((Class108) class108).anInt1366
				+= i_128_ * 1335672291;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class157_Sub2) this).anIntArrayArray9178 != null) {
		for (int i_277_ = 0; i_277_ < i_132_; i_277_++) {
		    int i_278_ = is[i_277_];
		    if (i_278_
			< ((Class157_Sub2) this).anIntArrayArray9178.length) {
			int[] is_279_ = (((Class157_Sub2) this)
					 .anIntArrayArray9178[i_278_]);
			for (int i_280_ = 0; i_280_ < is_279_.length;
			     i_280_++) {
			    Class108 class108
				= (((Class157_Sub2) this).aClass108Array9123
				   [is_279_[i_280_]]);
			    ((Class108) class108).aFloat1363
				= (((Class108) class108).aFloat1363
				   * (float) i_127_ / 128.0F);
			    ((Class108) class108).aFloat1364
				= (((Class108) class108).aFloat1364
				   * (float) i_128_ / 128.0F);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class157_Sub2) this).anIntArrayArray9178 != null) {
		for (int i_281_ = 0; i_281_ < i_132_; i_281_++) {
		    int i_282_ = is[i_281_];
		    if (i_282_
			< ((Class157_Sub2) this).anIntArrayArray9178.length) {
			int[] is_283_ = (((Class157_Sub2) this)
					 .anIntArrayArray9178[i_282_]);
			for (int i_284_ = 0; i_284_ < is_283_.length;
			     i_284_++) {
			    Class108 class108
				= (((Class157_Sub2) this).aClass108Array9123
				   [is_283_[i_284_]]);
			    ((Class108) class108).anInt1367
				= ((((Class108) class108).anInt1367 * 337890173
				    + i_127_)
				   & 0x3fff) * 1644905941;
			}
		    }
		}
	    }
	}
    }
    
    public int method1912() {
	return ((Class157_Sub2) this).anInt9134;
    }
    
    public int method1874() {
	return ((Class157_Sub2) this).anInt9132;
    }
    
    public void method1873(int i) {
	if ((((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
	     .anInt9745) * -1585405167
	    > 1) {
	    synchronized (this) {
		if ((((Class157_Sub2) this).anInt9132 & 0x10000) == 65536
		    && (i & 0x10000) == 0)
		    method8402(true);
		((Class157_Sub2) this).anInt9132 = i;
	    }
	} else {
	    if ((((Class157_Sub2) this).anInt9132 & 0x10000) == 65536
		&& (i & 0x10000) == 0)
		method8402(true);
	    ((Class157_Sub2) this).anInt9132 = i;
	}
    }
    
    public void method1875() {
	/* empty */
    }
    
    public void method1878(int i) {
	if ((((Class157_Sub2) this).anInt9132 & 0x5) != 5)
	    throw new IllegalStateException();
	if (i == 4096)
	    method8437();
	else if (i == 8192)
	    method8426();
	else if (i == 12288)
	    method8413();
	else {
	    int i_285_ = Class417.anIntArray4766[i];
	    int i_286_ = Class417.anIntArray4767[i];
	    synchronized (this) {
		for (int i_287_ = 0; i_287_ < ((Class157_Sub2) this).anInt9135;
		     i_287_++) {
		    int i_288_
			= (((((Class157_Sub2) this).anIntArray9177[i_287_]
			     * i_285_)
			    + (((Class157_Sub2) this).anIntArray9203[i_287_]
			       * i_286_))
			   >> 14);
		    ((Class157_Sub2) this).anIntArray9177[i_287_]
			= ((((Class157_Sub2) this).anIntArray9177[i_287_]
			    * i_286_)
			   - (((Class157_Sub2) this).anIntArray9203[i_287_]
			      * i_285_)) >> 14;
		    ((Class157_Sub2) this).anIntArray9203[i_287_] = i_288_;
		}
		method8411();
	    }
	}
    }
    
    public void method1932(int i) {
	if ((((Class157_Sub2) this).anInt9132 & 0xd) != 13)
	    throw new IllegalStateException();
	if (((Class157_Sub2) this).aClass103Array9141 != null) {
	    if (i == 4096)
		method8410();
	    else if (i == 8192)
		method8408();
	    else if (i == 12288)
		method8409();
	    else {
		int i_289_ = Class417.anIntArray4766[i];
		int i_290_ = Class417.anIntArray4767[i];
		synchronized (this) {
		    for (int i_291_ = 0;
			 i_291_ < ((Class157_Sub2) this).anInt9136; i_291_++) {
			int i_292_
			    = ((((Class157_Sub2) this).anIntArray9177[i_291_]
				* i_289_)
			       + (((Class157_Sub2) this).anIntArray9203[i_291_]
				  * i_290_)) >> 14;
			((Class157_Sub2) this).anIntArray9177[i_291_]
			    = ((((Class157_Sub2) this).anIntArray9177[i_291_]
				* i_290_)
			       - (((Class157_Sub2) this).anIntArray9203[i_291_]
				  * i_289_)) >> 14;
			((Class157_Sub2) this).anIntArray9203[i_291_] = i_292_;
			if (((Class157_Sub2) this).aClass103Array9141[i_291_]
			    != null) {
			    i_292_
				= ((((Class103) (((Class157_Sub2) this)
						 .aClass103Array9141[i_291_]))
				    .anInt1299) * i_289_
				   + (((Class103) (((Class157_Sub2) this)
						   .aClass103Array9141
						   [i_291_])).anInt1300
				      * i_290_)) >> 14;
			    ((Class103) (((Class157_Sub2) this)
					 .aClass103Array9141
					 [i_291_])).anInt1299
				= ((((Class103) (((Class157_Sub2) this)
						 .aClass103Array9141[i_291_]))
				    .anInt1299) * i_290_
				   - (((Class103) (((Class157_Sub2) this)
						   .aClass103Array9141
						   [i_291_])).anInt1300
				      * i_289_)) >> 14;
			    ((Class103) (((Class157_Sub2) this)
					 .aClass103Array9141
					 [i_291_])).anInt1300
				= i_292_;
			}
		    }
		    if (((Class157_Sub2) this).aClass104Array9196 != null) {
			for (int i_293_ = 0;
			     i_293_ < ((Class157_Sub2) this).anInt9143;
			     i_293_++) {
			    if ((((Class157_Sub2) this).aClass104Array9196
				 [i_293_])
				!= null) {
				int i_294_
				    = (((((Class104) (((Class157_Sub2) this)
						      .aClass104Array9196
						      [i_293_])).anInt1307
					 * i_289_)
					+ (((Class104) (((Class157_Sub2) this)
							.aClass104Array9196
							[i_293_])).anInt1305
					   * i_290_))
				       >> 14);
				((Class104) (((Class157_Sub2) this)
					     .aClass104Array9196
					     [i_293_])).anInt1307
				    = ((((Class104) (((Class157_Sub2) this)
						     .aClass104Array9196
						     [i_293_])).anInt1307
					* i_290_)
				       - (((Class104) (((Class157_Sub2) this)
						       .aClass104Array9196
						       [i_293_])).anInt1305
					  * i_289_)) >> 14;
				((Class104) (((Class157_Sub2) this)
					     .aClass104Array9196
					     [i_293_])).anInt1305
				    = i_294_;
			    }
			}
		    }
		    for (int i_295_ = ((Class157_Sub2) this).anInt9136;
			 i_295_ < ((Class157_Sub2) this).anInt9135; i_295_++) {
			int i_296_
			    = ((((Class157_Sub2) this).anIntArray9177[i_295_]
				* i_289_)
			       + (((Class157_Sub2) this).anIntArray9203[i_295_]
				  * i_290_)) >> 14;
			((Class157_Sub2) this).anIntArray9177[i_295_]
			    = ((((Class157_Sub2) this).anIntArray9177[i_295_]
				* i_290_)
			       - (((Class157_Sub2) this).anIntArray9203[i_295_]
				  * i_289_)) >> 14;
			((Class157_Sub2) this).anIntArray9203[i_295_] = i_296_;
		    }
		    ((Class157_Sub2) this).anInt9152 = 0;
		    ((Class157_Sub2) this).aBool9179 = false;
		}
	    }
	} else
	    method1878(i);
    }
    
    public void method1987(int i) {
	if ((((Class157_Sub2) this).anInt9132 & 0x1000) != 4096)
	    throw new IllegalStateException();
	((Class157_Sub2) this).anInt9133 = i;
	((Class157_Sub2) this).anInt9152 = 0;
    }
    
    public void method1965(Class433 class433, Class159 class159, int i) {
	method8440(class433, class159, i);
    }
    
    void method8408() {
	synchronized (this) {
	    for (int i = 0; i < ((Class157_Sub2) this).anInt9136; i++) {
		((Class157_Sub2) this).anIntArray9203[i]
		    = -((Class157_Sub2) this).anIntArray9203[i];
		((Class157_Sub2) this).anIntArray9177[i]
		    = -((Class157_Sub2) this).anIntArray9177[i];
		if (((Class157_Sub2) this).aClass103Array9141[i] != null) {
		    ((Class103) ((Class157_Sub2) this).aClass103Array9141[i])
			.anInt1300
			= -((Class103) (((Class157_Sub2) this)
					.aClass103Array9141[i])).anInt1300;
		    ((Class103) ((Class157_Sub2) this).aClass103Array9141[i])
			.anInt1299
			= -((Class103) (((Class157_Sub2) this)
					.aClass103Array9141[i])).anInt1299;
		}
	    }
	    if (((Class157_Sub2) this).aClass104Array9196 != null) {
		for (int i = 0; i < ((Class157_Sub2) this).anInt9143; i++) {
		    if (((Class157_Sub2) this).aClass104Array9196[i] != null) {
			((Class104) (((Class157_Sub2) this).aClass104Array9196
				     [i])).anInt1305
			    = -((Class104) (((Class157_Sub2) this)
					    .aClass104Array9196[i])).anInt1305;
			((Class104) (((Class157_Sub2) this).aClass104Array9196
				     [i])).anInt1307
			    = -((Class104) (((Class157_Sub2) this)
					    .aClass104Array9196[i])).anInt1307;
		    }
		}
	    }
	    for (int i = ((Class157_Sub2) this).anInt9136;
		 i < ((Class157_Sub2) this).anInt9135; i++) {
		((Class157_Sub2) this).anIntArray9203[i]
		    = -((Class157_Sub2) this).anIntArray9203[i];
		((Class157_Sub2) this).anIntArray9177[i]
		    = -((Class157_Sub2) this).anIntArray9177[i];
	    }
	    ((Class157_Sub2) this).anInt9152 = 0;
	    ((Class157_Sub2) this).aBool9179 = false;
	}
    }
    
    void method8409() {
	synchronized (this) {
	    for (int i = 0; i < ((Class157_Sub2) this).anInt9136; i++) {
		int i_297_ = ((Class157_Sub2) this).anIntArray9177[i];
		((Class157_Sub2) this).anIntArray9177[i]
		    = ((Class157_Sub2) this).anIntArray9203[i];
		((Class157_Sub2) this).anIntArray9203[i] = -i_297_;
		if (((Class157_Sub2) this).aClass103Array9141[i] != null) {
		    i_297_ = ((Class103) (((Class157_Sub2) this)
					  .aClass103Array9141[i])).anInt1299;
		    ((Class103) ((Class157_Sub2) this).aClass103Array9141[i])
			.anInt1299
			= ((Class103) (((Class157_Sub2) this)
				       .aClass103Array9141[i])).anInt1300;
		    ((Class103) ((Class157_Sub2) this).aClass103Array9141[i])
			.anInt1300
			= -i_297_;
		}
	    }
	    if (((Class157_Sub2) this).aClass104Array9196 != null) {
		for (int i = 0; i < ((Class157_Sub2) this).anInt9143; i++) {
		    if (((Class157_Sub2) this).aClass104Array9196[i] != null) {
			int i_298_ = (((Class104) (((Class157_Sub2) this)
						   .aClass104Array9196[i]))
				      .anInt1307);
			((Class104) (((Class157_Sub2) this).aClass104Array9196
				     [i])).anInt1307
			    = ((Class104) (((Class157_Sub2) this)
					   .aClass104Array9196[i])).anInt1305;
			((Class104) (((Class157_Sub2) this).aClass104Array9196
				     [i])).anInt1305
			    = -i_298_;
		    }
		}
	    }
	    for (int i = ((Class157_Sub2) this).anInt9136;
		 i < ((Class157_Sub2) this).anInt9135; i++) {
		int i_299_ = ((Class157_Sub2) this).anIntArray9177[i];
		((Class157_Sub2) this).anIntArray9177[i]
		    = ((Class157_Sub2) this).anIntArray9203[i];
		((Class157_Sub2) this).anIntArray9203[i] = -i_299_;
	    }
	    ((Class157_Sub2) this).anInt9152 = 0;
	    ((Class157_Sub2) this).aBool9179 = false;
	}
    }
    
    public void method1934(int i) {
	if ((((Class157_Sub2) this).anInt9132 & 0x6) != 6)
	    throw new IllegalStateException();
	int i_300_ = Class417.anIntArray4766[i];
	int i_301_ = Class417.anIntArray4767[i];
	synchronized (this) {
	    for (int i_302_ = 0; i_302_ < ((Class157_Sub2) this).anInt9135;
		 i_302_++) {
		int i_303_
		    = ((((Class157_Sub2) this).anIntArray9204[i_302_] * i_301_
			- (((Class157_Sub2) this).anIntArray9177[i_302_]
			   * i_300_))
		       >> 14);
		((Class157_Sub2) this).anIntArray9177[i_302_]
		    = (((Class157_Sub2) this).anIntArray9204[i_302_] * i_300_
		       + (((Class157_Sub2) this).anIntArray9177[i_302_]
			  * i_301_)) >> 14;
		((Class157_Sub2) this).anIntArray9204[i_302_] = i_303_;
	    }
	    method8411();
	}
    }
    
    public void method1879(int i) {
	if ((((Class157_Sub2) this).anInt9132 & 0x3) != 3)
	    throw new IllegalStateException();
	int i_304_ = Class417.anIntArray4766[i];
	int i_305_ = Class417.anIntArray4767[i];
	synchronized (this) {
	    for (int i_306_ = 0; i_306_ < ((Class157_Sub2) this).anInt9135;
		 i_306_++) {
		int i_307_
		    = ((((Class157_Sub2) this).anIntArray9204[i_306_] * i_304_
			+ (((Class157_Sub2) this).anIntArray9203[i_306_]
			   * i_305_))
		       >> 14);
		((Class157_Sub2) this).anIntArray9204[i_306_]
		    = (((Class157_Sub2) this).anIntArray9204[i_306_] * i_305_
		       - (((Class157_Sub2) this).anIntArray9203[i_306_]
			  * i_304_)) >> 14;
		((Class157_Sub2) this).anIntArray9203[i_306_] = i_307_;
	    }
	    method8411();
	}
    }
    
    public void method1880(int i, int i_308_, int i_309_) {
	if (i != 0 && (((Class157_Sub2) this).anInt9132 & 0x1) != 1)
	    throw new IllegalStateException();
	if (i_308_ != 0 && (((Class157_Sub2) this).anInt9132 & 0x2) != 2)
	    throw new IllegalStateException();
	if (i_309_ != 0 && (((Class157_Sub2) this).anInt9132 & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i_310_ = 0; i_310_ < ((Class157_Sub2) this).anInt9135;
		 i_310_++) {
		((Class157_Sub2) this).anIntArray9203[i_310_] += i;
		((Class157_Sub2) this).anIntArray9204[i_310_] += i_308_;
		((Class157_Sub2) this).anIntArray9177[i_310_] += i_309_;
	    }
	}
    }
    
    public void method2002() {
	if ((((Class157_Sub2) this).anInt9132 & 0x10) != 16)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i = 0; i < ((Class157_Sub2) this).anInt9135; i++)
		((Class157_Sub2) this).anIntArray9177[i]
		    = -((Class157_Sub2) this).anIntArray9177[i];
	    if (((Class157_Sub2) this).aClass103Array9141 != null) {
		for (int i = 0; i < ((Class157_Sub2) this).anInt9136; i++) {
		    if (((Class157_Sub2) this).aClass103Array9141[i] != null)
			((Class103) (((Class157_Sub2) this).aClass103Array9141
				     [i])).anInt1299
			    = -((Class103) (((Class157_Sub2) this)
					    .aClass103Array9141[i])).anInt1299;
		}
	    }
	    if (((Class157_Sub2) this).aClass103Array9142 != null) {
		for (int i = 0; i < ((Class157_Sub2) this).anInt9136; i++) {
		    if (((Class157_Sub2) this).aClass103Array9142[i] != null)
			((Class103) (((Class157_Sub2) this).aClass103Array9142
				     [i])).anInt1299
			    = -((Class103) (((Class157_Sub2) this)
					    .aClass103Array9142[i])).anInt1299;
		}
	    }
	    if (((Class157_Sub2) this).aClass104Array9196 != null) {
		for (int i = 0; i < ((Class157_Sub2) this).anInt9143; i++) {
		    if (((Class157_Sub2) this).aClass104Array9196[i] != null)
			((Class104) (((Class157_Sub2) this).aClass104Array9196
				     [i])).anInt1307
			    = -((Class104) (((Class157_Sub2) this)
					    .aClass104Array9196[i])).anInt1307;
		}
	    }
	    short[] is = ((Class157_Sub2) this).aShortArray9145;
	    ((Class157_Sub2) this).aShortArray9145
		= ((Class157_Sub2) this).aShortArray9147;
	    ((Class157_Sub2) this).aShortArray9147 = is;
	    if (((Class157_Sub2) this).aFloatArrayArray9157 != null) {
		for (int i = 0; i < ((Class157_Sub2) this).anInt9143; i++) {
		    if (((Class157_Sub2) this).aFloatArrayArray9157[i]
			!= null) {
			float f = (((Class157_Sub2) this).aFloatArrayArray9157
				   [i][0]);
			((Class157_Sub2) this).aFloatArrayArray9157[i][0]
			    = (((Class157_Sub2) this).aFloatArrayArray9157[i]
			       [2]);
			((Class157_Sub2) this).aFloatArrayArray9157[i][2] = f;
		    }
		    if (((Class157_Sub2) this).aFloatArrayArray9149[i]
			!= null) {
			float f = (((Class157_Sub2) this).aFloatArrayArray9149
				   [i][0]);
			((Class157_Sub2) this).aFloatArrayArray9149[i][0]
			    = (((Class157_Sub2) this).aFloatArrayArray9149[i]
			       [2]);
			((Class157_Sub2) this).aFloatArrayArray9149[i][2] = f;
		    }
		}
	    }
	    ((Class157_Sub2) this).aBool9179 = false;
	    ((Class157_Sub2) this).anInt9152 = 0;
	}
    }
    
    void method8410() {
	synchronized (this) {
	    for (int i = 0; i < ((Class157_Sub2) this).anInt9136; i++) {
		int i_311_ = ((Class157_Sub2) this).anIntArray9203[i];
		((Class157_Sub2) this).anIntArray9203[i]
		    = ((Class157_Sub2) this).anIntArray9177[i];
		((Class157_Sub2) this).anIntArray9177[i] = -i_311_;
		if (((Class157_Sub2) this).aClass103Array9141[i] != null) {
		    i_311_ = ((Class103) (((Class157_Sub2) this)
					  .aClass103Array9141[i])).anInt1300;
		    ((Class103) ((Class157_Sub2) this).aClass103Array9141[i])
			.anInt1300
			= ((Class103) (((Class157_Sub2) this)
				       .aClass103Array9141[i])).anInt1299;
		    ((Class103) ((Class157_Sub2) this).aClass103Array9141[i])
			.anInt1299
			= -i_311_;
		}
	    }
	    if (((Class157_Sub2) this).aClass104Array9196 != null) {
		for (int i = 0; i < ((Class157_Sub2) this).anInt9143; i++) {
		    if (((Class157_Sub2) this).aClass104Array9196[i] != null) {
			int i_312_ = (((Class104) (((Class157_Sub2) this)
						   .aClass104Array9196[i]))
				      .anInt1305);
			((Class104) (((Class157_Sub2) this).aClass104Array9196
				     [i])).anInt1305
			    = ((Class104) (((Class157_Sub2) this)
					   .aClass104Array9196[i])).anInt1307;
			((Class104) (((Class157_Sub2) this).aClass104Array9196
				     [i])).anInt1307
			    = -i_312_;
		    }
		}
	    }
	    for (int i = ((Class157_Sub2) this).anInt9136;
		 i < ((Class157_Sub2) this).anInt9135; i++) {
		int i_313_ = ((Class157_Sub2) this).anIntArray9203[i];
		((Class157_Sub2) this).anIntArray9203[i]
		    = ((Class157_Sub2) this).anIntArray9177[i];
		((Class157_Sub2) this).anIntArray9177[i] = -i_313_;
	    }
	    ((Class157_Sub2) this).anInt9152 = 0;
	    ((Class157_Sub2) this).aBool9179 = false;
	}
    }
    
    public void method1883(int i, int i_314_, Class137 class137,
			   Class137 class137_315_, int i_316_, int i_317_,
			   int i_318_) {
	if (i == 3) {
	    if ((((Class157_Sub2) this).anInt9132 & 0x7) != 7)
		throw new IllegalStateException();
	} else if ((((Class157_Sub2) this).anInt9132 & 0x2) != 2)
	    throw new IllegalStateException();
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	int i_319_ = i_316_ + ((Class157_Sub2) this).aShort9184;
	int i_320_ = i_316_ + ((Class157_Sub2) this).aShort9185;
	int i_321_ = i_318_ + ((Class157_Sub2) this).aShort9186;
	int i_322_ = i_318_ + ((Class157_Sub2) this).aShort9144;
	if (i == 4 || (i_319_ >= 0
		       && ((i_320_ + class137.anInt1628 * 2130003981
			    >> class137.anInt1625 * 1543345989)
			   < class137.anInt1627 * -657933437)
		       && i_321_ >= 0
		       && ((i_322_ + class137.anInt1628 * 2130003981
			    >> class137.anInt1625 * 1543345989)
			   < class137.anInt1626 * 1769495707))) {
	    int[][] is = class137.anIntArrayArray1629;
	    int[][] is_323_ = null;
	    if (class137_315_ != null)
		is_323_ = class137_315_.anIntArrayArray1629;
	    if (i == 4 || i == 5) {
		if (class137_315_ == null
		    || (i_319_ < 0
			|| ((i_320_ + class137_315_.anInt1628 * 2130003981
			     >> class137_315_.anInt1625 * 1543345989)
			    >= class137_315_.anInt1627 * -657933437)
			|| i_321_ < 0
			|| ((i_322_ + class137_315_.anInt1628 * 2130003981
			     >> class137_315_.anInt1625 * 1543345989)
			    >= class137_315_.anInt1626 * 1769495707)))
		    return;
	    } else {
		i_319_ >>= class137.anInt1625 * 1543345989;
		i_320_ = (i_320_ + (class137.anInt1628 * 2130003981 - 1)
			  >> class137.anInt1625 * 1543345989);
		i_321_ >>= class137.anInt1625 * 1543345989;
		i_322_ = (i_322_ + (class137.anInt1628 * 2130003981 - 1)
			  >> class137.anInt1625 * 1543345989);
		if (is[i_319_][i_321_] == i_317_
		    && is[i_320_][i_321_] == i_317_
		    && is[i_319_][i_322_] == i_317_
		    && is[i_320_][i_322_] == i_317_)
		    return;
	    }
	    synchronized (this) {
		if (i == 1) {
		    int i_324_ = class137.anInt1628 * 2130003981 - 1;
		    for (int i_325_ = 0;
			 i_325_ < ((Class157_Sub2) this).anInt9136; i_325_++) {
			int i_326_
			    = (((Class157_Sub2) this).anIntArray9203[i_325_]
			       + i_316_);
			int i_327_
			    = (((Class157_Sub2) this).anIntArray9177[i_325_]
			       + i_318_);
			int i_328_ = i_326_ & i_324_;
			int i_329_ = i_327_ & i_324_;
			int i_330_ = i_326_ >> class137.anInt1625 * 1543345989;
			int i_331_ = i_327_ >> class137.anInt1625 * 1543345989;
			int i_332_
			    = (((is[i_330_][i_331_]
				 * (class137.anInt1628 * 2130003981 - i_328_))
				+ is[i_330_ + 1][i_331_] * i_328_)
			       >> class137.anInt1625 * 1543345989);
			int i_333_
			    = (((is[i_330_][i_331_ + 1]
				 * (class137.anInt1628 * 2130003981 - i_328_))
				+ is[i_330_ + 1][i_331_ + 1] * i_328_)
			       >> class137.anInt1625 * 1543345989);
			int i_334_ = (i_332_ * (class137.anInt1628 * 2130003981
						- i_329_) + i_333_ * i_329_
				      >> class137.anInt1625 * 1543345989);
			((Class157_Sub2) this).anIntArray9204[i_325_]
			    = (((Class157_Sub2) this).anIntArray9204[i_325_]
			       + i_334_ - i_317_);
		    }
		    for (int i_335_ = ((Class157_Sub2) this).anInt9136;
			 i_335_ < ((Class157_Sub2) this).anInt9135; i_335_++) {
			int i_336_
			    = (((Class157_Sub2) this).anIntArray9203[i_335_]
			       + i_316_);
			int i_337_
			    = (((Class157_Sub2) this).anIntArray9177[i_335_]
			       + i_318_);
			int i_338_ = i_336_ & i_324_;
			int i_339_ = i_337_ & i_324_;
			int i_340_ = i_336_ >> class137.anInt1625 * 1543345989;
			int i_341_ = i_337_ >> class137.anInt1625 * 1543345989;
			if (i_340_ >= 0 && i_340_ < is.length - 1
			    && i_341_ >= 0 && i_341_ < is[0].length - 1) {
			    int i_342_ = (((is[i_340_][i_341_]
					    * (class137.anInt1628 * 2130003981
					       - i_338_))
					   + is[i_340_ + 1][i_341_] * i_338_)
					  >> class137.anInt1625 * 1543345989);
			    int i_343_
				= (((is[i_340_][i_341_ + 1]
				     * (class137.anInt1628 * 2130003981
					- i_338_))
				    + is[i_340_ + 1][i_341_ + 1] * i_338_)
				   >> class137.anInt1625 * 1543345989);
			    int i_344_
				= (i_342_ * (class137.anInt1628 * 2130003981
					     - i_339_) + i_343_ * i_339_
				   >> class137.anInt1625 * 1543345989);
			    ((Class157_Sub2) this).anIntArray9204[i_335_]
				= (((Class157_Sub2) this).anIntArray9204
				   [i_335_]) + i_344_ - i_317_;
			}
		    }
		} else if (i == 2) {
		    if (((Class157_Sub2) this).aShort9182 == 0)
			return;
		    int i_345_ = class137.anInt1628 * 2130003981 - 1;
		    for (int i_346_ = 0;
			 i_346_ < ((Class157_Sub2) this).anInt9136; i_346_++) {
			int i_347_
			    = ((((Class157_Sub2) this).anIntArray9204[i_346_]
				<< 16)
			       / ((Class157_Sub2) this).aShort9182);
			if (i_347_ < i_314_) {
			    int i_348_ = ((((Class157_Sub2) this)
					   .anIntArray9203[i_346_])
					  + i_316_);
			    int i_349_ = ((((Class157_Sub2) this)
					   .anIntArray9177[i_346_])
					  + i_318_);
			    int i_350_ = i_348_ & i_345_;
			    int i_351_ = i_349_ & i_345_;
			    int i_352_
				= i_348_ >> class137.anInt1625 * 1543345989;
			    int i_353_
				= i_349_ >> class137.anInt1625 * 1543345989;
			    int i_354_ = (((is[i_352_][i_353_]
					    * (class137.anInt1628 * 2130003981
					       - i_350_))
					   + is[i_352_ + 1][i_353_] * i_350_)
					  >> class137.anInt1625 * 1543345989);
			    int i_355_
				= (((is[i_352_][i_353_ + 1]
				     * (class137.anInt1628 * 2130003981
					- i_350_))
				    + is[i_352_ + 1][i_353_ + 1] * i_350_)
				   >> class137.anInt1625 * 1543345989);
			    int i_356_
				= (i_354_ * (class137.anInt1628 * 2130003981
					     - i_351_) + i_355_ * i_351_
				   >> class137.anInt1625 * 1543345989);
			    ((Class157_Sub2) this).anIntArray9204[i_346_]
				= ((((Class157_Sub2) this).anIntArray9204
				    [i_346_])
				   + ((i_356_ - i_317_) * (i_314_ - i_347_)
				      / i_314_));
			} else
			    ((Class157_Sub2) this).anIntArray9204[i_346_]
				= (((Class157_Sub2) this).anIntArray9204
				   [i_346_]);
		    }
		    for (int i_357_ = ((Class157_Sub2) this).anInt9136;
			 i_357_ < ((Class157_Sub2) this).anInt9135; i_357_++) {
			int i_358_
			    = ((((Class157_Sub2) this).anIntArray9204[i_357_]
				<< 16)
			       / ((Class157_Sub2) this).aShort9182);
			if (i_358_ < i_314_) {
			    int i_359_ = ((((Class157_Sub2) this)
					   .anIntArray9203[i_357_])
					  + i_316_);
			    int i_360_ = ((((Class157_Sub2) this)
					   .anIntArray9177[i_357_])
					  + i_318_);
			    int i_361_ = i_359_ & i_345_;
			    int i_362_ = i_360_ & i_345_;
			    int i_363_
				= i_359_ >> class137.anInt1625 * 1543345989;
			    int i_364_
				= i_360_ >> class137.anInt1625 * 1543345989;
			    if (i_363_ >= 0
				&& i_363_ < class137.anInt1627 * -657933437 - 1
				&& i_364_ >= 0
				&& (i_364_
				    < class137.anInt1626 * 1769495707 - 1)) {
				int i_365_
				    = (((is[i_363_][i_364_]
					 * (class137.anInt1628 * 2130003981
					    - i_361_))
					+ is[i_363_ + 1][i_364_] * i_361_)
				       >> class137.anInt1625 * 1543345989);
				int i_366_
				    = (((is[i_363_][i_364_ + 1]
					 * (class137.anInt1628 * 2130003981
					    - i_361_))
					+ is[i_363_ + 1][i_364_ + 1] * i_361_)
				       >> class137.anInt1625 * 1543345989);
				int i_367_
				    = ((i_365_
					* (class137.anInt1628 * 2130003981
					   - i_362_)) + i_366_ * i_362_
				       >> class137.anInt1625 * 1543345989);
				((Class157_Sub2) this).anIntArray9204[i_357_]
				    = ((((Class157_Sub2) this).anIntArray9204
					[i_357_])
				       + ((i_367_ - i_317_) * (i_314_ - i_358_)
					  / i_314_));
			    }
			} else
			    ((Class157_Sub2) this).anIntArray9204[i_357_]
				= (((Class157_Sub2) this).anIntArray9204
				   [i_357_]);
		    }
		} else if (i == 3) {
		    int i_368_ = (i_314_ & 0xff) * 4;
		    int i_369_ = (i_314_ >> 8 & 0xff) * 4;
		    int i_370_ = (i_314_ >> 16 & 0xff) << 6;
		    int i_371_ = (i_314_ >> 24 & 0xff) << 6;
		    if (i_316_ - (i_368_ >> 1) < 0
			|| ((i_316_ + (i_368_ >> 1)
			     + class137.anInt1628 * 2130003981)
			    >= (class137.anInt1627 * -657933437
				<< class137.anInt1625 * 1543345989))
			|| i_318_ - (i_369_ >> 1) < 0
			|| ((i_318_ + (i_369_ >> 1)
			     + class137.anInt1628 * 2130003981)
			    >= (class137.anInt1626 * 1769495707
				<< class137.anInt1625 * 1543345989)))
			return;
		    method1884(class137, i_316_, i_317_, i_318_, i_368_,
			       i_369_, i_370_, i_371_);
		} else if (i == 4) {
		    int i_372_ = class137_315_.anInt1628 * 2130003981 - 1;
		    int i_373_ = (((Class157_Sub2) this).aShort9183
				  - ((Class157_Sub2) this).aShort9182);
		    for (int i_374_ = 0;
			 i_374_ < ((Class157_Sub2) this).anInt9136; i_374_++) {
			int i_375_
			    = (((Class157_Sub2) this).anIntArray9203[i_374_]
			       + i_316_);
			int i_376_
			    = (((Class157_Sub2) this).anIntArray9177[i_374_]
			       + i_318_);
			int i_377_ = i_375_ & i_372_;
			int i_378_ = i_376_ & i_372_;
			int i_379_
			    = i_375_ >> class137_315_.anInt1625 * 1543345989;
			int i_380_
			    = i_376_ >> class137_315_.anInt1625 * 1543345989;
			int i_381_ = (((is_323_[i_379_][i_380_]
					* (class137_315_.anInt1628 * 2130003981
					   - i_377_))
				       + is_323_[i_379_ + 1][i_380_] * i_377_)
				      >> class137_315_.anInt1625 * 1543345989);
			int i_382_
			    = (((is_323_[i_379_][i_380_ + 1]
				 * (class137_315_.anInt1628 * 2130003981
				    - i_377_))
				+ is_323_[i_379_ + 1][i_380_ + 1] * i_377_)
			       >> class137_315_.anInt1625 * 1543345989);
			int i_383_
			    = (i_381_ * (class137_315_.anInt1628 * 2130003981
					 - i_378_) + i_382_ * i_378_
			       >> class137_315_.anInt1625 * 1543345989);
			((Class157_Sub2) this).anIntArray9204[i_374_]
			    = (((Class157_Sub2) this).anIntArray9204[i_374_]
			       + (i_383_ - i_317_) + i_373_);
		    }
		    for (int i_384_ = ((Class157_Sub2) this).anInt9136;
			 i_384_ < ((Class157_Sub2) this).anInt9135; i_384_++) {
			int i_385_
			    = (((Class157_Sub2) this).anIntArray9203[i_384_]
			       + i_316_);
			int i_386_
			    = (((Class157_Sub2) this).anIntArray9177[i_384_]
			       + i_318_);
			int i_387_ = i_385_ & i_372_;
			int i_388_ = i_386_ & i_372_;
			int i_389_
			    = i_385_ >> class137_315_.anInt1625 * 1543345989;
			int i_390_
			    = i_386_ >> class137_315_.anInt1625 * 1543345989;
			if (i_389_ >= 0
			    && (i_389_
				< class137_315_.anInt1627 * -657933437 - 1)
			    && i_390_ >= 0
			    && (i_390_
				< class137_315_.anInt1626 * 1769495707 - 1)) {
			    int i_391_
				= (((is_323_[i_389_][i_390_]
				     * (class137_315_.anInt1628 * 2130003981
					- i_387_))
				    + is_323_[i_389_ + 1][i_390_] * i_387_)
				   >> class137_315_.anInt1625 * 1543345989);
			    int i_392_
				= (((is_323_[i_389_][i_390_ + 1]
				     * (class137_315_.anInt1628 * 2130003981
					- i_387_))
				    + is_323_[i_389_ + 1][i_390_ + 1] * i_387_)
				   >> class137_315_.anInt1625 * 1543345989);
			    int i_393_
				= ((i_391_
				    * (class137_315_.anInt1628 * 2130003981
				       - i_388_)) + i_392_ * i_388_
				   >> class137_315_.anInt1625 * 1543345989);
			    ((Class157_Sub2) this).anIntArray9204[i_384_]
				= (((Class157_Sub2) this).anIntArray9204
				   [i_384_]) + (i_393_ - i_317_) + i_373_;
			}
		    }
		} else if (i == 5) {
		    int i_394_ = class137_315_.anInt1628 * 2130003981 - 1;
		    int i_395_ = (((Class157_Sub2) this).aShort9183
				  - ((Class157_Sub2) this).aShort9182);
		    for (int i_396_ = 0;
			 i_396_ < ((Class157_Sub2) this).anInt9136; i_396_++) {
			int i_397_
			    = (((Class157_Sub2) this).anIntArray9203[i_396_]
			       + i_316_);
			int i_398_
			    = (((Class157_Sub2) this).anIntArray9177[i_396_]
			       + i_318_);
			int i_399_ = i_397_ & i_394_;
			int i_400_ = i_398_ & i_394_;
			int i_401_ = i_397_ >> class137.anInt1625 * 1543345989;
			int i_402_ = i_398_ >> class137.anInt1625 * 1543345989;
			int i_403_
			    = (((is[i_401_][i_402_]
				 * (class137.anInt1628 * 2130003981 - i_399_))
				+ is[i_401_ + 1][i_402_] * i_399_)
			       >> class137.anInt1625 * 1543345989);
			int i_404_
			    = (((is[i_401_][i_402_ + 1]
				 * (class137.anInt1628 * 2130003981 - i_399_))
				+ is[i_401_ + 1][i_402_ + 1] * i_399_)
			       >> class137.anInt1625 * 1543345989);
			int i_405_ = (i_403_ * (class137.anInt1628 * 2130003981
						- i_400_) + i_404_ * i_400_
				      >> class137.anInt1625 * 1543345989);
			i_403_ = (((is_323_[i_401_][i_402_]
				    * (class137_315_.anInt1628 * 2130003981
				       - i_399_))
				   + is_323_[i_401_ + 1][i_402_] * i_399_)
				  >> class137_315_.anInt1625 * 1543345989);
			i_404_ = (((is_323_[i_401_][i_402_ + 1]
				    * (class137_315_.anInt1628 * 2130003981
				       - i_399_))
				   + is_323_[i_401_ + 1][i_402_ + 1] * i_399_)
				  >> class137_315_.anInt1625 * 1543345989);
			int i_406_
			    = (i_403_ * (class137_315_.anInt1628 * 2130003981
					 - i_400_) + i_404_ * i_400_
			       >> class137_315_.anInt1625 * 1543345989);
			int i_407_ = i_405_ - i_406_ - i_314_;
			((Class157_Sub2) this).anIntArray9204[i_396_]
			    = ((((Class157_Sub2) this).anIntArray9204[i_396_]
				<< 8) / i_395_ * i_407_
			       >> 8) - (i_317_ - i_405_);
		    }
		    for (int i_408_ = ((Class157_Sub2) this).anInt9136;
			 i_408_ < ((Class157_Sub2) this).anInt9135; i_408_++) {
			int i_409_
			    = (((Class157_Sub2) this).anIntArray9203[i_408_]
			       + i_316_);
			int i_410_
			    = (((Class157_Sub2) this).anIntArray9177[i_408_]
			       + i_318_);
			int i_411_ = i_409_ & i_394_;
			int i_412_ = i_410_ & i_394_;
			int i_413_ = i_409_ >> class137.anInt1625 * 1543345989;
			int i_414_ = i_410_ >> class137.anInt1625 * 1543345989;
			if (i_413_ >= 0
			    && i_413_ < class137.anInt1627 * -657933437 - 1
			    && (i_413_
				< class137_315_.anInt1627 * -657933437 - 1)
			    && i_414_ >= 0
			    && i_414_ < class137.anInt1626 * 1769495707 - 1
			    && (i_414_
				< class137_315_.anInt1626 * 1769495707 - 1)) {
			    int i_415_ = (((is[i_413_][i_414_]
					    * (class137.anInt1628 * 2130003981
					       - i_411_))
					   + is[i_413_ + 1][i_414_] * i_411_)
					  >> class137.anInt1625 * 1543345989);
			    int i_416_
				= (((is[i_413_][i_414_ + 1]
				     * (class137.anInt1628 * 2130003981
					- i_411_))
				    + is[i_413_ + 1][i_414_ + 1] * i_411_)
				   >> class137.anInt1625 * 1543345989);
			    int i_417_
				= (i_415_ * (class137.anInt1628 * 2130003981
					     - i_412_) + i_416_ * i_412_
				   >> class137.anInt1625 * 1543345989);
			    i_415_ = (((is_323_[i_413_][i_414_]
					* (class137_315_.anInt1628 * 2130003981
					   - i_411_))
				       + is_323_[i_413_ + 1][i_414_] * i_411_)
				      >> class137_315_.anInt1625 * 1543345989);
			    i_416_
				= (((is_323_[i_413_][i_414_ + 1]
				     * (class137_315_.anInt1628 * 2130003981
					- i_411_))
				    + is_323_[i_413_ + 1][i_414_ + 1] * i_411_)
				   >> class137_315_.anInt1625 * 1543345989);
			    int i_418_
				= ((i_415_
				    * (class137_315_.anInt1628 * 2130003981
				       - i_412_)) + i_416_ * i_412_
				   >> class137_315_.anInt1625 * 1543345989);
			    int i_419_ = i_417_ - i_418_ - i_314_;
			    ((Class157_Sub2) this).anIntArray9204[i_408_]
				= (((((Class157_Sub2) this).anIntArray9204
				     [i_408_])
				    << 8) / i_395_ * i_419_
				   >> 8) - (i_317_ - i_417_);
			}
		    }
		}
		((Class157_Sub2) this).aBool9179 = false;
	    }
	}
    }
    
    void method8411() {
	((Class157_Sub2) this).aClass103Array9141 = null;
	((Class157_Sub2) this).aClass103Array9142 = null;
	((Class157_Sub2) this).aClass104Array9196 = null;
	((Class157_Sub2) this).aBool9179 = false;
    }
    
    boolean method8412(int i, int i_420_, float f, float f_421_, float f_422_,
		       float f_423_, float f_424_, float f_425_) {
	if ((float) i_420_ < f && (float) i_420_ < f_421_
	    && (float) i_420_ < f_422_)
	    return false;
	if ((float) i_420_ > f && (float) i_420_ > f_421_
	    && (float) i_420_ > f_422_)
	    return false;
	if ((float) i < f_423_ && (float) i < f_424_ && (float) i < f_425_)
	    return false;
	if ((float) i > f_423_ && (float) i > f_424_ && (float) i > f_425_)
	    return false;
	return true;
    }
    
    public void method1941(int i) {
	if ((((Class157_Sub2) this).anInt9132 & 0x3) != 3)
	    throw new IllegalStateException();
	int i_426_ = Class417.anIntArray4766[i];
	int i_427_ = Class417.anIntArray4767[i];
	synchronized (this) {
	    for (int i_428_ = 0; i_428_ < ((Class157_Sub2) this).anInt9135;
		 i_428_++) {
		int i_429_
		    = ((((Class157_Sub2) this).anIntArray9204[i_428_] * i_426_
			+ (((Class157_Sub2) this).anIntArray9203[i_428_]
			   * i_427_))
		       >> 14);
		((Class157_Sub2) this).anIntArray9204[i_428_]
		    = (((Class157_Sub2) this).anIntArray9204[i_428_] * i_427_
		       - (((Class157_Sub2) this).anIntArray9203[i_428_]
			  * i_426_)) >> 14;
		((Class157_Sub2) this).anIntArray9203[i_428_] = i_429_;
	    }
	    method8411();
	}
    }
    
    boolean method1876() {
	if (((Class157_Sub2) this).anIntArrayArray9165 == null)
	    return false;
	((Class157_Sub2) this).anInt9169 = 0;
	((Class157_Sub2) this).anInt9170 = 0;
	((Class157_Sub2) this).anInt9171 = 0;
	return true;
    }
    
    void method1895() {
	if (((Class157_Sub2) this).aBool9168) {
	    for (int i = 0; i < ((Class157_Sub2) this).anInt9135; i++) {
		((Class157_Sub2) this).anIntArray9203[i]
		    = ((Class157_Sub2) this).anIntArray9203[i] + 7 >> 4;
		((Class157_Sub2) this).anIntArray9204[i]
		    = ((Class157_Sub2) this).anIntArray9204[i] + 7 >> 4;
		((Class157_Sub2) this).anIntArray9177[i]
		    = ((Class157_Sub2) this).anIntArray9177[i] + 7 >> 4;
	    }
	    ((Class157_Sub2) this).aBool9168 = false;
	}
	if (((Class157_Sub2) this).aBool9195) {
	    method8406();
	    ((Class157_Sub2) this).aBool9195 = false;
	}
	((Class157_Sub2) this).aBool9179 = false;
    }
    
    void method8413() {
	synchronized (this) {
	    for (int i = 0; i < ((Class157_Sub2) this).anInt9135; i++) {
		int i_430_ = ((Class157_Sub2) this).anIntArray9177[i];
		((Class157_Sub2) this).anIntArray9177[i]
		    = ((Class157_Sub2) this).anIntArray9203[i];
		((Class157_Sub2) this).anIntArray9203[i] = -i_430_;
	    }
	    method8411();
	}
    }
    
    void method1893(int i, int[] is, int i_431_, int i_432_, int i_433_,
		    boolean bool, int i_434_, int[] is_435_) {
	int i_436_ = is.length;
	if (i == 0) {
	    i_431_ <<= 4;
	    i_432_ <<= 4;
	    i_433_ <<= 4;
	    if (!((Class157_Sub2) this).aBool9168) {
		for (int i_437_ = 0; i_437_ < ((Class157_Sub2) this).anInt9135;
		     i_437_++) {
		    ((Class157_Sub2) this).anIntArray9203[i_437_] <<= 4;
		    ((Class157_Sub2) this).anIntArray9204[i_437_] <<= 4;
		    ((Class157_Sub2) this).anIntArray9177[i_437_] <<= 4;
		}
		((Class157_Sub2) this).aBool9168 = true;
	    }
	    int i_438_ = 0;
	    ((Class157_Sub2) this).anInt9169 = 0;
	    ((Class157_Sub2) this).anInt9170 = 0;
	    ((Class157_Sub2) this).anInt9171 = 0;
	    for (int i_439_ = 0; i_439_ < i_436_; i_439_++) {
		int i_440_ = is[i_439_];
		if (i_440_
		    < ((Class157_Sub2) this).anIntArrayArray9165.length) {
		    int[] is_441_
			= ((Class157_Sub2) this).anIntArrayArray9165[i_440_];
		    for (int i_442_ = 0; i_442_ < is_441_.length; i_442_++) {
			int i_443_ = is_441_[i_442_];
			if (((Class157_Sub2) this).aShortArray9140 == null
			    || (i_434_ & (((Class157_Sub2) this)
					  .aShortArray9140[i_443_])) != 0) {
			    ((Class157_Sub2) this).anInt9169
				+= (((Class157_Sub2) this).anIntArray9203
				    [i_443_]);
			    ((Class157_Sub2) this).anInt9170
				+= (((Class157_Sub2) this).anIntArray9204
				    [i_443_]);
			    ((Class157_Sub2) this).anInt9171
				+= (((Class157_Sub2) this).anIntArray9177
				    [i_443_]);
			    i_438_++;
			}
		    }
		}
	    }
	    if (i_438_ > 0) {
		((Class157_Sub2) this).anInt9169
		    = ((Class157_Sub2) this).anInt9169 / i_438_ + i_431_;
		((Class157_Sub2) this).anInt9170
		    = ((Class157_Sub2) this).anInt9170 / i_438_ + i_432_;
		((Class157_Sub2) this).anInt9171
		    = ((Class157_Sub2) this).anInt9171 / i_438_ + i_433_;
		((Class157_Sub2) this).aBool9172 = true;
	    } else {
		((Class157_Sub2) this).anInt9169 = i_431_;
		((Class157_Sub2) this).anInt9170 = i_432_;
		((Class157_Sub2) this).anInt9171 = i_433_;
	    }
	} else if (i == 1) {
	    if (is_435_ != null) {
		int i_444_ = ((is_435_[0] * i_431_ + is_435_[1] * i_432_
			       + is_435_[2] * i_433_ + 8192)
			      >> 14);
		int i_445_ = ((is_435_[3] * i_431_ + is_435_[4] * i_432_
			       + is_435_[5] * i_433_ + 8192)
			      >> 14);
		int i_446_ = ((is_435_[6] * i_431_ + is_435_[7] * i_432_
			       + is_435_[8] * i_433_ + 8192)
			      >> 14);
		i_431_ = i_444_;
		i_432_ = i_445_;
		i_433_ = i_446_;
	    }
	    i_431_ <<= 4;
	    i_432_ <<= 4;
	    i_433_ <<= 4;
	    if (!((Class157_Sub2) this).aBool9168) {
		for (int i_447_ = 0; i_447_ < ((Class157_Sub2) this).anInt9135;
		     i_447_++) {
		    ((Class157_Sub2) this).anIntArray9203[i_447_] <<= 4;
		    ((Class157_Sub2) this).anIntArray9204[i_447_] <<= 4;
		    ((Class157_Sub2) this).anIntArray9177[i_447_] <<= 4;
		}
		((Class157_Sub2) this).aBool9168 = true;
	    }
	    for (int i_448_ = 0; i_448_ < i_436_; i_448_++) {
		int i_449_ = is[i_448_];
		if (i_449_
		    < ((Class157_Sub2) this).anIntArrayArray9165.length) {
		    int[] is_450_
			= ((Class157_Sub2) this).anIntArrayArray9165[i_449_];
		    for (int i_451_ = 0; i_451_ < is_450_.length; i_451_++) {
			int i_452_ = is_450_[i_451_];
			if (((Class157_Sub2) this).aShortArray9140 == null
			    || (i_434_ & (((Class157_Sub2) this)
					  .aShortArray9140[i_452_])) != 0) {
			    ((Class157_Sub2) this).anIntArray9203[i_452_]
				+= i_431_;
			    ((Class157_Sub2) this).anIntArray9204[i_452_]
				+= i_432_;
			    ((Class157_Sub2) this).anIntArray9177[i_452_]
				+= i_433_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_435_ != null) {
		if (!((Class157_Sub2) this).aBool9168) {
		    for (int i_453_ = 0;
			 i_453_ < ((Class157_Sub2) this).anInt9135; i_453_++) {
			((Class157_Sub2) this).anIntArray9203[i_453_] <<= 4;
			((Class157_Sub2) this).anIntArray9204[i_453_] <<= 4;
			((Class157_Sub2) this).anIntArray9177[i_453_] <<= 4;
		    }
		    ((Class157_Sub2) this).aBool9168 = true;
		}
		int i_454_ = is_435_[9] << 4;
		int i_455_ = is_435_[10] << 4;
		int i_456_ = is_435_[11] << 4;
		int i_457_ = is_435_[12] << 4;
		int i_458_ = is_435_[13] << 4;
		int i_459_ = is_435_[14] << 4;
		if (((Class157_Sub2) this).aBool9172) {
		    int i_460_
			= ((is_435_[0] * ((Class157_Sub2) this).anInt9169
			    + is_435_[3] * ((Class157_Sub2) this).anInt9170
			    + is_435_[6] * ((Class157_Sub2) this).anInt9171
			    + 8192)
			   >> 14);
		    int i_461_
			= ((is_435_[1] * ((Class157_Sub2) this).anInt9169
			    + is_435_[4] * ((Class157_Sub2) this).anInt9170
			    + is_435_[7] * ((Class157_Sub2) this).anInt9171
			    + 8192)
			   >> 14);
		    int i_462_
			= ((is_435_[2] * ((Class157_Sub2) this).anInt9169
			    + is_435_[5] * ((Class157_Sub2) this).anInt9170
			    + is_435_[8] * ((Class157_Sub2) this).anInt9171
			    + 8192)
			   >> 14);
		    i_460_ += i_457_;
		    i_461_ += i_458_;
		    i_462_ += i_459_;
		    ((Class157_Sub2) this).anInt9169 = i_460_;
		    ((Class157_Sub2) this).anInt9170 = i_461_;
		    ((Class157_Sub2) this).anInt9171 = i_462_;
		    ((Class157_Sub2) this).aBool9172 = false;
		}
		int[] is_463_ = new int[9];
		int i_464_ = Class417.anIntArray4767[i_431_];
		int i_465_ = Class417.anIntArray4766[i_431_];
		int i_466_ = Class417.anIntArray4767[i_432_];
		int i_467_ = Class417.anIntArray4766[i_432_];
		int i_468_ = Class417.anIntArray4767[i_433_];
		int i_469_ = Class417.anIntArray4766[i_433_];
		int i_470_ = i_465_ * i_468_ + 8192 >> 14;
		int i_471_ = i_465_ * i_469_ + 8192 >> 14;
		is_463_[0] = i_466_ * i_468_ + i_467_ * i_471_ + 8192 >> 14;
		is_463_[1] = -i_466_ * i_469_ + i_467_ * i_470_ + 8192 >> 14;
		is_463_[2] = i_467_ * i_464_ + 8192 >> 14;
		is_463_[3] = i_464_ * i_469_ + 8192 >> 14;
		is_463_[4] = i_464_ * i_468_ + 8192 >> 14;
		is_463_[5] = -i_465_;
		is_463_[6] = -i_467_ * i_468_ + i_466_ * i_471_ + 8192 >> 14;
		is_463_[7] = i_467_ * i_469_ + i_466_ * i_470_ + 8192 >> 14;
		is_463_[8] = i_466_ * i_464_ + 8192 >> 14;
		int i_472_ = ((is_463_[0] * -((Class157_Sub2) this).anInt9169
			       + is_463_[1] * -((Class157_Sub2) this).anInt9170
			       + is_463_[2] * -((Class157_Sub2) this).anInt9171
			       + 8192)
			      >> 14);
		int i_473_ = ((is_463_[3] * -((Class157_Sub2) this).anInt9169
			       + is_463_[4] * -((Class157_Sub2) this).anInt9170
			       + is_463_[5] * -((Class157_Sub2) this).anInt9171
			       + 8192)
			      >> 14);
		int i_474_ = ((is_463_[6] * -((Class157_Sub2) this).anInt9169
			       + is_463_[7] * -((Class157_Sub2) this).anInt9170
			       + is_463_[8] * -((Class157_Sub2) this).anInt9171
			       + 8192)
			      >> 14);
		int i_475_ = i_472_ + ((Class157_Sub2) this).anInt9169;
		int i_476_ = i_473_ + ((Class157_Sub2) this).anInt9170;
		int i_477_ = i_474_ + ((Class157_Sub2) this).anInt9171;
		int[] is_478_ = new int[9];
		for (int i_479_ = 0; i_479_ < 3; i_479_++) {
		    for (int i_480_ = 0; i_480_ < 3; i_480_++) {
			int i_481_ = 0;
			for (int i_482_ = 0; i_482_ < 3; i_482_++)
			    i_481_ += (is_463_[i_479_ * 3 + i_482_]
				       * is_435_[i_480_ * 3 + i_482_]);
			is_478_[i_479_ * 3 + i_480_] = i_481_ + 8192 >> 14;
		    }
		}
		int i_483_ = ((is_463_[0] * i_457_ + is_463_[1] * i_458_
			       + is_463_[2] * i_459_ + 8192)
			      >> 14);
		int i_484_ = ((is_463_[3] * i_457_ + is_463_[4] * i_458_
			       + is_463_[5] * i_459_ + 8192)
			      >> 14);
		int i_485_ = ((is_463_[6] * i_457_ + is_463_[7] * i_458_
			       + is_463_[8] * i_459_ + 8192)
			      >> 14);
		i_483_ += i_475_;
		i_484_ += i_476_;
		i_485_ += i_477_;
		int[] is_486_ = new int[9];
		for (int i_487_ = 0; i_487_ < 3; i_487_++) {
		    for (int i_488_ = 0; i_488_ < 3; i_488_++) {
			int i_489_ = 0;
			for (int i_490_ = 0; i_490_ < 3; i_490_++)
			    i_489_ += (is_435_[i_487_ * 3 + i_490_]
				       * is_478_[i_488_ + i_490_ * 3]);
			is_486_[i_487_ * 3 + i_488_] = i_489_ + 8192 >> 14;
		    }
		}
		int i_491_ = ((is_435_[0] * i_483_ + is_435_[1] * i_484_
			       + is_435_[2] * i_485_ + 8192)
			      >> 14);
		int i_492_ = ((is_435_[3] * i_483_ + is_435_[4] * i_484_
			       + is_435_[5] * i_485_ + 8192)
			      >> 14);
		int i_493_ = ((is_435_[6] * i_483_ + is_435_[7] * i_484_
			       + is_435_[8] * i_485_ + 8192)
			      >> 14);
		i_491_ += i_454_;
		i_492_ += i_455_;
		i_493_ += i_456_;
		for (int i_494_ = 0; i_494_ < i_436_; i_494_++) {
		    int i_495_ = is[i_494_];
		    if (i_495_
			< ((Class157_Sub2) this).anIntArrayArray9165.length) {
			int[] is_496_ = (((Class157_Sub2) this)
					 .anIntArrayArray9165[i_495_]);
			for (int i_497_ = 0; i_497_ < is_496_.length;
			     i_497_++) {
			    int i_498_ = is_496_[i_497_];
			    if (((Class157_Sub2) this).aShortArray9140 == null
				|| ((i_434_ & (((Class157_Sub2) this)
					       .aShortArray9140[i_498_]))
				    != 0)) {
				int i_499_
				    = (is_486_[0] * (((Class157_Sub2) this)
						     .anIntArray9203[i_498_])
				       + is_486_[1] * (((Class157_Sub2) this)
						       .anIntArray9204[i_498_])
				       + is_486_[2] * (((Class157_Sub2) this)
						       .anIntArray9177[i_498_])
				       + 8192) >> 14;
				int i_500_
				    = (is_486_[3] * (((Class157_Sub2) this)
						     .anIntArray9203[i_498_])
				       + is_486_[4] * (((Class157_Sub2) this)
						       .anIntArray9204[i_498_])
				       + is_486_[5] * (((Class157_Sub2) this)
						       .anIntArray9177[i_498_])
				       + 8192) >> 14;
				int i_501_
				    = (is_486_[6] * (((Class157_Sub2) this)
						     .anIntArray9203[i_498_])
				       + is_486_[7] * (((Class157_Sub2) this)
						       .anIntArray9204[i_498_])
				       + is_486_[8] * (((Class157_Sub2) this)
						       .anIntArray9177[i_498_])
				       + 8192) >> 14;
				i_499_ += i_491_;
				i_500_ += i_492_;
				i_501_ += i_493_;
				((Class157_Sub2) this).anIntArray9203[i_498_]
				    = i_499_;
				((Class157_Sub2) this).anIntArray9204[i_498_]
				    = i_500_;
				((Class157_Sub2) this).anIntArray9177[i_498_]
				    = i_501_;
			    }
			}
		    }
		}
	    } else {
		for (int i_502_ = 0; i_502_ < i_436_; i_502_++) {
		    int i_503_ = is[i_502_];
		    if (i_503_
			< ((Class157_Sub2) this).anIntArrayArray9165.length) {
			int[] is_504_ = (((Class157_Sub2) this)
					 .anIntArrayArray9165[i_503_]);
			for (int i_505_ = 0; i_505_ < is_504_.length;
			     i_505_++) {
			    int i_506_ = is_504_[i_505_];
			    if (((Class157_Sub2) this).aShortArray9140 == null
				|| ((i_434_ & (((Class157_Sub2) this)
					       .aShortArray9140[i_506_]))
				    != 0)) {
				((Class157_Sub2) this).anIntArray9203[i_506_]
				    -= ((Class157_Sub2) this).anInt9169;
				((Class157_Sub2) this).anIntArray9204[i_506_]
				    -= ((Class157_Sub2) this).anInt9170;
				((Class157_Sub2) this).anIntArray9177[i_506_]
				    -= ((Class157_Sub2) this).anInt9171;
				if (i_433_ != 0) {
				    int i_507_
					= Class417.anIntArray4766[i_433_];
				    int i_508_
					= Class417.anIntArray4767[i_433_];
				    int i_509_
					= ((((Class157_Sub2) this)
					    .anIntArray9204[i_506_]) * i_507_
					   + (((Class157_Sub2) this)
					      .anIntArray9203[i_506_]) * i_508_
					   + 16383) >> 14;
				    ((Class157_Sub2) this).anIntArray9204
					[i_506_]
					= ((((Class157_Sub2) this)
					    .anIntArray9204[i_506_]) * i_508_
					   - (((Class157_Sub2) this)
					      .anIntArray9203[i_506_]) * i_507_
					   + 16383) >> 14;
				    ((Class157_Sub2) this).anIntArray9203
					[i_506_]
					= i_509_;
				}
				if (i_431_ != 0) {
				    int i_510_
					= Class417.anIntArray4766[i_431_];
				    int i_511_
					= Class417.anIntArray4767[i_431_];
				    int i_512_
					= ((((Class157_Sub2) this)
					    .anIntArray9204[i_506_]) * i_511_
					   - (((Class157_Sub2) this)
					      .anIntArray9177[i_506_]) * i_510_
					   + 16383) >> 14;
				    ((Class157_Sub2) this).anIntArray9177
					[i_506_]
					= ((((Class157_Sub2) this)
					    .anIntArray9204[i_506_]) * i_510_
					   + (((Class157_Sub2) this)
					      .anIntArray9177[i_506_]) * i_511_
					   + 16383) >> 14;
				    ((Class157_Sub2) this).anIntArray9204
					[i_506_]
					= i_512_;
				}
				if (i_432_ != 0) {
				    int i_513_
					= Class417.anIntArray4766[i_432_];
				    int i_514_
					= Class417.anIntArray4767[i_432_];
				    int i_515_
					= ((((Class157_Sub2) this)
					    .anIntArray9177[i_506_]) * i_513_
					   + (((Class157_Sub2) this)
					      .anIntArray9203[i_506_]) * i_514_
					   + 16383) >> 14;
				    ((Class157_Sub2) this).anIntArray9177
					[i_506_]
					= ((((Class157_Sub2) this)
					    .anIntArray9177[i_506_]) * i_514_
					   - (((Class157_Sub2) this)
					      .anIntArray9203[i_506_]) * i_513_
					   + 16383) >> 14;
				    ((Class157_Sub2) this).anIntArray9203
					[i_506_]
					= i_515_;
				}
				((Class157_Sub2) this).anIntArray9203[i_506_]
				    += ((Class157_Sub2) this).anInt9169;
				((Class157_Sub2) this).anIntArray9204[i_506_]
				    += ((Class157_Sub2) this).anInt9170;
				((Class157_Sub2) this).anIntArray9177[i_506_]
				    += ((Class157_Sub2) this).anInt9171;
			    }
			}
		    }
		}
	    }
	} else if (i == 3) {
	    if (is_435_ != null) {
		if (!((Class157_Sub2) this).aBool9168) {
		    for (int i_516_ = 0;
			 i_516_ < ((Class157_Sub2) this).anInt9135; i_516_++) {
			((Class157_Sub2) this).anIntArray9203[i_516_] <<= 4;
			((Class157_Sub2) this).anIntArray9204[i_516_] <<= 4;
			((Class157_Sub2) this).anIntArray9177[i_516_] <<= 4;
		    }
		    ((Class157_Sub2) this).aBool9168 = true;
		}
		int i_517_ = is_435_[9] << 4;
		int i_518_ = is_435_[10] << 4;
		int i_519_ = is_435_[11] << 4;
		int i_520_ = is_435_[12] << 4;
		int i_521_ = is_435_[13] << 4;
		int i_522_ = is_435_[14] << 4;
		if (((Class157_Sub2) this).aBool9172) {
		    int i_523_
			= ((is_435_[0] * ((Class157_Sub2) this).anInt9169
			    + is_435_[3] * ((Class157_Sub2) this).anInt9170
			    + is_435_[6] * ((Class157_Sub2) this).anInt9171
			    + 8192)
			   >> 14);
		    int i_524_
			= ((is_435_[1] * ((Class157_Sub2) this).anInt9169
			    + is_435_[4] * ((Class157_Sub2) this).anInt9170
			    + is_435_[7] * ((Class157_Sub2) this).anInt9171
			    + 8192)
			   >> 14);
		    int i_525_
			= ((is_435_[2] * ((Class157_Sub2) this).anInt9169
			    + is_435_[5] * ((Class157_Sub2) this).anInt9170
			    + is_435_[8] * ((Class157_Sub2) this).anInt9171
			    + 8192)
			   >> 14);
		    i_523_ += i_520_;
		    i_524_ += i_521_;
		    i_525_ += i_522_;
		    ((Class157_Sub2) this).anInt9169 = i_523_;
		    ((Class157_Sub2) this).anInt9170 = i_524_;
		    ((Class157_Sub2) this).anInt9171 = i_525_;
		    ((Class157_Sub2) this).aBool9172 = false;
		}
		int i_526_ = i_431_ << 15 >> 7;
		int i_527_ = i_432_ << 15 >> 7;
		int i_528_ = i_433_ << 15 >> 7;
		int i_529_
		    = i_526_ * -((Class157_Sub2) this).anInt9169 + 8192 >> 14;
		int i_530_
		    = i_527_ * -((Class157_Sub2) this).anInt9170 + 8192 >> 14;
		int i_531_
		    = i_528_ * -((Class157_Sub2) this).anInt9171 + 8192 >> 14;
		int i_532_ = i_529_ + ((Class157_Sub2) this).anInt9169;
		int i_533_ = i_530_ + ((Class157_Sub2) this).anInt9170;
		int i_534_ = i_531_ + ((Class157_Sub2) this).anInt9171;
		int[] is_535_ = new int[9];
		is_535_[0] = i_526_ * is_435_[0] + 8192 >> 14;
		is_535_[1] = i_526_ * is_435_[3] + 8192 >> 14;
		is_535_[2] = i_526_ * is_435_[6] + 8192 >> 14;
		is_535_[3] = i_527_ * is_435_[1] + 8192 >> 14;
		is_535_[4] = i_527_ * is_435_[4] + 8192 >> 14;
		is_535_[5] = i_527_ * is_435_[7] + 8192 >> 14;
		is_535_[6] = i_528_ * is_435_[2] + 8192 >> 14;
		is_535_[7] = i_528_ * is_435_[5] + 8192 >> 14;
		is_535_[8] = i_528_ * is_435_[8] + 8192 >> 14;
		int i_536_ = i_526_ * i_520_ + 8192 >> 14;
		int i_537_ = i_527_ * i_521_ + 8192 >> 14;
		int i_538_ = i_528_ * i_522_ + 8192 >> 14;
		i_536_ += i_532_;
		i_537_ += i_533_;
		i_538_ += i_534_;
		int[] is_539_ = new int[9];
		for (int i_540_ = 0; i_540_ < 3; i_540_++) {
		    for (int i_541_ = 0; i_541_ < 3; i_541_++) {
			int i_542_ = 0;
			for (int i_543_ = 0; i_543_ < 3; i_543_++)
			    i_542_ += (is_435_[i_540_ * 3 + i_543_]
				       * is_535_[i_541_ + i_543_ * 3]);
			is_539_[i_540_ * 3 + i_541_] = i_542_ + 8192 >> 14;
		    }
		}
		int i_544_ = ((is_435_[0] * i_536_ + is_435_[1] * i_537_
			       + is_435_[2] * i_538_ + 8192)
			      >> 14);
		int i_545_ = ((is_435_[3] * i_536_ + is_435_[4] * i_537_
			       + is_435_[5] * i_538_ + 8192)
			      >> 14);
		int i_546_ = ((is_435_[6] * i_536_ + is_435_[7] * i_537_
			       + is_435_[8] * i_538_ + 8192)
			      >> 14);
		i_544_ += i_517_;
		i_545_ += i_518_;
		i_546_ += i_519_;
		for (int i_547_ = 0; i_547_ < i_436_; i_547_++) {
		    int i_548_ = is[i_547_];
		    if (i_548_
			< ((Class157_Sub2) this).anIntArrayArray9165.length) {
			int[] is_549_ = (((Class157_Sub2) this)
					 .anIntArrayArray9165[i_548_]);
			for (int i_550_ = 0; i_550_ < is_549_.length;
			     i_550_++) {
			    int i_551_ = is_549_[i_550_];
			    if (((Class157_Sub2) this).aShortArray9140 == null
				|| ((i_434_ & (((Class157_Sub2) this)
					       .aShortArray9140[i_551_]))
				    != 0)) {
				int i_552_
				    = (is_539_[0] * (((Class157_Sub2) this)
						     .anIntArray9203[i_551_])
				       + is_539_[1] * (((Class157_Sub2) this)
						       .anIntArray9204[i_551_])
				       + is_539_[2] * (((Class157_Sub2) this)
						       .anIntArray9177[i_551_])
				       + 8192) >> 14;
				int i_553_
				    = (is_539_[3] * (((Class157_Sub2) this)
						     .anIntArray9203[i_551_])
				       + is_539_[4] * (((Class157_Sub2) this)
						       .anIntArray9204[i_551_])
				       + is_539_[5] * (((Class157_Sub2) this)
						       .anIntArray9177[i_551_])
				       + 8192) >> 14;
				int i_554_
				    = (is_539_[6] * (((Class157_Sub2) this)
						     .anIntArray9203[i_551_])
				       + is_539_[7] * (((Class157_Sub2) this)
						       .anIntArray9204[i_551_])
				       + is_539_[8] * (((Class157_Sub2) this)
						       .anIntArray9177[i_551_])
				       + 8192) >> 14;
				i_552_ += i_544_;
				i_553_ += i_545_;
				i_554_ += i_546_;
				((Class157_Sub2) this).anIntArray9203[i_551_]
				    = i_552_;
				((Class157_Sub2) this).anIntArray9204[i_551_]
				    = i_553_;
				((Class157_Sub2) this).anIntArray9177[i_551_]
				    = i_554_;
			    }
			}
		    }
		}
	    } else {
		for (int i_555_ = 0; i_555_ < i_436_; i_555_++) {
		    int i_556_ = is[i_555_];
		    if (i_556_
			< ((Class157_Sub2) this).anIntArrayArray9165.length) {
			int[] is_557_ = (((Class157_Sub2) this)
					 .anIntArrayArray9165[i_556_]);
			for (int i_558_ = 0; i_558_ < is_557_.length;
			     i_558_++) {
			    int i_559_ = is_557_[i_558_];
			    if (((Class157_Sub2) this).aShortArray9140 == null
				|| ((i_434_ & (((Class157_Sub2) this)
					       .aShortArray9140[i_559_]))
				    != 0)) {
				((Class157_Sub2) this).anIntArray9203[i_559_]
				    -= ((Class157_Sub2) this).anInt9169;
				((Class157_Sub2) this).anIntArray9204[i_559_]
				    -= ((Class157_Sub2) this).anInt9170;
				((Class157_Sub2) this).anIntArray9177[i_559_]
				    -= ((Class157_Sub2) this).anInt9171;
				((Class157_Sub2) this).anIntArray9203[i_559_]
				    = (((Class157_Sub2) this).anIntArray9203
				       [i_559_]) * i_431_ / 128;
				((Class157_Sub2) this).anIntArray9204[i_559_]
				    = (((Class157_Sub2) this).anIntArray9204
				       [i_559_]) * i_432_ / 128;
				((Class157_Sub2) this).anIntArray9177[i_559_]
				    = (((Class157_Sub2) this).anIntArray9177
				       [i_559_]) * i_433_ / 128;
				((Class157_Sub2) this).anIntArray9203[i_559_]
				    += ((Class157_Sub2) this).anInt9169;
				((Class157_Sub2) this).anIntArray9204[i_559_]
				    += ((Class157_Sub2) this).anInt9170;
				((Class157_Sub2) this).anIntArray9177[i_559_]
				    += ((Class157_Sub2) this).anInt9171;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class157_Sub2) this).anIntArrayArray9166 != null
		&& ((Class157_Sub2) this).aByteArray9160 != null) {
		for (int i_560_ = 0; i_560_ < i_436_; i_560_++) {
		    int i_561_ = is[i_560_];
		    if (i_561_
			< ((Class157_Sub2) this).anIntArrayArray9166.length) {
			int[] is_562_ = (((Class157_Sub2) this)
					 .anIntArrayArray9166[i_561_]);
			for (int i_563_ = 0; i_563_ < is_562_.length;
			     i_563_++) {
			    int i_564_ = is_562_[i_563_];
			    if (((Class157_Sub2) this).aShortArray9163 == null
				|| ((i_434_ & (((Class157_Sub2) this)
					       .aShortArray9163[i_564_]))
				    != 0)) {
				int i_565_ = (((((Class157_Sub2) this)
						.aByteArray9160[i_564_])
					       & 0xff)
					      + i_431_ * 8);
				if (i_565_ < 0)
				    i_565_ = 0;
				else if (i_565_ > 255)
				    i_565_ = 255;
				((Class157_Sub2) this).aByteArray9160[i_564_]
				    = (byte) i_565_;
			    }
			}
		    }
		}
		if (((Class157_Sub2) this).aClass90Array9156 != null) {
		    for (int i_566_ = 0;
			 i_566_ < ((Class157_Sub2) this).anInt9175; i_566_++) {
			Class90 class90
			    = ((Class157_Sub2) this).aClass90Array9156[i_566_];
			Class108 class108 = (((Class157_Sub2) this)
					     .aClass108Array9123[i_566_]);
			((Class108) class108).anInt1368
			    = ((((Class108) class108).anInt1368 * -1351793475
				& 0xffffff)
			       | 255 - ((((Class157_Sub2) this).aByteArray9160
					 [(((Class90) class90).anInt1142
					   * 1037728387)])
					& 0xff) << 24) * 323344021;
		    }
		}
	    }
	} else if (i == 7) {
	    if (((Class157_Sub2) this).anIntArrayArray9166 != null) {
		for (int i_567_ = 0; i_567_ < i_436_; i_567_++) {
		    int i_568_ = is[i_567_];
		    if (i_568_
			< ((Class157_Sub2) this).anIntArrayArray9166.length) {
			int[] is_569_ = (((Class157_Sub2) this)
					 .anIntArrayArray9166[i_568_]);
			for (int i_570_ = 0; i_570_ < is_569_.length;
			     i_570_++) {
			    int i_571_ = is_569_[i_570_];
			    if (((Class157_Sub2) this).aShortArray9163 == null
				|| ((i_434_ & (((Class157_Sub2) this)
					       .aShortArray9163[i_571_]))
				    != 0)) {
				int i_572_ = ((((Class157_Sub2) this)
					       .aShortArray9162[i_571_])
					      & 0xffff);
				int i_573_ = i_572_ >> 10 & 0x3f;
				int i_574_ = i_572_ >> 7 & 0x7;
				int i_575_ = i_572_ & 0x7f;
				i_573_ = i_573_ + i_431_ & 0x3f;
				i_574_ += i_432_;
				if (i_574_ < 0)
				    i_574_ = 0;
				else if (i_574_ > 7)
				    i_574_ = 7;
				i_575_ += i_433_;
				if (i_575_ < 0)
				    i_575_ = 0;
				else if (i_575_ > 127)
				    i_575_ = 127;
				((Class157_Sub2) this).aShortArray9162[i_571_]
				    = (short) (i_573_ << 10 | i_574_ << 7
					       | i_575_);
			    }
			}
			((Class157_Sub2) this).aBool9195 = true;
		    }
		}
		if (((Class157_Sub2) this).aClass90Array9156 != null) {
		    for (int i_576_ = 0;
			 i_576_ < ((Class157_Sub2) this).anInt9175; i_576_++) {
			Class90 class90
			    = ((Class157_Sub2) this).aClass90Array9156[i_576_];
			Class108 class108 = (((Class157_Sub2) this)
					     .aClass108Array9123[i_576_]);
			((Class108) class108).anInt1368
			    = (((((Class108) class108).anInt1368 * -1351793475
				 & ~0xffffff)
				| (Class72.anIntArray777
				   [(Class516.method6283
				     ((((Class157_Sub2) this).aShortArray9162
				       [(((Class90) class90).anInt1142
					 * 1037728387)]) & 0xffff,
				      515814180)) & 0xffff]) & 0xffffff)
			       * 323344021);
		    }
		}
	    }
	} else if (i == 8) {
	    if (((Class157_Sub2) this).anIntArrayArray9178 != null) {
		for (int i_577_ = 0; i_577_ < i_436_; i_577_++) {
		    int i_578_ = is[i_577_];
		    if (i_578_
			< ((Class157_Sub2) this).anIntArrayArray9178.length) {
			int[] is_579_ = (((Class157_Sub2) this)
					 .anIntArrayArray9178[i_578_]);
			for (int i_580_ = 0; i_580_ < is_579_.length;
			     i_580_++) {
			    Class108 class108
				= (((Class157_Sub2) this).aClass108Array9123
				   [is_579_[i_580_]]);
			    ((Class108) class108).anInt1365
				+= i_431_ * -731787657;
			    ((Class108) class108).anInt1366
				+= i_432_ * 1335672291;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class157_Sub2) this).anIntArrayArray9178 != null) {
		for (int i_581_ = 0; i_581_ < i_436_; i_581_++) {
		    int i_582_ = is[i_581_];
		    if (i_582_
			< ((Class157_Sub2) this).anIntArrayArray9178.length) {
			int[] is_583_ = (((Class157_Sub2) this)
					 .anIntArrayArray9178[i_582_]);
			for (int i_584_ = 0; i_584_ < is_583_.length;
			     i_584_++) {
			    Class108 class108
				= (((Class157_Sub2) this).aClass108Array9123
				   [is_583_[i_584_]]);
			    ((Class108) class108).aFloat1363
				= (((Class108) class108).aFloat1363
				   * (float) i_431_ / 128.0F);
			    ((Class108) class108).aFloat1364
				= (((Class108) class108).aFloat1364
				   * (float) i_432_ / 128.0F);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class157_Sub2) this).anIntArrayArray9178 != null) {
		for (int i_585_ = 0; i_585_ < i_436_; i_585_++) {
		    int i_586_ = is[i_585_];
		    if (i_586_
			< ((Class157_Sub2) this).anIntArrayArray9178.length) {
			int[] is_587_ = (((Class157_Sub2) this)
					 .anIntArrayArray9178[i_586_]);
			for (int i_588_ = 0; i_588_ < is_587_.length;
			     i_588_++) {
			    Class108 class108
				= (((Class157_Sub2) this).aClass108Array9123
				   [is_587_[i_588_]]);
			    ((Class108) class108).anInt1367
				= ((((Class108) class108).anInt1367 * 337890173
				    + i_431_)
				   & 0x3fff) * 1644905941;
			}
		    }
		}
	    }
	}
    }
    
    void method1894(int i, int i_589_, int i_590_, int i_591_) {
	if (i == 0) {
	    int i_592_ = 0;
	    ((Class157_Sub2) this).anInt9169 = 0;
	    ((Class157_Sub2) this).anInt9170 = 0;
	    ((Class157_Sub2) this).anInt9171 = 0;
	    for (int i_593_ = 0; i_593_ < ((Class157_Sub2) this).anInt9135;
		 i_593_++) {
		((Class157_Sub2) this).anInt9169
		    += ((Class157_Sub2) this).anIntArray9203[i_593_];
		((Class157_Sub2) this).anInt9170
		    += ((Class157_Sub2) this).anIntArray9204[i_593_];
		((Class157_Sub2) this).anInt9171
		    += ((Class157_Sub2) this).anIntArray9177[i_593_];
		i_592_++;
	    }
	    if (i_592_ > 0) {
		((Class157_Sub2) this).anInt9169
		    = ((Class157_Sub2) this).anInt9169 / i_592_ + i_589_;
		((Class157_Sub2) this).anInt9170
		    = ((Class157_Sub2) this).anInt9170 / i_592_ + i_590_;
		((Class157_Sub2) this).anInt9171
		    = ((Class157_Sub2) this).anInt9171 / i_592_ + i_591_;
	    } else {
		((Class157_Sub2) this).anInt9169 = i_589_;
		((Class157_Sub2) this).anInt9170 = i_590_;
		((Class157_Sub2) this).anInt9171 = i_591_;
	    }
	} else if (i == 1) {
	    for (int i_594_ = 0; i_594_ < ((Class157_Sub2) this).anInt9135;
		 i_594_++) {
		((Class157_Sub2) this).anIntArray9203[i_594_] += i_589_;
		((Class157_Sub2) this).anIntArray9204[i_594_] += i_590_;
		((Class157_Sub2) this).anIntArray9177[i_594_] += i_591_;
	    }
	} else if (i == 2) {
	    for (int i_595_ = 0; i_595_ < ((Class157_Sub2) this).anInt9135;
		 i_595_++) {
		((Class157_Sub2) this).anIntArray9203[i_595_]
		    -= ((Class157_Sub2) this).anInt9169;
		((Class157_Sub2) this).anIntArray9204[i_595_]
		    -= ((Class157_Sub2) this).anInt9170;
		((Class157_Sub2) this).anIntArray9177[i_595_]
		    -= ((Class157_Sub2) this).anInt9171;
		if (i_591_ != 0) {
		    int i_596_ = Class417.anIntArray4766[i_591_];
		    int i_597_ = Class417.anIntArray4767[i_591_];
		    int i_598_
			= (((((Class157_Sub2) this).anIntArray9204[i_595_]
			     * i_596_)
			    + (((Class157_Sub2) this).anIntArray9203[i_595_]
			       * i_597_)
			    + 16383)
			   >> 14);
		    ((Class157_Sub2) this).anIntArray9204[i_595_]
			= ((((Class157_Sub2) this).anIntArray9204[i_595_]
			    * i_597_)
			   - (((Class157_Sub2) this).anIntArray9203[i_595_]
			      * i_596_)
			   + 16383) >> 14;
		    ((Class157_Sub2) this).anIntArray9203[i_595_] = i_598_;
		}
		if (i_589_ != 0) {
		    int i_599_ = Class417.anIntArray4766[i_589_];
		    int i_600_ = Class417.anIntArray4767[i_589_];
		    int i_601_
			= (((((Class157_Sub2) this).anIntArray9204[i_595_]
			     * i_600_)
			    - (((Class157_Sub2) this).anIntArray9177[i_595_]
			       * i_599_)
			    + 16383)
			   >> 14);
		    ((Class157_Sub2) this).anIntArray9177[i_595_]
			= ((((Class157_Sub2) this).anIntArray9204[i_595_]
			    * i_599_)
			   + (((Class157_Sub2) this).anIntArray9177[i_595_]
			      * i_600_)
			   + 16383) >> 14;
		    ((Class157_Sub2) this).anIntArray9204[i_595_] = i_601_;
		}
		if (i_590_ != 0) {
		    int i_602_ = Class417.anIntArray4766[i_590_];
		    int i_603_ = Class417.anIntArray4767[i_590_];
		    int i_604_
			= (((((Class157_Sub2) this).anIntArray9177[i_595_]
			     * i_602_)
			    + (((Class157_Sub2) this).anIntArray9203[i_595_]
			       * i_603_)
			    + 16383)
			   >> 14);
		    ((Class157_Sub2) this).anIntArray9177[i_595_]
			= ((((Class157_Sub2) this).anIntArray9177[i_595_]
			    * i_603_)
			   - (((Class157_Sub2) this).anIntArray9203[i_595_]
			      * i_602_)
			   + 16383) >> 14;
		    ((Class157_Sub2) this).anIntArray9203[i_595_] = i_604_;
		}
		((Class157_Sub2) this).anIntArray9203[i_595_]
		    += ((Class157_Sub2) this).anInt9169;
		((Class157_Sub2) this).anIntArray9204[i_595_]
		    += ((Class157_Sub2) this).anInt9170;
		((Class157_Sub2) this).anIntArray9177[i_595_]
		    += ((Class157_Sub2) this).anInt9171;
	    }
	} else if (i == 3) {
	    for (int i_605_ = 0; i_605_ < ((Class157_Sub2) this).anInt9135;
		 i_605_++) {
		((Class157_Sub2) this).anIntArray9203[i_605_]
		    -= ((Class157_Sub2) this).anInt9169;
		((Class157_Sub2) this).anIntArray9204[i_605_]
		    -= ((Class157_Sub2) this).anInt9170;
		((Class157_Sub2) this).anIntArray9177[i_605_]
		    -= ((Class157_Sub2) this).anInt9171;
		((Class157_Sub2) this).anIntArray9203[i_605_]
		    = (((Class157_Sub2) this).anIntArray9203[i_605_] * i_589_
		       / 128);
		((Class157_Sub2) this).anIntArray9204[i_605_]
		    = (((Class157_Sub2) this).anIntArray9204[i_605_] * i_590_
		       / 128);
		((Class157_Sub2) this).anIntArray9177[i_605_]
		    = (((Class157_Sub2) this).anIntArray9177[i_605_] * i_591_
		       / 128);
		((Class157_Sub2) this).anIntArray9203[i_605_]
		    += ((Class157_Sub2) this).anInt9169;
		((Class157_Sub2) this).anIntArray9204[i_605_]
		    += ((Class157_Sub2) this).anInt9170;
		((Class157_Sub2) this).anIntArray9177[i_605_]
		    += ((Class157_Sub2) this).anInt9171;
	    }
	} else if (i == 5) {
	    for (int i_606_ = 0; i_606_ < ((Class157_Sub2) this).anInt9143;
		 i_606_++) {
		int i_607_
		    = ((((Class157_Sub2) this).aByteArray9160[i_606_] & 0xff)
		       + i_589_ * 8);
		if (i_607_ < 0)
		    i_607_ = 0;
		else if (i_607_ > 255)
		    i_607_ = 255;
		((Class157_Sub2) this).aByteArray9160[i_606_] = (byte) i_607_;
	    }
	    if (((Class157_Sub2) this).aClass90Array9156 != null) {
		for (int i_608_ = 0; i_608_ < ((Class157_Sub2) this).anInt9175;
		     i_608_++) {
		    Class90 class90
			= ((Class157_Sub2) this).aClass90Array9156[i_608_];
		    Class108 class108
			= ((Class157_Sub2) this).aClass108Array9123[i_608_];
		    ((Class108) class108).anInt1368
			= ((((Class108) class108).anInt1368 * -1351793475
			    & 0xffffff)
			   | (255
			      - ((((Class157_Sub2) this).aByteArray9160
				  [((Class90) class90).anInt1142 * 1037728387])
				 & 0xff)) << 24) * 323344021;
		}
	    }
	} else if (i == 7) {
	    for (int i_609_ = 0; i_609_ < ((Class157_Sub2) this).anInt9143;
		 i_609_++) {
		int i_610_
		    = ((Class157_Sub2) this).aShortArray9162[i_609_] & 0xffff;
		int i_611_ = i_610_ >> 10 & 0x3f;
		int i_612_ = i_610_ >> 7 & 0x7;
		int i_613_ = i_610_ & 0x7f;
		i_611_ = i_611_ + i_589_ & 0x3f;
		i_612_ += i_590_;
		if (i_612_ < 0)
		    i_612_ = 0;
		else if (i_612_ > 7)
		    i_612_ = 7;
		i_613_ += i_591_;
		if (i_613_ < 0)
		    i_613_ = 0;
		else if (i_613_ > 127)
		    i_613_ = 127;
		((Class157_Sub2) this).aShortArray9162[i_609_]
		    = (short) (i_611_ << 10 | i_612_ << 7 | i_613_);
	    }
	    ((Class157_Sub2) this).aBool9195 = true;
	    if (((Class157_Sub2) this).aClass90Array9156 != null) {
		for (int i_614_ = 0; i_614_ < ((Class157_Sub2) this).anInt9175;
		     i_614_++) {
		    Class90 class90
			= ((Class157_Sub2) this).aClass90Array9156[i_614_];
		    Class108 class108
			= ((Class157_Sub2) this).aClass108Array9123[i_614_];
		    ((Class108) class108).anInt1368
			= ((((Class108) class108).anInt1368 * -1351793475
			    & ~0xffffff)
			   | ((Class72.anIntArray777
			       [Class516.method6283(((((Class157_Sub2) this)
						      .aShortArray9162
						      [((((Class90) class90)
							 .anInt1142)
							* 1037728387)])
						     & 0xffff),
						    515814180) & 0xffff])
			      & 0xffffff)) * 323344021;
		}
	    }
	} else if (i == 8) {
	    for (int i_615_ = 0; i_615_ < ((Class157_Sub2) this).anInt9175;
		 i_615_++) {
		Class108 class108
		    = ((Class157_Sub2) this).aClass108Array9123[i_615_];
		((Class108) class108).anInt1365 += i_589_ * -731787657;
		((Class108) class108).anInt1366 += i_590_ * 1335672291;
	    }
	} else if (i == 10) {
	    for (int i_616_ = 0; i_616_ < ((Class157_Sub2) this).anInt9175;
		 i_616_++) {
		Class108 class108
		    = ((Class157_Sub2) this).aClass108Array9123[i_616_];
		((Class108) class108).aFloat1363
		    = (((Class108) class108).aFloat1363 * (float) i_589_
		       / 128.0F);
		((Class108) class108).aFloat1364
		    = (((Class108) class108).aFloat1364 * (float) i_590_
		       / 128.0F);
	    }
	} else if (i == 9) {
	    for (int i_617_ = 0; i_617_ < ((Class157_Sub2) this).anInt9175;
		 i_617_++) {
		Class108 class108
		    = ((Class157_Sub2) this).aClass108Array9123[i_617_];
		((Class108) class108).anInt1367
		    = (((Class108) class108).anInt1367 * 337890173 + i_589_
		       & 0x3fff) * 1644905941;
	    }
	}
    }
    
    public void method1986(int i) {
	if ((((Class157_Sub2) this).anInt9132 & 0x1000) != 4096)
	    throw new IllegalStateException();
	((Class157_Sub2) this).anInt9133 = i;
	((Class157_Sub2) this).anInt9152 = 0;
    }
    
    public int method2004() {
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	return ((Class157_Sub2) this).aShort9144;
    }
    
    public void method2026() {
	/* empty */
    }
    
    public int method1984() {
	if (!((Class157_Sub2) this).aBool9187)
	    method1909();
	return ((Class157_Sub2) this).aShort9189;
    }
    
    final void method8414(boolean bool, boolean bool_618_, boolean bool_619_) {
	for (int i = 0; i < ((Class157_Sub2) this).anInt9175; i++) {
	    Class90 class90 = ((Class157_Sub2) this).aClass90Array9156[i];
	    if (((Class90) class90).aBool1138) {
		Class108 class108
		    = ((Class157_Sub2) this).aClass108Array9123[i];
		((Class157_Sub2) this).aClass173_Sub3_9130.method8942
		    (bool, bool_618_, bool_619_,
		     ((Class108) class108).anInt1362 * -133963703,
		     ((Class108) class108).anInt1372 * 1913317541,
		     ((Class108) class108).aFloat1369,
		     ((Class108) class108).anInt1370 * 1267848291,
		     ((Class108) class108).anInt1371 * -871349143,
		     ((Class90) class90).aShort1139,
		     ((Class108) class108).anInt1368 * -1351793475,
		     ((Class90) class90).aByte1136,
		     ((Class90) class90).aByte1140);
	    }
	}
    }
    
    final boolean method8415(int i) {
	if (((Class157_Sub2) this).aByteArray9160 == null)
	    return false;
	if (((Class157_Sub2) this).aByteArray9160[i] == 0)
	    return false;
	return true;
    }
    
    final boolean method8416(int i) {
	if (((Class157_Sub2) this).anIntArray9193 == null)
	    return false;
	if (((Class157_Sub2) this).anIntArray9193[i] == -1)
	    return false;
	return true;
    }
    
    final void method8417(boolean bool, boolean bool_620_, boolean bool_621_,
			  int i, boolean bool_622_, boolean bool_623_) {
	if (((Class157_Sub2) this).anIntArray9188[i] != -2) {
	    short i_624_ = ((Class157_Sub2) this).aShortArray9145[i];
	    short i_625_ = ((Class157_Sub2) this).aShortArray9146[i];
	    short i_626_ = ((Class157_Sub2) this).aShortArray9147[i];
	    float f = ((Class157_Sub2) this).aFloatArray9126[i_624_];
	    float f_627_ = ((Class157_Sub2) this).aFloatArray9126[i_625_];
	    float f_628_ = ((Class157_Sub2) this).aFloatArray9126[i_626_];
	    if (!bool_622_
		|| f != -5000.0F && f_627_ != -5000.0F && f_628_ != -5000.0F) {
		float f_629_ = ((Class157_Sub2) this).aFloatArray9119[i_624_];
		float f_630_ = ((Class157_Sub2) this).aFloatArray9119[i_625_];
		float f_631_ = ((Class157_Sub2) this).aFloatArray9119[i_626_];
		if (((Class157_Sub2) this).anIntArray9193[i] != -1
		    || ((f - f_627_) * (f_631_ - f_630_)
			- (f_629_ - f_630_) * (f_628_ - f_627_)) > 0.0F) {
		    if (f < 0.0F || f_627_ < 0.0F || f_628_ < 0.0F
			|| f > (float) ((((Class107) (((Class157_Sub2) this)
						      .aClass107_9121))
					 .anInt1352)
					* 548210343)
			|| (f_627_
			    > (float) (((Class107) (((Class157_Sub2) this)
						    .aClass107_9121)).anInt1352
				       * 548210343))
			|| (f_628_
			    > (float) (((Class107) (((Class157_Sub2) this)
						    .aClass107_9121)).anInt1352
				       * 548210343)))
			((Class121) ((Class157_Sub2) this).aClass121_9200)
			    .aBool1504
			    = true;
		    else
			((Class121) ((Class157_Sub2) this).aClass121_9200)
			    .aBool1504
			    = false;
		    if (bool_623_) {
			int i_632_ = ((Class157_Sub2) this).anIntArray9193[i];
			if (i_632_ == -1 || !((Class90) (((Class157_Sub2) this)
							 .aClass90Array9156
							 [i_632_])).aBool1138)
			    method8419(bool, bool_620_, bool_621_, i);
		    } else {
			int i_633_ = ((Class157_Sub2) this).anIntArray9193[i];
			if (i_633_ != -1) {
			    Class90 class90 = (((Class157_Sub2) this)
					       .aClass90Array9156[i_633_]);
			    Class108 class108 = (((Class157_Sub2) this)
						 .aClass108Array9123[i_633_]);
			    if (!((Class90) class90).aBool1138)
				method8418(bool, bool_620_, bool_621_, i);
			    ((Class157_Sub2) this).aClass173_Sub3_9130
				.method8942
				(bool, bool_620_, bool_621_,
				 ((Class108) class108).anInt1362 * -133963703,
				 ((Class108) class108).anInt1372 * 1913317541,
				 ((Class108) class108).aFloat1369,
				 ((Class108) class108).anInt1370 * 1267848291,
				 ((Class108) class108).anInt1371 * -871349143,
				 ((Class90) class90).aShort1139,
				 ((Class108) class108).anInt1368 * -1351793475,
				 ((Class90) class90).aByte1136,
				 ((Class90) class90).aByte1140);
			} else
			    method8418(bool, bool_620_, bool_621_, i);
		    }
		}
	    }
	}
    }
    
    final void method8418(boolean bool, boolean bool_634_, boolean bool_635_,
			  int i) {
	short i_636_ = ((Class157_Sub2) this).aShortArray9145[i];
	short i_637_ = ((Class157_Sub2) this).aShortArray9146[i];
	short i_638_ = ((Class157_Sub2) this).aShortArray9147[i];
	boolean bool_639_ = false;
	if (((Class157_Sub2) this).aShortArray9205 != null
	    && ((Class157_Sub2) this).aShortArray9205[i] != -1)
	    bool_639_ = (((Class157_Sub2) this).aClass173_Sub3_9130
			     .aClass165_1984.method2093
			 (((Class157_Sub2) this).aShortArray9205[i] & 0xffff,
			  (byte) -3)
			 .aBool1768);
	if (!bool_639_) {
	    if (((Class157_Sub2) this).aByteArray9160 == null)
		((Class121) ((Class157_Sub2) this).aClass121_9200).anInt1526
		    = 0;
	    else
		((Class121) ((Class157_Sub2) this).aClass121_9200).anInt1526
		    = ((Class157_Sub2) this).aByteArray9160[i] & 0xff;
	    if (((Class157_Sub2) this).anIntArray9188[i] == -1)
		((Class157_Sub2) this).aClass121_9200.method1582
		    (bool, bool_634_, bool_635_,
		     ((Class157_Sub2) this).aFloatArray9119[i_636_],
		     ((Class157_Sub2) this).aFloatArray9119[i_637_],
		     ((Class157_Sub2) this).aFloatArray9119[i_638_],
		     ((Class157_Sub2) this).aFloatArray9126[i_636_],
		     ((Class157_Sub2) this).aFloatArray9126[i_637_],
		     ((Class157_Sub2) this).aFloatArray9126[i_638_],
		     ((Class157_Sub2) this).aFloatArray9137[i_636_],
		     ((Class157_Sub2) this).aFloatArray9137[i_637_],
		     ((Class157_Sub2) this).aFloatArray9137[i_638_],
		     (Class72.anIntArray777
		      [((Class157_Sub2) this).anIntArray9150[i] & 0xffff]));
	    else
		((Class157_Sub2) this).aClass121_9200.method1576
		    (bool, bool_634_, bool_635_,
		     ((Class157_Sub2) this).aFloatArray9119[i_636_],
		     ((Class157_Sub2) this).aFloatArray9119[i_637_],
		     ((Class157_Sub2) this).aFloatArray9119[i_638_],
		     ((Class157_Sub2) this).aFloatArray9126[i_636_],
		     ((Class157_Sub2) this).aFloatArray9126[i_637_],
		     ((Class157_Sub2) this).aFloatArray9126[i_638_],
		     ((Class157_Sub2) this).aFloatArray9137[i_636_],
		     ((Class157_Sub2) this).aFloatArray9137[i_637_],
		     ((Class157_Sub2) this).aFloatArray9137[i_638_],
		     (float) (((Class157_Sub2) this).anIntArray9150[i]
			      & 0xffff),
		     (float) (((Class157_Sub2) this).anIntArray9151[i]
			      & 0xffff),
		     (float) (((Class157_Sub2) this).anIntArray9188[i]
			      & 0xffff));
	} else {
	    int i_640_ = -16777216;
	    if (((Class157_Sub2) this).aByteArray9160 != null)
		i_640_ = 255 - (((Class157_Sub2) this).aByteArray9160[i]
				& 0xff) << 24;
	    if (((Class157_Sub2) this).anIntArray9188[i] == -1) {
		int i_641_
		    = (i_640_
		       | ((Class157_Sub2) this).anIntArray9150[i] & 0xffffff);
		((Class157_Sub2) this).aClass121_9200.method1583
		    (bool, bool_634_, bool_635_,
		     ((Class157_Sub2) this).aFloatArray9119[i_636_],
		     ((Class157_Sub2) this).aFloatArray9119[i_637_],
		     ((Class157_Sub2) this).aFloatArray9119[i_638_],
		     ((Class157_Sub2) this).aFloatArray9126[i_636_],
		     ((Class157_Sub2) this).aFloatArray9126[i_637_],
		     ((Class157_Sub2) this).aFloatArray9126[i_638_],
		     ((Class157_Sub2) this).aFloatArray9137[i_636_],
		     ((Class157_Sub2) this).aFloatArray9137[i_637_],
		     ((Class157_Sub2) this).aFloatArray9137[i_638_],
		     ((Class157_Sub2) this).aFloatArray9197[i_636_],
		     ((Class157_Sub2) this).aFloatArray9197[i_637_],
		     ((Class157_Sub2) this).aFloatArray9197[i_638_],
		     ((Class157_Sub2) this).aFloatArrayArray9157[i][0],
		     ((Class157_Sub2) this).aFloatArrayArray9157[i][1],
		     ((Class157_Sub2) this).aFloatArrayArray9157[i][2],
		     ((Class157_Sub2) this).aFloatArrayArray9149[i][0],
		     ((Class157_Sub2) this).aFloatArrayArray9149[i][1],
		     ((Class157_Sub2) this).aFloatArrayArray9149[i][2], i_641_,
		     i_641_, i_641_,
		     (((Class107) ((Class157_Sub2) this).aClass107_9121)
		      .anInt1342) * -1050551989,
		     0.0F, 0.0F, 0.0F,
		     ((Class157_Sub2) this).aShortArray9205[i] & 0xffff);
	    } else
		((Class157_Sub2) this).aClass121_9200.method1583
		    (bool, bool_634_, bool_635_,
		     ((Class157_Sub2) this).aFloatArray9119[i_636_],
		     ((Class157_Sub2) this).aFloatArray9119[i_637_],
		     ((Class157_Sub2) this).aFloatArray9119[i_638_],
		     ((Class157_Sub2) this).aFloatArray9126[i_636_],
		     ((Class157_Sub2) this).aFloatArray9126[i_637_],
		     ((Class157_Sub2) this).aFloatArray9126[i_638_],
		     ((Class157_Sub2) this).aFloatArray9137[i_636_],
		     ((Class157_Sub2) this).aFloatArray9137[i_637_],
		     ((Class157_Sub2) this).aFloatArray9137[i_638_],
		     ((Class157_Sub2) this).aFloatArray9197[i_636_],
		     ((Class157_Sub2) this).aFloatArray9197[i_637_],
		     ((Class157_Sub2) this).aFloatArray9197[i_638_],
		     ((Class157_Sub2) this).aFloatArrayArray9157[i][0],
		     ((Class157_Sub2) this).aFloatArrayArray9157[i][1],
		     ((Class157_Sub2) this).aFloatArrayArray9157[i][2],
		     ((Class157_Sub2) this).aFloatArrayArray9149[i][0],
		     ((Class157_Sub2) this).aFloatArrayArray9149[i][1],
		     ((Class157_Sub2) this).aFloatArrayArray9149[i][2],
		     (i_640_
		      | ((Class157_Sub2) this).anIntArray9150[i] & 0xffffff),
		     (i_640_
		      | ((Class157_Sub2) this).anIntArray9151[i] & 0xffffff),
		     (i_640_
		      | ((Class157_Sub2) this).anIntArray9188[i] & 0xffffff),
		     (((Class107) ((Class157_Sub2) this).aClass107_9121)
		      .anInt1342) * -1050551989,
		     0.0F, 0.0F, 0.0F,
		     ((Class157_Sub2) this).aShortArray9205[i] & 0xffff);
	}
    }
    
    final void method8419(boolean bool, boolean bool_642_, boolean bool_643_,
			  int i) {
	boolean bool_644_ = false;
	if (((Class157_Sub2) this).aShortArray9205 != null
	    && ((Class157_Sub2) this).aShortArray9205[i] != -1)
	    bool_644_ = (((Class157_Sub2) this).aClass173_Sub3_9130
			     .aClass165_1984.method2093
			 (((Class157_Sub2) this).aShortArray9205[i] & 0xffff,
			  (byte) -127)
			 .aBool1768);
	if (!((Class107) ((Class157_Sub2) this).aClass107_9121).aBool1324) {
	    short i_645_ = ((Class157_Sub2) this).aShortArray9145[i];
	    short i_646_ = ((Class157_Sub2) this).aShortArray9146[i];
	    short i_647_ = ((Class157_Sub2) this).aShortArray9147[i];
	    Class418 class418
		= (((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
		   .aClass418_9722);
	    float f = class418.aFloatArray4768[10];
	    float f_648_ = class418.aFloatArray4768[14];
	    float f_649_ = class418.aFloatArray4768[11];
	    float f_650_ = class418.aFloatArray4768[15];
	    float f_651_ = f_648_ * f_649_ - f * f_650_;
	    float f_652_
		= ((((Class157_Sub2) this).aFloatArray9137[i_645_]
		    - (((Class107) ((Class157_Sub2) this).aClass107_9121)
		       .aFloat1350))
		   * (((Class107) ((Class157_Sub2) this).aClass107_9121)
		      .aFloat1351));
	    float f_653_
		= ((((Class157_Sub2) this).aFloatArray9137[i_646_]
		    - (((Class107) ((Class157_Sub2) this).aClass107_9121)
		       .aFloat1350))
		   * (((Class107) ((Class157_Sub2) this).aClass107_9121)
		      .aFloat1351));
	    float f_654_
		= ((((Class157_Sub2) this).aFloatArray9137[i_647_]
		    - (((Class107) ((Class157_Sub2) this).aClass107_9121)
		       .aFloat1350))
		   * (((Class107) ((Class157_Sub2) this).aClass107_9121)
		      .aFloat1351));
	    float f_655_ = f_652_ * f_651_ / (f_652_ * f_649_ - f);
	    float f_656_ = f_653_ * f_651_ / (f_653_ * f_649_ - f);
	    float f_657_ = f_654_ * f_651_ / (f_654_ * f_649_ - f);
	    float f_658_
		= ((f_655_
		    - (((Class107) ((Class157_Sub2) this).aClass107_9121)
		       .aFloat1320))
		   / (((Class107) ((Class157_Sub2) this).aClass107_9121)
		      .aFloat1321));
	    if (f_658_ > 1.0F)
		f_658_ = 1.0F;
	    else if (f_658_ < 0.0F)
		f_658_ = 0.0F;
	    float f_659_
		= ((f_656_
		    - (((Class107) ((Class157_Sub2) this).aClass107_9121)
		       .aFloat1320))
		   / (((Class107) ((Class157_Sub2) this).aClass107_9121)
		      .aFloat1321));
	    if (f_659_ > 1.0F)
		f_659_ = 1.0F;
	    else if (f_659_ < 0.0F)
		f_659_ = 0.0F;
	    float f_660_
		= ((f_657_
		    - (((Class107) ((Class157_Sub2) this).aClass107_9121)
		       .aFloat1320))
		   / (((Class107) ((Class157_Sub2) this).aClass107_9121)
		      .aFloat1321));
	    if (f_660_ > 1.0F)
		f_660_ = 1.0F;
	    else if (f_660_ < 0.0F)
		f_660_ = 0.0F;
	    float f_661_ = f_658_ + f_659_ + f_660_;
	    if (!(f_661_ >= 3.0F)) {
		if (f_661_ <= 0.0F)
		    method8418(bool, bool_642_, bool_643_, i);
		else {
		    if (((Class157_Sub2) this).aByteArray9160 == null)
			((Class121) ((Class157_Sub2) this).aClass121_9200)
			    .anInt1526
			    = 0;
		    else
			((Class121) ((Class157_Sub2) this).aClass121_9200)
			    .anInt1526
			    = ((Class157_Sub2) this).aByteArray9160[i] & 0xff;
		    if (!bool_644_) {
			if (((Class157_Sub2) this).anIntArray9188[i] == -1)
			    ((Class157_Sub2) this).aClass121_9200.method1580
				(bool, bool_642_, bool_643_,
				 (((Class157_Sub2) this).aFloatArray9119
				  [i_645_]),
				 (((Class157_Sub2) this).aFloatArray9119
				  [i_646_]),
				 (((Class157_Sub2) this).aFloatArray9119
				  [i_647_]),
				 (((Class157_Sub2) this).aFloatArray9126
				  [i_645_]),
				 (((Class157_Sub2) this).aFloatArray9126
				  [i_646_]),
				 (((Class157_Sub2) this).aFloatArray9126
				  [i_647_]),
				 (((Class157_Sub2) this).aFloatArray9137
				  [i_645_]),
				 (((Class157_Sub2) this).aFloatArray9137
				  [i_646_]),
				 (((Class157_Sub2) this).aFloatArray9137
				  [i_647_]),
				 Class405.method4873((Class72.anIntArray777
						      [((((Class157_Sub2) this)
							 .anIntArray9150[i])
							& 0xffff)]),
						     ((((Class107)
							(((Class157_Sub2) this)
							 .aClass107_9121))
						       .anInt1342)
						      * -1050551989),
						     f_658_ * 255.0F,
						     2040829392),
				 Class405.method4873((Class72.anIntArray777
						      [((((Class157_Sub2) this)
							 .anIntArray9150[i])
							& 0xffff)]),
						     ((((Class107)
							(((Class157_Sub2) this)
							 .aClass107_9121))
						       .anInt1342)
						      * -1050551989),
						     f_659_ * 255.0F,
						     2040829392),
				 Class405.method4873((Class72.anIntArray777
						      [((((Class157_Sub2) this)
							 .anIntArray9150[i])
							& 0xffff)]),
						     ((((Class107)
							(((Class157_Sub2) this)
							 .aClass107_9121))
						       .anInt1342)
						      * -1050551989),
						     f_660_ * 255.0F,
						     2040829392));
			else
			    ((Class157_Sub2) this).aClass121_9200.method1580
				(bool, bool_642_, bool_643_,
				 (((Class157_Sub2) this).aFloatArray9119
				  [i_645_]),
				 (((Class157_Sub2) this).aFloatArray9119
				  [i_646_]),
				 (((Class157_Sub2) this).aFloatArray9119
				  [i_647_]),
				 (((Class157_Sub2) this).aFloatArray9126
				  [i_645_]),
				 (((Class157_Sub2) this).aFloatArray9126
				  [i_646_]),
				 (((Class157_Sub2) this).aFloatArray9126
				  [i_647_]),
				 (((Class157_Sub2) this).aFloatArray9137
				  [i_645_]),
				 (((Class157_Sub2) this).aFloatArray9137
				  [i_646_]),
				 (((Class157_Sub2) this).aFloatArray9137
				  [i_647_]),
				 Class405.method4873((Class72.anIntArray777
						      [((((Class157_Sub2) this)
							 .anIntArray9150[i])
							& 0xffff)]),
						     ((((Class107)
							(((Class157_Sub2) this)
							 .aClass107_9121))
						       .anInt1342)
						      * -1050551989),
						     f_658_ * 255.0F,
						     2040829392),
				 Class405.method4873((Class72.anIntArray777
						      [((((Class157_Sub2) this)
							 .anIntArray9151[i])
							& 0xffff)]),
						     ((((Class107)
							(((Class157_Sub2) this)
							 .aClass107_9121))
						       .anInt1342)
						      * -1050551989),
						     f_659_ * 255.0F,
						     2040829392),
				 Class405.method4873((Class72.anIntArray777
						      [((((Class157_Sub2) this)
							 .anIntArray9188[i])
							& 0xffff)]),
						     ((((Class107)
							(((Class157_Sub2) this)
							 .aClass107_9121))
						       .anInt1342)
						      * -1050551989),
						     f_660_ * 255.0F,
						     2040829392));
		    } else {
			int i_662_ = -16777216;
			if (((Class157_Sub2) this).aByteArray9160 != null)
			    i_662_ = 255 - ((((Class157_Sub2) this)
					     .aByteArray9160[i])
					    & 0xff) << 24;
			if (((Class157_Sub2) this).anIntArray9188[i] == -1) {
			    int i_663_
				= (i_662_
				   | (((Class157_Sub2) this).anIntArray9150[i]
				      & 0xffffff));
			    ((Class157_Sub2) this).aClass121_9200.method1583
				(bool, bool_642_, bool_643_,
				 (((Class157_Sub2) this).aFloatArray9119
				  [i_645_]),
				 (((Class157_Sub2) this).aFloatArray9119
				  [i_646_]),
				 (((Class157_Sub2) this).aFloatArray9119
				  [i_647_]),
				 (((Class157_Sub2) this).aFloatArray9126
				  [i_645_]),
				 (((Class157_Sub2) this).aFloatArray9126
				  [i_646_]),
				 (((Class157_Sub2) this).aFloatArray9126
				  [i_647_]),
				 (((Class157_Sub2) this).aFloatArray9137
				  [i_645_]),
				 (((Class157_Sub2) this).aFloatArray9137
				  [i_646_]),
				 (((Class157_Sub2) this).aFloatArray9137
				  [i_647_]),
				 (((Class157_Sub2) this).aFloatArray9197
				  [i_645_]),
				 (((Class157_Sub2) this).aFloatArray9197
				  [i_646_]),
				 (((Class157_Sub2) this).aFloatArray9197
				  [i_647_]),
				 (((Class157_Sub2) this).aFloatArrayArray9157
				  [i][0]),
				 (((Class157_Sub2) this).aFloatArrayArray9157
				  [i][1]),
				 (((Class157_Sub2) this).aFloatArrayArray9157
				  [i][2]),
				 (((Class157_Sub2) this).aFloatArrayArray9149
				  [i][0]),
				 (((Class157_Sub2) this).aFloatArrayArray9149
				  [i][1]),
				 (((Class157_Sub2) this).aFloatArrayArray9149
				  [i][2]),
				 i_663_, i_663_, i_663_,
				 (((Class107) (((Class157_Sub2) this)
					       .aClass107_9121)).anInt1342
				  * -1050551989),
				 f_658_ * 255.0F, f_659_ * 255.0F,
				 f_660_ * 255.0F,
				 (((Class157_Sub2) this).aShortArray9205[i]
				  & 0xffff));
			} else
			    ((Class157_Sub2) this).aClass121_9200.method1583
				(bool, bool_642_, bool_643_,
				 (((Class157_Sub2) this).aFloatArray9119
				  [i_645_]),
				 (((Class157_Sub2) this).aFloatArray9119
				  [i_646_]),
				 (((Class157_Sub2) this).aFloatArray9119
				  [i_647_]),
				 (((Class157_Sub2) this).aFloatArray9126
				  [i_645_]),
				 (((Class157_Sub2) this).aFloatArray9126
				  [i_646_]),
				 (((Class157_Sub2) this).aFloatArray9126
				  [i_647_]),
				 (((Class157_Sub2) this).aFloatArray9137
				  [i_645_]),
				 (((Class157_Sub2) this).aFloatArray9137
				  [i_646_]),
				 (((Class157_Sub2) this).aFloatArray9137
				  [i_647_]),
				 (((Class157_Sub2) this).aFloatArray9197
				  [i_645_]),
				 (((Class157_Sub2) this).aFloatArray9197
				  [i_646_]),
				 (((Class157_Sub2) this).aFloatArray9197
				  [i_647_]),
				 (((Class157_Sub2) this).aFloatArrayArray9157
				  [i][0]),
				 (((Class157_Sub2) this).aFloatArrayArray9157
				  [i][1]),
				 (((Class157_Sub2) this).aFloatArrayArray9157
				  [i][2]),
				 (((Class157_Sub2) this).aFloatArrayArray9149
				  [i][0]),
				 (((Class157_Sub2) this).aFloatArrayArray9149
				  [i][1]),
				 (((Class157_Sub2) this).aFloatArrayArray9149
				  [i][2]),
				 i_662_ | (((Class157_Sub2) this)
					   .anIntArray9150[i]) & 0xffffff,
				 i_662_ | (((Class157_Sub2) this)
					   .anIntArray9151[i]) & 0xffffff,
				 i_662_ | (((Class157_Sub2) this)
					   .anIntArray9188[i]) & 0xffffff,
				 (((Class107) (((Class157_Sub2) this)
					       .aClass107_9121)).anInt1342
				  * -1050551989),
				 f_658_ * 255.0F, f_659_ * 255.0F,
				 f_660_ * 255.0F,
				 (((Class157_Sub2) this).aShortArray9205[i]
				  & 0xffff));
		    }
		}
	    }
	} else {
	    short i_664_ = ((Class157_Sub2) this).aShortArray9145[i];
	    short i_665_ = ((Class157_Sub2) this).aShortArray9146[i];
	    short i_666_ = ((Class157_Sub2) this).aShortArray9147[i];
	    float f = 0.0F;
	    float f_667_ = 0.0F;
	    float f_668_ = 0.0F;
	    if (((Class157_Sub2) this).anIntArray9174[i_664_]
		> (((Class107) ((Class157_Sub2) this).aClass107_9121).anInt1345
		   * -1917386465))
		f = 1.0F;
	    else if (((Class157_Sub2) this).anIntArray9174[i_664_]
		     > (((Class107) ((Class157_Sub2) this).aClass107_9121)
			.anInt1325) * -1455826077)
		f = ((float) ((((Class107) (((Class157_Sub2) this)
					    .aClass107_9121)).anInt1325
			       * -1455826077)
			      - ((Class157_Sub2) this).anIntArray9174[i_664_])
		     * 1.0F
		     / (float) ((((Class107) (((Class157_Sub2) this)
					      .aClass107_9121)).anInt1325
				 * -1455826077)
				- (((Class107) (((Class157_Sub2) this)
						.aClass107_9121)).anInt1345
				   * -1917386465)));
	    if (((Class157_Sub2) this).anIntArray9174[i_665_]
		> (((Class107) ((Class157_Sub2) this).aClass107_9121).anInt1345
		   * -1917386465))
		f_667_ = 1.0F;
	    else if (((Class157_Sub2) this).anIntArray9174[i_665_]
		     > (((Class107) ((Class157_Sub2) this).aClass107_9121)
			.anInt1325) * -1455826077)
		f_667_ = ((float) ((((Class107) (((Class157_Sub2) this)
						 .aClass107_9121)).anInt1325
				    * -1455826077)
				   - (((Class157_Sub2) this).anIntArray9174
				      [i_665_]))
			  * 1.0F
			  / (float) ((((Class107) (((Class157_Sub2) this)
						   .aClass107_9121)).anInt1325
				      * -1455826077)
				     - (((Class107)
					 ((Class157_Sub2) this).aClass107_9121)
					.anInt1345) * -1917386465));
	    if (((Class157_Sub2) this).anIntArray9174[i_666_]
		> (((Class107) ((Class157_Sub2) this).aClass107_9121).anInt1345
		   * -1917386465))
		f_668_ = 1.0F;
	    else if (((Class157_Sub2) this).anIntArray9174[i_666_]
		     > (((Class107) ((Class157_Sub2) this).aClass107_9121)
			.anInt1325) * -1455826077)
		f_668_ = ((float) ((((Class107) (((Class157_Sub2) this)
						 .aClass107_9121)).anInt1325
				    * -1455826077)
				   - (((Class157_Sub2) this).anIntArray9174
				      [i_666_]))
			  * 1.0F
			  / (float) ((((Class107) (((Class157_Sub2) this)
						   .aClass107_9121)).anInt1325
				      * -1455826077)
				     - (((Class107)
					 ((Class157_Sub2) this).aClass107_9121)
					.anInt1345) * -1917386465));
	    if (((Class157_Sub2) this).aByteArray9160 == null)
		((Class121) ((Class157_Sub2) this).aClass121_9200).anInt1526
		    = 0;
	    else
		((Class121) ((Class157_Sub2) this).aClass121_9200).anInt1526
		    = ((Class157_Sub2) this).aByteArray9160[i] & 0xff;
	    if (!bool_644_) {
		if (((Class157_Sub2) this).anIntArray9188[i] == -1)
		    ((Class157_Sub2) this).aClass121_9200.method1580
			(bool, bool_642_, bool_643_,
			 ((Class157_Sub2) this).aFloatArray9119[i_664_],
			 ((Class157_Sub2) this).aFloatArray9119[i_665_],
			 ((Class157_Sub2) this).aFloatArray9119[i_666_],
			 ((Class157_Sub2) this).aFloatArray9126[i_664_],
			 ((Class157_Sub2) this).aFloatArray9126[i_665_],
			 ((Class157_Sub2) this).aFloatArray9126[i_666_],
			 ((Class157_Sub2) this).aFloatArray9137[i_664_],
			 ((Class157_Sub2) this).aFloatArray9137[i_665_],
			 ((Class157_Sub2) this).aFloatArray9137[i_666_],
			 Class405.method4873((Class72.anIntArray777
					      [(((Class157_Sub2) this)
						.anIntArray9150[i]) & 0xffff]),
					     (((Class107)
					       (((Class157_Sub2) this)
						.aClass107_9121)).anInt1342
					      * -1050551989),
					     f * 255.0F, 2040829392),
			 Class405.method4873((Class72.anIntArray777
					      [(((Class157_Sub2) this)
						.anIntArray9150[i]) & 0xffff]),
					     (((Class107)
					       (((Class157_Sub2) this)
						.aClass107_9121)).anInt1342
					      * -1050551989),
					     f_667_ * 255.0F, 2040829392),
			 Class405.method4873((Class72.anIntArray777
					      [(((Class157_Sub2) this)
						.anIntArray9150[i]) & 0xffff]),
					     (((Class107)
					       (((Class157_Sub2) this)
						.aClass107_9121)).anInt1342
					      * -1050551989),
					     f_668_ * 255.0F, 2040829392));
		else
		    ((Class157_Sub2) this).aClass121_9200.method1580
			(bool, bool_642_, bool_643_,
			 ((Class157_Sub2) this).aFloatArray9119[i_664_],
			 ((Class157_Sub2) this).aFloatArray9119[i_665_],
			 ((Class157_Sub2) this).aFloatArray9119[i_666_],
			 ((Class157_Sub2) this).aFloatArray9126[i_664_],
			 ((Class157_Sub2) this).aFloatArray9126[i_665_],
			 ((Class157_Sub2) this).aFloatArray9126[i_666_],
			 ((Class157_Sub2) this).aFloatArray9137[i_664_],
			 ((Class157_Sub2) this).aFloatArray9137[i_665_],
			 ((Class157_Sub2) this).aFloatArray9137[i_666_],
			 Class405.method4873((Class72.anIntArray777
					      [(((Class157_Sub2) this)
						.anIntArray9150[i]) & 0xffff]),
					     (((Class107)
					       (((Class157_Sub2) this)
						.aClass107_9121)).anInt1342
					      * -1050551989),
					     f * 255.0F, 2040829392),
			 Class405.method4873((Class72.anIntArray777
					      [(((Class157_Sub2) this)
						.anIntArray9151[i]) & 0xffff]),
					     (((Class107)
					       (((Class157_Sub2) this)
						.aClass107_9121)).anInt1342
					      * -1050551989),
					     f_667_ * 255.0F, 2040829392),
			 Class405.method4873((Class72.anIntArray777
					      [(((Class157_Sub2) this)
						.anIntArray9188[i]) & 0xffff]),
					     (((Class107)
					       (((Class157_Sub2) this)
						.aClass107_9121)).anInt1342
					      * -1050551989),
					     f_668_ * 255.0F, 2040829392));
	    } else {
		int i_669_ = -16777216;
		if (((Class157_Sub2) this).aByteArray9160 != null)
		    i_669_ = 255 - (((Class157_Sub2) this).aByteArray9160[i]
				    & 0xff) << 24;
		if (((Class157_Sub2) this).anIntArray9188[i] == -1) {
		    int i_670_
			= i_669_ | (((Class157_Sub2) this).anIntArray9150[i]
				    & 0xffffff);
		    ((Class157_Sub2) this).aClass121_9200.method1583
			(bool, bool_642_, bool_643_,
			 ((Class157_Sub2) this).aFloatArray9119[i_664_],
			 ((Class157_Sub2) this).aFloatArray9119[i_665_],
			 ((Class157_Sub2) this).aFloatArray9119[i_666_],
			 ((Class157_Sub2) this).aFloatArray9126[i_664_],
			 ((Class157_Sub2) this).aFloatArray9126[i_665_],
			 ((Class157_Sub2) this).aFloatArray9126[i_666_],
			 ((Class157_Sub2) this).aFloatArray9137[i_664_],
			 ((Class157_Sub2) this).aFloatArray9137[i_665_],
			 ((Class157_Sub2) this).aFloatArray9137[i_666_],
			 ((Class157_Sub2) this).aFloatArray9197[i_664_],
			 ((Class157_Sub2) this).aFloatArray9197[i_665_],
			 ((Class157_Sub2) this).aFloatArray9197[i_666_],
			 ((Class157_Sub2) this).aFloatArrayArray9157[i][0],
			 ((Class157_Sub2) this).aFloatArrayArray9157[i][1],
			 ((Class157_Sub2) this).aFloatArrayArray9157[i][2],
			 ((Class157_Sub2) this).aFloatArrayArray9149[i][0],
			 ((Class157_Sub2) this).aFloatArrayArray9149[i][1],
			 ((Class157_Sub2) this).aFloatArrayArray9149[i][2],
			 i_670_, i_670_, i_670_,
			 (((Class107) ((Class157_Sub2) this).aClass107_9121)
			  .anInt1342) * -1050551989,
			 f * 255.0F, f_667_ * 255.0F, f_668_ * 255.0F,
			 ((Class157_Sub2) this).aShortArray9205[i] & 0xffff);
		} else
		    ((Class157_Sub2) this).aClass121_9200.method1583
			(bool, bool_642_, bool_643_,
			 ((Class157_Sub2) this).aFloatArray9119[i_664_],
			 ((Class157_Sub2) this).aFloatArray9119[i_665_],
			 ((Class157_Sub2) this).aFloatArray9119[i_666_],
			 ((Class157_Sub2) this).aFloatArray9126[i_664_],
			 ((Class157_Sub2) this).aFloatArray9126[i_665_],
			 ((Class157_Sub2) this).aFloatArray9126[i_666_],
			 ((Class157_Sub2) this).aFloatArray9137[i_664_],
			 ((Class157_Sub2) this).aFloatArray9137[i_665_],
			 ((Class157_Sub2) this).aFloatArray9137[i_666_],
			 ((Class157_Sub2) this).aFloatArray9197[i_664_],
			 ((Class157_Sub2) this).aFloatArray9197[i_665_],
			 ((Class157_Sub2) this).aFloatArray9197[i_666_],
			 ((Class157_Sub2) this).aFloatArrayArray9157[i][0],
			 ((Class157_Sub2) this).aFloatArrayArray9157[i][1],
			 ((Class157_Sub2) this).aFloatArrayArray9157[i][2],
			 ((Class157_Sub2) this).aFloatArrayArray9149[i][0],
			 ((Class157_Sub2) this).aFloatArrayArray9149[i][1],
			 ((Class157_Sub2) this).aFloatArrayArray9149[i][2],
			 i_669_ | (((Class157_Sub2) this).anIntArray9150[i]
				   & 0xffffff),
			 i_669_ | (((Class157_Sub2) this).anIntArray9151[i]
				   & 0xffffff),
			 i_669_ | (((Class157_Sub2) this).anIntArray9188[i]
				   & 0xffffff),
			 (((Class107) ((Class157_Sub2) this).aClass107_9121)
			  .anInt1342) * -1050551989,
			 f * 255.0F, f_667_ * 255.0F, f_668_ * 255.0F,
			 ((Class157_Sub2) this).aShortArray9205[i] & 0xffff);
	    }
	}
    }
    
    public boolean method2000(int i, int i_671_, Class433 class433,
			      boolean bool, int i_672_) {
	method8401(((Class157_Sub2) this).aClass173_Sub3_9130
		       .method8939(Thread.currentThread()));
	Class418 class418 = (((Class107) ((Class157_Sub2) this).aClass107_9121)
			     .aClass418_1319);
	class418.method5035(class433);
	Class418 class418_673_
	    = (((Class107) ((Class157_Sub2) this).aClass107_9121)
	       .aClass418_1333);
	class418_673_.method4986(class418);
	class418_673_.method4974(((Class173_Sub3)
				  ((Class157_Sub2) this).aClass173_Sub3_9130)
				 .aClass418_9736);
	boolean bool_674_ = false;
	int i_675_ = 2147483647;
	int i_676_ = -2147483648;
	int i_677_ = 2147483647;
	int i_678_ = -2147483648;
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	int i_679_ = ((((Class157_Sub2) this).aShort9185
		       - ((Class157_Sub2) this).aShort9184)
		      >> 1);
	int i_680_ = ((((Class157_Sub2) this).aShort9183
		       - ((Class157_Sub2) this).aShort9182)
		      >> 1);
	int i_681_ = ((((Class157_Sub2) this).aShort9144
		       - ((Class157_Sub2) this).aShort9186)
		      >> 1);
	int i_682_ = ((Class157_Sub2) this).aShort9184 + i_679_;
	int i_683_ = ((Class157_Sub2) this).aShort9182 + i_680_;
	int i_684_ = ((Class157_Sub2) this).aShort9186 + i_681_;
	int i_685_ = i_682_ - (i_679_ << i_672_);
	int i_686_ = i_683_ - (i_680_ << i_672_);
	int i_687_ = i_684_ - (i_681_ << i_672_);
	int i_688_ = i_682_ + (i_679_ << i_672_);
	int i_689_ = i_683_ + (i_680_ << i_672_);
	int i_690_ = i_684_ + (i_681_ << i_672_);
	((Class157_Sub2) this).anIntArray9173[0] = i_685_;
	((Class157_Sub2) this).anIntArray9155[0] = i_686_;
	((Class157_Sub2) this).anIntArray9194[0] = i_687_;
	((Class157_Sub2) this).anIntArray9173[1] = i_688_;
	((Class157_Sub2) this).anIntArray9155[1] = i_686_;
	((Class157_Sub2) this).anIntArray9194[1] = i_687_;
	((Class157_Sub2) this).anIntArray9173[2] = i_685_;
	((Class157_Sub2) this).anIntArray9155[2] = i_689_;
	((Class157_Sub2) this).anIntArray9194[2] = i_687_;
	((Class157_Sub2) this).anIntArray9173[3] = i_688_;
	((Class157_Sub2) this).anIntArray9155[3] = i_689_;
	((Class157_Sub2) this).anIntArray9194[3] = i_687_;
	((Class157_Sub2) this).anIntArray9173[4] = i_685_;
	((Class157_Sub2) this).anIntArray9155[4] = i_686_;
	((Class157_Sub2) this).anIntArray9194[4] = i_690_;
	((Class157_Sub2) this).anIntArray9173[5] = i_688_;
	((Class157_Sub2) this).anIntArray9155[5] = i_686_;
	((Class157_Sub2) this).anIntArray9194[5] = i_690_;
	((Class157_Sub2) this).anIntArray9173[6] = i_685_;
	((Class157_Sub2) this).anIntArray9155[6] = i_689_;
	((Class157_Sub2) this).anIntArray9194[6] = i_690_;
	((Class157_Sub2) this).anIntArray9173[7] = i_688_;
	((Class157_Sub2) this).anIntArray9155[7] = i_689_;
	((Class157_Sub2) this).anIntArray9194[7] = i_690_;
	for (int i_691_ = 0; i_691_ < 8; i_691_++) {
	    int i_692_ = ((Class157_Sub2) this).anIntArray9173[i_691_];
	    int i_693_ = ((Class157_Sub2) this).anIntArray9155[i_691_];
	    int i_694_ = ((Class157_Sub2) this).anIntArray9194[i_691_];
	    float f = (class418_673_.aFloatArray4768[2] * (float) i_692_
		       + class418_673_.aFloatArray4768[6] * (float) i_693_
		       + class418_673_.aFloatArray4768[10] * (float) i_694_
		       + class418_673_.aFloatArray4768[14]);
	    float f_695_
		= (class418_673_.aFloatArray4768[3] * (float) i_692_
		   + class418_673_.aFloatArray4768[7] * (float) i_693_
		   + class418_673_.aFloatArray4768[11] * (float) i_694_
		   + class418_673_.aFloatArray4768[15]);
	    if (f >= -f_695_) {
		float f_696_
		    = (class418_673_.aFloatArray4768[0] * (float) i_692_
		       + class418_673_.aFloatArray4768[4] * (float) i_693_
		       + class418_673_.aFloatArray4768[8] * (float) i_694_
		       + class418_673_.aFloatArray4768[12]);
		float f_697_
		    = (class418_673_.aFloatArray4768[1] * (float) i_692_
		       + class418_673_.aFloatArray4768[5] * (float) i_693_
		       + class418_673_.aFloatArray4768[9] * (float) i_694_
		       + class418_673_.aFloatArray4768[13]);
		int i_698_ = (int) ((((Class173_Sub3) (((Class157_Sub2) this)
						       .aClass173_Sub3_9130))
				     .aFloat9743)
				    + (((Class173_Sub3) (((Class157_Sub2) this)
							 .aClass173_Sub3_9130))
				       .aFloat9742) * f_696_ / f_695_);
		int i_699_ = (int) ((((Class173_Sub3) (((Class157_Sub2) this)
						       .aClass173_Sub3_9130))
				     .aFloat9751)
				    + (((Class173_Sub3) (((Class157_Sub2) this)
							 .aClass173_Sub3_9130))
				       .aFloat9744) * f_697_ / f_695_);
		if (i_698_ < i_675_)
		    i_675_ = i_698_;
		if (i_698_ > i_676_)
		    i_676_ = i_698_;
		if (i_699_ < i_677_)
		    i_677_ = i_699_;
		if (i_699_ > i_678_)
		    i_678_ = i_699_;
		bool_674_ = true;
	    }
	}
	if (bool_674_ && i > i_675_ && i < i_676_ && i_671_ > i_677_
	    && i_671_ < i_678_) {
	    if (bool)
		return true;
	    for (int i_700_ = 0; i_700_ < ((Class157_Sub2) this).anInt9135;
		 i_700_++) {
		int i_701_ = ((Class157_Sub2) this).anIntArray9203[i_700_];
		int i_702_ = ((Class157_Sub2) this).anIntArray9204[i_700_];
		int i_703_ = ((Class157_Sub2) this).anIntArray9177[i_700_];
		float f = (class418_673_.aFloatArray4768[2] * (float) i_701_
			   + class418_673_.aFloatArray4768[6] * (float) i_702_
			   + class418_673_.aFloatArray4768[10] * (float) i_703_
			   + class418_673_.aFloatArray4768[14]);
		float f_704_
		    = (class418_673_.aFloatArray4768[3] * (float) i_701_
		       + class418_673_.aFloatArray4768[7] * (float) i_702_
		       + class418_673_.aFloatArray4768[11] * (float) i_703_
		       + class418_673_.aFloatArray4768[15]);
		if (f >= -f_704_) {
		    float f_705_
			= (class418_673_.aFloatArray4768[0] * (float) i_701_
			   + class418_673_.aFloatArray4768[4] * (float) i_702_
			   + class418_673_.aFloatArray4768[8] * (float) i_703_
			   + class418_673_.aFloatArray4768[12]);
		    float f_706_
			= (class418_673_.aFloatArray4768[1] * (float) i_701_
			   + class418_673_.aFloatArray4768[5] * (float) i_702_
			   + class418_673_.aFloatArray4768[9] * (float) i_703_
			   + class418_673_.aFloatArray4768[13]);
		    ((Class157_Sub2) this).aFloatArray9126[i_700_]
			= (float) (int) (((Class173_Sub3)
					  (((Class157_Sub2) this)
					   .aClass173_Sub3_9130)).aFloat9743
					 + (((Class173_Sub3)
					     (((Class157_Sub2) this)
					      .aClass173_Sub3_9130)).aFloat9742
					    * f_705_ / f_704_));
		    ((Class157_Sub2) this).aFloatArray9119[i_700_]
			= (float) (int) (((Class173_Sub3)
					  (((Class157_Sub2) this)
					   .aClass173_Sub3_9130)).aFloat9751
					 + (((Class173_Sub3)
					     (((Class157_Sub2) this)
					      .aClass173_Sub3_9130)).aFloat9744
					    * f_706_ / f_704_));
		} else
		    ((Class157_Sub2) this).aFloatArray9126[i_700_]
			= -999999.0F;
	    }
	    for (int i_707_ = 0; i_707_ < ((Class157_Sub2) this).anInt9198;
		 i_707_++) {
		if (((((Class157_Sub2) this).aFloatArray9126
		      [((Class157_Sub2) this).aShortArray9145[i_707_]])
		     != -999999.0F)
		    && ((((Class157_Sub2) this).aFloatArray9126
			 [((Class157_Sub2) this).aShortArray9146[i_707_]])
			!= -999999.0F)
		    && ((((Class157_Sub2) this).aFloatArray9126
			 [((Class157_Sub2) this).aShortArray9147[i_707_]])
			!= -999999.0F)
		    && (method8412
			(i, i_671_,
			 (((Class157_Sub2) this).aFloatArray9119
			  [((Class157_Sub2) this).aShortArray9145[i_707_]]),
			 (((Class157_Sub2) this).aFloatArray9119
			  [((Class157_Sub2) this).aShortArray9146[i_707_]]),
			 (((Class157_Sub2) this).aFloatArray9119
			  [((Class157_Sub2) this).aShortArray9147[i_707_]]),
			 (((Class157_Sub2) this).aFloatArray9126
			  [((Class157_Sub2) this).aShortArray9145[i_707_]]),
			 (((Class157_Sub2) this).aFloatArray9126
			  [((Class157_Sub2) this).aShortArray9146[i_707_]]),
			 (((Class157_Sub2) this).aFloatArray9126
			  [((Class157_Sub2) this).aShortArray9147[i_707_]]))))
		    return true;
	    }
	}
	return false;
    }
    
    public int method2022() {
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	return ((Class157_Sub2) this).aShort9183;
    }
    
    public void method1921(Class433 class433) {
	method8401(((Class157_Sub2) this).aClass173_Sub3_9130
		       .method8939(Thread.currentThread()));
	Class418 class418 = (((Class107) ((Class157_Sub2) this).aClass107_9121)
			     .aClass418_1319);
	class418.method5035(class433);
	if (((Class157_Sub2) this).aClass170Array9122 != null) {
	    for (int i = 0;
		 i < ((Class157_Sub2) this).aClass170Array9122.length; i++) {
		Class170 class170
		    = ((Class157_Sub2) this).aClass170Array9122[i];
		Class170 class170_708_ = class170;
		if (class170.aClass170_1958 != null)
		    class170_708_ = class170.aClass170_1958;
		class170_708_.anInt1950
		    = ((int) (class418.aFloatArray4768[12]
			      + ((class418.aFloatArray4768[0]
				  * (float) (((Class157_Sub2) this)
					     .anIntArray9203
					     [(class170.anInt1946
					       * 1977387945)]))
				 + (class418.aFloatArray4768[4]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9204
					       [(class170.anInt1946
						 * 1977387945)]))
				 + (class418.aFloatArray4768[8]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9177
					       [(class170.anInt1946
						 * 1977387945)]))))
		       * -1626668665);
		class170_708_.anInt1951
		    = ((int) (class418.aFloatArray4768[13]
			      + ((class418.aFloatArray4768[1]
				  * (float) (((Class157_Sub2) this)
					     .anIntArray9203
					     [(class170.anInt1946
					       * 1977387945)]))
				 + (class418.aFloatArray4768[5]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9204
					       [(class170.anInt1946
						 * 1977387945)]))
				 + (class418.aFloatArray4768[9]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9177
					       [(class170.anInt1946
						 * 1977387945)]))))
		       * -1756604589);
		class170_708_.anInt1952
		    = (int) (class418.aFloatArray4768[14]
			     + ((class418.aFloatArray4768[2]
				 * (float) (((Class157_Sub2) this)
					    .anIntArray9203
					    [class170.anInt1946 * 1977387945]))
				+ (class418.aFloatArray4768[6]
				   * (float) (((Class157_Sub2) this)
					      .anIntArray9204
					      [(class170.anInt1946
						* 1977387945)]))
				+ (class418.aFloatArray4768[10]
				   * (float) (((Class157_Sub2) this)
					      .anIntArray9177
					      [(class170.anInt1946
						* 1977387945)])))) * 908623173;
		class170_708_.anInt1947
		    = ((int) (class418.aFloatArray4768[12]
			      + ((class418.aFloatArray4768[0]
				  * (float) (((Class157_Sub2) this)
					     .anIntArray9203
					     [(class170.anInt1945
					       * -1790775395)]))
				 + (class418.aFloatArray4768[4]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9204
					       [(class170.anInt1945
						 * -1790775395)]))
				 + (class418.aFloatArray4768[8]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9177
					       [(class170.anInt1945
						 * -1790775395)]))))
		       * -203979893);
		class170_708_.anInt1944
		    = ((int) (class418.aFloatArray4768[13]
			      + ((class418.aFloatArray4768[1]
				  * (float) (((Class157_Sub2) this)
					     .anIntArray9203
					     [(class170.anInt1945
					       * -1790775395)]))
				 + (class418.aFloatArray4768[5]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9204
					       [(class170.anInt1945
						 * -1790775395)]))
				 + (class418.aFloatArray4768[9]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9177
					       [(class170.anInt1945
						 * -1790775395)]))))
		       * 1630459257);
		class170_708_.anInt1955
		    = ((int) (class418.aFloatArray4768[14]
			      + ((class418.aFloatArray4768[2]
				  * (float) (((Class157_Sub2) this)
					     .anIntArray9203
					     [(class170.anInt1945
					       * -1790775395)]))
				 + (class418.aFloatArray4768[6]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9204
					       [(class170.anInt1945
						 * -1790775395)]))
				 + (class418.aFloatArray4768[10]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9177
					       [(class170.anInt1945
						 * -1790775395)]))))
		       * 1543452655);
		class170_708_.anInt1956
		    = (int) (class418.aFloatArray4768[12]
			     + ((class418.aFloatArray4768[0]
				 * (float) (((Class157_Sub2) this)
					    .anIntArray9203
					    [class170.anInt1948 * 248261743]))
				+ (class418.aFloatArray4768[4]
				   * (float) (((Class157_Sub2) this)
					      .anIntArray9204
					      [(class170.anInt1948
						* 248261743)]))
				+ (class418.aFloatArray4768[8]
				   * (float) (((Class157_Sub2) this)
					      .anIntArray9177
					      [(class170.anInt1948
						* 248261743)])))) * 271456581;
		class170_708_.anInt1953
		    = (int) (class418.aFloatArray4768[13]
			     + ((class418.aFloatArray4768[1]
				 * (float) (((Class157_Sub2) this)
					    .anIntArray9203
					    [class170.anInt1948 * 248261743]))
				+ (class418.aFloatArray4768[5]
				   * (float) (((Class157_Sub2) this)
					      .anIntArray9204
					      [(class170.anInt1948
						* 248261743)]))
				+ (class418.aFloatArray4768[9]
				   * (float) (((Class157_Sub2) this)
					      .anIntArray9177
					      [(class170.anInt1948
						* 248261743)])))) * 707964019;
		class170_708_.anInt1943
		    = (int) (class418.aFloatArray4768[14]
			     + ((class418.aFloatArray4768[2]
				 * (float) (((Class157_Sub2) this)
					    .anIntArray9203
					    [class170.anInt1948 * 248261743]))
				+ (class418.aFloatArray4768[6]
				   * (float) (((Class157_Sub2) this)
					      .anIntArray9204
					      [(class170.anInt1948
						* 248261743)]))
				+ (class418.aFloatArray4768[10]
				   * (float) (((Class157_Sub2) this)
					      .anIntArray9177
					      [(class170.anInt1948
						* 248261743)])))) * -674151113;
	    }
	}
	if (((Class157_Sub2) this).aClass144Array9125 != null) {
	    for (int i = 0;
		 i < ((Class157_Sub2) this).aClass144Array9125.length; i++) {
		Class144 class144
		    = ((Class157_Sub2) this).aClass144Array9125[i];
		Class144 class144_709_ = class144;
		if (class144.aClass144_1646 != null)
		    class144_709_ = class144.aClass144_1646;
		if (class144.aClass418_1645 != null)
		    class144.aClass418_1645.method4986(class418);
		else
		    class144.aClass418_1645 = new Class418(class418);
		class144_709_.anInt1648
		    = ((int) (class418.aFloatArray4768[12]
			      + ((class418.aFloatArray4768[0]
				  * (float) (((Class157_Sub2) this)
					     .anIntArray9203
					     [(class144.anInt1651
					       * 1842630443)]))
				 + (class418.aFloatArray4768[4]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9204
					       [(class144.anInt1651
						 * 1842630443)]))
				 + (class418.aFloatArray4768[8]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9177
					       [(class144.anInt1651
						 * 1842630443)]))))
		       * -1931908895);
		class144_709_.anInt1649
		    = ((int) (class418.aFloatArray4768[13]
			      + ((class418.aFloatArray4768[1]
				  * (float) (((Class157_Sub2) this)
					     .anIntArray9203
					     [(class144.anInt1651
					       * 1842630443)]))
				 + (class418.aFloatArray4768[5]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9204
					       [(class144.anInt1651
						 * 1842630443)]))
				 + (class418.aFloatArray4768[9]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9177
					       [(class144.anInt1651
						 * 1842630443)]))))
		       * -1055365151);
		class144_709_.anInt1650
		    = (int) (class418.aFloatArray4768[14]
			     + ((class418.aFloatArray4768[2]
				 * (float) (((Class157_Sub2) this)
					    .anIntArray9203
					    [class144.anInt1651 * 1842630443]))
				+ (class418.aFloatArray4768[6]
				   * (float) (((Class157_Sub2) this)
					      .anIntArray9204
					      [(class144.anInt1651
						* 1842630443)]))
				+ (class418.aFloatArray4768[10]
				   * (float) (((Class157_Sub2) this)
					      .anIntArray9177
					      [(class144.anInt1651
						* 1842630443)])))) * 870317833;
	    }
	}
    }
    
    public Class528_Sub21_Sub12 method1899
	(Class528_Sub21_Sub12 class528_sub21_sub12) {
	return null;
    }
    
    void method1885() {
	if ((((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
	     .anInt9745) * -1585405167
	    > 1) {
	    synchronized (this) {
		while (aBool1738) {
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		aBool1738 = true;
	    }
	}
    }
    
    public void method1909() {
	if (!((Class157_Sub2) this).aBool9187) {
	    if (!((Class157_Sub2) this).aBool9179)
		method8420();
	    ((Class157_Sub2) this).aShort9189
		= ((Class157_Sub2) this).aShort9182;
	    ((Class157_Sub2) this).aBool9187 = true;
	}
    }
    
    public int method1937() {
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	return ((Class157_Sub2) this).aShort9180;
    }
    
    public int method1901() {
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	return ((Class157_Sub2) this).aShort9181;
    }
    
    public void method1945(byte i, byte[] is) {
	if ((((Class157_Sub2) this).anInt9132 & 0x100000) == 0)
	    throw new RuntimeException();
	if (((Class157_Sub2) this).aByteArray9160 == null)
	    ((Class157_Sub2) this).aByteArray9160
		= new byte[((Class157_Sub2) this).anInt9143];
	if (is == null) {
	    for (int i_710_ = 0; i_710_ < ((Class157_Sub2) this).anInt9143;
		 i_710_++)
		((Class157_Sub2) this).aByteArray9160[i_710_] = i;
	} else {
	    for (int i_711_ = 0; i_711_ < ((Class157_Sub2) this).anInt9143;
		 i_711_++) {
		int i_712_ = 255 - ((255 - (is[i_711_] & 0xff))
				    * (255 - (i & 0xff)) / 255);
		((Class157_Sub2) this).aByteArray9160[i_711_] = (byte) i_712_;
	    }
	}
	if (((Class157_Sub2) this).anInt9152 == 2)
	    ((Class157_Sub2) this).anInt9152 = 1;
    }
    
    public void method1877(int i) {
	if ((((Class157_Sub2) this).anInt9132 & 0x1000) != 4096)
	    throw new IllegalStateException();
	((Class157_Sub2) this).anInt9133 = i;
	((Class157_Sub2) this).anInt9152 = 0;
    }
    
    public int method2018() {
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	return ((Class157_Sub2) this).aShort9182;
    }
    
    public int method1905() {
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	return ((Class157_Sub2) this).aShort9183;
    }
    
    public int method1900() {
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	return ((Class157_Sub2) this).aShort9186;
    }
    
    void method8420() {
	if (!((Class157_Sub2) this).aBool9179) {
	    int i = 0;
	    int i_713_ = 0;
	    int i_714_ = 32767;
	    int i_715_ = 32767;
	    int i_716_ = 32767;
	    int i_717_ = -32768;
	    int i_718_ = -32768;
	    int i_719_ = -32768;
	    for (int i_720_ = 0; i_720_ < ((Class157_Sub2) this).anInt9136;
		 i_720_++) {
		int i_721_ = ((Class157_Sub2) this).anIntArray9203[i_720_];
		int i_722_ = ((Class157_Sub2) this).anIntArray9204[i_720_];
		int i_723_ = ((Class157_Sub2) this).anIntArray9177[i_720_];
		if (i_721_ < i_714_)
		    i_714_ = i_721_;
		if (i_721_ > i_717_)
		    i_717_ = i_721_;
		if (i_722_ < i_715_)
		    i_715_ = i_722_;
		if (i_722_ > i_718_)
		    i_718_ = i_722_;
		if (i_723_ < i_716_)
		    i_716_ = i_723_;
		if (i_723_ > i_719_)
		    i_719_ = i_723_;
		int i_724_ = i_721_ * i_721_ + i_723_ * i_723_;
		if (i_724_ > i)
		    i = i_724_;
		i_724_ += i_722_ * i_722_;
		if (i_724_ > i_713_)
		    i_713_ = i_724_;
	    }
	    ((Class157_Sub2) this).aShort9184 = (short) i_714_;
	    ((Class157_Sub2) this).aShort9185 = (short) i_717_;
	    ((Class157_Sub2) this).aShort9182 = (short) i_715_;
	    ((Class157_Sub2) this).aShort9183 = (short) i_718_;
	    ((Class157_Sub2) this).aShort9186 = (short) i_716_;
	    ((Class157_Sub2) this).aShort9144 = (short) i_719_;
	    ((Class157_Sub2) this).aShort9180
		= (short) (int) (Math.sqrt((double) i) + 0.99);
	    ((Class157_Sub2) this).aShort9181
		= (short) (int) (Math.sqrt((double) i_713_) + 0.99);
	    ((Class157_Sub2) this).aBool9179 = true;
	}
    }
    
    void method1906() {
	if (((Class157_Sub2) this).aBool9168) {
	    for (int i = 0; i < ((Class157_Sub2) this).anInt9135; i++) {
		((Class157_Sub2) this).anIntArray9203[i]
		    = ((Class157_Sub2) this).anIntArray9203[i] + 7 >> 4;
		((Class157_Sub2) this).anIntArray9204[i]
		    = ((Class157_Sub2) this).anIntArray9204[i] + 7 >> 4;
		((Class157_Sub2) this).anIntArray9177[i]
		    = ((Class157_Sub2) this).anIntArray9177[i] + 7 >> 4;
	    }
	    ((Class157_Sub2) this).aBool9168 = false;
	}
	if (((Class157_Sub2) this).aBool9195) {
	    method8406();
	    ((Class157_Sub2) this).aBool9195 = false;
	}
	((Class157_Sub2) this).aBool9179 = false;
    }
    
    public void method1915(int i) {
	if ((((Class157_Sub2) this).anInt9132 & 0x2000) != 8192)
	    throw new IllegalStateException();
	((Class157_Sub2) this).anInt9134 = i;
	((Class157_Sub2) this).anInt9152 = 0;
    }
    
    public int method1928() {
	return ((Class157_Sub2) this).anInt9133;
    }
    
    public int method1903() {
	if (!((Class157_Sub2) this).aBool9187)
	    method1909();
	return ((Class157_Sub2) this).aShort9189;
    }
    
    public byte[] method1913() {
	return ((Class157_Sub2) this).aByteArray9160;
    }
    
    public void method1914(short i, short i_725_) {
	for (int i_726_ = 0; i_726_ < ((Class157_Sub2) this).anInt9143;
	     i_726_++) {
	    if (((Class157_Sub2) this).aShortArray9162[i_726_] == i)
		((Class157_Sub2) this).aShortArray9162[i_726_] = i_725_;
	}
	if (((Class157_Sub2) this).aClass90Array9156 != null) {
	    for (int i_727_ = 0; i_727_ < ((Class157_Sub2) this).anInt9175;
		 i_727_++) {
		Class90 class90
		    = ((Class157_Sub2) this).aClass90Array9156[i_727_];
		Class108 class108
		    = ((Class157_Sub2) this).aClass108Array9123[i_727_];
		((Class108) class108).anInt1368
		    = ((((Class108) class108).anInt1368 * -1351793475
			& ~0xffffff)
		       | ((Class72.anIntArray777
			   [Class516.method6283((((Class157_Sub2) this)
						 .aShortArray9162
						 [(((Class90) class90)
						   .anInt1142) * 1037728387]),
						515814180) & 0xffff])
			  & 0xffffff)) * 323344021;
	    }
	}
	if (((Class157_Sub2) this).anInt9152 == 2)
	    ((Class157_Sub2) this).anInt9152 = 1;
    }
    
    public void method1931(int i) {
	if ((((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
	     .anInt9745) * -1585405167
	    > 1) {
	    synchronized (this) {
		if ((((Class157_Sub2) this).anInt9132 & 0x10000) == 65536
		    && (i & 0x10000) == 0)
		    method8402(true);
		((Class157_Sub2) this).anInt9132 = i;
	    }
	} else {
	    if ((((Class157_Sub2) this).anInt9132 & 0x10000) == 65536
		&& (i & 0x10000) == 0)
		method8402(true);
	    ((Class157_Sub2) this).anInt9132 = i;
	}
    }
    
    public void method1942(int i) {
	if ((((Class157_Sub2) this).anInt9132 & 0x3) != 3)
	    throw new IllegalStateException();
	int i_728_ = Class417.anIntArray4766[i];
	int i_729_ = Class417.anIntArray4767[i];
	synchronized (this) {
	    for (int i_730_ = 0; i_730_ < ((Class157_Sub2) this).anInt9135;
		 i_730_++) {
		int i_731_
		    = ((((Class157_Sub2) this).anIntArray9204[i_730_] * i_728_
			+ (((Class157_Sub2) this).anIntArray9203[i_730_]
			   * i_729_))
		       >> 14);
		((Class157_Sub2) this).anIntArray9204[i_730_]
		    = (((Class157_Sub2) this).anIntArray9204[i_730_] * i_729_
		       - (((Class157_Sub2) this).anIntArray9203[i_730_]
			  * i_728_)) >> 14;
		((Class157_Sub2) this).anIntArray9203[i_730_] = i_731_;
	    }
	    method8411();
	}
    }
    
    public void method1917(int i, int i_732_, int i_733_, int i_734_) {
	if ((((Class157_Sub2) this).anInt9132 & 0x80000) != 524288)
	    throw new IllegalStateException();
	for (int i_735_ = 0; i_735_ < ((Class157_Sub2) this).anInt9143;
	     i_735_++) {
	    int i_736_
		= ((Class157_Sub2) this).aShortArray9162[i_735_] & 0xffff;
	    int i_737_ = i_736_ >> 10 & 0x3f;
	    int i_738_ = i_736_ >> 7 & 0x7;
	    int i_739_ = i_736_ & 0x7f;
	    if (i != -1)
		i_737_ += (i - i_737_) * i_734_ >> 7;
	    if (i_732_ != -1)
		i_738_ += (i_732_ - i_738_) * i_734_ >> 7;
	    if (i_733_ != -1)
		i_739_ += (i_733_ - i_739_) * i_734_ >> 7;
	    ((Class157_Sub2) this).aShortArray9162[i_735_]
		= (short) (i_737_ << 10 | i_738_ << 7 | i_739_);
	}
	if (((Class157_Sub2) this).aClass90Array9156 != null) {
	    for (int i_740_ = 0; i_740_ < ((Class157_Sub2) this).anInt9175;
		 i_740_++) {
		Class90 class90
		    = ((Class157_Sub2) this).aClass90Array9156[i_740_];
		Class108 class108
		    = ((Class157_Sub2) this).aClass108Array9123[i_740_];
		((Class108) class108).anInt1368
		    = ((((Class108) class108).anInt1368 * -1351793475
			& ~0xffffff)
		       | ((Class72.anIntArray777
			   [Class516.method6283(((((Class157_Sub2) this)
						  .aShortArray9162
						  [(((Class90) class90)
						    .anInt1142) * 1037728387])
						 & 0xffff),
						515814180) & 0xffff])
			  & 0xffffff)) * 323344021;
	    }
	}
	if (((Class157_Sub2) this).anInt9152 == 2)
	    ((Class157_Sub2) this).anInt9152 = 1;
    }
    
    public Class170[] method1922() {
	return ((Class157_Sub2) this).aClass170Array9122;
    }
    
    public Class144[] method1923() {
	return ((Class157_Sub2) this).aClass144Array9125;
    }
    
    public int method1902() {
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	return ((Class157_Sub2) this).aShort9184;
    }
    
    public boolean method1919() {
	return ((Class157_Sub2) this).aBool9190;
    }
    
    public boolean method1920() {
	return ((Class157_Sub2) this).aBool9199;
    }
    
    Class157_Sub2(Class173_Sub3 class173_sub3) {
	((Class157_Sub2) this).anInt9152 = 0;
	((Class157_Sub2) this).aBool9168 = false;
	((Class157_Sub2) this).aBool9172 = false;
	((Class157_Sub2) this).aBool9179 = false;
	((Class157_Sub2) this).aBool9187 = false;
	((Class157_Sub2) this).aBool9190 = false;
	((Class157_Sub2) this).aBool9199 = false;
	((Class157_Sub2) this).aClass173_Sub3_9130 = class173_sub3;
    }
    
    Class157_Sub2(Class173_Sub3 class173_sub3, Class177 class177, int i,
		  int i_741_, int i_742_, int i_743_) {
	((Class157_Sub2) this).anInt9152 = 0;
	((Class157_Sub2) this).aBool9168 = false;
	((Class157_Sub2) this).aBool9172 = false;
	((Class157_Sub2) this).aBool9179 = false;
	((Class157_Sub2) this).aBool9187 = false;
	((Class157_Sub2) this).aBool9190 = false;
	((Class157_Sub2) this).aBool9199 = false;
	((Class157_Sub2) this).aClass173_Sub3_9130 = class173_sub3;
	((Class157_Sub2) this).anInt9132 = i;
	((Class157_Sub2) this).anInt9133 = i_741_;
	((Class157_Sub2) this).anInt9134 = i_742_;
	Class165 class165
	    = ((Class157_Sub2) this).aClass173_Sub3_9130.aClass165_1984;
	Interface44 interface44
	    = ((Class157_Sub2) this).aClass173_Sub3_9130.anInterface44_1983;
	((Class157_Sub2) this).anInt9135 = class177.anInt2036;
	((Class157_Sub2) this).anInt9136 = class177.anInt2074;
	((Class157_Sub2) this).anIntArray9203 = class177.anIntArray2038;
	((Class157_Sub2) this).anIntArray9204 = class177.anIntArray2068;
	((Class157_Sub2) this).anIntArray9177 = class177.anIntArray2044;
	((Class157_Sub2) this).anInt9143 = class177.anInt2047;
	((Class157_Sub2) this).aShortArray9145 = class177.aShortArray2067;
	((Class157_Sub2) this).aShortArray9146 = class177.aShortArray2049;
	((Class157_Sub2) this).aShortArray9147 = class177.aShortArray2050;
	((Class157_Sub2) this).aByteArray9159 = class177.aByteArray2048;
	((Class157_Sub2) this).aShortArray9162 = class177.aShortArray2058;
	((Class157_Sub2) this).aByteArray9160 = class177.aByteArray2056;
	((Class157_Sub2) this).aShortArray9163 = class177.aShortArray2062;
	((Class157_Sub2) this).aByteArray9158 = class177.aByteArray2054;
	((Class157_Sub2) this).aClass170Array9122
	    = class177.aClass170Array2078;
	((Class157_Sub2) this).aClass144Array9125
	    = class177.aClass144Array2059;
	((Class157_Sub2) this).aShortArray9140 = class177.aShortArray2043;
	((Class157_Sub2) this).anInt9198 = ((Class157_Sub2) this).anInt9143;
	int[] is = new int[((Class157_Sub2) this).anInt9143];
	for (int i_744_ = 0; i_744_ < ((Class157_Sub2) this).anInt9143;
	     i_744_++)
	    is[i_744_] = i_744_;
	long[] ls = new long[((Class157_Sub2) this).anInt9143];
	boolean bool = (((Class157_Sub2) this).anInt9132 & 0x100) != 0;
	for (int i_745_ = 0; i_745_ < ((Class157_Sub2) this).anInt9143;
	     i_745_++) {
	    int i_746_ = is[i_745_];
	    Class160 class160 = null;
	    int i_747_ = 0;
	    int i_748_ = 0;
	    int i_749_ = 0;
	    int i_750_ = 0;
	    if (class177.aClass176Array2040 != null) {
		boolean bool_751_ = false;
		for (int i_752_ = 0;
		     i_752_ < class177.aClass176Array2040.length; i_752_++) {
		    Class176 class176 = class177.aClass176Array2040[i_752_];
		    if (i_746_ == class176.anInt2026 * 967499851) {
			Class391 class391
			    = interface44.method324((class176.anInt2028
						     * 1984522459),
						    -1285706399);
			if (class391.aBool4119)
			    bool_751_ = true;
			if (class391.anInt4113 * 176412091 != -1) {
			    Class160 class160_753_
				= class165.method2093((class391.anInt4113
						       * 176412091),
						      (byte) -49);
			    if (class160_753_.aClass583_1771
				== Class583.aClass583_7697)
				((Class157_Sub2) this).aBool9190 = true;
			}
		    }
		}
		if (bool_751_) {
		    ls[i_745_] = 9223372036854775807L;
		    ((Class157_Sub2) this).anInt9198--;
		    continue;
		}
	    }
	    if (class177.aClass170Array2078 != null) {
		boolean bool_754_ = false;
		for (int i_755_ = 0;
		     i_755_ < class177.aClass170Array2078.length; i_755_++) {
		    Class170 class170 = class177.aClass170Array2078[i_755_];
		    if (i_746_ == class170.anInt1954 * 1492183661) {
			Class386 class386
			    = (((Class157_Sub2) this).aClass173_Sub3_9130
				   .anInterface45_2005.method326
			       (class170.anInt1957 * 1262475263, (byte) 62));
			if (class386.aBool4043)
			    bool_754_ = true;
		    }
		}
		if (bool_754_) {
		    ls[i_745_] = 9223372036854775807L;
		    ((Class157_Sub2) this).anInt9198--;
		    continue;
		}
	    }
	    int i_756_ = -1;
	    if (class177.aShortArray2037 != null) {
		i_756_ = class177.aShortArray2037[i_746_];
		if (i_756_ != -1) {
		    class160
			= class165.method2093(i_756_ & 0xffff, (byte) -124);
		    if ((i_743_ & 0x40) == 0 || !class160.aBool1800) {
			i_749_ = class160.aByte1790;
			i_750_ = class160.aByte1796;
		    } else
			i_756_ = -1;
		}
	    }
	    boolean bool_757_
		= ((((Class157_Sub2) this).aByteArray9160 != null
		    && ((Class157_Sub2) this).aByteArray9160[i_746_] != 0)
		   || (class160 != null
		       && class160.aClass583_1771 == Class583.aClass583_7697));
	    if ((bool || bool_757_)
		&& ((Class157_Sub2) this).aByteArray9159 != null)
		i_747_ += ((Class157_Sub2) this).aByteArray9159[i_746_] << 17;
	    if (bool_757_)
		i_747_ += 65536;
	    i_747_ += (i_749_ & 0xff) << 8;
	    i_747_ += i_750_ & 0xff;
	    i_748_ += (i_756_ & 0xffff) << 16;
	    i_748_ += i_745_ & 0xffff;
	    ls[i_745_] = ((long) i_747_ << 32) + (long) i_748_;
	    ((Class157_Sub2) this).aBool9190 |= bool_757_;
	}
	Class650.method7737(ls, is, -486316779);
	if (class177.aClass176Array2040 != null) {
	    ((Class157_Sub2) this).anInt9175
		= class177.aClass176Array2040.length;
	    ((Class157_Sub2) this).aClass90Array9156
		= new Class90[((Class157_Sub2) this).anInt9175];
	    ((Class157_Sub2) this).aClass108Array9123
		= new Class108[((Class157_Sub2) this).anInt9175];
	    for (int i_758_ = 0; i_758_ < class177.aClass176Array2040.length;
		 i_758_++) {
		Class176 class176 = class177.aClass176Array2040[i_758_];
		Class391 class391
		    = interface44.method324(class176.anInt2028 * 1984522459,
					    -841365131);
		int i_759_
		    = Class72.anIntArray777[((class177.aShortArray2058
					      [class176.anInt2026 * 967499851])
					     & 0xffff)] & 0xffffff;
		i_759_ = i_759_ | 255 - (class177.aByteArray2056 != null
					 ? ((class177.aByteArray2056
					     [class176.anInt2026 * 967499851])
					    & 0xff)
					 : 0) << 24;
		((Class157_Sub2) this).aClass90Array9156[i_758_]
		    = new Class90(class176.anInt2026 * 967499851,
				  (class177.aShortArray2067
				   [class176.anInt2026 * 967499851]),
				  (class177.aShortArray2049
				   [class176.anInt2026 * 967499851]),
				  (class177.aShortArray2050
				   [class176.anInt2026 * 967499851]),
				  class391.anInt4112 * 313007929,
				  class391.anInt4116 * 20092487,
				  class391.anInt4113 * 176412091,
				  class391.anInt4117 * -1868657835,
				  class391.anInt4115 * 545277371,
				  class391.aBool4119,
				  class176.anInt2029 * -530518277);
		((Class157_Sub2) this).aClass108Array9123[i_758_]
		    = new Class108(i_759_);
	    }
	}
	((Class157_Sub2) this).aFloatArrayArray9157
	    = new float[((Class157_Sub2) this).anInt9143][];
	((Class157_Sub2) this).aFloatArrayArray9149
	    = new float[((Class157_Sub2) this).anInt9143][];
	Class167 class167
	    = method1881(class177, is, ((Class157_Sub2) this).anInt9143);
	Class107 class107 = ((Class157_Sub2) this).aClass173_Sub3_9130
				.method8939(Thread.currentThread());
	float[] fs = ((Class107) class107).aFloatArray1329;
	boolean bool_760_ = false;
	for (int i_761_ = 0; i_761_ < ((Class157_Sub2) this).anInt9143;
	     i_761_++) {
	    int i_762_ = is[i_761_];
	    int i_763_ = (class177.aShortArray2037 != null
			  ? class177.aShortArray2037[i_762_] : -1);
	    if (i_763_ != -1 && (i_743_ & 0x40) != 0
		&& class165.method2093(i_763_ & 0xffff, (byte) -46).aBool1800)
		i_763_ = -1;
	    if (i_763_ != -1) {
		int i_764_ = (class177.aShortArray2057 != null
			      ? class177.aShortArray2057[i_762_] : -1);
		bool_760_ = true;
		float[] fs_765_
		    = (((Class157_Sub2) this).aFloatArrayArray9157[i_762_]
		       = new float[3]);
		float[] fs_766_
		    = (((Class157_Sub2) this).aFloatArrayArray9149[i_762_]
		       = new float[3]);
		if (i_764_ == 32766) {
		    int i_767_ = class177.aByteArray2051[i_762_] & 0xff;
		    int i_768_ = class177.aByteArray2075[i_762_] & 0xff;
		    int i_769_ = class177.aByteArray2053[i_762_] & 0xff;
		    i_767_ += (class177.anIntArray2041
			       [class177.aShortArray2067[i_762_]]);
		    i_768_ += (class177.anIntArray2041
			       [class177.aShortArray2049[i_762_]]);
		    i_769_ += (class177.anIntArray2041
			       [class177.aShortArray2050[i_762_]]);
		    fs_765_[0] = class177.aFloatArray2052[i_767_];
		    fs_766_[0] = class177.aFloatArray2046[i_767_];
		    fs_765_[1] = class177.aFloatArray2052[i_768_];
		    fs_766_[1] = class177.aFloatArray2046[i_768_];
		    fs_765_[2] = class177.aFloatArray2052[i_769_];
		    fs_766_[2] = class177.aFloatArray2046[i_769_];
		} else if (i_764_ == -1) {
		    fs_765_[0] = 0.0F;
		    fs_766_[0] = 1.0F;
		    fs_765_[1] = 1.0F;
		    fs_766_[1] = 1.0F;
		    fs_765_[2] = 0.0F;
		    fs_766_[2] = 0.0F;
		} else {
		    i_764_ &= 0xffff;
		    byte i_770_ = class177.aByteArray2076[i_764_];
		    if (i_770_ == 0) {
			short i_771_
			    = ((Class157_Sub2) this).aShortArray9145[i_762_];
			short i_772_
			    = ((Class157_Sub2) this).aShortArray9146[i_762_];
			short i_773_
			    = ((Class157_Sub2) this).aShortArray9147[i_762_];
			short i_774_ = class177.aShortArray2064[i_764_];
			short i_775_ = class177.aShortArray2077[i_764_];
			short i_776_ = class177.aShortArray2069[i_764_];
			float f = (float) (((Class157_Sub2) this)
					   .anIntArray9203[i_774_]);
			float f_777_ = (float) (((Class157_Sub2) this)
						.anIntArray9204[i_774_]);
			float f_778_ = (float) (((Class157_Sub2) this)
						.anIntArray9177[i_774_]);
			float f_779_ = ((float) (((Class157_Sub2) this)
						 .anIntArray9203[i_775_])
					- f);
			float f_780_ = ((float) (((Class157_Sub2) this)
						 .anIntArray9204[i_775_])
					- f_777_);
			float f_781_ = ((float) (((Class157_Sub2) this)
						 .anIntArray9177[i_775_])
					- f_778_);
			float f_782_ = ((float) (((Class157_Sub2) this)
						 .anIntArray9203[i_776_])
					- f);
			float f_783_ = ((float) (((Class157_Sub2) this)
						 .anIntArray9204[i_776_])
					- f_777_);
			float f_784_ = ((float) (((Class157_Sub2) this)
						 .anIntArray9177[i_776_])
					- f_778_);
			float f_785_ = ((float) (((Class157_Sub2) this)
						 .anIntArray9203[i_771_])
					- f);
			float f_786_ = ((float) (((Class157_Sub2) this)
						 .anIntArray9204[i_771_])
					- f_777_);
			float f_787_ = ((float) (((Class157_Sub2) this)
						 .anIntArray9177[i_771_])
					- f_778_);
			float f_788_ = ((float) (((Class157_Sub2) this)
						 .anIntArray9203[i_772_])
					- f);
			float f_789_ = ((float) (((Class157_Sub2) this)
						 .anIntArray9204[i_772_])
					- f_777_);
			float f_790_ = ((float) (((Class157_Sub2) this)
						 .anIntArray9177[i_772_])
					- f_778_);
			float f_791_ = ((float) (((Class157_Sub2) this)
						 .anIntArray9203[i_773_])
					- f);
			float f_792_ = ((float) (((Class157_Sub2) this)
						 .anIntArray9204[i_773_])
					- f_777_);
			float f_793_ = ((float) (((Class157_Sub2) this)
						 .anIntArray9177[i_773_])
					- f_778_);
			float f_794_ = f_780_ * f_784_ - f_781_ * f_783_;
			float f_795_ = f_781_ * f_782_ - f_779_ * f_784_;
			float f_796_ = f_779_ * f_783_ - f_780_ * f_782_;
			float f_797_ = f_783_ * f_796_ - f_784_ * f_795_;
			float f_798_ = f_784_ * f_794_ - f_782_ * f_796_;
			float f_799_ = f_782_ * f_795_ - f_783_ * f_794_;
			float f_800_
			    = 1.0F / (f_797_ * f_779_ + f_798_ * f_780_
				      + f_799_ * f_781_);
			fs_765_[0] = (f_797_ * f_785_ + f_798_ * f_786_
				      + f_799_ * f_787_) * f_800_;
			fs_765_[1] = (f_797_ * f_788_ + f_798_ * f_789_
				      + f_799_ * f_790_) * f_800_;
			fs_765_[2] = (f_797_ * f_791_ + f_798_ * f_792_
				      + f_799_ * f_793_) * f_800_;
			f_797_ = f_780_ * f_796_ - f_781_ * f_795_;
			f_798_ = f_781_ * f_794_ - f_779_ * f_796_;
			f_799_ = f_779_ * f_795_ - f_780_ * f_794_;
			f_800_ = 1.0F / (f_797_ * f_782_ + f_798_ * f_783_
					 + f_799_ * f_784_);
			fs_766_[0] = (f_797_ * f_785_ + f_798_ * f_786_
				      + f_799_ * f_787_) * f_800_;
			fs_766_[1] = (f_797_ * f_788_ + f_798_ * f_789_
				      + f_799_ * f_790_) * f_800_;
			fs_766_[2] = (f_797_ * f_791_ + f_798_ * f_792_
				      + f_799_ * f_793_) * f_800_;
		    } else {
			short i_801_
			    = ((Class157_Sub2) this).aShortArray9145[i_762_];
			short i_802_
			    = ((Class157_Sub2) this).aShortArray9146[i_762_];
			short i_803_
			    = ((Class157_Sub2) this).aShortArray9147[i_762_];
			int i_804_ = class167.anIntArray1928[i_764_];
			int i_805_ = class167.anIntArray1930[i_764_];
			int i_806_ = class167.anIntArray1929[i_764_];
			float[] fs_807_
			    = class167.aFloatArrayArray1927[i_764_];
			byte i_808_ = class177.aByteArray2079[i_764_];
			float f
			    = (float) class177.anIntArray2045[i_764_] / 256.0F;
			if (i_770_ == 1) {
			    float f_809_
				= ((float) class177.anIntArray2072[i_764_]
				   / 1024.0F);
			    method1867
				(((Class157_Sub2) this).anIntArray9203[i_801_],
				 ((Class157_Sub2) this).anIntArray9204[i_801_],
				 ((Class157_Sub2) this).anIntArray9177[i_801_],
				 i_804_, i_805_, i_806_, fs_807_, f_809_,
				 i_808_, f, fs);
			    fs_765_[0] = fs[0];
			    fs_766_[0] = fs[1];
			    method1867
				(((Class157_Sub2) this).anIntArray9203[i_802_],
				 ((Class157_Sub2) this).anIntArray9204[i_802_],
				 ((Class157_Sub2) this).anIntArray9177[i_802_],
				 i_804_, i_805_, i_806_, fs_807_, f_809_,
				 i_808_, f, fs);
			    fs_765_[1] = fs[0];
			    fs_766_[1] = fs[1];
			    method1867
				(((Class157_Sub2) this).anIntArray9203[i_803_],
				 ((Class157_Sub2) this).anIntArray9204[i_803_],
				 ((Class157_Sub2) this).anIntArray9177[i_803_],
				 i_804_, i_805_, i_806_, fs_807_, f_809_,
				 i_808_, f, fs);
			    fs_765_[2] = fs[0];
			    fs_766_[2] = fs[1];
			    float f_810_ = f_809_ / 2.0F;
			    if ((i_808_ & 0x1) == 0) {
				if (fs_765_[1] - fs_765_[0] > f_810_)
				    fs_765_[1] -= f_809_;
				else if (fs_765_[0] - fs_765_[1] > f_810_)
				    fs_765_[1] += f_809_;
				if (fs_765_[2] - fs_765_[0] > f_810_)
				    fs_765_[2] -= f_809_;
				else if (fs_765_[0] - fs_765_[2] > f_810_)
				    fs_765_[2] += f_809_;
			    } else {
				if (fs_766_[1] - fs_766_[0] > f_810_)
				    fs_766_[1] -= f_809_;
				else if (fs_766_[0] - fs_766_[1] > f_810_)
				    fs_766_[1] += f_809_;
				if (fs_766_[2] - fs_766_[0] > f_810_)
				    fs_766_[2] -= f_809_;
				else if (fs_766_[0] - fs_766_[2] > f_810_)
				    fs_766_[2] += f_809_;
			    }
			} else if (i_770_ == 2) {
			    float f_811_
				= ((float) class177.anIntArray2055[i_764_]
				   / 256.0F);
			    float f_812_
				= ((float) class177.anIntArray2032[i_764_]
				   / 256.0F);
			    int i_813_ = ((((Class157_Sub2) this)
					   .anIntArray9203[i_802_])
					  - (((Class157_Sub2) this)
					     .anIntArray9203[i_801_]));
			    int i_814_ = ((((Class157_Sub2) this)
					   .anIntArray9204[i_802_])
					  - (((Class157_Sub2) this)
					     .anIntArray9204[i_801_]));
			    int i_815_ = ((((Class157_Sub2) this)
					   .anIntArray9177[i_802_])
					  - (((Class157_Sub2) this)
					     .anIntArray9177[i_801_]));
			    int i_816_ = ((((Class157_Sub2) this)
					   .anIntArray9203[i_803_])
					  - (((Class157_Sub2) this)
					     .anIntArray9203[i_801_]));
			    int i_817_ = ((((Class157_Sub2) this)
					   .anIntArray9204[i_803_])
					  - (((Class157_Sub2) this)
					     .anIntArray9204[i_801_]));
			    int i_818_ = ((((Class157_Sub2) this)
					   .anIntArray9177[i_803_])
					  - (((Class157_Sub2) this)
					     .anIntArray9177[i_801_]));
			    int i_819_ = i_814_ * i_818_ - i_817_ * i_815_;
			    int i_820_ = i_815_ * i_816_ - i_818_ * i_813_;
			    int i_821_ = i_813_ * i_817_ - i_816_ * i_814_;
			    float f_822_
				= (64.0F
				   / (float) class177.anIntArray2070[i_764_]);
			    float f_823_
				= (64.0F
				   / (float) class177.anIntArray2071[i_764_]);
			    float f_824_
				= (64.0F
				   / (float) class177.anIntArray2072[i_764_]);
			    float f_825_ = (((float) i_819_ * fs_807_[0]
					     + (float) i_820_ * fs_807_[1]
					     + (float) i_821_ * fs_807_[2])
					    / f_822_);
			    float f_826_ = (((float) i_819_ * fs_807_[3]
					     + (float) i_820_ * fs_807_[4]
					     + (float) i_821_ * fs_807_[5])
					    / f_823_);
			    float f_827_ = (((float) i_819_ * fs_807_[6]
					     + (float) i_820_ * fs_807_[7]
					     + (float) i_821_ * fs_807_[8])
					    / f_824_);
			    int i_828_ = method1993(f_825_, f_826_, f_827_);
			    method1869
				(((Class157_Sub2) this).anIntArray9203[i_801_],
				 ((Class157_Sub2) this).anIntArray9204[i_801_],
				 ((Class157_Sub2) this).anIntArray9177[i_801_],
				 i_804_, i_805_, i_806_, i_828_, fs_807_,
				 i_808_, f, f_811_, f_812_, fs);
			    fs_765_[0] = fs[0];
			    fs_766_[0] = fs[1];
			    method1869
				(((Class157_Sub2) this).anIntArray9203[i_802_],
				 ((Class157_Sub2) this).anIntArray9204[i_802_],
				 ((Class157_Sub2) this).anIntArray9177[i_802_],
				 i_804_, i_805_, i_806_, i_828_, fs_807_,
				 i_808_, f, f_811_, f_812_, fs);
			    fs_765_[1] = fs[0];
			    fs_766_[1] = fs[1];
			    method1869
				(((Class157_Sub2) this).anIntArray9203[i_803_],
				 ((Class157_Sub2) this).anIntArray9204[i_803_],
				 ((Class157_Sub2) this).anIntArray9177[i_803_],
				 i_804_, i_805_, i_806_, i_828_, fs_807_,
				 i_808_, f, f_811_, f_812_, fs);
			    fs_765_[2] = fs[0];
			    fs_766_[2] = fs[1];
			} else if (i_770_ == 3) {
			    method1866
				(((Class157_Sub2) this).anIntArray9203[i_801_],
				 ((Class157_Sub2) this).anIntArray9204[i_801_],
				 ((Class157_Sub2) this).anIntArray9177[i_801_],
				 i_804_, i_805_, i_806_, fs_807_, i_808_, f,
				 fs);
			    fs_765_[0] = fs[0];
			    fs_766_[0] = fs[1];
			    method1866
				(((Class157_Sub2) this).anIntArray9203[i_802_],
				 ((Class157_Sub2) this).anIntArray9204[i_802_],
				 ((Class157_Sub2) this).anIntArray9177[i_802_],
				 i_804_, i_805_, i_806_, fs_807_, i_808_, f,
				 fs);
			    fs_765_[1] = fs[0];
			    fs_766_[1] = fs[1];
			    method1866
				(((Class157_Sub2) this).anIntArray9203[i_803_],
				 ((Class157_Sub2) this).anIntArray9204[i_803_],
				 ((Class157_Sub2) this).anIntArray9177[i_803_],
				 i_804_, i_805_, i_806_, fs_807_, i_808_, f,
				 fs);
			    fs_765_[2] = fs[0];
			    fs_766_[2] = fs[1];
			    if ((i_808_ & 0x1) == 0) {
				if (fs_765_[1] - fs_765_[0] > 0.5F)
				    fs_765_[1]--;
				else if (fs_765_[0] - fs_765_[1] > 0.5F)
				    fs_765_[1]++;
				if (fs_765_[2] - fs_765_[0] > 0.5F)
				    fs_765_[2]--;
				else if (fs_765_[0] - fs_765_[2] > 0.5F)
				    fs_765_[2]++;
			    } else {
				if (fs_766_[1] - fs_766_[0] > 0.5F)
				    fs_766_[1]--;
				else if (fs_766_[0] - fs_766_[1] > 0.5F)
				    fs_766_[1]++;
				if (fs_766_[2] - fs_766_[0] > 0.5F)
				    fs_766_[2]--;
				else if (fs_766_[0] - fs_766_[2] > 0.5F)
				    fs_766_[2]++;
			    }
			}
		    }
		}
	    }
	}
	if (!bool_760_) {
	    ((Class157_Sub2) this).aFloatArrayArray9149 = null;
	    ((Class157_Sub2) this).aFloatArrayArray9157 = null;
	}
	if (class177.anIntArray2042 != null
	    && (((Class157_Sub2) this).anInt9132 & 0x20) != 0)
	    ((Class157_Sub2) this).anIntArrayArray9165
		= class177.method2579(true);
	if (class177.anIntArray2060 != null
	    && (((Class157_Sub2) this).anInt9132 & 0x180) != 0)
	    ((Class157_Sub2) this).anIntArrayArray9166 = class177.method2596();
	if (class177.aClass176Array2040 != null
	    && (((Class157_Sub2) this).anInt9132 & 0x400) != 0)
	    ((Class157_Sub2) this).anIntArrayArray9178 = class177.method2582();
	if (class177.aShortArray2037 != null) {
	    ((Class157_Sub2) this).aShortArray9205
		= new short[((Class157_Sub2) this).anInt9143];
	    boolean bool_829_ = false;
	    for (int i_830_ = 0; i_830_ < ((Class157_Sub2) this).anInt9143;
		 i_830_++) {
		short i_831_ = class177.aShortArray2037[i_830_];
		if (i_831_ != -1) {
		    Class160 class160
			= ((Class157_Sub2) this).aClass173_Sub3_9130
			      .aClass165_1984
			      .method2093(i_831_ & 0xffff, (byte) -126);
		    if ((i_743_ & 0x40) == 0 || !class160.aBool1800) {
			((Class157_Sub2) this).aShortArray9205[i_830_]
			    = i_831_;
			bool_829_ = true;
			if (class160.aClass583_1771 == Class583.aClass583_7697)
			    ((Class157_Sub2) this).aBool9190 = true;
			if (class160.aByte1775 != 0 || class160.aByte1776 != 0)
			    ((Class157_Sub2) this).aBool9199 = true;
		    } else
			((Class157_Sub2) this).aShortArray9205[i_830_]
			    = (short) -1;
		} else
		    ((Class157_Sub2) this).aShortArray9205[i_830_]
			= (short) -1;
	    }
	    if (!bool_829_)
		((Class157_Sub2) this).aShortArray9205 = null;
	} else
	    ((Class157_Sub2) this).aShortArray9205 = null;
	if (((Class157_Sub2) this).aBool9190
	    || ((Class157_Sub2) this).aClass90Array9156 != null) {
	    ((Class157_Sub2) this).aShortArray9164
		= new short[((Class157_Sub2) this).anInt9143];
	    for (int i_832_ = 0; i_832_ < ((Class157_Sub2) this).anInt9143;
		 i_832_++)
		((Class157_Sub2) this).aShortArray9164[i_832_]
		    = (short) is[i_832_];
	}
    }
    
    void method8421() {
	if (((Class157_Sub2) this).anInt9152 == 0
	    && ((Class157_Sub2) this).aClass103Array9141 == null) {
	    if ((((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
		 .anInt9745) * -1585405167
		> 1) {
		synchronized (this) {
		    method8435();
		}
	    } else
		method8435();
	}
    }
    
    void method8422() {
	if (((Class157_Sub2) this).anInt9152 == 0
	    && ((Class157_Sub2) this).aClass103Array9141 == null) {
	    if ((((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
		 .anInt9745) * -1585405167
		> 1) {
		synchronized (this) {
		    method8435();
		}
	    } else
		method8435();
	}
    }
    
    void method8423() {
	if (((Class157_Sub2) this).anInt9152 == 0
	    && ((Class157_Sub2) this).aClass103Array9141 == null) {
	    if ((((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
		 .anInt9745) * -1585405167
		> 1) {
		synchronized (this) {
		    method8435();
		}
	    } else
		method8435();
	}
    }
    
    void method8424() {
	((Class157_Sub2) this).aClass103Array9141
	    = new Class103[((Class157_Sub2) this).anInt9136];
	for (int i = 0; i < ((Class157_Sub2) this).anInt9136; i++)
	    ((Class157_Sub2) this).aClass103Array9141[i] = new Class103();
	for (int i = 0; i < ((Class157_Sub2) this).anInt9143; i++) {
	    short i_833_ = ((Class157_Sub2) this).aShortArray9145[i];
	    short i_834_ = ((Class157_Sub2) this).aShortArray9146[i];
	    short i_835_ = ((Class157_Sub2) this).aShortArray9147[i];
	    int i_836_ = (((Class157_Sub2) this).anIntArray9203[i_834_]
			  - ((Class157_Sub2) this).anIntArray9203[i_833_]);
	    int i_837_ = (((Class157_Sub2) this).anIntArray9204[i_834_]
			  - ((Class157_Sub2) this).anIntArray9204[i_833_]);
	    int i_838_ = (((Class157_Sub2) this).anIntArray9177[i_834_]
			  - ((Class157_Sub2) this).anIntArray9177[i_833_]);
	    int i_839_ = (((Class157_Sub2) this).anIntArray9203[i_835_]
			  - ((Class157_Sub2) this).anIntArray9203[i_833_]);
	    int i_840_ = (((Class157_Sub2) this).anIntArray9204[i_835_]
			  - ((Class157_Sub2) this).anIntArray9204[i_833_]);
	    int i_841_ = (((Class157_Sub2) this).anIntArray9177[i_835_]
			  - ((Class157_Sub2) this).anIntArray9177[i_833_]);
	    int i_842_ = i_837_ * i_841_ - i_840_ * i_838_;
	    int i_843_ = i_838_ * i_839_ - i_841_ * i_836_;
	    int i_844_;
	    for (i_844_ = i_836_ * i_840_ - i_839_ * i_837_;
		 (i_842_ > 8192 || i_843_ > 8192 || i_844_ > 8192
		  || i_842_ < -8192 || i_843_ < -8192 || i_844_ < -8192);
		 i_844_ >>= 1) {
		i_842_ >>= 1;
		i_843_ >>= 1;
	    }
	    int i_845_
		= (int) Math.sqrt((double) (i_842_ * i_842_ + i_843_ * i_843_
					    + i_844_ * i_844_));
	    if (i_845_ <= 0)
		i_845_ = 1;
	    i_842_ = i_842_ * 256 / i_845_;
	    i_843_ = i_843_ * 256 / i_845_;
	    i_844_ = i_844_ * 256 / i_845_;
	    byte i_846_;
	    if (((Class157_Sub2) this).aByteArray9158 == null)
		i_846_ = (byte) 0;
	    else
		i_846_ = ((Class157_Sub2) this).aByteArray9158[i];
	    if (i_846_ == 0) {
		Class103 class103
		    = ((Class157_Sub2) this).aClass103Array9141[i_833_];
		((Class103) class103).anInt1300 += i_842_;
		((Class103) class103).anInt1301 += i_843_;
		((Class103) class103).anInt1299 += i_844_;
		((Class103) class103).anInt1302++;
		class103 = ((Class157_Sub2) this).aClass103Array9141[i_834_];
		((Class103) class103).anInt1300 += i_842_;
		((Class103) class103).anInt1301 += i_843_;
		((Class103) class103).anInt1299 += i_844_;
		((Class103) class103).anInt1302++;
		class103 = ((Class157_Sub2) this).aClass103Array9141[i_835_];
		((Class103) class103).anInt1300 += i_842_;
		((Class103) class103).anInt1301 += i_843_;
		((Class103) class103).anInt1299 += i_844_;
		((Class103) class103).anInt1302++;
	    } else if (i_846_ == 1) {
		if (((Class157_Sub2) this).aClass104Array9196 == null)
		    ((Class157_Sub2) this).aClass104Array9196
			= new Class104[((Class157_Sub2) this).anInt9143];
		Class104 class104
		    = (((Class157_Sub2) this).aClass104Array9196[i]
		       = new Class104());
		((Class104) class104).anInt1305 = i_842_;
		((Class104) class104).anInt1306 = i_843_;
		((Class104) class104).anInt1307 = i_844_;
	    }
	}
    }
    
    void method8425(Thread thread) {
	Class107 class107
	    = ((Class157_Sub2) this).aClass173_Sub3_9130.method8939(thread);
	if (class107 != ((Class157_Sub2) this).aClass107_9176) {
	    ((Class157_Sub2) this).aClass107_9176 = class107;
	    ((Class157_Sub2) this).aClass157_Sub2Array9128
		= (((Class107) ((Class157_Sub2) this).aClass107_9176)
		   .aClass157_Sub2Array1354);
	    ((Class157_Sub2) this).aClass157_Sub2Array9191
		= (((Class107) ((Class157_Sub2) this).aClass107_9176)
		   .aClass157_Sub2Array1357);
	}
    }
    
    void method8426() {
	synchronized (this) {
	    for (int i = 0; i < ((Class157_Sub2) this).anInt9135; i++) {
		((Class157_Sub2) this).anIntArray9203[i]
		    = -((Class157_Sub2) this).anIntArray9203[i];
		((Class157_Sub2) this).anIntArray9177[i]
		    = -((Class157_Sub2) this).anIntArray9177[i];
	    }
	    method8411();
	}
    }
    
    void method8427() {
	synchronized (this) {
	    for (int i = 0; i < ((Class157_Sub2) this).anInt9136; i++) {
		((Class157_Sub2) this).anIntArray9203[i]
		    = -((Class157_Sub2) this).anIntArray9203[i];
		((Class157_Sub2) this).anIntArray9177[i]
		    = -((Class157_Sub2) this).anIntArray9177[i];
		if (((Class157_Sub2) this).aClass103Array9141[i] != null) {
		    ((Class103) ((Class157_Sub2) this).aClass103Array9141[i])
			.anInt1300
			= -((Class103) (((Class157_Sub2) this)
					.aClass103Array9141[i])).anInt1300;
		    ((Class103) ((Class157_Sub2) this).aClass103Array9141[i])
			.anInt1299
			= -((Class103) (((Class157_Sub2) this)
					.aClass103Array9141[i])).anInt1299;
		}
	    }
	    if (((Class157_Sub2) this).aClass104Array9196 != null) {
		for (int i = 0; i < ((Class157_Sub2) this).anInt9143; i++) {
		    if (((Class157_Sub2) this).aClass104Array9196[i] != null) {
			((Class104) (((Class157_Sub2) this).aClass104Array9196
				     [i])).anInt1305
			    = -((Class104) (((Class157_Sub2) this)
					    .aClass104Array9196[i])).anInt1305;
			((Class104) (((Class157_Sub2) this).aClass104Array9196
				     [i])).anInt1307
			    = -((Class104) (((Class157_Sub2) this)
					    .aClass104Array9196[i])).anInt1307;
		    }
		}
	    }
	    for (int i = ((Class157_Sub2) this).anInt9136;
		 i < ((Class157_Sub2) this).anInt9135; i++) {
		((Class157_Sub2) this).anIntArray9203[i]
		    = -((Class157_Sub2) this).anIntArray9203[i];
		((Class157_Sub2) this).anIntArray9177[i]
		    = -((Class157_Sub2) this).anIntArray9177[i];
	    }
	    ((Class157_Sub2) this).anInt9152 = 0;
	    ((Class157_Sub2) this).aBool9179 = false;
	}
    }
    
    public void method2035(int i) {
	if ((((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
	     .anInt9745) * -1585405167
	    > 1) {
	    synchronized (this) {
		if ((((Class157_Sub2) this).anInt9132 & 0x10000) == 65536
		    && (i & 0x10000) == 0)
		    method8402(true);
		((Class157_Sub2) this).anInt9132 = i;
	    }
	} else {
	    if ((((Class157_Sub2) this).anInt9132 & 0x10000) == 65536
		&& (i & 0x10000) == 0)
		method8402(true);
	    ((Class157_Sub2) this).anInt9132 = i;
	}
    }
    
    void method8428() {
	for (int i = 0; i < ((Class157_Sub2) this).anInt9143; i++) {
	    short i_847_
		= (((Class157_Sub2) this).aShortArray9205 != null
		   ? ((Class157_Sub2) this).aShortArray9205[i] : (short) -1);
	    if (i_847_ == -1) {
		int i_848_
		    = ((Class157_Sub2) this).aShortArray9162[i] & 0xffff;
		int i_849_
		    = (i_848_ & 0x7f) * ((Class157_Sub2) this).anInt9133 >> 7;
		short i_850_
		    = Class516.method6283(i_848_ & ~0x7f | i_849_, 515814180);
		if (((Class157_Sub2) this).anIntArray9188[i] == -1) {
		    int i_851_
			= ((Class157_Sub2) this).anIntArray9150[i] & ~0x1ffff;
		    ((Class157_Sub2) this).anIntArray9150[i]
			= i_851_ | PlayerModel.method7300(i_850_, i_851_ >> 17,
						       (byte) -52);
		} else if (((Class157_Sub2) this).anIntArray9188[i] != -2) {
		    int i_852_
			= ((Class157_Sub2) this).anIntArray9150[i] & ~0x1ffff;
		    ((Class157_Sub2) this).anIntArray9150[i]
			= i_852_ | PlayerModel.method7300(i_850_, i_852_ >> 17,
						       (byte) -52);
		    i_852_
			= ((Class157_Sub2) this).anIntArray9151[i] & ~0x1ffff;
		    ((Class157_Sub2) this).anIntArray9151[i]
			= i_852_ | PlayerModel.method7300(i_850_, i_852_ >> 17,
						       (byte) -27);
		    i_852_
			= ((Class157_Sub2) this).anIntArray9188[i] & ~0x1ffff;
		    ((Class157_Sub2) this).anIntArray9188[i]
			= i_852_ | PlayerModel.method7300(i_850_, i_852_ >> 17,
						       (byte) -23);
		}
	    }
	}
	((Class157_Sub2) this).anInt9152 = 2;
    }
    
    public void method1925(Class157 class157, int i, int i_853_, int i_854_,
			   boolean bool) {
	Class157_Sub2 class157_sub2_855_ = (Class157_Sub2) class157;
	if ((((Class157_Sub2) this).anInt9132 & 0x10000) != 65536)
	    throw new IllegalStateException("");
	if ((((Class157_Sub2) class157_sub2_855_).anInt9132 & 0x10000)
	    != 65536)
	    throw new IllegalStateException("");
	method8401(((Class157_Sub2) this).aClass173_Sub3_9130
		       .method8939(Thread.currentThread()));
	method8420();
	method8400();
	class157_sub2_855_.method8420();
	class157_sub2_855_.method8400();
	anInt9192++;
	int i_856_ = 0;
	int[] is = ((Class157_Sub2) class157_sub2_855_).anIntArray9203;
	int i_857_ = ((Class157_Sub2) class157_sub2_855_).anInt9136;
	for (int i_858_ = 0; i_858_ < ((Class157_Sub2) this).anInt9136;
	     i_858_++) {
	    Class103 class103
		= ((Class157_Sub2) this).aClass103Array9141[i_858_];
	    if (((Class103) class103).anInt1302 != 0) {
		int i_859_
		    = ((Class157_Sub2) this).anIntArray9204[i_858_] - i_853_;
		if (i_859_ >= ((Class157_Sub2) class157_sub2_855_).aShort9182
		    && (i_859_
			<= ((Class157_Sub2) class157_sub2_855_).aShort9183)) {
		    int i_860_
			= ((Class157_Sub2) this).anIntArray9203[i_858_] - i;
		    if ((i_860_
			 >= ((Class157_Sub2) class157_sub2_855_).aShort9184)
			&& i_860_ <= (((Class157_Sub2) class157_sub2_855_)
				      .aShort9185)) {
			int i_861_
			    = (((Class157_Sub2) this).anIntArray9177[i_858_]
			       - i_854_);
			if (i_861_ >= (((Class157_Sub2) class157_sub2_855_)
				       .aShort9186)
			    && i_861_ <= (((Class157_Sub2) class157_sub2_855_)
					  .aShort9144)) {
			    for (int i_862_ = 0; i_862_ < i_857_; i_862_++) {
				Class103 class103_863_
				    = (((Class157_Sub2) class157_sub2_855_)
				       .aClass103Array9141[i_862_]);
				if (i_860_ == is[i_862_]
				    && i_861_ == (((Class157_Sub2)
						   class157_sub2_855_)
						  .anIntArray9177[i_862_])
				    && i_859_ == (((Class157_Sub2)
						   class157_sub2_855_)
						  .anIntArray9204[i_862_])
				    && (((Class103) class103_863_).anInt1302
					!= 0)) {
				    if ((((Class157_Sub2) this)
					 .aClass103Array9142)
					== null)
					((Class157_Sub2) this)
					    .aClass103Array9142
					    = new Class103[((Class157_Sub2)
							    this).anInt9136];
				    if ((((Class157_Sub2) class157_sub2_855_)
					 .aClass103Array9142)
					== null)
					((Class157_Sub2) class157_sub2_855_)
					    .aClass103Array9142
					    = new Class103[i_857_];
				    Class103 class103_864_
					= (((Class157_Sub2) this)
					   .aClass103Array9142[i_858_]);
				    if (class103_864_ == null)
					class103_864_
					    = ((Class157_Sub2) this)
						  .aClass103Array9142[i_858_]
					    = new Class103(class103);
				    Class103 class103_865_
					= (((Class157_Sub2) class157_sub2_855_)
					   .aClass103Array9142[i_862_]);
				    if (class103_865_ == null)
					class103_865_
					    = ((Class157_Sub2)
					       class157_sub2_855_)
						  .aClass103Array9142[i_862_]
					    = new Class103(class103_863_);
				    ((Class103) class103_864_).anInt1300
					+= (((Class103) class103_863_)
					    .anInt1300);
				    ((Class103) class103_864_).anInt1301
					+= (((Class103) class103_863_)
					    .anInt1301);
				    ((Class103) class103_864_).anInt1299
					+= (((Class103) class103_863_)
					    .anInt1299);
				    ((Class103) class103_864_).anInt1302
					+= (((Class103) class103_863_)
					    .anInt1302);
				    ((Class103) class103_865_).anInt1300
					+= ((Class103) class103).anInt1300;
				    ((Class103) class103_865_).anInt1301
					+= ((Class103) class103).anInt1301;
				    ((Class103) class103_865_).anInt1299
					+= ((Class103) class103).anInt1299;
				    ((Class103) class103_865_).anInt1302
					+= ((Class103) class103).anInt1302;
				    i_856_++;
				    ((Class157_Sub2) this).anIntArray9201
					[i_858_]
					= anInt9192;
				    ((Class157_Sub2) this).anIntArray9202
					[i_862_]
					= anInt9192;
				}
			    }
			}
		    }
		}
	    }
	}
	if (i_856_ >= 3 && bool) {
	    for (int i_866_ = 0; i_866_ < ((Class157_Sub2) this).anInt9143;
		 i_866_++) {
		if (((((Class157_Sub2) this).anIntArray9201
		      [((Class157_Sub2) this).aShortArray9145[i_866_]])
		     == anInt9192)
		    && ((((Class157_Sub2) this).anIntArray9201
			 [((Class157_Sub2) this).aShortArray9146[i_866_]])
			== anInt9192)
		    && ((((Class157_Sub2) this).anIntArray9201
			 [((Class157_Sub2) this).aShortArray9147[i_866_]])
			== anInt9192)) {
		    if (((Class157_Sub2) this).aByteArray9158 == null)
			((Class157_Sub2) this).aByteArray9158
			    = new byte[((Class157_Sub2) this).anInt9143];
		    ((Class157_Sub2) this).aByteArray9158[i_866_] = (byte) 2;
		}
	    }
	    for (int i_867_ = 0;
		 i_867_ < ((Class157_Sub2) class157_sub2_855_).anInt9143;
		 i_867_++) {
		if ((((Class157_Sub2) this).anIntArray9202
		     [(((Class157_Sub2) class157_sub2_855_).aShortArray9145
		       [i_867_])]) == anInt9192
		    && (((Class157_Sub2) this).anIntArray9202
			[(((Class157_Sub2) class157_sub2_855_).aShortArray9146
			  [i_867_])]) == anInt9192
		    && (((Class157_Sub2) this).anIntArray9202
			[(((Class157_Sub2) class157_sub2_855_).aShortArray9147
			  [i_867_])]) == anInt9192) {
		    if (((Class157_Sub2) class157_sub2_855_).aByteArray9158
			== null)
			((Class157_Sub2) class157_sub2_855_).aByteArray9158
			    = new byte[(((Class157_Sub2) class157_sub2_855_)
					.anInt9143)];
		    ((Class157_Sub2) class157_sub2_855_).aByteArray9158[i_867_]
			= (byte) 2;
		}
	    }
	}
    }
    
    public Class157 method1926(byte i, int i_868_, boolean bool) {
	method8425(Thread.currentThread());
	boolean bool_869_ = false;
	Class157_Sub2 class157_sub2_870_;
	Class157_Sub2 class157_sub2_871_;
	if (i > 0 && i <= 8) {
	    class157_sub2_871_
		= ((Class157_Sub2) this).aClass157_Sub2Array9191[i - 1];
	    class157_sub2_870_
		= ((Class157_Sub2) this).aClass157_Sub2Array9128[i - 1];
	    bool_869_ = true;
	} else
	    class157_sub2_870_ = class157_sub2_871_
		= new Class157_Sub2(((Class157_Sub2) this)
				    .aClass173_Sub3_9130);
	return method8439(class157_sub2_870_, class157_sub2_871_, i_868_,
			  bool_869_, bool);
    }
    
    public Class157 method1927(byte i, int i_872_, boolean bool) {
	method8425(Thread.currentThread());
	boolean bool_873_ = false;
	Class157_Sub2 class157_sub2_874_;
	Class157_Sub2 class157_sub2_875_;
	if (i > 0 && i <= 8) {
	    class157_sub2_875_
		= ((Class157_Sub2) this).aClass157_Sub2Array9191[i - 1];
	    class157_sub2_874_
		= ((Class157_Sub2) this).aClass157_Sub2Array9128[i - 1];
	    bool_873_ = true;
	} else
	    class157_sub2_874_ = class157_sub2_875_
		= new Class157_Sub2(((Class157_Sub2) this)
				    .aClass173_Sub3_9130);
	return method8439(class157_sub2_874_, class157_sub2_875_, i_872_,
			  bool_873_, bool);
    }
    
    public int method2032() {
	return ((Class157_Sub2) this).anInt9132;
    }
    
    public int method1973() {
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	return ((Class157_Sub2) this).aShort9180;
    }
    
    int method8429(int i, short i_876_, int i_877_) {
	int i_878_ = Class649.anIntArray8420[method8404(i, i_877_)];
	Class160 class160
	    = ((Class157_Sub2) this).aClass173_Sub3_9130.aClass165_1984
		  .method2093(i_876_ & 0xffff, (byte) -5);
	int i_879_ = class160.aByte1802 & 0xff;
	if (i_879_ != 0) {
	    int i_880_ = 131586 * i_877_;
	    if (i_879_ == 256)
		i_878_ = i_880_;
	    else {
		int i_881_ = i_879_;
		int i_882_ = 256 - i_879_;
		i_878_ = ((((i_880_ & 0xff00ff) * i_881_
			    + (i_878_ & 0xff00ff) * i_882_)
			   & ~0xff00ff)
			  + (((i_880_ & 0xff00) * i_881_
			      + (i_878_ & 0xff00) * i_882_)
			     & 0xff0000)) >> 8;
	    }
	}
	int i_883_ = class160.aByte1801 & 0xff;
	if (i_883_ != 0) {
	    i_883_ += 256;
	    int i_884_ = ((i_878_ & 0xff0000) >> 16) * i_883_;
	    if (i_884_ > 65535)
		i_884_ = 65535;
	    int i_885_ = ((i_878_ & 0xff00) >> 8) * i_883_;
	    if (i_885_ > 65535)
		i_885_ = 65535;
	    int i_886_ = (i_878_ & 0xff) * i_883_;
	    if (i_886_ > 65535)
		i_886_ = 65535;
	    i_878_
		= (i_884_ << 8 & 0xff0000) + (i_885_ & 0xff00) + (i_886_ >> 8);
	}
	return i_878_;
    }
    
    void method1962(int i, int i_887_, int i_888_, int i_889_) {
	if (i == 0) {
	    int i_890_ = 0;
	    ((Class157_Sub2) this).anInt9169 = 0;
	    ((Class157_Sub2) this).anInt9170 = 0;
	    ((Class157_Sub2) this).anInt9171 = 0;
	    for (int i_891_ = 0; i_891_ < ((Class157_Sub2) this).anInt9135;
		 i_891_++) {
		((Class157_Sub2) this).anInt9169
		    += ((Class157_Sub2) this).anIntArray9203[i_891_];
		((Class157_Sub2) this).anInt9170
		    += ((Class157_Sub2) this).anIntArray9204[i_891_];
		((Class157_Sub2) this).anInt9171
		    += ((Class157_Sub2) this).anIntArray9177[i_891_];
		i_890_++;
	    }
	    if (i_890_ > 0) {
		((Class157_Sub2) this).anInt9169
		    = ((Class157_Sub2) this).anInt9169 / i_890_ + i_887_;
		((Class157_Sub2) this).anInt9170
		    = ((Class157_Sub2) this).anInt9170 / i_890_ + i_888_;
		((Class157_Sub2) this).anInt9171
		    = ((Class157_Sub2) this).anInt9171 / i_890_ + i_889_;
	    } else {
		((Class157_Sub2) this).anInt9169 = i_887_;
		((Class157_Sub2) this).anInt9170 = i_888_;
		((Class157_Sub2) this).anInt9171 = i_889_;
	    }
	} else if (i == 1) {
	    for (int i_892_ = 0; i_892_ < ((Class157_Sub2) this).anInt9135;
		 i_892_++) {
		((Class157_Sub2) this).anIntArray9203[i_892_] += i_887_;
		((Class157_Sub2) this).anIntArray9204[i_892_] += i_888_;
		((Class157_Sub2) this).anIntArray9177[i_892_] += i_889_;
	    }
	} else if (i == 2) {
	    for (int i_893_ = 0; i_893_ < ((Class157_Sub2) this).anInt9135;
		 i_893_++) {
		((Class157_Sub2) this).anIntArray9203[i_893_]
		    -= ((Class157_Sub2) this).anInt9169;
		((Class157_Sub2) this).anIntArray9204[i_893_]
		    -= ((Class157_Sub2) this).anInt9170;
		((Class157_Sub2) this).anIntArray9177[i_893_]
		    -= ((Class157_Sub2) this).anInt9171;
		if (i_889_ != 0) {
		    int i_894_ = Class417.anIntArray4766[i_889_];
		    int i_895_ = Class417.anIntArray4767[i_889_];
		    int i_896_
			= (((((Class157_Sub2) this).anIntArray9204[i_893_]
			     * i_894_)
			    + (((Class157_Sub2) this).anIntArray9203[i_893_]
			       * i_895_)
			    + 16383)
			   >> 14);
		    ((Class157_Sub2) this).anIntArray9204[i_893_]
			= ((((Class157_Sub2) this).anIntArray9204[i_893_]
			    * i_895_)
			   - (((Class157_Sub2) this).anIntArray9203[i_893_]
			      * i_894_)
			   + 16383) >> 14;
		    ((Class157_Sub2) this).anIntArray9203[i_893_] = i_896_;
		}
		if (i_887_ != 0) {
		    int i_897_ = Class417.anIntArray4766[i_887_];
		    int i_898_ = Class417.anIntArray4767[i_887_];
		    int i_899_
			= (((((Class157_Sub2) this).anIntArray9204[i_893_]
			     * i_898_)
			    - (((Class157_Sub2) this).anIntArray9177[i_893_]
			       * i_897_)
			    + 16383)
			   >> 14);
		    ((Class157_Sub2) this).anIntArray9177[i_893_]
			= ((((Class157_Sub2) this).anIntArray9204[i_893_]
			    * i_897_)
			   + (((Class157_Sub2) this).anIntArray9177[i_893_]
			      * i_898_)
			   + 16383) >> 14;
		    ((Class157_Sub2) this).anIntArray9204[i_893_] = i_899_;
		}
		if (i_888_ != 0) {
		    int i_900_ = Class417.anIntArray4766[i_888_];
		    int i_901_ = Class417.anIntArray4767[i_888_];
		    int i_902_
			= (((((Class157_Sub2) this).anIntArray9177[i_893_]
			     * i_900_)
			    + (((Class157_Sub2) this).anIntArray9203[i_893_]
			       * i_901_)
			    + 16383)
			   >> 14);
		    ((Class157_Sub2) this).anIntArray9177[i_893_]
			= ((((Class157_Sub2) this).anIntArray9177[i_893_]
			    * i_901_)
			   - (((Class157_Sub2) this).anIntArray9203[i_893_]
			      * i_900_)
			   + 16383) >> 14;
		    ((Class157_Sub2) this).anIntArray9203[i_893_] = i_902_;
		}
		((Class157_Sub2) this).anIntArray9203[i_893_]
		    += ((Class157_Sub2) this).anInt9169;
		((Class157_Sub2) this).anIntArray9204[i_893_]
		    += ((Class157_Sub2) this).anInt9170;
		((Class157_Sub2) this).anIntArray9177[i_893_]
		    += ((Class157_Sub2) this).anInt9171;
	    }
	} else if (i == 3) {
	    for (int i_903_ = 0; i_903_ < ((Class157_Sub2) this).anInt9135;
		 i_903_++) {
		((Class157_Sub2) this).anIntArray9203[i_903_]
		    -= ((Class157_Sub2) this).anInt9169;
		((Class157_Sub2) this).anIntArray9204[i_903_]
		    -= ((Class157_Sub2) this).anInt9170;
		((Class157_Sub2) this).anIntArray9177[i_903_]
		    -= ((Class157_Sub2) this).anInt9171;
		((Class157_Sub2) this).anIntArray9203[i_903_]
		    = (((Class157_Sub2) this).anIntArray9203[i_903_] * i_887_
		       / 128);
		((Class157_Sub2) this).anIntArray9204[i_903_]
		    = (((Class157_Sub2) this).anIntArray9204[i_903_] * i_888_
		       / 128);
		((Class157_Sub2) this).anIntArray9177[i_903_]
		    = (((Class157_Sub2) this).anIntArray9177[i_903_] * i_889_
		       / 128);
		((Class157_Sub2) this).anIntArray9203[i_903_]
		    += ((Class157_Sub2) this).anInt9169;
		((Class157_Sub2) this).anIntArray9204[i_903_]
		    += ((Class157_Sub2) this).anInt9170;
		((Class157_Sub2) this).anIntArray9177[i_903_]
		    += ((Class157_Sub2) this).anInt9171;
	    }
	} else if (i == 5) {
	    for (int i_904_ = 0; i_904_ < ((Class157_Sub2) this).anInt9143;
		 i_904_++) {
		int i_905_
		    = ((((Class157_Sub2) this).aByteArray9160[i_904_] & 0xff)
		       + i_887_ * 8);
		if (i_905_ < 0)
		    i_905_ = 0;
		else if (i_905_ > 255)
		    i_905_ = 255;
		((Class157_Sub2) this).aByteArray9160[i_904_] = (byte) i_905_;
	    }
	    if (((Class157_Sub2) this).aClass90Array9156 != null) {
		for (int i_906_ = 0; i_906_ < ((Class157_Sub2) this).anInt9175;
		     i_906_++) {
		    Class90 class90
			= ((Class157_Sub2) this).aClass90Array9156[i_906_];
		    Class108 class108
			= ((Class157_Sub2) this).aClass108Array9123[i_906_];
		    ((Class108) class108).anInt1368
			= ((((Class108) class108).anInt1368 * -1351793475
			    & 0xffffff)
			   | (255
			      - ((((Class157_Sub2) this).aByteArray9160
				  [((Class90) class90).anInt1142 * 1037728387])
				 & 0xff)) << 24) * 323344021;
		}
	    }
	} else if (i == 7) {
	    for (int i_907_ = 0; i_907_ < ((Class157_Sub2) this).anInt9143;
		 i_907_++) {
		int i_908_
		    = ((Class157_Sub2) this).aShortArray9162[i_907_] & 0xffff;
		int i_909_ = i_908_ >> 10 & 0x3f;
		int i_910_ = i_908_ >> 7 & 0x7;
		int i_911_ = i_908_ & 0x7f;
		i_909_ = i_909_ + i_887_ & 0x3f;
		i_910_ += i_888_;
		if (i_910_ < 0)
		    i_910_ = 0;
		else if (i_910_ > 7)
		    i_910_ = 7;
		i_911_ += i_889_;
		if (i_911_ < 0)
		    i_911_ = 0;
		else if (i_911_ > 127)
		    i_911_ = 127;
		((Class157_Sub2) this).aShortArray9162[i_907_]
		    = (short) (i_909_ << 10 | i_910_ << 7 | i_911_);
	    }
	    ((Class157_Sub2) this).aBool9195 = true;
	    if (((Class157_Sub2) this).aClass90Array9156 != null) {
		for (int i_912_ = 0; i_912_ < ((Class157_Sub2) this).anInt9175;
		     i_912_++) {
		    Class90 class90
			= ((Class157_Sub2) this).aClass90Array9156[i_912_];
		    Class108 class108
			= ((Class157_Sub2) this).aClass108Array9123[i_912_];
		    ((Class108) class108).anInt1368
			= ((((Class108) class108).anInt1368 * -1351793475
			    & ~0xffffff)
			   | ((Class72.anIntArray777
			       [Class516.method6283(((((Class157_Sub2) this)
						      .aShortArray9162
						      [((((Class90) class90)
							 .anInt1142)
							* 1037728387)])
						     & 0xffff),
						    515814180) & 0xffff])
			      & 0xffffff)) * 323344021;
		}
	    }
	} else if (i == 8) {
	    for (int i_913_ = 0; i_913_ < ((Class157_Sub2) this).anInt9175;
		 i_913_++) {
		Class108 class108
		    = ((Class157_Sub2) this).aClass108Array9123[i_913_];
		((Class108) class108).anInt1365 += i_887_ * -731787657;
		((Class108) class108).anInt1366 += i_888_ * 1335672291;
	    }
	} else if (i == 10) {
	    for (int i_914_ = 0; i_914_ < ((Class157_Sub2) this).anInt9175;
		 i_914_++) {
		Class108 class108
		    = ((Class157_Sub2) this).aClass108Array9123[i_914_];
		((Class108) class108).aFloat1363
		    = (((Class108) class108).aFloat1363 * (float) i_887_
		       / 128.0F);
		((Class108) class108).aFloat1364
		    = (((Class108) class108).aFloat1364 * (float) i_888_
		       / 128.0F);
	    }
	} else if (i == 9) {
	    for (int i_915_ = 0; i_915_ < ((Class157_Sub2) this).anInt9175;
		 i_915_++) {
		Class108 class108
		    = ((Class157_Sub2) this).aClass108Array9123[i_915_];
		((Class108) class108).anInt1367
		    = (((Class108) class108).anInt1367 * 337890173 + i_887_
		       & 0x3fff) * 1644905941;
	    }
	}
    }
    
    public boolean method2017() {
	return ((Class157_Sub2) this).aBool9199;
    }
    
    void method1959(int i, int[] is, int i_916_, int i_917_, int i_918_,
		    int i_919_, boolean bool) {
	int i_920_ = is.length;
	if (i == 0) {
	    i_916_ <<= 4;
	    i_917_ <<= 4;
	    i_918_ <<= 4;
	    if (!((Class157_Sub2) this).aBool9168) {
		for (int i_921_ = 0; i_921_ < ((Class157_Sub2) this).anInt9135;
		     i_921_++) {
		    ((Class157_Sub2) this).anIntArray9203[i_921_] <<= 4;
		    ((Class157_Sub2) this).anIntArray9204[i_921_] <<= 4;
		    ((Class157_Sub2) this).anIntArray9177[i_921_] <<= 4;
		}
		((Class157_Sub2) this).aBool9168 = true;
	    }
	    int i_922_ = 0;
	    ((Class157_Sub2) this).anInt9169 = 0;
	    ((Class157_Sub2) this).anInt9170 = 0;
	    ((Class157_Sub2) this).anInt9171 = 0;
	    for (int i_923_ = 0; i_923_ < i_920_; i_923_++) {
		int i_924_ = is[i_923_];
		if (i_924_
		    < ((Class157_Sub2) this).anIntArrayArray9165.length) {
		    int[] is_925_
			= ((Class157_Sub2) this).anIntArrayArray9165[i_924_];
		    for (int i_926_ = 0; i_926_ < is_925_.length; i_926_++) {
			int i_927_ = is_925_[i_926_];
			((Class157_Sub2) this).anInt9169
			    += ((Class157_Sub2) this).anIntArray9203[i_927_];
			((Class157_Sub2) this).anInt9170
			    += ((Class157_Sub2) this).anIntArray9204[i_927_];
			((Class157_Sub2) this).anInt9171
			    += ((Class157_Sub2) this).anIntArray9177[i_927_];
			i_922_++;
		    }
		}
	    }
	    if (i_922_ > 0) {
		((Class157_Sub2) this).anInt9169
		    = ((Class157_Sub2) this).anInt9169 / i_922_ + i_916_;
		((Class157_Sub2) this).anInt9170
		    = ((Class157_Sub2) this).anInt9170 / i_922_ + i_917_;
		((Class157_Sub2) this).anInt9171
		    = ((Class157_Sub2) this).anInt9171 / i_922_ + i_918_;
	    } else {
		((Class157_Sub2) this).anInt9169 = i_916_;
		((Class157_Sub2) this).anInt9170 = i_917_;
		((Class157_Sub2) this).anInt9171 = i_918_;
	    }
	} else if (i == 1) {
	    i_916_ <<= 4;
	    i_917_ <<= 4;
	    i_918_ <<= 4;
	    if (!((Class157_Sub2) this).aBool9168) {
		for (int i_928_ = 0; i_928_ < ((Class157_Sub2) this).anInt9135;
		     i_928_++) {
		    ((Class157_Sub2) this).anIntArray9203[i_928_] <<= 4;
		    ((Class157_Sub2) this).anIntArray9204[i_928_] <<= 4;
		    ((Class157_Sub2) this).anIntArray9177[i_928_] <<= 4;
		}
		((Class157_Sub2) this).aBool9168 = true;
	    }
	    for (int i_929_ = 0; i_929_ < i_920_; i_929_++) {
		int i_930_ = is[i_929_];
		if (i_930_
		    < ((Class157_Sub2) this).anIntArrayArray9165.length) {
		    int[] is_931_
			= ((Class157_Sub2) this).anIntArrayArray9165[i_930_];
		    for (int i_932_ = 0; i_932_ < is_931_.length; i_932_++) {
			int i_933_ = is_931_[i_932_];
			((Class157_Sub2) this).anIntArray9203[i_933_]
			    += i_916_;
			((Class157_Sub2) this).anIntArray9204[i_933_]
			    += i_917_;
			((Class157_Sub2) this).anIntArray9177[i_933_]
			    += i_918_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_934_ = 0; i_934_ < i_920_; i_934_++) {
		int i_935_ = is[i_934_];
		if (i_935_
		    < ((Class157_Sub2) this).anIntArrayArray9165.length) {
		    int[] is_936_
			= ((Class157_Sub2) this).anIntArrayArray9165[i_935_];
		    if ((i_919_ & 0x1) == 0) {
			for (int i_937_ = 0; i_937_ < is_936_.length;
			     i_937_++) {
			    int i_938_ = is_936_[i_937_];
			    ((Class157_Sub2) this).anIntArray9203[i_938_]
				-= ((Class157_Sub2) this).anInt9169;
			    ((Class157_Sub2) this).anIntArray9204[i_938_]
				-= ((Class157_Sub2) this).anInt9170;
			    ((Class157_Sub2) this).anIntArray9177[i_938_]
				-= ((Class157_Sub2) this).anInt9171;
			    if (i_918_ != 0) {
				int i_939_ = Class417.anIntArray4766[i_918_];
				int i_940_ = Class417.anIntArray4767[i_918_];
				int i_941_
				    = (((((Class157_Sub2) this).anIntArray9204
					 [i_938_]) * i_939_
					+ (((Class157_Sub2) this)
					   .anIntArray9203[i_938_]) * i_940_
					+ 16383)
				       >> 14);
				((Class157_Sub2) this).anIntArray9204[i_938_]
				    = ((((Class157_Sub2) this).anIntArray9204
					[i_938_]) * i_940_
				       - (((Class157_Sub2) this).anIntArray9203
					  [i_938_]) * i_939_
				       + 16383) >> 14;
				((Class157_Sub2) this).anIntArray9203[i_938_]
				    = i_941_;
			    }
			    if (i_916_ != 0) {
				int i_942_ = Class417.anIntArray4766[i_916_];
				int i_943_ = Class417.anIntArray4767[i_916_];
				int i_944_
				    = (((((Class157_Sub2) this).anIntArray9204
					 [i_938_]) * i_943_
					- (((Class157_Sub2) this)
					   .anIntArray9177[i_938_]) * i_942_
					+ 16383)
				       >> 14);
				((Class157_Sub2) this).anIntArray9177[i_938_]
				    = ((((Class157_Sub2) this).anIntArray9204
					[i_938_]) * i_942_
				       + (((Class157_Sub2) this).anIntArray9177
					  [i_938_]) * i_943_
				       + 16383) >> 14;
				((Class157_Sub2) this).anIntArray9204[i_938_]
				    = i_944_;
			    }
			    if (i_917_ != 0) {
				int i_945_ = Class417.anIntArray4766[i_917_];
				int i_946_ = Class417.anIntArray4767[i_917_];
				int i_947_
				    = (((((Class157_Sub2) this).anIntArray9177
					 [i_938_]) * i_945_
					+ (((Class157_Sub2) this)
					   .anIntArray9203[i_938_]) * i_946_
					+ 16383)
				       >> 14);
				((Class157_Sub2) this).anIntArray9177[i_938_]
				    = ((((Class157_Sub2) this).anIntArray9177
					[i_938_]) * i_946_
				       - (((Class157_Sub2) this).anIntArray9203
					  [i_938_]) * i_945_
				       + 16383) >> 14;
				((Class157_Sub2) this).anIntArray9203[i_938_]
				    = i_947_;
			    }
			    ((Class157_Sub2) this).anIntArray9203[i_938_]
				+= ((Class157_Sub2) this).anInt9169;
			    ((Class157_Sub2) this).anIntArray9204[i_938_]
				+= ((Class157_Sub2) this).anInt9170;
			    ((Class157_Sub2) this).anIntArray9177[i_938_]
				+= ((Class157_Sub2) this).anInt9171;
			}
		    } else {
			for (int i_948_ = 0; i_948_ < is_936_.length;
			     i_948_++) {
			    int i_949_ = is_936_[i_948_];
			    ((Class157_Sub2) this).anIntArray9203[i_949_]
				-= ((Class157_Sub2) this).anInt9169;
			    ((Class157_Sub2) this).anIntArray9204[i_949_]
				-= ((Class157_Sub2) this).anInt9170;
			    ((Class157_Sub2) this).anIntArray9177[i_949_]
				-= ((Class157_Sub2) this).anInt9171;
			    if (i_916_ != 0) {
				int i_950_ = Class417.anIntArray4766[i_916_];
				int i_951_ = Class417.anIntArray4767[i_916_];
				int i_952_
				    = (((((Class157_Sub2) this).anIntArray9204
					 [i_949_]) * i_951_
					- (((Class157_Sub2) this)
					   .anIntArray9177[i_949_]) * i_950_
					+ 16383)
				       >> 14);
				((Class157_Sub2) this).anIntArray9177[i_949_]
				    = ((((Class157_Sub2) this).anIntArray9204
					[i_949_]) * i_950_
				       + (((Class157_Sub2) this).anIntArray9177
					  [i_949_]) * i_951_
				       + 16383) >> 14;
				((Class157_Sub2) this).anIntArray9204[i_949_]
				    = i_952_;
			    }
			    if (i_918_ != 0) {
				int i_953_ = Class417.anIntArray4766[i_918_];
				int i_954_ = Class417.anIntArray4767[i_918_];
				int i_955_
				    = (((((Class157_Sub2) this).anIntArray9204
					 [i_949_]) * i_953_
					+ (((Class157_Sub2) this)
					   .anIntArray9203[i_949_]) * i_954_
					+ 16383)
				       >> 14);
				((Class157_Sub2) this).anIntArray9204[i_949_]
				    = ((((Class157_Sub2) this).anIntArray9204
					[i_949_]) * i_954_
				       - (((Class157_Sub2) this).anIntArray9203
					  [i_949_]) * i_953_
				       + 16383) >> 14;
				((Class157_Sub2) this).anIntArray9203[i_949_]
				    = i_955_;
			    }
			    if (i_917_ != 0) {
				int i_956_ = Class417.anIntArray4766[i_917_];
				int i_957_ = Class417.anIntArray4767[i_917_];
				int i_958_
				    = (((((Class157_Sub2) this).anIntArray9177
					 [i_949_]) * i_956_
					+ (((Class157_Sub2) this)
					   .anIntArray9203[i_949_]) * i_957_
					+ 16383)
				       >> 14);
				((Class157_Sub2) this).anIntArray9177[i_949_]
				    = ((((Class157_Sub2) this).anIntArray9177
					[i_949_]) * i_957_
				       - (((Class157_Sub2) this).anIntArray9203
					  [i_949_]) * i_956_
				       + 16383) >> 14;
				((Class157_Sub2) this).anIntArray9203[i_949_]
				    = i_958_;
			    }
			    ((Class157_Sub2) this).anIntArray9203[i_949_]
				+= ((Class157_Sub2) this).anInt9169;
			    ((Class157_Sub2) this).anIntArray9204[i_949_]
				+= ((Class157_Sub2) this).anInt9170;
			    ((Class157_Sub2) this).anIntArray9177[i_949_]
				+= ((Class157_Sub2) this).anInt9171;
			}
		    }
		}
	    }
	} else if (i == 3) {
	    for (int i_959_ = 0; i_959_ < i_920_; i_959_++) {
		int i_960_ = is[i_959_];
		if (i_960_
		    < ((Class157_Sub2) this).anIntArrayArray9165.length) {
		    int[] is_961_
			= ((Class157_Sub2) this).anIntArrayArray9165[i_960_];
		    for (int i_962_ = 0; i_962_ < is_961_.length; i_962_++) {
			int i_963_ = is_961_[i_962_];
			((Class157_Sub2) this).anIntArray9203[i_963_]
			    -= ((Class157_Sub2) this).anInt9169;
			((Class157_Sub2) this).anIntArray9204[i_963_]
			    -= ((Class157_Sub2) this).anInt9170;
			((Class157_Sub2) this).anIntArray9177[i_963_]
			    -= ((Class157_Sub2) this).anInt9171;
			((Class157_Sub2) this).anIntArray9203[i_963_]
			    = (((Class157_Sub2) this).anIntArray9203[i_963_]
			       * i_916_ / 128);
			((Class157_Sub2) this).anIntArray9204[i_963_]
			    = (((Class157_Sub2) this).anIntArray9204[i_963_]
			       * i_917_ / 128);
			((Class157_Sub2) this).anIntArray9177[i_963_]
			    = (((Class157_Sub2) this).anIntArray9177[i_963_]
			       * i_918_ / 128);
			((Class157_Sub2) this).anIntArray9203[i_963_]
			    += ((Class157_Sub2) this).anInt9169;
			((Class157_Sub2) this).anIntArray9204[i_963_]
			    += ((Class157_Sub2) this).anInt9170;
			((Class157_Sub2) this).anIntArray9177[i_963_]
			    += ((Class157_Sub2) this).anInt9171;
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class157_Sub2) this).anIntArrayArray9166 != null
		&& ((Class157_Sub2) this).aByteArray9160 != null) {
		for (int i_964_ = 0; i_964_ < i_920_; i_964_++) {
		    int i_965_ = is[i_964_];
		    if (i_965_
			< ((Class157_Sub2) this).anIntArrayArray9166.length) {
			int[] is_966_ = (((Class157_Sub2) this)
					 .anIntArrayArray9166[i_965_]);
			for (int i_967_ = 0; i_967_ < is_966_.length;
			     i_967_++) {
			    int i_968_ = is_966_[i_967_];
			    int i_969_ = (((((Class157_Sub2) this)
					    .aByteArray9160[i_968_])
					   & 0xff)
					  + i_916_ * 8);
			    if (i_969_ < 0)
				i_969_ = 0;
			    else if (i_969_ > 255)
				i_969_ = 255;
			    ((Class157_Sub2) this).aByteArray9160[i_968_]
				= (byte) i_969_;
			}
		    }
		}
		if (((Class157_Sub2) this).aClass90Array9156 != null) {
		    for (int i_970_ = 0;
			 i_970_ < ((Class157_Sub2) this).anInt9175; i_970_++) {
			Class90 class90
			    = ((Class157_Sub2) this).aClass90Array9156[i_970_];
			Class108 class108 = (((Class157_Sub2) this)
					     .aClass108Array9123[i_970_]);
			((Class108) class108).anInt1368
			    = ((((Class108) class108).anInt1368 * -1351793475
				& 0xffffff)
			       | 255 - ((((Class157_Sub2) this).aByteArray9160
					 [(((Class90) class90).anInt1142
					   * 1037728387)])
					& 0xff) << 24) * 323344021;
		    }
		}
	    }
	} else if (i == 7) {
	    if (((Class157_Sub2) this).anIntArrayArray9166 != null) {
		for (int i_971_ = 0; i_971_ < i_920_; i_971_++) {
		    int i_972_ = is[i_971_];
		    if (i_972_
			< ((Class157_Sub2) this).anIntArrayArray9166.length) {
			int[] is_973_ = (((Class157_Sub2) this)
					 .anIntArrayArray9166[i_972_]);
			for (int i_974_ = 0; i_974_ < is_973_.length;
			     i_974_++) {
			    int i_975_ = is_973_[i_974_];
			    int i_976_ = ((((Class157_Sub2) this)
					   .aShortArray9162[i_975_])
					  & 0xffff);
			    int i_977_ = i_976_ >> 10 & 0x3f;
			    int i_978_ = i_976_ >> 7 & 0x7;
			    int i_979_ = i_976_ & 0x7f;
			    i_977_ = i_977_ + i_916_ & 0x3f;
			    i_978_ += i_917_;
			    if (i_978_ < 0)
				i_978_ = 0;
			    else if (i_978_ > 7)
				i_978_ = 7;
			    i_979_ += i_918_;
			    if (i_979_ < 0)
				i_979_ = 0;
			    else if (i_979_ > 127)
				i_979_ = 127;
			    ((Class157_Sub2) this).aShortArray9162[i_975_]
				= (short) (i_977_ << 10 | i_978_ << 7
					   | i_979_);
			}
			((Class157_Sub2) this).aBool9195 = true;
		    }
		}
		if (((Class157_Sub2) this).aClass90Array9156 != null) {
		    for (int i_980_ = 0;
			 i_980_ < ((Class157_Sub2) this).anInt9175; i_980_++) {
			Class90 class90
			    = ((Class157_Sub2) this).aClass90Array9156[i_980_];
			Class108 class108 = (((Class157_Sub2) this)
					     .aClass108Array9123[i_980_]);
			((Class108) class108).anInt1368
			    = (((((Class108) class108).anInt1368 * -1351793475
				 & ~0xffffff)
				| (Class72.anIntArray777
				   [(Class516.method6283
				     ((((Class157_Sub2) this).aShortArray9162
				       [(((Class90) class90).anInt1142
					 * 1037728387)]) & 0xffff,
				      515814180)) & 0xffff]) & 0xffffff)
			       * 323344021);
		    }
		}
	    }
	} else if (i == 8) {
	    if (((Class157_Sub2) this).anIntArrayArray9178 != null) {
		for (int i_981_ = 0; i_981_ < i_920_; i_981_++) {
		    int i_982_ = is[i_981_];
		    if (i_982_
			< ((Class157_Sub2) this).anIntArrayArray9178.length) {
			int[] is_983_ = (((Class157_Sub2) this)
					 .anIntArrayArray9178[i_982_]);
			for (int i_984_ = 0; i_984_ < is_983_.length;
			     i_984_++) {
			    Class108 class108
				= (((Class157_Sub2) this).aClass108Array9123
				   [is_983_[i_984_]]);
			    ((Class108) class108).anInt1365
				+= i_916_ * -731787657;
			    ((Class108) class108).anInt1366
				+= i_917_ * 1335672291;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class157_Sub2) this).anIntArrayArray9178 != null) {
		for (int i_985_ = 0; i_985_ < i_920_; i_985_++) {
		    int i_986_ = is[i_985_];
		    if (i_986_
			< ((Class157_Sub2) this).anIntArrayArray9178.length) {
			int[] is_987_ = (((Class157_Sub2) this)
					 .anIntArrayArray9178[i_986_]);
			for (int i_988_ = 0; i_988_ < is_987_.length;
			     i_988_++) {
			    Class108 class108
				= (((Class157_Sub2) this).aClass108Array9123
				   [is_987_[i_988_]]);
			    ((Class108) class108).aFloat1363
				= (((Class108) class108).aFloat1363
				   * (float) i_916_ / 128.0F);
			    ((Class108) class108).aFloat1364
				= (((Class108) class108).aFloat1364
				   * (float) i_917_ / 128.0F);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class157_Sub2) this).anIntArrayArray9178 != null) {
		for (int i_989_ = 0; i_989_ < i_920_; i_989_++) {
		    int i_990_ = is[i_989_];
		    if (i_990_
			< ((Class157_Sub2) this).anIntArrayArray9178.length) {
			int[] is_991_ = (((Class157_Sub2) this)
					 .anIntArrayArray9178[i_990_]);
			for (int i_992_ = 0; i_992_ < is_991_.length;
			     i_992_++) {
			    Class108 class108
				= (((Class157_Sub2) this).aClass108Array9123
				   [is_991_[i_992_]]);
			    ((Class108) class108).anInt1367
				= ((((Class108) class108).anInt1367 * 337890173
				    + i_916_)
				   & 0x3fff) * 1644905941;
			}
		    }
		}
	    }
	}
    }
    
    public void method1936() {
	/* empty */
    }
    
    public void method2015(int i) {
	if ((((Class157_Sub2) this).anInt9132 & 0x5) != 5)
	    throw new IllegalStateException();
	if (i == 4096)
	    method8437();
	else if (i == 8192)
	    method8426();
	else if (i == 12288)
	    method8413();
	else {
	    int i_993_ = Class417.anIntArray4766[i];
	    int i_994_ = Class417.anIntArray4767[i];
	    synchronized (this) {
		for (int i_995_ = 0; i_995_ < ((Class157_Sub2) this).anInt9135;
		     i_995_++) {
		    int i_996_
			= (((((Class157_Sub2) this).anIntArray9177[i_995_]
			     * i_993_)
			    + (((Class157_Sub2) this).anIntArray9203[i_995_]
			       * i_994_))
			   >> 14);
		    ((Class157_Sub2) this).anIntArray9177[i_995_]
			= ((((Class157_Sub2) this).anIntArray9177[i_995_]
			    * i_994_)
			   - (((Class157_Sub2) this).anIntArray9203[i_995_]
			      * i_993_)) >> 14;
		    ((Class157_Sub2) this).anIntArray9203[i_995_] = i_996_;
		}
		method8411();
	    }
	}
    }
    
    public void method1972(int i) {
	if ((((Class157_Sub2) this).anInt9132 & 0x5) != 5)
	    throw new IllegalStateException();
	if (i == 4096)
	    method8437();
	else if (i == 8192)
	    method8426();
	else if (i == 12288)
	    method8413();
	else {
	    int i_997_ = Class417.anIntArray4766[i];
	    int i_998_ = Class417.anIntArray4767[i];
	    synchronized (this) {
		for (int i_999_ = 0; i_999_ < ((Class157_Sub2) this).anInt9135;
		     i_999_++) {
		    int i_1000_
			= (((((Class157_Sub2) this).anIntArray9177[i_999_]
			     * i_997_)
			    + (((Class157_Sub2) this).anIntArray9203[i_999_]
			       * i_998_))
			   >> 14);
		    ((Class157_Sub2) this).anIntArray9177[i_999_]
			= ((((Class157_Sub2) this).anIntArray9177[i_999_]
			    * i_998_)
			   - (((Class157_Sub2) this).anIntArray9203[i_999_]
			      * i_997_)) >> 14;
		    ((Class157_Sub2) this).anIntArray9203[i_999_] = i_1000_;
		}
		method8411();
	    }
	}
    }
    
    void method8430() {
	synchronized (this) {
	    for (int i = 0; i < ((Class157_Sub2) this).anInt9135; i++) {
		int i_1001_ = ((Class157_Sub2) this).anIntArray9203[i];
		((Class157_Sub2) this).anIntArray9203[i]
		    = ((Class157_Sub2) this).anIntArray9177[i];
		((Class157_Sub2) this).anIntArray9177[i] = -i_1001_;
	    }
	    method8411();
	}
    }
    
    public int method1929() {
	return ((Class157_Sub2) this).anInt9132;
    }
    
    public void method1897(Class433 class433, Class159 class159, int i) {
	method8440(class433, class159, i);
    }
    
    void method8431() {
	synchronized (this) {
	    for (int i = 0; i < ((Class157_Sub2) this).anInt9135; i++) {
		((Class157_Sub2) this).anIntArray9203[i]
		    = -((Class157_Sub2) this).anIntArray9203[i];
		((Class157_Sub2) this).anIntArray9177[i]
		    = -((Class157_Sub2) this).anIntArray9177[i];
	    }
	    method8411();
	}
    }
    
    public void method1971() {
	if (!((Class157_Sub2) this).aBool9187) {
	    if (!((Class157_Sub2) this).aBool9179)
		method8420();
	    ((Class157_Sub2) this).aShort9189
		= ((Class157_Sub2) this).aShort9182;
	    ((Class157_Sub2) this).aBool9187 = true;
	}
    }
    
    void method8432() {
	synchronized (this) {
	    for (int i = 0; i < ((Class157_Sub2) this).anInt9136; i++) {
		((Class157_Sub2) this).anIntArray9203[i]
		    = -((Class157_Sub2) this).anIntArray9203[i];
		((Class157_Sub2) this).anIntArray9177[i]
		    = -((Class157_Sub2) this).anIntArray9177[i];
		if (((Class157_Sub2) this).aClass103Array9141[i] != null) {
		    ((Class103) ((Class157_Sub2) this).aClass103Array9141[i])
			.anInt1300
			= -((Class103) (((Class157_Sub2) this)
					.aClass103Array9141[i])).anInt1300;
		    ((Class103) ((Class157_Sub2) this).aClass103Array9141[i])
			.anInt1299
			= -((Class103) (((Class157_Sub2) this)
					.aClass103Array9141[i])).anInt1299;
		}
	    }
	    if (((Class157_Sub2) this).aClass104Array9196 != null) {
		for (int i = 0; i < ((Class157_Sub2) this).anInt9143; i++) {
		    if (((Class157_Sub2) this).aClass104Array9196[i] != null) {
			((Class104) (((Class157_Sub2) this).aClass104Array9196
				     [i])).anInt1305
			    = -((Class104) (((Class157_Sub2) this)
					    .aClass104Array9196[i])).anInt1305;
			((Class104) (((Class157_Sub2) this).aClass104Array9196
				     [i])).anInt1307
			    = -((Class104) (((Class157_Sub2) this)
					    .aClass104Array9196[i])).anInt1307;
		    }
		}
	    }
	    for (int i = ((Class157_Sub2) this).anInt9136;
		 i < ((Class157_Sub2) this).anInt9135; i++) {
		((Class157_Sub2) this).anIntArray9203[i]
		    = -((Class157_Sub2) this).anIntArray9203[i];
		((Class157_Sub2) this).anIntArray9177[i]
		    = -((Class157_Sub2) this).anIntArray9177[i];
	    }
	    ((Class157_Sub2) this).anInt9152 = 0;
	    ((Class157_Sub2) this).aBool9179 = false;
	}
    }
    
    void method8433() {
	synchronized (this) {
	    for (int i = 0; i < ((Class157_Sub2) this).anInt9136; i++) {
		((Class157_Sub2) this).anIntArray9203[i]
		    = -((Class157_Sub2) this).anIntArray9203[i];
		((Class157_Sub2) this).anIntArray9177[i]
		    = -((Class157_Sub2) this).anIntArray9177[i];
		if (((Class157_Sub2) this).aClass103Array9141[i] != null) {
		    ((Class103) ((Class157_Sub2) this).aClass103Array9141[i])
			.anInt1300
			= -((Class103) (((Class157_Sub2) this)
					.aClass103Array9141[i])).anInt1300;
		    ((Class103) ((Class157_Sub2) this).aClass103Array9141[i])
			.anInt1299
			= -((Class103) (((Class157_Sub2) this)
					.aClass103Array9141[i])).anInt1299;
		}
	    }
	    if (((Class157_Sub2) this).aClass104Array9196 != null) {
		for (int i = 0; i < ((Class157_Sub2) this).anInt9143; i++) {
		    if (((Class157_Sub2) this).aClass104Array9196[i] != null) {
			((Class104) (((Class157_Sub2) this).aClass104Array9196
				     [i])).anInt1305
			    = -((Class104) (((Class157_Sub2) this)
					    .aClass104Array9196[i])).anInt1305;
			((Class104) (((Class157_Sub2) this).aClass104Array9196
				     [i])).anInt1307
			    = -((Class104) (((Class157_Sub2) this)
					    .aClass104Array9196[i])).anInt1307;
		    }
		}
	    }
	    for (int i = ((Class157_Sub2) this).anInt9136;
		 i < ((Class157_Sub2) this).anInt9135; i++) {
		((Class157_Sub2) this).anIntArray9203[i]
		    = -((Class157_Sub2) this).anIntArray9203[i];
		((Class157_Sub2) this).anIntArray9177[i]
		    = -((Class157_Sub2) this).anIntArray9177[i];
	    }
	    ((Class157_Sub2) this).anInt9152 = 0;
	    ((Class157_Sub2) this).aBool9179 = false;
	}
    }
    
    void method8434() {
	synchronized (this) {
	    for (int i = 0; i < ((Class157_Sub2) this).anInt9136; i++) {
		int i_1002_ = ((Class157_Sub2) this).anIntArray9177[i];
		((Class157_Sub2) this).anIntArray9177[i]
		    = ((Class157_Sub2) this).anIntArray9203[i];
		((Class157_Sub2) this).anIntArray9203[i] = -i_1002_;
		if (((Class157_Sub2) this).aClass103Array9141[i] != null) {
		    i_1002_ = ((Class103) (((Class157_Sub2) this)
					   .aClass103Array9141[i])).anInt1299;
		    ((Class103) ((Class157_Sub2) this).aClass103Array9141[i])
			.anInt1299
			= ((Class103) (((Class157_Sub2) this)
				       .aClass103Array9141[i])).anInt1300;
		    ((Class103) ((Class157_Sub2) this).aClass103Array9141[i])
			.anInt1300
			= -i_1002_;
		}
	    }
	    if (((Class157_Sub2) this).aClass104Array9196 != null) {
		for (int i = 0; i < ((Class157_Sub2) this).anInt9143; i++) {
		    if (((Class157_Sub2) this).aClass104Array9196[i] != null) {
			int i_1003_ = (((Class104) (((Class157_Sub2) this)
						    .aClass104Array9196[i]))
				       .anInt1307);
			((Class104) (((Class157_Sub2) this).aClass104Array9196
				     [i])).anInt1307
			    = ((Class104) (((Class157_Sub2) this)
					   .aClass104Array9196[i])).anInt1305;
			((Class104) (((Class157_Sub2) this).aClass104Array9196
				     [i])).anInt1305
			    = -i_1003_;
		    }
		}
	    }
	    for (int i = ((Class157_Sub2) this).anInt9136;
		 i < ((Class157_Sub2) this).anInt9135; i++) {
		int i_1004_ = ((Class157_Sub2) this).anIntArray9177[i];
		((Class157_Sub2) this).anIntArray9177[i]
		    = ((Class157_Sub2) this).anIntArray9203[i];
		((Class157_Sub2) this).anIntArray9203[i] = -i_1004_;
	    }
	    ((Class157_Sub2) this).anInt9152 = 0;
	    ((Class157_Sub2) this).aBool9179 = false;
	}
    }
    
    void method1886() {
	if ((((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
	     .anInt9745) * -1585405167
	    > 1) {
	    synchronized (this) {
		aBool1738 = false;
		this.notifyAll();
	    }
	}
    }
    
    public void method2011(int i, int i_1005_, int i_1006_) {
	if (i != 128 && (((Class157_Sub2) this).anInt9132 & 0x1) != 1)
	    throw new IllegalStateException();
	if (i_1005_ != 128 && (((Class157_Sub2) this).anInt9132 & 0x2) != 2)
	    throw new IllegalStateException();
	if (i_1006_ != 128 && (((Class157_Sub2) this).anInt9132 & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i_1007_ = 0; i_1007_ < ((Class157_Sub2) this).anInt9135;
		 i_1007_++) {
		((Class157_Sub2) this).anIntArray9203[i_1007_]
		    = ((Class157_Sub2) this).anIntArray9203[i_1007_] * i >> 7;
		((Class157_Sub2) this).anIntArray9204[i_1007_]
		    = (((Class157_Sub2) this).anIntArray9204[i_1007_] * i_1005_
		       >> 7);
		((Class157_Sub2) this).anIntArray9177[i_1007_]
		    = (((Class157_Sub2) this).anIntArray9177[i_1007_] * i_1006_
		       >> 7);
	    }
	    ((Class157_Sub2) this).aBool9179 = false;
	}
    }
    
    void method8435() {
	((Class157_Sub2) this).aClass103Array9141
	    = new Class103[((Class157_Sub2) this).anInt9136];
	for (int i = 0; i < ((Class157_Sub2) this).anInt9136; i++)
	    ((Class157_Sub2) this).aClass103Array9141[i] = new Class103();
	for (int i = 0; i < ((Class157_Sub2) this).anInt9143; i++) {
	    short i_1008_ = ((Class157_Sub2) this).aShortArray9145[i];
	    short i_1009_ = ((Class157_Sub2) this).aShortArray9146[i];
	    short i_1010_ = ((Class157_Sub2) this).aShortArray9147[i];
	    int i_1011_ = (((Class157_Sub2) this).anIntArray9203[i_1009_]
			   - ((Class157_Sub2) this).anIntArray9203[i_1008_]);
	    int i_1012_ = (((Class157_Sub2) this).anIntArray9204[i_1009_]
			   - ((Class157_Sub2) this).anIntArray9204[i_1008_]);
	    int i_1013_ = (((Class157_Sub2) this).anIntArray9177[i_1009_]
			   - ((Class157_Sub2) this).anIntArray9177[i_1008_]);
	    int i_1014_ = (((Class157_Sub2) this).anIntArray9203[i_1010_]
			   - ((Class157_Sub2) this).anIntArray9203[i_1008_]);
	    int i_1015_ = (((Class157_Sub2) this).anIntArray9204[i_1010_]
			   - ((Class157_Sub2) this).anIntArray9204[i_1008_]);
	    int i_1016_ = (((Class157_Sub2) this).anIntArray9177[i_1010_]
			   - ((Class157_Sub2) this).anIntArray9177[i_1008_]);
	    int i_1017_ = i_1012_ * i_1016_ - i_1015_ * i_1013_;
	    int i_1018_ = i_1013_ * i_1014_ - i_1016_ * i_1011_;
	    int i_1019_;
	    for (i_1019_ = i_1011_ * i_1015_ - i_1014_ * i_1012_;
		 (i_1017_ > 8192 || i_1018_ > 8192 || i_1019_ > 8192
		  || i_1017_ < -8192 || i_1018_ < -8192 || i_1019_ < -8192);
		 i_1019_ >>= 1) {
		i_1017_ >>= 1;
		i_1018_ >>= 1;
	    }
	    int i_1020_ = (int) Math.sqrt((double) (i_1017_ * i_1017_
						    + i_1018_ * i_1018_
						    + i_1019_ * i_1019_));
	    if (i_1020_ <= 0)
		i_1020_ = 1;
	    i_1017_ = i_1017_ * 256 / i_1020_;
	    i_1018_ = i_1018_ * 256 / i_1020_;
	    i_1019_ = i_1019_ * 256 / i_1020_;
	    byte i_1021_;
	    if (((Class157_Sub2) this).aByteArray9158 == null)
		i_1021_ = (byte) 0;
	    else
		i_1021_ = ((Class157_Sub2) this).aByteArray9158[i];
	    if (i_1021_ == 0) {
		Class103 class103
		    = ((Class157_Sub2) this).aClass103Array9141[i_1008_];
		((Class103) class103).anInt1300 += i_1017_;
		((Class103) class103).anInt1301 += i_1018_;
		((Class103) class103).anInt1299 += i_1019_;
		((Class103) class103).anInt1302++;
		class103 = ((Class157_Sub2) this).aClass103Array9141[i_1009_];
		((Class103) class103).anInt1300 += i_1017_;
		((Class103) class103).anInt1301 += i_1018_;
		((Class103) class103).anInt1299 += i_1019_;
		((Class103) class103).anInt1302++;
		class103 = ((Class157_Sub2) this).aClass103Array9141[i_1010_];
		((Class103) class103).anInt1300 += i_1017_;
		((Class103) class103).anInt1301 += i_1018_;
		((Class103) class103).anInt1299 += i_1019_;
		((Class103) class103).anInt1302++;
	    } else if (i_1021_ == 1) {
		if (((Class157_Sub2) this).aClass104Array9196 == null)
		    ((Class157_Sub2) this).aClass104Array9196
			= new Class104[((Class157_Sub2) this).anInt9143];
		Class104 class104
		    = (((Class157_Sub2) this).aClass104Array9196[i]
		       = new Class104());
		((Class104) class104).anInt1305 = i_1017_;
		((Class104) class104).anInt1306 = i_1018_;
		((Class104) class104).anInt1307 = i_1019_;
	    }
	}
    }
    
    void method8436() {
	synchronized (this) {
	    for (int i = 0; i < ((Class157_Sub2) this).anInt9136; i++) {
		int i_1022_ = ((Class157_Sub2) this).anIntArray9177[i];
		((Class157_Sub2) this).anIntArray9177[i]
		    = ((Class157_Sub2) this).anIntArray9203[i];
		((Class157_Sub2) this).anIntArray9203[i] = -i_1022_;
		if (((Class157_Sub2) this).aClass103Array9141[i] != null) {
		    i_1022_ = ((Class103) (((Class157_Sub2) this)
					   .aClass103Array9141[i])).anInt1299;
		    ((Class103) ((Class157_Sub2) this).aClass103Array9141[i])
			.anInt1299
			= ((Class103) (((Class157_Sub2) this)
				       .aClass103Array9141[i])).anInt1300;
		    ((Class103) ((Class157_Sub2) this).aClass103Array9141[i])
			.anInt1300
			= -i_1022_;
		}
	    }
	    if (((Class157_Sub2) this).aClass104Array9196 != null) {
		for (int i = 0; i < ((Class157_Sub2) this).anInt9143; i++) {
		    if (((Class157_Sub2) this).aClass104Array9196[i] != null) {
			int i_1023_ = (((Class104) (((Class157_Sub2) this)
						    .aClass104Array9196[i]))
				       .anInt1307);
			((Class104) (((Class157_Sub2) this).aClass104Array9196
				     [i])).anInt1307
			    = ((Class104) (((Class157_Sub2) this)
					   .aClass104Array9196[i])).anInt1305;
			((Class104) (((Class157_Sub2) this).aClass104Array9196
				     [i])).anInt1305
			    = -i_1023_;
		    }
		}
	    }
	    for (int i = ((Class157_Sub2) this).anInt9136;
		 i < ((Class157_Sub2) this).anInt9135; i++) {
		int i_1024_ = ((Class157_Sub2) this).anIntArray9177[i];
		((Class157_Sub2) this).anIntArray9177[i]
		    = ((Class157_Sub2) this).anIntArray9203[i];
		((Class157_Sub2) this).anIntArray9203[i] = -i_1024_;
	    }
	    ((Class157_Sub2) this).anInt9152 = 0;
	    ((Class157_Sub2) this).aBool9179 = false;
	}
    }
    
    public void method1990(int i) {
	if ((((Class157_Sub2) this).anInt9132 & 0x2000) != 8192)
	    throw new IllegalStateException();
	((Class157_Sub2) this).anInt9134 = i;
	((Class157_Sub2) this).anInt9152 = 0;
    }
    
    public Class144[] method2012() {
	return ((Class157_Sub2) this).aClass144Array9125;
    }
    
    public int method1907() {
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	return ((Class157_Sub2) this).aShort9180;
    }
    
    public void method1944(int i) {
	if ((((Class157_Sub2) this).anInt9132 & 0x3) != 3)
	    throw new IllegalStateException();
	int i_1025_ = Class417.anIntArray4766[i];
	int i_1026_ = Class417.anIntArray4767[i];
	synchronized (this) {
	    for (int i_1027_ = 0; i_1027_ < ((Class157_Sub2) this).anInt9135;
		 i_1027_++) {
		int i_1028_
		    = (((Class157_Sub2) this).anIntArray9204[i_1027_] * i_1025_
		       + (((Class157_Sub2) this).anIntArray9203[i_1027_]
			  * i_1026_)) >> 14;
		((Class157_Sub2) this).anIntArray9204[i_1027_]
		    = (((Class157_Sub2) this).anIntArray9204[i_1027_] * i_1026_
		       - (((Class157_Sub2) this).anIntArray9203[i_1027_]
			  * i_1025_)) >> 14;
		((Class157_Sub2) this).anIntArray9203[i_1027_] = i_1028_;
	    }
	    method8411();
	}
    }
    
    public void method1957() {
	if ((((Class157_Sub2) this).anInt9132 & 0x10) != 16)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i = 0; i < ((Class157_Sub2) this).anInt9135; i++)
		((Class157_Sub2) this).anIntArray9177[i]
		    = -((Class157_Sub2) this).anIntArray9177[i];
	    if (((Class157_Sub2) this).aClass103Array9141 != null) {
		for (int i = 0; i < ((Class157_Sub2) this).anInt9136; i++) {
		    if (((Class157_Sub2) this).aClass103Array9141[i] != null)
			((Class103) (((Class157_Sub2) this).aClass103Array9141
				     [i])).anInt1299
			    = -((Class103) (((Class157_Sub2) this)
					    .aClass103Array9141[i])).anInt1299;
		}
	    }
	    if (((Class157_Sub2) this).aClass103Array9142 != null) {
		for (int i = 0; i < ((Class157_Sub2) this).anInt9136; i++) {
		    if (((Class157_Sub2) this).aClass103Array9142[i] != null)
			((Class103) (((Class157_Sub2) this).aClass103Array9142
				     [i])).anInt1299
			    = -((Class103) (((Class157_Sub2) this)
					    .aClass103Array9142[i])).anInt1299;
		}
	    }
	    if (((Class157_Sub2) this).aClass104Array9196 != null) {
		for (int i = 0; i < ((Class157_Sub2) this).anInt9143; i++) {
		    if (((Class157_Sub2) this).aClass104Array9196[i] != null)
			((Class104) (((Class157_Sub2) this).aClass104Array9196
				     [i])).anInt1307
			    = -((Class104) (((Class157_Sub2) this)
					    .aClass104Array9196[i])).anInt1307;
		}
	    }
	    short[] is = ((Class157_Sub2) this).aShortArray9145;
	    ((Class157_Sub2) this).aShortArray9145
		= ((Class157_Sub2) this).aShortArray9147;
	    ((Class157_Sub2) this).aShortArray9147 = is;
	    if (((Class157_Sub2) this).aFloatArrayArray9157 != null) {
		for (int i = 0; i < ((Class157_Sub2) this).anInt9143; i++) {
		    if (((Class157_Sub2) this).aFloatArrayArray9157[i]
			!= null) {
			float f = (((Class157_Sub2) this).aFloatArrayArray9157
				   [i][0]);
			((Class157_Sub2) this).aFloatArrayArray9157[i][0]
			    = (((Class157_Sub2) this).aFloatArrayArray9157[i]
			       [2]);
			((Class157_Sub2) this).aFloatArrayArray9157[i][2] = f;
		    }
		    if (((Class157_Sub2) this).aFloatArrayArray9149[i]
			!= null) {
			float f = (((Class157_Sub2) this).aFloatArrayArray9149
				   [i][0]);
			((Class157_Sub2) this).aFloatArrayArray9149[i][0]
			    = (((Class157_Sub2) this).aFloatArrayArray9149[i]
			       [2]);
			((Class157_Sub2) this).aFloatArrayArray9149[i][2] = f;
		    }
		}
	    }
	    ((Class157_Sub2) this).aBool9179 = false;
	    ((Class157_Sub2) this).anInt9152 = 0;
	}
    }
    
    public int method1994() {
	return ((Class157_Sub2) this).anInt9134;
    }
    
    public void method1910(int i) {
	if ((((Class157_Sub2) this).anInt9132 & 0x1000) != 4096)
	    throw new IllegalStateException();
	((Class157_Sub2) this).anInt9133 = i;
	((Class157_Sub2) this).anInt9152 = 0;
    }
    
    public void method1904(int i, int i_1029_, Class137 class137,
			   Class137 class137_1030_, int i_1031_, int i_1032_,
			   int i_1033_) {
	if (i == 3) {
	    if ((((Class157_Sub2) this).anInt9132 & 0x7) != 7)
		throw new IllegalStateException();
	} else if ((((Class157_Sub2) this).anInt9132 & 0x2) != 2)
	    throw new IllegalStateException();
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	int i_1034_ = i_1031_ + ((Class157_Sub2) this).aShort9184;
	int i_1035_ = i_1031_ + ((Class157_Sub2) this).aShort9185;
	int i_1036_ = i_1033_ + ((Class157_Sub2) this).aShort9186;
	int i_1037_ = i_1033_ + ((Class157_Sub2) this).aShort9144;
	if (i == 4 || (i_1034_ >= 0
		       && ((i_1035_ + class137.anInt1628 * 2130003981
			    >> class137.anInt1625 * 1543345989)
			   < class137.anInt1627 * -657933437)
		       && i_1036_ >= 0
		       && ((i_1037_ + class137.anInt1628 * 2130003981
			    >> class137.anInt1625 * 1543345989)
			   < class137.anInt1626 * 1769495707))) {
	    int[][] is = class137.anIntArrayArray1629;
	    int[][] is_1038_ = null;
	    if (class137_1030_ != null)
		is_1038_ = class137_1030_.anIntArrayArray1629;
	    if (i == 4 || i == 5) {
		if (class137_1030_ == null
		    || (i_1034_ < 0
			|| ((i_1035_ + class137_1030_.anInt1628 * 2130003981
			     >> class137_1030_.anInt1625 * 1543345989)
			    >= class137_1030_.anInt1627 * -657933437)
			|| i_1036_ < 0
			|| ((i_1037_ + class137_1030_.anInt1628 * 2130003981
			     >> class137_1030_.anInt1625 * 1543345989)
			    >= class137_1030_.anInt1626 * 1769495707)))
		    return;
	    } else {
		i_1034_ >>= class137.anInt1625 * 1543345989;
		i_1035_ = (i_1035_ + (class137.anInt1628 * 2130003981 - 1)
			   >> class137.anInt1625 * 1543345989);
		i_1036_ >>= class137.anInt1625 * 1543345989;
		i_1037_ = (i_1037_ + (class137.anInt1628 * 2130003981 - 1)
			   >> class137.anInt1625 * 1543345989);
		if (is[i_1034_][i_1036_] == i_1032_
		    && is[i_1035_][i_1036_] == i_1032_
		    && is[i_1034_][i_1037_] == i_1032_
		    && is[i_1035_][i_1037_] == i_1032_)
		    return;
	    }
	    synchronized (this) {
		if (i == 1) {
		    int i_1039_ = class137.anInt1628 * 2130003981 - 1;
		    for (int i_1040_ = 0;
			 i_1040_ < ((Class157_Sub2) this).anInt9136;
			 i_1040_++) {
			int i_1041_
			    = (((Class157_Sub2) this).anIntArray9203[i_1040_]
			       + i_1031_);
			int i_1042_
			    = (((Class157_Sub2) this).anIntArray9177[i_1040_]
			       + i_1033_);
			int i_1043_ = i_1041_ & i_1039_;
			int i_1044_ = i_1042_ & i_1039_;
			int i_1045_
			    = i_1041_ >> class137.anInt1625 * 1543345989;
			int i_1046_
			    = i_1042_ >> class137.anInt1625 * 1543345989;
			int i_1047_
			    = (((is[i_1045_][i_1046_]
				 * (class137.anInt1628 * 2130003981 - i_1043_))
				+ is[i_1045_ + 1][i_1046_] * i_1043_)
			       >> class137.anInt1625 * 1543345989);
			int i_1048_
			    = (((is[i_1045_][i_1046_ + 1]
				 * (class137.anInt1628 * 2130003981 - i_1043_))
				+ is[i_1045_ + 1][i_1046_ + 1] * i_1043_)
			       >> class137.anInt1625 * 1543345989);
			int i_1049_
			    = (i_1047_ * (class137.anInt1628 * 2130003981
					  - i_1044_) + i_1048_ * i_1044_
			       >> class137.anInt1625 * 1543345989);
			((Class157_Sub2) this).anIntArray9204[i_1040_]
			    = (((Class157_Sub2) this).anIntArray9204[i_1040_]
			       + i_1049_ - i_1032_);
		    }
		    for (int i_1050_ = ((Class157_Sub2) this).anInt9136;
			 i_1050_ < ((Class157_Sub2) this).anInt9135;
			 i_1050_++) {
			int i_1051_
			    = (((Class157_Sub2) this).anIntArray9203[i_1050_]
			       + i_1031_);
			int i_1052_
			    = (((Class157_Sub2) this).anIntArray9177[i_1050_]
			       + i_1033_);
			int i_1053_ = i_1051_ & i_1039_;
			int i_1054_ = i_1052_ & i_1039_;
			int i_1055_
			    = i_1051_ >> class137.anInt1625 * 1543345989;
			int i_1056_
			    = i_1052_ >> class137.anInt1625 * 1543345989;
			if (i_1055_ >= 0 && i_1055_ < is.length - 1
			    && i_1056_ >= 0 && i_1056_ < is[0].length - 1) {
			    int i_1057_
				= (((is[i_1055_][i_1056_]
				     * (class137.anInt1628 * 2130003981
					- i_1053_))
				    + is[i_1055_ + 1][i_1056_] * i_1053_)
				   >> class137.anInt1625 * 1543345989);
			    int i_1058_
				= (((is[i_1055_][i_1056_ + 1]
				     * (class137.anInt1628 * 2130003981
					- i_1053_))
				    + is[i_1055_ + 1][i_1056_ + 1] * i_1053_)
				   >> class137.anInt1625 * 1543345989);
			    int i_1059_
				= (i_1057_ * (class137.anInt1628 * 2130003981
					      - i_1054_) + i_1058_ * i_1054_
				   >> class137.anInt1625 * 1543345989);
			    ((Class157_Sub2) this).anIntArray9204[i_1050_]
				= (((Class157_Sub2) this).anIntArray9204
				   [i_1050_]) + i_1059_ - i_1032_;
			}
		    }
		} else if (i == 2) {
		    if (((Class157_Sub2) this).aShort9182 == 0)
			return;
		    int i_1060_ = class137.anInt1628 * 2130003981 - 1;
		    for (int i_1061_ = 0;
			 i_1061_ < ((Class157_Sub2) this).anInt9136;
			 i_1061_++) {
			int i_1062_
			    = ((((Class157_Sub2) this).anIntArray9204[i_1061_]
				<< 16)
			       / ((Class157_Sub2) this).aShort9182);
			if (i_1062_ < i_1029_) {
			    int i_1063_ = ((((Class157_Sub2) this)
					    .anIntArray9203[i_1061_])
					   + i_1031_);
			    int i_1064_ = ((((Class157_Sub2) this)
					    .anIntArray9177[i_1061_])
					   + i_1033_);
			    int i_1065_ = i_1063_ & i_1060_;
			    int i_1066_ = i_1064_ & i_1060_;
			    int i_1067_
				= i_1063_ >> class137.anInt1625 * 1543345989;
			    int i_1068_
				= i_1064_ >> class137.anInt1625 * 1543345989;
			    int i_1069_
				= (((is[i_1067_][i_1068_]
				     * (class137.anInt1628 * 2130003981
					- i_1065_))
				    + is[i_1067_ + 1][i_1068_] * i_1065_)
				   >> class137.anInt1625 * 1543345989);
			    int i_1070_
				= (((is[i_1067_][i_1068_ + 1]
				     * (class137.anInt1628 * 2130003981
					- i_1065_))
				    + is[i_1067_ + 1][i_1068_ + 1] * i_1065_)
				   >> class137.anInt1625 * 1543345989);
			    int i_1071_
				= (i_1069_ * (class137.anInt1628 * 2130003981
					      - i_1066_) + i_1070_ * i_1066_
				   >> class137.anInt1625 * 1543345989);
			    ((Class157_Sub2) this).anIntArray9204[i_1061_]
				= ((((Class157_Sub2) this).anIntArray9204
				    [i_1061_])
				   + ((i_1071_ - i_1032_) * (i_1029_ - i_1062_)
				      / i_1029_));
			} else
			    ((Class157_Sub2) this).anIntArray9204[i_1061_]
				= (((Class157_Sub2) this).anIntArray9204
				   [i_1061_]);
		    }
		    for (int i_1072_ = ((Class157_Sub2) this).anInt9136;
			 i_1072_ < ((Class157_Sub2) this).anInt9135;
			 i_1072_++) {
			int i_1073_
			    = ((((Class157_Sub2) this).anIntArray9204[i_1072_]
				<< 16)
			       / ((Class157_Sub2) this).aShort9182);
			if (i_1073_ < i_1029_) {
			    int i_1074_ = ((((Class157_Sub2) this)
					    .anIntArray9203[i_1072_])
					   + i_1031_);
			    int i_1075_ = ((((Class157_Sub2) this)
					    .anIntArray9177[i_1072_])
					   + i_1033_);
			    int i_1076_ = i_1074_ & i_1060_;
			    int i_1077_ = i_1075_ & i_1060_;
			    int i_1078_
				= i_1074_ >> class137.anInt1625 * 1543345989;
			    int i_1079_
				= i_1075_ >> class137.anInt1625 * 1543345989;
			    if (i_1078_ >= 0
				&& (i_1078_
				    < class137.anInt1627 * -657933437 - 1)
				&& i_1079_ >= 0
				&& (i_1079_
				    < class137.anInt1626 * 1769495707 - 1)) {
				int i_1080_
				    = (((is[i_1078_][i_1079_]
					 * (class137.anInt1628 * 2130003981
					    - i_1076_))
					+ is[i_1078_ + 1][i_1079_] * i_1076_)
				       >> class137.anInt1625 * 1543345989);
				int i_1081_
				    = (((is[i_1078_][i_1079_ + 1]
					 * (class137.anInt1628 * 2130003981
					    - i_1076_))
					+ (is[i_1078_ + 1][i_1079_ + 1]
					   * i_1076_))
				       >> class137.anInt1625 * 1543345989);
				int i_1082_
				    = ((i_1080_
					* (class137.anInt1628 * 2130003981
					   - i_1077_)) + i_1081_ * i_1077_
				       >> class137.anInt1625 * 1543345989);
				((Class157_Sub2) this).anIntArray9204[i_1072_]
				    = ((((Class157_Sub2) this).anIntArray9204
					[i_1072_])
				       + ((i_1082_ - i_1032_)
					  * (i_1029_ - i_1073_) / i_1029_));
			    }
			} else
			    ((Class157_Sub2) this).anIntArray9204[i_1072_]
				= (((Class157_Sub2) this).anIntArray9204
				   [i_1072_]);
		    }
		} else if (i == 3) {
		    int i_1083_ = (i_1029_ & 0xff) * 4;
		    int i_1084_ = (i_1029_ >> 8 & 0xff) * 4;
		    int i_1085_ = (i_1029_ >> 16 & 0xff) << 6;
		    int i_1086_ = (i_1029_ >> 24 & 0xff) << 6;
		    if (i_1031_ - (i_1083_ >> 1) < 0
			|| ((i_1031_ + (i_1083_ >> 1)
			     + class137.anInt1628 * 2130003981)
			    >= (class137.anInt1627 * -657933437
				<< class137.anInt1625 * 1543345989))
			|| i_1033_ - (i_1084_ >> 1) < 0
			|| ((i_1033_ + (i_1084_ >> 1)
			     + class137.anInt1628 * 2130003981)
			    >= (class137.anInt1626 * 1769495707
				<< class137.anInt1625 * 1543345989)))
			return;
		    method1884(class137, i_1031_, i_1032_, i_1033_, i_1083_,
			       i_1084_, i_1085_, i_1086_);
		} else if (i == 4) {
		    int i_1087_ = class137_1030_.anInt1628 * 2130003981 - 1;
		    int i_1088_ = (((Class157_Sub2) this).aShort9183
				   - ((Class157_Sub2) this).aShort9182);
		    for (int i_1089_ = 0;
			 i_1089_ < ((Class157_Sub2) this).anInt9136;
			 i_1089_++) {
			int i_1090_
			    = (((Class157_Sub2) this).anIntArray9203[i_1089_]
			       + i_1031_);
			int i_1091_
			    = (((Class157_Sub2) this).anIntArray9177[i_1089_]
			       + i_1033_);
			int i_1092_ = i_1090_ & i_1087_;
			int i_1093_ = i_1091_ & i_1087_;
			int i_1094_
			    = i_1090_ >> class137_1030_.anInt1625 * 1543345989;
			int i_1095_
			    = i_1091_ >> class137_1030_.anInt1625 * 1543345989;
			int i_1096_
			    = (((is_1038_[i_1094_][i_1095_]
				 * (class137_1030_.anInt1628 * 2130003981
				    - i_1092_))
				+ is_1038_[i_1094_ + 1][i_1095_] * i_1092_)
			       >> class137_1030_.anInt1625 * 1543345989);
			int i_1097_
			    = (((is_1038_[i_1094_][i_1095_ + 1]
				 * (class137_1030_.anInt1628 * 2130003981
				    - i_1092_))
				+ is_1038_[i_1094_ + 1][i_1095_ + 1] * i_1092_)
			       >> class137_1030_.anInt1625 * 1543345989);
			int i_1098_
			    = (i_1096_ * (class137_1030_.anInt1628 * 2130003981
					  - i_1093_) + i_1097_ * i_1093_
			       >> class137_1030_.anInt1625 * 1543345989);
			((Class157_Sub2) this).anIntArray9204[i_1089_]
			    = (((Class157_Sub2) this).anIntArray9204[i_1089_]
			       + (i_1098_ - i_1032_) + i_1088_);
		    }
		    for (int i_1099_ = ((Class157_Sub2) this).anInt9136;
			 i_1099_ < ((Class157_Sub2) this).anInt9135;
			 i_1099_++) {
			int i_1100_
			    = (((Class157_Sub2) this).anIntArray9203[i_1099_]
			       + i_1031_);
			int i_1101_
			    = (((Class157_Sub2) this).anIntArray9177[i_1099_]
			       + i_1033_);
			int i_1102_ = i_1100_ & i_1087_;
			int i_1103_ = i_1101_ & i_1087_;
			int i_1104_
			    = i_1100_ >> class137_1030_.anInt1625 * 1543345989;
			int i_1105_
			    = i_1101_ >> class137_1030_.anInt1625 * 1543345989;
			if (i_1104_ >= 0
			    && (i_1104_
				< class137_1030_.anInt1627 * -657933437 - 1)
			    && i_1105_ >= 0
			    && (i_1105_
				< class137_1030_.anInt1626 * 1769495707 - 1)) {
			    int i_1106_
				= (((is_1038_[i_1104_][i_1105_]
				     * (class137_1030_.anInt1628 * 2130003981
					- i_1102_))
				    + is_1038_[i_1104_ + 1][i_1105_] * i_1102_)
				   >> class137_1030_.anInt1625 * 1543345989);
			    int i_1107_
				= (((is_1038_[i_1104_][i_1105_ + 1]
				     * (class137_1030_.anInt1628 * 2130003981
					- i_1102_))
				    + (is_1038_[i_1104_ + 1][i_1105_ + 1]
				       * i_1102_))
				   >> class137_1030_.anInt1625 * 1543345989);
			    int i_1108_
				= ((i_1106_
				    * (class137_1030_.anInt1628 * 2130003981
				       - i_1103_)) + i_1107_ * i_1103_
				   >> class137_1030_.anInt1625 * 1543345989);
			    ((Class157_Sub2) this).anIntArray9204[i_1099_]
				= (((Class157_Sub2) this).anIntArray9204
				   [i_1099_]) + (i_1108_ - i_1032_) + i_1088_;
			}
		    }
		} else if (i == 5) {
		    int i_1109_ = class137_1030_.anInt1628 * 2130003981 - 1;
		    int i_1110_ = (((Class157_Sub2) this).aShort9183
				   - ((Class157_Sub2) this).aShort9182);
		    for (int i_1111_ = 0;
			 i_1111_ < ((Class157_Sub2) this).anInt9136;
			 i_1111_++) {
			int i_1112_
			    = (((Class157_Sub2) this).anIntArray9203[i_1111_]
			       + i_1031_);
			int i_1113_
			    = (((Class157_Sub2) this).anIntArray9177[i_1111_]
			       + i_1033_);
			int i_1114_ = i_1112_ & i_1109_;
			int i_1115_ = i_1113_ & i_1109_;
			int i_1116_
			    = i_1112_ >> class137.anInt1625 * 1543345989;
			int i_1117_
			    = i_1113_ >> class137.anInt1625 * 1543345989;
			int i_1118_
			    = (((is[i_1116_][i_1117_]
				 * (class137.anInt1628 * 2130003981 - i_1114_))
				+ is[i_1116_ + 1][i_1117_] * i_1114_)
			       >> class137.anInt1625 * 1543345989);
			int i_1119_
			    = (((is[i_1116_][i_1117_ + 1]
				 * (class137.anInt1628 * 2130003981 - i_1114_))
				+ is[i_1116_ + 1][i_1117_ + 1] * i_1114_)
			       >> class137.anInt1625 * 1543345989);
			int i_1120_
			    = (i_1118_ * (class137.anInt1628 * 2130003981
					  - i_1115_) + i_1119_ * i_1115_
			       >> class137.anInt1625 * 1543345989);
			i_1118_ = (((is_1038_[i_1116_][i_1117_]
				     * (class137_1030_.anInt1628 * 2130003981
					- i_1114_))
				    + is_1038_[i_1116_ + 1][i_1117_] * i_1114_)
				   >> class137_1030_.anInt1625 * 1543345989);
			i_1119_
			    = (((is_1038_[i_1116_][i_1117_ + 1]
				 * (class137_1030_.anInt1628 * 2130003981
				    - i_1114_))
				+ is_1038_[i_1116_ + 1][i_1117_ + 1] * i_1114_)
			       >> class137_1030_.anInt1625 * 1543345989);
			int i_1121_
			    = (i_1118_ * (class137_1030_.anInt1628 * 2130003981
					  - i_1115_) + i_1119_ * i_1115_
			       >> class137_1030_.anInt1625 * 1543345989);
			int i_1122_ = i_1120_ - i_1121_ - i_1029_;
			((Class157_Sub2) this).anIntArray9204[i_1111_]
			    = ((((Class157_Sub2) this).anIntArray9204[i_1111_]
				<< 8) / i_1110_ * i_1122_
			       >> 8) - (i_1032_ - i_1120_);
		    }
		    for (int i_1123_ = ((Class157_Sub2) this).anInt9136;
			 i_1123_ < ((Class157_Sub2) this).anInt9135;
			 i_1123_++) {
			int i_1124_
			    = (((Class157_Sub2) this).anIntArray9203[i_1123_]
			       + i_1031_);
			int i_1125_
			    = (((Class157_Sub2) this).anIntArray9177[i_1123_]
			       + i_1033_);
			int i_1126_ = i_1124_ & i_1109_;
			int i_1127_ = i_1125_ & i_1109_;
			int i_1128_
			    = i_1124_ >> class137.anInt1625 * 1543345989;
			int i_1129_
			    = i_1125_ >> class137.anInt1625 * 1543345989;
			if (i_1128_ >= 0
			    && i_1128_ < class137.anInt1627 * -657933437 - 1
			    && (i_1128_
				< class137_1030_.anInt1627 * -657933437 - 1)
			    && i_1129_ >= 0
			    && i_1129_ < class137.anInt1626 * 1769495707 - 1
			    && (i_1129_
				< class137_1030_.anInt1626 * 1769495707 - 1)) {
			    int i_1130_
				= (((is[i_1128_][i_1129_]
				     * (class137.anInt1628 * 2130003981
					- i_1126_))
				    + is[i_1128_ + 1][i_1129_] * i_1126_)
				   >> class137.anInt1625 * 1543345989);
			    int i_1131_
				= (((is[i_1128_][i_1129_ + 1]
				     * (class137.anInt1628 * 2130003981
					- i_1126_))
				    + is[i_1128_ + 1][i_1129_ + 1] * i_1126_)
				   >> class137.anInt1625 * 1543345989);
			    int i_1132_
				= (i_1130_ * (class137.anInt1628 * 2130003981
					      - i_1127_) + i_1131_ * i_1127_
				   >> class137.anInt1625 * 1543345989);
			    i_1130_
				= (((is_1038_[i_1128_][i_1129_]
				     * (class137_1030_.anInt1628 * 2130003981
					- i_1126_))
				    + is_1038_[i_1128_ + 1][i_1129_] * i_1126_)
				   >> class137_1030_.anInt1625 * 1543345989);
			    i_1131_
				= (((is_1038_[i_1128_][i_1129_ + 1]
				     * (class137_1030_.anInt1628 * 2130003981
					- i_1126_))
				    + (is_1038_[i_1128_ + 1][i_1129_ + 1]
				       * i_1126_))
				   >> class137_1030_.anInt1625 * 1543345989);
			    int i_1133_
				= ((i_1130_
				    * (class137_1030_.anInt1628 * 2130003981
				       - i_1127_)) + i_1131_ * i_1127_
				   >> class137_1030_.anInt1625 * 1543345989);
			    int i_1134_ = i_1132_ - i_1133_ - i_1029_;
			    ((Class157_Sub2) this).anIntArray9204[i_1123_]
				= (((((Class157_Sub2) this).anIntArray9204
				     [i_1123_])
				    << 8) / i_1110_ * i_1134_
				   >> 8) - (i_1032_ - i_1132_);
			}
		    }
		}
		((Class157_Sub2) this).aBool9179 = false;
	    }
	}
    }
    
    boolean method1953() {
	if (((Class157_Sub2) this).anIntArrayArray9165 == null)
	    return false;
	((Class157_Sub2) this).anInt9169 = 0;
	((Class157_Sub2) this).anInt9170 = 0;
	((Class157_Sub2) this).anInt9171 = 0;
	return true;
    }
    
    void method1938() {
	if ((((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
	     .anInt9745) * -1585405167
	    > 1) {
	    synchronized (this) {
		aBool1738 = false;
		this.notifyAll();
	    }
	}
    }
    
    void method1933() {
	if ((((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
	     .anInt9745) * -1585405167
	    > 1) {
	    synchronized (this) {
		aBool1738 = false;
		this.notifyAll();
	    }
	}
    }
    
    public Class157 method1951(byte i, int i_1135_, boolean bool) {
	method8425(Thread.currentThread());
	boolean bool_1136_ = false;
	Class157_Sub2 class157_sub2_1137_;
	Class157_Sub2 class157_sub2_1138_;
	if (i > 0 && i <= 8) {
	    class157_sub2_1138_
		= ((Class157_Sub2) this).aClass157_Sub2Array9191[i - 1];
	    class157_sub2_1137_
		= ((Class157_Sub2) this).aClass157_Sub2Array9128[i - 1];
	    bool_1136_ = true;
	} else
	    class157_sub2_1137_ = class157_sub2_1138_
		= new Class157_Sub2(((Class157_Sub2) this)
				    .aClass173_Sub3_9130);
	return method8439(class157_sub2_1137_, class157_sub2_1138_, i_1135_,
			  bool_1136_, bool);
    }
    
    void method1952() {
	if ((((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
	     .anInt9745) * -1585405167
	    > 1) {
	    synchronized (this) {
		aBool1738 = false;
		this.notifyAll();
	    }
	}
    }
    
    void method8437() {
	synchronized (this) {
	    for (int i = 0; i < ((Class157_Sub2) this).anInt9135; i++) {
		int i_1139_ = ((Class157_Sub2) this).anIntArray9203[i];
		((Class157_Sub2) this).anIntArray9203[i]
		    = ((Class157_Sub2) this).anIntArray9177[i];
		((Class157_Sub2) this).anIntArray9177[i] = -i_1139_;
	    }
	    method8411();
	}
    }
    
    void method2027() {
	if ((((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
	     .anInt9745) * -1585405167
	    > 1) {
	    synchronized (this) {
		while (aBool1738) {
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		aBool1738 = true;
	    }
	}
    }
    
    void method1956() {
	if (((Class157_Sub2) this).aBool9168) {
	    for (int i = 0; i < ((Class157_Sub2) this).anInt9135; i++) {
		((Class157_Sub2) this).anIntArray9203[i]
		    = ((Class157_Sub2) this).anIntArray9203[i] + 7 >> 4;
		((Class157_Sub2) this).anIntArray9204[i]
		    = ((Class157_Sub2) this).anIntArray9204[i] + 7 >> 4;
		((Class157_Sub2) this).anIntArray9177[i]
		    = ((Class157_Sub2) this).anIntArray9177[i] + 7 >> 4;
	    }
	    ((Class157_Sub2) this).aBool9168 = false;
	}
	if (((Class157_Sub2) this).aBool9195) {
	    method8406();
	    ((Class157_Sub2) this).aBool9195 = false;
	}
	((Class157_Sub2) this).aBool9179 = false;
    }
    
    public void method2006(int i, int i_1140_, int i_1141_, int i_1142_) {
	if ((((Class157_Sub2) this).anInt9132 & 0x80000) != 524288)
	    throw new IllegalStateException();
	for (int i_1143_ = 0; i_1143_ < ((Class157_Sub2) this).anInt9143;
	     i_1143_++) {
	    int i_1144_
		= ((Class157_Sub2) this).aShortArray9162[i_1143_] & 0xffff;
	    int i_1145_ = i_1144_ >> 10 & 0x3f;
	    int i_1146_ = i_1144_ >> 7 & 0x7;
	    int i_1147_ = i_1144_ & 0x7f;
	    if (i != -1)
		i_1145_ += (i - i_1145_) * i_1142_ >> 7;
	    if (i_1140_ != -1)
		i_1146_ += (i_1140_ - i_1146_) * i_1142_ >> 7;
	    if (i_1141_ != -1)
		i_1147_ += (i_1141_ - i_1147_) * i_1142_ >> 7;
	    ((Class157_Sub2) this).aShortArray9162[i_1143_]
		= (short) (i_1145_ << 10 | i_1146_ << 7 | i_1147_);
	}
	if (((Class157_Sub2) this).aClass90Array9156 != null) {
	    for (int i_1148_ = 0; i_1148_ < ((Class157_Sub2) this).anInt9175;
		 i_1148_++) {
		Class90 class90
		    = ((Class157_Sub2) this).aClass90Array9156[i_1148_];
		Class108 class108
		    = ((Class157_Sub2) this).aClass108Array9123[i_1148_];
		((Class108) class108).anInt1368
		    = ((((Class108) class108).anInt1368 * -1351793475
			& ~0xffffff)
		       | ((Class72.anIntArray777
			   [Class516.method6283(((((Class157_Sub2) this)
						  .aShortArray9162
						  [(((Class90) class90)
						    .anInt1142) * 1037728387])
						 & 0xffff),
						515814180) & 0xffff])
			  & 0xffffff)) * 323344021;
	    }
	}
	if (((Class157_Sub2) this).anInt9152 == 2)
	    ((Class157_Sub2) this).anInt9152 = 1;
    }
    
    void method1958() {
	if (((Class157_Sub2) this).aBool9168) {
	    for (int i = 0; i < ((Class157_Sub2) this).anInt9135; i++) {
		((Class157_Sub2) this).anIntArray9203[i]
		    = ((Class157_Sub2) this).anIntArray9203[i] + 7 >> 4;
		((Class157_Sub2) this).anIntArray9204[i]
		    = ((Class157_Sub2) this).anIntArray9204[i] + 7 >> 4;
		((Class157_Sub2) this).anIntArray9177[i]
		    = ((Class157_Sub2) this).anIntArray9177[i] + 7 >> 4;
	    }
	    ((Class157_Sub2) this).aBool9168 = false;
	}
	if (((Class157_Sub2) this).aBool9195) {
	    method8406();
	    ((Class157_Sub2) this).aBool9195 = false;
	}
	((Class157_Sub2) this).aBool9179 = false;
    }
    
    public int method1979() {
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	return ((Class157_Sub2) this).aShort9182;
    }
    
    public void method1999(byte i, byte[] is) {
	if ((((Class157_Sub2) this).anInt9132 & 0x100000) == 0)
	    throw new RuntimeException();
	if (((Class157_Sub2) this).aByteArray9160 == null)
	    ((Class157_Sub2) this).aByteArray9160
		= new byte[((Class157_Sub2) this).anInt9143];
	if (is == null) {
	    for (int i_1149_ = 0; i_1149_ < ((Class157_Sub2) this).anInt9143;
		 i_1149_++)
		((Class157_Sub2) this).aByteArray9160[i_1149_] = i;
	} else {
	    for (int i_1150_ = 0; i_1150_ < ((Class157_Sub2) this).anInt9143;
		 i_1150_++) {
		int i_1151_ = 255 - ((255 - (is[i_1150_] & 0xff))
				     * (255 - (i & 0xff)) / 255);
		((Class157_Sub2) this).aByteArray9160[i_1150_]
		    = (byte) i_1151_;
	    }
	}
	if (((Class157_Sub2) this).anInt9152 == 2)
	    ((Class157_Sub2) this).anInt9152 = 1;
    }
    
    void method1918(int i, int[] is, int i_1152_, int i_1153_, int i_1154_,
		    boolean bool, int i_1155_, int[] is_1156_) {
	int i_1157_ = is.length;
	if (i == 0) {
	    i_1152_ <<= 4;
	    i_1153_ <<= 4;
	    i_1154_ <<= 4;
	    if (!((Class157_Sub2) this).aBool9168) {
		for (int i_1158_ = 0;
		     i_1158_ < ((Class157_Sub2) this).anInt9135; i_1158_++) {
		    ((Class157_Sub2) this).anIntArray9203[i_1158_] <<= 4;
		    ((Class157_Sub2) this).anIntArray9204[i_1158_] <<= 4;
		    ((Class157_Sub2) this).anIntArray9177[i_1158_] <<= 4;
		}
		((Class157_Sub2) this).aBool9168 = true;
	    }
	    int i_1159_ = 0;
	    ((Class157_Sub2) this).anInt9169 = 0;
	    ((Class157_Sub2) this).anInt9170 = 0;
	    ((Class157_Sub2) this).anInt9171 = 0;
	    for (int i_1160_ = 0; i_1160_ < i_1157_; i_1160_++) {
		int i_1161_ = is[i_1160_];
		if (i_1161_
		    < ((Class157_Sub2) this).anIntArrayArray9165.length) {
		    int[] is_1162_
			= ((Class157_Sub2) this).anIntArrayArray9165[i_1161_];
		    for (int i_1163_ = 0; i_1163_ < is_1162_.length;
			 i_1163_++) {
			int i_1164_ = is_1162_[i_1163_];
			if (((Class157_Sub2) this).aShortArray9140 == null
			    || (i_1155_ & (((Class157_Sub2) this)
					   .aShortArray9140[i_1164_])) != 0) {
			    ((Class157_Sub2) this).anInt9169
				+= (((Class157_Sub2) this).anIntArray9203
				    [i_1164_]);
			    ((Class157_Sub2) this).anInt9170
				+= (((Class157_Sub2) this).anIntArray9204
				    [i_1164_]);
			    ((Class157_Sub2) this).anInt9171
				+= (((Class157_Sub2) this).anIntArray9177
				    [i_1164_]);
			    i_1159_++;
			}
		    }
		}
	    }
	    if (i_1159_ > 0) {
		((Class157_Sub2) this).anInt9169
		    = ((Class157_Sub2) this).anInt9169 / i_1159_ + i_1152_;
		((Class157_Sub2) this).anInt9170
		    = ((Class157_Sub2) this).anInt9170 / i_1159_ + i_1153_;
		((Class157_Sub2) this).anInt9171
		    = ((Class157_Sub2) this).anInt9171 / i_1159_ + i_1154_;
		((Class157_Sub2) this).aBool9172 = true;
	    } else {
		((Class157_Sub2) this).anInt9169 = i_1152_;
		((Class157_Sub2) this).anInt9170 = i_1153_;
		((Class157_Sub2) this).anInt9171 = i_1154_;
	    }
	} else if (i == 1) {
	    if (is_1156_ != null) {
		int i_1165_ = ((is_1156_[0] * i_1152_ + is_1156_[1] * i_1153_
				+ is_1156_[2] * i_1154_ + 8192)
			       >> 14);
		int i_1166_ = ((is_1156_[3] * i_1152_ + is_1156_[4] * i_1153_
				+ is_1156_[5] * i_1154_ + 8192)
			       >> 14);
		int i_1167_ = ((is_1156_[6] * i_1152_ + is_1156_[7] * i_1153_
				+ is_1156_[8] * i_1154_ + 8192)
			       >> 14);
		i_1152_ = i_1165_;
		i_1153_ = i_1166_;
		i_1154_ = i_1167_;
	    }
	    i_1152_ <<= 4;
	    i_1153_ <<= 4;
	    i_1154_ <<= 4;
	    if (!((Class157_Sub2) this).aBool9168) {
		for (int i_1168_ = 0;
		     i_1168_ < ((Class157_Sub2) this).anInt9135; i_1168_++) {
		    ((Class157_Sub2) this).anIntArray9203[i_1168_] <<= 4;
		    ((Class157_Sub2) this).anIntArray9204[i_1168_] <<= 4;
		    ((Class157_Sub2) this).anIntArray9177[i_1168_] <<= 4;
		}
		((Class157_Sub2) this).aBool9168 = true;
	    }
	    for (int i_1169_ = 0; i_1169_ < i_1157_; i_1169_++) {
		int i_1170_ = is[i_1169_];
		if (i_1170_
		    < ((Class157_Sub2) this).anIntArrayArray9165.length) {
		    int[] is_1171_
			= ((Class157_Sub2) this).anIntArrayArray9165[i_1170_];
		    for (int i_1172_ = 0; i_1172_ < is_1171_.length;
			 i_1172_++) {
			int i_1173_ = is_1171_[i_1172_];
			if (((Class157_Sub2) this).aShortArray9140 == null
			    || (i_1155_ & (((Class157_Sub2) this)
					   .aShortArray9140[i_1173_])) != 0) {
			    ((Class157_Sub2) this).anIntArray9203[i_1173_]
				+= i_1152_;
			    ((Class157_Sub2) this).anIntArray9204[i_1173_]
				+= i_1153_;
			    ((Class157_Sub2) this).anIntArray9177[i_1173_]
				+= i_1154_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_1156_ != null) {
		if (!((Class157_Sub2) this).aBool9168) {
		    for (int i_1174_ = 0;
			 i_1174_ < ((Class157_Sub2) this).anInt9135;
			 i_1174_++) {
			((Class157_Sub2) this).anIntArray9203[i_1174_] <<= 4;
			((Class157_Sub2) this).anIntArray9204[i_1174_] <<= 4;
			((Class157_Sub2) this).anIntArray9177[i_1174_] <<= 4;
		    }
		    ((Class157_Sub2) this).aBool9168 = true;
		}
		int i_1175_ = is_1156_[9] << 4;
		int i_1176_ = is_1156_[10] << 4;
		int i_1177_ = is_1156_[11] << 4;
		int i_1178_ = is_1156_[12] << 4;
		int i_1179_ = is_1156_[13] << 4;
		int i_1180_ = is_1156_[14] << 4;
		if (((Class157_Sub2) this).aBool9172) {
		    int i_1181_
			= ((is_1156_[0] * ((Class157_Sub2) this).anInt9169
			    + is_1156_[3] * ((Class157_Sub2) this).anInt9170
			    + is_1156_[6] * ((Class157_Sub2) this).anInt9171
			    + 8192)
			   >> 14);
		    int i_1182_
			= ((is_1156_[1] * ((Class157_Sub2) this).anInt9169
			    + is_1156_[4] * ((Class157_Sub2) this).anInt9170
			    + is_1156_[7] * ((Class157_Sub2) this).anInt9171
			    + 8192)
			   >> 14);
		    int i_1183_
			= ((is_1156_[2] * ((Class157_Sub2) this).anInt9169
			    + is_1156_[5] * ((Class157_Sub2) this).anInt9170
			    + is_1156_[8] * ((Class157_Sub2) this).anInt9171
			    + 8192)
			   >> 14);
		    i_1181_ += i_1178_;
		    i_1182_ += i_1179_;
		    i_1183_ += i_1180_;
		    ((Class157_Sub2) this).anInt9169 = i_1181_;
		    ((Class157_Sub2) this).anInt9170 = i_1182_;
		    ((Class157_Sub2) this).anInt9171 = i_1183_;
		    ((Class157_Sub2) this).aBool9172 = false;
		}
		int[] is_1184_ = new int[9];
		int i_1185_ = Class417.anIntArray4767[i_1152_];
		int i_1186_ = Class417.anIntArray4766[i_1152_];
		int i_1187_ = Class417.anIntArray4767[i_1153_];
		int i_1188_ = Class417.anIntArray4766[i_1153_];
		int i_1189_ = Class417.anIntArray4767[i_1154_];
		int i_1190_ = Class417.anIntArray4766[i_1154_];
		int i_1191_ = i_1186_ * i_1189_ + 8192 >> 14;
		int i_1192_ = i_1186_ * i_1190_ + 8192 >> 14;
		is_1184_[0]
		    = i_1187_ * i_1189_ + i_1188_ * i_1192_ + 8192 >> 14;
		is_1184_[1]
		    = -i_1187_ * i_1190_ + i_1188_ * i_1191_ + 8192 >> 14;
		is_1184_[2] = i_1188_ * i_1185_ + 8192 >> 14;
		is_1184_[3] = i_1185_ * i_1190_ + 8192 >> 14;
		is_1184_[4] = i_1185_ * i_1189_ + 8192 >> 14;
		is_1184_[5] = -i_1186_;
		is_1184_[6]
		    = -i_1188_ * i_1189_ + i_1187_ * i_1192_ + 8192 >> 14;
		is_1184_[7]
		    = i_1188_ * i_1190_ + i_1187_ * i_1191_ + 8192 >> 14;
		is_1184_[8] = i_1187_ * i_1185_ + 8192 >> 14;
		int i_1193_
		    = ((is_1184_[0] * -((Class157_Sub2) this).anInt9169
			+ is_1184_[1] * -((Class157_Sub2) this).anInt9170
			+ is_1184_[2] * -((Class157_Sub2) this).anInt9171
			+ 8192)
		       >> 14);
		int i_1194_
		    = ((is_1184_[3] * -((Class157_Sub2) this).anInt9169
			+ is_1184_[4] * -((Class157_Sub2) this).anInt9170
			+ is_1184_[5] * -((Class157_Sub2) this).anInt9171
			+ 8192)
		       >> 14);
		int i_1195_
		    = ((is_1184_[6] * -((Class157_Sub2) this).anInt9169
			+ is_1184_[7] * -((Class157_Sub2) this).anInt9170
			+ is_1184_[8] * -((Class157_Sub2) this).anInt9171
			+ 8192)
		       >> 14);
		int i_1196_ = i_1193_ + ((Class157_Sub2) this).anInt9169;
		int i_1197_ = i_1194_ + ((Class157_Sub2) this).anInt9170;
		int i_1198_ = i_1195_ + ((Class157_Sub2) this).anInt9171;
		int[] is_1199_ = new int[9];
		for (int i_1200_ = 0; i_1200_ < 3; i_1200_++) {
		    for (int i_1201_ = 0; i_1201_ < 3; i_1201_++) {
			int i_1202_ = 0;
			for (int i_1203_ = 0; i_1203_ < 3; i_1203_++)
			    i_1202_ += (is_1184_[i_1200_ * 3 + i_1203_]
					* is_1156_[i_1201_ * 3 + i_1203_]);
			is_1199_[i_1200_ * 3 + i_1201_] = i_1202_ + 8192 >> 14;
		    }
		}
		int i_1204_ = ((is_1184_[0] * i_1178_ + is_1184_[1] * i_1179_
				+ is_1184_[2] * i_1180_ + 8192)
			       >> 14);
		int i_1205_ = ((is_1184_[3] * i_1178_ + is_1184_[4] * i_1179_
				+ is_1184_[5] * i_1180_ + 8192)
			       >> 14);
		int i_1206_ = ((is_1184_[6] * i_1178_ + is_1184_[7] * i_1179_
				+ is_1184_[8] * i_1180_ + 8192)
			       >> 14);
		i_1204_ += i_1196_;
		i_1205_ += i_1197_;
		i_1206_ += i_1198_;
		int[] is_1207_ = new int[9];
		for (int i_1208_ = 0; i_1208_ < 3; i_1208_++) {
		    for (int i_1209_ = 0; i_1209_ < 3; i_1209_++) {
			int i_1210_ = 0;
			for (int i_1211_ = 0; i_1211_ < 3; i_1211_++)
			    i_1210_ += (is_1156_[i_1208_ * 3 + i_1211_]
					* is_1199_[i_1209_ + i_1211_ * 3]);
			is_1207_[i_1208_ * 3 + i_1209_] = i_1210_ + 8192 >> 14;
		    }
		}
		int i_1212_ = ((is_1156_[0] * i_1204_ + is_1156_[1] * i_1205_
				+ is_1156_[2] * i_1206_ + 8192)
			       >> 14);
		int i_1213_ = ((is_1156_[3] * i_1204_ + is_1156_[4] * i_1205_
				+ is_1156_[5] * i_1206_ + 8192)
			       >> 14);
		int i_1214_ = ((is_1156_[6] * i_1204_ + is_1156_[7] * i_1205_
				+ is_1156_[8] * i_1206_ + 8192)
			       >> 14);
		i_1212_ += i_1175_;
		i_1213_ += i_1176_;
		i_1214_ += i_1177_;
		for (int i_1215_ = 0; i_1215_ < i_1157_; i_1215_++) {
		    int i_1216_ = is[i_1215_];
		    if (i_1216_
			< ((Class157_Sub2) this).anIntArrayArray9165.length) {
			int[] is_1217_ = (((Class157_Sub2) this)
					  .anIntArrayArray9165[i_1216_]);
			for (int i_1218_ = 0; i_1218_ < is_1217_.length;
			     i_1218_++) {
			    int i_1219_ = is_1217_[i_1218_];
			    if (((Class157_Sub2) this).aShortArray9140 == null
				|| ((i_1155_ & (((Class157_Sub2) this)
						.aShortArray9140[i_1219_]))
				    != 0)) {
				int i_1220_
				    = (is_1207_[0] * (((Class157_Sub2) this)
						      .anIntArray9203[i_1219_])
				       + is_1207_[1] * (((Class157_Sub2) this)
							.anIntArray9204
							[i_1219_])
				       + is_1207_[2] * (((Class157_Sub2) this)
							.anIntArray9177
							[i_1219_])
				       + 8192) >> 14;
				int i_1221_
				    = (is_1207_[3] * (((Class157_Sub2) this)
						      .anIntArray9203[i_1219_])
				       + is_1207_[4] * (((Class157_Sub2) this)
							.anIntArray9204
							[i_1219_])
				       + is_1207_[5] * (((Class157_Sub2) this)
							.anIntArray9177
							[i_1219_])
				       + 8192) >> 14;
				int i_1222_
				    = (is_1207_[6] * (((Class157_Sub2) this)
						      .anIntArray9203[i_1219_])
				       + is_1207_[7] * (((Class157_Sub2) this)
							.anIntArray9204
							[i_1219_])
				       + is_1207_[8] * (((Class157_Sub2) this)
							.anIntArray9177
							[i_1219_])
				       + 8192) >> 14;
				i_1220_ += i_1212_;
				i_1221_ += i_1213_;
				i_1222_ += i_1214_;
				((Class157_Sub2) this).anIntArray9203[i_1219_]
				    = i_1220_;
				((Class157_Sub2) this).anIntArray9204[i_1219_]
				    = i_1221_;
				((Class157_Sub2) this).anIntArray9177[i_1219_]
				    = i_1222_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1223_ = 0; i_1223_ < i_1157_; i_1223_++) {
		    int i_1224_ = is[i_1223_];
		    if (i_1224_
			< ((Class157_Sub2) this).anIntArrayArray9165.length) {
			int[] is_1225_ = (((Class157_Sub2) this)
					  .anIntArrayArray9165[i_1224_]);
			for (int i_1226_ = 0; i_1226_ < is_1225_.length;
			     i_1226_++) {
			    int i_1227_ = is_1225_[i_1226_];
			    if (((Class157_Sub2) this).aShortArray9140 == null
				|| ((i_1155_ & (((Class157_Sub2) this)
						.aShortArray9140[i_1227_]))
				    != 0)) {
				((Class157_Sub2) this).anIntArray9203[i_1227_]
				    -= ((Class157_Sub2) this).anInt9169;
				((Class157_Sub2) this).anIntArray9204[i_1227_]
				    -= ((Class157_Sub2) this).anInt9170;
				((Class157_Sub2) this).anIntArray9177[i_1227_]
				    -= ((Class157_Sub2) this).anInt9171;
				if (i_1154_ != 0) {
				    int i_1228_
					= Class417.anIntArray4766[i_1154_];
				    int i_1229_
					= Class417.anIntArray4767[i_1154_];
				    int i_1230_
					= ((((Class157_Sub2) this)
					    .anIntArray9204[i_1227_]) * i_1228_
					   + ((((Class157_Sub2) this)
					       .anIntArray9203[i_1227_])
					      * i_1229_)
					   + 16383) >> 14;
				    ((Class157_Sub2) this).anIntArray9204
					[i_1227_]
					= ((((Class157_Sub2) this)
					    .anIntArray9204[i_1227_]) * i_1229_
					   - ((((Class157_Sub2) this)
					       .anIntArray9203[i_1227_])
					      * i_1228_)
					   + 16383) >> 14;
				    ((Class157_Sub2) this).anIntArray9203
					[i_1227_]
					= i_1230_;
				}
				if (i_1152_ != 0) {
				    int i_1231_
					= Class417.anIntArray4766[i_1152_];
				    int i_1232_
					= Class417.anIntArray4767[i_1152_];
				    int i_1233_
					= ((((Class157_Sub2) this)
					    .anIntArray9204[i_1227_]) * i_1232_
					   - ((((Class157_Sub2) this)
					       .anIntArray9177[i_1227_])
					      * i_1231_)
					   + 16383) >> 14;
				    ((Class157_Sub2) this).anIntArray9177
					[i_1227_]
					= ((((Class157_Sub2) this)
					    .anIntArray9204[i_1227_]) * i_1231_
					   + ((((Class157_Sub2) this)
					       .anIntArray9177[i_1227_])
					      * i_1232_)
					   + 16383) >> 14;
				    ((Class157_Sub2) this).anIntArray9204
					[i_1227_]
					= i_1233_;
				}
				if (i_1153_ != 0) {
				    int i_1234_
					= Class417.anIntArray4766[i_1153_];
				    int i_1235_
					= Class417.anIntArray4767[i_1153_];
				    int i_1236_
					= ((((Class157_Sub2) this)
					    .anIntArray9177[i_1227_]) * i_1234_
					   + ((((Class157_Sub2) this)
					       .anIntArray9203[i_1227_])
					      * i_1235_)
					   + 16383) >> 14;
				    ((Class157_Sub2) this).anIntArray9177
					[i_1227_]
					= ((((Class157_Sub2) this)
					    .anIntArray9177[i_1227_]) * i_1235_
					   - ((((Class157_Sub2) this)
					       .anIntArray9203[i_1227_])
					      * i_1234_)
					   + 16383) >> 14;
				    ((Class157_Sub2) this).anIntArray9203
					[i_1227_]
					= i_1236_;
				}
				((Class157_Sub2) this).anIntArray9203[i_1227_]
				    += ((Class157_Sub2) this).anInt9169;
				((Class157_Sub2) this).anIntArray9204[i_1227_]
				    += ((Class157_Sub2) this).anInt9170;
				((Class157_Sub2) this).anIntArray9177[i_1227_]
				    += ((Class157_Sub2) this).anInt9171;
			    }
			}
		    }
		}
	    }
	} else if (i == 3) {
	    if (is_1156_ != null) {
		if (!((Class157_Sub2) this).aBool9168) {
		    for (int i_1237_ = 0;
			 i_1237_ < ((Class157_Sub2) this).anInt9135;
			 i_1237_++) {
			((Class157_Sub2) this).anIntArray9203[i_1237_] <<= 4;
			((Class157_Sub2) this).anIntArray9204[i_1237_] <<= 4;
			((Class157_Sub2) this).anIntArray9177[i_1237_] <<= 4;
		    }
		    ((Class157_Sub2) this).aBool9168 = true;
		}
		int i_1238_ = is_1156_[9] << 4;
		int i_1239_ = is_1156_[10] << 4;
		int i_1240_ = is_1156_[11] << 4;
		int i_1241_ = is_1156_[12] << 4;
		int i_1242_ = is_1156_[13] << 4;
		int i_1243_ = is_1156_[14] << 4;
		if (((Class157_Sub2) this).aBool9172) {
		    int i_1244_
			= ((is_1156_[0] * ((Class157_Sub2) this).anInt9169
			    + is_1156_[3] * ((Class157_Sub2) this).anInt9170
			    + is_1156_[6] * ((Class157_Sub2) this).anInt9171
			    + 8192)
			   >> 14);
		    int i_1245_
			= ((is_1156_[1] * ((Class157_Sub2) this).anInt9169
			    + is_1156_[4] * ((Class157_Sub2) this).anInt9170
			    + is_1156_[7] * ((Class157_Sub2) this).anInt9171
			    + 8192)
			   >> 14);
		    int i_1246_
			= ((is_1156_[2] * ((Class157_Sub2) this).anInt9169
			    + is_1156_[5] * ((Class157_Sub2) this).anInt9170
			    + is_1156_[8] * ((Class157_Sub2) this).anInt9171
			    + 8192)
			   >> 14);
		    i_1244_ += i_1241_;
		    i_1245_ += i_1242_;
		    i_1246_ += i_1243_;
		    ((Class157_Sub2) this).anInt9169 = i_1244_;
		    ((Class157_Sub2) this).anInt9170 = i_1245_;
		    ((Class157_Sub2) this).anInt9171 = i_1246_;
		    ((Class157_Sub2) this).aBool9172 = false;
		}
		int i_1247_ = i_1152_ << 15 >> 7;
		int i_1248_ = i_1153_ << 15 >> 7;
		int i_1249_ = i_1154_ << 15 >> 7;
		int i_1250_
		    = i_1247_ * -((Class157_Sub2) this).anInt9169 + 8192 >> 14;
		int i_1251_
		    = i_1248_ * -((Class157_Sub2) this).anInt9170 + 8192 >> 14;
		int i_1252_
		    = i_1249_ * -((Class157_Sub2) this).anInt9171 + 8192 >> 14;
		int i_1253_ = i_1250_ + ((Class157_Sub2) this).anInt9169;
		int i_1254_ = i_1251_ + ((Class157_Sub2) this).anInt9170;
		int i_1255_ = i_1252_ + ((Class157_Sub2) this).anInt9171;
		int[] is_1256_ = new int[9];
		is_1256_[0] = i_1247_ * is_1156_[0] + 8192 >> 14;
		is_1256_[1] = i_1247_ * is_1156_[3] + 8192 >> 14;
		is_1256_[2] = i_1247_ * is_1156_[6] + 8192 >> 14;
		is_1256_[3] = i_1248_ * is_1156_[1] + 8192 >> 14;
		is_1256_[4] = i_1248_ * is_1156_[4] + 8192 >> 14;
		is_1256_[5] = i_1248_ * is_1156_[7] + 8192 >> 14;
		is_1256_[6] = i_1249_ * is_1156_[2] + 8192 >> 14;
		is_1256_[7] = i_1249_ * is_1156_[5] + 8192 >> 14;
		is_1256_[8] = i_1249_ * is_1156_[8] + 8192 >> 14;
		int i_1257_ = i_1247_ * i_1241_ + 8192 >> 14;
		int i_1258_ = i_1248_ * i_1242_ + 8192 >> 14;
		int i_1259_ = i_1249_ * i_1243_ + 8192 >> 14;
		i_1257_ += i_1253_;
		i_1258_ += i_1254_;
		i_1259_ += i_1255_;
		int[] is_1260_ = new int[9];
		for (int i_1261_ = 0; i_1261_ < 3; i_1261_++) {
		    for (int i_1262_ = 0; i_1262_ < 3; i_1262_++) {
			int i_1263_ = 0;
			for (int i_1264_ = 0; i_1264_ < 3; i_1264_++)
			    i_1263_ += (is_1156_[i_1261_ * 3 + i_1264_]
					* is_1256_[i_1262_ + i_1264_ * 3]);
			is_1260_[i_1261_ * 3 + i_1262_] = i_1263_ + 8192 >> 14;
		    }
		}
		int i_1265_ = ((is_1156_[0] * i_1257_ + is_1156_[1] * i_1258_
				+ is_1156_[2] * i_1259_ + 8192)
			       >> 14);
		int i_1266_ = ((is_1156_[3] * i_1257_ + is_1156_[4] * i_1258_
				+ is_1156_[5] * i_1259_ + 8192)
			       >> 14);
		int i_1267_ = ((is_1156_[6] * i_1257_ + is_1156_[7] * i_1258_
				+ is_1156_[8] * i_1259_ + 8192)
			       >> 14);
		i_1265_ += i_1238_;
		i_1266_ += i_1239_;
		i_1267_ += i_1240_;
		for (int i_1268_ = 0; i_1268_ < i_1157_; i_1268_++) {
		    int i_1269_ = is[i_1268_];
		    if (i_1269_
			< ((Class157_Sub2) this).anIntArrayArray9165.length) {
			int[] is_1270_ = (((Class157_Sub2) this)
					  .anIntArrayArray9165[i_1269_]);
			for (int i_1271_ = 0; i_1271_ < is_1270_.length;
			     i_1271_++) {
			    int i_1272_ = is_1270_[i_1271_];
			    if (((Class157_Sub2) this).aShortArray9140 == null
				|| ((i_1155_ & (((Class157_Sub2) this)
						.aShortArray9140[i_1272_]))
				    != 0)) {
				int i_1273_
				    = (is_1260_[0] * (((Class157_Sub2) this)
						      .anIntArray9203[i_1272_])
				       + is_1260_[1] * (((Class157_Sub2) this)
							.anIntArray9204
							[i_1272_])
				       + is_1260_[2] * (((Class157_Sub2) this)
							.anIntArray9177
							[i_1272_])
				       + 8192) >> 14;
				int i_1274_
				    = (is_1260_[3] * (((Class157_Sub2) this)
						      .anIntArray9203[i_1272_])
				       + is_1260_[4] * (((Class157_Sub2) this)
							.anIntArray9204
							[i_1272_])
				       + is_1260_[5] * (((Class157_Sub2) this)
							.anIntArray9177
							[i_1272_])
				       + 8192) >> 14;
				int i_1275_
				    = (is_1260_[6] * (((Class157_Sub2) this)
						      .anIntArray9203[i_1272_])
				       + is_1260_[7] * (((Class157_Sub2) this)
							.anIntArray9204
							[i_1272_])
				       + is_1260_[8] * (((Class157_Sub2) this)
							.anIntArray9177
							[i_1272_])
				       + 8192) >> 14;
				i_1273_ += i_1265_;
				i_1274_ += i_1266_;
				i_1275_ += i_1267_;
				((Class157_Sub2) this).anIntArray9203[i_1272_]
				    = i_1273_;
				((Class157_Sub2) this).anIntArray9204[i_1272_]
				    = i_1274_;
				((Class157_Sub2) this).anIntArray9177[i_1272_]
				    = i_1275_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1276_ = 0; i_1276_ < i_1157_; i_1276_++) {
		    int i_1277_ = is[i_1276_];
		    if (i_1277_
			< ((Class157_Sub2) this).anIntArrayArray9165.length) {
			int[] is_1278_ = (((Class157_Sub2) this)
					  .anIntArrayArray9165[i_1277_]);
			for (int i_1279_ = 0; i_1279_ < is_1278_.length;
			     i_1279_++) {
			    int i_1280_ = is_1278_[i_1279_];
			    if (((Class157_Sub2) this).aShortArray9140 == null
				|| ((i_1155_ & (((Class157_Sub2) this)
						.aShortArray9140[i_1280_]))
				    != 0)) {
				((Class157_Sub2) this).anIntArray9203[i_1280_]
				    -= ((Class157_Sub2) this).anInt9169;
				((Class157_Sub2) this).anIntArray9204[i_1280_]
				    -= ((Class157_Sub2) this).anInt9170;
				((Class157_Sub2) this).anIntArray9177[i_1280_]
				    -= ((Class157_Sub2) this).anInt9171;
				((Class157_Sub2) this).anIntArray9203[i_1280_]
				    = (((Class157_Sub2) this).anIntArray9203
				       [i_1280_]) * i_1152_ / 128;
				((Class157_Sub2) this).anIntArray9204[i_1280_]
				    = (((Class157_Sub2) this).anIntArray9204
				       [i_1280_]) * i_1153_ / 128;
				((Class157_Sub2) this).anIntArray9177[i_1280_]
				    = (((Class157_Sub2) this).anIntArray9177
				       [i_1280_]) * i_1154_ / 128;
				((Class157_Sub2) this).anIntArray9203[i_1280_]
				    += ((Class157_Sub2) this).anInt9169;
				((Class157_Sub2) this).anIntArray9204[i_1280_]
				    += ((Class157_Sub2) this).anInt9170;
				((Class157_Sub2) this).anIntArray9177[i_1280_]
				    += ((Class157_Sub2) this).anInt9171;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class157_Sub2) this).anIntArrayArray9166 != null
		&& ((Class157_Sub2) this).aByteArray9160 != null) {
		for (int i_1281_ = 0; i_1281_ < i_1157_; i_1281_++) {
		    int i_1282_ = is[i_1281_];
		    if (i_1282_
			< ((Class157_Sub2) this).anIntArrayArray9166.length) {
			int[] is_1283_ = (((Class157_Sub2) this)
					  .anIntArrayArray9166[i_1282_]);
			for (int i_1284_ = 0; i_1284_ < is_1283_.length;
			     i_1284_++) {
			    int i_1285_ = is_1283_[i_1284_];
			    if (((Class157_Sub2) this).aShortArray9163 == null
				|| ((i_1155_ & (((Class157_Sub2) this)
						.aShortArray9163[i_1285_]))
				    != 0)) {
				int i_1286_ = (((((Class157_Sub2) this)
						 .aByteArray9160[i_1285_])
						& 0xff)
					       + i_1152_ * 8);
				if (i_1286_ < 0)
				    i_1286_ = 0;
				else if (i_1286_ > 255)
				    i_1286_ = 255;
				((Class157_Sub2) this).aByteArray9160[i_1285_]
				    = (byte) i_1286_;
			    }
			}
		    }
		}
		if (((Class157_Sub2) this).aClass90Array9156 != null) {
		    for (int i_1287_ = 0;
			 i_1287_ < ((Class157_Sub2) this).anInt9175;
			 i_1287_++) {
			Class90 class90 = (((Class157_Sub2) this)
					   .aClass90Array9156[i_1287_]);
			Class108 class108 = (((Class157_Sub2) this)
					     .aClass108Array9123[i_1287_]);
			((Class108) class108).anInt1368
			    = ((((Class108) class108).anInt1368 * -1351793475
				& 0xffffff)
			       | 255 - ((((Class157_Sub2) this).aByteArray9160
					 [(((Class90) class90).anInt1142
					   * 1037728387)])
					& 0xff) << 24) * 323344021;
		    }
		}
	    }
	} else if (i == 7) {
	    if (((Class157_Sub2) this).anIntArrayArray9166 != null) {
		for (int i_1288_ = 0; i_1288_ < i_1157_; i_1288_++) {
		    int i_1289_ = is[i_1288_];
		    if (i_1289_
			< ((Class157_Sub2) this).anIntArrayArray9166.length) {
			int[] is_1290_ = (((Class157_Sub2) this)
					  .anIntArrayArray9166[i_1289_]);
			for (int i_1291_ = 0; i_1291_ < is_1290_.length;
			     i_1291_++) {
			    int i_1292_ = is_1290_[i_1291_];
			    if (((Class157_Sub2) this).aShortArray9163 == null
				|| ((i_1155_ & (((Class157_Sub2) this)
						.aShortArray9163[i_1292_]))
				    != 0)) {
				int i_1293_ = ((((Class157_Sub2) this)
						.aShortArray9162[i_1292_])
					       & 0xffff);
				int i_1294_ = i_1293_ >> 10 & 0x3f;
				int i_1295_ = i_1293_ >> 7 & 0x7;
				int i_1296_ = i_1293_ & 0x7f;
				i_1294_ = i_1294_ + i_1152_ & 0x3f;
				i_1295_ += i_1153_;
				if (i_1295_ < 0)
				    i_1295_ = 0;
				else if (i_1295_ > 7)
				    i_1295_ = 7;
				i_1296_ += i_1154_;
				if (i_1296_ < 0)
				    i_1296_ = 0;
				else if (i_1296_ > 127)
				    i_1296_ = 127;
				((Class157_Sub2) this).aShortArray9162[i_1292_]
				    = (short) (i_1294_ << 10 | i_1295_ << 7
					       | i_1296_);
			    }
			}
			((Class157_Sub2) this).aBool9195 = true;
		    }
		}
		if (((Class157_Sub2) this).aClass90Array9156 != null) {
		    for (int i_1297_ = 0;
			 i_1297_ < ((Class157_Sub2) this).anInt9175;
			 i_1297_++) {
			Class90 class90 = (((Class157_Sub2) this)
					   .aClass90Array9156[i_1297_]);
			Class108 class108 = (((Class157_Sub2) this)
					     .aClass108Array9123[i_1297_]);
			((Class108) class108).anInt1368
			    = (((((Class108) class108).anInt1368 * -1351793475
				 & ~0xffffff)
				| (Class72.anIntArray777
				   [(Class516.method6283
				     ((((Class157_Sub2) this).aShortArray9162
				       [(((Class90) class90).anInt1142
					 * 1037728387)]) & 0xffff,
				      515814180)) & 0xffff]) & 0xffffff)
			       * 323344021);
		    }
		}
	    }
	} else if (i == 8) {
	    if (((Class157_Sub2) this).anIntArrayArray9178 != null) {
		for (int i_1298_ = 0; i_1298_ < i_1157_; i_1298_++) {
		    int i_1299_ = is[i_1298_];
		    if (i_1299_
			< ((Class157_Sub2) this).anIntArrayArray9178.length) {
			int[] is_1300_ = (((Class157_Sub2) this)
					  .anIntArrayArray9178[i_1299_]);
			for (int i_1301_ = 0; i_1301_ < is_1300_.length;
			     i_1301_++) {
			    Class108 class108
				= (((Class157_Sub2) this).aClass108Array9123
				   [is_1300_[i_1301_]]);
			    ((Class108) class108).anInt1365
				+= i_1152_ * -731787657;
			    ((Class108) class108).anInt1366
				+= i_1153_ * 1335672291;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class157_Sub2) this).anIntArrayArray9178 != null) {
		for (int i_1302_ = 0; i_1302_ < i_1157_; i_1302_++) {
		    int i_1303_ = is[i_1302_];
		    if (i_1303_
			< ((Class157_Sub2) this).anIntArrayArray9178.length) {
			int[] is_1304_ = (((Class157_Sub2) this)
					  .anIntArrayArray9178[i_1303_]);
			for (int i_1305_ = 0; i_1305_ < is_1304_.length;
			     i_1305_++) {
			    Class108 class108
				= (((Class157_Sub2) this).aClass108Array9123
				   [is_1304_[i_1305_]]);
			    ((Class108) class108).aFloat1363
				= (((Class108) class108).aFloat1363
				   * (float) i_1152_ / 128.0F);
			    ((Class108) class108).aFloat1364
				= (((Class108) class108).aFloat1364
				   * (float) i_1153_ / 128.0F);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class157_Sub2) this).anIntArrayArray9178 != null) {
		for (int i_1306_ = 0; i_1306_ < i_1157_; i_1306_++) {
		    int i_1307_ = is[i_1306_];
		    if (i_1307_
			< ((Class157_Sub2) this).anIntArrayArray9178.length) {
			int[] is_1308_ = (((Class157_Sub2) this)
					  .anIntArrayArray9178[i_1307_]);
			for (int i_1309_ = 0; i_1309_ < is_1308_.length;
			     i_1309_++) {
			    Class108 class108
				= (((Class157_Sub2) this).aClass108Array9123
				   [is_1308_[i_1309_]]);
			    ((Class108) class108).anInt1367
				= ((((Class108) class108).anInt1367 * 337890173
				    + i_1152_)
				   & 0x3fff) * 1644905941;
			}
		    }
		}
	    }
	}
    }
    
    void method1871() {
	if (((Class157_Sub2) this).aBool9168) {
	    for (int i = 0; i < ((Class157_Sub2) this).anInt9135; i++) {
		((Class157_Sub2) this).anIntArray9203[i]
		    = ((Class157_Sub2) this).anIntArray9203[i] + 7 >> 4;
		((Class157_Sub2) this).anIntArray9204[i]
		    = ((Class157_Sub2) this).anIntArray9204[i] + 7 >> 4;
		((Class157_Sub2) this).anIntArray9177[i]
		    = ((Class157_Sub2) this).anIntArray9177[i] + 7 >> 4;
	    }
	    ((Class157_Sub2) this).aBool9168 = false;
	}
	if (((Class157_Sub2) this).aBool9195) {
	    method8406();
	    ((Class157_Sub2) this).aBool9195 = false;
	}
	((Class157_Sub2) this).aBool9179 = false;
    }
    
    public byte[] method1996() {
	return ((Class157_Sub2) this).aByteArray9160;
    }
    
    public void method1946(int i, int i_1310_, int i_1311_) {
	if (i != 128 && (((Class157_Sub2) this).anInt9132 & 0x1) != 1)
	    throw new IllegalStateException();
	if (i_1310_ != 128 && (((Class157_Sub2) this).anInt9132 & 0x2) != 2)
	    throw new IllegalStateException();
	if (i_1311_ != 128 && (((Class157_Sub2) this).anInt9132 & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i_1312_ = 0; i_1312_ < ((Class157_Sub2) this).anInt9135;
		 i_1312_++) {
		((Class157_Sub2) this).anIntArray9203[i_1312_]
		    = ((Class157_Sub2) this).anIntArray9203[i_1312_] * i >> 7;
		((Class157_Sub2) this).anIntArray9204[i_1312_]
		    = (((Class157_Sub2) this).anIntArray9204[i_1312_] * i_1310_
		       >> 7);
		((Class157_Sub2) this).anIntArray9177[i_1312_]
		    = (((Class157_Sub2) this).anIntArray9177[i_1312_] * i_1311_
		       >> 7);
	    }
	    ((Class157_Sub2) this).aBool9179 = false;
	}
    }
    
    public void method1964(Class433 class433, Class159 class159, int i) {
	method8440(class433, class159, i);
    }
    
    boolean method1955() {
	if (((Class157_Sub2) this).anIntArrayArray9165 == null)
	    return false;
	((Class157_Sub2) this).anInt9169 = 0;
	((Class157_Sub2) this).anInt9170 = 0;
	((Class157_Sub2) this).anInt9171 = 0;
	return true;
    }
    
    public void method1966(Class433 class433, Class159 class159, int i) {
	method8440(class433, class159, i);
    }
    
    public boolean method1950() {
	if (((Class157_Sub2) this).aShortArray9205 == null)
	    return true;
	for (int i = 0; i < ((Class157_Sub2) this).aShortArray9205.length;
	     i++) {
	    if (((Class157_Sub2) this).aShortArray9205[i] != -1
		&& !((Class157_Sub2) this).aClass173_Sub3_9130
			.method8927(((Class157_Sub2) this).aShortArray9205[i]))
		return false;
	}
	return true;
    }
    
    public void method1963(Class433 class433, int i, boolean bool) {
	if (((Class157_Sub2) this).aShortArray9140 != null) {
	    Class107 class107 = ((Class157_Sub2) this).aClass173_Sub3_9130
				    .method8939(Thread.currentThread());
	    Class433 class433_1313_ = ((Class107) class107).aClass433_1331;
	    class433_1313_.method5217(class433);
	    if (bool)
		class433_1313_.method5223();
	    Class418 class418 = ((Class107) class107).aClass418_1319;
	    class418.method5035(class433_1313_);
	    float[] fs = new float[3];
	    for (int i_1314_ = 0; i_1314_ < ((Class157_Sub2) this).anInt9136;
		 i_1314_++) {
		if ((i & ((Class157_Sub2) this).aShortArray9140[i_1314_])
		    != 0) {
		    class418.method5030((float) (((Class157_Sub2) this)
						 .anIntArray9203[i_1314_]),
					(float) (((Class157_Sub2) this)
						 .anIntArray9204[i_1314_]),
					(float) (((Class157_Sub2) this)
						 .anIntArray9177[i_1314_]),
					fs);
		    ((Class157_Sub2) this).anIntArray9203[i_1314_]
			= (int) fs[0];
		    ((Class157_Sub2) this).anIntArray9204[i_1314_]
			= (int) fs[1];
		    ((Class157_Sub2) this).anIntArray9177[i_1314_]
			= (int) fs[2];
		}
	    }
	}
    }
    
    public void method1940(int i) {
	if ((((Class157_Sub2) this).anInt9132 & 0xd) != 13)
	    throw new IllegalStateException();
	if (((Class157_Sub2) this).aClass103Array9141 != null) {
	    if (i == 4096)
		method8410();
	    else if (i == 8192)
		method8408();
	    else if (i == 12288)
		method8409();
	    else {
		int i_1315_ = Class417.anIntArray4766[i];
		int i_1316_ = Class417.anIntArray4767[i];
		synchronized (this) {
		    for (int i_1317_ = 0;
			 i_1317_ < ((Class157_Sub2) this).anInt9136;
			 i_1317_++) {
			int i_1318_
			    = (((((Class157_Sub2) this).anIntArray9177[i_1317_]
				 * i_1315_)
				+ (((Class157_Sub2) this).anIntArray9203
				   [i_1317_]) * i_1316_)
			       >> 14);
			((Class157_Sub2) this).anIntArray9177[i_1317_]
			    = ((((Class157_Sub2) this).anIntArray9177[i_1317_]
				* i_1316_)
			       - (((Class157_Sub2) this).anIntArray9203
				  [i_1317_]) * i_1315_) >> 14;
			((Class157_Sub2) this).anIntArray9203[i_1317_]
			    = i_1318_;
			if (((Class157_Sub2) this).aClass103Array9141[i_1317_]
			    != null) {
			    i_1318_
				= ((((Class103) (((Class157_Sub2) this)
						 .aClass103Array9141[i_1317_]))
				    .anInt1299) * i_1315_
				   + (((Class103) (((Class157_Sub2) this)
						   .aClass103Array9141
						   [i_1317_])).anInt1300
				      * i_1316_)) >> 14;
			    ((Class103) (((Class157_Sub2) this)
					 .aClass103Array9141
					 [i_1317_])).anInt1299
				= ((((Class103) (((Class157_Sub2) this)
						 .aClass103Array9141[i_1317_]))
				    .anInt1299) * i_1316_
				   - (((Class103) (((Class157_Sub2) this)
						   .aClass103Array9141
						   [i_1317_])).anInt1300
				      * i_1315_)) >> 14;
			    ((Class103) (((Class157_Sub2) this)
					 .aClass103Array9141
					 [i_1317_])).anInt1300
				= i_1318_;
			}
		    }
		    if (((Class157_Sub2) this).aClass104Array9196 != null) {
			for (int i_1319_ = 0;
			     i_1319_ < ((Class157_Sub2) this).anInt9143;
			     i_1319_++) {
			    if ((((Class157_Sub2) this).aClass104Array9196
				 [i_1319_])
				!= null) {
				int i_1320_
				    = (((((Class104) (((Class157_Sub2) this)
						      .aClass104Array9196
						      [i_1319_])).anInt1307
					 * i_1315_)
					+ (((Class104) (((Class157_Sub2) this)
							.aClass104Array9196
							[i_1319_])).anInt1305
					   * i_1316_))
				       >> 14);
				((Class104) (((Class157_Sub2) this)
					     .aClass104Array9196
					     [i_1319_])).anInt1307
				    = ((((Class104) (((Class157_Sub2) this)
						     .aClass104Array9196
						     [i_1319_])).anInt1307
					* i_1316_)
				       - (((Class104) (((Class157_Sub2) this)
						       .aClass104Array9196
						       [i_1319_])).anInt1305
					  * i_1315_)) >> 14;
				((Class104) (((Class157_Sub2) this)
					     .aClass104Array9196
					     [i_1319_])).anInt1305
				    = i_1320_;
			    }
			}
		    }
		    for (int i_1321_ = ((Class157_Sub2) this).anInt9136;
			 i_1321_ < ((Class157_Sub2) this).anInt9135;
			 i_1321_++) {
			int i_1322_
			    = (((((Class157_Sub2) this).anIntArray9177[i_1321_]
				 * i_1315_)
				+ (((Class157_Sub2) this).anIntArray9203
				   [i_1321_]) * i_1316_)
			       >> 14);
			((Class157_Sub2) this).anIntArray9177[i_1321_]
			    = ((((Class157_Sub2) this).anIntArray9177[i_1321_]
				* i_1316_)
			       - (((Class157_Sub2) this).anIntArray9203
				  [i_1321_]) * i_1315_) >> 14;
			((Class157_Sub2) this).anIntArray9203[i_1321_]
			    = i_1322_;
		    }
		    ((Class157_Sub2) this).anInt9152 = 0;
		    ((Class157_Sub2) this).aBool9179 = false;
		}
	    }
	} else
	    method1878(i);
    }
    
    final void method8438(boolean bool, boolean bool_1323_, boolean bool_1324_,
			  boolean bool_1325_, boolean bool_1326_) {
	if (((Class157_Sub2) this).aClass90Array9156 != null) {
	    for (int i = 0; i < ((Class157_Sub2) this).anInt9175; i++) {
		Class90 class90 = ((Class157_Sub2) this).aClass90Array9156[i];
		((Class157_Sub2) this).anIntArray9193
		    [((Class90) class90).anInt1142 * 1037728387]
		    = i;
	    }
	}
	if (((Class157_Sub2) this).aBool9190
	    || ((Class157_Sub2) this).aClass90Array9156 != null) {
	    if ((((Class157_Sub2) this).anInt9132 & 0x100) == 0
		&& ((Class157_Sub2) this).aShortArray9164 != null) {
		for (int i = 0; i < ((Class157_Sub2) this).anInt9198; i++) {
		    short i_1327_ = ((Class157_Sub2) this).aShortArray9164[i];
		    method8417(bool, bool_1323_, bool_1324_, i_1327_,
			       bool_1325_, bool_1326_);
		}
	    } else {
		for (int i = 0; i < ((Class157_Sub2) this).anInt9198; i++) {
		    if (!method8415(i) && !method8416(i))
			method8417(bool, bool_1323_, bool_1324_, i, bool_1325_,
				   bool_1326_);
		}
		if (((Class157_Sub2) this).aByteArray9159 == null) {
		    for (int i = 0; i < ((Class157_Sub2) this).anInt9198;
			 i++) {
			if (method8415(i) || method8416(i))
			    method8417(bool, bool_1323_, bool_1324_, i,
				       bool_1325_, bool_1326_);
		    }
		} else {
		    for (int i = 0; i < 12; i++) {
			for (int i_1328_ = 0;
			     i_1328_ < ((Class157_Sub2) this).anInt9198;
			     i_1328_++) {
			    if ((((Class157_Sub2) this).aByteArray9159[i_1328_]
				 == i)
				&& (method8415(i_1328_)
				    || method8416(i_1328_)))
				method8417(bool, bool_1323_, bool_1324_,
					   i_1328_, bool_1325_, bool_1326_);
			}
		    }
		}
	    }
	    if (((Class157_Sub2) this).aClass90Array9156 != null)
		method8414(bool, bool_1323_, bool_1324_);
	} else {
	    for (int i = 0; i < ((Class157_Sub2) this).anInt9198; i++)
		method8417(bool, bool_1323_, bool_1324_, i, bool_1325_,
			   bool_1326_);
	}
    }
    
    void method2034() {
	if ((((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
	     .anInt9745) * -1585405167
	    > 1) {
	    synchronized (this) {
		aBool1738 = false;
		this.notifyAll();
	    }
	}
    }
    
    public boolean method1943(int i, int i_1329_, Class433 class433,
			      boolean bool, int i_1330_) {
	method8401(((Class157_Sub2) this).aClass173_Sub3_9130
		       .method8939(Thread.currentThread()));
	Class418 class418 = (((Class107) ((Class157_Sub2) this).aClass107_9121)
			     .aClass418_1319);
	class418.method5035(class433);
	Class418 class418_1331_
	    = (((Class107) ((Class157_Sub2) this).aClass107_9121)
	       .aClass418_1333);
	class418_1331_.method4986(class418);
	class418_1331_.method4974(((Class173_Sub3)
				   ((Class157_Sub2) this).aClass173_Sub3_9130)
				  .aClass418_9736);
	boolean bool_1332_ = false;
	int i_1333_ = 2147483647;
	int i_1334_ = -2147483648;
	int i_1335_ = 2147483647;
	int i_1336_ = -2147483648;
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	int i_1337_ = ((((Class157_Sub2) this).aShort9185
			- ((Class157_Sub2) this).aShort9184)
		       >> 1);
	int i_1338_ = ((((Class157_Sub2) this).aShort9183
			- ((Class157_Sub2) this).aShort9182)
		       >> 1);
	int i_1339_ = ((((Class157_Sub2) this).aShort9144
			- ((Class157_Sub2) this).aShort9186)
		       >> 1);
	int i_1340_ = ((Class157_Sub2) this).aShort9184 + i_1337_;
	int i_1341_ = ((Class157_Sub2) this).aShort9182 + i_1338_;
	int i_1342_ = ((Class157_Sub2) this).aShort9186 + i_1339_;
	int i_1343_ = i_1340_ - (i_1337_ << i_1330_);
	int i_1344_ = i_1341_ - (i_1338_ << i_1330_);
	int i_1345_ = i_1342_ - (i_1339_ << i_1330_);
	int i_1346_ = i_1340_ + (i_1337_ << i_1330_);
	int i_1347_ = i_1341_ + (i_1338_ << i_1330_);
	int i_1348_ = i_1342_ + (i_1339_ << i_1330_);
	((Class157_Sub2) this).anIntArray9173[0] = i_1343_;
	((Class157_Sub2) this).anIntArray9155[0] = i_1344_;
	((Class157_Sub2) this).anIntArray9194[0] = i_1345_;
	((Class157_Sub2) this).anIntArray9173[1] = i_1346_;
	((Class157_Sub2) this).anIntArray9155[1] = i_1344_;
	((Class157_Sub2) this).anIntArray9194[1] = i_1345_;
	((Class157_Sub2) this).anIntArray9173[2] = i_1343_;
	((Class157_Sub2) this).anIntArray9155[2] = i_1347_;
	((Class157_Sub2) this).anIntArray9194[2] = i_1345_;
	((Class157_Sub2) this).anIntArray9173[3] = i_1346_;
	((Class157_Sub2) this).anIntArray9155[3] = i_1347_;
	((Class157_Sub2) this).anIntArray9194[3] = i_1345_;
	((Class157_Sub2) this).anIntArray9173[4] = i_1343_;
	((Class157_Sub2) this).anIntArray9155[4] = i_1344_;
	((Class157_Sub2) this).anIntArray9194[4] = i_1348_;
	((Class157_Sub2) this).anIntArray9173[5] = i_1346_;
	((Class157_Sub2) this).anIntArray9155[5] = i_1344_;
	((Class157_Sub2) this).anIntArray9194[5] = i_1348_;
	((Class157_Sub2) this).anIntArray9173[6] = i_1343_;
	((Class157_Sub2) this).anIntArray9155[6] = i_1347_;
	((Class157_Sub2) this).anIntArray9194[6] = i_1348_;
	((Class157_Sub2) this).anIntArray9173[7] = i_1346_;
	((Class157_Sub2) this).anIntArray9155[7] = i_1347_;
	((Class157_Sub2) this).anIntArray9194[7] = i_1348_;
	for (int i_1349_ = 0; i_1349_ < 8; i_1349_++) {
	    int i_1350_ = ((Class157_Sub2) this).anIntArray9173[i_1349_];
	    int i_1351_ = ((Class157_Sub2) this).anIntArray9155[i_1349_];
	    int i_1352_ = ((Class157_Sub2) this).anIntArray9194[i_1349_];
	    float f = (class418_1331_.aFloatArray4768[2] * (float) i_1350_
		       + class418_1331_.aFloatArray4768[6] * (float) i_1351_
		       + class418_1331_.aFloatArray4768[10] * (float) i_1352_
		       + class418_1331_.aFloatArray4768[14]);
	    float f_1353_
		= (class418_1331_.aFloatArray4768[3] * (float) i_1350_
		   + class418_1331_.aFloatArray4768[7] * (float) i_1351_
		   + class418_1331_.aFloatArray4768[11] * (float) i_1352_
		   + class418_1331_.aFloatArray4768[15]);
	    if (f >= -f_1353_) {
		float f_1354_
		    = (class418_1331_.aFloatArray4768[0] * (float) i_1350_
		       + class418_1331_.aFloatArray4768[4] * (float) i_1351_
		       + class418_1331_.aFloatArray4768[8] * (float) i_1352_
		       + class418_1331_.aFloatArray4768[12]);
		float f_1355_
		    = (class418_1331_.aFloatArray4768[1] * (float) i_1350_
		       + class418_1331_.aFloatArray4768[5] * (float) i_1351_
		       + class418_1331_.aFloatArray4768[9] * (float) i_1352_
		       + class418_1331_.aFloatArray4768[13]);
		int i_1356_
		    = (int) ((((Class173_Sub3)
			       ((Class157_Sub2) this).aClass173_Sub3_9130)
			      .aFloat9743)
			     + (((Class173_Sub3)
				 ((Class157_Sub2) this).aClass173_Sub3_9130)
				.aFloat9742) * f_1354_ / f_1353_);
		int i_1357_
		    = (int) ((((Class173_Sub3)
			       ((Class157_Sub2) this).aClass173_Sub3_9130)
			      .aFloat9751)
			     + (((Class173_Sub3)
				 ((Class157_Sub2) this).aClass173_Sub3_9130)
				.aFloat9744) * f_1355_ / f_1353_);
		if (i_1356_ < i_1333_)
		    i_1333_ = i_1356_;
		if (i_1356_ > i_1334_)
		    i_1334_ = i_1356_;
		if (i_1357_ < i_1335_)
		    i_1335_ = i_1357_;
		if (i_1357_ > i_1336_)
		    i_1336_ = i_1357_;
		bool_1332_ = true;
	    }
	}
	if (bool_1332_ && i > i_1333_ && i < i_1334_ && i_1329_ > i_1335_
	    && i_1329_ < i_1336_) {
	    if (bool)
		return true;
	    for (int i_1358_ = 0; i_1358_ < ((Class157_Sub2) this).anInt9135;
		 i_1358_++) {
		int i_1359_ = ((Class157_Sub2) this).anIntArray9203[i_1358_];
		int i_1360_ = ((Class157_Sub2) this).anIntArray9204[i_1358_];
		int i_1361_ = ((Class157_Sub2) this).anIntArray9177[i_1358_];
		float f
		    = (class418_1331_.aFloatArray4768[2] * (float) i_1359_
		       + class418_1331_.aFloatArray4768[6] * (float) i_1360_
		       + class418_1331_.aFloatArray4768[10] * (float) i_1361_
		       + class418_1331_.aFloatArray4768[14]);
		float f_1362_
		    = (class418_1331_.aFloatArray4768[3] * (float) i_1359_
		       + class418_1331_.aFloatArray4768[7] * (float) i_1360_
		       + class418_1331_.aFloatArray4768[11] * (float) i_1361_
		       + class418_1331_.aFloatArray4768[15]);
		if (f >= -f_1362_) {
		    float f_1363_
			= (class418_1331_.aFloatArray4768[0] * (float) i_1359_
			   + (class418_1331_.aFloatArray4768[4]
			      * (float) i_1360_)
			   + (class418_1331_.aFloatArray4768[8]
			      * (float) i_1361_)
			   + class418_1331_.aFloatArray4768[12]);
		    float f_1364_
			= (class418_1331_.aFloatArray4768[1] * (float) i_1359_
			   + (class418_1331_.aFloatArray4768[5]
			      * (float) i_1360_)
			   + (class418_1331_.aFloatArray4768[9]
			      * (float) i_1361_)
			   + class418_1331_.aFloatArray4768[13]);
		    ((Class157_Sub2) this).aFloatArray9126[i_1358_]
			= (float) (int) (((Class173_Sub3)
					  (((Class157_Sub2) this)
					   .aClass173_Sub3_9130)).aFloat9743
					 + (((Class173_Sub3)
					     (((Class157_Sub2) this)
					      .aClass173_Sub3_9130)).aFloat9742
					    * f_1363_ / f_1362_));
		    ((Class157_Sub2) this).aFloatArray9119[i_1358_]
			= (float) (int) (((Class173_Sub3)
					  (((Class157_Sub2) this)
					   .aClass173_Sub3_9130)).aFloat9751
					 + (((Class173_Sub3)
					     (((Class157_Sub2) this)
					      .aClass173_Sub3_9130)).aFloat9744
					    * f_1364_ / f_1362_));
		} else
		    ((Class157_Sub2) this).aFloatArray9126[i_1358_]
			= -999999.0F;
	    }
	    for (int i_1365_ = 0; i_1365_ < ((Class157_Sub2) this).anInt9198;
		 i_1365_++) {
		if (((((Class157_Sub2) this).aFloatArray9126
		      [((Class157_Sub2) this).aShortArray9145[i_1365_]])
		     != -999999.0F)
		    && ((((Class157_Sub2) this).aFloatArray9126
			 [((Class157_Sub2) this).aShortArray9146[i_1365_]])
			!= -999999.0F)
		    && ((((Class157_Sub2) this).aFloatArray9126
			 [((Class157_Sub2) this).aShortArray9147[i_1365_]])
			!= -999999.0F)
		    && (method8412
			(i, i_1329_,
			 (((Class157_Sub2) this).aFloatArray9119
			  [((Class157_Sub2) this).aShortArray9145[i_1365_]]),
			 (((Class157_Sub2) this).aFloatArray9119
			  [((Class157_Sub2) this).aShortArray9146[i_1365_]]),
			 (((Class157_Sub2) this).aFloatArray9119
			  [((Class157_Sub2) this).aShortArray9147[i_1365_]]),
			 (((Class157_Sub2) this).aFloatArray9126
			  [((Class157_Sub2) this).aShortArray9145[i_1365_]]),
			 (((Class157_Sub2) this).aFloatArray9126
			  [((Class157_Sub2) this).aShortArray9146[i_1365_]]),
			 (((Class157_Sub2) this).aFloatArray9126
			  [((Class157_Sub2) this).aShortArray9147[i_1365_]]))))
		    return true;
	    }
	}
	return false;
    }
    
    public void method1968(Class433 class433) {
	method8401(((Class157_Sub2) this).aClass173_Sub3_9130
		       .method8939(Thread.currentThread()));
	Class418 class418 = (((Class107) ((Class157_Sub2) this).aClass107_9121)
			     .aClass418_1319);
	class418.method5035(class433);
	if (((Class157_Sub2) this).aClass170Array9122 != null) {
	    for (int i = 0;
		 i < ((Class157_Sub2) this).aClass170Array9122.length; i++) {
		Class170 class170
		    = ((Class157_Sub2) this).aClass170Array9122[i];
		Class170 class170_1366_ = class170;
		if (class170.aClass170_1958 != null)
		    class170_1366_ = class170.aClass170_1958;
		class170_1366_.anInt1950
		    = ((int) (class418.aFloatArray4768[12]
			      + ((class418.aFloatArray4768[0]
				  * (float) (((Class157_Sub2) this)
					     .anIntArray9203
					     [(class170.anInt1946
					       * 1977387945)]))
				 + (class418.aFloatArray4768[4]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9204
					       [(class170.anInt1946
						 * 1977387945)]))
				 + (class418.aFloatArray4768[8]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9177
					       [(class170.anInt1946
						 * 1977387945)]))))
		       * -1626668665);
		class170_1366_.anInt1951
		    = ((int) (class418.aFloatArray4768[13]
			      + ((class418.aFloatArray4768[1]
				  * (float) (((Class157_Sub2) this)
					     .anIntArray9203
					     [(class170.anInt1946
					       * 1977387945)]))
				 + (class418.aFloatArray4768[5]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9204
					       [(class170.anInt1946
						 * 1977387945)]))
				 + (class418.aFloatArray4768[9]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9177
					       [(class170.anInt1946
						 * 1977387945)]))))
		       * -1756604589);
		class170_1366_.anInt1952
		    = (int) (class418.aFloatArray4768[14]
			     + ((class418.aFloatArray4768[2]
				 * (float) (((Class157_Sub2) this)
					    .anIntArray9203
					    [class170.anInt1946 * 1977387945]))
				+ (class418.aFloatArray4768[6]
				   * (float) (((Class157_Sub2) this)
					      .anIntArray9204
					      [(class170.anInt1946
						* 1977387945)]))
				+ (class418.aFloatArray4768[10]
				   * (float) (((Class157_Sub2) this)
					      .anIntArray9177
					      [(class170.anInt1946
						* 1977387945)])))) * 908623173;
		class170_1366_.anInt1947
		    = ((int) (class418.aFloatArray4768[12]
			      + ((class418.aFloatArray4768[0]
				  * (float) (((Class157_Sub2) this)
					     .anIntArray9203
					     [(class170.anInt1945
					       * -1790775395)]))
				 + (class418.aFloatArray4768[4]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9204
					       [(class170.anInt1945
						 * -1790775395)]))
				 + (class418.aFloatArray4768[8]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9177
					       [(class170.anInt1945
						 * -1790775395)]))))
		       * -203979893);
		class170_1366_.anInt1944
		    = ((int) (class418.aFloatArray4768[13]
			      + ((class418.aFloatArray4768[1]
				  * (float) (((Class157_Sub2) this)
					     .anIntArray9203
					     [(class170.anInt1945
					       * -1790775395)]))
				 + (class418.aFloatArray4768[5]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9204
					       [(class170.anInt1945
						 * -1790775395)]))
				 + (class418.aFloatArray4768[9]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9177
					       [(class170.anInt1945
						 * -1790775395)]))))
		       * 1630459257);
		class170_1366_.anInt1955
		    = ((int) (class418.aFloatArray4768[14]
			      + ((class418.aFloatArray4768[2]
				  * (float) (((Class157_Sub2) this)
					     .anIntArray9203
					     [(class170.anInt1945
					       * -1790775395)]))
				 + (class418.aFloatArray4768[6]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9204
					       [(class170.anInt1945
						 * -1790775395)]))
				 + (class418.aFloatArray4768[10]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9177
					       [(class170.anInt1945
						 * -1790775395)]))))
		       * 1543452655);
		class170_1366_.anInt1956
		    = (int) (class418.aFloatArray4768[12]
			     + ((class418.aFloatArray4768[0]
				 * (float) (((Class157_Sub2) this)
					    .anIntArray9203
					    [class170.anInt1948 * 248261743]))
				+ (class418.aFloatArray4768[4]
				   * (float) (((Class157_Sub2) this)
					      .anIntArray9204
					      [(class170.anInt1948
						* 248261743)]))
				+ (class418.aFloatArray4768[8]
				   * (float) (((Class157_Sub2) this)
					      .anIntArray9177
					      [(class170.anInt1948
						* 248261743)])))) * 271456581;
		class170_1366_.anInt1953
		    = (int) (class418.aFloatArray4768[13]
			     + ((class418.aFloatArray4768[1]
				 * (float) (((Class157_Sub2) this)
					    .anIntArray9203
					    [class170.anInt1948 * 248261743]))
				+ (class418.aFloatArray4768[5]
				   * (float) (((Class157_Sub2) this)
					      .anIntArray9204
					      [(class170.anInt1948
						* 248261743)]))
				+ (class418.aFloatArray4768[9]
				   * (float) (((Class157_Sub2) this)
					      .anIntArray9177
					      [(class170.anInt1948
						* 248261743)])))) * 707964019;
		class170_1366_.anInt1943
		    = (int) (class418.aFloatArray4768[14]
			     + ((class418.aFloatArray4768[2]
				 * (float) (((Class157_Sub2) this)
					    .anIntArray9203
					    [class170.anInt1948 * 248261743]))
				+ (class418.aFloatArray4768[6]
				   * (float) (((Class157_Sub2) this)
					      .anIntArray9204
					      [(class170.anInt1948
						* 248261743)]))
				+ (class418.aFloatArray4768[10]
				   * (float) (((Class157_Sub2) this)
					      .anIntArray9177
					      [(class170.anInt1948
						* 248261743)])))) * -674151113;
	    }
	}
	if (((Class157_Sub2) this).aClass144Array9125 != null) {
	    for (int i = 0;
		 i < ((Class157_Sub2) this).aClass144Array9125.length; i++) {
		Class144 class144
		    = ((Class157_Sub2) this).aClass144Array9125[i];
		Class144 class144_1367_ = class144;
		if (class144.aClass144_1646 != null)
		    class144_1367_ = class144.aClass144_1646;
		if (class144.aClass418_1645 != null)
		    class144.aClass418_1645.method4986(class418);
		else
		    class144.aClass418_1645 = new Class418(class418);
		class144_1367_.anInt1648
		    = ((int) (class418.aFloatArray4768[12]
			      + ((class418.aFloatArray4768[0]
				  * (float) (((Class157_Sub2) this)
					     .anIntArray9203
					     [(class144.anInt1651
					       * 1842630443)]))
				 + (class418.aFloatArray4768[4]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9204
					       [(class144.anInt1651
						 * 1842630443)]))
				 + (class418.aFloatArray4768[8]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9177
					       [(class144.anInt1651
						 * 1842630443)]))))
		       * -1931908895);
		class144_1367_.anInt1649
		    = ((int) (class418.aFloatArray4768[13]
			      + ((class418.aFloatArray4768[1]
				  * (float) (((Class157_Sub2) this)
					     .anIntArray9203
					     [(class144.anInt1651
					       * 1842630443)]))
				 + (class418.aFloatArray4768[5]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9204
					       [(class144.anInt1651
						 * 1842630443)]))
				 + (class418.aFloatArray4768[9]
				    * (float) (((Class157_Sub2) this)
					       .anIntArray9177
					       [(class144.anInt1651
						 * 1842630443)]))))
		       * -1055365151);
		class144_1367_.anInt1650
		    = (int) (class418.aFloatArray4768[14]
			     + ((class418.aFloatArray4768[2]
				 * (float) (((Class157_Sub2) this)
					    .anIntArray9203
					    [class144.anInt1651 * 1842630443]))
				+ (class418.aFloatArray4768[6]
				   * (float) (((Class157_Sub2) this)
					      .anIntArray9204
					      [(class144.anInt1651
						* 1842630443)]))
				+ (class418.aFloatArray4768[10]
				   * (float) (((Class157_Sub2) this)
					      .anIntArray9177
					      [(class144.anInt1651
						* 1842630443)])))) * 870317833;
	    }
	}
    }
    
    public Class528_Sub21_Sub12 method1969
	(Class528_Sub21_Sub12 class528_sub21_sub12) {
	return null;
    }
    
    public Class528_Sub21_Sub12 method1970
	(Class528_Sub21_Sub12 class528_sub21_sub12) {
	return null;
    }
    
    public int method2020() {
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	return ((Class157_Sub2) this).aShort9181;
    }
    
    public int method1882() {
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	return ((Class157_Sub2) this).aShort9185;
    }
    
    public int method1983() {
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	return ((Class157_Sub2) this).aShort9180;
    }
    
    public int method1975() {
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	return ((Class157_Sub2) this).aShort9184;
    }
    
    public void method1995(int i) {
	if ((((Class157_Sub2) this).anInt9132 & 0x3) != 3)
	    throw new IllegalStateException();
	int i_1368_ = Class417.anIntArray4766[i];
	int i_1369_ = Class417.anIntArray4767[i];
	synchronized (this) {
	    for (int i_1370_ = 0; i_1370_ < ((Class157_Sub2) this).anInt9135;
		 i_1370_++) {
		int i_1371_
		    = (((Class157_Sub2) this).anIntArray9204[i_1370_] * i_1368_
		       + (((Class157_Sub2) this).anIntArray9203[i_1370_]
			  * i_1369_)) >> 14;
		((Class157_Sub2) this).anIntArray9204[i_1370_]
		    = (((Class157_Sub2) this).anIntArray9204[i_1370_] * i_1369_
		       - (((Class157_Sub2) this).anIntArray9203[i_1370_]
			  * i_1368_)) >> 14;
		((Class157_Sub2) this).anIntArray9203[i_1370_] = i_1371_;
	    }
	    method8411();
	}
    }
    
    public int method1977() {
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	return ((Class157_Sub2) this).aShort9184;
    }
    
    public int method1976() {
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	return ((Class157_Sub2) this).aShort9184;
    }
    
    public int method1980() {
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	return ((Class157_Sub2) this).aShort9182;
    }
    
    public int method1981() {
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	return ((Class157_Sub2) this).aShort9182;
    }
    
    public int method1982() {
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	return ((Class157_Sub2) this).aShort9186;
    }
    
    public int method1949() {
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	return ((Class157_Sub2) this).aShort9186;
    }
    
    public Class144[] method2033() {
	return ((Class157_Sub2) this).aClass144Array9125;
    }
    
    public int method1891() {
	if (!((Class157_Sub2) this).aBool9187)
	    method1909();
	return ((Class157_Sub2) this).aShort9189;
    }
    
    public void method1989(int i) {
	if ((((Class157_Sub2) this).anInt9132 & 0x2000) != 8192)
	    throw new IllegalStateException();
	((Class157_Sub2) this).anInt9134 = i;
	((Class157_Sub2) this).anInt9152 = 0;
    }
    
    public int method1896() {
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	return ((Class157_Sub2) this).aShort9144;
    }
    
    public void method1935() {
	/* empty */
    }
    
    public int method1930() {
	return ((Class157_Sub2) this).anInt9132;
    }
    
    public void method1991(int i) {
	if ((((Class157_Sub2) this).anInt9132 & 0x2000) != 8192)
	    throw new IllegalStateException();
	((Class157_Sub2) this).anInt9134 = i;
	((Class157_Sub2) this).anInt9152 = 0;
    }
    
    public int method1992() {
	return ((Class157_Sub2) this).anInt9133;
    }
    
    public int method1898() {
	return ((Class157_Sub2) this).anInt9133;
    }
    
    public void method1939(int i) {
	if ((((Class157_Sub2) this).anInt9132 & 0xd) != 13)
	    throw new IllegalStateException();
	if (((Class157_Sub2) this).aClass103Array9141 != null) {
	    if (i == 4096)
		method8410();
	    else if (i == 8192)
		method8408();
	    else if (i == 12288)
		method8409();
	    else {
		int i_1372_ = Class417.anIntArray4766[i];
		int i_1373_ = Class417.anIntArray4767[i];
		synchronized (this) {
		    for (int i_1374_ = 0;
			 i_1374_ < ((Class157_Sub2) this).anInt9136;
			 i_1374_++) {
			int i_1375_
			    = (((((Class157_Sub2) this).anIntArray9177[i_1374_]
				 * i_1372_)
				+ (((Class157_Sub2) this).anIntArray9203
				   [i_1374_]) * i_1373_)
			       >> 14);
			((Class157_Sub2) this).anIntArray9177[i_1374_]
			    = ((((Class157_Sub2) this).anIntArray9177[i_1374_]
				* i_1373_)
			       - (((Class157_Sub2) this).anIntArray9203
				  [i_1374_]) * i_1372_) >> 14;
			((Class157_Sub2) this).anIntArray9203[i_1374_]
			    = i_1375_;
			if (((Class157_Sub2) this).aClass103Array9141[i_1374_]
			    != null) {
			    i_1375_
				= ((((Class103) (((Class157_Sub2) this)
						 .aClass103Array9141[i_1374_]))
				    .anInt1299) * i_1372_
				   + (((Class103) (((Class157_Sub2) this)
						   .aClass103Array9141
						   [i_1374_])).anInt1300
				      * i_1373_)) >> 14;
			    ((Class103) (((Class157_Sub2) this)
					 .aClass103Array9141
					 [i_1374_])).anInt1299
				= ((((Class103) (((Class157_Sub2) this)
						 .aClass103Array9141[i_1374_]))
				    .anInt1299) * i_1373_
				   - (((Class103) (((Class157_Sub2) this)
						   .aClass103Array9141
						   [i_1374_])).anInt1300
				      * i_1372_)) >> 14;
			    ((Class103) (((Class157_Sub2) this)
					 .aClass103Array9141
					 [i_1374_])).anInt1300
				= i_1375_;
			}
		    }
		    if (((Class157_Sub2) this).aClass104Array9196 != null) {
			for (int i_1376_ = 0;
			     i_1376_ < ((Class157_Sub2) this).anInt9143;
			     i_1376_++) {
			    if ((((Class157_Sub2) this).aClass104Array9196
				 [i_1376_])
				!= null) {
				int i_1377_
				    = (((((Class104) (((Class157_Sub2) this)
						      .aClass104Array9196
						      [i_1376_])).anInt1307
					 * i_1372_)
					+ (((Class104) (((Class157_Sub2) this)
							.aClass104Array9196
							[i_1376_])).anInt1305
					   * i_1373_))
				       >> 14);
				((Class104) (((Class157_Sub2) this)
					     .aClass104Array9196
					     [i_1376_])).anInt1307
				    = ((((Class104) (((Class157_Sub2) this)
						     .aClass104Array9196
						     [i_1376_])).anInt1307
					* i_1373_)
				       - (((Class104) (((Class157_Sub2) this)
						       .aClass104Array9196
						       [i_1376_])).anInt1305
					  * i_1372_)) >> 14;
				((Class104) (((Class157_Sub2) this)
					     .aClass104Array9196
					     [i_1376_])).anInt1305
				    = i_1377_;
			    }
			}
		    }
		    for (int i_1378_ = ((Class157_Sub2) this).anInt9136;
			 i_1378_ < ((Class157_Sub2) this).anInt9135;
			 i_1378_++) {
			int i_1379_
			    = (((((Class157_Sub2) this).anIntArray9177[i_1378_]
				 * i_1372_)
				+ (((Class157_Sub2) this).anIntArray9203
				   [i_1378_]) * i_1373_)
			       >> 14);
			((Class157_Sub2) this).anIntArray9177[i_1378_]
			    = ((((Class157_Sub2) this).anIntArray9177[i_1378_]
				* i_1373_)
			       - (((Class157_Sub2) this).anIntArray9203
				  [i_1378_]) * i_1372_) >> 14;
			((Class157_Sub2) this).anIntArray9203[i_1378_]
			    = i_1379_;
		    }
		    ((Class157_Sub2) this).anInt9152 = 0;
		    ((Class157_Sub2) this).aBool9179 = false;
		}
	    }
	} else
	    method1878(i);
    }
    
    public byte[] method1911() {
	return ((Class157_Sub2) this).aByteArray9160;
    }
    
    public Class170[] method2008() {
	return ((Class157_Sub2) this).aClass170Array9122;
    }
    
    public void method1997(byte i, byte[] is) {
	if ((((Class157_Sub2) this).anInt9132 & 0x100000) == 0)
	    throw new RuntimeException();
	if (((Class157_Sub2) this).aByteArray9160 == null)
	    ((Class157_Sub2) this).aByteArray9160
		= new byte[((Class157_Sub2) this).anInt9143];
	if (is == null) {
	    for (int i_1380_ = 0; i_1380_ < ((Class157_Sub2) this).anInt9143;
		 i_1380_++)
		((Class157_Sub2) this).aByteArray9160[i_1380_] = i;
	} else {
	    for (int i_1381_ = 0; i_1381_ < ((Class157_Sub2) this).anInt9143;
		 i_1381_++) {
		int i_1382_ = 255 - ((255 - (is[i_1381_] & 0xff))
				     * (255 - (i & 0xff)) / 255);
		((Class157_Sub2) this).aByteArray9160[i_1381_]
		    = (byte) i_1382_;
	    }
	}
	if (((Class157_Sub2) this).anInt9152 == 2)
	    ((Class157_Sub2) this).anInt9152 = 1;
    }
    
    public void method1998(byte i, byte[] is) {
	if ((((Class157_Sub2) this).anInt9132 & 0x100000) == 0)
	    throw new RuntimeException();
	if (((Class157_Sub2) this).aByteArray9160 == null)
	    ((Class157_Sub2) this).aByteArray9160
		= new byte[((Class157_Sub2) this).anInt9143];
	if (is == null) {
	    for (int i_1383_ = 0; i_1383_ < ((Class157_Sub2) this).anInt9143;
		 i_1383_++)
		((Class157_Sub2) this).aByteArray9160[i_1383_] = i;
	} else {
	    for (int i_1384_ = 0; i_1384_ < ((Class157_Sub2) this).anInt9143;
		 i_1384_++) {
		int i_1385_ = 255 - ((255 - (is[i_1384_] & 0xff))
				     * (255 - (i & 0xff)) / 255);
		((Class157_Sub2) this).aByteArray9160[i_1384_]
		    = (byte) i_1385_;
	    }
	}
	if (((Class157_Sub2) this).anInt9152 == 2)
	    ((Class157_Sub2) this).anInt9152 = 1;
    }
    
    public void method1908(int i) {
	if ((((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
	     .anInt9745) * -1585405167
	    > 1) {
	    synchronized (this) {
		if ((((Class157_Sub2) this).anInt9132 & 0x10000) == 65536
		    && (i & 0x10000) == 0)
		    method8402(true);
		((Class157_Sub2) this).anInt9132 = i;
	    }
	} else {
	    if ((((Class157_Sub2) this).anInt9132 & 0x10000) == 65536
		&& (i & 0x10000) == 0)
		method8402(true);
	    ((Class157_Sub2) this).anInt9132 = i;
	}
    }
    
    public void method1924(short i, short i_1386_) {
	if (((Class157_Sub2) this).aShortArray9205 != null) {
	    if (!((Class157_Sub2) this).aBool9199 && i_1386_ >= 0) {
		Class160 class160
		    = ((Class157_Sub2) this).aClass173_Sub3_9130
			  .aClass165_1984
			  .method2093(i_1386_ & 0xffff, (byte) -66);
		if (class160.aByte1775 != 0 || class160.aByte1776 != 0)
		    ((Class157_Sub2) this).aBool9199 = true;
	    }
	    for (int i_1387_ = 0; i_1387_ < ((Class157_Sub2) this).anInt9143;
		 i_1387_++) {
		if (((Class157_Sub2) this).aShortArray9205[i_1387_] == i)
		    ((Class157_Sub2) this).aShortArray9205[i_1387_] = i_1386_;
	    }
	}
    }
    
    public void method1916(short i, short i_1388_) {
	if (((Class157_Sub2) this).aShortArray9205 != null) {
	    if (!((Class157_Sub2) this).aBool9199 && i_1388_ >= 0) {
		Class160 class160
		    = ((Class157_Sub2) this).aClass173_Sub3_9130
			  .aClass165_1984
			  .method2093(i_1388_ & 0xffff, (byte) -120);
		if (class160.aByte1775 != 0 || class160.aByte1776 != 0)
		    ((Class157_Sub2) this).aBool9199 = true;
	    }
	    for (int i_1389_ = 0; i_1389_ < ((Class157_Sub2) this).anInt9143;
		 i_1389_++) {
		if (((Class157_Sub2) this).aShortArray9205[i_1389_] == i)
		    ((Class157_Sub2) this).aShortArray9205[i_1389_] = i_1388_;
	    }
	}
    }
    
    public void method2036(short i, short i_1390_) {
	if (((Class157_Sub2) this).aShortArray9205 != null) {
	    if (!((Class157_Sub2) this).aBool9199 && i_1390_ >= 0) {
		Class160 class160
		    = ((Class157_Sub2) this).aClass173_Sub3_9130
			  .aClass165_1984
			  .method2093(i_1390_ & 0xffff, (byte) -39);
		if (class160.aByte1775 != 0 || class160.aByte1776 != 0)
		    ((Class157_Sub2) this).aBool9199 = true;
	    }
	    for (int i_1391_ = 0; i_1391_ < ((Class157_Sub2) this).anInt9143;
		 i_1391_++) {
		if (((Class157_Sub2) this).aShortArray9205[i_1391_] == i)
		    ((Class157_Sub2) this).aShortArray9205[i_1391_] = i_1390_;
	    }
	}
    }
    
    public void method2003(short i, short i_1392_) {
	if (((Class157_Sub2) this).aShortArray9205 != null) {
	    if (!((Class157_Sub2) this).aBool9199 && i_1392_ >= 0) {
		Class160 class160
		    = ((Class157_Sub2) this).aClass173_Sub3_9130
			  .aClass165_1984
			  .method2093(i_1392_ & 0xffff, (byte) -100);
		if (class160.aByte1775 != 0 || class160.aByte1776 != 0)
		    ((Class157_Sub2) this).aBool9199 = true;
	    }
	    for (int i_1393_ = 0; i_1393_ < ((Class157_Sub2) this).anInt9143;
		 i_1393_++) {
		if (((Class157_Sub2) this).aShortArray9205[i_1393_] == i)
		    ((Class157_Sub2) this).aShortArray9205[i_1393_] = i_1392_;
	    }
	}
    }
    
    public void method2024(int i, int i_1394_, int i_1395_, int i_1396_) {
	if ((((Class157_Sub2) this).anInt9132 & 0x80000) != 524288)
	    throw new IllegalStateException();
	for (int i_1397_ = 0; i_1397_ < ((Class157_Sub2) this).anInt9143;
	     i_1397_++) {
	    int i_1398_
		= ((Class157_Sub2) this).aShortArray9162[i_1397_] & 0xffff;
	    int i_1399_ = i_1398_ >> 10 & 0x3f;
	    int i_1400_ = i_1398_ >> 7 & 0x7;
	    int i_1401_ = i_1398_ & 0x7f;
	    if (i != -1)
		i_1399_ += (i - i_1399_) * i_1396_ >> 7;
	    if (i_1394_ != -1)
		i_1400_ += (i_1394_ - i_1400_) * i_1396_ >> 7;
	    if (i_1395_ != -1)
		i_1401_ += (i_1395_ - i_1401_) * i_1396_ >> 7;
	    ((Class157_Sub2) this).aShortArray9162[i_1397_]
		= (short) (i_1399_ << 10 | i_1400_ << 7 | i_1401_);
	}
	if (((Class157_Sub2) this).aClass90Array9156 != null) {
	    for (int i_1402_ = 0; i_1402_ < ((Class157_Sub2) this).anInt9175;
		 i_1402_++) {
		Class90 class90
		    = ((Class157_Sub2) this).aClass90Array9156[i_1402_];
		Class108 class108
		    = ((Class157_Sub2) this).aClass108Array9123[i_1402_];
		((Class108) class108).anInt1368
		    = ((((Class108) class108).anInt1368 * -1351793475
			& ~0xffffff)
		       | ((Class72.anIntArray777
			   [Class516.method6283(((((Class157_Sub2) this)
						  .aShortArray9162
						  [(((Class90) class90)
						    .anInt1142) * 1037728387])
						 & 0xffff),
						515814180) & 0xffff])
			  & 0xffffff)) * 323344021;
	    }
	}
	if (((Class157_Sub2) this).anInt9152 == 2)
	    ((Class157_Sub2) this).anInt9152 = 1;
    }
    
    public void method2037(int i, int i_1403_, int i_1404_, int i_1405_) {
	if ((((Class157_Sub2) this).anInt9132 & 0x80000) != 524288)
	    throw new IllegalStateException();
	for (int i_1406_ = 0; i_1406_ < ((Class157_Sub2) this).anInt9143;
	     i_1406_++) {
	    int i_1407_
		= ((Class157_Sub2) this).aShortArray9162[i_1406_] & 0xffff;
	    int i_1408_ = i_1407_ >> 10 & 0x3f;
	    int i_1409_ = i_1407_ >> 7 & 0x7;
	    int i_1410_ = i_1407_ & 0x7f;
	    if (i != -1)
		i_1408_ += (i - i_1408_) * i_1405_ >> 7;
	    if (i_1403_ != -1)
		i_1409_ += (i_1403_ - i_1409_) * i_1405_ >> 7;
	    if (i_1404_ != -1)
		i_1410_ += (i_1404_ - i_1410_) * i_1405_ >> 7;
	    ((Class157_Sub2) this).aShortArray9162[i_1406_]
		= (short) (i_1408_ << 10 | i_1409_ << 7 | i_1410_);
	}
	if (((Class157_Sub2) this).aClass90Array9156 != null) {
	    for (int i_1411_ = 0; i_1411_ < ((Class157_Sub2) this).anInt9175;
		 i_1411_++) {
		Class90 class90
		    = ((Class157_Sub2) this).aClass90Array9156[i_1411_];
		Class108 class108
		    = ((Class157_Sub2) this).aClass108Array9123[i_1411_];
		((Class108) class108).anInt1368
		    = ((((Class108) class108).anInt1368 * -1351793475
			& ~0xffffff)
		       | ((Class72.anIntArray777
			   [Class516.method6283(((((Class157_Sub2) this)
						  .aShortArray9162
						  [(((Class90) class90)
						    .anInt1142) * 1037728387])
						 & 0xffff),
						515814180) & 0xffff])
			  & 0xffffff)) * 323344021;
	    }
	}
	if (((Class157_Sub2) this).anInt9152 == 2)
	    ((Class157_Sub2) this).anInt9152 = 1;
    }
    
    Class157 method8439(Class157_Sub2 class157_sub2_1412_,
			Class157_Sub2 class157_sub2_1413_, int i, boolean bool,
			boolean bool_1414_) {
	((Class157_Sub2) class157_sub2_1412_).aBool9179
	    = ((Class157_Sub2) this).aBool9179;
	if (((Class157_Sub2) this).aBool9179) {
	    ((Class157_Sub2) class157_sub2_1412_).aShort9185
		= ((Class157_Sub2) this).aShort9185;
	    ((Class157_Sub2) class157_sub2_1412_).aShort9183
		= ((Class157_Sub2) this).aShort9183;
	    ((Class157_Sub2) class157_sub2_1412_).aShort9144
		= ((Class157_Sub2) this).aShort9144;
	    ((Class157_Sub2) class157_sub2_1412_).aShort9184
		= ((Class157_Sub2) this).aShort9184;
	    ((Class157_Sub2) class157_sub2_1412_).aShort9182
		= ((Class157_Sub2) this).aShort9182;
	    ((Class157_Sub2) class157_sub2_1412_).aShort9186
		= ((Class157_Sub2) this).aShort9186;
	    ((Class157_Sub2) class157_sub2_1412_).aShort9180
		= ((Class157_Sub2) this).aShort9180;
	    ((Class157_Sub2) class157_sub2_1412_).aShort9181
		= ((Class157_Sub2) this).aShort9181;
	}
	if (((Class157_Sub2) this).aBool9187) {
	    ((Class157_Sub2) class157_sub2_1412_).aShort9189
		= ((Class157_Sub2) this).aShort9189;
	    ((Class157_Sub2) class157_sub2_1412_).aBool9187 = true;
	} else
	    ((Class157_Sub2) class157_sub2_1412_).aBool9187 = false;
	((Class157_Sub2) class157_sub2_1412_).anInt9133
	    = ((Class157_Sub2) this).anInt9133;
	((Class157_Sub2) class157_sub2_1412_).anInt9134
	    = ((Class157_Sub2) this).anInt9134;
	((Class157_Sub2) class157_sub2_1412_).anInt9135
	    = ((Class157_Sub2) this).anInt9135;
	((Class157_Sub2) class157_sub2_1412_).anInt9136
	    = ((Class157_Sub2) this).anInt9136;
	((Class157_Sub2) class157_sub2_1412_).anInt9143
	    = ((Class157_Sub2) this).anInt9143;
	((Class157_Sub2) class157_sub2_1412_).anInt9175
	    = ((Class157_Sub2) this).anInt9175;
	((Class157_Sub2) class157_sub2_1412_).anInt9198
	    = ((Class157_Sub2) this).anInt9198;
	if ((i & 0x100) != 0)
	    ((Class157_Sub2) class157_sub2_1412_).aBool9190 = true;
	else
	    ((Class157_Sub2) class157_sub2_1412_).aBool9190
		= ((Class157_Sub2) this).aBool9190;
	((Class157_Sub2) class157_sub2_1412_).aBool9199
	    = ((Class157_Sub2) this).aBool9199;
	boolean bool_1415_ = (i & 0x7) == 7 | (i & 0x20) != 0;
	boolean bool_1416_ = bool_1415_ || (i & 0x1) != 0;
	boolean bool_1417_ = bool_1415_ || (i & 0x2) != 0;
	boolean bool_1418_ = bool_1415_ || (i & 0x4) != 0 || (i & 0x10) != 0;
	if (bool_1416_ || bool_1417_ || bool_1418_) {
	    if (bool_1416_) {
		if ((((Class157_Sub2) class157_sub2_1413_).anIntArray9203
		     == null)
		    || ((((Class157_Sub2) class157_sub2_1413_)
			 .anIntArray9203).length
			< ((Class157_Sub2) this).anInt9135))
		    ((Class157_Sub2) class157_sub2_1412_).anIntArray9203
			= ((Class157_Sub2) class157_sub2_1413_).anIntArray9203
			= new int[((Class157_Sub2) this).anInt9135];
		else
		    ((Class157_Sub2) class157_sub2_1412_).anIntArray9203
			= ((Class157_Sub2) class157_sub2_1413_).anIntArray9203;
		for (int i_1419_ = 0;
		     i_1419_ < ((Class157_Sub2) this).anInt9135; i_1419_++)
		    ((Class157_Sub2) class157_sub2_1412_).anIntArray9203
			[i_1419_]
			= ((Class157_Sub2) this).anIntArray9203[i_1419_];
	    } else
		((Class157_Sub2) class157_sub2_1412_).anIntArray9203
		    = ((Class157_Sub2) this).anIntArray9203;
	    if (bool_1417_) {
		if ((((Class157_Sub2) class157_sub2_1413_).anIntArray9204
		     == null)
		    || ((((Class157_Sub2) class157_sub2_1413_)
			 .anIntArray9204).length
			< ((Class157_Sub2) this).anInt9135))
		    ((Class157_Sub2) class157_sub2_1412_).anIntArray9204
			= ((Class157_Sub2) class157_sub2_1413_).anIntArray9204
			= new int[((Class157_Sub2) this).anInt9135];
		else
		    ((Class157_Sub2) class157_sub2_1412_).anIntArray9204
			= ((Class157_Sub2) class157_sub2_1413_).anIntArray9204;
		for (int i_1420_ = 0;
		     i_1420_ < ((Class157_Sub2) this).anInt9135; i_1420_++)
		    ((Class157_Sub2) class157_sub2_1412_).anIntArray9204
			[i_1420_]
			= ((Class157_Sub2) this).anIntArray9204[i_1420_];
	    } else
		((Class157_Sub2) class157_sub2_1412_).anIntArray9204
		    = ((Class157_Sub2) this).anIntArray9204;
	    if (bool_1418_) {
		if ((((Class157_Sub2) class157_sub2_1413_).anIntArray9177
		     == null)
		    || ((((Class157_Sub2) class157_sub2_1413_)
			 .anIntArray9177).length
			< ((Class157_Sub2) this).anInt9135))
		    ((Class157_Sub2) class157_sub2_1412_).anIntArray9177
			= ((Class157_Sub2) class157_sub2_1413_).anIntArray9177
			= new int[((Class157_Sub2) this).anInt9135];
		else
		    ((Class157_Sub2) class157_sub2_1412_).anIntArray9177
			= ((Class157_Sub2) class157_sub2_1413_).anIntArray9177;
		for (int i_1421_ = 0;
		     i_1421_ < ((Class157_Sub2) this).anInt9135; i_1421_++)
		    ((Class157_Sub2) class157_sub2_1412_).anIntArray9177
			[i_1421_]
			= ((Class157_Sub2) this).anIntArray9177[i_1421_];
	    } else
		((Class157_Sub2) class157_sub2_1412_).anIntArray9177
		    = ((Class157_Sub2) this).anIntArray9177;
	} else {
	    ((Class157_Sub2) class157_sub2_1412_).anIntArray9203
		= ((Class157_Sub2) this).anIntArray9203;
	    ((Class157_Sub2) class157_sub2_1412_).anIntArray9204
		= ((Class157_Sub2) this).anIntArray9204;
	    ((Class157_Sub2) class157_sub2_1412_).anIntArray9177
		= ((Class157_Sub2) this).anIntArray9177;
	}
	if ((i & 0x84080) != 0) {
	    if (((Class157_Sub2) class157_sub2_1413_).aShortArray9162 == null
		|| ((((Class157_Sub2) class157_sub2_1413_)
		     .aShortArray9162).length
		    < ((Class157_Sub2) this).anInt9143)) {
		int i_1422_ = ((Class157_Sub2) this).anInt9143;
		((Class157_Sub2) class157_sub2_1412_).aShortArray9162
		    = ((Class157_Sub2) class157_sub2_1413_).aShortArray9162
		    = new short[i_1422_];
	    } else
		((Class157_Sub2) class157_sub2_1412_).aShortArray9162
		    = ((Class157_Sub2) class157_sub2_1413_).aShortArray9162;
	    for (int i_1423_ = 0; i_1423_ < ((Class157_Sub2) this).anInt9143;
		 i_1423_++)
		((Class157_Sub2) class157_sub2_1412_).aShortArray9162[i_1423_]
		    = ((Class157_Sub2) this).aShortArray9162[i_1423_];
	} else
	    ((Class157_Sub2) class157_sub2_1412_).aShortArray9162
		= ((Class157_Sub2) this).aShortArray9162;
	if ((i & 0x97018) != 0) {
	    ((Class157_Sub2) class157_sub2_1412_).anInt9152 = 0;
	    Class157_Sub2 class157_sub2_1424_ = class157_sub2_1412_;
	    Class157_Sub2 class157_sub2_1425_ = class157_sub2_1412_;
	    ((Class157_Sub2) class157_sub2_1412_).anIntArray9188 = null;
	    ((Class157_Sub2) class157_sub2_1425_).anIntArray9151 = null;
	    ((Class157_Sub2) class157_sub2_1424_).anIntArray9150 = null;
	} else if ((i & 0x80) != 0) {
	    if (bool_1414_)
		method8402(false);
	    if (((Class157_Sub2) this).anIntArray9150 != null) {
		if ((((Class157_Sub2) class157_sub2_1413_).anIntArray9150
		     == null)
		    || ((((Class157_Sub2) class157_sub2_1413_)
			 .anIntArray9150).length
			< ((Class157_Sub2) this).anInt9143)) {
		    int i_1426_ = ((Class157_Sub2) this).anInt9143;
		    ((Class157_Sub2) class157_sub2_1412_).anIntArray9150
			= ((Class157_Sub2) class157_sub2_1413_).anIntArray9150
			= new int[i_1426_];
		    ((Class157_Sub2) class157_sub2_1412_).anIntArray9151
			= ((Class157_Sub2) class157_sub2_1413_).anIntArray9151
			= new int[i_1426_];
		    ((Class157_Sub2) class157_sub2_1412_).anIntArray9188
			= ((Class157_Sub2) class157_sub2_1413_).anIntArray9188
			= new int[i_1426_];
		} else {
		    ((Class157_Sub2) class157_sub2_1412_).anIntArray9150
			= ((Class157_Sub2) class157_sub2_1413_).anIntArray9150;
		    ((Class157_Sub2) class157_sub2_1412_).anIntArray9151
			= ((Class157_Sub2) class157_sub2_1413_).anIntArray9151;
		    ((Class157_Sub2) class157_sub2_1412_).anIntArray9188
			= ((Class157_Sub2) class157_sub2_1413_).anIntArray9188;
		}
		for (int i_1427_ = 0;
		     i_1427_ < ((Class157_Sub2) this).anInt9143; i_1427_++) {
		    ((Class157_Sub2) class157_sub2_1412_).anIntArray9150
			[i_1427_]
			= ((Class157_Sub2) this).anIntArray9150[i_1427_];
		    ((Class157_Sub2) class157_sub2_1412_).anIntArray9151
			[i_1427_]
			= ((Class157_Sub2) this).anIntArray9151[i_1427_];
		    ((Class157_Sub2) class157_sub2_1412_).anIntArray9188
			[i_1427_]
			= ((Class157_Sub2) this).anIntArray9188[i_1427_];
		}
	    }
	    ((Class157_Sub2) class157_sub2_1412_).anInt9152
		= ((Class157_Sub2) this).anInt9152;
	} else {
	    if (bool_1414_)
		method8402(false);
	    ((Class157_Sub2) class157_sub2_1412_).anIntArray9150
		= ((Class157_Sub2) this).anIntArray9150;
	    ((Class157_Sub2) class157_sub2_1412_).anIntArray9151
		= ((Class157_Sub2) this).anIntArray9151;
	    ((Class157_Sub2) class157_sub2_1412_).anIntArray9188
		= ((Class157_Sub2) this).anIntArray9188;
	    ((Class157_Sub2) class157_sub2_1412_).anInt9152
		= ((Class157_Sub2) this).anInt9152;
	}
	if ((i & 0x100) != 0) {
	    if (((Class157_Sub2) class157_sub2_1413_).aByteArray9160 == null
		|| (((Class157_Sub2) class157_sub2_1413_).aByteArray9160.length
		    < ((Class157_Sub2) this).anInt9143)) {
		int i_1428_ = ((Class157_Sub2) this).anInt9143;
		((Class157_Sub2) class157_sub2_1412_).aByteArray9160
		    = ((Class157_Sub2) class157_sub2_1413_).aByteArray9160
		    = new byte[i_1428_];
	    } else
		((Class157_Sub2) class157_sub2_1412_).aByteArray9160
		    = ((Class157_Sub2) class157_sub2_1413_).aByteArray9160;
	    if (((Class157_Sub2) this).aByteArray9160 != null) {
		for (int i_1429_ = 0;
		     i_1429_ < ((Class157_Sub2) this).anInt9143; i_1429_++)
		    ((Class157_Sub2) class157_sub2_1412_).aByteArray9160
			[i_1429_]
			= ((Class157_Sub2) this).aByteArray9160[i_1429_];
	    } else {
		for (int i_1430_ = 0;
		     i_1430_ < ((Class157_Sub2) this).anInt9143; i_1430_++)
		    ((Class157_Sub2) class157_sub2_1412_).aByteArray9160
			[i_1430_]
			= (byte) 0;
	    }
	} else
	    ((Class157_Sub2) class157_sub2_1412_).aByteArray9160
		= ((Class157_Sub2) this).aByteArray9160;
	if ((i & 0x8) != 0 || (i & 0x10) != 0) {
	    if ((((Class157_Sub2) class157_sub2_1413_).aClass103Array9141
		 == null)
		|| ((((Class157_Sub2) class157_sub2_1413_)
		     .aClass103Array9141).length
		    < ((Class157_Sub2) this).anInt9136)) {
		int i_1431_ = ((Class157_Sub2) this).anInt9136;
		((Class157_Sub2) class157_sub2_1412_).aClass103Array9141
		    = ((Class157_Sub2) class157_sub2_1413_).aClass103Array9141
		    = new Class103[i_1431_];
	    } else
		((Class157_Sub2) class157_sub2_1412_).aClass103Array9141
		    = ((Class157_Sub2) class157_sub2_1413_).aClass103Array9141;
	    if (((Class157_Sub2) this).aClass103Array9141 != null) {
		for (int i_1432_ = 0;
		     i_1432_ < ((Class157_Sub2) this).anInt9136; i_1432_++)
		    ((Class157_Sub2) class157_sub2_1412_)
			.aClass103Array9141[i_1432_]
			= new Class103(((Class157_Sub2) this)
				       .aClass103Array9141[i_1432_]);
	    } else
		((Class157_Sub2) class157_sub2_1412_).aClass103Array9141
		    = null;
	    if (((Class157_Sub2) this).aClass104Array9196 != null) {
		if ((((Class157_Sub2) class157_sub2_1413_).aClass104Array9196
		     == null)
		    || ((((Class157_Sub2) class157_sub2_1413_)
			 .aClass104Array9196).length
			< ((Class157_Sub2) this).anInt9143)) {
		    int i_1433_ = ((Class157_Sub2) this).anInt9143;
		    ((Class157_Sub2) class157_sub2_1412_).aClass104Array9196
			= ((Class157_Sub2) class157_sub2_1413_)
			      .aClass104Array9196
			= new Class104[i_1433_];
		} else
		    ((Class157_Sub2) class157_sub2_1412_).aClass104Array9196
			= (((Class157_Sub2) class157_sub2_1413_)
			   .aClass104Array9196);
		for (int i_1434_ = 0;
		     i_1434_ < ((Class157_Sub2) this).anInt9143; i_1434_++)
		    ((Class157_Sub2) class157_sub2_1412_)
			.aClass104Array9196[i_1434_]
			= ((((Class157_Sub2) this).aClass104Array9196[i_1434_]
			    != null)
			   ? new Class104(((Class157_Sub2) this)
					  .aClass104Array9196[i_1434_])
			   : null);
	    } else
		((Class157_Sub2) class157_sub2_1412_).aClass104Array9196
		    = null;
	} else {
	    if (bool_1414_)
		method8400();
	    ((Class157_Sub2) class157_sub2_1412_).aClass103Array9141
		= ((Class157_Sub2) this).aClass103Array9141;
	    ((Class157_Sub2) class157_sub2_1412_).aClass104Array9196
		= ((Class157_Sub2) this).aClass104Array9196;
	}
	if ((i & 0x8000) != 0) {
	    if (((Class157_Sub2) this).aShortArray9205 == null)
		((Class157_Sub2) class157_sub2_1412_).aShortArray9205 = null;
	    else {
		if ((((Class157_Sub2) class157_sub2_1413_).aShortArray9205
		     == null)
		    || ((((Class157_Sub2) class157_sub2_1413_)
			 .aShortArray9205).length
			< ((Class157_Sub2) this).anInt9143)) {
		    int i_1435_ = ((Class157_Sub2) this).anInt9143;
		    ((Class157_Sub2) class157_sub2_1412_).aShortArray9205
			= ((Class157_Sub2) class157_sub2_1413_).aShortArray9205
			= new short[i_1435_];
		} else
		    ((Class157_Sub2) class157_sub2_1412_).aShortArray9205
			= (((Class157_Sub2) class157_sub2_1413_)
			   .aShortArray9205);
		for (int i_1436_ = 0;
		     i_1436_ < ((Class157_Sub2) this).anInt9143; i_1436_++)
		    ((Class157_Sub2) class157_sub2_1412_).aShortArray9205
			[i_1436_]
			= ((Class157_Sub2) this).aShortArray9205[i_1436_];
	    }
	} else
	    ((Class157_Sub2) class157_sub2_1412_).aShortArray9205
		= ((Class157_Sub2) this).aShortArray9205;
	if ((i & 0x10000) != 0) {
	    if (((Class157_Sub2) this).aByteArray9158 == null)
		((Class157_Sub2) class157_sub2_1412_).aByteArray9158 = null;
	    else {
		if ((((Class157_Sub2) class157_sub2_1413_).aByteArray9158
		     == null)
		    || ((((Class157_Sub2) class157_sub2_1413_)
			 .aByteArray9158).length
			< ((Class157_Sub2) this).anInt9143)) {
		    int i_1437_
			= (bool ? ((Class157_Sub2) this).anInt9143 + 100
			   : ((Class157_Sub2) this).anInt9143);
		    ((Class157_Sub2) class157_sub2_1412_).aByteArray9158
			= ((Class157_Sub2) class157_sub2_1413_).aByteArray9158
			= new byte[i_1437_];
		} else
		    ((Class157_Sub2) class157_sub2_1412_).aByteArray9158
			= ((Class157_Sub2) class157_sub2_1413_).aByteArray9158;
		for (int i_1438_ = 0;
		     i_1438_ < ((Class157_Sub2) this).anInt9143; i_1438_++)
		    ((Class157_Sub2) class157_sub2_1412_).aByteArray9158
			[i_1438_]
			= ((Class157_Sub2) this).aByteArray9158[i_1438_];
	    }
	} else
	    ((Class157_Sub2) class157_sub2_1412_).aByteArray9158
		= ((Class157_Sub2) this).aByteArray9158;
	if ((i & 0xc580) != 0) {
	    if ((((Class157_Sub2) class157_sub2_1413_).aClass108Array9123
		 == null)
		|| ((((Class157_Sub2) class157_sub2_1413_)
		     .aClass108Array9123).length
		    < ((Class157_Sub2) this).anInt9175)) {
		int i_1439_ = ((Class157_Sub2) this).anInt9175;
		((Class157_Sub2) class157_sub2_1412_).aClass108Array9123
		    = ((Class157_Sub2) class157_sub2_1413_).aClass108Array9123
		    = new Class108[i_1439_];
		for (int i_1440_ = 0;
		     i_1440_ < ((Class157_Sub2) this).anInt9175; i_1440_++)
		    ((Class157_Sub2) class157_sub2_1412_)
			.aClass108Array9123[i_1440_]
			= ((Class157_Sub2) this).aClass108Array9123
			      [i_1440_].method1373((byte) -19);
	    } else {
		((Class157_Sub2) class157_sub2_1412_).aClass108Array9123
		    = ((Class157_Sub2) class157_sub2_1413_).aClass108Array9123;
		for (int i_1441_ = 0;
		     i_1441_ < ((Class157_Sub2) this).anInt9175; i_1441_++)
		    ((Class157_Sub2) class157_sub2_1412_)
			.aClass108Array9123[i_1441_].method1374
			(((Class157_Sub2) this).aClass108Array9123[i_1441_],
			 (byte) -67);
	    }
	} else
	    ((Class157_Sub2) class157_sub2_1412_).aClass108Array9123
		= ((Class157_Sub2) this).aClass108Array9123;
	if (((Class157_Sub2) this).aFloatArrayArray9157 != null
	    && (i & 0x10) != 0) {
	    if ((((Class157_Sub2) class157_sub2_1413_).aFloatArrayArray9157
		 == null)
		|| ((((Class157_Sub2) class157_sub2_1413_)
		     .aFloatArrayArray9157).length
		    < ((Class157_Sub2) this).anInt9143)) {
		int i_1442_ = (bool ? ((Class157_Sub2) this).anInt9143 + 100
			       : ((Class157_Sub2) this).anInt9143);
		((Class157_Sub2) class157_sub2_1412_).aFloatArrayArray9157
		    = ((Class157_Sub2) class157_sub2_1413_)
			  .aFloatArrayArray9157
		    = new float[i_1442_][3];
	    } else
		((Class157_Sub2) class157_sub2_1412_).aFloatArrayArray9157
		    = (((Class157_Sub2) class157_sub2_1413_)
		       .aFloatArrayArray9157);
	    for (int i_1443_ = 0; i_1443_ < ((Class157_Sub2) this).anInt9143;
		 i_1443_++) {
		if (((Class157_Sub2) this).aFloatArrayArray9157[i_1443_]
		    != null) {
		    ((Class157_Sub2) class157_sub2_1412_)
			.aFloatArrayArray9157[i_1443_][0]
			= (((Class157_Sub2) this).aFloatArrayArray9157[i_1443_]
			   [0]);
		    ((Class157_Sub2) class157_sub2_1412_)
			.aFloatArrayArray9157[i_1443_][1]
			= (((Class157_Sub2) this).aFloatArrayArray9157[i_1443_]
			   [1]);
		    ((Class157_Sub2) class157_sub2_1412_)
			.aFloatArrayArray9157[i_1443_][2]
			= (((Class157_Sub2) this).aFloatArrayArray9157[i_1443_]
			   [2]);
		}
	    }
	    if ((((Class157_Sub2) class157_sub2_1413_).aFloatArrayArray9149
		 == null)
		|| ((((Class157_Sub2) class157_sub2_1413_)
		     .aFloatArrayArray9149).length
		    < ((Class157_Sub2) this).anInt9143)) {
		int i_1444_ = (bool ? ((Class157_Sub2) this).anInt9143 + 100
			       : ((Class157_Sub2) this).anInt9143);
		((Class157_Sub2) class157_sub2_1412_).aFloatArrayArray9149
		    = ((Class157_Sub2) class157_sub2_1413_)
			  .aFloatArrayArray9149
		    = new float[i_1444_][3];
	    } else
		((Class157_Sub2) class157_sub2_1412_).aFloatArrayArray9149
		    = (((Class157_Sub2) class157_sub2_1413_)
		       .aFloatArrayArray9149);
	    for (int i_1445_ = 0; i_1445_ < ((Class157_Sub2) this).anInt9143;
		 i_1445_++) {
		if (((Class157_Sub2) this).aFloatArrayArray9149[i_1445_]
		    != null) {
		    ((Class157_Sub2) class157_sub2_1412_)
			.aFloatArrayArray9149[i_1445_][0]
			= (((Class157_Sub2) this).aFloatArrayArray9149[i_1445_]
			   [0]);
		    ((Class157_Sub2) class157_sub2_1412_)
			.aFloatArrayArray9149[i_1445_][1]
			= (((Class157_Sub2) this).aFloatArrayArray9149[i_1445_]
			   [1]);
		    ((Class157_Sub2) class157_sub2_1412_)
			.aFloatArrayArray9149[i_1445_][2]
			= (((Class157_Sub2) this).aFloatArrayArray9149[i_1445_]
			   [2]);
		}
	    }
	} else {
	    ((Class157_Sub2) class157_sub2_1412_).aFloatArrayArray9157
		= ((Class157_Sub2) this).aFloatArrayArray9157;
	    ((Class157_Sub2) class157_sub2_1412_).aFloatArrayArray9149
		= ((Class157_Sub2) this).aFloatArrayArray9149;
	}
	((Class157_Sub2) class157_sub2_1412_).anIntArrayArray9165
	    = ((Class157_Sub2) this).anIntArrayArray9165;
	((Class157_Sub2) class157_sub2_1412_).anIntArrayArray9166
	    = ((Class157_Sub2) this).anIntArrayArray9166;
	((Class157_Sub2) class157_sub2_1412_).anIntArrayArray9178
	    = ((Class157_Sub2) this).anIntArrayArray9178;
	((Class157_Sub2) class157_sub2_1412_).aShortArray9140
	    = ((Class157_Sub2) this).aShortArray9140;
	((Class157_Sub2) class157_sub2_1412_).aShortArray9163
	    = ((Class157_Sub2) this).aShortArray9163;
	((Class157_Sub2) class157_sub2_1412_).aByteArray9159
	    = ((Class157_Sub2) this).aByteArray9159;
	((Class157_Sub2) class157_sub2_1412_).aShortArray9145
	    = ((Class157_Sub2) this).aShortArray9145;
	((Class157_Sub2) class157_sub2_1412_).aShortArray9146
	    = ((Class157_Sub2) this).aShortArray9146;
	((Class157_Sub2) class157_sub2_1412_).aShortArray9147
	    = ((Class157_Sub2) this).aShortArray9147;
	((Class157_Sub2) class157_sub2_1412_).aClass170Array9122
	    = ((Class157_Sub2) this).aClass170Array9122;
	((Class157_Sub2) class157_sub2_1412_).aClass144Array9125
	    = ((Class157_Sub2) this).aClass144Array9125;
	((Class157_Sub2) class157_sub2_1412_).aClass90Array9156
	    = ((Class157_Sub2) this).aClass90Array9156;
	((Class157_Sub2) class157_sub2_1412_).aShortArray9164
	    = ((Class157_Sub2) this).aShortArray9164;
	((Class157_Sub2) class157_sub2_1412_).anInt9132 = i;
	return class157_sub2_1412_;
    }
    
    public int method1978() {
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	return ((Class157_Sub2) this).aShort9185;
    }
    
    public Class144[] method1985() {
	return ((Class157_Sub2) this).aClass144Array9125;
    }
    
    public Class144[] method2010() {
	return ((Class157_Sub2) this).aClass144Array9125;
    }
    
    public void method2007(int i, int i_1446_, int i_1447_, int i_1448_) {
	if ((((Class157_Sub2) this).anInt9132 & 0x80000) != 524288)
	    throw new IllegalStateException();
	for (int i_1449_ = 0; i_1449_ < ((Class157_Sub2) this).anInt9143;
	     i_1449_++) {
	    int i_1450_
		= ((Class157_Sub2) this).aShortArray9162[i_1449_] & 0xffff;
	    int i_1451_ = i_1450_ >> 10 & 0x3f;
	    int i_1452_ = i_1450_ >> 7 & 0x7;
	    int i_1453_ = i_1450_ & 0x7f;
	    if (i != -1)
		i_1451_ += (i - i_1451_) * i_1448_ >> 7;
	    if (i_1446_ != -1)
		i_1452_ += (i_1446_ - i_1452_) * i_1448_ >> 7;
	    if (i_1447_ != -1)
		i_1453_ += (i_1447_ - i_1453_) * i_1448_ >> 7;
	    ((Class157_Sub2) this).aShortArray9162[i_1449_]
		= (short) (i_1451_ << 10 | i_1452_ << 7 | i_1453_);
	}
	if (((Class157_Sub2) this).aClass90Array9156 != null) {
	    for (int i_1454_ = 0; i_1454_ < ((Class157_Sub2) this).anInt9175;
		 i_1454_++) {
		Class90 class90
		    = ((Class157_Sub2) this).aClass90Array9156[i_1454_];
		Class108 class108
		    = ((Class157_Sub2) this).aClass108Array9123[i_1454_];
		((Class108) class108).anInt1368
		    = ((((Class108) class108).anInt1368 * -1351793475
			& ~0xffffff)
		       | ((Class72.anIntArray777
			   [Class516.method6283(((((Class157_Sub2) this)
						  .aShortArray9162
						  [(((Class90) class90)
						    .anInt1142) * 1037728387])
						 & 0xffff),
						515814180) & 0xffff])
			  & 0xffffff)) * 323344021;
	    }
	}
	if (((Class157_Sub2) this).anInt9152 == 2)
	    ((Class157_Sub2) this).anInt9152 = 1;
    }
    
    public void method2005(Class433 class433, int i, boolean bool) {
	if (((Class157_Sub2) this).aShortArray9140 != null) {
	    Class107 class107 = ((Class157_Sub2) this).aClass173_Sub3_9130
				    .method8939(Thread.currentThread());
	    Class433 class433_1455_ = ((Class107) class107).aClass433_1331;
	    class433_1455_.method5217(class433);
	    if (bool)
		class433_1455_.method5223();
	    Class418 class418 = ((Class107) class107).aClass418_1319;
	    class418.method5035(class433_1455_);
	    float[] fs = new float[3];
	    for (int i_1456_ = 0; i_1456_ < ((Class157_Sub2) this).anInt9136;
		 i_1456_++) {
		if ((i & ((Class157_Sub2) this).aShortArray9140[i_1456_])
		    != 0) {
		    class418.method5030((float) (((Class157_Sub2) this)
						 .anIntArray9203[i_1456_]),
					(float) (((Class157_Sub2) this)
						 .anIntArray9204[i_1456_]),
					(float) (((Class157_Sub2) this)
						 .anIntArray9177[i_1456_]),
					fs);
		    ((Class157_Sub2) this).anIntArray9203[i_1456_]
			= (int) fs[0];
		    ((Class157_Sub2) this).anIntArray9204[i_1456_]
			= (int) fs[1];
		    ((Class157_Sub2) this).anIntArray9177[i_1456_]
			= (int) fs[2];
		}
	    }
	}
    }
    
    public boolean method2013() {
	if (((Class157_Sub2) this).aShortArray9205 == null)
	    return true;
	for (int i = 0; i < ((Class157_Sub2) this).aShortArray9205.length;
	     i++) {
	    if (((Class157_Sub2) this).aShortArray9205[i] != -1
		&& !((Class157_Sub2) this).aClass173_Sub3_9130
			.method8927(((Class157_Sub2) this).aShortArray9205[i]))
		return false;
	}
	return true;
    }
    
    public boolean method2014() {
	if (((Class157_Sub2) this).aShortArray9205 == null)
	    return true;
	for (int i = 0; i < ((Class157_Sub2) this).aShortArray9205.length;
	     i++) {
	    if (((Class157_Sub2) this).aShortArray9205[i] != -1
		&& !((Class157_Sub2) this).aClass173_Sub3_9130
			.method8927(((Class157_Sub2) this).aShortArray9205[i]))
		return false;
	}
	return true;
    }
    
    public boolean method1967() {
	return ((Class157_Sub2) this).aBool9190;
    }
    
    public boolean method2016() {
	return ((Class157_Sub2) this).aBool9199;
    }
    
    public boolean method2021() {
	return ((Class157_Sub2) this).aBool9199;
    }
    
    void method1961(int i, int i_1457_, int i_1458_, int i_1459_) {
	if (i == 0) {
	    int i_1460_ = 0;
	    ((Class157_Sub2) this).anInt9169 = 0;
	    ((Class157_Sub2) this).anInt9170 = 0;
	    ((Class157_Sub2) this).anInt9171 = 0;
	    for (int i_1461_ = 0; i_1461_ < ((Class157_Sub2) this).anInt9135;
		 i_1461_++) {
		((Class157_Sub2) this).anInt9169
		    += ((Class157_Sub2) this).anIntArray9203[i_1461_];
		((Class157_Sub2) this).anInt9170
		    += ((Class157_Sub2) this).anIntArray9204[i_1461_];
		((Class157_Sub2) this).anInt9171
		    += ((Class157_Sub2) this).anIntArray9177[i_1461_];
		i_1460_++;
	    }
	    if (i_1460_ > 0) {
		((Class157_Sub2) this).anInt9169
		    = ((Class157_Sub2) this).anInt9169 / i_1460_ + i_1457_;
		((Class157_Sub2) this).anInt9170
		    = ((Class157_Sub2) this).anInt9170 / i_1460_ + i_1458_;
		((Class157_Sub2) this).anInt9171
		    = ((Class157_Sub2) this).anInt9171 / i_1460_ + i_1459_;
	    } else {
		((Class157_Sub2) this).anInt9169 = i_1457_;
		((Class157_Sub2) this).anInt9170 = i_1458_;
		((Class157_Sub2) this).anInt9171 = i_1459_;
	    }
	} else if (i == 1) {
	    for (int i_1462_ = 0; i_1462_ < ((Class157_Sub2) this).anInt9135;
		 i_1462_++) {
		((Class157_Sub2) this).anIntArray9203[i_1462_] += i_1457_;
		((Class157_Sub2) this).anIntArray9204[i_1462_] += i_1458_;
		((Class157_Sub2) this).anIntArray9177[i_1462_] += i_1459_;
	    }
	} else if (i == 2) {
	    for (int i_1463_ = 0; i_1463_ < ((Class157_Sub2) this).anInt9135;
		 i_1463_++) {
		((Class157_Sub2) this).anIntArray9203[i_1463_]
		    -= ((Class157_Sub2) this).anInt9169;
		((Class157_Sub2) this).anIntArray9204[i_1463_]
		    -= ((Class157_Sub2) this).anInt9170;
		((Class157_Sub2) this).anIntArray9177[i_1463_]
		    -= ((Class157_Sub2) this).anInt9171;
		if (i_1459_ != 0) {
		    int i_1464_ = Class417.anIntArray4766[i_1459_];
		    int i_1465_ = Class417.anIntArray4767[i_1459_];
		    int i_1466_
			= (((((Class157_Sub2) this).anIntArray9204[i_1463_]
			     * i_1464_)
			    + (((Class157_Sub2) this).anIntArray9203[i_1463_]
			       * i_1465_)
			    + 16383)
			   >> 14);
		    ((Class157_Sub2) this).anIntArray9204[i_1463_]
			= ((((Class157_Sub2) this).anIntArray9204[i_1463_]
			    * i_1465_)
			   - (((Class157_Sub2) this).anIntArray9203[i_1463_]
			      * i_1464_)
			   + 16383) >> 14;
		    ((Class157_Sub2) this).anIntArray9203[i_1463_] = i_1466_;
		}
		if (i_1457_ != 0) {
		    int i_1467_ = Class417.anIntArray4766[i_1457_];
		    int i_1468_ = Class417.anIntArray4767[i_1457_];
		    int i_1469_
			= (((((Class157_Sub2) this).anIntArray9204[i_1463_]
			     * i_1468_)
			    - (((Class157_Sub2) this).anIntArray9177[i_1463_]
			       * i_1467_)
			    + 16383)
			   >> 14);
		    ((Class157_Sub2) this).anIntArray9177[i_1463_]
			= ((((Class157_Sub2) this).anIntArray9204[i_1463_]
			    * i_1467_)
			   + (((Class157_Sub2) this).anIntArray9177[i_1463_]
			      * i_1468_)
			   + 16383) >> 14;
		    ((Class157_Sub2) this).anIntArray9204[i_1463_] = i_1469_;
		}
		if (i_1458_ != 0) {
		    int i_1470_ = Class417.anIntArray4766[i_1458_];
		    int i_1471_ = Class417.anIntArray4767[i_1458_];
		    int i_1472_
			= (((((Class157_Sub2) this).anIntArray9177[i_1463_]
			     * i_1470_)
			    + (((Class157_Sub2) this).anIntArray9203[i_1463_]
			       * i_1471_)
			    + 16383)
			   >> 14);
		    ((Class157_Sub2) this).anIntArray9177[i_1463_]
			= ((((Class157_Sub2) this).anIntArray9177[i_1463_]
			    * i_1471_)
			   - (((Class157_Sub2) this).anIntArray9203[i_1463_]
			      * i_1470_)
			   + 16383) >> 14;
		    ((Class157_Sub2) this).anIntArray9203[i_1463_] = i_1472_;
		}
		((Class157_Sub2) this).anIntArray9203[i_1463_]
		    += ((Class157_Sub2) this).anInt9169;
		((Class157_Sub2) this).anIntArray9204[i_1463_]
		    += ((Class157_Sub2) this).anInt9170;
		((Class157_Sub2) this).anIntArray9177[i_1463_]
		    += ((Class157_Sub2) this).anInt9171;
	    }
	} else if (i == 3) {
	    for (int i_1473_ = 0; i_1473_ < ((Class157_Sub2) this).anInt9135;
		 i_1473_++) {
		((Class157_Sub2) this).anIntArray9203[i_1473_]
		    -= ((Class157_Sub2) this).anInt9169;
		((Class157_Sub2) this).anIntArray9204[i_1473_]
		    -= ((Class157_Sub2) this).anInt9170;
		((Class157_Sub2) this).anIntArray9177[i_1473_]
		    -= ((Class157_Sub2) this).anInt9171;
		((Class157_Sub2) this).anIntArray9203[i_1473_]
		    = (((Class157_Sub2) this).anIntArray9203[i_1473_] * i_1457_
		       / 128);
		((Class157_Sub2) this).anIntArray9204[i_1473_]
		    = (((Class157_Sub2) this).anIntArray9204[i_1473_] * i_1458_
		       / 128);
		((Class157_Sub2) this).anIntArray9177[i_1473_]
		    = (((Class157_Sub2) this).anIntArray9177[i_1473_] * i_1459_
		       / 128);
		((Class157_Sub2) this).anIntArray9203[i_1473_]
		    += ((Class157_Sub2) this).anInt9169;
		((Class157_Sub2) this).anIntArray9204[i_1473_]
		    += ((Class157_Sub2) this).anInt9170;
		((Class157_Sub2) this).anIntArray9177[i_1473_]
		    += ((Class157_Sub2) this).anInt9171;
	    }
	} else if (i == 5) {
	    for (int i_1474_ = 0; i_1474_ < ((Class157_Sub2) this).anInt9143;
		 i_1474_++) {
		int i_1475_
		    = ((((Class157_Sub2) this).aByteArray9160[i_1474_] & 0xff)
		       + i_1457_ * 8);
		if (i_1475_ < 0)
		    i_1475_ = 0;
		else if (i_1475_ > 255)
		    i_1475_ = 255;
		((Class157_Sub2) this).aByteArray9160[i_1474_]
		    = (byte) i_1475_;
	    }
	    if (((Class157_Sub2) this).aClass90Array9156 != null) {
		for (int i_1476_ = 0;
		     i_1476_ < ((Class157_Sub2) this).anInt9175; i_1476_++) {
		    Class90 class90
			= ((Class157_Sub2) this).aClass90Array9156[i_1476_];
		    Class108 class108
			= ((Class157_Sub2) this).aClass108Array9123[i_1476_];
		    ((Class108) class108).anInt1368
			= ((((Class108) class108).anInt1368 * -1351793475
			    & 0xffffff)
			   | (255
			      - ((((Class157_Sub2) this).aByteArray9160
				  [((Class90) class90).anInt1142 * 1037728387])
				 & 0xff)) << 24) * 323344021;
		}
	    }
	} else if (i == 7) {
	    for (int i_1477_ = 0; i_1477_ < ((Class157_Sub2) this).anInt9143;
		 i_1477_++) {
		int i_1478_
		    = ((Class157_Sub2) this).aShortArray9162[i_1477_] & 0xffff;
		int i_1479_ = i_1478_ >> 10 & 0x3f;
		int i_1480_ = i_1478_ >> 7 & 0x7;
		int i_1481_ = i_1478_ & 0x7f;
		i_1479_ = i_1479_ + i_1457_ & 0x3f;
		i_1480_ += i_1458_;
		if (i_1480_ < 0)
		    i_1480_ = 0;
		else if (i_1480_ > 7)
		    i_1480_ = 7;
		i_1481_ += i_1459_;
		if (i_1481_ < 0)
		    i_1481_ = 0;
		else if (i_1481_ > 127)
		    i_1481_ = 127;
		((Class157_Sub2) this).aShortArray9162[i_1477_]
		    = (short) (i_1479_ << 10 | i_1480_ << 7 | i_1481_);
	    }
	    ((Class157_Sub2) this).aBool9195 = true;
	    if (((Class157_Sub2) this).aClass90Array9156 != null) {
		for (int i_1482_ = 0;
		     i_1482_ < ((Class157_Sub2) this).anInt9175; i_1482_++) {
		    Class90 class90
			= ((Class157_Sub2) this).aClass90Array9156[i_1482_];
		    Class108 class108
			= ((Class157_Sub2) this).aClass108Array9123[i_1482_];
		    ((Class108) class108).anInt1368
			= ((((Class108) class108).anInt1368 * -1351793475
			    & ~0xffffff)
			   | ((Class72.anIntArray777
			       [Class516.method6283(((((Class157_Sub2) this)
						      .aShortArray9162
						      [((((Class90) class90)
							 .anInt1142)
							* 1037728387)])
						     & 0xffff),
						    515814180) & 0xffff])
			      & 0xffffff)) * 323344021;
		}
	    }
	} else if (i == 8) {
	    for (int i_1483_ = 0; i_1483_ < ((Class157_Sub2) this).anInt9175;
		 i_1483_++) {
		Class108 class108
		    = ((Class157_Sub2) this).aClass108Array9123[i_1483_];
		((Class108) class108).anInt1365 += i_1457_ * -731787657;
		((Class108) class108).anInt1366 += i_1458_ * 1335672291;
	    }
	} else if (i == 10) {
	    for (int i_1484_ = 0; i_1484_ < ((Class157_Sub2) this).anInt9175;
		 i_1484_++) {
		Class108 class108
		    = ((Class157_Sub2) this).aClass108Array9123[i_1484_];
		((Class108) class108).aFloat1363
		    = (((Class108) class108).aFloat1363 * (float) i_1457_
		       / 128.0F);
		((Class108) class108).aFloat1364
		    = (((Class108) class108).aFloat1364 * (float) i_1458_
		       / 128.0F);
	    }
	} else if (i == 9) {
	    for (int i_1485_ = 0; i_1485_ < ((Class157_Sub2) this).anInt9175;
		 i_1485_++) {
		Class108 class108
		    = ((Class157_Sub2) this).aClass108Array9123[i_1485_];
		((Class108) class108).anInt1367
		    = (((Class108) class108).anInt1367 * 337890173 + i_1457_
		       & 0x3fff) * 1644905941;
	    }
	}
    }
    
    public void method1870(int i) {
	if ((((Class157_Sub2) this).anInt9132 & 0x6) != 6)
	    throw new IllegalStateException();
	int i_1486_ = Class417.anIntArray4766[i];
	int i_1487_ = Class417.anIntArray4767[i];
	synchronized (this) {
	    for (int i_1488_ = 0; i_1488_ < ((Class157_Sub2) this).anInt9135;
		 i_1488_++) {
		int i_1489_
		    = (((Class157_Sub2) this).anIntArray9204[i_1488_] * i_1487_
		       - (((Class157_Sub2) this).anIntArray9177[i_1488_]
			  * i_1486_)) >> 14;
		((Class157_Sub2) this).anIntArray9177[i_1488_]
		    = (((Class157_Sub2) this).anIntArray9204[i_1488_] * i_1486_
		       + (((Class157_Sub2) this).anIntArray9177[i_1488_]
			  * i_1487_)) >> 14;
		((Class157_Sub2) this).anIntArray9204[i_1488_] = i_1489_;
	    }
	    method8411();
	}
    }
    
    public void method2019(int i, int i_1490_, int i_1491_) {
	if (i != 0 && (((Class157_Sub2) this).anInt9132 & 0x1) != 1)
	    throw new IllegalStateException();
	if (i_1490_ != 0 && (((Class157_Sub2) this).anInt9132 & 0x2) != 2)
	    throw new IllegalStateException();
	if (i_1491_ != 0 && (((Class157_Sub2) this).anInt9132 & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i_1492_ = 0; i_1492_ < ((Class157_Sub2) this).anInt9135;
		 i_1492_++) {
		((Class157_Sub2) this).anIntArray9203[i_1492_] += i;
		((Class157_Sub2) this).anIntArray9204[i_1492_] += i_1490_;
		((Class157_Sub2) this).anIntArray9177[i_1492_] += i_1491_;
	    }
	}
    }
    
    public void method1947(int i, int i_1493_, int i_1494_) {
	if (i != 128 && (((Class157_Sub2) this).anInt9132 & 0x1) != 1)
	    throw new IllegalStateException();
	if (i_1493_ != 128 && (((Class157_Sub2) this).anInt9132 & 0x2) != 2)
	    throw new IllegalStateException();
	if (i_1494_ != 128 && (((Class157_Sub2) this).anInt9132 & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i_1495_ = 0; i_1495_ < ((Class157_Sub2) this).anInt9135;
		 i_1495_++) {
		((Class157_Sub2) this).anIntArray9203[i_1495_]
		    = ((Class157_Sub2) this).anIntArray9203[i_1495_] * i >> 7;
		((Class157_Sub2) this).anIntArray9204[i_1495_]
		    = (((Class157_Sub2) this).anIntArray9204[i_1495_] * i_1493_
		       >> 7);
		((Class157_Sub2) this).anIntArray9177[i_1495_]
		    = (((Class157_Sub2) this).anIntArray9177[i_1495_] * i_1494_
		       >> 7);
	    }
	    ((Class157_Sub2) this).aBool9179 = false;
	}
    }
    
    public int method1954() {
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	return ((Class157_Sub2) this).aShort9181;
    }
    
    public void method2001(short i, short i_1496_) {
	if (((Class157_Sub2) this).aShortArray9205 != null) {
	    if (!((Class157_Sub2) this).aBool9199 && i_1496_ >= 0) {
		Class160 class160
		    = ((Class157_Sub2) this).aClass173_Sub3_9130
			  .aClass165_1984
			  .method2093(i_1496_ & 0xffff, (byte) -125);
		if (class160.aByte1775 != 0 || class160.aByte1776 != 0)
		    ((Class157_Sub2) this).aBool9199 = true;
	    }
	    for (int i_1497_ = 0; i_1497_ < ((Class157_Sub2) this).anInt9143;
		 i_1497_++) {
		if (((Class157_Sub2) this).aShortArray9205[i_1497_] == i)
		    ((Class157_Sub2) this).aShortArray9205[i_1497_] = i_1496_;
	    }
	}
    }
    
    public int method2023() {
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	return ((Class157_Sub2) this).aShort9183;
    }
    
    public int method1948() {
	if (!((Class157_Sub2) this).aBool9179)
	    method8420();
	return ((Class157_Sub2) this).aShort9183;
    }
    
    public void method1865(short i, short i_1498_) {
	for (int i_1499_ = 0; i_1499_ < ((Class157_Sub2) this).anInt9143;
	     i_1499_++) {
	    if (((Class157_Sub2) this).aShortArray9162[i_1499_] == i)
		((Class157_Sub2) this).aShortArray9162[i_1499_] = i_1498_;
	}
	if (((Class157_Sub2) this).aClass90Array9156 != null) {
	    for (int i_1500_ = 0; i_1500_ < ((Class157_Sub2) this).anInt9175;
		 i_1500_++) {
		Class90 class90
		    = ((Class157_Sub2) this).aClass90Array9156[i_1500_];
		Class108 class108
		    = ((Class157_Sub2) this).aClass108Array9123[i_1500_];
		((Class108) class108).anInt1368
		    = ((((Class108) class108).anInt1368 * -1351793475
			& ~0xffffff)
		       | ((Class72.anIntArray777
			   [Class516.method6283((((Class157_Sub2) this)
						 .aShortArray9162
						 [(((Class90) class90)
						   .anInt1142) * 1037728387]),
						515814180) & 0xffff])
			  & 0xffffff)) * 323344021;
	    }
	}
	if (((Class157_Sub2) this).anInt9152 == 2)
	    ((Class157_Sub2) this).anInt9152 = 1;
    }
    
    public void method1974(short i, short i_1501_) {
	for (int i_1502_ = 0; i_1502_ < ((Class157_Sub2) this).anInt9143;
	     i_1502_++) {
	    if (((Class157_Sub2) this).aShortArray9162[i_1502_] == i)
		((Class157_Sub2) this).aShortArray9162[i_1502_] = i_1501_;
	}
	if (((Class157_Sub2) this).aClass90Array9156 != null) {
	    for (int i_1503_ = 0; i_1503_ < ((Class157_Sub2) this).anInt9175;
		 i_1503_++) {
		Class90 class90
		    = ((Class157_Sub2) this).aClass90Array9156[i_1503_];
		Class108 class108
		    = ((Class157_Sub2) this).aClass108Array9123[i_1503_];
		((Class108) class108).anInt1368
		    = ((((Class108) class108).anInt1368 * -1351793475
			& ~0xffffff)
		       | ((Class72.anIntArray777
			   [Class516.method6283((((Class157_Sub2) this)
						 .aShortArray9162
						 [(((Class90) class90)
						   .anInt1142) * 1037728387]),
						515814180) & 0xffff])
			  & 0xffffff)) * 323344021;
	    }
	}
	if (((Class157_Sub2) this).anInt9152 == 2)
	    ((Class157_Sub2) this).anInt9152 = 1;
    }
    
    void method1868() {
	if ((((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
	     .anInt9745) * -1585405167
	    > 1) {
	    synchronized (this) {
		while (aBool1738) {
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		aBool1738 = true;
	    }
	}
    }
    
    void method8440(Class433 class433, Class159 class159, int i) {
	if (((Class157_Sub2) this).anInt9136 >= 1) {
	    Class107 class107 = ((Class157_Sub2) this).aClass173_Sub3_9130
				    .method8939(Thread.currentThread());
	    Class418 class418 = ((Class107) class107).aClass418_1319;
	    class418.method5035(class433);
	    Class418 class418_1504_
		= (((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
		   .aClass418_9734);
	    Class418 class418_1505_
		= (((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
		   .aClass418_9722);
	    if (!((Class157_Sub2) this).aBool9179)
		method8420();
	    boolean bool = class418.method4977();
	    float[] fs = ((Class107) class107).aFloatArray1361;
	    class418.method5030(0.0F,
				(float) ((Class157_Sub2) this).aShort9182,
				0.0F, fs);
	    float f = fs[0];
	    float f_1506_ = fs[1];
	    float f_1507_ = fs[2];
	    class418.method5030(0.0F,
				(float) ((Class157_Sub2) this).aShort9183,
				0.0F, fs);
	    float f_1508_ = fs[0];
	    float f_1509_ = fs[1];
	    float f_1510_ = fs[2];
	    for (int i_1511_ = 0; i_1511_ < 6; i_1511_++) {
		float[] fs_1512_ = (((Class173_Sub3) (((Class157_Sub2) this)
						      .aClass173_Sub3_9130))
				    .aFloatArrayArray9737[i_1511_]);
		float f_1513_ = (fs_1512_[0] * f + fs_1512_[1] * f_1506_
				 + fs_1512_[2] * f_1507_ + fs_1512_[3]
				 + (float) ((Class157_Sub2) this).aShort9180);
		float f_1514_ = (fs_1512_[0] * f_1508_ + fs_1512_[1] * f_1509_
				 + fs_1512_[2] * f_1510_ + fs_1512_[3]
				 + (float) ((Class157_Sub2) this).aShort9180);
		if (f_1513_ < 0.0F && f_1514_ < 0.0F)
		    return;
	    }
	    float f_1515_;
	    float f_1516_;
	    if (bool) {
		f_1515_ = class418_1504_.aFloatArray4768[14];
		f_1516_ = class418_1504_.aFloatArray4768[6];
	    } else {
		f_1515_ = ((class418.aFloatArray4768[12]
			    * class418_1504_.aFloatArray4768[2])
			   + (class418.aFloatArray4768[13]
			      * class418_1504_.aFloatArray4768[6])
			   + (class418.aFloatArray4768[14]
			      * class418_1504_.aFloatArray4768[10])
			   + class418_1504_.aFloatArray4768[14]);
		f_1516_ = ((class418.aFloatArray4768[4]
			    * class418_1504_.aFloatArray4768[2])
			   + (class418.aFloatArray4768[5]
			      * class418_1504_.aFloatArray4768[6])
			   + (class418.aFloatArray4768[6]
			      * class418_1504_.aFloatArray4768[10]));
	    }
	    float f_1517_
		= (f_1515_
		   + (float) ((Class157_Sub2) this).aShort9182 * f_1516_);
	    float f_1518_
		= (f_1515_
		   + (float) ((Class157_Sub2) this).aShort9183 * f_1516_);
	    float f_1519_
		= (f_1517_ > f_1518_
		   ? f_1517_ + (float) ((Class157_Sub2) this).aShort9180
		   : f_1518_ + (float) ((Class157_Sub2) this).aShort9180);
	    float f_1520_ = (class418_1505_.aFloatArray4768[10] * f_1519_
			     + class418_1505_.aFloatArray4768[14]);
	    if ((((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
		 .anInt9745) * -1585405167
		> 1) {
		synchronized (this) {
		    while (((Class157_Sub2) this).aBool9120) {
			try {
			    this.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
		    }
		    ((Class157_Sub2) this).aBool9120 = true;
		}
	    }
	    method8401(class107);
	    Class418 class418_1521_
		= (((Class107) ((Class157_Sub2) this).aClass107_9121)
		   .aClass418_1333);
	    class418_1521_.method4986(class418);
	    class418_1521_.method4974(((Class173_Sub3) (((Class157_Sub2) this)
							.aClass173_Sub3_9130))
				      .aClass418_9736);
	    if ((i & 0x2) != 0)
		((Class157_Sub2) this).aClass121_9200.method1578(true);
	    else
		((Class157_Sub2) this).aClass121_9200.method1578(false);
	    boolean bool_1522_ = false;
	    ((Class107) ((Class157_Sub2) this).aClass107_9121).aFloat1322
		= (((Class121) ((Class157_Sub2) this).aClass121_9200)
		   .aFloat1508);
	    ((Class107) ((Class157_Sub2) this).aClass107_9121).aFloat1347
		= (((Class121) ((Class157_Sub2) this).aClass121_9200)
		   .aFloat1510);
	    ((Class107) ((Class157_Sub2) this).aClass107_9121).aFloat1349
		= (((Class121) ((Class157_Sub2) this).aClass121_9200)
		   .aFloat1503);
	    ((Class107) ((Class157_Sub2) this).aClass107_9121).aFloat1351
		= 1.0F / (((Class121) ((Class157_Sub2) this).aClass121_9200)
			  .aFloat1503);
	    ((Class107) ((Class157_Sub2) this).aClass107_9121).aFloat1323
		= (((Class121) ((Class157_Sub2) this).aClass121_9200)
		   .aFloat1507);
	    ((Class107) ((Class157_Sub2) this).aClass107_9121).aFloat1348
		= (((Class121) ((Class157_Sub2) this).aClass121_9200)
		   .aFloat1512);
	    ((Class107) ((Class157_Sub2) this).aClass107_9121).aFloat1350
		= (((Class121) ((Class157_Sub2) this).aClass121_9200)
		   .aFloat1511);
	    ((Class107) ((Class157_Sub2) this).aClass107_9121).anInt1352
		= (((Class121) ((Class157_Sub2) this).aClass121_9200).anInt1513
		   * -862174953);
	    for (int i_1523_ = 0; i_1523_ < ((Class157_Sub2) this).anInt9135;
		 i_1523_++) {
		int i_1524_ = ((Class157_Sub2) this).anIntArray9203[i_1523_];
		int i_1525_ = ((Class157_Sub2) this).anIntArray9204[i_1523_];
		int i_1526_ = ((Class157_Sub2) this).anIntArray9177[i_1523_];
		float f_1527_
		    = (class418_1521_.aFloatArray4768[0] * (float) i_1524_
		       + class418_1521_.aFloatArray4768[4] * (float) i_1525_
		       + class418_1521_.aFloatArray4768[8] * (float) i_1526_
		       + class418_1521_.aFloatArray4768[12]);
		float f_1528_
		    = (class418_1521_.aFloatArray4768[1] * (float) i_1524_
		       + class418_1521_.aFloatArray4768[5] * (float) i_1525_
		       + class418_1521_.aFloatArray4768[9] * (float) i_1526_
		       + class418_1521_.aFloatArray4768[13]);
		float f_1529_
		    = (class418_1521_.aFloatArray4768[2] * (float) i_1524_
		       + class418_1521_.aFloatArray4768[6] * (float) i_1525_
		       + class418_1521_.aFloatArray4768[10] * (float) i_1526_
		       + class418_1521_.aFloatArray4768[14]);
		float f_1530_
		    = (class418_1521_.aFloatArray4768[3] * (float) i_1524_
		       + class418_1521_.aFloatArray4768[7] * (float) i_1525_
		       + class418_1521_.aFloatArray4768[11] * (float) i_1526_
		       + class418_1521_.aFloatArray4768[15]);
		((Class157_Sub2) this).aFloatArray9137[i_1523_]
		    = ((((Class107) ((Class157_Sub2) this).aClass107_9121)
			.aFloat1350)
		       + (((Class107) ((Class157_Sub2) this).aClass107_9121)
			  .aFloat1349) * f_1529_ / f_1530_);
		((Class157_Sub2) this).aFloatArray9197[i_1523_] = f_1530_;
		if (f_1529_ >= -f_1530_) {
		    ((Class157_Sub2) this).aFloatArray9126[i_1523_]
			= (float) (int) ((((Class107) (((Class157_Sub2) this)
						       .aClass107_9121))
					  .aFloat1323)
					 + (((Class107) (((Class157_Sub2) this)
							 .aClass107_9121))
					    .aFloat1322) * f_1527_ / f_1530_);
		    ((Class157_Sub2) this).aFloatArray9119[i_1523_]
			= (float) (int) ((((Class107) (((Class157_Sub2) this)
						       .aClass107_9121))
					  .aFloat1348)
					 + (((Class107) (((Class157_Sub2) this)
							 .aClass107_9121))
					    .aFloat1347) * f_1528_ / f_1530_);
		} else {
		    ((Class157_Sub2) this).aFloatArray9126[i_1523_] = -5000.0F;
		    bool_1522_ = true;
		}
		if (((Class107) ((Class157_Sub2) this).aClass107_9121)
		    .aBool1324)
		    ((Class157_Sub2) this).anIntArray9174[i_1523_]
			= (int) (class418.aFloatArray4768[13]
				 + ((class418.aFloatArray4768[1]
				     * (float) i_1524_)
				    + (class418.aFloatArray4768[5]
				       * (float) i_1525_)
				    + (class418.aFloatArray4768[9]
				       * (float) i_1526_)));
	    }
	    if (((Class157_Sub2) this).aClass90Array9156 != null) {
		for (int i_1531_ = 0;
		     i_1531_ < ((Class157_Sub2) this).anInt9175; i_1531_++) {
		    Class90 class90
			= ((Class157_Sub2) this).aClass90Array9156[i_1531_];
		    Class108 class108
			= ((Class157_Sub2) this).aClass108Array9123[i_1531_];
		    short i_1532_
			= (((Class157_Sub2) this).aShortArray9145
			   [((Class90) class90).anInt1142 * 1037728387]);
		    short i_1533_
			= (((Class157_Sub2) this).aShortArray9146
			   [((Class90) class90).anInt1142 * 1037728387]);
		    short i_1534_
			= (((Class157_Sub2) this).aShortArray9147
			   [((Class90) class90).anInt1142 * 1037728387]);
		    int i_1535_
			= ((((Class157_Sub2) this).anIntArray9203[i_1532_]
			    + ((Class157_Sub2) this).anIntArray9203[i_1533_]
			    + ((Class157_Sub2) this).anIntArray9203[i_1534_])
			   / 3);
		    int i_1536_
			= ((((Class157_Sub2) this).anIntArray9204[i_1532_]
			    + ((Class157_Sub2) this).anIntArray9204[i_1533_]
			    + ((Class157_Sub2) this).anIntArray9204[i_1534_])
			   / 3);
		    int i_1537_
			= ((((Class157_Sub2) this).anIntArray9177[i_1532_]
			    + ((Class157_Sub2) this).anIntArray9177[i_1533_]
			    + ((Class157_Sub2) this).anIntArray9177[i_1534_])
			   / 3);
		    float f_1538_
			= (class418_1521_.aFloatArray4768[0] * (float) i_1535_
			   + (class418_1521_.aFloatArray4768[4]
			      * (float) i_1536_)
			   + (class418_1521_.aFloatArray4768[8]
			      * (float) i_1537_)
			   + class418_1521_.aFloatArray4768[12]);
		    float f_1539_
			= (class418_1521_.aFloatArray4768[1] * (float) i_1535_
			   + (class418_1521_.aFloatArray4768[5]
			      * (float) i_1536_)
			   + (class418_1521_.aFloatArray4768[9]
			      * (float) i_1537_)
			   + class418_1521_.aFloatArray4768[13]);
		    float f_1540_
			= (class418_1521_.aFloatArray4768[2] * (float) i_1535_
			   + (class418_1521_.aFloatArray4768[6]
			      * (float) i_1536_)
			   + (class418_1521_.aFloatArray4768[10]
			      * (float) i_1537_)
			   + class418_1521_.aFloatArray4768[14]);
		    float f_1541_
			= (class418_1521_.aFloatArray4768[3] * (float) i_1535_
			   + (class418_1521_.aFloatArray4768[7]
			      * (float) i_1536_)
			   + (class418_1521_.aFloatArray4768[11]
			      * (float) i_1537_)
			   + class418_1521_.aFloatArray4768[15]);
		    f_1540_ += ((class418_1505_.aFloatArray4768[2]
				 * (float) (((Class108) class108).anInt1365
					    * 1175219015))
				+ (class418_1505_.aFloatArray4768[6]
				   * (float) (((Class108) class108).anInt1366
					      * -467636277)));
		    f_1541_ += ((class418_1505_.aFloatArray4768[3]
				 * (float) (((Class108) class108).anInt1365
					    * 1175219015))
				+ (class418_1505_.aFloatArray4768[7]
				   * (float) (((Class108) class108).anInt1366
					      * -467636277)));
		    if (f_1540_ > -f_1541_) {
			f_1538_
			    += ((class418_1505_.aFloatArray4768[0]
				 * (float) (((Class108) class108).anInt1365
					    * 1175219015))
				+ (class418_1505_.aFloatArray4768[4]
				   * (float) (((Class108) class108).anInt1366
					      * -467636277)));
			f_1539_
			    += ((class418_1505_.aFloatArray4768[1]
				 * (float) (((Class108) class108).anInt1365
					    * 1175219015))
				+ (class418_1505_.aFloatArray4768[5]
				   * (float) (((Class108) class108).anInt1366
					      * -467636277)));
			float f_1542_
			    = ((((Class173_Sub3)
				 ((Class157_Sub2) this).aClass173_Sub3_9130)
				.aFloat9743)
			       + (((Class173_Sub3)
				   ((Class157_Sub2) this).aClass173_Sub3_9130)
				  .aFloat9742) * f_1538_ / f_1541_);
			float f_1543_
			    = ((((Class173_Sub3)
				 ((Class157_Sub2) this).aClass173_Sub3_9130)
				.aFloat9751)
			       + (((Class173_Sub3)
				   ((Class157_Sub2) this).aClass173_Sub3_9130)
				  .aFloat9744) * f_1539_ / f_1541_);
			float f_1544_
			    = (((Class108) class108).aFloat1363
			       * (float) ((Class90) class90).aShort1137);
			float f_1545_
			    = (((Class108) class108).aFloat1364
			       * (float) ((Class90) class90).aShort1141);
			float f_1546_
			    = (f_1538_
			       + class418_1505_.aFloatArray4768[0] * f_1544_
			       + class418_1505_.aFloatArray4768[4] * f_1545_);
			float f_1547_
			    = (f_1539_
			       + class418_1505_.aFloatArray4768[1] * f_1544_
			       + class418_1505_.aFloatArray4768[5] * f_1545_);
			float f_1548_
			    = (f_1541_
			       + class418_1505_.aFloatArray4768[3] * f_1544_
			       + class418_1505_.aFloatArray4768[7] * f_1545_);
			float f_1549_
			    = ((((Class173_Sub3)
				 ((Class157_Sub2) this).aClass173_Sub3_9130)
				.aFloat9743)
			       + (((Class173_Sub3)
				   ((Class157_Sub2) this).aClass173_Sub3_9130)
				  .aFloat9742) * f_1546_ / f_1548_);
			float f_1550_
			    = ((((Class173_Sub3)
				 ((Class157_Sub2) this).aClass173_Sub3_9130)
				.aFloat9751)
			       + (((Class173_Sub3)
				   ((Class157_Sub2) this).aClass173_Sub3_9130)
				  .aFloat9744) * f_1547_ / f_1548_);
			((Class108) class108).anInt1362
			    = (int) f_1542_ * 2074481145;
			((Class108) class108).anInt1372
			    = (int) f_1543_ * -1529168083;
			((Class108) class108).aFloat1369
			    = ((((Class173_Sub3)
				 ((Class157_Sub2) this).aClass173_Sub3_9130)
				.aFloat9747)
			       + ((((Class173_Sub3)
				    ((Class157_Sub2) this).aClass173_Sub3_9130)
				   .aFloat9746)
				  * (f_1540_
				     - (class418_1505_.aFloatArray4768[10]
					* (float) ((((Class90) class90)
						    .anInt1143)
						   * -1403392863)))
				  / f_1541_));
			((Class108) class108).anInt1370
			    = (int) (f_1549_ < f_1542_ ? f_1542_ - f_1549_
				     : f_1549_ - f_1542_) * 865553739;
			((Class108) class108).anInt1371
			    = (int) (f_1550_ < f_1543_ ? f_1543_ - f_1550_
				     : f_1550_ - f_1543_) * -764834855;
		    } else {
			Class108 class108_1551_ = class108;
			((Class108) class108).anInt1371 = 0;
			((Class108) class108_1551_).anInt1370 = 0;
		    }
		}
	    }
	    if (class159 != null) {
		boolean bool_1552_ = false;
		boolean bool_1553_ = true;
		int i_1554_ = ((((Class157_Sub2) this).aShort9184
				+ ((Class157_Sub2) this).aShort9185)
			       >> 1);
		int i_1555_ = ((((Class157_Sub2) this).aShort9186
				+ ((Class157_Sub2) this).aShort9144)
			       >> 1);
		int i_1556_ = i_1554_;
		short i_1557_ = ((Class157_Sub2) this).aShort9182;
		int i_1558_ = i_1555_;
		float f_1559_
		    = (class418_1521_.aFloatArray4768[0] * (float) i_1556_
		       + class418_1521_.aFloatArray4768[4] * (float) i_1557_
		       + class418_1521_.aFloatArray4768[8] * (float) i_1558_
		       + class418_1521_.aFloatArray4768[12]);
		float f_1560_
		    = (class418_1521_.aFloatArray4768[1] * (float) i_1556_
		       + class418_1521_.aFloatArray4768[5] * (float) i_1557_
		       + class418_1521_.aFloatArray4768[9] * (float) i_1558_
		       + class418_1521_.aFloatArray4768[13]);
		float f_1561_
		    = (class418_1521_.aFloatArray4768[2] * (float) i_1556_
		       + class418_1521_.aFloatArray4768[6] * (float) i_1557_
		       + class418_1521_.aFloatArray4768[10] * (float) i_1558_
		       + class418_1521_.aFloatArray4768[14]);
		float f_1562_
		    = (class418_1521_.aFloatArray4768[3] * (float) i_1556_
		       + class418_1521_.aFloatArray4768[7] * (float) i_1557_
		       + class418_1521_.aFloatArray4768[11] * (float) i_1558_
		       + class418_1521_.aFloatArray4768[15]);
		if (f_1561_ >= -f_1562_) {
		    class159.anInt1748
			= (int) ((((Class173_Sub3)
				   ((Class157_Sub2) this).aClass173_Sub3_9130)
				  .aFloat9743)
				 + (((Class173_Sub3) (((Class157_Sub2) this)
						      .aClass173_Sub3_9130))
				    .aFloat9742) * f_1559_ / f_1562_);
		    class159.anInt1750
			= (int) ((((Class173_Sub3)
				   ((Class157_Sub2) this).aClass173_Sub3_9130)
				  .aFloat9751)
				 + (((Class173_Sub3) (((Class157_Sub2) this)
						      .aClass173_Sub3_9130))
				    .aFloat9744) * f_1560_ / f_1562_);
		} else
		    bool_1552_ = true;
		i_1556_ = i_1554_;
		i_1557_ = ((Class157_Sub2) this).aShort9183;
		i_1558_ = i_1555_;
		float f_1563_
		    = (class418_1521_.aFloatArray4768[0] * (float) i_1556_
		       + class418_1521_.aFloatArray4768[4] * (float) i_1557_
		       + class418_1521_.aFloatArray4768[8] * (float) i_1558_
		       + class418_1521_.aFloatArray4768[12]);
		float f_1564_
		    = (class418_1521_.aFloatArray4768[1] * (float) i_1556_
		       + class418_1521_.aFloatArray4768[5] * (float) i_1557_
		       + class418_1521_.aFloatArray4768[9] * (float) i_1558_
		       + class418_1521_.aFloatArray4768[13]);
		float f_1565_
		    = (class418_1521_.aFloatArray4768[2] * (float) i_1556_
		       + class418_1521_.aFloatArray4768[6] * (float) i_1557_
		       + class418_1521_.aFloatArray4768[10] * (float) i_1558_
		       + class418_1521_.aFloatArray4768[14]);
		float f_1566_
		    = (class418_1521_.aFloatArray4768[3] * (float) i_1556_
		       + class418_1521_.aFloatArray4768[7] * (float) i_1557_
		       + class418_1521_.aFloatArray4768[11] * (float) i_1558_
		       + class418_1521_.aFloatArray4768[15]);
		if (f_1565_ >= -f_1566_) {
		    class159.anInt1749
			= (int) ((((Class173_Sub3)
				   ((Class157_Sub2) this).aClass173_Sub3_9130)
				  .aFloat9743)
				 + (((Class173_Sub3) (((Class157_Sub2) this)
						      .aClass173_Sub3_9130))
				    .aFloat9742) * f_1563_ / f_1566_);
		    class159.anInt1752
			= (int) ((((Class173_Sub3)
				   ((Class157_Sub2) this).aClass173_Sub3_9130)
				  .aFloat9751)
				 + (((Class173_Sub3) (((Class157_Sub2) this)
						      .aClass173_Sub3_9130))
				    .aFloat9744) * f_1564_ / f_1566_);
		} else
		    bool_1552_ = true;
		if (bool_1552_) {
		    if (f_1561_ < -f_1562_ && f_1565_ < -f_1566_)
			bool_1553_ = false;
		    else if (f_1561_ < -f_1562_) {
			float f_1567_
			    = (f_1561_ + f_1562_) / (f_1565_ + f_1566_) - 1.0F;
			float f_1568_
			    = f_1559_ + f_1567_ * (f_1563_ - f_1559_);
			float f_1569_
			    = f_1560_ + f_1567_ * (f_1564_ - f_1560_);
			float f_1570_
			    = f_1562_ + f_1567_ * (f_1566_ - f_1562_);
			class159.anInt1748
			    = (int) ((((Class173_Sub3) (((Class157_Sub2) this)
							.aClass173_Sub3_9130))
				      .aFloat9743)
				     + (((Class173_Sub3)
					 (((Class157_Sub2) this)
					  .aClass173_Sub3_9130)).aFloat9742
					* f_1568_ / f_1570_));
			class159.anInt1750
			    = (int) ((((Class173_Sub3) (((Class157_Sub2) this)
							.aClass173_Sub3_9130))
				      .aFloat9751)
				     + (((Class173_Sub3)
					 (((Class157_Sub2) this)
					  .aClass173_Sub3_9130)).aFloat9744
					* f_1569_ / f_1570_));
		    } else if (f_1565_ < -f_1566_) {
			float f_1571_
			    = (f_1565_ + f_1566_) / (f_1561_ + f_1562_) - 1.0F;
			float f_1572_
			    = f_1563_ + f_1571_ * (f_1559_ - f_1563_);
			float f_1573_
			    = f_1564_ + f_1571_ * (f_1560_ - f_1564_);
			float f_1574_
			    = f_1566_ + f_1571_ * (f_1562_ - f_1566_);
			class159.anInt1749
			    = (int) ((((Class173_Sub3) (((Class157_Sub2) this)
							.aClass173_Sub3_9130))
				      .aFloat9743)
				     + (((Class173_Sub3)
					 (((Class157_Sub2) this)
					  .aClass173_Sub3_9130)).aFloat9742
					* f_1572_ / f_1574_));
			class159.anInt1752
			    = (int) ((((Class173_Sub3) (((Class157_Sub2) this)
							.aClass173_Sub3_9130))
				      .aFloat9751)
				     + (((Class173_Sub3)
					 (((Class157_Sub2) this)
					  .aClass173_Sub3_9130)).aFloat9744
					* f_1573_ / f_1574_));
		    }
		}
		if (bool_1553_) {
		    if (f_1561_ / f_1562_ > f_1565_ / f_1566_) {
			float f_1575_
			    = (f_1559_
			       + (class418_1505_.aFloatArray4768[0]
				  * (float) ((Class157_Sub2) this).aShort9180)
			       + class418_1505_.aFloatArray4768[12]);
			float f_1576_
			    = (f_1562_
			       + (class418_1505_.aFloatArray4768[3]
				  * (float) ((Class157_Sub2) this).aShort9180)
			       + class418_1505_.aFloatArray4768[15]);
			class159.anInt1753
			    = (int) ((((Class173_Sub3) (((Class157_Sub2) this)
							.aClass173_Sub3_9130))
				      .aFloat9743)
				     - (float) class159.anInt1748
				     + (((Class173_Sub3)
					 (((Class157_Sub2) this)
					  .aClass173_Sub3_9130)).aFloat9742
					* f_1575_ / f_1576_));
		    } else {
			float f_1577_
			    = (f_1563_
			       + (class418_1505_.aFloatArray4768[0]
				  * (float) ((Class157_Sub2) this).aShort9180)
			       + class418_1505_.aFloatArray4768[12]);
			float f_1578_
			    = (f_1566_
			       + (class418_1505_.aFloatArray4768[3]
				  * (float) ((Class157_Sub2) this).aShort9180)
			       + class418_1505_.aFloatArray4768[15]);
			class159.anInt1753
			    = (int) ((((Class173_Sub3) (((Class157_Sub2) this)
							.aClass173_Sub3_9130))
				      .aFloat9743)
				     - (float) class159.anInt1749
				     + (((Class173_Sub3)
					 (((Class157_Sub2) this)
					  .aClass173_Sub3_9130)).aFloat9742
					* f_1577_ / f_1578_));
		    }
		    class159.aBool1751 = true;
		}
	    }
	    method8402(true);
	    ((Class121) ((Class157_Sub2) this).aClass121_9200).aBool1501
		= (i & 0x1) == 0;
	    ((Class121) ((Class157_Sub2) this).aClass121_9200).aBool1502
		= false;
	    try {
		method8438((((Class173_Sub3)
			     ((Class157_Sub2) this).aClass173_Sub3_9130)
			    .anIntArray9719) != null,
			   (((Class173_Sub3)
			     ((Class157_Sub2) this).aClass173_Sub3_9130)
			    .aFloatArray9716) != null,
			   (i & 0x4) != 0, bool_1522_,
			   ((((Class107)
			      ((Class157_Sub2) this).aClass107_9121).aBool1327
			     && f_1520_ > (((Class107) (((Class157_Sub2) this)
							.aClass107_9121))
					   .aFloat1320))
			    || ((Class107) (((Class157_Sub2) this)
					    .aClass107_9121)).aBool1324));
	    } catch (Exception exception) {
		/* empty */
	    }
	    if (((Class157_Sub2) this).aClass90Array9156 != null) {
		for (int i_1579_ = 0;
		     i_1579_ < ((Class157_Sub2) this).anInt9143; i_1579_++)
		    ((Class157_Sub2) this).anIntArray9193[i_1579_] = -1;
	    }
	    ((Class157_Sub2) this).aClass121_9200 = null;
	    if ((((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
		 .anInt9745) * -1585405167
		> 1) {
		synchronized (this) {
		    ((Class157_Sub2) this).aBool9120 = false;
		    this.notifyAll();
		}
	    }
	}
    }
    
    void method2028() {
	if ((((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
	     .anInt9745) * -1585405167
	    > 1) {
	    synchronized (this) {
		while (aBool1738) {
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		aBool1738 = true;
	    }
	}
    }
    
    void method2029() {
	if ((((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
	     .anInt9745) * -1585405167
	    > 1) {
	    synchronized (this) {
		while (aBool1738) {
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		aBool1738 = true;
	    }
	}
    }
    
    void method2030() {
	if ((((Class173_Sub3) ((Class157_Sub2) this).aClass173_Sub3_9130)
	     .anInt9745) * -1585405167
	    > 1) {
	    synchronized (this) {
		while (aBool1738) {
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		aBool1738 = true;
	    }
	}
    }
}
