/* Class528_Sub21_Sub12_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class528_Sub21_Sub12_Sub2 extends Class528_Sub21_Sub12
{
    static final int anInt12001 = 16;
    int anInt12002;
    byte[] aByteArray12003;
    int anInt12004;
    int anInt12005;
    int anInt12006;
    
    boolean method10865(int i, int i_0_) {
	return (((Class528_Sub21_Sub12_Sub2) this).aByteArray12003.length
		>= i * i_0_);
    }
    
    void method10866(int i, int i_1_, int i_2_, int i_3_) {
	((Class528_Sub21_Sub12_Sub2) this).anInt12004 = i;
	((Class528_Sub21_Sub12_Sub2) this).anInt12005 = i_1_;
	((Class528_Sub21_Sub12_Sub2) this).anInt12002 = i_2_ - i;
	((Class528_Sub21_Sub12_Sub2) this).anInt12006 = i_3_ - i_1_;
    }
    
    Class528_Sub21_Sub12_Sub2(Class173_Sub2 class173_sub2, int i, int i_4_) {
	((Class528_Sub21_Sub12_Sub2) this).aByteArray12003
	    = new byte[i * i_4_];
    }
    
    void method10867(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
	int i_10_ = 0;
	if (i_5_ != i)
	    i_10_ = (i_8_ - i_7_ << 16) / (i_5_ - i);
	int i_11_ = 0;
	if (i_6_ != i_5_)
	    i_11_ = (i_9_ - i_8_ << 16) / (i_6_ - i_5_);
	int i_12_ = 0;
	if (i_6_ != i)
	    i_12_ = (i_7_ - i_9_ << 16) / (i - i_6_);
	if (i <= i_5_ && i <= i_6_) {
	    if (i_5_ < i_6_) {
		i_9_ = i_7_ <<= 16;
		if (i < 0) {
		    i_9_ -= i_12_ * i;
		    i_7_ -= i_10_ * i;
		    i = 0;
		}
		i_8_ <<= 16;
		if (i_5_ < 0) {
		    i_8_ -= i_11_ * i_5_;
		    i_5_ = 0;
		}
		if (i != i_5_ && i_12_ < i_10_ || i == i_5_ && i_12_ > i_11_) {
		    i_6_ -= i_5_;
		    i_5_ -= i;
		    i *= ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		    while (--i_5_ >= 0) {
			method10868((((Class528_Sub21_Sub12_Sub2) this)
				     .aByteArray12003),
				    i, 0, i_9_ >> 16, i_7_ >> 16);
			i_9_ += i_12_;
			i_7_ += i_10_;
			i += ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		    }
		    while (--i_6_ >= 0) {
			method10868((((Class528_Sub21_Sub12_Sub2) this)
				     .aByteArray12003),
				    i, 0, i_9_ >> 16, i_8_ >> 16);
			i_9_ += i_12_;
			i_8_ += i_11_;
			i += ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		    }
		} else {
		    i_6_ -= i_5_;
		    i_5_ -= i;
		    i *= ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		    while (--i_5_ >= 0) {
			method10868((((Class528_Sub21_Sub12_Sub2) this)
				     .aByteArray12003),
				    i, 0, i_7_ >> 16, i_9_ >> 16);
			i_9_ += i_12_;
			i_7_ += i_10_;
			i += ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		    }
		    while (--i_6_ >= 0) {
			method10868((((Class528_Sub21_Sub12_Sub2) this)
				     .aByteArray12003),
				    i, 0, i_8_ >> 16, i_9_ >> 16);
			i_9_ += i_12_;
			i_8_ += i_11_;
			i += ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		    }
		}
	    } else {
		i_8_ = i_7_ <<= 16;
		if (i < 0) {
		    i_8_ -= i_12_ * i;
		    i_7_ -= i_10_ * i;
		    i = 0;
		}
		i_9_ <<= 16;
		if (i_6_ < 0) {
		    i_9_ -= i_11_ * i_6_;
		    i_6_ = 0;
		}
		if (i != i_6_ && i_12_ < i_10_ || i == i_6_ && i_11_ > i_10_) {
		    i_5_ -= i_6_;
		    i_6_ -= i;
		    i *= ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		    while (--i_6_ >= 0) {
			method10868((((Class528_Sub21_Sub12_Sub2) this)
				     .aByteArray12003),
				    i, 0, i_8_ >> 16, i_7_ >> 16);
			i_8_ += i_12_;
			i_7_ += i_10_;
			i += ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		    }
		    while (--i_5_ >= 0) {
			method10868((((Class528_Sub21_Sub12_Sub2) this)
				     .aByteArray12003),
				    i, 0, i_9_ >> 16, i_7_ >> 16);
			i_9_ += i_11_;
			i_7_ += i_10_;
			i += ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		    }
		} else {
		    i_5_ -= i_6_;
		    i_6_ -= i;
		    i *= ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		    while (--i_6_ >= 0) {
			method10868((((Class528_Sub21_Sub12_Sub2) this)
				     .aByteArray12003),
				    i, 0, i_7_ >> 16, i_8_ >> 16);
			i_8_ += i_12_;
			i_7_ += i_10_;
			i += ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		    }
		    while (--i_5_ >= 0) {
			method10868((((Class528_Sub21_Sub12_Sub2) this)
				     .aByteArray12003),
				    i, 0, i_7_ >> 16, i_9_ >> 16);
			i_9_ += i_11_;
			i_7_ += i_10_;
			i += ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		    }
		}
	    }
	} else if (i_5_ <= i_6_) {
	    if (i_6_ < i) {
		i_7_ = i_8_ <<= 16;
		if (i_5_ < 0) {
		    i_7_ -= i_10_ * i_5_;
		    i_8_ -= i_11_ * i_5_;
		    i_5_ = 0;
		}
		i_9_ <<= 16;
		if (i_6_ < 0) {
		    i_9_ -= i_12_ * i_6_;
		    i_6_ = 0;
		}
		if (i_5_ != i_6_ && i_10_ < i_11_
		    || i_5_ == i_6_ && i_10_ > i_12_) {
		    i -= i_6_;
		    i_6_ -= i_5_;
		    i_5_ *= ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		    while (--i_6_ >= 0) {
			method10868((((Class528_Sub21_Sub12_Sub2) this)
				     .aByteArray12003),
				    i_5_, 0, i_7_ >> 16, i_8_ >> 16);
			i_7_ += i_10_;
			i_8_ += i_11_;
			i_5_ += ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		    }
		    while (--i >= 0) {
			method10868((((Class528_Sub21_Sub12_Sub2) this)
				     .aByteArray12003),
				    i_5_, 0, i_7_ >> 16, i_9_ >> 16);
			i_7_ += i_10_;
			i_9_ += i_12_;
			i_5_ += ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		    }
		} else {
		    i -= i_6_;
		    i_6_ -= i_5_;
		    i_5_ *= ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		    while (--i_6_ >= 0) {
			method10868((((Class528_Sub21_Sub12_Sub2) this)
				     .aByteArray12003),
				    i_5_, 0, i_8_ >> 16, i_7_ >> 16);
			i_7_ += i_10_;
			i_8_ += i_11_;
			i_5_ += ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		    }
		    while (--i >= 0) {
			method10868((((Class528_Sub21_Sub12_Sub2) this)
				     .aByteArray12003),
				    i_5_, 0, i_9_ >> 16, i_7_ >> 16);
			i_7_ += i_10_;
			i_9_ += i_12_;
			i_5_ += ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		    }
		}
	    } else {
		i_9_ = i_8_ <<= 16;
		if (i_5_ < 0) {
		    i_9_ -= i_10_ * i_5_;
		    i_8_ -= i_11_ * i_5_;
		    i_5_ = 0;
		}
		i_7_ <<= 16;
		if (i < 0) {
		    i_7_ -= i_12_ * i;
		    i = 0;
		}
		if (i_10_ < i_11_) {
		    i_6_ -= i;
		    i -= i_5_;
		    i_5_ *= ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		    while (--i >= 0) {
			method10868((((Class528_Sub21_Sub12_Sub2) this)
				     .aByteArray12003),
				    i_5_, 0, i_9_ >> 16, i_8_ >> 16);
			i_9_ += i_10_;
			i_8_ += i_11_;
			i_5_ += ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		    }
		    while (--i_6_ >= 0) {
			method10868((((Class528_Sub21_Sub12_Sub2) this)
				     .aByteArray12003),
				    i_5_, 0, i_7_ >> 16, i_8_ >> 16);
			i_7_ += i_12_;
			i_8_ += i_11_;
			i_5_ += ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		    }
		} else {
		    i_6_ -= i;
		    i -= i_5_;
		    i_5_ *= ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		    while (--i >= 0) {
			method10868((((Class528_Sub21_Sub12_Sub2) this)
				     .aByteArray12003),
				    i_5_, 0, i_8_ >> 16, i_9_ >> 16);
			i_9_ += i_10_;
			i_8_ += i_11_;
			i_5_ += ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		    }
		    while (--i_6_ >= 0) {
			method10868((((Class528_Sub21_Sub12_Sub2) this)
				     .aByteArray12003),
				    i_5_, 0, i_8_ >> 16, i_7_ >> 16);
			i_7_ += i_12_;
			i_8_ += i_11_;
			i_5_ += ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		    }
		}
	    }
	} else if (i < i_5_) {
	    i_8_ = i_9_ <<= 16;
	    if (i_6_ < 0) {
		i_8_ -= i_11_ * i_6_;
		i_9_ -= i_12_ * i_6_;
		i_6_ = 0;
	    }
	    i_7_ <<= 16;
	    if (i < 0) {
		i_7_ -= i_10_ * i;
		i = 0;
	    }
	    if (i_11_ < i_12_) {
		i_5_ -= i;
		i -= i_6_;
		i_6_ *= ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		while (--i >= 0) {
		    method10868((((Class528_Sub21_Sub12_Sub2) this)
				 .aByteArray12003),
				i_6_, 0, i_8_ >> 16, i_9_ >> 16);
		    i_8_ += i_11_;
		    i_9_ += i_12_;
		    i_6_ += ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		}
		while (--i_5_ >= 0) {
		    method10868((((Class528_Sub21_Sub12_Sub2) this)
				 .aByteArray12003),
				i_6_, 0, i_8_ >> 16, i_7_ >> 16);
		    i_8_ += i_11_;
		    i_7_ += i_10_;
		    i_6_ += ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		}
	    } else {
		i_5_ -= i;
		i -= i_6_;
		i_6_ *= ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		while (--i >= 0) {
		    method10868((((Class528_Sub21_Sub12_Sub2) this)
				 .aByteArray12003),
				i_6_, 0, i_9_ >> 16, i_8_ >> 16);
		    i_8_ += i_11_;
		    i_9_ += i_12_;
		    i_6_ += ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		}
		while (--i_5_ >= 0) {
		    method10868((((Class528_Sub21_Sub12_Sub2) this)
				 .aByteArray12003),
				i_6_, 0, i_7_ >> 16, i_8_ >> 16);
		    i_8_ += i_11_;
		    i_7_ += i_10_;
		    i_6_ += ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		}
	    }
	} else {
	    i_7_ = i_9_ <<= 16;
	    if (i_6_ < 0) {
		i_7_ -= i_11_ * i_6_;
		i_9_ -= i_12_ * i_6_;
		i_6_ = 0;
	    }
	    i_8_ <<= 16;
	    if (i_5_ < 0) {
		i_8_ -= i_10_ * i_5_;
		i_5_ = 0;
	    }
	    if (i_11_ < i_12_) {
		i -= i_5_;
		i_5_ -= i_6_;
		i_6_ *= ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		while (--i_5_ >= 0) {
		    method10868((((Class528_Sub21_Sub12_Sub2) this)
				 .aByteArray12003),
				i_6_, 0, i_7_ >> 16, i_9_ >> 16);
		    i_7_ += i_11_;
		    i_9_ += i_12_;
		    i_6_ += ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		}
		while (--i >= 0) {
		    method10868((((Class528_Sub21_Sub12_Sub2) this)
				 .aByteArray12003),
				i_6_, 0, i_8_ >> 16, i_9_ >> 16);
		    i_8_ += i_10_;
		    i_9_ += i_12_;
		    i_6_ += ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		}
	    } else {
		i -= i_5_;
		i_5_ -= i_6_;
		i_6_ *= ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		while (--i_5_ >= 0) {
		    method10868((((Class528_Sub21_Sub12_Sub2) this)
				 .aByteArray12003),
				i_6_, 0, i_9_ >> 16, i_7_ >> 16);
		    i_7_ += i_11_;
		    i_9_ += i_12_;
		    i_6_ += ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		}
		while (--i >= 0) {
		    method10868((((Class528_Sub21_Sub12_Sub2) this)
				 .aByteArray12003),
				i_6_, 0, i_9_ >> 16, i_8_ >> 16);
		    i_8_ += i_10_;
		    i_9_ += i_12_;
		    i_6_ += ((Class528_Sub21_Sub12_Sub2) this).anInt12002;
		}
	    }
	}
    }
    
    static final void method10868(byte[] is, int i, int i_13_, int i_14_,
				  int i_15_) {
	if (i_14_ < i_15_) {
	    i += i_14_;
	    i_13_ = i_15_ - i_14_ >> 2;
	    while (--i_13_ >= 0) {
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
	    }
	    i_13_ = i_15_ - i_14_ & 0x3;
	    while (--i_13_ >= 0)
		is[i++] = (byte) 1;
	}
    }
    
    void method10869(int i, int i_16_, int i_17_, int i_18_) {
	((Class528_Sub21_Sub12_Sub2) this).anInt12004 = i;
	((Class528_Sub21_Sub12_Sub2) this).anInt12005 = i_16_;
	((Class528_Sub21_Sub12_Sub2) this).anInt12002 = i_17_ - i;
	((Class528_Sub21_Sub12_Sub2) this).anInt12006 = i_18_ - i_16_;
    }
    
    void method10870() {
	int i = -1;
	int i_19_
	    = ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003.length - 8;
	while (i < i_19_) {
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	}
	while (i
	       < ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003.length - 1)
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
    }
    
    void method10871(int i, int i_20_, int i_21_, int i_22_) {
	((Class528_Sub21_Sub12_Sub2) this).anInt12004 = i;
	((Class528_Sub21_Sub12_Sub2) this).anInt12005 = i_20_;
	((Class528_Sub21_Sub12_Sub2) this).anInt12002 = i_21_ - i;
	((Class528_Sub21_Sub12_Sub2) this).anInt12006 = i_22_ - i_20_;
    }
    
    boolean method10872(int i, int i_23_) {
	return (((Class528_Sub21_Sub12_Sub2) this).aByteArray12003.length
		>= i * i_23_);
    }
    
    boolean method10873(int i, int i_24_) {
	return (((Class528_Sub21_Sub12_Sub2) this).aByteArray12003.length
		>= i * i_24_);
    }
    
    void method10874() {
	int i = -1;
	int i_25_
	    = ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003.length - 8;
	while (i < i_25_) {
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	}
	while (i
	       < ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003.length - 1)
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
    }
    
    void method10875() {
	int i = -1;
	int i_26_
	    = ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003.length - 8;
	while (i < i_26_) {
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	}
	while (i
	       < ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003.length - 1)
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
    }
    
    void method10876() {
	int i = -1;
	int i_27_
	    = ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003.length - 8;
	while (i < i_27_) {
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
	}
	while (i
	       < ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003.length - 1)
	    ((Class528_Sub21_Sub12_Sub2) this).aByteArray12003[++i] = (byte) 0;
    }
    
    boolean method10877(int i, int i_28_) {
	return (((Class528_Sub21_Sub12_Sub2) this).aByteArray12003.length
		>= i * i_28_);
    }
}
