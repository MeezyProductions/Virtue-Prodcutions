/* Class481 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class481
{
    public static Class481 aClass481_5456;
    static Class481 aClass481_5457;
    public static Class481 aClass481_5458;
    static Class481 aClass481_5459 = new Class481();
    static Interface22 anInterface22_5460;
    public static Class446 aClass446_5461;
    
    Class481() {
	/* empty */
    }
    
    static {
	aClass481_5456 = new Class481();
	aClass481_5458 = new Class481();
	aClass481_5457 = new Class481();
    }
    
    public static void method5856(int i, short i_0_) {
	synchronized (PlayerModel.aClass186_7972) {
	    PlayerModel.aClass186_7972.method2747(i, -571044039);
	}
	synchronized (PlayerModel.aClass186_7971) {
	    PlayerModel.aClass186_7971.method2747(i, 963244271);
	}
    }
    
    static void method5857(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [717927929 * ((Class648) class648).anInt8395 - 2]
	    = (((Class256)
		(Class669.aClass25_Sub1_8522.method63
		 ((((Class648) class648).anIntArray8394
		   [717927929 * ((Class648) class648).anInt8395 - 2]),
		  -1170873969)))
		   .method3460
	       (Class570.playerVarsProvider,
		(((Class648) class648).anIntArray8394
		 [717927929 * ((Class648) class648).anInt8395 - 1]),
		1931547582)) ? 1 : 0;
	((Class648) class648).anInt8395 -= 1239022665;
    }
    
    static final void method5858(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_1_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_2_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929 + 1]);
	ItemType itemType
	    = (ItemType) Class18.aClass5_Sub13_206.method63(i_1_, 805277958);
	if (i_2_ >= 1 && i_2_ <= 5 && itemType.aStringArray55[i_2_ - 1] != null)
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= itemType.aStringArray55[i_2_ - 1];
	else
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
    }
    
    public static void method5859(int i) {
	if (Class12.aBool184) {
	    if (-1123967805 * Class12.anInt173
		< Class604.anInt7889 * 973177359)
		Class12.anInt173 = Class604.anInt7889 * 1315872965;
	    while (-1123967805 * Class12.anInt173
		   < -1941954941 * Class533.anInt7132) {
		Class602_Sub1 class602_sub1
		    = Class209.method2936(Class12.anInt173 * -1123967805,
					  2144148604);
		if (null == class602_sub1
		    || -1 != class602_sub1.anInt10627 * 1955028611)
		    Class12.anInt173 += 233370603;
		else {
		    if (Class12.aClass652_181 == null)
			Class12.aClass652_181
			    = (client.aClass631_10885.method7533
			       (class602_sub1.aString10630, (byte) -6));
		    int i_3_ = Class12.aClass652_181.anInt8426 * -1617466425;
		    if (i_3_ == -1)
			break;
		    class602_sub1.anInt10627 = 1179017259 * i_3_;
		    Class12.anInt173 += 233370603;
		    Class12.aClass652_181 = null;
		}
	    }
	}
    }
    
    public static final void method5860(String string, int i) {
	if (!string.equals("")) {
	    Class109 class109 = Class591.method7078((byte) 73);
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4516,
				      class109.aClass10_1379, -1897063457);
	    class528_sub34.aClass528_Sub42_Sub2_10481
		.writeByte(Class14.method627(string, -619728793), (byte) -38);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeString(string,
								 -1936289654);
	    class109.method1380(class528_sub34, 909878729);
	}
    }
    
    public static void method5861(int i, short i_4_) {
	ClientPacket class528_sub21_sub7
	    = Class79.method1146(5, (long) i);
	class528_sub21_sub7.method10495(-664031142);
    }
}
