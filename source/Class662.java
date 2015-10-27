/* Class662 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class662
{
    static char[] aCharArray8451
	= { '\u20ac', '\0', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020',
	    '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\0',
	    '\u017d', '\0', '\0', '\u2018', '\u2019', '\u201c', '\u201d',
	    '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161',
	    '\u203a', '\u0153', '\0', '\u017e', '\u0178' };
    
    public static boolean method7875(char c) {
	if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
	    return true;
	if (c != 0) {
	    char[] cs = aCharArray8451;
	    for (int i = 0; i < cs.length; i++) {
		char c_0_ = cs[i];
		if (c_0_ == c)
		    return true;
	    }
	}
	return false;
    }
    
    public static boolean method7876(char c) {
	if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
	    return true;
	if (c != 0) {
	    char[] cs = aCharArray8451;
	    for (int i = 0; i < cs.length; i++) {
		char c_1_ = cs[i];
		if (c_1_ == c)
		    return true;
	    }
	}
	return false;
    }
    
    public static boolean method7877(char c) {
	if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
	    return true;
	if (c != 0) {
	    char[] cs = aCharArray8451;
	    for (int i = 0; i < cs.length; i++) {
		char c_2_ = cs[i];
		if (c_2_ == c)
		    return true;
	    }
	}
	return false;
    }
    
    Class662() throws Throwable {
	throw new Error();
    }
    
    public static void method7878(int i) {
	int i_3_ = 0;
	if (Class514.aClass528_Sub38_6967.aClass691_Sub2_10580
		.method9747(-2098321037)
	    == 1) {
	    i_3_ |= 0x1;
	    i_3_ |= 0x10;
	    i_3_ |= 0x20;
	    i_3_ |= 0x2;
	    i_3_ |= 0x4;
	}
	if (Class514.aClass528_Sub38_6967.aClass691_Sub12_10590
		.method9915((byte) 1)
	    == 0)
	    i_3_ |= 0x40;
	Class141_Sub1.method8287(i_3_, (byte) -61);
	client.gameScene.method5976((short) 5396)
	    .method10180(i_3_, -979551176);
	Class590.aClass488_7736.method5897(1950226709).method5976
	    ((short) 27366).method10180(i_3_, -860120601);
	Class18.aClass5_Sub13_206.method10168(i_3_, 1673058186);
	Class21.aClass5_Sub8_214.method10154(i_3_, -1794766215);
	Class2.aClass5_Sub12_24.method10161(i_3_, -2074870979);
	Class170.method2108(i_3_, -2113584061);
	Class62.method1023(i_3_, 318228607);
	Class57.method993(i_3_, -1450480934);
	Class63.method1042(i_3_, (byte) 8);
	Class541.method6621(i_3_, -1778371568);
	client.gameScene.method5989(2016078152);
    }
    
    static final void method7879(byte i) {
	if (Class309.method4127(175711435 * client.anInt10876, 2130436643)
	    || ScenePacketType.method4846(175711435 * client.anInt10876, -1241209035))
	    Class416.method4969(false, 5126206);
	else {
	    Class225.aClass551_2334
		= client.aClass109_10930.method1384((byte) 86);
	    client.aClass109_10930.method1397((short) 6672);
	    Class487.method5890(17, 2130003981);
	}
    }
    
    public static int method7880(long l) {
	return (int) (l / 86400000L) - 11745;
    }
    
    static void method7881(int i, byte i_4_) {
	int i_5_;
	if (0 == i)
	    i_5_ = 0;
	else if (1 == i)
	    i_5_ = 1;
	else if (i == 2)
	    i_5_ = 2;
	else
	    return;
	int i_6_;
	if ((double) Class518_Sub1.aFloat6991 == 2.0)
	    i_6_ = 0;
	else if (3.0 == (double) Class518_Sub1.aFloat6991)
	    i_6_ = 1;
	else if (4.0 == (double) Class518_Sub1.aFloat6991)
	    i_6_ = 2;
	else if (6.0 == (double) Class518_Sub1.aFloat6991)
	    i_6_ = 3;
	else if ((double) Class518_Sub1.aFloat6991 >= 8.0)
	    i_6_ = 4;
	else
	    return;
	Class211.aClass172_2246
	    = Class518_Sub1.aClass172ArrayArray10697[i_5_][i_6_];
	Class176.aClass1_2031
	    = Class518_Sub1.aClass1ArrayArray10693[i_5_][i_6_];
    }
    
    static final void method7882(Class229 class229, Class226 class226,
				 Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= 661123364;
	class229.anInt2399
	    = 655134359 * (((Class648) class648).anIntArray8394
			   [717927929 * ((Class648) class648).anInt8395]);
	class229.anInt2477
	    = (((Class648) class648).anIntArray8394
	       [((Class648) class648).anInt8395 * 717927929 + 1]) * -780032621;
	class229.anInt2442
	    = (((Class648) class648).anIntArray8394
	       [2 + 717927929 * ((Class648) class648).anInt8395]) * 1906362595;
	class229.anInt2443
	    = (((Class648) class648).anIntArray8394
	       [3 + ((Class648) class648).anInt8395 * 717927929]) * 1775299977;
	Class39.method811(class229, 1435904523);
    }
}
