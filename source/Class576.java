/* Class576 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class576 implements Interface65
{
    int anInt7598;
    int anInt7599;
    int[] anIntArray7600;
    
    Class576(int i, int i_0_, int[] is) {
	((Class576) this).anInt7599 = i * 1892907985;
	((Class576) this).anInt7598 = i_0_ * 1623521149;
	((Class576) this).anIntArray7600 = is;
    }
    
    public boolean method407(Class528_Sub33 class528_sub33,
			     Interface61[] interface61s, int i,
			     Class544 class544) {
	if (class528_sub33 == null) {
	    if (-430129871 * ((Class576) this).anInt7599 != -1)
		return false;
	} else {
	    if (((Class576) this).anInt7599 * -430129871
		!= class528_sub33.method9506((byte) -48))
		return false;
	    if (((Class576) this).anInt7598 * -2131461675
		> class528_sub33.method9496(165433223))
		return false;
	    int[] is = ((Class576) this).anIntArray7600;
	    for (int i_1_ = 0; i_1_ < is.length; i_1_++) {
		int i_2_ = is[i_1_];
		if (!class544.method6644(i_2_, -317766396))
		    return false;
	    }
	}
	return true;
    }
    
    public boolean method408(Class528_Sub33 class528_sub33,
			     Interface61[] interface61s, int i,
			     Class544 class544, byte i_3_) {
	if (class528_sub33 == null) {
	    if (-430129871 * ((Class576) this).anInt7599 != -1)
		return false;
	} else {
	    if (((Class576) this).anInt7599 * -430129871
		!= class528_sub33.method9506((byte) -100))
		return false;
	    if (((Class576) this).anInt7598 * -2131461675
		> class528_sub33.method9496(165433223))
		return false;
	    int[] is = ((Class576) this).anIntArray7600;
	    for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
		int i_5_ = is[i_4_];
		if (!class544.method6644(i_5_, -952227121))
		    return false;
	    }
	}
	return true;
    }
    
    static final void method6891(Class648 class648, int i) {
	Class528_Sub19 class528_sub19
	    = (Class528_Sub19) (((Class648) class648).anObjectArray8396
				[(((Class648) class648).anInt8410
				  -= 1600226731) * -520794877]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class528_sub19.anInt10390 * 124815955;
    }
    
    static final void method6892(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class12.aClass16_176.anInt192 * 2027542149;
    }
    
    public static void method6893(Class226 class226, Class229 class229,
				  int i) {
	Class229 class229_6_
	    = Class242.method3379(class226, class229, (byte) 10);
	int i_7_;
	int i_8_;
	if (class229_6_ == null) {
	    i_7_ = Class411.anInt4713 * -1117838587;
	    i_8_ = client.anInt6933 * -2142152407;
	} else {
	    i_7_ = -1352480433 * class229_6_.anInt2476;
	    i_8_ = class229_6_.anInt2458 * 1661025435;
	}
	Class200.method2857(class229, i_7_, i_8_, false, 1712849613);
	Class696.method8191(class229, i_7_, i_8_, -2130340110);
    }
    
    public static void method6894(int i, int[] is, int i_9_) {
	if (-1 != i && Class256.method3468(i, is, (byte) 0)) {
	    Class229[] class229s
		= Class380.aClass226Array3970[i].aClass229Array2336;
	    Class502.method6113(class229s, 60896202);
	}
    }
    
    static void method6895(Class229 class229, int i, int i_10_, int i_11_) {
	Class243 class243
	    = class229.method3197(Class587.aClass173_7714, 1057235829);
	if (class243 != null) {
	    Class587.aClass173_7714.method2204
		(i, i_10_, class229.anInt2476 * -1352480433 + i,
		 1661025435 * class229.anInt2458 + i_10_);
	    if (1886713181 * Class98.anInt1252 < 3) {
		int i_12_;
		if (-1860881523 * Class390.anInt4111 == 6)
		    i_12_ = (int) -((double) Class495.aClass283_Sub1_5578
						 .method3792(-16777216)
				    * 2607.5945876176133);
		else
		    i_12_ = (int) -client.aFloat11088;
		i_12_ = i_12_ + client.anInt10852 * -1893821450 & 0x3fff;
		i_12_ <<= 2;
		Class82.aClass151_817.method1794
		    (((float) i
		      + (float) (-1352480433 * class229.anInt2476) / 2.0F),
		     ((float) (class229.anInt2458 * 1661025435) / 2.0F
		      + (float) i_10_),
		     4170, i_12_, class243.aClass148_2724, i, i_10_);
	    } else
		Class587.aClass173_7714
		    .method2239(-16777216, class243.aClass148_2724, i, i_10_);
	}
    }
}
