/* Class243 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class243
{
    public Class148 aClass148_2724;
    public int anInt2725;
    public int[] anIntArray2726;
    public int[] anIntArray2727;
    public int anInt2728;
    int anInt2729;
    public static Class5_Sub2 aClass5_Sub2_2730;
    
    public boolean method3382(int i, int i_0_) {
	if (i_0_ >= 0 && i_0_ < anIntArray2727.length) {
	    int i_1_ = anIntArray2727[i_0_];
	    if (i >= i_1_ && i <= anIntArray2726[i_0_] + i_1_)
		return true;
	}
	return false;
    }
    
    public boolean method3383(int i, int i_2_, byte i_3_) {
	if (i_2_ >= 0 && i_2_ < anIntArray2727.length) {
	    int i_4_ = anIntArray2727[i_2_];
	    if (i >= i_4_ && i <= anIntArray2726[i_2_] + i_4_)
		return true;
	}
	return false;
    }
    
    Class243(int i, int i_5_, int[] is, int[] is_6_, Class148 class148,
	     int i_7_) {
	anInt2725 = 647971555 * i;
	anInt2728 = i_5_ * -712025813;
	anIntArray2726 = is;
	anIntArray2727 = is_6_;
	aClass148_2724 = class148;
	((Class243) this).anInt2729 = -1654006081 * i_7_;
    }
    
    public boolean method3384(int i, int i_8_) {
	if (i_8_ >= 0 && i_8_ < anIntArray2727.length) {
	    int i_9_ = anIntArray2727[i_8_];
	    if (i >= i_9_ && i <= anIntArray2726[i_8_] + i_9_)
		return true;
	}
	return false;
    }
    
    static final void method3385(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_10_ = (((Class648) class648).anIntArray8394
		     [((Class648) class648).anInt8395 * 717927929]);
	int i_11_ = (((Class648) class648).anIntArray8394
		     [717927929 * ((Class648) class648).anInt8395 + 1]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (client.aClass487ArrayArray11004[i_11_][i_10_].anInt5492
	       * -1928259531);
    }
    
    static final void method3386(Class648 class648, int i) {
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = Class6.method547(Class586.method7012((((Class648) class648)
						    .anIntArray8394
						    [((((Class648) class648)
							   .anInt8395
						       -= 1239022665)
						      * 717927929)]),
						   2143750780),
			       Class378_Sub2.aClass668_10123.method68(),
			       516569894);
    }
    
    public static void method3387(int i) {
	Class23 class23 = null;
	try {
	    class23
		= Class223.method3160("", client.aClass673_11108.aString8534,
				      true, (byte) 3);
	    ByteBuffer class528_sub42
		= Class514.aClass528_Sub38_6967.method9555(-1222450513);
	    class23.method689(class528_sub42.payload, 0,
			      -185904669 * class528_sub42.pointer,
			      -1080679437);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (class23 != null)
		class23.method683((byte) 72);
	} catch (Exception exception) {
	    /* empty */
	}
    }
}
