/* Class413 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DIndexBuffer;
import jagdx.IUnknown;

public class Class413 implements Interface41
{
    Class169 aClass169_4725;
    int anInt4726;
    Class173_Sub1_Sub2 aClass173_Sub1_Sub2_4727;
    boolean aBool4728;
    int anInt4729;
    long aLong4730 = 0L;
    
    void method4926() {
	if (((Class413) this).aLong4730 != 0L) {
	    ((Class413) this).aClass173_Sub1_Sub2_4727
		.method10397(((Class413) this).aLong4730);
	    ((Class413) this).aLong4730 = 0L;
	}
	((Class413) this).anInt4729 = 0;
	((Class413) this).anInt4726 = 0;
    }
    
    public int method5() {
	return ((Class413) this).anInt4726;
    }
    
    public Class169 method310() {
	return ((Class413) this).aClass169_4725;
    }
    
    void method4927() {
	method4928();
    }
    
    public boolean method200(int i, int i_0_, long l) {
	return Class360.method4593(IDirect3DIndexBuffer.Upload
				   (((Class413) this).aLong4730, i, i_0_,
				    ((Class413) this).aBool4728 ? 8192 : 0,
				    l));
    }
    
    public void method192() {
	IDirect3DIndexBuffer.Unlock(((Class413) this).aLong4730);
    }
    
    public boolean method197(int i, int i_1_, long l) {
	return Class360.method4593(IDirect3DIndexBuffer.Upload
				   (((Class413) this).aLong4730, i, i_1_,
				    ((Class413) this).aBool4728 ? 8192 : 0,
				    l));
    }
    
    public void method115() {
	if (((Class413) this).aLong4730 != 0L) {
	    IUnknown.Release(((Class413) this).aLong4730);
	    ((Class413) this).aLong4730 = 0L;
	}
	((Class413) this).anInt4729 = 0;
	((Class413) this).anInt4726 = 0;
	((Class413) this).aClass173_Sub1_Sub2_4727.method8446(this);
    }
    
    void method4928() {
	if (((Class413) this).aLong4730 != 0L) {
	    ((Class413) this).aClass173_Sub1_Sub2_4727
		.method10397(((Class413) this).aLong4730);
	    ((Class413) this).aLong4730 = 0L;
	}
	((Class413) this).anInt4729 = 0;
	((Class413) this).anInt4726 = 0;
    }
    
    public void finalize() {
	method4928();
    }
    
    public void method116() {
	if (((Class413) this).aLong4730 != 0L) {
	    IUnknown.Release(((Class413) this).aLong4730);
	    ((Class413) this).aLong4730 = 0L;
	}
	((Class413) this).anInt4729 = 0;
	((Class413) this).anInt4726 = 0;
	((Class413) this).aClass173_Sub1_Sub2_4727.method8446(this);
    }
    
    public boolean method199(int i, int i_2_, long l) {
	return Class360.method4593(IDirect3DIndexBuffer.Upload
				   (((Class413) this).aLong4730, i, i_2_,
				    ((Class413) this).aBool4728 ? 8192 : 0,
				    l));
    }
    
    Class413(Class173_Sub1_Sub2 class173_sub1_sub2, Class169 class169,
	     boolean bool) {
	((Class413) this).aClass173_Sub1_Sub2_4727 = class173_sub1_sub2;
	((Class413) this).aClass169_4725 = class169;
	((Class413) this).aBool4728 = bool;
	((Class413) this).aClass173_Sub1_Sub2_4727.method8494(this);
    }
    
    void method4929() {
	method4928();
    }
    
    void method4930() {
	method4928();
    }
    
    public int method73() {
	return ((Class413) this).anInt4726;
    }
    
    public Class169 method314() {
	return ((Class413) this).aClass169_4725;
    }
    
    public int method178() {
	return ((Class413) this).anInt4726;
    }
    
    public long method202(int i, int i_3_) {
	return IDirect3DIndexBuffer.Lock(((Class413) this).aLong4730, i, i_3_,
					 (((Class413) this).aBool4728 ? 8192
					  : 0));
    }
    
    public long method201(int i, int i_4_) {
	return IDirect3DIndexBuffer.Lock(((Class413) this).aLong4730, i, i_4_,
					 (((Class413) this).aBool4728 ? 8192
					  : 0));
    }
    
    void method4931() {
	method4928();
    }
    
    public void method203() {
	IDirect3DIndexBuffer.Unlock(((Class413) this).aLong4730);
    }
    
    public void method204() {
	IDirect3DIndexBuffer.Unlock(((Class413) this).aLong4730);
    }
    
    public Class169 method315() {
	return ((Class413) this).aClass169_4725;
    }
    
    public Class169 method316() {
	return ((Class413) this).aClass169_4725;
    }
    
    public void method198() {
	IDirect3DIndexBuffer.Unlock(((Class413) this).aLong4730);
    }
    
    public void method311(int i) {
	((Class413) this).anInt4726
	    = ((Class413) this).aClass169_4725.anInt1942 * -1009481111 * i;
	if (((Class413) this).anInt4726 > ((Class413) this).anInt4729) {
	    if (((Class413) this).aLong4730 != 0L)
		IUnknown.Release(((Class413) this).aLong4730);
	    int i_5_ = 8;
	    int i_6_;
	    if (((Class413) this).aBool4728) {
		i_6_ = 0;
		i_5_ |= 0x200;
	    } else
		i_6_ = 1;
	    ((Class413) this).aLong4730
		= (IDirect3DDevice.CreateIndexBuffer
		   (((Class173_Sub1_Sub2)
		     ((Class413) this).aClass173_Sub1_Sub2_4727).aLong11378,
		    ((Class413) this).anInt4726, i_5_,
		    (((Class413) this).aClass169_4725
		     == Class169.aClass169_1933) ? 101 : 102,
		    i_6_));
	    ((Class413) this).anInt4729 = ((Class413) this).anInt4726;
	}
    }
    
    public long method205(int i, int i_7_) {
	return IDirect3DIndexBuffer.Lock(((Class413) this).aLong4730, i, i_7_,
					 (((Class413) this).aBool4728 ? 8192
					  : 0));
    }
    
    public void method313(int i) {
	((Class413) this).anInt4726
	    = ((Class413) this).aClass169_4725.anInt1942 * -1009481111 * i;
	if (((Class413) this).anInt4726 > ((Class413) this).anInt4729) {
	    if (((Class413) this).aLong4730 != 0L)
		IUnknown.Release(((Class413) this).aLong4730);
	    int i_8_ = 8;
	    int i_9_;
	    if (((Class413) this).aBool4728) {
		i_9_ = 0;
		i_8_ |= 0x200;
	    } else
		i_9_ = 1;
	    ((Class413) this).aLong4730
		= (IDirect3DDevice.CreateIndexBuffer
		   (((Class173_Sub1_Sub2)
		     ((Class413) this).aClass173_Sub1_Sub2_4727).aLong11378,
		    ((Class413) this).anInt4726, i_8_,
		    (((Class413) this).aClass169_4725
		     == Class169.aClass169_1933) ? 101 : 102,
		    i_9_));
	    ((Class413) this).anInt4729 = ((Class413) this).anInt4726;
	}
    }
    
    public void method31(int i) {
	((Class413) this).anInt4726
	    = ((Class413) this).aClass169_4725.anInt1942 * -1009481111 * i;
	if (((Class413) this).anInt4726 > ((Class413) this).anInt4729) {
	    if (((Class413) this).aLong4730 != 0L)
		IUnknown.Release(((Class413) this).aLong4730);
	    int i_10_ = 8;
	    int i_11_;
	    if (((Class413) this).aBool4728) {
		i_11_ = 0;
		i_10_ |= 0x200;
	    } else
		i_11_ = 1;
	    ((Class413) this).aLong4730
		= (IDirect3DDevice.CreateIndexBuffer
		   (((Class173_Sub1_Sub2)
		     ((Class413) this).aClass173_Sub1_Sub2_4727).aLong11378,
		    ((Class413) this).anInt4726, i_10_,
		    (((Class413) this).aClass169_4725
		     == Class169.aClass169_1933) ? 101 : 102,
		    i_11_));
	    ((Class413) this).anInt4729 = ((Class413) this).anInt4726;
	}
    }
    
    public Class169 method312() {
	return ((Class413) this).aClass169_4725;
    }
}
