/* Class316_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class316_Sub2 extends Class316
{
    Class151 aClass151_9908;
    Class151 aClass151_9909;
    Class151 aClass151_9910;
    Class151 aClass151_9911;
    Class151 aClass151_9912;
    Class151 aClass151_9913;
    
    void method4173(boolean bool, int i, int i_0_) {
	if (bool) {
	    int[] is = new int[4];
	    Class587.aClass173_7714.method2207(is);
	    Class587.aClass173_7714.method2204
		(i, i_0_,
		 i + (732946715
		      * ((Class316_Sub2) this).aClass378_3452.anInt3953),
		 i_0_ + (-973094999
			 * ((Class316_Sub2) this).aClass378_3452.anInt3952));
	    int i_1_ = ((Class316_Sub2) this).aClass151_9910.method40();
	    int i_2_ = ((Class316_Sub2) this).aClass151_9910.method1768();
	    int i_3_ = ((Class316_Sub2) this).aClass151_9908.method40();
	    int i_4_ = ((Class316_Sub2) this).aClass151_9908.method1768();
	    ((Class316_Sub2) this).aClass151_9910.method1773
		(i, i_0_ + ((-973094999
			     * ((Class316_Sub2) this).aClass378_3452.anInt3952)
			    - i_2_) / 2);
	    ((Class316_Sub2) this).aClass151_9908.method1773
		((732946715 * ((Class316_Sub2) this).aClass378_3452.anInt3953
		  + i - i_3_),
		 (-973094999 * ((Class316_Sub2) this).aClass378_3452.anInt3952
		  - i_4_) / 2 + i_0_);
	    Class587.aClass173_7714.method2204
		(i, i_0_,
		 (((Class316_Sub2) this).aClass378_3452.anInt3953 * 732946715
		  + i),
		 i_0_ + ((Class316_Sub2) this).aClass151_9909.method1768());
	    ((Class316_Sub2) this).aClass151_9909.method1813
		(i + i_1_, i_0_,
		 (732946715 * ((Class316_Sub2) this).aClass378_3452.anInt3953
		  - i_1_ - i_3_),
		 -973094999 * ((Class316_Sub2) this).aClass378_3452.anInt3952);
	    int i_5_ = ((Class316_Sub2) this).aClass151_9911.method1768();
	    Class587.aClass173_7714.method2204
		(i,
		 (-973094999 * ((Class316_Sub2) this).aClass378_3452.anInt3952
		  + i_0_ - i_5_),
		 (732946715 * ((Class316_Sub2) this).aClass378_3452.anInt3953
		  + i),
		 i_0_ + (-973094999
			 * ((Class316_Sub2) this).aClass378_3452.anInt3952));
	    ((Class316_Sub2) this).aClass151_9911.method1813
		(i_1_ + i,
		 i_0_ + (((Class316_Sub2) this).aClass378_3452.anInt3952
			 * -973094999) - i_5_,
		 (((Class316_Sub2) this).aClass378_3452.anInt3953 * 732946715
		  - i_1_ - i_3_),
		 ((Class316_Sub2) this).aClass378_3452.anInt3952 * -973094999);
	    Class587.aClass173_7714.method2204(is[0], is[1], is[2], is[3]);
	}
    }
    
    public void method187(short i) {
	super.method187((short) -16445);
	Class378_Sub1 class378_sub1
	    = (Class378_Sub1) ((Class316_Sub2) this).aClass378_3452;
	((Class316_Sub2) this).aClass151_9912
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 -1914317099 * class378_sub1.anInt10065,
				 1853504167);
	((Class316_Sub2) this).aClass151_9913
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 -1427410889 * class378_sub1.anInt10069,
				 877155123);
	((Class316_Sub2) this).aClass151_9910
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 236426663 * class378_sub1.anInt10066,
				 868280449);
	((Class316_Sub2) this).aClass151_9908
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 class378_sub1.anInt10067 * 679036289,
				 1555427334);
	((Class316_Sub2) this).aClass151_9909
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 691014483 * class378_sub1.anInt10068,
				 235163320);
	((Class316_Sub2) this).aClass151_9911
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 class378_sub1.anInt10064 * 1206546969,
				 289723467);
    }
    
    void method9015(int i, int i_6_, int i_7_, int i_8_) {
	((Class316_Sub2) this).aClass151_9912.method1813(i, i_6_, i_7_, i_8_);
    }
    
    void method4168(boolean bool, int i, int i_9_) {
	int i_10_ = i + ((Class316_Sub2) this).aClass151_9910.method40();
	int i_11_
	    = (i + ((Class316_Sub2) this).aClass378_3452.anInt3953 * 732946715
	       - ((Class316_Sub2) this).aClass151_9908.method40());
	int i_12_ = i_9_ + ((Class316_Sub2) this).aClass151_9909.method1768();
	int i_13_
	    = (i_9_
	       + ((Class316_Sub2) this).aClass378_3452.anInt3952 * -973094999
	       - ((Class316_Sub2) this).aClass151_9911.method1768());
	int i_14_ = i_11_ - i_10_;
	int i_15_ = i_13_ - i_12_;
	int i_16_ = method4166(1622417970) * i_14_ / 10000;
	int[] is = new int[4];
	Class587.aClass173_7714.method2207(is);
	Class587.aClass173_7714.method2204(i_10_, i_12_, i_10_ + i_16_, i_13_);
	method9016(i_10_, i_12_, i_14_, i_15_, (byte) -64);
	Class587.aClass173_7714.method2204(i_10_ + i_16_, i_12_, i_11_, i_13_);
	((Class316_Sub2) this).aClass151_9913.method1813(i_10_, i_12_, i_14_,
							 i_15_);
	Class587.aClass173_7714.method2204(is[0], is[1], is[2], is[3]);
    }
    
    public void method194() {
	super.method187((short) -11909);
	Class378_Sub1 class378_sub1
	    = (Class378_Sub1) ((Class316_Sub2) this).aClass378_3452;
	((Class316_Sub2) this).aClass151_9912
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 -1914317099 * class378_sub1.anInt10065,
				 733852685);
	((Class316_Sub2) this).aClass151_9913
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 -1427410889 * class378_sub1.anInt10069,
				 1822728441);
	((Class316_Sub2) this).aClass151_9910
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 236426663 * class378_sub1.anInt10066,
				 1425125851);
	((Class316_Sub2) this).aClass151_9908
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 class378_sub1.anInt10067 * 679036289,
				 127770512);
	((Class316_Sub2) this).aClass151_9909
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 691014483 * class378_sub1.anInt10068,
				 1238563960);
	((Class316_Sub2) this).aClass151_9911
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 class378_sub1.anInt10064 * 1206546969,
				 581338506);
    }
    
    public boolean method186(int i) {
	if (!super.method186(-1492218702))
	    return false;
	Class378_Sub1 class378_sub1
	    = (Class378_Sub1) ((Class316_Sub2) this).aClass378_3452;
	if (!((Class316_Sub2) this).aClass446_3447.method5357
	     (-1914317099 * class378_sub1.anInt10065, (short) 1274))
	    return false;
	if (!((Class316_Sub2) this).aClass446_3447.method5357(((class378_sub1
								.anInt10069)
							       * -1427410889),
							      (short) 20663))
	    return false;
	if (!((Class316_Sub2) this).aClass446_3447.method5357
	     (236426663 * class378_sub1.anInt10066, (short) -13182))
	    return false;
	if (!((Class316_Sub2) this).aClass446_3447.method5357
	     (679036289 * class378_sub1.anInt10067, (short) 26329))
	    return false;
	if (!((Class316_Sub2) this).aClass446_3447.method5357(((class378_sub1
								.anInt10068)
							       * 691014483),
							      (short) 2337))
	    return false;
	if (!((Class316_Sub2) this).aClass446_3447.method5357
	     (1206546969 * class378_sub1.anInt10064, (short) -7458))
	    return false;
	return true;
    }
    
    public void method191() {
	super.method187((short) -11106);
	Class378_Sub1 class378_sub1
	    = (Class378_Sub1) ((Class316_Sub2) this).aClass378_3452;
	((Class316_Sub2) this).aClass151_9912
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 -1914317099 * class378_sub1.anInt10065,
				 974805390);
	((Class316_Sub2) this).aClass151_9913
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 -1427410889 * class378_sub1.anInt10069,
				 1235789711);
	((Class316_Sub2) this).aClass151_9910
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 236426663 * class378_sub1.anInt10066,
				 1097735352);
	((Class316_Sub2) this).aClass151_9908
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 class378_sub1.anInt10067 * 679036289,
				 1612003387);
	((Class316_Sub2) this).aClass151_9909
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 691014483 * class378_sub1.anInt10068,
				 1596604787);
	((Class316_Sub2) this).aClass151_9911
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 class378_sub1.anInt10064 * 1206546969,
				 1302072698);
    }
    
    public void method192() {
	super.method187((short) -1420);
	Class378_Sub1 class378_sub1
	    = (Class378_Sub1) ((Class316_Sub2) this).aClass378_3452;
	((Class316_Sub2) this).aClass151_9912
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 -1914317099 * class378_sub1.anInt10065,
				 527405448);
	((Class316_Sub2) this).aClass151_9913
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 -1427410889 * class378_sub1.anInt10069,
				 1092620842);
	((Class316_Sub2) this).aClass151_9910
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 236426663 * class378_sub1.anInt10066,
				 2016046229);
	((Class316_Sub2) this).aClass151_9908
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 class378_sub1.anInt10067 * 679036289,
				 566250862);
	((Class316_Sub2) this).aClass151_9909
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 691014483 * class378_sub1.anInt10068,
				 111879210);
	((Class316_Sub2) this).aClass151_9911
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 class378_sub1.anInt10064 * 1206546969,
				 346861151);
    }
    
    Class316_Sub2(Class446 class446, Class446 class446_17_,
		  Class378_Sub1 class378_sub1) {
	super(class446, class446_17_, (Class378) class378_sub1);
    }
    
    public void method116() {
	super.method187((short) -30414);
	Class378_Sub1 class378_sub1
	    = (Class378_Sub1) ((Class316_Sub2) this).aClass378_3452;
	((Class316_Sub2) this).aClass151_9912
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 -1914317099 * class378_sub1.anInt10065,
				 1961246982);
	((Class316_Sub2) this).aClass151_9913
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 -1427410889 * class378_sub1.anInt10069,
				 1612872150);
	((Class316_Sub2) this).aClass151_9910
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 236426663 * class378_sub1.anInt10066,
				 1901479474);
	((Class316_Sub2) this).aClass151_9908
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 class378_sub1.anInt10067 * 679036289,
				 1302089044);
	((Class316_Sub2) this).aClass151_9909
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 691014483 * class378_sub1.anInt10068,
				 187611248);
	((Class316_Sub2) this).aClass151_9911
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 class378_sub1.anInt10064 * 1206546969,
				 1227087386);
    }
    
    void method4164(boolean bool, int i, int i_18_, byte i_19_) {
	if (bool) {
	    int[] is = new int[4];
	    Class587.aClass173_7714.method2207(is);
	    Class587.aClass173_7714.method2204
		(i, i_18_,
		 i + (732946715
		      * ((Class316_Sub2) this).aClass378_3452.anInt3953),
		 i_18_ + (-973094999
			  * ((Class316_Sub2) this).aClass378_3452.anInt3952));
	    int i_20_ = ((Class316_Sub2) this).aClass151_9910.method40();
	    int i_21_ = ((Class316_Sub2) this).aClass151_9910.method1768();
	    int i_22_ = ((Class316_Sub2) this).aClass151_9908.method40();
	    int i_23_ = ((Class316_Sub2) this).aClass151_9908.method1768();
	    ((Class316_Sub2) this).aClass151_9910.method1773
		(i, i_18_ + (-973094999 * (((Class316_Sub2) this)
					   .aClass378_3452.anInt3952)
			     - i_21_) / 2);
	    ((Class316_Sub2) this).aClass151_9908.method1773
		((732946715 * ((Class316_Sub2) this).aClass378_3452.anInt3953
		  + i - i_22_),
		 (-973094999 * ((Class316_Sub2) this).aClass378_3452.anInt3952
		  - i_23_) / 2 + i_18_);
	    Class587.aClass173_7714.method2204
		(i, i_18_,
		 (((Class316_Sub2) this).aClass378_3452.anInt3953 * 732946715
		  + i),
		 i_18_ + ((Class316_Sub2) this).aClass151_9909.method1768());
	    ((Class316_Sub2) this).aClass151_9909.method1813
		(i + i_20_, i_18_,
		 (732946715 * ((Class316_Sub2) this).aClass378_3452.anInt3953
		  - i_20_ - i_22_),
		 -973094999 * ((Class316_Sub2) this).aClass378_3452.anInt3952);
	    int i_24_ = ((Class316_Sub2) this).aClass151_9911.method1768();
	    Class587.aClass173_7714.method2204
		(i,
		 (-973094999 * ((Class316_Sub2) this).aClass378_3452.anInt3952
		  + i_18_ - i_24_),
		 (732946715 * ((Class316_Sub2) this).aClass378_3452.anInt3953
		  + i),
		 i_18_ + (-973094999
			  * ((Class316_Sub2) this).aClass378_3452.anInt3952));
	    ((Class316_Sub2) this).aClass151_9911.method1813
		(i_20_ + i,
		 i_18_ + (((Class316_Sub2) this).aClass378_3452.anInt3952
			  * -973094999) - i_24_,
		 (((Class316_Sub2) this).aClass378_3452.anInt3953 * 732946715
		  - i_20_ - i_22_),
		 ((Class316_Sub2) this).aClass378_3452.anInt3952 * -973094999);
	    Class587.aClass173_7714.method2204(is[0], is[1], is[2], is[3]);
	}
    }
    
    public void method195() {
	super.method187((short) -28608);
	Class378_Sub1 class378_sub1
	    = (Class378_Sub1) ((Class316_Sub2) this).aClass378_3452;
	((Class316_Sub2) this).aClass151_9912
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 -1914317099 * class378_sub1.anInt10065,
				 2105640070);
	((Class316_Sub2) this).aClass151_9913
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 -1427410889 * class378_sub1.anInt10069,
				 1301805368);
	((Class316_Sub2) this).aClass151_9910
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 236426663 * class378_sub1.anInt10066,
				 901118182);
	((Class316_Sub2) this).aClass151_9908
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 class378_sub1.anInt10067 * 679036289,
				 193084977);
	((Class316_Sub2) this).aClass151_9909
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 691014483 * class378_sub1.anInt10068,
				 1098863251);
	((Class316_Sub2) this).aClass151_9911
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 class378_sub1.anInt10064 * 1206546969,
				 316825336);
    }
    
    public boolean method196() {
	if (!super.method186(-909607853))
	    return false;
	Class378_Sub1 class378_sub1
	    = (Class378_Sub1) ((Class316_Sub2) this).aClass378_3452;
	if (!((Class316_Sub2) this).aClass446_3447.method5357
	     (-1914317099 * class378_sub1.anInt10065, (short) -597))
	    return false;
	if (!((Class316_Sub2) this).aClass446_3447.method5357(((class378_sub1
								.anInt10069)
							       * -1427410889),
							      (short) 11538))
	    return false;
	if (!((Class316_Sub2) this).aClass446_3447.method5357
	     (236426663 * class378_sub1.anInt10066, (short) -21885))
	    return false;
	if (!((Class316_Sub2) this).aClass446_3447.method5357
	     (679036289 * class378_sub1.anInt10067, (short) 6938))
	    return false;
	if (!((Class316_Sub2) this).aClass446_3447.method5357(((class378_sub1
								.anInt10068)
							       * 691014483),
							      (short) 9366))
	    return false;
	if (!((Class316_Sub2) this).aClass446_3447.method5357
	     (1206546969 * class378_sub1.anInt10064, (short) -5230))
	    return false;
	return true;
    }
    
    void method4170(boolean bool, int i, int i_25_, int i_26_) {
	int i_27_ = i + ((Class316_Sub2) this).aClass151_9910.method40();
	int i_28_
	    = (i + ((Class316_Sub2) this).aClass378_3452.anInt3953 * 732946715
	       - ((Class316_Sub2) this).aClass151_9908.method40());
	int i_29_ = i_25_ + ((Class316_Sub2) this).aClass151_9909.method1768();
	int i_30_
	    = (i_25_
	       + ((Class316_Sub2) this).aClass378_3452.anInt3952 * -973094999
	       - ((Class316_Sub2) this).aClass151_9911.method1768());
	int i_31_ = i_28_ - i_27_;
	int i_32_ = i_30_ - i_29_;
	int i_33_ = method4166(1622417970) * i_31_ / 10000;
	int[] is = new int[4];
	Class587.aClass173_7714.method2207(is);
	Class587.aClass173_7714.method2204(i_27_, i_29_, i_27_ + i_33_, i_30_);
	method9016(i_27_, i_29_, i_31_, i_32_, (byte) -102);
	Class587.aClass173_7714.method2204(i_27_ + i_33_, i_29_, i_28_, i_30_);
	((Class316_Sub2) this).aClass151_9913.method1813(i_27_, i_29_, i_31_,
							 i_32_);
	Class587.aClass173_7714.method2204(is[0], is[1], is[2], is[3]);
    }
    
    void method4165(boolean bool, int i, int i_34_) {
	if (bool) {
	    int[] is = new int[4];
	    Class587.aClass173_7714.method2207(is);
	    Class587.aClass173_7714.method2204
		(i, i_34_,
		 i + (732946715
		      * ((Class316_Sub2) this).aClass378_3452.anInt3953),
		 i_34_ + (-973094999
			  * ((Class316_Sub2) this).aClass378_3452.anInt3952));
	    int i_35_ = ((Class316_Sub2) this).aClass151_9910.method40();
	    int i_36_ = ((Class316_Sub2) this).aClass151_9910.method1768();
	    int i_37_ = ((Class316_Sub2) this).aClass151_9908.method40();
	    int i_38_ = ((Class316_Sub2) this).aClass151_9908.method1768();
	    ((Class316_Sub2) this).aClass151_9910.method1773
		(i, i_34_ + (-973094999 * (((Class316_Sub2) this)
					   .aClass378_3452.anInt3952)
			     - i_36_) / 2);
	    ((Class316_Sub2) this).aClass151_9908.method1773
		((732946715 * ((Class316_Sub2) this).aClass378_3452.anInt3953
		  + i - i_37_),
		 (-973094999 * ((Class316_Sub2) this).aClass378_3452.anInt3952
		  - i_38_) / 2 + i_34_);
	    Class587.aClass173_7714.method2204
		(i, i_34_,
		 (((Class316_Sub2) this).aClass378_3452.anInt3953 * 732946715
		  + i),
		 i_34_ + ((Class316_Sub2) this).aClass151_9909.method1768());
	    ((Class316_Sub2) this).aClass151_9909.method1813
		(i + i_35_, i_34_,
		 (732946715 * ((Class316_Sub2) this).aClass378_3452.anInt3953
		  - i_35_ - i_37_),
		 -973094999 * ((Class316_Sub2) this).aClass378_3452.anInt3952);
	    int i_39_ = ((Class316_Sub2) this).aClass151_9911.method1768();
	    Class587.aClass173_7714.method2204
		(i,
		 (-973094999 * ((Class316_Sub2) this).aClass378_3452.anInt3952
		  + i_34_ - i_39_),
		 (732946715 * ((Class316_Sub2) this).aClass378_3452.anInt3953
		  + i),
		 i_34_ + (-973094999
			  * ((Class316_Sub2) this).aClass378_3452.anInt3952));
	    ((Class316_Sub2) this).aClass151_9911.method1813
		(i_35_ + i,
		 i_34_ + (((Class316_Sub2) this).aClass378_3452.anInt3952
			  * -973094999) - i_39_,
		 (((Class316_Sub2) this).aClass378_3452.anInt3953 * 732946715
		  - i_35_ - i_37_),
		 ((Class316_Sub2) this).aClass378_3452.anInt3952 * -973094999);
	    Class587.aClass173_7714.method2204(is[0], is[1], is[2], is[3]);
	}
    }
    
    void method4167(boolean bool, int i, int i_40_) {
	if (bool) {
	    int[] is = new int[4];
	    Class587.aClass173_7714.method2207(is);
	    Class587.aClass173_7714.method2204
		(i, i_40_,
		 i + (732946715
		      * ((Class316_Sub2) this).aClass378_3452.anInt3953),
		 i_40_ + (-973094999
			  * ((Class316_Sub2) this).aClass378_3452.anInt3952));
	    int i_41_ = ((Class316_Sub2) this).aClass151_9910.method40();
	    int i_42_ = ((Class316_Sub2) this).aClass151_9910.method1768();
	    int i_43_ = ((Class316_Sub2) this).aClass151_9908.method40();
	    int i_44_ = ((Class316_Sub2) this).aClass151_9908.method1768();
	    ((Class316_Sub2) this).aClass151_9910.method1773
		(i, i_40_ + (-973094999 * (((Class316_Sub2) this)
					   .aClass378_3452.anInt3952)
			     - i_42_) / 2);
	    ((Class316_Sub2) this).aClass151_9908.method1773
		((732946715 * ((Class316_Sub2) this).aClass378_3452.anInt3953
		  + i - i_43_),
		 (-973094999 * ((Class316_Sub2) this).aClass378_3452.anInt3952
		  - i_44_) / 2 + i_40_);
	    Class587.aClass173_7714.method2204
		(i, i_40_,
		 (((Class316_Sub2) this).aClass378_3452.anInt3953 * 732946715
		  + i),
		 i_40_ + ((Class316_Sub2) this).aClass151_9909.method1768());
	    ((Class316_Sub2) this).aClass151_9909.method1813
		(i + i_41_, i_40_,
		 (732946715 * ((Class316_Sub2) this).aClass378_3452.anInt3953
		  - i_41_ - i_43_),
		 -973094999 * ((Class316_Sub2) this).aClass378_3452.anInt3952);
	    int i_45_ = ((Class316_Sub2) this).aClass151_9911.method1768();
	    Class587.aClass173_7714.method2204
		(i,
		 (-973094999 * ((Class316_Sub2) this).aClass378_3452.anInt3952
		  + i_40_ - i_45_),
		 (732946715 * ((Class316_Sub2) this).aClass378_3452.anInt3953
		  + i),
		 i_40_ + (-973094999
			  * ((Class316_Sub2) this).aClass378_3452.anInt3952));
	    ((Class316_Sub2) this).aClass151_9911.method1813
		(i_41_ + i,
		 i_40_ + (((Class316_Sub2) this).aClass378_3452.anInt3952
			  * -973094999) - i_45_,
		 (((Class316_Sub2) this).aClass378_3452.anInt3953 * 732946715
		  - i_41_ - i_43_),
		 ((Class316_Sub2) this).aClass378_3452.anInt3952 * -973094999);
	    Class587.aClass173_7714.method2204(is[0], is[1], is[2], is[3]);
	}
    }
    
    void method4172(boolean bool, int i, int i_46_) {
	if (bool) {
	    int[] is = new int[4];
	    Class587.aClass173_7714.method2207(is);
	    Class587.aClass173_7714.method2204
		(i, i_46_,
		 i + (732946715
		      * ((Class316_Sub2) this).aClass378_3452.anInt3953),
		 i_46_ + (-973094999
			  * ((Class316_Sub2) this).aClass378_3452.anInt3952));
	    int i_47_ = ((Class316_Sub2) this).aClass151_9910.method40();
	    int i_48_ = ((Class316_Sub2) this).aClass151_9910.method1768();
	    int i_49_ = ((Class316_Sub2) this).aClass151_9908.method40();
	    int i_50_ = ((Class316_Sub2) this).aClass151_9908.method1768();
	    ((Class316_Sub2) this).aClass151_9910.method1773
		(i, i_46_ + (-973094999 * (((Class316_Sub2) this)
					   .aClass378_3452.anInt3952)
			     - i_48_) / 2);
	    ((Class316_Sub2) this).aClass151_9908.method1773
		((732946715 * ((Class316_Sub2) this).aClass378_3452.anInt3953
		  + i - i_49_),
		 (-973094999 * ((Class316_Sub2) this).aClass378_3452.anInt3952
		  - i_50_) / 2 + i_46_);
	    Class587.aClass173_7714.method2204
		(i, i_46_,
		 (((Class316_Sub2) this).aClass378_3452.anInt3953 * 732946715
		  + i),
		 i_46_ + ((Class316_Sub2) this).aClass151_9909.method1768());
	    ((Class316_Sub2) this).aClass151_9909.method1813
		(i + i_47_, i_46_,
		 (732946715 * ((Class316_Sub2) this).aClass378_3452.anInt3953
		  - i_47_ - i_49_),
		 -973094999 * ((Class316_Sub2) this).aClass378_3452.anInt3952);
	    int i_51_ = ((Class316_Sub2) this).aClass151_9911.method1768();
	    Class587.aClass173_7714.method2204
		(i,
		 (-973094999 * ((Class316_Sub2) this).aClass378_3452.anInt3952
		  + i_46_ - i_51_),
		 (732946715 * ((Class316_Sub2) this).aClass378_3452.anInt3953
		  + i),
		 i_46_ + (-973094999
			  * ((Class316_Sub2) this).aClass378_3452.anInt3952));
	    ((Class316_Sub2) this).aClass151_9911.method1813
		(i_47_ + i,
		 i_46_ + (((Class316_Sub2) this).aClass378_3452.anInt3952
			  * -973094999) - i_51_,
		 (((Class316_Sub2) this).aClass378_3452.anInt3953 * 732946715
		  - i_47_ - i_49_),
		 ((Class316_Sub2) this).aClass378_3452.anInt3952 * -973094999);
	    Class587.aClass173_7714.method2204(is[0], is[1], is[2], is[3]);
	}
    }
    
    void method4171(boolean bool, int i, int i_52_) {
	if (bool) {
	    int[] is = new int[4];
	    Class587.aClass173_7714.method2207(is);
	    Class587.aClass173_7714.method2204
		(i, i_52_,
		 i + (732946715
		      * ((Class316_Sub2) this).aClass378_3452.anInt3953),
		 i_52_ + (-973094999
			  * ((Class316_Sub2) this).aClass378_3452.anInt3952));
	    int i_53_ = ((Class316_Sub2) this).aClass151_9910.method40();
	    int i_54_ = ((Class316_Sub2) this).aClass151_9910.method1768();
	    int i_55_ = ((Class316_Sub2) this).aClass151_9908.method40();
	    int i_56_ = ((Class316_Sub2) this).aClass151_9908.method1768();
	    ((Class316_Sub2) this).aClass151_9910.method1773
		(i, i_52_ + (-973094999 * (((Class316_Sub2) this)
					   .aClass378_3452.anInt3952)
			     - i_54_) / 2);
	    ((Class316_Sub2) this).aClass151_9908.method1773
		((732946715 * ((Class316_Sub2) this).aClass378_3452.anInt3953
		  + i - i_55_),
		 (-973094999 * ((Class316_Sub2) this).aClass378_3452.anInt3952
		  - i_56_) / 2 + i_52_);
	    Class587.aClass173_7714.method2204
		(i, i_52_,
		 (((Class316_Sub2) this).aClass378_3452.anInt3953 * 732946715
		  + i),
		 i_52_ + ((Class316_Sub2) this).aClass151_9909.method1768());
	    ((Class316_Sub2) this).aClass151_9909.method1813
		(i + i_53_, i_52_,
		 (732946715 * ((Class316_Sub2) this).aClass378_3452.anInt3953
		  - i_53_ - i_55_),
		 -973094999 * ((Class316_Sub2) this).aClass378_3452.anInt3952);
	    int i_57_ = ((Class316_Sub2) this).aClass151_9911.method1768();
	    Class587.aClass173_7714.method2204
		(i,
		 (-973094999 * ((Class316_Sub2) this).aClass378_3452.anInt3952
		  + i_52_ - i_57_),
		 (732946715 * ((Class316_Sub2) this).aClass378_3452.anInt3953
		  + i),
		 i_52_ + (-973094999
			  * ((Class316_Sub2) this).aClass378_3452.anInt3952));
	    ((Class316_Sub2) this).aClass151_9911.method1813
		(i_53_ + i,
		 i_52_ + (((Class316_Sub2) this).aClass378_3452.anInt3952
			  * -973094999) - i_57_,
		 (((Class316_Sub2) this).aClass378_3452.anInt3953 * 732946715
		  - i_53_ - i_55_),
		 ((Class316_Sub2) this).aClass378_3452.anInt3952 * -973094999);
	    Class587.aClass173_7714.method2204(is[0], is[1], is[2], is[3]);
	}
    }
    
    void method9016(int i, int i_58_, int i_59_, int i_60_, byte i_61_) {
	((Class316_Sub2) this).aClass151_9912.method1813(i, i_58_, i_59_,
							 i_60_);
    }
    
    void method9017(int i, int i_62_, int i_63_, int i_64_) {
	((Class316_Sub2) this).aClass151_9912.method1813(i, i_62_, i_63_,
							 i_64_);
    }
    
    void method9018(int i, int i_65_, int i_66_, int i_67_) {
	((Class316_Sub2) this).aClass151_9912.method1813(i, i_65_, i_66_,
							 i_67_);
    }
    
    public void method193() {
	super.method187((short) -19485);
	Class378_Sub1 class378_sub1
	    = (Class378_Sub1) ((Class316_Sub2) this).aClass378_3452;
	((Class316_Sub2) this).aClass151_9912
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 -1914317099 * class378_sub1.anInt10065,
				 426347421);
	((Class316_Sub2) this).aClass151_9913
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 -1427410889 * class378_sub1.anInt10069,
				 859757831);
	((Class316_Sub2) this).aClass151_9910
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 236426663 * class378_sub1.anInt10066,
				 154416397);
	((Class316_Sub2) this).aClass151_9908
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 class378_sub1.anInt10067 * 679036289,
				 201282032);
	((Class316_Sub2) this).aClass151_9909
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 691014483 * class378_sub1.anInt10068,
				 798794312);
	((Class316_Sub2) this).aClass151_9911
	    = Class89.method1207(((Class316_Sub2) this).aClass446_3447,
				 class378_sub1.anInt10064 * 1206546969,
				 757124045);
    }
    
    void method9019(int i, int i_68_, int i_69_, int i_70_) {
	((Class316_Sub2) this).aClass151_9912.method1813(i, i_68_, i_69_,
							 i_70_);
    }
    
    void method9020(int i, int i_71_, int i_72_, int i_73_) {
	((Class316_Sub2) this).aClass151_9912.method1813(i, i_71_, i_72_,
							 i_73_);
    }
}
