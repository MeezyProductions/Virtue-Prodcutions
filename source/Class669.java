/* Class669 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class669 implements Definition
{
    Class659 aClass659_8503;
    public boolean aBool8504;
    int anInt8505;
    int anInt8506;
    byte[] aByteArray8507;
    short[] aShortArray8508;
    static final int anInt8509 = 8224;
    short[] aShortArray8510;
    short[] aShortArray8511;
    byte[] aByteArray8512;
    short[] aShortArray8513;
    int anInt8514;
    int anInt8515;
    byte aByte8516;
    int anInt8517;
    int anInt8518;
    public int anInt8519 = -475107865;
    int anInt8520;
    int anInt8521;
    public static Class25_Sub1 aClass25_Sub1_8522;
    public static boolean aBool8523;
    
    public void method59() {
	/* empty */
    }
    
    public void method58(ByteBuffer class528_sub42, byte i) {
	for (;;) {
	    int i_0_ = class528_sub42.readUnsignedByte((byte) 86);
	    if (0 == i_0_)
		break;
	    method7926(class528_sub42, i_0_, 1965250740);
	}
    }
    
    void method7926(ByteBuffer class528_sub42, int i, int i_1_) {
	do {
	    if (1 == i)
		((Class669) this).anInt8506
		    = class528_sub42.method9645((short) -1133) * -529055425;
	    else if (2 == i)
		anInt8519
		    = class528_sub42.method9645((short) -12640) * 475107865;
	    else if (4 == i)
		((Class669) this).anInt8514
		    = class528_sub42.readUnsignedShort(-397894910) * -6051655;
	    else if (i == 5)
		((Class669) this).anInt8515
		    = class528_sub42.readUnsignedShort(-1137755851) * 822974921;
	    else if (i == 6)
		((Class669) this).anInt8520
		    = class528_sub42.readUnsignedShort(-140916982) * -1904935671;
	    else if (7 == i)
		((Class669) this).anInt8517
		    = class528_sub42.readUnsignedByte((byte) 80) * -576814769;
	    else if (8 == i)
		((Class669) this).anInt8518
		    = class528_sub42.readUnsignedByte((byte) 90) * -1024486863;
	    else if (10 == i)
		aBool8504 = true;
	    else if (i == 9) {
		((Class669) this).aByte8516 = (byte) 3;
		((Class669) this).anInt8521 = -1154545184;
	    } else if (15 == i) {
		((Class669) this).aByte8516 = (byte) 3;
		((Class669) this).anInt8521
		    = class528_sub42.readUnsignedShort(76453197) * 632301903;
	    } else if (16 == i) {
		((Class669) this).aByte8516 = (byte) 3;
		((Class669) this).anInt8521
		    = class528_sub42.readInt(587755672) * 632301903;
	    } else if (i == 40) {
		int i_2_ = class528_sub42.readUnsignedByte((byte) 81);
		((Class669) this).aShortArray8513 = new short[i_2_];
		((Class669) this).aShortArray8508 = new short[i_2_];
		for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
		    ((Class669) this).aShortArray8513[i_3_]
			= (short) class528_sub42.readUnsignedShort(-82221768);
		    ((Class669) this).aShortArray8508[i_3_]
			= (short) class528_sub42.readUnsignedShort(-1318178056);
		}
	    } else if (41 == i) {
		int i_4_ = class528_sub42.readUnsignedByte((byte) 7);
		((Class669) this).aShortArray8510 = new short[i_4_];
		((Class669) this).aShortArray8511 = new short[i_4_];
		for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
		    ((Class669) this).aShortArray8510[i_5_]
			= (short) class528_sub42.readUnsignedShort(-1483004300);
		    ((Class669) this).aShortArray8511[i_5_]
			= (short) class528_sub42.readUnsignedShort(627346797);
		}
	    } else if (i == 44) {
		int i_6_ = class528_sub42.readUnsignedShort(-740841952);
		int i_7_ = 0;
		for (int i_8_ = i_6_; i_8_ > 0; i_8_ >>= 1)
		    i_7_++;
		((Class669) this).aByteArray8512 = new byte[i_7_];
		byte i_9_ = 0;
		for (int i_10_ = 0; i_10_ < i_7_; i_10_++) {
		    if ((i_6_ & 1 << i_10_) > 0) {
			((Class669) this).aByteArray8512[i_10_] = i_9_;
			i_9_++;
		    } else
			((Class669) this).aByteArray8512[i_10_] = (byte) -1;
		}
	    } else if (45 == i) {
		int i_11_ = class528_sub42.readUnsignedShort(-371863081);
		int i_12_ = 0;
		for (int i_13_ = i_11_; i_13_ > 0; i_13_ >>= 1)
		    i_12_++;
		((Class669) this).aByteArray8507 = new byte[i_12_];
		byte i_14_ = 0;
		for (int i_15_ = 0; i_15_ < i_12_; i_15_++) {
		    if ((i_11_ & 1 << i_15_) > 0) {
			((Class669) this).aByteArray8507[i_15_] = i_14_;
			i_14_++;
		    } else
			((Class669) this).aByteArray8507[i_15_] = (byte) -1;
		}
	    } else if (46 == i)
		break;
	} while (false);
    }
    
    public final Class157 method7927
	(Class173 class173, int i, Class690 class690, byte i_16_, byte i_17_) {
	return method7929(class173, i, false, null, null, 0, 0, 0, 0, 0, 0, 0,
			  class690, i_16_, -1118322082);
    }
    
    public final Class157 method7928
	(Class173 class173, int i, int i_18_, Class137 class137,
	 Class137 class137_19_, int i_20_, int i_21_, int i_22_,
	 Class690 class690, byte i_23_, int i_24_) {
	return method7929(class173, i, true, class137, class137_19_, i_20_,
			  i_21_, i_22_, i_18_, 0, 0, 0, class690, i_23_,
			  -872407933);
    }
    
    final Class157 method7929(Class173 class173, int i, boolean bool,
			      Class137 class137, Class137 class137_25_,
			      int i_26_, int i_27_, int i_28_, int i_29_,
			      int i_30_, int i_31_, int i_32_,
			      Class690 class690, byte i_33_, int i_34_) {
	int i_35_ = i;
	bool = bool & ((Class669) this).aByte8516 != 0;
	if (class690 != null)
	    i_35_ |= class690.method8078(-148944661);
	if (128 != ((Class669) this).anInt8515 * -1507340167)
	    i_35_ |= 0x2;
	if (128 != -413409911 * ((Class669) this).anInt8514
	    || 0 != -1282825927 * ((Class669) this).anInt8520 || 0 != i_29_)
	    i_35_ |= 0x5;
	if (bool)
	    i_35_ |= 0x7;
	Class157 class157;
	synchronized (((Class659) ((Class669) this).aClass659_8503)
		      .aClass186_8445) {
	    class157 = ((Class157)
			(((Class659) ((Class669) this).aClass659_8503)
			     .aClass186_8445.method2727
			 ((long) (943948213 * ((Class669) this).anInt8505
				  | 1967042207 * class173.anInt1985 << 29))));
	}
	if (class157 == null
	    || class173.method2245(class157.method1874(), i_35_) != 0) {
	    if (class157 != null)
		i_35_ = class173.method2366(i_35_, class157.method1874());
	    int i_36_ = i_35_;
	    if (((Class669) this).aShortArray8513 != null)
		i_36_ |= 0x4000;
	    if (null != ((Class669) this).aShortArray8510)
		i_36_ |= 0x8000;
	    Class177 class177
		= Class177.method2590((((Class659)
					((Class669) this).aClass659_8503)
				       .aClass446_8446),
				      (((Class669) this).anInt8506
				       * -1233965377),
				      0);
	    if (null == class177)
		return null;
	    if (class177.anInt2035 < 13)
		class177.method2585(2);
	    class157
		= (class173.method2244
		   (class177, i_36_,
		    699232343 * (((Class659) ((Class669) this).aClass659_8503)
				 .anInt8447),
		    -1752435281 * ((Class669) this).anInt8517 + 64,
		    ((Class669) this).anInt8518 * -182155567 + 850));
	    if (null != ((Class669) this).aShortArray8513) {
		for (int i_37_ = 0;
		     i_37_ < ((Class669) this).aShortArray8513.length; i_37_++)
		    class157.method1914((((Class669) this).aShortArray8513
					 [i_37_]),
					(((Class669) this).aShortArray8508
					 [i_37_]));
	    }
	    if (null != ((Class669) this).aShortArray8510) {
		for (int i_38_ = 0;
		     i_38_ < ((Class669) this).aShortArray8510.length; i_38_++)
		    class157.method1916((((Class669) this).aShortArray8510
					 [i_38_]),
					(((Class669) this).aShortArray8511
					 [i_38_]));
	    }
	    class157.method1873(i_35_);
	    synchronized (((Class659) ((Class669) this).aClass659_8503)
			  .aClass186_8445) {
		((Class659) ((Class669) this).aClass659_8503)
		    .aClass186_8445.method2729
		    (class157,
		     (long) (((Class669) this).anInt8505 * 943948213
			     | 1967042207 * class173.anInt1985 << 29));
	    }
	}
	Class157 class157_39_ = class157.method1951(i_33_, i_35_, true);
	if (class690 != null)
	    class690.method8079(class157_39_, 0, -967591110);
	if (((Class669) this).anInt8514 * -413409911 != 128
	    || 128 != ((Class669) this).anInt8515 * -1507340167)
	    class157_39_.method2011(((Class669) this).anInt8514 * -413409911,
				    -1507340167 * ((Class669) this).anInt8515,
				    -413409911 * ((Class669) this).anInt8514);
	if (0 != -1282825927 * ((Class669) this).anInt8520) {
	    if (((Class669) this).anInt8520 * -1282825927 == 90)
		i_29_ += 4096;
	    if (-1282825927 * ((Class669) this).anInt8520 == 180)
		i_29_ += 8192;
	    if (270 == -1282825927 * ((Class669) this).anInt8520)
		i_29_ += 12288;
	}
	if (0 != i_29_) {
	    i_29_ &= 0x3fff;
	    class157_39_.method1878(i_29_);
	}
	if (bool) {
	    if (class137 != null)
		class157_39_.method1883(((Class669) this).aByte8516,
					(-1784066641
					 * ((Class669) this).anInt8521),
					class137, class137_25_, i_26_, i_27_,
					i_28_);
	    else {
		if (i_30_ != 0)
		    class157_39_.method1934(i_30_);
		if (0 != i_31_)
		    class157_39_.method1879(i_31_);
		if (0 != i_32_)
		    class157_39_.method1880(0, i_32_, 0);
	    }
	}
	class157_39_.method1873(i);
	return class157_39_;
    }
    
    public final boolean method7930(byte i) {
	if (-1 == ((Class669) this).anInt8506 * -1233965377)
	    return true;
	return (((Class659) ((Class669) this).aClass659_8503)
		    .aClass446_8446.method5350
		(-1233965377 * ((Class669) this).anInt8506, 0, -1238363359));
    }
    
    public void method61(int i) {
	/* empty */
    }
    
    public void method57(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 93);
	    if (0 == i)
		break;
	    method7926(class528_sub42, i, 1489909370);
	}
    }
    
    void method7931(ByteBuffer class528_sub42, int i) {
	do {
	    if (1 == i)
		((Class669) this).anInt8506
		    = class528_sub42.method9645((short) 6315) * -529055425;
	    else if (2 == i)
		anInt8519
		    = class528_sub42.method9645((short) -10294) * 475107865;
	    else if (4 == i)
		((Class669) this).anInt8514
		    = class528_sub42.readUnsignedShort(-213509662) * -6051655;
	    else if (i == 5)
		((Class669) this).anInt8515
		    = class528_sub42.readUnsignedShort(-651499423) * 822974921;
	    else if (i == 6)
		((Class669) this).anInt8520
		    = class528_sub42.readUnsignedShort(-731783499) * -1904935671;
	    else if (7 == i)
		((Class669) this).anInt8517
		    = class528_sub42.readUnsignedByte((byte) 104) * -576814769;
	    else if (8 == i)
		((Class669) this).anInt8518
		    = class528_sub42.readUnsignedByte((byte) 61) * -1024486863;
	    else if (10 == i)
		aBool8504 = true;
	    else if (i == 9) {
		((Class669) this).aByte8516 = (byte) 3;
		((Class669) this).anInt8521 = -1154545184;
	    } else if (15 == i) {
		((Class669) this).aByte8516 = (byte) 3;
		((Class669) this).anInt8521
		    = class528_sub42.readUnsignedShort(105815764) * 632301903;
	    } else if (16 == i) {
		((Class669) this).aByte8516 = (byte) 3;
		((Class669) this).anInt8521
		    = class528_sub42.readInt(109662306) * 632301903;
	    } else if (i == 40) {
		int i_40_ = class528_sub42.readUnsignedByte((byte) 81);
		((Class669) this).aShortArray8513 = new short[i_40_];
		((Class669) this).aShortArray8508 = new short[i_40_];
		for (int i_41_ = 0; i_41_ < i_40_; i_41_++) {
		    ((Class669) this).aShortArray8513[i_41_]
			= (short) class528_sub42.readUnsignedShort(-2055203490);
		    ((Class669) this).aShortArray8508[i_41_]
			= (short) class528_sub42.readUnsignedShort(-1444981775);
		}
	    } else if (41 == i) {
		int i_42_ = class528_sub42.readUnsignedByte((byte) 50);
		((Class669) this).aShortArray8510 = new short[i_42_];
		((Class669) this).aShortArray8511 = new short[i_42_];
		for (int i_43_ = 0; i_43_ < i_42_; i_43_++) {
		    ((Class669) this).aShortArray8510[i_43_]
			= (short) class528_sub42.readUnsignedShort(-700400597);
		    ((Class669) this).aShortArray8511[i_43_]
			= (short) class528_sub42.readUnsignedShort(-1848262004);
		}
	    } else if (i == 44) {
		int i_44_ = class528_sub42.readUnsignedShort(578151377);
		int i_45_ = 0;
		for (int i_46_ = i_44_; i_46_ > 0; i_46_ >>= 1)
		    i_45_++;
		((Class669) this).aByteArray8512 = new byte[i_45_];
		byte i_47_ = 0;
		for (int i_48_ = 0; i_48_ < i_45_; i_48_++) {
		    if ((i_44_ & 1 << i_48_) > 0) {
			((Class669) this).aByteArray8512[i_48_] = i_47_;
			i_47_++;
		    } else
			((Class669) this).aByteArray8512[i_48_] = (byte) -1;
		}
	    } else if (45 == i) {
		int i_49_ = class528_sub42.readUnsignedShort(-384215101);
		int i_50_ = 0;
		for (int i_51_ = i_49_; i_51_ > 0; i_51_ >>= 1)
		    i_50_++;
		((Class669) this).aByteArray8507 = new byte[i_50_];
		byte i_52_ = 0;
		for (int i_53_ = 0; i_53_ < i_50_; i_53_++) {
		    if ((i_49_ & 1 << i_53_) > 0) {
			((Class669) this).aByteArray8507[i_53_] = i_52_;
			i_52_++;
		    } else
			((Class669) this).aByteArray8507[i_53_] = (byte) -1;
		}
	    } else if (46 == i)
		break;
	} while (false);
    }
    
    public final Class157 method7932
	(Class173 class173, int i, int i_54_, int i_55_, int i_56_, int i_57_,
	 Class690 class690, byte i_58_, byte i_59_) {
	if (((Class669) this).aByte8516 != 3)
	    return method7929(class173, i, false, null, null, 0, 0, 0, i_54_,
			      0, 0, 0, class690, i_58_, -72956076);
	return method7929(class173, i, true, null, null, 0, 0, 0, i_54_, i_55_,
			  i_56_, i_57_, class690, i_58_, -1163391608);
    }
    
    Class669(int i, Class659 class659) {
	((Class669) this).anInt8514 = -774611840;
	((Class669) this).anInt8515 = -2033392512;
	((Class669) this).anInt8520 = 0;
	((Class669) this).anInt8517 = 0;
	((Class669) this).anInt8518 = 0;
	aBool8504 = false;
	((Class669) this).aByte8516 = (byte) 0;
	((Class669) this).anInt8521 = -632301903;
	((Class669) this).anInt8505 = 678175901 * i;
	((Class669) this).aClass659_8503 = class659;
    }
    
    public final boolean method7933() {
	if (-1 == ((Class669) this).anInt8506 * -1233965377)
	    return true;
	return (((Class659) ((Class669) this).aClass659_8503)
		    .aClass446_8446.method5350
		(-1233965377 * ((Class669) this).anInt8506, 0, -1481427375));
    }
    
    public void method60(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 99);
	    if (0 == i)
		break;
	    method7926(class528_sub42, i, 1897289133);
	}
    }
    
    public static String method7934(Object[] objects, int i, int i_60_,
				    int i_61_) {
	if (0 == i_60_)
	    return "";
	if (1 == i_60_) {
	    CharSequence charsequence = (CharSequence) objects[i];
	    if (charsequence == null)
		return "null";
	    return charsequence.toString();
	}
	int i_62_ = i_60_ + i;
	int i_63_ = 0;
	for (int i_64_ = i; i_64_ < i_62_; i_64_++) {
	    CharSequence charsequence = (CharSequence) objects[i_64_];
	    if (charsequence == null)
		i_63_ += 4;
	    else
		i_63_ += charsequence.length();
	}
	StringBuilder stringbuilder = new StringBuilder(i_63_);
	for (int i_65_ = i; i_65_ < i_62_; i_65_++) {
	    CharSequence charsequence = (CharSequence) objects[i_65_];
	    if (charsequence == null)
		stringbuilder.append("null");
	    else
		stringbuilder.append(charsequence);
	}
	return stringbuilder.toString();
    }
    
    static final void method7935(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 100;
    }
    
    public static boolean method7936(int i, byte i_66_) {
	return 1 == i || i == 3 || i == 5;
    }
    
    static void method7937
	(int i, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_,
	 int i_72_, Class528_Sub21_Sub5 class528_sub21_sub5, Class172 class172,
	 Class1 class1, int i_73_, int i_74_, int i_75_) {
	if (i > i_68_ && i < i_68_ + i_70_
	    && i_67_ > i_72_ - class1.anInt12 * -55898191 - 1
	    && i_67_ < i_72_ + class1.anInt13 * -46594681)
	    i_73_ = i_74_;
	String string = Class523.method6373(class528_sub21_sub5, 1148004559);
	class172.method2126(string, 3 + i_68_, i_72_, i_73_, 0,
			    client.aRandom10970, Class464.anInt5305,
			    Class298.aClass151Array3262, null, -1251277374);
    }
}
