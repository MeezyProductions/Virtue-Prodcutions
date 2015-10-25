/* VarDefinition - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class VarDefinition implements Interface11 {
	
	int anInt3411;
	Class313 aClass313_3412;
	int anInt3413 = -747526987;
	int anInt3414;
	public Class142 aClass142_3415;
	String aString3416;
	VarDomainType aClass445_3417;
	public int anInt3418;
	static int[] anIntArray3419 = new int[32];

	public void method58(ByteBuffer class528_sub42, byte i) {
		method4129(class528_sub42, false, -568994331);
	}

	void method4129(ByteBuffer class528_sub42, boolean bool, int i) {
		for (;;) {
			int i_0_ = class528_sub42.readUnsignedByte((byte) 50);
			if (0 == i_0_)
				break;
			method4130(class528_sub42, i_0_, bool, 815292610);
		}
	}

	public void method61(int i) {
		/* empty */
	}

	void method4130(ByteBuffer class528_sub42, int i, boolean bool, int i_1_) {
		Class312 class312 = (Class312) Class443.method5321(Class307.method4075((byte) 16), i, 2092769693);
		switch (-1227471267 * ((Class312) class312).anInt3438) {
		case 0:
			((VarDefinition) this).anInt3414 = class528_sub42.readUnsignedByte((byte) 115) * 1330550991;
			((VarDefinition) this).anInt3411 = class528_sub42.readUnsignedByte((byte) 115) * 573479105;
			break;
		default:
			break;
		case 11:
			break;
		case 4: {
			int i_2_ = class528_sub42.readUnsignedByte((byte) 100);
			((VarDefinition) this).aClass445_3417 = (VarDomainType) Class443.method5321(VarDomainType.method5330(65280),
					i_2_, 1562621365);
			if (null == ((VarDefinition) this).aClass445_3417)
				throw new IllegalStateException("");
			((VarDefinition) this).anInt3413 = class528_sub42.method9645((short) -5866) * 747526987;
			if (null != ((VarDefinition) this).aClass313_3412) {
				Interface12 interface12 = ((Interface12) ((Class313) ((VarDefinition) this).aClass313_3412).aMap3441
						.get(((VarDefinition) this).aClass445_3417));
				if (interface12 != null)
					aClass142_3415 = ((Class142) interface12.method63(1990645347 * (((VarDefinition) this).anInt3413),
							438668055));
				else if (!bool)
					throw new IllegalStateException("");
			}
		}
		}
	}

	public int method4131(int i, int i_3_) {
		int i_4_ = anIntArray3419[(2114582337 * ((VarDefinition) this).anInt3411
				- 2126999087 * ((VarDefinition) this).anInt3414)];
		return i >> ((VarDefinition) this).anInt3414 * 2126999087 & i_4_;
	}

	public void method59() {
		/* empty */
	}

	VarDefinition(int i, Class313 class313) {
		anInt3418 = i * 796348793;
		((VarDefinition) this).aClass313_3412 = class313;
	}

	public void method57(ByteBuffer class528_sub42) {
		method4129(class528_sub42, false, -476795897);
	}

	public void method60(ByteBuffer class528_sub42) {
		method4129(class528_sub42, false, 446409818);
	}

	public int method4132(int i, int i_5_, int i_6_) throws Exception_Sub3 {
		int i_7_ = anIntArray3419[(((VarDefinition) this).anInt3411 * 2114582337
				- ((VarDefinition) this).anInt3414 * 2126999087)];
		if (i_5_ < 0 || i_5_ > i_7_)
			throw new Exception_Sub3((((VarDefinition) this).aString3416 != null ? ((VarDefinition) this).aString3416
					: Integer.toString(-723564343 * anInt3418)), i_5_, i_7_);
		i_7_ <<= 2126999087 * ((VarDefinition) this).anInt3414;
		return (i & (i_7_ ^ 0xffffffff) | i_5_ << ((VarDefinition) this).anInt3414 * 2126999087 & i_7_);
	}

	static {
		int i = 2;
		for (int i_8_ = 0; i_8_ < 32; i_8_++) {
			anIntArray3419[i_8_] = i - 1;
			i += i;
		}
	}

	public int method4133(int i) {
		int i_9_ = anIntArray3419[(2114582337 * ((VarDefinition) this).anInt3411
				- 2126999087 * ((VarDefinition) this).anInt3414)];
		return i >> ((VarDefinition) this).anInt3414 * 2126999087 & i_9_;
	}

	static final void method4134(Class229 class229, Class226 class226, Class648 class648, int i) {
		int i_10_ = ((((Class648) class648).anIntArray8394[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
				- 1);
		if (i_10_ < 0 || i_10_ > 9)
			((Class648) class648).anInt8410 -= 1600226731;
		else
			class229.method3196(i_10_,
					(String) (((Class648) class648).anObjectArray8396[(((Class648) class648).anInt8410 -= 1600226731)
							* -520794877]),
					1920507187);
	}

	static void method4135(Class528_Sub21_Sub11 class528_sub21_sub11, int i) {
		if (!Class28.aBool273) {
			class528_sub21_sub11.method6443(50832917);
			Class28.anInt303 -= -1480717263;
			if (!((Class528_Sub21_Sub11) class528_sub21_sub11).aBool11594) {
				long l = (((Class528_Sub21_Sub11) class528_sub21_sub11).aLong11587 * 5093272884019756687L);
				Class528_Sub21_Sub5 class528_sub21_sub5;
				for (class528_sub21_sub5 = ((Class528_Sub21_Sub5) Class28.aClass692_275
						.method8137(l)); (null != class528_sub21_sub5
								&& !(((Class528_Sub21_Sub5) class528_sub21_sub5).aString11536
										.equals(((Class528_Sub21_Sub11) class528_sub21_sub11).aString11596))); class528_sub21_sub5 = ((Class528_Sub21_Sub5) Class28.aClass692_275
												.method8143((short) 255))) {
					/* empty */
				}
				if (null != class528_sub21_sub5 && class528_sub21_sub5.method10481(class528_sub21_sub11, -1695189918))
					Class377.method4702(class528_sub21_sub5, (byte) -1);
			} else {
				for (Class528_Sub21_Sub5 class528_sub21_sub5 = ((Class528_Sub21_Sub5) Class28.aClass679_276.method7960(
						-1550587110)); null != class528_sub21_sub5; class528_sub21_sub5 = ((Class528_Sub21_Sub5) Class28.aClass679_276
								.method7969(1101714996))) {
					if (((Class528_Sub21_Sub5) class528_sub21_sub5).aString11536
							.equals(((Class528_Sub21_Sub11) class528_sub21_sub11).aString11596)) {
						boolean bool = false;
						for (Class528_Sub21_Sub11 class528_sub21_sub11_11_ = ((Class528_Sub21_Sub11) ((Class528_Sub21_Sub5) class528_sub21_sub5).aClass679_11535
								.method7960(
										-1550587110)); null != class528_sub21_sub11_11_; class528_sub21_sub11_11_ = ((Class528_Sub21_Sub11) ((Class528_Sub21_Sub5) class528_sub21_sub5).aClass679_11535
												.method7969(697930199))) {
							if (class528_sub21_sub11 == class528_sub21_sub11_11_) {
								if (class528_sub21_sub5.method10481(class528_sub21_sub11, 1377380978))
									Class377.method4702(class528_sub21_sub5, (byte) -1);
								bool = true;
								break;
							}
						}
						if (bool)
							break;
					}
				}
			}
		}
	}

	static final void method4136(Class648 class648, int i) {
		((Class648) class648).anInt8395 -= -577899301;
		int i_12_ = (((Class648) class648).anIntArray8394[((Class648) class648).anInt8395 * 717927929]);
		int i_13_ = (((Class648) class648).anIntArray8394[((Class648) class648).anInt8395 * 717927929 + 1]);
		int i_14_ = (((Class648) class648).anIntArray8394[2 + ((Class648) class648).anInt8395 * 717927929]);
		if (i_13_ == -1)
			throw new RuntimeException();
		Class7 class7 = ((Class7) Class551.aClass5_Sub17_7422.method63(i_13_, -2124910847));
		if (class7.aClass459_129.method68() != i_12_)
			throw new RuntimeException();
		int[] is = class7.method548(Integer.valueOf(i_14_), (byte) -64);
		int i_15_ = 0;
		if (is != null)
			i_15_ = is.length;
		((Class648) class648).anIntArray8394[(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1] = i_15_;
	}

	public static final void method4137(byte i) {
		if (!client.aBool10979) {
			client.aFloat10976 += (24.0F - client.aFloat10976) / 2.0F;
			client.aBool10982 = true;
			client.aBool10979 = true;
		}
	}

	public static final Class528_Sub39 method4138(int i, Class528_Sub39 class528_sub39, int[] is, boolean bool,
			int i_16_) {
		Class528_Sub39 class528_sub39_17_ = (Class528_Sub39) client.aClass692_11097.method8137((long) i);
		if (class528_sub39_17_ != null)
			Class279.method3735(class528_sub39_17_,
					(905908359 * class528_sub39.anInt10625 != 905908359 * class528_sub39_17_.anInt10625), bool,
					-1020373120);
		client.aClass692_11097.method8142(class528_sub39, (long) i);
		Class204.method2911(class528_sub39.anInt10625 * 905908359, is, -1064038366);
		Class229 class229 = Class623_Sub1.method9755(i, (byte) -21);
		if (null != class229)
			Class39.method811(class229, 1435904523);
		if (null != client.aClass229_11059) {
			Class39.method811(client.aClass229_11059, 1435904523);
			client.aClass229_11059 = null;
		}
		if (class229 != null)
			Class423.method5110((Class380.aClass226Array3970[class229.anInt2376 * 306930455 >>> 16]), class229, !bool,
					-2128419395);
		if (!bool)
			Class576.method6894(class528_sub39.anInt10625 * 905908359, is, -1273372110);
		if (!bool && 2088127151 * client.anInt10978 != -1)
			Class539.method6616(2088127151 * client.anInt10978, 1, (byte) -7);
		return class528_sub39;
	}

	static final void method4139(Class648 class648, byte i) {
		int i_18_ = (((Class648) class648).anIntArray8394[(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
		((Class648) class648).anIntArray8394[(((Class648) class648).anInt8395 += 1239022665) * 717927929
				- 1] = client.aClass217_11028.method3071(i_18_, -1044156953).method2880(-1291660051);
	}
}
