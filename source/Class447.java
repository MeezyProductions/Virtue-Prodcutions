/* Class447 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Class447
{
    Class446 aClass446_4945;
    Class446 aClass446_4946;
    Class186 aClass186_4947 = new Class186(64);
    static final int anInt4948 = 32768;
    static final int anInt4949 = 0;
    
    public Class447(Class668 class668, Class446 class446,
		    Class446 class446_0_) {
	((Class447) this).aClass446_4945 = class446;
	((Class447) this).aClass446_4946 = class446_0_;
	if (null != ((Class447) this).aClass446_4945)
	    ((Class447) this).aClass446_4945.method5345(0, 2052365111);
	if (null != ((Class447) this).aClass446_4946)
	    ((Class447) this).aClass446_4946.method5345(0, 2052365111);
    }
    
    public Class528_Sub21_Sub6 method5401(int i, int i_1_) {
	Class528_Sub21_Sub6 class528_sub21_sub6
	    = ((Class528_Sub21_Sub6)
	       ((Class447) this).aClass186_4947.method2727((long) i));
	if (null != class528_sub21_sub6)
	    return class528_sub21_sub6;
	byte[] is;
	if (i >= 32768)
	    is = ((Class447) this).aClass446_4946.method5348(0, i & 0x7fff,
							     -1241024527);
	else
	    is = ((Class447) this).aClass446_4945.method5348(0, i, -624870380);
	class528_sub21_sub6 = new Class528_Sub21_Sub6();
	if (is != null)
	    class528_sub21_sub6.method10493(new ByteBuffer(is), 67609674);
	if (i >= 32768)
	    class528_sub21_sub6.method10488((byte) -111);
	((Class447) this).aClass186_4947.method2729(class528_sub21_sub6,
						    (long) i);
	return class528_sub21_sub6;
    }
    
    static final void method5402(Class648 class648, int i) {
	int i_2_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_2_, (byte) -107);
	Class226 class226 = Class380.aClass226Array3970[i_2_ >> 16];
	Class662.method7882(class229, class226, class648, (byte) 9);
    }
    
    static final void method5403(Class648 class648, byte i) {
	int i_3_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class528_Sub34 class528_sub34
	    = Class656.method7845(OutgoingOpcode.aClass403_4571,
				  client.aClass109_10930.aClass10_1379,
				  -1950055658);
	class528_sub34.aClass528_Sub42_Sub2_10481.method9717(i_3_, (byte) -38);
	client.aClass109_10930.method1380(class528_sub34, 1962807848);
    }
    
    static final void method5404(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_4_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395]);
	int i_5_ = (((Class648) class648).anIntArray8394
		    [1 + ((Class648) class648).anInt8395 * 717927929]);
	int i_6_ = i_5_ >> 14 & 0x3fff;
	int i_7_ = i_5_ & 0x3fff;
	int i_8_ = Class264.method3660(i_4_, i_6_, i_7_, -2019738795);
	if (i_8_ < 0)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -1;
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= i_8_;
    }
    
    static final void method5405(Class648 class648, int i) {
	Class495.aClass283_Sub1_5578.method3762(1604487976);
    }
    
    static final void method5406(Class648 class648, short i) {
	String string = null;
	if (Class490.aClass32_5511 != null)
	    string = Class490.aClass32_5511.method754(38615290);
	if (null == string)
	    string = "";
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = string;
    }
    
    public static void method5407(int i) {
	Class526.method6410(747884784);
	Class626.aClass610_Sub2_8133.method7265((byte) 64);
	Class626.aClass610_Sub1_8134.method7265((byte) 89);
	if (691559213 * client.anInt10906 > 0) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4455,
				      client.aClass109_10930.aClass10_1379,
				      -2044915553);
	    class528_sub34.aClass528_Sub42_Sub2_10481
		.method9717(client.anInt10906 * -1528730444, (byte) -14);
	    for (int i_9_ = 0; i_9_ < client.anInt10906 * 691559213; i_9_++) {
		Interface61 interface61 = client.anInterface61Array10907[i_9_];
		long l = (interface61.method401(742564674)
			  - Class626.aLong8130 * -5857562326796106215L);
		if (l > 16777215L)
		    l = 16777215L;
		Class626.aLong8130 = (interface61.method401(1099074304)
				      * -4060486017398311383L);
		class528_sub34.aClass528_Sub42_Sub2_10481
		    .writeByte(interface61.method384(1860763160), (byte) 21);
		class528_sub34.aClass528_Sub42_Sub2_10481
		    .method9610((int) l, (byte) 28);
	    }
	    client.aClass109_10930.method1380(class528_sub34, 229041115);
	}
	if (-1978495491 * Class626.anInt8131 > 0)
	    Class626.anInt8131 -= 31700821;
	if (client.aBool10982 && -1978495491 * Class626.anInt8131 <= 0) {
	    Class626.anInt8131 = 634016420;
	    client.aBool10982 = false;
	    int i_10_;
	    int i_11_;
	    if (6 == Class390.anInt4111 * -1860881523) {
		if (Class495.aClass283_Sub1_5578.method3787((byte) -114)
		    == Class297.aClass297_3251) {
		    Class326_Sub1 class326_sub1
			= (Class326_Sub1) Class495.aClass283_Sub1_5578
					      .method3811(-262280111);
		    i_10_ = Class588.method7061(class326_sub1.aClass430_10032,
						482779355) >> 3;
		    int i_12_ = 1024;
		    i_11_
			= (3 * i_12_ - (Class471.method5813((class326_sub1
							     .aClass430_10032),
							    -995483933)
					>> 3)) % (i_12_ * 2);
		} else {
		    i_10_ = 0;
		    i_11_ = 0;
		}
	    } else {
		i_10_ = (int) client.aFloat11002 >> 3;
		i_11_ = (int) client.aFloat11088 >> 3;
	    }
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4554,
				      client.aClass109_10930.aClass10_1379,
				      -2144386055);
	    class528_sub34.aClass528_Sub42_Sub2_10481.method9661(i_10_,
								 907613427);
	    class528_sub34.aClass528_Sub42_Sub2_10481.method9660(i_11_,
								 213298109);
	    client.aClass109_10930.method1380(class528_sub34, 1792089828);
	}
	if (Class395.aBool4154 != Class626.aBool8132) {
	    Class626.aBool8132 = Class395.aBool4154;
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4501,
				      client.aClass109_10930.aClass10_1379,
				      -2112354820);
	    class528_sub34.aClass528_Sub42_Sub2_10481
		.writeByte(Class395.aBool4154 ? 1 : 0, (byte) -77);
	    client.aClass109_10930.method1380(class528_sub34, 2120866507);
	}
	if (!client.aBool11161) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4510,
				      client.aClass109_10930.aClass10_1379,
				      -1899228715);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeByte(0, (byte) 23);
	    int i_13_ = (class528_sub34.aClass528_Sub42_Sub2_10481.pointer
			 * -185904669);
	    ByteBuffer class528_sub42
		= Class514.aClass528_Sub38_6967.method9555(-385425134);
	    class528_sub34.aClass528_Sub42_Sub2_10481.method9618
		(class528_sub42.payload, 0,
		 -185904669 * class528_sub42.pointer, 1558600814);
	    class528_sub34.aClass528_Sub42_Sub2_10481.method9662
		(-185904669 * (class528_sub34.aClass528_Sub42_Sub2_10481
			       .pointer) - i_13_,
		 (byte) 87);
	    client.aClass109_10930.method1380(class528_sub34, 914262337);
	    client.aBool11161 = true;
	}
	if (!client.aBool11150
	    && Class514.aClass528_Sub38_6967.aClass691_Sub24_10577
		   .method10014(-1824619963) == 1) {
	    int[] is = Class587.aClass173_7714.method2172();
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4563,
				      client.aClass109_10930.aClass10_1379,
				      -1942588124);
	    class528_sub34.aClass528_Sub42_Sub2_10481.method9717(0, (byte) -3);
	    int i_14_
		= (-185904669
		   * class528_sub34.aClass528_Sub42_Sub2_10481.pointer);
	    if (null != is && 0 != is.length) {
		class528_sub34.aClass528_Sub42_Sub2_10481
		    .writeByte(1, (byte) -90);
		Class118[] class118s = Class118.method1544((byte) 120);
		HashSet hashset = new HashSet();
		ArrayList arraylist = new ArrayList();
		for (int i_15_ = 0; i_15_ < is.length; i_15_++) {
		    boolean bool = false;
		    for (int i_16_ = 0; i_16_ < class118s.length; i_16_++) {
			if (class118s[i_16_].anInt1436 == is[i_15_]) {
			    hashset.add(class118s[i_16_]);
			    bool = true;
			    break;
			}
		    }
		    if (!bool)
			arraylist.add(Integer.valueOf(is[i_15_]));
		}
		Class616.method7370(hashset,
				    class528_sub34.aClass528_Sub42_Sub2_10481,
				    -1057226721);
		class528_sub34.aClass528_Sub42_Sub2_10481
		    .method9621(arraylist.size(), -1900457387);
		if (arraylist.size() > 0) {
		    int i_17_ = 2147483647;
		    Iterator iterator = arraylist.iterator();
		    while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (integer.intValue() < i_17_)
			    i_17_ = integer.intValue();
		    }
		    class528_sub34.aClass528_Sub42_Sub2_10481
			.method9623(i_17_, -563967548);
		    iterator = arraylist.iterator();
		    while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (integer.intValue() != i_17_)
			    class528_sub34.aClass528_Sub42_Sub2_10481
				.method9623
				(integer.intValue() - i_17_, -955965543);
		    }
		}
	    } else
		class528_sub34.aClass528_Sub42_Sub2_10481
		    .writeByte(0, (byte) -25);
	    class528_sub34.aClass528_Sub42_Sub2_10481.method9620
		((class528_sub34.aClass528_Sub42_Sub2_10481.pointer
		  * -185904669) - i_14_,
		 1110957380);
	    client.aClass109_10930.method1380(class528_sub34, 1748544415);
	    client.aBool11150 = true;
	}
    }
    
    static void method5408(Class648 class648, byte i) {
	int i_18_ = (((Class648) class648).anIntArray8394
		     [((Class648) class648).anInt8395 * 717927929 - 3]);
	int i_19_ = (((Class648) class648).anIntArray8394
		     [((Class648) class648).anInt8395 * 717927929 - 2]);
	int i_20_ = (((Class648) class648).anIntArray8394
		     [((Class648) class648).anInt8395 * 717927929 - 1]);
	((Class648) class648).anInt8395 -= -577899301;
	if (i_18_ > ((Class648) class648).anIntArray8402[i_19_])
	    throw new RuntimeException();
	if (i_18_ > ((Class648) class648).anIntArray8402[i_20_])
	    throw new RuntimeException();
	if (i_20_ == i_19_)
	    throw new RuntimeException();
	Class464.method5610(((Class648) class648).anIntArrayArray8393[i_19_],
			    ((Class648) class648).anIntArrayArray8393[i_20_],
			    0, i_18_ - 1, -1518441567);
    }
}
