/* Class381 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class381
{
    static Class381 aClass381_3971;
    static Class381 aClass381_3972;
    static Class381 aClass381_3973 = new Class381();
    static int anInt3974;
    
    static {
	aClass381_3972 = new Class381();
	aClass381_3971 = new Class381();
    }
    
    public int method4720(int i, int i_0_, int i_1_) {
	int i_2_ = (-1117838587 * Class411.anInt4713 > i_0_
		    ? Class411.anInt4713 * -1117838587 : i_0_);
	if (aClass381_3973 == this)
	    return 0;
	if (aClass381_3971 == this)
	    return i_2_ - i;
	if (this == aClass381_3972)
	    return (i_2_ - i) / 2;
	return 0;
    }
    
    Class381() {
	/* empty */
    }
    
    public int method4721(int i, int i_3_) {
	int i_4_ = (-1117838587 * Class411.anInt4713 > i_3_
		    ? Class411.anInt4713 * -1117838587 : i_3_);
	if (aClass381_3973 == this)
	    return 0;
	if (aClass381_3971 == this)
	    return i_4_ - i;
	if (this == aClass381_3972)
	    return (i_4_ - i) / 2;
	return 0;
    }
    
    static final void method4722(Class648 class648, byte i) {
	if ((((Class648) class648).anIntArray8394
	     [(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	    == 0)
	    ((Class648) class648).anInt8390
		+= (1888568287
		    * (((Class648) class648).anIntArray8414
		       [((Class648) class648).anInt8390 * -630179809]));
    }
    
    static final void method4723(Class648 class648, int i) {
	int i_5_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_5_, (byte) 6);
	Class226 class226 = Class380.aClass226Array3970[i_5_ >> 16];
	Class513.method6273(class229, class226, class648, (short) 25024);
    }
}
