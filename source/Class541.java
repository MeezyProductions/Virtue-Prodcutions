/* Class541 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class541
{
    public static final int anInt7221 = 2;
    byte aByte7222;
    public static final int anInt7223 = 4;
    public static final int anInt7224 = 8;
    public static final int anInt7225 = 16;
    short[] aShortArray7226;
    byte aByte7227;
    public static final int anInt7228 = 1;
    short aShort7229;
    short aShort7230;
    short aShort7231;
    int[] anIntArray7232;
    short[] aShortArray7233;
    int[] anIntArray7234;
    int[] anIntArray7235;
    short aShort7236;
    short[] aShortArray7237;
    
    Class541(Class538 class538, int i, int i_0_, int i_1_, int i_2_, int i_3_,
	     int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_,
	     int i_10_, int i_11_, int i_12_) {
	((Class541) this).aByte7222 = (byte) i;
	((Class541) this).aByte7227 = (byte) i_0_;
	((Class541) this).anIntArray7232 = new int[4];
	((Class541) this).anIntArray7235 = new int[4];
	((Class541) this).anIntArray7234 = new int[4];
	((Class541) this).anIntArray7232[0] = i_1_;
	((Class541) this).anIntArray7232[1] = i_2_;
	((Class541) this).anIntArray7232[2] = i_3_;
	((Class541) this).anIntArray7232[3] = i_4_;
	((Class541) this).anIntArray7235[0] = i_5_;
	((Class541) this).anIntArray7235[1] = i_6_;
	((Class541) this).anIntArray7235[2] = i_7_;
	((Class541) this).anIntArray7235[3] = i_8_;
	((Class541) this).anIntArray7234[0] = i_9_;
	((Class541) this).anIntArray7234[1] = i_10_;
	((Class541) this).anIntArray7234[2] = i_11_;
	((Class541) this).anIntArray7234[3] = i_12_;
	((Class541) this).aShort7236
	    = (short) (i_1_ >> -1532596617 * class538.anInt7148);
	((Class541) this).aShort7229
	    = (short) (i_3_ >> class538.anInt7148 * -1532596617);
	((Class541) this).aShort7230
	    = (short) (i_9_ >> class538.anInt7148 * -1532596617);
	((Class541) this).aShort7231
	    = (short) (i_11_ >> -1532596617 * class538.anInt7148);
	((Class541) this).aShortArray7233 = new short[4];
	((Class541) this).aShortArray7226 = new short[4];
	((Class541) this).aShortArray7237 = new short[4];
    }
    
    public static final void method6620(int i) {
	int i_13_ = Class514.aClass528_Sub38_6967.aClass691_Sub17_10586
			.method9955(1387893869);
	if (i_13_ == 0) {
	    client.gameScene.method5979(null, -1616010987);
	    Class405.method4877(0, 68049678);
	} else if (i_13_ == 1 || i_13_ == 3) {
	    Class152.method1825((byte) 0, 452013507);
	    Class405.method4877(512, -295419691);
	    if (client.gameScene.method5973((byte) 95) != null)
		Class471.method5814(1064317205);
	} else {
	    Class152.method1825((byte) (client.anInt10968 * -2032978979 - 4
					& 0xff),
				452013507);
	    Class405.method4877(2, 1948127908);
	}
	client.anInt11096 = 161190617 * Class181_Sub5.anInt9778;
    }
    
    static void method6621(int i, int i_14_) {
	Class528_Sub6.anInt10251 = 15433863 * i;
	Class528_Sub6.aClass186_10250.method2731(-1467336681);
    }
    
    static void method6622(Class173 class173, short i) {
	if (!Class28.aBool257)
	    Class407.method4885(class173, (byte) 43);
	else
	    Class204.method2909(class173, 1423196939);
    }
}
