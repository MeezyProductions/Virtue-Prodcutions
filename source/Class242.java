/* Class242 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Stack;

public class Class242
{
    static Class696 aClass696_2722;
    static long aLong2723;
    
    static final void method3372(long l) {
	try {
	    Thread.sleep(l);
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    public static final void method3373(long l) {
	if (l > 0L) {
	    if (0L == l % 10L) {
		Class164.method2086(l - 1L);
		Class164.method2086(1L);
	    } else
		Class164.method2086(l);
	}
    }
    
    Class242() throws Throwable {
	throw new Error();
    }
    
    public static final void method3374(long l) {
	if (l > 0L) {
	    if (0L == l % 10L) {
		Class164.method2086(l - 1L);
		Class164.method2086(1L);
	    } else
		Class164.method2086(l);
	}
    }
    
    static final void method3375(long l) {
	try {
	    Thread.sleep(l);
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    static final int method3376(byte i) {
	return 0;
    }
    
    static final void method3377(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = client.aClass217_11028.method3069((short) 516);
    }
    
    static void method3378(Class229 class229, Class229 class229_0_, int i) {
	Class528_Sub34 class528_sub34
	    = Class656.method7845(OutgoingOpcode.aClass403_4536,
				  client.aClass109_10930.aClass10_1379,
				  -1972649327);
	class528_sub34.aClass528_Sub42_Sub2_10481
	    .writeMiddleInt(306930455 * class229.anInt2376, (byte) 75);
	class528_sub34.aClass528_Sub42_Sub2_10481
	    .method9660(1835803215 * class229.anInt2377, 859922058);
	class528_sub34.aClass528_Sub42_Sub2_10481
	    .method9717(1272672363 * class229.anInt2528, (byte) 85);
	class528_sub34.aClass528_Sub42_Sub2_10481
	    .method9717(class229_0_.anInt2377 * 1835803215, (byte) -101);
	class528_sub34.aClass528_Sub42_Sub2_10481
	    .writeMiddleInt(class229_0_.anInt2376 * 306930455, (byte) 17);
	class528_sub34.aClass528_Sub42_Sub2_10481
	    .method9661(class229_0_.anInt2528 * 1272672363, -531543857);
	client.aClass109_10930.method1380(class528_sub34, 1830515068);
    }
    
    public static final Class229 method3379(Class226 class226,
					    Class229 class229, byte i) {
	if (-1027873541 * class229.anInt2522 != -1)
	    return class226.method3177(-1027873541 * class229.anInt2522,
				       (byte) 57);
	if (!class226.aBool2335) {
	    int i_1_ = 306930455 * class229.anInt2376 >>> 16;
	    Class697 class697 = new Class697(client.aClass692_11097);
	    for (Class528_Sub39 class528_sub39
		     = (Class528_Sub39) class697.method8194(-1324111195);
		 class528_sub39 != null;
		 class528_sub39 = (Class528_Sub39) class697.next()) {
		if (class528_sub39.anInt10625 * 905908359 == i_1_)
		    return (Class623_Sub1.method9755
			    ((int) (class528_sub39.aLong7107
				    * -4849232331708333273L),
			     (byte) -16));
	    }
	}
	return null;
    }
    
    public static void method3380(int i) {
	synchronized (Class549.aStack7418) {
	    Class549.aStack7418 = new Stack();
	}
    }
    
    static void method3381(Class648 class648, byte i) {
	Class256 class256
	    = ((Class256)
	       Class669.aClass25_Sub1_8522.method63((((Class648) class648)
						     .anIntArray8394
						     [((((Class648) class648)
							    .anInt8395
							-= 1239022665)
						       * 717927929)]),
						    1475600628));
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (null == class256.anIntArray2823 ? 0
	       : class256.anIntArray2823.length);
    }
}
