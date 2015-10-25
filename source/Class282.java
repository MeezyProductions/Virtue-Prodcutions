/* Class282 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282 implements Definition
{
    int[] anIntArray3067;
    Class446 aClass446_3068;
    short[] aShortArray3069;
    short[] aShortArray3070;
    byte[] aByteArray3071;
    short[] aShortArray3072;
    byte[] aByteArray3073;
    short[] aShortArray3074;
    int[] anIntArray3075 = { -1, -1, -1, -1, -1 };
    public static int[] anIntArray3076 = { 0, 1, 2, 3, 4, 5, 6, 14 };
    public static int[] anIntArray3077 = { 7, 8, 9, 10, 11, 12, 13, 15 };
    static int anInt3078;
    
    public boolean method3744(int i) {
	if (((Class282) this).anIntArray3067 == null)
	    return true;
	boolean bool = true;
	synchronized (((Class282) this).aClass446_3068) {
	    for (int i_0_ = 0; i_0_ < ((Class282) this).anIntArray3067.length;
		 i_0_++) {
		if (!((Class282) this).aClass446_3068.method5350
		     (((Class282) this).anIntArray3067[i_0_], 0, 96237744))
		    bool = false;
	    }
	}
	return bool;
    }
    
    void method3745(ByteBuffer class528_sub42, int i) {
	if (1 == i)
	    class528_sub42.readUnsignedByte((byte) 88);
	else if (2 == i) {
	    int i_1_ = class528_sub42.readUnsignedByte((byte) 101);
	    ((Class282) this).anIntArray3067 = new int[i_1_];
	    for (int i_2_ = 0; i_2_ < i_1_; i_2_++)
		((Class282) this).anIntArray3067[i_2_]
		    = class528_sub42.method9645((short) -6454);
	} else if (i != 3) {
	    if (i == 40) {
		int i_3_ = class528_sub42.readUnsignedByte((byte) 82);
		((Class282) this).aShortArray3069 = new short[i_3_];
		((Class282) this).aShortArray3070 = new short[i_3_];
		for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
		    ((Class282) this).aShortArray3069[i_4_]
			= (short) class528_sub42.readUnsignedShort(396012898);
		    ((Class282) this).aShortArray3070[i_4_]
			= (short) class528_sub42.readUnsignedShort(-707373209);
		}
	    } else if (41 == i) {
		int i_5_ = class528_sub42.readUnsignedByte((byte) 21);
		((Class282) this).aShortArray3074 = new short[i_5_];
		((Class282) this).aShortArray3072 = new short[i_5_];
		for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
		    ((Class282) this).aShortArray3074[i_6_]
			= (short) class528_sub42.readUnsignedShort(-1891915586);
		    ((Class282) this).aShortArray3072[i_6_]
			= (short) class528_sub42.readUnsignedShort(-712777893);
		}
	    } else if (44 == i) {
		int i_7_ = class528_sub42.readUnsignedShort(-1861790742);
		int i_8_ = 0;
		for (int i_9_ = i_7_; i_9_ > 0; i_9_ >>= 1)
		    i_8_++;
		((Class282) this).aByteArray3073 = new byte[i_8_];
		byte i_10_ = 0;
		for (int i_11_ = 0; i_11_ < i_8_; i_11_++) {
		    if ((i_7_ & 1 << i_11_) > 0) {
			((Class282) this).aByteArray3073[i_11_] = i_10_;
			i_10_++;
		    } else
			((Class282) this).aByteArray3073[i_11_] = (byte) -1;
		}
	    } else if (i == 45) {
		int i_12_ = class528_sub42.readUnsignedShort(-1068673699);
		int i_13_ = 0;
		for (int i_14_ = i_12_; i_14_ > 0; i_14_ >>= 1)
		    i_13_++;
		((Class282) this).aByteArray3071 = new byte[i_13_];
		byte i_15_ = 0;
		for (int i_16_ = 0; i_16_ < i_13_; i_16_++) {
		    if ((i_12_ & 1 << i_16_) > 0) {
			((Class282) this).aByteArray3071[i_16_] = i_15_;
			i_15_++;
		    } else
			((Class282) this).aByteArray3071[i_16_] = (byte) -1;
		}
	    } else if (i >= 60 && i < 70)
		((Class282) this).anIntArray3075[i - 60]
		    = class528_sub42.method9645((short) -29034);
	}
    }
    
    void method3746(ByteBuffer class528_sub42, int i, int i_17_) {
	if (1 == i)
	    class528_sub42.readUnsignedByte((byte) 1);
	else if (2 == i) {
	    int i_18_ = class528_sub42.readUnsignedByte((byte) 79);
	    ((Class282) this).anIntArray3067 = new int[i_18_];
	    for (int i_19_ = 0; i_19_ < i_18_; i_19_++)
		((Class282) this).anIntArray3067[i_19_]
		    = class528_sub42.method9645((short) 6961);
	} else if (i != 3) {
	    if (i == 40) {
		int i_20_ = class528_sub42.readUnsignedByte((byte) 47);
		((Class282) this).aShortArray3069 = new short[i_20_];
		((Class282) this).aShortArray3070 = new short[i_20_];
		for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
		    ((Class282) this).aShortArray3069[i_21_]
			= (short) class528_sub42.readUnsignedShort(-290721206);
		    ((Class282) this).aShortArray3070[i_21_]
			= (short) class528_sub42.readUnsignedShort(-1341477430);
		}
	    } else if (41 == i) {
		int i_22_ = class528_sub42.readUnsignedByte((byte) 41);
		((Class282) this).aShortArray3074 = new short[i_22_];
		((Class282) this).aShortArray3072 = new short[i_22_];
		for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
		    ((Class282) this).aShortArray3074[i_23_]
			= (short) class528_sub42.readUnsignedShort(-1136343856);
		    ((Class282) this).aShortArray3072[i_23_]
			= (short) class528_sub42.readUnsignedShort(-403439737);
		}
	    } else if (44 == i) {
		int i_24_ = class528_sub42.readUnsignedShort(-719064510);
		int i_25_ = 0;
		for (int i_26_ = i_24_; i_26_ > 0; i_26_ >>= 1)
		    i_25_++;
		((Class282) this).aByteArray3073 = new byte[i_25_];
		byte i_27_ = 0;
		for (int i_28_ = 0; i_28_ < i_25_; i_28_++) {
		    if ((i_24_ & 1 << i_28_) > 0) {
			((Class282) this).aByteArray3073[i_28_] = i_27_;
			i_27_++;
		    } else
			((Class282) this).aByteArray3073[i_28_] = (byte) -1;
		}
	    } else if (i == 45) {
		int i_29_ = class528_sub42.readUnsignedShort(-885642502);
		int i_30_ = 0;
		for (int i_31_ = i_29_; i_31_ > 0; i_31_ >>= 1)
		    i_30_++;
		((Class282) this).aByteArray3071 = new byte[i_30_];
		byte i_32_ = 0;
		for (int i_33_ = 0; i_33_ < i_30_; i_33_++) {
		    if ((i_29_ & 1 << i_33_) > 0) {
			((Class282) this).aByteArray3071[i_33_] = i_32_;
			i_32_++;
		    } else
			((Class282) this).aByteArray3071[i_33_] = (byte) -1;
		}
	    } else if (i >= 60 && i < 70)
		((Class282) this).anIntArray3075[i - 60]
		    = class528_sub42.method9645((short) -3778);
	}
    }
    
    public void method61(int i) {
	/* empty */
    }
    
    Class282(int i, Class446 class446) {
	((Class282) this).aClass446_3068 = class446;
    }
    
    public Class177 method3747(short i) {
	if (null == ((Class282) this).anIntArray3067)
	    return null;
	Class177[] class177s
	    = new Class177[((Class282) this).anIntArray3067.length];
	synchronized (((Class282) this).aClass446_3068) {
	    for (int i_34_ = 0;
		 i_34_ < ((Class282) this).anIntArray3067.length; i_34_++)
		class177s[i_34_]
		    = Class177.method2590(((Class282) this).aClass446_3068,
					  (((Class282) this).anIntArray3067
					   [i_34_]),
					  0);
	}
	for (int i_35_ = 0; i_35_ < ((Class282) this).anIntArray3067.length;
	     i_35_++) {
	    if (class177s[i_35_].anInt2035 < 13)
		class177s[i_35_].method2585(2);
	}
	Class177 class177;
	if (class177s.length == 1)
	    class177 = class177s[0];
	else
	    class177 = new Class177(class177s, class177s.length);
	if (null == class177)
	    return null;
	if (((Class282) this).aShortArray3069 != null) {
	    for (int i_36_ = 0;
		 i_36_ < ((Class282) this).aShortArray3069.length; i_36_++)
		class177.method2584(((Class282) this).aShortArray3069[i_36_],
				    ((Class282) this).aShortArray3070[i_36_]);
	}
	if (null != ((Class282) this).aShortArray3074) {
	    for (int i_37_ = 0;
		 i_37_ < ((Class282) this).aShortArray3074.length; i_37_++)
		class177.method2583(((Class282) this).aShortArray3074[i_37_],
				    ((Class282) this).aShortArray3072[i_37_]);
	}
	return class177;
    }
    
    public boolean method3748(byte i) {
	boolean bool = true;
	synchronized (((Class282) this).aClass446_3068) {
	    for (int i_38_ = 0; i_38_ < 5; i_38_++) {
		if (-1 != ((Class282) this).anIntArray3075[i_38_]
		    && !(((Class282) this).aClass446_3068.method5350
			 (((Class282) this).anIntArray3075[i_38_], 0,
			  1519217959)))
		    bool = false;
	    }
	}
	return bool;
    }
    
    public Class177 method3749(byte i) {
	Class177[] class177s = new Class177[5];
	int i_39_ = 0;
	synchronized (((Class282) this).aClass446_3068) {
	    for (int i_40_ = 0; i_40_ < 5; i_40_++) {
		if (((Class282) this).anIntArray3075[i_40_] != -1)
		    class177s[i_39_++]
			= Class177.method2590(((Class282) this).aClass446_3068,
					      (((Class282) this).anIntArray3075
					       [i_40_]),
					      0);
	    }
	}
	for (int i_41_ = 0; i_41_ < 5; i_41_++) {
	    if (class177s[i_41_] != null && class177s[i_41_].anInt2035 < 13)
		class177s[i_41_].method2585(2);
	}
	Class177 class177 = new Class177(class177s, i_39_);
	if (((Class282) this).aShortArray3069 != null) {
	    for (int i_42_ = 0;
		 i_42_ < ((Class282) this).aShortArray3069.length; i_42_++)
		class177.method2584(((Class282) this).aShortArray3069[i_42_],
				    ((Class282) this).aShortArray3070[i_42_]);
	}
	if (null != ((Class282) this).aShortArray3074) {
	    for (int i_43_ = 0;
		 i_43_ < ((Class282) this).aShortArray3074.length; i_43_++)
		class177.method2583(((Class282) this).aShortArray3074[i_43_],
				    ((Class282) this).aShortArray3072[i_43_]);
	}
	return class177;
    }
    
    public void method57(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 22);
	    if (0 == i)
		break;
	    method3746(class528_sub42, i, 1871458777);
	}
    }
    
    public boolean method3750() {
	boolean bool = true;
	synchronized (((Class282) this).aClass446_3068) {
	    for (int i = 0; i < 5; i++) {
		if (-1 != ((Class282) this).anIntArray3075[i]
		    && !(((Class282) this).aClass446_3068.method5350
			 (((Class282) this).anIntArray3075[i], 0, 1225882038)))
		    bool = false;
	    }
	}
	return bool;
    }
    
    public void method59() {
	/* empty */
    }
    
    void method3751(ByteBuffer class528_sub42, int i) {
	if (1 == i)
	    class528_sub42.readUnsignedByte((byte) 114);
	else if (2 == i) {
	    int i_44_ = class528_sub42.readUnsignedByte((byte) 98);
	    ((Class282) this).anIntArray3067 = new int[i_44_];
	    for (int i_45_ = 0; i_45_ < i_44_; i_45_++)
		((Class282) this).anIntArray3067[i_45_]
		    = class528_sub42.method9645((short) 25668);
	} else if (i != 3) {
	    if (i == 40) {
		int i_46_ = class528_sub42.readUnsignedByte((byte) 81);
		((Class282) this).aShortArray3069 = new short[i_46_];
		((Class282) this).aShortArray3070 = new short[i_46_];
		for (int i_47_ = 0; i_47_ < i_46_; i_47_++) {
		    ((Class282) this).aShortArray3069[i_47_]
			= (short) class528_sub42.readUnsignedShort(-1895862649);
		    ((Class282) this).aShortArray3070[i_47_]
			= (short) class528_sub42.readUnsignedShort(-956213116);
		}
	    } else if (41 == i) {
		int i_48_ = class528_sub42.readUnsignedByte((byte) 118);
		((Class282) this).aShortArray3074 = new short[i_48_];
		((Class282) this).aShortArray3072 = new short[i_48_];
		for (int i_49_ = 0; i_49_ < i_48_; i_49_++) {
		    ((Class282) this).aShortArray3074[i_49_]
			= (short) class528_sub42.readUnsignedShort(-336183439);
		    ((Class282) this).aShortArray3072[i_49_]
			= (short) class528_sub42.readUnsignedShort(221792168);
		}
	    } else if (44 == i) {
		int i_50_ = class528_sub42.readUnsignedShort(433634719);
		int i_51_ = 0;
		for (int i_52_ = i_50_; i_52_ > 0; i_52_ >>= 1)
		    i_51_++;
		((Class282) this).aByteArray3073 = new byte[i_51_];
		byte i_53_ = 0;
		for (int i_54_ = 0; i_54_ < i_51_; i_54_++) {
		    if ((i_50_ & 1 << i_54_) > 0) {
			((Class282) this).aByteArray3073[i_54_] = i_53_;
			i_53_++;
		    } else
			((Class282) this).aByteArray3073[i_54_] = (byte) -1;
		}
	    } else if (i == 45) {
		int i_55_ = class528_sub42.readUnsignedShort(-1974301241);
		int i_56_ = 0;
		for (int i_57_ = i_55_; i_57_ > 0; i_57_ >>= 1)
		    i_56_++;
		((Class282) this).aByteArray3071 = new byte[i_56_];
		byte i_58_ = 0;
		for (int i_59_ = 0; i_59_ < i_56_; i_59_++) {
		    if ((i_55_ & 1 << i_59_) > 0) {
			((Class282) this).aByteArray3071[i_59_] = i_58_;
			i_58_++;
		    } else
			((Class282) this).aByteArray3071[i_59_] = (byte) -1;
		}
	    } else if (i >= 60 && i < 70)
		((Class282) this).anIntArray3075[i - 60]
		    = class528_sub42.method9645((short) 15140);
	}
    }
    
    void method3752(ByteBuffer class528_sub42, int i) {
	if (1 == i)
	    class528_sub42.readUnsignedByte((byte) 70);
	else if (2 == i) {
	    int i_60_ = class528_sub42.readUnsignedByte((byte) 15);
	    ((Class282) this).anIntArray3067 = new int[i_60_];
	    for (int i_61_ = 0; i_61_ < i_60_; i_61_++)
		((Class282) this).anIntArray3067[i_61_]
		    = class528_sub42.method9645((short) -13955);
	} else if (i != 3) {
	    if (i == 40) {
		int i_62_ = class528_sub42.readUnsignedByte((byte) 87);
		((Class282) this).aShortArray3069 = new short[i_62_];
		((Class282) this).aShortArray3070 = new short[i_62_];
		for (int i_63_ = 0; i_63_ < i_62_; i_63_++) {
		    ((Class282) this).aShortArray3069[i_63_]
			= (short) class528_sub42.readUnsignedShort(277633859);
		    ((Class282) this).aShortArray3070[i_63_]
			= (short) class528_sub42.readUnsignedShort(-705248170);
		}
	    } else if (41 == i) {
		int i_64_ = class528_sub42.readUnsignedByte((byte) 66);
		((Class282) this).aShortArray3074 = new short[i_64_];
		((Class282) this).aShortArray3072 = new short[i_64_];
		for (int i_65_ = 0; i_65_ < i_64_; i_65_++) {
		    ((Class282) this).aShortArray3074[i_65_]
			= (short) class528_sub42.readUnsignedShort(-1307200864);
		    ((Class282) this).aShortArray3072[i_65_]
			= (short) class528_sub42.readUnsignedShort(-790972150);
		}
	    } else if (44 == i) {
		int i_66_ = class528_sub42.readUnsignedShort(-1760159664);
		int i_67_ = 0;
		for (int i_68_ = i_66_; i_68_ > 0; i_68_ >>= 1)
		    i_67_++;
		((Class282) this).aByteArray3073 = new byte[i_67_];
		byte i_69_ = 0;
		for (int i_70_ = 0; i_70_ < i_67_; i_70_++) {
		    if ((i_66_ & 1 << i_70_) > 0) {
			((Class282) this).aByteArray3073[i_70_] = i_69_;
			i_69_++;
		    } else
			((Class282) this).aByteArray3073[i_70_] = (byte) -1;
		}
	    } else if (i == 45) {
		int i_71_ = class528_sub42.readUnsignedShort(-1055528864);
		int i_72_ = 0;
		for (int i_73_ = i_71_; i_73_ > 0; i_73_ >>= 1)
		    i_72_++;
		((Class282) this).aByteArray3071 = new byte[i_72_];
		byte i_74_ = 0;
		for (int i_75_ = 0; i_75_ < i_72_; i_75_++) {
		    if ((i_71_ & 1 << i_75_) > 0) {
			((Class282) this).aByteArray3071[i_75_] = i_74_;
			i_74_++;
		    } else
			((Class282) this).aByteArray3071[i_75_] = (byte) -1;
		}
	    } else if (i >= 60 && i < 70)
		((Class282) this).anIntArray3075[i - 60]
		    = class528_sub42.method9645((short) -20540);
	}
    }
    
    public void method58(ByteBuffer class528_sub42, byte i) {
	for (;;) {
	    int i_76_ = class528_sub42.readUnsignedByte((byte) 100);
	    if (0 == i_76_)
		break;
	    method3746(class528_sub42, i_76_, 1871458777);
	}
    }
    
    public boolean method3753() {
	if (((Class282) this).anIntArray3067 == null)
	    return true;
	boolean bool = true;
	synchronized (((Class282) this).aClass446_3068) {
	    for (int i = 0; i < ((Class282) this).anIntArray3067.length; i++) {
		if (!((Class282) this).aClass446_3068.method5350
		     (((Class282) this).anIntArray3067[i], 0, -985433689))
		    bool = false;
	    }
	}
	return bool;
    }
    
    public void method60(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 18);
	    if (0 == i)
		break;
	    method3746(class528_sub42, i, 1871458777);
	}
    }
    
    void method3754(ByteBuffer class528_sub42, int i) {
	if (1 == i)
	    class528_sub42.readUnsignedByte((byte) 125);
	else if (2 == i) {
	    int i_77_ = class528_sub42.readUnsignedByte((byte) 53);
	    ((Class282) this).anIntArray3067 = new int[i_77_];
	    for (int i_78_ = 0; i_78_ < i_77_; i_78_++)
		((Class282) this).anIntArray3067[i_78_]
		    = class528_sub42.method9645((short) 17308);
	} else if (i != 3) {
	    if (i == 40) {
		int i_79_ = class528_sub42.readUnsignedByte((byte) 120);
		((Class282) this).aShortArray3069 = new short[i_79_];
		((Class282) this).aShortArray3070 = new short[i_79_];
		for (int i_80_ = 0; i_80_ < i_79_; i_80_++) {
		    ((Class282) this).aShortArray3069[i_80_]
			= (short) class528_sub42.readUnsignedShort(226772384);
		    ((Class282) this).aShortArray3070[i_80_]
			= (short) class528_sub42.readUnsignedShort(-467181983);
		}
	    } else if (41 == i) {
		int i_81_ = class528_sub42.readUnsignedByte((byte) 53);
		((Class282) this).aShortArray3074 = new short[i_81_];
		((Class282) this).aShortArray3072 = new short[i_81_];
		for (int i_82_ = 0; i_82_ < i_81_; i_82_++) {
		    ((Class282) this).aShortArray3074[i_82_]
			= (short) class528_sub42.readUnsignedShort(-1329212390);
		    ((Class282) this).aShortArray3072[i_82_]
			= (short) class528_sub42.readUnsignedShort(272824173);
		}
	    } else if (44 == i) {
		int i_83_ = class528_sub42.readUnsignedShort(418670588);
		int i_84_ = 0;
		for (int i_85_ = i_83_; i_85_ > 0; i_85_ >>= 1)
		    i_84_++;
		((Class282) this).aByteArray3073 = new byte[i_84_];
		byte i_86_ = 0;
		for (int i_87_ = 0; i_87_ < i_84_; i_87_++) {
		    if ((i_83_ & 1 << i_87_) > 0) {
			((Class282) this).aByteArray3073[i_87_] = i_86_;
			i_86_++;
		    } else
			((Class282) this).aByteArray3073[i_87_] = (byte) -1;
		}
	    } else if (i == 45) {
		int i_88_ = class528_sub42.readUnsignedShort(-956342016);
		int i_89_ = 0;
		for (int i_90_ = i_88_; i_90_ > 0; i_90_ >>= 1)
		    i_89_++;
		((Class282) this).aByteArray3071 = new byte[i_89_];
		byte i_91_ = 0;
		for (int i_92_ = 0; i_92_ < i_89_; i_92_++) {
		    if ((i_88_ & 1 << i_92_) > 0) {
			((Class282) this).aByteArray3071[i_92_] = i_91_;
			i_91_++;
		    } else
			((Class282) this).aByteArray3071[i_92_] = (byte) -1;
		}
	    } else if (i >= 60 && i < 70)
		((Class282) this).anIntArray3075[i - 60]
		    = class528_sub42.method9645((short) -19854);
	}
    }
    
    public boolean method3755() {
	boolean bool = true;
	synchronized (((Class282) this).aClass446_3068) {
	    for (int i = 0; i < 5; i++) {
		if (-1 != ((Class282) this).anIntArray3075[i]
		    && !(((Class282) this).aClass446_3068.method5350
			 (((Class282) this).anIntArray3075[i], 0, -543523060)))
		    bool = false;
	    }
	}
	return bool;
    }
    
    public boolean method3756() {
	boolean bool = true;
	synchronized (((Class282) this).aClass446_3068) {
	    for (int i = 0; i < 5; i++) {
		if (-1 != ((Class282) this).anIntArray3075[i]
		    && !(((Class282) this).aClass446_3068.method5350
			 (((Class282) this).anIntArray3075[i], 0, -700736106)))
		    bool = false;
	    }
	}
	return bool;
    }
    
    static void method3757(Class546[][][] class546s, int i) {
	for (int i_93_ = 0; i_93_ < class546s.length; i_93_++) {
	    Class546[][] class546s_94_ = class546s[i_93_];
	    for (int i_95_ = 0; i_95_ < class546s_94_.length; i_95_++) {
		for (int i_96_ = 0; i_96_ < class546s_94_[i_95_].length;
		     i_96_++) {
		    Class546 class546 = class546s_94_[i_95_][i_96_];
		    if (class546 != null) {
			if (class546.aClass645_Sub1_Sub4_7397
			    instanceof Interface60)
			    ((Interface60) class546.aClass645_Sub1_Sub4_7397)
				.method385(2057624222);
			if (class546.aClass645_Sub1_Sub1_7395
			    instanceof Interface60)
			    ((Interface60) class546.aClass645_Sub1_Sub1_7395)
				.method385(1868143320);
			if (class546.aClass645_Sub1_Sub1_7396
			    instanceof Interface60)
			    ((Interface60) class546.aClass645_Sub1_Sub1_7396)
				.method385(1808527754);
			if (class546.aClass645_Sub1_Sub3_7393
			    instanceof Interface60)
			    ((Interface60) class546.aClass645_Sub1_Sub3_7393)
				.method385(2040720098);
			if (class546.aClass645_Sub1_Sub3_7394
			    instanceof Interface60)
			    ((Interface60) class546.aClass645_Sub1_Sub3_7394)
				.method385(1996294640);
			for (Class542 class542 = class546.aClass542_7399;
			     null != class542;
			     class542 = class542.aClass542_7238) {
			    Class645_Sub1_Sub5 class645_sub1_sub5
				= class542.aClass645_Sub1_Sub5_7239;
			    if (class645_sub1_sub5 instanceof Interface60)
				((Interface60) class645_sub1_sub5)
				    .method385(1937379672);
			}
		    }
		}
	    }
	}
    }
    
    public static void method3758(boolean bool, boolean bool_97_, int i) {
	Class581.aBool7646 = bool;
	Class581.aBool7647 = bool_97_;
    }
    
    static final void method3759(Class229 class229, short i) {
	if (class229.anInt2474 * -1257480855
	    == Class229.anInt2513 * -279520599) {
	    if (null
		== Class108.myPlayer.displayUnfiltered) {
		class229.anInt2419 = 0;
		class229.anInt2349 = 0;
	    } else {
		class229.anInt2424 = -325204730;
		class229.anInt2517
		    = ((int) (Math.sin((double) client.anInt11127 / 40.0)
			      * 256.0)
		       & 0x7ff) * -776502595;
		class229.anInt2418 = 47407791;
		class229.anInt2419 = -1926636207 * client.anInt11025;
		class229.anInt2349
		    = Class57.method992((Class108
					 .myPlayer
					 .displayUnfiltered),
					-1410480634) * -924078537;
		Class690_Sub3 class690_sub3
		    = (Class108.myPlayer
		       .aClass690_Sub3_11803);
		if (class690_sub3 != null) {
		    if (class229.aClass690_2541 == null)
			class229.aClass690_2541 = new Class690_Sub2();
		    class229.anInt2440
			= class690_sub3.method8068(-772845955) * -105130731;
		    class229.aClass690_2541.method8066(class690_sub3,
						       (byte) -5);
		} else
		    class229.aClass690_2541 = null;
	    }
	}
    }
}
