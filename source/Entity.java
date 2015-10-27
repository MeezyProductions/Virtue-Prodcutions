/* Entity - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Entity extends Class645_Sub1_Sub5 implements Interface30 {
	public int anInt11756;
	static final int anInt11757 = 5;
	public int anInt11758;
	int anInt11759;
	public int anInt11760;
	int anInt11761;
	int anInt11762;
	public boolean aBool11763;
	public boolean aBool11764;
	public int anInt11765;
	public int anInt11766;
	public int anInt11767;
	int anInt11768;
	int anInt11769;
	int anInt11770;
	int anInt11771;
	public byte[] moveTypeQueue;
	byte aByte11773;
	public Class690 aClass690_11774;
	public int[] anIntArray11775;
	public int[] anIntArray11776;
	public Class37 aClass37_11777;
	public int[] anIntArray11778;
	public Class695 aClass695_11779;
	public int anInt11780;
	public int[] anIntArray11781;
	int anInt11782;
	public int anInt11783 = -1791366607;
	public int[] anIntArray11784;
	public Class494[] aClass494Array11785;
	public int anInt11786;
	public int anInt11787;
	public byte aByte11788;
	public int anInt11789;
	public int anInt11790;
	public int anInt11791;
	public int anInt11792;
	public int anInt11793;
	public int anInt11794;
	static final int anInt11795 = 20;
	public int anInt11796;
	public byte aByte11797;
	public Interface2 anInterface2_11798;
	public byte aByte11799;
	Class612 aClass612_11800;
	int anInt11801;
	public int anInt11802;
	public Class690_Sub3 aClass690_Sub3_11803;
	public Class690_Sub1_Sub1[] aClass690_Sub1_Sub1Array11804;
	public int[] anIntArray11805;
	public int anInt11806;
	public int[] anIntArray11807;
	public int anInt11808;
	public Class37 aClass37_11809;
	public Class157[] aClass157Array11810;
	public Class37 aClass37_11811;
	public int quenedStepCount;
	public int[] sceneXQueue;
	public int[] sceneYQueue;
	public byte aByte11815;
	public int anInt11816;
	public int anInt11817;
	public int anInt11818;
	public int[] anIntArray11819;
	boolean aBool11820;
	boolean aBool11821;
	public int anInt11822;
	Class492 aClass492_11823;
	Class226 aClass226_11824;
	int anInt11825;
	int anInt11826;
	public Interface17 anInterface17_11827;

	Entity(Class538 class538, Class95_Sub1 class95_sub1) {
		this(class538, 10, class95_sub1);
	}

	@Override
	public int method9819(int i) {
		if (this.anInt11761 * 964177643 == -32768)
			return 0;
		return 964177643 * this.anInt11761;
	}

	@Override
	boolean method9797(int i) {
		return false;
	}


	public void method10663(int i, boolean bool, int i_0_) {
		RenderType renderType = getRender(-1488640512);
		if (bool || -983682109 * renderType.anInt7683 != 0 || 0 != anInt11760 * -1980826395) {
			anInt11808 = (i & 0x3fff) * 1317103411;
			aClass37_11809.method798(-49484805 * anInt11808, (byte) -94);
		}
	}

	public int method10664(int i) {
		RenderType renderType = getRender(456416676);
		int i_1_ = -247599997 * aClass37_11809.anInt336;
		boolean bool;
		if (renderType.anInt7683 * -983682109 != 0)
			bool = aClass37_11809.method794(-49484805 * anInt11808, renderType.anInt7683 * -983682109,
					renderType.anInt7661 * -382861695, -102114000);
		else
			bool = aClass37_11809.method794(-49484805 * anInt11808, -1980826395 * anInt11760, anInt11760 * -1980826395,
					1930792934);
		int i_2_ = aClass37_11809.anInt336 * -247599997 - i_1_;
		if (0 != i_2_)
			anInt11806 += -577405917;
		else {
			anInt11806 = 0;
			aClass37_11809.method798(anInt11808 * -49484805, (byte) -90);
		}
		if (bool) {
			if (0 != renderType.anInt7685 * 353249559) {
				if (i_2_ > 0)
					aClass37_11777.method794(1397434877 * renderType.anInt7687, renderType.anInt7685 * 353249559,
							765049111 * renderType.anInt7686, 930789702);
				else
					aClass37_11777.method794(-(renderType.anInt7687 * 1397434877), renderType.anInt7685 * 353249559,
							renderType.anInt7686 * 765049111, 2098766982);
			}
			if (0 != 2076061219 * renderType.anInt7688)
				aClass37_11811.method794(renderType.anInt7690 * -435059881, renderType.anInt7688 * 2076061219,
						renderType.anInt7689 * 570976461, -277148589);
		} else {
			if (renderType.anInt7685 * 353249559 != 0)
				aClass37_11777.method794(0, renderType.anInt7685 * 353249559, renderType.anInt7686 * 765049111, 601686423);
			else
				aClass37_11777.method798(0, (byte) -87);
			if (0 != 2076061219 * renderType.anInt7688)
				aClass37_11811.method794(0, renderType.anInt7688 * 2076061219, 570976461 * renderType.anInt7689,
						1219018087);
			else
				aClass37_11811.method798(0, (byte) -3);
		}
		return i_2_;
	}

	public void method10665(int[] is, int[] is_3_, int i) {
		if (anIntArray11781 == null && is != null)
			anIntArray11781 = new int[Class162.equipDefaults.disabledSlots.length];
		else if (is == null) {
			anIntArray11781 = null;
			return;
		}
		for (int i_4_ = 0; i_4_ < anIntArray11781.length; i_4_++)
			anIntArray11781[i_4_] = -1;
		for (int i_5_ = 0; i_5_ < is.length; i_5_++) {
			int i_6_ = is_3_[i_5_];
			int i_7_ = 0;
			while (i_7_ < anIntArray11781.length) {
				if ((i_6_ & 0x1) != 0)
					anIntArray11781[i_7_] = is[i_5_];
				i_7_++;
				i_6_ >>= 1;
			}
		}
	}

	public boolean method10666(int i, int i_8_, int i_9_) {
		if (null == anIntArray11805) {
			if (-1 == i_8_)
				return true;
			anIntArray11805 = new int[Class162.equipDefaults.disabledSlots.length];
			for (int i_10_ = 0; i_10_ < Class162.equipDefaults.disabledSlots.length; i_10_++)
				anIntArray11805[i_10_] = -1;
		}
		RenderType renderType = getRender(2128636193);
		int i_11_ = 256;
		if (null != renderType.anIntArray7681 && renderType.anIntArray7681[i] > 0)
			i_11_ = renderType.anIntArray7681[i];
		if (-1 == i_8_) {
			if (-1 == anIntArray11805[i])
				return true;
			int i_12_ = aClass37_11809.method795(1407802972);
			int i_13_ = anIntArray11805[i];
			int i_14_ = i_12_ - i_13_;
			if (i_14_ >= -i_11_ && i_14_ <= i_11_) {
				anIntArray11805[i] = -1;
				for (int i_15_ = 0; i_15_ < Class162.equipDefaults.disabledSlots.length; i_15_++) {
					if (-1 != anIntArray11805[i_15_])
						return true;
				}
				anIntArray11805 = null;
				return true;
			}
			if (i_14_ > 0 && i_14_ <= 8192 || i_14_ <= -8192)
				anIntArray11805[i] = i_13_ + i_11_ & 0x3fff;
			else
				anIntArray11805[i] = i_13_ - i_11_ & 0x3fff;
			return false;
		}
		if (anIntArray11805[i] == -1)
			anIntArray11805[i] = aClass37_11809.method795(1680241931);
		int i_16_ = anIntArray11805[i];
		int i_17_ = i_8_ - i_16_;
		if (i_17_ >= -i_11_ && i_17_ <= i_11_) {
			anIntArray11805[i] = i_8_;
			return true;
		}
		if (i_17_ > 0 && i_17_ <= 8192 || i_17_ <= -8192)
			anIntArray11805[i] = i_16_ + i_11_ & 0x3fff;
		else
			anIntArray11805[i] = i_16_ - i_11_ & 0x3fff;
		return false;
	}

	public final void method10667(int i, int i_18_, int i_19_, int i_20_, boolean bool, int i_21_, byte i_22_) {
		Class494 class494 = aClass494Array11785[i_21_];
		int i_23_ = class494.anInt5529 * -1010180883;
		if (i != -1 && -1 != i_23_) {
			if (i == i_23_) {
				Class669 class669 = ((Class669) Class2.aClass5_Sub12_24.method63(i, -1646842888));
				if (class669.aBool8504 && class669.anInt8519 * 916695593 != -1) {
					Class190 class190 = ((Class190) Class379.aClass5_Sub4_3966
							.method63(((class669.anInt8519) * 916695593), -1617045909));
					int i_24_ = 1575787233 * class190.anInt2156;
					if (i_24_ == 0)
						return;
					if (2 == i_24_) {
						class494.aClass690_5531.method8083((byte) 9);
						return;
					}
				}
			} else {
				Class669 class669 = ((Class669) Class2.aClass5_Sub12_24.method63(i, -1230798118));
				Class669 class669_25_ = ((Class669) Class2.aClass5_Sub12_24.method63(i_23_, 1784853388));
				if (class669.anInt8519 * 916695593 != -1 && 916695593 * class669_25_.anInt8519 != -1) {
					Class190 class190 = ((Class190) Class379.aClass5_Sub4_3966
							.method63(((class669.anInt8519) * 916695593), -1936813961));
					Class190 class190_26_ = ((Class190) Class379.aClass5_Sub4_3966
							.method63(((class669_25_.anInt8519) * 916695593), -1279475324));
					if (class190.anInt2150 * -449880687 < -449880687 * class190_26_.anInt2150)
						return;
				}
			}
		}
		int i_27_ = 0;
		if (i != -1 && !(((Class669) Class2.aClass5_Sub12_24.method63(i, -733547282)).aBool8504))
			i_27_ = 2;
		if (i != -1 && bool)
			i_27_ = 1;
		class494.anInt5529 = i * 567730405;
		class494.anInt5532 = -598369669 * i_20_;
		class494.anInt5530 = -830042509 * (i_18_ >> 16);
		class494.anInt5528 = i_19_ * -2068722977;
		class494.aClass690_5531.method8120(
				(-1 != i ? (((Class669) Class2.aClass5_Sub12_24.method63(i, 37405147)).anInt8519) * 916695593 : -1),
				i_18_ & 0xffff, i_27_, false, -543570352);
	}

	public final void method10668(byte i) {
		quenedStepCount = 0;
		anInt11818 = 0;
	}

	public final void method10669(int i, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_) {
		Class556 class556 = (Class556) Class533.aClass5_Sub9_7133.method63(i, 1338434640);
		Class511_Sub3 class511_sub3 = null;
		Class511_Sub3 class511_sub3_34_ = null;
		int i_35_ = 1954759459 * class556.anInt7465;
		int i_36_ = 0;
		for (Class511_Sub3 class511_sub3_37_ = (Class511_Sub3) aClass695_11779
				.method8177(-2141806741); null != class511_sub3_37_; class511_sub3_37_ = (Class511_Sub3) aClass695_11779
						.method8184(349229441)) {
			i_36_++;
			if (class556 == class511_sub3_37_.aClass556_10265) {
				class511_sub3_37_.method9286(i_30_ + i_28_, i_31_, i_32_, i_29_, -1843955510);
				return;
			}
			if (class511_sub3_37_.aClass556_10265.anInt7455 * -44067923 <= -44067923 * class556.anInt7455)
				class511_sub3 = class511_sub3_37_;
			if (class511_sub3_37_.aClass556_10265.anInt7465 * 1954759459 > i_35_) {
				class511_sub3_34_ = class511_sub3_37_;
				i_35_ = class511_sub3_37_.aClass556_10265.anInt7465 * 1954759459;
			}
		}
		if (class511_sub3_34_ != null || i_36_ < 1318673387 * Class184.aClass622_2103.anInt8077) {
			Class511_Sub3 class511_sub3_38_ = new Class511_Sub3(class556);
			if (null == class511_sub3)
				aClass695_11779.method8176(class511_sub3_38_, -350109812);
			else
				Class663.method7888(class511_sub3_38_, class511_sub3, -1436762871);
			class511_sub3_38_.method9286(i_28_ + i_30_, i_31_, i_32_, i_29_, -1843955510);
			if (i_36_ >= 1318673387 * Class184.aClass622_2103.anInt8077)
				class511_sub3_34_.method6259(1653069783);
		}
	}

	public final void method10670(int i, int i_39_) {
		Class556 class556 = (Class556) Class533.aClass5_Sub9_7133.method63(i, -239544253);
		for (Class511_Sub3 class511_sub3 = (Class511_Sub3) aClass695_11779
				.method8177(-1650823938); null != class511_sub3; class511_sub3 = (Class511_Sub3) aClass695_11779
						.method8184(-1560656100)) {
			if (class556 == class511_sub3.aClass556_10265) {
				class511_sub3.method6259(1375646815);
				break;
			}
		}
	}

	@Override
	public int method9785(int i) {
		RenderType renderType = getRender(1634414112);
		int i_40_;
		if (-1 != renderType.anInt7692 * 1608744153)
			i_40_ = renderType.anInt7692 * 1608744153;
		else if (-32768 == -1657077047 * this.anInt11762)
			i_40_ = 200;
		else
			i_40_ = -(-1657077047 * this.anInt11762);
		Class437 class437 = method7693();
		int i_41_ = (int) class437.aClass422_4868.aFloat4780 >> 9;
		int i_42_ = (int) class437.aClass422_4868.aFloat4777 >> 9;
		if (aClass538_10676 != null && i_41_ >= 1 && i_42_ >= 1
				&& i_41_ <= client.gameScene.method6029((short) 9544) - 1
				&& i_42_ <= client.gameScene.method5967(1835886217) - 1) {
			Class546 class546 = (aClass538_10676.aClass546ArrayArrayArray7160[aByte10675][i_41_][i_42_]);
			if (class546 != null && null != class546.aClass645_Sub1_Sub4_7397)
				return i_40_ + class546.aClass645_Sub1_Sub4_7397.aShort11726;
		}
		return i_40_;
	}

	public int method10671(byte i) {
		return this.anInt11759 * -1284605729;
	}

	@Override
	public void method10656(int i) {
		int i_43_ = ((this.anInt11759 * -1284605729 - 1 << 8) + 240);
		Class422 class422 = method7693().aClass422_4868;
		aShort11747 = (short) ((int) class422.aFloat4780 - i_43_ >> 9);
		aShort11745 = (short) ((int) class422.aFloat4777 - i_43_ >> 9);
		aShort11743 = (short) (i_43_ + (int) class422.aFloat4780 >> 9);
		aShort11746 = (short) (i_43_ + (int) class422.aFloat4777 >> 9);
	}

	void method10672(Class157 class157, int i) {
		int i_44_ = aClass37_11777.anInt336 * -247599997;
		int i_45_ = aClass37_11811.anInt336 * -247599997;
		if (0 != i_44_ || i_45_ != 0) {
			int i_46_ = class157.method2018() / 2;
			class157.method1880(0, -i_46_, 0);
			class157.method1879(i_44_ & 0x3fff);
			class157.method1934(i_45_ & 0x3fff);
			class157.method1880(0, i_46_, 0);
		}
	}

	void method10673(Class173 class173, RenderType renderType, int i, int i_47_, int i_48_, int i_49_, byte i_50_) {
		for (int i_51_ = 0; i_51_ < aClass494Array11785.length; i_51_++) {
			byte i_52_ = 0;
			if (0 == i_51_)
				i_52_ = (byte) 2;
			else if (i_51_ == 1)
				i_52_ = (byte) 5;
			else if (i_51_ == 2)
				i_52_ = (byte) 1;
			else if (3 == i_51_)
				i_52_ = (byte) 7;
			else if (4 == i_51_)
				i_52_ = (byte) 8;
			Class494 class494 = aClass494Array11785[i_51_];
			if (-1 != class494.anInt5529 * -1010180883 && !class494.aClass690_5531.method8075((byte) 90)) {
				Class669 class669 = ((Class669) Class2.aClass5_Sub12_24.method63((class494.anInt5529 * -1010180883),
						-1050716891));
				int i_53_ = i;
				if (898920735 * class494.anInt5528 != 0)
					i_53_ |= 0x5;
				if (-988559685 * class494.anInt5530 != 0)
					i_53_ |= 0x2;
				if (class494.anInt5532 * 1024210099 >= 0)
					i_53_ |= 0x7;
				if (class494.anInt5532 * 1024210099 >= 0 && null != renderType.anIntArrayArray7678
						&& null != (renderType.anIntArrayArray7678[class494.anInt5532 * 1024210099])) {
					Class157 class157 = (aClass157Array11810[1 + i_51_] = class669.method7927(class173, i_53_,
							class494.aClass690_5531, i_52_, (byte) -32));
					if (null != class157) {
						int i_54_ = 0;
						int i_55_ = 0;
						int i_56_ = 0;
						if (renderType.anIntArrayArray7678 != null
								&& null != (renderType.anIntArrayArray7678[class494.anInt5532 * 1024210099])) {
							i_54_ += (renderType.anIntArrayArray7678[class494.anInt5532 * 1024210099][0]);
							i_55_ += (renderType.anIntArrayArray7678[1024210099 * class494.anInt5532][1]);
							i_56_ += (renderType.anIntArrayArray7678[1024210099 * class494.anInt5532][2]);
						}
						if (renderType.anIntArrayArray7675 != null
								&& (renderType.anIntArrayArray7675[class494.anInt5532 * 1024210099]) != null) {
							i_54_ += (renderType.anIntArrayArray7675[1024210099 * class494.anInt5532][0]);
							i_55_ += (renderType.anIntArrayArray7675[1024210099 * class494.anInt5532][1]);
							i_56_ += (renderType.anIntArrayArray7675[1024210099 * class494.anInt5532][2]);
						}
						if (i_56_ != 0 || 0 != i_54_) {
							int i_57_ = i_49_;
							if (anIntArray11805 != null && -1 != (anIntArray11805[class494.anInt5532 * 1024210099]))
								i_57_ = (anIntArray11805[1024210099 * class494.anInt5532]);
							int i_58_ = ((-1551304704 * class494.anInt5528 + i_57_ - i_49_) & 0x3fff);
							if (i_58_ != 0)
								class157.method1878(i_58_);
							int i_59_ = Class417.anIntArray4766[i_58_];
							int i_60_ = Class417.anIntArray4767[i_58_];
							int i_61_ = i_60_ * i_54_ + i_56_ * i_59_ >> 14;
							i_56_ = i_60_ * i_56_ - i_59_ * i_54_ >> 14;
							i_54_ = i_61_;
						}
						class157.method1880(i_54_, i_55_, i_56_);
						if (class494.anInt5530 * -988559685 != 0)
							class157.method1880(0, -(class494.anInt5530 * -988559685) << 2, 0);
						class157.aBool1737 = false;
					}
				} else {
					Class157 class157 = (aClass157Array11810[1 + i_51_] = (class669.method7932(class173, i_53_,
							class494.anInt5528 * -1551304704, (33753641 * this.anInt11768),
							(this.anInt11769 * 517373133), (this.anInt11770 * 970473743), class494.aClass690_5531,
							i_52_, (byte) -1)));
					if (null != class157) {
						if (-988559685 * class494.anInt5530 != 0)
							class157.method1880(0, -(-988559685 * class494.anInt5530) << 2, 0);
						class157.aBool1737 = false;
					}
				}
			} else
				aClass157Array11810[1 + i_51_] = null;
		}
	}

	public abstract int method10674();

	public RenderType getRender(int i) {
		int i_62_ = method10676((byte) 1);
		if (-1 == i_62_)
			return Class5_Sub14.aClass582_10841;
		return ((RenderType) Class147.aClass5_Sub14_1673.method63(i_62_, -994832581));
	}

	abstract int method10676(byte i);

	public void method10677(int i) {
		if (null != this.aClass492_11823 && (this.aClass492_11823.aString5518) != null) {
			this.aClass492_11823.anInt5520 -= 1885358971;
			if (0 == -662971469 * (this.aClass492_11823).anInt5520)
				this.aClass492_11823.aString5518 = null;
		}
	}

	public void setSize(int i, int i_63_) {
		this.anInt11759 = i * 1520648991;
	}

	public abstract boolean method10679(int i);

	public abstract Class492 method10680(int i);

	void method10681() {
		if (this.aClass612_11800 != null)
			this.aClass612_11800.method7304();
	}

	public abstract boolean method10682();

	public final void method10683(int i, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_, short i_69_) {
		boolean bool = true;
		boolean bool_70_ = true;
		for (int i_71_ = 0; i_71_ < Class184.aClass622_2103.anInt8071 * -55491509; i_71_++) {
			if (anIntArray11776[i_71_] > i_67_)
				bool = false;
			else
				bool_70_ = false;
		}
		int i_72_ = -1;
		int i_73_ = -1;
		int i_74_ = 0;
		if (i >= 0) {
			Class575 class575 = ((Class575) Class581.aClass5_Sub19_7649.method63(i, -1119394748));
			i_73_ = -603706155 * class575.anInt7589;
			i_74_ = -601153071 * class575.anInt7580;
		}
		if (bool_70_) {
			if (i_73_ == -1)
				return;
			i_72_ = 0;
			int i_75_ = 0;
			if (i_73_ == 0)
				i_75_ = anIntArray11776[0];
			else if (1 == i_73_)
				i_75_ = anIntArray11775[0];
			for (int i_76_ = 1; i_76_ < -55491509 * Class184.aClass622_2103.anInt8071; i_76_++) {
				if (0 == i_73_) {
					if (anIntArray11776[i_76_] < i_75_) {
						i_72_ = i_76_;
						i_75_ = anIntArray11776[i_76_];
					}
				} else if (1 == i_73_ && anIntArray11775[i_76_] < i_75_) {
					i_72_ = i_76_;
					i_75_ = anIntArray11775[i_76_];
				}
			}
			if (i_73_ == 1 && i_75_ >= i_64_)
				return;
		} else {
			if (bool)
				this.aByte11773 = (byte) 0;
			for (int i_77_ = 0; i_77_ < Class184.aClass622_2103.anInt8071 * -55491509; i_77_++) {
				int i_78_ = this.aByte11773;
				this.aByte11773 = (byte) ((1 + this.aByte11773) % (Class184.aClass622_2103.anInt8071 * -55491509));
				if (anIntArray11776[i_78_] <= i_67_) {
					i_72_ = i_78_;
					break;
				}
			}
		}
		if (i_72_ >= 0) {
			anIntArray11807[i_72_] = i;
			anIntArray11775[i_72_] = i_64_;
			anIntArray11784[i_72_] = i_65_;
			anIntArray11778[i_72_] = i_66_;
			anIntArray11776[i_72_] = i_74_ + i_67_ + i_68_;
		}
	}

	public void method10684(int i, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_,
			int i_86_) {
		if (method10716(2005109880))
			client.method10192((this.aClass226_11824), this.aClass226_11824.method3175(-775264329), -1, i, i_79_, i_80_,
					i_81_, i_82_, i_83_, i_84_, i_85_);
	}

	public abstract int method10685();

	public void method10686(int i, int i_87_, boolean bool, byte i_88_) {
		if (method10716(-1732102167))
			Class302.method4033((this.aClass226_11824.aClass229Array2336), -1, i, i_87_, bool, 781065270);
	}

	public abstract int method10687(int i);

	public Class578 method10688(byte i) {
		Class422 class422 = method7693().aClass422_4868;
		Class578 class578 = client.gameScene.method5966(1273279609);
		int i_89_ = (((int) class422.aFloat4780 >> 9) + 961465569 * class578.anInt7607);
		int i_90_ = (((int) class422.aFloat4777 >> 9) + class578.anInt7608 * -173815201);
		return new Class578(aByte10675, i_89_, i_90_);
	}

	void method10689() {
		if (this.aClass612_11800 != null)
			this.aClass612_11800.method7304();
	}

	@Override
	public void finalize() {
		if (this.aClass612_11800 != null)
			this.aClass612_11800.method7304();
	}

	void method10690() {
		if (this.aClass612_11800 != null)
			this.aClass612_11800.method7304();
	}

	public void method10691(int i, byte i_91_) {
		RenderType renderType = getRender(738990223);
		if (0 != -983682109 * renderType.anInt7683 || 0 != -1980826395 * anInt11760) {
			aClass37_11809.method796(-1351409293);
			int i_92_ = i - aClass37_11809.anInt336 * -247599997 & 0x3fff;
			if (i_92_ > 8192)
				anInt11808 = (-247599997 * aClass37_11809.anInt336 - (16384 - i_92_)) * 1317103411;
			else
				anInt11808 = ((i_92_ + -247599997 * aClass37_11809.anInt336) * 1317103411);
		}
	}

	public final void method10692() {
		quenedStepCount = 0;
		anInt11818 = 0;
	}

	void method10693() {
		if (this.aClass612_11800 != null)
			this.aClass612_11800.method7304();
	}

	public abstract boolean method10694();

	public void method10695() {
		if (null != this.aClass492_11823 && (this.aClass492_11823.aString5518) != null) {
			this.aClass492_11823.anInt5520 -= 1885358971;
			if (0 == -662971469 * (this.aClass492_11823).anInt5520)
				this.aClass492_11823.aString5518 = null;
		}
	}

	public void method10655() {
		int i = ((this.anInt11759 * -1284605729 - 1 << 8) + 240);
		Class422 class422 = method7693().aClass422_4868;
		aShort11747 = (short) ((int) class422.aFloat4780 - i >> 9);
		aShort11745 = (short) ((int) class422.aFloat4777 - i >> 9);
		aShort11743 = (short) (i + (int) class422.aFloat4780 >> 9);
		aShort11746 = (short) (i + (int) class422.aFloat4777 >> 9);
	}

	public final void method10696() {
		quenedStepCount = 0;
		anInt11818 = 0;
	}

	public final void method10697(int i) {
		Class556 class556 = (Class556) Class533.aClass5_Sub9_7133.method63(i, -173932502);
		for (Class511_Sub3 class511_sub3 = (Class511_Sub3) aClass695_11779
				.method8177(-1501928378); null != class511_sub3; class511_sub3 = (Class511_Sub3) aClass695_11779
						.method8184(-275509915)) {
			if (class556 == class511_sub3.aClass556_10265) {
				class511_sub3.method6259(1546888142);
				break;
			}
		}
	}

	void method10698(int i, int i_95_, int i_96_, int i_97_, int i_98_, byte i_99_) {
		Class422 class422 = method7693().aClass422_4868;
		int i_100_ = aShort11743 + aShort11747 >> 1;
		int i_101_ = aShort11746 + aShort11745 >> 1;
		int i_102_ = Class417.anIntArray4766[i];
		int i_103_ = Class417.anIntArray4767[i];
		int i_104_ = -i_95_ / 2;
		int i_105_ = -i_96_ / 2;
		int i_106_ = i_105_ * i_102_ + i_104_ * i_103_ >> 14;
		int i_107_ = i_105_ * i_103_ - i_104_ * i_102_ >> 14;
		int i_108_ = Class463.method5602((int) class422.aFloat4780 + i_106_, i_107_ + (int) class422.aFloat4777, i_100_,
				i_101_, aByte10675, -1986312303);
		int i_109_ = i_95_ / 2;
		int i_110_ = -i_96_ / 2;
		int i_111_ = i_103_ * i_109_ + i_110_ * i_102_ >> 14;
		int i_112_ = i_103_ * i_110_ - i_109_ * i_102_ >> 14;
		int i_113_ = Class463.method5602((int) class422.aFloat4780 + i_111_, i_112_ + (int) class422.aFloat4777, i_100_,
				i_101_, aByte10675, -751240516);
		int i_114_ = -i_95_ / 2;
		int i_115_ = i_96_ / 2;
		int i_116_ = i_102_ * i_115_ + i_103_ * i_114_ >> 14;
		int i_117_ = i_103_ * i_115_ - i_114_ * i_102_ >> 14;
		int i_118_ = Class463.method5602((int) class422.aFloat4780 + i_116_, i_117_ + (int) class422.aFloat4777, i_100_,
				i_101_, aByte10675, -2027178638);
		int i_119_ = i_95_ / 2;
		int i_120_ = i_96_ / 2;
		int i_121_ = i_119_ * i_103_ + i_102_ * i_120_ >> 14;
		int i_122_ = i_103_ * i_120_ - i_102_ * i_119_ >> 14;
		int i_123_ = Class463.method5602(i_121_ + (int) class422.aFloat4780, i_122_ + (int) class422.aFloat4777, i_100_,
				i_101_, aByte10675, -675994264);
		int i_124_ = i_108_ < i_113_ ? i_108_ : i_113_;
		int i_125_ = i_118_ < i_123_ ? i_118_ : i_123_;
		int i_126_ = i_113_ < i_123_ ? i_113_ : i_123_;
		int i_127_ = i_108_ < i_118_ ? i_108_ : i_118_;
		this.anInt11768 = ((int) (Math.atan2(i_124_ - i_125_, i_96_) * 2607.5945876176133) & 0x3fff) * 788017689;
		this.anInt11769 = ((int) (Math.atan2(i_127_ - i_126_, i_95_) * 2607.5945876176133) & 0x3fff) * -233975803;
		if (33753641 * this.anInt11768 != 0 && i_97_ != 0) {
			int i_128_ = 16384 - i_97_;
			if (this.anInt11768 * 33753641 > 8192) {
				if (33753641 * this.anInt11768 < i_128_)
					this.anInt11768 = 788017689 * i_128_;
			} else if (33753641 * this.anInt11768 > i_97_)
				this.anInt11768 = 788017689 * i_97_;
		}
		if (0 != this.anInt11769 * 517373133 && 0 != i_98_) {
			int i_129_ = 16384 - i_98_;
			if (this.anInt11769 * 517373133 > 8192) {
				if (this.anInt11769 * 517373133 < i_129_)
					this.anInt11769 = i_129_ * -233975803;
			} else if (this.anInt11769 * 517373133 > i_98_)
				this.anInt11769 = i_98_ * -233975803;
		}
		this.anInt11770 = -1134916113 * (i_108_ + i_123_);
		if (i_118_ + i_113_ < this.anInt11770 * 970473743)
			this.anInt11770 = (i_118_ + i_113_) * -1134916113;
		this.anInt11770 = ((this.anInt11770 * 970473743 >> 1) - (int) class422.aFloat4776) * -1134916113;
	}

	public void method10699(String string, int i, int i_130_, int i_131_, byte i_132_) {
		if (this.aClass492_11823 == null)
			this.aClass492_11823 = new Class492();
		this.aClass492_11823.aString5518 = string;
		this.aClass492_11823.anInt5517 = 712279273 * i;
		this.aClass492_11823.anInt5516 = 1211056565 * i_130_;
		this.aClass492_11823.anInt5520 = (this.aClass492_11823.anInt5519 = i_131_ * 459111513) * 611908595;
	}

	boolean method10700(int i, int i_133_) {
		if (i == 1222516689 * this.anInt11825)
			return true;
		this.aClass226_11824 = Class289.method3873(i, null, null, true, -256868992);
		if (null == this.aClass226_11824)
			return false;
		this.anInt11825 = 1526241585 * i;
		Class502.method6113((this.aClass226_11824.aClass229Array2336), 52609830);
		return true;
	}

	public void method10701(int i, int i_134_, int i_135_, int i_136_, int i_137_, int i_138_, int i_139_,
			byte i_140_) {
		if (!method10716(665022413)) {
			if (i != -1)
				client.aBoolArray10855[i] = true;
			else {
				for (int i_141_ = 0; i_141_ < 102; i_141_++)
					client.aBoolArray10855[i_141_] = true;
			}
		} else
			Class564.method6829(this.aClass226_11824.method3175(-1559312978), -1, i_134_, i_135_, i_136_, i_137_,
					i_138_, i_139_, i, false, 59074721);
	}

	public final void method10702() {
		quenedStepCount = 0;
		anInt11818 = 0;
	}

	Entity(Class538 class538, int i, Class95_Sub1 class95_sub1) {
		super(class538, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
		this.anInt11759 = 1520648991;
		this.anInt11761 = -81887232;
		this.anInt11762 = -1539080192;
		aBool11763 = true;
		anInt11817 = 0;
		anInt11786 = 709294901;
		anInt11767 = 0;
		this.anInt11771 = 0;
		this.aByte11773 = (byte) 0;
		anIntArray11807 = new int[Class184.aClass622_2103.anInt8071 * -55491509];
		anIntArray11775 = new int[-55491509 * Class184.aClass622_2103.anInt8071];
		anIntArray11776 = new int[Class184.aClass622_2103.anInt8071 * -55491509];
		anIntArray11784 = new int[-55491509 * Class184.aClass622_2103.anInt8071];
		anIntArray11778 = new int[-55491509 * Class184.aClass622_2103.anInt8071];
		aClass695_11779 = new Class695();
		anInt11780 = -1577001447;
		anIntArray11819 = null;
		aClass690_Sub3_11803 = new Class690_Sub3(this, false);
		aClass690_11774 = new Class690_Sub1(this, false);
		anInt11756 = -661225281;
		anInt11796 = -1584973623;
		aByte11788 = (byte) 0;
		this.anInt11801 = -1603426539;
		this.anInt11782 = 0;
		anInt11758 = 0;
		anInt11806 = 0;
		anInt11760 = -1570706176;
		aClass37_11809 = new Class37();
		aClass37_11777 = new Class37();
		aClass37_11811 = new Class37();
		quenedStepCount = 0;
		anInt11816 = 0;
		anInt11818 = 0;
		anInt11802 = 0;
		this.aBool11820 = false;
		this.aBool11821 = false;
		this.anInt11825 = -1526241585;
		this.anInt11826 = 612561449;
		anInterface17_11827 = new Class530(this);
		sceneXQueue = new int[i];
		sceneYQueue = new int[i];
		moveTypeQueue = new byte[i];
		aClass157Array11810 = new Class157[6];
		aClass494Array11785 = new Class494[5];
		for (int i_142_ = 0; i_142_ < 5; i_142_++)
			aClass494Array11785[i_142_] = new Class494(this);
		aClass690_Sub1_Sub1Array11804 = (new Class690_Sub1_Sub1[Class162.equipDefaults.disabledSlots.length]);
		anInterface2_11798 = new Class15(class95_sub1);
	}

	public abstract int method10703(int i);

	public int method10704() {
		RenderType renderType = getRender(-2126029907);
		int i = -247599997 * aClass37_11809.anInt336;
		boolean bool;
		if (renderType.anInt7683 * -983682109 != 0)
			bool = aClass37_11809.method794(-49484805 * anInt11808, renderType.anInt7683 * -983682109,
					renderType.anInt7661 * -382861695, 1944624028);
		else
			bool = aClass37_11809.method794(-49484805 * anInt11808, -1980826395 * anInt11760, anInt11760 * -1980826395,
					1764513013);
		int i_143_ = aClass37_11809.anInt336 * -247599997 - i;
		if (0 != i_143_)
			anInt11806 += -577405917;
		else {
			anInt11806 = 0;
			aClass37_11809.method798(anInt11808 * -49484805, (byte) -117);
		}
		if (bool) {
			if (0 != renderType.anInt7685 * 353249559) {
				if (i_143_ > 0)
					aClass37_11777.method794(1397434877 * renderType.anInt7687, renderType.anInt7685 * 353249559,
							765049111 * renderType.anInt7686, 842368263);
				else
					aClass37_11777.method794(-(renderType.anInt7687 * 1397434877), renderType.anInt7685 * 353249559,
							renderType.anInt7686 * 765049111, 231564067);
			}
			if (0 != 2076061219 * renderType.anInt7688)
				aClass37_11811.method794(renderType.anInt7690 * -435059881, renderType.anInt7688 * 2076061219,
						renderType.anInt7689 * 570976461, 1545672538);
		} else {
			if (renderType.anInt7685 * 353249559 != 0)
				aClass37_11777.method794(0, renderType.anInt7685 * 353249559, renderType.anInt7686 * 765049111, 935778170);
			else
				aClass37_11777.method798(0, (byte) -34);
			if (0 != 2076061219 * renderType.anInt7688)
				aClass37_11811.method794(0, renderType.anInt7688 * 2076061219, 570976461 * renderType.anInt7689,
						1625213477);
			else
				aClass37_11811.method798(0, (byte) -54);
		}
		return i_143_;
	}

	public void method10705(int i) {
		this.anInt11759 = i * 1520648991;
	}

	public int method10706() {
		return this.anInt11759 * -1284605729;
	}

	public int method10707() {
		return this.anInt11759 * -1284605729;
	}

	public void method10708(int i) {
		this.anInt11759 = i * 1520648991;
	}

	public int method10709() {
		return this.anInt11759 * -1284605729;
	}

	void method10710(int i, int i_144_, int i_145_, int i_146_, int i_147_) {
		Class422 class422 = method7693().aClass422_4868;
		int i_148_ = aShort11743 + aShort11747 >> 1;
		int i_149_ = aShort11746 + aShort11745 >> 1;
		int i_150_ = Class417.anIntArray4766[i];
		int i_151_ = Class417.anIntArray4767[i];
		int i_152_ = -i_144_ / 2;
		int i_153_ = -i_145_ / 2;
		int i_154_ = i_153_ * i_150_ + i_152_ * i_151_ >> 14;
		int i_155_ = i_153_ * i_151_ - i_152_ * i_150_ >> 14;
		int i_156_ = Class463.method5602((int) class422.aFloat4780 + i_154_, i_155_ + (int) class422.aFloat4777, i_148_,
				i_149_, aByte10675, -2017361644);
		int i_157_ = i_144_ / 2;
		int i_158_ = -i_145_ / 2;
		int i_159_ = i_151_ * i_157_ + i_158_ * i_150_ >> 14;
		int i_160_ = i_151_ * i_158_ - i_157_ * i_150_ >> 14;
		int i_161_ = Class463.method5602((int) class422.aFloat4780 + i_159_, i_160_ + (int) class422.aFloat4777, i_148_,
				i_149_, aByte10675, -1902114553);
		int i_162_ = -i_144_ / 2;
		int i_163_ = i_145_ / 2;
		int i_164_ = i_150_ * i_163_ + i_151_ * i_162_ >> 14;
		int i_165_ = i_151_ * i_163_ - i_162_ * i_150_ >> 14;
		int i_166_ = Class463.method5602((int) class422.aFloat4780 + i_164_, i_165_ + (int) class422.aFloat4777, i_148_,
				i_149_, aByte10675, -1353813811);
		int i_167_ = i_144_ / 2;
		int i_168_ = i_145_ / 2;
		int i_169_ = i_167_ * i_151_ + i_150_ * i_168_ >> 14;
		int i_170_ = i_151_ * i_168_ - i_150_ * i_167_ >> 14;
		int i_171_ = Class463.method5602(i_169_ + (int) class422.aFloat4780, i_170_ + (int) class422.aFloat4777, i_148_,
				i_149_, aByte10675, -791130061);
		int i_172_ = i_156_ < i_161_ ? i_156_ : i_161_;
		int i_173_ = i_166_ < i_171_ ? i_166_ : i_171_;
		int i_174_ = i_161_ < i_171_ ? i_161_ : i_171_;
		int i_175_ = i_156_ < i_166_ ? i_156_ : i_166_;
		this.anInt11768 = ((int) (Math.atan2(i_172_ - i_173_, i_145_) * 2607.5945876176133) & 0x3fff) * 788017689;
		this.anInt11769 = ((int) (Math.atan2(i_175_ - i_174_, i_144_) * 2607.5945876176133) & 0x3fff) * -233975803;
		if (33753641 * this.anInt11768 != 0 && i_146_ != 0) {
			int i_176_ = 16384 - i_146_;
			if (this.anInt11768 * 33753641 > 8192) {
				if (33753641 * this.anInt11768 < i_176_)
					this.anInt11768 = 788017689 * i_176_;
			} else if (33753641 * this.anInt11768 > i_146_)
				this.anInt11768 = 788017689 * i_146_;
		}
		if (0 != this.anInt11769 * 517373133 && 0 != i_147_) {
			int i_177_ = 16384 - i_147_;
			if (this.anInt11769 * 517373133 > 8192) {
				if (this.anInt11769 * 517373133 < i_177_)
					this.anInt11769 = i_177_ * -233975803;
			} else if (this.anInt11769 * 517373133 > i_147_)
				this.anInt11769 = i_147_ * -233975803;
		}
		this.anInt11770 = -1134916113 * (i_156_ + i_171_);
		if (i_166_ + i_161_ < this.anInt11770 * 970473743)
			this.anInt11770 = (i_166_ + i_161_) * -1134916113;
		this.anInt11770 = ((this.anInt11770 * 970473743 >> 1) - (int) class422.aFloat4776) * -1134916113;
	}

	public int method10715() {
		return this.anInt11759 * -1284605729;
	}

	boolean method10716(int i) {
		if (-1 == 1823290855 * this.anInt11826)
			return false;
		return method10700((this.anInt11826 * 1823290855), -1238705677);
	}

	public void method10717() {
		if (null != this.aClass492_11823 && (this.aClass492_11823.aString5518) != null) {
			this.aClass492_11823.anInt5520 -= 1885358971;
			if (0 == -662971469 * (this.aClass492_11823).anInt5520)
				this.aClass492_11823.aString5518 = null;
		}
	}

	public Class528_Sub19 method10718(int i) {
		Class422 class422 = method7693().aClass422_4868;
		Class578 class578 = client.gameScene.method5966(1273279609);
		int i_178_ = class578.anInt7607 * -1650867712 + (int) class422.aFloat4780;
		int i_179_ = (int) class422.aFloat4776;
		int i_180_ = (int) class422.aFloat4777 + 1200930304 * class578.anInt7608;
		return new Class528_Sub19(aByte10675, i_178_, i_179_, i_180_);
	}

	public abstract Class492 method10719();

	public abstract Class492 method10720();

	public abstract Class492 method10721();

	boolean method10722() {
		if (-1 == 1823290855 * this.anInt11826)
			return false;
		return method10700((this.anInt11826 * 1823290855), -504613125);
	}

	boolean method10723() {
		if (-1 == 1823290855 * this.anInt11826)
			return false;
		return method10700((this.anInt11826 * 1823290855), 1604463815);
	}

	boolean method10724() {
		if (-1 == 1823290855 * this.anInt11826)
			return false;
		return method10700((this.anInt11826 * 1823290855), 1789221588);
	}

	void method10725(Class173 class173, Class157[] class157s, Class433 class433, boolean bool, int i) {
		if (!bool) {
			int i_181_ = 0;
			int i_182_ = 0;
			int i_183_ = 0;
			int i_184_ = 0;
			int i_185_ = -1;
			int i_186_ = -1;
			Class170[][] class170s = new Class170[class157s.length][];
			Class144[][] class144s = new Class144[class157s.length][];
			for (int i_187_ = 0; i_187_ < class157s.length; i_187_++) {
				if (class157s[i_187_] != null) {
					class157s[i_187_].method1921(class433);
					class170s[i_187_] = class157s[i_187_].method1922();
					class144s[i_187_] = class157s[i_187_].method1923();
					if (class170s[i_187_] != null) {
						i_185_ = i_187_;
						i_182_++;
						i_181_ += class170s[i_187_].length;
					}
					if (null != class144s[i_187_]) {
						i_186_ = i_187_;
						i_184_++;
						i_183_ += class144s[i_187_].length;
					}
				}
			}
			if ((null == this.aClass612_11800 || this.aClass612_11800.aBool7979) && (i_182_ > 0 || i_184_ > 0))
				this.aClass612_11800 = Class612.method7315(client.anInt11127, true);
			if (null != this.aClass612_11800) {
				Object object = null;
				Class170[] class170s_188_;
				if (i_182_ == 1)
					class170s_188_ = class170s[i_185_];
				else {
					class170s_188_ = new Class170[i_181_];
					int i_189_ = 0;
					for (int i_190_ = 0; i_190_ < class157s.length; i_190_++) {
						if (class170s[i_190_] != null) {
							System.arraycopy(class170s[i_190_], 0, class170s_188_, i_189_, class170s[i_190_].length);
							i_189_ += class170s[i_190_].length;
						}
					}
				}
				Object object_191_ = null;
				Class144[] class144s_192_;
				if (1 == i_184_)
					class144s_192_ = class144s[i_186_];
				else {
					class144s_192_ = new Class144[i_183_];
					int i_193_ = 0;
					for (int i_194_ = 0; i_194_ < class157s.length; i_194_++) {
						if (null != class144s[i_194_]) {
							System.arraycopy(class144s[i_194_], 0, class144s_192_, i_193_, class144s[i_194_].length);
							i_193_ += class144s[i_194_].length;
						}
					}
				}
				this.aClass612_11800.method7306(class173, client.anInt11127, class170s_188_, class144s_192_, false);
				this.aBool11820 = true;
			}
		} else if (null != this.aClass612_11800)
			this.aClass612_11800.method7305(client.anInt11127);
		if (null != this.aClass612_11800)
			this.aClass612_11800.method7303(aByte10675, aShort11747, aShort11743, aShort11745, aShort11746);
	}

	public abstract int method10726();

	public abstract int method10727();

	@Override
	public void method10658() {
		int i = ((this.anInt11759 * -1284605729 - 1 << 8) + 240);
		Class422 class422 = method7693().aClass422_4868;
		aShort11747 = (short) ((int) class422.aFloat4780 - i >> 9);
		aShort11745 = (short) ((int) class422.aFloat4777 - i >> 9);
		aShort11743 = (short) (i + (int) class422.aFloat4780 >> 9);
		aShort11746 = (short) (i + (int) class422.aFloat4777 >> 9);
	}

	@Override
	boolean method9775(short i) {
		return this.aBool11821;
	}

	@Override
	public void method10657() {
		int i = ((this.anInt11759 * -1284605729 - 1 << 8) + 240);
		Class422 class422 = method7693().aClass422_4868;
		aShort11747 = (short) ((int) class422.aFloat4780 - i >> 9);
		aShort11745 = (short) ((int) class422.aFloat4777 - i >> 9);
		aShort11743 = (short) (i + (int) class422.aFloat4780 >> 9);
		aShort11746 = (short) (i + (int) class422.aFloat4777 >> 9);
	}

	static final void method10728(Class229 class229, Class226 class226, Class648 class648, byte i) {
		class229.anInt2418 = -802104110;
		class229.aClass287_2479 = null;
		class229.anInt2419 = ((class648.anIntArray8394[(class648.anInt8395 -= 1239022665) * 717927929]) * -1761002431);
		if (-1 == class229.anInt2377 * 1835803215 && !class226.aBool2335)
			Class26_Sub1.method9542(306930455 * class229.anInt2376, (short) 13101);
	}

	static final void method10729(Class648 class648, int i) {
		class648.anIntArray8394[(class648.anInt8395 += 1239022665) * 717927929 - 1] = (class648.aClass528_Sub36_8416
				.method9519((String) (class648.anObjectArray8396[((class648.anInt8410 -= 1600226731) * -520794877)]),
						(byte) -111));
	}
}
