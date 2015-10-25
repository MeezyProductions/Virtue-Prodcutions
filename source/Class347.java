/* Class347 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class347 {
	long aLong3642;
	long aLong3643 = 7456365122722254853L;
	Class688 aClass688_3644 = new Class688();
	static final int anInt3645 = 1;
	static final int anInt3646 = 3;
	static final int anInt3647 = 2;
	static final int anInt3648 = 4;
	static final int anInt3649 = 5;

	public Class347(ByteBuffer class528_sub42) {
		method4538(class528_sub42, 1029045738);
	}

	void method4538(ByteBuffer class528_sub42, int i) {
		this.aLong3642 = class528_sub42.method9633(771973092) * 8892523783754824737L;
		this.aLong3643 = class528_sub42.method9633(771973092) * -7456365122722254853L;
		for (int i_0_ = class528_sub42.readUnsignedByte((byte) 91); 0 != i_0_; i_0_ = class528_sub42
				.readUnsignedByte((byte) 121)) {
			Class528_Sub15 class528_sub15;
			if (i_0_ == 1)
				class528_sub15 = new Class528_Sub15_Sub3(this);
			else if (4 == i_0_)
				class528_sub15 = new Class528_Sub15_Sub5(this);
			else if (3 == i_0_)
				class528_sub15 = new Class528_Sub15_Sub2(this);
			else if (2 == i_0_)
				class528_sub15 = new Class528_Sub15_Sub1(this);
			else if (5 == i_0_)
				class528_sub15 = new Class528_Sub15_Sub4(this);
			else
				throw new RuntimeException("");
			class528_sub15.method9396(class528_sub42, (byte) -29);
			this.aClass688_3644.method8031(class528_sub15, (byte) -74);
		}
	}

	public void method4539(Class528_Sub36 class528_sub36, byte i) {
		if ((this.aLong3642 * 5489523823582857185L != class528_sub36.aLong7107 * -4849232331708333273L)
				|| (868653148599518003L * this.aLong3643 != (class528_sub36.aLong10500 * -9149301074877464659L)))
			throw new RuntimeException("");
		for (Class528_Sub15 class528_sub15 = ((Class528_Sub15) this.aClass688_3644
				.method8034(962286080)); null != class528_sub15; class528_sub15 = (Class528_Sub15) this.aClass688_3644
						.method8037(1500664793))
			class528_sub15.method9395(class528_sub36, -1824348893);
		class528_sub36.aLong10500 += 6691423751994405L;
	}

	void method4540(ByteBuffer class528_sub42) {
		this.aLong3642 = class528_sub42.method9633(771973092) * 8892523783754824737L;
		this.aLong3643 = class528_sub42.method9633(771973092) * -7456365122722254853L;
		for (int i = class528_sub42.readUnsignedByte((byte) 32); 0 != i; i = class528_sub42
				.readUnsignedByte((byte) 14)) {
			Class528_Sub15 class528_sub15;
			if (i == 1)
				class528_sub15 = new Class528_Sub15_Sub3(this);
			else if (4 == i)
				class528_sub15 = new Class528_Sub15_Sub5(this);
			else if (3 == i)
				class528_sub15 = new Class528_Sub15_Sub2(this);
			else if (2 == i)
				class528_sub15 = new Class528_Sub15_Sub1(this);
			else if (5 == i)
				class528_sub15 = new Class528_Sub15_Sub4(this);
			else
				throw new RuntimeException("");
			class528_sub15.method9396(class528_sub42, (byte) 48);
			this.aClass688_3644.method8031(class528_sub15, (byte) 6);
		}
	}

	static final void decodePlayerUpdate(BitBuffer buf, int i, byte i_1_) {
		GPI.maskCount = 0;
		Class256.decodeLocationUpdates(buf, -1998889697);
		Class189.decodeMaskUpdates(buf, 928310594);
		if (buf.pointer * -185904669 != i)
			throw new RuntimeException(new StringBuilder().append(buf.pointer * -185904669).append(" ")
					.append(i).toString());
	}

	static final void method4542(Class648 class648, short i) {
		int i_2_ = (class648.anIntArray8394[(class648.anInt8395 -= 1239022665) * 717927929]);
		class648.anIntArray8394[(class648.anInt8395 += 1239022665) * 717927929 - 1] = Class604.method7195(i_2_, false,
				(short) -668);
	}

	static final void method4543(Class648 class648, int i) {
		int i_3_ = (class648.anIntArray8394[(class648.anInt8395 -= 1239022665) * 717927929]);
		Class495.aClass283_Sub1_5578.method3780(i_3_, -1947999212);
	}

	static final void method4544(Class648 class648, int i) {
		Class619.method7387(11296984);
	}

	static final void method4545(Class648 class648, int i) {
		if (Class272.aClass528_Sub36_2903 != null) {
			class648.anIntArray8394[((class648.anInt8395 += 1239022665) * 717927929 - 1)] = 1;
			class648.aClass528_Sub36_8416 = Class272.aClass528_Sub36_2903;
		} else
			class648.anIntArray8394[((class648.anInt8395 += 1239022665) * 717927929 - 1)] = 0;
	}

	static boolean method4546(Class229 class229, int i) {
		Class528_Sub29 class528_sub29 = client.method10201(class229);
		if (class528_sub29.method9475(1465673692) > 0)
			return true;
		if (class528_sub29.method9478(2094248121))
			return true;
		if (null != class229.aClass229_2351)
			return true;
		return false;
	}

	static final void method4547(Class648 class648, int i) {
		client.aClass229_11067 = null;
		client.aClass229_10987 = null;
	}

	public static void method4548(int i, int i_4_) {
		ClientPacket class528_sub21_sub7 = Class79.method1146(21, i);
		class528_sub21_sub7.method10495(-2040300353);
	}

	static final String method4549(String string, String string_5_, String string_6_, int i) {
		for (int i_7_ = string.indexOf(string_5_); i_7_ != -1; i_7_ = string.indexOf(string_5_,
				i_7_ + string_6_.length()))
			string = new StringBuilder().append(string.substring(0, i_7_)).append(string_6_)
					.append(string.substring(i_7_ + string_5_.length())).toString();
		return string;
	}
}
