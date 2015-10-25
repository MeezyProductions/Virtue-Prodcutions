/* Class645_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class645_Sub1 extends Class645 {
	Class645_Sub1 aClass645_Sub1_10673;
	public byte aByte10674;
	public byte aByte10675;
	public Class538 aClass538_10676;
	int anInt10677;
	public Class159[] aClass159Array10678;

	public boolean method9770(byte i) {
		return true;
	}

	abstract boolean method9771(int i);

	abstract boolean method9775(short i);

	abstract void method9777(int i);

	abstract void method9779(Class173 class173, int i);

	public abstract Class554 method9780(Class173 class173, int i);

	Class645_Sub1(Class538 class538) {
		aClass538_10676 = class538;
	}

	abstract boolean method9781(Class173 class173, byte i);

	abstract boolean method9782(byte i);

	public int method9785(int i) {
		return -method9819(1792706198);
	}

	void method9786(int i, int i_1_) {
		aClass159Array10678 = new Class159[i];
		for (int i_2_ = 0; i_2_ < aClass159Array10678.length; i_2_++)
			aClass159Array10678[i_2_] = new Class159();
	}

	abstract boolean method9797(int i);

	abstract void method9798(Class173 class173, Class645_Sub1 class645_sub1_3_, int i, int i_4_, int i_5_, boolean bool,
			int i_6_);

	int method9807(int i, int i_11_, Class528_Sub12[] class528_sub12s, int i_12_) {
		long l = (aClass538_10676.aLongArrayArrayArray7150[aByte10675][i][i_11_]);
		long l_13_ = 0L;
		int i_14_ = 0;
		for (/**/; l_13_ <= 48L; l_13_ += 16L) {
			int i_15_ = (int) (l >> (int) l_13_ & 0xffffL);
			if (i_15_ <= 0)
				break;
			class528_sub12s[i_14_++] = (aClass538_10676.aClass543Array7203[i_15_ - 1].aClass528_Sub12_7266);
		}
		for (int i_16_ = i_14_; i_16_ < 4; i_16_++)
			class528_sub12s[i_16_] = null;
		return i_14_;
	}

	int method9809(int i) {
		return 0;
	}

	abstract Class549 method9813(Class173 class173, int i);

	abstract int method9817(Class528_Sub12[] class528_sub12s, int i);

	public abstract int method9819(int i);

	abstract boolean method9820(Class173 class173, int i, int i_17_, byte i_18_);
}
