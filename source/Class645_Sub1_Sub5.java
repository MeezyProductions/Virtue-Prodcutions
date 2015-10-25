/* Class645_Sub1_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class645_Sub1_Sub5 extends Class645_Sub1 {
	public short aShort11743;
	public boolean aBool11744;
	public short aShort11745;
	public short aShort11746;
	public short aShort11747;
	byte aByte11748;
	int anInt11749 = 0;
	Class528_Sub12[] aClass528_Sub12Array11750 = new Class528_Sub12[4];

	void method10656(int i) {
		/* empty */
	}

	@Override
	int method9817(Class528_Sub12[] class528_sub12s, int i) {
		if (aBool8373) {
			this.anInt11749 = 0;
			int i_0_ = Math.max(0, aShort11747);
			int i_1_ = Math.min((aClass538_10676.aLongArrayArrayArray7150[aByte10675]).length - 1, aShort11743);
			int i_2_ = Math.max(0, aShort11745);
			int i_3_ = Math.min((aClass538_10676.aLongArrayArrayArray7150[aByte10675][i_0_]).length - 1, aShort11746);
			while_20_: for (/**/; i_0_ <= i_1_; i_0_++) {
				for (/**/; i_2_ <= i_3_; i_2_++) {
					long l = (aClass538_10676.aLongArrayArrayArray7150[aByte10675][i_0_][i_2_]);
					long l_4_ = 0L;
					while_19_: while (l_4_ <= 48L) {
						int i_5_ = (int) (l >>> (int) l_4_ & 0xffffL);
						if (i_5_ <= 0)
							break;
						Class543 class543 = (aClass538_10676.aClass543Array7203[i_5_ - 1]);
						for (int i_6_ = 0; i_6_ < (this.anInt11749 * -596861341); i_6_++) {
							if (class543.aClass528_Sub12_7266 == (this.aClass528_Sub12Array11750[i_6_])) {
								l_4_ += 16L;
								continue while_19_;
							}
						}
						this.aClass528_Sub12Array11750[(this.anInt11749 += -864627893) * -596861341
								- 1] = class543.aClass528_Sub12_7266;
						if (this.anInt11749 * -596861341 == 4)
							break while_20_;
						l_4_ += 16L;
					}
				}
			}
			for (int i_7_ = -596861341 * this.anInt11749; i_7_ < 4; i_7_++)
				this.aClass528_Sub12Array11750[i_7_] = null;
			if (this.aByte11748 != 0) {
				int i_8_ = (aShort11747 - aClass538_10676.anInt7167 * 1980357015);
				int i_9_ = (aShort11745 - aClass538_10676.anInt7185 * -1890816403);
				short i_10_;
				int i_11_;
				int i_12_;
				short i_13_;
				if (1 == this.aByte11748) {
					if (i_9_ > i_8_) {
						i_10_ = aShort11747;
						i_11_ = aShort11745 - 1;
						i_12_ = 1 + aShort11747;
						i_13_ = aShort11745;
					} else {
						i_10_ = aShort11747;
						i_11_ = aShort11745 + 1;
						i_12_ = aShort11747 - 1;
						i_13_ = aShort11745;
					}
				} else if (i_9_ > -i_8_) {
					i_10_ = aShort11747;
					i_11_ = aShort11745 - 1;
					i_12_ = aShort11747 - 1;
					i_13_ = aShort11745;
				} else {
					i_10_ = aShort11747;
					i_11_ = 1 + aShort11745;
					i_12_ = aShort11747 + 1;
					i_13_ = aShort11745;
				}
				int i_14_ = 0;
				while_22_: for (/**/; (i_14_ < this.anInt11749 * -596861341); i_14_++) {
					long l = (aClass538_10676.aLongArrayArrayArray7150[aByte10675][i_10_][i_11_]);
					while (0L != l) {
						Class543 class543 = (aClass538_10676.aClass543Array7203[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
						if (class543.aClass528_Sub12_7266 == (this.aClass528_Sub12Array11750[i_14_]))
							continue while_22_;
					}
					l = (aClass538_10676.aLongArrayArrayArray7150[aByte10675][i_12_][i_13_]);
					while (0L != l) {
						Class543 class543 = (aClass538_10676.aClass543Array7203[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
						if (class543.aClass528_Sub12_7266 == (this.aClass528_Sub12Array11750[i_14_]))
							continue while_22_;
					}
					for (int i_15_ = i_14_; i_15_ < (this.anInt11749 * -596861341) - 1; i_15_++)
						this.aClass528_Sub12Array11750[i_15_] = (this.aClass528_Sub12Array11750[1 + i_15_]);
					this.anInt11749 -= -864627893;
				}
			}
			aBool8373 = false;
		}
		for (int i_16_ = 0; i_16_ < -596861341 * this.anInt11749; i_16_++)
			class528_sub12s[i_16_] = this.aClass528_Sub12Array11750[i_16_];
		return -596861341 * this.anInt11749;
	}

	Class645_Sub1_Sub5(Class538 class538, int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_,
			int i_23_, int i_24_, boolean bool, byte i_25_) {
		super(class538);
		aByte10675 = (byte) i;
		aByte10674 = (byte) i_17_;
		method7688(new Class422(i_18_, i_19_, i_20_));
		aShort11747 = (short) i_21_;
		aShort11743 = (short) i_22_;
		aShort11745 = (short) i_23_;
		aShort11746 = (short) i_24_;
		aBool11744 = bool;
		this.aByte11748 = i_25_;
		for (int i_26_ = 0; i_26_ < 4; i_26_++)
			this.aClass528_Sub12Array11750[i_26_] = null;
	}

	@Override
	boolean method9782(byte i) {
		for (int i_27_ = aShort11747; i_27_ <= aShort11743; i_27_++) {
			for (int i_28_ = aShort11745; i_28_ <= aShort11746; i_28_++) {
				int i_29_ = (i_27_ - 1980357015 * aClass538_10676.anInt7167 + aClass538_10676.anInt7190 * -117642839);
				if (i_29_ >= 0 && i_29_ < (aClass538_10676.aBoolArrayArray7210).length) {
					int i_30_ = (-117642839 * aClass538_10676.anInt7190
							+ (i_28_ - (aClass538_10676.anInt7185 * -1890816403)));
					if (i_30_ >= 0 && i_30_ < (aClass538_10676.aBoolArrayArray7210).length
							&& (aClass538_10676.aBoolArrayArray7210[i_29_][i_30_]))
						return true;
				}
			}
		}
		return false;
	}

	void method10657() {
		/* empty */
	}

	void method10658() {
		/* empty */
	}

	@Override
	boolean method9781(Class173 class173, byte i) {
		return (aClass538_10676.aClass559_7156.method6796(aByte10674, aShort11747, aShort11743, aShort11745,
				aShort11746, method9780(class173, -1186172410)));
	}

}
