/* Class691_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class691_Sub35 extends Class691
{
    public static final int anInt10830 = 3;
    public static final int anInt10831 = 4;
    public static final int anInt10832 = 2;
    public static final int anInt10833 = 1;
    public static final int anInt10834 = 0;
    
    public int method10139() {
	return -1318047113 * anInt8681;
    }
    
    public void method10140() {
	if (anInt8681 * -1318047113 < 0 || -1318047113 * anInt8681 > 4)
	    anInt8681 = method8125(-1699475340) * -1594538169;
    }
    
    public void method10141(byte i) {
	if (anInt8681 * -1318047113 < 0 || -1318047113 * anInt8681 > 4)
	    anInt8681 = method8125(1464016928) * -1594538169;
    }
    
    int method8125(int i) {
	return 0;
    }
    
    int method8126(int i, int i_0_) {
	return 1;
    }
    
    void method8128(int i, byte i_1_) {
	anInt8681 = -1594538169 * i;
    }
    
    public int method10142(short i) {
	return -1318047113 * anInt8681;
    }
    
    int method8129() {
	return 0;
    }
    
    public Class691_Sub35(Class528_Sub38 class528_sub38) {
	super(class528_sub38);
    }
    
    int method8130() {
	return 0;
    }
    
    void method8132(int i) {
	anInt8681 = -1594538169 * i;
    }
    
    int method8127(int i) {
	return 1;
    }
    
    public void method10143() {
	if (anInt8681 * -1318047113 < 0 || -1318047113 * anInt8681 > 4)
	    anInt8681 = method8125(-322346538) * -1594538169;
    }
    
    void method8131(int i) {
	anInt8681 = -1594538169 * i;
    }
    
    public int method10144() {
	return -1318047113 * anInt8681;
    }
    
    public Class691_Sub35(int i, Class528_Sub38 class528_sub38) {
	super(i, class528_sub38);
    }
    
    static void method10145(int i, int i_2_, Class229 class229,
			    Class148 class148, int i_3_, int i_4_, byte i_5_) {
	int i_6_ = GPI.localPlayerCount * 1087758653;
	int[] is = GPI.localPlayerIndicies;
	for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
	    Player class645_sub1_sub5_sub1_sub2
		= client.localPlayers[is[i_7_]];
	    if (class645_sub1_sub5_sub1_sub2 != null
		&& class645_sub1_sub5_sub1_sub2.method10924((byte) 117)
		&& !class645_sub1_sub5_sub1_sub2.hidden
		&& (class645_sub1_sub5_sub1_sub2
		    != Class108.myPlayer)
		&& (class645_sub1_sub5_sub1_sub2.aByte10675
		    == (Class108.myPlayer
			.aByte10675))) {
		Class422 class422
		    = class645_sub1_sub5_sub1_sub2.method7693().aClass422_4868;
		int i_8_ = (int) class422.aFloat4780 / 128 - i / 128;
		int i_9_ = (int) class422.aFloat4777 / 128 - i_2_ / 128;
		boolean bool = false;
		for (int i_10_ = 0; i_10_ < -1314218023 * client.anInt11157;
		     i_10_++) {
		    Class62 class62 = client.aClass62Array11160[i_10_];
		    if (class645_sub1_sub5_sub1_sub2.displayUnfiltered
			    .equals(class62.aString720)
			&& 0 != 1761252257 * class62.anInt714) {
			bool = true;
			break;
		    }
		}
		boolean bool_11_ = false;
		for (int i_12_ = 0; i_12_ < 1502735135 * Class667.anInt8488;
		     i_12_++) {
		    if (class645_sub1_sub5_sub1_sub2.displayUnfiltered.equals
			(Class5_Sub19.aClass89Array10849[i_12_].aString1134)) {
			bool_11_ = true;
			break;
		    }
		}
		boolean bool_13_ = false;
		if ((Class108.myPlayer.teamId
		     * 1050310403) != 0
		    && (class645_sub1_sub5_sub1_sub2.teamId * 1050310403
			!= 0)
		    && (class645_sub1_sub5_sub1_sub2.teamId * 1050310403
			== (Class108.myPlayer
			    .teamId) * 1050310403))
		    bool_13_ = true;
		if (null != class645_sub1_sub5_sub1_sub2.model
		    && (class645_sub1_sub5_sub1_sub2.model.anInt7968
			* 674438203) != -1
		    && ((Class299) (Class21.aClass5_Sub8_214.method63
				    (674438203 * (class645_sub1_sub5_sub1_sub2
						  .model.anInt7968),
				     1361535375))).aBool3295)
		    Class302.method4031(class229, class148, i_3_, i_4_, i_8_,
					i_9_, Class482.aClass151Array5471[1],
					(short) -12033);
		else if (class645_sub1_sub5_sub1_sub2.aClass213_12066
			 == Class213.aClass213_2251)
		    Class302.method4031(class229, class148, i_3_, i_4_, i_8_,
					i_9_, Class482.aClass151Array5471[8],
					(short) -20801);
		else if (Class213.aClass213_2252
			 == class645_sub1_sub5_sub1_sub2.aClass213_12066)
		    Class302.method4031(class229, class148, i_3_, i_4_, i_8_,
					i_9_, Class482.aClass151Array5471[6],
					(short) -12161);
		else if (bool_13_)
		    Class302.method4031(class229, class148, i_3_, i_4_, i_8_,
					i_9_, Class482.aClass151Array5471[4],
					(short) -30433);
		else if (class645_sub1_sub5_sub1_sub2.inClan)
		    Class302.method4031(class229, class148, i_3_, i_4_, i_8_,
					i_9_, Class482.aClass151Array5471[7],
					(short) 2246);
		else if (bool)
		    Class302.method4031(class229, class148, i_3_, i_4_, i_8_,
					i_9_, Class482.aClass151Array5471[3],
					(short) -8159);
		else if (bool_11_)
		    Class302.method4031(class229, class148, i_3_, i_4_, i_8_,
					i_9_, Class482.aClass151Array5471[5],
					(short) -29935);
		else
		    Class302.method4031(class229, class148, i_3_, i_4_, i_8_,
					i_9_, Class482.aClass151Array5471[2],
					(short) -2166);
	    }
	}
    }
}
