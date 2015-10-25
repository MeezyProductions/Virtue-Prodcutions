/* Class34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class34
{
    static Random aRandom315;
    static Object anObject316 = new Object();
    
    public static int method763(int i) {
	int i_0_ = 0;
	if (i < 0 || i >= 65536) {
	    i >>>= 16;
	    i_0_ += 16;
	}
	if (i >= 256) {
	    i >>>= 8;
	    i_0_ += 8;
	}
	if (i >= 16) {
	    i >>>= 4;
	    i_0_ += 4;
	}
	if (i >= 4) {
	    i >>>= 2;
	    i_0_ += 2;
	}
	if (i >= 1) {
	    i >>>= 1;
	    i_0_++;
	}
	return i_0_ + i;
    }
    
    public static int method764(int i, int i_1_) {
	int i_2_ = 1;
	for (/**/; i_1_ > 1; i_1_ >>= 1) {
	    if (0 != (i_1_ & 0x1))
		i_2_ *= i;
	    i *= i;
	}
	if (i_1_ == 1)
	    return i_2_ * i;
	return i_2_;
    }
    
    public static int method765(int i) {
	int i_3_ = 0;
	if (i < 0 || i >= 65536) {
	    i >>>= 16;
	    i_3_ += 16;
	}
	if (i >= 256) {
	    i >>>= 8;
	    i_3_ += 8;
	}
	if (i >= 16) {
	    i >>>= 4;
	    i_3_ += 4;
	}
	if (i >= 4) {
	    i >>>= 2;
	    i_3_ += 2;
	}
	if (i >= 1) {
	    i >>>= 1;
	    i_3_++;
	}
	return i_3_ + i;
    }
    
    public static int method766(int i, int i_4_) {
	int i_5_ = 1;
	for (/**/; i_4_ > 1; i_4_ >>= 1) {
	    if (0 != (i_4_ & 0x1))
		i_5_ *= i;
	    i *= i;
	}
	if (i_4_ == 1)
	    return i_5_ * i;
	return i_5_;
    }
    
    public static int method767(int i) {
	i = --i | i >>> 1;
	i |= i >>> 2;
	i |= i >>> 4;
	i |= i >>> 8;
	i |= i >>> 16;
	return 1 + i;
    }
    
    public static int method768(int i) {
	int i_6_ = i >>> 1;
	i_6_ |= i_6_ >>> 1;
	i_6_ |= i_6_ >>> 2;
	i_6_ |= i_6_ >>> 4;
	i_6_ |= i_6_ >>> 8;
	i_6_ |= i_6_ >>> 16;
	return i & (i_6_ ^ 0xffffffff);
    }
    
    public static boolean method769(int i) {
	return (i & -i) == i;
    }
    
    public static int method770(int i, int i_7_) {
	int i_8_ = 0;
	for (/**/; i_7_ > 0; i_7_--) {
	    i_8_ = i_8_ << 1 | i & 0x1;
	    i >>>= 1;
	}
	return i_8_;
    }
    
    public static boolean method771(int i) {
	return (i & -i) == i;
    }
    
    public static int method772(int i, int i_9_) {
	int i_10_ = 1;
	for (/**/; i_9_ > 1; i_9_ >>= 1) {
	    if (0 != (i_9_ & 0x1))
		i_10_ *= i;
	    i *= i;
	}
	if (i_9_ == 1)
	    return i_10_ * i;
	return i_10_;
    }
    
    public static int method773(int i) {
	int i_11_ = 0;
	if (i < 0 || i >= 65536) {
	    i >>>= 16;
	    i_11_ += 16;
	}
	if (i >= 256) {
	    i >>>= 8;
	    i_11_ += 8;
	}
	if (i >= 16) {
	    i >>>= 4;
	    i_11_ += 4;
	}
	if (i >= 4) {
	    i >>>= 2;
	    i_11_ += 2;
	}
	if (i >= 1) {
	    i >>>= 1;
	    i_11_++;
	}
	return i_11_ + i;
    }
    
    public static int method774(int i) {
	int i_12_ = 0;
	if (i < 0 || i >= 65536) {
	    i >>>= 16;
	    i_12_ += 16;
	}
	if (i >= 256) {
	    i >>>= 8;
	    i_12_ += 8;
	}
	if (i >= 16) {
	    i >>>= 4;
	    i_12_ += 4;
	}
	if (i >= 4) {
	    i >>>= 2;
	    i_12_ += 2;
	}
	if (i >= 1) {
	    i >>>= 1;
	    i_12_++;
	}
	return i_12_ + i;
    }
    
    Class34() throws Throwable {
	throw new Error();
    }
    
    public static int method775(int i) {
	i = --i | i >>> 1;
	i |= i >>> 2;
	i |= i >>> 4;
	i |= i >>> 8;
	i |= i >>> 16;
	return 1 + i;
    }
    
    static int method776(int i, int i_13_) {
	int i_14_ = i >> 31 & i_13_ - 1;
	return i_14_ + ((i >>> 31) + i) % i_13_;
    }
    
    static int method777(int i, int i_15_) {
	int i_16_ = i >> 31 & i_15_ - 1;
	return i_16_ + ((i >>> 31) + i) % i_15_;
    }
    
    public static int method778(int i, int i_17_) {
	int i_18_ = 0;
	for (/**/; i_17_ > 0; i_17_--) {
	    i_18_ = i_18_ << 1 | i & 0x1;
	    i >>>= 1;
	}
	return i_18_;
    }
}
