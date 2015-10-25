/* Class402_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;

public class Class402_Sub1 extends Class402 implements Interface32
{
    int anInt10049;
    int anInt10050;
    int anInt10051;
    
    public void method307(Class340 class340) {
	super.method303(class340);
    }
    
    long method4848() {
	return ((Class402_Sub1) this).aLong4453;
    }
    
    public void method308() {
	((Class402_Sub1) this).aClass173_Sub1_Sub2_4452.method10389(this);
    }
    
    public void method303(Class340 class340) {
	super.method303(class340);
    }
    
    public void method305() {
	((Class402_Sub1) this).aClass173_Sub1_Sub2_4452.method10389(this);
    }
    
    public void method116() {
	super.method115();
    }
    
    public void method306() {
	((Class402_Sub1) this).aClass173_Sub1_Sub2_4452.method10389(this);
    }
    
    public void method302(Class340 class340) {
	super.method303(class340);
    }
    
    Class402_Sub1(Class173_Sub1_Sub2 class173_sub1_sub2, Class149 class149,
		  int i, int i_0_, int i_1_, boolean bool, byte[] is) {
	super(class173_sub1_sub2, class149, Class169.aClass169_1935, false,
	      i * i_0_ * i_1_);
	((Class402_Sub1) this).anInt10049 = i;
	((Class402_Sub1) this).anInt10050 = i_0_;
	((Class402_Sub1) this).anInt10051 = i_1_;
	((Class402_Sub1) this).aLong4453
	    = (IDirect3DDevice.CreateVolumeTexture
	       (((Class173_Sub1_Sub2)
		 ((Class402_Sub1) this).aClass173_Sub1_Sub2_4452).aLong11378,
		i, i_0_, i_1_, 1, 0,
		Class173_Sub1_Sub2.method10394(class149,
					       (((Class402_Sub1) this)
						.aClass169_4451)),
		1));
	((Class402_Sub1) this).aClass173_Sub1_Sub2_4452.method8451
	    (((Class402_Sub1) this).anInt10049
	     * ((Class402_Sub1) this).anInt10050
	     * (class149.anInt1686 * 427009899));
	ByteBuffer bytebuffer
	    = ((Class402_Sub1) this).aClass173_Sub1_Sub2_4452.aByteBuffer9222;
	bytebuffer.clear();
	bytebuffer.put(is);
	IDirect3DVolumeTexture.Upload(((Class402_Sub1) this).aLong4453, 0, 0,
				      0, 0, ((Class402_Sub1) this).anInt10049,
				      ((Class402_Sub1) this).anInt10050,
				      ((Class402_Sub1) this).anInt10051,
				      (((Class402_Sub1) this).anInt10049
				       * (class149.anInt1686 * 427009899)),
				      0,
				      (((Class402_Sub1) this)
				       .aClass173_Sub1_Sub2_4452.aLong9223));
    }
    
    public void method115() {
	super.method115();
    }
    
    public void method304(Class340 class340) {
	super.method303(class340);
    }
    
    long method4853() {
	return ((Class402_Sub1) this).aLong4453;
    }
}
