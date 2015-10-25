/* Class120_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class120_Sub4_Sub1 extends Class120_Sub4
{
    int anInt11215;
    int anInt11216;
    float aFloat11217;
    float aFloat11218;
    boolean aBool11219;
    boolean aBool11220;
    
    Class120_Sub4_Sub1(Class173_Sub2 class173_sub2, int i, int i_0_, int i_1_,
		       int i_2_, int[] is) {
	super(class173_sub2, 3553, Class149.aClass149_1676,
	      Class169.aClass169_1935, i_1_, i_2_);
	((Class120_Sub4_Sub1) this).anInt11216 = i;
	((Class120_Sub4_Sub1) this).anInt11215 = i_0_;
	method8264(0, i_2_ - i_0_, i, i_0_, is, 0, 0, true);
	((Class120_Sub4_Sub1) this).aFloat11217 = (float) i_0_ / (float) i_2_;
	((Class120_Sub4_Sub1) this).aFloat11218 = (float) i / (float) i_1_;
	((Class120_Sub4_Sub1) this).aBool11219 = false;
	((Class120_Sub4_Sub1) this).aBool11220 = true;
	method8259(false, false);
    }
    
    static Class120_Sub4_Sub1 method10318
	(Class173_Sub2 class173_sub2, Class149 class149, Class169 class169,
	 int i, int i_3_, boolean bool, byte[] is, Class149 class149_4_) {
	if (((Class173_Sub2) class173_sub2).aBool9579
	    || (Class507.method6152(i, 1669647349)
		&& Class507.method6152(i_3_, 1623858536)))
	    return new Class120_Sub4_Sub1(class173_sub2, 3553, class149,
					  class169, i, i_3_, bool, is,
					  class149_4_);
	if (((Class173_Sub2) class173_sub2).aBool9577)
	    return new Class120_Sub4_Sub1(class173_sub2, 34037, class149,
					  class169, i, i_3_, bool, is,
					  class149_4_);
	return new Class120_Sub4_Sub1(class173_sub2, class149, class169, i,
				      i_3_,
				      Class327.method4259(i, -2134279851),
				      Class327.method4259(i_3_, -2134279851),
				      is, class149_4_);
    }
    
    static Class120_Sub4_Sub1 method10319(Class173_Sub2 class173_sub2, int i,
					  int i_5_, boolean bool, int[] is,
					  int i_6_, int i_7_) {
	if (((Class173_Sub2) class173_sub2).aBool9579
	    || (Class507.method6152(i, 1633694432)
		&& Class507.method6152(i_5_, 1620547919)))
	    return new Class120_Sub4_Sub1(class173_sub2, 3553, i, i_5_, bool,
					  is, i_6_, i_7_);
	if (((Class173_Sub2) class173_sub2).aBool9577)
	    return new Class120_Sub4_Sub1(class173_sub2, 34037, i, i_5_, bool,
					  is, i_6_, i_7_);
	return new Class120_Sub4_Sub1(class173_sub2, i, i_5_,
				      Class327.method4259(i, -2134279851),
				      Class327.method4259(i_5_, -2134279851),
				      is);
    }
    
    Class120_Sub4_Sub1(Class173_Sub2 class173_sub2, int i, Class149 class149,
		       Class169 class169, int i_8_, int i_9_) {
	super(class173_sub2, i, class149, class169, i_8_, i_9_);
	((Class120_Sub4_Sub1) this).anInt11216 = i_8_;
	((Class120_Sub4_Sub1) this).anInt11215 = i_9_;
	if (((Class120_Sub4_Sub1) this).anInt1493 == 34037) {
	    ((Class120_Sub4_Sub1) this).aFloat11217 = (float) i_9_;
	    ((Class120_Sub4_Sub1) this).aFloat11218 = (float) i_8_;
	    ((Class120_Sub4_Sub1) this).aBool11219 = false;
	} else {
	    ((Class120_Sub4_Sub1) this).aFloat11217 = 1.0F;
	    ((Class120_Sub4_Sub1) this).aFloat11218 = 1.0F;
	    ((Class120_Sub4_Sub1) this).aBool11219 = true;
	}
	((Class120_Sub4_Sub1) this).aBool11220 = false;
    }
    
    Class120_Sub4_Sub1(Class173_Sub2 class173_sub2, int i, Class149 class149,
		       Class169 class169, int i_10_, int i_11_, boolean bool,
		       byte[] is, Class149 class149_12_) {
	super(class173_sub2, i, class149, class169, i_10_, i_11_, bool, is,
	      class149_12_, true);
	((Class120_Sub4_Sub1) this).anInt11216 = i_10_;
	((Class120_Sub4_Sub1) this).anInt11215 = i_11_;
	if (((Class120_Sub4_Sub1) this).anInt1493 == 34037) {
	    ((Class120_Sub4_Sub1) this).aFloat11217 = (float) i_11_;
	    ((Class120_Sub4_Sub1) this).aFloat11218 = (float) i_10_;
	    ((Class120_Sub4_Sub1) this).aBool11219 = false;
	} else {
	    ((Class120_Sub4_Sub1) this).aFloat11217 = 1.0F;
	    ((Class120_Sub4_Sub1) this).aFloat11218 = 1.0F;
	    ((Class120_Sub4_Sub1) this).aBool11219 = true;
	}
	((Class120_Sub4_Sub1) this).aBool11220 = false;
    }
    
    Class120_Sub4_Sub1(Class173_Sub2 class173_sub2, int i, int i_13_,
		       int i_14_, boolean bool, int[] is, int i_15_,
		       int i_16_) {
	super(class173_sub2, i, i_13_, i_14_, bool, is, i_15_, i_16_, true);
	((Class120_Sub4_Sub1) this).anInt11216 = i_13_;
	((Class120_Sub4_Sub1) this).anInt11215 = i_14_;
	if (((Class120_Sub4_Sub1) this).anInt1493 == 34037) {
	    ((Class120_Sub4_Sub1) this).aFloat11217 = (float) i_14_;
	    ((Class120_Sub4_Sub1) this).aFloat11218 = (float) i_13_;
	    ((Class120_Sub4_Sub1) this).aBool11219 = false;
	} else {
	    ((Class120_Sub4_Sub1) this).aFloat11217 = 1.0F;
	    ((Class120_Sub4_Sub1) this).aFloat11218 = 1.0F;
	    ((Class120_Sub4_Sub1) this).aBool11219 = true;
	}
	((Class120_Sub4_Sub1) this).aBool11220 = false;
    }
    
    Class120_Sub4_Sub1(Class173_Sub2 class173_sub2, Class149 class149,
		       Class169 class169, int i, int i_17_, int i_18_,
		       int i_19_) {
	super(class173_sub2, 3553, class149, class169, i_18_, i_19_);
	((Class120_Sub4_Sub1) this).anInt11216 = i;
	((Class120_Sub4_Sub1) this).anInt11215 = i_17_;
	((Class120_Sub4_Sub1) this).aFloat11217
	    = (float) i_17_ / (float) i_19_;
	((Class120_Sub4_Sub1) this).aFloat11218 = (float) i / (float) i_18_;
	((Class120_Sub4_Sub1) this).aBool11219 = false;
	((Class120_Sub4_Sub1) this).aBool11220 = true;
	method8259(false, false);
    }
    
    void method1545(boolean bool) {
	super.method1545(bool && !((Class120_Sub4_Sub1) this).aBool11220);
    }
    
    Class120_Sub4_Sub1(Class173_Sub2 class173_sub2, Class149 class149,
		       Class169 class169, int i, int i_20_, int i_21_,
		       int i_22_, byte[] is, Class149 class149_23_) {
	super(class173_sub2, 3553, class149, class169, i_21_, i_22_);
	((Class120_Sub4_Sub1) this).anInt11216 = i;
	((Class120_Sub4_Sub1) this).anInt11215 = i_20_;
	method8258(0, i_22_ - i_20_, i, i_20_, is, class149_23_, 0, 0, true);
	((Class120_Sub4_Sub1) this).aFloat11217
	    = (float) i_20_ / (float) i_22_;
	((Class120_Sub4_Sub1) this).aFloat11218 = (float) i / (float) i_21_;
	((Class120_Sub4_Sub1) this).aBool11219 = false;
	((Class120_Sub4_Sub1) this).aBool11220 = true;
	method8259(false, false);
    }
    
    Class120_Sub4_Sub1(Class173_Sub2 class173_sub2, int i, int i_24_,
		       int i_25_, int i_26_, int i_27_, int i_28_,
		       boolean bool) {
	super(class173_sub2, 3553, i, i_24_, i_27_, i_28_);
	((Class120_Sub4_Sub1) this).anInt11216 = i_25_;
	((Class120_Sub4_Sub1) this).anInt11215 = i_26_;
	((Class120_Sub4_Sub1) this).aFloat11217
	    = (float) i_26_ / (float) i_28_;
	((Class120_Sub4_Sub1) this).aFloat11218
	    = (float) i_25_ / (float) i_27_;
	((Class120_Sub4_Sub1) this).aBool11219 = false;
	((Class120_Sub4_Sub1) this).aBool11220 = true;
	method8259(false, false);
    }
    
    static Class120_Sub4_Sub1 method10320(Class173_Sub2 class173_sub2, int i,
					  int i_29_, int i_30_, int i_31_) {
	if (((Class173_Sub2) class173_sub2).aBool9579
	    || (Class507.method6152(i_30_, 2064773412)
		&& Class507.method6152(i_31_, 1545409170)))
	    return new Class120_Sub4_Sub1(class173_sub2, 3553, i, i_29_, i_30_,
					  i_31_, true);
	if (((Class173_Sub2) class173_sub2).aBool9577)
	    return new Class120_Sub4_Sub1(class173_sub2, 34037, i, i_29_,
					  i_30_, i_31_, true);
	return new Class120_Sub4_Sub1(class173_sub2, i, i_29_, i_30_, i_31_,
				      Class327.method4259(i_30_, -2134279851),
				      Class327.method4259(i_31_, -2134279851),
				      true);
    }
    
    Class120_Sub4_Sub1(Class173_Sub2 class173_sub2, int i, int i_32_,
		       int i_33_, int i_34_, int i_35_, boolean bool) {
	super(class173_sub2, i, i_32_, i_33_, i_34_, i_35_);
	((Class120_Sub4_Sub1) this).anInt11216 = i_34_;
	((Class120_Sub4_Sub1) this).anInt11215 = i_35_;
	if (((Class120_Sub4_Sub1) this).anInt1493 == 34037) {
	    ((Class120_Sub4_Sub1) this).aFloat11217 = (float) i_35_;
	    ((Class120_Sub4_Sub1) this).aFloat11218 = (float) i_34_;
	    ((Class120_Sub4_Sub1) this).aBool11219 = false;
	} else {
	    ((Class120_Sub4_Sub1) this).aFloat11217 = 1.0F;
	    ((Class120_Sub4_Sub1) this).aFloat11218 = 1.0F;
	    ((Class120_Sub4_Sub1) this).aBool11219 = true;
	}
	((Class120_Sub4_Sub1) this).aBool11220 = false;
    }
    
    void method1560(boolean bool) {
	super.method1545(bool && !((Class120_Sub4_Sub1) this).aBool11220);
    }
    
    static Class120_Sub4_Sub1 method10321(Class173_Sub2 class173_sub2,
					  Class149 class149, Class169 class169,
					  int i, int i_36_) {
	if (((Class173_Sub2) class173_sub2).aBool9579
	    || (Class507.method6152(i, 1027531243)
		&& Class507.method6152(i_36_, 1106491668)))
	    return new Class120_Sub4_Sub1(class173_sub2, 3553, class149,
					  class169, i, i_36_);
	if (((Class173_Sub2) class173_sub2).aBool9577)
	    return new Class120_Sub4_Sub1(class173_sub2, 34037, class149,
					  class169, i, i_36_);
	return new Class120_Sub4_Sub1(class173_sub2, class149, class169, i,
				      i_36_,
				      Class327.method4259(i, -2134279851),
				      Class327.method4259(i_36_, -2134279851));
    }
    
    void method1565(boolean bool) {
	super.method1545(bool && !((Class120_Sub4_Sub1) this).aBool11220);
    }
}
