/* Class666 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class666 implements IClientEnum
{
    public static Class666 aClass666_8476;
    public static Class666 aClass666_8477;
    public byte aByte8478;
    public static Class666 aClass666_8479;
    public static Class666 aClass666_8480;
    public static Class666 aClass666_8481 = new Class666(0, (byte) -1);
    public static final int anInt8482 = 4;
    public int anInt8483;
    
    public int method7899() {
	return aByte8478 + 1;
    }
    
    Class666(int i, byte i_0_) {
	anInt8483 = 978611951 * i;
	aByte8478 = i_0_;
    }
    
    public int method68() {
	return aByte8478;
    }
    
    public int method7900(int i) {
	return aByte8478 + 1;
    }
    
    public int method6() {
	return aByte8478;
    }
    
    public int method5() {
	return aByte8478;
    }
    
    static final void method7901(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class513.method6273(class229, class226, class648, (short) 27532);
    }
    
    public int method72() {
	return aByte8478;
    }
    
    public int method73() {
	return aByte8478;
    }
    
    static {
	aClass666_8477 = new Class666(1, (byte) 0);
	aClass666_8476 = new Class666(2, (byte) 1);
	aClass666_8479 = new Class666(3, (byte) 2);
	aClass666_8480 = new Class666(4, (byte) 3);
    }
    
    public int method7902() {
	return aByte8478 + 1;
    }
    
    public int method71() {
	return aByte8478;
    }
    
    public static void method7903(int i) {
	Class528_Sub41.method9600(-1543540343);
	Class28.aBool273 = false;
	Class171.method2117(-2002292621 * Class32.anInt309,
			    Class25.anInt239 * 684569813,
			    Class369.anInt3868 * 385971415,
			    Class528_Sub24.anInt10419 * -1024694809,
			    (byte) -33);
	Class28.aClass528_Sub21_Sub11_271 = null;
	Class587.aClass528_Sub21_Sub11_7715 = null;
    }
    
    public static Class666[] method7904(int i) {
	return new Class666[] { aClass666_8481, aClass666_8477, aClass666_8476,
				aClass666_8479, aClass666_8480 };
    }
    
    public static String method7905(int i, short i_1_) {
	return new StringBuilder().append("<col=").append
		   (Integer.toHexString(i)).append
		   (">").toString();
    }
    
    static final int method7906
	(Entity class645_sub1_sub5_sub1, int i) {
	if (0 == -1980826395 * class645_sub1_sub5_sub1.anInt11760)
	    return 0;
	if (-1 != -1378983465 * class645_sub1_sub5_sub1.anInt11780) {
	    Entity class645_sub1_sub5_sub1_2_ = null;
	    if (class645_sub1_sub5_sub1.anInt11780 * -1378983465 < 32768) {
		Class528_Sub31 class528_sub31
		    = ((Class528_Sub31)
		       (client.aClass692_11110.method8137
			((long) (-1378983465
				 * class645_sub1_sub5_sub1.anInt11780))));
		if (class528_sub31 != null)
		    class645_sub1_sub5_sub1_2_
			= ((Entity)
			   class528_sub31.anObject10468);
	    } else if (-1378983465 * class645_sub1_sub5_sub1.anInt11780
		       >= 32768)
		class645_sub1_sub5_sub1_2_
		    = (client.localPlayers
		       [(-1378983465 * class645_sub1_sub5_sub1.anInt11780
			 - 32768)]);
	    if (class645_sub1_sub5_sub1_2_ != null) {
		Class422 class422
		    = Class422.method5065((class645_sub1_sub5_sub1.method7693()
					   .aClass422_4868),
					  class645_sub1_sub5_sub1_2_
					      .method7693().aClass422_4868);
		int i_3_ = (int) class422.aFloat4780;
		int i_4_ = (int) class422.aFloat4777;
		if (i_3_ != 0 || 0 != i_4_)
		    class645_sub1_sub5_sub1.method10691
			((int) (Math.atan2((double) i_3_, (double) i_4_)
				* 2607.5945876176133) & 0x3fff,
			 (byte) -3);
	    }
	}
	if (class645_sub1_sub5_sub1 instanceof Player) {
	    Player class645_sub1_sub5_sub1_sub2
		= (Player) class645_sub1_sub5_sub1;
	    if (1063002723 * class645_sub1_sub5_sub1_sub2.facingDirection != -1
		&& (0 == class645_sub1_sub5_sub1_sub2.quenedStepCount * 540774833
		    || (class645_sub1_sub5_sub1_sub2.anInt11816 * -1425109313
			> 0))) {
		class645_sub1_sub5_sub1_sub2.method10691
		    (class645_sub1_sub5_sub1_sub2.facingDirection * 1063002723,
		     (byte) -24);
		class645_sub1_sub5_sub1_sub2.facingDirection = -2102619979;
	    }
	} else if (class645_sub1_sub5_sub1
		   instanceof NPC) {
	    NPC class645_sub1_sub5_sub1_sub1
		= (NPC) class645_sub1_sub5_sub1;
	    if (2029712189 * class645_sub1_sub5_sub1_sub1.anInt12031 != -1
		&& (0 == class645_sub1_sub5_sub1_sub1.quenedStepCount * 540774833
		    || (-1425109313 * class645_sub1_sub5_sub1_sub1.anInt11816
			> 0))) {
		Class422 class422
		    = class645_sub1_sub5_sub1_sub1.method7693().aClass422_4868;
		Class578 class578
		    = client.gameScene.method5966(1273279609);
		int i_5_
		    = ((int) class422.aFloat4780
		       - (class645_sub1_sub5_sub1_sub1.anInt12031 * -84722432
			  - class578.anInt7607 * 1322049792
			  - 1322049792 * class578.anInt7607));
		int i_6_
		    = ((int) class422.aFloat4777
		       - (952672512 * class645_sub1_sub5_sub1_sub1.anInt12032
			  - class578.anInt7608 * -1547018496
			  - -1547018496 * class578.anInt7608));
		if (0 != i_5_ || i_6_ != 0)
		    class645_sub1_sub5_sub1_sub1.method10691
			((int) (Math.atan2((double) i_5_, (double) i_6_)
				* 2607.5945876176133) & 0x3fff,
			 (byte) -33);
		class645_sub1_sub5_sub1_sub1.anInt12031 = -327351317;
	    }
	}
	return class645_sub1_sub5_sub1.method10664(-800979449);
    }
    
    static void method7907(ByteBuffer class528_sub42, int i, byte i_7_) {
	if (null != Class509.aClass22_6947) {
	    try {
		Class509.aClass22_6947.method678(0L);
		Class509.aClass22_6947.method668((class528_sub42
						  .payload),
						 i, 24, (byte) 40);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    public static final void method7908(boolean bool, int i) {
	if (!bool) {
	    Class160.aClass5_Sub11_1805.method536((byte) 21);
	    Class224.aClass5_Sub18_2330.method536((byte) 10);
	    ISAACCipher.aClass5_Sub7_157.method536((byte) -10);
	    client.gameScene.method5976((short) 6853)
		.method536((byte) 26);
	    Class21.aClass5_Sub8_214.method536((byte) 87);
	    Class18.aClass5_Sub13_206.method536((byte) -12);
	    Class379.aClass5_Sub4_3966.method536((byte) -36);
	    Class2.aClass5_Sub12_24.method536((byte) -40);
	    Class5_Sub7.aClass5_Sub5_10838.method536((byte) 27);
	    Class691_Sub20.aClass95_Sub1_Sub2_10751.method10297(-1336971301);
	    Class664.aClass95_Sub1_Sub1_8460.method10283(1275908932);
	    Class320.aClass95_Sub1_Sub1_3466.method10283(1980504753);
	    Class181_Sub20.aClass95_Sub1_Sub1_9866.method10283(1428558205);
	    Class237.aClass95_Sub1_Sub1_2601.method10283(932571170);
	    Class147.aClass5_Sub14_1673.method536((byte) 77);
	    Class316_Sub3.aClass5_Sub16_10053.method536((byte) 14);
	    Class208.aClass5_Sub6_2238.method536((byte) -22);
	    Class208.aClass5_Sub10_2239.method536((byte) 24);
	    Class317_Sub1.aClass5_Sub1_9957.method536((byte) 19);
	    Class243.aClass5_Sub2_2730.method536((byte) -33);
	    Class57.aClass5_Sub22_686.method536((byte) -50);
	    Class525.aClass5_Sub20_7075.method536((byte) -16);
	    Class581.aClass5_Sub19_7649.method536((byte) -8);
	    Class533.aClass5_Sub9_7133.method536((byte) -13);
	    Class605.method7205(-359272332);
	    Class317_Sub1.method9060(-1893781528);
	    Class625.aClass414_8129.method4944(-1231349685);
	    Class647.method7713(1237138446);
	    if (Class646.aClass665_8386 != ModeWhere.LIVE) {
		for (int i_8_ = 0; i_8_ < Class58.aByteArrayArray707.length;
		     i_8_++)
		    Class58.aByteArrayArray707[i_8_] = null;
		client.anInt10883 = 0;
	    }
	    client.gameScene.method5975(-75570905)
		.method7513((byte) -71);
	    Class148_Sub1.method8267((byte) -38);
	    Class287.method3864((byte) 1);
	    Class646.aClass392_8387.method4797((byte) -17);
	    Class90.aClass393_1144.method4801(-319558501);
	    Class634.aClass186_8205.method2731(-1970019897);
	    client.aClass186_10977.method2731(-1417006623);
	    client.aClass186_10915.method2731(-1647678774);
	    client.aClass186_11173.method2731(-946923314);
	}
	Class556.method6756(-532003458);
	Class59.method996(2121183007);
    }
}
