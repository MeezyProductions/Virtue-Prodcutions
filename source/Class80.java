/* Class80 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class80
{
    boolean aBool813;
    Class84[] aClass84Array814;
    public static Class151 aClass151_815;
    
    Class80(boolean bool, Class84[] class84s) {
	((Class80) this).aBool813 = bool;
	((Class80) this).aClass84Array814 = class84s;
    }
    
    static final void method1148(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -577899301;
	int i_0_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_1_ = (((Class648) class648).anIntArray8394
		    [1 + 717927929 * ((Class648) class648).anInt8395]);
	int i_2_ = (((Class648) class648).anIntArray8394
		    [2 + 717927929 * ((Class648) class648).anInt8395]);
	if (i_1_ == -1)
	    throw new RuntimeException();
	Class7 class7
	    = (Class7) Class551.aClass5_Sub17_7422.method63(i_1_, 1074258131);
	if (class7.aClass459_129.method68() != i_0_)
	    throw new RuntimeException();
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class7.method553(Integer.valueOf(i_2_), 1084622625) ? 1 : 0;
    }
    
    static boolean method1149(int i, int i_3_) {
	if (i == 18 || 19 == i || 20 == i || 21 == i || 22 == i || i == 1004)
	    return true;
	if (17 == i)
	    return true;
	return false;
    }
}
