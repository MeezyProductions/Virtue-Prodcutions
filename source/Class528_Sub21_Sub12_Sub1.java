/* Class528_Sub21_Sub12_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class528_Sub21_Sub12_Sub1 extends Class528_Sub21_Sub12
{
    int anInt11982;
    static final int anInt11983 = 16;
    int anInt11984;
    int anInt11985;
    int anInt11986;
    byte[] aByteArray11987;
    
    boolean method10821(int i, int i_0_) {
	return (((Class528_Sub21_Sub12_Sub1) this).aByteArray11987.length
		>= i * i_0_);
    }
    
    void method10822() {
	int i = -1;
	int i_1_
	    = ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987.length - 8;
	while (i < i_1_) {
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	}
	while (i
	       < ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987.length - 1)
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
    }
    
    boolean method10823(int i, int i_2_) {
	return (((Class528_Sub21_Sub12_Sub1) this).aByteArray11987.length
		>= i * i_2_);
    }
    
    void method10824() {
	int i = -1;
	int i_3_
	    = ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987.length - 8;
	while (i < i_3_) {
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	}
	while (i
	       < ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987.length - 1)
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
    }
    
    void method10825(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
	int i_9_ = 0;
	if (i_4_ != i)
	    i_9_ = (i_7_ - i_6_ << 16) / (i_4_ - i);
	int i_10_ = 0;
	if (i_5_ != i_4_)
	    i_10_ = (i_8_ - i_7_ << 16) / (i_5_ - i_4_);
	int i_11_ = 0;
	if (i_5_ != i)
	    i_11_ = (i_6_ - i_8_ << 16) / (i - i_5_);
	if (i <= i_4_ && i <= i_5_) {
	    if (i_4_ < i_5_) {
		i_8_ = i_6_ <<= 16;
		if (i < 0) {
		    i_8_ -= i_11_ * i;
		    i_6_ -= i_9_ * i;
		    i = 0;
		}
		i_7_ <<= 16;
		if (i_4_ < 0) {
		    i_7_ -= i_10_ * i_4_;
		    i_4_ = 0;
		}
		if (i != i_4_ && i_11_ < i_9_ || i == i_4_ && i_11_ > i_10_) {
		    i_5_ -= i_4_;
		    i_4_ -= i;
		    i *= ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		    while (--i_4_ >= 0) {
			method10827((((Class528_Sub21_Sub12_Sub1) this)
				     .aByteArray11987),
				    i, 0, i_8_ >> 16, i_6_ >> 16);
			i_8_ += i_11_;
			i_6_ += i_9_;
			i += ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		    }
		    while (--i_5_ >= 0) {
			method10827((((Class528_Sub21_Sub12_Sub1) this)
				     .aByteArray11987),
				    i, 0, i_8_ >> 16, i_7_ >> 16);
			i_8_ += i_11_;
			i_7_ += i_10_;
			i += ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		    }
		} else {
		    i_5_ -= i_4_;
		    i_4_ -= i;
		    i *= ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		    while (--i_4_ >= 0) {
			method10827((((Class528_Sub21_Sub12_Sub1) this)
				     .aByteArray11987),
				    i, 0, i_6_ >> 16, i_8_ >> 16);
			i_8_ += i_11_;
			i_6_ += i_9_;
			i += ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		    }
		    while (--i_5_ >= 0) {
			method10827((((Class528_Sub21_Sub12_Sub1) this)
				     .aByteArray11987),
				    i, 0, i_7_ >> 16, i_8_ >> 16);
			i_8_ += i_11_;
			i_7_ += i_10_;
			i += ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		    }
		}
	    } else {
		i_7_ = i_6_ <<= 16;
		if (i < 0) {
		    i_7_ -= i_11_ * i;
		    i_6_ -= i_9_ * i;
		    i = 0;
		}
		i_8_ <<= 16;
		if (i_5_ < 0) {
		    i_8_ -= i_10_ * i_5_;
		    i_5_ = 0;
		}
		if (i != i_5_ && i_11_ < i_9_ || i == i_5_ && i_10_ > i_9_) {
		    i_4_ -= i_5_;
		    i_5_ -= i;
		    i *= ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		    while (--i_5_ >= 0) {
			method10827((((Class528_Sub21_Sub12_Sub1) this)
				     .aByteArray11987),
				    i, 0, i_7_ >> 16, i_6_ >> 16);
			i_7_ += i_11_;
			i_6_ += i_9_;
			i += ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		    }
		    while (--i_4_ >= 0) {
			method10827((((Class528_Sub21_Sub12_Sub1) this)
				     .aByteArray11987),
				    i, 0, i_8_ >> 16, i_6_ >> 16);
			i_8_ += i_10_;
			i_6_ += i_9_;
			i += ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		    }
		} else {
		    i_4_ -= i_5_;
		    i_5_ -= i;
		    i *= ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		    while (--i_5_ >= 0) {
			method10827((((Class528_Sub21_Sub12_Sub1) this)
				     .aByteArray11987),
				    i, 0, i_6_ >> 16, i_7_ >> 16);
			i_7_ += i_11_;
			i_6_ += i_9_;
			i += ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		    }
		    while (--i_4_ >= 0) {
			method10827((((Class528_Sub21_Sub12_Sub1) this)
				     .aByteArray11987),
				    i, 0, i_6_ >> 16, i_8_ >> 16);
			i_8_ += i_10_;
			i_6_ += i_9_;
			i += ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		    }
		}
	    }
	} else if (i_4_ <= i_5_) {
	    if (i_5_ < i) {
		i_6_ = i_7_ <<= 16;
		if (i_4_ < 0) {
		    i_6_ -= i_9_ * i_4_;
		    i_7_ -= i_10_ * i_4_;
		    i_4_ = 0;
		}
		i_8_ <<= 16;
		if (i_5_ < 0) {
		    i_8_ -= i_11_ * i_5_;
		    i_5_ = 0;
		}
		if (i_4_ != i_5_ && i_9_ < i_10_
		    || i_4_ == i_5_ && i_9_ > i_11_) {
		    i -= i_5_;
		    i_5_ -= i_4_;
		    i_4_ *= ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		    while (--i_5_ >= 0) {
			method10827((((Class528_Sub21_Sub12_Sub1) this)
				     .aByteArray11987),
				    i_4_, 0, i_6_ >> 16, i_7_ >> 16);
			i_6_ += i_9_;
			i_7_ += i_10_;
			i_4_ += ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		    }
		    while (--i >= 0) {
			method10827((((Class528_Sub21_Sub12_Sub1) this)
				     .aByteArray11987),
				    i_4_, 0, i_6_ >> 16, i_8_ >> 16);
			i_6_ += i_9_;
			i_8_ += i_11_;
			i_4_ += ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		    }
		} else {
		    i -= i_5_;
		    i_5_ -= i_4_;
		    i_4_ *= ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		    while (--i_5_ >= 0) {
			method10827((((Class528_Sub21_Sub12_Sub1) this)
				     .aByteArray11987),
				    i_4_, 0, i_7_ >> 16, i_6_ >> 16);
			i_6_ += i_9_;
			i_7_ += i_10_;
			i_4_ += ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		    }
		    while (--i >= 0) {
			method10827((((Class528_Sub21_Sub12_Sub1) this)
				     .aByteArray11987),
				    i_4_, 0, i_8_ >> 16, i_6_ >> 16);
			i_6_ += i_9_;
			i_8_ += i_11_;
			i_4_ += ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		    }
		}
	    } else {
		i_8_ = i_7_ <<= 16;
		if (i_4_ < 0) {
		    i_8_ -= i_9_ * i_4_;
		    i_7_ -= i_10_ * i_4_;
		    i_4_ = 0;
		}
		i_6_ <<= 16;
		if (i < 0) {
		    i_6_ -= i_11_ * i;
		    i = 0;
		}
		if (i_9_ < i_10_) {
		    i_5_ -= i;
		    i -= i_4_;
		    i_4_ *= ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		    while (--i >= 0) {
			method10827((((Class528_Sub21_Sub12_Sub1) this)
				     .aByteArray11987),
				    i_4_, 0, i_8_ >> 16, i_7_ >> 16);
			i_8_ += i_9_;
			i_7_ += i_10_;
			i_4_ += ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		    }
		    while (--i_5_ >= 0) {
			method10827((((Class528_Sub21_Sub12_Sub1) this)
				     .aByteArray11987),
				    i_4_, 0, i_6_ >> 16, i_7_ >> 16);
			i_6_ += i_11_;
			i_7_ += i_10_;
			i_4_ += ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		    }
		} else {
		    i_5_ -= i;
		    i -= i_4_;
		    i_4_ *= ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		    while (--i >= 0) {
			method10827((((Class528_Sub21_Sub12_Sub1) this)
				     .aByteArray11987),
				    i_4_, 0, i_7_ >> 16, i_8_ >> 16);
			i_8_ += i_9_;
			i_7_ += i_10_;
			i_4_ += ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		    }
		    while (--i_5_ >= 0) {
			method10827((((Class528_Sub21_Sub12_Sub1) this)
				     .aByteArray11987),
				    i_4_, 0, i_7_ >> 16, i_6_ >> 16);
			i_6_ += i_11_;
			i_7_ += i_10_;
			i_4_ += ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		    }
		}
	    }
	} else if (i < i_4_) {
	    i_7_ = i_8_ <<= 16;
	    if (i_5_ < 0) {
		i_7_ -= i_10_ * i_5_;
		i_8_ -= i_11_ * i_5_;
		i_5_ = 0;
	    }
	    i_6_ <<= 16;
	    if (i < 0) {
		i_6_ -= i_9_ * i;
		i = 0;
	    }
	    if (i_10_ < i_11_) {
		i_4_ -= i;
		i -= i_5_;
		i_5_ *= ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		while (--i >= 0) {
		    method10827((((Class528_Sub21_Sub12_Sub1) this)
				 .aByteArray11987),
				i_5_, 0, i_7_ >> 16, i_8_ >> 16);
		    i_7_ += i_10_;
		    i_8_ += i_11_;
		    i_5_ += ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		}
		while (--i_4_ >= 0) {
		    method10827((((Class528_Sub21_Sub12_Sub1) this)
				 .aByteArray11987),
				i_5_, 0, i_7_ >> 16, i_6_ >> 16);
		    i_7_ += i_10_;
		    i_6_ += i_9_;
		    i_5_ += ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		}
	    } else {
		i_4_ -= i;
		i -= i_5_;
		i_5_ *= ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		while (--i >= 0) {
		    method10827((((Class528_Sub21_Sub12_Sub1) this)
				 .aByteArray11987),
				i_5_, 0, i_8_ >> 16, i_7_ >> 16);
		    i_7_ += i_10_;
		    i_8_ += i_11_;
		    i_5_ += ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		}
		while (--i_4_ >= 0) {
		    method10827((((Class528_Sub21_Sub12_Sub1) this)
				 .aByteArray11987),
				i_5_, 0, i_6_ >> 16, i_7_ >> 16);
		    i_7_ += i_10_;
		    i_6_ += i_9_;
		    i_5_ += ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		}
	    }
	} else {
	    i_6_ = i_8_ <<= 16;
	    if (i_5_ < 0) {
		i_6_ -= i_10_ * i_5_;
		i_8_ -= i_11_ * i_5_;
		i_5_ = 0;
	    }
	    i_7_ <<= 16;
	    if (i_4_ < 0) {
		i_7_ -= i_9_ * i_4_;
		i_4_ = 0;
	    }
	    if (i_10_ < i_11_) {
		i -= i_4_;
		i_4_ -= i_5_;
		i_5_ *= ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		while (--i_4_ >= 0) {
		    method10827((((Class528_Sub21_Sub12_Sub1) this)
				 .aByteArray11987),
				i_5_, 0, i_6_ >> 16, i_8_ >> 16);
		    i_6_ += i_10_;
		    i_8_ += i_11_;
		    i_5_ += ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		}
		while (--i >= 0) {
		    method10827((((Class528_Sub21_Sub12_Sub1) this)
				 .aByteArray11987),
				i_5_, 0, i_7_ >> 16, i_8_ >> 16);
		    i_7_ += i_9_;
		    i_8_ += i_11_;
		    i_5_ += ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		}
	    } else {
		i -= i_4_;
		i_4_ -= i_5_;
		i_5_ *= ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		while (--i_4_ >= 0) {
		    method10827((((Class528_Sub21_Sub12_Sub1) this)
				 .aByteArray11987),
				i_5_, 0, i_8_ >> 16, i_6_ >> 16);
		    i_6_ += i_10_;
		    i_8_ += i_11_;
		    i_5_ += ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		}
		while (--i >= 0) {
		    method10827((((Class528_Sub21_Sub12_Sub1) this)
				 .aByteArray11987),
				i_5_, 0, i_8_ >> 16, i_7_ >> 16);
		    i_7_ += i_9_;
		    i_8_ += i_11_;
		    i_5_ += ((Class528_Sub21_Sub12_Sub1) this).anInt11984;
		}
	    }
	}
    }
    
    Class528_Sub21_Sub12_Sub1(Class173_Sub1 class173_sub1, int i, int i_12_) {
	((Class528_Sub21_Sub12_Sub1) this).aByteArray11987
	    = new byte[i * i_12_];
    }
    
    boolean method10826(int i, int i_13_) {
	return (((Class528_Sub21_Sub12_Sub1) this).aByteArray11987.length
		>= i * i_13_);
    }
    
    static final void method10827(byte[] is, int i, int i_14_, int i_15_,
				  int i_16_) {
	if (i_15_ < i_16_) {
	    i += i_15_;
	    i_14_ = i_16_ - i_15_ >> 2;
	    while (--i_14_ >= 0) {
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
	    }
	    i_14_ = i_16_ - i_15_ & 0x3;
	    while (--i_14_ >= 0)
		is[i++] = (byte) 1;
	}
    }
    
    void method10828() {
	int i = -1;
	int i_17_
	    = ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987.length - 8;
	while (i < i_17_) {
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	}
	while (i
	       < ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987.length - 1)
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
    }
    
    void method10829(int i, int i_18_, int i_19_, int i_20_) {
	((Class528_Sub21_Sub12_Sub1) this).anInt11982 = i;
	((Class528_Sub21_Sub12_Sub1) this).anInt11985 = i_18_;
	((Class528_Sub21_Sub12_Sub1) this).anInt11984 = i_19_ - i;
	((Class528_Sub21_Sub12_Sub1) this).anInt11986 = i_20_ - i_18_;
    }
    
    void method10830() {
	int i = -1;
	int i_21_
	    = ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987.length - 8;
	while (i < i_21_) {
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
	}
	while (i
	       < ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987.length - 1)
	    ((Class528_Sub21_Sub12_Sub1) this).aByteArray11987[++i] = (byte) 0;
    }
    
    boolean method10831(int i, int i_22_) {
	return (((Class528_Sub21_Sub12_Sub1) this).aByteArray11987.length
		>= i * i_22_);
    }
}
