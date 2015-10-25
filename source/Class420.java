/* Class420 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class420 implements Interface7
{
    Class446 aClass446_4772;
    String aString4773;
    
    public Class36 method56(int i) {
	return Class36.aClass36_333;
    }
    
    Class420(Class446 class446, String string) {
	((Class420) this).aClass446_4772 = class446;
	((Class420) this).aString4773 = string;
    }
    
    public int method54() {
	if (((Class420) this).aClass446_4772
		.method5383(((Class420) this).aString4773, -660595961))
	    return 100;
	return 0;
    }
    
    public int method48(int i) {
	if (((Class420) this).aClass446_4772
		.method5383(((Class420) this).aString4773, -660595961))
	    return 100;
	return 0;
    }
    
    public Class36 method55() {
	return Class36.aClass36_333;
    }
    
    public Class36 method53() {
	return Class36.aClass36_333;
    }
    
    static Class58_Sub1 method5036(byte i) {
	Class58_Sub1 class58_sub1 = new Class58_Sub1();
	boolean bool = false;
	boolean bool_0_ = false;
	boolean bool_1_ = false;
	if (Class312.aString3440.startsWith("win")) {
	    bool_0_ = true;
	    bool = true;
	    bool_1_ = true;
	} else {
	    bool = true;
	    bool_1_ = true;
	}
	if (Class97.aBool1238) {
	    class58_sub1.method9760(16, 1446039687);
	    bool = false;
	}
	if (Class97.aBool1237) {
	    class58_sub1.method9760(32, 1446039687);
	    bool_0_ = false;
	}
	if (Class97.aBool1230) {
	    class58_sub1.method9760(16384, 1446039687);
	    bool_1_ = false;
	}
	if (!bool && !bool_0_) {
	    Class172_Sub3.method8881(class58_sub1, -716352144);
	    return class58_sub1;
	}
	int i_2_ = -1;
	int i_3_ = -1;
	int i_4_ = -1;
	if (bool_0_) {
	    try {
		Class514.aClass528_Sub38_6967.method9556
		    (Class514.aClass528_Sub38_6967.aClass691_Sub33_10560, 3,
		     1206296891);
		Class243.method3387(2137407999);
		i_3_ = Class320.method4203(3, 1000, -1330942275);
		if (Class514.aClass528_Sub38_6967.aClass691_Sub24_10594
			.method10014(-1824619963)
		    == 3) {
		    class58_sub1.method9760(4, 1446039687);
		    Class152 class152 = Class587.aClass173_7714.method2528();
		    long l = (-888169491940115569L * class152.aLong1719
			      & 0xffffffffffffL);
		    switch (-1997001775 * class152.anInt1714) {
		    case 4318: {
			boolean bool_5_ = l >= 64425238954L;
			bool &= bool_5_;
			if (!bool_5_)
			    class58_sub1.method9760(256, 1446039687);
			break;
		    }
		    case 4098: {
			boolean bool_6_ = l >= 60129613779L;
			bool &= bool_6_;
			if (!bool_6_)
			    class58_sub1.method9760(512, 1446039687);
			break;
		    }
		    }
		}
	    } catch (Exception exception) {
		class58_sub1.method9760(4096, 1446039687);
	    }
	}
	if (bool_1_) {
	    try {
		Class514.aClass528_Sub38_6967.method9556
		    (Class514.aClass528_Sub38_6967.aClass691_Sub33_10560, 5,
		     1551332845);
		Class243.method3387(2141896257);
		i_4_ = Class320.method4203(5, 1000, -669283250);
		if (Class514.aClass528_Sub38_6967.aClass691_Sub24_10594
			.method10014(-1824619963)
		    == 5)
		    class58_sub1.method9760(8192, 1446039687);
	    } catch (Exception exception) {
		class58_sub1.method9760(32768, 1446039687);
	    }
	}
	if (bool) {
	    try {
		Class514.aClass528_Sub38_6967.method9556
		    (Class514.aClass528_Sub38_6967.aClass691_Sub33_10560, 4,
		     421773255);
		Class243.method3387(2137172333);
		i_2_ = Class320.method4203(1, 1000, -1548136979);
		if (Class514.aClass528_Sub38_6967.aClass691_Sub24_10594
			.method10014(-1824619963)
		    == 1)
		    class58_sub1.method9760(2, 1446039687);
	    } catch (Exception exception) {
		class58_sub1.method9760(2048, 1446039687);
	    }
	}
	Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967
						  .aClass691_Sub33_10560),
						 0, 1856079166);
	if (i_2_ == -1 && -1 == i_3_) {
	    Class172_Sub3.method8881(class58_sub1, -716352144);
	    return class58_sub1;
	}
	class58_sub1.method9758(3, i_3_, 1358941354);
	class58_sub1.method9758(1, i_2_, 1258183133);
	class58_sub1.method9758(5, i_4_, 753608208);
	i_3_ *= 1.3F;
	if (i_3_ > 100000 && i_2_ > 100000 || i_3_ > i_2_)
	    Class568.method6845(class58_sub1, 3, -1 == i_2_ ? i_3_ : i_2_,
				548671916);
	else
	    Class568.method6845(class58_sub1, 1, i_3_ == -1 ? i_2_ : i_3_,
				1370300765);
	return class58_sub1;
    }
    
    static void method5037(String[] strings, int[] is, int i, int i_7_,
			   int i_8_) {
	if (i < i_7_) {
	    int i_9_ = (i + i_7_) / 2;
	    int i_10_ = i;
	    String string = strings[i_9_];
	    strings[i_9_] = strings[i_7_];
	    strings[i_7_] = string;
	    int i_11_ = is[i_9_];
	    is[i_9_] = is[i_7_];
	    is[i_7_] = i_11_;
	    for (int i_12_ = i; i_12_ < i_7_; i_12_++) {
		if (string == null
		    || (null != strings[i_12_]
			&& strings[i_12_].compareTo(string) < (i_12_ & 0x1))) {
		    String string_13_ = strings[i_12_];
		    strings[i_12_] = strings[i_10_];
		    strings[i_10_] = string_13_;
		    int i_14_ = is[i_12_];
		    is[i_12_] = is[i_10_];
		    is[i_10_++] = i_14_;
		}
	    }
	    strings[i_7_] = strings[i_10_];
	    strings[i_10_] = string;
	    is[i_7_] = is[i_10_];
	    is[i_10_] = i_11_;
	    method5037(strings, is, i, i_10_ - 1, 1816406638);
	    method5037(strings, is, i_10_ + 1, i_7_, 809739093);
	}
    }
    
    public static void method5038
	(Cs2Context cs2Context, int i, int i_15_,
	 Entity class645_sub1_sub5_sub1, int i_16_,
	 byte i_17_) {
	Class648 class648 = Class528_Sub15_Sub1.method10454((byte) 10);
	((Class648) class648).aClass645_Sub1_Sub5_Sub1_8389
	    = class645_sub1_sub5_sub1;
	((Class648) class648).anInt8413 = -345933331 * i_16_;
	Class5_Sub7.method10151(cs2Context, i, i_15_, class648, 1844203618);
	((Class648) class648).aClass645_Sub1_Sub5_Sub1_8389 = null;
	((Class648) class648).anInt8413 = 345933331;
    }
    
    static final void method5039(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	if (Class494.method5957(string, class648, (short) 520) != null)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2518
	    = Class181_Sub23.method8999(string, class648, (byte) 14);
	class229.aBool2483 = true;
    }
}
