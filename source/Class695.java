/* Class695 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class695
{
    Class511 aClass511_8706 = new Class511();
    Class511 aClass511_8707;
    
    public void method8174(int i) {
	for (;;) {
	    Class511 class511
		= ((Class695) this).aClass511_8706.aClass511_6965;
	    if (((Class695) this).aClass511_8706 == class511)
		break;
	    class511.method6259(1836173140);
	}
	((Class695) this).aClass511_8707 = null;
    }
    
    public void method8175(Class511 class511, byte i) {
	if (null != class511.aClass511_6966)
	    class511.method6259(1503862356);
	class511.aClass511_6966
	    = ((Class695) this).aClass511_8706.aClass511_6966;
	class511.aClass511_6965 = ((Class695) this).aClass511_8706;
	class511.aClass511_6966.aClass511_6965 = class511;
	class511.aClass511_6965.aClass511_6966 = class511;
    }
    
    public void method8176(Class511 class511, int i) {
	if (null != class511.aClass511_6966)
	    class511.method6259(1779923346);
	class511.aClass511_6966 = ((Class695) this).aClass511_8706;
	class511.aClass511_6965
	    = ((Class695) this).aClass511_8706.aClass511_6965;
	class511.aClass511_6966.aClass511_6965 = class511;
	class511.aClass511_6965.aClass511_6966 = class511;
    }
    
    public Class511 method8177(int i) {
	Class511 class511 = ((Class695) this).aClass511_8706.aClass511_6965;
	if (class511 == ((Class695) this).aClass511_8706) {
	    ((Class695) this).aClass511_8707 = null;
	    return null;
	}
	((Class695) this).aClass511_8707 = class511.aClass511_6965;
	return class511;
    }
    
    public boolean method8178(byte i) {
	return (((Class695) this).aClass511_8706.aClass511_6965
		== ((Class695) this).aClass511_8706);
    }
    
    public Class511 method8179(short i) {
	Class511 class511 = ((Class695) this).aClass511_8706.aClass511_6965;
	if (class511 == ((Class695) this).aClass511_8706)
	    return null;
	class511.method6259(1811590881);
	return class511;
    }
    
    public Class695() {
	((Class695) this).aClass511_8706.aClass511_6965
	    = ((Class695) this).aClass511_8706;
	((Class695) this).aClass511_8706.aClass511_6966
	    = ((Class695) this).aClass511_8706;
    }
    
    public boolean method8180() {
	return (((Class695) this).aClass511_8706.aClass511_6965
		== ((Class695) this).aClass511_8706);
    }
    
    public boolean method8181() {
	return (((Class695) this).aClass511_8706.aClass511_6965
		== ((Class695) this).aClass511_8706);
    }
    
    public boolean method8182() {
	return (((Class695) this).aClass511_8706.aClass511_6965
		== ((Class695) this).aClass511_8706);
    }
    
    public boolean method8183() {
	return (((Class695) this).aClass511_8706.aClass511_6965
		== ((Class695) this).aClass511_8706);
    }
    
    public Class511 method8184(int i) {
	Class511 class511 = ((Class695) this).aClass511_8707;
	if (((Class695) this).aClass511_8706 == class511) {
	    ((Class695) this).aClass511_8707 = null;
	    return null;
	}
	((Class695) this).aClass511_8707 = class511.aClass511_6965;
	return class511;
    }
    
    public boolean method8185() {
	return (((Class695) this).aClass511_8706.aClass511_6965
		== ((Class695) this).aClass511_8706);
    }
    
    public boolean method8186() {
	return (((Class695) this).aClass511_8706.aClass511_6965
		== ((Class695) this).aClass511_8706);
    }
    
    static final void method8187(Class648 class648, int i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if (Class380.aClass226Array3970[i_0_] == null)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= Class380.aClass226Array3970[i_0_].aClass229Array2336.length;
    }
    
    static void method8188(int i, int i_1_, int i_2_, int i_3_) {
	ClientPacket class528_sub21_sub7
	    = Class79.method1146(11, (long) i);
	class528_sub21_sub7.method10496(1110721889);
	((ClientPacket) class528_sub21_sub7).anInt11543
	    = 1959780981 * i_1_;
	((ClientPacket) class528_sub21_sub7).anInt11544
	    = i_2_ * 23247007;
    }
}
