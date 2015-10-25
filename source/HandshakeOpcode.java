/* HandshakeOpcode - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class HandshakeOpcode
{
    static HandshakeOpcode aClass404_4578;
    static HandshakeOpcode aClass404_4579;
    public static HandshakeOpcode aClass404_4580;
    public static HandshakeOpcode aClass404_4581;
    public static HandshakeOpcode aClass404_4582;
    public static HandshakeOpcode aClass404_4583 = new HandshakeOpcode(14, 0);
    public static HandshakeOpcode aClass404_4584;
    static HandshakeOpcode aClass404_4585;
    public static HandshakeOpcode aClass404_4586;
    public static HandshakeOpcode aClass404_4587;
    static HandshakeOpcode aClass404_4588;
    public static HandshakeOpcode aClass404_4589 = new HandshakeOpcode(15, -1);
    public int anInt4590;
    static HandshakeOpcode[] aClass404Array4591;
    static int anInt4592;
    
    static {
	aClass404_4584 = new HandshakeOpcode(16, -2);
	aClass404_4581 = new HandshakeOpcode(19, -2);
	aClass404_4578 = new HandshakeOpcode(23, 4);
	aClass404_4579 = new HandshakeOpcode(24, -1);
	aClass404_4580 = new HandshakeOpcode(26, 0);
	aClass404_4585 = new HandshakeOpcode(27, 0);
	aClass404_4586 = new HandshakeOpcode(28, -2);
	aClass404_4587 = new HandshakeOpcode(29, -2);
	aClass404_4582 = new HandshakeOpcode(30, -2);
	aClass404_4588 = new HandshakeOpcode(31, 4);
	aClass404Array4591 = new HandshakeOpcode[32];
	HandshakeOpcode[] class404s = Class224.method3171(-945777630);
	for (int i = 0; i < class404s.length; i++)
	    aClass404Array4591[-257442419 * class404s[i].anInt4590]
		= class404s[i];
    }
    
    HandshakeOpcode(int i, int i_0_) {
	anInt4590 = i * 268488005;
    }
    
    public static Class594[] method4862(int i) {
	return (new Class594[]
		{ Class594.aClass594_7756, Class594.aClass594_7757,
		  Class594.aClass594_7758 });
    }
    
    public static void method4863(int i, int i_1_) {
	Class275.method3706(new Class567(i), (byte) -24);
    }
    
    static final void method4864(Class648 class648, int i) {
	int i_2_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class646 class646;
	if (((Class648) class648).aBool8418)
	    class646 = ((Class648) class648).aClass646_8406;
	else
	    class646 = ((Class648) class648).aClass646_8392;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class646.method7701(i_2_, -1, (byte) 0) ? 1 : 0;
    }
    
    static final void method4865(Class648 class648, int i) {
	int i_3_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_3_, (byte) -105);
	Class226 class226 = Class380.aClass226Array3970[i_3_ >> 16];
	Class636.method7570(class229, class226, class648, -149979028);
    }
    
    static final void method4866(Class648 class648, short i) {
	((Class648) class648).anInt8395 -= 661123364;
	int i_4_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395]);
	int i_5_ = (((Class648) class648).anIntArray8394
		    [1 + 717927929 * ((Class648) class648).anInt8395]);
	int i_6_ = (((Class648) class648).anIntArray8394
		    [2 + 717927929 * ((Class648) class648).anInt8395]);
	int i_7_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395 + 3]);
	Class7 class7
	    = (Class7) Class551.aClass5_Sub17_7422.method63(i_6_, 1703541051);
	if (class7.aClass459_131.method68() != i_4_
	    || class7.aClass459_129.method68() != i_5_)
	    throw new RuntimeException(new StringBuilder().append(i_6_).append
					   (" ").append
					   (i_7_).toString());
	if (i_5_ == Class459.aClass459_5132.method68())
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= class7.method551(i_7_, -1773627188);
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= class7.method561(i_7_, -1308647895);
    }
    
    static final void method4867(Class648 class648, int i) {
	int i_8_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class602_Sub1 class602_sub1 = Class209.method2936(i_8_, 1986213715);
	if (class602_sub1 != null) {
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -736802669 * class602_sub1.anInt7877;
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= class602_sub1.aString10629;
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= class602_sub1.method9583(-1662118441);
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= class602_sub1.method9584(2084264055);
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 1759698505 * class602_sub1.anInt7873;
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 1955028611 * class602_sub1.anInt10627;
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= class602_sub1.aString10630;
	} else {
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -1;
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
	}
    }
    
    static final void method4868(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class691_Sub32.aClass216_10805.method3019(1361729515);
    }
    
    static void method4869(int i, String string, boolean bool, int i_9_) {
	Class382.method4727((byte) -94);
	Class530.method6465((byte) -17);
	Class552.method6717(-2009900446);
	Class50.method893(i, string, bool, (byte) -11);
	Class625.aClass414_8129.method4952(-360437767);
	Class625.aClass414_8129.method4932(client.anInterface50_10917,
					   -1264155512);
	Class625.aClass414_8129.method4944(-1231349685);
	Class169.method2101(Class587.aClass173_7714, 717927929);
	Class180.method2671(Class587.aClass173_7714,
			    Class623_Sub1.aClass446_10671, 1269668203);
	Class170.method2110((byte) -128);
	PlayerModel.method7298(1437347735);
	Class662.method7878(1119281887);
	if (8 == 175711435 * client.anInt10876)
	    Class487.method5890(6, 2130003981);
	else if (12 == 175711435 * client.anInt10876)
	    Class487.method5890(18, 2130003981);
	else if (175711435 * client.anInt10876 == 13)
	    Class487.method5890(19, 2130003981);
	else if (9 == client.anInt10876 * 175711435)
	    Class487.method5890(1, 2130003981);
	else if (client.anInt10876 * 175711435 == 5
		 || 15 == client.anInt10876 * 175711435)
	    Class633.method7557((byte) 21);
	else if (14 == client.anInt10876 * 175711435)
	    Class487.method5890(16, 2130003981);
	else if (client.anInt10876 * 175711435 == 1)
	    Class50.method894(false, (byte) 63);
    }
    
    static void method4870(byte i) {
	if (Class26.method708((short) -27909)) {
	    if (null == Class99.aStringArray1259)
		Class635.method7562(2117221375);
	    Class99.aBool1266 = true;
	    Class99.anInt1265 = 0;
	}
    }
    
    static boolean method4871(int i, byte i_10_) {
	return 13 == i || i == 19;
    }
    
    static final void method4872(Class648 class648, int i) {
	int i_11_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class109 class109 = Class591.method7078((byte) 51);
	Class528_Sub34 class528_sub34
	    = Class656.method7845(OutgoingOpcode.aClass403_4479,
				  class109.aClass10_1379, -2019990923);
	class528_sub34.aClass528_Sub42_Sub2_10481.writeByte(i_11_, (byte) 65);
	class109.method1380(class528_sub34, 977531200);
    }
}
