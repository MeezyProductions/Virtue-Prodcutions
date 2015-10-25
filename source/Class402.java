/* Class402 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IUnknown;

public abstract class Class402 implements Interface35
{
    Class149 aClass149_4449;
    boolean aBool4450;
    Class169 aClass169_4451;
    Class173_Sub1_Sub2 aClass173_Sub1_Sub2_4452;
    long aLong4453 = 0L;
    
    void method4847() {
	method4851();
    }
    
    long method4848() {
	return ((Class402) this).aLong4453;
    }
    
    public void method303(Class340 class340) {
	/* empty */
    }
    
    public void method115() {
	if (((Class402) this).aLong4453 != 0L) {
	    IUnknown.Release(((Class402) this).aLong4453);
	    ((Class402) this).aLong4453 = 0L;
	}
	((Class402) this).aClass173_Sub1_Sub2_4452.method8446(this);
    }
    
    Class402(Class173_Sub1_Sub2 class173_sub1_sub2, Class149 class149,
	     Class169 class169, boolean bool, int i) {
	((Class402) this).aClass173_Sub1_Sub2_4452 = class173_sub1_sub2;
	((Class402) this).aClass149_4449 = class149;
	((Class402) this).aClass169_4451 = class169;
	((Class402) this).aBool4450 = bool;
	((Class402) this).aClass173_Sub1_Sub2_4452.method8494(this);
    }
    
    public void finalize() {
	method4851();
    }
    
    void method4849() {
	method4851();
    }
    
    public void method116() {
	if (((Class402) this).aLong4453 != 0L) {
	    IUnknown.Release(((Class402) this).aLong4453);
	    ((Class402) this).aLong4453 = 0L;
	}
	((Class402) this).aClass173_Sub1_Sub2_4452.method8446(this);
    }
    
    void method4850() {
	method4851();
    }
    
    void method4851() {
	if (((Class402) this).aLong4453 != 0L) {
	    ((Class402) this).aClass173_Sub1_Sub2_4452
		.method10397(((Class402) this).aLong4453);
	    ((Class402) this).aLong4453 = 0L;
	}
    }
    
    public void method304(Class340 class340) {
	/* empty */
    }
    
    public void method302(Class340 class340) {
	/* empty */
    }
    
    public void method307(Class340 class340) {
	/* empty */
    }
    
    void method4852() {
	if (((Class402) this).aLong4453 != 0L) {
	    ((Class402) this).aClass173_Sub1_Sub2_4452
		.method10397(((Class402) this).aLong4453);
	    ((Class402) this).aLong4453 = 0L;
	}
    }
    
    long method4853() {
	return ((Class402) this).aLong4453;
    }
    
    void method4854() {
	method4851();
    }
}
