/* Class194 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class194
{
    int[] anIntArray2174;
    static final int anInt2175 = 2;
    static final int anInt2176 = 0;
    int[] anIntArray2177;
    
    Class194(ByteBuffer class528_sub42) {
	int i = class528_sub42.method9719(65280);
	((Class194) this).anIntArray2177 = new int[i];
	((Class194) this).anIntArray2174 = new int[i];
	for (int i_0_ = 0; i_0_ < i; i_0_++) {
	    int i_1_ = class528_sub42.readUnsignedByte((byte) 66);
	    ((Class194) this).anIntArray2177[i_0_] = i_1_;
	    int i_2_ = class528_sub42.readUnsignedShort(-1198413305);
	    int i_3_ = class528_sub42.readUnsignedShort(-169731242);
	    ((Class194) this).anIntArray2174[i_0_] = i_3_ + (i_2_ << 16);
	}
    }
    
    void method2805(Class182 class182, int i, int i_4_) {
	int i_5_ = ((Class194) this).anIntArray2174[0];
	class182.method2692(i, i_5_ >>> 16, i_5_ & 0xffff, -549411061);
	Entity class645_sub1_sub5_sub1
	    = class182.method2689(-1012043543);
	class645_sub1_sub5_sub1.quenedStepCount = 0;
	for (int i_6_ = ((Class194) this).anIntArray2177.length - 1; i_6_ >= 0;
	     i_6_--) {
	    int i_7_ = ((Class194) this).anIntArray2177[i_6_];
	    int i_8_ = ((Class194) this).anIntArray2174[i_6_];
	    class645_sub1_sub5_sub1.sceneXQueue
		[540774833 * class645_sub1_sub5_sub1.quenedStepCount]
		= i_8_ >> 16;
	    class645_sub1_sub5_sub1.sceneYQueue
		[540774833 * class645_sub1_sub5_sub1.quenedStepCount]
		= i_8_ & 0xffff;
	    byte i_9_ = Class666.aClass666_8476.aByte8478;
	    if (i_7_ == 0)
		i_9_ = Class666.aClass666_8477.aByte8478;
	    else if (2 == i_7_)
		i_9_ = Class666.aClass666_8479.aByte8478;
	    class645_sub1_sub5_sub1.moveTypeQueue
		[540774833 * class645_sub1_sub5_sub1.quenedStepCount]
		= i_9_;
	    class645_sub1_sub5_sub1.quenedStepCount += -670034095;
	}
    }
    
    static final void method2806(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	class229.anInt2403
	    = (((Class648) class648).anIntArray8394
	       [((Class648) class648).anInt8395 * 717927929]) * 87231603;
	class229.anInt2428
	    = 1658733331 * (((Class648) class648).anIntArray8394
			    [1 + 717927929 * ((Class648) class648).anInt8395]);
	Class39.method811(class229, 1435904523);
    }
    
    static void method2807(byte i) {
	Class98.anInt1252 = 0;
	Class98.anInt1244 = 1291913929;
	Class98.anInt1250 = 713309193;
	Class98.anInt1247 = -620673979;
    }
    
    static final void method2808(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub13_10587
		  .method9925((byte) 1);
    }
    
    static void method2809(int i) {
	Class54.aClass109_624.method1378((short) -12701);
	((Class109) Class54.aClass109_624).aClass528_Sub42_Sub2_1378.pointer
	    = 0;
	((Class109) Class54.aClass109_624).current = null;
	((Class109) Class54.aClass109_624).aClass396_1380 = null;
	((Class109) Class54.aClass109_624).aClass396_1385 = null;
	((Class109) Class54.aClass109_624).aClass396_1390 = null;
	((Class109) Class54.aClass109_624).anInt1383 = 0;
	((Class109) Class54.aClass109_624).anInt1394 = 0;
	client.anInt10889 = 0;
	Class297.method3987((byte) 64);
	Class528_Sub6.method9274(204457869);
	for (int i_10_ = 0; i_10_ < 2048; i_10_++)
	    client.localPlayers[i_10_] = null;
	Class108.myPlayer = null;
	for (int i_11_ = 0; i_11_ < client.anInt10921 * -693122579; i_11_++) {
	    Entity class645_sub1_sub5_sub1
		= ((Entity)
		   client.aClass528_Sub31Array10920[i_11_].anObject10468);
	    if (class645_sub1_sub5_sub1 != null)
		class645_sub1_sub5_sub1.anInt11780 = -1577001447;
	}
	Class650.method7741(-909704874);
	Class533.method6489(Class372.method4679(-1221913985), -1479803022);
	Class487.method5890(9, 2130003981);
	for (int i_12_ = 0; i_12_ < 102; i_12_++)
	    client.aBoolArray10855[i_12_] = true;
	Class388.method4769(Class54.aClass109_624, (byte) 86);
	Class208.aClass652_2240 = null;
	Class59.aLong708 = 0L;
	Class209.method2944(-1529799569);
	Class423.aClass141_Sub1_4785.method8270((byte) 0);
    }
    
    static final void method2810(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 733415573 * class229.anInt2517;
    }
    
    public static void method2811(Cs2Context cs2Context, int i, int i_13_,
				  Interface60 interface60, short i_14_) {
	Class648 class648 = Class528_Sub15_Sub1.method10454((byte) 10);
	((Class648) class648).anInterface60_8408 = interface60;
	Class5_Sub7.method10151(cs2Context, i, i_13_, class648, 1126395093);
	((Class648) class648).anInterface60_8408 = null;
    }
    
    static boolean method2812(int i) {
	return Class99.aBool1266;
    }
    
    public static void method2813(int i) {
	Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967
						  .aClass691_Sub17_10585),
						 2, 610757160);
	Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967
						  .aClass691_Sub17_10586),
						 2, 433550927);
	Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967
						  .aClass691_Sub4_10578),
						 1, 890129592);
	Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967
						  .aClass691_Sub23_10606),
						 1, 1678283656);
	Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967
						  .aClass691_Sub14_10570),
						 1, 1007531494);
	Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967
						  .aClass691_Sub11_10603),
						 1, 1889077419);
	Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967
						  .aClass691_Sub7_10589),
						 1, 1502324262);
	Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967
						  .aClass691_Sub12_10590),
						 1, 1165457177);
	Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967
						  .aClass691_Sub8_10565),
						 1, 1564195567);
	Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967
						  .aClass691_Sub2_10580),
						 1, -61811515);
	Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967
						  .aClass691_Sub15_10566),
						 0, 2037142780);
	Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967
						  .aClass691_Sub16_10576),
						 1, 1030816733);
	Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967
						  .aClass691_Sub27_10567),
						 0, -54898758);
	Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967
						  .aClass691_Sub27_10568),
						 0, 752294675);
	Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967
						  .aClass691_Sub5_10579),
						 1, 817011679);
	Class514.aClass528_Sub38_6967.method9556
	    (Class514.aClass528_Sub38_6967.aClass691_Sub10_10572,
	     -177612843 * Class279.aClass279_3055.anInt3059, 422337502);
	Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967
						  .aClass691_Sub19_10601),
						 0, 561722475);
	if (null != Class587.aClass173_7714
	    && Class587.aClass173_7714.method2164()
	    && Class587.aClass173_7714.method2271())
	    Class587.aClass173_7714.method2231();
	Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967
						  .aClass691_Sub22_10588),
						 1, 848398836);
	Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967
						  .aClass691_Sub25_10592),
						 1, 1060733277);
	Class49.method886((byte) 17);
	Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967
						  .aClass691_Sub13_10587),
						 1, 2105899012);
	Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967
						  .aClass691_Sub35_10597),
						 3, 1818354735);
	Class662.method7878(1119281887);
	client.aClass495_10935.method5975(-83259320).method7492(284229765);
	client.aBool10896 = true;
    }
    
    public static void method2814(String[] strings, short[] is, int i) {
	Class645_Sub1_Sub3_Sub2.method10778(strings, is, 0, strings.length - 1,
					    -461077314);
    }
}
