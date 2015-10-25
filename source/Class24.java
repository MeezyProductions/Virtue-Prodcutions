/* Class24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class24
{
    static final int anInt230 = 7;
    static final int anInt231 = 127;
    
    Class24() throws Throwable {
	throw new Error();
    }
    
    static void method698(int i) {
	for (Class528_Sub21_Sub5 class528_sub21_sub5
		 = ((Class528_Sub21_Sub5)
		    Class28.aClass679_276.method7960(-1550587110));
	     null != class528_sub21_sub5;
	     class528_sub21_sub5
		 = ((Class528_Sub21_Sub5)
		    Class28.aClass679_276.method7969(1937111734))) {
	    if ((942428025
		 * ((Class528_Sub21_Sub5) class528_sub21_sub5).anInt11534)
		> 1) {
		((Class528_Sub21_Sub5) class528_sub21_sub5).anInt11534 = 0;
		Class28.aClass186_279.method2729(class528_sub21_sub5,
						 ((((Class528_Sub21_Sub11)
						    (Class528_Sub21_Sub11)
						    (((Class528_Sub21_Sub5)
						      class528_sub21_sub5)
						     .aClass679_11535
						     .aClass528_Sub21_8561
						     .aClass528_Sub21_10408))
						   .aLong11587)
						  * 5093272884019756687L));
		((Class528_Sub21_Sub5) class528_sub21_sub5).aClass679_11535
		    .method7961(-2104926281);
	    }
	}
	Class28.anInt261 = 0;
	Class28.anInt303 = 0;
	Class28.aClass688_274.method8059((byte) -10);
	Class28.aClass692_275.method8141(2048589549);
	Class28.aClass679_276.method7961(-1246818333);
	Class262.method3647(Class28.aClass528_Sub21_Sub11_259, (byte) -42);
    }
    
    public static void method699(int i) {
	Class40.aClass151_522 = null;
	Class638.aClass151_8253 = null;
	Class444.aClass151_4916 = null;
	Class284.aClass151_3119 = null;
	Class528_Sub41.aClass151_10651 = null;
	Class528_Sub21_Sub14.aClass151_11631 = null;
	Class80.aClass151_815 = null;
	Class235.aClass151_2594 = null;
	Class196.aClass172_2199 = null;
	Class5.aClass1_121 = null;
    }
    
    static final void method700(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	if ((((Class648) class648).anIntArray8394
	     [717927929 * ((Class648) class648).anInt8395])
	    < (((Class648) class648).anIntArray8394
	       [717927929 * ((Class648) class648).anInt8395 + 1]))
	    ((Class648) class648).anInt8390
		+= ((((Class648) class648).anIntArray8414
		     [-630179809 * ((Class648) class648).anInt8390])
		    * 1888568287);
    }
    
    static final void method701(Class648 class648, byte i) {
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = ((Player)
	       ((Class648) class648).aClass645_Sub1_Sub5_Sub1_8389)
		  .method10929(true, (short) -2251);
    }
    
    static void method702(int i) {
	if (null != Class315.aFileOutputStream3446) {
	    try {
		Class315.aFileOutputStream3446.close();
	    } catch (IOException ioexception) {
		/* empty */
	    }
	}
	Class315.aFileOutputStream3446 = null;
    }
    
    static final void method703(Class648 class648, byte i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class109 class109 = Class591.method7078((byte) 20);
	Class528_Sub34 class528_sub34
	    = Class656.method7845(OutgoingOpcode.aClass403_4538,
				  class109.aClass10_1379, -2123115073);
	class528_sub34.aClass528_Sub42_Sub2_10481.writeByte(0, (byte) -38);
	int i_1_ = (-185904669
		    * class528_sub34.aClass528_Sub42_Sub2_10481.pointer);
	class528_sub34.aClass528_Sub42_Sub2_10481.writeByte(i_0_, (byte) -49);
	class528_sub34.aClass528_Sub42_Sub2_10481.method9717
	    (((Class648) class648).aClass387_8404.anInt4071 * -1007414517,
	     (byte) 22);
	((Class648) class648).aClass387_8404.aClass528_Sub21_Sub4_4070
	    .method10473
	    (class528_sub34.aClass528_Sub42_Sub2_10481,
	     ((Class648) class648).aClass387_8404.anIntArray4072, -803135424);
	class528_sub34.aClass528_Sub42_Sub2_10481.method9662
	    ((class528_sub34.aClass528_Sub42_Sub2_10481.pointer * -185904669
	      - i_1_),
	     (byte) 127);
	class109.method1380(class528_sub34, 2137414819);
    }
}
