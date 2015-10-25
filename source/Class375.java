/* Class375 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class375 implements Interface47
{
    public int anInt3925;
    public Class381 aClass381_3926;
    public int anInt3927;
    public String aString3928;
    public int anInt3929;
    public Class377 aClass377_3930;
    public int anInt3931;
    public int anInt3932;
    public int anInt3933;
    public int anInt3934;
    public int anInt3935;
    public int anInt3936;
    public int anInt3937;
    static int anInt3938;
    
    public Class379 method330() {
	return Class379.aClass379_3961;
    }
    
    public Class379 method331(int i) {
	return Class379.aClass379_3961;
    }
    
    Class375(String string, Class381 class381, Class377 class377, int i,
	     int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_,
	     int i_6_, int i_7_, int i_8_) {
	aString3928 = string;
	aClass381_3926 = class381;
	aClass377_3930 = class377;
	anInt3937 = i * -1089474787;
	anInt3929 = i_0_ * -361231757;
	anInt3931 = i_1_ * -1442216909;
	anInt3925 = 1221392277 * i_2_;
	anInt3932 = i_3_ * 542063373;
	anInt3933 = -41220833 * i_4_;
	anInt3934 = -271939871 * i_5_;
	anInt3927 = -1523313263 * i_6_;
	anInt3936 = -1216874163 * i_7_;
	anInt3935 = 1055485199 * i_8_;
    }
    
    static final void method4687(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -577899301;
	int i_9_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	short i_10_
	    = (short) (((Class648) class648).anIntArray8394
		       [1 + ((Class648) class648).anInt8395 * 717927929]);
	short i_11_
	    = (short) (((Class648) class648).anIntArray8394
		       [((Class648) class648).anInt8395 * 717927929 + 2]);
	if (i_9_ >= 0 && i_9_ < 5) {
	    class229.method3204(i_9_, i_10_, i_11_, 1730387545);
	    Class39.method811(class229, 1435904523);
	    if (class229.anInt2377 * 1835803215 == -1 && !class226.aBool2335)
		Class236.method3286(306930455 * class229.anInt2376, i_9_,
				    -1149378459);
	}
    }
    
    public static Class675 method4688(int i) {
	if (Class43.aClass675_528 == null)
	    return Class675.aClass675_8547;
	return Class43.aClass675_528;
    }
    
    static void method4689(BitBuffer class528_sub42_sub2, byte i) {
	Class52[] class52s = Class2.method507(146049478);
	for (int i_12_ = 0; i_12_ < class52s.length; i_12_++) {
	    Class52 class52 = class52s[i_12_];
	    if (class52 != Class52.aClass52_600) {
		Class446 class446 = (Class446) Class179.aMap2088.get(class52);
		if (class446 == null)
		    class528_sub42_sub2.writeInt(0, 2020518229);
		else
		    class528_sub42_sub2.writeInt(class446
						       .method5377(438659691),
						   2107081397);
	    }
	}
    }
    
    public static final void method4690(boolean bool, int i, int i_13_) {
	Class528_Sub36 class528_sub36 = (bool ? Class272.aClass528_Sub36_2903
					 : Class206.aClass528_Sub36_2231);
	if (class528_sub36 != null && i >= 0
	    && i < 233946487 * class528_sub36.anInt10495) {
	    Class305 class305 = class528_sub36.aClass305Array10498[i];
	    if (-1 == class305.aByte3349) {
		String string = class305.aString3350;
		Class109 class109 = Class591.method7078((byte) 93);
		Class528_Sub34 class528_sub34
		    = Class656.method7845(OutgoingOpcode.aClass403_4573,
					  class109.aClass10_1379, -2069656911);
		class528_sub34.aClass528_Sub42_Sub2_10481.writeByte
		    (3 + Class14.method627(string, -319287017), (byte) -104);
		class528_sub34.aClass528_Sub42_Sub2_10481
		    .writeByte(bool ? 1 : 0, (byte) -6);
		class528_sub34.aClass528_Sub42_Sub2_10481
		    .method9717(i, (byte) -16);
		class528_sub34.aClass528_Sub42_Sub2_10481
		    .writeString(string, -1936289654);
		class109.method1380(class528_sub34, 1537420484);
	    }
	}
    }
    
    static void method4691(int i, int i_14_) {
	for (Node node
		 = client.aClass692_11112.method8146(-1942855841);
	     node != null;
	     node = client.aClass692_11112.method8138(176867132)) {
	    if ((long) i == (-4849232331708333273L * node.aLong7107 >> 48
			     & 0xffffL))
		node.method6443(1261652385);
	}
    }
    
    static final void method4692(Class648 class648, int i) {
	int i_15_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_15_, (byte) 56);
	Class226 class226 = Class380.aClass226Array3970[i_15_ >> 16];
	Class106.method1363(class229, class226, class648, 1483003333);
    }
    
    static final void method4693(Class648 class648, int i) {
	Class398.aClass398_4405.method4821(1808700584);
    }
}
