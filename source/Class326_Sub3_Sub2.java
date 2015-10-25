/* Class326_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class326_Sub3_Sub2 extends Class326_Sub3
{
    public Class326_Sub3_Sub2(Class283 class283) {
	super(class283);
    }
    
    float method9128(float f, float f_0_, float f_1_, int i) {
	float f_2_ = f - ((Class326_Sub3_Sub2) this).aFloat10060;
	if ((((Class326_Sub3_Sub2) this).aClass283_3496.method3815(-1414025684)
	     .aFloat4780)
	    == Float.POSITIVE_INFINITY)
	    f_0_ = ((Class326_Sub3_Sub2) this).aClass283_3496.method3796
		       (-347136498).method5069();
	else {
	    float f_3_
		= f_0_ / ((Class326_Sub3_Sub2) this).aClass283_3496.method3815
			     (-1273721161).method5069();
	    float f_4_ = f_3_ * (f_0_ / 2.0F);
	    if (f_4_ > f_2_) {
		f_0_ -= ((Class326_Sub3_Sub2) this).aClass283_3496.method3815
			    (-2048145523).method5069() * f_1_;
		if (f_0_ < 0.0F)
		    f_0_ = 0.0F;
	    } else if (f_0_
		       < ((Class326_Sub3_Sub2) this).aClass283_3496.method3796
			     (-1759226741).method5069()) {
		f_0_ += ((Class326_Sub3_Sub2) this).aClass283_3496.method3815
			    (-1854715092).method5069() * f_1_;
		if (f_0_
		    > ((Class326_Sub3_Sub2) this).aClass283_3496.method3796
			  (531007906).method5069())
		    f_0_
			= ((Class326_Sub3_Sub2) this).aClass283_3496.method3796
			      (537566752).method5069();
	    }
	}
	return f_0_;
    }
    
    void method9134() {
	/* empty */
    }
    
    void method9139(ByteBuffer class528_sub42, int i, byte i_5_) {
	/* empty */
    }
    
    float method9133(float f, float f_6_, float f_7_) {
	float f_8_ = f - ((Class326_Sub3_Sub2) this).aFloat10060;
	if ((((Class326_Sub3_Sub2) this).aClass283_3496.method3815(-339967915)
	     .aFloat4780)
	    == Float.POSITIVE_INFINITY)
	    f_6_ = ((Class326_Sub3_Sub2) this).aClass283_3496.method3796
		       (-1290676005).method5069();
	else {
	    float f_9_
		= f_6_ / ((Class326_Sub3_Sub2) this).aClass283_3496.method3815
			     (-1402833534).method5069();
	    float f_10_ = f_9_ * (f_6_ / 2.0F);
	    if (f_10_ > f_8_) {
		f_6_ -= ((Class326_Sub3_Sub2) this).aClass283_3496.method3815
			    (-1132292684).method5069() * f_7_;
		if (f_6_ < 0.0F)
		    f_6_ = 0.0F;
	    } else if (f_6_
		       < ((Class326_Sub3_Sub2) this).aClass283_3496.method3796
			     (418840370).method5069()) {
		f_6_ += ((Class326_Sub3_Sub2) this).aClass283_3496.method3815
			    (-694787923).method5069() * f_7_;
		if (f_6_
		    > ((Class326_Sub3_Sub2) this).aClass283_3496.method3796
			  (-369465197).method5069())
		    f_6_
			= ((Class326_Sub3_Sub2) this).aClass283_3496.method3796
			      (-229617800).method5069();
	    }
	}
	return f_6_;
    }
    
    void method9129(int i) {
	/* empty */
    }
    
    void method9132(ByteBuffer class528_sub42, int i) {
	/* empty */
    }
    
    void method9136(ByteBuffer class528_sub42, int i) {
	/* empty */
    }
}
