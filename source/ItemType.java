
/* ItemType - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;

public class ItemType implements Definition {
	int[] anIntArray25;
	public static final int anInt26 = 1;
	public static final int anInt27 = 2;
	static final int anInt28 = 6;
	static final int anInt29 = 5;
	public static short[] aShortArray30 = new short[256];
	Interface12 anInterface12_31;
	int anInt32;
	int anInt33;
	public int anInt34 = -386231609;
	int anInt35;
	public String aString36 = "null";
	short[] aShortArray37;
	short[] aShortArray38;
	public int anInt39;
	short[] aShortArray40;
	public int anInt41;
	byte[] aByteArray42;
	public int anInt43;
	public int anInt44;
	byte[] aByteArray45;
	public int anInt46;
	public int anInt47;
	public int anInt48;
	public int anInt49;
	int[] anIntArray50;
	int anInt51;
	public int anInt52;
	public boolean aBool53;
	public int anInt54;
	public String[] aStringArray55;
	int[] anIntArray56;
	int[] anIntArray57;
	public static final int anInt58 = 0;
	public int anInt59;
	public int anInt60;
	int anInt61;
	int anInt62;
	int anInt63;
	int anInt64;
	int anInt65;
	int anInt66;
	int anInt67;
	public int anInt68 = 61813360;
	public int anInt69;
	public int[] anIntArray70;
	int anInt71;
	int anInt72;
	int anInt73;
	int anInt74;
	int anInt75;
	int anInt76;
	byte[] aByteArray77;
	int anInt78;
	public int anInt79;
	public int anInt80;
	int anInt81;
	public int anInt82;
	Class9 aClass9_83;
	public int anInt84;
	String aString85;
	int anInt86;
	int anInt87;
	int anInt88;
	public boolean aBool89;
	public String[] aStringArray90;
	int anInt91;
	public int anInt92;
	public boolean aBool93;
	public int anInt94;
	Class692 aClass692_95;
	public int anInt96;
	short[] aShortArray97;
	int anInt98;
	public int anInt99;
	int anInt100;
	public int anInt101;
	public boolean aBool102;
	static String aString103 = "</col>";
	static int anInt104;

	void method510(ItemType class3_0_, ItemType class3_1_, Class668 class668, int i) {
		method526(Class21.aClass21_211, class3_0_, class3_1_, Class39.aClass39_355, class668, -112423760);
	}

	public final boolean method511(boolean bool, ItemStyleOverride itemStyleOverride, int i) {
		int i_2_;
		int i_3_;
		int i_4_;
		if (bool) {
			if (null != itemStyleOverride && itemStyleOverride.anIntArray111 != null) {
				i_2_ = itemStyleOverride.anIntArray111[0];
				i_3_ = itemStyleOverride.anIntArray111[1];
				i_4_ = itemStyleOverride.anIntArray111[2];
			} else {
				i_2_ = -861154921 * this.anInt63;
				i_3_ = 934463075 * this.anInt64;
				i_4_ = this.anInt66 * 2127708255;
			}
		} else if (itemStyleOverride != null && itemStyleOverride.anIntArray109 != null) {
			i_2_ = itemStyleOverride.anIntArray109[0];
			i_3_ = itemStyleOverride.anIntArray109[1];
			i_4_ = itemStyleOverride.anIntArray109[2];
		} else {
			i_2_ = this.anInt61 * -432773855;
			i_3_ = -1888064087 * this.anInt62;
			i_4_ = this.anInt32 * 1346281605;
		}
		if (-1 == i_2_)
			return true;
		boolean bool_5_ = true;
		if (!this.aClass9_83.aClass446_140.method5350(i_2_, 0, 1414288655))
			bool_5_ = false;
		if (i_3_ != -1 && !this.aClass9_83.aClass446_140.method5350(i_3_, 0, 87629188))
			bool_5_ = false;
		if (-1 != i_4_ && !this.aClass9_83.aClass446_140.method5350(i_4_, 0, -1819483734))
			bool_5_ = false;
		return bool_5_;
	}

	@Override
	public void method58(ByteBuffer class528_sub42, byte i) {
		for (;;) {
			int i_6_ = class528_sub42.readUnsignedByte((byte) 33);
			if (0 == i_6_)
				break;
			method512(class528_sub42, i_6_, (short) 13242);
		}
	}

	void method512(ByteBuffer class528_sub42, int i, short i_7_) {
		if (1 == i)
			this.anInt35 = class528_sub42.method9645((short) -1032) * -1299551003;
		else if (i == 2)
			aString36 = class528_sub42.readString(1217975544);
		else if (i == 4)
			anInt68 = class528_sub42.readUnsignedShort(-1630192795) * -75131021;
		else if (i == 5)
			anInt47 = class528_sub42.readUnsignedShort(-1953954527) * 1435410949;
		else if (6 == i)
			anInt46 = class528_sub42.readUnsignedShort(672913498) * -1928542689;
		else if (i == 7) {
			anInt44 = class528_sub42.readUnsignedShort(58182643) * -574756925;
			if (-199311125 * anInt44 > 32767)
				anInt44 -= -406650880;
		} else if (i == 8) {
			anInt41 = class528_sub42.readUnsignedShort(182294585) * -1016488727;
			if (-2114913447 * anInt41 > 32767)
				anInt41 -= -1662451712;
		} else if (11 == i)
			anInt43 = 414428527;
		else if (12 == i)
			anInt52 = class528_sub42.readInt(-1501306513) * 1390574953;
		else if (13 == i)
			anInt48 = class528_sub42.readUnsignedByte((byte) 53) * 1622914759;
		else if (i == 14)
			anInt59 = class528_sub42.readUnsignedByte((byte) 78) * 861170695;
		else if (16 == i)
			aBool53 = true;
		else if (18 == i)
			anInt80 = class528_sub42.readUnsignedShort(-1291768780) * 1544922089;
		else if (23 == i)
			this.anInt61 = class528_sub42.method9645((short) -20010) * 598826721;
		else if (24 == i)
			this.anInt62 = class528_sub42.method9645((short) -25050) * 226657945;
		else if (25 == i)
			this.anInt63 = class528_sub42.method9645((short) -5091) * -729563609;
		else if (26 == i)
			this.anInt64 = class528_sub42.method9645((short) -1396) * 761391947;
		else if (27 == i)
			anInt60 = class528_sub42.readUnsignedByte((byte) 11) * 256848201;
		else if (i >= 30 && i < 35)
			aStringArray90[i - 30] = class528_sub42.readString(814308510);
		else if (i >= 35 && i < 40)
			aStringArray55[i - 35] = class528_sub42.readString(804331811);
		else if (40 == i) {
			int i_8_ = class528_sub42.readUnsignedByte((byte) 113);
			this.aShortArray37 = new short[i_8_];
			this.aShortArray38 = new short[i_8_];
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
				this.aShortArray37[i_9_] = (short) class528_sub42.readUnsignedShort(-870653742);
				this.aShortArray38[i_9_] = (short) class528_sub42.readUnsignedShort(823242800);
			}
		} else if (i == 41) {
			int i_10_ = class528_sub42.readUnsignedByte((byte) 58);
			this.aShortArray40 = new short[i_10_];
			this.aShortArray97 = new short[i_10_];
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
				this.aShortArray40[i_11_] = (short) class528_sub42.readUnsignedShort(291977969);
				this.aShortArray97[i_11_] = (short) class528_sub42.readUnsignedShort(-77838606);
			}
		} else if (42 == i) {
			int i_12_ = class528_sub42.readUnsignedByte((byte) 57);
			this.aByteArray77 = new byte[i_12_];
			for (int i_13_ = 0; i_13_ < i_12_; i_13_++)
				this.aByteArray77[i_13_] = class528_sub42.method9627(-1844887820);
		} else if (i == 43) {
			anInt101 = class528_sub42.readInt(-916791914) * -1500583935;
			aBool89 = true;
		} else if (i == 44) {
			int i_14_ = class528_sub42.readUnsignedShort(-793043348);
			int i_15_ = 0;
			for (int i_16_ = i_14_; i_16_ > 0; i_16_ >>= 1)
				i_15_++;
			this.aByteArray42 = new byte[i_15_];
			byte i_17_ = 0;
			for (int i_18_ = 0; i_18_ < i_15_; i_18_++) {
				if ((i_14_ & 1 << i_18_) > 0) {
					this.aByteArray42[i_18_] = i_17_;
					i_17_++;
				} else
					this.aByteArray42[i_18_] = (byte) -1;
			}
		} else if (i == 45) {
			int i_19_ = class528_sub42.readUnsignedShort(417655227);
			int i_20_ = 0;
			for (int i_21_ = i_19_; i_21_ > 0; i_21_ >>= 1)
				i_20_++;
			this.aByteArray45 = new byte[i_20_];
			byte i_22_ = 0;
			for (int i_23_ = 0; i_23_ < i_20_; i_23_++) {
				if ((i_19_ & 1 << i_23_) > 0) {
					this.aByteArray45[i_23_] = i_22_;
					i_22_++;
				} else
					this.aByteArray45[i_23_] = (byte) -1;
			}
		} else if (i == 65)
			aBool93 = true;
		else if (i == 78)
			this.anInt32 = class528_sub42.method9645((short) 11518) * 2093766733;
		else if (79 == i)
			this.anInt66 = class528_sub42.method9645((short) 9525) * -178250849;
		else if (90 == i)
			this.anInt73 = class528_sub42.method9645((short) 23806) * -1067216189;
		else if (91 == i)
			this.anInt75 = class528_sub42.method9645((short) 22632) * -806393459;
		else if (92 == i)
			this.anInt74 = class528_sub42.method9645((short) 17431) * -1269705061;
		else if (93 == i)
			this.anInt76 = class528_sub42.method9645((short) 25233) * 1916271469;
		else if (94 == i)
			anInt34 = class528_sub42.readUnsignedShort(-429905327) * 386231609;
		else if (95 == i)
			anInt54 = class528_sub42.readUnsignedShort(-1903788167) * 164465569;
		else if (96 == i)
			anInt94 = class528_sub42.readUnsignedByte((byte) 28) * 19586133;
		else if (i == 97)
			anInt96 = class528_sub42.readUnsignedShort(-1443795947) * 345386207;
		else if (98 == i)
			anInt79 = class528_sub42.readUnsignedShort(676611874) * 390737093;
		else if (i >= 100 && i < 110) {
			if (this.anIntArray50 == null) {
				this.anIntArray50 = new int[10];
				this.anIntArray25 = new int[10];
			}
			this.anIntArray50[i - 100] = class528_sub42.readUnsignedShort(234083887);
			this.anIntArray25[i - 100] = class528_sub42.readUnsignedShort(-644389331);
		} else if (i == 110)
			this.anInt51 = class528_sub42.readUnsignedShort(761418220) * 2120037213;
		else if (111 == i)
			this.anInt100 = class528_sub42.readUnsignedShort(-1129234107) * 1348989261;
		else if (i == 112)
			this.anInt33 = class528_sub42.readUnsignedShort(-1136257704) * 1258258953;
		else if (113 == i)
			this.anInt86 = class528_sub42.method9627(-1906622712) * 1250442301;
		else if (114 == i)
			this.anInt91 = class528_sub42.method9627(-1798904793) * -1035235743;
		else if (i == 115)
			anInt69 = class528_sub42.readUnsignedByte((byte) 104) * -1201769435;
		else if (121 == i)
			this.anInt81 = class528_sub42.readUnsignedShort(-217448866) * -303767139;
		else if (122 == i)
			anInt82 = class528_sub42.readUnsignedShort(197207070) * 753998165;
		else if (i == 125) {
			this.anInt67 = (class528_sub42.method9627(-1151432666) << 2) * 1350458353;
			this.anInt87 = (class528_sub42.method9627(-1872873737) << 2) * 1336314871;
			this.anInt71 = (class528_sub42.method9627(-1038266357) << 2) * 1183781359;
		} else if (i == 126) {
			this.anInt78 = (class528_sub42.method9627(-1826398748) << 2) * 376619525;
			this.anInt88 = (class528_sub42.method9627(-1529078195) << 2) * -927972899;
			this.anInt72 = (class528_sub42.method9627(-1292338505) << 2) * 1975052935;
		} else if (127 == i || 128 == i || i == 129 || 130 == i) {
			class528_sub42.readUnsignedByte((byte) 83);
			class528_sub42.readUnsignedShort(-1968554575);
		} else if (i == 132) {
			int i_24_ = class528_sub42.readUnsignedByte((byte) 15);
			anIntArray70 = new int[i_24_];
			for (int i_25_ = 0; i_25_ < i_24_; i_25_++)
				anIntArray70[i_25_] = class528_sub42.readUnsignedShort(958423939);
		} else if (i == 134)
			anInt92 = class528_sub42.readUnsignedByte((byte) 36) * -1472478237;
		else if (139 == i)
			this.anInt98 = class528_sub42.readUnsignedShort(-995153477) * 1228269549;
		else if (i == 140)
			anInt99 = class528_sub42.readUnsignedShort(791023896) * -74740783;
		else if (i >= 142 && i < 147) {
			if (null == this.anIntArray56) {
				this.anIntArray56 = new int[6];
				Arrays.fill(this.anIntArray56, -1);
			}
			this.anIntArray56[i - 142] = class528_sub42.readUnsignedShort(79635740);
		} else if (i >= 150 && i < 155) {
			if (null == this.anIntArray57) {
				this.anIntArray57 = new int[5];
				Arrays.fill(this.anIntArray57, -1);
			}
			this.anIntArray57[i - 150] = class528_sub42.readUnsignedShort(-2141488028);
		} else if (i != 156) {
			if (i == 157)
				aBool102 = true;
			else if (161 == i)
				anInt39 = class528_sub42.readUnsignedShort(550741692) * 514621867;
			else if (i == 162)
				anInt84 = class528_sub42.readUnsignedShort(-488831187) * 1007190527;
			else if (163 == i)
				anInt49 = class528_sub42.readUnsignedShort(-1348560186) * -1944275249;
			else if (i == 164)
				this.aString85 = class528_sub42.readString(790906983);
			else if (165 == i)
				anInt43 = 828857054;
			else if (249 == i) {
				int i_26_ = class528_sub42.readUnsignedByte((byte) 61);
				if (this.aClass692_95 == null) {
					int i_27_ = Class327.method4259(i_26_, -2134279851);
					this.aClass692_95 = new Class692(i_27_);
				}
				for (int i_28_ = 0; i_28_ < i_26_; i_28_++) {
					boolean bool = class528_sub42.readUnsignedByte((byte) 78) == 1;
					int i_29_ = class528_sub42.readTriByte(-860361253);
					Node node;
					if (bool)
						node = new Class528_Sub31(class528_sub42.readString(1097747049));
					else
						node = new Class528_Sub17(class528_sub42.readInt(-1329808802));
					this.aClass692_95.method8142(node, i_29_);
				}
			}
		}
	}

	void method513(ItemType class3_30_, ItemType class3_31_, Class668 class668, byte i) {
		method526(Class21.aClass21_213, class3_30_, class3_31_, null, class668, -596178116);
	}

	void method514(ItemType class3_32_, ItemType class3_33_, Class668 class668, int i) {
		method526(Class21.aClass21_210, class3_32_, class3_33_, Class39.aClass39_349, class668, 114693529);
	}

	void method515(ItemType class3_34_, ItemType class3_35_, Class668 class668, int i) {
		method526(Class21.aClass21_212, class3_34_, class3_35_, Class39.aClass39_350, class668, -411031562);
	}

	public final Class157 method516(Class173 class173, int i, int i_36_, PlayerModel playerModel, Class690 class690,
			int i_37_, int i_38_, int i_39_, int i_40_, byte i_41_) {
		if (this.anIntArray50 != null && i_36_ > 1) {
			int i_42_ = -1;
			for (int i_43_ = 0; i_43_ < 10; i_43_++) {
				if (i_36_ >= this.anIntArray25[i_43_] && this.anIntArray25[i_43_] != 0)
					i_42_ = this.anIntArray50[i_43_];
			}
			if (-1 != i_42_)
				return (((ItemType) this.anInterface12_31.method63(i_42_, -1690753122)).method516(class173, i, 1,
						playerModel, class690, i_37_, i_38_, i_39_, i_40_, (byte) 74));
		}
		int i_44_ = i;
		if (null != class690)
			i_44_ |= class690.method8078(1944909029);
		Class157 class157;
		synchronized (this.aClass9_83.aClass186_141) {
			class157 = ((Class157) (this.aClass9_83.aClass186_141
					.method2727(this.anInt65 * -162727187 | 1967042207 * class173.anInt1985 << 29)));
		}
		if (null == class157 || class173.method2245(class157.method1874(), i_44_) != 0) {
			if (class157 != null)
				i_44_ = class173.method2366(i_44_, class157.method1874());
			int i_45_ = i_44_;
			if (null != this.aShortArray40)
				i_45_ |= 0x8000;
			if (null != this.aShortArray37 || null != playerModel)
				i_45_ |= 0x4000;
			if (128 != this.anInt51 * 809482485)
				i_45_ |= 0x1;
			if (373075845 * this.anInt100 != 128)
				i_45_ |= 0x2;
			if (128 != -1420907463 * this.anInt33)
				i_45_ |= 0x4;
			Class177 class177 = Class177.method2590((this.aClass9_83.aClass446_140), -1894682387 * this.anInt35, 0);
			if (null == class177)
				return null;
			if (class177.anInt2035 < 13)
				class177.method2585(2);
			class157 = class173.method2244(class177, i_45_, (this.aClass9_83.anInt146) * -2035560309,
					(64 + this.anInt86 * -893043947), 850 + (1991502885 * this.anInt91));
			if (128 != 809482485 * this.anInt51 || this.anInt100 * 373075845 != 128
					|| -1420907463 * this.anInt33 != 128)
				class157.method2011(this.anInt51 * 809482485, this.anInt100 * 373075845, -1420907463 * this.anInt33);
			if (this.aShortArray37 != null) {
				for (int i_46_ = 0; i_46_ < this.aShortArray37.length; i_46_++) {
					if (null != this.aByteArray77 && i_46_ < this.aByteArray77.length)
						class157.method1914((this.aShortArray37[i_46_]),
								aShortArray30[(this.aByteArray77[i_46_]) & 0xff]);
					else
						class157.method1914((this.aShortArray37[i_46_]), (this.aShortArray38[i_46_]));
				}
			}
			if (null != this.aShortArray40) {
				for (int i_47_ = 0; i_47_ < this.aShortArray40.length; i_47_++)
					class157.method1916(this.aShortArray40[i_47_], this.aShortArray97[i_47_]);
			}
			if (playerModel != null) {
				for (int i_48_ = 0; i_48_ < 10; i_48_++) {
					for (int i_49_ = 0; i_49_ < Class590.aShortArrayArray7735[i_48_].length; i_49_++) {
						if (playerModel.anIntArray7965[i_48_] < (Class73.aShortArrayArrayArray782[i_48_][i_49_]).length)
							class157.method1914(Class590.aShortArrayArray7735[i_48_][i_49_],
									(Class73.aShortArrayArrayArray782[i_48_][i_49_][playerModel.anIntArray7965[i_48_]]));
					}
				}
				for (int i_50_ = 0; i_50_ < 10; i_50_++) {
					for (int i_51_ = 0; i_51_ < Class439.aShortArrayArray4897[i_50_].length; i_51_++) {
						if (playerModel.anIntArray7957[i_50_] < (Class101.aShortArrayArrayArray1287[i_50_][i_51_]).length)
							class157.method1916(Class439.aShortArrayArray4897[i_50_][i_51_],
									(Class101.aShortArrayArrayArray1287[i_50_][i_51_][playerModel.anIntArray7957[i_50_]]));
					}
				}
			}
			class157.method1873(i_44_);
			synchronized (this.aClass9_83.aClass186_141) {
				this.aClass9_83.aClass186_141.method2729(class157,
						this.anInt65 * -162727187 | class173.anInt1985 * 1967042207 << 29);
			}
		}
		if (null != class690 || i_40_ != 0) {
			class157 = class157.method1951((byte) 1, i_44_, true);
			if (class690 != null)
				class690.method8079(class157, 0, 309866568);
			if (i_40_ != 0)
				class157.method1917(i_37_, i_38_, i_39_, i_40_);
		}
		class157.method1873(i);
		return class157;
	}

	int[] method517(Class173 class173, Class173 class173_52_, int i, int i_53_, int i_54_, boolean bool, int i_55_,
			Class172 class172, PlayerModel playerModel, Class622 class622, byte i_56_) {
		Class177 class177 = Class177.method2590((this.aClass9_83.aClass446_140), this.anInt35 * -1894682387, 0);
		if (class177 == null)
			return null;
		if (class177.anInt2035 < 13)
			class177.method2585(2);
		if (null != this.aShortArray37) {
			for (int i_57_ = 0; i_57_ < this.aShortArray37.length; i_57_++) {
				if (null != this.aByteArray77 && i_57_ < this.aByteArray77.length)
					class177.method2584(this.aShortArray37[i_57_], (aShortArray30[(this.aByteArray77[i_57_] & 0xff)]));
				else
					class177.method2584(this.aShortArray37[i_57_], this.aShortArray38[i_57_]);
			}
		}
		if (null != this.aShortArray40) {
			for (int i_58_ = 0; i_58_ < this.aShortArray40.length; i_58_++)
				class177.method2583(this.aShortArray40[i_58_], this.aShortArray97[i_58_]);
		}
		if (null != playerModel) {
			for (int i_59_ = 0; i_59_ < 10; i_59_++) {
				for (int i_60_ = 0; i_60_ < Class590.aShortArrayArray7735[i_59_].length; i_60_++) {
					if (playerModel.anIntArray7965[i_59_] < (Class73.aShortArrayArrayArray782[i_59_][i_60_]).length)
						class177.method2584((Class590.aShortArrayArray7735[i_59_][i_60_]),
								(Class73.aShortArrayArrayArray782[i_59_][i_60_][(playerModel.anIntArray7965[i_59_])]));
				}
			}
			for (int i_61_ = 0; i_61_ < 10; i_61_++) {
				for (int i_62_ = 0; i_62_ < Class439.aShortArrayArray4897[i_61_].length; i_62_++) {
					if (playerModel.anIntArray7957[i_61_] < (Class101.aShortArrayArrayArray1287[i_61_][i_62_]).length)
						class177.method2583((Class439.aShortArrayArray4897[i_61_][i_62_]),
								(Class101.aShortArrayArrayArray1287[i_61_][i_62_][(playerModel.anIntArray7957[i_61_])]));
				}
			}
		}
		int i_63_ = 2048;
		boolean bool_64_ = false;
		if (809482485 * this.anInt51 != 128 || this.anInt100 * 373075845 != 128 || 128 != -1420907463 * this.anInt33) {
			bool_64_ = true;
			i_63_ |= 0x7;
		}
		Class157 class157 = class173.method2244(class177, i_63_, 64, 64 + -893043947 * this.anInt86,
				1991502885 * this.anInt91 + 768);
		if (!class157.method1950())
			return null;
		if (bool_64_)
			class157.method2011(this.anInt51 * 809482485, this.anInt100 * 373075845, -1420907463 * this.anInt33);
		Class151 class151 = null;
		if (-1 != 282882573 * anInt79) {
			class151 = this.aClass9_83.method590(class173, class173_52_, 2034274079 * anInt96, 10, 1, 0, true, true, 0,
					class172, playerModel, class622, (this.anInterface12_31), -55776884);
			if (null == class151)
				return null;
		} else if (265690109 * anInt82 != -1) {
			class151 = (this.aClass9_83.method590(class173, class173_52_, this.anInt81 * 1740876981, i, i_53_, i_54_,
					false, true, 0, class172, playerModel, class622, this.anInterface12_31, -668593324));
			if (null == class151)
				return null;
		} else if (-1 != anInt99 * 695119153) {
			class151 = (this.aClass9_83.method590(class173, class173_52_, 1693617637 * this.anInt98, i, i_53_, i_54_,
					false, true, 0, class172, playerModel, class622, this.anInterface12_31, -239304910));
			if (class151 == null)
				return null;
		} else if (-1 != 1509129727 * anInt84) {
			class151 = this.aClass9_83.method590(class173, class173_52_, anInt39 * 1513779459, 10, 1, 0, true, true, 0,
					class172, playerModel, class622, (this.anInterface12_31), 478072432);
			if (null == class151)
				return null;
		}
		int i_65_;
		if (bool)
			i_65_ = (int) (-1104255557 * anInt68 * 1.5) << 2;
		else if (i_53_ == 2)
			i_65_ = (int) (1.04 * (-1104255557 * anInt68)) << 2;
		else
			i_65_ = -1104255557 * anInt68 << 2;
		Class418 class418 = class173.method2187();
		Class418 class418_66_ = class173.method2241();
		class418_66_.method4984(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F,
				class173.method2403((byte) -88).method2074(), class173.method2403((byte) -3).method2070());
		class173.method2252(class418_66_);
		class173.method2275(0, 0, class173.method2403((byte) -9).method2074(),
				class173.method2403((byte) -107).method2070());
		Class433 class433 = new Class433();
		class173.method2465(class433);
		class173.method2477(0.95F + (float) (Math.random() / 10.0));
		class173.method2160(16777215, 0.95F + (float) (Math.random() / 10.0), 0.95F + (float) (Math.random() / 10.0),
				-50.0F, -10.0F, -50.0F);
		Class433 class433_67_ = class173.method2479();
		class433_67_.method5224(0.0F, 0.0F, 1.0F, Class417.method4970(-(anInt54 * 782702689) << 3));
		class433_67_.method5256(0.0F, 1.0F, 0.0F, Class417.method4970(432354783 * anInt46 << 3));
		class433_67_.method5252(anInt44 * -199311125 << 2,
				(((Class417.anIntArray4766[anInt47 * -1802446131 << 3]) * i_65_) >> 14) - class157.method2018() / 2
						+ (anInt41 * -2114913447 << 2),
				((i_65_ * (Class417.anIntArray4767[anInt47 * -1802446131 << 3])) >> 14) + (-2114913447 * anInt41 << 2));
		class433_67_.method5256(1.0F, 0.0F, 0.0F, Class417.method4970(anInt47 * -1802446131 << 3));
		class173.method2204(0, 0, 36, 32);
		class173.method2268(2, 0);
		class173.method2216(0, 0, 36, 32, 0, 0);
		class173.method2549(0, -1, 0);
		class157.method1897(class433_67_, null, 1);
		class173.method2252(class418);
		int[] is = class173.method2208(0, 0, 36, 32);
		if (i_53_ >= 1) {
			is = method518(is, -16777214, -976790452);
			if (i_53_ >= 2)
				is = method518(is, -1, -876230112);
		}
		if (i_54_ != 0)
			method525(is, i_54_, -327897038);
		if (265690109 * anInt82 != -1)
			class151.method1773(0, 0);
		else if (-1 != 695119153 * anInt99)
			class151.method1773(0, 0);
		class173.method2418(is, 0, 36, 36, 32, 20841808).method1773(0, 0);
		if (anInt79 * 282882573 != -1)
			class151.method1773(0, 0);
		if (anInt84 * 1509129727 != -1)
			class151.method1773(0, 0);
		if (i_55_ == 1 || 2 == i_55_ && (1 == -2057416305 * anInt43 || i != 1) && i != -1)
			class172.method2120(Class244.method3390(i, ((this.aClass9_83).aClass668_144), class622, -1825035387), 0, 9,
					-256, -16777215, (byte) 116);
		is = class173.method2208(0, 0, 36, 32);
		for (int i_68_ = 0; i_68_ < is.length; i_68_++) {
			if (0 == (is[i_68_] & 0xffffff))
				is[i_68_] = 0;
			else
				is[i_68_] |= ~0xffffff;
		}
		return is;
	}

	int[] method518(int[] is, int i, int i_69_) {
		int[] is_70_ = new int[1152];
		int i_71_ = 0;
		for (int i_72_ = 0; i_72_ < 32; i_72_++) {
			for (int i_73_ = 0; i_73_ < 36; i_73_++) {
				int i_74_ = is[i_71_];
				if (i_74_ == 0) {
					if (i_73_ > 0 && 0 != is[i_71_ - 1])
						i_74_ = i;
					else if (i_72_ > 0 && is[i_71_ - 36] != 0)
						i_74_ = i;
					else if (i_73_ < 35 && 0 != is[1 + i_71_])
						i_74_ = i;
					else if (i_72_ < 31 && is[i_71_ + 36] != 0)
						i_74_ = i;
				}
				is_70_[i_71_++] = i_74_;
			}
		}
		return is_70_;
	}

	public void method60(ByteBuffer class528_sub42) {
		for (;;) {
			int i = class528_sub42.readUnsignedByte((byte) 98);
			if (0 == i)
				break;
			method512(class528_sub42, i, (short) 16034);
		}
	}

	public final Class177 method519(boolean bool, ItemStyleOverride itemStyleOverride, int i) {
		int i_75_;
		int i_76_;
		int i_77_;
		if (bool) {
			if (itemStyleOverride != null && null != itemStyleOverride.anIntArray111) {
				i_75_ = itemStyleOverride.anIntArray111[0];
				i_76_ = itemStyleOverride.anIntArray111[1];
				i_77_ = itemStyleOverride.anIntArray111[2];
			} else {
				i_75_ = -861154921 * this.anInt63;
				i_76_ = 934463075 * this.anInt64;
				i_77_ = 2127708255 * this.anInt66;
			}
		} else if (itemStyleOverride != null && null != itemStyleOverride.anIntArray109) {
			i_75_ = itemStyleOverride.anIntArray109[0];
			i_76_ = itemStyleOverride.anIntArray109[1];
			i_77_ = itemStyleOverride.anIntArray109[2];
		} else {
			i_75_ = -432773855 * this.anInt61;
			i_76_ = -1888064087 * this.anInt62;
			i_77_ = this.anInt32 * 1346281605;
		}
		if (i_75_ == -1)
			return null;
		Class177 class177 = Class177.method2590((this.aClass9_83.aClass446_140), i_75_, 0);
		if (null == class177)
			return null;
		if (class177.anInt2035 < 13)
			class177.method2585(2);
		if (-1 != i_76_) {
			Class177 class177_78_ = Class177.method2590((this.aClass9_83.aClass446_140), i_76_, 0);
			if (class177_78_.anInt2035 < 13)
				class177_78_.method2585(2);
			if (i_77_ != -1) {
				Class177 class177_79_ = Class177.method2590((this.aClass9_83.aClass446_140), i_77_, 0);
				if (class177_79_.anInt2035 < 13)
					class177_79_.method2585(2);
				Class177[] class177s = { class177, class177_78_, class177_79_ };
				class177 = new Class177(class177s, 3);
			} else {
				Class177[] class177s = { class177, class177_78_ };
				class177 = new Class177(class177s, 2);
			}
		}
		if (!bool && (0 != this.anInt67 * -691849967 || -1434081849 * this.anInt87 != 0
				|| -1758970609 * this.anInt71 != 0))
			class177.method2572(this.anInt67 * -691849967, this.anInt87 * -1434081849, -1758970609 * this.anInt71);
		if (bool && (this.anInt78 * -1425556787 != 0 || 0 != -872276363 * this.anInt88
				|| 0 != -1029457097 * this.anInt72))
			class177.method2572(-1425556787 * this.anInt78, -872276363 * this.anInt88, this.anInt72 * -1029457097);
		if (null != this.aShortArray37) {
			short[] is;
			if (itemStyleOverride != null && null != itemStyleOverride.aShortArray114)
				is = itemStyleOverride.aShortArray114;
			else
				is = this.aShortArray38;
			for (int i_80_ = 0; i_80_ < this.aShortArray37.length; i_80_++)
				class177.method2584(this.aShortArray37[i_80_], is[i_80_]);
		}
		if (null != this.aShortArray40) {
			short[] is;
			if (null != itemStyleOverride && itemStyleOverride.aShortArray115 != null)
				is = itemStyleOverride.aShortArray115;
			else
				is = this.aShortArray97;
			for (int i_81_ = 0; i_81_ < this.aShortArray40.length; i_81_++)
				class177.method2583(this.aShortArray40[i_81_], is[i_81_]);
		}
		return class177;
	}

	public final boolean method520(boolean bool, ItemStyleOverride itemStyleOverride, byte i) {
		int i_82_;
		int i_83_;
		if (bool) {
			if (null != itemStyleOverride && itemStyleOverride.anIntArray105 != null) {
				i_82_ = itemStyleOverride.anIntArray105[0];
				i_83_ = itemStyleOverride.anIntArray105[1];
			} else {
				i_82_ = 1812660549 * this.anInt75;
				i_83_ = this.anInt76 * 294798949;
			}
		} else if (null != itemStyleOverride && null != itemStyleOverride.anIntArray112) {
			i_82_ = itemStyleOverride.anIntArray112[0];
			i_83_ = itemStyleOverride.anIntArray112[1];
		} else {
			i_82_ = this.anInt73 * -129749525;
			i_83_ = this.anInt74 * 31399827;
		}
		if (-1 == i_82_)
			return true;
		boolean bool_84_ = true;
		if (!this.aClass9_83.aClass446_140.method5350(i_82_, 0, 1240139534))
			bool_84_ = false;
		if (-1 != i_83_ && !this.aClass9_83.aClass446_140.method5350(i_83_, 0, 728840179))
			bool_84_ = false;
		return bool_84_;
	}

	public final Class177 method521(boolean bool, ItemStyleOverride itemStyleOverride, byte i) {
		int i_85_;
		int i_86_;
		if (bool) {
			if (null != itemStyleOverride && null != itemStyleOverride.anIntArray105) {
				i_85_ = itemStyleOverride.anIntArray105[0];
				i_86_ = itemStyleOverride.anIntArray105[1];
			} else {
				i_85_ = 1812660549 * this.anInt75;
				i_86_ = this.anInt76 * 294798949;
			}
		} else if (null != itemStyleOverride && null != itemStyleOverride.anIntArray112) {
			i_85_ = itemStyleOverride.anIntArray112[0];
			i_86_ = itemStyleOverride.anIntArray112[1];
		} else {
			i_85_ = -129749525 * this.anInt73;
			i_86_ = this.anInt74 * 31399827;
		}
		if (-1 == i_85_)
			return null;
		Class177 class177 = Class177.method2590((this.aClass9_83.aClass446_140), i_85_, 0);
		if (class177.anInt2035 < 13)
			class177.method2585(2);
		if (i_86_ != -1) {
			Class177 class177_87_ = Class177.method2590((this.aClass9_83.aClass446_140), i_86_, 0);
			if (class177_87_.anInt2035 < 13)
				class177_87_.method2585(2);
			Class177[] class177s = { class177, class177_87_ };
			class177 = new Class177(class177s, 2);
		}
		if (null != this.aShortArray37) {
			short[] is;
			if (itemStyleOverride != null && itemStyleOverride.aShortArray114 != null)
				is = itemStyleOverride.aShortArray114;
			else
				is = this.aShortArray38;
			for (int i_88_ = 0; i_88_ < this.aShortArray37.length; i_88_++)
				class177.method2584(this.aShortArray37[i_88_], is[i_88_]);
		}
		if (null != this.aShortArray40) {
			short[] is;
			if (itemStyleOverride != null && null != itemStyleOverride.aShortArray115)
				is = itemStyleOverride.aShortArray115;
			else
				is = this.aShortArray97;
			for (int i_89_ = 0; i_89_ < this.aShortArray40.length; i_89_++)
				class177.method2583(this.aShortArray40[i_89_], is[i_89_]);
		}
		return class177;
	}

	public int method522(int i, int i_90_, int i_91_) {
		if (this.aClass692_95 == null)
			return i_90_;
		Class528_Sub17 class528_sub17 = ((Class528_Sub17) this.aClass692_95.method8137(i));
		if (null == class528_sub17)
			return i_90_;
		return class528_sub17.anInt10388 * 870949851;
	}

	public String method523(int i, String string, int i_92_) {
		if (null == this.aClass692_95)
			return string;
		Class528_Sub31 class528_sub31 = ((Class528_Sub31) this.aClass692_95.method8137(i));
		if (null == class528_sub31)
			return string;
		return (String) class528_sub31.anObject10468;
	}

	public int method524(int i, int i_93_) {
		if (this.anIntArray56 == null)
			return -1;
		return this.anIntArray56[i];
	}

	public void method57(ByteBuffer class528_sub42) {
		for (;;) {
			int i = class528_sub42.readUnsignedByte((byte) 111);
			if (0 == i)
				break;
			method512(class528_sub42, i, (short) 14817);
		}
	}

	ItemType(int i, Interface12 interface12, Class9 class9) {
		anInt47 = 0;
		anInt46 = 0;
		anInt54 = 0;
		anInt44 = 0;
		anInt41 = 0;
		anInt43 = 0;
		anInt80 = -1544922089;
		anInt52 = 1390574953;
		aBool53 = false;
		anInt48 = -1622914759;
		anInt59 = -861170695;
		anInt60 = -256848201;
		this.anInt61 = -598826721;
		this.anInt62 = -226657945;
		this.anInt63 = 729563609;
		this.anInt64 = -761391947;
		this.anInt32 = -2093766733;
		this.anInt66 = 178250849;
		this.anInt67 = 0;
		this.anInt78 = 0;
		this.anInt87 = 0;
		this.anInt88 = 0;
		this.anInt71 = 0;
		this.anInt72 = 0;
		this.anInt73 = 1067216189;
		this.anInt74 = 1269705061;
		this.anInt75 = 806393459;
		this.anInt76 = -1916271469;
		anInt79 = -390737093;
		anInt96 = -345386207;
		this.anInt81 = 303767139;
		anInt82 = -753998165;
		anInt39 = -514621867;
		anInt84 = -1007190527;
		this.aString85 = "null";
		anInt49 = 0;
		this.anInt51 = 781823616;
		this.anInt100 = 871933568;
		this.anInt33 = 2143356032;
		this.anInt86 = 0;
		this.anInt91 = 0;
		anInt69 = 0;
		aBool93 = false;
		anInt94 = 0;
		anInt92 = 0;
		this.anInt98 = -1228269549;
		anInt99 = 74740783;
		aBool89 = false;
		aBool102 = false;
		this.anInt65 = i * 540963557;
		this.anInterface12_31 = interface12;
		this.aClass9_83 = class9;
		aStringArray90 = this.aClass9_83.aStringArray138.clone();
		aStringArray55 = this.aClass9_83.aStringArray147.clone();
	}

	void method525(int[] is, int i, int i_94_) {
		for (int i_95_ = 31; i_95_ > 0; i_95_--) {
			int i_96_ = i_95_ * 36;
			for (int i_97_ = 35; i_97_ > 0; i_97_--) {
				if (0 == is[i_97_ + i_96_] && is[i_97_ + i_96_ - 1 - 36] != 0)
					is[i_97_ + i_96_] = i;
			}
		}
	}

	public void method59() {
		if (anInt79 * 282882573 != -1)
			method513((ItemType) this.anInterface12_31.method63(anInt79 * 282882573, -886390830),
					(ItemType) this.anInterface12_31.method63(anInt96 * 2034274079, 863523710),
					this.aClass9_83.aClass668_144, (byte) -5);
		else if (-1 != 265690109 * anInt82)
			method514((ItemType) this.anInterface12_31.method63(anInt82 * 265690109, 1258680544),
					(ItemType) (this.anInterface12_31.method63(this.anInt81 * 1740876981, -906995124)),
					this.aClass9_83.aClass668_144, 909312868);
		else if (anInt99 * 695119153 != -1)
			method515((ItemType) this.anInterface12_31.method63(695119153 * anInt99, -747810599),
					(ItemType) (this.anInterface12_31.method63(this.anInt98 * 1693617637, -1694193040)),
					this.aClass9_83.aClass668_144, 1185653807);
		else if (1509129727 * anInt84 != -1)
			method510((ItemType) this.anInterface12_31.method63(1509129727 * anInt84, 1141310354),
					(ItemType) this.anInterface12_31.method63(anInt39 * 1513779459, -2206223),
					this.aClass9_83.aClass668_144, 1496940118);
		if (!this.aClass9_83.aBool145 && aBool53) {
			anInt69 = 0;
			aStringArray90 = this.aClass9_83.aStringArray138;
			aStringArray55 = this.aClass9_83.aStringArray147;
			aBool93 = false;
			anIntArray70 = null;
			if (null != this.aClass692_95) {
				boolean bool = false;
				for (Node node = this.aClass692_95.method8146(-1942855841); node != null; node = this.aClass692_95
						.method8138(1393200484)) {
					Class79 class79 = (Class79) (this.aClass9_83.anInterface12_139
							.method63((int) (node.aLong7107 * -4849232331708333273L), 1445835256));
					if (class79.aBool812)
						node.method6443(-139612476);
					else
						bool = true;
				}
				if (!bool)
					this.aClass692_95 = null;
			}
		}
	}

	void method526(Class21 class21, ItemType class3_98_, ItemType class3_99_, Class39 class39, Class668 class668,
			int i) {
		this.anInt35 = class3_98_.anInt35 * 1;
		anInt68 = class3_98_.anInt68 * 1;
		anInt47 = 1 * class3_98_.anInt47;
		anInt46 = 1 * class3_98_.anInt46;
		anInt54 = class3_98_.anInt54 * 1;
		anInt44 = class3_98_.anInt44 * 1;
		anInt41 = 1 * class3_98_.anInt41;
		ItemType class3_100_ = class21 == Class21.aClass21_213 ? class3_98_ : class3_99_;
		this.aShortArray37 = class3_100_.aShortArray37;
		this.aShortArray38 = class3_100_.aShortArray38;
		this.aByteArray77 = class3_100_.aByteArray77;
		this.aShortArray40 = class3_100_.aShortArray40;
		this.aShortArray97 = class3_100_.aShortArray97;
		aString36 = class3_99_.aString36;
		aBool53 = class3_99_.aBool53;
		if (Class21.aClass21_213 == class21) {
			anInt52 = class3_99_.anInt52 * 1;
			anInt43 = 414428527;
		} else if (Class21.aClass21_211 == class21) {
			aString36 = class3_99_.aString85;
			anInt52 = (int) Math.floor(1313202905 * class3_99_.anInt52 / (class3_99_.anInt49 * 993693743)) * 1390574953;
			anInt43 = 414428527;
			aBool93 = class3_99_.aBool93;
			anInt34 = class3_98_.anInt34 * 1;
			this.anIntArray56 = class3_98_.anIntArray56;
			this.anIntArray57 = class3_98_.anIntArray57;
			aStringArray55 = new String[5];
			aStringArray55[0] = Class39.aClass39_353.method807(class668, (byte) 102);
			aStringArray55[4] = class39.method807(class668, (byte) 102);
		} else {
			anInt52 = 0;
			anInt43 = class3_99_.anInt43 * 1;
			anInt48 = 1 * class3_99_.anInt48;
			anInt59 = class3_99_.anInt59 * 1;
			anInt60 = class3_99_.anInt60 * 1;
			this.anInt61 = class3_99_.anInt61 * 1;
			this.anInt62 = 1 * class3_99_.anInt62;
			this.anInt32 = 1 * class3_99_.anInt32;
			this.anInt63 = 1 * class3_99_.anInt63;
			this.anInt64 = 1 * class3_99_.anInt64;
			this.anInt66 = class3_99_.anInt66 * 1;
			this.anInt67 = 1 * class3_99_.anInt67;
			this.anInt78 = class3_99_.anInt78 * 1;
			this.anInt87 = class3_99_.anInt87 * 1;
			this.anInt88 = class3_99_.anInt88 * 1;
			this.anInt71 = 1 * class3_99_.anInt71;
			this.anInt72 = class3_99_.anInt72 * 1;
			this.anInt73 = class3_99_.anInt73 * 1;
			this.anInt74 = 1 * class3_99_.anInt74;
			this.anInt75 = class3_99_.anInt75 * 1;
			this.anInt76 = class3_99_.anInt76 * 1;
			anInt34 = class3_99_.anInt34 * 1;
			anInt69 = class3_99_.anInt69 * 1;
			aStringArray90 = class3_99_.aStringArray90;
			this.aClass692_95 = class3_99_.aClass692_95;
			aStringArray55 = new String[5];
			if (class3_99_.aStringArray55 != null) {
				for (int i_101_ = 0; i_101_ < 4; i_101_++)
					aStringArray55[i_101_] = class3_99_.aStringArray55[i_101_];
			}
			aStringArray55[4] = class39.method807(class668, (byte) 102);
		}
	}

	public ItemType method527(int i, int i_102_) {
		if (null != this.anIntArray50 && i > 1) {
			int i_103_ = -1;
			for (int i_104_ = 0; i_104_ < 10; i_104_++) {
				if (i >= this.anIntArray25[i_104_] && 0 != this.anIntArray25[i_104_])
					i_103_ = this.anIntArray50[i_104_];
			}
			if (i_103_ != -1)
				return ((ItemType) this.anInterface12_31.method63(i_103_, 1347574734));
		}
		return this;
	}

	public int method528(int i, byte i_105_) {
		if (this.anIntArray57 == null)
			return -1;
		return this.anIntArray57[i];
	}

	@Override
	public void method61(int i) {
		if (anInt79 * 282882573 != -1)
			method513((ItemType) this.anInterface12_31.method63(anInt79 * 282882573, -1741064760),
					(ItemType) this.anInterface12_31.method63(anInt96 * 2034274079, 86307423),
					this.aClass9_83.aClass668_144, (byte) -44);
		else if (-1 != 265690109 * anInt82)
			method514((ItemType) this.anInterface12_31.method63(anInt82 * 265690109, -1884498136),
					(ItemType) (this.anInterface12_31.method63(this.anInt81 * 1740876981, -1028462489)),
					this.aClass9_83.aClass668_144, -125133967);
		else if (anInt99 * 695119153 != -1)
			method515((ItemType) this.anInterface12_31.method63(695119153 * anInt99, 291769878),
					(ItemType) (this.anInterface12_31.method63(this.anInt98 * 1693617637, -1422793355)),
					this.aClass9_83.aClass668_144, 1185653807);
		else if (1509129727 * anInt84 != -1)
			method510((ItemType) this.anInterface12_31.method63(1509129727 * anInt84, 781140986),
					(ItemType) this.anInterface12_31.method63(anInt39 * 1513779459, -426836570),
					this.aClass9_83.aClass668_144, 717649561);
		if (!this.aClass9_83.aBool145 && aBool53) {
			anInt69 = 0;
			aStringArray90 = this.aClass9_83.aStringArray138;
			aStringArray55 = this.aClass9_83.aStringArray147;
			aBool93 = false;
			anIntArray70 = null;
			if (null != this.aClass692_95) {
				boolean bool = false;
				for (Node node = this.aClass692_95.method8146(-1942855841); node != null; node = this.aClass692_95
						.method8138(2127269922)) {
					Class79 class79 = (Class79) (this.aClass9_83.anInterface12_139
							.method63((int) (node.aLong7107 * -4849232331708333273L), -1317872132));
					if (class79.aBool812)
						node.method6443(232985520);
					else
						bool = true;
				}
				if (!bool)
					this.aClass692_95 = null;
			}
		}
	}

	public int method529(int i, int i_106_) {
		if (this.aClass692_95 == null)
			return i_106_;
		Class528_Sub17 class528_sub17 = ((Class528_Sub17) this.aClass692_95.method8137(i));
		if (null == class528_sub17)
			return i_106_;
		return class528_sub17.anInt10388 * 870949851;
	}

	public int method530(int i, int i_107_) {
		if (this.aClass692_95 == null)
			return i_107_;
		Class528_Sub17 class528_sub17 = ((Class528_Sub17) this.aClass692_95.method8137(i));
		if (null == class528_sub17)
			return i_107_;
		return class528_sub17.anInt10388 * 870949851;
	}
}
