/* Class215 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class215
{
    Class244 aClass244_2258;
    static final int anInt2259 = 2;
    long aLong2260;
    int anInt2261;
    Class15 aClass15_2262;
    boolean aBool2263;
    String aString2264;
    int anInt2265;
    static final int anInt2266 = 1;
    boolean aBool2267;
    Class620[] aClass620Array2268;
    int anInt2269;
    Class15 aClass15_2270;
    static Class151[] aClass151Array2271;
    static int anInt2272;
    
    public boolean method2976(byte i) {
	return ((Class215) this).aBool2263;
    }
    
    public int method2977(int i) {
	return ((Class215) this).anInt2261 * -465166015;
    }
    
    void method2978(int i, int i_0_) {
	((Class215) this).anInt2261 = -937988415 * i;
    }
    
    public void method2979(Interface24 interface24, int i) {
	if (null == ((Class215) this).aClass15_2270)
	    ((Class215) this).aClass15_2270
		= new Class15(interface24.method130((byte) 66));
	else
	    ((Class215) this).aClass15_2270.method27((byte) 2);
    }
    
    void method2980(int i, int i_1_) {
	((Class215) this).anInt2265 = i * -174960785;
    }
    
    public boolean method2981(byte i) {
	return ((Class215) this).aBool2267;
    }
    
    void method2982(boolean bool, byte i) {
	((Class215) this).aBool2267 = bool;
    }
    
    public int method2983() {
	return -133180611 * ((Class215) this).anInt2269;
    }
    
    public boolean method2984() {
	return ((Class215) this).aBool2267;
    }
    
    public int method2985(int i) {
	return -133180611 * ((Class215) this).anInt2269;
    }
    
    void method2986(int i, int i_2_) {
	((Class215) this).anInt2269 = 260906005 * i;
    }
    
    long method2987(int i) {
	return ((Class215) this).aLong2260 * 3642550226385960137L;
    }
    
    public Class620 method2988(int i, byte i_3_) {
	return ((Class215) this).aClass620Array2268[i];
    }
    
    Class215(ByteBuffer class528_sub42, boolean bool, boolean bool_4_,
	     Interface24 interface24) {
	if (bool)
	    ((Class215) this).aLong2260
		= class528_sub42.method9633(771973092) * -4405872936723423879L;
	else
	    ((Class215) this).aLong2260 = 4405872936723423879L;
	if (bool_4_)
	    ((Class215) this).aString2264
		= class528_sub42.method9684((byte) -42);
	int i = class528_sub42.readUnsignedByte((byte) 21);
	((Class215) this).aBool2263 = (i & 0x1) != 0;
	((Class215) this).aBool2267 = (i & 0x2) != 0;
	((Class215) this).aClass620Array2268
	    = (new Class620
	       [interface24.method133(-566852691).method7018(439711688)]);
	int i_5_ = class528_sub42.readUnsignedByte((byte) 125);
	if (i_5_ > ((Class215) this).aClass620Array2268.length)
	    throw new IllegalStateException("");
	for (int i_6_ = 0; i_6_ < ((Class215) this).aClass620Array2268.length;
	     i_6_++) {
	    Class620 class620
		= (((Class215) this).aClass620Array2268[i_6_]
		   = new Class620(interface24.method133(-1452442006)
				      .method7019(i_6_, 1914835642),
				  true));
	    if (i_6_ < i_5_)
		class620.method7392(class528_sub42.readInt(-1153224493),
				    1932984346);
	    else
		class620.method7392(0, -212905146);
	    class620.method7396(class620.method7393(-454559200), (byte) -13);
	}
	int i_7_ = class528_sub42.readUnsignedShort(906537256);
	((Class215) this).aClass15_2262
	    = new Class15(interface24.method130((byte) 104));
	for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
	    Class411 class411
		= interface24.method130((byte) 16).method8255(class528_sub42,
							      1913522331);
	    ((Class215) this).aClass15_2262.method15((1862601893
						      * class411.anInt4711),
						     class411.anObject4712,
						     628995778);
	}
	((Class215) this).anInt2265
	    = class528_sub42.readUnsignedShort(258320739) * -174960785;
	if (65535 == 406056847 * ((Class215) this).anInt2265)
	    ((Class215) this).anInt2265 = 174960785;
	((Class215) this).anInt2261
	    = class528_sub42.readUnsignedByte((byte) 18) * -937988415;
	((Class215) this).aClass244_2258
	    = ((Class244)
	       Class443.method5321(Class244.method3388((byte) 51),
				   class528_sub42.readUnsignedByte((byte) 32),
				   833893049));
	((Class215) this).anInt2269
	    = class528_sub42.readUnsignedByte((byte) 101) * 260906005;
    }
    
    public Class15 method2989(int i) {
	return ((Class215) this).aClass15_2270;
    }
    
    public int method2990() {
	return ((Class215) this).anInt2261 * -465166015;
    }
    
    public Class244 method2991(int i) {
	return ((Class215) this).aClass244_2258;
    }
    
    void method2992(int i) {
	((Class215) this).anInt2261 = -937988415 * i;
    }
    
    public int method2993() {
	return 406056847 * ((Class215) this).anInt2265;
    }
    
    public int method2994() {
	return 406056847 * ((Class215) this).anInt2265;
    }
    
    public int method2995() {
	return 406056847 * ((Class215) this).anInt2265;
    }
    
    void method2996(int i) {
	((Class215) this).anInt2265 = i * -174960785;
    }
    
    public boolean method2997() {
	return ((Class215) this).aBool2267;
    }
    
    void method2998(boolean bool) {
	((Class215) this).aBool2267 = bool;
    }
    
    void method2999(boolean bool) {
	((Class215) this).aBool2267 = bool;
    }
    
    public int method3000(int i) {
	return 406056847 * ((Class215) this).anInt2265;
    }
    
    public boolean method3001() {
	return ((Class215) this).aBool2263;
    }
    
    public boolean method3002() {
	return ((Class215) this).aBool2267;
    }
    
    void method3003(int i) {
	((Class215) this).anInt2269 = 260906005 * i;
    }
    
    void method3004(int i) {
	((Class215) this).anInt2269 = 260906005 * i;
    }
    
    void method3005(int i) {
	((Class215) this).anInt2269 = 260906005 * i;
    }
    
    public String method3006(byte i) {
	return ((Class215) this).aString2264;
    }
    
    public boolean method3007() {
	return ((Class215) this).aBool2263;
    }
    
    void method3008(Class215 class215_9_, byte i) {
	for (int i_10_ = 0;
	     i_10_ < ((Class215) this).aClass620Array2268.length; i_10_++) {
	    ((Class215) this).aClass620Array2268[i_10_].method7392
		(((Class215) class215_9_).aClass620Array2268[i_10_]
		     .method7390(-1085946275),
		 -1421794528);
	    ((Class215) this).aClass620Array2268[i_10_].method7396
		(((Class215) this).aClass620Array2268[i_10_]
		     .method7393(792424242),
		 (byte) 113);
	}
	((Class215) this).aClass15_2262.method27((byte) 2);
	Iterator iterator = ((Class215) class215_9_).aClass15_2262.iterator();
	while (iterator.hasNext()) {
	    Class411 class411 = (Class411) iterator.next();
	    ((Class215) this).aClass15_2262.method15((class411.anInt4711
						      * 1862601893),
						     class411.anObject4712,
						     467902589);
	}
	((Class215) this).aBool2263 = ((Class215) class215_9_).aBool2263;
    }
    
    public int method3009() {
	return ((Class215) this).anInt2261 * -465166015;
    }
    
    void method3010(Class244 class244, byte i) {
	((Class215) this).aClass244_2258 = class244;
    }
    
    public static void method3011(boolean bool, int i) {
	if (null == Class293.aClass292_3215)
	    Class335_Sub1_Sub2.method10413(691421421);
	if (bool)
	    Class293.aClass292_3215.method3906(1527721536);
    }
    
    static int method3012(int i, byte i_11_) {
	if (16711935 == i)
	    return -1;
	return Class472.method5818(i, (byte) -1);
    }
    
    static final void method3013(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 0;
    }
    
    static final void method3014(Class648 class648, int i) {
	if ((((Class648) class648).anIntArray8394
	     [(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	    == 1)
	    ((Class648) class648).anInt8390
		+= (1888568287
		    * (((Class648) class648).anIntArray8414
		       [((Class648) class648).anInt8390 * -630179809]));
    }
    
    static final void method3015(Class648 class648, int i) {
	int i_12_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (int) (Math.random() * (double) (1 + i_12_));
    }
    
    public static void method3016(String string, boolean bool,
				  boolean bool_13_, int i) {
	Class211.method2961(string, bool, "openjs", bool_13_, 673935647);
    }
}
