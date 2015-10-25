/* Class657 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class657 implements IClientEnum
{
    public static Class657 aClass657_8435;
    public static Class657 aClass657_8436 = new Class657(1, 0);
    public static Class657 aClass657_8437 = new Class657(7, 1);
    public static Class657 aClass657_8438;
    public static Class657 aClass657_8439;
    public static Class657 aClass657_8440;
    public static Class657 aClass657_8441;
    int anInt8442;
    public int anInt8443;
    public static Class657 aClass657_8444 = new Class657(5, 2);
    
    public int method6() {
	return ((Class657) this).anInt8442 * -2038390987;
    }
    
    public Class657 method7847(byte i) {
	switch (999435105 * anInt8443) {
	case 0:
	    return aClass657_8436;
	case 1:
	    return aClass657_8439;
	case 5:
	    return aClass657_8441;
	case 4:
	    return aClass657_8435;
	case 6:
	    return aClass657_8437;
	case 7:
	    return aClass657_8440;
	case 3:
	    return aClass657_8444;
	case 2:
	    return aClass657_8438;
	default:
	    throw new IllegalStateException();
	}
    }
    
    public int method72() {
	return ((Class657) this).anInt8442 * -2038390987;
    }
    
    static {
	aClass657_8438 = new Class657(4, 3);
	aClass657_8439 = new Class657(0, 4);
	aClass657_8440 = new Class657(6, 5);
	aClass657_8441 = new Class657(3, 6);
	aClass657_8435 = new Class657(2, 7);
    }
    
    public int method5() {
	return ((Class657) this).anInt8442 * -2038390987;
    }
    
    Class657(int i, int i_0_) {
	anInt8443 = 1090893985 * i;
	((Class657) this).anInt8442 = 1268906781 * i_0_;
    }
    
    public int method71() {
	return ((Class657) this).anInt8442 * -2038390987;
    }
    
    public int method73() {
	return ((Class657) this).anInt8442 * -2038390987;
    }
    
    public int method68() {
	return ((Class657) this).anInt8442 * -2038390987;
    }
    
    public static Class8 method7848(String string, int i, int i_1_) {
	Class8_Sub1 class8_sub1 = new Class8_Sub1();
	((Class8) class8_sub1).aString137 = string;
	((Class8) class8_sub1).anInt136 = i * 1505855127;
	return class8_sub1;
    }
    
    public static int method7849(CharSequence charsequence,
				 CharSequence charsequence_2_,
				 Class668 class668, byte i) {
	int i_3_ = charsequence.length();
	int i_4_ = charsequence_2_.length();
	int i_5_ = 0;
	int i_6_ = 0;
	char c = '\0';
	char c_7_ = '\0';
	while (i_5_ - c < i_3_ || i_6_ - c_7_ < i_4_) {
	    if (i_5_ - c >= i_3_)
		return -1;
	    if (i_6_ - c_7_ >= i_4_)
		return 1;
	    char c_8_;
	    if (c != 0) {
		c_8_ = c;
		boolean bool = false;
	    } else
		c_8_ = charsequence.charAt(i_5_++);
	    char c_9_;
	    if (0 != c_7_) {
		c_9_ = c_7_;
		boolean bool = false;
	    } else
		c_9_ = charsequence_2_.charAt(i_6_++);
	    c = Class255.method3450(c_8_, -951146457);
	    c_7_ = Class255.method3450(c_9_, 706009796);
	    c_8_ = OutgoingOpcode.method4857(c_8_, class668, -1963656091);
	    c_9_ = OutgoingOpcode.method4857(c_9_, class668, -1963656091);
	    if (c_9_ != c_8_ && (Character.toUpperCase(c_8_)
				 != Character.toUpperCase(c_9_))) {
		c_8_ = Character.toLowerCase(c_8_);
		c_9_ = Character.toLowerCase(c_9_);
		if (c_8_ != c_9_)
		    return (Class453.method5454(c_8_, class668, 1076612717)
			    - Class453.method5454(c_9_, class668,
						  -1500223808));
	    }
	}
	int i_10_ = Math.min(i_3_, i_4_);
	for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
	    if (class668 == Class668.aClass668_8491) {
		i_5_ = i_3_ - 1 - i_11_;
		i_6_ = i_4_ - 1 - i_11_;
	    } else
		i_5_ = i_6_ = i_11_;
	    char c_12_ = charsequence.charAt(i_5_);
	    char c_13_ = charsequence_2_.charAt(i_6_);
	    if (c_13_ != c_12_ && (Character.toUpperCase(c_12_)
				   != Character.toUpperCase(c_13_))) {
		c_12_ = Character.toLowerCase(c_12_);
		c_13_ = Character.toLowerCase(c_13_);
		if (c_13_ != c_12_)
		    return (Class453.method5454(c_12_, class668, 650135870)
			    - Class453.method5454(c_13_, class668,
						  2015652121));
	    }
	}
	int i_14_ = i_3_ - i_4_;
	if (0 != i_14_)
	    return i_14_;
	for (int i_15_ = 0; i_15_ < i_10_; i_15_++) {
	    char c_16_ = charsequence.charAt(i_15_);
	    char c_17_ = charsequence_2_.charAt(i_15_);
	    if (c_17_ != c_16_)
		return (Class453.method5454(c_16_, class668, 1431970010)
			- Class453.method5454(c_17_, class668, -1641498417));
	}
	return 0;
    }
    
    public static Class683[] method7850(int i) {
	if (null == ModeWhere.aClass683Array8475) {
	    Class683[] class683s
		= Class279.method3733(Class181.aClass702_2093, (byte) 2);
	    Class683[] class683s_18_ = new Class683[class683s.length];
	    int i_19_ = 0;
	    int i_20_ = Class514.aClass528_Sub38_6967.aClass691_Sub13_10587
			    .method9925((byte) 1);
	while_48_:
	    for (int i_21_ = 0; i_21_ < class683s.length; i_21_++) {
		Class683 class683 = class683s[i_21_];
		if ((-1816249255 * class683.anInt8603 <= 0
		     || class683.anInt8603 * -1816249255 >= 24)
		    && class683.anInt8604 * -1425052405 >= 800
		    && -968107603 * class683.anInt8605 >= 600
		    && (i_20_ != 2
			|| (class683.anInt8604 * -1425052405 <= 800
			    && -968107603 * class683.anInt8605 <= 600))
		    && (1 != i_20_
			|| (class683.anInt8604 * -1425052405 <= 1024
			    && -968107603 * class683.anInt8605 <= 768))) {
		    for (int i_22_ = 0; i_22_ < i_19_; i_22_++) {
			Class683 class683_23_ = class683s_18_[i_22_];
			if ((-1425052405 * class683_23_.anInt8604
			     == -1425052405 * class683.anInt8604)
			    && (class683.anInt8605 * -968107603
				== -968107603 * class683_23_.anInt8605)) {
			    if (class683.anInt8603 * -1816249255
				> class683_23_.anInt8603 * -1816249255)
				class683s_18_[i_22_] = class683;
			    continue while_48_;
			}
		    }
		    class683s_18_[i_19_] = class683;
		    i_19_++;
		}
	    }
	    ModeWhere.aClass683Array8475 = new Class683[i_19_];
	    System.arraycopy(class683s_18_, 0, ModeWhere.aClass683Array8475, 0,
			     i_19_);
	    int[] is = new int[ModeWhere.aClass683Array8475.length];
	    for (int i_24_ = 0; i_24_ < ModeWhere.aClass683Array8475.length;
		 i_24_++) {
		Class683 class683 = ModeWhere.aClass683Array8475[i_24_];
		is[i_24_]
		    = class683.anInt8604 * -1425052405 * (class683.anInt8605
							  * -968107603);
	    }
	    Class253.method3438(is, ModeWhere.aClass683Array8475, 23406001);
	}
	return ModeWhere.aClass683Array8475;
    }
    
    static final void method7851(Class648 class648, int i) {
	int i_25_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = ((Class648) class648).aClass308_8391.aStringArray3400[i_25_];
    }
}
