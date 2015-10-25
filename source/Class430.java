/* Class430 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class430
{
    static int anInt4813;
    static int anInt4814;
    public float aFloat4815;
    public float aFloat4816;
    static Class430[] aClass430Array4817 = new Class430[0];
    public float aFloat4818;
    public float aFloat4819;
    
    static Class430 method5162(float f, float f_0_, float f_1_, float f_2_) {
	synchronized (aClass430Array4817) {
	    if (anInt4814 == 0) {
		Class430 class430 = new Class430(f, f_0_, f_1_, f_2_);
		return class430;
	    }
	    aClass430Array4817[--anInt4814].method5165(f, f_0_, f_1_, f_2_);
	    Class430 class430 = aClass430Array4817[anInt4814];
	    return class430;
	}
    }
    
    public static Class430 method5163(Class430 class430) {
	synchronized (aClass430Array4817) {
	    if (anInt4814 == 0) {
		Class430 class430_3_ = new Class430(class430);
		return class430_3_;
	    }
	    aClass430Array4817[--anInt4814].method5187(class430);
	    Class430 class430_4_ = aClass430Array4817[anInt4814];
	    return class430_4_;
	}
    }
    
    public Class430() {
	method5190();
    }
    
    public Class430(float f, float f_5_, float f_6_, float f_7_) {
	method5165(f, f_5_, f_6_, f_7_);
    }
    
    public Class430(Class430 class430_8_) {
	method5187(class430_8_);
    }
    
    public Class430(float f, float f_9_, float f_10_) {
	method5189(f, f_9_, f_10_);
    }
    
    final void method5164() {
	aFloat4816 = -aFloat4816;
	aFloat4819 = -aFloat4819;
	aFloat4818 = -aFloat4818;
	aFloat4815 = -aFloat4815;
    }
    
    void method5165(float f, float f_11_, float f_12_, float f_13_) {
	aFloat4816 = f;
	aFloat4819 = f_11_;
	aFloat4818 = f_12_;
	aFloat4815 = f_13_;
    }
    
    public final void method5166(Class430 class430_14_, float f) {
	if (method5174(class430_14_) < 0.0F)
	    method5164();
	method5177(1.0F - f);
	Class430 class430_15_ = method5178(class430_14_, f);
	method5173(class430_15_);
	class430_15_.method5194();
	method5172();
    }
    
    public void method5167(Class422 class422, float f) {
	method5168(class422.aFloat4780, class422.aFloat4776,
		   class422.aFloat4777, f);
    }
    
    public void method5168(float f, float f_16_, float f_17_, float f_18_) {
	float f_19_ = (float) Math.sin((double) (f_18_ * 0.5F));
	float f_20_ = (float) Math.cos((double) (f_18_ * 0.5F));
	aFloat4816 = f * f_19_;
	aFloat4819 = f_16_ * f_19_;
	aFloat4818 = f_17_ * f_19_;
	aFloat4815 = f_20_;
    }
    
    public final void method5169() {
	aFloat4816 = -aFloat4816;
	aFloat4819 = -aFloat4819;
	aFloat4818 = -aFloat4818;
    }
    
    public final void method5170() {
	aFloat4816 = -aFloat4816;
	aFloat4819 = -aFloat4819;
	aFloat4818 = -aFloat4818;
    }
    
    public static final Class430 method5171(Class430 class430) {
	Class430 class430_21_ = method5163(class430);
	class430_21_.method5170();
	return class430_21_;
    }
    
    public final void method5172() {
	float f = 1.0F / method5199(this);
	aFloat4816 *= f;
	aFloat4819 *= f;
	aFloat4818 *= f;
	aFloat4815 *= f;
    }
    
    final void method5173(Class430 class430_22_) {
	aFloat4816 += class430_22_.aFloat4816;
	aFloat4819 += class430_22_.aFloat4819;
	aFloat4818 += class430_22_.aFloat4818;
	aFloat4815 += class430_22_.aFloat4815;
    }
    
    final float method5174(Class430 class430_23_) {
	return (aFloat4816 * class430_23_.aFloat4816
		+ aFloat4819 * class430_23_.aFloat4819
		+ aFloat4818 * class430_23_.aFloat4818
		+ aFloat4815 * class430_23_.aFloat4815);
    }
    
    static final float method5175(Class430 class430, Class430 class430_24_) {
	return class430.method5174(class430_24_);
    }
    
    public final void method5176(Class430 class430_25_) {
	method5165((class430_25_.aFloat4815 * aFloat4816
		    + class430_25_.aFloat4816 * aFloat4815
		    + class430_25_.aFloat4819 * aFloat4818
		    - class430_25_.aFloat4818 * aFloat4819),
		   (class430_25_.aFloat4815 * aFloat4819
		    - class430_25_.aFloat4816 * aFloat4818
		    + class430_25_.aFloat4819 * aFloat4815
		    + class430_25_.aFloat4818 * aFloat4816),
		   (class430_25_.aFloat4815 * aFloat4818
		    + class430_25_.aFloat4816 * aFloat4819
		    - class430_25_.aFloat4819 * aFloat4816
		    + class430_25_.aFloat4818 * aFloat4815),
		   (class430_25_.aFloat4815 * aFloat4815
		    - class430_25_.aFloat4816 * aFloat4816
		    - class430_25_.aFloat4819 * aFloat4819
		    - class430_25_.aFloat4818 * aFloat4818));
    }
    
    final void method5177(float f) {
	aFloat4816 *= f;
	aFloat4819 *= f;
	aFloat4818 *= f;
	aFloat4815 *= f;
    }
    
    static final Class430 method5178(Class430 class430, float f) {
	Class430 class430_26_ = method5163(class430);
	class430_26_.method5177(f);
	return class430_26_;
    }
    
    public String method5179() {
	return new StringBuilder().append(aFloat4816).append(",").append
		   (aFloat4819).append
		   (",").append
		   (aFloat4818).append
		   (",").append
		   (aFloat4815).toString();
    }
    
    public void method5180() {
	synchronized (aClass430Array4817) {
	    if (anInt4814 < anInt4813 - 1)
		aClass430Array4817[anInt4814++] = this;
	}
    }
    
    static {
	new Class430();
    }
    
    public String method5181() {
	return new StringBuilder().append(aFloat4816).append(",").append
		   (aFloat4819).append
		   (",").append
		   (aFloat4818).append
		   (",").append
		   (aFloat4815).toString();
    }
    
    public String method5182() {
	return new StringBuilder().append(aFloat4816).append(",").append
		   (aFloat4819).append
		   (",").append
		   (aFloat4818).append
		   (",").append
		   (aFloat4815).toString();
    }
    
    public String method5183() {
	return new StringBuilder().append(aFloat4816).append(",").append
		   (aFloat4819).append
		   (",").append
		   (aFloat4818).append
		   (",").append
		   (aFloat4815).toString();
    }
    
    public static void method5184(int i) {
	anInt4813 = i;
	aClass430Array4817 = new Class430[i];
	anInt4814 = 0;
    }
    
    public void method5185() {
	synchronized (aClass430Array4817) {
	    if (anInt4814 < anInt4813 - 1)
		aClass430Array4817[anInt4814++] = this;
	}
    }
    
    static final Class430 method5186(Class430 class430,
				     Class430 class430_27_) {
	Class430 class430_28_ = method5163(class430);
	class430_28_.method5176(class430_27_);
	return class430_28_;
    }
    
    public void method5187(Class430 class430_29_) {
	aFloat4816 = class430_29_.aFloat4816;
	aFloat4819 = class430_29_.aFloat4819;
	aFloat4818 = class430_29_.aFloat4818;
	aFloat4815 = class430_29_.aFloat4815;
    }
    
    public static Class430 method5188() {
	synchronized (aClass430Array4817) {
	    if (anInt4814 == 0) {
		Class430 class430 = new Class430();
		return class430;
	    }
	    aClass430Array4817[--anInt4814].method5190();
	    Class430 class430 = aClass430Array4817[anInt4814];
	    return class430;
	}
    }
    
    public void method5189(float f, float f_30_, float f_31_) {
	method5168(0.0F, 1.0F, 0.0F, f);
	Class430 class430_32_ = method5188();
	class430_32_.method5168(1.0F, 0.0F, 0.0F, f_30_);
	method5176(class430_32_);
	class430_32_.method5168(0.0F, 0.0F, 1.0F, f_31_);
	method5176(class430_32_);
	class430_32_.method5194();
    }
    
    final void method5190() {
	aFloat4818 = 0.0F;
	aFloat4819 = 0.0F;
	aFloat4816 = 0.0F;
	aFloat4815 = 1.0F;
    }
    
    final void method5191() {
	aFloat4816 = -aFloat4816;
	aFloat4819 = -aFloat4819;
	aFloat4818 = -aFloat4818;
	aFloat4815 = -aFloat4815;
    }
    
    public final void method5192() {
	aFloat4816 = -aFloat4816;
	aFloat4819 = -aFloat4819;
	aFloat4818 = -aFloat4818;
    }
    
    public final void method5193() {
	float f = 1.0F / method5199(this);
	aFloat4816 *= f;
	aFloat4819 *= f;
	aFloat4818 *= f;
	aFloat4815 *= f;
    }
    
    public void method5194() {
	synchronized (aClass430Array4817) {
	    if (anInt4814 < anInt4813 - 1)
		aClass430Array4817[anInt4814++] = this;
	}
    }
    
    public void method5195(ByteBuffer class528_sub42) {
	aFloat4816 = class528_sub42.method9635(-1722242789);
	aFloat4819 = class528_sub42.method9635(-1558951372);
	aFloat4818 = class528_sub42.method9635(-1715678314);
	aFloat4815 = class528_sub42.method9635(-1600971275);
    }
    
    final void method5196(Class430 class430_33_) {
	aFloat4816 += class430_33_.aFloat4816;
	aFloat4819 += class430_33_.aFloat4819;
	aFloat4818 += class430_33_.aFloat4818;
	aFloat4815 += class430_33_.aFloat4815;
    }
    
    final void method5197(Class430 class430_34_) {
	aFloat4816 += class430_34_.aFloat4816;
	aFloat4819 += class430_34_.aFloat4819;
	aFloat4818 += class430_34_.aFloat4818;
	aFloat4815 += class430_34_.aFloat4815;
    }
    
    final void method5198(Class430 class430_35_) {
	aFloat4816 += class430_35_.aFloat4816;
	aFloat4819 += class430_35_.aFloat4819;
	aFloat4818 += class430_35_.aFloat4818;
	aFloat4815 += class430_35_.aFloat4815;
    }
    
    public String toString() {
	return new StringBuilder().append(aFloat4816).append(",").append
		   (aFloat4819).append
		   (",").append
		   (aFloat4818).append
		   (",").append
		   (aFloat4815).toString();
    }
    
    static final float method5199(Class430 class430) {
	return (float) Math.sqrt((double) method5175(class430, class430));
    }
    
    public static void method5200(int i) {
	anInt4813 = i;
	aClass430Array4817 = new Class430[i];
	anInt4814 = 0;
    }
    
    public void method5201(ByteBuffer class528_sub42) {
	aFloat4816 = class528_sub42.method9635(-1521045291);
	aFloat4819 = class528_sub42.method9635(-1855072078);
	aFloat4818 = class528_sub42.method9635(-1512531996);
	aFloat4815 = class528_sub42.method9635(-1386637463);
    }
}
