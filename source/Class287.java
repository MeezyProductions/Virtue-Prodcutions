/* Class287 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class287
{
    public long aLong3154;
    float[] aFloatArray3155;
    public short[] aShortArray3156;
    int[][] anIntArrayArray3157;
    int[][] anIntArrayArray3158;
    public int[] anIntArray3159;
    public short[] aShortArray3160;
    public static Class446 aClass446_3161;
    
    public Class287(Class299 class299, boolean bool) {
	if (bool) {
	    anIntArray3159 = new int[class299.anIntArray3271.length];
	    ((Class287) this).aFloatArray3155
		= new float[class299.anIntArray3271.length];
	    ((Class287) this).anIntArrayArray3157
		= new int[class299.anIntArray3271.length][3];
	    ((Class287) this).anIntArrayArray3158
		= new int[class299.anIntArray3271.length][3];
	    System.arraycopy(class299.anIntArray3271, 0, anIntArray3159, 0,
			     anIntArray3159.length);
	} else {
	    anIntArray3159 = new int[class299.anIntArray3272.length];
	    ((Class287) this).aFloatArray3155
		= new float[class299.anIntArray3272.length];
	    ((Class287) this).anIntArrayArray3157
		= new int[class299.anIntArray3272.length][3];
	    ((Class287) this).anIntArrayArray3158
		= new int[class299.anIntArray3272.length][3];
	    System.arraycopy(class299.anIntArray3272, 0, anIntArray3159, 0,
			     anIntArray3159.length);
	}
	if (null != class299.aShortArray3284) {
	    aShortArray3156 = new short[class299.aShortArray3284.length];
	    System.arraycopy(class299.aShortArray3284, 0, aShortArray3156, 0,
			     aShortArray3156.length);
	}
	if (class299.aShortArray3320 != null) {
	    aShortArray3160 = new short[class299.aShortArray3320.length];
	    System.arraycopy(class299.aShortArray3320, 0, aShortArray3160, 0,
			     aShortArray3160.length);
	}
    }
    
    public Class287(long l, int[] is, float[] fs, int[][] is_0_, int[][] is_1_,
		    short[] is_2_, short[] is_3_) {
	aLong3154 = l * 6725947522742831901L;
	anIntArray3159 = is;
	((Class287) this).aFloatArray3155 = fs;
	((Class287) this).anIntArrayArray3157 = is_0_;
	((Class287) this).anIntArrayArray3158 = is_1_;
	aShortArray3156 = is_2_;
	aShortArray3160 = is_3_;
    }
    
    static final void method3861(Class648 class648, int i) {
	int i_4_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_4_, (byte) -6);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class229.anInt2522 * -1027873541;
    }
    
    static final void method3862(Class648 class648, byte i) {
	if (null == Class18.aShortArray207
	    || (Class181_Sub18.anInt9847 * 673772487
		>= 939068291 * Class552.anInt7428))
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -1;
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= (Class18.aShortArray207[(Class181_Sub18.anInt9847
					   += -1784226313) * 673772487 - 1]
		   & 0xffff);
    }
    
    static final void method3863(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub16_10576
		  .method9953(-2112798065) == 1 ? 1 : 0;
    }
    
    public static void method3864(byte i) {
	synchronized (Class69.aClass186_770) {
	    Class69.aClass186_770.method2731(-1141772660);
	}
    }
    
    static final void method3865(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	int i_5_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	class229.anInt2528 = 238437309;
	if (class229.anInt2409 * -732466261 != i_5_) {
	    class229.anInt2409 = i_5_ * -856166653;
	    Class39.method811(class229, 1435904523);
	}
	if (-1 == class229.anInt2377 * 1835803215 && !class226.aBool2335)
	    Class579.method6916(class229.anInt2376 * 306930455, -1898083859);
    }
    
    static final void method3866(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (1 == 292816267 * class229.anInt2418
	       ? -1386163263 * class229.anInt2419 : -1);
    }
    
    static final void method3867(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_6_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395]);
	boolean bool
	    = 1 == (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395 + 1]);
	if (null != Class518_Sub1.aClass692_10700) {
	    Node node
		= Class518_Sub1.aClass692_10700.method8137((long) i_6_);
	    if (null != node && !bool)
		node.method6443(-1033856123);
	    else if (null == node && bool) {
		node = new Node();
		Class518_Sub1.aClass692_10700.method8142(node,
							 (long) i_6_);
	    }
	}
    }
}
