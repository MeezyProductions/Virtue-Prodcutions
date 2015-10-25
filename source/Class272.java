/* Class272 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class272 implements Interface4
{
    public static Class446 aClass446_2902;
    public static Class528_Sub36 aClass528_Sub36_2903;
    
    public Class method44() {
	return Class256.class;
    }
    
    public Definition method42(int i, Interface12 interface12, int i_0_) {
	return new Class256(i, interface12);
    }
    
    Class272() {
	/* empty */
    }
    
    public Definition method43(int i, Interface12 interface12) {
	return new Class256(i, interface12);
    }
    
    public Class method45(short i) {
	return Class256.class;
    }
    
    public Class method41() {
	return Class256.class;
    }
    
    public Class method46() {
	return Class256.class;
    }
    
    public static int method3688(CharSequence charsequence, int i) {
	int i_1_ = charsequence.length();
	int i_2_ = 0;
	for (int i_3_ = 0; i_3_ < i_1_; i_3_++)
	    i_2_ = ((i_2_ << 5) - i_2_
		    + Class450.method5438(charsequence.charAt(i_3_),
					  1680584201));
	return i_2_;
    }
    
    static final void method3689(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_4_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395]);
	int i_5_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395 + 1]);
	if (Class700.aBool8733) {
	    Class289.method3875(3, i_4_, i_5_, false, 2130003981);
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= Class207.aFrame2236 != null ? 1 : 0;
	} else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
    }
    
    public static Class602_Sub1 method3690(int i) {
	if (-1799385325 * Class12.anInt183
	    < Class12.aClass602_Sub1Array180.length)
	    return (Class12.aClass602_Sub1Array180
		    [(Class12.anInt183 += -1387490533) * -1799385325 - 1]);
	return null;
    }
    
    public static Class699 method3691(int i, byte i_6_) {
	Class699[] class699s = Class671.method7943(1831583860);
	for (int i_7_ = 0; i_7_ < class699s.length; i_7_++) {
	    Class699 class699 = class699s[i_7_];
	    if (i == class699.anInt8731 * 1269576623)
		return class699;
	}
	return null;
    }
    
    static void method3692(Class648 class648, int i) {
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = ((Class256)
	       Class669.aClass25_Sub1_8522.method63((((Class648) class648)
						     .anIntArray8394
						     [((((Class648) class648)
							    .anInt8395
							-= 1239022665)
						       * 717927929)]),
						    -1199306430)).aString2807;
    }
    
    static void method3693(int i, int i_8_, byte i_9_) {
	ClientPacket class528_sub21_sub7
	    = Class79.method1146(5, (long) i);
	class528_sub21_sub7.method10496(1592379112);
	((ClientPacket) class528_sub21_sub7).anInt11543
	    = 1959780981 * i_8_;
    }
}
