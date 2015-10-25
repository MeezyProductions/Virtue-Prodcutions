/* Class500 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class Class500
{
    int anInt6846;
    int anInt6847;
    int anInt6848;
    int anInt6849;
    Class497[] aClass497Array6850;
    Class497[] aClass497Array6851;
    int anInt6852;
    int anInt6853 = -76359833;
    int anInt6854;
    Class500 aClass500_6855;
    boolean aBool6856;
    Class151 aClass151_6857;
    static final int anInt6858 = 512;
    int anInt6859;
    int anInt6860;
    int anInt6861;
    int anInt6862;
    Class157 aClass157_6863;
    byte[] aByteArray6864;
    Class497 aClass497_6865;
    Class548 aClass548_6866;
    int anInt6867;
    boolean aBool6868 = true;
    int anInt6869;
    
    public static void method6074() {
	Class497.method6058();
    }
    
    public void method6075(int i, int i_0_, byte i_1_) {
	if (((Class500) this).aBool6856) {
	    /* empty */
	}
	((Class500) this).anInt6867
	    = (785491581
	       * (i * (i_0_ - 865187667 * ((Class500) this).anInt6861) / 255
		  + 865187667 * ((Class500) this).anInt6861));
    }
    
    public void method6076(Class500 class500_2_, byte i) {
	if (((Class500) this).aBool6856)
	    ((Class500) this).anInt6861
		= ((Class500) this).anInt6867 * 1106534455;
	else if (null != class500_2_ && ((Class500) class500_2_).aBool6856)
	    ((Class500) this).anInt6861
		= (-2079902171
		   - ((Class500) class500_2_).anInt6867 * 1106534455);
	else
	    ((Class500) this).anInt6861 = 0;
	((Class500) this).aBool6856 = true;
	((Class500) this).aClass500_6855 = class500_2_;
	((Class500) this).anInt6867 = 0;
    }
    
    public boolean method6077(int i) {
	return ((Class500) this).aBool6856;
    }
    
    public boolean method6078(Class173 class173, int i, int i_3_, int i_4_) {
	if (((Class500) this).anInt6853 * 797092777 != i) {
	    ((Class500) this).anInt6853 = 76359833 * i;
	    int i_5_ = ItemStyleOverride.method531(i, -1844913372);
	    if (i_5_ > 512)
		i_5_ = 512;
	    if (i_5_ <= 0)
		i_5_ = 1;
	    if (((Class500) this).anInt6848 * 1486149147 != i_5_) {
		((Class500) this).anInt6848 = -1337060333 * i_5_;
		((Class500) this).aClass151_6857 = null;
	    }
	    if (((Class500) this).aClass497Array6850 != null) {
		((Class500) this).anInt6852 = 0;
		int[] is
		    = new int[((Class500) this).aClass497Array6850.length];
		for (int i_6_ = 0;
		     i_6_ < ((Class500) this).aClass497Array6850.length;
		     i_6_++) {
		    Class497 class497
			= ((Class500) this).aClass497Array6850[i_6_];
		    if (class497.method6057
			(((Class500) this).anInt6854 * 679996649,
			 -2089305585 * ((Class500) this).anInt6846,
			 ((Class500) this).anInt6869 * -328568305,
			 797092777 * ((Class500) this).anInt6853)) {
			is[((Class500) this).anInt6852 * 466593663]
			    = ((Class497) class497).anInt6819;
			((Class500) this).aClass497Array6851
			    [((((Class500) this).anInt6852 += 666376319)
			      * 466593663) - 1]
			    = class497;
		    }
		}
		RenderType.method6990(is, ((Class500) this).aClass497Array6851,
				    0,
				    (((Class500) this).anInt6852 * 466593663
				     - 1),
				    -1127680083);
	    }
	    ((Class500) this).aBool6868 = true;
	}
	boolean bool = false;
	if (((Class500) this).aBool6868) {
	    ((Class500) this).aBool6868 = false;
	    for (int i_7_ = 466593663 * ((Class500) this).anInt6852 - 1;
		 i_7_ >= 0; i_7_--) {
		boolean bool_8_
		    = (((Class500) this).aClass497Array6851[i_7_].method6059
		       (class173, ((Class500) this).aClass497_6865));
		Class500 class500_9_ = this;
		((Class500) class500_9_).aBool6868
		    = ((Class500) class500_9_).aBool6868 | !bool_8_;
		bool |= bool_8_;
	    }
	}
	if (i_3_ == 0 || !class173.method2165())
	    ((Class500) this).aClass157_6863 = null;
	else if (((Class500) this).aClass157_6863 == null
		 && -845328535 * ((Class500) this).anInt6862 >= 0)
	    method6079(class173, (byte) 4);
	if (null != ((Class500) this).aClass500_6855
	    && ((Class500) this).aClass500_6855 != this) {
	    ((Class500) this).aClass500_6855.method6081(2106934460);
	    bool |= ((Class500) this).aClass500_6855
			.method6078(class173, i, i_3_, 1428344670);
	}
	return bool;
    }
    
    void method6079(Class173 class173, byte i) {
	try {
	    boolean bool
		= Class28.aClass446_304.method5352((-845328535
						    * (((Class500) this)
						       .anInt6862)),
						   -1935239120);
	    if (bool) {
		class173.method2160(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
		Class177 class177
		    = Class177.method2590(Class28.aClass446_304,
					  (((Class500) this).anInt6862
					   * -845328535),
					  0);
		((Class500) this).aClass157_6863
		    = class173.method2244(class177, 1099776, 0, 255, 1);
		byte[] is = ((Class500) this).aClass157_6863.method1913();
		if (is == null)
		    ((Class500) this).aByteArray6864 = null;
		else {
		    ((Class500) this).aByteArray6864 = new byte[is.length];
		    System.arraycopy(is, 0, ((Class500) this).aByteArray6864,
				     0, is.length);
		}
	    }
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public void method6080(Class173 class173, int i, int i_10_, int i_11_,
			   int i_12_, int i_13_, int i_14_, int i_15_,
			   int i_16_, int i_17_, boolean bool,
			   boolean bool_18_, int i_19_) {
	int i_20_ = 0;
	if (((Class500) this).aBool6856)
	    i_20_ = ((Class500) this).anInt6867 * -2027322667;
	if (null != ((Class500) this).aClass500_6855) {
	    Class500 class500_21_ = this;
	    Class500 class500_22_ = ((Class500) this).aClass500_6855;
	    if (class500_21_.hashCode() > class500_22_.hashCode()) {
		class500_21_ = ((Class500) this).aClass500_6855;
		class500_22_ = this;
		i_20_ = 255 - i_20_;
	    }
	    class500_21_.method6083(class173, i, i_10_, i_11_, i_12_, i_13_,
				    i_14_, i_15_, i_16_, i_17_, bool, bool_18_,
				    i_20_, 1915626970);
	    class500_22_.method6083(class173, i, i_10_, i_11_, i_12_, i_13_,
				    i_14_, i_15_, i_16_, i_17_, false,
				    bool_18_, 255 - i_20_, 588532265);
	} else {
	    if (-1717411985 * ((Class500) this).anInt6849 == -1)
		class173.method2216(i_10_, i_11_, i_12_, i_13_,
				    ~0xffffff | i_17_, 0);
	    method6083(class173, i, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_,
		       i_16_, i_17_, bool, bool_18_, i_20_, 1393488000);
	}
    }
    
    public void method6081(int i) {
	((Class500) this).aBool6856 = false;
	((Class500) this).aClass500_6855 = null;
	((Class500) this).anInt6867 = 0;
    }
    
    void method6082(Class173 class173, int i, int i_23_, int i_24_, int i_25_,
		    int i_26_) {
	Class433 class433 = class173.method2529();
	Class433 class433_27_ = new Class433();
	class433_27_.method5248(0.0F, 0.0F, 0.0F);
	class433_27_.method5256(0.0F, -1.0F, 0.0F,
				Class417.method4970(-i_23_ & 0x3fff));
	class433_27_.method5256(-1.0F, 0.0F, 0.0F,
				Class417.method4970(-i & 0x3fff));
	class433_27_.method5256(0.0F, 0.0F, -1.0F,
				Class417.method4970(-i_24_ & 0x3fff));
	class173.method2465(class433_27_);
	Class433 class433_28_ = new Class433();
	if (((Class500) this).anInt6847 * -1005250399 != i_25_) {
	    ((Class500) this).aClass157_6863
		.method1945((byte) i_25_, ((Class500) this).aByteArray6864);
	    ((Class500) this).anInt6847 = i_25_ * 1161481057;
	}
	((Class500) this).aClass157_6863.method1897(class433_28_, null, 0);
	class173.method2465(class433);
    }
    
    public Class500(int i, Class497[] class497s, int i_29_, int i_30_,
		    int i_31_, int i_32_, Class548 class548, int i_33_) {
	((Class500) this).anInt6854 = 371698521 * i_30_;
	((Class500) this).anInt6846 = i_31_ * -1158810385;
	((Class500) this).anInt6869 = -1612956433 * i_32_;
	((Class500) this).anInt6849 = i * 537255823;
	((Class500) this).aClass497Array6850 = class497s;
	((Class500) this).aClass548_6866 = class548;
	if (class497s != null) {
	    ((Class500) this).aClass497Array6851
		= new Class497[class497s.length];
	    ((Class500) this).aClass497_6865
		= i_29_ >= 0 ? class497s[i_29_] : null;
	} else {
	    ((Class500) this).aClass497Array6851 = null;
	    ((Class500) this).aClass497_6865 = null;
	}
	((Class500) this).anInt6862 = 740569305 * i_33_;
    }
    
    void method6083(Class173 class173, int i, int i_34_, int i_35_, int i_36_,
		    int i_37_, int i_38_, int i_39_, int i_40_, int i_41_,
		    boolean bool, boolean bool_42_, int i_43_, int i_44_) {
	int i_45_ = 255 - i_43_;
	class173.method2235();
	class173.method2254();
	if (((Class500) this).aClass157_6863 == null) {
	    class173.method2268(2, 0);
	    i_39_ = i_39_ + i & 0x3fff;
	    if (-1 != -1717411985 * ((Class500) this).anInt6849
		&& 0 != ((Class500) this).anInt6848 * 1486149147) {
		Class160 class160
		    = Class264.aClass165_2865.method2093(((((Class500) this)
							   .anInt6849)
							  * -1717411985),
							 (byte) -40);
		if (null == ((Class500) this).aClass151_6857
		    && (Class481.anInterface22_5460.method122
			(Class600.aClass600_7866,
			 class160.anInt1762 * 1586906309,
			 (Class583.aClass583_7697 == class160.aClass583_1771
			  ? Class595.aClass595_7761 : Class595.aClass595_7760),
			 0.7F, ((Class500) this).anInt6848 * 1486149147,
			 ((Class500) this).anInt6848 * 1486149147, false,
			 (byte) 38))) {
		    int[] is
			= (Class583.aClass583_7697 == class160.aClass583_1771
			   ? (Class481.anInterface22_5460.method127
			      (Class600.aClass600_7866,
			       1586906309 * class160.anInt1762, 0.7F,
			       ((Class500) this).anInt6848 * 1486149147,
			       ((Class500) this).anInt6848 * 1486149147, false,
			       (byte) 9))
			   : (Class481.anInterface22_5460.method117
			      (Class600.aClass600_7866,
			       1586906309 * class160.anInt1762, 0.7F,
			       1486149147 * ((Class500) this).anInt6848,
			       ((Class500) this).anInt6848 * 1486149147, false,
			       -274545682)));
		    ((Class500) this).anInt6859 = -1623944359 * is[0];
		    ((Class500) this).anInt6860
			= 1679328087 * is[is.length - 1];
		    ((Class500) this).aClass151_6857
			= class173.method2418(is, 0,
					      -726179659 * class160.anInt1774,
					      class160.anInt1774 * -726179659,
					      class160.anInt1774 * -726179659,
					      -1631941611);
		}
		int i_46_
		    = (255 == i_45_
		       ? (Class583.aClass583_7697 == class160.aClass583_1771
			  ? 1 : 0)
		       : 1);
		if (1 == i_46_ && bool)
		    class173.method2216(i_34_, i_35_, i_36_, i_37_, i_41_, 0);
		if (null != ((Class500) this).aClass151_6857) {
		    int i_47_ = i_38_ * i_37_ / -4096;
		    int i_48_;
		    for (i_48_ = (i_36_ - i_37_) / 2 + i_39_ * i_37_ / 4096;
			 i_48_ > i_37_; i_48_ -= i_37_) {
			/* empty */
		    }
		    for (/**/; i_48_ < 0; i_48_ += i_37_) {
			/* empty */
		    }
		    if (Class548.aClass548_7416
			== ((Class500) this).aClass548_6866) {
			for (int i_49_ = i_48_ - i_37_; i_49_ < i_36_;
			     i_49_ += i_37_)
			    ((Class500) this).aClass151_6857.method1776
				(i_49_ + i_34_, i_47_ + i_35_, i_37_, i_37_, 0,
				 i_45_ << 24 | 0xffffff, i_46_);
			if (0 != (((Class500) this).anInt6859 * 487359721
				  & ~0xffffff))
			    class173.method2210(0, 0, i_36_, i_35_ + i_47_ + 1,
						(((Class500) this).anInt6859
						 * 487359721),
						-1539554707);
			if ((((Class500) this).anInt6860 * -135980953
			     & ~0xffffff)
			    != 0)
			    class173.method2210(0, i_37_ + (i_35_ + i_47_),
						i_36_,
						i_37_ - (i_37_
							 + (i_47_ + i_35_)),
						(((Class500) this).anInt6860
						 * -135980953),
						-1815320061);
		    } else {
			for (/**/; i_47_ > i_37_; i_47_ -= i_37_) {
			    /* empty */
			}
			for (/**/; i_47_ < 0; i_47_ += i_37_) {
			    /* empty */
			}
			for (int i_50_ = i_48_ - i_37_; i_50_ < i_36_;
			     i_50_ += i_37_) {
			    for (int i_51_ = i_47_ - i_37_; i_51_ < i_37_;
				 i_51_ += i_37_)
				((Class500) this).aClass151_6857.method1776
				    (i_50_ + i_34_, i_51_ + i_35_, i_37_,
				     i_37_, 0, i_45_ << 24 | 0xffffff, i_46_);
			}
		    }
		}
	    } else
		class173.method2216(i_34_, i_35_, i_36_, i_37_,
				    i_45_ << 24 | i_41_, bool ? 0 : 1);
	} else if (bool_42_) {
	    Class418 class418 = class173.method2187();
	    Class418 class418_52_ = class173.method2187();
	    class418.aFloatArray4768[2] = class418.aFloatArray4768[3];
	    class418.aFloatArray4768[6] = class418.aFloatArray4768[7];
	    class418.aFloatArray4768[10] = class418.aFloatArray4768[11];
	    class418.aFloatArray4768[14] = class418.aFloatArray4768[15];
	    class173.method2252(class418);
	    method6082(class173, i_38_, i_39_, i_40_, i_43_, 342616067);
	    class173.method2252(class418_52_);
	} else {
	    if (bool)
		class173.method2268(3, i_41_);
	    method6082(class173, i_38_, i_39_, i_40_, i_43_, 342616067);
	}
	for (int i_53_ = 466593663 * ((Class500) this).anInt6852 - 1;
	     i_53_ >= 0; i_53_--)
	    ((Class500) this).aClass497Array6851[i_53_].method6060
		(class173, i_34_, i_35_, i_36_, i_37_, i_38_, i_39_,
		 ((Class500) this).anInt6854 * 679996649,
		 -2089305585 * ((Class500) this).anInt6846,
		 ((Class500) this).anInt6869 * -328568305, i_45_);
	class173.method2268(2, 0);
	class173.method2237();
    }
    
    public void method6084(int i, int i_54_) {
	if (((Class500) this).aBool6856) {
	    /* empty */
	}
	((Class500) this).anInt6867
	    = (785491581
	       * (i * (i_54_ - 865187667 * ((Class500) this).anInt6861) / 255
		  + 865187667 * ((Class500) this).anInt6861));
    }
    
    public void method6085(int i, int i_55_) {
	if (((Class500) this).aBool6856) {
	    /* empty */
	}
	((Class500) this).anInt6867
	    = (785491581
	       * (i * (i_55_ - 865187667 * ((Class500) this).anInt6861) / 255
		  + 865187667 * ((Class500) this).anInt6861));
    }
    
    public void method6086(int i, int i_56_) {
	if (((Class500) this).aBool6856) {
	    /* empty */
	}
	((Class500) this).anInt6867
	    = (785491581
	       * (i * (i_56_ - 865187667 * ((Class500) this).anInt6861) / 255
		  + 865187667 * ((Class500) this).anInt6861));
    }
    
    public boolean method6087() {
	return ((Class500) this).aBool6856;
    }
    
    public void method6088() {
	((Class500) this).aBool6856 = false;
	((Class500) this).aClass500_6855 = null;
	((Class500) this).anInt6867 = 0;
    }
    
    public boolean method6089() {
	return ((Class500) this).aBool6856;
    }
    
    public boolean method6090() {
	return ((Class500) this).aBool6856;
    }
    
    public Class500 method6091(byte i) {
	return ((Class500) this).aClass500_6855;
    }
    
    public void method6092(Class173 class173, int i, int i_57_, int i_58_,
			   int i_59_, int i_60_, int i_61_, int i_62_,
			   int i_63_, int i_64_, int i_65_) {
	method6080(class173, i, i_57_, i_58_, i_59_, i_60_, i_61_, i_62_, 0,
		   i_64_, true, false, -520245233);
    }
    
    public static long method6093(int i) {
	long l;
	try {
	    URL url = new URL(new StringBuilder().append
				  (Class364_Sub2.method9233("services", false,
							    -1403934854))
				  .append
				  ("m=accountappeal/login.ws").toString());
	    URLConnection urlconnection = url.openConnection();
	    urlconnection.setRequestProperty("connection", "close");
	    urlconnection.setDoInput(true);
	    urlconnection.setDoOutput(true);
	    urlconnection.setConnectTimeout(5000);
	    OutputStreamWriter outputstreamwriter
		= new OutputStreamWriter(urlconnection.getOutputStream());
	    outputstreamwriter.write("data1=req");
	    outputstreamwriter.flush();
	    InputStream inputstream = urlconnection.getInputStream();
	    ByteBuffer class528_sub42 = new ByteBuffer(new byte[1000]);
	    for (;;) {
		int i_66_
		    = inputstream.read(class528_sub42.payload,
				       class528_sub42.pointer * -185904669,
				       1000 - (class528_sub42.pointer
					       * -185904669));
		if (-1 == i_66_)
		    break;
		class528_sub42.pointer += 2015001547 * i_66_;
		if (-185904669 * class528_sub42.pointer >= 1000)
		    return 0L;
	    }
	    class528_sub42.pointer = 0;
	    long l_67_ = class528_sub42.method9633(771973092);
	    l = l_67_;
	} catch (Exception exception) {
	    return 0L;
	}
	return l;
    }
    
    static final void method6094(Class648 class648, int i) {
	int i_68_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub8_10565
		  .method8126(i_68_, -1955030095);
    }
}
