
/* Class570 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.LinkedList;

public class Class570 {
	static LinkedList aLinkedList7556 = new LinkedList();
	public static PlayerVarsProvider playerVarsProvider;
	static int anInt7558;

	Class570() throws Throwable {
		throw new Error();
	}

	public static void method6850() {
		if ((175711435 * client.anInt10876 == 9 || 175711435 * client.anInt10876 == 1)
				&& null != client.aClass109_10930) {
			for (;;) {
				Interface63 interface63 = (Interface63) aLinkedList7556.poll();
				if (interface63 == null)
					break;
				interface63.method309(2025153661);
			}
		}
	}

	public static void method6851(int i, int i_0_, int i_1_) {
		Class275.method3706(new Class26_Sub1(i, i_0_, i_1_, 2081643045 * client.anInt11135,
				Class700.aClass454_8734.anInt4992 * -1174576079, 1918248281 * Class700.aClass454_8734.anInt4993,
				Class700.aClass454_8734.method5463(-486502254), Class700.aClass454_8734.method5462(1219233696),
				Class557.aClass455_7466.method5506(-64816371)), (byte) -94);
	}

	public static void method6852() {
		if ((175711435 * client.anInt10876 == 9 || 175711435 * client.anInt10876 == 1)
				&& null != client.aClass109_10930) {
			for (;;) {
				Interface63 interface63 = (Interface63) aLinkedList7556.poll();
				if (interface63 == null)
					break;
				interface63.method309(1326949401);
			}
		}
	}

	public static void method6853(Cs2Context cs2Context, int i, int i_2_, Class671 class671,
			Class645_Sub1_Sub2_Sub1 class645_sub1_sub2_sub1, byte i_3_) {
		Class648 class648 = Class528_Sub15_Sub1.method10454((byte) 10);
		class648.aClass645_Sub1_Sub2_Sub1_8409 = class645_sub1_sub2_sub1;
		Class5_Sub7.method10151(cs2Context, i, i_2_, class648, 512152076);
		class648.aClass645_Sub1_Sub2_Sub1_8409 = null;
	}

	static final void method6854(Class648 class648, int i) {
		int i_4_ = (class648.anIntArray8394[(class648.anInt8395 -= 1239022665) * 717927929]);
		Class229 class229 = Class623_Sub1.method9755(i_4_, (byte) -76);
		Class226 class226 = Class380.aClass226Array3970[i_4_ >> 16];
		Class560.method6817(class229, class226, class648,
				((Class272.aClass528_Sub36_2903 == class648.aClass528_Sub36_8416) ? Class227.aClass227_2342
						: Class227.aClass227_2339),
				(byte) 10);
	}

	static final void method6855(Class648 class648, int i) {
		String string = (String) (class648.anObjectArray8396[(class648.anInt8410 -= 1600226731) * -520794877]);
		Class160.method2066(string, (byte) 78);
	}

	public static void method6856(int i) {
		if (client.anInt10876 * 175711435 == 14) {
			Class528_Sub34 class528_sub34 = Class656.method7845(OutgoingOpcode.aClass403_4487,
					client.aClass109_11162.aClass10_1379, -2130320196);
			client.aClass109_11162.method1380(class528_sub34, 1243141095);
			Class75.aClass689_790 = Class689.aClass689_8660;
			Class43.aString529 = null;
		}
	}

	static final void method6857(Class648 class648, int i) {
		class648.anIntArray8394[(class648.anInt8395 += 1239022665) * 717927929
				- 1] = Class514.aClass528_Sub38_6967.aClass691_Sub11_10603.method9909(2115594320) == 1 ? 1 : 0;
	}
}
