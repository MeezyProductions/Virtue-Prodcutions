/* Class163_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;

import jaggl.OpenGL;

public class Class163_Sub2_Sub1 extends Class163_Sub2
{
    OpenGL anOpenGL11249;
    long aLong11250;
    Class173_Sub2 aClass173_Sub2_11251;
    int anInt11252;
    Canvas aCanvas11253;
    int anInt11254;
    boolean aBool11255 = false;
    boolean aBool11256 = false;
    
    void method10343() {
	Dimension dimension
	    = ((Class163_Sub2_Sub1) this).aCanvas11253.getSize();
	((Class163_Sub2_Sub1) this).anInt11254 = dimension.height;
	((Class163_Sub2_Sub1) this).anInt11252 = dimension.width;
    }
    
    Class163_Sub2_Sub1(Class173_Sub2 class173_sub2, Canvas canvas, long l) {
	((Class163_Sub2_Sub1) this).aClass173_Sub2_11251 = class173_sub2;
	((Class163_Sub2_Sub1) this).aCanvas11253 = canvas;
	((Class163_Sub2_Sub1) this).anOpenGL11249
	    = ((Class173_Sub2) class173_sub2).anOpenGL9604;
	((Class163_Sub2_Sub1) this).aLong11250 = l;
	method10343();
    }
    
    public int method8923(int i, int i_0_) {
	return 0;
    }
    
    public int method2070() {
	return ((Class163_Sub2_Sub1) this).anInt11254;
    }
    
    Class163_Sub2_Sub1(Class173_Sub2 class173_sub2, Canvas canvas) {
	this(class173_sub2, canvas, ((Class173_Sub2) class173_sub2)
					.anOpenGL9604.prepareSurface(canvas));
    }
    
    boolean method2078() {
	return true;
    }
    
    public int method2074() {
	return ((Class163_Sub2_Sub1) this).anInt11252;
    }
    
    public int method2075() {
	return ((Class163_Sub2_Sub1) this).anInt11252;
    }
    
    public int method2069() {
	return ((Class163_Sub2_Sub1) this).anInt11252;
    }
    
    boolean method2072() {
	return true;
    }
    
    public void method115() {
	if (((Class163_Sub2_Sub1) this).aBool11255)
	    throw new IllegalStateException();
	((Class163_Sub2_Sub1) this).anOpenGL11249.releaseSurface
	    (((Class163_Sub2_Sub1) this).aCanvas11253,
	     ((Class163_Sub2_Sub1) this).aLong11250);
	((Class163_Sub2_Sub1) this).aBool11255 = true;
	((Class163_Sub2_Sub1) this).aBool11256 = false;
    }
    
    void method10344() {
	Dimension dimension
	    = ((Class163_Sub2_Sub1) this).aCanvas11253.getSize();
	((Class163_Sub2_Sub1) this).anInt11254 = dimension.height;
	((Class163_Sub2_Sub1) this).anInt11252 = dimension.width;
    }
    
    public int method2073() {
	return ((Class163_Sub2_Sub1) this).anInt11252;
    }
    
    void method8920(int i, int i_1_) {
	if (((Class163_Sub2_Sub1) this).aBool11255)
	    throw new IllegalStateException();
	((Class163_Sub2_Sub1) this).anOpenGL11249
	    .surfaceResized(((Class163_Sub2_Sub1) this).aLong11250);
	method10343();
	if (this == ((Class163_Sub2_Sub1) this).aClass173_Sub2_11251
			.method2403((byte) -101))
	    ((Class163_Sub2_Sub1) this).aClass173_Sub2_11251.method8742();
    }
    
    public int method2071() {
	return ((Class163_Sub2_Sub1) this).anInt11254;
    }
    
    public int method2076() {
	return ((Class163_Sub2_Sub1) this).anInt11254;
    }
    
    boolean method339() {
	if (((Class163_Sub2_Sub1) this).aBool11255)
	    throw new IllegalStateException();
	if (!((Class163_Sub2_Sub1) this).aBool11256) {
	    ((Class163_Sub2_Sub1) this).anOpenGL11249
		.setSurface(((Class163_Sub2_Sub1) this).aLong11250);
	    ((Class163_Sub2_Sub1) this).aBool11256 = true;
	}
	((Class163_Sub2_Sub1) this).aClass173_Sub2_11251.method8741();
	return true;
    }
    
    boolean method338() {
	if (((Class163_Sub2_Sub1) this).aBool11255)
	    throw new IllegalStateException();
	if (!((Class163_Sub2_Sub1) this).aBool11256) {
	    ((Class163_Sub2_Sub1) this).anOpenGL11249
		.setSurface(((Class163_Sub2_Sub1) this).aLong11250);
	    ((Class163_Sub2_Sub1) this).aBool11256 = true;
	}
	((Class163_Sub2_Sub1) this).aClass173_Sub2_11251.method8741();
	return true;
    }
    
    boolean method2077() {
	return true;
    }
    
    public int method8917() {
	if (((Class163_Sub2_Sub1) this).aBool11255)
	    throw new IllegalStateException();
	((Class163_Sub2_Sub1) this).anOpenGL11249
	    .swapBuffers(((Class163_Sub2_Sub1) this).aLong11250);
	return 0;
    }
    
    boolean method2079() {
	return true;
    }
    
    boolean method2080() {
	return true;
    }
    
    public void method204() {
	if (((Class163_Sub2_Sub1) this).aBool11255)
	    throw new IllegalStateException();
	((Class163_Sub2_Sub1) this).anOpenGL11249.releaseSurface
	    (((Class163_Sub2_Sub1) this).aCanvas11253,
	     ((Class163_Sub2_Sub1) this).aLong11250);
	((Class163_Sub2_Sub1) this).aBool11255 = true;
	((Class163_Sub2_Sub1) this).aBool11256 = false;
    }
    
    void method8921(int i, int i_2_) {
	if (((Class163_Sub2_Sub1) this).aBool11255)
	    throw new IllegalStateException();
	((Class163_Sub2_Sub1) this).anOpenGL11249
	    .surfaceResized(((Class163_Sub2_Sub1) this).aLong11250);
	method10343();
	if (this == ((Class163_Sub2_Sub1) this).aClass173_Sub2_11251
			.method2403((byte) -3))
	    ((Class163_Sub2_Sub1) this).aClass173_Sub2_11251.method8742();
    }
    
    public void method337() {
	if (((Class163_Sub2_Sub1) this).aBool11255)
	    throw new IllegalStateException();
	((Class163_Sub2_Sub1) this).anOpenGL11249.releaseSurface
	    (((Class163_Sub2_Sub1) this).aCanvas11253,
	     ((Class163_Sub2_Sub1) this).aLong11250);
	((Class163_Sub2_Sub1) this).aBool11255 = true;
	((Class163_Sub2_Sub1) this).aBool11256 = false;
    }
    
    void method8919(int i, int i_3_) {
	if (((Class163_Sub2_Sub1) this).aBool11255)
	    throw new IllegalStateException();
	((Class163_Sub2_Sub1) this).anOpenGL11249
	    .surfaceResized(((Class163_Sub2_Sub1) this).aLong11250);
	method10343();
	if (this == ((Class163_Sub2_Sub1) this).aClass173_Sub2_11251
			.method2403((byte) -59))
	    ((Class163_Sub2_Sub1) this).aClass173_Sub2_11251.method8742();
    }
    
    boolean method335() {
	if (((Class163_Sub2_Sub1) this).aBool11255)
	    throw new IllegalStateException();
	if (!((Class163_Sub2_Sub1) this).aBool11256) {
	    ((Class163_Sub2_Sub1) this).anOpenGL11249
		.setSurface(((Class163_Sub2_Sub1) this).aLong11250);
	    ((Class163_Sub2_Sub1) this).aBool11256 = true;
	}
	((Class163_Sub2_Sub1) this).aClass173_Sub2_11251.method8741();
	return true;
    }
    
    public int method8916() {
	if (((Class163_Sub2_Sub1) this).aBool11255)
	    throw new IllegalStateException();
	((Class163_Sub2_Sub1) this).anOpenGL11249
	    .swapBuffers(((Class163_Sub2_Sub1) this).aLong11250);
	return 0;
    }
    
    public int method8922(int i, int i_4_) {
	return 0;
    }
    
    public int method8924(int i, int i_5_) {
	return 0;
    }
    
    public int method8918(int i, int i_6_) {
	return 0;
    }
    
    void method10345() {
	Dimension dimension
	    = ((Class163_Sub2_Sub1) this).aCanvas11253.getSize();
	((Class163_Sub2_Sub1) this).anInt11254 = dimension.height;
	((Class163_Sub2_Sub1) this).anInt11252 = dimension.width;
    }
    
    public void method198() {
	if (((Class163_Sub2_Sub1) this).aBool11255)
	    throw new IllegalStateException();
	((Class163_Sub2_Sub1) this).anOpenGL11249.releaseSurface
	    (((Class163_Sub2_Sub1) this).aCanvas11253,
	     ((Class163_Sub2_Sub1) this).aLong11250);
	((Class163_Sub2_Sub1) this).aBool11255 = true;
	((Class163_Sub2_Sub1) this).aBool11256 = false;
    }
}
