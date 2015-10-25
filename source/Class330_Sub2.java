/* Class330_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub2 extends Class330
{
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_10072;
    public static float aFloat10073;
    public static int anInt10074;
    public static Class162_Sub2[] aClass162_Sub2Array10075;
    Class262[] aClass262Array10076 = null;
    public static float[] aFloatArray10077 = { 0.0F, 0.0F, 0.0F };
    Class258 aClass258_10078;
    Class528_Sub22_Sub1[] aClass528_Sub22_Sub1Array10079 = null;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_10080;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_10081;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_10082;
    boolean aBool10083;
    
    int method4297() {
	return 2;
    }
    
    void method4300() {
	/* empty */
    }
    
    boolean method4276() {
	return ((Class330_Sub2) this).aBool10083;
    }
    
    public Class330_Sub2(Class173_Sub1 class173_sub1) {
	super(class173_sub1);
    }
    
    void method4279(int i, int i_0_) {
	/* empty */
    }
    
    void method4308() {
	/* empty */
    }
    
    int method4284() {
	return 0;
    }
    
    void method4280(int i, Class163_Sub1 class163_sub1,
		    Interface34 interface34, Interface21 interface21,
		    Interface34 interface34_1_, boolean bool) {
	float f = aClass173_Sub1_3512.method8468();
	float f_2_ = (float) class163_sub1.method2074();
	float f_3_ = (float) class163_sub1.method2070();
	Interface34 interface34_4_ = interface34;
	float f_5_ = f * 2.0F / f_2_;
	float f_6_ = -f * 2.0F / f_3_;
	float[] fs = { -1.0F + f_5_, 1.0F + f_6_, 0.0F, 0.0F, -1.0F + f_5_,
		       -3.0F + f_6_, 0.0F, 2.0F, 3.0F + f_5_, 1.0F + f_6_,
		       2.0F, 0.0F };
	int i_7_ = (int) f_2_;
	int i_8_ = (int) f_3_;
	int i_9_
	    = (bool ? aClass173_Sub1_3512.method2357(-2076811838).method2074()
	       : i_7_);
	int i_10_
	    = (bool ? aClass173_Sub1_3512.method2357(-1655726184).method2070()
	       : i_8_);
	Class262 class262
	    = ((Class330_Sub2) this).aClass262Array10076[anInt10074 - 1];
	((Class330_Sub2) this).aClass258_10078.method3488(class262);
	((Class330_Sub2) this).aClass258_10078.method3478();
	((Class330_Sub2) this).aClass258_10078.method3493
	    (((Class330_Sub2) this).aClass528_Sub22_Sub1_10072, aFloat10073,
	     aFloatArray10077[0], aFloatArray10077[1], aFloatArray10077[2],
	     -1916092031);
	Object object = null;
	Object object_11_ = null;
	for (int i_12_ = 0; i_12_ < anInt10074; i_12_++) {
	    if (aClass162_Sub2Array10075[i_12_] != null) {
		Class528_Sub22_Sub1 class528_sub22_sub1
		    = (((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079
		       [i_12_]);
		Interface38 interface38
		    = aClass162_Sub2Array10075[i_12_].method8908();
		((Class330_Sub2) this).aClass258_10078.method3508
		    (class528_sub22_sub1, i_12_ + 1, interface38, 2086607753);
	    }
	}
	float f_13_ = (float) i_7_ / f_2_;
	float f_14_ = (float) i_8_ / f_3_;
	float f_15_ = (float) i_9_ / f_2_;
	float f_16_ = (float) i_10_ / f_3_;
	fs[8] = (fs[8] + 1.0F) * f_13_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_14_ + 1.0F;
	fs[10] *= f_15_;
	fs[7] *= f_16_;
	((Class330_Sub2) this).aClass258_10078.method3529
	    (((Class330_Sub2) this).aClass528_Sub22_Sub1_10082, fs, 325415355);
	((Class330_Sub2) this).aClass258_10078.method3508
	    (((Class330_Sub2) this).aClass528_Sub22_Sub1_10080, 0,
	     interface34_4_, 2063855915);
	((Class330_Sub2) this).aClass258_10078.method3493
	    (((Class330_Sub2) this).aClass528_Sub22_Sub1_10081, 0.0F, 0.0F,
	     0.0F, 0.0F, -1916092031);
	aClass173_Sub1_3512.method2275(0, 0, i_7_, i_8_);
    }
    
    void method4281(int i) {
	((Class330_Sub2) this).aClass258_10078.method3479();
    }
    
    int method4327() {
	return 0;
    }
    
    int method4282() {
	return 1;
    }
    
    boolean method4287() {
	return (anInt10074 == 0 || aFloat10073 == 1.0F
		|| (aFloatArray10077[0] + aFloatArray10077[1]
		    + aFloatArray10077[2]) == 0.0F
		|| (aClass162_Sub2Array10075[0] == null
		    && aClass162_Sub2Array10075[1] == null
		    && aClass162_Sub2Array10075[2] == null));
    }
    
    int method4311() {
	return 1;
    }
    
    boolean method4286() {
	return (aClass173_Sub1_3512.aBool9279
		&& aClass173_Sub1_3512.method8596());
    }
    
    boolean method4289() {
	return (aClass173_Sub1_3512.aBool9279
		&& aClass173_Sub1_3512.method8596());
    }
    
    boolean method4328() {
	return (anInt10074 == 0 || aFloat10073 == 1.0F
		|| (aFloatArray10077[0] + aFloatArray10077[1]
		    + aFloatArray10077[2]) == 0.0F
		|| (aClass162_Sub2Array10075[0] == null
		    && aClass162_Sub2Array10075[1] == null
		    && aClass162_Sub2Array10075[2] == null));
    }
    
    boolean method4291() {
	return ((Class330_Sub2) this).aBool10083;
    }
    
    boolean method4292() {
	if (method4274()) {
	    ((Class330_Sub2) this).aClass258_10078
		= aClass173_Sub1_3512.method8580("FilterColourRemapping");
	    if (((Class330_Sub2) this).aClass258_10078 == null)
		return false;
	    try {
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10080
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("sceneTex", -1842746524);
		((Class330_Sub2) this).aClass262Array10076 = new Class262[3];
		((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079
		    = new Class528_Sub22_Sub1[3];
		if (aClass173_Sub1_3512.aBool9368) {
		    ((Class330_Sub2) this).aClass262Array10076[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap3D_1", -791295312);
		    ((Class330_Sub2) this).aClass262Array10076[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap3D_2", -1262543680);
		    ((Class330_Sub2) this).aClass262Array10076[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap3D_3", -1805190280);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex3D_1", -1893409386);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex3D_2", -1814814208);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex3D_3", -2106239844);
		} else {
		    ((Class330_Sub2) this).aClass262Array10076[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap2D_1", -1190766935);
		    ((Class330_Sub2) this).aClass262Array10076[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap2D_2", -874794842);
		    ((Class330_Sub2) this).aClass262Array10076[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap2D_3", 76487995);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex2D_1", -2115698762);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex2D_2", -2078278512);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex2D_3", -1553026970);
		}
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10072
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("paramsWeightings", -1967021546);
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10081
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("pixelOffset", -1669336011);
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10082
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("PosAndTexCoords", -1996900794);
	    } catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
		return false;
	    } catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
		return false;
	    }
	    if (!((Class330_Sub2) this).aClass262Array10076[0].method3588()
		|| !((Class330_Sub2) this).aClass262Array10076[1].method3588()
		|| !((Class330_Sub2) this).aClass262Array10076[2].method3588())
		return false;
	    ((Class330_Sub2) this).aBool10083 = true;
	    return true;
	}
	return false;
    }
    
    boolean method4307() {
	if (method4274()) {
	    ((Class330_Sub2) this).aClass258_10078
		= aClass173_Sub1_3512.method8580("FilterColourRemapping");
	    if (((Class330_Sub2) this).aClass258_10078 == null)
		return false;
	    try {
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10080
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("sceneTex", -1747432466);
		((Class330_Sub2) this).aClass262Array10076 = new Class262[3];
		((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079
		    = new Class528_Sub22_Sub1[3];
		if (aClass173_Sub1_3512.aBool9368) {
		    ((Class330_Sub2) this).aClass262Array10076[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap3D_1", -1158517734);
		    ((Class330_Sub2) this).aClass262Array10076[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap3D_2", -1703985525);
		    ((Class330_Sub2) this).aClass262Array10076[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap3D_3", -286696444);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex3D_1", -1986548659);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex3D_2", -1827063536);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex3D_3", -1883063382);
		} else {
		    ((Class330_Sub2) this).aClass262Array10076[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap2D_1", -1706811192);
		    ((Class330_Sub2) this).aClass262Array10076[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap2D_2", 378217953);
		    ((Class330_Sub2) this).aClass262Array10076[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap2D_3", -1614254536);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex2D_1", -1823830972);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex2D_2", -1896401496);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex2D_3", -1568514501);
		}
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10072
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("paramsWeightings", -1958898734);
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10081
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("pixelOffset", -1691893537);
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10082
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("PosAndTexCoords", -1522353497);
	    } catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
		return false;
	    } catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
		return false;
	    }
	    if (!((Class330_Sub2) this).aClass262Array10076[0].method3588()
		|| !((Class330_Sub2) this).aClass262Array10076[1].method3588()
		|| !((Class330_Sub2) this).aClass262Array10076[2].method3588())
		return false;
	    ((Class330_Sub2) this).aBool10083 = true;
	    return true;
	}
	return false;
    }
    
    boolean method4301() {
	if (method4274()) {
	    ((Class330_Sub2) this).aClass258_10078
		= aClass173_Sub1_3512.method8580("FilterColourRemapping");
	    if (((Class330_Sub2) this).aClass258_10078 == null)
		return false;
	    try {
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10080
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("sceneTex", -1754088794);
		((Class330_Sub2) this).aClass262Array10076 = new Class262[3];
		((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079
		    = new Class528_Sub22_Sub1[3];
		if (aClass173_Sub1_3512.aBool9368) {
		    ((Class330_Sub2) this).aClass262Array10076[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap3D_1", 308841384);
		    ((Class330_Sub2) this).aClass262Array10076[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap3D_2", -1500611561);
		    ((Class330_Sub2) this).aClass262Array10076[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap3D_3", -2109978413);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex3D_1", -2064338616);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex3D_2", -2036491524);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex3D_3", -1691903059);
		} else {
		    ((Class330_Sub2) this).aClass262Array10076[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap2D_1", -1071889382);
		    ((Class330_Sub2) this).aClass262Array10076[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap2D_2", -1548998486);
		    ((Class330_Sub2) this).aClass262Array10076[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap2D_3", -2073818970);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex2D_1", -2001558045);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex2D_2", -2024318348);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex2D_3", -1772465024);
		}
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10072
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("paramsWeightings", -1556698725);
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10081
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("pixelOffset", -1851595460);
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10082
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("PosAndTexCoords", -2125518092);
	    } catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
		return false;
	    } catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
		return false;
	    }
	    if (!((Class330_Sub2) this).aClass262Array10076[0].method3588()
		|| !((Class330_Sub2) this).aClass262Array10076[1].method3588()
		|| !((Class330_Sub2) this).aClass262Array10076[2].method3588())
		return false;
	    ((Class330_Sub2) this).aBool10083 = true;
	    return true;
	}
	return false;
    }
    
    boolean method4294() {
	if (method4274()) {
	    ((Class330_Sub2) this).aClass258_10078
		= aClass173_Sub1_3512.method8580("FilterColourRemapping");
	    if (((Class330_Sub2) this).aClass258_10078 == null)
		return false;
	    try {
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10080
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("sceneTex", -1934560248);
		((Class330_Sub2) this).aClass262Array10076 = new Class262[3];
		((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079
		    = new Class528_Sub22_Sub1[3];
		if (aClass173_Sub1_3512.aBool9368) {
		    ((Class330_Sub2) this).aClass262Array10076[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap3D_1", -819444515);
		    ((Class330_Sub2) this).aClass262Array10076[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap3D_2", 322826555);
		    ((Class330_Sub2) this).aClass262Array10076[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap3D_3", -1261850465);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex3D_1", -1767119129);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex3D_2", -1659320221);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex3D_3", -1523353414);
		} else {
		    ((Class330_Sub2) this).aClass262Array10076[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap2D_1", -2135724081);
		    ((Class330_Sub2) this).aClass262Array10076[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap2D_2", -542446987);
		    ((Class330_Sub2) this).aClass262Array10076[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap2D_3", -484762452);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex2D_1", -1708576451);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex2D_2", -1732957025);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex2D_3", -1993813199);
		}
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10072
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("paramsWeightings", -2098268450);
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10081
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("pixelOffset", -1782617960);
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10082
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("PosAndTexCoords", -2118113496);
	    } catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
		return false;
	    } catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
		return false;
	    }
	    if (!((Class330_Sub2) this).aClass262Array10076[0].method3588()
		|| !((Class330_Sub2) this).aClass262Array10076[1].method3588()
		|| !((Class330_Sub2) this).aClass262Array10076[2].method3588())
		return false;
	    ((Class330_Sub2) this).aBool10083 = true;
	    return true;
	}
	return false;
    }
    
    boolean method4290() {
	return (aClass173_Sub1_3512.aBool9279
		&& aClass173_Sub1_3512.method8596());
    }
    
    boolean method4315() {
	if (method4274()) {
	    ((Class330_Sub2) this).aClass258_10078
		= aClass173_Sub1_3512.method8580("FilterColourRemapping");
	    if (((Class330_Sub2) this).aClass258_10078 == null)
		return false;
	    try {
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10080
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("sceneTex", -1689702091);
		((Class330_Sub2) this).aClass262Array10076 = new Class262[3];
		((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079
		    = new Class528_Sub22_Sub1[3];
		if (aClass173_Sub1_3512.aBool9368) {
		    ((Class330_Sub2) this).aClass262Array10076[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap3D_1", -1417573916);
		    ((Class330_Sub2) this).aClass262Array10076[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap3D_2", -1571929166);
		    ((Class330_Sub2) this).aClass262Array10076[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap3D_3", -1532795969);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex3D_1", -1574471903);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex3D_2", -1994614411);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex3D_3", -1715502996);
		} else {
		    ((Class330_Sub2) this).aClass262Array10076[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap2D_1", -1148033909);
		    ((Class330_Sub2) this).aClass262Array10076[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap2D_2", -1484600601);
		    ((Class330_Sub2) this).aClass262Array10076[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap2D_3", -567255761);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex2D_1", -2071167918);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex2D_2", -2061004010);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex2D_3", -1827926987);
		}
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10072
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("paramsWeightings", -1967616579);
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10081
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("pixelOffset", -1885926494);
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10082
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("PosAndTexCoords", -2017166984);
	    } catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
		return false;
	    } catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
		return false;
	    }
	    if (!((Class330_Sub2) this).aClass262Array10076[0].method3588()
		|| !((Class330_Sub2) this).aClass262Array10076[1].method3588()
		|| !((Class330_Sub2) this).aClass262Array10076[2].method3588())
		return false;
	    ((Class330_Sub2) this).aBool10083 = true;
	    return true;
	}
	return false;
    }
    
    boolean method4326() {
	return (anInt10074 == 0 || aFloat10073 == 1.0F
		|| (aFloatArray10077[0] + aFloatArray10077[1]
		    + aFloatArray10077[2]) == 0.0F
		|| (aClass162_Sub2Array10075[0] == null
		    && aClass162_Sub2Array10075[1] == null
		    && aClass162_Sub2Array10075[2] == null));
    }
    
    void method4278() {
	/* empty */
    }
    
    void method4302() {
	/* empty */
    }
    
    static {
	aFloat10073 = 1.0F;
	anInt10074 = 1;
	aClass162_Sub2Array10075 = new Class162_Sub2[] { null, null, null };
    }
    
    void method4285(int i, int i_17_) {
	/* empty */
    }
    
    void method4273(int i, Class163_Sub1 class163_sub1,
		    Interface34 interface34, Interface21 interface21,
		    Interface34 interface34_18_, boolean bool) {
	float f = aClass173_Sub1_3512.method8468();
	float f_19_ = (float) class163_sub1.method2074();
	float f_20_ = (float) class163_sub1.method2070();
	Interface34 interface34_21_ = interface34;
	float f_22_ = f * 2.0F / f_19_;
	float f_23_ = -f * 2.0F / f_20_;
	float[] fs = { -1.0F + f_22_, 1.0F + f_23_, 0.0F, 0.0F, -1.0F + f_22_,
		       -3.0F + f_23_, 0.0F, 2.0F, 3.0F + f_22_, 1.0F + f_23_,
		       2.0F, 0.0F };
	int i_24_ = (int) f_19_;
	int i_25_ = (int) f_20_;
	int i_26_
	    = (bool ? aClass173_Sub1_3512.method2357(-1569868274).method2074()
	       : i_24_);
	int i_27_
	    = (bool ? aClass173_Sub1_3512.method2357(-2028137609).method2070()
	       : i_25_);
	Class262 class262
	    = ((Class330_Sub2) this).aClass262Array10076[anInt10074 - 1];
	((Class330_Sub2) this).aClass258_10078.method3488(class262);
	((Class330_Sub2) this).aClass258_10078.method3478();
	((Class330_Sub2) this).aClass258_10078.method3493
	    (((Class330_Sub2) this).aClass528_Sub22_Sub1_10072, aFloat10073,
	     aFloatArray10077[0], aFloatArray10077[1], aFloatArray10077[2],
	     -1916092031);
	Object object = null;
	Object object_28_ = null;
	for (int i_29_ = 0; i_29_ < anInt10074; i_29_++) {
	    if (aClass162_Sub2Array10075[i_29_] != null) {
		Class528_Sub22_Sub1 class528_sub22_sub1
		    = (((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079
		       [i_29_]);
		Interface38 interface38
		    = aClass162_Sub2Array10075[i_29_].method8908();
		((Class330_Sub2) this).aClass258_10078.method3508
		    (class528_sub22_sub1, i_29_ + 1, interface38, 1567767216);
	    }
	}
	float f_30_ = (float) i_24_ / f_19_;
	float f_31_ = (float) i_25_ / f_20_;
	float f_32_ = (float) i_26_ / f_19_;
	float f_33_ = (float) i_27_ / f_20_;
	fs[8] = (fs[8] + 1.0F) * f_30_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_31_ + 1.0F;
	fs[10] *= f_32_;
	fs[7] *= f_33_;
	((Class330_Sub2) this).aClass258_10078.method3529
	    (((Class330_Sub2) this).aClass528_Sub22_Sub1_10082, fs, 208137250);
	((Class330_Sub2) this).aClass258_10078.method3508
	    (((Class330_Sub2) this).aClass528_Sub22_Sub1_10080, 0,
	     interface34_21_, 1380177319);
	((Class330_Sub2) this).aClass258_10078.method3493
	    (((Class330_Sub2) this).aClass528_Sub22_Sub1_10081, 0.0F, 0.0F,
	     0.0F, 0.0F, -1916092031);
	aClass173_Sub1_3512.method2275(0, 0, i_24_, i_25_);
    }
    
    boolean method4296() {
	if (method4274()) {
	    ((Class330_Sub2) this).aClass258_10078
		= aClass173_Sub1_3512.method8580("FilterColourRemapping");
	    if (((Class330_Sub2) this).aClass258_10078 == null)
		return false;
	    try {
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10080
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("sceneTex", -1939994622);
		((Class330_Sub2) this).aClass262Array10076 = new Class262[3];
		((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079
		    = new Class528_Sub22_Sub1[3];
		if (aClass173_Sub1_3512.aBool9368) {
		    ((Class330_Sub2) this).aClass262Array10076[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap3D_1", -501341619);
		    ((Class330_Sub2) this).aClass262Array10076[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap3D_2", -683239545);
		    ((Class330_Sub2) this).aClass262Array10076[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap3D_3", -1605093879);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex3D_1", -1749024302);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex3D_2", -1898626842);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex3D_3", -2137043758);
		} else {
		    ((Class330_Sub2) this).aClass262Array10076[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap2D_1", -1727406806);
		    ((Class330_Sub2) this).aClass262Array10076[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap2D_2", -465303789);
		    ((Class330_Sub2) this).aClass262Array10076[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap2D_3", -694602464);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex2D_1", -1568939068);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex2D_2", -1977915363);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex2D_3", -2087114340);
		}
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10072
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("paramsWeightings", -2027905589);
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10081
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("pixelOffset", -1608568571);
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10082
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("PosAndTexCoords", -1773131771);
	    } catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
		return false;
	    } catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
		return false;
	    }
	    if (!((Class330_Sub2) this).aClass262Array10076[0].method3588()
		|| !((Class330_Sub2) this).aClass262Array10076[1].method3588()
		|| !((Class330_Sub2) this).aClass262Array10076[2].method3588())
		return false;
	    ((Class330_Sub2) this).aBool10083 = true;
	    return true;
	}
	return false;
    }
    
    void method4288(int i, Class163_Sub1 class163_sub1,
		    Interface34 interface34, Interface21 interface21,
		    Interface34 interface34_34_, boolean bool) {
	float f = aClass173_Sub1_3512.method8468();
	float f_35_ = (float) class163_sub1.method2074();
	float f_36_ = (float) class163_sub1.method2070();
	Interface34 interface34_37_ = interface34;
	float f_38_ = f * 2.0F / f_35_;
	float f_39_ = -f * 2.0F / f_36_;
	float[] fs = { -1.0F + f_38_, 1.0F + f_39_, 0.0F, 0.0F, -1.0F + f_38_,
		       -3.0F + f_39_, 0.0F, 2.0F, 3.0F + f_38_, 1.0F + f_39_,
		       2.0F, 0.0F };
	int i_40_ = (int) f_35_;
	int i_41_ = (int) f_36_;
	int i_42_
	    = (bool ? aClass173_Sub1_3512.method2357(-1891087838).method2074()
	       : i_40_);
	int i_43_
	    = (bool ? aClass173_Sub1_3512.method2357(-1622313735).method2070()
	       : i_41_);
	Class262 class262
	    = ((Class330_Sub2) this).aClass262Array10076[anInt10074 - 1];
	((Class330_Sub2) this).aClass258_10078.method3488(class262);
	((Class330_Sub2) this).aClass258_10078.method3478();
	((Class330_Sub2) this).aClass258_10078.method3493
	    (((Class330_Sub2) this).aClass528_Sub22_Sub1_10072, aFloat10073,
	     aFloatArray10077[0], aFloatArray10077[1], aFloatArray10077[2],
	     -1916092031);
	Object object = null;
	Object object_44_ = null;
	for (int i_45_ = 0; i_45_ < anInt10074; i_45_++) {
	    if (aClass162_Sub2Array10075[i_45_] != null) {
		Class528_Sub22_Sub1 class528_sub22_sub1
		    = (((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079
		       [i_45_]);
		Interface38 interface38
		    = aClass162_Sub2Array10075[i_45_].method8908();
		((Class330_Sub2) this).aClass258_10078.method3508
		    (class528_sub22_sub1, i_45_ + 1, interface38, 1538003386);
	    }
	}
	float f_46_ = (float) i_40_ / f_35_;
	float f_47_ = (float) i_41_ / f_36_;
	float f_48_ = (float) i_42_ / f_35_;
	float f_49_ = (float) i_43_ / f_36_;
	fs[8] = (fs[8] + 1.0F) * f_46_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_47_ + 1.0F;
	fs[10] *= f_48_;
	fs[7] *= f_49_;
	((Class330_Sub2) this).aClass258_10078.method3529
	    (((Class330_Sub2) this).aClass528_Sub22_Sub1_10082, fs,
	     1233032585);
	((Class330_Sub2) this).aClass258_10078.method3508
	    (((Class330_Sub2) this).aClass528_Sub22_Sub1_10080, 0,
	     interface34_37_, 1815191961);
	((Class330_Sub2) this).aClass258_10078.method3493
	    (((Class330_Sub2) this).aClass528_Sub22_Sub1_10081, 0.0F, 0.0F,
	     0.0F, 0.0F, -1916092031);
	aClass173_Sub1_3512.method2275(0, 0, i_40_, i_41_);
    }
    
    void method4275(int i, Class163_Sub1 class163_sub1,
		    Interface34 interface34, Interface21 interface21,
		    Interface34 interface34_50_, boolean bool) {
	float f = aClass173_Sub1_3512.method8468();
	float f_51_ = (float) class163_sub1.method2074();
	float f_52_ = (float) class163_sub1.method2070();
	Interface34 interface34_53_ = interface34;
	float f_54_ = f * 2.0F / f_51_;
	float f_55_ = -f * 2.0F / f_52_;
	float[] fs = { -1.0F + f_54_, 1.0F + f_55_, 0.0F, 0.0F, -1.0F + f_54_,
		       -3.0F + f_55_, 0.0F, 2.0F, 3.0F + f_54_, 1.0F + f_55_,
		       2.0F, 0.0F };
	int i_56_ = (int) f_51_;
	int i_57_ = (int) f_52_;
	int i_58_
	    = (bool ? aClass173_Sub1_3512.method2357(-1819593110).method2074()
	       : i_56_);
	int i_59_
	    = (bool ? aClass173_Sub1_3512.method2357(-1358334096).method2070()
	       : i_57_);
	Class262 class262
	    = ((Class330_Sub2) this).aClass262Array10076[anInt10074 - 1];
	((Class330_Sub2) this).aClass258_10078.method3488(class262);
	((Class330_Sub2) this).aClass258_10078.method3478();
	((Class330_Sub2) this).aClass258_10078.method3493
	    (((Class330_Sub2) this).aClass528_Sub22_Sub1_10072, aFloat10073,
	     aFloatArray10077[0], aFloatArray10077[1], aFloatArray10077[2],
	     -1916092031);
	Object object = null;
	Object object_60_ = null;
	for (int i_61_ = 0; i_61_ < anInt10074; i_61_++) {
	    if (aClass162_Sub2Array10075[i_61_] != null) {
		Class528_Sub22_Sub1 class528_sub22_sub1
		    = (((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079
		       [i_61_]);
		Interface38 interface38
		    = aClass162_Sub2Array10075[i_61_].method8908();
		((Class330_Sub2) this).aClass258_10078.method3508
		    (class528_sub22_sub1, i_61_ + 1, interface38, 2120084185);
	    }
	}
	float f_62_ = (float) i_56_ / f_51_;
	float f_63_ = (float) i_57_ / f_52_;
	float f_64_ = (float) i_58_ / f_51_;
	float f_65_ = (float) i_59_ / f_52_;
	fs[8] = (fs[8] + 1.0F) * f_62_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_63_ + 1.0F;
	fs[10] *= f_64_;
	fs[7] *= f_65_;
	((Class330_Sub2) this).aClass258_10078.method3529
	    (((Class330_Sub2) this).aClass528_Sub22_Sub1_10082, fs,
	     1412084006);
	((Class330_Sub2) this).aClass258_10078.method3508
	    (((Class330_Sub2) this).aClass528_Sub22_Sub1_10080, 0,
	     interface34_53_, 1418897048);
	((Class330_Sub2) this).aClass258_10078.method3493
	    (((Class330_Sub2) this).aClass528_Sub22_Sub1_10081, 0.0F, 0.0F,
	     0.0F, 0.0F, -1916092031);
	aClass173_Sub1_3512.method2275(0, 0, i_56_, i_57_);
    }
    
    void method4309(int i, Class163_Sub1 class163_sub1,
		    Interface34 interface34, Interface21 interface21,
		    Interface34 interface34_66_, boolean bool) {
	float f = aClass173_Sub1_3512.method8468();
	float f_67_ = (float) class163_sub1.method2074();
	float f_68_ = (float) class163_sub1.method2070();
	Interface34 interface34_69_ = interface34;
	float f_70_ = f * 2.0F / f_67_;
	float f_71_ = -f * 2.0F / f_68_;
	float[] fs = { -1.0F + f_70_, 1.0F + f_71_, 0.0F, 0.0F, -1.0F + f_70_,
		       -3.0F + f_71_, 0.0F, 2.0F, 3.0F + f_70_, 1.0F + f_71_,
		       2.0F, 0.0F };
	int i_72_ = (int) f_67_;
	int i_73_ = (int) f_68_;
	int i_74_
	    = (bool ? aClass173_Sub1_3512.method2357(-1383389900).method2074()
	       : i_72_);
	int i_75_
	    = (bool ? aClass173_Sub1_3512.method2357(-2121324201).method2070()
	       : i_73_);
	Class262 class262
	    = ((Class330_Sub2) this).aClass262Array10076[anInt10074 - 1];
	((Class330_Sub2) this).aClass258_10078.method3488(class262);
	((Class330_Sub2) this).aClass258_10078.method3478();
	((Class330_Sub2) this).aClass258_10078.method3493
	    (((Class330_Sub2) this).aClass528_Sub22_Sub1_10072, aFloat10073,
	     aFloatArray10077[0], aFloatArray10077[1], aFloatArray10077[2],
	     -1916092031);
	Object object = null;
	Object object_76_ = null;
	for (int i_77_ = 0; i_77_ < anInt10074; i_77_++) {
	    if (aClass162_Sub2Array10075[i_77_] != null) {
		Class528_Sub22_Sub1 class528_sub22_sub1
		    = (((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079
		       [i_77_]);
		Interface38 interface38
		    = aClass162_Sub2Array10075[i_77_].method8908();
		((Class330_Sub2) this).aClass258_10078.method3508
		    (class528_sub22_sub1, i_77_ + 1, interface38, 2020490556);
	    }
	}
	float f_78_ = (float) i_72_ / f_67_;
	float f_79_ = (float) i_73_ / f_68_;
	float f_80_ = (float) i_74_ / f_67_;
	float f_81_ = (float) i_75_ / f_68_;
	fs[8] = (fs[8] + 1.0F) * f_78_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_79_ + 1.0F;
	fs[10] *= f_80_;
	fs[7] *= f_81_;
	((Class330_Sub2) this).aClass258_10078.method3529
	    (((Class330_Sub2) this).aClass528_Sub22_Sub1_10082, fs,
	     1413361122);
	((Class330_Sub2) this).aClass258_10078.method3508
	    (((Class330_Sub2) this).aClass528_Sub22_Sub1_10080, 0,
	     interface34_69_, 1684120407);
	((Class330_Sub2) this).aClass258_10078.method3493
	    (((Class330_Sub2) this).aClass528_Sub22_Sub1_10081, 0.0F, 0.0F,
	     0.0F, 0.0F, -1916092031);
	aClass173_Sub1_3512.method2275(0, 0, i_72_, i_73_);
    }
    
    void method4310(int i) {
	((Class330_Sub2) this).aClass258_10078.method3479();
    }
    
    boolean method4274() {
	return (aClass173_Sub1_3512.aBool9279
		&& aClass173_Sub1_3512.method8596());
    }
    
    int method4312() {
	return 2;
    }
    
    int method4304() {
	return 2;
    }
    
    void method4303(int i, int i_82_) {
	/* empty */
    }
    
    int method4305() {
	return 2;
    }
    
    int method4316() {
	return 0;
    }
    
    void method4306(int i, Class163_Sub1 class163_sub1,
		    Interface34 interface34, Interface21 interface21,
		    Interface34 interface34_83_, boolean bool) {
	float f = aClass173_Sub1_3512.method8468();
	float f_84_ = (float) class163_sub1.method2074();
	float f_85_ = (float) class163_sub1.method2070();
	Interface34 interface34_86_ = interface34;
	float f_87_ = f * 2.0F / f_84_;
	float f_88_ = -f * 2.0F / f_85_;
	float[] fs = { -1.0F + f_87_, 1.0F + f_88_, 0.0F, 0.0F, -1.0F + f_87_,
		       -3.0F + f_88_, 0.0F, 2.0F, 3.0F + f_87_, 1.0F + f_88_,
		       2.0F, 0.0F };
	int i_89_ = (int) f_84_;
	int i_90_ = (int) f_85_;
	int i_91_
	    = (bool ? aClass173_Sub1_3512.method2357(-1204477999).method2074()
	       : i_89_);
	int i_92_
	    = (bool ? aClass173_Sub1_3512.method2357(-1831761415).method2070()
	       : i_90_);
	Class262 class262
	    = ((Class330_Sub2) this).aClass262Array10076[anInt10074 - 1];
	((Class330_Sub2) this).aClass258_10078.method3488(class262);
	((Class330_Sub2) this).aClass258_10078.method3478();
	((Class330_Sub2) this).aClass258_10078.method3493
	    (((Class330_Sub2) this).aClass528_Sub22_Sub1_10072, aFloat10073,
	     aFloatArray10077[0], aFloatArray10077[1], aFloatArray10077[2],
	     -1916092031);
	Object object = null;
	Object object_93_ = null;
	for (int i_94_ = 0; i_94_ < anInt10074; i_94_++) {
	    if (aClass162_Sub2Array10075[i_94_] != null) {
		Class528_Sub22_Sub1 class528_sub22_sub1
		    = (((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079
		       [i_94_]);
		Interface38 interface38
		    = aClass162_Sub2Array10075[i_94_].method8908();
		((Class330_Sub2) this).aClass258_10078.method3508
		    (class528_sub22_sub1, i_94_ + 1, interface38, 2014252074);
	    }
	}
	float f_95_ = (float) i_89_ / f_84_;
	float f_96_ = (float) i_90_ / f_85_;
	float f_97_ = (float) i_91_ / f_84_;
	float f_98_ = (float) i_92_ / f_85_;
	fs[8] = (fs[8] + 1.0F) * f_95_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_96_ + 1.0F;
	fs[10] *= f_97_;
	fs[7] *= f_98_;
	((Class330_Sub2) this).aClass258_10078.method3529
	    (((Class330_Sub2) this).aClass528_Sub22_Sub1_10082, fs,
	     1239736875);
	((Class330_Sub2) this).aClass258_10078.method3508
	    (((Class330_Sub2) this).aClass528_Sub22_Sub1_10080, 0,
	     interface34_86_, 1750190089);
	((Class330_Sub2) this).aClass258_10078.method3493
	    (((Class330_Sub2) this).aClass528_Sub22_Sub1_10081, 0.0F, 0.0F,
	     0.0F, 0.0F, -1916092031);
	aClass173_Sub1_3512.method2275(0, 0, i_89_, i_90_);
    }
    
    int method4318() {
	return 0;
    }
    
    boolean method4295() {
	if (method4274()) {
	    ((Class330_Sub2) this).aClass258_10078
		= aClass173_Sub1_3512.method8580("FilterColourRemapping");
	    if (((Class330_Sub2) this).aClass258_10078 == null)
		return false;
	    try {
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10080
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("sceneTex", -1931213484);
		((Class330_Sub2) this).aClass262Array10076 = new Class262[3];
		((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079
		    = new Class528_Sub22_Sub1[3];
		if (aClass173_Sub1_3512.aBool9368) {
		    ((Class330_Sub2) this).aClass262Array10076[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap3D_1", -552843516);
		    ((Class330_Sub2) this).aClass262Array10076[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap3D_2", 32158232);
		    ((Class330_Sub2) this).aClass262Array10076[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap3D_3", -1650046937);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex3D_1", -1778278335);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex3D_2", -1897121021);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex3D_3", -1848713408);
		} else {
		    ((Class330_Sub2) this).aClass262Array10076[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap2D_1", 76970079);
		    ((Class330_Sub2) this).aClass262Array10076[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap2D_2", -493476892);
		    ((Class330_Sub2) this).aClass262Array10076[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3483("techRemap2D_3", -195587188);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[0]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex2D_1", -2123934142);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[1]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex2D_2", -1680585079);
		    ((Class330_Sub2) this).aClass528_Sub22_Sub1Array10079[2]
			= ((Class330_Sub2) this).aClass258_10078
			      .method3498("remapTex2D_3", -1706426534);
		}
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10072
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("paramsWeightings", -1788881951);
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10081
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("pixelOffset", -1624455626);
		((Class330_Sub2) this).aClass528_Sub22_Sub1_10082
		    = ((Class330_Sub2) this).aClass258_10078
			  .method3498("PosAndTexCoords", -1589572050);
	    } catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
		return false;
	    } catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
		return false;
	    }
	    if (!((Class330_Sub2) this).aClass262Array10076[0].method3588()
		|| !((Class330_Sub2) this).aClass262Array10076[1].method3588()
		|| !((Class330_Sub2) this).aClass262Array10076[2].method3588())
		return false;
	    ((Class330_Sub2) this).aBool10083 = true;
	    return true;
	}
	return false;
    }
    
    boolean method4314() {
	return (anInt10074 == 0 || aFloat10073 == 1.0F
		|| (aFloatArray10077[0] + aFloatArray10077[1]
		    + aFloatArray10077[2]) == 0.0F
		|| (aClass162_Sub2Array10075[0] == null
		    && aClass162_Sub2Array10075[1] == null
		    && aClass162_Sub2Array10075[2] == null));
    }
    
    int method4283() {
	return 2;
    }
}
