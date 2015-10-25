/* Class189 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class189 implements Interface55 {
	Class218 this$0;

	@Override
	public void method350(Object object, float[] fs, Object[] objects) {
		Class469 class469 = (Class469) object;
		Class422 class422 = class469.method5762((short) -30504);
		float f = class469.method5784((short) -9675);
		float f_0_ = class469.method5756(1770494187);
		Class422 class422_1_ = Class422.method5065(class422, this.this$0.method3085(-596850722));
		float f_2_ = 0.0F;
		float f_3_ = class422_1_.method5069();
		if (f_3_ >= f_0_)
			f_2_ = 0.0F;
		if (f_3_ <= f)
			f_2_ = 1.0F;
		else {
			float f_4_ = 1.0F - (f_3_ - f) * (1.0F / (f_0_ - f));
			if (f_4_ < 0.0 || f_4_ > 1.0)
				f_4_ = Math.min(Math.max(f_4_, 0.0F), 1.0F);
			f_2_ = f_4_;
		}
		int i = 8192;
		float f_5_ = 0.0F;
		if (6 == Class390.anInt4111 * -1860881523) {
			float f_6_ = Class495.aClass283_Sub1_5578.method3792(-16777216);
			if (class422_1_.aFloat4780 != 0.0F || class422_1_.aFloat4777 != 0.0F) {
				int i_7_ = (((int) (2607.5945876176133 * (-1.0F * f_6_))
						- (int) (Math.atan2(class422_1_.aFloat4780, class422_1_.aFloat4777) * 2607.5945876176133)
						- 4096) & 0x3fff);
				if (i_7_ > 8192)
					i_7_ = 16384 - i_7_;
				int i_8_;
				if (f_3_ <= 0.0F)
					i_8_ = 8192;
				else if (f_3_ >= 4096.0F)
					i_8_ = 16384;
				else
					i_8_ = (int) (f_3_ * 8192.0F / 4096.0F + 8192.0F);
				i = i_7_ * i_8_ / 8192 + (16384 - i_8_ >> 1);
			}
			f_5_ = 6.1035156E-5F * i;
		} else {
			if (class422_1_.aFloat4780 != 0.0F || 0.0F != class422_1_.aFloat4777) {
				int i_9_ = ((-(869770707 * Class653.anInt8429)
						- (int) (Math.atan2(class422_1_.aFloat4780, class422_1_.aFloat4777) * 2607.5945876176133)
						- 4096) & 0x3fff);
				if (i_9_ > 8192)
					i_9_ = 16384 - i_9_;
				int i_10_;
				if (f_3_ <= 0.0F)
					i_10_ = 8192;
				else if (f_3_ >= 4096.0F)
					i_10_ = 16384;
				else
					i_10_ = (int) (8192.0F + 8192.0F * f_3_ / 4096.0F);
				i = i_10_ * i_9_ / 8192 + (16384 - i_10_ >> 1);
			}
			f_5_ = i * 6.1035156E-5F;
		}
		fs[0] = (float) (i < 0 ? (double) f_2_ : (f_2_ * Math.sqrt(2.0F * (1.0F - f_5_))));
		fs[1] = (float) (i < 0 ? (double) -f_2_ : f_2_ * Math.sqrt(f_5_ * 2.0F));
	}

	@Override
	public void method351(Object object, float[] fs, Object[] objects, int i) {
		Class469 class469 = (Class469) object;
		Class422 class422 = class469.method5762((short) -27630);
		float f = class469.method5784((short) -29958);
		float f_11_ = class469.method5756(1770494187);
		Class422 class422_12_ = Class422.method5065(class422, this.this$0.method3085(1019128012));
		float f_13_ = 0.0F;
		float f_14_ = class422_12_.method5069();
		if (f_14_ >= f_11_)
			f_13_ = 0.0F;
		if (f_14_ <= f)
			f_13_ = 1.0F;
		else {
			float f_15_ = 1.0F - (f_14_ - f) * (1.0F / (f_11_ - f));
			if (f_15_ < 0.0 || f_15_ > 1.0)
				f_15_ = Math.min(Math.max(f_15_, 0.0F), 1.0F);
			f_13_ = f_15_;
		}
		int i_16_ = 8192;
		float f_17_ = 0.0F;
		if (6 == Class390.anInt4111 * -1860881523) {
			float f_18_ = Class495.aClass283_Sub1_5578.method3792(-16777216);
			if (class422_12_.aFloat4780 != 0.0F || class422_12_.aFloat4777 != 0.0F) {
				int i_19_ = (((int) (2607.5945876176133 * (-1.0F * f_18_))
						- (int) (Math.atan2(class422_12_.aFloat4780, class422_12_.aFloat4777) * 2607.5945876176133)
						- 4096) & 0x3fff);
				if (i_19_ > 8192)
					i_19_ = 16384 - i_19_;
				int i_20_;
				if (f_14_ <= 0.0F)
					i_20_ = 8192;
				else if (f_14_ >= 4096.0F)
					i_20_ = 16384;
				else
					i_20_ = (int) (f_14_ * 8192.0F / 4096.0F + 8192.0F);
				i_16_ = i_19_ * i_20_ / 8192 + (16384 - i_20_ >> 1);
			}
			f_17_ = 6.1035156E-5F * i_16_;
		} else {
			if (class422_12_.aFloat4780 != 0.0F || 0.0F != class422_12_.aFloat4777) {
				int i_21_ = ((-(869770707 * Class653.anInt8429)
						- (int) (Math.atan2(class422_12_.aFloat4780, class422_12_.aFloat4777) * 2607.5945876176133)
						- 4096) & 0x3fff);
				if (i_21_ > 8192)
					i_21_ = 16384 - i_21_;
				int i_22_;
				if (f_14_ <= 0.0F)
					i_22_ = 8192;
				else if (f_14_ >= 4096.0F)
					i_22_ = 16384;
				else
					i_22_ = (int) (8192.0F + 8192.0F * f_14_ / 4096.0F);
				i_16_ = i_22_ * i_21_ / 8192 + (16384 - i_22_ >> 1);
			}
			f_17_ = i_16_ * 6.1035156E-5F;
		}
		fs[0] = (float) (i_16_ < 0 ? (double) f_13_ : (f_13_ * Math.sqrt(2.0F * (1.0F - f_17_))));
		fs[1] = (float) (i_16_ < 0 ? (double) -f_13_ : f_13_ * Math.sqrt(f_17_ * 2.0F));
	}

	@Override
	public void method348(Object object, float[] fs, Object[] objects) {
		Class469 class469 = (Class469) object;
		Class422 class422 = class469.method5762((short) -3095);
		float f = class469.method5784((short) -14364);
		float f_23_ = class469.method5756(1770494187);
		Class422 class422_24_ = Class422.method5065(class422, this.this$0.method3085(-726769873));
		float f_25_ = 0.0F;
		float f_26_ = class422_24_.method5069();
		if (f_26_ >= f_23_)
			f_25_ = 0.0F;
		if (f_26_ <= f)
			f_25_ = 1.0F;
		else {
			float f_27_ = 1.0F - (f_26_ - f) * (1.0F / (f_23_ - f));
			if (f_27_ < 0.0 || f_27_ > 1.0)
				f_27_ = Math.min(Math.max(f_27_, 0.0F), 1.0F);
			f_25_ = f_27_;
		}
		int i = 8192;
		float f_28_ = 0.0F;
		if (6 == Class390.anInt4111 * -1860881523) {
			float f_29_ = Class495.aClass283_Sub1_5578.method3792(-16777216);
			if (class422_24_.aFloat4780 != 0.0F || class422_24_.aFloat4777 != 0.0F) {
				int i_30_ = (((int) (2607.5945876176133 * (-1.0F * f_29_))
						- (int) (Math.atan2(class422_24_.aFloat4780, class422_24_.aFloat4777) * 2607.5945876176133)
						- 4096) & 0x3fff);
				if (i_30_ > 8192)
					i_30_ = 16384 - i_30_;
				int i_31_;
				if (f_26_ <= 0.0F)
					i_31_ = 8192;
				else if (f_26_ >= 4096.0F)
					i_31_ = 16384;
				else
					i_31_ = (int) (f_26_ * 8192.0F / 4096.0F + 8192.0F);
				i = i_30_ * i_31_ / 8192 + (16384 - i_31_ >> 1);
			}
			f_28_ = 6.1035156E-5F * i;
		} else {
			if (class422_24_.aFloat4780 != 0.0F || 0.0F != class422_24_.aFloat4777) {
				int i_32_ = ((-(869770707 * Class653.anInt8429)
						- (int) (Math.atan2(class422_24_.aFloat4780, class422_24_.aFloat4777) * 2607.5945876176133)
						- 4096) & 0x3fff);
				if (i_32_ > 8192)
					i_32_ = 16384 - i_32_;
				int i_33_;
				if (f_26_ <= 0.0F)
					i_33_ = 8192;
				else if (f_26_ >= 4096.0F)
					i_33_ = 16384;
				else
					i_33_ = (int) (8192.0F + 8192.0F * f_26_ / 4096.0F);
				i = i_33_ * i_32_ / 8192 + (16384 - i_33_ >> 1);
			}
			f_28_ = i * 6.1035156E-5F;
		}
		fs[0] = (float) (i < 0 ? (double) f_25_ : (f_25_ * Math.sqrt(2.0F * (1.0F - f_28_))));
		fs[1] = (float) (i < 0 ? (double) -f_25_ : f_25_ * Math.sqrt(f_28_ * 2.0F));
	}

	@Override
	public void method349(Object object, float[] fs, Object[] objects) {
		Class469 class469 = (Class469) object;
		Class422 class422 = class469.method5762((short) -10709);
		float f = class469.method5784((short) -29247);
		float f_34_ = class469.method5756(1770494187);
		Class422 class422_35_ = Class422.method5065(class422, this.this$0.method3085(-2129141908));
		float f_36_ = 0.0F;
		float f_37_ = class422_35_.method5069();
		if (f_37_ >= f_34_)
			f_36_ = 0.0F;
		if (f_37_ <= f)
			f_36_ = 1.0F;
		else {
			float f_38_ = 1.0F - (f_37_ - f) * (1.0F / (f_34_ - f));
			if (f_38_ < 0.0 || f_38_ > 1.0)
				f_38_ = Math.min(Math.max(f_38_, 0.0F), 1.0F);
			f_36_ = f_38_;
		}
		int i = 8192;
		float f_39_ = 0.0F;
		if (6 == Class390.anInt4111 * -1860881523) {
			float f_40_ = Class495.aClass283_Sub1_5578.method3792(-16777216);
			if (class422_35_.aFloat4780 != 0.0F || class422_35_.aFloat4777 != 0.0F) {
				int i_41_ = (((int) (2607.5945876176133 * (-1.0F * f_40_))
						- (int) (Math.atan2(class422_35_.aFloat4780, class422_35_.aFloat4777) * 2607.5945876176133)
						- 4096) & 0x3fff);
				if (i_41_ > 8192)
					i_41_ = 16384 - i_41_;
				int i_42_;
				if (f_37_ <= 0.0F)
					i_42_ = 8192;
				else if (f_37_ >= 4096.0F)
					i_42_ = 16384;
				else
					i_42_ = (int) (f_37_ * 8192.0F / 4096.0F + 8192.0F);
				i = i_41_ * i_42_ / 8192 + (16384 - i_42_ >> 1);
			}
			f_39_ = 6.1035156E-5F * i;
		} else {
			if (class422_35_.aFloat4780 != 0.0F || 0.0F != class422_35_.aFloat4777) {
				int i_43_ = ((-(869770707 * Class653.anInt8429)
						- (int) (Math.atan2(class422_35_.aFloat4780, class422_35_.aFloat4777) * 2607.5945876176133)
						- 4096) & 0x3fff);
				if (i_43_ > 8192)
					i_43_ = 16384 - i_43_;
				int i_44_;
				if (f_37_ <= 0.0F)
					i_44_ = 8192;
				else if (f_37_ >= 4096.0F)
					i_44_ = 16384;
				else
					i_44_ = (int) (8192.0F + 8192.0F * f_37_ / 4096.0F);
				i = i_44_ * i_43_ / 8192 + (16384 - i_44_ >> 1);
			}
			f_39_ = i * 6.1035156E-5F;
		}
		fs[0] = (float) (i < 0 ? (double) f_36_ : (f_36_ * Math.sqrt(2.0F * (1.0F - f_39_))));
		fs[1] = (float) (i < 0 ? (double) -f_36_ : f_36_ * Math.sqrt(f_39_ * 2.0F));
	}

	@Override
	public void method347(Object object, float[] fs, Object[] objects) {
		Class469 class469 = (Class469) object;
		Class422 class422 = class469.method5762((short) -15354);
		float f = class469.method5784((short) -32116);
		float f_45_ = class469.method5756(1770494187);
		Class422 class422_46_ = Class422.method5065(class422, this.this$0.method3085(-153466150));
		float f_47_ = 0.0F;
		float f_48_ = class422_46_.method5069();
		if (f_48_ >= f_45_)
			f_47_ = 0.0F;
		if (f_48_ <= f)
			f_47_ = 1.0F;
		else {
			float f_49_ = 1.0F - (f_48_ - f) * (1.0F / (f_45_ - f));
			if (f_49_ < 0.0 || f_49_ > 1.0)
				f_49_ = Math.min(Math.max(f_49_, 0.0F), 1.0F);
			f_47_ = f_49_;
		}
		int i = 8192;
		float f_50_ = 0.0F;
		if (6 == Class390.anInt4111 * -1860881523) {
			float f_51_ = Class495.aClass283_Sub1_5578.method3792(-16777216);
			if (class422_46_.aFloat4780 != 0.0F || class422_46_.aFloat4777 != 0.0F) {
				int i_52_ = (((int) (2607.5945876176133 * (-1.0F * f_51_))
						- (int) (Math.atan2(class422_46_.aFloat4780, class422_46_.aFloat4777) * 2607.5945876176133)
						- 4096) & 0x3fff);
				if (i_52_ > 8192)
					i_52_ = 16384 - i_52_;
				int i_53_;
				if (f_48_ <= 0.0F)
					i_53_ = 8192;
				else if (f_48_ >= 4096.0F)
					i_53_ = 16384;
				else
					i_53_ = (int) (f_48_ * 8192.0F / 4096.0F + 8192.0F);
				i = i_52_ * i_53_ / 8192 + (16384 - i_53_ >> 1);
			}
			f_50_ = 6.1035156E-5F * i;
		} else {
			if (class422_46_.aFloat4780 != 0.0F || 0.0F != class422_46_.aFloat4777) {
				int i_54_ = ((-(869770707 * Class653.anInt8429)
						- (int) (Math.atan2(class422_46_.aFloat4780, class422_46_.aFloat4777) * 2607.5945876176133)
						- 4096) & 0x3fff);
				if (i_54_ > 8192)
					i_54_ = 16384 - i_54_;
				int i_55_;
				if (f_48_ <= 0.0F)
					i_55_ = 8192;
				else if (f_48_ >= 4096.0F)
					i_55_ = 16384;
				else
					i_55_ = (int) (8192.0F + 8192.0F * f_48_ / 4096.0F);
				i = i_55_ * i_54_ / 8192 + (16384 - i_55_ >> 1);
			}
			f_50_ = i * 6.1035156E-5F;
		}
		fs[0] = (float) (i < 0 ? (double) f_47_ : (f_47_ * Math.sqrt(2.0F * (1.0F - f_50_))));
		fs[1] = (float) (i < 0 ? (double) -f_47_ : f_47_ * Math.sqrt(f_50_ * 2.0F));
	}

	Class189(Class218 class218) {
		this.this$0 = class218;
	}

	public static void method2765(Class622 class622, int i) {
		WeakReference_Sub1.anInt11751 = class622.anInt8070 * 1365305337;
		Class276.anInt3041 = class622.anInt8105 * -1931005771;
		Class27.anInt252 = 1247259343 * class622.anInt8106;
		Class656.anInt8434 = class622.anInt8084 * -495925647;
		Class681.anInt8594 = class622.anInt8108 * 1287866751;
		Class511_Sub3.anInt10266 = class622.anInt8109 * -419542141;
		Class27.anInt251 = class622.anInt8110 * 424396347;
		Class56_Sub1.anInt10850 = 970029813 * class622.anInt8073;
		Class261.anInt2853 = class622.anInt8112 * 1593252197;
		Class168.anInt1931 = class622.anInt8113 * 380826591;
		Class667.anInt8489 = class622.anInt8096 * -1816235399;
		Class27.anInt254 = class622.anInt8085 * -1403875095;
	}

	static final void method2766(Class648 class648, int i) {
		class648.anIntArray8394[(class648.anInt8395 += 1239022665) * 717927929
				- 1] = (class648.anIntArray8414[-630179809 * class648.anInt8390]);
	}

	static final void method2767(Class648 class648, byte i) {
		class648.anInt8399 -= 232005975;
	}

	static final void method2768(Class648 class648, int i) {
		Class646 class646 = (class648.aBool8418 ? class648.aClass646_8406 : class648.aClass646_8392);
		Class229 class229 = class646.aClass229_8385;
		Class226 class226 = class646.aClass226_8384;
		Class528_Sub20.method9427(class229, class226, class648, -1457638363);
	}

	static final void method2769(Class648 class648, int i) {
		class648.anIntArray8394[(class648.anInt8395 += 1239022665) * 717927929 - 1] = Class95_Sub1_Sub2.aClass537_11200
				.method6504((byte) 4);
	}

	static final void method2770(Class648 class648, int i) {
		class648.anInt8395 -= -1816921966;
		int i_56_ = (class648.anIntArray8394[class648.anInt8395 * 717927929]);
		int i_57_ = (class648.anIntArray8394[1 + 717927929 * class648.anInt8395]);
		class648.anIntArray8394[(class648.anInt8395 += 1239022665) * 717927929 - 1] = i_56_ & i_57_;
	}

	public static String method2771(CharSequence charsequence, int i) {
		String string = Class48.method882(Class351.method4571(charsequence, 16711935));
		if (null == string)
			string = "";
		return string;
	}

	static final void decodeMaskUpdates(BitBuffer buf, int i) {
		for (int i_58_ = 0; i_58_ < GPI.maskCount * -2062664929; i_58_++) {
			buf.readUnsignedShort(-718027409);
			int index = GPI.anIntArray1206[i_58_];
			Player player = client.localPlayers[index];
			int masks = buf.readUnsignedByte((byte) 28);
			if (0 != (masks & 0x40))
				masks += buf.readUnsignedByte((byte) 17) << 8;
			if (0 != (masks & 0x4000))
				masks += buf.readUnsignedByte((byte) 54) << 16;
			Class619.decodeMasks(buf, index, player, masks, 1360934071);
		}
	}

	static int method2773(IMultiVarValueReader iMultiVarValueReader, Interface12 interface12, int i) {
		int i_61_ = 0;
		for (int i_62_ = 0; i_62_ < interface12.method62((short) 3553); i_62_++) {
			Class256 class256 = (Class256) interface12.method63(i_62_, -2023621345);
			if (class256.method3457(iMultiVarValueReader, -1962948244))
				i_61_ += 755479195 * class256.anInt2814;
		}
		return i_61_;
	}
}
