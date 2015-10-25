/* Class273 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class273
{
    static Class273 aClass273_2904 = new Class273(0);
    static Class273 aClass273_2905 = new Class273(1);
    int anInt2906;
    
    Class273(int i) {
	((Class273) this).anInt2906 = -1535387951 * i;
    }
    
    static void method3694(Class229 class229, Class148 class148, int i,
			   int i_0_, int i_1_, int i_2_, Class151 class151,
			   double d, Class263 class263, Class257 class257,
			   byte i_3_) {
	if (null != class151) {
	    int i_4_;
	    if (Class390.anInt4111 * -1860881523 == 6)
		i_4_ = ((int) ((double) Class495.aClass283_Sub1_5578
					    .method3792(-16777216)
			       * 2607.5945876176133)
			+ client.anInt10852 * -946910725) & 0x3fff;
	    else if (1 == Class390.anInt4111 * -1860881523)
		i_4_ = (int) client.aFloat11088 & 0x3fff;
	    else
		i_4_ = ((int) client.aFloat11088
			+ client.anInt10852 * -946910725) & 0x3fff;
	    int i_5_ = (Math.max(class229.anInt2476 * -1352480433 / 2,
				 1661025435 * class229.anInt2458 / 2)
			+ 10);
	    int i_6_ = i_1_ * i_1_ + i_2_ * i_2_;
	    if (i_6_ <= i_5_ * i_5_) {
		int i_7_ = Class417.anIntArray4766[i_4_];
		int i_8_ = Class417.anIntArray4767[i_4_];
		if (1 != -1860881523 * Class390.anInt4111) {
		    i_7_
			= 256 * i_7_ / (client.anInt11049 * -1303557179 + 256);
		    i_8_
			= i_8_ * 256 / (256 + -1303557179 * client.anInt11049);
		}
		int i_9_ = i_2_ * i_7_ + i_1_ * i_8_ >> 14;
		int i_10_ = i_8_ * i_2_ - i_7_ * i_1_ >> 14;
		double d_11_ = d / 100.0;
		switch (643778327 * class263.anInt2862) {
		case 2:
		    i = (i + -1352480433 * class229.anInt2476 / 2 + i_9_
			 - (int) ((double) class151.method40() * d_11_));
		    break;
		case 1:
		    i = i + -1352480433 * class229.anInt2476 / 2 + i_9_;
		    break;
		case 0:
		    i = (i_9_ + (-1352480433 * class229.anInt2476 / 2 + i)
			 - (int) ((double) (class151.method40() / 2) * d_11_));
		    break;
		}
		switch (class257.anInt2832 * -297363877) {
		case 0:
		    i_0_ = (1661025435 * class229.anInt2458 / 2 + i_0_ - i_10_
			    - (int) ((double) class151.method1768() * d_11_));
		    break;
		case 1:
		    i_0_ = (1661025435 * class229.anInt2458 / 2 + i_0_ - i_10_
			    - (int) ((double) (class151.method1768() / 2)
				     * d_11_));
		    break;
		case 2:
		    i_0_ = class229.anInt2458 * 1661025435 / 2 + i_0_ - i_10_;
		    break;
		}
		if (null != class148) {
		    if (d_11_ == 1.0)
			class151.method1775(i, i_0_, class148, i, i_0_);
		    else
			class151.method1774(i, i_0_,
					    (int) ((double) class151.method40()
						   * d_11_),
					    (int) ((double) class151
								.method1768()
						   * d_11_));
		} else {
		    if (1.0 == d_11_)
			class151.method1773(i, i_0_);
		    class151.method1774(i, i_0_,
					(int) ((double) class151.method40()
					       * d_11_),
					(int) ((double) class151.method1768()
					       * d_11_));
		}
	    }
	}
    }
    
    static final void method3695(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= -1816921966;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = -1;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = -1;
    }
}
