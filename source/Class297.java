/* Class297 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;
import java.util.LinkedList;

public class Class297
{
    static Class297 aClass297_3250;
    public static Class297 aClass297_3251;
    public int anInt3252;
    static Class297 aClass297_3253;
    static Class297 aClass297_3254;
    public static Class297 aClass297_3255 = new Class297(0, false);
    boolean aBool3256;
    
    public boolean method3977(int i) {
	return ((Class297) this).aBool3256;
    }
    
    static {
	aClass297_3251 = new Class297(1, false);
	aClass297_3253 = new Class297(2, true);
	aClass297_3250 = new Class297(3, true);
	aClass297_3254 = new Class297(4, true);
    }
    
    public boolean method3978() {
	return ((Class297) this).aBool3256;
    }
    
    public boolean method3979() {
	return ((Class297) this).aBool3256;
    }
    
    public boolean method3980() {
	return ((Class297) this).aBool3256;
    }
    
    Class297(int i, boolean bool) {
	anInt3252 = i * -60680779;
	((Class297) this).aBool3256 = bool;
    }
    
    public boolean method3981() {
	return ((Class297) this).aBool3256;
    }
    
    static final void method3982(Class648 class648, short i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 1665217863 * class229.anInt2401;
    }
    
    static final void method3983(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= 1900146029;
    }
    
    static void method3984(int[] is, LinkedList linkedlist, int i, int i_0_,
			   float f, int i_1_) {
	if (!linkedlist.isEmpty()) {
	    for (int i_2_ = 0; i_2_ < linkedlist.size(); i_2_++) {
		Class573 class573 = (Class573) linkedlist.get(i_2_);
		int i_3_ = ((int) ((float) (((Class573) class573).anInt7569
					    * 1472526831)
				   * f)
			    + i);
		int i_4_ = ((int) (f * (float) (((Class573) class573).anInt7565
						* 1521096817))
			    + i_0_);
		int i_5_ = (int) (f * (float) (((Class573) class573).anInt7567
					       * 64512483));
		int i_6_ = (int) ((float) (997087745
					   * ((Class573) class573).anInt7568)
				  * f);
		if (i_3_ < 339071345 * Class444.anInt4914
		    && i_4_ < 1374421313 * Class492.anInt5521) {
		    if (i_3_ + i_5_ > Class444.anInt4914 * 339071345)
			i_5_ = 339071345 * Class444.anInt4914 - i_3_;
		    if (i_4_ + i_6_ > 1374421313 * Class492.anInt5521)
			i_6_ = 1374421313 * Class492.anInt5521 - i_4_;
		    for (int i_7_ = i_4_; i_7_ < i_4_ + i_6_; i_7_++) {
			int i_8_
			    = i_7_ * (339071345 * Class444.anInt4914) + i_3_;
			Arrays.fill(is, i_8_, i_8_ + i_5_, -16777216);
		    }
		}
	    }
	}
    }
    
    static final void method3985(Class648 class648, int i) {
	Class590.method7075(class648,
			    (((Class648) class648)
			     .aClass645_Sub1_Sub5_Sub1_8389),
			    -55898191);
    }
    
    public static void method3986(int i, byte i_9_) {
	ClientPacket class528_sub21_sub7
	    = Class79.method1146(11, (long) i);
	class528_sub21_sub7.method10495(-42114156);
    }
    
    public static void method3987(byte i) {
	for (Class528_Sub21_Sub5 class528_sub21_sub5
		 = ((Class528_Sub21_Sub5)
		    Class28.aClass679_276.method7960(-1550587110));
	     null != class528_sub21_sub5;
	     class528_sub21_sub5
		 = ((Class528_Sub21_Sub5)
		    Class28.aClass679_276.method7969(-237861830))) {
	    if ((((Class528_Sub21_Sub5) class528_sub21_sub5).anInt11534
		 * 942428025)
		> 1) {
		((Class528_Sub21_Sub5) class528_sub21_sub5).anInt11534 = 0;
		Class28.aClass186_279.method2729(class528_sub21_sub5,
						 (5093272884019756687L
						  * (((Class528_Sub21_Sub11)
						      (Class528_Sub21_Sub11)
						      (((Class528_Sub21_Sub5)
							class528_sub21_sub5)
						       .aClass679_11535
						       .aClass528_Sub21_8561
						       .aClass528_Sub21_10408))
						     .aLong11587)));
		((Class528_Sub21_Sub5) class528_sub21_sub5).aClass679_11535
		    .method7961(-1808741206);
	    }
	}
	Class28.anInt261 = 0;
	Class28.anInt303 = 0;
	Class28.aClass688_274.method8059((byte) -96);
	Class28.aClass692_275.method8141(2029772088);
	Class28.aClass679_276.method7961(-1278114404);
	Class28.aBool273 = false;
    }
}
