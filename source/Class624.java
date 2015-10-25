/* Class624 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class624
{
    public static final int anInt8120 = 1;
    public int[] anIntArray8121;
    static final int anInt8122 = 2;
    public int[] disabledSlots;
    public static final int anInt8124 = 0;
    public int anInt8125;
    public int[] anIntArray8126;
    public int anInt8127 = 872148793;
    public static Class449 aClass449_8128;
    
    void method7436(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 24);
	    if (i == 0)
		break;
	    if (i == 1) {
		int i_0_ = class528_sub42.readUnsignedByte((byte) 17);
		disabledSlots = new int[i_0_];
		for (int i_1_ = 0; i_1_ < disabledSlots.length; i_1_++) {
		    disabledSlots[i_1_]
			= class528_sub42.readUnsignedByte((byte) 64);
		    if (0 != disabledSlots[i_1_]
			&& 2 != disabledSlots[i_1_]) {
			/* empty */
		    }
		}
	    } else if (3 == i)
		anInt8127 = class528_sub42.readUnsignedByte((byte) 38) * -872148793;
	    else if (4 == i)
		anInt8125
		    = class528_sub42.readUnsignedByte((byte) 106) * -1315805263;
	    else if (i == 5) {
		anIntArray8126 = new int[class528_sub42.readUnsignedByte((byte) 38)];
		for (int i_2_ = 0; i_2_ < anIntArray8126.length; i_2_++)
		    anIntArray8126[i_2_]
			= class528_sub42.readUnsignedByte((byte) 43);
	    } else if (i == 6) {
		anIntArray8121
		    = new int[class528_sub42.readUnsignedByte((byte) 106)];
		for (int i_3_ = 0; i_3_ < anIntArray8121.length; i_3_++)
		    anIntArray8121[i_3_]
			= class528_sub42.readUnsignedByte((byte) 96);
	    }
	}
	if (disabledSlots == null)
	    throw new RuntimeException("");
    }
    
    void method7437(ByteBuffer class528_sub42, byte i) {
	for (;;) {
	    int i_4_ = class528_sub42.readUnsignedByte((byte) 120);
	    if (i_4_ == 0)
		break;
	    if (i_4_ == 1) {
		int i_5_ = class528_sub42.readUnsignedByte((byte) 46);
		disabledSlots = new int[i_5_];
		for (int i_6_ = 0; i_6_ < disabledSlots.length; i_6_++) {
		    disabledSlots[i_6_]
			= class528_sub42.readUnsignedByte((byte) 60);
		    if (0 != disabledSlots[i_6_]
			&& 2 != disabledSlots[i_6_]) {
			/* empty */
		    }
		}
	    } else if (3 == i_4_)
		anInt8127 = class528_sub42.readUnsignedByte((byte) 1) * -872148793;
	    else if (4 == i_4_)
		anInt8125 = class528_sub42.readUnsignedByte((byte) 56) * -1315805263;
	    else if (i_4_ == 5) {
		anIntArray8126 = new int[class528_sub42.readUnsignedByte((byte) 56)];
		for (int i_7_ = 0; i_7_ < anIntArray8126.length; i_7_++)
		    anIntArray8126[i_7_]
			= class528_sub42.readUnsignedByte((byte) 120);
	    } else if (i_4_ == 6) {
		anIntArray8121 = new int[class528_sub42.readUnsignedByte((byte) 88)];
		for (int i_8_ = 0; i_8_ < anIntArray8121.length; i_8_++)
		    anIntArray8121[i_8_]
			= class528_sub42.readUnsignedByte((byte) 100);
	    }
	}
	if (disabledSlots == null)
	    throw new RuntimeException("");
    }
    
    void method7438(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 46);
	    if (i == 0)
		break;
	    if (i == 1) {
		int i_9_ = class528_sub42.readUnsignedByte((byte) 9);
		disabledSlots = new int[i_9_];
		for (int i_10_ = 0; i_10_ < disabledSlots.length; i_10_++) {
		    disabledSlots[i_10_]
			= class528_sub42.readUnsignedByte((byte) 122);
		    if (0 != disabledSlots[i_10_]
			&& 2 != disabledSlots[i_10_]) {
			/* empty */
		    }
		}
	    } else if (3 == i)
		anInt8127 = class528_sub42.readUnsignedByte((byte) 15) * -872148793;
	    else if (4 == i)
		anInt8125 = class528_sub42.readUnsignedByte((byte) 1) * -1315805263;
	    else if (i == 5) {
		anIntArray8126 = new int[class528_sub42.readUnsignedByte((byte) 26)];
		for (int i_11_ = 0; i_11_ < anIntArray8126.length; i_11_++)
		    anIntArray8126[i_11_]
			= class528_sub42.readUnsignedByte((byte) 107);
	    } else if (i == 6) {
		anIntArray8121 = new int[class528_sub42.readUnsignedByte((byte) 10)];
		for (int i_12_ = 0; i_12_ < anIntArray8121.length; i_12_++)
		    anIntArray8121[i_12_]
			= class528_sub42.readUnsignedByte((byte) 90);
	    }
	}
	if (disabledSlots == null)
	    throw new RuntimeException("");
    }
    
    public Class624(Class446 class446) {
	anInt8125 = 1315805263;
	byte[] is = class446.method5395((Class606.aClass606_7922.anInt7921
					 * -2082684943),
					-1247596054);
	method7437(new ByteBuffer(is), (byte) -6);
    }
    
    void method7439(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 126);
	    if (i == 0)
		break;
	    if (i == 1) {
		int i_13_ = class528_sub42.readUnsignedByte((byte) 56);
		disabledSlots = new int[i_13_];
		for (int i_14_ = 0; i_14_ < disabledSlots.length; i_14_++) {
		    disabledSlots[i_14_]
			= class528_sub42.readUnsignedByte((byte) 63);
		    if (0 != disabledSlots[i_14_]
			&& 2 != disabledSlots[i_14_]) {
			/* empty */
		    }
		}
	    } else if (3 == i)
		anInt8127 = class528_sub42.readUnsignedByte((byte) 51) * -872148793;
	    else if (4 == i)
		anInt8125
		    = class528_sub42.readUnsignedByte((byte) 115) * -1315805263;
	    else if (i == 5) {
		anIntArray8126 = new int[class528_sub42.readUnsignedByte((byte) 72)];
		for (int i_15_ = 0; i_15_ < anIntArray8126.length; i_15_++)
		    anIntArray8126[i_15_]
			= class528_sub42.readUnsignedByte((byte) 96);
	    } else if (i == 6) {
		anIntArray8121 = new int[class528_sub42.readUnsignedByte((byte) 24)];
		for (int i_16_ = 0; i_16_ < anIntArray8121.length; i_16_++)
		    anIntArray8121[i_16_]
			= class528_sub42.readUnsignedByte((byte) 111);
	    }
	}
	if (disabledSlots == null)
	    throw new RuntimeException("");
    }
    
    void method7440(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 91);
	    if (i == 0)
		break;
	    if (i == 1) {
		int i_17_ = class528_sub42.readUnsignedByte((byte) 100);
		disabledSlots = new int[i_17_];
		for (int i_18_ = 0; i_18_ < disabledSlots.length; i_18_++) {
		    disabledSlots[i_18_]
			= class528_sub42.readUnsignedByte((byte) 23);
		    if (0 != disabledSlots[i_18_]
			&& 2 != disabledSlots[i_18_]) {
			/* empty */
		    }
		}
	    } else if (3 == i)
		anInt8127 = class528_sub42.readUnsignedByte((byte) 7) * -872148793;
	    else if (4 == i)
		anInt8125 = class528_sub42.readUnsignedByte((byte) 31) * -1315805263;
	    else if (i == 5) {
		anIntArray8126 = new int[class528_sub42.readUnsignedByte((byte) 15)];
		for (int i_19_ = 0; i_19_ < anIntArray8126.length; i_19_++)
		    anIntArray8126[i_19_]
			= class528_sub42.readUnsignedByte((byte) 24);
	    } else if (i == 6) {
		anIntArray8121 = new int[class528_sub42.readUnsignedByte((byte) 81)];
		for (int i_20_ = 0; i_20_ < anIntArray8121.length; i_20_++)
		    anIntArray8121[i_20_]
			= class528_sub42.readUnsignedByte((byte) 105);
	    }
	}
	if (disabledSlots == null)
	    throw new RuntimeException("");
    }
    
    static void method7441(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [717927929 * ((Class648) class648).anInt8395 - 1]
	    = ((Class256)
	       (Class669.aClass25_Sub1_8522.method63
		((((Class648) class648).anIntArray8394
		  [717927929 * ((Class648) class648).anInt8395 - 1]),
		 414108614))).anInt2812 * 2025787361;
    }
    
    static int method7442(Class602_Sub1 class602_sub1,
			  Class602_Sub1 class602_sub1_21_, int i, boolean bool,
			  byte i_22_) {
	if (1 == i) {
	    int i_23_ = class602_sub1.anInt7873 * 1759698505;
	    int i_24_ = 1759698505 * class602_sub1_21_.anInt7873;
	    if (!bool) {
		if (-1 == i_23_)
		    i_23_ = 2001;
		if (-1 == i_24_)
		    i_24_ = 2001;
	    }
	    return i_23_ - i_24_;
	}
	if (2 == i)
	    return Class657.method7849(class602_sub1.method9584(2112926068),
				       class602_sub1_21_
					   .method9584(1715413831),
				       Class378_Sub2.aClass668_10123,
				       (byte) 2);
	if (i == 3) {
	    if (class602_sub1.aString10629.equals("-")) {
		if (class602_sub1_21_.aString10629.equals("-"))
		    return 0;
		return bool ? -1 : 1;
	    }
	    if (class602_sub1_21_.aString10629.equals("-"))
		return bool ? 1 : -1;
	    return Class657.method7849(class602_sub1.aString10629,
				       class602_sub1_21_.aString10629,
				       Class378_Sub2.aClass668_10123,
				       (byte) 2);
	}
	if (4 == i)
	    return (class602_sub1.method7173(256787265)
		    ? class602_sub1_21_.method7173(256787265) ? 0 : 1
		    : class602_sub1_21_.method7173(256787265) ? -1 : 0);
	if (i == 5)
	    return (class602_sub1.method7171(447829408)
		    ? class602_sub1_21_.method7171(447829408) ? 0 : 1
		    : class602_sub1_21_.method7171(447829408) ? -1 : 0);
	if (6 == i)
	    return (class602_sub1.method7172((byte) -115)
		    ? class602_sub1_21_.method7172((byte) -49) ? 0 : 1
		    : class602_sub1_21_.method7172((byte) -78) ? -1 : 0);
	if (i == 7)
	    return (class602_sub1.method7176(1471267826)
		    ? class602_sub1_21_.method7176(2046556379) ? 0 : 1
		    : class602_sub1_21_.method7176(1965342422) ? -1 : 0);
	if (i == 8) {
	    int i_25_ = class602_sub1.anInt10627 * 1955028611;
	    int i_26_ = 1955028611 * class602_sub1_21_.anInt10627;
	    if (bool) {
		if (i_25_ == 1000)
		    i_25_ = -1;
		if (i_26_ == 1000)
		    i_26_ = -1;
	    } else {
		if (-1 == i_25_)
		    i_25_ = 1000;
		if (i_26_ == -1)
		    i_26_ = 1000;
	    }
	    return i_25_ - i_26_;
	}
	return (-336009345 * class602_sub1.anInt10631
		- class602_sub1_21_.anInt10631 * -336009345);
    }
}
