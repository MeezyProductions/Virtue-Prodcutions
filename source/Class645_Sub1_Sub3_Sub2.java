/* Class645_Sub1_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class645_Sub1_Sub3_Sub2 extends Class645_Sub1_Sub3
    implements Interface60
{
    byte aByte11881;
    static int[] anIntArray11882;
    Class5_Sub15 aClass5_Sub15_11883;
    Class157 aClass157_11884;
    Class528_Sub21_Sub12 aClass528_Sub21_Sub12_11885;
    boolean aBool11886;
    boolean aBool11887;
    int anInt11888;
    byte aByte11889;
    boolean aBool11890;
    boolean aBool11891;
    Class554 aClass554_11892;
    static int[] anIntArray11893 = { 1, 2, 4, 8 };
    
    public int method390() {
	return ((Class645_Sub1_Sub3_Sub2) this).aByte11881;
    }
    
    public int method178() {
	return ((Class645_Sub1_Sub3_Sub2) this).aByte11889;
    }
    
    public int method384(int i) {
	return ((Class645_Sub1_Sub3_Sub2) this).aByte11881;
    }
    
    public int method9819(int i) {
	return (null != ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884
		? ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884.method2018()
		: 0);
    }
    
    Class157 method10771(Class173 class173, int i, int i_0_) {
	if (((Class645_Sub1_Sub3_Sub2) this).aClass157_11884 != null
	    && class173.method2245(((Class645_Sub1_Sub3_Sub2) this)
				       .aClass157_11884.method1874(),
				   i) == 0)
	    return ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884;
	Class20 class20 = method10772(class173, i, false, (byte) -1);
	if (null != class20)
	    return (Class157) class20.anObject208;
	return null;
    }
    
    Class20 method10772(Class173 class173, int i, boolean bool, byte i_1_) {
	Class596 class596
	    = ((Class596)
	       (((Class645_Sub1_Sub3_Sub2) this).aClass5_Sub15_11883.method63
		(-1796219603 * ((Class645_Sub1_Sub3_Sub2) this).anInt11888,
		 2102677027)));
	Class137 class137;
	Class137 class137_2_;
	if (((Class645_Sub1_Sub3_Sub2) this).aBool11890) {
	    class137 = aClass538_10676.aClass137Array7202[aByte10674];
	    class137_2_ = aClass538_10676.aClass137Array7163[0];
	} else {
	    class137 = aClass538_10676.aClass137Array7163[aByte10674];
	    if (aByte10674 < 3)
		class137_2_
		    = aClass538_10676.aClass137Array7163[1 + aByte10674];
	    else
		class137_2_ = null;
	}
	Class422 class422 = method7693().aClass422_4868;
	return class596.method7097(class173, i,
				   ((Class645_Sub1_Sub3_Sub2) this).aByte11889,
				   ((Class645_Sub1_Sub3_Sub2) this).aByte11881,
				   class137, class137_2_,
				   (int) class422.aFloat4780,
				   (int) class422.aFloat4776,
				   (int) class422.aFloat4777, bool, null,
				   (byte) -31);
    }
    
    public Class554 method9780(Class173 class173, int i) {
	Class422 class422 = method7693().aClass422_4868;
	if (null == ((Class645_Sub1_Sub3_Sub2) this).aClass554_11892)
	    ((Class645_Sub1_Sub3_Sub2) this).aClass554_11892
		= Class372.method4680((int) class422.aFloat4780,
				      (int) class422.aFloat4776,
				      (int) class422.aFloat4777,
				      method10771(class173, 0, 999173567),
				      225425266);
	return ((Class645_Sub1_Sub3_Sub2) this).aClass554_11892;
    }
    
    Class549 method9813(Class173 class173, int i) {
	if (((Class645_Sub1_Sub3_Sub2) this).aClass157_11884 == null)
	    return null;
	Class433 class433 = method7685();
	Class549 class549
	    = Class623.method7435(((Class645_Sub1_Sub3_Sub2) this).aBool11891,
				  -1215686065);
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub3_Sub2) this).aClass5_Sub15_11883.method63
		 (((Class645_Sub1_Sub3_Sub2) this).anInt11888 * -1796219603,
		  -1114736776)))
	       .aClass431_7800);
	if (class431 != null) {
	    ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884
		.method1897(class433, null, 0);
	    class173.method2227(class433, aClass159Array10678[0], class431);
	} else
	    ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884
		.method1897(class433, aClass159Array10678[0], 0);
	return class549;
    }
    
    void method9779(Class173 class173, int i) {
	/* empty */
    }
    
    public int method9792() {
	return (null != ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884
		? ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884.method2018()
		: 0);
    }
    
    boolean method9771(int i) {
	return ((Class645_Sub1_Sub3_Sub2) this).aBool11887;
    }
    
    void method9798(Class173 class173, Class645_Sub1 class645_sub1, int i,
		    int i_3_, int i_4_, boolean bool, int i_5_) {
	if (class645_sub1 instanceof Class645_Sub1_Sub3_Sub2) {
	    Class645_Sub1_Sub3_Sub2 class645_sub1_sub3_sub2_6_
		= (Class645_Sub1_Sub3_Sub2) class645_sub1;
	    if (((Class645_Sub1_Sub3_Sub2) this).aClass157_11884 != null
		&& (((Class645_Sub1_Sub3_Sub2) class645_sub1_sub3_sub2_6_)
		    .aClass157_11884) != null)
		((Class645_Sub1_Sub3_Sub2) this).aClass157_11884.method1872
		    ((((Class645_Sub1_Sub3_Sub2) class645_sub1_sub3_sub2_6_)
		      .aClass157_11884),
		     i, i_3_, i_4_, bool);
	} else if (class645_sub1 instanceof Class645_Sub1_Sub5_Sub3) {
	    Class645_Sub1_Sub5_Sub3 class645_sub1_sub5_sub3
		= (Class645_Sub1_Sub5_Sub3) class645_sub1;
	    if (null != ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884
		&& (((Class645_Sub1_Sub5_Sub3) class645_sub1_sub5_sub3)
		    .aClass157_11869) != null)
		((Class645_Sub1_Sub3_Sub2) this).aClass157_11884.method1872
		    ((((Class645_Sub1_Sub5_Sub3) class645_sub1_sub5_sub3)
		      .aClass157_11869),
		     i, i_3_, i_4_, bool);
	}
    }
    
    void method9777(int i) {
	((Class645_Sub1_Sub3_Sub2) this).aBool11887 = false;
	if (((Class645_Sub1_Sub3_Sub2) this).aClass157_11884 != null)
	    ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884.method1873
		(((Class645_Sub1_Sub3_Sub2) this).aClass157_11884.method1874()
		 & ~0x10000);
    }
    
    public int method397(short i) {
	return -1796219603 * ((Class645_Sub1_Sub3_Sub2) this).anInt11888;
    }
    
    public int method168(int i) {
	return ((Class645_Sub1_Sub3_Sub2) this).aByte11889;
    }
    
    Class157 method10773(Class173 class173, int i) {
	if (((Class645_Sub1_Sub3_Sub2) this).aClass157_11884 != null
	    && class173.method2245(((Class645_Sub1_Sub3_Sub2) this)
				       .aClass157_11884.method1874(),
				   i) == 0)
	    return ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884;
	Class20 class20 = method10772(class173, i, false, (byte) -1);
	if (null != class20)
	    return (Class157) class20.anObject208;
	return null;
    }
    
    public void method398(Class173 class173) {
	Object object = null;
	Class528_Sub21_Sub12 class528_sub21_sub12;
	if ((null
	     == ((Class645_Sub1_Sub3_Sub2) this).aClass528_Sub21_Sub12_11885)
	    && ((Class645_Sub1_Sub3_Sub2) this).aBool11886) {
	    Class20 class20 = method10772(class173, 262144, true, (byte) -1);
	    class528_sub21_sub12
		= (Class528_Sub21_Sub12) (null != class20 ? class20.anObject209
					  : null);
	} else {
	    class528_sub21_sub12
		= ((Class645_Sub1_Sub3_Sub2) this).aClass528_Sub21_Sub12_11885;
	    ((Class645_Sub1_Sub3_Sub2) this).aClass528_Sub21_Sub12_11885
		= null;
	}
	Class422 class422 = method7693().aClass422_4868;
	if (class528_sub21_sub12 != null)
	    aClass538_10676.method6568(class528_sub21_sub12, aByte10674,
				       (int) class422.aFloat4780,
				       (int) class422.aFloat4777, null,
				       2141880533);
    }
    
    public boolean method387(byte i) {
	return true;
    }
    
    boolean method9772() {
	if (((Class645_Sub1_Sub3_Sub2) this).aClass157_11884 != null)
	    return !((Class645_Sub1_Sub3_Sub2) this).aClass157_11884
			.method1920();
	return true;
    }
    
    boolean method9775(short i) {
	if (((Class645_Sub1_Sub3_Sub2) this).aClass157_11884 != null)
	    return ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884
		       .method1919();
	return false;
    }
    
    static {
	anIntArray11882 = new int[] { 16, 32, 64, 128 };
    }
    
    public int method73() {
	return -1796219603 * ((Class645_Sub1_Sub3_Sub2) this).anInt11888;
    }
    
    public int method74() {
	return ((Class645_Sub1_Sub3_Sub2) this).aByte11889;
    }
    
    public void method388(Class173 class173, int i) {
	Object object = null;
	Class528_Sub21_Sub12 class528_sub21_sub12;
	if ((null
	     == ((Class645_Sub1_Sub3_Sub2) this).aClass528_Sub21_Sub12_11885)
	    && ((Class645_Sub1_Sub3_Sub2) this).aBool11886) {
	    Class20 class20 = method10772(class173, 262144, true, (byte) -1);
	    class528_sub21_sub12
		= (Class528_Sub21_Sub12) (null != class20 ? class20.anObject209
					  : null);
	} else {
	    class528_sub21_sub12
		= ((Class645_Sub1_Sub3_Sub2) this).aClass528_Sub21_Sub12_11885;
	    ((Class645_Sub1_Sub3_Sub2) this).aClass528_Sub21_Sub12_11885
		= null;
	}
	Class422 class422 = method7693().aClass422_4868;
	if (null != class528_sub21_sub12)
	    aClass538_10676.method6581(class528_sub21_sub12, aByte10674,
				       (int) class422.aFloat4780,
				       (int) class422.aFloat4777, null,
				       (byte) -65);
    }
    
    public Class554 method9794(Class173 class173) {
	Class422 class422 = method7693().aClass422_4868;
	if (null == ((Class645_Sub1_Sub3_Sub2) this).aClass554_11892)
	    ((Class645_Sub1_Sub3_Sub2) this).aClass554_11892
		= Class372.method4680((int) class422.aFloat4780,
				      (int) class422.aFloat4776,
				      (int) class422.aFloat4777,
				      method10771(class173, 0, 999173567),
				      1336280073);
	return ((Class645_Sub1_Sub3_Sub2) this).aClass554_11892;
    }
    
    public int method393() {
	return ((Class645_Sub1_Sub3_Sub2) this).aByte11881;
    }
    
    public int method394() {
	return ((Class645_Sub1_Sub3_Sub2) this).aByte11881;
    }
    
    public void method334() {
	if (((Class645_Sub1_Sub3_Sub2) this).aClass157_11884 != null)
	    ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884.method1875();
    }
    
    boolean method9820(Class173 class173, int i, int i_7_, byte i_8_) {
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub3_Sub2) this).aClass5_Sub15_11883.method63
		 (-1796219603 * ((Class645_Sub1_Sub3_Sub2) this).anInt11888,
		  24581978)))
	       .aClass431_7800);
	if (null != class431)
	    return class173.method2225(i, i_7_, method7685(), class431,
				       (byte) 2);
	Class157 class157 = method10771(class173, 131072, 999173567);
	if (class157 != null) {
	    Class433 class433 = method7685();
	    return class157.method2000(i, i_7_, class433, false, 0);
	}
	return false;
    }
    
    public boolean method391() {
	return ((Class645_Sub1_Sub3_Sub2) this).aBool11886;
    }
    
    boolean method9797(int i) {
	if (((Class645_Sub1_Sub3_Sub2) this).aClass157_11884 != null)
	    return !((Class645_Sub1_Sub3_Sub2) this).aClass157_11884
			.method1920();
	return true;
    }
    
    public boolean method271() {
	return true;
    }
    
    public void method395(Class173 class173) {
	Object object = null;
	Class528_Sub21_Sub12 class528_sub21_sub12;
	if ((null
	     == ((Class645_Sub1_Sub3_Sub2) this).aClass528_Sub21_Sub12_11885)
	    && ((Class645_Sub1_Sub3_Sub2) this).aBool11886) {
	    Class20 class20 = method10772(class173, 262144, true, (byte) -1);
	    class528_sub21_sub12
		= (Class528_Sub21_Sub12) (null != class20 ? class20.anObject209
					  : null);
	} else {
	    class528_sub21_sub12
		= ((Class645_Sub1_Sub3_Sub2) this).aClass528_Sub21_Sub12_11885;
	    ((Class645_Sub1_Sub3_Sub2) this).aClass528_Sub21_Sub12_11885
		= null;
	}
	Class422 class422 = method7693().aClass422_4868;
	if (null != class528_sub21_sub12)
	    aClass538_10676.method6581(class528_sub21_sub12, aByte10674,
				       (int) class422.aFloat4780,
				       (int) class422.aFloat4777, null,
				       (byte) -15);
    }
    
    public void method392(Class173 class173) {
	Object object = null;
	Class528_Sub21_Sub12 class528_sub21_sub12;
	if ((null
	     == ((Class645_Sub1_Sub3_Sub2) this).aClass528_Sub21_Sub12_11885)
	    && ((Class645_Sub1_Sub3_Sub2) this).aBool11886) {
	    Class20 class20 = method10772(class173, 262144, true, (byte) -1);
	    class528_sub21_sub12
		= (Class528_Sub21_Sub12) (null != class20 ? class20.anObject209
					  : null);
	} else {
	    class528_sub21_sub12
		= ((Class645_Sub1_Sub3_Sub2) this).aClass528_Sub21_Sub12_11885;
	    ((Class645_Sub1_Sub3_Sub2) this).aClass528_Sub21_Sub12_11885
		= null;
	}
	Class422 class422 = method7693().aClass422_4868;
	if (class528_sub21_sub12 != null)
	    aClass538_10676.method6568(class528_sub21_sub12, aByte10674,
				       (int) class422.aFloat4780,
				       (int) class422.aFloat4777, null,
				       2142544935);
    }
    
    boolean method9791() {
	if (((Class645_Sub1_Sub3_Sub2) this).aClass157_11884 != null)
	    return ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884
		       .method1919();
	return false;
    }
    
    public boolean method396() {
	return true;
    }
    
    boolean method9783() {
	if (((Class645_Sub1_Sub3_Sub2) this).aClass157_11884 != null)
	    return !((Class645_Sub1_Sub3_Sub2) this).aClass157_11884
			.method1920();
	return true;
    }
    
    boolean method9789() {
	if (((Class645_Sub1_Sub3_Sub2) this).aClass157_11884 != null)
	    return !((Class645_Sub1_Sub3_Sub2) this).aClass157_11884
			.method1920();
	return true;
    }
    
    Class549 method9778(Class173 class173) {
	if (((Class645_Sub1_Sub3_Sub2) this).aClass157_11884 == null)
	    return null;
	Class433 class433 = method7685();
	Class549 class549
	    = Class623.method7435(((Class645_Sub1_Sub3_Sub2) this).aBool11891,
				  -29918846);
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub3_Sub2) this).aClass5_Sub15_11883.method63
		 (((Class645_Sub1_Sub3_Sub2) this).anInt11888 * -1796219603,
		  -491781350)))
	       .aClass431_7800);
	if (class431 != null) {
	    ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884
		.method1897(class433, null, 0);
	    class173.method2227(class433, aClass159Array10678[0], class431);
	} else
	    ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884
		.method1897(class433, aClass159Array10678[0], 0);
	return class549;
    }
    
    public boolean method386(int i) {
	return ((Class645_Sub1_Sub3_Sub2) this).aBool11886;
    }
    
    boolean method9790() {
	if (((Class645_Sub1_Sub3_Sub2) this).aClass157_11884 != null)
	    return ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884
		       .method1919();
	return false;
    }
    
    public Class554 method9795(Class173 class173) {
	Class422 class422 = method7693().aClass422_4868;
	if (null == ((Class645_Sub1_Sub3_Sub2) this).aClass554_11892)
	    ((Class645_Sub1_Sub3_Sub2) this).aClass554_11892
		= Class372.method4680((int) class422.aFloat4780,
				      (int) class422.aFloat4776,
				      (int) class422.aFloat4777,
				      method10771(class173, 0, 999173567),
				      -463598662);
	return ((Class645_Sub1_Sub3_Sub2) this).aClass554_11892;
    }
    
    public Class645_Sub1_Sub3_Sub2
	(Class538 class538, Class173 class173, Class5_Sub15 class5_sub15,
	 Class596 class596, int i, int i_9_, int i_10_, int i_11_, int i_12_,
	 boolean bool, int i_13_, int i_14_, boolean bool_15_) {
	super(class538, i_10_, i_11_, i_12_, i, i_9_,
	      Class445_Sub3.method9179(i_13_, i_14_, 1460399282));
	((Class645_Sub1_Sub3_Sub2) this).aClass5_Sub15_11883 = class5_sub15;
	((Class645_Sub1_Sub3_Sub2) this).anInt11888
	    = class596.anInt7765 * 1624894937;
	((Class645_Sub1_Sub3_Sub2) this).aBool11890 = bool;
	((Class645_Sub1_Sub3_Sub2) this).aByte11889 = (byte) i_13_;
	((Class645_Sub1_Sub3_Sub2) this).aByte11881 = (byte) i_14_;
	((Class645_Sub1_Sub3_Sub2) this).aBool11891
	    = 0 != class596.anInt7785 * 567849393 && !bool;
	((Class645_Sub1_Sub3_Sub2) this).aBool11887 = bool_15_;
	((Class645_Sub1_Sub3_Sub2) this).aBool11886
	    = (class173.method2163() && class596.aBool7819
	       && !((Class645_Sub1_Sub3_Sub2) this).aBool11890
	       && Class514.aClass528_Sub38_6967.aClass691_Sub8_10565
		      .method9883(2119260119) != 0);
	int i_16_ = 2048;
	if (((Class645_Sub1_Sub3_Sub2) this).aBool11887)
	    i_16_ |= 0x10000;
	if (class596.aBool7768)
	    i_16_ |= 0x80000;
	Class20 class20
	    = method10772(class173, i_16_,
			  ((Class645_Sub1_Sub3_Sub2) this).aBool11886,
			  (byte) -1);
	if (class20 != null) {
	    ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884
		= (Class157) class20.anObject208;
	    ((Class645_Sub1_Sub3_Sub2) this).aClass528_Sub21_Sub12_11885
		= (Class528_Sub21_Sub12) class20.anObject209;
	    if (((Class645_Sub1_Sub3_Sub2) this).aBool11887
		|| class596.aBool7768) {
		((Class645_Sub1_Sub3_Sub2) this).aClass157_11884
		    = ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884
			  .method1951((byte) 0, i_16_, false);
		if (class596.aBool7768) {
		    Class491 class491
			= client.gameScene.method6004(-735391224);
		    ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884.method1917
			(class491.anInt5514 * -1316786341,
			 class491.anInt5512 * -380000269,
			 class491.anInt5513 * 383347061,
			 class491.anInt5515 * 771824171);
		}
	    }
	}
	method9786(1, 1860783691);
    }
    
    void method9808() {
	((Class645_Sub1_Sub3_Sub2) this).aBool11887 = false;
	if (((Class645_Sub1_Sub3_Sub2) this).aClass157_11884 != null)
	    ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884.method1873
		(((Class645_Sub1_Sub3_Sub2) this).aClass157_11884.method1874()
		 & ~0x10000);
    }
    
    Class549 method9787(Class173 class173) {
	if (((Class645_Sub1_Sub3_Sub2) this).aClass157_11884 == null)
	    return null;
	Class433 class433 = method7685();
	Class549 class549
	    = Class623.method7435(((Class645_Sub1_Sub3_Sub2) this).aBool11891,
				  -592762358);
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub3_Sub2) this).aClass5_Sub15_11883.method63
		 (((Class645_Sub1_Sub3_Sub2) this).anInt11888 * -1796219603,
		  -1183874960)))
	       .aClass431_7800);
	if (class431 != null) {
	    ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884
		.method1897(class433, null, 0);
	    class173.method2227(class433, aClass159Array10678[0], class431);
	} else
	    ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884
		.method1897(class433, aClass159Array10678[0], 0);
	return class549;
    }
    
    public int method9793() {
	return (null != ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884
		? ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884.method2018()
		: 0);
    }
    
    Class549 method9776(Class173 class173) {
	if (((Class645_Sub1_Sub3_Sub2) this).aClass157_11884 == null)
	    return null;
	Class433 class433 = method7685();
	Class549 class549
	    = Class623.method7435(((Class645_Sub1_Sub3_Sub2) this).aBool11891,
				  -1168959080);
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub3_Sub2) this).aClass5_Sub15_11883.method63
		 (((Class645_Sub1_Sub3_Sub2) this).anInt11888 * -1796219603,
		  665187574)))
	       .aClass431_7800);
	if (class431 != null) {
	    ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884
		.method1897(class433, null, 0);
	    class173.method2227(class433, aClass159Array10678[0], class431);
	} else
	    ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884
		.method1897(class433, aClass159Array10678[0], 0);
	return class549;
    }
    
    void method9800(Class173 class173) {
	/* empty */
    }
    
    boolean method9801(Class173 class173, int i, int i_17_) {
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub3_Sub2) this).aClass5_Sub15_11883.method63
		 (-1796219603 * ((Class645_Sub1_Sub3_Sub2) this).anInt11888,
		  1124102187)))
	       .aClass431_7800);
	if (null != class431)
	    return class173.method2225(i, i_17_, method7685(), class431,
				       (byte) 2);
	Class157 class157 = method10771(class173, 131072, 999173567);
	if (class157 != null) {
	    Class433 class433 = method7685();
	    return class157.method2000(i, i_17_, class433, false, 0);
	}
	return false;
    }
    
    boolean method9774(Class173 class173, int i, int i_18_) {
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub3_Sub2) this).aClass5_Sub15_11883.method63
		 (-1796219603 * ((Class645_Sub1_Sub3_Sub2) this).anInt11888,
		  51606400)))
	       .aClass431_7800);
	if (null != class431)
	    return class173.method2225(i, i_18_, method7685(), class431,
				       (byte) 2);
	Class157 class157 = method10771(class173, 131072, 999173567);
	if (class157 != null) {
	    Class433 class433 = method7685();
	    return class157.method2000(i, i_18_, class433, false, 0);
	}
	return false;
    }
    
    boolean method9802() {
	return ((Class645_Sub1_Sub3_Sub2) this).aBool11887;
    }
    
    boolean method9803() {
	return ((Class645_Sub1_Sub3_Sub2) this).aBool11887;
    }
    
    public void method389(Class173 class173, byte i) {
	Object object = null;
	Class528_Sub21_Sub12 class528_sub21_sub12;
	if ((null
	     == ((Class645_Sub1_Sub3_Sub2) this).aClass528_Sub21_Sub12_11885)
	    && ((Class645_Sub1_Sub3_Sub2) this).aBool11886) {
	    Class20 class20 = method10772(class173, 262144, true, (byte) -1);
	    class528_sub21_sub12
		= (Class528_Sub21_Sub12) (null != class20 ? class20.anObject209
					  : null);
	} else {
	    class528_sub21_sub12
		= ((Class645_Sub1_Sub3_Sub2) this).aClass528_Sub21_Sub12_11885;
	    ((Class645_Sub1_Sub3_Sub2) this).aClass528_Sub21_Sub12_11885
		= null;
	}
	Class422 class422 = method7693().aClass422_4868;
	if (class528_sub21_sub12 != null)
	    aClass538_10676.method6568(class528_sub21_sub12, aByte10674,
				       (int) class422.aFloat4780,
				       (int) class422.aFloat4777, null,
				       2141771507);
    }
    
    void method9805() {
	((Class645_Sub1_Sub3_Sub2) this).aBool11887 = false;
	if (((Class645_Sub1_Sub3_Sub2) this).aClass157_11884 != null)
	    ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884.method1873
		(((Class645_Sub1_Sub3_Sub2) this).aClass157_11884.method1874()
		 & ~0x10000);
    }
    
    void method9806() {
	((Class645_Sub1_Sub3_Sub2) this).aBool11887 = false;
	if (((Class645_Sub1_Sub3_Sub2) this).aClass157_11884 != null)
	    ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884.method1873
		(((Class645_Sub1_Sub3_Sub2) this).aClass157_11884.method1874()
		 & ~0x10000);
    }
    
    public void method203() {
	if (((Class645_Sub1_Sub3_Sub2) this).aClass157_11884 != null)
	    ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884.method1875();
    }
    
    static int method10774(int i, int i_19_) {
	if (i == 1922173025 * Class605.aClass605_7898.anInt7905
	    || i == 1922173025 * Class605.aClass605_7911.anInt7905)
	    return anIntArray11882[i_19_ & 0x3];
	return anIntArray11893[i_19_ & 0x3];
    }
    
    void method9804(Class173 class173, Class645_Sub1 class645_sub1, int i,
		    int i_20_, int i_21_, boolean bool) {
	if (class645_sub1 instanceof Class645_Sub1_Sub3_Sub2) {
	    Class645_Sub1_Sub3_Sub2 class645_sub1_sub3_sub2_22_
		= (Class645_Sub1_Sub3_Sub2) class645_sub1;
	    if (((Class645_Sub1_Sub3_Sub2) this).aClass157_11884 != null
		&& (((Class645_Sub1_Sub3_Sub2) class645_sub1_sub3_sub2_22_)
		    .aClass157_11884) != null)
		((Class645_Sub1_Sub3_Sub2) this).aClass157_11884.method1872
		    ((((Class645_Sub1_Sub3_Sub2) class645_sub1_sub3_sub2_22_)
		      .aClass157_11884),
		     i, i_20_, i_21_, bool);
	} else if (class645_sub1 instanceof Class645_Sub1_Sub5_Sub3) {
	    Class645_Sub1_Sub5_Sub3 class645_sub1_sub5_sub3
		= (Class645_Sub1_Sub5_Sub3) class645_sub1;
	    if (null != ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884
		&& (((Class645_Sub1_Sub5_Sub3) class645_sub1_sub5_sub3)
		    .aClass157_11869) != null)
		((Class645_Sub1_Sub3_Sub2) this).aClass157_11884.method1872
		    ((((Class645_Sub1_Sub5_Sub3) class645_sub1_sub5_sub3)
		      .aClass157_11869),
		     i, i_20_, i_21_, bool);
	}
    }
    
    Class157 method10775(Class173 class173, int i) {
	if (((Class645_Sub1_Sub3_Sub2) this).aClass157_11884 != null
	    && class173.method2245(((Class645_Sub1_Sub3_Sub2) this)
				       .aClass157_11884.method1874(),
				   i) == 0)
	    return ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884;
	Class20 class20 = method10772(class173, i, false, (byte) -1);
	if (null != class20)
	    return (Class157) class20.anObject208;
	return null;
    }
    
    public void method385(int i) {
	if (((Class645_Sub1_Sub3_Sub2) this).aClass157_11884 != null)
	    ((Class645_Sub1_Sub3_Sub2) this).aClass157_11884.method1875();
    }
    
    Class20 method10776(Class173 class173, int i, boolean bool) {
	Class596 class596
	    = ((Class596)
	       (((Class645_Sub1_Sub3_Sub2) this).aClass5_Sub15_11883.method63
		(-1796219603 * ((Class645_Sub1_Sub3_Sub2) this).anInt11888,
		 -806289050)));
	Class137 class137;
	Class137 class137_23_;
	if (((Class645_Sub1_Sub3_Sub2) this).aBool11890) {
	    class137 = aClass538_10676.aClass137Array7202[aByte10674];
	    class137_23_ = aClass538_10676.aClass137Array7163[0];
	} else {
	    class137 = aClass538_10676.aClass137Array7163[aByte10674];
	    if (aByte10674 < 3)
		class137_23_
		    = aClass538_10676.aClass137Array7163[1 + aByte10674];
	    else
		class137_23_ = null;
	}
	Class422 class422 = method7693().aClass422_4868;
	return class596.method7097(class173, i,
				   ((Class645_Sub1_Sub3_Sub2) this).aByte11889,
				   ((Class645_Sub1_Sub3_Sub2) this).aByte11881,
				   class137, class137_23_,
				   (int) class422.aFloat4780,
				   (int) class422.aFloat4776,
				   (int) class422.aFloat4777, bool, null,
				   (byte) -6);
    }
    
    Class20 method10777(Class173 class173, int i, boolean bool) {
	Class596 class596
	    = ((Class596)
	       (((Class645_Sub1_Sub3_Sub2) this).aClass5_Sub15_11883.method63
		(-1796219603 * ((Class645_Sub1_Sub3_Sub2) this).anInt11888,
		 362633504)));
	Class137 class137;
	Class137 class137_24_;
	if (((Class645_Sub1_Sub3_Sub2) this).aBool11890) {
	    class137 = aClass538_10676.aClass137Array7202[aByte10674];
	    class137_24_ = aClass538_10676.aClass137Array7163[0];
	} else {
	    class137 = aClass538_10676.aClass137Array7163[aByte10674];
	    if (aByte10674 < 3)
		class137_24_
		    = aClass538_10676.aClass137Array7163[1 + aByte10674];
	    else
		class137_24_ = null;
	}
	Class422 class422 = method7693().aClass422_4868;
	return class596.method7097(class173, i,
				   ((Class645_Sub1_Sub3_Sub2) this).aByte11889,
				   ((Class645_Sub1_Sub3_Sub2) this).aByte11881,
				   class137, class137_24_,
				   (int) class422.aFloat4780,
				   (int) class422.aFloat4776,
				   (int) class422.aFloat4777, bool, null,
				   (byte) -7);
    }
    
    static void method10778(String[] strings, short[] is, int i, int i_25_,
			    int i_26_) {
	if (i < i_25_) {
	    int i_27_ = (i + i_25_) / 2;
	    int i_28_ = i;
	    String string = strings[i_27_];
	    strings[i_27_] = strings[i_25_];
	    strings[i_25_] = string;
	    short i_29_ = is[i_27_];
	    is[i_27_] = is[i_25_];
	    is[i_25_] = i_29_;
	    for (int i_30_ = i; i_30_ < i_25_; i_30_++) {
		if (string == null
		    || (strings[i_30_] != null
			&& strings[i_30_].compareTo(string) < (i_30_ & 0x1))) {
		    String string_31_ = strings[i_30_];
		    strings[i_30_] = strings[i_28_];
		    strings[i_28_] = string_31_;
		    short i_32_ = is[i_30_];
		    is[i_30_] = is[i_28_];
		    is[i_28_++] = i_32_;
		}
	    }
	    strings[i_25_] = strings[i_28_];
	    strings[i_28_] = string;
	    is[i_25_] = is[i_28_];
	    is[i_28_] = i_29_;
	    method10778(strings, is, i, i_28_ - 1, -7772685);
	    method10778(strings, is, 1 + i_28_, i_25_, 870453802);
	}
    }
}
