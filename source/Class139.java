/* Class139 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class139 implements Interface13
{
    int anInt1633;
    Class120_Sub4 aClass120_Sub4_1634;
    
    public int method1() {
	return (((Class120_Sub4) ((Class139) this).aClass120_Sub4_1634)
		.anInt8777);
    }
    
    Class139(Class120_Sub4 class120_sub4, int i) {
	((Class139) this).anInt1633 = i;
	((Class139) this).aClass120_Sub4_1634 = class120_sub4;
    }
    
    public int method73() {
	return (((Class120_Sub4) ((Class139) this).aClass120_Sub4_1634)
		.anInt8776);
    }
    
    public void method115() {
	/* empty */
    }
    
    public int method68() {
	return (((Class120_Sub4) ((Class139) this).aClass120_Sub4_1634)
		.anInt8776);
    }
    
    public int method40() {
	return (((Class120_Sub4) ((Class139) this).aClass120_Sub4_1634)
		.anInt8777);
    }
    
    public int method5() {
	return (((Class120_Sub4) ((Class139) this).aClass120_Sub4_1634)
		.anInt8777);
    }
    
    public int method6() {
	return (((Class120_Sub4) ((Class139) this).aClass120_Sub4_1634)
		.anInt8777);
    }
    
    public int method72() {
	return (((Class120_Sub4) ((Class139) this).aClass120_Sub4_1634)
		.anInt8776);
    }
    
    public int method71() {
	return (((Class120_Sub4) ((Class139) this).aClass120_Sub4_1634)
		.anInt8776);
    }
    
    public void method66(int i) {
	OpenGL.glFramebufferTexture2DEXT
	    (36160, i,
	     ((Class120_Sub4) ((Class139) this).aClass120_Sub4_1634).anInt1493,
	     ((Class120_Sub4) ((Class139) this).aClass120_Sub4_1634).anInt1485,
	     ((Class139) this).anInt1633);
    }
    
    public void method116() {
	/* empty */
    }
    
    public void method67(int i) {
	OpenGL.glFramebufferTexture2DEXT
	    (36160, i,
	     ((Class120_Sub4) ((Class139) this).aClass120_Sub4_1634).anInt1493,
	     ((Class120_Sub4) ((Class139) this).aClass120_Sub4_1634).anInt1485,
	     ((Class139) this).anInt1633);
    }
}
