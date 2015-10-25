/* Class436 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class436
{
    public static final int anInt4848 = 17;
    public static final int anInt4849 = 5;
    public static final int anInt4850 = 15;
    public static final int anInt4851 = 8;
    public static final int anInt4852 = 6;
    public static final int anInt4853 = 10;
    public static final int anInt4854 = 2;
    public static final int anInt4855 = 12;
    public static final int anInt4856 = 18;
    public static final int anInt4857 = 16;
    public static final int anInt4858 = 19;
    public static final int anInt4859 = 9;
    public static final int anInt4860 = 1;
    public static final int anInt4861 = 0;
    public static final int anInt4862 = 11;
    public static final int anInt4863 = 7;
    public static final int anInt4864 = 3;
    public static final int anInt4865 = 4;
    public static final int anInt4866 = 14;
    public static final int anInt4867 = 13;
    
    Class436() throws Throwable {
	throw new Error();
    }
    
    static final void method5281(Class648 class648, byte i) {
	((Class648) class648).anInt8410 -= -1094513834;
	String string
	    = (String) (((Class648) class648).anObjectArray8396
			[((Class648) class648).anInt8410 * -520794877]);
	String string_0_
	    = (String) (((Class648) class648).anObjectArray8396
			[1 + -520794877 * ((Class648) class648).anInt8410]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class643.method7664(string, string_0_, (short) -17694);
    }
    
    static final void method5282(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_1_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_2_ = ((((Class648) class648).anIntArray8394
		     [1 + 717927929 * ((Class648) class648).anInt8395])
		    - 1);
	ItemType itemType
	    = (ItemType) Class18.aClass5_Sub13_206.method63(i_1_, -393319773);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = itemType.method528(i_2_, (byte) 11);
    }
    
    static final void method5283(Class648 class648, int i) {
	Class514.aClass528_Sub38_6967.method9556
	    (Class514.aClass528_Sub38_6967.aClass691_Sub9_10582,
	     (((Class648) class648).anIntArray8394
	      [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]),
	     16459760);
	client.aClass495_10935.method5989(2016078152);
	Class243.method3387(2145727383);
	client.aBool11161 = false;
    }
    
    static final void method5284(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = client.aBool11141 && !client.aBool10934 ? 1 : 0;
    }
    
    static final int method5285(int i, short i_3_) {
	return i >> 11 & 0x7f;
    }
    
    static boolean method5286(Class173 class173, int i, int i_4_) {
	class173.method2235();
	Class249.method3417(1990387192);
	if (!class173.method2248(-278461980))
	    return false;
	int i_5_ = client.aClass495_10935.method6029((short) 10240);
	int i_6_ = client.aClass495_10935.method5967(1979517229);
	Class466 class466 = client.aClass495_10935.method6006((byte) 0);
	Class538 class538 = client.aClass495_10935.method5973((byte) 85);
	int i_7_ = i;
	if (Class108.myPlayer != null) {
	    int i_8_ = ((Class108.myPlayer
			 .sceneXQueue[0])
			>> 3);
	    int i_9_ = ((Class108.myPlayer
			 .sceneYQueue[0])
			>> 3);
	    if (i_8_ >= 0 && i_8_ < Class148_Sub1.aBoolArrayArray8790.length
		&& i_9_ >= 0
		&& i_9_ < Class148_Sub1.aBoolArrayArray8790[i_8_].length
		&& Class148_Sub1.aBoolArrayArray8790[i_8_][i_9_])
		i_7_ = 0;
	}
	int i_10_ = i_5_ / 2;
	int i_11_ = 0;
	int i_12_ = 0;
	boolean bool = true;
	for (int i_13_ = i_11_; i_13_ < i_11_ + i_5_; i_13_++) {
	    for (int i_14_ = i_12_; i_14_ < i_6_ + i_12_; i_14_++) {
		for (int i_15_ = i_7_; i_15_ <= 3; i_15_++) {
		    if (i_15_ < i
			|| class466.method5632(i, i_15_, i_13_, i_14_,
					       (short) -31045)) {
			int i_16_ = i_15_;
			if (class466.method5633(i_13_, i_14_, (short) -27656))
			    i_16_--;
			if (i_16_ >= 0)
			    bool &= Class171.method2116(i_16_, i_13_, i_14_,
							262144);
		    }
		}
	    }
	}
	if (!bool)
	    return false;
	int i_17_ = i_5_ * 4 + 48 + 48;
	int[] is = new int[i_17_ * i_17_];
	for (int i_18_ = 0; i_18_ < is.length; i_18_++)
	    is[i_18_] = 0;
	Class163_Sub1 class163_sub1 = null;
	int i_19_ = 0;
	int i_20_ = 0;
	if (Class98.aBool1242) {
	    Class322.aClass151_3483
		= class173.method2191(i_17_, i_17_, false, true);
	    class163_sub1 = class173.method2236();
	    class163_sub1.method8898(0, Class322.aClass151_3483.method1769());
	    Interface21 interface21 = class173.method2184(i_17_, i_17_);
	    class163_sub1.method8907(interface21);
	    class173.method2179(class163_sub1, 285883838);
	    i_10_ = i_5_;
	    i_19_ = 48;
	    i_20_ = 48;
	    class173.method2268(1, 0);
	} else
	    Class322.aClass151_3483
		= class173.method2418(is, 0, i_17_, i_17_, i_17_, -1035599327);
	client.aClass495_10935.method5975(-45297529).method7486((byte) 2);
	int i_21_
	    = ~0xffffff | ((238 + (int) (Math.random() * 20.0) - 10 << 16)
			   + (238 + (int) (Math.random() * 20.0) - 10 << 8)
			   + (238 + (int) (Math.random() * 20.0) - 10));
	int i_22_ = ~0xffffff | 238 + (int) (Math.random() * 20.0) - 10 << 16;
	int i_23_ = ((int) (Math.random() * 8.0) << 16
		     | (int) (Math.random() * 8.0) << 8
		     | (int) (Math.random() * 8.0));
	boolean[][] bools = new boolean[2 + (1 + i_10_)][i_10_ + 1 + 2];
	class173.method2345(Class98.anIntArray1243);
	class173.method2527();
	for (int i_24_ = i_11_; i_24_ < i_11_ + i_5_; i_24_ += i_10_) {
	    for (int i_25_ = i_12_; i_25_ < i_12_ + i_6_; i_25_ += i_10_) {
		int i_26_ = i_19_;
		int i_27_ = i_20_;
		int i_28_ = i_24_;
		if (i_28_ > 0) {
		    i_28_--;
		    i_26_ += 4;
		}
		int i_29_ = i_25_;
		if (i_29_ > 0)
		    i_29_--;
		int i_30_ = i_24_ + i_10_;
		if (i_30_ < i_5_)
		    i_30_++;
		int i_31_ = i_10_ + i_25_;
		if (i_31_ < i_6_) {
		    i_31_++;
		    i_27_ += 4;
		}
		if (Class98.aBool1241)
		    class173.method2203();
		else
		    class173.method2204(0, 0, i_10_ * 4 + i_26_,
					4 * i_10_ + i_27_);
		class173.method2268(3, -16777216);
		int i_32_ = i_10_;
		if (i_32_ > i_5_ - 1)
		    i_32_ = i_5_ - 1;
		for (int i_33_ = i_7_; i_33_ <= 3; i_33_++) {
		    for (int i_34_ = 0; i_34_ <= i_32_; i_34_++) {
			for (int i_35_ = 0; i_35_ <= i_32_; i_35_++)
			    bools[i_34_][i_35_]
				= (i_33_ < i
				   || class466.method5632(i, i_33_,
							  i_28_ + i_34_,
							  i_29_ + i_35_,
							  (short) -29332));
		    }
		    class538.aClass137Array7163[i_33_].method1655(i_19_, i_20_,
								  1024, i_28_,
								  i_29_, i_30_,
								  i_31_,
								  bools);
		    for (int i_36_ = -4; i_36_ < i_10_; i_36_++) {
			for (int i_37_ = -4; i_37_ < i_10_; i_37_++) {
			    int i_38_ = i_36_ + i_24_;
			    int i_39_ = i_25_ + i_37_;
			    if (i_38_ >= i_11_ && i_39_ >= i_12_
				&& (i_33_ < i
				    || class466.method5632(i, i_33_, i_38_,
							   i_39_,
							   (short) -9164))) {
				int i_40_ = i_33_;
				if (class466.method5633(i_38_, i_39_,
							(short) 9312))
				    i_40_--;
				if (i_40_ >= 0)
				    Class267.method3673(class173, i_40_, i_38_,
							i_39_,
							i_26_ + i_36_ * 4,
							((i_10_ - i_37_) * 4
							 + i_27_ - 4),
							i_21_, i_22_,
							(byte) 26);
			    }
			}
		    }
		}
		class173.method2216(i_26_, i_27_, 4 * i_10_, 4 * i_10_, i_23_,
				    2);
		class173.method2235();
		if (!Class98.aBool1242) {
		    Class322.aClass151_3483.method1784
			(48 + (i_24_ - i_11_) * 4,
			 i_6_ * 4 + 48 - (i_25_ - i_12_) * 4 - 4 * i_10_,
			 i_10_ * 4, 4 * i_10_, i_26_, i_27_);
		    if (Class98.aBool1241) {
			Class322.aClass151_3483.method1773(256, 0);
			try {
			    class173.method2273(1956128100);
			    Class511_Sub1.method9241(2000L);
			} catch (Exception exception) {
			    /* empty */
			}
		    }
		}
	    }
	}
	if (Class98.aBool1242) {
	    class173.method2180(class163_sub1, -1015508083);
	    if (Class98.aBool1241) {
		Class322.aClass151_3483.method1773(256, 0);
		try {
		    class173.method2273(1956128100);
		    Class511_Sub1.method9241(2000L);
		} catch (Exception exception) {
		    /* empty */
		}
	    }
	}
	class173.method2203();
	class173.method2275(Class98.anIntArray1243[0],
			    Class98.anIntArray1243[1],
			    Class98.anIntArray1243[2],
			    Class98.anIntArray1243[3]);
	class173.method2268(1, 1);
	PlayerModel.method7298(140470527);
	Class98.anInt1245 = 0;
	Class98.aClass688_1240.method8059((byte) -65);
	if (!Class98.aBool1253) {
	    Class501.method6112(i, -732665004);
	    Class533 class533 = client.aClass495_10935.method5968(-1923641251);
	    if (null != class533) {
		Class208.aClass5_Sub6_2238.method10148(1024, 64, -1981864030);
		Class578 class578
		    = client.aClass495_10935.method5966(1273279609);
		for (int i_41_ = 0; i_41_ < -595383187 * class533.anInt7130;
		     i_41_++) {
		    int i_42_ = class533.anIntArray7129[i_41_];
		    if (i_42_ >> 28
			== (Class108.myPlayer
			    .aByte10675)) {
			int i_43_ = ((i_42_ >> 14 & 0x3fff)
				     - 961465569 * class578.anInt7607);
			int i_44_ = ((i_42_ & 0x3fff)
				     - class578.anInt7608 * -173815201);
			if (i_43_ >= 0 && i_43_ < i_5_ && i_44_ >= 0
			    && i_44_ < i_6_)
			    Class98.aClass688_1240.method8031
				(new Class528_Sub17(i_41_), (byte) -97);
			else {
			    Class239 class239
				= ((Class239)
				   (Class208.aClass5_Sub6_2238.method63
				    (class533.anIntArray7131[i_41_],
				     504198376)));
			    if (class239.anIntArray2632 != null
				&& (-1176935681 * class239.anInt2623 + i_43_
				    >= 0)
				&& (i_43_ + class239.anInt2633 * 1760812701
				    < i_5_)
				&& (i_44_ + -1230395865 * class239.anInt2647
				    >= 0)
				&& (i_44_ + -471588695 * class239.anInt2634
				    < i_6_))
				Class98.aClass688_1240.method8031
				    (new Class528_Sub17(i_41_), (byte) -71);
			}
		    }
		}
		Class208.aClass5_Sub6_2238.method10148(128, 64, 826022302);
	    }
	}
	return true;
    }
}
