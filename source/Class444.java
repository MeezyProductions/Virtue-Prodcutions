/* Class444 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class444 implements Interface8
{
    static int anInt4914;
    public static Class376 aClass376_4915;
    public static Class151 aClass151_4916;
    
    public static void method5325(Class58_Sub1 class58_sub1, int i) {
	Class275.method3706(class58_sub1, (byte) -38);
    }
    
    static final void method5326(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class160.method2059(class229, class226, true, 0, class648,
			    -1649643344);
    }
    
    static final void method5327(int i) {
	for (Class511_Sub1 class511_sub1
		 = ((Class511_Sub1)
		    client.aClass695_11000.method8179((short) 653));
	     null != class511_sub1;
	     class511_sub1 = ((Class511_Sub1)
			      client.aClass695_11000.method8179((short) 653)))
	    Class503.method6116(class511_sub1, 536300132);
	int i_0_ = 0;
	int i_1_ = 3;
	if (client.anInt10943 * 345087519 == 0) {
	    for (int i_2_ = i_0_; i_2_ <= i_1_; i_2_++)
		client.method10197(i_2_);
	    client.method10199();
	} else {
	    client.method10195();
	    for (int i_3_ = i_0_; i_3_ <= i_1_; i_3_++) {
		client.method10196();
		client.method10224(i_3_);
		client.method10197(i_3_);
	    }
	    client.method10198();
	    client.method10199();
	}
    }
    
    static final void method5328(Class648 class648, byte i) {
	NPC class645_sub1_sub5_sub1_sub1
	    = ((NPC)
	       ((Class648) class648).aClass645_Sub1_Sub5_Sub1_8389);
	boolean bool = false;
	Class299 class299 = class645_sub1_sub5_sub1_sub1.aClass299_12043;
	if (null != class299.anIntArray3302)
	    class299
		= class299.method3996(Class570.playerVarsProvider,
				      Class570.playerVarsProvider, -1700003466);
	if (null != class299)
	    bool = class299.aBool3305;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = bool ? 1 : 0;
    }
    
    static final void method5329(Class648 class648, byte i) {
	int i_4_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_4_, (byte) -1);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class229.anInt2430 * 2135116593;
    }
}
