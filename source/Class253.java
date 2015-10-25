/* Class253 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class253
{
    int[] anIntArray2802;
    
    public int method3434(int i, int i_0_) {
	int i_1_ = (((Class253) this).anIntArray2802.length >> 1) - 1;
	int i_2_ = i & i_1_;
	for (;;) {
	    int i_3_ = ((Class253) this).anIntArray2802[i_2_ + i_2_ + 1];
	    if (-1 == i_3_)
		return -1;
	    if (i == ((Class253) this).anIntArray2802[i_2_ + i_2_])
		return i_3_;
	    i_2_ = 1 + i_2_ & i_1_;
	}
    }
    
    public Class253(int[] is) {
	int i;
	for (i = 1; i <= is.length + (is.length >> 1); i <<= 1) {
	    /* empty */
	}
	((Class253) this).anIntArray2802 = new int[i + i];
	for (int i_4_ = 0; i_4_ < i + i; i_4_++)
	    ((Class253) this).anIntArray2802[i_4_] = -1;
	for (int i_5_ = 0; i_5_ < is.length; i_5_++) {
	    int i_6_;
	    for (i_6_ = is[i_5_] & i - 1;
		 ((Class253) this).anIntArray2802[1 + (i_6_ + i_6_)] != -1;
		 i_6_ = 1 + i_6_ & i - 1) {
		/* empty */
	    }
	    ((Class253) this).anIntArray2802[i_6_ + i_6_] = is[i_5_];
	    ((Class253) this).anIntArray2802[i_6_ + i_6_ + 1] = i_5_;
	}
    }
    
    static void method3435(int i, byte i_7_) {
	for (Class528_Sub21_Sub11 class528_sub21_sub11
		 = ((Class528_Sub21_Sub11)
		    Class28.aClass688_274.method8034(1779444879));
	     class528_sub21_sub11 != null;
	     class528_sub21_sub11
		 = ((Class528_Sub21_Sub11)
		    Class28.aClass688_274.method8037(281388387))) {
	    if (Class206.method2920(382057983 * (((Class528_Sub21_Sub11)
						  class528_sub21_sub11)
						 .anInt11595),
				    632928322)
		&& i == (((Class528_Sub21_Sub11) class528_sub21_sub11)
			 .anInt11590) * 1000490939 >> 16)
		VarDefinition.method4135(class528_sub21_sub11, -136290008);
	}
    }
    
    static final void method3436(Class648 class648, int i)
	throws Exception_Sub4 {
	((Class648) class648).anInt8395 -= 661123364;
	float f = (float) (((Class648) class648).anIntArray8394
			   [((Class648) class648).anInt8395 * 717927929]);
	float f_8_
	    = (float) (((Class648) class648).anIntArray8394
		       [717927929 * ((Class648) class648).anInt8395 + 1]);
	float f_9_
	    = (float) (((Class648) class648).anIntArray8394
		       [2 + ((Class648) class648).anInt8395 * 717927929]);
	float f_10_
	    = ((float) (((Class648) class648).anIntArray8394
			[3 + 717927929 * ((Class648) class648).anInt8395])
	       / 1000.0F);
	Class495.aClass283_Sub1_5578
	    .method3772(Class422.method5051(f, f_8_, f_9_), f_10_, -457709349);
    }
    
    static final void method3437(Class648 class648, int i) {
	int i_11_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	int[] is = Class523.method6370(i_11_, (byte) 125);
	Class670.method7938(is, 0, ((Class648) class648).anIntArray8394,
			    717927929 * ((Class648) class648).anInt8395, 3);
	((Class648) class648).anInt8395 += -577899301;
    }
    
    public static void method3438(int[] is, Object[] objects, int i) {
	RenderType.method6990(is, objects, 0, is.length - 1, -1989507282);
    }
    
    public static void method3439(short[] is, byte i) {
	for (int i_12_ = 0; i_12_ < is.length; i_12_++)
	    is[i_12_] = (short) 1024;
    }
}
