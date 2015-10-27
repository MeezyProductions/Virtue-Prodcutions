/* Class534 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class534
{
    static final int anInt7134 = 63;
    static final int anInt7135 = 2;
    static final int anInt7136 = 8;
    static final int anInt7137 = 16;
    static final int anInt7138 = 62;
    static final int anInt7139 = 1;
    
    Class534() throws Throwable {
	throw new Error();
    }
    
    static final void method6491(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class229.anInt2426 * -1036451571;
    }
    
    static final void method6492(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= 661123364;
	int i_0_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395]);
	int i_1_ = (((Class648) class648).anIntArray8394
		    [1 + ((Class648) class648).anInt8395 * 717927929]);
	int i_2_ = (((Class648) class648).anIntArray8394
		    [2 + ((Class648) class648).anInt8395 * 717927929]);
	int i_3_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395 + 3]);
	int i_4_ = 256;
	Class365.aClass218_3848.method3104(Class196.aClass196_2192, i_0_, i_1_,
					   i_3_,
					   Class188.aClass188_2130
					       .method2758(-1560776500),
					   Class202.aClass202_2211, 0.0F, 0.0F,
					   null, 0, i_4_, i_2_, -824363279);
    }
    
    static final void method6493(int i) {
	Iterator iterator = client.aClass692_11044.iterator();
	while (iterator.hasNext()) {
	    Class528_Sub21_Sub19 class528_sub21_sub19
		= (Class528_Sub21_Sub19) iterator.next();
	    Class645_Sub1_Sub5_Sub4 class645_sub1_sub5_sub4
		= (((Class528_Sub21_Sub19) class528_sub21_sub19)
		   .aClass645_Sub1_Sub5_Sub4_11688);
	    if (client.gameScene.method5973((byte) 70) != null
		&& class645_sub1_sub5_sub4.method10859(-1864395182))
		client.gameScene.method5973((byte) 81)
		    .method6545(class645_sub1_sub5_sub4, true, 1358217920);
	}
    }
}
