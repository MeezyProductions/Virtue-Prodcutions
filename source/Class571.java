/* Class571 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class571 implements IClientEnum, Interface64
{
    public static Class571 aClass571_7559;
    public static Class571 aClass571_7560
	= new Class571(0, "", new Class459[] { Class459.aClass459_5248,
					       Class459.aClass459_5132 });
    public static Class571 aClass571_7561;
    static Class571 aClass571_7562;
    int anInt7563;
    Class459[] aClass459Array7564;
    
    public int method68() {
	return ((Class571) this).anInt7563 * -2058141573;
    }
    
    public int method5() {
	return ((Class571) this).anInt7563 * -2058141573;
    }
    
    static {
	aClass571_7559
	    = new Class571(1, "", new Class459[] { Class459.aClass459_5248,
						   Class459.aClass459_5248 });
	aClass571_7561
	    = new Class571(2, "", new Class459[] { Class459.aClass459_5132,
						   Class459.aClass459_5132 });
	aClass571_7562
	    = new Class571(3, "", new Class459[] { Class459.aClass459_5248,
						   Class459.aClass459_5248,
						   Class459.aClass459_5132 });
    }
    
    public int method73() {
	return ((Class571) this).anInt7563 * -2058141573;
    }
    
    public int method6() {
	return ((Class571) this).anInt7563 * -2058141573;
    }
    
    public int method72() {
	return ((Class571) this).anInt7563 * -2058141573;
    }
    
    public int method71() {
	return ((Class571) this).anInt7563 * -2058141573;
    }
    
    Class571(int i, String string, Class459[] class459s) {
	((Class571) this).anInt7563 = i * 1637523123;
	((Class571) this).aClass459Array7564 = class459s;
	Class459[] class459s_0_ = ((Class571) this).aClass459Array7564;
	for (int i_1_ = 0; i_1_ < class459s_0_.length; i_1_++) {
	    Class459 class459 = class459s_0_[i_1_];
	    switch (1711133271 * class459.aClass483_5280.anInt5477) {
	    case 3:
		break;
	    default:
		break;
	    case 2:
		break;
	    case 0:
		/* empty */
	    }
	}
    }
    
    public static int method6858(int i, int i_2_, byte i_3_) {
	int i_4_ = 0;
	for (/**/; i_2_ > 0; i_2_--) {
	    i_4_ = i_4_ << 1 | i & 0x1;
	    i >>>= 1;
	}
	return i_4_;
    }
    
    public static void method6859(int i, int i_5_) {
	ClientPacket class528_sub21_sub7
	    = Class79.method1146(22, (long) i);
	class528_sub21_sub7.method10495(-467630568);
    }
    
    static final void method6860(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_6_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_7_ = (((Class648) class648).anIntArray8394
		    [1 + ((Class648) class648).anInt8395 * 717927929]);
	if (i_7_ == -1)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -1;
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= Class196.aClass447_2200.method5401(i_6_, -438432000)
		      .method10489((char) i_7_, -1934832822);
    }
}
