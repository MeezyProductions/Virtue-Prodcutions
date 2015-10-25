/* Class203 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class203 implements Interface25
{
    int anInt2216;
    int anInt2217;
    Class207 this$0;
    static Class551 aClass551_2218;
    
    public void method141(Class216 class216) {
	class216.method3045(((Class203) this).anInt2217 * -1231349685,
			    804622499 * ((Class203) this).anInt2216,
			    975723961);
	class216.method3028
	    (-1231349685 * ((Class203) this).anInt2217, -727051887)
	    .method2987(1973721380);
    }
    
    Class203(Class207 class207, ByteBuffer class528_sub42) {
	((Class203) this).this$0 = class207;
	((Class203) this).anInt2217
	    = class528_sub42.readUnsignedShort(-76861975) * -434769565;
	((Class203) this).anInt2216
	    = class528_sub42.readUnsignedByte((byte) 48) * 1542038283;
    }
    
    public void method140(Class216 class216, int i) {
	class216.method3045(((Class203) this).anInt2217 * -1231349685,
			    804622499 * ((Class203) this).anInt2216,
			    975723961);
	class216.method3028
	    (-1231349685 * ((Class203) this).anInt2217, -982667210)
	    .method2987(1975958599);
    }
    
    public void method139(Class216 class216) {
	class216.method3045(((Class203) this).anInt2217 * -1231349685,
			    804622499 * ((Class203) this).anInt2216,
			    975723961);
	class216.method3028
	    (-1231349685 * ((Class203) this).anInt2217, -1730486868)
	    .method2987(1999630814);
    }
    
    public void method138(Class216 class216) {
	class216.method3045(((Class203) this).anInt2217 * -1231349685,
			    804622499 * ((Class203) this).anInt2216,
			    975723961);
	class216.method3028
	    (-1231349685 * ((Class203) this).anInt2217, 2068120500)
	    .method2987(2047407268);
    }
    
    public static void method2864(boolean bool, short i) {
	/* empty */
    }
    
    static final void method2865(Class229 class229, Class648 class648, int i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	int i_1_
	    = ((((Class648) class648).anIntArray8394
		[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	       - 1);
	int i_2_ = i_1_;
	if (6 != class229.anInt2418 * 292816267
	    && class229.anInt2418 * 292816267 != 2)
	    throw new RuntimeException("");
	Class299 class299
	    = ((Class299)
	       Class21.aClass5_Sub8_214
		   .method63(-1386163263 * class229.anInt2419, -1719594799));
	if (class229.aClass287_2479 == null)
	    class229.aClass287_2479
		= new Class287(class299, class229.anInt2418 * 292816267 == 6);
	class229.aClass287_2479.aLong3154
	    = Class598.method7130(914935023) * 6725947522742831901L;
	if (null != class299.aByteArray3285) {
	    if (i_1_ < 0 || i_1_ >= class299.aByteArray3285.length)
		throw new RuntimeException("");
	    i_2_ = class299.aByteArray3285[i_1_];
	}
	if (null == class299.aShortArray3320 || i_2_ < 0
	    || i_2_ >= class299.aShortArray3320.length)
	    throw new RuntimeException("");
	class229.aClass287_2479.aShortArray3160[i_2_] = (short) i_0_;
	Class39.method811(class229, 1435904523);
    }
    
    static void method2866(Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class528_Sub11.method9354(string, -1041952563);
    }
}
