/* Class621 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.List;

public class Class621
{
    static int anInt8054;
    static Class511_Sub2_Sub1_Sub1[] aClass511_Sub2_Sub1_Sub1Array8055;
    static int anInt8056 = 0;
    static int anInt8057 = 0;
    static Class612[] aClass612Array8058;
    static int anInt8059 = 0;
    static int anInt8060 = 0;
    static int anInt8061 = 0;
    static Class692 aClass692_8062;
    static List aList8063;
    static int anInt8064;
    static Class692 aClass692_8065;
    static int anInt8066 = 0;
    static Class388[] aClass388Array8067 = new Class388[16];
    static int anInt8068;
    static Interface46 anInterface46_8069;
    
    Class621() throws Throwable {
	throw new Error();
    }
    
    static {
	anInt8054 = 0;
	aClass692_8065 = new Class692(16);
	aClass692_8062 = new Class692(8);
	anInt8064 = 0;
	anInt8068 = 1686582174;
    }
    
    public static int method7412() {
	return 2094320943 * anInt8068;
    }
    
    public static void method7413() {
	aClass692_8062 = new Class692(8);
	anInt8064 = 0;
	Iterator iterator = aList8063.iterator();
	while (iterator.hasNext()) {
	    Class612 class612 = (Class612) iterator.next();
	    class612.method7308();
	}
    }
    
    public static void method7414(int i) {
	if (i < 0 || i > 2)
	    i = 0;
	anInt8068 = 843291087 * i;
	aClass612Array8058
	    = (new Class612
	       [Class174.anIntArray2010[2094320943 * anInt8068] + 1]);
	anInt8059 = 0;
	anInt8060 = 0;
    }
    
    public static void method7415(int i) {
	if (i < 0 || i > 2)
	    i = 0;
	anInt8068 = 843291087 * i;
	aClass612Array8058
	    = (new Class612
	       [Class174.anIntArray2010[2094320943 * anInt8068] + 1]);
	anInt8059 = 0;
	anInt8060 = 0;
    }
}
