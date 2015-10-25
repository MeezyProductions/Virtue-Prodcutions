/* Class505 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class505
{
    Class5_Sub15 aClass5_Sub15_6874;
    byte aByte6875;
    Class645_Sub1 aClass645_Sub1_6876;
    int anInt6877;
    int anInt6878;
    int anInt6879;
    boolean[] aBoolArray6880;
    Class157 aClass157_6881;
    Class690 aClass690_6882;
    Class690 aClass690_6883;
    Class528_Sub21_Sub12 aClass528_Sub21_Sub12_6884;
    boolean aBool6885;
    int anInt6886;
    int anInt6887;
    boolean aBool6888;
    Class591 aClass591_6889;
    boolean aBool6890;
    int anInt6891;
    Class612 aClass612_6892;
    boolean aBool6893 = false;
    
    boolean method6123() {
	return ((Class505) this).aBool6888;
    }
    
    int method6124(int i) {
	return 2024822347 * ((Class505) this).anInt6886;
    }
    
    public void method6125(int i, int i_0_, int i_1_) {
	((Class505) this).aClass690_6883 = null;
	if (i_0_ > 0) {
	    ((Class505) this).aClass690_6883
		= new Class690_Sub1(((Class505) this).aClass645_Sub1_6876,
				    false);
	    ((Class505) this).aClass690_6883.method8120(i, i_0_, 1, false,
							953042965);
	} else {
	    ((Class505) this).aBool6885 = true;
	    method6126(false, i, 1, 0, -501127125);
	}
    }
    
    void method6126(boolean bool, int i, int i_2_, int i_3_, int i_4_) {
	int i_5_ = i;
	boolean bool_6_ = false;
	if (-1 == i_5_) {
	    Class596 class596
		= ((Class596)
		   (((Class505) this).aClass5_Sub15_6874.method63
		    (((Class505) this).anInt6891 * -1276843859, 857491608)));
	    Class596 class596_7_ = class596;
	    if (null != class596.anIntArray7767)
		class596 = (class596.method7099
			    (Class570.playerVarsProvider,
			     (0 == client.anInt10943 * 345087519
			      ? (IMultiVarValueReader) Class185.anInterface18_2117
			      : Class570.playerVarsProvider),
			     1583227864));
	    if (class596 == null)
		return;
	    if (class596 == class596_7_)
		class596_7_ = null;
	    if (class596.method7101(2105263023)) {
		if (!class596.aBool7838
		    || Class514.aClass528_Sub38_6967.aClass691_Sub25_10592
			   .method10028((byte) -19) == 1) {
		    if (bool
			&& ((Class505) this).aClass690_6882
			       .method8067((byte) 81)
			&& class596.method7107(((Class505) this)
						   .aClass690_6882
						   .method8068(-772845955),
					       2101987375))
			return;
		    if (((Class505) this).anInt6877 * -1520825187
			!= -1439030235 * class596.anInt7765)
			bool_6_ = class596.aBool7830;
		    i_5_ = class596.method7103((byte) -63);
		    if (class596.method7102(88073180))
			i_2_ = 0;
		    else
			i_2_ = 1;
		}
	    } else if (null != class596_7_ && class596_7_.method7101(778158513)
		       && (!class596_7_.aBool7838
			   || Class514.aClass528_Sub38_6967
				  .aClass691_Sub25_10592
				  .method10028((byte) -45) == 1)) {
		if (bool
		    && ((Class505) this).aClass690_6882.method8067((byte) 68)
		    && class596_7_.method7107(((Class505) this)
						  .aClass690_6882
						  .method8068(-772845955),
					      2109270898))
		    return;
		if (-1520825187 * ((Class505) this).anInt6877
		    != -1439030235 * class596.anInt7765)
		    bool_6_ = class596_7_.aBool7830;
		i_5_ = class596_7_.method7103((byte) 96);
		if (class596_7_.method7102(1519977879))
		    i_2_ = 0;
		else
		    i_2_ = 1;
	    }
	}
	if (i_5_ == -1)
	    ((Class505) this).aClass690_6882.method8071(-1, false, 1291764546);
	else {
	    ((Class505) this).aClass690_6882.method8120(i_5_, i_3_, i_2_,
							bool_6_, -317331034);
	    ((Class505) this).anInt6887 = -1112716475 * client.anInt11127;
	    ((Class505) this).aBool6890 = false;
	    ((Class505) this).aClass157_6881 = null;
	}
    }
    
    final Class157 method6127(Class173 class173, int i, boolean bool,
			      boolean bool_8_, int i_9_) {
	Class596 class596
	    = ((Class596)
	       (((Class505) this).aClass5_Sub15_6874.method63
		(-1276843859 * ((Class505) this).anInt6891, -102725121)));
	if (class596.anIntArray7767 != null)
	    class596
		= class596.method7099(Class570.playerVarsProvider,
				      (0 == client.anInt10943 * 345087519
				       ? (IMultiVarValueReader) (Class185
							.anInterface18_2117)
				       : Class570.playerVarsProvider),
				      1906212893);
	if (class596 == null) {
	    method6130(class173, -1667011147);
	    ((Class505) this).anInt6877 = 1577789003;
	    return null;
	}
	if (!((Class505) this).aBool6885
	    && (-1439030235 * class596.anInt7765
		!= -1520825187 * ((Class505) this).anInt6877)) {
	    method6126(true, -1, 0, 0, 1167099118);
	    ((Class505) this).aBool6890 = false;
	    ((Class505) this).aClass157_6881 = null;
	}
	method6131(((Class505) this).aClass645_Sub1_6876, -1543764801);
	if (bool_8_)
	    bool_8_ = bool_8_ & (((Class505) this).aBool6888
				 & !((Class505) this).aBool6890
				 & Class514.aClass528_Sub38_6967
				       .aClass691_Sub8_10565
				       .method9883(1941541132) != 0);
	if (bool && !bool_8_) {
	    ((Class505) this).anInt6877 = 1543695145 * class596.anInt7765;
	    return null;
	}
	Class422 class422 = (((Class505) this).aClass645_Sub1_6876.method7693()
			     .aClass422_4868);
	Class538 class538 = client.aClass495_10935.method5973((byte) 25);
	if (bool_8_) {
	    class538.method6568(((Class505) this).aClass528_Sub21_Sub12_6884,
				((Class505) this).aByte6875,
				(int) class422.aFloat4780,
				(int) class422.aFloat4777,
				((Class505) this).aBoolArray6880, 2145506901);
	    ((Class505) this).aBool6890 = false;
	}
	Class137 class137
	    = class538.aClass137Array7161[((Class505) this).aByte6875];
	Class137 class137_10_;
	if (((Class505) this).aBool6893)
	    class137_10_ = class538.aClass137Array7163[0];
	else
	    class137_10_ = (((Class505) this).aByte6875 < 3
			    ? (class538.aClass137Array7161
			       [1 + ((Class505) this).aByte6875])
			    : null);
	Class157 class157 = null;
	if (((Class505) this).aClass690_6882.method8067((byte) 98)) {
	    if (bool_8_)
		i |= 0x40000;
	    class157
		= (class596.method7116
		   (class173, i,
		    (11 != ((Class505) this).anInt6878 * -1586471939
		     ? -1586471939 * ((Class505) this).anInt6878 : 10),
		    (-1586471939 * ((Class505) this).anInt6878 == 11
		     ? -1614465841 * ((Class505) this).anInt6879 + 4
		     : ((Class505) this).anInt6879 * -1614465841),
		    class137, class137_10_, (int) class422.aFloat4780,
		    class137.method1656((int) class422.aFloat4780,
					(int) class422.aFloat4777, 1210315106),
		    (int) class422.aFloat4777,
		    ((Class505) this).aClass690_6882,
		    ((Class505) this).aClass591_6889, (byte) -65));
	    if (null != class157) {
		if (bool_8_) {
		    if (((Class505) this).aBoolArray6880 == null)
			((Class505) this).aBoolArray6880 = new boolean[4];
		    ((Class505) this).aClass528_Sub21_Sub12_6884
			= class157.method1899(((Class505) this)
					      .aClass528_Sub21_Sub12_6884);
		    class538.method6581((((Class505) this)
					 .aClass528_Sub21_Sub12_6884),
					((Class505) this).aByte6875,
					(int) class422.aFloat4780,
					(int) class422.aFloat4777,
					((Class505) this).aBoolArray6880,
					(byte) -68);
		    ((Class505) this).aBool6890 = true;
		}
		((Class505) this).anInt6886
		    = class157.method2018() * 1745568611;
		class157.method1901();
	    } else {
		((Class505) this).aBoolArray6880 = null;
		((Class505) this).aClass528_Sub21_Sub12_6884 = null;
		((Class505) this).anInt6886 = 0;
	    }
	    ((Class505) this).aClass157_6881 = null;
	} else if (((Class505) this).aClass157_6881 == null
		   || (((Class505) this).aClass157_6881.method1874() & i) != i
		   || (-1439030235 * class596.anInt7765
		       != ((Class505) this).anInt6877 * -1520825187)) {
	    if (null != ((Class505) this).aClass157_6881)
		i |= ((Class505) this).aClass157_6881.method1874();
	    Class20 class20
		= (class596.method7097
		   (class173, i,
		    (11 != -1586471939 * ((Class505) this).anInt6878
		     ? ((Class505) this).anInt6878 * -1586471939 : 10),
		    (((Class505) this).anInt6878 * -1586471939 == 11
		     ? -1614465841 * ((Class505) this).anInt6879 + 4
		     : ((Class505) this).anInt6879 * -1614465841),
		    class137, class137_10_, (int) class422.aFloat4780,
		    class137.method1656((int) class422.aFloat4780,
					(int) class422.aFloat4777, 1789123562),
		    (int) class422.aFloat4777, bool_8_,
		    ((Class505) this).aClass591_6889, (byte) -45));
	    if (null != class20) {
		((Class505) this).aClass157_6881 = class157
		    = (Class157) class20.anObject208;
		if (bool_8_) {
		    ((Class505) this).aClass528_Sub21_Sub12_6884
			= (Class528_Sub21_Sub12) class20.anObject209;
		    ((Class505) this).aBoolArray6880 = null;
		    class538.method6581((((Class505) this)
					 .aClass528_Sub21_Sub12_6884),
					((Class505) this).aByte6875,
					(int) class422.aFloat4780,
					(int) class422.aFloat4777, null,
					(byte) -123);
		    ((Class505) this).aBool6890 = true;
		}
		((Class505) this).anInt6886
		    = class157.method2018() * 1745568611;
		class157.method1901();
	    } else {
		((Class505) this).aBoolArray6880 = null;
		((Class505) this).aClass528_Sub21_Sub12_6884 = null;
		((Class505) this).aClass157_6881 = null;
		((Class505) this).anInt6886 = 0;
	    }
	} else
	    class157 = ((Class505) this).aClass157_6881;
	((Class505) this).anInt6877 = 1543695145 * class596.anInt7765;
	return class157;
    }
    
    boolean method6128(byte i) {
	return ((Class505) this).aBool6888;
    }
    
    int method6129(int i) {
	return -method6124(-49774183);
    }
    
    void method6130(Class173 class173, int i) {
	if (null != ((Class505) this).aClass528_Sub21_Sub12_6884) {
	    Class422 class422
		= (((Class505) this).aClass645_Sub1_6876.method7693()
		   .aClass422_4868);
	    client.aClass495_10935.method5973((byte) 116).method6568
		(((Class505) this).aClass528_Sub21_Sub12_6884,
		 ((Class505) this).aByte6875, (int) class422.aFloat4780,
		 (int) class422.aFloat4777, ((Class505) this).aBoolArray6880,
		 2144216022);
	    ((Class505) this).aBoolArray6880 = null;
	    ((Class505) this).aClass528_Sub21_Sub12_6884 = null;
	}
    }
    
    void method6131(Class645_Sub1 class645_sub1, int i) {
	if (((Class505) this).aClass690_6883 != null
	    && ((Class505) this).aClass690_6883.method8067((byte) 64)) {
	    ((Class505) this).aClass690_6883.method8080
		(client.anInt11127 - 1469747085 * ((Class505) this).anInt6887,
		 (byte) 11);
	    if (!((Class505) this).aClass690_6883.method8075((byte) 71)) {
		((Class505) this).aClass690_6882
		    = ((Class505) this).aClass690_6883;
		((Class505) this).aBool6885 = true;
		((Class505) this).anInt6887 = client.anInt11127 * -1112716475;
		return;
	    }
	}
	if (((Class505) this).aClass690_6882.method8067((byte) 39)) {
	    if (((Class505) this).aClass690_6882.method8080
		(client.anInt11127 - ((Class505) this).anInt6887 * 1469747085,
		 (byte) 11)) {
		if (Class514.aClass528_Sub38_6967.aClass691_Sub8_10565
			.method9883(1842371538)
		    == 2)
		    ((Class505) this).aBool6890 = false;
		if (((Class505) this).aClass690_6882.method8082(-90771198)) {
		    ((Class505) this).aClass690_6882.method8069(-1, (byte) 12);
		    ((Class505) this).aBool6885 = false;
		    method6126(false, -1, 0, 0, -498040694);
		}
	    }
	} else
	    method6126(false, -1, 0, 0, 526104911);
	((Class505) this).anInt6887 = client.anInt11127 * -1112716475;
    }
    
    void method6132(Class591 class591, byte i) {
	((Class505) this).aClass591_6889 = class591;
	((Class505) this).aClass157_6881 = null;
    }
    
    public void method6133(int i, int i_11_) {
	((Class505) this).aClass690_6883 = null;
	if (i_11_ > 0) {
	    ((Class505) this).aClass690_6883
		= new Class690_Sub1(((Class505) this).aClass645_Sub1_6876,
				    false);
	    ((Class505) this).aClass690_6883.method8120(i, i_11_, 1, false,
							-463845291);
	} else {
	    ((Class505) this).aBool6885 = true;
	    method6126(false, i, 1, 0, -434258314);
	}
    }
    
    int method6134() {
	return 2024822347 * ((Class505) this).anInt6886;
    }
    
    void method6135(Class173 class173, Class157 class157, Class433 class433,
		    int i, int i_12_, int i_13_, int i_14_, boolean bool,
		    int i_15_) {
	Class170[] class170s = class157.method1922();
	Class144[] class144s = class157.method1923();
	if ((((Class505) this).aClass612_6892 == null
	     || ((Class505) this).aClass612_6892.aBool7979)
	    && (null != class170s || class144s != null)) {
	    Class596 class596
		= ((Class596)
		   (((Class505) this).aClass5_Sub15_6874.method63
		    (((Class505) this).anInt6891 * -1276843859, 1904337893)));
	    if (class596.anIntArray7767 != null)
		class596 = (class596.method7099
			    (Class570.playerVarsProvider,
			     (345087519 * client.anInt10943 == 0
			      ? (IMultiVarValueReader) Class185.anInterface18_2117
			      : Class570.playerVarsProvider),
			     930503537));
	    if (null != class596)
		((Class505) this).aClass612_6892
		    = Class612.method7315(client.anInt11127, true);
	}
	if (((Class505) this).aClass612_6892 != null) {
	    class157.method1921(class433);
	    if (bool)
		((Class505) this).aClass612_6892.method7306
		    (class173, (long) client.anInt11127, class170s, class144s,
		     false);
	    else
		((Class505) this).aClass612_6892
		    .method7305((long) client.anInt11127);
	    ((Class505) this).aClass612_6892.method7303((((Class505) this)
							 .aByte6875),
							i, i_12_, i_13_,
							i_14_);
	}
    }
    
    int method6136() {
	return 2024822347 * ((Class505) this).anInt6886;
    }
    
    int method6137() {
	return 2024822347 * ((Class505) this).anInt6886;
    }
    
    void method6138(Class173 class173, int i) {
	method6127(class173, 262144, true, true, 1747612246);
    }
    
    boolean method6139() {
	return ((Class505) this).aBool6888;
    }
    
    int method6140() {
	return 2024822347 * ((Class505) this).anInt6886;
    }
    
    int method6141() {
	return -method6124(826459207);
    }
    
    int method6142() {
	return -method6124(-1519796551);
    }
    
    int method6143() {
	return -method6124(751490919);
    }
    
    boolean method6144() {
	return ((Class505) this).aBool6888;
    }
    
    int method6145() {
	return 2024822347 * ((Class505) this).anInt6886;
    }
    
    Class505(Class173 class173, Class5_Sub15 class5_sub15, Class596 class596,
	     int i, int i_16_, int i_17_, Class645_Sub1 class645_sub1,
	     boolean bool, int i_18_, int i_19_) {
	((Class505) this).anInt6877 = 1577789003;
	((Class505) this).anInt6886 = 0;
	((Class505) this).aBool6885 = false;
	((Class505) this).aBool6890 = false;
	((Class505) this).aClass5_Sub15_6874 = class5_sub15;
	((Class505) this).anInt6891 = class596.anInt7765 * 1218592857;
	((Class505) this).anInt6878 = 672717141 * i;
	((Class505) this).anInt6879 = -1940958673 * i_16_;
	((Class505) this).aClass645_Sub1_6876 = class645_sub1;
	((Class505) this).aBool6885 = -1 != i_18_;
	((Class505) this).aByte6875 = (byte) i_17_;
	((Class505) this).aBool6893 = bool;
	((Class505) this).aBool6888
	    = (class173.method2163() && class596.aBool7819
	       && !((Class505) this).aBool6893);
	((Class505) this).aClass690_6882
	    = new Class690_Sub1(class645_sub1, false);
	method6126(false, i_18_, 1, ((Class505) this).aBool6885 ? i_19_ : 0,
		   1989618424);
    }
    
    Class596 method6146(int i) {
	return ((Class596)
		(((Class505) this).aClass5_Sub15_6874.method63
		 (-1276843859 * ((Class505) this).anInt6891, -1726813621)));
    }
    
    public static int method6147(int i, int i_20_, int i_21_, int i_22_,
				 int i_23_, int i_24_, int i_25_) {
	if ((i_24_ & 0x1) == 1) {
	    int i_26_ = i_22_;
	    i_22_ = i_23_;
	    i_23_ = i_26_;
	}
	i_21_ &= 0x3;
	if (i_21_ == 0)
	    return i;
	if (1 == i_21_)
	    return i_20_;
	if (i_21_ == 2)
	    return 7 - i - (i_22_ - 1);
	return 7 - i_20_ - (i_23_ - 1);
    }
    
    static final void method6148(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_27_ = (((Class648) class648).anIntArray8394
		     [717927929 * ((Class648) class648).anInt8395]);
	int i_28_ = (((Class648) class648).anIntArray8394
		     [1 + 717927929 * ((Class648) class648).anInt8395]);
	VarDefinition.method4138(i_27_, new Class528_Sub39(i_28_, 3), null, true,
			    2028482788);
    }
    
    public static char method6149(byte i, int i_29_) {
	int i_30_ = i & 0xff;
	if (i_30_ == 0)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (Integer.toString(i_30_,
								     16))
						   .toString());
	if (i_30_ >= 128 && i_30_ < 160) {
	    int i_31_ = Class662.aCharArray8451[i_30_ - 128];
	    if (0 == i_31_)
		i_31_ = 63;
	    i_30_ = i_31_;
	}
	return (char) i_30_;
    }
    
    static void method6150(Class528_Sub34 class528_sub34, int i, int i_32_,
			   int i_33_, byte i_34_) {
	class528_sub34.aClass528_Sub42_Sub2_10481.method9660(i_32_,
							     1478538680);
	class528_sub34.aClass528_Sub42_Sub2_10481.writeInt(i, 2010865915);
	class528_sub34.aClass528_Sub42_Sub2_10481.writeLEShortA(i_33_,
							     -2070226170);
    }
}
