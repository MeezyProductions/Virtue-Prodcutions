/* Class518_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;

public class Class518_Sub1 extends Class518
{
    static Class703 aClass703_10679;
    static int anInt10680;
    static int anInt10681;
    public static boolean aBool10682;
    static int anInt10683;
    public static int anInt10684;
    public static int anInt10685;
    public static int anInt10686;
    static int anInt10687;
    static HashMap aHashMap10688;
    static int anInt10689;
    static int anInt10690;
    static boolean aBool10691;
    static int anInt10692;
    static Class1[][] aClass1ArrayArray10693;
    static HashMap aHashMap10694;
    static int anInt10695 = 0;
    static int anInt10696;
    static Class172[][] aClass172ArrayArray10697;
    static boolean aBool10698;
    public static boolean aBool10699;
    public static Class692 aClass692_10700;
    public static Class692 aClass692_10701;
    static boolean aBool10702;
    public static boolean aBool10703;
    public static boolean aBool10704;
    static boolean aBool10705;
    static int anInt10706;
    static boolean aBool10707;
    static boolean aBool10708;
    
    public static void method9821(int i) {
	if (25 == i)
	    aFloat6991 = 2.0F;
	else if (i == 37)
	    aFloat6991 = 3.0F;
	else if (i == 50)
	    aFloat6991 = 4.0F;
	else if (75 == i)
	    aFloat6991 = 6.0F;
	else if (i == 100)
	    aFloat6991 = 8.0F;
	else if (i == 200)
	    aFloat6991 = 16.0F;
	anInt10687 = 1998421085;
	anInt10687 = 1998421085;
    }
    
    static void method9822() {
	int i = -1;
	if (aClass528_Sub21_Sub17_7017 != null)
	    i = aClass528_Sub21_Sub17_7017.anInt11644 * 2000200341;
	OutgoingOpcode.method4860(-354695735);
	for (int i_0_ = 0; i_0_ < 3; i_0_++) {
	    for (int i_1_ = 0; i_1_ < 5; i_1_++) {
		aClass172ArrayArray10697[i_0_][i_1_] = null;
		aClass1ArrayArray10693[i_0_][i_1_] = null;
	    }
	}
	aClass528_Sub21_Sub17_7017 = null;
	if (i != -1)
	    Class5.method544(i, -1, -1, false, (byte) -26);
    }
    
    static void method9823() {
	OutgoingOpcode.method4860(-354695735);
	aClass528_Sub21_Sub17_7017 = null;
	Class652.aClass528_Sub21_Sub17_8427 = null;
	aClass692_10700.method8141(2065629842);
	aClass692_10701.method8141(2054384541);
	for (int i = 0; i < 3; i++) {
	    for (int i_2_ = 0; i_2_ < 5; i_2_++) {
		aClass172ArrayArray10697[i][i_2_] = null;
		aClass1ArrayArray10693[i][i_2_] = null;
	    }
	}
    }
    
    static void method9824() {
	OutgoingOpcode.method4860(-354695735);
	aClass528_Sub21_Sub17_7017 = null;
	Class652.aClass528_Sub21_Sub17_8427 = null;
	aClass692_10700.method8141(2053869460);
	aClass692_10701.method8141(2049560210);
	for (int i = 0; i < 3; i++) {
	    for (int i_3_ = 0; i_3_ < 5; i_3_++) {
		aClass172ArrayArray10697[i][i_3_] = null;
		aClass1ArrayArray10693[i][i_3_] = null;
	    }
	}
    }
    
    static {
	anInt10680 = 1332838211;
	anInt10681 = 991599946;
	anInt10706 = 2126529192;
	anInt10686 = 267515143;
	anInt10684 = 370193686;
	anInt10685 = 0;
	anInt10692 = -847541453;
	anInt10687 = 1998421085;
	aBool10702 = false;
	anInt10689 = -505716431;
	anInt10690 = 686985895;
	aBool10691 = false;
	aClass172ArrayArray10697 = new Class172[3][5];
	aClass1ArrayArray10693 = new Class1[3][5];
	aHashMap10694 = new HashMap();
	aHashMap10688 = new HashMap();
	anInt10696 = -1023778831 * anInt10686;
	anInt10683 = anInt10684 * 1398074233;
	aBool10698 = false;
	aBool10699 = false;
	aClass692_10700 = new Class692(8);
	aClass692_10701 = new Class692(8);
	aClass703_10679 = new Class703(new Class688());
	aBool10703 = false;
	aBool10682 = false;
	aBool10704 = false;
	aBool10707 = false;
	aBool10705 = false;
	aBool10708 = false;
    }
    
    static void method9825(int i) {
	int i_4_;
	if (0 == i)
	    i_4_ = 0;
	else if (1 == i)
	    i_4_ = 1;
	else if (i == 2)
	    i_4_ = 2;
	else
	    return;
	int i_5_;
	if ((double) aFloat6991 == 2.0)
	    i_5_ = 0;
	else if (3.0 == (double) aFloat6991)
	    i_5_ = 1;
	else if (4.0 == (double) aFloat6991)
	    i_5_ = 2;
	else if (6.0 == (double) aFloat6991)
	    i_5_ = 3;
	else if ((double) aFloat6991 >= 8.0)
	    i_5_ = 4;
	else
	    return;
	Class211.aClass172_2246 = aClass172ArrayArray10697[i_4_][i_5_];
	Class176.aClass1_2031 = aClass1ArrayArray10693[i_4_][i_5_];
    }
    
    public static int method9826() {
	if (2.0 == (double) aFloat6991)
	    return 25;
	if ((double) aFloat6991 == 3.0)
	    return 37;
	if ((double) aFloat6991 == 4.0)
	    return 50;
	if ((double) aFloat6991 == 6.0)
	    return 75;
	if (8.0 == (double) aFloat6991)
	    return 100;
	return 200;
    }
    
    static void method9827(int i) {
	int i_6_;
	if (0 == i)
	    i_6_ = 0;
	else if (1 == i)
	    i_6_ = 1;
	else if (i == 2)
	    i_6_ = 2;
	else
	    return;
	int i_7_;
	if ((double) aFloat6991 == 2.0)
	    i_7_ = 0;
	else if (3.0 == (double) aFloat6991)
	    i_7_ = 1;
	else if (4.0 == (double) aFloat6991)
	    i_7_ = 2;
	else if (6.0 == (double) aFloat6991)
	    i_7_ = 3;
	else if ((double) aFloat6991 >= 8.0)
	    i_7_ = 4;
	else
	    return;
	Class211.aClass172_2246 = aClass172ArrayArray10697[i_6_][i_7_];
	Class176.aClass1_2031 = aClass1ArrayArray10693[i_6_][i_7_];
    }
    
    public static void method9828() {
	Class634.method7560(true, 1128711134);
    }
    
    public static void method9829() {
	Class634.method7560(true, 1128711134);
    }
    
    public static void method9830() {
	Class634.method7560(true, 1128711134);
    }
    
    public static void method9831(int i) {
	if (25 == i)
	    aFloat6991 = 2.0F;
	else if (i == 37)
	    aFloat6991 = 3.0F;
	else if (i == 50)
	    aFloat6991 = 4.0F;
	else if (75 == i)
	    aFloat6991 = 6.0F;
	else if (i == 100)
	    aFloat6991 = 8.0F;
	else if (i == 200)
	    aFloat6991 = 16.0F;
	anInt10687 = 1998421085;
	anInt10687 = 1998421085;
    }
    
    static void method9832() {
	OutgoingOpcode.method4860(-354695735);
	aClass528_Sub21_Sub17_7017 = null;
	Class652.aClass528_Sub21_Sub17_8427 = null;
	aClass692_10700.method8141(2054136186);
	aClass692_10701.method8141(2089557383);
	for (int i = 0; i < 3; i++) {
	    for (int i_8_ = 0; i_8_ < 5; i_8_++) {
		aClass172ArrayArray10697[i][i_8_] = null;
		aClass1ArrayArray10693[i][i_8_] = null;
	    }
	}
    }
    
    public static void method9833(int i) {
	if (25 == i)
	    aFloat6991 = 2.0F;
	else if (i == 37)
	    aFloat6991 = 3.0F;
	else if (i == 50)
	    aFloat6991 = 4.0F;
	else if (75 == i)
	    aFloat6991 = 6.0F;
	else if (i == 100)
	    aFloat6991 = 8.0F;
	else if (i == 200)
	    aFloat6991 = 16.0F;
	anInt10687 = 1998421085;
	anInt10687 = 1998421085;
    }
    
    Class518_Sub1() throws Throwable {
	throw new Error();
    }
    
    public static int method9834() {
	if (2.0 == (double) aFloat6991)
	    return 25;
	if ((double) aFloat6991 == 3.0)
	    return 37;
	if ((double) aFloat6991 == 4.0)
	    return 50;
	if ((double) aFloat6991 == 6.0)
	    return 75;
	if (8.0 == (double) aFloat6991)
	    return 100;
	return 200;
    }
    
    public static void method9835(int i) {
	if (i < 1)
	    anInt10696 = anInt10686 * -1023778831;
	else
	    anInt10696 = -874965283 * i;
    }
    
    public static void method9836(int i) {
	if (i < 1)
	    anInt10683 = anInt10684 * 1398074233;
	else
	    anInt10683 = i * -573999957;
    }
    
    static void method9837(int i, int i_9_, int i_10_, int i_11_) {
	float f = (float) anInt6997 / (float) anInt6982;
	int i_12_ = i_10_;
	int i_13_ = i_11_;
	if (f < 1.0F)
	    i_13_ = (int) ((float) i_10_ * f);
	else
	    i_12_ = (int) ((float) i_11_ / f);
	i -= (i_10_ - i_12_) / 2;
	i_9_ -= (i_11_ - i_13_) / 2;
	Class200_Sub1.anInt9820 = 7573341 * (i * anInt6982 / i_12_);
	Class98.anInt1256
	    = (anInt6997 - anInt6997 * i_9_ / i_13_) * -1406821639;
	anInt10692 = -847541453;
	anInt10687 = 1998421085;
	Class181_Sub5.method8959(-1111428344);
    }
    
    static void method9838(int i, int i_14_, int i_15_) {
	if (1008 == i)
	    Class504.method6119(Cs2Context.aClass561_7519, i_14_, i_15_,
				925803765);
	else if (1009 == i)
	    Class504.method6119(Cs2Context.aClass561_7514, i_14_, i_15_,
				1264692731);
	else if (1010 == i)
	    Class504.method6119(Cs2Context.aClass561_7517, i_14_, i_15_,
				1519617913);
	else if (1011 == i)
	    Class504.method6119(Cs2Context.aClass561_7516, i_14_, i_15_,
				-1064412064);
	else if (1012 == i)
	    Class504.method6119(Cs2Context.aClass561_7532, i_14_, i_15_,
				-580528554);
    }
    
    static final void method9839(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class326_Sub2.method9111(class229, class226, class648, 1811007374);
    }
}
