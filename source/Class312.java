/* Class312 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class312 implements IClientEnum
{
    static Class312 aClass312_3423;
    static Class312 aClass312_3424;
    static Class312 aClass312_3425;
    static Class312 aClass312_3426;
    static Class312 aClass312_3427;
    static Class312 aClass312_3428;
    static Class312 aClass312_3429;
    static Class312 aClass312_3430;
    static Class312 aClass312_3431;
    static Class312 aClass312_3432;
    static Class312 aClass312_3433 = new Class312(4, 1);
    static Class312 aClass312_3434;
    static Class312 aClass312_3435;
    static Class312 aClass312_3436;
    static Class312 aClass312_3437;
    int anInt3438;
    int anInt3439;
    public static String aString3440;
    
    public int method5() {
	return 1086949379 * ((Class312) this).anInt3439;
    }
    
    public int method68() {
	return 1086949379 * ((Class312) this).anInt3439;
    }
    
    static {
	aClass312_3424 = new Class312(0, 2);
	aClass312_3425 = new Class312(2, 3);
	aClass312_3426 = new Class312(8, 4);
	aClass312_3427 = new Class312(14, 5);
	aClass312_3436 = new Class312(6, 6);
	aClass312_3429 = new Class312(12, 7);
	aClass312_3435 = new Class312(13, 8);
	aClass312_3431 = new Class312(5, 9);
	aClass312_3428 = new Class312(3, 10);
	aClass312_3423 = new Class312(1, 11);
	aClass312_3432 = new Class312(10, 12);
	aClass312_3430 = new Class312(11, 13);
	aClass312_3434 = new Class312(7, 14);
	aClass312_3437 = new Class312(9, 15);
    }
    
    public int method6() {
	return 1086949379 * ((Class312) this).anInt3439;
    }
    
    Class312(int i, int i_0_) {
	((Class312) this).anInt3438 = -148062731 * i;
	((Class312) this).anInt3439 = i_0_ * 1763402411;
    }
    
    public int method72() {
	return 1086949379 * ((Class312) this).anInt3439;
    }
    
    public int method71() {
	return 1086949379 * ((Class312) this).anInt3439;
    }
    
    public int method73() {
	return 1086949379 * ((Class312) this).anInt3439;
    }
    
    static void method4144(byte i) {
	Class23 class23
	    = Class223.method3160("2", client.aClass673_11108.aString8534,
				  false, (byte) 62);
	Class423.aClass141_Sub1_4785.method8276(class23, -850897299);
    }
    
    public static String method4145(long l, int i, boolean bool,
				    Class668 class668, int i_1_) {
	char c = ',';
	char c_2_ = '.';
	if (class668 == Class668.aClass668_8495) {
	    c = '.';
	    c_2_ = ',';
	}
	if (Class668.aClass668_8491 == class668)
	    c_2_ = '\u00a0';
	boolean bool_3_ = false;
	if (l < 0L) {
	    bool_3_ = true;
	    l = -l;
	}
	StringBuilder stringbuilder = new StringBuilder(26);
	if (i > 0) {
	    for (int i_4_ = 0; i_4_ < i; i_4_++) {
		int i_5_ = (int) l;
		l /= 10L;
		stringbuilder.append((char) (i_5_ + 48 - (int) l * 10));
	    }
	    stringbuilder.append(c);
	}
	int i_6_ = 0;
	for (;;) {
	    int i_7_ = (int) l;
	    l /= 10L;
	    stringbuilder.append((char) (i_7_ + 48 - (int) l * 10));
	    if (l == 0L)
		break;
	    if (bool) {
		i_6_++;
		if (0 == i_6_ % 3)
		    stringbuilder.append(c_2_);
	    }
	}
	if (bool_3_)
	    stringbuilder.append('-');
	return stringbuilder.reverse().toString();
    }
    
    public static long method4146(CharSequence charsequence, int i) {
	int i_8_ = charsequence.length();
	long l = 0L;
	for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
	    l = (l << 5) - l + (long) charsequence.charAt(i_9_);
	return l;
    }
    
    static final void method4147(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class648.method7714(class229, class226, class648, 1766290657);
    }
}
