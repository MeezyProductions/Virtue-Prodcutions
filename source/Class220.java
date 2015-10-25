/* Class220 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.List;

public class Class220
{
    Class218 this$0;
    List aList2324;
    public static Class141 aClass141_2325;
    static int[] anIntArray2326;
    
    void method3146(Class469 class469, int i) {
	((Class220) this).aList2324.remove(class469);
    }
    
    Class220(Class218 class218) {
	((Class220) this).this$0 = class218;
	((Class220) this).aList2324 = new ArrayList();
    }
    
    List method3147(short i) {
	return ((Class220) this).aList2324;
    }
    
    void method3148(Class469 class469, int i) {
	((Class220) this).aList2324.add(class469);
    }
    
    boolean method3149(Class469 class469, byte i) {
	return ((Class220) this).aList2324.contains(class469);
    }
    
    public static void method3150(int i) {
	Class380.aClass226Array3970
	    = new Class226[Class76.aClass446_792.method5356(-719150239)];
	Class95.aBoolArray1212
	    = new boolean[Class76.aClass446_792.method5356(-1331858112)];
    }
}
