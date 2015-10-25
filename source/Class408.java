/* Class408 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexBuffer;
import jagdx.IUnknown;

public class Class408 implements Interface36
{
    Class173_Sub1_Sub2 aClass173_Sub1_Sub2_4701;
    int anInt4702;
    int anInt4703;
    byte aByte4704;
    boolean aBool4705;
    long aLong4706 = 0L;
    
    public boolean method257(int i, int i_0_) {
	((Class408) this).anInt4703 = i;
	((Class408) this).aByte4704 = (byte) i_0_;
	if (((Class408) this).anInt4703 > ((Class408) this).anInt4702) {
	    int i_1_ = 8;
	    int i_2_;
	    if (((Class408) this).aBool4705) {
		i_2_ = 0;
		i_1_ |= 0x200;
	    } else
		i_2_ = 1;
	    if (((Class408) this).aLong4706 != 0L)
		IUnknown.Release(((Class408) this).aLong4706);
	    ((Class408) this).aLong4706
		= (IDirect3DDevice.CreateVertexBuffer
		   (((Class173_Sub1_Sub2)
		     ((Class408) this).aClass173_Sub1_Sub2_4701).aLong11378,
		    ((Class408) this).anInt4703, i_1_, 0, i_2_));
	    ((Class408) this).anInt4702 = ((Class408) this).anInt4703;
	}
	return ((Class408) this).aLong4706 != 0L;
    }
    
    public int method5() {
	return ((Class408) this).anInt4703;
    }
    
    int method4887() {
	return ((Class408) this).aByte4704;
    }
    
    public boolean method258(int i, int i_3_) {
	((Class408) this).anInt4703 = i;
	((Class408) this).aByte4704 = (byte) i_3_;
	if (((Class408) this).anInt4703 > ((Class408) this).anInt4702) {
	    int i_4_ = 8;
	    int i_5_;
	    if (((Class408) this).aBool4705) {
		i_5_ = 0;
		i_4_ |= 0x200;
	    } else
		i_5_ = 1;
	    if (((Class408) this).aLong4706 != 0L)
		IUnknown.Release(((Class408) this).aLong4706);
	    ((Class408) this).aLong4706
		= (IDirect3DDevice.CreateVertexBuffer
		   (((Class173_Sub1_Sub2)
		     ((Class408) this).aClass173_Sub1_Sub2_4701).aLong11378,
		    ((Class408) this).anInt4703, i_4_, 0, i_5_));
	    ((Class408) this).anInt4702 = ((Class408) this).anInt4703;
	}
	return ((Class408) this).aLong4706 != 0L;
    }
    
    public long method205(int i, int i_6_) {
	return IDirect3DVertexBuffer.Lock(((Class408) this).aLong4706, i, i_6_,
					  (((Class408) this).aBool4705 ? 8192
					   : 0));
    }
    
    int method4888() {
	return ((Class408) this).aByte4704;
    }
    
    public boolean method197(int i, int i_7_, long l) {
	return Class360.method4593(IDirect3DVertexBuffer.Upload
				   (((Class408) this).aLong4706, i, i_7_,
				    ((Class408) this).aBool4705 ? 8192 : 0,
				    l));
    }
    
    public void method115() {
	if (((Class408) this).aLong4706 != 0L) {
	    IUnknown.Release(((Class408) this).aLong4706);
	    ((Class408) this).aLong4706 = 0L;
	}
	((Class408) this).anInt4702 = 0;
	((Class408) this).anInt4703 = 0;
	((Class408) this).aClass173_Sub1_Sub2_4701.method8446(this);
    }
    
    public void method198() {
	IDirect3DVertexBuffer.Unlock(((Class408) this).aLong4706);
    }
    
    public void finalize() {
	method4892();
    }
    
    public void method204() {
	IDirect3DVertexBuffer.Unlock(((Class408) this).aLong4706);
    }
    
    public void method192() {
	IDirect3DVertexBuffer.Unlock(((Class408) this).aLong4706);
    }
    
    public void method116() {
	if (((Class408) this).aLong4706 != 0L) {
	    IUnknown.Release(((Class408) this).aLong4706);
	    ((Class408) this).aLong4706 = 0L;
	}
	((Class408) this).anInt4702 = 0;
	((Class408) this).anInt4703 = 0;
	((Class408) this).aClass173_Sub1_Sub2_4701.method8446(this);
    }
    
    void method4889() {
	method4892();
    }
    
    void method4890() {
	method4892();
    }
    
    public boolean method259(int i, int i_8_) {
	((Class408) this).anInt4703 = i;
	((Class408) this).aByte4704 = (byte) i_8_;
	if (((Class408) this).anInt4703 > ((Class408) this).anInt4702) {
	    int i_9_ = 8;
	    int i_10_;
	    if (((Class408) this).aBool4705) {
		i_10_ = 0;
		i_9_ |= 0x200;
	    } else
		i_10_ = 1;
	    if (((Class408) this).aLong4706 != 0L)
		IUnknown.Release(((Class408) this).aLong4706);
	    ((Class408) this).aLong4706
		= (IDirect3DDevice.CreateVertexBuffer
		   (((Class173_Sub1_Sub2)
		     ((Class408) this).aClass173_Sub1_Sub2_4701).aLong11378,
		    ((Class408) this).anInt4703, i_9_, 0, i_10_));
	    ((Class408) this).anInt4702 = ((Class408) this).anInt4703;
	}
	return ((Class408) this).aLong4706 != 0L;
    }
    
    void method4891() {
	method4892();
    }
    
    public int method73() {
	return ((Class408) this).anInt4703;
    }
    
    public int method178() {
	return ((Class408) this).anInt4703;
    }
    
    public boolean method199(int i, int i_11_, long l) {
	return Class360.method4593(IDirect3DVertexBuffer.Upload
				   (((Class408) this).aLong4706, i, i_11_,
				    ((Class408) this).aBool4705 ? 8192 : 0,
				    l));
    }
    
    Class408(Class173_Sub1_Sub2 class173_sub1_sub2, boolean bool) {
	((Class408) this).aClass173_Sub1_Sub2_4701 = class173_sub1_sub2;
	((Class408) this).aBool4705 = bool;
	((Class408) this).aClass173_Sub1_Sub2_4701.method8494(this);
    }
    
    public long method201(int i, int i_12_) {
	return IDirect3DVertexBuffer.Lock(((Class408) this).aLong4706, i,
					  i_12_,
					  (((Class408) this).aBool4705 ? 8192
					   : 0));
    }
    
    public long method202(int i, int i_13_) {
	return IDirect3DVertexBuffer.Lock(((Class408) this).aLong4706, i,
					  i_13_,
					  (((Class408) this).aBool4705 ? 8192
					   : 0));
    }
    
    public void method203() {
	IDirect3DVertexBuffer.Unlock(((Class408) this).aLong4706);
    }
    
    void method4892() {
	if (((Class408) this).aLong4706 != 0L) {
	    ((Class408) this).aClass173_Sub1_Sub2_4701
		.method10397(((Class408) this).aLong4706);
	    ((Class408) this).aLong4706 = 0L;
	    ((Class408) this).anInt4702 = 0;
	    ((Class408) this).anInt4703 = 0;
	}
    }
    
    void method4893() {
	method4892();
    }
    
    public boolean method200(int i, int i_14_, long l) {
	return Class360.method4593(IDirect3DVertexBuffer.Upload
				   (((Class408) this).aLong4706, i, i_14_,
				    ((Class408) this).aBool4705 ? 8192 : 0,
				    l));
    }
    
    int method4894() {
	return ((Class408) this).aByte4704;
    }
    
    int method4895() {
	return ((Class408) this).aByte4704;
    }
    
    void method4896() {
	if (((Class408) this).aLong4706 != 0L) {
	    ((Class408) this).aClass173_Sub1_Sub2_4701
		.method10397(((Class408) this).aLong4706);
	    ((Class408) this).aLong4706 = 0L;
	    ((Class408) this).anInt4702 = 0;
	    ((Class408) this).anInt4703 = 0;
	}
    }
}
