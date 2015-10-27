/* Class645_Sub1_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class645_Sub1_Sub4_Sub1 extends Class645_Sub1_Sub4
    implements Interface60
{
    boolean aBool11842;
    byte aByte11843;
    Class528_Sub21_Sub12 aClass528_Sub21_Sub12_11844;
    Class554 aClass554_11845;
    boolean aBool11846;
    Class5_Sub15 aClass5_Sub15_11847;
    boolean aBool11848;
    int anInt11849;
    boolean aBool11850;
    Class157 aClass157_11851;
    
    void method9798(Class173 class173, Class645_Sub1 class645_sub1, int i,
		    int i_0_, int i_1_, boolean bool, int i_2_) {
	if (class645_sub1 instanceof Class645_Sub1_Sub4_Sub1) {
	    Class645_Sub1_Sub4_Sub1 class645_sub1_sub4_sub1_3_
		= (Class645_Sub1_Sub4_Sub1) class645_sub1;
	    if (((Class645_Sub1_Sub4_Sub1) this).aClass157_11851 != null
		&& null != ((Class645_Sub1_Sub4_Sub1)
			    class645_sub1_sub4_sub1_3_).aClass157_11851)
		((Class645_Sub1_Sub4_Sub1) this).aClass157_11851.method1872
		    ((((Class645_Sub1_Sub4_Sub1) class645_sub1_sub4_sub1_3_)
		      .aClass157_11851),
		     i, i_0_, i_1_, bool);
	}
    }
    
    boolean method9797(int i) {
	if (null != ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851)
	    return !((Class645_Sub1_Sub4_Sub1) this).aClass157_11851
			.method1920();
	return true;
    }
    
    boolean method9775(short i) {
	if (null != ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851)
	    return ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851
		       .method1919();
	return false;
    }
    
    public int method9793() {
	return (((Class645_Sub1_Sub4_Sub1) this).aClass157_11851 != null
		? ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851.method2018()
		: 0);
    }
    
    Class157 method10744(Class173 class173, int i, byte i_4_) {
	if (((Class645_Sub1_Sub4_Sub1) this).aClass157_11851 != null
	    && class173.method2245(((Class645_Sub1_Sub4_Sub1) this)
				       .aClass157_11851.method1874(),
				   i) == 0)
	    return ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851;
	Class20 class20 = method10749(class173, i, false, -1718806224);
	if (null != class20)
	    return (Class157) class20.anObject208;
	return null;
    }
    
    boolean method9820(Class173 class173, int i, int i_5_, byte i_6_) {
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub4_Sub1) this).aClass5_Sub15_11847.method63
		 (((Class645_Sub1_Sub4_Sub1) this).anInt11849 * -1057078555,
		  -1157353706)))
	       .aClass431_7800);
	if (null != class431)
	    return class173.method2225(i, i_5_, method7685(), class431,
				       (byte) 2);
	Class157 class157 = method10744(class173, 131072, (byte) -65);
	if (null != class157) {
	    Class433 class433 = method7685();
	    return class157.method2000(i, i_5_, class433, false, 0);
	}
	return false;
    }
    
    Class20 method10745(Class173 class173, int i, boolean bool) {
	Class596 class596
	    = ((Class596)
	       (((Class645_Sub1_Sub4_Sub1) this).aClass5_Sub15_11847.method63
		(((Class645_Sub1_Sub4_Sub1) this).anInt11849 * -1057078555,
		 -495088843)));
	Class137 class137;
	Class137 class137_7_;
	if (((Class645_Sub1_Sub4_Sub1) this).aBool11848) {
	    class137 = aClass538_10676.aClass137Array7202[aByte10674];
	    class137_7_ = aClass538_10676.aClass137Array7163[0];
	} else {
	    class137 = aClass538_10676.aClass137Array7163[aByte10674];
	    if (aByte10674 < 3)
		class137_7_
		    = aClass538_10676.aClass137Array7163[aByte10674 + 1];
	    else
		class137_7_ = null;
	}
	Class422 class422 = method7693().aClass422_4868;
	return class596.method7097(class173, i,
				   (Class605.aClass605_7913.anInt7905
				    * 1922173025),
				   ((Class645_Sub1_Sub4_Sub1) this).aByte11843,
				   class137, class137_7_,
				   (int) class422.aFloat4780,
				   (int) class422.aFloat4776,
				   (int) class422.aFloat4777, bool, null,
				   (byte) -18);
    }
    
    Class549 method9813(Class173 class173, int i) {
	if (null == ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851)
	    return null;
	Class433 class433 = method7685();
	Class549 class549
	    = Class623.method7435(((Class645_Sub1_Sub4_Sub1) this).aBool11842,
				  1949450716);
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub4_Sub1) this).aClass5_Sub15_11847.method63
		 (((Class645_Sub1_Sub4_Sub1) this).anInt11849 * -1057078555,
		  169930330)))
	       .aClass431_7800);
	if (class431 != null) {
	    ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851
		.method1897(class433, null, 0);
	    class173.method2227(class433, aClass159Array10678[0], class431);
	} else
	    ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851
		.method1897(class433, aClass159Array10678[0], 0);
	return class549;
    }
    
    public int method9819(int i) {
	return (((Class645_Sub1_Sub4_Sub1) this).aClass157_11851 != null
		? ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851.method2018()
		: 0);
    }
    
    void method9806() {
	((Class645_Sub1_Sub4_Sub1) this).aBool11850 = false;
	if (null != ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851)
	    ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851.method1873
		(((Class645_Sub1_Sub4_Sub1) this).aClass157_11851.method1874()
		 & ~0x10000);
    }
    
    public void method388(Class173 class173, int i) {
	Object object = null;
	Class528_Sub21_Sub12 class528_sub21_sub12;
	if ((null
	     == ((Class645_Sub1_Sub4_Sub1) this).aClass528_Sub21_Sub12_11844)
	    && ((Class645_Sub1_Sub4_Sub1) this).aBool11846) {
	    Class20 class20 = method10749(class173, 262144, true, -2029822476);
	    class528_sub21_sub12
		= (Class528_Sub21_Sub12) (null != class20 ? class20.anObject209
					  : null);
	} else {
	    class528_sub21_sub12
		= ((Class645_Sub1_Sub4_Sub1) this).aClass528_Sub21_Sub12_11844;
	    ((Class645_Sub1_Sub4_Sub1) this).aClass528_Sub21_Sub12_11844
		= null;
	}
	Class422 class422 = method7693().aClass422_4868;
	if (null != class528_sub21_sub12)
	    aClass538_10676.method6581(class528_sub21_sub12, aByte10674,
				       (int) class422.aFloat4780,
				       (int) class422.aFloat4777, null,
				       (byte) 7);
    }
    
    public boolean method386(int i) {
	return ((Class645_Sub1_Sub4_Sub1) this).aBool11846;
    }
    
    void method9777(int i) {
	((Class645_Sub1_Sub4_Sub1) this).aBool11850 = false;
	if (null != ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851)
	    ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851.method1873
		(((Class645_Sub1_Sub4_Sub1) this).aClass157_11851.method1874()
		 & ~0x10000);
    }
    
    public int method397(short i) {
	return -1057078555 * ((Class645_Sub1_Sub4_Sub1) this).anInt11849;
    }
    
    public int method168(int i) {
	return Class605.aClass605_7913.anInt7905 * 1922173025;
    }
    
    public int method384(int i) {
	return ((Class645_Sub1_Sub4_Sub1) this).aByte11843;
    }
    
    public void method385(int i) {
	if (((Class645_Sub1_Sub4_Sub1) this).aClass157_11851 != null)
	    ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851.method1875();
    }
    
    public boolean method387(byte i) {
	return true;
    }
    
    public Class645_Sub1_Sub4_Sub1
	(Class538 class538, Class173 class173, Class5_Sub15 class5_sub15,
	 Class596 class596, int i, int i_8_, int i_9_, int i_10_, int i_11_,
	 boolean bool, int i_12_, boolean bool_13_) {
	super(class538, i_9_, i_10_, i_11_, i, i_8_,
	      1406365749 * class596.anInt7802);
	((Class645_Sub1_Sub4_Sub1) this).aClass5_Sub15_11847 = class5_sub15;
	((Class645_Sub1_Sub4_Sub1) this).anInt11849
	    = class596.anInt7765 * 1006897217;
	((Class645_Sub1_Sub4_Sub1) this).aBool11848 = bool;
	((Class645_Sub1_Sub4_Sub1) this).aByte11843 = (byte) i_12_;
	((Class645_Sub1_Sub4_Sub1) this).aBool11842
	    = class596.anInt7785 * 567849393 != 0 && !bool;
	((Class645_Sub1_Sub4_Sub1) this).aBool11850 = bool_13_;
	((Class645_Sub1_Sub4_Sub1) this).aBool11846
	    = (class173.method2163() && class596.aBool7819
	       && !((Class645_Sub1_Sub4_Sub1) this).aBool11848
	       && Class514.aClass528_Sub38_6967.aClass691_Sub8_10565
		      .method9883(1968134718) != 0);
	int i_14_ = 2048;
	if (((Class645_Sub1_Sub4_Sub1) this).aBool11850)
	    i_14_ |= 0x10000;
	if (class596.aBool7768)
	    i_14_ |= 0x80000;
	Class20 class20
	    = method10749(class173, i_14_,
			  ((Class645_Sub1_Sub4_Sub1) this).aBool11846,
			  -1545385963);
	if (class20 != null) {
	    ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851
		= (Class157) class20.anObject208;
	    ((Class645_Sub1_Sub4_Sub1) this).aClass528_Sub21_Sub12_11844
		= (Class528_Sub21_Sub12) class20.anObject209;
	    if (((Class645_Sub1_Sub4_Sub1) this).aBool11850
		|| class596.aBool7768) {
		((Class645_Sub1_Sub4_Sub1) this).aClass157_11851
		    = ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851
			  .method1951((byte) 0, i_14_, false);
		if (class596.aBool7768) {
		    Class491 class491
			= client.gameScene.method6004(-735391224);
		    ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851.method1917
			(-1316786341 * class491.anInt5514,
			 -380000269 * class491.anInt5512,
			 class491.anInt5513 * 383347061,
			 771824171 * class491.anInt5515);
		}
	    }
	}
	method9786(1, 1414178681);
    }
    
    public Class554 method9780(Class173 class173, int i) {
	Class422 class422 = method7693().aClass422_4868;
	if (((Class645_Sub1_Sub4_Sub1) this).aClass554_11845 == null)
	    ((Class645_Sub1_Sub4_Sub1) this).aClass554_11845
		= Class372.method4680((int) class422.aFloat4780,
				      (int) class422.aFloat4776,
				      (int) class422.aFloat4777,
				      method10744(class173, 0, (byte) -100),
				      -1485303372);
	return ((Class645_Sub1_Sub4_Sub1) this).aClass554_11845;
    }
    
    public Class554 method9795(Class173 class173) {
	Class422 class422 = method7693().aClass422_4868;
	if (((Class645_Sub1_Sub4_Sub1) this).aClass554_11845 == null)
	    ((Class645_Sub1_Sub4_Sub1) this).aClass554_11845
		= Class372.method4680((int) class422.aFloat4780,
				      (int) class422.aFloat4776,
				      (int) class422.aFloat4777,
				      method10744(class173, 0, (byte) -30),
				      -747986540);
	return ((Class645_Sub1_Sub4_Sub1) this).aClass554_11845;
    }
    
    public int method73() {
	return -1057078555 * ((Class645_Sub1_Sub4_Sub1) this).anInt11849;
    }
    
    public int method74() {
	return Class605.aClass605_7913.anInt7905 * 1922173025;
    }
    
    public int method178() {
	return Class605.aClass605_7913.anInt7905 * 1922173025;
    }
    
    public int method390() {
	return ((Class645_Sub1_Sub4_Sub1) this).aByte11843;
    }
    
    public int method393() {
	return ((Class645_Sub1_Sub4_Sub1) this).aByte11843;
    }
    
    public int method394() {
	return ((Class645_Sub1_Sub4_Sub1) this).aByte11843;
    }
    
    public void method334() {
	if (((Class645_Sub1_Sub4_Sub1) this).aClass157_11851 != null)
	    ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851.method1875();
    }
    
    public void method203() {
	if (((Class645_Sub1_Sub4_Sub1) this).aClass157_11851 != null)
	    ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851.method1875();
    }
    
    boolean method9791() {
	if (null != ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851)
	    return ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851
		       .method1919();
	return false;
    }
    
    void method9779(Class173 class173, int i) {
	/* empty */
    }
    
    public boolean method271() {
	return true;
    }
    
    public void method395(Class173 class173) {
	Object object = null;
	Class528_Sub21_Sub12 class528_sub21_sub12;
	if ((null
	     == ((Class645_Sub1_Sub4_Sub1) this).aClass528_Sub21_Sub12_11844)
	    && ((Class645_Sub1_Sub4_Sub1) this).aBool11846) {
	    Class20 class20 = method10749(class173, 262144, true, -2125744262);
	    class528_sub21_sub12
		= (Class528_Sub21_Sub12) (null != class20 ? class20.anObject209
					  : null);
	} else {
	    class528_sub21_sub12
		= ((Class645_Sub1_Sub4_Sub1) this).aClass528_Sub21_Sub12_11844;
	    ((Class645_Sub1_Sub4_Sub1) this).aClass528_Sub21_Sub12_11844
		= null;
	}
	Class422 class422 = method7693().aClass422_4868;
	if (null != class528_sub21_sub12)
	    aClass538_10676.method6581(class528_sub21_sub12, aByte10674,
				       (int) class422.aFloat4780,
				       (int) class422.aFloat4777, null,
				       (byte) -78);
    }
    
    public void method392(Class173 class173) {
	Object object = null;
	Class528_Sub21_Sub12 class528_sub21_sub12;
	if ((null
	     == ((Class645_Sub1_Sub4_Sub1) this).aClass528_Sub21_Sub12_11844)
	    && ((Class645_Sub1_Sub4_Sub1) this).aBool11846) {
	    Class20 class20 = method10749(class173, 262144, true, -1738330090);
	    class528_sub21_sub12
		= (Class528_Sub21_Sub12) (class20 != null ? class20.anObject209
					  : null);
	} else {
	    class528_sub21_sub12
		= ((Class645_Sub1_Sub4_Sub1) this).aClass528_Sub21_Sub12_11844;
	    ((Class645_Sub1_Sub4_Sub1) this).aClass528_Sub21_Sub12_11844
		= null;
	}
	Class422 class422 = method7693().aClass422_4868;
	if (null != class528_sub21_sub12)
	    aClass538_10676.method6568(class528_sub21_sub12, aByte10674,
				       (int) class422.aFloat4780,
				       (int) class422.aFloat4777, null,
				       2146512364);
    }
    
    public void method398(Class173 class173) {
	Object object = null;
	Class528_Sub21_Sub12 class528_sub21_sub12;
	if ((null
	     == ((Class645_Sub1_Sub4_Sub1) this).aClass528_Sub21_Sub12_11844)
	    && ((Class645_Sub1_Sub4_Sub1) this).aBool11846) {
	    Class20 class20 = method10749(class173, 262144, true, -1905210863);
	    class528_sub21_sub12
		= (Class528_Sub21_Sub12) (class20 != null ? class20.anObject209
					  : null);
	} else {
	    class528_sub21_sub12
		= ((Class645_Sub1_Sub4_Sub1) this).aClass528_Sub21_Sub12_11844;
	    ((Class645_Sub1_Sub4_Sub1) this).aClass528_Sub21_Sub12_11844
		= null;
	}
	Class422 class422 = method7693().aClass422_4868;
	if (null != class528_sub21_sub12)
	    aClass538_10676.method6568(class528_sub21_sub12, aByte10674,
				       (int) class422.aFloat4780,
				       (int) class422.aFloat4777, null,
				       2146101560);
    }
    
    boolean method9772() {
	if (null != ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851)
	    return !((Class645_Sub1_Sub4_Sub1) this).aClass157_11851
			.method1920();
	return true;
    }
    
    boolean method9783() {
	if (null != ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851)
	    return !((Class645_Sub1_Sub4_Sub1) this).aClass157_11851
			.method1920();
	return true;
    }
    
    boolean method9789() {
	if (null != ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851)
	    return !((Class645_Sub1_Sub4_Sub1) this).aClass157_11851
			.method1920();
	return true;
    }
    
    boolean method9790() {
	if (null != ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851)
	    return ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851
		       .method1919();
	return false;
    }
    
    Class157 method10746(Class173 class173, int i) {
	if (((Class645_Sub1_Sub4_Sub1) this).aClass157_11851 != null
	    && class173.method2245(((Class645_Sub1_Sub4_Sub1) this)
				       .aClass157_11851.method1874(),
				   i) == 0)
	    return ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851;
	Class20 class20 = method10749(class173, i, false, -1513895648);
	if (null != class20)
	    return (Class157) class20.anObject208;
	return null;
    }
    
    public int method9792() {
	return (((Class645_Sub1_Sub4_Sub1) this).aClass157_11851 != null
		? ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851.method2018()
		: 0);
    }
    
    void method9800(Class173 class173) {
	/* empty */
    }
    
    public Class554 method9794(Class173 class173) {
	Class422 class422 = method7693().aClass422_4868;
	if (((Class645_Sub1_Sub4_Sub1) this).aClass554_11845 == null)
	    ((Class645_Sub1_Sub4_Sub1) this).aClass554_11845
		= Class372.method4680((int) class422.aFloat4780,
				      (int) class422.aFloat4776,
				      (int) class422.aFloat4777,
				      method10744(class173, 0, (byte) -34),
				      1990569061);
	return ((Class645_Sub1_Sub4_Sub1) this).aClass554_11845;
    }
    
    Class157 method10747(Class173 class173, int i) {
	if (((Class645_Sub1_Sub4_Sub1) this).aClass157_11851 != null
	    && class173.method2245(((Class645_Sub1_Sub4_Sub1) this)
				       .aClass157_11851.method1874(),
				   i) == 0)
	    return ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851;
	Class20 class20 = method10749(class173, i, false, -2139695635);
	if (null != class20)
	    return (Class157) class20.anObject208;
	return null;
    }
    
    Class549 method9787(Class173 class173) {
	if (null == ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851)
	    return null;
	Class433 class433 = method7685();
	Class549 class549
	    = Class623.method7435(((Class645_Sub1_Sub4_Sub1) this).aBool11842,
				  -1767116695);
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub4_Sub1) this).aClass5_Sub15_11847.method63
		 (((Class645_Sub1_Sub4_Sub1) this).anInt11849 * -1057078555,
		  -1643409173)))
	       .aClass431_7800);
	if (class431 != null) {
	    ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851
		.method1897(class433, null, 0);
	    class173.method2227(class433, aClass159Array10678[0], class431);
	} else
	    ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851
		.method1897(class433, aClass159Array10678[0], 0);
	return class549;
    }
    
    Class549 method9778(Class173 class173) {
	if (null == ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851)
	    return null;
	Class433 class433 = method7685();
	Class549 class549
	    = Class623.method7435(((Class645_Sub1_Sub4_Sub1) this).aBool11842,
				  -2068369866);
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub4_Sub1) this).aClass5_Sub15_11847.method63
		 (((Class645_Sub1_Sub4_Sub1) this).anInt11849 * -1057078555,
		  708799866)))
	       .aClass431_7800);
	if (class431 != null) {
	    ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851
		.method1897(class433, null, 0);
	    class173.method2227(class433, aClass159Array10678[0], class431);
	} else
	    ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851
		.method1897(class433, aClass159Array10678[0], 0);
	return class549;
    }
    
    Class549 method9776(Class173 class173) {
	if (null == ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851)
	    return null;
	Class433 class433 = method7685();
	Class549 class549
	    = Class623.method7435(((Class645_Sub1_Sub4_Sub1) this).aBool11842,
				  898400959);
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub4_Sub1) this).aClass5_Sub15_11847.method63
		 (((Class645_Sub1_Sub4_Sub1) this).anInt11849 * -1057078555,
		  1136241308)))
	       .aClass431_7800);
	if (class431 != null) {
	    ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851
		.method1897(class433, null, 0);
	    class173.method2227(class433, aClass159Array10678[0], class431);
	} else
	    ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851
		.method1897(class433, aClass159Array10678[0], 0);
	return class549;
    }
    
    public boolean method396() {
	return true;
    }
    
    boolean method9801(Class173 class173, int i, int i_15_) {
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub4_Sub1) this).aClass5_Sub15_11847.method63
		 (((Class645_Sub1_Sub4_Sub1) this).anInt11849 * -1057078555,
		  1005499784)))
	       .aClass431_7800);
	if (null != class431)
	    return class173.method2225(i, i_15_, method7685(), class431,
				       (byte) 2);
	Class157 class157 = method10744(class173, 131072, (byte) -77);
	if (null != class157) {
	    Class433 class433 = method7685();
	    return class157.method2000(i, i_15_, class433, false, 0);
	}
	return false;
    }
    
    boolean method9774(Class173 class173, int i, int i_16_) {
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub4_Sub1) this).aClass5_Sub15_11847.method63
		 (((Class645_Sub1_Sub4_Sub1) this).anInt11849 * -1057078555,
		  1142703383)))
	       .aClass431_7800);
	if (null != class431)
	    return class173.method2225(i, i_16_, method7685(), class431,
				       (byte) 2);
	Class157 class157 = method10744(class173, 131072, (byte) -22);
	if (null != class157) {
	    Class433 class433 = method7685();
	    return class157.method2000(i, i_16_, class433, false, 0);
	}
	return false;
    }
    
    boolean method9802() {
	return ((Class645_Sub1_Sub4_Sub1) this).aBool11850;
    }
    
    boolean method9803() {
	return ((Class645_Sub1_Sub4_Sub1) this).aBool11850;
    }
    
    void method9804(Class173 class173, Class645_Sub1 class645_sub1, int i,
		    int i_17_, int i_18_, boolean bool) {
	if (class645_sub1 instanceof Class645_Sub1_Sub4_Sub1) {
	    Class645_Sub1_Sub4_Sub1 class645_sub1_sub4_sub1_19_
		= (Class645_Sub1_Sub4_Sub1) class645_sub1;
	    if (((Class645_Sub1_Sub4_Sub1) this).aClass157_11851 != null
		&& null != ((Class645_Sub1_Sub4_Sub1)
			    class645_sub1_sub4_sub1_19_).aClass157_11851)
		((Class645_Sub1_Sub4_Sub1) this).aClass157_11851.method1872
		    ((((Class645_Sub1_Sub4_Sub1) class645_sub1_sub4_sub1_19_)
		      .aClass157_11851),
		     i, i_17_, i_18_, bool);
	}
    }
    
    void method9805() {
	((Class645_Sub1_Sub4_Sub1) this).aBool11850 = false;
	if (null != ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851)
	    ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851.method1873
		(((Class645_Sub1_Sub4_Sub1) this).aClass157_11851.method1874()
		 & ~0x10000);
    }
    
    boolean method9771(int i) {
	return ((Class645_Sub1_Sub4_Sub1) this).aBool11850;
    }
    
    public boolean method391() {
	return ((Class645_Sub1_Sub4_Sub1) this).aBool11846;
    }
    
    public void method389(Class173 class173, byte i) {
	Object object = null;
	Class528_Sub21_Sub12 class528_sub21_sub12;
	if ((null
	     == ((Class645_Sub1_Sub4_Sub1) this).aClass528_Sub21_Sub12_11844)
	    && ((Class645_Sub1_Sub4_Sub1) this).aBool11846) {
	    Class20 class20 = method10749(class173, 262144, true, -1962230395);
	    class528_sub21_sub12
		= (Class528_Sub21_Sub12) (class20 != null ? class20.anObject209
					  : null);
	} else {
	    class528_sub21_sub12
		= ((Class645_Sub1_Sub4_Sub1) this).aClass528_Sub21_Sub12_11844;
	    ((Class645_Sub1_Sub4_Sub1) this).aClass528_Sub21_Sub12_11844
		= null;
	}
	Class422 class422 = method7693().aClass422_4868;
	if (null != class528_sub21_sub12)
	    aClass538_10676.method6568(class528_sub21_sub12, aByte10674,
				       (int) class422.aFloat4780,
				       (int) class422.aFloat4777, null,
				       2140719356);
    }
    
    Class157 method10748(Class173 class173, int i) {
	if (((Class645_Sub1_Sub4_Sub1) this).aClass157_11851 != null
	    && class173.method2245(((Class645_Sub1_Sub4_Sub1) this)
				       .aClass157_11851.method1874(),
				   i) == 0)
	    return ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851;
	Class20 class20 = method10749(class173, i, false, -1595078105);
	if (null != class20)
	    return (Class157) class20.anObject208;
	return null;
    }
    
    void method9808() {
	((Class645_Sub1_Sub4_Sub1) this).aBool11850 = false;
	if (null != ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851)
	    ((Class645_Sub1_Sub4_Sub1) this).aClass157_11851.method1873
		(((Class645_Sub1_Sub4_Sub1) this).aClass157_11851.method1874()
		 & ~0x10000);
    }
    
    Class20 method10749(Class173 class173, int i, boolean bool, int i_20_) {
	Class596 class596
	    = ((Class596)
	       (((Class645_Sub1_Sub4_Sub1) this).aClass5_Sub15_11847.method63
		(((Class645_Sub1_Sub4_Sub1) this).anInt11849 * -1057078555,
		 602253838)));
	Class137 class137;
	Class137 class137_21_;
	if (((Class645_Sub1_Sub4_Sub1) this).aBool11848) {
	    class137 = aClass538_10676.aClass137Array7202[aByte10674];
	    class137_21_ = aClass538_10676.aClass137Array7163[0];
	} else {
	    class137 = aClass538_10676.aClass137Array7163[aByte10674];
	    if (aByte10674 < 3)
		class137_21_
		    = aClass538_10676.aClass137Array7163[aByte10674 + 1];
	    else
		class137_21_ = null;
	}
	Class422 class422 = method7693().aClass422_4868;
	return class596.method7097(class173, i,
				   (Class605.aClass605_7913.anInt7905
				    * 1922173025),
				   ((Class645_Sub1_Sub4_Sub1) this).aByte11843,
				   class137, class137_21_,
				   (int) class422.aFloat4780,
				   (int) class422.aFloat4776,
				   (int) class422.aFloat4777, bool, null,
				   (byte) -58);
    }
}
