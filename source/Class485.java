/* Class485 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class485 implements Interface19, Interface21, Interface53
{
    Class169 aClass169_5481;
    Class149 aClass149_5482;
    int anInt5483;
    int anInt5484;
    Class173_Sub1_Sub1 aClass173_Sub1_Sub1_5485;
    int anInt5486;
    
    public int method68() {
	return ((Class485) this).anInt5484;
    }
    
    public int method71() {
	return ((Class485) this).anInt5484;
    }
    
    public int method1() {
	return ((Class485) this).anInt5483;
    }
    
    Class485(Class173_Sub1_Sub1 class173_sub1_sub1, Class149 class149,
	     Class169 class169, int i, int i_0_, int i_1_) {
	((Class485) this).aClass149_5482 = class149;
	((Class485) this).aClass169_5481 = class169;
	((Class485) this).anInt5483 = i;
	((Class485) this).anInt5484 = i_0_;
	((Class485) this).aClass173_Sub1_Sub1_5485 = class173_sub1_sub1;
	int[] is = new int[1];
	OpenGL.glGenRenderbuffersEXT(1, is, 0);
	((Class485) this).anInt5486 = is[0];
	OpenGL.glBindRenderbufferEXT(36161, ((Class485) this).anInt5486);
	OpenGL.glRenderbufferStorageMultisampleEXT
	    (36161, i_1_,
	     Class173_Sub1_Sub1.method10357(((Class485) this).aClass149_5482,
					    ((Class485) this).aClass169_5481),
	     i, i_0_);
    }
    
    public void method66(int i) {
	OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161,
					    ((Class485) this).anInt5486);
    }
    
    void method5873() throws Throwable {
	method5874();
	super.finalize();
    }
    
    void method5874() {
	if (((Class485) this).anInt5486 != 0) {
	    ((Class485) this).aClass173_Sub1_Sub1_5485.method10359
		(((Class485) this).anInt5486,
		 (((Class485) this).anInt5483 * ((Class485) this).anInt5484
		  * (((Class485) this).aClass169_5481.anInt1942 * -1009481111)
		  * (((Class485) this).aClass149_5482.anInt1686 * 427009899)));
	    ((Class485) this).anInt5486 = 0;
	}
    }
    
    void method5875() {
	if (((Class485) this).anInt5486 != 0) {
	    ((Class485) this).aClass173_Sub1_Sub1_5485.method10359
		(((Class485) this).anInt5486,
		 (((Class485) this).anInt5483 * ((Class485) this).anInt5484
		  * (((Class485) this).aClass169_5481.anInt1942 * -1009481111)
		  * (((Class485) this).aClass149_5482.anInt1686 * 427009899)));
	    ((Class485) this).anInt5486 = 0;
	}
    }
    
    public int method40() {
	return ((Class485) this).anInt5483;
    }
    
    public int method5() {
	return ((Class485) this).anInt5483;
    }
    
    public int method6() {
	return ((Class485) this).anInt5483;
    }
    
    public int method72() {
	return ((Class485) this).anInt5484;
    }
    
    public void finalize() throws Throwable {
	method5874();
	super.finalize();
    }
    
    Class485(Class173_Sub1_Sub1 class173_sub1_sub1, Class149 class149,
	     Class169 class169, int i, int i_2_) {
	((Class485) this).aClass149_5482 = class149;
	((Class485) this).aClass169_5481 = class169;
	((Class485) this).anInt5483 = i;
	((Class485) this).anInt5484 = i_2_;
	((Class485) this).aClass173_Sub1_Sub1_5485 = class173_sub1_sub1;
	int[] is = new int[1];
	OpenGL.glGenRenderbuffersEXT(1, is, 0);
	((Class485) this).anInt5486 = is[0];
	OpenGL.glBindRenderbufferEXT(36161, ((Class485) this).anInt5486);
	OpenGL.glRenderbufferStorageEXT
	    (36161,
	     Class173_Sub1_Sub1.method10357(((Class485) this).aClass149_5482,
					    ((Class485) this).aClass169_5481),
	     i, i_2_);
    }
    
    public void method116() {
	if (((Class485) this).anInt5486 != 0) {
	    int[] is = new int[1];
	    is[0] = ((Class485) this).anInt5486;
	    OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
	    ((Class485) this).anInt5486 = 0;
	}
    }
    
    void method5876() throws Throwable {
	method5874();
	super.finalize();
    }
    
    public void method115() {
	if (((Class485) this).anInt5486 != 0) {
	    int[] is = new int[1];
	    is[0] = ((Class485) this).anInt5486;
	    OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
	    ((Class485) this).anInt5486 = 0;
	}
    }
    
    void method5877() throws Throwable {
	method5874();
	super.finalize();
    }
    
    void method5878() throws Throwable {
	method5874();
	super.finalize();
    }
    
    public void method67(int i) {
	OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161,
					    ((Class485) this).anInt5486);
    }
    
    public int method73() {
	return ((Class485) this).anInt5484;
    }
    
    void method5879() {
	if (((Class485) this).anInt5486 != 0) {
	    ((Class485) this).aClass173_Sub1_Sub1_5485.method10359
		(((Class485) this).anInt5486,
		 (((Class485) this).anInt5483 * ((Class485) this).anInt5484
		  * (((Class485) this).aClass169_5481.anInt1942 * -1009481111)
		  * (((Class485) this).aClass149_5482.anInt1686 * 427009899)));
	    ((Class485) this).anInt5486 = 0;
	}
    }
    
    void method5880() {
	if (((Class485) this).anInt5486 != 0) {
	    ((Class485) this).aClass173_Sub1_Sub1_5485.method10359
		(((Class485) this).anInt5486,
		 (((Class485) this).anInt5483 * ((Class485) this).anInt5484
		  * (((Class485) this).aClass169_5481.anInt1942 * -1009481111)
		  * (((Class485) this).aClass149_5482.anInt1686 * 427009899)));
	    ((Class485) this).anInt5486 = 0;
	}
    }
    
    public void method346(int i) {
	OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161,
					    ((Class485) this).anInt5486);
    }
}
