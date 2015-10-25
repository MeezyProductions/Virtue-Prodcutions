/* Class586 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class586 implements Interface17
{
    static final long aLong7705 = 4611686018427387903L;
    static final long aLong7706 = 4611686018427387904L;
    static final long aLong7707 = 1L;
    int[] anIntArray7708;
    int[] anIntArray7709;
    Class692 aClass692_7710 = new Class692(128);
    static final long aLong7711 = 500L;
    
    public void method7003(VarDefinition varDefinition, int i, int i_0_) {
	try {
	    int i_1_ = varDefinition.method4132((((Class586) this).anIntArray7709
					    [(varDefinition.aClass142_3415.anInt1637
					      * -1285823079)]),
					   i, 1535916039);
	    method7005(varDefinition.aClass142_3415, i_1_, -29551502);
	} catch (Exception_Sub3 exception_sub3) {
	    /* empty */
	}
    }
    
    public int method7004(boolean bool, int i) {
	long l = Class249.method3417(1964362503);
	for (Class528_Sub32 class528_sub32
		 = ((Class528_Sub32)
		    (bool
		     ? ((Class586) this).aClass692_7710.method8146(-1942855841)
		     : ((Class586) this).aClass692_7710
			   .method8138(455737852)));
	     null != class528_sub32;
	     class528_sub32 = (Class528_Sub32) ((Class586) this)
						   .aClass692_7710
						   .method8138(-1594702834)) {
	    if ((class528_sub32.aLong10469 * 9198117397452292413L
		 & 0x3fffffffffffffffL)
		< l) {
		if ((9198117397452292413L * class528_sub32.aLong10469
		     & 0x4000000000000000L)
		    != 0L) {
		    int i_2_ = (int) (-4849232331708333273L
				      * class528_sub32.aLong7107);
		    ((Class586) this).anIntArray7708[i_2_]
			= ((Class586) this).anIntArray7709[i_2_];
		    class528_sub32.method6443(-595518367);
		    return i_2_;
		}
		class528_sub32.method6443(2087911904);
	    }
	}
	return -1;
    }
    
    public Class586() {
	((Class586) this).anIntArray7709
	    = new int[Class691_Sub20.aClass95_Sub1_Sub2_10751
			  .method62((short) 3553)];
	((Class586) this).anIntArray7708
	    = new int[Class691_Sub20.aClass95_Sub1_Sub2_10751
			  .method62((short) 3553)];
    }
    
    public int method114(Class142 class142, byte i) {
	return (((Class586) this).anIntArray7708
		[-1285823079 * class142.anInt1637]);
    }
    
    public void method7005(Class142 class142, int i, int i_3_) {
	((Class586) this).anIntArray7709[class142.anInt1637 * -1285823079] = i;
	Class528_Sub32 class528_sub32
	    = ((Class528_Sub32)
	       ((Class586) this).aClass692_7710
		   .method8137((long) (class142.anInt1637 * -1285823079)));
	if (null != class528_sub32) {
	    if (class528_sub32.aLong10469 * 9198117397452292413L
		!= 4611686018427387905L)
		class528_sub32.aLong10469
		    = (Class249.method3417(2057084709) + 500L
		       | 0x4000000000000000L) * -684332442695901675L;
	} else {
	    class528_sub32 = new Class528_Sub32(4611686018427387905L);
	    ((Class586) this).aClass692_7710.method8142
		(class528_sub32, (long) (class142.anInt1637 * -1285823079));
	}
    }
    
    public int method97(VarDefinition varDefinition, int i) {
	return varDefinition.method4131((((Class586) this).anIntArray7708
				    [(-1285823079
				      * varDefinition.aClass142_3415.anInt1637)]),
				   468105874);
    }
    
    public void method98(VarDefinition varDefinition, int i, byte i_4_)
	throws Exception_Sub3 {
	int i_5_ = varDefinition.method4132((((Class586) this).anIntArray7708
					[(varDefinition.aClass142_3415.anInt1637
					  * -1285823079)]),
				       i, 1521933358);
	method92(varDefinition.aClass142_3415, i_5_, -2002352968);
    }
    
    public void method94(VarDefinition varDefinition, int i) throws Exception_Sub3 {
	int i_6_ = varDefinition.method4132((((Class586) this).anIntArray7708
					[(varDefinition.aClass142_3415.anInt1637
					  * -1285823079)]),
				       i, 1619682090);
	method92(varDefinition.aClass142_3415, i_6_, -1180485338);
    }
    
    public long method93(Class142 class142, int i) {
	throw new UnsupportedOperationException();
    }
    
    public Object method109(Class142 class142, int i) {
	throw new UnsupportedOperationException();
    }
    
    public void method113(Class142 class142, Object object, int i) {
	throw new UnsupportedOperationException();
    }
    
    public void method7006(int i) {
	for (int i_7_ = 0; i_7_ < Class691_Sub20.aClass95_Sub1_Sub2_10751
				      .method62((short) 3553); i_7_++) {
	    Class142_Sub1 class142_sub1
		= (Class142_Sub1) Class691_Sub20.aClass95_Sub1_Sub2_10751
				      .method63(i_7_, 456979982);
	    if (null != class142_sub1) {
		((Class586) this).anIntArray7709[i_7_] = 0;
		((Class586) this).anIntArray7708[i_7_] = 0;
	    }
	}
	((Class586) this).aClass692_7710 = new Class692(128);
    }
    
    public int method100(Class142 class142) {
	return (((Class586) this).anIntArray7708
		[-1285823079 * class142.anInt1637]);
    }
    
    public int method101(VarDefinition varDefinition) {
	return varDefinition.method4131((((Class586) this).anIntArray7708
				    [(-1285823079
				      * varDefinition.aClass142_3415.anInt1637)]),
				   -439604877);
    }
    
    public int method102(VarDefinition varDefinition) {
	return varDefinition.method4131((((Class586) this).anIntArray7708
				    [(-1285823079
				      * varDefinition.aClass142_3415.anInt1637)]),
				   -1992610028);
    }
    
    public Object method104(Class142 class142) {
	throw new UnsupportedOperationException();
    }
    
    public void method92(Class142 class142, int i, int i_8_) {
	((Class586) this).anIntArray7708[-1285823079 * class142.anInt1637] = i;
	Class528_Sub32 class528_sub32
	    = ((Class528_Sub32)
	       ((Class586) this).aClass692_7710
		   .method8137((long) (-1285823079 * class142.anInt1637)));
	if (null != class528_sub32)
	    class528_sub32.aLong10469 = (Class249.method3417(2038000233)
					 + 500L) * -684332442695901675L;
	else {
	    class528_sub32
		= new Class528_Sub32(Class249.method3417(2139354464) + 500L);
	    ((Class586) this).aClass692_7710.method8142
		(class528_sub32, (long) (class142.anInt1637 * -1285823079));
	}
    }
    
    public void method106(Class142 class142, long l) {
	throw new UnsupportedOperationException();
    }
    
    public int method110(Class142 class142) {
	return (((Class586) this).anIntArray7708
		[-1285823079 * class142.anInt1637]);
    }
    
    public Object method108(Class142 class142) {
	throw new UnsupportedOperationException();
    }
    
    public Object method91(Class142 class142) {
	throw new UnsupportedOperationException();
    }
    
    public void method96(Class142 class142, Object object) {
	throw new UnsupportedOperationException();
    }
    
    public void method111(Class142 class142, Object object) {
	throw new UnsupportedOperationException();
    }
    
    public void method112(VarDefinition varDefinition, int i) throws Exception_Sub3 {
	int i_9_ = varDefinition.method4132((((Class586) this).anIntArray7708
					[(varDefinition.aClass142_3415.anInt1637
					  * -1285823079)]),
				       i, 1567512968);
	method92(varDefinition.aClass142_3415, i_9_, -1715370924);
    }
    
    public void method95(VarDefinition varDefinition, int i) throws Exception_Sub3 {
	int i_10_ = varDefinition.method4132((((Class586) this).anIntArray7708
					 [(varDefinition.aClass142_3415.anInt1637
					   * -1285823079)]),
					i, 1742918739);
	method92(varDefinition.aClass142_3415, i_10_, -1167472104);
    }
    
    public long method105(Class142 class142) {
	throw new UnsupportedOperationException();
    }
    
    public void method7007() {
	for (int i = 0; i < Class691_Sub20.aClass95_Sub1_Sub2_10751
				.method62((short) 3553); i++) {
	    Class142_Sub1 class142_sub1
		= (Class142_Sub1) Class691_Sub20.aClass95_Sub1_Sub2_10751
				      .method63(i, -519918151);
	    if (null != class142_sub1) {
		((Class586) this).anIntArray7709[i] = 0;
		((Class586) this).anIntArray7708[i] = 0;
	    }
	}
	((Class586) this).aClass692_7710 = new Class692(128);
    }
    
    public void method7008() {
	for (int i = 0; i < Class691_Sub20.aClass95_Sub1_Sub2_10751
				.method62((short) 3553); i++) {
	    Class142_Sub1 class142_sub1
		= (Class142_Sub1) Class691_Sub20.aClass95_Sub1_Sub2_10751
				      .method63(i, -2123659319);
	    if (null != class142_sub1) {
		((Class586) this).anIntArray7709[i] = 0;
		((Class586) this).anIntArray7708[i] = 0;
	    }
	}
	((Class586) this).aClass692_7710 = new Class692(128);
    }
    
    public int method103(VarDefinition varDefinition) {
	return varDefinition.method4131((((Class586) this).anIntArray7708
				    [(-1285823079
				      * varDefinition.aClass142_3415.anInt1637)]),
				   -1822940850);
    }
    
    public void method107(Class142 class142, long l) {
	throw new UnsupportedOperationException();
    }
    
    public void method99(Class142 class142, int i) {
	((Class586) this).anIntArray7708[-1285823079 * class142.anInt1637] = i;
	Class528_Sub32 class528_sub32
	    = ((Class528_Sub32)
	       ((Class586) this).aClass692_7710
		   .method8137((long) (-1285823079 * class142.anInt1637)));
	if (null != class528_sub32)
	    class528_sub32.aLong10469 = (Class249.method3417(2018110158)
					 + 500L) * -684332442695901675L;
	else {
	    class528_sub32
		= new Class528_Sub32(Class249.method3417(1926981047) + 500L);
	    ((Class586) this).aClass692_7710.method8142
		(class528_sub32, (long) (class142.anInt1637 * -1285823079));
	}
    }
    
    static final void method7009(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = ((null
		!= Class108.myPlayer.model)
	       && (Class108.myPlayer.model
		   .aBool7967)) ? 1 : 0;
    }
    
    static final void method7010(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -577899301;
	int i_11_ = (((Class648) class648).anIntArray8394
		     [717927929 * ((Class648) class648).anInt8395]);
	int i_12_ = (((Class648) class648).anIntArray8394
		     [1 + 717927929 * ((Class648) class648).anInt8395]);
	int i_13_ = (((Class648) class648).anIntArray8394
		     [2 + 717927929 * ((Class648) class648).anInt8395]);
	Integer integer
	    = (Integer) client.aClass217_11028.method3071
			    (i_11_, -1936788146)
			    .method2907(i_12_, i_13_, -1954120912);
	if (integer == null)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= integer.intValue();
    }
    
    static final void method7011(Class648 class648, byte i) {
	if (0 == 1234694097 * client.anInt11158)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -1;
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= client.anInt11024 * -1924608781;
    }
    
    public static long method7012(int i, int i_14_) {
	return 86400000L * (long) (i + 11745);
    }
    
    static void method7013(Class173 class173, byte i) {
	if (Class239.method3309((byte) -18) && Class532.method6482(2035467355))
	    Class393.method4802(0, 0, -1117838587 * Class411.anInt4713, 350,
				-109622562);
	class173.method2204(0, 0, Class411.anInt4713 * -1117838587, 350);
	class173.method2216(0, 0, -1117838587 * Class411.anInt4713, 350,
			    -1026839985 * Class99.anInt1265 << 24 | 0x332277,
			    1);
	int i_15_ = 350 / (131093955 * Class210.anInt2242);
	if (Class99.anInt1268 * -1589365317 > 0) {
	    int i_16_ = 346 - 131093955 * Class210.anInt2242 - 4;
	    int i_17_ = (i_16_ * i_15_
			 / (i_15_ + Class99.anInt1268 * -1589365317 - 1));
	    int i_18_ = 4;
	    if (Class99.anInt1268 * -1589365317 > 1)
		i_18_ += ((-1589365317 * Class99.anInt1268 - 1
			   - 1727710133 * Class99.anInt1261)
			  * (i_16_ - i_17_)
			  / (-1589365317 * Class99.anInt1268 - 1));
	    class173.method2216(-1117838587 * Class411.anInt4713 - 16, i_18_,
				12, i_17_,
				(-1026839985 * Class99.anInt1265 << 24
				 | 0x332277),
				2);
	    for (int i_19_ = 1727710133 * Class99.anInt1261;
		 (i_19_ < i_15_ + Class99.anInt1261 * 1727710133
		  && i_19_ < Class99.anInt1268 * -1589365317);
		 i_19_++) {
		String[] strings
		    = Class520.method6348(Class99.aStringArray1259[i_19_],
					  '\010', (byte) -45);
		int i_20_ = ((Class411.anInt4713 * -1117838587 - 8 - 16)
			     / strings.length);
		for (int i_21_ = 0; i_21_ < strings.length; i_21_++) {
		    int i_22_ = 8 + i_20_ * i_21_;
		    class173.method2204(i_22_, 0, i_22_ + i_20_ - 8, 350);
		    Class191.aClass172_2171.method2120
			(Class96.method1268(strings[i_21_], 965724207), i_22_,
			 (350 - Class99.anInt1258 * -1653658597 - 2
			  - -46594681 * Class27.aClass1_253.anInt13
			  - ((i_19_ - 1727710133 * Class99.anInt1261)
			     * (131093955 * Class210.anInt2242))),
			 -1, -16777216, (byte) 106);
		}
	    }
	}
	Class378_Sub1_Sub1.aClass172_11264.method2119
	    ("857 1", -1117838587 * Class411.anInt4713 - 25, 330, -1,
	     -16777216, (byte) -94);
	class173.method2204(0, 0, Class411.anInt4713 * -1117838587, 350);
	class173.method2384(0, 350 - Class99.anInt1258 * -1653658597,
			    Class411.anInt4713 * -1117838587, -1, -1318242689);
	Class176.aClass172_2027.method2120
	    (new StringBuilder().append("--> ").append
		 (Class96.method1268(Class99.aString1264, -360387499))
		 .toString(),
	     10, 350 - Class392.aClass1_4120.anInt13 * -46594681 - 1, -1,
	     -16777216, (byte) 48);
	if (Class395.aBool4154) {
	    int i_23_ = -1;
	    if (client.anInt11127 % 30 > 15)
		i_23_ = 16777215;
	    class173.method2522
		((10
		  + (Class392.aClass1_4120.method490
		     (new StringBuilder().append("--> ").append
			  (Class96.method1268
			       (Class99.aString1264, 900418381)
			       .substring(0, Class99.anInt1269 * -1643546867))
			  .toString(),
		      941026227))),
		 350 - Class392.aClass1_4120.anInt13 * -46594681 - 11, 12,
		 i_23_, (byte) 0);
	}
	class173.method2203();
	Class207.method2928((byte) 3);
    }
    
    static final void method7014(Class648 class648, int i) {
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = Class691_Sub32.aClass216_10805.method3029(2094828887);
    }
}
