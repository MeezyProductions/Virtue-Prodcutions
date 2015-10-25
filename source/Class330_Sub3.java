/* Class330_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub3 extends Class330
{
    boolean aBool10085;
    Class262 aClass262_10086;
    public static float aFloat10087;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_10088;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_10089;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_10090;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_10091;
    public static float aFloat10092;
    public static float aFloat10093;
    Class258 aClass258_10094;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_10095;
    public static float aFloat10096;
    public static float aFloat10097 = 1.0F;
    
    void method4310(int i) {
	((Class330_Sub3) this).aClass258_10094.method3479();
    }
    
    public Class330_Sub3(Class173_Sub1 class173_sub1) {
	super(class173_sub1);
    }
    
    int method4284() {
	return 0;
    }
    
    boolean method4296() {
	if (method4274()) {
	    ((Class330_Sub3) this).aClass258_10094
		= aClass173_Sub1_3512.method8580("FilterLevels");
	    if (((Class330_Sub3) this).aClass258_10094 == null)
		return false;
	    try {
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10091
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("sceneTex", -2059223076);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10088
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("paramsGamma", -1711676828);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10089
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("paramsRanges", -1956047683);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10090
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("pixelOffset", -1561837687);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10095
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("PosAndTexCoords", -1623041725);
		((Class330_Sub3) this).aClass262_10086
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3483("techAdjust", 359193685);
	    } catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
		return false;
	    } catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
		return false;
	    }
	    if (!((Class330_Sub3) this).aClass262_10086.method3588())
		return false;
	    ((Class330_Sub3) this).aBool10085 = true;
	    return true;
	}
	return false;
    }
    
    boolean method4326() {
	return (aFloat10097 == 1.0F && aFloat10093 == 0.0F
		&& aFloat10087 == 1.0F && aFloat10092 == 0.0F
		&& aFloat10096 == 1.0F);
    }
    
    boolean method4274() {
	return (aClass173_Sub1_3512.aBool9279
		&& aClass173_Sub1_3512.method8596());
    }
    
    void method4281(int i) {
	((Class330_Sub3) this).aClass258_10094.method3479();
    }
    
    void method4280(int i, Class163_Sub1 class163_sub1,
		    Interface34 interface34, Interface21 interface21,
		    Interface34 interface34_0_, boolean bool) {
	float f = aClass173_Sub1_3512.method8468();
	float f_1_ = (float) class163_sub1.method2074();
	float f_2_ = (float) class163_sub1.method2070();
	float f_3_ = f * 2.0F / f_1_;
	float f_4_ = -f * 2.0F / f_2_;
	float[] fs = { -1.0F + f_3_, 1.0F + f_4_, 0.0F, 0.0F, -1.0F + f_3_,
		       -3.0F + f_4_, 0.0F, 2.0F, 3.0F + f_3_, 1.0F + f_4_,
		       2.0F, 0.0F };
	int i_5_ = (int) f_1_;
	int i_6_ = (int) f_2_;
	int i_7_
	    = (bool ? aClass173_Sub1_3512.method2357(-2087846765).method2074()
	       : i_5_);
	int i_8_
	    = (bool ? aClass173_Sub1_3512.method2357(-2008862372).method2070()
	       : i_6_);
	((Class330_Sub3) this).aClass258_10094
	    .method3488(((Class330_Sub3) this).aClass262_10086);
	((Class330_Sub3) this).aClass258_10094.method3478();
	float f_9_ = (float) i_5_ / f_1_;
	float f_10_ = (float) i_6_ / f_2_;
	float f_11_ = (float) i_7_ / f_1_;
	float f_12_ = (float) i_8_ / f_2_;
	fs[8] = (fs[8] + 1.0F) * f_9_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_10_ + 1.0F;
	fs[10] *= f_11_;
	fs[7] *= f_12_;
	((Class330_Sub3) this).aClass258_10094.method3529
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10095, fs, 930670198);
	((Class330_Sub3) this).aClass258_10094.method3508
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10091, 0, interface34,
	     1448556091);
	((Class330_Sub3) this).aClass258_10094.method3491
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10088, aFloat10097,
	     928248576);
	((Class330_Sub3) this).aClass258_10094.method3493
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10089, aFloat10093,
	     aFloat10087, aFloat10092, aFloat10096, -1916092031);
	((Class330_Sub3) this).aClass258_10094.method3493
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10090, 0.0F, 0.0F,
	     0.0F, 0.0F, -1916092031);
	aClass173_Sub1_3512.method2275(0, 0, i_5_, i_6_);
    }
    
    void method4278() {
	/* empty */
    }
    
    int method4283() {
	return 1;
    }
    
    void method4279(int i, int i_13_) {
	/* empty */
    }
    
    void method4308() {
	/* empty */
    }
    
    static {
	aFloat10093 = 0.0F;
	aFloat10087 = 1.0F;
	aFloat10092 = 0.0F;
	aFloat10096 = 1.0F;
    }
    
    boolean method4286() {
	return (aClass173_Sub1_3512.aBool9279
		&& aClass173_Sub1_3512.method8596());
    }
    
    int method4282() {
	return 1;
    }
    
    boolean method4290() {
	return (aClass173_Sub1_3512.aBool9279
		&& aClass173_Sub1_3512.method8596());
    }
    
    boolean method4291() {
	return ((Class330_Sub3) this).aBool10085;
    }
    
    boolean method4292() {
	if (method4274()) {
	    ((Class330_Sub3) this).aClass258_10094
		= aClass173_Sub1_3512.method8580("FilterLevels");
	    if (((Class330_Sub3) this).aClass258_10094 == null)
		return false;
	    try {
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10091
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("sceneTex", -2022074386);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10088
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("paramsGamma", -1850286631);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10089
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("paramsRanges", -1955586761);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10090
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("pixelOffset", -1712007150);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10095
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("PosAndTexCoords", -1899266246);
		((Class330_Sub3) this).aClass262_10086
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3483("techAdjust", -653349313);
	    } catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
		return false;
	    } catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
		return false;
	    }
	    if (!((Class330_Sub3) this).aClass262_10086.method3588())
		return false;
	    ((Class330_Sub3) this).aBool10085 = true;
	    return true;
	}
	return false;
    }
    
    boolean method4307() {
	if (method4274()) {
	    ((Class330_Sub3) this).aClass258_10094
		= aClass173_Sub1_3512.method8580("FilterLevels");
	    if (((Class330_Sub3) this).aClass258_10094 == null)
		return false;
	    try {
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10091
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("sceneTex", -1793645168);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10088
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("paramsGamma", -1960452515);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10089
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("paramsRanges", -1663899617);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10090
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("pixelOffset", -1917688343);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10095
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("PosAndTexCoords", -1683677128);
		((Class330_Sub3) this).aClass262_10086
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3483("techAdjust", 32261400);
	    } catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
		return false;
	    } catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
		return false;
	    }
	    if (!((Class330_Sub3) this).aClass262_10086.method3588())
		return false;
	    ((Class330_Sub3) this).aBool10085 = true;
	    return true;
	}
	return false;
    }
    
    int method4327() {
	return 0;
    }
    
    boolean method4289() {
	return (aClass173_Sub1_3512.aBool9279
		&& aClass173_Sub1_3512.method8596());
    }
    
    int method4318() {
	return 0;
    }
    
    boolean method4295() {
	if (method4274()) {
	    ((Class330_Sub3) this).aClass258_10094
		= aClass173_Sub1_3512.method8580("FilterLevels");
	    if (((Class330_Sub3) this).aClass258_10094 == null)
		return false;
	    try {
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10091
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("sceneTex", -1611779878);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10088
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("paramsGamma", -1839574158);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10089
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("paramsRanges", -2055221811);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10090
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("pixelOffset", -2016353945);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10095
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("PosAndTexCoords", -1531760731);
		((Class330_Sub3) this).aClass262_10086
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3483("techAdjust", -424101090);
	    } catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
		return false;
	    } catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
		return false;
	    }
	    if (!((Class330_Sub3) this).aClass262_10086.method3588())
		return false;
	    ((Class330_Sub3) this).aBool10085 = true;
	    return true;
	}
	return false;
    }
    
    void method4300() {
	/* empty */
    }
    
    boolean method4276() {
	return ((Class330_Sub3) this).aBool10085;
    }
    
    void method4302() {
	/* empty */
    }
    
    void method4303(int i, int i_14_) {
	/* empty */
    }
    
    void method4285(int i, int i_15_) {
	/* empty */
    }
    
    void method4273(int i, Class163_Sub1 class163_sub1,
		    Interface34 interface34, Interface21 interface21,
		    Interface34 interface34_16_, boolean bool) {
	float f = aClass173_Sub1_3512.method8468();
	float f_17_ = (float) class163_sub1.method2074();
	float f_18_ = (float) class163_sub1.method2070();
	float f_19_ = f * 2.0F / f_17_;
	float f_20_ = -f * 2.0F / f_18_;
	float[] fs = { -1.0F + f_19_, 1.0F + f_20_, 0.0F, 0.0F, -1.0F + f_19_,
		       -3.0F + f_20_, 0.0F, 2.0F, 3.0F + f_19_, 1.0F + f_20_,
		       2.0F, 0.0F };
	int i_21_ = (int) f_17_;
	int i_22_ = (int) f_18_;
	int i_23_
	    = (bool ? aClass173_Sub1_3512.method2357(-1334989340).method2074()
	       : i_21_);
	int i_24_
	    = (bool ? aClass173_Sub1_3512.method2357(-1302802567).method2070()
	       : i_22_);
	((Class330_Sub3) this).aClass258_10094
	    .method3488(((Class330_Sub3) this).aClass262_10086);
	((Class330_Sub3) this).aClass258_10094.method3478();
	float f_25_ = (float) i_21_ / f_17_;
	float f_26_ = (float) i_22_ / f_18_;
	float f_27_ = (float) i_23_ / f_17_;
	float f_28_ = (float) i_24_ / f_18_;
	fs[8] = (fs[8] + 1.0F) * f_25_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_26_ + 1.0F;
	fs[10] *= f_27_;
	fs[7] *= f_28_;
	((Class330_Sub3) this).aClass258_10094.method3529
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10095, fs, -27662965);
	((Class330_Sub3) this).aClass258_10094.method3508
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10091, 0, interface34,
	     2120161282);
	((Class330_Sub3) this).aClass258_10094.method3491
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10088, aFloat10097,
	     917385055);
	((Class330_Sub3) this).aClass258_10094.method3493
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10089, aFloat10093,
	     aFloat10087, aFloat10092, aFloat10096, -1916092031);
	((Class330_Sub3) this).aClass258_10094.method3493
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10090, 0.0F, 0.0F,
	     0.0F, 0.0F, -1916092031);
	aClass173_Sub1_3512.method2275(0, 0, i_21_, i_22_);
    }
    
    void method4306(int i, Class163_Sub1 class163_sub1,
		    Interface34 interface34, Interface21 interface21,
		    Interface34 interface34_29_, boolean bool) {
	float f = aClass173_Sub1_3512.method8468();
	float f_30_ = (float) class163_sub1.method2074();
	float f_31_ = (float) class163_sub1.method2070();
	float f_32_ = f * 2.0F / f_30_;
	float f_33_ = -f * 2.0F / f_31_;
	float[] fs = { -1.0F + f_32_, 1.0F + f_33_, 0.0F, 0.0F, -1.0F + f_32_,
		       -3.0F + f_33_, 0.0F, 2.0F, 3.0F + f_32_, 1.0F + f_33_,
		       2.0F, 0.0F };
	int i_34_ = (int) f_30_;
	int i_35_ = (int) f_31_;
	int i_36_
	    = (bool ? aClass173_Sub1_3512.method2357(-1484530499).method2074()
	       : i_34_);
	int i_37_
	    = (bool ? aClass173_Sub1_3512.method2357(-1339470876).method2070()
	       : i_35_);
	((Class330_Sub3) this).aClass258_10094
	    .method3488(((Class330_Sub3) this).aClass262_10086);
	((Class330_Sub3) this).aClass258_10094.method3478();
	float f_38_ = (float) i_34_ / f_30_;
	float f_39_ = (float) i_35_ / f_31_;
	float f_40_ = (float) i_36_ / f_30_;
	float f_41_ = (float) i_37_ / f_31_;
	fs[8] = (fs[8] + 1.0F) * f_38_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_39_ + 1.0F;
	fs[10] *= f_40_;
	fs[7] *= f_41_;
	((Class330_Sub3) this).aClass258_10094.method3529
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10095, fs,
	     -327183012);
	((Class330_Sub3) this).aClass258_10094.method3508
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10091, 0, interface34,
	     2094504543);
	((Class330_Sub3) this).aClass258_10094.method3491
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10088, aFloat10097,
	     1115878460);
	((Class330_Sub3) this).aClass258_10094.method3493
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10089, aFloat10093,
	     aFloat10087, aFloat10092, aFloat10096, -1916092031);
	((Class330_Sub3) this).aClass258_10094.method3493
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10090, 0.0F, 0.0F,
	     0.0F, 0.0F, -1916092031);
	aClass173_Sub1_3512.method2275(0, 0, i_34_, i_35_);
    }
    
    void method4288(int i, Class163_Sub1 class163_sub1,
		    Interface34 interface34, Interface21 interface21,
		    Interface34 interface34_42_, boolean bool) {
	float f = aClass173_Sub1_3512.method8468();
	float f_43_ = (float) class163_sub1.method2074();
	float f_44_ = (float) class163_sub1.method2070();
	float f_45_ = f * 2.0F / f_43_;
	float f_46_ = -f * 2.0F / f_44_;
	float[] fs = { -1.0F + f_45_, 1.0F + f_46_, 0.0F, 0.0F, -1.0F + f_45_,
		       -3.0F + f_46_, 0.0F, 2.0F, 3.0F + f_45_, 1.0F + f_46_,
		       2.0F, 0.0F };
	int i_47_ = (int) f_43_;
	int i_48_ = (int) f_44_;
	int i_49_
	    = (bool ? aClass173_Sub1_3512.method2357(-2107655018).method2074()
	       : i_47_);
	int i_50_
	    = (bool ? aClass173_Sub1_3512.method2357(-1507629450).method2070()
	       : i_48_);
	((Class330_Sub3) this).aClass258_10094
	    .method3488(((Class330_Sub3) this).aClass262_10086);
	((Class330_Sub3) this).aClass258_10094.method3478();
	float f_51_ = (float) i_47_ / f_43_;
	float f_52_ = (float) i_48_ / f_44_;
	float f_53_ = (float) i_49_ / f_43_;
	float f_54_ = (float) i_50_ / f_44_;
	fs[8] = (fs[8] + 1.0F) * f_51_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_52_ + 1.0F;
	fs[10] *= f_53_;
	fs[7] *= f_54_;
	((Class330_Sub3) this).aClass258_10094.method3529
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10095, fs,
	     -401055643);
	((Class330_Sub3) this).aClass258_10094.method3508
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10091, 0, interface34,
	     1622065204);
	((Class330_Sub3) this).aClass258_10094.method3491
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10088, aFloat10097,
	     1287745058);
	((Class330_Sub3) this).aClass258_10094.method3493
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10089, aFloat10093,
	     aFloat10087, aFloat10092, aFloat10096, -1916092031);
	((Class330_Sub3) this).aClass258_10094.method3493
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10090, 0.0F, 0.0F,
	     0.0F, 0.0F, -1916092031);
	aClass173_Sub1_3512.method2275(0, 0, i_47_, i_48_);
    }
    
    void method4275(int i, Class163_Sub1 class163_sub1,
		    Interface34 interface34, Interface21 interface21,
		    Interface34 interface34_55_, boolean bool) {
	float f = aClass173_Sub1_3512.method8468();
	float f_56_ = (float) class163_sub1.method2074();
	float f_57_ = (float) class163_sub1.method2070();
	float f_58_ = f * 2.0F / f_56_;
	float f_59_ = -f * 2.0F / f_57_;
	float[] fs = { -1.0F + f_58_, 1.0F + f_59_, 0.0F, 0.0F, -1.0F + f_58_,
		       -3.0F + f_59_, 0.0F, 2.0F, 3.0F + f_58_, 1.0F + f_59_,
		       2.0F, 0.0F };
	int i_60_ = (int) f_56_;
	int i_61_ = (int) f_57_;
	int i_62_
	    = (bool ? aClass173_Sub1_3512.method2357(-1913929777).method2074()
	       : i_60_);
	int i_63_
	    = (bool ? aClass173_Sub1_3512.method2357(-1908002898).method2070()
	       : i_61_);
	((Class330_Sub3) this).aClass258_10094
	    .method3488(((Class330_Sub3) this).aClass262_10086);
	((Class330_Sub3) this).aClass258_10094.method3478();
	float f_64_ = (float) i_60_ / f_56_;
	float f_65_ = (float) i_61_ / f_57_;
	float f_66_ = (float) i_62_ / f_56_;
	float f_67_ = (float) i_63_ / f_57_;
	fs[8] = (fs[8] + 1.0F) * f_64_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_65_ + 1.0F;
	fs[10] *= f_66_;
	fs[7] *= f_67_;
	((Class330_Sub3) this).aClass258_10094.method3529
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10095, fs, 315918930);
	((Class330_Sub3) this).aClass258_10094.method3508
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10091, 0, interface34,
	     2001584974);
	((Class330_Sub3) this).aClass258_10094.method3491
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10088, aFloat10097,
	     1784159281);
	((Class330_Sub3) this).aClass258_10094.method3493
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10089, aFloat10093,
	     aFloat10087, aFloat10092, aFloat10096, -1916092031);
	((Class330_Sub3) this).aClass258_10094.method3493
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10090, 0.0F, 0.0F,
	     0.0F, 0.0F, -1916092031);
	aClass173_Sub1_3512.method2275(0, 0, i_60_, i_61_);
    }
    
    void method4309(int i, Class163_Sub1 class163_sub1,
		    Interface34 interface34, Interface21 interface21,
		    Interface34 interface34_68_, boolean bool) {
	float f = aClass173_Sub1_3512.method8468();
	float f_69_ = (float) class163_sub1.method2074();
	float f_70_ = (float) class163_sub1.method2070();
	float f_71_ = f * 2.0F / f_69_;
	float f_72_ = -f * 2.0F / f_70_;
	float[] fs = { -1.0F + f_71_, 1.0F + f_72_, 0.0F, 0.0F, -1.0F + f_71_,
		       -3.0F + f_72_, 0.0F, 2.0F, 3.0F + f_71_, 1.0F + f_72_,
		       2.0F, 0.0F };
	int i_73_ = (int) f_69_;
	int i_74_ = (int) f_70_;
	int i_75_
	    = (bool ? aClass173_Sub1_3512.method2357(-1293479889).method2074()
	       : i_73_);
	int i_76_
	    = (bool ? aClass173_Sub1_3512.method2357(-1224948060).method2070()
	       : i_74_);
	((Class330_Sub3) this).aClass258_10094
	    .method3488(((Class330_Sub3) this).aClass262_10086);
	((Class330_Sub3) this).aClass258_10094.method3478();
	float f_77_ = (float) i_73_ / f_69_;
	float f_78_ = (float) i_74_ / f_70_;
	float f_79_ = (float) i_75_ / f_69_;
	float f_80_ = (float) i_76_ / f_70_;
	fs[8] = (fs[8] + 1.0F) * f_77_ - 1.0F;
	fs[5] = (fs[5] - 1.0F) * f_78_ + 1.0F;
	fs[10] *= f_79_;
	fs[7] *= f_80_;
	((Class330_Sub3) this).aClass258_10094.method3529
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10095, fs,
	     -455570038);
	((Class330_Sub3) this).aClass258_10094.method3508
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10091, 0, interface34,
	     1388460426);
	((Class330_Sub3) this).aClass258_10094.method3491
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10088, aFloat10097,
	     -884068528);
	((Class330_Sub3) this).aClass258_10094.method3493
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10089, aFloat10093,
	     aFloat10087, aFloat10092, aFloat10096, -1916092031);
	((Class330_Sub3) this).aClass258_10094.method3493
	    (((Class330_Sub3) this).aClass528_Sub22_Sub1_10090, 0.0F, 0.0F,
	     0.0F, 0.0F, -1916092031);
	aClass173_Sub1_3512.method2275(0, 0, i_73_, i_74_);
    }
    
    boolean method4315() {
	if (method4274()) {
	    ((Class330_Sub3) this).aClass258_10094
		= aClass173_Sub1_3512.method8580("FilterLevels");
	    if (((Class330_Sub3) this).aClass258_10094 == null)
		return false;
	    try {
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10091
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("sceneTex", -1938752760);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10088
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("paramsGamma", -1526658326);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10089
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("paramsRanges", -1972662441);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10090
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("pixelOffset", -1567776635);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10095
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("PosAndTexCoords", -2098432934);
		((Class330_Sub3) this).aClass262_10086
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3483("techAdjust", -1031308400);
	    } catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
		return false;
	    } catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
		return false;
	    }
	    if (!((Class330_Sub3) this).aClass262_10086.method3588())
		return false;
	    ((Class330_Sub3) this).aBool10085 = true;
	    return true;
	}
	return false;
    }
    
    int method4311() {
	return 1;
    }
    
    int method4312() {
	return 1;
    }
    
    int method4304() {
	return 1;
    }
    
    int method4305() {
	return 1;
    }
    
    int method4297() {
	return 1;
    }
    
    int method4316() {
	return 0;
    }
    
    boolean method4301() {
	if (method4274()) {
	    ((Class330_Sub3) this).aClass258_10094
		= aClass173_Sub1_3512.method8580("FilterLevels");
	    if (((Class330_Sub3) this).aClass258_10094 == null)
		return false;
	    try {
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10091
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("sceneTex", -1696107729);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10088
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("paramsGamma", -1779962215);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10089
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("paramsRanges", -1761328548);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10090
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("pixelOffset", -2094479792);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10095
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("PosAndTexCoords", -2139998571);
		((Class330_Sub3) this).aClass262_10086
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3483("techAdjust", 398167311);
	    } catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
		return false;
	    } catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
		return false;
	    }
	    if (!((Class330_Sub3) this).aClass262_10086.method3588())
		return false;
	    ((Class330_Sub3) this).aBool10085 = true;
	    return true;
	}
	return false;
    }
    
    boolean method4294() {
	if (method4274()) {
	    ((Class330_Sub3) this).aClass258_10094
		= aClass173_Sub1_3512.method8580("FilterLevels");
	    if (((Class330_Sub3) this).aClass258_10094 == null)
		return false;
	    try {
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10091
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("sceneTex", -1953764709);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10088
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("paramsGamma", -1559982882);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10089
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("paramsRanges", -2093585850);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10090
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("pixelOffset", -1820071708);
		((Class330_Sub3) this).aClass528_Sub22_Sub1_10095
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3498("PosAndTexCoords", -1578116226);
		((Class330_Sub3) this).aClass262_10086
		    = ((Class330_Sub3) this).aClass258_10094
			  .method3483("techAdjust", -1035260539);
	    } catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
		return false;
	    } catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
		return false;
	    }
	    if (!((Class330_Sub3) this).aClass262_10086.method3588())
		return false;
	    ((Class330_Sub3) this).aBool10085 = true;
	    return true;
	}
	return false;
    }
    
    boolean method4287() {
	return (aFloat10097 == 1.0F && aFloat10093 == 0.0F
		&& aFloat10087 == 1.0F && aFloat10092 == 0.0F
		&& aFloat10096 == 1.0F);
    }
    
    boolean method4314() {
	return (aFloat10097 == 1.0F && aFloat10093 == 0.0F
		&& aFloat10087 == 1.0F && aFloat10092 == 0.0F
		&& aFloat10096 == 1.0F);
    }
    
    boolean method4328() {
	return (aFloat10097 == 1.0F && aFloat10093 == 0.0F
		&& aFloat10087 == 1.0F && aFloat10092 == 0.0F
		&& aFloat10096 == 1.0F);
    }
}
