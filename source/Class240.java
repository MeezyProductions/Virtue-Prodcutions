/* Class240 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class240
{
    Class240() throws Throwable {
	throw new Error();
    }
    
    public static boolean method3312(byte i) {
	return Class503.anInterface57_6873 != null;
    }
    
    static final void method3313(Class648 class648, int i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if (Class518_Sub1.aClass692_10700 != null) {
	    Node node
		= Class518_Sub1.aClass692_10700.method8137((long) i_0_);
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= null != node ? 1 : 0;
	} else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
    }
    
    static final void method3314(Class648 class648, int i) {
	int i_1_ = 0;
	int i_2_ = 0;
	for (int i_3_ = 0; i_3_ < Class679.aClass460_Sub1Array8563.length;
	     i_3_++) {
	    if (Class679.aClass460_Sub1Array8563[i_3_] != null
		&& Class679.aClass460_Sub1Array8563[i_3_]
		       .method9215(-983224589)) {
		i_1_ += Class679.aClass460_Sub1Array8563[i_3_]
			    .method9190(-333059179);
		i_2_ += Class679.aClass460_Sub1Array8563[i_3_]
			    .method9194(-1907291717);
	    }
	}
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 0 == i_1_ ? 0 : i_2_ * 100 / i_1_;
    }
    
    public static Class528_Sub21_Sub13 method3315(int i, byte i_4_) {
	return ((Class528_Sub21_Sub13)
		Class277.aClass692_3044.method8137((long) i));
    }
}
