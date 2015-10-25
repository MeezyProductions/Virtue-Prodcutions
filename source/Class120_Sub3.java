/* Class120_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class120_Sub3 extends Class120
{
    int anInt8774;
    
    void method8252(boolean bool) {
	((Class120_Sub3) this).aClass173_Sub2_1491.method8775(this);
	OpenGL.glTexParameteri(((Class120_Sub3) this).anInt1493, 10242,
			       bool ? 10497 : 33071);
    }
    
    Class120_Sub3(Class173_Sub2 class173_sub2, Class149 class149,
		  Class169 class169, int i, byte[] is, Class149 class149_0_) {
	super(class173_sub2, 3552, class149, class169, i, false);
	((Class120_Sub3) this).anInt8774 = i;
	((Class120_Sub3) this).aClass173_Sub2_1491.method8775(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glTexImage1Dub(((Class120_Sub3) this).anInt1493, 0,
			      Class173_Sub2.method8798((((Class120_Sub3) this)
							.aClass149_1486),
						       (((Class120_Sub3) this)
							.aClass169_1495)),
			      ((Class120_Sub3) this).anInt8774, 0,
			      Class173_Sub2.method8797(class149_0_), 5121, is,
			      0);
	OpenGL.glPixelStorei(3317, 4);
	method1545(true);
    }
}
