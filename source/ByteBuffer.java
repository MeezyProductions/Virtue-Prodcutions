
/* ByteBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class ByteBuffer extends Node {

	public byte[] payload;
	public static final int anInt10656 = 100;
	public static final int anInt10657 = 5000;
	public int pointer;
	static int[] anIntArray10659 = new int[256];
	static final int anInt10660 = -306674912;
	static final long aLong10661 = -3932672073523589310L;
	public static long[] aLongArray10662;

	public void method9606(long l) {
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (int) (l >> 56);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (int) (l >> 48);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (int) (l >> 40);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (int) (l >> 32);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (int) (l >> 24);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (int) (l >> 16);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (int) (l >> 8);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (int) l;
	}

	public ByteBuffer(byte[] is) {
		payload = is;
		pointer = 0;
	}

	public int method9607() {
		pointer += -264964202;
		int i = (((payload[pointer * -185904669 - 2] & 0xff) << 8) + (payload[-185904669 * pointer - 1] & 0xff));
		if (i > 32767)
			i -= 65536;
		return i;
	}

	public boolean method9608(int i) {
		pointer -= -529928404;
		int i_0_ = Class181_Sub16.method8969(payload, 0, pointer * -185904669, (byte) -45);
		int i_1_ = readInt(218862083);
		if (i_1_ == i_0_)
			return true;
		return false;
	}

	public void writeLEShort(int i, int i_2_) {
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) i;
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 8);
	}

	public void method9610(int i, byte i_3_) {
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 16);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 8);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) i;
	}

	public void method9611(int i, int i_4_) {
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) i;
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 8);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 16);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 24);
	}

	public int method9612(int i) {
		pointer += -264964202;
		int i_5_ = (((payload[-185904669 * pointer - 2] & 0xff) << 8)
				+ (payload[-185904669 * pointer - 1] - 128 & 0xff));
		if (i_5_ > 32767)
			i_5_ -= 65536;
		return i_5_;
	}

	public void method9613(long l) {
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (int) (l >> 40);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (int) (l >> 32);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (int) (l >> 24);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (int) (l >> 16);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (int) (l >> 8);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (int) l;
	}

	public int method9614(int i) {
		return (0 - (payload[(pointer += 2015001547) * -185904669 - 1]) & 0xff);
	}

	public void writeString(String string, int i) {
		int i_6_ = string.indexOf('\0');
		if (i_6_ >= 0)
			throw new IllegalArgumentException("");
		pointer += (Class39.method810(string, 0, string.length(), payload, pointer * -185904669, 82242276)
				* 2015001547);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) 0;
	}

	public void method9616(String string, int i) {
		int i_7_ = string.indexOf('\0');
		if (i_7_ >= 0)
			throw new IllegalArgumentException("");
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) 0;
		pointer += (Class39.method810(string, 0, string.length(), payload, -185904669 * pointer, 82242276)
				* 2015001547);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) 0;
	}

	public void method9617(CharSequence charsequence, int i) {
		int i_8_ = RSAKeys.method1069(charsequence, 1257726460);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) 0;
		method9624(i_8_, 1251282432);
		pointer += Class276.method3710(payload, -185904669 * pointer, charsequence, (short) 1846) * 2015001547;
	}

	public void method9618(byte[] is, int i, int i_9_, int i_10_) {
		for (int i_11_ = i; i_11_ < i_9_ + i; i_11_++)
			payload[(pointer += 2015001547) * -185904669 - 1] = is[i_11_];
	}

	public void method9619(ByteBuffer class528_sub42_12_, byte i) {
		method9618(class528_sub42_12_.payload, 0, class528_sub42_12_.pointer * -185904669, -720481750);
	}

	public void method9620(int i, int i_13_) {
		if (i < 0 || i > 65535)
			throw new IllegalArgumentException();
		payload[pointer * -185904669 - i - 2] = (byte) (i >> 8);
		payload[pointer * -185904669 - i - 1] = (byte) i;
	}

	public void method9621(int i, int i_14_) {
		if (i < 64 && i >= -64)
			writeByte(64 + i, (byte) -5);
		else if (i < 16384 && i >= -16384)
			method9717(i + 49152, (byte) -62);
		else
			throw new IllegalArgumentException();
	}

	public void method9622(int i, int i_15_) {
		if (i >= 0 && i < 128)
			writeByte(i, (byte) 97);
		else if (i >= 0 && i < 32768)
			method9717(i + 32768, (byte) 30);
		else
			throw new IllegalArgumentException();
	}

	public void method9623(int i, int i_16_) {
		if (i < -1)
			throw new IllegalArgumentException();
		if (i == -1)
			method9717(32767, (byte) 15);
		else if (i < 32767)
			method9717(i, (byte) 27);
		else {
			writeInt(i, 2041541501);
			payload[pointer * -185904669 - 4] |= 0x80;
		}
	}

	void method9624(int i, int i_17_) {
		if ((i & ~0x7f) != 0) {
			if (0 != (i & ~0x3fff)) {
				if ((i & ~0x1fffff) != 0) {
					if ((i & ~0xfffffff) != 0)
						writeByte(i >>> 28 | 0x80, (byte) -54);
					writeByte(i >>> 21 | 0x80, (byte) -22);
				}
				writeByte(i >>> 14 | 0x80, (byte) -78);
			}
			writeByte(i >>> 7 | 0x80, (byte) -16);
		}
		writeByte(i & 0x7f, (byte) 115);
	}

	public int readUnsignedByte(byte i) {
		return (payload[(pointer += 2015001547) * -185904669 - 1] & 0xff);
	}

	public int readUnsignedShort(int i) {
		pointer += -264964202;
		return (((payload[pointer * -185904669 - 2] & 0xff) << 8) + (payload[pointer * -185904669 - 1] & 0xff));
	}

	public byte method9627(int i) {
		return payload[(pointer += 2015001547) * -185904669 - 1];
	}

	public void method9628(int i) {
		if (i >= 0 && i < 128)
			writeByte(i, (byte) 7);
		else if (i >= 0 && i < 32768)
			method9717(i + 32768, (byte) -105);
		else
			throw new IllegalArgumentException();
	}

	public int method9629(int i) {
		pointer += 1750037345;
		int i_18_ = (((payload[pointer * -185904669 - 2] & 0xff) << 8)
				+ ((payload[-185904669 * pointer - 3] & 0xff) << 16) + (payload[-185904669 * pointer - 1] & 0xff));
		if (i_18_ > 8388607)
			i_18_ -= 16777216;
		return i_18_;
	}

	public int readInt(int i) {
		pointer += -529928404;
		return ((payload[-185904669 * pointer - 1] & 0xff) + (((payload[-185904669 * pointer - 2] & 0xff) << 8)
				+ (((payload[-185904669 * pointer - 3] & 0xff) << 16)
						+ ((payload[pointer * -185904669 - 4] & 0xff) << 24))));
	}

	public int method9631(int i) {
		pointer += -529928404;
		return (((payload[-185904669 * pointer - 3] & 0xff) << 8)
				+ (((payload[-185904669 * pointer - 1] & 0xff) << 24)
						+ ((payload[-185904669 * pointer - 2] & 0xff) << 16))
				+ (payload[-185904669 * pointer - 4] & 0xff));
	}

	public void method9632(byte i) {
		if (payload != null)
			Class663.method7885(payload, -1436946802);
		payload = null;
	}

	public long method9633(int i) {
		long l = readInt(-1276027690) & 0xffffffffL;
		long l_19_ = readInt(1040921716) & 0xffffffffL;
		return l_19_ + (l << 32);
	}

	public long method9634(int i, int i_20_) {
		if (--i < 0 || i > 7)
			throw new IllegalArgumentException();
		int i_21_ = i * 8;
		long l = 0L;
		for (/**/; i_21_ >= 0; i_21_ -= 8)
			l |= ((payload[(pointer += 2015001547) * -185904669 - 1]) & 0xffL) << i_21_;
		return l;
	}

	public float method9635(int i) {
		return Float.intBitsToFloat(readInt(412124282));
	}

	public String readString(int i) {
		int i_22_ = -185904669 * pointer;
		while (payload[(pointer += 2015001547) * -185904669 - 1] != 0) {
			/* empty */
		}
		int i_23_ = pointer * -185904669 - i_22_ - 1;
		if (0 == i_23_)
			return "";
		return Class593.method7084(payload, i_22_, i_23_, (byte) 76);
	}

	public String method9637(byte i) {
		byte i_24_ = payload[(pointer += 2015001547) * -185904669 - 1];
		if (0 != i_24_)
			throw new IllegalStateException("");
		int i_25_ = -185904669 * pointer;
		while (payload[(pointer += 2015001547) * -185904669 - 1] != 0) {
			/* empty */
		}
		int i_26_ = pointer * -185904669 - i_25_ - 1;
		if (i_26_ == 0)
			return "";
		return Class593.method7084(payload, i_25_, i_26_, (byte) 11);
	}

	public String method9638(int i) {
		byte i_27_ = payload[(pointer += 2015001547) * -185904669 - 1];
		if (0 != i_27_)
			throw new IllegalStateException("");
		int i_28_ = method9646(821615303);
		if (i_28_ + -185904669 * pointer > payload.length)
			throw new IllegalStateException("");
		String string = Class217.method3077(payload, pointer * -185904669, i_28_, 733678765);
		pointer += i_28_ * 2015001547;
		return string;
	}

	public void method9639(int i) {
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 16);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 8);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) i;
	}

	public int method9640(int i) {
		int i_29_ = payload[-185904669 * pointer] & 0xff;
		if (i_29_ < 128)
			return readUnsignedByte((byte) 2) - 64;
		return readUnsignedShort(286932421) - 49152;
	}

	public int method9641(int i) {
		pointer += 1750037345;
		return ((payload[pointer * -185904669 - 1] & 0xff) + (((payload[-185904669 * pointer - 3] & 0xff) << 8)
				+ ((payload[pointer * -185904669 - 2] & 0xff) << 16)));
	}

	public int method9642(int i) {
		pointer += -264964202;
		int i_30_ = (((payload[pointer * -185904669 - 2] & 0xff) << 8) + (payload[-185904669 * pointer - 1] & 0xff));
		if (i_30_ > 32767)
			i_30_ -= 65536;
		return i_30_;
	}

	public int method9643(int i) {
		int i_31_ = 0;
		int i_32_;
		for (i_32_ = method9719(65280); i_32_ == 32767; i_32_ = method9719(65280))
			i_31_ += 32767;
		i_31_ += i_32_;
		return i_31_;
	}

	public void writeByte(int i, byte i_33_) {
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) i;
	}

	public int method9645(short i) {
		if (payload[-185904669 * pointer] < 0)
			return readInt(413786753) & 0x7fffffff;
		int i_34_ = readUnsignedShort(608907107);
		if (32767 == i_34_)
			return -1;
		return i_34_;
	}

	int method9646(int i) {
		int i_35_ = payload[(pointer += 2015001547) * -185904669 - 1];
		int i_36_ = 0;
		for (/**/; i_35_ < 0; i_35_ = (payload[(pointer += 2015001547) * -185904669 - 1]))
			i_36_ = (i_36_ | i_35_ & 0x7f) << 7;
		return i_36_ | i_35_;
	}

	public void method9647(int[] is, int i) {
		int i_37_ = pointer * -185904669 / 8;
		pointer = 0;
		for (int i_38_ = 0; i_38_ < i_37_; i_38_++) {
			int i_39_ = readInt(-272983446);
			int i_40_ = readInt(-165492109);
			int i_41_ = 0;
			int i_42_ = -1640531527;
			int i_43_ = 32;
			while (i_43_-- > 0) {
				i_39_ += ((i_40_ << 4 ^ i_40_ >>> 5) + i_40_ ^ i_41_ + is[i_41_ & 0x3]);
				i_41_ += i_42_;
				i_40_ += ((i_39_ << 4 ^ i_39_ >>> 5) + i_39_ ^ i_41_ + is[i_41_ >>> 11 & 0x3]);
			}
			pointer -= -1059856808;
			writeInt(i_39_, 2033112141);
			writeInt(i_40_, 2107325762);
		}
	}

	public void method9648(int[] is, int i) {
		int i_44_ = pointer * -185904669 / 8;
		pointer = 0;
		for (int i_45_ = 0; i_45_ < i_44_; i_45_++) {
			int i_46_ = readInt(817190477);
			int i_47_ = readInt(-2093653351);
			int i_48_ = -957401312;
			int i_49_ = -1640531527;
			int i_50_ = 32;
			while (i_50_-- > 0) {
				i_47_ -= (i_46_ + (i_46_ << 4 ^ i_46_ >>> 5) ^ i_48_ + is[i_48_ >>> 11 & 0x3]);
				i_48_ -= i_49_;
				i_46_ -= (i_47_ + (i_47_ << 4 ^ i_47_ >>> 5) ^ is[i_48_ & 0x3] + i_48_);
			}
			pointer -= -1059856808;
			writeInt(i_46_, 2078409142);
			writeInt(i_47_, 2102549217);
		}
	}

	public void method9649(int[] is, int i, int i_51_, int i_52_) {
		int i_53_ = -185904669 * pointer;
		pointer = i * 2015001547;
		int i_54_ = (i_51_ - i) / 8;
		for (int i_55_ = 0; i_55_ < i_54_; i_55_++) {
			int i_56_ = readInt(907059182);
			int i_57_ = readInt(917500146);
			int i_58_ = -957401312;
			int i_59_ = -1640531527;
			int i_60_ = 32;
			while (i_60_-- > 0) {
				i_57_ -= ((i_56_ << 4 ^ i_56_ >>> 5) + i_56_ ^ i_58_ + is[i_58_ >>> 11 & 0x3]);
				i_58_ -= i_59_;
				i_56_ -= (i_57_ + (i_57_ << 4 ^ i_57_ >>> 5) ^ is[i_58_ & 0x3] + i_58_);
			}
			pointer -= -1059856808;
			writeInt(i_56_, 2107738197);
			writeInt(i_57_, 2076612808);
		}
		pointer = i_53_ * 2015001547;
	}

	public void method9650(BigInteger biginteger, BigInteger biginteger_61_, int i) {
		int i_62_ = pointer * -185904669;
		pointer = 0;
		byte[] is = new byte[i_62_];
		method9718(is, 0, i_62_, -1456124512);
		BigInteger biginteger_63_ = new BigInteger(is);
		BigInteger biginteger_64_ = biginteger_63_.modPow(biginteger, biginteger_61_);
		byte[] is_65_ = biginteger_64_.toByteArray();
		pointer = 0;
		method9717(is_65_.length, (byte) 34);
		method9618(is_65_, 0, is_65_.length, 568429170);
	}

	public int addCRC(int i, int i_66_) {
		int i_67_ = Class181_Sub16.method8969(payload, i, pointer * -185904669, (byte) 57);
		writeInt(i_67_, 2107580919);
		return i_67_;
	}

	public void method9652(int i, byte i_68_) {
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (128 + i);
	}

	public void writeByteC(int i, int i_69_) {
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (0 - i);
	}

	public void method9654(int i, int i_70_) {
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (128 - i);
	}

	public int readUnsignedA(byte i) {
		return ((payload[(pointer += 2015001547) * -185904669 - 1] - 128) & 0xff);
	}

	public int readUnsignedS(int i) {
		return (128 - (payload[(pointer += 2015001547) * -185904669 - 1]) & 0xff);
	}

	public byte method9657(byte i) {
		return (byte) ((payload[(pointer += 2015001547) * -185904669 - 1]) - 128);
	}

	public byte readSignedC(int i) {
		return (byte) (0 - (payload[(pointer += 2015001547) * -185904669 - 1]));
	}

	public byte readSignedS(int i) {
		return (byte) (128 - (payload[(pointer += 2015001547) * -185904669 - 1]));
	}

	public void method9660(int i, int i_71_) {
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) i;
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 8);
	}

	public void method9661(int i, int i_72_) {
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 8);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i + 128);
	}

	public void method9662(int i, byte i_73_) {
		if (i < 0 || i > 255)
			throw new IllegalArgumentException();
		payload[-185904669 * pointer - i - 1] = (byte) i;
	}

	public int readUnsignedShort(short i) {
		pointer += -264964202;
		return ((payload[pointer * -185904669 - 2] & 0xff) + ((payload[pointer * -185904669 - 1] & 0xff) << 8));
	}

	public int readShortA(byte i) {
		pointer += -264964202;
		return (((payload[pointer * -185904669 - 2] & 0xff) << 8) + (payload[-185904669 * pointer - 1] - 128 & 0xff));
	}

	public int readLEShortA(int i) {
		pointer += -264964202;
		return (((payload[pointer * -185904669 - 1] & 0xff) << 8) + (payload[-185904669 * pointer - 2] - 128 & 0xff));
	}

	public int readShort(byte i) {
		pointer += -264964202;
		int i_74_ = ((payload[pointer * -185904669 - 2] & 0xff) + ((payload[-185904669 * pointer - 1] & 0xff) << 8));
		if (i_74_ > 32767)
			i_74_ -= 65536;
		return i_74_;
	}

	public void method9667(byte[] is, int i, int i_75_, int i_76_) {
		for (int i_77_ = i; i_77_ < i + i_75_; i_77_++)
			is[i_77_] = (byte) ((payload[(pointer += 2015001547) * -185904669 - 1]) - 128);
	}

	public int method9668(int i) {
		pointer += -264964202;
		int i_78_ = (((payload[-185904669 * pointer - 1] & 0xff) << 8)
				+ (payload[pointer * -185904669 - 2] - 128 & 0xff));
		if (i_78_ > 32767)
			i_78_ -= 65536;
		return i_78_;
	}

	public void method9669(int i, int i_79_) {
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 8);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 16);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) i;
	}

	public void method9670() {
		if (payload != null)
			Class663.method7885(payload, 930589734);
		payload = null;
	}

	public void method9671(int i, int i_80_) {
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) i;
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 8);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 16);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 24);
	}

	public void writeMiddleInt(int i, byte i_81_) {
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 8);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) i;
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 24);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 16);
	}

	public void method9673(int i, int i_82_) {
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 16);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 24);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) i;
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 8);
	}

	public int method9674() {
		pointer += -264964202;
		int i = (((payload[pointer * -185904669 - 2] & 0xff) << 8) + (payload[-185904669 * pointer - 1] & 0xff));
		if (i > 32767)
			i -= 65536;
		return i;
	}

	public int method9675(int i) {
		pointer += -529928404;
		return (((payload[-185904669 * pointer - 2] & 0xff) << 24) + ((payload[pointer * -185904669 - 1] & 0xff) << 16)
				+ ((payload[pointer * -185904669 - 4] & 0xff) << 8) + (payload[-185904669 * pointer - 3] & 0xff));
	}

	public int readIntB(int i) {
		pointer += -529928404;
		return (((payload[-185904669 * pointer - 1] & 0xff) << 8)
				+ (((payload[-185904669 * pointer - 4] & 0xff) << 16)
						+ ((payload[-185904669 * pointer - 3] & 0xff) << 24))
				+ (payload[pointer * -185904669 - 2] & 0xff));
	}

	public void method9677(byte[] is, int i, int i_83_, byte i_84_) {
		for (int i_85_ = i + i_83_ - 1; i_85_ >= i; i_85_--)
			is[i_85_] = payload[(pointer += 2015001547) * -185904669 - 1];
	}

	public int method9678() {
		return (payload[(pointer += 2015001547) * -185904669 - 1] & 0xff);
	}

	static {
		for (int i = 0; i < 256; i++) {
			int i_86_ = i;
			for (int i_87_ = 0; i_87_ < 8; i_87_++) {
				if ((i_86_ & 0x1) == 1)
					i_86_ = i_86_ >>> 1 ^ ~0x12477cdf;
				else
					i_86_ >>>= 1;
			}
			anIntArray10659[i] = i_86_;
		}
		aLongArray10662 = new long[256];
		for (int i = 0; i < 256; i++) {
			long l = i;
			for (int i_88_ = 0; i_88_ < 8; i_88_++) {
				if ((l & 0x1L) == 1L)
					l = l >>> 1 ^ ~0x3693a86a2878f0bdL;
				else
					l >>>= 1;
			}
			aLongArray10662[i] = l;
		}
	}

	public ByteBuffer(int i) {
		payload = Class663.method7884(i, 1449297656);
		pointer = 0;
	}

	public void method9679() {
		if (payload != null)
			Class663.method7885(payload, 318491678);
		payload = null;
	}

	public int readLEInt(short i) {
		pointer += -529928404;
		return (((payload[pointer * -185904669 - 3] & 0xff) << 8)
				+ (((payload[-185904669 * pointer - 1] & 0xff) << 24)
						+ ((payload[-185904669 * pointer - 2] & 0xff) << 16))
				+ (payload[pointer * -185904669 - 4] & 0xff));
	}

	public void method9681(int i) {
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 16);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 8);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) i;
	}

	public int method9682() {
		pointer += 1750037345;
		int i = (((payload[pointer * -185904669 - 2] & 0xff) << 8) + ((payload[-185904669 * pointer - 3] & 0xff) << 16)
				+ (payload[-185904669 * pointer - 1] & 0xff));
		if (i > 8388607)
			i -= 16777216;
		return i;
	}

	public String method9684(byte i) {
		if (payload[-185904669 * pointer] == 0) {
			pointer += 2015001547;
			return null;
		}
		return readString(-46457573);
	}

	public void method9685(int i) {
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) i;
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 8);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 16);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 24);
	}

	public void method9686(int i) {
		if (i < 0 || i > 255)
			throw new IllegalArgumentException();
		payload[-185904669 * pointer - i - 1] = (byte) i;
	}

	public void method9687(int i) {
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 16);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 24);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) i;
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 8);
	}

	public boolean method9688() {
		pointer -= -529928404;
		int i = Class181_Sub16.method8969(payload, 0, pointer * -185904669, (byte) -45);
		int i_89_ = readInt(-2084092594);
		if (i_89_ == i)
			return true;
		return false;
	}

	public void method9689() {
		if (payload != null)
			Class663.method7885(payload, 556324687);
		payload = null;
	}

	public void method9690(String string) {
		int i = string.indexOf('\0');
		if (i >= 0)
			throw new IllegalArgumentException("");
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) 0;
		pointer += (Class39.method810(string, 0, string.length(), payload, -185904669 * pointer, 82242276)
				* 2015001547);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) 0;
	}

	public void method9691(long l, int i, int i_90_) {
		if (--i < 0 || i > 7)
			throw new IllegalArgumentException();
		for (int i_91_ = 8 * i; i_91_ >= 0; i_91_ -= 8)
			payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (int) (l >> i_91_);
	}

	public void method9692(int i) {
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 16);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 8);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) i;
	}

	public void method9693(int i) {
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (0 - i);
	}

	public ByteBuffer(int i, boolean bool) {
		payload = Class663.method7883(i, bool, 1239022665);
	}

	void method9697(int i) {
		if ((i & ~0x7f) != 0) {
			if (0 != (i & ~0x3fff)) {
				if ((i & ~0x1fffff) != 0) {
					if ((i & ~0xfffffff) != 0)
						writeByte(i >>> 28 | 0x80, (byte) 15);
					writeByte(i >>> 21 | 0x80, (byte) 30);
				}
				writeByte(i >>> 14 | 0x80, (byte) 26);
			}
			writeByte(i >>> 7 | 0x80, (byte) 87);
		}
		writeByte(i & 0x7f, (byte) -28);
	}

	public void method9698(int i) {
		if (i < 64 && i >= -64)
			writeByte(64 + i, (byte) 9);
		else if (i < 16384 && i >= -16384)
			method9717(i + 49152, (byte) -23);
		else
			throw new IllegalArgumentException();
	}

	public void method9699(int i) {
		if (i >= 0 && i < 128)
			writeByte(i, (byte) -19);
		else if (i >= 0 && i < 32768)
			method9717(i + 32768, (byte) -11);
		else
			throw new IllegalArgumentException();
	}

	void method9700(int i) {
		if ((i & ~0x7f) != 0) {
			if (0 != (i & ~0x3fff)) {
				if ((i & ~0x1fffff) != 0) {
					if ((i & ~0xfffffff) != 0)
						writeByte(i >>> 28 | 0x80, (byte) 35);
					writeByte(i >>> 21 | 0x80, (byte) 28);
				}
				writeByte(i >>> 14 | 0x80, (byte) 16);
			}
			writeByte(i >>> 7 | 0x80, (byte) -37);
		}
		writeByte(i & 0x7f, (byte) -38);
	}

	void method9701(int i) {
		if ((i & ~0x7f) != 0) {
			if (0 != (i & ~0x3fff)) {
				if ((i & ~0x1fffff) != 0) {
					if ((i & ~0xfffffff) != 0)
						writeByte(i >>> 28 | 0x80, (byte) -14);
					writeByte(i >>> 21 | 0x80, (byte) 0);
				}
				writeByte(i >>> 14 | 0x80, (byte) -26);
			}
			writeByte(i >>> 7 | 0x80, (byte) -5);
		}
		writeByte(i & 0x7f, (byte) 30);
	}

	public int readTriByte(int i) {
		pointer += 1750037345;
		return ((payload[pointer * -185904669 - 1] & 0xff) + (((payload[pointer * -185904669 - 2] & 0xff) << 8)
				+ ((payload[-185904669 * pointer - 3] & 0xff) << 16)));
	}

	public int method9703() {
		pointer += -264964202;
		return (((payload[pointer * -185904669 - 2] & 0xff) << 8) + (payload[pointer * -185904669 - 1] & 0xff));
	}

	public int method9704() {
		pointer += -264964202;
		int i = (((payload[pointer * -185904669 - 2] & 0xff) << 8) + (payload[-185904669 * pointer - 1] & 0xff));
		if (i > 32767)
			i -= 65536;
		return i;
	}

	public void method9705(int[] is, int i, int i_92_, int i_93_) {
		int i_94_ = pointer * -185904669;
		pointer = i * 2015001547;
		int i_95_ = (i_92_ - i) / 8;
		for (int i_96_ = 0; i_96_ < i_95_; i_96_++) {
			int i_97_ = readInt(480721424);
			int i_98_ = readInt(-1675056454);
			int i_99_ = 0;
			int i_100_ = -1640531527;
			int i_101_ = 32;
			while (i_101_-- > 0) {
				i_97_ += ((i_98_ << 4 ^ i_98_ >>> 5) + i_98_ ^ i_99_ + is[i_99_ & 0x3]);
				i_99_ += i_100_;
				i_98_ += (i_97_ + (i_97_ << 4 ^ i_97_ >>> 5) ^ is[i_99_ >>> 11 & 0x3] + i_99_);
			}
			pointer -= -1059856808;
			writeInt(i_97_, 2131718972);
			writeInt(i_98_, 2098122025);
		}
		pointer = 2015001547 * i_94_;
	}

	public void method9706(int i) {
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 8);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i + 128);
	}

	public int method9707() {
		pointer += 1750037345;
		return ((payload[pointer * -185904669 - 1] & 0xff) + (((payload[pointer * -185904669 - 2] & 0xff) << 8)
				+ ((payload[-185904669 * pointer - 3] & 0xff) << 16)));
	}

	public int method9708() {
		pointer += 1750037345;
		int i = (((payload[pointer * -185904669 - 2] & 0xff) << 8) + ((payload[-185904669 * pointer - 3] & 0xff) << 16)
				+ (payload[-185904669 * pointer - 1] & 0xff));
		if (i > 8388607)
			i -= 16777216;
		return i;
	}

	public int method9709() {
		pointer += -264964202;
		return (((payload[pointer * -185904669 - 2] & 0xff) << 8) + (payload[pointer * -185904669 - 1] & 0xff));
	}

	public int method9710() {
		if (payload[-185904669 * pointer] < 0)
			return readInt(-983181357) & 0x7fffffff;
		int i = readUnsignedShort(529530705);
		if (32767 == i)
			return -1;
		return i;
	}

	public int method9711() {
		if (payload[-185904669 * pointer] < 0)
			return readInt(-1702747457) & 0x7fffffff;
		int i = readUnsignedShort(-696323320);
		if (32767 == i)
			return -1;
		return i;
	}

	public int method9712() {
		if (payload[-185904669 * pointer] < 0)
			return readInt(-1981144718) & 0x7fffffff;
		int i = readUnsignedShort(-485377150);
		if (32767 == i)
			return -1;
		return i;
	}

	int method9713() {
		int i = payload[(pointer += 2015001547) * -185904669 - 1];
		int i_102_ = 0;
		for (/**/; i < 0; i = payload[(pointer += 2015001547) * -185904669 - 1])
			i_102_ = (i_102_ | i & 0x7f) << 7;
		return i_102_ | i;
	}

	public long method9714(int i) {
		long l = readUnsignedByte((byte) 10) & 0xffffffffL;
		long l_103_ = readInt(-1853729520) & 0xffffffffL;
		return l_103_ + (l << 32);
	}

	public void method9715(long l) {
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (int) (l >> 32);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (int) (l >> 24);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (int) (l >> 16);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (int) (l >> 8);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (int) l;
	}

	public boolean method9716() {
		pointer -= -529928404;
		int i = Class181_Sub16.method8969(payload, 0, pointer * -185904669, (byte) 34);
		int i_104_ = readInt(-2013600015);
		if (i_104_ == i)
			return true;
		return false;
	}

	public void method9717(int i, byte i_105_) {
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 8);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) i;
	}

	public void method9718(byte[] is, int i, int i_106_, int i_107_) {
		for (int i_108_ = i; i_108_ < i + i_106_; i_108_++)
			is[i_108_] = payload[(pointer += 2015001547) * -185904669 - 1];
	}

	public int method9719(int i) {
		int i_109_ = payload[pointer * -185904669] & 0xff;
		if (i_109_ < 128)
			return readUnsignedByte((byte) 51);
		return readUnsignedShort(-1203083257) - 32768;
	}

	public void method9720(int i) {
		if (i < 64 && i >= -64)
			writeByte(64 + i, (byte) 21);
		else if (i < 16384 && i >= -16384)
			method9717(i + 49152, (byte) -17);
		else
			throw new IllegalArgumentException();
	}

	public void writeInt(int i, int i_110_) {
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 24);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 16);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 8);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) i;
	}

	public int method9722(int i) {
		if (payload[-185904669 * pointer] < 0)
			return readInt(782704977) & 0x7fffffff;
		return readUnsignedShort(796050775);
	}

	public long method9723(int i) {
		long l = readUnsignedShort(-1139183263) & 0xffffffffL;
		long l_111_ = readInt(-1453265034) & 0xffffffffL;
		return l_111_ + (l << 32);
	}

	public int method9725(int i) {
		int i_112_ = payload[pointer * -185904669] & 0xff;
		if (i_112_ < 128)
			return readUnsignedByte((byte) 94) - 1;
		return readUnsignedShort(-827787975) - 32769;
	}

	public void writeLEShortA(int i, int i_113_) {
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (128 + i);
		payload[(pointer += 2015001547) * -185904669 - 1] = (byte) (i >> 8);
	}

	static final void method9728(Class648 class648, int i) {
		int i_114_ = (class648.anIntArray8394[(class648.anInt8395 -= 1239022665) * 717927929]);
		if (client.anInt11158 * 1234694097 == 2 && i_114_ < client.anInt11157 * -1314218023)
			class648.anIntArray8394[((class648.anInt8395 += 1239022665) * 717927929
					- 1)] = client.aClass62Array11160[i_114_].aBool719 ? 1 : 0;
		else
			class648.anIntArray8394[((class648.anInt8395 += 1239022665) * 717927929 - 1)] = 0;
	}

	static final void method9729(Class229 class229, int i, int i_115_, Class648 class648, byte i_116_) {
		if (class229.anIntArray2537 == null) {
			if (i_115_ > 0) {
				class229.aByteArrayArray2464 = new byte[11][];
				class229.aByteArrayArray2465 = new byte[11][];
				class229.anIntArray2466 = new int[11];
				class229.anIntArray2467 = new int[11];
				class229.anIntArray2537 = new int[11];
			} else
				return;
		}
		class229.anIntArray2537[i] = i_115_;
		if (i_115_ > 0)
			class229.aBool2507 = true;
		else {
			class229.aBool2507 = false;
			for (int i_117_ = 0; i_117_ < class229.aByteArrayArray2464.length; i_117_++) {
				if (null != class229.aByteArrayArray2464[i_117_] || class229.anIntArray2537[i_117_] > 0) {
					class229.aBool2507 = true;
					break;
				}
			}
		}
	}
}
