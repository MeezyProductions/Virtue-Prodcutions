/* Class63 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class63
{
    public static Class63 aClass63_723;
    public static Class63 aClass63_724;
    public static Class63 aClass63_725 = new Class63(Class36.aClass36_332);
    public static Class63 aClass63_726;
    public static Class63 aClass63_727;
    public static Class63 aClass63_728;
    public static Class63 aClass63_729;
    int anInt730;
    public static Class63 aClass63_731;
    public static Class63 aClass63_732;
    public static Class63 aClass63_733;
    public static Class63 aClass63_734;
    public static Class63 aClass63_735;
    public static Class63 aClass63_736;
    public static Class63 aClass63_737;
    public static Class63 aClass63_738;
    public static Class63 aClass63_739;
    public static Class63 aClass63_740;
    public static Class63 aClass63_741;
    public static Class63 aClass63_742;
    public static Class63 aClass63_743;
    public static Class63 aClass63_744;
    public static Class63 aClass63_745;
    public static Class63 aClass63_746;
    public static Class63 aClass63_747;
    Class36 aClass36_748;
    public static Class63 aClass63_749;
    Interface7 anInterface7_750;
    
    Class63(Class36 class36) {
	((Class63) this).aClass36_748 = class36;
	((Class63) this).anInt730 = 92821681;
    }
    
    public int method1025(int i) {
	return 93778001 * ((Class63) this).anInt730;
    }
    
    public int method1026() {
	return 93778001 * ((Class63) this).anInt730;
    }
    
    public Interface7 method1027(int i) {
	return ((Class63) this).anInterface7_750;
    }
    
    public void method1028(Interface7 interface7, byte i) {
	if (interface7.method56(-1909774239) != ((Class63) this).aClass36_748)
	    throw new IllegalArgumentException();
	((Class63) this).anInterface7_750 = interface7;
    }
    
    static {
	aClass63_724 = new Class63(Class36.aClass36_334);
	aClass63_723 = new Class63(Class36.aClass36_334);
	aClass63_726 = new Class63(Class36.aClass36_334);
	aClass63_727 = new Class63(Class36.aClass36_334);
	aClass63_728 = new Class63(Class36.aClass36_334);
	aClass63_743 = new Class63(Class36.aClass36_332);
	aClass63_746 = new Class63(Class36.aClass36_332);
	aClass63_731 = new Class63(Class36.aClass36_332);
	aClass63_749 = new Class63(Class36.aClass36_332);
	aClass63_733 = new Class63(Class36.aClass36_332);
	aClass63_729 = new Class63(Class36.aClass36_332);
	aClass63_735 = new Class63(Class36.aClass36_332);
	aClass63_734 = new Class63(Class36.aClass36_332);
	aClass63_737 = new Class63(Class36.aClass36_332);
	aClass63_738 = new Class63(Class36.aClass36_332);
	aClass63_739 = new Class63(Class36.aClass36_332);
	aClass63_740 = new Class63(Class36.aClass36_332);
	aClass63_741 = new Class63(Class36.aClass36_332);
	aClass63_742 = new Class63(Class36.aClass36_332);
	aClass63_744 = new Class63(Class36.aClass36_333);
	aClass63_736 = new Class63(Class36.aClass36_332);
	aClass63_745 = new Class63(Class36.aClass36_332);
	aClass63_732 = new Class63(Class36.aClass36_332);
	aClass63_747 = new Class63(Class36.aClass36_331);
    }
    
    static void method1029(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= 661123364;
	int i_0_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395]);
	int i_1_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929 + 1]);
	int i_2_ = (((Class648) class648).anIntArray8394
		    [2 + 717927929 * ((Class648) class648).anInt8395]);
	int i_3_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929 + 3]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class549.method6684(i_0_, i_1_, i_2_, 0 != i_3_, 1916690782);
    }
    
    public static Class63[] method1030(int i) {
	return (new Class63[]
		{ aClass63_725, aClass63_724, aClass63_723, aClass63_726,
		  aClass63_727, aClass63_728, aClass63_743, aClass63_746,
		  aClass63_731, aClass63_749, aClass63_733, aClass63_729,
		  aClass63_735, aClass63_734, aClass63_737, aClass63_738,
		  aClass63_739, aClass63_740, aClass63_741, aClass63_742,
		  aClass63_744, aClass63_736, aClass63_745, aClass63_732,
		  aClass63_747 });
    }
    
    public void method1031(int i) {
	((Class63) this).anInt730 = i * 92821681;
    }
    
    public void method1032(int i, int i_4_) {
	((Class63) this).anInt730 = i * 92821681;
    }
    
    public void method1033(int i) {
	((Class63) this).anInt730 = i * 92821681;
    }
    
    public static void method1034(float[] fs, int[] is, int i, int i_5_,
				  byte i_6_) {
	if (i < i_5_) {
	    int i_7_ = (i_5_ + i) / 2;
	    int i_8_ = i;
	    float f = fs[i_7_];
	    fs[i_7_] = fs[i_5_];
	    fs[i_5_] = f;
	    int i_9_ = is[i_7_];
	    is[i_7_] = is[i_5_];
	    is[i_5_] = i_9_;
	    for (int i_10_ = i; i_10_ < i_5_; i_10_++) {
		if (fs[i_10_] > f) {
		    float f_11_ = fs[i_10_];
		    fs[i_10_] = fs[i_8_];
		    fs[i_8_] = f_11_;
		    int i_12_ = is[i_10_];
		    is[i_10_] = is[i_8_];
		    is[i_8_++] = i_12_;
		}
	    }
	    fs[i_5_] = fs[i_8_];
	    fs[i_8_] = f;
	    is[i_5_] = is[i_8_];
	    is[i_8_] = i_9_;
	    method1034(fs, is, i, i_8_ - 1, (byte) 50);
	    method1034(fs, is, i_8_ + 1, i_5_, (byte) 35);
	}
    }
    
    static final void method1035(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class693.aByte8696;
    }
    
    public int method1036() {
	return 93778001 * ((Class63) this).anInt730;
    }
    
    static final void method1037(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class654.method7837(class229, class226, class648, 1199329933);
    }
    
    public void method1038(int i) {
	((Class63) this).anInt730 = i * 92821681;
    }
    
    static final void method1039(Class648 class648, int i)
	throws Exception_Sub4 {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_13_ = (((Class648) class648).anIntArray8394
		     [((Class648) class648).anInt8395 * 717927929]);
	int i_14_ = (((Class648) class648).anIntArray8394
		     [1 + 717927929 * ((Class648) class648).anInt8395]);
	Class495.aClass283_Sub1_5578.method3775((float) i_13_, (float) i_14_,
						(byte) -121);
    }
    
    static char method1040(char c, int i) {
	switch (c) {
	case '\u00c0':
	case '\u00c1':
	case '\u00c2':
	case '\u00c3':
	case '\u00c4':
	case '\u00e0':
	case '\u00e1':
	case '\u00e2':
	case '\u00e3':
	case '\u00e4':
	    return 'a';
	case '\u00c7':
	case '\u00e7':
	    return 'c';
	case '\u00cd':
	case '\u00ce':
	case '\u00cf':
	case '\u00ed':
	case '\u00ee':
	case '\u00ef':
	    return 'i';
	default:
	    return Character.toLowerCase(c);
	case '\u00d2':
	case '\u00d3':
	case '\u00d4':
	case '\u00d5':
	case '\u00d6':
	case '\u00f2':
	case '\u00f3':
	case '\u00f4':
	case '\u00f5':
	case '\u00f6':
	    return 'o';
	case '\u00ff':
	case '\u0178':
	    return 'y';
	case ' ':
	case '-':
	case '_':
	case '\u00a0':
	    return '_';
	case '\u00df':
	    return 'b';
	case '\u00d1':
	case '\u00f1':
	    return 'n';
	case '\u00d9':
	case '\u00da':
	case '\u00db':
	case '\u00dc':
	case '\u00f9':
	case '\u00fa':
	case '\u00fb':
	case '\u00fc':
	    return 'u';
	case '#':
	case '[':
	case ']':
	    return c;
	case '\u00c8':
	case '\u00c9':
	case '\u00ca':
	case '\u00cb':
	case '\u00e8':
	case '\u00e9':
	case '\u00ea':
	case '\u00eb':
	    return 'e';
	}
    }
    
    static final void method1041(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	Class275.method3707((((Class648) class648).anIntArray8394
			     [((Class648) class648).anInt8395 * 717927929]),
			    (((Class648) class648).anIntArray8394
			     [(717927929 * ((Class648) class648).anInt8395
			       + 1)]),
			    0, -2055305365);
    }
    
    public static void method1042(int i, byte i_15_) {
	Class570.anInt7558 = -1961313985 * i;
	synchronized (PlayerModel.aClass186_7971) {
	    PlayerModel.aClass186_7971.method2731(-994829772);
	}
	synchronized (PlayerModel.aClass186_7972) {
	    PlayerModel.aClass186_7972.method2731(-1521745768);
	}
    }
}
