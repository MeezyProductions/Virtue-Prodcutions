/* Class473 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.EventQueue;

public class Class473
{
    public static Class473 aClass473_5416;
    public static Class473 aClass473_5417;
    public static Class473 aClass473_5418;
    static Class473 aClass473_5419;
    public static Class473 aClass473_5420;
    public static Class473 aClass473_5421;
    public static Class473 aClass473_5422;
    public static Class473 aClass473_5423;
    public static Class473 aClass473_5424;
    static Class473 aClass473_5425 = new Class473(0);
    int anInt5426;
    static EventQueue anEventQueue5427;
    
    static {
	aClass473_5417 = new Class473(1);
	aClass473_5418 = new Class473(2);
	aClass473_5421 = new Class473(3);
	aClass473_5420 = new Class473(4);
	aClass473_5416 = new Class473(5);
	aClass473_5422 = new Class473(6);
	aClass473_5423 = new Class473(7);
	aClass473_5419 = new Class473(8);
	aClass473_5424 = new Class473(9);
    }
    
    Class473(int i) {
	((Class473) this).anInt5426 = i * -824539233;
    }
    
    static final void method5823(Class648 class648, int i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_0_, (byte) -38);
	Class226 class226 = Class380.aClass226Array3970[i_0_ >> 16];
	Class530.method6461(class229, class226, class648, 1718625008);
    }
    
    static final void method5824(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = client.aBool10859 ? 1 : 0;
    }
    
    static final void method5825(Class648 class648, int i) {
	int i_1_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_1_, (byte) -19);
	Class226 class226 = Class380.aClass226Array3970[i_1_ >> 16];
	Class527.method6433(class229, class226, class648, 717927929);
    }
    
    static boolean method5826(Interface60 interface60,
			      Class5_Sub15 class5_sub15, int i, int i_2_,
			      int i_3_) {
	if (null == interface60)
	    return false;
	Class596 class596
	    = ((Class596)
	       class5_sub15.method63(interface60.method397((short) -16252),
				     -1670086431));
	if (class596.aBool7833 && !client.aBool10966)
	    return false;
	int i_4_ = 667283375 * class596.anInt7777;
	if (class596.anIntArray7767 != null) {
	    for (int i_5_ = 0; i_5_ < class596.anIntArray7767.length; i_5_++) {
		if (-1 != class596.anIntArray7767[i_5_]) {
		    Class596 class596_6_
			= ((Class596)
			   class5_sub15.method63(class596.anIntArray7767[i_5_],
						 1987290857));
		    if (class596_6_.anInt7777 * 667283375 >= 0)
			i_4_ = 667283375 * class596_6_.anInt7777;
		}
	    }
	}
	if (i_4_ >= 0) {
	    Class98.anIntArray1249[2064102423 * Class98.anInt1245]
		= class596.anInt7765 * -1439030235;
	    Class98.anIntArray1246[Class98.anInt1245 * 2064102423] = i;
	    Class98.anIntArray1255[2064102423 * Class98.anInt1245] = i_2_;
	    Class98.anInt1245 += 1645527975;
	    return true;
	}
	return false;
    }
}
