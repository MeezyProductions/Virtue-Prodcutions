/* Class658 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class658
{
    Class658() throws Throwable {
	throw new Error();
    }
    
    static final void method7852(int i) {
	int i_0_ = 1087758653 * GPI.localPlayerCount;
	int[] is = GPI.localPlayerIndicies;
	for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
	    Player class645_sub1_sub5_sub1_sub2
		= client.localPlayers[is[i_1_]];
	    if (null != class645_sub1_sub5_sub1_sub2)
		Class95_Sub1_Sub1.method10291(class645_sub1_sub5_sub1_sub2,
					      false, -1228002237);
	}
    }
    
    public static void method7853(int i) {
	if (107 == Class54.stage * -111028825)
	    Class54.stage = -1754336660;
    }
    
    static final void method7854(Class229 class229, Class226 class226,
				 Class648 class648, byte i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	if (Class494.method5957(string, class648, (short) 520) != null)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2530
	    = Class181_Sub23.method8999(string, class648, (byte) -21);
	class229.aBool2483 = true;
    }
    
    static final int method7855(int i, int i_2_) {
	if (i < 4)
	    return 0;
	if (i < 10)
	    return i - 3;
	return i - 6;
    }
    
    static Class15 method7856(ByteBuffer class528_sub42,
			      Class95_Sub1 class95_sub1, int i) {
	Class15 class15 = new Class15(class95_sub1);
	for (;;) {
	    int i_3_ = class528_sub42.readUnsignedByte((byte) 27);
	    if (i_3_ == 255)
		break;
	    Class483 class483
		= ((Class483)
		   Class613.method7337(Class483.class, i_3_, 569912397));
	    for (;;) {
		int i_4_ = class528_sub42.readUnsignedByte((byte) 93);
		if (255 == i_4_)
		    break;
		class528_sub42.pointer -= 2015001547;
		Class411 class411
		    = class95_sub1.method8256(class528_sub42, class483,
					      887424040);
		if (class411 != null)
		    class15.method15(class411.anInt4711 * 1862601893,
				     class411.anObject4712, -1722094057);
	    }
	}
	return class15;
    }
}
