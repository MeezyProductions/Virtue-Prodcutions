/* Class148_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class148_Sub2 extends Class148
{
    Interface34 anInterface34_8885;
    
    Class148_Sub2(Class173_Sub1 class173_sub1, int i, int i_0_, int[] is) {
	((Class148_Sub2) this).anInterface34_8885
	    = class173_sub1.method8516(i, i_0_, false, is);
	((Class148_Sub2) this).anInterface34_8885.method220(false, false);
    }
    
    static Class148_Sub2 method8320(Class173_Sub1 class173_sub1, int i,
				    int i_1_, int[] is, int[] is_2_) {
	if (class173_sub1.method8514(Class149.aClass149_1677,
				     Class169.aClass169_1935)) {
	    byte[] is_3_ = new byte[i * i_1_];
	    for (int i_4_ = 0; i_4_ < i_1_; i_4_++) {
		int i_5_ = i_4_ * i + is[i_4_];
		for (int i_6_ = 0; i_6_ < is_2_[i_4_]; i_6_++)
		    is_3_[i_5_++] = (byte) -1;
	    }
	    return new Class148_Sub2(class173_sub1, i, i_1_, is_3_);
	}
	int[] is_7_ = new int[i * i_1_];
	for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
	    int i_9_ = i_8_ * i + is[i_8_];
	    for (int i_10_ = 0; i_10_ < is_2_[i_8_]; i_10_++)
		is_7_[i_9_++] = -16777216;
	}
	return new Class148_Sub2(class173_sub1, i, i_1_, is_7_);
    }
    
    Class148_Sub2(Class173_Sub1 class173_sub1, int i, int i_11_, byte[] is) {
	((Class148_Sub2) this).anInterface34_8885
	    = class173_sub1.method8517(Class149.aClass149_1677, i, i_11_,
				       false, is);
	((Class148_Sub2) this).anInterface34_8885.method220(false, false);
    }
}
