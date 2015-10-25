/* Class626 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Class626
{
    static long aLong8130 = 4060486017398311383L;
    static int anInt8131 = 0;
    static boolean aBool8132 = true;
    static Class610_Sub2 aClass610_Sub2_8133 = new Class610_Sub2();
    static Class610_Sub1 aClass610_Sub1_8134 = new Class610_Sub1();
    static Queue aQueue8135 = new LinkedList();
    public static int anInt8136;
    
    public static void method7451() {
	Class399.method4831(-247954101);
    }
    
    public static void method7452() {
	if (Class176.method2569(-789745823))
	    Class498.method6070(new Class625(), -974583400);
    }
    
    Class626() throws Throwable {
	throw new Error();
    }
    
    public static void method7453() {
	if (Class176.method2569(-789745823))
	    Class498.method6070(new Class625(), -501326054);
    }
    
    static void method7454() {
	synchronized (aQueue8135) {
	    Point point;
	    if (Class64.aCanvas754.isShowing())
		point = Class64.aCanvas754.getLocationOnScreen();
	    else
		point = null;
	    for (;;) {
		Class528_Sub33_Sub2 class528_sub33_sub2
		    = (Class528_Sub33_Sub2) aQueue8135.poll();
		if (class528_sub33_sub2 == null)
		    break;
		if (null == point || !Class64.aCanvas754.isShowing()
		    || !Class395.aBool4154)
		    class528_sub33_sub2.method9510((byte) -92);
		else {
		    class528_sub33_sub2.method10603(point, 1755406775);
		    if (!class528_sub33_sub2.method10602(1900160068)
			&& (class528_sub33_sub2.method9494(-1236136691)
			    < Class411.anInt4713 * -1117838587)
			&& (class528_sub33_sub2.method9495((byte) 3)
			    < Class509.anInt6933 * -2142152407)
			&& class528_sub33_sub2.method9494(-1236136691) >= 0
			&& class528_sub33_sub2.method9495((byte) 3) >= 0) {
			int i = class528_sub33_sub2.method9506((byte) -84);
			if (class528_sub33_sub2.method9506((byte) -27) == -1)
			    aClass610_Sub1_8134.method7245(class528_sub33_sub2,
							   -872860961);
			else if (Class321_Sub2.method9081(i, -370967200))
			    aClass610_Sub1_8134.method9730(class528_sub33_sub2,
							   -707974131);
		    }
		}
	    }
	}
    }
    
    static void method7455() {
	synchronized (aQueue8135) {
	    Point point;
	    if (Class64.aCanvas754.isShowing())
		point = Class64.aCanvas754.getLocationOnScreen();
	    else
		point = null;
	    for (;;) {
		Class528_Sub33_Sub2 class528_sub33_sub2
		    = (Class528_Sub33_Sub2) aQueue8135.poll();
		if (class528_sub33_sub2 == null)
		    break;
		if (null == point || !Class64.aCanvas754.isShowing()
		    || !Class395.aBool4154)
		    class528_sub33_sub2.method9510((byte) -103);
		else {
		    class528_sub33_sub2.method10603(point, 1791564175);
		    if (!class528_sub33_sub2.method10602(746756890)
			&& (class528_sub33_sub2.method9494(-1236136691)
			    < Class411.anInt4713 * -1117838587)
			&& (class528_sub33_sub2.method9495((byte) 3)
			    < Class509.anInt6933 * -2142152407)
			&& class528_sub33_sub2.method9494(-1236136691) >= 0
			&& class528_sub33_sub2.method9495((byte) 3) >= 0) {
			int i = class528_sub33_sub2.method9506((byte) -78);
			if (class528_sub33_sub2.method9506((byte) -123) == -1)
			    aClass610_Sub1_8134.method7245(class528_sub33_sub2,
							   -872860961);
			else if (Class321_Sub2.method9081(i, -1721110929))
			    aClass610_Sub1_8134.method9730(class528_sub33_sub2,
							   -1102800148);
		    }
		}
	    }
	}
    }
    
    public static void method7456() {
	synchronized (aQueue8135) {
	    for (;;) {
		Class528_Sub33_Sub2 class528_sub33_sub2
		    = (Class528_Sub33_Sub2) aQueue8135.poll();
		if (null == class528_sub33_sub2)
		    break;
		class528_sub33_sub2.method9510((byte) -12);
	    }
	}
    }
    
    public static void method7457() {
	Class526.method6410(-803773091);
	aClass610_Sub2_8133.method7265((byte) 56);
	aClass610_Sub1_8134.method7265((byte) 31);
	if (691559213 * client.anInt10906 > 0) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4455,
				      client.aClass109_10930.aClass10_1379,
				      -2134675275);
	    class528_sub34.aClass528_Sub42_Sub2_10481
		.method9717(client.anInt10906 * -1528730444, (byte) -4);
	    for (int i = 0; i < client.anInt10906 * 691559213; i++) {
		Interface61 interface61 = client.anInterface61Array10907[i];
		long l = (interface61.method401(-793355573)
			  - aLong8130 * -5857562326796106215L);
		if (l > 16777215L)
		    l = 16777215L;
		aLong8130 = (interface61.method401(-698733056)
			     * -4060486017398311383L);
		class528_sub34.aClass528_Sub42_Sub2_10481
		    .writeByte(interface61.method384(1881096024), (byte) -64);
		class528_sub34.aClass528_Sub42_Sub2_10481
		    .method9610((int) l, (byte) 28);
	    }
	    client.aClass109_10930.method1380(class528_sub34, 1158331189);
	}
	if (-1978495491 * anInt8131 > 0)
	    anInt8131 -= 31700821;
	if (client.aBool10982 && -1978495491 * anInt8131 <= 0) {
	    anInt8131 = 634016420;
	    client.aBool10982 = false;
	    int i;
	    int i_0_;
	    if (6 == Class390.anInt4111 * -1860881523) {
		if (Class495.aClass283_Sub1_5578.method3787((byte) -97)
		    == Class297.aClass297_3251) {
		    Class326_Sub1 class326_sub1
			= (Class326_Sub1) Class495.aClass283_Sub1_5578
					      .method3811(-1457253251);
		    i = Class588.method7061(class326_sub1.aClass430_10032,
					    -252800462) >> 3;
		    int i_1_ = 1024;
		    i_0_ = (3 * i_1_ - (Class471.method5813((class326_sub1
							     .aClass430_10032),
							    -1129177134)
					>> 3)) % (i_1_ * 2);
		} else {
		    i = 0;
		    i_0_ = 0;
		}
	    } else {
		i = (int) client.aFloat11002 >> 3;
		i_0_ = (int) client.aFloat11088 >> 3;
	    }
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4554,
				      client.aClass109_10930.aClass10_1379,
				      -2054882281);
	    class528_sub34.aClass528_Sub42_Sub2_10481.method9661(i,
								 -1201132239);
	    class528_sub34.aClass528_Sub42_Sub2_10481.method9660(i_0_,
								 612628988);
	    client.aClass109_10930.method1380(class528_sub34, 1352673408);
	}
	if (Class395.aBool4154 != aBool8132) {
	    aBool8132 = Class395.aBool4154;
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4501,
				      client.aClass109_10930.aClass10_1379,
				      -2137732648);
	    class528_sub34.aClass528_Sub42_Sub2_10481
		.writeByte(Class395.aBool4154 ? 1 : 0, (byte) 70);
	    client.aClass109_10930.method1380(class528_sub34, 1855035474);
	}
	if (!client.aBool11161) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4510,
				      client.aClass109_10930.aClass10_1379,
				      -1933517882);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeByte(0,
								 (byte) -54);
	    int i = (class528_sub34.aClass528_Sub42_Sub2_10481.pointer
		     * -185904669);
	    ByteBuffer class528_sub42
		= Class514.aClass528_Sub38_6967.method9555(-625184959);
	    class528_sub34.aClass528_Sub42_Sub2_10481.method9618
		(class528_sub42.payload, 0,
		 -185904669 * class528_sub42.pointer, -1070571688);
	    class528_sub34.aClass528_Sub42_Sub2_10481.method9662
		((-185904669
		  * class528_sub34.aClass528_Sub42_Sub2_10481.pointer) - i,
		 (byte) 87);
	    client.aClass109_10930.method1380(class528_sub34, 399259254);
	    client.aBool11161 = true;
	}
	if (!client.aBool11150
	    && Class514.aClass528_Sub38_6967.aClass691_Sub24_10577
		   .method10014(-1824619963) == 1) {
	    int[] is = Class587.aClass173_7714.method2172();
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4563,
				      client.aClass109_10930.aClass10_1379,
				      -2065566976);
	    class528_sub34.aClass528_Sub42_Sub2_10481.method9717(0,
								 (byte) -46);
	    int i = (-185904669
		     * class528_sub34.aClass528_Sub42_Sub2_10481.pointer);
	    if (null != is && 0 != is.length) {
		class528_sub34.aClass528_Sub42_Sub2_10481
		    .writeByte(1, (byte) 28);
		Class118[] class118s = Class118.method1544((byte) 4);
		HashSet hashset = new HashSet();
		ArrayList arraylist = new ArrayList();
		for (int i_2_ = 0; i_2_ < is.length; i_2_++) {
		    boolean bool = false;
		    for (int i_3_ = 0; i_3_ < class118s.length; i_3_++) {
			if (class118s[i_3_].anInt1436 == is[i_2_]) {
			    hashset.add(class118s[i_3_]);
			    bool = true;
			    break;
			}
		    }
		    if (!bool)
			arraylist.add(Integer.valueOf(is[i_2_]));
		}
		Class616.method7370(hashset,
				    class528_sub34.aClass528_Sub42_Sub2_10481,
				    -1528805483);
		class528_sub34.aClass528_Sub42_Sub2_10481
		    .method9621(arraylist.size(), -1900457387);
		if (arraylist.size() > 0) {
		    int i_4_ = 2147483647;
		    Iterator iterator = arraylist.iterator();
		    while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (integer.intValue() < i_4_)
			    i_4_ = integer.intValue();
		    }
		    class528_sub34.aClass528_Sub42_Sub2_10481
			.method9623(i_4_, -1538263952);
		    iterator = arraylist.iterator();
		    while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (integer.intValue() != i_4_)
			    class528_sub34.aClass528_Sub42_Sub2_10481
				.method9623
				(integer.intValue() - i_4_, 209213839);
		    }
		}
	    } else
		class528_sub34.aClass528_Sub42_Sub2_10481
		    .writeByte(0, (byte) -16);
	    class528_sub34.aClass528_Sub42_Sub2_10481.method9620
		((class528_sub34.aClass528_Sub42_Sub2_10481.pointer
		  * -185904669) - i,
		 1979701407);
	    client.aClass109_10930.method1380(class528_sub34, 1688431446);
	    client.aBool11150 = true;
	}
    }
    
    static final void method7458(boolean bool, Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	if (bool)
	    Class57.method989(class226, class229, 1211650902);
	else
	    Class557.method6760(class226, class229, -1745969476);
    }
    
    static final boolean method7459(int[][] is, int[][] is_5_, int i, int i_6_,
				    int i_7_, int i_8_, int i_9_, int i_10_) {
	for (int i_11_ = i_6_; i_11_ <= i_8_; i_11_++) {
	    for (int i_12_ = i_7_; i_12_ <= i_9_; i_12_++) {
		if (i == is[i_11_][i_12_] && is_5_[i_11_][i_12_] <= 1)
		    return true;
	    }
	}
	return false;
    }
    
    static final void method7460(Class648 class648, int i) {
	((Class648) class648).anInt8410 -= 505712897;
	((Class648) class648).anInt8395 -= -1816921966;
	Class42.method828
	    ((String) (((Class648) class648).anObjectArray8396
		       [-520794877 * ((Class648) class648).anInt8410]),
	     (String) (((Class648) class648).anObjectArray8396
		       [-520794877 * ((Class648) class648).anInt8410 + 1]),
	     (((Class648) class648).anIntArray8394
	      [717927929 * ((Class648) class648).anInt8395]),
	     (((Class648) class648).anIntArray8394
	      [717927929 * ((Class648) class648).anInt8395 + 1]) == 1,
	     (String) (((Class648) class648).anObjectArray8396
		       [2 + ((Class648) class648).anInt8410 * -520794877]),
	     -1517612725);
    }
    
    static void method7461(int i, int i_13_, int i_14_) {
	ClientPacket class528_sub21_sub7
	    = Class79.method1146(6, (long) i);
	class528_sub21_sub7.method10496(2123898866);
	((ClientPacket) class528_sub21_sub7).anInt11543
	    = i_13_ * 1959780981;
    }
}
