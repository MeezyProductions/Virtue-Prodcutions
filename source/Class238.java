/* Class238 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class238 implements Interface25
{
    int anInt2602;
    int anInt2603;
    Class207 this$0;
    
    Class238(Class207 class207, ByteBuffer class528_sub42) {
	((Class238) this).this$0 = class207;
	((Class238) this).anInt2602
	    = class528_sub42.readUnsignedShort(-1435532698) * 966495235;
	((Class238) this).anInt2603
	    = class528_sub42.readUnsignedShort(759112075) * 244826023;
    }
    
    public void method140(Class216 class216, int i) {
	class216.method3058(303070891 * ((Class238) this).anInt2602,
			    ((Class238) this).anInt2603 * 304936983,
			    (short) -2764);
	class216.method3028
	    (303070891 * ((Class238) this).anInt2602, -376563820)
	    .method2987(1972391967);
    }
    
    public void method141(Class216 class216) {
	class216.method3058(303070891 * ((Class238) this).anInt2602,
			    ((Class238) this).anInt2603 * 304936983,
			    (short) -6447);
	class216.method3028
	    (303070891 * ((Class238) this).anInt2602, 292107258)
	    .method2987(1947140581);
    }
    
    public void method139(Class216 class216) {
	class216.method3058(303070891 * ((Class238) this).anInt2602,
			    ((Class238) this).anInt2603 * 304936983,
			    (short) -4966);
	class216.method3028
	    (303070891 * ((Class238) this).anInt2602, 1416947366)
	    .method2987(2070041947);
    }
    
    public void method138(Class216 class216) {
	class216.method3058(303070891 * ((Class238) this).anInt2602,
			    ((Class238) this).anInt2603 * 304936983,
			    (short) 21455);
	class216.method3028
	    (303070891 * ((Class238) this).anInt2602, -305066223)
	    .method2987(2014747784);
    }
    
    public static String method3294(Class528_Sub21_Sub11 class528_sub21_sub11,
				    int i) {
	if (Class28.aBool273 || null == class528_sub21_sub11)
	    return "";
	if ((null == ((Class528_Sub21_Sub11) class528_sub21_sub11).aString11596
	     || ((Class528_Sub21_Sub11) class528_sub21_sub11).aString11596
		    .length() == 0)
	    && (null
		!= ((Class528_Sub21_Sub11) class528_sub21_sub11).aString11584)
	    && ((Class528_Sub21_Sub11) class528_sub21_sub11).aString11584
		   .length() > 0)
	    return ((Class528_Sub21_Sub11) class528_sub21_sub11).aString11584;
	return ((Class528_Sub21_Sub11) class528_sub21_sub11).aString11596;
    }
    
    static final void method3295(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	class229.anInt2460
	    = ((((Class648) class648).anIntArray8394
		[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	       * -796104071);
	Class39.method811(class229, 1435904523);
    }
    
    static final void method3296(Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = new StringBuilder().append(string).append
		  (Class95_Sub1.method8257(i_0_, true, -479703604)).toString();
    }
    
    static void method3297(Class229 class229, int i, int i_1_, int i_2_) {
	if (client.aBool10899) {
	    Class79 class79
		= ((Class79)
		   (-1 != Class690.anInt8680 * -1138738213
		    ? Class208.aClass5_Sub10_2239.method63((Class690.anInt8680
							    * -1138738213),
							   -171682599)
		    : null));
	    if (client.method10201(class229).method9477(-1422436934)
		&& 0 != (-856748185 * Class296.anInt3249 & 0x20)
		&& (class79 == null
		    || (class229.method3210(Class690.anInt8680 * -1138738213,
					    1875093329 * class79.anInt809,
					    1855168018)
			!= class79.anInt809 * 1875093329)))
		Class280.method3738(client.aString10902,
				    new StringBuilder().append
					(client.aString11175).append
					(" ").append
					(Class49.aString553).append
					(" ").append
					(class229.aString2473).toString(),
				    Class528_Sub6.anInt10255 * -555764949, 58,
				    class229.anInt2528 * 1272672363, 0L,
				    1835803215 * class229.anInt2377,
				    class229.anInt2376 * 306930455, true,
				    false,
				    (long) ((class229.anInt2377 * 1835803215
					     << 32)
					    | class229.anInt2376 * 306930455),
				    false, -404863530);
	}
	for (int i_3_ = 9; i_3_ >= 5; i_3_--) {
	    String string = Class274.method3698(class229, i_3_, (byte) -40);
	    if (string != null)
		Class280.method3738(string, class229.aString2473,
				    Class378_Sub3.method9220(class229, i_3_,
							     (short) 20750),
				    1007, class229.anInt2528 * 1272672363,
				    (long) (1 + i_3_),
				    1835803215 * class229.anInt2377,
				    class229.anInt2376 * 306930455, true,
				    false,
				    (long) ((1835803215 * class229.anInt2377
					     << 32)
					    | class229.anInt2376 * 306930455),
				    false, -2127200785);
	}
	String string = Class279.method3734(class229, -892810107);
	if (string != null)
	    Class280.method3738(string, class229.aString2473,
				class229.anInt2446 * -299400847, 25,
				class229.anInt2528 * 1272672363, 0L,
				1835803215 * class229.anInt2377,
				class229.anInt2376 * 306930455, true, false,
				(long) (1835803215 * class229.anInt2377 << 32
					| class229.anInt2376 * 306930455),
				false, 928166056);
	for (int i_4_ = 4; i_4_ >= 0; i_4_--) {
	    String string_5_
		= Class274.method3698(class229, i_4_, (byte) -111);
	    if (null != string_5_)
		Class280.method3738(string_5_, class229.aString2473,
				    Class378_Sub3.method9220(class229, i_4_,
							     (short) 3188),
				    57, 1272672363 * class229.anInt2528,
				    (long) (i_4_ + 1),
				    1835803215 * class229.anInt2377,
				    class229.anInt2376 * 306930455, true,
				    false,
				    (long) ((1835803215 * class229.anInt2377
					     << 32)
					    | class229.anInt2376 * 306930455),
				    false, 1276789844);
	}
	if (client.method10201(class229).method9472(-1711338594)) {
	    if (class229.aString2420 != null)
		Class280.method3738(class229.aString2420, "", -1, 30,
				    class229.anInt2528 * 1272672363, 0L,
				    class229.anInt2377 * 1835803215,
				    306930455 * class229.anInt2376, true,
				    false,
				    (long) ((1835803215 * class229.anInt2377
					     << 32)
					    | 306930455 * class229.anInt2376),
				    false, 1001207605);
	    else
		Class280.method3738
		    (Class39.aClass39_358
			 .method807(Class378_Sub2.aClass668_10123, (byte) 102),
		     "", -1, 30, 1272672363 * class229.anInt2528, 0L,
		     1835803215 * class229.anInt2377,
		     306930455 * class229.anInt2376, true, false,
		     (long) (class229.anInt2377 * 1835803215 << 32
			     | class229.anInt2376 * 306930455),
		     false, 528229587);
	}
    }
}
