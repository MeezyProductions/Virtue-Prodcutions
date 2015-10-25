/* Class276 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class276
{
    static Class254 aClass254_3040;
    static int anInt3041;
    static Class542 aClass542_3042;
    
    Class276() throws Throwable {
	throw new Error();
    }
    
    public static void method3709(String[] strings, int[] is, int i) {
	Class420.method5037(strings, is, 0, strings.length - 1, 1529521468);
    }
    
    public static int method3710(byte[] is, int i, CharSequence charsequence,
				 short i_0_) {
	int i_1_ = charsequence.length();
	int i_2_ = i;
	for (int i_3_ = 0; i_3_ < i_1_; i_3_++) {
	    int i_4_ = charsequence.charAt(i_3_);
	    if (i_4_ <= 127)
		is[i_2_++] = (byte) i_4_;
	    else if (i_4_ <= 2047) {
		is[i_2_++] = (byte) (0xc0 | i_4_ >> 6);
		is[i_2_++] = (byte) (0x80 | i_4_ & 0x3f);
	    } else {
		is[i_2_++] = (byte) (0xe0 | i_4_ >> 12);
		is[i_2_++] = (byte) (0x80 | i_4_ >> 6 & 0x3f);
		is[i_2_++] = (byte) (0x80 | i_4_ & 0x3f);
	    }
	}
	return i_2_ - i;
    }
    
    static final void method3711(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	if (Class494.method5957(string, class648, (short) 520) != null)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2425
	    = Class181_Sub23.method8999(string, class648, (byte) -35);
	class229.aBool2483 = true;
    }
    
    public static int method3712(int i, int i_5_, boolean bool, int i_6_) {
	Class528_Sub6 class528_sub6 = IncomingPacket.method4814(i, bool, 1960159255);
	if (class528_sub6 == null)
	    return 0;
	if (i_5_ == -1)
	    return 0;
	int i_7_ = 0;
	for (int i_8_ = 0;
	     i_8_ < ((Class528_Sub6) class528_sub6).anIntArray10252.length;
	     i_8_++) {
	    if (((Class528_Sub6) class528_sub6).anIntArray10253[i_8_] == i_5_)
		i_7_ += ((Class528_Sub6) class528_sub6).anIntArray10252[i_8_];
	}
	return i_7_;
    }
}
