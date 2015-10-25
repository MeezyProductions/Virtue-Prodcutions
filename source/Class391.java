/* Class391 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;

public class Class391
{
    public int anInt4112;
    public int anInt4113 = -1349429107;
    static final int anInt4114 = 0;
    public int anInt4115;
    public int anInt4116;
    public int anInt4117;
    public boolean aBool4118;
    public boolean aBool4119;
    
    void method4786(ByteBuffer class528_sub42, int i) {
	for (;;) {
	    int i_0_ = class528_sub42.readUnsignedByte((byte) 32);
	    if (0 == i_0_)
		break;
	    method4788(class528_sub42, i_0_, i, 40366868);
	}
    }
    
    void method4787(ByteBuffer class528_sub42, int i, byte i_1_) {
	for (;;) {
	    int i_2_ = class528_sub42.readUnsignedByte((byte) 16);
	    if (0 == i_2_)
		break;
	    method4788(class528_sub42, i_2_, i, -444754513);
	}
    }
    
    void method4788(ByteBuffer class528_sub42, int i, int i_3_, int i_4_) {
	if (1 == i) {
	    anInt4113 = class528_sub42.readUnsignedShort(519576267) * 1349429107;
	    if (176412091 * anInt4113 == 65535)
		anInt4113 = -1349429107;
	} else if (2 == i) {
	    anInt4112
		= (class528_sub42.readUnsignedShort(-1657263236) + 1) * 1875320585;
	    anInt4116
		= (class528_sub42.readUnsignedShort(-1743498338) + 1) * 1611936631;
	} else if (3 == i)
	    class528_sub42.method9627(-2051792972);
	else if (i == 4)
	    anInt4115 = class528_sub42.readUnsignedByte((byte) 117) * 1360574323;
	else if (i == 5)
	    anInt4117 = class528_sub42.readUnsignedByte((byte) 42) * -1696523779;
	else if (6 == i)
	    aBool4118 = true;
	else if (i == 7)
	    aBool4119 = true;
    }
    
    void method4789(ByteBuffer class528_sub42, int i) {
	for (;;) {
	    int i_5_ = class528_sub42.readUnsignedByte((byte) 65);
	    if (0 == i_5_)
		break;
	    method4788(class528_sub42, i_5_, i, 1830626994);
	}
    }
    
    void method4790(ByteBuffer class528_sub42, int i) {
	for (;;) {
	    int i_6_ = class528_sub42.readUnsignedByte((byte) 24);
	    if (0 == i_6_)
		break;
	    method4788(class528_sub42, i_6_, i, -14446415);
	}
    }
    
    Class391() {
	anInt4112 = -238566848;
	anInt4116 = 84729280;
	anInt4115 = -1573818650;
	anInt4117 = -1696523779;
	aBool4118 = false;
	aBool4119 = false;
    }
    
    void method4791(ByteBuffer class528_sub42, int i, int i_7_) {
	if (1 == i) {
	    anInt4113 = class528_sub42.readUnsignedShort(-56588416) * 1349429107;
	    if (176412091 * anInt4113 == 65535)
		anInt4113 = -1349429107;
	} else if (2 == i) {
	    anInt4112
		= (class528_sub42.readUnsignedShort(374384734) + 1) * 1875320585;
	    anInt4116
		= (class528_sub42.readUnsignedShort(-1868894649) + 1) * 1611936631;
	} else if (3 == i)
	    class528_sub42.method9627(-1483209614);
	else if (i == 4)
	    anInt4115 = class528_sub42.readUnsignedByte((byte) 14) * 1360574323;
	else if (i == 5)
	    anInt4117 = class528_sub42.readUnsignedByte((byte) 56) * -1696523779;
	else if (6 == i)
	    aBool4118 = true;
	else if (i == 7)
	    aBool4119 = true;
    }
    
    void method4792(ByteBuffer class528_sub42, int i, int i_8_) {
	if (1 == i) {
	    anInt4113 = class528_sub42.readUnsignedShort(229747411) * 1349429107;
	    if (176412091 * anInt4113 == 65535)
		anInt4113 = -1349429107;
	} else if (2 == i) {
	    anInt4112
		= (class528_sub42.readUnsignedShort(-1880680686) + 1) * 1875320585;
	    anInt4116
		= (class528_sub42.readUnsignedShort(-683727645) + 1) * 1611936631;
	} else if (3 == i)
	    class528_sub42.method9627(-1068183576);
	else if (i == 4)
	    anInt4115 = class528_sub42.readUnsignedByte((byte) 112) * 1360574323;
	else if (i == 5)
	    anInt4117 = class528_sub42.readUnsignedByte((byte) 2) * -1696523779;
	else if (6 == i)
	    aBool4118 = true;
	else if (i == 7)
	    aBool4119 = true;
    }
    
    static void method4793(Class648 class648, short i) {
	Class256 class256
	    = ((Class256)
	       Class669.aClass25_Sub1_8522.method63((class648
						     .anIntArray8394
						     [((class648
							    .anInt8395
							-= 1239022665)
						       * 717927929)]),
						    289231153));
	class648.anIntArray8394
	    [(class648.anInt8395 += 1239022665) * 717927929 - 1]
	    = (null == class256.anIntArrayArray2817 ? 0
	       : class256.anIntArrayArray2817.length);
    }
    
    public static Class51 method4794(int i) {
	Class23 class23 = null;
	try {
	    Class51 class51;
	    try {
		class23
		    = Class223.method3160("3",
					  client.aClass673_11108.aString8534,
					  false, (byte) 17);
		byte[] is = new byte[(int) class23.method680(-2080061621)];
		int i_9_;
		for (int i_10_ = 0; i_10_ < is.length; i_10_ += i_9_) {
		    i_9_ = class23.method692(is, i_10_, is.length - i_10_,
					     1964598844);
		    if (-1 == i_9_)
			throw new EOFException();
		}
		class51 = new Class51(new ByteBuffer(is));
	    } catch (Exception exception) {
		Class51 class51_11_ = new Class51();
		try {
		    if (null != class23)
			class23.method683((byte) 50);
		} catch (Exception exception_12_) {
		    /* empty */
		}
		return class51_11_;
	    }
	    try {
		if (null != class23)
		    class23.method683((byte) 106);
	    } catch (Exception exception) {
		/* empty */
	    }
	    return class51;
		} catch (Exception object) {
	    try {
		if (null != class23)
		    class23.method683((byte) 55);
	    } catch (Exception exception) {
		/* empty */
	    }
	    throw object;
	}
    }
    
    static final void method4795(Class648 class648, int i) {
	int i_13_
	    = (class648.anIntArray8394
	       [(class648.anInt8395 -= 1239022665) * 717927929]);
	Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967
						  .aClass691_Sub5_10579),
						 i_13_, 998876245);
	Class243.method3387(2146857785);
	client.aBool11161 = false;
    }
}
