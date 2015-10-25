/* Class254 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Class254
{
    int[] anIntArray2803;
    byte[] aByteArray2804;
    int[] anIntArray2805;
    
    int method3440(byte[] is, int i, int i_0_, byte[] is_1_, int i_2_,
		   int i_3_) {
	int i_4_ = 0;
	int i_5_ = i_2_ << 3;
	for (i_0_ += i; i < i_0_; i++) {
	    int i_6_ = is[i] & 0xff;
	    int i_7_ = ((Class254) this).anIntArray2803[i_6_];
	    int i_8_ = ((Class254) this).aByteArray2804[i_6_];
	    if (i_8_ == 0)
		throw new RuntimeException(new StringBuilder().append("")
					       .append
					       (i_6_).toString());
	    int i_9_ = i_5_ >> 3;
	    int i_10_ = i_5_ & 0x7;
	    i_4_ &= -i_10_ >> 31;
	    int i_11_ = (i_8_ + i_10_ - 1 >> 3) + i_9_;
	    i_10_ += 24;
	    is_1_[i_9_] = (byte) (i_4_ |= i_7_ >>> i_10_);
	    if (i_9_ < i_11_) {
		i_9_++;
		i_10_ -= 8;
		is_1_[i_9_] = (byte) (i_4_ = i_7_ >>> i_10_);
		if (i_9_ < i_11_) {
		    i_9_++;
		    i_10_ -= 8;
		    is_1_[i_9_] = (byte) (i_4_ = i_7_ >>> i_10_);
		    if (i_9_ < i_11_) {
			i_9_++;
			i_10_ -= 8;
			is_1_[i_9_] = (byte) (i_4_ = i_7_ >>> i_10_);
			if (i_9_ < i_11_) {
			    i_9_++;
			    i_10_ -= 8;
			    is_1_[i_9_] = (byte) (i_4_ = i_7_ << -i_10_);
			}
		    }
		}
	    }
	    i_5_ += i_8_;
	}
	return (7 + i_5_ >> 3) - i_2_;
    }
    
    int method3441(byte[] is, int i, byte[] is_12_, int i_13_, int i_14_,
		   short i_15_) {
	if (i_14_ == 0)
	    return 0;
	int i_16_ = 0;
	i_14_ += i_13_;
	int i_17_ = i;
	for (;;) {
	    byte i_18_ = is[i_17_];
	    if (i_18_ < 0)
		i_16_ = ((Class254) this).anIntArray2805[i_16_];
	    else
		i_16_++;
	    int i_19_;
	    if ((i_19_ = ((Class254) this).anIntArray2805[i_16_]) < 0) {
		is_12_[i_13_++] = (byte) (i_19_ ^ 0xffffffff);
		if (i_13_ >= i_14_)
		    break;
		i_16_ = 0;
	    }
	    if ((i_18_ & 0x40) != 0)
		i_16_ = ((Class254) this).anIntArray2805[i_16_];
	    else
		i_16_++;
	    if ((i_19_ = ((Class254) this).anIntArray2805[i_16_]) < 0) {
		is_12_[i_13_++] = (byte) (i_19_ ^ 0xffffffff);
		if (i_13_ >= i_14_)
		    break;
		i_16_ = 0;
	    }
	    if ((i_18_ & 0x20) != 0)
		i_16_ = ((Class254) this).anIntArray2805[i_16_];
	    else
		i_16_++;
	    if ((i_19_ = ((Class254) this).anIntArray2805[i_16_]) < 0) {
		is_12_[i_13_++] = (byte) (i_19_ ^ 0xffffffff);
		if (i_13_ >= i_14_)
		    break;
		i_16_ = 0;
	    }
	    if ((i_18_ & 0x10) != 0)
		i_16_ = ((Class254) this).anIntArray2805[i_16_];
	    else
		i_16_++;
	    if ((i_19_ = ((Class254) this).anIntArray2805[i_16_]) < 0) {
		is_12_[i_13_++] = (byte) (i_19_ ^ 0xffffffff);
		if (i_13_ >= i_14_)
		    break;
		i_16_ = 0;
	    }
	    if (0 != (i_18_ & 0x8))
		i_16_ = ((Class254) this).anIntArray2805[i_16_];
	    else
		i_16_++;
	    if ((i_19_ = ((Class254) this).anIntArray2805[i_16_]) < 0) {
		is_12_[i_13_++] = (byte) (i_19_ ^ 0xffffffff);
		if (i_13_ >= i_14_)
		    break;
		i_16_ = 0;
	    }
	    if (0 != (i_18_ & 0x4))
		i_16_ = ((Class254) this).anIntArray2805[i_16_];
	    else
		i_16_++;
	    if ((i_19_ = ((Class254) this).anIntArray2805[i_16_]) < 0) {
		is_12_[i_13_++] = (byte) (i_19_ ^ 0xffffffff);
		if (i_13_ >= i_14_)
		    break;
		i_16_ = 0;
	    }
	    if (0 != (i_18_ & 0x2))
		i_16_ = ((Class254) this).anIntArray2805[i_16_];
	    else
		i_16_++;
	    if ((i_19_ = ((Class254) this).anIntArray2805[i_16_]) < 0) {
		is_12_[i_13_++] = (byte) (i_19_ ^ 0xffffffff);
		if (i_13_ >= i_14_)
		    break;
		i_16_ = 0;
	    }
	    if ((i_18_ & 0x1) != 0)
		i_16_ = ((Class254) this).anIntArray2805[i_16_];
	    else
		i_16_++;
	    if ((i_19_ = ((Class254) this).anIntArray2805[i_16_]) < 0) {
		is_12_[i_13_++] = (byte) (i_19_ ^ 0xffffffff);
		if (i_13_ >= i_14_)
		    break;
		i_16_ = 0;
	    }
	    i_17_++;
	}
	return i_17_ + 1 - i;
    }
    
    public Class254(byte[] is) {
	int i = is.length;
	((Class254) this).anIntArray2803 = new int[i];
	((Class254) this).aByteArray2804 = is;
	int[] is_20_ = new int[33];
	((Class254) this).anIntArray2805 = new int[8];
	int i_21_ = 0;
	for (int i_22_ = 0; i_22_ < i; i_22_++) {
	    int i_23_ = is[i_22_];
	    if (0 != i_23_) {
		int i_24_ = 1 << 32 - i_23_;
		int i_25_ = is_20_[i_23_];
		((Class254) this).anIntArray2803[i_22_] = i_25_;
		int i_26_;
		if ((i_25_ & i_24_) != 0)
		    i_26_ = is_20_[i_23_ - 1];
		else {
		    i_26_ = i_25_ | i_24_;
		    for (int i_27_ = i_23_ - 1; i_27_ >= 1; i_27_--) {
			int i_28_ = is_20_[i_27_];
			if (i_28_ != i_25_)
			    break;
			int i_29_ = 1 << 32 - i_27_;
			if ((i_28_ & i_29_) != 0) {
			    is_20_[i_27_] = is_20_[i_27_ - 1];
			    break;
			}
			is_20_[i_27_] = i_28_ | i_29_;
		    }
		}
		is_20_[i_23_] = i_26_;
		for (int i_30_ = 1 + i_23_; i_30_ <= 32; i_30_++) {
		    if (i_25_ == is_20_[i_30_])
			is_20_[i_30_] = i_26_;
		}
		int i_31_ = 0;
		for (int i_32_ = 0; i_32_ < i_23_; i_32_++) {
		    int i_33_ = -2147483648 >>> i_32_;
		    if ((i_25_ & i_33_) != 0) {
			if (((Class254) this).anIntArray2805[i_31_] == 0)
			    ((Class254) this).anIntArray2805[i_31_] = i_21_;
			i_31_ = ((Class254) this).anIntArray2805[i_31_];
		    } else
			i_31_++;
		    if (i_31_ >= ((Class254) this).anIntArray2805.length) {
			int[] is_34_
			    = (new int
			       [2 * ((Class254) this).anIntArray2805.length]);
			for (int i_35_ = 0;
			     i_35_ < ((Class254) this).anIntArray2805.length;
			     i_35_++)
			    is_34_[i_35_]
				= ((Class254) this).anIntArray2805[i_35_];
			((Class254) this).anIntArray2805 = is_34_;
		    }
		    i_33_ >>>= 1;
		}
		((Class254) this).anIntArray2805[i_31_] = i_22_ ^ 0xffffffff;
		if (i_31_ >= i_21_)
		    i_21_ = 1 + i_31_;
	    }
	}
    }
    
    static byte[] method3442(InputStream inputstream, int i, int i_36_)
	throws IOException {
	byte[] is = new byte[5];
	if (inputstream.read(is, 0, 5) != 5)
	    throw new IOException("2");
	ByteArrayOutputStream bytearrayoutputstream
	    = new ByteArrayOutputStream(i);
	synchronized (Class523.aClass524_7052) {
	    if (!Class523.aClass524_7052.method6381(is, -1718322616))
		throw new IOException("3");
	    Class523.aClass524_7052
		.method6377(inputstream, bytearrayoutputstream, (long) i);
	}
	bytearrayoutputstream.flush();
	return bytearrayoutputstream.toByteArray();
    }
    
    static final void method3443(Class648 class648, byte i) {
	((Class648) class648).anInt8399 -= 464011950;
	if ((((Class648) class648).aLongArray8398
	     [683825767 * ((Class648) class648).anInt8399])
	    < (((Class648) class648).aLongArray8398
	       [1 + 683825767 * ((Class648) class648).anInt8399]))
	    ((Class648) class648).anInt8390
		+= ((((Class648) class648).anIntArray8414
		     [((Class648) class648).anInt8390 * -630179809])
		    * 1888568287);
    }
    
    static final void method3444(Class648 class648, int i) {
	int i_37_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_37_, (byte) -85);
	Class226 class226 = Class380.aClass226Array3970[i_37_ >> 16];
	Class648.method7714(class229, class226, class648, 1858358050);
    }
    
    static void method3445(File file, byte[] is, int i, int i_38_)
	throws IOException {
	DataInputStream datainputstream
	    = (new DataInputStream
	       (new BufferedInputStream(new FileInputStream(file))));
	try {
	    datainputstream.readFully(is, 0, i);
	} catch (EOFException eofexception) {
	    /* empty */
	}
	datainputstream.close();
    }
    
    static void method3446(int i, String string, byte i_39_) {
	ClientPacket class528_sub21_sub7
	    = Class79.method1146(3, (long) i);
	class528_sub21_sub7.method10496(1558686940);
	((ClientPacket) class528_sub21_sub7).aString11546 = string;
    }
}
