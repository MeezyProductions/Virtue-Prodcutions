/* ISAACCipher - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class ISAACCipher {
	int[] anIntArray148 = new int[256];
	static final int anInt149 = 256;
	static final int anInt150 = 1020;
	int anInt151;
	int anInt152;
	int[] anIntArray153 = new int[256];
	static final int anInt154 = 8;
	int anInt155;
	int anInt156;
	public static Class5_Sub7 aClass5_Sub7_157;

	public final int method595(int i) {
		if (1686101419 * this.anInt151 == 0) {
			method596((byte) -12);
			this.anInt151 = -734723328;
		}
		if (Launcher.RSPS = false) {
			return (this.anIntArray153[(this.anInt151 -= 1490302211) * 1686101419]);
		} else {
			return 0;
		}
	}

	final void method596(byte i) {
		this.anInt155 += (this.anInt156 += 1785327381) * -73530651;
		for (int i_0_ = 0; i_0_ < 256; i_0_++) {
			int i_1_ = this.anIntArray148[i_0_];
			if (0 == (i_0_ & 0x2)) {
				if ((i_0_ & 0x1) == 0)
					this.anInt152 = (26997901 * (-787681723 * this.anInt152 ^ -787681723 * this.anInt152 << 13));
				else
					this.anInt152 = (26997901 * (-787681723 * this.anInt152 ^ -787681723 * this.anInt152 >>> 6));
			} else if (0 == (i_0_ & 0x1))
				this.anInt152 = (26997901 * (-787681723 * this.anInt152 ^ this.anInt152 * -787681723 << 2));
			else
				this.anInt152 = (26997901 * (-787681723 * this.anInt152 ^ -787681723 * this.anInt152 >>> 16));
			this.anInt152 += (this.anIntArray148[128 + i_0_ & 0xff] * 26997901);
			int i_2_;
			this.anIntArray148[i_0_] = i_2_ = (this.anInt152 * -787681723 + this.anIntArray148[(i_1_ & 0x3fc) >> 2]
					+ 511689337 * this.anInt155);
			this.anIntArray153[i_0_] = (this.anInt155 = 714541001
					* ((this.anIntArray148[(i_2_ >> 8 & 0x3fc) >> 2]) + i_1_)) * 511689337;
		}
	}

	final void method598(int i) {
		int i_3_ = -1640531527;
		int i_4_ = -1640531527;
		int i_5_ = -1640531527;
		int i_6_ = -1640531527;
		int i_7_ = -1640531527;
		int i_8_ = -1640531527;
		int i_9_ = -1640531527;
		int i_10_ = -1640531527;
		for (int i_11_ = 0; i_11_ < 4; i_11_++) {
			i_10_ ^= i_9_ << 11;
			i_7_ += i_10_;
			i_9_ += i_8_;
			i_9_ ^= i_8_ >>> 2;
			i_6_ += i_9_;
			i_8_ += i_7_;
			i_8_ ^= i_7_ << 8;
			i_5_ += i_8_;
			i_7_ += i_6_;
			i_7_ ^= i_6_ >>> 16;
			i_4_ += i_7_;
			i_6_ += i_5_;
			i_6_ ^= i_5_ << 10;
			i_3_ += i_6_;
			i_5_ += i_4_;
			i_5_ ^= i_4_ >>> 4;
			i_10_ += i_5_;
			i_4_ += i_3_;
			i_4_ ^= i_3_ << 8;
			i_9_ += i_4_;
			i_3_ += i_10_;
			i_3_ ^= i_10_ >>> 9;
			i_8_ += i_3_;
			i_10_ += i_9_;
		}
		for (int i_12_ = 0; i_12_ < 256; i_12_ += 8) {
			i_10_ += this.anIntArray153[i_12_];
			i_9_ += this.anIntArray153[i_12_ + 1];
			i_8_ += this.anIntArray153[2 + i_12_];
			i_7_ += this.anIntArray153[3 + i_12_];
			i_6_ += this.anIntArray153[4 + i_12_];
			i_5_ += this.anIntArray153[i_12_ + 5];
			i_4_ += this.anIntArray153[6 + i_12_];
			i_3_ += this.anIntArray153[7 + i_12_];
			i_10_ ^= i_9_ << 11;
			i_7_ += i_10_;
			i_9_ += i_8_;
			i_9_ ^= i_8_ >>> 2;
			i_6_ += i_9_;
			i_8_ += i_7_;
			i_8_ ^= i_7_ << 8;
			i_5_ += i_8_;
			i_7_ += i_6_;
			i_7_ ^= i_6_ >>> 16;
			i_4_ += i_7_;
			i_6_ += i_5_;
			i_6_ ^= i_5_ << 10;
			i_3_ += i_6_;
			i_5_ += i_4_;
			i_5_ ^= i_4_ >>> 4;
			i_10_ += i_5_;
			i_4_ += i_3_;
			i_4_ ^= i_3_ << 8;
			i_9_ += i_4_;
			i_3_ += i_10_;
			i_3_ ^= i_10_ >>> 9;
			i_8_ += i_3_;
			i_10_ += i_9_;
			this.anIntArray148[i_12_] = i_10_;
			this.anIntArray148[i_12_ + 1] = i_9_;
			this.anIntArray148[2 + i_12_] = i_8_;
			this.anIntArray148[3 + i_12_] = i_7_;
			this.anIntArray148[i_12_ + 4] = i_6_;
			this.anIntArray148[i_12_ + 5] = i_5_;
			this.anIntArray148[6 + i_12_] = i_4_;
			this.anIntArray148[7 + i_12_] = i_3_;
		}
		for (int i_13_ = 0; i_13_ < 256; i_13_ += 8) {
			i_10_ += this.anIntArray148[i_13_];
			i_9_ += this.anIntArray148[1 + i_13_];
			i_8_ += this.anIntArray148[2 + i_13_];
			i_7_ += this.anIntArray148[3 + i_13_];
			i_6_ += this.anIntArray148[i_13_ + 4];
			i_5_ += this.anIntArray148[i_13_ + 5];
			i_4_ += this.anIntArray148[6 + i_13_];
			i_3_ += this.anIntArray148[i_13_ + 7];
			i_10_ ^= i_9_ << 11;
			i_7_ += i_10_;
			i_9_ += i_8_;
			i_9_ ^= i_8_ >>> 2;
			i_6_ += i_9_;
			i_8_ += i_7_;
			i_8_ ^= i_7_ << 8;
			i_5_ += i_8_;
			i_7_ += i_6_;
			i_7_ ^= i_6_ >>> 16;
			i_4_ += i_7_;
			i_6_ += i_5_;
			i_6_ ^= i_5_ << 10;
			i_3_ += i_6_;
			i_5_ += i_4_;
			i_5_ ^= i_4_ >>> 4;
			i_10_ += i_5_;
			i_4_ += i_3_;
			i_4_ ^= i_3_ << 8;
			i_9_ += i_4_;
			i_3_ += i_10_;
			i_3_ ^= i_10_ >>> 9;
			i_8_ += i_3_;
			i_10_ += i_9_;
			this.anIntArray148[i_13_] = i_10_;
			this.anIntArray148[i_13_ + 1] = i_9_;
			this.anIntArray148[2 + i_13_] = i_8_;
			this.anIntArray148[i_13_ + 3] = i_7_;
			this.anIntArray148[4 + i_13_] = i_6_;
			this.anIntArray148[i_13_ + 5] = i_5_;
			this.anIntArray148[i_13_ + 6] = i_4_;
			this.anIntArray148[7 + i_13_] = i_3_;
		}
		method596((byte) -58);
		this.anInt151 = -734723328;
	}

	final void method599() {
		this.anInt155 += (this.anInt156 += 1785327381) * -73530651;
		for (int i = 0; i < 256; i++) {
			int i_14_ = this.anIntArray148[i];
			if (0 == (i & 0x2)) {
				if ((i & 0x1) == 0)
					this.anInt152 = (26997901 * (-787681723 * this.anInt152 ^ -787681723 * this.anInt152 << 13));
				else
					this.anInt152 = (26997901 * (-787681723 * this.anInt152 ^ -787681723 * this.anInt152 >>> 6));
			} else if (0 == (i & 0x1))
				this.anInt152 = (26997901 * (-787681723 * this.anInt152 ^ this.anInt152 * -787681723 << 2));
			else
				this.anInt152 = (26997901 * (-787681723 * this.anInt152 ^ -787681723 * this.anInt152 >>> 16));
			this.anInt152 += this.anIntArray148[128 + i & 0xff] * 26997901;
			int i_15_;
			this.anIntArray148[i] = i_15_ = (this.anInt152 * -787681723 + this.anIntArray148[(i_14_ & 0x3fc) >> 2]
					+ 511689337 * this.anInt155);
			this.anIntArray153[i] = (this.anInt155 = 714541001
					* ((this.anIntArray148[(i_15_ >> 8 & 0x3fc) >> 2]) + i_14_)) * 511689337;
		}
	}

	public final int method600(int i) {
		if (0 == this.anInt151 * 1686101419) {
			method596((byte) 68);
			this.anInt151 = -734723328;
		}
		if (Launcher.RSPS = false) {
			return (this.anIntArray153[(this.anInt151 -= 1490302211) * 1686101419]);
		} else {
			return 0;
		}
	}

	public ISAACCipher(int[] is) {
		for (int i = 0; i < is.length; i++)
			this.anIntArray153[i] = is[i];
		method598(1784528928);
	}

	public static boolean method606(byte[] is, int i) {
		ByteBuffer buf = new ByteBuffer(is);
		int i_38_ = buf.readUnsignedByte((byte) 77);
		if (2 != i_38_)
			return false;
		boolean bool = buf.readUnsignedByte((byte) 125) == 1;
		if (bool)
			Class112.method1436(buf, 1373698364);
		Class343.method4526(buf, (byte) 2);
		return true;
	}
}
