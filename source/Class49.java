/* Class49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class49
{
    static String aString549;
    static String aString550 = "true";
    static String aString551;
    static String aString552;
    static String aString553;
    public static String aString554;
    public static String aString555 = ",";
    
    static {
	aString551 = " (";
	aString552 = ")";
	aString553 = "->";
	aString554 = "<br>";
	aString549 = "</col>";
    }
    
    public static String method883(int i) {
	return new StringBuilder().append("<img=").append(i).append(">")
		   .toString();
    }
    
    Class49() throws Throwable {
	throw new Error();
    }
    
    public static String method884(int i) {
	return new StringBuilder().append("<img=").append(i).append(">")
		   .toString();
    }
    
    public static String method885(int i) {
	return new StringBuilder().append("<col=").append
		   (Integer.toHexString(i)).append
		   (">").toString();
    }
    
    static void method886(byte i) {
	if (-986761059 * Class509.anInt6958 > 1)
	    Class514.aClass528_Sub38_6967.method9556((Class514
						      .aClass528_Sub38_6967
						      .aClass691_Sub32_10598),
						     4, 1092867569);
	else
	    Class514.aClass528_Sub38_6967.method9556((Class514
						      .aClass528_Sub38_6967
						      .aClass691_Sub32_10598),
						     2, 773078324);
    }
    
    static final void method887(Class648 class648, byte i) {
	Class528_Sub19 class528_sub19
	    = (Class528_Sub19) (((Class648) class648).anObjectArray8396
				[(((Class648) class648).anInt8410
				  -= 1600226731) * -520794877]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class528_sub19.anInt10394 * 1385495327;
    }
    
    static final void method888(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -577899301;
	int i_0_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_1_ = (((Class648) class648).anIntArray8394
		    [1 + 717927929 * ((Class648) class648).anInt8395]);
	int i_2_ = (((Class648) class648).anIntArray8394
		    [2 + ((Class648) class648).anInt8395 * 717927929]);
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	if (-1 == i_1_)
	    throw new RuntimeException();
	Class7 class7
	    = (Class7) Class551.aClass5_Sub17_7422.method63(i_1_, 2094589595);
	if (class7.aClass459_131.method68() != i_0_)
	    throw new RuntimeException();
	if (class7.aClass459_129.method68()
	    != Class459.aClass459_5132.method68())
	    throw new RuntimeException();
	int[] is = class7.method548(string, (byte) -5);
	if (i_2_ < 0 || null == is || is.length <= i_2_)
	    throw new RuntimeException();
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = is[i_2_];
    }
    
    static final void method889(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_3_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395]);
	int i_4_ = (((Class648) class648).anIntArray8394
		    [1 + 717927929 * ((Class648) class648).anInt8395]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = i_4_ * i_3_;
    }
    
    static final void method890(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	client.aShort11144
	    = (short) (((Class648) class648).anIntArray8394
		       [717927929 * ((Class648) class648).anInt8395]);
	if (client.aShort11144 <= 0)
	    client.aShort11144 = (short) 256;
	client.aShort11085
	    = (short) (((Class648) class648).anIntArray8394
		       [717927929 * ((Class648) class648).anInt8395 + 1]);
	if (client.aShort11085 <= 0)
	    client.aShort11085 = (short) 205;
    }
    
    public static Class528_Sub19 method891(int i, int i_5_, int i_6_, int i_7_,
					   int i_8_) {
	synchronized (Class528_Sub19.aClass528_Sub19Array10395) {
	    if (0 == 817159537 * Class528_Sub19.anInt10391) {
		Class528_Sub19 class528_sub19
		    = new Class528_Sub19(i, i_5_, i_6_, i_7_);
		return class528_sub19;
	    }
	    Class528_Sub19.aClass528_Sub19Array10395
		[(Class528_Sub19.anInt10391 -= 1748648849) * 817159537]
		.method9410(i, i_5_, i_6_, i_7_, 1548571606);
	    Class528_Sub19 class528_sub19
		= (Class528_Sub19.aClass528_Sub19Array10395
		   [Class528_Sub19.anInt10391 * 817159537]);
	    return class528_sub19;
	}
    }
}
