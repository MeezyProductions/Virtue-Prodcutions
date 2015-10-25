/* GPI - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class GPI
{
    static byte[] aByteArray1194;
    static final int anInt1195 = 1;
    static int[] outsidePlayerIndicies;
    static final int anInt1197 = 2;
    static ByteBuffer[] cachedAppearances;
    static ByteBuffer[] cachedHeadIcons;
    public static int localPlayerCount;
    static int[] localPlayerIndicies;
    static int outsidePlayerCount;
    static byte[] skipFlags;
    static Class48[] aClass48Array1204;
    static int maskCount;
    static int[] anIntArray1206;
    static boolean $assertionsDisabled
	= !GPI.class.desiredAssertionStatus();
    
    static final void method1231(BitBuffer class528_sub42_sub2) {
	class528_sub42_sub2.setBitAccess(456456071);
	int i = -1453744879 * client.anInt11025;
	Player class645_sub1_sub5_sub1_sub2
	    = (Class108.myPlayer
	       = client.localPlayers[i]
	       = new Player(client.aClass495_10935
						      .method5973((byte) 44)));
	class645_sub1_sub5_sub1_sub2.anInt11783 = 1791366607 * i;
	int i_0_ = class528_sub42_sub2.readBits(30, (byte) -118);
	byte i_1_ = (byte) (i_0_ >> 28);
	int i_2_ = i_0_ >> 14 & 0x3fff;
	int i_3_ = i_0_ & 0x3fff;
	Class578 class578 = client.aClass495_10935.method5966(1273279609);
	class645_sub1_sub5_sub1_sub2.sceneXQueue[0]
	    = i_2_ - 961465569 * class578.anInt7607;
	class645_sub1_sub5_sub1_sub2.sceneYQueue[0]
	    = i_3_ - class578.anInt7608 * -173815201;
	class645_sub1_sub5_sub1_sub2.method7682
	    ((float) ((class645_sub1_sub5_sub1_sub2.sceneXQueue[0] << 9)
		      + (class645_sub1_sub5_sub1_sub2.method10671((byte) -32)
			 << 8)),
	     (class645_sub1_sub5_sub1_sub2.method7683().aClass422_4868
	      .aFloat4776),
	     (float) ((class645_sub1_sub5_sub1_sub2.sceneYQueue[0] << 9)
		      + (class645_sub1_sub5_sub1_sub2.method10671((byte) -33)
			 << 8)));
	Class181_Sub5.anInt9778
	    = (class645_sub1_sub5_sub1_sub2.aByte10675
	       = class645_sub1_sub5_sub1_sub2.aByte10674 = i_1_) * -1552384519;
	if (client.aClass495_10935.method6006((byte) 0).method5633
	    (class645_sub1_sub5_sub1_sub2.sceneXQueue[0],
	     class645_sub1_sub5_sub1_sub2.sceneYQueue[0], (short) -765))
	    class645_sub1_sub5_sub1_sub2.aByte10674++;
	if (cachedAppearances[i] != null)
	    class645_sub1_sub5_sub1_sub2
		.decodeCharacterData(cachedAppearances[i], -761854823);
	if (cachedHeadIcons[i] != null)
	    class645_sub1_sub5_sub1_sub2
		.decodeHeadIcons(cachedHeadIcons[i], (byte) -55);
	localPlayerCount = 0;
	localPlayerIndicies[(localPlayerCount += -125633003) * 1087758653 - 1] = i;
	skipFlags[i] = (byte) 0;
	outsidePlayerCount = 0;
	for (int i_4_ = 1; i_4_ < 2048; i_4_++) {
	    if (i_4_ != i) {
		int i_5_ = class528_sub42_sub2.readBits(18, (byte) -54);
		int i_6_ = i_5_ >> 16 & 0x3;
		int i_7_ = i_5_ >> 8 & 0xff;
		int i_8_ = i_5_ & 0xff;
		Class48 class48 = aClass48Array1204[i_4_] = new Class48();
		((Class48) class48).anInt545
		    = (i_8_ + ((i_6_ << 28) + (i_7_ << 14))) * 1856682187;
		((Class48) class48).anInt542 = 0;
		((Class48) class48).anInt544 = 937036513;
		((Class48) class48).aClass213_543 = Class213.aClass213_2250;
		((Class48) class48).aBool546 = false;
		outsidePlayerIndicies[(outsidePlayerCount += -396107679) * 1661387681 - 1]
		    = i_4_;
		skipFlags[i_4_] = (byte) 0;
	    }
	}
	class528_sub42_sub2.setByteAccess(874087544);
	Class297 class297
	    = Class495.aClass283_Sub1_5578.method3787((byte) -78);
	if (class297 == Class297.aClass297_3251) {
	    Class326_Sub1 class326_sub1
		= ((Class326_Sub1)
		   Class495.aClass283_Sub1_5578.method3811(498165326));
	    class326_sub1.method9094(838161427);
	}
	Class294 class294 = Class495.aClass283_Sub1_5578.method3786((byte) 16);
	if (Class294.aClass294_3225 == class294) {
	    Class684_Sub1 class684_sub1
		= ((Class684_Sub1)
		   Class495.aClass283_Sub1_5578.method3785((byte) -12));
	    class684_sub1.method10055((byte) 1);
	}
    }
    
    static {
	skipFlags = new byte[2048];
	aByteArray1194 = new byte[2048];
	cachedAppearances = new ByteBuffer[2048];
	cachedHeadIcons = new ByteBuffer[2048];
	localPlayerCount = 0;
	localPlayerIndicies = new int[2048];
	outsidePlayerCount = 0;
	outsidePlayerIndicies = new int[2048];
	aClass48Array1204 = new Class48[2048];
	maskCount = 0;
	anIntArray1206 = new int[2048];
    }
    
    GPI() throws Throwable {
	throw new Error();
    }
    
    static final void method1232(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class229.anInt2424 * 1748557977;
    }
    
    static final void method1233(Class229 class229, Class648 class648,
				 byte i) {
	Class1 class1
	    = class229.method3193(Class625.aClass414_8129,
				  client.anInterface50_10917, (byte) -94);
	int i_9_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	int i_10_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	int i_11_
	    = class1.method505(class229.aString2455,
			       class229.anInt2476 * -1352480433,
			       class229.anInt2380 * -1557508349, i_10_, i_9_,
			       Class298.aClass151Array3262, (byte) -48);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = i_11_;
    }
    
    static final void method1234(Class648 class648, int i) {
	int i_12_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if (client.anInt11158 * 1234694097 != 0
	    && i_12_ < -1924608781 * client.anInt11024) {
	    Class33 class33 = client.aClass33Array11164[i_12_];
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= class33.aString311;
	    if (class33.aString313 != null)
		((Class648) class648).anObjectArray8396
		    [((((Class648) class648).anInt8410 += 1600226731)
		      * -520794877) - 1]
		    = class33.aString313;
	    else
		((Class648) class648).anObjectArray8396
		    [((((Class648) class648).anInt8410 += 1600226731)
		      * -520794877) - 1]
		    = "";
	} else {
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
	}
    }
    
    static final void method1235(Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	int i_13_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = new StringBuilder().append(string).append(i_13_).toString();
    }
    
    static final void method1236(Class648 class648, short i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = -880156985 * Class54.anInt679;
    }
    
    static final void method1237(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class211.method2959(class229, class226, class648, 1147482569);
    }
}
