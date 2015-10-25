/* Class278 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.ActionEvent;

public class Class278
{
    Class528_Sub22[] aClass528_Sub22Array3047;
    Interface27 anInterface27_3048;
    Class692 aClass692_3049;
    public static String aString3050;
    static long aLong3051;
    static int anInt3052;
    
    public Class278(int i, Interface27 interface27) {
	int i_0_;
	for (i_0_ = 1; i_0_ < i; i_0_ += i_0_) {
	    /* empty */
	}
	((Class278) this).aClass692_3049 = new Class692(i_0_);
	((Class278) this).aClass528_Sub22Array3047 = new Class528_Sub22[i_0_];
	((Class278) this).anInterface27_3048 = interface27;
    }
    
    public Class528_Sub22 method3723(String string, int i) {
	long l = ((Class278) this).anInterface27_3048.method145(string,
								-823869218);
	for (Class528_Sub22 class528_sub22
		 = ((Class528_Sub22)
		    ((Class278) this).aClass692_3049.method8137(l));
	     null != class528_sub22;
	     class528_sub22 = (Class528_Sub22) ((Class278) this)
						   .aClass692_3049
						   .method8143((short) 255)) {
	    if (((Class528_Sub22) class528_sub22).aString10410.equals(string))
		return class528_sub22;
	}
	return null;
    }
    
    void method3724(int i, int i_1_) {
	Class528_Sub22 class528_sub22 = method3725(i, (byte) -123);
	if (class528_sub22 != null) {
	    class528_sub22.method6443(-917759335);
	    ((Class278) this).aClass528_Sub22Array3047
		[((Class528_Sub22) class528_sub22).anInt10409 * 96165105]
		= null;
	}
    }
    
    public Class528_Sub22 method3725(int i, byte i_2_) {
	if (i >= ((Class278) this).aClass528_Sub22Array3047.length)
	    return null;
	return ((Class278) this).aClass528_Sub22Array3047[i];
    }
    
    public void method3726(int i, String string, Class528_Sub22 class528_sub22,
			   int i_3_) {
	Class528_Sub22 class528_sub22_4_ = method3723(string, -1461715875);
	if (class528_sub22_4_ != null
	    && 96165105 * ((Class528_Sub22) class528_sub22_4_).anInt10409 != i)
	    throw new IllegalArgumentException(string);
	method3724(i, -917482926);
	if (i >= ((Class278) this).aClass528_Sub22Array3047.length) {
	    int i_5_;
	    for (i_5_ = ((Class278) this).aClass528_Sub22Array3047.length;
		 i >= i_5_; i_5_ += i_5_) {
		/* empty */
	    }
	    ((Class278) this).aClass692_3049 = new Class692(i_5_);
	    for (int i_6_ = 0;
		 i_6_ < ((Class278) this).aClass528_Sub22Array3047.length;
		 i_6_++) {
		Class528_Sub22 class528_sub22_7_
		    = ((Class278) this).aClass528_Sub22Array3047[i_6_];
		if (null != class528_sub22_7_)
		    ((Class278) this).aClass692_3049.method8142
			(class528_sub22_7_,
			 class528_sub22_7_.aLong7107 * -4849232331708333273L);
	    }
	    Class528_Sub22[] class528_sub22s = new Class528_Sub22[i_5_];
	    for (int i_8_ = 0;
		 i_8_ < ((Class278) this).aClass528_Sub22Array3047.length;
		 i_8_++)
		class528_sub22s[i_8_]
		    = ((Class278) this).aClass528_Sub22Array3047[i_8_];
	    ((Class278) this).aClass528_Sub22Array3047 = class528_sub22s;
	}
	((Class528_Sub22) class528_sub22).anInt10409 = -1609821167 * i;
	((Class528_Sub22) class528_sub22).aString10410 = string;
	((Class278) this).aClass692_3049.method8142
	    (class528_sub22,
	     ((Class278) this).anInterface27_3048.method145(string,
							    352563127));
	((Class278) this).aClass528_Sub22Array3047[i] = class528_sub22;
    }
    
    void method3727(int i) {
	Class528_Sub22 class528_sub22 = method3725(i, (byte) -51);
	if (class528_sub22 != null) {
	    class528_sub22.method6443(-1884340574);
	    ((Class278) this).aClass528_Sub22Array3047
		[((Class528_Sub22) class528_sub22).anInt10409 * 96165105]
		= null;
	}
    }
    
    void method3728(int i) {
	Class528_Sub22 class528_sub22 = method3725(i, (byte) -127);
	if (class528_sub22 != null) {
	    class528_sub22.method6443(-305829908);
	    ((Class278) this).aClass528_Sub22Array3047
		[((Class528_Sub22) class528_sub22).anInt10409 * 96165105]
		= null;
	}
    }
    
    static void method3729(Object object, int i) {
	if (null != Class473.anEventQueue5427) {
	    for (int i_9_ = 0;
		 i_9_ < 50 && Class473.anEventQueue5427.peekEvent() != null;
		 i_9_++)
		Class511_Sub1.method9241(1L);
	    try {
		if (null != object)
		    Class473.anEventQueue5427
			.postEvent(new ActionEvent(object, 1001, "dummy"));
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    static final void method3730(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	class229.anInt2400
	    = (((Class648) class648).anIntArray8394
	       [((Class648) class648).anInt8395 * 717927929]) * -1495465883;
	if (class229.anInt2400 * -1014124179
	    > (class229.anInt2402 * -1428356149
	       - -1352480433 * class229.anInt2476))
	    class229.anInt2400 = (class229.anInt2402 * 1366392599
				  - class229.anInt2476 * 892103723);
	if (-1014124179 * class229.anInt2400 < 0)
	    class229.anInt2400 = 0;
	class229.anInt2401
	    = -547625865 * (((Class648) class648).anIntArray8394
			    [((Class648) class648).anInt8395 * 717927929 + 1]);
	if (class229.anInt2401 * 1665217863
	    > (-1002099957 * class229.anInt2437
	       - 1661025435 * class229.anInt2458))
	    class229.anInt2401 = (class229.anInt2437 * -1201287651
				  - class229.anInt2458 * -1348061171);
	if (1665217863 * class229.anInt2401 < 0)
	    class229.anInt2401 = 0;
	Class39.method811(class229, 1435904523);
	if (-1 == 1835803215 * class229.anInt2377 && !class226.aBool2335)
	    Class649.method7734(306930455 * class229.anInt2376, 639429835);
    }
    
    public static void method3731(Class642 class642, int i) {
	if (((Class642) class642).aClass359_8275 == Class359.aClass359_3826)
	    Class641.aClass364_8273 = new Class364_Sub1(class642);
	else if (((Class642) class642).aClass359_8275
		 == Class359.aClass359_3825)
	    Class641.aClass364_8273 = new Class364_Sub2(class642);
	else
	    throw new RuntimeException();
    }
}
