/* Class125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class125
{
    int anInt1559;
    static final int anInt1560 = 35632;
    static int[] anIntArray1561 = new int[2];
    Class173_Sub2 aClass173_Sub2_1562;
    static final int anInt1563 = 35633;
    
    public void finalize() throws Throwable {
	((Class125) this).aClass173_Sub2_1562
	    .method8813((long) ((Class125) this).anInt1559);
	super.finalize();
    }
    
    void method1608() throws Throwable {
	((Class125) this).aClass173_Sub2_1562
	    .method8813((long) ((Class125) this).anInt1559);
	super.finalize();
    }
    
    Class125(Class173_Sub2 class173_sub2, int i, int i_0_) {
	((Class125) this).aClass173_Sub2_1562 = class173_sub2;
	((Class125) this).anInt1559 = i;
    }
    
    void method1609() throws Throwable {
	((Class125) this).aClass173_Sub2_1562
	    .method8813((long) ((Class125) this).anInt1559);
	super.finalize();
    }
    
    void method1610() throws Throwable {
	((Class125) this).aClass173_Sub2_1562
	    .method8813((long) ((Class125) this).anInt1559);
	super.finalize();
    }
    
    void method1611() throws Throwable {
	((Class125) this).aClass173_Sub2_1562
	    .method8813((long) ((Class125) this).anInt1559);
	super.finalize();
    }
    
    static Class125 method1612(Class173_Sub2 class173_sub2, int i,
			       String string) {
	int i_1_ = OpenGL.glCreateShader(i);
	OpenGL.glShaderSource(i_1_, string);
	OpenGL.glCompileShader(i_1_);
	OpenGL.glGetShaderiv(i_1_, 35713, anIntArray1561, 0);
	if (anIntArray1561[0] == 0) {
	    boolean bool = false;
	    if (anIntArray1561[0] == 0) {
		bool = true;
		System.out.println("");
	    }
	    OpenGL.glGetShaderiv(i_1_, 35716, anIntArray1561, 1);
	    if (anIntArray1561[1] > 1) {
		byte[] is = new byte[anIntArray1561[1]];
		OpenGL.glGetShaderInfoLog(i_1_, anIntArray1561[1],
					  anIntArray1561, 0, is, 0);
		System.out.println(new String(is));
	    }
	    if (bool) {
		OpenGL.glDeleteShader(i_1_);
		return null;
	    }
	}
	return new Class125(class173_sub2, i_1_, i);
    }
}
