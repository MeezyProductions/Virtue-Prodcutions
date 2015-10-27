/* Class645_Sub1_Sub5_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class645_Sub1_Sub5_Sub3 extends Class645_Sub1_Sub5
    implements Interface60
{
    int anInt11861;
    Class5_Sub15 aClass5_Sub15_11862;
    Class528_Sub21_Sub12 aClass528_Sub21_Sub12_11863;
    Class554 aClass554_11864;
    boolean aBool11865;
    byte aByte11866;
    byte aByte11867;
    boolean aBool11868;
    Class157 aClass157_11869;
    boolean aBool11870;
    boolean aBool11871;
    boolean aBool11872;
    
    public Class554 method9795(Class173 class173) {
	Class422 class422 = method7693().aClass422_4868;
	if (null == ((Class645_Sub1_Sub5_Sub3) this).aClass554_11864)
	    ((Class645_Sub1_Sub5_Sub3) this).aClass554_11864
		= Class372.method4680((int) class422.aFloat4780,
				      (int) class422.aFloat4776,
				      (int) class422.aFloat4777,
				      method10758(class173, 0, 2132629925),
				      825441132);
	return ((Class645_Sub1_Sub5_Sub3) this).aClass554_11864;
    }
    
    boolean method9797(int i) {
	if (null != ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869)
	    return !((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
			.method1920();
	return true;
    }
    
    public int method397(short i) {
	return 1012446263 * ((Class645_Sub1_Sub5_Sub3) this).anInt11861;
    }
    
    public int method9819(int i) {
	return (null != ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
		? ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869.method2018()
		: 0);
    }
    
    Class157 method10758(Class173 class173, int i, int i_0_) {
	if (null != ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
	    && class173.method2245(((Class645_Sub1_Sub5_Sub3) this)
				       .aClass157_11869.method1874(),
				   i) == 0)
	    return ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869;
	Class20 class20 = method10761(class173, i, false, 1782602902);
	if (class20 != null)
	    return (Class157) class20.anObject208;
	return null;
    }
    
    Class20 method10759(Class173 class173, int i, boolean bool) {
	Class596 class596
	    = ((Class596)
	       (((Class645_Sub1_Sub5_Sub3) this).aClass5_Sub15_11862.method63
		(((Class645_Sub1_Sub5_Sub3) this).anInt11861 * 1012446263,
		 -1564886437)));
	Class137 class137;
	Class137 class137_1_;
	if (((Class645_Sub1_Sub5_Sub3) this).aBool11868) {
	    class137 = aClass538_10676.aClass137Array7202[aByte10674];
	    class137_1_ = aClass538_10676.aClass137Array7163[0];
	} else {
	    class137 = aClass538_10676.aClass137Array7163[aByte10674];
	    if (aByte10674 < 3)
		class137_1_
		    = aClass538_10676.aClass137Array7163[1 + aByte10674];
	    else
		class137_1_ = null;
	}
	Class422 class422 = method7693().aClass422_4868;
	return (class596.method7097
		(class173, i,
		 ((((Class645_Sub1_Sub5_Sub3) this).aByte11866
		   != Class605.aClass605_7912.anInt7905 * 1922173025)
		  ? (int) ((Class645_Sub1_Sub5_Sub3) this).aByte11866
		  : Class605.aClass605_7893.anInt7905 * 1922173025),
		 ((Class605.aClass605_7912.anInt7905 * 1922173025
		   == ((Class645_Sub1_Sub5_Sub3) this).aByte11866)
		  ? (int) (((Class645_Sub1_Sub5_Sub3) this).aByte11867 + 4)
		  : ((Class645_Sub1_Sub5_Sub3) this).aByte11867),
		 class137, class137_1_, (int) class422.aFloat4780,
		 (int) class422.aFloat4776, (int) class422.aFloat4777, bool,
		 null, (byte) -110));
    }
    
    void method9777(int i) {
	((Class645_Sub1_Sub5_Sub3) this).aBool11870 = false;
	if (((Class645_Sub1_Sub5_Sub3) this).aClass157_11869 != null)
	    ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869.method1873
		(((Class645_Sub1_Sub5_Sub3) this).aClass157_11869.method1874()
		 & ~0x10000);
    }
    
    Class549 method9813(Class173 class173, int i) {
	if (((Class645_Sub1_Sub5_Sub3) this).aClass157_11869 == null)
	    return null;
	Class433 class433 = method7685();
	Class549 class549
	    = Class623.method7435(((Class645_Sub1_Sub5_Sub3) this).aBool11871,
				  1848205872);
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub5_Sub3) this).aClass5_Sub15_11862.method63
		 (1012446263 * ((Class645_Sub1_Sub5_Sub3) this).anInt11861,
		  -1113385357)))
	       .aClass431_7800);
	if (class431 != null) {
	    ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
		.method1897(class433, null, 0);
	    class173.method2227(class433, aClass159Array10678[0], class431);
	} else
	    ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
		.method1897(class433, aClass159Array10678[0], 0);
	return class549;
    }
    
    void method9779(Class173 class173, int i) {
	/* empty */
    }
    
    boolean method9820(Class173 class173, int i, int i_2_, byte i_3_) {
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub5_Sub3) this).aClass5_Sub15_11862.method63
		 (1012446263 * ((Class645_Sub1_Sub5_Sub3) this).anInt11861,
		  1224718639)))
	       .aClass431_7800);
	if (class431 != null)
	    return class173.method2225(i, i_2_, method7685(), class431,
				       (byte) 2);
	Class157 class157 = method10758(class173, 131072, 2136404644);
	if (null != class157) {
	    Class433 class433 = method7685();
	    return class157.method2000(i, i_2_, class433, false, 0);
	}
	return false;
    }
    
    void method9798(Class173 class173, Class645_Sub1 class645_sub1, int i,
		    int i_4_, int i_5_, boolean bool, int i_6_) {
	if (class645_sub1 instanceof Class645_Sub1_Sub3_Sub2) {
	    Class645_Sub1_Sub3_Sub2 class645_sub1_sub3_sub2
		= (Class645_Sub1_Sub3_Sub2) class645_sub1;
	    if (null != ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
		&& (((Class645_Sub1_Sub3_Sub2) class645_sub1_sub3_sub2)
		    .aClass157_11884) != null)
		((Class645_Sub1_Sub5_Sub3) this).aClass157_11869.method1872
		    ((((Class645_Sub1_Sub3_Sub2) class645_sub1_sub3_sub2)
		      .aClass157_11884),
		     i, i_4_, i_5_, bool);
	} else if (class645_sub1 instanceof Class645_Sub1_Sub5_Sub3) {
	    Class645_Sub1_Sub5_Sub3 class645_sub1_sub5_sub3_7_
		= (Class645_Sub1_Sub5_Sub3) class645_sub1;
	    if (null != ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
		&& null != ((Class645_Sub1_Sub5_Sub3)
			    class645_sub1_sub5_sub3_7_).aClass157_11869)
		((Class645_Sub1_Sub5_Sub3) this).aClass157_11869.method1872
		    ((((Class645_Sub1_Sub5_Sub3) class645_sub1_sub5_sub3_7_)
		      .aClass157_11869),
		     i, i_4_, i_5_, bool);
	}
    }
    
    Class549 method9787(Class173 class173) {
	if (((Class645_Sub1_Sub5_Sub3) this).aClass157_11869 == null)
	    return null;
	Class433 class433 = method7685();
	Class549 class549
	    = Class623.method7435(((Class645_Sub1_Sub5_Sub3) this).aBool11871,
				  -1751474589);
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub5_Sub3) this).aClass5_Sub15_11862.method63
		 (1012446263 * ((Class645_Sub1_Sub5_Sub3) this).anInt11861,
		  -1708043804)))
	       .aClass431_7800);
	if (class431 != null) {
	    ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
		.method1897(class433, null, 0);
	    class173.method2227(class433, aClass159Array10678[0], class431);
	} else
	    ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
		.method1897(class433, aClass159Array10678[0], 0);
	return class549;
    }
    
    public boolean method386(int i) {
	return ((Class645_Sub1_Sub5_Sub3) this).aBool11865;
    }
    
    public void method334() {
	if (((Class645_Sub1_Sub5_Sub3) this).aClass157_11869 != null)
	    ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869.method1875();
    }
    
    public int method384(int i) {
	return ((Class645_Sub1_Sub5_Sub3) this).aByte11867;
    }
    
    public void method385(int i) {
	if (((Class645_Sub1_Sub5_Sub3) this).aClass157_11869 != null)
	    ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869.method1875();
    }
    
    public Class645_Sub1_Sub5_Sub3
	(Class538 class538, Class173 class173, Class5_Sub15 class5_sub15,
	 Class596 class596, int i, int i_8_, int i_9_, int i_10_, int i_11_,
	 boolean bool, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_,
	 int i_17_, boolean bool_18_, boolean bool_19_) {
	super(class538, i, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_, i_14_,
	      i_15_, 1 == class596.anInt7818 * -2062997247,
	      Class227.method3184(i_16_, i_17_, 16711680));
	((Class645_Sub1_Sub5_Sub3) this).aClass5_Sub15_11862 = class5_sub15;
	((Class645_Sub1_Sub5_Sub3) this).anInt11861
	    = 633042051 * class596.anInt7765;
	aByte10674 = (byte) i_8_;
	((Class645_Sub1_Sub5_Sub3) this).aBool11868 = bool;
	((Class645_Sub1_Sub5_Sub3) this).aByte11866 = (byte) i_16_;
	((Class645_Sub1_Sub5_Sub3) this).aByte11867 = (byte) i_17_;
	((Class645_Sub1_Sub5_Sub3) this).aBool11871
	    = class596.anInt7785 * 567849393 != 0 && !bool;
	((Class645_Sub1_Sub5_Sub3) this).aBool11870 = bool_18_;
	((Class645_Sub1_Sub5_Sub3) this).aBool11865
	    = (class173.method2163() && class596.aBool7819
	       && !((Class645_Sub1_Sub5_Sub3) this).aBool11868
	       && Class514.aClass528_Sub38_6967.aClass691_Sub8_10565
		      .method9883(1849635440) != 0);
	((Class645_Sub1_Sub5_Sub3) this).aBool11872 = bool_19_;
	int i_20_ = 2048;
	if (((Class645_Sub1_Sub5_Sub3) this).aBool11870)
	    i_20_ |= 0x10000;
	if (class596.aBool7768)
	    i_20_ |= 0x80000;
	Class20 class20
	    = method10761(class173, i_20_,
			  ((Class645_Sub1_Sub5_Sub3) this).aBool11865,
			  -592907489);
	if (null != class20) {
	    ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
		= (Class157) class20.anObject208;
	    ((Class645_Sub1_Sub5_Sub3) this).aClass528_Sub21_Sub12_11863
		= (Class528_Sub21_Sub12) class20.anObject209;
	    if (((Class645_Sub1_Sub5_Sub3) this).aBool11870
		|| class596.aBool7768) {
		((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
		    = ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
			  .method1951((byte) 0, i_20_, false);
		if (class596.aBool7768) {
		    Class491 class491
			= client.gameScene.method6004(-735391224);
		    ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869.method1917
			(-1316786341 * class491.anInt5514,
			 -380000269 * class491.anInt5512,
			 383347061 * class491.anInt5513,
			 class491.anInt5515 * 771824171);
		}
	    }
	}
	method9786(1, 1634216050);
    }
    
    boolean method9775(short i) {
	if (((Class645_Sub1_Sub5_Sub3) this).aClass157_11869 != null)
	    return ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
		       .method1919();
	return false;
    }
    
    public void method388(Class173 class173, int i) {
	Object object = null;
	Class528_Sub21_Sub12 class528_sub21_sub12;
	if ((((Class645_Sub1_Sub5_Sub3) this).aClass528_Sub21_Sub12_11863
	     == null)
	    && ((Class645_Sub1_Sub5_Sub3) this).aBool11865) {
	    Class20 class20 = method10761(class173, 262144, true, 1801536823);
	    class528_sub21_sub12
		= (Class528_Sub21_Sub12) (class20 != null ? class20.anObject209
					  : null);
	} else {
	    class528_sub21_sub12
		= ((Class645_Sub1_Sub5_Sub3) this).aClass528_Sub21_Sub12_11863;
	    ((Class645_Sub1_Sub5_Sub3) this).aClass528_Sub21_Sub12_11863
		= null;
	}
	Class422 class422 = method7693().aClass422_4868;
	if (null != class528_sub21_sub12)
	    aClass538_10676.method6581(class528_sub21_sub12, aByte10674,
				       (int) class422.aFloat4780,
				       (int) class422.aFloat4777, null,
				       (byte) -100);
    }
    
    public int method390() {
	return ((Class645_Sub1_Sub5_Sub3) this).aByte11867;
    }
    
    public int method10760(int i) {
	return (((Class645_Sub1_Sub5_Sub3) this).aClass157_11869 != null
		? ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
		      .method1937() / 4
		: 15);
    }
    
    public int method73() {
	return 1012446263 * ((Class645_Sub1_Sub5_Sub3) this).anInt11861;
    }
    
    public Class554 method9780(Class173 class173, int i) {
	Class422 class422 = method7693().aClass422_4868;
	if (null == ((Class645_Sub1_Sub5_Sub3) this).aClass554_11864)
	    ((Class645_Sub1_Sub5_Sub3) this).aClass554_11864
		= Class372.method4680((int) class422.aFloat4780,
				      (int) class422.aFloat4776,
				      (int) class422.aFloat4777,
				      method10758(class173, 0, 2132244094),
				      663960630);
	return ((Class645_Sub1_Sub5_Sub3) this).aClass554_11864;
    }
    
    boolean method9791() {
	if (((Class645_Sub1_Sub5_Sub3) this).aClass157_11869 != null)
	    return ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
		       .method1919();
	return false;
    }
    
    public int method168(int i) {
	return ((Class645_Sub1_Sub5_Sub3) this).aByte11866;
    }
    
    public int method74() {
	return ((Class645_Sub1_Sub5_Sub3) this).aByte11866;
    }
    
    boolean method9801(Class173 class173, int i, int i_21_) {
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub5_Sub3) this).aClass5_Sub15_11862.method63
		 (1012446263 * ((Class645_Sub1_Sub5_Sub3) this).anInt11861,
		  1113907815)))
	       .aClass431_7800);
	if (class431 != null)
	    return class173.method2225(i, i_21_, method7685(), class431,
				       (byte) 2);
	Class157 class157 = method10758(class173, 131072, 2132953659);
	if (null != class157) {
	    Class433 class433 = method7685();
	    return class157.method2000(i, i_21_, class433, false, 0);
	}
	return false;
    }
    
    boolean method9771(int i) {
	return ((Class645_Sub1_Sub5_Sub3) this).aBool11870;
    }
    
    public int method394() {
	return ((Class645_Sub1_Sub5_Sub3) this).aByte11867;
    }
    
    public boolean method391() {
	return ((Class645_Sub1_Sub5_Sub3) this).aBool11865;
    }
    
    public boolean method396() {
	return ((Class645_Sub1_Sub5_Sub3) this).aBool11872;
    }
    
    public boolean method271() {
	return ((Class645_Sub1_Sub5_Sub3) this).aBool11872;
    }
    
    void method9804(Class173 class173, Class645_Sub1 class645_sub1, int i,
		    int i_22_, int i_23_, boolean bool) {
	if (class645_sub1 instanceof Class645_Sub1_Sub3_Sub2) {
	    Class645_Sub1_Sub3_Sub2 class645_sub1_sub3_sub2
		= (Class645_Sub1_Sub3_Sub2) class645_sub1;
	    if (null != ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
		&& (((Class645_Sub1_Sub3_Sub2) class645_sub1_sub3_sub2)
		    .aClass157_11884) != null)
		((Class645_Sub1_Sub5_Sub3) this).aClass157_11869.method1872
		    ((((Class645_Sub1_Sub3_Sub2) class645_sub1_sub3_sub2)
		      .aClass157_11884),
		     i, i_22_, i_23_, bool);
	} else if (class645_sub1 instanceof Class645_Sub1_Sub5_Sub3) {
	    Class645_Sub1_Sub5_Sub3 class645_sub1_sub5_sub3_24_
		= (Class645_Sub1_Sub5_Sub3) class645_sub1;
	    if (null != ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
		&& null != ((Class645_Sub1_Sub5_Sub3)
			    class645_sub1_sub5_sub3_24_).aClass157_11869)
		((Class645_Sub1_Sub5_Sub3) this).aClass157_11869.method1872
		    ((((Class645_Sub1_Sub5_Sub3) class645_sub1_sub5_sub3_24_)
		      .aClass157_11869),
		     i, i_22_, i_23_, bool);
	}
    }
    
    public void method392(Class173 class173) {
	Object object = null;
	Class528_Sub21_Sub12 class528_sub21_sub12;
	if ((((Class645_Sub1_Sub5_Sub3) this).aClass528_Sub21_Sub12_11863
	     == null)
	    && ((Class645_Sub1_Sub5_Sub3) this).aBool11865) {
	    Class20 class20 = method10761(class173, 262144, true, 2077291138);
	    class528_sub21_sub12
		= (Class528_Sub21_Sub12) (class20 != null ? class20.anObject209
					  : null);
	} else {
	    class528_sub21_sub12
		= ((Class645_Sub1_Sub5_Sub3) this).aClass528_Sub21_Sub12_11863;
	    ((Class645_Sub1_Sub5_Sub3) this).aClass528_Sub21_Sub12_11863
		= null;
	}
	Class422 class422 = method7693().aClass422_4868;
	if (null != class528_sub21_sub12)
	    aClass538_10676.method6568(class528_sub21_sub12, aByte10674,
				       (int) class422.aFloat4780,
				       (int) class422.aFloat4777, null,
				       2139962113);
    }
    
    public void method398(Class173 class173) {
	Object object = null;
	Class528_Sub21_Sub12 class528_sub21_sub12;
	if ((((Class645_Sub1_Sub5_Sub3) this).aClass528_Sub21_Sub12_11863
	     == null)
	    && ((Class645_Sub1_Sub5_Sub3) this).aBool11865) {
	    Class20 class20 = method10761(class173, 262144, true, 2114876771);
	    class528_sub21_sub12
		= (Class528_Sub21_Sub12) (class20 != null ? class20.anObject209
					  : null);
	} else {
	    class528_sub21_sub12
		= ((Class645_Sub1_Sub5_Sub3) this).aClass528_Sub21_Sub12_11863;
	    ((Class645_Sub1_Sub5_Sub3) this).aClass528_Sub21_Sub12_11863
		= null;
	}
	Class422 class422 = method7693().aClass422_4868;
	if (null != class528_sub21_sub12)
	    aClass538_10676.method6568(class528_sub21_sub12, aByte10674,
				       (int) class422.aFloat4780,
				       (int) class422.aFloat4777, null,
				       2146842662);
    }
    
    boolean method9772() {
	if (null != ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869)
	    return !((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
			.method1920();
	return true;
    }
    
    boolean method9783() {
	if (null != ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869)
	    return !((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
			.method1920();
	return true;
    }
    
    boolean method9789() {
	if (null != ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869)
	    return !((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
			.method1920();
	return true;
    }
    
    boolean method9790() {
	if (((Class645_Sub1_Sub5_Sub3) this).aClass157_11869 != null)
	    return ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
		       .method1919();
	return false;
    }
    
    Class20 method10761(Class173 class173, int i, boolean bool, int i_25_) {
	Class596 class596
	    = ((Class596)
	       (((Class645_Sub1_Sub5_Sub3) this).aClass5_Sub15_11862.method63
		(((Class645_Sub1_Sub5_Sub3) this).anInt11861 * 1012446263,
		 -753672599)));
	Class137 class137;
	Class137 class137_26_;
	if (((Class645_Sub1_Sub5_Sub3) this).aBool11868) {
	    class137 = aClass538_10676.aClass137Array7202[aByte10674];
	    class137_26_ = aClass538_10676.aClass137Array7163[0];
	} else {
	    class137 = aClass538_10676.aClass137Array7163[aByte10674];
	    if (aByte10674 < 3)
		class137_26_
		    = aClass538_10676.aClass137Array7163[1 + aByte10674];
	    else
		class137_26_ = null;
	}
	Class422 class422 = method7693().aClass422_4868;
	return (class596.method7097
		(class173, i,
		 ((((Class645_Sub1_Sub5_Sub3) this).aByte11866
		   != Class605.aClass605_7912.anInt7905 * 1922173025)
		  ? (int) ((Class645_Sub1_Sub5_Sub3) this).aByte11866
		  : Class605.aClass605_7893.anInt7905 * 1922173025),
		 ((Class605.aClass605_7912.anInt7905 * 1922173025
		   == ((Class645_Sub1_Sub5_Sub3) this).aByte11866)
		  ? (int) (((Class645_Sub1_Sub5_Sub3) this).aByte11867 + 4)
		  : ((Class645_Sub1_Sub5_Sub3) this).aByte11867),
		 class137, class137_26_, (int) class422.aFloat4780,
		 (int) class422.aFloat4776, (int) class422.aFloat4777, bool,
		 null, (byte) -86));
    }
    
    public int method9792() {
	return (null != ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
		? ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869.method2018()
		: 0);
    }
    
    public int method9793() {
	return (null != ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
		? ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869.method2018()
		: 0);
    }
    
    public Class554 method9794(Class173 class173) {
	Class422 class422 = method7693().aClass422_4868;
	if (null == ((Class645_Sub1_Sub5_Sub3) this).aClass554_11864)
	    ((Class645_Sub1_Sub5_Sub3) this).aClass554_11864
		= Class372.method4680((int) class422.aFloat4780,
				      (int) class422.aFloat4776,
				      (int) class422.aFloat4777,
				      method10758(class173, 0, 2142840598),
				      -1660546046);
	return ((Class645_Sub1_Sub5_Sub3) this).aClass554_11864;
    }
    
    public int method393() {
	return ((Class645_Sub1_Sub5_Sub3) this).aByte11867;
    }
    
    public boolean method387(byte i) {
	return ((Class645_Sub1_Sub5_Sub3) this).aBool11872;
    }
    
    public void method203() {
	if (((Class645_Sub1_Sub5_Sub3) this).aClass157_11869 != null)
	    ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869.method1875();
    }
    
    Class549 method9776(Class173 class173) {
	if (((Class645_Sub1_Sub5_Sub3) this).aClass157_11869 == null)
	    return null;
	Class433 class433 = method7685();
	Class549 class549
	    = Class623.method7435(((Class645_Sub1_Sub5_Sub3) this).aBool11871,
				  -351074254);
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub5_Sub3) this).aClass5_Sub15_11862.method63
		 (1012446263 * ((Class645_Sub1_Sub5_Sub3) this).anInt11861,
		  -2012048669)))
	       .aClass431_7800);
	if (class431 != null) {
	    ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
		.method1897(class433, null, 0);
	    class173.method2227(class433, aClass159Array10678[0], class431);
	} else
	    ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
		.method1897(class433, aClass159Array10678[0], 0);
	return class549;
    }
    
    void method9800(Class173 class173) {
	/* empty */
    }
    
    boolean method9774(Class173 class173, int i, int i_27_) {
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub5_Sub3) this).aClass5_Sub15_11862.method63
		 (1012446263 * ((Class645_Sub1_Sub5_Sub3) this).anInt11861,
		  1181646534)))
	       .aClass431_7800);
	if (class431 != null)
	    return class173.method2225(i, i_27_, method7685(), class431,
				       (byte) 2);
	Class157 class157 = method10758(class173, 131072, 2142333954);
	if (null != class157) {
	    Class433 class433 = method7685();
	    return class157.method2000(i, i_27_, class433, false, 0);
	}
	return false;
    }
    
    boolean method9802() {
	return ((Class645_Sub1_Sub5_Sub3) this).aBool11870;
    }
    
    boolean method9803() {
	return ((Class645_Sub1_Sub5_Sub3) this).aBool11870;
    }
    
    Class549 method9778(Class173 class173) {
	if (((Class645_Sub1_Sub5_Sub3) this).aClass157_11869 == null)
	    return null;
	Class433 class433 = method7685();
	Class549 class549
	    = Class623.method7435(((Class645_Sub1_Sub5_Sub3) this).aBool11871,
				  2084969464);
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub5_Sub3) this).aClass5_Sub15_11862.method63
		 (1012446263 * ((Class645_Sub1_Sub5_Sub3) this).anInt11861,
		  -340820732)))
	       .aClass431_7800);
	if (class431 != null) {
	    ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
		.method1897(class433, null, 0);
	    class173.method2227(class433, aClass159Array10678[0], class431);
	} else
	    ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
		.method1897(class433, aClass159Array10678[0], 0);
	return class549;
    }
    
    void method9805() {
	((Class645_Sub1_Sub5_Sub3) this).aBool11870 = false;
	if (((Class645_Sub1_Sub5_Sub3) this).aClass157_11869 != null)
	    ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869.method1873
		(((Class645_Sub1_Sub5_Sub3) this).aClass157_11869.method1874()
		 & ~0x10000);
    }
    
    void method9808() {
	((Class645_Sub1_Sub5_Sub3) this).aBool11870 = false;
	if (((Class645_Sub1_Sub5_Sub3) this).aClass157_11869 != null)
	    ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869.method1873
		(((Class645_Sub1_Sub5_Sub3) this).aClass157_11869.method1874()
		 & ~0x10000);
    }
    
    void method9806() {
	((Class645_Sub1_Sub5_Sub3) this).aBool11870 = false;
	if (((Class645_Sub1_Sub5_Sub3) this).aClass157_11869 != null)
	    ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869.method1873
		(((Class645_Sub1_Sub5_Sub3) this).aClass157_11869.method1874()
		 & ~0x10000);
    }
    
    public int method178() {
	return ((Class645_Sub1_Sub5_Sub3) this).aByte11866;
    }
    
    Class157 method10762(Class173 class173, int i) {
	if (null != ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
	    && class173.method2245(((Class645_Sub1_Sub5_Sub3) this)
				       .aClass157_11869.method1874(),
				   i) == 0)
	    return ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869;
	Class20 class20 = method10761(class173, i, false, -169956476);
	if (class20 != null)
	    return (Class157) class20.anObject208;
	return null;
    }
    
    Class157 method10763(Class173 class173, int i) {
	if (null != ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
	    && class173.method2245(((Class645_Sub1_Sub5_Sub3) this)
				       .aClass157_11869.method1874(),
				   i) == 0)
	    return ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869;
	Class20 class20 = method10761(class173, i, false, 843158117);
	if (class20 != null)
	    return (Class157) class20.anObject208;
	return null;
    }
    
    public void method389(Class173 class173, byte i) {
	Object object = null;
	Class528_Sub21_Sub12 class528_sub21_sub12;
	if ((((Class645_Sub1_Sub5_Sub3) this).aClass528_Sub21_Sub12_11863
	     == null)
	    && ((Class645_Sub1_Sub5_Sub3) this).aBool11865) {
	    Class20 class20 = method10761(class173, 262144, true, 577104384);
	    class528_sub21_sub12
		= (Class528_Sub21_Sub12) (class20 != null ? class20.anObject209
					  : null);
	} else {
	    class528_sub21_sub12
		= ((Class645_Sub1_Sub5_Sub3) this).aClass528_Sub21_Sub12_11863;
	    ((Class645_Sub1_Sub5_Sub3) this).aClass528_Sub21_Sub12_11863
		= null;
	}
	Class422 class422 = method7693().aClass422_4868;
	if (null != class528_sub21_sub12)
	    aClass538_10676.method6568(class528_sub21_sub12, aByte10674,
				       (int) class422.aFloat4780,
				       (int) class422.aFloat4777, null,
				       2144274875);
    }
    
    public void method395(Class173 class173) {
	Object object = null;
	Class528_Sub21_Sub12 class528_sub21_sub12;
	if ((((Class645_Sub1_Sub5_Sub3) this).aClass528_Sub21_Sub12_11863
	     == null)
	    && ((Class645_Sub1_Sub5_Sub3) this).aBool11865) {
	    Class20 class20 = method10761(class173, 262144, true, -680370760);
	    class528_sub21_sub12
		= (Class528_Sub21_Sub12) (class20 != null ? class20.anObject209
					  : null);
	} else {
	    class528_sub21_sub12
		= ((Class645_Sub1_Sub5_Sub3) this).aClass528_Sub21_Sub12_11863;
	    ((Class645_Sub1_Sub5_Sub3) this).aClass528_Sub21_Sub12_11863
		= null;
	}
	Class422 class422 = method7693().aClass422_4868;
	if (null != class528_sub21_sub12)
	    aClass538_10676.method6581(class528_sub21_sub12, aByte10674,
				       (int) class422.aFloat4780,
				       (int) class422.aFloat4777, null,
				       (byte) -83);
    }
    
    Class20 method10764(Class173 class173, int i, boolean bool) {
	Class596 class596
	    = ((Class596)
	       (((Class645_Sub1_Sub5_Sub3) this).aClass5_Sub15_11862.method63
		(((Class645_Sub1_Sub5_Sub3) this).anInt11861 * 1012446263,
		 647312583)));
	Class137 class137;
	Class137 class137_28_;
	if (((Class645_Sub1_Sub5_Sub3) this).aBool11868) {
	    class137 = aClass538_10676.aClass137Array7202[aByte10674];
	    class137_28_ = aClass538_10676.aClass137Array7163[0];
	} else {
	    class137 = aClass538_10676.aClass137Array7163[aByte10674];
	    if (aByte10674 < 3)
		class137_28_
		    = aClass538_10676.aClass137Array7163[1 + aByte10674];
	    else
		class137_28_ = null;
	}
	Class422 class422 = method7693().aClass422_4868;
	return (class596.method7097
		(class173, i,
		 ((((Class645_Sub1_Sub5_Sub3) this).aByte11866
		   != Class605.aClass605_7912.anInt7905 * 1922173025)
		  ? (int) ((Class645_Sub1_Sub5_Sub3) this).aByte11866
		  : Class605.aClass605_7893.anInt7905 * 1922173025),
		 ((Class605.aClass605_7912.anInt7905 * 1922173025
		   == ((Class645_Sub1_Sub5_Sub3) this).aByte11866)
		  ? (int) (((Class645_Sub1_Sub5_Sub3) this).aByte11867 + 4)
		  : ((Class645_Sub1_Sub5_Sub3) this).aByte11867),
		 class137, class137_28_, (int) class422.aFloat4780,
		 (int) class422.aFloat4776, (int) class422.aFloat4777, bool,
		 null, (byte) -107));
    }
    
    public int method10765() {
	return (((Class645_Sub1_Sub5_Sub3) this).aClass157_11869 != null
		? ((Class645_Sub1_Sub5_Sub3) this).aClass157_11869
		      .method1937() / 4
		: 15);
    }
}
