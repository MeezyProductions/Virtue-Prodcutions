/* Class416 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;


public class Class416
{
    int anInt4745;
    int anInt4746;
    byte[] aByteArray4747;
    int anInt4748;
    public static Class544 aClass544_4749;
    
    Class416(int i, int i_0_, int i_1_, int i_2_, byte[] is) {
	this.anInt4748 = 1547475825 * i;
	this.anInt4745 = i_0_ * 465369291;
	this.anInt4746 = 1738106971 * i_1_;
	this.aByteArray4747 = is;
    }
    
    static void method4965(Class648 class648, int i) {
	int i_3_
	    = (class648.anIntArray8394
	       [(class648.anInt8395 -= 1239022665) * 717927929]);
	TwitchWebcamDevice twitchwebcamdevice
	    = Class264.method3658(i_3_, (byte) 2);
	if (twitchwebcamdevice == null) {
	    class648.anIntArray8394
		[((class648.anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -1;
	    class648.anObjectArray8396
		[((class648.anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
	    class648.anObjectArray8396
		[((class648.anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
	} else {
	    class648.anIntArray8394
		[((class648.anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 1730387545 * twitchwebcamdevice.anInt1097;
	    class648.anObjectArray8396
		[((class648.anInt8410 += 1600226731) * -520794877
		  - 1)]
		= twitchwebcamdevice.aString1095;
	    class648.anObjectArray8396
		[((class648.anInt8410 += 1600226731) * -520794877
		  - 1)]
		= twitchwebcamdevice.aString1096;
	}
    }
    
    static final void method4966(Class648 class648, int i) {
	class648.anInt8390
	    += 1888568287 * (class648.anIntArray8414
			     [class648.anInt8390 * -630179809]);
    }
    
    static final void method4967(Class648 class648, int i) {
	Class646 class646 = (class648.aBool8418
			     ? class648.aClass646_8406
			     : class648.aClass646_8392);
	Class229 class229 = class646.aClass229_8385;
	Class226 class226 = class646.aClass226_8384;
	Class525.method6390(class229, class226, class648, 562403444);
    }
    
    static final void method4968(Class229 class229, Class226 class226,
				 Class648 class648, byte i) {
	class229.anInt2418 = 1746431593;
	class229.anInt2419 = client.anInt11025 * -1926636207;
	class229.anInt2349 = 0;
	if (-1 == class229.anInt2377 * 1835803215 && !class226.aBool2335)
	    Class26_Sub1.method9542(306930455 * class229.anInt2376,
				    (short) 21531);
    }
    
    public static final void method4969(boolean bool, int i) {
	Class109[] class109s = client.aClass109Array10931;
	for (int i_4_ = 0; i_4_ < class109s.length; i_4_++) {
	    Class109 class109 = class109s[i_4_];
	    try {
		class109.method1379(-981166862);
	    } catch (IOException ioexception) {
		/* empty */
	    }
	    class109.method1382(1202302624);
	}
	Class223.method3159(-2084556360);
	Class452.method5450(549850523);
	Class666.method7908(false, 274535491);
	client.aClass495_10935.method5983(1547292948);
	client.aClass495_10935.method6049(1719110321);
	client.aClass495_10935.method5977(2065561127);
	OutgoingOpcode.method4860(-354695735);
	Class327.method4262(115096820);
	Class50.method894(true, (byte) -73);
	Class642.method7610((byte) -35);
	Class90.method1217((byte) 2);
	client.anInt11025 = 909315087;
	if (bool)
	    Class487.method5890(0, 2130003981);
	else {
	    Class487.method5890(8, 2130003981);
	    try {
		Class70.method1086(Class196.anApplet2198, "loggedout",
				   (byte) 4);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
    }
}
