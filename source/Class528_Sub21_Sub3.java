/* Class528_Sub21_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class528_Sub21_Sub3 extends Class528_Sub21 implements Interface13
{
    int anInt11205;
    int anInt11206;
    int anInt11207;
    int anInt11208;
    Class169 aClass169_11209;
    Class149 aClass149_11210;
    Class173_Sub2 aClass173_Sub2_11211;
    static int[] anIntArray11212 = new int[1];
    
    Class528_Sub21_Sub3(Class173_Sub2 class173_sub2, Class149 class149,
			Class169 class169, int i, int i_0_, int i_1_) {
	((Class528_Sub21_Sub3) this).aClass173_Sub2_11211 = class173_sub2;
	((Class528_Sub21_Sub3) this).anInt11207 = i;
	((Class528_Sub21_Sub3) this).anInt11208 = i_0_;
	((Class528_Sub21_Sub3) this).aClass149_11210 = class149;
	((Class528_Sub21_Sub3) this).aClass169_11209 = class169;
	OpenGL.glGenRenderbuffersEXT(1, anIntArray11212, 0);
	((Class528_Sub21_Sub3) this).anInt11206 = anIntArray11212[0];
	OpenGL.glBindRenderbufferEXT(36161,
				     ((Class528_Sub21_Sub3) this).anInt11206);
	OpenGL.glRenderbufferStorageMultisampleEXT
	    (36161, i_1_,
	     Class173_Sub2.method8798((((Class528_Sub21_Sub3) this)
				       .aClass149_11210),
				      (((Class528_Sub21_Sub3) this)
				       .aClass169_11209)),
	     ((Class528_Sub21_Sub3) this).anInt11207,
	     ((Class528_Sub21_Sub3) this).anInt11208);
	((Class528_Sub21_Sub3) this).anInt11205
	    = (((Class528_Sub21_Sub3) this).anInt11207
	       * ((Class528_Sub21_Sub3) this).anInt11208
	       * (((Class528_Sub21_Sub3) this).aClass149_11210.anInt1686
		  * 427009899)
	       * (((Class528_Sub21_Sub3) this).aClass169_11209.anInt1942
		  * -1009481111));
    }
    
    public int method1() {
	return ((Class528_Sub21_Sub3) this).anInt11207;
    }
    
    public void method66(int i) {
	OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161,
					    (((Class528_Sub21_Sub3) this)
					     .anInt11206));
    }
    
    public int method5() {
	return ((Class528_Sub21_Sub3) this).anInt11207;
    }
    
    public void method115() {
	if (((Class528_Sub21_Sub3) this).anInt11206 != 0) {
	    int[] is = new int[1];
	    is[0] = ((Class528_Sub21_Sub3) this).anInt11206;
	    OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
	    ((Class528_Sub21_Sub3) this).anInt11206 = 0;
	}
    }
    
    void method10308() throws Throwable {
	method10312();
	super.finalize();
    }
    
    public void finalize() throws Throwable {
	method10312();
	super.finalize();
    }
    
    public int method6() {
	return ((Class528_Sub21_Sub3) this).anInt11207;
    }
    
    public int method40() {
	return ((Class528_Sub21_Sub3) this).anInt11207;
    }
    
    public int method68() {
	return ((Class528_Sub21_Sub3) this).anInt11208;
    }
    
    public int method73() {
	return ((Class528_Sub21_Sub3) this).anInt11208;
    }
    
    public int method72() {
	return ((Class528_Sub21_Sub3) this).anInt11208;
    }
    
    public int method71() {
	return ((Class528_Sub21_Sub3) this).anInt11208;
    }
    
    void method10309() throws Throwable {
	method10312();
	super.finalize();
    }
    
    public void method116() {
	if (((Class528_Sub21_Sub3) this).anInt11206 != 0) {
	    int[] is = new int[1];
	    is[0] = ((Class528_Sub21_Sub3) this).anInt11206;
	    OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
	    ((Class528_Sub21_Sub3) this).anInt11206 = 0;
	}
    }
    
    Class528_Sub21_Sub3(Class173_Sub2 class173_sub2, Class149 class149,
			Class169 class169, int i, int i_2_) {
	((Class528_Sub21_Sub3) this).aClass173_Sub2_11211 = class173_sub2;
	((Class528_Sub21_Sub3) this).anInt11207 = i;
	((Class528_Sub21_Sub3) this).anInt11208 = i_2_;
	((Class528_Sub21_Sub3) this).aClass149_11210 = class149;
	((Class528_Sub21_Sub3) this).aClass169_11209 = class169;
	OpenGL.glGenRenderbuffersEXT(1, anIntArray11212, 0);
	((Class528_Sub21_Sub3) this).anInt11206 = anIntArray11212[0];
	OpenGL.glBindRenderbufferEXT(36161,
				     ((Class528_Sub21_Sub3) this).anInt11206);
	OpenGL.glRenderbufferStorageEXT
	    (36161,
	     Class173_Sub2.method8798((((Class528_Sub21_Sub3) this)
				       .aClass149_11210),
				      (((Class528_Sub21_Sub3) this)
				       .aClass169_11209)),
	     ((Class528_Sub21_Sub3) this).anInt11207,
	     ((Class528_Sub21_Sub3) this).anInt11208);
	((Class528_Sub21_Sub3) this).anInt11205
	    = (((Class528_Sub21_Sub3) this).anInt11207
	       * ((Class528_Sub21_Sub3) this).anInt11208
	       * (((Class528_Sub21_Sub3) this).aClass149_11210.anInt1686
		  * 427009899)
	       * (((Class528_Sub21_Sub3) this).aClass169_11209.anInt1942
		  * -1009481111));
    }
    
    void method10310() throws Throwable {
	method10312();
	super.finalize();
    }
    
    void method10311() throws Throwable {
	method10312();
	super.finalize();
    }
    
    public void method67(int i) {
	OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161,
					    (((Class528_Sub21_Sub3) this)
					     .anInt11206));
    }
    
    void method10312() {
	if (((Class528_Sub21_Sub3) this).anInt11206 != 0) {
	    ((Class528_Sub21_Sub3) this).aClass173_Sub2_11211.method8795
		(((Class528_Sub21_Sub3) this).anInt11206,
		 ((Class528_Sub21_Sub3) this).anInt11205);
	    ((Class528_Sub21_Sub3) this).anInt11206 = 0;
	}
    }
    
    void method10313() {
	if (((Class528_Sub21_Sub3) this).anInt11206 != 0) {
	    ((Class528_Sub21_Sub3) this).aClass173_Sub2_11211.method8795
		(((Class528_Sub21_Sub3) this).anInt11206,
		 ((Class528_Sub21_Sub3) this).anInt11205);
	    ((Class528_Sub21_Sub3) this).anInt11206 = 0;
	}
    }
    
    void method10314() {
	if (((Class528_Sub21_Sub3) this).anInt11206 != 0) {
	    ((Class528_Sub21_Sub3) this).aClass173_Sub2_11211.method8795
		(((Class528_Sub21_Sub3) this).anInt11206,
		 ((Class528_Sub21_Sub3) this).anInt11205);
	    ((Class528_Sub21_Sub3) this).anInt11206 = 0;
	}
    }
    
    void method10315() {
	if (((Class528_Sub21_Sub3) this).anInt11206 != 0) {
	    ((Class528_Sub21_Sub3) this).aClass173_Sub2_11211.method8795
		(((Class528_Sub21_Sub3) this).anInt11206,
		 ((Class528_Sub21_Sub3) this).anInt11205);
	    ((Class528_Sub21_Sub3) this).anInt11206 = 0;
	}
    }
    
    void method10316() {
	if (((Class528_Sub21_Sub3) this).anInt11206 != 0) {
	    ((Class528_Sub21_Sub3) this).aClass173_Sub2_11211.method8795
		(((Class528_Sub21_Sub3) this).anInt11206,
		 ((Class528_Sub21_Sub3) this).anInt11205);
	    ((Class528_Sub21_Sub3) this).anInt11206 = 0;
	}
    }
}
