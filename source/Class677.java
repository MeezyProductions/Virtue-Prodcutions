/* Class677 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class677
{
    static char[] aCharArray8552 = new char[64];
    static char[] aCharArray8553;
    static char[] aCharArray8554;
    static int[] anIntArray8555;
    static Class446 aClass446_8556;
    
    static {
	for (int i = 0; i < 26; i++)
	    aCharArray8552[i] = (char) (65 + i);
	for (int i = 26; i < 52; i++)
	    aCharArray8552[i] = (char) (i + 97 - 26);
	for (int i = 52; i < 62; i++)
	    aCharArray8552[i] = (char) (48 + i - 52);
	aCharArray8552[62] = '+';
	aCharArray8552[63] = '/';
	aCharArray8554 = new char[64];
	for (int i = 0; i < 26; i++)
	    aCharArray8554[i] = (char) (i + 65);
	for (int i = 26; i < 52; i++)
	    aCharArray8554[i] = (char) (97 + i - 26);
	for (int i = 52; i < 62; i++)
	    aCharArray8554[i] = (char) (48 + i - 52);
	aCharArray8554[62] = '*';
	aCharArray8554[63] = '-';
	aCharArray8553 = new char[64];
	for (int i = 0; i < 26; i++)
	    aCharArray8553[i] = (char) (65 + i);
	for (int i = 26; i < 52; i++)
	    aCharArray8553[i] = (char) (97 + i - 26);
	for (int i = 52; i < 62; i++)
	    aCharArray8553[i] = (char) (48 + i - 52);
	aCharArray8553[62] = '-';
	aCharArray8553[63] = '_';
	anIntArray8555 = new int[128];
	for (int i = 0; i < anIntArray8555.length; i++)
	    anIntArray8555[i] = -1;
	for (int i = 65; i <= 90; i++)
	    anIntArray8555[i] = i - 65;
	for (int i = 97; i <= 122; i++)
	    anIntArray8555[i] = 26 + (i - 97);
	for (int i = 48; i <= 57; i++)
	    anIntArray8555[i] = 52 + (i - 48);
	int[] is = anIntArray8555;
	anIntArray8555[43] = 62;
	is[42] = 62;
	int[] is_0_ = anIntArray8555;
	anIntArray8555[47] = 63;
	is_0_[45] = 63;
    }
    
    static String method7950(byte[] is, int i, int i_1_) {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i_2_ = i; i_2_ < i + i_1_; i_2_ += 3) {
	    int i_3_ = is[i_2_] & 0xff;
	    stringbuilder.append(aCharArray8552[i_3_ >>> 2]);
	    if (i_2_ < i_1_ - 1) {
		int i_4_ = is[1 + i_2_] & 0xff;
		stringbuilder
		    .append(aCharArray8552[(i_3_ & 0x3) << 4 | i_4_ >>> 4]);
		if (i_2_ < i_1_ - 2) {
		    int i_5_ = is[i_2_ + 2] & 0xff;
		    stringbuilder.append
			(aCharArray8552[(i_4_ & 0xf) << 2 | i_5_ >>> 6])
			.append(aCharArray8552[i_5_ & 0x3f]);
		} else
		    stringbuilder.append(aCharArray8552[(i_4_ & 0xf) << 2])
			.append('=');
	    } else
		stringbuilder.append(aCharArray8552[(i_3_ & 0x3) << 4]).append
		    ('=').append('=');
	}
	return stringbuilder.toString();
    }
    
    Class677() throws Throwable {
	throw new Error();
    }
    
    static String method7951(byte[] is, int i, int i_6_) {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i_7_ = i; i_7_ < i + i_6_; i_7_ += 3) {
	    int i_8_ = is[i_7_] & 0xff;
	    stringbuilder.append(aCharArray8552[i_8_ >>> 2]);
	    if (i_7_ < i_6_ - 1) {
		int i_9_ = is[1 + i_7_] & 0xff;
		stringbuilder
		    .append(aCharArray8552[(i_8_ & 0x3) << 4 | i_9_ >>> 4]);
		if (i_7_ < i_6_ - 2) {
		    int i_10_ = is[i_7_ + 2] & 0xff;
		    stringbuilder.append
			(aCharArray8552[(i_9_ & 0xf) << 2 | i_10_ >>> 6])
			.append(aCharArray8552[i_10_ & 0x3f]);
		} else
		    stringbuilder.append(aCharArray8552[(i_9_ & 0xf) << 2])
			.append('=');
	    } else
		stringbuilder.append(aCharArray8552[(i_8_ & 0x3) << 4]).append
		    ('=').append('=');
	}
	return stringbuilder.toString();
    }
    
    static final void method7952(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub7_10589
		  .method9873((short) 5777) == 1 ? 1 : 0;
    }
    
    static void method7953(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [717927929 * ((Class648) class648).anInt8395 - 1]
	    = ((Class256)
	       (Class669.aClass25_Sub1_8522.method63
		((((Class648) class648).anIntArray8394
		  [717927929 * ((Class648) class648).anInt8395 - 1]),
		 -80996582))).anInt2811 * -1684413835;
    }
    
    static final void method7954(Class648 class648, int i) {
	int i_11_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class570.playerVarsProvider.method1240(i_11_, 814732558);
    }
    
    static boolean method7955(int i) {
	return Class71.aBool776;
    }
    
    static final void method7956(Class648 class648, int i) {
	boolean bool
	    = ((((Class648) class648).anIntArray8394
		[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	       != 0);
	if (Class108.myPlayer.model
	    != null)
	    Class108.myPlayer.model
		.method7272(bool, -1889466470);
    }
}
