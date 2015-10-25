/* Class283 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public abstract class Class283
{
    static final int anInt3079 = 50;
    Class422 aClass422_3080;
    Class280 aClass280_3081;
    Class294 aClass294_3082;
    Class684 aClass684_3083;
    Class297 aClass297_3084;
    Class326 aClass326_3085;
    float aFloat3086;
    Class289 aClass289_3087;
    Class422 aClass422_3088;
    Class298 aClass298_3089;
    Class422 aClass422_3090 = new Class422();
    float aFloat3091 = 10.0F;
    public static final float aFloat3092 = Float.POSITIVE_INFINITY;
    Class422 aClass422_3093;
    int anInt3094;
    float aFloat3095 = 5120.0F;
    Interface29 anInterface29_3096;
    float aFloat3097 = 1.0F;
    float aFloat3098;
    float aFloat3099;
    float aFloat3100;
    Class422 aClass422_3101 = new Class422();
    Class422 aClass422_3102;
    float aFloat3103;
    float aFloat3104;
    float aFloat3105;
    float aFloat3106;
    boolean aBool3107;
    static final int anInt3108 = 10000;
    float aFloat3109;
    float aFloat3110;
    Class301 aClass301_3111;
    boolean aBool3112;
    int anInt3113;
    float aFloat3114;
    Class692 aClass692_3115;
    
    public void method3760(float f, int[][][] is, Class466 class466, int i,
			   int i_0_, int i_1_) {
	if (null != ((Class283) this).aClass684_3083)
	    ((Class283) this).aClass684_3083.method8004(f, -214452823);
	if (null != ((Class283) this).aClass326_3085)
	    ((Class283) this).aClass326_3085.method4251(f, is, class466, i,
							i_0_, 1766805624);
	Iterator iterator = ((Class283) this).aClass692_3115.iterator();
	while (iterator.hasNext()) {
	    Class528_Sub21_Sub8 class528_sub21_sub8
		= (Class528_Sub21_Sub8) iterator.next();
	    class528_sub21_sub8.method10534(f, 638438399);
	}
    }
    
    public void method3761(boolean bool, float f, Class422 class422,
			   Class430 class430, Class422 class422_2_,
			   Class422 class422_3_, int i) {
	if (Class289.aClass289_3181 == ((Class283) this).aClass289_3087)
	    Class521.method6356(f, class422, class422_2_, class422_3_,
				(bool ? ((Class283) this).aClass422_3080
				 : ((Class283) this).aClass422_3093),
				(bool ? ((Class283) this).aClass422_3101
				 : ((Class283) this).aClass422_3090),
				(float) (((Class283) this).anInt3113
					 * 751265977),
				((Class283) this).aFloat3114,
				((Class283) this).aFloat3098,
				((Class283) this).aFloat3099, 2020699382);
	else if (((Class283) this).aClass289_3087 == Class289.aClass289_3179)
	    Class465.method5628(f, class422, class430, class422_2_,
				class422_3_,
				(bool ? ((Class283) this).aClass422_3080
				 : ((Class283) this).aClass422_3093),
				(bool ? ((Class283) this).aClass422_3101
				 : ((Class283) this).aClass422_3090),
				(float) (751265977
					 * ((Class283) this).anInt3113),
				((Class283) this).aFloat3114,
				((Class283) this).aFloat3098,
				((Class283) this).aFloat3099, 629493659);
	else if (((Class283) this).aClass289_3087 == Class289.aClass289_3178)
	    Class269.method3682(f, class422, class430, class422_2_,
				class422_3_,
				(bool ? ((Class283) this).aClass422_3102
				 : ((Class283) this).aClass422_3088),
				(bool ? ((Class283) this).aFloat3104
				 : ((Class283) this).aFloat3103),
				((Class283) this).aFloat3098,
				((Class283) this).aFloat3100, (short) -10263);
    }
    
    public void method3762(int i) {
	((Class283) this).aClass692_3115.method8141(2047468270);
    }
    
    public Class326 method3763(Class297 class297, boolean bool, int i)
	throws Exception_Sub4 {
	if (Class280.aClass280_3061 == ((Class283) this).aClass280_3081
	    && !bool)
	    throw new Exception_Sub4();
	((Class283) this).aClass297_3084 = class297;
	if (Class297.aClass297_3251 == class297)
	    ((Class283) this).aClass326_3085 = new Class326_Sub1(this);
	else if (class297 == Class297.aClass297_3255)
	    ((Class283) this).aClass326_3085 = new Class326_Sub2(this);
	else if (Class297.aClass297_3253 == class297)
	    ((Class283) this).aClass326_3085 = new Class326_Sub3_Sub2(this);
	else if (Class297.aClass297_3250 == class297)
	    ((Class283) this).aClass326_3085 = new Class326_Sub3_Sub1(this);
	else if (Class297.aClass297_3254 == class297)
	    ((Class283) this).aClass326_3085 = new Class326_Sub3_Sub3(this);
	return ((Class283) this).aClass326_3085;
    }
    
    boolean method3764(byte i) {
	if (Class301.aClass301_3342 == ((Class283) this).aClass301_3111
	    && Class280.aClass280_3061 == ((Class283) this).aClass280_3081)
	    return true;
	if (((Class283) this).aClass301_3111 == Class301.aClass301_3341
	    && Class280.aClass280_3062 == ((Class283) this).aClass280_3081)
	    return true;
	return false;
    }
    
    public void method3765(float f, byte i) throws Exception_Sub4 {
	if (!method3764((byte) 61))
	    throw new Exception_Sub4();
    }
    
    public void method3766(Class289 class289, int i) throws Exception_Sub4 {
	if (!method3764((byte) -71))
	    throw new Exception_Sub4();
	((Class283) this).aClass289_3087 = class289;
    }
    
    public void method3767(Class422 class422, int i) throws Exception_Sub4 {
	if (!method3764((byte) -33)
	    || !((Class289) ((Class283) this).aClass289_3087).aBool3182)
	    throw new Exception_Sub4();
	((Class283) this).aClass422_3093.method5058(class422);
    }
    
    public void method3768(Class422 class422, byte i) throws Exception_Sub4 {
	if (!method3764((byte) -57)
	    || !((Class289) ((Class283) this).aClass289_3087).aBool3182)
	    throw new Exception_Sub4();
	((Class283) this).aClass422_3080.method5058(class422);
    }
    
    public void method3769(byte i) throws Exception_Sub4 {
	if (!method3764((byte) 90))
	    throw new Exception_Sub4();
	((Class283) this).aFloat3098 = 5120.0F;
	((Class283) this).aFloat3099 = 10.0F;
	((Class283) this).aFloat3100 = 1.0F;
    }
    
    public void method3770(float f, int i) throws Exception_Sub4 {
	if (!method3764((byte) -43))
	    throw new Exception_Sub4();
	((Class283) this).aFloat3086 = f;
    }
    
    public void method3771(Class422 class422, int i) throws Exception_Sub4 {
	if (!method3764((byte) 11)
	    || !((Class289) ((Class283) this).aClass289_3087).aBool3182)
	    throw new Exception_Sub4();
	((Class283) this).aClass422_3101.method5058(class422);
    }
    
    public void method3772(Class422 class422, float f, int i)
	throws Exception_Sub4 {
	if (!method3764((byte) -77)
	    || ((Class289) ((Class283) this).aClass289_3087).aBool3182)
	    throw new Exception_Sub4();
	((Class283) this).aClass422_3088.method5058(class422);
	((Class283) this).aClass422_3102.method5058(class422);
	((Class283) this).aFloat3103 = f;
	((Class283) this).aFloat3104 = f;
    }
    
    public void method3773(Class422 class422, float f, int i)
	throws Exception_Sub4 {
	if (!method3764((byte) 27)
	    || ((Class289) ((Class283) this).aClass289_3087).aBool3182)
	    throw new Exception_Sub4();
	((Class283) this).aClass422_3088.method5058(class422);
	((Class283) this).aFloat3103 = f;
    }
    
    public void method3774(Class422 class422, float f, int i)
	throws Exception_Sub4 {
	if (!method3764((byte) 59)
	    || ((Class289) ((Class283) this).aClass289_3087).aBool3182)
	    throw new Exception_Sub4();
	((Class283) this).aClass422_3102.method5058(class422);
	((Class283) this).aFloat3104 = f;
    }
    
    public void method3775(float f, float f_4_, byte i) throws Exception_Sub4 {
	if (!method3764((byte) 17))
	    throw new Exception_Sub4();
	if (f < 1.0F)
	    f = 50.0F;
	if (f_4_ < 1.0F)
	    f_4_ = 10000.0F;
	if (f >= f_4_)
	    throw new Exception_Sub4();
	((Class283) this).aFloat3105 = f;
	((Class283) this).aFloat3106 = f_4_;
    }
    
    public void method3776(float f, float f_5_, int i) throws Exception_Sub4 {
	if (!method3764((byte) -46))
	    throw new Exception_Sub4();
	((Class283) this).aFloat3109 = f;
	((Class283) this).aFloat3110 = f_5_;
    }
    
    public void method3777(boolean bool, boolean bool_6_, int i)
	throws Exception_Sub4 {
	if (!method3764((byte) -31))
	    throw new Exception_Sub4();
	((Class283) this).aBool3107 = bool;
	((Class283) this).aBool3112 = bool_6_;
    }
    
    public void method3778(int i, float f, int i_7_) throws Exception_Sub4 {
	if (!method3764((byte) 93)
	    || !((Class289) ((Class283) this).aClass289_3087).aBool3182)
	    throw new Exception_Sub4();
	((Class283) this).anInt3113 = i * 2009865609;
	((Class283) this).aFloat3114 = f;
    }
    
    public void method3779(float f, float f_8_, float f_9_, byte i)
	throws Exception_Sub4 {
	if (!method3764((byte) -50))
	    throw new Exception_Sub4();
	((Class283) this).aFloat3098 = f;
	((Class283) this).aFloat3099 = f_8_;
	((Class283) this).aFloat3100 = f_9_;
    }
    
    public void method3780(int i, int i_10_) {
	Class528_Sub21_Sub8 class528_sub21_sub8
	    = ((Class528_Sub21_Sub8)
	       ((Class283) this).aClass692_3115.method8137((long) i));
	if (null != class528_sub21_sub8)
	    class528_sub21_sub8.method6443(-868453665);
    }
    
    public void method3781(Class528_Sub21_Sub8 class528_sub21_sub8, int i) {
	((Class283) this).aClass692_3115.method8142
	    (class528_sub21_sub8,
	     (long) (class528_sub21_sub8.anInt11574 * 811527563));
    }
    
    public boolean method3782(short i) {
	if (null == ((Class283) this).aClass684_3083
	    || ((Class283) this).aClass326_3085 == null)
	    return false;
	if (!((Class283) this).aClass684_3083.method7986(612007552))
	    return false;
	if (!((Class283) this).aClass326_3085.method4238(1486149147))
	    return false;
	return true;
    }
    
    public Class280 method3783(byte i) {
	return ((Class283) this).aClass280_3081;
    }
    
    public void method3784(Class422 class422) throws Exception_Sub4 {
	if (!method3764((byte) -26)
	    || !((Class289) ((Class283) this).aClass289_3087).aBool3182)
	    throw new Exception_Sub4();
	((Class283) this).aClass422_3080.method5058(class422);
    }
    
    public Class684 method3785(byte i) {
	return ((Class283) this).aClass684_3083;
    }
    
    public Class294 method3786(byte i) {
	return ((Class283) this).aClass294_3082;
    }
    
    public Class297 method3787(byte i) {
	return ((Class283) this).aClass297_3084;
    }
    
    public Class422 method3788(short i) {
	if (((Class283) this).aClass326_3085 == null
	    || !((Class283) this).aClass326_3085.method4238(1486149147))
	    return null;
	return ((Class283) this).aClass326_3085.method4236((byte) 37);
    }
    
    public Class422 method3789(int i) {
	if (((Class283) this).aClass684_3083 == null
	    || !((Class283) this).aClass684_3083.method7986(-1286408865))
	    return null;
	return ((Class283) this).aClass684_3083.method7987(-1914997382);
    }
    
    public Class528_Sub19 method3790(int i) {
	if (null == ((Class283) this).aClass326_3085
	    || !((Class283) this).aClass326_3085.method4238(1486149147))
	    return null;
	return ((Class283) this).aClass326_3085.method4241(-706241900);
    }
    
    public float method3791(int i) {
	Class422 class422 = method3788((short) -14119);
	Class422 class422_11_ = method3789(-461189346);
	float f = 0.0F;
	if (null != class422 && null != class422_11_) {
	    Class422 class422_12_
		= Class422.method5065(class422_11_, class422);
	    float f_13_
		= (float) Math.sqrt((double) ((class422_12_.aFloat4777
					       * class422_12_.aFloat4777)
					      + (class422_12_.aFloat4780
						 * class422_12_.aFloat4780)));
	    f = (float) Math.atan2((double) -class422_12_.aFloat4776,
				   (double) f_13_);
	    class422.method5054();
	    class422_11_.method5054();
	}
	return f;
    }
    
    public float method3792(int i) {
	Class422 class422 = method3788((short) -1348);
	Class422 class422_14_ = method3789(1411122521);
	float f = 0.0F;
	if (class422 != null && class422_14_ != null) {
	    Class422 class422_15_
		= Class422.method5065(class422, class422_14_);
	    class422_15_.aFloat4776 = 0.0F;
	    f = (float) Math.atan2((double) class422_15_.aFloat4780,
				   (double) class422_15_.aFloat4777);
	    class422.method5054();
	    class422_14_.method5054();
	}
	return (float) (3.141592653589793 - (double) f);
    }
    
    public Class430 method3793(byte i) {
	Class430 class430 = Class430.method5188();
	class430.method5189(method3792(-16777216), method3791(-1013323660),
			    method3814(-1836791083));
	return class430;
    }
    
    public Class422 method3794(int i) {
	return ((Class283) this).aClass422_3093;
    }
    
    public double[] method3795(byte i) {
	if (((Class283) this).aClass326_3085 == null
	    || !((Class283) this).aClass326_3085.method4238(1486149147))
	    return null;
	return ((Class283) this).aClass326_3085.method4240(-1288092612);
    }
    
    public Class422 method3796(int i) {
	return ((Class283) this).aClass422_3101;
    }
    
    public float method3797(int i) {
	return ((Class283) this).aFloat3106;
    }
    
    public boolean method3798(int i) {
	return ((Class283) this).aBool3107;
    }
    
    public boolean method3799(int i) {
	return ((Class283) this).aBool3112;
    }
    
    public void method3800(boolean bool) {
	((Class283) this).aClass298_3089 = Class298.aClass298_3257;
	((Class283) this).aClass294_3082 = null;
	((Class283) this).aClass684_3083 = null;
	((Class283) this).aClass297_3084 = null;
	((Class283) this).aClass326_3085 = null;
	if (((Class283) this).aClass301_3111 == Class301.aClass301_3342
	    || !bool)
	    ((Class283) this).aClass280_3081 = Class280.aClass280_3061;
	else
	    ((Class283) this).aClass280_3081 = Class280.aClass280_3062;
	((Class283) this).aClass289_3087 = Class289.aClass289_3179;
	((Class283) this).aClass422_3090.method5057(100.0F, 100.0F, 100.0F);
	((Class283) this).aClass422_3101.method5057(100.0F, 100.0F, 100.0F);
	((Class283) this).aFloat3086 = 0.05F;
	((Class283) this).aClass422_3093.method5057(Float.POSITIVE_INFINITY,
						    Float.POSITIVE_INFINITY,
						    Float.POSITIVE_INFINITY);
	((Class283) this).aClass422_3080.method5057(Float.POSITIVE_INFINITY,
						    Float.POSITIVE_INFINITY,
						    Float.POSITIVE_INFINITY);
	((Class283) this).aClass422_3088.method5057(1.0F, 1.0F, 1.0F);
	((Class283) this).aClass422_3102.method5057(1.0F, 1.0F, 1.0F);
	((Class283) this).aFloat3103 = 1.1F;
	((Class283) this).aFloat3104 = 1.1F;
	((Class283) this).aFloat3105 = 50.0F;
	((Class283) this).aFloat3106 = 10000.0F;
	((Class283) this).aFloat3110 = 1.5707964F;
	((Class283) this).aFloat3109 = 1.5707964F;
	((Class283) this).anInt3094 = 544341971;
	((Class283) this).aBool3107 = true;
	((Class283) this).aBool3112 = true;
	((Class283) this).anInt3113 = 0;
	((Class283) this).aFloat3114 = 1.0F;
	((Class283) this).aClass692_3115.method8141(2055594638);
    }
    
    public void method3801(boolean bool) {
	((Class283) this).aClass298_3089 = Class298.aClass298_3257;
	((Class283) this).aClass294_3082 = null;
	((Class283) this).aClass684_3083 = null;
	((Class283) this).aClass297_3084 = null;
	((Class283) this).aClass326_3085 = null;
	if (((Class283) this).aClass301_3111 == Class301.aClass301_3342
	    || !bool)
	    ((Class283) this).aClass280_3081 = Class280.aClass280_3061;
	else
	    ((Class283) this).aClass280_3081 = Class280.aClass280_3062;
	((Class283) this).aClass289_3087 = Class289.aClass289_3179;
	((Class283) this).aClass422_3090.method5057(100.0F, 100.0F, 100.0F);
	((Class283) this).aClass422_3101.method5057(100.0F, 100.0F, 100.0F);
	((Class283) this).aFloat3086 = 0.05F;
	((Class283) this).aClass422_3093.method5057(Float.POSITIVE_INFINITY,
						    Float.POSITIVE_INFINITY,
						    Float.POSITIVE_INFINITY);
	((Class283) this).aClass422_3080.method5057(Float.POSITIVE_INFINITY,
						    Float.POSITIVE_INFINITY,
						    Float.POSITIVE_INFINITY);
	((Class283) this).aClass422_3088.method5057(1.0F, 1.0F, 1.0F);
	((Class283) this).aClass422_3102.method5057(1.0F, 1.0F, 1.0F);
	((Class283) this).aFloat3103 = 1.1F;
	((Class283) this).aFloat3104 = 1.1F;
	((Class283) this).aFloat3105 = 50.0F;
	((Class283) this).aFloat3106 = 10000.0F;
	((Class283) this).aFloat3110 = 1.5707964F;
	((Class283) this).aFloat3109 = 1.5707964F;
	((Class283) this).anInt3094 = 544341971;
	((Class283) this).aBool3107 = true;
	((Class283) this).aBool3112 = true;
	((Class283) this).anInt3113 = 0;
	((Class283) this).aFloat3114 = 1.0F;
	((Class283) this).aClass692_3115.method8141(2120669313);
    }
    
    public float method3802(int i) {
	return ((Class283) this).aFloat3109;
    }
    
    boolean method3803() {
	if (Class301.aClass301_3342 == ((Class283) this).aClass301_3111
	    && Class280.aClass280_3061 == ((Class283) this).aClass280_3081)
	    return true;
	if (((Class283) this).aClass301_3111 == Class301.aClass301_3341
	    && Class280.aClass280_3062 == ((Class283) this).aClass280_3081)
	    return true;
	return false;
    }
    
    public void method3804() throws Exception_Sub4 {
	if (!method3764((byte) 62))
	    throw new Exception_Sub4();
	((Class283) this).aFloat3098 = 5120.0F;
	((Class283) this).aFloat3099 = 10.0F;
	((Class283) this).aFloat3100 = 1.0F;
    }
    
    public void method3805(boolean bool) {
	((Class283) this).aClass298_3089 = Class298.aClass298_3257;
	((Class283) this).aClass294_3082 = null;
	((Class283) this).aClass684_3083 = null;
	((Class283) this).aClass297_3084 = null;
	((Class283) this).aClass326_3085 = null;
	if (((Class283) this).aClass301_3111 == Class301.aClass301_3342
	    || !bool)
	    ((Class283) this).aClass280_3081 = Class280.aClass280_3061;
	else
	    ((Class283) this).aClass280_3081 = Class280.aClass280_3062;
	((Class283) this).aClass289_3087 = Class289.aClass289_3179;
	((Class283) this).aClass422_3090.method5057(100.0F, 100.0F, 100.0F);
	((Class283) this).aClass422_3101.method5057(100.0F, 100.0F, 100.0F);
	((Class283) this).aFloat3086 = 0.05F;
	((Class283) this).aClass422_3093.method5057(Float.POSITIVE_INFINITY,
						    Float.POSITIVE_INFINITY,
						    Float.POSITIVE_INFINITY);
	((Class283) this).aClass422_3080.method5057(Float.POSITIVE_INFINITY,
						    Float.POSITIVE_INFINITY,
						    Float.POSITIVE_INFINITY);
	((Class283) this).aClass422_3088.method5057(1.0F, 1.0F, 1.0F);
	((Class283) this).aClass422_3102.method5057(1.0F, 1.0F, 1.0F);
	((Class283) this).aFloat3103 = 1.1F;
	((Class283) this).aFloat3104 = 1.1F;
	((Class283) this).aFloat3105 = 50.0F;
	((Class283) this).aFloat3106 = 10000.0F;
	((Class283) this).aFloat3110 = 1.5707964F;
	((Class283) this).aFloat3109 = 1.5707964F;
	((Class283) this).anInt3094 = 544341971;
	((Class283) this).aBool3107 = true;
	((Class283) this).aBool3112 = true;
	((Class283) this).anInt3113 = 0;
	((Class283) this).aFloat3114 = 1.0F;
	((Class283) this).aClass692_3115.method8141(2130840665);
    }
    
    public void method3806() throws Exception_Sub4 {
	if (!method3764((byte) 51))
	    throw new Exception_Sub4();
	((Class283) this).aFloat3098 = 5120.0F;
	((Class283) this).aFloat3099 = 10.0F;
	((Class283) this).aFloat3100 = 1.0F;
    }
    
    public void method3807(Class284 class284, Class433 class433,
			   Class418 class418, int i, int i_16_, int i_17_) {
	if (method3782((short) 255)) {
	    ((Class283) this).aClass684_3083.method7989
		(class284, class433, i, i_16_,
		 ((Class283) this).aClass326_3085.method4250(1938712661),
		 (short) -29496);
	    ((Class283) this).aClass326_3085.method4239(class284, i, i_16_,
							(byte) 79);
	    if (((Class283) this).aClass298_3089 == Class298.aClass298_3257)
		class418.method4981(((Class283) this).aFloat3105,
				    ((Class283) this).aFloat3106,
				    ((Class283) this).aFloat3109,
				    ((Class283) this).aFloat3110);
	    else
		class418.method4982(((Class283) this).aFloat3105,
				    ((Class283) this).aFloat3106,
				    (float) (-520982073
					     * ((Class283) this).anInt3094));
	    Iterator iterator = ((Class283) this).aClass692_3115.iterator();
	    while (iterator.hasNext()) {
		Class528_Sub21_Sub8 class528_sub21_sub8
		    = (Class528_Sub21_Sub8) iterator.next();
		class528_sub21_sub8.method10535(class284, class433, class418,
						1392450728);
	    }
	}
    }
    
    public void method3808(Class422 class422) throws Exception_Sub4 {
	if (!method3764((byte) -47)
	    || !((Class289) ((Class283) this).aClass289_3087).aBool3182)
	    throw new Exception_Sub4();
	((Class283) this).aClass422_3080.method5058(class422);
    }
    
    public Class528_Sub21_Sub8 method3809(int i, int i_18_) {
	return ((Class528_Sub21_Sub8)
		((Class283) this).aClass692_3115.method8137((long) i));
    }
    
    public void method3810() throws Exception_Sub4 {
	if (!method3764((byte) 14))
	    throw new Exception_Sub4();
	((Class283) this).aFloat3098 = 5120.0F;
	((Class283) this).aFloat3099 = 10.0F;
	((Class283) this).aFloat3100 = 1.0F;
    }
    
    public Class326 method3811(int i) {
	return ((Class283) this).aClass326_3085;
    }
    
    public void method3812() throws Exception_Sub4 {
	if (!method3764((byte) 56))
	    throw new Exception_Sub4();
	((Class283) this).aFloat3098 = 5120.0F;
	((Class283) this).aFloat3099 = 10.0F;
	((Class283) this).aFloat3100 = 1.0F;
    }
    
    public void method3813(Class422 class422) throws Exception_Sub4 {
	if (!method3764((byte) -38)
	    || !((Class289) ((Class283) this).aClass289_3087).aBool3182)
	    throw new Exception_Sub4();
	((Class283) this).aClass422_3090.method5058(class422);
    }
    
    float method3814(int i) {
	return 0.0F;
    }
    
    public Class422 method3815(int i) {
	return ((Class283) this).aClass422_3080;
    }
    
    public void method3816(Class422 class422, float f) throws Exception_Sub4 {
	if (!method3764((byte) -59)
	    || ((Class289) ((Class283) this).aClass289_3087).aBool3182)
	    throw new Exception_Sub4();
	((Class283) this).aClass422_3102.method5058(class422);
	((Class283) this).aFloat3104 = f;
    }
    
    public float method3817(int i) {
	return ((Class283) this).aFloat3086;
    }
    
    public void method3818(Class422 class422, int i) throws Exception_Sub4 {
	if (!method3764((byte) 3)
	    || !((Class289) ((Class283) this).aClass289_3087).aBool3182)
	    throw new Exception_Sub4();
	((Class283) this).aClass422_3090.method5058(class422);
    }
    
    public void method3819(Class422 class422, float f) throws Exception_Sub4 {
	if (!method3764((byte) 0)
	    || ((Class289) ((Class283) this).aClass289_3087).aBool3182)
	    throw new Exception_Sub4();
	((Class283) this).aClass422_3102.method5058(class422);
	((Class283) this).aFloat3104 = f;
    }
    
    public void method3820(int i) {
	Class528_Sub21_Sub8 class528_sub21_sub8
	    = ((Class528_Sub21_Sub8)
	       ((Class283) this).aClass692_3115.method8137((long) i));
	if (null != class528_sub21_sub8)
	    class528_sub21_sub8.method6443(-757162990);
    }
    
    public void method3821(int i) {
	Class528_Sub21_Sub8 class528_sub21_sub8
	    = ((Class528_Sub21_Sub8)
	       ((Class283) this).aClass692_3115.method8137((long) i));
	if (null != class528_sub21_sub8)
	    class528_sub21_sub8.method6443(2111401125);
    }
    
    public void method3822(int i) {
	Class528_Sub21_Sub8 class528_sub21_sub8
	    = ((Class528_Sub21_Sub8)
	       ((Class283) this).aClass692_3115.method8137((long) i));
	if (null != class528_sub21_sub8)
	    class528_sub21_sub8.method6443(2017468301);
    }
    
    public void method3823(int i) {
	Class528_Sub21_Sub8 class528_sub21_sub8
	    = ((Class528_Sub21_Sub8)
	       ((Class283) this).aClass692_3115.method8137((long) i));
	if (null != class528_sub21_sub8)
	    class528_sub21_sub8.method6443(-1708381454);
    }
    
    public void method3824(boolean bool) {
	((Class283) this).aClass298_3089 = Class298.aClass298_3257;
	((Class283) this).aClass294_3082 = null;
	((Class283) this).aClass684_3083 = null;
	((Class283) this).aClass297_3084 = null;
	((Class283) this).aClass326_3085 = null;
	if (((Class283) this).aClass301_3111 == Class301.aClass301_3342
	    || !bool)
	    ((Class283) this).aClass280_3081 = Class280.aClass280_3061;
	else
	    ((Class283) this).aClass280_3081 = Class280.aClass280_3062;
	((Class283) this).aClass289_3087 = Class289.aClass289_3179;
	((Class283) this).aClass422_3090.method5057(100.0F, 100.0F, 100.0F);
	((Class283) this).aClass422_3101.method5057(100.0F, 100.0F, 100.0F);
	((Class283) this).aFloat3086 = 0.05F;
	((Class283) this).aClass422_3093.method5057(Float.POSITIVE_INFINITY,
						    Float.POSITIVE_INFINITY,
						    Float.POSITIVE_INFINITY);
	((Class283) this).aClass422_3080.method5057(Float.POSITIVE_INFINITY,
						    Float.POSITIVE_INFINITY,
						    Float.POSITIVE_INFINITY);
	((Class283) this).aClass422_3088.method5057(1.0F, 1.0F, 1.0F);
	((Class283) this).aClass422_3102.method5057(1.0F, 1.0F, 1.0F);
	((Class283) this).aFloat3103 = 1.1F;
	((Class283) this).aFloat3104 = 1.1F;
	((Class283) this).aFloat3105 = 50.0F;
	((Class283) this).aFloat3106 = 10000.0F;
	((Class283) this).aFloat3110 = 1.5707964F;
	((Class283) this).aFloat3109 = 1.5707964F;
	((Class283) this).anInt3094 = 544341971;
	((Class283) this).aBool3107 = true;
	((Class283) this).aBool3112 = true;
	((Class283) this).anInt3113 = 0;
	((Class283) this).aFloat3114 = 1.0F;
	((Class283) this).aClass692_3115.method8141(2101476562);
    }
    
    public Interface29 method3825(byte i) {
	return ((Class283) this).anInterface29_3096;
    }
    
    public void method3826(Class280 class280, int i) {
	((Class283) this).aClass280_3081 = class280;
    }
    
    Class283(Class301 class301, Interface29 interface29) {
	((Class283) this).aClass422_3093 = new Class422();
	((Class283) this).aClass422_3080 = new Class422();
	((Class283) this).aFloat3095 = 5120.0F;
	((Class283) this).aFloat3091 = 10.0F;
	((Class283) this).aFloat3097 = 1.0F;
	((Class283) this).aFloat3098 = 5120.0F;
	((Class283) this).aFloat3099 = 10.0F;
	((Class283) this).aFloat3100 = 1.0F;
	((Class283) this).aClass422_3088 = new Class422();
	((Class283) this).aClass422_3102 = new Class422();
	((Class283) this).anInt3113 = 0;
	((Class283) this).aFloat3114 = 1.0F;
	((Class283) this).aClass692_3115 = new Class692(8);
	((Class283) this).aClass301_3111 = class301;
	((Class283) this).anInterface29_3096 = interface29;
	method3828(true, 1442298449);
    }
    
    public void method3827() {
	((Class283) this).aClass692_3115.method8141(2027398701);
    }
    
    public void method3828(boolean bool, int i) {
	((Class283) this).aClass298_3089 = Class298.aClass298_3257;
	((Class283) this).aClass294_3082 = null;
	((Class283) this).aClass684_3083 = null;
	((Class283) this).aClass297_3084 = null;
	((Class283) this).aClass326_3085 = null;
	if (((Class283) this).aClass301_3111 == Class301.aClass301_3342
	    || !bool)
	    ((Class283) this).aClass280_3081 = Class280.aClass280_3061;
	else
	    ((Class283) this).aClass280_3081 = Class280.aClass280_3062;
	((Class283) this).aClass289_3087 = Class289.aClass289_3179;
	((Class283) this).aClass422_3090.method5057(100.0F, 100.0F, 100.0F);
	((Class283) this).aClass422_3101.method5057(100.0F, 100.0F, 100.0F);
	((Class283) this).aFloat3086 = 0.05F;
	((Class283) this).aClass422_3093.method5057(Float.POSITIVE_INFINITY,
						    Float.POSITIVE_INFINITY,
						    Float.POSITIVE_INFINITY);
	((Class283) this).aClass422_3080.method5057(Float.POSITIVE_INFINITY,
						    Float.POSITIVE_INFINITY,
						    Float.POSITIVE_INFINITY);
	((Class283) this).aClass422_3088.method5057(1.0F, 1.0F, 1.0F);
	((Class283) this).aClass422_3102.method5057(1.0F, 1.0F, 1.0F);
	((Class283) this).aFloat3103 = 1.1F;
	((Class283) this).aFloat3104 = 1.1F;
	((Class283) this).aFloat3105 = 50.0F;
	((Class283) this).aFloat3106 = 10000.0F;
	((Class283) this).aFloat3110 = 1.5707964F;
	((Class283) this).aFloat3109 = 1.5707964F;
	((Class283) this).anInt3094 = 544341971;
	((Class283) this).aBool3107 = true;
	((Class283) this).aBool3112 = true;
	((Class283) this).anInt3113 = 0;
	((Class283) this).aFloat3114 = 1.0F;
	((Class283) this).aClass692_3115.method8141(2084972910);
    }
    
    public void method3829() {
	((Class283) this).aClass692_3115.method8141(2052955282);
    }
    
    public float method3830(int i) {
	return ((Class283) this).aFloat3105;
    }
    
    public Class684 method3831(Class294 class294, boolean bool, int i)
	throws Exception_Sub4 {
	if (((Class283) this).aClass280_3081 == Class280.aClass280_3061
	    && !bool)
	    throw new Exception_Sub4();
	((Class283) this).aClass294_3082 = class294;
	if (class294 == Class294.aClass294_3225)
	    ((Class283) this).aClass684_3083 = new Class684_Sub1(this);
	else if (Class294.aClass294_3227 == class294)
	    ((Class283) this).aClass684_3083 = new Class684_Sub4(this);
	else if (class294 == Class294.aClass294_3226)
	    ((Class283) this).aClass684_3083 = new Class684_Sub5(this);
	else if (Class294.aClass294_3231 == class294)
	    ((Class283) this).aClass684_3083 = new Class684_Sub3_Sub3(this);
	else if (Class294.aClass294_3228 == class294)
	    ((Class283) this).aClass684_3083 = new Class684_Sub3_Sub1(this);
	else if (Class294.aClass294_3229 == class294)
	    ((Class283) this).aClass684_3083 = new Class684_Sub2(this);
	else if (class294 == Class294.aClass294_3230)
	    ((Class283) this).aClass684_3083 = new Class684_Sub3_Sub2(this);
	return ((Class283) this).aClass684_3083;
    }
    
    public Class422 method3832(int i) {
	return ((Class283) this).aClass422_3090;
    }
    
    static final void method3833(Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	((Class648) class648).anInt8395 -= -1816921966;
	int i_19_ = (((Class648) class648).anIntArray8394
		     [((Class648) class648).anInt8395 * 717927929]);
	int i_20_ = (((Class648) class648).anIntArray8394
		     [1 + 717927929 * ((Class648) class648).anInt8395]);
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = string.substring(i_19_, i_20_);
    }
    
    public static final void method3834(Class157 class157, Class690 class690,
					Class690 class690_21_, int i) {
	if (class690.method8099(988920908)
	    && class690_21_.method8099(1859019464)) {
	    Class190 class190 = ((Class690) class690).aClass190_8668;
	    Class190 class190_22_ = ((Class690) class690_21_).aClass190_8668;
	    class157.method2009
		((((Class701) ((Class690) class690).aClass701_8678)
		  .aClass528_Sub21_Sub16_8739),
		 28843855 * (((Class701) ((Class690) class690).aClass701_8678)
			     .anInt8737),
		 (((Class701) ((Class690) class690).aClass701_8678)
		  .aClass528_Sub21_Sub16_8740),
		 (((Class701) ((Class690) class690).aClass701_8678).anInt8738
		  * -1905518381),
		 ((Class690) class690).anInt8669 * 1064317205,
		 (class190.anIntArray2139
		  [-419273787 * ((Class690) class690).anInt8676]),
		 (((Class701) ((Class690) class690_21_).aClass701_8678)
		  .aClass528_Sub21_Sub16_8739),
		 (((Class701) ((Class690) class690_21_).aClass701_8678)
		  .anInt8737) * 28843855,
		 (((Class701) ((Class690) class690_21_).aClass701_8678)
		  .aClass528_Sub21_Sub16_8740),
		 -1905518381 * ((Class701) (((Class690) class690_21_)
					    .aClass701_8678)).anInt8738,
		 1064317205 * ((Class690) class690_21_).anInt8669,
		 (class190_22_.anIntArray2139
		  [((Class690) class690_21_).anInt8676 * -419273787]),
		 (class190.aClass180_2146 != null
		  ? class190.aClass180_2146.aBoolArray2089 : null),
		 class190.aBool2155 | class190_22_.aBool2155);
	}
    }
    
    public static void method3835(int i) {
	Class277.aMap3046.clear();
	Class277.aClass692_3044.method8141(2088378348);
	Class277.aClass679_3043.method7961(-1784018266);
	Class277.anInt3045 = 0;
    }
}
