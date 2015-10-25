/* Class442 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class442 implements IClientEnum
{
    static Class442 aClass442_4904;
    static Class442 aClass442_4905;
    String aString4906;
    static Class442 aClass442_4907;
    static Class442 aClass442_4908 = new Class442("UNCOMPRESSED", 0);
    int anInt4909;
    
    public int method72() {
	return ((Class442) this).anInt4909 * 58199073;
    }
    
    static {
	aClass442_4905 = new Class442("BZIP2", 1);
	aClass442_4904 = new Class442("GZIP", 2);
	aClass442_4907 = new Class442("LZMA", 3);
    }
    
    static Class442[] method5309(int i) {
	return new Class442[] { aClass442_4907, aClass442_4904, aClass442_4905,
				aClass442_4908 };
    }
    
    public int method5() {
	return ((Class442) this).anInt4909 * 58199073;
    }
    
    public int method6() {
	return ((Class442) this).anInt4909 * 58199073;
    }
    
    public int method71() {
	return ((Class442) this).anInt4909 * 58199073;
    }
    
    public int method68() {
	return ((Class442) this).anInt4909 * 58199073;
    }
    
    public int method73() {
	return ((Class442) this).anInt4909 * 58199073;
    }
    
    Class442(String string, int i) {
	((Class442) this).aString4906 = string;
	((Class442) this).anInt4909 = i * -1701152799;
    }
    
    public static int method5310(int i, int i_0_, int i_1_, int i_2_, int i_3_,
				 int i_4_, byte i_5_) {
	if (1 == (i_4_ & 0x1)) {
	    int i_6_ = i_2_;
	    i_2_ = i_3_;
	    i_3_ = i_6_;
	}
	i_1_ &= 0x3;
	if (i_1_ == 0)
	    return i_0_;
	if (i_1_ == 1)
	    return 7 - i - (i_2_ - 1);
	if (2 == i_1_)
	    return 7 - i_0_ - (i_3_ - 1);
	return i;
    }
    
    static final void method5311(Class648 class648, int i) {
	int i_7_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_7_, (byte) -3);
	Class226 class226 = Class380.aClass226Array3970[i_7_ >> 16];
	Class420.method5039(class229, class226, class648, -599700575);
    }
    
    static final void method5312(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	((Class648) class648).anInt8395 -= -1816921966;
	int i_8_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395]);
	int i_9_ = (((Class648) class648).anIntArray8394
		    [1 + ((Class648) class648).anInt8395 * 717927929]);
	Class79 class79
	    = (Class79) Class208.aClass5_Sub10_2239.method63(i_8_, 624462669);
	if (i_9_ != 1875093329 * class79.anInt809)
	    class229.method3200(i_8_, i_9_, -217752350);
	else
	    class229.method3223(i_8_, -711774313);
    }
    
    public static Class385 method5313(ByteBuffer class528_sub42, int i) {
	int i_10_ = class528_sub42.method9645((short) -9250);
	return new Class385(i_10_);
    }
}
