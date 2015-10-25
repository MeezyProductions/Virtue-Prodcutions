/* Class579 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class579 implements Interface65
{
    int anInt7610;
    int anInt7611;
    public static Class446 aClass446_7612;
    
    public boolean method407(Class528_Sub33 class528_sub33,
			     Interface61[] interface61s, int i,
			     Class544 class544) {
	for (int i_0_ = 0; i_0_ < i && i_0_ < interface61s.length; i_0_++) {
	    Interface61 interface61 = interface61s[i_0_];
	    if (null != interface61
		&& (interface61.method384(1610391476)
		    == -928747649 * ((Class579) this).anInt7610)
		&& (interface61.method402(-1308167109)
		    == ((Class579) this).anInt7611 * 1640571645))
		return true;
	}
	return false;
    }
    
    Class579(int i, int i_1_) {
	((Class579) this).anInt7610 = 1189826687 * i;
	((Class579) this).anInt7611 = i_1_ * 590842453;
    }
    
    public boolean method408(Class528_Sub33 class528_sub33,
			     Interface61[] interface61s, int i,
			     Class544 class544, byte i_2_) {
	for (int i_3_ = 0; i_3_ < i && i_3_ < interface61s.length; i_3_++) {
	    Interface61 interface61 = interface61s[i_3_];
	    if (null != interface61
		&& (interface61.method384(1926940681)
		    == -928747649 * ((Class579) this).anInt7610)
		&& (interface61.method402(650763705)
		    == ((Class579) this).anInt7611 * 1640571645))
		return true;
	}
	return false;
    }
    
    static final void method6915(Class648 class648, int i) {
	int i_4_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub24_10577
		  .method8126(i_4_, -1955030095);
    }
    
    public static void method6916(int i, int i_5_) {
	ClientPacket class528_sub21_sub7
	    = Class79.method1146(13, (long) i);
	class528_sub21_sub7.method10495(-899964144);
    }
}
