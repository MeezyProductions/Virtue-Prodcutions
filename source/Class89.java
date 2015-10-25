/* Class89 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

public class Class89
{
    public String aString1130;
    public byte aByte1131;
    String aString1132;
    public int anInt1133;
    public String aString1134;
    public String aString1135;
    
    Class89() {
	/* empty */
    }
    
    public static Class151 method1207(Class446 class446, int i, int i_0_) {
	Class151 class151
	    = (Class151) Class291.aClass186_3194.method2727((long) i);
	if (class151 == null) {
	    if (Class5_Sub17.aBool10847)
		class151
		    = Class587.aClass173_7714
			  .method2334(Class175.method2562(class446, i), true);
	    else
		class151
		    = Class40.method816(class446.method5395(i, -667824758),
					-1249718710);
	    Class291.aClass186_3194.method2729(class151, (long) i);
	}
	return class151;
    }
    
    static void method1208(Class648 class648, int i) {
	Class256 class256
	    = ((Class256)
	       Class669.aClass25_Sub1_8522.method63((((Class648) class648)
						     .anIntArray8394
						     [((((Class648) class648)
							    .anInt8395
							-= 1239022665)
						       * 717927929)]),
						    2122028052));
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (class256.anIntArray2819 == null ? 0
	       : class256.anIntArray2819.length);
    }
    
    static void method1209(int i, int i_1_) {
	if (Class514.aClass528_Sub38_6967.aClass691_Sub30_10600
		.method10069(2092609958)
	    == 0)
	    i = -1;
	if (i != 134866607 * client.anInt11050) {
	    if (i != -1) {
		Class637 class637
		    = ((Class637)
		       Class525.aClass5_Sub20_7075.method63(i, 1842941310));
		Class178 class178 = class637.method7577((short) 20177);
		if (class178 != null) {
		    Class289.aClass506_3183.setcustomcursor
			(Class64.aCanvas754, class178.method2629(true),
			 class178.method2608(), class178.method2615(),
			 new Point(class637.anInt8248 * -923159665,
				   class637.anInt8249 * -780219561));
		    client.anInt11050 = i * -1918947249;
		} else
		    i = -1;
	    }
	    if (-1 == i && -1 != client.anInt11050 * 134866607) {
		Class289.aClass506_3183.setcustomcursor(Class64.aCanvas754,
							null, -1, -1,
							new Point());
		client.anInt11050 = 1918947249;
	    }
	}
    }
    
    static final void method1210(long l) {
	Class422 class422
	    = (Class108.myPlayer.method7693()
	       .aClass422_4868);
	int i = (int) class422.aFloat4780 + client.anInt10960 * -1357804645;
	int i_2_ = (int) class422.aFloat4777 + -1631621005 * client.anInt11117;
	if (Class494.anInt5533 * -858645029 - i < -2000
	    || -858645029 * Class494.anInt5533 - i > 2000
	    || 593060725 * Class622.anInt8116 - i_2_ < -2000
	    || 593060725 * Class622.anInt8116 - i_2_ > 2000) {
	    Class494.anInt5533 = 432445011 * i;
	    Class622.anInt8116 = -842001187 * i_2_;
	}
	if (-858645029 * Class494.anInt5533 != i) {
	    int i_3_ = i - Class494.anInt5533 * -858645029;
	    int i_4_ = (int) (l * (long) i_3_ / 320L);
	    if (i_3_ > 0) {
		if (0 == i_4_)
		    i_4_ = 1;
		else if (i_4_ > i_3_)
		    i_4_ = i_3_;
	    } else if (0 == i_4_)
		i_4_ = -1;
	    else if (i_4_ < i_3_)
		i_4_ = i_3_;
	    Class494.anInt5533 += i_4_ * 432445011;
	}
	if (i_2_ != Class622.anInt8116 * 593060725) {
	    int i_5_ = i_2_ - 593060725 * Class622.anInt8116;
	    int i_6_ = (int) ((long) i_5_ * l / 320L);
	    if (i_5_ > 0) {
		if (i_6_ == 0)
		    i_6_ = 1;
		else if (i_6_ > i_5_)
		    i_6_ = i_5_;
	    } else if (i_6_ == 0)
		i_6_ = -1;
	    else if (i_6_ < i_5_)
		i_6_ = i_5_;
	    Class622.anInt8116 += -842001187 * i_6_;
	}
	client.aFloat11088 += client.aFloat10976 * (float) l / 6.0F;
	client.aFloat11002 += client.aFloat11037 * (float) l / 6.0F;
	Class91.method1223((byte) 104);
    }
    
    static void method1211(int i, boolean bool, int i_7_) {
	Class528_Sub6 class528_sub6 = IncomingPacket.method4814(i, bool, 1939898889);
	if (null != class528_sub6)
	    class528_sub6.method6443(1823581625);
    }
    
    static final void method1212(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class691_Sub12.method9920(class229, class226, class648, (byte) -37);
    }
}
