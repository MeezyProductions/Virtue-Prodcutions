/* Class406 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class406 implements Interface51, Interface48
{
    int anInt4646;
    Class402_Sub2_Sub1 aClass402_Sub2_Sub1_4647;
    long aLong4648;
    
    public long method332() {
	if (((Class406) this).aLong4648 == 0L)
	    ((Class406) this).aLong4648
		= (IDirect3DTexture.GetSurfaceLevel
		   (((Class402_Sub2_Sub1)
		     ((Class406) this).aClass402_Sub2_Sub1_4647).aLong4453,
		    ((Class406) this).anInt4646));
	return ((Class406) this).aLong4648;
    }
    
    void method4878() {
	method195();
    }
    
    public int method68() {
	return ((Class406) this).aClass402_Sub2_Sub1_4647.method68();
    }
    
    public long method75() {
	if (((Class406) this).aLong4648 == 0L)
	    ((Class406) this).aLong4648
		= (IDirect3DTexture.GetSurfaceLevel
		   (((Class402_Sub2_Sub1)
		     ((Class406) this).aClass402_Sub2_Sub1_4647).aLong4453,
		    ((Class406) this).anInt4646));
	return ((Class406) this).aLong4648;
    }
    
    public void method115() {
	if (((Class406) this).aLong4648 != 0L) {
	    IUnknown.Release(((Class406) this).aLong4648);
	    ((Class406) this).aLong4648 = 0L;
	}
	((Class402_Sub2_Sub1) ((Class406) this).aClass402_Sub2_Sub1_4647)
	    .aClass173_Sub1_Sub2_4452.method8446(this);
    }
    
    public void method195() {
	if (((Class406) this).aLong4648 != 0L) {
	    ((Class402_Sub2_Sub1) ((Class406) this).aClass402_Sub2_Sub1_4647)
		.aClass173_Sub1_Sub2_4452
		.method10397(((Class406) this).aLong4648);
	    ((Class406) this).aLong4648 = 0L;
	}
    }
    
    public void finalize() {
	method195();
    }
    
    public int method40() {
	return ((Class406) this).aClass402_Sub2_Sub1_4647.method1();
    }
    
    void method4879() {
	method195();
    }
    
    public int method6() {
	return ((Class406) this).aClass402_Sub2_Sub1_4647.method1();
    }
    
    Class406(Class402_Sub2_Sub1 class402_sub2_sub1, int i) {
	((Class406) this).anInt4646 = i;
	((Class406) this).aClass402_Sub2_Sub1_4647 = class402_sub2_sub1;
	((Class402_Sub2_Sub1) ((Class406) this).aClass402_Sub2_Sub1_4647)
	    .aClass173_Sub1_Sub2_4452.method8494(this);
    }
    
    public int method71() {
	return ((Class406) this).aClass402_Sub2_Sub1_4647.method68();
    }
    
    public int method73() {
	return ((Class406) this).aClass402_Sub2_Sub1_4647.method68();
    }
    
    public int method1() {
	return ((Class406) this).aClass402_Sub2_Sub1_4647.method1();
    }
    
    public void method334() {
	if (((Class406) this).aLong4648 != 0L) {
	    ((Class402_Sub2_Sub1) ((Class406) this).aClass402_Sub2_Sub1_4647)
		.aClass173_Sub1_Sub2_4452
		.method10397(((Class406) this).aLong4648);
	    ((Class406) this).aLong4648 = 0L;
	}
    }
    
    void method4880() {
	method195();
    }
    
    public int method5() {
	return ((Class406) this).aClass402_Sub2_Sub1_4647.method1();
    }
    
    void method4881() {
	method195();
    }
    
    public long method333() {
	if (((Class406) this).aLong4648 == 0L)
	    ((Class406) this).aLong4648
		= (IDirect3DTexture.GetSurfaceLevel
		   (((Class402_Sub2_Sub1)
		     ((Class406) this).aClass402_Sub2_Sub1_4647).aLong4453,
		    ((Class406) this).anInt4646));
	return ((Class406) this).aLong4648;
    }
    
    public void method116() {
	if (((Class406) this).aLong4648 != 0L) {
	    IUnknown.Release(((Class406) this).aLong4648);
	    ((Class406) this).aLong4648 = 0L;
	}
	((Class402_Sub2_Sub1) ((Class406) this).aClass402_Sub2_Sub1_4647)
	    .aClass173_Sub1_Sub2_4452.method8446(this);
    }
    
    public int method72() {
	return ((Class406) this).aClass402_Sub2_Sub1_4647.method68();
    }
    
    public void method203() {
	if (((Class406) this).aLong4648 != 0L) {
	    ((Class402_Sub2_Sub1) ((Class406) this).aClass402_Sub2_Sub1_4647)
		.aClass173_Sub1_Sub2_4452
		.method10397(((Class406) this).aLong4648);
	    ((Class406) this).aLong4648 = 0L;
	}
    }
}
