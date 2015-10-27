/* Class304 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class304
{
    static Class229[] aClass229Array3347;
    
    public Class304(int i) {
	/* empty */
    }
    
    static final void method4046(Class648 class648, int i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class570.playerVarsProvider.method1248(i_0_, 705885671);
    }
    
    static final void method4047(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_1_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_2_ = (((Class648) class648).anIntArray8394
		    [1 + 717927929 * ((Class648) class648).anInt8395]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class182.method2699(i_1_, i_2_, true, false, -836605493);
    }
    
    static final void method4048
	(Class648 class648, Entity class645_sub1_sub5_sub1,
	 int i) {
	((Class648) class648).anInt8395 -= 83224063;
	int i_3_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_4_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929 + 1]);
	int i_5_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929 + 2]);
	int i_6_ = (((Class648) class648).anIntArray8394
		    [3 + ((Class648) class648).anInt8395 * 717927929]);
	int i_7_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929 + 4]);
	boolean bool
	    = 1 == (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929 + 5]);
	int i_8_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929 + 6]);
	if (Class495.aClass283_Sub1_5578.method3787((byte) -76)
	    != Class297.aClass297_3251)
	    throw new RuntimeException();
	Class326_Sub1 class326_sub1
	    = ((Class326_Sub1)
	       Class495.aClass283_Sub1_5578.method3811(-1281353363));
	Class430 class430 = new Class430();
	Class430 class430_9_ = new Class430();
	class430.method5168(0.0F, 1.0F, 0.0F,
			    (float) (2.0 * (3.141592653589793 * (double) i_7_)
				     / 16384.0));
	Class422 class422 = new Class422(1.0F, 0.0F, 0.0F);
	class422.method5075(class430);
	class422.method5061();
	class430_9_.method5167(class422,
			       (float) (2.0
					* ((double) i_6_ * 3.141592653589793)
					/ 16384.0));
	class430.method5176(class430_9_);
	Class578 class578 = client.gameScene.method5966(1273279609);
	int i_10_ = 961465569 * class578.anInt7607 << 9;
	int i_11_ = class578.anInt7608 * -173815201 << 9;
	if (null != class645_sub1_sub5_sub1)
	    class326_sub1.method9084(class645_sub1_sub5_sub1,
				     new Class422((float) i_3_, (float) i_4_,
						  (float) i_5_),
				     class430, bool, i_8_,
				     (client.gameScene.method6024
				      (-765386834).anIntArrayArrayArray5087),
				     client.gameScene
					 .method6006((byte) 0),
				     i_10_, i_11_, -168323650);
	client.aBool10982 = true;
    }
    
    static final void method4049(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub17_10585
		  .method9955(-507461306);
    }
    
    static final void method4050(Class173 class173, int i, int i_12_,
				 int i_13_, int i_14_, int i_15_) {
	class173.method2204(i, i_12_, i + i_13_, i_14_ + i_12_);
	class173.method2210(i, i_12_, i_13_, i_14_, -16777216, -1393763348);
	if (Class518_Sub1.anInt10685 * -962898353 >= 100) {
	    float f = ((float) Class518_Sub1.anInt6997
		       / (float) Class518_Sub1.anInt6982);
	    int i_16_ = i_13_;
	    int i_17_ = i_14_;
	    if (f < 1.0F)
		i_17_ = (int) ((float) i_13_ * f);
	    else
		i_16_ = (int) ((float) i_14_ / f);
	    i += (i_13_ - i_16_) / 2;
	    i_12_ += (i_14_ - i_17_) / 2;
	    if (null == Class181_Sub16.aClass151_9835
		|| Class181_Sub16.aClass151_9835.method1766() != i_16_
		|| Class181_Sub16.aClass151_9835.method1767() != i_17_) {
		Class518_Sub1.aClass186_6994 = Class518_Sub1.aClass186_7028;
		Class518_Sub1.method6324(Class518_Sub1.anInt6972,
					 (Class518_Sub1.anInt6995
					  + Class518_Sub1.anInt6997),
					 (Class518_Sub1.anInt6972
					  + Class518_Sub1.anInt6982),
					 Class518_Sub1.anInt6995, i, i_12_,
					 i_16_ + i, i_17_ + i_12_);
		Class518_Sub1.method6289(class173, false, false,
					 client.aBool10966, true);
		class173.method2235();
		Class181_Sub16.aClass151_9835
		    = class173.method2234(i, i_12_, i_16_, i_17_, true);
	    }
	    Class181_Sub16.aClass151_9835.method1773(i, i_12_);
	    int i_18_ = (-1709843599 * Class300_Sub1.anInt9902 * i_16_
			 / Class518_Sub1.anInt6982);
	    int i_19_ = (Class686.anInt8615 * 553512021 * i_17_
			 / Class518_Sub1.anInt6997);
	    int i_20_ = ((-43438893 * Class224.anInt2331 * i_16_
			  / Class518_Sub1.anInt6982)
			 + i);
	    int i_21_
		= i_12_ + i_17_ - (i_17_ * (1628441697 * Class687.anInt8654)
				   / Class518_Sub1.anInt6997) - i_19_;
	    int i_22_ = -1996554240;
	    if (client.aClass673_11108 == Class673.aClass673_8531)
		i_22_ = -1996488705;
	    class173.method2216(i_20_, i_21_, i_18_, i_19_, i_22_, 1);
	    class173.method2215(i_20_, i_21_, i_18_, i_19_, i_22_, 0);
	    for (Class528_Sub25 class528_sub25
		     = ((Class528_Sub25)
			Class518_Sub1.aClass688_6993.method8034(1389992859));
		 null != class528_sub25;
		 class528_sub25
		     = ((Class528_Sub25)
			Class518_Sub1.aClass688_6993.method8037(202653660))) {
		Class239 class239
		    = (Class239) (Class518_Sub1.aClass5_Sub6_6975.method63
				  (-123895777 * class528_sub25.anInt10420,
				   -1840412267));
		if (Class567.method6841(class239, -1656694175)) {
		    Class57 class57
			= (Class57) (Class518_Sub1.aHashMap10694.get
				     (Integer.valueOf(class528_sub25.anInt10420
						      * -123895777)));
		    if (class57 == null)
			class57 = ((Class57)
				   (Class518_Sub1.aHashMap10688.get
				    (Integer.valueOf(-1770862541
						     * class239.anInt2649))));
		    if (null != class57) {
			int i_23_;
			if (520061451 * ((Class57) class57).anInt684
			    > -478747133 * Class518_Sub1.anInt10683 / 2)
			    i_23_
				= ((-1821434627 * Class518_Sub1.anInt10683
				    - (((Class57) class57).anInt684
				       * -528316171))
				   / (-478747133 * Class518_Sub1.anInt10683));
			else
			    i_23_
				= (((Class57) class57).anInt684 * -528316171
				   / (Class518_Sub1.anInt10683 * -478747133));
			int i_24_ = ((class528_sub25.anInt10424 * -1196920295
				      * i_16_ / Class518_Sub1.anInt6982)
				     + i);
			int i_25_
			    = (i_12_
			       + ((Class518_Sub1.anInt6997
				   - 1481938899 * class528_sub25.anInt10423)
				  * i_17_ / Class518_Sub1.anInt6997));
			class173.method2210(i_24_ - 2, i_25_ - 2, 4, 4,
					    i_23_ << 24 | 0xffff00, 697664443);
		    }
		}
	    }
	    Class518_Sub1.aClass186_7028.method2747(5, 1582935054);
	}
    }
    
    public static Class528_Sub33_Sub2 method4051(int i, int i_26_, int i_27_,
						 int i_28_, int i_29_) {
	synchronized (Class528_Sub33_Sub2.aClass528_Sub33_Sub2Array11679) {
	    Class528_Sub33_Sub2 class528_sub33_sub2;
	    if (0 == Class528_Sub9.anInt10290 * 230625481)
		class528_sub33_sub2 = new Class528_Sub33_Sub2();
	    else
		class528_sub33_sub2
		    = (Class528_Sub33_Sub2.aClass528_Sub33_Sub2Array11679
		       [(Class528_Sub9.anInt10290 -= -146142855) * 230625481]);
	    ((Class528_Sub33_Sub2) class528_sub33_sub2).anInt11683
		= 1976452661 * i;
	    ((Class528_Sub33_Sub2) class528_sub33_sub2).anInt11684
		= -808739207 * i_26_;
	    ((Class528_Sub33_Sub2) class528_sub33_sub2).anInt11680
		= i_27_ * 498266579;
	    ((Class528_Sub33_Sub2) class528_sub33_sub2).anInt11650
		= 1477160581 * i_28_;
	    ((Class528_Sub33_Sub2) class528_sub33_sub2).aLong11682
		= Class249.method3417(2045058404) * 4670151039730900601L;
	    Class528_Sub33_Sub2 class528_sub33_sub2_30_ = class528_sub33_sub2;
	    return class528_sub33_sub2_30_;
	}
    }
}
