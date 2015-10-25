/* Class265 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class265
{
    static final int anInt2867 = 100;
    Class528_Sub21_Sub13[] aClass528_Sub21_Sub13Array2868
	= new Class528_Sub21_Sub13[100];
    int anInt2869;
    static int anInt2870;
    
    Class528_Sub21_Sub13 method3661(int i, int i_0_, String string,
				    String string_1_, String string_2_,
				    String string_3_, String string_4_,
				    int i_5_, Class384 class384, int i_6_) {
	Class528_Sub21_Sub13 class528_sub21_sub13
	    = ((Class265) this).aClass528_Sub21_Sub13Array2868[99];
	for (int i_7_ = ((Class265) this).anInt2869 * 989580247; i_7_ > 0;
	     i_7_--) {
	    if (100 != i_7_)
		((Class265) this).aClass528_Sub21_Sub13Array2868[i_7_]
		    = (((Class265) this).aClass528_Sub21_Sub13Array2868
		       [i_7_ - 1]);
	}
	if (class528_sub21_sub13 == null)
	    class528_sub21_sub13
		= new Class528_Sub21_Sub13(i, i_0_, string, string_1_,
					   string_2_, string_4_, i_5_,
					   string_3_, class384);
	else {
	    class528_sub21_sub13.method6443(1591018651);
	    class528_sub21_sub13.method9429((byte) -76);
	    class528_sub21_sub13.method10560(i, i_0_, string, string_1_,
					     string_2_, string_4_, i_5_,
					     string_3_, class384, (byte) -45);
	}
	((Class265) this).aClass528_Sub21_Sub13Array2868[0]
	    = class528_sub21_sub13;
	if (989580247 * ((Class265) this).anInt2869 < 100)
	    ((Class265) this).anInt2869 += -1761388569;
	return class528_sub21_sub13;
    }
    
    Class528_Sub21_Sub13 method3662(int i, byte i_8_) {
	if (i < 0 || i >= 989580247 * ((Class265) this).anInt2869)
	    return null;
	return ((Class265) this).aClass528_Sub21_Sub13Array2868[i];
    }
    
    int method3663(byte i) {
	return 989580247 * ((Class265) this).anInt2869;
    }
    
    Class265() {
	/* empty */
    }
    
    static final void method3664(Class648 class648, int i) {
	int i_9_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_9_, (byte) 52);
	Class226 class226 = Class380.aClass226Array3970[i_9_ >> 16];
	Class269.method3680(class229, class226, class648, -1105241209);
    }
    
    static final void method3665(Class648 class648, int i) {
	Class514.aClass528_Sub38_6967.method9556
	    (Class514.aClass528_Sub38_6967.aClass691_Sub34_10607,
	     (((Class648) class648).anIntArray8394
	      [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]),
	     1867706700);
	Class243.method3387(2145071248);
	client.aBool11161 = false;
    }
    
    static final void method3666(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (Class495.aClass283_Sub1_5578.method3783((byte) 89).anInt3063
	       * 1970239675);
    }
    
    public static final void method3667(String string, String string_10_,
					byte i) {
	Class109 class109 = Class591.method7078((byte) 104);
	Class528_Sub34 class528_sub34
	    = Class656.method7845(OutgoingOpcode.aClass403_4546,
				  class109.aClass10_1379, -1933528194);
	if (string_10_.length() > 30)
	    string_10_ = string_10_.substring(0, 30);
	class528_sub34.aClass528_Sub42_Sub2_10481.writeByte
	    ((Class14.method627(string, -187753935)
	      + Class14.method627(string_10_, -1408293458)),
	     (byte) -40);
	class528_sub34.aClass528_Sub42_Sub2_10481.writeString(string_10_,
							     -1936289654);
	class528_sub34.aClass528_Sub42_Sub2_10481.writeString(string,
							     -1936289654);
	class109.method1380(class528_sub34, 527446617);
    }
}
