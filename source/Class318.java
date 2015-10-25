/* Class318 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class318 implements Interface4
{
    Class446 aClass446_3460;
    
    public Class method46() {
	return Class282.class;
    }
    
    public Definition method42(int i, Interface12 interface12, int i_0_) {
	return new Class282(i, ((Class318) this).aClass446_3460);
    }
    
    public Class method45(short i) {
	return Class282.class;
    }
    
    public Class method44() {
	return Class282.class;
    }
    
    public Definition method43(int i, Interface12 interface12) {
	return new Class282(i, ((Class318) this).aClass446_3460);
    }
    
    public Class method41() {
	return Class282.class;
    }
    
    Class318(Class446 class446) {
	((Class318) this).aClass446_3460 = class446;
    }
    
    static final void method4191(Class229 class229, Class226 class226,
				 Class648 class648, byte i) {
	boolean bool
	    = ((((Class648) class648).anIntArray8394
		[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	       == 1);
	if (bool != class229.aBool2488) {
	    class229.aBool2488 = bool;
	    Class39.method811(class229, 1435904523);
	}
	if (class229.anInt2377 * 1835803215 == -1 && !class226.aBool2335)
	    Class572.method6865(306930455 * class229.anInt2376, -890549798);
    }
    
    static final void method4192(Class648 class648, int i) {
	int i_1_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_1_, (byte) 2);
	Class226 class226 = Class380.aClass226Array3970[i_1_ >> 16];
	Class83.method1154(class229, class226, class648, (byte) -114);
    }
    
    static final void method4193(Class648 class648, byte i) {
	/* empty */
    }
    
    static final void method4194(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class35.method784(class229, class226, class648, 926535376);
    }
}
