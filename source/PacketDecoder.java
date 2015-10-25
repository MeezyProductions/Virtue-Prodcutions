import java.io.IOException;

/* PacketDecoder - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class PacketDecoder implements Interface25 {

	Class207 this$0;
	int anInt2229;

	@Override
	public void method140(Class216 class216, int i) {
		Class215 class215 = class216.method3028(531357501 * this.anInt2229, -416998076);
		class215.method2987(2019626277);
		class215.method3006((byte) 4);
		class216.method3027(this.anInt2229 * 531357501, (byte) -53);
	}

	static final boolean method2918(Class109 class109, byte i) throws IOException {
		Class551 class551 = class109.method1384((byte) 1);
		BitBuffer buf = class109.aClass528_Sub42_Sub2_1378;
		if (null == class551)
			return false;
		if (null == class109.current) {
			if (class109.aBool1384) {
				if (!class551.method6690(1, -676836283))
					return false;
				class551.method6689((class109.aClass528_Sub42_Sub2_1378.payload), 0, 1, -1844494005);
				class109.anInt1388 += -89232293;
				class109.anInt1394 = 0;
				class109.aBool1384 = false;
			}
			buf.pointer = 0;
			if (buf.method10623((byte) -71)) {
				if (!class551.method6690(1, -676836283))
					return false;
				class551.method6689((class109.aClass528_Sub42_Sub2_1378.payload), 1, 1, -1255859070);
				class109.anInt1388 += -89232293;
				class109.anInt1394 = 0;
			}
			class109.aBool1384 = true;
			IncomingPacket[] class396s = Class617.method7376((byte) 1);
			int i_3_ = buf.method10618((byte) -29);
			if (i_3_ < 0 || i_3_ >= class396s.length)
				throw new IOException(
						new StringBuilder().append(i_3_).append(" ").append(-185904669 * buf.pointer).toString());
			class109.current = class396s[i_3_];
			class109.anInt1383 = class109.current.anInt4284 * 597243711;
		}
		if (class109.anInt1383 * 1841403963 == -1) {
			if (!class551.method6690(1, -676836283))
				return false;
			class551.method6689(buf.payload, 0, 1, -2060343540);
			class109.anInt1383 = 1550680307 * (buf.payload[0] & 0xff);
			class109.anInt1388 += -89232293;
			class109.anInt1394 = 0;
		}
		if (1841403963 * class109.anInt1383 == -2) {
			if (!class551.method6690(2, -676836283))
				return false;
			class551.method6689(buf.payload, 0, 2, -1175456933);
			buf.pointer = 0;
			class109.anInt1383 = buf.readUnsignedShort(341987424) * 1550680307;
			class109.anInt1388 += -178464586;
			class109.anInt1394 = 0;
		}
		if (1841403963 * class109.anInt1383 > 0) {
			if (!class551.method6690((1841403963 * class109.anInt1383), -676836283))
				return false;
			buf.pointer = 0;
			class551.method6689(buf.payload, 0, 1841403963 * class109.anInt1383, -1352991244);
			class109.anInt1388 += class109.anInt1383 * -970718983;
			class109.anInt1394 = 0;
		}
		class109.aClass396_1390 = class109.aClass396_1385;
		class109.aClass396_1385 = class109.aClass396_1380;
		class109.aClass396_1380 = class109.current;
		if (Launcher.DUMP_PACKETS == true) {
			System.out.println(
					"Packet:" + (1548242725 * class109.current.anInt4215) + ", " + (1841403963 * class109.anInt1383));
		}
		if (IncomingPacket.aClass396_4197 == class109.current) {
			client.anInt11061 = buf.method9642(-193217350) * -48872029;
			client.anInt11105 = -325079279 * client.anInt11018;
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4242 == class109.current) {
			buf.pointer += 585468468;
			if (buf.method9608(1820075264))
				Class666.method7907(buf, (-185904669 * buf.pointer) - 28, (byte) -29);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4204) {
			int i_4_ = buf.readLEShortA(1126370347);
			int i_5_ = buf.readIntB(-1435220425);
			Class52.method918(-874804811);
			Class626.method7461(i_5_, i_4_, -1140909249);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.SEND_INTERFACE) {
			int i_6_ = buf.readShortA((byte) -78);
			int i_7_ = buf.readInt(-1991347104);
			int i_8_ = buf.readIntB(-1203567942);
			int i_9_ = buf.method9675(2088685902);
			int i_10_ = buf.method9614(-1220398584);
			int i_11_ = buf.readInt(262018493);
			int i_12_ = buf.readInt(8627009);
			Class52.method918(-417349710);
			VarDefinition.method4138(i_12_, new Class528_Sub39(i_6_, i_10_), new int[] { i_7_, i_9_, i_8_, i_11_ },
					false, 546768797);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4285 == class109.current) {
			int i_13_ = buf.readLEInt((short) 16385);
			if (i_13_ != 1132908677 * Class674.anInt8538) {
				Class674.anInt8538 = i_13_ * 434939981;
				Class504.method6119(Cs2Context.aClass561_7522, -1, -1, 906549917);
			}
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4281) {
			int i_14_ = buf.method9675(2095742339);
			byte i_15_ = buf.readSignedC(136823140);
			client.aClass217_11028.method3072(new Class204(i_14_), i_15_, 1733874875);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4279) {
			int i_16_ = buf.method9612(-621420604);
			int i_17_ = buf.readLEInt((short) 16385);
			int i_18_ = buf.method9668(-1427504319);
			Class52.method918(129779447);
			Class695.method8188(i_17_, i_16_, i_18_, -116881844);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4214) {
			String string = buf.readString(1955089353);
			int i_19_ = buf.readUnsignedShort(-1806801190);
			String string_20_ = Class33.aClass46_314.method861(i_19_, (byte) -100).method10479(buf, (byte) 16);
			Class227.method3182(19, 0, string, string, string, string_20_, null, i_19_, null, -1345460943);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4314) {
			client.anInt11102 = 1903999365 * client.anInt11018;
			boolean bool = buf.readUnsignedByte((byte) 99) == 1;
			Class343 class343 = new Class343(buf);
			Class308 class308;
			if (bool)
				class308 = Class142_Sub2.aClass308_8919;
			else
				class308 = Class553.aClass308_7436;
			class343.method4522(class308, 2105891670);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4262 == class109.current) {
			String string = buf.readString(1560934724);
			long l = buf.readUnsignedShort(-1124691195);
			long l_21_ = buf.readTriByte(1402855037);
			Class384 class384 = ((Class384) Class443.method5321(Class384.method4732((byte) 83),
					buf.readUnsignedByte((byte) 52), 1236277310));
			boolean bool = buf.readUnsignedByte((byte) 69) == 1;
			long l_22_ = l_21_ + (l << 32);
			boolean bool_23_ = false;
			while_49_: do {
				if (Class691_Sub32.aClass216_10805 == null)
					bool_23_ = true;
				else {
					for (int i_24_ = 0; i_24_ < 100; i_24_++) {
						if (l_22_ == client.aLongArray11131[i_24_]) {
							bool_23_ = true;
							break while_49_;
						}
					}
					if (class384.aBool3989) {
						if (client.aBool11141 && !client.aBool10934 || client.aBool11035)
							bool_23_ = true;
						else if (Class528_Sub15.method9402(string, -1009430921))
							bool_23_ = true;
					}
				}
			} while (false);
			if (!bool_23_) {
				client.aLongArray11131[-2093267487 * client.anInt11132] = l_22_;
				client.anInt11132 = (client.anInt11132 * -2093267487 + 1) % 100 * 1231011361;
				String string_25_ = (Class655.method7844(Class700.method8214(buf, (byte) 3), (short) -12128));
				int i_26_ = bool ? 22 : 24;
				if (783584497 * class384.anInt3987 != -1)
					Class227.method3182(i_26_, 0,
							new StringBuilder().append(Class411.method4906((783584497 * class384.anInt3987), (byte) 66))
									.append(string).toString(),
							new StringBuilder().append(Class411.method4906((class384.anInt3987 * 783584497), (byte) 3))
									.append(string).toString(),
							string, string_25_, Class691_Sub32.aClass216_10805.method3029(2143288335), -1, class384,
							-1345460943);
				else
					Class227.method3182(i_26_, 0, string, string, string, string_25_,
							Class691_Sub32.aClass216_10805.method3029(2139452311), -1, class384, -1345460943);
			}
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4182 == class109.current) {
			int i_27_ = buf.readUnsignedByte((byte) 44);
			Class698 class698 = ((Class698) Class443.method5321(Class445_Sub4.method9181(-765895852), i_27_,
					1745285088));
			if (null == class698)
				class698 = Class698.aClass698_8722;
			Class144.method1714(class698, -601894829);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4273) {
			ScenePacketType.decodeScenePacket(ScenePacketType.aClass401_4444, -1430174955);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4160) {
			int i_28_ = buf.readIntB(268554620);
			int i_29_ = buf.readUnsignedShort((short) 12304);
			if (i_29_ == 65535)
				i_29_ = -1;
			int i_30_ = buf.readLEInt((short) 16385);
			Class52.method918(34203260);
			Class19.method649(i_28_, i_29_, i_30_, 198351500);
			ItemType itemType = ((ItemType) Class18.aClass5_Sub13_206.method63(i_29_, -563028779));
			Class528_Sub21_Sub1.method10278(i_28_, -1802446131 * itemType.anInt47, 432354783 * itemType.anInt46,
					itemType.anInt68 * -1104255557, 327549586);
			Class390.method4784(i_28_, itemType.anInt44 * -199311125, itemType.anInt41 * -2114913447,
					itemType.anInt54 * 782702689, -1809486125);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4257) {
			boolean bool = buf.readUnsignedByte((byte) 115) == 1;
			byte[] is = new byte[1841403963 * class109.anInt1383 - 1];
			buf.method9718(is, 0, 1841403963 * (class109.anInt1383) - 1, -1456124512);
			Class11.method612(bool, is, (byte) -24);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4253 == class109.current) {
			int i_31_ = buf.method9675(2067225418);
			Class52.method918(-1156055067);
			if (-1 == i_31_) {
				Class690_Sub2.anInt10780 = 1603116895;
				Class386.anInt4069 = 1476949137;
			} else {
				Class578 class578 = client.aClass495_10935.method5966(1273279609);
				int i_32_ = i_31_ >> 14 & 0x3fff;
				int i_33_ = i_31_ & 0x3fff;
				i_32_ -= class578.anInt7607 * 961465569;
				if (i_32_ < 0)
					i_32_ = 0;
				else if (i_32_ >= client.aClass495_10935.method6029((short) 15023))
					i_32_ = client.aClass495_10935.method6029((short) 11198);
				i_33_ -= class578.anInt7608 * -173815201;
				if (i_33_ < 0)
					i_33_ = 0;
				else if (i_33_ >= client.aClass495_10935.method5967(1613669478))
					i_33_ = client.aClass495_10935.method5967(67234812);
				Class690_Sub2.anInt10780 = (256 + (i_32_ << 9)) * -1603116895;
				Class386.anInt4069 = -1476949137 * ((i_33_ << 9) + 256);
			}
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4331 == class109.current) {
			int i_34_ = buf.readIntB(1757096013);
			int i_35_ = buf.readUnsignedShort(612724284);
			if (i_35_ == 65535)
				i_35_ = -1;
			int i_36_ = buf.readUnsignedShort(-1106654280);
			if (i_36_ == 65535)
				i_36_ = -1;
			int i_37_ = buf.readShortA((byte) -107);
			Class52.method918(131878978);
			for (int i_38_ = i_36_; i_38_ <= i_35_; i_38_++) {
				long l = i_38_ + ((long) i_34_ << 32);
				Class528_Sub29 class528_sub29 = (Class528_Sub29) client.aClass692_11112.method8137(l);
				Class528_Sub29 class528_sub29_39_;
				if (class528_sub29 == null) {
					if (-1 == i_38_)
						class528_sub29_39_ = new Class528_Sub29(
								(Class623_Sub1.method9755(i_34_, (byte) 41).aClass528_Sub29_2499.anInt10455)
										* -450987711,
								i_37_);
					else
						class528_sub29_39_ = new Class528_Sub29(0, i_37_);
				} else {
					class528_sub29_39_ = new Class528_Sub29((-450987711 * class528_sub29.anInt10455), i_37_);
					class528_sub29.method6443(-1787996983);
				}
				client.aClass692_11112.method8142(class528_sub29_39_, l);
			}
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4183) {
			int i_40_ = buf.readUnsignedByte((byte) 93);
			Class682 class682 = ((Class682) Class443.method5321(Class457.method5532(-2111412867), i_40_, 968529414));
			if (null == class682)
				class682 = Class682.aClass682_8598;
			Class227.method3181(class682, (byte) 107);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4323 == class109.current) {
			int i_41_ = buf.readShort((byte) -7);
			int i_42_ = buf.readUnsignedByte((byte) 120);
			int i_43_ = buf.readIntB(1868644622);
			int i_44_ = buf.readUnsignedShort((short) 24843);
			Class528_Sub31 class528_sub31 = ((Class528_Sub31) client.aClass692_11110.method8137(i_44_));
			if (class528_sub31 != null) {
				NPC class645_sub1_sub5_sub1_sub1 = ((NPC) class528_sub31.anObject10468);
				if (null == class645_sub1_sub5_sub1_sub1.aClass281_12037)
					class645_sub1_sub5_sub1_sub1.aClass281_12037 = new Class281(
							class645_sub1_sub5_sub1_sub1.aClass299_12043);
				class645_sub1_sub5_sub1_sub1.aClass281_12037.anIntArray3064[i_42_] = i_43_;
				class645_sub1_sub5_sub1_sub1.aClass281_12037.aShortArray3065[i_42_] = (short) i_41_;
			}
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4259) {
			int i_45_ = buf.readShortA((byte) -12);
			int i_46_ = buf.readLEShortA(764150572);
			int i_47_ = buf.readIntB(833903521);
			client.aClass495_10935.method5973((byte) 96).method6571(i_46_, i_47_, i_45_, (byte) 16);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4234) {
			String string = buf.readString(854285741);
			int i_48_ = buf.readUnsignedShort(-1915179839);
			Class52.method918(-378080986);
			Class438.method5300(i_48_, string, (byte) -124);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.VARC_LARGE) {
			int key = buf.readUnsignedShort((short) 31504);
			int val = buf.readLEInt((short) 16385);
			if (Launcher.DUMP_VARCS == true) {
				Launcher.sendVarc(key, val);
			}
			Class52.method918(-978195206);
			Class588.setVarc(key, val, (short) 9973);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4218 == class109.current) {
			Class52.method918(-1807485019);
			Class533.method6489(Class372.method4679(-1984899934), -1422918549);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4339 == class109.current) {
			int i_51_ = buf.readUnsignedShort(-274346900);
			Player class645_sub1_sub5_sub1_sub2;
			if (-1453744879 * client.anInt11025 == i_51_)
				class645_sub1_sub5_sub1_sub2 = Class108.myPlayer;
			else
				class645_sub1_sub5_sub1_sub2 = client.localPlayers[i_51_];
			if (class645_sub1_sub5_sub1_sub2 == null) {
				class109.current = null;
				return true;
			}
			int i_52_ = buf.readUnsignedShort(-1940491762);
			Class384 class384 = ((Class384) Class443.method5321(Class384.method4732((byte) 112),
					buf.readUnsignedByte((byte) 45), 639689607));
			boolean bool = (i_52_ & 0x8000) != 0;
			if (class645_sub1_sub5_sub1_sub2.displayUnfiltered != null && null != class645_sub1_sub5_sub1_sub2.model) {
				boolean bool_53_ = false;
				if (class384.aBool3989) {
					if (!bool && (client.aBool11141 && !client.aBool10934 || client.aBool11035))
						bool_53_ = true;
					else if (Class528_Sub15.method9402(class645_sub1_sub5_sub1_sub2.displayUnfiltered, -1253810504))
						bool_53_ = true;
				}
				if (!bool_53_) {
					int i_54_ = -1;
					String string;
					if (bool) {
						i_52_ &= 0x7fff;
						Class387 class387 = Class300.method4021(buf, -298381888);
						i_54_ = -1007414517 * class387.anInt4071;
						string = class387.aClass528_Sub21_Sub4_4070.method10479(buf, (byte) 16);
					} else
						string = (Class655.method7844(Class700.method8214(buf, (byte) 3), (short) -12395));
					class645_sub1_sub5_sub1_sub2.method10925(string.trim(), i_52_ >> 8, i_52_ & 0xff, (byte) 0);
					int i_55_;
					if (class384.aBool3988)
						i_55_ = bool ? 17 : 1;
					else
						i_55_ = bool ? 17 : 2;
					if (class384.anInt3987 * 783584497 != -1)
						Class227.method3182(i_55_, 0,
								new StringBuilder()
										.append(Class411.method4906((783584497 * class384.anInt3987), (byte) 61))
										.append(class645_sub1_sub5_sub1_sub2.method10929(true, (short) -27296))
										.toString(),
								new StringBuilder()
										.append(Class411.method4906((class384.anInt3987 * 783584497), (byte) 85))
										.append(class645_sub1_sub5_sub1_sub2.method10921(false, (byte) -111))
										.toString(),
								class645_sub1_sub5_sub1_sub2.displayFiltered, string, null, i_54_, class384,
								-1345460943);
					else
						Class227.method3182(i_55_, 0, class645_sub1_sub5_sub1_sub2.method10929(true, (short) -20052),
								class645_sub1_sub5_sub1_sub2.method10921(false, (byte) -77),
								class645_sub1_sub5_sub1_sub2.displayFiltered, string, null, i_54_, class384,
								-1345460943);
				}
			}
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4210 == class109.current) {
			int i_56_ = buf.readUnsignedA((byte) -33);
			int i_57_ = buf.readUnsignedByte((byte) 30);
			int i_58_ = buf.readUnsignedS(-741221674);
			int i_59_ = buf.readUnsignedByte((byte) 94);
			int i_60_ = buf.readUnsignedShort((short) 17184) << 2;
			Class52.method918(-308009488);
			Class181_Sub15.method8967(i_57_, i_58_, i_60_, i_56_, i_59_, true, (byte) 9);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4316) {
			int i_61_ = buf.readUnsignedShort(-519929735);
			Class365.aClass218_3848.method3088(i_61_, -965803972);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4171) {
			int i_62_ = buf.readInt(-892687474);
			Class490.aClass32_5511 = new Class32(i_62_);
			Thread thread = new Thread(Class490.aClass32_5511);
			thread.setPriority(1);
			thread.start();
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4290 == class109.current) {
			String string = buf.readString(1936258390);
			String string_63_ = Class655.method7844(Class700.method8214(buf, (byte) 3), (short) 3154);
			ModeWhere.method7898(6, 0, string, string, string, string_63_, null, -1041143546);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4303 == class109.current) {
			int i_64_ = buf.readShortA((byte) -81);
			int i_65_ = buf.readLEShortA(1366499698);
			int i_66_ = buf.readLEInt((short) 16385);
			int i_67_ = buf.readUnsignedS(1425510270);
			int i_68_ = buf.method9614(-1220398584);
			int i_69_ = buf.readShortA((byte) -122);
			if (65535 == i_69_)
				i_69_ = -1;
			int i_70_ = i_67_ & 0x7;
			int i_71_ = i_67_ >> 3 & 0xf;
			if (i_71_ == 15)
				i_71_ = -1;
			boolean bool = 1 == (i_67_ >> 7 & 0x1);
			if (i_66_ >> 30 != 0) {
				Class578 class578 = client.aClass495_10935.method5966(1273279609);
				int i_72_ = i_66_ >> 28 & 0x3;
				int i_73_ = (i_66_ >> 14 & 0x3fff) - class578.anInt7607 * 961465569;
				int i_74_ = (i_66_ & 0x3fff) - class578.anInt7608 * -173815201;
				if (i_73_ >= 0 && i_74_ >= 0 && i_73_ < client.aClass495_10935.method6029((short) 15697)
						&& i_74_ < client.aClass495_10935.method5967(1139651156)) {
					if (i_69_ == -1) {
						Class528_Sub21_Sub19 class528_sub21_sub19 = ((Class528_Sub21_Sub19) client.aClass692_11044
								.method8137(i_73_ << 16 | i_74_));
						if (class528_sub21_sub19 != null) {
							class528_sub21_sub19.aClass645_Sub1_Sub5_Sub4_11688.method10848(-1606409529);
							class528_sub21_sub19.method6443(1318082898);
						}
					} else {
						int i_75_ = 256 + 512 * i_73_;
						int i_76_ = 512 * i_74_ + 256;
						int i_77_ = i_72_;
						if (i_77_ < 3
								&& client.aClass495_10935.method6006((byte) 0).method5633(i_73_, i_74_, (short) -24701))
							i_77_++;
						Class645_Sub1_Sub5_Sub4 class645_sub1_sub5_sub4 = (new Class645_Sub1_Sub5_Sub4(
								client.aClass495_10935.method5973((byte) 103), i_69_, i_64_, i_72_, i_77_, i_75_,
								(Class335_Sub1_Sub1.method10374(i_75_, i_76_, i_72_, -759833206) - i_65_), i_76_, i_73_,
								i_73_, i_74_, i_74_, i_70_, bool, 0));
						client.aClass692_11044.method8142(new Class528_Sub21_Sub19(class645_sub1_sub5_sub4),
								i_73_ << 16 | i_74_);
					}
				}
			} else if (i_66_ >> 29 != 0) {
				int i_78_ = i_66_ & 0xffff;
				Class528_Sub31 class528_sub31 = ((Class528_Sub31) client.aClass692_11110.method8137(i_78_));
				if (null != class528_sub31) {
					NPC class645_sub1_sub5_sub1_sub1 = ((NPC) class528_sub31.anObject10468);
					Class494 class494 = (class645_sub1_sub5_sub1_sub1.aClass494Array11785[i_68_]);
					if (i_69_ == 65535)
						i_69_ = -1;
					boolean bool_79_ = true;
					int i_80_ = class494.anInt5529 * -1010180883;
					if (-1 != i_69_ && -1 != i_80_) {
						if (i_69_ == i_80_) {
							Class669 class669 = (Class669) Class2.aClass5_Sub12_24.method63(i_69_, -1397799173);
							if (class669.aBool8504 && 916695593 * class669.anInt8519 != -1) {
								Class190 class190 = ((Class190) (Class379.aClass5_Sub4_3966
										.method63(916695593 * class669.anInt8519, -67892684)));
								int i_81_ = 1575787233 * class190.anInt2156;
								if (0 == i_81_ || 2 == i_81_)
									bool_79_ = false;
								else if (1 == i_81_)
									bool_79_ = true;
							}
						} else {
							Class669 class669 = (Class669) Class2.aClass5_Sub12_24.method63(i_69_, -576930503);
							Class669 class669_82_ = (Class669) Class2.aClass5_Sub12_24.method63(i_80_, 605699473);
							if (-1 != 916695593 * class669.anInt8519 && class669_82_.anInt8519 * 916695593 != -1) {
								Class190 class190 = ((Class190) (Class379.aClass5_Sub4_3966
										.method63(916695593 * class669.anInt8519, -932745808)));
								Class190 class190_83_ = ((Class190) (Class379.aClass5_Sub4_3966
										.method63(class669_82_.anInt8519 * 916695593, 1364882763)));
								if (-449880687 * class190.anInt2150 < class190_83_.anInt2150 * -449880687)
									bool_79_ = false;
							}
						}
					}
					if (bool_79_) {
						class494.anInt5529 = i_69_ * 567730405;
						class494.anInt5530 = -830042509 * i_65_;
						class494.anInt5532 = -598369669 * i_71_;
						if (-1 != i_69_) {
							Class669 class669 = (Class669) Class2.aClass5_Sub12_24.method63(i_69_, -366251774);
							int i_84_ = class669.aBool8504 ? 0 : 2;
							if (bool)
								i_84_ = 1;
							class494.aClass690_5531.method8120(916695593 * class669.anInt8519, i_64_, i_84_, false,
									-831658413);
						} else
							class494.aClass690_5531.method8069(-1, (byte) 12);
					}
				}
			} else if (i_66_ >> 28 != 0) {
				int i_85_ = i_66_ & 0xffff;
				Player class645_sub1_sub5_sub1_sub2;
				if (client.anInt11025 * -1453744879 == i_85_)
					class645_sub1_sub5_sub1_sub2 = Class108.myPlayer;
				else
					class645_sub1_sub5_sub1_sub2 = (client.localPlayers[i_85_]);
				if (null != class645_sub1_sub5_sub1_sub2) {
					Class494 class494 = (class645_sub1_sub5_sub1_sub2.aClass494Array11785[i_68_]);
					if (i_69_ == 65535)
						i_69_ = -1;
					boolean bool_86_ = true;
					int i_87_ = -1010180883 * class494.anInt5529;
					if (-1 != i_69_ && i_87_ != -1) {
						if (i_87_ == i_69_) {
							Class669 class669 = (Class669) Class2.aClass5_Sub12_24.method63(i_69_, 1002378105);
							if (class669.aBool8504 && class669.anInt8519 * 916695593 != -1) {
								Class190 class190 = ((Class190) (Class379.aClass5_Sub4_3966
										.method63(class669.anInt8519 * 916695593, -348268788)));
								int i_88_ = class190.anInt2156 * 1575787233;
								if (0 == i_88_ || 2 == i_88_)
									bool_86_ = false;
								else if (1 == i_88_)
									bool_86_ = true;
							}
						} else {
							Class669 class669 = (Class669) Class2.aClass5_Sub12_24.method63(i_69_, 708330548);
							Class669 class669_89_ = (Class669) Class2.aClass5_Sub12_24.method63(i_87_, 1341636026);
							if (-1 != 916695593 * class669.anInt8519 && -1 != 916695593 * class669_89_.anInt8519) {
								Class190 class190 = ((Class190) (Class379.aClass5_Sub4_3966
										.method63(class669.anInt8519 * 916695593, 852261099)));
								Class190 class190_90_ = ((Class190) (Class379.aClass5_Sub4_3966
										.method63(916695593 * class669_89_.anInt8519, 795477203)));
								if (class190.anInt2150 * -449880687 < class190_90_.anInt2150 * -449880687)
									bool_86_ = false;
							}
						}
					}
					if (bool_86_) {
						class494.anInt5529 = 567730405 * i_69_;
						class494.anInt5530 = -830042509 * i_65_;
						class494.anInt5532 = i_71_ * -598369669;
						class494.anInt5528 = i_70_ * -2068722977;
						if (i_69_ != -1) {
							Class669 class669 = (Class669) Class2.aClass5_Sub12_24.method63(i_69_, -581744461);
							int i_91_ = class669.aBool8504 ? 0 : 2;
							if (bool)
								i_91_ = 1;
							class494.aClass690_5531.method8120(class669.anInt8519 * 916695593, i_64_, i_91_, false,
									-69129525);
						} else
							class494.aClass690_5531.method8069(-1, (byte) 12);
					}
				}
			}
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4280 == class109.current) {
			int i_92_ = buf.readUnsignedS(1786470719);
			Class52.method918(-782093213);
			client.anInt11001 = i_92_ * -882732327;
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4328) {
			int i_93_ = buf.readUnsignedShort(-1757714317);
			if (65535 == i_93_)
				i_93_ = -1;
			int i_94_ = buf.readUnsignedByte((byte) 11);
			int i_95_ = buf.readUnsignedShort(-452580221);
			int i_96_ = buf.readUnsignedByte((byte) 93);
			int i_97_ = buf.readUnsignedShort(726861195);
			Class365.aClass218_3848.method3104(Class196.aClass196_2195, i_93_, i_94_, i_96_,
					Class188.aClass188_2130.method2758(-1560776500), Class202.aClass202_2211, 0.0F, 0.0F, null, 0,
					i_97_, i_95_, 2105124059);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4161) {
			ScenePacketType.decodeScenePacket(ScenePacketType.aClass401_4439, -2124033184);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4256 == class109.current) {
			ScenePacketType.decodeScenePacket(ScenePacketType.aClass401_4441, -1251426842);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4157) {
			int i_98_ = buf.readUnsignedA((byte) -1);
			int i_99_ = buf.readUnsignedByte((byte) 50);
			client.aClass217_11028.method3071(i_99_, -1188559023).method2883(i_98_, -418680543);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4340) {
			int i_100_ = buf.method9675(2123510340);
			int i_101_ = buf.readUnsignedShort(441526075);
			if (i_101_ == 65535)
				i_101_ = -1;
			int i_102_ = buf.readUnsignedShort((short) 18325);
			if (i_102_ == 65535)
				i_102_ = -1;
			int i_103_ = buf.method9675(2052381805);
			Class52.method918(-1288710745);
			for (int i_104_ = i_102_; i_104_ <= i_101_; i_104_++) {
				long l = ((long) i_103_ << 32) + i_104_;
				Class528_Sub29 class528_sub29 = (Class528_Sub29) client.aClass692_11112.method8137(l);
				Class528_Sub29 class528_sub29_105_;
				if (class528_sub29 == null) {
					if (-1 == i_104_)
						class528_sub29_105_ = new Class528_Sub29(i_100_,
								(Class623_Sub1.method9755(i_103_, (byte) 12).aClass528_Sub29_2499.anInt10456)
										* -547002555);
					else
						class528_sub29_105_ = new Class528_Sub29(i_100_, -1);
				} else {
					class528_sub29_105_ = new Class528_Sub29(i_100_, (class528_sub29.anInt10456 * -547002555));
					class528_sub29.method6443(-1988731975);
				}
				client.aClass692_11112.method8142(class528_sub29_105_, l);
			}
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4274) {
			while (buf.pointer * -185904669 < 1841403963 * class109.anInt1383) {
				boolean bool = buf.readUnsignedByte((byte) 111) == 1;
				String string = buf.readString(693480555);
				String string_106_ = buf.readString(138774323);
				int i_107_ = buf.readUnsignedShort(-254173317);
				int i_108_ = buf.readUnsignedByte((byte) 93);
				int i_109_ = buf.readUnsignedByte((byte) 93);
				boolean bool_110_ = (i_109_ & 0x2) != 0;
				boolean bool_111_ = 0 != (i_109_ & 0x1);
				String string_112_ = "";
				int i_113_ = -1;
				int i_114_ = 0;
				if (i_107_ > 0) {
					string_112_ = buf.readString(1981768259);
					i_113_ = buf.readUnsignedByte((byte) 26);
					i_114_ = buf.readInt(-568955208);
				}
				String string_115_ = buf.readString(1575686982);
				for (int i_116_ = 0; i_116_ < -1314218023 * client.anInt11157; i_116_++) {
					Class62 class62 = client.aClass62Array11160[i_116_];
					if (!bool) {
						if (string.equals(class62.aString720)) {
							if (i_107_ != 1761252257 * class62.anInt714) {
								boolean bool_117_ = true;
								for (Class511_Sub5 class511_sub5 = ((Class511_Sub5) client.aClass695_10903.method8177(
										-1589436957)); null != class511_sub5; class511_sub5 = ((Class511_Sub5) client.aClass695_10903
												.method8184(147257843))) {
									if (class511_sub5.aString10301.equals(string)) {
										if (i_107_ != 0 && (class511_sub5.aShort10303) == 0) {
											class511_sub5.method6259(2085997224);
											bool_117_ = false;
										} else if (i_107_ == 0 && (class511_sub5.aShort10303) != 0) {
											class511_sub5.method6259(2126864712);
											bool_117_ = false;
										}
									}
								}
								if (bool_117_)
									client.aClass695_10903.method8175(new Class511_Sub5(string, i_107_), (byte) 78);
								class62.anInt714 = i_107_ * -1085009823;
							}
							class62.aString715 = string_106_;
							class62.aString713 = string_112_;
							class62.anInt717 = i_108_ * -1756825099;
							class62.anInt716 = i_113_ * 719490441;
							class62.aBool719 = bool_110_;
							class62.aBool718 = bool_111_;
							class62.aString721 = string_115_;
							class62.anInt722 = i_114_ * -1576894071;
							string = null;
							break;
						}
					} else if (string_106_.equals(class62.aString720)) {
						class62.aString720 = string;
						class62.aString715 = string_106_;
						string = null;
						break;
					}
				}
				if (string != null && client.anInt11157 * -1314218023 < 400) {
					Class62 class62 = new Class62();
					client.aClass62Array11160[-1314218023 * client.anInt11157] = class62;
					class62.aString720 = string;
					class62.aString715 = string_106_;
					class62.anInt714 = i_107_ * -1085009823;
					class62.aString713 = string_112_;
					class62.anInt717 = -1756825099 * i_108_;
					class62.anInt716 = i_113_ * 719490441;
					class62.aBool719 = bool_110_;
					class62.aBool718 = bool_111_;
					class62.aString721 = string_115_;
					class62.anInt722 = i_114_ * -1576894071;
					client.anInt11157 += 600961129;
				}
			}
			client.anInt11158 = -113143198;
			client.anInt11166 = client.anInt11018 * -943047031;
			boolean bool = false;
			int i_118_ = -1314218023 * client.anInt11157;
			do {
				if (i_118_ <= 0)
					break;
				bool = true;
				i_118_--;
				for (int i_119_ = 0; i_119_ < i_118_; i_119_++) {
					boolean bool_120_ = false;
					Class62 class62 = client.aClass62Array11160[i_119_];
					Class62 class62_121_ = client.aClass62Array11160[1 + i_119_];
					if ((Class12.aClass16_176.anInt192 * 2027542149 != class62.anInt714 * 1761252257)
							&& (class62_121_.anInt714 * 1761252257 == 2027542149 * Class12.aClass16_176.anInt192))
						bool_120_ = true;
					if (!bool_120_ && class62.anInt714 * 1761252257 == 0 && 0 != class62_121_.anInt714 * 1761252257)
						bool_120_ = true;
					if (!bool_120_ && !class62.aBool719 && class62_121_.aBool719)
						bool_120_ = true;
					if (!bool_120_ && !class62.aBool718 && class62_121_.aBool718)
						bool_120_ = true;
					if (bool_120_) {
						Class62 class62_122_ = client.aClass62Array11160[i_119_];
						client.aClass62Array11160[i_119_] = client.aClass62Array11160[1 + i_119_];
						client.aClass62Array11160[1 + i_119_] = class62_122_;
						bool = false;
					}
				}
			} while (!bool);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4343) {
			int i_123_ = buf.readInt(570803278);
			int i_124_ = buf.readIntB(842482529);
			Class52.method918(-704903017);
			Class229 class229 = Class623_Sub1.method9755(i_124_, (byte) 114);
			class229.anInt2489 = i_123_ * 1762239335;
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4180) {
			int i_125_ = buf.readUnsignedA((byte) -26);
			client.aClass217_11028.method3073(i_125_, (byte) 31);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4247) {
			int i_126_ = buf.method9719(65280);
			int i_127_ = buf.readInt(-590507891);
			int i_128_ = buf.readUnsignedByte((byte) 51);
			String string = "";
			String string_129_ = string;
			if ((i_128_ & 0x1) != 0) {
				string = buf.readString(147011939);
				if ((i_128_ & 0x2) != 0)
					string_129_ = buf.readString(859290841);
				else
					string_129_ = string;
			}
			String string_130_ = buf.readString(1607458311);
			if (i_126_ == 99)
				Class364_Sub2.method9236(string_130_, (byte) -49);
			else if (i_126_ == 98)
				Class222.method3157(string_130_, 507057943);
			else {
				if (!string_129_.equals("") && Class528_Sub15.method9402(string_129_, -241150189)) {
					class109.current = null;
					return true;
				}
				ModeWhere.method7898(i_126_, i_127_, string, string_129_, string, string_130_, null, -1055415317);
			}
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4250) {
			Class220.aClass141_2325 = null;
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4202) {
			int i_131_ = buf.readLEShortA(1515419397);
			int i_132_ = buf.readInt(-536799164);
			int i_133_ = buf.readUnsignedS(880930595);
			int i_134_ = i_133_ >> 2;
			int i_135_ = i_133_ & 0x3;
			int i_136_ = buf.readIntB(-2095010371);
			int i_137_ = buf.readIntB(1560088724);
			int i_138_ = buf.readLEInt((short) 16385);
			Class578 class578 = new Class578(buf.readIntB(249511929));
			int i_139_ = buf.readUnsignedA((byte) -40);
			int i_140_ = buf.method9675(2146734808);
			int i_141_ = buf.readInt(-1689539917);
			Class52.method918(-1243261359);
			VarDefinition.method4138(i_136_,
					new Class528_Sub39_Sub1(i_131_, i_139_, new Class651(class578, i_134_, i_135_, i_138_)),
					new int[] { i_141_, i_132_, i_140_, i_137_ }, false, 2118613399);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4263 == class109.current) {
			int i_142_ = buf.readLEInt((short) 16385);
			int i_143_ = buf.readUnsignedByte((byte) 77);
			Class52.method918(-1555221298);
			Class528_Sub3.method9249(i_142_, i_143_, (byte) 1);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.Player_UPDATE) {
			Class347.decodePlayerUpdate(buf, class109.anInt1383 * 1841403963, (byte) -3);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4338) {
			int i_144_ = buf.readIntB(1399503865);
			boolean bool = buf.method9614(-1220398584) == 1;
			Class52.method918(-1982163849);
			Class454.method5497(i_144_, bool, -1047818287);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4282 == class109.current) {
			int i_145_ = buf.readUnsignedShort(55601401);
			String string = buf.readString(1014427919);
			int i_146_ = buf.readUnsignedShort(-1576580295);
			int i_147_ = buf.readUnsignedShort(-75333800);
			boolean bool = buf.readUnsignedByte((byte) 46) == 1;
			Class281.aClass16_3066 = Class12.aClass16_176;
			Class616.aBool8033 = bool;
			Class168.method2100(i_145_, string, i_146_, i_147_, 1835035765);
			Object object = null;
			Class487.method5890(7, 2130003981);
			class109.current = null;
			return false;
		}
		if (IncomingPacket.aClass396_4255 == class109.current) {
			ScenePacketType.decodeScenePacket(ScenePacketType.aClass401_4447, -1266356219);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4219) {
			int i_148_ = buf.method9675(2064261208);
			if (i_148_ != 479568233 * Class547.anInt7413) {
				Class547.anInt7413 = -228262183 * i_148_;
				Class504.method6119(Cs2Context.aClass561_7530, -1, -1, -653703512);
			}
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4190) {
			for (byte i_149_ = buf.method9627(-942377595); -1 != i_149_; i_149_ = buf.method9627(-1873801829)) {
				for (byte i_150_ = buf.method9627(-1172080875); i_150_ != -1; i_150_ = buf.method9627(-1143881422)) {
					for (byte i_151_ = buf.method9627(-937922684); -1 != i_151_; i_151_ = buf.method9627(-1973117686))
						client.aClass217_11028.method3071(i_149_, -909889684).method2884(i_150_, i_151_,
								Integer.valueOf(buf.readInt(-309710691)), -473035516);
				}
			}
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4174) {
			client.anInt11158 = -56571599;
			client.anInt11166 = -943047031 * client.anInt11018;
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4320 == class109.current) {
			ScenePacketType.decodeScenePacket(ScenePacketType.aClass401_4442, -1644139079);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4175) {
			int i_152_ = buf.readInt(-1708934803);
			int i_153_ = buf.readLEInt((short) 16385);
			Class52.method918(-704115791);
			Class378_Sub2.method9160(i_153_, i_152_, -1718157350);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4188 == class109.current) {
			int i_154_ = buf.method9614(-1220398584);
			int i_155_ = buf.readUnsignedS(991340287);
			int i_156_ = buf.readUnsignedByte((byte) 26);
			client.aClass217_11028.method3071(i_156_, -450586597).method2884(i_154_, i_155_, null, -783324202);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4162 == class109.current) {
			Class643 class643 = new Class643();
			boolean bool = class643.method7613(buf, -335509885);
			client.aClass495_10935.method5975(-713423507).method7490(client.aClass495_10935, bool ? class643 : null,
					class643.method7629(676605846), -1177912203);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4159 == class109.current) {
			int i_157_ = buf.readUnsignedByte((byte) 87);
			int i_158_ = buf.readShortA((byte) -26);
			if (i_158_ == 65535)
				i_158_ = -1;
			Class365.aClass218_3848.method3109(i_158_, i_157_, (byte) -72);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4211 == class109.current) {
			int i_159_ = buf.readLEShortA(1776764016);
			String string = buf.readString(50741106);
			Class52.method918(-1603994763);
			Class438.method5300(i_159_, string, (byte) -125);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4332 == class109.current) {
			Class365.aClass218_3848.method3095(Class188.aClass188_2128.method2758(-1560776500), (byte) 61);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4297 == class109.current) {
			Class495.aClass283_Sub1_5578.method9023(buf, (class109.anInt1383) * 1841403963, 1464129771);
			client.anInt11145 = 1124684825 * client.anInt11018;
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4199 == class109.current) {
			int i_160_ = buf.readUnsignedS(703171816);
			int i_161_ = buf.readUnsignedByte((byte) 108);
			int i_162_ = buf.readUnsignedA((byte) -28);
			client.aClass217_11028.method3071(i_161_, -1998075237).method2882(i_162_, i_160_, -729305939);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.SEND_LARGE_VARP == class109.current) {
			int i_163_ = buf.readInt(-1716739760);
			int i_164_ = buf.readLEShortA(1377493928);
			Class570.playerVarsProvider.aClass586_1209.method7005(
					(Class142) Class691_Sub20.aClass95_Sub1_Sub2_10751.method63(i_164_, -1664717109), i_163_,
					-586440945);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4213 == class109.current) {
			client.anInt11102 = 1903999365 * client.anInt11018;
			boolean bool = buf.readUnsignedByte((byte) 49) == 1;
			if (1 == 1841403963 * class109.anInt1383) {
				if (bool)
					Class142_Sub2.aClass308_8919 = null;
				else
					Class553.aClass308_7436 = null;
				class109.current = null;
				return true;
			}
			if (bool)
				Class142_Sub2.aClass308_8919 = new Class308(buf);
			else
				Class553.aClass308_7436 = new Class308(buf);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4164) {
			boolean bool = buf.readUnsignedByte((byte) 82) == 1;
			String string = buf.readString(462013118);
			String string_165_ = string;
			if (bool)
				string_165_ = buf.readString(2002756851);
			String string_166_ = buf.readString(1123759737);
			long l = buf.readUnsignedShort(-1173198444);
			long l_167_ = buf.readTriByte(339958584);
			Class384 class384 = ((Class384) Class443.method5321(Class384.method4732((byte) 46),
					buf.readUnsignedByte((byte) 54), 1758077200));
			long l_168_ = l_167_ + (l << 32);
			boolean bool_169_ = false;
			while_50_: do {
				for (int i_170_ = 0; i_170_ < 100; i_170_++) {
					if (l_168_ == client.aLongArray11131[i_170_]) {
						bool_169_ = true;
						break while_50_;
					}
				}
				if (class384.aBool3989) {
					if (client.aBool11141 && !client.aBool10934 || client.aBool11035)
						bool_169_ = true;
					else if (Class528_Sub15.method9402(string_165_, -1274026325))
						bool_169_ = true;
				}
			} while (false);
			if (!bool_169_) {
				client.aLongArray11131[-2093267487 * client.anInt11132] = l_168_;
				client.anInt11132 = (client.anInt11132 * -2093267487 + 1) % 100 * 1231011361;
				String string_171_ = (Class655.method7844(Class700.method8214(buf, (byte) 3), (short) 2232));
				if (783584497 * class384.anInt3987 != -1)
					Class227.method3182(9, 0,
							new StringBuilder().append(Class411.method4906((783584497 * class384.anInt3987), (byte) 87))
									.append(string).toString(),
							new StringBuilder().append(Class411.method4906((class384.anInt3987 * 783584497), (byte) 66))
									.append(string_165_).toString(),
							string, string_171_, string_166_, -1, class384, -1345460943);
				else
					Class227.method3182(9, 0, string, string_165_, string, string_171_, string_166_, -1, class384,
							-1345460943);
			}
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4228 == class109.current) {
			client.anInt10940 = buf.readUnsignedByte((byte) 24) * 304671021;
			client.anInt10998 = buf.readUnsignedS(-60752096) * -921749439;
			class109.current = null;
			return true;
		}
		if (IncomingPacket.LOGOUT_PACKET == class109.current) {
			Class416.method4969(Class54.aBool675, 5126206);
			class109.current = null;
			return false;
		}
		if (class109.current == IncomingPacket.aClass396_4209) {
			Class197.anInt2202 = (buf.readSignedC(-1606388031) << 3) * -179720455;
			Class282.anInt3078 = (buf.method9627(-1182201318) << 3) * -194233733;
			Class149.anInt1687 = buf.readUnsignedS(2038032117) * -1488333997;
			while (buf.pointer * -185904669 < 1841403963 * class109.anInt1383) {
				ScenePacketType scenePacketType = (Class263.method3649(-1368953763)[buf.readUnsignedByte((byte) 19)]);
				ScenePacketType.decodeScenePacket(scenePacketType, -1211694667);
			}
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4243) {
			Class282.anInt3078 = (buf.method9657((byte) 44) << 3) * -194233733;
			Class149.anInt1687 = buf.readUnsignedA((byte) -89) * -1488333997;
			Class197.anInt2202 = (buf.method9627(-2048576960) << 3) * -179720455;
			Class578 class578 = client.aClass495_10935.method5966(1273279609);
			for (Class528_Sub2 class528_sub2 = ((Class528_Sub2) client.aClass692_11042.method8146(
					-1942855841)); class528_sub2 != null; class528_sub2 = (Class528_Sub2) client.aClass692_11042
							.method8138(1486467907)) {
				int i_172_ = (int) ((-4849232331708333273L * class528_sub2.aLong7107 >> 28) & 0x3L);
				int i_173_ = (int) (class528_sub2.aLong7107 * -4849232331708333273L & 0x3fffL);
				int i_174_ = i_173_ - 961465569 * class578.anInt7607;
				int i_175_ = (int) ((class528_sub2.aLong7107 * -4849232331708333273L >> 14) & 0x3fffL);
				int i_176_ = i_175_ - -173815201 * class578.anInt7608;
				if (i_172_ == Class149.anInt1687 * -457709349 && i_174_ >= Class197.anInt2202 * 1443738441
						&& i_174_ < 1443738441 * Class197.anInt2202 + 8 && i_176_ >= Class282.anInt3078 * 1582077107
						&& i_176_ < 1582077107 * Class282.anInt3078 + 8) {
					class528_sub2.method6443(-1099325118);
					if (i_174_ >= 0 && i_176_ >= 0 && (i_174_ < client.aClass495_10935.method6029((short) 17409))
							&& (i_176_ < client.aClass495_10935.method5967(103562176)))
						Class17.method645(-457709349 * Class149.anInt1687, i_174_, i_176_, (byte) -120);
				}
			}
			for (Class528_Sub9 class528_sub9 = ((Class528_Sub9) Class528_Sub9.aClass688_10287.method8034(
					1834750938)); class528_sub9 != null; class528_sub9 = (Class528_Sub9) Class528_Sub9.aClass688_10287
							.method8037(1191690228)) {
				if ((class528_sub9.anInt10276 * -419484275 >= 1443738441 * Class197.anInt2202)
						&& (-419484275 * class528_sub9.anInt10276 < 8 + 1443738441 * Class197.anInt2202)
						&& (class528_sub9.anInt10288 * 1250348405 >= Class282.anInt3078 * 1582077107)
						&& (class528_sub9.anInt10288 * 1250348405 < 8 + Class282.anInt3078 * 1582077107)
						&& (1377052225 * class528_sub9.anInt10289 == Class149.anInt1687 * -457709349))
					class528_sub9.aBool10277 = true;
			}
			for (Class528_Sub9 class528_sub9 = ((Class528_Sub9) Class528_Sub9.aClass688_10274.method8034(
					1319194297)); class528_sub9 != null; class528_sub9 = (Class528_Sub9) Class528_Sub9.aClass688_10274
							.method8037(1120430248)) {
				if ((-419484275 * class528_sub9.anInt10276 >= Class197.anInt2202 * 1443738441)
						&& (class528_sub9.anInt10276 * -419484275 < 8 + Class197.anInt2202 * 1443738441)
						&& (1250348405 * class528_sub9.anInt10288 >= Class282.anInt3078 * 1582077107)
						&& (class528_sub9.anInt10288 * 1250348405 < 8 + Class282.anInt3078 * 1582077107)
						&& (Class149.anInt1687 * -457709349 == (1377052225 * class528_sub9.anInt10289)))
					class528_sub9.aBool10277 = true;
			}
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4216) {
			int i_177_ = buf.readInt(-106366555);
			int i_178_ = buf.method9675(2108113458);
			int i_179_ = buf.readUnsignedShort(-1736146870);
			int i_180_ = buf.readLEInt((short) 16385);
			int i_181_ = buf.readLEInt((short) 16385);
			int i_182_ = buf.method9675(2029961839);
			int i_183_ = buf.readUnsignedA((byte) -25);
			int i_184_ = buf.readUnsignedShort((short) 10511);
			Class52.method918(126617791);
			VarDefinition.method4138(i_180_, new Class528_Sub39_Sub3(i_184_, i_183_, i_179_),
					new int[] { i_177_, i_181_, i_178_, i_182_ }, false, 2128035448);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4317) {
			Class365.aClass218_3848.method3097(buf.readUnsignedShort(-1841503176), 308903339);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4264 == class109.current) {
			client.anInt11107 = client.anInt11018 * -1410814331;
			int i_185_ = -185904669 * buf.pointer;
			int i_186_ = buf.readUnsignedShort(876106999);
			boolean bool = buf.readUnsignedByte((byte) 40) == 1;
			Class215 class215 = Class691_Sub32.aClass216_10805.method3028(i_186_, 1614388381);
			Class15 class15 = class215.method2989(1297729481);
			if (null == class15 || bool) {
				class215.method2979(client.anInterface24_10918, 1868816886);
				class15 = class215.method2989(1297729481);
			}
			while ((1841403963 * class109.anInt1383 - (buf.pointer * -185904669 - i_185_)) > 0) {
				Class411 class411 = Class691_Sub20.aClass95_Sub1_Sub2_10751.method8255(buf, 1760513644);
				class15.method15(1862601893 * class411.anInt4711, class411.anObject4712, 31419170);
			}
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4192) {
			String string = buf.readString(1120159517);
			long l = buf.readUnsignedShort(259234063);
			long l_187_ = buf.readTriByte(-702846405);
			Class384 class384 = ((Class384) Class443.method5321(Class384.method4732((byte) 19),
					buf.readUnsignedByte((byte) 41), 1407566615));
			boolean bool = buf.readUnsignedByte((byte) 75) == 1;
			int i_188_ = buf.readUnsignedShort(-928767807);
			long l_189_ = l_187_ + (l << 32);
			boolean bool_190_ = false;
			while_51_: do {
				if (Class691_Sub32.aClass216_10805 == null)
					bool_190_ = true;
				else {
					for (int i_191_ = 0; i_191_ < 100; i_191_++) {
						if (client.aLongArray11131[i_191_] == l_189_) {
							bool_190_ = true;
							break while_51_;
						}
					}
					if (class384.aBool3989 && Class528_Sub15.method9402(string, -1174091136))
						bool_190_ = true;
				}
			} while (false);
			if (!bool_190_) {
				client.aLongArray11131[client.anInt11132 * -2093267487] = l_189_;
				client.anInt11132 = (1 + client.anInt11132 * -2093267487) % 100 * 1231011361;
				String string_192_ = Class33.aClass46_314.method861(i_188_, (byte) -95).method10479(buf, (byte) 16);
				int i_193_ = bool ? 23 : 25;
				if (class384.anInt3987 * 783584497 != -1)
					Class227.method3182(i_193_, 0,
							new StringBuilder()
									.append(Class411.method4906((class384.anInt3987 * 783584497), (byte) 113))
									.append(string).toString(),
							new StringBuilder().append(Class411.method4906((class384.anInt3987 * 783584497), (byte) 60))
									.append(string).toString(),
							string, string_192_, Class691_Sub32.aClass216_10805.method3029(2104001214), i_188_,
							class384, -1345460943);
				else
					Class227.method3182(i_193_, 0, string, string, string, string_192_,
							Class691_Sub32.aClass216_10805.method3029(2088346886), i_188_, class384, -1345460943);
			}
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4334) {
			int i_194_ = buf.readUnsignedByte((byte) 126);
			i_194_ = -i_194_ - 2;
			byte i_195_ = buf.method9627(-1422311126);
			Player player = ((Player) client.aMap11026.get(Integer.valueOf(i_194_)));
			if (null == player) {
				player = new Player(null);
				player.anInt11783 = 1791366607 * i_194_;
				client.aMap11026.put(Integer.valueOf(i_194_), player);
			}
			player.decodeAppearence(buf, i_195_, 759523370);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4170) {
			int i_196_ = buf.readUnsignedByte((byte) 23);
			Class681 class681 = (Class681) Class443.method5321(Class221.method3153((byte) 0), i_196_, 907442862);
			if (class681 == null)
				class681 = Class681.aClass681_8577;
			Class182.method2701(class681, 1349711424);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4278 == class109.current) {
			int i_197_ = buf.readUnsignedShort(-1880753462);
			Class365.aClass218_3848.method3090(i_197_, 659873557);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4217 == class109.current) {
			boolean bool = buf.readUnsignedByte((byte) 14) == 1;
			String string = buf.readString(77178169);
			long l = buf.readUnsignedShort(245609548);
			long l_198_ = buf.readTriByte(119664511);
			Class384 class384 = ((Class384) Class443.method5321(Class384.method4732((byte) 54),
					buf.readUnsignedByte((byte) 79), 1161737608));
			long l_199_ = (l << 32) + l_198_;
			boolean bool_200_ = false;
			Object object = null;
			Class528_Sub36 class528_sub36 = (bool ? Class272.aClass528_Sub36_2903 : Class206.aClass528_Sub36_2231);
			while_52_: do {
				if (class528_sub36 == null)
					bool_200_ = true;
				else {
					for (int i_201_ = 0; i_201_ < 100; i_201_++) {
						if (client.aLongArray11131[i_201_] == l_199_) {
							bool_200_ = true;
							break while_52_;
						}
					}
					if (class384.aBool3989) {
						if (client.aBool11141 && !client.aBool10934 || client.aBool11035)
							bool_200_ = true;
						else if (Class528_Sub15.method9402(string, -1683861633))
							bool_200_ = true;
					}
				}
			} while (false);
			if (!bool_200_) {
				client.aLongArray11131[-2093267487 * client.anInt11132] = l_199_;
				client.anInt11132 = (client.anInt11132 * -2093267487 + 1) % 100 * 1231011361;
				String string_202_ = (Class655.method7844(Class700.method8214(buf, (byte) 3), (short) 9613));
				int i_203_ = bool ? 41 : 44;
				if (class384.anInt3987 * 783584497 != -1)
					Class227.method3182(i_203_, 0,
							new StringBuilder()
									.append(Class411.method4906(((class384.anInt3987) * 783584497), (byte) 74))
									.append(string).toString(),
							new StringBuilder()
									.append(Class411.method4906(((class384.anInt3987) * 783584497), (byte) 89))
									.append(string).toString(),
							string, string_202_, class528_sub36.aString10501, -1, class384, -1345460943);
				else
					Class227.method3182(i_203_, 0, string, string, string, string_202_, class528_sub36.aString10501, -1,
							class384, -1345460943);
			}
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4185 == class109.current) {
			client.anInt10872 = buf.readShort((byte) -117) * -2031803063;
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4254) {
			String string = buf.readString(2000136730);
			boolean bool = buf.readUnsignedByte((byte) 36) == 1;
			String string_204_;
			if (bool)
				string_204_ = buf.readString(1975751623);
			else
				string_204_ = string;
			int i_205_ = buf.readUnsignedShort(-194250866);
			byte i_206_ = buf.method9627(-1015597608);
			boolean bool_207_ = false;
			if (i_206_ == -128)
				bool_207_ = true;
			if (bool_207_) {
				if (Class667.anInt8488 * 1502735135 == 0) {
					class109.current = null;
					return true;
				}
				boolean bool_208_ = false;
				int i_209_;
				for (i_209_ = 0; (i_209_ < Class667.anInt8488 * 1502735135
						&& (!Class5_Sub19.aClass89Array10849[i_209_].aString1134.equals(string_204_)
								|| i_205_ != 415692473
										* (Class5_Sub19.aClass89Array10849[i_209_].anInt1133))); i_209_++) {
					/* empty */
				}
				if (i_209_ < Class667.anInt8488 * 1502735135) {
					for (/**/; i_209_ < Class667.anInt8488 * 1502735135 - 1; i_209_++)
						Class5_Sub19.aClass89Array10849[i_209_] = Class5_Sub19.aClass89Array10849[1 + i_209_];
					Class667.anInt8488 -= 80072927;
					Class5_Sub19.aClass89Array10849[(1502735135 * Class667.anInt8488)] = null;
				}
			} else {
				String string_210_ = buf.readString(924019820);
				Class89 class89 = new Class89();
				class89.aString1135 = string;
				class89.aString1134 = string_204_;
				class89.aString1132 = Class487.method5889(class89.aString1134, Class688.aClass77_8657, (byte) -21);
				class89.anInt1133 = -1425395831 * i_205_;
				class89.aByte1131 = i_206_;
				class89.aString1130 = string_210_;
				int i_211_;
				for (i_211_ = Class667.anInt8488 * 1502735135 - 1; i_211_ >= 0; i_211_--) {
					int i_212_ = Class5_Sub19.aClass89Array10849[i_211_].aString1132.compareTo(class89.aString1132);
					if (i_212_ == 0) {
						Class5_Sub19.aClass89Array10849[i_211_].anInt1133 = -1425395831 * i_205_;
						Class5_Sub19.aClass89Array10849[i_211_].aByte1131 = i_206_;
						Class5_Sub19.aClass89Array10849[i_211_].aString1130 = string_210_;
						if (string_204_.equals(Class108.myPlayer.displayUnfiltered))
							Class693.aByte8696 = i_206_;
						client.anInt11101 = 1473983991 * client.anInt11018;
						class109.current = null;
						return true;
					}
					if (i_212_ < 0)
						break;
				}
				if (1502735135 * Class667.anInt8488 >= Class5_Sub19.aClass89Array10849.length) {
					class109.current = null;
					return true;
				}
				for (int i_213_ = 1502735135 * Class667.anInt8488 - 1; i_213_ > i_211_; i_213_--)
					Class5_Sub19.aClass89Array10849[1 + i_213_] = Class5_Sub19.aClass89Array10849[i_213_];
				if (Class667.anInt8488 * 1502735135 == 0)
					Class5_Sub19.aClass89Array10849 = new Class89[100];
				Class5_Sub19.aClass89Array10849[1 + i_211_] = class89;
				Class667.anInt8488 += 80072927;
				if (string_204_.equals(Class108.myPlayer.displayUnfiltered))
					Class693.aByte8696 = i_206_;
			}
			client.anInt11101 = 1473983991 * client.anInt11018;
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4309 == class109.current) {
			boolean bool = buf.readUnsignedA((byte) -94) == 1;
			int i_214_ = buf.readUnsignedA((byte) -105);
			int i_215_ = buf.readUnsignedS(756336719);
			client.aClass217_11028.method3071(i_214_, -959298081).method2872(i_215_, bool, 1391389020);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.SEND_SMALL_VARP) {
			int i_216_ = buf.readUnsignedShort(-271183343);
			byte i_217_ = buf.readSignedS(977799173);
			Class570.playerVarsProvider.aClass586_1209.method7005(
					(Class142) Class691_Sub20.aClass95_Sub1_Sub2_10751.method63(i_216_, 148637078), i_217_, -534102808);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4349 == class109.current) {
			int i_218_ = buf.readLEInt((short) 16385);
			int i_219_ = buf.method9675(2073012064);
			Class52.method918(-825586722);
			Class648.method7715(i_219_, i_218_, 1130484812);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4227 == class109.current) {
			int i_220_ = buf.readUnsignedS(-518223234);
			int i_221_ = buf.readShortA((byte) -65);
			if (i_221_ == 65535)
				i_221_ = -1;
			Class365.aClass218_3848.method3126(i_221_, i_220_, 792124974);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4173 == class109.current) {
			ScenePacketType.decodeScenePacket(ScenePacketType.aClass401_4443, -1596743516);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4179) {
			int i_222_ = buf.readUnsignedShort(-951773130);
			if (i_222_ == 65535)
				i_222_ = -1;
			int i_223_ = buf.readUnsignedByte((byte) 1);
			int i_224_ = buf.readUnsignedShort(332278661);
			int i_225_ = buf.readUnsignedByte((byte) 75);
			Class365.aClass218_3848.method3104(Class196.aClass196_2195, i_222_, i_223_, i_225_,
					Class188.aClass188_2128.method2758(-1560776500), Class202.aClass202_2211, 0.0F, 0.0F, null, 0, 256,
					i_224_, -1055289325);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4318 == class109.current) {
			class109.current = null;
			return false;
		}
		if (class109.current == IncomingPacket.aClass396_4158) {
			Class423.aClass141_Sub1_4785.method8275(-1819039744);
			class109.current = null;
			return false;
		}
		if (class109.current == IncomingPacket.aClass396_4291) {
			int i_226_ = buf.method9614(-1220398584);
			i_226_ = -i_226_ - 2;
			int i_227_ = buf.method9675(2121054224);
			Class52.method918(-987720881);
			Class41.modelOnIComponent(i_227_, 5, i_226_, 0, 430431939);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.NPC_ON_ICOMPONENT_PACKET == class109.current) {
			int i_228_ = buf.readIntB(1434933258);
			Class52.method918(-1339127368);
			Class41.modelOnIComponent(i_228_, 5, client.anInt11025 * -1453744879, 0, 430431939);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4260) {
			int i_229_ = buf.method9675(2132651060);
			int i_230_ = buf.readIntB(1284181681);
			int i_231_ = buf.readUnsignedShort((short) 16097);
			int i_232_ = buf.readIntB(1058448667);
			int i_233_ = buf.readShortA((byte) -124);
			int i_234_ = buf.readInt(825165161);
			int i_235_ = buf.readLEInt((short) 16385);
			Class578 class578 = new Class578(buf.readLEInt((short) 16385));
			int i_236_ = buf.method9614(-1220398584);
			Class52.method918(-133536971);
			VarDefinition.method4138(i_229_, new Class528_Sub39_Sub4(i_231_, i_236_, new Class671(class578, i_233_)),
					new int[] { i_230_, i_235_, i_234_, i_232_ }, false, 1171223213);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4230) {
			ScenePacketType.decodeScenePacket(ScenePacketType.aClass401_4436, -1923522257);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4313) {
			int i_237_ = buf.method9614(-1220398584);
			int i_238_ = buf.readLEInt((short) 16385);
			int i_239_ = i_238_ >> 28 & 0x3;
			int i_240_ = i_238_ >> 14 & 0x3fff;
			int i_241_ = i_238_ & 0x3fff;
			int i_242_ = buf.readUnsignedA((byte) -63);
			int i_243_ = i_242_ >> 2;
			int i_244_ = i_242_ & 0x3;
			int i_245_ = client.anIntArray10941[i_243_];
			int i_246_ = buf.readInt(-62940112);
			Class578 class578 = client.aClass495_10935.method5966(1273279609);
			i_240_ -= class578.anInt7607 * 961465569;
			i_241_ -= -173815201 * class578.anInt7608;
			Class552.method6713(i_239_, i_240_, i_241_, i_245_, i_243_, i_244_, i_246_, i_237_, 1590520992);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4205 == class109.current) {
			int[] is = new int[4];
			for (int i_247_ = 0; i_247_ < 4; i_247_++)
				is[i_247_] = buf.readLEInt((short) 16385);
			int i_248_ = buf.readLEShortA(1194206830);
			int i_249_ = buf.readUnsignedS(1370940905);
			Class528_Sub31 class528_sub31 = ((Class528_Sub31) client.aClass692_11110.method8137(i_248_));
			if (class528_sub31 != null)
				Class528_Sub29.method9490(((Entity) class528_sub31.anObject10468), is, i_249_, true, 89178858);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.VARBIT_SMALL == class109.current) {
			int val = buf.method9614(-1220398584);
			int key = buf.readLEShortA(783239482);
			Class570.playerVarsProvider.aClass586_1209.method7003(
					(VarDefinition) Class5_Sub7.aClass5_Sub5_10838.method63(key, -28836202), val, -1272790218);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4289) {
			int i_252_ = buf.readUnsignedShort((short) 11223);
			if (i_252_ == 65535)
				i_252_ = -1;
			Class365.aClass218_3848.method3115(i_252_, 255, -859983019);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4239 == class109.current) {
			client.anInt11106 = 650643077 * client.anInt11018;
			if (class109.anInt1383 * 1841403963 == 0)
				Class691_Sub32.aClass216_10805 = null;
			else
				Class691_Sub32.aClass216_10805 = new Class216(0L, buf, true, client.anInterface24_10918);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.DYNAMIC_REGION) {
			BitBuffer class528_sub42_sub2_253_ = new BitBuffer(class109.anInt1383 * 1841403963);
			System.arraycopy((class109.aClass528_Sub42_Sub2_1378.payload),
					(class109.aClass528_Sub42_Sub2_1378.pointer) * -185904669, class528_sub42_sub2_253_.payload, 0,
					1841403963 * class109.anInt1383);
			Class209.method2944(-688390892);
			if (Class514.aClass528_Sub38_6967.aClass691_Sub31_10602.method10076(-740804623) == 1)
				Class590.aClass488_7736.method5895(new Class498(Class489.DYNAMIC, class528_sub42_sub2_253_),
						1474700867);
			else
				client.aClass495_10935.method5990(new Class498(Class489.DYNAMIC, class528_sub42_sub2_253_), 1268833808);
			class109.current = null;
			return false;
		}
		if (IncomingPacket.aClass396_4305 == class109.current) {
			int i_254_ = buf.readUnsignedS(-1638245555);
			int i_255_ = buf.method9614(-1220398584);
			int i_256_ = buf.readLEShortA(1456192243);
			int i_257_ = buf.readUnsignedA((byte) -24);
			int i_258_ = buf.method9614(-1220398584);
			Class52.method918(-183114948);
			client.aBoolArray11139[i_257_] = true;
			client.anIntArray11140[i_257_] = i_254_;
			client.anIntArray11098[i_257_] = i_258_;
			client.anIntArray11142[i_257_] = i_255_;
			client.anIntArray11143[i_257_] = i_256_;
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4304) {
			int i_259_ = buf.readLEInt((short) 16385);
			Class52.method918(-1072970372);
			Class41.modelOnIComponent(i_259_, 3, client.anInt11025 * -1453744879, 0, 430431939);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4163 == class109.current) {
			client.anInt11106 = client.anInt11018 * 650643077;
			Class207 class207 = new Class207(buf, client.anInterface24_10918);
			class207.method2925(Class691_Sub32.aClass216_10805, 1138757263);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4176) {
			if (Class700.aBool8733 && Class207.aFrame2236 != null)
				Class289.method3875(Class514.aClass528_Sub38_6967.aClass691_Sub3_10593.method9844((byte) 71), -1, -1,
						false, 2130003981);
			byte[] is = new byte[1841403963 * class109.anInt1383];
			buf.method10619(is, 0, (class109.anInt1383 * 1841403963), 1975254488);
			String string = Class593.method7084(is, 0, (class109.anInt1383 * 1841403963), (byte) 89);
			Class215.method3016(string, true, client.aBool10869, -769954356);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4347 == class109.current) {
			int i_260_ = buf.readUnsignedShort((short) 31227);
			int i_261_ = buf.method9614(-1220398584);
			boolean bool = (i_261_ & 0x1) == 1;
			Class89.method1211(i_260_, bool, -1520695171);
			client.anIntArray11089[(client.anInt11040 += -582968019) * 1221114533 - 1 & 0x3f] = i_260_;
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4348 == class109.current) {
			Class416.method4969(false, 5126206);
			class109.current = null;
			return false;
		}
		if (class109.current == IncomingPacket.SEND_VARBIT_LARGE) {
			int val = buf.readInt(-759819723);
			int key = buf.readShortA((byte) -52);
			if (Launcher.DUMP_VARPS == true) {
				Launcher.sendVarps(key, val);
			}
			Class570.playerVarsProvider.aClass586_1209.method7003(
					(VarDefinition) Class5_Sub7.aClass5_Sub5_10838.method63(key, 312891105), val, -1500816832);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4345 == class109.current) {
			int i_264_ = buf.readUnsignedByte((byte) 103);
			int i_265_ = buf.readUnsignedByte((byte) 114);
			if (buf.readUnsignedByte((byte) 85) == 0)
				client.aClass487ArrayArray11004[i_264_][i_265_] = new Class487();
			else {
				buf.pointer -= 2015001547;
				client.aClass487ArrayArray11004[i_264_][i_265_] = new Class487(buf, null);
			}
			client.anInt10854 = client.anInt11018 * 2112798627;
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4184) {
			int i_266_ = buf.readInt(240680903);
			boolean bool = buf.readUnsignedA((byte) -33) == 1;
			Class52.method918(5568481);
			Class378_Sub1.method9143(i_266_, bool, -1256870014);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4266) {
			int i_267_ = buf.readUnsignedByte((byte) 98);
			int i_268_ = buf.readLEShortA(878810310);
			int i_269_ = buf.readLEShortA(1853445103);
			int i_270_ = buf.readLEShortA(730460235);
			int i_271_ = buf.readLEShortA(1156957738);
			int i_272_ = buf.readUnsignedShort((short) 21713);
			int i_273_ = buf.method9614(-1220398584) * 4;
			int i_274_ = buf.readUnsignedS(-1914127859);
			int i_275_ = buf.method9642(-372446229);
			int i_276_ = buf.readUnsignedShort((short) 11658);
			int i_277_ = buf.readSignedC(378224132);
			int i_278_ = buf.readSignedS(-108946463);
			int i_279_ = buf.readUnsignedByte((byte) 126);
			if (i_279_ == 255)
				i_279_ = -1;
			int i_280_ = buf.method9668(-1840337141);
			boolean bool = (i_274_ & 0x1) != 0;
			boolean bool_281_ = 0 != (i_274_ & 0x2);
			int i_282_ = bool_281_ ? i_274_ >> 2 : -1;
			if (bool_281_)
				i_267_ = (byte) i_267_;
			else
				i_267_ *= 4;
			Class578 class578 = client.aClass495_10935.method5966(1273279609);
			int i_283_ = i_272_ - 1922931138 * class578.anInt7607;
			int i_284_ = i_271_ - -347630402 * class578.anInt7608;
			i_277_ += i_283_;
			i_278_ += i_284_;
			if (i_283_ >= 0 && i_284_ >= 0 && (i_283_ < client.aClass495_10935.method6029((short) 11150) * 2)
					&& (i_284_ < client.aClass495_10935.method6029((short) 31911) * 2) && i_277_ >= 0 && i_278_ >= 0
					&& i_277_ < client.aClass495_10935.method5967(1513953113) * 2
					&& i_278_ < client.aClass495_10935.method5967(2065209395) * 2 && i_268_ != 65535) {
				i_283_ *= 256;
				i_284_ *= 256;
				i_277_ *= 256;
				i_278_ = 256 * i_278_;
				i_267_ <<= 2;
				i_273_ <<= 2;
				i_270_ <<= 2;
				Class183.method2704(i_268_, i_275_, i_280_, i_282_, i_267_, i_273_, i_283_, i_284_, i_277_, i_278_,
						i_269_, i_276_, i_279_, i_270_, bool, 0, (byte) 28);
			}
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4240 == class109.current) {
			client.anInt11103 = client.anInt11018 * 1380074711;
			boolean bool = buf.readUnsignedByte((byte) 116) == 1;
			if (1 == class109.anInt1383 * 1841403963) {
				if (bool)
					Class272.aClass528_Sub36_2903 = null;
				else
					Class206.aClass528_Sub36_2231 = null;
				class109.current = null;
				return true;
			}
			if (bool)
				Class272.aClass528_Sub36_2903 = new Class528_Sub36(buf);
			else
				Class206.aClass528_Sub36_2231 = new Class528_Sub36(buf);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4172) {
			client.aClass217_11028.method3074((short) 7303);
			int i_285_ = buf.readUnsignedByte((byte) 14);
			for (int i_286_ = 0; i_286_ < i_285_; i_286_++) {
				int i_287_ = buf.readInt(-2072689386);
				Class204 class204 = new Class204(i_287_);
				client.aClass217_11028.method3070(class204, 2026473470);
				int i_288_ = buf.readUnsignedByte((byte) 118);
				for (int i_289_ = 0; i_289_ < i_288_; i_289_++)
					class204.method2899(buf.readInt(365793086), 1128933579);
				int i_290_ = buf.readUnsignedByte((byte) 76);
				for (int i_291_ = 0; i_291_ < i_290_; i_291_++)
					class204.method2871(buf.readInt(-316127279), -566891974);
				for (int i_292_ = 0; i_292_ < i_288_; i_292_++) {
					class204.method2872(i_292_, buf.readUnsignedByte((byte) 54) == 1, 2078475493);
					for (int i_293_ = 0; i_293_ < i_290_; i_293_++) {
						if (buf.readUnsignedByte((byte) 21) == 0)
							class204.method2884(i_292_, i_293_, null, -665202198);
						else
							class204.method2884(i_292_, i_293_, Integer.valueOf(buf.readInt(-590219125)), 942917970);
					}
				}
			}
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4288 == class109.current) {
			int i_294_ = buf.readUnsignedByte((byte) 107);
			Class53.aClass587_622.method7019(i_294_, 1914835642);
			int i_295_ = buf.readUnsignedA((byte) -17);
			int i_296_ = buf.readLEInt((short) 16385);
			Class570.playerVarsProvider.aClass620Array1210[i_294_].method7392(i_296_, 809618813);
			Class570.playerVarsProvider.aClass620Array1210[i_294_].method7396(i_295_, (byte) 28);
			client.anIntArray11091[(client.anInt11092 += 1916847255) * -1511064793 - 1 & 0x3f] = i_294_;
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4233) {
			client.anInt11060 = buf.readUnsignedByte((byte) 4) * -1045361759;
			client.anInt11105 = -325079279 * client.anInt11018;
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4341 == class109.current) {
			int i_297_ = buf.method9675(2031455712);
			int i_298_ = buf.readInt(-338738839);
			int i_299_ = buf.readLEShortA(1411327570);
			Class52.method918(-1324408993);
			Class41.modelOnIComponent(i_297_, 5, i_299_, i_298_, 430431939);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4195) {
			int i_300_ = buf.readUnsignedShort(840758187);
			Class603.method7187(i_300_, (byte) -76);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4223) {
			Class638.method7583(buf, 1841403963 * class109.anInt1383, -1028863852);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4166) {
			int i_301_ = buf.readLEInt((short) 16385);
			int i_302_ = buf.readUnsignedS(-1967143848);
			byte i_303_ = buf.method9627(-1169224129);
			client.aClass217_11028.method3071(i_302_, -1052096968).method2878(i_301_, i_303_, 1314606885);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4201 == class109.current) {
			int i_304_ = buf.readUnsignedS(-1452953432);
			int i_305_ = buf.readUnsignedByte((byte) 40);
			client.aClass217_11028.method3071(i_305_, -1413387777).method2906(i_304_, -1654222468);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4299 == class109.current) {
			ScenePacketType.decodeScenePacket(ScenePacketType.aClass401_4448, -1524133599);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4224 == class109.current) {
			int i_306_ = buf.readUnsignedShort(-151111981);
			if (65535 == i_306_)
				i_306_ = -1;
			int i_307_ = buf.readUnsignedByte((byte) 70);
			int i_308_ = buf.readUnsignedShort(-281837881);
			int i_309_ = buf.readUnsignedByte((byte) 75);
			int i_310_ = buf.readUnsignedShort(-262261222);
			int i_311_ = buf.readUnsignedShort(-1615242269);
			Class469 class469 = (Class365.aClass218_3848.method3103(Class196.aClass196_2195, Class365.aClass218_3848,
					i_306_, i_307_, i_309_, Class188.aClass188_2130.method2758(-1560776500), Class202.aClass202_2211,
					0.0F, 0.0F, null, 0, i_310_, false, 2102243174));
			if (class469 != null)
				Class365.aClass218_3848.method3113(class469, i_311_, i_308_, -2050047458);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4286) {
			byte i_312_ = buf.method9627(-1359652188);
			Class108.myPlayer.decodeAppearence(buf, i_312_, -1949406811);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4324) {
			class109.current = null;
			return true;
		}

		if (class109.current == IncomingPacket.WINDOW_PANE) {
			int id = buf.readUnsignedShort((short) 15532);
			int key3 = buf.readLEInt((short) 16385);
			buf.readUnsignedByte((byte) 75);
			int key2 = buf.readIntB(-420971727);
			int key0 = buf.readLEInt((short) 16385);
			int key1 = buf.readIntB(954516950);
			Class52.method918(-1058272362);
			int[] is = { key0, key1, key2, key3 };
			client.anInt10978 = id * 345853007;
			Class204.method2911(id, is, -1064038366);
			Class285.method3853(false, 1831733819);
			Class576.method6894(client.anInt10978 * 2088127151, is, -1542511702);
			for (int i_318_ = 0; i_318_ < 102; i_318_++)
				client.aBoolArray10855[i_318_] = true;
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4238 == class109.current) {
			int i_319_ = buf.readUnsignedA((byte) -85);
			int i_320_ = buf.readUnsignedA((byte) -69);
			if (i_320_ == 255) {
				i_320_ = -1;
				i_319_ = -1;
			}
			Class600.method7156(i_320_, i_319_, 1727443325);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4277) {
			int i_321_ = buf.readUnsignedShort(262540706);
			int i_322_ = buf.readUnsignedByte((byte) 111);
			boolean bool = 1 == (i_322_ & 0x1);
			while (-185904669 * buf.pointer < 1841403963 * class109.anInt1383) {
				int i_323_ = buf.method9719(65280);
				int i_324_ = buf.readUnsignedShort(68710409);
				int i_325_ = 0;
				if (i_324_ != 0) {
					i_325_ = buf.readUnsignedByte((byte) 96);
					if (i_325_ == 255)
						i_325_ = buf.readInt(-1091433592);
				}
				Class90.method1216(i_321_, i_323_, i_324_ - 1, i_325_, bool, (byte) 0);
			}
			client.anIntArray11089[(client.anInt11040 += -582968019) * 1221114533 - 1 & 0x3f] = i_321_;
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4312 == class109.current) {
			int i_326_ = buf.readLEInt((short) 16385);
			int i_327_ = buf.readUnsignedShort(-352986174);
			int i_328_ = buf.readShortA((byte) -58);
			int i_329_ = buf.readUnsignedA((byte) -118);
			Class52.method918(-2039160923);
			Class476.method5838(i_326_, i_329_, i_327_, i_328_, 39334139);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4178) {
			Class365.aClass218_3848.method3111(-1919036599);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4241) {
			int i_330_ = buf.readShortA((byte) -65);
			int i_331_ = buf.readUnsignedShort(526133081);
			int i_332_ = buf.readLEShortA(1831351674);
			int i_333_ = buf.method9675(2142130059);
			Class52.method918(-2042546824);
			Class528_Sub21_Sub1.method10278(i_333_, i_332_, i_330_, i_331_, 327549586);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.VARCACHE_RESET) {
			Class570.playerVarsProvider.aClass586_1209.method7006(-838344008);
			client.anInt10942 += -370496;
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4246) {
			int i_334_ = buf.method9675(2036211404);
			int i_335_ = buf.readUnsignedByte((byte) 46);
			int i_336_ = buf.readUnsignedShort(-986404099);
			int i_337_ = buf.readShortA((byte) -73);
			Class52.method918(-767996020);
			Class691_Sub33.method10109(i_334_, i_335_, i_336_, i_337_, -1810572965);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4198) {
			if (Class220.aClass141_2325 == null)
				Class220.aClass141_2325 = new Class141(Class320.aClass95_Sub1_Sub1_3466);
			Class411 class411 = Class320.aClass95_Sub1_Sub1_3466.method8255(buf, 1386929187);
			Class220.aClass141_2325.anInterface2_1635.method15(1862601893 * class411.anInt4711, class411.anObject4712,
					804974810);
			client.anIntArray10908[(client.anInt10996 += -107447797) * 951632291 - 1 & 0x3f] = class411.anInt4711
					* 1862601893;
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4336 == class109.current) {
			int i_338_ = buf.readInt(-1494814495);
			int i_339_ = buf.readInt(51592145);
			Class528_Sub34 class528_sub34 = Class656.method7845(OutgoingOpcode.aClass403_4522, class109.aClass10_1379,
					-2074074385);
			class528_sub34.aClass528_Sub42_Sub2_10481.method9654(client.anInt6953 * 296883021, -1623238539);
			class528_sub34.aClass528_Sub42_Sub2_10481.method9673(i_338_, 65535);
			class528_sub34.aClass528_Sub42_Sub2_10481.method9673(i_339_, 65535);
			class109.method1380(class528_sub34, 1920232769);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4293 == class109.current) {
			Class98.anInt1252 = buf.readUnsignedByte((byte) 43) * 1032128245;
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4335 == class109.current) {
			boolean bool = buf.readUnsignedByte((byte) 66) == 1;
			String string = buf.readString(802026472);
			String string_340_ = string;
			if (bool)
				string_340_ = buf.readString(1660787303);
			long l = buf.readUnsignedShort(-880223486);
			long l_341_ = buf.readTriByte(2133984463);
			Class384 class384 = ((Class384) Class443.method5321(Class384.method4732((byte) 118),
					buf.readUnsignedByte((byte) 57), 949880203));
			int i_342_ = buf.readUnsignedShort(-1186084496);
			long l_343_ = (l << 32) + l_341_;
			boolean bool_344_ = false;
			while_53_: do {
				for (int i_345_ = 0; i_345_ < 100; i_345_++) {
					if (client.aLongArray11131[i_345_] == l_343_) {
						bool_344_ = true;
						break while_53_;
					}
				}
				if (class384.aBool3989 && Class528_Sub15.method9402(string_340_, -1776320106))
					bool_344_ = true;
			} while (false);
			if (!bool_344_) {
				client.aLongArray11131[client.anInt11132 * -2093267487] = l_343_;
				client.anInt11132 = 1231011361 * ((1 + -2093267487 * client.anInt11132) % 100);
				String string_346_ = Class33.aClass46_314.method861(i_342_, (byte) -125).method10479(buf, (byte) 16);
				if (class384.anInt3987 * 783584497 != -1)
					Class227.method3182(18, 0,
							new StringBuilder()
									.append(Class411.method4906((783584497 * class384.anInt3987), (byte) 120))
									.append(string).toString(),
							new StringBuilder().append(Class411.method4906((class384.anInt3987 * 783584497), (byte) 78))
									.append(string_340_).toString(),
							string, string_346_, null, i_342_, class384, -1345460943);
				else
					Class227.method3182(18, 0, string, string_340_, string, string_346_, null, i_342_, class384,
							-1345460943);
			}
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4322 == class109.current) {
			int i_347_ = buf.readUnsignedShort(-1769385425);
			int i_348_ = buf.readUnsignedShort(-1508060538);
			int i_349_ = buf.readUnsignedShort(-386997250);
			Class365.aClass218_3848.method3092(i_347_, i_348_, i_349_, 1883113824);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4186 == class109.current) {
			ScenePacketType.decodeScenePacket(ScenePacketType.aClass401_4437, -1575290030);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4181) {
			Class587.method7030(buf.readString(802985856), 446039669);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4249) {
			int i_350_ = buf.method9614(-1220398584);
			int i_351_ = buf.readShortA((byte) -51) << 2;
			int i_352_ = buf.readUnsignedByte((byte) 14);
			int i_353_ = buf.readUnsignedByte((byte) 34);
			int i_354_ = buf.method9614(-1220398584);
			Class52.method918(-846692563);
			Class466.method5641(i_352_, i_350_, i_351_, i_354_, i_353_, 1420946430);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4155) {
			int i_355_ = buf.readInt(-1816768937);
			int i_356_ = buf.readLEInt((short) 16385);
			Class52.method918(-165406632);
			Class41.modelOnIComponent(i_355_, 2, i_356_, -1, 430431939);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4235) {
			client.aClass629_11034 = ((Class629) Class443.method5321(Class629.method7520(-1421862787),
					buf.method9614(-1220398584), 1047911525));
			if (null == client.aClass629_11034)
				client.aClass629_11034 = Class629.aClass629_8188;
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4200) {
			int i_357_ = buf.method9675(2042577839);
			int i_358_ = buf.method9675(2142686489);
			Class52.method918(-111850314);
			Class528_Sub39 class528_sub39 = ((Class528_Sub39) client.aClass692_11097.method8137(i_358_));
			Class528_Sub39 class528_sub39_359_ = ((Class528_Sub39) client.aClass692_11097.method8137(i_357_));
			if (null != class528_sub39_359_)
				Class279.method3735(
						class528_sub39_359_, (class528_sub39 == null || ((905908359
								* class528_sub39_359_.anInt10625) != (905908359 * class528_sub39.anInt10625))),
						false, -1412787872);
			if (null != class528_sub39) {
				class528_sub39.method6443(1425404693);
				client.aClass692_11097.method8142(class528_sub39, i_357_);
			}
			Class229 class229 = Class623_Sub1.method9755(i_358_, (byte) -12);
			if (null != class229)
				Class39.method811(class229, 1435904523);
			class229 = Class623_Sub1.method9755(i_357_, (byte) -80);
			if (class229 != null) {
				Class39.method811(class229, 1435904523);
				Class423.method5110((Class380.aClass226Array3970[class229.anInt2376 * 306930455 >>> 16]), class229,
						true, -1416215792);
			}
			if (client.anInt10978 * 2088127151 != -1)
				Class539.method6616(2088127151 * client.anInt10978, 1, (byte) -123);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4165 == class109.current) {
			if (Class309.method4127(client.anInt10876 * 175711435, 2130436643))
				client.anInt10889 = (int) (buf.readUnsignedShort(237977594) * 2.5F) * 866235153;
			else
				client.anInt10889 = buf.readUnsignedShort(850487906) * 217250814;
			client.anInt11105 = -325079279 * client.anInt11018;
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4232 == class109.current) {
			byte i_360_ = buf.readSignedS(-1543147995);
			int i_361_ = buf.readUnsignedByte((byte) 55);
			int i_362_ = buf.readInt(1005733516);
			client.aClass217_11028.method3071(i_361_, -441799963).method2874(i_362_, i_360_, -356678669);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4295 == class109.current) {
			Class474.aClass699_5429 = Class272.method3691(buf.readUnsignedByte((byte) 120), (byte) 78);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4327) {
			byte i_363_ = buf.readSignedS(2136075685);
			int i_364_ = buf.readLEShortA(878485770);
			Class52.method918(-1063207721);
			Class378_Sub1_Sub1.method10346(i_364_, i_363_, -912172366);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4307 == class109.current) {
			Class474.anInt5428 = buf.method9629(-774967728) * -1688351025;
			client.aBool11141 = buf.readUnsignedByte((byte) 30) == 1;
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4261) {
			int i_365_ = buf.readUnsignedShort(-2078047568);
			int i_366_ = buf.readUnsignedByte((byte) 56);
			boolean bool = (i_366_ & 0x1) == 1;
			Class681.method7980(i_365_, bool, -652703877);
			int i_367_ = buf.readUnsignedShort(-1024874528);
			for (int i_368_ = 0; i_368_ < i_367_; i_368_++) {
				int i_369_ = buf.readUnsignedShort((short) 26302);
				int i_370_ = buf.method9614(-1220398584);
				if (i_370_ == 255)
					i_370_ = buf.method9675(2080382212);
				Class90.method1216(i_365_, i_368_, i_369_ - 1, i_370_, bool, (byte) 0);
			}
			client.anIntArray11089[(client.anInt11040 += -582968019) * 1221114533 - 1 & 0x3f] = i_365_;
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4189) {
			int i_371_ = buf.readUnsignedShort(-1054693101);
			client.anInt10945 = -2060166951;
			client.anInt10895 = i_371_ * 258800089;
			client.anInt10943 = -829792801;
			Class481.aClass446_5461.method5357(client.anInt10895 * 76543593, (short) 17736);
			Class666.method7903(305781950);
			Class24.method698(95190825);
			int i_372_ = buf.readUnsignedShort(-12904292);
			client.anInt10891 = i_372_ * -535832627;
			int i_373_ = buf.readUnsignedByte((byte) 118);
			Class487.aClass528_Sub42_5493 = new ByteBuffer(i_373_);
			Class487.aClass528_Sub42_5493.method9618(buf.payload, buf.pointer * -185904669, i_373_, -1863798890);
			buf.pointer += 2015001547 * i_373_;
			class109.current = null;
			return false;
		}
		if (class109.current == IncomingPacket.aClass396_4207) {
			client.anInt11101 = client.anInt11018 * 1473983991;
			if (1841403963 * class109.anInt1383 == 0) {
				client.aString11133 = null;
				client.aString11172 = null;
				Class667.anInt8488 = 0;
				Class5_Sub19.aClass89Array10849 = null;
				class109.current = null;
				return true;
			}
			client.aString11172 = buf.readString(1901425613);
			boolean bool = buf.readUnsignedByte((byte) 91) == 1;
			if (bool)
				buf.readString(1686715391);
			client.aString11133 = buf.readString(707535098);
			Class219.aByte2322 = buf.method9627(-2107643598);
			int i_374_ = buf.readUnsignedByte((byte) 59);
			if (i_374_ == 255) {
				class109.current = null;
				return true;
			}
			Class667.anInt8488 = i_374_ * 80072927;
			Class89[] class89s = new Class89[100];
			for (int i_375_ = 0; i_375_ < 1502735135 * Class667.anInt8488; i_375_++) {
				class89s[i_375_] = new Class89();
				class89s[i_375_].aString1135 = buf.readString(874606655);
				bool = buf.readUnsignedByte((byte) 38) == 1;
				if (bool)
					class89s[i_375_].aString1134 = buf.readString(1861262098);
				else
					class89s[i_375_].aString1134 = class89s[i_375_].aString1135;
				class89s[i_375_].aString1132 = Class487.method5889(class89s[i_375_].aString1134, Class688.aClass77_8657,
						(byte) -72);
				class89s[i_375_].anInt1133 = buf.readUnsignedShort(439643286) * -1425395831;
				class89s[i_375_].aByte1131 = buf.method9627(-1316827952);
				class89s[i_375_].aString1130 = buf.readString(1744712699);
				if (class89s[i_375_].aString1134.equals(Class108.myPlayer.displayUnfiltered))
					Class693.aByte8696 = class89s[i_375_].aByte1131;
			}
			boolean bool_376_ = false;
			int i_377_ = 1502735135 * Class667.anInt8488;
			do {
				if (i_377_ <= 0)
					break;
				bool_376_ = true;
				i_377_--;
				for (int i_378_ = 0; i_378_ < i_377_; i_378_++) {
					if ((class89s[i_378_].aString1132.compareTo(class89s[1 + i_378_].aString1132)) > 0) {
						Class89 class89 = class89s[i_378_];
						class89s[i_378_] = class89s[i_378_ + 1];
						class89s[i_378_ + 1] = class89;
						bool_376_ = false;
					}
				}
			} while (!bool_376_);
			Class5_Sub19.aClass89Array10849 = class89s;
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4237 == class109.current) {
			boolean bool = buf.readUnsignedByte((byte) 74) == 1;
			long l = buf.readUnsignedShort(69951644);
			long l_379_ = buf.readTriByte(2020336821);
			long l_380_ = (l << 32) + l_379_;
			boolean bool_381_ = false;
			Class528_Sub36 class528_sub36 = (bool ? Class272.aClass528_Sub36_2903 : Class206.aClass528_Sub36_2231);
			if (class528_sub36 == null)
				bool_381_ = true;
			else {
				for (int i_382_ = 0; i_382_ < 100; i_382_++) {
					if (client.aLongArray11131[i_382_] == l_380_) {
						bool_381_ = true;
						break;
					}
				}
			}
			if (!bool_381_) {
				client.aLongArray11131[client.anInt11132 * -2093267487] = l_380_;
				client.anInt11132 = (1 + -2093267487 * client.anInt11132) % 100 * 1231011361;
				String string = Class700.method8214(buf, (byte) 3);
				int i_383_ = bool ? 43 : 46;
				Class227.method3182(i_383_, 0, "", "", "", string, class528_sub36.aString10501, -1, null, -1345460943);
			}
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4301) {
			String string = buf.readString(999488628);
			int i_384_ = buf.readUnsignedShort(490910503);
			int i_385_ = buf.readUnsignedShort(241548176);
			int i_386_ = buf.readUnsignedShort(-1323633515);
			Class12.aClass16_177.aString194 = string;
			Class12.aClass16_177.anInt192 = i_384_ * 1068151373;
			Class12.aClass16_177.anInt193 = i_385_ * 1685978521;
			Class12.aClass16_177.anInt191 = -792516699 * i_386_;
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4270 == class109.current) {
			boolean bool = buf.readUnsignedByte((byte) 59) == 1;
			String string = buf.readString(2011696770);
			long l = buf.readUnsignedShort(170726128);
			long l_387_ = buf.readTriByte(-1604342754);
			Class384 class384 = ((Class384) Class443.method5321(Class384.method4732((byte) 85),
					buf.readUnsignedByte((byte) 104), 2115160398));
			int i_388_ = buf.readUnsignedShort(163671250);
			long l_389_ = (l << 32) + l_387_;
			boolean bool_390_ = false;
			Object object = null;
			Class528_Sub36 class528_sub36 = (bool ? Class272.aClass528_Sub36_2903 : Class206.aClass528_Sub36_2231);
			while_54_: do {
				if (class528_sub36 == null)
					bool_390_ = true;
				else {
					for (int i_391_ = 0; i_391_ < 100; i_391_++) {
						if (client.aLongArray11131[i_391_] == l_389_) {
							bool_390_ = true;
							break while_54_;
						}
					}
					if (class384.aBool3989 && Class528_Sub15.method9402(string, -741122846))
						bool_390_ = true;
				}
			} while (false);
			if (!bool_390_) {
				client.aLongArray11131[-2093267487 * client.anInt11132] = l_389_;
				client.anInt11132 = (1 + -2093267487 * client.anInt11132) % 100 * 1231011361;
				String string_392_ = Class33.aClass46_314.method861(i_388_, (byte) -82).method10479(buf, (byte) 16);
				int i_393_ = bool ? 42 : 45;
				if (-1 != class384.anInt3987 * 783584497)
					Class227.method3182(i_393_, 0,
							new StringBuilder().append(Class411.method4906((class384.anInt3987 * 783584497), (byte) 97))
									.append(string).toString(),
							new StringBuilder()
									.append(Class411.method4906((783584497 * class384.anInt3987), (byte) 111))
									.append(string).toString(),
							string, string_392_, class528_sub36.aString10501, i_388_, class384, -1345460943);
				else
					Class227.method3182(i_393_, 0, string, string, string, string_392_, class528_sub36.aString10501,
							i_388_, class384, -1345460943);
			}
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4330 == class109.current) {
			Class52.method918(-514487752);
			Class499.method6073((byte) 67);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4310) {
			for (int i_394_ = 0; (i_394_ < client.localPlayers.length); i_394_++) {
				if (client.localPlayers[i_394_] != null) {
					client.localPlayers[i_394_].anIntArray11819 = null;
					client.localPlayers[i_394_].aClass690_11774.method8069(-1, (byte) 12);
				}
			}
			for (int i_395_ = 0; i_395_ < client.anInt10921 * -693122579; i_395_++) {
				((Entity) client.aClass528_Sub31Array10920[i_395_].anObject10468).anIntArray11819 = null;
				((Entity) client.aClass528_Sub31Array10920[i_395_].anObject10468).aClass690_11774.method8069(-1,
						(byte) 12);
			}
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4245 == class109.current) {
			ScenePacketType.decodeScenePacket(ScenePacketType.aClass401_4438, -1520696753);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4329) {
			int i_396_ = buf.readLEShortA(712485899);
			int i_397_ = buf.readShortA((byte) -95);
			Class52.method918(127742294);
			Class275.method3707(i_396_, i_397_, 0, -2010973966);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4342 == class109.current) {
			int i_398_ = buf.readIntB(2058074589);
			int i_399_ = buf.readShortA((byte) -127);
			int i_400_ = buf.readUnsignedShort(-1413600310);
			int i_401_ = buf.readUnsignedShort((short) 32391);
			Class52.method918(-346063329);
			Class41.modelOnIComponent(i_398_, 7, i_401_ << 16 | i_400_, i_399_, 430431939);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4177) {
			Class137.aString1631 = (class109.anInt1383 * 1841403963 > 2 ? buf.readString(2104858287)
					: Class39.aClass39_474.method807((Class378_Sub2.aClass668_10123), (byte) 102));
			client.anInt10963 = ((1841403963 * class109.anInt1383 > 0 ? buf.readUnsignedShort(851737574) : -1) * -1371852395);
			if (client.anInt10963 * 177967549 == 65535)
				client.anInt10963 = 1371852395;
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4225 == class109.current) {
			int i_402_ = buf.readUnsignedByte((byte) 53);
			Class689 class689 = ((Class689) Class443.method5321(Class453.method5455(797584412), i_402_, 879903069));
			if (null == class689)
				class689 = Class689.aClass689_8659;
			Class698.method8212(class689, 1844218187);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4252 == class109.current) {
			int i_403_ = buf.readShortA((byte) -104);
			int i_404_ = buf.readLEInt((short) 16385);
			Class52.method918(-2091821438);
			Class454.method5498(i_404_, i_403_, -1955030095);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4271) {
			int i_405_ = buf.readIntB(206511989);
			int i_406_ = buf.readUnsignedByte((byte) 55);
			int i_407_ = buf.method9675(2129398001);
			int i_408_ = buf.readUnsignedShort(-506294697);
			int i_409_ = buf.readUnsignedShort((short) 22202);
			int i_410_ = buf.readIntB(-1031954805);
			int i_411_ = buf.readInt(-871278059);
			int i_412_ = buf.readInt(-773687333);
			Class52.method918(-1944122988);
			VarDefinition.method4138(i_407_, new Class528_Sub39_Sub2(i_408_, i_406_, i_409_),
					new int[] { i_411_, i_410_, i_412_, i_405_ }, false, 1193216984);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4222 == class109.current) {
			ScenePacketType.decodeScenePacket(ScenePacketType.aClass401_4445, -2032723957);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4333) {
			boolean bool = buf.readUnsignedByte((byte) 19) == 1;
			String string = buf.readString(1445908951);
			String string_413_ = string;
			if (bool)
				string_413_ = buf.readString(2025396089);
			long l = buf.readUnsignedShort(-2027180416);
			long l_414_ = buf.readTriByte(366425041);
			Class384 class384 = ((Class384) Class443.method5321(Class384.method4732((byte) 22),
					buf.readUnsignedByte((byte) 89), 684065113));
			long l_415_ = (l << 32) + l_414_;
			boolean bool_416_ = false;
			while_55_: do {
				for (int i_417_ = 0; i_417_ < 100; i_417_++) {
					if (client.aLongArray11131[i_417_] == l_415_) {
						bool_416_ = true;
						break while_55_;
					}
				}
				if (class384.aBool3989) {
					if (client.aBool11141 && !client.aBool10934 || client.aBool11035)
						bool_416_ = true;
					else if (Class528_Sub15.method9402(string_413_, -496095379))
						bool_416_ = true;
				}
			} while (false);
			if (!bool_416_) {
				client.aLongArray11131[client.anInt11132 * -2093267487] = l_415_;
				client.anInt11132 = 1231011361 * ((client.anInt11132 * -2093267487 + 1) % 100);
				String string_418_ = (Class655.method7844(Class700.method8214(buf, (byte) 3), (short) 19491));
				int i_419_ = class384.aBool3988 ? 7 : 3;
				if (class384.anInt3987 * 783584497 != -1)
					Class227.method3182(i_419_, 0,
							new StringBuilder().append(Class411.method4906((class384.anInt3987 * 783584497), (byte) 17))
									.append(string).toString(),
							new StringBuilder().append(Class411.method4906((783584497 * class384.anInt3987), (byte) 60))
									.append(string_413_).toString(),
							string, string_418_, null, -1, class384, -1345460943);
				else
					Class227.method3182(i_419_, 0, string, string_413_, string, string_418_, null, -1, class384,
							-1345460943);
			}
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4221 == class109.current) {
			boolean bool = buf.readUnsignedByte((byte) 101) == 1;
			if (bool)
				Class533.method6489(6, -1996701779);
			else
				Class533.method6489(4, -1867960148);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4196 == class109.current) {
			Class149.anInt1687 = buf.method9614(-1220398584) * -1488333997;
			Class282.anInt3078 = (buf.method9657((byte) 78) << 3) * -194233733;
			Class197.anInt2202 = (buf.readSignedC(1388887595) << 3) * -179720455;
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4229 == class109.current) {
			int i_420_ = buf.readUnsignedByte((byte) 90);
			int i_421_ = i_420_ >> 5;
			int i_422_ = i_420_ & 0x1f;
			if (0 == i_422_) {
				client.aClass96Array11016[i_421_] = null;
				class109.current = null;
				return true;
			}
			Class96 class96 = new Class96();
			class96.anInt1224 = i_422_ * 926140121;
			class96.anInt1225 = buf.readUnsignedByte((byte) 87) * -1424865601;
			if (class96.anInt1225 * 1574185279 >= 0
					&& (class96.anInt1225 * 1574185279 < Class215.aClass151Array2271.length)) {
				if (1 == class96.anInt1224 * -411936407 || class96.anInt1224 * -411936407 == 10) {
					class96.anInt1216 = (buf.readUnsignedShort(-766229862) * -896708503);
					class96.anInt1223 = (buf.readUnsignedShort(-60708466) * 1563819001);
					buf.pointer += -529928404;
				} else if (class96.anInt1224 * -411936407 >= 2 && -411936407 * class96.anInt1224 <= 6) {
					if (class96.anInt1224 * -411936407 == 2) {
						class96.anInt1218 = 2009686272;
						class96.anInt1219 = -1707467520;
					}
					if (-411936407 * class96.anInt1224 == 3) {
						class96.anInt1218 = 0;
						class96.anInt1219 = -1707467520;
					}
					if (4 == class96.anInt1224 * -411936407) {
						class96.anInt1218 = -275594752;
						class96.anInt1219 = -1707467520;
					}
					if (class96.anInt1224 * -411936407 == 5) {
						class96.anInt1218 = 2009686272;
						class96.anInt1219 = 0;
					}
					if (6 == class96.anInt1224 * -411936407) {
						class96.anInt1218 = 2009686272;
						class96.anInt1219 = 880032256;
					}
					class96.anInt1224 = 1852280242;
					class96.anInt1217 = (buf.readUnsignedByte((byte) 69) * 702340923);
					Class578 class578 = client.aClass495_10935.method5966(1273279609);
					class96.anInt1218 += ((buf.readUnsignedShort(-308914199) - class578.anInt7607 * 961465569) << 9)
							* 611830113;
					class96.anInt1219 += ((buf.readUnsignedShort(-1962169521) - class578.anInt7608 * -173815201) << 9)
							* 1603942941;
					class96.anInt1220 = ((buf.readUnsignedByte((byte) 85) << 2) * -1857001747);
					class96.anInt1222 = (buf.readUnsignedShort(-2059814148) * -601804101);
				}
				class96.anInt1221 = buf.readInt(-470142860) * 2003470403;
				client.aClass96Array11016[i_421_] = class96;
			}
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4287) {
			int i_423_ = buf.readUnsignedByte((byte) 124);
			int i_424_ = buf.method9645((short) 11384);
			if (client.aClass527Array11010[i_423_] != null) {
				client.aClass527Array11010[i_423_].method6417(client.aClass495_10935.method5973((byte) 18),
						-1919742742);
				client.aClass527Array11010[i_423_] = null;
			}
			if (i_424_ != -1)
				client.aClass527Array11010[i_423_] = new Class527(Class587.aClass173_7714, buf, i_424_);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4169) {
			int i_425_ = buf.readLEInt((short) 16385);
			int i_426_ = buf.readInt(-9196894);
			int i_427_ = buf.readLEShortA(2031728139);
			Class52.method918(-515508211);
			Class41.modelOnIComponent(i_426_, 3, i_427_, i_425_, 430431939);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4244 == class109.current) {
			String string = buf.readString(1428540430);
			Class581.method6977(string, 1845845248);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4272 == class109.current) {
			ScenePacketType.decodeScenePacket(ScenePacketType.aClass401_4435, -1589528648);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.VARC_SMALL == class109.current) {
			int key = buf.readUnsignedShort(-1784992145);
			byte val = buf.readSignedS(-1957985307);
			if (Launcher.DUMP_VARCS == true) {
				Launcher.sendVarc(key, val);
			}
			Class52.method918(-1247538985);
			Class588.setVarc(key, val, (short) 20251);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4208) {
			int i_430_ = buf.readUnsignedA((byte) -63);
			int i_431_ = buf.readShortA((byte) -31);
			if (65535 == i_431_)
				i_431_ = -1;
			int i_432_ = buf.readUnsignedA((byte) -72);
			String string = buf.readString(1154119046);
			if (i_430_ >= 1 && i_430_ <= 8) {
				if (string.equalsIgnoreCase("null"))
					string = null;
				client.aStringArray11039[i_430_ - 1] = string;
				client.anIntArray11038[i_430_ - 1] = i_431_;
				client.aBoolArray10875[i_430_ - 1] = 0 == i_432_;
			}
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4296 == class109.current) {
			int i_433_ = buf.readUnsignedA((byte) -86);
			int i_434_ = buf.readUnsignedByte((byte) 32);
			int i_435_ = buf.method9614(-1220398584);
			client.aClass217_11028.method3071(i_434_, -1967073289).method2876(i_435_, i_433_, 1954706701);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4344 == class109.current) {
			int i_436_ = buf.readUnsignedShort(-184515686);
			int i_437_ = buf.readUnsignedShort(-1786072618);
			Class365.aClass218_3848.method3127(i_436_, i_437_, -1094343182);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4251) {
			int i_438_ = buf.readIntB(1269896661);
			int i_439_ = buf.readIntB(-2054768864);
			Class52.method918(-374506070);
			Class272.method3693(i_439_, i_438_, (byte) 123);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4191) {
			int i_440_ = buf.readIntB(-1100106620);
			Class52.method918(-669738590);
			Class528_Sub39 class528_sub39 = ((Class528_Sub39) client.aClass692_11097.method8137(i_440_));
			if (null != class528_sub39)
				Class279.method3735(class528_sub39, true, false, -1816585969);
			if (null != client.aClass229_11059) {
				Class39.method811(client.aClass229_11059, 1435904523);
				client.aClass229_11059 = null;
			}
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4226) {
			int i_441_ = buf.readUnsignedA((byte) -13);
			int i_442_ = buf.readUnsignedByte((byte) 122);
			int i_443_ = buf.readIntB(-301972712);
			int i_444_ = buf.readUnsignedByte((byte) 11);
			int i_445_ = buf.readIntB(-1575954226);
			int i_446_ = i_445_ >> 28;
			int i_447_ = i_445_ >> 14 & 0x3fff;
			int i_448_ = i_445_ & 0x3fff;
			Class365.aClass218_3848.method3108(i_443_, i_441_, true, i_446_, i_447_ << 9, i_448_ << 9, i_444_ << 9,
					i_442_ << 9, (byte) -127);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4203) {
			if (Class700.aBool8733 && Class207.aFrame2236 != null)
				Class289.method3875(Class514.aClass528_Sub38_6967.aClass691_Sub3_10593.method9844((byte) 115), -1, -1,
						false, 2130003981);
			byte[] is = new byte[class109.anInt1383 * 1841403963 - 1];
			boolean bool = buf.readUnsignedByte((byte) 110) == 1;
			buf.method10619(is, 0, 1841403963 * (class109.anInt1383) - 1, 1834484019);
			ByteBuffer class528_sub42 = new ByteBuffer(is);
			String string = class528_sub42.readString(505188124);
			if (bool) {
				String string_449_ = class528_sub42.readString(437246578);
				if (string_449_.length() == 0)
					string_449_ = string;
				if (!client.aBool10853 || Class312.aString3440.startsWith("mac")
						|| !Class298.method3988(string, 1, Class398.aClass398_4406.method4818(-1572034177), 1924366953))
					Class215.method3016(string_449_, true, client.aBool10869, -1144387224);
			} else
				Class215.method3016(string, true, client.aBool10869, -632912529);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4306) {
			Class690_Sub1_Sub1.method10629(-1458149567);
			class109.current = null;
			return false;
		}
		if (class109.current == IncomingPacket.NPC_UPDATE) {
			NPC.decodeNPCUpdate((1714247459 * client.aClass495_10935.anInt5577), 352817422);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4156 == class109.current) {
			int i_450_ = buf.readLEInt((short) 16385);
			int i_451_ = buf.readShortA((byte) -9);
			Class52.method918(-1642551883);
			Class378_Sub1_Sub1.method10346(i_451_, i_450_, -1725145533);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4193 == class109.current) {
			int i_452_ = buf.readUnsignedShort(-2143438304);
			int i_453_ = buf.readUnsignedShort(-1058304344);
			int i_454_ = buf.readUnsignedShort(-987119103);
			Class52.method918(-1545053723);
			if (Class380.aClass226Array3970[i_452_] != null) {
				for (int i_455_ = i_453_; i_455_ < i_454_; i_455_++) {
					int i_456_ = buf.readTriByte(-1437665314);
					if (i_455_ < (Class380.aClass226Array3970[i_452_].aClass229Array2336).length
							&& null != (Class380.aClass226Array3970[i_452_].aClass229Array2336[i_455_]))
						Class380.aClass226Array3970[i_452_].aClass229Array2336[i_455_].anInt2375 = i_456_ * 183587469;
				}
			}
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4231 == class109.current) {
			String string = buf.readString(934051043);
			int i_457_ = buf.readInt(457223025);
			Class52.method918(-1942968164);
			Class254.method3446(i_457_, string, (byte) 114);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4275 == class109.current) {
			boolean bool = buf.readUnsignedS(1967743308) == 1;
			Class52.method918(133574193);
			Class213.aBool2255 = bool;
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4206 == class109.current) {
			int i_458_ = buf.readInt(-936326504);
			int i_459_ = buf.readInt(-1043188124);
			Class52.method918(-1727960600);
			Class41.modelOnIComponent(i_459_, 1, i_458_, -1, 430431939);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4248) {
			int i_460_ = buf.readUnsignedShort(-1594208797);
			Class365.aClass218_3848.method3089(i_460_, 2130974697);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4319) {
			ScenePacketType.decodeScenePacket(ScenePacketType.aClass401_4434, -1671710243);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4236 == class109.current) {
			int i_461_ = buf.readUnsignedShort(-1749520714);
			if (i_461_ == 65535)
				i_461_ = -1;
			int i_462_ = buf.readUnsignedByte((byte) 9);
			int i_463_ = buf.readUnsignedShort(-1198611476);
			int i_464_ = buf.readUnsignedByte((byte) 106);
			int i_465_ = buf.readUnsignedShort(284067557);
			Class365.aClass218_3848.method3104(Class196.aClass196_2195, i_461_, i_462_, i_464_,
					Class188.aClass188_2130.method2758(-1560776500), Class202.aClass202_2211, 0.0F, 0.0F, null, 0,
					i_465_, i_463_, -2076015702);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4315) {
			Class220.aClass141_2325 = new Class141(Class320.aClass95_Sub1_Sub1_3466);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.KEEP_ALIVE == class109.current) {
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4212) {
			int i_466_ = buf.readUnsignedByte((byte) 105);
			i_466_ = -i_466_ - 2;
			client.aMap11026.remove(Integer.valueOf(i_466_));
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4167) {
			ScenePacketType.decodeScenePacket(ScenePacketType.aClass401_4440, -1516366881);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.aClass396_4194 == class109.current) {
			String string = buf.readString(943971491);
			Class445_Sub5.method9222(string, false, false, 2008672007);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4311) {
			if (client.anInt10978 * 2088127151 != -1)
				Class539.method6616(client.anInt10978 * 2088127151, 0, (byte) -57);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4267) {
			client.anInt11103 = 1380074711 * client.anInt11018;
			boolean bool = buf.readUnsignedByte((byte) 87) == 1;
			Class347 class347 = new Class347(buf);
			Class528_Sub36 class528_sub36;
			if (bool)
				class528_sub36 = Class272.aClass528_Sub36_2903;
			else
				class528_sub36 = Class206.aClass528_Sub36_2231;
			class347.method4539(class528_sub36, (byte) 76);
			class109.current = null;
			return true;
		}
		if (IncomingPacket.SEND_CS2SCRIPT == class109.current) {
			String string = buf.readString(2055019244);
			Object[] objects = new Object[string.length() + 1];
			for (int i_467_ = string.length() - 1; i_467_ >= 0; i_467_--) {
				if (string.charAt(i_467_) == 's')
					objects[i_467_ + 1] = buf.readString(1676082043);
				else
					objects[i_467_ + 1] = new Integer(buf.readInt(141953392));
			}
			objects[0] = new Integer(buf.readInt(-642208455));
			Class52.method918(-729911053);
			Class528_Sub30 class528_sub30 = new Class528_Sub30();
			class528_sub30.anObjectArray10460 = objects;
			Class555.method6741(class528_sub30, (short) 2099);
			class109.current = null;
			return true;
		}
		if (class109.current == IncomingPacket.aClass396_4346) {
			while (buf.pointer * -185904669 < 1841403963 * class109.anInt1383) {
				int i_468_ = buf.readUnsignedByte((byte) 56);
				boolean bool = 1 == (i_468_ & 0x1);
				String string = buf.readString(1309435728);
				String string_469_ = buf.readString(1304113824);
				String string_470_ = buf.readString(1155170849);
				for (int i_471_ = 0; i_471_ < -1924608781 * client.anInt11024; i_471_++) {
					Class33 class33 = client.aClass33Array11164[i_471_];
					if (bool) {
						if (string_469_.equals(class33.aString311)) {
							class33.aString311 = string;
							class33.aString313 = string_469_;
							string = null;
							break;
						}
					} else if (string.equals(class33.aString311)) {
						class33.aString311 = string;
						class33.aString313 = string_469_;
						class33.aString310 = string_470_;
						string = null;
						break;
					}
				}
				if (string != null && -1924608781 * client.anInt11024 < 400) {
					Class33 class33 = new Class33();
					client.aClass33Array11164[-1924608781 * client.anInt11024] = class33;
					class33.aString311 = string;
					class33.aString313 = string_469_;
					class33.aString310 = string_470_;
					class33.aBool312 = 2 == (i_468_ & 0x2);
					client.anInt11024 += 1925524539;
				}
			}
			client.anInt11166 = -943047031 * client.anInt11018;
			class109.current = null;
			return true;
		}
		if (IncomingPacket.STATIC_REGION == class109.current) {
			BitBuffer buffer = new BitBuffer(class109.anInt1383 * 1841403963);
			System.arraycopy((class109.aClass528_Sub42_Sub2_1378.payload),
					(class109.aClass528_Sub42_Sub2_1378.pointer) * -185904669, buffer.payload, 0,
					1841403963 * class109.anInt1383);
			Class209.method2944(-406907096);
			if (Class514.aClass528_Sub38_6967.aClass691_Sub31_10602.method10076(-740804623) == 1)
				Class590.aClass488_7736.method5895(new Class498(Class489.STATIC, buffer), -278110903);
			else
				client.aClass495_10935.method5990(new Class498(Class489.STATIC, buffer), 1268833808);
			class109.current = null;
			return false;
		}
		if (IncomingPacket.FRIEND_CHAT_MESSAGE == class109.current) {
			boolean bool = buf.readUnsignedByte((byte) 5) == 1;
			String string = buf.readString(1707315620);
			String string_473_ = string;
			if (bool)
				string_473_ = buf.readString(-29460001);
			String string_474_ = buf.readString(479951100);
			long l = buf.readUnsignedShort(401245535);
			long l_475_ = buf.readTriByte(-2008596449);
			Class384 class384 = ((Class384) Class443.method5321(Class384.method4732((byte) 84),
					buf.readUnsignedByte((byte) 43), 1688432565));
			int i_476_ = buf.readUnsignedShort(-1491192504);
			long l_477_ = (l << 32) + l_475_;
			boolean bool_478_ = false;
			while_56_: do {
				for (int i_479_ = 0; i_479_ < 100; i_479_++) {
					if (client.aLongArray11131[i_479_] == l_477_) {
						bool_478_ = true;
						break while_56_;
					}
				}
				if (class384.aBool3989 && Class528_Sub15.method9402(string_473_, -21522923))
					bool_478_ = true;
			} while (false);
			if (!bool_478_) {
				client.aLongArray11131[-2093267487 * client.anInt11132] = l_477_;
				client.anInt11132 = 1231011361 * ((client.anInt11132 * -2093267487 + 1) % 100);
				String string_480_ = Class33.aClass46_314.method861(i_476_, (byte) -52).method10479(buf, (byte) 16);
				if (-1 != 783584497 * class384.anInt3987)
					Class227.method3182(20, 0,
							new StringBuilder().append(Class411.method4906((783584497 * class384.anInt3987), (byte) 93))
									.append(string).toString(),
							new StringBuilder().append(Class411.method4906((783584497 * class384.anInt3987), (byte) 65))
									.append(string_473_).toString(),
							string, string_480_, string_474_, i_476_, class384, -1345460943);
				else
					Class227.method3182(20, 0, string, string_473_, string, string_480_, string_474_, i_476_, class384,
							-1345460943);
			}
			class109.current = null;
			return true;
		}
		VarDomainType
				.method5340(
						new StringBuilder()
								.append(class109.current != null ? 1548242725 * class109.current.anInt4215 : -1)
								.append(Class49.aString555)
								.append(null != class109.aClass396_1385 ? 1548242725 * class109.aClass396_1385.anInt4215
										: -1)
								.append(Class49.aString555)
								.append(null != class109.aClass396_1390 ? class109.aClass396_1390.anInt4215 * 1548242725
										: -1)
								.append(" ").append(class109.anInt1383 * 1841403963).toString(),
						new RuntimeException(), 2091612405);
		Class416.method4969(false, 5126206);
		return true;
	}

	PacketDecoder(Class207 class207, ByteBuffer class528_sub42) {
		this.this$0 = class207;
		this.anInt2229 = class528_sub42.readUnsignedShort(-1358036835) * -1645449195;
	}

	static final void method2913(Class648 class648, int i) {
		int i_0_ = (class648.anIntArray8394[(class648.anInt8395 -= 1239022665) * 717927929]);
		Class229 class229 = Class623_Sub1.method9755(i_0_, (byte) -23);
		Class226 class226 = Class380.aClass226Array3970[i_0_ >> 16];
		Class238.method3295(class229, class226, class648, 1070847419);
	}

	static final void method2914(Class648 class648, int i) {
		Class528_Sub19 class528_sub19 = (Class528_Sub19) (class648.anObjectArray8396[(class648.anInt8410 -= 1600226731)
				* -520794877]);
		class648.anIntArray8394[(class648.anInt8395 += 1239022665) * 717927929 - 1] = class528_sub19.anInt10392
				* 1627467229;
	}

	static final void method2915(Class648 class648, int i) {
		class648.anIntArray8394[(class648.anInt8395 += 1239022665) * 717927929 - 1] = 1957227505
				* class648.aClass308_8391.anInt3389;
	}

	static final void method2916(Class648 class648, int i) {
		int i_1_ = (class648.anIntArray8394[(class648.anInt8395 -= 1239022665) * 717927929]);
		int i_2_ = i_1_ >> 16;
		if (Class380.aClass226Array3970[i_2_] == null)
			class648.anIntArray8394[((class648.anInt8395 += 1239022665) * 717927929 - 1)] = 0;
		else
			class648.anIntArray8394[((class648.anInt8395 += 1239022665) * 717927929
					- 1)] = (Class380.aClass226Array3970[i_2_].aClass229Array2336[i_1_].anInt2375) * 1308082245;
	}

	static void method2917(Class648 class648, int i) {
		class648.anIntArray8394[(class648.anInt8395 += 1239022665) * 717927929 - 1] = Class423.method5108((byte) 1);
	}

	static final void method2919(Class648 class648, int i) {
		class648.anIntArray8394[(class648.anInt8395 += 1239022665) * 717927929
				- 1] = Class514.aClass528_Sub38_6967.aClass691_Sub12_10590.method9913((byte) 0) ? 1 : 0;
	}
}
