/* Class258 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public abstract class Class258
{
    static Interface27 anInterface27_2834 = new Class255();
    Class262[] aClass262Array2835;
    String aString2836;
    Class278 aClass278_2837;
    Class278 aClass278_2838;
    int anInt2839;
    protected int anInt2840 = -681469149;
    int anInt2841;
    static int anInt2842;
    
    public final int method3477(int i) {
	return ((Class258) this).aClass262Array2835.length;
    }
    
    public abstract void method3478();
    
    public abstract void method3479();
    
    public final void method3480(Class528_Sub22_Sub1 class528_sub22_sub1,
				 float f, float f_0_, float f_1_, short i) {
	((Class258) this).aClass262Array2835[anInt2840 * 719688565]
	    .method3591(class528_sub22_sub1, f, f_0_, f_1_);
    }
    
    public String method3481(int i) {
	return ((Class258) this).aString2836;
    }
    
    abstract Class262 method3482(Class173_Sub1 class173_sub1,
				 Class261 class261);
    
    public Class262 method3483(String string, int i)
	throws Exception_Sub2_Sub1 {
	Class262[] class262s = ((Class258) this).aClass262Array2835;
	for (int i_2_ = 0; i_2_ < class262s.length; i_2_++) {
	    Class262 class262 = class262s[i_2_];
	    String string_3_ = class262.method3593(768918457);
	    if (null != string_3_ && string_3_.equals(string)) {
		if (!class262.method3588())
		    throw new Exception_Sub2_Sub1(string);
		return class262;
	    }
	}
	throw new Exception_Sub2_Sub1(string);
    }
    
    abstract Class262 method3484(Class173_Sub1 class173_sub1,
				 Class261 class261);
    
    abstract Class262 method3485(Class173_Sub1 class173_sub1,
				 Class261 class261);
    
    abstract Class262 method3486(Class173_Sub1 class173_sub1,
				 Class261 class261);
    
    public Class262 method3487(int i) {
	Class262[] class262s = ((Class258) this).aClass262Array2835;
	for (int i_4_ = 0; i_4_ < class262s.length; i_4_++) {
	    Class262 class262 = class262s[i_4_];
	    if (class262.method3588())
		return class262;
	}
	return null;
    }
    
    public abstract boolean method3488(Class262 class262);
    
    public final Class262 method3489(int i) {
	return (anInt2840 * 719688565 >= 0
		? ((Class258) this).aClass262Array2835[anInt2840 * 719688565]
		: null);
    }
    
    public abstract boolean method3490();
    
    public final void method3491(Class528_Sub22_Sub1 class528_sub22_sub1,
				 float f, int i) {
	((Class258) this).aClass262Array2835[719688565 * anInt2840]
	    .method3589(class528_sub22_sub1, f);
    }
    
    public final void method3492(Class528_Sub22_Sub1 class528_sub22_sub1,
				 float f, float f_5_, int i) {
	((Class258) this).aClass262Array2835[anInt2840 * 719688565]
	    .method3590(class528_sub22_sub1, f, f_5_);
    }
    
    public final void method3493(Class528_Sub22_Sub1 class528_sub22_sub1,
				 float f, float f_6_, float f_7_, float f_8_,
				 int i) {
	((Class258) this).aClass262Array2835[719688565 * anInt2840]
	    .method3592(class528_sub22_sub1, f, f_6_, f_7_, f_8_);
    }
    
    public final void method3494(Class528_Sub22_Sub1 class528_sub22_sub1,
				 Class422 class422, int i) {
	((Class258) this).aClass262Array2835[719688565 * anInt2840].method3591
	    (class528_sub22_sub1, class422.aFloat4780, class422.aFloat4776,
	     class422.aFloat4777);
    }
    
    public final void method3495(Class528_Sub22_Sub1 class528_sub22_sub1,
				 Class425 class425, int i) {
	((Class258) this).aClass262Array2835[anInt2840 * 719688565].method3592
	    (class528_sub22_sub1, class425.aFloat4790, class425.aFloat4791,
	     class425.aFloat4792, class425.aFloat4793);
    }
    
    public final void method3496(Class528_Sub22_Sub1 class528_sub22_sub1,
				 Class418 class418, short i) {
	((Class258) this).aClass262Array2835[anInt2840 * 719688565]
	    .method3607(class528_sub22_sub1, class418);
    }
    
    public final void method3497(Class528_Sub22_Sub1 class528_sub22_sub1,
				 int i, byte i_9_) {
	float f = (float) (i >> 16 & 0xff) / 255.0F;
	float f_10_ = (float) (i >> 8 & 0xff) / 255.0F;
	float f_11_ = (float) (i & 0xff) / 255.0F;
	float f_12_ = (float) (i >> 24 & 0xff) / 255.0F;
	method3493(class528_sub22_sub1, f, f_10_, f_11_, f_12_, -1916092031);
    }
    
    public Class528_Sub22_Sub1 method3498(String string, int i)
	throws Exception_Sub2_Sub2 {
	Class528_Sub22_Sub1 class528_sub22_sub1
	    = ((Class528_Sub22_Sub1)
	       ((Class258) this).aClass278_2837.method3723(string,
							   -1296050975));
	if (class528_sub22_sub1 == null)
	    throw new Exception_Sub2_Sub2(string);
	return class528_sub22_sub1;
    }
    
    public final void method3499(Class528_Sub22_Sub1 class528_sub22_sub1,
				 Class418 class418, int i) {
	((Class258) this).aClass262Array2835[719688565 * anInt2840]
	    .method3595(class528_sub22_sub1, class418);
    }
    
    public final void method3500(int i, float f, float f_13_, float f_14_,
				 byte i_15_) {
	((Class258) this).aClass262Array2835[anInt2840 * 719688565]
	    .method3597(i, f, f_13_, f_14_);
    }
    
    public final void method3501(int i, float f, float f_16_, float f_17_,
				 float f_18_, short i_19_) {
	((Class258) this).aClass262Array2835[anInt2840 * 719688565]
	    .method3610(i, f, f_16_, f_17_, f_18_);
    }
    
    public final void method3502(int i, Class422 class422, int i_20_) {
	((Class258) this).aClass262Array2835[anInt2840 * 719688565].method3597
	    (i, class422.aFloat4780, class422.aFloat4776, class422.aFloat4777);
    }
    
    public final void method3503(int i, float[] fs, int i_21_, int i_22_) {
	((Class258) this).aClass262Array2835[anInt2840 * 719688565]
	    .method3599(i, fs, i_21_);
    }
    
    public final void method3504(int i, Class418 class418, int i_23_) {
	((Class258) this).aClass262Array2835[719688565 * anInt2840]
	    .method3600(i, class418);
    }
    
    void method3505() {
	/* empty */
    }
    
    public final void method3506(int i, Class418 class418, int i_24_) {
	((Class258) this).aClass262Array2835[719688565 * anInt2840]
	    .method3629(i, class418);
    }
    
    public final void method3507(int i, int i_25_, Interface38 interface38,
				 int i_26_) {
	((Class258) this).aClass262Array2835[anInt2840 * 719688565]
	    .method3608(i, i_25_, interface38);
    }
    
    public final void method3508(Class528_Sub22_Sub1 class528_sub22_sub1,
				 int i, Interface38 interface38, int i_27_) {
	((Class258) this).aClass262Array2835[719688565 * anInt2840]
	    .method3596(class528_sub22_sub1, i, interface38);
    }
    
    public int method3509(int i) {
	return ((Class258) this).anInt2839 * -1457459897;
    }
    
    void method3510() {
	/* empty */
    }
    
    abstract Class528_Sub22_Sub1 method3511(Class271 class271);
    
    public Class528_Sub22_Sub1 method3512(int i, short i_28_) {
	return ((Class528_Sub22_Sub1)
		((Class258) this).aClass278_2837.method3725(i, (byte) -63));
    }
    
    void method3513() {
	/* empty */
    }
    
    public abstract void method3514();
    
    public abstract boolean method3515(Class262 class262);
    
    public abstract void method3516();
    
    Class258(Class173_Sub1 class173_sub1, Class275 class275) {
	((Class258) this).aString2836 = ((Class275) class275).aString3037;
	((Class258) this).anInt2841
	    = 1690113791 * ((Class275) class275).aClass271Array3036.length;
	((Class258) this).aClass278_2837
	    = new Class278(((Class258) this).anInt2841 * 473032959,
			   anInterface27_2834);
	for (int i = 0; i < 473032959 * ((Class258) this).anInt2841; i++)
	    ((Class258) this).aClass278_2837.method3726
		(i,
		 (((Class271) ((Class275) class275).aClass271Array3036[i])
		  .aString2895),
		 method3511(((Class275) class275).aClass271Array3036[i]),
		 -1577383574);
	((Class258) this).anInt2839
	    = ((Class275) class275).aClass271Array3034.length * -695554953;
	((Class258) this).aClass278_2838
	    = new Class278(-1457459897 * ((Class258) this).anInt2839,
			   anInterface27_2834);
	for (int i = 0; i < -1457459897 * ((Class258) this).anInt2839; i++)
	    ((Class258) this).aClass278_2838.method3726
		(i,
		 (((Class271) ((Class275) class275).aClass271Array3034[i])
		  .aString2895),
		 method3511(((Class275) class275).aClass271Array3034[i]),
		 -1230138042);
	((Class258) this).aClass262Array2835
	    = new Class262[((Class275) class275).aClass261Array3038.length];
	for (int i = 0; i < ((Class275) class275).aClass261Array3038.length;
	     i++)
	    ((Class258) this).aClass262Array2835[i]
		= method3482(class173_sub1,
			     ((Class275) class275).aClass261Array3038[i]);
    }
    
    public abstract void method3517();
    
    public String method3518() {
	return ((Class258) this).aString2836;
    }
    
    public String method3519() {
	return ((Class258) this).aString2836;
    }
    
    abstract Class262 method3520(Class173_Sub1 class173_sub1,
				 Class261 class261);
    
    public abstract void method3521();
    
    public Class528_Sub22_Sub1 method3522(String string, int i) {
	return ((Class528_Sub22_Sub1)
		((Class258) this).aClass278_2838.method3723(string,
							    141915598));
    }
    
    abstract Class262 method3523(Class173_Sub1 class173_sub1,
				 Class261 class261);
    
    abstract Class528_Sub22_Sub1 method3524(Class271 class271);
    
    abstract Class528_Sub22_Sub1 method3525(Class271 class271);
    
    public final int method3526() {
	return 719688565 * anInt2840;
    }
    
    public final Class262 method3527(int i, byte i_29_) {
	return ((Class258) this).aClass262Array2835[i];
    }
    
    public Class528_Sub22_Sub1 method3528(int i, byte i_30_) {
	return ((Class528_Sub22_Sub1)
		((Class258) this).aClass278_2838.method3725(i, (byte) -98));
    }
    
    public final void method3529(Class528_Sub22_Sub1 class528_sub22_sub1,
				 float[] fs, int i) {
	((Class258) this).aClass262Array2835[719688565 * anInt2840]
	    .method3603(class528_sub22_sub1, fs, fs.length);
    }
    
    public final int method3530(int i) {
	return 719688565 * anInt2840;
    }
    
    public final int method3531() {
	return 719688565 * anInt2840;
    }
    
    public abstract boolean method3532();
    
    public final void method3533(int i, Class418 class418, int i_31_) {
	((Class258) this).aClass262Array2835[anInt2840 * 719688565]
	    .method3601(i, class418);
    }
    
    public int method3534(int i) {
	return ((Class258) this).anInt2841 * 473032959;
    }
    
    public int method3535() {
	return ((Class258) this).anInt2839 * -1457459897;
    }
    
    public int method3536() {
	return ((Class258) this).anInt2841 * 473032959;
    }
    
    public int method3537() {
	return ((Class258) this).anInt2841 * 473032959;
    }
    
    public abstract void method3538();
    
    public final int method3539() {
	return ((Class258) this).aClass262Array2835.length;
    }
    
    public int method3540(Class262 class262, short i) {
	for (int i_32_ = 0;
	     i_32_ < ((Class258) this).aClass262Array2835.length; i_32_++) {
	    if (class262 == ((Class258) this).aClass262Array2835[i_32_])
		return i_32_;
	}
	return -1;
    }
    
    public abstract boolean method3541(Class262 class262);
    
    static final void method3542(Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	String string_33_ = (String) (((Class648) class648).anObjectArray8396
				      [(((Class648) class648).anInt8410
					-= 1600226731) * -520794877]);
	Class528_Sub34 class528_sub34
	    = Class656.method7845(OutgoingOpcode.aClass403_4491,
				  client.aClass109_11162.aClass10_1379,
				  -1942966143);
	class528_sub34.aClass528_Sub42_Sub2_10481.method9717
	    ((Class14.method627(string, 174284066)
	      + Class14.method627(string_33_, -714092509)),
	     (byte) -2);
	class528_sub34.aClass528_Sub42_Sub2_10481.writeString(string,
							     -1936289654);
	class528_sub34.aClass528_Sub42_Sub2_10481.writeString(string_33_,
							     -1936289654);
	client.aClass109_11162.method1380(class528_sub34, 324878737);
    }
    
    static final void method3543(Class648 class648, int i) {
	int i_34_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_34_, (byte) 97);
	Class226 class226 = Class380.aClass226Array3970[i_34_ >> 16];
	Class196.method2829(class229, class226, class648, (byte) -19);
    }
    
    static final void method3544(Class648 class648, byte i) {
	Class96.aClass259_1226.method3555(-574756925);
    }
    
    static final boolean method3545(Class109 class109, byte i) {
	boolean bool;
	try {
	    bool = PacketDecoder.method2918(class109, (byte) 40);
	} catch (IOException ioexception) {
	    if (client.anInt10876 * 175711435 == 13) {
		class109.method1397((short) 6035);
		return false;
	    }
	    Class662.method7879((byte) 44);
	    return true;
	} catch (Exception exception) {
	    Class578 class578 = client.aClass495_10935.method5966(1273279609);
	    String string
		= new StringBuilder().append
		      (((Class109) class109).current != null
		       ? (1548242725
			  * ((Class109) class109).current.anInt4215)
		       : -1)
		      .append
		      (Class49.aString555).append
		      (((Class109) class109).aClass396_1385 != null
		       ? (((Class109) class109).aClass396_1385.anInt4215
			  * 1548242725)
		       : -1)
		      .append
		      (Class49.aString555).append
		      (((Class109) class109).aClass396_1390 != null
		       ? (((Class109) class109).aClass396_1390.anInt4215
			  * 1548242725)
		       : -1)
		      .append
		      (" ").append
		      (((Class109) class109).anInt1383 * 1841403963).append
		      (Class49.aString555).append
		      (961465569 * class578.anInt7607
		       + (Class108.myPlayer
			  .sceneXQueue[0]))
		      .append
		      (Class49.aString555).append
		      (class578.anInt7608 * -173815201
		       + (Class108.myPlayer
			  .sceneYQueue[0]))
		      .append
		      (" ").toString();
	    for (int i_35_ = 0;
		 (i_35_ < 1841403963 * ((Class109) class109).anInt1383
		  && i_35_ < 50);
		 i_35_++)
		string = new StringBuilder().append(string).append
			     (((Class109) class109).aClass528_Sub42_Sub2_1378
			      .payload[i_35_])
			     .append
			     (Class49.aString555).toString();
	    VarDomainType.method5340(string, exception, 1868437416);
	    Class416.method4969(false, 5126206);
	    return true;
	}
	return bool;
    }
    
    static final void method3546(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class160.method2059(class229, class226, false, 1, class648,
			    -1649643344);
    }
}
