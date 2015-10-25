/* Class598 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class598 implements IClientEnum
{
    public static Class598 aClass598_7854;
    static Class598 aClass598_7855;
    static Class598 aClass598_7856 = new Class598(0);
    int anInt7857;
    
    public int method68() {
	return ((Class598) this).anInt7857 * 769873137;
    }
    
    public int method73() {
	return ((Class598) this).anInt7857 * 769873137;
    }
    
    static {
	aClass598_7855 = new Class598(1);
	aClass598_7854 = new Class598(2);
    }
    
    public int method5() {
	return ((Class598) this).anInt7857 * 769873137;
    }
    
    public int method71() {
	return ((Class598) this).anInt7857 * 769873137;
    }
    
    public int method72() {
	return ((Class598) this).anInt7857 * 769873137;
    }
    
    Class598(int i) {
	((Class598) this).anInt7857 = i * -1402135535;
    }
    
    public int method6() {
	return ((Class598) this).anInt7857 * 769873137;
    }
    
    static void method7129(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class112.method1432((byte) 28);
    }
    
    static final long method7130(int i) {
	return (((long) ((Class634.anInt8211 += -1445108439) * 1028982553 - 1)
		 << 32)
		| 0xffffffffL);
    }
    
    static final void method7131
	(Entity class645_sub1_sub5_sub1, int i) {
	if (null != class645_sub1_sub5_sub1.anIntArray11781
	    || null != class645_sub1_sub5_sub1.anIntArray11805) {
	    boolean bool = true;
	    Class578 class578 = client.aClass495_10935.method5966(1273279609);
	    for (int i_0_ = 0;
		 i_0_ < class645_sub1_sub5_sub1.anIntArray11781.length;
		 i_0_++) {
		int i_1_ = -1;
		if (null != class645_sub1_sub5_sub1.anIntArray11781)
		    i_1_ = class645_sub1_sub5_sub1.anIntArray11781[i_0_];
		if (i_1_ == -1) {
		    if (!class645_sub1_sub5_sub1.method10666(i_0_, -1,
							     -2073110416))
			bool = false;
		} else {
		    bool = false;
		    boolean bool_2_ = false;
		    boolean bool_3_ = false;
		    Class422 class422
			= class645_sub1_sub5_sub1.method7693().aClass422_4868;
		    int i_4_;
		    int i_5_;
		    if ((i_1_ & ~0x3fffffff) == -1073741824) {
			int i_6_ = i_1_ & 0xfffffff;
			int i_7_ = i_6_ >> 14;
			int i_8_ = i_6_ & 0x3fff;
			i_4_
			    = ((int) class422.aFloat4780
			       - ((i_7_ - class578.anInt7607 * 961465569) * 512
				  + 256));
			i_5_ = ((int) class422.aFloat4777
				- (256
				   + ((i_8_ - class578.anInt7608 * -173815201)
				      * 512)));
		    } else if ((i_1_ & 0x8000) != 0) {
			int i_9_ = i_1_ & 0x7fff;
			Player class645_sub1_sub5_sub1_sub2
			    = (client.localPlayers
			       [i_9_]);
			if (null != class645_sub1_sub5_sub1_sub2) {
			    Class422 class422_10_
				= (class645_sub1_sub5_sub1_sub2.method7693()
				   .aClass422_4868);
			    i_4_ = ((int) class422.aFloat4780
				    - (int) class422_10_.aFloat4780);
			    i_5_ = ((int) class422.aFloat4777
				    - (int) class422_10_.aFloat4777);
			} else {
			    class645_sub1_sub5_sub1.method10666(i_0_, -1,
								-2073110416);
			    continue;
			}
		    } else {
			Class528_Sub31 class528_sub31
			    = ((Class528_Sub31)
			       client.aClass692_11110.method8137((long) i_1_));
			if (class528_sub31 != null) {
			    NPC class645_sub1_sub5_sub1_sub1
				= ((NPC)
				   class528_sub31.anObject10468);
			    Class422 class422_11_
				= (class645_sub1_sub5_sub1_sub1.method7693()
				   .aClass422_4868);
			    i_4_ = ((int) class422.aFloat4780
				    - (int) class422_11_.aFloat4780);
			    i_5_ = ((int) class422.aFloat4777
				    - (int) class422_11_.aFloat4777);
			} else {
			    class645_sub1_sub5_sub1.method10666(i_0_, -1,
								-2073110416);
			    continue;
			}
		    }
		    if (0 != i_4_ || 0 != i_5_)
			class645_sub1_sub5_sub1.method10666
			    (i_0_,
			     (int) (Math.atan2((double) i_4_, (double) i_5_)
				    * 2607.5945876176133) & 0x3fff,
			     -2073110416);
		}
	    }
	    if (bool) {
		class645_sub1_sub5_sub1.anIntArray11781 = null;
		class645_sub1_sub5_sub1.anIntArray11805 = null;
	    }
	}
    }
    
    static void method7132(Class173 class173, int i, int i_12_, int i_13_,
			   int i_14_, int i_15_, Class172 class172,
			   Class1 class1, String string, int i_16_) {
	int i_17_ = (255 - -321135221 * Class300.anInt3340
		     - Class28.anInt292 * -1078323881);
	if (i_17_ < 0)
	    i_17_ = 0;
	if (null == Class444.aClass151_4916 || Class40.aClass151_522 == null) {
	    if (Class623_Sub1.aClass446_10671.method5357((Class293.anInt3222
							  * -690345991),
							 (short) -30968)
		&& Class623_Sub1.aClass446_10671.method5357((Class226.anInt2338
							     * 1494420091),
							    (short) 10784)) {
		Class444.aClass151_4916
		    = (class173.method2334
		       (Class175.method2561(Class623_Sub1.aClass446_10671,
					    -690345991 * Class293.anInt3222,
					    0),
			true));
		Class178 class178
		    = Class175.method2561(Class623_Sub1.aClass446_10671,
					  Class226.anInt2338 * 1494420091, 0);
		Class40.aClass151_522 = class173.method2334(class178, true);
		class178.method2623();
		Class638.aClass151_8253 = class173.method2334(class178, true);
	    } else
		class173.method2216(i, i_12_, i_13_, i_15_,
				    i_17_ << 24 | 860447335 * Class28.anInt291,
				    1);
	}
	if (Class444.aClass151_4916 != null && null != Class40.aClass151_522) {
	    int i_18_ = ((i_13_ - Class40.aClass151_522.method1766() * 2)
			 / Class444.aClass151_4916.method1766());
	    for (int i_19_ = 0; i_19_ < i_18_; i_19_++)
		Class444.aClass151_4916.method1773
		    ((i + Class40.aClass151_522.method1766()
		      + i_19_ * Class444.aClass151_4916.method1766()),
		     i_12_);
	    Class40.aClass151_522.method1773(i, i_12_);
	    Class638.aClass151_8253.method1773(i + i_13_ - Class638
							       .aClass151_8253
							       .method1766(),
					       i_12_);
	}
	class172.method2120(string, 3 + i,
			    (i_12_ + class1.anInt12 * -55898191
			     + (20 - -55898191 * class1.anInt12) / 2),
			    Class212.anInt2249 * 284609883 | ~0xffffff, -1,
			    (byte) 96);
	class173.method2216(i, i_12_ + i_15_, i_13_, i_14_ - i_15_,
			    i_17_ << 24 | Class28.anInt291 * 860447335, 1);
    }
    
    static final void method7133(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = client.aBool10899 ? 1 : 0;
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = client.aString11175 == null ? "" : client.aString11175;
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = null == client.aString10902 ? "" : client.aString10902;
    }
    
    static final void method7134(Class648 class648, int i) {
	int i_20_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = i_20_ >> 14 & 0x3fff;
    }
}
