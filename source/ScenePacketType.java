/* ScenePacketType - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ScenePacketType
{
    public static ScenePacketType aClass401_4434;
    public static ScenePacketType aClass401_4435;
    public static ScenePacketType aClass401_4436;
    public static ScenePacketType aClass401_4437;
    public static ScenePacketType aClass401_4438;
    public static ScenePacketType aClass401_4439;
    public static ScenePacketType aClass401_4440;
    public static ScenePacketType aClass401_4441;
    public static ScenePacketType aClass401_4442;
    public static ScenePacketType aClass401_4443;
    public static ScenePacketType aClass401_4444;
    public static ScenePacketType aClass401_4445 = new ScenePacketType(2);
    public static ScenePacketType aClass401_4446;
    public static ScenePacketType aClass401_4447;
    public static ScenePacketType aClass401_4448;
    
    ScenePacketType(int i) {
	/* empty */
    }
    
    static {
	aClass401_4434 = new ScenePacketType(5);
	aClass401_4436 = new ScenePacketType(18);
	aClass401_4437 = new ScenePacketType(5);
	aClass401_4435 = new ScenePacketType(7);
	aClass401_4446 = new ScenePacketType(9);
	aClass401_4442 = new ScenePacketType(-1);
	aClass401_4441 = new ScenePacketType(6);
	aClass401_4438 = new ScenePacketType(7);
	aClass401_4443 = new ScenePacketType(7);
	aClass401_4444 = new ScenePacketType(8);
	aClass401_4440 = new ScenePacketType(3);
	aClass401_4439 = new ScenePacketType(10);
	aClass401_4447 = new ScenePacketType(-1);
	aClass401_4448 = new ScenePacketType(21);
    }
    
    static void method4842(int i) {
	Class581.aTwitchWebcamDeviceArray7641
	    = Canvas_Sub1.aTwitchTV11693.GetWebcamDevices();
    }
    
    static final void method4843(Class648 class648, int i) {
	Class398.aClass398_4413.method4821(72229853);
    }
    
    static final void method4844(Class648 class648, int i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class239 class239
	    = ((Class239)
	       Class208.aClass5_Sub6_2238.method63(i_0_, -1349375849));
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 879785891 * class239.anInt2607;
    }
    
    static final void method4845(Class648 class648, int i) {
	int i_1_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub15_10566
		  .method8126(i_1_, -1955030095);
    }
    
    public static boolean method4846(int i, int i_2_) {
	return (8 == i || i == 6 || 10 == i || 2 == i || i == 14 || i == 4
		|| 16 == i);
    }

	static final void decodeScenePacket(ScenePacketType type, int i) {
		BitBuffer buf = client.aClass109_10930.aClass528_Sub42_Sub2_1378;
		if (type == aClass401_4445) {
			int i_11_ = buf.method9614(-1220398584);
			int i_12_ = i_11_ >> 2;
			int i_13_ = i_11_ & 0x3;
			int i_14_ = client.anIntArray10941[i_12_];
			int i_15_ = buf.readUnsignedA((byte) -59);
			int i_16_ = Class197.anInt2202 * 1443738441 + (i_15_ >> 4 & 0x7);
			int i_17_ = (i_15_ & 0x7) + Class282.anInt3078 * 1582077107;
			if (client.gameScene.method6037((byte) -103).method5911(-258518980)
					|| (i_16_ >= 0 && i_17_ >= 0 && i_16_ < client.gameScene.method6029((short) 4373)
							&& i_17_ < client.gameScene.method5967(-202821655)))
				Class66.method1067(Class149.anInt1687 * -457709349, i_16_, i_17_, i_14_, -1, i_12_, i_13_, 1751810315);
		} else if (type == aClass401_4438) {
			int i_18_ = buf.method9614(-1220398584);
			Class578 class578 = client.gameScene.method5966(1273279609);
			int i_19_ = (i_18_ & 0x7) + 1582077107 * Class282.anInt3078;
			int i_20_ = class578.anInt7608 * -173815201 + i_19_;
			int i_21_ = Class197.anInt2202 * 1443738441 + (i_18_ >> 4 & 0x7);
			int i_22_ = i_21_ + 961465569 * class578.anInt7607;
			int i_23_ = buf.readLEShortA(1148497881);
			int i_24_ = buf.readUnsignedShort((short) 26651);
			int i_25_ = buf.readLEShortA(1402472968);
			if (-1453744879 * client.anInt11025 != i_23_) {
				boolean bool = (i_21_ >= 0 && i_19_ >= 0 && i_21_ < client.gameScene.method6029((short) 11216)
						&& i_19_ < client.gameScene.method5967(-476995539));
				if (bool || client.gameScene.method6037((byte) -7).method5911(-94213487)) {
					Class394.method4806(Class149.anInt1687 * -457709349, i_22_, i_20_, new Class528_Sub1(i_24_, i_25_),
							(byte) -70);
					if (bool)
						Class17.method645(Class149.anInt1687 * -457709349, i_21_, i_19_, (byte) -108);
				}
			}
		} else if (type == aClass401_4443) {
			int i_26_ = buf.readUnsignedByte((byte) 13);
			Class578 class578 = client.gameScene.method5966(1273279609);
			int i_27_ = (i_26_ & 0x7) + 1582077107 * Class282.anInt3078;
			int i_28_ = -173815201 * class578.anInt7608 + i_27_;
			int i_29_ = 1443738441 * Class197.anInt2202 + (i_26_ >> 4 & 0x7);
			int i_30_ = class578.anInt7607 * 961465569 + i_29_;
			int i_31_ = buf.readUnsignedShort(623593072);
			int i_32_ = buf.readUnsignedShort(-98104615);
			int i_33_ = buf.readUnsignedShort(328401279);
			if (client.aClass692_11042 != null) {
				Class528_Sub2 class528_sub2 = ((Class528_Sub2) (client.aClass692_11042
						.method8137(Class149.anInt1687 * -457709349 << 28 | i_28_ << 14 | i_30_)));
				if (null != class528_sub2) {
					for (Class528_Sub1 class528_sub1 = (Class528_Sub1) class528_sub2.aClass688_10201.method8034(
							1022467876); null != class528_sub1; class528_sub1 = (Class528_Sub1) class528_sub2.aClass688_10201
									.method8037(1070610295)) {
						if (class528_sub1.anInt10200 * -48406585 == i_31_
								&& i_32_ == (class528_sub1.anInt10199) * -459162289) {
							class528_sub1.method6443(-1948567511);
							class528_sub1.anInt10199 = i_33_ * 552024495;
							Class394.method4806((Class149.anInt1687 * -457709349), i_30_, i_28_, class528_sub1,
									(byte) -121);
							break;
						}
					}
					if (i_29_ >= 0 && i_27_ >= 0 && (i_29_ < client.gameScene.method6029((short) 28965))
							&& (i_27_ < client.gameScene.method5967(925431184)))
						Class17.method645(Class149.anInt1687 * -457709349, i_29_, i_27_, (byte) -7);
				}
			}
		} else if (aClass401_4444 == type) {
			int i_34_ = buf.readUnsignedByte((byte) 27);
			int i_35_ = 1443738441 * Class197.anInt2202 + (i_34_ >> 4 & 0x7);
			int i_36_ = (i_34_ & 0x7) + Class282.anInt3078 * 1582077107;
			int i_37_ = buf.readUnsignedShort(-737002701);
			if (i_37_ == 65535)
				i_37_ = -1;
			int i_38_ = buf.readUnsignedByte((byte) 58);
			int i_39_ = i_38_ >> 4 & 0xf;
			int i_40_ = i_38_ & 0x7;
			int i_41_ = buf.readUnsignedByte((byte) 6);
			int i_42_ = buf.readUnsignedByte((byte) 113);
			int i_43_ = buf.readUnsignedShort(154331188);
			if (client.gameScene.method6037((byte) -102) != Class489.aClass489_5499) {
				if (i_35_ >= 0 && i_36_ >= 0 && i_35_ < client.gameScene.method6029((short) 5196)
						&& i_36_ < client.gameScene.method5967(148221239)) {
					int i_44_ = 1 + i_39_;
					if ((Class108.myPlayer.sceneXQueue[0]) >= i_35_ - i_44_
							&& (Class108.myPlayer.sceneXQueue[0]) <= i_35_ + i_44_
							&& (Class108.myPlayer.sceneYQueue[0]) >= i_36_ - i_44_
							&& (Class108.myPlayer.sceneYQueue[0]) <= i_36_ + i_44_) {
						Class422 class422 = new Class422(i_35_ << 9, 0.0F, i_36_ << 9);
						int i_45_ = Class149.anInt1687 * -457709349;
						Class365.aClass218_3848.method3104(Class196.aClass196_2195, i_37_, i_40_, i_42_,
								Class188.aClass188_2130.method2758(-1560776500), Class202.aClass202_2215, 0.0F,
								i_39_ << 9, class422, i_45_, i_43_, i_41_, 1564372012);
					}
				}
			}
		} else if (type == aClass401_4434) {
			int i_46_ = buf.readUnsignedShort(-1393789954);
			int i_47_ = buf.readUnsignedS(-768316533);
			Class578 class578 = client.gameScene.method5966(1273279609);
			int i_48_ = Class282.anInt3078 * 1582077107 + (i_47_ & 0x7);
			int i_49_ = class578.anInt7608 * -173815201 + i_48_;
			int i_50_ = Class197.anInt2202 * 1443738441 + (i_47_ >> 4 & 0x7);
			int i_51_ = class578.anInt7607 * 961465569 + i_50_;
			int i_52_ = buf.readUnsignedShort(-298808926);
			boolean bool = (i_50_ >= 0 && i_48_ >= 0 && i_50_ < client.gameScene.method6029((short) 24948)
					&& i_48_ < client.gameScene.method5967(2016423593));
			if (bool || client.gameScene.method6037((byte) -59).method5911(-1544252217)) {
				Class394.method4806(-457709349 * Class149.anInt1687, i_51_, i_49_, new Class528_Sub1(i_52_, i_46_),
						(byte) -121);
				if (bool)
					Class17.method645(-457709349 * Class149.anInt1687, i_50_, i_48_, (byte) -78);
			}
		} else if (type == aClass401_4436) {
			int i_53_ = buf.readUnsignedByte((byte) 31);
			boolean bool = (i_53_ & 0x80) != 0;
			int i_54_ = Class197.anInt2202 * 1443738441 + (i_53_ >> 3 & 0x7);
			int i_55_ = (i_53_ & 0x7) + 1582077107 * Class282.anInt3078;
			int i_56_ = i_54_ + buf.method9627(-2107726397);
			int i_57_ = i_55_ + buf.method9627(-1302304054);
			int i_58_ = buf.method9642(-1973114277);
			int i_59_ = buf.readUnsignedShort(349785695);
			int i_60_ = buf.readUnsignedByte((byte) 118) * 4;
			int i_61_ = buf.readUnsignedByte((byte) 18) * 4;
			int i_62_ = buf.readUnsignedShort(-1791539697);
			int i_63_ = buf.readUnsignedShort(-439171776);
			int i_64_ = buf.readUnsignedByte((byte) 86);
			int i_65_ = buf.readUnsignedShort(-1715442419);
			int i_66_ = buf.method9642(1841340637);
			if (255 == i_64_)
				i_64_ = -1;
			if (client.gameScene.method6037((byte) -60) != Class489.aClass489_5499) {
				if (i_54_ >= 0 && i_55_ >= 0 && i_54_ < client.gameScene.method6029((short) 9933)
						&& i_55_ < client.gameScene.method5967(995722328) && i_56_ >= 0 && i_57_ >= 0
						&& i_56_ < client.gameScene.method6029((short) 19234)
						&& i_57_ < client.gameScene.method5967(1056215627) && 65535 != i_59_) {
					i_54_ = 512 * i_54_ + 256;
					i_55_ = 256 + 512 * i_55_;
					i_56_ = i_56_ * 512 + 256;
					i_57_ = 512 * i_57_ + 256;
					i_60_ <<= 2;
					i_61_ <<= 2;
					i_65_ <<= 2;
					Class645_Sub1_Sub5_Sub6 class645_sub1_sub5_sub6 = (new Class645_Sub1_Sub5_Sub6(
							client.gameScene.method5973((byte) 60), i_59_, Class149.anInt1687 * -457709349,
							Class149.anInt1687 * -457709349, i_54_, i_55_, i_60_, client.anInt11127 + i_62_,
							client.anInt11127 + i_63_, i_64_, i_65_, 0, i_58_, i_61_, bool, -1, i_66_));
					class645_sub1_sub5_sub6
							.method10883(i_56_,
									i_57_, Class335_Sub1_Sub1.method10374(i_56_, i_57_,
											(-457709349 * Class149.anInt1687), -759833206) - i_61_,
							i_62_ + client.anInt11127, -981034789);
					client.aClass688_11043.method8031(new Class528_Sub21_Sub10(class645_sub1_sub5_sub6), (byte) -90);
				}
			}
		} else if (aClass401_4440 == type) {
			int i_67_ = buf.readUnsignedS(2051518750);
			Class578 class578 = client.gameScene.method5966(1273279609);
			int i_68_ = 1582077107 * Class282.anInt3078 + (i_67_ & 0x7);
			int i_69_ = i_68_ + -173815201 * class578.anInt7608;
			int i_70_ = (i_67_ >> 4 & 0x7) + Class197.anInt2202 * 1443738441;
			int i_71_ = i_70_ + 961465569 * class578.anInt7607;
			int i_72_ = buf.readUnsignedShort(-1912160999);
			Class528_Sub2 class528_sub2 = ((Class528_Sub2) (client.aClass692_11042
					.method8137(Class149.anInt1687 * -457709349 << 28 | i_69_ << 14 | i_71_)));
			if (null != class528_sub2) {
				for (Class528_Sub1 class528_sub1 = (Class528_Sub1) class528_sub2.aClass688_10201.method8034(
						1587826451); class528_sub1 != null; class528_sub1 = (Class528_Sub1) class528_sub2.aClass688_10201
								.method8037(1953601592)) {
					if (-48406585 * class528_sub1.anInt10200 == i_72_) {
						class528_sub1.method6443(-142507785);
						break;
					}
				}
				if (class528_sub2.aClass688_10201.method8040((byte) -98))
					class528_sub2.method6443(-2058941656);
				if (i_70_ >= 0 && i_68_ >= 0 && i_70_ < client.gameScene.method6029((short) 13890)
						&& i_68_ < client.gameScene.method5967(1038753764))
					Class17.method645(-457709349 * Class149.anInt1687, i_70_, i_68_, (byte) -54);
			}
		} else if (aClass401_4439 == type) {
			int i_73_ = buf.readUnsignedByte((byte) 71);
			int i_74_ = Class197.anInt2202 * 1443738441 + (i_73_ >> 4 & 0x7);
			int i_75_ = (i_73_ & 0x7) + Class282.anInt3078 * 1582077107;
			int i_76_ = buf.readUnsignedShort(-1783425158);
			if (65535 == i_76_)
				i_76_ = -1;
			int i_77_ = buf.readUnsignedShort(-1905961445);
			int i_78_ = buf.readUnsignedShort(-61208222);
			int i_79_ = buf.readUnsignedByte((byte) 122);
			int i_80_ = buf.method9642(1844786865);
			if (client.gameScene.method6037((byte) -58) != Class489.aClass489_5499) {
				if (i_74_ >= 0 && i_75_ >= 0 && i_74_ < client.gameScene.method6029((short) 8835)
						&& i_75_ < client.gameScene.method5967(533717449)) {
					if (i_76_ == -1) {
						Class528_Sub21_Sub19 class528_sub21_sub19 = ((Class528_Sub21_Sub19) client.aClass692_11044
								.method8137(i_74_ << 16 | i_75_));
						if (null != class528_sub21_sub19) {
							class528_sub21_sub19.aClass645_Sub1_Sub5_Sub4_11688.method10848(-109967528);
							class528_sub21_sub19.method6443(-835420073);
						}
					} else {
						int i_81_ = i_74_ * 512 + 256;
						int i_82_ = 256 + i_75_ * 512;
						int i_83_ = Class149.anInt1687 * -457709349;
						if (i_83_ < 3
								&& client.gameScene.method6006((byte) 0).method5633(i_74_, i_75_, (short) 9800))
							i_83_++;
						Class645_Sub1_Sub5_Sub4 class645_sub1_sub5_sub4 = (new Class645_Sub1_Sub5_Sub4(
								client.gameScene.method5973((byte) 40), i_76_, i_78_,
								-457709349 * Class149.anInt1687,
								i_83_, i_81_, (Class335_Sub1_Sub1.method10374(i_81_, i_82_,
										-457709349 * Class149.anInt1687, -759833206)) - i_77_,
								i_82_, i_74_, i_74_, i_75_, i_75_, i_79_, false, i_80_));
						client.aClass692_11044.method8142(new Class528_Sub21_Sub19(class645_sub1_sub5_sub4),
								i_74_ << 16 | i_75_);
					}
				}
			}
		} else if (type == aClass401_4447) {
			int i_84_ = buf.readUnsignedByte((byte) 17);
			int i_85_ = buf.method9614(-1220398584);
			int i_86_ = i_85_ >> 2;
			int i_87_ = client.anIntArray10941[i_86_];
			int i_88_ = buf.method9675(2057655606);
			int i_89_ = buf.method9614(-1220398584);
			int i_90_ = (i_89_ >> 4 & 0x7) + 1443738441 * Class197.anInt2202;
			int i_91_ = Class282.anInt3078 * 1582077107 + (i_89_ & 0x7);
			if (i_86_ == 1922173025 * Class605.aClass605_7912.anInt7905)
				i_86_ = Class605.aClass605_7893.anInt7905 * 1922173025;
			if ((i_84_ & 0x1) == 1)
				Class176.method2568(-457709349 * Class149.anInt1687, i_90_, i_91_, i_87_, i_88_, i_86_, null,
						(byte) -92);
			else {
				int[] is = null;
				if (2 == (i_84_ & 0x2)) {
					int i_92_ = buf.readUnsignedByte((byte) 99);
					is = new int[i_92_];
					for (int i_93_ = 0; i_93_ < i_92_; i_93_++)
						is[i_93_] = buf.readInt(-22323475);
				}
				short[] is_94_ = null;
				if (4 == (i_84_ & 0x4)) {
					int i_95_ = buf.readUnsignedByte((byte) 94);
					is_94_ = new short[i_95_];
					for (int i_96_ = 0; i_96_ < i_95_; i_96_++)
						is_94_[i_96_] = (short) buf.readUnsignedShort(77673412);
				}
				short[] is_97_ = null;
				if (8 == (i_84_ & 0x8)) {
					int i_98_ = buf.readUnsignedByte((byte) 14);
					is_97_ = new short[i_98_];
					for (int i_99_ = 0; i_99_ < i_98_; i_99_++)
						is_97_[i_99_] = (short) buf.readUnsignedShort(-578640951);
				}
				Class176.method2568(-457709349 * Class149.anInt1687, i_90_, i_91_, i_87_, i_88_, i_86_,
						new Class591((Class528_Sub9.aLong10284 * -7985598547616118417L), is, is_94_, is_97_),
						(byte) -12);
				Class528_Sub9.aLong10284 += -2518968052528826993L;
			}
		} else if (type == aClass401_4448) {
			int i_100_ = buf.readUnsignedByte((byte) 110);
			int i_101_ = -1407490414 * Class197.anInt2202 + (i_100_ >> 4 & 0xf);
			int i_102_ = Class282.anInt3078 * -1130813082 + (i_100_ & 0xf);
			int i_103_ = buf.readUnsignedByte((byte) 127);
			boolean bool = (i_103_ & 0x1) != 0;
			boolean bool_104_ = 0 != (i_103_ & 0x2);
			int i_105_ = bool_104_ ? i_103_ >> 2 : -1;
			int i_106_ = i_101_ + buf.method9627(-1199948285);
			int i_107_ = i_102_ + buf.method9627(-1989305229);
			int i_108_ = buf.method9642(470871239);
			int i_109_ = buf.method9642(-60966838);
			int i_110_ = buf.readUnsignedShort(-2144429240);
			int i_111_ = buf.readUnsignedByte((byte) 104);
			if (bool_104_)
				i_111_ = (byte) i_111_;
			else
				i_111_ *= 4;
			int i_112_ = buf.readUnsignedByte((byte) 2) * 4;
			int i_113_ = buf.readUnsignedShort(-715767551);
			int i_114_ = buf.readUnsignedShort(-1592544376);
			int i_115_ = buf.readUnsignedByte((byte) 37);
			int i_116_ = buf.readUnsignedShort(719141808);
			if (i_115_ == 255)
				i_115_ = -1;
			int i_117_ = buf.method9642(-232212453);
			if (client.gameScene.method6037((byte) -65) != Class489.aClass489_5499) {
				if (i_101_ >= 0 && i_102_ >= 0 && (i_101_ < client.gameScene.method6029((short) 21672) * 2)
						&& (i_102_ < client.gameScene.method6029((short) 4303) * 2) && i_106_ >= 0 && i_107_ >= 0
						&& (i_106_ < client.gameScene.method5967(992532573) * 2)
						&& (i_107_ < client.gameScene.method5967(878861586) * 2) && i_110_ != 65535) {
					i_101_ = 256 * i_101_;
					i_102_ = 256 * i_102_;
					i_106_ *= 256;
					i_107_ = 256 * i_107_;
					i_111_ <<= 2;
					i_112_ <<= 2;
					i_116_ <<= 2;
					Class183.method2704(i_110_, i_108_, i_109_, i_105_, i_111_, i_112_, i_101_, i_102_, i_106_, i_107_,
							i_113_, i_114_, i_115_, i_116_, bool, i_117_, (byte) -67);
				}
			}
		} else if (aClass401_4435 == type) {
			int i_118_ = buf.method9675(2080471574);
			int i_119_ = buf.method9614(-1220398584);
			int i_120_ = buf.readUnsignedS(-1006329991);
			int i_121_ = i_120_ >> 2;
			int i_122_ = i_120_ & 0x3;
			int i_123_ = client.anIntArray10941[i_121_];
			int i_124_ = buf.method9614(-1220398584);
			int i_125_ = (i_124_ >> 4 & 0x7) + 1443738441 * Class197.anInt2202;
			int i_126_ = (i_124_ & 0x7) + Class282.anInt3078 * 1582077107;
			if (client.gameScene.method6037((byte) -86) != Class489.aClass489_5499)
				Class552.method6713(-457709349 * Class149.anInt1687, i_125_, i_126_, i_123_, i_121_, i_122_, i_118_,
						i_119_, 1590520992);
		} else if (type == aClass401_4437) {
			int i_127_ = buf.readInt(-684708941);
			int i_128_ = buf.readUnsignedByte((byte) 55);
			((Class596) client.gameScene.method5976((short) 10580).method63(i_127_, -583966095))
					.method7095(i_128_, -330715811);
		} else if (type == aClass401_4441) {
			int i_129_ = buf.readIntB(-1854729195);
			int i_130_ = buf.readUnsignedA((byte) 4);
			int i_131_ = i_130_ >> 2;
			int i_132_ = i_130_ & 0x3;
			int i_133_ = client.anIntArray10941[i_131_];
			int i_134_ = buf.readUnsignedA((byte) -21);
			int i_135_ = (i_134_ >> 4 & 0x7) + 1443738441 * Class197.anInt2202;
			int i_136_ = (i_134_ & 0x7) + Class282.anInt3078 * 1582077107;
			if (client.gameScene.method6037((byte) -82).method5911(-431578029)
					|| (i_135_ >= 0 && i_136_ >= 0 && (i_135_ < client.gameScene.method6029((short) 11338))
							&& i_136_ < client.gameScene.method5967(987621770)))
				Class66.method1067(-457709349 * Class149.anInt1687, i_135_, i_136_, i_133_, i_129_, i_131_, i_132_,
						1601048355);
		} else if (aClass401_4442 == type) {
			buf.readUnsignedByte((byte) 41);
			int i_137_ = buf.readUnsignedByte((byte) 57);
			int i_138_ = (i_137_ >> 4 & 0x7) + 1443738441 * Class197.anInt2202;
			int i_139_ = (i_137_ & 0x7) + 1582077107 * Class282.anInt3078;
			int i_140_ = buf.readUnsignedShort(-1919740921);
			int i_141_ = buf.readUnsignedByte((byte) 62);
			int i_142_ = buf.readTriByte(542294506);
			String string = buf.readString(1377424130);
			if (client.gameScene.method6037((byte) -96) != Class489.aClass489_5499)
				Class38.method805(Class149.anInt1687 * -457709349, i_138_, i_139_, i_141_, i_140_, i_142_, string,
						2022950745);
		} else if (type == aClass401_4446) {
			int i_143_ = buf.readUnsignedByte((byte) 46);
			int i_144_ = 1443738441 * Class197.anInt2202 + (i_143_ >> 4 & 0x7);
			int i_145_ = (i_143_ & 0x7) + Class282.anInt3078 * 1582077107;
			int i_146_ = buf.readUnsignedShort(-39056678);
			if (65535 == i_146_)
				i_146_ = -1;
			int i_147_ = buf.readUnsignedByte((byte) 62);
			int i_148_ = i_147_ >> 4 & 0xf;
			int i_149_ = i_147_ & 0x7;
			int i_150_ = buf.readUnsignedByte((byte) 86);
			int i_151_ = buf.readUnsignedByte((byte) 43);
			int i_152_ = buf.readUnsignedShort(-843462992);
			boolean bool = buf.readUnsignedByte((byte) 58) == 1;
			if (client.gameScene.method6037((byte) -57) != Class489.aClass489_5499) {
				if (i_144_ >= 0 && i_145_ >= 0 && (i_144_ < client.gameScene.method6029((short) 13245))
						&& (i_145_ < client.gameScene.method5967(-453407764))) {
					int i_153_ = 1 + i_148_;
					if ((Class108.myPlayer.sceneXQueue[0]) >= i_144_ - i_153_
							&& (Class108.myPlayer.sceneXQueue[0]) <= i_144_ + i_153_
							&& (Class108.myPlayer.sceneYQueue[0]) >= i_145_ - i_153_
							&& (Class108.myPlayer.sceneYQueue[0]) <= i_145_ + i_153_) {
						Class422 class422 = new Class422(i_144_ << 9, 0.0F, i_145_ << 9);
						int i_154_ = Class149.anInt1687 * -457709349;
						int i_155_ = (bool ? Class188.aClass188_2128.method2758(-1560776500)
								: Class188.aClass188_2130.method2758(-1560776500));
						Class365.aClass218_3848.method3104(Class196.aClass196_2195, i_146_, i_149_, i_151_, i_155_,
								Class202.aClass202_2215, 0.0F, i_148_ << 9, class422, i_154_, i_152_, i_150_,
								-1099653745);
					}
				}
			}
		} else {
			VarDomainType.method5340(new StringBuilder().append("").append(type).toString(), new RuntimeException(),
					2049603010);
			Class416.method4969(false, 5126206);
		}
	}
}
