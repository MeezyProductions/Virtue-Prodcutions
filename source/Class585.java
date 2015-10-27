/* Class585 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class585 implements IClientEnum
{
    static Class585 aClass585_7701;
    static Class585 aClass585_7702 = new Class585(0);
    static Class585 aClass585_7703 = new Class585(1);
    int anInt7704;
    
    public int method68() {
	return ((Class585) this).anInt7704 * -1037030893;
    }
    
    static {
	aClass585_7701 = new Class585(2);
    }
    
    public int method5() {
	return ((Class585) this).anInt7704 * -1037030893;
    }
    
    public int method6() {
	return ((Class585) this).anInt7704 * -1037030893;
    }
    
    public int method72() {
	return ((Class585) this).anInt7704 * -1037030893;
    }
    
    Class585(int i) {
	((Class585) this).anInt7704 = -1344786405 * i;
    }
    
    public int method73() {
	return ((Class585) this).anInt7704 * -1037030893;
    }
    
    public int method71() {
	return ((Class585) this).anInt7704 * -1037030893;
    }
    
    public static final int method6998(int i, int i_0_, byte i_1_) {
	if (-2 == i)
	    return 12345678;
	if (-1 == i) {
	    if (i_0_ < 2)
		i_0_ = 2;
	    else if (i_0_ > 126)
		i_0_ = 126;
	    return i_0_;
	}
	i_0_ = i_0_ * (i & 0x7f) >> 7;
	if (i_0_ < 2)
	    i_0_ = 2;
	else if (i_0_ > 126)
	    i_0_ = 126;
	return i_0_ + (i & 0xff80);
    }
    
    static final void method6999(Class648 class648, short i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class526.method6412(class229, class226, class648, -1948963250);
    }
    
    static final void method7000(Class229 class229, Class648 class648, int i) {
	int i_2_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	int i_3_
	    = ((((Class648) class648).anIntArray8394
		[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	       - 1);
	if (292816267 * class229.anInt2418 != 2)
	    throw new RuntimeException("");
	Class299 class299
	    = ((Class299)
	       Class21.aClass5_Sub8_214
		   .method63(-1386163263 * class229.anInt2419, -718422776));
	if (null == class229.aClass287_2479)
	    class229.aClass287_2479 = new Class287(class299, false);
	class229.aClass287_2479.aLong3154
	    = Class598.method7130(-254480100) * 6725947522742831901L;
	if (i_3_ < 0 || i_3_ >= class299.anIntArray3272.length)
	    throw new RuntimeException("");
	class229.aClass287_2479.anIntArray3159[i_3_] = i_2_;
	Class39.method811(class229, 1435904523);
    }
    
    static final void method7001(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class691_Sub32.aClass216_10805.method3026(-2054449011);
    }
    
    static final void method7002(Class648 class648, int i) {
	Class514.aClass528_Sub38_6967.method9556
	    (Class514.aClass528_Sub38_6967.aClass691_Sub23_10606,
	     ((((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	      != 0) ? 1 : 0,
	     1104001504);
	Class243.method3387(2144743295);
	client.gameScene.method5989(2016078152);
    }
}
