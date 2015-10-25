/* Class106 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class106 implements Interface19
{
    int[] anIntArray1311;
    int anInt1312;
    int anInt1313;
    protected static int anInt1314;
    static String aString1315;
    
    Class106(int i, int i_0_, int[] is) {
	((Class106) this).anInt1313 = i * 626671711;
	((Class106) this).anInt1312 = i_0_ * -1193873657;
	((Class106) this).anIntArray1311 = is;
    }
    
    public void method115() {
	/* empty */
    }
    
    Class106(int i, int i_1_) {
	this(i, i_1_, new int[i_1_ * i]);
    }
    
    public int method68() {
	return -645837129 * ((Class106) this).anInt1312;
    }
    
    public int method1() {
	return 148380575 * ((Class106) this).anInt1313;
    }
    
    public int method40() {
	return 148380575 * ((Class106) this).anInt1313;
    }
    
    public void method116() {
	/* empty */
    }
    
    public int method5() {
	return 148380575 * ((Class106) this).anInt1313;
    }
    
    public int method72() {
	return -645837129 * ((Class106) this).anInt1312;
    }
    
    public int method71() {
	return -645837129 * ((Class106) this).anInt1312;
    }
    
    public int method73() {
	return -645837129 * ((Class106) this).anInt1312;
    }
    
    public int method6() {
	return 148380575 * ((Class106) this).anInt1313;
    }
    
    static Class1 method1359(int i) {
	Class1 class1;
	if (Class28.aBool257) {
	    if (Class196.aClass172_2199 != null && Class5.aClass1_121 != null)
		class1 = Class5.aClass1_121;
	    else
		class1 = Class392.aClass1_4120;
	} else
	    class1 = Class392.aClass1_4120;
	Class28.anInt260
	    = 207315739 * class1.anInt12 + -906513843 * class1.anInt13;
	return class1;
    }
    
    static void method1360(Class229 class229, Class148 class148, int i,
			   int i_2_, int i_3_, int i_4_, int i_5_,
			   String string, Class172 class172, Class1 class1,
			   int i_6_, int i_7_) {
	int i_8_;
	if (-1860881523 * Class390.anInt4111 == 6)
	    i_8_ = ((int) ((double) Class495.aClass283_Sub1_5578
					.method3792(-16777216)
			   * 2607.5945876176133)
		    + client.anInt10852 * -946910725) & 0x3fff;
	else if (Class390.anInt4111 * -1860881523 == 1)
	    i_8_ = (int) client.aFloat11088 & 0x3fff;
	else
	    i_8_ = (-946910725 * client.anInt10852 + (int) client.aFloat11088
		    & 0x3fff);
	int i_9_ = (Math.max(-1352480433 * class229.anInt2476 / 2,
			     class229.anInt2458 * 1661025435 / 2)
		    + 10);
	int i_10_ = i_4_ * i_4_ + i_3_ * i_3_;
	if (i_10_ <= i_9_ * i_9_) {
	    int i_11_ = Class417.anIntArray4766[i_8_];
	    int i_12_ = Class417.anIntArray4767[i_8_];
	    if (1 != -1860881523 * Class390.anInt4111) {
		i_11_ = 256 * i_11_ / (client.anInt11049 * -1303557179 + 256);
		i_12_ = 256 * i_12_ / (256 + client.anInt11049 * -1303557179);
	    }
	    int i_13_ = i_4_ * i_11_ + i_3_ * i_12_ >> 14;
	    int i_14_ = i_12_ * i_4_ - i_3_ * i_11_ >> 14;
	    int i_15_ = class1.method494(string, 100, null, (short) 11918);
	    int i_16_ = class1.method498(string, 100, 0, null, -1154082923);
	    i_13_ -= i_15_ / 2;
	    if (i_13_ >= -(class229.anInt2476 * -1352480433)
		&& i_13_ <= class229.anInt2476 * -1352480433
		&& i_14_ >= -(class229.anInt2458 * 1661025435)
		&& i_14_ <= 1661025435 * class229.anInt2458)
		class172.method2122(string,
				    (i + i_13_
				     + class229.anInt2476 * -1352480433 / 2),
				    (class229.anInt2458 * 1661025435 / 2 + i_2_
				     - i_14_ - i_5_ - i_16_),
				    i_15_, 50, i_6_, 0, 1, 0, 0, null, null,
				    class148, i, i_2_, -1582967429);
	}
    }
    
    static final void method1361(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 0;
    }
    
    static final void method1362(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class284.anInt3120 * 1742657941;
    }
    
    static final void method1363(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	if (Class494.method5957(string, class648, (short) 520) != null)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2385
	    = Class181_Sub23.method8999(string, class648, (byte) 61);
	class229.aBool2483 = true;
    }
}
