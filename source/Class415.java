/* Class415 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class415 implements Interface51
{
    int anInt4739;
    Class173_Sub1_Sub2 aClass173_Sub1_Sub2_4740;
    Class149 aClass149_4741;
    int anInt4742;
    Class169 aClass169_4743;
    long aLong4744;
    
    Class415(Class173_Sub1_Sub2 class173_sub1_sub2, Class149 class149,
	     Class169 class169, int i, int i_0_, int i_1_) {
	((Class415) this).aClass173_Sub1_Sub2_4740 = class173_sub1_sub2;
	((Class415) this).anInt4742 = i;
	((Class415) this).anInt4739 = i_0_;
	((Class415) this).aClass149_4741 = class149;
	((Class415) this).aClass169_4743 = class169;
	((Class415) this).aLong4744
	    = (IDirect3DDevice.CreateRenderTarget
	       (((Class173_Sub1_Sub2)
		 ((Class415) this).aClass173_Sub1_Sub2_4740).aLong11378,
		i, i_0_,
		Class173_Sub1_Sub2.method10394((((Class415) this)
						.aClass149_4741),
					       (((Class415) this)
						.aClass169_4743)),
		0 + i_1_, 0, false));
	((Class415) this).aClass173_Sub1_Sub2_4740.method8494(this);
    }
    
    public int method1() {
	return ((Class415) this).anInt4742;
    }
    
    void method4961() {
	method195();
    }
    
    public long method75() {
	return ((Class415) this).aLong4744;
    }
    
    public void method115() {
	if (((Class415) this).aLong4744 != 0L) {
	    IUnknown.Release(((Class415) this).aLong4744);
	    ((Class415) this).aLong4744 = 0L;
	}
	((Class415) this).aClass173_Sub1_Sub2_4740.method8446(this);
    }
    
    public void method195() {
	if (((Class415) this).aLong4744 != 0L) {
	    ((Class415) this).aClass173_Sub1_Sub2_4740
		.method10397(((Class415) this).aLong4744);
	    ((Class415) this).aLong4744 = 0L;
	}
    }
    
    public void finalize() {
	method195();
    }
    
    public int method72() {
	return ((Class415) this).anInt4739;
    }
    
    public int method5() {
	return ((Class415) this).anInt4742;
    }
    
    public int method6() {
	return ((Class415) this).anInt4742;
    }
    
    public void method203() {
	if (((Class415) this).aLong4744 != 0L) {
	    ((Class415) this).aClass173_Sub1_Sub2_4740
		.method10397(((Class415) this).aLong4744);
	    ((Class415) this).aLong4744 = 0L;
	}
    }
    
    public int method71() {
	return ((Class415) this).anInt4739;
    }
    
    public void method334() {
	if (((Class415) this).aLong4744 != 0L) {
	    ((Class415) this).aClass173_Sub1_Sub2_4740
		.method10397(((Class415) this).aLong4744);
	    ((Class415) this).aLong4744 = 0L;
	}
    }
    
    public void method116() {
	if (((Class415) this).aLong4744 != 0L) {
	    IUnknown.Release(((Class415) this).aLong4744);
	    ((Class415) this).aLong4744 = 0L;
	}
	((Class415) this).aClass173_Sub1_Sub2_4740.method8446(this);
    }
    
    void method4962() {
	method195();
    }
    
    void method4963() {
	method195();
    }
    
    void method4964() {
	method195();
    }
    
    public int method40() {
	return ((Class415) this).anInt4742;
    }
    
    public long method333() {
	return ((Class415) this).aLong4744;
    }
    
    public long method332() {
	return ((Class415) this).aLong4744;
    }
    
    public int method68() {
	return ((Class415) this).anInt4739;
    }
    
    public int method73() {
	return ((Class415) this).anInt4739;
    }
}
