/* Class255 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.util.Arrays;

final class Class255 implements Interface27
{
    public long method145(String string, int i) {
	return Class312.method4146(string, -532107556);
    }
    
    public long method142(String string) {
	return Class312.method4146(string, -1494216865);
    }
    
    public long method144(String string) {
	return Class312.method4146(string, -596799075);
    }
    
    public long method143(String string) {
	return Class312.method4146(string, -486254307);
    }
    
    static final void method3447(Class648 class648, int i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_0_, (byte) -17);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = -1052877275 * class229.anInt2423;
    }
    
    static final void method3448(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = client.aBool10914 ? 1 : 0;
    }
    
    static final void method3449(Class648 class648, int i) {
	int i_1_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if (null != client.aString11133
	    && i_1_ < Class667.anInt8488 * 1502735135)
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= Class5_Sub19.aClass89Array10849[i_1_].aString1135;
	else
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
    }
    
    static char method3450(char c, int i) {
	if ('\u00c6' == c)
	    return 'E';
	if (c == '\u00e6')
	    return 'e';
	if ('\u00df' == c)
	    return 's';
	if (c == '\u0152')
	    return 'E';
	if ('\u0153' == c)
	    return 'e';
	return '\0';
    }
    
    public static byte[] method3451(Object object, int i, int i_2_,
				    byte i_3_) {
	if (null == object)
	    return null;
	if (object instanceof byte[]) {
	    byte[] is = (byte[]) object;
	    return Arrays.copyOfRange(is, i, i_2_ + i);
	}
	if (object instanceof ByteBuffer) {
	    ByteBuffer bytebuffer = (ByteBuffer) object;
	    byte[] is = new byte[i_2_];
	    bytebuffer.position(i);
	    bytebuffer.get(is, 0, i_2_);
	    return is;
	}
	throw new IllegalArgumentException();
    }
    
    public static String method3452(String string, char c, String string_4_,
				    byte i) {
	int i_5_ = string.length();
	int i_6_ = string_4_.length();
	int i_7_ = i_5_;
	int i_8_ = i_6_ - 1;
	if (0 != i_8_) {
	    int i_9_ = 0;
	    for (;;) {
		i_9_ = string.indexOf(c, i_9_);
		if (i_9_ < 0)
		    break;
		i_9_++;
		i_7_ += i_8_;
	    }
	}
	StringBuilder stringbuilder = new StringBuilder(i_7_);
	int i_10_ = 0;
	for (;;) {
	    int i_11_ = string.indexOf(c, i_10_);
	    if (i_11_ < 0)
		break;
	    stringbuilder.append(string.substring(i_10_, i_11_));
	    stringbuilder.append(string_4_);
	    i_10_ = i_11_ + 1;
	}
	stringbuilder.append(string.substring(i_10_));
	return stringbuilder.toString();
    }
    
    static final void method3453(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= 1900146029;
	int i_12_ = (((Class648) class648).anIntArray8394
		     [717927929 * ((Class648) class648).anInt8395]);
	int i_13_ = (((Class648) class648).anIntArray8394
		     [1 + 717927929 * ((Class648) class648).anInt8395]);
	int i_14_ = (((Class648) class648).anIntArray8394
		     [2 + ((Class648) class648).anInt8395 * 717927929]);
	int i_15_ = (((Class648) class648).anIntArray8394
		     [3 + 717927929 * ((Class648) class648).anInt8395]);
	int i_16_ = (((Class648) class648).anIntArray8394
		     [((Class648) class648).anInt8395 * 717927929 + 4]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = i_12_ + (i_13_ - i_12_) * (i_16_ - i_14_) / (i_15_ - i_14_);
    }
}
