/* Class163_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class163_Sub1_Sub1 extends Class163_Sub1
{
    int anInt11225;
    Interface13[] anInterface13Array11226 = new Interface13[4];
    int anInt11227;
    int anInt11228;
    int anInt11229;
    static final int anInt11230 = 16;
    int anInt11231;
    Interface13 anInterface13_11232;
    Class173_Sub2 aClass173_Sub2_11233;
    
    public void method8899(Interface21 interface21) {
	Interface13 interface13 = (Interface13) interface21;
	if (interface21 != null) {
	    if ((((Class163_Sub1_Sub1) this).anInt11228 | 0x10) != 16) {
		if ((((Class163_Sub1_Sub1) this).anInt11225
		     != interface13.method1())
		    || (((Class163_Sub1_Sub1) this).anInt11229
			!= interface13.method68()))
		    throw new RuntimeException();
	    } else {
		((Class163_Sub1_Sub1) this).anInt11229
		    = interface13.method68();
		((Class163_Sub1_Sub1) this).anInt11225 = interface13.method1();
		if (this == ((Class163_Sub1_Sub1) this)
				.aClass173_Sub2_11233.method2403((byte) -33))
		    ((Class163_Sub1_Sub1) this).aClass173_Sub2_11233
			.method8742();
	    }
	    ((Class163_Sub1_Sub1) this).anInt11228 |= 0x10;
	    ((Class163_Sub1_Sub1) this).anInterface13_11232 = interface13;
	} else {
	    ((Class163_Sub1_Sub1) this).anInt11228 &= ~0x10;
	    ((Class163_Sub1_Sub1) this).anInterface13_11232 = null;
	    if (((Class163_Sub1_Sub1) this).anInt11228 == 0) {
		((Class163_Sub1_Sub1) this).anInt11229 = 0;
		((Class163_Sub1_Sub1) this).anInt11225 = 0;
	    }
	}
	if (this == ((Class163_Sub1_Sub1) this).aClass173_Sub2_11233
			.method2403((byte) -94))
	    method10326();
	else
	    ((Class163_Sub1_Sub1) this).anInt11231 |= 0x10;
    }
    
    public int method2074() {
	return ((Class163_Sub1_Sub1) this).anInt11225;
    }
    
    public void method8906(Interface21 interface21) {
	Interface13 interface13 = (Interface13) interface21;
	if (interface21 != null) {
	    if ((((Class163_Sub1_Sub1) this).anInt11228 | 0x10) != 16) {
		if ((((Class163_Sub1_Sub1) this).anInt11225
		     != interface13.method1())
		    || (((Class163_Sub1_Sub1) this).anInt11229
			!= interface13.method68()))
		    throw new RuntimeException();
	    } else {
		((Class163_Sub1_Sub1) this).anInt11229
		    = interface13.method68();
		((Class163_Sub1_Sub1) this).anInt11225 = interface13.method1();
		if (this == ((Class163_Sub1_Sub1) this)
				.aClass173_Sub2_11233.method2403((byte) -2))
		    ((Class163_Sub1_Sub1) this).aClass173_Sub2_11233
			.method8742();
	    }
	    ((Class163_Sub1_Sub1) this).anInt11228 |= 0x10;
	    ((Class163_Sub1_Sub1) this).anInterface13_11232 = interface13;
	} else {
	    ((Class163_Sub1_Sub1) this).anInt11228 &= ~0x10;
	    ((Class163_Sub1_Sub1) this).anInterface13_11232 = null;
	    if (((Class163_Sub1_Sub1) this).anInt11228 == 0) {
		((Class163_Sub1_Sub1) this).anInt11229 = 0;
		((Class163_Sub1_Sub1) this).anInt11225 = 0;
	    }
	}
	if (this == ((Class163_Sub1_Sub1) this).aClass173_Sub2_11233
			.method2403((byte) -105))
	    method10326();
	else
	    ((Class163_Sub1_Sub1) this).anInt11231 |= 0x10;
    }
    
    public void method8898(int i, Interface19 interface19) {
	int i_0_ = 1 << i;
	Interface13 interface13 = (Interface13) interface19;
	if (interface19 != null) {
	    if ((((Class163_Sub1_Sub1) this).anInt11228 | i_0_) != i_0_) {
		if ((((Class163_Sub1_Sub1) this).anInt11225
		     != interface13.method1())
		    || (((Class163_Sub1_Sub1) this).anInt11229
			!= interface13.method68()))
		    throw new RuntimeException();
	    } else {
		((Class163_Sub1_Sub1) this).anInt11229
		    = interface13.method68();
		((Class163_Sub1_Sub1) this).anInt11225 = interface13.method1();
		if (this == ((Class163_Sub1_Sub1) this)
				.aClass173_Sub2_11233.method2403((byte) -54))
		    ((Class163_Sub1_Sub1) this).aClass173_Sub2_11233
			.method8742();
	    }
	    ((Class163_Sub1_Sub1) this).anInt11228 |= i_0_;
	    ((Class163_Sub1_Sub1) this).anInterface13Array11226[i]
		= interface13;
	} else {
	    ((Class163_Sub1_Sub1) this).anInt11228 &= i_0_ ^ 0xffffffff;
	    ((Class163_Sub1_Sub1) this).anInterface13Array11226[i] = null;
	    if (((Class163_Sub1_Sub1) this).anInt11228 == 0) {
		((Class163_Sub1_Sub1) this).anInt11229 = 0;
		((Class163_Sub1_Sub1) this).anInt11225 = 0;
	    }
	}
	if (this == ((Class163_Sub1_Sub1) this).aClass173_Sub2_11233
			.method2403((byte) -25))
	    method10325(i);
	else
	    ((Class163_Sub1_Sub1) this).anInt11231 |= i_0_;
    }
    
    public void method8907(Interface21 interface21) {
	Interface13 interface13 = (Interface13) interface21;
	if (interface21 != null) {
	    if ((((Class163_Sub1_Sub1) this).anInt11228 | 0x10) != 16) {
		if ((((Class163_Sub1_Sub1) this).anInt11225
		     != interface13.method1())
		    || (((Class163_Sub1_Sub1) this).anInt11229
			!= interface13.method68()))
		    throw new RuntimeException();
	    } else {
		((Class163_Sub1_Sub1) this).anInt11229
		    = interface13.method68();
		((Class163_Sub1_Sub1) this).anInt11225 = interface13.method1();
		if (this == ((Class163_Sub1_Sub1) this)
				.aClass173_Sub2_11233.method2403((byte) -43))
		    ((Class163_Sub1_Sub1) this).aClass173_Sub2_11233
			.method8742();
	    }
	    ((Class163_Sub1_Sub1) this).anInt11228 |= 0x10;
	    ((Class163_Sub1_Sub1) this).anInterface13_11232 = interface13;
	} else {
	    ((Class163_Sub1_Sub1) this).anInt11228 &= ~0x10;
	    ((Class163_Sub1_Sub1) this).anInterface13_11232 = null;
	    if (((Class163_Sub1_Sub1) this).anInt11228 == 0) {
		((Class163_Sub1_Sub1) this).anInt11229 = 0;
		((Class163_Sub1_Sub1) this).anInt11225 = 0;
	    }
	}
	if (this == ((Class163_Sub1_Sub1) this).aClass173_Sub2_11233
			.method2403((byte) -27))
	    method10326();
	else
	    ((Class163_Sub1_Sub1) this).anInt11231 |= 0x10;
    }
    
    void method10325(int i) {
	Interface13 interface13
	    = ((Class163_Sub1_Sub1) this).anInterface13Array11226[i];
	if (interface13 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
	else
	    interface13.method66(36064 + i);
    }
    
    void method10326() {
	if (((Class163_Sub1_Sub1) this).anInterface13_11232 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
	else
	    ((Class163_Sub1_Sub1) this).anInterface13_11232.method66(36096);
    }
    
    public boolean method8897() {
	int i = OpenGL.glCheckFramebufferStatusEXT(36160);
	if (i != 36053)
	    return false;
	return true;
    }
    
    boolean method335() {
	OpenGL.glBindFramebufferEXT(36160,
				    ((Class163_Sub1_Sub1) this).anInt11227);
	for (int i = 0; i < 4; i++) {
	    if ((((Class163_Sub1_Sub1) this).anInt11231 & 1 << i) != 0)
		method10325(i);
	}
	if ((((Class163_Sub1_Sub1) this).anInt11231 & 0x10) != 0)
	    method10326();
	((Class163_Sub1_Sub1) this).anInt11231 = 0;
	((Class163_Sub1_Sub1) this).aClass173_Sub2_11233.method8741();
	return true;
    }
    
    boolean method2072() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    void method10327(int i) {
	OpenGL.glDrawBuffer(36064 + i);
    }
    
    Class163_Sub1_Sub1(Class173_Sub2 class173_sub2) {
	if (!((Class173_Sub2) class173_sub2).aBool9506)
	    throw new IllegalStateException("");
	((Class163_Sub1_Sub1) this).aClass173_Sub2_11233 = class173_sub2;
	int[] is = new int[1];
	OpenGL.glGenFramebuffersEXT(1, is, 0);
	((Class163_Sub1_Sub1) this).anInt11227 = is[0];
    }
    
    public void method115() {
	if (((Class163_Sub1_Sub1) this).anInt11227 != 0) {
	    ((Class163_Sub1_Sub1) this).aClass173_Sub2_11233
		.method8827(((Class163_Sub1_Sub1) this).anInt11227);
	    ((Class163_Sub1_Sub1) this).anInt11227 = 0;
	}
    }
    
    public void finalize() throws Throwable {
	super.finalize();
	method115();
    }
    
    public int method2069() {
	return ((Class163_Sub1_Sub1) this).anInt11225;
    }
    
    public int method2073() {
	return ((Class163_Sub1_Sub1) this).anInt11225;
    }
    
    public int method2075() {
	return ((Class163_Sub1_Sub1) this).anInt11225;
    }
    
    public int method2071() {
	return ((Class163_Sub1_Sub1) this).anInt11229;
    }
    
    public int method2076() {
	return ((Class163_Sub1_Sub1) this).anInt11229;
    }
    
    public int method2070() {
	return ((Class163_Sub1_Sub1) this).anInt11229;
    }
    
    public boolean method8902() {
	int i = OpenGL.glCheckFramebufferStatusEXT(36160);
	if (i != 36053)
	    return false;
	return true;
    }
    
    public void method337() {
	if (((Class163_Sub1_Sub1) this).anInt11227 != 0) {
	    ((Class163_Sub1_Sub1) this).aClass173_Sub2_11233
		.method8827(((Class163_Sub1_Sub1) this).anInt11227);
	    ((Class163_Sub1_Sub1) this).anInt11227 = 0;
	}
    }
    
    boolean method338() {
	OpenGL.glBindFramebufferEXT(36160,
				    ((Class163_Sub1_Sub1) this).anInt11227);
	for (int i = 0; i < 4; i++) {
	    if ((((Class163_Sub1_Sub1) this).anInt11231 & 1 << i) != 0)
		method10325(i);
	}
	if ((((Class163_Sub1_Sub1) this).anInt11231 & 0x10) != 0)
	    method10326();
	((Class163_Sub1_Sub1) this).anInt11231 = 0;
	((Class163_Sub1_Sub1) this).aClass173_Sub2_11233.method8741();
	return true;
    }
    
    boolean method2077() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    boolean method2078() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    void method10328(int i) {
	OpenGL.glDrawBuffer(36064 + i);
    }
    
    boolean method339() {
	OpenGL.glBindFramebufferEXT(36160,
				    ((Class163_Sub1_Sub1) this).anInt11227);
	for (int i = 0; i < 4; i++) {
	    if ((((Class163_Sub1_Sub1) this).anInt11231 & 1 << i) != 0)
		method10325(i);
	}
	if ((((Class163_Sub1_Sub1) this).anInt11231 & 0x10) != 0)
	    method10326();
	((Class163_Sub1_Sub1) this).anInt11231 = 0;
	((Class163_Sub1_Sub1) this).aClass173_Sub2_11233.method8741();
	return true;
    }
    
    public void method8903(int i, int i_1_, int i_2_, int i_3_, int i_4_,
			   int i_5_, boolean bool, boolean bool_6_) {
	if (bool | bool_6_) {
	    int i_7_ = ((Class163_Sub1_Sub1) this).anInt11229;
	    int i_8_
		= ((Class163_Sub1_Sub1) this).aClass173_Sub2_11233.method2403
		      ((byte) -62).method2070();
	    int i_9_ = 0;
	    if (bool_6_)
		i_9_ |= 0x100;
	    if (bool)
		i_9_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008, (((Class163_Sub1_Sub1) this)
						.anInt11227));
	    OpenGL.glBlitFramebufferEXT(i, i_7_ - i_1_ - i_3_, i + i_2_,
					i_7_ - i_1_, i_4_, i_8_ - i_5_ - i_3_,
					i_4_ + i_2_, i_8_ - i_5_, i_9_, 9728);
	    OpenGL.glBindFramebufferEXT(36008, 0);
	}
    }
    
    void method10329() {
	if (((Class163_Sub1_Sub1) this).anInterface13_11232 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
	else
	    ((Class163_Sub1_Sub1) this).anInterface13_11232.method66(36096);
    }
    
    public void method204() {
	if (((Class163_Sub1_Sub1) this).anInt11227 != 0) {
	    ((Class163_Sub1_Sub1) this).aClass173_Sub2_11233
		.method8827(((Class163_Sub1_Sub1) this).anInt11227);
	    ((Class163_Sub1_Sub1) this).anInt11227 = 0;
	}
    }
    
    public void method198() {
	if (((Class163_Sub1_Sub1) this).anInt11227 != 0) {
	    ((Class163_Sub1_Sub1) this).aClass173_Sub2_11233
		.method8827(((Class163_Sub1_Sub1) this).anInt11227);
	    ((Class163_Sub1_Sub1) this).anInt11227 = 0;
	}
    }
    
    void method10330() throws Throwable {
	super.finalize();
	method115();
    }
    
    void method10331() throws Throwable {
	super.finalize();
	method115();
    }
    
    boolean method2080() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    void method10332() throws Throwable {
	super.finalize();
	method115();
    }
    
    public void method8900(int i, int i_10_, int i_11_, int i_12_, int i_13_,
			   int i_14_, boolean bool, boolean bool_15_) {
	if (bool | bool_15_) {
	    int i_16_ = ((Class163_Sub1_Sub1) this).anInt11229;
	    int i_17_
		= ((Class163_Sub1_Sub1) this).aClass173_Sub2_11233.method2403
		      ((byte) -38).method2070();
	    int i_18_ = 0;
	    if (bool_15_)
		i_18_ |= 0x100;
	    if (bool)
		i_18_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008, (((Class163_Sub1_Sub1) this)
						.anInt11227));
	    OpenGL.glBlitFramebufferEXT(i, i_16_ - i_10_ - i_12_, i + i_11_,
					i_16_ - i_10_, i_13_,
					i_17_ - i_14_ - i_12_, i_13_ + i_11_,
					i_17_ - i_14_, i_18_, 9728);
	    OpenGL.glBindFramebufferEXT(36008, 0);
	}
    }
    
    public void method8905(int i, Interface19 interface19) {
	int i_19_ = 1 << i;
	Interface13 interface13 = (Interface13) interface19;
	if (interface19 != null) {
	    if ((((Class163_Sub1_Sub1) this).anInt11228 | i_19_) != i_19_) {
		if ((((Class163_Sub1_Sub1) this).anInt11225
		     != interface13.method1())
		    || (((Class163_Sub1_Sub1) this).anInt11229
			!= interface13.method68()))
		    throw new RuntimeException();
	    } else {
		((Class163_Sub1_Sub1) this).anInt11229
		    = interface13.method68();
		((Class163_Sub1_Sub1) this).anInt11225 = interface13.method1();
		if (this == ((Class163_Sub1_Sub1) this)
				.aClass173_Sub2_11233.method2403((byte) -112))
		    ((Class163_Sub1_Sub1) this).aClass173_Sub2_11233
			.method8742();
	    }
	    ((Class163_Sub1_Sub1) this).anInt11228 |= i_19_;
	    ((Class163_Sub1_Sub1) this).anInterface13Array11226[i]
		= interface13;
	} else {
	    ((Class163_Sub1_Sub1) this).anInt11228 &= i_19_ ^ 0xffffffff;
	    ((Class163_Sub1_Sub1) this).anInterface13Array11226[i] = null;
	    if (((Class163_Sub1_Sub1) this).anInt11228 == 0) {
		((Class163_Sub1_Sub1) this).anInt11229 = 0;
		((Class163_Sub1_Sub1) this).anInt11225 = 0;
	    }
	}
	if (this == ((Class163_Sub1_Sub1) this).aClass173_Sub2_11233
			.method2403((byte) -37))
	    method10325(i);
	else
	    ((Class163_Sub1_Sub1) this).anInt11231 |= i_19_;
    }
    
    void method10333() throws Throwable {
	super.finalize();
	method115();
    }
    
    boolean method2079() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    void method10334(int i) {
	Interface13 interface13
	    = ((Class163_Sub1_Sub1) this).anInterface13Array11226[i];
	if (interface13 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
	else
	    interface13.method66(36064 + i);
    }
    
    void method10335() {
	if (((Class163_Sub1_Sub1) this).anInterface13_11232 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
	else
	    ((Class163_Sub1_Sub1) this).anInterface13_11232.method66(36096);
    }
    
    public boolean method8901() {
	int i = OpenGL.glCheckFramebufferStatusEXT(36160);
	if (i != 36053)
	    return false;
	return true;
    }
    
    void method10336(int i) {
	OpenGL.glDrawBuffer(36064 + i);
    }
    
    public void method8904(int i, int i_20_, int i_21_, int i_22_, int i_23_,
			   int i_24_, boolean bool, boolean bool_25_) {
	if (bool | bool_25_) {
	    int i_26_ = ((Class163_Sub1_Sub1) this).anInt11229;
	    int i_27_
		= ((Class163_Sub1_Sub1) this).aClass173_Sub2_11233.method2403
		      ((byte) -107).method2070();
	    int i_28_ = 0;
	    if (bool_25_)
		i_28_ |= 0x100;
	    if (bool)
		i_28_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008, (((Class163_Sub1_Sub1) this)
						.anInt11227));
	    OpenGL.glBlitFramebufferEXT(i, i_26_ - i_20_ - i_22_, i + i_21_,
					i_26_ - i_20_, i_23_,
					i_27_ - i_24_ - i_22_, i_23_ + i_21_,
					i_27_ - i_24_, i_28_, 9728);
	    OpenGL.glBindFramebufferEXT(36008, 0);
	}
    }
}
