/* Class490 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.util.Hashtable;

public class Class490
{
    static boolean aBool5508 = false;
    static File aFile5509;
    static Hashtable aHashtable5510 = new Hashtable(16);
    public static Class32 aClass32_5511;
    
    Class490() throws Throwable {
	throw new Error();
    }
    
    public static String method5918() {
	return aFile5509.getAbsolutePath();
    }
    
    static final void method5919(Class648 class648, int i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_0_, (byte) 42);
	Class226 class226 = Class380.aClass226Array3970[i_0_ >> 16];
	Class691_Sub13.method9928(class229, class226, class648, (byte) -46);
    }
    
    static final void method5920(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class229.anInt2430 * 2135116593;
    }
    
    static final void method5921(Class648 class648, int i) {
	Class691_Sub23.method10013(413635197);
    }
    
    public static final void method5922(String string, int i, int i_1_) {
	Class109 class109 = Class591.method7078((byte) 25);
	Class528_Sub34 class528_sub34
	    = Class656.method7845(OutgoingOpcode.aClass403_4528,
				  class109.aClass10_1379, -2004259544);
	class528_sub34.aClass528_Sub42_Sub2_10481
	    .writeByte(1 + Class14.method627(string, -1143161441), (byte) 20);
	class528_sub34.aClass528_Sub42_Sub2_10481.writeString(string,
							     -1936289654);
	class528_sub34.aClass528_Sub42_Sub2_10481.method9654(i, -1623238539);
	class109.method1380(class528_sub34, 374788882);
    }
    
    static final void method5923(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	if (Class494.method5957(string, class648, (short) 520) != null)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2486
	    = Class181_Sub23.method8999(string, class648, (byte) -1);
	class229.aBool2483 = true;
    }
    
    public static int method5924(int i, byte i_2_) {
	Class528_Sub21_Sub13 class528_sub21_sub13
	    = ((Class528_Sub21_Sub13)
	       Class277.aClass692_3044.method8137((long) i));
	if (class528_sub21_sub13 == null)
	    return -1;
	if (Class277.aClass679_3043.aClass528_Sub21_8561
	    == class528_sub21_sub13.aClass528_Sub21_10408)
	    return -1;
	return (1394353867
		* ((Class528_Sub21_Sub13)
		   class528_sub21_sub13.aClass528_Sub21_10408).anInt11616);
    }
}
