/* Class365 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class365
{
    public int anInt3842;
    public static Class365 aClass365_3843 = new Class365(8);
    public static Class365 aClass365_3844;
    public static Class365 aClass365_3845 = new Class365(16);
    public static Class365 aClass365_3846;
    static Class365 aClass365_3847;
    public static Class218 aClass218_3848;
    
    static {
	aClass365_3844 = new Class365(8);
	aClass365_3846 = new Class365(16);
	aClass365_3847 = new Class365(32);
    }
    
    Class365(int i) {
	anInt3842 = 1323942409 * i;
    }
    
    static final void method4635(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	class229.anInt2418 = 47407791;
	class229.anInt2419
	    = ((((Class648) class648).anIntArray8394
		[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	       * -1761002431);
	if (1835803215 * class229.anInt2377 == -1 && !class226.aBool2335)
	    Class26_Sub1.method9542(306930455 * class229.anInt2376,
				    (short) 27182);
    }
    
    static final void method4636(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	int[] is = Class494.method5957(string, class648, (short) 520);
	if (is != null)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2496
	    = Class181_Sub23.method8999(string, class648, (byte) -54);
	class229.anIntArray2497 = is;
	class229.aBool2483 = true;
    }
    
    static final int method4637(int i, int i_0_, int i_1_, int i_2_,
				int i_3_) {
	int i_4_ = 65536 - Class417.anIntArray4767[8192 * i_1_ / i_2_] >> 1;
	return ((65536 - i_4_) * i >> 16) + (i_0_ * i_4_ >> 16);
    }
    
    static final void method4638(Class648 class648, byte i) {
	if (client.anInt10876 * 175711435 == 12)
	    Class12.aBool184 = (((Class648) class648).anIntArray8394
				[(((Class648) class648).anInt8395
				  -= 1239022665) * 717927929]) == 1;
    }
    
    static final void method4639(Class229 class229, Class226 class226,
				 Class648 class648, short i) {
	((Class648) class648).anInt8395 -= -494675238;
	class229.aBool2444 = true;
	class229.anInt2450
	    = Math.max(Math.min((((Class648) class648).anIntArray8394
				 [(((Class648) class648).anInt8395
				   * 717927929)]),
				2816),
		       0) * -684462647;
	class229.anInt2448
	    = Math.max(Math.min((((Class648) class648).anIntArray8394
				 [1 + (((Class648) class648).anInt8395
				       * 717927929)]),
				2816),
		       0) * -1061452751;
	class229.anInt2449
	    = Math.max(Math.min((((Class648) class648).anIntArray8394
				 [(717927929 * ((Class648) class648).anInt8395
				   + 2)]),
				2816),
		       0) * -866819743;
	int i_5_ = Math.max(Math.min((((Class648) class648).anIntArray8394
				      [3 + 717927929 * (((Class648) class648)
							.anInt8395)]),
				     255),
			    0);
	int i_6_ = Math.max(Math.min((((Class648) class648).anIntArray8394
				      [4 + 717927929 * (((Class648) class648)
							.anInt8395)]),
				     255),
			    0);
	int i_7_
	    = Math.max(Math.min((((Class648) class648).anIntArray8394
				 [(717927929 * ((Class648) class648).anInt8395
				   + 5)]),
				255),
		       0);
	class229.anInt2451 = (i_5_ << 16 | i_6_ << 8 | i_7_) * 1585601117;
	class229.anInt2445
	    = (-1774937351
	       * (((Class648) class648).anIntArray8394
		  [((Class648) class648).anInt8395 * 717927929 + 6]));
	class229.anInt2525
	    = 585061825 * (((Class648) class648).anIntArray8394
			   [7 + 717927929 * ((Class648) class648).anInt8395]);
	class229.anInt2447
	    = (((Class648) class648).anIntArray8394
	       [8 + ((Class648) class648).anInt8395 * 717927929]) * 717558839;
	class229.anInt2422
	    = (-1704614953
	       * (((Class648) class648).anIntArray8394
		  [9 + 717927929 * ((Class648) class648).anInt8395]));
	Class39.method811(class229, 1435904523);
    }
    
    static final void method4640(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class493.aString5525.startsWith("win") ? 1 : 0;
    }
}
