/* Class201 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class201 implements Interface42
{
    Class218 this$0;
    static Class602_Sub1[] aClass602_Sub1Array2210;
    
    Class201(Class218 class218) {
	((Class201) this).this$0 = class218;
    }
    
    public float method318(byte i) {
	return ((float) Class514.aClass528_Sub38_6967.aClass691_Sub34_10591
			    .method10132((byte) 23)
		/ 255.0F);
    }
    
    public float method319() {
	return ((float) Class514.aClass528_Sub38_6967.aClass691_Sub34_10591
			    .method10132((byte) 44)
		/ 255.0F);
    }
    
    public float method317() {
	return ((float) Class514.aClass528_Sub38_6967.aClass691_Sub34_10591
			    .method10132((byte) 49)
		/ 255.0F);
    }
    
    static void method2858(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [717927929 * ((Class648) class648).anInt8395 - 2]
	    = (((Class256)
		(Class669.aClass25_Sub1_8522.method63
		 ((((Class648) class648).anIntArray8394
		   [717927929 * ((Class648) class648).anInt8395 - 2]),
		  -1474142621)))
	       .anIntArrayArray2817
	       [(((Class648) class648).anIntArray8394
		 [717927929 * ((Class648) class648).anInt8395 - 1])]
	       [0]);
	((Class648) class648).anInt8395 -= 1239022665;
    }
    
    static final void method2859(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	class229.anInt2413
	    = ((((Class648) class648).anIntArray8394
		[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	       * 1034801873);
	Class39.method811(class229, 1435904523);
    }
    
    static final void method2860(Class648 class648, byte i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_0_, (byte) 58);
	Class226 class226 = Class380.aClass226Array3970[i_0_ >> 16];
	Class36.method792(class229, class226, class648, (byte) 71);
    }
    
    static final void method2861(Class648 class648, int i) {
	int i_1_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub12_10590
		  .method8126(i_1_, -1955030095);
    }
}
