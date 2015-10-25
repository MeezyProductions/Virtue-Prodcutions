/* Class520 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class520
{
    static final int anInt7044 = 4096;
    static byte[] aByteArray7045 = new byte[2048];
    Class514[] aClass514Array7046;
    Class304[] aClass304Array7047;
    
    static {
	int i = 22;
	int i_0_ = 2;
	aByteArray7045[0] = (byte) 0;
	aByteArray7045[1] = (byte) 1;
	for (int i_1_ = 2; i_1_ < i; i_1_++) {
	    int i_2_ = 1 << (i_1_ >> 1) - 1;
	    int i_3_ = 0;
	    while (i_3_ < i_2_) {
		aByteArray7045[i_0_] = (byte) i_1_;
		i_3_++;
		i_0_++;
	    }
	}
    }
    
    Class520() {
	Class242.method3376((byte) -1);
	((Class520) this).aClass514Array7046 = new Class514[4096];
	new Class327();
	((Class520) this).aClass304Array7047 = new Class304[4];
	new Class304(4);
	new Class516_Sub1(this);
	new Class516_Sub1(this);
	new Class517(this);
	for (int i = 0; i < 4096; i++)
	    ((Class520) this).aClass514Array7046[i] = new Class514(this);
	for (int i = 0; i < 4; i++)
	    ((Class520) this).aClass304Array7047[i] = new Class304(6);
    }
    
    static final void method6347(Class648 class648, int i)
	throws Exception_Sub4 {
	((Class648) class648).anInt8395 -= 661123364;
	float f = (float) (((Class648) class648).anIntArray8394
			   [717927929 * ((Class648) class648).anInt8395]);
	float f_4_
	    = (float) (((Class648) class648).anIntArray8394
		       [1 + ((Class648) class648).anInt8395 * 717927929]);
	float f_5_
	    = (float) (((Class648) class648).anIntArray8394
		       [((Class648) class648).anInt8395 * 717927929 + 2]);
	float f_6_
	    = ((float) (((Class648) class648).anIntArray8394
			[3 + 717927929 * ((Class648) class648).anInt8395])
	       / 1000.0F);
	Class495.aClass283_Sub1_5578
	    .method3773(Class422.method5051(f, f_4_, f_5_), f_6_, -1076277918);
    }
    
    public static String[] method6348(String string, char c, byte i) {
	int i_7_ = Class636.method7573(string, c, 1660932431);
	String[] strings = new String[1 + i_7_];
	int i_8_ = 0;
	int i_9_ = 0;
	for (int i_10_ = 0; i_10_ < i_7_; i_10_++) {
	    int i_11_;
	    for (i_11_ = i_9_; string.charAt(i_11_) != c; i_11_++) {
		/* empty */
	    }
	    strings[i_8_++] = string.substring(i_9_, i_11_);
	    i_9_ = i_11_ + 1;
	}
	strings[i_7_] = string.substring(i_9_);
	return strings;
    }
    
    public static int method6349(short[] is, int i, Class324 class324,
				 int i_12_, int i_13_) throws IOException {
	int i_14_ = 1;
	int i_15_ = 0;
	for (int i_16_ = 0; i_16_ < i_12_; i_16_++) {
	    int i_17_ = class324.method4217(is, i_14_ + i, -110610257);
	    i_14_ <<= 1;
	    i_14_ += i_17_;
	    i_15_ |= i_17_ << i_16_;
	}
	return i_15_;
    }
}
