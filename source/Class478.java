/* Class478 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public abstract class Class478 implements Interface33
{
    boolean aBool5433;
    static final int anInt5434 = 34963;
    Class173_Sub1_Sub1 aClass173_Sub1_Sub1_5435;
    static final int anInt5436 = 34962;
    NativeHeapBuffer aNativeHeapBuffer5437;
    static int[] anIntArray5438 = new int[1];
    int anInt5439;
    int anInt5440;
    int anInt5441;
    int anInt5442 = -1;
    
    public void method203() {
	OpenGL.glUnmapBufferARB(((Class478) this).anInt5441);
    }
    
    void method5839() {
	if (((Class478) this).anInt5442 < 0) {
	    if (((Class173_Sub1_Sub1)
		 ((Class478) this).aClass173_Sub1_Sub1_5435)
		.aBool11287) {
		OpenGL.glGenBuffersARB(1, anIntArray5438, 0);
		((Class478) this).anInt5442 = anIntArray5438[0];
		OpenGL.glBindBufferARB(((Class478) this).anInt5441,
				       ((Class478) this).anInt5442);
	    } else
		((Class478) this).anInt5442 = 0;
	}
    }
    
    public int method5() {
	return ((Class478) this).anInt5439;
    }
    
    long method5840() {
	return (((Class478) this).anInt5442 == 0
		? ((Class478) this).aNativeHeapBuffer5437.method2() : 0L);
    }
    
    void method5841() {
	if (((Class173_Sub1_Sub1) ((Class478) this).aClass173_Sub1_Sub1_5435)
	    .aBool11287)
	    OpenGL.glBindBufferARB(((Class478) this).anInt5441,
				   ((Class478) this).anInt5442);
    }
    
    public boolean method199(int i, int i_0_, long l) {
	method5847();
	if (((Class478) this).anInt5442 > 0) {
	    OpenGL.glBindBufferARB(((Class478) this).anInt5441,
				   ((Class478) this).anInt5442);
	    OpenGL.glBufferSubDataARBa(((Class478) this).anInt5441, i, i_0_,
				       l);
	} else
	    ((Class478) this).aNativeHeapBuffer5437.aNativeHeap1075.copy
		(((Class478) this).aNativeHeapBuffer5437.method2() + (long) i,
		 l, i_0_);
	return true;
    }
    
    public long method205(int i, int i_1_) {
	OpenGL.glBindBufferARB(((Class478) this).anInt5441,
			       ((Class478) this).anInt5442);
	return (OpenGL.glMapBufferARB(((Class478) this).anInt5441, 35001)
		+ (long) i);
    }
    
    public void method192() {
	OpenGL.glUnmapBufferARB(((Class478) this).anInt5441);
    }
    
    Class478(Class173_Sub1_Sub1 class173_sub1_sub1, int i, boolean bool) {
	((Class478) this).aClass173_Sub1_Sub1_5435 = class173_sub1_sub1;
	((Class478) this).anInt5441 = i;
	((Class478) this).aBool5433 = bool;
    }
    
    void method115() {
	if (((Class478) this).anInt5442 > 0) {
	    ((Class478) this).aClass173_Sub1_Sub1_5435.method10351
		(((Class478) this).anInt5442, ((Class478) this).anInt5439);
	    ((Class478) this).anInt5442 = -1;
	}
    }
    
    public void finalize() throws Throwable {
	method115();
	super.finalize();
    }
    
    void method116() {
	if (((Class478) this).anInt5442 > 0) {
	    ((Class478) this).aClass173_Sub1_Sub1_5435.method10351
		(((Class478) this).anInt5442, ((Class478) this).anInt5439);
	    ((Class478) this).anInt5442 = -1;
	}
    }
    
    public long method201(int i, int i_2_) {
	OpenGL.glBindBufferARB(((Class478) this).anInt5441,
			       ((Class478) this).anInt5442);
	return (OpenGL.glMapBufferARB(((Class478) this).anInt5441, 35001)
		+ (long) i);
    }
    
    void method5842() throws Throwable {
	method115();
	super.finalize();
    }
    
    public void method198() {
	OpenGL.glUnmapBufferARB(((Class478) this).anInt5441);
    }
    
    void method5843() throws Throwable {
	method115();
	super.finalize();
    }
    
    void method5844() throws Throwable {
	method115();
	super.finalize();
    }
    
    public int method178() {
	return ((Class478) this).anInt5439;
    }
    
    public boolean method200(int i, int i_3_, long l) {
	method5847();
	if (((Class478) this).anInt5442 > 0) {
	    OpenGL.glBindBufferARB(((Class478) this).anInt5441,
				   ((Class478) this).anInt5442);
	    OpenGL.glBufferSubDataARBa(((Class478) this).anInt5441, i, i_3_,
				       l);
	} else
	    ((Class478) this).aNativeHeapBuffer5437.aNativeHeap1075.copy
		(((Class478) this).aNativeHeapBuffer5437.method2() + (long) i,
		 l, i_3_);
	return true;
    }
    
    void method311(int i) {
	if (i > ((Class478) this).anInt5440) {
	    method5847();
	    if (((Class478) this).anInt5442 > 0) {
		OpenGL.glBindBufferARB(((Class478) this).anInt5441,
				       ((Class478) this).anInt5442);
		OpenGL.glBufferDataARBub(((Class478) this).anInt5441, i, null,
					 0,
					 (((Class478) this).aBool5433 ? 35040
					  : 35044));
		((Class478) this).aClass173_Sub1_Sub1_5435.anInt9230
		    += i - ((Class478) this).anInt5440;
	    } else
		((Class478) this).aNativeHeapBuffer5437
		    = ((Class478) this).aClass173_Sub1_Sub1_5435
			  .method8547(i, false);
	    ((Class478) this).anInt5440 = i;
	}
	((Class478) this).anInt5439 = i;
    }
    
    public long method202(int i, int i_4_) {
	OpenGL.glBindBufferARB(((Class478) this).anInt5441,
			       ((Class478) this).anInt5442);
	return (OpenGL.glMapBufferARB(((Class478) this).anInt5441, 35001)
		+ (long) i);
    }
    
    public int method73() {
	return ((Class478) this).anInt5439;
    }
    
    public boolean method197(int i, int i_5_, long l) {
	method5847();
	if (((Class478) this).anInt5442 > 0) {
	    OpenGL.glBindBufferARB(((Class478) this).anInt5441,
				   ((Class478) this).anInt5442);
	    OpenGL.glBufferSubDataARBa(((Class478) this).anInt5441, i, i_5_,
				       l);
	} else
	    ((Class478) this).aNativeHeapBuffer5437.aNativeHeap1075.copy
		(((Class478) this).aNativeHeapBuffer5437.method2() + (long) i,
		 l, i_5_);
	return true;
    }
    
    void method5845() throws Throwable {
	method115();
	super.finalize();
    }
    
    void method313(int i) {
	if (i > ((Class478) this).anInt5440) {
	    method5847();
	    if (((Class478) this).anInt5442 > 0) {
		OpenGL.glBindBufferARB(((Class478) this).anInt5441,
				       ((Class478) this).anInt5442);
		OpenGL.glBufferDataARBub(((Class478) this).anInt5441, i, null,
					 0,
					 (((Class478) this).aBool5433 ? 35040
					  : 35044));
		((Class478) this).aClass173_Sub1_Sub1_5435.anInt9230
		    += i - ((Class478) this).anInt5440;
	    } else
		((Class478) this).aNativeHeapBuffer5437
		    = ((Class478) this).aClass173_Sub1_Sub1_5435
			  .method8547(i, false);
	    ((Class478) this).anInt5440 = i;
	}
	((Class478) this).anInt5439 = i;
    }
    
    void method31(int i) {
	if (i > ((Class478) this).anInt5440) {
	    method5847();
	    if (((Class478) this).anInt5442 > 0) {
		OpenGL.glBindBufferARB(((Class478) this).anInt5441,
				       ((Class478) this).anInt5442);
		OpenGL.glBufferDataARBub(((Class478) this).anInt5441, i, null,
					 0,
					 (((Class478) this).aBool5433 ? 35040
					  : 35044));
		((Class478) this).aClass173_Sub1_Sub1_5435.anInt9230
		    += i - ((Class478) this).anInt5440;
	    } else
		((Class478) this).aNativeHeapBuffer5437
		    = ((Class478) this).aClass173_Sub1_Sub1_5435
			  .method8547(i, false);
	    ((Class478) this).anInt5440 = i;
	}
	((Class478) this).anInt5439 = i;
    }
    
    public void method204() {
	OpenGL.glUnmapBufferARB(((Class478) this).anInt5441);
    }
    
    void method5846() {
	if (((Class478) this).anInt5442 < 0) {
	    if (((Class173_Sub1_Sub1)
		 ((Class478) this).aClass173_Sub1_Sub1_5435)
		.aBool11287) {
		OpenGL.glGenBuffersARB(1, anIntArray5438, 0);
		((Class478) this).anInt5442 = anIntArray5438[0];
		OpenGL.glBindBufferARB(((Class478) this).anInt5441,
				       ((Class478) this).anInt5442);
	    } else
		((Class478) this).anInt5442 = 0;
	}
    }
    
    void method5847() {
	if (((Class478) this).anInt5442 < 0) {
	    if (((Class173_Sub1_Sub1)
		 ((Class478) this).aClass173_Sub1_Sub1_5435)
		.aBool11287) {
		OpenGL.glGenBuffersARB(1, anIntArray5438, 0);
		((Class478) this).anInt5442 = anIntArray5438[0];
		OpenGL.glBindBufferARB(((Class478) this).anInt5441,
				       ((Class478) this).anInt5442);
	    } else
		((Class478) this).anInt5442 = 0;
	}
    }
    
    void method5848() {
	if (((Class173_Sub1_Sub1) ((Class478) this).aClass173_Sub1_Sub1_5435)
	    .aBool11287)
	    OpenGL.glBindBufferARB(((Class478) this).anInt5441,
				   ((Class478) this).anInt5442);
    }
}
