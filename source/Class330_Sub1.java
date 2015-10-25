/* Class330_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub1 extends Class330
{
    Class258 aClass258_10012;
    public static float aFloat10013;
    Class262 aClass262_10014;
    public static float aFloat10015;
    public static float aFloat10016;
    static final int anInt10017 = 256;
    Class262 aClass262_10018;
    boolean aBool10019;
    Class262 aClass262_10020;
    Class262 aClass262_10021;
    Class262 aClass262_10022;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_10023;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_10024;
    public static float aFloat10025 = 0.25F;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_10026;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_10027;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_10028;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_10029;
    
    boolean method4314() {
	return false;
    }
    
    boolean method4274() {
	return (aClass173_Sub1_3512.aBool9279
		&& aClass173_Sub1_3512.method8596()
		&& aClass173_Sub1_3512.method8449(true));
    }
    
    void method4300() {
	/* empty */
    }
    
    boolean method4286() {
	return (aClass173_Sub1_3512.aBool9279
		&& aClass173_Sub1_3512.method8596()
		&& aClass173_Sub1_3512.method8449(true));
    }
    
    void method4279(int i, int i_0_) {
	/* empty */
    }
    
    void method4308() {
	/* empty */
    }
    
    int method4282() {
	return 4;
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
	    = (bool ? aClass173_Sub1_3512.method2357(-1597228352).method2074()
	       : i_7_);
	int i_10_
	    = (bool ? aClass173_Sub1_3512.method2357(-1265975841).method2070()
	       : i_8_);
	if (i == 0) {
	    i_7_ = 256;
	    i_8_ = 256;
	    ((Class330_Sub1) this).aClass258_10012
		.method3488(((Class330_Sub1) this).aClass262_10014);
	    ((Class330_Sub1) this).aClass258_10012.method3478();
	} else if (i == 1) {
	    i_7_ = 256;
	    i_8_ = 256;
	    i_9_ = i_7_;
	    i_10_ = i_8_;
	    ((Class330_Sub1) this).aClass258_10012
		.method3488(((Class330_Sub1) this).aClass262_10020);
	    ((Class330_Sub1) this).aClass258_10012.method3478();
	    ((Class330_Sub1) this).aClass258_10012.method3492
		(((Class330_Sub1) this).aClass528_Sub22_Sub1_10026,
		 aFloat10016 / f_2_, 0.0F, -1297665588);
	} else if (i == 2) {
	    i_7_ = 256;
	    i_8_ = 256;
	    i_9_ = i_7_;
	    i_10_ = i_8_;
	    ((Class330_Sub1) this).aClass258_10012
		.method3488(((Class330_Sub1) this).aClass262_10020);
	    ((Class330_Sub1) this).aClass258_10012.method3478();
	    ((Class330_Sub1) this).aClass258_10012.method3492
		(((Class330_Sub1) this).aClass528_Sub22_Sub1_10026, 0.0F,
		 aFloat10016 / f_3_, -1297665588);
	} else if (i == 3) {
	    ((Class330_Sub1) this).aClass258_10012
		.method3488(((Class330_Sub1) this).aClass262_10021);
	    interface34_4_ = interface34_1_;
	    ((Class330_Sub1) this).aClass258_10012.method3508
		(((Class330_Sub1) this).aClass528_Sub22_Sub1_10024, 1,
		 interface34, 1384555595);
	    ((Class330_Sub1) this).aClass258_10012.method3478();
	}
	float f_11_ = (float) i_7_ / f_2_;
	float f_12_ = (float) i_8_ / f_3_;
	float f_13_ = (float) i_9_ / f_2_;
	float f_14_ = (float) i_10_ / f_3_;
	fs[8] = (fs[8] + 1.0F) * f_11_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_12_ + 1.0F;
	fs[10] *= f_13_;
	fs[7] *= f_14_;
	((Class330_Sub1) this).aClass258_10012.method3529
	    (((Class330_Sub1) this).aClass528_Sub22_Sub1_10028, fs,
	     1885980311);
	((Class330_Sub1) this).aClass258_10012.method3508
	    (((Class330_Sub1) this).aClass528_Sub22_Sub1_10023, 0,
	     interface34_4_, 1627934962);
	((Class330_Sub1) this).aClass258_10012.method3493
	    (((Class330_Sub1) this).aClass528_Sub22_Sub1_10029, aFloat10015,
	     aFloat10025, aFloat10013, 0.0F, -1916092031);
	((Class330_Sub1) this).aClass258_10012.method3493
	    (((Class330_Sub1) this).aClass528_Sub22_Sub1_10027, 0.0F, 0.0F,
	     256.0F / f_2_, 256.0F / f_3_, -1916092031);
	aClass173_Sub1_3512.method2275(0, 0, i_7_, i_8_);
    }
    
    int method4318() {
	return 1;
    }
    
    int method4327() {
	return 1;
    }
    
    int method4283() {
	return 0;
    }
    
    boolean method4287() {
	return false;
    }
    
    static {
	aFloat10013 = 1.0F;
	aFloat10015 = 1.0F;
	aFloat10016 = 1.0F;
    }
    
    void method4281(int i) {
	((Class330_Sub1) this).aClass258_10012.method3479();
    }
    
    boolean method4289() {
	return (aClass173_Sub1_3512.aBool9279
		&& aClass173_Sub1_3512.method8596()
		&& aClass173_Sub1_3512.method8449(true));
    }
    
    boolean method4290() {
	return (aClass173_Sub1_3512.aBool9279
		&& aClass173_Sub1_3512.method8596()
		&& aClass173_Sub1_3512.method8449(true));
    }
    
    boolean method4291() {
	return ((Class330_Sub1) this).aBool10019;
    }
    
    void method4285(int i, int i_15_) {
	/* empty */
    }
    
    boolean method4326() {
	return false;
    }
    
    boolean method4301() {
	if (method4274()) {
	    ((Class330_Sub1) this).aClass258_10012
		= aClass173_Sub1_3512.method8580("FilterBloom");
	    if (((Class330_Sub1) this).aClass258_10012 == null)
		return false;
	    try {
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10023
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("sceneTex", -1785723659);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10024
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("bloomTex1", -2089702383);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10029
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("params", -1940803030);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10026
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("sampleSize", -1993295666);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10027
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("pixelOffsetAndBloomScale", -1534133778);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10028
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("PosAndTexCoords", -1735008601);
		((Class330_Sub1) this).aClass258_10012.method3483("test",
								  -864332804);
		((Class330_Sub1) this).aClass262_10018
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("techFullscreenTri", -457007635);
		((Class330_Sub1) this).aClass262_10014
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("brightpass", 311428842);
		((Class330_Sub1) this).aClass262_10020
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("blur", -260964998);
		((Class330_Sub1) this).aClass262_10021
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("composite", -446939599);
		((Class330_Sub1) this).aClass262_10022
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("techDefault", -1932107616);
	    } catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
		return false;
	    } catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
		return false;
	    }
	    if (!((Class330_Sub1) this).aClass262_10018.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10014.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10020.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10021.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10022.method3588())
		return false;
	    ((Class330_Sub1) this).aBool10019 = true;
	    return true;
	}
	return false;
    }
    
    boolean method4294() {
	if (method4274()) {
	    ((Class330_Sub1) this).aClass258_10012
		= aClass173_Sub1_3512.method8580("FilterBloom");
	    if (((Class330_Sub1) this).aClass258_10012 == null)
		return false;
	    try {
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10023
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("sceneTex", -1829622215);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10024
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("bloomTex1", -2104310972);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10029
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("params", -1599021834);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10026
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("sampleSize", -1663172771);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10027
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("pixelOffsetAndBloomScale", -1731479382);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10028
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("PosAndTexCoords", -1566028278);
		((Class330_Sub1) this).aClass258_10012.method3483("test",
								  -1799903298);
		((Class330_Sub1) this).aClass262_10018
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("techFullscreenTri", -1529931418);
		((Class330_Sub1) this).aClass262_10014
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("brightpass", -208990574);
		((Class330_Sub1) this).aClass262_10020
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("blur", -6971041);
		((Class330_Sub1) this).aClass262_10021
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("composite", 56581626);
		((Class330_Sub1) this).aClass262_10022
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("techDefault", -1532072035);
	    } catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
		return false;
	    } catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
		return false;
	    }
	    if (!((Class330_Sub1) this).aClass262_10018.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10014.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10020.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10021.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10022.method3588())
		return false;
	    ((Class330_Sub1) this).aBool10019 = true;
	    return true;
	}
	return false;
    }
    
    boolean method4295() {
	if (method4274()) {
	    ((Class330_Sub1) this).aClass258_10012
		= aClass173_Sub1_3512.method8580("FilterBloom");
	    if (((Class330_Sub1) this).aClass258_10012 == null)
		return false;
	    try {
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10023
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("sceneTex", -2056944802);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10024
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("bloomTex1", -1919660857);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10029
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("params", -1852707292);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10026
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("sampleSize", -1621748477);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10027
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("pixelOffsetAndBloomScale", -1873426107);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10028
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("PosAndTexCoords", -1891049929);
		((Class330_Sub1) this).aClass258_10012.method3483("test",
								  -761199027);
		((Class330_Sub1) this).aClass262_10018
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("techFullscreenTri", 240954820);
		((Class330_Sub1) this).aClass262_10014
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("brightpass", -610067263);
		((Class330_Sub1) this).aClass262_10020
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("blur", -884696377);
		((Class330_Sub1) this).aClass262_10021
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("composite", 356881541);
		((Class330_Sub1) this).aClass262_10022
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("techDefault", -674320658);
	    } catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
		return false;
	    } catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
		return false;
	    }
	    if (!((Class330_Sub1) this).aClass262_10018.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10014.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10020.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10021.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10022.method3588())
		return false;
	    ((Class330_Sub1) this).aBool10019 = true;
	    return true;
	}
	return false;
    }
    
    boolean method4315() {
	if (method4274()) {
	    ((Class330_Sub1) this).aClass258_10012
		= aClass173_Sub1_3512.method8580("FilterBloom");
	    if (((Class330_Sub1) this).aClass258_10012 == null)
		return false;
	    try {
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10023
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("sceneTex", -1718140348);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10024
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("bloomTex1", -1985585015);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10029
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("params", -1650555084);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10026
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("sampleSize", -2086373655);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10027
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("pixelOffsetAndBloomScale", -1533782468);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10028
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("PosAndTexCoords", -1745528683);
		((Class330_Sub1) this).aClass258_10012.method3483("test",
								  -1468805292);
		((Class330_Sub1) this).aClass262_10018
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("techFullscreenTri", 41604536);
		((Class330_Sub1) this).aClass262_10014
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("brightpass", -990382276);
		((Class330_Sub1) this).aClass262_10020
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("blur", -1810025670);
		((Class330_Sub1) this).aClass262_10021
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("composite", -1022031225);
		((Class330_Sub1) this).aClass262_10022
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("techDefault", -1051561296);
	    } catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
		return false;
	    } catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
		return false;
	    }
	    if (!((Class330_Sub1) this).aClass262_10018.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10014.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10020.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10021.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10022.method3588())
		return false;
	    ((Class330_Sub1) this).aBool10019 = true;
	    return true;
	}
	return false;
    }
    
    public Class330_Sub1(Class173_Sub1 class173_sub1) {
	super(class173_sub1);
    }
    
    void method4278() {
	/* empty */
    }
    
    boolean method4296() {
	if (method4274()) {
	    ((Class330_Sub1) this).aClass258_10012
		= aClass173_Sub1_3512.method8580("FilterBloom");
	    if (((Class330_Sub1) this).aClass258_10012 == null)
		return false;
	    try {
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10023
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("sceneTex", -1697816504);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10024
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("bloomTex1", -1825570934);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10029
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("params", -1709918223);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10026
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("sampleSize", -1905056012);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10027
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("pixelOffsetAndBloomScale", -2105788873);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10028
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("PosAndTexCoords", -1590385711);
		((Class330_Sub1) this).aClass258_10012.method3483("test",
								  -1835880719);
		((Class330_Sub1) this).aClass262_10018
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("techFullscreenTri", -1610022790);
		((Class330_Sub1) this).aClass262_10014
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("brightpass", 411909167);
		((Class330_Sub1) this).aClass262_10020
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("blur", -9450353);
		((Class330_Sub1) this).aClass262_10021
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("composite", -1790155445);
		((Class330_Sub1) this).aClass262_10022
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("techDefault", 262906575);
	    } catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
		return false;
	    } catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
		return false;
	    }
	    if (!((Class330_Sub1) this).aClass262_10018.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10014.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10020.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10021.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10022.method3588())
		return false;
	    ((Class330_Sub1) this).aBool10019 = true;
	    return true;
	}
	return false;
    }
    
    int method4316() {
	return 1;
    }
    
    int method4305() {
	return 0;
    }
    
    void method4273(int i, Class163_Sub1 class163_sub1,
		    Interface34 interface34, Interface21 interface21,
		    Interface34 interface34_16_, boolean bool) {
	float f = aClass173_Sub1_3512.method8468();
	float f_17_ = (float) class163_sub1.method2074();
	float f_18_ = (float) class163_sub1.method2070();
	Interface34 interface34_19_ = interface34;
	float f_20_ = f * 2.0F / f_17_;
	float f_21_ = -f * 2.0F / f_18_;
	float[] fs = { -1.0F + f_20_, 1.0F + f_21_, 0.0F, 0.0F, -1.0F + f_20_,
		       -3.0F + f_21_, 0.0F, 2.0F, 3.0F + f_20_, 1.0F + f_21_,
		       2.0F, 0.0F };
	int i_22_ = (int) f_17_;
	int i_23_ = (int) f_18_;
	int i_24_
	    = (bool ? aClass173_Sub1_3512.method2357(-1927093518).method2074()
	       : i_22_);
	int i_25_
	    = (bool ? aClass173_Sub1_3512.method2357(-1575536839).method2070()
	       : i_23_);
	if (i == 0) {
	    i_22_ = 256;
	    i_23_ = 256;
	    ((Class330_Sub1) this).aClass258_10012
		.method3488(((Class330_Sub1) this).aClass262_10014);
	    ((Class330_Sub1) this).aClass258_10012.method3478();
	} else if (i == 1) {
	    i_22_ = 256;
	    i_23_ = 256;
	    i_24_ = i_22_;
	    i_25_ = i_23_;
	    ((Class330_Sub1) this).aClass258_10012
		.method3488(((Class330_Sub1) this).aClass262_10020);
	    ((Class330_Sub1) this).aClass258_10012.method3478();
	    ((Class330_Sub1) this).aClass258_10012.method3492
		(((Class330_Sub1) this).aClass528_Sub22_Sub1_10026,
		 aFloat10016 / f_17_, 0.0F, -1297665588);
	} else if (i == 2) {
	    i_22_ = 256;
	    i_23_ = 256;
	    i_24_ = i_22_;
	    i_25_ = i_23_;
	    ((Class330_Sub1) this).aClass258_10012
		.method3488(((Class330_Sub1) this).aClass262_10020);
	    ((Class330_Sub1) this).aClass258_10012.method3478();
	    ((Class330_Sub1) this).aClass258_10012.method3492
		(((Class330_Sub1) this).aClass528_Sub22_Sub1_10026, 0.0F,
		 aFloat10016 / f_18_, -1297665588);
	} else if (i == 3) {
	    ((Class330_Sub1) this).aClass258_10012
		.method3488(((Class330_Sub1) this).aClass262_10021);
	    interface34_19_ = interface34_16_;
	    ((Class330_Sub1) this).aClass258_10012.method3508
		(((Class330_Sub1) this).aClass528_Sub22_Sub1_10024, 1,
		 interface34, 1925928628);
	    ((Class330_Sub1) this).aClass258_10012.method3478();
	}
	float f_26_ = (float) i_22_ / f_17_;
	float f_27_ = (float) i_23_ / f_18_;
	float f_28_ = (float) i_24_ / f_17_;
	float f_29_ = (float) i_25_ / f_18_;
	fs[8] = (fs[8] + 1.0F) * f_26_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_27_ + 1.0F;
	fs[10] *= f_28_;
	fs[7] *= f_29_;
	((Class330_Sub1) this).aClass258_10012.method3529
	    (((Class330_Sub1) this).aClass528_Sub22_Sub1_10028, fs, 667628249);
	((Class330_Sub1) this).aClass258_10012.method3508
	    (((Class330_Sub1) this).aClass528_Sub22_Sub1_10023, 0,
	     interface34_19_, 1632866173);
	((Class330_Sub1) this).aClass258_10012.method3493
	    (((Class330_Sub1) this).aClass528_Sub22_Sub1_10029, aFloat10015,
	     aFloat10025, aFloat10013, 0.0F, -1916092031);
	((Class330_Sub1) this).aClass258_10012.method3493
	    (((Class330_Sub1) this).aClass528_Sub22_Sub1_10027, 0.0F, 0.0F,
	     256.0F / f_17_, 256.0F / f_18_, -1916092031);
	aClass173_Sub1_3512.method2275(0, 0, i_22_, i_23_);
    }
    
    void method4306(int i, Class163_Sub1 class163_sub1,
		    Interface34 interface34, Interface21 interface21,
		    Interface34 interface34_30_, boolean bool) {
	float f = aClass173_Sub1_3512.method8468();
	float f_31_ = (float) class163_sub1.method2074();
	float f_32_ = (float) class163_sub1.method2070();
	Interface34 interface34_33_ = interface34;
	float f_34_ = f * 2.0F / f_31_;
	float f_35_ = -f * 2.0F / f_32_;
	float[] fs = { -1.0F + f_34_, 1.0F + f_35_, 0.0F, 0.0F, -1.0F + f_34_,
		       -3.0F + f_35_, 0.0F, 2.0F, 3.0F + f_34_, 1.0F + f_35_,
		       2.0F, 0.0F };
	int i_36_ = (int) f_31_;
	int i_37_ = (int) f_32_;
	int i_38_
	    = (bool ? aClass173_Sub1_3512.method2357(-1458859285).method2074()
	       : i_36_);
	int i_39_
	    = (bool ? aClass173_Sub1_3512.method2357(-2101172982).method2070()
	       : i_37_);
	if (i == 0) {
	    i_36_ = 256;
	    i_37_ = 256;
	    ((Class330_Sub1) this).aClass258_10012
		.method3488(((Class330_Sub1) this).aClass262_10014);
	    ((Class330_Sub1) this).aClass258_10012.method3478();
	} else if (i == 1) {
	    i_36_ = 256;
	    i_37_ = 256;
	    i_38_ = i_36_;
	    i_39_ = i_37_;
	    ((Class330_Sub1) this).aClass258_10012
		.method3488(((Class330_Sub1) this).aClass262_10020);
	    ((Class330_Sub1) this).aClass258_10012.method3478();
	    ((Class330_Sub1) this).aClass258_10012.method3492
		(((Class330_Sub1) this).aClass528_Sub22_Sub1_10026,
		 aFloat10016 / f_31_, 0.0F, -1297665588);
	} else if (i == 2) {
	    i_36_ = 256;
	    i_37_ = 256;
	    i_38_ = i_36_;
	    i_39_ = i_37_;
	    ((Class330_Sub1) this).aClass258_10012
		.method3488(((Class330_Sub1) this).aClass262_10020);
	    ((Class330_Sub1) this).aClass258_10012.method3478();
	    ((Class330_Sub1) this).aClass258_10012.method3492
		(((Class330_Sub1) this).aClass528_Sub22_Sub1_10026, 0.0F,
		 aFloat10016 / f_32_, -1297665588);
	} else if (i == 3) {
	    ((Class330_Sub1) this).aClass258_10012
		.method3488(((Class330_Sub1) this).aClass262_10021);
	    interface34_33_ = interface34_30_;
	    ((Class330_Sub1) this).aClass258_10012.method3508
		(((Class330_Sub1) this).aClass528_Sub22_Sub1_10024, 1,
		 interface34, 2004833793);
	    ((Class330_Sub1) this).aClass258_10012.method3478();
	}
	float f_40_ = (float) i_36_ / f_31_;
	float f_41_ = (float) i_37_ / f_32_;
	float f_42_ = (float) i_38_ / f_31_;
	float f_43_ = (float) i_39_ / f_32_;
	fs[8] = (fs[8] + 1.0F) * f_40_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_41_ + 1.0F;
	fs[10] *= f_42_;
	fs[7] *= f_43_;
	((Class330_Sub1) this).aClass258_10012.method3529
	    (((Class330_Sub1) this).aClass528_Sub22_Sub1_10028, fs, 648538739);
	((Class330_Sub1) this).aClass258_10012.method3508
	    (((Class330_Sub1) this).aClass528_Sub22_Sub1_10023, 0,
	     interface34_33_, 1667956834);
	((Class330_Sub1) this).aClass258_10012.method3493
	    (((Class330_Sub1) this).aClass528_Sub22_Sub1_10029, aFloat10015,
	     aFloat10025, aFloat10013, 0.0F, -1916092031);
	((Class330_Sub1) this).aClass258_10012.method3493
	    (((Class330_Sub1) this).aClass528_Sub22_Sub1_10027, 0.0F, 0.0F,
	     256.0F / f_31_, 256.0F / f_32_, -1916092031);
	aClass173_Sub1_3512.method2275(0, 0, i_36_, i_37_);
    }
    
    void method4288(int i, Class163_Sub1 class163_sub1,
		    Interface34 interface34, Interface21 interface21,
		    Interface34 interface34_44_, boolean bool) {
	float f = aClass173_Sub1_3512.method8468();
	float f_45_ = (float) class163_sub1.method2074();
	float f_46_ = (float) class163_sub1.method2070();
	Interface34 interface34_47_ = interface34;
	float f_48_ = f * 2.0F / f_45_;
	float f_49_ = -f * 2.0F / f_46_;
	float[] fs = { -1.0F + f_48_, 1.0F + f_49_, 0.0F, 0.0F, -1.0F + f_48_,
		       -3.0F + f_49_, 0.0F, 2.0F, 3.0F + f_48_, 1.0F + f_49_,
		       2.0F, 0.0F };
	int i_50_ = (int) f_45_;
	int i_51_ = (int) f_46_;
	int i_52_
	    = (bool ? aClass173_Sub1_3512.method2357(-1265800277).method2074()
	       : i_50_);
	int i_53_
	    = (bool ? aClass173_Sub1_3512.method2357(-1840441382).method2070()
	       : i_51_);
	if (i == 0) {
	    i_50_ = 256;
	    i_51_ = 256;
	    ((Class330_Sub1) this).aClass258_10012
		.method3488(((Class330_Sub1) this).aClass262_10014);
	    ((Class330_Sub1) this).aClass258_10012.method3478();
	} else if (i == 1) {
	    i_50_ = 256;
	    i_51_ = 256;
	    i_52_ = i_50_;
	    i_53_ = i_51_;
	    ((Class330_Sub1) this).aClass258_10012
		.method3488(((Class330_Sub1) this).aClass262_10020);
	    ((Class330_Sub1) this).aClass258_10012.method3478();
	    ((Class330_Sub1) this).aClass258_10012.method3492
		(((Class330_Sub1) this).aClass528_Sub22_Sub1_10026,
		 aFloat10016 / f_45_, 0.0F, -1297665588);
	} else if (i == 2) {
	    i_50_ = 256;
	    i_51_ = 256;
	    i_52_ = i_50_;
	    i_53_ = i_51_;
	    ((Class330_Sub1) this).aClass258_10012
		.method3488(((Class330_Sub1) this).aClass262_10020);
	    ((Class330_Sub1) this).aClass258_10012.method3478();
	    ((Class330_Sub1) this).aClass258_10012.method3492
		(((Class330_Sub1) this).aClass528_Sub22_Sub1_10026, 0.0F,
		 aFloat10016 / f_46_, -1297665588);
	} else if (i == 3) {
	    ((Class330_Sub1) this).aClass258_10012
		.method3488(((Class330_Sub1) this).aClass262_10021);
	    interface34_47_ = interface34_44_;
	    ((Class330_Sub1) this).aClass258_10012.method3508
		(((Class330_Sub1) this).aClass528_Sub22_Sub1_10024, 1,
		 interface34, 2019291136);
	    ((Class330_Sub1) this).aClass258_10012.method3478();
	}
	float f_54_ = (float) i_50_ / f_45_;
	float f_55_ = (float) i_51_ / f_46_;
	float f_56_ = (float) i_52_ / f_45_;
	float f_57_ = (float) i_53_ / f_46_;
	fs[8] = (fs[8] + 1.0F) * f_54_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_55_ + 1.0F;
	fs[10] *= f_56_;
	fs[7] *= f_57_;
	((Class330_Sub1) this).aClass258_10012.method3529
	    (((Class330_Sub1) this).aClass528_Sub22_Sub1_10028, fs, 497909155);
	((Class330_Sub1) this).aClass258_10012.method3508
	    (((Class330_Sub1) this).aClass528_Sub22_Sub1_10023, 0,
	     interface34_47_, 1333848303);
	((Class330_Sub1) this).aClass258_10012.method3493
	    (((Class330_Sub1) this).aClass528_Sub22_Sub1_10029, aFloat10015,
	     aFloat10025, aFloat10013, 0.0F, -1916092031);
	((Class330_Sub1) this).aClass258_10012.method3493
	    (((Class330_Sub1) this).aClass528_Sub22_Sub1_10027, 0.0F, 0.0F,
	     256.0F / f_45_, 256.0F / f_46_, -1916092031);
	aClass173_Sub1_3512.method2275(0, 0, i_50_, i_51_);
    }
    
    void method4275(int i, Class163_Sub1 class163_sub1,
		    Interface34 interface34, Interface21 interface21,
		    Interface34 interface34_58_, boolean bool) {
	float f = aClass173_Sub1_3512.method8468();
	float f_59_ = (float) class163_sub1.method2074();
	float f_60_ = (float) class163_sub1.method2070();
	Interface34 interface34_61_ = interface34;
	float f_62_ = f * 2.0F / f_59_;
	float f_63_ = -f * 2.0F / f_60_;
	float[] fs = { -1.0F + f_62_, 1.0F + f_63_, 0.0F, 0.0F, -1.0F + f_62_,
		       -3.0F + f_63_, 0.0F, 2.0F, 3.0F + f_62_, 1.0F + f_63_,
		       2.0F, 0.0F };
	int i_64_ = (int) f_59_;
	int i_65_ = (int) f_60_;
	int i_66_
	    = (bool ? aClass173_Sub1_3512.method2357(-1805918267).method2074()
	       : i_64_);
	int i_67_
	    = (bool ? aClass173_Sub1_3512.method2357(-2034577086).method2070()
	       : i_65_);
	if (i == 0) {
	    i_64_ = 256;
	    i_65_ = 256;
	    ((Class330_Sub1) this).aClass258_10012
		.method3488(((Class330_Sub1) this).aClass262_10014);
	    ((Class330_Sub1) this).aClass258_10012.method3478();
	} else if (i == 1) {
	    i_64_ = 256;
	    i_65_ = 256;
	    i_66_ = i_64_;
	    i_67_ = i_65_;
	    ((Class330_Sub1) this).aClass258_10012
		.method3488(((Class330_Sub1) this).aClass262_10020);
	    ((Class330_Sub1) this).aClass258_10012.method3478();
	    ((Class330_Sub1) this).aClass258_10012.method3492
		(((Class330_Sub1) this).aClass528_Sub22_Sub1_10026,
		 aFloat10016 / f_59_, 0.0F, -1297665588);
	} else if (i == 2) {
	    i_64_ = 256;
	    i_65_ = 256;
	    i_66_ = i_64_;
	    i_67_ = i_65_;
	    ((Class330_Sub1) this).aClass258_10012
		.method3488(((Class330_Sub1) this).aClass262_10020);
	    ((Class330_Sub1) this).aClass258_10012.method3478();
	    ((Class330_Sub1) this).aClass258_10012.method3492
		(((Class330_Sub1) this).aClass528_Sub22_Sub1_10026, 0.0F,
		 aFloat10016 / f_60_, -1297665588);
	} else if (i == 3) {
	    ((Class330_Sub1) this).aClass258_10012
		.method3488(((Class330_Sub1) this).aClass262_10021);
	    interface34_61_ = interface34_58_;
	    ((Class330_Sub1) this).aClass258_10012.method3508
		(((Class330_Sub1) this).aClass528_Sub22_Sub1_10024, 1,
		 interface34, 1601391050);
	    ((Class330_Sub1) this).aClass258_10012.method3478();
	}
	float f_68_ = (float) i_64_ / f_59_;
	float f_69_ = (float) i_65_ / f_60_;
	float f_70_ = (float) i_66_ / f_59_;
	float f_71_ = (float) i_67_ / f_60_;
	fs[8] = (fs[8] + 1.0F) * f_68_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_69_ + 1.0F;
	fs[10] *= f_70_;
	fs[7] *= f_71_;
	((Class330_Sub1) this).aClass258_10012.method3529
	    (((Class330_Sub1) this).aClass528_Sub22_Sub1_10028, fs,
	     1365041727);
	((Class330_Sub1) this).aClass258_10012.method3508
	    (((Class330_Sub1) this).aClass528_Sub22_Sub1_10023, 0,
	     interface34_61_, 2119624776);
	((Class330_Sub1) this).aClass258_10012.method3493
	    (((Class330_Sub1) this).aClass528_Sub22_Sub1_10029, aFloat10015,
	     aFloat10025, aFloat10013, 0.0F, -1916092031);
	((Class330_Sub1) this).aClass258_10012.method3493
	    (((Class330_Sub1) this).aClass528_Sub22_Sub1_10027, 0.0F, 0.0F,
	     256.0F / f_59_, 256.0F / f_60_, -1916092031);
	aClass173_Sub1_3512.method2275(0, 0, i_64_, i_65_);
    }
    
    void method4309(int i, Class163_Sub1 class163_sub1,
		    Interface34 interface34, Interface21 interface21,
		    Interface34 interface34_72_, boolean bool) {
	float f = aClass173_Sub1_3512.method8468();
	float f_73_ = (float) class163_sub1.method2074();
	float f_74_ = (float) class163_sub1.method2070();
	Interface34 interface34_75_ = interface34;
	float f_76_ = f * 2.0F / f_73_;
	float f_77_ = -f * 2.0F / f_74_;
	float[] fs = { -1.0F + f_76_, 1.0F + f_77_, 0.0F, 0.0F, -1.0F + f_76_,
		       -3.0F + f_77_, 0.0F, 2.0F, 3.0F + f_76_, 1.0F + f_77_,
		       2.0F, 0.0F };
	int i_78_ = (int) f_73_;
	int i_79_ = (int) f_74_;
	int i_80_
	    = (bool ? aClass173_Sub1_3512.method2357(-1781977674).method2074()
	       : i_78_);
	int i_81_
	    = (bool ? aClass173_Sub1_3512.method2357(-2135604023).method2070()
	       : i_79_);
	if (i == 0) {
	    i_78_ = 256;
	    i_79_ = 256;
	    ((Class330_Sub1) this).aClass258_10012
		.method3488(((Class330_Sub1) this).aClass262_10014);
	    ((Class330_Sub1) this).aClass258_10012.method3478();
	} else if (i == 1) {
	    i_78_ = 256;
	    i_79_ = 256;
	    i_80_ = i_78_;
	    i_81_ = i_79_;
	    ((Class330_Sub1) this).aClass258_10012
		.method3488(((Class330_Sub1) this).aClass262_10020);
	    ((Class330_Sub1) this).aClass258_10012.method3478();
	    ((Class330_Sub1) this).aClass258_10012.method3492
		(((Class330_Sub1) this).aClass528_Sub22_Sub1_10026,
		 aFloat10016 / f_73_, 0.0F, -1297665588);
	} else if (i == 2) {
	    i_78_ = 256;
	    i_79_ = 256;
	    i_80_ = i_78_;
	    i_81_ = i_79_;
	    ((Class330_Sub1) this).aClass258_10012
		.method3488(((Class330_Sub1) this).aClass262_10020);
	    ((Class330_Sub1) this).aClass258_10012.method3478();
	    ((Class330_Sub1) this).aClass258_10012.method3492
		(((Class330_Sub1) this).aClass528_Sub22_Sub1_10026, 0.0F,
		 aFloat10016 / f_74_, -1297665588);
	} else if (i == 3) {
	    ((Class330_Sub1) this).aClass258_10012
		.method3488(((Class330_Sub1) this).aClass262_10021);
	    interface34_75_ = interface34_72_;
	    ((Class330_Sub1) this).aClass258_10012.method3508
		(((Class330_Sub1) this).aClass528_Sub22_Sub1_10024, 1,
		 interface34, 1619484804);
	    ((Class330_Sub1) this).aClass258_10012.method3478();
	}
	float f_82_ = (float) i_78_ / f_73_;
	float f_83_ = (float) i_79_ / f_74_;
	float f_84_ = (float) i_80_ / f_73_;
	float f_85_ = (float) i_81_ / f_74_;
	fs[8] = (fs[8] + 1.0F) * f_82_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_83_ + 1.0F;
	fs[10] *= f_84_;
	fs[7] *= f_85_;
	((Class330_Sub1) this).aClass258_10012.method3529
	    (((Class330_Sub1) this).aClass528_Sub22_Sub1_10028, fs,
	     1507578709);
	((Class330_Sub1) this).aClass258_10012.method3508
	    (((Class330_Sub1) this).aClass528_Sub22_Sub1_10023, 0,
	     interface34_75_, 1850941576);
	((Class330_Sub1) this).aClass258_10012.method3493
	    (((Class330_Sub1) this).aClass528_Sub22_Sub1_10029, aFloat10015,
	     aFloat10025, aFloat10013, 0.0F, -1916092031);
	((Class330_Sub1) this).aClass258_10012.method3493
	    (((Class330_Sub1) this).aClass528_Sub22_Sub1_10027, 0.0F, 0.0F,
	     256.0F / f_73_, 256.0F / f_74_, -1916092031);
	aClass173_Sub1_3512.method2275(0, 0, i_78_, i_79_);
    }
    
    void method4310(int i) {
	((Class330_Sub1) this).aClass258_10012.method3479();
    }
    
    boolean method4307() {
	if (method4274()) {
	    ((Class330_Sub1) this).aClass258_10012
		= aClass173_Sub1_3512.method8580("FilterBloom");
	    if (((Class330_Sub1) this).aClass258_10012 == null)
		return false;
	    try {
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10023
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("sceneTex", -1883714002);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10024
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("bloomTex1", -1861189308);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10029
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("params", -1846400458);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10026
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("sampleSize", -1818601794);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10027
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("pixelOffsetAndBloomScale", -1821844526);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10028
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("PosAndTexCoords", -1817208195);
		((Class330_Sub1) this).aClass258_10012.method3483("test",
								  -240394852);
		((Class330_Sub1) this).aClass262_10018
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("techFullscreenTri", -1802620137);
		((Class330_Sub1) this).aClass262_10014
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("brightpass", -107437639);
		((Class330_Sub1) this).aClass262_10020
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("blur", -1639328473);
		((Class330_Sub1) this).aClass262_10021
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("composite", -548449713);
		((Class330_Sub1) this).aClass262_10022
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("techDefault", -421592805);
	    } catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
		return false;
	    } catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
		return false;
	    }
	    if (!((Class330_Sub1) this).aClass262_10018.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10014.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10020.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10021.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10022.method3588())
		return false;
	    ((Class330_Sub1) this).aBool10019 = true;
	    return true;
	}
	return false;
    }
    
    void method4303(int i, int i_86_) {
	/* empty */
    }
    
    int method4304() {
	return 0;
    }
    
    boolean method4292() {
	if (method4274()) {
	    ((Class330_Sub1) this).aClass258_10012
		= aClass173_Sub1_3512.method8580("FilterBloom");
	    if (((Class330_Sub1) this).aClass258_10012 == null)
		return false;
	    try {
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10023
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("sceneTex", -1677515126);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10024
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("bloomTex1", -2138287078);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10029
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("params", -2060180332);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10026
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("sampleSize", -1651326500);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10027
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("pixelOffsetAndBloomScale", -1833941751);
		((Class330_Sub1) this).aClass528_Sub22_Sub1_10028
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3498("PosAndTexCoords", -1903900430);
		((Class330_Sub1) this).aClass258_10012.method3483("test",
								  -1735128473);
		((Class330_Sub1) this).aClass262_10018
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("techFullscreenTri", -1624784212);
		((Class330_Sub1) this).aClass262_10014
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("brightpass", -1694428560);
		((Class330_Sub1) this).aClass262_10020
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("blur", -62802807);
		((Class330_Sub1) this).aClass262_10021
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("composite", -445092367);
		((Class330_Sub1) this).aClass262_10022
		    = ((Class330_Sub1) this).aClass258_10012
			  .method3483("techDefault", 421361346);
	    } catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
		return false;
	    } catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
		return false;
	    }
	    if (!((Class330_Sub1) this).aClass262_10018.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10014.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10020.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10021.method3588())
		return false;
	    if (!((Class330_Sub1) this).aClass262_10022.method3588())
		return false;
	    ((Class330_Sub1) this).aBool10019 = true;
	    return true;
	}
	return false;
    }
    
    int method4297() {
	return 0;
    }
    
    int method4311() {
	return 4;
    }
    
    int method4284() {
	return 1;
    }
    
    void method4302() {
	/* empty */
    }
    
    int method4312() {
	return 0;
    }
    
    boolean method4276() {
	return ((Class330_Sub1) this).aBool10019;
    }
    
    boolean method4328() {
	return false;
    }
}
