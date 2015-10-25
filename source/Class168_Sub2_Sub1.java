/* Class168_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class168_Sub2_Sub1 extends Class168_Sub2
{
    static int[][] anIntArrayArray11242 = new int[6][];
    Interface39 anInterface39_11243;
    int anInt11244;
    Class173_Sub1 aClass173_Sub1_11245;
    
    Class168_Sub2_Sub1(Class173_Sub1 class173_sub1, int i) {
	((Class168_Sub2_Sub1) this).aClass173_Sub1_11245 = class173_sub1;
	((Class168_Sub2_Sub1) this).anInt11244 = i;
    }
    
    Interface39 method8956() {
	if (((Class168_Sub2_Sub1) this).anInterface39_11243 == null) {
	    Interface22 interface22
		= (((Class168_Sub2_Sub1) this).aClass173_Sub1_11245
		   .anInterface22_1991);
	    Class160 class160
		= (((Class168_Sub2_Sub1) this).aClass173_Sub1_11245
		       .aClass165_1984.method2093
		   (((Class168_Sub2_Sub1) this).anInt11244, (byte) -110));
	    if (class160 == null)
		return null;
	    if (!class160.aBool1773)
		return null;
	    if (!interface22.method122(Class600.aClass600_7867,
				       ((Class168_Sub2_Sub1) this).anInt11244,
				       Class595.aClass595_7760, 1.0F,
				       class160.anInt1774 * -726179659,
				       class160.anInt1774 * -726179659, false,
				       (byte) 76))
		return null;
	    int[] is
		= interface22.method117(Class600.aClass600_7867,
					((Class168_Sub2_Sub1) this).anInt11244,
					1.0F, class160.anInt1774 * -726179659,
					class160.anInt1774 * -726179659, false,
					-1349752282);
	    int i = (class160.anInt1774 * -726179659
		     * (class160.anInt1774 * -726179659));
	    if (is == null)
		return null;
	    for (int i_0_ = 0; i_0_ < 6; i_0_++) {
		anIntArrayArray11242[i_0_] = new int[i];
		System.arraycopy(is, i * i_0_, anIntArrayArray11242[i_0_], 0,
				 i);
	    }
	    ((Class168_Sub2_Sub1) this).anInterface39_11243
		= (((Class168_Sub2_Sub1) this).aClass173_Sub1_11245.method8523
		   (class160.anInt1774 * -726179659, class160.aByte1757 != 0,
		    anIntArrayArray11242));
	}
	return ((Class168_Sub2_Sub1) this).anInterface39_11243;
    }
    
    Interface39 method8957() {
	if (((Class168_Sub2_Sub1) this).anInterface39_11243 == null) {
	    Interface22 interface22
		= (((Class168_Sub2_Sub1) this).aClass173_Sub1_11245
		   .anInterface22_1991);
	    Class160 class160
		= (((Class168_Sub2_Sub1) this).aClass173_Sub1_11245
		       .aClass165_1984.method2093
		   (((Class168_Sub2_Sub1) this).anInt11244, (byte) 0));
	    if (class160 == null)
		return null;
	    if (!class160.aBool1773)
		return null;
	    if (!interface22.method122(Class600.aClass600_7867,
				       ((Class168_Sub2_Sub1) this).anInt11244,
				       Class595.aClass595_7760, 1.0F,
				       class160.anInt1774 * -726179659,
				       class160.anInt1774 * -726179659, false,
				       (byte) 114))
		return null;
	    int[] is
		= interface22.method117(Class600.aClass600_7867,
					((Class168_Sub2_Sub1) this).anInt11244,
					1.0F, class160.anInt1774 * -726179659,
					class160.anInt1774 * -726179659, false,
					375270781);
	    int i = (class160.anInt1774 * -726179659
		     * (class160.anInt1774 * -726179659));
	    if (is == null)
		return null;
	    for (int i_1_ = 0; i_1_ < 6; i_1_++) {
		anIntArrayArray11242[i_1_] = new int[i];
		System.arraycopy(is, i * i_1_, anIntArrayArray11242[i_1_], 0,
				 i);
	    }
	    ((Class168_Sub2_Sub1) this).anInterface39_11243
		= (((Class168_Sub2_Sub1) this).aClass173_Sub1_11245.method8523
		   (class160.anInt1774 * -726179659, class160.aByte1757 != 0,
		    anIntArrayArray11242));
	}
	return ((Class168_Sub2_Sub1) this).anInterface39_11243;
    }
}
