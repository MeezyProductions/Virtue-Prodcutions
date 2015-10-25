/* Class402_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import jagdx.IDirect3DCubeTexture;
import jagdx.IDirect3DDevice;

public class Class402_Sub3 extends Class402 implements Interface39
{
    int anInt10124;
    
    public void method303(Class340 class340) {
	super.method303(class340);
    }
    
    public void method308() {
	((Class402_Sub3) this).aClass173_Sub1_Sub2_4452.method10387(this);
    }
    
    public void method115() {
	super.method115();
    }
    
    public void method116() {
	super.method115();
    }
    
    Class402_Sub3(Class173_Sub1_Sub2 class173_sub1_sub2, int i, boolean bool,
		  int[][] is) {
	super(class173_sub1_sub2, Class149.aClass149_1676,
	      Class169.aClass169_1935,
	      bool && ((Class173_Sub1_Sub2) class173_sub1_sub2).aBool11377,
	      i * i * 6);
	((Class402_Sub3) this).anInt10124 = i;
	if (((Class402_Sub3) this).aBool4450)
	    ((Class402_Sub3) this).aLong4453
		= (IDirect3DDevice.CreateCubeTexture
		   ((((Class173_Sub1_Sub2)
		      ((Class402_Sub3) this).aClass173_Sub1_Sub2_4452)
		     .aLong11378),
		    ((Class402_Sub3) this).anInt10124, 0, 1024, 21, 1));
	else
	    ((Class402_Sub3) this).aLong4453
		= (IDirect3DDevice.CreateCubeTexture
		   ((((Class173_Sub1_Sub2)
		      ((Class402_Sub3) this).aClass173_Sub1_Sub2_4452)
		     .aLong11378),
		    ((Class402_Sub3) this).anInt10124, 1, 0, 21, 1));
	ByteBuffer bytebuffer
	    = ((Class402_Sub3) this).aClass173_Sub1_Sub2_4452.aByteBuffer9222;
	((Class402_Sub3) this).aClass173_Sub1_Sub2_4452.method8451
	    (((Class402_Sub3) this).anInt10124
	     * ((Class402_Sub3) this).anInt10124 * 4);
	for (int i_0_ = 0; i_0_ < 6; i_0_++) {
	    bytebuffer.clear();
	    bytebuffer.asIntBuffer().put(is[i_0_]);
	    IDirect3DCubeTexture.Upload(((Class402_Sub3) this).aLong4453, i_0_,
					0, 0, 0,
					((Class402_Sub3) this).anInt10124,
					((Class402_Sub3) this).anInt10124,
					((Class402_Sub3) this).anInt10124 * 4,
					0,
					(((Class402_Sub3) this)
					 .aClass173_Sub1_Sub2_4452.aLong9223));
	}
    }
    
    public void method306() {
	((Class402_Sub3) this).aClass173_Sub1_Sub2_4452.method10387(this);
    }
    
    public void method305() {
	((Class402_Sub3) this).aClass173_Sub1_Sub2_4452.method10387(this);
    }
    
    public void method302(Class340 class340) {
	super.method303(class340);
    }
    
    public void method307(Class340 class340) {
	super.method303(class340);
    }
    
    public void method304(Class340 class340) {
	super.method303(class340);
    }
}
