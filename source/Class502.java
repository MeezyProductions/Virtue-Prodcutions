/* Class502 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class502
{
    public static Class502 aClass502_6870 = new Class502();
    static Class502 aClass502_6871 = new Class502();
    static Class502 aClass502_6872 = new Class502();
    
    Class502() {
	/* empty */
    }
    
    public static void method6113(Class229[] class229s, int i) {
	for (int i_0_ = 0; i_0_ < class229s.length; i_0_++) {
	    Class229 class229 = class229s[i_0_];
	    if (null != class229.anObjectArray2354) {
		Class528_Sub30 class528_sub30 = new Class528_Sub30();
		class528_sub30.aClass229_10461 = class229;
		class528_sub30.anObjectArray10460 = class229.anObjectArray2354;
		Class232_Sub1.method8994(class528_sub30, 2000000, (byte) 50);
	    }
	}
    }
    
    static final void method6114(Class648 class648, byte i) {
	int i_1_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_1_, (byte) 65);
	Class226 class226 = Class380.aClass226Array3970[i_1_ >> 16];
	Class160.method2059(class229, class226, false, 0, class648,
			    -1649643344);
    }
}
