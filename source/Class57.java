/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class57
{
    int anInt684;
    int anInt685;
    public static Class5_Sub22 aClass5_Sub22_686;
    
    Class57() {
	/* empty */
    }
    
    static void method983(byte[] is, int i) {
	ByteBuffer class528_sub42 = new ByteBuffer(is);
	for (;;) {
	    int i_0_ = class528_sub42.readUnsignedByte((byte) 6);
	    if (i_0_ == 0)
		break;
	    if (1 == i_0_)
		Class627.anInt8146
		    = class528_sub42.readUnsignedShort(-2023384615) * -2132463817;
	    else if (10 == i_0_)
		class528_sub42.readUnsignedShort(-2046274882);
	}
    }
    
    public static void method984(boolean bool, int i) {
	/* empty */
    }
    
    static final void method985(Class229 class229, Class648 class648, int i) {
	int i_1_ = 10;
	int i_2_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	int i_3_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class496.method6053(class229, i_1_, i_2_, i_3_, class648, 840366527);
    }
    
    static final void method986(Class648 class648, int i) {
	int i_4_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	if (-1 == i_4_)
	    throw new RuntimeException();
	Class7 class7
	    = (Class7) Class551.aClass5_Sub17_7422.method63(i_4_, 1087932962);
	if (Class459.aClass459_5132 != class7.aClass459_129)
	    throw new RuntimeException();
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class7.method553(string, 1084622625) ? 1 : 0;
    }
    
    static final void method987(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [((Class648) class648).anInt8395 * 717927929 - 1]
	    = (((Class648) class648).aClass308_8391.method4110((byte) -1)
	       [(((Class648) class648).anIntArray8394
		 [((Class648) class648).anInt8395 * 717927929 - 1])]);
    }
    
    static final void method988(Class648 class648, int i) {
	if (Class416.aClass544_4749.method6644(82, -653255765))
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 1;
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
    }
    
    static void method989(Class226 class226, Class229 class229, int i) {
	if (null != class229) {
	    if (1835803215 * class229.anInt2377 != -1) {
		Class229 class229_5_
		    = class226.method3177(class229.anInt2522 * -1027873541,
					  (byte) 28);
		if (null != class229_5_) {
		    if (class229_5_.aClass229Array2542
			== class229_5_.aClass229Array2390) {
			class229_5_.aClass229Array2390
			    = (new Class229
			       [class229_5_.aClass229Array2542.length]);
			class229_5_.aClass229Array2390
			    [class229_5_.aClass229Array2390.length - 1]
			    = class229;
			Class670.method7940(class229_5_.aClass229Array2542, 0,
					    class229_5_.aClass229Array2390, 0,
					    class229.anInt2377 * 1835803215);
			Class670.method7940(class229_5_.aClass229Array2542,
					    (class229.anInt2377 * 1835803215
					     + 1),
					    class229_5_.aClass229Array2390,
					    class229.anInt2377 * 1835803215,
					    ((class229_5_
					      .aClass229Array2542).length
					     - 1835803215 * class229.anInt2377
					     - 1));
		    } else {
			int i_6_ = 0;
			Class229[] class229s;
			for (class229s = class229_5_.aClass229Array2390;
			     (i_6_ < class229s.length
			      && class229 != class229s[i_6_]);
			     i_6_++) {
			    /* empty */
			}
			if (i_6_ < class229s.length) {
			    Class670.method7940(class229s, 1 + i_6_, class229s,
						i_6_,
						class229s.length - i_6_ - 1);
			    class229s[(class229_5_.aClass229Array2390.length
				       - 1)]
				= class229;
			}
		    }
		}
	    } else {
		Class229[] class229s = class226.method3176(285823157);
		int i_7_;
		for (i_7_ = 0;
		     i_7_ < class229s.length && class229 != class229s[i_7_];
		     i_7_++) {
		    /* empty */
		}
		if (i_7_ < class229s.length) {
		    Class670.method7940(class229s, 1 + i_7_, class229s, i_7_,
					class229s.length - i_7_ - 1);
		    class229s[class229s.length - 1] = class229;
		}
	    }
	}
    }
    
    static final void method990(Class648 class648, int i) {
	((Class648) class648).anInt8410 -= 505712897;
	String string
	    = (String) (((Class648) class648).anObjectArray8396
			[((Class648) class648).anInt8410 * -520794877]);
	String string_8_
	    = (String) (((Class648) class648).anObjectArray8396
			[-520794877 * ((Class648) class648).anInt8410 + 1]);
	String string_9_
	    = (String) (((Class648) class648).anObjectArray8396
			[2 + ((Class648) class648).anInt8410 * -520794877]);
	boolean bool
	    = ((((Class648) class648).anIntArray8394
		[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	       == 1);
	Class567.method6839(string, string_8_, string_9_, bool, 152358788);
    }
    
    static void method991(Class418 class418, int i) {
	Class28.aClass418_288.method4986(class418);
    }
    
    public static int method992(CharSequence charsequence, int i) {
	int i_10_ = charsequence.length();
	int i_11_ = 0;
	for (int i_12_ = 0; i_12_ < i_10_; i_12_++)
	    i_11_ = (i_11_ << 5) - i_11_ + charsequence.charAt(i_12_);
	return i_11_;
    }
    
    static void method993(int i, int i_13_) {
	Class69.anInt771 = -927909471 * i;
	synchronized (Class69.aClass186_770) {
	    Class69.aClass186_770.method2731(-2090770583);
	}
    }
}
