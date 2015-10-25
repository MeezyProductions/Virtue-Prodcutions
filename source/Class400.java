/* Class400 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class400 implements Interface48
{
    Class169 aClass169_4429;
    int anInt4430;
    Class173_Sub1_Sub2 aClass173_Sub1_Sub2_4431;
    int anInt4432;
    long aLong4433;
    
    public long method333() {
	return ((Class400) this).aLong4433;
    }
    
    public int method1() {
	return ((Class400) this).anInt4430;
    }
    
    void method4832() {
	method195();
    }
    
    Class400(Class173_Sub1_Sub2 class173_sub1_sub2, Class169 class169, int i,
	     int i_0_, int i_1_) {
	((Class400) this).aClass173_Sub1_Sub2_4431 = class173_sub1_sub2;
	((Class400) this).anInt4430 = i;
	((Class400) this).anInt4432 = i_0_;
	((Class400) this).aClass169_4429 = class169;
	((Class400) this).aLong4433
	    = (IDirect3DDevice.CreateDepthStencilSurface
	       (((Class173_Sub1_Sub2)
		 ((Class400) this).aClass173_Sub1_Sub2_4431).aLong11378,
		i, i_0_,
		Class173_Sub1_Sub2
		    .method10395(((Class400) this).aClass169_4429),
		0 + i_1_, 0, false));
	((Class400) this).aClass173_Sub1_Sub2_4431.method8494(this);
    }
    
    public void method116() {
	if (((Class400) this).aLong4433 != 0L) {
	    IUnknown.Release(((Class400) this).aLong4433);
	    ((Class400) this).aLong4433 = 0L;
	}
	((Class400) this).aClass173_Sub1_Sub2_4431.method8446(this);
    }
    
    public void method195() {
	if (((Class400) this).aLong4433 != 0L) {
	    ((Class400) this).aClass173_Sub1_Sub2_4431
		.method10397(((Class400) this).aLong4433);
	    ((Class400) this).aLong4433 = 0L;
	}
    }
    
    public int method5() {
	return ((Class400) this).anInt4430;
    }
    
    public int method40() {
	return ((Class400) this).anInt4430;
    }
    
    public void method115() {
	if (((Class400) this).aLong4433 != 0L) {
	    IUnknown.Release(((Class400) this).aLong4433);
	    ((Class400) this).aLong4433 = 0L;
	}
	((Class400) this).aClass173_Sub1_Sub2_4431.method8446(this);
    }
    
    public long method75() {
	return ((Class400) this).aLong4433;
    }
    
    public int method72() {
	return ((Class400) this).anInt4432;
    }
    
    public int method71() {
	return ((Class400) this).anInt4432;
    }
    
    public int method73() {
	return ((Class400) this).anInt4432;
    }
    
    public int method68() {
	return ((Class400) this).anInt4432;
    }
    
    void method4833() {
	method195();
    }
    
    public void method334() {
	if (((Class400) this).aLong4433 != 0L) {
	    ((Class400) this).aClass173_Sub1_Sub2_4431
		.method10397(((Class400) this).aLong4433);
	    ((Class400) this).aLong4433 = 0L;
	}
    }
    
    void method4834() {
	method195();
    }
    
    void method4835() {
	method195();
    }
    
    public void finalize() {
	method195();
    }
    
    public long method332() {
	return ((Class400) this).aLong4433;
    }
    
    public int method6() {
	return ((Class400) this).anInt4430;
    }
    
    public void method203() {
	if (((Class400) this).aLong4433 != 0L) {
	    ((Class400) this).aClass173_Sub1_Sub2_4431
		.method10397(((Class400) this).aLong4433);
	    ((Class400) this).aLong4433 = 0L;
	}
    }
}
