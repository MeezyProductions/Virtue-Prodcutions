/* Class533 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class533
{
    public int[] anIntArray7129;
    public int anInt7130;
    public int[] anIntArray7131;
    public static int anInt7132;
    public static Class5_Sub9 aClass5_Sub9_7133;
    
    public Class533(int i) {
	anInt7130 = i * -597705371;
	anIntArray7129 = new int[anInt7130 * -595383187];
	anIntArray7131 = new int[anInt7130 * -595383187];
    }
    
    public static boolean method6485(int i, byte i_0_) {
	if (-1989891609 * Class185.anInt2116 != i
	    || Class688.aClass187_8658 == null) {
	    Class602_Sub1.method9587(-1149346664);
	    Class688.aClass187_8658 = Class187.aClass187_2126;
	    Class185.anInt2116 = -218342953 * i;
	}
	if (Class187.aClass187_2126 == Class688.aClass187_8658) {
	    byte[] is = Class481.aClass446_5461.method5395(i, -1929131921);
	    if (null == is)
		return false;
	    ByteBuffer class528_sub42 = new ByteBuffer(is);
	    Class306_Sub2.method9070(class528_sub42, -870726466);
	    int i_1_ = class528_sub42.readUnsignedByte((byte) 68);
	    for (int i_2_ = 0; i_2_ < i_1_; i_2_++)
		Class185.aClass688_2110
		    .method8031(new Class528_Sub35(class528_sub42), (byte) 55);
	    int i_3_ = class528_sub42.method9719(65280);
	    Class185.aClass179Array2105 = new Class179[i_3_];
	    for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
		Class185.aClass179Array2105[i_4_]
		    = new Class179(class528_sub42);
	    int i_5_ = class528_sub42.method9719(65280);
	    Class185.aClass182Array2106 = new Class182[i_5_];
	    for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
		Class185.aClass182Array2106[i_6_]
		    = new Class182(class528_sub42, i_6_);
	    int i_7_ = class528_sub42.method9719(65280);
	    OutputStream_Sub1.aClass195Array10839 = new Class195[i_7_];
	    for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
		OutputStream_Sub1.aClass195Array10839[i_8_]
		    = new Class195(class528_sub42);
	    int i_9_ = class528_sub42.method9719(65280);
	    Class185.aClass194Array2107 = new Class194[i_9_];
	    for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
		Class185.aClass194Array2107[i_10_]
		    = new Class194(class528_sub42);
	    int i_11_ = class528_sub42.method9719(65280);
	    Class667.aClass181Array8487 = new Class181[i_11_];
	    for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
		Class667.aClass181Array8487[i_12_]
		    = Class443.method5322(class528_sub42, 779547913);
	    Class688.aClass187_8658 = Class187.aClass187_2124;
	}
	if (Class688.aClass187_8658 == Class187.aClass187_2124) {
	    boolean bool = true;
	    Class182[] class182s = Class185.aClass182Array2106;
	    for (int i_13_ = 0; i_13_ < class182s.length; i_13_++) {
		Class182 class182 = class182s[i_13_];
		if (!class182.method2690(1213609446))
		    bool = false;
	    }
	    Class181[] class181s = Class667.aClass181Array8487;
	    for (int i_14_ = 0; i_14_ < class181s.length; i_14_++) {
		Class181 class181 = class181s[i_14_];
		if (!class181.method2677((byte) 43))
		    bool = false;
	    }
	    Class195[] class195s = OutputStream_Sub1.aClass195Array10839;
	    for (int i_15_ = 0; i_15_ < class195s.length; i_15_++) {
		Class195 class195 = class195s[i_15_];
		if (!class195.method2815((byte) 49))
		    bool = false;
	    }
	    if (!bool)
		return false;
	    Class688.aClass187_8658 = Class187.aClass187_2125;
	}
	return true;
    }
    
    public static Class585[] method6486(int i) {
	return (new Class585[]
		{ Class585.aClass585_7703, Class585.aClass585_7702,
		  Class585.aClass585_7701 });
    }
    
    static final void method6487(Class648 class648, int i) {
	int i_16_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_16_, (byte) 10);
	Class608.method7239(class229, class648, 894637116);
    }
    
    static final void method6488(Class648 class648, int i) {
	Class492 class492 = ((Class648) class648)
				.aClass645_Sub1_Sub5_Sub1_8389
				.method10680(110283351);
	if (null == class492)
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
	else
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= class492.method5934((byte) 6);
    }
    
    public static final void method6489(int i, int i_17_) {
	for (int i_18_ = 0; i_18_ < 5; i_18_++)
	    client.aBoolArray11139[i_18_] = false;
	client.anInt11065 = -681116073;
	client.anInt10988 = 159441195;
	Class215.anInt2272 = 0;
	Class480.anInt5455 = 0;
	Class386.anInt4069 = 1476949137;
	Class690_Sub2.anInt10780 = 1603116895;
	Class390.anInt4111 = 1043416901 * i;
	if (Class390.anInt4111 * -1860881523 != 6)
	    Class452.aLong4974 = 0L;
    }
    
    static final void method6490(Class648 class648, byte i) {
	int i_19_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if (2 == client.anInt11158 * 1234694097
	    && i_19_ < -1314218023 * client.anInt11157)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= client.aClass62Array11160[i_19_].aBool718 ? 1 : 0;
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
    }
}
