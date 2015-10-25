/* Class445_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class445_Sub4 extends VarDomainType
{
    @Override
	Object method5332(Class142 class142, int i) {
	if (class142.aClass459_1638 == Class459.aClass459_5248
	    || Class459.aClass459_5136 == class142.aClass459_1638)
	    return Integer.valueOf(-1);
	return class142.aClass459_1638.method5565((byte) 14);
    }
    
    Class445_Sub4(SharedConfigsType sharedConfigsType, int i, boolean bool, boolean bool_0_) {
		super(sharedConfigsType, i, bool, bool_0_);
    }
    
    @Override
	Object method5335(Class142 class142) {
	if (class142.aClass459_1638 == Class459.aClass459_5248
	    || Class459.aClass459_5136 == class142.aClass459_1638)
	    return Integer.valueOf(-1);
	return class142.aClass459_1638.method5565((byte) 36);
    }
    
    static final void method9180(long l) {
	int i = 51753521 * client.anInt10972;
	int i_1_ = 1159024597 * client.anInt10973;
	if (Class494.anInt5533 * -858645029 != i) {
	    int i_2_ = i - -858645029 * Class494.anInt5533;
	    int i_3_ = (int) (l * i_2_ / 320L);
	    if (i_2_ > 0) {
		if (0 == i_3_)
		    i_3_ = 1;
		else if (i_3_ > i_2_)
		    i_3_ = i_2_;
	    } else if (0 == i_3_)
		i_3_ = -1;
	    else if (i_3_ < i_2_)
		i_3_ = i_2_;
	    Class494.anInt5533 += 432445011 * i_3_;
	}
	if (Class622.anInt8116 * 593060725 != i_1_) {
	    int i_4_ = i_1_ - Class622.anInt8116 * 593060725;
	    int i_5_ = (int) (i_4_ * l / 320L);
	    if (i_4_ > 0) {
		if (0 == i_5_)
		    i_5_ = 1;
		else if (i_5_ > i_4_)
		    i_5_ = i_4_;
	    } else if (i_5_ == 0)
		i_5_ = -1;
	    else if (i_5_ < i_4_)
		i_5_ = i_4_;
	    Class622.anInt8116 += i_5_ * -842001187;
	}
	client.aFloat11088 += l * client.aFloat10976 / 40.0F * 8.0F;
	client.aFloat11002 += 8.0F * (client.aFloat11037 * l / 40.0F);
	Class91.method1223((byte) 109);
    }
    
    public static Class698[] method9181(int i) {
	return (new Class698[]
		{ Class698.aClass698_8719, Class698.aClass698_8724,
		  Class698.aClass698_8722, Class698.aClass698_8723,
		  Class698.aClass698_8728, Class698.aClass698_8725,
		  Class698.aClass698_8727, Class698.aClass698_8721,
		  Class698.aClass698_8720 });
    }
    
    static final void method9182(Class648 class648, int i) {
	String string = (String) (class648.anObjectArray8396
				  [(class648.anInt8410
				    -= 1600226731) * -520794877]);
	Class528_Sub34 class528_sub34
	    = Class656.method7845(OutgoingOpcode.aClass403_4564,
				  client.aClass109_11162.aClass10_1379,
				  -2076795692);
	class528_sub34.aClass528_Sub42_Sub2_10481
	    .writeByte(Class14.method627(string, -796542228), (byte) -1);
	class528_sub34.aClass528_Sub42_Sub2_10481.writeString(string,
							     -1936289654);
	client.aClass109_11162.method1380(class528_sub34, 1513233820);
    }
    
    static void method9183(Class648 class648, byte i) {
	class648.anIntArray8394
	    [717927929 * class648.anInt8395 - 1]
	    = ((Class256)
	       Class669.aClass25_Sub1_8522.method63((class648
						     .anIntArray8394
						     [((class648
							.anInt8395) * 717927929
						       - 1)]),
						    -538910623))
		  .method3462(Class570.playerVarsProvider, 1121860220) ? 1 : 0;
    }
}
