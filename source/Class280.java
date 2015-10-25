/* Class280 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class280
{
    static Class280 aClass280_3061 = new Class280(0);
    public static Class280 aClass280_3062 = new Class280(1);
    public int anInt3063;
    
    Class280(int i) {
	anInt3063 = -1920201613 * i;
    }
    
    static void method3737(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [717927929 * ((Class648) class648).anInt8395 - 1]
	    = ((Class256)
	       Class669.aClass25_Sub1_8522.method63((((Class648) class648)
						     .anIntArray8394
						     [((((Class648) class648)
							.anInt8395) * 717927929
						       - 1)]),
						    1106764889))
		  .method3457(Class570.playerVarsProvider, -2076665520) ? 1 : 0;
    }
    
    static void method3738(String string, String string_0_, int i, int i_1_,
			   int i_2_, long l, int i_3_, int i_4_, boolean bool,
			   boolean bool_5_, long l_6_, boolean bool_7_,
			   int i_8_) {
	if (!Class28.aBool273 && -1024340783 * Class28.anInt303 < 501) {
	    i = -1 != i ? i : -1902678583 * client.anInt11048;
	    Class528_Sub21_Sub11 class528_sub21_sub11
		= new Class528_Sub21_Sub11(string, string_0_, i, i_1_, i_2_, l,
					   i_3_, i_4_, bool, bool_5_, l_6_,
					   bool_7_);
	    Class262.method3647(class528_sub21_sub11, (byte) 54);
	}
    }
    
    static byte method3739(int i, int i_9_, int i_10_) {
	if (1922173025 * Class605.aClass605_7909.anInt7905 != i)
	    return (byte) 0;
	if (0 == (i_9_ & 0x1))
	    return (byte) 1;
	return (byte) 2;
    }
    
    static final void method3740(Class648 class648, int i) {
	int i_11_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_11_, (byte) 18);
	Class226 class226 = Class380.aClass226Array3970[i_11_ >> 16];
	Class560.method6817(class229, class226, class648,
			    Class227.aClass227_2344, (byte) 69);
    }
}
