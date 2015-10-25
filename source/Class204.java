/* Class204 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class204
{
    List aList2221;
    static final int anInt2222 = 8;
    static Integer anInteger2223 = Integer.valueOf(-1);
    public int anInt2224;
    List aList2225;
    List aList2226;
    static final int anInt2227 = 10;
    List aList2228;
    
    public int method2867(byte i) {
	return ((Class204) this).aList2228.size();
    }
    
    public Class204(int i) {
	anInt2224 = i * 1426117121;
	((Class204) this).aList2228 = new ArrayList();
	((Class204) this).aList2225 = new ArrayList();
	((Class204) this).aList2226 = new ArrayList();
	((Class204) this).aList2221 = new ArrayList();
    }
    
    public int method2868(int i, byte i_0_) {
	return ((Class204) this).aList2225.indexOf(Integer.valueOf(i));
    }
    
    public int method2869(int i, int i_1_) {
	return ((Integer) ((Class204) this).aList2225.get(i)).intValue();
    }
    
    public int method2870(int i, byte i_2_) {
	return ((Class204) this).aList2228.indexOf(Integer.valueOf(i));
    }
    
    public int method2871(int i, int i_3_) {
	return method2874(i, -1, -356678669);
    }
    
    public void method2872(int i, boolean bool, int i_4_) {
	((Class204) this).aList2226
	    .set(i, bool ? Integer.valueOf(i) : anInteger2223);
    }
    
    public boolean method2873(int i, byte i_5_) {
	return !((Integer) ((Class204) this).aList2226.get(i))
		    .equals(anInteger2223);
    }
    
    public int method2874(int i, int i_6_, int i_7_) {
	if (((Class204) this).aList2228.size() == 8)
	    throw new RuntimeException("");
	if (method2870(i, (byte) 100) != -1)
	    throw new RuntimeException("");
	if (-1 == i_6_)
	    i_6_ = ((Class204) this).aList2228.size();
	((Class204) this).aList2228.add(i_6_, Integer.valueOf(i));
	Iterator iterator = ((Class204) this).aList2221.iterator();
	while (iterator.hasNext()) {
	    List list = (List) iterator.next();
	    list.add(i_6_, null);
	}
	return i_6_;
    }
    
    public int method2875(int i) {
	return method2874(i, -1, -356678669);
    }
    
    public void method2876(int i, int i_8_, int i_9_) {
	method2877(i, i_8_, (byte) 72);
	for (int i_10_ = 0; i_10_ < ((Class204) this).aList2226.size();
	     i_10_++) {
	    Integer integer = (Integer) ((Class204) this).aList2226.get(i_10_);
	    if (!integer.equals(anInteger2223)) {
		Integer integer_11_ = Integer.valueOf(i_10_);
		if (!integer.equals(integer_11_))
		    ((Class204) this).aList2226.set(i_10_, integer_11_);
	    }
	}
    }
    
    void method2877(int i, int i_12_, byte i_13_) {
	((Class204) this).aList2225.add(i_12_,
					((Class204) this).aList2225.remove(i));
	((Class204) this).aList2226.add(i_12_,
					((Class204) this).aList2226.remove(i));
	((Class204) this).aList2221.add(i_12_,
					((Class204) this).aList2221.remove(i));
    }
    
    public int method2878(int i, int i_14_, int i_15_) {
	if (((Class204) this).aList2225.size() == 10)
	    throw new RuntimeException("");
	if (method2868(i, (byte) -74) != -1)
	    throw new RuntimeException("");
	if (i_14_ == -1)
	    i_14_ = ((Class204) this).aList2225.size();
	method2879(i, i_14_, 58318991);
	for (int i_16_ = i_14_ + 1; i_16_ < ((Class204) this).aList2225.size();
	     i_16_++) {
	    Integer integer = (Integer) ((Class204) this).aList2226.get(i_16_);
	    if (!integer.equals(anInteger2223) && integer.intValue() < i_16_)
		method2877(i_16_, i_16_ - 1, (byte) 77);
	}
	return method2868(i, (byte) -7);
    }
    
    void method2879(int i, int i_17_, int i_18_) {
	((Class204) this).aList2225.add(i_17_, Integer.valueOf(i));
	((Class204) this).aList2226.add(i_17_, anInteger2223);
	ArrayList arraylist = new ArrayList();
	for (int i_19_ = 0; i_19_ < ((Class204) this).aList2228.size();
	     i_19_++)
	    arraylist.add(null);
	((Class204) this).aList2221.add(i_17_, arraylist);
    }
    
    public int method2880(int i) {
	return ((Class204) this).aList2225.size();
    }
    
    void method2881(int i, int i_20_) {
	((Class204) this).aList2225.remove(i);
	((Class204) this).aList2226.remove(i);
	((Class204) this).aList2221.remove(i);
    }
    
    public void method2882(int i, int i_21_, int i_22_) {
	((Class204) this).aList2228.add(i_21_,
					((Class204) this).aList2228.remove(i));
	Iterator iterator = ((Class204) this).aList2221.iterator();
	while (iterator.hasNext()) {
	    List list = (List) iterator.next();
	    list.add(i_21_, list.remove(i));
	}
    }
    
    public void method2883(int i, int i_23_) {
	((Class204) this).aList2228.remove(i);
	Iterator iterator = ((Class204) this).aList2221.iterator();
	while (iterator.hasNext()) {
	    List list = (List) iterator.next();
	    list.remove(i);
	}
    }
    
    public void method2884(int i, int i_24_, Object object, int i_25_) {
	((List) ((Class204) this).aList2221.get(i)).set(i_24_, object);
    }
    
    public void method2885(int i) {
	((Class204) this).aList2228.remove(i);
	Iterator iterator = ((Class204) this).aList2221.iterator();
	while (iterator.hasNext()) {
	    List list = (List) iterator.next();
	    list.remove(i);
	}
    }
    
    public int method2886() {
	return ((Class204) this).aList2228.size();
    }
    
    public int method2887() {
	return ((Class204) this).aList2225.size();
    }
    
    public int method2888() {
	return ((Class204) this).aList2225.size();
    }
    
    public int method2889(int i) {
	return ((Class204) this).aList2225.indexOf(Integer.valueOf(i));
    }
    
    public int method2890(int i) {
	return ((Class204) this).aList2228.indexOf(Integer.valueOf(i));
    }
    
    public int method2891(int i) {
	return ((Integer) ((Class204) this).aList2228.get(i)).intValue();
    }
    
    public int method2892(int i, short i_26_) {
	return ((Integer) ((Class204) this).aList2228.get(i)).intValue();
    }
    
    void method2893(int i, int i_27_) {
	((Class204) this).aList2225.add(i_27_,
					((Class204) this).aList2225.remove(i));
	((Class204) this).aList2226.add(i_27_,
					((Class204) this).aList2226.remove(i));
	((Class204) this).aList2221.add(i_27_,
					((Class204) this).aList2221.remove(i));
    }
    
    public void method2894(int i, boolean bool) {
	((Class204) this).aList2226
	    .set(i, bool ? Integer.valueOf(i) : anInteger2223);
    }
    
    public boolean method2895(int i) {
	return !((Integer) ((Class204) this).aList2226.get(i))
		    .equals(anInteger2223);
    }
    
    public int method2896(int i) {
	return method2874(i, -1, -356678669);
    }
    
    public void method2897(int i) {
	((Class204) this).aList2228.remove(i);
	Iterator iterator = ((Class204) this).aList2221.iterator();
	while (iterator.hasNext()) {
	    List list = (List) iterator.next();
	    list.remove(i);
	}
    }
    
    public void method2898(int i) {
	((Class204) this).aList2228.remove(i);
	Iterator iterator = ((Class204) this).aList2221.iterator();
	while (iterator.hasNext()) {
	    List list = (List) iterator.next();
	    list.remove(i);
	}
    }
    
    public int method2899(int i, int i_28_) {
	return method2878(i, -1, 134246145);
    }
    
    public int method2900(int i) {
	return method2878(i, -1, -85084721);
    }
    
    public int method2901(int i) {
	return ((Integer) ((Class204) this).aList2225.get(i)).intValue();
    }
    
    public int method2902() {
	return ((Class204) this).aList2228.size();
    }
    
    public void method2903(int i) {
	method2881(i, -849424520);
	int i_29_ = i;
	for (int i_30_ = i; i_30_ < ((Class204) this).aList2225.size();
	     i_30_++) {
	    if (!method2873(i_30_, (byte) 65)) {
		if (i_29_ != i_30_)
		    method2877(i_30_, i_29_, (byte) -23);
		i_29_ = 1 + i_30_;
	    }
	}
    }
    
    void method2904(int i) {
	((Class204) this).aList2225.remove(i);
	((Class204) this).aList2226.remove(i);
	((Class204) this).aList2221.remove(i);
    }
    
    void method2905(int i) {
	((Class204) this).aList2225.remove(i);
	((Class204) this).aList2226.remove(i);
	((Class204) this).aList2221.remove(i);
    }
    
    public void method2906(int i, int i_31_) {
	method2881(i, 533673463);
	int i_32_ = i;
	for (int i_33_ = i; i_33_ < ((Class204) this).aList2225.size();
	     i_33_++) {
	    if (!method2873(i_33_, (byte) 79)) {
		if (i_32_ != i_33_)
		    method2877(i_33_, i_32_, (byte) 44);
		i_32_ = 1 + i_33_;
	    }
	}
    }
    
    public Object method2907(int i, int i_34_, int i_35_) {
	return ((List) ((Class204) this).aList2221.get(i)).get(i_34_);
    }
    
    static final void method2908(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_36_ = (((Class648) class648).anIntArray8394
		     [717927929 * ((Class648) class648).anInt8395]);
	int i_37_ = (((Class648) class648).anIntArray8394
		     [1 + ((Class648) class648).anInt8395 * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (Class33.aClass46_314.method861(i_36_, (byte) -33)
	       .anIntArray11532[i_37_]);
    }
    
    static void method2909(Class173 class173, int i) {
	int i_38_ = Class32.anInt309 * -2002292621;
	int i_39_ = 684569813 * Class25.anInt239;
	int i_40_ = 385971415 * Class369.anInt3868;
	int i_41_ = Class528_Sub24.anInt10419 * -1024694809 - 3;
	int i_42_ = 20;
	if (null == Class196.aClass172_2199 || null == Class5.aClass1_121) {
	    Class196.aClass172_2199
		= ((Class172)
		   Class625.aClass414_8129.method4936((client
						       .anInterface50_10917),
						      (Class690_Sub2.anInt10781
						       * 1568771821),
						      true, true, (byte) -16));
	    Class5.aClass1_121
		= (Class625.aClass414_8129.method4937
		   (client.anInterface50_10917,
		    1568771821 * Class690_Sub2.anInt10781, 202657144));
	    if (null != Class196.aClass172_2199
		&& Class5.aClass1_121 != null) {
		Class666.method7903(1359335341);
		int i_43_ = i_38_ + i_40_ / 2;
		if (i_40_ + i_43_ > -1117838587 * Class411.anInt4713)
		    i_43_ = -1117838587 * Class411.anInt4713 - i_40_;
		if (i_43_ < 0)
		    i_43_ = 0;
		Class472.method5822(i_43_, 684569813 * Class25.anInt239,
				    112484558);
		return;
	    }
	}
	Class172 class172;
	if (null == Class196.aClass172_2199 || null == Class5.aClass1_121)
	    class172 = Class176.aClass172_2027;
	else
	    class172 = Class196.aClass172_2199;
	Class1 class1 = Class106.method1359(-220968233);
	Class598.method7132(class173, Class32.anInt309 * -2002292621,
			    684569813 * Class25.anInt239,
			    385971415 * Class369.anInt3868,
			    -1024694809 * Class528_Sub24.anInt10419, i_42_,
			    class172, class1,
			    Class39.aClass39_472.method807((Class378_Sub2
							    .aClass668_10123),
							   (byte) 102),
			    -1961094835);
	int i_44_ = (255 - Class187.anInt2127 * 449154883
		     - -1078323881 * Class28.anInt292);
	if (i_44_ < 0)
	    i_44_ = 0;
	int i_45_ = Class95_Sub1_Sub2.aClass537_11200.method6507(242198676);
	int i_46_ = Class95_Sub1_Sub2.aClass537_11200.method6504((byte) 109);
	if (!Class28.aBool264) {
	    int i_47_ = 0;
	    for (Class528_Sub21_Sub11 class528_sub21_sub11
		     = ((Class528_Sub21_Sub11)
			Class28.aClass688_274.method8034(711321418));
		 null != class528_sub21_sub11;
		 class528_sub21_sub11
		     = ((Class528_Sub21_Sub11)
			Class28.aClass688_274.method8037(1902557113))) {
		int i_48_ = (-55898191 * class1.anInt12 + (i_39_ + i_42_) + 1
			     + ((-1024340783 * Class28.anInt303 - 1 - i_47_)
				* (Class28.anInt260 * -812992221)));
		if (i_45_ > Class32.anInt309 * -2002292621
		    && i_45_ < (Class369.anInt3868 * 385971415
				+ -2002292621 * Class32.anInt309)
		    && i_46_ > i_48_ - -55898191 * class1.anInt12 - 1
		    && i_46_ < i_48_ + -46594681 * class1.anInt13
		    && (((Class528_Sub21_Sub11) class528_sub21_sub11)
			.aBool11591))
		    class173.method2216(Class32.anInt309 * -2002292621,
					i_48_ - class1.anInt12 * -55898191,
					385971415 * Class369.anInt3868,
					-812992221 * Class28.anInt260,
					(i_44_ << 24
					 | -1438502679 * Class380.anInt3969),
					1);
		i_47_++;
	    }
	} else {
	    int i_49_ = 0;
	    for (Class528_Sub21_Sub5 class528_sub21_sub5
		     = ((Class528_Sub21_Sub5)
			Class28.aClass679_276.method7960(-1550587110));
		 class528_sub21_sub5 != null;
		 class528_sub21_sub5
		     = ((Class528_Sub21_Sub5)
			Class28.aClass679_276.method7969(860339876))) {
		int i_50_
		    = (i_49_ * (-812992221 * Class28.anInt260)
		       + (class1.anInt12 * -55898191 + (i_42_ + i_39_) + 1));
		if (i_45_ > Class32.anInt309 * -2002292621
		    && i_45_ < (Class369.anInt3868 * 385971415
				+ -2002292621 * Class32.anInt309)
		    && i_46_ > i_50_ - class1.anInt12 * -55898191 - 1
		    && i_46_ < class1.anInt13 * -46594681 + i_50_
		    && (942428025 * ((Class528_Sub21_Sub5)
				     class528_sub21_sub5).anInt11534 > 1
			|| ((Class528_Sub21_Sub11) (Class528_Sub21_Sub11)
			    (((Class528_Sub21_Sub5) class528_sub21_sub5)
			     .aClass679_11535.aClass528_Sub21_8561
			     .aClass528_Sub21_10408)).aBool11591))
		    class173.method2216(Class32.anInt309 * -2002292621,
					i_50_ - -55898191 * class1.anInt12,
					385971415 * Class369.anInt3868,
					Class28.anInt260 * -812992221,
					(i_44_ << 24
					 | -1438502679 * Class380.anInt3969),
					1);
		i_49_++;
	    }
	    if (Class28.aClass528_Sub21_Sub5_265 != null) {
		Class598.method7132(class173, Class74.anInt785 * 898461861,
				    Class381.anInt3974 * 1577622393,
				    (WeakReference_Sub1.anInt11754
				     * -2109025023),
				    1134420047 * Class693.anInt8697, i_42_,
				    class172, class1,
				    (((Class528_Sub21_Sub5)
				      Class28.aClass528_Sub21_Sub5_265)
				     .aString11536),
				    1012404151);
		i_49_ = 0;
		for (Class528_Sub21_Sub11 class528_sub21_sub11
			 = ((Class528_Sub21_Sub11)
			    ((Class528_Sub21_Sub5)
			     Class28.aClass528_Sub21_Sub5_265)
				.aClass679_11535.method7960(-1550587110));
		     null != class528_sub21_sub11;
		     class528_sub21_sub11
			 = ((Class528_Sub21_Sub11)
			    ((Class528_Sub21_Sub5)
			     Class28.aClass528_Sub21_Sub5_265)
				.aClass679_11535.method7969(2103785565))) {
		    int i_51_ = (Class28.anInt260 * -812992221 * i_49_
				 + (i_42_ + Class381.anInt3974 * 1577622393
				    + -55898191 * class1.anInt12 + 1));
		    if (i_45_ > 898461861 * Class74.anInt785
			&& (i_45_
			    < (898461861 * Class74.anInt785
			       + -2109025023 * WeakReference_Sub1.anInt11754))
			&& i_46_ > i_51_ - -55898191 * class1.anInt12 - 1
			&& i_46_ < -46594681 * class1.anInt13 + i_51_
			&& (((Class528_Sub21_Sub11) class528_sub21_sub11)
			    .aBool11591))
			class173.method2216(898461861 * Class74.anInt785,
					    i_51_ - class1.anInt12 * -55898191,
					    (-2109025023
					     * WeakReference_Sub1.anInt11754),
					    Class28.anInt260 * -812992221,
					    i_44_ << 24 | (Class380.anInt3969
							   * -1438502679),
					    1);
		    i_49_++;
		}
		Class701.method8220(class173, Class74.anInt785 * 898461861,
				    1577622393 * Class381.anInt3974,
				    (-2109025023
				     * WeakReference_Sub1.anInt11754),
				    Class693.anInt8697 * 1134420047, i_42_,
				    (byte) -48);
	    }
	}
	Class701.method8220(class173, -2002292621 * Class32.anInt309,
			    Class25.anInt239 * 684569813,
			    385971415 * Class369.anInt3868,
			    -1024694809 * Class528_Sub24.anInt10419, i_42_,
			    (byte) -77);
	if (!Class28.aBool264) {
	    int i_52_ = 0;
	    for (Class528_Sub21_Sub11 class528_sub21_sub11
		     = ((Class528_Sub21_Sub11)
			Class28.aClass688_274.method8034(1392355067));
		 null != class528_sub21_sub11;
		 class528_sub21_sub11
		     = ((Class528_Sub21_Sub11)
			Class28.aClass688_274.method8037(881669001))) {
		int i_53_
		    = (((-1024340783 * Class28.anInt303 - 1 - i_52_)
			* (Class28.anInt260 * -812992221))
		       + (class1.anInt12 * -55898191 + (i_39_ + i_42_) + 1));
		Class441.method5308(i_45_, i_46_, i_38_, i_39_, i_40_, i_41_,
				    i_53_, class528_sub21_sub11, class172,
				    class1,
				    Class212.anInt2249 * 284609883 | ~0xffffff,
				    VarDomainType.anInt4917 * 445359131 | ~0xffffff,
				    -1886025043);
		i_52_++;
	    }
	} else {
	    int i_54_ = 0;
	    for (Class528_Sub21_Sub5 class528_sub21_sub5
		     = ((Class528_Sub21_Sub5)
			Class28.aClass679_276.method7960(-1550587110));
		 null != class528_sub21_sub5;
		 class528_sub21_sub5
		     = ((Class528_Sub21_Sub5)
			Class28.aClass679_276.method7969(-1804819455))) {
		int i_55_ = (i_42_ + 684569813 * Class25.anInt239
			     + -55898191 * class1.anInt12 + 1
			     + Class28.anInt260 * -812992221 * i_54_);
		if ((((Class528_Sub21_Sub5) class528_sub21_sub5).anInt11534
		     * 942428025)
		    == 1)
		    Class441.method5308
			(i_45_, i_46_, Class32.anInt309 * -2002292621,
			 Class25.anInt239 * 684569813,
			 385971415 * Class369.anInt3868,
			 -1024694809 * Class528_Sub24.anInt10419, i_55_,
			 ((Class528_Sub21_Sub11)
			  (((Class528_Sub21_Sub5) class528_sub21_sub5)
			   .aClass679_11535.aClass528_Sub21_8561
			   .aClass528_Sub21_10408)),
			 class172, class1,
			 Class212.anInt2249 * 284609883 | ~0xffffff,
			 445359131 * VarDomainType.anInt4917 | ~0xffffff,
			 -1503561071);
		else
		    Class669.method7937
			(i_45_, i_46_, Class32.anInt309 * -2002292621,
			 Class25.anInt239 * 684569813,
			 Class369.anInt3868 * 385971415,
			 -1024694809 * Class528_Sub24.anInt10419, i_55_,
			 class528_sub21_sub5, class172, class1,
			 284609883 * Class212.anInt2249 | ~0xffffff,
			 VarDomainType.anInt4917 * 445359131 | ~0xffffff,
			 1861200119);
		i_54_++;
	    }
	    if (Class28.aClass528_Sub21_Sub5_265 != null) {
		i_54_ = 0;
		for (Class528_Sub21_Sub11 class528_sub21_sub11
			 = ((Class528_Sub21_Sub11)
			    ((Class528_Sub21_Sub5)
			     Class28.aClass528_Sub21_Sub5_265)
				.aClass679_11535.method7960(-1550587110));
		     class528_sub21_sub11 != null;
		     class528_sub21_sub11
			 = ((Class528_Sub21_Sub11)
			    ((Class528_Sub21_Sub5)
			     Class28.aClass528_Sub21_Sub5_265)
				.aClass679_11535.method7969(1988298180))) {
		    int i_56_ = (i_54_ * (Class28.anInt260 * -812992221)
				 + (class1.anInt12 * -55898191
				    + (1577622393 * Class381.anInt3974 + i_42_)
				    + 1));
		    Class441.method5308
			(i_45_, i_46_, Class74.anInt785 * 898461861,
			 Class381.anInt3974 * 1577622393,
			 -2109025023 * WeakReference_Sub1.anInt11754,
			 Class693.anInt8697 * 1134420047, i_56_,
			 class528_sub21_sub11, class172, class1,
			 284609883 * Class212.anInt2249 | ~0xffffff,
			 VarDomainType.anInt4917 * 445359131 | ~0xffffff,
			 -1470935712);
		    i_54_++;
		}
	    }
	}
    }
    
    public static void method2910(int i, int i_57_, int i_58_, String string,
				  int i_59_) {
	Class229 class229 = Class230.method3236(i_57_, i_58_, -101154513);
	if (null != class229) {
	    if (null != class229.anObjectArray2557) {
		Class528_Sub30 class528_sub30 = new Class528_Sub30();
		class528_sub30.aClass229_10461 = class229;
		class528_sub30.anInt10457 = i * 1347723605;
		class528_sub30.aString10466 = string;
		class528_sub30.anObjectArray10460 = class229.anObjectArray2557;
		Class555.method6741(class528_sub30, (short) -7898);
	    }
	    if (client.method10201(class229).method9473(i - 1, 271456581)) {
		Class109 class109 = Class591.method7078((byte) 89);
		if (175711435 * client.anInt10876 == 12
		    || 9 == client.anInt10876 * 175711435
		    || 14 == 175711435 * client.anInt10876) {
		    if (class229.aString2427 != null
			&& class229.aClass227_2457 != null) {
			Class528_Sub34 class528_sub34
			    = Class656.method7845(OutgoingOpcode.aClass403_4461,
						  class109.aClass10_1379,
						  -2088697160);
			class528_sub34.aClass528_Sub42_Sub2_10481.writeByte
			    (7 + Class14.method627(class229.aString2427,
						   -1190312702) + 1,
			     (byte) -20);
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .method9717(i_58_, (byte) -14);
			class528_sub34.aClass528_Sub42_Sub2_10481.method9652
			    (class229.aClass227_2457.method68(), (byte) -98);
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .method9671(i_57_, 668499139);
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .writeByteC(i, 2137551810);
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .writeString(class229.aString2427, -1936289654);
			class109.method1380(class528_sub34, 1610906572);
		    } else
			Class610_Sub1.method9732(class109, class229, i, i_57_,
						 i_58_, 591382782);
		}
	    }
	}
    }
    
    static final void method2911(int i, int[] is, int i_60_) {
	if (Class256.method3468(i, is, (byte) 0)) {
	    Class229[] class229s
		= Class380.aClass226Array3970[i].aClass229Array2336;
	    for (int i_61_ = 0; i_61_ < class229s.length; i_61_++) {
		Class229 class229 = class229s[i_61_];
		if (class229 != null && class229.aClass690_2541 != null)
		    class229.aClass690_2541.method8084(-408744746);
	    }
	}
    }
    
    static final void method2912(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 0;
    }
}
