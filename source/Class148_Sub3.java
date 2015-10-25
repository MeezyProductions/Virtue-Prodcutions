/* Class148_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class148_Sub3 extends Class148
{
    Class120_Sub4_Sub1 aClass120_Sub4_Sub1_8920;
    
    Class148_Sub3(Class173_Sub2 class173_sub2, int i, int i_0_, byte[] is) {
	((Class148_Sub3) this).aClass120_Sub4_Sub1_8920
	    = Class120_Sub4_Sub1.method10318(class173_sub2,
					     Class149.aClass149_1677,
					     Class169.aClass169_1935, i, i_0_,
					     false, is,
					     Class149.aClass149_1677);
	((Class148_Sub3) this).aClass120_Sub4_Sub1_8920.method8259(false,
								   false);
    }
    
    static Class148_Sub3 method8325(Class173_Sub2 class173_sub2, int i,
				    int i_1_, int[] is, int[] is_2_) {
	byte[] is_3_ = new byte[i * i_1_];
	for (int i_4_ = 0; i_4_ < i_1_; i_4_++) {
	    int i_5_ = i_4_ * i + is[i_4_];
	    for (int i_6_ = 0; i_6_ < is_2_[i_4_]; i_6_++)
		is_3_[i_5_++] = (byte) -1;
	}
	return new Class148_Sub3(class173_sub2, i, i_1_, is_3_);
    }
}
