/* Class163_Sub1_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class163_Sub1_Sub3_Sub2 extends Class163_Sub1_Sub3
{
    int anInt11913;
    Class173_Sub1_Sub1 aClass173_Sub1_Sub1_11914;
    int anInt11915;
    int anInt11916;
    int anInt11917;
    static final int anInt11918 = 16;
    Interface53[] anInterface53Array11919 = new Interface53[4];
    int anInt11920;
    Interface53 anInterface53_11921;
    
    public void method115() {
	if (((Class163_Sub1_Sub3_Sub2) this).anInt11915 != 0) {
	    ((Class163_Sub1_Sub3_Sub2) this).aClass173_Sub1_Sub1_11914
		.method10353(((Class163_Sub1_Sub3_Sub2) this).anInt11915);
	    ((Class163_Sub1_Sub3_Sub2) this).anInt11915 = 0;
	}
    }
    
    public int method2074() {
	return ((Class163_Sub1_Sub3_Sub2) this).anInt11916;
    }
    
    public boolean method8897() {
	int i = OpenGL.glCheckFramebufferStatusEXT(36160);
	if (i != 36053)
	    return false;
	return true;
    }
    
    public void method8898(int i, Interface19 interface19) {
	int i_0_ = 1 << i;
	Interface53 interface53 = (Interface53) interface19;
	if (interface19 != null) {
	    if (((Class163_Sub1_Sub3_Sub2) this).anInt11920 != 0) {
		if ((((Class163_Sub1_Sub3_Sub2) this).anInt11916
		     != interface53.method1())
		    || (((Class163_Sub1_Sub3_Sub2) this).anInt11917
			!= interface53.method68()))
		    throw new RuntimeException();
	    } else {
		((Class163_Sub1_Sub3_Sub2) this).anInt11917
		    = interface53.method68();
		((Class163_Sub1_Sub3_Sub2) this).anInt11916
		    = interface53.method1();
		method10402();
	    }
	    ((Class163_Sub1_Sub3_Sub2) this).anInt11920 |= i_0_;
	    ((Class163_Sub1_Sub3_Sub2) this).anInterface53Array11919[i]
		= interface53;
	} else {
	    ((Class163_Sub1_Sub3_Sub2) this).anInt11920 &= i_0_ ^ 0xffffffff;
	    ((Class163_Sub1_Sub3_Sub2) this).anInterface53Array11919[i] = null;
	    if (((Class163_Sub1_Sub3_Sub2) this).anInt11920 == 0) {
		((Class163_Sub1_Sub3_Sub2) this).anInt11917 = 0;
		((Class163_Sub1_Sub3_Sub2) this).anInt11916 = 0;
	    }
	}
	if (this == ((Class163_Sub1_Sub3_Sub2) this)
			.aClass173_Sub1_Sub1_11914.method2403((byte) -96))
	    method10794(i);
	else
	    ((Class163_Sub1_Sub3_Sub2) this).anInt11913 |= i_0_;
    }
    
    public void method8907(Interface21 interface21) {
	Interface53 interface53 = (Interface53) interface21;
	if (interface21 != null) {
	    if (((Class163_Sub1_Sub3_Sub2) this).anInt11920 != 0) {
		if ((((Class163_Sub1_Sub3_Sub2) this).anInt11916
		     != interface53.method1())
		    || (((Class163_Sub1_Sub3_Sub2) this).anInt11917
			!= interface53.method68()))
		    throw new RuntimeException();
	    } else {
		((Class163_Sub1_Sub3_Sub2) this).anInt11917
		    = interface53.method68();
		((Class163_Sub1_Sub3_Sub2) this).anInt11916
		    = interface53.method1();
		method10402();
	    }
	    ((Class163_Sub1_Sub3_Sub2) this).anInt11920 |= 0x10;
	    ((Class163_Sub1_Sub3_Sub2) this).anInterface53_11921 = interface53;
	} else {
	    ((Class163_Sub1_Sub3_Sub2) this).anInt11920 &= ~0x10;
	    ((Class163_Sub1_Sub3_Sub2) this).anInterface53_11921 = null;
	    if (((Class163_Sub1_Sub3_Sub2) this).anInt11920 == 0) {
		((Class163_Sub1_Sub3_Sub2) this).anInt11917 = 0;
		((Class163_Sub1_Sub3_Sub2) this).anInt11916 = 0;
	    }
	}
	if (this == ((Class163_Sub1_Sub3_Sub2) this)
			.aClass173_Sub1_Sub1_11914.method2403((byte) -27))
	    method10795();
	else
	    ((Class163_Sub1_Sub3_Sub2) this).anInt11913 |= 0x10;
    }
    
    void method10794(int i) {
	Interface53 interface53
	    = ((Class163_Sub1_Sub3_Sub2) this).anInterface53Array11919[i];
	if (interface53 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
	else
	    interface53.method66(36064 + i);
    }
    
    void method10795() {
	if (((Class163_Sub1_Sub3_Sub2) this).anInterface53_11921 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
	else
	    ((Class163_Sub1_Sub3_Sub2) this).anInterface53_11921
		.method66(36096);
    }
    
    public boolean method8902() {
	int i = OpenGL.glCheckFramebufferStatusEXT(36160);
	if (i != 36053)
	    return false;
	return true;
    }
    
    boolean method335() {
	OpenGL.glBindFramebufferEXT(36160, (((Class163_Sub1_Sub3_Sub2) this)
					    .anInt11915));
	for (int i = 0; i < 4; i++) {
	    if ((((Class163_Sub1_Sub3_Sub2) this).anInt11913 & 1 << i) != 0)
		method10794(i);
	}
	if ((((Class163_Sub1_Sub3_Sub2) this).anInt11913 & 0x10) != 0)
	    method10795();
	((Class163_Sub1_Sub3_Sub2) this).anInt11913 = 0;
	return super.method335();
    }
    
    boolean method2072() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    void method10796() throws Throwable {
	super.finalize();
	method115();
    }
    
    public void method8899(Interface21 interface21) {
	Interface53 interface53 = (Interface53) interface21;
	if (interface21 != null) {
	    if (((Class163_Sub1_Sub3_Sub2) this).anInt11920 != 0) {
		if ((((Class163_Sub1_Sub3_Sub2) this).anInt11916
		     != interface53.method1())
		    || (((Class163_Sub1_Sub3_Sub2) this).anInt11917
			!= interface53.method68()))
		    throw new RuntimeException();
	    } else {
		((Class163_Sub1_Sub3_Sub2) this).anInt11917
		    = interface53.method68();
		((Class163_Sub1_Sub3_Sub2) this).anInt11916
		    = interface53.method1();
		method10402();
	    }
	    ((Class163_Sub1_Sub3_Sub2) this).anInt11920 |= 0x10;
	    ((Class163_Sub1_Sub3_Sub2) this).anInterface53_11921 = interface53;
	} else {
	    ((Class163_Sub1_Sub3_Sub2) this).anInt11920 &= ~0x10;
	    ((Class163_Sub1_Sub3_Sub2) this).anInterface53_11921 = null;
	    if (((Class163_Sub1_Sub3_Sub2) this).anInt11920 == 0) {
		((Class163_Sub1_Sub3_Sub2) this).anInt11917 = 0;
		((Class163_Sub1_Sub3_Sub2) this).anInt11916 = 0;
	    }
	}
	if (this == ((Class163_Sub1_Sub3_Sub2) this)
			.aClass173_Sub1_Sub1_11914.method2403((byte) -20))
	    method10795();
	else
	    ((Class163_Sub1_Sub3_Sub2) this).anInt11913 |= 0x10;
    }
    
    public void finalize() throws Throwable {
	super.finalize();
	method115();
    }
    
    public int method2069() {
	return ((Class163_Sub1_Sub3_Sub2) this).anInt11916;
    }
    
    public int method2073() {
	return ((Class163_Sub1_Sub3_Sub2) this).anInt11916;
    }
    
    public void method8904(int i, int i_1_, int i_2_, int i_3_, int i_4_,
			   int i_5_, boolean bool, boolean bool_6_) {
	if (bool | bool_6_) {
	    int i_7_ = ((Class163_Sub1_Sub3_Sub2) this).anInt11917;
	    int i_8_ = ((Class163_Sub1_Sub3_Sub2) this)
			   .aClass173_Sub1_Sub1_11914.method2403
			   ((byte) -29).method2070();
	    int i_9_ = 0;
	    if (bool_6_)
		i_9_ |= 0x100;
	    if (bool)
		i_9_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008,
					(((Class163_Sub1_Sub3_Sub2) this)
					 .anInt11915));
	    OpenGL.glBlitFramebufferEXT(i, i_7_ - i_1_ - i_3_, i + i_2_,
					i_7_ - i_1_, i_4_, i_8_ - i_5_ - i_3_,
					i_4_ + i_2_, i_8_ - i_5_, i_9_, 9728);
	    OpenGL.glBindFramebufferEXT(36008, 0);
	}
    }
    
    public void method8900(int i, int i_10_, int i_11_, int i_12_, int i_13_,
			   int i_14_, boolean bool, boolean bool_15_) {
	if (bool | bool_15_) {
	    int i_16_ = ((Class163_Sub1_Sub3_Sub2) this).anInt11917;
	    int i_17_ = ((Class163_Sub1_Sub3_Sub2) this)
			    .aClass173_Sub1_Sub1_11914.method2403
			    ((byte) -46).method2070();
	    int i_18_ = 0;
	    if (bool_15_)
		i_18_ |= 0x100;
	    if (bool)
		i_18_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008,
					(((Class163_Sub1_Sub3_Sub2) this)
					 .anInt11915));
	    OpenGL.glBlitFramebufferEXT(i, i_16_ - i_10_ - i_12_, i + i_11_,
					i_16_ - i_10_, i_13_,
					i_17_ - i_14_ - i_12_, i_13_ + i_11_,
					i_17_ - i_14_, i_18_, 9728);
	    OpenGL.glBindFramebufferEXT(36008, 0);
	}
    }
    
    boolean method2080() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    public boolean method8901() {
	int i = OpenGL.glCheckFramebufferStatusEXT(36160);
	if (i != 36053)
	    return false;
	return true;
    }
    
    public int method2075() {
	return ((Class163_Sub1_Sub3_Sub2) this).anInt11916;
    }
    
    public int method2070() {
	return ((Class163_Sub1_Sub3_Sub2) this).anInt11917;
    }
    
    boolean method338() {
	OpenGL.glBindFramebufferEXT(36160, (((Class163_Sub1_Sub3_Sub2) this)
					    .anInt11915));
	for (int i = 0; i < 4; i++) {
	    if ((((Class163_Sub1_Sub3_Sub2) this).anInt11913 & 1 << i) != 0)
		method10794(i);
	}
	if ((((Class163_Sub1_Sub3_Sub2) this).anInt11913 & 0x10) != 0)
	    method10795();
	((Class163_Sub1_Sub3_Sub2) this).anInt11913 = 0;
	return super.method335();
    }
    
    boolean method2077() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    boolean method2078() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    boolean method2079() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    void method10797(int i) {
	Interface53 interface53
	    = ((Class163_Sub1_Sub3_Sub2) this).anInterface53Array11919[i];
	if (interface53 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
	else
	    interface53.method66(36064 + i);
    }
    
    public void method8903(int i, int i_19_, int i_20_, int i_21_, int i_22_,
			   int i_23_, boolean bool, boolean bool_24_) {
	if (bool | bool_24_) {
	    int i_25_ = ((Class163_Sub1_Sub3_Sub2) this).anInt11917;
	    int i_26_ = ((Class163_Sub1_Sub3_Sub2) this)
			    .aClass173_Sub1_Sub1_11914.method2403
			    ((byte) -33).method2070();
	    int i_27_ = 0;
	    if (bool_24_)
		i_27_ |= 0x100;
	    if (bool)
		i_27_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008,
					(((Class163_Sub1_Sub3_Sub2) this)
					 .anInt11915));
	    OpenGL.glBlitFramebufferEXT(i, i_25_ - i_19_ - i_21_, i + i_20_,
					i_25_ - i_19_, i_22_,
					i_26_ - i_23_ - i_21_, i_22_ + i_20_,
					i_26_ - i_23_, i_27_, 9728);
	    OpenGL.glBindFramebufferEXT(36008, 0);
	}
    }
    
    Class163_Sub1_Sub3_Sub2(Class173_Sub1_Sub1 class173_sub1_sub1) {
	super((Class173_Sub1) class173_sub1_sub1);
	((Class163_Sub1_Sub3_Sub2) this).aClass173_Sub1_Sub1_11914
	    = class173_sub1_sub1;
	int[] is = new int[1];
	if (!((Class163_Sub1_Sub3_Sub2) this).aClass173_Sub1_Sub1_11914
	     .aBool9279)
	    throw new RuntimeException("");
	OpenGL.glGenFramebuffersEXT(1, is, 0);
	((Class163_Sub1_Sub3_Sub2) this).anInt11915 = is[0];
    }
    
    public void method204() {
	if (((Class163_Sub1_Sub3_Sub2) this).anInt11915 != 0) {
	    ((Class163_Sub1_Sub3_Sub2) this).aClass173_Sub1_Sub1_11914
		.method10353(((Class163_Sub1_Sub3_Sub2) this).anInt11915);
	    ((Class163_Sub1_Sub3_Sub2) this).anInt11915 = 0;
	}
    }
    
    public void method198() {
	if (((Class163_Sub1_Sub3_Sub2) this).anInt11915 != 0) {
	    ((Class163_Sub1_Sub3_Sub2) this).aClass173_Sub1_Sub1_11914
		.method10353(((Class163_Sub1_Sub3_Sub2) this).anInt11915);
	    ((Class163_Sub1_Sub3_Sub2) this).anInt11915 = 0;
	}
    }
    
    public void method337() {
	if (((Class163_Sub1_Sub3_Sub2) this).anInt11915 != 0) {
	    ((Class163_Sub1_Sub3_Sub2) this).aClass173_Sub1_Sub1_11914
		.method10353(((Class163_Sub1_Sub3_Sub2) this).anInt11915);
	    ((Class163_Sub1_Sub3_Sub2) this).anInt11915 = 0;
	}
    }
    
    void method10798() throws Throwable {
	super.finalize();
	method115();
    }
    
    void method10799() throws Throwable {
	super.finalize();
	method115();
    }
    
    public int method2076() {
	return ((Class163_Sub1_Sub3_Sub2) this).anInt11917;
    }
    
    void method10800() throws Throwable {
	super.finalize();
	method115();
    }
    
    public void method8905(int i, Interface19 interface19) {
	int i_28_ = 1 << i;
	Interface53 interface53 = (Interface53) interface19;
	if (interface19 != null) {
	    if (((Class163_Sub1_Sub3_Sub2) this).anInt11920 != 0) {
		if ((((Class163_Sub1_Sub3_Sub2) this).anInt11916
		     != interface53.method1())
		    || (((Class163_Sub1_Sub3_Sub2) this).anInt11917
			!= interface53.method68()))
		    throw new RuntimeException();
	    } else {
		((Class163_Sub1_Sub3_Sub2) this).anInt11917
		    = interface53.method68();
		((Class163_Sub1_Sub3_Sub2) this).anInt11916
		    = interface53.method1();
		method10402();
	    }
	    ((Class163_Sub1_Sub3_Sub2) this).anInt11920 |= i_28_;
	    ((Class163_Sub1_Sub3_Sub2) this).anInterface53Array11919[i]
		= interface53;
	} else {
	    ((Class163_Sub1_Sub3_Sub2) this).anInt11920 &= i_28_ ^ 0xffffffff;
	    ((Class163_Sub1_Sub3_Sub2) this).anInterface53Array11919[i] = null;
	    if (((Class163_Sub1_Sub3_Sub2) this).anInt11920 == 0) {
		((Class163_Sub1_Sub3_Sub2) this).anInt11917 = 0;
		((Class163_Sub1_Sub3_Sub2) this).anInt11916 = 0;
	    }
	}
	if (this == ((Class163_Sub1_Sub3_Sub2) this)
			.aClass173_Sub1_Sub1_11914.method2403((byte) -54))
	    method10794(i);
	else
	    ((Class163_Sub1_Sub3_Sub2) this).anInt11913 |= i_28_;
    }
    
    public int method2071() {
	return ((Class163_Sub1_Sub3_Sub2) this).anInt11917;
    }
    
    public void method8906(Interface21 interface21) {
	Interface53 interface53 = (Interface53) interface21;
	if (interface21 != null) {
	    if (((Class163_Sub1_Sub3_Sub2) this).anInt11920 != 0) {
		if ((((Class163_Sub1_Sub3_Sub2) this).anInt11916
		     != interface53.method1())
		    || (((Class163_Sub1_Sub3_Sub2) this).anInt11917
			!= interface53.method68()))
		    throw new RuntimeException();
	    } else {
		((Class163_Sub1_Sub3_Sub2) this).anInt11917
		    = interface53.method68();
		((Class163_Sub1_Sub3_Sub2) this).anInt11916
		    = interface53.method1();
		method10402();
	    }
	    ((Class163_Sub1_Sub3_Sub2) this).anInt11920 |= 0x10;
	    ((Class163_Sub1_Sub3_Sub2) this).anInterface53_11921 = interface53;
	} else {
	    ((Class163_Sub1_Sub3_Sub2) this).anInt11920 &= ~0x10;
	    ((Class163_Sub1_Sub3_Sub2) this).anInterface53_11921 = null;
	    if (((Class163_Sub1_Sub3_Sub2) this).anInt11920 == 0) {
		((Class163_Sub1_Sub3_Sub2) this).anInt11917 = 0;
		((Class163_Sub1_Sub3_Sub2) this).anInt11916 = 0;
	    }
	}
	if (this == ((Class163_Sub1_Sub3_Sub2) this)
			.aClass173_Sub1_Sub1_11914.method2403((byte) -60))
	    method10795();
	else
	    ((Class163_Sub1_Sub3_Sub2) this).anInt11913 |= 0x10;
    }
    
    void method10801(int i) {
	Interface53 interface53
	    = ((Class163_Sub1_Sub3_Sub2) this).anInterface53Array11919[i];
	if (interface53 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
	else
	    interface53.method66(36064 + i);
    }
    
    boolean method339() {
	OpenGL.glBindFramebufferEXT(36160, (((Class163_Sub1_Sub3_Sub2) this)
					    .anInt11915));
	for (int i = 0; i < 4; i++) {
	    if ((((Class163_Sub1_Sub3_Sub2) this).anInt11913 & 1 << i) != 0)
		method10794(i);
	}
	if ((((Class163_Sub1_Sub3_Sub2) this).anInt11913 & 0x10) != 0)
	    method10795();
	((Class163_Sub1_Sub3_Sub2) this).anInt11913 = 0;
	return super.method335();
    }
}
