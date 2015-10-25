/* Class504 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class504
{
    public static void method6118(boolean bool) {
	Class365.aClass218_3848.method3125(-362154873);
	if (Class622.method7419(175711435 * client.anInt10876, (byte) -48)) {
	    Class109[] class109s = client.aClass109Array10931;
	    for (int i = 0; i < class109s.length; i++) {
		Class109 class109 = class109s[i];
		class109.anInt1386 += 1455852407;
		if (class109.anInt1386 * -918831545 < 50 && !bool)
		    return;
		class109.anInt1386 = 0;
		if (!class109.aBool1387
		    && class109.method1384((byte) 90) != null) {
		    Class528_Sub34 class528_sub34
			= Class656.method7845(OutgoingOpcode.aClass403_4570,
					      class109.aClass10_1379,
					      -1976220271);
		    class109.method1380(class528_sub34, 715095548);
		    try {
			class109.method1379(158965465);
		    } catch (IOException ioexception) {
			class109.aBool1387 = true;
		    }
		}
	    }
	    Class365.aClass218_3848.method3125(-362154873);
	}
    }
    
    Class504() throws Throwable {
	throw new Error();
    }
    
    public static void method6119(Cs2Context cs2Context, int i, int i_0_,
				  int i_1_) {
	Class648 class648 = Class528_Sub15_Sub1.method10454((byte) 10);
	Class5_Sub7.method10151(cs2Context, i, i_0_, class648, 1314370380);
    }
    
    static final void method6120(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	ProtocolLoop.method1053(class229, class648, (byte) 0);
    }
    
    static void method6121(int i) {
	Class291.aClass186_3194.method2731(-1074399839);
    }
    
    public static void method6122(int i, int i_2_) {
	ClientPacket class528_sub21_sub7
	    = Class79.method1146(9, (long) i);
	class528_sub21_sub7.method10495(-1216590827);
    }
}
