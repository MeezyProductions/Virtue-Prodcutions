/* Class162_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class162_Sub2 extends Class162
{
    Interface38 anInterface38_9699;
    Class173_Sub1 aClass173_Sub1_9700;
    
    public Interface38 method8908() {
	return ((Class162_Sub2) this).anInterface38_9699;
    }
    
    Class162_Sub2(Class173_Sub1 class173_sub1, int[] is) {
	((Class162_Sub2) this).aClass173_Sub1_9700 = class173_sub1;
	if (((Class162_Sub2) this).aClass173_Sub1_9700.aBool9368) {
	    byte[] is_0_ = method8909(is);
	    ((Class162_Sub2) this).anInterface38_9699
		= (((Class162_Sub2) this).aClass173_Sub1_9700.method8469
		   (Class149.aClass149_1676, 16, 16, 16, false, is_0_));
	} else
	    ((Class162_Sub2) this).anInterface38_9699
		= ((Class162_Sub2) this).aClass173_Sub1_9700
		      .method8516(256, 16, false, is);
    }
    
    byte[] method8909(int[] is) {
	byte[] is_1_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_2_ = 0; i_2_ < 16; i_2_++) {
		for (int i_3_ = 0; i_3_ < 16; i_3_++) {
		    int i_4_ = is[256 * i_2_ + 16 * i_3_ + i];
		    int i_5_ = (i_3_ * 256 + i_2_ * 16 + i) * 4;
		    if (((Class173_Sub1)
			 ((Class162_Sub2) this).aClass173_Sub1_9700).anInt9377
			== 0) {
			is_1_[i_5_ + 0] = (byte) (i_4_ & 0xff);
			is_1_[i_5_ + 1] = (byte) (i_4_ >> 8 & 0xff);
			is_1_[i_5_ + 2] = (byte) (i_4_ >> 16 & 0xff);
			is_1_[i_5_ + 3] = (byte) -1;
		    } else {
			is_1_[i_5_ + 0] = (byte) (i_4_ >> 16 & 0xff);
			is_1_[i_5_ + 1] = (byte) (i_4_ >> 8 & 0xff);
			is_1_[i_5_ + 2] = (byte) (i_4_ & 0xff);
			is_1_[i_5_ + 3] = (byte) -1;
		    }
		}
	    }
	}
	return is_1_;
    }
    
    byte[] method8910(int[] is) {
	byte[] is_6_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_7_ = 0; i_7_ < 16; i_7_++) {
		for (int i_8_ = 0; i_8_ < 16; i_8_++) {
		    int i_9_ = is[256 * i_7_ + 16 * i_8_ + i];
		    int i_10_ = (i_8_ * 256 + i_7_ * 16 + i) * 4;
		    if (((Class173_Sub1)
			 ((Class162_Sub2) this).aClass173_Sub1_9700).anInt9377
			== 0) {
			is_6_[i_10_ + 0] = (byte) (i_9_ & 0xff);
			is_6_[i_10_ + 1] = (byte) (i_9_ >> 8 & 0xff);
			is_6_[i_10_ + 2] = (byte) (i_9_ >> 16 & 0xff);
			is_6_[i_10_ + 3] = (byte) -1;
		    } else {
			is_6_[i_10_ + 0] = (byte) (i_9_ >> 16 & 0xff);
			is_6_[i_10_ + 1] = (byte) (i_9_ >> 8 & 0xff);
			is_6_[i_10_ + 2] = (byte) (i_9_ & 0xff);
			is_6_[i_10_ + 3] = (byte) -1;
		    }
		}
	    }
	}
	return is_6_;
    }
    
    byte[] method8911(int[] is) {
	byte[] is_11_ = new byte[16384];
	for (int i = 0; i < 16; i++) {
	    for (int i_12_ = 0; i_12_ < 16; i_12_++) {
		for (int i_13_ = 0; i_13_ < 16; i_13_++) {
		    int i_14_ = is[256 * i_12_ + 16 * i_13_ + i];
		    int i_15_ = (i_13_ * 256 + i_12_ * 16 + i) * 4;
		    if (((Class173_Sub1)
			 ((Class162_Sub2) this).aClass173_Sub1_9700).anInt9377
			== 0) {
			is_11_[i_15_ + 0] = (byte) (i_14_ & 0xff);
			is_11_[i_15_ + 1] = (byte) (i_14_ >> 8 & 0xff);
			is_11_[i_15_ + 2] = (byte) (i_14_ >> 16 & 0xff);
			is_11_[i_15_ + 3] = (byte) -1;
		    } else {
			is_11_[i_15_ + 0] = (byte) (i_14_ >> 16 & 0xff);
			is_11_[i_15_ + 1] = (byte) (i_14_ >> 8 & 0xff);
			is_11_[i_15_ + 2] = (byte) (i_14_ & 0xff);
			is_11_[i_15_ + 3] = (byte) -1;
		    }
		}
	    }
	}
	return is_11_;
    }
}
