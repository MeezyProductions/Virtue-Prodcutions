/* Class301 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class301
{
    static Class301 aClass301_3341;
    static Class301 aClass301_3342 = new Class301(0);
    
    static {
	aClass301_3341 = new Class301(1);
    }
    
    Class301(int i) {
	/* empty */
    }
    
    static void method4022(byte i) {
	Class99.aBool1266 = false;
	PlayerModel.method7298(-2095642770);
    }
    
    static final void method4023(Class648 class648, byte i) {
	if (null != client.aString11172)
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= client.aString11172;
	else
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
    }
    
    static final void method4024(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub14_10570
		  .method9932((byte) -1);
    }
    
    static final void method4025(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 716602197 * Class528_Sub35.anInt10494 & 0x1;
    }
    
    static final void method4026(Class229[] class229s, int i, byte i_0_) {
	for (int i_1_ = 0; i_1_ < class229s.length; i_1_++) {
	    Class229 class229 = class229s[i_1_];
	    if (class229 != null) {
		if (-319431967 * class229.anInt2378 == 0) {
		    if (null != class229.aClass229Array2390)
			method4026(class229.aClass229Array2390, i, (byte) 80);
		    Class528_Sub39 class528_sub39
			= ((Class528_Sub39)
			   (client.aClass692_11097.method8137
			    ((long) (306930455 * class229.anInt2376))));
		    if (null != class528_sub39)
			Class539.method6616((905908359
					     * class528_sub39.anInt10625),
					    i, (byte) -125);
		}
		if (0 == i && class229.anObjectArray2520 != null) {
		    Class528_Sub30 class528_sub30 = new Class528_Sub30();
		    class528_sub30.aClass229_10461 = class229;
		    class528_sub30.anObjectArray10460
			= class229.anObjectArray2520;
		    Class555.method6741(class528_sub30, (short) 11377);
		}
		if (i == 1 && null != class229.anObjectArray2394) {
		    if (1835803215 * class229.anInt2377 >= 0) {
			Class229 class229_2_
			    = Class623_Sub1.method9755((306930455
							* class229.anInt2376),
						       (byte) -36);
			if (class229_2_ == null
			    || class229_2_.aClass229Array2542 == null
			    || (1835803215 * class229.anInt2377
				>= class229_2_.aClass229Array2542.length)
			    || (class229_2_.aClass229Array2542
				[class229.anInt2377 * 1835803215]) != class229)
			    continue;
		    }
		    Class528_Sub30 class528_sub30 = new Class528_Sub30();
		    class528_sub30.aClass229_10461 = class229;
		    class528_sub30.anObjectArray10460
			= class229.anObjectArray2394;
		    Class555.method6741(class528_sub30, (short) 6094);
		}
	    }
	}
    }
    
    public static final void method4027(boolean bool, byte i) {
	Class528_Sub34 class528_sub34
	    = Class656.method7845(OutgoingOpcode.aClass403_4550,
				  client.aClass109_10930.aClass10_1379,
				  -1889734388);
	client.aClass109_10930.method1380(class528_sub34, 1607971355);
	for (Class528_Sub39 class528_sub39
		 = ((Class528_Sub39)
		    client.aClass692_11097.method8146(-1942855841));
	     class528_sub39 != null;
	     class528_sub39 = (Class528_Sub39) client.aClass692_11097
						   .method8138(-1111102132)) {
	    if (!class528_sub39.method6441(-219181626)) {
		class528_sub39 = (Class528_Sub39) client.aClass692_11097
						      .method8146(-1942855841);
		if (class528_sub39 == null)
		    break;
	    }
	    if (0 == class528_sub39.anInt10626 * 17672073)
		Class279.method3735(class528_sub39, true, bool, 693188413);
	}
	if (client.aClass229_11059 != null) {
	    Class39.method811(client.aClass229_11059, 1435904523);
	    client.aClass229_11059 = null;
	}
    }
    
    static final int method4028(int i, int i_3_, int i_4_, int i_5_) {
	if (i == i_3_)
	    return i;
	int i_6_ = 128 - i_4_;
	int i_7_ = i_4_ * (i_3_ & 0x7f) + (i & 0x7f) * i_6_ >> 7;
	int i_8_ = (i & 0x380) * i_6_ + (i_3_ & 0x380) * i_4_ >> 7;
	int i_9_ = i_4_ * (i_3_ & 0xfc00) + (i & 0xfc00) * i_6_ >> 7;
	return i_9_ & 0xfc00 | i_8_ & 0x380 | i_7_ & 0x7f;
    }
    
    static final void method4029(Class648 class648, int i) {
	int i_10_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_10_, (byte) -55);
	Class226 class226 = Class380.aClass226Array3970[i_10_ >> 16];
	Class376.method4697(class229, class226, class648, 819716622);
    }
    
    static final void method4030(Class648 class648, byte i) {
	int i_11_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_11_, (byte) 12);
	Class226 class226 = Class380.aClass226Array3970[i_11_ >> 16];
	Class523.method6366(class229, class226, class648, (byte) -11);
    }
}
