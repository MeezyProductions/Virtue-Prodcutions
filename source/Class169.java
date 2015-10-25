/* Class169 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class169
{
    static Class169 aClass169_1932;
    public static Class169 aClass169_1933;
    static Class169 aClass169_1934;
    public static Class169 aClass169_1935;
    static Class169 aClass169_1936 = new Class169(0, 1);
    public static Class169 aClass169_1937;
    public static Class169 aClass169_1938;
    public static Class169 aClass169_1939;
    public static Class169 aClass169_1940;
    public int anInt1941;
    public int anInt1942;
    
    Class169(int i, int i_0_) {
	anInt1941 = i * -1221317091;
	anInt1942 = i_0_ * -663116327;
    }
    
    static {
	aClass169_1932 = new Class169(2, 2);
	aClass169_1934 = new Class169(1, 4);
	aClass169_1935 = new Class169(6, 1);
	aClass169_1933 = new Class169(4, 2);
	aClass169_1937 = new Class169(7, 3);
	aClass169_1938 = new Class169(8, 4);
	aClass169_1939 = new Class169(5, 2);
	aClass169_1940 = new Class169(3, 4);
    }
    
    public static void method2101(Class173 class173, int i) {
	Class378_Sub1_Sub1.aClass172_11264
	    = ((Class172)
	       Class625.aClass414_8129.method4936(client.anInterface50_10917,
						  (1259358021
						   * Class27.anInt249),
						  true, true, (byte) -72));
	Exception_Sub3.aClass1_11221
	    = Class625.aClass414_8129.method4937(client.anInterface50_10917,
						 Class27.anInt249 * 1259358021,
						 113881972);
	Class191.aClass172_2171
	    = ((Class172)
	       Class625.aClass414_8129.method4936(client.anInterface50_10917,
						  (Class27.anInt250
						   * -1530947491),
						  true, true, (byte) -96));
	Class27.aClass1_253
	    = Class625.aClass414_8129.method4937(client.anInterface50_10917,
						 (-1530947491
						  * Class27.anInt250),
						 1019787632);
	Class176.aClass172_2027
	    = ((Class172)
	       Class625.aClass414_8129.method4936(client.anInterface50_10917,
						  665751967 * Class27.anInt255,
						  true, true, (byte) -11));
	Class392.aClass1_4120
	    = Class625.aClass414_8129.method4937(client.anInterface50_10917,
						 Class27.anInt255 * 665751967,
						 1130127003);
    }
    
    static void method2102(int i, int i_1_, Class229 class229,
			   Class243 class243, int i_2_, int i_3_, int i_4_) {
	Class96[] class96s = client.aClass96Array11016;
	for (int i_5_ = 0; i_5_ < class96s.length; i_5_++) {
	    Class96 class96 = class96s[i_5_];
	    if (class96 != null && class96.anInt1224 * -411936407 != 0
		&& client.anInt11127 % 20 < 10) {
		if (1 == -411936407 * class96.anInt1224) {
		    Class528_Sub31 class528_sub31
			= ((Class528_Sub31)
			   (client.aClass692_11110.method8137
			    ((long) (class96.anInt1216 * -1637531687))));
		    if (null != class528_sub31) {
			NPC class645_sub1_sub5_sub1_sub1
			    = ((NPC)
			       class528_sub31.anObject10468);
			Class422 class422
			    = (class645_sub1_sub5_sub1_sub1.method7693()
			       .aClass422_4868);
			int i_6_ = (int) class422.aFloat4780 / 128 - i / 128;
			int i_7_
			    = (int) class422.aFloat4777 / 128 - i_1_ / 128;
			client.method10269(class229, class243, i_2_, i_3_,
					   i_6_, i_7_,
					   (((Class96) class96).anInt1225
					    * 1574185279),
					   360000L);
		    }
		}
		if (class96.anInt1224 * -411936407 == 2) {
		    int i_8_ = -1857643871 * class96.anInt1218 / 128 - i / 128;
		    int i_9_
			= 1777883189 * class96.anInt1219 / 128 - i_1_ / 128;
		    long l = (long) (1323713139 * class96.anInt1222 << 7);
		    l *= l;
		    client.method10269(class229, class243, i_2_, i_3_, i_8_,
				       i_9_,
				       (1574185279
					* ((Class96) class96).anInt1225),
				       l);
		}
		if (-411936407 * class96.anInt1224 == 10
		    && class96.anInt1216 * -1637531687 >= 0
		    && (class96.anInt1216 * -1637531687
			< (client
			   .localPlayers).length)) {
		    Player class645_sub1_sub5_sub1_sub2
			= (client.localPlayers
			   [-1637531687 * class96.anInt1216]);
		    if (class645_sub1_sub5_sub1_sub2 != null) {
			Class422 class422
			    = (class645_sub1_sub5_sub1_sub2.method7693()
			       .aClass422_4868);
			int i_10_ = (int) class422.aFloat4780 / 128 - i / 128;
			int i_11_
			    = (int) class422.aFloat4777 / 128 - i_1_ / 128;
			client.method10269(class229, class243, i_2_, i_3_,
					   i_10_, i_11_,
					   (1574185279
					    * ((Class96) class96).anInt1225),
					   360000L);
		    }
		}
	    }
	}
    }
    
    static final void method2103(Class229 class229, int i, Class648 class648,
				 int i_12_) {
	if (null == class229.aByteArrayArray2464)
	    throw new RuntimeException();
	if (class229.anIntArray2555 == null)
	    class229.anIntArray2555
		= new int[class229.aByteArrayArray2464.length];
	class229.anIntArray2555[i] = 2147483647;
    }
    
    static final void method2104(Class648 class648, int i) {
	int i_13_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_13_, (byte) 58);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class229.anInt2360 * -1087215923;
    }
    
    static final void method2105(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class108.myPlayer.aClass37_11809
		  .method795(-367390808);
    }
}
