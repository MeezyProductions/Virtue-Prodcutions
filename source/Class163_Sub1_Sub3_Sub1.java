/* Class163_Sub1_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class163_Sub1_Sub3_Sub1 extends Class163_Sub1_Sub3
{
    int anInt11905;
    Class173_Sub1_Sub2 aClass173_Sub1_Sub2_11906;
    int anInt11907;
    int anInt11908;
    Interface51[] anInterface51Array11909;
    boolean aBool11910;
    Interface48 anInterface48_11911 = null;
    static final int anInt11912 = 16;
    
    boolean method2080() {
	for (int i = 1; i < 4; i++) {
	    Interface51 interface51
		= ((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[i];
	    if (interface51 != null)
		method10785(i, 0L);
	}
	if (((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911 != null)
	    method10787(0L);
	((Class163_Sub1_Sub3_Sub1) this).aBool11910 = false;
	return true;
    }
    
    public int method2074() {
	return ((Class163_Sub1_Sub3_Sub1) this).anInt11907;
    }
    
    boolean method335() {
	for (int i = 0; i < 4; i++) {
	    Interface51 interface51
		= ((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[i];
	    if (interface51 != null) {
		long l = interface51.method75();
		method10785(i, l);
	    }
	}
	if (((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911 != null)
	    method10787(((Class163_Sub1_Sub3_Sub1) this)
			    .anInterface48_11911.method75());
	((Class163_Sub1_Sub3_Sub1) this).aBool11910 = true;
	return super.method335();
    }
    
    public void method8907(Interface21 interface21) {
	Interface48 interface48 = (Interface48) interface21;
	if (interface21 != null) {
	    if (((Class163_Sub1_Sub3_Sub1) this).anInt11905 != 0) {
		if ((((Class163_Sub1_Sub3_Sub1) this).anInt11907
		     != interface48.method1())
		    || (((Class163_Sub1_Sub3_Sub1) this).anInt11908
			!= interface48.method68()))
		    throw new RuntimeException();
	    } else {
		((Class163_Sub1_Sub3_Sub1) this).anInt11908
		    = interface48.method68();
		((Class163_Sub1_Sub3_Sub1) this).anInt11907
		    = interface48.method1();
		method10402();
	    }
	    ((Class163_Sub1_Sub3_Sub1) this).anInt11905 |= 0x10;
	    ((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911 = interface48;
	    if (((Class163_Sub1_Sub3_Sub1) this).aBool11910)
		method10787(interface48.method75());
	} else {
	    ((Class163_Sub1_Sub3_Sub1) this).anInt11905 &= ~0x10;
	    ((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911 = null;
	    if (((Class163_Sub1_Sub3_Sub1) this).aBool11910)
		method10787(0L);
	    if (((Class163_Sub1_Sub3_Sub1) this).anInt11905 == 0) {
		((Class163_Sub1_Sub3_Sub1) this).anInt11908 = 0;
		((Class163_Sub1_Sub3_Sub1) this).anInt11907 = 0;
	    }
	}
    }
    
    public void method8898(int i, Interface19 interface19) {
	int i_0_ = 1 << i;
	Interface51 interface51 = (Interface51) interface19;
	if (interface19 != null) {
	    if (((Class163_Sub1_Sub3_Sub1) this).anInt11905 != 0) {
		if ((((Class163_Sub1_Sub3_Sub1) this).anInt11907
		     != interface51.method1())
		    || (((Class163_Sub1_Sub3_Sub1) this).anInt11908
			!= interface51.method68()))
		    throw new RuntimeException();
	    } else {
		((Class163_Sub1_Sub3_Sub1) this).anInt11908
		    = interface51.method68();
		((Class163_Sub1_Sub3_Sub1) this).anInt11907
		    = interface51.method1();
		method10402();
	    }
	    ((Class163_Sub1_Sub3_Sub1) this).anInt11905 |= i_0_;
	    ((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[i]
		= interface51;
	    if (((Class163_Sub1_Sub3_Sub1) this).aBool11910)
		method10785(i, interface51.method75());
	} else {
	    ((Class163_Sub1_Sub3_Sub1) this).anInt11905 &= i_0_ ^ 0xffffffff;
	    ((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[i] = null;
	    if (((Class163_Sub1_Sub3_Sub1) this).aBool11910)
		method10785(i, 0L);
	    if (((Class163_Sub1_Sub3_Sub1) this).anInt11905 == 0) {
		((Class163_Sub1_Sub3_Sub1) this).anInt11908 = 0;
		((Class163_Sub1_Sub3_Sub1) this).anInt11907 = 0;
	    }
	}
    }
    
    boolean method10785(int i, long l) {
	return Class360.method4593(IDirect3DDevice.SetRenderTarget
				   (((Class173_Sub1_Sub2)
				     (((Class163_Sub1_Sub3_Sub1) this)
				      .aClass173_Sub1_Sub2_11906)).aLong11378,
				    i, l));
    }
    
    void method10786() {
	if (((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911 != null)
	    ((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911.method195();
	for (int i = 0; i < (((Class163_Sub1_Sub3_Sub1) this)
			     .anInterface51Array11909).length; i++) {
	    if (((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[i]
		!= null)
		((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[i]
		    .method195();
	}
    }
    
    public boolean method8897() {
	return (((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[0]
		!= null);
    }
    
    boolean method10787(long l) {
	return Class360.method4593(IDirect3DDevice.SetDepthStencilSurface
				   (((Class173_Sub1_Sub2)
				     (((Class163_Sub1_Sub3_Sub1) this)
				      .aClass173_Sub1_Sub2_11906)).aLong11378,
				    l));
    }
    
    boolean method2072() {
	for (int i = 1; i < 4; i++) {
	    Interface51 interface51
		= ((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[i];
	    if (interface51 != null)
		method10785(i, 0L);
	}
	if (((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911 != null)
	    method10787(0L);
	((Class163_Sub1_Sub3_Sub1) this).aBool11910 = false;
	return true;
    }
    
    public void method8900(int i, int i_1_, int i_2_, int i_3_, int i_4_,
			   int i_5_, boolean bool, boolean bool_6_) {
	if (bool) {
	    long l = (IDirect3DDevice.GetRenderTarget
		      ((((Class173_Sub1_Sub2) (((Class163_Sub1_Sub3_Sub1) this)
					       .aClass173_Sub1_Sub2_11906))
			.aLong11378),
		       0));
	    IDirect3DDevice.StretchRect((((Class173_Sub1_Sub2)
					  (((Class163_Sub1_Sub3_Sub1) this)
					   .aClass173_Sub1_Sub2_11906))
					 .aLong11378),
					((Class163_Sub1_Sub3_Sub1) this)
					    .anInterface51Array11909[0]
					    .method75(),
					i, i_1_, i_2_, i_3_, l, i_4_, i_5_,
					i_2_, i_3_, 0);
	    IUnknown.Release(l);
	}
    }
    
    public void method115() {
	if (((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911 != null)
	    ((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911.method115();
	for (int i = 0; i < (((Class163_Sub1_Sub3_Sub1) this)
			     .anInterface51Array11909).length; i++) {
	    if (((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[i]
		!= null)
		((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[i]
		    .method115();
	}
    }
    
    void method10788() {
	if (((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911 != null)
	    ((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911.method195();
	for (int i = 0; i < (((Class163_Sub1_Sub3_Sub1) this)
			     .anInterface51Array11909).length; i++) {
	    if (((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[i]
		!= null)
		((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[i]
		    .method195();
	}
    }
    
    public int method2076() {
	return ((Class163_Sub1_Sub3_Sub1) this).anInt11908;
    }
    
    public int method2069() {
	return ((Class163_Sub1_Sub3_Sub1) this).anInt11907;
    }
    
    public int method2073() {
	return ((Class163_Sub1_Sub3_Sub1) this).anInt11907;
    }
    
    public int method2075() {
	return ((Class163_Sub1_Sub3_Sub1) this).anInt11907;
    }
    
    public void method8905(int i, Interface19 interface19) {
	int i_7_ = 1 << i;
	Interface51 interface51 = (Interface51) interface19;
	if (interface19 != null) {
	    if (((Class163_Sub1_Sub3_Sub1) this).anInt11905 != 0) {
		if ((((Class163_Sub1_Sub3_Sub1) this).anInt11907
		     != interface51.method1())
		    || (((Class163_Sub1_Sub3_Sub1) this).anInt11908
			!= interface51.method68()))
		    throw new RuntimeException();
	    } else {
		((Class163_Sub1_Sub3_Sub1) this).anInt11908
		    = interface51.method68();
		((Class163_Sub1_Sub3_Sub1) this).anInt11907
		    = interface51.method1();
		method10402();
	    }
	    ((Class163_Sub1_Sub3_Sub1) this).anInt11905 |= i_7_;
	    ((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[i]
		= interface51;
	    if (((Class163_Sub1_Sub3_Sub1) this).aBool11910)
		method10785(i, interface51.method75());
	} else {
	    ((Class163_Sub1_Sub3_Sub1) this).anInt11905 &= i_7_ ^ 0xffffffff;
	    ((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[i] = null;
	    if (((Class163_Sub1_Sub3_Sub1) this).aBool11910)
		method10785(i, 0L);
	    if (((Class163_Sub1_Sub3_Sub1) this).anInt11905 == 0) {
		((Class163_Sub1_Sub3_Sub1) this).anInt11908 = 0;
		((Class163_Sub1_Sub3_Sub1) this).anInt11907 = 0;
	    }
	}
    }
    
    Class163_Sub1_Sub3_Sub1(Class173_Sub1_Sub2 class173_sub1_sub2) {
	super((Class173_Sub1) class173_sub1_sub2);
	((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909
	    = new Interface51[4];
	((Class163_Sub1_Sub3_Sub1) this).aClass173_Sub1_Sub2_11906
	    = class173_sub1_sub2;
    }
    
    public int method2071() {
	return ((Class163_Sub1_Sub3_Sub1) this).anInt11908;
    }
    
    public boolean method8902() {
	return (((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[0]
		!= null);
    }
    
    public void finalize() throws Throwable {
	method10788();
	super.finalize();
    }
    
    boolean method338() {
	for (int i = 0; i < 4; i++) {
	    Interface51 interface51
		= ((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[i];
	    if (interface51 != null) {
		long l = interface51.method75();
		method10785(i, l);
	    }
	}
	if (((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911 != null)
	    method10787(((Class163_Sub1_Sub3_Sub1) this)
			    .anInterface48_11911.method75());
	((Class163_Sub1_Sub3_Sub1) this).aBool11910 = true;
	return super.method335();
    }
    
    boolean method2077() {
	for (int i = 1; i < 4; i++) {
	    Interface51 interface51
		= ((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[i];
	    if (interface51 != null)
		method10785(i, 0L);
	}
	if (((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911 != null)
	    method10787(0L);
	((Class163_Sub1_Sub3_Sub1) this).aBool11910 = false;
	return true;
    }
    
    boolean method2078() {
	for (int i = 1; i < 4; i++) {
	    Interface51 interface51
		= ((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[i];
	    if (interface51 != null)
		method10785(i, 0L);
	}
	if (((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911 != null)
	    method10787(0L);
	((Class163_Sub1_Sub3_Sub1) this).aBool11910 = false;
	return true;
    }
    
    boolean method2079() {
	for (int i = 1; i < 4; i++) {
	    Interface51 interface51
		= ((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[i];
	    if (interface51 != null)
		method10785(i, 0L);
	}
	if (((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911 != null)
	    method10787(0L);
	((Class163_Sub1_Sub3_Sub1) this).aBool11910 = false;
	return true;
    }
    
    public boolean method8901() {
	return (((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[0]
		!= null);
    }
    
    public void method8903(int i, int i_8_, int i_9_, int i_10_, int i_11_,
			   int i_12_, boolean bool, boolean bool_13_) {
	if (bool) {
	    long l = (IDirect3DDevice.GetRenderTarget
		      ((((Class173_Sub1_Sub2) (((Class163_Sub1_Sub3_Sub1) this)
					       .aClass173_Sub1_Sub2_11906))
			.aLong11378),
		       0));
	    IDirect3DDevice.StretchRect((((Class173_Sub1_Sub2)
					  (((Class163_Sub1_Sub3_Sub1) this)
					   .aClass173_Sub1_Sub2_11906))
					 .aLong11378),
					((Class163_Sub1_Sub3_Sub1) this)
					    .anInterface51Array11909[0]
					    .method75(),
					i, i_8_, i_9_, i_10_, l, i_11_, i_12_,
					i_9_, i_10_, 0);
	    IUnknown.Release(l);
	}
    }
    
    public void method8904(int i, int i_14_, int i_15_, int i_16_, int i_17_,
			   int i_18_, boolean bool, boolean bool_19_) {
	if (bool) {
	    long l = (IDirect3DDevice.GetRenderTarget
		      ((((Class173_Sub1_Sub2) (((Class163_Sub1_Sub3_Sub1) this)
					       .aClass173_Sub1_Sub2_11906))
			.aLong11378),
		       0));
	    IDirect3DDevice.StretchRect((((Class173_Sub1_Sub2)
					  (((Class163_Sub1_Sub3_Sub1) this)
					   .aClass173_Sub1_Sub2_11906))
					 .aLong11378),
					((Class163_Sub1_Sub3_Sub1) this)
					    .anInterface51Array11909[0]
					    .method75(),
					i, i_14_, i_15_, i_16_, l, i_17_,
					i_18_, i_15_, i_16_, 0);
	    IUnknown.Release(l);
	}
    }
    
    public void method204() {
	if (((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911 != null)
	    ((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911.method115();
	for (int i = 0; i < (((Class163_Sub1_Sub3_Sub1) this)
			     .anInterface51Array11909).length; i++) {
	    if (((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[i]
		!= null)
		((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[i]
		    .method115();
	}
    }
    
    public void method8899(Interface21 interface21) {
	Interface48 interface48 = (Interface48) interface21;
	if (interface21 != null) {
	    if (((Class163_Sub1_Sub3_Sub1) this).anInt11905 != 0) {
		if ((((Class163_Sub1_Sub3_Sub1) this).anInt11907
		     != interface48.method1())
		    || (((Class163_Sub1_Sub3_Sub1) this).anInt11908
			!= interface48.method68()))
		    throw new RuntimeException();
	    } else {
		((Class163_Sub1_Sub3_Sub1) this).anInt11908
		    = interface48.method68();
		((Class163_Sub1_Sub3_Sub1) this).anInt11907
		    = interface48.method1();
		method10402();
	    }
	    ((Class163_Sub1_Sub3_Sub1) this).anInt11905 |= 0x10;
	    ((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911 = interface48;
	    if (((Class163_Sub1_Sub3_Sub1) this).aBool11910)
		method10787(interface48.method75());
	} else {
	    ((Class163_Sub1_Sub3_Sub1) this).anInt11905 &= ~0x10;
	    ((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911 = null;
	    if (((Class163_Sub1_Sub3_Sub1) this).aBool11910)
		method10787(0L);
	    if (((Class163_Sub1_Sub3_Sub1) this).anInt11905 == 0) {
		((Class163_Sub1_Sub3_Sub1) this).anInt11908 = 0;
		((Class163_Sub1_Sub3_Sub1) this).anInt11907 = 0;
	    }
	}
    }
    
    public void method337() {
	if (((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911 != null)
	    ((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911.method115();
	for (int i = 0; i < (((Class163_Sub1_Sub3_Sub1) this)
			     .anInterface51Array11909).length; i++) {
	    if (((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[i]
		!= null)
		((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[i]
		    .method115();
	}
    }
    
    void method10789() throws Throwable {
	method10788();
	super.finalize();
    }
    
    void method10790() throws Throwable {
	method10788();
	super.finalize();
    }
    
    void method10791() throws Throwable {
	method10788();
	super.finalize();
    }
    
    void method10792() throws Throwable {
	method10788();
	super.finalize();
    }
    
    boolean method339() {
	for (int i = 0; i < 4; i++) {
	    Interface51 interface51
		= ((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[i];
	    if (interface51 != null) {
		long l = interface51.method75();
		method10785(i, l);
	    }
	}
	if (((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911 != null)
	    method10787(((Class163_Sub1_Sub3_Sub1) this)
			    .anInterface48_11911.method75());
	((Class163_Sub1_Sub3_Sub1) this).aBool11910 = true;
	return super.method335();
    }
    
    public int method2070() {
	return ((Class163_Sub1_Sub3_Sub1) this).anInt11908;
    }
    
    public void method8906(Interface21 interface21) {
	Interface48 interface48 = (Interface48) interface21;
	if (interface21 != null) {
	    if (((Class163_Sub1_Sub3_Sub1) this).anInt11905 != 0) {
		if ((((Class163_Sub1_Sub3_Sub1) this).anInt11907
		     != interface48.method1())
		    || (((Class163_Sub1_Sub3_Sub1) this).anInt11908
			!= interface48.method68()))
		    throw new RuntimeException();
	    } else {
		((Class163_Sub1_Sub3_Sub1) this).anInt11908
		    = interface48.method68();
		((Class163_Sub1_Sub3_Sub1) this).anInt11907
		    = interface48.method1();
		method10402();
	    }
	    ((Class163_Sub1_Sub3_Sub1) this).anInt11905 |= 0x10;
	    ((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911 = interface48;
	    if (((Class163_Sub1_Sub3_Sub1) this).aBool11910)
		method10787(interface48.method75());
	} else {
	    ((Class163_Sub1_Sub3_Sub1) this).anInt11905 &= ~0x10;
	    ((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911 = null;
	    if (((Class163_Sub1_Sub3_Sub1) this).aBool11910)
		method10787(0L);
	    if (((Class163_Sub1_Sub3_Sub1) this).anInt11905 == 0) {
		((Class163_Sub1_Sub3_Sub1) this).anInt11908 = 0;
		((Class163_Sub1_Sub3_Sub1) this).anInt11907 = 0;
	    }
	}
    }
    
    void method10793() {
	if (((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911 != null)
	    ((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911.method195();
	for (int i = 0; i < (((Class163_Sub1_Sub3_Sub1) this)
			     .anInterface51Array11909).length; i++) {
	    if (((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[i]
		!= null)
		((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[i]
		    .method195();
	}
    }
    
    public void method198() {
	if (((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911 != null)
	    ((Class163_Sub1_Sub3_Sub1) this).anInterface48_11911.method115();
	for (int i = 0; i < (((Class163_Sub1_Sub3_Sub1) this)
			     .anInterface51Array11909).length; i++) {
	    if (((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[i]
		!= null)
		((Class163_Sub1_Sub3_Sub1) this).anInterface51Array11909[i]
		    .method115();
	}
    }
}
