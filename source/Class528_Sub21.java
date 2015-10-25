/* Class528_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class528_Sub21 extends Node
{
    public Class528_Sub21 aClass528_Sub21_10406;
    public long aLong10407;
    public Class528_Sub21 aClass528_Sub21_10408;
    
    public void method9429(byte i) {
	if (aClass528_Sub21_10406 != null) {
	    aClass528_Sub21_10406.aClass528_Sub21_10408
		= aClass528_Sub21_10408;
	    aClass528_Sub21_10408.aClass528_Sub21_10406
		= aClass528_Sub21_10406;
	    aClass528_Sub21_10408 = null;
	    aClass528_Sub21_10406 = null;
	}
    }
    
    static final void method9430(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class355.method4585(class229, class226, class648, 1717117951);
    }
    
    static final void method9431(Class648 class648, int i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_0_, (byte) 13);
	int i_1_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	i_1_--;
	if (null == class229.aStringArray2545
	    || i_1_ >= class229.aStringArray2545.length
	    || class229.aStringArray2545[i_1_] == null)
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
	else
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= class229.aStringArray2545[i_1_];
    }
}
