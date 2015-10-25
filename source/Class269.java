/* Class269 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */


public class Class269
{
    static Class269 aClass269_2886 = new Class269(0, 4);
    static Class269 aClass269_2887 = new Class269(1, 5);
    static Class269 aClass269_2888 = new Class269(2, 6);
    int anInt2889;
    public int anInt2890;
    
    Class269(int i, int i_0_) {
	this.anInt2889 = -2044921785 * i;
	anInt2890 = -140412059 * i_0_;
    }
    
    static int method3677(int i) {
	try {
	    for (int i_1_ = 0; i_1_ < Class581.aStringArray7631.length;
		 i_1_++) {
		if (Class581.aStringArray7631[i_1_] != null
		    && Class581.aBoolArray7643[i_1_])
		    Class214.method2971(-802745526).method362
			(Class581.aStringArray7631[i_1_], (byte) -20);
	    }
	} catch (Exception_Sub1 exception_sub1) {
	    return 3;
	}
	Canvas_Sub1.aTwitchTV11693 = new TwitchTV();
	int i_2_ = Canvas_Sub1.aTwitchTV11693
		       .InitialiseTTV(Class528_Sub30.method9491(1898322797));
	if (i_2_ == 0)
	    Class581.aBool7626 = true;
	else
	    VarDomainType.method5340(new StringBuilder().append(10).append
				    (Class49.aString555).append
				    (i_2_).toString(),
				new RuntimeException(), 1778857274);
	return 2;
    }
    
    static final void method3678(Class648 class648, int i) {
	int i_3_
	    = (class648.anIntArray8394
	       [(class648.anInt8395 -= 1239022665) * 717927929]);
	Class528_Sub39 class528_sub39
	    = (Class528_Sub39) client.aClass692_11097.method8137(i_3_);
	if (class528_sub39 != null)
	    class648.anIntArray8394
		[((class648.anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 1;
	else
	    class648.anIntArray8394
		[((class648.anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
    }
    
    static final void method3679(Class648 class648, int i) {
	Class416.method4969(false, 5126206);
    }
    
    static final void method3680(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	class229.aString2427 = null;
	class229.aClass227_2457 = null;
    }
    
    public static final void method3681(int i, boolean bool, int i_4_) {
	if (null != Class272.aClass528_Sub36_2903
	    && (i >= 0
		&& i < 233946487 * Class272.aClass528_Sub36_2903.anInt10495)) {
	    Class305 class305
		= Class272.aClass528_Sub36_2903.aClass305Array10498[i];
	    Class109 class109 = Class591.method7078((byte) 100);
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4524,
				      class109.aClass10_1379, -1881588177);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeByte
		(3 + Class14.method627(class305.aString3350, 264448920),
		 (byte) -74);
	    class528_sub34.aClass528_Sub42_Sub2_10481.method9717(i,
								 (byte) -31);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeByte(bool ? 1 : 0,
								 (byte) 41);
	    class528_sub34.aClass528_Sub42_Sub2_10481
		.writeString(class305.aString3350, -1936289654);
	    class109.method1380(class528_sub34, 1444202096);
	}
    }
    
    public static void method3682
	(float f, Class422 class422, Class430 class430, Class422 class422_5_,
	 Class422 class422_6_, Class422 class422_7_, float f_8_, float f_9_,
	 float f_10_, short i) {
	if (!class422_5_.method5060(class422)) {
	    Class422 class422_11_ = Class422.method5051(0.0F, 0.0F, 0.0F);
	    Class422 class422_12_
		= Class422.method5052(Class422.method5065(class422_5_,
							  class422));
	    class422_12_.method5075(class430);
	    Class422 class422_13_
		= Class422.method5065(class422_12_, class422_11_);
	    float f_14_ = class422_13_.method5069();
	    if (Float.POSITIVE_INFINITY == class422_7_.aFloat4780
		|| Float.isNaN(class422.aFloat4780) || f_14_ > f_9_
		|| f_14_ < f_10_) {
		class422.method5058(class422_5_);
		class422_6_.method5059();
	    } else {
		class430.method5170();
		Class422 class422_15_ = Class422.method5051(1.0F, 0.0F, 0.0F);
		Class422 class422_16_ = Class422.method5051(0.0F, 1.0F, 0.0F);
		Class422 class422_17_ = Class422.method5051(0.0F, 0.0F, 1.0F);
		class422_15_.method5075(class430);
		class422_16_.method5075(class430);
		class422_17_.method5075(class430);
		Class422 class422_18_
		    = Class422.method5051(Class422.method5085(class422_15_,
							      class422_6_),
					  Class422.method5085(class422_16_,
							      class422_6_),
					  Class422.method5085(class422_17_,
							      class422_6_));
		Class422 class422_19_ = Class422.method5052(class422_18_);
		Class422 class422_20_
		    = (Class422.method5051
		       (class422_7_.aFloat4780 * class422_13_.aFloat4780,
			class422_7_.aFloat4776 * class422_13_.aFloat4776,
			class422_13_.aFloat4777 * class422_7_.aFloat4777));
		class422_19_.method5064(class422_20_, f);
		class422_19_.method5073(f_8_);
		Class422 class422_21_
		    = Class422.method5084(class422_15_,
					  class422_19_.aFloat4780);
		class422_21_.method5064(class422_16_, class422_19_.aFloat4776);
		class422_21_.method5064(class422_17_, class422_19_.aFloat4777);
		class422_6_.method5058(class422_21_);
		class422.method5063(Class422.method5084(class422_6_, f));
	    }
	}
    }
    
    public static int method3683(int i, int i_22_, boolean bool, short i_23_) {
	int i_24_ = 0;
	Class528_Sub6 class528_sub6 = IncomingPacket.method4814(i, bool, 2102481684);
	if (null == class528_sub6)
	    return 0;
	for (int i_25_ = 0;
	     i_25_ < class528_sub6.anIntArray10253.length;
	     i_25_++) {
	    if (class528_sub6.anIntArray10253[i_25_] >= 0
		&& (((ItemType)
		     Class18.aClass5_Sub13_206.method63((class528_sub6
							 .anIntArray10253
							 [i_25_]),
							-2074998096)).anInt34
		    * -1319014135) == i_22_)
		i_24_ += Class560_Sub1.method9841(i, i_25_, bool, -1949185905);
	}
	return i_24_;
    }
}
