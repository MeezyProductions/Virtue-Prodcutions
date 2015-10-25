/* Class429 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class429
{
    public static void method5161(Class422 class422, Class422 class422_0_,
				  Class422 class422_1_, float f,
				  Class422[] class422s) {
	Class422 class422_2_ = Class422.method5065(class422, class422_1_);
	float f_3_ = Class422.method5085(class422_2_, class422_2_) - f * f;
	float f_4_ = Class422.method5085(class422_0_, class422_2_);
	float f_5_ = f_4_ * f_4_ - f_3_;
	if (f_5_ < 0.0F) {
	    Class422[] class422s_6_ = class422s;
	    class422s[1] = null;
	    class422s_6_[0] = null;
	} else if (f_5_ >= 9.765625E-4F) {
	    float f_7_ = (float) Math.sqrt((double) f_5_);
	    class422s[0] = Class422.method5100();
	    class422s[0].method5058(class422);
	    class422s[0].method5063
		(Class422.method5084(Class422.method5052(class422_0_),
				     -f_4_ - f_7_));
	    class422s[1] = Class422.method5100();
	    class422s[1].method5058(class422);
	    class422s[1].method5063
		(Class422.method5084(Class422.method5052(class422_0_),
				     -f_4_ + f_7_));
	} else {
	    class422s[0] = Class422.method5100();
	    class422s[0].method5058(class422);
	    class422s[0].method5063
		(Class422.method5084(Class422.method5052(class422_0_), -f_4_));
	    class422s[1] = null;
	}
    }
    
    Class429() throws Throwable {
	throw new Error();
    }
}
