/* Class549 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Stack;

public class Class549
{
    public Class645_Sub1 aClass645_Sub1_7417;
    static Stack aStack7418 = new Stack();
    boolean aBool7419;
    Class555 aClass555_7420;
    public static int anInt7421;
    
    Class549() {
	/* empty */
    }
    
    public boolean method6682(Class173 class173, int i, int i_0_, int i_1_) {
	int i_2_ = aClass645_Sub1_7417.method9809(-364501442);
	if (null != aClass645_Sub1_7417.aClass159Array10678) {
	    for (int i_3_ = 0;
		 i_3_ < aClass645_Sub1_7417.aClass159Array10678.length;
		 i_3_++) {
		aClass645_Sub1_7417.aClass159Array10678[i_3_].anInt1753
		    <<= i_2_;
		if ((aClass645_Sub1_7417.aClass159Array10678[i_3_].method2057
		     ((-893393899 * ((Class555) (((Class549) this)
						 .aClass555_7420)).anInt7449
		       + i),
		      (((Class555) ((Class549) this).aClass555_7420).anInt7447
		       * 1598153949) + i_0_))
		    && aClass645_Sub1_7417.method9820(class173, i, i_0_,
						      (byte) -12)) {
		    aClass645_Sub1_7417.aClass159Array10678[i_3_].anInt1753
			>>= i_2_;
		    return true;
		}
		aClass645_Sub1_7417.aClass159Array10678[i_3_].anInt1753
		    >>= i_2_;
	    }
	}
	return false;
    }
    
    public static void method6683() {
	synchronized (aStack7418) {
	    aStack7418 = new Stack();
	}
    }
    
    public static int method6684(int i, int i_4_, int i_5_, boolean bool,
				 int i_6_) {
	if (0 != i && (i < 50 || i > 100))
	    i = 0;
	if (0 != i_4_ && (i_4_ < 50 || i_4_ > 100))
	    i_4_ = 0;
	boolean bool_7_ = Class493.aString5525.startsWith("mac");
	int[] is = (Canvas_Sub1.aTwitchTV11693.GetRecommendedSettings
		    (-1117838587 * Class411.anInt4713,
		     Class509.anInt6933 * -2142152407, i, 2000, i_5_,
		     Class581.aFloat7623, bool_7_));
	if (is[0] != 0)
	    return is[0];
	int i_8_ = is[1];
	int i_9_ = is[2];
	int i_10_ = is[3];
	int i_11_ = i_10_;
	Class581.aLong7615 = 0L;
	Class278.aLong3051
	    = 2389965673160777199L * (long) (1000.0F / (float) i_5_);
	Class444.anInt4914 = 650825617 * i_8_;
	Class492.anInt5521 = i_9_ * 1797361345;
	if (i_4_ != 0)
	    i_10_ = i_4_ * i_10_ / 100;
	Class364_Sub2.method9236(new StringBuilder().append
				     ("Stream - Input: ").append
				     (Class411.anInt4713 * -1117838587).append
				     ("x").append
				     (Class509.anInt6933 * -2142152407).append
				     (" (").append
				     (i_11_).append
				     ("kbps)").append
				     (" => ").append
				     ("Output: ").append
				     (i_8_).append
				     ("x").append
				     (i_9_).append
				     (" [").append
				     (0 == i ? "auto"
				      : new StringBuilder().append(i).append
					    ("%").toString())
				     .append
				     ("] (").append
				     (i_10_).append
				     ("kbps [").append
				     (i_4_ == 0 ? "auto"
				      : new StringBuilder().append(i_4_).append
					    ("%").toString())
				     .append
				     ("])").toString(),
				 (byte) -43);
	return Canvas_Sub1.aTwitchTV11693.StartStreaming(i_8_, i_9_, i_5_,
							 i_10_, i_4_ != 0,
							 Class581.aFloat7623,
							 (Class581.anInt7624
							  * 804402279),
							 bool);
    }
    
    static final void method6685(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = -1;
    }
}
