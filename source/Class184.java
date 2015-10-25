/* Class184 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

class Class184 implements Interface23
{
    Class218 this$0;
    static long aLong2102;
    public static Class622 aClass622_2103;
    
    Class184(Class218 class218) {
	((Class184) this).this$0 = class218;
    }
    
    void method2708(Interface67 interface67, byte i) {
	Iterator iterator
	    = ((Class184) this).this$0.method3114((byte) 88).iterator();
	while (iterator.hasNext()) {
	    Class469 class469 = (Class469) iterator.next();
	    if (class469.method5752(468359052) == interface67) {
		class469.method5782((byte) 64);
		iterator.remove();
	    }
	}
    }
    
    public void method128(Object object, byte i) {
	method2708((Interface67) object, (byte) 108);
    }
    
    public void method129(Object object) {
	method2708((Interface67) object, (byte) 103);
    }
    
    static boolean method2709(Class564 class564, int i) {
	return Node.method6446(class564, null, 1151448973);
    }
    
    static final void method2710(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_0_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395]);
	int i_1_ = (((Class648) class648).anIntArray8394
		    [1 + 717927929 * ((Class648) class648).anInt8395]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = i_0_ | i_1_;
    }
    
    static final void method2711(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class377.method4705(1063546278);
    }
    
    static final void method2712(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (int) (Class691_Sub32.aClass216_10805.method3024((byte) 38)
		     / 60000L);
    }
}
