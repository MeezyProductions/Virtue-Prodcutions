/* Class48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class48
{
    int anInt542;
    Class213 aClass213_543 = Class213.aClass213_2250;
    int anInt544;
    int anInt545;
    boolean aBool546;
    public static Class446 aClass446_547;
    static int anInt548;
    
    Class48() {
	/* empty */
    }
    
    public static void method879(Class254 class254, int i) {
	Class276.aClass254_3040 = class254;
    }
    
    static final void method880(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class229.anInt2453 * 1254224115;
    }
    
    static final void method881(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 283103663 * Class54.anInt673;
    }
    
    static String method882(long l) {
	if (l <= 0L || l >= 6582952005840035281L)
	    return null;
	if (l % 37L == 0L)
	    return null;
	int i = 0;
	for (long l_0_ = l; l_0_ != 0L; l_0_ /= 37L)
	    i++;
	StringBuilder stringbuilder = new StringBuilder(i);
	while (l != 0L) {
	    long l_1_ = l;
	    l /= 37L;
	    char c = Class655.aCharArray8432[(int) (l_1_ - 37L * l)];
	    if (c == '_') {
		int i_2_ = stringbuilder.length() - 1;
		stringbuilder.setCharAt
		    (i_2_, Character.toUpperCase(stringbuilder.charAt(i_2_)));
		c = '\u00a0';
	    }
	    stringbuilder.append(c);
	}
	stringbuilder.reverse();
	stringbuilder
	    .setCharAt(0, Character.toUpperCase(stringbuilder.charAt(0)));
	return stringbuilder.toString();
    }
}
