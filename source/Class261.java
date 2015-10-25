/* Class261 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class261
{
    public Class264[] aClass264Array2848;
    public String aString2849;
    public String aString2850;
    public String aString2851;
    public Class264[] aClass264Array2852;
    static int anInt2853;
    public static Class446 aClass446_2854;
    
    void method3580(Class267 class267) {
	aString2850 = class267.method3669(-851992817);
	aString2849 = class267.method3669(-953584734);
	aString2851 = class267.method3669(693669069);
	int i = class267.method3671(-618542804);
	int i_0_ = class267.method3671(-481476076);
	aClass264Array2848 = i == 0 ? null : new Class264[i];
	aClass264Array2852 = i_0_ == 0 ? null : new Class264[i_0_];
	for (int i_1_ = 0; i_1_ < i; i_1_++) {
	    aClass264Array2848[i_1_] = new Class264();
	    aClass264Array2848[i_1_].method3654(class267, -1211597445);
	}
	for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
	    aClass264Array2852[i_2_] = new Class264();
	    aClass264Array2852[i_2_].method3654(class267, 1188107826);
	}
    }
    
    void method3581(Class267 class267, byte i) {
	aString2850 = class267.method3669(669701149);
	aString2849 = class267.method3669(540685768);
	aString2851 = class267.method3669(305855968);
	int i_3_ = class267.method3671(-1079973801);
	int i_4_ = class267.method3671(-1886670325);
	aClass264Array2848 = i_3_ == 0 ? null : new Class264[i_3_];
	aClass264Array2852 = i_4_ == 0 ? null : new Class264[i_4_];
	for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
	    aClass264Array2848[i_5_] = new Class264();
	    aClass264Array2848[i_5_].method3654(class267, -581680759);
	}
	for (int i_6_ = 0; i_6_ < i_4_; i_6_++) {
	    aClass264Array2852[i_6_] = new Class264();
	    aClass264Array2852[i_6_].method3654(class267, -366388179);
	}
    }
    
    Class261() {
	/* empty */
    }
    
    static final void method3582(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	int[] is = Class494.method5957(string, class648, (short) 520);
	if (null != is)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2352
	    = Class181_Sub23.method8999(string, class648, (byte) -52);
	class229.anIntArray2549 = is;
	class229.aBool2483 = true;
    }
    
    static final void method3583(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class108.myPlayer.aClass37_11809
		  .method795(-2116735627) >> 3;
    }
    
    public static void method3584(int i, int i_7_) {
	ClientPacket class528_sub21_sub7
	    = Class79.method1146(6, (long) i);
	class528_sub21_sub7.method10495(-1603300209);
    }
    
    static final void method3585(Class648 class648, int i) {
	int i_8_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_8_, (byte) 32);
	Class226 class226 = Class380.aClass226Array3970[i_8_ >> 16];
	Class397.method4817(class229, class226, class648, -2041958720);
    }
}
