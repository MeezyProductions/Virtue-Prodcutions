/* Class192 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class192 implements Interface55
{
    Class218 this$0;
    
    public void method347(Object object, float[] fs, Object[] objects) {
	Class469 class469 = (Class469) object;
	Class422 class422 = class469.method5762((short) -10860);
	float f = class469.method5784((short) -2251);
	float f_0_ = class469.method5756(1770494187);
	Class422 class422_1_ = ((Class192) this).this$0.method3085(-719168055);
	Class422 class422_2_ = Class422.method5065(class422, class422_1_);
	float f_3_ = 0.0F;
	float f_4_ = class422_2_.method5069();
	if (f_4_ >= f_0_)
	    f_3_ = 0.0F;
	else {
	    float f_5_ = ((Float) objects[0]).floatValue();
	    float f_6_ = ((Float) objects[1]).floatValue();
	    if (class422_1_.aFloat4780 > class422.aFloat4780 - f_5_ / 2.0F
		&& class422_1_.aFloat4780 < f_5_ / 2.0F + class422.aFloat4780
		&& class422_1_.aFloat4777 > class422.aFloat4777 - f_6_ / 2.0F
		&& (class422_1_.aFloat4777
		    < class422.aFloat4777 + f_6_ / 2.0F)) {
		float f_7_ = Math.abs(class422_1_.aFloat4780
				      - (f_5_ / 2.0F + class422.aFloat4780));
		float f_8_
		    = Math.abs(class422_1_.aFloat4780 - (class422.aFloat4780
							 - f_5_ / 2.0F));
		float f_9_ = Math.abs(class422_1_.aFloat4777
				      - (f_6_ / 2.0F + class422.aFloat4780));
		float f_10_
		    = Math.abs(class422_1_.aFloat4777 - (class422.aFloat4780
							 - f_6_ / 2.0F));
		float f_11_ = f_0_ - f;
		float f_12_ = Math.min(f_7_, f_8_);
		float f_13_ = Math.min(f_9_, f_10_);
		float f_14_ = 1.0F / f_11_ * f_12_;
		float f_15_ = 1.0F / f_11_ * f_13_;
		f_14_ = Math.min(Math.max(f_14_, 0.0F), 1.0F);
		f_15_ = Math.min(Math.max(f_15_, 0.0F), 1.0F);
		f_3_ = Math.min(f_14_, f_15_);
	    }
	}
	fs[0] = f_3_;
	fs[1] = f_3_;
    }
    
    public void method351(Object object, float[] fs, Object[] objects, int i) {
	Class469 class469 = (Class469) object;
	Class422 class422 = class469.method5762((short) -21318);
	float f = class469.method5784((short) -7749);
	float f_16_ = class469.method5756(1770494187);
	Class422 class422_17_ = ((Class192) this).this$0.method3085(384668008);
	Class422 class422_18_ = Class422.method5065(class422, class422_17_);
	float f_19_ = 0.0F;
	float f_20_ = class422_18_.method5069();
	if (f_20_ >= f_16_)
	    f_19_ = 0.0F;
	else {
	    float f_21_ = ((Float) objects[0]).floatValue();
	    float f_22_ = ((Float) objects[1]).floatValue();
	    if (class422_17_.aFloat4780 > class422.aFloat4780 - f_21_ / 2.0F
		&& class422_17_.aFloat4780 < f_21_ / 2.0F + class422.aFloat4780
		&& class422_17_.aFloat4777 > class422.aFloat4777 - f_22_ / 2.0F
		&& (class422_17_.aFloat4777
		    < class422.aFloat4777 + f_22_ / 2.0F)) {
		float f_23_ = Math.abs(class422_17_.aFloat4780
				       - (f_21_ / 2.0F + class422.aFloat4780));
		float f_24_
		    = Math.abs(class422_17_.aFloat4780 - (class422.aFloat4780
							  - f_21_ / 2.0F));
		float f_25_ = Math.abs(class422_17_.aFloat4777
				       - (f_22_ / 2.0F + class422.aFloat4780));
		float f_26_
		    = Math.abs(class422_17_.aFloat4777 - (class422.aFloat4780
							  - f_22_ / 2.0F));
		float f_27_ = f_16_ - f;
		float f_28_ = Math.min(f_23_, f_24_);
		float f_29_ = Math.min(f_25_, f_26_);
		float f_30_ = 1.0F / f_27_ * f_28_;
		float f_31_ = 1.0F / f_27_ * f_29_;
		f_30_ = Math.min(Math.max(f_30_, 0.0F), 1.0F);
		f_31_ = Math.min(Math.max(f_31_, 0.0F), 1.0F);
		f_19_ = Math.min(f_30_, f_31_);
	    }
	}
	fs[0] = f_19_;
	fs[1] = f_19_;
    }
    
    public void method350(Object object, float[] fs, Object[] objects) {
	Class469 class469 = (Class469) object;
	Class422 class422 = class469.method5762((short) -15586);
	float f = class469.method5784((short) -10569);
	float f_32_ = class469.method5756(1770494187);
	Class422 class422_33_ = ((Class192) this).this$0.method3085(-69576767);
	Class422 class422_34_ = Class422.method5065(class422, class422_33_);
	float f_35_ = 0.0F;
	float f_36_ = class422_34_.method5069();
	if (f_36_ >= f_32_)
	    f_35_ = 0.0F;
	else {
	    float f_37_ = ((Float) objects[0]).floatValue();
	    float f_38_ = ((Float) objects[1]).floatValue();
	    if (class422_33_.aFloat4780 > class422.aFloat4780 - f_37_ / 2.0F
		&& class422_33_.aFloat4780 < f_37_ / 2.0F + class422.aFloat4780
		&& class422_33_.aFloat4777 > class422.aFloat4777 - f_38_ / 2.0F
		&& (class422_33_.aFloat4777
		    < class422.aFloat4777 + f_38_ / 2.0F)) {
		float f_39_ = Math.abs(class422_33_.aFloat4780
				       - (f_37_ / 2.0F + class422.aFloat4780));
		float f_40_
		    = Math.abs(class422_33_.aFloat4780 - (class422.aFloat4780
							  - f_37_ / 2.0F));
		float f_41_ = Math.abs(class422_33_.aFloat4777
				       - (f_38_ / 2.0F + class422.aFloat4780));
		float f_42_
		    = Math.abs(class422_33_.aFloat4777 - (class422.aFloat4780
							  - f_38_ / 2.0F));
		float f_43_ = f_32_ - f;
		float f_44_ = Math.min(f_39_, f_40_);
		float f_45_ = Math.min(f_41_, f_42_);
		float f_46_ = 1.0F / f_43_ * f_44_;
		float f_47_ = 1.0F / f_43_ * f_45_;
		f_46_ = Math.min(Math.max(f_46_, 0.0F), 1.0F);
		f_47_ = Math.min(Math.max(f_47_, 0.0F), 1.0F);
		f_35_ = Math.min(f_46_, f_47_);
	    }
	}
	fs[0] = f_35_;
	fs[1] = f_35_;
    }
    
    public void method349(Object object, float[] fs, Object[] objects) {
	Class469 class469 = (Class469) object;
	Class422 class422 = class469.method5762((short) -30233);
	float f = class469.method5784((short) -14365);
	float f_48_ = class469.method5756(1770494187);
	Class422 class422_49_ = ((Class192) this).this$0.method3085(306816188);
	Class422 class422_50_ = Class422.method5065(class422, class422_49_);
	float f_51_ = 0.0F;
	float f_52_ = class422_50_.method5069();
	if (f_52_ >= f_48_)
	    f_51_ = 0.0F;
	else {
	    float f_53_ = ((Float) objects[0]).floatValue();
	    float f_54_ = ((Float) objects[1]).floatValue();
	    if (class422_49_.aFloat4780 > class422.aFloat4780 - f_53_ / 2.0F
		&& class422_49_.aFloat4780 < f_53_ / 2.0F + class422.aFloat4780
		&& class422_49_.aFloat4777 > class422.aFloat4777 - f_54_ / 2.0F
		&& (class422_49_.aFloat4777
		    < class422.aFloat4777 + f_54_ / 2.0F)) {
		float f_55_ = Math.abs(class422_49_.aFloat4780
				       - (f_53_ / 2.0F + class422.aFloat4780));
		float f_56_
		    = Math.abs(class422_49_.aFloat4780 - (class422.aFloat4780
							  - f_53_ / 2.0F));
		float f_57_ = Math.abs(class422_49_.aFloat4777
				       - (f_54_ / 2.0F + class422.aFloat4780));
		float f_58_
		    = Math.abs(class422_49_.aFloat4777 - (class422.aFloat4780
							  - f_54_ / 2.0F));
		float f_59_ = f_48_ - f;
		float f_60_ = Math.min(f_55_, f_56_);
		float f_61_ = Math.min(f_57_, f_58_);
		float f_62_ = 1.0F / f_59_ * f_60_;
		float f_63_ = 1.0F / f_59_ * f_61_;
		f_62_ = Math.min(Math.max(f_62_, 0.0F), 1.0F);
		f_63_ = Math.min(Math.max(f_63_, 0.0F), 1.0F);
		f_51_ = Math.min(f_62_, f_63_);
	    }
	}
	fs[0] = f_51_;
	fs[1] = f_51_;
    }
    
    Class192(Class218 class218) {
	((Class192) this).this$0 = class218;
    }
    
    public void method348(Object object, float[] fs, Object[] objects) {
	Class469 class469 = (Class469) object;
	Class422 class422 = class469.method5762((short) -19336);
	float f = class469.method5784((short) -26315);
	float f_64_ = class469.method5756(1770494187);
	Class422 class422_65_
	    = ((Class192) this).this$0.method3085(1902468727);
	Class422 class422_66_ = Class422.method5065(class422, class422_65_);
	float f_67_ = 0.0F;
	float f_68_ = class422_66_.method5069();
	if (f_68_ >= f_64_)
	    f_67_ = 0.0F;
	else {
	    float f_69_ = ((Float) objects[0]).floatValue();
	    float f_70_ = ((Float) objects[1]).floatValue();
	    if (class422_65_.aFloat4780 > class422.aFloat4780 - f_69_ / 2.0F
		&& class422_65_.aFloat4780 < f_69_ / 2.0F + class422.aFloat4780
		&& class422_65_.aFloat4777 > class422.aFloat4777 - f_70_ / 2.0F
		&& (class422_65_.aFloat4777
		    < class422.aFloat4777 + f_70_ / 2.0F)) {
		float f_71_ = Math.abs(class422_65_.aFloat4780
				       - (f_69_ / 2.0F + class422.aFloat4780));
		float f_72_
		    = Math.abs(class422_65_.aFloat4780 - (class422.aFloat4780
							  - f_69_ / 2.0F));
		float f_73_ = Math.abs(class422_65_.aFloat4777
				       - (f_70_ / 2.0F + class422.aFloat4780));
		float f_74_
		    = Math.abs(class422_65_.aFloat4777 - (class422.aFloat4780
							  - f_70_ / 2.0F));
		float f_75_ = f_64_ - f;
		float f_76_ = Math.min(f_71_, f_72_);
		float f_77_ = Math.min(f_73_, f_74_);
		float f_78_ = 1.0F / f_75_ * f_76_;
		float f_79_ = 1.0F / f_75_ * f_77_;
		f_78_ = Math.min(Math.max(f_78_, 0.0F), 1.0F);
		f_79_ = Math.min(Math.max(f_79_, 0.0F), 1.0F);
		f_67_ = Math.min(f_78_, f_79_);
	    }
	}
	fs[0] = f_67_;
	fs[1] = f_67_;
    }
    
    public static void method2795(int i) {
	if (null == Class293.aClass286Array3212) {
	    Class293.aClass286Array3212 = Class286.method3856((byte) 123);
	    Class236.aClass286_2596 = Class293.aClass286Array3212[0];
	    Class184.aLong2102
		= Class249.method3417(2103561945) * -5907641532321817611L;
	}
	if (Class293.aClass292_3215 == null)
	    Class335_Sub1_Sub2.method10413(691421421);
	Class286 class286 = Class236.aClass286_2596;
	int i_80_ = Class537.method6529(-2048510230);
	if (class286 == Class236.aClass286_2596) {
	    Class573.aString7566
		= ((Class286) Class236.aClass286_2596).aClass39_3148
		      .method807(Class378_Sub2.aClass668_10123, (byte) 102);
	    Class691_Sub17.aString10746 = Class573.aString7566;
	    if (((Class286) Class236.aClass286_2596).aBool3153)
		Class483.anInt5476
		    = (620165877
		       * ((402322775
			   * ((Class286) Class236.aClass286_2596).anInt3129)
			  + ((-1615773921
			      * ((Class286) Class236.aClass286_2596).anInt3147)
			     - (((Class286) Class236.aClass286_2596).anInt3129
				* 402322775)) * i_80_ / 100));
	    if (((Class286) Class236.aClass286_2596).aBool3152)
		Class691_Sub17.aString10746
		    = new StringBuilder().append
			  (Class691_Sub17.aString10746).append
			  (" - ").append
			  (712008029 * Class483.anInt5476).append
			  ("%").toString();
	} else if (Class236.aClass286_2596 == Class286.aClass286_3146) {
	    Class293.aClass292_3215 = null;
	    Class487.method5890(8, 2130003981);
	    if (Class293.aBool3219) {
		Class293.aBool3219 = false;
		Class567.method6839(Class25.aString238,
				    Class5_Sub10.aString10840, "", false,
				    -1438178841);
	    }
	} else {
	    Class573.aString7566
		= ((Class286) class286).aClass39_3149
		      .method807(Class378_Sub2.aClass668_10123, (byte) 102);
	    Class691_Sub17.aString10746 = Class573.aString7566;
	    if (((Class286) Class236.aClass286_2596).aBool3152)
		Class691_Sub17.aString10746
		    = new StringBuilder().append
			  (Class691_Sub17.aString10746).append
			  (" - ").append
			  (((Class286) class286).anInt3147 * -1615773921)
			  .append
			  ("%").toString();
	    Class483.anInt5476 = ((Class286) class286).anInt3147 * -267407701;
	    if (((Class286) Class236.aClass286_2596).aBool3153
		|| ((Class286) class286).aBool3153)
		Class184.aLong2102
		    = Class249.method3417(1990717899) * -5907641532321817611L;
	}
	if (Class293.aClass292_3215 != null) {
	    Class293.aClass292_3215.method3927((Class184.aLong2102
						* 1189001437578426461L),
					       Class573.aString7566,
					       Class691_Sub17.aString10746,
					       712008029 * Class483.anInt5476,
					       Class236.aClass286_2596,
					       1231668792);
	    if (null != Class293.anInterface28Array3214) {
		for (int i_81_ = Class293.anInt3217 * -470891331 + 1;
		     i_81_ < Class293.anInterface28Array3214.length; i_81_++) {
		    if (Class293.anInterface28Array3214[i_81_]
			    .method162(165271658) >= 100
			&& -470891331 * Class293.anInt3217 == i_81_ - 1
			&& client.anInt10876 * 175711435 != 11
			&& Class293.aClass292_3215.method3907(-178203827)) {
			try {
			    Class293.anInterface28Array3214[i_81_]
				.method147(-957274977);
			} catch (Exception exception) {
			    Class293.anInterface28Array3214 = null;
			    break;
			}
			Class293.aClass292_3215.method3908
			    (Class293.anInterface28Array3214[i_81_],
			     -71390289);
			Class293.anInt3217 += 917526165;
			if ((Class293.anInt3217 * -470891331
			     >= Class293.anInterface28Array3214.length - 1)
			    && Class293.anInterface28Array3214.length > 1)
			    Class293.anInt3217
				= (Class528_Sub28_Sub8.aClass76_11468
				       .method1122(-649157058)
				   ? 0 : -1) * 917526165;
		    }
		}
	    }
	}
    }
    
    static Class528_Sub21_Sub14 method2796(Cs2Context cs2Context, int i, int i_82_,
					   byte i_83_) {
	int i_84_ = 374609381 * cs2Context.anInt7535 | i << 10;
	Class528_Sub21_Sub14 class528_sub21_sub14
	    = ((Class528_Sub21_Sub14)
	       Class647.aClass198_8388.method2835((long) i_84_ << 16));
	if (null != class528_sub21_sub14)
	    return class528_sub21_sub14;
	byte[] is = (Class46.aClass446_540.method5395
		     (Class46.aClass446_540.method5351(i_84_, -393468625),
		      -897256869));
	if (is != null) {
	    if (is.length <= 1)
		return null;
	    try {
		class528_sub21_sub14 = Class556.method6758(is, 1369934483);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_84_).toString());
	    }
	    class528_sub21_sub14.aClass561_11626 = cs2Context;
	    Class647.aClass198_8388.method2836(class528_sub21_sub14,
					       (long) i_84_ << 16);
	    return class528_sub21_sub14;
	}
	i_84_ = cs2Context.anInt7535 * 374609381 | 65536 + i_82_ << 10;
	class528_sub21_sub14
	    = ((Class528_Sub21_Sub14)
	       Class647.aClass198_8388.method2835((long) i_84_ << 16));
	if (class528_sub21_sub14 != null)
	    return class528_sub21_sub14;
	is = (Class46.aClass446_540.method5395
	      (Class46.aClass446_540.method5351(i_84_, 466419879),
	       -1967276331));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class528_sub21_sub14 = Class556.method6758(is, 1950889720);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_84_).toString());
	    }
	    class528_sub21_sub14.aClass561_11626 = cs2Context;
	    Class647.aClass198_8388.method2836(class528_sub21_sub14,
					       (long) i_84_ << 16);
	    return class528_sub21_sub14;
	}
	i_84_ = cs2Context.anInt7535 * 374609381 | 0x3fffc00;
	class528_sub21_sub14
	    = ((Class528_Sub21_Sub14)
	       Class647.aClass198_8388.method2835((long) i_84_ << 16));
	if (class528_sub21_sub14 != null)
	    return class528_sub21_sub14;
	is = (Class46.aClass446_540.method5395
	      (Class46.aClass446_540.method5351(i_84_, 1118263341),
	       -1209781219));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class528_sub21_sub14 = Class556.method6758(is, 1015160973);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_84_).toString());
	    }
	    class528_sub21_sub14.aClass561_11626 = cs2Context;
	    Class647.aClass198_8388.method2836(class528_sub21_sub14,
					       (long) i_84_ << 16);
	    return class528_sub21_sub14;
	}
	return null;
    }
    
    static final void method2797(Class648 class648, byte i) {
	int i_85_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_85_, (byte) 80);
	Class226 class226 = Class380.aClass226Array3970[i_85_ >> 16];
	Class160.method2059(class229, class226, false, 1, class648,
			    -1649643344);
    }
    
    static final void method2798(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_86_ = (((Class648) class648).anIntArray8394
		     [717927929 * ((Class648) class648).anInt8395]);
	int i_87_ = (((Class648) class648).anIntArray8394
		     [((Class648) class648).anInt8395 * 717927929 + 1]);
	Class528_Sub39 class528_sub39
	    = (Class528_Sub39) client.aClass692_11097.method8137((long) i_86_);
	if (class528_sub39 != null
	    && i_87_ == class528_sub39.anInt10625 * 905908359)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 1;
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
    }
    
    static final void method2799(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= -1816921966;
	client.anInt11047
	    = -439912949 * (((Class648) class648).anIntArray8394
			    [((Class648) class648).anInt8395 * 717927929]);
	client.anInt11036
	    = (((Class648) class648).anIntArray8394
	       [1 + ((Class648) class648).anInt8395 * 717927929]) * 702071043;
    }
    
    static final void method2800(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub34_10607
		  .method10132((byte) 74);
    }
    
    static final void method2801(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= 1239022665;
	int i_88_ = (((Class648) class648).anIntArray8394
		     [717927929 * ((Class648) class648).anInt8395]);
	Class528_Sub39 class528_sub39
	    = (Class528_Sub39) client.aClass692_11097.method8137((long) i_88_);
	if (class528_sub39 != null
	    && class528_sub39.anInt10626 * 17672073 == 3)
	    Class279.method3735(class528_sub39, true, true, -1023599812);
    }
}
