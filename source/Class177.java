/* Class177 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class177
{
    public int[] anIntArray2032;
    static final int anInt2033 = 26;
    static final int anInt2034 = 1;
    public int anInt2035 = 12;
    public int anInt2036 = 0;
    public short[] aShortArray2037;
    public int[] anIntArray2038;
    byte[] aByteArray2039;
    public Class176[] aClass176Array2040;
    public int[] anIntArray2041;
    public int[] anIntArray2042;
    public short[] aShortArray2043;
    public int[] anIntArray2044;
    public int[] anIntArray2045;
    public float[] aFloatArray2046;
    public int anInt2047;
    public byte[] aByteArray2048;
    public short[] aShortArray2049;
    public short[] aShortArray2050;
    public byte[] aByteArray2051;
    public float[] aFloatArray2052;
    public byte[] aByteArray2053;
    public byte[] aByteArray2054;
    public int[] anIntArray2055;
    public byte[] aByteArray2056;
    public short[] aShortArray2057;
    public short[] aShortArray2058;
    public Class144[] aClass144Array2059;
    public int[] anIntArray2060;
    byte aByte2061;
    public short[] aShortArray2062;
    public static final short aShort2063 = -1;
    public short[] aShortArray2064;
    int anInt2065;
    public static final short aShort2066 = 32766;
    public short[] aShortArray2067;
    public int[] anIntArray2068;
    public short[] aShortArray2069;
    public int[] anIntArray2070;
    public int[] anIntArray2071;
    public int[] anIntArray2072;
    static final int anInt2073 = 3;
    public int anInt2074 = 0;
    public byte[] aByteArray2075;
    public byte[] aByteArray2076;
    public short[] aShortArray2077;
    public Class170[] aClass170Array2078;
    public byte[] aByteArray2079;
    int anInt2080;
    
    public Class177(int i, int i_0_, int i_1_) {
	anInt2047 = 0;
	((Class177) this).aByte2061 = (byte) 0;
	((Class177) this).anInt2065 = 0;
	anIntArray2038 = new int[i];
	anIntArray2068 = new int[i];
	anIntArray2044 = new int[i];
	anIntArray2042 = new int[i];
	aShortArray2067 = new short[i_0_];
	aShortArray2049 = new short[i_0_];
	aShortArray2050 = new short[i_0_];
	aByteArray2054 = new byte[i_0_];
	aByteArray2048 = new byte[i_0_];
	aByteArray2056 = new byte[i_0_];
	aShortArray2057 = new short[i_0_];
	aShortArray2058 = new short[i_0_];
	aShortArray2037 = new short[i_0_];
	anIntArray2060 = new int[i_0_];
	if (i_1_ > 0) {
	    aByteArray2076 = new byte[i_1_];
	    aShortArray2064 = new short[i_1_];
	    aShortArray2077 = new short[i_1_];
	    aShortArray2069 = new short[i_1_];
	    anIntArray2070 = new int[i_1_];
	    anIntArray2071 = new int[i_1_];
	    anIntArray2072 = new int[i_1_];
	    ((Class177) this).aByteArray2039 = new byte[i_1_];
	    aByteArray2079 = new byte[i_1_];
	    anIntArray2045 = new int[i_1_];
	    anIntArray2055 = new int[i_1_];
	    anIntArray2032 = new int[i_1_];
	}
    }
    
    public byte method2571(short i, short i_2_, short i_3_) {
	if (((Class177) this).anInt2065 >= 255)
	    throw new IllegalStateException();
	aByteArray2076[((Class177) this).anInt2065] = (byte) 0;
	aShortArray2064[((Class177) this).anInt2065] = i;
	aShortArray2077[((Class177) this).anInt2065] = i_2_;
	aShortArray2069[((Class177) this).anInt2065] = i_3_;
	return (byte) ((Class177) this).anInt2065++;
    }
    
    public void method2572(int i, int i_4_, int i_5_) {
	for (int i_6_ = 0; i_6_ < anInt2036; i_6_++) {
	    anIntArray2038[i_6_] += i;
	    anIntArray2068[i_6_] += i_4_;
	    anIntArray2044[i_6_] += i_5_;
	}
    }
    
    public Class177(Class177[] class177s, int i) {
	anInt2047 = 0;
	((Class177) this).aByte2061 = (byte) 0;
	((Class177) this).anInt2065 = 0;
	anInt2036 = 0;
	anInt2047 = 0;
	((Class177) this).anInt2065 = 0;
	((Class177) this).anInt2080 = 0;
	int i_7_ = 0;
	int i_8_ = 0;
	int i_9_ = 0;
	boolean bool = false;
	boolean bool_10_ = false;
	boolean bool_11_ = false;
	boolean bool_12_ = false;
	boolean bool_13_ = false;
	boolean bool_14_ = false;
	((Class177) this).aByte2061 = (byte) -1;
	for (int i_15_ = 0; i_15_ < i; i_15_++) {
	    Class177 class177_16_ = class177s[i_15_];
	    if (class177_16_ != null) {
		anInt2036 += class177_16_.anInt2036;
		anInt2047 += class177_16_.anInt2047;
		((Class177) this).anInt2065
		    += ((Class177) class177_16_).anInt2065;
		((Class177) this).anInt2080
		    += ((Class177) class177_16_).anInt2080;
		if (class177_16_.aClass170Array2078 != null)
		    i_7_ += class177_16_.aClass170Array2078.length;
		if (class177_16_.aClass144Array2059 != null)
		    i_8_ += class177_16_.aClass144Array2059.length;
		if (class177_16_.aClass176Array2040 != null)
		    i_9_ += class177_16_.aClass176Array2040.length;
		bool = bool | class177_16_.aByteArray2054 != null;
		if (class177_16_.aByteArray2048 != null)
		    bool_10_ = true;
		else {
		    if (((Class177) this).aByte2061 == -1)
			((Class177) this).aByte2061
			    = ((Class177) class177_16_).aByte2061;
		    if (((Class177) this).aByte2061
			!= ((Class177) class177_16_).aByte2061)
			bool_10_ = true;
		}
		bool_11_ = bool_11_ | class177_16_.aByteArray2056 != null;
		bool_12_ = bool_12_ | class177_16_.aShortArray2057 != null;
		bool_13_ = bool_13_ | class177_16_.aShortArray2037 != null;
		bool_14_ = bool_14_ | class177_16_.anIntArray2060 != null;
	    }
	}
	anIntArray2038 = new int[anInt2036];
	anIntArray2068 = new int[anInt2036];
	anIntArray2044 = new int[anInt2036];
	anIntArray2042 = new int[anInt2036];
	aShortArray2043 = new short[anInt2036];
	aShortArray2067 = new short[anInt2047];
	aShortArray2049 = new short[anInt2047];
	aShortArray2050 = new short[anInt2047];
	if (bool)
	    aByteArray2054 = new byte[anInt2047];
	if (bool_10_)
	    aByteArray2048 = new byte[anInt2047];
	if (bool_11_)
	    aByteArray2056 = new byte[anInt2047];
	if (bool_12_)
	    aShortArray2057 = new short[anInt2047];
	aShortArray2058 = new short[anInt2047];
	if (bool_13_)
	    aShortArray2037 = new short[anInt2047];
	if (bool_14_)
	    anIntArray2060 = new int[anInt2047];
	aShortArray2062 = new short[anInt2047];
	if (((Class177) this).anInt2065 > 0) {
	    aByteArray2076 = new byte[((Class177) this).anInt2065];
	    aShortArray2064 = new short[((Class177) this).anInt2065];
	    aShortArray2077 = new short[((Class177) this).anInt2065];
	    aShortArray2069 = new short[((Class177) this).anInt2065];
	    anIntArray2070 = new int[((Class177) this).anInt2065];
	    anIntArray2071 = new int[((Class177) this).anInt2065];
	    anIntArray2072 = new int[((Class177) this).anInt2065];
	    ((Class177) this).aByteArray2039
		= new byte[((Class177) this).anInt2065];
	    aByteArray2079 = new byte[((Class177) this).anInt2065];
	    anIntArray2045 = new int[((Class177) this).anInt2065];
	    anIntArray2055 = new int[((Class177) this).anInt2065];
	    anIntArray2032 = new int[((Class177) this).anInt2065];
	}
	if (i_9_ > 0)
	    aClass176Array2040 = new Class176[i_9_];
	if (i_7_ > 0)
	    aClass170Array2078 = new Class170[i_7_];
	if (i_8_ > 0)
	    aClass144Array2059 = new Class144[i_8_];
	if (((Class177) this).anInt2080 > 0) {
	    aFloatArray2052 = new float[((Class177) this).anInt2080];
	    aFloatArray2046 = new float[((Class177) this).anInt2080];
	    anIntArray2041 = new int[anInt2036];
	    aByteArray2051 = new byte[anInt2047];
	    aByteArray2075 = new byte[anInt2047];
	    aByteArray2053 = new byte[anInt2047];
	}
	int[] is = new int[anInt2036];
	int[] is_17_ = new int[((Class177) this).anInt2080];
	int[] is_18_ = new int[anInt2036];
	int[] is_19_ = new int[anInt2036];
	int[] is_20_ = new int[3];
	anInt2036 = 0;
	anInt2047 = 0;
	((Class177) this).anInt2065 = 0;
	((Class177) this).anInt2080 = 0;
	i_7_ = 0;
	i_8_ = 0;
	i_9_ = 0;
	for (int i_21_ = 0; i_21_ < i; i_21_++) {
	    short i_22_ = (short) (1 << i_21_);
	    Class177 class177_23_ = class177s[i_21_];
	    int i_24_ = anInt2047;
	    if (class177_23_ != null) {
		boolean[] bools = new boolean[class177_23_.anInt2036];
		if (class177_23_.aClass176Array2040 != null) {
		    for (int i_25_ = 0;
			 i_25_ < class177_23_.aClass176Array2040.length;
			 i_25_++) {
			Class176 class176
			    = class177_23_.aClass176Array2040[i_25_];
			aClass176Array2040[i_9_++]
			    = class176.method2566((class176.anInt2026
						   * 967499851) + anInt2047,
						  -375423008);
		    }
		}
		for (int i_26_ = 0; i_26_ < class177_23_.anInt2047; i_26_++) {
		    is_20_[0] = class177_23_.aShortArray2067[i_26_];
		    is_20_[1] = class177_23_.aShortArray2049[i_26_];
		    is_20_[2] = class177_23_.aShortArray2050[i_26_];
		    for (int i_27_ = 0; i_27_ < 3; i_27_++) {
			int i_28_ = is_20_[i_27_];
			int i_29_ = class177_23_.anIntArray2038[i_28_];
			int i_30_ = class177_23_.anIntArray2068[i_28_];
			int i_31_ = class177_23_.anIntArray2044[i_28_];
			int i_32_;
			for (i_32_ = 0; i_32_ < anInt2036; i_32_++) {
			    if (i_29_ == anIntArray2038[i_32_]
				&& i_30_ == anIntArray2068[i_32_]
				&& i_31_ == anIntArray2044[i_32_]) {
				aShortArray2043[i_32_] |= i_22_;
				is_18_[i_28_] = i_32_;
				break;
			    }
			}
			if (((Class177) class177_23_).anInt2080 > 0
			    && !bools[i_28_]) {
			    int i_33_
				= ((i_28_ < class177_23_.anInt2036 - 1
				    ? class177_23_.anIntArray2041[i_28_ + 1]
				    : ((Class177) class177_23_).anInt2080)
				   - class177_23_.anIntArray2041[i_28_]);
			    for (int i_34_ = 0; i_34_ < i_33_; i_34_++) {
				aFloatArray2052[((Class177) this).anInt2080]
				    = (class177_23_.aFloatArray2052
				       [(class177_23_.anIntArray2041[i_28_]
					 + i_34_)]);
				aFloatArray2046[((Class177) this).anInt2080]
				    = (class177_23_.aFloatArray2046
				       [(class177_23_.anIntArray2041[i_28_]
					 + i_34_)]);
				is_17_[((Class177) this).anInt2080]
				    = i_32_ << 16 | is[i_32_] + i_34_;
				((Class177) this).anInt2080++;
			    }
			    is_19_[i_28_] = is[i_32_];
			    is[i_32_] += i_33_;
			    bools[i_28_] = true;
			}
			if (i_32_ >= anInt2036) {
			    anIntArray2038[anInt2036] = i_29_;
			    anIntArray2068[anInt2036] = i_30_;
			    anIntArray2044[anInt2036] = i_31_;
			    aShortArray2043[anInt2036] = i_22_;
			    anIntArray2042[anInt2036]
				= (class177_23_.anIntArray2042 != null
				   ? class177_23_.anIntArray2042[i_28_] : -1);
			    is_18_[i_28_] = anInt2036;
			    anInt2036++;
			}
		    }
		}
		for (int i_35_ = 0; i_35_ < class177_23_.anInt2047; i_35_++) {
		    if (bool && class177_23_.aByteArray2054 != null)
			aByteArray2054[anInt2047]
			    = class177_23_.aByteArray2054[i_35_];
		    if (bool_10_) {
			if (class177_23_.aByteArray2048 != null)
			    aByteArray2048[anInt2047]
				= class177_23_.aByteArray2048[i_35_];
			else
			    aByteArray2048[anInt2047]
				= ((Class177) class177_23_).aByte2061;
		    }
		    if (bool_11_ && class177_23_.aByteArray2056 != null)
			aByteArray2056[anInt2047]
			    = class177_23_.aByteArray2056[i_35_];
		    if (bool_13_) {
			if (class177_23_.aShortArray2037 != null)
			    aShortArray2037[anInt2047]
				= class177_23_.aShortArray2037[i_35_];
			else
			    aShortArray2037[anInt2047] = (short) -1;
		    }
		    if (bool_14_) {
			if (class177_23_.anIntArray2060 != null)
			    anIntArray2060[anInt2047]
				= class177_23_.anIntArray2060[i_35_];
			else
			    anIntArray2060[anInt2047] = -1;
		    }
		    if (((Class177) class177_23_).anInt2080 > 0) {
			aByteArray2051[anInt2047]
			    = (byte) (class177_23_.aByteArray2051[i_35_]
				      + is_19_[(class177_23_.aShortArray2067
						[i_35_])]);
			aByteArray2075[anInt2047]
			    = (byte) (class177_23_.aByteArray2075[i_35_]
				      + is_19_[(class177_23_.aShortArray2049
						[i_35_])]);
			aByteArray2053[anInt2047]
			    = (byte) (class177_23_.aByteArray2053[i_35_]
				      + is_19_[(class177_23_.aShortArray2050
						[i_35_])]);
		    }
		    aShortArray2067[anInt2047]
			= (short) is_18_[class177_23_.aShortArray2067[i_35_]];
		    aShortArray2049[anInt2047]
			= (short) is_18_[class177_23_.aShortArray2049[i_35_]];
		    aShortArray2050[anInt2047]
			= (short) is_18_[class177_23_.aShortArray2050[i_35_]];
		    aShortArray2062[anInt2047] = i_22_;
		    aShortArray2058[anInt2047]
			= class177_23_.aShortArray2058[i_35_];
		    anInt2047++;
		}
		if (class177_23_.aClass170Array2078 != null) {
		    for (int i_36_ = 0;
			 i_36_ < class177_23_.aClass170Array2078.length;
			 i_36_++) {
			int i_37_ = is_18_[(class177_23_.aClass170Array2078
					    [i_36_].anInt1946) * 1977387945];
			int i_38_ = is_18_[(class177_23_.aClass170Array2078
					    [i_36_].anInt1945) * -1790775395];
			int i_39_ = is_18_[(class177_23_.aClass170Array2078
					    [i_36_].anInt1948) * 248261743];
			aClass170Array2078[i_7_]
			    = (class177_23_.aClass170Array2078[i_36_]
				   .method2106
			       ((class177_23_.aClass170Array2078[i_36_]
				 .anInt1954) * 1492183661 + i_24_,
				i_37_, i_38_, i_39_, 1638042338));
			i_7_++;
		    }
		}
		if (class177_23_.aClass144Array2059 != null) {
		    for (int i_40_ = 0;
			 i_40_ < class177_23_.aClass144Array2059.length;
			 i_40_++) {
			int i_41_ = is_18_[(class177_23_.aClass144Array2059
					    [i_40_].anInt1651) * 1842630443];
			aClass144Array2059[i_8_]
			    = class177_23_.aClass144Array2059[i_40_]
				  .method1711(i_41_, -1747352806);
			i_8_++;
		    }
		}
	    }
	}
	anInt2074 = anInt2036;
	if (((Class177) this).anInt2080 > 0) {
	    Class200_Sub1.method8965(is_17_, aFloatArray2052, aFloatArray2046,
				     (byte) 0);
	    int i_42_ = 0;
	    int i_43_ = 0;
	    for (/**/; i_42_ < anInt2036; i_42_++) {
		anIntArray2041[i_42_] = i_43_;
		i_43_ += is[i_42_];
	    }
	}
	int i_44_ = 0;
	int i_45_ = 0;
	for (/**/; i_44_ < i; i_44_++) {
	    short i_46_ = (short) (1 << i_44_);
	    Class177 class177_47_ = class177s[i_44_];
	    if (class177_47_ != null) {
		if (bool_12_) {
		    int i_48_ = 0;
		    while (i_48_ < class177_47_.anInt2047) {
			aShortArray2057[i_45_]
			    = (class177_47_.aShortArray2057 != null
			       ? class177_47_.aShortArray2057[i_48_]
			       : (short) -1);
			if (aShortArray2057[i_45_] > -1
			    && aShortArray2057[i_45_] < 32766)
			    aShortArray2057[i_45_]
				= (short) (aShortArray2057[i_45_]
					   + ((Class177) this).anInt2065);
			i_48_++;
			i_45_++;
		    }
		}
		for (int i_49_ = 0;
		     i_49_ < ((Class177) class177_47_).anInt2065; i_49_++) {
		    byte i_50_ = (aByteArray2076[((Class177) this).anInt2065]
				  = class177_47_.aByteArray2076[i_49_]);
		    if (i_50_ == 0) {
			aShortArray2064[((Class177) this).anInt2065]
			    = (short) method2573(class177_47_,
						 (class177_47_.aShortArray2064
						  [i_49_]),
						 i_46_);
			aShortArray2077[((Class177) this).anInt2065]
			    = (short) method2573(class177_47_,
						 (class177_47_.aShortArray2077
						  [i_49_]),
						 i_46_);
			aShortArray2069[((Class177) this).anInt2065]
			    = (short) method2573(class177_47_,
						 (class177_47_.aShortArray2069
						  [i_49_]),
						 i_46_);
		    } else if (i_50_ >= 1 && i_50_ <= 3) {
			aShortArray2064[((Class177) this).anInt2065]
			    = class177_47_.aShortArray2064[i_49_];
			aShortArray2077[((Class177) this).anInt2065]
			    = class177_47_.aShortArray2077[i_49_];
			aShortArray2069[((Class177) this).anInt2065]
			    = class177_47_.aShortArray2069[i_49_];
			anIntArray2070[((Class177) this).anInt2065]
			    = class177_47_.anIntArray2070[i_49_];
			anIntArray2071[((Class177) this).anInt2065]
			    = class177_47_.anIntArray2071[i_49_];
			anIntArray2072[((Class177) this).anInt2065]
			    = class177_47_.anIntArray2072[i_49_];
			((Class177) this).aByteArray2039[(((Class177) this)
							  .anInt2065)]
			    = ((Class177) class177_47_).aByteArray2039[i_49_];
			aByteArray2079[((Class177) this).anInt2065]
			    = class177_47_.aByteArray2079[i_49_];
			anIntArray2045[((Class177) this).anInt2065]
			    = class177_47_.anIntArray2045[i_49_];
		    } else if (i_50_ == 2) {
			anIntArray2055[((Class177) this).anInt2065]
			    = class177_47_.anIntArray2055[i_49_];
			anIntArray2032[((Class177) this).anInt2065]
			    = class177_47_.anIntArray2032[i_49_];
		    }
		    ((Class177) this).anInt2065++;
		}
	    }
	}
    }
    
    final int method2573(Class177 class177_51_, int i, short i_52_) {
	int i_53_ = class177_51_.anIntArray2038[i];
	int i_54_ = class177_51_.anIntArray2068[i];
	int i_55_ = class177_51_.anIntArray2044[i];
	for (int i_56_ = 0; i_56_ < anInt2036; i_56_++) {
	    if (i_53_ == anIntArray2038[i_56_]
		&& i_54_ == anIntArray2068[i_56_]
		&& i_55_ == anIntArray2044[i_56_]) {
		aShortArray2043[i_56_] |= i_52_;
		return i_56_;
	    }
	}
	anIntArray2038[anInt2036] = i_53_;
	anIntArray2068[anInt2036] = i_54_;
	anIntArray2044[anInt2036] = i_55_;
	aShortArray2043[anInt2036] = i_52_;
	anIntArray2042[anInt2036] = (class177_51_.anIntArray2042 != null
				     ? class177_51_.anIntArray2042[i] : -1);
	return anInt2036++;
    }
    
    public byte method2574(short i, short i_57_, short i_58_, short i_59_,
			   short i_60_, short i_61_, byte i_62_, byte i_63_,
			   byte i_64_) {
	if (((Class177) this).anInt2065 >= 255)
	    throw new IllegalStateException();
	aByteArray2076[((Class177) this).anInt2065] = (byte) 3;
	aShortArray2064[((Class177) this).anInt2065] = i;
	aShortArray2077[((Class177) this).anInt2065] = i_57_;
	aShortArray2069[((Class177) this).anInt2065] = i_58_;
	anIntArray2070[((Class177) this).anInt2065] = i_59_;
	anIntArray2071[((Class177) this).anInt2065] = i_60_;
	anIntArray2072[((Class177) this).anInt2065] = i_61_;
	((Class177) this).aByteArray2039[((Class177) this).anInt2065] = i_62_;
	aByteArray2079[((Class177) this).anInt2065] = i_63_;
	anIntArray2045[((Class177) this).anInt2065] = i_64_;
	return (byte) ((Class177) this).anInt2065++;
    }
    
    void method2575
	(ByteBuffer class528_sub42, ByteBuffer class528_sub42_65_,
	 ByteBuffer class528_sub42_66_, ByteBuffer class528_sub42_67_,
	 ByteBuffer class528_sub42_68_,
	 ByteBuffer class528_sub42_69_) {
	for (int i = 0; i < ((Class177) this).anInt2065; i++) {
	    int i_70_ = aByteArray2076[i] & 0xff;
	    if (i_70_ == 0) {
		aShortArray2064[i]
		    = (short) class528_sub42.readUnsignedShort(904973930);
		aShortArray2077[i]
		    = (short) class528_sub42.readUnsignedShort(-848325094);
		aShortArray2069[i]
		    = (short) class528_sub42.readUnsignedShort(305382897);
	    }
	    if (i_70_ == 1) {
		aShortArray2064[i]
		    = (short) class528_sub42_65_.readUnsignedShort(-2021364201);
		aShortArray2077[i]
		    = (short) class528_sub42_65_.readUnsignedShort(-1782418317);
		aShortArray2069[i]
		    = (short) class528_sub42_65_.readUnsignedShort(-1813359515);
		if (anInt2035 < 15) {
		    anIntArray2070[i]
			= class528_sub42_66_.readUnsignedShort(620562472);
		    if (anInt2035 < 14)
			anIntArray2071[i]
			    = class528_sub42_66_.readUnsignedShort(-149292995);
		    else
			anIntArray2071[i]
			    = class528_sub42_66_.readTriByte(-685818410);
		    anIntArray2072[i]
			= class528_sub42_66_.readUnsignedShort(-144885286);
		} else {
		    anIntArray2070[i]
			= class528_sub42_66_.readTriByte(160651028);
		    anIntArray2071[i]
			= class528_sub42_66_.readTriByte(-635792367);
		    anIntArray2072[i]
			= class528_sub42_66_.readTriByte(-2073188592);
		}
		((Class177) this).aByteArray2039[i]
		    = class528_sub42_67_.method9627(-1487040020);
		aByteArray2079[i] = class528_sub42_68_.method9627(-2126737885);
		anIntArray2045[i] = class528_sub42_69_.method9627(-1451060619);
	    }
	    if (i_70_ == 2) {
		aShortArray2064[i]
		    = (short) class528_sub42_65_.readUnsignedShort(-1813686476);
		aShortArray2077[i]
		    = (short) class528_sub42_65_.readUnsignedShort(931020957);
		aShortArray2069[i]
		    = (short) class528_sub42_65_.readUnsignedShort(439770657);
		if (anInt2035 < 15) {
		    anIntArray2070[i]
			= class528_sub42_66_.readUnsignedShort(194947372);
		    if (anInt2035 < 14)
			anIntArray2071[i]
			    = class528_sub42_66_.readUnsignedShort(388728656);
		    else
			anIntArray2071[i]
			    = class528_sub42_66_.readTriByte(379522454);
		    anIntArray2072[i]
			= class528_sub42_66_.readUnsignedShort(-1740991272);
		} else {
		    anIntArray2070[i]
			= class528_sub42_66_.readTriByte(-672914012);
		    anIntArray2071[i]
			= class528_sub42_66_.readTriByte(-1642894794);
		    anIntArray2072[i]
			= class528_sub42_66_.readTriByte(1652018179);
		}
		((Class177) this).aByteArray2039[i]
		    = class528_sub42_67_.method9627(-1806417626);
		aByteArray2079[i] = class528_sub42_68_.method9627(-1965541310);
		anIntArray2045[i] = class528_sub42_69_.method9627(-980721237);
		anIntArray2055[i] = class528_sub42_69_.method9627(-1493792988);
		anIntArray2032[i] = class528_sub42_69_.method9627(-1945634289);
	    }
	    if (i_70_ == 3) {
		aShortArray2064[i]
		    = (short) class528_sub42_65_.readUnsignedShort(-492298218);
		aShortArray2077[i]
		    = (short) class528_sub42_65_.readUnsignedShort(563558614);
		aShortArray2069[i]
		    = (short) class528_sub42_65_.readUnsignedShort(-1124624221);
		if (anInt2035 < 15) {
		    anIntArray2070[i]
			= class528_sub42_66_.readUnsignedShort(-915716451);
		    if (anInt2035 < 14)
			anIntArray2071[i]
			    = class528_sub42_66_.readUnsignedShort(469184608);
		    else
			anIntArray2071[i]
			    = class528_sub42_66_.readTriByte(-752357186);
		    anIntArray2072[i]
			= class528_sub42_66_.readUnsignedShort(74677997);
		} else {
		    anIntArray2070[i]
			= class528_sub42_66_.readTriByte(-1728610335);
		    anIntArray2071[i]
			= class528_sub42_66_.readTriByte(-593508038);
		    anIntArray2072[i]
			= class528_sub42_66_.readTriByte(379403835);
		}
		((Class177) this).aByteArray2039[i]
		    = class528_sub42_67_.method9627(-1788868214);
		aByteArray2079[i] = class528_sub42_68_.method9627(-1855566620);
		anIntArray2045[i] = class528_sub42_69_.method9627(-1818260538);
	    }
	}
    }
    
    public int method2576(int i, int i_71_, int i_72_) {
	for (int i_73_ = 0; i_73_ < anInt2036; i_73_++) {
	    if (anIntArray2038[i_73_] == i && anIntArray2068[i_73_] == i_71_
		&& anIntArray2044[i_73_] == i_72_)
		return i_73_;
	}
	anIntArray2038[anInt2036] = i;
	anIntArray2068[anInt2036] = i_71_;
	anIntArray2044[anInt2036] = i_72_;
	anInt2074 = anInt2036 + 1;
	return anInt2036++;
    }
    
    void method2577(ByteBuffer class528_sub42,
		    ByteBuffer class528_sub42_74_,
		    ByteBuffer class528_sub42_75_) {
	short i = 0;
	short i_76_ = 0;
	short i_77_ = 0;
	int i_78_ = 0;
	for (int i_79_ = 0; i_79_ < anInt2047; i_79_++) {
	    int i_80_ = class528_sub42_74_.readUnsignedByte((byte) 83);
	    int i_81_ = i_80_ & 0x7;
	    if (i_81_ == 1) {
		aShortArray2067[i_79_] = i
		    = (short) (class528_sub42.method9640(-1212020221) + i_78_);
		i_78_ = i;
		aShortArray2049[i_79_] = i_76_
		    = (short) (class528_sub42.method9640(-1400626877) + i_78_);
		i_78_ = i_76_;
		aShortArray2050[i_79_] = i_77_
		    = (short) (class528_sub42.method9640(-1270754483) + i_78_);
		i_78_ = i_77_;
		if (i > anInt2074)
		    anInt2074 = i;
		if (i_76_ > anInt2074)
		    anInt2074 = i_76_;
		if (i_77_ > anInt2074)
		    anInt2074 = i_77_;
	    }
	    if (i_81_ == 2) {
		i_76_ = i_77_;
		i_77_
		    = (short) (class528_sub42.method9640(-1229195536) + i_78_);
		i_78_ = i_77_;
		aShortArray2067[i_79_] = i;
		aShortArray2049[i_79_] = i_76_;
		aShortArray2050[i_79_] = i_77_;
		if (i_77_ > anInt2074)
		    anInt2074 = i_77_;
	    }
	    if (i_81_ == 3) {
		i = i_77_;
		i_77_
		    = (short) (class528_sub42.method9640(-2125275076) + i_78_);
		i_78_ = i_77_;
		aShortArray2067[i_79_] = i;
		aShortArray2049[i_79_] = i_76_;
		aShortArray2050[i_79_] = i_77_;
		if (i_77_ > anInt2074)
		    anInt2074 = i_77_;
	    }
	    if (i_81_ == 4) {
		short i_82_ = i;
		i = i_76_;
		i_76_ = i_82_;
		i_77_
		    = (short) (class528_sub42.method9640(-1165126178) + i_78_);
		i_78_ = i_77_;
		aShortArray2067[i_79_] = i;
		aShortArray2049[i_79_] = i_76_;
		aShortArray2050[i_79_] = i_77_;
		if (i_77_ > anInt2074)
		    anInt2074 = i_77_;
	    }
	    if (((Class177) this).anInt2080 > 0 && (i_80_ & 0x8) != 0) {
		aByteArray2051[i_79_]
		    = (byte) class528_sub42_75_.readUnsignedByte((byte) 62);
		aByteArray2075[i_79_]
		    = (byte) class528_sub42_75_.readUnsignedByte((byte) 72);
		aByteArray2053[i_79_]
		    = (byte) class528_sub42_75_.readUnsignedByte((byte) 59);
	    }
	}
	anInt2074++;
    }
    
    public void method2578(int i, int i_83_, int i_84_) {
	if (i_84_ != 0) {
	    int i_85_ = Class417.anIntArray4766[i_84_];
	    int i_86_ = Class417.anIntArray4767[i_84_];
	    for (int i_87_ = 0; i_87_ < anInt2036; i_87_++) {
		int i_88_ = ((anIntArray2068[i_87_] * i_85_
			      + anIntArray2038[i_87_] * i_86_)
			     >> 14);
		anIntArray2068[i_87_]
		    = (anIntArray2068[i_87_] * i_86_
		       - anIntArray2038[i_87_] * i_85_) >> 14;
		anIntArray2038[i_87_] = i_88_;
	    }
	}
	if (i != 0) {
	    int i_89_ = Class417.anIntArray4766[i];
	    int i_90_ = Class417.anIntArray4767[i];
	    for (int i_91_ = 0; i_91_ < anInt2036; i_91_++) {
		int i_92_ = ((anIntArray2068[i_91_] * i_90_
			      - anIntArray2044[i_91_] * i_89_)
			     >> 14);
		anIntArray2044[i_91_]
		    = (anIntArray2068[i_91_] * i_89_
		       + anIntArray2044[i_91_] * i_90_) >> 14;
		anIntArray2068[i_91_] = i_92_;
	    }
	}
	if (i_83_ != 0) {
	    int i_93_ = Class417.anIntArray4766[i_83_];
	    int i_94_ = Class417.anIntArray4767[i_83_];
	    for (int i_95_ = 0; i_95_ < anInt2036; i_95_++) {
		int i_96_ = ((anIntArray2044[i_95_] * i_93_
			      + anIntArray2038[i_95_] * i_94_)
			     >> 14);
		anIntArray2044[i_95_]
		    = (anIntArray2044[i_95_] * i_94_
		       - anIntArray2038[i_95_] * i_93_) >> 14;
		anIntArray2038[i_95_] = i_96_;
	    }
	}
    }
    
    public int[][] method2579(boolean bool) {
	int[] is = new int[400];
	int i = 0;
	int i_97_ = bool ? anInt2036 : anInt2074;
	for (int i_98_ = 0; i_98_ < i_97_; i_98_++) {
	    int i_99_ = anIntArray2042[i_98_];
	    if (i_99_ >= 0) {
		is[i_99_]++;
		if (i_99_ > i)
		    i = i_99_;
	    }
	}
	int[][] is_100_ = new int[i + 1][];
	for (int i_101_ = 0; i_101_ <= i; i_101_++) {
	    is_100_[i_101_] = new int[is[i_101_]];
	    is[i_101_] = 0;
	}
	for (int i_102_ = 0; i_102_ < i_97_; i_102_++) {
	    int i_103_ = anIntArray2042[i_102_];
	    if (i_103_ >= 0)
		is_100_[i_103_][is[i_103_]++] = i_102_;
	}
	return is_100_;
    }
    
    public int method2580(int i, int i_104_, int i_105_, byte i_106_,
			  byte i_107_, short i_108_, byte i_109_,
			  short i_110_) {
	aShortArray2067[anInt2047] = (short) i;
	aShortArray2049[anInt2047] = (short) i_104_;
	aShortArray2050[anInt2047] = (short) i_105_;
	aByteArray2054[anInt2047] = i_106_;
	aShortArray2057[anInt2047] = (short) i_107_;
	aShortArray2058[anInt2047] = i_108_;
	aByteArray2056[anInt2047] = i_109_;
	aShortArray2037[anInt2047] = i_110_;
	return anInt2047++;
    }
    
    public void method2581(int i) {
	for (int i_111_ = 0; i_111_ < anInt2036; i_111_++) {
	    anIntArray2038[i_111_] <<= i;
	    anIntArray2068[i_111_] <<= i;
	    anIntArray2044[i_111_] <<= i;
	}
	if (((Class177) this).anInt2065 > 0 && anIntArray2070 != null) {
	    for (int i_112_ = 0; i_112_ < anIntArray2070.length; i_112_++) {
		anIntArray2070[i_112_] <<= i;
		anIntArray2071[i_112_] <<= i;
		if (aByteArray2076[i_112_] != 1)
		    anIntArray2072[i_112_] <<= i;
	    }
	}
    }
    
    public int[][] method2582() {
	int[] is = new int[256];
	int i = 0;
	for (int i_113_ = 0; i_113_ < aClass176Array2040.length; i_113_++) {
	    int i_114_
		= ((Class176) aClass176Array2040[i_113_]).anInt2030 * 98003883;
	    if (i_114_ >= 0) {
		is[i_114_]++;
		if (i_114_ > i)
		    i = i_114_;
	    }
	}
	int[][] is_115_ = new int[i + 1][];
	for (int i_116_ = 0; i_116_ <= i; i_116_++) {
	    is_115_[i_116_] = new int[is[i_116_]];
	    is[i_116_] = 0;
	}
	for (int i_117_ = 0; i_117_ < aClass176Array2040.length; i_117_++) {
	    int i_118_
		= ((Class176) aClass176Array2040[i_117_]).anInt2030 * 98003883;
	    if (i_118_ >= 0)
		is_115_[i_118_][is[i_118_]++] = i_117_;
	}
	return is_115_;
    }
    
    public void method2583(short i, short i_119_) {
	if (aShortArray2037 != null) {
	    for (int i_120_ = 0; i_120_ < anInt2047; i_120_++) {
		if (aShortArray2037[i_120_] == i)
		    aShortArray2037[i_120_] = i_119_;
	    }
	}
    }
    
    public void method2584(short i, short i_121_) {
	for (int i_122_ = 0; i_122_ < anInt2047; i_122_++) {
	    if (aShortArray2058[i_122_] == i)
		aShortArray2058[i_122_] = i_121_;
	}
    }
    
    public Class177(byte[] is) {
	anInt2047 = 0;
	((Class177) this).aByte2061 = (byte) 0;
	((Class177) this).anInt2065 = 0;
	ByteBuffer class528_sub42 = new ByteBuffer(is);
	ByteBuffer class528_sub42_123_ = new ByteBuffer(is);
	ByteBuffer class528_sub42_124_ = new ByteBuffer(is);
	ByteBuffer class528_sub42_125_ = new ByteBuffer(is);
	ByteBuffer class528_sub42_126_ = new ByteBuffer(is);
	ByteBuffer class528_sub42_127_ = new ByteBuffer(is);
	ByteBuffer class528_sub42_128_ = new ByteBuffer(is);
	int i = class528_sub42.readUnsignedByte((byte) 23);
	if (i != 1)
	    System.out
		.println(new StringBuilder().append("").append(i).toString());
	else {
	    class528_sub42.readUnsignedByte((byte) 50);
	    anInt2035 = class528_sub42.readUnsignedByte((byte) 42);
	    class528_sub42.pointer = (is.length - 26) * 2015001547;
	    anInt2036 = class528_sub42.readUnsignedShort(-475015037);
	    anInt2047 = class528_sub42.readUnsignedShort(-1400212593);
	    ((Class177) this).anInt2065
		= class528_sub42.readUnsignedShort(-991856444);
	    int i_129_ = class528_sub42.readUnsignedByte((byte) 58);
	    boolean bool = (i_129_ & 0x1) == 1;
	    boolean bool_130_ = (i_129_ & 0x2) == 2;
	    boolean bool_131_ = (i_129_ & 0x4) == 4;
	    boolean bool_132_ = (i_129_ & 0x10) == 16;
	    boolean bool_133_ = (i_129_ & 0x20) == 32;
	    boolean bool_134_ = (i_129_ & 0x40) == 64;
	    boolean bool_135_ = (i_129_ & 0x80) == 128;
	    int i_136_ = class528_sub42.readUnsignedByte((byte) 62);
	    int i_137_ = class528_sub42.readUnsignedByte((byte) 101);
	    int i_138_ = class528_sub42.readUnsignedByte((byte) 126);
	    int i_139_ = class528_sub42.readUnsignedByte((byte) 61);
	    int i_140_ = class528_sub42.readUnsignedByte((byte) 24);
	    int i_141_ = class528_sub42.readUnsignedShort(936604928);
	    int i_142_ = class528_sub42.readUnsignedShort(-1449975876);
	    int i_143_ = class528_sub42.readUnsignedShort(-391738804);
	    int i_144_ = class528_sub42.readUnsignedShort(846126889);
	    int i_145_ = class528_sub42.readUnsignedShort(-1820178515);
	    int i_146_ = class528_sub42.readUnsignedShort(-1534911607);
	    int i_147_ = class528_sub42.readUnsignedShort(-623790394);
	    if (!bool_132_) {
		if (i_140_ == 1)
		    i_146_ = anInt2036;
		else
		    i_146_ = 0;
	    }
	    if (!bool_133_) {
		if (i_138_ == 1)
		    i_147_ = anInt2047;
		else
		    i_147_ = 0;
	    }
	    int i_148_ = 0;
	    int i_149_ = 0;
	    int i_150_ = 0;
	    if (((Class177) this).anInt2065 > 0) {
		aByteArray2076 = new byte[((Class177) this).anInt2065];
		class528_sub42.pointer = 1750037345;
		for (int i_151_ = 0; i_151_ < ((Class177) this).anInt2065;
		     i_151_++) {
		    byte i_152_ = (aByteArray2076[i_151_]
				   = class528_sub42.method9627(-1079465149));
		    if (i_152_ == 0)
			i_148_++;
		    if (i_152_ >= 1 && i_152_ <= 3)
			i_149_++;
		    if (i_152_ == 2)
			i_150_++;
		}
	    }
	    int i_153_ = 3 + ((Class177) this).anInt2065;
	    int i_154_ = i_153_;
	    i_153_ += anInt2036;
	    int i_155_ = i_153_;
	    if (bool)
		i_153_ += anInt2047;
	    int i_156_ = i_153_;
	    i_153_ += anInt2047;
	    int i_157_ = i_153_;
	    if (i_136_ == 255)
		i_153_ += anInt2047;
	    int i_158_ = i_153_;
	    i_153_ += i_147_;
	    int i_159_ = i_153_;
	    i_153_ += i_146_;
	    int i_160_ = i_153_;
	    if (i_137_ == 1)
		i_153_ += anInt2047;
	    int i_161_ = i_153_;
	    i_153_ += i_144_;
	    int i_162_ = i_153_;
	    if (i_139_ == 1)
		i_153_ += anInt2047 * 2;
	    int i_163_ = i_153_;
	    i_153_ += i_145_;
	    int i_164_ = i_153_;
	    i_153_ += anInt2047 * 2;
	    int i_165_ = i_153_;
	    i_153_ += i_141_;
	    int i_166_ = i_153_;
	    i_153_ += i_142_;
	    int i_167_ = i_153_;
	    i_153_ += i_143_;
	    int i_168_ = i_153_;
	    i_153_ += i_148_ * 6;
	    int i_169_ = i_153_;
	    i_153_ += i_149_ * 6;
	    int i_170_ = 6;
	    if (anInt2035 == 14)
		i_170_ = 7;
	    else if (anInt2035 >= 15)
		i_170_ = 9;
	    int i_171_ = i_153_;
	    i_153_ += i_149_ * i_170_;
	    int i_172_ = i_153_;
	    i_153_ += i_149_;
	    int i_173_ = i_153_;
	    i_153_ += i_149_;
	    int i_174_ = i_153_;
	    i_153_ += i_149_ + i_150_ * 2;
	    int i_175_ = i_153_;
	    int i_176_ = is.length;
	    int i_177_ = is.length;
	    int i_178_ = is.length;
	    int i_179_ = is.length;
	    if (bool_135_) {
		ByteBuffer class528_sub42_180_ = new ByteBuffer(is);
		class528_sub42_180_.pointer = (is.length - 26) * 2015001547;
		class528_sub42_180_.pointer
		    -= (is[class528_sub42_180_.pointer * -185904669 - 1]
			* 2015001547);
		((Class177) this).anInt2080
		    = class528_sub42_180_.readUnsignedShort(-767273352);
		int i_181_ = class528_sub42_180_.readUnsignedShort(-1100639167);
		int i_182_ = class528_sub42_180_.readUnsignedShort(-1400374585);
		i_176_ = i_175_ + i_181_;
		i_177_ = i_176_ + i_182_;
		i_178_ = i_177_ + anInt2036;
		i_179_ = i_178_ + ((Class177) this).anInt2080 * 2;
	    }
	    anIntArray2038 = new int[anInt2036];
	    anIntArray2068 = new int[anInt2036];
	    anIntArray2044 = new int[anInt2036];
	    aShortArray2067 = new short[anInt2047];
	    aShortArray2049 = new short[anInt2047];
	    aShortArray2050 = new short[anInt2047];
	    if (i_140_ == 1)
		anIntArray2042 = new int[anInt2036];
	    if (bool)
		aByteArray2054 = new byte[anInt2047];
	    if (i_136_ == 255)
		aByteArray2048 = new byte[anInt2047];
	    else
		((Class177) this).aByte2061 = (byte) i_136_;
	    if (i_137_ == 1)
		aByteArray2056 = new byte[anInt2047];
	    if (i_138_ == 1)
		anIntArray2060 = new int[anInt2047];
	    if (i_139_ == 1)
		aShortArray2037 = new short[anInt2047];
	    if (i_139_ == 1 && (((Class177) this).anInt2065 > 0
				|| ((Class177) this).anInt2080 > 0))
		aShortArray2057 = new short[anInt2047];
	    aShortArray2058 = new short[anInt2047];
	    if (((Class177) this).anInt2065 > 0) {
		aShortArray2064 = new short[((Class177) this).anInt2065];
		aShortArray2077 = new short[((Class177) this).anInt2065];
		aShortArray2069 = new short[((Class177) this).anInt2065];
		if (i_149_ > 0) {
		    anIntArray2070 = new int[i_149_];
		    anIntArray2071 = new int[i_149_];
		    anIntArray2072 = new int[i_149_];
		    ((Class177) this).aByteArray2039 = new byte[i_149_];
		    aByteArray2079 = new byte[i_149_];
		    anIntArray2045 = new int[i_149_];
		}
		if (i_150_ > 0) {
		    anIntArray2055 = new int[i_150_];
		    anIntArray2032 = new int[i_150_];
		}
	    }
	    class528_sub42.pointer = i_154_ * 2015001547;
	    class528_sub42_123_.pointer = i_165_ * 2015001547;
	    class528_sub42_124_.pointer = i_166_ * 2015001547;
	    class528_sub42_125_.pointer = i_167_ * 2015001547;
	    class528_sub42_126_.pointer = i_159_ * 2015001547;
	    int i_183_ = 0;
	    int i_184_ = 0;
	    int i_185_ = 0;
	    for (int i_186_ = 0; i_186_ < anInt2036; i_186_++) {
		int i_187_ = class528_sub42.readUnsignedByte((byte) 97);
		int i_188_ = 0;
		if ((i_187_ & 0x1) != 0)
		    i_188_ = class528_sub42_123_.method9640(-1207053413);
		int i_189_ = 0;
		if ((i_187_ & 0x2) != 0)
		    i_189_ = class528_sub42_124_.method9640(-1239749250);
		int i_190_ = 0;
		if ((i_187_ & 0x4) != 0)
		    i_190_ = class528_sub42_125_.method9640(-1756462560);
		anIntArray2038[i_186_] = i_183_ + i_188_;
		anIntArray2068[i_186_] = i_184_ + i_189_;
		anIntArray2044[i_186_] = i_185_ + i_190_;
		i_183_ = anIntArray2038[i_186_];
		i_184_ = anIntArray2068[i_186_];
		i_185_ = anIntArray2044[i_186_];
		if (i_140_ == 1) {
		    if (bool_132_)
			anIntArray2042[i_186_]
			    = class528_sub42_126_.method9725(-1348806709);
		    else {
			anIntArray2042[i_186_]
			    = class528_sub42_126_.readUnsignedByte((byte) 3);
			if (anIntArray2042[i_186_] == 255)
			    anIntArray2042[i_186_] = -1;
		    }
		}
	    }
	    if (((Class177) this).anInt2080 > 0) {
		class528_sub42.pointer = i_177_ * 2015001547;
		class528_sub42_123_.pointer = i_178_ * 2015001547;
		class528_sub42_124_.pointer = i_179_ * 2015001547;
		anIntArray2041 = new int[anInt2036];
		int i_191_ = 0;
		int i_192_ = 0;
		for (/**/; i_191_ < anInt2036; i_191_++) {
		    anIntArray2041[i_191_] = i_192_;
		    i_192_ += class528_sub42.readUnsignedByte((byte) 86);
		}
		aByteArray2051 = new byte[anInt2047];
		aByteArray2075 = new byte[anInt2047];
		aByteArray2053 = new byte[anInt2047];
		aFloatArray2052 = new float[((Class177) this).anInt2080];
		aFloatArray2046 = new float[((Class177) this).anInt2080];
		for (i_191_ = 0; i_191_ < ((Class177) this).anInt2080;
		     i_191_++) {
		    aFloatArray2052[i_191_]
			= ((float) class528_sub42_123_.method9642(517135887)
			   / 4096.0F);
		    aFloatArray2046[i_191_]
			= ((float) class528_sub42_124_.method9642(394202512)
			   / 4096.0F);
		}
	    }
	    class528_sub42.pointer = i_164_ * 2015001547;
	    class528_sub42_123_.pointer = i_155_ * 2015001547;
	    class528_sub42_124_.pointer = i_157_ * 2015001547;
	    class528_sub42_125_.pointer = i_160_ * 2015001547;
	    class528_sub42_126_.pointer = i_158_ * 2015001547;
	    class528_sub42_127_.pointer = i_162_ * 2015001547;
	    class528_sub42_128_.pointer = i_163_ * 2015001547;
	    for (int i_193_ = 0; i_193_ < anInt2047; i_193_++) {
		aShortArray2058[i_193_]
		    = (short) class528_sub42.readUnsignedShort(4688585);
		if (bool)
		    aByteArray2054[i_193_]
			= class528_sub42_123_.method9627(-926961842);
		if (i_136_ == 255)
		    aByteArray2048[i_193_]
			= class528_sub42_124_.method9627(-1225132066);
		if (i_137_ == 1)
		    aByteArray2056[i_193_]
			= class528_sub42_125_.method9627(-1974953687);
		if (i_138_ == 1) {
		    if (bool_133_)
			anIntArray2060[i_193_]
			    = class528_sub42_126_.method9725(-1514729314);
		    else {
			anIntArray2060[i_193_]
			    = class528_sub42_126_.readUnsignedByte((byte) 42);
			if (anIntArray2060[i_193_] == 255)
			    anIntArray2060[i_193_] = -1;
		    }
		}
		if (i_139_ == 1)
		    aShortArray2037[i_193_]
			= (short) (class528_sub42_127_.readUnsignedShort(333624210)
				   - 1);
		if (aShortArray2057 != null) {
		    if (aShortArray2037[i_193_] != -1) {
			if (anInt2035 >= 16)
			    aShortArray2057[i_193_]
				= (short) (class528_sub42_128_
					       .method9719(65280)
					   - 1);
			else
			    aShortArray2057[i_193_]
				= (short) (class528_sub42_128_
					       .readUnsignedByte((byte) 43)
					   - 1);
		    } else
			aShortArray2057[i_193_] = (short) -1;
		}
	    }
	    anInt2074 = -1;
	    class528_sub42.pointer = i_161_ * 2015001547;
	    class528_sub42_123_.pointer = i_156_ * 2015001547;
	    class528_sub42_124_.pointer = i_176_ * 2015001547;
	    method2577(class528_sub42, class528_sub42_123_,
		       class528_sub42_124_);
	    class528_sub42.pointer = i_168_ * 2015001547;
	    class528_sub42_123_.pointer = i_169_ * 2015001547;
	    class528_sub42_124_.pointer = i_171_ * 2015001547;
	    class528_sub42_125_.pointer = i_172_ * 2015001547;
	    class528_sub42_126_.pointer = i_173_ * 2015001547;
	    class528_sub42_127_.pointer = i_174_ * 2015001547;
	    method2575(class528_sub42, class528_sub42_123_,
		       class528_sub42_124_, class528_sub42_125_,
		       class528_sub42_126_, class528_sub42_127_);
	    class528_sub42.pointer = i_175_ * 2015001547;
	    if (bool_130_) {
		int i_194_ = class528_sub42.readUnsignedByte((byte) 79);
		if (i_194_ > 0) {
		    aClass170Array2078 = new Class170[i_194_];
		    for (int i_195_ = 0; i_195_ < i_194_; i_195_++) {
			int i_196_ = class528_sub42.readUnsignedShort(902745583);
			int i_197_ = class528_sub42.readUnsignedShort(-1919443591);
			byte i_198_;
			if (i_136_ == 255)
			    i_198_ = aByteArray2048[i_197_];
			else
			    i_198_ = (byte) i_136_;
			aClass170Array2078[i_195_]
			    = new Class170(i_196_, i_197_,
					   aShortArray2067[i_197_],
					   aShortArray2049[i_197_],
					   aShortArray2050[i_197_], i_198_);
		    }
		}
		int i_199_ = class528_sub42.readUnsignedByte((byte) 54);
		if (i_199_ > 0) {
		    aClass144Array2059 = new Class144[i_199_];
		    for (int i_200_ = 0; i_200_ < i_199_; i_200_++) {
			int i_201_ = class528_sub42.readUnsignedShort(-1366544920);
			int i_202_ = class528_sub42.readUnsignedShort(-962629956);
			aClass144Array2059[i_200_]
			    = new Class144(i_201_, i_202_);
		    }
		}
	    }
	    if (bool_131_) {
		int i_203_ = class528_sub42.readUnsignedByte((byte) 34);
		if (i_203_ > 0) {
		    aClass176Array2040 = new Class176[i_203_];
		    for (int i_204_ = 0; i_204_ < i_203_; i_204_++) {
			int i_205_ = class528_sub42.readUnsignedShort(41368558);
			int i_206_ = class528_sub42.readUnsignedShort(552360911);
			int i_207_;
			if (bool_134_)
			    i_207_ = class528_sub42.method9725(-1155828658);
			else {
			    i_207_ = class528_sub42.readUnsignedByte((byte) 114);
			    if (i_207_ == 255)
				i_207_ = -1;
			}
			byte i_208_ = class528_sub42.method9627(-1040816962);
			aClass176Array2040[i_204_]
			    = new Class176(i_205_, i_206_, i_207_, i_208_);
		    }
		}
	    }
	}
    }
    
    public void method2585(int i) {
	for (int i_209_ = 0; i_209_ < anInt2036; i_209_++) {
	    anIntArray2038[i_209_] <<= i;
	    anIntArray2068[i_209_] <<= i;
	    anIntArray2044[i_209_] <<= i;
	}
	if (((Class177) this).anInt2065 > 0 && anIntArray2070 != null) {
	    for (int i_210_ = 0; i_210_ < anIntArray2070.length; i_210_++) {
		anIntArray2070[i_210_] <<= i;
		anIntArray2071[i_210_] <<= i;
		if (aByteArray2076[i_210_] != 1)
		    anIntArray2072[i_210_] <<= i;
	    }
	}
    }
    
    public void method2586(float f) {
	for (int i = 0; i < anInt2036; i++) {
	    anIntArray2038[i] *= f;
	    anIntArray2068[i] *= f;
	    anIntArray2044[i] *= f;
	}
	if (((Class177) this).anInt2065 > 0 && anIntArray2070 != null) {
	    for (int i = 0; i < anIntArray2070.length; i++) {
		anIntArray2070[i] *= f;
		anIntArray2071[i] *= f;
		if (aByteArray2076[i] != 1)
		    anIntArray2072[i] *= f;
	    }
	}
    }
    
    public int method2587(int i, int i_211_, int i_212_) {
	for (int i_213_ = 0; i_213_ < anInt2036; i_213_++) {
	    if (anIntArray2038[i_213_] == i && anIntArray2068[i_213_] == i_211_
		&& anIntArray2044[i_213_] == i_212_)
		return i_213_;
	}
	anIntArray2038[anInt2036] = i;
	anIntArray2068[anInt2036] = i_211_;
	anIntArray2044[anInt2036] = i_212_;
	anInt2074 = anInt2036 + 1;
	return anInt2036++;
    }
    
    public void method2588(int i, int i_214_, int i_215_) {
	for (int i_216_ = 0; i_216_ < anInt2036; i_216_++) {
	    anIntArray2038[i_216_] += i;
	    anIntArray2068[i_216_] += i_214_;
	    anIntArray2044[i_216_] += i_215_;
	}
    }
    
    public void method2589(int i, int i_217_, int i_218_) {
	if (i_218_ != 0) {
	    int i_219_ = Class417.anIntArray4766[i_218_];
	    int i_220_ = Class417.anIntArray4767[i_218_];
	    for (int i_221_ = 0; i_221_ < anInt2036; i_221_++) {
		int i_222_ = ((anIntArray2068[i_221_] * i_219_
			       + anIntArray2038[i_221_] * i_220_)
			      >> 14);
		anIntArray2068[i_221_]
		    = (anIntArray2068[i_221_] * i_220_
		       - anIntArray2038[i_221_] * i_219_) >> 14;
		anIntArray2038[i_221_] = i_222_;
	    }
	}
	if (i != 0) {
	    int i_223_ = Class417.anIntArray4766[i];
	    int i_224_ = Class417.anIntArray4767[i];
	    for (int i_225_ = 0; i_225_ < anInt2036; i_225_++) {
		int i_226_ = ((anIntArray2068[i_225_] * i_224_
			       - anIntArray2044[i_225_] * i_223_)
			      >> 14);
		anIntArray2044[i_225_]
		    = (anIntArray2068[i_225_] * i_223_
		       + anIntArray2044[i_225_] * i_224_) >> 14;
		anIntArray2068[i_225_] = i_226_;
	    }
	}
	if (i_217_ != 0) {
	    int i_227_ = Class417.anIntArray4766[i_217_];
	    int i_228_ = Class417.anIntArray4767[i_217_];
	    for (int i_229_ = 0; i_229_ < anInt2036; i_229_++) {
		int i_230_ = ((anIntArray2044[i_229_] * i_227_
			       + anIntArray2038[i_229_] * i_228_)
			      >> 14);
		anIntArray2044[i_229_]
		    = (anIntArray2044[i_229_] * i_228_
		       - anIntArray2038[i_229_] * i_227_) >> 14;
		anIntArray2038[i_229_] = i_230_;
	    }
	}
    }
    
    public static Class177 method2590(Class446 class446, int i, int i_231_) {
	byte[] is = class446.method5348(i, i_231_, -318270019);
	if (is == null)
	    return null;
	return new Class177(is);
    }
    
    public void method2591(int i, int i_232_, int i_233_) {
	for (int i_234_ = 0; i_234_ < anInt2036; i_234_++) {
	    anIntArray2038[i_234_] += i;
	    anIntArray2068[i_234_] += i_232_;
	    anIntArray2044[i_234_] += i_233_;
	}
    }
    
    public int method2592(int i, int i_235_, int i_236_) {
	for (int i_237_ = 0; i_237_ < anInt2036; i_237_++) {
	    if (anIntArray2038[i_237_] == i && anIntArray2068[i_237_] == i_235_
		&& anIntArray2044[i_237_] == i_236_)
		return i_237_;
	}
	anIntArray2038[anInt2036] = i;
	anIntArray2068[anInt2036] = i_235_;
	anIntArray2044[anInt2036] = i_236_;
	anInt2074 = anInt2036 + 1;
	return anInt2036++;
    }
    
    public void method2593(int i, int i_238_, int i_239_) {
	if (i_239_ != 0) {
	    int i_240_ = Class417.anIntArray4766[i_239_];
	    int i_241_ = Class417.anIntArray4767[i_239_];
	    for (int i_242_ = 0; i_242_ < anInt2036; i_242_++) {
		int i_243_ = ((anIntArray2068[i_242_] * i_240_
			       + anIntArray2038[i_242_] * i_241_)
			      >> 14);
		anIntArray2068[i_242_]
		    = (anIntArray2068[i_242_] * i_241_
		       - anIntArray2038[i_242_] * i_240_) >> 14;
		anIntArray2038[i_242_] = i_243_;
	    }
	}
	if (i != 0) {
	    int i_244_ = Class417.anIntArray4766[i];
	    int i_245_ = Class417.anIntArray4767[i];
	    for (int i_246_ = 0; i_246_ < anInt2036; i_246_++) {
		int i_247_ = ((anIntArray2068[i_246_] * i_245_
			       - anIntArray2044[i_246_] * i_244_)
			      >> 14);
		anIntArray2044[i_246_]
		    = (anIntArray2068[i_246_] * i_244_
		       + anIntArray2044[i_246_] * i_245_) >> 14;
		anIntArray2068[i_246_] = i_247_;
	    }
	}
	if (i_238_ != 0) {
	    int i_248_ = Class417.anIntArray4766[i_238_];
	    int i_249_ = Class417.anIntArray4767[i_238_];
	    for (int i_250_ = 0; i_250_ < anInt2036; i_250_++) {
		int i_251_ = ((anIntArray2044[i_250_] * i_248_
			       + anIntArray2038[i_250_] * i_249_)
			      >> 14);
		anIntArray2044[i_250_]
		    = (anIntArray2044[i_250_] * i_249_
		       - anIntArray2038[i_250_] * i_248_) >> 14;
		anIntArray2038[i_250_] = i_251_;
	    }
	}
    }
    
    public void method2594(int i) {
	for (int i_252_ = 0; i_252_ < anInt2036; i_252_++) {
	    anIntArray2038[i_252_] <<= i;
	    anIntArray2068[i_252_] <<= i;
	    anIntArray2044[i_252_] <<= i;
	}
	if (((Class177) this).anInt2065 > 0 && anIntArray2070 != null) {
	    for (int i_253_ = 0; i_253_ < anIntArray2070.length; i_253_++) {
		anIntArray2070[i_253_] <<= i;
		anIntArray2071[i_253_] <<= i;
		if (aByteArray2076[i_253_] != 1)
		    anIntArray2072[i_253_] <<= i;
	    }
	}
    }
    
    public void method2595(int i) {
	for (int i_254_ = 0; i_254_ < anInt2036; i_254_++) {
	    anIntArray2038[i_254_] <<= i;
	    anIntArray2068[i_254_] <<= i;
	    anIntArray2044[i_254_] <<= i;
	}
	if (((Class177) this).anInt2065 > 0 && anIntArray2070 != null) {
	    for (int i_255_ = 0; i_255_ < anIntArray2070.length; i_255_++) {
		anIntArray2070[i_255_] <<= i;
		anIntArray2071[i_255_] <<= i;
		if (aByteArray2076[i_255_] != 1)
		    anIntArray2072[i_255_] <<= i;
	    }
	}
    }
    
    public int[][] method2596() {
	int[] is = new int[256];
	int i = 0;
	for (int i_256_ = 0; i_256_ < anInt2047; i_256_++) {
	    int i_257_ = anIntArray2060[i_256_];
	    if (i_257_ >= 0) {
		is[i_257_]++;
		if (i_257_ > i)
		    i = i_257_;
	    }
	}
	int[][] is_258_ = new int[i + 1][];
	for (int i_259_ = 0; i_259_ <= i; i_259_++) {
	    is_258_[i_259_] = new int[is[i_259_]];
	    is[i_259_] = 0;
	}
	for (int i_260_ = 0; i_260_ < anInt2047; i_260_++) {
	    int i_261_ = anIntArray2060[i_260_];
	    if (i_261_ >= 0)
		is_258_[i_261_][is[i_261_]++] = i_260_;
	}
	return is_258_;
    }
    
    public int method2597(int i, int i_262_, int i_263_) {
	for (int i_264_ = 0; i_264_ < anInt2036; i_264_++) {
	    if (anIntArray2038[i_264_] == i && anIntArray2068[i_264_] == i_262_
		&& anIntArray2044[i_264_] == i_263_)
		return i_264_;
	}
	anIntArray2038[anInt2036] = i;
	anIntArray2068[anInt2036] = i_262_;
	anIntArray2044[anInt2036] = i_263_;
	anInt2074 = anInt2036 + 1;
	return anInt2036++;
    }
}
