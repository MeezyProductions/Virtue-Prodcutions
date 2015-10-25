/* Class120_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class120_Sub2 extends Class120
{
    int anInt8771;
    int anInt8772;
    int anInt8773;
    
    Class120_Sub2(Class173_Sub2 class173_sub2, Class149 class149,
		  Class169 class169, int i, int i_0_, int i_1_, byte[] is,
		  Class149 class149_2_) {
	super(class173_sub2, 32879, class149, class169, i * i_0_ * i_1_,
	      false);
	((Class120_Sub2) this).anInt8772 = i;
	((Class120_Sub2) this).anInt8771 = i_0_;
	((Class120_Sub2) this).anInt8773 = i_1_;
	((Class120_Sub2) this).aClass173_Sub2_1491.method8775(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glTexImage3Dub(((Class120_Sub2) this).anInt1493, 0,
			      Class173_Sub2.method8798((((Class120_Sub2) this)
							.aClass149_1486),
						       (((Class120_Sub2) this)
							.aClass169_1495)),
			      ((Class120_Sub2) this).anInt8772,
			      ((Class120_Sub2) this).anInt8771,
			      ((Class120_Sub2) this).anInt8773, 0,
			      Class173_Sub2.method8797(class149_2_), 5121, is,
			      0);
	OpenGL.glPixelStorei(3317, 4);
	method1545(true);
    }
    
    void method8251(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_,
		    int i_8_) {
	((Class120_Sub2) this).aClass173_Sub2_1491.method8775(this);
	OpenGL.glCopyTexSubImage3D(((Class120_Sub2) this).anInt1493, 0, i,
				   i_3_, i_4_, i_7_, i_8_, i_5_, i_6_);
	OpenGL.glFlush();
    }
    
    Class120_Sub2(Class173_Sub2 class173_sub2, Class149 class149,
		  Class169 class169, int i, int i_9_, int i_10_) {
	super(class173_sub2, 32879, class149, class169, i * i_9_ * i_10_,
	      false);
	((Class120_Sub2) this).anInt8772 = i;
	((Class120_Sub2) this).anInt8771 = i_9_;
	((Class120_Sub2) this).anInt8773 = i_10_;
	((Class120_Sub2) this).aClass173_Sub2_1491.method8775(this);
	OpenGL.glTexImage3Dub
	    (((Class120_Sub2) this).anInt1493, 0,
	     Class173_Sub2.method8798(((Class120_Sub2) this).aClass149_1486,
				      ((Class120_Sub2) this).aClass169_1495),
	     ((Class120_Sub2) this).anInt8772,
	     ((Class120_Sub2) this).anInt8771,
	     ((Class120_Sub2) this).anInt8773, 0,
	     Class173_Sub2.method8797(((Class120_Sub2) this).aClass149_1486),
	     5121, null, 0);
	method1545(true);
    }
}
