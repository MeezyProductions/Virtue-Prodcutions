/* Class317_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class317_Sub1 extends Class317
{
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_9945;
    Class262 aClass262_9946;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_9947;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_9948;
    Class258 aClass258_9949;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_9950;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_9951;
    Class418 aClass418_9952 = new Class418();
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_9953;
    Class262 aClass262_9954;
    Class262 aClass262_9955;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_9956;
    public static Class5_Sub1 aClass5_Sub1_9957;
    public static int anInt9958;
    
    void method9056(boolean bool, boolean bool_0_, int i) {
	((Class317_Sub1) this).aClass258_9949.method3508
	    (((Class317_Sub1) this).aClass528_Sub22_Sub1_9948, 0,
	     anInterface34_3453, 2138922376);
	((Class317_Sub1) this).aClass258_9949.method3499
	    (((Class317_Sub1) this).aClass528_Sub22_Sub1_9947,
	     ((Class317_Sub1) this).aClass418_9952, 175359233);
	((Class317_Sub1) this).aClass258_9949.method3496
	    (((Class317_Sub1) this).aClass528_Sub22_Sub1_9945, aClass418_3456,
	     (short) -2077);
	((Class317_Sub1) this).aClass258_9949.method3497
	    (((Class317_Sub1) this).aClass528_Sub22_Sub1_9953, anInt3454,
	     (byte) 36);
	if (bool) {
	    if (bool_0_)
		((Class317_Sub1) this).aClass258_9949.method3493
		    (((Class317_Sub1) this).aClass528_Sub22_Sub1_9950,
		     aClass425_3457.aFloat4790, aClass425_3457.aFloat4791,
		     aClass425_3457.aFloat4792, aClass425_3457.aFloat4793,
		     -1916092031);
	    else
		((Class317_Sub1) this).aClass258_9949.method3491
		    (((Class317_Sub1) this).aClass528_Sub22_Sub1_9956,
		     Math.min(Math.max(aFloat3459, 0.0F), 1.0F), 657044598);
	    ((Class317_Sub1) this).aClass258_9949.method3480
		(((Class317_Sub1) this).aClass528_Sub22_Sub1_9951,
		 aClass422_3455.aFloat4780, aClass422_3455.aFloat4776,
		 aClass422_3455.aFloat4777, (short) 16472);
	}
    }
    
    boolean method9057(byte i) throws Exception_Sub2 {
	((Class317_Sub1) this).aClass258_9949
	    = aClass173_Sub1_3458.method8580("Particle");
	((Class317_Sub1) this).aClass528_Sub22_Sub1_9947
	    = ((Class317_Sub1) this).aClass258_9949.method3498("WVPMatrix",
							       -1677367321);
	((Class317_Sub1) this).aClass528_Sub22_Sub1_9948
	    = ((Class317_Sub1) this).aClass258_9949
		  .method3498("DiffuseSampler", -1596988903);
	((Class317_Sub1) this).aClass528_Sub22_Sub1_9945
	    = ((Class317_Sub1) this).aClass258_9949
		  .method3498("TexCoordMatrix", -1577763536);
	((Class317_Sub1) this).aClass528_Sub22_Sub1_9950
	    = ((Class317_Sub1) this).aClass258_9949
		  .method3498("DistanceFogPlane", -1526544607);
	((Class317_Sub1) this).aClass528_Sub22_Sub1_9951
	    = ((Class317_Sub1) this).aClass258_9949
		  .method3498("DistanceFogColour", -1644395128);
	((Class317_Sub1) this).aClass528_Sub22_Sub1_9956
	    = ((Class317_Sub1) this).aClass258_9949
		  .method3498("DistanceFogAmount", -2119687214);
	((Class317_Sub1) this).aClass528_Sub22_Sub1_9953
	    = ((Class317_Sub1) this).aClass258_9949.method3498("DiffuseColour",
							       -1877103638);
	((Class317_Sub1) this).aClass262_9954
	    = ((Class317_Sub1) this).aClass258_9949.method3483("NoFog",
							       -736371708);
	((Class317_Sub1) this).aClass262_9955
	    = ((Class317_Sub1) this).aClass258_9949.method3483("ParticleFog",
							       -72359676);
	((Class317_Sub1) this).aClass262_9946
	    = ((Class317_Sub1) this).aClass258_9949.method3483("BillboardFog",
							       -573296920);
	if (!((Class317_Sub1) this).aClass262_9954.method3588())
	    return false;
	if (!((Class317_Sub1) this).aClass262_9955.method3588())
	    return false;
	if (!((Class317_Sub1) this).aClass262_9946.method3588())
	    return false;
	return true;
    }
    
    public void method4180(Class418 class418) {
	((Class317_Sub1) this).aClass418_9952.method4986(class418);
	((Class317_Sub1) this).aClass418_9952
	    .method4974(aClass173_Sub1_3458.aClass418_9352);
    }
    
    public Class317_Sub1(Class173_Sub1 class173_sub1) throws Exception_Sub2 {
	super(class173_sub1);
	method9057((byte) 68);
    }
    
    public void method4186(int i, boolean bool) {
	((Class317_Sub1) this).aClass258_9949.method3488
	    (bool ? ((Class317_Sub1) this).aClass262_9955
	     : ((Class317_Sub1) this).aClass262_9954);
	((Class317_Sub1) this).aClass258_9949.method3478();
	method9056(bool, true, -1673038896);
	aClass173_Sub1_3458.method8563(Class363.aClass363_3839, 0, i * 4, 0,
				       i * 2);
    }
    
    public void method4183(Class418 class418) {
	((Class317_Sub1) this).aClass418_9952.method4986(class418);
	((Class317_Sub1) this).aClass418_9952
	    .method4974(aClass173_Sub1_3458.aClass418_9352);
    }
    
    public void method4185(Class418 class418) {
	((Class317_Sub1) this).aClass418_9952.method4986(class418);
	((Class317_Sub1) this).aClass418_9952
	    .method4974(aClass173_Sub1_3458.aClass418_9352);
    }
    
    public void method4184(Class418 class418) {
	((Class317_Sub1) this).aClass418_9952.method4986(class418);
	((Class317_Sub1) this).aClass418_9952
	    .method4974(aClass173_Sub1_3458.aClass418_9352);
    }
    
    public void method4182(boolean bool) {
	((Class317_Sub1) this).aClass258_9949.method3488
	    (bool ? ((Class317_Sub1) this).aClass262_9946
	     : ((Class317_Sub1) this).aClass262_9954);
	((Class317_Sub1) this).aClass258_9949.method3478();
	method9056(bool, false, -1673038896);
	aClass173_Sub1_3458.method8559();
    }
    
    public void method4179(int i, boolean bool) {
	((Class317_Sub1) this).aClass258_9949.method3488
	    (bool ? ((Class317_Sub1) this).aClass262_9955
	     : ((Class317_Sub1) this).aClass262_9954);
	((Class317_Sub1) this).aClass258_9949.method3478();
	method9056(bool, true, -1673038896);
	aClass173_Sub1_3458.method8563(Class363.aClass363_3839, 0, i * 4, 0,
				       i * 2);
    }
    
    public void method4189(int i, boolean bool) {
	((Class317_Sub1) this).aClass258_9949.method3488
	    (bool ? ((Class317_Sub1) this).aClass262_9955
	     : ((Class317_Sub1) this).aClass262_9954);
	((Class317_Sub1) this).aClass258_9949.method3478();
	method9056(bool, true, -1673038896);
	aClass173_Sub1_3458.method8563(Class363.aClass363_3839, 0, i * 4, 0,
				       i * 2);
    }
    
    public void method4187(boolean bool) {
	((Class317_Sub1) this).aClass258_9949.method3488
	    (bool ? ((Class317_Sub1) this).aClass262_9946
	     : ((Class317_Sub1) this).aClass262_9954);
	((Class317_Sub1) this).aClass258_9949.method3478();
	method9056(bool, false, -1673038896);
	aClass173_Sub1_3458.method8559();
    }
    
    public void method4188(boolean bool) {
	((Class317_Sub1) this).aClass258_9949.method3488
	    (bool ? ((Class317_Sub1) this).aClass262_9946
	     : ((Class317_Sub1) this).aClass262_9954);
	((Class317_Sub1) this).aClass258_9949.method3478();
	method9056(bool, false, -1673038896);
	aClass173_Sub1_3458.method8559();
    }
    
    public void method4181(boolean bool) {
	((Class317_Sub1) this).aClass258_9949.method3488
	    (bool ? ((Class317_Sub1) this).aClass262_9946
	     : ((Class317_Sub1) this).aClass262_9954);
	((Class317_Sub1) this).aClass258_9949.method3478();
	method9056(bool, false, -1673038896);
	aClass173_Sub1_3458.method8559();
    }
    
    public void method4190(boolean bool) {
	((Class317_Sub1) this).aClass258_9949.method3488
	    (bool ? ((Class317_Sub1) this).aClass262_9946
	     : ((Class317_Sub1) this).aClass262_9954);
	((Class317_Sub1) this).aClass258_9949.method3478();
	method9056(bool, false, -1673038896);
	aClass173_Sub1_3458.method8559();
    }
    
    boolean method9058() throws Exception_Sub2 {
	((Class317_Sub1) this).aClass258_9949
	    = aClass173_Sub1_3458.method8580("Particle");
	((Class317_Sub1) this).aClass528_Sub22_Sub1_9947
	    = ((Class317_Sub1) this).aClass258_9949.method3498("WVPMatrix",
							       -1635518502);
	((Class317_Sub1) this).aClass528_Sub22_Sub1_9948
	    = ((Class317_Sub1) this).aClass258_9949
		  .method3498("DiffuseSampler", -1790598760);
	((Class317_Sub1) this).aClass528_Sub22_Sub1_9945
	    = ((Class317_Sub1) this).aClass258_9949
		  .method3498("TexCoordMatrix", -1972361022);
	((Class317_Sub1) this).aClass528_Sub22_Sub1_9950
	    = ((Class317_Sub1) this).aClass258_9949
		  .method3498("DistanceFogPlane", -1744265505);
	((Class317_Sub1) this).aClass528_Sub22_Sub1_9951
	    = ((Class317_Sub1) this).aClass258_9949
		  .method3498("DistanceFogColour", -1932716008);
	((Class317_Sub1) this).aClass528_Sub22_Sub1_9956
	    = ((Class317_Sub1) this).aClass258_9949
		  .method3498("DistanceFogAmount", -1710090339);
	((Class317_Sub1) this).aClass528_Sub22_Sub1_9953
	    = ((Class317_Sub1) this).aClass258_9949.method3498("DiffuseColour",
							       -1721792846);
	((Class317_Sub1) this).aClass262_9954
	    = ((Class317_Sub1) this).aClass258_9949.method3483("NoFog",
							       -2075912695);
	((Class317_Sub1) this).aClass262_9955
	    = ((Class317_Sub1) this).aClass258_9949.method3483("ParticleFog",
							       -907241398);
	((Class317_Sub1) this).aClass262_9946
	    = ((Class317_Sub1) this).aClass258_9949.method3483("BillboardFog",
							       -1997082043);
	if (!((Class317_Sub1) this).aClass262_9954.method3588())
	    return false;
	if (!((Class317_Sub1) this).aClass262_9955.method3588())
	    return false;
	if (!((Class317_Sub1) this).aClass262_9946.method3588())
	    return false;
	return true;
    }
    
    void method9059(boolean bool, boolean bool_1_) {
	((Class317_Sub1) this).aClass258_9949.method3508
	    (((Class317_Sub1) this).aClass528_Sub22_Sub1_9948, 0,
	     anInterface34_3453, 1470375992);
	((Class317_Sub1) this).aClass258_9949.method3499
	    (((Class317_Sub1) this).aClass528_Sub22_Sub1_9947,
	     ((Class317_Sub1) this).aClass418_9952, -1031844218);
	((Class317_Sub1) this).aClass258_9949.method3496
	    (((Class317_Sub1) this).aClass528_Sub22_Sub1_9945, aClass418_3456,
	     (short) -1726);
	((Class317_Sub1) this).aClass258_9949.method3497
	    (((Class317_Sub1) this).aClass528_Sub22_Sub1_9953, anInt3454,
	     (byte) 81);
	if (bool) {
	    if (bool_1_)
		((Class317_Sub1) this).aClass258_9949.method3493
		    (((Class317_Sub1) this).aClass528_Sub22_Sub1_9950,
		     aClass425_3457.aFloat4790, aClass425_3457.aFloat4791,
		     aClass425_3457.aFloat4792, aClass425_3457.aFloat4793,
		     -1916092031);
	    else
		((Class317_Sub1) this).aClass258_9949.method3491
		    (((Class317_Sub1) this).aClass528_Sub22_Sub1_9956,
		     Math.min(Math.max(aFloat3459, 0.0F), 1.0F), -1960610127);
	    ((Class317_Sub1) this).aClass258_9949.method3480
		(((Class317_Sub1) this).aClass528_Sub22_Sub1_9951,
		 aClass422_3455.aFloat4780, aClass422_3455.aFloat4776,
		 aClass422_3455.aFloat4777, (short) 28683);
	}
    }
    
    public static void method9060(int i) {
	Class229.aClass186_2490.method2731(-1694753588);
	Class229.aClass186_2372.method2731(-1071103159);
	Class229.aClass186_2370.method2731(-982033284);
	Class229.aClass186_2371.method2731(-858041058);
    }
    
    static void method9061(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [717927929 * ((Class648) class648).anInt8395 - 2]
	    = (((Class256)
		(Class669.aClass25_Sub1_8522.method63
		 ((((Class648) class648).anIntArray8394
		   [717927929 * ((Class648) class648).anInt8395 - 2]),
		  111230918)))
		   .method3459
	       (Class570.playerVarsProvider,
		(((Class648) class648).anIntArray8394
		 [717927929 * ((Class648) class648).anInt8395 - 1]),
		(byte) -97)) ? 1 : 0;
	((Class648) class648).anInt8395 -= 1239022665;
    }
}
