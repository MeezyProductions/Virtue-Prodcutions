
/* ModeWhere - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashSet;
import java.util.Set;

public class ModeWhere implements IClientEnum {
	static ModeWhere aClass665_8461;
	public static ModeWhere aClass665_8462;
	Set aSet8463;
	public static ModeWhere aClass665_8464;
	public static ModeWhere aClass665_8465;
	static ModeWhere aClass665_8466;
	static ModeWhere aClass665_8467;
	public static ModeWhere aClass665_8468;
	public static ModeWhere aClass665_8469;
	public static ModeWhere aClass665_8470;
	static ModeWhere aClass665_8471;
	static ModeWhere aClass665_8472;
	public static ModeWhere LIVE = new ModeWhere("", 0, new Class667[] { Class667.aClass667_8484 });
	int anInt8474;
	static Class683[] aClass683Array8475;

	ModeWhere(String string, int i) {
		this.aSet8463 = new HashSet();
		this.anInt8474 = -2003759977 * i;
	}

	@Override
	public int method68() {
		return this.anInt8474 * -1033686233;
	}

	public boolean method7892(Class667 class667, int i) {
		return this.aSet8463.contains(class667);
	}

	static {
		aClass665_8462 = new ModeWhere("", 1, new Class667[] { Class667.aClass667_8485, Class667.aClass667_8484 });
		aClass665_8468 = new ModeWhere("", 2, new Class667[] { Class667.aClass667_8485, Class667.aClass667_8486 });
		aClass665_8464 = new ModeWhere("", 3, new Class667[] { Class667.aClass667_8485 });
		aClass665_8465 = new ModeWhere("", 4);
		aClass665_8469 = new ModeWhere("", 5, new Class667[] { Class667.aClass667_8485, Class667.aClass667_8484 });
		aClass665_8467 = new ModeWhere("", 6, new Class667[] { Class667.aClass667_8484 });
		aClass665_8466 = new ModeWhere("", 8, new Class667[] { Class667.aClass667_8485, Class667.aClass667_8484 });
		aClass665_8461 = new ModeWhere("", 9, new Class667[] { Class667.aClass667_8485, Class667.aClass667_8486 });
		aClass665_8470 = new ModeWhere("", 10, new Class667[] { Class667.aClass667_8485 });
		aClass665_8471 = new ModeWhere("", 11, new Class667[] { Class667.aClass667_8485 });
		aClass665_8472 = new ModeWhere("", 12, new Class667[] { Class667.aClass667_8485, Class667.aClass667_8484 });
		method7893(-1769854575);
	}

	public static ModeWhere[] method7893(int i) {
		return (new ModeWhere[] { aClass665_8469, aClass665_8467, aClass665_8468, LIVE, aClass665_8461, aClass665_8464,
				aClass665_8466, aClass665_8471, aClass665_8470, aClass665_8472, aClass665_8465, aClass665_8462 });
	}

	ModeWhere(String string, int i, Class667[] class667s) {
		this.aSet8463 = new HashSet();
		this.anInt8474 = i * -2003759977;
		Class667[] class667s_0_ = class667s;
		for (int i_1_ = 0; i_1_ < class667s_0_.length; i_1_++) {
			Class667 class667 = class667s_0_[i_1_];
			this.aSet8463.add(class667);
		}
	}

	public static boolean method7894(char c, int i) {
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
			return true;
		if (c != 0) {
			char[] cs = Class662.aCharArray8451;
			for (int i_2_ = 0; i_2_ < cs.length; i_2_++) {
				char c_3_ = cs[i_2_];
				if (c_3_ == c)
					return true;
			}
		}
		return false;
	}

	static void method7895(int i, byte i_4_) {
		/* empty */
	}

	static final void method7896(Class528_Sub39 class528_sub39, int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_,
			int i_10_, int i_11_, int i_12_, int i_13_) {
		if (Class256.method3468(i, null, (byte) 0)) {
			if (class528_sub39 != null && !class528_sub39.method9579(-70120523))
				Class279.method3735(class528_sub39, true, false, -1392396155);
			else {
				Class226 class226 = Class380.aClass226Array3970[i];
				client.method10192(class226, class226.method3175(1903162306), -1, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_,
						i_11_, i_12_);
			}
		}
	}

	static void method7897(int i) {
		Class544_Sub1.anIntArray10644[44] = 71;
		Class544_Sub1.anIntArray10644[45] = 26;
		Class544_Sub1.anIntArray10644[46] = 72;
		Class544_Sub1.anIntArray10644[47] = 73;
		Class544_Sub1.anIntArray10644[59] = 57;
		Class544_Sub1.anIntArray10644[61] = 27;
		Class544_Sub1.anIntArray10644[91] = 42;
		Class544_Sub1.anIntArray10644[92] = 74;
		Class544_Sub1.anIntArray10644[93] = 43;
		Class544_Sub1.anIntArray10644[192] = 28;
		Class544_Sub1.anIntArray10644[222] = 58;
		Class544_Sub1.anIntArray10644[520] = 59;
	}

	public static void method7898(int i, int i_14_, String string, String string_15_, String string_16_,
			String string_17_, Class384 class384, int i_18_) {
		Class227.method3182(i, i_14_, string, string_15_, string_16_, string_17_, null, -1, class384, -1345460943);
	}
}
