/* Class128 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class128
{
    static int[] anIntArray1584 = new int[1];
    static final int anInt1585 = 34336;
    int anInt1586;
    Class173_Sub2 aClass173_Sub2_1587;
    
    void method1620() throws Throwable {
	((Class128) this).aClass173_Sub2_1587
	    .method8796(((Class128) this).anInt1586);
	super.finalize();
    }
    
    Class128(Class173_Sub2 class173_sub2, int i, int i_0_) {
	((Class128) this).aClass173_Sub2_1587 = class173_sub2;
	((Class128) this).anInt1586 = i_0_;
    }
    
    public void finalize() throws Throwable {
	((Class128) this).aClass173_Sub2_1587
	    .method8796(((Class128) this).anInt1586);
	super.finalize();
    }
    
    static Class128 method1621(Class173_Sub2 class173_sub2, int i,
			       String string) {
	int i_1_ = OpenGL.glGenProgramARB();
	OpenGL.glBindProgramARB(i, i_1_);
	OpenGL.glProgramStringARB(i, 34933, string);
	OpenGL.glGetIntegerv(34379, anIntArray1584, 0);
	if (anIntArray1584[0] != -1) {
	    OpenGL.glBindProgramARB(i, 0);
	    return null;
	}
	OpenGL.glBindProgramARB(i, 0);
	return new Class128(class173_sub2, i, i_1_);
    }
    
    void method1622() throws Throwable {
	((Class128) this).aClass173_Sub2_1587
	    .method8796(((Class128) this).anInt1586);
	super.finalize();
    }
    
    void method1623() throws Throwable {
	((Class128) this).aClass173_Sub2_1587
	    .method8796(((Class128) this).anInt1586);
	super.finalize();
    }
    
    void method1624() throws Throwable {
	((Class128) this).aClass173_Sub2_1587
	    .method8796(((Class128) this).anInt1586);
	super.finalize();
    }
}
