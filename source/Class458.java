/* Class458 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class458
{
    static final int anInt5008 = 64;
    Class5_Sub18 aClass5_Sub18_5009;
    int[] anIntArray5010;
    protected Class538 aClass538_5011;
    static final int anInt5012 = 0;
    public int anInt5013 = 0;
    public boolean aBool5014 = false;
    public boolean aBool5015 = false;
    public boolean aBool5016 = false;
    public boolean aBool5017 = false;
    int[] anIntArray5018;
    protected int anInt5019;
    int anInt5020;
    int[] anIntArray5021;
    int[] anIntArray5022;
    public boolean aBool5023;
    static int[] anIntArray5024;
    byte[][][] aByteArrayArrayArray5025;
    int[] anIntArray5026;
    boolean aBool5027;
    short[][][] aShortArrayArrayArray5028;
    protected byte[][][] aByteArrayArrayArray5029;
    static int[][] anIntArrayArray5030;
    int[] anIntArray5031;
    byte[][][] aByteArrayArrayArray5032;
    static final int anInt5033 = 256;
    static final int anInt5034 = 16;
    int[] anIntArray5035;
    static final int anInt5036 = 1;
    static final int anInt5037 = 512;
    static final int anInt5038 = 3;
    static final int anInt5039 = 1;
    static final int anInt5040 = 2;
    int[] anIntArray5041;
    static final int anInt5042 = 8;
    int[] anIntArray5043;
    static final int anInt5044 = 32;
    static int[][] anIntArrayArray5045;
    static final int anInt5046 = 128;
    int[] anIntArray5047;
    static final int anInt5048 = 2;
    public int anInt5049;
    static boolean[][] aBoolArrayArray5050;
    static int[] anIntArray5051;
    short[][][] aShortArrayArrayArray5052;
    static int[] anIntArray5053;
    static int[] anIntArray5054;
    static int[] anIntArray5055;
    static boolean[][] aBoolArrayArray5056;
    static boolean[][] aBoolArrayArray5057;
    public byte[][][] aByteArrayArrayArray5058;
    protected int anInt5059;
    static int[][] anIntArrayArray5060;
    static int[][] anIntArrayArray5061;
    protected boolean aBool5062;
    static int[][] anIntArrayArray5063;
    static int[][] anIntArrayArray5064;
    static int[][] anIntArrayArray5065;
    static int[] anIntArray5066;
    static boolean[][] aBoolArrayArray5067;
    static int[][] anIntArrayArray5068;
    static int[][] anIntArrayArray5069;
    static int[][] anIntArrayArray5070;
    static int[][] anIntArrayArray5071;
    int[] anIntArray5072 = new int[6];
    int[] anIntArray5073 = new int[13];
    int[] anIntArray5074 = new int[13];
    boolean aBool5075;
    int[] anIntArray5076;
    int[] anIntArray5077;
    Class5_Sub11 aClass5_Sub11_5078;
    protected Class466 aClass466_5079;
    static int[] anIntArray5080;
    int anInt5081;
    boolean aBool5082;
    static final int anInt5083 = 4;
    int anInt5084;
    int anInt5085;
    boolean aBool5086;
    public int[][][] anIntArrayArrayArray5087;
    static final int anInt5088 = 0;
    static int[] anIntArray5089
	= { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };
    int anInt5090;
    int anInt5091;
    int anInt5092;
    int anInt5093;
    int[] anIntArray5094;
    int anInt5095;
    
    public void method5533(int i) {
	aBool5062 = true;
    }
    
    final void method5534(ByteBuffer class528_sub42, int i, int i_0_,
			  int i_1_, int i_2_, int i_3_, int i_4_, int i_5_,
			  int i_6_, boolean bool, int i_7_) {
	if (1 == i_6_)
	    i_3_ = 1;
	else if (2 == i_6_) {
	    i_2_ = 1;
	    i_3_ = 1;
	} else if (3 == i_6_)
	    i_2_ = 1;
	if (i_0_ >= 0 && i_0_ < -2112239803 * anInt5019 && i_1_ >= 0
	    && i_1_ < anInt5059 * -828725691) {
	    if (!aBool5023 && !bool)
		aClass466_5079.aByteArrayArrayArray5312[i][i_0_][i_1_]
		    = (byte) 0;
	    int i_8_ = class528_sub42.readUnsignedByte((byte) 61);
	    if ((i_8_ & 0x1) != 0) {
		if (bool) {
		    class528_sub42.readUnsignedByte((byte) 10);
		    class528_sub42.method9719(65280);
		} else {
		    int i_9_ = class528_sub42.readUnsignedByte((byte) 118);
		    ((Class458) this).aShortArrayArrayArray5028[i][i_0_][i_1_]
			= (short) class528_sub42.method9719(65280);
		    ((Class458) this).aByteArrayArrayArray5025[i][i_0_][i_1_]
			= (byte) (i_9_ >> 2);
		    ((Class458) this).aByteArrayArrayArray5032[i][i_0_][i_1_]
			= (byte) (i_9_ + i_6_ & 0x3);
		}
	    }
	    if (0 != (i_8_ & 0x2)) {
		if (!aBool5023 && !bool)
		    aClass466_5079.aByteArrayArrayArray5312[i][i_0_][i_1_]
			= class528_sub42.method9627(-1422456354);
		else
		    class528_sub42.pointer += 2015001547;
	    }
	    if ((i_8_ & 0x4) != 0) {
		if (bool)
		    class528_sub42.method9719(65280);
		else
		    ((Class458) this).aShortArrayArrayArray5052[i][i_0_][i_1_]
			= (short) class528_sub42.method9719(65280);
	    }
	    if (0 != (i_8_ & 0x8)) {
		int i_10_ = class528_sub42.readUnsignedByte((byte) 31);
		if (!aBool5023) {
		    if (1 == i_10_)
			i_10_ = 0;
		    if (i == 0)
			anIntArrayArrayArray5087[0][i_0_ + i_2_][i_3_ + i_1_]
			    = -i_10_ * 8 << 2;
		    else
			anIntArrayArrayArray5087[i][i_2_ + i_0_][i_3_ + i_1_]
			    = (anIntArrayArrayArray5087[i - 1][i_0_ + i_2_]
			       [i_3_ + i_1_]) - (i_10_ * 8 << 2);
		} else
		    anIntArrayArrayArray5087[0][i_2_ + i_0_][i_3_ + i_1_]
			= i_10_ * 8 << 2;
	    } else if (aBool5023)
		anIntArrayArrayArray5087[0][i_0_ + i_2_][i_3_ + i_1_] = 0;
	    else if (i == 0)
		anIntArrayArrayArray5087[0][i_2_ + i_0_][i_1_ + i_3_]
		    = -Class676.method7948(932731 + i_4_, i_5_ + 556238,
					   419747626) * 8 << 2;
	    else
		anIntArrayArrayArray5087[i][i_2_ + i_0_][i_3_ + i_1_]
		    = (anIntArrayArrayArray5087[i - 1][i_2_ + i_0_]
		       [i_1_ + i_3_]) - 960;
	} else {
	    int i_11_ = class528_sub42.readUnsignedByte((byte) 8);
	    if (0 != (i_11_ & 0x1)) {
		class528_sub42.readUnsignedByte((byte) 30);
		class528_sub42.method9719(65280);
	    }
	    if (0 != (i_11_ & 0x2))
		class528_sub42.pointer += 2015001547;
	    if (0 != (i_11_ & 0x4))
		class528_sub42.method9719(65280);
	    if ((i_11_ & 0x8) != 0)
		class528_sub42.readUnsignedByte((byte) 12);
	}
    }
    
    public final void method5535(int i, int i_12_, int i_13_, int i_14_,
				 int i_15_, byte i_16_) {
	for (int i_17_ = i_13_; i_17_ < i_15_ + i_13_; i_17_++) {
	    for (int i_18_ = i_12_; i_18_ < i_14_ + i_12_; i_18_++) {
		if (i_18_ >= 0 && i_18_ < -2112239803 * anInt5019 && i_17_ >= 0
		    && i_17_ < anInt5059 * -828725691)
		    anIntArrayArrayArray5087[i][i_18_][i_17_]
			= i > 0 ? (anIntArrayArrayArray5087[i - 1][i_18_]
				   [i_17_]) - 960 : 0;
	    }
	}
	if (i_12_ > 0 && i_12_ < -2112239803 * anInt5019) {
	    for (int i_19_ = i_13_ + 1; i_19_ < i_15_ + i_13_; i_19_++) {
		if (i_19_ >= 0 && i_19_ < anInt5059 * -828725691)
		    anIntArrayArrayArray5087[i][i_12_][i_19_]
			= anIntArrayArrayArray5087[i][i_12_ - 1][i_19_];
	    }
	}
	if (i_13_ > 0 && i_13_ < -828725691 * anInt5059) {
	    for (int i_20_ = i_12_ + 1; i_20_ < i_12_ + i_14_; i_20_++) {
		if (i_20_ >= 0 && i_20_ < -2112239803 * anInt5019)
		    anIntArrayArrayArray5087[i][i_20_][i_13_]
			= anIntArrayArrayArray5087[i][i_20_][i_13_ - 1];
	    }
	}
	if (i_12_ >= 0 && i_13_ >= 0 && i_12_ < -2112239803 * anInt5019
	    && i_13_ < anInt5059 * -828725691) {
	    if (0 == i) {
		if (i_12_ > 0
		    && 0 != anIntArrayArrayArray5087[i][i_12_ - 1][i_13_])
		    anIntArrayArrayArray5087[i][i_12_][i_13_]
			= anIntArrayArrayArray5087[i][i_12_ - 1][i_13_];
		else if (i_13_ > 0
			 && anIntArrayArrayArray5087[i][i_12_][i_13_ - 1] != 0)
		    anIntArrayArrayArray5087[i][i_12_][i_13_]
			= anIntArrayArrayArray5087[i][i_12_][i_13_ - 1];
		else if (i_12_ > 0 && i_13_ > 0
			 && 0 != (anIntArrayArrayArray5087[i][i_12_ - 1]
				  [i_13_ - 1]))
		    anIntArrayArrayArray5087[i][i_12_][i_13_]
			= anIntArrayArrayArray5087[i][i_12_ - 1][i_13_ - 1];
	    } else if (i_12_ > 0
		       && (anIntArrayArrayArray5087[i - 1][i_12_ - 1][i_13_]
			   != anIntArrayArrayArray5087[i][i_12_ - 1][i_13_]))
		anIntArrayArrayArray5087[i][i_12_][i_13_]
		    = anIntArrayArrayArray5087[i][i_12_ - 1][i_13_];
	    else if (i_13_ > 0
		     && (anIntArrayArrayArray5087[i - 1][i_12_][i_13_ - 1]
			 != anIntArrayArrayArray5087[i][i_12_][i_13_ - 1]))
		anIntArrayArrayArray5087[i][i_12_][i_13_]
		    = anIntArrayArrayArray5087[i][i_12_][i_13_ - 1];
	    else if (i_12_ > 0 && i_13_ > 0
		     && (anIntArrayArrayArray5087[i][i_12_ - 1][i_13_ - 1]
			 != (anIntArrayArrayArray5087[i - 1][i_12_ - 1]
			     [i_13_ - 1])))
		anIntArrayArrayArray5087[i][i_12_][i_13_]
		    = anIntArrayArrayArray5087[i][i_12_ - 1][i_13_ - 1];
	}
    }
    
    public final void method5536(ByteBuffer class528_sub42, int i,
				 int i_21_, int i_22_, int i_23_, byte i_24_) {
	int i_25_ = i + i_22_;
	int i_26_ = i_21_ + i_23_;
	for (int i_27_ = 0; i_27_ < anInt5049 * -1767130973; i_27_++) {
	    for (int i_28_ = 0; i_28_ < 64; i_28_++) {
		for (int i_29_ = 0; i_29_ < 64; i_29_++)
		    method5534(class528_sub42, i_27_, i + i_28_, i_29_ + i_21_,
			       0, 0, i_25_ + i_28_, i_26_ + i_29_, 0, false,
			       595300557);
	    }
	}
    }
    
    public final void method5537(ByteBuffer class528_sub42, int i,
				 int i_30_, int i_31_, int i_32_, int i_33_,
				 int i_34_, int i_35_, int i_36_) {
	int i_37_ = (i_33_ & 0x7) * 8;
	int i_38_ = 8 * (i_34_ & 0x7);
	int i_39_ = (i_33_ & ~0x7) << 3;
	int i_40_ = (i_34_ & ~0x7) << 3;
	int i_41_ = 0;
	int i_42_ = 0;
	if (1 == i_35_)
	    i_42_ = 1;
	else if (2 == i_35_) {
	    i_41_ = 1;
	    i_42_ = 1;
	} else if (i_35_ == 3)
	    i_41_ = 1;
	for (int i_43_ = 0; i_43_ < -1767130973 * anInt5049; i_43_++) {
	    for (int i_44_ = 0; i_44_ < 64; i_44_++) {
		for (int i_45_ = 0; i_45_ < 64; i_45_++) {
		    if (i_43_ == i_32_ && i_44_ >= i_37_ && i_44_ <= 8 + i_37_
			&& i_45_ >= i_38_ && i_45_ <= i_38_ + 8) {
			int i_46_;
			int i_47_;
			if (i_44_ == i_37_ + 8 || i_38_ + 8 == i_45_) {
			    if (i_35_ == 0) {
				i_46_ = i_44_ - i_37_ + i_30_;
				i_47_ = i_31_ + (i_45_ - i_38_);
			    } else if (1 == i_35_) {
				i_46_ = i_45_ - i_38_ + i_30_;
				i_47_ = 8 + i_31_ - (i_44_ - i_37_);
			    } else if (i_35_ == 2) {
				i_46_ = i_30_ + 8 - (i_44_ - i_37_);
				i_47_ = 8 + i_31_ - (i_45_ - i_38_);
			    } else {
				i_46_ = 8 + i_30_ - (i_45_ - i_38_);
				i_47_ = i_31_ + (i_44_ - i_37_);
			    }
			    method5534(class528_sub42, i, i_46_, i_47_, 0, 0,
				       i_39_ + i_44_, i_45_ + i_40_, 0, true,
				       1173705284);
			} else {
			    i_46_ = i_30_ + Class379.method4712(i_44_ & 0x7,
								i_45_ & 0x7,
								i_35_,
								(byte) 49);
			    i_47_ = i_31_ + Class73.method1115(i_44_ & 0x7,
							       i_45_ & 0x7,
							       i_35_,
							       -623444994);
			    method5534(class528_sub42, i, i_46_, i_47_, i_41_,
				       i_42_, i_39_ + i_44_, i_45_ + i_40_,
				       i_35_, false, -362499356);
			}
			if (i_44_ == 63 || 63 == i_45_) {
			    int i_48_ = 1;
			    if (63 == i_44_ && 63 == i_45_)
				i_48_ = 3;
			    for (int i_49_ = 0; i_49_ < i_48_; i_49_++) {
				int i_50_ = i_44_;
				int i_51_ = i_45_;
				if (i_49_ == 0) {
				    i_50_ = i_44_ == 63 ? 64 : i_44_;
				    i_51_ = 63 == i_45_ ? 64 : i_45_;
				} else if (1 == i_49_)
				    i_50_ = 64;
				else if (i_49_ == 2)
				    i_51_ = 64;
				int i_52_;
				int i_53_;
				if (i_35_ == 0) {
				    i_52_ = i_30_ + (i_50_ - i_37_);
				    i_53_ = i_51_ - i_38_ + i_31_;
				} else if (1 == i_35_) {
				    i_52_ = i_30_ + (i_51_ - i_38_);
				    i_53_ = i_31_ + 8 - (i_50_ - i_37_);
				} else if (2 == i_35_) {
				    i_52_ = 8 + i_30_ - (i_50_ - i_37_);
				    i_53_ = 8 + i_31_ - (i_51_ - i_38_);
				} else {
				    i_52_ = i_30_ + 8 - (i_51_ - i_38_);
				    i_53_ = i_50_ - i_37_ + i_31_;
				}
				if (i_52_ >= 0
				    && i_52_ < -2112239803 * anInt5019
				    && i_53_ >= 0
				    && i_53_ < -828725691 * anInt5059)
				    anIntArrayArrayArray5087[i][i_52_][i_53_]
					= (anIntArrayArrayArray5087[i]
					   [i_41_ + i_46_][i_47_ + i_42_]);
			    }
			}
		    } else
			method5534(class528_sub42, 0, -1, -1, 0, 0, 0, 0, 0,
				   false, 391448954);
		}
	    }
	}
    }
    
    public final void method5538(int i, int[][] is, int i_54_) {
	int[][] is_55_ = anIntArrayArrayArray5087[i];
	for (int i_56_ = 0; i_56_ < 1 + anInt5019 * -2112239803; i_56_++) {
	    for (int i_57_ = 0; i_57_ < -828725691 * anInt5059 + 1; i_57_++)
		is_55_[i_56_][i_57_] += is[i_56_][i_57_];
	}
    }
    
    public void method5539(Class173 class173, int[][][] is, int i) {
	for (int i_58_ = 0; i_58_ < -1767130973 * anInt5049; i_58_++) {
	    int i_59_ = 0;
	    int i_60_ = 0;
	    if (!aBool5023) {
		if (aBool5014)
		    i_60_ |= 0x8;
		if (aBool5015)
		    i_59_ |= 0x2;
		if (anInt5013 * 685638831 != 0) {
		    i_59_ |= 0x1;
		    i_60_ |= 0x10;
		}
	    }
	    if (aBool5015)
		i_60_ |= 0x7;
	    if (!aBool5017)
		i_60_ |= 0x20;
	    int[][] is_61_ = (null != is && i_58_ < is.length ? is[i_58_]
			      : anIntArrayArrayArray5087[i_58_]);
	    aClass538_5011.method6538
		(i_58_,
		 class173.method2369(anInt5019 * -2112239803,
				     anInt5059 * -828725691,
				     anIntArrayArrayArray5087[i_58_], is_61_,
				     512, i_59_, i_60_),
		 (byte) 48);
	}
    }
    
    static final int method5540(int i, int i_62_) {
	int i_63_
	    = (Class164.method2091(i + 45365, 91923 + i_62_, 4, (byte) 0) - 128
	       + ((Class164.method2091(10294 + i, 37821 + i_62_, 2, (byte) 0)
		   - 128)
		  >> 1)
	       + (Class164.method2091(i, i_62_, 1, (byte) 0) - 128 >> 2));
	i_63_ = 35 + (int) (0.3 * (double) i_63_);
	if (i_63_ < 10)
	    i_63_ = 10;
	else if (i_63_ > 60)
	    i_63_ = 60;
	return i_63_;
    }
    
    void method5541(Class173 class173, Class137 class137, int i, int[][] is,
		    Class137 class137_64_, Class137 class137_65_, byte i_66_) {
	for (int i_67_ = 0; i_67_ < -2112239803 * anInt5019; i_67_++) {
	    for (int i_68_ = 0; i_68_ < -828725691 * anInt5059; i_68_++) {
		byte i_69_ = (((Class458) this).aByteArrayArrayArray5025[i]
			      [i_67_][i_68_]);
		byte i_70_ = (((Class458) this).aByteArrayArrayArray5032[i]
			      [i_67_][i_68_]);
		int i_71_ = ((((Class458) this).aShortArrayArrayArray5028[i]
			      [i_67_][i_68_])
			     & 0x7fff);
		int i_72_ = ((((Class458) this).aShortArrayArrayArray5052[i]
			      [i_67_][i_68_])
			     & 0x7fff);
		Class636 class636
		    = (Class636) (i_71_ != 0
				  ? ((Class458) this).aClass5_Sub11_5078
					.method63(i_71_ - 1, 1394779345)
				  : null);
		Class680 class680
		    = (Class680) (i_72_ != 0
				  ? ((Class458) this).aClass5_Sub18_5009
					.method63(i_72_ - 1, 1728331230)
				  : null);
		if (i_69_ == 0 && null == class636)
		    i_69_ = (byte) 12;
		Class636 class636_73_ = class636;
		if (null != class636 && -1 == 491679725 * class636.anInt8230
		    && -1 == class636.anInt8233 * -685171829) {
		    class636_73_ = class636;
		    class636 = null;
		}
		if (null != class636 || class680 != null) {
		    ((Class458) this).anInt5090
			= 41776263 * anIntArray5066[i_69_];
		    ((Class458) this).anInt5091
			= anIntArray5089[i_69_] * 1489240955;
		    int i_74_
			= ((class636 != null
			    ? -1459919949 * ((Class458) this).anInt5091 : 0)
			   + (class680 != null
			      ? -1644621513 * ((Class458) this).anInt5090
			      : 0));
		    int i_75_ = 0;
		    ((Class458) this).anInt5093 = 0;
		    ((Class458) this).anInt5020
			= (null != class636 ? class636.anInt8228 * 1038388161
			   : -1) * -1357522847;
		    int i_76_ = (class680 != null
				 ? class680.anInt8566 * 468843493 : -1);
		    int[] is_77_ = new int[i_74_];
		    int[] is_78_ = new int[i_74_];
		    int[] is_79_ = new int[i_74_];
		    int[] is_80_ = new int[i_74_];
		    int[] is_81_ = new int[i_74_];
		    int[] is_82_ = new int[i_74_];
		    int[] is_83_ = ((class636 != null
				     && -685171829 * class636.anInt8233 != -1)
				    ? new int[i_74_] : null);
		    if (class636 != null) {
			for (int i_84_ = 0;
			     i_84_ < -1459919949 * ((Class458) this).anInt5091;
			     i_84_++) {
			    is_77_[i_75_] = (anIntArrayArray5030[i_69_]
					     [-1433601173 * (((Class458) this)
							     .anInt5093)]);
			    is_78_[i_75_] = (anIntArrayArray5060[i_69_]
					     [(((Class458) this).anInt5093
					       * -1433601173)]);
			    is_79_[i_75_] = (anIntArrayArray5061[i_69_]
					     [(((Class458) this).anInt5093
					       * -1433601173)]);
			    is_81_[i_75_]
				= ((Class458) this).anInt5020 * -143733855;
			    is_82_[i_75_] = -1055844967 * class636.anInt8234;
			    is_80_[i_75_] = class636.anInt8230 * 491679725;
			    if (is_83_ != null)
				is_83_[i_75_]
				    = -685171829 * class636.anInt8233;
			    i_75_++;
			    ((Class458) this).anInt5093 += 1536579907;
			}
			if (!aBool5023 && 0 == i)
			    aClass538_5011.method6588
				(i_67_, i_68_, class636.anInt8239 * 1959448349,
				 class636.anInt8244 * -1942070184,
				 class636.anInt8231 * 351460333,
				 1145965491 * class636.anInt8241,
				 class636.anInt8242 * -675060273,
				 881506237 * class636.anInt8240, (byte) 115);
		    } else
			((Class458) this).anInt5093
			    += -1420406055 * ((Class458) this).anInt5091;
		    if (class680 != null) {
			for (int i_85_ = 0;
			     i_85_ < ((Class458) this).anInt5090 * -1644621513;
			     i_85_++) {
			    is_77_[i_75_] = (anIntArrayArray5030[i_69_]
					     [(((Class458) this).anInt5093
					       * -1433601173)]);
			    is_78_[i_75_] = (anIntArrayArray5060[i_69_]
					     [(((Class458) this).anInt5093
					       * -1433601173)]);
			    is_79_[i_75_] = (anIntArrayArray5061[i_69_]
					     [-1433601173 * (((Class458) this)
							     .anInt5093)]);
			    is_81_[i_75_] = i_76_;
			    is_82_[i_75_] = -690160275 * class680.anInt8567;
			    is_80_[i_75_] = is[i_67_][i_68_];
			    if (is_83_ != null)
				is_83_[i_75_] = is_80_[i_75_];
			    i_75_++;
			    ((Class458) this).anInt5093 += 1536579907;
			}
		    }
		    int i_86_ = anIntArray5055.length;
		    int[] is_87_ = new int[i_86_];
		    int[] is_88_ = new int[i_86_];
		    int[] is_89_
			= null != class137_65_ ? new int[i_86_] : null;
		    int[] is_90_
			= (class137_65_ != null || null != class137_64_
			   ? new int[i_86_] : null);
		    for (int i_91_ = 0; i_91_ < i_86_; i_91_++) {
			int i_92_ = anIntArray5055[i_91_];
			int i_93_ = anIntArray5080[i_91_];
			if (i_70_ == 0) {
			    is_87_[i_91_] = i_92_;
			    is_88_[i_91_] = i_93_;
			} else if (1 == i_70_) {
			    int i_94_ = i_92_;
			    is_87_[i_91_] = i_93_;
			    is_88_[i_91_] = 512 - i_94_;
			} else if (i_70_ == 2) {
			    is_87_[i_91_] = 512 - i_92_;
			    is_88_[i_91_] = 512 - i_93_;
			} else if (3 == i_70_) {
			    int i_95_ = i_92_;
			    is_87_[i_91_] = 512 - i_93_;
			    is_88_[i_91_] = i_95_;
			}
			if (null != is_89_
			    && aBoolArrayArray5057[i_69_][i_91_]) {
			    int i_96_ = (i_67_ << 9) + is_87_[i_91_];
			    int i_97_ = (i_68_ << 9) + is_88_[i_91_];
			    is_89_[i_91_]
				= (class137_65_.method1656(i_96_, i_97_,
							   1857245992)
				   - class137.method1656(i_96_, i_97_,
							 1641837548));
			}
			if (null != is_90_) {
			    if (null != class137_65_
				&& !aBoolArrayArray5057[i_69_][i_91_]) {
				int i_98_ = (i_67_ << 9) + is_87_[i_91_];
				int i_99_ = is_88_[i_91_] + (i_68_ << 9);
				is_90_[i_91_]
				    = (class137.method1656(i_98_, i_99_,
							   1000943000)
				       - class137_65_.method1656(i_98_, i_99_,
								 2094338244));
			    } else if (class137_64_ != null
				       && !aBoolArrayArray5050[i_69_][i_91_]) {
				int i_100_ = is_87_[i_91_] + (i_67_ << 9);
				int i_101_ = is_88_[i_91_] + (i_68_ << 9);
				is_90_[i_91_]
				    = (class137_64_.method1656(i_100_, i_101_,
							       1114099330)
				       - class137.method1656(i_100_, i_101_,
							     1323982206));
			    }
			}
		    }
		    int i_102_ = class137.method1669(i_67_, i_68_, (byte) 0);
		    int i_103_
			= class137.method1669(i_67_ + 1, i_68_, (byte) 0);
		    int i_104_
			= class137.method1669(1 + i_67_, 1 + i_68_, (byte) 0);
		    int i_105_
			= class137.method1669(i_67_, 1 + i_68_, (byte) 0);
		    boolean bool = aClass466_5079.method5633(i_67_, i_68_,
							     (short) 25564);
		    if (bool && i > 1 || !bool && i > 0) {
			boolean bool_106_ = true;
			if (null != class680 && !class680.aBool8569)
			    bool_106_ = false;
			else if (0 == i_72_ && i_69_ != 0)
			    bool_106_ = false;
			else if (i_71_ > 0 && class636_73_ != null
				 && !class636_73_.aBool8232)
			    bool_106_ = false;
			if (bool_106_ && i_103_ == i_102_ && i_102_ == i_104_
			    && i_105_ == i_102_)
			    aByteArrayArrayArray5029[i][i_67_][i_68_] |= 0x4;
		    }
		    Class164 class164 = new Class164();
		    if (aBool5023) {
			class164.anInt1827
			    = (aClass538_5011.method6539(i_67_, i_68_,
							 (short) 512)
			       * -773326249);
			class164.anInt1828
			    = (aClass538_5011.method6575(i_67_, i_68_,
							 1229029821)
			       * 516788591);
			class164.anInt1829
			    = (aClass538_5011.method6540(i_67_, i_68_,
							 (byte) 36)
			       * -1923235093);
			class164.anInt1831
			    = (aClass538_5011.method6548(i_67_, i_68_,
							 1239022665)
			       * -1247427665);
			class164.anInt1832
			    = (aClass538_5011.method6541(i_67_, i_68_,
							 -2088910395)
			       * 1420649565);
			class164.anInt1833
			    = (aClass538_5011.method6542(i_67_, i_68_,
							 1789536863)
			       * -589047283);
		    }
		    class137.method1652(i_67_, i_68_, is_87_, is_89_, is_88_,
					is_90_, is_77_, is_78_, is_79_, is_80_,
					is_83_, is_81_, is_82_, class164,
					false);
		    aClass538_5011.method6582(i, i_67_, i_68_, 393409586);
		}
	    }
	}
    }
    
    final void method5542(Class173 class173, Class636 class636,
			  Class680 class680, int i, int i_107_, int i_108_,
			  int i_109_, short[][] is, byte[][] is_110_,
			  byte[][] is_111_, boolean[] bools, int i_112_) {
	boolean[] bools_113_
	    = (null != class636 && class636.aBool8238
	       ? aBoolArrayArray5067[((Class458) this).anInt5095 * 85124233]
	       : aBoolArrayArray5056[85124233 * ((Class458) this).anInt5095]);
	if (i_107_ > 0) {
	    if (i > 0) {
		int i_114_ = is[i - 1][i_107_ - 1] & 0x7fff;
		if (i_114_ > 0) {
		    Class636 class636_115_
			= (Class636) ((Class458) this).aClass5_Sub11_5078
					 .method63(i_114_ - 1, -218467413);
		    if (class636_115_.anInt8230 * 491679725 != -1
			&& class636_115_.aBool8238) {
			byte i_116_ = is_110_[i - 1][i_107_ - 1];
			int i_117_ = 4 + 2 * is_111_[i - 1][i_107_ - 1] & 0x7;
			int i_118_
			    = Class390.method4780(class173, class636_115_,
						  -2112590362);
			if (aBoolArrayArray5057[i_116_][i_117_]) {
			    ((Class458) this).anIntArray5073[0]
				= 491679725 * class636_115_.anInt8230;
			    ((Class458) this).anIntArray5074[0] = i_118_;
			    ((Class458) this).anIntArray5021[0]
				= 1038388161 * class636_115_.anInt8228;
			    ((Class458) this).anIntArray5076[0]
				= -1055844967 * class636_115_.anInt8234;
			    ((Class458) this).anIntArray5077[0]
				= class636_115_.anInt8236 * 538679245;
			    ((Class458) this).anIntArray5018[0] = 256;
			}
		    }
		}
	    }
	    if (i < i_108_ - 1) {
		int i_119_ = is[i + 1][i_107_ - 1] & 0x7fff;
		if (i_119_ > 0) {
		    Class636 class636_120_
			= (Class636) ((Class458) this).aClass5_Sub11_5078
					 .method63(i_119_ - 1, -628141925);
		    if (-1 != class636_120_.anInt8230 * 491679725
			&& class636_120_.aBool8238) {
			byte i_121_ = is_110_[1 + i][i_107_ - 1];
			int i_122_ = is_111_[1 + i][i_107_ - 1] * 2 + 6 & 0x7;
			int i_123_
			    = Class390.method4780(class173, class636_120_,
						  -1949362792);
			if (aBoolArrayArray5057[i_121_][i_122_]) {
			    ((Class458) this).anIntArray5073[2]
				= class636_120_.anInt8230 * 491679725;
			    ((Class458) this).anIntArray5074[2] = i_123_;
			    ((Class458) this).anIntArray5021[2]
				= 1038388161 * class636_120_.anInt8228;
			    ((Class458) this).anIntArray5076[2]
				= class636_120_.anInt8234 * -1055844967;
			    ((Class458) this).anIntArray5077[2]
				= class636_120_.anInt8236 * 538679245;
			    ((Class458) this).anIntArray5018[2] = 512;
			}
		    }
		}
	    }
	}
	if (i_107_ < i_109_ - 1) {
	    if (i > 0) {
		int i_124_ = is[i - 1][i_107_ + 1] & 0x7fff;
		if (i_124_ > 0) {
		    Class636 class636_125_
			= (Class636) ((Class458) this).aClass5_Sub11_5078
					 .method63(i_124_ - 1, -1885562594);
		    if (-1 != class636_125_.anInt8230 * 491679725
			&& class636_125_.aBool8238) {
			byte i_126_ = is_110_[i - 1][i_107_ + 1];
			int i_127_ = is_111_[i - 1][i_107_ + 1] * 2 + 2 & 0x7;
			int i_128_
			    = Class390.method4780(class173, class636_125_,
						  -1599724424);
			if (aBoolArrayArray5057[i_126_][i_127_]) {
			    ((Class458) this).anIntArray5073[6]
				= 491679725 * class636_125_.anInt8230;
			    ((Class458) this).anIntArray5074[6] = i_128_;
			    ((Class458) this).anIntArray5021[6]
				= class636_125_.anInt8228 * 1038388161;
			    ((Class458) this).anIntArray5076[6]
				= -1055844967 * class636_125_.anInt8234;
			    ((Class458) this).anIntArray5077[6]
				= class636_125_.anInt8236 * 538679245;
			    ((Class458) this).anIntArray5018[6] = 64;
			}
		    }
		}
	    }
	    if (i < i_108_ - 1) {
		int i_129_ = is[1 + i][1 + i_107_] & 0x7fff;
		if (i_129_ > 0) {
		    Class636 class636_130_
			= (Class636) ((Class458) this).aClass5_Sub11_5078
					 .method63(i_129_ - 1, 1785299694);
		    if (class636_130_.anInt8230 * 491679725 != -1
			&& class636_130_.aBool8238) {
			byte i_131_ = is_110_[i + 1][i_107_ + 1];
			int i_132_ = is_111_[1 + i][i_107_ + 1] * 2 + 0 & 0x7;
			int i_133_
			    = Class390.method4780(class173, class636_130_,
						  -26131242);
			if (aBoolArrayArray5057[i_131_][i_132_]) {
			    ((Class458) this).anIntArray5073[4]
				= 491679725 * class636_130_.anInt8230;
			    ((Class458) this).anIntArray5074[4] = i_133_;
			    ((Class458) this).anIntArray5021[4]
				= 1038388161 * class636_130_.anInt8228;
			    ((Class458) this).anIntArray5076[4]
				= -1055844967 * class636_130_.anInt8234;
			    ((Class458) this).anIntArray5077[4]
				= 538679245 * class636_130_.anInt8236;
			    ((Class458) this).anIntArray5018[4] = 128;
			}
		    }
		}
	    }
	}
	if (i_107_ > 0) {
	    int i_134_ = is[i][i_107_ - 1] & 0x7fff;
	    if (i_134_ > 0) {
		Class636 class636_135_
		    = (Class636) ((Class458) this).aClass5_Sub11_5078
				     .method63(i_134_ - 1, 2107050789);
		if (class636_135_.anInt8230 * 491679725 != -1) {
		    byte i_136_ = is_110_[i][i_107_ - 1];
		    int i_137_ = is_111_[i][i_107_ - 1];
		    if (class636_135_.aBool8238) {
			int i_138_ = 2;
			int i_139_ = 4 + 2 * i_137_;
			int i_140_
			    = Class390.method4780(class173, class636_135_,
						  123882234);
			for (int i_141_ = 0; i_141_ < 3; i_141_++) {
			    i_139_ &= 0x7;
			    i_138_ &= 0x7;
			    if (aBoolArrayArray5057[i_136_][i_139_]
				&& (((Class458) this).anIntArray5077[i_138_]
				    <= class636_135_.anInt8236 * 538679245)) {
				((Class458) this).anIntArray5073[i_138_]
				    = 491679725 * class636_135_.anInt8230;
				((Class458) this).anIntArray5074[i_138_]
				    = i_140_;
				((Class458) this).anIntArray5021[i_138_]
				    = class636_135_.anInt8228 * 1038388161;
				((Class458) this).anIntArray5076[i_138_]
				    = -1055844967 * class636_135_.anInt8234;
				if (538679245 * class636_135_.anInt8236
				    == (((Class458) this).anIntArray5077
					[i_138_]))
				    ((Class458) this).anIntArray5018[i_138_]
					|= 0x20;
				else
				    ((Class458) this).anIntArray5018[i_138_]
					= 32;
				((Class458) this).anIntArray5077[i_138_]
				    = 538679245 * class636_135_.anInt8236;
			    }
			    i_139_++;
			    i_138_--;
			}
			if (!bools_113_
			     [(-1433601173 * ((Class458) this).anInt5093 + 0
			       & 0x3)])
			    bools[0] = (aBoolArrayArray5067[i_136_]
					[i_137_ + 2 & 0x3]);
		    } else if (!bools_113_
				[(-1433601173 * ((Class458) this).anInt5093 + 0
				  & 0x3)])
			bools[0]
			    = aBoolArrayArray5056[i_136_][i_137_ + 2 & 0x3];
		}
	    }
	}
	if (i_107_ < i_109_ - 1) {
	    int i_142_ = is[i][1 + i_107_] & 0x7fff;
	    if (i_142_ > 0) {
		Class636 class636_143_
		    = (Class636) ((Class458) this).aClass5_Sub11_5078
				     .method63(i_142_ - 1, -1316958895);
		if (491679725 * class636_143_.anInt8230 != -1) {
		    byte i_144_ = is_110_[i][i_107_ + 1];
		    int i_145_ = is_111_[i][1 + i_107_];
		    if (class636_143_.aBool8238) {
			int i_146_ = 4;
			int i_147_ = 2 + i_145_ * 2;
			int i_148_
			    = Class390.method4780(class173, class636_143_,
						  -1373616720);
			for (int i_149_ = 0; i_149_ < 3; i_149_++) {
			    i_147_ &= 0x7;
			    i_146_ &= 0x7;
			    if (aBoolArrayArray5057[i_144_][i_147_]
				&& (((Class458) this).anIntArray5077[i_146_]
				    <= class636_143_.anInt8236 * 538679245)) {
				((Class458) this).anIntArray5073[i_146_]
				    = class636_143_.anInt8230 * 491679725;
				((Class458) this).anIntArray5074[i_146_]
				    = i_148_;
				((Class458) this).anIntArray5021[i_146_]
				    = 1038388161 * class636_143_.anInt8228;
				((Class458) this).anIntArray5076[i_146_]
				    = class636_143_.anInt8234 * -1055844967;
				if (538679245 * class636_143_.anInt8236
				    == (((Class458) this).anIntArray5077
					[i_146_]))
				    ((Class458) this).anIntArray5018[i_146_]
					|= 0x10;
				else
				    ((Class458) this).anIntArray5018[i_146_]
					= 16;
				((Class458) this).anIntArray5077[i_146_]
				    = class636_143_.anInt8236 * 538679245;
			    }
			    i_147_--;
			    i_146_++;
			}
			if (!bools_113_
			     [(-1433601173 * ((Class458) this).anInt5093 + 2
			       & 0x3)])
			    bools[2] = (aBoolArrayArray5067[i_144_]
					[i_145_ + 0 & 0x3]);
		    } else if (!bools_113_
				[(-1433601173 * ((Class458) this).anInt5093 + 2
				  & 0x3)])
			bools[2]
			    = aBoolArrayArray5056[i_144_][0 + i_145_ & 0x3];
		}
	    }
	}
	if (i > 0) {
	    int i_150_ = is[i - 1][i_107_] & 0x7fff;
	    if (i_150_ > 0) {
		Class636 class636_151_
		    = (Class636) ((Class458) this).aClass5_Sub11_5078
				     .method63(i_150_ - 1, 126606903);
		if (-1 != class636_151_.anInt8230 * 491679725) {
		    byte i_152_ = is_110_[i - 1][i_107_];
		    int i_153_ = is_111_[i - 1][i_107_];
		    if (class636_151_.aBool8238) {
			int i_154_ = 6;
			int i_155_ = 4 + 2 * i_153_;
			int i_156_
			    = Class390.method4780(class173, class636_151_,
						  86209190);
			for (int i_157_ = 0; i_157_ < 3; i_157_++) {
			    i_155_ &= 0x7;
			    i_154_ &= 0x7;
			    if (aBoolArrayArray5057[i_152_][i_155_]
				&& (((Class458) this).anIntArray5077[i_154_]
				    <= class636_151_.anInt8236 * 538679245)) {
				((Class458) this).anIntArray5073[i_154_]
				    = class636_151_.anInt8230 * 491679725;
				((Class458) this).anIntArray5074[i_154_]
				    = i_156_;
				((Class458) this).anIntArray5021[i_154_]
				    = class636_151_.anInt8228 * 1038388161;
				((Class458) this).anIntArray5076[i_154_]
				    = -1055844967 * class636_151_.anInt8234;
				if (((Class458) this).anIntArray5077[i_154_]
				    == 538679245 * class636_151_.anInt8236)
				    ((Class458) this).anIntArray5018[i_154_]
					|= 0x8;
				else
				    ((Class458) this).anIntArray5018[i_154_]
					= 8;
				((Class458) this).anIntArray5077[i_154_]
				    = class636_151_.anInt8236 * 538679245;
			    }
			    i_155_--;
			    i_154_++;
			}
			if (!bools_113_
			     [(((Class458) this).anInt5093 * -1433601173 + 3
			       & 0x3)])
			    bools[3] = (aBoolArrayArray5067[i_152_]
					[i_153_ + 1 & 0x3]);
		    } else if (!bools_113_
				[(3 + -1433601173 * ((Class458) this).anInt5093
				  & 0x3)])
			bools[3]
			    = aBoolArrayArray5056[i_152_][i_153_ + 1 & 0x3];
		}
	    }
	}
	if (i < i_108_ - 1) {
	    int i_158_ = is[1 + i][i_107_] & 0x7fff;
	    if (i_158_ > 0) {
		Class636 class636_159_
		    = (Class636) ((Class458) this).aClass5_Sub11_5078
				     .method63(i_158_ - 1, 2109354860);
		if (class636_159_.anInt8230 * 491679725 != -1) {
		    byte i_160_ = is_110_[i + 1][i_107_];
		    int i_161_ = is_111_[i + 1][i_107_];
		    if (class636_159_.aBool8238) {
			int i_162_ = 4;
			int i_163_ = 6 + i_161_ * 2;
			int i_164_
			    = Class390.method4780(class173, class636_159_,
						  -512009985);
			for (int i_165_ = 0; i_165_ < 3; i_165_++) {
			    i_163_ &= 0x7;
			    i_162_ &= 0x7;
			    if (aBoolArrayArray5057[i_160_][i_163_]
				&& (((Class458) this).anIntArray5077[i_162_]
				    <= 538679245 * class636_159_.anInt8236)) {
				((Class458) this).anIntArray5073[i_162_]
				    = class636_159_.anInt8230 * 491679725;
				((Class458) this).anIntArray5074[i_162_]
				    = i_164_;
				((Class458) this).anIntArray5021[i_162_]
				    = 1038388161 * class636_159_.anInt8228;
				((Class458) this).anIntArray5076[i_162_]
				    = -1055844967 * class636_159_.anInt8234;
				if (((Class458) this).anIntArray5077[i_162_]
				    == class636_159_.anInt8236 * 538679245)
				    ((Class458) this).anIntArray5018[i_162_]
					|= 0x4;
				else
				    ((Class458) this).anIntArray5018[i_162_]
					= 4;
				((Class458) this).anIntArray5077[i_162_]
				    = 538679245 * class636_159_.anInt8236;
			    }
			    i_163_++;
			    i_162_--;
			}
			if (!bools_113_
			     [(-1433601173 * ((Class458) this).anInt5093 + 1
			       & 0x3)])
			    bools[1] = (aBoolArrayArray5067[i_160_]
					[3 + i_161_ & 0x3]);
		    } else if (!bools_113_
				[(1 + -1433601173 * ((Class458) this).anInt5093
				  & 0x3)])
			bools[1]
			    = aBoolArrayArray5056[i_160_][3 + i_161_ & 0x3];
		}
	    }
	}
	if (class636 != null && class636.aBool8238) {
	    int i_166_ = Class390.method4780(class173, class636, -1122243273);
	    for (int i_167_ = 0; i_167_ < 8; i_167_++) {
		int i_168_
		    = i_167_ - 1427764950 * ((Class458) this).anInt5093 & 0x7;
		if ((aBoolArrayArray5057
		     [((Class458) this).anInt5095 * 85124233][i_167_])
		    && (((Class458) this).anIntArray5077[i_168_]
			<= 538679245 * class636.anInt8236)) {
		    ((Class458) this).anIntArray5073[i_168_]
			= class636.anInt8230 * 491679725;
		    ((Class458) this).anIntArray5074[i_168_] = i_166_;
		    ((Class458) this).anIntArray5021[i_168_]
			= 1038388161 * class636.anInt8228;
		    ((Class458) this).anIntArray5076[i_168_]
			= -1055844967 * class636.anInt8234;
		    if (((Class458) this).anIntArray5077[i_168_]
			== class636.anInt8236 * 538679245)
			((Class458) this).anIntArray5018[i_168_] |= 0x2;
		    else
			((Class458) this).anIntArray5018[i_168_] = 2;
		    ((Class458) this).anIntArray5077[i_168_]
			= 538679245 * class636.anInt8236;
		}
	    }
	}
    }
    
    void method5543(Class173 class173, Class636 class636, Class680 class680,
		    int i, int i_169_, byte[][] is, byte[][] is_170_,
		    short[][] is_171_, boolean[] bools, int i_172_) {
	boolean[] bools_173_
	    = (class636 != null && class636.aBool8238
	       ? aBoolArrayArray5067[((Class458) this).anInt5095 * 85124233]
	       : aBoolArrayArray5056[85124233 * ((Class458) this).anInt5095]);
	method5542(class173, class636, class680, i, i_169_,
		   anInt5019 * -2112239803, anInt5059 * -828725691, is_171_,
		   is, is_170_, bools, -306119886);
	((Class458) this).aBool5027
	    = class636 != null && (491679725 * class636.anInt8230
				   != -685171829 * class636.anInt8233);
	if (!((Class458) this).aBool5027) {
	    for (int i_174_ = 0; i_174_ < 8; i_174_++) {
		if (((Class458) this).anIntArray5077[i_174_] >= 0
		    && (((Class458) this).anIntArray5074[i_174_]
			!= ((Class458) this).anIntArray5073[i_174_])) {
		    ((Class458) this).aBool5027 = true;
		    break;
		}
	    }
	}
	if (!bools_173_[1 + -1433601173 * ((Class458) this).anInt5093 & 0x3]) {
	    boolean[] bools_175_ = bools;
	    int i_176_ = 1;
	    bools_175_[i_176_]
		= bools_175_[i_176_] | ((((Class458) this).anIntArray5018[2]
					 & ((Class458) this).anIntArray5018[4])
					== 0);
	}
	if (!bools_173_[((Class458) this).anInt5093 * -1433601173 + 3 & 0x3]) {
	    boolean[] bools_177_ = bools;
	    int i_178_ = 3;
	    bools_177_[i_178_]
		= (bools_177_[i_178_]
		   | 0 == (((Class458) this).anIntArray5018[6]
			   & ((Class458) this).anIntArray5018[0]));
	}
	if (!bools_173_[-1433601173 * ((Class458) this).anInt5093 + 0 & 0x3]) {
	    boolean[] bools_179_ = bools;
	    int i_180_ = 0;
	    bools_179_[i_180_]
		= (bools_179_[i_180_]
		   | 0 == (((Class458) this).anIntArray5018[0]
			   & ((Class458) this).anIntArray5018[2]));
	}
	if (!bools_173_[2 + ((Class458) this).anInt5093 * -1433601173 & 0x3]) {
	    boolean[] bools_181_ = bools;
	    int i_182_ = 2;
	    bools_181_[i_182_]
		= bools_181_[i_182_] | ((((Class458) this).anIntArray5018[4]
					 & ((Class458) this).anIntArray5018[6])
					== 0);
	}
	if (!((Class458) this).aBool5082
	    && (((Class458) this).anInt5095 * 85124233 == 0
		|| ((Class458) this).anInt5095 * 85124233 == 12)) {
	    if (bools[0] && !bools[1] && !bools[2] && bools[3]) {
		boolean[] bools_183_ = bools;
		bools[3] = false;
		bools_183_[0] = false;
		((Class458) this).anInt5095
		    = ((0 == ((Class458) this).anInt5095 * 85124233 ? 13 : 14)
		       * 190697913);
		((Class458) this).anInt5093 = 0;
	    } else if (bools[0] && bools[1] && !bools[2] && !bools[3]) {
		boolean[] bools_184_ = bools;
		bools[1] = false;
		bools_184_[0] = false;
		((Class458) this).anInt5095
		    = 190697913 * (0 == ((Class458) this).anInt5095 * 85124233
				   ? 13 : 14);
		((Class458) this).anInt5093 = 314772425;
	    } else if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
		boolean[] bools_185_ = bools;
		bools[2] = false;
		bools_185_[1] = false;
		((Class458) this).anInt5095
		    = 190697913 * (0 == 85124233 * ((Class458) this).anInt5095
				   ? 13 : 14);
		((Class458) this).anInt5093 = -1221807482;
	    } else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
		boolean[] bools_186_ = bools;
		bools[3] = false;
		bools_186_[2] = false;
		((Class458) this).anInt5095
		    = ((0 == ((Class458) this).anInt5095 * 85124233 ? 13 : 14)
		       * 190697913);
		((Class458) this).anInt5093 = 1536579907;
	    }
	}
    }
    
    public final void method5544(int i, int i_187_, int i_188_, int i_189_) {
	for (int i_190_ = 0; i_190_ < -1767130973 * anInt5049; i_190_++)
	    method5535(i_190_, i, i_187_, i_188_, i_189_, (byte) 36);
    }
    
    void method5545(Class173 class173, int i, int i_191_, int i_192_,
		    int i_193_, int i_194_, Class680 class680, int i_195_,
		    int i_196_, int i_197_, int i_198_, boolean[] bools,
		    int[] is, int[] is_199_, int[] is_200_, int[] is_201_,
		    int[] is_202_, int[] is_203_, int[] is_204_, int[] is_205_,
		    int[][] is_206_, Class137 class137, Class137 class137_207_,
		    Class137 class137_208_, int i_209_) {
	if (class680 != null) {
	    if (0 == i_196_)
		i_196_ = i_195_;
	    if (0 == i_197_)
		i_197_ = i_195_;
	    if (i_198_ == 0)
		i_198_ = i_195_;
	    Class680 class680_210_
		= ((Class680)
		   ((Class458) this).aClass5_Sub18_5009.method63(i_195_ - 1,
								 238268724));
	    Class680 class680_211_
		= ((Class680)
		   ((Class458) this).aClass5_Sub18_5009.method63(i_196_ - 1,
								 -1817457734));
	    Class680 class680_212_
		= ((Class680)
		   ((Class458) this).aClass5_Sub18_5009.method63(i_197_ - 1,
								 539614748));
	    Class680 class680_213_
		= ((Class680)
		   ((Class458) this).aClass5_Sub18_5009.method63(i_198_ - 1,
								 -1181621122));
	    for (int i_214_ = 0;
		 i_214_ < -1644621513 * ((Class458) this).anInt5090;
		 i_214_++) {
		boolean bool = false;
		int i_215_;
		if (bools[0 - -1433601173 * ((Class458) this).anInt5093 & 0x3]
		    && (((Class458) this).anInt5081 * -1970881483
			== ((Class458) this).anIntArray5047[0])) {
		    ((Class458) this).anIntArray5072[0]
			= (((Class458) this).anIntArray5026
			   [-1970881483 * ((Class458) this).anInt5081]);
		    ((Class458) this).anIntArray5072[1] = 1;
		    ((Class458) this).anIntArray5072[2]
			= (((Class458) this).anIntArray5094
			   [-1970881483 * ((Class458) this).anInt5081]);
		    ((Class458) this).anIntArray5072[3] = 1;
		    ((Class458) this).anIntArray5072[4]
			= (((Class458) this).anIntArray5035
			   [-1970881483 * ((Class458) this).anInt5081]);
		    ((Class458) this).anIntArray5072[5]
			= (((Class458) this).anIntArray5094
			   [-1970881483 * ((Class458) this).anInt5081]);
		    i_215_ = 6;
		} else if (bools[(2 - -1433601173 * ((Class458) this).anInt5093
				  & 0x3)]
			   && (-1970881483 * ((Class458) this).anInt5081
			       == ((Class458) this).anIntArray5047[2])) {
		    ((Class458) this).anIntArray5072[0]
			= (((Class458) this).anIntArray5026
			   [-1970881483 * ((Class458) this).anInt5081]);
		    ((Class458) this).anIntArray5072[1] = 5;
		    ((Class458) this).anIntArray5072[2]
			= (((Class458) this).anIntArray5094
			   [-1970881483 * ((Class458) this).anInt5081]);
		    ((Class458) this).anIntArray5072[3] = 5;
		    ((Class458) this).anIntArray5072[4]
			= (((Class458) this).anIntArray5035
			   [-1970881483 * ((Class458) this).anInt5081]);
		    ((Class458) this).anIntArray5072[5]
			= (((Class458) this).anIntArray5094
			   [-1970881483 * ((Class458) this).anInt5081]);
		    i_215_ = 6;
		} else if (bools[(1 - ((Class458) this).anInt5093 * -1433601173
				  & 0x3)]
			   && (((Class458) this).anIntArray5047[1]
			       == ((Class458) this).anInt5081 * -1970881483)) {
		    ((Class458) this).anIntArray5072[0]
			= (((Class458) this).anIntArray5026
			   [((Class458) this).anInt5081 * -1970881483]);
		    ((Class458) this).anIntArray5072[1] = 3;
		    ((Class458) this).anIntArray5072[2]
			= (((Class458) this).anIntArray5094
			   [((Class458) this).anInt5081 * -1970881483]);
		    ((Class458) this).anIntArray5072[3] = 3;
		    ((Class458) this).anIntArray5072[4]
			= (((Class458) this).anIntArray5035
			   [-1970881483 * ((Class458) this).anInt5081]);
		    ((Class458) this).anIntArray5072[5]
			= (((Class458) this).anIntArray5094
			   [-1970881483 * ((Class458) this).anInt5081]);
		    i_215_ = 6;
		} else if (bools[(3 - -1433601173 * ((Class458) this).anInt5093
				  & 0x3)]
			   && (((Class458) this).anInt5081 * -1970881483
			       == ((Class458) this).anIntArray5047[3])) {
		    ((Class458) this).anIntArray5072[0]
			= (((Class458) this).anIntArray5026
			   [-1970881483 * ((Class458) this).anInt5081]);
		    ((Class458) this).anIntArray5072[1] = 7;
		    ((Class458) this).anIntArray5072[2]
			= (((Class458) this).anIntArray5094
			   [((Class458) this).anInt5081 * -1970881483]);
		    ((Class458) this).anIntArray5072[3] = 7;
		    ((Class458) this).anIntArray5072[4]
			= (((Class458) this).anIntArray5035
			   [-1970881483 * ((Class458) this).anInt5081]);
		    ((Class458) this).anIntArray5072[5]
			= (((Class458) this).anIntArray5094
			   [-1970881483 * ((Class458) this).anInt5081]);
		    i_215_ = 6;
		} else {
		    ((Class458) this).anIntArray5072[0]
			= (((Class458) this).anIntArray5026
			   [-1970881483 * ((Class458) this).anInt5081]);
		    ((Class458) this).anIntArray5072[1]
			= (((Class458) this).anIntArray5035
			   [-1970881483 * ((Class458) this).anInt5081]);
		    ((Class458) this).anIntArray5072[2]
			= (((Class458) this).anIntArray5094
			   [-1970881483 * ((Class458) this).anInt5081]);
		    i_215_ = 3;
		}
		for (int i_216_ = 0; i_216_ < i_215_; i_216_++) {
		    int i_217_ = ((Class458) this).anIntArray5072[i_216_];
		    int i_218_
			= (i_217_ - ((Class458) this).anInt5093 * 1427764950
			   & 0x7);
		    int i_219_ = anIntArray5055[i_217_];
		    int i_220_ = anIntArray5080[i_217_];
		    int i_221_;
		    int i_222_;
		    if (((Class458) this).anInt5093 * -1433601173 == 1) {
			i_221_ = i_220_;
			i_222_ = 512 - i_219_;
		    } else if (-1433601173 * ((Class458) this).anInt5093
			       == 2) {
			i_221_ = 512 - i_219_;
			i_222_ = 512 - i_220_;
		    } else if (3
			       == ((Class458) this).anInt5093 * -1433601173) {
			i_221_ = 512 - i_220_;
			i_222_ = i_219_;
		    } else {
			i_221_ = i_219_;
			i_222_ = i_220_;
		    }
		    is_199_[((Class458) this).anInt5092 * -1038190051]
			= i_221_;
		    is_200_[-1038190051 * ((Class458) this).anInt5092]
			= i_222_;
		    if (is_204_ != null
			&& (aBoolArrayArray5057
			    [((Class458) this).anInt5095 * 85124233]
			    [i_217_])) {
			int i_223_ = (i_191_ << 9) + i_221_;
			int i_224_ = i_222_ + (i_192_ << 9);
			is_204_[-1038190051 * ((Class458) this).anInt5092]
			    = (class137_207_.method1656(i_223_, i_224_,
							1367265002)
			       - class137.method1656(i_223_, i_224_,
						     1347662102));
		    }
		    if (is_205_ != null) {
			if (null != class137_207_
			    && !(aBoolArrayArray5057
				 [((Class458) this).anInt5095 * 85124233]
				 [i_217_])) {
			    int i_225_ = i_221_ + (i_191_ << 9);
			    int i_226_ = (i_192_ << 9) + i_222_;
			    is_205_[-1038190051 * ((Class458) this).anInt5092]
				= (class137.method1656(i_225_, i_226_,
						       2107836726)
				   - class137_207_.method1656(i_225_, i_226_,
							      1254692981));
			} else if (null != class137_208_
				   && !(aBoolArrayArray5050
					[(85124233
					  * ((Class458) this).anInt5095)]
					[i_217_])) {
			    int i_227_ = (i_191_ << 9) + i_221_;
			    int i_228_ = (i_192_ << 9) + i_222_;
			    is_205_[((Class458) this).anInt5092 * -1038190051]
				= (class137_208_.method1656(i_227_, i_228_,
							    1158226342)
				   - class137.method1656(i_227_, i_228_,
							 924170599));
			}
		    }
		    if (i_217_ < 8
			&& ((Class458) this).anIntArray5077[i_218_] >= 0) {
			if (is != null)
			    is[((Class458) this).anInt5092 * -1038190051]
				= ((Class458) this).anIntArray5074[i_218_];
			is_203_[((Class458) this).anInt5092 * -1038190051]
			    = ((Class458) this).anIntArray5076[i_218_];
			is_202_[-1038190051 * ((Class458) this).anInt5092]
			    = ((Class458) this).anIntArray5021[i_218_];
			is_201_[-1038190051 * ((Class458) this).anInt5092]
			    = ((Class458) this).anIntArray5073[i_218_];
		    } else {
			if (((Class458) this).aBool5082
			    && (aBoolArrayArray5057
				[85124233 * ((Class458) this).anInt5095]
				[i_217_])) {
			    is_202_[((Class458) this).anInt5092 * -1038190051]
				= ((Class458) this).anInt5020 * -143733855;
			    is_203_[((Class458) this).anInt5092 * -1038190051]
				= ((Class458) this).anInt5084 * 279151887;
			    is_201_[((Class458) this).anInt5092 * -1038190051]
				= -2032081319 * ((Class458) this).anInt5085;
			} else if (0 == i_221_ && 0 == i_222_) {
			    is_201_[-1038190051 * ((Class458) this).anInt5092]
				= is_206_[i_191_][i_192_];
			    is_202_[((Class458) this).anInt5092 * -1038190051]
				= class680_210_.anInt8566 * 468843493;
			    is_203_[-1038190051 * ((Class458) this).anInt5092]
				= class680_210_.anInt8567 * -690160275;
			} else if (i_221_ == 0 && i_222_ == 512) {
			    is_201_[-1038190051 * ((Class458) this).anInt5092]
				= is_206_[i_191_][i_194_];
			    is_202_[-1038190051 * ((Class458) this).anInt5092]
				= 468843493 * class680_211_.anInt8566;
			    is_203_[((Class458) this).anInt5092 * -1038190051]
				= class680_211_.anInt8567 * -690160275;
			} else if (512 == i_221_ && 512 == i_222_) {
			    is_201_[-1038190051 * ((Class458) this).anInt5092]
				= is_206_[i_193_][i_194_];
			    is_202_[-1038190051 * ((Class458) this).anInt5092]
				= class680_212_.anInt8566 * 468843493;
			    is_203_[-1038190051 * ((Class458) this).anInt5092]
				= class680_212_.anInt8567 * -690160275;
			} else if (512 == i_221_ && i_222_ == 0) {
			    is_201_[-1038190051 * ((Class458) this).anInt5092]
				= is_206_[i_193_][i_192_];
			    is_202_[((Class458) this).anInt5092 * -1038190051]
				= 468843493 * class680_213_.anInt8566;
			    is_203_[((Class458) this).anInt5092 * -1038190051]
				= class680_213_.anInt8567 * -690160275;
			} else {
			    if (i_221_ < 256) {
				if (i_222_ < 256) {
				    is_202_[(-1038190051
					     * ((Class458) this).anInt5092)]
					= 468843493 * class680_210_.anInt8566;
				    is_203_[(-1038190051
					     * ((Class458) this).anInt5092)]
					= class680_210_.anInt8567 * -690160275;
				} else {
				    is_202_[(((Class458) this).anInt5092
					     * -1038190051)]
					= 468843493 * class680_211_.anInt8566;
				    is_203_[(((Class458) this).anInt5092
					     * -1038190051)]
					= -690160275 * class680_211_.anInt8567;
				}
			    } else if (i_222_ < 256) {
				is_202_[(((Class458) this).anInt5092
					 * -1038190051)]
				    = class680_213_.anInt8566 * 468843493;
				is_203_[(-1038190051
					 * ((Class458) this).anInt5092)]
				    = class680_213_.anInt8567 * -690160275;
			    } else {
				is_202_[(((Class458) this).anInt5092
					 * -1038190051)]
				    = class680_212_.anInt8566 * 468843493;
				is_203_[(((Class458) this).anInt5092
					 * -1038190051)]
				    = -690160275 * class680_212_.anInt8567;
			    }
			    int i_229_
				= Class301.method4028(is_206_[i_191_][i_192_],
						      is_206_[i_193_][i_192_],
						      i_221_ << 7 >> 9,
						      59858397);
			    int i_230_
				= Class301.method4028(is_206_[i_191_][i_194_],
						      is_206_[i_193_][i_194_],
						      i_221_ << 7 >> 9,
						      59858397);
			    is_201_[-1038190051 * ((Class458) this).anInt5092]
				= Class301.method4028(i_229_, i_230_,
						      i_222_ << 7 >> 9,
						      59858397);
			}
			if (is != null)
			    is[-1038190051 * ((Class458) this).anInt5092]
				= is_201_[(-1038190051
					   * ((Class458) this).anInt5092)];
		    }
		    ((Class458) this).anInt5092 += 1624643637;
		}
		((Class458) this).anInt5081 += -116148707;
	    }
	    if (0 != 85124233 * ((Class458) this).anInt5095
		&& class680.aBool8565)
		((Class458) this).aBool5086 = true;
	}
    }
    
    void method5546(Class137 class137, Class680 class680, Class636 class636,
		    int i, int i_231_, int i_232_, int i_233_, int i_234_,
		    int i_235_, int i_236_, int i_237_) {
	int i_238_ = class137.method1669(i_231_, i_232_, (byte) 0);
	int i_239_ = class137.method1669(i_233_, i_232_, (byte) 0);
	int i_240_ = class137.method1669(i_233_, i_234_, (byte) 0);
	int i_241_ = class137.method1669(i_231_, i_234_, (byte) 0);
	boolean bool
	    = aClass466_5079.method5633(i_231_, i_232_, (short) -1927);
	if (bool && i > 1 || !bool && i > 0) {
	    boolean bool_242_ = true;
	    if (class680 != null && !class680.aBool8569)
		bool_242_ = false;
	    else if (0 == i_235_
		     && 0 != ((Class458) this).anInt5095 * 85124233)
		bool_242_ = false;
	    else if (i_236_ > 0 && null != class636 && !class636.aBool8232)
		bool_242_ = false;
	    if (bool_242_ && i_238_ == i_239_ && i_238_ == i_240_
		&& i_238_ == i_241_)
		aByteArrayArrayArray5029[i][i_231_][i_232_] |= 0x4;
	}
    }
    
    static {
	anIntArray5066
	    = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };
	anIntArray5051 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
	anIntArray5024 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };
	anIntArray5053 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
	anIntArray5054 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };
	anIntArray5055 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128,
				     256, 128, 384, 256 };
	anIntArray5080 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256,
				     384, 128, 128, 256 };
	aBoolArrayArray5057
	    = (new boolean[][]
	       { { true, true, true, true, true, true, true, true, true, true,
		   true, true, true },
		 { true, true, true, false, false, false, true, true, false,
		   false, false, false, true },
		 { true, false, false, false, false, true, true, true, false,
		   false, false, false, false },
		 { false, false, true, true, true, true, false, false, false,
		   false, false, false, false },
		 { true, true, true, true, true, true, false, false, false,
		   false, false, false, false },
		 { true, true, true, false, false, true, true, true, false,
		   false, false, false, false },
		 { true, true, false, false, false, true, true, true, false,
		   false, false, false, true },
		 { true, true, false, false, false, false, false, true, false,
		   false, false, false, false },
		 { false, true, true, true, true, true, true, true, false,
		   false, false, false, false },
		 { true, false, false, false, true, true, true, true, true,
		   true, false, false, false },
		 { true, true, true, true, true, false, false, false, true,
		   true, false, false, false },
		 { true, true, true, false, false, false, false, false, false,
		   false, true, true, false },
		 { false, false, false, false, false, false, false, false,
		   false, false, false, false, false },
		 { true, true, true, true, true, true, true, true, true, true,
		   true, true, true },
		 { false, false, false, false, false, false, false, false,
		   false, false, false, false, false } });
	aBoolArrayArray5050
	    = (new boolean[][]
	       { { false, false, false, false, false, false, false, false,
		   false, false, false, false, false },
		 { false, false, true, true, true, true, true, false, false,
		   false, false, false, true },
		 { true, true, true, true, true, true, false, false, false,
		   false, false, false, false },
		 { true, true, true, false, false, true, true, true, false,
		   false, false, false, false },
		 { true, false, false, false, false, true, true, true, false,
		   false, false, false, false },
		 { false, false, true, true, true, true, false, false, false,
		   false, false, false, false },
		 { false, true, true, true, true, true, false, false, false,
		   false, false, false, true },
		 { false, true, true, true, true, true, true, true, false,
		   false, false, false, true },
		 { true, true, false, false, false, false, false, true, false,
		   false, false, false, false },
		 { true, true, true, true, true, false, false, false, true,
		   true, false, false, false },
		 { true, false, false, false, true, true, true, true, true,
		   true, false, false, false },
		 { true, false, true, true, true, true, true, true, false,
		   false, true, true, false },
		 { true, true, true, true, true, true, true, true, true, true,
		   true, true, true },
		 { false, false, false, false, false, false, false, false,
		   false, false, false, false, false },
		 { true, true, true, true, true, true, true, true, true, true,
		   true, true, true } });
	anIntArrayArray5030
	    = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 },
			    { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 },
			    { 0, 4, 4, 4 }, { 4, 4, 4, 0 },
			    { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 },
			    { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 },
			    { 0, 4, 4, 4 } };
	anIntArrayArray5060
	    = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 },
			    { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 },
			    { 1, 6, 7, 1 }, { 6, 7, 1, 1 },
			    { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 },
			    { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 },
			    { 1, 6, 7, 1 } };
	anIntArrayArray5061
	    = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 },
			    { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 },
			    { 7, 7, 1, 2 }, { 7, 1, 2, 7 },
			    { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 },
			    { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 },
			    { 7, 7, 1, 2 } };
	aBoolArrayArray5056
	    = (new boolean[][]
	       { { false, false, false, false },
		 { false, false, false, false }, { false, false, true, false },
		 { false, false, true, false }, { false, false, true, false },
		 { false, false, true, false }, { true, false, true, false },
		 { true, false, false, true }, { true, false, false, true },
		 { false, false, false, false },
		 { false, false, false, false },
		 { false, false, false, false },
		 { false, false, false, false } });
	anIntArrayArray5063
	    = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 },
			    { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 },
			    { -1, 4, -1, 1 }, { -1, 1, 3, -1 },
			    { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 },
			    { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };
	anIntArrayArray5064
	    = (new int[][]
	       { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 },
		 { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 },
		 { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 },
		 { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } });
	anIntArrayArray5065
	    = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 },
			    { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 },
			    { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 },
			    { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 },
			    { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 },
			    { 2, 4, 6, 0 } };
	anIntArrayArray5045
	    = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 },
			    { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 },
			    { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 },
			    { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 },
			    { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 },
			    { 12, 12, 12, 12 } };
	aBoolArrayArray5067
	    = (new boolean[][]
	       { { false, false, false, false }, { false, true, true, false },
		 { true, false, true, false }, { true, false, true, false },
		 { false, false, true, false }, { false, false, true, false },
		 { true, false, true, false }, { true, false, false, true },
		 { true, false, false, true }, { true, true, false, false },
		 { false, false, false, false }, { false, true, false, true },
		 { false, false, false, false } });
	anIntArrayArray5068
	    = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 },
			    { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 },
			    { -1, 4, -1, 1 }, { -1, 3, 4, -1 },
			    { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 },
			    { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };
	anIntArrayArray5069
	    = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 },
			    { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 },
			    { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 },
			    { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 },
			    { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 },
			    { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };
	anIntArrayArray5070
	    = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 },
			    { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 },
			    { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 },
			    { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 },
			    { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 },
			    { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };
	anIntArrayArray5071
	    = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 },
			    { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 },
			    { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 },
			    { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 },
			    { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 },
			    { 10, 10, 11, 11, 11, 7, 3, 7 },
			    { 12, 12, 12, 12 } };
    }
    
    public void method5547() {
	aBool5062 = true;
    }
    
    public void method5548() {
	aBool5062 = true;
    }
    
    public void method5549() {
	((Class458) this).anIntArray5022 = null;
	((Class458) this).anIntArray5031 = null;
	((Class458) this).anIntArray5041 = null;
	((Class458) this).anIntArray5043 = null;
	((Class458) this).anIntArray5010 = null;
	aBool5062 = false;
    }
    
    public final void method5550(int i, int i_243_, int i_244_, int i_245_,
				 int i_246_) {
	for (int i_247_ = i_244_; i_247_ < i_246_ + i_244_; i_247_++) {
	    for (int i_248_ = i_243_; i_248_ < i_245_ + i_243_; i_248_++) {
		if (i_248_ >= 0 && i_248_ < -2112239803 * anInt5019
		    && i_247_ >= 0 && i_247_ < anInt5059 * -828725691)
		    anIntArrayArrayArray5087[i][i_248_][i_247_]
			= i > 0 ? (anIntArrayArrayArray5087[i - 1][i_248_]
				   [i_247_]) - 960 : 0;
	    }
	}
	if (i_243_ > 0 && i_243_ < -2112239803 * anInt5019) {
	    for (int i_249_ = i_244_ + 1; i_249_ < i_246_ + i_244_; i_249_++) {
		if (i_249_ >= 0 && i_249_ < anInt5059 * -828725691)
		    anIntArrayArrayArray5087[i][i_243_][i_249_]
			= anIntArrayArrayArray5087[i][i_243_ - 1][i_249_];
	    }
	}
	if (i_244_ > 0 && i_244_ < -828725691 * anInt5059) {
	    for (int i_250_ = i_243_ + 1; i_250_ < i_243_ + i_245_; i_250_++) {
		if (i_250_ >= 0 && i_250_ < -2112239803 * anInt5019)
		    anIntArrayArrayArray5087[i][i_250_][i_244_]
			= anIntArrayArrayArray5087[i][i_250_][i_244_ - 1];
	    }
	}
	if (i_243_ >= 0 && i_244_ >= 0 && i_243_ < -2112239803 * anInt5019
	    && i_244_ < anInt5059 * -828725691) {
	    if (0 == i) {
		if (i_243_ > 0
		    && 0 != anIntArrayArrayArray5087[i][i_243_ - 1][i_244_])
		    anIntArrayArrayArray5087[i][i_243_][i_244_]
			= anIntArrayArrayArray5087[i][i_243_ - 1][i_244_];
		else if (i_244_ > 0
			 && (anIntArrayArrayArray5087[i][i_243_][i_244_ - 1]
			     != 0))
		    anIntArrayArrayArray5087[i][i_243_][i_244_]
			= anIntArrayArrayArray5087[i][i_243_][i_244_ - 1];
		else if (i_243_ > 0 && i_244_ > 0
			 && 0 != (anIntArrayArrayArray5087[i][i_243_ - 1]
				  [i_244_ - 1]))
		    anIntArrayArrayArray5087[i][i_243_][i_244_]
			= anIntArrayArrayArray5087[i][i_243_ - 1][i_244_ - 1];
	    } else if (i_243_ > 0
		       && (anIntArrayArrayArray5087[i - 1][i_243_ - 1][i_244_]
			   != anIntArrayArrayArray5087[i][i_243_ - 1][i_244_]))
		anIntArrayArrayArray5087[i][i_243_][i_244_]
		    = anIntArrayArrayArray5087[i][i_243_ - 1][i_244_];
	    else if (i_244_ > 0
		     && (anIntArrayArrayArray5087[i - 1][i_243_][i_244_ - 1]
			 != anIntArrayArrayArray5087[i][i_243_][i_244_ - 1]))
		anIntArrayArrayArray5087[i][i_243_][i_244_]
		    = anIntArrayArrayArray5087[i][i_243_][i_244_ - 1];
	    else if (i_243_ > 0 && i_244_ > 0
		     && (anIntArrayArrayArray5087[i][i_243_ - 1][i_244_ - 1]
			 != (anIntArrayArrayArray5087[i - 1][i_243_ - 1]
			     [i_244_ - 1])))
		anIntArrayArrayArray5087[i][i_243_][i_244_]
		    = anIntArrayArrayArray5087[i][i_243_ - 1][i_244_ - 1];
	}
    }
    
    public void method5551() {
	((Class458) this).anIntArray5022 = null;
	((Class458) this).anIntArray5031 = null;
	((Class458) this).anIntArray5041 = null;
	((Class458) this).anIntArray5043 = null;
	((Class458) this).anIntArray5010 = null;
	aBool5062 = false;
    }
    
    int method5552(int i, int i_251_, int i_252_, int i_253_, int i_254_,
		   Class137 class137, short[][] is, int i_255_) {
	if ((85124233 * ((Class458) this).anInt5095 == 0
	     || 12 == 85124233 * ((Class458) this).anInt5095)
	    && i_251_ > 0 && i_252_ > 0 && i_251_ < anInt5019 * -2112239803
	    && i_252_ < -828725691 * anInt5059) {
	    int i_256_ = 0;
	    int i_257_ = 0;
	    int i_258_ = 0;
	    int i_259_ = 0;
	    i_256_ = i_256_ + (is[i_251_ - 1][i_252_ - 1] == i ? 1 : -1);
	    i_257_ = i_257_ + (is[i_253_][i_252_ - 1] == i ? 1 : -1);
	    i_258_ = i_258_ + (i == is[i_253_][i_254_] ? 1 : -1);
	    i_259_ = i_259_ + (is[i_251_ - 1][i_254_] == i ? 1 : -1);
	    if (is[i_251_][i_252_ - 1] == i) {
		i_256_++;
		i_257_++;
	    } else {
		i_256_--;
		i_257_--;
	    }
	    if (is[i_253_][i_252_] == i) {
		i_257_++;
		i_258_++;
	    } else {
		i_257_--;
		i_258_--;
	    }
	    if (i == is[i_251_][i_254_]) {
		i_258_++;
		i_259_++;
	    } else {
		i_258_--;
		i_259_--;
	    }
	    if (i == is[i_251_ - 1][i_252_]) {
		i_259_++;
		i_256_++;
	    } else {
		i_259_--;
		i_256_--;
	    }
	    int i_260_ = i_256_ - i_258_;
	    if (i_260_ < 0)
		i_260_ = -i_260_;
	    int i_261_ = i_257_ - i_259_;
	    if (i_261_ < 0)
		i_261_ = -i_261_;
	    if (i_261_ == i_260_) {
		i_260_ = (class137.method1669(i_251_, i_252_, (byte) 0)
			  - class137.method1669(i_253_, i_254_, (byte) 0));
		if (i_260_ < 0)
		    i_260_ = -i_260_;
		i_261_ = (class137.method1669(i_253_, i_252_, (byte) 0)
			  - class137.method1669(i_251_, i_254_, (byte) 0));
		if (i_261_ < 0)
		    i_261_ = -i_261_;
	    }
	    return i_260_ < i_261_ ? 1 : 0;
	}
	return ((Class458) this).anInt5093 * -1433601173;
    }
    
    Class458(Class538 class538, int i, int i_262_, int i_263_, boolean bool,
	     Class5_Sub11 class5_sub11, Class5_Sub18 class5_sub18,
	     Class466 class466) {
	((Class458) this).anIntArray5021 = new int[13];
	((Class458) this).anIntArray5076 = new int[13];
	((Class458) this).anIntArray5077 = new int[13];
	((Class458) this).anIntArray5018 = new int[13];
	((Class458) this).anInt5081 = 0;
	((Class458) this).anInt5092 = 0;
	((Class458) this).anIntArray5047 = null;
	aClass538_5011 = class538;
	anInt5049 = i * 977320715;
	anInt5019 = i_262_ * -954682483;
	anInt5059 = 1614118029 * i_263_;
	aBool5023 = bool;
	((Class458) this).aClass5_Sub11_5078 = class5_sub11;
	((Class458) this).aClass5_Sub18_5009 = class5_sub18;
	aClass466_5079 = class466;
	((Class458) this).aShortArrayArrayArray5052
	    = (new short[-1767130973 * anInt5049][-2112239803 * anInt5019]
	       [-828725691 * anInt5059]);
	((Class458) this).aShortArrayArrayArray5028
	    = (new short[-1767130973 * anInt5049][-2112239803 * anInt5019]
	       [-828725691 * anInt5059]);
	((Class458) this).aByteArrayArrayArray5025
	    = (new byte[-1767130973 * anInt5049][anInt5019 * -2112239803]
	       [-828725691 * anInt5059]);
	((Class458) this).aByteArrayArrayArray5032
	    = (new byte[anInt5049 * -1767130973][anInt5019 * -2112239803]
	       [-828725691 * anInt5059]);
	anIntArrayArrayArray5087
	    = (new int[-1767130973 * anInt5049][1 + anInt5019 * -2112239803]
	       [1 + anInt5059 * -828725691]);
	aByteArrayArrayArray5029
	    = (new byte[-1767130973 * anInt5049][1 + -2112239803 * anInt5019]
	       [anInt5059 * -828725691 + 1]);
    }
    
    void method5553(Class636 class636, Class680 class680, byte i) {
	if (((Class458) this).aBool5075) {
	    ((Class458) this).anIntArray5026
		= anIntArrayArray5030[85124233 * ((Class458) this).anInt5095];
	    ((Class458) this).anIntArray5035
		= anIntArrayArray5060[((Class458) this).anInt5095 * 85124233];
	    ((Class458) this).anIntArray5094
		= anIntArrayArray5061[85124233 * ((Class458) this).anInt5095];
	    ((Class458) this).anInt5091
		= (1489240955
		   * (null != class636
		      ? anIntArray5089[((Class458) this).anInt5095 * 85124233]
		      : 0));
	    ((Class458) this).anInt5090
		= (41776263
		   * (class680 != null
		      ? anIntArray5066[85124233 * ((Class458) this).anInt5095]
		      : 0));
	} else if (((Class458) this).aBool5082) {
	    ((Class458) this).anIntArray5026
		= anIntArrayArray5069[((Class458) this).anInt5095 * 85124233];
	    ((Class458) this).anIntArray5035
		= anIntArrayArray5070[((Class458) this).anInt5095 * 85124233];
	    ((Class458) this).anIntArray5094
		= anIntArrayArray5071[((Class458) this).anInt5095 * 85124233];
	    ((Class458) this).anInt5091
		= (1489240955
		   * (null != class636
		      ? anIntArray5053[85124233 * ((Class458) this).anInt5095]
		      : 0));
	    ((Class458) this).anInt5090
		= (41776263
		   * (null != class680
		      ? anIntArray5054[((Class458) this).anInt5095 * 85124233]
		      : 0));
	    ((Class458) this).anIntArray5047
		= anIntArrayArray5068[((Class458) this).anInt5095 * 85124233];
	} else {
	    ((Class458) this).anIntArray5026
		= anIntArrayArray5064[((Class458) this).anInt5095 * 85124233];
	    ((Class458) this).anIntArray5035
		= anIntArrayArray5065[((Class458) this).anInt5095 * 85124233];
	    ((Class458) this).anIntArray5094
		= anIntArrayArray5045[85124233 * ((Class458) this).anInt5095];
	    ((Class458) this).anInt5091
		= (class636 != null
		   ? anIntArray5051[85124233 * ((Class458) this).anInt5095]
		   : 0) * 1489240955;
	    ((Class458) this).anInt5090
		= (41776263
		   * (class680 != null
		      ? anIntArray5024[((Class458) this).anInt5095 * 85124233]
		      : 0));
	    ((Class458) this).anIntArray5047
		= anIntArrayArray5063[85124233 * ((Class458) this).anInt5095];
	}
    }
    
    public final void method5554(Class173 class173, Class137 class137,
				 Class137 class137_264_, int i) {
	int[][] is = new int[anInt5019 * -2112239803][anInt5059 * -828725691];
	if (((Class458) this).anIntArray5022 == null
	    || (((Class458) this).anIntArray5022.length
		!= -828725691 * anInt5059)) {
	    ((Class458) this).anIntArray5022 = new int[anInt5059 * -828725691];
	    ((Class458) this).anIntArray5031 = new int[anInt5059 * -828725691];
	    ((Class458) this).anIntArray5041 = new int[-828725691 * anInt5059];
	    ((Class458) this).anIntArray5043 = new int[anInt5059 * -828725691];
	    ((Class458) this).anIntArray5010 = new int[anInt5059 * -828725691];
	}
	for (int i_265_ = 0; i_265_ < -1767130973 * anInt5049; i_265_++) {
	    for (int i_266_ = 0; i_266_ < -828725691 * anInt5059; i_266_++) {
		((Class458) this).anIntArray5022[i_266_] = 0;
		((Class458) this).anIntArray5031[i_266_] = 0;
		((Class458) this).anIntArray5041[i_266_] = 0;
		((Class458) this).anIntArray5043[i_266_] = 0;
		((Class458) this).anIntArray5010[i_266_] = 0;
	    }
	    for (int i_267_ = -5; i_267_ < anInt5019 * -2112239803; i_267_++) {
		for (int i_268_ = 0; i_268_ < anInt5059 * -828725691;
		     i_268_++) {
		    int i_269_ = 5 + i_267_;
		    if (i_269_ < anInt5019 * -2112239803) {
			int i_270_
			    = ((((Class458) this).aShortArrayArrayArray5052
				[i_265_][i_269_][i_268_])
			       & 0x7fff);
			if (i_270_ > 0) {
			    Class680 class680
				= ((Class680)
				   ((Class458) this).aClass5_Sub18_5009
				       .method63(i_270_ - 1, -2108951721));
			    ((Class458) this).anIntArray5022[i_268_]
				+= -1363610569 * class680.anInt8570;
			    ((Class458) this).anIntArray5031[i_268_]
				+= class680.anInt8571 * -207840443;
			    ((Class458) this).anIntArray5041[i_268_]
				+= -1393069609 * class680.anInt8572;
			    ((Class458) this).anIntArray5043[i_268_]
				+= -1145682321 * class680.anInt8568;
			    ((Class458) this).anIntArray5010[i_268_]++;
			}
		    }
		    int i_271_ = i_267_ - 5;
		    if (i_271_ >= 0) {
			int i_272_
			    = ((((Class458) this).aShortArrayArrayArray5052
				[i_265_][i_271_][i_268_])
			       & 0x7fff);
			if (i_272_ > 0) {
			    Class680 class680
				= ((Class680)
				   ((Class458) this).aClass5_Sub18_5009
				       .method63(i_272_ - 1, 1101638318));
			    ((Class458) this).anIntArray5022[i_268_]
				-= -1363610569 * class680.anInt8570;
			    ((Class458) this).anIntArray5031[i_268_]
				-= class680.anInt8571 * -207840443;
			    ((Class458) this).anIntArray5041[i_268_]
				-= -1393069609 * class680.anInt8572;
			    ((Class458) this).anIntArray5043[i_268_]
				-= -1145682321 * class680.anInt8568;
			    ((Class458) this).anIntArray5010[i_268_]--;
			}
		    }
		}
		if (i_267_ >= 0) {
		    int i_273_ = 0;
		    int i_274_ = 0;
		    int i_275_ = 0;
		    int i_276_ = 0;
		    int i_277_ = 0;
		    for (int i_278_ = -5; i_278_ < anInt5059 * -828725691;
			 i_278_++) {
			int i_279_ = 5 + i_278_;
			if (i_279_ < -828725691 * anInt5059) {
			    i_273_ += ((Class458) this).anIntArray5022[i_279_];
			    i_274_ += ((Class458) this).anIntArray5031[i_279_];
			    i_275_ += ((Class458) this).anIntArray5041[i_279_];
			    i_276_ += ((Class458) this).anIntArray5043[i_279_];
			    i_277_ += ((Class458) this).anIntArray5010[i_279_];
			}
			int i_280_ = i_278_ - 5;
			if (i_280_ >= 0) {
			    i_273_ -= ((Class458) this).anIntArray5022[i_280_];
			    i_274_ -= ((Class458) this).anIntArray5031[i_280_];
			    i_275_ -= ((Class458) this).anIntArray5041[i_280_];
			    i_276_ -= ((Class458) this).anIntArray5043[i_280_];
			    i_277_ -= ((Class458) this).anIntArray5010[i_280_];
			}
			if (i_278_ >= 0 && i_276_ > 0 && i_277_ > 0)
			    is[i_267_][i_278_]
				= Class637.method7579(i_273_ * 256 / i_276_,
						      i_274_ / i_277_,
						      i_275_ / i_277_,
						      1415535041);
		    }
		}
	    }
	    if (aBool5016)
		method5558(class173, aClass538_5011.aClass137Array7161[i_265_],
			   i_265_, is, 0 == i_265_ ? class137 : null,
			   i_265_ == 0 ? class137_264_ : null, -207785535);
	    else
		method5541(class173, aClass538_5011.aClass137Array7161[i_265_],
			   i_265_, is, 0 == i_265_ ? class137 : null,
			   i_265_ == 0 ? class137_264_ : null, (byte) 113);
	    ((Class458) this).aShortArrayArrayArray5052[i_265_] = null;
	    ((Class458) this).aShortArrayArrayArray5028[i_265_] = null;
	    ((Class458) this).aByteArrayArrayArray5025[i_265_] = null;
	    ((Class458) this).aByteArrayArrayArray5032[i_265_] = null;
	}
	if (!aBool5023) {
	    if (0 != anInt5013 * 685638831)
		aClass538_5011.method6570((byte) 1);
	    if (aBool5015)
		aClass538_5011.method6564(1760228072);
	}
	for (int i_281_ = 0; i_281_ < anInt5049 * -1767130973; i_281_++)
	    aClass538_5011.aClass137Array7161[i_281_].method1653();
    }
    
    public final void method5555(int i, int i_282_, int i_283_, int i_284_,
				 byte i_285_) {
	for (int i_286_ = 0; i_286_ < -1767130973 * anInt5049; i_286_++)
	    method5535(i_286_, i, i_282_, i_283_, i_284_, (byte) 20);
    }
    
    public void method5556(int i) {
	((Class458) this).anIntArray5022 = null;
	((Class458) this).anIntArray5031 = null;
	((Class458) this).anIntArray5041 = null;
	((Class458) this).anIntArray5043 = null;
	((Class458) this).anIntArray5010 = null;
	aBool5062 = false;
    }
    
    void method5557(Class173 class173, int i, int i_287_, int i_288_,
		    Class636 class636, boolean[] bools, int[] is,
		    int[] is_289_, int[] is_290_, int[] is_291_, int[] is_292_,
		    int[] is_293_, int[] is_294_, int[] is_295_,
		    Class137 class137, Class137 class137_296_,
		    Class137 class137_297_, int i_298_) {
	((Class458) this).anInt5085 = 2102918679;
	((Class458) this).anInt5020 = 1357522847;
	((Class458) this).anInt5084 = 1120530176;
	if (class636 != null) {
	    ((Class458) this).anInt5085 = -933508171 * class636.anInt8230;
	    ((Class458) this).anInt5020 = -1353135071 * class636.anInt8228;
	    ((Class458) this).anInt5084 = -2074457385 * class636.anInt8234;
	    int i_299_ = Class390.method4780(class173, class636, -1580904985);
	    for (int i_300_ = 0;
		 i_300_ < -1459919949 * ((Class458) this).anInt5091;
		 i_300_++) {
		boolean bool = false;
		int i_301_;
		if (bools[0 - ((Class458) this).anInt5093 * -1433601173 & 0x3]
		    && (((Class458) this).anIntArray5047[0]
			== ((Class458) this).anInt5081 * -1970881483)) {
		    ((Class458) this).anIntArray5072[0]
			= (((Class458) this).anIntArray5026
			   [-1970881483 * ((Class458) this).anInt5081]);
		    ((Class458) this).anIntArray5072[1] = 1;
		    ((Class458) this).anIntArray5072[2]
			= (((Class458) this).anIntArray5094
			   [((Class458) this).anInt5081 * -1970881483]);
		    ((Class458) this).anIntArray5072[3] = 1;
		    ((Class458) this).anIntArray5072[4]
			= (((Class458) this).anIntArray5035
			   [((Class458) this).anInt5081 * -1970881483]);
		    ((Class458) this).anIntArray5072[5]
			= (((Class458) this).anIntArray5094
			   [((Class458) this).anInt5081 * -1970881483]);
		    i_301_ = 6;
		} else if (bools[(2 - -1433601173 * ((Class458) this).anInt5093
				  & 0x3)]
			   && (((Class458) this).anIntArray5047[2]
			       == -1970881483 * ((Class458) this).anInt5081)) {
		    ((Class458) this).anIntArray5072[0]
			= (((Class458) this).anIntArray5026
			   [((Class458) this).anInt5081 * -1970881483]);
		    ((Class458) this).anIntArray5072[1] = 5;
		    ((Class458) this).anIntArray5072[2]
			= (((Class458) this).anIntArray5094
			   [-1970881483 * ((Class458) this).anInt5081]);
		    ((Class458) this).anIntArray5072[3] = 5;
		    ((Class458) this).anIntArray5072[4]
			= (((Class458) this).anIntArray5035
			   [-1970881483 * ((Class458) this).anInt5081]);
		    ((Class458) this).anIntArray5072[5]
			= (((Class458) this).anIntArray5094
			   [-1970881483 * ((Class458) this).anInt5081]);
		    i_301_ = 6;
		} else if (bools[(1 - -1433601173 * ((Class458) this).anInt5093
				  & 0x3)]
			   && (((Class458) this).anInt5081 * -1970881483
			       == ((Class458) this).anIntArray5047[1])) {
		    ((Class458) this).anIntArray5072[0]
			= (((Class458) this).anIntArray5026
			   [-1970881483 * ((Class458) this).anInt5081]);
		    ((Class458) this).anIntArray5072[1] = 3;
		    ((Class458) this).anIntArray5072[2]
			= (((Class458) this).anIntArray5094
			   [-1970881483 * ((Class458) this).anInt5081]);
		    ((Class458) this).anIntArray5072[3] = 3;
		    ((Class458) this).anIntArray5072[4]
			= (((Class458) this).anIntArray5035
			   [((Class458) this).anInt5081 * -1970881483]);
		    ((Class458) this).anIntArray5072[5]
			= (((Class458) this).anIntArray5094
			   [-1970881483 * ((Class458) this).anInt5081]);
		    i_301_ = 6;
		} else if (bools[(3 - ((Class458) this).anInt5093 * -1433601173
				  & 0x3)]
			   && (-1970881483 * ((Class458) this).anInt5081
			       == ((Class458) this).anIntArray5047[3])) {
		    ((Class458) this).anIntArray5072[0]
			= (((Class458) this).anIntArray5026
			   [-1970881483 * ((Class458) this).anInt5081]);
		    ((Class458) this).anIntArray5072[1] = 7;
		    ((Class458) this).anIntArray5072[2]
			= (((Class458) this).anIntArray5094
			   [-1970881483 * ((Class458) this).anInt5081]);
		    ((Class458) this).anIntArray5072[3] = 7;
		    ((Class458) this).anIntArray5072[4]
			= (((Class458) this).anIntArray5035
			   [-1970881483 * ((Class458) this).anInt5081]);
		    ((Class458) this).anIntArray5072[5]
			= (((Class458) this).anIntArray5094
			   [((Class458) this).anInt5081 * -1970881483]);
		    i_301_ = 6;
		} else {
		    ((Class458) this).anIntArray5072[0]
			= (((Class458) this).anIntArray5026
			   [-1970881483 * ((Class458) this).anInt5081]);
		    ((Class458) this).anIntArray5072[1]
			= (((Class458) this).anIntArray5035
			   [((Class458) this).anInt5081 * -1970881483]);
		    ((Class458) this).anIntArray5072[2]
			= (((Class458) this).anIntArray5094
			   [-1970881483 * ((Class458) this).anInt5081]);
		    i_301_ = 3;
		}
		for (int i_302_ = 0; i_302_ < i_301_; i_302_++) {
		    int i_303_ = ((Class458) this).anIntArray5072[i_302_];
		    int i_304_
			= (i_303_ - 1427764950 * ((Class458) this).anInt5093
			   & 0x7);
		    int i_305_ = anIntArray5055[i_303_];
		    int i_306_ = anIntArray5080[i_303_];
		    int i_307_;
		    int i_308_;
		    if (((Class458) this).anInt5093 * -1433601173 == 1) {
			i_307_ = i_306_;
			i_308_ = 512 - i_305_;
		    } else if (2
			       == ((Class458) this).anInt5093 * -1433601173) {
			i_307_ = 512 - i_305_;
			i_308_ = 512 - i_306_;
		    } else if (3
			       == ((Class458) this).anInt5093 * -1433601173) {
			i_307_ = 512 - i_306_;
			i_308_ = i_305_;
		    } else {
			i_307_ = i_305_;
			i_308_ = i_306_;
		    }
		    is_289_[((Class458) this).anInt5092 * -1038190051]
			= i_307_;
		    is_290_[-1038190051 * ((Class458) this).anInt5092]
			= i_308_;
		    if (is_294_ != null
			&& (aBoolArrayArray5057
			    [((Class458) this).anInt5095 * 85124233]
			    [i_303_])) {
			int i_309_ = (i_287_ << 9) + i_307_;
			int i_310_ = (i_288_ << 9) + i_308_;
			is_294_[-1038190051 * ((Class458) this).anInt5092]
			    = (class137_296_.method1656(i_309_, i_310_,
							1796277926)
			       - class137.method1656(i_309_, i_310_,
						     2070589419));
		    }
		    if (null != is_295_) {
			if (null != class137_296_
			    && !(aBoolArrayArray5057
				 [85124233 * ((Class458) this).anInt5095]
				 [i_303_])) {
			    int i_311_ = i_307_ + (i_287_ << 9);
			    int i_312_ = (i_288_ << 9) + i_308_;
			    is_295_[-1038190051 * ((Class458) this).anInt5092]
				= (class137.method1656(i_311_, i_312_,
						       1347801164)
				   - class137_296_.method1656(i_311_, i_312_,
							      951280822));
			} else if (class137_297_ != null
				   && !(aBoolArrayArray5050
					[(85124233
					  * ((Class458) this).anInt5095)]
					[i_303_])) {
			    int i_313_ = i_307_ + (i_287_ << 9);
			    int i_314_ = i_308_ + (i_288_ << 9);
			    is_295_[((Class458) this).anInt5092 * -1038190051]
				= (class137_297_.method1656(i_313_, i_314_,
							    1920352045)
				   - class137.method1656(i_313_, i_314_,
							 1656821664));
			}
		    }
		    if (i_303_ < 8 && (((Class458) this).anIntArray5077[i_304_]
				       > class636.anInt8236 * 538679245)) {
			if (is != null)
			    is[((Class458) this).anInt5092 * -1038190051]
				= ((Class458) this).anIntArray5074[i_304_];
			is_293_[((Class458) this).anInt5092 * -1038190051]
			    = ((Class458) this).anIntArray5076[i_304_];
			is_292_[((Class458) this).anInt5092 * -1038190051]
			    = ((Class458) this).anIntArray5021[i_304_];
			is_291_[((Class458) this).anInt5092 * -1038190051]
			    = ((Class458) this).anIntArray5073[i_304_];
		    } else {
			if (is != null)
			    is[-1038190051 * ((Class458) this).anInt5092]
				= i_299_;
			is_292_[((Class458) this).anInt5092 * -1038190051]
			    = 1038388161 * class636.anInt8228;
			is_293_[((Class458) this).anInt5092 * -1038190051]
			    = class636.anInt8234 * -1055844967;
			is_291_[-1038190051 * ((Class458) this).anInt5092]
			    = ((Class458) this).anInt5085 * -2032081319;
		    }
		    ((Class458) this).anInt5092 += 1624643637;
		}
		((Class458) this).anInt5081 += -116148707;
	    }
	    if (!aBool5023 && i == 0)
		aClass538_5011.method6588(i_287_, i_288_,
					  class636.anInt8239 * 1959448349,
					  class636.anInt8244 * -1942070184,
					  class636.anInt8231 * 351460333,
					  class636.anInt8241 * 1145965491,
					  class636.anInt8242 * -675060273,
					  881506237 * class636.anInt8240,
					  (byte) 116);
	    if (12 != 85124233 * ((Class458) this).anInt5095
		&& class636.anInt8230 * 491679725 != -1 && class636.aBool8235)
		((Class458) this).aBool5086 = true;
	} else if (((Class458) this).aBool5075)
	    ((Class458) this).anInt5081
		+= (anIntArray5089[85124233 * ((Class458) this).anInt5095]
		    * -116148707);
	else if (((Class458) this).aBool5082)
	    ((Class458) this).anInt5081
		+= (anIntArray5053[((Class458) this).anInt5095 * 85124233]
		    * -116148707);
	else
	    ((Class458) this).anInt5081
		+= (-116148707
		    * anIntArray5051[((Class458) this).anInt5095 * 85124233]);
    }
    
    void method5558(Class173 class173, Class137 class137, int i, int[][] is,
		    Class137 class137_315_, Class137 class137_316_,
		    int i_317_) {
	byte[][] is_318_ = ((Class458) this).aByteArrayArrayArray5025[i];
	byte[][] is_319_ = ((Class458) this).aByteArrayArrayArray5032[i];
	short[][] is_320_ = ((Class458) this).aShortArrayArrayArray5052[i];
	short[][] is_321_ = ((Class458) this).aShortArrayArrayArray5028[i];
	boolean[] bools = new boolean[4];
	for (int i_322_ = 0; i_322_ < anInt5019 * -2112239803; i_322_++) {
	    int i_323_
		= i_322_ < -2112239803 * anInt5019 - 1 ? 1 + i_322_ : i_322_;
	    for (int i_324_ = 0; i_324_ < anInt5059 * -828725691; i_324_++) {
		int i_325_ = (i_324_ < -828725691 * anInt5059 - 1 ? 1 + i_324_
			      : i_324_);
		((Class458) this).anInt5095
		    = 190697913 * is_318_[i_322_][i_324_];
		((Class458) this).anInt5093
		    = 1536579907 * is_319_[i_322_][i_324_];
		int i_326_ = is_321_[i_322_][i_324_] & 0x7fff;
		int i_327_ = is_320_[i_322_][i_324_] & 0x7fff;
		if (i_326_ != 0 || i_327_ != 0) {
		    Class636 class636
			= (Class636) (0 != i_326_
				      ? ((Class458) this)
					    .aClass5_Sub11_5078
					    .method63(i_326_ - 1, -518447652)
				      : null);
		    Class680 class680
			= (Class680) (0 != i_327_
				      ? ((Class458) this)
					    .aClass5_Sub18_5009
					    .method63(i_327_ - 1, 742730913)
				      : null);
		    if (((Class458) this).anInt5095 * 85124233 == 0
			&& null == class636)
			((Class458) this).anInt5095 = -2006592340;
		    ((Class458) this).aBool5086 = false;
		    ((Class458) this).aBool5082 = false;
		    boolean[] bools_328_ = bools;
		    boolean[] bools_329_ = bools;
		    boolean[] bools_330_ = bools;
		    bools[3] = false;
		    bools_330_[2] = false;
		    bools_329_[1] = false;
		    bools_328_[0] = false;
		    Class636 class636_331_ = class636;
		    if (null != class636) {
			if (491679725 * class636.anInt8230 == -1
			    && -1 == class636.anInt8233 * -685171829) {
			    class636_331_ = class636;
			    class636 = null;
			} else if (class680 != null
				   && 0 != (((Class458) this).anInt5095
					    * 85124233))
			    ((Class458) this).aBool5082 = class636.aBool8238;
		    }
		    ((Class458) this).anInt5093
			= (method5552(i_327_, i_322_, i_324_, i_323_, i_325_,
				      class137, is_320_, -1012005051)
			   * 1536579907);
		    for (int i_332_ = 0; i_332_ < 13; i_332_++) {
			((Class458) this).anIntArray5077[i_332_] = -1;
			((Class458) this).anIntArray5018[i_332_] = 1;
		    }
		    method5543(class173, class636, class680, i_322_, i_324_,
			       is_318_, is_319_, is_321_, bools, -1244206704);
		    ((Class458) this).aBool5075
			= (!((Class458) this).aBool5082 && !bools[0]
			   && !bools[2] && !bools[1] && !bools[3]);
		    method5553(class636, class680, (byte) 4);
		    int i_333_ = (((Class458) this).anInt5090 * -1644621513
				  + ((Class458) this).anInt5091 * -1459919949);
		    if (i_333_ <= 0)
			aClass538_5011.method6582(i, i_322_, i_324_,
						  1658005499);
		    else {
			if (bools[0])
			    i_333_++;
			if (bools[2])
			    i_333_++;
			if (bools[1])
			    i_333_++;
			if (bools[3])
			    i_333_++;
			((Class458) this).anInt5081 = 0;
			((Class458) this).anInt5092 = 0;
			int i_334_ = 3 * i_333_;
			int[] is_335_ = (((Class458) this).aBool5027
					 ? new int[i_334_] : null);
			int[] is_336_ = new int[i_334_];
			int[] is_337_ = new int[i_334_];
			int[] is_338_ = new int[i_334_];
			int[] is_339_ = new int[i_334_];
			int[] is_340_ = new int[i_334_];
			int[] is_341_
			    = class137_316_ != null ? new int[i_334_] : null;
			int[] is_342_
			    = (null != class137_316_ || null != class137_315_
			       ? new int[i_334_] : null);
			for (int i_343_ = 0; i_343_ < i_334_; i_343_++)
			    is_339_[i_343_] = -1;
			method5557(class173, i, i_322_, i_324_, class636,
				   bools, is_335_, is_336_, is_337_, is_338_,
				   is_339_, is_340_, is_341_, is_342_,
				   class137, class137_316_, class137_315_,
				   271590463);
			int i_344_ = is_320_[i_322_][i_325_] & 0x7fff;
			int i_345_ = is_320_[i_323_][i_325_] & 0x7fff;
			int i_346_ = is_320_[i_323_][i_324_] & 0x7fff;
			method5545(class173, i, i_322_, i_324_, i_323_, i_325_,
				   class680, i_327_, i_344_, i_345_, i_346_,
				   bools, is_335_, is_336_, is_337_, is_338_,
				   is_339_, is_340_, is_341_, is_342_, is,
				   class137, class137_316_, class137_315_,
				   927290967);
			method5546(class137, class680, class636_331_, i,
				   i_322_, i_324_, i_323_, i_325_, i_327_,
				   i_326_, 1548525911);
			Class164 class164 = new Class164();
			if (aBool5023) {
			    class164.anInt1827
				= (aClass538_5011.method6539(i_322_, i_324_,
							     (short) 512)
				   * -773326249);
			    class164.anInt1828
				= (aClass538_5011.method6575(i_322_, i_324_,
							     1229029821)
				   * 516788591);
			    class164.anInt1829
				= (aClass538_5011.method6540(i_322_, i_324_,
							     (byte) -40)
				   * -1923235093);
			    class164.anInt1831
				= (aClass538_5011.method6548(i_322_, i_324_,
							     1239022665)
				   * -1247427665);
			    class164.anInt1832
				= (aClass538_5011.method6541(i_322_, i_324_,
							     -1329965787)
				   * 1420649565);
			    class164.anInt1833
				= (aClass538_5011.method6542(i_322_, i_324_,
							     -1831271725)
				   * -589047283);
			}
			class137.method1686(i_322_, i_324_, is_336_, is_341_,
					    is_337_, is_342_, is_338_, is_335_,
					    is_339_, is_340_, class164,
					    ((Class458) this).aBool5086);
			aClass538_5011.method6582(i, i_322_, i_324_,
						  486372793);
		    }
		}
	    }
	}
    }
    
    static final int method5559(int i, int i_347_) {
	int i_348_ = i_347_ * 57 + i;
	i_348_ = i_348_ << 13 ^ i_348_;
	int i_349_
	    = ((15731 * (i_348_ * i_348_) + 789221) * i_348_ + 1376312589
	       & 0x7fffffff);
	return i_349_ >> 19 & 0xff;
    }
    
    static final int method5560(int i, int i_350_) {
	int i_351_ = i_350_ * 57 + i;
	i_351_ = i_351_ << 13 ^ i_351_;
	int i_352_
	    = ((15731 * (i_351_ * i_351_) + 789221) * i_351_ + 1376312589
	       & 0x7fffffff);
	return i_352_ >> 19 & 0xff;
    }
}
