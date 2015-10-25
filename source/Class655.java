/* Class655 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class655
{
    static long[] aLongArray8431;
    static char[] aCharArray8432
	= { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
	    'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
	    'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
    public static int anInt8433;
    
    static {
	aLongArray8431 = new long[12];
	for (int i = 0; i < aLongArray8431.length; i++)
	    aLongArray8431[i] = (long) Math.pow(37.0, (double) i);
    }
    
    Class655() throws Throwable {
	throw new Error();
    }
    
    public static void method7842(String string, boolean bool, byte i) {
	string = string.toLowerCase();
	Class181_Sub18.anInt9847 = 0;
	if (client.anInt11167 * 1920054043 != -1556893787 * client.anInt11165
	    || bool != client.aBool10961
	    || !string.equals(Class441.aString4902)) {
	    Class441.aString4902 = string;
	    client.anInt11167 = 383226943 * client.anInt11165;
	    client.aBool10961 = bool;
	    short[] is = new short[16];
	    int i_0_ = 0;
	    for (int i_1_ = 0;
		 i_1_ < Class18.aClass5_Sub13_206.anInt116 * -1906415229;
		 i_1_++) {
		ItemType itemType
		    = ((ItemType)
		       Class18.aClass5_Sub13_206.method63(i_1_, 1141829732));
		if ((!bool || itemType.aBool93)
		    && itemType.anInt79 * 282882573 == -1
		    && itemType.anInt82 * 265690109 == -1
		    && -1 == itemType.anInt99 * 695119153
		    && -363642627 * itemType.anInt94 == 0
		    && itemType.aString36.toLowerCase().indexOf(string) != -1) {
		    if (i_0_ >= 250) {
			Class552.anInt7428 = 1211704533;
			Class18.aShortArray207 = null;
			return;
		    }
		    if (i_0_ >= is.length) {
			short[] is_2_ = new short[2 * is.length];
			for (int i_3_ = 0; i_3_ < i_0_; i_3_++)
			    is_2_[i_3_] = is[i_3_];
			is = is_2_;
		    }
		    is[i_0_++] = (short) i_1_;
		}
	    }
	    Class18.aShortArray207 = is;
	    Class552.anInt7428 = i_0_ * -1211704533;
	    String[] strings = new String[Class552.anInt7428 * 939068291];
	    for (int i_4_ = 0; i_4_ < Class552.anInt7428 * 939068291; i_4_++)
		strings[i_4_]
		    = (((ItemType) Class18.aClass5_Sub13_206.method63(is[i_4_],
								    -87260396))
		       .aString36);
	    Class194.method2814(strings, Class18.aShortArray207, 180859355);
	}
    }
    
    public static void method7843(Class446 class446, Class446 class446_5_,
				  int i, int i_6_) {
	Class53.aClass446_623 = class446;
	Class376.aClass446_3941 = class446_5_;
    }
    
    public static String method7844(String string, short i) {
	int i_7_ = string.length();
	int i_8_ = 0;
	for (int i_9_ = 0; i_9_ < i_7_; i_9_++) {
	    char c = string.charAt(i_9_);
	    if (c == '<' || '>' == c)
		i_8_ += 3;
	}
	StringBuilder stringbuilder = new StringBuilder(i_7_ + i_8_);
	for (int i_10_ = 0; i_10_ < i_7_; i_10_++) {
	    char c = string.charAt(i_10_);
	    if ('<' == c)
		stringbuilder.append("<lt>");
	    else if (c == '>')
		stringbuilder.append("<gt>");
	    else
		stringbuilder.append(c);
	}
	return stringbuilder.toString();
    }
}
