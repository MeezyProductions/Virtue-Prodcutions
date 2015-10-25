/* Class522 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class522 implements Interface62
{
    Class645_Sub1_Sub5_Sub5 aClass645_Sub1_Sub5_Sub5_7050;
    public static String aString7051;
    
    Class522(Class645_Sub1_Sub5_Sub5 class645_sub1_sub5_sub5) {
	((Class522) this).aClass645_Sub1_Sub5_Sub5_7050
	    = class645_sub1_sub5_sub5;
    }
    
    public boolean method406(Class645_Sub1_Sub5 class645_sub1_sub5, int i) {
	return (((Class522) this).aClass645_Sub1_Sub5_Sub5_7050
		== class645_sub1_sub5);
    }
    
    public boolean method405(Class645_Sub1_Sub5 class645_sub1_sub5) {
	return (((Class522) this).aClass645_Sub1_Sub5_Sub5_7050
		== class645_sub1_sub5);
    }
    
    public boolean method404(Class645_Sub1_Sub5 class645_sub1_sub5) {
	return (((Class522) this).aClass645_Sub1_Sub5_Sub5_7050
		== class645_sub1_sub5);
    }
    
    public static Class583[] method6358(int i) {
	return (new Class583[]
		{ Class583.aClass583_7696, Class583.aClass583_7695,
		  Class583.aClass583_7697 });
    }
    
    static final void method6359(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class351.method4563(class229, class226, class648, 1241428026);
    }
    
    static final void method6360(Class648 class648, byte i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_0_, (byte) 1);
	Class226 class226 = Class380.aClass226Array3970[i_0_ >> 16];
	Class365.method4636(class229, class226, class648, 897090972);
    }
    
    static final void method6361(Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	StringBuilder stringbuilder = new StringBuilder(string.length());
	boolean bool = false;
	for (int i_1_ = 0; i_1_ < string.length(); i_1_++) {
	    char c = string.charAt(i_1_);
	    if ('<' == c)
		bool = true;
	    else if ('>' == c)
		bool = false;
	    else if (!bool)
		stringbuilder.append(c);
	}
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = stringbuilder.toString();
    }
    
    static final void method6362(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_2_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395]);
	int i_3_ = (((Class648) class648).anIntArray8394
		    [1 + 717927929 * ((Class648) class648).anInt8395]);
	((Class648) class648).aClass387_8404.anIntArray4072[i_2_] = i_3_;
    }
    
    static final void method6363(Class648 class648, int i) {
	((Class648) class648).anInt8410 -= 1600226731;
    }
    
    public static final void method6364(byte i) {
	client.aBool11055 = true;
    }
}
