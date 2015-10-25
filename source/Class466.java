/* Class466 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class466
{
    public static final int anInt5306 = 2;
    static final int anInt5307 = 2;
    static final int anInt5308 = 2;
    public static final int anInt5309 = 4;
    public static final int anInt5310 = 8;
    static final int anInt5311 = 16;
    public byte[][][] aByteArrayArrayArray5312;
    
    public boolean method5630(int i, int i_0_, byte i_1_) {
	if (i < 0 || i_0_ < 0 || i >= aByteArrayArrayArray5312[3].length
	    || i_0_ >= aByteArrayArrayArray5312[3][i].length)
	    return false;
	return 0 != (aByteArrayArrayArray5312[3][i][i_0_] & 0x2);
    }
    
    public void method5631(int i) {
	for (int i_2_ = 0; i_2_ < aByteArrayArrayArray5312.length; i_2_++) {
	    for (int i_3_ = 0; i_3_ < aByteArrayArrayArray5312[0].length;
		 i_3_++) {
		for (int i_4_ = 0;
		     i_4_ < aByteArrayArrayArray5312[0][0].length; i_4_++)
		    aByteArrayArrayArray5312[i_2_][i_3_][i_4_] = (byte) 0;
	    }
	}
    }
    
    public boolean method5632(int i, int i_5_, int i_6_, int i_7_,
			      short i_8_) {
	if ((aByteArrayArrayArray5312[0][i_6_][i_7_] & 0x2) != 0)
	    return true;
	if ((aByteArrayArrayArray5312[i_5_][i_6_][i_7_] & 0x10) != 0)
	    return false;
	if (method5637(i_5_, i_6_, i_7_, -1616597004) == i)
	    return true;
	return false;
    }
    
    public boolean method5633(int i, int i_9_, short i_10_) {
	if (i < 0 || i_9_ < 0 || i >= aByteArrayArrayArray5312[1].length
	    || i_9_ >= aByteArrayArrayArray5312[1][i].length)
	    return false;
	if (0 != (aByteArrayArrayArray5312[1][i][i_9_] & 0x2))
	    return true;
	return false;
    }
    
    public boolean method5634(int i, int i_11_) {
	if (i < 0 || i_11_ < 0 || i >= aByteArrayArrayArray5312[1].length
	    || i_11_ >= aByteArrayArrayArray5312[1][i].length)
	    return false;
	if (0 != (aByteArrayArrayArray5312[1][i][i_11_] & 0x2))
	    return true;
	return false;
    }
    
    public Class466(int i, int i_12_, int i_13_) {
	aByteArrayArrayArray5312 = new byte[i][i_12_][i_13_];
    }
    
    public void method5635() {
	for (int i = 0; i < aByteArrayArrayArray5312.length; i++) {
	    for (int i_14_ = 0; i_14_ < aByteArrayArrayArray5312[0].length;
		 i_14_++) {
		for (int i_15_ = 0;
		     i_15_ < aByteArrayArrayArray5312[0][0].length; i_15_++)
		    aByteArrayArrayArray5312[i][i_14_][i_15_] = (byte) 0;
	    }
	}
    }
    
    public boolean method5636(int i, int i_16_) {
	if (i < 0 || i_16_ < 0 || i >= aByteArrayArrayArray5312[3].length
	    || i_16_ >= aByteArrayArrayArray5312[3][i].length)
	    return false;
	return 0 != (aByteArrayArrayArray5312[3][i][i_16_] & 0x2);
    }
    
    int method5637(int i, int i_17_, int i_18_, int i_19_) {
	if (0 != (aByteArrayArrayArray5312[i][i_17_][i_18_] & 0x8))
	    return 0;
	if (i > 0 && 0 != (aByteArrayArrayArray5312[1][i_17_][i_18_] & 0x2))
	    return i - 1;
	return i;
    }
    
    public boolean method5638(int i, int i_20_, int i_21_, int i_22_) {
	if ((aByteArrayArrayArray5312[0][i_21_][i_22_] & 0x2) != 0)
	    return true;
	if ((aByteArrayArrayArray5312[i_20_][i_21_][i_22_] & 0x10) != 0)
	    return false;
	if (method5637(i_20_, i_21_, i_22_, -1616597004) == i)
	    return true;
	return false;
    }
    
    static final void method5639(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class450.method5433(class229, class226, class648, -710591821);
    }
    
    static final void method5640(Class648 class648, short i) {
	((Class648) class648).anInt8395 -= -577899301;
	long l = (long) (((Class648) class648).anIntArray8394
			 [((Class648) class648).anInt8395 * 717927929]);
	long l_23_
	    = (long) (((Class648) class648).anIntArray8394
		      [((Class648) class648).anInt8395 * 717927929 + 1]);
	long l_24_
	    = (long) (((Class648) class648).anIntArray8394
		      [2 + ((Class648) class648).anInt8395 * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (int) (l * l_24_ / l_23_);
    }
    
    public static final void method5641(int i, int i_25_, int i_26_, int i_27_,
					int i_28_, int i_29_) {
	Class655.anInt8433 = i * 908810603;
	Class578.anInt7609 = i_25_ * 1845435683;
	Class249.anInt2780 = i_26_ * 2109728337;
	Class215.anInt2272 = 1167360179 * i_27_;
	Class480.anInt5455 = 1080290105 * i_28_;
	if (6 == Class390.anInt4111 * -1860881523)
	    Class303.method4041(-2023862457);
	if (Class480.anInt5455 * -1329360119 >= 100) {
	    int i_30_ = -535394816 * Class655.anInt8433 + 256;
	    int i_31_ = Class578.anInt7609 * -1678436864 + 256;
	    int i_32_
		= (Class335_Sub1_Sub1.method10374(i_30_, i_31_,
						  (Class181_Sub5.anInt9778
						   * 1926870089),
						  -759833206)
		   - Class249.anInt2780 * -1739906383);
	    int i_33_ = i_30_ - -639218145 * Class626.anInt8136;
	    int i_34_ = i_32_ - Class137.anInt1630 * 950408709;
	    int i_35_ = i_31_ - -1246131271 * Class227.anInt2347;
	    int i_36_
		= (int) Math.sqrt((double) (i_33_ * i_33_ + i_35_ * i_35_));
	    Class309_Sub1.anInt9907
		= ((int) (Math.atan2((double) i_34_, (double) i_36_)
			  * 2607.5945876176133)
		   & 0x3fff) * 2028903323;
	    Class653.anInt8429
		= ((int) (Math.atan2((double) i_33_, (double) i_35_)
			  * -2607.5945876176133)
		   & 0x3fff) * -1829176741;
	    Class48.anInt548 = 0;
	    if (Class309_Sub1.anInt9907 * -499166573 < 1024)
		Class309_Sub1.anInt9907 = -1167168512;
	    if (Class309_Sub1.anInt9907 * -499166573 > 3072)
		Class309_Sub1.anInt9907 = 793461760;
	}
	Class390.anInt4111 = -1164716593;
	Class386.anInt4069 = 1476949137;
	Class690_Sub2.anInt10780 = 1603116895;
    }
    
    static final void method5642(Class648 class648, int i) {
	int i_37_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_37_, (byte) -48);
	Class226 class226 = Class380.aClass226Array3970[i_37_ >> 16];
	Class526.method6412(class229, class226, class648, -1773052076);
    }
    
    static final void method5643(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = ((Class648) class648).aClass645_Sub1_Sub5_Sub1_8389
		  .method9785(1669445505);
    }
    
    public static void method5644(Class142 class142, byte i) {
	ClientPacket class528_sub21_sub7
	    = Class79.method1146(1, (long) (class142.anInt1637 * -1285823079));
	class528_sub21_sub7.method10495(-318912501);
    }
    
    public static void method5645(int i) {
	if (null != Class641.aClass364_8273) {
	    Class641.aClass364_8273.method4610(422446710);
	    Class641.aClass364_8273 = null;
	}
    }
}
