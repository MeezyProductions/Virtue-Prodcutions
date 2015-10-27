/* Player - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Player extends Entity {
	String suffixTitle;
	public int anInt12048;
	public boolean aBool12049;
	public int anInt12050;
	public byte gender = 0;
	public PlayerModel model;
	public int[] headIconSubIDs;
	String prefixTitle;
	public int combatLevel;
	public int anInt12056;
	public String displayFiltered;
	public int skillLevel;
	public int facingDirection;
	public int anInt12060;
	public int teamId;
	public int anInt12062;
	public int anInt12063;
	public int anInt12064;
	public boolean inClan;
	public Class213 aClass213_12066;
	public int anInt12067;
	int anInt12068;
	public String displayUnfiltered;
	public boolean hidden;
	public int[] headIconSpriteIDs;

	public void decodeAppearence(ByteBuffer buffer, byte gen, int i_0_) {
		gender = gen;
		int i_1_ = -1;
		teamId = 0;
		int[] is = new int[Class162.equipDefaults.disabledSlots.length];
		ItemStyleOverride[] modifiedStyles = new ItemStyleOverride[Class162.equipDefaults.disabledSlots.length];
		ItemType[] items = new ItemType[Class162.equipDefaults.disabledSlots.length];
		for (int slot = 0; slot < Class162.equipDefaults.disabledSlots.length; slot++) {
			if (Class162.equipDefaults.disabledSlots[slot] != 1) {
				int i_3_ = buffer.readUnsignedByte((byte) 113);
				if (i_3_ == 0)
					is[slot] = 0;
				else {
					int i_4_ = buffer.readUnsignedByte((byte) 10);
					int style = (i_3_ << 8) + i_4_;
					if (slot == 0 && 65535 == style) {
						i_1_ = buffer.method9645((short) 20497);
						teamId = (buffer.readUnsignedByte((byte) 79) * 1766271915);
						break;
					}
					if (style >= 16384) {
						style -= 16384;
						is[slot] = style | 0x40000000;
						items[slot] = (ItemType) Class18.aClass5_Sub13_206.method63(style, 717143504);
						int i_6_ = items[slot].anInt69 * -881031251;
						if (0 != i_6_)
							teamId = i_6_ * 1766271915;
					} else
						is[slot] = style - 256 | ~0x7fffffff;
				}
			}
		}
		if (-1 == i_1_) {
			int i_7_ = buffer.readUnsignedShort(590688107);
			int i_8_ = 0;
			for (int i_9_ = 0; i_9_ < Class162.equipDefaults.disabledSlots.length; i_9_++) {
				if (Class162.equipDefaults.disabledSlots[i_9_] == 0) {
					if (0 != (i_7_ & 1 << i_8_))
						modifiedStyles[i_9_] = Class359.method4589(items[i_9_], buffer, 1742281296);
					i_8_++;
				}
			}
		}
		int[] is_10_ = new int[10];
		for (int i_11_ = 0; i_11_ < 10; i_11_++) {
			int i_12_ = buffer.readUnsignedByte((byte) 6);
			if (Class73.aShortArrayArrayArray782.length < 1 || i_12_ < 0
					|| i_12_ >= Class73.aShortArrayArrayArray782[i_11_][0].length)
				i_12_ = 0;
			is_10_[i_11_] = i_12_;
		}
		int[] is_13_ = new int[10];
		for (int i_14_ = 0; i_14_ < 10; i_14_++) {
			int i_15_ = buffer.readUnsignedByte((byte) 91);
			if (Class101.aShortArrayArrayArray1287.length < 1 || i_15_ < 0
					|| (i_15_ >= Class101.aShortArrayArrayArray1287[i_14_][0].length))
				i_15_ = 0;
			is_13_[i_14_] = i_15_;
		}
		this.anInt12068 = buffer.readUnsignedShort(-701422351) * -330421891;
		if (null == model)
			model = new PlayerModel();
		int i_16_ = 674438203 * model.anInt7968;
		int[] is_17_ = model.anIntArray7965;
		model.method7270(method10676((byte) 1), is, modifiedStyles, is_10_, is_13_, gender == 1, i_1_,
				-106985088);
		if (i_1_ != i_16_) {
			Class422 class422 = Class422.method5052(method7693().aClass422_4868);
			class422.aFloat4780 = (sceneXQueue[0] << 9) + (method10671((byte) -15) << 8);
			class422.aFloat4777 = (sceneYQueue[0] << 9) + (method10671((byte) -38) << 8);
			method7688(class422);
			class422.method5054();
		}
		if (client.anInt11025 * -1453744879 == anInt11783 * -34811601 && null != is_17_) {
			for (int i_18_ = 0; i_18_ < is_10_.length; i_18_++) {
				if (is_10_[i_18_] != is_17_[i_18_]) {
					Class18.aClass5_Sub13_206.method10169((byte) -77);
					break;
				}
			}
		}
		if (null != this.aClass612_11800)
			this.aClass612_11800.method7324();
		if (aClass690_Sub3_11803.method8067((byte) 25) && aClass690_Sub3_11803.aBool10798) {
			RenderType renderType = getRender(333332503);
			if (!renderType.method6981(aClass690_Sub3_11803.method8068(-772845955), 1694132180)) {
				aClass690_Sub3_11803.method8069(-1, (byte) 12);
				aClass690_Sub3_11803.aBool10798 = false;
			}
		}
	}

	public final void decodeCharacterData(ByteBuffer buffer, int i) {
		buffer.pointer = 0;
		int flags = buffer.readUnsignedByte((byte) 102);
		byte gender = (byte) (flags & 0x1);
		boolean showSkill = (flags & 0x4) != 0;
		int i_21_ = super.method10671((byte) -3);
		setSize(1 + (flags >> 3 & 0x7), -797883220);
		boolean hasPrefixTitle = (flags & 0x40) != 0;
		boolean hasSuffixTitle = 0 != (flags & 0x80);
		Class422 class422 = Class422.method5052(method7693().aClass422_4868);
		class422.aFloat4780 += method10671((byte) -117) - i_21_ << 8;
		class422.aFloat4777 += method10671((byte) -53) - i_21_ << 8;
		method7688(class422);
		class422.method5054();
		if (hasPrefixTitle)
			this.prefixTitle = buffer.method9637((byte) -46);
		else
			this.prefixTitle = null;
		if (hasSuffixTitle)
			this.suffixTitle = buffer.method9637((byte) -25);
		else
			this.suffixTitle = null;
		hidden = buffer.method9627(-985194204) == 1;
		if (ModeWhere.LIVE == Class646.aClass665_8386 && 859247239 * client.playerRights >= 2)
			hidden = false;
		decodeAppearence(buffer, gender, 1665183975);
		displayFiltered = buffer.readString(1435703088);
		displayUnfiltered = displayFiltered;
		if (Class108.myPlayer == this)
			RuntimeException_Sub4.aString11931 = displayFiltered;
		combatLevel = buffer.readUnsignedByte((byte) 101) * -1970302771;
		if (showSkill) {
			skillLevel = buffer.readUnsignedShort(556767512) * -814281477;
			if (65535 == skillLevel * 1977163315)
				skillLevel = 814281477;
			anInt12056 = combatLevel * -561645465;
			anInt12064 = 281092011;
		} else {
			skillLevel = 0;
			anInt12056 = buffer.readUnsignedByte((byte) 50) * -729097605;
			anInt12064 = buffer.readUnsignedByte((byte) 84) * -281092011;
			if (255 == 1543970045 * anInt12064)
				anInt12064 = 281092011;
		}
		int i_24_ = anInt12050 * -645857965;
		anInt12050 = buffer.readUnsignedByte((byte) 62) * -1314369829;
		if (0 != anInt12050 * -645857965) {
			int i_25_ = -1616325767 * anInt12062;
			int i_26_ = -50209973 * anInt12063;
			int i_27_ = anInt12060 * 1707492535;
			int i_28_ = anInt12048 * 303614391;
			int i_29_ = -1294960063 * anInt12067;
			anInt12062 = buffer.readUnsignedShort(-1902755094) * 469640905;
			anInt12063 = buffer.readUnsignedShort(-799161771) * -1833478557;
			anInt12060 = buffer.readUnsignedShort(-1287433779) * 542365959;
			anInt12048 = buffer.readUnsignedShort(689825482) * 2108777479;
			anInt12067 = buffer.readUnsignedByte((byte) 113) * 917280193;
			if (i_24_ != anInt12050 * -645857965 || i_25_ != -1616325767 * anInt12062 || -50209973 * anInt12063 != i_26_
					|| i_27_ != 1707492535 * anInt12060 || i_28_ != anInt12048 * 303614391
					|| anInt12067 * -1294960063 != i_29_)
				Class56.method981(this, 884045161);
		} else
			Class427.method5149(this, -37740909);
	}

	public void decodeHeadIcons(ByteBuffer buffer, byte i) {
		buffer.pointer = 0;
		int i_30_ = buffer.readUnsignedByte((byte) 94);
		for (int i_31_ = 0; i_31_ < headIconSubIDs.length; i_31_++) {
			if ((i_30_ & 1 << i_31_) != 0) {
				int i_32_ = buffer.readUnsignedByte((byte) 94);
				int i_33_ = buffer.readUnsignedShort(-5094937);
				headIconSubIDs[i_31_] = i_32_;
				headIconSpriteIDs[i_31_] = i_33_;
			} else {
				headIconSubIDs[i_31_] = -1;
				headIconSpriteIDs[i_31_] = -1;
			}
		}
	}

	@Override
	public Class295 method173() {
		return Class295.aClass295_3235;
	}

	@Override
	public Class554 method9780(Class173 class173, int i) {
		return null;
	}

	@Override
	public int method73() {
		return anInt11783 * -34811601;
	}

	@Override
	void method9779(Class173 class173, int i) {
		if (null != model && (this.aBool11820 || method10928(class173, 0, 306930455))) {
			Class433 class433 = class173.method2479();
			class433.method5218(method7693());
			class433.method5252(0.0F, -5.0F, 0.0F);
			method10725(class173, aClass157Array11810, class433, this.aBool11820, 782025488);
			for (int i_34_ = 0; i_34_ < aClass157Array11810.length; i_34_++)
				aClass157Array11810[i_34_] = null;
		}
	}

	void method10920(Class173 class173, Class433 class433, Class157 class157, long l, long l_35_, int i, long l_36_) {
		long l_37_ = l_35_ * l_35_ + l * l;
		if (l_37_ >= 262144L && l_37_ <= l_36_) {
			int i_38_ = ((int) ((Math.atan2(l, l_35_) * 2607.5945876176133) - aClass37_11809.method795(1411671828))
					& 0x3fff);
			Class157 class157_39_ = Class679.method7970(class173, i_38_, (this.anInt11768) * 33753641,
					(517373133 * (this.anInt11769)), (this.anInt11770) * 970473743, i, 2147133723);
			if (null != class157_39_) {
				class173.method2283(false);
				class157_39_.method1897(class433, null, 0);
				class173.method2283(true);
			}
		}
	}

	@Override
	public Class528_Sub19 method169(int i) {
		Class578 class578 = client.gameScene.method5966(1273279609);
		return Class49.method891(aByte10675,
				((int) method7693().aClass422_4868.aFloat4780 + -1650867712 * class578.anInt7607),
				-(int) method7693().aClass422_4868.aFloat4776,
				((int) method7693().aClass422_4868.aFloat4777 + class578.anInt7608 * 1200930304), -605673768);
	}

	public String method10921(boolean bool, byte i) {
		if (bool)
			return displayFiltered;
		return displayUnfiltered;
	}

	public final void method10922(int i, int i_40_, byte i_41_, int i_42_) {
		if (aClass690_11774.method8067((byte) 28)
				&& (aClass690_11774.method8073(-1592236996).anInt2163 * -1651238579 == 1)) {
			anIntArray11819 = null;
			aClass690_11774.method8069(-1, (byte) 12);
		}
		for (int i_43_ = 0; i_43_ < aClass494Array11785.length; i_43_++) {
			if (aClass494Array11785[i_43_].anInt5529 * -1010180883 != -1) {
				Class669 class669 = ((Class669) Class2.aClass5_Sub12_24
						.method63(((aClass494Array11785[i_43_].anInt5529) * -1010180883), -1519574553));
				if (class669.aBool8504 && -1 != 916695593 * class669.anInt8519
						&& (((Class190) Class379.aClass5_Sub4_3966.method63(((class669.anInt8519) * 916695593),
								-14310908)).anInt2163) * -1651238579 == 1) {
					aClass494Array11785[i_43_].aClass690_5531.method8069(-1, (byte) 12);
					aClass494Array11785[i_43_].anInt5529 = -567730405;
				}
			}
		}
		facingDirection = -2102619979;
		if (i < 0 || i >= client.gameScene.method6029((short) 18663) || i_40_ < 0
				|| i_40_ >= client.gameScene.method5967(2133886177))
			setPosition(i, i_40_, -213276926);
		else if (sceneXQueue[0] < 0 || (sceneXQueue[0] >= client.gameScene.method6029((short) 6799))
				|| sceneYQueue[0] < 0 || (sceneYQueue[0] >= client.gameScene.method5967(908971397)))
			setPosition(i, i_40_, 769491702);
		else
			addStep(i, i_40_, i_41_, -694840032);
	}

	public void setPosition(int i, int i_44_, int i_45_) {
		quenedStepCount = 0;
		anInt11818 = 0;
		anInt11816 = 0;
		sceneXQueue[0] = i;
		sceneYQueue[0] = i_44_;
		int i_46_ = method10671((byte) -74);
		Class422 class422 = Class422.method5052(method7693().aClass422_4868);
		class422.aFloat4780 = sceneXQueue[0] * 512 + i_46_ * 256;
		class422.aFloat4777 = 512 * sceneYQueue[0] + i_46_ * 256;
		method7688(class422);
		class422.method5054();
		if (Class108.myPlayer == this)
			client.gameScene.method5975(-860712462).method7492(-148130096);
		if (this.aClass612_11800 != null)
			this.aClass612_11800.method7324();
	}

	public Player(Class538 class538, int i) {
		super(class538, i, Class691_Sub20.aClass95_Sub1_Sub2_10751);
		headIconSubIDs = new int[8];
		headIconSpriteIDs = new int[8];
		combatLevel = 0;
		anInt12056 = 0;
		anInt12064 = 281092011;
		skillLevel = 0;
		facingDirection = -2102619979;
		aBool12049 = false;
		teamId = 0;
		anInt12062 = -469640905;
		anInt12063 = 1833478557;
		anInt12060 = -542365959;
		anInt12048 = -2108777479;
		anInt12050 = 0;
		anInt12067 = 1978215231;
		aClass213_12066 = Class213.aClass213_2250;
		hidden = false;
		inClan = false;
		method10926((short) -11872);
	}

	public final boolean method10924(byte i) {
		if (model == null)
			return false;
		return true;
	}

	@Override
	public int method10671(byte i) {
		if (model != null && -1 != 674438203 * model.anInt7968)
			return (((Class299) Class21.aClass5_Sub8_214.method63((674438203 * (model.anInt7968)),
					-945879374)).anInt3321 * -2134279851);
		return super.method10671((byte) -40);
	}

	@Override
	public int method10703(int i) {
		return -1;
	}

	@Override
	boolean method9820(Class173 class173, int i, int i_47_, byte i_48_) {
		if (model == null || !method10928(class173, 131072, 306930455))
			return false;
		Class433 class433 = method7685();
		boolean bool = false;
		for (int i_49_ = 0; i_49_ < aClass157Array11810.length; i_49_++) {
			if (null != aClass157Array11810[i_49_] && aClass157Array11810[i_49_].aBool1737
					&& aClass157Array11810[i_49_].method2000(i, i_47_, class433, true, 0)) {
				bool = true;
				break;
			}
		}
		for (int i_50_ = 0; i_50_ < aClass157Array11810.length; i_50_++)
			aClass157Array11810[i_50_] = null;
		return bool;
	}

	@Override
	final boolean method9771(int i) {
		return false;
	}

	@Override
	final void method9798(Class173 class173, Class645_Sub1 class645_sub1, int i, int i_51_, int i_52_, boolean bool,
			int i_53_) {
		throw new IllegalStateException();
	}

	@Override
	final void method9777(int i) {
		throw new IllegalStateException();
	}

	@Override
	public boolean method10679(int i) {
		return Class184.aClass622_2103.aBool8093;
	}

	@Override
	public Class492 method10680(int i) {
		if (null != this.aClass492_11823) {
			if (null == (this.aClass492_11823).aString5518)
				return null;
			if (0 == client.anInt10940 * -1196536155 || 3 == -1196536155 * client.anInt10940
					|| (client.anInt10940 * -1196536155 == 1 && Class388.method4770(displayUnfiltered, -462823212)))
				return this.aClass492_11823;
		}
		return null;
	}


	@Override
	public Class295 method175(byte i) {
		return Class295.aClass295_3235;
	}

	@Override
	public int method168(int i) {
		return anInt11783 * -34811601;
	}

	public void method10925(String string, int i, int i_54_, byte i_55_) {
		method10699(string, i, i_54_,
				(Class262.method3646(-2100271366) * (Class184.aClass622_2103.anInt8111 * 2109024717)), (byte) -82);
	}

	@Override
	public Class430 method170(byte i) {
		Class430 class430 = Class430.method5188();
		class430.method5189(Class417.method4970(aClass37_11809.anInt336 * -247599997), 0.0F, 0.0F);
		return class430;
	}

	@Override
	public Class422 method171(int i) {
		return Class422.method5100();
	}

	@Override
	public Class295 method174() {
		return Class295.aClass295_3235;
	}

	@Override
	public int method71() {
		return anInt11783 * -34811601;
	}

	void method10926(short i) {
		for (int i_56_ = 0; i_56_ < headIconSubIDs.length; i_56_++)
			headIconSubIDs[i_56_] = -1;
		for (int i_57_ = 0; i_57_ < headIconSpriteIDs.length; i_57_++)
			headIconSpriteIDs[i_57_] = -1;
	}

	@Override
	public int method74() {
		return anInt11783 * -34811601;
	}

	@Override
	public int method178() {
		return anInt11783 * -34811601;
	}

	@Override
	public Class528_Sub19 method176() {
		Class578 class578 = client.gameScene.method5966(1273279609);
		return Class49.method891(aByte10675,
				((int) method7693().aClass422_4868.aFloat4780 + -1650867712 * class578.anInt7607),
				-(int) method7693().aClass422_4868.aFloat4776,
				((int) method7693().aClass422_4868.aFloat4777 + class578.anInt7608 * 1200930304), -360908450);
	}

	void method10927() {
		for (int i = 0; i < headIconSubIDs.length; i++)
			headIconSubIDs[i] = -1;
		for (int i = 0; i < headIconSpriteIDs.length; i++)
			headIconSpriteIDs[i] = -1;
	}

	@Override
	public Class430 method172() {
		Class430 class430 = Class430.method5188();
		class430.method5189(Class417.method4970(aClass37_11809.anInt336 * -247599997), 0.0F, 0.0F);
		return class430;
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
	public Class430 method182() {
		Class430 class430 = Class430.method5188();
		class430.method5189(Class417.method4970(aClass37_11809.anInt336 * -247599997), 0.0F, 0.0F);
		return class430;
	}

	public Player(Class538 class538) {
		super(class538, Class691_Sub20.aClass95_Sub1_Sub2_10751);
		headIconSubIDs = new int[8];
		headIconSpriteIDs = new int[8];
		combatLevel = 0;
		anInt12056 = 0;
		anInt12064 = 281092011;
		skillLevel = 0;
		facingDirection = -2102619979;
		aBool12049 = false;
		teamId = 0;
		anInt12062 = -469640905;
		anInt12063 = 1833478557;
		anInt12060 = -542365959;
		anInt12048 = -2108777479;
		anInt12050 = 0;
		anInt12067 = 1978215231;
		aClass213_12066 = Class213.aClass213_2250;
		hidden = false;
		inClan = false;
		method10926((short) -1743);
	}

	@Override
	public Class422 method177() {
		return Class422.method5100();
	}

	@Override
	public Class422 method184() {
		return Class422.method5100();
	}

	boolean method10928(Class173 class173, int i, int i_58_) {
		int i_59_ = i;
		RenderType renderType = getRender(-1286474769);
		Class690 class690 = ((aClass690_11774.method8067((byte) 51) && !aClass690_11774.method8075((byte) 80))
				? aClass690_11774 : null);
		Class690_Sub3 class690_sub3 = ((aClass690_Sub3_11803.method8067((byte) 76) && !aBool12049
				&& (!aClass690_Sub3_11803.aBool10798 || null == class690)) ? aClass690_Sub3_11803 : null);
		int i_60_ = renderType.anInt7674 * -1974472047;
		int i_61_ = 1320357353 * renderType.anInt7652;
		if (0 != i_60_ || 0 != i_61_ || 1397434877 * renderType.anInt7687 != 0 || 0 != renderType.anInt7690 * -435059881)
			i |= 0x7;
		int i_62_ = aClass37_11809.method795(-1067631515);
		boolean bool = (0 != aByte11788 && client.anInt11127 >= 63115457 * anInt11756
				&& client.anInt11127 < anInt11796 * 1325244039);
		if (bool)
			i |= 0x80000;
		Class157 class157 = (aClass157Array11810[0] = model.method7287(class173, i,
				Class147.aClass5_Sub14_1673, ISAACCipher.aClass5_Sub7_157, Class21.aClass5_Sub8_214,
				Class18.aClass5_Sub13_206, Class570.playerVarsProvider, Class570.playerVarsProvider, class690, class690_sub3,
				aClass690_Sub1_Sub1Array11804, anIntArray11805, i_62_, true, Class162.equipDefaults, -633362532));
		int i_63_ = Class558.method6776((short) 3812);
		if (Class509.anInt6957 * 1110656915 < 96 && i_63_ > 50)
			Class156.method1861(1285716496);
		if (Class646.aClass665_8386 != ModeWhere.LIVE && i_63_ < 50) {
			int i_64_;
			for (i_64_ = 50 - i_63_; i_64_ > client.anInt10883 * -1392385575; client.anInt10883 += -367751575)
				Class58.aByteArrayArray707[-1392385575 * client.anInt10883] = new byte[102400];
			while (i_64_ < -1392385575 * client.anInt10883) {
				client.anInt10883 -= -367751575;
				Class58.aByteArrayArray707[-1392385575 * client.anInt10883] = null;
			}
		} else if (Class646.aClass665_8386 != ModeWhere.LIVE) {
			Class58.aByteArrayArray707 = new byte[50][];
			client.anInt10883 = 0;
		}
		if (null == class157)
			return false;
		this.anInt11761 = class157.method2018() * 401213891;
		this.anInt11762 = class157.method1903() * 3061625;
		class157.method1901();
		method10672(class157, 1452595941);
		if (i_60_ != 0 || 0 != i_61_) {
			method10698(i_62_, i_60_, i_61_, renderType.anInt7676 * -1217333989, 1213273849 * renderType.anInt7677,
					(byte) 10);
			if (0 != 33753641 * this.anInt11768)
				class157.method1934(33753641 * this.anInt11768);
			if (this.anInt11769 * 517373133 != 0)
				class157.method1879((this.anInt11769) * 517373133);
			if (970473743 * this.anInt11770 != 0)
				class157.method1880(0, (this.anInt11770) * 970473743, 0);
		} else
			method10698(i_62_, method10671((byte) -7) << 9, method10671((byte) -100) << 9, 0, 0, (byte) -22);
		if (bool)
			class157.method1917(aByte11797, aByte11815, aByte11799, aByte11788 & 0xff);
		if (!aBool12049)
			method10673(class173, renderType, i_59_, i_60_, i_61_, i_62_, (byte) -33);
		return true;
	}


	@Override
	public Class492 method10719() {
		if (null != this.aClass492_11823) {
			if (null == (this.aClass492_11823).aString5518)
				return null;
			if (0 == client.anInt10940 * -1196536155 || 3 == -1196536155 * client.anInt10940
					|| (client.anInt10940 * -1196536155 == 1 && Class388.method4770(displayUnfiltered, -396117576)))
				return this.aClass492_11823;
		}
		return null;
	}

	@Override
	public int method10727() {
		return -(-34811601 * anInt11783) - 1;
	}

	@Override
	public int method10707() {
		if (model != null && -1 != 674438203 * model.anInt7968)
			return (((Class299) Class21.aClass5_Sub8_214.method63((674438203 * (model.anInt7968)),
					-807016390)).anInt3321 * -2134279851);
		return super.method10671((byte) -90);
	}

	@Override
	public int method10715() {
		if (model != null && -1 != 674438203 * model.anInt7968)
			return (((Class299) Class21.aClass5_Sub8_214.method63((674438203 * (model.anInt7968)),
					-706166464)).anInt3321 * -2134279851);
		return super.method10671((byte) -112);
	}


	@Override
	public int method10709() {
		if (model != null && -1 != 674438203 * model.anInt7968)
			return (((Class299) Class21.aClass5_Sub8_214.method63((674438203 * (model.anInt7968)),
					-1955048477)).anInt3321 * -2134279851);
		return super.method10671((byte) -103);
	}


	@Override
	public Class528_Sub19 method179() {
		Class578 class578 = client.gameScene.method5966(1273279609);
		return Class49.method891(aByte10675,
				((int) method7693().aClass422_4868.aFloat4780 + -1650867712 * class578.anInt7607),
				-(int) method7693().aClass422_4868.aFloat4776,
				((int) method7693().aClass422_4868.aFloat4777 + class578.anInt7608 * 1200930304), -343184920);
	}

	@Override
	public Class422 method183() {
		return Class422.method5100();
	}

	@Override
	public boolean method10694() {
		return Class184.aClass622_2103.aBool8093;
	}

	@Override
	public boolean method10682() {
		return Class184.aClass622_2103.aBool8093;
	}

	@Override
	public Class492 method10720() {
		if (null != this.aClass492_11823) {
			if (null == (this.aClass492_11823).aString5518)
				return null;
			if (0 == client.anInt10940 * -1196536155 || 3 == -1196536155 * client.anInt10940
					|| (client.anInt10940 * -1196536155 == 1 && Class388.method4770(displayUnfiltered, -256906567)))
				return this.aClass492_11823;
		}
		return null;
	}

	@Override
	public Class492 method10721() {
		if (null != this.aClass492_11823) {
			if (null == (this.aClass492_11823).aString5518)
				return null;
			if (0 == client.anInt10940 * -1196536155 || 3 == -1196536155 * client.anInt10940
					|| (client.anInt10940 * -1196536155 == 1 && Class388.method4770(displayUnfiltered, 1477337509)))
				return this.aClass492_11823;
		}
		return null;
	}

	@Override
	public int method10674() {
		return -1;
	}

	@Override
	public int method10685() {
		return -(-34811601 * anInt11783) - 1;
	}

	@Override
	public int method10726() {
		return -(-34811601 * anInt11783) - 1;
	}

	public String method10929(boolean bool, short i) {
		String string = "";
		if (this.prefixTitle != null)
			string = this.prefixTitle;
		if (bool)
			string = new StringBuilder().append(string).append(displayFiltered).toString();
		else
			string = new StringBuilder().append(string).append(displayUnfiltered).toString();
		if (this.suffixTitle != null)
			string = new StringBuilder().append(string).append(this.suffixTitle).toString();
		return string;
	}

	final void addStep(int posX, int posY, byte movetype, int i_117_) {
		if (540774833 * quenedStepCount < sceneXQueue.length - 1)
			quenedStepCount += -670034095;
		for (int ptr = quenedStepCount * 540774833; ptr > 0; ptr--) {
			sceneXQueue[ptr] = sceneXQueue[ptr - 1];
			sceneYQueue[ptr] = sceneYQueue[ptr - 1];
			moveTypeQueue[ptr] = moveTypeQueue[ptr - 1];
		}
		sceneXQueue[0] = posX;
		sceneYQueue[0] = posY;
		moveTypeQueue[0] = movetype;
	}



	@Override
	Class549 method9813(Class173 class173, int i) {
		if (model == null || !method10928(class173, 2048, 306930455))
			return null;
		Class433 class433 = class173.method2479();
		Class433 class433_119_ = method7685();
		Class437 class437 = method7693();
		int i_120_ = aClass37_11809.method795(-1172124645);
		Class546 class546 = (aClass538_10676.aClass546ArrayArrayArray7160[aByte10675][(int) class437.aClass422_4868.aFloat4780 >> 9][(int) class437.aClass422_4868.aFloat4777 >> 9]);
		if (null != class546 && null != class546.aClass645_Sub1_Sub4_7397) {
			int i_121_ = (this.anInt11771 * 69507979 - class546.aClass645_Sub1_Sub4_7397.aShort11726);
			this.anInt11771 = (int) ((this.anInt11771) * 69507979 - i_121_ / 10.0F) * 2097394723;
		} else
			this.anInt11771 = (2097394723
					* (int) (69507979 * (this.anInt11771) - 69507979 * (this.anInt11771) / 10.0F));
		class433.method5217(class433_119_);
		class433.method5252(0.0F, -20 - (69507979 * this.anInt11771), 0.0F);
		Class549 class549 = null;
		this.aBool11821 = false;
		if (Class514.aClass528_Sub38_6967.aClass691_Sub7_10589.method9873((short) -28719) == 1) {
			RenderType renderType = getRender(-771446563);
			if (renderType.aBool7650
					&& (model.anInt7968 * 674438203 == -1 || (((Class299) Class21.aClass5_Sub8_214
							.method63((674438203 * (model.anInt7968)), 524642800)).aBool3307))) {
				Class690 class690 = ((aClass690_11774.method8067((byte) 15) && aClass690_11774.method8075((byte) 123))
						? aClass690_11774 : null);
				Class690_Sub3 class690_sub3 = ((aClass690_Sub3_11803.method8067((byte) 6)
						&& (!aClass690_Sub3_11803.aBool10798 || null == class690)) ? aClass690_Sub3_11803 : null);
				short i_122_ = Class184.aClass622_2103.aShort8092;
				byte i_123_ = Class184.aClass622_2103.aByte8094;
				if (-1 != model.anInt7968 * 674438203) {
					i_122_ = ((Class299) (Class21.aClass5_Sub8_214.method63(674438203 * model.anInt7968,
							873897397))).aShort3312;
					i_123_ = (((Class299) Class21.aClass5_Sub8_214.method63(((model.anInt7968) * 674438203),
							-344923912)).aByte3313);
				}
				Object object = null;
				Class157 class157;
				if (i_122_ > -1 && Class514.aClass528_Sub38_6967.aClass691_Sub12_10590.method9915((byte) 1) == 1)
					class157 = (Class27.method720(class173, i_120_, 33753641 * (this.anInt11768),
							517373133 * (this.anInt11769), (this.anInt11770 * 970473743), aClass157Array11810[0],
							i_122_, i_123_, (class690_sub3 != null ? (Class690) class690_sub3 : class690), 1098424025));
				else
					class157 = (Class27.method722(class173, i_120_, (this.anInt11768 * 33753641),
							517373133 * (this.anInt11769), 970473743 * (this.anInt11770), 1, aClass157Array11810[0], 0,
							0, 160, 240, (class690_sub3 != null ? (Class690) class690_sub3 : class690), 1978940392));
				if (null != class157) {
					if (null == aClass159Array10678 || (aClass159Array10678.length < 1 + aClass157Array11810.length))
						method9786(1 + aClass157Array11810.length, 1748172508);
					class549 = Class623.method7435(true, -2110380390);
					this.aBool11821 = true;
					class173.method2283(false);
					class157.method1897(class433, (aClass159Array10678[aClass157Array11810.length]), 0);
					class173.method2283(true);
				}
			}
		}
		if (this == Class108.myPlayer) {
			for (int i_124_ = client.aClass96Array11016.length - 1; i_124_ >= 0; i_124_--) {
				Class96 class96 = client.aClass96Array11016[i_124_];
				if (null != class96 && -1 != class96.anInt1221 * -1463286677) {
					if (1 == class96.anInt1224 * -411936407) {
						Class528_Sub31 class528_sub31 = ((Class528_Sub31) (client.aClass692_11110
								.method8137(class96.anInt1216 * -1637531687)));
						if (class528_sub31 != null) {
							NPC class645_sub1_sub5_sub1_sub1 = ((NPC) class528_sub31.anObject10468);
							Class422 class422 = (Class422.method5065(
									(class645_sub1_sub5_sub1_sub1.method7693().aClass422_4868),
									Class108.myPlayer.method7693().aClass422_4868));
							int i_125_ = (int) class422.aFloat4780;
							int i_126_ = (int) class422.aFloat4777;
							method10920(class173, class433, aClass157Array11810[0], i_125_, i_126_,
									-1463286677 * class96.anInt1221, 92160000L);
						}
					}
					if (class96.anInt1224 * -411936407 == 2) {
						Class422 class422 = (Class108.myPlayer.method7693().aClass422_4868);
						long l = class96.anInt1218 * -1857643871 - (int) class422.aFloat4780;
						long l_127_ = 1777883189 * class96.anInt1219 - (int) class422.aFloat4777;
						long l_128_ = class96.anInt1222 * 1323713139 << 9;
						l_128_ *= l_128_;
						method10920(class173, class433, aClass157Array11810[0], l, l_127_,
								class96.anInt1221 * -1463286677, l_128_);
					}
					if (10 == class96.anInt1224 * -411936407 && -1637531687 * class96.anInt1216 >= 0 && (-1637531687
							* class96.anInt1216 < (client.localPlayers).length)) {
						Player class645_sub1_sub5_sub1_sub2_129_ = (client.localPlayers[class96.anInt1216
								* -1637531687]);
						if (class645_sub1_sub5_sub1_sub2_129_ != null) {
							Class422 class422 = (Class422.method5065(
									class645_sub1_sub5_sub1_sub2_129_.method7693().aClass422_4868,
									Class108.myPlayer.method7693().aClass422_4868));
							int i_130_ = (int) class422.aFloat4780;
							int i_131_ = (int) class422.aFloat4777;
							method10920(class173, class433, aClass157Array11810[0], i_130_, i_131_,
									-1463286677 * class96.anInt1221, 92160000L);
						}
					}
				}
			}
		}
		class433.method5217(class433_119_);
		class433.method5252(0.0F, -5 - (this.anInt11771) * 69507979, 0.0F);
		if (null == aClass159Array10678 || aClass159Array10678.length < aClass157Array11810.length)
			method9786(aClass157Array11810.length, 1161501184);
		if (class549 == null)
			class549 = Class623.method7435(true, -1282352271);
		method10725(class173, aClass157Array11810, class433, false, -882877271);
		for (int i_132_ = 0; i_132_ < aClass157Array11810.length; i_132_++) {
			if (aClass157Array11810[i_132_] != null)
				aClass157Array11810[i_132_].method1897(class433, aClass159Array10678[i_132_],
						(Class108.myPlayer == this ? 1 : 0));
			else
				aClass159Array10678[i_132_].aBool1751 = false;
		}
		if (this.aClass612_11800 != null) {
			Class171 class171 = this.aClass612_11800.method7312();
			class173.method2209(class171);
		}
		for (int i_133_ = 0; i_133_ < aClass157Array11810.length; i_133_++) {
			if (null != aClass157Array11810[i_133_])
				this.aBool11821 |= aClass157Array11810[i_133_].method1919();
			aClass157Array11810[i_133_] = null;
		}
		anInt11822 = 632469719 * client.anInt10968;
		return class549;
	}


	@Override
	public int method10687(int i) {
		return -(-34811601 * anInt11783) - 1;
	}

	@Override
	int method10676(byte i) {
		return -457812011 * this.anInt12068;
	}

	public static String method10932(byte i) {
		return Class364_Sub2.method9233("www", false, 1925772480);
	}
}
