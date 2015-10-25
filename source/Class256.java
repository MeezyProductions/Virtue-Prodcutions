/* Class256 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class256 implements Definition {
	int[] anIntArray2806;
	public String aString2807;
	int[] anIntArray2808;
	int[][] anIntArrayArray2809;
	Interface12 anInterface12_2810;
	public int anInt2811 = 0;
	public int anInt2812 = 0;
	public boolean aBool2813 = false;
	public int anInt2814;
	int[] anIntArray2815;
	public int[] anIntArray2816;
	public int[][] anIntArrayArray2817;
	public int anInt2818;
	public int[] anIntArray2819;
	int[][] anIntArrayArray2820;
	public String aString2821;
	public String[] aStringArray2822;
	public int[] anIntArray2823;
	int[] anIntArray2824;
	int[] anIntArray2825;
	public String[] aStringArray2826;
	Class692 aClass692_2827;
	public int anInt2828 = 1190963825;

	@Override
	public void method58(ByteBuffer class528_sub42, byte i) {
		for (;;) {
			int i_0_ = class528_sub42.readUnsignedByte((byte) 32);
			if (0 == i_0_)
				break;
			method3463(class528_sub42, i_0_, -1032061652);
		}
	}

	public int method3454(int i, int i_1_, short i_2_) {
		if (this.aClass692_2827 == null)
			return i_1_;
		Class528_Sub17 class528_sub17 = ((Class528_Sub17) this.aClass692_2827.method8137(i));
		if (class528_sub17 == null)
			return i_1_;
		return 870949851 * class528_sub17.anInt10388;
	}

	@Override
	public void method61(int i) {
		if (null == aString2821)
			aString2821 = aString2807;
	}

	public boolean method3455(IMultiVarValueReader iMultiVarValueReader, byte i) {
		if (Class189.method2773(iMultiVarValueReader, this.anInterface12_2810, -594551020) < anInt2818 * 2045043393)
			return false;
		if (anIntArrayArray2817 != null) {
			for (int i_3_ = 0; i_3_ < anIntArrayArray2817.length; i_3_++) {
				if (((Interface70) iMultiVarValueReader).method471(anIntArrayArray2817[i_3_][0],
						-497023996) < anIntArrayArray2817[i_3_][1])
					return false;
			}
		}
		if (null != anIntArray2816) {
			for (int i_4_ = 0; i_4_ < anIntArray2816.length; i_4_++) {
				if (!((Class256) this.anInterface12_2810.method63(anIntArray2816[i_4_], 773247260))
						.method3457(iMultiVarValueReader, -1507685768))
					return false;
			}
		}
		if (null != anIntArray2819) {
			for (int i_5_ = 0; i_5_ < anIntArray2819.length; i_5_++) {
				Class142 class142 = ((IMultiVarDefinitionsLoader) iMultiVarValueReader).method82((VarDomainType.PLAYER_CONFIGS),
						(anIntArray2819[i_5_]), 56770003);
				int i_6_ = iMultiVarValueReader.method114(class142, (byte) -80);
				if (i_6_ < this.anIntArray2808[i_5_] || i_6_ > this.anIntArray2806[i_5_])
					return false;
			}
		}
		if (anIntArray2823 != null) {
			for (int i_7_ = 0; i_7_ < anIntArray2823.length; i_7_++) {
				VarDefinition varDefinition = ((IMultiVarDefinitionsLoader) iMultiVarValueReader).method79(anIntArray2823[i_7_], (byte) 10);
				int i_8_ = iMultiVarValueReader.method97(varDefinition, -1860881523);
				if (i_8_ < this.anIntArray2824[i_7_] || i_8_ > this.anIntArray2825[i_7_])
					return false;
			}
		}
		return true;
	}

	public void method57(ByteBuffer class528_sub42) {
		for (;;) {
			int i = class528_sub42.readUnsignedByte((byte) 83);
			if (0 == i)
				break;
			method3463(class528_sub42, i, 1519164901);
		}
	}

	public boolean method3456(IMultiVarValueReader iMultiVarValueReader, int i) {
		if (this.anIntArrayArray2809 != null) {
			for (int i_9_ = 0; i_9_ < this.anIntArrayArray2809.length; i_9_++) {
				Class142 class142 = (((IMultiVarDefinitionsLoader) iMultiVarValueReader).method82(VarDomainType.PLAYER_CONFIGS,
						this.anIntArrayArray2809[i_9_][0], 598888287));
				if (iMultiVarValueReader.method114(class142, (byte) 4) >= this.anIntArrayArray2809[i_9_][1])
					return true;
			}
		}
		if (this.anIntArrayArray2820 != null) {
			for (int i_10_ = 0; i_10_ < this.anIntArrayArray2820.length; i_10_++) {
				VarDefinition varDefinition = (((IMultiVarDefinitionsLoader) iMultiVarValueReader).method79(this.anIntArrayArray2820[i_10_][0],
						(byte) 10));
				if (iMultiVarValueReader.method97(varDefinition, -1860881523) >= this.anIntArrayArray2820[i_10_][1])
					return true;
			}
		}
		return false;
	}

	public boolean method3457(IMultiVarValueReader iMultiVarValueReader, int i) {
		if (this.anIntArrayArray2809 != null) {
			for (int i_11_ = 0; i_11_ < this.anIntArrayArray2809.length; i_11_++) {
				Class142 class142 = (((IMultiVarDefinitionsLoader) iMultiVarValueReader).method82(VarDomainType.PLAYER_CONFIGS,
						this.anIntArrayArray2809[i_11_][0], -1036903042));
				if (iMultiVarValueReader.method114(class142, (byte) 4) >= this.anIntArrayArray2809[i_11_][2])
					return true;
			}
		}
		if (null != this.anIntArrayArray2820) {
			for (int i_12_ = 0; i_12_ < this.anIntArrayArray2820.length; i_12_++) {
				VarDefinition varDefinition = (((IMultiVarDefinitionsLoader) iMultiVarValueReader).method79(this.anIntArrayArray2820[i_12_][0],
						(byte) 10));
				if (iMultiVarValueReader.method97(varDefinition, -1860881523) >= this.anIntArrayArray2820[i_12_][2])
					return true;
			}
		}
		return false;
	}

	Class256(int i, Interface12 interface12) {
		this.anInterface12_2810 = interface12;
	}

	public boolean method3458(IMultiVarValueReader iMultiVarValueReader, int i, int i_13_) {
		if (null == anIntArrayArray2817 || i < 0 || i >= anIntArrayArray2817.length)
			return false;
		if (((Interface70) iMultiVarValueReader).method471(anIntArrayArray2817[i][0], 1619987749) < anIntArrayArray2817[i][1])
			return false;
		return true;
	}

	public boolean method3459(IMultiVarValueReader iMultiVarValueReader, int i, byte i_14_) {
		if (anIntArray2816 == null || i < 0 || i >= anIntArray2816.length)
			return false;
		if (!((Class256) this.anInterface12_2810.method63(anIntArray2816[i], -52521048)).method3457(iMultiVarValueReader,
				-2110839913))
			return false;
		return true;
	}

	public boolean method3460(IMultiVarValueReader iMultiVarValueReader, int i, int i_15_) {
		if (null == anIntArray2819 || i < 0 || i >= anIntArray2819.length)
			return false;
		Class142 class142 = ((IMultiVarDefinitionsLoader) iMultiVarValueReader).method82(VarDomainType.PLAYER_CONFIGS, anIntArray2819[i],
				-737728577);
		int i_16_ = iMultiVarValueReader.method114(class142, (byte) 2);
		if (i_16_ < this.anIntArray2808[i] || i_16_ > this.anIntArray2806[i])
			return false;
		return true;
	}

	public boolean method3461(IMultiVarValueReader iMultiVarValueReader, int i, int i_17_) {
		if (anIntArray2823 == null || i < 0 || i >= anIntArray2823.length)
			return false;
		VarDefinition varDefinition = ((IMultiVarDefinitionsLoader) iMultiVarValueReader).method79(anIntArray2823[i], (byte) 10);
		int i_18_ = iMultiVarValueReader.method97(varDefinition, -1860881523);
		if (i_18_ < this.anIntArray2824[i] || i_18_ > this.anIntArray2825[i])
			return false;
		return true;
	}

	public boolean method3462(IMultiVarValueReader iMultiVarValueReader, int i) {
		if (Class189.method2773(iMultiVarValueReader, this.anInterface12_2810, 167813702) < anInt2818 * 2045043393)
			return false;
		return true;
	}

	void method3463(ByteBuffer class528_sub42, int i, int i_19_) {
		if (i == 1)
			aString2807 = class528_sub42.method9637((byte) -127);
		else if (2 == i)
			aString2821 = class528_sub42.method9637((byte) -43);
		else if (3 == i) {
			int i_20_ = class528_sub42.readUnsignedByte((byte) 77);
			this.anIntArrayArray2809 = new int[i_20_][3];
			for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
				this.anIntArrayArray2809[i_21_][0] = class528_sub42.readUnsignedShort(-300075742);
				this.anIntArrayArray2809[i_21_][1] = class528_sub42.readInt(-1791312763);
				this.anIntArrayArray2809[i_21_][2] = class528_sub42.readInt(642784452);
			}
		} else if (4 == i) {
			int i_22_ = class528_sub42.readUnsignedByte((byte) 88);
			this.anIntArrayArray2820 = new int[i_22_][3];
			for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
				this.anIntArrayArray2820[i_23_][0] = class528_sub42.readUnsignedShort(-1741666090);
				this.anIntArrayArray2820[i_23_][1] = class528_sub42.readInt(-1982402211);
				this.anIntArrayArray2820[i_23_][2] = class528_sub42.readInt(332083392);
			}
		} else if (5 == i)
			class528_sub42.readUnsignedShort(-1580807939);
		else if (6 == i)
			anInt2811 = class528_sub42.readUnsignedByte((byte) 68) * 1861705181;
		else if (7 == i)
			anInt2812 = class528_sub42.readUnsignedByte((byte) 89) * -976391135;
		else if (i == 8)
			aBool2813 = true;
		else if (i == 9)
			anInt2814 = class528_sub42.readUnsignedByte((byte) 72) * -1603279981;
		else if (10 == i) {
			int i_24_ = class528_sub42.readUnsignedByte((byte) 53);
			this.anIntArray2815 = new int[i_24_];
			for (int i_25_ = 0; i_25_ < i_24_; i_25_++)
				this.anIntArray2815[i_25_] = class528_sub42.readInt(-222130021);
		} else if (i == 12)
			class528_sub42.readInt(-1179141363);
		else if (i == 13) {
			int i_26_ = class528_sub42.readUnsignedByte((byte) 107);
			anIntArray2816 = new int[i_26_];
			for (int i_27_ = 0; i_27_ < i_26_; i_27_++)
				anIntArray2816[i_27_] = class528_sub42.readUnsignedShort(-729712154);
		} else if (i == 14) {
			int i_28_ = class528_sub42.readUnsignedByte((byte) 54);
			anIntArrayArray2817 = new int[i_28_][2];
			for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
				anIntArrayArray2817[i_29_][0] = class528_sub42.readUnsignedByte((byte) 103);
				anIntArrayArray2817[i_29_][1] = class528_sub42.readUnsignedByte((byte) 123);
			}
		} else if (15 == i)
			anInt2818 = class528_sub42.readUnsignedShort(451544910) * 1999023425;
		else if (i == 17)
			anInt2828 = class528_sub42.method9645((short) -1692) * -1190963825;
		else if (i == 18) {
			int i_30_ = class528_sub42.readUnsignedByte((byte) 64);
			anIntArray2819 = new int[i_30_];
			this.anIntArray2808 = new int[i_30_];
			this.anIntArray2806 = new int[i_30_];
			aStringArray2822 = new String[i_30_];
			for (int i_31_ = 0; i_31_ < i_30_; i_31_++) {
				anIntArray2819[i_31_] = class528_sub42.readInt(-1023703854);
				this.anIntArray2808[i_31_] = class528_sub42.readInt(551223966);
				this.anIntArray2806[i_31_] = class528_sub42.readInt(237193542);
				aStringArray2822[i_31_] = class528_sub42.readString(844788836);
			}
		} else if (19 == i) {
			int i_32_ = class528_sub42.readUnsignedByte((byte) 83);
			anIntArray2823 = new int[i_32_];
			this.anIntArray2824 = new int[i_32_];
			this.anIntArray2825 = new int[i_32_];
			aStringArray2826 = new String[i_32_];
			for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
				anIntArray2823[i_33_] = class528_sub42.readInt(-674746698);
				this.anIntArray2824[i_33_] = class528_sub42.readInt(596934682);
				this.anIntArray2825[i_33_] = class528_sub42.readInt(-7639345);
				aStringArray2826[i_33_] = class528_sub42.readString(1714392265);
			}
		} else if (i == 249) {
			int i_34_ = class528_sub42.readUnsignedByte((byte) 23);
			if (this.aClass692_2827 == null) {
				int i_35_ = Class327.method4259(i_34_, -2134279851);
				this.aClass692_2827 = new Class692(i_35_);
			}
			for (int i_36_ = 0; i_36_ < i_34_; i_36_++) {
				boolean bool = class528_sub42.readUnsignedByte((byte) 65) == 1;
				int i_37_ = class528_sub42.readTriByte(-1521823133);
				Node node;
				if (bool)
					node = new Class528_Sub31(class528_sub42.readString(1769515904));
				else
					node = new Class528_Sub17(class528_sub42.readInt(-1894762134));
				this.aClass692_2827.method8142(node, i_37_);
			}
		}
	}

	public int method3464(int i, int i_38_) {
		if (this.aClass692_2827 == null)
			return i_38_;
		Class528_Sub17 class528_sub17 = ((Class528_Sub17) this.aClass692_2827.method8137(i));
		if (class528_sub17 == null)
			return i_38_;
		return 870949851 * class528_sub17.anInt10388;
	}

	public String method3465(int i, String string) {
		if (this.aClass692_2827 == null)
			return string;
		Class528_Sub31 class528_sub31 = ((Class528_Sub31) this.aClass692_2827.method8137(i));
		if (class528_sub31 == null)
			return string;
		return (String) class528_sub31.anObject10468;
	}

	public String method3466(int i, String string, int i_39_) {
		if (this.aClass692_2827 == null)
			return string;
		Class528_Sub31 class528_sub31 = ((Class528_Sub31) this.aClass692_2827.method8137(i));
		if (class528_sub31 == null)
			return string;
		return (String) class528_sub31.anObject10468;
	}

	public void method59() {
		if (null == aString2821)
			aString2821 = aString2807;
	}

	public void method60(ByteBuffer class528_sub42) {
		for (;;) {
			int i = class528_sub42.readUnsignedByte((byte) 6);
			if (0 == i)
				break;
			method3463(class528_sub42, i, -345081657);
		}
	}

	static final void decodeLocationUpdates(BitBuffer buffer, int i) {
		int skip = 0;

		buffer.setBitAccess(456456071);

		for (int index = 0; index < GPI.localPlayerCount * 1087758653; index++) {
			int playerIndex = GPI.localPlayerIndicies[index];
			if ((GPI.skipFlags[playerIndex] & 0x1) == 0) {
				if (skip > 0) {
					skip--;
					GPI.skipFlags[playerIndex] |= 0x2;
				} else {
					int i_43_ = buffer.readBits(1, (byte) -78);
					if (i_43_ == 0) {
						skip = Class491.decodeSkip(buffer, (byte) 61);
						GPI.skipFlags[playerIndex] |= 0x2;
					} else
						Class553.decodeLocation(buffer, playerIndex, 885419211);
				}
			}

		}
		buffer.setByteAccess(874087544);

		if (0 != skip)
			throw new RuntimeException("[NSN0] Invalid Skip Count:" + skip);

		buffer.setBitAccess(456456071);

		for (int index = 0; index < 1087758653 * GPI.localPlayerCount; index++) {
			int i_45_ = GPI.localPlayerIndicies[index];
			if (0 != (GPI.skipFlags[i_45_] & 0x1)) {
				if (skip > 0) {
					skip--;
					GPI.skipFlags[i_45_] |= 0x2;
				} else {
					int i_46_ = buffer.readBits(1, (byte) -90);
					if (0 == i_46_) {
						skip = Class491.decodeSkip(buffer, (byte) 36);
						GPI.skipFlags[i_45_] |= 0x2;
					} else
						Class553.decodeLocation(buffer, i_45_, 1287601800);
				}
			}
		}

		buffer.setByteAccess(874087544);

		if (0 != skip)
			throw new RuntimeException("[NSN1] Invalid Skip Count:" + skip);

		buffer.setBitAccess(456456071);
		for (int index = 0; index < 1661387681 * GPI.outsidePlayerCount; index++) {
			int playerIndex = GPI.outsidePlayerIndicies[index];
			if ((GPI.skipFlags[playerIndex] & 0x1) != 0) {
				if (skip > 0) {
					skip--;
					GPI.skipFlags[playerIndex] |= 0x2;
				} else {
					int update = buffer.readBits(1, (byte) -10);
					if (0 == update) {
						skip = Class491.decodeSkip(buffer, (byte) 14);
						GPI.skipFlags[playerIndex] |= 0x2;
					} else if (Class61.decodeRegionHash(buffer, playerIndex, -975422806))
						GPI.skipFlags[playerIndex] |= 0x2;
				}
			}
		}
		buffer.setByteAccess(874087544);

		if (0 != skip)
			throw new RuntimeException("[NSN2] Invalid Skip Count:" + skip);

		buffer.setBitAccess(456456071);
		for (int index = 0; index < GPI.outsidePlayerCount * 1661387681; index++) {
			int playerIndex = GPI.outsidePlayerIndicies[index];
			if ((GPI.skipFlags[playerIndex] & 0x1) == 0) {
				if (skip > 0) {
					skip--;
					GPI.skipFlags[playerIndex] |= 0x2;
				} else {
					int i_52_ = buffer.readBits(1, (byte) -20);
					if (i_52_ == 0) {
						skip = Class491.decodeSkip(buffer, (byte) 106);
						GPI.skipFlags[playerIndex] |= 0x2;
					} else if (Class61.decodeRegionHash(buffer, playerIndex, -1177311558))
						GPI.skipFlags[playerIndex] |= 0x2;
				}
			}
		}
		buffer.setByteAccess(874087544);

		if (skip != 0)
			throw new RuntimeException("[NSN3] Invalid Skip Count:" + skip);

		GPI.localPlayerCount = 0;
		GPI.outsidePlayerCount = 0;
		for (int index = 1; index < 2048; index++) {
			GPI.skipFlags[index] >>= 1;
			Player player = client.localPlayers[index];
			if (player != null)
				GPI.localPlayerIndicies[(GPI.localPlayerCount += -125633003) * 1087758653 - 1] = index;
			else
				GPI.outsidePlayerIndicies[(GPI.outsidePlayerCount += -396107679) * 1661387681 - 1] = index;
		}
	}

	public static boolean method3468(int i, int[] is, byte i_54_) {
		if (Class95.aBoolArray1212[i])
			return true;
		Class380.aClass226Array3970[i] = Class289.method3873(i, is, Class380.aClass226Array3970[i], false, 568533143);
		if (null == Class380.aClass226Array3970[i])
			return false;
		Class95.aBoolArray1212[i] = true;
		return true;
	}

	static final void method3469(Class648 class648, int i) {
		Class646 class646 = (class648.aBool8418 ? class648.aClass646_8406 : class648.aClass646_8392);
		Class229 class229 = class646.aClass229_8385;
		Class226 class226 = class646.aClass226_8384;
		Class218.method3142(class229, class226, class648, -1037494537);
	}
}
