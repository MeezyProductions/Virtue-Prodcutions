/* Class645_Sub1_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class645_Sub1_Sub1_Sub2 extends Class645_Sub1_Sub1
    implements Interface60
{
    Class5_Sub15 aClass5_Sub15_11894;
    boolean aBool11895;
    Class157 aClass157_11896;
    Class554 aClass554_11897;
    int anInt11898;
    byte aByte11899;
    byte aByte11900;
    boolean aBool11901;
    Class528_Sub21_Sub12 aClass528_Sub21_Sub12_11902;
    boolean aBool11903;
    
    Class157 method10779(Class173 class173, int i) {
	if (((Class645_Sub1_Sub1_Sub2) this).aClass157_11896 != null
	    && class173.method2245(((Class645_Sub1_Sub1_Sub2) this)
				       .aClass157_11896.method1874(),
				   i) == 0)
	    return ((Class645_Sub1_Sub1_Sub2) this).aClass157_11896;
	Class20 class20 = method10781(class173, i, false, (byte) 0);
	if (null != class20)
	    return (Class157) class20.anObject208;
	return null;
    }
    
    boolean method9797(int i) {
	if (((Class645_Sub1_Sub1_Sub2) this).aClass157_11896 != null)
	    return !((Class645_Sub1_Sub1_Sub2) this).aClass157_11896
			.method1920();
	return true;
    }
    
    boolean method9775(short i) {
	if (((Class645_Sub1_Sub1_Sub2) this).aClass157_11896 != null)
	    return ((Class645_Sub1_Sub1_Sub2) this).aClass157_11896
		       .method1919();
	return false;
    }
    
    public void method398(Class173 class173) {
	Object object = null;
	Class528_Sub21_Sub12 class528_sub21_sub12;
	if ((((Class645_Sub1_Sub1_Sub2) this).aClass528_Sub21_Sub12_11902
	     == null)
	    && ((Class645_Sub1_Sub1_Sub2) this).aBool11895) {
	    Class20 class20 = method10781(class173, 262144, true, (byte) 0);
	    class528_sub21_sub12
		= (Class528_Sub21_Sub12) (class20 != null ? class20.anObject209
					  : null);
	} else {
	    class528_sub21_sub12
		= ((Class645_Sub1_Sub1_Sub2) this).aClass528_Sub21_Sub12_11902;
	    ((Class645_Sub1_Sub1_Sub2) this).aClass528_Sub21_Sub12_11902
		= null;
	}
	Class422 class422 = method7693().aClass422_4868;
	if (null != class528_sub21_sub12)
	    aClass538_10676.method6568(class528_sub21_sub12, aByte10674,
				       (int) class422.aFloat4780,
				       (int) class422.aFloat4777, null,
				       2143994264);
    }
    
    Class157 method10780(Class173 class173, int i, int i_0_) {
	if (((Class645_Sub1_Sub1_Sub2) this).aClass157_11896 != null
	    && class173.method2245(((Class645_Sub1_Sub1_Sub2) this)
				       .aClass157_11896.method1874(),
				   i) == 0)
	    return ((Class645_Sub1_Sub1_Sub2) this).aClass157_11896;
	Class20 class20 = method10781(class173, i, false, (byte) 0);
	if (null != class20)
	    return (Class157) class20.anObject208;
	return null;
    }
    
    Class20 method10781(Class173 class173, int i, boolean bool, byte i_1_) {
	Class596 class596
	    = ((Class596)
	       (((Class645_Sub1_Sub1_Sub2) this).aClass5_Sub15_11894.method63
		(-2098852279 * ((Class645_Sub1_Sub1_Sub2) this).anInt11898,
		 1773299766)));
	Class137 class137;
	Class137 class137_2_;
	if (((Class645_Sub1_Sub1_Sub2) this).aBool11901) {
	    class137 = aClass538_10676.aClass137Array7202[aByte10674];
	    class137_2_ = aClass538_10676.aClass137Array7163[0];
	} else {
	    class137 = aClass538_10676.aClass137Array7163[aByte10674];
	    if (aByte10674 < 3)
		class137_2_
		    = aClass538_10676.aClass137Array7163[aByte10674 + 1];
	    else
		class137_2_ = null;
	}
	Class422 class422 = method7693().aClass422_4868;
	return class596.method7097(class173, i,
				   ((Class645_Sub1_Sub1_Sub2) this).aByte11899,
				   ((Class645_Sub1_Sub1_Sub2) this).aByte11900,
				   class137, class137_2_,
				   (int) class422.aFloat4780,
				   (int) class422.aFloat4776,
				   (int) class422.aFloat4777, bool, null,
				   (byte) -78);
    }
    
    public Class554 method9780(Class173 class173, int i) {
	Class422 class422 = method7693().aClass422_4868;
	if (((Class645_Sub1_Sub1_Sub2) this).aClass554_11897 == null)
	    ((Class645_Sub1_Sub1_Sub2) this).aClass554_11897
		= Class372.method4680((int) class422.aFloat4780,
				      (int) class422.aFloat4776,
				      (int) class422.aFloat4777,
				      method10780(class173, 0, 660519573),
				      -260397510);
	return ((Class645_Sub1_Sub1_Sub2) this).aClass554_11897;
    }
    
    public int method9819(int i) {
	return (((Class645_Sub1_Sub1_Sub2) this).aClass157_11896 != null
		? ((Class645_Sub1_Sub1_Sub2) this).aClass157_11896.method2018()
		: 0);
    }
    
    public void method389(Class173 class173, byte i) {
	Object object = null;
	Class528_Sub21_Sub12 class528_sub21_sub12;
	if ((((Class645_Sub1_Sub1_Sub2) this).aClass528_Sub21_Sub12_11902
	     == null)
	    && ((Class645_Sub1_Sub1_Sub2) this).aBool11895) {
	    Class20 class20 = method10781(class173, 262144, true, (byte) 0);
	    class528_sub21_sub12
		= (Class528_Sub21_Sub12) (class20 != null ? class20.anObject209
					  : null);
	} else {
	    class528_sub21_sub12
		= ((Class645_Sub1_Sub1_Sub2) this).aClass528_Sub21_Sub12_11902;
	    ((Class645_Sub1_Sub1_Sub2) this).aClass528_Sub21_Sub12_11902
		= null;
	}
	Class422 class422 = method7693().aClass422_4868;
	if (null != class528_sub21_sub12)
	    aClass538_10676.method6568(class528_sub21_sub12, aByte10674,
				       (int) class422.aFloat4780,
				       (int) class422.aFloat4777, null,
				       2142698610);
    }
    
    public void method203() {
	if (((Class645_Sub1_Sub1_Sub2) this).aClass157_11896 != null)
	    ((Class645_Sub1_Sub1_Sub2) this).aClass157_11896.method1875();
    }
    
    public int method397(short i) {
	return -2098852279 * ((Class645_Sub1_Sub1_Sub2) this).anInt11898;
    }
    
    void method9800(Class173 class173) {
	/* empty */
    }
    
    public int method384(int i) {
	return ((Class645_Sub1_Sub1_Sub2) this).aByte11900;
    }
    
    public void method385(int i) {
	if (((Class645_Sub1_Sub1_Sub2) this).aClass157_11896 != null)
	    ((Class645_Sub1_Sub1_Sub2) this).aClass157_11896.method1875();
    }
    
    Class157 method10782(Class173 class173, int i) {
	if (((Class645_Sub1_Sub1_Sub2) this).aClass157_11896 != null
	    && class173.method2245(((Class645_Sub1_Sub1_Sub2) this)
				       .aClass157_11896.method1874(),
				   i) == 0)
	    return ((Class645_Sub1_Sub1_Sub2) this).aClass157_11896;
	Class20 class20 = method10781(class173, i, false, (byte) 0);
	if (null != class20)
	    return (Class157) class20.anObject208;
	return null;
    }
    
    public boolean method386(int i) {
	return ((Class645_Sub1_Sub1_Sub2) this).aBool11895;
    }
    
    Class549 method9778(Class173 class173) {
	if (((Class645_Sub1_Sub1_Sub2) this).aClass157_11896 == null)
	    return null;
	Class433 class433 = class173.method2479();
	class433.method5217(method7685());
	class433.method5252((float) aShort11696, 0.0F, (float) aShort11697);
	Class549 class549
	    = Class623.method7435(((Class645_Sub1_Sub1_Sub2) this).aBool11903,
				  392712198);
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub1_Sub2) this).aClass5_Sub15_11894.method63
		 (((Class645_Sub1_Sub1_Sub2) this).anInt11898 * -2098852279,
		  -285238433)))
	       .aClass431_7800);
	if (class431 != null) {
	    ((Class645_Sub1_Sub1_Sub2) this).aClass157_11896
		.method1897(class433, null, 0);
	    class173.method2227(class433, aClass159Array10678[0], class431);
	} else
	    ((Class645_Sub1_Sub1_Sub2) this).aClass157_11896
		.method1897(class433, aClass159Array10678[0], 0);
	return class549;
    }
    
    boolean method9791() {
	if (((Class645_Sub1_Sub1_Sub2) this).aClass157_11896 != null)
	    return ((Class645_Sub1_Sub1_Sub2) this).aClass157_11896
		       .method1919();
	return false;
    }
    
    public int method73() {
	return -2098852279 * ((Class645_Sub1_Sub1_Sub2) this).anInt11898;
    }
    
    public void method392(Class173 class173) {
	Object object = null;
	Class528_Sub21_Sub12 class528_sub21_sub12;
	if ((((Class645_Sub1_Sub1_Sub2) this).aClass528_Sub21_Sub12_11902
	     == null)
	    && ((Class645_Sub1_Sub1_Sub2) this).aBool11895) {
	    Class20 class20 = method10781(class173, 262144, true, (byte) 0);
	    class528_sub21_sub12
		= (Class528_Sub21_Sub12) (class20 != null ? class20.anObject209
					  : null);
	} else {
	    class528_sub21_sub12
		= ((Class645_Sub1_Sub1_Sub2) this).aClass528_Sub21_Sub12_11902;
	    ((Class645_Sub1_Sub1_Sub2) this).aClass528_Sub21_Sub12_11902
		= null;
	}
	Class422 class422 = method7693().aClass422_4868;
	if (null != class528_sub21_sub12)
	    aClass538_10676.method6568(class528_sub21_sub12, aByte10674,
				       (int) class422.aFloat4780,
				       (int) class422.aFloat4777, null,
				       2143696241);
    }
    
    public int method178() {
	return ((Class645_Sub1_Sub1_Sub2) this).aByte11899;
    }
    
    public int method390() {
	return ((Class645_Sub1_Sub1_Sub2) this).aByte11900;
    }
    
    public int method393() {
	return ((Class645_Sub1_Sub1_Sub2) this).aByte11900;
    }
    
    public int method394() {
	return ((Class645_Sub1_Sub1_Sub2) this).aByte11900;
    }
    
    public void method334() {
	if (((Class645_Sub1_Sub1_Sub2) this).aClass157_11896 != null)
	    ((Class645_Sub1_Sub1_Sub2) this).aClass157_11896.method1875();
    }
    
    public int method9792() {
	return (((Class645_Sub1_Sub1_Sub2) this).aClass157_11896 != null
		? ((Class645_Sub1_Sub1_Sub2) this).aClass157_11896.method2018()
		: 0);
    }
    
    public boolean method391() {
	return ((Class645_Sub1_Sub1_Sub2) this).aBool11895;
    }
    
    public boolean method396() {
	return true;
    }
    
    public boolean method271() {
	return true;
    }
    
    public void method395(Class173 class173) {
	Object object = null;
	Class528_Sub21_Sub12 class528_sub21_sub12;
	if ((((Class645_Sub1_Sub1_Sub2) this).aClass528_Sub21_Sub12_11902
	     == null)
	    && ((Class645_Sub1_Sub1_Sub2) this).aBool11895) {
	    Class20 class20 = method10781(class173, 262144, true, (byte) 0);
	    class528_sub21_sub12
		= (Class528_Sub21_Sub12) (null != class20 ? class20.anObject209
					  : null);
	} else {
	    class528_sub21_sub12
		= ((Class645_Sub1_Sub1_Sub2) this).aClass528_Sub21_Sub12_11902;
	    ((Class645_Sub1_Sub1_Sub2) this).aClass528_Sub21_Sub12_11902
		= null;
	}
	Class422 class422 = method7693().aClass422_4868;
	if (null != class528_sub21_sub12)
	    aClass538_10676.method6581(class528_sub21_sub12, aByte10674,
				       (int) class422.aFloat4780,
				       (int) class422.aFloat4777, null,
				       (byte) -70);
    }
    
    void method9779(Class173 class173, int i) {
	/* empty */
    }
    
    Class549 method9776(Class173 class173) {
	if (((Class645_Sub1_Sub1_Sub2) this).aClass157_11896 == null)
	    return null;
	Class433 class433 = class173.method2479();
	class433.method5217(method7685());
	class433.method5252((float) aShort11696, 0.0F, (float) aShort11697);
	Class549 class549
	    = Class623.method7435(((Class645_Sub1_Sub1_Sub2) this).aBool11903,
				  2061948354);
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub1_Sub2) this).aClass5_Sub15_11894.method63
		 (((Class645_Sub1_Sub1_Sub2) this).anInt11898 * -2098852279,
		  -1178376766)))
	       .aClass431_7800);
	if (class431 != null) {
	    ((Class645_Sub1_Sub1_Sub2) this).aClass157_11896
		.method1897(class433, null, 0);
	    class173.method2227(class433, aClass159Array10678[0], class431);
	} else
	    ((Class645_Sub1_Sub1_Sub2) this).aClass157_11896
		.method1897(class433, aClass159Array10678[0], 0);
	return class549;
    }
    
    boolean method9772() {
	if (((Class645_Sub1_Sub1_Sub2) this).aClass157_11896 != null)
	    return !((Class645_Sub1_Sub1_Sub2) this).aClass157_11896
			.method1920();
	return true;
    }
    
    boolean method9783() {
	if (((Class645_Sub1_Sub1_Sub2) this).aClass157_11896 != null)
	    return !((Class645_Sub1_Sub1_Sub2) this).aClass157_11896
			.method1920();
	return true;
    }
    
    boolean method9789() {
	if (((Class645_Sub1_Sub1_Sub2) this).aClass157_11896 != null)
	    return !((Class645_Sub1_Sub1_Sub2) this).aClass157_11896
			.method1920();
	return true;
    }
    
    boolean method9790() {
	if (((Class645_Sub1_Sub1_Sub2) this).aClass157_11896 != null)
	    return ((Class645_Sub1_Sub1_Sub2) this).aClass157_11896
		       .method1919();
	return false;
    }
    
    boolean method9801(Class173 class173, int i, int i_3_) {
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub1_Sub2) this).aClass5_Sub15_11894.method63
		 (-2098852279 * ((Class645_Sub1_Sub1_Sub2) this).anInt11898,
		  -1272298106)))
	       .aClass431_7800);
	if (null != class431)
	    return class173.method2225(i, i_3_, method7685(), class431,
				       (byte) 2);
	Class157 class157 = method10780(class173, 131072, 1996289758);
	if (null != class157) {
	    Class433 class433 = method7685();
	    return class157.method2000(i, i_3_, class433, false, 0);
	}
	return false;
    }
    
    public Class645_Sub1_Sub1_Sub2
	(Class538 class538, Class173 class173, Class5_Sub15 class5_sub15,
	 Class596 class596, int i, int i_4_, int i_5_, int i_6_, int i_7_,
	 boolean bool, int i_8_, int i_9_, int i_10_, int i_11_) {
	super(class538, i_5_, i_6_, i_7_, i, i_4_, i_8_, i_9_);
	((Class645_Sub1_Sub1_Sub2) this).aClass5_Sub15_11894 = class5_sub15;
	((Class645_Sub1_Sub1_Sub2) this).anInt11898
	    = class596.anInt7765 * 159766269;
	((Class645_Sub1_Sub1_Sub2) this).aBool11901 = bool;
	((Class645_Sub1_Sub1_Sub2) this).aByte11900 = (byte) i_11_;
	((Class645_Sub1_Sub1_Sub2) this).aByte11899 = (byte) i_10_;
	((Class645_Sub1_Sub1_Sub2) this).aBool11903
	    = 0 != class596.anInt7785 * 567849393 && !bool;
	((Class645_Sub1_Sub1_Sub2) this).aBool11895
	    = (class173.method2163() && class596.aBool7819
	       && !((Class645_Sub1_Sub1_Sub2) this).aBool11901
	       && Class514.aClass528_Sub38_6967.aClass691_Sub8_10565
		      .method9883(2133966928) != 0);
	int i_12_ = 2048;
	if (class596.aBool7768)
	    i_12_ |= 0x80000;
	Class20 class20
	    = method10781(class173, i_12_,
			  ((Class645_Sub1_Sub1_Sub2) this).aBool11895,
			  (byte) 0);
	if (null != class20) {
	    ((Class645_Sub1_Sub1_Sub2) this).aClass157_11896
		= (Class157) class20.anObject208;
	    ((Class645_Sub1_Sub1_Sub2) this).aClass528_Sub21_Sub12_11902
		= (Class528_Sub21_Sub12) class20.anObject209;
	    if (class596.aBool7768) {
		((Class645_Sub1_Sub1_Sub2) this).aClass157_11896
		    = ((Class645_Sub1_Sub1_Sub2) this).aClass157_11896
			  .method1951((byte) 0, i_12_, false);
		if (class596.aBool7768) {
		    Class491 class491
			= client.gameScene.method6004(-735391224);
		    ((Class645_Sub1_Sub1_Sub2) this).aClass157_11896.method1917
			(class491.anInt5514 * -1316786341,
			 -380000269 * class491.anInt5512,
			 class491.anInt5513 * 383347061,
			 771824171 * class491.anInt5515);
		}
	    }
	}
	method9786(1, 1348101151);
    }
    
    public int method9793() {
	return (((Class645_Sub1_Sub1_Sub2) this).aClass157_11896 != null
		? ((Class645_Sub1_Sub1_Sub2) this).aClass157_11896.method2018()
		: 0);
    }
    
    public Class554 method9794(Class173 class173) {
	Class422 class422 = method7693().aClass422_4868;
	if (((Class645_Sub1_Sub1_Sub2) this).aClass554_11897 == null)
	    ((Class645_Sub1_Sub1_Sub2) this).aClass554_11897
		= Class372.method4680((int) class422.aFloat4780,
				      (int) class422.aFloat4776,
				      (int) class422.aFloat4777,
				      method10780(class173, 0, 1511567219),
				      1414915776);
	return ((Class645_Sub1_Sub1_Sub2) this).aClass554_11897;
    }
    
    public Class554 method9795(Class173 class173) {
	Class422 class422 = method7693().aClass422_4868;
	if (((Class645_Sub1_Sub1_Sub2) this).aClass554_11897 == null)
	    ((Class645_Sub1_Sub1_Sub2) this).aClass554_11897
		= Class372.method4680((int) class422.aFloat4780,
				      (int) class422.aFloat4776,
				      (int) class422.aFloat4777,
				      method10780(class173, 0, 210205258),
				      998239628);
	return ((Class645_Sub1_Sub1_Sub2) this).aClass554_11897;
    }
    
    Class549 method9787(Class173 class173) {
	if (((Class645_Sub1_Sub1_Sub2) this).aClass157_11896 == null)
	    return null;
	Class433 class433 = class173.method2479();
	class433.method5217(method7685());
	class433.method5252((float) aShort11696, 0.0F, (float) aShort11697);
	Class549 class549
	    = Class623.method7435(((Class645_Sub1_Sub1_Sub2) this).aBool11903,
				  -1429528627);
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub1_Sub2) this).aClass5_Sub15_11894.method63
		 (((Class645_Sub1_Sub1_Sub2) this).anInt11898 * -2098852279,
		  -300051291)))
	       .aClass431_7800);
	if (class431 != null) {
	    ((Class645_Sub1_Sub1_Sub2) this).aClass157_11896
		.method1897(class433, null, 0);
	    class173.method2227(class433, aClass159Array10678[0], class431);
	} else
	    ((Class645_Sub1_Sub1_Sub2) this).aClass157_11896
		.method1897(class433, aClass159Array10678[0], 0);
	return class549;
    }
    
    Class549 method9813(Class173 class173, int i) {
	if (((Class645_Sub1_Sub1_Sub2) this).aClass157_11896 == null)
	    return null;
	Class433 class433 = class173.method2479();
	class433.method5217(method7685());
	class433.method5252((float) aShort11696, 0.0F, (float) aShort11697);
	Class549 class549
	    = Class623.method7435(((Class645_Sub1_Sub1_Sub2) this).aBool11903,
				  -1542494187);
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub1_Sub2) this).aClass5_Sub15_11894.method63
		 (((Class645_Sub1_Sub1_Sub2) this).anInt11898 * -2098852279,
		  648584330)))
	       .aClass431_7800);
	if (class431 != null) {
	    ((Class645_Sub1_Sub1_Sub2) this).aClass157_11896
		.method1897(class433, null, 0);
	    class173.method2227(class433, aClass159Array10678[0], class431);
	} else
	    ((Class645_Sub1_Sub1_Sub2) this).aClass157_11896
		.method1897(class433, aClass159Array10678[0], 0);
	return class549;
    }
    
    public int method168(int i) {
	return ((Class645_Sub1_Sub1_Sub2) this).aByte11899;
    }
    
    boolean method9820(Class173 class173, int i, int i_13_, byte i_14_) {
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub1_Sub2) this).aClass5_Sub15_11894.method63
		 (-2098852279 * ((Class645_Sub1_Sub1_Sub2) this).anInt11898,
		  -2054689844)))
	       .aClass431_7800);
	if (null != class431)
	    return class173.method2225(i, i_13_, method7685(), class431,
				       (byte) 2);
	Class157 class157 = method10780(class173, 131072, 2001890216);
	if (null != class157) {
	    Class433 class433 = method7685();
	    return class157.method2000(i, i_13_, class433, false, 0);
	}
	return false;
    }
    
    public int method74() {
	return ((Class645_Sub1_Sub1_Sub2) this).aByte11899;
    }
    
    boolean method9774(Class173 class173, int i, int i_15_) {
	Class431 class431
	    = (((Class596)
		(((Class645_Sub1_Sub1_Sub2) this).aClass5_Sub15_11894.method63
		 (-2098852279 * ((Class645_Sub1_Sub1_Sub2) this).anInt11898,
		  -989944460)))
	       .aClass431_7800);
	if (null != class431)
	    return class173.method2225(i, i_15_, method7685(), class431,
				       (byte) 2);
	Class157 class157 = method10780(class173, 131072, 260787784);
	if (null != class157) {
	    Class433 class433 = method7685();
	    return class157.method2000(i, i_15_, class433, false, 0);
	}
	return false;
    }
    
    public void method388(Class173 class173, int i) {
	Object object = null;
	Class528_Sub21_Sub12 class528_sub21_sub12;
	if ((((Class645_Sub1_Sub1_Sub2) this).aClass528_Sub21_Sub12_11902
	     == null)
	    && ((Class645_Sub1_Sub1_Sub2) this).aBool11895) {
	    Class20 class20 = method10781(class173, 262144, true, (byte) 0);
	    class528_sub21_sub12
		= (Class528_Sub21_Sub12) (null != class20 ? class20.anObject209
					  : null);
	} else {
	    class528_sub21_sub12
		= ((Class645_Sub1_Sub1_Sub2) this).aClass528_Sub21_Sub12_11902;
	    ((Class645_Sub1_Sub1_Sub2) this).aClass528_Sub21_Sub12_11902
		= null;
	}
	Class422 class422 = method7693().aClass422_4868;
	if (null != class528_sub21_sub12)
	    aClass538_10676.method6581(class528_sub21_sub12, aByte10674,
				       (int) class422.aFloat4780,
				       (int) class422.aFloat4777, null,
				       (byte) -114);
    }
    
    Class157 method10783(Class173 class173, int i) {
	if (((Class645_Sub1_Sub1_Sub2) this).aClass157_11896 != null
	    && class173.method2245(((Class645_Sub1_Sub1_Sub2) this)
				       .aClass157_11896.method1874(),
				   i) == 0)
	    return ((Class645_Sub1_Sub1_Sub2) this).aClass157_11896;
	Class20 class20 = method10781(class173, i, false, (byte) 0);
	if (null != class20)
	    return (Class157) class20.anObject208;
	return null;
    }
    
    public boolean method387(byte i) {
	return true;
    }
    
    Class20 method10784(Class173 class173, int i, boolean bool) {
	Class596 class596
	    = ((Class596)
	       (((Class645_Sub1_Sub1_Sub2) this).aClass5_Sub15_11894.method63
		(-2098852279 * ((Class645_Sub1_Sub1_Sub2) this).anInt11898,
		 373226084)));
	Class137 class137;
	Class137 class137_16_;
	if (((Class645_Sub1_Sub1_Sub2) this).aBool11901) {
	    class137 = aClass538_10676.aClass137Array7202[aByte10674];
	    class137_16_ = aClass538_10676.aClass137Array7163[0];
	} else {
	    class137 = aClass538_10676.aClass137Array7163[aByte10674];
	    if (aByte10674 < 3)
		class137_16_
		    = aClass538_10676.aClass137Array7163[aByte10674 + 1];
	    else
		class137_16_ = null;
	}
	Class422 class422 = method7693().aClass422_4868;
	return class596.method7097(class173, i,
				   ((Class645_Sub1_Sub1_Sub2) this).aByte11899,
				   ((Class645_Sub1_Sub1_Sub2) this).aByte11900,
				   class137, class137_16_,
				   (int) class422.aFloat4780,
				   (int) class422.aFloat4776,
				   (int) class422.aFloat4777, bool, null,
				   (byte) -99);
    }
}
