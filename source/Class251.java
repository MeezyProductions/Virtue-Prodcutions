/* Class251 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class251
{
    Class241 aClass241_2788;
    int anInt2789;
    int anInt2790;
    int anInt2791;
    int anInt2792;
    int[] anIntArray2793;
    int anInt2794;
    int anInt2795;
    int[] anIntArray2796;
    int[][] anIntArrayArray2797;
    
    void method3423(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    void method3424(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    Class247[] method3425(Class247[] class247s, int i, boolean[] bools) {
	int i_0_ = class247s.length;
	for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
	    if (!bools[i_1_]) {
		for (int i_2_ = 0; i_2_ < i; i_2_++)
		    ((Class247) class247s[i_1_]).aFloatArray2769[i_2_] = 0.0F;
	    }
	}
	int i_3_
	    = (((Class245) (((Class241) ((Class251) this).aClass241_2788)
			    .aClass245Array2668[((Class251) this).anInt2794]))
	       .anInt2740);
	int i_4_ = ((Class251) this).anInt2795 - ((Class251) this).anInt2789;
	int i_5_ = i_4_ / ((Class251) this).anInt2791;
	if (((Class251) this).anIntArrayArray2797 == null
	    || ((Class251) this).anIntArrayArray2797.length != i_0_
	    || ((Class251) this).anIntArrayArray2797[0].length != i_5_)
	    ((Class251) this).anIntArrayArray2797 = new int[i_0_][i_5_];
	else {
	    for (int i_6_ = 0; i_6_ < i_0_; i_6_++)
		method3423(((Class251) this).anIntArrayArray2797[i_6_]);
	}
	for (int i_7_ = 0; i_7_ < 8; i_7_++) {
	    int i_8_ = 0;
	    while (i_8_ < i_5_) {
		if (i_7_ == 0) {
		    for (int i_9_ = 0; i_9_ < i_0_; i_9_++) {
			if (!bools[i_9_]) {
			    int i_10_
				= (((Class241)
				    ((Class251) this).aClass241_2788)
				       .aClass245Array2668
				       [((Class251) this).anInt2794].method3398
				   (((Class251) this).aClass241_2788));
			    for (int i_11_ = i_3_ - 1; i_11_ >= 0; i_11_--) {
				if (i_8_ + i_11_ < i_5_)
				    ((Class251) this).anIntArrayArray2797
					[i_9_][i_8_ + i_11_]
					= i_10_ % ((Class251) this).anInt2792;
				i_10_ /= ((Class251) this).anInt2792;
			    }
			}
		    }
		}
		for (int i_12_ = 0; i_12_ < i_3_; i_12_++) {
		    for (int i_13_ = 0; i_13_ < i_0_; i_13_++) {
			if (!bools[i_13_]) {
			    int i_14_ = (((Class251) this).anIntArrayArray2797
					 [i_13_][i_8_]);
			    int i_15_ = (((Class251) this).anIntArray2793
					 [i_14_ * 8 + i_7_]);
			    if (i_15_ >= 0) {
				int i_16_
				    = (((Class251) this).anInt2789
				       + i_8_ * ((Class251) this).anInt2791);
				Class245 class245
				    = (((Class241)
					((Class251) this).aClass241_2788)
				       .aClass245Array2668[i_15_]);
				if (((Class251) this).anInt2790 == 0) {
				    int i_17_
					= (((Class251) this).anInt2791
					   / ((Class245) class245).anInt2740);
				    for (int i_18_ = 0; i_18_ < i_17_;
					 i_18_++) {
					float[] fs = (class245.method3399
						      (((Class251) this)
						       .aClass241_2788));
					for (int i_19_ = 0;
					     i_19_ < (((Class245) class245)
						      .anInt2740);
					     i_19_++)
					    ((Class247) class247s[i_13_])
						.aFloatArray2769
						[i_16_ + i_18_ + i_19_ * i_17_]
						+= fs[i_19_];
				    }
				} else if (((Class251) this).anInt2790 == 1
					   || (((Class251) this).anInt2790
					       == 2)) {
				    int i_20_ = 0;
				    while (i_20_
					   < ((Class251) this).anInt2791) {
					float[] fs = (class245.method3399
						      (((Class251) this)
						       .aClass241_2788));
					for (int i_21_ = 0;
					     i_21_ < (((Class245) class245)
						      .anInt2740);
					     i_21_++) {
					    ((Class247) class247s[i_13_])
						.aFloatArray2769[i_16_ + i_20_]
						+= fs[i_21_];
					    i_20_++;
					}
				    }
				}
			    }
			}
		    }
		    if (++i_8_ >= i_5_)
			break;
		}
	    }
	}
	return class247s;
    }
    
    void method3426(Class241 class241) {
	((Class251) this).aClass241_2788 = class241;
	((Class251) this).anInt2790
	    = ((Class251) this).aClass241_2788.method3336(16);
	((Class251) this).anInt2789
	    = ((Class251) this).aClass241_2788.method3336(24);
	((Class251) this).anInt2795
	    = ((Class251) this).aClass241_2788.method3336(24);
	((Class251) this).anInt2791
	    = ((Class251) this).aClass241_2788.method3336(24) + 1;
	((Class251) this).anInt2792
	    = ((Class251) this).aClass241_2788.method3336(6) + 1;
	((Class251) this).anInt2794
	    = ((Class251) this).aClass241_2788.method3336(8);
	if (((Class251) this).anIntArray2796 == null
	    || (((Class251) this).anIntArray2796.length
		!= ((Class251) this).anInt2792))
	    ((Class251) this).anIntArray2796
		= new int[((Class251) this).anInt2792];
	for (int i = 0; i < ((Class251) this).anInt2792; i++) {
	    int i_22_ = 0;
	    int i_23_ = ((Class251) this).aClass241_2788.method3336(3);
	    boolean bool = ((Class251) this).aClass241_2788.method3335() != 0;
	    if (bool)
		i_22_ = ((Class251) this).aClass241_2788.method3336(5);
	    ((Class251) this).anIntArray2796[i] = i_22_ << 3 | i_23_;
	}
	if (((Class251) this).anIntArray2793 == null
	    || (((Class251) this).anIntArray2793.length
		!= ((Class251) this).anInt2792 * 8))
	    ((Class251) this).anIntArray2793
		= new int[((Class251) this).anInt2792 * 8];
	for (int i = 0; i < ((Class251) this).anInt2792 * 8; i++)
	    ((Class251) this).anIntArray2793[i]
		= ((((Class251) this).anIntArray2796[i >> 3] & 1 << (i & 0x7))
		   != 0) ? ((Class251) this).aClass241_2788.method3336(8) : -1;
    }
    
    void method3427(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    void method3428(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    Class251() {
	/* empty */
    }
}
