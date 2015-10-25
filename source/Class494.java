/* Class494 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class494
{
    public int anInt5528;
    public int anInt5529 = -567730405;
    public int anInt5530;
    public Class690 aClass690_5531;
    public int anInt5532;
    public static int anInt5533;
    
    Class494(Entity class645_sub1_sub5_sub1) {
	aClass690_5531 = new Class690_Sub1(class645_sub1_sub5_sub1, false);
    }
    
    public static String method5955(Class528_Sub21_Sub11 class528_sub21_sub11,
				    byte i) {
	if (Class28.aBool273 || class528_sub21_sub11 == null)
	    return "";
	return ((Class528_Sub21_Sub11) class528_sub21_sub11).aString11585;
    }
    
    static void method5956(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [((Class648) class648).anInt8395 * 717927929 - 2]
	    = (((Class256)
		Class669.aClass25_Sub1_8522.method63((((Class648) class648)
						      .anIntArray8394
						      [((((Class648) class648)
							 .anInt8395)
							* 717927929) - 2]),
						     542663614))
		   .method3461
	       (Class570.playerVarsProvider,
		(((Class648) class648).anIntArray8394
		 [((Class648) class648).anInt8395 * 717927929 - 1]),
		-680799878)) ? 1 : 0;
	((Class648) class648).anInt8395 -= 1239022665;
    }
    
    static final int[] method5957(String string, Class648 class648, short i) {
	int[] is = null;
	if (string.length() > 0 && string.charAt(string.length() - 1) == 'Y') {
	    int i_0_ = (((Class648) class648).anIntArray8394
			[((((Class648) class648).anInt8395 -= 1239022665)
			  * 717927929)]);
	    if (i_0_ > 0) {
		is = new int[i_0_];
		while (i_0_-- > 0)
		    is[i_0_] = (((Class648) class648).anIntArray8394
				[(((Class648) class648).anInt8395
				  -= 1239022665) * 717927929]);
	    }
	}
	return is;
    }
    
    static final void method5958(Class648 class648, byte i) {
	if (1234694097 * client.anInt11158 == 0)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -2;
	else if (client.anInt11158 * 1234694097 == 1)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -1;
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= client.anInt11157 * -1314218023;
    }
    
    static final void method5959(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class518.anInt6972 + -1004126987 * Class200_Sub1.anInt9820;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class518.anInt6995 + -1160116407 * Class98.anInt1256;
    }
    
    static final void method5960(Class648 class648, byte i) {
	long l = Class249.method3417(2088023378);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (int) (l / 86400000L) - 11745;
    }
    
    public static void method5961(int i) {
	Class322.aClass151_3483 = null;
	Class98.anInt1244 = 1291913929;
    }
}
