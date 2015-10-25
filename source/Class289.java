/* Class289 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

public class Class289
{
    static Class289 aClass289_3178;
    static Class289 aClass289_3179;
    int anInt3180;
    static Class289 aClass289_3181 = new Class289(0, true);
    boolean aBool3182;
    protected static Class506 aClass506_3183;
    public static Class165 aClass165_3184;
    
    static {
	aClass289_3179 = new Class289(1, true);
	aClass289_3178 = new Class289(2, false);
    }
    
    Class289(int i, boolean bool) {
	((Class289) this).anInt3180 = 1124514215 * i;
	((Class289) this).aBool3182 = bool;
    }
    
    static void method3871(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [717927929 * ((Class648) class648).anInt8395 - 2]
	    = (((Class256)
		Class669.aClass25_Sub1_8522.method63((((Class648) class648)
						      .anIntArray8394
						      [((((Class648) class648)
							 .anInt8395)
							* 717927929) - 2]),
						     1209766438))
	       .anIntArrayArray2817
	       [(((Class648) class648).anIntArray8394
		 [((Class648) class648).anInt8395 * 717927929 - 1])]
	       [1]);
	((Class648) class648).anInt8395 -= 1239022665;
    }
    
    static final void method3872(Class648 class648, int i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_0_, (byte) 103);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = client.method10201(class229).method9474(-2100406);
    }
    
    public static Class226 method3873(int i, int[] is, Class226 class226,
				      boolean bool, int i_1_) {
	if (!Class76.aClass446_792.method5352(i, -1937599311))
	    return null;
	int i_2_ = Class76.aClass446_792.method5345(i, 2052365111);
	Class229[] class229s;
	if (0 == i_2_)
	    class229s = new Class229[0];
	else if (class226 == null)
	    class229s = new Class229[i_2_];
	else
	    class229s = class226.aClass229Array2336;
	if (class226 == null)
	    class226 = new Class226(bool, class229s);
	else {
	    class226.aClass229Array2336 = class229s;
	    class226.aBool2335 = bool;
	}
	for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
	    if (class226.aClass229Array2336[i_3_] == null) {
		byte[] is_4_ = Class76.aClass446_792.method5349(i, i_3_, is,
								(short) 20695);
		if (null != is_4_) {
		    Class229 class229
			= class226.aClass229Array2336[i_3_] = new Class229();
		    class229.anInt2376 = 1521091751 * (i_3_ + (i << 16));
		    class229.method3232(new ByteBuffer(is_4_),
					-1507893454);
		}
	    }
	}
	return class226;
    }
    
    public static Frame method3874(Class702 class702, int i, int i_5_,
				   int i_6_, int i_7_, byte i_8_) {
	if (0 == i_6_) {
	    Class683[] class683s = Class279.method3733(class702, (byte) 2);
	    if (class683s == null)
		return null;
	    boolean bool = false;
	    for (int i_9_ = 0; i_9_ < class683s.length; i_9_++) {
		if (-1425052405 * class683s[i_9_].anInt8604 == i
		    && i_5_ == -968107603 * class683s[i_9_].anInt8605
		    && (i_7_ == 0
			|| i_7_ == (((Class683) class683s[i_9_]).anInt8602
				    * 401869361))
		    && (!bool
			|| class683s[i_9_].anInt8603 * -1816249255 > i_6_)) {
		    i_6_ = -1816249255 * class683s[i_9_].anInt8603;
		    bool = true;
		}
	    }
	    if (!bool)
		return null;
	}
	Frame frame = new Frame("Jagex Full Screen");
	frame.setResizable(false);
	class702.method8223(frame, i, i_5_, i_6_, i_7_, 1517828772);
	return frame;
    }
    
    public static void method3875(int i, int i_10_, int i_11_, boolean bool,
				  int i_12_) {
	client.aLong11017 = 0L;
	int i_13_ = Class377.method4705(2061694738);
	if (3 == i || i_13_ == 3)
	    bool = true;
	if (!Class587.aClass173_7714.method2467())
	    bool = true;
	Class134.method1639(i_13_, i, i_10_, i_11_, bool, -936142683);
    }
    
    static final void method3876(Class648 class648, byte i) {
	int i_14_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	RenderType renderType
	    = ((RenderType)
	       Class147.aClass5_Sub14_1673.method63(i_14_, -1933349188));
	if (null != renderType.anIntArray7651
	    && renderType.anIntArray7651.length > 0) {
	    int i_15_ = 0;
	    int i_16_ = renderType.anIntArray7656[0];
	    for (int i_17_ = 1; i_17_ < renderType.anIntArray7651.length;
		 i_17_++) {
		if (renderType.anIntArray7656[i_17_] > i_16_) {
		    i_15_ = i_17_;
		    i_16_ = renderType.anIntArray7656[i_17_];
		}
	    }
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= renderType.anIntArray7651[i_15_];
	} else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= renderType.anInt7663 * -1581091265;
    }
    
    static final void method3877(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class95_Sub1_Sub2.aClass537_11200.method6507(1197673856);
    }
}
