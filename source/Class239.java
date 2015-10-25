/* Class239 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class239 implements Definition {
	int anInt2604;
	public String aString2605;
	public int anInt2606;
	public int anInt2607 = 1501072373;
	public int anInt2608 = -1891718259;
	public String aString2609;
	public int anInt2610;
	public int anInt2611 = 1493032289;
	public int anInt2612 = 0;
	public static final int anInt2613 = 0;
	public static final int anInt2614 = 1;
	public int anInt2615;
	public int anInt2616;
	public int anInt2617;
	public boolean aBool2618 = true;
	Class232 aClass232_2619;
	public String[] aStringArray2620;
	public int anInt2621;
	int anInt2622;
	public int anInt2623;
	int anInt2624;
	int anInt2625;
	int anInt2626;
	int anInt2627;
	public Class257 aClass257_2628;
	int anInt2629;
	int anInt2630;
	public int[] anIntArray2631;
	public int[] anIntArray2632;
	public int anInt2633;
	public int anInt2634;
	public boolean aBool2635 = false;
	public int anInt2636;
	Interface12 anInterface12_2637;
	public int anInt2638;
	public int anInt2639;
	public int anInt2640;
	public boolean aBool2641;
	public int anInt2642;
	public Class263 aClass263_2643;
	public int anInt2644;
	public static final int anInt2645 = 2;
	public byte[] aByteArray2646;
	public int anInt2647;
	public int[] anIntArray2648;
	public int anInt2649;
	Class692 aClass692_2650;
	int anInt2651;

	@Override
	public void method58(ByteBuffer class528_sub42, byte i) {
		for (;;) {
			int i_0_ = class528_sub42.readUnsignedByte((byte) 66);
			if (0 == i_0_)
				break;
			method3298(class528_sub42, i_0_, -1771157152);
		}
	}

	void method3298(ByteBuffer class528_sub42, int i, int i_1_) {
		if (1 == i)
			anInt2607 = class528_sub42.method9645((short) -2962) * -1501072373;
		else if (i == 2)
			anInt2608 = class528_sub42.method9645((short) -6729) * 1891718259;
		else if (3 == i)
			aString2609 = class528_sub42.readString(564021583);
		else if (i == 4)
			anInt2610 = class528_sub42.readTriByte(2071766278) * 230557091;
		else if (5 == i)
			anInt2611 = class528_sub42.readTriByte(-432309520) * -1493032289;
		else if (6 == i)
			anInt2612 = class528_sub42.readUnsignedByte((byte) 69) * -1470672893;
		else if (i == 7) {
			int i_2_ = class528_sub42.readUnsignedByte((byte) 12);
			if (0 == (i_2_ & 0x1))
				aBool2618 = false;
			if (2 == (i_2_ & 0x2))
				aBool2635 = true;
		} else if (i == 8)
			class528_sub42.readUnsignedByte((byte) 69);
		else if (i == 9) {
			this.anInt2625 = class528_sub42.readUnsignedShort(-955100960) * 430413033;
			if (65535 == this.anInt2625 * -1459977383)
				this.anInt2625 = -430413033;
			this.anInt2626 = class528_sub42.readUnsignedShort(799911732) * -1571475617;
			if (65535 == 1309994143 * this.anInt2626)
				this.anInt2626 = 1571475617;
			this.anInt2604 = class528_sub42.readInt(-1187712596) * 1946531605;
			this.anInt2624 = class528_sub42.readInt(-440399842) * -1459985517;
		} else if (i >= 10 && i <= 14)
			aStringArray2620[i - 10] = class528_sub42.readString(269757897);
		else if (15 == i) {
			int i_3_ = class528_sub42.readUnsignedByte((byte) 50);
			anIntArray2632 = new int[2 * i_3_];
			for (int i_4_ = 0; i_4_ < 2 * i_3_; i_4_++)
				anIntArray2632[i_4_] = class528_sub42.method9642(1741495514);
			anInt2640 = class528_sub42.readInt(-1934604196) * -1486116765;
			int i_5_ = class528_sub42.readUnsignedByte((byte) 74);
			anIntArray2648 = new int[i_5_];
			for (int i_6_ = 0; i_6_ < anIntArray2648.length; i_6_++)
				anIntArray2648[i_6_] = class528_sub42.readInt(-1406568812);
			aByteArray2646 = new byte[i_3_];
			for (int i_7_ = 0; i_7_ < i_3_; i_7_++)
				aByteArray2646[i_7_] = class528_sub42.method9627(-1407763344);
		} else if (i == 16)
			aBool2641 = false;
		else if (i == 17)
			aString2605 = class528_sub42.readString(1619756416);
		else if (18 == i)
			this.anInt2622 = class528_sub42.method9645((short) -13572) * 1269211853;
		else if (19 == i)
			anInt2649 = class528_sub42.readUnsignedShort(392809804) * -1686801669;
		else if (20 == i) {
			this.anInt2629 = class528_sub42.readUnsignedShort(-2021464232) * -877392797;
			if (31905099 * this.anInt2629 == 65535)
				this.anInt2629 = 877392797;
			this.anInt2630 = class528_sub42.readUnsignedShort(-1367049460) * 1694288471;
			if (this.anInt2630 * 718913895 == 65535)
				this.anInt2630 = -1694288471;
			this.anInt2627 = class528_sub42.readInt(525427372) * -1482782579;
			this.anInt2651 = class528_sub42.readInt(-1421677732) * 926884413;
		} else if (i == 21)
			anInt2617 = class528_sub42.readInt(127869126) * -1140322413;
		else if (i == 22)
			anInt2616 = class528_sub42.readInt(-1210155633) * -514745927;
		else if (23 == i) {
			anInt2638 = class528_sub42.readUnsignedByte((byte) 45) * -611646545;
			anInt2615 = class528_sub42.readUnsignedByte((byte) 78) * 902914687;
			anInt2621 = class528_sub42.readUnsignedByte((byte) 112) * -842068117;
		} else if (i == 24) {
			anInt2639 = class528_sub42.method9642(-2100473801) * 431651687;
			anInt2642 = class528_sub42.method9642(735611878) * -1090974425;
		} else if (25 == i)
			anInt2644 = class528_sub42.method9645((short) -14843) * -988419299;
		else if (26 == i || i == 27) {
			this.anInt2625 = class528_sub42.readUnsignedShort(-1603863485) * 430413033;
			if (65535 == -1459977383 * this.anInt2625)
				this.anInt2625 = -430413033;
			this.anInt2626 = class528_sub42.readUnsignedShort(-1533513613) * -1571475617;
			if (65535 == this.anInt2626 * 1309994143)
				this.anInt2626 = 1571475617;
			int i_8_ = -1;
			if (i == 27) {
				i_8_ = class528_sub42.readUnsignedShort(-1700935615);
				if (i_8_ == 65535)
					i_8_ = -1;
			}
			int i_9_ = class528_sub42.readUnsignedByte((byte) 97);
			anIntArray2631 = new int[2 + i_9_];
			for (int i_10_ = 0; i_10_ <= i_9_; i_10_++) {
				anIntArray2631[i_10_] = class528_sub42.readUnsignedShort(169042810);
				if (anIntArray2631[i_10_] == 65535)
					anIntArray2631[i_10_] = -1;
			}
			anIntArray2631[i_9_ + 1] = i_8_;
		} else if (28 == i)
			anInt2636 = class528_sub42.readUnsignedByte((byte) 100) * -1590574611;
		else if (29 == i)
			aClass263_2643 = ((Class263) Class443.method5321(Class528_Sub37.method9551((byte) 39),
					class528_sub42.readUnsignedByte((byte) 20), 832833333));
		else if (i == 30)
			aClass257_2628 = ((Class257) Class443.method5321(Class528_Sub21_Sub13.method10561(1498414357),
					class528_sub42.readUnsignedByte((byte) 20), 1265010597));
		else if (i == 249) {
			int i_11_ = class528_sub42.readUnsignedByte((byte) 78);
			if (this.aClass692_2650 == null) {
				int i_12_ = Class327.method4259(i_11_, -2134279851);
				this.aClass692_2650 = new Class692(i_12_);
			}
			for (int i_13_ = 0; i_13_ < i_11_; i_13_++) {
				boolean bool = class528_sub42.readUnsignedByte((byte) 54) == 1;
				int i_14_ = class528_sub42.readTriByte(-1563696377);
				Node node;
				if (bool)
					node = new Class528_Sub31(class528_sub42.readString(1901039812));
				else
					node = new Class528_Sub17(class528_sub42.readInt(-1350564026));
				this.aClass692_2650.method8142(node, i_14_);
			}
		}
	}

	@Override
	public void method61(int i) {
		if (null != anIntArray2632) {
			for (int i_15_ = 0; i_15_ < anIntArray2632.length; i_15_ += 2) {
				if (anIntArray2632[i_15_] < anInt2633 * 1760812701)
					anInt2633 = -1295411275 * anIntArray2632[i_15_];
				else if (anIntArray2632[i_15_] > -1176935681 * anInt2623)
					anInt2623 = anIntArray2632[i_15_] * 249404671;
				if (anIntArray2632[i_15_ + 1] < -471588695 * anInt2634)
					anInt2634 = 1570931609 * anIntArray2632[1 + i_15_];
				else if (anIntArray2632[i_15_ + 1] > anInt2647 * -1230395865)
					anInt2647 = 1536125335 * anIntArray2632[i_15_ + 1];
			}
		}
	}

	public boolean method3299(IMultiVarDefinitionsLoader iMultiVarDefinitionsLoader, IMultiVarValueReader iMultiVarValueReader, int i) {
		int i_16_ = -1;
		if (this.anInt2626 * 1309994143 != -1) {
			Class142 class142 = iMultiVarDefinitionsLoader.method82(VarDomainType.PLAYER_CONFIGS, (1309994143 * this.anInt2626),
					-299082762);
			i_16_ = iMultiVarValueReader.method114(class142, (byte) -118);
		} else if (-1459977383 * this.anInt2625 != -1) {
			VarDefinition varDefinition = iMultiVarDefinitionsLoader.method79((this.anInt2625 * -1459977383), (byte) 10);
			i_16_ = iMultiVarValueReader.method97(varDefinition, -1860881523);
		} else
			return true;
		if (null == anIntArray2631) {
			if (i_16_ < this.anInt2604 * 1827528765 || i_16_ > this.anInt2624 * 555823771)
				return false;
		} else {
			if (i_16_ < 0 || i_16_ >= anIntArray2631.length - 1) {
				int i_17_ = anIntArray2631[anIntArray2631.length - 1];
				if (i_17_ != -1) {
					if (-1 != 1827528765 * this.anInt2604 && -1 != this.anInt2624 * 555823771
							&& (i_16_ < this.anInt2604 * 1827528765 || (i_16_ > 555823771 * this.anInt2624)))
						return false;
				} else
					return false;
			}
			if (anIntArray2631[i_16_] == -1)
				return false;
		}
		boolean bool = false;
		int i_18_;
		if (this.anInt2630 * 718913895 != -1) {
			Class142 class142 = iMultiVarDefinitionsLoader.method82(VarDomainType.PLAYER_CONFIGS, 718913895 * this.anInt2630,
					568582443);
			i_18_ = iMultiVarValueReader.method114(class142, (byte) 9);
		} else if (this.anInt2629 * 31905099 != -1) {
			VarDefinition varDefinition = iMultiVarDefinitionsLoader.method79(this.anInt2629 * 31905099, (byte) 10);
			i_18_ = iMultiVarValueReader.method97(varDefinition, -1860881523);
		} else
			return true;
		if (i_18_ < this.anInt2627 * 2054847045 || i_18_ > -1305279211 * this.anInt2651)
			return false;
		return true;
	}

	void method3300(ByteBuffer class528_sub42, int i) {
		if (1 == i)
			anInt2607 = class528_sub42.method9645((short) -6076) * -1501072373;
		else if (i == 2)
			anInt2608 = class528_sub42.method9645((short) -11063) * 1891718259;
		else if (3 == i)
			aString2609 = class528_sub42.readString(31362476);
		else if (i == 4)
			anInt2610 = class528_sub42.readTriByte(-1838012299) * 230557091;
		else if (5 == i)
			anInt2611 = class528_sub42.readTriByte(1088399522) * -1493032289;
		else if (6 == i)
			anInt2612 = class528_sub42.readUnsignedByte((byte) 97) * -1470672893;
		else if (i == 7) {
			int i_19_ = class528_sub42.readUnsignedByte((byte) 64);
			if (0 == (i_19_ & 0x1))
				aBool2618 = false;
			if (2 == (i_19_ & 0x2))
				aBool2635 = true;
		} else if (i == 8)
			class528_sub42.readUnsignedByte((byte) 124);
		else if (i == 9) {
			this.anInt2625 = class528_sub42.readUnsignedShort(-2009989346) * 430413033;
			if (65535 == this.anInt2625 * -1459977383)
				this.anInt2625 = -430413033;
			this.anInt2626 = class528_sub42.readUnsignedShort(718085073) * -1571475617;
			if (65535 == 1309994143 * this.anInt2626)
				this.anInt2626 = 1571475617;
			this.anInt2604 = class528_sub42.readInt(351488242) * 1946531605;
			this.anInt2624 = class528_sub42.readInt(-1760080750) * -1459985517;
		} else if (i >= 10 && i <= 14)
			aStringArray2620[i - 10] = class528_sub42.readString(750871063);
		else if (15 == i) {
			int i_20_ = class528_sub42.readUnsignedByte((byte) 62);
			anIntArray2632 = new int[2 * i_20_];
			for (int i_21_ = 0; i_21_ < 2 * i_20_; i_21_++)
				anIntArray2632[i_21_] = class528_sub42.method9642(-827488266);
			anInt2640 = class528_sub42.readInt(-1951035888) * -1486116765;
			int i_22_ = class528_sub42.readUnsignedByte((byte) 119);
			anIntArray2648 = new int[i_22_];
			for (int i_23_ = 0; i_23_ < anIntArray2648.length; i_23_++)
				anIntArray2648[i_23_] = class528_sub42.readInt(-1468832755);
			aByteArray2646 = new byte[i_20_];
			for (int i_24_ = 0; i_24_ < i_20_; i_24_++)
				aByteArray2646[i_24_] = class528_sub42.method9627(-1903837799);
		} else if (i == 16)
			aBool2641 = false;
		else if (i == 17)
			aString2605 = class528_sub42.readString(2117523072);
		else if (18 == i)
			this.anInt2622 = class528_sub42.method9645((short) -16488) * 1269211853;
		else if (19 == i)
			anInt2649 = class528_sub42.readUnsignedShort(89374193) * -1686801669;
		else if (20 == i) {
			this.anInt2629 = class528_sub42.readUnsignedShort(-2047308506) * -877392797;
			if (31905099 * this.anInt2629 == 65535)
				this.anInt2629 = 877392797;
			this.anInt2630 = class528_sub42.readUnsignedShort(-2070331251) * 1694288471;
			if (this.anInt2630 * 718913895 == 65535)
				this.anInt2630 = -1694288471;
			this.anInt2627 = class528_sub42.readInt(67253989) * -1482782579;
			this.anInt2651 = class528_sub42.readInt(-1878247999) * 926884413;
		} else if (i == 21)
			anInt2617 = class528_sub42.readInt(-11995191) * -1140322413;
		else if (i == 22)
			anInt2616 = class528_sub42.readInt(-1576102778) * -514745927;
		else if (23 == i) {
			anInt2638 = class528_sub42.readUnsignedByte((byte) 113) * -611646545;
			anInt2615 = class528_sub42.readUnsignedByte((byte) 120) * 902914687;
			anInt2621 = class528_sub42.readUnsignedByte((byte) 75) * -842068117;
		} else if (i == 24) {
			anInt2639 = class528_sub42.method9642(305138842) * 431651687;
			anInt2642 = class528_sub42.method9642(353300131) * -1090974425;
		} else if (25 == i)
			anInt2644 = class528_sub42.method9645((short) -9247) * -988419299;
		else if (26 == i || i == 27) {
			this.anInt2625 = class528_sub42.readUnsignedShort(-1625133589) * 430413033;
			if (65535 == -1459977383 * this.anInt2625)
				this.anInt2625 = -430413033;
			this.anInt2626 = class528_sub42.readUnsignedShort(-1787596786) * -1571475617;
			if (65535 == this.anInt2626 * 1309994143)
				this.anInt2626 = 1571475617;
			int i_25_ = -1;
			if (i == 27) {
				i_25_ = class528_sub42.readUnsignedShort(800669896);
				if (i_25_ == 65535)
					i_25_ = -1;
			}
			int i_26_ = class528_sub42.readUnsignedByte((byte) 27);
			anIntArray2631 = new int[2 + i_26_];
			for (int i_27_ = 0; i_27_ <= i_26_; i_27_++) {
				anIntArray2631[i_27_] = class528_sub42.readUnsignedShort(551269737);
				if (anIntArray2631[i_27_] == 65535)
					anIntArray2631[i_27_] = -1;
			}
			anIntArray2631[i_26_ + 1] = i_25_;
		} else if (28 == i)
			anInt2636 = class528_sub42.readUnsignedByte((byte) 6) * -1590574611;
		else if (29 == i)
			aClass263_2643 = ((Class263) Class443.method5321(Class528_Sub37.method9551((byte) -32),
					class528_sub42.readUnsignedByte((byte) 65), 2129073178));
		else if (i == 30)
			aClass257_2628 = ((Class257) Class443.method5321(Class528_Sub21_Sub13.method10561(98569844),
					class528_sub42.readUnsignedByte((byte) 91), 1974356027));
		else if (i == 249) {
			int i_28_ = class528_sub42.readUnsignedByte((byte) 105);
			if (this.aClass692_2650 == null) {
				int i_29_ = Class327.method4259(i_28_, -2134279851);
				this.aClass692_2650 = new Class692(i_29_);
			}
			for (int i_30_ = 0; i_30_ < i_28_; i_30_++) {
				boolean bool = class528_sub42.readUnsignedByte((byte) 124) == 1;
				int i_31_ = class528_sub42.readTriByte(473326273);
				Node node;
				if (bool)
					node = new Class528_Sub31(class528_sub42.readString(340579162));
				else
					node = new Class528_Sub17(class528_sub42.readInt(295760315));
				this.aClass692_2650.method8142(node, i_31_);
			}
		}
	}

	public Class151 method3301(Class173 class173, int i) {
		int i_32_ = anInt2644 * 532426549 | class173.anInt1985 * 1967042207 << 29;
		Class151 class151 = (Class151) this.aClass232_2619.aClass186_2577.method2727(i_32_);
		if (class151 != null)
			return class151;
		if (!this.aClass232_2619.aClass446_2576.method5357(anInt2644 * 532426549, (short) 7366))
			return null;
		Class178 class178 = Class175.method2561(((this.aClass232_2619).aClass446_2576), 532426549 * anInt2644, 0);
		if (class178 != null) {
			class151 = class173.method2334(class178, true);
			this.aClass232_2619.aClass186_2577.method2729(class151, i_32_);
		}
		return class151;
	}

	public Class151 method3302(Class173 class173, int i) {
		Class151 class151 = ((Class151) (this.aClass232_2619.aClass186_2577
				.method2727(2047744517 * this.anInt2622 | 0x20000 | 1967042207 * class173.anInt1985 << 29)));
		if (null != class151)
			return class151;
		this.aClass232_2619.aClass446_2576.method5357(this.anInt2622 * 2047744517, (short) 5350);
		Class178 class178 = Class175.method2561((this.aClass232_2619.aClass446_2576), 2047744517 * this.anInt2622, 0);
		if (null != class178) {
			class151 = class173.method2334(class178, true);
			this.aClass232_2619.aClass186_2577.method2729(class151,
					this.anInt2622 * 2047744517 | 0x20000 | class173.anInt1985 * 1967042207 << 29);
		}
		return class151;
	}

	public int method3303(int i, int i_33_, int i_34_) {
		if (null == this.aClass692_2650)
			return i_33_;
		Class528_Sub17 class528_sub17 = ((Class528_Sub17) this.aClass692_2650.method8137(i));
		if (null == class528_sub17)
			return i_33_;
		return class528_sub17.anInt10388 * 870949851;
	}

	public void method57(ByteBuffer class528_sub42) {
		for (;;) {
			int i = class528_sub42.readUnsignedByte((byte) 27);
			if (0 == i)
				break;
			method3298(class528_sub42, i, 1629532855);
		}
	}

	public void method60(ByteBuffer class528_sub42) {
		for (;;) {
			int i = class528_sub42.readUnsignedByte((byte) 97);
			if (0 == i)
				break;
			method3298(class528_sub42, i, -816938473);
		}
	}

	public void method59() {
		if (null != anIntArray2632) {
			for (int i = 0; i < anIntArray2632.length; i += 2) {
				if (anIntArray2632[i] < anInt2633 * 1760812701)
					anInt2633 = -1295411275 * anIntArray2632[i];
				else if (anIntArray2632[i] > -1176935681 * anInt2623)
					anInt2623 = anIntArray2632[i] * 249404671;
				if (anIntArray2632[i + 1] < -471588695 * anInt2634)
					anInt2634 = 1570931609 * anIntArray2632[1 + i];
				else if (anIntArray2632[i + 1] > anInt2647 * -1230395865)
					anInt2647 = 1536125335 * anIntArray2632[i + 1];
			}
		}
	}

	public final Class239 method3304(IMultiVarDefinitionsLoader iMultiVarDefinitionsLoader, IMultiVarValueReader iMultiVarValueReader, int i) {
		int i_35_ = -1;
		if (-1 != -1459977383 * this.anInt2625) {
			VarDefinition varDefinition = iMultiVarDefinitionsLoader.method79((-1459977383 * this.anInt2625), (byte) 10);
			if (null != varDefinition)
				i_35_ = iMultiVarValueReader.method97(varDefinition, -1860881523);
		} else if (1309994143 * this.anInt2626 != -1) {
			Class142 class142 = iMultiVarDefinitionsLoader.method82(VarDomainType.PLAYER_CONFIGS, (1309994143 * this.anInt2626),
					-1182007536);
			if (class142 != null)
				i_35_ = iMultiVarValueReader.method114(class142, (byte) 42);
		}
		if (i_35_ < 0 || i_35_ >= anIntArray2631.length - 1) {
			int i_36_ = anIntArray2631[anIntArray2631.length - 1];
			if (-1 != i_36_)
				return (Class239) this.anInterface12_2637.method63(i_36_, 605209791);
			return null;
		}
		if (anIntArray2631[i_35_] == -1)
			return null;
		return (Class239) this.anInterface12_2637.method63(anIntArray2631[i_35_], 528893852);
	}

	public Class151 method3305(Class173 class173, boolean bool, int i) {
		int i_37_ = bool ? 1251438779 * anInt2608 : anInt2607 * 879785891;
		int i_38_ = i_37_ | 1967042207 * class173.anInt1985 << 29;
		Class151 class151 = (Class151) this.aClass232_2619.aClass186_2577.method2727(i_38_);
		if (class151 != null)
			return class151;
		if (!this.aClass232_2619.aClass446_2576.method5357(i_37_, (short) 4284))
			return null;
		Class178 class178 = Class175.method2561(((this.aClass232_2619).aClass446_2576), i_37_, 0);
		if (null != class178) {
			class151 = class173.method2334(class178, true);
			this.aClass232_2619.aClass186_2577.method2729(class151, i_38_);
		}
		return class151;
	}

	public int method3306(int i, int i_39_) {
		if (null == this.aClass692_2650)
			return i_39_;
		Class528_Sub17 class528_sub17 = ((Class528_Sub17) this.aClass692_2650.method8137(i));
		if (null == class528_sub17)
			return i_39_;
		return class528_sub17.anInt10388 * 870949851;
	}

	public int method3307(int i, int i_40_) {
		if (null == this.aClass692_2650)
			return i_40_;
		Class528_Sub17 class528_sub17 = ((Class528_Sub17) this.aClass692_2650.method8137(i));
		if (null == class528_sub17)
			return i_40_;
		return class528_sub17.anInt10388 * 870949851;
	}

	public String method3308(int i, String string, int i_41_) {
		if (null == this.aClass692_2650)
			return string;
		Class528_Sub31 class528_sub31 = ((Class528_Sub31) this.aClass692_2650.method8137(i));
		if (class528_sub31 == null)
			return string;
		return (String) class528_sub31.anObject10468;
	}

	Class239(int i, Interface12 interface12, Class232 class232) {
		aStringArray2620 = new String[5];
		this.anInt2622 = -1269211853;
		this.anInt2604 = -1946531605;
		this.anInt2624 = 1459985517;
		this.anInt2625 = -430413033;
		this.anInt2626 = 1571475617;
		this.anInt2629 = 877392797;
		this.anInt2630 = -1694288471;
		anIntArray2631 = null;
		anInt2633 = -852072373;
		anInt2634 = 576552039;
		anInt2623 = -2147483648;
		anInt2647 = -2147483648;
		anInt2638 = 611646545;
		anInt2615 = -902914687;
		anInt2621 = 842068117;
		aClass263_2643 = Class263.aClass263_2859;
		aClass257_2628 = Class257.aClass257_2833;
		anInt2636 = 1590574611;
		aBool2641 = true;
		anInt2649 = 1686801669;
		anInt2644 = 988419299;
		anInt2606 = -1333323717 * i;
		this.anInterface12_2637 = interface12;
		this.aClass232_2619 = class232;
	}

	public static boolean method3309(byte i) {
		return (null != Canvas_Sub1.aTwitchTV11693 && Canvas_Sub1.aTwitchTV11693.IsStreaming());
	}

	public static void method3310(boolean bool, byte i) {
		Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967.aClass691_Sub17_10585), 1, 1209194385);
		Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967.aClass691_Sub17_10586), 1, 365693909);
		Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967.aClass691_Sub4_10578), 0, 775614179);
		Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967.aClass691_Sub16_10576), 0, 1752568060);
		Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967.aClass691_Sub23_10606), 0, 1066781781);
		Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967.aClass691_Sub14_10570), 0, -32680239);
		Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967.aClass691_Sub11_10603), 0, 165769340);
		Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967.aClass691_Sub7_10589), 0, 467957613);
		Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967.aClass691_Sub8_10565), 0, 1805010781);
		Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967.aClass691_Sub12_10590), 0, 652243438);
		Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967.aClass691_Sub2_10580), 0, 269120613);
		Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967.aClass691_Sub15_10566), 0, 1429918302);
		Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967.aClass691_Sub27_10567), 0, 233339471);
		Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967.aClass691_Sub27_10568), 0, 1920947818);
		Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967.aClass691_Sub5_10579), 0, 1078421611);
		Class514.aClass528_Sub38_6967.method9556(Class514.aClass528_Sub38_6967.aClass691_Sub10_10572,
				-177612843 * Class279.aClass279_3055.anInt3059, 740078167);
		Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967.aClass691_Sub19_10601), 0, 1326114335);
		if (Class587.aClass173_7714 != null && Class587.aClass173_7714.method2164()
				&& Class587.aClass173_7714.method2271())
			Class587.aClass173_7714.method2231();
		Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967.aClass691_Sub22_10588), 0, 1768473715);
		Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967.aClass691_Sub25_10592), 0, 1317796956);
		Class49.method886((byte) 19);
		Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967.aClass691_Sub13_10587), 2, 1144486095);
		Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967.aClass691_Sub35_10597), 1, 762245699);
		Class662.method7878(1119281887);
		client.aClass495_10935.method5975(-1425390788).method7492(1474690217);
		client.aBool10896 = true;
	}

	static final void method3311(Class648 class648, byte i) {
		String string = (String) (class648.anObjectArray8396[(class648.anInt8410 -= 1600226731) * -520794877]);
		class648.anInt8395 -= -577899301;
		int i_42_ = (class648.anIntArray8394[717927929 * class648.anInt8395]);
		int i_43_ = (class648.anIntArray8394[1 + 717927929 * class648.anInt8395]);
		int i_44_ = (class648.anIntArray8394[2 + 717927929 * class648.anInt8395]);
		Class1 class1 = Class625.aClass414_8129.method4937(client.anInterface50_10917, i_43_, 805903583);
		String string_45_ = class1.method496(string, i_42_, Class298.aClass151Array3262, i_44_, (byte) -122);
		class648.anObjectArray8396[(class648.anInt8410 += 1600226731) * -520794877 - 1] = null != string_45_
				? string_45_ : "";
	}
}
