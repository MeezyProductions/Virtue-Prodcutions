/* Class684_Sub3_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class684_Sub3_Sub3 extends Class684_Sub3
{
    float method10088(float f, float f_0_, float f_1_, int i) {
	float f_2_ = f - ((Class684_Sub3_Sub3) this).aFloat10795;
	if ((((Class684_Sub3_Sub3) this).aClass283_8607.method3794(2136839338)
	     .aFloat4780)
	    == Float.POSITIVE_INFINITY)
	    f_0_ = ((Class684_Sub3_Sub3) this).aClass283_8607.method3832
		       (90597601).method5069();
	else {
	    float f_3_
		= f_0_ / ((Class684_Sub3_Sub3) this).aClass283_8607.method3794
			     (2095017710).method5069();
	    float f_4_ = f_0_ / 2.0F * f_3_;
	    if (f_4_ > f_2_) {
		f_0_ -= ((Class684_Sub3_Sub3) this).aClass283_8607.method3794
			    (2130716463).method5069() * f_1_;
		if (f_0_ < 0.0F)
		    f_0_ = 0.0F;
	    } else if (f_0_
		       < ((Class684_Sub3_Sub3) this).aClass283_8607.method3832
			     (-1789451928).method5069()) {
		f_0_ += ((Class684_Sub3_Sub3) this).aClass283_8607.method3794
			    (2145502493).method5069() * f_1_;
		if (f_0_
		    > ((Class684_Sub3_Sub3) this).aClass283_8607.method3832
			  (-1465581106).method5069())
		    f_0_
			= ((Class684_Sub3_Sub3) this).aClass283_8607.method3832
			      (-241175996).method5069();
	    }
	}
	return f_0_;
    }
    
    void method10094(ByteBuffer class528_sub42, int i) {
	/* empty */
    }
    
    void method10085(int i) {
	/* empty */
    }
    
    void method10092(ByteBuffer class528_sub42, int i, int i_5_) {
	/* empty */
    }
    
    public Class684_Sub3_Sub3(Class283 class283) {
	super(class283);
    }
    
    void method10095() {
	/* empty */
    }
    
    void method10090() {
	/* empty */
    }
    
    float method10093(float f, float f_6_, float f_7_) {
	float f_8_ = f - ((Class684_Sub3_Sub3) this).aFloat10795;
	if ((((Class684_Sub3_Sub3) this).aClass283_8607.method3794(2130061293)
	     .aFloat4780)
	    == Float.POSITIVE_INFINITY)
	    f_6_ = ((Class684_Sub3_Sub3) this).aClass283_8607.method3832
		       (-1045388452).method5069();
	else {
	    float f_9_
		= f_6_ / ((Class684_Sub3_Sub3) this).aClass283_8607.method3794
			     (2103369161).method5069();
	    float f_10_ = f_6_ / 2.0F * f_9_;
	    if (f_10_ > f_8_) {
		f_6_ -= ((Class684_Sub3_Sub3) this).aClass283_8607.method3794
			    (2077687871).method5069() * f_7_;
		if (f_6_ < 0.0F)
		    f_6_ = 0.0F;
	    } else if (f_6_
		       < ((Class684_Sub3_Sub3) this).aClass283_8607.method3832
			     (-1449930431).method5069()) {
		f_6_ += ((Class684_Sub3_Sub3) this).aClass283_8607.method3794
			    (2103872933).method5069() * f_7_;
		if (f_6_
		    > ((Class684_Sub3_Sub3) this).aClass283_8607.method3832
			  (-1039121140).method5069())
		    f_6_
			= ((Class684_Sub3_Sub3) this).aClass283_8607.method3832
			      (-1461319750).method5069();
	    }
	}
	return f_6_;
    }
}
