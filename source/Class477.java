/* Class477 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class477 implements Interface53
{
    int anInt5431;
    Class470_Sub3 aClass470_Sub3_5432;
    
    public void method116() {
	/* empty */
    }
    
    public int method40() {
	return ((Class477) this).aClass470_Sub3_5432.method1();
    }
    
    public int method68() {
	return ((Class477) this).aClass470_Sub3_5432.method68();
    }
    
    public void method66(int i) {
	OpenGL.glFramebufferTexture2DEXT
	    (36160, i,
	     ((Class470_Sub3) ((Class477) this).aClass470_Sub3_5432).anInt5395,
	     ((Class470_Sub3) ((Class477) this).aClass470_Sub3_5432).anInt5394,
	     ((Class477) this).anInt5431);
    }
    
    public void method115() {
	/* empty */
    }
    
    public int method6() {
	return ((Class477) this).aClass470_Sub3_5432.method1();
    }
    
    public int method5() {
	return ((Class477) this).aClass470_Sub3_5432.method1();
    }
    
    public int method71() {
	return ((Class477) this).aClass470_Sub3_5432.method68();
    }
    
    public int method72() {
	return ((Class477) this).aClass470_Sub3_5432.method68();
    }
    
    Class477(Class470_Sub3 class470_sub3, int i) {
	((Class477) this).anInt5431 = i;
	((Class477) this).aClass470_Sub3_5432 = class470_sub3;
    }
    
    public int method73() {
	return ((Class477) this).aClass470_Sub3_5432.method68();
    }
    
    public void method67(int i) {
	OpenGL.glFramebufferTexture2DEXT
	    (36160, i,
	     ((Class470_Sub3) ((Class477) this).aClass470_Sub3_5432).anInt5395,
	     ((Class470_Sub3) ((Class477) this).aClass470_Sub3_5432).anInt5394,
	     ((Class477) this).anInt5431);
    }
    
    public int method1() {
	return ((Class477) this).aClass470_Sub3_5432.method1();
    }
    
    public void method346(int i) {
	OpenGL.glFramebufferTexture2DEXT
	    (36160, i,
	     ((Class470_Sub3) ((Class477) this).aClass470_Sub3_5432).anInt5395,
	     ((Class470_Sub3) ((Class477) this).aClass470_Sub3_5432).anInt5394,
	     ((Class477) this).anInt5431);
    }
}
