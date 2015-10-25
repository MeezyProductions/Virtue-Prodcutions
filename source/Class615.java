/* Class615 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class615
{
    public static final int anInt8011 = 3;
    public static final int anInt8012 = 1;
    public static final int anInt8013 = 2;
    public static final int anInt8014 = 3;
    public static final int anInt8015 = 0;
    public static final int anInt8016 = 0;
    public static final int anInt8017 = 2;
    public int anInt8018;
    public int anInt8019;
    public int anInt8020;
    public static final int anInt8021 = 1;
    static final int anInt8022 = 100;
    public int anInt8023;
    public static final int anInt8024 = 4;
    public int anInt8025;
    public static final int anInt8026 = 5;
    public int anInt8027;
    public int anInt8028;
    static final int anInt8029 = 3;
    public int[][] anIntArrayArray8030 = new int[3][5];
    
    void method7347(ByteBuffer class528_sub42, byte i) {
	for (;;) {
	    int i_0_ = class528_sub42.readUnsignedByte((byte) 72);
	    if (i_0_ == 0)
		break;
	    if (1 == i_0_)
		anInt8023 = class528_sub42.readInt(-740098725) * 1276544789;
	    else if (i_0_ == 2)
		anInt8018 = class528_sub42.readInt(354951466) * 191765117;
	    else if (3 == i_0_)
		anInt8025
		    = class528_sub42.readInt(-1535088345) * -121475981;
	    else if (4 == i_0_)
		anInt8019 = class528_sub42.readUnsignedByte((byte) 88) * -1038849237;
	    else if (i_0_ == 5)
		anInt8027 = class528_sub42.readUnsignedByte((byte) 57) * -707456243;
	    else if (i_0_ == 6)
		anInt8028 = class528_sub42.readInt(-476830043) * 1039078195;
	    else if (7 == i_0_)
		anInt8020
		    = class528_sub42.readInt(-1556722769) * -1310480941;
	    else if (i_0_ >= 100) {
		i_0_ -= 100;
		anIntArrayArray8030[i_0_ & (int) (Math.pow(2.0, 3.0)
						  - 1.0)][i_0_ >> 3]
		    = class528_sub42.readUnsignedShort(260595798);
	    }
	}
    }
    
    public Class615(Class446 class446) {
	byte[] is = class446.method5395((-2082684943
					 * Class606.aClass606_7917.anInt7921),
					-1428169877);
	if (null != is) {
	    /* empty */
	}
	method7347(new ByteBuffer(is), (byte) -119);
    }
    
    void method7348(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 71);
	    if (i == 0)
		break;
	    if (1 == i)
		anInt8023
		    = class528_sub42.readInt(-1614194492) * 1276544789;
	    else if (i == 2)
		anInt8018 = class528_sub42.readInt(440591603) * 191765117;
	    else if (3 == i)
		anInt8025 = class528_sub42.readInt(-373999620) * -121475981;
	    else if (4 == i)
		anInt8019
		    = class528_sub42.readUnsignedByte((byte) 104) * -1038849237;
	    else if (i == 5)
		anInt8027 = class528_sub42.readUnsignedByte((byte) 40) * -707456243;
	    else if (i == 6)
		anInt8028 = class528_sub42.readInt(20065339) * 1039078195;
	    else if (7 == i)
		anInt8020 = class528_sub42.readInt(540968551) * -1310480941;
	    else if (i >= 100) {
		i -= 100;
		anIntArrayArray8030[i & (int) (Math.pow(2.0, 3.0)
					       - 1.0)][i >> 3]
		    = class528_sub42.readUnsignedShort(-238712436);
	    }
	}
    }
    
    void method7349(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 126);
	    if (i == 0)
		break;
	    if (1 == i)
		anInt8023
		    = class528_sub42.readInt(-1525083321) * 1276544789;
	    else if (i == 2)
		anInt8018 = class528_sub42.readInt(-1649821128) * 191765117;
	    else if (3 == i)
		anInt8025 = class528_sub42.readInt(510468772) * -121475981;
	    else if (4 == i)
		anInt8019 = class528_sub42.readUnsignedByte((byte) 55) * -1038849237;
	    else if (i == 5)
		anInt8027 = class528_sub42.readUnsignedByte((byte) 11) * -707456243;
	    else if (i == 6)
		anInt8028
		    = class528_sub42.readInt(-1280434344) * 1039078195;
	    else if (7 == i)
		anInt8020
		    = class528_sub42.readInt(-172672155) * -1310480941;
	    else if (i >= 100) {
		i -= 100;
		anIntArrayArray8030[i & (int) (Math.pow(2.0, 3.0)
					       - 1.0)][i >> 3]
		    = class528_sub42.readUnsignedShort(250469349);
	    }
	}
    }
    
    static final void method7350(Class648 class648, boolean bool, int i) {
	int i_1_ = (((Class648) class648).anIntArray8414
		    [-630179809 * ((Class648) class648).anInt8390]);
	((Class648) class648).anInt8395 -= -1816921966;
	int i_2_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_3_ = (((Class648) class648).anIntArray8394
		    [1 + ((Class648) class648).anInt8395 * 717927929]);
	if (i_2_ < 0 || i_2_ >= ((Class648) class648).anIntArray8402[i_1_])
	    throw new RuntimeException();
	((Class648) class648).anIntArrayArray8393[i_1_][i_2_] = i_3_;
	if (bool)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= i_3_;
    }
    
    static final void method7351(Class648 class648, int i) {
	if (Class700.aBool8733) {
	    Class683[] class683s = Class657.method7850(1239022665);
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= class683s.length;
	} else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
    }
    
    static final void method7352(Class648 class648, byte i) {
	if (Class97.anInt1239 * -1872227181 == 1)
	    Class97.aBool1238 = true;
	else if (3 == -1872227181 * Class97.anInt1239)
	    Class97.aBool1237 = true;
    }
    
    public static boolean method7353(CharSequence charsequence, int i) {
	return Class567.method6837(charsequence, 10, true, (byte) 5);
    }
    
    public static void method7354(boolean bool, int i) {
	/* empty */
    }
    
    public static void method7355(int i) {
	for (Class528_Sub11 class528_sub11
		 = ((Class528_Sub11)
		    Class528_Sub11.aClass688_10318.method8034(1778860406));
	     null != class528_sub11;
	     class528_sub11 = (Class528_Sub11) Class528_Sub11
						   .aClass688_10318
						   .method8037(-917473529)) {
	    if (((Class528_Sub11) class528_sub11).aBool10333)
		class528_sub11.method9347(-1129071034);
	}
	for (Class528_Sub11 class528_sub11
		 = ((Class528_Sub11)
		    Class528_Sub11.aClass688_10313.method8034(1524227587));
	     null != class528_sub11;
	     class528_sub11 = (Class528_Sub11) Class528_Sub11
						   .aClass688_10313
						   .method8037(-1477153673)) {
	    if (((Class528_Sub11) class528_sub11).aBool10333)
		class528_sub11.method9347(-1760979286);
	}
    }
}
