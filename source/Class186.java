/* Class186 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class186
{
    Class679 aClass679_2118 = new Class679();
    int anInt2119;
    Class692 aClass692_2120;
    int anInt2121;
    Interface23 anInterface23_2122;
    static Class446 aClass446_2123;
    
    public void method2725(long l) {
	Class528_Sub21_Sub15 class528_sub21_sub15
	    = ((Class528_Sub21_Sub15)
	       ((Class186) this).aClass692_2120.method8137(l));
	method2728(class528_sub21_sub15, -1862470757);
    }
    
    public void method2726(Interface23 interface23, int i) {
	((Class186) this).anInterface23_2122 = interface23;
    }
    
    public Class186(int i, int i_0_) {
	((Class186) this).anInt2121 = i * 764854151;
	((Class186) this).anInt2119 = 1892259237 * i;
	int i_1_;
	for (i_1_ = 1; i_1_ + i_1_ < i && i_1_ < i_0_; i_1_ += i_1_) {
	    /* empty */
	}
	((Class186) this).aClass692_2120 = new Class692(i_1_);
    }
    
    public Object method2727(long l) {
	Class528_Sub21_Sub15 class528_sub21_sub15
	    = ((Class528_Sub21_Sub15)
	       ((Class186) this).aClass692_2120.method8137(l));
	if (class528_sub21_sub15 == null)
	    return null;
	Object object = class528_sub21_sub15.method10570(591429874);
	if (object == null) {
	    class528_sub21_sub15.method6443(-161722202);
	    class528_sub21_sub15.method9429((byte) -75);
	    ((Class186) this).anInt2119
		+= 1914846419 * (((Class528_Sub21_Sub15) class528_sub21_sub15)
				 .anInt11632);
	    return null;
	}
	if (class528_sub21_sub15.method10566(-928446462)) {
	    Class528_Sub21_Sub15_Sub1 class528_sub21_sub15_sub1
		= new Class528_Sub21_Sub15_Sub1(object,
						(((Class528_Sub21_Sub15)
						  class528_sub21_sub15)
						 .anInt11632) * -1095586025);
	    ((Class186) this).aClass692_2120.method8142
		(class528_sub21_sub15_sub1,
		 class528_sub21_sub15.aLong7107 * -4849232331708333273L);
	    ((Class186) this).aClass679_2118
		.method7959(class528_sub21_sub15_sub1, -971994285);
	    class528_sub21_sub15_sub1.aLong10407 = 0L;
	    class528_sub21_sub15.method6443(-668430072);
	    class528_sub21_sub15.method9429((byte) -126);
	} else {
	    ((Class186) this).aClass679_2118.method7959(class528_sub21_sub15,
							-1788723633);
	    class528_sub21_sub15.aLong10407 = 0L;
	}
	return object;
    }
    
    void method2728(Class528_Sub21_Sub15 class528_sub21_sub15, int i) {
	if (class528_sub21_sub15 != null) {
	    class528_sub21_sub15.method6443(1277577220);
	    class528_sub21_sub15.method9429((byte) -40);
	    ((Class186) this).anInt2119
		+= (((Class528_Sub21_Sub15) class528_sub21_sub15).anInt11632
		    * 1914846419);
	}
    }
    
    public void method2729(Object object, long l) {
	method2730(object, l, 1, -1226267209);
    }
    
    public void method2730(Object object, long l, int i, int i_2_) {
	if (i > ((Class186) this).anInt2121 * 401528375)
	    throw new IllegalStateException();
	method2725(l);
	((Class186) this).anInt2119 -= i * 1892259237;
	while (2128824877 * ((Class186) this).anInt2119 < 0) {
	    Class528_Sub21_Sub15 class528_sub21_sub15
		= ((Class528_Sub21_Sub15)
		   ((Class186) this).aClass679_2118.method7962(-1055011377));
	    if (class528_sub21_sub15 == null)
		throw new RuntimeException("");
	    if (class528_sub21_sub15.method10566(839877343)) {
		/* empty */
	    }
	    method2728(class528_sub21_sub15, -1862470757);
	    if (((Class186) this).anInterface23_2122 != null)
		((Class186) this).anInterface23_2122.method128
		    (class528_sub21_sub15.method10570(591429874), (byte) -77);
	}
	Class528_Sub21_Sub15_Sub1 class528_sub21_sub15_sub1
	    = new Class528_Sub21_Sub15_Sub1(object, i);
	((Class186) this).aClass692_2120.method8142(class528_sub21_sub15_sub1,
						    l);
	((Class186) this).aClass679_2118.method7959(class528_sub21_sub15_sub1,
						    -883492144);
	class528_sub21_sub15_sub1.aLong10407 = 0L;
    }
    
    public Class186(int i) {
	this(i, i);
    }
    
    public void method2731(int i) {
	((Class186) this).aClass679_2118.method7961(-1635086102);
	((Class186) this).aClass692_2120.method8141(2100060390);
	((Class186) this).anInt2119
	    = ((Class186) this).anInt2121 * -1328737165;
    }
    
    public void method2732() {
	for (Class528_Sub21_Sub15 class528_sub21_sub15
		 = ((Class528_Sub21_Sub15)
		    ((Class186) this).aClass679_2118.method7960(-1550587110));
	     null != class528_sub21_sub15;
	     class528_sub21_sub15
		 = (Class528_Sub21_Sub15) ((Class186) this).aClass679_2118
					      .method7969(-1069439875)) {
	    if (class528_sub21_sub15.method10566(-1598768217)) {
		class528_sub21_sub15.method6443(1293741367);
		class528_sub21_sub15.method9429((byte) -34);
		((Class186) this).anInt2119
		    += 1914846419 * ((Class528_Sub21_Sub15)
				     class528_sub21_sub15).anInt11632;
	    }
	}
    }
    
    public int method2733() {
	return 401528375 * ((Class186) this).anInt2121;
    }
    
    public int method2734(int i) {
	int i_3_ = 0;
	for (Class528_Sub21_Sub15 class528_sub21_sub15
		 = ((Class528_Sub21_Sub15)
		    ((Class186) this).aClass679_2118.method7960(-1550587110));
	     class528_sub21_sub15 != null;
	     class528_sub21_sub15
		 = ((Class528_Sub21_Sub15)
		    ((Class186) this).aClass679_2118.method7969(-594796977))) {
	    if (!class528_sub21_sub15.method10566(-734026741))
		i_3_++;
	}
	return i_3_;
    }
    
    public void method2735(int i) {
	for (Class528_Sub21_Sub15 class528_sub21_sub15
		 = ((Class528_Sub21_Sub15)
		    ((Class186) this).aClass679_2118.method7960(-1550587110));
	     null != class528_sub21_sub15;
	     class528_sub21_sub15
		 = ((Class528_Sub21_Sub15)
		    ((Class186) this).aClass679_2118.method7969(1213909461))) {
	    if (class528_sub21_sub15.method10566(-1515959655)) {
		class528_sub21_sub15.method6443(91422757);
		class528_sub21_sub15.method9429((byte) -18);
		((Class186) this).anInt2119
		    += 1914846419 * ((Class528_Sub21_Sub15)
				     class528_sub21_sub15).anInt11632;
	    }
	}
    }
    
    public int method2736(int i) {
	return ((Class186) this).anInt2119 * 2128824877;
    }
    
    public void method2737() {
	((Class186) this).aClass679_2118.method7961(-1284351876);
	((Class186) this).aClass692_2120.method8141(2145662269);
	((Class186) this).anInt2119
	    = ((Class186) this).anInt2121 * -1328737165;
    }
    
    public int method2738() {
	int i = 0;
	for (Class528_Sub21_Sub15 class528_sub21_sub15
		 = ((Class528_Sub21_Sub15)
		    ((Class186) this).aClass679_2118.method7960(-1550587110));
	     class528_sub21_sub15 != null;
	     class528_sub21_sub15
		 = ((Class528_Sub21_Sub15)
		    ((Class186) this).aClass679_2118.method7969(-758607353))) {
	    if (!class528_sub21_sub15.method10566(-565556057))
		i++;
	}
	return i;
    }
    
    public void method2739(long l) {
	Class528_Sub21_Sub15 class528_sub21_sub15
	    = ((Class528_Sub21_Sub15)
	       ((Class186) this).aClass692_2120.method8137(l));
	method2728(class528_sub21_sub15, -1862470757);
    }
    
    public int method2740() {
	int i = 0;
	for (Class528_Sub21_Sub15 class528_sub21_sub15
		 = ((Class528_Sub21_Sub15)
		    ((Class186) this).aClass679_2118.method7960(-1550587110));
	     class528_sub21_sub15 != null;
	     class528_sub21_sub15
		 = ((Class528_Sub21_Sub15)
		    ((Class186) this).aClass679_2118.method7969(2115288850))) {
	    if (!class528_sub21_sub15.method10566(-174536505))
		i++;
	}
	return i;
    }
    
    public void method2741(int i) {
	for (Class528_Sub21_Sub15 class528_sub21_sub15
		 = ((Class528_Sub21_Sub15)
		    ((Class186) this).aClass679_2118.method7960(-1550587110));
	     class528_sub21_sub15 != null;
	     class528_sub21_sub15
		 = ((Class528_Sub21_Sub15)
		    ((Class186) this).aClass679_2118.method7969(671000355))) {
	    if (class528_sub21_sub15.method10566(-1106551467)) {
		if (class528_sub21_sub15.method10570(591429874) == null) {
		    class528_sub21_sub15.method6443(424140204);
		    class528_sub21_sub15.method9429((byte) -53);
		    ((Class186) this).anInt2119
			+= 1914846419 * ((Class528_Sub21_Sub15)
					 class528_sub21_sub15).anInt11632;
		}
	    } else if ((class528_sub21_sub15.aLong10407
			+= -7069004085892986779L) * -5214225787304728211L
		       > (long) i) {
		Class528_Sub21_Sub15_Sub2 class528_sub21_sub15_sub2
		    = (new Class528_Sub21_Sub15_Sub2
		       (class528_sub21_sub15.method10570(591429874),
			(((Class528_Sub21_Sub15) class528_sub21_sub15)
			 .anInt11632) * -1095586025));
		((Class186) this).aClass692_2120.method8142
		    (class528_sub21_sub15_sub2,
		     -4849232331708333273L * class528_sub21_sub15.aLong7107);
		Class509.method6236(class528_sub21_sub15_sub2,
				    class528_sub21_sub15, -682701017);
		class528_sub21_sub15.method6443(376185751);
		class528_sub21_sub15.method9429((byte) -93);
	    }
	}
    }
    
    public Object method2742(int i) {
	Class528_Sub21_Sub15 class528_sub21_sub15
	    = ((Class528_Sub21_Sub15)
	       ((Class186) this).aClass692_2120.method8146(-1942855841));
	while (class528_sub21_sub15 != null) {
	    Object object = class528_sub21_sub15.method10570(591429874);
	    if (null == object) {
		Class528_Sub21_Sub15 class528_sub21_sub15_4_
		    = class528_sub21_sub15;
		class528_sub21_sub15
		    = (Class528_Sub21_Sub15) ((Class186) this)
						 .aClass692_2120
						 .method8138(-1723250506);
		class528_sub21_sub15_4_.method6443(2144563427);
		class528_sub21_sub15_4_.method9429((byte) -95);
		((Class186) this).anInt2119
		    += (((Class528_Sub21_Sub15) class528_sub21_sub15_4_)
			.anInt11632) * 1914846419;
	    } else
		return object;
	}
	return null;
    }
    
    public int method2743() {
	return 401528375 * ((Class186) this).anInt2121;
    }
    
    public int method2744() {
	return 401528375 * ((Class186) this).anInt2121;
    }
    
    public int method2745() {
	return ((Class186) this).anInt2119 * 2128824877;
    }
    
    public int method2746() {
	return ((Class186) this).anInt2119 * 2128824877;
    }
    
    public void method2747(int i, int i_5_) {
	for (Class528_Sub21_Sub15 class528_sub21_sub15
		 = ((Class528_Sub21_Sub15)
		    ((Class186) this).aClass679_2118.method7960(-1550587110));
	     class528_sub21_sub15 != null;
	     class528_sub21_sub15
		 = ((Class528_Sub21_Sub15)
		    ((Class186) this).aClass679_2118.method7969(1451097867))) {
	    if (class528_sub21_sub15.method10566(560864657)) {
		if (class528_sub21_sub15.method10570(591429874) == null) {
		    class528_sub21_sub15.method6443(1886672647);
		    class528_sub21_sub15.method9429((byte) -5);
		    ((Class186) this).anInt2119
			+= 1914846419 * ((Class528_Sub21_Sub15)
					 class528_sub21_sub15).anInt11632;
		}
	    } else if ((class528_sub21_sub15.aLong10407
			+= -7069004085892986779L) * -5214225787304728211L
		       > (long) i) {
		Class528_Sub21_Sub15_Sub2 class528_sub21_sub15_sub2
		    = (new Class528_Sub21_Sub15_Sub2
		       (class528_sub21_sub15.method10570(591429874),
			(((Class528_Sub21_Sub15) class528_sub21_sub15)
			 .anInt11632) * -1095586025));
		((Class186) this).aClass692_2120.method8142
		    (class528_sub21_sub15_sub2,
		     -4849232331708333273L * class528_sub21_sub15.aLong7107);
		Class509.method6236(class528_sub21_sub15_sub2,
				    class528_sub21_sub15, -1772113551);
		class528_sub21_sub15.method6443(1688614860);
		class528_sub21_sub15.method9429((byte) -34);
	    }
	}
    }
    
    public int method2748() {
	int i = 0;
	for (Class528_Sub21_Sub15 class528_sub21_sub15
		 = ((Class528_Sub21_Sub15)
		    ((Class186) this).aClass679_2118.method7960(-1550587110));
	     class528_sub21_sub15 != null;
	     class528_sub21_sub15
		 = ((Class528_Sub21_Sub15)
		    ((Class186) this).aClass679_2118.method7969(1292932234))) {
	    if (!class528_sub21_sub15.method10566(-1378808324))
		i++;
	}
	return i;
    }
    
    public Object method2749(int i) {
	Class528_Sub21_Sub15 class528_sub21_sub15
	    = ((Class528_Sub21_Sub15)
	       ((Class186) this).aClass692_2120.method8138(-165073627));
	while (class528_sub21_sub15 != null) {
	    Object object = class528_sub21_sub15.method10570(591429874);
	    if (null == object) {
		Class528_Sub21_Sub15 class528_sub21_sub15_6_
		    = class528_sub21_sub15;
		class528_sub21_sub15
		    = (Class528_Sub21_Sub15) ((Class186) this)
						 .aClass692_2120
						 .method8138(1811228869);
		class528_sub21_sub15_6_.method6443(1520149800);
		class528_sub21_sub15_6_.method9429((byte) -25);
		((Class186) this).anInt2119
		    += 1914846419 * ((Class528_Sub21_Sub15)
				     class528_sub21_sub15_6_).anInt11632;
	    } else
		return object;
	}
	return null;
    }
    
    public void method2750() {
	for (Class528_Sub21_Sub15 class528_sub21_sub15
		 = ((Class528_Sub21_Sub15)
		    ((Class186) this).aClass679_2118.method7960(-1550587110));
	     null != class528_sub21_sub15;
	     class528_sub21_sub15
		 = ((Class528_Sub21_Sub15)
		    ((Class186) this).aClass679_2118.method7969(1823864505))) {
	    if (class528_sub21_sub15.method10566(-1316854157)) {
		class528_sub21_sub15.method6443(1441324723);
		class528_sub21_sub15.method9429((byte) -69);
		((Class186) this).anInt2119
		    += 1914846419 * ((Class528_Sub21_Sub15)
				     class528_sub21_sub15).anInt11632;
	    }
	}
    }
    
    public int method2751(int i) {
	return 401528375 * ((Class186) this).anInt2121;
    }
    
    public static int method2752(int i) {
	return Class293.aClass292_3215.method3904(1135772804);
    }
    
    public static void method2753(byte i) {
	Class626.aClass610_Sub2_8133.method7242(-1687489374);
	Class626.aClass610_Sub1_8134.method7242(-1316947858);
	Class626.aLong8130 = 4060486017398311383L;
	Class626.aBool8132 = true;
    }
    
    public static void method2754(int i, boolean bool, int i_7_) {
	HandshakeOpcode.method4869(i,
			    Class39.aClass39_439.method807((Class378_Sub2
							    .aClass668_10123),
							   (byte) 102),
			    bool, 217096928);
    }
}
