/* Class394 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class394
{
    public static final int anInt4125 = 10;
    public static final int anInt4126 = 14;
    public static final int anInt4127 = 17;
    public static final int anInt4128 = 4;
    public static final int anInt4129 = 28;
    public static final int anInt4130 = 5;
    public static final int anInt4131 = 27;
    public static final int anInt4132 = 16;
    public static final int anInt4133 = 9;
    public static final int anInt4134 = 25;
    public static final int anInt4135 = 6;
    public static final int anInt4136 = 13;
    public static final int anInt4137 = 11;
    public static final int anInt4138 = 24;
    public static final int anInt4139 = 22;
    public static final int anInt4140 = 20;
    public static final int anInt4141 = 15;
    public static final int anInt4142 = 26;
    public static final int anInt4143 = 23;
    public static final int anInt4144 = 8;
    public static final int anInt4145 = 29;
    public static final int anInt4146 = 7;
    public static final int anInt4147 = 2;
    public static final int anInt4148 = 19;
    public static final int anInt4149 = 1;
    public static final int anInt4150 = 21;
    
    Class394() throws Throwable {
	throw new Error();
    }
    
    static void method4806(int i, int i_0_, int i_1_,
			   Class528_Sub1 class528_sub1, byte i_2_) {
	long l = (long) (i << 28 | i_1_ << 14 | i_0_);
	Class528_Sub2 class528_sub2
	    = (Class528_Sub2) client.aClass692_11042.method8137(l);
	if (null == class528_sub2) {
	    class528_sub2 = new Class528_Sub2();
	    client.aClass692_11042.method8142(class528_sub2, l);
	    class528_sub2.aClass688_10201.method8031(class528_sub1,
						     (byte) -50);
	} else {
	    ItemType itemType
		= ((ItemType)
		   Class18.aClass5_Sub13_206.method63((class528_sub1.anInt10200
						       * -48406585),
						      1671964792));
	    int i_3_ = 1313202905 * itemType.anInt52;
	    if (1 == -2057416305 * itemType.anInt43)
		i_3_ *= 1 + (((Class528_Sub1) class528_sub1).anInt10199
			     * -459162289);
	    for (Class528_Sub1 class528_sub1_4_
		     = ((Class528_Sub1)
			class528_sub2.aClass688_10201.method8034(2139023027));
		 null != class528_sub1_4_;
		 class528_sub1_4_
		     = ((Class528_Sub1)
			class528_sub2.aClass688_10201.method8037(41272216))) {
		itemType
		    = ((ItemType)
		       Class18.aClass5_Sub13_206.method63((-48406585
							   * (class528_sub1_4_
							      .anInt10200)),
							  722811833));
		int i_5_ = itemType.anInt52 * 1313202905;
		if (-2057416305 * itemType.anInt43 == 1)
		    i_5_
			*= 1 + -459162289 * (((Class528_Sub1) class528_sub1_4_)
					     .anInt10199);
		if (i_3_ > i_5_) {
		    Class526.method6414(class528_sub1, class528_sub1_4_,
					-970329264);
		    return;
		}
	    }
	    class528_sub2.aClass688_10201.method8031(class528_sub1, (byte) 20);
	}
    }
}
