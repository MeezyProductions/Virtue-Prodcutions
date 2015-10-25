/* Class110_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class110_Sub6 extends Class110
{
    static final char aChar8922 = '\0';
    static final char aChar8923 = '\001';
    Class111 aClass111_8924;
    Class115 aClass115_8925;
    static float[] aFloatArray8926 = new float[4];
    
    boolean method1415() {
	return true;
    }
    
    void method1422(int i, int i_0_) {
	float f = -5.0E-4F * (float) ((i & 0x3) + 1);
	float f_1_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
	float f_2_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
	boolean bool = (i & 0x80) != 0;
	((Class110_Sub6) this).aClass173_Sub2_1397.method8774(1);
	if (bool) {
	    aFloatArray8926[0] = f_2_;
	    aFloatArray8926[1] = 0.0F;
	    aFloatArray8926[2] = 0.0F;
	    aFloatArray8926[3] = 0.0F;
	} else {
	    aFloatArray8926[0] = 0.0F;
	    aFloatArray8926[1] = 0.0F;
	    aFloatArray8926[2] = f_2_;
	    aFloatArray8926[3] = 0.0F;
	}
	OpenGL.glTexGenfv(8192, 9474, aFloatArray8926, 0);
	aFloatArray8926[0] = 0.0F;
	aFloatArray8926[1] = f_2_;
	aFloatArray8926[2] = 0.0F;
	aFloatArray8926[3] = (float) (((Class173_Sub2) (((Class110_Sub6) this)
							.aClass173_Sub2_1397))
				      .anInt9474) * f % 1.0F;
	OpenGL.glTexGenfv(8193, 9474, aFloatArray8926, 0);
	if (!((Class115) ((Class110_Sub6) this).aClass115_8925).aBool1421) {
	    int i_3_
		= (int) (f_1_
			 * (float) (((Class173_Sub2) (((Class110_Sub6) this)
						      .aClass173_Sub2_1397))
				    .anInt9474)
			 * 16.0F);
	    ((Class110_Sub6) this).aClass173_Sub2_1397.method8775
		(((Class115) ((Class110_Sub6) this).aClass115_8925)
		 .aClass120_Sub4Array1411[i_3_ % 16]);
	} else {
	    aFloatArray8926[0] = 0.0F;
	    aFloatArray8926[1] = 0.0F;
	    aFloatArray8926[2] = 0.0F;
	    aFloatArray8926[3]
		= ((float) ((Class173_Sub2) (((Class110_Sub6) this)
					     .aClass173_Sub2_1397)).anInt9474
		   * f_1_ % 1.0F);
	    OpenGL.glTexGenfv(8194, 9473, aFloatArray8926, 0);
	}
	((Class110_Sub6) this).aClass173_Sub2_1397.method8774(0);
    }
    
    void method1420() {
	((Class110_Sub6) this).aClass111_8924.method1428('\001');
	((Class110_Sub6) this).aClass173_Sub2_1397.method8774(1);
	((Class110_Sub6) this).aClass173_Sub2_1397.method8775(null);
	((Class110_Sub6) this).aClass173_Sub2_1397.method8774(0);
    }
    
    void method1405(boolean bool) {
	/* empty */
    }
    
    void method1409() {
	((Class110_Sub6) this).aClass111_8924.method1428('\001');
	((Class110_Sub6) this).aClass173_Sub2_1397.method8774(1);
	((Class110_Sub6) this).aClass173_Sub2_1397.method8775(null);
	((Class110_Sub6) this).aClass173_Sub2_1397.method8774(0);
    }
    
    void method1419(boolean bool) {
	((Class110_Sub6) this).aClass111_8924.method1428('\0');
	if (((Class115) ((Class110_Sub6) this).aClass115_8925).aBool1421) {
	    ((Class110_Sub6) this).aClass173_Sub2_1397.method8774(1);
	    ((Class110_Sub6) this).aClass173_Sub2_1397.method8775
		(((Class115) ((Class110_Sub6) this).aClass115_8925)
		 .aClass120_Sub2_1418);
	    ((Class110_Sub6) this).aClass173_Sub2_1397.method8774(0);
	}
    }
    
    void method1414(Class120 class120, int i) {
	((Class110_Sub6) this).aClass173_Sub2_1397.method8775(class120);
	((Class110_Sub6) this).aClass173_Sub2_1397.method8776(i);
    }
    
    boolean method1412() {
	return true;
    }
    
    boolean method1413() {
	return true;
    }
    
    void method1406(boolean bool) {
	/* empty */
    }
    
    void method1423(Class120 class120, int i) {
	((Class110_Sub6) this).aClass173_Sub2_1397.method8775(class120);
	((Class110_Sub6) this).aClass173_Sub2_1397.method8776(i);
    }
    
    void method1416(boolean bool) {
	((Class110_Sub6) this).aClass111_8924.method1428('\0');
	if (((Class115) ((Class110_Sub6) this).aClass115_8925).aBool1421) {
	    ((Class110_Sub6) this).aClass173_Sub2_1397.method8774(1);
	    ((Class110_Sub6) this).aClass173_Sub2_1397.method8775
		(((Class115) ((Class110_Sub6) this).aClass115_8925)
		 .aClass120_Sub2_1418);
	    ((Class110_Sub6) this).aClass173_Sub2_1397.method8774(0);
	}
    }
    
    void method1408(boolean bool) {
	((Class110_Sub6) this).aClass111_8924.method1428('\0');
	if (((Class115) ((Class110_Sub6) this).aClass115_8925).aBool1421) {
	    ((Class110_Sub6) this).aClass173_Sub2_1397.method8774(1);
	    ((Class110_Sub6) this).aClass173_Sub2_1397.method8775
		(((Class115) ((Class110_Sub6) this).aClass115_8925)
		 .aClass120_Sub2_1418);
	    ((Class110_Sub6) this).aClass173_Sub2_1397.method8774(0);
	}
    }
    
    boolean method1417() {
	return true;
    }
    
    Class110_Sub6(Class173_Sub2 class173_sub2, Class115 class115) {
	super(class173_sub2);
	((Class110_Sub6) this).aClass115_8925 = class115;
	((Class110_Sub6) this).aClass111_8924 = new Class111(class173_sub2, 2);
	((Class110_Sub6) this).aClass111_8924.method1426(0);
	((Class110_Sub6) this).aClass173_Sub2_1397.method8774(1);
	if (((Class115) ((Class110_Sub6) this).aClass115_8925).aBool1421) {
	    OpenGL.glTexGeni(8194, 9472, 9217);
	    OpenGL.glEnable(3170);
	}
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glTexGeni(8193, 9472, 9216);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	((Class110_Sub6) this).aClass173_Sub2_1397.method8774(0);
	((Class110_Sub6) this).aClass111_8924.method1425();
	((Class110_Sub6) this).aClass111_8924.method1426(1);
	((Class110_Sub6) this).aClass173_Sub2_1397.method8774(1);
	if (((Class115) ((Class110_Sub6) this).aClass115_8925).aBool1421)
	    OpenGL.glDisable(3170);
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	((Class110_Sub6) this).aClass173_Sub2_1397.method8774(0);
	((Class110_Sub6) this).aClass111_8924.method1425();
    }
    
    void method1418(boolean bool) {
	((Class110_Sub6) this).aClass111_8924.method1428('\0');
	if (((Class115) ((Class110_Sub6) this).aClass115_8925).aBool1421) {
	    ((Class110_Sub6) this).aClass173_Sub2_1397.method8774(1);
	    ((Class110_Sub6) this).aClass173_Sub2_1397.method8775
		(((Class115) ((Class110_Sub6) this).aClass115_8925)
		 .aClass120_Sub2_1418);
	    ((Class110_Sub6) this).aClass173_Sub2_1397.method8774(0);
	}
    }
    
    void method1410(int i, int i_4_) {
	float f = -5.0E-4F * (float) ((i & 0x3) + 1);
	float f_5_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
	float f_6_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
	boolean bool = (i & 0x80) != 0;
	((Class110_Sub6) this).aClass173_Sub2_1397.method8774(1);
	if (bool) {
	    aFloatArray8926[0] = f_6_;
	    aFloatArray8926[1] = 0.0F;
	    aFloatArray8926[2] = 0.0F;
	    aFloatArray8926[3] = 0.0F;
	} else {
	    aFloatArray8926[0] = 0.0F;
	    aFloatArray8926[1] = 0.0F;
	    aFloatArray8926[2] = f_6_;
	    aFloatArray8926[3] = 0.0F;
	}
	OpenGL.glTexGenfv(8192, 9474, aFloatArray8926, 0);
	aFloatArray8926[0] = 0.0F;
	aFloatArray8926[1] = f_6_;
	aFloatArray8926[2] = 0.0F;
	aFloatArray8926[3] = (float) (((Class173_Sub2) (((Class110_Sub6) this)
							.aClass173_Sub2_1397))
				      .anInt9474) * f % 1.0F;
	OpenGL.glTexGenfv(8193, 9474, aFloatArray8926, 0);
	if (!((Class115) ((Class110_Sub6) this).aClass115_8925).aBool1421) {
	    int i_7_
		= (int) (f_5_
			 * (float) (((Class173_Sub2) (((Class110_Sub6) this)
						      .aClass173_Sub2_1397))
				    .anInt9474)
			 * 16.0F);
	    ((Class110_Sub6) this).aClass173_Sub2_1397.method8775
		(((Class115) ((Class110_Sub6) this).aClass115_8925)
		 .aClass120_Sub4Array1411[i_7_ % 16]);
	} else {
	    aFloatArray8926[0] = 0.0F;
	    aFloatArray8926[1] = 0.0F;
	    aFloatArray8926[2] = 0.0F;
	    aFloatArray8926[3]
		= ((float) ((Class173_Sub2) (((Class110_Sub6) this)
					     .aClass173_Sub2_1397)).anInt9474
		   * f_5_ % 1.0F);
	    OpenGL.glTexGenfv(8194, 9473, aFloatArray8926, 0);
	}
	((Class110_Sub6) this).aClass173_Sub2_1397.method8774(0);
    }
    
    void method1421(int i, int i_8_) {
	float f = -5.0E-4F * (float) ((i & 0x3) + 1);
	float f_9_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
	float f_10_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
	boolean bool = (i & 0x80) != 0;
	((Class110_Sub6) this).aClass173_Sub2_1397.method8774(1);
	if (bool) {
	    aFloatArray8926[0] = f_10_;
	    aFloatArray8926[1] = 0.0F;
	    aFloatArray8926[2] = 0.0F;
	    aFloatArray8926[3] = 0.0F;
	} else {
	    aFloatArray8926[0] = 0.0F;
	    aFloatArray8926[1] = 0.0F;
	    aFloatArray8926[2] = f_10_;
	    aFloatArray8926[3] = 0.0F;
	}
	OpenGL.glTexGenfv(8192, 9474, aFloatArray8926, 0);
	aFloatArray8926[0] = 0.0F;
	aFloatArray8926[1] = f_10_;
	aFloatArray8926[2] = 0.0F;
	aFloatArray8926[3] = (float) (((Class173_Sub2) (((Class110_Sub6) this)
							.aClass173_Sub2_1397))
				      .anInt9474) * f % 1.0F;
	OpenGL.glTexGenfv(8193, 9474, aFloatArray8926, 0);
	if (!((Class115) ((Class110_Sub6) this).aClass115_8925).aBool1421) {
	    int i_11_
		= (int) (f_9_
			 * (float) (((Class173_Sub2) (((Class110_Sub6) this)
						      .aClass173_Sub2_1397))
				    .anInt9474)
			 * 16.0F);
	    ((Class110_Sub6) this).aClass173_Sub2_1397.method8775
		(((Class115) ((Class110_Sub6) this).aClass115_8925)
		 .aClass120_Sub4Array1411[i_11_ % 16]);
	} else {
	    aFloatArray8926[0] = 0.0F;
	    aFloatArray8926[1] = 0.0F;
	    aFloatArray8926[2] = 0.0F;
	    aFloatArray8926[3]
		= ((float) ((Class173_Sub2) (((Class110_Sub6) this)
					     .aClass173_Sub2_1397)).anInt9474
		   * f_9_ % 1.0F);
	    OpenGL.glTexGenfv(8194, 9473, aFloatArray8926, 0);
	}
	((Class110_Sub6) this).aClass173_Sub2_1397.method8774(0);
    }
    
    boolean method1407() {
	return true;
    }
    
    void method1424() {
	((Class110_Sub6) this).aClass111_8924.method1428('\001');
	((Class110_Sub6) this).aClass173_Sub2_1397.method8774(1);
	((Class110_Sub6) this).aClass173_Sub2_1397.method8775(null);
	((Class110_Sub6) this).aClass173_Sub2_1397.method8774(0);
    }
    
    void method1411(Class120 class120, int i) {
	((Class110_Sub6) this).aClass173_Sub2_1397.method8775(class120);
	((Class110_Sub6) this).aClass173_Sub2_1397.method8776(i);
    }
}
