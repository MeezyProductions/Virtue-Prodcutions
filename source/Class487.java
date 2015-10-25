/* Class487 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class487
{
    public int anInt5487;
    public int anInt5488;
    public int anInt5489;
    public int anInt5490;
    byte aByte5491;
    public int anInt5492;
    public static ByteBuffer aClass528_Sub42_5493;
    static int anInt5494;
    
    public int method5884() {
	return ((Class487) this).aByte5491 & 0x7;
    }
    
    public Class487(ByteBuffer class528_sub42, Class95_Sub1 class95_sub1) {
	((Class487) this).aByte5491 = class528_sub42.method9627(-1540763032);
	anInt5489 = class528_sub42.readUnsignedShort(-143461694) * -1578619351;
	anInt5487 = class528_sub42.readInt(1194265733) * -1600339829;
	anInt5490 = class528_sub42.readInt(-1654533346) * 822988903;
	anInt5488 = class528_sub42.readInt(-229339000) * 1042167931;
	anInt5492 = class528_sub42.readInt(-1262460970) * -1471448547;
	if (class95_sub1 != null)
	    Class658.method7856(class528_sub42, class95_sub1, 1004829212);
    }
    
    public int method5885(byte i) {
	return ((Class487) this).aByte5491 & 0x7;
    }
    
    public int method5886(byte i) {
	return 8 == (((Class487) this).aByte5491 & 0x8) ? 1 : 0;
    }
    
    public int method5887() {
	return 8 == (((Class487) this).aByte5491 & 0x8) ? 1 : 0;
    }
    
    public int method5888() {
	return 8 == (((Class487) this).aByte5491 & 0x8) ? 1 : 0;
    }
    
    public Class487() {
	/* empty */
    }
    
    public static String method5889(CharSequence charsequence, Class77 class77,
				    byte i) {
	if (null == charsequence)
	    return null;
	int i_0_ = 0;
	int i_1_;
	for (i_1_ = charsequence.length();
	     (i_0_ < i_1_
	      && Class82.method1150(charsequence.charAt(i_0_), -1868168299));
	     i_0_++) {
	    /* empty */
	}
	for (/**/;
	     i_1_ > i_0_ && Class82.method1150(charsequence.charAt(i_1_ - 1),
					       -1897941042);
	     i_1_--) {
	    /* empty */
	}
	int i_2_ = i_1_ - i_0_;
	if (i_2_ < 1 || i_2_ > Class414.method4960(class77, 1465390541))
	    return null;
	StringBuilder stringbuilder = new StringBuilder(i_2_);
	for (int i_3_ = i_0_; i_3_ < i_1_; i_3_++) {
	    char c = charsequence.charAt(i_3_);
	    if (Class327.method4261(c, 2028127237)) {
		char c_4_ = Class63.method1040(c, -615598099);
		if ('\0' != c_4_)
		    stringbuilder.append(c_4_);
	    }
	}
	if (stringbuilder.length() == 0)
	    return null;
	return stringbuilder.toString();
    }
    
    public static void method5890(int i, int i_5_) {
	if (client.anInt10876 * 175711435 != i) {
	    client.anInt11023 = 0;
	    if (client.anInt10876 * 175711435 == 9 && 1 != i)
		Class423.method5108((byte) 1);
	    if (17 == i || 7 == i)
		Class578.method6914(1543345989);
	    if (17 != i && Class225.aClass551_2334 != null) {
		Class225.aClass551_2334.method6694(-1051249221);
		Class225.aClass551_2334 = null;
	    }
	    if (i == 8)
		Class383.method4730((client.anInt10876 * 175711435 == 14
				     || 4 == client.anInt10876 * 175711435
				     || (2088127151 * client.anInt10978
					 != (Class184.aClass622_2103.anInt8082
					     * 1531545937))),
				    -1069500197);
	    if (i == 12) {
		boolean bool;
		if (-1 == -423058361 * Class184.aClass622_2103.anInt8107)
		    bool = (10 == 175711435 * client.anInt10876
			    || 175711435 * client.anInt10876 == 0);
		else
		    bool = (client.anInt10978 * 2088127151
			    != -423058361 * Class184.aClass622_2103.anInt8107);
		Class460.method5585(bool, -1965307879);
	    }
	    if (i == 10 || i == 0) {
		if (!Class72.method1102((byte) 35))
		    return;
	    } else if (2 == i
		       || i == 13 && 19 != client.anInt10876 * 175711435) {
		if (!Class578.method6914(1543345989))
		    return;
	    } else if (i == 4)
		Class97.method1290(-1818663371);
	    if (Class667.method7910(i, 427984074))
		client.aClass495_10935.method6034(-1787321341);
	    if (1 == i || 8 == i)
		Class592.method7081((short) 23022);
	    boolean bool = (i == 15 || ScenePacketType.method4846(i, 301297712)
			    || Class309.method4127(i, 2130436643));
	    boolean bool_6_
		= (client.anInt10876 * 175711435 == 15
		   || ScenePacketType.method4846(client.anInt10876 * 175711435,
					  676214256)
		   || Class309.method4127(175711435 * client.anInt10876,
					  2130436643));
	    if (bool != bool_6_)
		Class700.aClass454_8734.method5464(!bool, (byte) 20);
	    if (Class667.method7910(i, 1595190395) || 17 == i || i == 7)
		Class587.aClass173_7714.method2186();
	    client.anInt10876 = -779018013 * i;
	}
    }
    
    public static int method5891(int i) {
	return Canvas_Sub1.aTwitchTV11693.GetChatState();
    }
    
    static final void method5892(Class648 class648, byte i) {
	((Class648) class648).aClass387_8404 = new Class387();
	((Class648) class648).aClass387_8404.anInt4071
	    = ((((Class648) class648).anIntArray8394
		[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	       * 2108924067);
	((Class648) class648).aClass387_8404.aClass528_Sub21_Sub4_4070
	    = Class33.aClass46_314.method861(((((Class648) class648)
					       .aClass387_8404.anInt4071)
					      * -1007414517),
					     (byte) -18);
	((Class648) class648).aClass387_8404.anIntArray4072
	    = new int[((Class648) class648).aClass387_8404
			  .aClass528_Sub21_Sub4_4070.method10467(-1702556922)];
    }
}
