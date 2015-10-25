/* Class458_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class458_Sub1 extends Class458
{
    static int[] anIntArray10102;
    Class627 aClass627_10103;
    static final int anInt10104 = 0;
    static final int anInt10105 = 1;
    static final int anInt10106 = 2;
    static final int anInt10107 = 3;
    static int[] anIntArray10108;
    static int[] anIntArray10109;
    static boolean aBool10110 = false;
    static int[] anIntArray10111;
    int anInt10112 = 1635039933;
    static boolean aBool10113 = false;
    Class5_Sub15 aClass5_Sub15_10114;
    
    public final void method9148(Class173 class173, boolean bool, byte i) {
	aClass538_5011.method6558();
	if (!bool) {
	    if (anInt5049 * -1767130973 > 1) {
		for (int i_0_ = 0; i_0_ < -2112239803 * anInt5019; i_0_++) {
		    for (int i_1_ = 0; i_1_ < -828725691 * anInt5059; i_1_++) {
			if (2 == ((aClass466_5079.aByteArrayArrayArray5312[1]
				   [i_0_][i_1_])
				  & 0x2))
			    aClass538_5011.method6535(i_0_, i_1_, 297444842);
		    }
		}
	    }
	    for (int i_2_ = 0; i_2_ < -1767130973 * anInt5049; i_2_++) {
		for (int i_3_ = 0; i_3_ <= anInt5059 * -828725691; i_3_++) {
		    for (int i_4_ = 0; i_4_ <= -2112239803 * anInt5019;
			 i_4_++) {
			if (0 != (aByteArrayArrayArray5029[i_2_][i_4_][i_3_]
				  & 0x4)) {
			    int i_5_ = i_4_;
			    int i_6_ = i_4_;
			    int i_7_ = i_3_;
			    int i_8_;
			    for (i_8_ = i_3_;
				 i_7_ > 0 && 0 != ((aByteArrayArrayArray5029
						    [i_2_][i_4_][i_7_ - 1])
						   & 0x4) && i_8_ - i_7_ < 10;
				 i_7_--) {
				/* empty */
			    }
			    for (/**/; (i_8_ < anInt5059 * -828725691
					&& ((aByteArrayArrayArray5029[i_2_]
					     [i_4_][i_8_ + 1])
					    & 0x4) != 0
					&& i_8_ - i_7_ < 10); i_8_++) {
				/* empty */
			    }
			while_32_:
			    for (/**/; i_5_ > 0 && i_6_ - i_5_ < 10; i_5_--) {
				for (int i_9_ = i_7_; i_9_ <= i_8_; i_9_++) {
				    if (((aByteArrayArrayArray5029[i_2_]
					  [i_5_ - 1][i_9_])
					 & 0x4)
					== 0)
					break while_32_;
				}
			    }
			while_33_:
			    for (/**/; (i_6_ < anInt5019 * -2112239803
					&& i_6_ - i_5_ < 10); i_6_++) {
				for (int i_10_ = i_7_; i_10_ <= i_8_;
				     i_10_++) {
				    if (((aByteArrayArrayArray5029[i_2_]
					  [i_6_ + 1][i_10_])
					 & 0x4)
					== 0)
					break while_33_;
				}
			    }
			    if ((1 + (i_8_ - i_7_)) * (1 + (i_6_ - i_5_))
				>= 4) {
				int i_11_ = (anIntArrayArrayArray5087[i_2_]
					     [i_5_][i_7_]);
				aClass538_5011.aClass559_7156.method6786
				    (4, i_2_, i_5_ << 9, 512 + (i_6_ << 9),
				     i_7_ << 9, (i_8_ << 9) + 512, i_11_,
				     i_11_);
				for (int i_12_ = i_5_; i_12_ <= i_6_;
				     i_12_++) {
				    for (int i_13_ = i_7_; i_13_ <= i_8_;
					 i_13_++)
					aByteArrayArrayArray5029[i_2_]
					    [i_12_][i_13_]
					    &= ~0x4;
				}
			    }
			}
		    }
		}
	    }
	    aClass538_5011.aClass559_7156.method6794();
	}
	aByteArrayArrayArray5029 = null;
    }
    
    public final void method9149(Class173 class173,
				 ByteBuffer class528_sub42, int i,
				 int i_14_, byte i_15_) {
	if (!aBool5023) {
	    class528_sub42.pointer += -1059856808;
	    boolean bool = false;
	    Class607 class607 = null;
	    boolean bool_16_ = false;
	    while (class528_sub42.pointer * -185904669
		   < class528_sub42.payload.length) {
		int i_17_ = class528_sub42.readUnsignedByte((byte) 102);
		if (0 == i_17_) {
		    if (class607 == null)
			class607 = new Class607(class528_sub42,
						(((Class458_Sub1) this)
						 .aClass627_10103));
		    else
			class607.method7227(class528_sub42,
					    (((Class458_Sub1) this)
					     .aClass627_10103),
					    1451555060);
		} else if (i_17_ == 1) {
		    int i_18_ = class528_sub42.readUnsignedByte((byte) 98);
		    if (i_18_ > 0) {
			for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
			    Class543 class543
				= new Class543(class173,
					       (aClass538_5011.anInt7148
						* -1532596617),
					       class528_sub42, 2);
			    if (-1768642449 * class543.anInt7258 == 31) {
				Class75 class75
				    = ((Class75)
				       (Class57.aClass5_Sub22_686.method63
					(class528_sub42.readUnsignedShort(479665503),
					 2029747065)));
				class543.method6632
				    (class75.anInt786 * -445573679,
				     class75.anInt788 * 1702325391,
				     class75.anInt789 * 451892221,
				     class75.anInt787 * 2104842343, (byte) 32);
			    }
			    if (class173.method2256() > 0) {
				Class528_Sub12 class528_sub12
				    = class543.aClass528_Sub12_7266;
				int i_20_
				    = (class528_sub12.method9366(1592536620)
				       + (i << 9));
				int i_21_
				    = (class528_sub12.method9370(1221114533)
				       + (i_14_ << 9));
				int i_22_ = i_20_ >> 9;
				int i_23_ = i_21_ >> 9;
				if (i_22_ >= 0 && i_23_ >= 0
				    && i_22_ < -2112239803 * anInt5019
				    && i_23_ < -828725691 * anInt5059) {
				    class528_sub12.method9384
					(i_20_,
					 ((anIntArrayArrayArray5087
					   [class543.anInt7262 * 264933169]
					   [i_22_][i_23_])
					  - class528_sub12
						.method9360(-1375654801)),
					 i_21_, 1813332092);
				    aClass538_5011.method6560(class543,
							      (byte) 124);
				}
			    }
			}
		    }
		} else if (i_17_ == 2) {
		    if (null == class607)
			class607 = new Class607();
		    class607.method7217(class528_sub42, 1875278640);
		} else if (i_17_ == 3) {
		    if (null == class607)
			class607 = new Class607();
		    class607.method7218(class528_sub42, (byte) 43);
		} else if (i_17_ == 128) {
		    if (class607 == null)
			class607 = new Class607();
		    class607.method7220(class528_sub42,
					((Class458_Sub1) this).aClass627_10103,
					(short) 31516);
		} else if (i_17_ == 129) {
		    if (aByteArrayArrayArray5058 == null)
			aByteArrayArrayArray5058 = new byte[4][][];
		    for (int i_24_ = 0; i_24_ < 4; i_24_++) {
			byte i_25_ = class528_sub42.method9627(-1484179077);
			if (i_25_ == 0
			    && aByteArrayArrayArray5058[i_24_] != null) {
			    int i_26_ = i;
			    int i_27_ = 64 + i;
			    int i_28_ = i_14_;
			    int i_29_ = 64 + i_14_;
			    if (i_26_ < 0)
				i_26_ = 0;
			    else if (i_26_ >= -2112239803 * anInt5019)
				i_26_ = -2112239803 * anInt5019;
			    if (i_27_ < 0)
				i_27_ = 0;
			    else if (i_27_ >= -2112239803 * anInt5019)
				i_27_ = anInt5019 * -2112239803;
			    if (i_28_ < 0)
				i_28_ = 0;
			    else if (i_28_ >= anInt5059 * -828725691)
				i_28_ = -828725691 * anInt5059;
			    if (i_29_ < 0)
				i_29_ = 0;
			    else if (i_29_ >= -828725691 * anInt5059)
				i_29_ = anInt5059 * -828725691;
			    for (/**/; i_26_ < i_27_; i_26_++) {
				for (/**/; i_28_ < i_29_; i_28_++)
				    aByteArrayArrayArray5058[i_24_][i_26_]
					[i_28_]
					= (byte) 0;
			    }
			} else if (i_25_ == 1) {
			    if (null == aByteArrayArrayArray5058[i_24_])
				aByteArrayArrayArray5058[i_24_]
				    = (new byte[1 + -2112239803 * anInt5019]
				       [1 + anInt5059 * -828725691]);
			    for (int i_30_ = 0; i_30_ < 64; i_30_ += 4) {
				for (int i_31_ = 0; i_31_ < 64; i_31_ += 4) {
				    byte i_32_ = class528_sub42
						     .method9627(-2083255640);
				    for (int i_33_ = i + i_30_;
					 i_33_ < i_30_ + i + 4; i_33_++) {
					for (int i_34_ = i_31_ + i_14_;
					     i_34_ < 4 + (i_14_ + i_31_);
					     i_34_++) {
					    if (i_33_ >= 0
						&& (i_33_
						    < -2112239803 * anInt5019)
						&& i_34_ >= 0
						&& (i_34_
						    < -828725691 * anInt5059))
						aByteArrayArrayArray5058
						    [i_24_][i_33_][i_34_]
						    = i_32_;
					}
				    }
				}
			    }
			} else if (i_25_ == 2) {
			    if (aByteArrayArrayArray5058[i_24_] == null)
				aByteArrayArrayArray5058[i_24_]
				    = (new byte[1 + -2112239803 * anInt5019]
				       [-828725691 * anInt5059 + 1]);
			    if (i_24_ > 0) {
				int i_35_ = i;
				int i_36_ = 64 + i;
				int i_37_ = i_14_;
				int i_38_ = i_14_ + 64;
				if (i_35_ < 0)
				    i_35_ = 0;
				else if (i_35_ >= -2112239803 * anInt5019)
				    i_35_ = anInt5019 * -2112239803;
				if (i_36_ < 0)
				    i_36_ = 0;
				else if (i_36_ >= -2112239803 * anInt5019)
				    i_36_ = -2112239803 * anInt5019;
				if (i_37_ < 0)
				    i_37_ = 0;
				else if (i_37_ >= -828725691 * anInt5059)
				    i_37_ = -828725691 * anInt5059;
				if (i_38_ < 0)
				    i_38_ = 0;
				else if (i_38_ >= anInt5059 * -828725691)
				    i_38_ = anInt5059 * -828725691;
				for (/**/; i_35_ < i_36_; i_35_++) {
				    for (/**/; i_37_ < i_38_; i_37_++)
					aByteArrayArrayArray5058[i_24_]
					    [i_35_][i_37_]
					    = (aByteArrayArrayArray5058
					       [i_24_ - 1][i_35_][i_37_]);
				}
			    }
			}
		    }
		    bool = true;
		} else if (130 == i_17_)
		    bool_16_ = true;
		else
		    throw new IllegalStateException("");
	    }
	    for (int i_39_ = 0; i_39_ < 8; i_39_++) {
		for (int i_40_ = 0; i_40_ < 8; i_40_++) {
		    int i_41_ = i_39_ + (i >> 3);
		    int i_42_ = (i_14_ >> 3) + i_40_;
		    if (i_41_ >= 0 && i_41_ < -2112239803 * anInt5019 >> 3
			&& i_42_ >= 0 && i_42_ < anInt5059 * -828725691 >> 3) {
			if (null != class607)
			    ((Class458_Sub1) this).aClass627_10103
				.method7472(i_41_, i_42_, class607, 491389396);
			Class86.method1159(i_41_, i_42_, bool_16_, 1811255603);
		    }
		}
	    }
	    if (!bool && aByteArrayArrayArray5058 != null) {
		for (int i_43_ = 0; i_43_ < 4; i_43_++) {
		    if (aByteArrayArrayArray5058[i_43_] != null) {
			for (int i_44_ = 0; i_44_ < 16; i_44_++) {
			    for (int i_45_ = 0; i_45_ < 16; i_45_++) {
				int i_46_ = (i >> 2) + i_44_;
				int i_47_ = (i_14_ >> 2) + i_45_;
				if (i_46_ >= 0 && i_46_ < 26 && i_47_ >= 0
				    && i_47_ < 26)
				    aByteArrayArrayArray5058[i_43_][i_46_]
					[i_47_]
					= (byte) 0;
			    }
			}
		    }
		}
	    }
	}
    }
    
    public final void method9150
	(Class173 class173, ByteBuffer class528_sub42, int i, int i_48_,
	 int i_49_, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_) {
	if (!aBool5023) {
	    class528_sub42.pointer += -1059856808;
	    boolean bool = false;
	    Class607 class607 = null;
	    boolean bool_55_ = false;
	    int i_56_ = 8 * (i_51_ & 0x7);
	    int i_57_ = (i_52_ & 0x7) * 8;
	    while (-185904669 * class528_sub42.pointer
		   < class528_sub42.payload.length) {
		int i_58_ = class528_sub42.readUnsignedByte((byte) 97);
		if (i_58_ == 0) {
		    if (null == class607)
			class607 = new Class607(class528_sub42,
						(((Class458_Sub1) this)
						 .aClass627_10103));
		    else
			class607.method7227(class528_sub42,
					    (((Class458_Sub1) this)
					     .aClass627_10103),
					    1151429555);
		} else if (i_58_ == 1) {
		    int i_59_ = class528_sub42.readUnsignedByte((byte) 120);
		    if (i_59_ > 0) {
			for (int i_60_ = 0; i_60_ < i_59_; i_60_++) {
			    Class543 class543
				= new Class543(class173,
					       (aClass538_5011.anInt7148
						* -1532596617),
					       class528_sub42, 2);
			    if (-1768642449 * class543.anInt7258 == 31) {
				Class75 class75
				    = ((Class75)
				       (Class57.aClass5_Sub22_686.method63
					(class528_sub42.readUnsignedShort(238745494),
					 790345264)));
				class543.method6632
				    (-445573679 * class75.anInt786,
				     1702325391 * class75.anInt788,
				     451892221 * class75.anInt789,
				     2104842343 * class75.anInt787, (byte) 32);
			    }
			    if (class173.method2256() > 0) {
				Class528_Sub12 class528_sub12
				    = class543.aClass528_Sub12_7266;
				int i_61_
				    = (class528_sub12.method9366(1876719022)
				       >> 9);
				int i_62_
				    = (class528_sub12.method9370(1221114533)
				       >> 9);
				if (264933169 * class543.anInt7262 == i_50_
				    && i_61_ >= i_56_ && i_61_ < 8 + i_56_
				    && i_62_ >= i_57_ && i_62_ < 8 + i_57_) {
				    int i_63_
					= ((i_48_ << 9)
					   + (Class351.method4569
					      ((class528_sub12
						    .method9366(1523119758)
						& 0xfff),
					       (class528_sub12
						    .method9370(1221114533)
						& 0xfff),
					       i_53_, -92316566)));
				    int i_64_
					= ((i_49_ << 9)
					   + (Class544.method6658
					      ((class528_sub12
						    .method9366(1610550285)
						& 0xfff),
					       (class528_sub12
						    .method9370(1221114533)
						& 0xfff),
					       i_53_, 1234694097)));
				    i_61_ = i_63_ >> 9;
				    i_62_ = i_64_ >> 9;
				    if (i_61_ >= 0 && i_62_ >= 0
					&& i_61_ < anInt5019 * -2112239803
					&& i_62_ < -828725691 * anInt5059) {
					class543.anInt7262 = i * -137991727;
					class528_sub12.method9384
					    (i_63_,
					     ((anIntArrayArrayArray5087
					       [class543.anInt7262 * 264933169]
					       [i_61_][i_62_])
					      - class528_sub12
						    .method9360(-1375654801)),
					     i_64_, 1813332092);
					aClass538_5011.method6560(class543,
								  (byte) 103);
				    }
				}
			    }
			}
		    }
		} else if (2 == i_58_) {
		    if (null == class607)
			class607 = new Class607();
		    class607.method7217(class528_sub42, 854811268);
		} else if (3 == i_58_) {
		    if (class607 == null)
			class607 = new Class607();
		    class607.method7218(class528_sub42, (byte) 127);
		} else if (i_58_ == 128) {
		    if (null == class607)
			class607 = new Class607();
		    class607.method7220(class528_sub42,
					((Class458_Sub1) this).aClass627_10103,
					(short) 21626);
		} else if (129 == i_58_) {
		    if (null == aByteArrayArrayArray5058)
			aByteArrayArrayArray5058 = new byte[4][][];
		    for (int i_65_ = 0; i_65_ < 4; i_65_++) {
			byte i_66_ = class528_sub42.method9627(-1610693210);
			if (0 == i_66_
			    && null != aByteArrayArrayArray5058[i]) {
			    if (i_65_ <= i_50_) {
				int i_67_ = i_48_;
				int i_68_ = 7 + i_48_;
				int i_69_ = i_49_;
				int i_70_ = i_49_ + 7;
				if (i_67_ < 0)
				    i_67_ = 0;
				else if (i_67_ >= anInt5019 * -2112239803)
				    i_67_ = anInt5019 * -2112239803;
				if (i_68_ < 0)
				    i_68_ = 0;
				else if (i_68_ >= -2112239803 * anInt5019)
				    i_68_ = anInt5019 * -2112239803;
				if (i_69_ < 0)
				    i_69_ = 0;
				else if (i_69_ >= -828725691 * anInt5059)
				    i_69_ = anInt5059 * -828725691;
				if (i_70_ < 0)
				    i_70_ = 0;
				else if (i_70_ >= anInt5059 * -828725691)
				    i_70_ = anInt5059 * -828725691;
				for (/**/; i_67_ < i_68_; i_67_++) {
				    for (/**/; i_69_ < i_70_; i_69_++)
					aByteArrayArrayArray5058[i][i_67_]
					    [i_69_]
					    = (byte) 0;
				}
			    }
			} else if (i_66_ == 1) {
			    if (null == aByteArrayArrayArray5058[i])
				aByteArrayArrayArray5058[i]
				    = (new byte[1 + -2112239803 * anInt5019]
				       [1 + -828725691 * anInt5059]);
			    for (int i_71_ = 0; i_71_ < 64; i_71_ += 4) {
				for (int i_72_ = 0; i_72_ < 64; i_72_ += 4) {
				    byte i_73_ = class528_sub42
						     .method9627(-2095525600);
				    if (i_65_ <= i_50_) {
					for (int i_74_ = i_71_;
					     i_74_ < 4 + i_71_; i_74_++) {
					    for (int i_75_ = i_72_;
						 i_75_ < 4 + i_72_; i_75_++) {
						if (i_74_ >= i_56_
						    && i_74_ < 8 + i_56_
						    && i_75_ >= i_57_
						    && i_75_ < i_57_ + 8) {
						    int i_76_
							= (i_48_
							   + (Class379
								  .method4712
							      (i_74_ & 0x7,
							       i_75_ & 0x7,
							       i_53_,
							       (byte) 52)));
						    int i_77_
							= (i_49_
							   + (Class73
								  .method1115
							      (i_74_ & 0x7,
							       i_75_ & 0x7,
							       i_53_,
							       -2041907249)));
						    if (i_76_ >= 0
							&& (i_76_
							    < (anInt5019
							       * -2112239803))
							&& i_77_ >= 0
							&& (i_77_
							    < (-828725691
							       * anInt5059))) {
							aByteArrayArrayArray5058
							    [i][i_76_][i_77_]
							    = i_73_;
							bool = true;
						    }
						}
					    }
					}
				    }
				}
			    }
			} else if (i_66_ == 2)
			    continue;
		    }
		} else if (i_58_ == 130)
		    bool_55_ = true;
		else
		    throw new IllegalStateException("");
	    }
	    if (null != class607)
		((Class458_Sub1) this).aClass627_10103
		    .method7472(i_48_ >> 3, i_49_ >> 3, class607, 516967641);
	    Class86.method1159(i_48_ >> 3, i_49_ >> 3, bool_55_, -809265232);
	    if (!bool && aByteArrayArrayArray5058 != null
		&& aByteArrayArrayArray5058[i] != null) {
		int i_78_ = 7 + i_48_;
		int i_79_ = i_49_ + 7;
		for (int i_80_ = i_48_; i_80_ < i_78_; i_80_++) {
		    for (int i_81_ = i_49_; i_81_ < i_79_; i_81_++)
			aByteArrayArrayArray5058[i][i_80_][i_81_] = (byte) 0;
		}
	    }
	}
    }
    
    public final void method9151(Class173 class173, byte[] is, int i,
				 int i_82_, int i_83_, int i_84_, int i_85_,
				 int i_86_, int i_87_, int i_88_) {
	ByteBuffer class528_sub42 = new ByteBuffer(is);
	int i_89_ = -1;
	for (;;) {
	    int i_90_ = class528_sub42.method9643(1240759072);
	    if (i_90_ == 0)
		break;
	    i_89_ += i_90_;
	    int i_91_ = 0;
	    for (;;) {
		int i_92_ = class528_sub42.method9719(65280);
		if (0 == i_92_)
		    break;
		i_91_ += i_92_ - 1;
		int i_93_ = i_91_ & 0x3f;
		int i_94_ = i_91_ >> 6 & 0x3f;
		int i_95_ = i_91_ >> 12;
		int i_96_ = class528_sub42.readUnsignedByte((byte) 31);
		int i_97_ = i_96_ >> 2;
		int i_98_ = i_96_ & 0x3;
		if (i_95_ == i_84_ && i_94_ >= i_85_ && i_94_ < 8 + i_85_
		    && i_93_ >= i_86_ && i_93_ < 8 + i_86_) {
		    Class596 class596
			= (Class596) ((Class458_Sub1) this)
					 .aClass5_Sub15_10114
					 .method63(i_89_, 127589644);
		    int i_99_;
		    int i_100_;
		    if ((i_98_ & 0x1) == 0) {
			i_99_ = -267660407 * class596.anInt7812;
			i_100_ = 423043053 * class596.anInt7843;
		    } else {
			i_99_ = class596.anInt7843 * 423043053;
			i_100_ = class596.anInt7812 * -267660407;
		    }
		    int i_101_
			= i_82_ + Class505.method6147(i_94_ & 0x7, i_93_ & 0x7,
						      i_87_,
						      (class596.anInt7812
						       * -267660407),
						      (class596.anInt7843
						       * 423043053),
						      i_98_, -1327694705);
		    int i_102_
			= i_83_ + Class442.method5310(i_94_ & 0x7, i_93_ & 0x7,
						      i_87_,
						      (-267660407
						       * class596.anInt7812),
						      (class596.anInt7843
						       * 423043053),
						      i_98_, (byte) -8);
		    int i_103_ = i_99_ + i_101_;
		    int i_104_ = i_102_ + i_100_;
		    if (i_101_ < anInt5019 * -2112239803
			&& i_102_ < anInt5059 * -828725691 && i_103_ > 0
			&& i_104_ > 0
			&& ((Class605.aClass605_7893.anInt7905 * 1922173025
			     == i_97_)
			    || i_97_ == (Class605.aClass605_7912.anInt7905
					 * 1922173025)
			    || (i_101_ > 0 && i_102_ > 0
				&& i_101_ < anInt5019 * -2112239803 - 1
				&& i_102_ < anInt5059 * -828725691 - 1)))
			method9152(class173, i, i, i_101_, i_102_, i_89_,
				   i_98_ + i_87_ & 0x3, i_97_, -1, 0,
				   (byte) 0);
		}
	    }
	}
    }
    
    final void method9152(Class173 class173, int i, int i_105_, int i_106_,
			  int i_107_, int i_108_, int i_109_, int i_110_,
			  int i_111_, int i_112_, byte i_113_) {
	if (i_105_ < -1303189089 * ((Class458_Sub1) this).anInt10112)
	    ((Class458_Sub1) this).anInt10112 = i_105_ * 146666079;
	Class596 class596
	    = (Class596) ((Class458_Sub1) this).aClass5_Sub15_10114
			     .method63(i_108_, 1991793722);
	if (Class514.aClass528_Sub38_6967.aClass691_Sub12_10590
		.method9915((byte) 1) != 0
	    || !class596.aBool7839) {
	    int i_114_;
	    int i_115_;
	    if (1 == i_109_ || 3 == i_109_) {
		i_114_ = 423043053 * class596.anInt7843;
		i_115_ = class596.anInt7812 * -267660407;
	    } else {
		i_114_ = class596.anInt7812 * -267660407;
		i_115_ = 423043053 * class596.anInt7843;
	    }
	    int i_116_;
	    int i_117_;
	    if (i_106_ + i_114_ <= -2112239803 * anInt5019) {
		i_116_ = i_106_ + (i_114_ >> 1);
		i_117_ = (1 + i_114_ >> 1) + i_106_;
	    } else {
		i_116_ = i_106_;
		i_117_ = 1 + i_106_;
	    }
	    int i_118_;
	    int i_119_;
	    if (i_107_ + i_115_ <= -828725691 * anInt5059) {
		i_118_ = (i_115_ >> 1) + i_107_;
		i_119_ = (1 + i_115_ >> 1) + i_107_;
	    } else {
		i_118_ = i_107_;
		i_119_ = i_107_ + 1;
	    }
	    Class137 class137 = aClass538_5011.aClass137Array7161[i];
	    int i_120_;
	    if (Class605.aClass605_7893.anInt7905 * 1922173025 == i_110_
		|| Class605.aClass605_7912.anInt7905 * 1922173025 == i_110_)
		i_120_ = ((class137.method1659(i_116_, i_118_, 708482385)
			   + class137.method1659(i_117_, i_118_, -2047828183)
			   + class137.method1659(i_116_, i_119_, -1243921651)
			   + class137.method1659(i_117_, i_119_, -1387458975))
			  >> 2);
	    else
		i_120_
		    = (class137.method1669(i_116_, i_118_, (byte) 0)
		       + class137.method1669(i_117_, i_118_, (byte) 0)
		       + class137.method1669(i_116_, i_119_, (byte) 0)
		       + class137.method1669(i_117_, i_119_, (byte) 0)) >> 2;
	    int i_121_ = (i_106_ << 9) + (i_114_ << 8);
	    int i_122_ = (i_115_ << 8) + (i_107_ << 9);
	    boolean bool = aBool5062 && !aBool5023 && class596.aBool7820;
	    if (class596.method7105(733024846))
		Class293.method3961(i_105_, i_106_, i_107_, i_109_, class596,
				    null, null, (short) 857);
	    boolean bool_123_
		= (-1 == i_111_
		   && (!class596.method7101(1724344809)
		       || class596.aBool7838 && (Class514
						     .aClass528_Sub38_6967
						     .aClass691_Sub25_10592
						     .method10028((byte) 26)
						 == 0))
		   && class596.anIntArray7767 == null && !class596.aBool7835
		   && !class596.aBool7776);
	    if (!aBool10110
		|| ((!Class295.method3969(i_110_, 1212420052)
		     || 1 == class596.anInt7789 * -1830612759)
		    && (!Class73.method1114(i_110_, -1321172642)
			|| 0 != -1830612759 * class596.anInt7789))) {
		if (i_110_ == Class605.aClass605_7913.anInt7905 * 1922173025) {
		    if (Class514.aClass528_Sub38_6967.aClass691_Sub4_10578
			    .method9850((byte) 104) != 0
			|| class596.anInt7785 * 567849393 != 0
			|| class596.anInt7784 * 751199807 == 1
			|| class596.aBool7816) {
			Class645_Sub1_Sub4 class645_sub1_sub4;
			if (bool_123_) {
			    Class645_Sub1_Sub4_Sub1 class645_sub1_sub4_sub1
				= (new Class645_Sub1_Sub4_Sub1
				   (aClass538_5011, class173,
				    ((Class458_Sub1) this).aClass5_Sub15_10114,
				    class596, i_105_, i, i_121_, i_120_,
				    i_122_, aBool5023, i_109_, bool));
			    if (class645_sub1_sub4_sub1.method386(135595286))
				class645_sub1_sub4_sub1.method388(class173,
								  319171115);
			    class645_sub1_sub4 = class645_sub1_sub4_sub1;
			} else
			    class645_sub1_sub4
				= (new Class645_Sub1_Sub4_Sub2
				   (aClass538_5011, class173,
				    ((Class458_Sub1) this).aClass5_Sub15_10114,
				    class596, i_105_, i, i_121_, i_120_,
				    i_122_, aBool5023, i_109_, i_111_,
				    i_112_));
			aClass538_5011.method6543(i_105_, i_106_, i_107_,
						  class645_sub1_sub4,
						  632719237);
		    }
		} else if ((1922173025 * Class605.aClass605_7893.anInt7905
			    == i_110_)
			   || i_110_ == (Class605.aClass605_7912.anInt7905
					 * 1922173025)) {
		    Class645_Sub1_Sub5_Sub3 class645_sub1_sub5_sub3 = null;
		    Class645_Sub1_Sub5 class645_sub1_sub5;
		    int i_124_;
		    if (bool_123_) {
			Class645_Sub1_Sub5_Sub3 class645_sub1_sub5_sub3_125_
			    = (new Class645_Sub1_Sub5_Sub3
			       (aClass538_5011, class173,
				((Class458_Sub1) this).aClass5_Sub15_10114,
				class596, i_105_, i, i_121_, i_120_, i_122_,
				aBool5023, i_106_, i_114_ + i_106_ - 1, i_107_,
				i_107_ + i_115_ - 1, i_110_, i_109_, bool,
				(Class598.aClass598_7854
				 != class596.aClass598_7841)));
			i_124_ = class645_sub1_sub5_sub3_125_
				     .method10760(136412252);
			class645_sub1_sub5 = class645_sub1_sub5_sub3_125_;
			class645_sub1_sub5_sub3 = class645_sub1_sub5_sub3_125_;
		    } else {
			class645_sub1_sub5
			    = (new Class645_Sub1_Sub5_Sub2
			       (aClass538_5011, class173,
				((Class458_Sub1) this).aClass5_Sub15_10114,
				class596, i_105_, i, i_121_, i_120_, i_122_,
				aBool5023, i_106_, i_114_ + i_106_ - 1, i_107_,
				i_115_ + i_107_ - 1, i_110_, i_109_, i_111_,
				i_112_,
				(class596.aClass598_7841
				 != Class598.aClass598_7854)));
			i_124_ = 15;
		    }
		    if (aClass538_5011.method6545(class645_sub1_sub5, false,
						  1459621960)) {
			if (null != class645_sub1_sub5_sub3
			    && class645_sub1_sub5_sub3.method386(-349236752))
			    class645_sub1_sub5_sub3.method388(class173,
							      1371305487);
			if (class596.aBool7797 && aBool5062) {
			    if (i_124_ > 30)
				i_124_ = 30;
			    for (int i_126_ = 0; i_126_ <= i_114_; i_126_++) {
				for (int i_127_ = 0; i_127_ <= i_115_;
				     i_127_++)
				    class137.method1651(i_106_ + i_126_,
							i_127_ + i_107_,
							i_124_);
			    }
			}
		    }
		} else if (Class73.method1114(i_110_, -1321172642)
			   || Class316_Sub1.method9006(i_110_, -1401997950)) {
		    Class645_Sub1_Sub5 class645_sub1_sub5;
		    if (bool_123_) {
			Class645_Sub1_Sub5_Sub3 class645_sub1_sub5_sub3
			    = (new Class645_Sub1_Sub5_Sub3
			       (aClass538_5011, class173,
				((Class458_Sub1) this).aClass5_Sub15_10114,
				class596, i_105_, i, i_121_, i_120_, i_122_,
				aBool5023, i_106_, i_106_ + i_114_ - 1, i_107_,
				i_115_ + i_107_ - 1, i_110_, i_109_, bool,
				true));
			if (class645_sub1_sub5_sub3.method386(1645876992))
			    class645_sub1_sub5_sub3.method388(class173,
							      912429050);
			class645_sub1_sub5 = class645_sub1_sub5_sub3;
		    } else
			class645_sub1_sub5
			    = (new Class645_Sub1_Sub5_Sub2
			       (aClass538_5011, class173,
				((Class458_Sub1) this).aClass5_Sub15_10114,
				class596, i_105_, i, i_121_, i_120_, i_122_,
				aBool5023, i_106_, i_114_ + i_106_ - 1, i_107_,
				i_107_ + i_115_ - 1, i_110_, i_109_, i_111_,
				i_112_, true));
		    aClass538_5011.method6545(class645_sub1_sub5, false,
					      1811908003);
		    if (aBool5062 && !aBool5023
			&& Class73.method1114(i_110_, -1321172642)
			&& (i_110_
			    != Class605.aClass605_7904.anInt7905 * 1922173025)
			&& i_105_ > 0 && 0 != class596.anInt7789 * -1830612759)
			aByteArrayArrayArray5029[i_105_][i_106_][i_107_]
			    |= 0x4;
		} else if (method9153(class173, i_110_, i_109_, bool_123_,
				      class596, i_111_, i_112_, i_105_, i,
				      i_121_, i_120_, i_122_, i_106_, i_107_,
				      bool, class137, i_114_, i_115_,
				      -432625356)
			   || method9156(class173, i_110_, i_109_, bool_123_,
					 class596, i_111_, i_112_, i_105_, i,
					 i_121_, i_120_, i_122_, i_106_,
					 i_107_, (byte) 65)) {
		    /* empty */
		}
	    }
	}
    }
    
    boolean method9153(Class173 class173, int i, int i_128_, boolean bool,
		       Class596 class596, int i_129_, int i_130_, int i_131_,
		       int i_132_, int i_133_, int i_134_, int i_135_,
		       int i_136_, int i_137_, boolean bool_138_,
		       Class137 class137, int i_139_, int i_140_, int i_141_) {
	if (1922173025 * Class605.aClass605_7907.anInt7905 == i) {
	    int i_142_ = class596.anInt7789 * -1830612759;
	    if (aBool10113 && class596.anInt7789 * -1830612759 == -1)
		i_142_ = 1;
	    Class645_Sub1_Sub3 class645_sub1_sub3;
	    if (bool) {
		Class645_Sub1_Sub3_Sub2 class645_sub1_sub3_sub2
		    = new Class645_Sub1_Sub3_Sub2(aClass538_5011, class173,
						  (((Class458_Sub1) this)
						   .aClass5_Sub15_10114),
						  class596, i_131_, i_132_,
						  i_133_, i_134_, i_135_,
						  aBool5023, i, i_128_,
						  bool_138_);
		if (class645_sub1_sub3_sub2.method386(-1074484794))
		    class645_sub1_sub3_sub2.method388(class173, 1355131459);
		class645_sub1_sub3 = class645_sub1_sub3_sub2;
	    } else
		class645_sub1_sub3
		    = new Class645_Sub1_Sub3_Sub1(aClass538_5011, class173,
						  (((Class458_Sub1) this)
						   .aClass5_Sub15_10114),
						  class596, i_131_, i_132_,
						  i_133_, i_134_, i_135_,
						  aBool5023, i, i_128_, i_129_,
						  i_130_);
	    aClass538_5011.method6586(i_131_, i_136_, i_137_,
				      class645_sub1_sub3, null, 1263750053);
	    if (0 == i_128_) {
		if (aBool5062 && class596.aBool7797) {
		    class137.method1651(i_136_, i_137_, 50);
		    class137.method1651(i_136_, i_137_ + 1, 50);
		}
		if (i_142_ == 1 && !aBool5023)
		    aClass538_5011.aClass559_7156.method6793
			(1, i_131_, i_136_, i_137_,
			 class596.anInt7837 * -195683637,
			 class596.anInt7791 * -1611621153);
	    } else if (1 == i_128_) {
		if (aBool5062 && class596.aBool7797) {
		    class137.method1651(i_136_, i_137_ + 1, 50);
		    class137.method1651(1 + i_136_, 1 + i_137_, 50);
		}
		if (1 == i_142_ && !aBool5023)
		    aClass538_5011.aClass559_7156.method6793
			(2, i_131_, i_136_, 1 + i_137_,
			 -195683637 * class596.anInt7837,
			 -(-1611621153 * class596.anInt7791));
	    } else if (i_128_ == 2) {
		if (aBool5062 && class596.aBool7797) {
		    class137.method1651(1 + i_136_, i_137_, 50);
		    class137.method1651(i_136_ + 1, 1 + i_137_, 50);
		}
		if (1 == i_142_ && !aBool5023)
		    aClass538_5011.aClass559_7156.method6793
			(1, i_131_, i_136_ + 1, i_137_,
			 -195683637 * class596.anInt7837,
			 -(-1611621153 * class596.anInt7791));
	    } else if (3 == i_128_) {
		if (aBool5062 && class596.aBool7797) {
		    class137.method1651(i_136_, i_137_, 50);
		    class137.method1651(1 + i_136_, i_137_, 50);
		}
		if (i_142_ == 1 && !aBool5023)
		    aClass538_5011.aClass559_7156.method6793
			(2, i_131_, i_136_, i_137_,
			 class596.anInt7837 * -195683637,
			 -1611621153 * class596.anInt7791);
	    }
	    if (64 != -1353373471 * class596.anInt7817)
		aClass538_5011.method6546(i_131_, i_136_, i_137_,
					  class596.anInt7817 * -1353373471,
					  (short) 330);
	    return true;
	}
	if (Class605.aClass605_7898.anInt7905 * 1922173025 == i) {
	    Class645_Sub1_Sub3 class645_sub1_sub3;
	    if (bool) {
		Class645_Sub1_Sub3_Sub2 class645_sub1_sub3_sub2
		    = new Class645_Sub1_Sub3_Sub2(aClass538_5011, class173,
						  (((Class458_Sub1) this)
						   .aClass5_Sub15_10114),
						  class596, i_131_, i_132_,
						  i_133_, i_134_, i_135_,
						  aBool5023, i, i_128_,
						  bool_138_);
		if (class645_sub1_sub3_sub2.method386(824624817))
		    class645_sub1_sub3_sub2.method388(class173, 851791488);
		class645_sub1_sub3 = class645_sub1_sub3_sub2;
	    } else
		class645_sub1_sub3
		    = new Class645_Sub1_Sub3_Sub1(aClass538_5011, class173,
						  (((Class458_Sub1) this)
						   .aClass5_Sub15_10114),
						  class596, i_131_, i_132_,
						  i_133_, i_134_, i_135_,
						  aBool5023, i, i_128_, i_129_,
						  i_130_);
	    aClass538_5011.method6586(i_131_, i_136_, i_137_,
				      class645_sub1_sub3, null, -539378168);
	    if (class596.aBool7797 && aBool5062) {
		if (i_128_ == 0)
		    class137.method1651(i_136_, i_137_ + 1, 50);
		else if (i_128_ == 1)
		    class137.method1651(1 + i_136_, 1 + i_137_, 50);
		else if (2 == i_128_)
		    class137.method1651(1 + i_136_, i_137_, 50);
		else if (3 == i_128_)
		    class137.method1651(i_136_, i_137_, 50);
	    }
	    return true;
	}
	if (i == Class605.aClass605_7891.anInt7905 * 1922173025) {
	    int i_143_ = 1 + i_128_ & 0x3;
	    Class645_Sub1_Sub3 class645_sub1_sub3;
	    Class645_Sub1_Sub3 class645_sub1_sub3_144_;
	    if (bool) {
		Class645_Sub1_Sub3_Sub2 class645_sub1_sub3_sub2
		    = new Class645_Sub1_Sub3_Sub2(aClass538_5011, class173,
						  (((Class458_Sub1) this)
						   .aClass5_Sub15_10114),
						  class596, i_131_, i_132_,
						  i_133_, i_134_, i_135_,
						  aBool5023, i, i_128_ + 4,
						  bool_138_);
		Class645_Sub1_Sub3_Sub2 class645_sub1_sub3_sub2_145_
		    = new Class645_Sub1_Sub3_Sub2(aClass538_5011, class173,
						  (((Class458_Sub1) this)
						   .aClass5_Sub15_10114),
						  class596, i_131_, i_132_,
						  i_133_, i_134_, i_135_,
						  aBool5023, i, i_143_,
						  bool_138_);
		if (class645_sub1_sub3_sub2.method386(1393496804))
		    class645_sub1_sub3_sub2.method388(class173, 1850521889);
		if (class645_sub1_sub3_sub2_145_.method386(-1718325763))
		    class645_sub1_sub3_sub2_145_.method388(class173,
							   1729170435);
		class645_sub1_sub3 = class645_sub1_sub3_sub2;
		class645_sub1_sub3_144_ = class645_sub1_sub3_sub2_145_;
	    } else {
		class645_sub1_sub3
		    = new Class645_Sub1_Sub3_Sub1(aClass538_5011, class173,
						  (((Class458_Sub1) this)
						   .aClass5_Sub15_10114),
						  class596, i_131_, i_132_,
						  i_133_, i_134_, i_135_,
						  aBool5023, i, i_128_ + 4,
						  i_129_, i_130_);
		class645_sub1_sub3_144_
		    = new Class645_Sub1_Sub3_Sub1(aClass538_5011, class173,
						  (((Class458_Sub1) this)
						   .aClass5_Sub15_10114),
						  class596, i_131_, i_132_,
						  i_133_, i_134_, i_135_,
						  aBool5023, i, i_143_, i_129_,
						  i_130_);
	    }
	    aClass538_5011.method6586(i_131_, i_136_, i_137_,
				      class645_sub1_sub3,
				      class645_sub1_sub3_144_, -83292513);
	    if ((-1830612759 * class596.anInt7789 == 1
		 || aBool10113 && -1 == class596.anInt7789 * -1830612759)
		&& !aBool5023) {
		if (i_128_ == 0) {
		    aClass538_5011.aClass559_7156.method6793
			(1, i_131_, i_136_, i_137_,
			 class596.anInt7837 * -195683637,
			 class596.anInt7791 * -1611621153);
		    aClass538_5011.aClass559_7156.method6793
			(2, i_131_, i_136_, 1 + i_137_,
			 -195683637 * class596.anInt7837,
			 -1611621153 * class596.anInt7791);
		} else if (i_128_ == 1) {
		    aClass538_5011.aClass559_7156.method6793
			(1, i_131_, i_136_ + 1, i_137_,
			 -195683637 * class596.anInt7837,
			 class596.anInt7791 * -1611621153);
		    aClass538_5011.aClass559_7156.method6793
			(2, i_131_, i_136_, 1 + i_137_,
			 class596.anInt7837 * -195683637,
			 -1611621153 * class596.anInt7791);
		} else if (2 == i_128_) {
		    aClass538_5011.aClass559_7156.method6793
			(1, i_131_, 1 + i_136_, i_137_,
			 -195683637 * class596.anInt7837,
			 class596.anInt7791 * -1611621153);
		    aClass538_5011.aClass559_7156.method6793
			(2, i_131_, i_136_, i_137_,
			 -195683637 * class596.anInt7837,
			 class596.anInt7791 * -1611621153);
		} else if (3 == i_128_) {
		    aClass538_5011.aClass559_7156.method6793
			(1, i_131_, i_136_, i_137_,
			 class596.anInt7837 * -195683637,
			 -1611621153 * class596.anInt7791);
		    aClass538_5011.aClass559_7156.method6793
			(2, i_131_, i_136_, i_137_,
			 -195683637 * class596.anInt7837,
			 class596.anInt7791 * -1611621153);
		}
	    }
	    if (class596.anInt7817 * -1353373471 != 64)
		aClass538_5011.method6546(i_131_, i_136_, i_137_,
					  -1353373471 * class596.anInt7817,
					  (short) 330);
	    return true;
	}
	if (Class605.aClass605_7911.anInt7905 * 1922173025 == i) {
	    Class645_Sub1_Sub3 class645_sub1_sub3;
	    if (bool) {
		Class645_Sub1_Sub3_Sub2 class645_sub1_sub3_sub2
		    = new Class645_Sub1_Sub3_Sub2(aClass538_5011, class173,
						  (((Class458_Sub1) this)
						   .aClass5_Sub15_10114),
						  class596, i_131_, i_132_,
						  i_133_, i_134_, i_135_,
						  aBool5023, i, i_128_,
						  bool_138_);
		if (class645_sub1_sub3_sub2.method386(-469992065))
		    class645_sub1_sub3_sub2.method388(class173, 1606452474);
		class645_sub1_sub3 = class645_sub1_sub3_sub2;
	    } else
		class645_sub1_sub3
		    = new Class645_Sub1_Sub3_Sub1(aClass538_5011, class173,
						  (((Class458_Sub1) this)
						   .aClass5_Sub15_10114),
						  class596, i_131_, i_132_,
						  i_133_, i_134_, i_135_,
						  aBool5023, i, i_128_, i_129_,
						  i_130_);
	    aClass538_5011.method6586(i_131_, i_136_, i_137_,
				      class645_sub1_sub3, null, 952166580);
	    if (class596.aBool7797 && aBool5062) {
		if (0 == i_128_)
		    class137.method1651(i_136_, 1 + i_137_, 50);
		else if (i_128_ == 1)
		    class137.method1651(i_136_ + 1, i_137_ + 1, 50);
		else if (2 == i_128_)
		    class137.method1651(i_136_ + 1, i_137_, 50);
		else if (3 == i_128_)
		    class137.method1651(i_136_, i_137_, 50);
	    }
	    return true;
	}
	if (1922173025 * Class605.aClass605_7909.anInt7905 == i) {
	    Class645_Sub1_Sub5 class645_sub1_sub5;
	    if (bool) {
		Class645_Sub1_Sub5_Sub3 class645_sub1_sub5_sub3
		    = new Class645_Sub1_Sub5_Sub3(aClass538_5011, class173,
						  (((Class458_Sub1) this)
						   .aClass5_Sub15_10114),
						  class596, i_131_, i_132_,
						  i_133_, i_134_, i_135_,
						  aBool5023, i_136_, i_136_,
						  i_137_, i_137_, i, i_128_,
						  bool_138_, true);
		if (class645_sub1_sub5_sub3.method386(340591747))
		    class645_sub1_sub5_sub3.method388(class173, 1288361275);
		class645_sub1_sub5 = class645_sub1_sub5_sub3;
	    } else
		class645_sub1_sub5
		    = new Class645_Sub1_Sub5_Sub2(aClass538_5011, class173,
						  (((Class458_Sub1) this)
						   .aClass5_Sub15_10114),
						  class596, i_131_, i_132_,
						  i_133_, i_134_, i_135_,
						  aBool5023, i_136_,
						  i_139_ + i_136_ - 1, i_137_,
						  i_140_ + i_137_ - 1, i,
						  i_128_, i_129_, i_130_,
						  true);
	    aClass538_5011.method6545(class645_sub1_sub5, false, 1892522546);
	    if (-1830612759 * class596.anInt7789 == 1 && !aBool5023) {
		int i_146_;
		if ((i_128_ & 0x1) == 0)
		    i_146_ = 8;
		else
		    i_146_ = 16;
		aClass538_5011.aClass559_7156.method6793
		    (i_146_, i_131_, i_136_, i_137_,
		     -195683637 * class596.anInt7837, 0);
	    }
	    if (64 != class596.anInt7817 * -1353373471)
		aClass538_5011.method6546(i_131_, i_136_, i_137_,
					  class596.anInt7817 * -1353373471,
					  (short) 330);
	    return true;
	}
	return false;
    }
    
    public Class458_Sub1(Class538 class538, Class5_Sub15 class5_sub15, int i,
			 int i_147_, int i_148_, boolean bool,
			 Class466 class466, Class627 class627) {
	super(class538, i, i_147_, i_148_, bool, Class160.aClass5_Sub11_1805,
	      Class224.aClass5_Sub18_2330, class466);
	((Class458_Sub1) this).aClass5_Sub15_10114 = class5_sub15;
	((Class458_Sub1) this).aClass627_10103 = class627;
    }
    
    void method9154(Class173 class173, int i, int i_149_, int i_150_,
		    int i_151_, byte i_152_) {
	Interface60 interface60
	    = method9155(i, i_149_, i_150_, i_151_, (short) 18895);
	if (null != interface60) {
	    Class596 class596
		= ((Class596)
		   (((Class458_Sub1) this).aClass5_Sub15_10114.method63
		    (interface60.method397((short) 15443), 1552150914)));
	    int i_153_ = interface60.method168(489071264);
	    int i_154_ = interface60.method384(905768587);
	    if (class596.method7105(-450022163))
		Class496.method6056(i, i_150_, i_151_, class596, -532637456);
	    if (interface60.method386(-905272315))
		interface60.method389(class173, (byte) 86);
	    if (0 == i_149_) {
		aClass538_5011.method6593(i, i_150_, i_151_, 1943878744);
		aClass538_5011.method6585(i, i_150_, i_151_, (byte) 4);
		if (1 == class596.anInt7789 * -1830612759) {
		    if (i_154_ == 0)
			aClass538_5011.aClass559_7156.method6791(1, i, i_150_,
								 i_151_);
		    else if (1 == i_154_)
			aClass538_5011.aClass559_7156.method6791(2, i, i_150_,
								 i_151_ + 1);
		    else if (i_154_ == 2)
			aClass538_5011.aClass559_7156
			    .method6791(1, i, i_150_ + 1, i_151_);
		    else if (3 == i_154_)
			aClass538_5011.aClass559_7156.method6791(2, i, i_150_,
								 i_151_);
		}
	    } else if (1 == i_149_) {
		aClass538_5011.method6549(i, i_150_, i_151_, (byte) -43);
		aClass538_5011.method6590(i, i_150_, i_151_, 1250138390);
	    } else if (2 == i_149_) {
		aClass538_5011.method6556(i, i_150_, i_151_,
					  client.anInterface62_11170,
					  -1972410896);
		if (i_153_ == 1922173025 * Class605.aClass605_7909.anInt7905) {
		    if (0 == (i_154_ & 0x1))
			aClass538_5011.aClass559_7156.method6791(8, i, i_150_,
								 i_151_);
		    else
			aClass538_5011.aClass559_7156.method6791(16, i, i_150_,
								 i_151_);
		}
	    } else if (3 == i_149_)
		aClass538_5011.method6592(i, i_150_, i_151_, (byte) -122);
	}
    }
    
    Interface60 method9155(int i, int i_155_, int i_156_, int i_157_,
			   short i_158_) {
	Interface60 interface60 = null;
	if (i_155_ == 0)
	    interface60
		= (Interface60) aClass538_5011.method6600(i, i_156_, i_157_,
							  (byte) -128);
	if (i_155_ == 1)
	    interface60
		= (Interface60) aClass538_5011.method6555(i, i_156_, i_157_,
							  -881923819);
	if (2 == i_155_)
	    interface60
		= ((Interface60)
		   aClass538_5011.method6583(i, i_156_, i_157_,
					     client.anInterface62_11170,
					     1996351321));
	if (i_155_ == 3)
	    interface60
		= (Interface60) aClass538_5011.method6591(i, i_156_, i_157_,
							  -556442327);
	return interface60;
    }
    
    static {
	anIntArray10108 = new int[] { 1, 0, -1, 0 };
	anIntArray10109 = new int[] { 0, -1, 0, 1 };
	anIntArray10102 = new int[] { 1, -1, -1, 1 };
	anIntArray10111 = new int[] { -1, -1, 1, 1 };
    }
    
    boolean method9156(Class173 class173, int i, int i_159_, boolean bool,
		       Class596 class596, int i_160_, int i_161_, int i_162_,
		       int i_163_, int i_164_, int i_165_, int i_166_,
		       int i_167_, int i_168_, byte i_169_) {
	if (i == Class605.aClass605_7896.anInt7905 * 1922173025) {
	    Class645_Sub1_Sub1 class645_sub1_sub1;
	    if (bool) {
		Class645_Sub1_Sub1_Sub2 class645_sub1_sub1_sub2
		    = new Class645_Sub1_Sub1_Sub2(aClass538_5011, class173,
						  (((Class458_Sub1) this)
						   .aClass5_Sub15_10114),
						  class596, i_162_, i_163_,
						  i_164_, i_165_, i_166_,
						  aBool5023, 0, 0, i, i_159_);
		if (class645_sub1_sub1_sub2.method386(-2028623037))
		    class645_sub1_sub1_sub2.method388(class173, -10095615);
		class645_sub1_sub1 = class645_sub1_sub1_sub2;
	    } else
		class645_sub1_sub1
		    = new Class645_Sub1_Sub1_Sub1(aClass538_5011, class173,
						  (((Class458_Sub1) this)
						   .aClass5_Sub15_10114),
						  class596, i_162_, i_163_,
						  i_164_, i_165_, i_166_,
						  aBool5023, 0, 0, i, i_159_,
						  i_160_, i_161_);
	    aClass538_5011.method6598(i_162_, i_167_, i_168_,
				      class645_sub1_sub1, null, -1940392702);
	    return true;
	}
	if (1922173025 * Class605.aClass605_7897.anInt7905 == i) {
	    int i_170_ = 65;
	    Interface60 interface60
		= (Interface60) aClass538_5011.method6600(i_162_, i_167_,
							  i_168_, (byte) -118);
	    if (interface60 != null)
		i_170_ = ((Class596)
			  (((Class458_Sub1) this).aClass5_Sub15_10114.method63
			   (interface60.method397((short) -25611),
			    1133425715))).anInt7817 * -1353373471 + 1;
	    Class645_Sub1_Sub1 class645_sub1_sub1;
	    if (bool) {
		Class645_Sub1_Sub1_Sub2 class645_sub1_sub1_sub2
		    = (new Class645_Sub1_Sub1_Sub2
		       (aClass538_5011, class173,
			((Class458_Sub1) this).aClass5_Sub15_10114, class596,
			i_162_, i_163_, i_164_, i_165_, i_166_, aBool5023,
			anIntArray10108[i_159_] * i_170_,
			anIntArray10109[i_159_] * i_170_, i, i_159_));
		if (class645_sub1_sub1_sub2.method386(-269577414))
		    class645_sub1_sub1_sub2.method388(class173, 233126419);
		class645_sub1_sub1 = class645_sub1_sub1_sub2;
	    } else
		class645_sub1_sub1
		    = (new Class645_Sub1_Sub1_Sub1
		       (aClass538_5011, class173,
			((Class458_Sub1) this).aClass5_Sub15_10114, class596,
			i_162_, i_163_, i_164_, i_165_, i_166_, aBool5023,
			i_170_ * anIntArray10108[i_159_],
			i_170_ * anIntArray10109[i_159_], i, i_159_, i_160_,
			i_161_));
	    aClass538_5011.method6598(i_162_, i_167_, i_168_,
				      class645_sub1_sub1, null, 665599217);
	    return true;
	}
	if (i == Class605.aClass605_7895.anInt7905 * 1922173025) {
	    int i_171_ = 33;
	    Interface60 interface60
		= (Interface60) aClass538_5011.method6600(i_162_, i_167_,
							  i_168_, (byte) -64);
	    if (null != interface60)
		i_171_ = ((Class596)
			  (((Class458_Sub1) this).aClass5_Sub15_10114.method63
			   (interface60.method397((short) -15887),
			    800858489))).anInt7817 * -1353373471 / 2 + 1;
	    Class645_Sub1_Sub1 class645_sub1_sub1;
	    if (bool) {
		Class645_Sub1_Sub1_Sub2 class645_sub1_sub1_sub2
		    = (new Class645_Sub1_Sub1_Sub2
		       (aClass538_5011, class173,
			((Class458_Sub1) this).aClass5_Sub15_10114, class596,
			i_162_, i_163_, i_164_, i_165_, i_166_, aBool5023,
			i_171_ * anIntArray10108[i_159_],
			i_171_ * anIntArray10109[i_159_], i, 4 + i_159_));
		if (class645_sub1_sub1_sub2.method386(362542424))
		    class645_sub1_sub1_sub2.method388(class173, 47637654);
		class645_sub1_sub1 = class645_sub1_sub1_sub2;
	    } else
		class645_sub1_sub1
		    = (new Class645_Sub1_Sub1_Sub1
		       (aClass538_5011, class173,
			((Class458_Sub1) this).aClass5_Sub15_10114, class596,
			i_162_, i_163_, i_164_, i_165_, i_166_, aBool5023,
			i_171_ * anIntArray10102[i_159_],
			i_171_ * anIntArray10111[i_159_], i, 4 + i_159_,
			i_160_, i_161_));
	    aClass538_5011.method6598(i_162_, i_167_, i_168_,
				      class645_sub1_sub1, null, -1591316746);
	    return true;
	}
	if (i == 1922173025 * Class605.aClass605_7899.anInt7905) {
	    int i_172_ = i_159_ + 2 & 0x3;
	    Class645_Sub1_Sub1 class645_sub1_sub1;
	    if (bool) {
		Class645_Sub1_Sub1_Sub2 class645_sub1_sub1_sub2
		    = new Class645_Sub1_Sub1_Sub2(aClass538_5011, class173,
						  (((Class458_Sub1) this)
						   .aClass5_Sub15_10114),
						  class596, i_162_, i_163_,
						  i_164_, i_165_, i_166_,
						  aBool5023, 0, 0, i,
						  i_172_ + 4);
		if (class645_sub1_sub1_sub2.method386(-657960701))
		    class645_sub1_sub1_sub2.method388(class173, 1500447077);
		class645_sub1_sub1 = class645_sub1_sub1_sub2;
	    } else
		class645_sub1_sub1
		    = new Class645_Sub1_Sub1_Sub1(aClass538_5011, class173,
						  (((Class458_Sub1) this)
						   .aClass5_Sub15_10114),
						  class596, i_162_, i_163_,
						  i_164_, i_165_, i_166_,
						  aBool5023, 0, 0, i,
						  4 + i_172_, i_160_, i_161_);
	    aClass538_5011.method6598(i_162_, i_167_, i_168_,
				      class645_sub1_sub1, null, 47853361);
	    return true;
	}
	if (Class605.aClass605_7900.anInt7905 * 1922173025 == i) {
	    int i_173_ = 2 + i_159_ & 0x3;
	    int i_174_ = 33;
	    Interface60 interface60
		= (Interface60) aClass538_5011.method6600(i_162_, i_167_,
							  i_168_, (byte) -95);
	    if (interface60 != null)
		i_174_ = ((Class596)
			  (((Class458_Sub1) this).aClass5_Sub15_10114.method63
			   (interface60.method397((short) -14454),
			    1467694357))).anInt7817 * -1353373471 / 2 + 1;
	    Class645_Sub1_Sub1 class645_sub1_sub1;
	    Class645_Sub1_Sub1 class645_sub1_sub1_175_;
	    if (bool) {
		Class645_Sub1_Sub1_Sub2 class645_sub1_sub1_sub2
		    = (new Class645_Sub1_Sub1_Sub2
		       (aClass538_5011, class173,
			((Class458_Sub1) this).aClass5_Sub15_10114, class596,
			i_162_, i_163_, i_164_, i_165_, i_166_, aBool5023,
			i_174_ * anIntArray10102[i_159_],
			i_174_ * anIntArray10111[i_159_], i, i_159_ + 4));
		Class645_Sub1_Sub1_Sub2 class645_sub1_sub1_sub2_176_
		    = new Class645_Sub1_Sub1_Sub2(aClass538_5011, class173,
						  (((Class458_Sub1) this)
						   .aClass5_Sub15_10114),
						  class596, i_162_, i_163_,
						  i_164_, i_165_, i_166_,
						  aBool5023, 0, 0, i,
						  i_173_ + 4);
		if (class645_sub1_sub1_sub2.method386(-844651654))
		    class645_sub1_sub1_sub2.method388(class173, 1369635788);
		if (class645_sub1_sub1_sub2_176_.method386(-1492977607))
		    class645_sub1_sub1_sub2_176_.method388(class173,
							   1936713480);
		class645_sub1_sub1 = class645_sub1_sub1_sub2;
		class645_sub1_sub1_175_ = class645_sub1_sub1_sub2_176_;
	    } else {
		Class645_Sub1_Sub1_Sub1 class645_sub1_sub1_sub1
		    = (new Class645_Sub1_Sub1_Sub1
		       (aClass538_5011, class173,
			((Class458_Sub1) this).aClass5_Sub15_10114, class596,
			i_162_, i_163_, i_164_, i_165_, i_166_, aBool5023,
			i_174_ * anIntArray10102[i_159_],
			i_174_ * anIntArray10111[i_159_], i, 4 + i_159_,
			i_160_, i_161_));
		Class645_Sub1_Sub1_Sub1 class645_sub1_sub1_sub1_177_
		    = new Class645_Sub1_Sub1_Sub1(aClass538_5011, class173,
						  (((Class458_Sub1) this)
						   .aClass5_Sub15_10114),
						  class596, i_162_, i_163_,
						  i_164_, i_165_, i_166_,
						  aBool5023, 0, 0, i,
						  i_173_ + 4, i_160_, i_161_);
		class645_sub1_sub1 = class645_sub1_sub1_sub1;
		class645_sub1_sub1_175_ = class645_sub1_sub1_sub1_177_;
	    }
	    aClass538_5011.method6598(i_162_, i_167_, i_168_,
				      class645_sub1_sub1,
				      class645_sub1_sub1_175_, -812526748);
	    return true;
	}
	return false;
    }
    
    public final void method9157(Class173 class173, byte[] is, int i,
				 int i_178_, short i_179_) {
	ByteBuffer class528_sub42 = new ByteBuffer(is);
	int i_180_ = -1;
	for (;;) {
	    int i_181_ = class528_sub42.method9643(1253501506);
	    if (i_181_ == 0)
		break;
	    i_180_ += i_181_;
	    int i_182_ = 0;
	    for (;;) {
		int i_183_ = class528_sub42.method9719(65280);
		if (0 == i_183_)
		    break;
		i_182_ += i_183_ - 1;
		int i_184_ = i_182_ & 0x3f;
		int i_185_ = i_182_ >> 6 & 0x3f;
		int i_186_ = i_182_ >> 12;
		int i_187_ = class528_sub42.readUnsignedByte((byte) 101);
		int i_188_ = i_187_ >> 2;
		int i_189_ = i_187_ & 0x3;
		int i_190_ = i + i_185_;
		int i_191_ = i_184_ + i_178_;
		Class596 class596
		    = (Class596) ((Class458_Sub1) this).aClass5_Sub15_10114
				     .method63(i_180_, -1277418722);
		int i_192_;
		int i_193_;
		if (0 == (i_189_ & 0x1)) {
		    i_192_ = class596.anInt7812 * -267660407;
		    i_193_ = class596.anInt7843 * 423043053;
		} else {
		    i_192_ = 423043053 * class596.anInt7843;
		    i_193_ = -267660407 * class596.anInt7812;
		}
		int i_194_ = i_190_ + i_192_;
		int i_195_ = i_193_ + i_191_;
		if (i_190_ < -2112239803 * anInt5019
		    && i_191_ < -828725691 * anInt5059 && i_194_ > 0
		    && i_195_ > 0
		    && ((1922173025 * Class605.aClass605_7893.anInt7905
			 == i_188_)
			|| (Class605.aClass605_7912.anInt7905 * 1922173025
			    == i_188_)
			|| (i_190_ > 0 && i_191_ > 0
			    && i_190_ < anInt5019 * -2112239803 - 1
			    && i_191_ < anInt5059 * -828725691 - 1)))
		    method9152(class173, i_186_, i_186_, i_190_, i_191_,
			       i_180_, i_189_, i_188_, -1, 0, (byte) 0);
	    }
	}
    }
    
    static final void method9158(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_196_ = (((Class648) class648).anIntArray8394
		      [((Class648) class648).anInt8395 * 717927929]);
	int i_197_ = (((Class648) class648).anIntArray8394
		      [1 + 717927929 * ((Class648) class648).anInt8395]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class269.method3683(i_196_, i_197_, false, (short) -25372);
    }
}
