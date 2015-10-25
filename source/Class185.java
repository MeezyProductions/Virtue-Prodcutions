/* Class185 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class185
{
    static short aShort2104;
    static Class179[] aClass179Array2105;
    public static Class182[] aClass182Array2106;
    static Class194[] aClass194Array2107;
    static int anInt2108;
    static int anInt2109;
    public static Class688 aClass688_2110 = new Class688();
    static int anInt2111;
    static boolean aBool2112;
    static short aShort2113;
    public static Class692 aClass692_2114 = new Class692(32);
    static int anInt2115 = -1280156381;
    static int anInt2116;
    public static IMultiVarValueReader anInterface18_2117;
    
    public static void method2713() {
	aShort2113 = client.aShort10969;
	Class528_Sub32.aShort10470 = client.aShort11151;
	Class439.aShort4892 = client.aShort11148;
	aShort2104 = client.aShort11149;
	aBool2112 = true;
	anInt2109 = Class365.aClass218_3848.method3137(-576160319) * 899454783;
	if (-362364141 * anInt2111 != 0 && 0 != 1805115301 * anInt2108) {
	    client.aShort11148 = (short) 334;
	    client.aShort11149 = (short) 334;
	    client.aShort11151 = client.aShort10969
		= (short) (anInt2111 * -846846464 / (1805115301 * anInt2108));
	}
    }
    
    static {
	anInt2108 = 0;
	anInt2111 = 0;
	aBool2112 = false;
	anInt2109 = -899454783;
	anInt2116 = 218342953;
	anInterface18_2117 = new Class197();
    }
    
    public static boolean method2714(int i) {
	if (-1989891609 * anInt2116 != i || Class688.aClass187_8658 == null) {
	    Class602_Sub1.method9587(913589119);
	    Class688.aClass187_8658 = Class187.aClass187_2126;
	    anInt2116 = -218342953 * i;
	}
	if (Class187.aClass187_2126 == Class688.aClass187_8658) {
	    byte[] is = Class481.aClass446_5461.method5395(i, -1569398075);
	    if (null == is)
		return false;
	    ByteBuffer class528_sub42 = new ByteBuffer(is);
	    Class306_Sub2.method9070(class528_sub42, 1579492759);
	    int i_0_ = class528_sub42.readUnsignedByte((byte) 109);
	    for (int i_1_ = 0; i_1_ < i_0_; i_1_++)
		aClass688_2110.method8031(new Class528_Sub35(class528_sub42),
					  (byte) -27);
	    int i_2_ = class528_sub42.method9719(65280);
	    aClass179Array2105 = new Class179[i_2_];
	    for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
		aClass179Array2105[i_3_] = new Class179(class528_sub42);
	    int i_4_ = class528_sub42.method9719(65280);
	    aClass182Array2106 = new Class182[i_4_];
	    for (int i_5_ = 0; i_5_ < i_4_; i_5_++)
		aClass182Array2106[i_5_] = new Class182(class528_sub42, i_5_);
	    int i_6_ = class528_sub42.method9719(65280);
	    OutputStream_Sub1.aClass195Array10839 = new Class195[i_6_];
	    for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
		OutputStream_Sub1.aClass195Array10839[i_7_]
		    = new Class195(class528_sub42);
	    int i_8_ = class528_sub42.method9719(65280);
	    aClass194Array2107 = new Class194[i_8_];
	    for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
		aClass194Array2107[i_9_] = new Class194(class528_sub42);
	    int i_10_ = class528_sub42.method9719(65280);
	    Class667.aClass181Array8487 = new Class181[i_10_];
	    for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
		Class667.aClass181Array8487[i_11_]
		    = Class443.method5322(class528_sub42, 1228188150);
	    Class688.aClass187_8658 = Class187.aClass187_2124;
	}
	if (Class688.aClass187_8658 == Class187.aClass187_2124) {
	    boolean bool = true;
	    Class182[] class182s = aClass182Array2106;
	    for (int i_12_ = 0; i_12_ < class182s.length; i_12_++) {
		Class182 class182 = class182s[i_12_];
		if (!class182.method2690(419566538))
		    bool = false;
	    }
	    Class181[] class181s = Class667.aClass181Array8487;
	    for (int i_13_ = 0; i_13_ < class181s.length; i_13_++) {
		Class181 class181 = class181s[i_13_];
		if (!class181.method2677((byte) 110))
		    bool = false;
	    }
	    Class195[] class195s = OutputStream_Sub1.aClass195Array10839;
	    for (int i_14_ = 0; i_14_ < class195s.length; i_14_++) {
		Class195 class195 = class195s[i_14_];
		if (!class195.method2815((byte) 10))
		    bool = false;
	    }
	    if (!bool)
		return false;
	    Class688.aClass187_8658 = Class187.aClass187_2125;
	}
	return true;
    }
    
    public static void method2715(boolean bool) {
	if (2 != 345087519 * client.anInt10943
	    && client.anInt10943 * 345087519 != 4) {
	    if (!bool) {
		if (null != Class667.aClass181Array8487) {
		    Class181[] class181s = Class667.aClass181Array8487;
		    for (int i = 0; i < class181s.length; i++) {
			Class181 class181 = class181s[i];
			class181.method2676((byte) -116);
		    }
		}
		if (-1 != anInt2109 * 1509087423)
		    Class365.aClass218_3848.method3109(1509087423 * anInt2109,
						       255, (byte) 111);
	    }
	    client.anInt10943 = -1659585602;
	    Class487.aClass528_Sub42_5493 = null;
	    client.aBool10944 = false;
	    if (anInt2116 * -1989891609 > 0)
		Class504.method6119(Cs2Context.aClass561_7527,
				    anInt2116 * -1989891609, -1, -1199359668);
	    Class602_Sub1.method9587(-984992669);
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4508,
				      client.aClass109_10930.aClass10_1379,
				      -1893608322);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeByte(bool ? 1 : 0,
								 (byte) -8);
	    client.aClass109_10930.method1380(class528_sub34, 2015335846);
	}
    }
    
    public static void method2716() {
	aShort2113 = client.aShort10969;
	Class528_Sub32.aShort10470 = client.aShort11151;
	Class439.aShort4892 = client.aShort11148;
	aShort2104 = client.aShort11149;
	aBool2112 = true;
	anInt2109 = Class365.aClass218_3848.method3137(-556542333) * 899454783;
	if (-362364141 * anInt2111 != 0 && 0 != 1805115301 * anInt2108) {
	    client.aShort11148 = (short) 334;
	    client.aShort11149 = (short) 334;
	    client.aShort11151 = client.aShort10969
		= (short) (anInt2111 * -846846464 / (1805115301 * anInt2108));
	}
    }
    
    public static void method2717() {
	aClass692_2114.method8141(2047235667);
	aClass688_2110.method8059((byte) -115);
	aClass179Array2105 = null;
	aClass182Array2106 = null;
	OutputStream_Sub1.aClass195Array10839 = null;
	aClass194Array2107 = null;
	Class667.aClass181Array8487 = null;
	anInt2115 = -1280156381;
	anInt2108 = 0;
	anInt2111 = 0;
	Class688.aClass187_8658 = null;
	anInt2116 = 218342953;
	anInt2109 = -899454783;
	if (aBool2112) {
	    client.aShort10969 = aShort2113;
	    client.aShort11151 = Class528_Sub32.aShort10470;
	    client.aShort11148 = Class439.aShort4892;
	    client.aShort11149 = aShort2104;
	    aBool2112 = false;
	}
    }
    
    public static void method2718() {
	aClass692_2114.method8141(2110214069);
	aClass688_2110.method8059((byte) -119);
	aClass179Array2105 = null;
	aClass182Array2106 = null;
	OutputStream_Sub1.aClass195Array10839 = null;
	aClass194Array2107 = null;
	Class667.aClass181Array8487 = null;
	anInt2115 = -1280156381;
	anInt2108 = 0;
	anInt2111 = 0;
	Class688.aClass187_8658 = null;
	anInt2116 = 218342953;
	anInt2109 = -899454783;
	if (aBool2112) {
	    client.aShort10969 = aShort2113;
	    client.aShort11151 = Class528_Sub32.aShort10470;
	    client.aShort11148 = Class439.aShort4892;
	    client.aShort11149 = aShort2104;
	    aBool2112 = false;
	}
    }
    
    Class185() throws Throwable {
	throw new Error();
    }
    
    static void method2719(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 4);
	    switch (i) {
	    case 255:
		return;
	    case 0:
		anInt2108
		    = class528_sub42.readUnsignedShort(-560886393) * -1868042195;
		anInt2111 = class528_sub42.readUnsignedShort(-1163268532) * 728858395;
	    }
	}
    }
    
    public static int method2720(byte i) {
	return Canvas_Sub1.aTwitchTV11693.GetLoginState();
    }
    
    public static final int method2721(int i, int i_15_, int i_16_) {
	if (-1 == i)
	    return 12345678;
	i_15_ = (i & 0x7f) * i_15_ >> 7;
	if (i_15_ < 2)
	    i_15_ = 2;
	else if (i_15_ > 126)
	    i_15_ = 126;
	return i_15_ + (i & 0xff80);
    }
    
    static final void method2722(Class648 class648, short i) {
	if (Class474.aClass699_5429 == null)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -1;
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 1269576623 * Class474.aClass699_5429.anInt8731;
    }
    
    static final void method2723(Class648 class648, short i) {
	int i_17_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class570.playerVarsProvider.method1249(i_17_, 414978679);
    }
    
    static final void method2724(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class527.method6433(class229, class226, class648, 717927929);
    }
}
