/* Class133 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class133
{
    static int[] anIntArray1619 = new int[2];
    Class173_Sub2 aClass173_Sub2_1620;
    int anInt1621;
    
    void method1632() throws Throwable {
	((Class133) this).aClass173_Sub2_1620
	    .method8813((long) ((Class133) this).anInt1621);
	super.finalize();
    }
    
    Class133(Class173_Sub2 class173_sub2, int i, Class125[] class125s) {
	((Class133) this).aClass173_Sub2_1620 = class173_sub2;
	((Class133) this).anInt1621 = i;
    }
    
    public void finalize() throws Throwable {
	((Class133) this).aClass173_Sub2_1620
	    .method8813((long) ((Class133) this).anInt1621);
	super.finalize();
    }
    
    void method1633() throws Throwable {
	((Class133) this).aClass173_Sub2_1620
	    .method8813((long) ((Class133) this).anInt1621);
	super.finalize();
    }
    
    static Class133 method1634(Class173_Sub2 class173_sub2,
			       Class125[] class125s) {
	for (int i = 0; i < class125s.length; i++) {
	    if (class125s[i] == null
		|| ((Class125) class125s[i]).anInt1559 <= 0)
		return null;
	}
	int i = OpenGL.glCreateProgram();
	for (int i_0_ = 0; i_0_ < class125s.length; i_0_++)
	    OpenGL.glAttachShader(i, ((Class125) class125s[i_0_]).anInt1559);
	OpenGL.glLinkProgram(i);
	OpenGL.glGetProgramiv(i, 35714, anIntArray1619, 0);
	if (anIntArray1619[0] == 0) {
	    OpenGL.glGetProgramiv(i, 35716, anIntArray1619, 1);
	    if (anIntArray1619[1] > 1) {
		byte[] is = new byte[anIntArray1619[1]];
		OpenGL.glGetProgramInfoLog(i, anIntArray1619[1],
					   anIntArray1619, 0, is, 0);
		System.out.println(new String(is));
	    }
	    if (anIntArray1619[0] == 0) {
		for (int i_1_ = 0; i_1_ < class125s.length; i_1_++)
		    OpenGL.glDetachShader(i, (((Class125) class125s[i_1_])
					      .anInt1559));
		OpenGL.glDeleteProgram(i);
		return null;
	    }
	}
	return new Class133(class173_sub2, i, class125s);
    }
    
    void method1635() throws Throwable {
	((Class133) this).aClass173_Sub2_1620
	    .method8813((long) ((Class133) this).anInt1621);
	super.finalize();
    }
    
    void method1636() throws Throwable {
	((Class133) this).aClass173_Sub2_1620
	    .method8813((long) ((Class133) this).anInt1621);
	super.finalize();
    }
}
