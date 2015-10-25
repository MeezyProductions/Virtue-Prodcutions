/* Class111 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class111
{
    int anInt1398;
    
    void method1425() {
	OpenGL.glEndList();
    }
    
    void method1426(int i) {
	OpenGL.glNewList(((Class111) this).anInt1398 + i, 4864);
    }
    
    void method1427(int i) {
	OpenGL.glNewList(((Class111) this).anInt1398 + i, 4864);
    }
    
    void method1428(char c) {
	OpenGL.glCallList(((Class111) this).anInt1398 + c);
    }
    
    void method1429(int i) {
	OpenGL.glNewList(((Class111) this).anInt1398 + i, 4864);
    }
    
    void method1430(int i) {
	OpenGL.glNewList(((Class111) this).anInt1398 + i, 4864);
    }
    
    Class111(Class173_Sub2 class173_sub2, int i) {
	((Class111) this).anInt1398 = OpenGL.glGenLists(i);
    }
    
    void method1431() {
	OpenGL.glEndList();
    }
}
