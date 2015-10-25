/* Class462 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Class462
{
    Class416[] aClass416Array5293;
    
    Class462(ByteBuffer class528_sub42, BigInteger biginteger,
	     BigInteger biginteger_0_) {
	class528_sub42.pointer = 1485073143;
	int i = class528_sub42.readUnsignedByte((byte) 86);
	class528_sub42.pointer += i * -2008633488;
	byte[] is = new byte[(class528_sub42.payload.length
			      - -185904669 * class528_sub42.pointer)];
	class528_sub42.method9718(is, 0, is.length, -1456124512);
	byte[] is_1_;
	if (biginteger == null || biginteger_0_ == null)
	    is_1_ = is;
	else {
	    BigInteger biginteger_2_ = new BigInteger(is);
	    BigInteger biginteger_3_
		= biginteger_2_.modPow(biginteger, biginteger_0_);
	    is_1_ = biginteger_3_.toByteArray();
	}
	if (is_1_.length != 65)
	    throw new RuntimeException();
	byte[] is_4_
	    = Class227.method3183(class528_sub42.payload, 5,
				  (-185904669 * class528_sub42.pointer
				   - is.length - 5),
				  1897219213);
	for (int i_5_ = 0; i_5_ < 64; i_5_++) {
	    if (is_4_[i_5_] != is_1_[i_5_ + 1])
		throw new RuntimeException();
	}
	((Class462) this).aClass416Array5293 = new Class416[i];
	for (int i_6_ = 0; i_6_ < i; i_6_++) {
	    class528_sub42.pointer = -794892606 + -2008633488 * i_6_;
	    int i_7_ = class528_sub42.readInt(255570370);
	    int i_8_ = class528_sub42.readInt(-1450499223);
	    int i_9_ = class528_sub42.readInt(-1628758728);
	    int i_10_ = class528_sub42.readInt(1017978608);
	    byte[] is_11_ = new byte[64];
	    class528_sub42.method9718(is_11_, 0, 64, -1456124512);
	    ((Class462) this).aClass416Array5293[i_6_]
		= new Class416(i_7_, i_9_, i_8_, i_10_, is_11_);
	}
    }
    
    static final void method5587(Class648 class648, int i) {
	Class664.method7891(2142811384);
    }
    
    static final void method5588(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class36.method787(class229, class648, 2054705635);
    }
    
    static boolean method5589(int i, int i_12_) {
	return 12 == i || i == 13;
    }
    
    static void method5590(Class173 class173, Class528_Sub25 class528_sub25,
			   Class239 class239, int i, int i_13_, int i_14_,
			   int i_15_, int i_16_) {
	int i_17_ = i - 5;
	int i_18_ = i_13_ + 2;
	if (0 != class239.anInt2616 * 1927847049)
	    class173.method2210(i_17_, i_18_, 10 + i_15_,
				i_13_ + i_14_ - i_18_ + 1,
				class239.anInt2616 * 1927847049, -1365618235);
	if (0 != class239.anInt2617 * 430859931)
	    class173.method2206(i_17_, i_18_, i_15_ + 10,
				1 + (i_13_ + i_14_ - i_18_),
				class239.anInt2617 * 430859931, -1580631374);
	int i_19_ = 1180390923 * class239.anInt2610;
	if (class528_sub25.aBool10426
	    && class239.anInt2611 * -2060945057 != -1)
	    i_19_ = class239.anInt2611 * -2060945057;
	Class211.aClass172_2246.method2122(class239.aString2609, i, i_13_,
					   i_15_, i_14_, ~0xffffff | i_19_,
					   1892481627 * (Class518_Sub1
							 .aClass615_6979
							 .anInt8020),
					   1, 0, 0, null, null, null, 0, 0,
					   -1712607546);
    }
}
