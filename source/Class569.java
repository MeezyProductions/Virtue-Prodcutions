/* Class569 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class569
{
    int anInt7552;
    static Class569 aClass569_7553;
    static Class569 aClass569_7554 = new Class569(0);
    static Class569 aClass569_7555;
    
    Class569(int i) {
	((Class569) this).anInt7552 = 1845488419 * i;
    }
    
    static {
	aClass569_7553 = new Class569(1);
	aClass569_7555 = new Class569(2);
    }
    
    static final void method6848(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_0_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_1_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395 + 1]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = i_0_ < i_1_ ? i_0_ : i_1_;
    }
    
    static void method6849(Class229[] class229s, Class229 class229,
			   boolean bool, byte i) {
	int i_2_ = (0 != class229.anInt2402 * -1428356149
		    ? -1428356149 * class229.anInt2402
		    : -1352480433 * class229.anInt2476);
	int i_3_ = (-1002099957 * class229.anInt2437 != 0
		    ? -1002099957 * class229.anInt2437
		    : 1661025435 * class229.anInt2458);
	Class302.method4033(class229s, class229.anInt2376 * 306930455, i_2_,
			    i_3_, bool, -1422569624);
	if (null != class229.aClass229Array2390)
	    Class302.method4033(class229.aClass229Array2390,
				306930455 * class229.anInt2376, i_2_, i_3_,
				bool, -567110978);
	Class528_Sub39 class528_sub39
	    = ((Class528_Sub39)
	       client.aClass692_11097
		   .method8137((long) (306930455 * class229.anInt2376)));
	if (class528_sub39 != null)
	    Class698.method8209(class528_sub39.anInt10625 * 905908359, i_2_,
				i_3_, bool, -231788174);
	if (client.aClass229_11027 == class229) {
	    int i_4_ = 1087758653 * GPI.localPlayerCount;
	    int[] is = GPI.localPlayerIndicies;
	    for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
		Player class645_sub1_sub5_sub1_sub2
		    = client.localPlayers[is[i_5_]];
		if (null != class645_sub1_sub5_sub1_sub2)
		    class645_sub1_sub5_sub1_sub2.method10686(i_2_, i_3_, bool,
							     (byte) 1);
	    }
	    for (int i_6_ = 0; i_6_ < -2065344127 * client.anInt10922;
		 i_6_++) {
		int i_7_ = client.anIntArray10923[i_6_];
		Class528_Sub31 class528_sub31
		    = ((Class528_Sub31)
		       client.aClass692_11110.method8137((long) i_7_));
		if (class528_sub31 != null)
		    ((Entity) class528_sub31.anObject10468)
			.method10686(i_2_, i_3_, bool, (byte) 1);
	    }
	}
    }
}
