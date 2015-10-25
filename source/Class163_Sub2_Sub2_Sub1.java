/* Class163_Sub2_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSwapChain;
import jagdx.IUnknown;

public class Class163_Sub2_Sub2_Sub1 extends Class163_Sub2_Sub2
    implements Interface49
{
    long aLong11828;
    long aLong11829;
    long aLong11830;
    Class173_Sub1_Sub2 aClass173_Sub1_Sub2_11831;
    int anInt11832;
    boolean aBool11833;
    int anInt11834;
    boolean aBool11835 = false;
    Canvas aCanvas11836;
    D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS11837;
    
    public int method2069() {
	return ((Class163_Sub2_Sub2_Sub1) this).anInt11832;
    }
    
    public void method336() {
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11830 == 0L) {
	    ((Class163_Sub2_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS11837
		= new D3DPRESENT_PARAMETERS(((Class163_Sub2_Sub2_Sub1) this)
					    .aCanvas11836);
	    ((Class163_Sub2_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS11837
		.Windowed
		= true;
	    ((Class163_Sub2_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS11837
		.BackBufferCount
		= 1;
	    ((Class163_Sub2_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS11837
		.PresentationInterval
		= -2147483648;
	    ((Class163_Sub2_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS11837
		.BackBufferWidth
		= ((Class163_Sub2_Sub2_Sub1) this).anInt11832;
	    ((Class163_Sub2_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS11837
		.BackBufferHeight
		= ((Class163_Sub2_Sub2_Sub1) this).anInt11834;
	    if (((Class163_Sub2_Sub2_Sub1) this).aBool11833) {
		((Class163_Sub2_Sub2_Sub1) this).aLong11830
		    = (IDirect3DDevice.GetSwapChain
		       (((Class173_Sub1_Sub2)
			 (((Class163_Sub2_Sub2_Sub1) this)
			  .aClass173_Sub1_Sub2_11831)).aLong11378,
			0));
		((Class163_Sub2_Sub2_Sub1) this).aLong11829
		    = (IDirect3DSwapChain.GetBackBuffer
		       (((Class163_Sub2_Sub2_Sub1) this).aLong11830, 0, 0));
		((Class163_Sub2_Sub2_Sub1) this).aLong11828
		    = (IDirect3DDevice.GetDepthStencilSurface
		       (((Class173_Sub1_Sub2) (((Class163_Sub2_Sub2_Sub1) this)
					       .aClass173_Sub1_Sub2_11831))
			.aLong11378));
	    } else {
		if (!Class173_Sub1_Sub2.method10396
		     ((((Class173_Sub1_Sub2) (((Class163_Sub2_Sub2_Sub1) this)
					      .aClass173_Sub1_Sub2_11831))
		       .anInt11382),
		      (((Class173_Sub1_Sub2) (((Class163_Sub2_Sub2_Sub1) this)
					      .aClass173_Sub1_Sub2_11831))
		       .anInt11344),
		      (((Class173_Sub1_Sub2) (((Class163_Sub2_Sub2_Sub1) this)
					      .aClass173_Sub1_Sub2_11831))
		       .aLong11367),
		      (((Class163_Sub2_Sub2_Sub1) this)
		       .aClass173_Sub1_Sub2_11831.anInt9355),
		      (((Class173_Sub1_Sub2) (((Class163_Sub2_Sub2_Sub1) this)
					      .aClass173_Sub1_Sub2_11831))
		       .aD3DDISPLAYMODE11348),
		      (((Class163_Sub2_Sub2_Sub1) this)
		       .aD3DPRESENT_PARAMETERS11837)))
		    throw new RuntimeException();
		int i = (((Class163_Sub2_Sub2_Sub1) this)
			 .aD3DPRESENT_PARAMETERS11837.AutoDepthStencilFormat);
		((Class163_Sub2_Sub2_Sub1) this).aLong11830
		    = (IDirect3DDevice.CreateAdditionalSwapChain
		       (((Class173_Sub1_Sub2)
			 (((Class163_Sub2_Sub2_Sub1) this)
			  .aClass173_Sub1_Sub2_11831)).aLong11378,
			(((Class163_Sub2_Sub2_Sub1) this)
			 .aD3DPRESENT_PARAMETERS11837)));
		((Class163_Sub2_Sub2_Sub1) this).aLong11829
		    = (IDirect3DSwapChain.GetBackBuffer
		       (((Class163_Sub2_Sub2_Sub1) this).aLong11830, 0, 0));
		((Class163_Sub2_Sub2_Sub1) this).aLong11828
		    = (IDirect3DDevice.CreateDepthStencilSurface
		       (((Class173_Sub1_Sub2)
			 (((Class163_Sub2_Sub2_Sub1) this)
			  .aClass173_Sub1_Sub2_11831)).aLong11378,
			((Class163_Sub2_Sub2_Sub1) this).anInt11832,
			((Class163_Sub2_Sub2_Sub1) this).anInt11834, i,
			(((Class163_Sub2_Sub2_Sub1) this)
			 .aD3DPRESENT_PARAMETERS11837.MultiSampleType),
			(((Class163_Sub2_Sub2_Sub1) this)
			 .aD3DPRESENT_PARAMETERS11837.MultiSampleQuality),
			false));
	    }
	    ((Class163_Sub2_Sub2_Sub1) this).aClass173_Sub1_Sub2_11831
		.method10401(this);
	}
	if (((Class163_Sub2_Sub2_Sub1) this).aBool11835)
	    method335();
    }
    
    public int method2074() {
	return ((Class163_Sub2_Sub2_Sub1) this).anInt11832;
    }
    
    public int method2070() {
	return ((Class163_Sub2_Sub2_Sub1) this).anInt11834;
    }
    
    public void method337() {
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11829 != 0L) {
	    IUnknown.Release(((Class163_Sub2_Sub2_Sub1) this).aLong11829);
	    ((Class163_Sub2_Sub2_Sub1) this).aLong11829 = 0L;
	}
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11828 != 0L) {
	    IUnknown.Release(((Class163_Sub2_Sub2_Sub1) this).aLong11828);
	    ((Class163_Sub2_Sub2_Sub1) this).aLong11828 = 0L;
	}
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11830 != 0L) {
	    IUnknown.Release(((Class163_Sub2_Sub2_Sub1) this).aLong11830);
	    ((Class163_Sub2_Sub2_Sub1) this).aLong11830 = 0L;
	}
	((Class163_Sub2_Sub2_Sub1) this).aClass173_Sub1_Sub2_11831
	    .method10383(this);
    }
    
    boolean method2072() {
	((Class163_Sub2_Sub2_Sub1) this).aBool11835 = false;
	return Class360.method4593(IDirect3DDevice.SetDepthStencilSurface
				   (((Class173_Sub1_Sub2)
				     (((Class163_Sub2_Sub2_Sub1) this)
				      .aClass173_Sub1_Sub2_11831)).aLong11378,
				    0L));
    }
    
    public int method8917() {
	return IDirect3DSwapChain
		   .Present(((Class163_Sub2_Sub2_Sub1) this).aLong11830, 0);
    }
    
    public int method8924(int i, int i_0_) {
	return IDirect3DSwapChain
		   .Present(((Class163_Sub2_Sub2_Sub1) this).aLong11830, 0);
    }
    
    void method8921(int i, int i_1_) {
	method115();
	((Class163_Sub2_Sub2_Sub1) this).anInt11832 = i;
	((Class163_Sub2_Sub2_Sub1) this).anInt11834 = i_1_;
	if (((Class163_Sub2_Sub2_Sub1) this).aBool11833)
	    ((Class163_Sub2_Sub2_Sub1) this).aClass173_Sub1_Sub2_11831
		.method10381
		(((Class163_Sub2_Sub2_Sub1) this).anInt11832,
		 ((Class163_Sub2_Sub2_Sub1) this).anInt11834);
	method336();
	super.method8921(i, i_1_);
    }
    
    boolean method2077() {
	((Class163_Sub2_Sub2_Sub1) this).aBool11835 = false;
	return Class360.method4593(IDirect3DDevice.SetDepthStencilSurface
				   (((Class173_Sub1_Sub2)
				     (((Class163_Sub2_Sub2_Sub1) this)
				      .aClass173_Sub1_Sub2_11831)).aLong11378,
				    0L));
    }
    
    void method10730() {
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11829 != 0L) {
	    IUnknown.Release(((Class163_Sub2_Sub2_Sub1) this).aLong11829);
	    ((Class163_Sub2_Sub2_Sub1) this).aLong11829 = 0L;
	}
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11828 != 0L) {
	    IUnknown.Release(((Class163_Sub2_Sub2_Sub1) this).aLong11828);
	    ((Class163_Sub2_Sub2_Sub1) this).aLong11828 = 0L;
	}
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11830 != 0L) {
	    IUnknown.Release(((Class163_Sub2_Sub2_Sub1) this).aLong11830);
	    ((Class163_Sub2_Sub2_Sub1) this).aLong11830 = 0L;
	}
	((Class163_Sub2_Sub2_Sub1) this).aClass173_Sub1_Sub2_11831
	    .method10383(this);
    }
    
    public void finalize() throws Throwable {
	method10730();
	super.finalize();
    }
    
    public boolean method339() {
	((Class163_Sub2_Sub2_Sub1) this).aBool11835 = true;
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11830 == 0L) {
	    if (((Class173_Sub1_Sub2)
		 ((Class163_Sub2_Sub2_Sub1) this).aClass173_Sub1_Sub2_11831)
		.aBool11350)
		return false;
	    method336();
	}
	if (Class360.method4592(IDirect3DDevice.SetRenderTarget
				(((Class173_Sub1_Sub2)
				  (((Class163_Sub2_Sub2_Sub1) this)
				   .aClass173_Sub1_Sub2_11831)).aLong11378,
				 0,
				 ((Class163_Sub2_Sub2_Sub1) this).aLong11829)))
	    return false;
	if (Class360.method4592(IDirect3DDevice.SetDepthStencilSurface
				(((Class173_Sub1_Sub2)
				  (((Class163_Sub2_Sub2_Sub1) this)
				   .aClass173_Sub1_Sub2_11831)).aLong11378,
				 ((Class163_Sub2_Sub2_Sub1) this).aLong11828)))
	    return false;
	return super.method335();
    }
    
    public void method115() {
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11829 != 0L) {
	    IUnknown.Release(((Class163_Sub2_Sub2_Sub1) this).aLong11829);
	    ((Class163_Sub2_Sub2_Sub1) this).aLong11829 = 0L;
	}
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11828 != 0L) {
	    IUnknown.Release(((Class163_Sub2_Sub2_Sub1) this).aLong11828);
	    ((Class163_Sub2_Sub2_Sub1) this).aLong11828 = 0L;
	}
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11830 != 0L) {
	    IUnknown.Release(((Class163_Sub2_Sub2_Sub1) this).aLong11830);
	    ((Class163_Sub2_Sub2_Sub1) this).aLong11830 = 0L;
	}
	((Class163_Sub2_Sub2_Sub1) this).aClass173_Sub1_Sub2_11831
	    .method10383(this);
    }
    
    Class163_Sub2_Sub2_Sub1(Class173_Sub1_Sub2 class173_sub1_sub2,
			    Canvas canvas, int i, int i_2_, boolean bool) {
	super(class173_sub1_sub2);
	((Class163_Sub2_Sub2_Sub1) this).aBool11833 = false;
	((Class163_Sub2_Sub2_Sub1) this).aCanvas11836 = canvas;
	((Class163_Sub2_Sub2_Sub1) this).aClass173_Sub1_Sub2_11831
	    = class173_sub1_sub2;
	((Class163_Sub2_Sub2_Sub1) this).anInt11832 = i;
	((Class163_Sub2_Sub2_Sub1) this).anInt11834 = i_2_;
	((Class163_Sub2_Sub2_Sub1) this).aBool11833 = bool;
	method336();
    }
    
    public int method2071() {
	return ((Class163_Sub2_Sub2_Sub1) this).anInt11834;
    }
    
    public int method2076() {
	return ((Class163_Sub2_Sub2_Sub1) this).anInt11834;
    }
    
    public boolean method335() {
	((Class163_Sub2_Sub2_Sub1) this).aBool11835 = true;
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11830 == 0L) {
	    if (((Class173_Sub1_Sub2)
		 ((Class163_Sub2_Sub2_Sub1) this).aClass173_Sub1_Sub2_11831)
		.aBool11350)
		return false;
	    method336();
	}
	if (Class360.method4592(IDirect3DDevice.SetRenderTarget
				(((Class173_Sub1_Sub2)
				  (((Class163_Sub2_Sub2_Sub1) this)
				   .aClass173_Sub1_Sub2_11831)).aLong11378,
				 0,
				 ((Class163_Sub2_Sub2_Sub1) this).aLong11829)))
	    return false;
	if (Class360.method4592(IDirect3DDevice.SetDepthStencilSurface
				(((Class173_Sub1_Sub2)
				  (((Class163_Sub2_Sub2_Sub1) this)
				   .aClass173_Sub1_Sub2_11831)).aLong11378,
				 ((Class163_Sub2_Sub2_Sub1) this).aLong11828)))
	    return false;
	return super.method335();
    }
    
    public int method8916() {
	return IDirect3DSwapChain
		   .Present(((Class163_Sub2_Sub2_Sub1) this).aLong11830, 0);
    }
    
    void method10731() {
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11829 != 0L) {
	    IUnknown.Release(((Class163_Sub2_Sub2_Sub1) this).aLong11829);
	    ((Class163_Sub2_Sub2_Sub1) this).aLong11829 = 0L;
	}
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11828 != 0L) {
	    IUnknown.Release(((Class163_Sub2_Sub2_Sub1) this).aLong11828);
	    ((Class163_Sub2_Sub2_Sub1) this).aLong11828 = 0L;
	}
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11830 != 0L) {
	    IUnknown.Release(((Class163_Sub2_Sub2_Sub1) this).aLong11830);
	    ((Class163_Sub2_Sub2_Sub1) this).aLong11830 = 0L;
	}
	((Class163_Sub2_Sub2_Sub1) this).aClass173_Sub1_Sub2_11831
	    .method10383(this);
    }
    
    boolean method2078() {
	((Class163_Sub2_Sub2_Sub1) this).aBool11835 = false;
	return Class360.method4593(IDirect3DDevice.SetDepthStencilSurface
				   (((Class173_Sub1_Sub2)
				     (((Class163_Sub2_Sub2_Sub1) this)
				      .aClass173_Sub1_Sub2_11831)).aLong11378,
				    0L));
    }
    
    public int method2075() {
	return ((Class163_Sub2_Sub2_Sub1) this).anInt11832;
    }
    
    boolean method2079() {
	((Class163_Sub2_Sub2_Sub1) this).aBool11835 = false;
	return Class360.method4593(IDirect3DDevice.SetDepthStencilSurface
				   (((Class173_Sub1_Sub2)
				     (((Class163_Sub2_Sub2_Sub1) this)
				      .aClass173_Sub1_Sub2_11831)).aLong11378,
				    0L));
    }
    
    public void method204() {
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11829 != 0L) {
	    IUnknown.Release(((Class163_Sub2_Sub2_Sub1) this).aLong11829);
	    ((Class163_Sub2_Sub2_Sub1) this).aLong11829 = 0L;
	}
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11828 != 0L) {
	    IUnknown.Release(((Class163_Sub2_Sub2_Sub1) this).aLong11828);
	    ((Class163_Sub2_Sub2_Sub1) this).aLong11828 = 0L;
	}
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11830 != 0L) {
	    IUnknown.Release(((Class163_Sub2_Sub2_Sub1) this).aLong11830);
	    ((Class163_Sub2_Sub2_Sub1) this).aLong11830 = 0L;
	}
	((Class163_Sub2_Sub2_Sub1) this).aClass173_Sub1_Sub2_11831
	    .method10383(this);
    }
    
    public void method198() {
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11829 != 0L) {
	    IUnknown.Release(((Class163_Sub2_Sub2_Sub1) this).aLong11829);
	    ((Class163_Sub2_Sub2_Sub1) this).aLong11829 = 0L;
	}
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11828 != 0L) {
	    IUnknown.Release(((Class163_Sub2_Sub2_Sub1) this).aLong11828);
	    ((Class163_Sub2_Sub2_Sub1) this).aLong11828 = 0L;
	}
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11830 != 0L) {
	    IUnknown.Release(((Class163_Sub2_Sub2_Sub1) this).aLong11830);
	    ((Class163_Sub2_Sub2_Sub1) this).aLong11830 = 0L;
	}
	((Class163_Sub2_Sub2_Sub1) this).aClass173_Sub1_Sub2_11831
	    .method10383(this);
    }
    
    public void method340() {
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11830 == 0L) {
	    ((Class163_Sub2_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS11837
		= new D3DPRESENT_PARAMETERS(((Class163_Sub2_Sub2_Sub1) this)
					    .aCanvas11836);
	    ((Class163_Sub2_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS11837
		.Windowed
		= true;
	    ((Class163_Sub2_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS11837
		.BackBufferCount
		= 1;
	    ((Class163_Sub2_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS11837
		.PresentationInterval
		= -2147483648;
	    ((Class163_Sub2_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS11837
		.BackBufferWidth
		= ((Class163_Sub2_Sub2_Sub1) this).anInt11832;
	    ((Class163_Sub2_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS11837
		.BackBufferHeight
		= ((Class163_Sub2_Sub2_Sub1) this).anInt11834;
	    if (((Class163_Sub2_Sub2_Sub1) this).aBool11833) {
		((Class163_Sub2_Sub2_Sub1) this).aLong11830
		    = (IDirect3DDevice.GetSwapChain
		       (((Class173_Sub1_Sub2)
			 (((Class163_Sub2_Sub2_Sub1) this)
			  .aClass173_Sub1_Sub2_11831)).aLong11378,
			0));
		((Class163_Sub2_Sub2_Sub1) this).aLong11829
		    = (IDirect3DSwapChain.GetBackBuffer
		       (((Class163_Sub2_Sub2_Sub1) this).aLong11830, 0, 0));
		((Class163_Sub2_Sub2_Sub1) this).aLong11828
		    = (IDirect3DDevice.GetDepthStencilSurface
		       (((Class173_Sub1_Sub2) (((Class163_Sub2_Sub2_Sub1) this)
					       .aClass173_Sub1_Sub2_11831))
			.aLong11378));
	    } else {
		if (!Class173_Sub1_Sub2.method10396
		     ((((Class173_Sub1_Sub2) (((Class163_Sub2_Sub2_Sub1) this)
					      .aClass173_Sub1_Sub2_11831))
		       .anInt11382),
		      (((Class173_Sub1_Sub2) (((Class163_Sub2_Sub2_Sub1) this)
					      .aClass173_Sub1_Sub2_11831))
		       .anInt11344),
		      (((Class173_Sub1_Sub2) (((Class163_Sub2_Sub2_Sub1) this)
					      .aClass173_Sub1_Sub2_11831))
		       .aLong11367),
		      (((Class163_Sub2_Sub2_Sub1) this)
		       .aClass173_Sub1_Sub2_11831.anInt9355),
		      (((Class173_Sub1_Sub2) (((Class163_Sub2_Sub2_Sub1) this)
					      .aClass173_Sub1_Sub2_11831))
		       .aD3DDISPLAYMODE11348),
		      (((Class163_Sub2_Sub2_Sub1) this)
		       .aD3DPRESENT_PARAMETERS11837)))
		    throw new RuntimeException();
		int i = (((Class163_Sub2_Sub2_Sub1) this)
			 .aD3DPRESENT_PARAMETERS11837.AutoDepthStencilFormat);
		((Class163_Sub2_Sub2_Sub1) this).aLong11830
		    = (IDirect3DDevice.CreateAdditionalSwapChain
		       (((Class173_Sub1_Sub2)
			 (((Class163_Sub2_Sub2_Sub1) this)
			  .aClass173_Sub1_Sub2_11831)).aLong11378,
			(((Class163_Sub2_Sub2_Sub1) this)
			 .aD3DPRESENT_PARAMETERS11837)));
		((Class163_Sub2_Sub2_Sub1) this).aLong11829
		    = (IDirect3DSwapChain.GetBackBuffer
		       (((Class163_Sub2_Sub2_Sub1) this).aLong11830, 0, 0));
		((Class163_Sub2_Sub2_Sub1) this).aLong11828
		    = (IDirect3DDevice.CreateDepthStencilSurface
		       (((Class173_Sub1_Sub2)
			 (((Class163_Sub2_Sub2_Sub1) this)
			  .aClass173_Sub1_Sub2_11831)).aLong11378,
			((Class163_Sub2_Sub2_Sub1) this).anInt11832,
			((Class163_Sub2_Sub2_Sub1) this).anInt11834, i,
			(((Class163_Sub2_Sub2_Sub1) this)
			 .aD3DPRESENT_PARAMETERS11837.MultiSampleType),
			(((Class163_Sub2_Sub2_Sub1) this)
			 .aD3DPRESENT_PARAMETERS11837.MultiSampleQuality),
			false));
	    }
	    ((Class163_Sub2_Sub2_Sub1) this).aClass173_Sub1_Sub2_11831
		.method10401(this);
	}
	if (((Class163_Sub2_Sub2_Sub1) this).aBool11835)
	    method335();
    }
    
    public int method2073() {
	return ((Class163_Sub2_Sub2_Sub1) this).anInt11832;
    }
    
    void method10732() throws Throwable {
	method10730();
	super.finalize();
    }
    
    void method8919(int i, int i_3_) {
	method115();
	((Class163_Sub2_Sub2_Sub1) this).anInt11832 = i;
	((Class163_Sub2_Sub2_Sub1) this).anInt11834 = i_3_;
	if (((Class163_Sub2_Sub2_Sub1) this).aBool11833)
	    ((Class163_Sub2_Sub2_Sub1) this).aClass173_Sub1_Sub2_11831
		.method10381
		(((Class163_Sub2_Sub2_Sub1) this).anInt11832,
		 ((Class163_Sub2_Sub2_Sub1) this).anInt11834);
	method336();
	super.method8921(i, i_3_);
    }
    
    public int method8922(int i, int i_4_) {
	return IDirect3DSwapChain
		   .Present(((Class163_Sub2_Sub2_Sub1) this).aLong11830, 0);
    }
    
    public int method8923(int i, int i_5_) {
	return IDirect3DSwapChain
		   .Present(((Class163_Sub2_Sub2_Sub1) this).aLong11830, 0);
    }
    
    public int method8918(int i, int i_6_) {
	return IDirect3DSwapChain
		   .Present(((Class163_Sub2_Sub2_Sub1) this).aLong11830, 0);
    }
    
    boolean method2080() {
	((Class163_Sub2_Sub2_Sub1) this).aBool11835 = false;
	return Class360.method4593(IDirect3DDevice.SetDepthStencilSurface
				   (((Class173_Sub1_Sub2)
				     (((Class163_Sub2_Sub2_Sub1) this)
				      .aClass173_Sub1_Sub2_11831)).aLong11378,
				    0L));
    }
    
    void method10733() throws Throwable {
	method10730();
	super.finalize();
    }
    
    public boolean method338() {
	((Class163_Sub2_Sub2_Sub1) this).aBool11835 = true;
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11830 == 0L) {
	    if (((Class173_Sub1_Sub2)
		 ((Class163_Sub2_Sub2_Sub1) this).aClass173_Sub1_Sub2_11831)
		.aBool11350)
		return false;
	    method336();
	}
	if (Class360.method4592(IDirect3DDevice.SetRenderTarget
				(((Class173_Sub1_Sub2)
				  (((Class163_Sub2_Sub2_Sub1) this)
				   .aClass173_Sub1_Sub2_11831)).aLong11378,
				 0,
				 ((Class163_Sub2_Sub2_Sub1) this).aLong11829)))
	    return false;
	if (Class360.method4592(IDirect3DDevice.SetDepthStencilSurface
				(((Class173_Sub1_Sub2)
				  (((Class163_Sub2_Sub2_Sub1) this)
				   .aClass173_Sub1_Sub2_11831)).aLong11378,
				 ((Class163_Sub2_Sub2_Sub1) this).aLong11828)))
	    return false;
	return super.method335();
    }
    
    void method8920(int i, int i_7_) {
	method115();
	((Class163_Sub2_Sub2_Sub1) this).anInt11832 = i;
	((Class163_Sub2_Sub2_Sub1) this).anInt11834 = i_7_;
	if (((Class163_Sub2_Sub2_Sub1) this).aBool11833)
	    ((Class163_Sub2_Sub2_Sub1) this).aClass173_Sub1_Sub2_11831
		.method10381
		(((Class163_Sub2_Sub2_Sub1) this).anInt11832,
		 ((Class163_Sub2_Sub2_Sub1) this).anInt11834);
	method336();
	super.method8921(i, i_7_);
    }
    
    void method10734() throws Throwable {
	method10730();
	super.finalize();
    }
    
    public void method159() {
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11830 == 0L) {
	    ((Class163_Sub2_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS11837
		= new D3DPRESENT_PARAMETERS(((Class163_Sub2_Sub2_Sub1) this)
					    .aCanvas11836);
	    ((Class163_Sub2_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS11837
		.Windowed
		= true;
	    ((Class163_Sub2_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS11837
		.BackBufferCount
		= 1;
	    ((Class163_Sub2_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS11837
		.PresentationInterval
		= -2147483648;
	    ((Class163_Sub2_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS11837
		.BackBufferWidth
		= ((Class163_Sub2_Sub2_Sub1) this).anInt11832;
	    ((Class163_Sub2_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS11837
		.BackBufferHeight
		= ((Class163_Sub2_Sub2_Sub1) this).anInt11834;
	    if (((Class163_Sub2_Sub2_Sub1) this).aBool11833) {
		((Class163_Sub2_Sub2_Sub1) this).aLong11830
		    = (IDirect3DDevice.GetSwapChain
		       (((Class173_Sub1_Sub2)
			 (((Class163_Sub2_Sub2_Sub1) this)
			  .aClass173_Sub1_Sub2_11831)).aLong11378,
			0));
		((Class163_Sub2_Sub2_Sub1) this).aLong11829
		    = (IDirect3DSwapChain.GetBackBuffer
		       (((Class163_Sub2_Sub2_Sub1) this).aLong11830, 0, 0));
		((Class163_Sub2_Sub2_Sub1) this).aLong11828
		    = (IDirect3DDevice.GetDepthStencilSurface
		       (((Class173_Sub1_Sub2) (((Class163_Sub2_Sub2_Sub1) this)
					       .aClass173_Sub1_Sub2_11831))
			.aLong11378));
	    } else {
		if (!Class173_Sub1_Sub2.method10396
		     ((((Class173_Sub1_Sub2) (((Class163_Sub2_Sub2_Sub1) this)
					      .aClass173_Sub1_Sub2_11831))
		       .anInt11382),
		      (((Class173_Sub1_Sub2) (((Class163_Sub2_Sub2_Sub1) this)
					      .aClass173_Sub1_Sub2_11831))
		       .anInt11344),
		      (((Class173_Sub1_Sub2) (((Class163_Sub2_Sub2_Sub1) this)
					      .aClass173_Sub1_Sub2_11831))
		       .aLong11367),
		      (((Class163_Sub2_Sub2_Sub1) this)
		       .aClass173_Sub1_Sub2_11831.anInt9355),
		      (((Class173_Sub1_Sub2) (((Class163_Sub2_Sub2_Sub1) this)
					      .aClass173_Sub1_Sub2_11831))
		       .aD3DDISPLAYMODE11348),
		      (((Class163_Sub2_Sub2_Sub1) this)
		       .aD3DPRESENT_PARAMETERS11837)))
		    throw new RuntimeException();
		int i = (((Class163_Sub2_Sub2_Sub1) this)
			 .aD3DPRESENT_PARAMETERS11837.AutoDepthStencilFormat);
		((Class163_Sub2_Sub2_Sub1) this).aLong11830
		    = (IDirect3DDevice.CreateAdditionalSwapChain
		       (((Class173_Sub1_Sub2)
			 (((Class163_Sub2_Sub2_Sub1) this)
			  .aClass173_Sub1_Sub2_11831)).aLong11378,
			(((Class163_Sub2_Sub2_Sub1) this)
			 .aD3DPRESENT_PARAMETERS11837)));
		((Class163_Sub2_Sub2_Sub1) this).aLong11829
		    = (IDirect3DSwapChain.GetBackBuffer
		       (((Class163_Sub2_Sub2_Sub1) this).aLong11830, 0, 0));
		((Class163_Sub2_Sub2_Sub1) this).aLong11828
		    = (IDirect3DDevice.CreateDepthStencilSurface
		       (((Class173_Sub1_Sub2)
			 (((Class163_Sub2_Sub2_Sub1) this)
			  .aClass173_Sub1_Sub2_11831)).aLong11378,
			((Class163_Sub2_Sub2_Sub1) this).anInt11832,
			((Class163_Sub2_Sub2_Sub1) this).anInt11834, i,
			(((Class163_Sub2_Sub2_Sub1) this)
			 .aD3DPRESENT_PARAMETERS11837.MultiSampleType),
			(((Class163_Sub2_Sub2_Sub1) this)
			 .aD3DPRESENT_PARAMETERS11837.MultiSampleQuality),
			false));
	    }
	    ((Class163_Sub2_Sub2_Sub1) this).aClass173_Sub1_Sub2_11831
		.method10401(this);
	}
	if (((Class163_Sub2_Sub2_Sub1) this).aBool11835)
	    method335();
    }
    
    public void method156() {
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11830 == 0L) {
	    ((Class163_Sub2_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS11837
		= new D3DPRESENT_PARAMETERS(((Class163_Sub2_Sub2_Sub1) this)
					    .aCanvas11836);
	    ((Class163_Sub2_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS11837
		.Windowed
		= true;
	    ((Class163_Sub2_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS11837
		.BackBufferCount
		= 1;
	    ((Class163_Sub2_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS11837
		.PresentationInterval
		= -2147483648;
	    ((Class163_Sub2_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS11837
		.BackBufferWidth
		= ((Class163_Sub2_Sub2_Sub1) this).anInt11832;
	    ((Class163_Sub2_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS11837
		.BackBufferHeight
		= ((Class163_Sub2_Sub2_Sub1) this).anInt11834;
	    if (((Class163_Sub2_Sub2_Sub1) this).aBool11833) {
		((Class163_Sub2_Sub2_Sub1) this).aLong11830
		    = (IDirect3DDevice.GetSwapChain
		       (((Class173_Sub1_Sub2)
			 (((Class163_Sub2_Sub2_Sub1) this)
			  .aClass173_Sub1_Sub2_11831)).aLong11378,
			0));
		((Class163_Sub2_Sub2_Sub1) this).aLong11829
		    = (IDirect3DSwapChain.GetBackBuffer
		       (((Class163_Sub2_Sub2_Sub1) this).aLong11830, 0, 0));
		((Class163_Sub2_Sub2_Sub1) this).aLong11828
		    = (IDirect3DDevice.GetDepthStencilSurface
		       (((Class173_Sub1_Sub2) (((Class163_Sub2_Sub2_Sub1) this)
					       .aClass173_Sub1_Sub2_11831))
			.aLong11378));
	    } else {
		if (!Class173_Sub1_Sub2.method10396
		     ((((Class173_Sub1_Sub2) (((Class163_Sub2_Sub2_Sub1) this)
					      .aClass173_Sub1_Sub2_11831))
		       .anInt11382),
		      (((Class173_Sub1_Sub2) (((Class163_Sub2_Sub2_Sub1) this)
					      .aClass173_Sub1_Sub2_11831))
		       .anInt11344),
		      (((Class173_Sub1_Sub2) (((Class163_Sub2_Sub2_Sub1) this)
					      .aClass173_Sub1_Sub2_11831))
		       .aLong11367),
		      (((Class163_Sub2_Sub2_Sub1) this)
		       .aClass173_Sub1_Sub2_11831.anInt9355),
		      (((Class173_Sub1_Sub2) (((Class163_Sub2_Sub2_Sub1) this)
					      .aClass173_Sub1_Sub2_11831))
		       .aD3DDISPLAYMODE11348),
		      (((Class163_Sub2_Sub2_Sub1) this)
		       .aD3DPRESENT_PARAMETERS11837)))
		    throw new RuntimeException();
		int i = (((Class163_Sub2_Sub2_Sub1) this)
			 .aD3DPRESENT_PARAMETERS11837.AutoDepthStencilFormat);
		((Class163_Sub2_Sub2_Sub1) this).aLong11830
		    = (IDirect3DDevice.CreateAdditionalSwapChain
		       (((Class173_Sub1_Sub2)
			 (((Class163_Sub2_Sub2_Sub1) this)
			  .aClass173_Sub1_Sub2_11831)).aLong11378,
			(((Class163_Sub2_Sub2_Sub1) this)
			 .aD3DPRESENT_PARAMETERS11837)));
		((Class163_Sub2_Sub2_Sub1) this).aLong11829
		    = (IDirect3DSwapChain.GetBackBuffer
		       (((Class163_Sub2_Sub2_Sub1) this).aLong11830, 0, 0));
		((Class163_Sub2_Sub2_Sub1) this).aLong11828
		    = (IDirect3DDevice.CreateDepthStencilSurface
		       (((Class173_Sub1_Sub2)
			 (((Class163_Sub2_Sub2_Sub1) this)
			  .aClass173_Sub1_Sub2_11831)).aLong11378,
			((Class163_Sub2_Sub2_Sub1) this).anInt11832,
			((Class163_Sub2_Sub2_Sub1) this).anInt11834, i,
			(((Class163_Sub2_Sub2_Sub1) this)
			 .aD3DPRESENT_PARAMETERS11837.MultiSampleType),
			(((Class163_Sub2_Sub2_Sub1) this)
			 .aD3DPRESENT_PARAMETERS11837.MultiSampleQuality),
			false));
	    }
	    ((Class163_Sub2_Sub2_Sub1) this).aClass173_Sub1_Sub2_11831
		.method10401(this);
	}
	if (((Class163_Sub2_Sub2_Sub1) this).aBool11835)
	    method335();
    }
    
    void method10735() {
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11829 != 0L) {
	    IUnknown.Release(((Class163_Sub2_Sub2_Sub1) this).aLong11829);
	    ((Class163_Sub2_Sub2_Sub1) this).aLong11829 = 0L;
	}
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11828 != 0L) {
	    IUnknown.Release(((Class163_Sub2_Sub2_Sub1) this).aLong11828);
	    ((Class163_Sub2_Sub2_Sub1) this).aLong11828 = 0L;
	}
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11830 != 0L) {
	    IUnknown.Release(((Class163_Sub2_Sub2_Sub1) this).aLong11830);
	    ((Class163_Sub2_Sub2_Sub1) this).aLong11830 = 0L;
	}
	((Class163_Sub2_Sub2_Sub1) this).aClass173_Sub1_Sub2_11831
	    .method10383(this);
    }
    
    void method10736() {
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11829 != 0L) {
	    IUnknown.Release(((Class163_Sub2_Sub2_Sub1) this).aLong11829);
	    ((Class163_Sub2_Sub2_Sub1) this).aLong11829 = 0L;
	}
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11828 != 0L) {
	    IUnknown.Release(((Class163_Sub2_Sub2_Sub1) this).aLong11828);
	    ((Class163_Sub2_Sub2_Sub1) this).aLong11828 = 0L;
	}
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11830 != 0L) {
	    IUnknown.Release(((Class163_Sub2_Sub2_Sub1) this).aLong11830);
	    ((Class163_Sub2_Sub2_Sub1) this).aLong11830 = 0L;
	}
	((Class163_Sub2_Sub2_Sub1) this).aClass173_Sub1_Sub2_11831
	    .method10383(this);
    }
    
    void method10737() {
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11829 != 0L) {
	    IUnknown.Release(((Class163_Sub2_Sub2_Sub1) this).aLong11829);
	    ((Class163_Sub2_Sub2_Sub1) this).aLong11829 = 0L;
	}
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11828 != 0L) {
	    IUnknown.Release(((Class163_Sub2_Sub2_Sub1) this).aLong11828);
	    ((Class163_Sub2_Sub2_Sub1) this).aLong11828 = 0L;
	}
	if (((Class163_Sub2_Sub2_Sub1) this).aLong11830 != 0L) {
	    IUnknown.Release(((Class163_Sub2_Sub2_Sub1) this).aLong11830);
	    ((Class163_Sub2_Sub2_Sub1) this).aLong11830 = 0L;
	}
	((Class163_Sub2_Sub2_Sub1) this).aClass173_Sub1_Sub2_11831
	    .method10383(this);
    }
    
    void method10738() throws Throwable {
	method10730();
	super.finalize();
    }
}
