/* Class528_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class528_Sub29 extends Node
{
    public static final int anInt10447 = 64;
    public static final int anInt10448 = 2;
    public static final int anInt10449 = 4;
    public static final int anInt10450 = 1;
    public static final int anInt10451 = 16;
    public static final int anInt10452 = 32;
    public static final int anInt10453 = 8;
    static Class528_Sub29 aClass528_Sub29_10454 = new Class528_Sub29(0, -1);
    public int anInt10455;
    public int anInt10456;
    
    public final int method9471() {
	return Class436.method5285(-450987711 * anInt10455, (short) -9120);
    }
    
    public final boolean method9472(int i) {
	return (-450987711 * anInt10455 & 0x1) != 0;
    }
    
    public final boolean method9473(int i, int i_0_) {
	return (-450987711 * anInt10455 >> 1 + i & 0x1) != 0;
    }
    
    public final int method9474(int i) {
	return Class436.method5285(-450987711 * anInt10455, (short) -11276);
    }
    
    public final int method9475(int i) {
	return -450987711 * anInt10455 >> 18 & 0x7;
    }
    
    public final boolean method9476(int i) {
	return (-450987711 * anInt10455 >> 21 & 0x1) != 0;
    }
    
    public final boolean method9477(int i) {
	return (-450987711 * anInt10455 >> 22 & 0x1) != 0;
    }
    
    public final boolean method9478(int i) {
	return 0 != (-450987711 * anInt10455 >> 23 & 0x1);
    }
    
    public final boolean method9479(int i) {
	return (-450987711 * anInt10455 >> 1 + i & 0x1) != 0;
    }
    
    public final boolean method9480() {
	return (-450987711 * anInt10455 & 0x1) != 0;
    }
    
    public Class528_Sub29(int i, int i_1_) {
	anInt10455 = i * 735778497;
	anInt10456 = i_1_ * 239866765;
    }
    
    public final boolean method9481(int i) {
	return (-450987711 * anInt10455 >> 1 + i & 0x1) != 0;
    }
    
    public final boolean method9482() {
	return (-450987711 * anInt10455 >> 22 & 0x1) != 0;
    }
    
    public final boolean method9483() {
	return (-450987711 * anInt10455 >> 22 & 0x1) != 0;
    }
    
    public final int method9484() {
	return -450987711 * anInt10455 >> 18 & 0x7;
    }
    
    public final int method9485() {
	return -450987711 * anInt10455 >> 18 & 0x7;
    }
    
    public final boolean method9486() {
	return (-450987711 * anInt10455 >> 21 & 0x1) != 0;
    }
    
    public final boolean method9487() {
	return (-450987711 * anInt10455 >> 21 & 0x1) != 0;
    }
    
    public final int method9488() {
	return Class436.method5285(-450987711 * anInt10455, (short) -26938);
    }
    
    public final boolean method9489() {
	return 0 != (-450987711 * anInt10455 >> 23 & 0x1);
    }
    
    public static void method9490
	(Entity class645_sub1_sub5_sub1, int[] is, int i,
	 boolean bool, int i_2_) {
	if (class645_sub1_sub5_sub1.anIntArray11819 != null) {
	    boolean bool_3_ = true;
	    for (int i_4_ = 0;
		 i_4_ < class645_sub1_sub5_sub1.anIntArray11819.length;
		 i_4_++) {
		if (is[i_4_]
		    != class645_sub1_sub5_sub1.anIntArray11819[i_4_]) {
		    bool_3_ = false;
		    break;
		}
	    }
	    Class690 class690 = class645_sub1_sub5_sub1.aClass690_11774;
	    if (bool_3_ && class690.method8067((byte) 29)) {
		Class190 class190 = class645_sub1_sub5_sub1.aClass690_11774
					.method8073(-1958572195);
		int i_5_ = class190.anInt2156 * 1575787233;
		if (i_5_ == 1)
		    class690.method8090(i, 1653191779);
		if (2 == i_5_)
		    class690.method8083((byte) 9);
	    }
	}
	boolean bool_6_ = true;
	for (int i_7_ = 0; i_7_ < is.length; i_7_++) {
	    if (-1 != is[i_7_])
		bool_6_ = false;
	    if (null == class645_sub1_sub5_sub1.anIntArray11819
		|| -1 == class645_sub1_sub5_sub1.anIntArray11819[i_7_]
		|| ((((Class190)
		      Class379.aClass5_Sub4_3966.method63(is[i_7_], 815621234))
		     .anInt2150) * -449880687
		    >= ((Class190)
			(Class379.aClass5_Sub4_3966.method63
			 (class645_sub1_sub5_sub1.anIntArray11819[i_7_],
			  -1195442837))).anInt2150 * -449880687)) {
		class645_sub1_sub5_sub1.anIntArray11819 = is;
		class645_sub1_sub5_sub1.aClass690_11774.method8077(i,
								   -172601159);
		if (bool)
		    class645_sub1_sub5_sub1.anInt11818
			= class645_sub1_sub5_sub1.quenedStepCount * -1128762047;
	    }
	}
	if (bool_6_) {
	    class645_sub1_sub5_sub1.anIntArray11819 = is;
	    class645_sub1_sub5_sub1.aClass690_11774.method8077(i, -146479387);
	    if (bool)
		class645_sub1_sub5_sub1.anInt11818
		    = -1128762047 * class645_sub1_sub5_sub1.quenedStepCount;
	}
    }
}
