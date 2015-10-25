/* Class298 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.URL;

public class Class298
{
    static Class298 aClass298_3257 = new Class298(0);
    static Class298 aClass298_3258 = new Class298(1);
    static Class298 aClass298_3259 = new Class298(2);
    int anInt3260;
    static Class55 aClass55_3261;
    public static Class151[] aClass151Array3262;
    
    Class298(int i) {
	((Class298) this).anInt3260 = 1255074511 * i;
    }
    
    public static boolean method3988(String string, int i, String string_0_,
				     int i_1_) {
	if (i == 0) {
	    boolean bool;
	    try {
		if (!Class499.aString6843.startsWith("win"))
		    throw new Exception();
		if (!string.startsWith("http://")
		    && !string.startsWith("https://"))
		    throw new Exception();
		String string_2_
		    = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
		for (int i_3_ = 0; i_3_ < string.length(); i_3_++) {
		    if (string_2_.indexOf(string.charAt(i_3_)) == -1)
			throw new Exception();
		}
		Runtime.getRuntime().exec(new StringBuilder().append
					      ("cmd /c start \"j\" \"").append
					      (string).append
					      ("\"").toString());
		bool = true;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	}
	if (1 == i) {
	    boolean bool;
	    try {
		Object object
		    = Class70.method1085(Class499.anApplet6841, string_0_,
					 (new Object[]
					  { new URL(Class499.anApplet6841
							.getCodeBase(),
						    string).toString() }),
					 445184839);
		bool = null != object;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	}
	if (2 == i) {
	    boolean bool;
	    try {
		Class499.anApplet6841.getAppletContext().showDocument
		    (new URL(Class499.anApplet6841.getCodeBase(), string),
		     "_blank");
		bool = true;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	if (3 == i) {
	    try {
		Class70.method1086(Class499.anApplet6841, "loggedout",
				   (byte) 31);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    boolean bool;
	    try {
		Class499.anApplet6841.getAppletContext().showDocument
		    (new URL(Class499.anApplet6841.getCodeBase(), string),
		     "_top");
		bool = true;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	throw new IllegalArgumentException();
    }
    
    static final void method3989(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub6_10574
		  .method9868((byte) 41);
    }
    
    static void method3990(Class229 class229, byte i) {
	if (client.aBool10899) {
	    if (class229.anObjectArray2540 != null) {
		Class229 class229_4_
		    = Class230.method3236(-771216895 * Class487.anInt5494,
					  client.anInt11052 * -1114833639,
					  -627058628);
		if (class229_4_ != null) {
		    Class528_Sub30 class528_sub30 = new Class528_Sub30();
		    class528_sub30.aClass229_10461 = class229;
		    class528_sub30.aClass229_10463 = class229_4_;
		    class528_sub30.anObjectArray10460
			= class229.anObjectArray2540;
		    Class555.method6741(class528_sub30, (short) -1183);
		}
	    }
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4548,
				      client.aClass109_10930.aClass10_1379,
				      -2008756617);
	    class528_sub34.aClass528_Sub42_Sub2_10481
		.method9717(1961354633 * client.anInt11053, (byte) 68);
	    class528_sub34.aClass528_Sub42_Sub2_10481
		.method9673(Class487.anInt5494 * -771216895, 65535);
	    class528_sub34.aClass528_Sub42_Sub2_10481
		.method9661(1272672363 * class229.anInt2528, -1209250260);
	    class528_sub34.aClass528_Sub42_Sub2_10481
		.method9661(class229.anInt2377 * 1835803215, 584944616);
	    class528_sub34.aClass528_Sub42_Sub2_10481
		.method9673(306930455 * class229.anInt2376, 65535);
	    class528_sub34.aClass528_Sub42_Sub2_10481
		.method9661(client.anInt11052 * -1114833639, -1171710344);
	    client.aClass109_10930.method1380(class528_sub34, 1225440098);
	}
    }
    
    static final void method3991(byte i) {
	for (int i_5_ = 0; i_5_ < -2065344127 * client.anInt10922; i_5_++) {
	    int i_6_ = client.anIntArray10923[i_5_];
	    Class528_Sub31 class528_sub31
		= ((Class528_Sub31)
		   client.aClass692_11110.method8137((long) i_6_));
	    if (null != class528_sub31) {
		NPC class645_sub1_sub5_sub1_sub1
		    = ((NPC)
		       class528_sub31.anObject10468);
		Class95_Sub1_Sub1.method10291(class645_sub1_sub5_sub1_sub1,
					      false, -1406897562);
	    }
	}
    }
    
    static final void method3992(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= 1900146029;
	int i_7_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_8_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929 + 1]);
	int i_9_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929 + 2]);
	int i_10_ = (((Class648) class648).anIntArray8394
		     [((Class648) class648).anInt8395 * 717927929 + 3]);
	int i_11_ = (((Class648) class648).anIntArray8394
		     [4 + ((Class648) class648).anInt8395 * 717927929]);
	Class365.aClass218_3848.method3104(Class196.aClass196_2192, i_7_, i_8_,
					   i_10_,
					   Class188.aClass188_2130
					       .method2758(-1560776500),
					   Class202.aClass202_2211, 0.0F, 0.0F,
					   null, 0, i_11_, i_9_, 1532083480);
    }
    
    static final void method3993(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_12_ = (((Class648) class648).anIntArray8394
		     [717927929 * ((Class648) class648).anInt8395]);
	int i_13_ = (((Class648) class648).anIntArray8394
		     [((Class648) class648).anInt8395 * 717927929 + 1]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (-1836364263
	       * client.aClass487ArrayArray11004[i_13_][i_12_].anInt5489);
    }
}
