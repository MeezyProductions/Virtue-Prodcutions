/* Class168_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class168_Sub1_Sub1 extends Class168_Sub1
{
    static int[] anIntArray11238;
    Class120_Sub1 aClass120_Sub1_11239;
    Class173_Sub2 aClass173_Sub2_11240;
    static int[] anIntArray11241 = new int[4];
    
    int method10337() {
	return (((Class120_Sub1)
		 ((Class168_Sub1_Sub1) this).aClass120_Sub1_11239)
		.anInt8770);
    }
    
    int method10338() {
	return (((Class120_Sub1)
		 ((Class168_Sub1_Sub1) this).aClass120_Sub1_11239)
		.anInt8770);
    }
    
    Class168_Sub1_Sub1(Class173_Sub2 class173_sub2, int i) {
	((Class168_Sub1_Sub1) this).aClass173_Sub2_11240 = class173_sub2;
	((Class168_Sub1_Sub1) this).aClass120_Sub1_11239
	    = new Class120_Sub1(class173_sub2, Class149.aClass149_1676,
				Class169.aClass169_1935, i);
    }
    
    static {
	anIntArray11238 = new int[4];
    }
    
    Class120_Sub1 method8387() {
	return ((Class168_Sub1_Sub1) this).aClass120_Sub1_11239;
    }
    
    Class120_Sub1 method8388() {
	return ((Class168_Sub1_Sub1) this).aClass120_Sub1_11239;
    }
    
    boolean method10339(Class120_Sub1 class120_sub1,
			Class120_Sub1 class120_sub1_0_, float f) {
	boolean bool = true;
	Class163_Sub1_Sub1 class163_sub1_sub1
	    = (((Class173_Sub2)
		((Class168_Sub1_Sub1) this).aClass173_Sub2_11240)
	       .aClass163_Sub1_Sub1_9591);
	((Class168_Sub1_Sub1) this).aClass173_Sub2_11240
	    .method2207(anIntArray11241);
	((Class168_Sub1_Sub1) this).aClass173_Sub2_11240.method2203();
	((Class168_Sub1_Sub1) this).aClass173_Sub2_11240
	    .method2345(anIntArray11238);
	((Class168_Sub1_Sub1) this).aClass173_Sub2_11240.method8837();
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glViewport(0, 0,
			  ((Class120_Sub1) (((Class168_Sub1_Sub1) this)
					    .aClass120_Sub1_11239)).anInt8770,
			  ((Class120_Sub1) (((Class168_Sub1_Sub1) this)
					    .aClass120_Sub1_11239)).anInt8770);
	((Class168_Sub1_Sub1) this).aClass173_Sub2_11240.method8783(false);
	((Class168_Sub1_Sub1) this).aClass173_Sub2_11240.method8784(false);
	((Class168_Sub1_Sub1) this).aClass173_Sub2_11240.method8786(false);
	((Class168_Sub1_Sub1) this).aClass173_Sub2_11240.method8787(false);
	((Class168_Sub1_Sub1) this).aClass173_Sub2_11240.method8840(-2);
	((Class168_Sub1_Sub1) this).aClass173_Sub2_11240.method8774(1);
	((Class168_Sub1_Sub1) this).aClass173_Sub2_11240.method8780(0.0F, 0.0F,
								    0.0F, f);
	((Class168_Sub1_Sub1) this).aClass173_Sub2_11240.method8754(34165,
								    34165);
	((Class168_Sub1_Sub1) this).aClass173_Sub2_11240
	    .method8775(class120_sub1_0_);
	((Class168_Sub1_Sub1) this).aClass173_Sub2_11240.method8774(0);
	((Class168_Sub1_Sub1) this).aClass173_Sub2_11240.method8776(1);
	((Class168_Sub1_Sub1) this).aClass173_Sub2_11240
	    .method8775(class120_sub1);
	((Class168_Sub1_Sub1) this).aClass173_Sub2_11240
	    .method2179(class163_sub1_sub1, -798137893);
	for (int i = 0; i < 6; i++) {
	    int i_1_ = 34069 + i;
	    class163_sub1_sub1.method8898(0, ((Class168_Sub1_Sub1) this)
						 .aClass120_Sub1_11239
						 .method8250(i_1_, 0));
	    class163_sub1_sub1.method10327(0);
	    if (class163_sub1_sub1.method8897()) {
		OpenGL.glBegin(7);
		switch (i_1_) {
		case 34073:
		    OpenGL.glTexCoord3i(-65534, 65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, -65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34069:
		    OpenGL.glTexCoord3i(65535, 65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65535, 65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65535, -65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(65535, -65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34070:
		    OpenGL.glTexCoord3i(-65535, 65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65535, 65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65535, -65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65535, -65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34071:
		    OpenGL.glTexCoord3i(-65534, 65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, 65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34074:
		    OpenGL.glTexCoord3i(65534, 65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65534, 65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65534, -65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(65534, -65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34072:
		    OpenGL.glTexCoord3i(-65534, -65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, -65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		}
		OpenGL.glEnd();
	    } else {
		bool = false;
		break;
	    }
	}
	class163_sub1_sub1.method8898(0, null);
	((Class168_Sub1_Sub1) this).aClass173_Sub2_11240
	    .method2180(class163_sub1_sub1, -159065977);
	((Class168_Sub1_Sub1) this).aClass173_Sub2_11240.method8774(1);
	((Class168_Sub1_Sub1) this).aClass173_Sub2_11240.method8775(null);
	((Class168_Sub1_Sub1) this).aClass173_Sub2_11240.method8754(8448,
								    8448);
	((Class168_Sub1_Sub1) this).aClass173_Sub2_11240.method8774(0);
	((Class168_Sub1_Sub1) this).aClass173_Sub2_11240.method8775(null);
	((Class168_Sub1_Sub1) this).aClass173_Sub2_11240.method2204
	    (anIntArray11241[0], anIntArray11241[1], anIntArray11241[2],
	     anIntArray11241[3]);
	((Class168_Sub1_Sub1) this).aClass173_Sub2_11240.method2275
	    (anIntArray11238[0], anIntArray11238[1], anIntArray11238[2],
	     anIntArray11238[3]);
	if (bool && !((Class173_Sub2) (((Class168_Sub1_Sub1) this)
				       .aClass173_Sub2_11240)).aBool9559)
	    ((Class168_Sub1_Sub1) this).aClass120_Sub1_11239.method1547();
	return bool;
    }
    
    int method10340() {
	return (((Class120_Sub1)
		 ((Class168_Sub1_Sub1) this).aClass120_Sub1_11239)
		.anInt8770);
    }
    
    int method10341() {
	return (((Class120_Sub1)
		 ((Class168_Sub1_Sub1) this).aClass120_Sub1_11239)
		.anInt8770);
    }
    
    Class120_Sub1 method8386() {
	return ((Class168_Sub1_Sub1) this).aClass120_Sub1_11239;
    }
    
    int method10342() {
	return (((Class120_Sub1)
		 ((Class168_Sub1_Sub1) this).aClass120_Sub1_11239)
		.anInt8770);
    }
}
