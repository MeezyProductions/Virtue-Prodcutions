/* Class335_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class335_Sub1_Sub1 extends Class335_Sub1
{
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_11311;
    public Class418 aClass418_11312 = new Class418();
    public int anInt11313;
    Class262 aClass262_11314;
    Class341 aClass341_11315;
    float[] aFloatArray11316;
    Class262 aClass262_11317;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_11318;
    public Class418 aClass418_11319 = new Class418();
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_11320;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_11321;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_11322;
    float[] aFloatArray11323;
    float aFloat11324;
    public int anInt11325;
    public int anInt11326;
    public int anInt11327;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_11328;
    
    public void method10371(int i, int i_0_, int i_1_) {
	float f = (float) ((i & 0x3) + 1) * -5.0E-4F;
	float f_2_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
	float f_3_ = 0 == (i & 0x40) ? 4.8828125E-4F : 9.765625E-4F;
	boolean bool = 0 != (i & 0x80);
	if (bool) {
	    ((Class335_Sub1_Sub1) this).aFloatArray11316[0] = f_3_;
	    ((Class335_Sub1_Sub1) this).aFloatArray11316[1] = 0.0F;
	    ((Class335_Sub1_Sub1) this).aFloatArray11316[2] = 0.0F;
	    ((Class335_Sub1_Sub1) this).aFloatArray11316[3] = 0.0F;
	} else {
	    ((Class335_Sub1_Sub1) this).aFloatArray11316[0] = 0.0F;
	    ((Class335_Sub1_Sub1) this).aFloatArray11316[1] = 0.0F;
	    ((Class335_Sub1_Sub1) this).aFloatArray11316[2] = f_3_;
	    ((Class335_Sub1_Sub1) this).aFloatArray11316[3] = 0.0F;
	}
	((Class335_Sub1_Sub1) this).aFloatArray11323[0] = 0.0F;
	((Class335_Sub1_Sub1) this).aFloatArray11323[1] = f_3_;
	((Class335_Sub1_Sub1) this).aFloatArray11323[2] = 0.0F;
	((Class335_Sub1_Sub1) this).aFloatArray11323[3]
	    = (float) aClass173_Sub1_3573.anInt9356 * f % 1.0F;
	if (!((Class335_Sub1_Sub1) this).aClass341_11315.aBool3590) {
	    int i_4_
		= (int) (f_2_ * (float) aClass173_Sub1_3573.anInt9356 * 16.0F);
	    aClass173_Sub1_3573.method8526(((Class335_Sub1_Sub1) this)
					   .aClass341_11315
					   .anInterface34Array3593[i_4_ % 16]);
	} else
	    ((Class335_Sub1_Sub1) this).aFloat11324
		= (float) ((double) aClass173_Sub1_3573.anInt9356
			   * (double) f_2_ % 1.0);
    }
    
    boolean method9026() throws Exception_Sub2 {
	((Class335_Sub1_Sub1) this).aClass528_Sub22_Sub1_11318
	    = aClass258_9938.method3498("WorldMatrix", -1533880409);
	((Class335_Sub1_Sub1) this).aClass528_Sub22_Sub1_11311
	    = aClass258_9938.method3498("WVPMatrix", -2060480456);
	((Class335_Sub1_Sub1) this).aClass528_Sub22_Sub1_11320
	    = aClass258_9938.method3498("UGenerationPlane", -1823745444);
	((Class335_Sub1_Sub1) this).aClass528_Sub22_Sub1_11322
	    = aClass258_9938.method3498("VGenerationPlane", -1743905216);
	((Class335_Sub1_Sub1) this).aClass528_Sub22_Sub1_11328
	    = aClass258_9938.method3498("Time", -1843098133);
	((Class335_Sub1_Sub1) this).aClass528_Sub22_Sub1_11321
	    = aClass258_9938.method3498("billowSampler3D", -1560663356);
	if (((Class335_Sub1_Sub1) this).aClass341_11315.aBool3590) {
	    ((Class335_Sub1_Sub1) this).aClass262_11314
		= aClass258_9938.method3483("Waterfall3D", -52808727);
	    aClass258_9938
		.method3488(((Class335_Sub1_Sub1) this).aClass262_11314);
	} else {
	    ((Class335_Sub1_Sub1) this).aClass262_11317
		= aClass258_9938.method3483("Waterfall2D", -235147172);
	    aClass258_9938
		.method3488(((Class335_Sub1_Sub1) this).aClass262_11317);
	}
	return true;
    }
    
    public Class335_Sub1_Sub1
	(Class173_Sub1 class173_sub1, Class341 class341)
	throws Exception_Sub2 {
	super(class173_sub1);
	((Class335_Sub1_Sub1) this).aFloatArray11316 = new float[4];
	((Class335_Sub1_Sub1) this).aFloatArray11323 = new float[4];
	((Class335_Sub1_Sub1) this).aClass341_11315 = class341;
	if (((Class335_Sub1_Sub1) this).aClass341_11315.method4486()
	    && class173_sub1.method8448())
	    method9042("Waterfall");
    }
    
    boolean method9037() throws Exception_Sub2 {
	((Class335_Sub1_Sub1) this).aClass528_Sub22_Sub1_11318
	    = aClass258_9938.method3498("WorldMatrix", -2029919099);
	((Class335_Sub1_Sub1) this).aClass528_Sub22_Sub1_11311
	    = aClass258_9938.method3498("WVPMatrix", -1809023435);
	((Class335_Sub1_Sub1) this).aClass528_Sub22_Sub1_11320
	    = aClass258_9938.method3498("UGenerationPlane", -2088328972);
	((Class335_Sub1_Sub1) this).aClass528_Sub22_Sub1_11322
	    = aClass258_9938.method3498("VGenerationPlane", -1636012675);
	((Class335_Sub1_Sub1) this).aClass528_Sub22_Sub1_11328
	    = aClass258_9938.method3498("Time", -1585479022);
	((Class335_Sub1_Sub1) this).aClass528_Sub22_Sub1_11321
	    = aClass258_9938.method3498("billowSampler3D", -1584137988);
	if (((Class335_Sub1_Sub1) this).aClass341_11315.aBool3590) {
	    ((Class335_Sub1_Sub1) this).aClass262_11314
		= aClass258_9938.method3483("Waterfall3D", -637922545);
	    aClass258_9938
		.method3488(((Class335_Sub1_Sub1) this).aClass262_11314);
	} else {
	    ((Class335_Sub1_Sub1) this).aClass262_11317
		= aClass258_9938.method3483("Waterfall2D", -159030499);
	    aClass258_9938
		.method3488(((Class335_Sub1_Sub1) this).aClass262_11317);
	}
	return true;
    }
    
    boolean method9038() throws Exception_Sub2 {
	((Class335_Sub1_Sub1) this).aClass528_Sub22_Sub1_11318
	    = aClass258_9938.method3498("WorldMatrix", -2007020014);
	((Class335_Sub1_Sub1) this).aClass528_Sub22_Sub1_11311
	    = aClass258_9938.method3498("WVPMatrix", -1636510207);
	((Class335_Sub1_Sub1) this).aClass528_Sub22_Sub1_11320
	    = aClass258_9938.method3498("UGenerationPlane", -1722351088);
	((Class335_Sub1_Sub1) this).aClass528_Sub22_Sub1_11322
	    = aClass258_9938.method3498("VGenerationPlane", -1531644148);
	((Class335_Sub1_Sub1) this).aClass528_Sub22_Sub1_11328
	    = aClass258_9938.method3498("Time", -1752398634);
	((Class335_Sub1_Sub1) this).aClass528_Sub22_Sub1_11321
	    = aClass258_9938.method3498("billowSampler3D", -1903139071);
	if (((Class335_Sub1_Sub1) this).aClass341_11315.aBool3590) {
	    ((Class335_Sub1_Sub1) this).aClass262_11314
		= aClass258_9938.method3483("Waterfall3D", -1301967611);
	    aClass258_9938
		.method3488(((Class335_Sub1_Sub1) this).aClass262_11314);
	} else {
	    ((Class335_Sub1_Sub1) this).aClass262_11317
		= aClass258_9938.method3483("Waterfall2D", -1152948349);
	    aClass258_9938
		.method3488(((Class335_Sub1_Sub1) this).aClass262_11317);
	}
	return true;
    }
    
    public void method10372(int i) {
	if (((Class335_Sub1_Sub1) this).aClass341_11315.aBool3590)
	    aClass258_9938
		.method3488(((Class335_Sub1_Sub1) this).aClass262_11314);
	else
	    aClass258_9938
		.method3488(((Class335_Sub1_Sub1) this).aClass262_11317);
	aClass258_9938.method3478();
	if (((Class335_Sub1_Sub1) this).aClass341_11315.aBool3590)
	    aClass258_9938.method3508((((Class335_Sub1_Sub1) this)
				       .aClass528_Sub22_Sub1_11321),
				      0,
				      (((Class335_Sub1_Sub1) this)
				       .aClass341_11315.anInterface32_3594),
				      1733587898);
	aClass258_9938.method3499((((Class335_Sub1_Sub1) this)
				   .aClass528_Sub22_Sub1_11318),
				  aClass418_11319, 1835822011);
	aClass258_9938.method3499((((Class335_Sub1_Sub1) this)
				   .aClass528_Sub22_Sub1_11311),
				  aClass418_11312, 688284845);
	aClass258_9938.method3495
	    (((Class335_Sub1_Sub1) this).aClass528_Sub22_Sub1_11320,
	     new Class425(((Class335_Sub1_Sub1) this).aFloatArray11316[0],
			  ((Class335_Sub1_Sub1) this).aFloatArray11316[1],
			  ((Class335_Sub1_Sub1) this).aFloatArray11316[2],
			  ((Class335_Sub1_Sub1) this).aFloatArray11316[3]),
	     -1333651078);
	aClass258_9938.method3495
	    (((Class335_Sub1_Sub1) this).aClass528_Sub22_Sub1_11322,
	     new Class425(((Class335_Sub1_Sub1) this).aFloatArray11323[0],
			  ((Class335_Sub1_Sub1) this).aFloatArray11323[1],
			  ((Class335_Sub1_Sub1) this).aFloatArray11323[2],
			  ((Class335_Sub1_Sub1) this).aFloatArray11323[3]),
	     -1007898263);
	aClass258_9938.method3495((((Class335_Sub1_Sub1) this)
				   .aClass528_Sub22_Sub1_11328),
				  new Class425((((Class335_Sub1_Sub1) this)
						.aFloat11324),
					       0.0F, 0.0F, 0.0F),
				  -1336238739);
	aClass173_Sub1_3573.method8563(Class363.aClass363_3839,
				       anInt11325 * -991856473,
				       299540385 * anInt11326,
				       -1348521951 * anInt11327,
				       -1966535583 * anInt11313);
    }
    
    public void method10373() {
	if (((Class335_Sub1_Sub1) this).aClass341_11315.aBool3590)
	    aClass258_9938
		.method3488(((Class335_Sub1_Sub1) this).aClass262_11314);
	else
	    aClass258_9938
		.method3488(((Class335_Sub1_Sub1) this).aClass262_11317);
	aClass258_9938.method3478();
	if (((Class335_Sub1_Sub1) this).aClass341_11315.aBool3590)
	    aClass258_9938.method3508((((Class335_Sub1_Sub1) this)
				       .aClass528_Sub22_Sub1_11321),
				      0,
				      (((Class335_Sub1_Sub1) this)
				       .aClass341_11315.anInterface32_3594),
				      1497100975);
	aClass258_9938.method3499((((Class335_Sub1_Sub1) this)
				   .aClass528_Sub22_Sub1_11318),
				  aClass418_11319, -141438093);
	aClass258_9938.method3499((((Class335_Sub1_Sub1) this)
				   .aClass528_Sub22_Sub1_11311),
				  aClass418_11312, 1273066264);
	aClass258_9938.method3495
	    (((Class335_Sub1_Sub1) this).aClass528_Sub22_Sub1_11320,
	     new Class425(((Class335_Sub1_Sub1) this).aFloatArray11316[0],
			  ((Class335_Sub1_Sub1) this).aFloatArray11316[1],
			  ((Class335_Sub1_Sub1) this).aFloatArray11316[2],
			  ((Class335_Sub1_Sub1) this).aFloatArray11316[3]),
	     -1611907411);
	aClass258_9938.method3495
	    (((Class335_Sub1_Sub1) this).aClass528_Sub22_Sub1_11322,
	     new Class425(((Class335_Sub1_Sub1) this).aFloatArray11323[0],
			  ((Class335_Sub1_Sub1) this).aFloatArray11323[1],
			  ((Class335_Sub1_Sub1) this).aFloatArray11323[2],
			  ((Class335_Sub1_Sub1) this).aFloatArray11323[3]),
	     467730257);
	aClass258_9938.method3495((((Class335_Sub1_Sub1) this)
				   .aClass528_Sub22_Sub1_11328),
				  new Class425((((Class335_Sub1_Sub1) this)
						.aFloat11324),
					       0.0F, 0.0F, 0.0F),
				  -1760691823);
	aClass173_Sub1_3573.method8563(Class363.aClass363_3839,
				       anInt11325 * -991856473,
				       299540385 * anInt11326,
				       -1348521951 * anInt11327,
				       -1966535583 * anInt11313);
    }
    
    public static final int method10374(int i, int i_5_, int i_6_, int i_7_) {
	if (client.aClass495_10935.method5973((byte) 85) == null)
	    return 0;
	int i_8_ = i >> 9;
	int i_9_ = i_5_ >> 9;
	if (i_8_ < 0 || i_9_ < 0
	    || i_8_ > client.aClass495_10935.method6029((short) 13484) - 1
	    || i_9_ > client.aClass495_10935.method5967(1430094396) - 1)
	    return 0;
	int i_10_ = i_6_;
	if (i_10_ < 3 && ((client.aClass495_10935.method6006((byte) 0)
			   .aByteArrayArrayArray5312[1][i_8_][i_9_])
			  & 0x2) != 0)
	    i_10_++;
	return client.aClass495_10935.method5973((byte) 70)
		   .aClass137Array7161[i_10_].method1656(i, i_5_, 1913134207);
    }
}
