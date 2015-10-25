/* Class344_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class344_Sub1 extends Class344
{
    Class173_Sub1_Sub2 aClass173_Sub1_Sub2_10046;
    long aLong10047 = 0L;
    
    void method9112() {
	method9114();
    }
    
    void method9113(ByteBuffer bytebuffer, short i, short i_0_, byte i_1_,
		    byte i_2_, byte i_3_, byte i_4_) {
	bytebuffer.putShort(i);
	bytebuffer.putShort(i_0_);
	bytebuffer.put(i_1_);
	bytebuffer.put(i_2_);
	bytebuffer.put(i_3_);
	bytebuffer.put(i_4_);
    }
    
    Class344_Sub1(Class173_Sub1_Sub2 class173_sub1_sub2,
		  Class345[] class345s) {
	super(class345s);
	((Class344_Sub1) this).aClass173_Sub1_Sub2_10046 = class173_sub1_sub2;
	byte i = 0;
	ByteBuffer bytebuffer
	    = ((Class344_Sub1) this).aClass173_Sub1_Sub2_10046.aByteBuffer9222;
	bytebuffer.clear();
	for (short i_5_ = 0; i_5_ < aClass345Array3639.length; i_5_++) {
	    short i_6_ = 0;
	    Class345 class345 = aClass345Array3639[i_5_];
	    for (int i_7_ = 0; i_7_ < class345.method4529(); i_7_++) {
		Class331 class331 = class345.method4530(i_7_);
		if (class331 == Class331.aClass331_3521)
		    method9113(bytebuffer, i_5_, i_6_, (byte) 2, (byte) 0,
			       (byte) 0, (byte) 0);
		else if (class331 == Class331.aClass331_3515)
		    method9113(bytebuffer, i_5_, i_6_, (byte) 2, (byte) 0,
			       (byte) 3, (byte) 0);
		else if (class331 == Class331.aClass331_3531)
		    method9113(bytebuffer, i_5_, i_6_, (byte) 4, (byte) 0,
			       (byte) 10, (byte) 0);
		else if (class331 == Class331.aClass331_3517) {
		    Class344_Sub1 class344_sub1_8_ = this;
		    ByteBuffer bytebuffer_9_ = bytebuffer;
		    short i_10_ = i_5_;
		    short i_11_ = i_6_;
		    byte i_12_ = 0;
		    byte i_13_ = 0;
		    byte i_14_ = 5;
		    byte i_15_ = i;
		    i++;
		    class344_sub1_8_.method9113(bytebuffer_9_, i_10_, i_11_,
						i_12_, i_13_, i_14_, i_15_);
		} else if (class331 == Class331.aClass331_3518) {
		    Class344_Sub1 class344_sub1_16_ = this;
		    ByteBuffer bytebuffer_17_ = bytebuffer;
		    short i_18_ = i_5_;
		    short i_19_ = i_6_;
		    byte i_20_ = 1;
		    byte i_21_ = 0;
		    byte i_22_ = 5;
		    byte i_23_ = i;
		    i++;
		    class344_sub1_16_.method9113(bytebuffer_17_, i_18_, i_19_,
						 i_20_, i_21_, i_22_, i_23_);
		} else if (class331 == Class331.aClass331_3519) {
		    Class344_Sub1 class344_sub1_24_ = this;
		    ByteBuffer bytebuffer_25_ = bytebuffer;
		    short i_26_ = i_5_;
		    short i_27_ = i_6_;
		    byte i_28_ = 2;
		    byte i_29_ = 0;
		    byte i_30_ = 5;
		    byte i_31_ = i;
		    i++;
		    class344_sub1_24_.method9113(bytebuffer_25_, i_26_, i_27_,
						 i_28_, i_29_, i_30_, i_31_);
		} else if (class331 == Class331.aClass331_3522) {
		    Class344_Sub1 class344_sub1_32_ = this;
		    ByteBuffer bytebuffer_33_ = bytebuffer;
		    short i_34_ = i_5_;
		    short i_35_ = i_6_;
		    byte i_36_ = 3;
		    byte i_37_ = 0;
		    byte i_38_ = 5;
		    byte i_39_ = i;
		    i++;
		    class344_sub1_32_.method9113(bytebuffer_33_, i_34_, i_35_,
						 i_36_, i_37_, i_38_, i_39_);
		}
		i_6_ += class331.anInt3520;
	    }
	}
	method9113(bytebuffer, (short) 255, (short) 0, (byte) 17, (byte) 0,
		   (byte) 0, (byte) 0);
	((Class344_Sub1) this).aLong10047
	    = (IDirect3DDevice.CreateVertexDeclaration
	       (((Class173_Sub1_Sub2)
		 ((Class344_Sub1) this).aClass173_Sub1_Sub2_10046).aLong11378,
		((Class344_Sub1) this).aClass173_Sub1_Sub2_10046.aLong9223));
	((Class344_Sub1) this).aClass173_Sub1_Sub2_10046.method8494(this);
    }
    
    void method9114() {
	if (((Class344_Sub1) this).aLong10047 != 0L) {
	    ((Class344_Sub1) this).aClass173_Sub1_Sub2_10046
		.method10397(((Class344_Sub1) this).aLong10047);
	    ((Class344_Sub1) this).aLong10047 = 0L;
	}
    }
    
    public void finalize() {
	method9114();
    }
    
    public void method116() {
	if (((Class344_Sub1) this).aLong10047 != 0L) {
	    IUnknown.Release(((Class344_Sub1) this).aLong10047);
	    ((Class344_Sub1) this).aLong10047 = 0L;
	}
	((Class344_Sub1) this).aClass173_Sub1_Sub2_10046.method8446(this);
    }
    
    void method9115() {
	method9114();
    }
    
    void method9116() {
	method9114();
    }
    
    public void method115() {
	if (((Class344_Sub1) this).aLong10047 != 0L) {
	    IUnknown.Release(((Class344_Sub1) this).aLong10047);
	    ((Class344_Sub1) this).aLong10047 = 0L;
	}
	((Class344_Sub1) this).aClass173_Sub1_Sub2_10046.method8446(this);
    }
    
    void method9117() {
	method9114();
    }
    
    void method9118() {
	if (((Class344_Sub1) this).aLong10047 != 0L) {
	    ((Class344_Sub1) this).aClass173_Sub1_Sub2_10046
		.method10397(((Class344_Sub1) this).aLong10047);
	    ((Class344_Sub1) this).aLong10047 = 0L;
	}
    }
    
    void method9119() {
	if (((Class344_Sub1) this).aLong10047 != 0L) {
	    ((Class344_Sub1) this).aClass173_Sub1_Sub2_10046
		.method10397(((Class344_Sub1) this).aLong10047);
	    ((Class344_Sub1) this).aLong10047 = 0L;
	}
    }
}
