/* Class634 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;

public final class Class634
{
    static String aString8201;
    static final int anInt8202 = 2000000;
    static final int anInt8203 = 200000;
    static int[] anIntArray8204;
    public static Class186 aClass186_8205;
    static int anInt8206 = 0;
    static boolean aBool8207;
    static int anInt8208;
    static ArrayList anArrayList8209;
    static Class422[] aClass422Array8210;
    static int anInt8211;
    
    Class634() throws Throwable {
	throw new Error();
    }
    
    static {
	anIntArray8204 = new int[3];
	aClass186_8205 = new Class186(4);
	aClass422Array8210 = new Class422[2];
	aBool8207 = false;
	aString8201 = null;
	anArrayList8209 = new ArrayList();
	anInt8208 = 0;
	anInt8211 = 0;
    }
    
    static Class569[] method7559(int i) {
	return (new Class569[]
		{ Class569.aClass569_7555, Class569.aClass569_7553,
		  Class569.aClass569_7554 });
    }
    
    static void method7560(boolean bool, int i) {
	Class578 class578 = Class108.myPlayer
				.method10688((byte) 13);
	Class528_Sub21_Sub17 class528_sub21_sub17
	    = Class518_Sub1.method6290(class578.anInt7607 * 961465569,
				       class578.anInt7608 * -173815201);
	if (class528_sub21_sub17 == null)
	    class528_sub21_sub17
		= Class518_Sub1.method6291((Class518_Sub1.aClass615_6979
					    .anInt8028) * -5824517);
	if (class528_sub21_sub17 != Class652.aClass528_Sub21_Sub17_8427
	    || bool) {
	    Class652.aClass528_Sub21_Sub17_8427 = class528_sub21_sub17;
	    boolean bool_0_ = Class518_Sub1.method6325(class528_sub21_sub17);
	    if (bool_0_) {
		Class518_Sub1.aBool7007 = true;
		OutgoingOpcode.method4860(-354695735);
	    }
	}
    }
}
