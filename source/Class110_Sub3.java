/* Class110_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class110_Sub3 extends Class110
{
    Class111 aClass111_8888;
    static final char aChar8889 = '\001';
    Class115 aClass115_8890;
    static final char aChar8891 = '\0';
    Class120_Sub3 aClass120_Sub3_8892;
    static float[] aFloatArray8893 = { 0.0F, 0.0F, 0.0F, 0.0F };
    
    boolean method1407() {
	return true;
    }
    
    boolean method1415() {
	return true;
    }
    
    void method1420() {
	((Class110_Sub3) this).aClass111_8888.method1428('\001');
	if ((((Class173_Sub2) ((Class110_Sub3) this).aClass173_Sub2_1397)
	     .anInt9435)
	    > 0) {
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8774(1);
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8775(null);
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8756(1.0F, 0.0F);
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8774(0);
	}
	((Class110_Sub3) this).aClass173_Sub2_1397.method8754(8448, 8448);
	OpenGL.glMatrixMode(5890);
	OpenGL.glPopMatrix();
	OpenGL.glMatrixMode(5888);
    }
    
    void method1405(boolean bool) {
	((Class110_Sub3) this).aClass173_Sub2_1397.method8754(260, 8448);
    }
    
    void method1419(boolean bool) {
	if ((((Class173_Sub2) ((Class110_Sub3) this).aClass173_Sub2_1397)
	     .anInt9435)
	    > 0) {
	    float f = -0.5F / (float) (((Class173_Sub2) (((Class110_Sub3) this)
							 .aClass173_Sub2_1397))
				       .anInt9435);
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8774(1);
	    aFloatArray8893[0] = 0.0F;
	    aFloatArray8893[1] = 0.0F;
	    aFloatArray8893[2] = f;
	    aFloatArray8893[3]
		= (((Class173_Sub2) ((Class110_Sub3) this).aClass173_Sub2_1397)
		   .aFloat9529) * f + 0.25F;
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glTexGenfv(8192, 9474, aFloatArray8893, 0);
	    OpenGL.glPopMatrix();
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8756
		(0.5F,
		 (float) ((Class173_Sub2) (((Class110_Sub3) this)
					   .aClass173_Sub2_1397)).anInt9435);
	    ((Class110_Sub3) this).aClass173_Sub2_1397
		.method8775(((Class110_Sub3) this).aClass120_Sub3_8892);
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8774(0);
	}
	((Class110_Sub3) this).aClass111_8888.method1428('\0');
	OpenGL.glMatrixMode(5890);
	OpenGL.glPushMatrix();
	OpenGL.glScalef(0.25F, 0.25F, 1.0F);
	OpenGL.glMatrixMode(5888);
    }
    
    void method1410(int i, int i_0_) {
	if ((i & 0x1) == 1) {
	    if (((Class115) ((Class110_Sub3) this).aClass115_8890).aBool1421) {
		((Class110_Sub3) this).aClass173_Sub2_1397.method8775
		    (((Class115) ((Class110_Sub3) this).aClass115_8890)
		     .aClass120_Sub2_1417);
		aFloatArray8893[0] = 0.0F;
		aFloatArray8893[1] = 0.0F;
		aFloatArray8893[2] = 0.0F;
		aFloatArray8893[3]
		    = (float) ((((Class173_Sub2)
				 ((Class110_Sub3) this).aClass173_Sub2_1397)
				.anInt9474)
			       % 4000) / 4000.0F;
		OpenGL.glTexGenfv(8194, 9473, aFloatArray8893, 0);
	    } else {
		int i_1_ = (((Class173_Sub2) (((Class110_Sub3) this)
					      .aClass173_Sub2_1397)).anInt9474
			    % 4000 * 16 / 4000);
		((Class110_Sub3) this).aClass173_Sub2_1397.method8775
		    (((Class115) ((Class110_Sub3) this).aClass115_8890)
		     .aClass120_Sub4Array1413[i_1_]);
	    }
	} else if (((Class115) ((Class110_Sub3) this).aClass115_8890)
		   .aBool1421) {
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8775
		(((Class115) ((Class110_Sub3) this).aClass115_8890)
		 .aClass120_Sub2_1417);
	    aFloatArray8893[0] = 0.0F;
	    aFloatArray8893[1] = 0.0F;
	    aFloatArray8893[2] = 0.0F;
	    aFloatArray8893[3] = 0.0F;
	    OpenGL.glTexGenfv(8194, 9473, aFloatArray8893, 0);
	} else
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8775
		(((Class115) ((Class110_Sub3) this).aClass115_8890)
		 .aClass120_Sub4Array1413[0]);
    }
    
    void method1414(Class120 class120, int i) {
	/* empty */
    }
    
    Class110_Sub3(Class173_Sub2 class173_sub2, Class115 class115) {
	super(class173_sub2);
	((Class110_Sub3) this).aClass115_8890 = class115;
	method8322();
	((Class110_Sub3) this).aClass120_Sub3_8892
	    = new Class120_Sub3(((Class110_Sub3) this).aClass173_Sub2_1397,
				Class149.aClass149_1677,
				Class169.aClass169_1935, 2,
				new byte[] { 0, -1 }, Class149.aClass149_1677);
	((Class110_Sub3) this).aClass120_Sub3_8892.method8252(false);
    }
    
    void method1411(Class120 class120, int i) {
	/* empty */
    }
    
    boolean method1412() {
	return true;
    }
    
    boolean method1413() {
	return true;
    }
    
    boolean method1417() {
	return true;
    }
    
    void method1408(boolean bool) {
	if ((((Class173_Sub2) ((Class110_Sub3) this).aClass173_Sub2_1397)
	     .anInt9435)
	    > 0) {
	    float f = -0.5F / (float) (((Class173_Sub2) (((Class110_Sub3) this)
							 .aClass173_Sub2_1397))
				       .anInt9435);
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8774(1);
	    aFloatArray8893[0] = 0.0F;
	    aFloatArray8893[1] = 0.0F;
	    aFloatArray8893[2] = f;
	    aFloatArray8893[3]
		= (((Class173_Sub2) ((Class110_Sub3) this).aClass173_Sub2_1397)
		   .aFloat9529) * f + 0.25F;
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glTexGenfv(8192, 9474, aFloatArray8893, 0);
	    OpenGL.glPopMatrix();
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8756
		(0.5F,
		 (float) ((Class173_Sub2) (((Class110_Sub3) this)
					   .aClass173_Sub2_1397)).anInt9435);
	    ((Class110_Sub3) this).aClass173_Sub2_1397
		.method8775(((Class110_Sub3) this).aClass120_Sub3_8892);
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8774(0);
	}
	((Class110_Sub3) this).aClass111_8888.method1428('\0');
	OpenGL.glMatrixMode(5890);
	OpenGL.glPushMatrix();
	OpenGL.glScalef(0.25F, 0.25F, 1.0F);
	OpenGL.glMatrixMode(5888);
    }
    
    void method1416(boolean bool) {
	if ((((Class173_Sub2) ((Class110_Sub3) this).aClass173_Sub2_1397)
	     .anInt9435)
	    > 0) {
	    float f = -0.5F / (float) (((Class173_Sub2) (((Class110_Sub3) this)
							 .aClass173_Sub2_1397))
				       .anInt9435);
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8774(1);
	    aFloatArray8893[0] = 0.0F;
	    aFloatArray8893[1] = 0.0F;
	    aFloatArray8893[2] = f;
	    aFloatArray8893[3]
		= (((Class173_Sub2) ((Class110_Sub3) this).aClass173_Sub2_1397)
		   .aFloat9529) * f + 0.25F;
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glTexGenfv(8192, 9474, aFloatArray8893, 0);
	    OpenGL.glPopMatrix();
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8756
		(0.5F,
		 (float) ((Class173_Sub2) (((Class110_Sub3) this)
					   .aClass173_Sub2_1397)).anInt9435);
	    ((Class110_Sub3) this).aClass173_Sub2_1397
		.method8775(((Class110_Sub3) this).aClass120_Sub3_8892);
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8774(0);
	}
	((Class110_Sub3) this).aClass111_8888.method1428('\0');
	OpenGL.glMatrixMode(5890);
	OpenGL.glPushMatrix();
	OpenGL.glScalef(0.25F, 0.25F, 1.0F);
	OpenGL.glMatrixMode(5888);
    }
    
    void method8322() {
	((Class110_Sub3) this).aClass111_8888
	    = new Class111(((Class110_Sub3) this).aClass173_Sub2_1397, 2);
	((Class110_Sub3) this).aClass111_8888.method1426(0);
	((Class110_Sub3) this).aClass173_Sub2_1397.method8774(1);
	((Class110_Sub3) this).aClass173_Sub2_1397.method8754(7681, 260);
	((Class110_Sub3) this).aClass173_Sub2_1397.method8778(0, 34168, 768);
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glEnable(3168);
	((Class110_Sub3) this).aClass173_Sub2_1397.method8774(0);
	OpenGL.glTexEnvf(8960, 34163, 2.0F);
	if (((Class115) ((Class110_Sub3) this).aClass115_8890).aBool1421) {
	    OpenGL.glTexGeni(8194, 9472, 9217);
	    OpenGL.glTexGeni(8195, 9472, 9217);
	    OpenGL.glTexGenfv(8195, 9473,
			      new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
	    OpenGL.glEnable(3170);
	    OpenGL.glEnable(3171);
	}
	((Class110_Sub3) this).aClass111_8888.method1425();
	((Class110_Sub3) this).aClass111_8888.method1426(1);
	((Class110_Sub3) this).aClass173_Sub2_1397.method8774(1);
	((Class110_Sub3) this).aClass173_Sub2_1397.method8754(8448, 8448);
	((Class110_Sub3) this).aClass173_Sub2_1397.method8778(0, 5890, 768);
	OpenGL.glDisable(3168);
	((Class110_Sub3) this).aClass173_Sub2_1397.method8774(0);
	OpenGL.glTexEnvf(8960, 34163, 1.0F);
	if (((Class115) ((Class110_Sub3) this).aClass115_8890).aBool1421) {
	    OpenGL.glDisable(3170);
	    OpenGL.glDisable(3171);
	}
	((Class110_Sub3) this).aClass111_8888.method1425();
    }
    
    void method1418(boolean bool) {
	if ((((Class173_Sub2) ((Class110_Sub3) this).aClass173_Sub2_1397)
	     .anInt9435)
	    > 0) {
	    float f = -0.5F / (float) (((Class173_Sub2) (((Class110_Sub3) this)
							 .aClass173_Sub2_1397))
				       .anInt9435);
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8774(1);
	    aFloatArray8893[0] = 0.0F;
	    aFloatArray8893[1] = 0.0F;
	    aFloatArray8893[2] = f;
	    aFloatArray8893[3]
		= (((Class173_Sub2) ((Class110_Sub3) this).aClass173_Sub2_1397)
		   .aFloat9529) * f + 0.25F;
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glTexGenfv(8192, 9474, aFloatArray8893, 0);
	    OpenGL.glPopMatrix();
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8756
		(0.5F,
		 (float) ((Class173_Sub2) (((Class110_Sub3) this)
					   .aClass173_Sub2_1397)).anInt9435);
	    ((Class110_Sub3) this).aClass173_Sub2_1397
		.method8775(((Class110_Sub3) this).aClass120_Sub3_8892);
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8774(0);
	}
	((Class110_Sub3) this).aClass111_8888.method1428('\0');
	OpenGL.glMatrixMode(5890);
	OpenGL.glPushMatrix();
	OpenGL.glScalef(0.25F, 0.25F, 1.0F);
	OpenGL.glMatrixMode(5888);
    }
    
    void method1406(boolean bool) {
	((Class110_Sub3) this).aClass173_Sub2_1397.method8754(260, 8448);
    }
    
    void method1424() {
	((Class110_Sub3) this).aClass111_8888.method1428('\001');
	if ((((Class173_Sub2) ((Class110_Sub3) this).aClass173_Sub2_1397)
	     .anInt9435)
	    > 0) {
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8774(1);
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8775(null);
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8756(1.0F, 0.0F);
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8774(0);
	}
	((Class110_Sub3) this).aClass173_Sub2_1397.method8754(8448, 8448);
	OpenGL.glMatrixMode(5890);
	OpenGL.glPopMatrix();
	OpenGL.glMatrixMode(5888);
    }
    
    void method1421(int i, int i_2_) {
	if ((i & 0x1) == 1) {
	    if (((Class115) ((Class110_Sub3) this).aClass115_8890).aBool1421) {
		((Class110_Sub3) this).aClass173_Sub2_1397.method8775
		    (((Class115) ((Class110_Sub3) this).aClass115_8890)
		     .aClass120_Sub2_1417);
		aFloatArray8893[0] = 0.0F;
		aFloatArray8893[1] = 0.0F;
		aFloatArray8893[2] = 0.0F;
		aFloatArray8893[3]
		    = (float) ((((Class173_Sub2)
				 ((Class110_Sub3) this).aClass173_Sub2_1397)
				.anInt9474)
			       % 4000) / 4000.0F;
		OpenGL.glTexGenfv(8194, 9473, aFloatArray8893, 0);
	    } else {
		int i_3_ = (((Class173_Sub2) (((Class110_Sub3) this)
					      .aClass173_Sub2_1397)).anInt9474
			    % 4000 * 16 / 4000);
		((Class110_Sub3) this).aClass173_Sub2_1397.method8775
		    (((Class115) ((Class110_Sub3) this).aClass115_8890)
		     .aClass120_Sub4Array1413[i_3_]);
	    }
	} else if (((Class115) ((Class110_Sub3) this).aClass115_8890)
		   .aBool1421) {
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8775
		(((Class115) ((Class110_Sub3) this).aClass115_8890)
		 .aClass120_Sub2_1417);
	    aFloatArray8893[0] = 0.0F;
	    aFloatArray8893[1] = 0.0F;
	    aFloatArray8893[2] = 0.0F;
	    aFloatArray8893[3] = 0.0F;
	    OpenGL.glTexGenfv(8194, 9473, aFloatArray8893, 0);
	} else
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8775
		(((Class115) ((Class110_Sub3) this).aClass115_8890)
		 .aClass120_Sub4Array1413[0]);
    }
    
    void method1422(int i, int i_4_) {
	if ((i & 0x1) == 1) {
	    if (((Class115) ((Class110_Sub3) this).aClass115_8890).aBool1421) {
		((Class110_Sub3) this).aClass173_Sub2_1397.method8775
		    (((Class115) ((Class110_Sub3) this).aClass115_8890)
		     .aClass120_Sub2_1417);
		aFloatArray8893[0] = 0.0F;
		aFloatArray8893[1] = 0.0F;
		aFloatArray8893[2] = 0.0F;
		aFloatArray8893[3]
		    = (float) ((((Class173_Sub2)
				 ((Class110_Sub3) this).aClass173_Sub2_1397)
				.anInt9474)
			       % 4000) / 4000.0F;
		OpenGL.glTexGenfv(8194, 9473, aFloatArray8893, 0);
	    } else {
		int i_5_ = (((Class173_Sub2) (((Class110_Sub3) this)
					      .aClass173_Sub2_1397)).anInt9474
			    % 4000 * 16 / 4000);
		((Class110_Sub3) this).aClass173_Sub2_1397.method8775
		    (((Class115) ((Class110_Sub3) this).aClass115_8890)
		     .aClass120_Sub4Array1413[i_5_]);
	    }
	} else if (((Class115) ((Class110_Sub3) this).aClass115_8890)
		   .aBool1421) {
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8775
		(((Class115) ((Class110_Sub3) this).aClass115_8890)
		 .aClass120_Sub2_1417);
	    aFloatArray8893[0] = 0.0F;
	    aFloatArray8893[1] = 0.0F;
	    aFloatArray8893[2] = 0.0F;
	    aFloatArray8893[3] = 0.0F;
	    OpenGL.glTexGenfv(8194, 9473, aFloatArray8893, 0);
	} else
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8775
		(((Class115) ((Class110_Sub3) this).aClass115_8890)
		 .aClass120_Sub4Array1413[0]);
    }
    
    void method1423(Class120 class120, int i) {
	/* empty */
    }
    
    void method1409() {
	((Class110_Sub3) this).aClass111_8888.method1428('\001');
	if ((((Class173_Sub2) ((Class110_Sub3) this).aClass173_Sub2_1397)
	     .anInt9435)
	    > 0) {
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8774(1);
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8775(null);
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8756(1.0F, 0.0F);
	    ((Class110_Sub3) this).aClass173_Sub2_1397.method8774(0);
	}
	((Class110_Sub3) this).aClass173_Sub2_1397.method8754(8448, 8448);
	OpenGL.glMatrixMode(5890);
	OpenGL.glPopMatrix();
	OpenGL.glMatrixMode(5888);
    }
}
