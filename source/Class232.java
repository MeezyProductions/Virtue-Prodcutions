/* Class232 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class232 implements Interface4
{
    Class446 aClass446_2576;
    Class186 aClass186_2577;
    
    Class232(Class446 class446, int i) {
	((Class232) this).aClass446_2576 = class446;
	((Class232) this).aClass186_2577 = new Class186(i);
    }
    
    static final void method3253(Class648 class648, int i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_0_, (byte) -93);
	Class226 class226 = Class380.aClass226Array3970[i_0_ >> 16];
	Class416.method4968(class229, class226, class648, (byte) -61);
    }
    
    static int method3254(int i, int i_1_, byte i_2_) {
	int i_3_ = i >> 31 & i_1_ - 1;
	return i_3_ + ((i >>> 31) + i) % i_1_;
    }
}
