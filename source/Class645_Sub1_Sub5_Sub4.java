/* Class645_Sub1_Sub5_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class645_Sub1_Sub5_Sub4 extends Class645_Sub1_Sub5
{
    int anInt11994;
    int anInt11995;
    int anInt11996 = 0;
    int anInt11997 = 0;
    boolean aBool11998 = true;
    Class612 aClass612_11999;
    Class690 aClass690_12000;
    
    void method10843(Class173 class173, Class157 class157, Class433 class433) {
	class157.method1921(class433);
	Class170[] class170s = class157.method1922();
	Class144[] class144s = class157.method1923();
	if ((((Class645_Sub1_Sub5_Sub4) this).aClass612_11999 == null
	     || ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999.aBool7979)
	    && (class170s != null || null != class144s))
	    ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999
		= Class612.method7315(client.anInt11127, true);
	if (null != ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999) {
	    ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999.method7306
		(class173, (long) client.anInt11127, class170s, class144s,
		 false);
	    ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999.method7303
		(aByte10675, aShort11747, aShort11743, aShort11745,
		 aShort11746);
	}
    }
    
    public final boolean method10844() {
	return (((Class645_Sub1_Sub5_Sub4) this).aClass690_12000 != null
		&& !((Class645_Sub1_Sub5_Sub4) this).aClass690_12000
			.method8075((byte) 102));
    }
    
    boolean method9775(short i) {
	return ((Class645_Sub1_Sub5_Sub4) this).aBool11998;
    }
    
    public int method9819(int i) {
	return ((Class645_Sub1_Sub5_Sub4) this).anInt11997 * -262907981;
    }
    
    public int method10845(int i) {
	return 980539535 * ((Class645_Sub1_Sub5_Sub4) this).anInt11995;
    }
    
    public final void method10846(int i) {
	if (((Class645_Sub1_Sub5_Sub4) this).aClass690_12000 != null
	    && !((Class645_Sub1_Sub5_Sub4) this).aClass690_12000
		    .method8082(-605457166))
	    ((Class645_Sub1_Sub5_Sub4) this).aClass690_12000
		.method8080(i, (byte) 11);
    }
    
    public final void method10847(int i, int i_0_) {
	if (((Class645_Sub1_Sub5_Sub4) this).aClass690_12000 != null
	    && !((Class645_Sub1_Sub5_Sub4) this).aClass690_12000
		    .method8082(233546457))
	    ((Class645_Sub1_Sub5_Sub4) this).aClass690_12000
		.method8080(i, (byte) 11);
    }
    
    public void method10848(int i) {
	if (null != ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999)
	    ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999.method7304();
    }
    
    public final boolean method10849(byte i) {
	return (((Class645_Sub1_Sub5_Sub4) this).aClass690_12000 == null
		|| ((Class645_Sub1_Sub5_Sub4) this).aClass690_12000
		       .method8082(-1545862508));
    }
    
    Class157 method10850(Class173 class173, int i, int i_1_, int i_2_) {
	Class669 class669
	    = (Class669) Class2.aClass5_Sub12_24.method63(i_1_, 859548505);
	Class137 class137 = aClass538_10676.aClass137Array7163[aByte10675];
	Class137 class137_3_
	    = (aByte10674 < 3
	       ? aClass538_10676.aClass137Array7163[1 + aByte10674] : null);
	Class422 class422 = method7693().aClass422_4868;
	return ((null != ((Class645_Sub1_Sub5_Sub4) this).aClass690_12000
		 && !((Class645_Sub1_Sub5_Sub4) this).aClass690_12000
			 .method8082(132469335))
		? (class669.method7928
		   (class173, i,
		    -1825978368 * ((Class645_Sub1_Sub5_Sub4) this).anInt11996,
		    class137, class137_3_, (int) class422.aFloat4780,
		    (int) class422.aFloat4776, (int) class422.aFloat4777,
		    ((Class645_Sub1_Sub5_Sub4) this).aClass690_12000, (byte) 2,
		    456911855))
		: class669.method7928(class173, i,
				      (((Class645_Sub1_Sub5_Sub4) this)
				       .anInt11996) * -1825978368,
				      class137, class137_3_,
				      (int) class422.aFloat4780,
				      (int) class422.aFloat4776,
				      (int) class422.aFloat4777, null,
				      (byte) 2, 1214373013));
    }
    
    Class549 method9813(Class173 class173, int i) {
	Class157 class157
	    = method10850(class173,
			  0x800 | ((((Class645_Sub1_Sub5_Sub4) this).anInt11996
				    * 2127717689) != 0
				   ? 5 : 0),
			  (((Class645_Sub1_Sub5_Sub4) this).anInt11994
			   * -1591304671),
			  -1290817838);
	if (null == class157)
	    return null;
	Class433 class433 = method7685();
	method10856(class173, class157, class433, (byte) -96);
	Class549 class549 = Class623.method7435(false, -1243778034);
	class157.method1897(class433, aClass159Array10678[0], 0);
	if (null != ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999) {
	    Class171 class171 = ((Class645_Sub1_Sub5_Sub4) this)
				    .aClass612_11999.method7312();
	    class173.method2209(class171);
	}
	((Class645_Sub1_Sub5_Sub4) this).aBool11998 = class157.method1919();
	((Class645_Sub1_Sub5_Sub4) this).anInt11997
	    = class157.method2018() * 387985275;
	class157.method1901();
	return class549;
    }
    
    void method9779(Class173 class173, int i) {
	Class157 class157
	    = method10850(class173, 0,
			  (-1591304671
			   * ((Class645_Sub1_Sub5_Sub4) this).anInt11994),
			  -689252019);
	if (class157 != null)
	    method10856(class173, class157, method7685(), (byte) -72);
    }
    
    public Class645_Sub1_Sub5_Sub4
	(Class538 class538, int i, int i_4_, int i_5_, int i_6_, int i_7_,
	 int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_,
	 int i_14_, boolean bool, int i_15_) {
	super(class538, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_, i_12_,
	      i_13_, false, (byte) 0);
	((Class645_Sub1_Sub5_Sub4) this).anInt11995 = 0;
	((Class645_Sub1_Sub5_Sub4) this).anInt11994 = i * -1825806879;
	((Class645_Sub1_Sub5_Sub4) this).anInt11996 = 223803657 * i_14_;
	((Class645_Sub1_Sub5_Sub4) this).anInt11995 = i_15_ * 1070876271;
	Class669 class669
	    = ((Class669)
	       Class2.aClass5_Sub12_24.method63((-1591304671
						 * ((Class645_Sub1_Sub5_Sub4)
						    this).anInt11994),
						271723188));
	int i_16_ = class669.anInt8519 * 916695593;
	if (-1 != i_16_) {
	    ((Class645_Sub1_Sub5_Sub4) this).aClass690_12000
		= new Class690_Sub1(this, false);
	    int i_17_ = class669.aBool8504 ? 0 : 2;
	    if (bool)
		i_17_ = 1;
	    ((Class645_Sub1_Sub5_Sub4) this).aClass690_12000
		.method8120(i_16_, i_4_, i_17_, false, 360881047);
	}
	method9786(1, 364636149);
    }
    
    Class549 method9787(Class173 class173) {
	Class157 class157
	    = method10850(class173,
			  0x800 | ((((Class645_Sub1_Sub5_Sub4) this).anInt11996
				    * 2127717689) != 0
				   ? 5 : 0),
			  (((Class645_Sub1_Sub5_Sub4) this).anInt11994
			   * -1591304671),
			  -1378814748);
	if (null == class157)
	    return null;
	Class433 class433 = method7685();
	method10856(class173, class157, class433, (byte) -79);
	Class549 class549 = Class623.method7435(false, -333861621);
	class157.method1897(class433, aClass159Array10678[0], 0);
	if (null != ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999) {
	    Class171 class171 = ((Class645_Sub1_Sub5_Sub4) this)
				    .aClass612_11999.method7312();
	    class173.method2209(class171);
	}
	((Class645_Sub1_Sub5_Sub4) this).aBool11998 = class157.method1919();
	((Class645_Sub1_Sub5_Sub4) this).anInt11997
	    = class157.method2018() * 387985275;
	class157.method1901();
	return class549;
    }
    
    boolean method9820(Class173 class173, int i, int i_18_, byte i_19_) {
	return false;
    }
    
    public final boolean method10851() {
	return (((Class645_Sub1_Sub5_Sub4) this).aClass690_12000 != null
		&& !((Class645_Sub1_Sub5_Sub4) this).aClass690_12000
			.method8075((byte) 103));
    }
    
    final void method9798(Class173 class173, Class645_Sub1 class645_sub1,
			  int i, int i_20_, int i_21_, boolean bool,
			  int i_22_) {
	throw new IllegalStateException();
    }
    
    final void method9777(int i) {
	throw new IllegalStateException();
    }
    
    boolean method9772() {
	return false;
    }
    
    boolean method9783() {
	return false;
    }
    
    boolean method9789() {
	return false;
    }
    
    final boolean method9803() {
	return false;
    }
    
    public final boolean method10852() {
	return (((Class645_Sub1_Sub5_Sub4) this).aClass690_12000 == null
		|| ((Class645_Sub1_Sub5_Sub4) this).aClass690_12000
		       .method8082(-1311764921));
    }
    
    public final boolean method10853() {
	return (((Class645_Sub1_Sub5_Sub4) this).aClass690_12000 == null
		|| ((Class645_Sub1_Sub5_Sub4) this).aClass690_12000
		       .method8082(-1558397498));
    }
    
    public void method10854() {
	if (null != ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999)
	    ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999.method7304();
    }
    
    public Class554 method9794(Class173 class173) {
	return null;
    }
    
    public Class554 method9795(Class173 class173) {
	return null;
    }
    
    public int method9793() {
	return ((Class645_Sub1_Sub5_Sub4) this).anInt11997 * -262907981;
    }
    
    public Class554 method9780(Class173 class173, int i) {
	return null;
    }
    
    Class549 method9776(Class173 class173) {
	Class157 class157
	    = method10850(class173,
			  0x800 | ((((Class645_Sub1_Sub5_Sub4) this).anInt11996
				    * 2127717689) != 0
				   ? 5 : 0),
			  (((Class645_Sub1_Sub5_Sub4) this).anInt11994
			   * -1591304671),
			  -1199041969);
	if (null == class157)
	    return null;
	Class433 class433 = method7685();
	method10856(class173, class157, class433, (byte) -98);
	Class549 class549 = Class623.method7435(false, 1782238717);
	class157.method1897(class433, aClass159Array10678[0], 0);
	if (null != ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999) {
	    Class171 class171 = ((Class645_Sub1_Sub5_Sub4) this)
				    .aClass612_11999.method7312();
	    class173.method2209(class171);
	}
	((Class645_Sub1_Sub5_Sub4) this).aBool11998 = class157.method1919();
	((Class645_Sub1_Sub5_Sub4) this).anInt11997
	    = class157.method2018() * 387985275;
	class157.method1901();
	return class549;
    }
    
    void method9800(Class173 class173) {
	Class157 class157
	    = method10850(class173, 0,
			  (-1591304671
			   * ((Class645_Sub1_Sub5_Sub4) this).anInt11994),
			  266728293);
	if (class157 != null)
	    method10856(class173, class157, method7685(), (byte) -20);
    }
    
    boolean method9801(Class173 class173, int i, int i_23_) {
	return false;
    }
    
    boolean method9790() {
	return ((Class645_Sub1_Sub5_Sub4) this).aBool11998;
    }
    
    final boolean method9802() {
	return false;
    }
    
    public int method9792() {
	return ((Class645_Sub1_Sub5_Sub4) this).anInt11997 * -262907981;
    }
    
    boolean method9797(int i) {
	return false;
    }
    
    final void method9805() {
	throw new IllegalStateException();
    }
    
    final void method9808() {
	throw new IllegalStateException();
    }
    
    final void method9806() {
	throw new IllegalStateException();
    }
    
    public int method10855() {
	return 980539535 * ((Class645_Sub1_Sub5_Sub4) this).anInt11995;
    }
    
    void method10856(Class173 class173, Class157 class157, Class433 class433,
		     byte i) {
	class157.method1921(class433);
	Class170[] class170s = class157.method1922();
	Class144[] class144s = class157.method1923();
	if ((((Class645_Sub1_Sub5_Sub4) this).aClass612_11999 == null
	     || ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999.aBool7979)
	    && (class170s != null || null != class144s))
	    ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999
		= Class612.method7315(client.anInt11127, true);
	if (null != ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999) {
	    ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999.method7306
		(class173, (long) client.anInt11127, class170s, class144s,
		 false);
	    ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999.method7303
		(aByte10675, aShort11747, aShort11743, aShort11745,
		 aShort11746);
	}
    }
    
    final void method9804(Class173 class173, Class645_Sub1 class645_sub1,
			  int i, int i_24_, int i_25_, boolean bool) {
	throw new IllegalStateException();
    }
    
    Class549 method9778(Class173 class173) {
	Class157 class157
	    = method10850(class173,
			  0x800 | ((((Class645_Sub1_Sub5_Sub4) this).anInt11996
				    * 2127717689) != 0
				   ? 5 : 0),
			  (((Class645_Sub1_Sub5_Sub4) this).anInt11994
			   * -1591304671),
			  1005652369);
	if (null == class157)
	    return null;
	Class433 class433 = method7685();
	method10856(class173, class157, class433, (byte) -41);
	Class549 class549 = Class623.method7435(false, -1703595289);
	class157.method1897(class433, aClass159Array10678[0], 0);
	if (null != ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999) {
	    Class171 class171 = ((Class645_Sub1_Sub5_Sub4) this)
				    .aClass612_11999.method7312();
	    class173.method2209(class171);
	}
	((Class645_Sub1_Sub5_Sub4) this).aBool11998 = class157.method1919();
	((Class645_Sub1_Sub5_Sub4) this).anInt11997
	    = class157.method2018() * 387985275;
	class157.method1901();
	return class549;
    }
    
    final boolean method9771(int i) {
	return false;
    }
    
    public final boolean method10857() {
	return (((Class645_Sub1_Sub5_Sub4) this).aClass690_12000 == null
		|| ((Class645_Sub1_Sub5_Sub4) this).aClass690_12000
		       .method8082(-760317340));
    }
    
    public int method10858() {
	return 980539535 * ((Class645_Sub1_Sub5_Sub4) this).anInt11995;
    }
    
    public final boolean method10859(int i) {
	return (((Class645_Sub1_Sub5_Sub4) this).aClass690_12000 != null
		&& !((Class645_Sub1_Sub5_Sub4) this).aClass690_12000
			.method8075((byte) 6));
    }
    
    void method10860(Class173 class173, Class157 class157, Class433 class433) {
	class157.method1921(class433);
	Class170[] class170s = class157.method1922();
	Class144[] class144s = class157.method1923();
	if ((((Class645_Sub1_Sub5_Sub4) this).aClass612_11999 == null
	     || ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999.aBool7979)
	    && (class170s != null || null != class144s))
	    ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999
		= Class612.method7315(client.anInt11127, true);
	if (null != ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999) {
	    ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999.method7306
		(class173, (long) client.anInt11127, class170s, class144s,
		 false);
	    ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999.method7303
		(aByte10675, aShort11747, aShort11743, aShort11745,
		 aShort11746);
	}
    }
    
    boolean method9774(Class173 class173, int i, int i_26_) {
	return false;
    }
    
    public void method10861() {
	if (null != ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999)
	    ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999.method7304();
    }
    
    public void method10862() {
	if (null != ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999)
	    ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999.method7304();
    }
    
    boolean method9791() {
	return ((Class645_Sub1_Sub5_Sub4) this).aBool11998;
    }
    
    public void method10863() {
	if (null != ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999)
	    ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999.method7304();
    }
    
    public void method10864() {
	if (null != ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999)
	    ((Class645_Sub1_Sub5_Sub4) this).aClass612_11999.method7304();
    }
}
