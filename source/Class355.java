/* Class355 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class355
{
    Map aMap3805 = new HashMap();
    Class364 aClass364_3806;
    
    public void method4580(byte i) {
	Iterator iterator = ((Class355) this).aMap3805.values().iterator();
	while (iterator.hasNext()) {
	    Class351 class351 = (Class351) iterator.next();
	    class351.method4560((short) 14166);
	}
    }
    
    public Class351 method4581(int i, int i_0_, float f,
			       Interface42 interface42, byte i_1_) {
	if (method4582(i, (byte) 82) != null)
	    return null;
	Class351 class351 = null;
	if (i_0_ != -1)
	    class351 = method4582(i_0_, (byte) 98);
	Object object
	    = ((Class355) this).aClass364_3806.method4608(class351,
							  -1089748120);
	Class351 class351_2_
	    = new Class351(i, f, object, this, interface42, class351);
	((Class355) this).aMap3805.put(Integer.valueOf(i), class351_2_);
	return class351_2_;
    }
    
    public Class351 method4582(int i, byte i_3_) {
	return (Class351) ((Class355) this).aMap3805.get(Integer.valueOf(i));
    }
    
    public void method4583() {
	Iterator iterator = ((Class355) this).aMap3805.values().iterator();
	while (iterator.hasNext()) {
	    Class351 class351 = (Class351) iterator.next();
	    class351.method4560((short) 19163);
	}
    }
    
    public void method4584() {
	Iterator iterator = ((Class355) this).aMap3805.values().iterator();
	while (iterator.hasNext()) {
	    Class351 class351 = (Class351) iterator.next();
	    class351.method4560((short) 26942);
	}
    }
    
    public Class355(Class364 class364) {
	((Class355) this).aClass364_3806 = class364;
    }
    
    static final void method4585(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	class229.anInt2404
	    = ((((Class648) class648).anIntArray8394
		[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	       * 955061251);
	Class39.method811(class229, 1435904523);
	if (-1 == 1835803215 * class229.anInt2377 && !class226.aBool2335)
	    Class261.method3584(class229.anInt2376 * 306930455, -1587883434);
    }
    
    static final void method4586(Class648 class648, int i) {
	int i_4_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_4_, (byte) 75);
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = class229.aString2455;
    }
    
    static final void method4587(Class648 class648, short i) {
	int i_5_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_5_, (byte) 2);
	Class226 class226 = Class380.aClass226Array3970[i_5_ >> 16];
	Class191.method2791(class229, class226, class648, -830132609);
    }
}
