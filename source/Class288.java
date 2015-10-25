/* Class288 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class288
{
    static Class288 aClass288_3162;
    static Class288 aClass288_3163;
    static Class288 aClass288_3164;
    static Class288 aClass288_3165;
    static Class288 aClass288_3166;
    static Class288 aClass288_3167;
    static Class288 aClass288_3168;
    int anInt3169;
    static Class288 aClass288_3170;
    static Class288 aClass288_3171;
    static Class288 aClass288_3172;
    static Class288 aClass288_3173;
    static Class288 aClass288_3174;
    static Class288 aClass288_3175;
    static Class288 aClass288_3176 = new Class288(0);
    static Class288 aClass288_3177;
    
    static {
	aClass288_3162 = new Class288(1);
	aClass288_3164 = new Class288(2);
	aClass288_3175 = new Class288(3);
	aClass288_3166 = new Class288(4);
	aClass288_3167 = new Class288(5);
	aClass288_3168 = new Class288(6);
	aClass288_3177 = new Class288(7);
	aClass288_3170 = new Class288(8);
	aClass288_3171 = new Class288(9);
	aClass288_3172 = new Class288(10);
	aClass288_3173 = new Class288(11);
	aClass288_3174 = new Class288(12);
	aClass288_3165 = new Class288(13);
	aClass288_3163 = new Class288(14);
    }
    
    Class288(int i) {
	((Class288) this).anInt3169 = i * 1071291549;
    }
    
    static final void method3868(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_0_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_1_ = (((Class648) class648).anIntArray8394
		    [1 + ((Class648) class648).anInt8395 * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = i_0_ & -1 - (1 << i_1_);
    }
    
    static final void method3869(Class648 class648, int i) {
	int i_2_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Character.toLowerCase((char) i_2_);
    }
    
    static final void method3870(Class648 class648, int i) {
	int i_3_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if (Class518_Sub1.aClass692_10701 != null) {
	    Node node
		= Class518_Sub1.aClass692_10701.method8137((long) i_3_);
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= null != node ? 1 : 0;
	} else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
    }
}
