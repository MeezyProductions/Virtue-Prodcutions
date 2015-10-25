/* Class193 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Image;
import java.lang.management.GarbageCollectorMXBean;

class Class193 implements Interface55
{
    Class218 this$0;
    public static Image anImage2172;
    static GarbageCollectorMXBean aGarbageCollectorMXBean2173;
    
    public void method351(Object object, float[] fs, Object[] objects, int i) {
	Class469 class469 = (Class469) object;
	Class422 class422 = class469.method5762((short) -30600);
	float f = class469.method5784((short) -15778);
	float f_0_ = class469.method5756(1770494187);
	Class422 class422_1_ = ((Class193) this).this$0.method3085(-433400904);
	Class422 class422_2_ = Class422.method5065(class422, class422_1_);
	float f_3_ = 0.0F;
	int i_4_ = 8192;
	float f_5_ = class422_2_.method5069();
	float f_6_ = 0.0F;
	if (f_5_ >= f_0_)
	    f_3_ = 0.0F;
	else {
	    float f_7_ = ((Float) objects[0]).floatValue();
	    float f_8_ = ((Float) objects[1]).floatValue();
	    if (class422_1_.aFloat4780 > class422.aFloat4780 - f_7_ / 2.0F
		&& class422_1_.aFloat4780 < class422.aFloat4780 + f_7_ / 2.0F
		&& class422_1_.aFloat4777 > class422.aFloat4777 - f_8_ / 2.0F
		&& (class422_1_.aFloat4777
		    < f_8_ / 2.0F + class422.aFloat4777)) {
		float f_9_
		    = Math.abs(class422_1_.aFloat4780 - (class422.aFloat4780
							 + f_7_ / 2.0F));
		float f_10_
		    = Math.abs(class422_1_.aFloat4780 - (class422.aFloat4780
							 - f_7_ / 2.0F));
		float f_11_
		    = Math.abs(class422_1_.aFloat4777 - (class422.aFloat4780
							 + f_8_ / 2.0F));
		float f_12_
		    = Math.abs(class422_1_.aFloat4777 - (class422.aFloat4780
							 - f_8_ / 2.0F));
		float f_13_ = f_0_ - f;
		float f_14_ = Math.min(f_9_, f_10_);
		float f_15_ = Math.min(f_11_, f_12_);
		float f_16_ = 1.0F / f_13_ * f_14_;
		float f_17_ = f_15_ * (1.0F / f_13_);
		f_16_ = Math.min(Math.max(f_16_, 0.0F), 1.0F);
		f_17_ = Math.min(Math.max(f_17_, 0.0F), 1.0F);
		f_3_ = Math.min(f_16_, f_17_);
	    }
	    if (class422_2_.aFloat4780 != 0.0F
		|| class422_2_.aFloat4777 != 0.0F) {
		if (-1860881523 * Class390.anInt4111 == 6) {
		    float f_18_
			= Class495.aClass283_Sub1_5578.method3792(-16777216);
		    if (class422_2_.aFloat4780 != 0.0F
			|| class422_2_.aFloat4777 != 0.0F) {
			int i_19_
			    = (((int) (2607.5945876176133
				       * (double) (f_18_ * -1.0F))
				- (int) (Math.atan2((double) (class422_2_
							      .aFloat4780),
						    (double) (class422_2_
							      .aFloat4777))
					 * 2607.5945876176133)
				- 4096)
			       & 0x3fff);
			if (i_19_ > 8192)
			    i_19_ = 16384 - i_19_;
			int i_20_;
			if (f_5_ <= 0.0F)
			    i_20_ = 8192;
			else if (f_5_ >= 4096.0F)
			    i_20_ = 16384;
			else
			    i_20_ = (int) (8192.0F + f_5_ * 8192.0F / 4096.0F);
			i_4_ = (16384 - i_20_ >> 1) + i_20_ * i_19_ / 8192;
		    }
		    f_6_ = 6.1035156E-5F * (float) i_4_;
		} else {
		    int i_21_
			= (-(Class653.anInt8429 * 869770707)
			   - (int) (Math.atan2((double) class422_2_.aFloat4780,
					       (double) class422_2_.aFloat4777)
				    * 2607.5945876176133)
			   - 4096) & 0x3fff;
		    if (i_21_ > 8192)
			i_21_ = 16384 - i_21_;
		    int i_22_;
		    if (f_5_ <= 0.0F)
			i_22_ = 8192;
		    else if (f_5_ >= 4096.0F)
			i_22_ = 16384;
		    else
			i_22_ = (int) (f_5_ * 8192.0F / 4096.0F + 8192.0F);
		    i_4_ = i_22_ * i_21_ / 8192 + (16384 - i_22_ >> 1);
		    f_6_ = 6.1035156E-5F * (float) i_4_;
		}
	    }
	}
	fs[0] = (float) (i_4_ < 0 ? (double) f_3_
			 : (double) f_3_ * Math.sqrt((double) (1.0F - f_6_)));
	fs[1] = (float) (i_4_ < 0 ? (double) -f_3_
			 : (double) f_3_ * Math.sqrt((double) f_6_));
    }
    
    public void method349(Object object, float[] fs, Object[] objects) {
	Class469 class469 = (Class469) object;
	Class422 class422 = class469.method5762((short) -9609);
	float f = class469.method5784((short) -19396);
	float f_23_ = class469.method5756(1770494187);
	Class422 class422_24_ = ((Class193) this).this$0.method3085(25687113);
	Class422 class422_25_ = Class422.method5065(class422, class422_24_);
	float f_26_ = 0.0F;
	int i = 8192;
	float f_27_ = class422_25_.method5069();
	float f_28_ = 0.0F;
	if (f_27_ >= f_23_)
	    f_26_ = 0.0F;
	else {
	    float f_29_ = ((Float) objects[0]).floatValue();
	    float f_30_ = ((Float) objects[1]).floatValue();
	    if (class422_24_.aFloat4780 > class422.aFloat4780 - f_29_ / 2.0F
		&& class422_24_.aFloat4780 < class422.aFloat4780 + f_29_ / 2.0F
		&& class422_24_.aFloat4777 > class422.aFloat4777 - f_30_ / 2.0F
		&& (class422_24_.aFloat4777
		    < f_30_ / 2.0F + class422.aFloat4777)) {
		float f_31_
		    = Math.abs(class422_24_.aFloat4780 - (class422.aFloat4780
							  + f_29_ / 2.0F));
		float f_32_
		    = Math.abs(class422_24_.aFloat4780 - (class422.aFloat4780
							  - f_29_ / 2.0F));
		float f_33_
		    = Math.abs(class422_24_.aFloat4777 - (class422.aFloat4780
							  + f_30_ / 2.0F));
		float f_34_
		    = Math.abs(class422_24_.aFloat4777 - (class422.aFloat4780
							  - f_30_ / 2.0F));
		float f_35_ = f_23_ - f;
		float f_36_ = Math.min(f_31_, f_32_);
		float f_37_ = Math.min(f_33_, f_34_);
		float f_38_ = 1.0F / f_35_ * f_36_;
		float f_39_ = f_37_ * (1.0F / f_35_);
		f_38_ = Math.min(Math.max(f_38_, 0.0F), 1.0F);
		f_39_ = Math.min(Math.max(f_39_, 0.0F), 1.0F);
		f_26_ = Math.min(f_38_, f_39_);
	    }
	    if (class422_25_.aFloat4780 != 0.0F
		|| class422_25_.aFloat4777 != 0.0F) {
		if (-1860881523 * Class390.anInt4111 == 6) {
		    float f_40_
			= Class495.aClass283_Sub1_5578.method3792(-16777216);
		    if (class422_25_.aFloat4780 != 0.0F
			|| class422_25_.aFloat4777 != 0.0F) {
			int i_41_
			    = (((int) (2607.5945876176133
				       * (double) (f_40_ * -1.0F))
				- (int) (Math.atan2((double) (class422_25_
							      .aFloat4780),
						    (double) (class422_25_
							      .aFloat4777))
					 * 2607.5945876176133)
				- 4096)
			       & 0x3fff);
			if (i_41_ > 8192)
			    i_41_ = 16384 - i_41_;
			int i_42_;
			if (f_27_ <= 0.0F)
			    i_42_ = 8192;
			else if (f_27_ >= 4096.0F)
			    i_42_ = 16384;
			else
			    i_42_
				= (int) (8192.0F + f_27_ * 8192.0F / 4096.0F);
			i = (16384 - i_42_ >> 1) + i_42_ * i_41_ / 8192;
		    }
		    f_28_ = 6.1035156E-5F * (float) i;
		} else {
		    int i_43_ = ((-(Class653.anInt8429 * 869770707)
				  - (int) (Math.atan2((double) (class422_25_
								.aFloat4780),
						      (double) (class422_25_
								.aFloat4777))
					   * 2607.5945876176133)
				  - 4096)
				 & 0x3fff);
		    if (i_43_ > 8192)
			i_43_ = 16384 - i_43_;
		    int i_44_;
		    if (f_27_ <= 0.0F)
			i_44_ = 8192;
		    else if (f_27_ >= 4096.0F)
			i_44_ = 16384;
		    else
			i_44_ = (int) (f_27_ * 8192.0F / 4096.0F + 8192.0F);
		    i = i_44_ * i_43_ / 8192 + (16384 - i_44_ >> 1);
		    f_28_ = 6.1035156E-5F * (float) i;
		}
	    }
	}
	fs[0]
	    = (float) (i < 0 ? (double) f_26_
		       : (double) f_26_ * Math.sqrt((double) (1.0F - f_28_)));
	fs[1] = (float) (i < 0 ? (double) -f_26_
			 : (double) f_26_ * Math.sqrt((double) f_28_));
    }
    
    public void method347(Object object, float[] fs, Object[] objects) {
	Class469 class469 = (Class469) object;
	Class422 class422 = class469.method5762((short) -8170);
	float f = class469.method5784((short) -14439);
	float f_45_ = class469.method5756(1770494187);
	Class422 class422_46_
	    = ((Class193) this).this$0.method3085(1249952635);
	Class422 class422_47_ = Class422.method5065(class422, class422_46_);
	float f_48_ = 0.0F;
	int i = 8192;
	float f_49_ = class422_47_.method5069();
	float f_50_ = 0.0F;
	if (f_49_ >= f_45_)
	    f_48_ = 0.0F;
	else {
	    float f_51_ = ((Float) objects[0]).floatValue();
	    float f_52_ = ((Float) objects[1]).floatValue();
	    if (class422_46_.aFloat4780 > class422.aFloat4780 - f_51_ / 2.0F
		&& class422_46_.aFloat4780 < class422.aFloat4780 + f_51_ / 2.0F
		&& class422_46_.aFloat4777 > class422.aFloat4777 - f_52_ / 2.0F
		&& (class422_46_.aFloat4777
		    < f_52_ / 2.0F + class422.aFloat4777)) {
		float f_53_
		    = Math.abs(class422_46_.aFloat4780 - (class422.aFloat4780
							  + f_51_ / 2.0F));
		float f_54_
		    = Math.abs(class422_46_.aFloat4780 - (class422.aFloat4780
							  - f_51_ / 2.0F));
		float f_55_
		    = Math.abs(class422_46_.aFloat4777 - (class422.aFloat4780
							  + f_52_ / 2.0F));
		float f_56_
		    = Math.abs(class422_46_.aFloat4777 - (class422.aFloat4780
							  - f_52_ / 2.0F));
		float f_57_ = f_45_ - f;
		float f_58_ = Math.min(f_53_, f_54_);
		float f_59_ = Math.min(f_55_, f_56_);
		float f_60_ = 1.0F / f_57_ * f_58_;
		float f_61_ = f_59_ * (1.0F / f_57_);
		f_60_ = Math.min(Math.max(f_60_, 0.0F), 1.0F);
		f_61_ = Math.min(Math.max(f_61_, 0.0F), 1.0F);
		f_48_ = Math.min(f_60_, f_61_);
	    }
	    if (class422_47_.aFloat4780 != 0.0F
		|| class422_47_.aFloat4777 != 0.0F) {
		if (-1860881523 * Class390.anInt4111 == 6) {
		    float f_62_
			= Class495.aClass283_Sub1_5578.method3792(-16777216);
		    if (class422_47_.aFloat4780 != 0.0F
			|| class422_47_.aFloat4777 != 0.0F) {
			int i_63_
			    = (((int) (2607.5945876176133
				       * (double) (f_62_ * -1.0F))
				- (int) (Math.atan2((double) (class422_47_
							      .aFloat4780),
						    (double) (class422_47_
							      .aFloat4777))
					 * 2607.5945876176133)
				- 4096)
			       & 0x3fff);
			if (i_63_ > 8192)
			    i_63_ = 16384 - i_63_;
			int i_64_;
			if (f_49_ <= 0.0F)
			    i_64_ = 8192;
			else if (f_49_ >= 4096.0F)
			    i_64_ = 16384;
			else
			    i_64_
				= (int) (8192.0F + f_49_ * 8192.0F / 4096.0F);
			i = (16384 - i_64_ >> 1) + i_64_ * i_63_ / 8192;
		    }
		    f_50_ = 6.1035156E-5F * (float) i;
		} else {
		    int i_65_ = ((-(Class653.anInt8429 * 869770707)
				  - (int) (Math.atan2((double) (class422_47_
								.aFloat4780),
						      (double) (class422_47_
								.aFloat4777))
					   * 2607.5945876176133)
				  - 4096)
				 & 0x3fff);
		    if (i_65_ > 8192)
			i_65_ = 16384 - i_65_;
		    int i_66_;
		    if (f_49_ <= 0.0F)
			i_66_ = 8192;
		    else if (f_49_ >= 4096.0F)
			i_66_ = 16384;
		    else
			i_66_ = (int) (f_49_ * 8192.0F / 4096.0F + 8192.0F);
		    i = i_66_ * i_65_ / 8192 + (16384 - i_66_ >> 1);
		    f_50_ = 6.1035156E-5F * (float) i;
		}
	    }
	}
	fs[0]
	    = (float) (i < 0 ? (double) f_48_
		       : (double) f_48_ * Math.sqrt((double) (1.0F - f_50_)));
	fs[1] = (float) (i < 0 ? (double) -f_48_
			 : (double) f_48_ * Math.sqrt((double) f_50_));
    }
    
    public void method348(Object object, float[] fs, Object[] objects) {
	Class469 class469 = (Class469) object;
	Class422 class422 = class469.method5762((short) -6087);
	float f = class469.method5784((short) -3414);
	float f_67_ = class469.method5756(1770494187);
	Class422 class422_68_
	    = ((Class193) this).this$0.method3085(-2135560027);
	Class422 class422_69_ = Class422.method5065(class422, class422_68_);
	float f_70_ = 0.0F;
	int i = 8192;
	float f_71_ = class422_69_.method5069();
	float f_72_ = 0.0F;
	if (f_71_ >= f_67_)
	    f_70_ = 0.0F;
	else {
	    float f_73_ = ((Float) objects[0]).floatValue();
	    float f_74_ = ((Float) objects[1]).floatValue();
	    if (class422_68_.aFloat4780 > class422.aFloat4780 - f_73_ / 2.0F
		&& class422_68_.aFloat4780 < class422.aFloat4780 + f_73_ / 2.0F
		&& class422_68_.aFloat4777 > class422.aFloat4777 - f_74_ / 2.0F
		&& (class422_68_.aFloat4777
		    < f_74_ / 2.0F + class422.aFloat4777)) {
		float f_75_
		    = Math.abs(class422_68_.aFloat4780 - (class422.aFloat4780
							  + f_73_ / 2.0F));
		float f_76_
		    = Math.abs(class422_68_.aFloat4780 - (class422.aFloat4780
							  - f_73_ / 2.0F));
		float f_77_
		    = Math.abs(class422_68_.aFloat4777 - (class422.aFloat4780
							  + f_74_ / 2.0F));
		float f_78_
		    = Math.abs(class422_68_.aFloat4777 - (class422.aFloat4780
							  - f_74_ / 2.0F));
		float f_79_ = f_67_ - f;
		float f_80_ = Math.min(f_75_, f_76_);
		float f_81_ = Math.min(f_77_, f_78_);
		float f_82_ = 1.0F / f_79_ * f_80_;
		float f_83_ = f_81_ * (1.0F / f_79_);
		f_82_ = Math.min(Math.max(f_82_, 0.0F), 1.0F);
		f_83_ = Math.min(Math.max(f_83_, 0.0F), 1.0F);
		f_70_ = Math.min(f_82_, f_83_);
	    }
	    if (class422_69_.aFloat4780 != 0.0F
		|| class422_69_.aFloat4777 != 0.0F) {
		if (-1860881523 * Class390.anInt4111 == 6) {
		    float f_84_
			= Class495.aClass283_Sub1_5578.method3792(-16777216);
		    if (class422_69_.aFloat4780 != 0.0F
			|| class422_69_.aFloat4777 != 0.0F) {
			int i_85_
			    = (((int) (2607.5945876176133
				       * (double) (f_84_ * -1.0F))
				- (int) (Math.atan2((double) (class422_69_
							      .aFloat4780),
						    (double) (class422_69_
							      .aFloat4777))
					 * 2607.5945876176133)
				- 4096)
			       & 0x3fff);
			if (i_85_ > 8192)
			    i_85_ = 16384 - i_85_;
			int i_86_;
			if (f_71_ <= 0.0F)
			    i_86_ = 8192;
			else if (f_71_ >= 4096.0F)
			    i_86_ = 16384;
			else
			    i_86_
				= (int) (8192.0F + f_71_ * 8192.0F / 4096.0F);
			i = (16384 - i_86_ >> 1) + i_86_ * i_85_ / 8192;
		    }
		    f_72_ = 6.1035156E-5F * (float) i;
		} else {
		    int i_87_ = ((-(Class653.anInt8429 * 869770707)
				  - (int) (Math.atan2((double) (class422_69_
								.aFloat4780),
						      (double) (class422_69_
								.aFloat4777))
					   * 2607.5945876176133)
				  - 4096)
				 & 0x3fff);
		    if (i_87_ > 8192)
			i_87_ = 16384 - i_87_;
		    int i_88_;
		    if (f_71_ <= 0.0F)
			i_88_ = 8192;
		    else if (f_71_ >= 4096.0F)
			i_88_ = 16384;
		    else
			i_88_ = (int) (f_71_ * 8192.0F / 4096.0F + 8192.0F);
		    i = i_88_ * i_87_ / 8192 + (16384 - i_88_ >> 1);
		    f_72_ = 6.1035156E-5F * (float) i;
		}
	    }
	}
	fs[0]
	    = (float) (i < 0 ? (double) f_70_
		       : (double) f_70_ * Math.sqrt((double) (1.0F - f_72_)));
	fs[1] = (float) (i < 0 ? (double) -f_70_
			 : (double) f_70_ * Math.sqrt((double) f_72_));
    }
    
    Class193(Class218 class218) {
	((Class193) this).this$0 = class218;
    }
    
    public void method350(Object object, float[] fs, Object[] objects) {
	Class469 class469 = (Class469) object;
	Class422 class422 = class469.method5762((short) -9287);
	float f = class469.method5784((short) -11676);
	float f_89_ = class469.method5756(1770494187);
	Class422 class422_90_ = ((Class193) this).this$0.method3085(558053668);
	Class422 class422_91_ = Class422.method5065(class422, class422_90_);
	float f_92_ = 0.0F;
	int i = 8192;
	float f_93_ = class422_91_.method5069();
	float f_94_ = 0.0F;
	if (f_93_ >= f_89_)
	    f_92_ = 0.0F;
	else {
	    float f_95_ = ((Float) objects[0]).floatValue();
	    float f_96_ = ((Float) objects[1]).floatValue();
	    if (class422_90_.aFloat4780 > class422.aFloat4780 - f_95_ / 2.0F
		&& class422_90_.aFloat4780 < class422.aFloat4780 + f_95_ / 2.0F
		&& class422_90_.aFloat4777 > class422.aFloat4777 - f_96_ / 2.0F
		&& (class422_90_.aFloat4777
		    < f_96_ / 2.0F + class422.aFloat4777)) {
		float f_97_
		    = Math.abs(class422_90_.aFloat4780 - (class422.aFloat4780
							  + f_95_ / 2.0F));
		float f_98_
		    = Math.abs(class422_90_.aFloat4780 - (class422.aFloat4780
							  - f_95_ / 2.0F));
		float f_99_
		    = Math.abs(class422_90_.aFloat4777 - (class422.aFloat4780
							  + f_96_ / 2.0F));
		float f_100_
		    = Math.abs(class422_90_.aFloat4777 - (class422.aFloat4780
							  - f_96_ / 2.0F));
		float f_101_ = f_89_ - f;
		float f_102_ = Math.min(f_97_, f_98_);
		float f_103_ = Math.min(f_99_, f_100_);
		float f_104_ = 1.0F / f_101_ * f_102_;
		float f_105_ = f_103_ * (1.0F / f_101_);
		f_104_ = Math.min(Math.max(f_104_, 0.0F), 1.0F);
		f_105_ = Math.min(Math.max(f_105_, 0.0F), 1.0F);
		f_92_ = Math.min(f_104_, f_105_);
	    }
	    if (class422_91_.aFloat4780 != 0.0F
		|| class422_91_.aFloat4777 != 0.0F) {
		if (-1860881523 * Class390.anInt4111 == 6) {
		    float f_106_
			= Class495.aClass283_Sub1_5578.method3792(-16777216);
		    if (class422_91_.aFloat4780 != 0.0F
			|| class422_91_.aFloat4777 != 0.0F) {
			int i_107_
			    = (((int) (2607.5945876176133
				       * (double) (f_106_ * -1.0F))
				- (int) (Math.atan2((double) (class422_91_
							      .aFloat4780),
						    (double) (class422_91_
							      .aFloat4777))
					 * 2607.5945876176133)
				- 4096)
			       & 0x3fff);
			if (i_107_ > 8192)
			    i_107_ = 16384 - i_107_;
			int i_108_;
			if (f_93_ <= 0.0F)
			    i_108_ = 8192;
			else if (f_93_ >= 4096.0F)
			    i_108_ = 16384;
			else
			    i_108_
				= (int) (8192.0F + f_93_ * 8192.0F / 4096.0F);
			i = (16384 - i_108_ >> 1) + i_108_ * i_107_ / 8192;
		    }
		    f_94_ = 6.1035156E-5F * (float) i;
		} else {
		    int i_109_ = ((-(Class653.anInt8429 * 869770707)
				   - (int) (Math.atan2((double) (class422_91_
								 .aFloat4780),
						       (double) (class422_91_
								 .aFloat4777))
					    * 2607.5945876176133)
				   - 4096)
				  & 0x3fff);
		    if (i_109_ > 8192)
			i_109_ = 16384 - i_109_;
		    int i_110_;
		    if (f_93_ <= 0.0F)
			i_110_ = 8192;
		    else if (f_93_ >= 4096.0F)
			i_110_ = 16384;
		    else
			i_110_ = (int) (f_93_ * 8192.0F / 4096.0F + 8192.0F);
		    i = i_110_ * i_109_ / 8192 + (16384 - i_110_ >> 1);
		    f_94_ = 6.1035156E-5F * (float) i;
		}
	    }
	}
	fs[0]
	    = (float) (i < 0 ? (double) f_92_
		       : (double) f_92_ * Math.sqrt((double) (1.0F - f_94_)));
	fs[1] = (float) (i < 0 ? (double) -f_92_
			 : (double) f_92_ * Math.sqrt((double) f_94_));
    }
    
    static final void method2802(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 0;
    }
    
    static final void method2803(Class648 class648, byte i) {
	Class365.aClass218_3848.method3111(-1181462335);
    }
    
    static final void method2804(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	class229.aString2473
	    = (String) (((Class648) class648).anObjectArray8396
			[((((Class648) class648).anInt8410 -= 1600226731)
			  * -520794877)]);
    }
}
