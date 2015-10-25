/* Class635 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class635
{
    public static Class635 aClass635_8212 = new Class635(1);
    public static Class635 aClass635_8213 = new Class635(2);
    public static Class635 aClass635_8214 = new Class635(4);
    public static Class635 aClass635_8215 = new Class635(8);
    static Class635 aClass635_8216;
    public int anInt8217;
    public static Class635 aClass635_8218;
    public static Class635 aClass635_8219;
    static Class635 aClass635_8220;
    public static Class635 aClass635_8221 = new Class635(16);
    static Class635 aClass635_8222;
    static Class635 aClass635_8223;
    static Class635 aClass635_8224;
    static Class635 aClass635_8225;
    static Class635 aClass635_8226;
    public static Class635 aClass635_8227 = new Class635(32);
    
    static {
	aClass635_8218 = new Class635(64);
	aClass635_8219 = new Class635(128);
	aClass635_8220 = new Class635(256);
	aClass635_8226 = new Class635(512);
	aClass635_8222 = new Class635(1024);
	aClass635_8223 = new Class635(2048);
	aClass635_8224 = new Class635(4096);
	aClass635_8225 = new Class635(8192);
	aClass635_8216 = new Class635(16384);
    }
    
    Class635(int i) {
	anInt8217 = i * 1917204377;
    }
    
    static final void method7561(Class648 class648, int i) {
	if (Class96.aClass259_1226.method3570(161792974) > 0) {
	    String string = (String) (((Class648) class648).anObjectArray8396
				      [(((Class648) class648).anInt8410
					-= 1600226731) * -520794877]);
	    String string_0_
		= Class96.aClass259_1226.method3547(string, 2053568499);
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= string_0_;
	}
    }
    
    static void method7562(int i) {
	Class99.anInt1258
	    = -1009935322 + (Class392.aClass1_4120.anInt12 * -1856464861
			     + -872936699 * Class392.aClass1_4120.anInt13);
	Class210.anInt2242
	    = -2131851818 + (Class27.aClass1_253.anInt13 * -125443859
			     + 374999419 * Class27.aClass1_253.anInt12);
	Class99.aStringArray1259 = new String[500];
	for (int i_1_ = 0; i_1_ < Class99.aStringArray1259.length; i_1_++)
	    Class99.aStringArray1259[i_1_] = "";
	Class364_Sub2.method9236
	    (Class39.aClass39_363.method807(Class378_Sub2.aClass668_10123,
					    (byte) 102),
	     (byte) 5);
    }
    
    static int method7563(CharSequence charsequence, int i, boolean bool,
			  int i_2_) {
	if (i < 2 || i > 36)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (i).toString());
	boolean bool_3_ = false;
	boolean bool_4_ = false;
	int i_5_ = 0;
	int i_6_ = charsequence.length();
	for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
	    int i_8_ = charsequence.charAt(i_7_);
	    if (i_7_ == 0) {
		if (45 == i_8_) {
		    bool_3_ = true;
		    continue;
		}
		if (i_8_ == 43 && bool)
		    continue;
	    }
	    if (i_8_ >= 48 && i_8_ <= 57)
		i_8_ -= 48;
	    else if (i_8_ >= 65 && i_8_ <= 90)
		i_8_ -= 55;
	    else if (i_8_ >= 97 && i_8_ <= 122)
		i_8_ -= 87;
	    else
		throw new NumberFormatException();
	    if (i_8_ >= i)
		throw new NumberFormatException();
	    if (bool_3_)
		i_8_ = -i_8_;
	    int i_9_ = i_8_ + i_5_ * i;
	    if (i_9_ / i != i_5_)
		throw new NumberFormatException();
	    i_5_ = i_9_;
	    bool_4_ = true;
	}
	if (!bool_4_)
	    throw new NumberFormatException();
	return i_5_;
    }
    
    public static long method7564(int i, int i_10_, int i_11_, int i_12_,
				  int i_13_, int i_14_, byte i_15_) {
	Class38.aCalendar340.clear();
	Class38.aCalendar340.set(i_14_, i_13_, i_12_, i_11_, i_10_, i);
	return Class38.aCalendar340.getTime().getTime();
    }
}
