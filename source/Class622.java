/* Class622 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class622
{
    public int anInt8070;
    public int anInt8071 = -275933812;
    public int[] anIntArray8072 = null;
    public int anInt8073;
    static final int anInt8074 = 4;
    public int anInt8075;
    static final int anInt8076 = 4;
    public int anInt8077;
    static final int anInt8078 = 7;
    public int anInt8079;
    public short[][] aShortArrayArray8080;
    public int anInt8081;
    public int anInt8082;
    public boolean aBool8083;
    public int anInt8084;
    public int anInt8085;
    public int anInt8086;
    public int[] anIntArray8087 = null;
    public short[][][] aShortArrayArrayArray8088;
    public short[][] aShortArrayArray8089;
    public short[][][] aShortArrayArrayArray8090;
    public boolean aBool8091;
    public short aShort8092;
    public boolean aBool8093;
    public byte aByte8094;
    public int anInt8095;
    public int anInt8096;
    public boolean aBool8097;
    public int anInt8098;
    public int anInt8099;
    public int anInt8100;
    public int anInt8101;
    public int anInt8102;
    static final int anInt8103 = 4;
    public int anInt8104;
    public int anInt8105;
    public int anInt8106;
    public int anInt8107;
    public int anInt8108;
    public int anInt8109;
    public int anInt8110;
    public int anInt8111;
    public int anInt8112;
    public int anInt8113;
    public int anInt8114;
    public int anInt8115;
    public static int anInt8116;
    
    void method7416(ByteBuffer class528_sub42, int i) {
	boolean bool = false;
	for (;;) {
	    int i_0_ = class528_sub42.readUnsignedByte((byte) 35);
	    if (i_0_ == 0)
		break;
	    if (i_0_ == 1) {
		if (null == anIntArray8072) {
		    anInt8071 = -275933812;
		    anIntArray8072 = new int[4];
		    anIntArray8087 = new int[4];
		}
		for (int i_1_ = 0; i_1_ < anIntArray8072.length; i_1_++) {
		    anIntArray8072[i_1_]
			= class528_sub42.method9642(-355117828);
		    anIntArray8087[i_1_]
			= class528_sub42.method9642(1826285693);
		}
		bool = true;
	    } else if (2 == i_0_)
		anInt8101
		    = class528_sub42.method9645((short) -22513) * 1470535195;
	    else if (3 == i_0_) {
		anInt8071 = class528_sub42.readUnsignedByte((byte) 20) * -1142725277;
		anIntArray8072 = new int[-55491509 * anInt8071];
		anIntArray8087 = new int[-55491509 * anInt8071];
	    } else if (4 == i_0_)
		aBool8083 = false;
	    else if (5 == i_0_)
		anInt8082 = class528_sub42.readTriByte(-144857184) * 675504049;
	    else if (6 == i_0_)
		anInt8107
		    = class528_sub42.readTriByte(1529299164) * -1733835401;
	    else if (7 == i_0_) {
		aShortArrayArray8080 = new short[10][4];
		aShortArrayArrayArray8088 = new short[10][4][];
		for (int i_2_ = 0; i_2_ < 10; i_2_++) {
		    for (int i_3_ = 0; i_3_ < 4; i_3_++) {
			int i_4_ = class528_sub42.readUnsignedShort(-1335581726);
			if (i_4_ == 65535)
			    i_4_ = -1;
			aShortArrayArray8080[i_2_][i_3_] = (short) i_4_;
			int i_5_ = class528_sub42.readUnsignedShort(-2121068219);
			aShortArrayArrayArray8088[i_2_][i_3_]
			    = new short[i_5_];
			for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
			    int i_7_ = class528_sub42.readUnsignedShort(-1192881486);
			    if (i_7_ == 65535)
				i_7_ = -1;
			    aShortArrayArrayArray8088[i_2_][i_3_][i_6_]
				= (short) i_7_;
			}
		    }
		}
	    } else if (8 == i_0_)
		aBool8091 = false;
	    else if (i_0_ == 9)
		anInt8104 = class528_sub42.readUnsignedByte((byte) 14) * 502990093;
	    else if (10 == i_0_)
		aBool8093 = false;
	    else if (i_0_ == 11)
		anInt8111 = class528_sub42.readUnsignedByte((byte) 42) * 1400105733;
	    else if (i_0_ == 12) {
		anInt8095 = class528_sub42.readUnsignedShort(350823053) * -1581845225;
		anInt8099
		    = class528_sub42.readUnsignedShort(-2110214567) * -1965573617;
	    } else if (i_0_ == 13)
		anInt8077 = class528_sub42.readUnsignedByte((byte) 25) * 721024195;
	    else if (i_0_ == 14)
		anInt8075 = class528_sub42.readUnsignedByte((byte) 15) * 450172899;
	    else if (15 == i_0_)
		anInt8079 = class528_sub42.readUnsignedByte((byte) 9) * -454471173;
	    else if (16 == i_0_)
		aBool8097 = true;
	    else if (17 == i_0_)
		anInt8098 = class528_sub42.readInt(-1974728744) * 747931125;
	    else if (i_0_ == 18)
		anInt8115 = class528_sub42.readInt(1190800292) * 1144630485;
	    else if (i_0_ == 19)
		anInt8100 = class528_sub42.readInt(-92389705) * 1725343897;
	    else if (i_0_ == 20) {
		aShort8092 = (short) class528_sub42.readUnsignedShort(-1375895725);
		aByte8094 = (byte) class528_sub42.readUnsignedByte((byte) 69);
	    } else if (21 == i_0_)
		anInt8086 = class528_sub42.readUnsignedByte((byte) 35) * 1985103781;
	    else if (22 == i_0_) {
		anInt8081
		    = class528_sub42.method9645((short) -9849) * -1253211073;
		anInt8102
		    = class528_sub42.method9645((short) -1560) * -1085136601;
		anInt8114
		    = class528_sub42.method9645((short) -13129) * -1079077035;
		anInt8070
		    = class528_sub42.method9645((short) 12908) * 1515020251;
		anInt8105
		    = class528_sub42.method9645((short) -6414) * 1319678143;
		anInt8106
		    = class528_sub42.method9645((short) -4940) * 1124762661;
		anInt8084
		    = class528_sub42.method9627(-1843570260) * -1972191099;
		anInt8108 = class528_sub42.method9627(-2136490223) * 860614171;
		anInt8109
		    = class528_sub42.method9645((short) 309) * -1329830375;
		anInt8110
		    = class528_sub42.method9645((short) 12159) * 2118517265;
		anInt8073
		    = class528_sub42.method9645((short) 4789) * -1862560097;
		anInt8112
		    = class528_sub42.method9645((short) -3358) * 1047986815;
		anInt8113
		    = class528_sub42.method9645((short) -20749) * -839392413;
		anInt8096
		    = class528_sub42.method9645((short) -191) * -368565201;
		anInt8085
		    = class528_sub42.method9645((short) 26945) * 1642407081;
	    } else if (i_0_ == 23) {
		aShortArrayArray8089 = new short[10][4];
		aShortArrayArrayArray8090 = new short[10][4][];
		for (int i_8_ = 0; i_8_ < 10; i_8_++) {
		    for (int i_9_ = 0; i_9_ < 4; i_9_++) {
			int i_10_ = class528_sub42.readUnsignedShort(-221497294);
			if (65535 == i_10_)
			    i_10_ = -1;
			aShortArrayArray8089[i_8_][i_9_] = (short) i_10_;
			int i_11_ = class528_sub42.readUnsignedShort(-1257339664);
			aShortArrayArrayArray8090[i_8_][i_9_]
			    = new short[i_11_];
			for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
			    int i_13_ = class528_sub42.readUnsignedShort(-213965828);
			    if (65535 == i_13_)
				i_13_ = -1;
			    aShortArrayArrayArray8090[i_8_][i_9_][i_12_]
				= (short) i_13_;
			}
		    }
		}
	    }
	}
	if (!bool) {
	    if (null == anIntArray8072) {
		anInt8071 = -275933812;
		anIntArray8072 = new int[4];
		anIntArray8087 = new int[4];
	    }
	    for (int i_14_ = 0; i_14_ < anIntArray8072.length; i_14_++) {
		anIntArray8072[i_14_] = 0;
		anIntArray8087[i_14_] = 20 * i_14_;
	    }
	}
    }
    
    void method7417(ByteBuffer class528_sub42) {
	boolean bool = false;
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 23);
	    if (i == 0)
		break;
	    if (i == 1) {
		if (null == anIntArray8072) {
		    anInt8071 = -275933812;
		    anIntArray8072 = new int[4];
		    anIntArray8087 = new int[4];
		}
		for (int i_15_ = 0; i_15_ < anIntArray8072.length; i_15_++) {
		    anIntArray8072[i_15_]
			= class528_sub42.method9642(742943462);
		    anIntArray8087[i_15_]
			= class528_sub42.method9642(1941328652);
		}
		bool = true;
	    } else if (2 == i)
		anInt8101
		    = class528_sub42.method9645((short) 3423) * 1470535195;
	    else if (3 == i) {
		anInt8071 = class528_sub42.readUnsignedByte((byte) 63) * -1142725277;
		anIntArray8072 = new int[-55491509 * anInt8071];
		anIntArray8087 = new int[-55491509 * anInt8071];
	    } else if (4 == i)
		aBool8083 = false;
	    else if (5 == i)
		anInt8082 = class528_sub42.readTriByte(1689101871) * 675504049;
	    else if (6 == i)
		anInt8107
		    = class528_sub42.readTriByte(-1086367474) * -1733835401;
	    else if (7 == i) {
		aShortArrayArray8080 = new short[10][4];
		aShortArrayArrayArray8088 = new short[10][4][];
		for (int i_16_ = 0; i_16_ < 10; i_16_++) {
		    for (int i_17_ = 0; i_17_ < 4; i_17_++) {
			int i_18_ = class528_sub42.readUnsignedShort(-344316710);
			if (i_18_ == 65535)
			    i_18_ = -1;
			aShortArrayArray8080[i_16_][i_17_] = (short) i_18_;
			int i_19_ = class528_sub42.readUnsignedShort(-1534001787);
			aShortArrayArrayArray8088[i_16_][i_17_]
			    = new short[i_19_];
			for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
			    int i_21_ = class528_sub42.readUnsignedShort(-330973791);
			    if (i_21_ == 65535)
				i_21_ = -1;
			    aShortArrayArrayArray8088[i_16_][i_17_][i_20_]
				= (short) i_21_;
			}
		    }
		}
	    } else if (8 == i)
		aBool8091 = false;
	    else if (i == 9)
		anInt8104 = class528_sub42.readUnsignedByte((byte) 59) * 502990093;
	    else if (10 == i)
		aBool8093 = false;
	    else if (i == 11)
		anInt8111 = class528_sub42.readUnsignedByte((byte) 114) * 1400105733;
	    else if (i == 12) {
		anInt8095
		    = class528_sub42.readUnsignedShort(-1849895383) * -1581845225;
		anInt8099
		    = class528_sub42.readUnsignedShort(-966145889) * -1965573617;
	    } else if (i == 13)
		anInt8077 = class528_sub42.readUnsignedByte((byte) 23) * 721024195;
	    else if (i == 14)
		anInt8075 = class528_sub42.readUnsignedByte((byte) 37) * 450172899;
	    else if (15 == i)
		anInt8079 = class528_sub42.readUnsignedByte((byte) 124) * -454471173;
	    else if (16 == i)
		aBool8097 = true;
	    else if (17 == i)
		anInt8098 = class528_sub42.readInt(1118078587) * 747931125;
	    else if (i == 18)
		anInt8115 = class528_sub42.readInt(-318792971) * 1144630485;
	    else if (i == 19)
		anInt8100 = class528_sub42.readInt(-372636669) * 1725343897;
	    else if (i == 20) {
		aShort8092 = (short) class528_sub42.readUnsignedShort(-777775037);
		aByte8094 = (byte) class528_sub42.readUnsignedByte((byte) 15);
	    } else if (21 == i)
		anInt8086 = class528_sub42.readUnsignedByte((byte) 92) * 1985103781;
	    else if (22 == i) {
		anInt8081
		    = class528_sub42.method9645((short) -19749) * -1253211073;
		anInt8102
		    = class528_sub42.method9645((short) -3681) * -1085136601;
		anInt8114
		    = class528_sub42.method9645((short) -14085) * -1079077035;
		anInt8070
		    = class528_sub42.method9645((short) 15909) * 1515020251;
		anInt8105
		    = class528_sub42.method9645((short) -7919) * 1319678143;
		anInt8106
		    = class528_sub42.method9645((short) -12912) * 1124762661;
		anInt8084
		    = class528_sub42.method9627(-1964154792) * -1972191099;
		anInt8108 = class528_sub42.method9627(-1940574367) * 860614171;
		anInt8109
		    = class528_sub42.method9645((short) -25328) * -1329830375;
		anInt8110
		    = class528_sub42.method9645((short) 1771) * 2118517265;
		anInt8073
		    = class528_sub42.method9645((short) -3669) * -1862560097;
		anInt8112
		    = class528_sub42.method9645((short) 10569) * 1047986815;
		anInt8113
		    = class528_sub42.method9645((short) -10960) * -839392413;
		anInt8096
		    = class528_sub42.method9645((short) 7727) * -368565201;
		anInt8085
		    = class528_sub42.method9645((short) -6346) * 1642407081;
	    } else if (i == 23) {
		aShortArrayArray8089 = new short[10][4];
		aShortArrayArrayArray8090 = new short[10][4][];
		for (int i_22_ = 0; i_22_ < 10; i_22_++) {
		    for (int i_23_ = 0; i_23_ < 4; i_23_++) {
			int i_24_ = class528_sub42.readUnsignedShort(302523745);
			if (65535 == i_24_)
			    i_24_ = -1;
			aShortArrayArray8089[i_22_][i_23_] = (short) i_24_;
			int i_25_ = class528_sub42.readUnsignedShort(-1861583249);
			aShortArrayArrayArray8090[i_22_][i_23_]
			    = new short[i_25_];
			for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
			    int i_27_ = class528_sub42.readUnsignedShort(-573391354);
			    if (65535 == i_27_)
				i_27_ = -1;
			    aShortArrayArrayArray8090[i_22_][i_23_][i_26_]
				= (short) i_27_;
			}
		    }
		}
	    }
	}
	if (!bool) {
	    if (null == anIntArray8072) {
		anInt8071 = -275933812;
		anIntArray8072 = new int[4];
		anIntArray8087 = new int[4];
	    }
	    for (int i = 0; i < anIntArray8072.length; i++) {
		anIntArray8072[i] = 0;
		anIntArray8087[i] = 20 * i;
	    }
	}
    }
    
    public Class622(Class446 class446) {
	anInt8075 = 1800691596;
	anInt8077 = -1410870516;
	anInt8079 = 1113669085;
	anInt8101 = -1470535195;
	anInt8082 = -675504049;
	anInt8107 = 1733835401;
	aBool8083 = true;
	aShort8092 = (short) -1;
	aByte8094 = (byte) 0;
	anInt8086 = 941882484;
	aBool8091 = true;
	anInt8104 = 1005980186;
	aBool8093 = true;
	anInt8111 = -94650097;
	anInt8095 = 1581845225;
	anInt8099 = 1965573617;
	anInt8098 = 1618610944;
	anInt8115 = -1866050773;
	anInt8100 = 1027912576;
	anInt8081 = 1253211073;
	anInt8102 = 1085136601;
	anInt8114 = 1079077035;
	anInt8070 = -1515020251;
	anInt8105 = -1319678143;
	anInt8106 = -1124762661;
	anInt8109 = 1329830375;
	anInt8110 = -2118517265;
	anInt8073 = 1862560097;
	anInt8112 = -1047986815;
	anInt8113 = 839392413;
	anInt8096 = 368565201;
	anInt8085 = -1642407081;
	byte[] is = class446.method5395((Class606.aClass606_7919.anInt7921
					 * -2082684943),
					-1605809388);
	method7416(new ByteBuffer(is), 514476668);
    }
    
    static void method7418(int i) {
	if (Class649.anIntArray8420 == null) {
	    Class649.anIntArray8420 = new int[65536];
	    RuntimeException_Sub2.anIntArray11922 = new int[65536];
	    double d = 0.7 + (Math.random() * 0.03 - 0.015);
	    for (int i_28_ = 0; i_28_ < 65536; i_28_++) {
		double d_29_
		    = (double) (i_28_ >> 10 & 0x3f) / 64.0 + 0.0078125;
		double d_30_ = 0.0625 + (double) (i_28_ >> 7 & 0x7) / 8.0;
		double d_31_ = (double) (i_28_ & 0x7f) / 128.0;
		double d_32_ = d_31_;
		double d_33_ = d_31_;
		double d_34_ = d_31_;
		if (d_30_ != 0.0) {
		    double d_35_;
		    if (d_31_ < 0.5)
			d_35_ = (d_30_ + 1.0) * d_31_;
		    else
			d_35_ = d_30_ + d_31_ - d_30_ * d_31_;
		    double d_36_ = d_31_ * 2.0 - d_35_;
		    double d_37_ = d_29_ + 0.3333333333333333;
		    if (d_37_ > 1.0)
			d_37_--;
		    double d_38_ = d_29_;
		    double d_39_ = d_29_ - 0.3333333333333333;
		    if (d_39_ < 0.0)
			d_39_++;
		    if (6.0 * d_37_ < 1.0)
			d_32_ = (d_35_ - d_36_) * 6.0 * d_37_ + d_36_;
		    else if (2.0 * d_37_ < 1.0)
			d_32_ = d_35_;
		    else if (d_37_ * 3.0 < 2.0)
			d_32_ = d_36_ + ((d_35_ - d_36_)
					 * (0.6666666666666666 - d_37_) * 6.0);
		    else
			d_32_ = d_36_;
		    if (d_38_ * 6.0 < 1.0)
			d_33_ = 6.0 * (d_35_ - d_36_) * d_38_ + d_36_;
		    else if (d_38_ * 2.0 < 1.0)
			d_33_ = d_35_;
		    else if (3.0 * d_38_ < 2.0)
			d_33_ = ((0.6666666666666666 - d_38_) * (d_35_ - d_36_)
				 * 6.0) + d_36_;
		    else
			d_33_ = d_36_;
		    if (6.0 * d_39_ < 1.0)
			d_34_ = 6.0 * (d_35_ - d_36_) * d_39_ + d_36_;
		    else if (d_39_ * 2.0 < 1.0)
			d_34_ = d_35_;
		    else if (3.0 * d_39_ < 2.0)
			d_34_ = 6.0 * ((d_35_ - d_36_)
				       * (0.6666666666666666 - d_39_)) + d_36_;
		    else
			d_34_ = d_36_;
		}
		d_32_ = Math.pow(d_32_, d);
		d_33_ = Math.pow(d_33_, d);
		d_34_ = Math.pow(d_34_, d);
		int i_40_ = (int) (d_32_ * 256.0);
		int i_41_ = (int) (d_33_ * 256.0);
		int i_42_ = (int) (256.0 * d_34_);
		int i_43_ = i_42_ + ((i_40_ << 16) + (i_41_ << 8));
		Class649.anIntArray8420[i_28_] = i_43_ & 0xffffff;
		int i_44_ = i_40_ + ((i_42_ << 16) + (i_41_ << 8));
		RuntimeException_Sub2.anIntArray11922[i_28_] = i_44_;
	    }
	}
    }
    
    public static boolean method7419(int i, byte i_45_) {
	return 9 == i || 1 == i || 0 == i;
    }
    
    static final void method7420(int i) {
	Class216.method3066(Class587.aClass173_7714, 1818632035);
	if (-793614607 * client.anInt11096
	    != Class181_Sub5.anInt9778 * 1926870089)
	    Class541.method6620(1775693384);
    }
    
    static final void method7421(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class488.method5907(class229, class648, 2085204256);
    }
}
