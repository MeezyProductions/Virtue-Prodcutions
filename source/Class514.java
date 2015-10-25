/* Class514 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class Class514
{
    Class520 this$0;
    public static Class528_Sub38 aClass528_Sub38_6967;
    
    Class514(Class520 class520) {
	((Class514) this).this$0 = class520;
    }
    
    public static int method6275(byte i) {
	Canvas canvas = new Canvas();
	canvas.setSize(100, 100);
	Class173 class173
	    = Class181_Sub10.method8961(0, canvas, null, null, null, null,
					null, null, 0, 1192834531);
	long l = Class249.method3417(1966149793);
	for (int i_0_ = 0; i_0_ < 10000; i_0_++)
	    class173.method2389(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F,
				-65536, -65536, -65536, 1);
	int i_1_ = (int) (Class249.method3417(1896916316) - l);
	class173.method2210(0, 0, 100, 100, -16777216, 652987748);
	class173.method2156(-1372793801);
	return i_1_;
    }
    
    static final void method6276(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class181_Sub21.method8995(class229, class648, (byte) 17);
    }
    
    static final void method6277(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	if (!string.equals(class229.aString2455)) {
	    class229.aString2455 = string;
	    Class39.method811(class229, 1435904523);
	}
	if (class229.anInt2377 * 1835803215 == -1 && !class226.aBool2335)
	    Class528_Sub28.method9470(306930455 * class229.anInt2376,
				      1964621078);
    }
}
