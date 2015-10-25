/* Class519 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Comparator;

class Class519 implements Comparator
{
    Class364_Sub1 this$0;
    public static long aLong7043;
    
    public boolean method6338(Object object) {
	return super.equals(object);
    }
    
    int method6339(Class468 class468, Class468 class468_0_, int i) {
	float f = class468.method5651((byte) -21);
	float f_1_ = class468_0_.method5651((byte) -20);
	if (f_1_ > f)
	    return 1;
	if (f_1_ < f)
	    return -1;
	return 0;
    }
    
    public int compare(Object object, Object object_2_) {
	return method6339((Class468) object, (Class468) object_2_, 371908743);
    }
    
    public int method6340(Object object, Object object_3_) {
	return method6339((Class468) object, (Class468) object_3_, 371908743);
    }
    
    Class519(Class364_Sub1 class364_sub1) {
	((Class519) this).this$0 = class364_sub1;
    }
    
    public int method6341(Object object, Object object_4_) {
	return method6339((Class468) object, (Class468) object_4_, 371908743);
    }
    
    public boolean method6342(Object object) {
	return super.equals(object);
    }
    
    public boolean equals(Object object) {
	return super.equals(object);
    }
    
    public int method6343(Object object, Object object_5_) {
	return method6339((Class468) object, (Class468) object_5_, 371908743);
    }
    
    public int method6344(Object object, Object object_6_) {
	return method6339((Class468) object, (Class468) object_6_, 371908743);
    }
    
    static final void method6345(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class376.method4697(class229, class226, class648, 310283049);
    }
    
    static final void method6346(Class648 class648, byte i) {
	Class528_Sub19 class528_sub19
	    = (Class528_Sub19) (((Class648) class648).anObjectArray8396
				[(((Class648) class648).anInt8410
				  -= 1600226731) * -520794877]);
	if (Class495.aClass283_Sub1_5578.method3787((byte) -21)
	    != Class297.aClass297_3255)
	    throw new RuntimeException();
	Class326_Sub2 class326_sub2
	    = ((Class326_Sub2)
	       Class495.aClass283_Sub1_5578.method3811(151199679));
	class326_sub2.method9108(class528_sub19, 1695458756);
	client.aBool10982 = true;
    }
}
