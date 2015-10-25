/* Class163_Sub2_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;

import jaggl.OpenGL;

public class Class163_Sub2_Sub2_Sub2 extends Class163_Sub2_Sub2
{
    int anInt11923;
    Canvas aCanvas11924;
    long aLong11925;
    OpenGL anOpenGL11926;
    int anInt11927;
    boolean aBool11928 = false;
    
    boolean method2077() {
	return true;
    }
    
    Class163_Sub2_Sub2_Sub2(Class173_Sub1_Sub1 class173_sub1_sub1,
			    Canvas canvas, long l) {
	super(class173_sub1_sub1);
	((Class163_Sub2_Sub2_Sub2) this).aCanvas11924 = canvas;
	((Class163_Sub2_Sub2_Sub2) this).anOpenGL11926
	    = ((Class173_Sub1_Sub1) class173_sub1_sub1).anOpenGL11271;
	((Class163_Sub2_Sub2_Sub2) this).aLong11925 = l;
	method10804();
    }
    
    void method10803() {
	Dimension dimension
	    = ((Class163_Sub2_Sub2_Sub2) this).aCanvas11924.getSize();
	((Class163_Sub2_Sub2_Sub2) this).anInt11927 = dimension.height;
	((Class163_Sub2_Sub2_Sub2) this).anInt11923 = dimension.width;
    }
    
    public int method2070() {
	return ((Class163_Sub2_Sub2_Sub2) this).anInt11927;
    }
    
    boolean method2072() {
	return true;
    }
    
    public void method337() {
	if (((Class163_Sub2_Sub2_Sub2) this).aLong11925 != 0L) {
	    ((Class163_Sub2_Sub2_Sub2) this).anOpenGL11926.releaseSurface
		(((Class163_Sub2_Sub2_Sub2) this).aCanvas11924,
		 ((Class163_Sub2_Sub2_Sub2) this).aLong11925);
	    ((Class163_Sub2_Sub2_Sub2) this).aLong11925 = 0L;
	}
    }
    
    void method10804() {
	Dimension dimension
	    = ((Class163_Sub2_Sub2_Sub2) this).aCanvas11924.getSize();
	((Class163_Sub2_Sub2_Sub2) this).anInt11927 = dimension.height;
	((Class163_Sub2_Sub2_Sub2) this).anInt11923 = dimension.width;
    }
    
    public int method8922(int i, int i_0_) {
	return 0;
    }
    
    boolean method335() {
	if (((Class163_Sub2_Sub2_Sub2) this).aLong11925 == 0L)
	    throw new IllegalStateException("");
	boolean bool = true;
	if (!((Class163_Sub2_Sub2_Sub2) this).aBool11928) {
	    bool
		= ((Class163_Sub2_Sub2_Sub2) this).anOpenGL11926
		      .setSurface(((Class163_Sub2_Sub2_Sub2) this).aLong11925);
	    ((Class163_Sub2_Sub2_Sub2) this).aBool11928 = true;
	}
	return bool && super.method335();
    }
    
    Class163_Sub2_Sub2_Sub2(Class173_Sub1_Sub1 class173_sub1_sub1,
			    Canvas canvas) {
	this(class173_sub1_sub1, canvas,
	     ((Class173_Sub1_Sub1) class173_sub1_sub1).anOpenGL11271
		 .prepareSurface(canvas));
    }
    
    public void method115() {
	if (((Class163_Sub2_Sub2_Sub2) this).aLong11925 != 0L) {
	    ((Class163_Sub2_Sub2_Sub2) this).anOpenGL11926.releaseSurface
		(((Class163_Sub2_Sub2_Sub2) this).aCanvas11924,
		 ((Class163_Sub2_Sub2_Sub2) this).aLong11925);
	    ((Class163_Sub2_Sub2_Sub2) this).aLong11925 = 0L;
	}
    }
    
    public int method2069() {
	return ((Class163_Sub2_Sub2_Sub2) this).anInt11923;
    }
    
    public int method2073() {
	return ((Class163_Sub2_Sub2_Sub2) this).anInt11923;
    }
    
    public int method2075() {
	return ((Class163_Sub2_Sub2_Sub2) this).anInt11923;
    }
    
    public int method2071() {
	return ((Class163_Sub2_Sub2_Sub2) this).anInt11927;
    }
    
    public int method8917() {
	if (((Class163_Sub2_Sub2_Sub2) this).aLong11925 == 0L)
	    throw new IllegalStateException("");
	((Class163_Sub2_Sub2_Sub2) this).anOpenGL11926
	    .swapBuffers(((Class163_Sub2_Sub2_Sub2) this).aLong11925);
	return 0;
    }
    
    boolean method339() {
	if (((Class163_Sub2_Sub2_Sub2) this).aLong11925 == 0L)
	    throw new IllegalStateException("");
	boolean bool = true;
	if (!((Class163_Sub2_Sub2_Sub2) this).aBool11928) {
	    bool
		= ((Class163_Sub2_Sub2_Sub2) this).anOpenGL11926
		      .setSurface(((Class163_Sub2_Sub2_Sub2) this).aLong11925);
	    ((Class163_Sub2_Sub2_Sub2) this).aBool11928 = true;
	}
	return bool && super.method335();
    }
    
    boolean method338() {
	if (((Class163_Sub2_Sub2_Sub2) this).aLong11925 == 0L)
	    throw new IllegalStateException("");
	boolean bool = true;
	if (!((Class163_Sub2_Sub2_Sub2) this).aBool11928) {
	    bool
		= ((Class163_Sub2_Sub2_Sub2) this).anOpenGL11926
		      .setSurface(((Class163_Sub2_Sub2_Sub2) this).aLong11925);
	    ((Class163_Sub2_Sub2_Sub2) this).aBool11928 = true;
	}
	return bool && super.method335();
    }
    
    public int method8924(int i, int i_1_) {
	return 0;
    }
    
    boolean method2078() {
	return true;
    }
    
    boolean method2079() {
	return true;
    }
    
    boolean method2080() {
	return true;
    }
    
    public void method204() {
	if (((Class163_Sub2_Sub2_Sub2) this).aLong11925 != 0L) {
	    ((Class163_Sub2_Sub2_Sub2) this).anOpenGL11926.releaseSurface
		(((Class163_Sub2_Sub2_Sub2) this).aCanvas11924,
		 ((Class163_Sub2_Sub2_Sub2) this).aLong11925);
	    ((Class163_Sub2_Sub2_Sub2) this).aLong11925 = 0L;
	}
    }
    
    public void method198() {
	if (((Class163_Sub2_Sub2_Sub2) this).aLong11925 != 0L) {
	    ((Class163_Sub2_Sub2_Sub2) this).anOpenGL11926.releaseSurface
		(((Class163_Sub2_Sub2_Sub2) this).aCanvas11924,
		 ((Class163_Sub2_Sub2_Sub2) this).aLong11925);
	    ((Class163_Sub2_Sub2_Sub2) this).aLong11925 = 0L;
	}
    }
    
    public int method2074() {
	return ((Class163_Sub2_Sub2_Sub2) this).anInt11923;
    }
    
    void method8919(int i, int i_2_) {
	if (((Class163_Sub2_Sub2_Sub2) this).aLong11925 == 0L)
	    throw new IllegalStateException("");
	((Class163_Sub2_Sub2_Sub2) this).anOpenGL11926
	    .surfaceResized(((Class163_Sub2_Sub2_Sub2) this).aLong11925);
	method10804();
	super.method8921(i, i_2_);
    }
    
    void method8920(int i, int i_3_) {
	if (((Class163_Sub2_Sub2_Sub2) this).aLong11925 == 0L)
	    throw new IllegalStateException("");
	((Class163_Sub2_Sub2_Sub2) this).anOpenGL11926
	    .surfaceResized(((Class163_Sub2_Sub2_Sub2) this).aLong11925);
	method10804();
	super.method8921(i, i_3_);
    }
    
    public int method8916() {
	if (((Class163_Sub2_Sub2_Sub2) this).aLong11925 == 0L)
	    throw new IllegalStateException("");
	((Class163_Sub2_Sub2_Sub2) this).anOpenGL11926
	    .swapBuffers(((Class163_Sub2_Sub2_Sub2) this).aLong11925);
	return 0;
    }
    
    public int method2076() {
	return ((Class163_Sub2_Sub2_Sub2) this).anInt11927;
    }
    
    public int method8923(int i, int i_4_) {
	return 0;
    }
    
    public int method8918(int i, int i_5_) {
	return 0;
    }
    
    void method8921(int i, int i_6_) {
	if (((Class163_Sub2_Sub2_Sub2) this).aLong11925 == 0L)
	    throw new IllegalStateException("");
	((Class163_Sub2_Sub2_Sub2) this).anOpenGL11926
	    .surfaceResized(((Class163_Sub2_Sub2_Sub2) this).aLong11925);
	method10804();
	super.method8921(i, i_6_);
    }
    
    void method10805() {
	Dimension dimension
	    = ((Class163_Sub2_Sub2_Sub2) this).aCanvas11924.getSize();
	((Class163_Sub2_Sub2_Sub2) this).anInt11927 = dimension.height;
	((Class163_Sub2_Sub2_Sub2) this).anInt11923 = dimension.width;
    }
}
