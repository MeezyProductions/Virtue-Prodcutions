/* Class422 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class422
{
    public float aFloat4776;
    public float aFloat4777;
    static int anInt4778;
    static int anInt4779;
    public float aFloat4780;
    static Class422[] aClass422Array4781;
    
    public final void method5050(Class422 class422_0_, float f) {
	method5095(1.0F - f);
	method5063(method5084(class422_0_, f));
    }
    
    public static Class422 method5051(float f, float f_1_, float f_2_) {
	synchronized (aClass422Array4781) {
	    if (anInt4778 == 0) {
		Class422 class422 = new Class422(f, f_1_, f_2_);
		return class422;
	    }
	    aClass422Array4781[--anInt4778].method5057(f, f_1_, f_2_);
	    Class422 class422 = aClass422Array4781[anInt4778];
	    return class422;
	}
    }
    
    public static Class422 method5052(Class422 class422) {
	synchronized (aClass422Array4781) {
	    if (anInt4778 == 0) {
		Class422 class422_3_ = new Class422(class422);
		return class422_3_;
	    }
	    aClass422Array4781[--anInt4778].method5058(class422);
	    Class422 class422_4_ = aClass422Array4781[anInt4778];
	    return class422_4_;
	}
    }
    
    public static Class422 method5053(ByteBuffer class528_sub42) {
	synchronized (aClass422Array4781) {
	    if (anInt4778 == 0) {
		Class422 class422 = new Class422(class528_sub42);
		return class422;
	    }
	    aClass422Array4781[--anInt4778].method5056(class528_sub42);
	    Class422 class422 = aClass422Array4781[anInt4778];
	    return class422;
	}
    }
    
    public void method5054() {
	synchronized (aClass422Array4781) {
	    if (anInt4778 < anInt4779 - 1)
		aClass422Array4781[anInt4778++] = this;
	}
    }
    
    public final void method5055(Class422 class422_5_) {
	aFloat4780 -= class422_5_.aFloat4780;
	aFloat4776 -= class422_5_.aFloat4776;
	aFloat4777 -= class422_5_.aFloat4777;
    }
    
    public Class422(Class422 class422_6_) {
	aFloat4780 = class422_6_.aFloat4780;
	aFloat4776 = class422_6_.aFloat4776;
	aFloat4777 = class422_6_.aFloat4777;
    }
    
    Class422(ByteBuffer class528_sub42) {
	aFloat4780 = class528_sub42.method9635(-1892870817);
	aFloat4776 = class528_sub42.method9635(-1882305671);
	aFloat4777 = class528_sub42.method9635(-2075623292);
    }
    
    public void method5056(ByteBuffer class528_sub42) {
	aFloat4780 = class528_sub42.method9635(-1717406735);
	aFloat4776 = class528_sub42.method9635(-1972580342);
	aFloat4777 = class528_sub42.method9635(-1670459547);
    }
    
    public void method5057(float f, float f_7_, float f_8_) {
	aFloat4780 = f;
	aFloat4776 = f_7_;
	aFloat4777 = f_8_;
    }
    
    public void method5058(Class422 class422_9_) {
	method5057(class422_9_.aFloat4780, class422_9_.aFloat4776,
		   class422_9_.aFloat4777);
    }
    
    public final void method5059() {
	aFloat4777 = 0.0F;
	aFloat4776 = 0.0F;
	aFloat4780 = 0.0F;
    }
    
    public boolean method5060(Class422 class422_10_) {
	if (aFloat4780 != class422_10_.aFloat4780
	    || aFloat4776 != class422_10_.aFloat4776
	    || aFloat4777 != class422_10_.aFloat4777)
	    return false;
	return true;
    }
    
    public final void method5061() {
	aFloat4780 = -aFloat4780;
	aFloat4776 = -aFloat4776;
	aFloat4777 = -aFloat4777;
    }
    
    public final void method5062() {
	float f = 1.0F / method5069();
	aFloat4780 *= f;
	aFloat4776 *= f;
	aFloat4777 *= f;
    }
    
    public final void method5063(Class422 class422_11_) {
	aFloat4780 += class422_11_.aFloat4780;
	aFloat4776 += class422_11_.aFloat4776;
	aFloat4777 += class422_11_.aFloat4777;
    }
    
    public final void method5064(Class422 class422_12_, float f) {
	aFloat4780 += class422_12_.aFloat4780 * f;
	aFloat4776 += class422_12_.aFloat4776 * f;
	aFloat4777 += class422_12_.aFloat4777 * f;
    }
    
    public static final Class422 method5065(Class422 class422,
					    Class422 class422_13_) {
	Class422 class422_14_ = method5052(class422);
	class422_14_.method5055(class422_13_);
	return class422_14_;
    }
    
    public final float method5066(Class422 class422_15_) {
	return (aFloat4780 * class422_15_.aFloat4780
		+ aFloat4776 * class422_15_.aFloat4776
		+ aFloat4777 * class422_15_.aFloat4777);
    }
    
    public void method5067() {
	synchronized (aClass422Array4781) {
	    if (anInt4778 < anInt4779 - 1)
		aClass422Array4781[anInt4778++] = this;
	}
    }
    
    public Class422() {
	/* empty */
    }
    
    public static final Class422 method5068(Class422 class422,
					    Class422 class422_16_) {
	Class422 class422_17_ = method5052(class422);
	class422_17_.method5090(class422_16_);
	return class422_17_;
    }
    
    public final float method5069() {
	return (float) Math.sqrt((double) (aFloat4780 * aFloat4780
					   + aFloat4776 * aFloat4776
					   + aFloat4777 * aFloat4777));
    }
    
    public final void method5070() {
	if (aFloat4780 < 0.0F)
	    aFloat4780 *= -1.0F;
	if (aFloat4776 < 0.0F)
	    aFloat4776 *= -1.0F;
	if (aFloat4777 < 0.0F)
	    aFloat4777 *= -1.0F;
    }
    
    final void method5071(Class422 class422_18_) {
	aFloat4780 *= class422_18_.aFloat4780;
	aFloat4776 *= class422_18_.aFloat4776;
	aFloat4777 *= class422_18_.aFloat4777;
    }
    
    public String method5072() {
	return new StringBuilder().append(aFloat4780).append(", ").append
		   (aFloat4776).append
		   (", ").append
		   (aFloat4777).toString();
    }
    
    public Class422(float f, float f_19_, float f_20_) {
	aFloat4780 = f;
	aFloat4776 = f_19_;
	aFloat4777 = f_20_;
    }
    
    public final void method5073(float f) {
	aFloat4780 /= f;
	aFloat4776 /= f;
	aFloat4777 /= f;
    }
    
    final void method5074(Class422 class422_21_) {
	aFloat4780 /= class422_21_.aFloat4780;
	aFloat4776 /= class422_21_.aFloat4776;
	aFloat4777 /= class422_21_.aFloat4777;
    }
    
    public final void method5075(Class430 class430) {
	Class430 class430_22_
	    = Class430.method5162(aFloat4780, aFloat4776, aFloat4777, 0.0F);
	Class430 class430_23_ = Class430.method5171(class430);
	Class430 class430_24_
	    = Class430.method5186(class430_23_, class430_22_);
	class430_24_.method5176(class430);
	method5057(class430_24_.aFloat4816, class430_24_.aFloat4819,
		   class430_24_.aFloat4818);
	class430_22_.method5194();
	class430_23_.method5194();
	class430_24_.method5194();
    }
    
    public final void method5076(Class433 class433) {
	float f = aFloat4780;
	float f_25_ = aFloat4776;
	aFloat4780 = (((Class433) class433).aFloat4832 * f
		      + ((Class433) class433).aFloat4835 * f_25_
		      + ((Class433) class433).aFloat4841 * aFloat4777
		      + ((Class433) class433).aFloat4837);
	aFloat4776 = (((Class433) class433).aFloat4833 * f
		      + ((Class433) class433).aFloat4836 * f_25_
		      + ((Class433) class433).aFloat4839 * aFloat4777
		      + ((Class433) class433).aFloat4842);
	aFloat4777 = (((Class433) class433).aFloat4834 * f
		      + ((Class433) class433).aFloat4843 * f_25_
		      + ((Class433) class433).aFloat4840 * aFloat4777
		      + ((Class433) class433).aFloat4831);
    }
    
    public final void method5077(Class433 class433) {
	float f = aFloat4780;
	float f_26_ = aFloat4776;
	aFloat4780 = (((Class433) class433).aFloat4832 * f
		      + ((Class433) class433).aFloat4835 * f_26_
		      + ((Class433) class433).aFloat4841 * aFloat4777);
	aFloat4776 = (((Class433) class433).aFloat4833 * f
		      + ((Class433) class433).aFloat4836 * f_26_
		      + ((Class433) class433).aFloat4839 * aFloat4777);
	aFloat4777 = (((Class433) class433).aFloat4834 * f
		      + ((Class433) class433).aFloat4843 * f_26_
		      + ((Class433) class433).aFloat4840 * aFloat4777);
    }
    
    public String toString() {
	return new StringBuilder().append(aFloat4780).append(", ").append
		   (aFloat4776).append
		   (", ").append
		   (aFloat4777).toString();
    }
    
    public static final Class422 method5078(Class422 class422,
					    Class422 class422_27_) {
	Class422 class422_28_ = method5052(class422);
	class422_28_.method5098(class422_27_);
	return class422_28_;
    }
    
    public String method5079() {
	return new StringBuilder().append(aFloat4780).append(", ").append
		   (aFloat4776).append
		   (", ").append
		   (aFloat4777).toString();
    }
    
    public String method5080() {
	return new StringBuilder().append(aFloat4780).append(", ").append
		   (aFloat4776).append
		   (", ").append
		   (aFloat4777).toString();
    }
    
    public String method5081() {
	return new StringBuilder().append(aFloat4780).append(", ").append
		   (aFloat4776).append
		   (", ").append
		   (aFloat4777).toString();
    }
    
    public static Class422 method5082() {
	synchronized (aClass422Array4781) {
	    if (anInt4778 == 0) {
		Class422 class422 = new Class422();
		return class422;
	    }
	    aClass422Array4781[--anInt4778].method5059();
	    Class422 class422 = aClass422Array4781[anInt4778];
	    return class422;
	}
    }
    
    public static Class422 method5083() {
	synchronized (aClass422Array4781) {
	    if (anInt4778 == 0) {
		Class422 class422 = new Class422();
		return class422;
	    }
	    aClass422Array4781[--anInt4778].method5059();
	    Class422 class422 = aClass422Array4781[anInt4778];
	    return class422;
	}
    }
    
    static {
	new Class422(0.0F, 0.0F, 0.0F);
	aClass422Array4781 = new Class422[0];
    }
    
    public static final Class422 method5084(Class422 class422, float f) {
	Class422 class422_29_ = method5052(class422);
	class422_29_.method5095(f);
	return class422_29_;
    }
    
    public static final float method5085(Class422 class422,
					 Class422 class422_30_) {
	return class422.method5066(class422_30_);
    }
    
    public void method5086(float f, float f_31_, float f_32_) {
	aFloat4780 = f;
	aFloat4776 = f_31_;
	aFloat4777 = f_32_;
    }
    
    public final void method5087() {
	aFloat4780 = -aFloat4780;
	aFloat4776 = -aFloat4776;
	aFloat4777 = -aFloat4777;
    }
    
    public final void method5088() {
	float f = 1.0F / method5069();
	aFloat4780 *= f;
	aFloat4776 *= f;
	aFloat4777 *= f;
    }
    
    public final void method5089(float f) {
	aFloat4780 *= f;
	aFloat4776 *= f;
	aFloat4777 *= f;
    }
    
    final void method5090(Class422 class422_33_) {
	method5057((aFloat4776 * class422_33_.aFloat4777
		    - aFloat4777 * class422_33_.aFloat4776),
		   (aFloat4777 * class422_33_.aFloat4780
		    - aFloat4780 * class422_33_.aFloat4777),
		   (aFloat4780 * class422_33_.aFloat4776
		    - aFloat4776 * class422_33_.aFloat4780));
    }
    
    public static final Class422 method5091(Class422 class422,
					    Class422 class422_34_) {
	Class422 class422_35_ = method5052(class422);
	class422_35_.method5071(class422_34_);
	return class422_35_;
    }
    
    public void method5092() {
	synchronized (aClass422Array4781) {
	    if (anInt4778 < anInt4779 - 1)
		aClass422Array4781[anInt4778++] = this;
	}
    }
    
    public final void method5093(Class422 class422_36_, float f) {
	method5095(1.0F - f);
	method5063(method5084(class422_36_, f));
    }
    
    public static final Class422 method5094(Class422 class422,
					    Class422 class422_37_) {
	Class422 class422_38_ = method5052(class422);
	class422_38_.method5063(class422_37_);
	return class422_38_;
    }
    
    public final void method5095(float f) {
	aFloat4780 *= f;
	aFloat4776 *= f;
	aFloat4777 *= f;
    }
    
    public final void method5096() {
	if (aFloat4780 < 0.0F)
	    aFloat4780 *= -1.0F;
	if (aFloat4776 < 0.0F)
	    aFloat4776 *= -1.0F;
	if (aFloat4777 < 0.0F)
	    aFloat4777 *= -1.0F;
    }
    
    final void method5097(Class422 class422_39_) {
	aFloat4780 *= class422_39_.aFloat4780;
	aFloat4776 *= class422_39_.aFloat4776;
	aFloat4777 *= class422_39_.aFloat4777;
    }
    
    final void method5098(Class422 class422_40_) {
	aFloat4780 /= class422_40_.aFloat4780;
	aFloat4776 /= class422_40_.aFloat4776;
	aFloat4777 /= class422_40_.aFloat4777;
    }
    
    public static void method5099(int i) {
	anInt4779 = i;
	aClass422Array4781 = new Class422[i];
	anInt4778 = 0;
    }
    
    public static Class422 method5100() {
	synchronized (aClass422Array4781) {
	    if (anInt4778 == 0) {
		Class422 class422 = new Class422();
		return class422;
	    }
	    aClass422Array4781[--anInt4778].method5059();
	    Class422 class422 = aClass422Array4781[anInt4778];
	    return class422;
	}
    }
    
    final void method5101(Class422 class422_41_) {
	aFloat4780 *= class422_41_.aFloat4780;
	aFloat4776 *= class422_41_.aFloat4776;
	aFloat4777 *= class422_41_.aFloat4777;
    }
    
    public final void method5102(Class422 class422_42_, float f) {
	method5095(1.0F - f);
	method5063(method5084(class422_42_, f));
    }
    
    public final void method5103() {
	if (aFloat4780 < 0.0F)
	    aFloat4780 *= -1.0F;
	if (aFloat4776 < 0.0F)
	    aFloat4776 *= -1.0F;
	if (aFloat4777 < 0.0F)
	    aFloat4777 *= -1.0F;
    }
}
