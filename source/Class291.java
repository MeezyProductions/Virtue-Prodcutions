/* Class291 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class291 implements Interface28
{
    Class83 aClass83_3193;
    static Class186 aClass186_3194;
    static byte[] aByteArray3195
	= { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6,
	    14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17,
	    94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41,
	    25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3,
	    67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112,
	    33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70,
	    -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24,
	    89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31,
	    97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97,
	    101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56,
	    -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51,
	    -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24,
	    53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42,
	    -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22,
	    26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110,
	    -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41,
	    -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85,
	    -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109,
	    -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87,
	    109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56,
	    -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82,
	    -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27,
	    -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2,
	    98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123,
	    -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86,
	    69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17,
	    -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116,
	    -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50,
	    99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2,
	    -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49,
	    127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };
    Interface31[] anInterface31Array3196;
    int anInt3197;
    int anInt3198;
    Class173 aClass173_3199;
    boolean aBool3200;
    
    static boolean method3895() {
	boolean bool;
	try {
	    Class78 class78 = new Class78();
	    byte[] is = class78.method1134(aByteArray3195, 826047404);
	    Class40.method816(is, -1968057157);
	    bool = true;
	} catch (Exception exception) {
	    return false;
	}
	return bool;
    }
    
    public void method147(int i) {
	if (((Class291) this).aClass173_3199 != Class587.aClass173_7714) {
	    ((Class291) this).aClass173_3199 = Class587.aClass173_7714;
	    ((Class291) this).aBool3200 = true;
	}
	((Class291) this).aClass173_3199.method2268(3, 0);
	Interface31[] interface31s = ((Class291) this).anInterface31Array3196;
	for (int i_0_ = 0; i_0_ < interface31s.length; i_0_++) {
	    Interface31 interface31 = interface31s[i_0_];
	    if (null != interface31)
		interface31.method187((short) -27811);
	}
    }
    
    Class291(Class83 class83, int i, int i_1_, Class325 class325) {
	((Class291) this).aClass83_3193 = class83;
	((Class291) this).anInt3197 = i * 750203391;
	((Class291) this).anInt3198 = 2115670921 * i_1_;
	((Class291) this).anInterface31Array3196
	    = (new Interface31
	       [((Class291) this).aClass83_3193.anInterface47Array820.length]);
	for (int i_2_ = 0;
	     i_2_ < ((Class291) this).anInterface31Array3196.length; i_2_++)
	    ((Class291) this).anInterface31Array3196[i_2_]
		= class325.method4230((((Class291) this).aClass83_3193
				       .anInterface47Array820[i_2_]),
				      (byte) -7);
    }
    
    public int method162(int i) {
	int i_3_ = 0;
	Interface31[] interface31s = ((Class291) this).anInterface31Array3196;
	for (int i_4_ = 0; i_4_ < interface31s.length; i_4_++) {
	    Interface31 interface31 = interface31s[i_4_];
	    if (interface31 == null || interface31.method186(-948151771))
		i_3_++;
	}
	return i_3_ * 100 / ((Class291) this).anInterface31Array3196.length;
    }
    
    public boolean method150(long l) {
	return (Class249.method3417(2059810248)
		>= (long) (((Class291) this).anInt3197 * 92589567) + l);
    }
    
    public void method153(boolean bool) {
	bool = true;
	Interface31[] interface31s = ((Class291) this).anInterface31Array3196;
	for (int i = 0; i < interface31s.length; i++) {
	    Interface31 interface31 = interface31s[i];
	    if (interface31 != null)
		interface31.method190(bool || ((Class291) this).aBool3200,
				      (byte) -72);
	}
	((Class291) this).aBool3200 = false;
    }
    
    public int method160(int i) {
	return 1901974201 * ((Class291) this).anInt3198;
    }
    
    static {
	aClass186_3194 = new Class186(128, 4);
    }
    
    public void method152(boolean bool) {
	bool = true;
	Interface31[] interface31s = ((Class291) this).anInterface31Array3196;
	for (int i = 0; i < interface31s.length; i++) {
	    Interface31 interface31 = interface31s[i];
	    if (interface31 != null)
		interface31.method190(bool || ((Class291) this).aBool3200,
				      (byte) -5);
	}
	((Class291) this).aBool3200 = false;
    }
    
    public void method159() {
	/* empty */
    }
    
    public void method146(boolean bool, int i) {
	bool = true;
	Interface31[] interface31s = ((Class291) this).anInterface31Array3196;
	for (int i_5_ = 0; i_5_ < interface31s.length; i_5_++) {
	    Interface31 interface31 = interface31s[i_5_];
	    if (interface31 != null)
		interface31.method190(bool || ((Class291) this).aBool3200,
				      (byte) -119);
	}
	((Class291) this).aBool3200 = false;
    }
    
    public void method156() {
	/* empty */
    }
    
    public boolean method158(long l) {
	return (Class249.method3417(2058870532)
		>= (long) (((Class291) this).anInt3197 * 92589567) + l);
    }
    
    public int method161() {
	return 1901974201 * ((Class291) this).anInt3198;
    }
    
    static void method3896() {
	aClass186_3194.method2731(-1822663249);
    }
    
    public int method151() {
	return 1901974201 * ((Class291) this).anInt3198;
    }
    
    public int method155() {
	return 1901974201 * ((Class291) this).anInt3198;
    }
    
    static void method3897() {
	aClass186_3194.method2731(-845496693);
    }
    
    static void method3898() {
	aClass186_3194.method2731(-1107878724);
    }
    
    public int method148() {
	int i = 0;
	Interface31[] interface31s = ((Class291) this).anInterface31Array3196;
	for (int i_6_ = 0; i_6_ < interface31s.length; i_6_++) {
	    Interface31 interface31 = interface31s[i_6_];
	    if (interface31 == null || interface31.method186(-2083331604))
		i++;
	}
	return i * 100 / ((Class291) this).anInterface31Array3196.length;
    }
    
    public void method149() {
	if (((Class291) this).aClass173_3199 != Class587.aClass173_7714) {
	    ((Class291) this).aClass173_3199 = Class587.aClass173_7714;
	    ((Class291) this).aBool3200 = true;
	}
	((Class291) this).aClass173_3199.method2268(3, 0);
	Interface31[] interface31s = ((Class291) this).anInterface31Array3196;
	for (int i = 0; i < interface31s.length; i++) {
	    Interface31 interface31 = interface31s[i];
	    if (null != interface31)
		interface31.method187((short) -16968);
	}
    }
    
    public void method163() {
	if (((Class291) this).aClass173_3199 != Class587.aClass173_7714) {
	    ((Class291) this).aClass173_3199 = Class587.aClass173_7714;
	    ((Class291) this).aBool3200 = true;
	}
	((Class291) this).aClass173_3199.method2268(3, 0);
	Interface31[] interface31s = ((Class291) this).anInterface31Array3196;
	for (int i = 0; i < interface31s.length; i++) {
	    Interface31 interface31 = interface31s[i];
	    if (null != interface31)
		interface31.method187((short) -3705);
	}
    }
    
    public void method154(int i) {
	/* empty */
    }
    
    static boolean method3899() {
	boolean bool;
	try {
	    Class78 class78 = new Class78();
	    byte[] is = class78.method1134(aByteArray3195, 940272548);
	    Class40.method816(is, -1162743469);
	    bool = true;
	} catch (Exception exception) {
	    return false;
	}
	return bool;
    }
    
    public boolean method157(long l) {
	return (Class249.method3417(2012912108)
		>= (long) (((Class291) this).anInt3197 * 92589567) + l);
    }
    
    static final int method3900(int i, int i_7_, int i_8_) {
	int i_9_ = (Class274.method3699(i - 1, i_7_ - 1, (byte) 103)
		    + Class274.method3699(i + 1, i_7_ - 1, (byte) 87)
		    + Class274.method3699(i - 1, 1 + i_7_, (byte) 42)
		    + Class274.method3699(i + 1, i_7_ + 1, (byte) -19));
	int i_10_ = (Class274.method3699(i - 1, i_7_, (byte) 59)
		     + Class274.method3699(i + 1, i_7_, (byte) -80)
		     + Class274.method3699(i, i_7_ - 1, (byte) -121)
		     + Class274.method3699(i, i_7_ + 1, (byte) 118));
	int i_11_ = Class274.method3699(i, i_7_, (byte) -15);
	return i_9_ / 16 + i_10_ / 8 + i_11_ / 4;
    }
    
    static final void method3901(Class648 class648, int i) {
	((Class648) class648).anInt8399 -= 464011950;
	if ((((Class648) class648).aLongArray8398
	     [((Class648) class648).anInt8399 * 683825767])
	    == (((Class648) class648).aLongArray8398
		[((Class648) class648).anInt8399 * 683825767 + 1]))
	    ((Class648) class648).anInt8390
		+= (1888568287
		    * (((Class648) class648).anIntArray8414
		       [-630179809 * ((Class648) class648).anInt8390]));
    }
    
    static final void method3902(Class648 class648, int i) {
	int i_12_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (client.aClass217_11028.method3071(i_12_, -1784488908).anInt2224
	       * -1891422719);
    }
    
    static final void method3903(Class648 class648, int i) {
	int i_13_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_13_, (byte) 76);
	Class226 class226 = Class380.aClass226Array3970[i_13_ >> 16];
	Class528_Sub20.method9427(class229, class226, class648, -195827949);
    }
}
