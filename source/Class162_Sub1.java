/* Class162_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class162_Sub1 extends Class162
{
    Class173_Sub2 aClass173_Sub2_9206;
    Class120 aClass120_9207;
    
    Class120 method8441() {
	return ((Class162_Sub1) this).aClass120_9207;
    }
    
    byte[] method8442(int[] is) {
	byte[] is_0_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_1_ = 0; i_1_ < 16; i_1_++) {
		for (int i_2_ = 0; i_2_ < 16; i_2_++) {
		    int i_3_ = is[256 * i_1_ + 16 * i_2_ + i];
		    int i_4_ = (i_2_ * 256 + i_1_ * 16 + i) * 4;
		    is_0_[i_4_ + 0] = (byte) (i_3_ >> 16 & 0xff);
		    is_0_[i_4_ + 1] = (byte) (i_3_ >> 8 & 0xff);
		    is_0_[i_4_ + 2] = (byte) (i_3_ & 0xff);
		    is_0_[i_4_ + 3] = (byte) -1;
		}
	    }
	}
	return is_0_;
    }
    
    byte[] method8443(int[] is) {
	byte[] is_5_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_6_ = 0; i_6_ < 16; i_6_++) {
		for (int i_7_ = 0; i_7_ < 16; i_7_++) {
		    int i_8_ = is[256 * i_6_ + 16 * i_7_ + i];
		    int i_9_ = (i_7_ * 256 + i_6_ * 16 + i) * 4;
		    is_5_[i_9_ + 0] = (byte) (i_8_ >> 16 & 0xff);
		    is_5_[i_9_ + 1] = (byte) (i_8_ >> 8 & 0xff);
		    is_5_[i_9_ + 2] = (byte) (i_8_ & 0xff);
		    is_5_[i_9_ + 3] = (byte) -1;
		}
	    }
	}
	return is_5_;
    }
    
    byte[] method8444(int[] is) {
	byte[] is_10_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_11_ = 0; i_11_ < 16; i_11_++) {
		for (int i_12_ = 0; i_12_ < 16; i_12_++) {
		    int i_13_ = is[256 * i_11_ + 16 * i_12_ + i];
		    int i_14_ = (i_12_ * 256 + i_11_ * 16 + i) * 4;
		    is_10_[i_14_ + 0] = (byte) (i_13_ >> 16 & 0xff);
		    is_10_[i_14_ + 1] = (byte) (i_13_ >> 8 & 0xff);
		    is_10_[i_14_ + 2] = (byte) (i_13_ & 0xff);
		    is_10_[i_14_ + 3] = (byte) -1;
		}
	    }
	}
	return is_10_;
    }
    
    Class162_Sub1(Class173_Sub2 class173_sub2, int[] is) {
	((Class162_Sub1) this).aClass173_Sub2_9206 = class173_sub2;
	if (((Class173_Sub2) ((Class162_Sub1) this).aClass173_Sub2_9206)
	    .aBool9574) {
	    byte[] is_15_ = method8442(is);
	    ((Class162_Sub1) this).aClass120_9207
		= new Class120_Sub2(((Class162_Sub1) this).aClass173_Sub2_9206,
				    Class149.aClass149_1676,
				    Class169.aClass169_1935, 16, 16, 16,
				    is_15_, Class149.aClass149_1676);
	} else
	    ((Class162_Sub1) this).aClass120_9207
		= new Class120_Sub4(((Class162_Sub1) this).aClass173_Sub2_9206,
				    3553, 256, 16, false, is, 256, 0, false);
    }
}
