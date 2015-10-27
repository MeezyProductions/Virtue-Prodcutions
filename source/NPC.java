import java.util.Iterator;

/* NPC - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class NPC extends Entity {
	int anInt12030;
	public int anInt12031 = -327351317;
	public int anInt12032 = -259201889;
	public Class287 aClass287_12033;
	public static int anInt12034 = 519628303;
	public static int anInt12035 = -1410889035;
	int anInt12036;
	public Class281 aClass281_12037;
	public int anInt12038;
	public int anInt12039 = -1702071077;
	int[] anIntArray12040;
	int[] anIntArray12041;
	int anInt12042;
	public Class299 aClass299_12043;
	public String aString12044;
	int anInt12045;
	public int anInt12046;

	public Class528_Sub19 method167() {
		Class578 class578 = client.gameScene.method5966(1273279609);
		return Class49.method891(aByte10675,
				((int) method7693().aClass422_4868.aFloat4780 + class578.anInt7607 * -1650867712),
				-(int) method7693().aClass422_4868.aFloat4776,
				((int) method7693().aClass422_4868.aFloat4777 + 1200930304 * class578.anInt7608), 2046275446);
	}

	public NPC(Class538 class538, int i) {
		super(class538, i, Class664.aClass95_Sub1_Sub1_8460);
		this.anIntArray12040 = new int[6];
		this.anIntArray12041 = new int[6];
		method10897(-1770427728);

	}

	void method10897(int i) {
		this.anInt12042 = (32 + (int) (Math.random() * 4.0)) * -457360359;
		this.anInt12036 = (3 + (int) (Math.random() * 2.0)) * 2045462249;
		this.anInt12030 = (16 + (int) (Math.random() * 3.0)) * -2070609261;
		if (Class514.aClass528_Sub38_6967.aClass691_Sub12_10590.method9915((byte) 1) == 1)
			this.anInt12045 = (int) (Math.random() * 6.0) * -523521135;
		else
			this.anInt12045 = (int) (Math.random() * 12.0) * -523521135;
	}

	public void method10898(Class299 class299, int i) {
		method10899(class299, true, true, true, 1494832557);
	}

	public void method10899(Class299 class299, boolean bool, boolean bool_0_, boolean bool_1_, int i) {
		if (class299 != aClass299_12043 && Class28.aBool273 && Class560.method6813(-34811601 * anInt11783, 1941794191))
			Class666.method7903(878295137);
		aClass299_12043 = class299;
		if (aClass299_12043 != null) {
			if (bool)
				aString12044 = aClass299_12043.aString3269;
			if (bool_0_)
				anInt12038 = aClass299_12043.anInt3266 * 975378287;
			if (bool_1_)
				aClass281_12037 = null;
		}
		if (this.aClass612_11800 != null)
			this.aClass612_11800.method7324();
	}

	@Override
	public Class554 method9780(Class173 class173, int i) {
		return null;
	}

	@Override
	Class549 method9813(Class173 class173, int i) {
		if (aClass299_12043 == null || !method10900(class173, 526336, (byte) 69))
			return null;
		Class433 class433 = method7685();
		Class437 class437 = method7693();
		Class433 class433_2_ = class173.method2479();
		int i_3_ = aClass37_11809.method795(-1358046596);
		Class546 class546 = (aClass538_10676.aClass546ArrayArrayArray7160[aByte10675][(int) class437.aClass422_4868.aFloat4780 >> 9][(int) class437.aClass422_4868.aFloat4777 >> 9]);
		if (class546 != null && null != class546.aClass645_Sub1_Sub4_7397) {
			int i_4_ = (this.anInt11771 * 69507979 - class546.aClass645_Sub1_Sub4_7397.aShort11726);
			this.anInt11771 = (int) (69507979 * (this.anInt11771) - i_4_ / 10.0F) * 2097394723;
		} else
			this.anInt11771 = (2097394723
					* (int) ((this.anInt11771) * 69507979 - (this.anInt11771) * 69507979 / 10.0F));
		class433_2_.method5217(class433);
		class433_2_.method5252(0.0F, -20 - (69507979 * this.anInt11771), 0.0F);
		RenderType renderType = getRender(1832798014);
		Class299 class299 = (aClass299_12043.anIntArray3302 != null
				? aClass299_12043.method3996(Class570.playerVarsProvider, Class570.playerVarsProvider, -1127687811)
				: aClass299_12043);
		boolean bool = class299.aClass431_3331 != null;
		this.aBool11821 = false;
		Class549 class549 = null;
		if (Class514.aClass528_Sub38_6967.aClass691_Sub7_10589.method9873((short) -15314) == 1 && class299.aBool3307
				&& renderType.aBool7650) {
			Class690 class690 = ((aClass690_11774.method8067((byte) 9) && aClass690_11774.method8075((byte) 108))
					? aClass690_11774 : null);
			Class690_Sub3 class690_sub3 = ((aClass690_Sub3_11803.method8067((byte) 76)
					&& (!aClass690_Sub3_11803.aBool10798 || null == class690)) ? aClass690_Sub3_11803 : null);
			short i_5_ = Class184.aClass622_2103.aShort8092;
			byte i_6_ = Class184.aClass622_2103.aByte8094;
			if (aClass299_12043.aShort3312 > -1) {
				i_5_ = aClass299_12043.aShort3312;
				i_6_ = aClass299_12043.aByte3313;
			}
			Class157 class157;
			if (i_5_ > -1 && Class514.aClass528_Sub38_6967.aClass691_Sub12_10590.method9915((byte) 1) == 1)
				class157 = (Class27.method720(class173, i_3_, (this.anInt11768 * 33753641),
						517373133 * (this.anInt11769), 970473743 * (this.anInt11770), aClass157Array11810[0], i_5_,
						i_6_, (class690_sub3 != null ? (Class690) class690_sub3 : class690), 1098424025));
			else
				class157 = (Class27.method722(class173, i_3_, (this.anInt11768 * 33753641),
						517373133 * (this.anInt11769), (this.anInt11770 * 970473743),
						-2134279851 * aClass299_12043.anInt3321, aClass157Array11810[0],
						aClass299_12043.aShort3308 & 0xffff, aClass299_12043.aShort3323 & 0xffff,
						aClass299_12043.aByte3310 & 0xff, aClass299_12043.aByte3311 & 0xff,
						(class690_sub3 != null ? (Class690) class690_sub3 : class690), 2119107540));
			if (class157 != null) {
				class549 = Class623.method7435(method10904(-1277218641), -730702704);
				this.aBool11821 = true;
				class173.method2283(false);
				if (bool)
					class157.method1897(class433_2_, null, 0);
				else {
					if (aClass159Array10678 == null || (aClass159Array10678.length < aClass157Array11810.length + 1))
						method9786(1 + aClass157Array11810.length, 69491428);
					class157.method1897(class433_2_, (aClass159Array10678[aClass157Array11810.length]), 0);
				}
				class173.method2283(true);
			}
		}
		if (bool) {
			if (aClass159Array10678 == null || aClass159Array10678.length > 1)
				method9786(1, 723615470);
			class173.method2227(class433_2_, aClass159Array10678[0], class299.aClass431_3331);
		} else if (null == aClass159Array10678 || aClass159Array10678.length < aClass157Array11810.length)
			method9786(aClass157Array11810.length, 1183344434);
		if (null == class549)
			class549 = Class623.method7435(method10904(-1176155627), -1408996294);
		method10725(class173, aClass157Array11810, class433_2_, false, -1793396020);
		for (int i_7_ = 0; i_7_ < aClass157Array11810.length; i_7_++) {
			if (aClass157Array11810[i_7_] != null) {
				if (aClass299_12043.aBool3281)
					aClass157Array11810[i_7_].method1917((-2056757207 * this.anInt12042), (this.anInt12036 * 838594905),
							(this.anInt12030 * 335309723), (1041329521 * this.anInt12045));
				if (bool)
					aClass157Array11810[i_7_].method1897(class433_2_, null, 0);
				else
					aClass157Array11810[i_7_].method1897(class433_2_, aClass159Array10678[i_7_], 0);
			} else if (!bool)
				aClass159Array10678[i_7_].aBool1751 = false;
		}
		if (null != this.aClass612_11800) {
			Class171 class171 = this.aClass612_11800.method7312();
			class173.method2209(class171);
		}
		for (int i_8_ = 0; i_8_ < aClass157Array11810.length; i_8_++) {
			if (aClass157Array11810[i_8_] != null)
				this.aBool11821 |= aClass157Array11810[i_8_].method1919();
			aClass157Array11810[i_8_] = null;
		}
		anInt11822 = client.anInt10968 * 632469719;
		return class549;
	}

	boolean method10900(Class173 class173, int i, byte i_9_) {
		int i_10_ = i;
		RenderType renderType = getRender(-1002341575);
		Class690 class690 = ((aClass690_11774.method8067((byte) 14) && !aClass690_11774.method8075((byte) 8))
				? aClass690_11774 : null);
		Class690_Sub3 class690_sub3 = ((aClass690_Sub3_11803.method8067((byte) 65)
				&& (!aClass690_Sub3_11803.aBool10798 || null == class690)) ? aClass690_Sub3_11803 : null);
		int i_11_ = -1974472047 * renderType.anInt7674;
		int i_12_ = renderType.anInt7652 * 1320357353;
		if (i_11_ != 0 || 0 != i_12_ || 1397434877 * renderType.anInt7687 != 0
				|| 0 != -435059881 * renderType.anInt7690)
			i |= 0x7;
		boolean bool = (0 != aByte11788 && client.anInt11127 >= 63115457 * anInt11756
				&& client.anInt11127 < anInt11796 * 1325244039);
		if (bool)
			i |= 0x80000;
		boolean bool_13_ = false;
		if (0 != 210357201 * this.anInt11782) {
			Class299 class299 = (null != aClass299_12043.anIntArray3302
					? aClass299_12043.method3996(Class570.playerVarsProvider, Class570.playerVarsProvider, -1453602339)
					: aClass299_12043);
			if (class299 == null
					|| (client.anInt11127 >= (-499798793 * class299.anInt3336 + -1798205501 * (this.anInt11801))))
				this.anInt11782 = 0;
			else {
				this.anInt11782 = (2119724337 * (255 - (255 * (client.anInt11127 - -1798205501 * this.anInt11801)
						/ (class299.anInt3336 * -499798793))));
				bool_13_ = true;
			}
		}
		if (bool_13_)
			i |= 0x100;
		int i_14_ = aClass37_11809.method795(375650810);
		Class157 class157 = (aClass157Array11810[0] = aClass299_12043.method3997(class173, i,
				Class147.aClass5_Sub14_1673, Class570.playerVarsProvider, Class570.playerVarsProvider, class690, class690_sub3,
				aClass690_Sub1_Sub1Array11804, anIntArray11805, i_14_, aClass287_12033, method10676((byte) 1), false,
				1600226731));
		if (class157 == null)
			return false;
		this.anInt11761 = class157.method2018() * 401213891;
		this.anInt11762 = class157.method1903() * 3061625;
		class157.method1901();
		method10672(class157, 1452595941);
		if (i_11_ != 0 || 0 != i_12_) {
			method10698(i_14_, i_11_, i_12_, renderType.anInt7676 * -1217333989, 1213273849 * renderType.anInt7677,
					(byte) -50);
			if (0 != 33753641 * this.anInt11768)
				aClass157Array11810[0].method1934(33753641 * this.anInt11768);
			if (this.anInt11769 * 517373133 != 0)
				aClass157Array11810[0].method1879(this.anInt11769 * 517373133);
			if (0 != (this.anInt11770 * 970473743))
				aClass157Array11810[0].method1880(0, (this.anInt11770 * 970473743), 0);
		} else
			method10698(i_14_, method10671((byte) -83) << 9, method10671((byte) -102) << 9, 0, 0, (byte) 44);
		if (bool)
			class157.method1917(aByte11797, aByte11815, aByte11799, aByte11788 & 0xff);
		if (bool_13_)
			class157.method1945((byte) ((this.anInt11782) * 210357201), null);
		method10673(class173, renderType, i_10_, i_11_, i_12_, i_14_, (byte) -30);
		return true;
	}

	@Override
	void method9779(Class173 class173, int i) {
		if (null != aClass299_12043 && (this.aBool11820 || method10900(class173, 0, (byte) 66))) {
			Class433 class433 = class173.method2479();
			class433.method5217(method7685());
			class433.method5252(0.0F, -5.0F, 0.0F);
			method10725(class173, aClass157Array11810, class433, this.aBool11820, 301900613);
			for (int i_15_ = 0; i_15_ < aClass157Array11810.length; i_15_++)
				aClass157Array11810[i_15_] = null;
		}
	}

	public final void method10901(Class657 class657, int i, byte i_16_) {
		int i_17_ = sceneXQueue[0];
		int i_18_ = sceneYQueue[0];
		switch (999435105 * class657.anInt8443) {
		case 6:
			i_17_--;
			i_18_--;
			break;
		case 4:
			i_17_++;
			i_18_--;
			break;
		case 7:
			i_17_++;
			i_18_++;
			break;
		case 0:
			i_18_--;
			break;
		case 1:
			i_18_++;
			break;
		case 5:
			i_17_++;
			break;
		case 2:
			i_17_--;
			i_18_++;
			break;
		case 3:
			i_17_--;
			break;
		}
		if (aClass690_11774.method8067((byte) 59)
				&& (aClass690_11774.method8073(-159716972).anInt2163 * -1651238579 == 1)) {
			anIntArray11819 = null;
			aClass690_11774.method8069(-1, (byte) 12);
		}
		for (int i_19_ = 0; i_19_ < aClass494Array11785.length; i_19_++) {
			if (aClass494Array11785[i_19_].anInt5529 * -1010180883 != -1) {
				Class669 class669 = ((Class669) Class2.aClass5_Sub12_24
						.method63((-1010180883 * (aClass494Array11785[i_19_].anInt5529)), 655894609));
				if (class669.aBool8504 && -1 != class669.anInt8519 * 916695593
						&& (((Class190) Class379.aClass5_Sub4_3966.method63(((class669.anInt8519) * 916695593),
								-1637939635)).anInt2163) * -1651238579 == 1) {
					aClass494Array11785[i_19_].aClass690_5531.method8069(-1, (byte) 12);
					aClass494Array11785[i_19_].anInt5529 = -567730405;
				}
			}
		}
		if (540774833 * quenedStepCount < sceneXQueue.length - 1)
			quenedStepCount += -670034095;
		for (int i_20_ = quenedStepCount * 540774833; i_20_ > 0; i_20_--) {
			sceneXQueue[i_20_] = sceneXQueue[i_20_ - 1];
			sceneYQueue[i_20_] = sceneYQueue[i_20_ - 1];
			moveTypeQueue[i_20_] = moveTypeQueue[i_20_ - 1];
		}
		sceneXQueue[0] = i_17_;
		sceneYQueue[0] = i_18_;
		moveTypeQueue[0] = (byte) i;
	}

	public void method10902(int i, int i_21_, int i_22_, boolean bool, int i_23_, byte i_24_) {
		aByte10675 = aByte10674 = (byte) i;
		if (client.gameScene.method6006((byte) 0).method5633(i_21_, i_22_, (short) -2590))
			aByte10674++;
		if (aClass690_11774.method8067((byte) 100)
				&& (aClass690_11774.method8073(-528781511).anInt2163 * -1651238579 == 1)) {
			anIntArray11819 = null;
			aClass690_11774.method8069(-1, (byte) 12);
		}
		for (int i_25_ = 0; i_25_ < aClass494Array11785.length; i_25_++) {
			if (-1010180883 * aClass494Array11785[i_25_].anInt5529 != -1) {
				Class669 class669 = ((Class669) Class2.aClass5_Sub12_24
						.method63((-1010180883 * (aClass494Array11785[i_25_].anInt5529)), -1739961642));
				if (class669.aBool8504 && 916695593 * class669.anInt8519 != -1
						&& (((Class190) Class379.aClass5_Sub4_3966.method63((916695593 * (class669.anInt8519)),
								1040716855)).anInt2163) * -1651238579 == 1) {
					aClass494Array11785[i_25_].aClass690_5531.method8069(-1, (byte) 12);
					aClass494Array11785[i_25_].anInt5529 = -567730405;
				}
			}
		}
		if (!bool) {
			int i_26_ = i_21_ - sceneXQueue[0];
			int i_27_ = i_22_ - sceneYQueue[0];
			if (i_26_ >= -8 && i_26_ <= 8 && i_27_ >= -8 && i_27_ <= 8) {
				if (quenedStepCount * 540774833 < sceneXQueue.length - 1)
					quenedStepCount += -670034095;
				for (int i_28_ = quenedStepCount * 540774833; i_28_ > 0; i_28_--) {
					sceneXQueue[i_28_] = sceneXQueue[i_28_ - 1];
					sceneYQueue[i_28_] = sceneYQueue[i_28_ - 1];
					moveTypeQueue[i_28_] = moveTypeQueue[i_28_ - 1];
				}
				sceneXQueue[0] = i_21_;
				sceneYQueue[0] = i_22_;
				moveTypeQueue[0] = Class666.aClass666_8476.aByte8478;
				return;
			}
		}
		quenedStepCount = 0;
		anInt11818 = 0;
		anInt11816 = 0;
		sceneXQueue[0] = i_21_;
		sceneYQueue[0] = i_22_;
		Class422 class422 = Class422.method5052(method7693().aClass422_4868);
		class422.aFloat4780 = (i_23_ << 8) + (sceneXQueue[0] << 9);
		class422.aFloat4777 = (i_23_ << 8) + (sceneYQueue[0] << 9);
		method7688(class422);
		class422.method5054();
		if (this.aClass612_11800 != null)
			this.aClass612_11800.method7324();
	}

	public final boolean method10903(int i) {
		if (aClass299_12043 == null)
			return false;
		return true;
	}

	@Override
	int method10676(byte i) {
		if (-1 != -1979082579 * anInt12039)
			return -1979082579 * anInt12039;
		if (aClass299_12043.anIntArray3302 != null) {
			Class299 class299 = aClass299_12043.method3996(Class570.playerVarsProvider, Class570.playerVarsProvider, 186732725);
			if (class299 != null && -1 != 941026227 * class299.anInt3274)
				return 941026227 * class299.anInt3274;
		}
		return 941026227 * aClass299_12043.anInt3274;
	}

	@Override
	public int method10703(int i) {
		if (aClass299_12043.anIntArray3302 != null) {
			Class299 class299 = aClass299_12043.method3996(Class570.playerVarsProvider, Class570.playerVarsProvider, -2041810278);
			if (null != class299 && class299.anInt3263 * 1109304839 != -1)
				return 1109304839 * class299.anInt3263;
		}
		return aClass299_12043.anInt3263 * 1109304839;
	}

	@Override
	public Class295 method174() {
		return Class295.aClass295_3234;
	}

	boolean method10904(int i) {
		return aClass299_12043.aBool3305;
	}

	@Override
	int method9809(int i) {
		if (null == aClass299_12043)
			return 0;
		return -660374885 * aClass299_12043.anInt3334;
	}

	@Override
	final boolean method9771(int i) {
		return false;
	}

	@Override
	final void method9798(Class173 class173, Class645_Sub1 class645_sub1, int i, int i_29_, int i_30_, boolean bool,
			int i_31_) {
		throw new IllegalStateException();
	}

	@Override
	final void method9777(int i) {
		throw new IllegalStateException();
	}

	public int method10905(int i, int i_32_) {
		return this.anIntArray12040[i];
	}

	public int method10906(int i, byte i_33_) {
		return this.anIntArray12041[i];
	}

	@Override
	public boolean method10679(int i) {
		return Class184.aClass622_2103.aBool8091;
	}

	@Override
	public Class430 method182() {
		Class430 class430 = Class430.method5188();
		class430.method5189(Class417.method4970(aClass37_11809.anInt336 * -247599997), 0.0F, 0.0F);
		return class430;
	}

	public void method10907(String string, int i, int i_34_, byte i_35_) {
		int i_36_ = (Class262.method3646(-2070580139) * (Class184.aClass622_2103.anInt8104 * 1865175493));
		method10699(string, i, i_34_, i_36_, (byte) 10);
	}

	@Override
	public int method74() {
		return anInt11783 * -34811601;
	}

	@Override
	public Class295 method175(byte i) {
		return Class295.aClass295_3234;
	}

	public void method10908(int i) {
		this.anInt11782 = -636173361;
		this.anInt11801 = 1603426539 * client.anInt11127;
	}

	@Override
	public int method9785(int i) {
		if (aClass299_12043.anIntArray3302 != null) {
			Class299 class299 = aClass299_12043.method3996(Class570.playerVarsProvider, Class570.playerVarsProvider, -400417665);
			if (class299 != null && -1 != class299.anInt3325 * -746749181)
				return class299.anInt3325 * -746749181;
		}
		return (aClass299_12043.anInt3325 * -746749181 != -1 ? aClass299_12043.anInt3325 * -746749181
				: super.method9785(-1802557759));
	}

	@Override
	public boolean method10682() {
		return Class184.aClass622_2103.aBool8091;
	}

	@Override
	public Class422 method171(int i) {
		return Class422.method5100();
	}

	@Override
	public boolean method9770(byte i) {
		if (aClass299_12043.anIntArray3302 != null
				&& (aClass299_12043.method3996(Class570.playerVarsProvider, Class570.playerVarsProvider, 291733038) == null))
			return false;
		return true;
	}

	public Class554 method9795(Class173 class173) {
		return null;
	}

	@Override
	public Class295 method173() {
		return Class295.aClass295_3234;
	}

	public boolean method9784() {
		if (aClass299_12043.anIntArray3302 != null
				&& (aClass299_12043.method3996(Class570.playerVarsProvider, Class570.playerVarsProvider, -564253572) == null))
			return false;
		return true;
	}

	@Override
	public int method73() {
		return anInt11783 * -34811601;
	}

	public final boolean method10909() {
		if (aClass299_12043 == null)
			return false;
		return true;
	}

	final void method9806() {
		throw new IllegalStateException();
	}

	Class549 method9787(Class173 class173) {
		if (aClass299_12043 == null || !method10900(class173, 526336, (byte) 89))
			return null;
		Class433 class433 = method7685();
		Class437 class437 = method7693();
		Class433 class433_37_ = class173.method2479();
		int i = aClass37_11809.method795(547465815);
		Class546 class546 = (aClass538_10676.aClass546ArrayArrayArray7160[aByte10675][(int) class437.aClass422_4868.aFloat4780 >> 9][(int) class437.aClass422_4868.aFloat4777 >> 9]);
		if (class546 != null && null != class546.aClass645_Sub1_Sub4_7397) {
			int i_38_ = (this.anInt11771 * 69507979 - class546.aClass645_Sub1_Sub4_7397.aShort11726);
			this.anInt11771 = (int) (69507979 * (this.anInt11771) - i_38_ / 10.0F) * 2097394723;
		} else
			this.anInt11771 = (2097394723
					* (int) ((this.anInt11771) * 69507979 - (this.anInt11771) * 69507979 / 10.0F));
		class433_37_.method5217(class433);
		class433_37_.method5252(0.0F, -20 - (69507979 * this.anInt11771), 0.0F);
		RenderType renderType = getRender(-751804814);
		Class299 class299 = (aClass299_12043.anIntArray3302 != null
				? aClass299_12043.method3996(Class570.playerVarsProvider, Class570.playerVarsProvider, 213309172)
				: aClass299_12043);
		boolean bool = class299.aClass431_3331 != null;
		this.aBool11821 = false;
		Class549 class549 = null;
		if (Class514.aClass528_Sub38_6967.aClass691_Sub7_10589.method9873((short) -14339) == 1 && class299.aBool3307
				&& renderType.aBool7650) {
			Class690 class690 = ((aClass690_11774.method8067((byte) 102) && aClass690_11774.method8075((byte) 16))
					? aClass690_11774 : null);
			Class690_Sub3 class690_sub3 = ((aClass690_Sub3_11803.method8067((byte) 18)
					&& (!aClass690_Sub3_11803.aBool10798 || null == class690)) ? aClass690_Sub3_11803 : null);
			short i_39_ = Class184.aClass622_2103.aShort8092;
			byte i_40_ = Class184.aClass622_2103.aByte8094;
			if (aClass299_12043.aShort3312 > -1) {
				i_39_ = aClass299_12043.aShort3312;
				i_40_ = aClass299_12043.aByte3313;
			}
			Class157 class157;
			if (i_39_ > -1 && Class514.aClass528_Sub38_6967.aClass691_Sub12_10590.method9915((byte) 1) == 1)
				class157 = (Class27.method720(class173, i, (this.anInt11768 * 33753641), 517373133 * (this.anInt11769),
						970473743 * (this.anInt11770), aClass157Array11810[0], i_39_, i_40_,
						(class690_sub3 != null ? (Class690) class690_sub3 : class690), 1098424025));
			else
				class157 = (Class27.method722(class173, i, (this.anInt11768 * 33753641), 517373133 * (this.anInt11769),
						(this.anInt11770 * 970473743), -2134279851 * aClass299_12043.anInt3321, aClass157Array11810[0],
						aClass299_12043.aShort3308 & 0xffff, aClass299_12043.aShort3323 & 0xffff,
						aClass299_12043.aByte3310 & 0xff, aClass299_12043.aByte3311 & 0xff,
						(class690_sub3 != null ? (Class690) class690_sub3 : class690), 1906390407));
			if (class157 != null) {
				class549 = Class623.method7435(method10904(1292894520), -16234487);
				this.aBool11821 = true;
				class173.method2283(false);
				if (bool)
					class157.method1897(class433_37_, null, 0);
				else {
					if (aClass159Array10678 == null || (aClass159Array10678.length < aClass157Array11810.length + 1))
						method9786(1 + aClass157Array11810.length, -1350870819);
					class157.method1897(class433_37_, (aClass159Array10678[aClass157Array11810.length]), 0);
				}
				class173.method2283(true);
			}
		}
		if (bool) {
			if (aClass159Array10678 == null || aClass159Array10678.length > 1)
				method9786(1, 1666205699);
			class173.method2227(class433_37_, aClass159Array10678[0], class299.aClass431_3331);
		} else if (null == aClass159Array10678 || aClass159Array10678.length < aClass157Array11810.length)
			method9786(aClass157Array11810.length, 384491959);
		if (null == class549)
			class549 = Class623.method7435(method10904(453112272), -453433475);
		method10725(class173, aClass157Array11810, class433_37_, false, -959236877);
		for (int i_41_ = 0; i_41_ < aClass157Array11810.length; i_41_++) {
			if (aClass157Array11810[i_41_] != null) {
				if (aClass299_12043.aBool3281)
					aClass157Array11810[i_41_].method1917((-2056757207 * this.anInt12042),
							(this.anInt12036 * 838594905), (this.anInt12030 * 335309723),
							(1041329521 * this.anInt12045));
				if (bool)
					aClass157Array11810[i_41_].method1897(class433_37_, null, 0);
				else
					aClass157Array11810[i_41_].method1897(class433_37_, (aClass159Array10678[i_41_]), 0);
			} else if (!bool)
				aClass159Array10678[i_41_].aBool1751 = false;
		}
		if (null != this.aClass612_11800) {
			Class171 class171 = this.aClass612_11800.method7312();
			class173.method2209(class171);
		}
		for (int i_42_ = 0; i_42_ < aClass157Array11810.length; i_42_++) {
			if (aClass157Array11810[i_42_] != null)
				this.aBool11821 |= aClass157Array11810[i_42_].method1919();
			aClass157Array11810[i_42_] = null;
		}
		anInt11822 = client.anInt10968 * 632469719;
		return class549;
	}

	public void method10910(int i, int i_43_, int i_44_, byte i_45_) {
		this.anIntArray12040[i] = i_43_;
		this.anIntArray12041[i] = i_44_;
	}

	@Override
	public Class528_Sub19 method179() {
		Class578 class578 = client.gameScene.method5966(1273279609);
		return Class49.method891(aByte10675,
				((int) method7693().aClass422_4868.aFloat4780 + class578.anInt7607 * -1650867712),
				-(int) method7693().aClass422_4868.aFloat4776,
				((int) method7693().aClass422_4868.aFloat4777 + 1200930304 * class578.anInt7608), 285155075);
	}

	@Override
	public int method168(int i) {
		return anInt11783 * -34811601;
	}

	@Override
	public Class430 method180() {
		Class430 class430 = Class430.method5188();
		class430.method5189(Class417.method4970(aClass37_11809.anInt336 * -247599997), 0.0F, 0.0F);
		return class430;
	}

	@Override
	public Class430 method181() {
		Class430 class430 = Class430.method5188();
		class430.method5189(Class417.method4970(aClass37_11809.anInt336 * -247599997), 0.0F, 0.0F);
		return class430;
	}

	@Override
	public Class422 method183() {
		return Class422.method5100();
	}

	@Override
	public Class422 method184() {
		return Class422.method5100();
	}

	public Class554 method9794(Class173 class173) {
		return null;
	}

	void method10911() {
		this.anInt12042 = (32 + (int) (Math.random() * 4.0)) * -457360359;
		this.anInt12036 = (3 + (int) (Math.random() * 2.0)) * 2045462249;
		this.anInt12030 = (16 + (int) (Math.random() * 3.0)) * -2070609261;
		if (Class514.aClass528_Sub38_6967.aClass691_Sub12_10590.method9915((byte) 1) == 1)
			this.anInt12045 = (int) (Math.random() * 6.0) * -523521135;
		else
			this.anInt12045 = (int) (Math.random() * 12.0) * -523521135;
	}

	public int method9796() {
		if (aClass299_12043.anIntArray3302 != null) {
			Class299 class299 = aClass299_12043.method3996(Class570.playerVarsProvider, Class570.playerVarsProvider, 374794897);
			if (class299 != null && -1 != class299.anInt3325 * -746749181)
				return class299.anInt3325 * -746749181;
		}
		return (aClass299_12043.anInt3325 * -746749181 != -1 ? aClass299_12043.anInt3325 * -746749181
				: super.method9785(-988930508));
	}

	Class549 method9778(Class173 class173) {
		if (aClass299_12043 == null || !method10900(class173, 526336, (byte) 92))
			return null;
		Class433 class433 = method7685();
		Class437 class437 = method7693();
		Class433 class433_46_ = class173.method2479();
		int i = aClass37_11809.method795(-581449714);
		Class546 class546 = (aClass538_10676.aClass546ArrayArrayArray7160[aByte10675][(int) class437.aClass422_4868.aFloat4780 >> 9][(int) class437.aClass422_4868.aFloat4777 >> 9]);
		if (class546 != null && null != class546.aClass645_Sub1_Sub4_7397) {
			int i_47_ = (this.anInt11771 * 69507979 - class546.aClass645_Sub1_Sub4_7397.aShort11726);
			this.anInt11771 = (int) (69507979 * (this.anInt11771) - i_47_ / 10.0F) * 2097394723;
		} else
			this.anInt11771 = (2097394723
					* (int) ((this.anInt11771) * 69507979 - (this.anInt11771) * 69507979 / 10.0F));
		class433_46_.method5217(class433);
		class433_46_.method5252(0.0F, -20 - (69507979 * this.anInt11771), 0.0F);
		RenderType renderType = getRender(2007592697);
		Class299 class299 = (aClass299_12043.anIntArray3302 != null
				? aClass299_12043.method3996(Class570.playerVarsProvider, Class570.playerVarsProvider, -1213489674)
				: aClass299_12043);
		boolean bool = class299.aClass431_3331 != null;
		this.aBool11821 = false;
		Class549 class549 = null;
		if (Class514.aClass528_Sub38_6967.aClass691_Sub7_10589.method9873((short) 7200) == 1 && class299.aBool3307
				&& renderType.aBool7650) {
			Class690 class690 = ((aClass690_11774.method8067((byte) 66) && aClass690_11774.method8075((byte) 45))
					? aClass690_11774 : null);
			Class690_Sub3 class690_sub3 = ((aClass690_Sub3_11803.method8067((byte) 55)
					&& (!aClass690_Sub3_11803.aBool10798 || null == class690)) ? aClass690_Sub3_11803 : null);
			short i_48_ = Class184.aClass622_2103.aShort8092;
			byte i_49_ = Class184.aClass622_2103.aByte8094;
			if (aClass299_12043.aShort3312 > -1) {
				i_48_ = aClass299_12043.aShort3312;
				i_49_ = aClass299_12043.aByte3313;
			}
			Class157 class157;
			if (i_48_ > -1 && Class514.aClass528_Sub38_6967.aClass691_Sub12_10590.method9915((byte) 1) == 1)
				class157 = (Class27.method720(class173, i, (this.anInt11768 * 33753641), 517373133 * (this.anInt11769),
						970473743 * (this.anInt11770), aClass157Array11810[0], i_48_, i_49_,
						(class690_sub3 != null ? (Class690) class690_sub3 : class690), 1098424025));
			else
				class157 = (Class27.method722(class173, i, (this.anInt11768 * 33753641), 517373133 * (this.anInt11769),
						(this.anInt11770 * 970473743), -2134279851 * aClass299_12043.anInt3321, aClass157Array11810[0],
						aClass299_12043.aShort3308 & 0xffff, aClass299_12043.aShort3323 & 0xffff,
						aClass299_12043.aByte3310 & 0xff, aClass299_12043.aByte3311 & 0xff,
						(class690_sub3 != null ? (Class690) class690_sub3 : class690), 2034747460));
			if (class157 != null) {
				class549 = Class623.method7435(method10904(804323297), 1220773217);
				this.aBool11821 = true;
				class173.method2283(false);
				if (bool)
					class157.method1897(class433_46_, null, 0);
				else {
					if (aClass159Array10678 == null || (aClass159Array10678.length < aClass157Array11810.length + 1))
						method9786(1 + aClass157Array11810.length, 1165987907);
					class157.method1897(class433_46_, (aClass159Array10678[aClass157Array11810.length]), 0);
				}
				class173.method2283(true);
			}
		}
		if (bool) {
			if (aClass159Array10678 == null || aClass159Array10678.length > 1)
				method9786(1, -1800765407);
			class173.method2227(class433_46_, aClass159Array10678[0], class299.aClass431_3331);
		} else if (null == aClass159Array10678 || aClass159Array10678.length < aClass157Array11810.length)
			method9786(aClass157Array11810.length, -1719493270);
		if (null == class549)
			class549 = Class623.method7435(method10904(869050232), -1483769413);
		method10725(class173, aClass157Array11810, class433_46_, false, -67592455);
		for (int i_50_ = 0; i_50_ < aClass157Array11810.length; i_50_++) {
			if (aClass157Array11810[i_50_] != null) {
				if (aClass299_12043.aBool3281)
					aClass157Array11810[i_50_].method1917((-2056757207 * this.anInt12042),
							(this.anInt12036 * 838594905), (this.anInt12030 * 335309723),
							(1041329521 * this.anInt12045));
				if (bool)
					aClass157Array11810[i_50_].method1897(class433_46_, null, 0);
				else
					aClass157Array11810[i_50_].method1897(class433_46_, (aClass159Array10678[i_50_]), 0);
			} else if (!bool)
				aClass159Array10678[i_50_].aBool1751 = false;
		}
		if (null != this.aClass612_11800) {
			Class171 class171 = this.aClass612_11800.method7312();
			class173.method2209(class171);
		}
		for (int i_51_ = 0; i_51_ < aClass157Array11810.length; i_51_++) {
			if (aClass157Array11810[i_51_] != null)
				this.aBool11821 |= aClass157Array11810[i_51_].method1919();
			aClass157Array11810[i_51_] = null;
		}
		anInt11822 = client.anInt10968 * 632469719;
		return class549;
	}

	Class549 method9776(Class173 class173) {
		if (aClass299_12043 == null || !method10900(class173, 526336, (byte) 113))
			return null;
		Class433 class433 = method7685();
		Class437 class437 = method7693();
		Class433 class433_52_ = class173.method2479();
		int i = aClass37_11809.method795(-1951831549);
		Class546 class546 = (aClass538_10676.aClass546ArrayArrayArray7160[aByte10675][(int) class437.aClass422_4868.aFloat4780 >> 9][(int) class437.aClass422_4868.aFloat4777 >> 9]);
		if (class546 != null && null != class546.aClass645_Sub1_Sub4_7397) {
			int i_53_ = (this.anInt11771 * 69507979 - class546.aClass645_Sub1_Sub4_7397.aShort11726);
			this.anInt11771 = (int) (69507979 * (this.anInt11771) - i_53_ / 10.0F) * 2097394723;
		} else
			this.anInt11771 = (2097394723
					* (int) ((this.anInt11771) * 69507979 - (this.anInt11771) * 69507979 / 10.0F));
		class433_52_.method5217(class433);
		class433_52_.method5252(0.0F, -20 - (69507979 * this.anInt11771), 0.0F);
		RenderType renderType = getRender(-137185108);
		Class299 class299 = (aClass299_12043.anIntArray3302 != null
				? aClass299_12043.method3996(Class570.playerVarsProvider, Class570.playerVarsProvider, -984476953)
				: aClass299_12043);
		boolean bool = class299.aClass431_3331 != null;
		this.aBool11821 = false;
		Class549 class549 = null;
		if (Class514.aClass528_Sub38_6967.aClass691_Sub7_10589.method9873((short) -10328) == 1 && class299.aBool3307
				&& renderType.aBool7650) {
			Class690 class690 = ((aClass690_11774.method8067((byte) 32) && aClass690_11774.method8075((byte) 34))
					? aClass690_11774 : null);
			Class690_Sub3 class690_sub3 = ((aClass690_Sub3_11803.method8067((byte) 98)
					&& (!aClass690_Sub3_11803.aBool10798 || null == class690)) ? aClass690_Sub3_11803 : null);
			short i_54_ = Class184.aClass622_2103.aShort8092;
			byte i_55_ = Class184.aClass622_2103.aByte8094;
			if (aClass299_12043.aShort3312 > -1) {
				i_54_ = aClass299_12043.aShort3312;
				i_55_ = aClass299_12043.aByte3313;
			}
			Class157 class157;
			if (i_54_ > -1 && Class514.aClass528_Sub38_6967.aClass691_Sub12_10590.method9915((byte) 1) == 1)
				class157 = (Class27.method720(class173, i, (this.anInt11768 * 33753641), 517373133 * (this.anInt11769),
						970473743 * (this.anInt11770), aClass157Array11810[0], i_54_, i_55_,
						(class690_sub3 != null ? (Class690) class690_sub3 : class690), 1098424025));
			else
				class157 = (Class27.method722(class173, i, (this.anInt11768 * 33753641), 517373133 * (this.anInt11769),
						(this.anInt11770 * 970473743), -2134279851 * aClass299_12043.anInt3321, aClass157Array11810[0],
						aClass299_12043.aShort3308 & 0xffff, aClass299_12043.aShort3323 & 0xffff,
						aClass299_12043.aByte3310 & 0xff, aClass299_12043.aByte3311 & 0xff,
						(class690_sub3 != null ? (Class690) class690_sub3 : class690), 2058153788));
			if (class157 != null) {
				class549 = Class623.method7435(method10904(-1656626101), -1531777627);
				this.aBool11821 = true;
				class173.method2283(false);
				if (bool)
					class157.method1897(class433_52_, null, 0);
				else {
					if (aClass159Array10678 == null || (aClass159Array10678.length < aClass157Array11810.length + 1))
						method9786(1 + aClass157Array11810.length, -1304864206);
					class157.method1897(class433_52_, (aClass159Array10678[aClass157Array11810.length]), 0);
				}
				class173.method2283(true);
			}
		}
		if (bool) {
			if (aClass159Array10678 == null || aClass159Array10678.length > 1)
				method9786(1, -19722345);
			class173.method2227(class433_52_, aClass159Array10678[0], class299.aClass431_3331);
		} else if (null == aClass159Array10678 || aClass159Array10678.length < aClass157Array11810.length)
			method9786(aClass157Array11810.length, 1585525774);
		if (null == class549)
			class549 = Class623.method7435(method10904(-267258745), -1627449962);
		method10725(class173, aClass157Array11810, class433_52_, false, 415016018);
		for (int i_56_ = 0; i_56_ < aClass157Array11810.length; i_56_++) {
			if (aClass157Array11810[i_56_] != null) {
				if (aClass299_12043.aBool3281)
					aClass157Array11810[i_56_].method1917((-2056757207 * this.anInt12042),
							(this.anInt12036 * 838594905), (this.anInt12030 * 335309723),
							(1041329521 * this.anInt12045));
				if (bool)
					aClass157Array11810[i_56_].method1897(class433_52_, null, 0);
				else
					aClass157Array11810[i_56_].method1897(class433_52_, (aClass159Array10678[i_56_]), 0);
			} else if (!bool)
				aClass159Array10678[i_56_].aBool1751 = false;
		}
		if (null != this.aClass612_11800) {
			Class171 class171 = this.aClass612_11800.method7312();
			class173.method2209(class171);
		}
		for (int i_57_ = 0; i_57_ < aClass157Array11810.length; i_57_++) {
			if (aClass157Array11810[i_57_] != null)
				this.aBool11821 |= aClass157Array11810[i_57_].method1919();
			aClass157Array11810[i_57_] = null;
		}
		anInt11822 = client.anInt10968 * 632469719;
		return class549;
	}

	void method9800(Class173 class173) {
		if (null != aClass299_12043 && (this.aBool11820 || method10900(class173, 0, (byte) 69))) {
			Class433 class433 = class173.method2479();
			class433.method5217(method7685());
			class433.method5252(0.0F, -5.0F, 0.0F);
			method10725(class173, aClass157Array11810, class433, this.aBool11820, -1109112060);
			for (int i = 0; i < aClass157Array11810.length; i++)
				aClass157Array11810[i] = null;
		}
	}

	boolean method9801(Class173 class173, int i, int i_58_) {
		if (null == aClass299_12043)
			return false;
		if (null != aClass299_12043.aClass431_3331)
			return class173.method2225(i, i_58_, method7685(), aClass299_12043.aClass431_3331, (byte) 2);
		if (!method10900(class173, 131072, (byte) 84))
			return false;
		Class433 class433 = method7685();
		boolean bool = false;
		for (int i_59_ = 0; i_59_ < aClass157Array11810.length; i_59_++) {
			if (aClass157Array11810[i_59_] != null && aClass157Array11810[i_59_].aBool1737) {
				boolean bool_60_;
				while_9_: do {
					do {
						if (-660374885 * aClass299_12043.anInt3334 <= 0) {
							if (aClass299_12043.anInt3330 * 499294715 == -1) {
								if (aClass299_12043.anInt3321 * -2134279851 != 1)
									break;
							} else if (499294715 * aClass299_12043.anInt3330 != 1)
								break;
						}
						bool_60_ = true;
						break while_9_;
					} while (false);
					bool_60_ = false;
				} while (false);
				boolean bool_61_ = bool_60_;
				boolean bool_62_ = aClass157Array11810[i_59_].method2000(i, i_58_, class433, bool_61_,
						((aClass299_12043.anInt3334) * -660374885));
				if (bool_62_) {
					bool = true;
					break;
				}
			}
		}
		for (int i_63_ = 0; i_63_ < aClass157Array11810.length; i_63_++)
			aClass157Array11810[i_63_] = null;
		return bool;
	}

	boolean method9774(Class173 class173, int i, int i_64_) {
		if (null == aClass299_12043)
			return false;
		if (null != aClass299_12043.aClass431_3331)
			return class173.method2225(i, i_64_, method7685(), aClass299_12043.aClass431_3331, (byte) 2);
		if (!method10900(class173, 131072, (byte) 81))
			return false;
		Class433 class433 = method7685();
		boolean bool = false;
		for (int i_65_ = 0; i_65_ < aClass157Array11810.length; i_65_++) {
			if (aClass157Array11810[i_65_] != null && aClass157Array11810[i_65_].aBool1737) {
				boolean bool_66_;
				while_10_: do {
					do {
						if (-660374885 * aClass299_12043.anInt3334 <= 0) {
							if (aClass299_12043.anInt3330 * 499294715 == -1) {
								if (aClass299_12043.anInt3321 * -2134279851 != 1)
									break;
							} else if (499294715 * aClass299_12043.anInt3330 != 1)
								break;
						}
						bool_66_ = true;
						break while_10_;
					} while (false);
					bool_66_ = false;
				} while (false);
				boolean bool_67_ = bool_66_;
				boolean bool_68_ = aClass157Array11810[i_65_].method2000(i, i_64_, class433, bool_67_,
						((aClass299_12043.anInt3334) * -660374885));
				if (bool_68_) {
					bool = true;
					break;
				}
			}
		}
		for (int i_69_ = 0; i_69_ < aClass157Array11810.length; i_69_++)
			aClass157Array11810[i_69_] = null;
		return bool;
	}

	final boolean method9802() {
		return false;
	}

	@Override
	public int method10727() {
		return anInt11783 * -34811601 + 1;
	}

	int method10712() {
		if (-1 != -1979082579 * anInt12039)
			return -1979082579 * anInt12039;
		if (aClass299_12043.anIntArray3302 != null) {
			Class299 class299 = aClass299_12043.method3996(Class570.playerVarsProvider, Class570.playerVarsProvider, -903410769);
			if (class299 != null && -1 != 941026227 * class299.anInt3274)
				return 941026227 * class299.anInt3274;
		}
		return 941026227 * aClass299_12043.anInt3274;
	}

	int method10713() {
		if (-1 != -1979082579 * anInt12039)
			return -1979082579 * anInt12039;
		if (aClass299_12043.anIntArray3302 != null) {
			Class299 class299 = aClass299_12043.method3996(Class570.playerVarsProvider, Class570.playerVarsProvider, -224432435);
			if (class299 != null && -1 != 941026227 * class299.anInt3274)
				return 941026227 * class299.anInt3274;
		}
		return 941026227 * aClass299_12043.anInt3274;
	}

	@Override
	public Class492 method10719() {
		if (this.aClass492_11823 != null && null == (this.aClass492_11823).aString5518)
			return null;
		return this.aClass492_11823;
	}

	@Override
	public Class430 method172() {
		Class430 class430 = Class430.method5188();
		class430.method5189(Class417.method4970(aClass37_11809.anInt336 * -247599997), 0.0F, 0.0F);
		return class430;
	}

	@Override
	public int method10687(int i) {
		return anInt11783 * -34811601 + 1;
	}

	@Override
	public boolean method10694() {
		return Class184.aClass622_2103.aBool8091;
	}

	@Override
	public Class528_Sub19 method169(int i) {
		Class578 class578 = client.gameScene.method5966(1273279609);
		return Class49.method891(aByte10675,
				((int) method7693().aClass422_4868.aFloat4780 + class578.anInt7607 * -1650867712),
				-(int) method7693().aClass422_4868.aFloat4776,
				((int) method7693().aClass422_4868.aFloat4777 + 1200930304 * class578.anInt7608), 1457488122);
	}

	@Override
	public int method71() {
		return anInt11783 * -34811601;
	}

	@Override
	public Class492 method10720() {
		if (this.aClass492_11823 != null && null == (this.aClass492_11823).aString5518)
			return null;
		return this.aClass492_11823;
	}

	public boolean method9810() {
		if (aClass299_12043.anIntArray3302 != null
				&& (aClass299_12043.method3996(Class570.playerVarsProvider, Class570.playerVarsProvider, -1426843681) == null))
			return false;
		return true;
	}

	@Override
	public int method10685() {
		return anInt11783 * -34811601 + 1;
	}

	@Override
	public int method10726() {
		return anInt11783 * -34811601 + 1;
	}

	int method10660() {
		if (-1 != -1979082579 * anInt12039)
			return -1979082579 * anInt12039;
		if (aClass299_12043.anIntArray3302 != null) {
			Class299 class299 = aClass299_12043.method3996(Class570.playerVarsProvider, Class570.playerVarsProvider, -1924182637);
			if (class299 != null && -1 != 941026227 * class299.anInt3274)
				return 941026227 * class299.anInt3274;
		}
		return 941026227 * aClass299_12043.anInt3274;
	}

	final void method9804(Class173 class173, Class645_Sub1 class645_sub1, int i, int i_70_, int i_71_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method9805() {
		throw new IllegalStateException();
	}

	final void method9808() {
		throw new IllegalStateException();
	}

	public NPC(Class538 class538) {
		super(class538, Class664.aClass95_Sub1_Sub1_8460);
		this.anIntArray12040 = new int[6];
		this.anIntArray12041 = new int[6];
		method10897(-1742489366);
	}

	int method9818() {
		if (null == aClass299_12043)
			return 0;
		return -660374885 * aClass299_12043.anInt3334;
	}

	int method9773() {
		if (null == aClass299_12043)
			return 0;
		return -660374885 * aClass299_12043.anInt3334;
	}

	public void method10912() {
		this.anInt11782 = -636173361;
		this.anInt11801 = 1603426539 * client.anInt11127;
	}

	void method10913() {
		this.anInt12042 = (32 + (int) (Math.random() * 4.0)) * -457360359;
		this.anInt12036 = (3 + (int) (Math.random() * 2.0)) * 2045462249;
		this.anInt12030 = (16 + (int) (Math.random() * 3.0)) * -2070609261;
		if (Class514.aClass528_Sub38_6967.aClass691_Sub12_10590.method9915((byte) 1) == 1)
			this.anInt12045 = (int) (Math.random() * 6.0) * -523521135;
		else
			this.anInt12045 = (int) (Math.random() * 12.0) * -523521135;
	}

	public Class492 method10711() {
		if (this.aClass492_11823 != null && null == (this.aClass492_11823).aString5518)
			return null;
		return this.aClass492_11823;
	}

	final boolean method9803() {
		return false;
	}

	@Override
	public Class430 method170(byte i) {
		Class430 class430 = Class430.method5188();
		class430.method5189(Class417.method4970(aClass37_11809.anInt336 * -247599997), 0.0F, 0.0F);
		return class430;
	}

	public int method10714() {
		if (aClass299_12043.anIntArray3302 != null) {
			Class299 class299 = aClass299_12043.method3996(Class570.playerVarsProvider, Class570.playerVarsProvider, -1289788426);
			if (null != class299 && class299.anInt3263 * 1109304839 != -1)
				return 1109304839 * class299.anInt3263;
		}
		return aClass299_12043.anInt3263 * 1109304839;
	}

	@Override
	public Class422 method177() {
		return Class422.method5100();
	}

	@Override
	public Class492 method10721() {
		if (this.aClass492_11823 != null && null == (this.aClass492_11823).aString5518)
			return null;
		return this.aClass492_11823;
	}

	boolean method10914() {
		return aClass299_12043.aBool3305;
	}

	boolean method10915() {
		return aClass299_12043.aBool3305;
	}

	boolean method10916() {
		return aClass299_12043.aBool3305;
	}

	@Override
	public Class492 method10680(int i) {
		if (this.aClass492_11823 != null && null == (this.aClass492_11823).aString5518)
			return null;
		return this.aClass492_11823;
	}

	@Override
	public Class528_Sub19 method176() {
		Class578 class578 = client.gameScene.method5966(1273279609);
		return Class49.method891(aByte10675,
				((int) method7693().aClass422_4868.aFloat4780 + class578.anInt7607 * -1650867712),
				-(int) method7693().aClass422_4868.aFloat4776,
				((int) method7693().aClass422_4868.aFloat4777 + 1200930304 * class578.anInt7608), 1794807172);
	}

	@Override
	public int method178() {
		return anInt11783 * -34811601;
	}

	@Override
	boolean method9820(Class173 class173, int i, int i_72_, byte i_73_) {
		if (null == aClass299_12043)
			return false;
		if (null != aClass299_12043.aClass431_3331)
			return class173.method2225(i, i_72_, method7685(), aClass299_12043.aClass431_3331, (byte) 2);
		if (!method10900(class173, 131072, (byte) 119))
			return false;
		Class433 class433 = method7685();
		boolean bool = false;
		for (int i_74_ = 0; i_74_ < aClass157Array11810.length; i_74_++) {
			if (aClass157Array11810[i_74_] != null && aClass157Array11810[i_74_].aBool1737) {
				boolean bool_75_;
				while_11_: do {
					do {
						if (-660374885 * aClass299_12043.anInt3334 <= 0) {
							if (aClass299_12043.anInt3330 * 499294715 == -1) {
								if (aClass299_12043.anInt3321 * -2134279851 != 1)
									break;
							} else if (499294715 * aClass299_12043.anInt3330 != 1)
								break;
						}
						bool_75_ = true;
						break while_11_;
					} while (false);
					bool_75_ = false;
				} while (false);
				boolean bool_76_ = bool_75_;
				boolean bool_77_ = aClass157Array11810[i_74_].method2000(i, i_72_, class433, bool_76_,
						((aClass299_12043.anInt3334) * -660374885));
				if (bool_77_) {
					bool = true;
					break;
				}
			}
		}
		for (int i_78_ = 0; i_78_ < aClass157Array11810.length; i_78_++)
			aClass157Array11810[i_78_] = null;
		return bool;
	}

	@Override
	public int method10674() {
		if (aClass299_12043.anIntArray3302 != null) {
			Class299 class299 = aClass299_12043.method3996(Class570.playerVarsProvider, Class570.playerVarsProvider, -715880432);
			if (null != class299 && class299.anInt3263 * 1109304839 != -1)
				return 1109304839 * class299.anInt3263;
		}
		return aClass299_12043.anInt3263 * 1109304839;
	}

	static final void decodeGPN(int i, byte i_4_) {
	BitBuffer class528_sub42_sub2
	    = client.aClass109_10930.aClass528_Sub42_Sub2_1378;
	while (class528_sub42_sub2.method10622((client.aClass109_10930
						.anInt1383) * 1841403963,
					       (byte) -62)
	       >= 15) {
	    int i_5_ = class528_sub42_sub2.readBits(15, (byte) -90);
	    if (i_5_ == 32767)
		break;
	    boolean bool = false;
	    Class528_Sub31 class528_sub31
		= ((Class528_Sub31)
		   client.aClass692_11110.method8137(i_5_));
	    if (null == class528_sub31) {
		NPC class645_sub1_sub5_sub1_sub1
		    = (new NPC
		       (client.gameScene.method5973((byte) 57)));
		class645_sub1_sub5_sub1_sub1.anInt11783 = i_5_ * 1791366607;
		class528_sub31
		    = new Class528_Sub31(class645_sub1_sub5_sub1_sub1);
		client.aClass692_11110.method8142(class528_sub31, i_5_);
		client.aClass528_Sub31Array10920
		    [(client.anInt10921 += -1271268379) * -693122579 - 1]
		    = class528_sub31;
		bool = true;
	    }
	    NPC class645_sub1_sub5_sub1_sub1
		= (NPC) class528_sub31.anObject10468;
	    client.anIntArray10923
		[(client.anInt10922 += -1811618175) * -2065344127 - 1]
		= i_5_;
	    class645_sub1_sub5_sub1_sub1.anInt11758
		= client.anInt11032 * -653015535;
	    if (class645_sub1_sub5_sub1_sub1.aClass299_12043 != null
		&& class645_sub1_sub5_sub1_sub1.aClass299_12043
		       .method4002((byte) 53))
		Class692.method8152(class645_sub1_sub5_sub1_sub1, 339289776);
	    int i_6_ = class528_sub42_sub2.readBits(1, (byte) -121);
	    class645_sub1_sub5_sub1_sub1.method10898
		((Class299) (Class21.aClass5_Sub8_214.method63
			     (class528_sub42_sub2.readBits(15, (byte) -2),
			      -1935618707)),
		 685015249);
	    int i_7_
		= (class528_sub42_sub2.readBits(3, (byte) -126) + 4 << 11
		   & 0x3fff);
	    int i_8_ = class528_sub42_sub2.readBits(1, (byte) -127);
	    if (1 == i_8_)
		client.anIntArray10925
		    [(client.anInt10924 += 1904393989) * -141740595 - 1]
		    = i_5_;
	    int i_9_ = class528_sub42_sub2.readBits(i, (byte) -122);
	    if (i_9_ > (1 << i - 1) - 1)
		i_9_ -= 1 << i;
	    int i_10_ = class528_sub42_sub2.readBits(i, (byte) -108);
	    if (i_10_ > (1 << i - 1) - 1)
		i_10_ -= 1 << i;
	    int i_11_ = class528_sub42_sub2.readBits(2, (byte) 0);
	    class645_sub1_sub5_sub1_sub1.setSize
		((-2134279851
		  * class645_sub1_sub5_sub1_sub1.aClass299_12043.anInt3321),
		 -460201207);
	    class645_sub1_sub5_sub1_sub1.anInt11760
		= ((65886605
		    * class645_sub1_sub5_sub1_sub1.aClass299_12043.anInt3301)
		   << 3) * -1365090067;
	    if (bool)
		class645_sub1_sub5_sub1_sub1.method10663(i_7_, true,
							 -2114812464);
	    class645_sub1_sub5_sub1_sub1.method10902
		(i_11_,
		 (Class108.myPlayer.sceneXQueue
		  [0]) + i_10_,
		 (Class108.myPlayer.sceneYQueue
		  [0]) + i_9_,
		 i_6_ == 1,
		 class645_sub1_sub5_sub1_sub1.method10671((byte) -65),
		 (byte) -100);
	    if (class645_sub1_sub5_sub1_sub1.aClass299_12043
		    .method4002((byte) 48))
		Class293.method3961(class645_sub1_sub5_sub1_sub1.aByte10675,
				    (class645_sub1_sub5_sub1_sub1
				     .sceneXQueue[0]),
				    (class645_sub1_sub5_sub1_sub1
				     .sceneYQueue[0]),
				    0, null, class645_sub1_sub5_sub1_sub1,
				    null, (short) 857);
	    if (bool)
		class645_sub1_sub5_sub1_sub1.method10908(1557643923);
	}
	class528_sub42_sub2.setByteAccess(874087544);
	}

	static final void decodeMasks(int i) {
		BitBuffer class528_sub42_sub2 = client.aClass109_10930.aClass528_Sub42_Sub2_1378;
		for (int i_1_ = 0; i_1_ < client.anInt10924 * -141740595; i_1_++) {
			int i_2_ = client.anIntArray10925[i_1_];
			NPC npc = ((NPC) (((Class528_Sub31) client.aClass692_11110
					.method8137(i_2_)).anObject10468));
			class528_sub42_sub2.readUnsignedShort(-1265536969);
			int i_3_ = class528_sub42_sub2.readUnsignedByte((byte) 58);
			if (0 != (i_3_ & 0x4))
				i_3_ += class528_sub42_sub2.readUnsignedByte((byte) 120) << 8;
			if (0 != (i_3_ & 0x1000))
				i_3_ += class528_sub42_sub2.readUnsignedByte((byte) 10) << 16;
			if (0 != (i_3_ & 0x10000))
				i_3_ += class528_sub42_sub2.readUnsignedByte((byte) 73) << 24;
			if (0 != (i_3_ & 0x8000)) {
				int i_4_ = class528_sub42_sub2.readUnsignedByte((byte) 38);
				int[] is = new int[i_4_];
				int[] is_5_ = new int[i_4_];
				int[] is_6_ = new int[i_4_];
				for (int i_7_ = 0; i_7_ < i_4_; i_7_++) {
					int i_8_ = class528_sub42_sub2.method9645((short) 3027);
					is[i_7_] = i_8_;
					is_5_[i_7_] = class528_sub42_sub2.readUnsignedByte((byte) 122);
					is_6_[i_7_] = class528_sub42_sub2.readUnsignedShort(-1052532575);
				}
				Class498.method6068(npc, is, is_5_, is_6_, -2010573714);
			}
			if (0 != (i_3_ & 0x800)) {
				npc.anInt12039 = class528_sub42_sub2.readShortA((byte) -29) * 1702071077;
				if (-1979082579 * npc.anInt12039 == 65535)
					npc.anInt12039 = -1702071077;
			}
			if ((i_3_ & 0x20000) != 0) {
				int i_9_ = ((class528_sub42_sub2.payload[((class528_sub42_sub2.pointer += 2015001547) * -185904669)
						- 1]) & 0xff);
				for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
					int i_11_ = class528_sub42_sub2.method9614(-1220398584);
					int i_12_ = class528_sub42_sub2.method9675(2034519670);
					int i_13_ = class528_sub42_sub2.method9641(-1613305383);
					npc.method10910(i_11_, i_12_, i_13_, (byte) -1);
				}
			}
			if (0 != (i_3_ & 0x10)) {
				npc.anInt11780 = class528_sub42_sub2.readUnsignedShort(-1650195526) * 1577001447;
				if (65535 == -1378983465 * npc.anInt11780)
					npc.anInt11780 = -1577001447;
			}
			if (0 != (i_3_ & 0x20)) {
				int i_14_ = class528_sub42_sub2.readUnsignedShort(-1216007493);
				int i_15_ = class528_sub42_sub2.readLEInt((short) 16385);
				if (i_14_ == 65535)
					i_14_ = -1;
				int i_16_ = class528_sub42_sub2.readUnsignedA((byte) -27);
				int i_17_ = i_16_ & 0x7;
				int i_18_ = i_16_ >> 3 & 0xf;
				if (15 == i_18_)
					i_18_ = -1;
				boolean bool = 1 == (i_16_ >> 7 & 0x1);
				npc.method10667(i_14_, i_15_, i_17_, i_18_, bool, 0, (byte) -50);
			}
			if (0 != (i_3_ & 0x400000)) {
				npc.aString12044 = class528_sub42_sub2.readString(447192276);
				if ("".equals(npc.aString12044) || (npc.aString12044.equals(npc.aClass299_12043.aString3269)))
					npc.aString12044 = (npc.aClass299_12043.aString3269);
			}
			if (0 != (i_3_ & 0x2)) {
				int i_19_ = class528_sub42_sub2.readUnsignedByte((byte) 91);
				if (i_19_ > 0) {
					for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
						int i_21_ = -1;
						int i_22_ = -1;
						int i_23_ = -1;
						int i_24_ = class528_sub42_sub2.method9719(65280);
						if (i_24_ == 32767) {
							i_24_ = class528_sub42_sub2.method9719(65280);
							i_22_ = class528_sub42_sub2.method9719(65280);
							i_21_ = class528_sub42_sub2.method9719(65280);
							i_23_ = class528_sub42_sub2.method9719(65280);
						} else if (32766 != i_24_)
							i_22_ = class528_sub42_sub2.method9719(65280);
						else {
							i_24_ = -1;
							i_22_ = class528_sub42_sub2.readUnsignedByte((byte) 76);
						}
						int i_25_ = class528_sub42_sub2.method9719(65280);
						npc.method10683(i_24_, i_22_, i_21_, i_23_, client.anInt11127, i_25_,
								(short) -10751);
					}
				}
				int i_26_ = class528_sub42_sub2.readUnsignedS(-108961376);
				if (i_26_ > 0) {
					for (int i_27_ = 0; i_27_ < i_26_; i_27_++) {
						int i_28_ = class528_sub42_sub2.method9719(65280);
						int i_29_ = class528_sub42_sub2.method9719(65280);
						if (i_29_ != 32767) {
							int i_30_ = class528_sub42_sub2.method9719(65280);
							int i_31_ = class528_sub42_sub2.readUnsignedByte((byte) 21);
							int i_32_ = (i_29_ > 0 ? class528_sub42_sub2.readUnsignedS(-1456229840) : i_31_);
							npc.method10669(i_28_, client.anInt11127, i_29_, i_30_, i_31_,
									i_32_, -2036939349);
						} else
							npc.method10670(i_28_, 1319313565);
					}
				}
			}
			if (0 != (i_3_ & 0x4000000)) {
				int i_33_ = class528_sub42_sub2.readUnsignedShort(-948702722);
				int i_34_ = class528_sub42_sub2.readLEInt((short) 16385);
				if (65535 == i_33_)
					i_33_ = -1;
				int i_35_ = class528_sub42_sub2.method9614(-1220398584);
				int i_36_ = i_35_ & 0x7;
				int i_37_ = i_35_ >> 3 & 0xf;
				if (15 == i_37_)
					i_37_ = -1;
				boolean bool = 1 == (i_35_ >> 7 & 0x1);
				npc.method10667(i_33_, i_34_, i_36_, i_37_, bool, 3, (byte) 14);
			}
			if (0 != (i_3_ & 0x10000000)) {
				int i_38_ = class528_sub42_sub2.readLEShortA(1451248615);
				int i_39_ = class528_sub42_sub2.readLEInt((short) 16385);
				if (65535 == i_38_)
					i_38_ = -1;
				int i_40_ = class528_sub42_sub2.readUnsignedS(-1790655477);
				int i_41_ = i_40_ & 0x7;
				int i_42_ = i_40_ >> 3 & 0xf;
				if (15 == i_42_)
					i_42_ = -1;
				boolean bool = (i_40_ >> 7 & 0x1) == 1;
				npc.method10667(i_38_, i_39_, i_41_, i_42_, bool, 4, (byte) -5);
			}
			if (0 != (i_3_ & 0x8))
				npc.method10907(class528_sub42_sub2.readString(1212053068), 0, 0, (byte) 14);
			if (0 != (i_3_ & 0x1000000))
				npc.aBool11764 = class528_sub42_sub2.readUnsignedA((byte) -15) == 1;
			if (0 != (i_3_ & 0x8000000)) {
				npc.aByte11797 = class528_sub42_sub2.readSignedS(1080254325);
				npc.aByte11815 = class528_sub42_sub2.method9657((byte) 119);
				npc.aByte11799 = class528_sub42_sub2.readSignedC(838250106);
				npc.aByte11788 = (byte) class528_sub42_sub2.method9614(-1220398584);
				npc.anInt11756 = ((client.anInt11127
						+ class528_sub42_sub2.readShortA((byte) -17)) * 661225281);
				npc.anInt11796 = ((client.anInt11127
						+ class528_sub42_sub2.readShortA((byte) -30)) * 1584973623);
			}
			if ((i_3_ & 0x2000000) != 0)
				npc.anInt12046 = class528_sub42_sub2.readUnsignedByte((byte) 93) * 367698243;
			if (0 != (i_3_ & 0x100000)) {
				npc.anInt12038 = class528_sub42_sub2.readLEShortA(2012391437) * 287979369;
				if (65535 == npc.anInt12038 * -807024423)
					npc.anInt12038 = 975378287 * (npc.aClass299_12043.anInt3266);
			}
			if (0 != (i_3_ & 0x80)) {
				int[] is = new int[4];
				for (int i_43_ = 0; i_43_ < 4; i_43_++)
					is[i_43_] = class528_sub42_sub2.method9645((short) -5624);
				int i_44_ = class528_sub42_sub2.method9614(-1220398584);
				Class528_Sub29.method9490(npc, is, i_44_, true, 89178858);
			}
			if (0 != (i_3_ & 0x2000)) {
				int i_45_ = class528_sub42_sub2.readUnsignedA((byte) -88);
				int[] is = new int[i_45_];
				int[] is_46_ = new int[i_45_];
				for (int i_47_ = 0; i_47_ < i_45_; i_47_++) {
					int i_48_ = class528_sub42_sub2.readUnsignedShort((short) 24197);
					if ((i_48_ & 0xc000) == 49152) {
						int i_49_ = class528_sub42_sub2.readUnsignedShort(-1353224490);
						is[i_47_] = i_48_ << 16 | i_49_;
					} else
						is[i_47_] = i_48_;
					is_46_[i_47_] = class528_sub42_sub2.readUnsignedShort(-1142438863);
				}
				npc.method10665(is, is_46_, -257335226);
			}
			if (0 != (i_3_ & 0x200)) {
				int i_50_ = class528_sub42_sub2.readUnsignedShort((short) 29771);
				int i_51_ = class528_sub42_sub2.readIntB(-153162540);
				if (i_50_ == 65535)
					i_50_ = -1;
				int i_52_ = class528_sub42_sub2.method9614(-1220398584);
				int i_53_ = i_52_ & 0x7;
				int i_54_ = i_52_ >> 3 & 0xf;
				if (i_54_ == 15)
					i_54_ = -1;
				boolean bool = (i_52_ >> 7 & 0x1) == 1;
				npc.method10667(i_50_, i_51_, i_53_, i_54_, bool, 1, (byte) -74);
			}
			if (0 != (i_3_ & 0x40000)) {
				npc.anInterface2_11798.method27((byte) 2);
				class528_sub42_sub2.pointer += -264964202;
				int i_55_ = ((class528_sub42_sub2.payload[((class528_sub42_sub2.pointer += 2015001547) * -185904669)
						- 1]) & 0xff);
				for (int i_56_ = 0; i_56_ < i_55_; i_56_++) {
					int i_57_ = class528_sub42_sub2.readUnsignedA((byte) -6);
					Class483 class483 = ((Class483) Class443.method5321(Class483.method5867((byte) 1), i_57_,
							1891148853));
					Class411 class411 = (Class664.aClass95_Sub1_Sub1_8460.method8256(class528_sub42_sub2, class483,
							1598716342));
					npc.anInterface2_11798.method15(1862601893 * class411.anInt4711,
							class411.anObject4712, 451499069);
				}
			}
			if ((i_3_ & 0x800000) != 0) {
				int i_58_ = (npc.aClass299_12043.anIntArray3272).length;
				int i_59_ = 0;
				if ((npc.aClass299_12043.aShortArray3284) != null)
					i_59_ = (npc.aClass299_12043.aShortArray3284).length;
				int i_60_ = 0;
				if (null != (npc.aClass299_12043.aShortArray3320))
					i_59_ = (npc.aClass299_12043.aShortArray3320).length;
				int i_61_ = class528_sub42_sub2.method9614(-1220398584);
				if (1 != (i_61_ & 0x1)) {
					class528_sub42_sub2.pointer += -264964202;
					int[] is = null;
					if ((i_61_ & 0x2) == 2) {
						is = new int[i_58_];
						for (int i_62_ = 0; i_62_ < i_58_; i_62_++)
							is[i_62_] = class528_sub42_sub2.method9645((short) 9497);
					}
					short[] is_63_ = null;
					if ((i_61_ & 0x4) == 4) {
						is_63_ = new short[i_59_];
						for (int i_64_ = 0; i_64_ < i_59_; i_64_++)
							is_63_[i_64_] = (short) class528_sub42_sub2.readLEShortA(1214523868);
					}
					short[] is_65_ = null;
					if ((i_61_ & 0x8) == 8) {
						is_65_ = new short[i_60_];
						for (int i_66_ = 0; i_66_ < i_60_; i_66_++)
							is_65_[i_66_] = (short) class528_sub42_sub2.readUnsignedShort((short) 24430);
					}
					long l = (anInt12035 += -1410889035) * -885877859 - 1;
					new Class287(l, is, null, null, null, is_63_, is_65_);
				}
			}
			if (0 != (i_3_ & 0x100)) {
				npc.anInt11766 = class528_sub42_sub2.readSignedS(-31977239) * -888913659;
				npc.anInt11765 = class528_sub42_sub2.method9627(-1389223940) * -960732905;
				npc.anInt11787 = class528_sub42_sub2.method9657((byte) 47) * 979283275;
				npc.anInt11789 = class528_sub42_sub2.readSignedC(1343742096) * 1152853501;
				npc.anInt11790 = class528_sub42_sub2.readSignedC(-567401224) * 691421421;
				npc.anInt11791 = class528_sub42_sub2.readSignedC(1536410014) * 842261403;
				npc.anInt11792 = (class528_sub42_sub2.readShortA((byte) -48)
						+ client.anInt11127) * 377645301;
				npc.anInt11793 = (class528_sub42_sub2.readUnsignedShort((short) 12104)
						+ client.anInt11127) * -808789795;
				npc.anInt11794 = (class528_sub42_sub2.readUnsignedShort((short) 32269) * -818794613);
				npc.quenedStepCount = -670034095;
				npc.anInt11818 = 0;
				npc.anInt11766 += (-888913659 * npc.sceneXQueue[0]);
				npc.anInt11765 += (npc.sceneYQueue[0] * -960732905);
				npc.anInt11787 += (npc.sceneXQueue[0] * 979283275);
				npc.anInt11789 += (1152853501 * npc.sceneYQueue[0]);
				npc.anInt11790 += 691421421 * npc.aByte10675;
				npc.anInt11791 += npc.aByte10675 * 842261403;
			}
			if (0 != (i_3_ & 0x80000)) {
				class528_sub42_sub2.pointer += -264964202;
				int i_67_ = ((class528_sub42_sub2.payload[((class528_sub42_sub2.pointer += 2015001547) * -185904669)
						- 1]) & 0xff);
				for (int i_68_ = 0; i_68_ < i_67_; i_68_++) {
					int i_69_ = class528_sub42_sub2.readUnsignedByte((byte) 23);
					Class483 class483 = ((Class483) Class443.method5321(Class483.method5867((byte) 1), i_69_,
							1425415958));
					Class411 class411 = (Class664.aClass95_Sub1_Sub1_8460.method8256(class528_sub42_sub2, class483,
							-441794172));
					npc.anInterface2_11798.method15(1862601893 * class411.anInt4711,
							class411.anObject4712, 289115387);
				}
			}
			if (0 != (i_3_ & 0x1)) {
				if (npc.aClass299_12043.method4002((byte) 40))
					Class692.method8152(npc, 339289776);
				npc
						.method10899(
								((Class299) (Class21.aClass5_Sub8_214
										.method63(class528_sub42_sub2.method9645((short) -9491), 1609435183))),
								0 == (i_3_ & 0x400000), (i_3_ & 0x100000) == 0, true, 2142754408);
				npc.setSize((npc.aClass299_12043.anInt3321 * -2134279851), -954704337);
				npc.anInt11760 = -1365090067 * (65886605 * (npc.aClass299_12043.anInt3301) << 3);
				if (npc.aClass299_12043.method4002((byte) 53))
					Class293.method3961(npc.aByte10675, npc.sceneXQueue[0], npc.sceneYQueue[0], 0, null, npc, null,
							(short) 857);
			}
			if ((i_3_ & 0x40) != 0) {
				npc.anInt12031 = class528_sub42_sub2.readLEShortA(969998938) * 327351317;
				npc.anInt12032 = class528_sub42_sub2.readLEShortA(2032100659) * 259201889;
			}
			if (0 != (i_3_ & 0x200000)) {
				int i_70_ = class528_sub42_sub2.method9614(-1220398584);
				int[] is = new int[8];
				short[] is_71_ = new short[8];
				for (int i_72_ = 0; i_72_ < 8; i_72_++) {
					if (0 != (i_70_ & 1 << i_72_)) {
						is[i_72_] = class528_sub42_sub2.method9645((short) -21529);
						is_71_[i_72_] = (short) class528_sub42_sub2.method9725(-640965336);
					} else {
						is[i_72_] = -1;
						is_71_[i_72_] = (short) -1;
					}
				}
				npc.aClass281_12037 = new Class281(is, is_71_);
			}
			if ((i_3_ & 0x20000000) != 0) {
				int i_73_ = class528_sub42_sub2.readUnsignedShort(-375548898);
				int i_74_ = class528_sub42_sub2.readIntB(-621156490);
				if (i_73_ == 65535)
					i_73_ = -1;
				int i_75_ = class528_sub42_sub2.readUnsignedByte((byte) 17);
				int i_76_ = i_75_ & 0x7;
				int i_77_ = i_75_ >> 3 & 0xf;
				if (i_77_ == 15)
					i_77_ = -1;
				boolean bool = 1 == (i_75_ >> 7 & 0x1);
				npc.method10667(i_73_, i_74_, i_76_, i_77_, bool, 2, (byte) -94);
			}
			if ((i_3_ & 0x400) != 0) {
				int i_78_ = (npc.aClass299_12043.anIntArray3271).length;
				int i_79_ = 0;
				if (null != (npc.aClass299_12043.aShortArray3284))
					i_79_ = (npc.aClass299_12043.aShortArray3284).length;
				int i_80_ = 0;
				if (null != (npc.aClass299_12043.aShortArray3320))
					i_80_ = (npc.aClass299_12043.aShortArray3320).length;
				int i_81_ = class528_sub42_sub2.method9614(-1220398584);
				if (1 == (i_81_ & 0x1))
					npc.aClass287_12033 = null;
				else {
					class528_sub42_sub2.pointer += -264964202;
					int[] is = null;
					float[] fs = null;
					int[][] is_82_ = null;
					int[][] is_83_ = null;
					if (2 == (i_81_ & 0x2)) {
						is = new int[i_78_];
						if ((i_81_ & 0x10) == 16) {
							fs = new float[i_78_];
							is_82_ = new int[i_78_][3];
							is_83_ = new int[i_78_][3];
						}
						for (int i_84_ = 0; i_84_ < i_78_; i_84_++) {
							is[i_84_] = class528_sub42_sub2.method9645((short) -2882);
							if (16 == (i_81_ & 0x10) && -1 != is[i_84_]) {
								fs[i_84_] = class528_sub42_sub2.method9635(-1586048895);
								for (int i_85_ = 0; i_85_ < 3; i_85_++)
									is_82_[i_84_][i_85_] = class528_sub42_sub2.method9668(-1396223365);
								for (int i_86_ = 0; i_86_ < 3; i_86_++)
									is_83_[i_84_][i_86_] = class528_sub42_sub2.method9612(1250380913);
							}
						}
					}
					short[] is_87_ = null;
					if (4 == (i_81_ & 0x4)) {
						is_87_ = new short[i_79_];
						for (int i_88_ = 0; i_88_ < i_79_; i_88_++)
							is_87_[i_88_] = (short) class528_sub42_sub2.readLEShortA(2051792108);
					}
					short[] is_89_ = null;
					if (8 == (i_81_ & 0x8)) {
						is_89_ = new short[i_80_];
						for (int i_90_ = 0; i_90_ < i_80_; i_90_++)
							is_89_[i_90_] = (short) class528_sub42_sub2.readUnsignedShort((short) 20154);
					}
					long l = (anInt12034 += 519628303) * 826493167 - 1;
					npc.aClass287_12033 = new Class287(l, is, fs, is_82_, is_83_, is_87_,
							is_89_);
				}
			}
		}
	}

	static final void decodeNPCUpdate(int i, int i_35_) {
		client.anInt10927 = 0;
		client.anInt10924 = 0;
		client.anInt11032 += -1129367691;
		Class364_Sub1.method9169(1197234014);
		decodeGPN(i, (byte) 75);
		decodeMasks(1368216068);
		boolean bool = false;
		for (int i_36_ = 0; i_36_ < client.anInt10927 * -1261097409; i_36_++) {
			int i_37_ = client.anIntArray10928[i_36_];
			Class528_Sub31 class528_sub31 = ((Class528_Sub31) client.aClass692_11110.method8137(i_37_));
			NPC class645_sub1_sub5_sub1_sub1 = (NPC) class528_sub31.anObject10468;
			if (client.anInt11032 * -2092654371 != 1846571533 * class645_sub1_sub5_sub1_sub1.anInt11758) {
				if (Class28.aBool273 && Class560.method6813(i_37_, 927670351))
					Class666.method7903(1788932510);
				if (class645_sub1_sub5_sub1_sub1.aClass299_12043.method4002((byte) 114))
					Class692.method8152(class645_sub1_sub5_sub1_sub1, 339289776);
				class645_sub1_sub5_sub1_sub1.method10898(null, -1897609509);
				class528_sub31.method6443(1224620035);
				bool = true;
			}
		}
		if (bool) {
			int i_38_ = -693122579 * client.anInt10921;
			client.anInt10921 = (client.aClass692_11110.method8139((short) 5304) * -1271268379);
			int i_39_ = 0;
			Iterator iterator = client.aClass692_11110.iterator();
			while (iterator.hasNext()) {
				Class528_Sub31 class528_sub31 = (Class528_Sub31) iterator.next();
				client.aClass528_Sub31Array10920[i_39_++] = class528_sub31;
			}
			for (int i_40_ = client.anInt10921 * -693122579; i_40_ < i_38_; i_40_++)
				client.aClass528_Sub31Array10920[i_40_] = null;
			Class297 class297 = Class495.aClass283_Sub1_5578.method3787((byte) -5);
			if (Class297.aClass297_3251 == class297) {
				Class326_Sub1 class326_sub1 = ((Class326_Sub1) Class495.aClass283_Sub1_5578.method3811(-427764314));
				class326_sub1.method9094(838161427);
			}
			Class294 class294 = Class495.aClass283_Sub1_5578.method3786((byte) 18);
			if (Class294.aClass294_3225 == class294) {
				Class684_Sub1 class684_sub1 = ((Class684_Sub1) Class495.aClass283_Sub1_5578.method3785((byte) 100));
				class684_sub1.method10055((byte) 1);
			}
		}
		if (client.aClass109_10930.anInt1383 * 1841403963 != -185904669
				* (client.aClass109_10930.aClass528_Sub42_Sub2_1378.pointer))
			throw new RuntimeException(
					new StringBuilder().append((client.aClass109_10930.aClass528_Sub42_Sub2_1378.pointer) * -185904669)
							.append(" ").append(1841403963 * client.aClass109_10930.anInt1383).toString());
		for (int i_41_ = 0; i_41_ < -2065344127 * client.anInt10922; i_41_++) {
			if (client.aClass692_11110.method8137(client.anIntArray10923[i_41_]) == null)
				throw new RuntimeException(new StringBuilder().append(i_41_).append(" ")
						.append(client.anInt10922 * -2065344127).toString());
		}
		if (0 != (-693122579 * client.anInt10921 - client.anInt10922 * -2065344127))
			throw new RuntimeException(new StringBuilder().append("")
					.append(-693122579 * client.anInt10921 - client.anInt10922 * -2065344127).toString());
		for (int i_42_ = 0; i_42_ < -693122579 * client.anInt10921; i_42_++) {
			if (1846571533
					* ((Entity) (client.aClass528_Sub31Array10920[i_42_].anObject10468)).anInt11758 != -2092654371
							* client.anInt11032)
				throw new RuntimeException(new StringBuilder().append("")
						.append(-34811601
								* (((Entity) (client.aClass528_Sub31Array10920[i_42_].anObject10468)).anInt11783))
						.toString());
		}
	}
}
