/* Class271 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class271
{
    String aString2895;
    Class274 aClass274_2896;
    int anInt2897 = -1579075445;
    String aString2898;
    Class274 aClass274_2899;
    public int[] anIntArray2900;
    public int[] anIntArray2901;
    
    Class271() {
	/* empty */
    }
    
    void method3684(Class267 class267, int i) {
	int i_0_ = class267.method3671(-879254677);
	((Class271) this).aClass274_2899
	    = Class26_Sub1.method9541(1479765329)[i_0_];
	if (((Class271) this).aClass274_2899 == Class274.aClass274_2909) {
	    int i_1_ = class267.method3671(-1602584158);
	    ((Class271) this).aClass274_2896
		= Class26_Sub1.method9541(1647068773)[i_1_];
	    ((Class271) this).anInt2897
		= class267.method3671(-1622207751) * 1579075445;
	}
	((Class271) this).aString2895 = class267.method3669(-67464343);
	((Class271) this).aString2898 = class267.method3669(-1746318862);
	int i_2_ = class267.method3671(-726343972);
	anIntArray2900 = new int[i_2_];
	anIntArray2901 = new int[i_2_];
	for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
	    anIntArray2900[i_3_] = class267.method3671(-92228500);
	    anIntArray2901[i_3_] = class267.method3671(-1641230108);
	}
    }
    
    void method3685(Class267 class267) {
	int i = class267.method3671(-247490088);
	((Class271) this).aClass274_2899
	    = Class26_Sub1.method9541(1866311436)[i];
	if (((Class271) this).aClass274_2899 == Class274.aClass274_2909) {
	    int i_4_ = class267.method3671(144808617);
	    ((Class271) this).aClass274_2896
		= Class26_Sub1.method9541(1783367603)[i_4_];
	    ((Class271) this).anInt2897
		= class267.method3671(-819972224) * 1579075445;
	}
	((Class271) this).aString2895 = class267.method3669(-1444382932);
	((Class271) this).aString2898 = class267.method3669(-1508568053);
	int i_5_ = class267.method3671(-438128059);
	anIntArray2900 = new int[i_5_];
	anIntArray2901 = new int[i_5_];
	for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
	    anIntArray2900[i_6_] = class267.method3671(65982195);
	    anIntArray2901[i_6_] = class267.method3671(-1407105808);
	}
    }
    
    static final void method3686(Class648 class648, short i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 1132908677 * Class674.anInt8538;
    }
    
    public static Class528_Sub25 method3687(byte i) {
	if (null == Class518_Sub1.aClass688_6993
	    || null == Class518_Sub1.aClass703_10679)
	    return null;
	for (Class528_Sub25 class528_sub25
		 = (Class528_Sub25) Class518_Sub1.aClass703_10679.next();
	     class528_sub25 != null;
	     class528_sub25
		 = (Class528_Sub25) Class518_Sub1.aClass703_10679.next()) {
	    Class239 class239
		= ((Class239)
		   Class518_Sub1.aClass5_Sub6_6975.method63((-123895777
							     * (class528_sub25
								.anInt10420)),
							    -1296395968));
	    if (null != class239 && class239.aBool2641
		&& class239.method3299(Class518_Sub1.anInterface15_6978,
				       Class518_Sub1.anInterface18_6977,
				       310514335))
		return class528_sub25;
	}
	return null;
    }
}
