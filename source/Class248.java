/* Class248 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class248
{
    int[] anIntArray2770 = null;
    int[] anIntArray2771;
    int anInt2772;
    int[] anIntArray2773;
    Class241 aClass241_2774;
    int anInt2775;
    int[] anIntArray2776;
    int[] anIntArray2777;
    
    void method3409(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    void method3410(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    void method3411(Class241 class241) {
	((Class248) this).aClass241_2774 = class241;
	int i = ((Class248) this).aClass241_2774.method3348();
	((Class248) this).aClass241_2774.method3336(16);
	((Class248) this).anInt2775
	    = (((Class248) this).aClass241_2774.method3335() != 0
	       ? ((Class248) this).aClass241_2774.method3336(4) + 1 : 1);
	if (((Class248) this).aClass241_2774.method3335() != 0) {
	    ((Class248) this).anInt2772
		= ((Class248) this).aClass241_2774.method3336(8) + 1;
	    if (((Class248) this).anIntArray2776 == null
		|| (((Class248) this).anIntArray2776.length
		    != ((Class248) this).anInt2772))
		((Class248) this).anIntArray2776
		    = new int[((Class248) this).anInt2772];
	    else
		method3413(((Class248) this).anIntArray2776);
	    if (((Class248) this).anIntArray2777 == null
		|| (((Class248) this).anIntArray2777.length
		    != ((Class248) this).anInt2772))
		((Class248) this).anIntArray2777
		    = new int[((Class248) this).anInt2772];
	    else
		method3413(((Class248) this).anIntArray2777);
	    for (int i_0_ = 0; i_0_ < ((Class248) this).anInt2772; i_0_++) {
		((Class248) this).anIntArray2776[i_0_]
		    = ((Class248) this).aClass241_2774
			  .method3336(method3412(i - 1));
		((Class248) this).anIntArray2777[i_0_]
		    = ((Class248) this).aClass241_2774
			  .method3336(method3412(i - 1));
	    }
	} else
	    ((Class248) this).anInt2772 = 0;
	((Class248) this).aClass241_2774.method3336(2);
	if (((Class248) this).anInt2775 > 1) {
	    ((Class248) this).anIntArray2770 = new int[i];
	    for (int i_1_ = 0; i_1_ < i; i_1_++)
		((Class248) this).anIntArray2770[i_1_]
		    = ((Class248) this).aClass241_2774.method3336(4);
	}
	if (((Class248) this).anIntArray2773 == null
	    || (((Class248) this).anIntArray2773.length
		!= ((Class248) this).anInt2775))
	    ((Class248) this).anIntArray2773
		= new int[((Class248) this).anInt2775];
	else
	    method3413(((Class248) this).anIntArray2773);
	if (((Class248) this).anIntArray2771 == null
	    || (((Class248) this).anIntArray2771.length
		!= ((Class248) this).anInt2775))
	    ((Class248) this).anIntArray2771
		= new int[((Class248) this).anInt2775];
	else
	    method3413(((Class248) this).anIntArray2771);
	for (int i_2_ = 0; i_2_ < ((Class248) this).anInt2775; i_2_++) {
	    ((Class248) this).aClass241_2774.method3336(8);
	    ((Class248) this).anIntArray2773[i_2_]
		= ((Class248) this).aClass241_2774.method3336(8);
	    ((Class248) this).anIntArray2771[i_2_]
		= ((Class248) this).aClass241_2774.method3336(8);
	}
    }
    
    int method3412(int i) {
	int i_3_ = 0;
	for (/**/; i > 0; i >>= 1)
	    i_3_++;
	return i_3_;
    }
    
    void method3413(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    Class248() {
	/* empty */
    }
    
    int method3414(int i) {
	int i_4_ = 0;
	for (/**/; i > 0; i >>= 1)
	    i_4_++;
	return i_4_;
    }
    
    int method3415(int i) {
	int i_5_ = 0;
	for (/**/; i > 0; i >>= 1)
	    i_5_++;
	return i_5_;
    }
}
