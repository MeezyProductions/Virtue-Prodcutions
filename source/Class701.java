/* Class701 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class701
{
    int anInt8736;
    int anInt8737;
    int anInt8738;
    Class528_Sub21_Sub16 aClass528_Sub21_Sub16_8739;
    Class528_Sub21_Sub16 aClass528_Sub21_Sub16_8740;
    boolean aBool8741 = false;
    
    final void method8216() {
	((Class701) this).aBool8741 = false;
	((Class701) this).anInt8736 = 0;
	((Class701) this).aClass528_Sub21_Sub16_8740 = null;
	((Class701) this).aClass528_Sub21_Sub16_8739 = null;
    }
    
    Class701() {
	/* empty */
    }
    
    final void method8217(int i) {
	((Class701) this).aBool8741 = false;
	((Class701) this).anInt8736 = 0;
	((Class701) this).aClass528_Sub21_Sub16_8740 = null;
	((Class701) this).aClass528_Sub21_Sub16_8739 = null;
    }
    
    final void method8218() {
	((Class701) this).aBool8741 = false;
	((Class701) this).anInt8736 = 0;
	((Class701) this).aClass528_Sub21_Sub16_8740 = null;
	((Class701) this).aClass528_Sub21_Sub16_8739 = null;
    }
    
    final boolean method8219(Class5_Sub4 class5_sub4, Class190 class190, int i,
			     int i_0_, int[] is, int i_1_) {
	if (!((Class701) this).aBool8741) {
	    if (i >= is.length)
		return false;
	    ((Class701) this).anInt8737 = -1713006673 * is[i];
	    ((Class701) this).aClass528_Sub21_Sub16_8739
		= class5_sub4.method10137((((Class701) this).anInt8737
					   * 28843855) >> 16,
					  -1003958113);
	    ((Class701) this).anInt8737
		= -1713006673 * (((Class701) this).anInt8737 * 28843855
				 & 0xffff);
	    if (((Class701) this).aClass528_Sub21_Sub16_8739 != null) {
		if (class190.aBool2158 && i_0_ != -1 && i_0_ < is.length) {
		    ((Class701) this).anInt8738 = is[i_0_] * -1172045989;
		    ((Class701) this).aClass528_Sub21_Sub16_8740
			= class5_sub4.method10137((((Class701) this).anInt8738
						   * -1905518381) >> 16,
						  2092181353);
		    ((Class701) this).anInt8738
			= (-1172045989
			   * (-1905518381 * ((Class701) this).anInt8738
			      & 0xffff));
		}
		if (class190.aBool2155)
		    ((Class701) this).anInt8736
			= (-1328209457
			   * (((Class701) this).anInt8736 * 2006861103
			      | 0x200));
		if (((Class701) this).aClass528_Sub21_Sub16_8739.method10572
		    (((Class701) this).anInt8737 * 28843855, (byte) 15))
		    ((Class701) this).anInt8736
			= ((2006861103 * ((Class701) this).anInt8736 | 0x80)
			   * -1328209457);
		if (((Class701) this).aClass528_Sub21_Sub16_8739.method10573
		    (((Class701) this).anInt8737 * 28843855, (byte) -90))
		    ((Class701) this).anInt8736
			= ((2006861103 * ((Class701) this).anInt8736 | 0x100)
			   * -1328209457);
		if (((Class701) this).aClass528_Sub21_Sub16_8739.method10575
		    (28843855 * ((Class701) this).anInt8737, -729070979))
		    ((Class701) this).anInt8736
			= (-1328209457
			   * (((Class701) this).anInt8736 * 2006861103
			      | 0x400));
		if (null != ((Class701) this).aClass528_Sub21_Sub16_8740) {
		    if (((Class701) this).aClass528_Sub21_Sub16_8740
			    .method10572
			(-1905518381 * ((Class701) this).anInt8738, (byte) 94))
			((Class701) this).anInt8736
			    = (-1328209457
			       * (((Class701) this).anInt8736 * 2006861103
				  | 0x80));
		    if (((Class701) this).aClass528_Sub21_Sub16_8740
			    .method10573
			(((Class701) this).anInt8738 * -1905518381,
			 (byte) -23))
			((Class701) this).anInt8736
			    = (-1328209457
			       * (2006861103 * ((Class701) this).anInt8736
				  | 0x100));
		    if (((Class701) this).aClass528_Sub21_Sub16_8740
			    .method10575
			(-1905518381 * ((Class701) this).anInt8738, 306156217))
			((Class701) this).anInt8736
			    = (-1328209457
			       * (2006861103 * ((Class701) this).anInt8736
				  | 0x400));
		}
		((Class701) this).anInt8736
		    = ((2006861103 * ((Class701) this).anInt8736 | 0x20)
		       * -1328209457);
		((Class701) this).aBool8741 = true;
		return true;
	    }
	    return false;
	}
	return true;
    }
    
    static void method8220(Class173 class173, int i, int i_2_, int i_3_,
			   int i_4_, int i_5_, byte i_6_) {
	if ((null == Class528_Sub21_Sub14.aClass151_11631
	     || null == Class284.aClass151_3119
	     || null == Class80.aClass151_815)
	    && Class623_Sub1.aClass446_10671
		   .method5357(Class92.anInt1193 * -95461483, (short) -19530)
	    && Class623_Sub1.aClass446_10671.method5357((-903078661
							 * (Class528_Sub27
							    .anInt10446)),
							(short) -2141)
	    && Class623_Sub1.aClass446_10671.method5357((Class592.anInt7748
							 * 31395955),
							(short) -15353)) {
	    Class178 class178
		= Class175.method2561(Class623_Sub1.aClass446_10671,
				      Class528_Sub27.anInt10446 * -903078661,
				      0);
	    Class284.aClass151_3119 = class173.method2334(class178, true);
	    class178.method2623();
	    Class528_Sub41.aClass151_10651
		= class173.method2334(class178, true);
	    Class528_Sub21_Sub14.aClass151_11631
		= class173.method2334(Class175.method2561((Class623_Sub1
							   .aClass446_10671),
							  (Class92.anInt1193
							   * -95461483),
							  0),
				      true);
	    Class178 class178_7_
		= Class175.method2561(Class623_Sub1.aClass446_10671,
				      Class592.anInt7748 * 31395955, 0);
	    Class80.aClass151_815 = class173.method2334(class178_7_, true);
	    class178_7_.method2623();
	    Class235.aClass151_2594 = class173.method2334(class178_7_, true);
	}
	if (Class528_Sub21_Sub14.aClass151_11631 != null
	    && Class284.aClass151_3119 != null
	    && null != Class80.aClass151_815) {
	    int i_8_ = ((i_3_ - Class80.aClass151_815.method1766() * 2)
			/ Class528_Sub21_Sub14.aClass151_11631.method1766());
	    for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
		Class528_Sub21_Sub14.aClass151_11631.method1773
		    ((i + Class80.aClass151_815.method1766()
		      + (i_9_
			 * Class528_Sub21_Sub14.aClass151_11631.method1766())),
		     (i_2_ + i_4_
		      - Class528_Sub21_Sub14.aClass151_11631.method1767()));
	    int i_10_ = ((i_4_ - i_5_ - Class80.aClass151_815.method1767())
			 / Class284.aClass151_3119.method1767());
	    for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
		Class284.aClass151_3119.method1773
		    (i, (i_5_ + i_2_
			 + i_11_ * Class284.aClass151_3119.method1767()));
		Class528_Sub41.aClass151_10651.method1773
		    (i_3_ + i - Class528_Sub41.aClass151_10651.method1766(),
		     (i_5_ + i_2_
		      + i_11_ * Class284.aClass151_3119.method1767()));
	    }
	    Class80.aClass151_815.method1773(i,
					     i_4_ + i_2_ - Class80
							       .aClass151_815
							       .method1767());
	    Class235.aClass151_2594.method1773
		(i + i_3_ - Class80.aClass151_815.method1766(),
		 i_4_ + i_2_ - Class80.aClass151_815.method1767());
	}
    }
}
