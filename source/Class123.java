/* Class123 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

import jaggl.OpenGL;

public abstract class Class123
{
    int anInt1543;
    int anInt1544;
    Class173_Sub2 aClass173_Sub2_1545;
    static final int anInt1546 = 34962;
    int anInt1547;
    static int[] anIntArray1548 = new int[1];
    boolean aBool1549;
    boolean aBool1550 = false;
    static final int anInt1551 = 34963;
    
    abstract void method1594();
    
    Class123(Class173_Sub2 class173_sub2, int i, Buffer buffer, int i_0_,
	     boolean bool) {
	((Class123) this).aClass173_Sub2_1545 = class173_sub2;
	((Class123) this).anInt1544 = i;
	((Class123) this).anInt1543 = i_0_;
	((Class123) this).aBool1549 = bool;
	OpenGL.glGenBuffersARB(1, anIntArray1548, 0);
	((Class123) this).anInt1547 = anIntArray1548[0];
	method1594();
	OpenGL.glBufferDataARBa(i, ((Class123) this).anInt1543,
				buffer.method2(),
				((Class123) this).aBool1549 ? 35040 : 35044);
	((Class173_Sub2) ((Class123) this).aClass173_Sub2_1545).anInt9463
	    += ((Class123) this).anInt1543;
    }
    
    void method1595(byte[] is, int i) {
	method1594();
	if (i > ((Class123) this).anInt1543) {
	    OpenGL.glBufferDataARBub(((Class123) this).anInt1544, i, is, 0,
				     (((Class123) this).aBool1549 ? 35040
				      : 35044));
	    ((Class173_Sub2) ((Class123) this).aClass173_Sub2_1545).anInt9463
		+= i - ((Class123) this).anInt1543;
	    ((Class123) this).anInt1543 = i;
	} else
	    OpenGL.glBufferSubDataARBub(((Class123) this).anInt1544, 0, i, is,
					0);
    }
    
    Class123(Class173_Sub2 class173_sub2, int i, byte[] is, int i_1_,
	     boolean bool) {
	((Class123) this).aClass173_Sub2_1545 = class173_sub2;
	((Class123) this).anInt1544 = i;
	((Class123) this).anInt1543 = i_1_;
	((Class123) this).aBool1549 = bool;
	OpenGL.glGenBuffersARB(1, anIntArray1548, 0);
	((Class123) this).anInt1547 = anIntArray1548[0];
	method1594();
	OpenGL.glBufferDataARBub(i, ((Class123) this).anInt1543, is, 0,
				 ((Class123) this).aBool1549 ? 35040 : 35044);
	((Class173_Sub2) ((Class123) this).aClass173_Sub2_1545).anInt9463
	    += ((Class123) this).anInt1543;
    }
    
    public void finalize() throws Throwable {
	if (!((Class123) this).aBool1550) {
	    ((Class123) this).aClass173_Sub2_1545.method8793((((Class123) this)
							      .anInt1547),
							     (((Class123) this)
							      .anInt1543));
	    ((Class123) this).aBool1550 = true;
	}
	super.finalize();
    }
    
    void method1596() throws Throwable {
	if (!((Class123) this).aBool1550) {
	    ((Class123) this).aClass173_Sub2_1545.method8793((((Class123) this)
							      .anInt1547),
							     (((Class123) this)
							      .anInt1543));
	    ((Class123) this).aBool1550 = true;
	}
	super.finalize();
    }
    
    void method1597() throws Throwable {
	if (!((Class123) this).aBool1550) {
	    ((Class123) this).aClass173_Sub2_1545.method8793((((Class123) this)
							      .anInt1547),
							     (((Class123) this)
							      .anInt1543));
	    ((Class123) this).aBool1550 = true;
	}
	super.finalize();
    }
    
    void method1598() throws Throwable {
	if (!((Class123) this).aBool1550) {
	    ((Class123) this).aClass173_Sub2_1545.method8793((((Class123) this)
							      .anInt1547),
							     (((Class123) this)
							      .anInt1543));
	    ((Class123) this).aBool1550 = true;
	}
	super.finalize();
    }
    
    abstract void method1599();
    
    abstract void method1600();
    
    void method1601() throws Throwable {
	if (!((Class123) this).aBool1550) {
	    ((Class123) this).aClass173_Sub2_1545.method8793((((Class123) this)
							      .anInt1547),
							     (((Class123) this)
							      .anInt1543));
	    ((Class123) this).aBool1550 = true;
	}
	super.finalize();
    }
    
    abstract void method1602();
}
