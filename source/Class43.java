/* Class43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class43
{
    static final int anInt524 = 3;
    static int[] anIntArray525;
    static int anInt526 = 0;
    static int anInt527 = 0;
    static Class675 aClass675_528;
    static String aString529;
    public static Class446 aClass446_530;
    
    static void method835() {
	if (Class298.aClass55_3261 != null) {
	    try {
		int i;
		if (-1760365733 * anInt527 == 0)
		    i = 250;
		else
		    i = 2000;
		anInt526 += 344837253;
		if (-1598403507 * anInt526 > i)
		    Class561_Sub1.method9604((byte) 56);
		if (Class55.aClass55_680 == Class298.aClass55_3261) {
		    client.aClass109_11162.method1381
			(Class439.method5301(Class12.aClass16_177
						 .method639(1056353131),
					     15000, 2122479929),
			 Class12.aClass16_177.aString194, 223720242);
		    client.aClass109_11162.method1378((short) -14065);
		    Class528_Sub34 class528_sub34
			= Class528_Sub35.method9518(-1449171982);
		    class528_sub34.aClass528_Sub42_Sub2_10481.writeByte
			(-257442419 * HandshakeOpcode.aClass404_4586.anInt4590,
			 (byte) -57);
		    class528_sub34.aClass528_Sub42_Sub2_10481
			.method9717(0, (byte) -77);
		    int i_0_ = (-185904669
				* (class528_sub34.aClass528_Sub42_Sub2_10481
				   .pointer));
		    class528_sub34.aClass528_Sub42_Sub2_10481
			.method9717(857, (byte) 12);
		    class528_sub34.aClass528_Sub42_Sub2_10481
			.method9717(1, (byte) 93);
		    anIntArray525
			= Class206.method2922(class528_sub34, -1878286363);
		    int i_1_ = (-185904669
				* (class528_sub34.aClass528_Sub42_Sub2_10481
				   .pointer));
		    class528_sub34.aClass528_Sub42_Sub2_10481
			.writeString(client.aString11054, -1936289654);
		    class528_sub34.aClass528_Sub42_Sub2_10481.method9717
			(-1608791841 * client.anInt10856, (byte) -30);
		    class528_sub34.aClass528_Sub42_Sub2_10481.writeInt
			(-402082287 * client.anInt10861, 2141049841);
		    class528_sub34.aClass528_Sub42_Sub2_10481.writeInt
			(client.anInt10860 * 1442051623, 2085243676);
		    class528_sub34.aClass528_Sub42_Sub2_10481
			.writeString(Class217.aString2291, -1936289654);
		    class528_sub34.aClass528_Sub42_Sub2_10481.writeByte
			(Class378_Sub2.aClass668_10123.method68(), (byte) 43);
		    class528_sub34.aClass528_Sub42_Sub2_10481.writeByte
			(-352215983 * client.aClass673_11108.anInt8535,
			 (byte) 69);
		    Class398.method4826((class528_sub34
					 .aClass528_Sub42_Sub2_10481),
					(byte) -102);
		    String string = client.aString10866;
		    class528_sub34.aClass528_Sub42_Sub2_10481
			.writeByte(null == string ? 0 : 1, (byte) 24);
		    if (null != string)
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .writeString(string, -1936289654);
		    Class141_Sub1.aClass528_Sub37_8800.method9545
			(class528_sub34.aClass528_Sub42_Sub2_10481,
			 -2041520834);
		    class528_sub34.aClass528_Sub42_Sub2_10481.pointer
			+= 1220108941;
		    class528_sub34.aClass528_Sub42_Sub2_10481.method9705
			(anIntArray525, i_1_,
			 (class528_sub34.aClass528_Sub42_Sub2_10481.pointer
			  * -185904669),
			 16711935);
		    class528_sub34.aClass528_Sub42_Sub2_10481.method9620
			((-185904669 * (class528_sub34
					.aClass528_Sub42_Sub2_10481.pointer)
			  - i_0_),
			 -1987682084);
		    client.aClass109_11162.method1380(class528_sub34,
						      1275798399);
		    client.aClass109_11162.method1379(366411973);
		    Class298.aClass55_3261 = Class55.aClass55_681;
		}
		if (Class298.aClass55_3261 == Class55.aClass55_681) {
		    if (client.aClass109_11162.method1384((byte) 102) == null)
			Class561_Sub1.method9604((byte) -56);
		    else if (client.aClass109_11162.method1384((byte) 36)
				 .method6690(1, -676836283)) {
			client.aClass109_11162.method1384((byte) 42).method6689
			    ((((Class109) client.aClass109_11162)
			      .aClass528_Sub42_Sub2_1378.payload),
			     0, 1, -1765858815);
			aClass675_528
			    = (Class675) (Class443.method5321
					  (Class230.method3238(-2058360443),
					   (((Class109) client.aClass109_11162)
					    .aClass528_Sub42_Sub2_1378
					    .payload[0]) & 0xff,
					   737671864));
			if (Class675.aClass675_8545 == aClass675_528) {
			    client.aClass109_11162.aClass10_1379
				= new ISAACCipher(anIntArray525);
			    int[] is = new int[4];
			    for (int i_2_ = 0; i_2_ < 4; i_2_++)
				is[i_2_] = anIntArray525[i_2_] + 50;
			    ((Class109) client.aClass109_11162).aClass10_1391
				= new ISAACCipher(is);
			    new ISAACCipher(is);
			    ((Class109) client.aClass109_11162)
				.aClass528_Sub42_Sub2_1378.method10616
				((((Class109) client.aClass109_11162)
				  .aClass10_1391),
				 786797792);
			    Class487.method5890(14, 2130003981);
			    client.aClass109_11162.method1378((short) -3397);
			    ((Class109) client.aClass109_11162)
				.aClass528_Sub42_Sub2_1378.pointer
				= 0;
			    ((Class109) client.aClass109_11162).aClass396_1380
				= null;
			    ((Class109) client.aClass109_11162).aClass396_1385
				= null;
			    ((Class109) client.aClass109_11162).aClass396_1390
				= null;
			    ((Class109) client.aClass109_11162).anInt1394 = 0;
			    Class570.playerVarsProvider.aClass586_1209
				.method7006(-1218075480);
			    Class488.method5908(1572665758);
			} else
			    client.aClass109_11162.method1382(-166133340);
			((Class109) client.aClass109_11162).current
			    = null;
			Class298.aClass55_3261 = null;
		    }
		}
	    } catch (IOException ioexception) {
		Class561_Sub1.method9604((byte) -26);
	    }
	}
    }
    
    public static void method836() {
	if (8 == client.anInt10876 * 175711435
	    && (!Class181.method2686(-1712965615)
		&& !Class528_Sub36.method9535(1944930075)))
	    Class487.method5890(4, 2130003981);
    }
    
    public static void method837(int i) {
	if (14 == client.anInt10876 * 175711435) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4504,
				      client.aClass109_11162.aClass10_1379,
				      -2105648024);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeByte(i, (byte) 54);
	    client.aClass109_11162.method1380(class528_sub34, 839183491);
	}
    }
    
    static void method838() {
	Class298.aClass55_3261 = Class55.aClass55_680;
	aClass675_528 = Class675.aClass675_8542;
	Class409.aClass681_4709 = Class681.aClass681_8578;
	Class181_Sub23.aClass682_9880 = Class682.aClass682_8601;
	Class75.aClass689_790 = Class689.aClass689_8664;
	Class501_Sub1.aClass698_10133 = Class698.aClass698_8728;
	aString529 = null;
    }
    
    static void method839() {
	Class298.aClass55_3261 = Class55.aClass55_680;
	aClass675_528 = Class675.aClass675_8542;
	Class409.aClass681_4709 = Class681.aClass681_8578;
	Class181_Sub23.aClass682_9880 = Class682.aClass682_8601;
	Class75.aClass689_790 = Class689.aClass689_8664;
	Class501_Sub1.aClass698_10133 = Class698.aClass698_8728;
	aString529 = null;
    }
    
    static void method840() {
	Class298.aClass55_3261 = Class55.aClass55_680;
	aClass675_528 = Class675.aClass675_8542;
	Class409.aClass681_4709 = Class681.aClass681_8578;
	Class181_Sub23.aClass682_9880 = Class682.aClass682_8601;
	Class75.aClass689_790 = Class689.aClass689_8664;
	Class501_Sub1.aClass698_10133 = Class698.aClass698_8728;
	aString529 = null;
    }
    
    static boolean method841() {
	return Class298.aClass55_3261 != null;
    }
    
    static boolean method842() {
	return Class298.aClass55_3261 != null;
    }
    
    static void method843() {
	client.aClass109_11162.method1382(731240119);
	if (-1760365733 * anInt527 < 2) {
	    Class12.aClass16_177.method634(2084412216);
	    anInt526 = 0;
	    anInt527 += -2030304045;
	    Class298.aClass55_3261 = Class55.aClass55_680;
	} else {
	    Class298.aClass55_3261 = null;
	    aClass675_528 = Class675.aClass675_8544;
	    Class487.method5890(8, 2130003981);
	}
    }
    
    public static void method844() {
	if (client.anInt10876 * 175711435 == 14) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4487,
				      client.aClass109_11162.aClass10_1379,
				      -1959010794);
	    client.aClass109_11162.method1380(class528_sub34, 635213560);
	    Class75.aClass689_790 = Class689.aClass689_8660;
	    aString529 = null;
	}
    }
    
    public static void method845() {
	if (client.anInt10876 * 175711435 == 14) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4487,
				      client.aClass109_11162.aClass10_1379,
				      -1913705953);
	    client.aClass109_11162.method1380(class528_sub34, 1719810351);
	    Class75.aClass689_790 = Class689.aClass689_8660;
	    aString529 = null;
	}
    }
    
    public static void method846(int i) {
	if (14 == client.anInt10876 * 175711435) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4504,
				      client.aClass109_11162.aClass10_1379,
				      -1906364275);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeByte(i, (byte) 39);
	    client.aClass109_11162.method1380(class528_sub34, 1155658908);
	}
    }
    
    public static void method847() {
	if (8 == client.anInt10876 * 175711435
	    && (!Class181.method2686(-1712965615)
		&& !Class528_Sub36.method9535(199164124)))
	    Class487.method5890(4, 2130003981);
    }
    
    public static String method848() {
	return aString529;
    }
    
    static void method849() {
	Class298.aClass55_3261 = Class55.aClass55_680;
	aClass675_528 = Class675.aClass675_8542;
	Class409.aClass681_4709 = Class681.aClass681_8578;
	Class181_Sub23.aClass682_9880 = Class682.aClass682_8601;
	Class75.aClass689_790 = Class689.aClass689_8664;
	Class501_Sub1.aClass698_10133 = Class698.aClass698_8728;
	aString529 = null;
    }
    
    public static void method850() {
	if (client.anInt10876 * 175711435 == 14) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4487,
				      client.aClass109_11162.aClass10_1379,
				      -1971175121);
	    client.aClass109_11162.method1380(class528_sub34, 471311395);
	    Class75.aClass689_790 = Class689.aClass689_8660;
	    aString529 = null;
	}
    }
    
    public static void method851(int i) {
	if (14 == client.anInt10876 * 175711435) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4504,
				      client.aClass109_11162.aClass10_1379,
				      -1882160042);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeByte(i,
								 (byte) -35);
	    client.aClass109_11162.method1380(class528_sub34, 1715265692);
	}
    }
    
    public static void method852(int i) {
	if (14 == client.anInt10876 * 175711435) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4504,
				      client.aClass109_11162.aClass10_1379,
				      -2097930726);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeByte(i,
								 (byte) -44);
	    client.aClass109_11162.method1380(class528_sub34, 1218551217);
	}
    }
    
    Class43() throws Throwable {
	throw new Error();
    }
    
    static void method853() {
	client.aClass109_11162.method1382(-888034281);
	if (-1760365733 * anInt527 < 2) {
	    Class12.aClass16_177.method634(-488698116);
	    anInt526 = 0;
	    anInt527 += -2030304045;
	    Class298.aClass55_3261 = Class55.aClass55_680;
	} else {
	    Class298.aClass55_3261 = null;
	    aClass675_528 = Class675.aClass675_8544;
	    Class487.method5890(8, 2130003981);
	}
    }
    
    public static void method854(boolean bool, int i) {
	Class365.aClass218_3848.method3125(-362154873);
	if (Class622.method7419(175711435 * client.anInt10876, (byte) -111)) {
	    Class109[] class109s = client.aClass109Array10931;
	    for (int i_3_ = 0; i_3_ < class109s.length; i_3_++) {
		Class109 class109 = class109s[i_3_];
		class109.anInt1386 += 1455852407;
		if (class109.anInt1386 * -918831545 < 50 && !bool)
		    return;
		class109.anInt1386 = 0;
		if (!class109.aBool1387
		    && class109.method1384((byte) 93) != null) {
		    Class528_Sub34 class528_sub34
			= Class656.method7845(OutgoingOpcode.aClass403_4570,
					      class109.aClass10_1379,
					      -2017071788);
		    class109.method1380(class528_sub34, 1645635111);
		    try {
			class109.method1379(1125532097);
		    } catch (IOException ioexception) {
			class109.aBool1387 = true;
		    }
		}
	    }
	    Class365.aClass218_3848.method3125(-362154873);
	}
    }
    
    static final void method855(Class229 class229, Class226 class226,
				Class648 class648, int i) {
	((Class648) class648).anInt8395 -= 661123364;
	class229.anInt2384
	    = (((Class648) class648).anIntArray8394
	       [((Class648) class648).anInt8395 * 717927929]) * 2068004849;
	class229.anInt2369
	    = (((Class648) class648).anIntArray8394
	       [1 + 717927929 * ((Class648) class648).anInt8395]) * 510958421;
	int i_4_ = (((Class648) class648).anIntArray8394
		    [2 + 717927929 * ((Class648) class648).anInt8395]);
	if (i_4_ < 0)
	    i_4_ = 0;
	else if (i_4_ > 5)
	    i_4_ = 5;
	int i_5_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395 + 3]);
	if (i_5_ < 0)
	    i_5_ = 0;
	else if (i_5_ > 5)
	    i_5_ = 5;
	class229.aByte2539 = (byte) i_4_;
	class229.aByte2381 = (byte) i_5_;
	Class39.method811(class229, 1435904523);
	Class576.method6893(class226, class229, -2025544239);
	if (class229.anInt2378 * -319431967 == 0)
	    Class423.method5110(class226, class229, false, -1590494924);
	if (-1 == 1835803215 * class229.anInt2377 && !class226.aBool2335)
	    Class297.method3986(class229.anInt2376 * 306930455, (byte) 24);
    }
}
