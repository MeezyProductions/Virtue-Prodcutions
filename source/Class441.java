/* Class441 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class441
{
    public static Class441 aClass441_4899 = new Class441(1);
    static Class441 aClass441_4900 = new Class441(0);
    int anInt4901;
    static String aString4902;
    public static Class446 aClass446_4903;
    
    Class441(int i) {
	((Class441) this).anInt4901 = 694941 * i;
    }
    
    static final void method5305(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_0_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395]);
	int i_1_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929 + 1]);
	Class646 class646;
	if (((Class648) class648).aBool8418)
	    class646 = ((Class648) class648).aClass646_8406;
	else
	    class646 = ((Class648) class648).aClass646_8392;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = -1 != i_1_ && class646.method7701(i_0_, i_1_, (byte) 0) ? 1 : 0;
    }
    
    static final void method5306(Class648 class648, byte i) {
	int i_2_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	Class214.method2973(i_2_, string, -1011246579);
    }
    
    static final void method5307(Class648 class648, int i) {
	Class181_Sub18.anInt9847 = 0;
    }
    
    static void method5308
	(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_,
	 Class528_Sub21_Sub11 class528_sub21_sub11, Class172 class172,
	 Class1 class1, int i_9_, int i_10_, int i_11_) {
	if (i > i_4_ && i < i_4_ + i_6_
	    && i_3_ > i_8_ - class1.anInt12 * -55898191 - 1
	    && i_3_ < i_8_ + -46594681 * class1.anInt13
	    && ((Class528_Sub21_Sub11) class528_sub21_sub11).aBool11591)
	    i_9_ = i_10_;
	int[] is = Class62.method1022(class528_sub21_sub11, (byte) 83);
	String string
	    = Class511_Sub6.method9344(class528_sub21_sub11, (byte) -6);
	if (is != null)
	    string = new StringBuilder().append(string).append
			 (Class262.method3645(is, (byte) 52)).toString();
	class172.method2126(string, 3 + i_4_, i_8_, i_9_, 0,
			    client.aRandom10970, Class464.anInt5305,
			    Class298.aClass151Array3262, null, 861968508);
	if (((Class528_Sub21_Sub11) class528_sub21_sub11).aBool11592)
	    Class27.aClass151_256.method1773
		(5 + i_4_ + class1.method504(string,
					     Class298.aClass151Array3262,
					     (byte) 119),
		 i_8_ - class1.anInt12 * -55898191);
    }
}
