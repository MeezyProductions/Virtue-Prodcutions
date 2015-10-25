/* Class567 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class567 implements Interface63
{
    int anInt7550;
    
    public void method263() {
	Class528_Sub34 class528_sub34
	    = Class656.method7845(OutgoingOpcode.aClass403_4534,
				  client.aClass109_10930.aClass10_1379,
				  -2057735164);
	class528_sub34.aClass528_Sub42_Sub2_10481
	    .method9660(1869171195 * ((Class567) this).anInt7550, 1929146497);
	client.aClass109_10930.method1380(class528_sub34, 1063023213);
    }
    
    public void method309(int i) {
	Class528_Sub34 class528_sub34
	    = Class656.method7845(OutgoingOpcode.aClass403_4534,
				  client.aClass109_10930.aClass10_1379,
				  -2007334797);
	class528_sub34.aClass528_Sub42_Sub2_10481
	    .method9660(1869171195 * ((Class567) this).anInt7550, 1038049403);
	client.aClass109_10930.method1380(class528_sub34, 700195472);
    }
    
    Class567(int i) {
	((Class567) this).anInt7550 = 1451907379 * i;
    }
    
    static final void method6836(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_0_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_1_ = (((Class648) class648).anIntArray8394
		    [1 + ((Class648) class648).anInt8395 * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class663.method7890(i_0_, i_1_, false, 10874079);
    }
    
    static boolean method6837(CharSequence charsequence, int i, boolean bool,
			      byte i_2_) {
	if (i < 2 || i > 36)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (i).toString());
	boolean bool_3_ = false;
	boolean bool_4_ = false;
	int i_5_ = 0;
	int i_6_ = charsequence.length();
	for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
	    int i_8_ = charsequence.charAt(i_7_);
	    if (i_7_ == 0) {
		if (i_8_ == 45) {
		    bool_3_ = true;
		    continue;
		}
		if (43 == i_8_ && bool)
		    continue;
	    }
	    if (i_8_ >= 48 && i_8_ <= 57)
		i_8_ -= 48;
	    else if (i_8_ >= 65 && i_8_ <= 90)
		i_8_ -= 55;
	    else if (i_8_ >= 97 && i_8_ <= 122)
		i_8_ -= 87;
	    else
		return false;
	    if (i_8_ >= i)
		return false;
	    if (bool_3_)
		i_8_ = -i_8_;
	    int i_9_ = i * i_5_ + i_8_;
	    if (i_5_ != i_9_ / i)
		return false;
	    i_5_ = i_9_;
	    bool_4_ = true;
	}
	return bool_4_;
    }
    
    static final void method6838(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub3_10593
		  .method9844((byte) 107);
    }
    
    public static void method6839(String string, String string_10_,
				  String string_11_, boolean bool, int i) {
	if (string.length() <= 320 && Class445_Sub5.method9223(487555273)) {
	    Class609.method7241(-905166323);
	    Class54.aString662 = string;
	    Class54.aString663 = string_10_;
	    Class54.aString640 = string_11_;
	    Class54.aBool671 = bool;
	    Class487.method5890(2, 2130003981);
	}
    }
    
    static final void method6840(Class648 class648, int i) {
	Class5.method544((((Class648) class648).anIntArray8394
			  [((((Class648) class648).anInt8395 -= 1239022665)
			    * 717927929)]),
			 -1, -1, false, (byte) -73);
    }
    
    static boolean method6841(Class239 class239, int i) {
	if (null == class239)
	    return false;
	if (null != class239.anIntArray2631) {
	    class239 = class239.method3304(Class518_Sub1.anInterface15_6978,
					   Class518_Sub1.anInterface18_6977,
					   688888703);
	    if (class239 == null)
		return false;
	}
	if (!class239.aBool2618)
	    return false;
	if (!class239.method3299(Class518_Sub1.anInterface15_6978,
				 Class518_Sub1.anInterface18_6977,
				 -2092754441))
	    return false;
	if (Class518_Sub1.aClass692_10700
		.method8137((long) (386662643 * class239.anInt2606))
	    != null)
	    return false;
	if (Class518_Sub1.aClass692_10701
		.method8137((long) (-1770862541 * class239.anInt2649))
	    != null)
	    return false;
	if (null != class239.aString2609) {
	    if (0 == -874915157 * class239.anInt2612
		&& Class518_Sub1.aBool10703)
		return false;
	    if (1 == -874915157 * class239.anInt2612
		&& Class518_Sub1.aBool10682)
		return false;
	    if (2 == -874915157 * class239.anInt2612
		&& Class518_Sub1.aBool10704)
		return false;
	}
	return true;
    }
}
