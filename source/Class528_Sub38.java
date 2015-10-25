/* Class528_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class528_Sub38 extends Node
{
    public Class691_Sub33 aClass691_Sub33_10560;
    static final int anInt10561 = 23;
    public static final int anInt10562 = 245;
    public static final int anInt10563 = 500;
    Class673 aClass673_10564;
    public Class691_Sub8 aClass691_Sub8_10565;
    public Class691_Sub15 aClass691_Sub15_10566;
    public Class691_Sub27 aClass691_Sub27_10567;
    public Class691_Sub27 aClass691_Sub27_10568;
    Class691_Sub28 aClass691_Sub28_10569;
    public Class691_Sub14 aClass691_Sub14_10570;
    public Class691_Sub1 aClass691_Sub1_10571;
    public Class691_Sub10 aClass691_Sub10_10572;
    public Class691_Sub26 aClass691_Sub26_10573;
    public Class691_Sub6 aClass691_Sub6_10574;
    public Class691_Sub29 aClass691_Sub29_10575;
    public Class691_Sub16 aClass691_Sub16_10576;
    public Class691_Sub24 aClass691_Sub24_10577;
    public Class691_Sub4 aClass691_Sub4_10578;
    public Class691_Sub5 aClass691_Sub5_10579;
    public Class691_Sub2 aClass691_Sub2_10580;
    Class691_Sub20 aClass691_Sub20_10581;
    public Class691_Sub9 aClass691_Sub9_10582;
    public Class691_Sub21 aClass691_Sub21_10583;
    public Class691_Sub34 aClass691_Sub34_10584;
    public Class691_Sub17 aClass691_Sub17_10585;
    public Class691_Sub17 aClass691_Sub17_10586;
    public Class691_Sub13 aClass691_Sub13_10587;
    public Class691_Sub22 aClass691_Sub22_10588;
    public Class691_Sub7 aClass691_Sub7_10589;
    public Class691_Sub12 aClass691_Sub12_10590;
    public Class691_Sub34 aClass691_Sub34_10591;
    public Class691_Sub25 aClass691_Sub25_10592;
    public Class691_Sub3 aClass691_Sub3_10593;
    public Class691_Sub24 aClass691_Sub24_10594;
    public Class691_Sub3 aClass691_Sub3_10595;
    static final int anInt10596 = 34;
    public Class691_Sub35 aClass691_Sub35_10597;
    public Class691_Sub32 aClass691_Sub32_10598;
    public Class691_Sub18 aClass691_Sub18_10599;
    public Class691_Sub30 aClass691_Sub30_10600;
    public Class691_Sub19 aClass691_Sub19_10601;
    public Class691_Sub31 aClass691_Sub31_10602;
    public Class691_Sub11 aClass691_Sub11_10603;
    public Class691_Sub34 aClass691_Sub34_10604;
    Class686 aClass686_10605;
    public Class691_Sub23 aClass691_Sub23_10606;
    public Class691_Sub34 aClass691_Sub34_10607;
    public Class691_Sub34 aClass691_Sub34_10608;
    static final int anInt10609 = 44;
    
    public Class528_Sub38(ByteBuffer class528_sub42, Class673 class673,
			  int i) {
	((Class528_Sub38) this).aClass673_10564 = class673;
	((Class528_Sub38) this).aClass686_10605
	    = new Class686(Class509.anInt6957 * 1110656915,
			   -986761059 * Class509.anInt6958,
			   Class674.aString8539.indexOf("arm") != -1,
			   Class312.aString3440.startsWith("win"), false);
	aClass691_Sub24_10594 = new Class691_Sub24(i, this);
	method9553(class528_sub42, -621543790);
    }
    
    void method9553(ByteBuffer class528_sub42, int i) {
	if (null == class528_sub42 || class528_sub42.payload == null)
	    method9562(true, true, 1853004376);
	else {
	    int i_0_ = class528_sub42.readUnsignedByte((byte) 68);
	    if (i_0_ < 23) {
		try {
		    method9554(class528_sub42, i_0_, -1630047099);
		} catch (Exception exception) {
		    method9562(true, true, -1326491866);
		}
		method9562(false, true, 1088162248);
	    } else if (i_0_ > 34)
		method9562(true, true, 331560321);
	    else {
		if (i_0_ >= 29)
		    aClass691_Sub25_10592
			= new Class691_Sub25(class528_sub42
						 .readUnsignedByte((byte) 26),
					     this);
		aClass691_Sub27_10567
		    = new Class691_Sub27(class528_sub42.readUnsignedByte((byte) 39),
					 this);
		if (i_0_ >= 31)
		    ((Class528_Sub38) this).aClass691_Sub28_10569
			= new Class691_Sub28(class528_sub42
						 .readUnsignedByte((byte) 38),
					     this);
		aClass691_Sub27_10568
		    = new Class691_Sub27(aClass691_Sub27_10567
					     .method10040((byte) -40),
					 this);
		aClass691_Sub19_10601
		    = new Class691_Sub19(class528_sub42.readUnsignedByte((byte) 65),
					 this);
		aClass691_Sub1_10571
		    = new Class691_Sub1(class528_sub42.readUnsignedByte((byte) 26),
					this);
		aClass691_Sub10_10572
		    = new Class691_Sub10(class528_sub42.readUnsignedByte((byte) 88),
					 this);
		if (i_0_ >= 27)
		    aClass691_Sub6_10574
			= new Class691_Sub6(class528_sub42
						.readUnsignedByte((byte) 30),
					    this);
		aClass691_Sub11_10603
		    = new Class691_Sub11(class528_sub42.readUnsignedByte((byte) 44),
					 this);
		aClass691_Sub16_10576
		    = new Class691_Sub16(class528_sub42.readUnsignedByte((byte) 18),
					 this);
		aClass691_Sub23_10606
		    = new Class691_Sub23(class528_sub42.readUnsignedByte((byte) 85),
					 this);
		aClass691_Sub4_10578
		    = new Class691_Sub4(class528_sub42.readUnsignedByte((byte) 97),
					this);
		aClass691_Sub14_10570
		    = new Class691_Sub14(class528_sub42.readUnsignedByte((byte) 15),
					 this);
		aClass691_Sub2_10580
		    = new Class691_Sub2(class528_sub42.readUnsignedByte((byte) 33),
					this);
		aClass691_Sub8_10565
		    = new Class691_Sub8(class528_sub42.readUnsignedByte((byte) 107),
					this);
		if (i_0_ >= 33)
		    aClass691_Sub9_10582
			= new Class691_Sub9(class528_sub42
						.readUnsignedByte((byte) 52),
					    this);
		if (i_0_ >= 34)
		    class528_sub42.readUnsignedByte((byte) 5);
		if (i_0_ >= 24)
		    aClass691_Sub21_10583
			= new Class691_Sub21(class528_sub42
						 .readUnsignedByte((byte) 50),
					     this);
		aClass691_Sub5_10579
		    = new Class691_Sub5(class528_sub42.readUnsignedByte((byte) 19),
					this);
		aClass691_Sub17_10585
		    = new Class691_Sub17(class528_sub42.readUnsignedByte((byte) 84),
					 this);
		aClass691_Sub17_10586
		    = new Class691_Sub17(aClass691_Sub17_10585
					     .method9955(1903970875),
					 this);
		aClass691_Sub13_10587
		    = new Class691_Sub13(class528_sub42.readUnsignedByte((byte) 66),
					 this);
		if (i_0_ >= 25)
		    aClass691_Sub22_10588
			= new Class691_Sub22(class528_sub42
						 .readUnsignedByte((byte) 102),
					     this);
		aClass691_Sub7_10589
		    = new Class691_Sub7(class528_sub42.readUnsignedByte((byte) 97),
					this);
		if (i_0_ <= 25)
		    class528_sub42.pointer += 2015001547;
		aClass691_Sub12_10590
		    = new Class691_Sub12(class528_sub42.readUnsignedByte((byte) 56),
					 this);
		aClass691_Sub24_10577
		    = new Class691_Sub24(class528_sub42.readUnsignedByte((byte) 82),
					 this);
		aClass691_Sub24_10594
		    = new Class691_Sub24(aClass691_Sub24_10577
					     .method10014(-1824619963),
					 this);
		class528_sub42.readUnsignedByte((byte) 42);
		aClass691_Sub15_10566
		    = new Class691_Sub15(class528_sub42.readUnsignedByte((byte) 69),
					 this);
		aClass691_Sub3_10593
		    = new Class691_Sub3(class528_sub42.readUnsignedByte((byte) 66),
					this);
		aClass691_Sub3_10595
		    = new Class691_Sub3(aClass691_Sub3_10593
					    .method9844((byte) 69),
					this);
		aClass691_Sub30_10600
		    = new Class691_Sub30(class528_sub42.readUnsignedByte((byte) 83),
					 this);
		aClass691_Sub35_10597
		    = new Class691_Sub35(class528_sub42.readUnsignedByte((byte) 60),
					 this);
		aClass691_Sub32_10598
		    = new Class691_Sub32(class528_sub42.readUnsignedByte((byte) 89),
					 this);
		aClass691_Sub18_10599
		    = new Class691_Sub18(class528_sub42.readUnsignedByte((byte) 101),
					 this);
		aClass691_Sub33_10560
		    = new Class691_Sub33(class528_sub42.readUnsignedByte((byte) 4),
					 this);
		if (i_0_ >= 26)
		    aClass691_Sub31_10602
			= new Class691_Sub31(class528_sub42
						 .readUnsignedByte((byte) 113),
					     this);
		if (i_0_ >= 28)
		    ((Class528_Sub38) this).aClass691_Sub20_10581
			= new Class691_Sub20(class528_sub42
						 .readUnsignedByte((byte) 30),
					     this);
		if (i_0_ >= 30)
		    aClass691_Sub26_10573
			= new Class691_Sub26(class528_sub42
						 .readUnsignedByte((byte) 13),
					     this);
		aClass691_Sub34_10591
		    = new Class691_Sub34(class528_sub42.readUnsignedByte((byte) 17),
					 this);
		aClass691_Sub34_10604
		    = new Class691_Sub34(class528_sub42.readUnsignedByte((byte) 94),
					 this);
		aClass691_Sub34_10607
		    = new Class691_Sub34(class528_sub42.readUnsignedByte((byte) 9),
					 this);
		aClass691_Sub34_10608
		    = new Class691_Sub34(class528_sub42.readUnsignedByte((byte) 25),
					 this);
		aClass691_Sub34_10584
		    = new Class691_Sub34(class528_sub42.readUnsignedByte((byte) 74),
					 this);
		aClass691_Sub29_10575
		    = new Class691_Sub29(class528_sub42.readUnsignedByte((byte) 100),
					 this);
		method9562(false, i_0_ < 32, 55116336);
	    }
	}
	method9558(-1559242047);
    }
    
    void method9554(ByteBuffer class528_sub42, int i, int i_1_) {
	aClass691_Sub1_10571
	    = new Class691_Sub1(class528_sub42.readUnsignedByte((byte) 93), this);
	class528_sub42.pointer += 2015001547;
	aClass691_Sub17_10585
	    = new Class691_Sub17(class528_sub42.readUnsignedByte((byte) 19) + 1,
				 this);
	aClass691_Sub4_10578
	    = new Class691_Sub4(class528_sub42.readUnsignedByte((byte) 119), this);
	class528_sub42.pointer += 2015001547;
	aClass691_Sub14_10570
	    = new Class691_Sub14(class528_sub42.readUnsignedByte((byte) 59), this);
	aClass691_Sub11_10603
	    = new Class691_Sub11(class528_sub42.readUnsignedByte((byte) 116), this);
	class528_sub42.readUnsignedByte((byte) 83);
	aClass691_Sub7_10589
	    = new Class691_Sub7(class528_sub42.readUnsignedByte((byte) 51), this);
	int i_2_ = class528_sub42.readUnsignedByte((byte) 51);
	int i_3_ = 0;
	if (i >= 17)
	    i_3_ = class528_sub42.readUnsignedByte((byte) 7);
	aClass691_Sub8_10565
	    = new Class691_Sub8(i_2_ > i_3_ ? i_2_ : i_3_, this);
	boolean bool = true;
	boolean bool_4_ = true;
	if (i >= 2) {
	    bool = class528_sub42.readUnsignedByte((byte) 108) == 1;
	    if (i >= 17)
		bool_4_ = class528_sub42.readUnsignedByte((byte) 110) == 1;
	} else {
	    bool = class528_sub42.readUnsignedByte((byte) 71) == 1;
	    class528_sub42.readUnsignedByte((byte) 114);
	}
	aClass691_Sub2_10580 = new Class691_Sub2(bool | bool_4_ ? 1 : 0, this);
	aClass691_Sub15_10566
	    = new Class691_Sub15(class528_sub42.readUnsignedByte((byte) 57), this);
	aClass691_Sub16_10576
	    = new Class691_Sub16(class528_sub42.readUnsignedByte((byte) 113), this);
	aClass691_Sub27_10567
	    = new Class691_Sub27(class528_sub42.readUnsignedByte((byte) 16), this);
	aClass691_Sub29_10575
	    = new Class691_Sub29(class528_sub42.readUnsignedByte((byte) 91), this);
	aClass691_Sub34_10591
	    = new Class691_Sub34(class528_sub42.readUnsignedByte((byte) 37), this);
	if (i >= 20)
	    aClass691_Sub34_10607
		= new Class691_Sub34(class528_sub42.readUnsignedByte((byte) 69),
				     this);
	else
	    aClass691_Sub34_10607
		= new Class691_Sub34(aClass691_Sub34_10591
					 .method10132((byte) 78),
				     this);
	aClass691_Sub34_10608
	    = new Class691_Sub34(class528_sub42.readUnsignedByte((byte) 63), this);
	aClass691_Sub34_10604
	    = new Class691_Sub34(class528_sub42.readUnsignedByte((byte) 84), this);
	if (i >= 21)
	    aClass691_Sub34_10584
		= new Class691_Sub34(class528_sub42.readUnsignedByte((byte) 34),
				     this);
	else
	    aClass691_Sub34_10584
		= new Class691_Sub34(aClass691_Sub34_10608
					 .method10132((byte) 82),
				     this);
	if (i >= 1) {
	    class528_sub42.readUnsignedShort(345166791);
	    class528_sub42.readUnsignedShort(355923626);
	}
	if (i >= 3 && i < 6)
	    class528_sub42.readUnsignedByte((byte) 102);
	if (i >= 4)
	    aClass691_Sub5_10579
		= new Class691_Sub5(class528_sub42.readUnsignedByte((byte) 13),
				    this);
	class528_sub42.readInt(-1908508974);
	if (i >= 6)
	    aClass691_Sub3_10593
		= new Class691_Sub3(class528_sub42.readUnsignedByte((byte) 81),
				    this);
	if (i >= 7)
	    aClass691_Sub33_10560
		= new Class691_Sub33(class528_sub42.readUnsignedByte((byte) 67),
				     this);
	if (i >= 8)
	    class528_sub42.readUnsignedByte((byte) 36);
	if (i >= 9)
	    aClass691_Sub10_10572
		= new Class691_Sub10(class528_sub42.readUnsignedByte((byte) 106),
				     this);
	if (i >= 10)
	    aClass691_Sub19_10601
		= new Class691_Sub19(class528_sub42.readUnsignedByte((byte) 124),
				     this);
	if (i >= 11)
	    aClass691_Sub30_10600
		= new Class691_Sub30(class528_sub42.readUnsignedByte((byte) 38),
				     this);
	if (i >= 12)
	    aClass691_Sub14_10570
		= new Class691_Sub14(class528_sub42.readUnsignedByte((byte) 2),
				     this);
	if (i >= 13)
	    aClass691_Sub23_10606
		= new Class691_Sub23(class528_sub42.readUnsignedByte((byte) 74),
				     this);
	if (i >= 14)
	    aClass691_Sub24_10577
		= new Class691_Sub24(class528_sub42.readUnsignedByte((byte) 11),
				     this);
	if (i >= 15)
	    aClass691_Sub32_10598
		= new Class691_Sub32(class528_sub42.readUnsignedByte((byte) 120),
				     this);
	if (i >= 16)
	    aClass691_Sub12_10590
		= new Class691_Sub12(class528_sub42.readUnsignedByte((byte) 23),
				     this);
	if (i >= 18)
	    aClass691_Sub35_10597
		= new Class691_Sub35(class528_sub42.readUnsignedByte((byte) 5),
				     this);
	if (i >= 19)
	    aClass691_Sub13_10587
		= new Class691_Sub13(class528_sub42.readUnsignedByte((byte) 9),
				     this);
	if (i >= 22)
	    aClass691_Sub18_10599
		= new Class691_Sub18(class528_sub42.readUnsignedByte((byte) 23),
				     this);
    }
    
    public ByteBuffer method9555(int i) {
	ByteBuffer class528_sub42 = new ByteBuffer(44);
	class528_sub42.writeByte(34, (byte) -43);
	class528_sub42.writeByte(aClass691_Sub25_10592
				      .method10028((byte) -32),
				  (byte) 10);
	class528_sub42.writeByte(aClass691_Sub27_10567
				      .method10040((byte) -14),
				  (byte) 13);
	class528_sub42.writeByte(((Class528_Sub38) this)
				      .aClass691_Sub28_10569
				      .method10048((byte) 71),
				  (byte) -22);
	class528_sub42.writeByte(aClass691_Sub19_10601.method9967(-401571612),
				  (byte) 75);
	class528_sub42.writeByte(aClass691_Sub1_10571.method9538((byte) -71),
				  (byte) 118);
	class528_sub42.writeByte(aClass691_Sub10_10572
				      .method9901(-1888478825),
				  (byte) -75);
	class528_sub42.writeByte(aClass691_Sub6_10574.method9868((byte) 120),
				  (byte) 44);
	class528_sub42.writeByte(aClass691_Sub11_10603.method9909(1568550331),
				  (byte) -91);
	class528_sub42.writeByte(aClass691_Sub16_10576
				      .method9953(-2024714008),
				  (byte) -7);
	class528_sub42.writeByte(aClass691_Sub23_10606
				      .method10004(-188552897),
				  (byte) -78);
	class528_sub42.writeByte(aClass691_Sub4_10578.method9850((byte) 99),
				  (byte) 70);
	class528_sub42.writeByte(aClass691_Sub14_10570.method9932((byte) -1),
				  (byte) 6);
	class528_sub42.writeByte(aClass691_Sub2_10580.method9747(-2098321037),
				  (byte) 54);
	class528_sub42.writeByte(aClass691_Sub8_10565.method9883(2073881197),
				  (byte) -43);
	class528_sub42.writeByte(aClass691_Sub9_10582.method9890((byte) 17),
				  (byte) -66);
	class528_sub42.writeByte(0, (byte) -8);
	class528_sub42.writeByte(aClass691_Sub21_10583.method9982((byte) 0),
				  (byte) -89);
	class528_sub42.writeByte(aClass691_Sub5_10579.method9859(1515241294),
				  (byte) 73);
	class528_sub42.writeByte(aClass691_Sub17_10585.method9955(1201201148),
				  (byte) 81);
	class528_sub42.writeByte(aClass691_Sub13_10587.method9925((byte) 1),
				  (byte) -21);
	class528_sub42.writeByte(aClass691_Sub22_10588.method9998(1016688331),
				  (byte) -2);
	class528_sub42.writeByte(aClass691_Sub7_10589
				      .method9873((short) 18764),
				  (byte) 23);
	class528_sub42.writeByte(aClass691_Sub12_10590.method9915((byte) 1),
				  (byte) -31);
	class528_sub42.writeByte(aClass691_Sub24_10577
				      .method10014(-1824619963),
				  (byte) -107);
	class528_sub42.writeByte(0, (byte) 82);
	class528_sub42.writeByte(aClass691_Sub15_10566.method9938(430525833),
				  (byte) 23);
	class528_sub42.writeByte(aClass691_Sub3_10593.method9844((byte) 99),
				  (byte) -43);
	class528_sub42.writeByte(aClass691_Sub30_10600
				      .method10069(1039729599),
				  (byte) 24);
	class528_sub42.writeByte(aClass691_Sub35_10597
				      .method10142((short) 269),
				  (byte) -2);
	class528_sub42.writeByte(aClass691_Sub32_10598.method10100((byte) 1),
				  (byte) -100);
	class528_sub42.writeByte(aClass691_Sub18_10599.method9961(1611196727),
				  (byte) 59);
	class528_sub42.writeByte(aClass691_Sub33_10560
				      .method10104(1128765739),
				  (byte) 7);
	class528_sub42.writeByte(aClass691_Sub31_10602
				      .method10076(-740804623),
				  (byte) -13);
	class528_sub42.writeByte(((Class528_Sub38) this)
				      .aClass691_Sub20_10581
				      .method9977((byte) 101),
				  (byte) 19);
	class528_sub42.writeByte(aClass691_Sub26_10573
				      .method10035(-1893416673),
				  (byte) -75);
	class528_sub42.writeByte(aClass691_Sub34_10591
				      .method10132((byte) 118),
				  (byte) -54);
	class528_sub42.writeByte(aClass691_Sub34_10604.method10132((byte) 31),
				  (byte) -22);
	class528_sub42.writeByte(aClass691_Sub34_10607.method10132((byte) 72),
				  (byte) -14);
	class528_sub42.writeByte(aClass691_Sub34_10608.method10132((byte) 16),
				  (byte) -57);
	class528_sub42.writeByte(aClass691_Sub34_10584.method10132((byte) 36),
				  (byte) 34);
	class528_sub42.writeByte(aClass691_Sub29_10575
				      .method10063(-565315778),
				  (byte) -26);
	return class528_sub42;
    }
    
    public void method9556(Class691 class691, int i, int i_5_) {
	class691.method8133(i, (byte) -39);
	method9558(-1559242047);
    }
    
    public void method9557(Class691_Sub24 class691_sub24, boolean bool,
			   byte i) {
	class691_sub24.method10019(bool, (byte) -75);
	method9558(-1559242047);
    }
    
    void method9558(int i) {
	aClass691_Sub25_10592.method10029(-1354695012);
	aClass691_Sub27_10567.method10042((short) 470);
	((Class528_Sub38) this).aClass691_Sub28_10569.method10050((byte) 6);
	aClass691_Sub27_10568.method10042((short) 470);
	aClass691_Sub19_10601.method9965((byte) 113);
	aClass691_Sub1_10571.method9537(-1914959311);
	aClass691_Sub10_10572.method9899(1864234711);
	aClass691_Sub6_10574.method9867(1297864689);
	aClass691_Sub11_10603.method9907(-1757565955);
	aClass691_Sub16_10576.method9951(1361976521);
	aClass691_Sub23_10606.method10008((byte) -61);
	aClass691_Sub4_10578.method9852((short) 27119);
	aClass691_Sub14_10570.method9930(468948215);
	aClass691_Sub2_10580.method9746((byte) 20);
	aClass691_Sub8_10565.method9882((byte) -1);
	aClass691_Sub9_10582.method9889(-999807484);
	aClass691_Sub21_10583.method9979(-510883844);
	aClass691_Sub5_10579.method9861(-2139469331);
	aClass691_Sub17_10585.method9959(1569150423);
	aClass691_Sub17_10586.method9959(1569150423);
	aClass691_Sub13_10587.method9923(-279601648);
	aClass691_Sub22_10588.method9994(-2049742924);
	aClass691_Sub7_10589.method9871(-678741027);
	aClass691_Sub12_10590.method9912(-995130497);
	aClass691_Sub24_10577.method10027((byte) -38);
	aClass691_Sub24_10594.method10027((byte) 72);
	aClass691_Sub15_10566.method9945((short) -25260);
	aClass691_Sub3_10593.method9843(1990424775);
	aClass691_Sub3_10595.method9843(198392747);
	aClass691_Sub30_10600.method10070(-747922776);
	aClass691_Sub35_10597.method10141((byte) -114);
	aClass691_Sub32_10598.method10098(-2080496647);
	aClass691_Sub18_10599.method9963((byte) 3);
	aClass691_Sub33_10560.method10106((byte) -29);
	aClass691_Sub31_10602.method10077(376842852);
	((Class528_Sub38) this).aClass691_Sub20_10581.method9976(-77473835);
	aClass691_Sub26_10573.method10034(-876569979);
	aClass691_Sub34_10591.method10133((byte) 120);
	aClass691_Sub34_10604.method10133((byte) 84);
	aClass691_Sub34_10607.method10133((byte) 66);
	aClass691_Sub34_10608.method10133((byte) 14);
	aClass691_Sub34_10584.method10133((byte) 83);
	aClass691_Sub29_10575.method10066((byte) 0);
    }
    
    public Class673 method9559(int i) {
	return ((Class528_Sub38) this).aClass673_10564;
    }
    
    public Class528_Sub38(Class673 class673, int i) {
	((Class528_Sub38) this).aClass673_10564 = class673;
	((Class528_Sub38) this).aClass686_10605
	    = new Class686(1110656915 * Class509.anInt6957,
			   -986761059 * Class509.anInt6958,
			   (Class674.aString8539.toLowerCase().indexOf("arm")
			    != -1),
			   Class312.aString3440.startsWith("win"), false);
	aClass691_Sub24_10594 = new Class691_Sub24(i, this);
	method9562(true, true, -403631512);
    }
    
    void method9560(ByteBuffer class528_sub42) {
	if (null == class528_sub42 || class528_sub42.payload == null)
	    method9562(true, true, 1451903273);
	else {
	    int i = class528_sub42.readUnsignedByte((byte) 78);
	    if (i < 23) {
		try {
		    method9554(class528_sub42, i, 1194703951);
		} catch (Exception exception) {
		    method9562(true, true, 1929984560);
		}
		method9562(false, true, -1407267017);
	    } else if (i > 34)
		method9562(true, true, 544781949);
	    else {
		if (i >= 29)
		    aClass691_Sub25_10592
			= new Class691_Sub25(class528_sub42
						 .readUnsignedByte((byte) 45),
					     this);
		aClass691_Sub27_10567
		    = new Class691_Sub27(class528_sub42.readUnsignedByte((byte) 75),
					 this);
		if (i >= 31)
		    ((Class528_Sub38) this).aClass691_Sub28_10569
			= new Class691_Sub28(class528_sub42
						 .readUnsignedByte((byte) 4),
					     this);
		aClass691_Sub27_10568
		    = new Class691_Sub27(aClass691_Sub27_10567
					     .method10040((byte) -81),
					 this);
		aClass691_Sub19_10601
		    = new Class691_Sub19(class528_sub42.readUnsignedByte((byte) 23),
					 this);
		aClass691_Sub1_10571
		    = new Class691_Sub1(class528_sub42.readUnsignedByte((byte) 28),
					this);
		aClass691_Sub10_10572
		    = new Class691_Sub10(class528_sub42.readUnsignedByte((byte) 118),
					 this);
		if (i >= 27)
		    aClass691_Sub6_10574
			= new Class691_Sub6(class528_sub42
						.readUnsignedByte((byte) 118),
					    this);
		aClass691_Sub11_10603
		    = new Class691_Sub11(class528_sub42.readUnsignedByte((byte) 20),
					 this);
		aClass691_Sub16_10576
		    = new Class691_Sub16(class528_sub42.readUnsignedByte((byte) 9),
					 this);
		aClass691_Sub23_10606
		    = new Class691_Sub23(class528_sub42.readUnsignedByte((byte) 55),
					 this);
		aClass691_Sub4_10578
		    = new Class691_Sub4(class528_sub42.readUnsignedByte((byte) 103),
					this);
		aClass691_Sub14_10570
		    = new Class691_Sub14(class528_sub42.readUnsignedByte((byte) 1),
					 this);
		aClass691_Sub2_10580
		    = new Class691_Sub2(class528_sub42.readUnsignedByte((byte) 91),
					this);
		aClass691_Sub8_10565
		    = new Class691_Sub8(class528_sub42.readUnsignedByte((byte) 76),
					this);
		if (i >= 33)
		    aClass691_Sub9_10582
			= new Class691_Sub9(class528_sub42
						.readUnsignedByte((byte) 26),
					    this);
		if (i >= 34)
		    class528_sub42.readUnsignedByte((byte) 12);
		if (i >= 24)
		    aClass691_Sub21_10583
			= new Class691_Sub21(class528_sub42
						 .readUnsignedByte((byte) 33),
					     this);
		aClass691_Sub5_10579
		    = new Class691_Sub5(class528_sub42.readUnsignedByte((byte) 2),
					this);
		aClass691_Sub17_10585
		    = new Class691_Sub17(class528_sub42.readUnsignedByte((byte) 57),
					 this);
		aClass691_Sub17_10586
		    = new Class691_Sub17(aClass691_Sub17_10585
					     .method9955(63307401),
					 this);
		aClass691_Sub13_10587
		    = new Class691_Sub13(class528_sub42.readUnsignedByte((byte) 24),
					 this);
		if (i >= 25)
		    aClass691_Sub22_10588
			= new Class691_Sub22(class528_sub42
						 .readUnsignedByte((byte) 55),
					     this);
		aClass691_Sub7_10589
		    = new Class691_Sub7(class528_sub42.readUnsignedByte((byte) 89),
					this);
		if (i <= 25)
		    class528_sub42.pointer += 2015001547;
		aClass691_Sub12_10590
		    = new Class691_Sub12(class528_sub42.readUnsignedByte((byte) 97),
					 this);
		aClass691_Sub24_10577
		    = new Class691_Sub24(class528_sub42.readUnsignedByte((byte) 96),
					 this);
		aClass691_Sub24_10594
		    = new Class691_Sub24(aClass691_Sub24_10577
					     .method10014(-1824619963),
					 this);
		class528_sub42.readUnsignedByte((byte) 58);
		aClass691_Sub15_10566
		    = new Class691_Sub15(class528_sub42.readUnsignedByte((byte) 51),
					 this);
		aClass691_Sub3_10593
		    = new Class691_Sub3(class528_sub42.readUnsignedByte((byte) 113),
					this);
		aClass691_Sub3_10595
		    = new Class691_Sub3(aClass691_Sub3_10593
					    .method9844((byte) 68),
					this);
		aClass691_Sub30_10600
		    = new Class691_Sub30(class528_sub42.readUnsignedByte((byte) 77),
					 this);
		aClass691_Sub35_10597
		    = new Class691_Sub35(class528_sub42.readUnsignedByte((byte) 70),
					 this);
		aClass691_Sub32_10598
		    = new Class691_Sub32(class528_sub42.readUnsignedByte((byte) 85),
					 this);
		aClass691_Sub18_10599
		    = new Class691_Sub18(class528_sub42.readUnsignedByte((byte) 96),
					 this);
		aClass691_Sub33_10560
		    = new Class691_Sub33(class528_sub42.readUnsignedByte((byte) 49),
					 this);
		if (i >= 26)
		    aClass691_Sub31_10602
			= new Class691_Sub31(class528_sub42
						 .readUnsignedByte((byte) 92),
					     this);
		if (i >= 28)
		    ((Class528_Sub38) this).aClass691_Sub20_10581
			= new Class691_Sub20(class528_sub42
						 .readUnsignedByte((byte) 93),
					     this);
		if (i >= 30)
		    aClass691_Sub26_10573
			= new Class691_Sub26(class528_sub42
						 .readUnsignedByte((byte) 59),
					     this);
		aClass691_Sub34_10591
		    = new Class691_Sub34(class528_sub42.readUnsignedByte((byte) 34),
					 this);
		aClass691_Sub34_10604
		    = new Class691_Sub34(class528_sub42.readUnsignedByte((byte) 112),
					 this);
		aClass691_Sub34_10607
		    = new Class691_Sub34(class528_sub42.readUnsignedByte((byte) 64),
					 this);
		aClass691_Sub34_10608
		    = new Class691_Sub34(class528_sub42.readUnsignedByte((byte) 27),
					 this);
		aClass691_Sub34_10584
		    = new Class691_Sub34(class528_sub42.readUnsignedByte((byte) 13),
					 this);
		aClass691_Sub29_10575
		    = new Class691_Sub29(class528_sub42.readUnsignedByte((byte) 62),
					 this);
		method9562(false, i < 32, -1932282948);
	    }
	}
	method9558(-1559242047);
    }
    
    void method9561(ByteBuffer class528_sub42) {
	if (null == class528_sub42 || class528_sub42.payload == null)
	    method9562(true, true, -738547155);
	else {
	    int i = class528_sub42.readUnsignedByte((byte) 123);
	    if (i < 23) {
		try {
		    method9554(class528_sub42, i, -2083528866);
		} catch (Exception exception) {
		    method9562(true, true, -1574126467);
		}
		method9562(false, true, 1731559267);
	    } else if (i > 34)
		method9562(true, true, 1471487353);
	    else {
		if (i >= 29)
		    aClass691_Sub25_10592
			= new Class691_Sub25(class528_sub42
						 .readUnsignedByte((byte) 88),
					     this);
		aClass691_Sub27_10567
		    = new Class691_Sub27(class528_sub42.readUnsignedByte((byte) 124),
					 this);
		if (i >= 31)
		    ((Class528_Sub38) this).aClass691_Sub28_10569
			= new Class691_Sub28(class528_sub42
						 .readUnsignedByte((byte) 126),
					     this);
		aClass691_Sub27_10568
		    = new Class691_Sub27(aClass691_Sub27_10567
					     .method10040((byte) -37),
					 this);
		aClass691_Sub19_10601
		    = new Class691_Sub19(class528_sub42.readUnsignedByte((byte) 75),
					 this);
		aClass691_Sub1_10571
		    = new Class691_Sub1(class528_sub42.readUnsignedByte((byte) 98),
					this);
		aClass691_Sub10_10572
		    = new Class691_Sub10(class528_sub42.readUnsignedByte((byte) 106),
					 this);
		if (i >= 27)
		    aClass691_Sub6_10574
			= new Class691_Sub6(class528_sub42
						.readUnsignedByte((byte) 15),
					    this);
		aClass691_Sub11_10603
		    = new Class691_Sub11(class528_sub42.readUnsignedByte((byte) 27),
					 this);
		aClass691_Sub16_10576
		    = new Class691_Sub16(class528_sub42.readUnsignedByte((byte) 72),
					 this);
		aClass691_Sub23_10606
		    = new Class691_Sub23(class528_sub42.readUnsignedByte((byte) 85),
					 this);
		aClass691_Sub4_10578
		    = new Class691_Sub4(class528_sub42.readUnsignedByte((byte) 52),
					this);
		aClass691_Sub14_10570
		    = new Class691_Sub14(class528_sub42.readUnsignedByte((byte) 86),
					 this);
		aClass691_Sub2_10580
		    = new Class691_Sub2(class528_sub42.readUnsignedByte((byte) 107),
					this);
		aClass691_Sub8_10565
		    = new Class691_Sub8(class528_sub42.readUnsignedByte((byte) 15),
					this);
		if (i >= 33)
		    aClass691_Sub9_10582
			= new Class691_Sub9(class528_sub42
						.readUnsignedByte((byte) 31),
					    this);
		if (i >= 34)
		    class528_sub42.readUnsignedByte((byte) 88);
		if (i >= 24)
		    aClass691_Sub21_10583
			= new Class691_Sub21(class528_sub42
						 .readUnsignedByte((byte) 117),
					     this);
		aClass691_Sub5_10579
		    = new Class691_Sub5(class528_sub42.readUnsignedByte((byte) 124),
					this);
		aClass691_Sub17_10585
		    = new Class691_Sub17(class528_sub42.readUnsignedByte((byte) 69),
					 this);
		aClass691_Sub17_10586
		    = new Class691_Sub17(aClass691_Sub17_10585
					     .method9955(-366521823),
					 this);
		aClass691_Sub13_10587
		    = new Class691_Sub13(class528_sub42.readUnsignedByte((byte) 120),
					 this);
		if (i >= 25)
		    aClass691_Sub22_10588
			= new Class691_Sub22(class528_sub42
						 .readUnsignedByte((byte) 107),
					     this);
		aClass691_Sub7_10589
		    = new Class691_Sub7(class528_sub42.readUnsignedByte((byte) 34),
					this);
		if (i <= 25)
		    class528_sub42.pointer += 2015001547;
		aClass691_Sub12_10590
		    = new Class691_Sub12(class528_sub42.readUnsignedByte((byte) 7),
					 this);
		aClass691_Sub24_10577
		    = new Class691_Sub24(class528_sub42.readUnsignedByte((byte) 95),
					 this);
		aClass691_Sub24_10594
		    = new Class691_Sub24(aClass691_Sub24_10577
					     .method10014(-1824619963),
					 this);
		class528_sub42.readUnsignedByte((byte) 10);
		aClass691_Sub15_10566
		    = new Class691_Sub15(class528_sub42.readUnsignedByte((byte) 73),
					 this);
		aClass691_Sub3_10593
		    = new Class691_Sub3(class528_sub42.readUnsignedByte((byte) 98),
					this);
		aClass691_Sub3_10595
		    = new Class691_Sub3(aClass691_Sub3_10593
					    .method9844((byte) 21),
					this);
		aClass691_Sub30_10600
		    = new Class691_Sub30(class528_sub42.readUnsignedByte((byte) 7),
					 this);
		aClass691_Sub35_10597
		    = new Class691_Sub35(class528_sub42.readUnsignedByte((byte) 47),
					 this);
		aClass691_Sub32_10598
		    = new Class691_Sub32(class528_sub42.readUnsignedByte((byte) 104),
					 this);
		aClass691_Sub18_10599
		    = new Class691_Sub18(class528_sub42.readUnsignedByte((byte) 57),
					 this);
		aClass691_Sub33_10560
		    = new Class691_Sub33(class528_sub42.readUnsignedByte((byte) 2),
					 this);
		if (i >= 26)
		    aClass691_Sub31_10602
			= new Class691_Sub31(class528_sub42
						 .readUnsignedByte((byte) 85),
					     this);
		if (i >= 28)
		    ((Class528_Sub38) this).aClass691_Sub20_10581
			= new Class691_Sub20(class528_sub42
						 .readUnsignedByte((byte) 66),
					     this);
		if (i >= 30)
		    aClass691_Sub26_10573
			= new Class691_Sub26(class528_sub42
						 .readUnsignedByte((byte) 43),
					     this);
		aClass691_Sub34_10591
		    = new Class691_Sub34(class528_sub42.readUnsignedByte((byte) 10),
					 this);
		aClass691_Sub34_10604
		    = new Class691_Sub34(class528_sub42.readUnsignedByte((byte) 56),
					 this);
		aClass691_Sub34_10607
		    = new Class691_Sub34(class528_sub42.readUnsignedByte((byte) 57),
					 this);
		aClass691_Sub34_10608
		    = new Class691_Sub34(class528_sub42.readUnsignedByte((byte) 33),
					 this);
		aClass691_Sub34_10584
		    = new Class691_Sub34(class528_sub42.readUnsignedByte((byte) 85),
					 this);
		aClass691_Sub29_10575
		    = new Class691_Sub29(class528_sub42.readUnsignedByte((byte) 126),
					 this);
		method9562(false, i < 32, -1442520914);
	    }
	}
	method9558(-1559242047);
    }
    
    void method9562(boolean bool, boolean bool_6_, int i) {
	if (bool || null == aClass691_Sub25_10592)
	    aClass691_Sub25_10592 = new Class691_Sub25(this);
	if (bool || aClass691_Sub27_10567 == null)
	    aClass691_Sub27_10567 = new Class691_Sub27(this);
	if (bool || ((Class528_Sub38) this).aClass691_Sub28_10569 == null)
	    ((Class528_Sub38) this).aClass691_Sub28_10569
		= new Class691_Sub28(this);
	if (bool || null == aClass691_Sub27_10568)
	    aClass691_Sub27_10568
		= new Class691_Sub27(aClass691_Sub27_10567
					 .method10040((byte) -6),
				     this);
	if (bool || null == aClass691_Sub19_10601)
	    aClass691_Sub19_10601 = new Class691_Sub19(this);
	if (bool || null == aClass691_Sub1_10571)
	    aClass691_Sub1_10571 = new Class691_Sub1(this);
	if (bool || aClass691_Sub10_10572 == null)
	    aClass691_Sub10_10572 = new Class691_Sub10(this);
	if (bool || null == aClass691_Sub6_10574)
	    aClass691_Sub6_10574 = new Class691_Sub6(this);
	if (bool || aClass691_Sub11_10603 == null)
	    aClass691_Sub11_10603 = new Class691_Sub11(this);
	if (bool || null == aClass691_Sub16_10576)
	    aClass691_Sub16_10576 = new Class691_Sub16(this);
	if (bool || null == aClass691_Sub23_10606)
	    aClass691_Sub23_10606 = new Class691_Sub23(this);
	if (bool || aClass691_Sub4_10578 == null)
	    aClass691_Sub4_10578 = new Class691_Sub4(this);
	if (bool || aClass691_Sub14_10570 == null)
	    aClass691_Sub14_10570 = new Class691_Sub14(this);
	if (bool || aClass691_Sub2_10580 == null)
	    aClass691_Sub2_10580 = new Class691_Sub2(this);
	if (bool || aClass691_Sub8_10565 == null)
	    aClass691_Sub8_10565 = new Class691_Sub8(this);
	if (bool || null == aClass691_Sub9_10582)
	    aClass691_Sub9_10582 = new Class691_Sub9(this);
	if (bool || null == aClass691_Sub21_10583)
	    aClass691_Sub21_10583 = new Class691_Sub21(this);
	if (bool || aClass691_Sub5_10579 == null)
	    aClass691_Sub5_10579 = new Class691_Sub5(this);
	if (bool || aClass691_Sub17_10585 == null)
	    aClass691_Sub17_10585 = new Class691_Sub17(this);
	if (bool || null == aClass691_Sub17_10586)
	    aClass691_Sub17_10586
		= new Class691_Sub17(aClass691_Sub17_10585
					 .method9955(758714101),
				     this);
	if (bool || aClass691_Sub13_10587 == null)
	    aClass691_Sub13_10587 = new Class691_Sub13(this);
	if (bool || aClass691_Sub22_10588 == null)
	    aClass691_Sub22_10588 = new Class691_Sub22(this);
	if (bool || null == aClass691_Sub7_10589)
	    aClass691_Sub7_10589 = new Class691_Sub7(this);
	if (bool || aClass691_Sub12_10590 == null)
	    aClass691_Sub12_10590 = new Class691_Sub12(this);
	if (bool || null == aClass691_Sub24_10577)
	    aClass691_Sub24_10577 = new Class691_Sub24(this);
	if (bool || null == aClass691_Sub24_10594)
	    aClass691_Sub24_10594
		= new Class691_Sub24(aClass691_Sub24_10577
					 .method10014(-1824619963),
				     this);
	if (bool || null == aClass691_Sub15_10566)
	    aClass691_Sub15_10566 = new Class691_Sub15(this);
	if (bool || null == aClass691_Sub3_10593)
	    aClass691_Sub3_10593 = new Class691_Sub3(this);
	if (bool || aClass691_Sub3_10595 == null)
	    aClass691_Sub3_10595
		= new Class691_Sub3(aClass691_Sub3_10593.method9844((byte) 42),
				    this);
	if (bool || aClass691_Sub30_10600 == null)
	    aClass691_Sub30_10600 = new Class691_Sub30(this);
	if (bool || null == aClass691_Sub35_10597)
	    aClass691_Sub35_10597 = new Class691_Sub35(this);
	if (bool || aClass691_Sub32_10598 == null)
	    aClass691_Sub32_10598 = new Class691_Sub32(this);
	if (bool || aClass691_Sub18_10599 == null)
	    aClass691_Sub18_10599 = new Class691_Sub18(this);
	if (bool || null == aClass691_Sub33_10560)
	    aClass691_Sub33_10560 = new Class691_Sub33(this);
	if (bool || aClass691_Sub31_10602 == null)
	    aClass691_Sub31_10602 = new Class691_Sub31(this);
	if (bool || null == ((Class528_Sub38) this).aClass691_Sub20_10581)
	    ((Class528_Sub38) this).aClass691_Sub20_10581
		= new Class691_Sub20(this);
	if (bool || aClass691_Sub26_10573 == null)
	    aClass691_Sub26_10573 = new Class691_Sub26(this);
	if (bool || bool_6_ || null == aClass691_Sub34_10591)
	    aClass691_Sub34_10591 = new Class691_Sub34(this);
	if (bool || bool_6_ || aClass691_Sub34_10604 == null)
	    aClass691_Sub34_10604 = new Class691_Sub34(this);
	if (bool || bool_6_ || aClass691_Sub34_10607 == null)
	    aClass691_Sub34_10607 = new Class691_Sub34(this);
	if (bool || bool_6_ || aClass691_Sub34_10608 == null)
	    aClass691_Sub34_10608 = new Class691_Sub34(this);
	if (bool || bool_6_ || aClass691_Sub34_10584 == null)
	    aClass691_Sub34_10584 = new Class691_Sub34(this);
	if (bool || bool_6_ || null == aClass691_Sub29_10575)
	    aClass691_Sub29_10575 = new Class691_Sub29(this);
    }
    
    void method9563(ByteBuffer class528_sub42) {
	if (null == class528_sub42 || class528_sub42.payload == null)
	    method9562(true, true, -2102855189);
	else {
	    int i = class528_sub42.readUnsignedByte((byte) 34);
	    if (i < 23) {
		try {
		    method9554(class528_sub42, i, 397154043);
		} catch (Exception exception) {
		    method9562(true, true, -1464211373);
		}
		method9562(false, true, -1053612418);
	    } else if (i > 34)
		method9562(true, true, -1977969745);
	    else {
		if (i >= 29)
		    aClass691_Sub25_10592
			= new Class691_Sub25(class528_sub42
						 .readUnsignedByte((byte) 108),
					     this);
		aClass691_Sub27_10567
		    = new Class691_Sub27(class528_sub42.readUnsignedByte((byte) 23),
					 this);
		if (i >= 31)
		    ((Class528_Sub38) this).aClass691_Sub28_10569
			= new Class691_Sub28(class528_sub42
						 .readUnsignedByte((byte) 8),
					     this);
		aClass691_Sub27_10568
		    = new Class691_Sub27(aClass691_Sub27_10567
					     .method10040((byte) -40),
					 this);
		aClass691_Sub19_10601
		    = new Class691_Sub19(class528_sub42.readUnsignedByte((byte) 124),
					 this);
		aClass691_Sub1_10571
		    = new Class691_Sub1(class528_sub42.readUnsignedByte((byte) 13),
					this);
		aClass691_Sub10_10572
		    = new Class691_Sub10(class528_sub42.readUnsignedByte((byte) 101),
					 this);
		if (i >= 27)
		    aClass691_Sub6_10574
			= new Class691_Sub6(class528_sub42
						.readUnsignedByte((byte) 56),
					    this);
		aClass691_Sub11_10603
		    = new Class691_Sub11(class528_sub42.readUnsignedByte((byte) 47),
					 this);
		aClass691_Sub16_10576
		    = new Class691_Sub16(class528_sub42.readUnsignedByte((byte) 103),
					 this);
		aClass691_Sub23_10606
		    = new Class691_Sub23(class528_sub42.readUnsignedByte((byte) 83),
					 this);
		aClass691_Sub4_10578
		    = new Class691_Sub4(class528_sub42.readUnsignedByte((byte) 44),
					this);
		aClass691_Sub14_10570
		    = new Class691_Sub14(class528_sub42.readUnsignedByte((byte) 82),
					 this);
		aClass691_Sub2_10580
		    = new Class691_Sub2(class528_sub42.readUnsignedByte((byte) 65),
					this);
		aClass691_Sub8_10565
		    = new Class691_Sub8(class528_sub42.readUnsignedByte((byte) 49),
					this);
		if (i >= 33)
		    aClass691_Sub9_10582
			= new Class691_Sub9(class528_sub42
						.readUnsignedByte((byte) 122),
					    this);
		if (i >= 34)
		    class528_sub42.readUnsignedByte((byte) 80);
		if (i >= 24)
		    aClass691_Sub21_10583
			= new Class691_Sub21(class528_sub42
						 .readUnsignedByte((byte) 80),
					     this);
		aClass691_Sub5_10579
		    = new Class691_Sub5(class528_sub42.readUnsignedByte((byte) 40),
					this);
		aClass691_Sub17_10585
		    = new Class691_Sub17(class528_sub42.readUnsignedByte((byte) 81),
					 this);
		aClass691_Sub17_10586
		    = new Class691_Sub17(aClass691_Sub17_10585
					     .method9955(-1992812363),
					 this);
		aClass691_Sub13_10587
		    = new Class691_Sub13(class528_sub42.readUnsignedByte((byte) 6),
					 this);
		if (i >= 25)
		    aClass691_Sub22_10588
			= new Class691_Sub22(class528_sub42
						 .readUnsignedByte((byte) 1),
					     this);
		aClass691_Sub7_10589
		    = new Class691_Sub7(class528_sub42.readUnsignedByte((byte) 105),
					this);
		if (i <= 25)
		    class528_sub42.pointer += 2015001547;
		aClass691_Sub12_10590
		    = new Class691_Sub12(class528_sub42.readUnsignedByte((byte) 40),
					 this);
		aClass691_Sub24_10577
		    = new Class691_Sub24(class528_sub42.readUnsignedByte((byte) 106),
					 this);
		aClass691_Sub24_10594
		    = new Class691_Sub24(aClass691_Sub24_10577
					     .method10014(-1824619963),
					 this);
		class528_sub42.readUnsignedByte((byte) 18);
		aClass691_Sub15_10566
		    = new Class691_Sub15(class528_sub42.readUnsignedByte((byte) 85),
					 this);
		aClass691_Sub3_10593
		    = new Class691_Sub3(class528_sub42.readUnsignedByte((byte) 23),
					this);
		aClass691_Sub3_10595
		    = new Class691_Sub3(aClass691_Sub3_10593
					    .method9844((byte) 102),
					this);
		aClass691_Sub30_10600
		    = new Class691_Sub30(class528_sub42.readUnsignedByte((byte) 119),
					 this);
		aClass691_Sub35_10597
		    = new Class691_Sub35(class528_sub42.readUnsignedByte((byte) 31),
					 this);
		aClass691_Sub32_10598
		    = new Class691_Sub32(class528_sub42.readUnsignedByte((byte) 112),
					 this);
		aClass691_Sub18_10599
		    = new Class691_Sub18(class528_sub42.readUnsignedByte((byte) 68),
					 this);
		aClass691_Sub33_10560
		    = new Class691_Sub33(class528_sub42.readUnsignedByte((byte) 92),
					 this);
		if (i >= 26)
		    aClass691_Sub31_10602
			= new Class691_Sub31(class528_sub42
						 .readUnsignedByte((byte) 99),
					     this);
		if (i >= 28)
		    ((Class528_Sub38) this).aClass691_Sub20_10581
			= new Class691_Sub20(class528_sub42
						 .readUnsignedByte((byte) 127),
					     this);
		if (i >= 30)
		    aClass691_Sub26_10573
			= new Class691_Sub26(class528_sub42
						 .readUnsignedByte((byte) 99),
					     this);
		aClass691_Sub34_10591
		    = new Class691_Sub34(class528_sub42.readUnsignedByte((byte) 67),
					 this);
		aClass691_Sub34_10604
		    = new Class691_Sub34(class528_sub42.readUnsignedByte((byte) 30),
					 this);
		aClass691_Sub34_10607
		    = new Class691_Sub34(class528_sub42.readUnsignedByte((byte) 69),
					 this);
		aClass691_Sub34_10608
		    = new Class691_Sub34(class528_sub42.readUnsignedByte((byte) 105),
					 this);
		aClass691_Sub34_10584
		    = new Class691_Sub34(class528_sub42.readUnsignedByte((byte) 69),
					 this);
		aClass691_Sub29_10575
		    = new Class691_Sub29(class528_sub42.readUnsignedByte((byte) 1),
					 this);
		method9562(false, i < 32, 875634556);
	    }
	}
	method9558(-1559242047);
    }
    
    public Class686 method9564(short i) {
	return ((Class528_Sub38) this).aClass686_10605;
    }
    
    static Class229 method9565(Class229 class229, int i) {
	Class229 class229_7_ = client.method10202(class229);
	if (null == class229_7_)
	    class229_7_ = class229.aClass229_2351;
	return class229_7_;
    }
}
