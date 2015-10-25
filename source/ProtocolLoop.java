
/* ProtocolLoop - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.URL;

public class ProtocolLoop {
	static void method1047() {
		/* empty */
	}

	static void method1048() {
		/* empty */
	}

	ProtocolLoop() throws Throwable {
		throw new Error();
	}

	static final void method1053(Class229 class229, Class648 class648, byte i) {
		int i_0_ = (class648.anIntArray8394[(class648.anInt8395 -= 1239022665) * 717927929]);
		int i_1_ = ((class648.anIntArray8394[(class648.anInt8395 -= 1239022665) * 717927929]) - 1);
		int i_2_ = i_1_;
		if (6 != 292816267 * class229.anInt2418 && class229.anInt2418 * 292816267 != 2)
			throw new RuntimeException("");
		Class299 class299 = ((Class299) Class21.aClass5_Sub8_214.method63(-1386163263 * class229.anInt2419,
				-1995165233));
		if (null == class229.aClass287_2479)
			class229.aClass287_2479 = new Class287(class299, class229.anInt2418 * 292816267 == 6);
		class229.aClass287_2479.aLong3154 = Class598.method7130(-1443563474) * 6725947522742831901L;
		if (null != class299.aByteArray3280) {
			if (i_1_ < 0 || i_1_ >= class299.aByteArray3280.length)
				throw new RuntimeException("");
			i_2_ = class299.aByteArray3280[i_1_];
		}
		if (class299.aShortArray3284 == null || i_2_ < 0 || i_2_ >= class299.aShortArray3284.length)
			throw new RuntimeException("");
		class229.aClass287_2479.aShortArray3156[i_2_] = (short) i_0_;
		Class39.method811(class229, 1435904523);
	}

	static final void method1054(Class648 class648, int i) {
		class648.anIntArray8394[(class648.anInt8395 += 1239022665) * 717927929 - 1] = Class54.anInt668 * 693748093;
	}

	static final void method1055(Class648 class648, int i) {
		class648.anInt8395 -= -1816921966;
		int i_3_ = (class648.anIntArray8394[717927929 * class648.anInt8395]);
		int i_4_ = (class648.anIntArray8394[class648.anInt8395 * 717927929 + 1]);
		if (Class108.myPlayer.model != null)
			Class108.myPlayer.model.method7271(i_3_, i_4_, 118792367);
	}

	static final void method1056(Class648 class648, int i) {
		int i_5_ = (class648.anIntArray8394[(class648.anInt8395 -= 1239022665) * 717927929]);
		Class229 class229 = Class623_Sub1.method9755(i_5_, (byte) 115);
		class648.anIntArray8394[(class648.anInt8395 += 1239022665) * 717927929 - 1] = class229.anInt2404 * -696699221;
	}

	public static void method1057(String string, int i, int i_6_) {
		if (Class12.aClass16_177 == null)
			Class12.aClass16_177 = new Class16();
		Class12.aClass16_177.aString194 = string;
		Class12.aClass16_177.anInt192 = 1068151373 * (i + 1099);
		Class12.aClass16_177.anInt193 = Class359.method4590(Class646.aClass665_8386, Class678.aClass678_8558,
				Class12.aClass16_177.anInt192 * 2027542149, 2028610886) * 1685978521;
		Class12.aClass16_177.anInt191 = Class610.method7268(Class646.aClass665_8386, Class678.aClass678_8558,
				Class12.aClass16_177.anInt192 * 2027542149, (byte) -57) * -792516699;
	}

	static boolean method1058(int i, byte i_7_) {
		return (44 == i || 45 == i || i == 46 || 47 == i || i == 48 || 49 == i || 50 == i || 51 == i || 52 == i
				|| 53 == i || 15 == i);
	}

	static final void method1059(byte i) {
		if (4 != Class54.stage * -111028825 && 107 != -111028825 * Class54.stage) {
			do {
				try {
					int i_8_;
					if (0 == Class54.anInt667 * 1877147777 && Class54.stage * -111028825 < 91)
						i_8_ = 500;
					else
						i_8_ = 2000;
					if (Class54.reconnecting && Class54.stage * -111028825 >= 66)
						i_8_ = 6000;
					if ((-1132112883 * Class54.anInt651 == 265 && 217 != -111028825 * Class54.stage
							&& 42 != -1852659257 * Class54.anInt669)
							|| (-1132112883 * Class54.anInt651 == 153 && 49 != 693748093 * Class54.anInt668
									&& 693748093 * Class54.anInt668 != 52))
						Class54.anInt666 += 1904786075;
					if (1142135699 * Class54.anInt666 > i_8_) {
						Class54.aClass109_624.method1382(86051457);
						if (Class54.anInt667 * 1877147777 < 3) {
							if (Class54.anInt651 * -1132112883 == 265)
								Class12.aClass16_176.method634(-294490131);
							else
								Class12.aClass16_177.method634(311509888);
							Class54.anInt666 = 0;
							Class54.anInt667 += 1123893121;
							Class54.stage = -374956199;
						} else {
							Class54.stage = -1245312932;
							Class471.method5815(-5, -2087605176);
							Class15.method633((short) 31955);
							break;
						}
					}
					if (Class54.stage * -111028825 == 15) {
						if (-1132112883 * Class54.anInt651 == 265)
							Class54.aClass109_624.method1381((Class439
									.method5301(Class12.aClass16_176.method639(2072197093), 15000, 2122479929)),
									Class12.aClass16_176.aString194, -1135204606);
						else
							Class54.aClass109_624.method1381((Class439
									.method5301(Class12.aClass16_177.method639(-170396326), 15000, 2122479929)),
									Class12.aClass16_177.aString194, -1206952000);
						Class54.aClass109_624.method1378((short) -8520);
						Class528_Sub34 class528_sub34 = Class528_Sub35.method9518(-1449171982);
						if (Class54.reconnecting) {
							class528_sub34.aClass528_Sub42_Sub2_10481
									.writeByte((HandshakeOpcode.aClass404_4587.anInt4590 * -257442419), (byte) -69);
							class528_sub34.aClass528_Sub42_Sub2_10481.method9717(0, (byte) -25);
							int i_9_ = ((class528_sub34.aClass528_Sub42_Sub2_10481.pointer) * -185904669);
							class528_sub34.aClass528_Sub42_Sub2_10481.writeInt(857, 2099543988);
							class528_sub34.aClass528_Sub42_Sub2_10481.writeInt(1, 2038524586);
							if (265 == -1132112883 * Class54.anInt651)
								class528_sub34.aClass528_Sub42_Sub2_10481
										.writeByte((17 == 175711435 * client.anInt10876 ? 1 : 0), (byte) 27);
							ByteBuffer class528_sub42 = Class631.method7548((byte) 1);
							Class54.method958(class528_sub42, Class54.anInt631 * 1871118701);
							Class242.aLong2723 = (Class54.anInt631 * 3149817285601625021L);
							class528_sub42.writeByte((1871118701 * Class54.anInt631), (byte) -52);
							class528_sub42.writeByte(Class378_Sub2.aClass668_10123.method68(), (byte) -54);
							class528_sub42.writeInt((client.anInt10856 * -1608791841), 2116117187);
							for (int i_10_ = 0; i_10_ < 5; i_10_++)
								class528_sub42.writeInt((int) (Math.random() * 9.9999999E7), 2052086822);
							class528_sub42.method9606(-5833773103864383205L * client.aLong11168);
							class528_sub42.writeByte((-352215983 * (client.aClass673_11108.anInt8535)), (byte) -25);
							class528_sub42.writeByte((int) (Math.random() * 9.9999999E7), (byte) 14);
							class528_sub42.method9650(RSAKeys.LOGIN_EXPONENT, RSAKeys.LOGIN_MODULUS, 728270902);
							class528_sub34.aClass528_Sub42_Sub2_10481.method9618(class528_sub42.payload, 0,
									class528_sub42.pointer * -185904669, 344517912);
							class528_sub34.aClass528_Sub42_Sub2_10481.method9620(
									-185904669 * (class528_sub34.aClass528_Sub42_Sub2_10481.pointer) - i_9_,
									1435726526);
						} else
							class528_sub34.aClass528_Sub42_Sub2_10481
									.writeByte((-257442419 * HandshakeOpcode.aClass404_4583.anInt4590), (byte) 17);
						Class54.aClass109_624.method1380(class528_sub34, 220214475);
						Class54.aClass109_624.method1379(-1531820644);
						Class54.stage = 1988413733;
					}
					if (35 == Class54.stage * -111028825) {
						if (!Class54.aClass109_624.method1384((byte) 74).method6690(1, -676836283))
							break;
						Class54.aClass109_624.method1384((byte) 29).method6689(
								(Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload), 0, 1, -1748971822);
						Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer = 0;
						int i_11_ = Class54.aClass109_624.aClass528_Sub42_Sub2_1378.readUnsignedByte((byte) 48);
						if (0 != i_11_) {
							Class54.stage = -1245312932;
							ModeWhere.method7895(i_11_, (byte) 71);
							Class471.method5815(i_11_, -1398962502);
							Class54.aClass109_624.method1382(1173427967);
							Class15.method633((short) 13961);
							break;
						}
						Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer = 0;
						if (Class54.reconnecting)
							Class54.stage = -190883898;
						else
							Class54.stage = 552216903;
					}
					if (-111028825 * Class54.stage == 42) {
						if (!Class54.aClass109_624.method1384((byte) 89).method6690(2, -676836283))
							break;
						Class54.aClass109_624.method1384((byte) 5).method6689(
								(Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload), 0, 2, -1284849473);
						Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer = 0;
						Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer = Class54.aClass109_624.aClass528_Sub42_Sub2_1378
								.readUnsignedShort(636109013) * 2015001547;
						Class54.stage = -565840097;
					}
					if (-111028825 * Class54.stage == 57) {
						if (!Class54.aClass109_624.method1384((byte) 70).method6690(
								((Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer) * -185904669), -676836283))
							break;
						Class54.aClass109_624.method1384((byte) 40).method6689(
								(Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload), 0,
								((Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer) * -185904669), -1923757008);
						Class54.aClass109_624.aClass528_Sub42_Sub2_1378.method9648(Class54.anIntArray655, 1629032573);
						Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer = 0;
						String string = Class54.aClass109_624.aClass528_Sub42_Sub2_1378.method9637((byte) -14);
						Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer = 0;
						String string_12_ = Class398.aClass398_4411.method4818(-1572034177);
						Class211.method2961(string, true, string_12_, client.aBool10869, -1865764443);
						Class54.stage = 927173102;
					}
					if (-111028825 * Class54.stage == 66) {
						if (!Class54.aClass109_624.method1384((byte) 91).method6690(1, -676836283))
							break;
						Class54.aClass109_624.method1384((byte) 71).method6689(
								(Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload), 0, 1, -2119028455);
						if (((Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload[0]) & 0xff) == 1)
							Class54.stage = -1874780995;
					}
					if (-111028825 * Class54.stage == 75) {
						if (!Class54.aClass109_624.method1384((byte) 42).method6690(16, -676836283))
							break;
						Class54.aClass109_624.method1384((byte) 74).method6689(
								(Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload), 0, 16, -1212483713);
						Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer = -2119713616;
						Class54.aClass109_624.aClass528_Sub42_Sub2_1378.method9648(Class54.anIntArray655, 524976106);
						Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer = 0;
						Class54.aLong632 = (Class54.aClass109_624.aClass528_Sub42_Sub2_1378.method9633(771973092)
								* -7408127865711447937L);
						Class54.aLong661 = (Class54.aClass109_624.aClass528_Sub42_Sub2_1378.method9633(771973092)
								* -6547172203356985063L);
						Class54.stage = 552216903;
					}
					if (81 == Class54.stage * -111028825) {
						Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer = 0;
						Class54.aClass109_624.method1378((short) -3506);
						Class528_Sub34 class528_sub34 = Class528_Sub35.method9518(-1449171982);
						BitBuffer class528_sub42_sub2 = class528_sub34.aClass528_Sub42_Sub2_10481;
						if (265 == -1132112883 * Class54.anInt651) {
							HandshakeOpcode handshakeOpcode;
							if (Class54.reconnecting)
								handshakeOpcode = HandshakeOpcode.aClass404_4582;
							else
								handshakeOpcode = HandshakeOpcode.aClass404_4584;
							class528_sub42_sub2.writeByte((-257442419 * (handshakeOpcode.anInt4590)), (byte) 59);
							class528_sub42_sub2.method9717(0, (byte) -37);
							int i_13_ = class528_sub42_sub2.pointer * -185904669;
							int i_14_ = class528_sub42_sub2.pointer * -185904669;
							if (!Class54.reconnecting) {
								class528_sub42_sub2.writeInt(857, 2059884001);
								class528_sub42_sub2.writeInt(1, 2146592664);
								class528_sub42_sub2.writeByte((17 == client.anInt10876 * 175711435 ? 1 : 0), (byte) 57);
								i_14_ = (-185904669 * class528_sub42_sub2.pointer);
								ByteBuffer class528_sub42 = Class227.method3185(1626431993);
								class528_sub42_sub2.method9618(class528_sub42.payload, 0,
										class528_sub42.pointer * -185904669, 313582848);
								i_14_ = (class528_sub42_sub2.pointer * -185904669);
								class528_sub42_sub2.writeByte(-1L == (-9152589463575654529L * Class54.aLong632) ? 1 : 0,
										(byte) 47);
								if (-9152589463575654529L * Class54.aLong632 == -1L)
									class528_sub42_sub2.writeString(Class54.aString662, -1936289654);
								else
									class528_sub42_sub2.method9606(-9152589463575654529L * Class54.aLong632);
							}
							class528_sub42_sub2.writeByte(Class377.method4705(-629994490), (byte) -8);
							class528_sub42_sub2.method9717((-1117838587 * (Class411.anInt4713)), (byte) 61);
							class528_sub42_sub2.method9717((-2142152407 * (Class509.anInt6933)), (byte) 7);
							class528_sub42_sub2.writeByte(
									Class514.aClass528_Sub38_6967.aClass691_Sub27_10568.method10040((byte) -84),
									(byte) -19);
							Class398.method4826(class528_sub42_sub2, (byte) -121);
							class528_sub42_sub2.writeString(client.aString10962, -1936289654);
							class528_sub42_sub2.writeInt((-1608791841 * (client.anInt10856)), 2046136839);
							ByteBuffer class528_sub42 = Class514.aClass528_Sub38_6967.method9555(35371363);
							class528_sub42_sub2.writeByte((-185904669 * (class528_sub42.pointer)), (byte) -114);
							class528_sub42_sub2.method9618(class528_sub42.payload, 0,
									-185904669 * class528_sub42.pointer, 926046243);
							client.aBool11161 = true;
							ByteBuffer class528_sub42_15_ = (new ByteBuffer(
									Class141_Sub1.aClass528_Sub37_8800.method9543(1914789832)));
							Class141_Sub1.aClass528_Sub37_8800.method9545(class528_sub42_15_, -1327772658);
							class528_sub42_sub2.method9618(class528_sub42_15_.payload, 0,
									class528_sub42_15_.payload.length, -1690088464);
							class528_sub42_sub2.writeInt((client.anInt10932 * 1390553085), 2098181297);
							class528_sub42_sub2.writeInt((-402082287 * (client.anInt10861)), 2112949492);
							class528_sub42_sub2.writeInt((1442051623 * (client.anInt10860)), 2054111098);
							class528_sub42_sub2.writeInt((1235220883 * (client.anInt11104)), 2140225969);
							class528_sub42_sub2.writeInt((client.anInt10862 * 641800047), 2026254020);
							class528_sub42_sub2.writeString(Class217.aString2291, -1936289654);
							class528_sub42_sub2.writeByte(null == client.aString10866 ? 0 : 1, (byte) 23);
							if (client.aString10866 != null)
								class528_sub42_sub2.writeString((client.aString10866), -1936289654);
							class528_sub42_sub2.writeByte((client.aBool10853 ? 1 : 0), (byte) 16);
							class528_sub42_sub2.writeByte((client.aBool10884 ? 1 : 0), (byte) -51);
							class528_sub42_sub2.writeByte(716602197 * Class528_Sub35.anInt10494 & 0x1, (byte) 50);
							class528_sub42_sub2.writeInt((-306339339 * (client.anInt10873)), 2012508861);
							class528_sub42_sub2.writeString(client.aString11054, -1936289654);
							class528_sub42_sub2.writeByte((Class12.aClass16_178 == null
									|| ((Class12.aClass16_176.anInt192 * 2027542149) != 2027542149
											* (Class12.aClass16_178.anInt192))) ? 1 : 0,
									(byte) -5);
							class528_sub42_sub2.method9717((2027542149 * (Class12.aClass16_177.anInt192)), (byte) 25);
							Class375.method4689(class528_sub42_sub2, (byte) -12);
							class528_sub42_sub2.method9705(Class54.anIntArray655, i_14_,
									class528_sub42_sub2.pointer * -185904669, 16711935);
							class528_sub42_sub2.method9620((-185904669 * class528_sub42_sub2.pointer - i_13_),
									-2016663709);
						} else {
							HandshakeOpcode handshakeOpcode;
							if (Class54.reconnecting)
								handshakeOpcode = HandshakeOpcode.aClass404_4582;
							else
								handshakeOpcode = HandshakeOpcode.aClass404_4581;
							class528_sub42_sub2.writeByte((handshakeOpcode.anInt4590 * -257442419), (byte) 37);
							class528_sub42_sub2.method9717(0, (byte) 0);
							int i_16_ = -185904669 * class528_sub42_sub2.pointer;
							int i_17_ = class528_sub42_sub2.pointer * -185904669;
							if (!Class54.reconnecting) {
								class528_sub42_sub2.writeInt(857, 2080588453);
								class528_sub42_sub2.writeInt(1, 2088186605);
								ByteBuffer class528_sub42 = Class227.method3185(-361410117);
								class528_sub42_sub2.method9618(class528_sub42.payload, 0,
										-185904669 * class528_sub42.pointer, -1696072739);
								i_17_ = (-185904669 * class528_sub42_sub2.pointer);
								class528_sub42_sub2.writeByte((-9152589463575654529L * Class54.aLong632 == -1L) ? 1 : 0,
										(byte) 4);
								if (-1L == (-9152589463575654529L * Class54.aLong632))
									class528_sub42_sub2.writeString(Class54.aString662, -1936289654);
								else
									class528_sub42_sub2.method9606(-9152589463575654529L * Class54.aLong632);
							}
							class528_sub42_sub2.writeByte((-352215983 * (client.aClass673_11108.anInt8535)), (byte) 4);
							class528_sub42_sub2.writeByte(Class378_Sub2.aClass668_10123.method68(), (byte) -74);
							class528_sub42_sub2.writeByte(Class377.method4705(-764504116), (byte) -39);
							class528_sub42_sub2.method9717((-1117838587 * (Class411.anInt4713)), (byte) -2);
							class528_sub42_sub2.method9717((Class509.anInt6933 * -2142152407), (byte) 34);
							class528_sub42_sub2.writeByte(
									Class514.aClass528_Sub38_6967.aClass691_Sub27_10568.method10040((byte) -74),
									(byte) -47);
							Class398.method4826(class528_sub42_sub2, (byte) -126);
							class528_sub42_sub2.writeString(client.aString10962, -1936289654);
							ByteBuffer class528_sub42 = Class514.aClass528_Sub38_6967.method9555(776368695);
							class528_sub42_sub2.writeByte(((class528_sub42.pointer) * -185904669), (byte) 75);
							class528_sub42_sub2.method9618(class528_sub42.payload, 0,
									-185904669 * class528_sub42.pointer, 61549805);
							ByteBuffer class528_sub42_18_ = (new ByteBuffer(
									Class141_Sub1.aClass528_Sub37_8800.method9543(1568183671)));
							Class141_Sub1.aClass528_Sub37_8800.method9545(class528_sub42_18_, -1027066622);
							class528_sub42_sub2.method9618(class528_sub42_18_.payload, 0,
									class528_sub42_18_.payload.length, -2073327820);
							class528_sub42_sub2.writeInt((client.anInt10932 * 1390553085), 2063063158);
							class528_sub42_sub2.writeString(Class217.aString2291, -1936289654);
							class528_sub42_sub2.writeInt((client.anInt10856 * -1608791841), 2057447073);
							class528_sub42_sub2.writeInt((-306339339 * (client.anInt10873)), 2128484644);
							class528_sub42_sub2.writeString(client.aString11054, -1936289654);
							class528_sub42_sub2.writeByte(716602197 * Class528_Sub35.anInt10494 & 0x1, (byte) -18);
							Class375.method4689(class528_sub42_sub2, (byte) -39);
							class528_sub42_sub2.method9705(Class54.anIntArray655, i_17_,
									-185904669 * class528_sub42_sub2.pointer, 16711935);
							class528_sub42_sub2.method9620((class528_sub42_sub2.pointer * -185904669 - i_16_),
									769973878);
						}
						Class54.aClass109_624.method1380(class528_sub34, 433149052);
						Class54.aClass109_624.method1379(-1783158307);
						Class54.aClass109_624.aClass10_1379 = new ISAACCipher(Class54.anIntArray655);
						for (int i_19_ = 0; i_19_ < 4; i_19_++)
							Class54.anIntArray655[i_19_] += 50;
						Class54.aClass109_624.aClass10_1391 = new ISAACCipher(Class54.anIntArray655);
						new ISAACCipher(Class54.anIntArray655);
						Class54.aClass109_624.aClass528_Sub42_Sub2_1378.method10616(Class54.aClass109_624.aClass10_1391,
								-576761794);
						Class54.anIntArray655 = null;
						Class54.stage = 1733901869;
					}
					if (Class54.stage * -111028825 == 91) {
						if (!Class54.aClass109_624.method1384((byte) 107).method6690(1, -676836283))
							break;
						Class54.aClass109_624.method1384((byte) 123).method6689(
								(Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload), 0, 1, -1832698552);
						int i_20_ = Class54.aClass109_624.aClass528_Sub42_Sub2_1378.readUnsignedByte((byte) 58);
						Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer = 0;
						if (21 == i_20_)
							Class54.stage = 672661238;
						else {
							if (i_20_ == 1) {
								Class54.stage = 1047617437;
								Class471.method5815(i_20_, -839809208);
								break;
							}
							if (i_20_ == 52) {
								Class664.anInt8459 = 1053991657 * i_20_;
								Class54.stage = 227265476;
							} else if (i_20_ == 2) {
								if (Class54.aBool626) {
									Class54.aBool626 = false;
									Class54.stage = -374956199;
									break;
								}
								if (Class54.anInt651 * -1132112883 == 265) {
									Class423.aClass141_Sub1_4785.method8271((byte) 8);
									Class54.stage = 1593022743;
								} else
									Class54.stage = -1258936126;
							} else if (i_20_ == 15) {
								Class54.aClass109_624.anInt1383 = 1193606682;
								Class54.stage = 1224878141;
							} else {
								if (i_20_ == 23 && Class54.anInt667 * 1877147777 < 3) {
									Class54.anInt666 = 0;
									Class54.anInt667 += 1123893121;
									Class54.stage = -374956199;
									Class54.aClass109_624.method1382(-864025382);
									break;
								}
								if (i_20_ == 42) {
									Class54.stage = 1161250175;
									Class471.method5815(i_20_, -844374324);
									break;
								}
								if (Class54.anInt651 * -1132112883 == 153 && i_20_ == 49
										&& client.anInt10876 * 175711435 != 0) {
									if (52 != Class54.anInt668 * 693748093)
										Class471.method5815(i_20_, -432295986);
									break;
								}
								if (Class54.aBool627 && !Class54.reconnecting && -1 != Class54.anInt631 * 1871118701
										&& i_20_ == 35) {
									Class54.reconnecting = true;
									Class54.anInt666 = 0;
									Class54.stage = -374956199;
									Class54.aClass109_624.method1382(-1670502483);
									break;
								}
								if (53 == i_20_)
									Class54.stage = 722666010;
								else {
									Class54.stage = -1245312932;
									Class471.method5815(i_20_, -427707429);
									Class54.aClass109_624.method1382(-1549870875);
									Class15.method633((short) 6100);
									break;
								}
							}
						}
					}
					if (122 == Class54.stage * -111028825) {
						if (Class54.aClass109_624.method1384((byte) 28).method6690(1, -676836283)) {
							Class54.aClass109_624.method1384((byte) 127).method6689(
									(Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload), 0, 1, -1482840869);
							int i_21_ = ((Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload[0]) & 0xff);
							Class54.anInt673 = 1925663086 * i_21_;
							Class54.stage = -1245312932;
							Class471.method5815(21, -2134794661);
							Class54.aClass109_624.method1382(-728951009);
							Class15.method633((short) 7083);
						}
					} else if (-111028825 * Class54.stage == 217) {
						if (Class54.aClass109_624.method1384((byte) 109).method6690(2, -676836283)) {
							Class54.aClass109_624.method1384((byte) 110).method6689(
									(Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload), 0, 2, -1910754108);
							Class54.anInt676 = ((((Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload[0])
									& 0xff) << 8)
									+ ((Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload[1]) & 0xff))
									* 370600707;
							Class54.stage = 1733901869;
						}
					} else if (Class54.stage * -111028825 == 246) {
						if (Class54.aClass109_624.method1384((byte) 10).method6690(4, -676836283)) {
							Class54.aClass109_624.method1384((byte) 36).method6689(
									(Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload), 0, 4, -1979126987);
							Class54.anInt678 = Class54.aClass109_624.aClass528_Sub42_Sub2_1378.readInt(-1102864409)
									* -1530006771;
							Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer = 0;
							Class54.stage = -1245312932;
							Class471.method5815(53, -975442633);
							Class54.aClass109_624.method1382(414228806);
							Class15.method633((short) 9905);
						}
					} else if (Class54.stage * -111028825 == 195) {
						if (2055099737 * Class664.anInt8459 == 29) {
							if (!Class54.aClass109_624.method1384((byte) 99).method6690(1, -676836283))
								break;
							Class54.aClass109_624.method1384((byte) 86).method6689(
									(Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload), 0, 1, -1357170672);
							Class54.anInt679 = ((Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload[0]) & 0xff)
									* -1721793801;
						} else if (2055099737 * Class664.anInt8459 == 45) {
							if (!Class54.aClass109_624.method1384((byte) 35).method6690(3, -676836283))
								break;
							Class54.aClass109_624.method1384((byte) 88).method6689(
									(Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload), 0, 3, -1972701617);
							Class54.anInt679 = (-1721793801
									* ((Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload[0]) & 0xff));
							Class54.anInt674 = ((((Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload[1])
									& 0xff) << 8)
									+ ((Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload[2]) & 0xff))
									* -249656329;
						} else
							throw new IllegalStateException();
						Class54.stage = -1245312932;
						Class471.method5815(Class664.anInt8459 * 2055099737, -1817162072);
						Class54.aClass109_624.method1382(-436862021);
						Class15.method633((short) 13140);
						if (Class309.method4127(175711435 * client.anInt10876, 2130436643)) {
							Class416.method4969(true, 5126206);
							Class54.anInt669 = Class664.anInt8459 * -836237345;
						}
					} else if (-111028825 * Class54.stage == 220) {
						if (Class54.aClass109_624.method1384((byte) 81).method6690(2, -676836283)) {
							Class54.aClass109_624.method1384((byte) 71).method6689(
									(Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload), 0, 2, -1481242250);
							Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer = 0;
							HandshakeOpcode.anInt4592 = Class54.aClass109_624.aClass528_Sub42_Sub2_1378
									.readUnsignedShort(682293075) * 1301424185;
							Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer = 0;
							Class54.stage = 1097622209;
						}
					} else if (Class54.stage * -111028825 == 231) {
						if (Class54.aClass109_624.method1384((byte) 28)
								.method6690(HandshakeOpcode.anInt4592 * 868566537,
								-676836283)) {
							Class54.aClass109_624.method1384((byte) 124).method6689(
									(Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload), 0,
									HandshakeOpcode.anInt4592 * 868566537, -2054276903);
							Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer = 0;
							byte[] is = new byte[1 + 868566537 * HandshakeOpcode.anInt4592];
							Class54.aClass109_624.aClass528_Sub42_Sub2_1378.method10619(is, 0,
									868566537 * HandshakeOpcode.anInt4592, 1115846397);
							Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer = 0;
							ByteBuffer class528_sub42 = new ByteBuffer(is);
							String string = class528_sub42.readString(484915747);
							Class215.method3016(string, true, client.aBool10869, -1876954904);
							Class471.method5815((2055099737 * Class664.anInt8459), -1191713627);
							if (153 == -1132112883 * Class54.anInt651 && 0 != client.anInt10876 * 175711435)
								Class54.stage = 1733901869;
							else {
								Class54.stage = -1245312932;
								Class54.aClass109_624.method1382(952828787);
								Class15.method633((short) 18740);
							}
						}
					} else {
						if (257 == Class54.stage * -111028825) {
							if (!Class54.aClass109_624.method1384((byte) 70).method6690(2, -676836283))
								break;
							Class54.aClass109_624.method1384((byte) 119).method6689(
									(Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload), 0, 2, -1762831484);
							Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer = 0;
							Class54.aClass109_624.anInt1383 = Class54.aClass109_624.aClass528_Sub42_Sub2_1378
									.readUnsignedShort(-108885759) * 1550680307;
							Class54.stage = -586274888;
						}
						if (-111028825 * Class54.stage == 264) {
							if (!Class54.aClass109_624.method1384((byte) 95)
									.method6690((Class54.aClass109_624.anInt1383 * 1841403963), -676836283))
								break;
							Class54.aClass109_624.method1384((byte) 125).method6689(
									(Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload), 0,
									(Class54.aClass109_624.anInt1383 * 1841403963), -1409540586);
							Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer = 0;
							boolean bool = (Class54.aClass109_624.aClass528_Sub42_Sub2_1378
									.readUnsignedByte((byte) 102) == 1);
							while (((Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer)
									* -185904669) < (Class54.aClass109_624.anInt1383) * 1841403963) {
								Class411 class411 = (Class527.aClass95_Sub1_Sub1_7104
										.method8255((Class54.aClass109_624.aClass528_Sub42_Sub2_1378), 1994325003));
								Class423.aClass141_Sub1_4785.anInterface2_1635.method15(class411.anInt4711 * 1862601893,
										class411.anObject4712, -196541141);
							}
							if (bool) {
								Class528_Sub34 class528_sub34 = Class528_Sub35.method9518(-1449171982);
								BitBuffer class528_sub42_sub2 = (class528_sub34.aClass528_Sub42_Sub2_10481);
								class528_sub42_sub2.writeByte((-257442419 * HandshakeOpcode.aClass404_4580.anInt4590),
										(byte) -54);
								Class54.aClass109_624.method1380(class528_sub34, 1435953689);
								Class54.aClass109_624.method1379(-38350792);
								Class54.stage = 920361505;
							} else
								Class54.stage = 1593022743;
						}
						if (Class54.stage * -111028825 == 135) {
							if (!Class54.aClass109_624.method1384((byte) 124).method6690(1, -676836283))
								break;
							Class54.aClass109_624.method1384((byte) 35).method6689(
									(Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload), 0, 1, -1480089397);
							int i_22_ = ((Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload[0]) & 0xff);
							if (2 != i_22_) {
								if (i_22_ == 29 || 45 == i_22_) {
									Class664.anInt8459 = 1053991657 * i_22_;
									Class54.stage = -579463291;
								} else {
									Class54.stage = -1245312932;
									Class471.method5815(i_22_, -1174251561);
									Class54.aClass109_624.method1382(-1177258869);
									Class15.method633((short) 18253);
									if (Class309.method4127((175711435 * (client.anInt10876)), 2130436643)) {
										Class416.method4969(true, 5126206);
										Class54.anInt669 = i_22_ * 1851279351;
									}
									break;
								}
								break;
							}
							Class54.stage = -1258936126;
						}
						if (142 == -111028825 * Class54.stage) {
							if (!Class54.aClass109_624.method1384((byte) 49).method6690(1, -676836283))
								break;
							Class54.aClass109_624.method1384((byte) 70).method6689(
									(Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload), 0, 1, -1800357966);
							Class219.anInt2323 = ((Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload[0]) & 0xff)
									* -117947843;
							Class54.stage = -1011235859;
						}
						if (155 == Class54.stage * -111028825) {
							BitBuffer class528_sub42_sub2 = (Class54.aClass109_624.aClass528_Sub42_Sub2_1378);
							if (265 == Class54.anInt651 * -1132112883) {
								if (!Class54.aClass109_624.method1384((byte) 60)
										.method6690(839574805 * Class219.anInt2323, -676836283))
									break;
								Class54.aClass109_624.method1384((byte) 70).method6689(class528_sub42_sub2.payload, 0,
										Class219.anInt2323 * 839574805, -1233910577);
								class528_sub42_sub2.pointer = 0;
								Class493.method5954(class528_sub42_sub2, (byte) -7);
								client.playerRights = class528_sub42_sub2.readUnsignedByte((byte) 78) * 345838391;
								client.anInt11030 = (class528_sub42_sub2.readUnsignedByte((byte) 8) * -1563910415);
								client.aBool11141 = class528_sub42_sub2.readUnsignedByte((byte) 89) == 1;
								client.aBool10934 = class528_sub42_sub2.readUnsignedByte((byte) 11) == 1;
								client.aBool10946 = class528_sub42_sub2.readUnsignedByte((byte) 97) == 1;
								client.aBool11035 = class528_sub42_sub2.readUnsignedByte((byte) 11) == 1;
								client.anInt11025 = (class528_sub42_sub2.readUnsignedShort(-2025778879) * -909315087);
								client.aBool10914 = class528_sub42_sub2.readUnsignedByte((byte) 33) == 1;
								Class474.anInt5428 = class528_sub42_sub2.method9629(158202397) * -1688351025;
								client.aBool10966 = class528_sub42_sub2.readUnsignedByte((byte) 19) == 1;
								Class522.aString7051 = class528_sub42_sub2.readString(96292597);
								Class521.aLong7049 = ((class528_sub42_sub2.method9723(-1349644833)
										- Class249.method3417(2145179735)) * -5379437869827721439L);
								client.aClass495_10935.method5976((short) 10430).method10177(client.aBool10966,
										1717393377);
								Class590.aClass488_7736.method5897(1950226709).method5976((short) 32129)
										.method10177(client.aBool10966, -148184306);
								Class18.aClass5_Sub13_206.method10167(client.aBool10966, 832418943);
								Class21.aClass5_Sub8_214.method10156(client.aBool10966, (byte) 19);
							} else {
								if (!Class54.aClass109_624.method1384((byte) 21)
										.method6690(Class219.anInt2323 * 839574805, -676836283))
									break;
								Class54.aClass109_624.method1384((byte) 9).method6689(class528_sub42_sub2.payload, 0,
										839574805 * Class219.anInt2323, -2050770260);
								class528_sub42_sub2.pointer = 0;
								Class493.method5954(class528_sub42_sub2, (byte) -56);
								client.playerRights = class528_sub42_sub2.readUnsignedByte((byte) 72) * 345838391;
								client.anInt11030 = class528_sub42_sub2.readUnsignedByte((byte) 57) * -1563910415;
								client.aBool11141 = class528_sub42_sub2.readUnsignedByte((byte) 16) == 1;
								Class474.anInt5428 = (class528_sub42_sub2.method9629(-317719480) * -1688351025);
								Class108.myPlayer.gender = (byte) class528_sub42_sub2.readUnsignedByte((byte) 3);
								client.aBool10934 = class528_sub42_sub2.readUnsignedByte((byte) 100) == 1;
								client.aBool10946 = class528_sub42_sub2.readUnsignedByte((byte) 34) == 1;
								Class181_Sub6.aLong9795 = (class528_sub42_sub2.method9633(771973092)
										* -573780271246362215L);
								Class521.aLong7049 = (((6358733121381632681L * Class181_Sub6.aLong9795)
										- Class249.method3417(2059548158) - class528_sub42_sub2.method9714(-980705215))
										* -5379437869827721439L);
								int i_23_ = class528_sub42_sub2.readUnsignedByte((byte) 125);
								client.aBool10914 = 0 != (i_23_ & 0x1);
								Class669.aBool8523 = 0 != (i_23_ & 0x2);
								Class674.anInt8538 = class528_sub42_sub2.readInt(-843044872) * 434939981;
								Class547.anInt7413 = class528_sub42_sub2.readInt(-53190694) * -228262183;
								Class676.anInt8551 = class528_sub42_sub2.readUnsignedShort(-512514619) * 873473343;
								Class284.anInt3120 = (class528_sub42_sub2.readUnsignedShort(-1478126314) * -838948419);
								Class628.anInt8186 = (class528_sub42_sub2.readUnsignedShort(-1238947437) * -879702027);
								Class181_Sub6.anInt9794 = class528_sub42_sub2.readInt(-257647996) * -11297277;
								Class490.aClass32_5511 = new Class32(Class181_Sub6.anInt9794 * -1640727381);
								new Thread(Class490.aClass32_5511).start();
								Class39.anInt518 = class528_sub42_sub2.readUnsignedByte((byte) 40) * 577374251;
								Class691_Sub12.anInt10729 = class528_sub42_sub2.readUnsignedShort(-955252137)
										* -352258395;
								Class549.anInt7421 = class528_sub42_sub2.readUnsignedShort(-1972271123) * -98888967;
								Class69.aBool772 = class528_sub42_sub2.readUnsignedByte((byte) 123) == 1;
								Class108.myPlayer.displayUnfiltered = Class108.myPlayer.displayFiltered = RuntimeException_Sub4.aString11931 = class528_sub42_sub2
										.method9637((byte) -23);
								Class181_Sub16.anInt9834 = class528_sub42_sub2.readUnsignedByte((byte) 65) * -527800547;
								Class181_Sub12.anInt9816 = class528_sub42_sub2.readInt(934661181) * -1656426959;
								Class12.aClass16_178 = new Class16();
								Class12.aClass16_178.anInt192 = (class528_sub42_sub2.readUnsignedShort(-2062504321)
										* 1068151373);
								if (2027542149 * Class12.aClass16_178.anInt192 == 65535)
									Class12.aClass16_178.anInt192 = -1068151373;
								Class12.aClass16_178.aString194 = class528_sub42_sub2.method9637((byte) -38);
								Class12.aClass16_178.anInt193 = class528_sub42_sub2.readUnsignedShort(-387332270)
										* 1685978521;
								Class12.aClass16_178.anInt191 = class528_sub42_sub2.readUnsignedShort(-718071978)
										* -792516699;
								if ((ModeWhere.aClass665_8465 != Class646.aClass665_8386)
										&& ((Class646.aClass665_8386 != ModeWhere.aClass665_8468)
												|| client.playerRights * 859247239 < 2)
										&& (Class12.aClass16_176.method635(Class12.aClass16_182, 129559087)))
									Class619.method7387(11296984);
							}
							if (client.aBool11141 && !client.aBool10946 || client.aBool10914) {
								try {
									Class70.method1086(Class196.anApplet2198, "zap", (byte) -33);
								} catch (Throwable throwable) {
									if (client.aBool10993) {
										try {
											Class196.anApplet2198.getAppletContext().showDocument(
													new URL(Class196.anApplet2198.getCodeBase(), "blank.ws"), "tbi");
										} catch (Exception exception) {
											/* empty */
										}
									}
								}
							} else {
								try {
									Class70.method1086(Class196.anApplet2198, "unzap", (byte) -25);
								} catch (Throwable throwable) {
									/* empty */
								}
							}
							if (ModeWhere.LIVE == Class646.aClass665_8386)
								Class398.aClass398_4404.method4821(1366410492);
							if (265 == Class54.anInt651 * -1132112883)
								Class54.stage = -1386192058;
							else {
								Class54.stage = -1245312932;
								Class471.method5815(2, -376609336);
								Class398.method4827((byte) 34);
								Class487.method5890(12, 2130003981);
								Class54.aClass109_624.current = null;
								break;
							}
						}
						if (170 == Class54.stage * -111028825) {
							if (!Class54.aClass109_624.method1384((byte) 67).method6690(3, -676836283))
								break;
							Class54.aClass109_624.method1384((byte) 5).method6689(
									(Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload), 0, 3, -1248179799);
							Class54.stage = -1761148257;
						}
						if (185 == Class54.stage * -111028825) {
							BitBuffer class528_sub42_sub2 = (Class54.aClass109_624.aClass528_Sub42_Sub2_1378);
							class528_sub42_sub2.pointer = 0;
							if (class528_sub42_sub2.method10623((byte) -82)) {
								if (!Class54.aClass109_624.method1384((byte) 98).method6690(1, -676836283))
									break;
								Class54.aClass109_624.method1384((byte) 100).method6689(class528_sub42_sub2.payload, 3,
										1, -1848666187);
							}
							Class54.aClass109_624.current = (Class617.method7376((byte) 1)[class528_sub42_sub2
									.method10618((byte) 100)]);
							Class54.aClass109_624.anInt1383 = (class528_sub42_sub2.readUnsignedShort(-800286679)
									* 1550680307);
							Class54.stage = 1415762039;
						}
						if (-111028825 * Class54.stage == 161) {
							if (Class54.aClass109_624.method1384((byte) 4)
									.method6690((1841403963 * (Class54.aClass109_624.anInt1383)), -676836283)) {
								Class54.aClass109_624.method1384((byte) 53).method6689(
										(Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload), 0,
										(Class54.aClass109_624.anInt1383) * 1841403963, -1535099447);
								Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer = 0;
								int i_24_ = (1841403963 * (Class54.aClass109_624.anInt1383));
								Class54.stage = -1245312932;
								Class471.method5815(2, -1680077862);
								Class309.method4123((byte) -21);
								Class343.method4528((Class54.aClass109_624.aClass528_Sub42_Sub2_1378), (byte) -52);
								int i_25_ = (i_24_
										- (-185904669 * (Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer)));
								BitBuffer class528_sub42_sub2 = new BitBuffer(i_25_);
								System.arraycopy((Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload),
										((Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer) * -185904669),
										class528_sub42_sub2.payload, 0, i_25_);
								Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer += i_25_ * 2015001547;
								if ((Class54.aClass109_624.current) == IncomingPacket.DYNAMIC_REGION)
									client.aClass495_10935.method5990(
											new Class498(Class489.DYNAMIC, class528_sub42_sub2), 1268833808);
								else
									client.aClass495_10935
											.method5990(new Class498(Class489.STATIC, class528_sub42_sub2), 1268833808);
								if (((Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer) * -185904669) != i_24_)
									throw new RuntimeException(new StringBuilder()
											.append(-185904669
													* (Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer))
											.append(" ").append(i_24_).toString());
								Class54.aClass109_624.current = null;
							}
						} else {
							if (203 != -111028825 * Class54.stage)
								break;
							if ((Class54.aClass109_624.anInt1383 * 1841403963) == -2) {
								if (!Class54.aClass109_624.method1384((byte) 56).method6690(2, -676836283))
									break;
								Class54.aClass109_624.method1384((byte) 46).method6689(
										(Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload), 0, 2, -1304879659);
								Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer = 0;
								Class54.aClass109_624.anInt1383 = (Class54.aClass109_624.aClass528_Sub42_Sub2_1378
										.readUnsignedShort(-1165911393) * 1550680307);
							}
							if (Class54.aClass109_624.method1384((byte) 46)
									.method6690((1841403963 * (Class54.aClass109_624.anInt1383)), -676836283)) {
								Class54.aClass109_624.method1384((byte) 99).method6689(
										(Class54.aClass109_624.aClass528_Sub42_Sub2_1378.payload), 0,
										(1841403963 * (Class54.aClass109_624.anInt1383)), -1328151186);
								Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer = 0;
								int i_26_ = (1841403963 * (Class54.aClass109_624.anInt1383));
								Class54.stage = -1245312932;
								Class471.method5815(15, -666525262);
								Class194.method2809(567139073);
								Class343.method4528((Class54.aClass109_624.aClass528_Sub42_Sub2_1378), (byte) -52);
								if (((Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer) * -185904669) != i_26_)
									throw new RuntimeException(new StringBuilder()
											.append(-185904669
													* (Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer))
											.append(" ").append(i_26_).toString());
								Class54.aClass109_624.current = null;
							}
						}
					}
				} catch (IOException ioexception) {
					Class54.aClass109_624.method1382(-1391089051);
					if (1877147777 * Class54.anInt667 < 3) {
						if (265 == -1132112883 * Class54.anInt651)
							Class12.aClass16_176.method634(857592279);
						else
							Class12.aClass16_177.method634(1759543346);
						Class54.anInt666 = 0;
						Class54.anInt667 += 1123893121;
						Class54.stage = -374956199;
					} else {
						Class54.stage = -1245312932;
						Class471.method5815(-4, -755795839);
						Class15.method633((short) 8802);
					}
					break;
				}
				break;
			} while (false);
		}
	}

	static void method1060(Class173 class173, int i) {
		if (Class28.aBool273)
			Class541.method6622(class173, (short) 10128);
		else
			Class61.method1015(class173, (byte) -38);
	}

	public static void method1061(int i, int i_27_) {
		Class229.aClass186_2490.method2747(i, -581953254);
		Class229.aClass186_2372.method2747(i, -1598671108);
		Class229.aClass186_2370.method2747(i, -1803840002);
		Class229.aClass186_2371.method2747(i, -1199683944);
	}
}
