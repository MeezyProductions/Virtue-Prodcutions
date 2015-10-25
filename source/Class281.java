/* Class281 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class281
{
    public int[] anIntArray3064;
    public short[] aShortArray3065;
    public static Class16 aClass16_3066;
    
    public Class281(Class299 class299) {
	anIntArray3064 = new int[8];
	aShortArray3065 = new short[8];
	int i = 0;
	if (null != class299.anIntArray3298
	    && class299.aShortArray3299 != null) {
	    i = class299.anIntArray3298.length;
	    System.arraycopy(class299.anIntArray3298, 0, anIntArray3064, 0, i);
	    System.arraycopy(class299.aShortArray3299, 0, aShortArray3065, 0,
			     i);
	}
	for (int i_0_ = i; i_0_ < 8; i_0_++) {
	    anIntArray3064[i_0_] = -1;
	    aShortArray3065[i_0_] = (short) -1;
	}
    }
    
    public Class281(int[] is, short[] is_1_) {
	anIntArray3064 = is;
	aShortArray3065 = is_1_;
    }
    
    public static Class592[] method3741(int i) {
	return (new Class592[]
		{ Class592.aClass592_7743, Class592.aClass592_7745,
		  Class592.aClass592_7742, Class592.aClass592_7746,
		  Class592.aClass592_7741, Class592.aClass592_7744 });
    }
    
    static final void method3742(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class223.method3166(class229, class226, class648, 451338586);
    }
    
    static final void method3743(int i, int i_2_, int i_3_, int i_4_, int i_5_,
				 int i_6_, int i_7_, int i_8_) {
	int i_9_ = i_7_ - 334;
	if (i_9_ < 0)
	    i_9_ = 0;
	else if (i_9_ > 100)
	    i_9_ = 100;
	int i_10_ = (client.aShort11111
		     + i_9_ * (client.aShort11147 - client.aShort11111) / 100);
	i_6_ = i_10_ * i_6_ >> 8;
	int i_11_ = 16384 - i_4_ & 0x3fff;
	int i_12_ = 16384 - i_5_ & 0x3fff;
	int i_13_ = 0;
	int i_14_ = 0;
	int i_15_ = i_6_;
	if (i_11_ != 0) {
	    i_14_ = Class417.anIntArray4766[i_11_] * -i_15_ >> 14;
	    i_15_ = Class417.anIntArray4767[i_11_] * i_15_ >> 14;
	}
	if (i_12_ != 0) {
	    i_13_ = i_15_ * Class417.anIntArray4766[i_12_] >> 14;
	    i_15_ = i_15_ * Class417.anIntArray4767[i_12_] >> 14;
	}
	Class626.anInt8136 = (i - i_13_) * 1636412895;
	Class137.anInt1630 = (i_2_ - i_14_) * 1124026061;
	Class227.anInt2347 = 397871753 * (i_3_ - i_15_);
	Class309_Sub1.anInt9907 = 2028903323 * i_4_;
	Class653.anInt8429 = -1829176741 * i_5_;
	Class48.anInt548 = 0;
    }
}
