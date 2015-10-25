/* Class535 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class535
{
    Class535() throws Throwable {
	throw new Error();
    }
    
    static final void method6494(Class648 class648, short i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_0_, (byte) 9);
	Class226 class226 = Class380.aClass226Array3970[i_0_ >> 16];
	Class40.method819(class229, class226, class648, -906034980);
    }
    
    static final void method6495(Class648 class648, short i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = Class655.method7844(string, (short) 1961);
    }
    
    public static float method6496(float f, float f_1_, int i) {
	double d = Math.atan2((double) f, (double) f_1_);
	if (d < 0.0)
	    d = 3.141592653589793 + d + 3.141592653589793;
	return (float) d;
    }
}
