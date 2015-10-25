/* Class157_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class157_Sub1 extends Class157
{
    int anInt9031;
    static final int anInt9032 = 7;
    int[][] anIntArrayArray9033;
    int anInt9034;
    int anInt9035;
    short aShort9036;
    short aShort9037;
    short[] aShortArray9038;
    int anInt9039;
    int[] anIntArray9040;
    int[] anIntArray9041;
    int[] anIntArray9042;
    short[] aShortArray9043;
    short[] aShortArray9044;
    Class354 aClass354_9045;
    boolean aBool9046;
    short[] aShortArray9047;
    short[] aShortArray9048;
    short[] aShortArray9049;
    Class354 aClass354_9050;
    boolean aBool9051;
    byte[] aByteArray9052;
    float[] aFloatArray9053;
    Class352 aClass352_9054;
    int anInt9055;
    int anInt9056;
    short[] aShortArray9057;
    byte[] aByteArray9058;
    short[] aShortArray9059;
    int anInt9060;
    float[] aFloatArray9061;
    short[] aShortArray9062;
    int[][] anIntArrayArray9063;
    short[] aShortArray9064;
    int anInt9065;
    int anInt9066;
    int[] anIntArray9067;
    Class173_Sub1 aClass173_Sub1_9068;
    Class354 aClass354_9069;
    boolean aBool9070;
    boolean aBool9071;
    int[] anIntArray9072;
    boolean aBool9073;
    static final int anInt9074 = 4;
    Class144[] aClass144Array9075;
    int[] anIntArray9076;
    int anInt9077;
    Class348[] aClass348Array9078;
    int anInt9079;
    int anInt9080;
    int anInt9081;
    int anInt9082;
    boolean aBool9083;
    int anInt9084;
    int[] anIntArray9085;
    Class354 aClass354_9086;
    int[] anIntArray9087;
    int anInt9088 = 0;
    short[] aShortArray9089;
    Class170[] aClass170Array9090;
    short[] aShortArray9091;
    int anInt9092;
    int anInt9093;
    Class328[] aClass328Array9094;
    int[][] anIntArrayArray9095;
    long[] aLongArray9096;
    float[] aFloatArray9097;
    int[] anIntArray9098;
    int[] anIntArray9099;
    int[] anIntArray9100;
    Class339 aClass339_9101;
    int[] anIntArray9102;
    int anInt9103;
    int anInt9104;
    short[] aShortArray9105;
    boolean aBool9106;
    static Class346 aClass346_9107;
    
    void method8352() {
	if (((Class157_Sub1) this).aBool9071) {
	    ((Class157_Sub1) this).aBool9071 = false;
	    if (((Class157_Sub1) this).aClass170Array9090 == null
		&& ((Class157_Sub1) this).aClass144Array9075 == null
		&& ((Class157_Sub1) this).aClass348Array9078 == null
		&& !Class338.method4382(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		boolean bool = false;
		boolean bool_0_ = false;
		boolean bool_1_ = false;
		if (((Class157_Sub1) this).anIntArray9040 != null
		    && !Class338.method4381(((Class157_Sub1) this).anInt9034,
					    (((Class157_Sub1) this)
					     .anInt9035))) {
		    if (((Class157_Sub1) this).aClass354_9045 == null
			|| ((Class157_Sub1) this).aClass354_9045
			       .method4573()) {
			if (!((Class157_Sub1) this).aBool9046)
			    method8358();
			bool = true;
		    } else
			((Class157_Sub1) this).aBool9071 = true;
		}
		if (((Class157_Sub1) this).anIntArray9041 != null
		    && !Class338.method4401(((Class157_Sub1) this).anInt9034,
					    (((Class157_Sub1) this)
					     .anInt9035))) {
		    if (((Class157_Sub1) this).aClass354_9045 == null
			|| ((Class157_Sub1) this).aClass354_9045
			       .method4573()) {
			if (!((Class157_Sub1) this).aBool9046)
			    method8358();
			bool_0_ = true;
		    } else
			((Class157_Sub1) this).aBool9071 = true;
		}
		if (((Class157_Sub1) this).anIntArray9042 != null
		    && !Class338.method4402(((Class157_Sub1) this).anInt9034,
					    (((Class157_Sub1) this)
					     .anInt9035))) {
		    if (((Class157_Sub1) this).aClass354_9045 == null
			|| ((Class157_Sub1) this).aClass354_9045
			       .method4573()) {
			if (!((Class157_Sub1) this).aBool9046)
			    method8358();
			bool_1_ = true;
		    } else
			((Class157_Sub1) this).aBool9071 = true;
		}
		if (bool)
		    ((Class157_Sub1) this).anIntArray9040 = null;
		if (bool_0_)
		    ((Class157_Sub1) this).anIntArray9041 = null;
		if (bool_1_)
		    ((Class157_Sub1) this).anIntArray9042 = null;
	    }
	    if (((Class157_Sub1) this).aShortArray9089 != null
		&& ((Class157_Sub1) this).anIntArray9040 == null
		&& ((Class157_Sub1) this).anIntArray9041 == null
		&& ((Class157_Sub1) this).anIntArray9042 == null) {
		((Class157_Sub1) this).aShortArray9089 = null;
		((Class157_Sub1) this).anIntArray9100 = null;
	    }
	while_34_:
	    do {
		if (((Class157_Sub1) this).aByteArray9052 != null
		    && !Class338.method4478(((Class157_Sub1) this).anInt9034,
					    (((Class157_Sub1) this)
					     .anInt9035))) {
		    do {
			if ((((Class157_Sub1) this).anInt9035 & 0x37) != 0) {
			    if (((Class157_Sub1) this).aClass354_9086 != null
				&& !((Class157_Sub1) this).aClass354_9086
					.method4573())
				break;
			} else if ((((Class157_Sub1) this).aClass354_9050
				    != null)
				   && !((Class157_Sub1) this)
					   .aClass354_9050.method4573())
			    break;
			((Class157_Sub1) this).aShortArray9038 = null;
			((Class157_Sub1) this).aShortArray9049 = null;
			((Class157_Sub1) this).aShortArray9048 = null;
			((Class157_Sub1) this).aByteArray9052 = null;
			break while_34_;
		    } while (false);
		    ((Class157_Sub1) this).aBool9071 = true;
		}
	    } while (false);
	    if (((Class157_Sub1) this).aShortArray9057 != null
		&& !Class338.method4404(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		if (((Class157_Sub1) this).aClass354_9050 == null
		    || ((Class157_Sub1) this).aClass354_9050.method4573())
		    ((Class157_Sub1) this).aShortArray9057 = null;
		else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aByteArray9058 != null
		&& !Class338.method4405(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		if (((Class157_Sub1) this).aClass354_9050 == null
		    || ((Class157_Sub1) this).aClass354_9050.method4573())
		    ((Class157_Sub1) this).aByteArray9058 = null;
		else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aFloatArray9061 != null
		&& !Class338.method4406(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		if (((Class157_Sub1) this).aClass354_9069 == null
		    || ((Class157_Sub1) this).aClass354_9069.method4573()) {
		    ((Class157_Sub1) this).aFloatArray9053 = null;
		    ((Class157_Sub1) this).aFloatArray9061 = null;
		} else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aShortArray9062 != null
		&& !Class338.method4410(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		if (((Class157_Sub1) this).aClass354_9050 == null
		    || ((Class157_Sub1) this).aClass354_9050.method4573())
		    ((Class157_Sub1) this).aShortArray9062 = null;
		else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aShortArray9059 != null
		&& !Class338.method4409(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		if ((((Class157_Sub1) this).aClass339_9101 == null
		     || ((Class157_Sub1) this).aClass339_9101.method4481())
		    && (((Class157_Sub1) this).aClass354_9050 == null
			|| ((Class157_Sub1) this).aClass354_9050
			       .method4573())) {
		    ((Class157_Sub1) this).aShortArray9091 = null;
		    ((Class157_Sub1) this).aShortArray9105 = null;
		    ((Class157_Sub1) this).aShortArray9059 = null;
		} else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aShortArray9043 != null) {
		if (((Class157_Sub1) this).aClass354_9045 == null
		    || ((Class157_Sub1) this).aClass354_9045.method4573())
		    ((Class157_Sub1) this).aShortArray9043 = null;
		else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aShortArray9047 != null) {
		if (((Class157_Sub1) this).aClass354_9050 == null
		    || ((Class157_Sub1) this).aClass354_9050.method4573())
		    ((Class157_Sub1) this).aShortArray9047 = null;
		else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).anIntArrayArray9063 != null
		&& !Class338.method4438(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		((Class157_Sub1) this).anIntArrayArray9063 = null;
		((Class157_Sub1) this).aShortArray9064 = null;
	    }
	    if (((Class157_Sub1) this).anIntArrayArray9033 != null
		&& !Class338.method4453(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		((Class157_Sub1) this).anIntArrayArray9033 = null;
		((Class157_Sub1) this).aShortArray9044 = null;
	    }
	    if (((Class157_Sub1) this).anIntArrayArray9095 != null
		&& !Class338.method4435(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035))
		((Class157_Sub1) this).anIntArrayArray9095 = null;
	    if (((Class157_Sub1) this).anIntArray9085 != null
		&& (((Class157_Sub1) this).anInt9034 & 0x800) == 0
		&& (((Class157_Sub1) this).anInt9034 & 0x40000) == 0) {
		((Class157_Sub1) this).anIntArray9085 = null;
		((Class157_Sub1) this).anIntArray9087 = null;
		((Class157_Sub1) this).anIntArray9099 = null;
	    }
	}
    }
    
    Class157_Sub1(Class173_Sub1 class173_sub1, Class177 class177, int i,
		  int i_2_, int i_3_, int i_4_) {
	this(class173_sub1, i, i_4_, true, false);
	Class165 class165 = class173_sub1.aClass165_1984;
	Interface44 interface44 = class173_sub1.anInterface44_1983;
	int[] is = new int[class177.anInt2047];
	((Class157_Sub1) this).anIntArray9100
	    = new int[class177.anInt2074 + 1];
	for (int i_5_ = 0; i_5_ < class177.anInt2047; i_5_++) {
	    if (class177.aByteArray2054 == null
		|| class177.aByteArray2054[i_5_] != 2) {
		if (class177.aShortArray2037 != null
		    && class177.aShortArray2037[i_5_] != -1) {
		    Class160 class160
			= class165.method2093((class177.aShortArray2037[i_5_]
					       & 0xffff),
					      (byte) -31);
		    if (((((Class157_Sub1) this).anInt9035 & 0x40) == 0
			 || !class160.aBool1800)
			&& class160.aBool1798)
			continue;
		}
		is[((Class157_Sub1) this).anInt9055++] = i_5_;
		((Class157_Sub1) this).anIntArray9100[(class177.aShortArray2067
						       [i_5_])]++;
		((Class157_Sub1) this).anIntArray9100[(class177.aShortArray2049
						       [i_5_])]++;
		((Class157_Sub1) this).anIntArray9100[(class177.aShortArray2050
						       [i_5_])]++;
	    }
	}
	((Class157_Sub1) this).anInt9056 = ((Class157_Sub1) this).anInt9055;
	long[] ls = new long[((Class157_Sub1) this).anInt9055];
	boolean bool = (((Class157_Sub1) this).anInt9034 & 0x100) != 0;
	for (int i_6_ = 0; i_6_ < ((Class157_Sub1) this).anInt9055; i_6_++) {
	    int i_7_ = is[i_6_];
	    Class160 class160 = null;
	    int i_8_ = 0;
	    int i_9_ = 0;
	    int i_10_ = 0;
	    int i_11_ = 0;
	    if (class177.aClass176Array2040 != null) {
		boolean bool_12_ = false;
		for (int i_13_ = 0; i_13_ < class177.aClass176Array2040.length;
		     i_13_++) {
		    Class176 class176 = class177.aClass176Array2040[i_13_];
		    if (i_7_ == class176.anInt2026 * 967499851) {
			Class391 class391
			    = interface44.method324((class176.anInt2028
						     * 1984522459),
						    184556649);
			if (class391.aBool4119)
			    bool_12_ = true;
			if (class391.anInt4113 * 176412091 != -1) {
			    Class160 class160_14_
				= class165.method2093((class391.anInt4113
						       * 176412091),
						      (byte) -53);
			    if (class160_14_.aClass583_1771
				== Class583.aClass583_7697)
				((Class157_Sub1) this).aBool9051 = true;
			}
		    }
		}
		if (bool_12_) {
		    ls[i_6_] = 9223372036854775807L;
		    ((Class157_Sub1) this).anInt9056--;
		    continue;
		}
	    }
	    if (class177.aClass170Array2078 != null) {
		boolean bool_15_ = false;
		for (int i_16_ = 0; i_16_ < class177.aClass170Array2078.length;
		     i_16_++) {
		    Class170 class170 = class177.aClass170Array2078[i_16_];
		    if (i_7_ == class170.anInt1954 * 1492183661) {
			Class386 class386
			    = (((Class157_Sub1) this).aClass173_Sub1_9068
				   .anInterface45_2005.method326
			       (class170.anInt1957 * 1262475263, (byte) -7));
			if (class386.aBool4043)
			    bool_15_ = true;
		    }
		}
		if (bool_15_) {
		    ls[i_6_] = 9223372036854775807L;
		    ((Class157_Sub1) this).anInt9056--;
		    continue;
		}
	    }
	    int i_17_ = -1;
	    if (class177.aShortArray2037 != null) {
		i_17_ = class177.aShortArray2037[i_7_];
		if (i_17_ != -1) {
		    class160 = class165.method2093(i_17_ & 0xffff, (byte) -51);
		    if ((((Class157_Sub1) this).anInt9035 & 0x40) == 0
			|| !class160.aBool1800) {
			i_10_ = class160.aByte1790;
			i_11_ = class160.aByte1796;
		    } else {
			i_17_ = -1;
			class160 = null;
		    }
		}
	    }
	    boolean bool_18_
		= ((class177.aByteArray2056 != null
		    && class177.aByteArray2056[i_7_] != 0)
		   || (class160 != null
		       && class160.aClass583_1771 != Class583.aClass583_7695));
	    if ((bool || bool_18_) && class177.aByteArray2048 != null)
		i_8_ += class177.aByteArray2048[i_7_] << 17;
	    if (bool_18_)
		i_8_ += 65536;
	    i_8_ += (i_10_ & 0xff) << 8;
	    i_8_ += i_11_ & 0xff;
	    i_9_ += (i_17_ & 0xffff) << 16;
	    i_9_ += i_6_ & 0xffff;
	    ls[i_6_] = ((long) i_8_ << 32) + (long) i_9_;
	    ((Class157_Sub1) this).aBool9051 |= bool_18_;
	    Class157_Sub1 class157_sub1_19_ = this;
	    ((Class157_Sub1) class157_sub1_19_).aBool9073
		= (((Class157_Sub1) class157_sub1_19_).aBool9073
		   | (class160 != null && (class160.aByte1775 != 0
					   || class160.aByte1776 != 0)));
	}
	Class650.method7737(ls, is, 1282251543);
	((Class157_Sub1) this).anInt9088 = class177.anInt2036;
	((Class157_Sub1) this).anInt9039 = class177.anInt2074;
	((Class157_Sub1) this).anIntArray9040 = class177.anIntArray2038;
	((Class157_Sub1) this).anIntArray9041 = class177.anIntArray2068;
	((Class157_Sub1) this).anIntArray9042 = class177.anIntArray2044;
	((Class157_Sub1) this).aShortArray9044 = class177.aShortArray2043;
	Class367[] class367s = new Class367[((Class157_Sub1) this).anInt9039];
	((Class157_Sub1) this).aClass170Array9090
	    = class177.aClass170Array2078;
	((Class157_Sub1) this).aClass144Array9075
	    = class177.aClass144Array2059;
	if (class177.aClass176Array2040 != null) {
	    ((Class157_Sub1) this).anInt9092
		= class177.aClass176Array2040.length;
	    ((Class157_Sub1) this).aClass348Array9078
		= new Class348[((Class157_Sub1) this).anInt9092];
	    ((Class157_Sub1) this).aClass328Array9094
		= new Class328[((Class157_Sub1) this).anInt9092];
	    for (int i_20_ = 0; i_20_ < ((Class157_Sub1) this).anInt9092;
		 i_20_++) {
		Class176 class176 = class177.aClass176Array2040[i_20_];
		Class391 class391
		    = interface44.method324(class176.anInt2028 * 1984522459,
					    -676498210);
		int i_21_ = -1;
		for (int i_22_ = 0; i_22_ < ((Class157_Sub1) this).anInt9055;
		     i_22_++) {
		    if (is[i_22_] == class176.anInt2026 * 967499851) {
			i_21_ = i_22_;
			break;
		    }
		}
		if (i_21_ == -1)
		    throw new RuntimeException();
		int i_23_ = ((Class649.anIntArray8420
			      [(class177.aShortArray2058
				[class176.anInt2026 * 967499851]) & 0xffff])
			     & 0xffffff);
		i_23_ = i_23_ | 255 - (class177.aByteArray2056 != null
				       ? (class177.aByteArray2056
					  [class176.anInt2026 * 967499851])
				       : 0) << 24;
		((Class157_Sub1) this).aClass348Array9078[i_20_]
		    = new Class348(i_21_,
				   (class177.aShortArray2067
				    [class176.anInt2026 * 967499851]),
				   (class177.aShortArray2049
				    [class176.anInt2026 * 967499851]),
				   (class177.aShortArray2050
				    [class176.anInt2026 * 967499851]),
				   class391.anInt4112 * 313007929,
				   class391.anInt4116 * 20092487,
				   class391.anInt4113 * 176412091,
				   class391.anInt4117 * -1868657835,
				   class391.anInt4115 * 545277371,
				   class391.aBool4119, class391.aBool4118,
				   class176.anInt2029 * -530518277);
		((Class157_Sub1) this).aClass328Array9094[i_20_]
		    = new Class328(i_23_);
	    }
	}
	int i_24_ = ((Class157_Sub1) this).anInt9055 * 3;
	((Class157_Sub1) this).aShortArray9043 = new short[i_24_];
	((Class157_Sub1) this).aShortArray9047 = new short[i_24_];
	((Class157_Sub1) this).aShortArray9048 = new short[i_24_];
	((Class157_Sub1) this).aShortArray9049 = new short[i_24_];
	((Class157_Sub1) this).aShortArray9038 = new short[i_24_];
	((Class157_Sub1) this).aByteArray9052 = new byte[i_24_];
	((Class157_Sub1) this).aFloatArray9061 = new float[i_24_];
	((Class157_Sub1) this).aFloatArray9053 = new float[i_24_];
	((Class157_Sub1) this).aShortArray9057
	    = new short[((Class157_Sub1) this).anInt9055];
	((Class157_Sub1) this).aByteArray9058
	    = new byte[((Class157_Sub1) this).anInt9055];
	((Class157_Sub1) this).aShortArray9059
	    = new short[((Class157_Sub1) this).anInt9055];
	((Class157_Sub1) this).aShortArray9105
	    = new short[((Class157_Sub1) this).anInt9055];
	((Class157_Sub1) this).aShortArray9091
	    = new short[((Class157_Sub1) this).anInt9055];
	((Class157_Sub1) this).aShortArray9062
	    = new short[((Class157_Sub1) this).anInt9055];
	if (class177.aShortArray2062 != null)
	    ((Class157_Sub1) this).aShortArray9064
		= new short[((Class157_Sub1) this).anInt9055];
	((Class157_Sub1) this).aShort9036 = (short) i_2_;
	((Class157_Sub1) this).aShort9037 = (short) i_3_;
	((Class157_Sub1) this).aShortArray9089 = new short[i_24_];
	((Class157_Sub1) this).aLongArray9096 = new long[i_24_];
	int i_25_ = 0;
	for (int i_26_ = 0; i_26_ < class177.anInt2074; i_26_++) {
	    int i_27_ = ((Class157_Sub1) this).anIntArray9100[i_26_];
	    ((Class157_Sub1) this).anIntArray9100[i_26_] = i_25_;
	    i_25_ += i_27_;
	    class367s[i_26_] = new Class367();
	}
	((Class157_Sub1) this).anIntArray9100[class177.anInt2074] = i_25_;
	Class167 class167
	    = method1881(class177, is, ((Class157_Sub1) this).anInt9055);
	Class366[] class366s = new Class366[class177.anInt2047];
	for (int i_28_ = 0; i_28_ < class177.anInt2047; i_28_++) {
	    short i_29_ = class177.aShortArray2067[i_28_];
	    short i_30_ = class177.aShortArray2049[i_28_];
	    short i_31_ = class177.aShortArray2050[i_28_];
	    int i_32_ = (((Class157_Sub1) this).anIntArray9040[i_30_]
			 - ((Class157_Sub1) this).anIntArray9040[i_29_]);
	    int i_33_ = (((Class157_Sub1) this).anIntArray9041[i_30_]
			 - ((Class157_Sub1) this).anIntArray9041[i_29_]);
	    int i_34_ = (((Class157_Sub1) this).anIntArray9042[i_30_]
			 - ((Class157_Sub1) this).anIntArray9042[i_29_]);
	    int i_35_ = (((Class157_Sub1) this).anIntArray9040[i_31_]
			 - ((Class157_Sub1) this).anIntArray9040[i_29_]);
	    int i_36_ = (((Class157_Sub1) this).anIntArray9041[i_31_]
			 - ((Class157_Sub1) this).anIntArray9041[i_29_]);
	    int i_37_ = (((Class157_Sub1) this).anIntArray9042[i_31_]
			 - ((Class157_Sub1) this).anIntArray9042[i_29_]);
	    int i_38_ = i_33_ * i_37_ - i_36_ * i_34_;
	    int i_39_ = i_34_ * i_35_ - i_37_ * i_32_;
	    int i_40_;
	    for (i_40_ = i_32_ * i_36_ - i_35_ * i_33_;
		 (i_38_ > 8192 || i_39_ > 8192 || i_40_ > 8192 || i_38_ < -8192
		  || i_39_ < -8192 || i_40_ < -8192);
		 i_40_ >>= 1) {
		i_38_ >>= 1;
		i_39_ >>= 1;
	    }
	    int i_41_ = (int) Math.sqrt((double) (i_38_ * i_38_ + i_39_ * i_39_
						  + i_40_ * i_40_));
	    if (i_41_ <= 0)
		i_41_ = 1;
	    i_38_ = i_38_ * 256 / i_41_;
	    i_39_ = i_39_ * 256 / i_41_;
	    i_40_ = i_40_ * 256 / i_41_;
	    byte i_42_ = (class177.aByteArray2054 == null ? (byte) 0
			  : class177.aByteArray2054[i_28_]);
	    if (i_42_ == 0) {
		Class367 class367 = class367s[i_29_];
		((Class367) class367).anInt3854 += i_38_;
		((Class367) class367).anInt3853 += i_39_;
		((Class367) class367).anInt3855 += i_40_;
		((Class367) class367).anInt3852++;
		class367 = class367s[i_30_];
		((Class367) class367).anInt3854 += i_38_;
		((Class367) class367).anInt3853 += i_39_;
		((Class367) class367).anInt3855 += i_40_;
		((Class367) class367).anInt3852++;
		class367 = class367s[i_31_];
		((Class367) class367).anInt3854 += i_38_;
		((Class367) class367).anInt3853 += i_39_;
		((Class367) class367).anInt3855 += i_40_;
		((Class367) class367).anInt3852++;
	    } else if (i_42_ == 1) {
		Class366 class366 = class366s[i_28_] = new Class366();
		((Class366) class366).anInt3849 = i_38_;
		((Class366) class366).anInt3850 = i_39_;
		((Class366) class366).anInt3851 = i_40_;
	    }
	}
	for (int i_43_ = 0; i_43_ < ((Class157_Sub1) this).anInt9055;
	     i_43_++) {
	    int i_44_ = is[i_43_];
	    int i_45_ = class177.aShortArray2058[i_44_] & 0xffff;
	    int i_46_ = (class177.aByteArray2056 != null
			 ? class177.aByteArray2056[i_44_] & 0xff : 0);
	    short i_47_ = (class177.aShortArray2037 == null ? (short) -1
			   : class177.aShortArray2037[i_44_]);
	    if (i_47_ != -1 && (((Class157_Sub1) this).anInt9035 & 0x40) != 0
		&& class165.method2093(i_47_, (byte) -120).aBool1800)
		i_47_ = (short) -1;
	    float f = 0.0F;
	    float f_48_ = 0.0F;
	    float f_49_ = 0.0F;
	    float f_50_ = 0.0F;
	    float f_51_ = 0.0F;
	    float f_52_ = 0.0F;
	    long l;
	    long l_53_;
	    long l_54_;
	    if (i_47_ != -1) {
		int i_55_ = (class177.aShortArray2057 != null
			     ? class177.aShortArray2057[i_44_] : -1);
		if (i_55_ == 32766) {
		    int i_56_ = class177.aByteArray2051[i_44_] & 0xff;
		    int i_57_ = class177.aByteArray2075[i_44_] & 0xff;
		    int i_58_ = class177.aByteArray2053[i_44_] & 0xff;
		    i_56_ += (class177.anIntArray2041
			      [class177.aShortArray2067[i_44_]]);
		    l_54_ = (long) i_56_;
		    i_57_ += (class177.anIntArray2041
			      [class177.aShortArray2049[i_44_]]);
		    l_53_ = (long) i_56_;
		    i_58_ += (class177.anIntArray2041
			      [class177.aShortArray2050[i_44_]]);
		    l = (long) i_56_;
		    f = class177.aFloatArray2052[i_56_];
		    f_48_ = class177.aFloatArray2046[i_56_];
		    f_49_ = class177.aFloatArray2052[i_57_];
		    f_50_ = class177.aFloatArray2046[i_57_];
		    f_51_ = class177.aFloatArray2052[i_58_];
		    f_52_ = class177.aFloatArray2046[i_58_];
		} else if (i_55_ == -1) {
		    f = 0.0F;
		    f_48_ = 1.0F;
		    l_54_ = 65535L;
		    f_49_ = 1.0F;
		    f_50_ = 1.0F;
		    l_53_ = 131071L;
		    f_51_ = 0.0F;
		    f_52_ = 0.0F;
		    l = 196607L;
		} else {
		    i_55_ &= 0xffff;
		    int i_59_ = 0;
		    int i_60_ = 0;
		    int i_61_ = 0;
		    byte i_62_ = class177.aByteArray2076[i_55_];
		    if (i_62_ == 0) {
			short i_63_ = class177.aShortArray2067[i_44_];
			short i_64_ = class177.aShortArray2049[i_44_];
			short i_65_ = class177.aShortArray2050[i_44_];
			short i_66_ = class177.aShortArray2064[i_55_];
			short i_67_ = class177.aShortArray2077[i_55_];
			short i_68_ = class177.aShortArray2069[i_55_];
			float f_69_ = (float) class177.anIntArray2038[i_66_];
			float f_70_ = (float) class177.anIntArray2068[i_66_];
			float f_71_ = (float) class177.anIntArray2044[i_66_];
			float f_72_
			    = (float) class177.anIntArray2038[i_67_] - f_69_;
			float f_73_
			    = (float) class177.anIntArray2068[i_67_] - f_70_;
			float f_74_
			    = (float) class177.anIntArray2044[i_67_] - f_71_;
			float f_75_
			    = (float) class177.anIntArray2038[i_68_] - f_69_;
			float f_76_
			    = (float) class177.anIntArray2068[i_68_] - f_70_;
			float f_77_
			    = (float) class177.anIntArray2044[i_68_] - f_71_;
			float f_78_
			    = (float) class177.anIntArray2038[i_63_] - f_69_;
			float f_79_
			    = (float) class177.anIntArray2068[i_63_] - f_70_;
			float f_80_
			    = (float) class177.anIntArray2044[i_63_] - f_71_;
			float f_81_
			    = (float) class177.anIntArray2038[i_64_] - f_69_;
			float f_82_
			    = (float) class177.anIntArray2068[i_64_] - f_70_;
			float f_83_
			    = (float) class177.anIntArray2044[i_64_] - f_71_;
			float f_84_
			    = (float) class177.anIntArray2038[i_65_] - f_69_;
			float f_85_
			    = (float) class177.anIntArray2068[i_65_] - f_70_;
			float f_86_
			    = (float) class177.anIntArray2044[i_65_] - f_71_;
			float f_87_ = f_73_ * f_77_ - f_74_ * f_76_;
			float f_88_ = f_74_ * f_75_ - f_72_ * f_77_;
			float f_89_ = f_72_ * f_76_ - f_73_ * f_75_;
			float f_90_ = f_76_ * f_89_ - f_77_ * f_88_;
			float f_91_ = f_77_ * f_87_ - f_75_ * f_89_;
			float f_92_ = f_75_ * f_88_ - f_76_ * f_87_;
			float f_93_ = 1.0F / (f_90_ * f_72_ + f_91_ * f_73_
					      + f_92_ * f_74_);
			f = ((f_90_ * f_78_ + f_91_ * f_79_ + f_92_ * f_80_)
			     * f_93_);
			f_49_ = (f_90_ * f_81_ + f_91_ * f_82_
				 + f_92_ * f_83_) * f_93_;
			f_51_ = (f_90_ * f_84_ + f_91_ * f_85_
				 + f_92_ * f_86_) * f_93_;
			f_90_ = f_73_ * f_89_ - f_74_ * f_88_;
			f_91_ = f_74_ * f_87_ - f_72_ * f_89_;
			f_92_ = f_72_ * f_88_ - f_73_ * f_87_;
			f_93_ = 1.0F / (f_90_ * f_75_ + f_91_ * f_76_
					+ f_92_ * f_77_);
			f_48_ = (f_90_ * f_78_ + f_91_ * f_79_
				 + f_92_ * f_80_) * f_93_;
			f_50_ = (f_90_ * f_81_ + f_91_ * f_82_
				 + f_92_ * f_83_) * f_93_;
			f_52_ = (f_90_ * f_84_ + f_91_ * f_85_
				 + f_92_ * f_86_) * f_93_;
		    } else {
			short i_94_ = class177.aShortArray2067[i_44_];
			short i_95_ = class177.aShortArray2049[i_44_];
			short i_96_ = class177.aShortArray2050[i_44_];
			int i_97_ = class167.anIntArray1928[i_55_];
			int i_98_ = class167.anIntArray1930[i_55_];
			int i_99_ = class167.anIntArray1929[i_55_];
			float[] fs = class167.aFloatArrayArray1927[i_55_];
			byte i_100_ = class177.aByteArray2079[i_55_];
			float f_101_
			    = (float) class177.anIntArray2045[i_55_] / 256.0F;
			if (i_62_ == 1) {
			    float f_102_
				= ((float) class177.anIntArray2072[i_55_]
				   / 1024.0F);
			    method1867(class177.anIntArray2038[i_94_],
				       class177.anIntArray2068[i_94_],
				       class177.anIntArray2044[i_94_], i_97_,
				       i_98_, i_99_, fs, f_102_, i_100_,
				       f_101_,
				       ((Class157_Sub1) this).aFloatArray9097);
			    f = ((Class157_Sub1) this).aFloatArray9097[0];
			    f_48_ = ((Class157_Sub1) this).aFloatArray9097[1];
			    method1867(class177.anIntArray2038[i_95_],
				       class177.anIntArray2068[i_95_],
				       class177.anIntArray2044[i_95_], i_97_,
				       i_98_, i_99_, fs, f_102_, i_100_,
				       f_101_,
				       ((Class157_Sub1) this).aFloatArray9097);
			    f_49_ = ((Class157_Sub1) this).aFloatArray9097[0];
			    f_50_ = ((Class157_Sub1) this).aFloatArray9097[1];
			    method1867(class177.anIntArray2038[i_96_],
				       class177.anIntArray2068[i_96_],
				       class177.anIntArray2044[i_96_], i_97_,
				       i_98_, i_99_, fs, f_102_, i_100_,
				       f_101_,
				       ((Class157_Sub1) this).aFloatArray9097);
			    f_51_ = ((Class157_Sub1) this).aFloatArray9097[0];
			    f_52_ = ((Class157_Sub1) this).aFloatArray9097[1];
			    float f_103_ = f_102_ / 2.0F;
			    if ((i_100_ & 0x1) == 0) {
				if (f_49_ - f > f_103_) {
				    f_49_ -= f_102_;
				    i_60_ = 1;
				} else if (f - f_49_ > f_103_) {
				    f_49_ += f_102_;
				    i_60_ = 2;
				}
				if (f_51_ - f > f_103_) {
				    f_51_ -= f_102_;
				    i_61_ = 1;
				} else if (f - f_51_ > f_103_) {
				    f_51_ += f_102_;
				    i_61_ = 2;
				}
			    } else {
				if (f_50_ - f_48_ > f_103_) {
				    f_50_ -= f_102_;
				    i_60_ = 1;
				} else if (f_48_ - f_50_ > f_103_) {
				    f_50_ += f_102_;
				    i_60_ = 2;
				}
				if (f_52_ - f_48_ > f_103_) {
				    f_52_ -= f_102_;
				    i_61_ = 1;
				} else if (f_48_ - f_52_ > f_103_) {
				    f_52_ += f_102_;
				    i_61_ = 2;
				}
			    }
			} else if (i_62_ == 2) {
			    float f_104_
				= ((float) class177.anIntArray2055[i_55_]
				   / 256.0F);
			    float f_105_
				= ((float) class177.anIntArray2032[i_55_]
				   / 256.0F);
			    int i_106_ = (class177.anIntArray2038[i_95_]
					  - class177.anIntArray2038[i_94_]);
			    int i_107_ = (class177.anIntArray2068[i_95_]
					  - class177.anIntArray2068[i_94_]);
			    int i_108_ = (class177.anIntArray2044[i_95_]
					  - class177.anIntArray2044[i_94_]);
			    int i_109_ = (class177.anIntArray2038[i_96_]
					  - class177.anIntArray2038[i_94_]);
			    int i_110_ = (class177.anIntArray2068[i_96_]
					  - class177.anIntArray2068[i_94_]);
			    int i_111_ = (class177.anIntArray2044[i_96_]
					  - class177.anIntArray2044[i_94_]);
			    int i_112_ = i_107_ * i_111_ - i_110_ * i_108_;
			    int i_113_ = i_108_ * i_109_ - i_111_ * i_106_;
			    int i_114_ = i_106_ * i_110_ - i_109_ * i_107_;
			    float f_115_
				= (64.0F
				   / (float) class177.anIntArray2070[i_55_]);
			    float f_116_
				= (64.0F
				   / (float) class177.anIntArray2071[i_55_]);
			    float f_117_
				= (64.0F
				   / (float) class177.anIntArray2072[i_55_]);
			    float f_118_ = (((float) i_112_ * fs[0]
					     + (float) i_113_ * fs[1]
					     + (float) i_114_ * fs[2])
					    / f_115_);
			    float f_119_ = (((float) i_112_ * fs[3]
					     + (float) i_113_ * fs[4]
					     + (float) i_114_ * fs[5])
					    / f_116_);
			    float f_120_ = (((float) i_112_ * fs[6]
					     + (float) i_113_ * fs[7]
					     + (float) i_114_ * fs[8])
					    / f_117_);
			    i_59_ = method1993(f_118_, f_119_, f_120_);
			    method1869(class177.anIntArray2038[i_94_],
				       class177.anIntArray2068[i_94_],
				       class177.anIntArray2044[i_94_], i_97_,
				       i_98_, i_99_, i_59_, fs, i_100_, f_101_,
				       f_104_, f_105_,
				       ((Class157_Sub1) this).aFloatArray9097);
			    f = ((Class157_Sub1) this).aFloatArray9097[0];
			    f_48_ = ((Class157_Sub1) this).aFloatArray9097[1];
			    method1869(class177.anIntArray2038[i_95_],
				       class177.anIntArray2068[i_95_],
				       class177.anIntArray2044[i_95_], i_97_,
				       i_98_, i_99_, i_59_, fs, i_100_, f_101_,
				       f_104_, f_105_,
				       ((Class157_Sub1) this).aFloatArray9097);
			    f_49_ = ((Class157_Sub1) this).aFloatArray9097[0];
			    f_50_ = ((Class157_Sub1) this).aFloatArray9097[1];
			    method1869(class177.anIntArray2038[i_96_],
				       class177.anIntArray2068[i_96_],
				       class177.anIntArray2044[i_96_], i_97_,
				       i_98_, i_99_, i_59_, fs, i_100_, f_101_,
				       f_104_, f_105_,
				       ((Class157_Sub1) this).aFloatArray9097);
			    f_51_ = ((Class157_Sub1) this).aFloatArray9097[0];
			    f_52_ = ((Class157_Sub1) this).aFloatArray9097[1];
			} else if (i_62_ == 3) {
			    method1866(class177.anIntArray2038[i_94_],
				       class177.anIntArray2068[i_94_],
				       class177.anIntArray2044[i_94_], i_97_,
				       i_98_, i_99_, fs, i_100_, f_101_,
				       ((Class157_Sub1) this).aFloatArray9097);
			    f = ((Class157_Sub1) this).aFloatArray9097[0];
			    f_48_ = ((Class157_Sub1) this).aFloatArray9097[1];
			    method1866(class177.anIntArray2038[i_95_],
				       class177.anIntArray2068[i_95_],
				       class177.anIntArray2044[i_95_], i_97_,
				       i_98_, i_99_, fs, i_100_, f_101_,
				       ((Class157_Sub1) this).aFloatArray9097);
			    f_49_ = ((Class157_Sub1) this).aFloatArray9097[0];
			    f_50_ = ((Class157_Sub1) this).aFloatArray9097[1];
			    method1866(class177.anIntArray2038[i_96_],
				       class177.anIntArray2068[i_96_],
				       class177.anIntArray2044[i_96_], i_97_,
				       i_98_, i_99_, fs, i_100_, f_101_,
				       ((Class157_Sub1) this).aFloatArray9097);
			    f_51_ = ((Class157_Sub1) this).aFloatArray9097[0];
			    f_52_ = ((Class157_Sub1) this).aFloatArray9097[1];
			    if ((i_100_ & 0x1) == 0) {
				if (f_49_ - f > 0.5F) {
				    f_49_--;
				    i_60_ = 1;
				} else if (f - f_49_ > 0.5F) {
				    f_49_++;
				    i_60_ = 2;
				}
				if (f_51_ - f > 0.5F) {
				    f_51_--;
				    i_61_ = 1;
				} else if (f - f_51_ > 0.5F) {
				    f_51_++;
				    i_61_ = 2;
				}
			    } else {
				if (f_50_ - f_48_ > 0.5F) {
				    f_50_--;
				    i_60_ = 1;
				} else if (f_48_ - f_50_ > 0.5F) {
				    f_50_++;
				    i_60_ = 2;
				}
				if (f_52_ - f_48_ > 0.5F) {
				    f_52_--;
				    i_61_ = 1;
				} else if (f_48_ - f_52_ > 0.5F) {
				    f_52_++;
				    i_61_ = 2;
				}
			    }
			}
		    }
		    l_54_ = (long) (i_59_ << 16 | i_55_);
		    l_53_ = (long) (i_60_ << 19) | l_54_;
		    l = (long) (i_61_ << 19) | l_54_;
		}
	    } else {
		l = 0L;
		l_53_ = 0L;
		l_54_ = 0L;
	    }
	    byte i_121_ = (class177.aByteArray2054 != null
			   ? class177.aByteArray2054[i_44_] : (byte) 0);
	    if (i_121_ == 0) {
		long l_122_ = (long) ((i_45_ << 8) + i_46_);
		short i_123_ = class177.aShortArray2067[i_44_];
		short i_124_ = class177.aShortArray2049[i_44_];
		short i_125_ = class177.aShortArray2050[i_44_];
		Class367 class367 = class367s[i_123_];
		((Class157_Sub1) this).aShortArray9059[i_43_]
		    = method8369(class177, i_123_, i_43_, l_122_ | l_54_ << 24,
				 ((Class367) class367).anInt3854,
				 ((Class367) class367).anInt3853,
				 ((Class367) class367).anInt3855,
				 ((Class367) class367).anInt3852, f, f_48_);
		class367 = class367s[i_124_];
		((Class157_Sub1) this).aShortArray9105[i_43_]
		    = method8369(class177, i_124_, i_43_, l_122_ | l_53_ << 24,
				 ((Class367) class367).anInt3854,
				 ((Class367) class367).anInt3853,
				 ((Class367) class367).anInt3855,
				 ((Class367) class367).anInt3852, f_49_,
				 f_50_);
		class367 = class367s[i_125_];
		((Class157_Sub1) this).aShortArray9091[i_43_]
		    = method8369(class177, i_125_, i_43_, l_122_ | l << 24,
				 ((Class367) class367).anInt3854,
				 ((Class367) class367).anInt3853,
				 ((Class367) class367).anInt3855,
				 ((Class367) class367).anInt3852, f_51_,
				 f_52_);
	    } else if (i_121_ == 1) {
		Class366 class366 = class366s[i_44_];
		long l_126_
		    = (((long) (((Class366) class366).anInt3849 & ~0x7fffffff)
			<< 9)
		       + ((long) (((Class366) class366).anInt3850 + 256) << 32)
		       + ((long) (((Class366) class366).anInt3851 + 256) << 24)
		       + (long) (i_45_ << 8) + (long) i_46_);
		((Class157_Sub1) this).aShortArray9059[i_43_]
		    = method8369(class177, class177.aShortArray2067[i_44_],
				 i_43_, l_126_ | l_54_ << 41,
				 ((Class366) class366).anInt3849,
				 ((Class366) class366).anInt3850,
				 ((Class366) class366).anInt3851, 0, f, f_48_);
		((Class157_Sub1) this).aShortArray9105[i_43_]
		    = method8369(class177, class177.aShortArray2049[i_44_],
				 i_43_, l_126_ | l_54_ << 41,
				 ((Class366) class366).anInt3849,
				 ((Class366) class366).anInt3850,
				 ((Class366) class366).anInt3851, 0, f_49_,
				 f_50_);
		((Class157_Sub1) this).aShortArray9091[i_43_]
		    = method8369(class177, class177.aShortArray2050[i_44_],
				 i_43_, l_126_ | l_54_ << 41,
				 ((Class366) class366).anInt3849,
				 ((Class366) class366).anInt3850,
				 ((Class366) class366).anInt3851, 0, f_51_,
				 f_52_);
	    }
	    if (class177.aByteArray2056 != null)
		((Class157_Sub1) this).aByteArray9058[i_43_]
		    = class177.aByteArray2056[i_44_];
	    if (class177.aShortArray2062 != null)
		((Class157_Sub1) this).aShortArray9064[i_43_]
		    = class177.aShortArray2062[i_44_];
	    ((Class157_Sub1) this).aShortArray9057[i_43_]
		= class177.aShortArray2058[i_44_];
	    ((Class157_Sub1) this).aShortArray9062[i_43_] = i_47_;
	}
	if (((Class157_Sub1) this).anInt9056 > 0) {
	    int i_127_ = 1;
	    short i_128_ = ((Class157_Sub1) this).aShortArray9062[0];
	    for (int i_129_ = 0; i_129_ < ((Class157_Sub1) this).anInt9056;
		 i_129_++) {
		short i_130_ = ((Class157_Sub1) this).aShortArray9062[i_129_];
		if (i_130_ != i_128_) {
		    i_127_++;
		    i_128_ = i_130_;
		}
	    }
	    ((Class157_Sub1) this).anIntArray9099 = new int[i_127_];
	    ((Class157_Sub1) this).anIntArray9087 = new int[i_127_];
	    ((Class157_Sub1) this).anIntArray9085 = new int[i_127_ + 1];
	    ((Class157_Sub1) this).anIntArray9085[0] = 0;
	    int i_131_ = ((Class157_Sub1) this).anInt9077;
	    int i_132_ = 0;
	    i_127_ = 0;
	    i_128_ = ((Class157_Sub1) this).aShortArray9062[0];
	    for (int i_133_ = 0; i_133_ < ((Class157_Sub1) this).anInt9056;
		 i_133_++) {
		short i_134_ = ((Class157_Sub1) this).aShortArray9062[i_133_];
		if (i_134_ != i_128_) {
		    ((Class157_Sub1) this).anIntArray9099[i_127_] = i_131_;
		    ((Class157_Sub1) this).anIntArray9087[i_127_]
			= i_132_ - i_131_ + 1;
		    ((Class157_Sub1) this).anIntArray9085[++i_127_] = i_133_;
		    i_131_ = ((Class157_Sub1) this).anInt9077;
		    i_132_ = 0;
		    i_128_ = i_134_;
		}
		int i_135_
		    = ((Class157_Sub1) this).aShortArray9059[i_133_] & 0xffff;
		if (i_135_ < i_131_)
		    i_131_ = i_135_;
		if (i_135_ > i_132_)
		    i_132_ = i_135_;
		i_135_
		    = ((Class157_Sub1) this).aShortArray9105[i_133_] & 0xffff;
		if (i_135_ < i_131_)
		    i_131_ = i_135_;
		if (i_135_ > i_132_)
		    i_132_ = i_135_;
		i_135_
		    = ((Class157_Sub1) this).aShortArray9091[i_133_] & 0xffff;
		if (i_135_ < i_131_)
		    i_131_ = i_135_;
		if (i_135_ > i_132_)
		    i_132_ = i_135_;
	    }
	    ((Class157_Sub1) this).anIntArray9099[i_127_] = i_131_;
	    ((Class157_Sub1) this).anIntArray9087[i_127_]
		= i_132_ - i_131_ + 1;
	    ((Class157_Sub1) this).anIntArray9085[++i_127_]
		= ((Class157_Sub1) this).anInt9056;
	}
	((Class157_Sub1) this).aLongArray9096 = null;
	((Class157_Sub1) this).aShortArray9043
	    = method8353(((Class157_Sub1) this).aShortArray9043,
			 ((Class157_Sub1) this).anInt9077);
	((Class157_Sub1) this).aShortArray9047
	    = method8353(((Class157_Sub1) this).aShortArray9047,
			 ((Class157_Sub1) this).anInt9077);
	((Class157_Sub1) this).aShortArray9048
	    = method8353(((Class157_Sub1) this).aShortArray9048,
			 ((Class157_Sub1) this).anInt9077);
	((Class157_Sub1) this).aShortArray9049
	    = method8353(((Class157_Sub1) this).aShortArray9049,
			 ((Class157_Sub1) this).anInt9077);
	((Class157_Sub1) this).aShortArray9038
	    = method8353(((Class157_Sub1) this).aShortArray9038,
			 ((Class157_Sub1) this).anInt9077);
	((Class157_Sub1) this).aByteArray9052
	    = method8373(((Class157_Sub1) this).aByteArray9052,
			 ((Class157_Sub1) this).anInt9077);
	((Class157_Sub1) this).aFloatArray9061
	    = method8376(((Class157_Sub1) this).aFloatArray9061,
			 ((Class157_Sub1) this).anInt9077);
	((Class157_Sub1) this).aFloatArray9053
	    = method8376(((Class157_Sub1) this).aFloatArray9053,
			 ((Class157_Sub1) this).anInt9077);
	if (class177.anIntArray2042 != null
	    && Class338.method4453(i, ((Class157_Sub1) this).anInt9035))
	    ((Class157_Sub1) this).anIntArrayArray9033
		= class177.method2579(false);
	if (class177.aClass176Array2040 != null
	    && Class338.method4435(i, ((Class157_Sub1) this).anInt9035))
	    ((Class157_Sub1) this).anIntArrayArray9095 = class177.method2582();
	if (class177.anIntArray2060 != null
	    && Class338.method4438(i, ((Class157_Sub1) this).anInt9035)) {
	    int i_136_ = 0;
	    int[] is_137_ = new int[256];
	    for (int i_138_ = 0; i_138_ < ((Class157_Sub1) this).anInt9055;
		 i_138_++) {
		int i_139_ = class177.anIntArray2060[is[i_138_]];
		if (i_139_ >= 0) {
		    is_137_[i_139_]++;
		    if (i_139_ > i_136_)
			i_136_ = i_139_;
		}
	    }
	    ((Class157_Sub1) this).anIntArrayArray9063 = new int[i_136_ + 1][];
	    for (int i_140_ = 0; i_140_ <= i_136_; i_140_++) {
		((Class157_Sub1) this).anIntArrayArray9063[i_140_]
		    = new int[is_137_[i_140_]];
		is_137_[i_140_] = 0;
	    }
	    for (int i_141_ = 0; i_141_ < ((Class157_Sub1) this).anInt9055;
		 i_141_++) {
		int i_142_ = class177.anIntArray2060[is[i_141_]];
		if (i_142_ >= 0)
		    ((Class157_Sub1) this).anIntArrayArray9063[i_142_]
			[is_137_[i_142_]++]
			= i_141_;
	    }
	}
    }
    
    public void method1921(Class433 class433) {
	Class418 class418
	    = ((Class157_Sub1) this).aClass173_Sub1_9068.aClass418_9243;
	class418.method5035(class433);
	if (((Class157_Sub1) this).aClass170Array9090 != null) {
	    for (int i = 0;
		 i < ((Class157_Sub1) this).aClass170Array9090.length; i++) {
		Class170 class170
		    = ((Class157_Sub1) this).aClass170Array9090[i];
		Class170 class170_143_ = class170;
		if (class170.aClass170_1958 != null)
		    class170_143_ = class170.aClass170_1958;
		class170_143_.anInt1950
		    = ((int) (class418.aFloatArray4768[12]
			      + ((class418.aFloatArray4768[0]
				  * (float) (((Class157_Sub1) this)
					     .anIntArray9040
					     [(class170.anInt1946
					       * 1977387945)]))
				 + (class418.aFloatArray4768[4]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9041
					       [(class170.anInt1946
						 * 1977387945)]))
				 + (class418.aFloatArray4768[8]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9042
					       [(class170.anInt1946
						 * 1977387945)]))))
		       * -1626668665);
		class170_143_.anInt1951
		    = ((int) (class418.aFloatArray4768[13]
			      + ((class418.aFloatArray4768[1]
				  * (float) (((Class157_Sub1) this)
					     .anIntArray9040
					     [(class170.anInt1946
					       * 1977387945)]))
				 + (class418.aFloatArray4768[5]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9041
					       [(class170.anInt1946
						 * 1977387945)]))
				 + (class418.aFloatArray4768[9]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9042
					       [(class170.anInt1946
						 * 1977387945)]))))
		       * -1756604589);
		class170_143_.anInt1952
		    = (int) (class418.aFloatArray4768[14]
			     + ((class418.aFloatArray4768[2]
				 * (float) (((Class157_Sub1) this)
					    .anIntArray9040
					    [class170.anInt1946 * 1977387945]))
				+ (class418.aFloatArray4768[6]
				   * (float) (((Class157_Sub1) this)
					      .anIntArray9041
					      [(class170.anInt1946
						* 1977387945)]))
				+ (class418.aFloatArray4768[10]
				   * (float) (((Class157_Sub1) this)
					      .anIntArray9042
					      [(class170.anInt1946
						* 1977387945)])))) * 908623173;
		class170_143_.anInt1947
		    = ((int) (class418.aFloatArray4768[12]
			      + ((class418.aFloatArray4768[0]
				  * (float) (((Class157_Sub1) this)
					     .anIntArray9040
					     [(class170.anInt1945
					       * -1790775395)]))
				 + (class418.aFloatArray4768[4]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9041
					       [(class170.anInt1945
						 * -1790775395)]))
				 + (class418.aFloatArray4768[8]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9042
					       [(class170.anInt1945
						 * -1790775395)]))))
		       * -203979893);
		class170_143_.anInt1944
		    = ((int) (class418.aFloatArray4768[13]
			      + ((class418.aFloatArray4768[1]
				  * (float) (((Class157_Sub1) this)
					     .anIntArray9040
					     [(class170.anInt1945
					       * -1790775395)]))
				 + (class418.aFloatArray4768[5]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9041
					       [(class170.anInt1945
						 * -1790775395)]))
				 + (class418.aFloatArray4768[9]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9042
					       [(class170.anInt1945
						 * -1790775395)]))))
		       * 1630459257);
		class170_143_.anInt1955
		    = ((int) (class418.aFloatArray4768[14]
			      + ((class418.aFloatArray4768[2]
				  * (float) (((Class157_Sub1) this)
					     .anIntArray9040
					     [(class170.anInt1945
					       * -1790775395)]))
				 + (class418.aFloatArray4768[6]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9041
					       [(class170.anInt1945
						 * -1790775395)]))
				 + (class418.aFloatArray4768[10]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9042
					       [(class170.anInt1945
						 * -1790775395)]))))
		       * 1543452655);
		class170_143_.anInt1956
		    = (int) (class418.aFloatArray4768[12]
			     + ((class418.aFloatArray4768[0]
				 * (float) (((Class157_Sub1) this)
					    .anIntArray9040
					    [class170.anInt1948 * 248261743]))
				+ (class418.aFloatArray4768[4]
				   * (float) (((Class157_Sub1) this)
					      .anIntArray9041
					      [(class170.anInt1948
						* 248261743)]))
				+ (class418.aFloatArray4768[8]
				   * (float) (((Class157_Sub1) this)
					      .anIntArray9042
					      [(class170.anInt1948
						* 248261743)])))) * 271456581;
		class170_143_.anInt1953
		    = (int) (class418.aFloatArray4768[13]
			     + ((class418.aFloatArray4768[1]
				 * (float) (((Class157_Sub1) this)
					    .anIntArray9040
					    [class170.anInt1948 * 248261743]))
				+ (class418.aFloatArray4768[5]
				   * (float) (((Class157_Sub1) this)
					      .anIntArray9041
					      [(class170.anInt1948
						* 248261743)]))
				+ (class418.aFloatArray4768[9]
				   * (float) (((Class157_Sub1) this)
					      .anIntArray9042
					      [(class170.anInt1948
						* 248261743)])))) * 707964019;
		class170_143_.anInt1943
		    = (int) (class418.aFloatArray4768[14]
			     + ((class418.aFloatArray4768[2]
				 * (float) (((Class157_Sub1) this)
					    .anIntArray9040
					    [class170.anInt1948 * 248261743]))
				+ (class418.aFloatArray4768[6]
				   * (float) (((Class157_Sub1) this)
					      .anIntArray9041
					      [(class170.anInt1948
						* 248261743)]))
				+ (class418.aFloatArray4768[10]
				   * (float) (((Class157_Sub1) this)
					      .anIntArray9042
					      [(class170.anInt1948
						* 248261743)])))) * -674151113;
	    }
	}
	if (((Class157_Sub1) this).aClass144Array9075 != null) {
	    for (int i = 0;
		 i < ((Class157_Sub1) this).aClass144Array9075.length; i++) {
		Class144 class144
		    = ((Class157_Sub1) this).aClass144Array9075[i];
		Class144 class144_144_ = class144;
		if (class144.aClass144_1646 != null)
		    class144_144_ = class144.aClass144_1646;
		if (class144.aClass418_1645 != null)
		    class144.aClass418_1645.method4986(class418);
		else
		    class144.aClass418_1645 = new Class418(class418);
		class144_144_.anInt1648
		    = ((int) (class418.aFloatArray4768[12]
			      + ((class418.aFloatArray4768[0]
				  * (float) (((Class157_Sub1) this)
					     .anIntArray9040
					     [(class144.anInt1651
					       * 1842630443)]))
				 + (class418.aFloatArray4768[4]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9041
					       [(class144.anInt1651
						 * 1842630443)]))
				 + (class418.aFloatArray4768[8]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9042
					       [(class144.anInt1651
						 * 1842630443)]))))
		       * -1931908895);
		class144_144_.anInt1649
		    = ((int) (class418.aFloatArray4768[13]
			      + ((class418.aFloatArray4768[1]
				  * (float) (((Class157_Sub1) this)
					     .anIntArray9040
					     [(class144.anInt1651
					       * 1842630443)]))
				 + (class418.aFloatArray4768[5]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9041
					       [(class144.anInt1651
						 * 1842630443)]))
				 + (class418.aFloatArray4768[9]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9042
					       [(class144.anInt1651
						 * 1842630443)]))))
		       * -1055365151);
		class144_144_.anInt1650
		    = (int) (class418.aFloatArray4768[14]
			     + ((class418.aFloatArray4768[2]
				 * (float) (((Class157_Sub1) this)
					    .anIntArray9040
					    [class144.anInt1651 * 1842630443]))
				+ (class418.aFloatArray4768[6]
				   * (float) (((Class157_Sub1) this)
					      .anIntArray9041
					      [(class144.anInt1651
						* 1842630443)]))
				+ (class418.aFloatArray4768[10]
				   * (float) (((Class157_Sub1) this)
					      .anIntArray9042
					      [(class144.anInt1651
						* 1842630443)])))) * 870317833;
	    }
	}
    }
    
    public int method1882() {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	return ((Class157_Sub1) this).anInt9080;
    }
    
    static short[] method8353(short[] is, int i) {
	short[] is_145_ = new short[i];
	System.arraycopy(is, 0, is_145_, 0, i);
	return is_145_;
    }
    
    public void method1989(int i) {
	((Class157_Sub1) this).aShort9037 = (short) i;
	method8385();
	method8367();
    }
    
    public void method1972(int i) {
	int i_146_ = Class417.anIntArray4766[i];
	int i_147_ = Class417.anIntArray4767[i];
	for (int i_148_ = 0; i_148_ < ((Class157_Sub1) this).anInt9039;
	     i_148_++) {
	    int i_149_
		= ((((Class157_Sub1) this).anIntArray9042[i_148_] * i_146_
		    + ((Class157_Sub1) this).anIntArray9040[i_148_] * i_147_)
		   >> 14);
	    ((Class157_Sub1) this).anIntArray9042[i_148_]
		= ((((Class157_Sub1) this).anIntArray9042[i_148_] * i_147_
		    - ((Class157_Sub1) this).anIntArray9040[i_148_] * i_146_)
		   >> 14);
	    ((Class157_Sub1) this).anIntArray9040[i_148_] = i_149_;
	}
	method8385();
	((Class157_Sub1) this).aBool9046 = false;
    }
    
    public boolean method1920() {
	return ((Class157_Sub1) this).aBool9073;
    }
    
    public void method1875() {
	if (((Class157_Sub1) this).anInt9077 > 0
	    && ((Class157_Sub1) this).anInt9056 > 0) {
	    method8364();
	    method8363();
	    method8355();
	}
    }
    
    public Class157 method1951(byte i, int i_150_, boolean bool) {
	boolean bool_151_ = false;
	Class157_Sub1 class157_sub1_152_;
	Class157_Sub1 class157_sub1_153_;
	if (i > 0 && i <= 8) {
	    class157_sub1_153_
		= (((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
		   .aClass157_Sub1Array9382[i - 1]);
	    class157_sub1_152_
		= (((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
		   .aClass157_Sub1Array9380[i - 1]);
	    bool_151_ = true;
	} else
	    class157_sub1_152_ = class157_sub1_153_
		= new Class157_Sub1(((Class157_Sub1) this).aClass173_Sub1_9068,
				    0, 0, true, false);
	return method8354(class157_sub1_152_, class157_sub1_153_, i_150_,
			  bool_151_, bool);
    }
    
    Class157 method8354(Class157_Sub1 class157_sub1_154_,
			Class157_Sub1 class157_sub1_155_, int i, boolean bool,
			boolean bool_156_) {
	((Class157_Sub1) class157_sub1_154_).anInt9034 = i;
	((Class157_Sub1) class157_sub1_154_).anInt9035
	    = ((Class157_Sub1) this).anInt9035;
	((Class157_Sub1) class157_sub1_154_).aShort9036
	    = ((Class157_Sub1) this).aShort9036;
	((Class157_Sub1) class157_sub1_154_).aShort9037
	    = ((Class157_Sub1) this).aShort9037;
	((Class157_Sub1) class157_sub1_154_).anInt9088
	    = ((Class157_Sub1) this).anInt9088;
	((Class157_Sub1) class157_sub1_154_).anInt9039
	    = ((Class157_Sub1) this).anInt9039;
	((Class157_Sub1) class157_sub1_154_).anInt9077
	    = ((Class157_Sub1) this).anInt9077;
	((Class157_Sub1) class157_sub1_154_).anInt9055
	    = ((Class157_Sub1) this).anInt9055;
	((Class157_Sub1) class157_sub1_154_).anInt9056
	    = ((Class157_Sub1) this).anInt9056;
	((Class157_Sub1) class157_sub1_154_).anInt9092
	    = ((Class157_Sub1) this).anInt9092;
	if ((i & 0x100) != 0)
	    ((Class157_Sub1) class157_sub1_154_).aBool9051 = true;
	else
	    ((Class157_Sub1) class157_sub1_154_).aBool9051
		= ((Class157_Sub1) this).aBool9051;
	((Class157_Sub1) class157_sub1_154_).aBool9073
	    = ((Class157_Sub1) this).aBool9073;
	boolean bool_157_
	    = Class338.method4379(i, ((Class157_Sub1) this).anInt9035);
	boolean bool_158_
	    = Class338.method4380(i, ((Class157_Sub1) this).anInt9035);
	boolean bool_159_
	    = Class338.method4449(i, ((Class157_Sub1) this).anInt9035);
	boolean bool_160_ = bool_157_ | bool_158_ | bool_159_;
	if (bool_160_) {
	    if (bool_157_) {
		if (((Class157_Sub1) class157_sub1_155_).anIntArray9040 == null
		    || ((((Class157_Sub1) class157_sub1_155_)
			 .anIntArray9040).length
			< ((Class157_Sub1) this).anInt9088))
		    ((Class157_Sub1) class157_sub1_154_).anIntArray9040
			= ((Class157_Sub1) class157_sub1_155_).anIntArray9040
			= new int[((Class157_Sub1) this).anInt9088];
		else
		    ((Class157_Sub1) class157_sub1_154_).anIntArray9040
			= ((Class157_Sub1) class157_sub1_155_).anIntArray9040;
	    } else
		((Class157_Sub1) class157_sub1_154_).anIntArray9040
		    = ((Class157_Sub1) this).anIntArray9040;
	    if (bool_158_) {
		if (((Class157_Sub1) class157_sub1_155_).anIntArray9041 == null
		    || ((((Class157_Sub1) class157_sub1_155_)
			 .anIntArray9041).length
			< ((Class157_Sub1) this).anInt9088))
		    ((Class157_Sub1) class157_sub1_154_).anIntArray9041
			= ((Class157_Sub1) class157_sub1_155_).anIntArray9041
			= new int[((Class157_Sub1) this).anInt9088];
		else
		    ((Class157_Sub1) class157_sub1_154_).anIntArray9041
			= ((Class157_Sub1) class157_sub1_155_).anIntArray9041;
	    } else
		((Class157_Sub1) class157_sub1_154_).anIntArray9041
		    = ((Class157_Sub1) this).anIntArray9041;
	    if (bool_159_) {
		if (((Class157_Sub1) class157_sub1_155_).anIntArray9042 == null
		    || ((((Class157_Sub1) class157_sub1_155_)
			 .anIntArray9042).length
			< ((Class157_Sub1) this).anInt9088))
		    ((Class157_Sub1) class157_sub1_154_).anIntArray9042
			= ((Class157_Sub1) class157_sub1_155_).anIntArray9042
			= new int[((Class157_Sub1) this).anInt9088];
		else
		    ((Class157_Sub1) class157_sub1_154_).anIntArray9042
			= ((Class157_Sub1) class157_sub1_155_).anIntArray9042;
	    } else
		((Class157_Sub1) class157_sub1_154_).anIntArray9042
		    = ((Class157_Sub1) this).anIntArray9042;
	    for (int i_161_ = 0; i_161_ < ((Class157_Sub1) this).anInt9088;
		 i_161_++) {
		if (bool_157_)
		    ((Class157_Sub1) class157_sub1_154_).anIntArray9040[i_161_]
			= ((Class157_Sub1) this).anIntArray9040[i_161_];
		if (bool_158_)
		    ((Class157_Sub1) class157_sub1_154_).anIntArray9041[i_161_]
			= ((Class157_Sub1) this).anIntArray9041[i_161_];
		if (bool_159_)
		    ((Class157_Sub1) class157_sub1_154_).anIntArray9042[i_161_]
			= ((Class157_Sub1) this).anIntArray9042[i_161_];
	    }
	} else {
	    ((Class157_Sub1) class157_sub1_154_).anIntArray9040
		= ((Class157_Sub1) this).anIntArray9040;
	    ((Class157_Sub1) class157_sub1_154_).anIntArray9041
		= ((Class157_Sub1) this).anIntArray9041;
	    ((Class157_Sub1) class157_sub1_154_).anIntArray9042
		= ((Class157_Sub1) this).anIntArray9042;
	}
	if (Class338.method4395(i, ((Class157_Sub1) this).anInt9035)) {
	    ((Class157_Sub1) class157_sub1_154_).aClass354_9045
		= ((Class157_Sub1) class157_sub1_155_).aClass354_9045;
	    ((Class354) ((Class157_Sub1) class157_sub1_154_).aClass354_9045)
		.anInterface36_3803
		= (((Class354) ((Class157_Sub1) this).aClass354_9045)
		   .anInterface36_3803);
	    ((Class354) ((Class157_Sub1) class157_sub1_154_).aClass354_9045)
		.aBool3801
		= ((Class354) ((Class157_Sub1) this).aClass354_9045).aBool3801;
	    ((Class354) ((Class157_Sub1) class157_sub1_154_).aClass354_9045)
		.aBool3802
		= true;
	} else if (Class338.method4412(i, ((Class157_Sub1) this).anInt9035))
	    ((Class157_Sub1) class157_sub1_154_).aClass354_9045
		= ((Class157_Sub1) this).aClass354_9045;
	else
	    ((Class157_Sub1) class157_sub1_154_).aClass354_9045 = null;
	if (Class338.method4393(i, ((Class157_Sub1) this).anInt9035)) {
	    if (((Class157_Sub1) class157_sub1_155_).aShortArray9057 == null
		|| (((Class157_Sub1) class157_sub1_155_).aShortArray9057.length
		    < ((Class157_Sub1) this).anInt9055))
		((Class157_Sub1) class157_sub1_154_).aShortArray9057
		    = ((Class157_Sub1) class157_sub1_155_).aShortArray9057
		    = new short[((Class157_Sub1) this).anInt9055];
	    else
		((Class157_Sub1) class157_sub1_154_).aShortArray9057
		    = ((Class157_Sub1) class157_sub1_155_).aShortArray9057;
	    for (int i_162_ = 0; i_162_ < ((Class157_Sub1) this).anInt9055;
		 i_162_++)
		((Class157_Sub1) class157_sub1_154_).aShortArray9057[i_162_]
		    = ((Class157_Sub1) this).aShortArray9057[i_162_];
	} else
	    ((Class157_Sub1) class157_sub1_154_).aShortArray9057
		= ((Class157_Sub1) this).aShortArray9057;
	if (Class338.method4384(i, ((Class157_Sub1) this).anInt9035)) {
	    if (((Class157_Sub1) class157_sub1_155_).aByteArray9058 == null
		|| (((Class157_Sub1) class157_sub1_155_).aByteArray9058.length
		    < ((Class157_Sub1) this).anInt9055))
		((Class157_Sub1) class157_sub1_154_).aByteArray9058
		    = ((Class157_Sub1) class157_sub1_155_).aByteArray9058
		    = new byte[((Class157_Sub1) this).anInt9055];
	    else
		((Class157_Sub1) class157_sub1_154_).aByteArray9058
		    = ((Class157_Sub1) class157_sub1_155_).aByteArray9058;
	    for (int i_163_ = 0; i_163_ < ((Class157_Sub1) this).anInt9055;
		 i_163_++)
		((Class157_Sub1) class157_sub1_154_).aByteArray9058[i_163_]
		    = ((Class157_Sub1) this).aByteArray9058[i_163_];
	} else
	    ((Class157_Sub1) class157_sub1_154_).aByteArray9058
		= ((Class157_Sub1) this).aByteArray9058;
	if (Class338.method4397(i, ((Class157_Sub1) this).anInt9035)) {
	    ((Class157_Sub1) class157_sub1_154_).aClass354_9050
		= ((Class157_Sub1) class157_sub1_155_).aClass354_9050;
	    ((Class354) ((Class157_Sub1) class157_sub1_154_).aClass354_9050)
		.anInterface36_3803
		= (((Class354) ((Class157_Sub1) this).aClass354_9050)
		   .anInterface36_3803);
	    ((Class354) ((Class157_Sub1) class157_sub1_154_).aClass354_9050)
		.aBool3801
		= ((Class354) ((Class157_Sub1) this).aClass354_9050).aBool3801;
	    ((Class354) ((Class157_Sub1) class157_sub1_154_).aClass354_9050)
		.aBool3802
		= true;
	} else if (Class338.method4392(i, ((Class157_Sub1) this).anInt9035))
	    ((Class157_Sub1) class157_sub1_154_).aClass354_9050
		= ((Class157_Sub1) this).aClass354_9050;
	else
	    ((Class157_Sub1) class157_sub1_154_).aClass354_9050 = null;
	if (Class338.method4399(i, ((Class157_Sub1) this).anInt9035)) {
	    if (((Class157_Sub1) class157_sub1_155_).aShortArray9048 == null
		|| (((Class157_Sub1) class157_sub1_155_).aShortArray9048.length
		    < ((Class157_Sub1) this).anInt9077)) {
		int i_164_ = ((Class157_Sub1) this).anInt9077;
		((Class157_Sub1) class157_sub1_154_).aShortArray9048
		    = ((Class157_Sub1) class157_sub1_155_).aShortArray9048
		    = new short[i_164_];
		((Class157_Sub1) class157_sub1_154_).aShortArray9049
		    = ((Class157_Sub1) class157_sub1_155_).aShortArray9049
		    = new short[i_164_];
		((Class157_Sub1) class157_sub1_154_).aShortArray9038
		    = ((Class157_Sub1) class157_sub1_155_).aShortArray9038
		    = new short[i_164_];
	    } else {
		((Class157_Sub1) class157_sub1_154_).aShortArray9048
		    = ((Class157_Sub1) class157_sub1_155_).aShortArray9048;
		((Class157_Sub1) class157_sub1_154_).aShortArray9049
		    = ((Class157_Sub1) class157_sub1_155_).aShortArray9049;
		((Class157_Sub1) class157_sub1_154_).aShortArray9038
		    = ((Class157_Sub1) class157_sub1_155_).aShortArray9038;
	    }
	    if (((Class157_Sub1) this).aClass352_9054 != null) {
		if (((Class157_Sub1) class157_sub1_155_).aClass352_9054
		    == null)
		    ((Class157_Sub1) class157_sub1_155_).aClass352_9054
			= new Class352();
		Class352 class352
		    = (((Class157_Sub1) class157_sub1_154_).aClass352_9054
		       = ((Class157_Sub1) class157_sub1_155_).aClass352_9054);
		if (((Class352) class352).aShortArray3796 == null
		    || (((Class352) class352).aShortArray3796.length
			< ((Class157_Sub1) this).anInt9077)) {
		    int i_165_ = ((Class157_Sub1) this).anInt9077;
		    ((Class352) class352).aShortArray3796 = new short[i_165_];
		    ((Class352) class352).aShortArray3794 = new short[i_165_];
		    ((Class352) class352).aShortArray3793 = new short[i_165_];
		    ((Class352) class352).aByteArray3795 = new byte[i_165_];
		}
		for (int i_166_ = 0; i_166_ < ((Class157_Sub1) this).anInt9077;
		     i_166_++) {
		    ((Class157_Sub1) class157_sub1_154_).aShortArray9048
			[i_166_]
			= ((Class157_Sub1) this).aShortArray9048[i_166_];
		    ((Class157_Sub1) class157_sub1_154_).aShortArray9049
			[i_166_]
			= ((Class157_Sub1) this).aShortArray9049[i_166_];
		    ((Class157_Sub1) class157_sub1_154_).aShortArray9038
			[i_166_]
			= ((Class157_Sub1) this).aShortArray9038[i_166_];
		    ((Class352) class352).aShortArray3796[i_166_]
			= (((Class352) ((Class157_Sub1) this).aClass352_9054)
			   .aShortArray3796[i_166_]);
		    ((Class352) class352).aShortArray3794[i_166_]
			= (((Class352) ((Class157_Sub1) this).aClass352_9054)
			   .aShortArray3794[i_166_]);
		    ((Class352) class352).aShortArray3793[i_166_]
			= (((Class352) ((Class157_Sub1) this).aClass352_9054)
			   .aShortArray3793[i_166_]);
		    ((Class352) class352).aByteArray3795[i_166_]
			= (((Class352) ((Class157_Sub1) this).aClass352_9054)
			   .aByteArray3795[i_166_]);
		}
	    } else {
		((Class157_Sub1) class157_sub1_154_).aClass352_9054 = null;
		for (int i_167_ = 0; i_167_ < ((Class157_Sub1) this).anInt9077;
		     i_167_++) {
		    ((Class157_Sub1) class157_sub1_154_).aShortArray9048
			[i_167_]
			= ((Class157_Sub1) this).aShortArray9048[i_167_];
		    ((Class157_Sub1) class157_sub1_154_).aShortArray9049
			[i_167_]
			= ((Class157_Sub1) this).aShortArray9049[i_167_];
		    ((Class157_Sub1) class157_sub1_154_).aShortArray9038
			[i_167_]
			= ((Class157_Sub1) this).aShortArray9038[i_167_];
		}
	    }
	    ((Class157_Sub1) class157_sub1_154_).aByteArray9052
		= ((Class157_Sub1) this).aByteArray9052;
	} else {
	    ((Class157_Sub1) class157_sub1_154_).aClass352_9054
		= ((Class157_Sub1) this).aClass352_9054;
	    ((Class157_Sub1) class157_sub1_154_).aShortArray9048
		= ((Class157_Sub1) this).aShortArray9048;
	    ((Class157_Sub1) class157_sub1_154_).aShortArray9049
		= ((Class157_Sub1) this).aShortArray9049;
	    ((Class157_Sub1) class157_sub1_154_).aShortArray9038
		= ((Class157_Sub1) this).aShortArray9038;
	    ((Class157_Sub1) class157_sub1_154_).aByteArray9052
		= ((Class157_Sub1) this).aByteArray9052;
	}
	if (Class338.method4396(i, ((Class157_Sub1) this).anInt9035)) {
	    ((Class157_Sub1) class157_sub1_154_).aClass354_9086
		= ((Class157_Sub1) class157_sub1_155_).aClass354_9086;
	    ((Class354) ((Class157_Sub1) class157_sub1_154_).aClass354_9086)
		.anInterface36_3803
		= (((Class354) ((Class157_Sub1) this).aClass354_9086)
		   .anInterface36_3803);
	    ((Class354) ((Class157_Sub1) class157_sub1_154_).aClass354_9086)
		.aBool3801
		= ((Class354) ((Class157_Sub1) this).aClass354_9086).aBool3801;
	    ((Class354) ((Class157_Sub1) class157_sub1_154_).aClass354_9086)
		.aBool3802
		= true;
	} else if (Class338.method4391(i, ((Class157_Sub1) this).anInt9035))
	    ((Class157_Sub1) class157_sub1_154_).aClass354_9086
		= ((Class157_Sub1) this).aClass354_9086;
	else
	    ((Class157_Sub1) class157_sub1_154_).aClass354_9086 = null;
	if (Class338.method4427(i, ((Class157_Sub1) this).anInt9035)) {
	    if (((Class157_Sub1) class157_sub1_155_).aFloatArray9061 == null
		|| (((Class157_Sub1) class157_sub1_155_).aFloatArray9061.length
		    < ((Class157_Sub1) this).anInt9055)) {
		int i_168_ = ((Class157_Sub1) this).anInt9077;
		((Class157_Sub1) class157_sub1_154_).aFloatArray9061
		    = ((Class157_Sub1) class157_sub1_155_).aFloatArray9061
		    = new float[i_168_];
		((Class157_Sub1) class157_sub1_154_).aFloatArray9053
		    = ((Class157_Sub1) class157_sub1_155_).aFloatArray9053
		    = new float[i_168_];
	    } else {
		((Class157_Sub1) class157_sub1_154_).aFloatArray9061
		    = ((Class157_Sub1) class157_sub1_155_).aFloatArray9061;
		((Class157_Sub1) class157_sub1_154_).aFloatArray9053
		    = ((Class157_Sub1) class157_sub1_155_).aFloatArray9053;
	    }
	    for (int i_169_ = 0; i_169_ < ((Class157_Sub1) this).anInt9077;
		 i_169_++) {
		((Class157_Sub1) class157_sub1_154_).aFloatArray9061[i_169_]
		    = ((Class157_Sub1) this).aFloatArray9061[i_169_];
		((Class157_Sub1) class157_sub1_154_).aFloatArray9053[i_169_]
		    = ((Class157_Sub1) this).aFloatArray9053[i_169_];
	    }
	} else {
	    ((Class157_Sub1) class157_sub1_154_).aFloatArray9061
		= ((Class157_Sub1) this).aFloatArray9061;
	    ((Class157_Sub1) class157_sub1_154_).aFloatArray9053
		= ((Class157_Sub1) this).aFloatArray9053;
	}
	if (Class338.method4462(i, ((Class157_Sub1) this).anInt9035)) {
	    ((Class157_Sub1) class157_sub1_154_).aClass354_9069
		= ((Class157_Sub1) class157_sub1_155_).aClass354_9069;
	    ((Class354) ((Class157_Sub1) class157_sub1_154_).aClass354_9069)
		.anInterface36_3803
		= (((Class354) ((Class157_Sub1) this).aClass354_9069)
		   .anInterface36_3803);
	    ((Class354) ((Class157_Sub1) class157_sub1_154_).aClass354_9069)
		.aBool3801
		= ((Class354) ((Class157_Sub1) this).aClass354_9069).aBool3801;
	    ((Class354) ((Class157_Sub1) class157_sub1_154_).aClass354_9069)
		.aBool3802
		= true;
	} else if (Class338.method4403(i, ((Class157_Sub1) this).anInt9035))
	    ((Class157_Sub1) class157_sub1_154_).aClass354_9069
		= ((Class157_Sub1) this).aClass354_9069;
	else
	    ((Class157_Sub1) class157_sub1_154_).aClass354_9069 = null;
	if (Class338.method4470(i, ((Class157_Sub1) this).anInt9035)) {
	    if (((Class157_Sub1) class157_sub1_155_).aShortArray9059 == null
		|| (((Class157_Sub1) class157_sub1_155_).aShortArray9059.length
		    < ((Class157_Sub1) this).anInt9055)) {
		int i_170_ = ((Class157_Sub1) this).anInt9055;
		((Class157_Sub1) class157_sub1_154_).aShortArray9059
		    = ((Class157_Sub1) class157_sub1_155_).aShortArray9059
		    = new short[i_170_];
		((Class157_Sub1) class157_sub1_154_).aShortArray9105
		    = ((Class157_Sub1) class157_sub1_155_).aShortArray9105
		    = new short[i_170_];
		((Class157_Sub1) class157_sub1_154_).aShortArray9091
		    = ((Class157_Sub1) class157_sub1_155_).aShortArray9091
		    = new short[i_170_];
	    } else {
		((Class157_Sub1) class157_sub1_154_).aShortArray9059
		    = ((Class157_Sub1) class157_sub1_155_).aShortArray9059;
		((Class157_Sub1) class157_sub1_154_).aShortArray9105
		    = ((Class157_Sub1) class157_sub1_155_).aShortArray9105;
		((Class157_Sub1) class157_sub1_154_).aShortArray9091
		    = ((Class157_Sub1) class157_sub1_155_).aShortArray9091;
	    }
	    for (int i_171_ = 0; i_171_ < ((Class157_Sub1) this).anInt9055;
		 i_171_++) {
		((Class157_Sub1) class157_sub1_154_).aShortArray9059[i_171_]
		    = ((Class157_Sub1) this).aShortArray9059[i_171_];
		((Class157_Sub1) class157_sub1_154_).aShortArray9105[i_171_]
		    = ((Class157_Sub1) this).aShortArray9105[i_171_];
		((Class157_Sub1) class157_sub1_154_).aShortArray9091[i_171_]
		    = ((Class157_Sub1) this).aShortArray9091[i_171_];
	    }
	} else {
	    ((Class157_Sub1) class157_sub1_154_).aShortArray9059
		= ((Class157_Sub1) this).aShortArray9059;
	    ((Class157_Sub1) class157_sub1_154_).aShortArray9105
		= ((Class157_Sub1) this).aShortArray9105;
	    ((Class157_Sub1) class157_sub1_154_).aShortArray9091
		= ((Class157_Sub1) this).aShortArray9091;
	}
	if (Class338.method4386(i, ((Class157_Sub1) this).anInt9035)) {
	    ((Class157_Sub1) class157_sub1_154_).aClass339_9101
		= ((Class157_Sub1) class157_sub1_155_).aClass339_9101;
	    ((Class339) ((Class157_Sub1) class157_sub1_154_).aClass339_9101)
		.anInterface41_3580
		= (((Class339) ((Class157_Sub1) this).aClass339_9101)
		   .anInterface41_3580);
	    ((Class339) ((Class157_Sub1) class157_sub1_154_).aClass339_9101)
		.aBool3582
		= ((Class339) ((Class157_Sub1) this).aClass339_9101).aBool3582;
	    ((Class339) ((Class157_Sub1) class157_sub1_154_).aClass339_9101)
		.aBool3581
		= true;
	} else if (Class338.method4394(i, ((Class157_Sub1) this).anInt9035))
	    ((Class157_Sub1) class157_sub1_154_).aClass339_9101
		= ((Class157_Sub1) this).aClass339_9101;
	else
	    ((Class157_Sub1) class157_sub1_154_).aClass339_9101 = null;
	if (Class338.method4387(i, ((Class157_Sub1) this).anInt9035)) {
	    if (((Class157_Sub1) class157_sub1_155_).aShortArray9062 == null
		|| (((Class157_Sub1) class157_sub1_155_).aShortArray9062.length
		    < ((Class157_Sub1) this).anInt9055)) {
		int i_172_ = ((Class157_Sub1) this).anInt9055;
		((Class157_Sub1) class157_sub1_154_).aShortArray9062
		    = ((Class157_Sub1) class157_sub1_155_).aShortArray9062
		    = new short[i_172_];
	    } else
		((Class157_Sub1) class157_sub1_154_).aShortArray9062
		    = ((Class157_Sub1) class157_sub1_155_).aShortArray9062;
	    for (int i_173_ = 0; i_173_ < ((Class157_Sub1) this).anInt9055;
		 i_173_++)
		((Class157_Sub1) class157_sub1_154_).aShortArray9062[i_173_]
		    = ((Class157_Sub1) this).aShortArray9062[i_173_];
	} else
	    ((Class157_Sub1) class157_sub1_154_).aShortArray9062
		= ((Class157_Sub1) this).aShortArray9062;
	if (Class338.method4388(i, ((Class157_Sub1) this).anInt9035)) {
	    if (((Class157_Sub1) class157_sub1_155_).aClass328Array9094 == null
		|| ((((Class157_Sub1) class157_sub1_155_)
		     .aClass328Array9094).length
		    < ((Class157_Sub1) this).anInt9092)) {
		int i_174_ = ((Class157_Sub1) this).anInt9092;
		((Class157_Sub1) class157_sub1_154_).aClass328Array9094
		    = ((Class157_Sub1) class157_sub1_155_).aClass328Array9094
		    = new Class328[i_174_];
		for (int i_175_ = 0; i_175_ < ((Class157_Sub1) this).anInt9092;
		     i_175_++)
		    ((Class157_Sub1) class157_sub1_154_).aClass328Array9094
			[i_175_]
			= ((Class157_Sub1) this).aClass328Array9094[i_175_]
			      .method4263();
	    } else {
		((Class157_Sub1) class157_sub1_154_).aClass328Array9094
		    = ((Class157_Sub1) class157_sub1_155_).aClass328Array9094;
		for (int i_176_ = 0; i_176_ < ((Class157_Sub1) this).anInt9092;
		     i_176_++)
		    ((Class157_Sub1) class157_sub1_154_).aClass328Array9094
			[i_176_].method4264
			(((Class157_Sub1) this).aClass328Array9094[i_176_]);
	    }
	} else
	    ((Class157_Sub1) class157_sub1_154_).aClass328Array9094
		= ((Class157_Sub1) this).aClass328Array9094;
	((Class157_Sub1) class157_sub1_154_).aClass348Array9078
	    = ((Class157_Sub1) this).aClass348Array9078;
	if (((Class157_Sub1) this).aBool9046) {
	    ((Class157_Sub1) class157_sub1_154_).anInt9065
		= ((Class157_Sub1) this).anInt9065;
	    ((Class157_Sub1) class157_sub1_154_).anInt9060
		= ((Class157_Sub1) this).anInt9060;
	    ((Class157_Sub1) class157_sub1_154_).anInt9079
		= ((Class157_Sub1) this).anInt9079;
	    ((Class157_Sub1) class157_sub1_154_).anInt9080
		= ((Class157_Sub1) this).anInt9080;
	    ((Class157_Sub1) class157_sub1_154_).anInt9093
		= ((Class157_Sub1) this).anInt9093;
	    ((Class157_Sub1) class157_sub1_154_).anInt9066
		= ((Class157_Sub1) this).anInt9066;
	    ((Class157_Sub1) class157_sub1_154_).anInt9081
		= ((Class157_Sub1) this).anInt9081;
	    ((Class157_Sub1) class157_sub1_154_).anInt9082
		= ((Class157_Sub1) this).anInt9082;
	    ((Class157_Sub1) class157_sub1_154_).aBool9046 = true;
	} else
	    ((Class157_Sub1) class157_sub1_154_).aBool9046 = false;
	if (((Class157_Sub1) this).aBool9083) {
	    ((Class157_Sub1) class157_sub1_154_).anInt9084
		= ((Class157_Sub1) this).anInt9084;
	    ((Class157_Sub1) class157_sub1_154_).aBool9083 = true;
	} else
	    ((Class157_Sub1) class157_sub1_154_).aBool9083 = false;
	((Class157_Sub1) class157_sub1_154_).anIntArrayArray9033
	    = ((Class157_Sub1) this).anIntArrayArray9033;
	((Class157_Sub1) class157_sub1_154_).anIntArrayArray9063
	    = ((Class157_Sub1) this).anIntArrayArray9063;
	((Class157_Sub1) class157_sub1_154_).anIntArrayArray9095
	    = ((Class157_Sub1) this).anIntArrayArray9095;
	((Class157_Sub1) class157_sub1_154_).aShortArray9089
	    = ((Class157_Sub1) this).aShortArray9089;
	((Class157_Sub1) class157_sub1_154_).anIntArray9100
	    = ((Class157_Sub1) this).anIntArray9100;
	((Class157_Sub1) class157_sub1_154_).aShortArray9043
	    = ((Class157_Sub1) this).aShortArray9043;
	((Class157_Sub1) class157_sub1_154_).aShortArray9047
	    = ((Class157_Sub1) this).aShortArray9047;
	((Class157_Sub1) class157_sub1_154_).aShortArray9044
	    = ((Class157_Sub1) this).aShortArray9044;
	((Class157_Sub1) class157_sub1_154_).aShortArray9064
	    = ((Class157_Sub1) this).aShortArray9064;
	((Class157_Sub1) class157_sub1_154_).anIntArray9085
	    = ((Class157_Sub1) this).anIntArray9085;
	((Class157_Sub1) class157_sub1_154_).anIntArray9087
	    = ((Class157_Sub1) this).anIntArray9087;
	((Class157_Sub1) class157_sub1_154_).anIntArray9099
	    = ((Class157_Sub1) this).anIntArray9099;
	((Class157_Sub1) class157_sub1_154_).aClass170Array9090
	    = ((Class157_Sub1) this).aClass170Array9090;
	((Class157_Sub1) class157_sub1_154_).aClass144Array9075
	    = ((Class157_Sub1) this).aClass144Array9075;
	return class157_sub1_154_;
    }
    
    void method8355() {
	if (((Class157_Sub1) this).aBool9071) {
	    ((Class157_Sub1) this).aBool9071 = false;
	    if (((Class157_Sub1) this).aClass170Array9090 == null
		&& ((Class157_Sub1) this).aClass144Array9075 == null
		&& ((Class157_Sub1) this).aClass348Array9078 == null
		&& !Class338.method4382(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		boolean bool = false;
		boolean bool_177_ = false;
		boolean bool_178_ = false;
		if (((Class157_Sub1) this).anIntArray9040 != null
		    && !Class338.method4381(((Class157_Sub1) this).anInt9034,
					    (((Class157_Sub1) this)
					     .anInt9035))) {
		    if (((Class157_Sub1) this).aClass354_9045 == null
			|| ((Class157_Sub1) this).aClass354_9045
			       .method4573()) {
			if (!((Class157_Sub1) this).aBool9046)
			    method8358();
			bool = true;
		    } else
			((Class157_Sub1) this).aBool9071 = true;
		}
		if (((Class157_Sub1) this).anIntArray9041 != null
		    && !Class338.method4401(((Class157_Sub1) this).anInt9034,
					    (((Class157_Sub1) this)
					     .anInt9035))) {
		    if (((Class157_Sub1) this).aClass354_9045 == null
			|| ((Class157_Sub1) this).aClass354_9045
			       .method4573()) {
			if (!((Class157_Sub1) this).aBool9046)
			    method8358();
			bool_177_ = true;
		    } else
			((Class157_Sub1) this).aBool9071 = true;
		}
		if (((Class157_Sub1) this).anIntArray9042 != null
		    && !Class338.method4402(((Class157_Sub1) this).anInt9034,
					    (((Class157_Sub1) this)
					     .anInt9035))) {
		    if (((Class157_Sub1) this).aClass354_9045 == null
			|| ((Class157_Sub1) this).aClass354_9045
			       .method4573()) {
			if (!((Class157_Sub1) this).aBool9046)
			    method8358();
			bool_178_ = true;
		    } else
			((Class157_Sub1) this).aBool9071 = true;
		}
		if (bool)
		    ((Class157_Sub1) this).anIntArray9040 = null;
		if (bool_177_)
		    ((Class157_Sub1) this).anIntArray9041 = null;
		if (bool_178_)
		    ((Class157_Sub1) this).anIntArray9042 = null;
	    }
	    if (((Class157_Sub1) this).aShortArray9089 != null
		&& ((Class157_Sub1) this).anIntArray9040 == null
		&& ((Class157_Sub1) this).anIntArray9041 == null
		&& ((Class157_Sub1) this).anIntArray9042 == null) {
		((Class157_Sub1) this).aShortArray9089 = null;
		((Class157_Sub1) this).anIntArray9100 = null;
	    }
	while_35_:
	    do {
		if (((Class157_Sub1) this).aByteArray9052 != null
		    && !Class338.method4478(((Class157_Sub1) this).anInt9034,
					    (((Class157_Sub1) this)
					     .anInt9035))) {
		    do {
			if ((((Class157_Sub1) this).anInt9035 & 0x37) != 0) {
			    if (((Class157_Sub1) this).aClass354_9086 != null
				&& !((Class157_Sub1) this).aClass354_9086
					.method4573())
				break;
			} else if ((((Class157_Sub1) this).aClass354_9050
				    != null)
				   && !((Class157_Sub1) this)
					   .aClass354_9050.method4573())
			    break;
			((Class157_Sub1) this).aShortArray9038 = null;
			((Class157_Sub1) this).aShortArray9049 = null;
			((Class157_Sub1) this).aShortArray9048 = null;
			((Class157_Sub1) this).aByteArray9052 = null;
			break while_35_;
		    } while (false);
		    ((Class157_Sub1) this).aBool9071 = true;
		}
	    } while (false);
	    if (((Class157_Sub1) this).aShortArray9057 != null
		&& !Class338.method4404(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		if (((Class157_Sub1) this).aClass354_9050 == null
		    || ((Class157_Sub1) this).aClass354_9050.method4573())
		    ((Class157_Sub1) this).aShortArray9057 = null;
		else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aByteArray9058 != null
		&& !Class338.method4405(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		if (((Class157_Sub1) this).aClass354_9050 == null
		    || ((Class157_Sub1) this).aClass354_9050.method4573())
		    ((Class157_Sub1) this).aByteArray9058 = null;
		else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aFloatArray9061 != null
		&& !Class338.method4406(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		if (((Class157_Sub1) this).aClass354_9069 == null
		    || ((Class157_Sub1) this).aClass354_9069.method4573()) {
		    ((Class157_Sub1) this).aFloatArray9053 = null;
		    ((Class157_Sub1) this).aFloatArray9061 = null;
		} else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aShortArray9062 != null
		&& !Class338.method4410(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		if (((Class157_Sub1) this).aClass354_9050 == null
		    || ((Class157_Sub1) this).aClass354_9050.method4573())
		    ((Class157_Sub1) this).aShortArray9062 = null;
		else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aShortArray9059 != null
		&& !Class338.method4409(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		if ((((Class157_Sub1) this).aClass339_9101 == null
		     || ((Class157_Sub1) this).aClass339_9101.method4481())
		    && (((Class157_Sub1) this).aClass354_9050 == null
			|| ((Class157_Sub1) this).aClass354_9050
			       .method4573())) {
		    ((Class157_Sub1) this).aShortArray9091 = null;
		    ((Class157_Sub1) this).aShortArray9105 = null;
		    ((Class157_Sub1) this).aShortArray9059 = null;
		} else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aShortArray9043 != null) {
		if (((Class157_Sub1) this).aClass354_9045 == null
		    || ((Class157_Sub1) this).aClass354_9045.method4573())
		    ((Class157_Sub1) this).aShortArray9043 = null;
		else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aShortArray9047 != null) {
		if (((Class157_Sub1) this).aClass354_9050 == null
		    || ((Class157_Sub1) this).aClass354_9050.method4573())
		    ((Class157_Sub1) this).aShortArray9047 = null;
		else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).anIntArrayArray9063 != null
		&& !Class338.method4438(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		((Class157_Sub1) this).anIntArrayArray9063 = null;
		((Class157_Sub1) this).aShortArray9064 = null;
	    }
	    if (((Class157_Sub1) this).anIntArrayArray9033 != null
		&& !Class338.method4453(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		((Class157_Sub1) this).anIntArrayArray9033 = null;
		((Class157_Sub1) this).aShortArray9044 = null;
	    }
	    if (((Class157_Sub1) this).anIntArrayArray9095 != null
		&& !Class338.method4435(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035))
		((Class157_Sub1) this).anIntArrayArray9095 = null;
	    if (((Class157_Sub1) this).anIntArray9085 != null
		&& (((Class157_Sub1) this).anInt9034 & 0x800) == 0
		&& (((Class157_Sub1) this).anInt9034 & 0x40000) == 0) {
		((Class157_Sub1) this).anIntArray9085 = null;
		((Class157_Sub1) this).anIntArray9087 = null;
		((Class157_Sub1) this).anIntArray9099 = null;
	    }
	}
    }
    
    void method8356() {
	if (((Class157_Sub1) this).aClass354_9050 != null)
	    ((Class354) ((Class157_Sub1) this).aClass354_9050).aBool3801
		= false;
    }
    
    public void method1946(int i, int i_179_, int i_180_) {
	for (int i_181_ = 0; i_181_ < ((Class157_Sub1) this).anInt9039;
	     i_181_++) {
	    if (i != 128)
		((Class157_Sub1) this).anIntArray9040[i_181_]
		    = ((Class157_Sub1) this).anIntArray9040[i_181_] * i >> 7;
	    if (i_179_ != 128)
		((Class157_Sub1) this).anIntArray9041[i_181_]
		    = (((Class157_Sub1) this).anIntArray9041[i_181_] * i_179_
		       >> 7);
	    if (i_180_ != 128)
		((Class157_Sub1) this).anIntArray9042[i_181_]
		    = (((Class157_Sub1) this).anIntArray9042[i_181_] * i_180_
		       >> 7);
	}
	method8385();
	((Class157_Sub1) this).aBool9046 = false;
    }
    
    void method1961(int i, int i_182_, int i_183_, int i_184_) {
	if (i == 0) {
	    int i_185_ = 0;
	    ((Class157_Sub1) this).anInt9103 = 0;
	    ((Class157_Sub1) this).anInt9104 = 0;
	    ((Class157_Sub1) this).anInt9031 = 0;
	    for (int i_186_ = 0; i_186_ < ((Class157_Sub1) this).anInt9039;
		 i_186_++) {
		((Class157_Sub1) this).anInt9103
		    += ((Class157_Sub1) this).anIntArray9040[i_186_];
		((Class157_Sub1) this).anInt9104
		    += ((Class157_Sub1) this).anIntArray9041[i_186_];
		((Class157_Sub1) this).anInt9031
		    += ((Class157_Sub1) this).anIntArray9042[i_186_];
		i_185_++;
	    }
	    if (i_185_ > 0) {
		((Class157_Sub1) this).anInt9103
		    = ((Class157_Sub1) this).anInt9103 / i_185_ + i_182_;
		((Class157_Sub1) this).anInt9104
		    = ((Class157_Sub1) this).anInt9104 / i_185_ + i_183_;
		((Class157_Sub1) this).anInt9031
		    = ((Class157_Sub1) this).anInt9031 / i_185_ + i_184_;
	    } else {
		((Class157_Sub1) this).anInt9103 = i_182_;
		((Class157_Sub1) this).anInt9104 = i_183_;
		((Class157_Sub1) this).anInt9031 = i_184_;
	    }
	} else if (i == 1) {
	    for (int i_187_ = 0; i_187_ < ((Class157_Sub1) this).anInt9039;
		 i_187_++) {
		((Class157_Sub1) this).anIntArray9040[i_187_] += i_182_;
		((Class157_Sub1) this).anIntArray9041[i_187_] += i_183_;
		((Class157_Sub1) this).anIntArray9042[i_187_] += i_184_;
	    }
	} else if (i == 2) {
	    for (int i_188_ = 0; i_188_ < ((Class157_Sub1) this).anInt9039;
		 i_188_++) {
		((Class157_Sub1) this).anIntArray9040[i_188_]
		    -= ((Class157_Sub1) this).anInt9103;
		((Class157_Sub1) this).anIntArray9041[i_188_]
		    -= ((Class157_Sub1) this).anInt9104;
		((Class157_Sub1) this).anIntArray9042[i_188_]
		    -= ((Class157_Sub1) this).anInt9031;
		if (i_184_ != 0) {
		    int i_189_ = Class417.anIntArray4766[i_184_];
		    int i_190_ = Class417.anIntArray4767[i_184_];
		    int i_191_
			= (((((Class157_Sub1) this).anIntArray9041[i_188_]
			     * i_189_)
			    + (((Class157_Sub1) this).anIntArray9040[i_188_]
			       * i_190_)
			    + 16383)
			   >> 14);
		    ((Class157_Sub1) this).anIntArray9041[i_188_]
			= ((((Class157_Sub1) this).anIntArray9041[i_188_]
			    * i_190_)
			   - (((Class157_Sub1) this).anIntArray9040[i_188_]
			      * i_189_)
			   + 16383) >> 14;
		    ((Class157_Sub1) this).anIntArray9040[i_188_] = i_191_;
		}
		if (i_182_ != 0) {
		    int i_192_ = Class417.anIntArray4766[i_182_];
		    int i_193_ = Class417.anIntArray4767[i_182_];
		    int i_194_
			= (((((Class157_Sub1) this).anIntArray9041[i_188_]
			     * i_193_)
			    - (((Class157_Sub1) this).anIntArray9042[i_188_]
			       * i_192_)
			    + 16383)
			   >> 14);
		    ((Class157_Sub1) this).anIntArray9042[i_188_]
			= ((((Class157_Sub1) this).anIntArray9041[i_188_]
			    * i_192_)
			   + (((Class157_Sub1) this).anIntArray9042[i_188_]
			      * i_193_)
			   + 16383) >> 14;
		    ((Class157_Sub1) this).anIntArray9041[i_188_] = i_194_;
		}
		if (i_183_ != 0) {
		    int i_195_ = Class417.anIntArray4766[i_183_];
		    int i_196_ = Class417.anIntArray4767[i_183_];
		    int i_197_
			= (((((Class157_Sub1) this).anIntArray9042[i_188_]
			     * i_195_)
			    + (((Class157_Sub1) this).anIntArray9040[i_188_]
			       * i_196_)
			    + 16383)
			   >> 14);
		    ((Class157_Sub1) this).anIntArray9042[i_188_]
			= ((((Class157_Sub1) this).anIntArray9042[i_188_]
			    * i_196_)
			   - (((Class157_Sub1) this).anIntArray9040[i_188_]
			      * i_195_)
			   + 16383) >> 14;
		    ((Class157_Sub1) this).anIntArray9040[i_188_] = i_197_;
		}
		((Class157_Sub1) this).anIntArray9040[i_188_]
		    += ((Class157_Sub1) this).anInt9103;
		((Class157_Sub1) this).anIntArray9041[i_188_]
		    += ((Class157_Sub1) this).anInt9104;
		((Class157_Sub1) this).anIntArray9042[i_188_]
		    += ((Class157_Sub1) this).anInt9031;
	    }
	} else if (i == 3) {
	    for (int i_198_ = 0; i_198_ < ((Class157_Sub1) this).anInt9039;
		 i_198_++) {
		((Class157_Sub1) this).anIntArray9040[i_198_]
		    -= ((Class157_Sub1) this).anInt9103;
		((Class157_Sub1) this).anIntArray9041[i_198_]
		    -= ((Class157_Sub1) this).anInt9104;
		((Class157_Sub1) this).anIntArray9042[i_198_]
		    -= ((Class157_Sub1) this).anInt9031;
		((Class157_Sub1) this).anIntArray9040[i_198_]
		    = (((Class157_Sub1) this).anIntArray9040[i_198_] * i_182_
		       / 128);
		((Class157_Sub1) this).anIntArray9041[i_198_]
		    = (((Class157_Sub1) this).anIntArray9041[i_198_] * i_183_
		       / 128);
		((Class157_Sub1) this).anIntArray9042[i_198_]
		    = (((Class157_Sub1) this).anIntArray9042[i_198_] * i_184_
		       / 128);
		((Class157_Sub1) this).anIntArray9040[i_198_]
		    += ((Class157_Sub1) this).anInt9103;
		((Class157_Sub1) this).anIntArray9041[i_198_]
		    += ((Class157_Sub1) this).anInt9104;
		((Class157_Sub1) this).anIntArray9042[i_198_]
		    += ((Class157_Sub1) this).anInt9031;
	    }
	} else if (i == 5) {
	    for (int i_199_ = 0; i_199_ < ((Class157_Sub1) this).anInt9055;
		 i_199_++) {
		int i_200_
		    = ((((Class157_Sub1) this).aByteArray9058[i_199_] & 0xff)
		       + i_182_ * 8);
		if (i_200_ < 0)
		    i_200_ = 0;
		else if (i_200_ > 255)
		    i_200_ = 255;
		((Class157_Sub1) this).aByteArray9058[i_199_] = (byte) i_200_;
	    }
	    if (((Class157_Sub1) this).aClass348Array9078 != null) {
		for (int i_201_ = 0; i_201_ < ((Class157_Sub1) this).anInt9092;
		     i_201_++) {
		    Class348 class348
			= ((Class157_Sub1) this).aClass348Array9078[i_201_];
		    Class328 class328
			= ((Class157_Sub1) this).aClass328Array9094[i_201_];
		    ((Class328) class328).anInt3503
			= (((Class328) class328).anInt3503 & 0xffffff
			   | 255 - ((((Class157_Sub1) this).aByteArray9058
				     [((Class348) class348).anInt3653])
				    & 0xff) << 24);
		}
	    }
	    method8356();
	} else if (i == 7) {
	    for (int i_202_ = 0; i_202_ < ((Class157_Sub1) this).anInt9055;
		 i_202_++) {
		int i_203_
		    = ((Class157_Sub1) this).aShortArray9057[i_202_] & 0xffff;
		int i_204_ = i_203_ >> 10 & 0x3f;
		int i_205_ = i_203_ >> 7 & 0x7;
		int i_206_ = i_203_ & 0x7f;
		i_204_ = i_204_ + i_182_ & 0x3f;
		i_205_ += i_183_ / 4;
		if (i_205_ < 0)
		    i_205_ = 0;
		else if (i_205_ > 7)
		    i_205_ = 7;
		i_206_ += i_184_;
		if (i_206_ < 0)
		    i_206_ = 0;
		else if (i_206_ > 127)
		    i_206_ = 127;
		((Class157_Sub1) this).aShortArray9057[i_202_]
		    = (short) (i_204_ << 10 | i_205_ << 7 | i_206_);
	    }
	    if (((Class157_Sub1) this).aClass348Array9078 != null) {
		for (int i_207_ = 0; i_207_ < ((Class157_Sub1) this).anInt9092;
		     i_207_++) {
		    Class348 class348
			= ((Class157_Sub1) this).aClass348Array9078[i_207_];
		    Class328 class328
			= ((Class157_Sub1) this).aClass328Array9094[i_207_];
		    ((Class328) class328).anInt3503
			= (((Class328) class328).anInt3503 & ~0xffffff
			   | ((Class649.anIntArray8420
			       [(((Class157_Sub1) this).aShortArray9057
				 [((Class348) class348).anInt3653]) & 0xffff])
			      & 0xffffff));
		}
	    }
	    method8356();
	} else if (i == 8) {
	    for (int i_208_ = 0; i_208_ < ((Class157_Sub1) this).anInt9092;
		 i_208_++) {
		Class328 class328
		    = ((Class157_Sub1) this).aClass328Array9094[i_208_];
		((Class328) class328).anInt3508 += i_182_;
		((Class328) class328).anInt3507 += i_183_;
	    }
	} else if (i == 10) {
	    for (int i_209_ = 0; i_209_ < ((Class157_Sub1) this).anInt9092;
		 i_209_++) {
		Class328 class328
		    = ((Class157_Sub1) this).aClass328Array9094[i_209_];
		((Class328) class328).anInt3504
		    = ((Class328) class328).anInt3504 * i_182_ >> 7;
		((Class328) class328).anInt3506
		    = ((Class328) class328).anInt3506 * i_183_ >> 7;
	    }
	} else if (i == 9) {
	    for (int i_210_ = 0; i_210_ < ((Class157_Sub1) this).anInt9092;
		 i_210_++) {
		Class328 class328
		    = ((Class157_Sub1) this).aClass328Array9094[i_210_];
		((Class328) class328).anInt3505
		    = ((Class328) class328).anInt3505 + i_182_ & 0x3fff;
	    }
	}
    }
    
    public void method2001(short i, short i_211_) {
	Class165 class165
	    = ((Class157_Sub1) this).aClass173_Sub1_9068.aClass165_1984;
	for (int i_212_ = 0; i_212_ < ((Class157_Sub1) this).anInt9055;
	     i_212_++) {
	    if (((Class157_Sub1) this).aShortArray9062[i_212_] == i)
		((Class157_Sub1) this).aShortArray9062[i_212_] = i_211_;
	}
	byte i_213_ = 0;
	byte i_214_ = 0;
	if (i != -1) {
	    Class160 class160 = class165.method2093(i & 0xffff, (byte) -17);
	    i_213_ = class160.aByte1802;
	    i_214_ = class160.aByte1801;
	}
	byte i_215_ = 0;
	byte i_216_ = 0;
	if (i_211_ != -1) {
	    Class160 class160
		= class165.method2093(i_211_ & 0xffff, (byte) -10);
	    i_215_ = class160.aByte1802;
	    i_216_ = class160.aByte1801;
	    if (class160.aByte1775 != 0 || class160.aByte1776 != 0)
		((Class157_Sub1) this).aBool9073 = true;
	}
	if (i_213_ != i_215_ | i_214_ != i_216_) {
	    if (((Class157_Sub1) this).aClass348Array9078 != null) {
		for (int i_217_ = 0; i_217_ < ((Class157_Sub1) this).anInt9092;
		     i_217_++) {
		    Class348 class348
			= ((Class157_Sub1) this).aClass348Array9078[i_217_];
		    Class328 class328
			= ((Class157_Sub1) this).aClass328Array9094[i_217_];
		    ((Class328) class328).anInt3503
			= (((Class328) class328).anInt3503 & ~0xffffff
			   | ((Class649.anIntArray8420
			       [(((Class157_Sub1) this).aShortArray9057
				 [((Class348) class348).anInt3653]) & 0xffff])
			      & 0xffffff));
		}
	    }
	    method8356();
	}
    }
    
    int method8357(int i, int i_218_) {
	i_218_ = i_218_ * (i & 0x7f) >> 7;
	if (i_218_ < 2)
	    i_218_ = 2;
	else if (i_218_ > 126)
	    i_218_ = 126;
	return (i & 0xff80) + i_218_;
    }
    
    public void method1934(int i) {
	int i_219_ = Class417.anIntArray4766[i];
	int i_220_ = Class417.anIntArray4767[i];
	for (int i_221_ = 0; i_221_ < ((Class157_Sub1) this).anInt9039;
	     i_221_++) {
	    int i_222_
		= ((((Class157_Sub1) this).anIntArray9041[i_221_] * i_220_
		    - ((Class157_Sub1) this).anIntArray9042[i_221_] * i_219_)
		   >> 14);
	    ((Class157_Sub1) this).anIntArray9042[i_221_]
		= ((((Class157_Sub1) this).anIntArray9041[i_221_] * i_219_
		    + ((Class157_Sub1) this).anIntArray9042[i_221_] * i_220_)
		   >> 14);
	    ((Class157_Sub1) this).anIntArray9041[i_221_] = i_222_;
	}
	method8385();
	((Class157_Sub1) this).aBool9046 = false;
    }
    
    public void method1879(int i) {
	int i_223_ = Class417.anIntArray4766[i];
	int i_224_ = Class417.anIntArray4767[i];
	for (int i_225_ = 0; i_225_ < ((Class157_Sub1) this).anInt9039;
	     i_225_++) {
	    int i_226_
		= ((((Class157_Sub1) this).anIntArray9041[i_225_] * i_223_
		    + ((Class157_Sub1) this).anIntArray9040[i_225_] * i_224_)
		   >> 14);
	    ((Class157_Sub1) this).anIntArray9041[i_225_]
		= ((((Class157_Sub1) this).anIntArray9041[i_225_] * i_224_
		    - ((Class157_Sub1) this).anIntArray9040[i_225_] * i_223_)
		   >> 14);
	    ((Class157_Sub1) this).anIntArray9040[i_225_] = i_226_;
	}
	method8385();
	((Class157_Sub1) this).aBool9046 = false;
    }
    
    public boolean method2013() {
	if (((Class157_Sub1) this).aShortArray9062 == null)
	    return true;
	for (int i = 0; i < ((Class157_Sub1) this).aShortArray9062.length;
	     i++) {
	    if (((Class157_Sub1) this).aShortArray9062[i] != -1
		&& !(((Class173_Sub1)
		      ((Class157_Sub1) this).aClass173_Sub1_9068)
			 .aClass329_9315.method4267
		     ((((Class157_Sub1) this).aClass173_Sub1_9068
			   .aClass165_1984.method2093
		       (((Class157_Sub1) this).aShortArray9062[i],
			(byte) -105)),
		      -1)))
		return false;
	}
	return true;
    }
    
    public void method1987(int i) {
	((Class157_Sub1) this).aShort9036 = (short) i;
	method8356();
    }
    
    public void method2011(int i, int i_227_, int i_228_) {
	for (int i_229_ = 0; i_229_ < ((Class157_Sub1) this).anInt9039;
	     i_229_++) {
	    if (i != 128)
		((Class157_Sub1) this).anIntArray9040[i_229_]
		    = ((Class157_Sub1) this).anIntArray9040[i_229_] * i >> 7;
	    if (i_227_ != 128)
		((Class157_Sub1) this).anIntArray9041[i_229_]
		    = (((Class157_Sub1) this).anIntArray9041[i_229_] * i_227_
		       >> 7);
	    if (i_228_ != 128)
		((Class157_Sub1) this).anIntArray9042[i_229_]
		    = (((Class157_Sub1) this).anIntArray9042[i_229_] * i_228_
		       >> 7);
	}
	method8385();
	((Class157_Sub1) this).aBool9046 = false;
    }
    
    void method8358() {
	int i = 32767;
	int i_230_ = 32767;
	int i_231_ = 32767;
	int i_232_ = -32768;
	int i_233_ = -32768;
	int i_234_ = -32768;
	int i_235_ = 0;
	int i_236_ = 0;
	for (int i_237_ = 0; i_237_ < ((Class157_Sub1) this).anInt9039;
	     i_237_++) {
	    int i_238_ = ((Class157_Sub1) this).anIntArray9040[i_237_];
	    int i_239_ = ((Class157_Sub1) this).anIntArray9041[i_237_];
	    int i_240_ = ((Class157_Sub1) this).anIntArray9042[i_237_];
	    if (i_238_ < i)
		i = i_238_;
	    if (i_238_ > i_232_)
		i_232_ = i_238_;
	    if (i_239_ < i_230_)
		i_230_ = i_239_;
	    if (i_239_ > i_233_)
		i_233_ = i_239_;
	    if (i_240_ < i_231_)
		i_231_ = i_240_;
	    if (i_240_ > i_234_)
		i_234_ = i_240_;
	    int i_241_ = i_238_ * i_238_ + i_240_ * i_240_;
	    if (i_241_ > i_235_)
		i_235_ = i_241_;
	    i_241_ = i_238_ * i_238_ + i_240_ * i_240_ + i_239_ * i_239_;
	    if (i_241_ > i_236_)
		i_236_ = i_241_;
	}
	((Class157_Sub1) this).anInt9079 = i;
	((Class157_Sub1) this).anInt9080 = i_232_;
	((Class157_Sub1) this).anInt9093 = i_230_;
	((Class157_Sub1) this).anInt9066 = i_233_;
	((Class157_Sub1) this).anInt9081 = i_231_;
	((Class157_Sub1) this).anInt9082 = i_234_;
	((Class157_Sub1) this).anInt9060
	    = (int) (Math.sqrt((double) i_235_) + 0.99);
	((Class157_Sub1) this).anInt9065
	    = (int) (Math.sqrt((double) i_236_) + 0.99);
	((Class157_Sub1) this).aBool9046 = true;
    }
    
    public void method1909() {
	if (!((Class157_Sub1) this).aBool9083) {
	    if (!((Class157_Sub1) this).aBool9046)
		method8358();
	    ((Class157_Sub1) this).anInt9084
		= ((Class157_Sub1) this).anInt9093;
	    ((Class157_Sub1) this).aBool9083 = true;
	}
    }
    
    public int method1992() {
	return ((Class157_Sub1) this).aShort9036;
    }
    
    public int method1901() {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	return ((Class157_Sub1) this).anInt9065;
    }
    
    public int method1981() {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	return ((Class157_Sub1) this).anInt9093;
    }
    
    public void method1957() {
	for (int i = 0; i < ((Class157_Sub1) this).anInt9039; i++)
	    ((Class157_Sub1) this).anIntArray9042[i]
		= -((Class157_Sub1) this).anIntArray9042[i];
	for (int i = 0; i < ((Class157_Sub1) this).anInt9077; i++)
	    ((Class157_Sub1) this).aShortArray9038[i]
		= (short) -((Class157_Sub1) this).aShortArray9038[i];
	for (int i = 0; i < ((Class157_Sub1) this).anInt9055; i++) {
	    short i_242_ = ((Class157_Sub1) this).aShortArray9059[i];
	    ((Class157_Sub1) this).aShortArray9059[i]
		= ((Class157_Sub1) this).aShortArray9091[i];
	    ((Class157_Sub1) this).aShortArray9091[i] = i_242_;
	}
	method8385();
	method8367();
	method8368();
	((Class157_Sub1) this).aBool9046 = false;
    }
    
    public int method2018() {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	return ((Class157_Sub1) this).anInt9093;
    }
    
    public int method1905() {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	return ((Class157_Sub1) this).anInt9066;
    }
    
    public int method2022() {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	return ((Class157_Sub1) this).anInt9066;
    }
    
    public int method2004() {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	return ((Class157_Sub1) this).anInt9082;
    }
    
    public int method1903() {
	if (!((Class157_Sub1) this).aBool9083)
	    method1909();
	return ((Class157_Sub1) this).anInt9084;
    }
    
    public int method2020() {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	return ((Class157_Sub1) this).anInt9065;
    }
    
    public void method1910(int i) {
	((Class157_Sub1) this).aShort9036 = (short) i;
	method8356();
    }
    
    public int method1976() {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	return ((Class157_Sub1) this).anInt9079;
    }
    
    public int method1928() {
	return ((Class157_Sub1) this).aShort9036;
    }
    
    boolean method1953() {
	if (((Class157_Sub1) this).anIntArrayArray9033 == null)
	    return false;
	for (int i = 0; i < ((Class157_Sub1) this).anInt9088; i++) {
	    ((Class157_Sub1) this).anIntArray9040[i] <<= 4;
	    ((Class157_Sub1) this).anIntArray9041[i] <<= 4;
	    ((Class157_Sub1) this).anIntArray9042[i] <<= 4;
	}
	((Class157_Sub1) this).anInt9103 = 0;
	((Class157_Sub1) this).anInt9104 = 0;
	((Class157_Sub1) this).anInt9031 = 0;
	return true;
    }
    
    public byte[] method1913() {
	return ((Class157_Sub1) this).aByteArray9058;
    }
    
    public void method1914(short i, short i_243_) {
	for (int i_244_ = 0; i_244_ < ((Class157_Sub1) this).anInt9055;
	     i_244_++) {
	    if (((Class157_Sub1) this).aShortArray9057[i_244_] == i)
		((Class157_Sub1) this).aShortArray9057[i_244_] = i_243_;
	}
	if (((Class157_Sub1) this).aClass348Array9078 != null) {
	    for (int i_245_ = 0; i_245_ < ((Class157_Sub1) this).anInt9092;
		 i_245_++) {
		Class348 class348
		    = ((Class157_Sub1) this).aClass348Array9078[i_245_];
		Class328 class328
		    = ((Class157_Sub1) this).aClass328Array9094[i_245_];
		((Class328) class328).anInt3503
		    = (((Class328) class328).anInt3503 & ~0xffffff
		       | ((Class649.anIntArray8420
			   [(((Class157_Sub1) this).aShortArray9057
			     [((Class348) class348).anInt3653]) & 0xffff])
			  & 0xffffff));
	    }
	}
	method8356();
    }
    
    public void method1945(byte i, byte[] is) {
	if (is == null) {
	    for (int i_246_ = 0; i_246_ < ((Class157_Sub1) this).anInt9055;
		 i_246_++)
		((Class157_Sub1) this).aByteArray9058[i_246_] = i;
	} else {
	    for (int i_247_ = 0; i_247_ < ((Class157_Sub1) this).anInt9055;
		 i_247_++) {
		int i_248_ = 255 - ((255 - (is[i_247_] & 0xff))
				    * (255 - (i & 0xff)) / 255);
		((Class157_Sub1) this).aByteArray9058[i_247_] = (byte) i_248_;
	    }
	}
	method8356();
    }
    
    public void method1916(short i, short i_249_) {
	Class165 class165
	    = ((Class157_Sub1) this).aClass173_Sub1_9068.aClass165_1984;
	for (int i_250_ = 0; i_250_ < ((Class157_Sub1) this).anInt9055;
	     i_250_++) {
	    if (((Class157_Sub1) this).aShortArray9062[i_250_] == i)
		((Class157_Sub1) this).aShortArray9062[i_250_] = i_249_;
	}
	byte i_251_ = 0;
	byte i_252_ = 0;
	if (i != -1) {
	    Class160 class160 = class165.method2093(i & 0xffff, (byte) 2);
	    i_251_ = class160.aByte1802;
	    i_252_ = class160.aByte1801;
	}
	byte i_253_ = 0;
	byte i_254_ = 0;
	if (i_249_ != -1) {
	    Class160 class160
		= class165.method2093(i_249_ & 0xffff, (byte) -13);
	    i_253_ = class160.aByte1802;
	    i_254_ = class160.aByte1801;
	    if (class160.aByte1775 != 0 || class160.aByte1776 != 0)
		((Class157_Sub1) this).aBool9073 = true;
	}
	if (i_251_ != i_253_ | i_252_ != i_254_) {
	    if (((Class157_Sub1) this).aClass348Array9078 != null) {
		for (int i_255_ = 0; i_255_ < ((Class157_Sub1) this).anInt9092;
		     i_255_++) {
		    Class348 class348
			= ((Class157_Sub1) this).aClass348Array9078[i_255_];
		    Class328 class328
			= ((Class157_Sub1) this).aClass328Array9094[i_255_];
		    ((Class328) class328).anInt3503
			= (((Class328) class328).anInt3503 & ~0xffffff
			   | ((Class649.anIntArray8420
			       [(((Class157_Sub1) this).aShortArray9057
				 [((Class348) class348).anInt3653]) & 0xffff])
			      & 0xffffff));
		}
	    }
	    method8356();
	}
    }
    
    public void method1917(int i, int i_256_, int i_257_, int i_258_) {
	for (int i_259_ = 0; i_259_ < ((Class157_Sub1) this).anInt9055;
	     i_259_++) {
	    int i_260_
		= ((Class157_Sub1) this).aShortArray9057[i_259_] & 0xffff;
	    int i_261_ = i_260_ >> 10 & 0x3f;
	    int i_262_ = i_260_ >> 7 & 0x7;
	    int i_263_ = i_260_ & 0x7f;
	    if (i != -1)
		i_261_ += (i - i_261_) * i_258_ >> 7;
	    if (i_256_ != -1)
		i_262_ += (i_256_ - i_262_) * i_258_ >> 7;
	    if (i_257_ != -1)
		i_263_ += (i_257_ - i_263_) * i_258_ >> 7;
	    ((Class157_Sub1) this).aShortArray9057[i_259_]
		= (short) (i_261_ << 10 | i_262_ << 7 | i_263_);
	}
	if (((Class157_Sub1) this).aClass348Array9078 != null) {
	    for (int i_264_ = 0; i_264_ < ((Class157_Sub1) this).anInt9092;
		 i_264_++) {
		Class348 class348
		    = ((Class157_Sub1) this).aClass348Array9078[i_264_];
		Class328 class328
		    = ((Class157_Sub1) this).aClass328Array9094[i_264_];
		((Class328) class328).anInt3503
		    = (((Class328) class328).anInt3503 & ~0xffffff
		       | ((Class649.anIntArray8420
			   [(((Class157_Sub1) this).aShortArray9057
			     [((Class348) class348).anInt3653]) & 0xffff])
			  & 0xffffff));
	    }
	}
	method8356();
    }
    
    public void method1883(int i, int i_265_, Class137 class137,
			   Class137 class137_266_, int i_267_, int i_268_,
			   int i_269_) {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	int i_270_ = i_267_ + ((Class157_Sub1) this).anInt9079;
	int i_271_ = i_267_ + ((Class157_Sub1) this).anInt9080;
	int i_272_ = i_269_ + ((Class157_Sub1) this).anInt9081;
	int i_273_ = i_269_ + ((Class157_Sub1) this).anInt9082;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_270_ >= 0
		&& ((i_271_ + class137.anInt1628 * 2130003981
		     >> class137.anInt1625 * 1543345989)
		    < class137.anInt1627 * -657933437)
		&& i_272_ >= 0
		&& ((i_273_ + class137.anInt1628 * 2130003981
		     >> class137.anInt1625 * 1543345989)
		    < class137.anInt1626 * 1769495707))) {
	    if (i == 4 || i == 5) {
		if (class137_266_ == null
		    || (i_270_ < 0
			|| ((i_271_ + class137_266_.anInt1628 * 2130003981
			     >> class137_266_.anInt1625 * 1543345989)
			    >= class137_266_.anInt1627 * -657933437)
			|| i_272_ < 0
			|| ((i_273_ + class137_266_.anInt1628 * 2130003981
			     >> class137_266_.anInt1625 * 1543345989)
			    >= class137_266_.anInt1626 * 1769495707)))
		    return;
	    } else {
		i_270_ >>= class137.anInt1625 * 1543345989;
		i_271_ = (i_271_ + (class137.anInt1628 * 2130003981 - 1)
			  >> class137.anInt1625 * 1543345989);
		i_272_ >>= class137.anInt1625 * 1543345989;
		i_273_ = (i_273_ + (class137.anInt1628 * 2130003981 - 1)
			  >> class137.anInt1625 * 1543345989);
		if (class137.method1669(i_270_, i_272_, (byte) 0) == i_268_
		    && class137.method1669(i_271_, i_272_, (byte) 0) == i_268_
		    && class137.method1669(i_270_, i_273_, (byte) 0) == i_268_
		    && class137.method1669(i_271_, i_273_, (byte) 0) == i_268_)
		    return;
	    }
	    if (i == 1) {
		for (int i_274_ = 0; i_274_ < ((Class157_Sub1) this).anInt9039;
		     i_274_++)
		    ((Class157_Sub1) this).anIntArray9041[i_274_]
			= (((Class157_Sub1) this).anIntArray9041[i_274_]
			   + class137.method1657(((((Class157_Sub1) this)
						   .anIntArray9040[i_274_])
						  + i_267_),
						 ((((Class157_Sub1) this)
						   .anIntArray9042[i_274_])
						  + i_269_),
						 2118037812)
			   - i_268_);
	    } else if (i == 2) {
		int i_275_ = ((Class157_Sub1) this).anInt9093;
		if (i_275_ == 0)
		    return;
		for (int i_276_ = 0; i_276_ < ((Class157_Sub1) this).anInt9039;
		     i_276_++) {
		    int i_277_ = (((Class157_Sub1) this).anIntArray9041[i_276_]
				  << 16) / i_275_;
		    if (i_277_ < i_265_)
			((Class157_Sub1) this).anIntArray9041[i_276_]
			    = (((Class157_Sub1) this).anIntArray9041[i_276_]
			       + (class137.method1657((((Class157_Sub1) this)
						       .anIntArray9040
						       [i_276_]) + i_267_,
						      (((Class157_Sub1) this)
						       .anIntArray9042
						       [i_276_]) + i_269_,
						      1444148786)
				  - i_268_) * (i_265_ - i_277_) / i_265_);
		}
	    } else if (i == 3) {
		int i_278_ = (i_265_ & 0xff) * 4;
		int i_279_ = (i_265_ >> 8 & 0xff) * 4;
		int i_280_ = (i_265_ >> 16 & 0xff) << 6;
		int i_281_ = (i_265_ >> 24 & 0xff) << 6;
		if (i_267_ - (i_278_ >> 1) < 0
		    || ((i_267_ + (i_278_ >> 1)
			 + class137.anInt1628 * 2130003981)
			>= (class137.anInt1627 * -657933437
			    << class137.anInt1625 * 1543345989))
		    || i_269_ - (i_279_ >> 1) < 0
		    || ((i_269_ + (i_279_ >> 1)
			 + class137.anInt1628 * 2130003981)
			>= (class137.anInt1626 * 1769495707
			    << class137.anInt1625 * 1543345989)))
		    return;
		method1884(class137, i_267_, i_268_, i_269_, i_278_, i_279_,
			   i_280_, i_281_);
	    } else if (i == 4) {
		int i_282_ = (((Class157_Sub1) this).anInt9066
			      - ((Class157_Sub1) this).anInt9093);
		for (int i_283_ = 0; i_283_ < ((Class157_Sub1) this).anInt9039;
		     i_283_++)
		    ((Class157_Sub1) this).anIntArray9041[i_283_]
			= (((Class157_Sub1) this).anIntArray9041[i_283_]
			   + (class137_266_.method1657((((Class157_Sub1) this)
							.anIntArray9040
							[i_283_]) + i_267_,
						       (((Class157_Sub1) this)
							.anIntArray9042
							[i_283_]) + i_269_,
						       1887637229)
			      - i_268_)
			   + i_282_);
	    } else if (i == 5) {
		int i_284_ = (((Class157_Sub1) this).anInt9066
			      - ((Class157_Sub1) this).anInt9093);
		for (int i_285_ = 0; i_285_ < ((Class157_Sub1) this).anInt9039;
		     i_285_++) {
		    int i_286_ = (((Class157_Sub1) this).anIntArray9040[i_285_]
				  + i_267_);
		    int i_287_ = (((Class157_Sub1) this).anIntArray9042[i_285_]
				  + i_269_);
		    int i_288_
			= class137.method1657(i_286_, i_287_, 1699043835);
		    int i_289_
			= class137_266_.method1657(i_286_, i_287_, 1870225100);
		    int i_290_ = i_288_ - i_289_ - i_265_;
		    ((Class157_Sub1) this).anIntArray9041[i_285_]
			= ((((Class157_Sub1) this).anIntArray9041[i_285_]
			    << 8) / i_284_ * i_290_
			   >> 8) - (i_268_ - i_288_);
		}
	    }
	    method8385();
	    ((Class157_Sub1) this).aBool9046 = false;
	}
    }
    
    public Class528_Sub21_Sub12 method1970
	(Class528_Sub21_Sub12 class528_sub21_sub12) {
	if (((Class157_Sub1) this).anInt9077 == 0)
	    return null;
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	int i;
	int i_291_;
	if ((((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
	     .anInt9306)
	    > 0) {
	    i = ((((Class157_Sub1) this).anInt9079
		  - ((((Class157_Sub1) this).anInt9066
		      * ((Class173_Sub1)
			 ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9306)
		     >> 8))
		 >> ((Class173_Sub1)
		     ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9305);
	    i_291_
		= ((((Class157_Sub1) this).anInt9080
		    - ((((Class157_Sub1) this).anInt9093
			* ((Class173_Sub1) (((Class157_Sub1) this)
					    .aClass173_Sub1_9068)).anInt9306)
		       >> 8))
		   >> ((Class173_Sub1)
		       ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9305);
	} else {
	    i = ((((Class157_Sub1) this).anInt9079
		  - ((((Class157_Sub1) this).anInt9093
		      * ((Class173_Sub1)
			 ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9306)
		     >> 8))
		 >> ((Class173_Sub1)
		     ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9305);
	    i_291_
		= ((((Class157_Sub1) this).anInt9080
		    - ((((Class157_Sub1) this).anInt9066
			* ((Class173_Sub1) (((Class157_Sub1) this)
					    .aClass173_Sub1_9068)).anInt9306)
		       >> 8))
		   >> ((Class173_Sub1)
		       ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9305);
	}
	int i_292_;
	int i_293_;
	if ((((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
	     .anInt9307)
	    > 0) {
	    i_292_
		= ((((Class157_Sub1) this).anInt9081
		    - ((((Class157_Sub1) this).anInt9066
			* ((Class173_Sub1) (((Class157_Sub1) this)
					    .aClass173_Sub1_9068)).anInt9307)
		       >> 8))
		   >> ((Class173_Sub1)
		       ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9305);
	    i_293_
		= ((((Class157_Sub1) this).anInt9082
		    - ((((Class157_Sub1) this).anInt9093
			* ((Class173_Sub1) (((Class157_Sub1) this)
					    .aClass173_Sub1_9068)).anInt9307)
		       >> 8))
		   >> ((Class173_Sub1)
		       ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9305);
	} else {
	    i_292_
		= ((((Class157_Sub1) this).anInt9081
		    - ((((Class157_Sub1) this).anInt9093
			* ((Class173_Sub1) (((Class157_Sub1) this)
					    .aClass173_Sub1_9068)).anInt9307)
		       >> 8))
		   >> ((Class173_Sub1)
		       ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9305);
	    i_293_
		= ((((Class157_Sub1) this).anInt9082
		    - ((((Class157_Sub1) this).anInt9066
			* ((Class173_Sub1) (((Class157_Sub1) this)
					    .aClass173_Sub1_9068)).anInt9307)
		       >> 8))
		   >> ((Class173_Sub1)
		       ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9305);
	}
	int i_294_ = i_291_ - i + 1;
	int i_295_ = i_293_ - i_292_ + 1;
	Class528_Sub21_Sub12_Sub1 class528_sub21_sub12_sub1
	    = (Class528_Sub21_Sub12_Sub1) class528_sub21_sub12;
	Class528_Sub21_Sub12_Sub1 class528_sub21_sub12_sub1_296_;
	if (class528_sub21_sub12_sub1 != null
	    && class528_sub21_sub12_sub1.method10823(i_294_, i_295_)) {
	    class528_sub21_sub12_sub1_296_ = class528_sub21_sub12_sub1;
	    class528_sub21_sub12_sub1_296_.method10824();
	} else
	    class528_sub21_sub12_sub1_296_
		= new Class528_Sub21_Sub12_Sub1((((Class157_Sub1) this)
						 .aClass173_Sub1_9068),
						i_294_, i_295_);
	class528_sub21_sub12_sub1_296_.method10829(i, i_292_, i_291_, i_293_);
	method8359(class528_sub21_sub12_sub1_296_);
	return class528_sub21_sub12_sub1_296_;
    }
    
    public boolean method1919() {
	return ((Class157_Sub1) this).aBool9051;
    }
    
    void method1885() {
	/* empty */
    }
    
    void method1886() {
	/* empty */
    }
    
    boolean method1876() {
	if (((Class157_Sub1) this).anIntArrayArray9033 == null)
	    return false;
	for (int i = 0; i < ((Class157_Sub1) this).anInt9088; i++) {
	    ((Class157_Sub1) this).anIntArray9040[i] <<= 4;
	    ((Class157_Sub1) this).anIntArray9041[i] <<= 4;
	    ((Class157_Sub1) this).anIntArray9042[i] <<= 4;
	}
	((Class157_Sub1) this).anInt9103 = 0;
	((Class157_Sub1) this).anInt9104 = 0;
	((Class157_Sub1) this).anInt9031 = 0;
	return true;
    }
    
    void method1893(int i, int[] is, int i_297_, int i_298_, int i_299_,
		    boolean bool, int i_300_, int[] is_301_) {
	int i_302_ = is.length;
	if (i == 0) {
	    i_297_ <<= 4;
	    i_298_ <<= 4;
	    i_299_ <<= 4;
	    int i_303_ = 0;
	    ((Class157_Sub1) this).anInt9103 = 0;
	    ((Class157_Sub1) this).anInt9104 = 0;
	    ((Class157_Sub1) this).anInt9031 = 0;
	    for (int i_304_ = 0; i_304_ < i_302_; i_304_++) {
		int i_305_ = is[i_304_];
		if (i_305_
		    < ((Class157_Sub1) this).anIntArrayArray9033.length) {
		    int[] is_306_
			= ((Class157_Sub1) this).anIntArrayArray9033[i_305_];
		    for (int i_307_ = 0; i_307_ < is_306_.length; i_307_++) {
			int i_308_ = is_306_[i_307_];
			if (((Class157_Sub1) this).aShortArray9044 == null
			    || (i_300_ & (((Class157_Sub1) this)
					  .aShortArray9044[i_308_])) != 0) {
			    ((Class157_Sub1) this).anInt9103
				+= (((Class157_Sub1) this).anIntArray9040
				    [i_308_]);
			    ((Class157_Sub1) this).anInt9104
				+= (((Class157_Sub1) this).anIntArray9041
				    [i_308_]);
			    ((Class157_Sub1) this).anInt9031
				+= (((Class157_Sub1) this).anIntArray9042
				    [i_308_]);
			    i_303_++;
			}
		    }
		}
	    }
	    if (i_303_ > 0) {
		((Class157_Sub1) this).anInt9103
		    = ((Class157_Sub1) this).anInt9103 / i_303_ + i_297_;
		((Class157_Sub1) this).anInt9104
		    = ((Class157_Sub1) this).anInt9104 / i_303_ + i_298_;
		((Class157_Sub1) this).anInt9031
		    = ((Class157_Sub1) this).anInt9031 / i_303_ + i_299_;
		((Class157_Sub1) this).aBool9106 = true;
	    } else {
		((Class157_Sub1) this).anInt9103 = i_297_;
		((Class157_Sub1) this).anInt9104 = i_298_;
		((Class157_Sub1) this).anInt9031 = i_299_;
	    }
	} else if (i == 1) {
	    if (is_301_ != null) {
		int i_309_ = ((is_301_[0] * i_297_ + is_301_[1] * i_298_
			       + is_301_[2] * i_299_ + 8192)
			      >> 14);
		int i_310_ = ((is_301_[3] * i_297_ + is_301_[4] * i_298_
			       + is_301_[5] * i_299_ + 8192)
			      >> 14);
		int i_311_ = ((is_301_[6] * i_297_ + is_301_[7] * i_298_
			       + is_301_[8] * i_299_ + 8192)
			      >> 14);
		i_297_ = i_309_;
		i_298_ = i_310_;
		i_299_ = i_311_;
	    }
	    i_297_ <<= 4;
	    i_298_ <<= 4;
	    i_299_ <<= 4;
	    for (int i_312_ = 0; i_312_ < i_302_; i_312_++) {
		int i_313_ = is[i_312_];
		if (i_313_
		    < ((Class157_Sub1) this).anIntArrayArray9033.length) {
		    int[] is_314_
			= ((Class157_Sub1) this).anIntArrayArray9033[i_313_];
		    for (int i_315_ = 0; i_315_ < is_314_.length; i_315_++) {
			int i_316_ = is_314_[i_315_];
			if (((Class157_Sub1) this).aShortArray9044 == null
			    || (i_300_ & (((Class157_Sub1) this)
					  .aShortArray9044[i_316_])) != 0) {
			    ((Class157_Sub1) this).anIntArray9040[i_316_]
				+= i_297_;
			    ((Class157_Sub1) this).anIntArray9041[i_316_]
				+= i_298_;
			    ((Class157_Sub1) this).anIntArray9042[i_316_]
				+= i_299_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_301_ != null) {
		int i_317_ = is_301_[9] << 4;
		int i_318_ = is_301_[10] << 4;
		int i_319_ = is_301_[11] << 4;
		int i_320_ = is_301_[12] << 4;
		int i_321_ = is_301_[13] << 4;
		int i_322_ = is_301_[14] << 4;
		if (((Class157_Sub1) this).aBool9106) {
		    int i_323_
			= ((is_301_[0] * ((Class157_Sub1) this).anInt9103
			    + is_301_[3] * ((Class157_Sub1) this).anInt9104
			    + is_301_[6] * ((Class157_Sub1) this).anInt9031
			    + 8192)
			   >> 14);
		    int i_324_
			= ((is_301_[1] * ((Class157_Sub1) this).anInt9103
			    + is_301_[4] * ((Class157_Sub1) this).anInt9104
			    + is_301_[7] * ((Class157_Sub1) this).anInt9031
			    + 8192)
			   >> 14);
		    int i_325_
			= ((is_301_[2] * ((Class157_Sub1) this).anInt9103
			    + is_301_[5] * ((Class157_Sub1) this).anInt9104
			    + is_301_[8] * ((Class157_Sub1) this).anInt9031
			    + 8192)
			   >> 14);
		    i_323_ += i_320_;
		    i_324_ += i_321_;
		    i_325_ += i_322_;
		    ((Class157_Sub1) this).anInt9103 = i_323_;
		    ((Class157_Sub1) this).anInt9104 = i_324_;
		    ((Class157_Sub1) this).anInt9031 = i_325_;
		    ((Class157_Sub1) this).aBool9106 = false;
		}
		int[] is_326_ = new int[9];
		int i_327_ = Class417.anIntArray4767[i_297_];
		int i_328_ = Class417.anIntArray4766[i_297_];
		int i_329_ = Class417.anIntArray4767[i_298_];
		int i_330_ = Class417.anIntArray4766[i_298_];
		int i_331_ = Class417.anIntArray4767[i_299_];
		int i_332_ = Class417.anIntArray4766[i_299_];
		int i_333_ = i_328_ * i_331_ + 8192 >> 14;
		int i_334_ = i_328_ * i_332_ + 8192 >> 14;
		is_326_[0] = i_329_ * i_331_ + i_330_ * i_334_ + 8192 >> 14;
		is_326_[1] = -i_329_ * i_332_ + i_330_ * i_333_ + 8192 >> 14;
		is_326_[2] = i_330_ * i_327_ + 8192 >> 14;
		is_326_[3] = i_327_ * i_332_ + 8192 >> 14;
		is_326_[4] = i_327_ * i_331_ + 8192 >> 14;
		is_326_[5] = -i_328_;
		is_326_[6] = -i_330_ * i_331_ + i_329_ * i_334_ + 8192 >> 14;
		is_326_[7] = i_330_ * i_332_ + i_329_ * i_333_ + 8192 >> 14;
		is_326_[8] = i_329_ * i_327_ + 8192 >> 14;
		int i_335_ = ((is_326_[0] * -((Class157_Sub1) this).anInt9103
			       + is_326_[1] * -((Class157_Sub1) this).anInt9104
			       + is_326_[2] * -((Class157_Sub1) this).anInt9031
			       + 8192)
			      >> 14);
		int i_336_ = ((is_326_[3] * -((Class157_Sub1) this).anInt9103
			       + is_326_[4] * -((Class157_Sub1) this).anInt9104
			       + is_326_[5] * -((Class157_Sub1) this).anInt9031
			       + 8192)
			      >> 14);
		int i_337_ = ((is_326_[6] * -((Class157_Sub1) this).anInt9103
			       + is_326_[7] * -((Class157_Sub1) this).anInt9104
			       + is_326_[8] * -((Class157_Sub1) this).anInt9031
			       + 8192)
			      >> 14);
		int i_338_ = i_335_ + ((Class157_Sub1) this).anInt9103;
		int i_339_ = i_336_ + ((Class157_Sub1) this).anInt9104;
		int i_340_ = i_337_ + ((Class157_Sub1) this).anInt9031;
		int[] is_341_ = new int[9];
		for (int i_342_ = 0; i_342_ < 3; i_342_++) {
		    for (int i_343_ = 0; i_343_ < 3; i_343_++) {
			int i_344_ = 0;
			for (int i_345_ = 0; i_345_ < 3; i_345_++)
			    i_344_ += (is_326_[i_342_ * 3 + i_345_]
				       * is_301_[i_343_ * 3 + i_345_]);
			is_341_[i_342_ * 3 + i_343_] = i_344_ + 8192 >> 14;
		    }
		}
		int i_346_ = ((is_326_[0] * i_320_ + is_326_[1] * i_321_
			       + is_326_[2] * i_322_ + 8192)
			      >> 14);
		int i_347_ = ((is_326_[3] * i_320_ + is_326_[4] * i_321_
			       + is_326_[5] * i_322_ + 8192)
			      >> 14);
		int i_348_ = ((is_326_[6] * i_320_ + is_326_[7] * i_321_
			       + is_326_[8] * i_322_ + 8192)
			      >> 14);
		i_346_ += i_338_;
		i_347_ += i_339_;
		i_348_ += i_340_;
		int[] is_349_ = new int[9];
		for (int i_350_ = 0; i_350_ < 3; i_350_++) {
		    for (int i_351_ = 0; i_351_ < 3; i_351_++) {
			int i_352_ = 0;
			for (int i_353_ = 0; i_353_ < 3; i_353_++)
			    i_352_ += (is_301_[i_350_ * 3 + i_353_]
				       * is_341_[i_351_ + i_353_ * 3]);
			is_349_[i_350_ * 3 + i_351_] = i_352_ + 8192 >> 14;
		    }
		}
		int i_354_ = ((is_301_[0] * i_346_ + is_301_[1] * i_347_
			       + is_301_[2] * i_348_ + 8192)
			      >> 14);
		int i_355_ = ((is_301_[3] * i_346_ + is_301_[4] * i_347_
			       + is_301_[5] * i_348_ + 8192)
			      >> 14);
		int i_356_ = ((is_301_[6] * i_346_ + is_301_[7] * i_347_
			       + is_301_[8] * i_348_ + 8192)
			      >> 14);
		i_354_ += i_317_;
		i_355_ += i_318_;
		i_356_ += i_319_;
		for (int i_357_ = 0; i_357_ < i_302_; i_357_++) {
		    int i_358_ = is[i_357_];
		    if (i_358_
			< ((Class157_Sub1) this).anIntArrayArray9033.length) {
			int[] is_359_ = (((Class157_Sub1) this)
					 .anIntArrayArray9033[i_358_]);
			for (int i_360_ = 0; i_360_ < is_359_.length;
			     i_360_++) {
			    int i_361_ = is_359_[i_360_];
			    if (((Class157_Sub1) this).aShortArray9044 == null
				|| ((i_300_ & (((Class157_Sub1) this)
					       .aShortArray9044[i_361_]))
				    != 0)) {
				int i_362_
				    = (is_349_[0] * (((Class157_Sub1) this)
						     .anIntArray9040[i_361_])
				       + is_349_[1] * (((Class157_Sub1) this)
						       .anIntArray9041[i_361_])
				       + is_349_[2] * (((Class157_Sub1) this)
						       .anIntArray9042[i_361_])
				       + 8192) >> 14;
				int i_363_
				    = (is_349_[3] * (((Class157_Sub1) this)
						     .anIntArray9040[i_361_])
				       + is_349_[4] * (((Class157_Sub1) this)
						       .anIntArray9041[i_361_])
				       + is_349_[5] * (((Class157_Sub1) this)
						       .anIntArray9042[i_361_])
				       + 8192) >> 14;
				int i_364_
				    = (is_349_[6] * (((Class157_Sub1) this)
						     .anIntArray9040[i_361_])
				       + is_349_[7] * (((Class157_Sub1) this)
						       .anIntArray9041[i_361_])
				       + is_349_[8] * (((Class157_Sub1) this)
						       .anIntArray9042[i_361_])
				       + 8192) >> 14;
				i_362_ += i_354_;
				i_363_ += i_355_;
				i_364_ += i_356_;
				((Class157_Sub1) this).anIntArray9040[i_361_]
				    = i_362_;
				((Class157_Sub1) this).anIntArray9041[i_361_]
				    = i_363_;
				((Class157_Sub1) this).anIntArray9042[i_361_]
				    = i_364_;
			    }
			}
		    }
		}
	    } else {
		for (int i_365_ = 0; i_365_ < i_302_; i_365_++) {
		    int i_366_ = is[i_365_];
		    if (i_366_
			< ((Class157_Sub1) this).anIntArrayArray9033.length) {
			int[] is_367_ = (((Class157_Sub1) this)
					 .anIntArrayArray9033[i_366_]);
			for (int i_368_ = 0; i_368_ < is_367_.length;
			     i_368_++) {
			    int i_369_ = is_367_[i_368_];
			    if (((Class157_Sub1) this).aShortArray9044 == null
				|| ((i_300_ & (((Class157_Sub1) this)
					       .aShortArray9044[i_369_]))
				    != 0)) {
				((Class157_Sub1) this).anIntArray9040[i_369_]
				    -= ((Class157_Sub1) this).anInt9103;
				((Class157_Sub1) this).anIntArray9041[i_369_]
				    -= ((Class157_Sub1) this).anInt9104;
				((Class157_Sub1) this).anIntArray9042[i_369_]
				    -= ((Class157_Sub1) this).anInt9031;
				if (i_299_ != 0) {
				    int i_370_
					= Class417.anIntArray4766[i_299_];
				    int i_371_
					= Class417.anIntArray4767[i_299_];
				    int i_372_
					= ((((Class157_Sub1) this)
					    .anIntArray9041[i_369_]) * i_370_
					   + (((Class157_Sub1) this)
					      .anIntArray9040[i_369_]) * i_371_
					   + 16383) >> 14;
				    ((Class157_Sub1) this).anIntArray9041
					[i_369_]
					= ((((Class157_Sub1) this)
					    .anIntArray9041[i_369_]) * i_371_
					   - (((Class157_Sub1) this)
					      .anIntArray9040[i_369_]) * i_370_
					   + 16383) >> 14;
				    ((Class157_Sub1) this).anIntArray9040
					[i_369_]
					= i_372_;
				}
				if (i_297_ != 0) {
				    int i_373_
					= Class417.anIntArray4766[i_297_];
				    int i_374_
					= Class417.anIntArray4767[i_297_];
				    int i_375_
					= ((((Class157_Sub1) this)
					    .anIntArray9041[i_369_]) * i_374_
					   - (((Class157_Sub1) this)
					      .anIntArray9042[i_369_]) * i_373_
					   + 16383) >> 14;
				    ((Class157_Sub1) this).anIntArray9042
					[i_369_]
					= ((((Class157_Sub1) this)
					    .anIntArray9041[i_369_]) * i_373_
					   + (((Class157_Sub1) this)
					      .anIntArray9042[i_369_]) * i_374_
					   + 16383) >> 14;
				    ((Class157_Sub1) this).anIntArray9041
					[i_369_]
					= i_375_;
				}
				if (i_298_ != 0) {
				    int i_376_
					= Class417.anIntArray4766[i_298_];
				    int i_377_
					= Class417.anIntArray4767[i_298_];
				    int i_378_
					= ((((Class157_Sub1) this)
					    .anIntArray9042[i_369_]) * i_376_
					   + (((Class157_Sub1) this)
					      .anIntArray9040[i_369_]) * i_377_
					   + 16383) >> 14;
				    ((Class157_Sub1) this).anIntArray9042
					[i_369_]
					= ((((Class157_Sub1) this)
					    .anIntArray9042[i_369_]) * i_377_
					   - (((Class157_Sub1) this)
					      .anIntArray9040[i_369_]) * i_376_
					   + 16383) >> 14;
				    ((Class157_Sub1) this).anIntArray9040
					[i_369_]
					= i_378_;
				}
				((Class157_Sub1) this).anIntArray9040[i_369_]
				    += ((Class157_Sub1) this).anInt9103;
				((Class157_Sub1) this).anIntArray9041[i_369_]
				    += ((Class157_Sub1) this).anInt9104;
				((Class157_Sub1) this).anIntArray9042[i_369_]
				    += ((Class157_Sub1) this).anInt9031;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_379_ = 0; i_379_ < i_302_; i_379_++) {
			int i_380_ = is[i_379_];
			if (i_380_ < (((Class157_Sub1) this)
				      .anIntArrayArray9033).length) {
			    int[] is_381_ = (((Class157_Sub1) this)
					     .anIntArrayArray9033[i_380_]);
			    for (int i_382_ = 0; i_382_ < is_381_.length;
				 i_382_++) {
				int i_383_ = is_381_[i_382_];
				if ((((Class157_Sub1) this).aShortArray9044
				     == null)
				    || ((i_300_ & (((Class157_Sub1) this)
						   .aShortArray9044[i_383_]))
					!= 0)) {
				    int i_384_ = (((Class157_Sub1) this)
						  .anIntArray9100[i_383_]);
				    int i_385_ = (((Class157_Sub1) this)
						  .anIntArray9100[i_383_ + 1]);
				    for (int i_386_ = i_384_;
					 (i_386_ < i_385_
					  && (((Class157_Sub1) this)
					      .aShortArray9089[i_386_]) != 0);
					 i_386_++) {
					int i_387_
					    = (((((Class157_Sub1) this)
						 .aShortArray9089[i_386_])
						& 0xffff)
					       - 1);
					if (i_299_ != 0) {
					    int i_388_
						= (Class417.anIntArray4766
						   [i_299_]);
					    int i_389_
						= (Class417.anIntArray4767
						   [i_299_]);
					    int i_390_
						= ((((((Class157_Sub1) this)
						      .aShortArray9049[i_387_])
						     * i_388_)
						    + (((Class157_Sub1) this)
						       .aShortArray9048
						       [i_387_]) * i_389_
						    + 16383)
						   >> 14);
					    ((Class157_Sub1) this)
						.aShortArray9049[i_387_]
						= (short) (((((Class157_Sub1)
							      this)
							     .aShortArray9049
							     [i_387_]) * i_389_
							    - (((Class157_Sub1)
								this)
							       .aShortArray9048
							       [i_387_]) * i_388_
							    + 16383)
							   >> 14);
					    ((Class157_Sub1) this)
						.aShortArray9048[i_387_]
						= (short) i_390_;
					}
					if (i_297_ != 0) {
					    int i_391_
						= (Class417.anIntArray4766
						   [i_297_]);
					    int i_392_
						= (Class417.anIntArray4767
						   [i_297_]);
					    int i_393_
						= ((((((Class157_Sub1) this)
						      .aShortArray9049[i_387_])
						     * i_392_)
						    - (((Class157_Sub1) this)
						       .aShortArray9038
						       [i_387_]) * i_391_
						    + 16383)
						   >> 14);
					    ((Class157_Sub1) this)
						.aShortArray9038[i_387_]
						= (short) (((((Class157_Sub1)
							      this)
							     .aShortArray9049
							     [i_387_]) * i_391_
							    + (((Class157_Sub1)
								this)
							       .aShortArray9038
							       [i_387_]) * i_392_
							    + 16383)
							   >> 14);
					    ((Class157_Sub1) this)
						.aShortArray9049[i_387_]
						= (short) i_393_;
					}
					if (i_298_ != 0) {
					    int i_394_
						= (Class417.anIntArray4766
						   [i_298_]);
					    int i_395_
						= (Class417.anIntArray4767
						   [i_298_]);
					    int i_396_
						= ((((((Class157_Sub1) this)
						      .aShortArray9038[i_387_])
						     * i_394_)
						    + (((Class157_Sub1) this)
						       .aShortArray9048
						       [i_387_]) * i_395_
						    + 16383)
						   >> 14);
					    ((Class157_Sub1) this)
						.aShortArray9038[i_387_]
						= (short) (((((Class157_Sub1)
							      this)
							     .aShortArray9038
							     [i_387_]) * i_395_
							    - (((Class157_Sub1)
								this)
							       .aShortArray9048
							       [i_387_]) * i_394_
							    + 16383)
							   >> 14);
					    ((Class157_Sub1) this)
						.aShortArray9048[i_387_]
						= (short) i_396_;
					}
				    }
				}
			    }
			}
		    }
		    method8367();
		}
	    }
	} else if (i == 3) {
	    if (is_301_ != null) {
		int i_397_ = is_301_[9] << 4;
		int i_398_ = is_301_[10] << 4;
		int i_399_ = is_301_[11] << 4;
		int i_400_ = is_301_[12] << 4;
		int i_401_ = is_301_[13] << 4;
		int i_402_ = is_301_[14] << 4;
		if (((Class157_Sub1) this).aBool9106) {
		    int i_403_
			= ((is_301_[0] * ((Class157_Sub1) this).anInt9103
			    + is_301_[3] * ((Class157_Sub1) this).anInt9104
			    + is_301_[6] * ((Class157_Sub1) this).anInt9031
			    + 8192)
			   >> 14);
		    int i_404_
			= ((is_301_[1] * ((Class157_Sub1) this).anInt9103
			    + is_301_[4] * ((Class157_Sub1) this).anInt9104
			    + is_301_[7] * ((Class157_Sub1) this).anInt9031
			    + 8192)
			   >> 14);
		    int i_405_
			= ((is_301_[2] * ((Class157_Sub1) this).anInt9103
			    + is_301_[5] * ((Class157_Sub1) this).anInt9104
			    + is_301_[8] * ((Class157_Sub1) this).anInt9031
			    + 8192)
			   >> 14);
		    i_403_ += i_400_;
		    i_404_ += i_401_;
		    i_405_ += i_402_;
		    ((Class157_Sub1) this).anInt9103 = i_403_;
		    ((Class157_Sub1) this).anInt9104 = i_404_;
		    ((Class157_Sub1) this).anInt9031 = i_405_;
		    ((Class157_Sub1) this).aBool9106 = false;
		}
		int i_406_ = i_297_ << 15 >> 7;
		int i_407_ = i_298_ << 15 >> 7;
		int i_408_ = i_299_ << 15 >> 7;
		int i_409_
		    = i_406_ * -((Class157_Sub1) this).anInt9103 + 8192 >> 14;
		int i_410_
		    = i_407_ * -((Class157_Sub1) this).anInt9104 + 8192 >> 14;
		int i_411_
		    = i_408_ * -((Class157_Sub1) this).anInt9031 + 8192 >> 14;
		int i_412_ = i_409_ + ((Class157_Sub1) this).anInt9103;
		int i_413_ = i_410_ + ((Class157_Sub1) this).anInt9104;
		int i_414_ = i_411_ + ((Class157_Sub1) this).anInt9031;
		int[] is_415_ = new int[9];
		is_415_[0] = i_406_ * is_301_[0] + 8192 >> 14;
		is_415_[1] = i_406_ * is_301_[3] + 8192 >> 14;
		is_415_[2] = i_406_ * is_301_[6] + 8192 >> 14;
		is_415_[3] = i_407_ * is_301_[1] + 8192 >> 14;
		is_415_[4] = i_407_ * is_301_[4] + 8192 >> 14;
		is_415_[5] = i_407_ * is_301_[7] + 8192 >> 14;
		is_415_[6] = i_408_ * is_301_[2] + 8192 >> 14;
		is_415_[7] = i_408_ * is_301_[5] + 8192 >> 14;
		is_415_[8] = i_408_ * is_301_[8] + 8192 >> 14;
		int i_416_ = i_406_ * i_400_ + 8192 >> 14;
		int i_417_ = i_407_ * i_401_ + 8192 >> 14;
		int i_418_ = i_408_ * i_402_ + 8192 >> 14;
		i_416_ += i_412_;
		i_417_ += i_413_;
		i_418_ += i_414_;
		int[] is_419_ = new int[9];
		for (int i_420_ = 0; i_420_ < 3; i_420_++) {
		    for (int i_421_ = 0; i_421_ < 3; i_421_++) {
			int i_422_ = 0;
			for (int i_423_ = 0; i_423_ < 3; i_423_++)
			    i_422_ += (is_301_[i_420_ * 3 + i_423_]
				       * is_415_[i_421_ + i_423_ * 3]);
			is_419_[i_420_ * 3 + i_421_] = i_422_ + 8192 >> 14;
		    }
		}
		int i_424_ = ((is_301_[0] * i_416_ + is_301_[1] * i_417_
			       + is_301_[2] * i_418_ + 8192)
			      >> 14);
		int i_425_ = ((is_301_[3] * i_416_ + is_301_[4] * i_417_
			       + is_301_[5] * i_418_ + 8192)
			      >> 14);
		int i_426_ = ((is_301_[6] * i_416_ + is_301_[7] * i_417_
			       + is_301_[8] * i_418_ + 8192)
			      >> 14);
		i_424_ += i_397_;
		i_425_ += i_398_;
		i_426_ += i_399_;
		for (int i_427_ = 0; i_427_ < i_302_; i_427_++) {
		    int i_428_ = is[i_427_];
		    if (i_428_
			< ((Class157_Sub1) this).anIntArrayArray9033.length) {
			int[] is_429_ = (((Class157_Sub1) this)
					 .anIntArrayArray9033[i_428_]);
			for (int i_430_ = 0; i_430_ < is_429_.length;
			     i_430_++) {
			    int i_431_ = is_429_[i_430_];
			    if (((Class157_Sub1) this).aShortArray9044 == null
				|| ((i_300_ & (((Class157_Sub1) this)
					       .aShortArray9044[i_431_]))
				    != 0)) {
				int i_432_
				    = (is_419_[0] * (((Class157_Sub1) this)
						     .anIntArray9040[i_431_])
				       + is_419_[1] * (((Class157_Sub1) this)
						       .anIntArray9041[i_431_])
				       + is_419_[2] * (((Class157_Sub1) this)
						       .anIntArray9042[i_431_])
				       + 8192) >> 14;
				int i_433_
				    = (is_419_[3] * (((Class157_Sub1) this)
						     .anIntArray9040[i_431_])
				       + is_419_[4] * (((Class157_Sub1) this)
						       .anIntArray9041[i_431_])
				       + is_419_[5] * (((Class157_Sub1) this)
						       .anIntArray9042[i_431_])
				       + 8192) >> 14;
				int i_434_
				    = (is_419_[6] * (((Class157_Sub1) this)
						     .anIntArray9040[i_431_])
				       + is_419_[7] * (((Class157_Sub1) this)
						       .anIntArray9041[i_431_])
				       + is_419_[8] * (((Class157_Sub1) this)
						       .anIntArray9042[i_431_])
				       + 8192) >> 14;
				i_432_ += i_424_;
				i_433_ += i_425_;
				i_434_ += i_426_;
				((Class157_Sub1) this).anIntArray9040[i_431_]
				    = i_432_;
				((Class157_Sub1) this).anIntArray9041[i_431_]
				    = i_433_;
				((Class157_Sub1) this).anIntArray9042[i_431_]
				    = i_434_;
			    }
			}
		    }
		}
	    } else {
		for (int i_435_ = 0; i_435_ < i_302_; i_435_++) {
		    int i_436_ = is[i_435_];
		    if (i_436_
			< ((Class157_Sub1) this).anIntArrayArray9033.length) {
			int[] is_437_ = (((Class157_Sub1) this)
					 .anIntArrayArray9033[i_436_]);
			for (int i_438_ = 0; i_438_ < is_437_.length;
			     i_438_++) {
			    int i_439_ = is_437_[i_438_];
			    if (((Class157_Sub1) this).aShortArray9044 == null
				|| ((i_300_ & (((Class157_Sub1) this)
					       .aShortArray9044[i_439_]))
				    != 0)) {
				((Class157_Sub1) this).anIntArray9040[i_439_]
				    -= ((Class157_Sub1) this).anInt9103;
				((Class157_Sub1) this).anIntArray9041[i_439_]
				    -= ((Class157_Sub1) this).anInt9104;
				((Class157_Sub1) this).anIntArray9042[i_439_]
				    -= ((Class157_Sub1) this).anInt9031;
				((Class157_Sub1) this).anIntArray9040[i_439_]
				    = (((Class157_Sub1) this).anIntArray9040
				       [i_439_]) * i_297_ >> 7;
				((Class157_Sub1) this).anIntArray9041[i_439_]
				    = (((Class157_Sub1) this).anIntArray9041
				       [i_439_]) * i_298_ >> 7;
				((Class157_Sub1) this).anIntArray9042[i_439_]
				    = (((Class157_Sub1) this).anIntArray9042
				       [i_439_]) * i_299_ >> 7;
				((Class157_Sub1) this).anIntArray9040[i_439_]
				    += ((Class157_Sub1) this).anInt9103;
				((Class157_Sub1) this).anIntArray9041[i_439_]
				    += ((Class157_Sub1) this).anInt9104;
				((Class157_Sub1) this).anIntArray9042[i_439_]
				    += ((Class157_Sub1) this).anInt9031;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class157_Sub1) this).anIntArrayArray9063 != null) {
		boolean bool_440_ = false;
		for (int i_441_ = 0; i_441_ < i_302_; i_441_++) {
		    int i_442_ = is[i_441_];
		    if (i_442_
			< ((Class157_Sub1) this).anIntArrayArray9063.length) {
			int[] is_443_ = (((Class157_Sub1) this)
					 .anIntArrayArray9063[i_442_]);
			for (int i_444_ = 0; i_444_ < is_443_.length;
			     i_444_++) {
			    int i_445_ = is_443_[i_444_];
			    if (((Class157_Sub1) this).aShortArray9064 == null
				|| ((i_300_ & (((Class157_Sub1) this)
					       .aShortArray9064[i_445_]))
				    != 0)) {
				int i_446_ = (((((Class157_Sub1) this)
						.aByteArray9058[i_445_])
					       & 0xff)
					      + i_297_ * 8);
				if (i_446_ < 0)
				    i_446_ = 0;
				else if (i_446_ > 255)
				    i_446_ = 255;
				((Class157_Sub1) this).aByteArray9058[i_445_]
				    = (byte) i_446_;
			    }
			}
			bool_440_ = bool_440_ | is_443_.length > 0;
		    }
		}
		if (bool_440_) {
		    if (((Class157_Sub1) this).aClass348Array9078 != null) {
			for (int i_447_ = 0;
			     i_447_ < ((Class157_Sub1) this).anInt9092;
			     i_447_++) {
			    Class348 class348 = (((Class157_Sub1) this)
						 .aClass348Array9078[i_447_]);
			    Class328 class328 = (((Class157_Sub1) this)
						 .aClass328Array9094[i_447_]);
			    ((Class328) class328).anInt3503
				= (((Class328) class328).anInt3503 & 0xffffff
				   | 255 - ((((Class157_Sub1) this)
					     .aByteArray9058
					     [((Class348) class348).anInt3653])
					    & 0xff) << 24);
			}
		    }
		    method8356();
		}
	    }
	} else if (i == 7) {
	    if (((Class157_Sub1) this).anIntArrayArray9063 != null) {
		boolean bool_448_ = false;
		for (int i_449_ = 0; i_449_ < i_302_; i_449_++) {
		    int i_450_ = is[i_449_];
		    if (i_450_
			< ((Class157_Sub1) this).anIntArrayArray9063.length) {
			int[] is_451_ = (((Class157_Sub1) this)
					 .anIntArrayArray9063[i_450_]);
			for (int i_452_ = 0; i_452_ < is_451_.length;
			     i_452_++) {
			    int i_453_ = is_451_[i_452_];
			    if (((Class157_Sub1) this).aShortArray9064 == null
				|| ((i_300_ & (((Class157_Sub1) this)
					       .aShortArray9064[i_453_]))
				    != 0)) {
				int i_454_ = ((((Class157_Sub1) this)
					       .aShortArray9057[i_453_])
					      & 0xffff);
				int i_455_ = i_454_ >> 10 & 0x3f;
				int i_456_ = i_454_ >> 7 & 0x7;
				int i_457_ = i_454_ & 0x7f;
				i_455_ = i_455_ + i_297_ & 0x3f;
				i_456_ += i_298_ / 4;
				if (i_456_ < 0)
				    i_456_ = 0;
				else if (i_456_ > 7)
				    i_456_ = 7;
				i_457_ += i_299_;
				if (i_457_ < 0)
				    i_457_ = 0;
				else if (i_457_ > 127)
				    i_457_ = 127;
				((Class157_Sub1) this).aShortArray9057[i_453_]
				    = (short) (i_455_ << 10 | i_456_ << 7
					       | i_457_);
			    }
			}
			bool_448_ = bool_448_ | is_451_.length > 0;
		    }
		}
		if (bool_448_) {
		    if (((Class157_Sub1) this).aClass348Array9078 != null) {
			for (int i_458_ = 0;
			     i_458_ < ((Class157_Sub1) this).anInt9092;
			     i_458_++) {
			    Class348 class348 = (((Class157_Sub1) this)
						 .aClass348Array9078[i_458_]);
			    Class328 class328 = (((Class157_Sub1) this)
						 .aClass328Array9094[i_458_]);
			    ((Class328) class328).anInt3503
				= (((Class328) class328).anInt3503 & ~0xffffff
				   | (Class649.anIntArray8420
				      [((((Class157_Sub1) this).aShortArray9057
					 [((Class348) class348).anInt3653])
					& 0xffff)]) & 0xffffff);
			}
		    }
		    method8356();
		}
	    }
	} else if (i == 8) {
	    if (((Class157_Sub1) this).anIntArrayArray9095 != null) {
		for (int i_459_ = 0; i_459_ < i_302_; i_459_++) {
		    int i_460_ = is[i_459_];
		    if (i_460_
			< ((Class157_Sub1) this).anIntArrayArray9095.length) {
			int[] is_461_ = (((Class157_Sub1) this)
					 .anIntArrayArray9095[i_460_]);
			for (int i_462_ = 0; i_462_ < is_461_.length;
			     i_462_++) {
			    Class328 class328
				= (((Class157_Sub1) this).aClass328Array9094
				   [is_461_[i_462_]]);
			    ((Class328) class328).anInt3508 += i_297_;
			    ((Class328) class328).anInt3507 += i_298_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class157_Sub1) this).anIntArrayArray9095 != null) {
		for (int i_463_ = 0; i_463_ < i_302_; i_463_++) {
		    int i_464_ = is[i_463_];
		    if (i_464_
			< ((Class157_Sub1) this).anIntArrayArray9095.length) {
			int[] is_465_ = (((Class157_Sub1) this)
					 .anIntArrayArray9095[i_464_]);
			for (int i_466_ = 0; i_466_ < is_465_.length;
			     i_466_++) {
			    Class328 class328
				= (((Class157_Sub1) this).aClass328Array9094
				   [is_465_[i_466_]]);
			    ((Class328) class328).anInt3504
				= (((Class328) class328).anInt3504 * i_297_
				   >> 7);
			    ((Class328) class328).anInt3506
				= (((Class328) class328).anInt3506 * i_298_
				   >> 7);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class157_Sub1) this).anIntArrayArray9095 != null) {
		for (int i_467_ = 0; i_467_ < i_302_; i_467_++) {
		    int i_468_ = is[i_467_];
		    if (i_468_
			< ((Class157_Sub1) this).anIntArrayArray9095.length) {
			int[] is_469_ = (((Class157_Sub1) this)
					 .anIntArrayArray9095[i_468_]);
			for (int i_470_ = 0; i_470_ < is_469_.length;
			     i_470_++) {
			    Class328 class328
				= (((Class157_Sub1) this).aClass328Array9094
				   [is_469_[i_470_]]);
			    ((Class328) class328).anInt3505
				= (((Class328) class328).anInt3505 + i_297_
				   & 0x3fff);
			}
		    }
		}
	    }
	}
    }
    
    void method1894(int i, int i_471_, int i_472_, int i_473_) {
	if (i == 0) {
	    int i_474_ = 0;
	    ((Class157_Sub1) this).anInt9103 = 0;
	    ((Class157_Sub1) this).anInt9104 = 0;
	    ((Class157_Sub1) this).anInt9031 = 0;
	    for (int i_475_ = 0; i_475_ < ((Class157_Sub1) this).anInt9039;
		 i_475_++) {
		((Class157_Sub1) this).anInt9103
		    += ((Class157_Sub1) this).anIntArray9040[i_475_];
		((Class157_Sub1) this).anInt9104
		    += ((Class157_Sub1) this).anIntArray9041[i_475_];
		((Class157_Sub1) this).anInt9031
		    += ((Class157_Sub1) this).anIntArray9042[i_475_];
		i_474_++;
	    }
	    if (i_474_ > 0) {
		((Class157_Sub1) this).anInt9103
		    = ((Class157_Sub1) this).anInt9103 / i_474_ + i_471_;
		((Class157_Sub1) this).anInt9104
		    = ((Class157_Sub1) this).anInt9104 / i_474_ + i_472_;
		((Class157_Sub1) this).anInt9031
		    = ((Class157_Sub1) this).anInt9031 / i_474_ + i_473_;
	    } else {
		((Class157_Sub1) this).anInt9103 = i_471_;
		((Class157_Sub1) this).anInt9104 = i_472_;
		((Class157_Sub1) this).anInt9031 = i_473_;
	    }
	} else if (i == 1) {
	    for (int i_476_ = 0; i_476_ < ((Class157_Sub1) this).anInt9039;
		 i_476_++) {
		((Class157_Sub1) this).anIntArray9040[i_476_] += i_471_;
		((Class157_Sub1) this).anIntArray9041[i_476_] += i_472_;
		((Class157_Sub1) this).anIntArray9042[i_476_] += i_473_;
	    }
	} else if (i == 2) {
	    for (int i_477_ = 0; i_477_ < ((Class157_Sub1) this).anInt9039;
		 i_477_++) {
		((Class157_Sub1) this).anIntArray9040[i_477_]
		    -= ((Class157_Sub1) this).anInt9103;
		((Class157_Sub1) this).anIntArray9041[i_477_]
		    -= ((Class157_Sub1) this).anInt9104;
		((Class157_Sub1) this).anIntArray9042[i_477_]
		    -= ((Class157_Sub1) this).anInt9031;
		if (i_473_ != 0) {
		    int i_478_ = Class417.anIntArray4766[i_473_];
		    int i_479_ = Class417.anIntArray4767[i_473_];
		    int i_480_
			= (((((Class157_Sub1) this).anIntArray9041[i_477_]
			     * i_478_)
			    + (((Class157_Sub1) this).anIntArray9040[i_477_]
			       * i_479_)
			    + 16383)
			   >> 14);
		    ((Class157_Sub1) this).anIntArray9041[i_477_]
			= ((((Class157_Sub1) this).anIntArray9041[i_477_]
			    * i_479_)
			   - (((Class157_Sub1) this).anIntArray9040[i_477_]
			      * i_478_)
			   + 16383) >> 14;
		    ((Class157_Sub1) this).anIntArray9040[i_477_] = i_480_;
		}
		if (i_471_ != 0) {
		    int i_481_ = Class417.anIntArray4766[i_471_];
		    int i_482_ = Class417.anIntArray4767[i_471_];
		    int i_483_
			= (((((Class157_Sub1) this).anIntArray9041[i_477_]
			     * i_482_)
			    - (((Class157_Sub1) this).anIntArray9042[i_477_]
			       * i_481_)
			    + 16383)
			   >> 14);
		    ((Class157_Sub1) this).anIntArray9042[i_477_]
			= ((((Class157_Sub1) this).anIntArray9041[i_477_]
			    * i_481_)
			   + (((Class157_Sub1) this).anIntArray9042[i_477_]
			      * i_482_)
			   + 16383) >> 14;
		    ((Class157_Sub1) this).anIntArray9041[i_477_] = i_483_;
		}
		if (i_472_ != 0) {
		    int i_484_ = Class417.anIntArray4766[i_472_];
		    int i_485_ = Class417.anIntArray4767[i_472_];
		    int i_486_
			= (((((Class157_Sub1) this).anIntArray9042[i_477_]
			     * i_484_)
			    + (((Class157_Sub1) this).anIntArray9040[i_477_]
			       * i_485_)
			    + 16383)
			   >> 14);
		    ((Class157_Sub1) this).anIntArray9042[i_477_]
			= ((((Class157_Sub1) this).anIntArray9042[i_477_]
			    * i_485_)
			   - (((Class157_Sub1) this).anIntArray9040[i_477_]
			      * i_484_)
			   + 16383) >> 14;
		    ((Class157_Sub1) this).anIntArray9040[i_477_] = i_486_;
		}
		((Class157_Sub1) this).anIntArray9040[i_477_]
		    += ((Class157_Sub1) this).anInt9103;
		((Class157_Sub1) this).anIntArray9041[i_477_]
		    += ((Class157_Sub1) this).anInt9104;
		((Class157_Sub1) this).anIntArray9042[i_477_]
		    += ((Class157_Sub1) this).anInt9031;
	    }
	} else if (i == 3) {
	    for (int i_487_ = 0; i_487_ < ((Class157_Sub1) this).anInt9039;
		 i_487_++) {
		((Class157_Sub1) this).anIntArray9040[i_487_]
		    -= ((Class157_Sub1) this).anInt9103;
		((Class157_Sub1) this).anIntArray9041[i_487_]
		    -= ((Class157_Sub1) this).anInt9104;
		((Class157_Sub1) this).anIntArray9042[i_487_]
		    -= ((Class157_Sub1) this).anInt9031;
		((Class157_Sub1) this).anIntArray9040[i_487_]
		    = (((Class157_Sub1) this).anIntArray9040[i_487_] * i_471_
		       / 128);
		((Class157_Sub1) this).anIntArray9041[i_487_]
		    = (((Class157_Sub1) this).anIntArray9041[i_487_] * i_472_
		       / 128);
		((Class157_Sub1) this).anIntArray9042[i_487_]
		    = (((Class157_Sub1) this).anIntArray9042[i_487_] * i_473_
		       / 128);
		((Class157_Sub1) this).anIntArray9040[i_487_]
		    += ((Class157_Sub1) this).anInt9103;
		((Class157_Sub1) this).anIntArray9041[i_487_]
		    += ((Class157_Sub1) this).anInt9104;
		((Class157_Sub1) this).anIntArray9042[i_487_]
		    += ((Class157_Sub1) this).anInt9031;
	    }
	} else if (i == 5) {
	    for (int i_488_ = 0; i_488_ < ((Class157_Sub1) this).anInt9055;
		 i_488_++) {
		int i_489_
		    = ((((Class157_Sub1) this).aByteArray9058[i_488_] & 0xff)
		       + i_471_ * 8);
		if (i_489_ < 0)
		    i_489_ = 0;
		else if (i_489_ > 255)
		    i_489_ = 255;
		((Class157_Sub1) this).aByteArray9058[i_488_] = (byte) i_489_;
	    }
	    if (((Class157_Sub1) this).aClass348Array9078 != null) {
		for (int i_490_ = 0; i_490_ < ((Class157_Sub1) this).anInt9092;
		     i_490_++) {
		    Class348 class348
			= ((Class157_Sub1) this).aClass348Array9078[i_490_];
		    Class328 class328
			= ((Class157_Sub1) this).aClass328Array9094[i_490_];
		    ((Class328) class328).anInt3503
			= (((Class328) class328).anInt3503 & 0xffffff
			   | 255 - ((((Class157_Sub1) this).aByteArray9058
				     [((Class348) class348).anInt3653])
				    & 0xff) << 24);
		}
	    }
	    method8356();
	} else if (i == 7) {
	    for (int i_491_ = 0; i_491_ < ((Class157_Sub1) this).anInt9055;
		 i_491_++) {
		int i_492_
		    = ((Class157_Sub1) this).aShortArray9057[i_491_] & 0xffff;
		int i_493_ = i_492_ >> 10 & 0x3f;
		int i_494_ = i_492_ >> 7 & 0x7;
		int i_495_ = i_492_ & 0x7f;
		i_493_ = i_493_ + i_471_ & 0x3f;
		i_494_ += i_472_ / 4;
		if (i_494_ < 0)
		    i_494_ = 0;
		else if (i_494_ > 7)
		    i_494_ = 7;
		i_495_ += i_473_;
		if (i_495_ < 0)
		    i_495_ = 0;
		else if (i_495_ > 127)
		    i_495_ = 127;
		((Class157_Sub1) this).aShortArray9057[i_491_]
		    = (short) (i_493_ << 10 | i_494_ << 7 | i_495_);
	    }
	    if (((Class157_Sub1) this).aClass348Array9078 != null) {
		for (int i_496_ = 0; i_496_ < ((Class157_Sub1) this).anInt9092;
		     i_496_++) {
		    Class348 class348
			= ((Class157_Sub1) this).aClass348Array9078[i_496_];
		    Class328 class328
			= ((Class157_Sub1) this).aClass328Array9094[i_496_];
		    ((Class328) class328).anInt3503
			= (((Class328) class328).anInt3503 & ~0xffffff
			   | ((Class649.anIntArray8420
			       [(((Class157_Sub1) this).aShortArray9057
				 [((Class348) class348).anInt3653]) & 0xffff])
			      & 0xffffff));
		}
	    }
	    method8356();
	} else if (i == 8) {
	    for (int i_497_ = 0; i_497_ < ((Class157_Sub1) this).anInt9092;
		 i_497_++) {
		Class328 class328
		    = ((Class157_Sub1) this).aClass328Array9094[i_497_];
		((Class328) class328).anInt3508 += i_471_;
		((Class328) class328).anInt3507 += i_472_;
	    }
	} else if (i == 10) {
	    for (int i_498_ = 0; i_498_ < ((Class157_Sub1) this).anInt9092;
		 i_498_++) {
		Class328 class328
		    = ((Class157_Sub1) this).aClass328Array9094[i_498_];
		((Class328) class328).anInt3504
		    = ((Class328) class328).anInt3504 * i_471_ >> 7;
		((Class328) class328).anInt3506
		    = ((Class328) class328).anInt3506 * i_472_ >> 7;
	    }
	} else if (i == 9) {
	    for (int i_499_ = 0; i_499_ < ((Class157_Sub1) this).anInt9092;
		 i_499_++) {
		Class328 class328
		    = ((Class157_Sub1) this).aClass328Array9094[i_499_];
		((Class328) class328).anInt3505
		    = ((Class328) class328).anInt3505 + i_471_ & 0x3fff;
	    }
	}
    }
    
    public void method1965(Class433 class433, Class159 class159, int i) {
	if (aClass346_9107 != null)
	    aClass346_9107.method4535();
	if (class159 != null)
	    class159.aBool1751 = false;
	if (((Class157_Sub1) this).anInt9077 != 0) {
	    Class418 class418
		= (((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
		   .aClass418_9253);
	    Class418 class418_500_
		= ((Class157_Sub1) this).aClass173_Sub1_9068.aClass418_9243;
	    Class418 class418_501_
		= (((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
		   .aClass418_9244);
	    class418_500_.method5035(class433);
	    class418_501_.method4986(class418_500_);
	    class418_501_.method4974(((Class173_Sub1) (((Class157_Sub1) this)
						       .aClass173_Sub1_9068))
				     .aClass418_9257);
	    if (!((Class157_Sub1) this).aBool9046)
		method8358();
	    float[] fs
		= (((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
		   .aFloatArray9311);
	    class418_500_.method5030(0.0F,
				     (float) ((Class157_Sub1) this).anInt9093,
				     0.0F, fs);
	    float f = fs[0];
	    float f_502_ = fs[1];
	    float f_503_ = fs[2];
	    class418_500_.method5030(0.0F,
				     (float) ((Class157_Sub1) this).anInt9066,
				     0.0F, fs);
	    float f_504_ = fs[0];
	    float f_505_ = fs[1];
	    float f_506_ = fs[2];
	    for (int i_507_ = 0; i_507_ < 6; i_507_++) {
		float[] fs_508_ = (((Class173_Sub1)
				    ((Class157_Sub1) this).aClass173_Sub1_9068)
				   .aFloatArrayArray9259[i_507_]);
		float f_509_ = (fs_508_[0] * f + fs_508_[1] * f_502_
				+ fs_508_[2] * f_503_ + fs_508_[3]
				+ (float) ((Class157_Sub1) this).anInt9060);
		float f_510_ = (fs_508_[0] * f_504_ + fs_508_[1] * f_505_
				+ fs_508_[2] * f_506_ + fs_508_[3]
				+ (float) ((Class157_Sub1) this).anInt9060);
		if (f_509_ < 0.0F && f_510_ < 0.0F)
		    return;
	    }
	    if (class159 != null) {
		boolean bool = false;
		boolean bool_511_ = true;
		int i_512_ = ((((Class157_Sub1) this).anInt9079
			       + ((Class157_Sub1) this).anInt9080)
			      >> 1);
		int i_513_ = ((((Class157_Sub1) this).anInt9081
			       + ((Class157_Sub1) this).anInt9082)
			      >> 1);
		int i_514_ = i_512_;
		int i_515_ = ((Class157_Sub1) this).anInt9093;
		int i_516_ = i_513_;
		float f_517_
		    = (class418_501_.aFloatArray4768[0] * (float) i_514_
		       + class418_501_.aFloatArray4768[4] * (float) i_515_
		       + class418_501_.aFloatArray4768[8] * (float) i_516_
		       + class418_501_.aFloatArray4768[12]);
		float f_518_
		    = (class418_501_.aFloatArray4768[1] * (float) i_514_
		       + class418_501_.aFloatArray4768[5] * (float) i_515_
		       + class418_501_.aFloatArray4768[9] * (float) i_516_
		       + class418_501_.aFloatArray4768[13]);
		float f_519_
		    = (class418_501_.aFloatArray4768[2] * (float) i_514_
		       + class418_501_.aFloatArray4768[6] * (float) i_515_
		       + class418_501_.aFloatArray4768[10] * (float) i_516_
		       + class418_501_.aFloatArray4768[14]);
		float f_520_
		    = (class418_501_.aFloatArray4768[3] * (float) i_514_
		       + class418_501_.aFloatArray4768[7] * (float) i_515_
		       + class418_501_.aFloatArray4768[11] * (float) i_516_
		       + class418_501_.aFloatArray4768[15]);
		if (f_519_ >= -f_520_) {
		    class159.anInt1748
			= (int) ((((Class173_Sub1)
				   ((Class157_Sub1) this).aClass173_Sub1_9068)
				  .aFloat9260)
				 + (((Class173_Sub1) (((Class157_Sub1) this)
						      .aClass173_Sub1_9068))
				    .aFloat9261) * f_517_ / f_520_);
		    class159.anInt1750
			= (int) ((((Class173_Sub1)
				   ((Class157_Sub1) this).aClass173_Sub1_9068)
				  .aFloat9262)
				 + (((Class173_Sub1) (((Class157_Sub1) this)
						      .aClass173_Sub1_9068))
				    .aFloat9263) * f_518_ / f_520_);
		} else
		    bool = true;
		i_514_ = i_512_;
		i_515_ = ((Class157_Sub1) this).anInt9066;
		i_516_ = i_513_;
		float f_521_
		    = (class418_501_.aFloatArray4768[0] * (float) i_514_
		       + class418_501_.aFloatArray4768[4] * (float) i_515_
		       + class418_501_.aFloatArray4768[8] * (float) i_516_
		       + class418_501_.aFloatArray4768[12]);
		float f_522_
		    = (class418_501_.aFloatArray4768[1] * (float) i_514_
		       + class418_501_.aFloatArray4768[5] * (float) i_515_
		       + class418_501_.aFloatArray4768[9] * (float) i_516_
		       + class418_501_.aFloatArray4768[13]);
		float f_523_
		    = (class418_501_.aFloatArray4768[2] * (float) i_514_
		       + class418_501_.aFloatArray4768[6] * (float) i_515_
		       + class418_501_.aFloatArray4768[10] * (float) i_516_
		       + class418_501_.aFloatArray4768[14]);
		float f_524_
		    = (class418_501_.aFloatArray4768[3] * (float) i_514_
		       + class418_501_.aFloatArray4768[7] * (float) i_515_
		       + class418_501_.aFloatArray4768[11] * (float) i_516_
		       + class418_501_.aFloatArray4768[15]);
		if (f_523_ >= -f_524_) {
		    class159.anInt1749
			= (int) ((((Class173_Sub1)
				   ((Class157_Sub1) this).aClass173_Sub1_9068)
				  .aFloat9260)
				 + (((Class173_Sub1) (((Class157_Sub1) this)
						      .aClass173_Sub1_9068))
				    .aFloat9261) * f_521_ / f_524_);
		    class159.anInt1752
			= (int) ((((Class173_Sub1)
				   ((Class157_Sub1) this).aClass173_Sub1_9068)
				  .aFloat9262)
				 + (((Class173_Sub1) (((Class157_Sub1) this)
						      .aClass173_Sub1_9068))
				    .aFloat9263) * f_522_ / f_524_);
		} else
		    bool = true;
		if (bool) {
		    if (f_519_ < -f_520_ && f_523_ < -f_524_)
			bool_511_ = false;
		    else if (f_519_ < -f_520_) {
			float f_525_
			    = (f_519_ + f_520_) / (f_523_ + f_524_) - 1.0F;
			float f_526_ = f_517_ + f_525_ * (f_521_ - f_517_);
			float f_527_ = f_518_ + f_525_ * (f_522_ - f_518_);
			float f_528_ = f_520_ + f_525_ * (f_524_ - f_520_);
			class159.anInt1748
			    = (int) ((((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aFloat9260)
				     + (((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068)).aFloat9261
					* f_526_ / f_528_));
			class159.anInt1750
			    = (int) ((((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aFloat9262)
				     + (((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068)).aFloat9263
					* f_527_ / f_528_));
		    } else if (f_523_ < -f_524_) {
			float f_529_
			    = (f_523_ + f_524_) / (f_519_ + f_520_) - 1.0F;
			float f_530_ = f_521_ + f_529_ * (f_517_ - f_521_);
			float f_531_ = f_522_ + f_529_ * (f_518_ - f_522_);
			float f_532_ = f_524_ + f_529_ * (f_520_ - f_524_);
			class159.anInt1749
			    = (int) ((((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aFloat9260)
				     + (((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068)).aFloat9261
					* f_530_ / f_532_));
			class159.anInt1752
			    = (int) ((((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aFloat9262)
				     + (((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068)).aFloat9263
					* f_531_ / f_532_));
		    }
		}
		if (bool_511_) {
		    if (f_519_ / f_520_ > f_523_ / f_524_) {
			float f_533_
			    = (f_517_
			       + (class418.aFloatArray4768[0]
				  * (float) ((Class157_Sub1) this).anInt9060)
			       + class418.aFloatArray4768[12]);
			float f_534_
			    = (f_520_
			       + (class418.aFloatArray4768[3]
				  * (float) ((Class157_Sub1) this).anInt9060)
			       + class418.aFloatArray4768[15]);
			class159.anInt1753
			    = (int) ((((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aFloat9260)
				     - (float) class159.anInt1748
				     + (((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068)).aFloat9261
					* f_533_ / f_534_));
		    } else {
			float f_535_
			    = (f_521_
			       + (class418.aFloatArray4768[0]
				  * (float) ((Class157_Sub1) this).anInt9060)
			       + class418.aFloatArray4768[12]);
			float f_536_
			    = (f_524_
			       + (class418.aFloatArray4768[3]
				  * (float) ((Class157_Sub1) this).anInt9060)
			       + class418.aFloatArray4768[15]);
			class159.anInt1753
			    = (int) ((((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aFloat9260)
				     - (float) class159.anInt1749
				     + (((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068)).aFloat9261
					* f_535_ / f_536_));
		    }
		    class159.aBool1751 = true;
		}
	    }
	    ((Class157_Sub1) this).aClass173_Sub1_9068.method8565(i);
	    method8361(class433);
	    ((Class157_Sub1) this).aClass173_Sub1_9068.method8565(0);
	    class418_500_.method5035(class433);
	    class418_500_.method4974(((Class157_Sub1) this).aClass173_Sub1_9068
				     .aClass418_9381);
	    method8362(class418_500_);
	}
    }
    
    void method1895() {
	for (int i = 0; i < ((Class157_Sub1) this).anInt9088; i++) {
	    ((Class157_Sub1) this).anIntArray9040[i]
		= ((Class157_Sub1) this).anIntArray9040[i] + 7 >> 4;
	    ((Class157_Sub1) this).anIntArray9041[i]
		= ((Class157_Sub1) this).anIntArray9041[i] + 7 >> 4;
	    ((Class157_Sub1) this).anIntArray9042[i]
		= ((Class157_Sub1) this).anIntArray9042[i] + 7 >> 4;
	}
	method8385();
	((Class157_Sub1) this).aBool9046 = false;
    }
    
    public void method2005(Class433 class433, int i, boolean bool) {
	if (((Class157_Sub1) this).aShortArray9044 != null) {
	    Class433 class433_537_ = class433;
	    if (bool) {
		class433_537_
		    = ((Class173_Sub1) (((Class157_Sub1) this)
					.aClass173_Sub1_9068)).aClass433_9242;
		class433_537_.method5244(class433);
	    }
	    float[] fs = new float[3];
	    for (int i_538_ = 0; i_538_ < ((Class157_Sub1) this).anInt9039;
		 i_538_++) {
		if ((i & ((Class157_Sub1) this).aShortArray9044[i_538_])
		    != 0) {
		    class433_537_.method5233
			((float) ((Class157_Sub1) this).anIntArray9040[i_538_],
			 (float) ((Class157_Sub1) this).anIntArray9041[i_538_],
			 (float) ((Class157_Sub1) this).anIntArray9042[i_538_],
			 fs);
		    ((Class157_Sub1) this).anIntArray9040[i_538_]
			= (int) fs[0];
		    ((Class157_Sub1) this).anIntArray9041[i_538_]
			= (int) fs[1];
		    ((Class157_Sub1) this).anIntArray9042[i_538_]
			= (int) fs[2];
		}
	    }
	}
    }
    
    public Class144[] method1923() {
	return ((Class157_Sub1) this).aClass144Array9075;
    }
    
    public Class170[] method1922() {
	return ((Class157_Sub1) this).aClass170Array9090;
    }
    
    void method8359(Class528_Sub21_Sub12_Sub1 class528_sub21_sub12_sub1) {
	if (((Class157_Sub1) this).anIntArray9098.length
	    < ((Class157_Sub1) this).anInt9077) {
	    ((Class157_Sub1) this).anIntArray9098
		= new int[((Class157_Sub1) this).anInt9077];
	    ((Class157_Sub1) this).anIntArray9067
		= new int[((Class157_Sub1) this).anInt9077];
	}
	for (int i = 0; i < ((Class157_Sub1) this).anInt9039; i++) {
	    int i_539_
		= (((((Class157_Sub1) this).anIntArray9040[i]
		     - ((((Class157_Sub1) this).anIntArray9041[i]
			 * ((Class173_Sub1) (((Class157_Sub1) this)
					     .aClass173_Sub1_9068)).anInt9306)
			>> 8))
		    >> ((Class173_Sub1)
			((Class157_Sub1) this).aClass173_Sub1_9068).anInt9305)
		   - (((Class528_Sub21_Sub12_Sub1) class528_sub21_sub12_sub1)
		      .anInt11982));
	    int i_540_
		= (((((Class157_Sub1) this).anIntArray9042[i]
		     - ((((Class157_Sub1) this).anIntArray9041[i]
			 * ((Class173_Sub1) (((Class157_Sub1) this)
					     .aClass173_Sub1_9068)).anInt9307)
			>> 8))
		    >> ((Class173_Sub1)
			((Class157_Sub1) this).aClass173_Sub1_9068).anInt9305)
		   - (((Class528_Sub21_Sub12_Sub1) class528_sub21_sub12_sub1)
		      .anInt11985));
	    int i_541_ = ((Class157_Sub1) this).anIntArray9100[i];
	    int i_542_ = ((Class157_Sub1) this).anIntArray9100[i + 1];
	    for (int i_543_ = i_541_;
		 (i_543_ < i_542_
		  && ((Class157_Sub1) this).aShortArray9089[i_543_] != 0);
		 i_543_++) {
		int i_544_ = ((((Class157_Sub1) this).aShortArray9089[i_543_]
			       & 0xffff)
			      - 1);
		((Class157_Sub1) this).anIntArray9098[i_544_] = i_539_;
		((Class157_Sub1) this).anIntArray9067[i_544_] = i_540_;
	    }
	}
	for (int i = 0; i < ((Class157_Sub1) this).anInt9056; i++) {
	    if (((Class157_Sub1) this).aByteArray9058 == null
		|| ((Class157_Sub1) this).aByteArray9058[i] <= 128) {
		int i_545_
		    = ((Class157_Sub1) this).aShortArray9059[i] & 0xffff;
		int i_546_
		    = ((Class157_Sub1) this).aShortArray9105[i] & 0xffff;
		int i_547_
		    = ((Class157_Sub1) this).aShortArray9091[i] & 0xffff;
		int i_548_ = ((Class157_Sub1) this).anIntArray9098[i_545_];
		int i_549_ = ((Class157_Sub1) this).anIntArray9098[i_546_];
		int i_550_ = ((Class157_Sub1) this).anIntArray9098[i_547_];
		int i_551_ = ((Class157_Sub1) this).anIntArray9067[i_545_];
		int i_552_ = ((Class157_Sub1) this).anIntArray9067[i_546_];
		int i_553_ = ((Class157_Sub1) this).anIntArray9067[i_547_];
		if (((i_548_ - i_549_) * (i_552_ - i_553_)
		     - (i_552_ - i_551_) * (i_550_ - i_549_))
		    > 0)
		    class528_sub21_sub12_sub1.method10825(i_551_, i_552_,
							  i_553_, i_548_,
							  i_549_, i_550_);
	    }
	}
    }
    
    public boolean method2000(int i, int i_554_, Class433 class433,
			      boolean bool, int i_555_) {
	return method8372(i, i_554_, 0, 0, class433, bool, i_555_);
    }
    
    public void method1870(int i) {
	int i_556_ = Class417.anIntArray4766[i];
	int i_557_ = Class417.anIntArray4767[i];
	for (int i_558_ = 0; i_558_ < ((Class157_Sub1) this).anInt9039;
	     i_558_++) {
	    int i_559_
		= ((((Class157_Sub1) this).anIntArray9041[i_558_] * i_557_
		    - ((Class157_Sub1) this).anIntArray9042[i_558_] * i_556_)
		   >> 14);
	    ((Class157_Sub1) this).anIntArray9042[i_558_]
		= ((((Class157_Sub1) this).anIntArray9041[i_558_] * i_556_
		    + ((Class157_Sub1) this).anIntArray9042[i_558_] * i_557_)
		   >> 14);
	    ((Class157_Sub1) this).anIntArray9041[i_558_] = i_559_;
	}
	method8385();
	((Class157_Sub1) this).aBool9046 = false;
    }
    
    boolean method8360(int i, int i_560_, int i_561_, int i_562_, int i_563_,
		       int i_564_, int i_565_, int i_566_, int i_567_,
		       int i_568_) {
	if (i_562_ < i_563_ && i_562_ < i_564_ && i_562_ < i_565_)
	    return false;
	if (i_560_ > i_563_ && i_560_ > i_564_ && i_560_ > i_565_)
	    return false;
	if (i_561_ < i_566_ && i_561_ < i_567_ && i_561_ < i_568_)
	    return false;
	if (i > i_566_ && i > i_567_ && i > i_568_)
	    return false;
	return true;
    }
    
    public Class528_Sub21_Sub12 method1899
	(Class528_Sub21_Sub12 class528_sub21_sub12) {
	if (((Class157_Sub1) this).anInt9077 == 0)
	    return null;
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	int i;
	int i_569_;
	if ((((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
	     .anInt9306)
	    > 0) {
	    i = ((((Class157_Sub1) this).anInt9079
		  - ((((Class157_Sub1) this).anInt9066
		      * ((Class173_Sub1)
			 ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9306)
		     >> 8))
		 >> ((Class173_Sub1)
		     ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9305);
	    i_569_
		= ((((Class157_Sub1) this).anInt9080
		    - ((((Class157_Sub1) this).anInt9093
			* ((Class173_Sub1) (((Class157_Sub1) this)
					    .aClass173_Sub1_9068)).anInt9306)
		       >> 8))
		   >> ((Class173_Sub1)
		       ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9305);
	} else {
	    i = ((((Class157_Sub1) this).anInt9079
		  - ((((Class157_Sub1) this).anInt9093
		      * ((Class173_Sub1)
			 ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9306)
		     >> 8))
		 >> ((Class173_Sub1)
		     ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9305);
	    i_569_
		= ((((Class157_Sub1) this).anInt9080
		    - ((((Class157_Sub1) this).anInt9066
			* ((Class173_Sub1) (((Class157_Sub1) this)
					    .aClass173_Sub1_9068)).anInt9306)
		       >> 8))
		   >> ((Class173_Sub1)
		       ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9305);
	}
	int i_570_;
	int i_571_;
	if ((((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
	     .anInt9307)
	    > 0) {
	    i_570_
		= ((((Class157_Sub1) this).anInt9081
		    - ((((Class157_Sub1) this).anInt9066
			* ((Class173_Sub1) (((Class157_Sub1) this)
					    .aClass173_Sub1_9068)).anInt9307)
		       >> 8))
		   >> ((Class173_Sub1)
		       ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9305);
	    i_571_
		= ((((Class157_Sub1) this).anInt9082
		    - ((((Class157_Sub1) this).anInt9093
			* ((Class173_Sub1) (((Class157_Sub1) this)
					    .aClass173_Sub1_9068)).anInt9307)
		       >> 8))
		   >> ((Class173_Sub1)
		       ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9305);
	} else {
	    i_570_
		= ((((Class157_Sub1) this).anInt9081
		    - ((((Class157_Sub1) this).anInt9093
			* ((Class173_Sub1) (((Class157_Sub1) this)
					    .aClass173_Sub1_9068)).anInt9307)
		       >> 8))
		   >> ((Class173_Sub1)
		       ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9305);
	    i_571_
		= ((((Class157_Sub1) this).anInt9082
		    - ((((Class157_Sub1) this).anInt9066
			* ((Class173_Sub1) (((Class157_Sub1) this)
					    .aClass173_Sub1_9068)).anInt9307)
		       >> 8))
		   >> ((Class173_Sub1)
		       ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9305);
	}
	int i_572_ = i_569_ - i + 1;
	int i_573_ = i_571_ - i_570_ + 1;
	Class528_Sub21_Sub12_Sub1 class528_sub21_sub12_sub1
	    = (Class528_Sub21_Sub12_Sub1) class528_sub21_sub12;
	Class528_Sub21_Sub12_Sub1 class528_sub21_sub12_sub1_574_;
	if (class528_sub21_sub12_sub1 != null
	    && class528_sub21_sub12_sub1.method10823(i_572_, i_573_)) {
	    class528_sub21_sub12_sub1_574_ = class528_sub21_sub12_sub1;
	    class528_sub21_sub12_sub1_574_.method10824();
	} else
	    class528_sub21_sub12_sub1_574_
		= new Class528_Sub21_Sub12_Sub1((((Class157_Sub1) this)
						 .aClass173_Sub1_9068),
						i_572_, i_573_);
	class528_sub21_sub12_sub1_574_.method10829(i, i_570_, i_569_, i_571_);
	method8359(class528_sub21_sub12_sub1_574_);
	return class528_sub21_sub12_sub1_574_;
    }
    
    void method1958() {
	for (int i = 0; i < ((Class157_Sub1) this).anInt9088; i++) {
	    ((Class157_Sub1) this).anIntArray9040[i]
		= ((Class157_Sub1) this).anIntArray9040[i] + 7 >> 4;
	    ((Class157_Sub1) this).anIntArray9041[i]
		= ((Class157_Sub1) this).anIntArray9041[i] + 7 >> 4;
	    ((Class157_Sub1) this).anIntArray9042[i]
		= ((Class157_Sub1) this).anIntArray9042[i] + 7 >> 4;
	}
	method8385();
	((Class157_Sub1) this).aBool9046 = false;
    }
    
    public void method1897(Class433 class433, Class159 class159, int i) {
	if (aClass346_9107 != null)
	    aClass346_9107.method4535();
	if (class159 != null)
	    class159.aBool1751 = false;
	if (((Class157_Sub1) this).anInt9077 != 0) {
	    Class418 class418
		= (((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
		   .aClass418_9253);
	    Class418 class418_575_
		= ((Class157_Sub1) this).aClass173_Sub1_9068.aClass418_9243;
	    Class418 class418_576_
		= (((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
		   .aClass418_9244);
	    class418_575_.method5035(class433);
	    class418_576_.method4986(class418_575_);
	    class418_576_.method4974(((Class173_Sub1) (((Class157_Sub1) this)
						       .aClass173_Sub1_9068))
				     .aClass418_9257);
	    if (!((Class157_Sub1) this).aBool9046)
		method8358();
	    float[] fs
		= (((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
		   .aFloatArray9311);
	    class418_575_.method5030(0.0F,
				     (float) ((Class157_Sub1) this).anInt9093,
				     0.0F, fs);
	    float f = fs[0];
	    float f_577_ = fs[1];
	    float f_578_ = fs[2];
	    class418_575_.method5030(0.0F,
				     (float) ((Class157_Sub1) this).anInt9066,
				     0.0F, fs);
	    float f_579_ = fs[0];
	    float f_580_ = fs[1];
	    float f_581_ = fs[2];
	    for (int i_582_ = 0; i_582_ < 6; i_582_++) {
		float[] fs_583_ = (((Class173_Sub1)
				    ((Class157_Sub1) this).aClass173_Sub1_9068)
				   .aFloatArrayArray9259[i_582_]);
		float f_584_ = (fs_583_[0] * f + fs_583_[1] * f_577_
				+ fs_583_[2] * f_578_ + fs_583_[3]
				+ (float) ((Class157_Sub1) this).anInt9060);
		float f_585_ = (fs_583_[0] * f_579_ + fs_583_[1] * f_580_
				+ fs_583_[2] * f_581_ + fs_583_[3]
				+ (float) ((Class157_Sub1) this).anInt9060);
		if (f_584_ < 0.0F && f_585_ < 0.0F)
		    return;
	    }
	    if (class159 != null) {
		boolean bool = false;
		boolean bool_586_ = true;
		int i_587_ = ((((Class157_Sub1) this).anInt9079
			       + ((Class157_Sub1) this).anInt9080)
			      >> 1);
		int i_588_ = ((((Class157_Sub1) this).anInt9081
			       + ((Class157_Sub1) this).anInt9082)
			      >> 1);
		int i_589_ = i_587_;
		int i_590_ = ((Class157_Sub1) this).anInt9093;
		int i_591_ = i_588_;
		float f_592_
		    = (class418_576_.aFloatArray4768[0] * (float) i_589_
		       + class418_576_.aFloatArray4768[4] * (float) i_590_
		       + class418_576_.aFloatArray4768[8] * (float) i_591_
		       + class418_576_.aFloatArray4768[12]);
		float f_593_
		    = (class418_576_.aFloatArray4768[1] * (float) i_589_
		       + class418_576_.aFloatArray4768[5] * (float) i_590_
		       + class418_576_.aFloatArray4768[9] * (float) i_591_
		       + class418_576_.aFloatArray4768[13]);
		float f_594_
		    = (class418_576_.aFloatArray4768[2] * (float) i_589_
		       + class418_576_.aFloatArray4768[6] * (float) i_590_
		       + class418_576_.aFloatArray4768[10] * (float) i_591_
		       + class418_576_.aFloatArray4768[14]);
		float f_595_
		    = (class418_576_.aFloatArray4768[3] * (float) i_589_
		       + class418_576_.aFloatArray4768[7] * (float) i_590_
		       + class418_576_.aFloatArray4768[11] * (float) i_591_
		       + class418_576_.aFloatArray4768[15]);
		if (f_594_ >= -f_595_) {
		    class159.anInt1748
			= (int) ((((Class173_Sub1)
				   ((Class157_Sub1) this).aClass173_Sub1_9068)
				  .aFloat9260)
				 + (((Class173_Sub1) (((Class157_Sub1) this)
						      .aClass173_Sub1_9068))
				    .aFloat9261) * f_592_ / f_595_);
		    class159.anInt1750
			= (int) ((((Class173_Sub1)
				   ((Class157_Sub1) this).aClass173_Sub1_9068)
				  .aFloat9262)
				 + (((Class173_Sub1) (((Class157_Sub1) this)
						      .aClass173_Sub1_9068))
				    .aFloat9263) * f_593_ / f_595_);
		} else
		    bool = true;
		i_589_ = i_587_;
		i_590_ = ((Class157_Sub1) this).anInt9066;
		i_591_ = i_588_;
		float f_596_
		    = (class418_576_.aFloatArray4768[0] * (float) i_589_
		       + class418_576_.aFloatArray4768[4] * (float) i_590_
		       + class418_576_.aFloatArray4768[8] * (float) i_591_
		       + class418_576_.aFloatArray4768[12]);
		float f_597_
		    = (class418_576_.aFloatArray4768[1] * (float) i_589_
		       + class418_576_.aFloatArray4768[5] * (float) i_590_
		       + class418_576_.aFloatArray4768[9] * (float) i_591_
		       + class418_576_.aFloatArray4768[13]);
		float f_598_
		    = (class418_576_.aFloatArray4768[2] * (float) i_589_
		       + class418_576_.aFloatArray4768[6] * (float) i_590_
		       + class418_576_.aFloatArray4768[10] * (float) i_591_
		       + class418_576_.aFloatArray4768[14]);
		float f_599_
		    = (class418_576_.aFloatArray4768[3] * (float) i_589_
		       + class418_576_.aFloatArray4768[7] * (float) i_590_
		       + class418_576_.aFloatArray4768[11] * (float) i_591_
		       + class418_576_.aFloatArray4768[15]);
		if (f_598_ >= -f_599_) {
		    class159.anInt1749
			= (int) ((((Class173_Sub1)
				   ((Class157_Sub1) this).aClass173_Sub1_9068)
				  .aFloat9260)
				 + (((Class173_Sub1) (((Class157_Sub1) this)
						      .aClass173_Sub1_9068))
				    .aFloat9261) * f_596_ / f_599_);
		    class159.anInt1752
			= (int) ((((Class173_Sub1)
				   ((Class157_Sub1) this).aClass173_Sub1_9068)
				  .aFloat9262)
				 + (((Class173_Sub1) (((Class157_Sub1) this)
						      .aClass173_Sub1_9068))
				    .aFloat9263) * f_597_ / f_599_);
		} else
		    bool = true;
		if (bool) {
		    if (f_594_ < -f_595_ && f_598_ < -f_599_)
			bool_586_ = false;
		    else if (f_594_ < -f_595_) {
			float f_600_
			    = (f_594_ + f_595_) / (f_598_ + f_599_) - 1.0F;
			float f_601_ = f_592_ + f_600_ * (f_596_ - f_592_);
			float f_602_ = f_593_ + f_600_ * (f_597_ - f_593_);
			float f_603_ = f_595_ + f_600_ * (f_599_ - f_595_);
			class159.anInt1748
			    = (int) ((((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aFloat9260)
				     + (((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068)).aFloat9261
					* f_601_ / f_603_));
			class159.anInt1750
			    = (int) ((((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aFloat9262)
				     + (((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068)).aFloat9263
					* f_602_ / f_603_));
		    } else if (f_598_ < -f_599_) {
			float f_604_
			    = (f_598_ + f_599_) / (f_594_ + f_595_) - 1.0F;
			float f_605_ = f_596_ + f_604_ * (f_592_ - f_596_);
			float f_606_ = f_597_ + f_604_ * (f_593_ - f_597_);
			float f_607_ = f_599_ + f_604_ * (f_595_ - f_599_);
			class159.anInt1749
			    = (int) ((((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aFloat9260)
				     + (((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068)).aFloat9261
					* f_605_ / f_607_));
			class159.anInt1752
			    = (int) ((((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aFloat9262)
				     + (((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068)).aFloat9263
					* f_606_ / f_607_));
		    }
		}
		if (bool_586_) {
		    if (f_594_ / f_595_ > f_598_ / f_599_) {
			float f_608_
			    = (f_592_
			       + (class418.aFloatArray4768[0]
				  * (float) ((Class157_Sub1) this).anInt9060)
			       + class418.aFloatArray4768[12]);
			float f_609_
			    = (f_595_
			       + (class418.aFloatArray4768[3]
				  * (float) ((Class157_Sub1) this).anInt9060)
			       + class418.aFloatArray4768[15]);
			class159.anInt1753
			    = (int) ((((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aFloat9260)
				     - (float) class159.anInt1748
				     + (((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068)).aFloat9261
					* f_608_ / f_609_));
		    } else {
			float f_610_
			    = (f_596_
			       + (class418.aFloatArray4768[0]
				  * (float) ((Class157_Sub1) this).anInt9060)
			       + class418.aFloatArray4768[12]);
			float f_611_
			    = (f_599_
			       + (class418.aFloatArray4768[3]
				  * (float) ((Class157_Sub1) this).anInt9060)
			       + class418.aFloatArray4768[15]);
			class159.anInt1753
			    = (int) ((((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aFloat9260)
				     - (float) class159.anInt1749
				     + (((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068)).aFloat9261
					* f_610_ / f_611_));
		    }
		    class159.aBool1751 = true;
		}
	    }
	    ((Class157_Sub1) this).aClass173_Sub1_9068.method8565(i);
	    method8361(class433);
	    ((Class157_Sub1) this).aClass173_Sub1_9068.method8565(0);
	    class418_575_.method5035(class433);
	    class418_575_.method4974(((Class157_Sub1) this).aClass173_Sub1_9068
				     .aClass418_9381);
	    method8362(class418_575_);
	}
    }
    
    void method8361(Class433 class433) {
	if (((Class157_Sub1) this).anInt9056 != 0
	    && (method8364() && method8363())) {
	    if (aClass346_9107 == null) {
		/* empty */
	    }
	    ((Class157_Sub1) this).aClass173_Sub1_9068.method8587();
	    ((Class157_Sub1) this).aClass173_Sub1_9068.method8512();
	    Class306 class306
		= (((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
		   .aClass306_9324);
	    ((Class157_Sub1) this).aClass173_Sub1_9068.method8553
		(0, (((Class354) ((Class157_Sub1) this).aClass354_9045)
		     .anInterface36_3803));
	    ((Class157_Sub1) this).aClass173_Sub1_9068.method8553
		(1, (((Class354) ((Class157_Sub1) this).aClass354_9050)
		     .anInterface36_3803));
	    ((Class157_Sub1) this).aClass173_Sub1_9068.method8553
		(2, (((Class354) ((Class157_Sub1) this).aClass354_9069)
		     .anInterface36_3803));
	    ((Class157_Sub1) this).aClass173_Sub1_9068.method8554
		(((Class339) ((Class157_Sub1) this).aClass339_9101)
		 .anInterface41_3580);
	    ((Class157_Sub1) this).aClass173_Sub1_9068.aClass418_9243
		.method5035(class433);
	    class306.method4057(((Class157_Sub1) this).aClass173_Sub1_9068
				.aClass418_9243);
	    class306.aClass418_3358.method5013();
	    if (((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
		.aBool9289) {
		Class164 class164
		    = ((Class157_Sub1) this).aClass173_Sub1_9068.method8540();
		class306.aClass425_3361.method5120
		    (0.0F, 1.0F, 0.0F,
		     (float) -(((Class173_Sub1)
				((Class157_Sub1) this).aClass173_Sub1_9068)
			       .anInt9237));
		class306.aClass425_3361.method5136(3.0F
						   / (float) ((class164
							       .anInt1828)
							      * -386339441));
		class306.aClass422_3362.method5057
		    (((float) (class164.anInt1827 * -222719641 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (class164.anInt1827 * -222719641 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (class164.anInt1827 * -222719641 >> 0 & 0xff)
		      / 255.0F));
	    } else {
		class306.aClass425_3361.method5120(0.0F, 0.0F, 0.0F, 0.0F);
		class306.aClass422_3362.method5057(0.0F, 0.0F, 0.0F);
	    }
	    if (((Class157_Sub1) this).aClass173_Sub1_9068.anInt9236 > 0) {
		class306.aClass425_3372.method5120(0.0F, 0.0F, 1.0F,
						   -(((Class157_Sub1) this)
						     .aClass173_Sub1_9068
						     .aFloat9347));
		class306.aClass422_3368.method5057
		    ((float) ((((Class157_Sub1) this).aClass173_Sub1_9068
			       .anInt9344) >> 16
			      & 0xff) / 255.0F,
		     (float) ((((Class157_Sub1) this).aClass173_Sub1_9068
			       .anInt9344) >> 8
			      & 0xff) / 255.0F,
		     (float) ((((Class157_Sub1) this).aClass173_Sub1_9068
			       .anInt9344) >> 0
			      & 0xff) / 255.0F);
		((Class157_Sub1) this).aClass173_Sub1_9068.aClass418_9243
		    .method5035(class433);
		((Class157_Sub1) this).aClass173_Sub1_9068.aClass418_9243
		    .method4993();
		class306.aClass425_3361.method5126(((Class157_Sub1) this)
						   .aClass173_Sub1_9068
						   .aClass418_9243);
		((Class157_Sub1) this).aClass173_Sub1_9068.aClass418_9243
		    .method5035(class433);
		((Class157_Sub1) this).aClass173_Sub1_9068.aClass418_9243
		    .method4974
		    (((Class157_Sub1) this).aClass173_Sub1_9068
		     .aClass418_9381);
		((Class157_Sub1) this).aClass173_Sub1_9068.aClass418_9243
		    .method4993();
		class306.aClass425_3372.method5126(((Class157_Sub1) this)
						   .aClass173_Sub1_9068
						   .aClass418_9243);
		class306.aClass425_3372.method5136(1.0F
						   / ((((Class157_Sub1) this)
						       .aClass173_Sub1_9068
						       .aFloat9348)
						      - (((Class157_Sub1) this)
							 .aClass173_Sub1_9068
							 .aFloat9347)));
	    } else {
		class306.aClass425_3372.method5120(0.0F, 0.0F, 0.0F, 0.0F);
		class306.aClass422_3368.method5057(0.0F, 0.0F, 0.0F);
	    }
	    if ((((Class157_Sub1) this).anInt9035 & 0x37) == 0) {
		((Class157_Sub1) this).aClass173_Sub1_9068.method8552
		    (((Class173_Sub1) (((Class157_Sub1) this)
				       .aClass173_Sub1_9068)).aClass344_9376);
		if (((Class157_Sub1) this).aClass173_Sub1_9068.aBool9274)
		    ((Class157_Sub1) this).aClass173_Sub1_9068
			.method8505(false);
		for (int i = 0;
		     i < ((Class157_Sub1) this).anIntArray9099.length; i++) {
		    int i_612_ = ((Class157_Sub1) this).anIntArray9085[i];
		    int i_613_ = ((Class157_Sub1) this).anIntArray9085[i + 1];
		    int i_614_
			= ((Class157_Sub1) this).aShortArray9062[i_612_];
		    boolean bool = false;
		    byte i_615_ = 0;
		    if (i_614_ != -1) {
			Class160 class160
			    = ((Class157_Sub1) this).aClass173_Sub1_9068
				  .aClass165_1984
				  .method2093(i_614_ & 0xffff, (byte) -124);
			class306.anInterface34_3355
			    = ((Class173_Sub1)
			       ((Class157_Sub1) this).aClass173_Sub1_9068)
				  .aClass329_9315.method4265(class160);
			bool = !Class687.method8029(class160.aByte1790,
						    2087194150);
			class306.aClass418_3358.aFloatArray4768[12]
			    = ((float) ((((Class157_Sub1) this)
					 .aClass173_Sub1_9068.anInt9356)
					% 128000)
			       / 1000.0F * (float) class160.aByte1775 / 64.0F
			       % 1.0F);
			class306.aClass418_3358.aFloatArray4768[13]
			    = ((float) ((((Class157_Sub1) this)
					 .aClass173_Sub1_9068.anInt9356)
					% 128000)
			       / 1000.0F * (float) class160.aByte1776 / 64.0F
			       % 1.0F);
			if (class160.aClass583_1771 == Class583.aClass583_7696)
			    i_615_ = class160.aByte1779;
		    } else {
			class306.anInterface34_3355
			    = (((Class157_Sub1) this).aClass173_Sub1_9068
			       .anInterface34_9316);
			float[] fs = class306.aClass418_3358.aFloatArray4768;
			class306.aClass418_3358.aFloatArray4768[13] = 0.0F;
			fs[12] = 0.0F;
		    }
		    ((Class157_Sub1) this).aClass173_Sub1_9068
			.method8544(i_615_);
		    class306.anInt3370
			= ((Class157_Sub1) this).anIntArray9099[i];
		    class306.anInt3354
			= ((Class157_Sub1) this).anIntArray9087[i];
		    class306.anInt3351 = i_612_ * 3;
		    class306.anInt3373 = i_613_ - i_612_;
		    class306.method4058(bool);
		}
	    } else {
		((Class157_Sub1) this).aClass173_Sub1_9068.method8553
		    (3, (((Class354) ((Class157_Sub1) this).aClass354_9086)
			 .anInterface36_3803));
		((Class157_Sub1) this).aClass173_Sub1_9068.method8552
		    (((Class173_Sub1) (((Class157_Sub1) this)
				       .aClass173_Sub1_9068)).aClass344_9216);
		Class433 class433_616_
		    = (((Class173_Sub1)
			((Class157_Sub1) this).aClass173_Sub1_9068)
		       .aClass433_9242);
		class433_616_.method5217(class433);
		class433_616_.method5223();
		int i = 0;
		if (((Class157_Sub1) this).aClass173_Sub1_9068.aBool9274)
		    ((Class157_Sub1) this).aClass173_Sub1_9068
			.method8505(true);
		else {
		    class306.aClass422_3365.method5057((((Class157_Sub1) this)
							.aClass173_Sub1_9068
							.aFloatArray9290[0]),
						       (((Class157_Sub1) this)
							.aClass173_Sub1_9068
							.aFloatArray9290[1]),
						       (((Class157_Sub1) this)
							.aClass173_Sub1_9068
							.aFloatArray9290[2]));
		    class306.aClass422_3365.method5077(class433_616_);
		    class306.aClass422_3366.method5057
			((((Class157_Sub1) this).aClass173_Sub1_9068.aFloat9299
			  * (((Class157_Sub1) this).aClass173_Sub1_9068
			     .aFloat9295)),
			 (((Class157_Sub1) this).aClass173_Sub1_9068.aFloat9299
			  * (((Class157_Sub1) this).aClass173_Sub1_9068
			     .aFloat9296)),
			 (((Class157_Sub1) this).aClass173_Sub1_9068.aFloat9299
			  * (((Class157_Sub1) this).aClass173_Sub1_9068
			     .aFloat9251)));
		    class306.aClass422_3367.method5057
			((-(((Class157_Sub1) this).aClass173_Sub1_9068
			    .aFloat9300)
			  * (((Class157_Sub1) this).aClass173_Sub1_9068
			     .aFloat9295)),
			 (-(((Class157_Sub1) this).aClass173_Sub1_9068
			    .aFloat9300)
			  * (((Class157_Sub1) this).aClass173_Sub1_9068
			     .aFloat9296)),
			 (-(((Class157_Sub1) this).aClass173_Sub1_9068
			    .aFloat9300)
			  * (((Class157_Sub1) this).aClass173_Sub1_9068
			     .aFloat9251)));
		    class306.aClass422_3363.method5057
			((((Class157_Sub1) this).aClass173_Sub1_9068.aFloat9298
			  * (((Class157_Sub1) this).aClass173_Sub1_9068
			     .aFloat9295)),
			 (((Class157_Sub1) this).aClass173_Sub1_9068.aFloat9298
			  * (((Class157_Sub1) this).aClass173_Sub1_9068
			     .aFloat9296)),
			 (((Class157_Sub1) this).aClass173_Sub1_9068.aFloat9298
			  * (((Class157_Sub1) this).aClass173_Sub1_9068
			     .aFloat9251)));
		    if (((Class157_Sub1) this).aClass173_Sub1_9068.anInt9302
			> 0) {
			i = (((Class157_Sub1) this).aClass173_Sub1_9068
			     .anInt9302);
			Class422 class422
			    = (((Class173_Sub1)
				((Class157_Sub1) this).aClass173_Sub1_9068)
			       .aClass422_9245);
			for (int i_617_ = 0; i_617_ < i; i_617_++) {
			    Class528_Sub12 class528_sub12
				= (((Class157_Sub1) this).aClass173_Sub1_9068
				   .aClass528_Sub12Array9210[i_617_]);
			    int i_618_ = class528_sub12.method9361((byte) 71);
			    class422
				.method5058(class528_sub12.aClass422_10345);
			    class422.method5076(class433_616_);
			    class306.aFloatArray3364[i_617_ * 4 + 0]
				= class422.aFloat4780;
			    class306.aFloatArray3364[i_617_ * 4 + 1]
				= class422.aFloat4776;
			    class306.aFloatArray3364[i_617_ * 4 + 2]
				= class422.aFloat4777;
			    class306.aFloatArray3364[i_617_ * 4 + 3]
				= (1.0F
				   / (float) (class528_sub12
						  .method9357(930250396)
					      * class528_sub12
						    .method9357(1735361601)));
			    float f = (class528_sub12.method9362(2004971697)
				       / 255.0F);
			    class306.aFloatArray3357[i_617_ * 4 + 0]
				= (float) (i_618_ >> 16 & 0xff) * f;
			    class306.aFloatArray3357[i_617_ * 4 + 1]
				= (float) (i_618_ >> 8 & 0xff) * f;
			    class306.aFloatArray3357[i_617_ * 4 + 2]
				= (float) (i_618_ & 0xff) * f;
			    class306.aFloatArray3357[i_617_ * 4 + 3] = 1.0F;
			}
		    }
		}
		for (int i_619_ = 0;
		     i_619_ < ((Class157_Sub1) this).anIntArray9099.length;
		     i_619_++) {
		    int i_620_ = ((Class157_Sub1) this).anIntArray9085[i_619_];
		    int i_621_
			= ((Class157_Sub1) this).anIntArray9085[i_619_ + 1];
		    int i_622_
			= ((Class157_Sub1) this).aShortArray9062[i_620_];
		    byte i_623_ = 11;
		    Class160 class160 = null;
		    byte i_624_ = 0;
		    if (i_622_ != -1) {
			class160
			    = ((Class157_Sub1) this).aClass173_Sub1_9068
				  .aClass165_1984
				  .method2093(i_622_ & 0xffff, (byte) -120);
			class306.anInterface34_3355
			    = ((Class173_Sub1)
			       ((Class157_Sub1) this).aClass173_Sub1_9068)
				  .aClass329_9315.method4265(class160);
			i_623_ = class160.aByte1790;
			class306.method4056(class160.aByte1796);
			class306.aClass418_3358.aFloatArray4768[12]
			    = ((float) ((((Class157_Sub1) this)
					 .aClass173_Sub1_9068.anInt9356)
					% 128000)
			       / 1000.0F * (float) class160.aByte1775 / 64.0F
			       % 1.0F);
			class306.aClass418_3358.aFloatArray4768[13]
			    = ((float) ((((Class157_Sub1) this)
					 .aClass173_Sub1_9068.anInt9356)
					% 128000)
			       / 1000.0F * (float) class160.aByte1776 / 64.0F
			       % 1.0F);
			if (class160.aClass583_1771 == Class583.aClass583_7696)
			    i_624_ = class160.aByte1779;
		    } else {
			class306.anInterface34_3355
			    = (((Class157_Sub1) this).aClass173_Sub1_9068
			       .anInterface34_9316);
			float[] fs = class306.aClass418_3358.aFloatArray4768;
			class306.aClass418_3358.aFloatArray4768[13] = 0.0F;
			fs[12] = 0.0F;
		    }
		    ((Class157_Sub1) this).aClass173_Sub1_9068
			.method8544(i_624_);
		    class306.anInt3370
			= ((Class157_Sub1) this).anIntArray9099[i_619_];
		    class306.anInt3354
			= ((Class157_Sub1) this).anIntArray9087[i_619_];
		    class306.anInt3351 = i_620_ * 3;
		    class306.anInt3373 = i_621_ - i_620_;
		    switch (i_623_) {
		    case 7:
			class306.aClass422_3369.method5057
			    ((((Class173_Sub1)
			       ((Class157_Sub1) this).aClass173_Sub1_9068)
			      .aClass418_9363.aFloatArray4768[12]),
			     (((Class173_Sub1)
			       ((Class157_Sub1) this).aClass173_Sub1_9068)
			      .aClass418_9363.aFloatArray4768[13]),
			     (((Class173_Sub1)
			       ((Class157_Sub1) this).aClass173_Sub1_9068)
			      .aClass418_9363.aFloatArray4768[14]));
			class306.aClass422_3369.method5076(class433_616_);
			class306.aClass418_3353.method5035(class433);
			class306.anInterface39_3356
			    = ((Class157_Sub1) this).aClass173_Sub1_9068
				  .method8584();
			class306.method4071(i);
			break;
		    case 5:
			if (!((Class157_Sub1) this).aClass173_Sub1_9068
			     .aBool9274) {
			    Class335_Sub1_Sub1 class335_sub1_sub1
				= (((Class173_Sub1)
				    ((Class157_Sub1) this).aClass173_Sub1_9068)
				   .aClass335_Sub1_Sub1_9239);
			    class335_sub1_sub1.method10371(class160.aByte1796,
							   (class160.anInt1797
							    * 1985810005),
							   -1418620243);
			    class335_sub1_sub1.aClass418_11319
				.method5035(class433);
			    class335_sub1_sub1.aClass418_11312
				.method5035(class433);
			    class335_sub1_sub1.aClass418_11312.method4974
				(((Class157_Sub1) this).aClass173_Sub1_9068
				 .aClass418_9352);
			    class335_sub1_sub1.anInt11325
				= (((Class157_Sub1) this).anIntArray9099
				   [i_619_]) * -1541624041;
			    class335_sub1_sub1.anInt11326
				= (((Class157_Sub1) this).anIntArray9087
				   [i_619_]) * 499844193;
			    class335_sub1_sub1.anInt11327 = i_620_ * -84608093;
			    class335_sub1_sub1.anInt11313
				= (i_621_ - i_620_) * -662530143;
			    class335_sub1_sub1.method10372(931666345);
			} else
			    class306.method4059(i);
			break;
		    case 1:
			class306.aClass422_3369.method5057
			    ((((Class173_Sub1)
			       ((Class157_Sub1) this).aClass173_Sub1_9068)
			      .aClass418_9363.aFloatArray4768[12]),
			     (((Class173_Sub1)
			       ((Class157_Sub1) this).aClass173_Sub1_9068)
			      .aClass418_9363.aFloatArray4768[13]),
			     (((Class173_Sub1)
			       ((Class157_Sub1) this).aClass173_Sub1_9068)
			      .aClass418_9363.aFloatArray4768[14]));
			class306.aClass422_3369.method5076(class433_616_);
			class306.method4060(i);
			break;
		    default:
			class306.method4059(i);
			break;
		    case 6:
			class306.method4058(!Class687.method8029(i_623_,
								 1265269466));
		    }
		}
	    }
	    method8355();
	}
    }
    
    void method8362(Class418 class418) {
	if (((Class157_Sub1) this).aClass348Array9078 != null) {
	    ((Class157_Sub1) this).aClass173_Sub1_9068
		.method2283(!((Class157_Sub1) this).aBool9051);
	    Class433 class433
		= (((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
		   .aClass433_9242);
	    Class317 class317
		= (((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
		   .aClass317_9327);
	    boolean bool
		= ((Class157_Sub1) this).aClass173_Sub1_9068.anInt9236 > 0;
	    if (bool)
		class317.aClass422_3455.method5057
		    ((float) ((((Class157_Sub1) this).aClass173_Sub1_9068
			       .anInt9344) >> 16
			      & 0xff) / 255.0F,
		     (float) ((((Class157_Sub1) this).aClass173_Sub1_9068
			       .anInt9344) >> 8
			      & 0xff) / 255.0F,
		     (float) ((((Class157_Sub1) this).aClass173_Sub1_9068
			       .anInt9344) >> 0
			      & 0xff) / 255.0F);
	    else
		class317.aClass422_3455.method5057(0.0F, 0.0F, 0.0F);
	    for (int i = 0; i < ((Class157_Sub1) this).anInt9092; i++) {
		Class348 class348
		    = ((Class157_Sub1) this).aClass348Array9078[i];
		Class328 class328
		    = ((Class157_Sub1) this).aClass328Array9094[i];
		if (!((Class348) class348).aBool3650
		    || !((Class157_Sub1) this).aClass173_Sub1_9068
			    .method2271()) {
		    float f
			= ((float) ((((Class157_Sub1) this).anIntArray9040
				     [((Class348) class348).anInt3657])
				    + (((Class157_Sub1) this).anIntArray9040
				       [((Class348) class348).anInt3651])
				    + (((Class157_Sub1) this).anIntArray9040
				       [((Class348) class348).anInt3652]))
			   * 0.3333333F);
		    float f_625_
			= ((float) ((((Class157_Sub1) this).anIntArray9041
				     [((Class348) class348).anInt3657])
				    + (((Class157_Sub1) this).anIntArray9041
				       [((Class348) class348).anInt3651])
				    + (((Class157_Sub1) this).anIntArray9041
				       [((Class348) class348).anInt3652]))
			   * 0.3333333F);
		    float f_626_
			= ((float) ((((Class157_Sub1) this).anIntArray9042
				     [((Class348) class348).anInt3657])
				    + (((Class157_Sub1) this).anIntArray9042
				       [((Class348) class348).anInt3651])
				    + (((Class157_Sub1) this).anIntArray9042
				       [((Class348) class348).anInt3652]))
			   * 0.3333333F);
		    float f_627_ = (class418.aFloatArray4768[0] * f
				    + class418.aFloatArray4768[4] * f_625_
				    + class418.aFloatArray4768[8] * f_626_
				    + class418.aFloatArray4768[12]);
		    float f_628_ = (class418.aFloatArray4768[1] * f
				    + class418.aFloatArray4768[5] * f_625_
				    + class418.aFloatArray4768[9] * f_626_
				    + class418.aFloatArray4768[13]);
		    float f_629_ = (class418.aFloatArray4768[2] * f
				    + class418.aFloatArray4768[6] * f_625_
				    + class418.aFloatArray4768[10] * f_626_
				    + class418.aFloatArray4768[14]);
		    float f_630_
			= ((float) (1.0
				    / Math.sqrt((double) (f_627_ * f_627_
							  + f_628_ * f_628_
							  + f_629_ * f_629_)))
			   * (float) ((Class348) class348).anInt3658);
		    class433.method5221
			(((Class328) class328).anInt3505,
			 (((Class328) class328).anInt3504
			  * ((Class348) class348).aShort3654) >> 7,
			 (((Class328) class328).anInt3506
			  * ((Class348) class348).aShort3655) >> 7,
			 (f_627_ + (float) ((Class328) class328).anInt3508
			  - f_627_ * f_630_),
			 (f_628_ + (float) ((Class328) class328).anInt3507
			  - f_628_ * f_630_),
			 f_629_ - f_629_ * f_630_);
		    class433.method5231(((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068))
					.aClass433_9285);
		    ((Class173_Sub1)
		     ((Class157_Sub1) this).aClass173_Sub1_9068)
			.aClass418_9244.method5035(class433);
		    class317.method4180(((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068))
					.aClass418_9244);
		    class317.aClass418_3456.method5013();
		    class317.anInt3454 = ((Class328) class328).anInt3503;
		    if (bool)
			class317.aFloat3459
			    = 1.0F - (((((Class157_Sub1) this)
					.aClass173_Sub1_9068.aFloat9348)
				       - f_629_)
				      / ((((Class157_Sub1) this)
					  .aClass173_Sub1_9068.aFloat9348)
					 - (((Class157_Sub1) this)
					    .aClass173_Sub1_9068.aFloat9347)));
		    class317.anInterface34_3453 = null;
		    if (((Class348) class348).aShort3656 != -1)
			class317.anInterface34_3453
			    = (((Class173_Sub1)
				((Class157_Sub1) this).aClass173_Sub1_9068)
				   .aClass329_9315.method4265
			       (((Class157_Sub1) this).aClass173_Sub1_9068
				    .aClass165_1984.method2093
				(((Class348) class348).aShort3656 & 0xffff,
				 (byte) -9)));
		    class317.method4182(bool);
		}
	    }
	    ((Class157_Sub1) this).aClass173_Sub1_9068.method2283(true);
	}
    }
    
    boolean method8363() {
	if (((Class339) ((Class157_Sub1) this).aClass339_9101).aBool3582)
	    return true;
	if ((((Class339) ((Class157_Sub1) this).aClass339_9101)
	     .anInterface41_3583)
	    == null)
	    ((Class339) ((Class157_Sub1) this).aClass339_9101)
		.anInterface41_3583
		= ((Class157_Sub1) this).aClass173_Sub1_9068.method8476(false);
	Interface41 interface41
	    = (((Class339) ((Class157_Sub1) this).aClass339_9101)
	       .anInterface41_3583);
	interface41.method311(((Class157_Sub1) this).anInt9056 * 6);
	Unsafe unsafe
	    = ((Class157_Sub1) this).aClass173_Sub1_9068.anUnsafe9221;
	if (unsafe != null) {
	    int i = ((Class157_Sub1) this).anInt9056 * 6;
	    long l = interface41.method205(0, i);
	    if (l == 0L)
		return false;
	    for (int i_631_ = 0; i_631_ < ((Class157_Sub1) this).anInt9056;
		 i_631_++) {
		unsafe.putShort(l, (((Class157_Sub1) this).aShortArray9059
				    [i_631_]));
		l += 2L;
		unsafe.putShort(l, (((Class157_Sub1) this).aShortArray9105
				    [i_631_]));
		l += 2L;
		unsafe.putShort(l, (((Class157_Sub1) this).aShortArray9091
				    [i_631_]));
		l += 2L;
	    }
	    interface41.method192();
	    ((Class339) ((Class157_Sub1) this).aClass339_9101)
		.anInterface41_3580
		= interface41;
	    ((Class339) ((Class157_Sub1) this).aClass339_9101).aBool3582
		= true;
	    ((Class157_Sub1) this).aBool9071 = true;
	    return true;
	}
	ByteBuffer bytebuffer
	    = ((Class157_Sub1) this).aClass173_Sub1_9068.aByteBuffer9222;
	bytebuffer.clear();
	for (int i = 0; i < ((Class157_Sub1) this).anInt9056; i++) {
	    bytebuffer.putShort(((Class157_Sub1) this).aShortArray9059[i]);
	    bytebuffer.putShort(((Class157_Sub1) this).aShortArray9105[i]);
	    bytebuffer.putShort(((Class157_Sub1) this).aShortArray9091[i]);
	}
	if (interface41.method197(0, bytebuffer.position(),
				  (((Class157_Sub1) this).aClass173_Sub1_9068
				   .aLong9223))) {
	    ((Class339) ((Class157_Sub1) this).aClass339_9101)
		.anInterface41_3580
		= interface41;
	    ((Class339) ((Class157_Sub1) this).aClass339_9101).aBool3582
		= true;
	    ((Class157_Sub1) this).aBool9071 = true;
	    return true;
	}
	return false;
    }
    
    boolean method8364() {
	boolean bool
	    = !((Class354) ((Class157_Sub1) this).aClass354_9050).aBool3801;
	boolean bool_632_
	    = ((((Class157_Sub1) this).anInt9035 & 0x37) != 0
	       && !(((Class354) ((Class157_Sub1) this).aClass354_9086)
		    .aBool3801));
	boolean bool_633_
	    = !((Class354) ((Class157_Sub1) this).aClass354_9045).aBool3801;
	boolean bool_634_
	    = !((Class354) ((Class157_Sub1) this).aClass354_9069).aBool3801;
	if (!bool_633_ && !bool && !bool_632_ && !bool_634_)
	    return true;
	boolean bool_635_ = true;
	if (bool_633_ && ((Class157_Sub1) this).aShortArray9043 != null) {
	    if ((((Class354) ((Class157_Sub1) this).aClass354_9045)
		 .anInterface36_3804)
		== null)
		((Class354) ((Class157_Sub1) this).aClass354_9045)
		    .anInterface36_3804
		    = ((Class157_Sub1) this).aClass173_Sub1_9068
			  .method8549(((Class157_Sub1) this).aBool9070);
	    Interface36 interface36
		= (((Class354) ((Class157_Sub1) this).aClass354_9045)
		   .anInterface36_3804);
	    interface36.method258(((Class157_Sub1) this).anInt9077 * 12, 12);
	    Unsafe unsafe
		= ((Class157_Sub1) this).aClass173_Sub1_9068.anUnsafe9221;
	    if (unsafe != null) {
		int i = ((Class157_Sub1) this).anInt9077 * 12;
		long l = interface36.method205(0, i);
		for (int i_636_ = 0; i_636_ < ((Class157_Sub1) this).anInt9077;
		     i_636_++) {
		    short i_637_
			= ((Class157_Sub1) this).aShortArray9043[i_636_];
		    unsafe.putFloat(l, (float) (((Class157_Sub1) this)
						.anIntArray9040[i_637_]));
		    l += 4L;
		    unsafe.putFloat(l, (float) (((Class157_Sub1) this)
						.anIntArray9041[i_637_]));
		    l += 4L;
		    unsafe.putFloat(l, (float) (((Class157_Sub1) this)
						.anIntArray9042[i_637_]));
		    l += 4L;
		}
		interface36.method192();
	    } else {
		ByteBuffer bytebuffer = (((Class157_Sub1) this)
					 .aClass173_Sub1_9068.aByteBuffer9222);
		bytebuffer.clear();
		for (int i = 0; i < ((Class157_Sub1) this).anInt9077; i++) {
		    bytebuffer.putFloat((float) ((Class157_Sub1) this)
						.anIntArray9040
						[(((Class157_Sub1) this)
						  .aShortArray9043[i])]);
		    bytebuffer.putFloat((float) ((Class157_Sub1) this)
						.anIntArray9041
						[(((Class157_Sub1) this)
						  .aShortArray9043[i])]);
		    bytebuffer.putFloat((float) ((Class157_Sub1) this)
						.anIntArray9042
						[(((Class157_Sub1) this)
						  .aShortArray9043[i])]);
		}
		interface36.method197(0, bytebuffer.position(),
				      (((Class157_Sub1) this)
				       .aClass173_Sub1_9068.aLong9223));
	    }
	    ((Class354) ((Class157_Sub1) this).aClass354_9045)
		.anInterface36_3803
		= interface36;
	    ((Class354) ((Class157_Sub1) this).aClass354_9045).aBool3801
		= true;
	}
	if (bool) {
	    if ((((Class354) ((Class157_Sub1) this).aClass354_9050)
		 .anInterface36_3804)
		== null)
		((Class354) ((Class157_Sub1) this).aClass354_9050)
		    .anInterface36_3804
		    = ((Class157_Sub1) this).aClass173_Sub1_9068
			  .method8549(((Class157_Sub1) this).aBool9070);
	    Interface36 interface36
		= (((Class354) ((Class157_Sub1) this).aClass354_9050)
		   .anInterface36_3804);
	    interface36.method258(((Class157_Sub1) this).anInt9077 * 4, 4);
	    Unsafe unsafe
		= ((Class157_Sub1) this).aClass173_Sub1_9068.anUnsafe9221;
	    if (unsafe != null) {
		int i = ((Class157_Sub1) this).anInt9077 * 4;
		long l = interface36.method205(0, i);
		if ((((Class157_Sub1) this).anInt9035 & 0x37) == 0) {
		    short[] is;
		    short[] is_638_;
		    short[] is_639_;
		    byte[] is_640_;
		    if (((Class157_Sub1) this).aClass352_9054 != null) {
			is = ((Class352) (((Class157_Sub1) this)
					  .aClass352_9054)).aShortArray3796;
			is_638_
			    = ((Class352) (((Class157_Sub1) this)
					   .aClass352_9054)).aShortArray3794;
			is_639_
			    = ((Class352) (((Class157_Sub1) this)
					   .aClass352_9054)).aShortArray3793;
			is_640_
			    = ((Class352) (((Class157_Sub1) this)
					   .aClass352_9054)).aByteArray3795;
		    } else {
			is = ((Class157_Sub1) this).aShortArray9048;
			is_638_ = ((Class157_Sub1) this).aShortArray9049;
			is_639_ = ((Class157_Sub1) this).aShortArray9038;
			is_640_ = ((Class157_Sub1) this).aByteArray9052;
		    }
		    float f = ((((Class157_Sub1) this).aClass173_Sub1_9068
				.aFloat9299)
			       * 768.0F
			       / (float) ((Class157_Sub1) this).aShort9037);
		    float f_641_
			= ((((Class157_Sub1) this).aClass173_Sub1_9068
			    .aFloat9300)
			   * 768.0F
			   / (float) ((Class157_Sub1) this).aShort9037);
		    for (int i_642_ = 0;
			 i_642_ < ((Class157_Sub1) this).anInt9077; i_642_++) {
			short i_643_
			    = ((Class157_Sub1) this).aShortArray9047[i_642_];
			int i_644_
			    = method8380((((Class157_Sub1) this)
					  .aShortArray9057[i_643_]) & 0xffff,
					 (((Class157_Sub1) this)
					  .aShortArray9062[i_643_]),
					 ((Class157_Sub1) this).aShort9036);
			float f_645_ = ((float) (i_644_ >> 16 & 0xff)
					* (((Class157_Sub1) this)
					   .aClass173_Sub1_9068.aFloat9295));
			float f_646_ = ((float) (i_644_ >> 8 & 0xff)
					* (((Class157_Sub1) this)
					   .aClass173_Sub1_9068.aFloat9296));
			float f_647_ = ((float) (i_644_ & 0xff)
					* (((Class157_Sub1) this)
					   .aClass173_Sub1_9068.aFloat9251));
			byte i_648_ = is_640_[i_642_];
			float f_649_;
			if (i_648_ == 0)
			    f_649_
				= (((((Class157_Sub1) this).aClass173_Sub1_9068
				     .aFloatArray9290[0]) * (float) is[i_642_]
				    + (((Class157_Sub1) this)
				       .aClass173_Sub1_9068.aFloatArray9290
				       [1]) * (float) is_638_[i_642_]
				    + (((Class157_Sub1) this)
				       .aClass173_Sub1_9068.aFloatArray9290
				       [2]) * (float) is_639_[i_642_])
				   * 0.0026041667F);
			else
			    f_649_
				= (((((Class157_Sub1) this).aClass173_Sub1_9068
				     .aFloatArray9290[0]) * (float) is[i_642_]
				    + (((Class157_Sub1) this)
				       .aClass173_Sub1_9068.aFloatArray9290
				       [1]) * (float) is_638_[i_642_]
				    + (((Class157_Sub1) this)
				       .aClass173_Sub1_9068.aFloatArray9290
				       [2]) * (float) is_639_[i_642_])
				   / ((float) i_648_ * 256.0F));
			float f_650_
			    = ((((Class157_Sub1) this).aClass173_Sub1_9068
				.aFloat9298)
			       + f_649_ * (f_649_ < 0.0F ? f_641_ : f));
			int i_651_ = (int) (f_645_ * f_650_);
			if (i_651_ < 0)
			    i_651_ = 0;
			else if (i_651_ > 255)
			    i_651_ = 255;
			int i_652_ = (int) (f_646_ * f_650_);
			if (i_652_ < 0)
			    i_652_ = 0;
			else if (i_652_ > 255)
			    i_652_ = 255;
			int i_653_ = (int) (f_647_ * f_650_);
			if (i_653_ < 0)
			    i_653_ = 0;
			else if (i_653_ > 255)
			    i_653_ = 255;
			unsafe.putInt(l,
				      (255 - (((Class157_Sub1) this)
					      .aByteArray9058[i_643_]) << 24
				       | i_651_ << 16 | i_652_ << 8 | i_653_));
			l += 4L;
		    }
		} else {
		    for (int i_654_ = 0;
			 i_654_ < ((Class157_Sub1) this).anInt9077; i_654_++) {
			short i_655_
			    = ((Class157_Sub1) this).aShortArray9047[i_654_];
			int i_656_ = (255 - (((Class157_Sub1) this)
					     .aByteArray9058[i_655_]) << 24
				      | method8380(((((Class157_Sub1) this)
						     .aShortArray9057[i_655_])
						    & 0xffff),
						   (((Class157_Sub1) this)
						    .aShortArray9062[i_655_]),
						   (((Class157_Sub1) this)
						    .aShort9036)));
			unsafe.putInt(l, i_656_);
			l += 4L;
		    }
		}
		interface36.method192();
	    } else {
		ByteBuffer bytebuffer = (((Class157_Sub1) this)
					 .aClass173_Sub1_9068.aByteBuffer9222);
		bytebuffer.clear();
		if ((((Class157_Sub1) this).anInt9035 & 0x37) == 0) {
		    short[] is;
		    short[] is_657_;
		    short[] is_658_;
		    byte[] is_659_;
		    if (((Class157_Sub1) this).aClass352_9054 != null) {
			is = ((Class352) (((Class157_Sub1) this)
					  .aClass352_9054)).aShortArray3796;
			is_657_
			    = ((Class352) (((Class157_Sub1) this)
					   .aClass352_9054)).aShortArray3794;
			is_658_
			    = ((Class352) (((Class157_Sub1) this)
					   .aClass352_9054)).aShortArray3793;
			is_659_
			    = ((Class352) (((Class157_Sub1) this)
					   .aClass352_9054)).aByteArray3795;
		    } else {
			is = ((Class157_Sub1) this).aShortArray9048;
			is_657_ = ((Class157_Sub1) this).aShortArray9049;
			is_658_ = ((Class157_Sub1) this).aShortArray9038;
			is_659_ = ((Class157_Sub1) this).aByteArray9052;
		    }
		    float f = ((((Class157_Sub1) this).aClass173_Sub1_9068
				.aFloat9299)
			       * 768.0F
			       / (float) ((Class157_Sub1) this).aShort9037);
		    float f_660_
			= ((((Class157_Sub1) this).aClass173_Sub1_9068
			    .aFloat9300)
			   * 768.0F
			   / (float) ((Class157_Sub1) this).aShort9037);
		    for (int i = 0; i < ((Class157_Sub1) this).anInt9077;
			 i++) {
			short i_661_
			    = ((Class157_Sub1) this).aShortArray9047[i];
			int i_662_
			    = method8380((((Class157_Sub1) this)
					  .aShortArray9057[i_661_]) & 0xffff,
					 (((Class157_Sub1) this)
					  .aShortArray9062[i_661_]),
					 ((Class157_Sub1) this).aShort9036);
			float f_663_ = ((float) (i_662_ >> 16 & 0xff)
					* (((Class157_Sub1) this)
					   .aClass173_Sub1_9068.aFloat9295));
			float f_664_ = ((float) (i_662_ >> 8 & 0xff)
					* (((Class157_Sub1) this)
					   .aClass173_Sub1_9068.aFloat9296));
			float f_665_ = ((float) (i_662_ & 0xff)
					* (((Class157_Sub1) this)
					   .aClass173_Sub1_9068.aFloat9251));
			byte i_666_ = is_659_[i];
			float f_667_;
			if (i_666_ == 0)
			    f_667_
				= ((((Class157_Sub1) this).aClass173_Sub1_9068
				    .aFloatArray9290[0]) * (float) is[i]
				   + ((((Class157_Sub1) this)
				       .aClass173_Sub1_9068.aFloatArray9290[1])
				      * (float) is_657_[i])
				   + ((((Class157_Sub1) this)
				       .aClass173_Sub1_9068.aFloatArray9290[2])
				      * (float) is_658_[i])) * 0.0026041667F;
			else
			    f_667_
				= (((((Class157_Sub1) this).aClass173_Sub1_9068
				     .aFloatArray9290[0]) * (float) is[i]
				    + (((Class157_Sub1) this)
				       .aClass173_Sub1_9068.aFloatArray9290
				       [1]) * (float) is_657_[i]
				    + (((Class157_Sub1) this)
				       .aClass173_Sub1_9068.aFloatArray9290
				       [2]) * (float) is_658_[i])
				   / ((float) i_666_ * 256.0F));
			float f_668_
			    = ((((Class157_Sub1) this).aClass173_Sub1_9068
				.aFloat9298)
			       + f_667_ * (f_667_ < 0.0F ? f_660_ : f));
			int i_669_ = (int) (f_663_ * f_668_);
			if (i_669_ < 0)
			    i_669_ = 0;
			else if (i_669_ > 255)
			    i_669_ = 255;
			int i_670_ = (int) (f_664_ * f_668_);
			if (i_670_ < 0)
			    i_670_ = 0;
			else if (i_670_ > 255)
			    i_670_ = 255;
			int i_671_ = (int) (f_665_ * f_668_);
			if (i_671_ < 0)
			    i_671_ = 0;
			else if (i_671_ > 255)
			    i_671_ = 255;
			bytebuffer.putInt(255 - (((Class157_Sub1) this)
						 .aByteArray9058[i_661_]) << 24
					  | i_669_ << 16 | i_670_ << 8
					  | i_671_);
		    }
		} else {
		    for (int i = 0; i < ((Class157_Sub1) this).anInt9077;
			 i++) {
			short i_672_
			    = ((Class157_Sub1) this).aShortArray9047[i];
			int i_673_ = (255 - (((Class157_Sub1) this)
					     .aByteArray9058[i_672_]) << 24
				      | method8380(((((Class157_Sub1) this)
						     .aShortArray9057[i_672_])
						    & 0xffff),
						   (((Class157_Sub1) this)
						    .aShortArray9062[i_672_]),
						   (((Class157_Sub1) this)
						    .aShort9036)));
			bytebuffer.putInt(i_673_);
		    }
		}
		interface36.method197(0, bytebuffer.position(),
				      (((Class157_Sub1) this)
				       .aClass173_Sub1_9068.aLong9223));
	    }
	    ((Class354) ((Class157_Sub1) this).aClass354_9050)
		.anInterface36_3803
		= interface36;
	    ((Class354) ((Class157_Sub1) this).aClass354_9050).aBool3801
		= true;
	}
	if (bool_632_) {
	    if ((((Class354) ((Class157_Sub1) this).aClass354_9086)
		 .anInterface36_3804)
		== null)
		((Class354) ((Class157_Sub1) this).aClass354_9086)
		    .anInterface36_3804
		    = ((Class157_Sub1) this).aClass173_Sub1_9068
			  .method8549(((Class157_Sub1) this).aBool9070);
	    Interface36 interface36
		= (((Class354) ((Class157_Sub1) this).aClass354_9086)
		   .anInterface36_3804);
	    interface36.method258(((Class157_Sub1) this).anInt9077 * 12, 12);
	    short[] is;
	    short[] is_674_;
	    short[] is_675_;
	    byte[] is_676_;
	    if (((Class157_Sub1) this).aClass352_9054 != null) {
		is = (((Class352) ((Class157_Sub1) this).aClass352_9054)
		      .aShortArray3796);
		is_674_ = (((Class352) ((Class157_Sub1) this).aClass352_9054)
			   .aShortArray3794);
		is_675_ = (((Class352) ((Class157_Sub1) this).aClass352_9054)
			   .aShortArray3793);
		is_676_ = (((Class352) ((Class157_Sub1) this).aClass352_9054)
			   .aByteArray3795);
	    } else {
		is = ((Class157_Sub1) this).aShortArray9048;
		is_674_ = ((Class157_Sub1) this).aShortArray9049;
		is_675_ = ((Class157_Sub1) this).aShortArray9038;
		is_676_ = ((Class157_Sub1) this).aByteArray9052;
	    }
	    Unsafe unsafe
		= ((Class157_Sub1) this).aClass173_Sub1_9068.anUnsafe9221;
	    if (unsafe != null) {
		int i = ((Class157_Sub1) this).anInt9077 * 12;
		long l = interface36.method205(0, i);
		for (int i_677_ = 0; i_677_ < ((Class157_Sub1) this).anInt9077;
		     i_677_++) {
		    Class422 class422 = new Class422((float) is[i_677_],
						     (float) is_674_[i_677_],
						     (float) is_675_[i_677_]);
		    if (class422.method5069() != 0.0F) {
			if (is_676_[i_677_] > 1)
			    class422.method5073((float) is_676_[i_677_]);
			class422.method5062();
		    }
		    unsafe.putFloat(l, class422.aFloat4780);
		    l += 4L;
		    unsafe.putFloat(l, class422.aFloat4776);
		    l += 4L;
		    unsafe.putFloat(l, class422.aFloat4777);
		    l += 4L;
		}
		interface36.method192();
	    } else {
		ByteBuffer bytebuffer = (((Class157_Sub1) this)
					 .aClass173_Sub1_9068.aByteBuffer9222);
		bytebuffer.clear();
		for (int i = 0; i < ((Class157_Sub1) this).anInt9077; i++) {
		    Class422 class422
			= new Class422((float) is[i], (float) is_674_[i],
				       (float) is_675_[i]);
		    if (class422.method5069() != 0.0F) {
			if (is_676_[i] > 1)
			    class422.method5073((float) is_676_[i]);
			class422.method5062();
		    }
		    bytebuffer.putFloat(class422.aFloat4780);
		    bytebuffer.putFloat(class422.aFloat4776);
		    bytebuffer.putFloat(class422.aFloat4777);
		}
		interface36.method197(0, bytebuffer.position(),
				      (((Class157_Sub1) this)
				       .aClass173_Sub1_9068.aLong9223));
	    }
	    ((Class354) ((Class157_Sub1) this).aClass354_9086)
		.anInterface36_3803
		= interface36;
	    ((Class354) ((Class157_Sub1) this).aClass354_9086).aBool3801
		= true;
	}
	if (bool_634_) {
	    if ((((Class354) ((Class157_Sub1) this).aClass354_9069)
		 .anInterface36_3804)
		== null)
		((Class354) ((Class157_Sub1) this).aClass354_9069)
		    .anInterface36_3804
		    = ((Class157_Sub1) this).aClass173_Sub1_9068
			  .method8549(((Class157_Sub1) this).aBool9070);
	    Interface36 interface36
		= (((Class354) ((Class157_Sub1) this).aClass354_9069)
		   .anInterface36_3804);
	    interface36.method258(((Class157_Sub1) this).anInt9077 * 8, 8);
	    Unsafe unsafe
		= ((Class157_Sub1) this).aClass173_Sub1_9068.anUnsafe9221;
	    if (unsafe != null) {
		int i = ((Class157_Sub1) this).anInt9077 * 8;
		long l = interface36.method205(0, i);
		for (int i_678_ = 0; i_678_ < ((Class157_Sub1) this).anInt9077;
		     i_678_++) {
		    unsafe.putFloat(l, (((Class157_Sub1) this).aFloatArray9061
					[i_678_]));
		    l += 4L;
		    unsafe.putFloat(l, (((Class157_Sub1) this).aFloatArray9053
					[i_678_]));
		    l += 4L;
		}
		interface36.method192();
	    } else {
		ByteBuffer bytebuffer = (((Class157_Sub1) this)
					 .aClass173_Sub1_9068.aByteBuffer9222);
		bytebuffer.clear();
		for (int i = 0; i < ((Class157_Sub1) this).anInt9077; i++) {
		    bytebuffer
			.putFloat(((Class157_Sub1) this).aFloatArray9061[i]);
		    bytebuffer
			.putFloat(((Class157_Sub1) this).aFloatArray9053[i]);
		}
		interface36.method197(0, bytebuffer.position(),
				      (((Class157_Sub1) this)
				       .aClass173_Sub1_9068.aLong9223));
	    }
	    ((Class354) ((Class157_Sub1) this).aClass354_9069)
		.anInterface36_3803
		= interface36;
	    ((Class354) ((Class157_Sub1) this).aClass354_9069).aBool3801
		= true;
	}
	return bool_635_;
    }
    
    void method8365() {
	if (((Class157_Sub1) this).aClass354_9045 != null)
	    ((Class157_Sub1) this).aClass354_9045.method4574();
	if (((Class157_Sub1) this).aClass354_9069 != null)
	    ((Class157_Sub1) this).aClass354_9069.method4574();
	if (((Class157_Sub1) this).aClass354_9050 != null)
	    ((Class157_Sub1) this).aClass354_9050.method4574();
	if (((Class157_Sub1) this).aClass354_9086 != null)
	    ((Class157_Sub1) this).aClass354_9086.method4574();
	if (((Class157_Sub1) this).aClass339_9101 != null)
	    ((Class157_Sub1) this).aClass339_9101.method4482();
    }
    
    int method8366(int i, int i_679_) {
	i_679_ = i_679_ * (i & 0x7f) >> 7;
	if (i_679_ < 2)
	    i_679_ = 2;
	else if (i_679_ > 126)
	    i_679_ = 126;
	return (i & 0xff80) + i_679_;
    }
    
    void method8367() {
	if ((((Class157_Sub1) this).anInt9035 & 0x37) != 0) {
	    if (((Class157_Sub1) this).aClass354_9086 != null)
		((Class354) ((Class157_Sub1) this).aClass354_9086).aBool3801
		    = false;
	} else if (((Class157_Sub1) this).aClass354_9050 != null)
	    ((Class354) ((Class157_Sub1) this).aClass354_9050).aBool3801
		= false;
    }
    
    boolean method1889() {
	if (((Class157_Sub1) this).anIntArrayArray9033 == null)
	    return false;
	for (int i = 0; i < ((Class157_Sub1) this).anInt9088; i++) {
	    ((Class157_Sub1) this).anIntArray9040[i] <<= 4;
	    ((Class157_Sub1) this).anIntArray9041[i] <<= 4;
	    ((Class157_Sub1) this).anIntArray9042[i] <<= 4;
	}
	((Class157_Sub1) this).anInt9103 = 0;
	((Class157_Sub1) this).anInt9104 = 0;
	((Class157_Sub1) this).anInt9031 = 0;
	return true;
    }
    
    public Class157 method1926(byte i, int i_680_, boolean bool) {
	boolean bool_681_ = false;
	Class157_Sub1 class157_sub1_682_;
	Class157_Sub1 class157_sub1_683_;
	if (i > 0 && i <= 8) {
	    class157_sub1_683_
		= (((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
		   .aClass157_Sub1Array9382[i - 1]);
	    class157_sub1_682_
		= (((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
		   .aClass157_Sub1Array9380[i - 1]);
	    bool_681_ = true;
	} else
	    class157_sub1_682_ = class157_sub1_683_
		= new Class157_Sub1(((Class157_Sub1) this).aClass173_Sub1_9068,
				    0, 0, true, false);
	return method8354(class157_sub1_682_, class157_sub1_683_, i_680_,
			  bool_681_, bool);
    }
    
    public Class157 method1927(byte i, int i_684_, boolean bool) {
	boolean bool_685_ = false;
	Class157_Sub1 class157_sub1_686_;
	Class157_Sub1 class157_sub1_687_;
	if (i > 0 && i <= 8) {
	    class157_sub1_687_
		= (((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
		   .aClass157_Sub1Array9382[i - 1]);
	    class157_sub1_686_
		= (((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
		   .aClass157_Sub1Array9380[i - 1]);
	    bool_685_ = true;
	} else
	    class157_sub1_686_ = class157_sub1_687_
		= new Class157_Sub1(((Class157_Sub1) this).aClass173_Sub1_9068,
				    0, 0, true, false);
	return method8354(class157_sub1_686_, class157_sub1_687_, i_684_,
			  bool_685_, bool);
    }
    
    public int method2032() {
	return ((Class157_Sub1) this).anInt9034;
    }
    
    public int method1929() {
	return ((Class157_Sub1) this).anInt9034;
    }
    
    public int method1930() {
	return ((Class157_Sub1) this).anInt9034;
    }
    
    public void method1931(int i) {
	if (((Class157_Sub1) this).aClass354_9045 != null)
	    ((Class354) ((Class157_Sub1) this).aClass354_9045).aBool3802
		= Class338.method4395(i, ((Class157_Sub1) this).anInt9035);
	if (((Class157_Sub1) this).aClass354_9069 != null)
	    ((Class354) ((Class157_Sub1) this).aClass354_9069).aBool3802
		= Class338.method4462(i, ((Class157_Sub1) this).anInt9035);
	if (((Class157_Sub1) this).aClass354_9050 != null)
	    ((Class354) ((Class157_Sub1) this).aClass354_9050).aBool3802
		= Class338.method4397(i, ((Class157_Sub1) this).anInt9035);
	if (((Class157_Sub1) this).aClass354_9086 != null)
	    ((Class354) ((Class157_Sub1) this).aClass354_9086).aBool3802
		= Class338.method4396(i, ((Class157_Sub1) this).anInt9035);
	((Class157_Sub1) this).anInt9034 = i;
	if (((Class157_Sub1) this).aClass352_9054 != null
	    && (((Class157_Sub1) this).anInt9034 & 0x10000) == 0) {
	    ((Class157_Sub1) this).aShortArray9048
		= (((Class352) ((Class157_Sub1) this).aClass352_9054)
		   .aShortArray3796);
	    ((Class157_Sub1) this).aShortArray9049
		= (((Class352) ((Class157_Sub1) this).aClass352_9054)
		   .aShortArray3794);
	    ((Class157_Sub1) this).aShortArray9038
		= (((Class352) ((Class157_Sub1) this).aClass352_9054)
		   .aShortArray3793);
	    ((Class157_Sub1) this).aByteArray9052
		= (((Class352) ((Class157_Sub1) this).aClass352_9054)
		   .aByteArray3795);
	    ((Class157_Sub1) this).aClass352_9054 = null;
	}
	((Class157_Sub1) this).aBool9071 = true;
	method8355();
    }
    
    public void method2035(int i) {
	if (((Class157_Sub1) this).aClass354_9045 != null)
	    ((Class354) ((Class157_Sub1) this).aClass354_9045).aBool3802
		= Class338.method4395(i, ((Class157_Sub1) this).anInt9035);
	if (((Class157_Sub1) this).aClass354_9069 != null)
	    ((Class354) ((Class157_Sub1) this).aClass354_9069).aBool3802
		= Class338.method4462(i, ((Class157_Sub1) this).anInt9035);
	if (((Class157_Sub1) this).aClass354_9050 != null)
	    ((Class354) ((Class157_Sub1) this).aClass354_9050).aBool3802
		= Class338.method4397(i, ((Class157_Sub1) this).anInt9035);
	if (((Class157_Sub1) this).aClass354_9086 != null)
	    ((Class354) ((Class157_Sub1) this).aClass354_9086).aBool3802
		= Class338.method4396(i, ((Class157_Sub1) this).anInt9035);
	((Class157_Sub1) this).anInt9034 = i;
	if (((Class157_Sub1) this).aClass352_9054 != null
	    && (((Class157_Sub1) this).anInt9034 & 0x10000) == 0) {
	    ((Class157_Sub1) this).aShortArray9048
		= (((Class352) ((Class157_Sub1) this).aClass352_9054)
		   .aShortArray3796);
	    ((Class157_Sub1) this).aShortArray9049
		= (((Class352) ((Class157_Sub1) this).aClass352_9054)
		   .aShortArray3794);
	    ((Class157_Sub1) this).aShortArray9038
		= (((Class352) ((Class157_Sub1) this).aClass352_9054)
		   .aShortArray3793);
	    ((Class157_Sub1) this).aByteArray9052
		= (((Class352) ((Class157_Sub1) this).aClass352_9054)
		   .aByteArray3795);
	    ((Class157_Sub1) this).aClass352_9054 = null;
	}
	((Class157_Sub1) this).aBool9071 = true;
	method8355();
    }
    
    void method8368() {
	if (((Class157_Sub1) this).aClass339_9101 != null)
	    ((Class339) ((Class157_Sub1) this).aClass339_9101).aBool3582
		= false;
    }
    
    public void method1935() {
	if (((Class157_Sub1) this).anInt9077 > 0
	    && ((Class157_Sub1) this).anInt9056 > 0) {
	    method8364();
	    method8363();
	    method8355();
	}
    }
    
    public void method1939(int i) {
	int i_688_ = Class417.anIntArray4766[i];
	int i_689_ = Class417.anIntArray4767[i];
	for (int i_690_ = 0; i_690_ < ((Class157_Sub1) this).anInt9039;
	     i_690_++) {
	    int i_691_
		= ((((Class157_Sub1) this).anIntArray9042[i_690_] * i_688_
		    + ((Class157_Sub1) this).anIntArray9040[i_690_] * i_689_)
		   >> 14);
	    ((Class157_Sub1) this).anIntArray9042[i_690_]
		= ((((Class157_Sub1) this).anIntArray9042[i_690_] * i_689_
		    - ((Class157_Sub1) this).anIntArray9040[i_690_] * i_688_)
		   >> 14);
	    ((Class157_Sub1) this).anIntArray9040[i_690_] = i_691_;
	}
	for (int i_692_ = 0; i_692_ < ((Class157_Sub1) this).anInt9077;
	     i_692_++) {
	    int i_693_
		= ((((Class157_Sub1) this).aShortArray9038[i_692_] * i_688_
		    + ((Class157_Sub1) this).aShortArray9048[i_692_] * i_689_)
		   >> 14);
	    ((Class157_Sub1) this).aShortArray9038[i_692_]
		= (short) (((((Class157_Sub1) this).aShortArray9038[i_692_]
			     * i_689_)
			    - (((Class157_Sub1) this).aShortArray9048[i_692_]
			       * i_688_))
			   >> 14);
	    ((Class157_Sub1) this).aShortArray9048[i_692_] = (short) i_693_;
	}
	method8385();
	method8367();
	((Class157_Sub1) this).aBool9046 = false;
    }
    
    public void method1940(int i) {
	int i_694_ = Class417.anIntArray4766[i];
	int i_695_ = Class417.anIntArray4767[i];
	for (int i_696_ = 0; i_696_ < ((Class157_Sub1) this).anInt9039;
	     i_696_++) {
	    int i_697_
		= ((((Class157_Sub1) this).anIntArray9042[i_696_] * i_694_
		    + ((Class157_Sub1) this).anIntArray9040[i_696_] * i_695_)
		   >> 14);
	    ((Class157_Sub1) this).anIntArray9042[i_696_]
		= ((((Class157_Sub1) this).anIntArray9042[i_696_] * i_695_
		    - ((Class157_Sub1) this).anIntArray9040[i_696_] * i_694_)
		   >> 14);
	    ((Class157_Sub1) this).anIntArray9040[i_696_] = i_697_;
	}
	for (int i_698_ = 0; i_698_ < ((Class157_Sub1) this).anInt9077;
	     i_698_++) {
	    int i_699_
		= ((((Class157_Sub1) this).aShortArray9038[i_698_] * i_694_
		    + ((Class157_Sub1) this).aShortArray9048[i_698_] * i_695_)
		   >> 14);
	    ((Class157_Sub1) this).aShortArray9038[i_698_]
		= (short) (((((Class157_Sub1) this).aShortArray9038[i_698_]
			     * i_695_)
			    - (((Class157_Sub1) this).aShortArray9048[i_698_]
			       * i_694_))
			   >> 14);
	    ((Class157_Sub1) this).aShortArray9048[i_698_] = (short) i_699_;
	}
	method8385();
	method8367();
	((Class157_Sub1) this).aBool9046 = false;
    }
    
    public void method2036(short i, short i_700_) {
	Class165 class165
	    = ((Class157_Sub1) this).aClass173_Sub1_9068.aClass165_1984;
	for (int i_701_ = 0; i_701_ < ((Class157_Sub1) this).anInt9055;
	     i_701_++) {
	    if (((Class157_Sub1) this).aShortArray9062[i_701_] == i)
		((Class157_Sub1) this).aShortArray9062[i_701_] = i_700_;
	}
	byte i_702_ = 0;
	byte i_703_ = 0;
	if (i != -1) {
	    Class160 class160 = class165.method2093(i & 0xffff, (byte) -7);
	    i_702_ = class160.aByte1802;
	    i_703_ = class160.aByte1801;
	}
	byte i_704_ = 0;
	byte i_705_ = 0;
	if (i_700_ != -1) {
	    Class160 class160
		= class165.method2093(i_700_ & 0xffff, (byte) -80);
	    i_704_ = class160.aByte1802;
	    i_705_ = class160.aByte1801;
	    if (class160.aByte1775 != 0 || class160.aByte1776 != 0)
		((Class157_Sub1) this).aBool9073 = true;
	}
	if (i_702_ != i_704_ | i_703_ != i_705_) {
	    if (((Class157_Sub1) this).aClass348Array9078 != null) {
		for (int i_706_ = 0; i_706_ < ((Class157_Sub1) this).anInt9092;
		     i_706_++) {
		    Class348 class348
			= ((Class157_Sub1) this).aClass348Array9078[i_706_];
		    Class328 class328
			= ((Class157_Sub1) this).aClass328Array9094[i_706_];
		    ((Class328) class328).anInt3503
			= (((Class328) class328).anInt3503 & ~0xffffff
			   | ((Class649.anIntArray8420
			       [(((Class157_Sub1) this).aShortArray9057
				 [((Class348) class348).anInt3653]) & 0xffff])
			      & 0xffffff));
		}
	    }
	    method8356();
	}
    }
    
    public void method1995(int i) {
	int i_707_ = Class417.anIntArray4766[i];
	int i_708_ = Class417.anIntArray4767[i];
	for (int i_709_ = 0; i_709_ < ((Class157_Sub1) this).anInt9039;
	     i_709_++) {
	    int i_710_
		= ((((Class157_Sub1) this).anIntArray9041[i_709_] * i_707_
		    + ((Class157_Sub1) this).anIntArray9040[i_709_] * i_708_)
		   >> 14);
	    ((Class157_Sub1) this).anIntArray9041[i_709_]
		= ((((Class157_Sub1) this).anIntArray9041[i_709_] * i_708_
		    - ((Class157_Sub1) this).anIntArray9040[i_709_] * i_707_)
		   >> 14);
	    ((Class157_Sub1) this).anIntArray9040[i_709_] = i_710_;
	}
	method8385();
	((Class157_Sub1) this).aBool9046 = false;
    }
    
    public void method1872(Class157 class157, int i, int i_711_, int i_712_,
			   boolean bool) {
	Class157_Sub1 class157_sub1_713_ = (Class157_Sub1) class157;
	if (((Class157_Sub1) this).anInt9055 != 0
	    && ((Class157_Sub1) class157_sub1_713_).anInt9055 != 0) {
	    int i_714_ = ((Class157_Sub1) class157_sub1_713_).anInt9039;
	    int[] is = ((Class157_Sub1) class157_sub1_713_).anIntArray9040;
	    int[] is_715_
		= ((Class157_Sub1) class157_sub1_713_).anIntArray9041;
	    int[] is_716_
		= ((Class157_Sub1) class157_sub1_713_).anIntArray9042;
	    short[] is_717_
		= ((Class157_Sub1) class157_sub1_713_).aShortArray9048;
	    short[] is_718_
		= ((Class157_Sub1) class157_sub1_713_).aShortArray9049;
	    short[] is_719_
		= ((Class157_Sub1) class157_sub1_713_).aShortArray9038;
	    byte[] is_720_
		= ((Class157_Sub1) class157_sub1_713_).aByteArray9052;
	    short[] is_721_;
	    short[] is_722_;
	    short[] is_723_;
	    byte[] is_724_;
	    if (((Class157_Sub1) this).aClass352_9054 != null) {
		is_721_ = (((Class352) ((Class157_Sub1) this).aClass352_9054)
			   .aShortArray3796);
		is_722_ = (((Class352) ((Class157_Sub1) this).aClass352_9054)
			   .aShortArray3794);
		is_723_ = (((Class352) ((Class157_Sub1) this).aClass352_9054)
			   .aShortArray3793);
		is_724_ = (((Class352) ((Class157_Sub1) this).aClass352_9054)
			   .aByteArray3795);
	    } else {
		is_721_ = null;
		is_722_ = null;
		is_723_ = null;
		is_724_ = null;
	    }
	    short[] is_725_;
	    short[] is_726_;
	    short[] is_727_;
	    byte[] is_728_;
	    if (((Class157_Sub1) class157_sub1_713_).aClass352_9054 != null) {
		is_725_ = ((Class352) (((Class157_Sub1) class157_sub1_713_)
				       .aClass352_9054)).aShortArray3796;
		is_726_ = ((Class352) (((Class157_Sub1) class157_sub1_713_)
				       .aClass352_9054)).aShortArray3794;
		is_727_ = ((Class352) (((Class157_Sub1) class157_sub1_713_)
				       .aClass352_9054)).aShortArray3793;
		is_728_ = ((Class352) (((Class157_Sub1) class157_sub1_713_)
				       .aClass352_9054)).aByteArray3795;
	    } else {
		is_725_ = null;
		is_726_ = null;
		is_727_ = null;
		is_728_ = null;
	    }
	    int[] is_729_
		= ((Class157_Sub1) class157_sub1_713_).anIntArray9100;
	    short[] is_730_
		= ((Class157_Sub1) class157_sub1_713_).aShortArray9089;
	    if (!((Class157_Sub1) class157_sub1_713_).aBool9046)
		class157_sub1_713_.method8358();
	    int i_731_ = ((Class157_Sub1) class157_sub1_713_).anInt9093;
	    int i_732_ = ((Class157_Sub1) class157_sub1_713_).anInt9066;
	    int i_733_ = ((Class157_Sub1) class157_sub1_713_).anInt9079;
	    int i_734_ = ((Class157_Sub1) class157_sub1_713_).anInt9080;
	    int i_735_ = ((Class157_Sub1) class157_sub1_713_).anInt9081;
	    int i_736_ = ((Class157_Sub1) class157_sub1_713_).anInt9082;
	    for (int i_737_ = 0; i_737_ < ((Class157_Sub1) this).anInt9039;
		 i_737_++) {
		int i_738_
		    = ((Class157_Sub1) this).anIntArray9041[i_737_] - i_711_;
		if (i_738_ >= i_731_ && i_738_ <= i_732_) {
		    int i_739_
			= ((Class157_Sub1) this).anIntArray9040[i_737_] - i;
		    if (i_739_ >= i_733_ && i_739_ <= i_734_) {
			int i_740_
			    = (((Class157_Sub1) this).anIntArray9042[i_737_]
			       - i_712_);
			if (i_740_ >= i_735_ && i_740_ <= i_736_) {
			    int i_741_ = -1;
			    int i_742_ = (((Class157_Sub1) this).anIntArray9100
					  [i_737_]);
			    int i_743_ = (((Class157_Sub1) this).anIntArray9100
					  [i_737_ + 1]);
			    for (int i_744_ = i_742_;
				 (i_744_ < i_743_
				  && (((Class157_Sub1) this).aShortArray9089
				      [i_744_]) != 0);
				 i_744_++) {
				i_741_ = ((((Class157_Sub1) this)
					   .aShortArray9089[i_744_])
					  & 0xffff) - 1;
				if ((((Class157_Sub1) this).aByteArray9052
				     [i_741_])
				    != 0)
				    break;
			    }
			    if (i_741_ != -1) {
				for (int i_745_ = 0; i_745_ < i_714_;
				     i_745_++) {
				    if (i_739_ == is[i_745_]
					&& i_740_ == is_716_[i_745_]
					&& i_738_ == is_715_[i_745_]) {
					int i_746_ = -1;
					i_742_ = is_729_[i_745_];
					i_743_ = is_729_[i_745_ + 1];
					for (int i_747_ = i_742_;
					     (i_747_ < i_743_
					      && is_730_[i_747_] != 0);
					     i_747_++) {
					    i_746_
						= is_730_[i_747_] - 1 & 0xffff;
					    if (is_720_[i_746_] != 0)
						break;
					}
					if (i_746_ != -1) {
					    if (is_721_ == null) {
						((Class157_Sub1) this)
						    .aClass352_9054
						    = new Class352();
						is_721_
						    = ((Class352)
						       (((Class157_Sub1) this)
							.aClass352_9054))
							  .aShortArray3796
						    = (Class407.method4883
						       ((((Class157_Sub1) this)
							 .aShortArray9048),
							1071173469));
						is_722_
						    = ((Class352)
						       (((Class157_Sub1) this)
							.aClass352_9054))
							  .aShortArray3794
						    = (Class407.method4883
						       ((((Class157_Sub1) this)
							 .aShortArray9049),
							1071173469));
						is_723_
						    = ((Class352)
						       (((Class157_Sub1) this)
							.aClass352_9054))
							  .aShortArray3793
						    = (Class407.method4883
						       ((((Class157_Sub1) this)
							 .aShortArray9038),
							1071173469));
						is_724_
						    = ((Class352)
						       (((Class157_Sub1) this)
							.aClass352_9054))
							  .aByteArray3795
						    = (Class324.method4228
						       ((((Class157_Sub1) this)
							 .aByteArray9052),
							273343098));
					    }
					    if (is_725_ == null) {
						Class352 class352
						    = (((Class157_Sub1)
							class157_sub1_713_)
							   .aClass352_9054
						       = new Class352());
						is_725_
						    = ((Class352) class352)
							  .aShortArray3796
						    = (Class407.method4883
						       (is_717_, 1071173469));
						is_726_
						    = ((Class352) class352)
							  .aShortArray3794
						    = (Class407.method4883
						       (is_718_, 1071173469));
						is_727_
						    = ((Class352) class352)
							  .aShortArray3793
						    = (Class407.method4883
						       (is_719_, 1071173469));
						is_728_
						    = ((Class352) class352)
							  .aByteArray3795
						    = (Class324.method4228
						       (is_720_, -932527157));
					    }
					    short i_748_
						= (((Class157_Sub1) this)
						   .aShortArray9048[i_741_]);
					    short i_749_
						= (((Class157_Sub1) this)
						   .aShortArray9049[i_741_]);
					    short i_750_
						= (((Class157_Sub1) this)
						   .aShortArray9038[i_741_]);
					    byte i_751_
						= (((Class157_Sub1) this)
						   .aByteArray9052[i_741_]);
					    i_742_ = is_729_[i_745_];
					    i_743_ = is_729_[i_745_ + 1];
					    for (int i_752_ = i_742_;
						 i_752_ < i_743_; i_752_++) {
						int i_753_
						    = is_730_[i_752_] - 1;
						if (i_753_ == -1)
						    break;
						if (is_728_[i_753_] != 0) {
						    is_725_[i_753_] += i_748_;
						    is_726_[i_753_] += i_749_;
						    is_727_[i_753_] += i_750_;
						    is_728_[i_753_] += i_751_;
						}
					    }
					    i_748_ = is_717_[i_746_];
					    i_749_ = is_718_[i_746_];
					    i_750_ = is_719_[i_746_];
					    i_751_ = is_720_[i_746_];
					    i_742_ = (((Class157_Sub1) this)
						      .anIntArray9100[i_737_]);
					    i_743_ = (((Class157_Sub1) this)
						      .anIntArray9100
						      [i_737_ + 1]);
					    for (int i_754_ = i_742_;
						 (i_754_ < i_743_
						  && (((Class157_Sub1) this)
						      .aShortArray9089
						      [i_754_]) != 0);
						 i_754_++) {
						int i_755_
						    = (((((Class157_Sub1) this)
							 .aShortArray9089
							 [i_754_])
							& 0xffff)
						       - 1);
						if (is_724_[i_755_] != 0) {
						    is_721_[i_755_] += i_748_;
						    is_722_[i_755_] += i_749_;
						    is_723_[i_755_] += i_750_;
						    is_724_[i_755_] += i_751_;
						}
					    }
					    class157_sub1_713_.method8367();
					    method8367();
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public int method1937() {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	return ((Class157_Sub1) this).anInt9060;
    }
    
    short method8369(Class177 class177, int i, int i_756_, long l, int i_757_,
		     int i_758_, int i_759_, int i_760_, float f,
		     float f_761_) {
	int i_762_ = ((Class157_Sub1) this).anIntArray9100[i];
	int i_763_ = ((Class157_Sub1) this).anIntArray9100[i + 1];
	int i_764_ = 0;
	for (int i_765_ = i_762_; i_765_ < i_763_; i_765_++) {
	    if (((Class157_Sub1) this).aShortArray9089[i_765_] == 0) {
		i_764_ = i_765_;
		break;
	    }
	    int i_766_
		= ((((Class157_Sub1) this).aShortArray9089[i_765_] & 0xffff)
		   - 1);
	    if (((Class157_Sub1) this).aLongArray9096[i_765_] == l)
		return (short) i_766_;
	}
	((Class157_Sub1) this).aShortArray9089[i_764_]
	    = (short) (((Class157_Sub1) this).anInt9077 + 1);
	((Class157_Sub1) this).aLongArray9096[i_764_] = l;
	((Class157_Sub1) this).aShortArray9047[(((Class157_Sub1) this)
						.anInt9077)]
	    = (short) i_756_;
	((Class157_Sub1) this).aShortArray9043[(((Class157_Sub1) this)
						.anInt9077)]
	    = (short) i;
	((Class157_Sub1) this).aShortArray9048[(((Class157_Sub1) this)
						.anInt9077)]
	    = (short) i_757_;
	((Class157_Sub1) this).aShortArray9049[(((Class157_Sub1) this)
						.anInt9077)]
	    = (short) i_758_;
	((Class157_Sub1) this).aShortArray9038[(((Class157_Sub1) this)
						.anInt9077)]
	    = (short) i_759_;
	((Class157_Sub1) this).aByteArray9052[((Class157_Sub1) this).anInt9077]
	    = (byte) i_760_;
	((Class157_Sub1) this).aFloatArray9061[(((Class157_Sub1) this)
						.anInt9077)]
	    = f;
	((Class157_Sub1) this).aFloatArray9053[(((Class157_Sub1) this)
						.anInt9077)]
	    = f_761_;
	return (short) ((Class157_Sub1) this).anInt9077++;
    }
    
    public void method1947(int i, int i_767_, int i_768_) {
	for (int i_769_ = 0; i_769_ < ((Class157_Sub1) this).anInt9039;
	     i_769_++) {
	    if (i != 128)
		((Class157_Sub1) this).anIntArray9040[i_769_]
		    = ((Class157_Sub1) this).anIntArray9040[i_769_] * i >> 7;
	    if (i_767_ != 128)
		((Class157_Sub1) this).anIntArray9041[i_769_]
		    = (((Class157_Sub1) this).anIntArray9041[i_769_] * i_767_
		       >> 7);
	    if (i_768_ != 128)
		((Class157_Sub1) this).anIntArray9042[i_769_]
		    = (((Class157_Sub1) this).anIntArray9042[i_769_] * i_768_
		       >> 7);
	}
	method8385();
	((Class157_Sub1) this).aBool9046 = false;
    }
    
    public void method1904(int i, int i_770_, Class137 class137,
			   Class137 class137_771_, int i_772_, int i_773_,
			   int i_774_) {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	int i_775_ = i_772_ + ((Class157_Sub1) this).anInt9079;
	int i_776_ = i_772_ + ((Class157_Sub1) this).anInt9080;
	int i_777_ = i_774_ + ((Class157_Sub1) this).anInt9081;
	int i_778_ = i_774_ + ((Class157_Sub1) this).anInt9082;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_775_ >= 0
		&& ((i_776_ + class137.anInt1628 * 2130003981
		     >> class137.anInt1625 * 1543345989)
		    < class137.anInt1627 * -657933437)
		&& i_777_ >= 0
		&& ((i_778_ + class137.anInt1628 * 2130003981
		     >> class137.anInt1625 * 1543345989)
		    < class137.anInt1626 * 1769495707))) {
	    if (i == 4 || i == 5) {
		if (class137_771_ == null
		    || (i_775_ < 0
			|| ((i_776_ + class137_771_.anInt1628 * 2130003981
			     >> class137_771_.anInt1625 * 1543345989)
			    >= class137_771_.anInt1627 * -657933437)
			|| i_777_ < 0
			|| ((i_778_ + class137_771_.anInt1628 * 2130003981
			     >> class137_771_.anInt1625 * 1543345989)
			    >= class137_771_.anInt1626 * 1769495707)))
		    return;
	    } else {
		i_775_ >>= class137.anInt1625 * 1543345989;
		i_776_ = (i_776_ + (class137.anInt1628 * 2130003981 - 1)
			  >> class137.anInt1625 * 1543345989);
		i_777_ >>= class137.anInt1625 * 1543345989;
		i_778_ = (i_778_ + (class137.anInt1628 * 2130003981 - 1)
			  >> class137.anInt1625 * 1543345989);
		if (class137.method1669(i_775_, i_777_, (byte) 0) == i_773_
		    && class137.method1669(i_776_, i_777_, (byte) 0) == i_773_
		    && class137.method1669(i_775_, i_778_, (byte) 0) == i_773_
		    && class137.method1669(i_776_, i_778_, (byte) 0) == i_773_)
		    return;
	    }
	    if (i == 1) {
		for (int i_779_ = 0; i_779_ < ((Class157_Sub1) this).anInt9039;
		     i_779_++)
		    ((Class157_Sub1) this).anIntArray9041[i_779_]
			= (((Class157_Sub1) this).anIntArray9041[i_779_]
			   + class137.method1657(((((Class157_Sub1) this)
						   .anIntArray9040[i_779_])
						  + i_772_),
						 ((((Class157_Sub1) this)
						   .anIntArray9042[i_779_])
						  + i_774_),
						 1686217366)
			   - i_773_);
	    } else if (i == 2) {
		int i_780_ = ((Class157_Sub1) this).anInt9093;
		if (i_780_ == 0)
		    return;
		for (int i_781_ = 0; i_781_ < ((Class157_Sub1) this).anInt9039;
		     i_781_++) {
		    int i_782_ = (((Class157_Sub1) this).anIntArray9041[i_781_]
				  << 16) / i_780_;
		    if (i_782_ < i_770_)
			((Class157_Sub1) this).anIntArray9041[i_781_]
			    = (((Class157_Sub1) this).anIntArray9041[i_781_]
			       + (class137.method1657((((Class157_Sub1) this)
						       .anIntArray9040
						       [i_781_]) + i_772_,
						      (((Class157_Sub1) this)
						       .anIntArray9042
						       [i_781_]) + i_774_,
						      1404922642)
				  - i_773_) * (i_770_ - i_782_) / i_770_);
		}
	    } else if (i == 3) {
		int i_783_ = (i_770_ & 0xff) * 4;
		int i_784_ = (i_770_ >> 8 & 0xff) * 4;
		int i_785_ = (i_770_ >> 16 & 0xff) << 6;
		int i_786_ = (i_770_ >> 24 & 0xff) << 6;
		if (i_772_ - (i_783_ >> 1) < 0
		    || ((i_772_ + (i_783_ >> 1)
			 + class137.anInt1628 * 2130003981)
			>= (class137.anInt1627 * -657933437
			    << class137.anInt1625 * 1543345989))
		    || i_774_ - (i_784_ >> 1) < 0
		    || ((i_774_ + (i_784_ >> 1)
			 + class137.anInt1628 * 2130003981)
			>= (class137.anInt1626 * 1769495707
			    << class137.anInt1625 * 1543345989)))
		    return;
		method1884(class137, i_772_, i_773_, i_774_, i_783_, i_784_,
			   i_785_, i_786_);
	    } else if (i == 4) {
		int i_787_ = (((Class157_Sub1) this).anInt9066
			      - ((Class157_Sub1) this).anInt9093);
		for (int i_788_ = 0; i_788_ < ((Class157_Sub1) this).anInt9039;
		     i_788_++)
		    ((Class157_Sub1) this).anIntArray9041[i_788_]
			= (((Class157_Sub1) this).anIntArray9041[i_788_]
			   + (class137_771_.method1657((((Class157_Sub1) this)
							.anIntArray9040
							[i_788_]) + i_772_,
						       (((Class157_Sub1) this)
							.anIntArray9042
							[i_788_]) + i_774_,
						       854122005)
			      - i_773_)
			   + i_787_);
	    } else if (i == 5) {
		int i_789_ = (((Class157_Sub1) this).anInt9066
			      - ((Class157_Sub1) this).anInt9093);
		for (int i_790_ = 0; i_790_ < ((Class157_Sub1) this).anInt9039;
		     i_790_++) {
		    int i_791_ = (((Class157_Sub1) this).anIntArray9040[i_790_]
				  + i_772_);
		    int i_792_ = (((Class157_Sub1) this).anIntArray9042[i_790_]
				  + i_774_);
		    int i_793_
			= class137.method1657(i_791_, i_792_, 1220218823);
		    int i_794_
			= class137_771_.method1657(i_791_, i_792_, 1991620197);
		    int i_795_ = i_793_ - i_794_ - i_770_;
		    ((Class157_Sub1) this).anIntArray9041[i_790_]
			= ((((Class157_Sub1) this).anIntArray9041[i_790_]
			    << 8) / i_789_ * i_795_
			   >> 8) - (i_773_ - i_793_);
		}
	    }
	    method8385();
	    ((Class157_Sub1) this).aBool9046 = false;
	}
    }
    
    public void method1986(int i) {
	((Class157_Sub1) this).aShort9036 = (short) i;
	method8356();
    }
    
    void method1933() {
	/* empty */
    }
    
    void method2034() {
	/* empty */
    }
    
    void method1952() {
	/* empty */
    }
    
    public void method1865(short i, short i_796_) {
	for (int i_797_ = 0; i_797_ < ((Class157_Sub1) this).anInt9055;
	     i_797_++) {
	    if (((Class157_Sub1) this).aShortArray9057[i_797_] == i)
		((Class157_Sub1) this).aShortArray9057[i_797_] = i_796_;
	}
	if (((Class157_Sub1) this).aClass348Array9078 != null) {
	    for (int i_798_ = 0; i_798_ < ((Class157_Sub1) this).anInt9092;
		 i_798_++) {
		Class348 class348
		    = ((Class157_Sub1) this).aClass348Array9078[i_798_];
		Class328 class328
		    = ((Class157_Sub1) this).aClass328Array9094[i_798_];
		((Class328) class328).anInt3503
		    = (((Class328) class328).anInt3503 & ~0xffffff
		       | ((Class649.anIntArray8420
			   [(((Class157_Sub1) this).aShortArray9057
			     [((Class348) class348).anInt3653]) & 0xffff])
			  & 0xffffff));
	    }
	}
	method8356();
    }
    
    boolean method8370() {
	if (((Class339) ((Class157_Sub1) this).aClass339_9101).aBool3582)
	    return true;
	if ((((Class339) ((Class157_Sub1) this).aClass339_9101)
	     .anInterface41_3583)
	    == null)
	    ((Class339) ((Class157_Sub1) this).aClass339_9101)
		.anInterface41_3583
		= ((Class157_Sub1) this).aClass173_Sub1_9068.method8476(false);
	Interface41 interface41
	    = (((Class339) ((Class157_Sub1) this).aClass339_9101)
	       .anInterface41_3583);
	interface41.method311(((Class157_Sub1) this).anInt9056 * 6);
	Unsafe unsafe
	    = ((Class157_Sub1) this).aClass173_Sub1_9068.anUnsafe9221;
	if (unsafe != null) {
	    int i = ((Class157_Sub1) this).anInt9056 * 6;
	    long l = interface41.method205(0, i);
	    if (l == 0L)
		return false;
	    for (int i_799_ = 0; i_799_ < ((Class157_Sub1) this).anInt9056;
		 i_799_++) {
		unsafe.putShort(l, (((Class157_Sub1) this).aShortArray9059
				    [i_799_]));
		l += 2L;
		unsafe.putShort(l, (((Class157_Sub1) this).aShortArray9105
				    [i_799_]));
		l += 2L;
		unsafe.putShort(l, (((Class157_Sub1) this).aShortArray9091
				    [i_799_]));
		l += 2L;
	    }
	    interface41.method192();
	    ((Class339) ((Class157_Sub1) this).aClass339_9101)
		.anInterface41_3580
		= interface41;
	    ((Class339) ((Class157_Sub1) this).aClass339_9101).aBool3582
		= true;
	    ((Class157_Sub1) this).aBool9071 = true;
	    return true;
	}
	ByteBuffer bytebuffer
	    = ((Class157_Sub1) this).aClass173_Sub1_9068.aByteBuffer9222;
	bytebuffer.clear();
	for (int i = 0; i < ((Class157_Sub1) this).anInt9056; i++) {
	    bytebuffer.putShort(((Class157_Sub1) this).aShortArray9059[i]);
	    bytebuffer.putShort(((Class157_Sub1) this).aShortArray9105[i]);
	    bytebuffer.putShort(((Class157_Sub1) this).aShortArray9091[i]);
	}
	if (interface41.method197(0, bytebuffer.position(),
				  (((Class157_Sub1) this).aClass173_Sub1_9068
				   .aLong9223))) {
	    ((Class339) ((Class157_Sub1) this).aClass339_9101)
		.anInterface41_3580
		= interface41;
	    ((Class339) ((Class157_Sub1) this).aClass339_9101).aBool3582
		= true;
	    ((Class157_Sub1) this).aBool9071 = true;
	    return true;
	}
	return false;
    }
    
    boolean method1955() {
	if (((Class157_Sub1) this).anIntArrayArray9033 == null)
	    return false;
	for (int i = 0; i < ((Class157_Sub1) this).anInt9088; i++) {
	    ((Class157_Sub1) this).anIntArray9040[i] <<= 4;
	    ((Class157_Sub1) this).anIntArray9041[i] <<= 4;
	    ((Class157_Sub1) this).anIntArray9042[i] <<= 4;
	}
	((Class157_Sub1) this).anInt9103 = 0;
	((Class157_Sub1) this).anInt9104 = 0;
	((Class157_Sub1) this).anInt9031 = 0;
	return true;
    }
    
    void method1906() {
	for (int i = 0; i < ((Class157_Sub1) this).anInt9088; i++) {
	    ((Class157_Sub1) this).anIntArray9040[i]
		= ((Class157_Sub1) this).anIntArray9040[i] + 7 >> 4;
	    ((Class157_Sub1) this).anIntArray9041[i]
		= ((Class157_Sub1) this).anIntArray9041[i] + 7 >> 4;
	    ((Class157_Sub1) this).anIntArray9042[i]
		= ((Class157_Sub1) this).anIntArray9042[i] + 7 >> 4;
	}
	method8385();
	((Class157_Sub1) this).aBool9046 = false;
    }
    
    void method1956() {
	for (int i = 0; i < ((Class157_Sub1) this).anInt9088; i++) {
	    ((Class157_Sub1) this).anIntArray9040[i]
		= ((Class157_Sub1) this).anIntArray9040[i] + 7 >> 4;
	    ((Class157_Sub1) this).anIntArray9041[i]
		= ((Class157_Sub1) this).anIntArray9041[i] + 7 >> 4;
	    ((Class157_Sub1) this).anIntArray9042[i]
		= ((Class157_Sub1) this).anIntArray9042[i] + 7 >> 4;
	}
	method8385();
	((Class157_Sub1) this).aBool9046 = false;
    }
    
    void method1871() {
	for (int i = 0; i < ((Class157_Sub1) this).anInt9088; i++) {
	    ((Class157_Sub1) this).anIntArray9040[i]
		= ((Class157_Sub1) this).anIntArray9040[i] + 7 >> 4;
	    ((Class157_Sub1) this).anIntArray9041[i]
		= ((Class157_Sub1) this).anIntArray9041[i] + 7 >> 4;
	    ((Class157_Sub1) this).anIntArray9042[i]
		= ((Class157_Sub1) this).anIntArray9042[i] + 7 >> 4;
	}
	method8385();
	((Class157_Sub1) this).aBool9046 = false;
    }
    
    void method1938() {
	/* empty */
    }
    
    void method1959(int i, int[] is, int i_800_, int i_801_, int i_802_,
		    int i_803_, boolean bool) {
	int i_804_ = is.length;
	if (i == 0) {
	    i_800_ <<= 4;
	    i_801_ <<= 4;
	    i_802_ <<= 4;
	    int i_805_ = 0;
	    ((Class157_Sub1) this).anInt9103 = 0;
	    ((Class157_Sub1) this).anInt9104 = 0;
	    ((Class157_Sub1) this).anInt9031 = 0;
	    for (int i_806_ = 0; i_806_ < i_804_; i_806_++) {
		int i_807_ = is[i_806_];
		if (i_807_
		    < ((Class157_Sub1) this).anIntArrayArray9033.length) {
		    int[] is_808_
			= ((Class157_Sub1) this).anIntArrayArray9033[i_807_];
		    for (int i_809_ = 0; i_809_ < is_808_.length; i_809_++) {
			int i_810_ = is_808_[i_809_];
			((Class157_Sub1) this).anInt9103
			    += ((Class157_Sub1) this).anIntArray9040[i_810_];
			((Class157_Sub1) this).anInt9104
			    += ((Class157_Sub1) this).anIntArray9041[i_810_];
			((Class157_Sub1) this).anInt9031
			    += ((Class157_Sub1) this).anIntArray9042[i_810_];
			i_805_++;
		    }
		}
	    }
	    if (i_805_ > 0) {
		((Class157_Sub1) this).anInt9103
		    = ((Class157_Sub1) this).anInt9103 / i_805_ + i_800_;
		((Class157_Sub1) this).anInt9104
		    = ((Class157_Sub1) this).anInt9104 / i_805_ + i_801_;
		((Class157_Sub1) this).anInt9031
		    = ((Class157_Sub1) this).anInt9031 / i_805_ + i_802_;
	    } else {
		((Class157_Sub1) this).anInt9103 = i_800_;
		((Class157_Sub1) this).anInt9104 = i_801_;
		((Class157_Sub1) this).anInt9031 = i_802_;
	    }
	} else if (i == 1) {
	    i_800_ <<= 4;
	    i_801_ <<= 4;
	    i_802_ <<= 4;
	    for (int i_811_ = 0; i_811_ < i_804_; i_811_++) {
		int i_812_ = is[i_811_];
		if (i_812_
		    < ((Class157_Sub1) this).anIntArrayArray9033.length) {
		    int[] is_813_
			= ((Class157_Sub1) this).anIntArrayArray9033[i_812_];
		    for (int i_814_ = 0; i_814_ < is_813_.length; i_814_++) {
			int i_815_ = is_813_[i_814_];
			((Class157_Sub1) this).anIntArray9040[i_815_]
			    += i_800_;
			((Class157_Sub1) this).anIntArray9041[i_815_]
			    += i_801_;
			((Class157_Sub1) this).anIntArray9042[i_815_]
			    += i_802_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_816_ = 0; i_816_ < i_804_; i_816_++) {
		int i_817_ = is[i_816_];
		if (i_817_
		    < ((Class157_Sub1) this).anIntArrayArray9033.length) {
		    int[] is_818_
			= ((Class157_Sub1) this).anIntArrayArray9033[i_817_];
		    if ((i_803_ & 0x1) == 0) {
			for (int i_819_ = 0; i_819_ < is_818_.length;
			     i_819_++) {
			    int i_820_ = is_818_[i_819_];
			    ((Class157_Sub1) this).anIntArray9040[i_820_]
				-= ((Class157_Sub1) this).anInt9103;
			    ((Class157_Sub1) this).anIntArray9041[i_820_]
				-= ((Class157_Sub1) this).anInt9104;
			    ((Class157_Sub1) this).anIntArray9042[i_820_]
				-= ((Class157_Sub1) this).anInt9031;
			    if (i_802_ != 0) {
				int i_821_ = Class417.anIntArray4766[i_802_];
				int i_822_ = Class417.anIntArray4767[i_802_];
				int i_823_
				    = (((((Class157_Sub1) this).anIntArray9041
					 [i_820_]) * i_821_
					+ (((Class157_Sub1) this)
					   .anIntArray9040[i_820_]) * i_822_
					+ 16383)
				       >> 14);
				((Class157_Sub1) this).anIntArray9041[i_820_]
				    = ((((Class157_Sub1) this).anIntArray9041
					[i_820_]) * i_822_
				       - (((Class157_Sub1) this).anIntArray9040
					  [i_820_]) * i_821_
				       + 16383) >> 14;
				((Class157_Sub1) this).anIntArray9040[i_820_]
				    = i_823_;
			    }
			    if (i_800_ != 0) {
				int i_824_ = Class417.anIntArray4766[i_800_];
				int i_825_ = Class417.anIntArray4767[i_800_];
				int i_826_
				    = (((((Class157_Sub1) this).anIntArray9041
					 [i_820_]) * i_825_
					- (((Class157_Sub1) this)
					   .anIntArray9042[i_820_]) * i_824_
					+ 16383)
				       >> 14);
				((Class157_Sub1) this).anIntArray9042[i_820_]
				    = ((((Class157_Sub1) this).anIntArray9041
					[i_820_]) * i_824_
				       + (((Class157_Sub1) this).anIntArray9042
					  [i_820_]) * i_825_
				       + 16383) >> 14;
				((Class157_Sub1) this).anIntArray9041[i_820_]
				    = i_826_;
			    }
			    if (i_801_ != 0) {
				int i_827_ = Class417.anIntArray4766[i_801_];
				int i_828_ = Class417.anIntArray4767[i_801_];
				int i_829_
				    = (((((Class157_Sub1) this).anIntArray9042
					 [i_820_]) * i_827_
					+ (((Class157_Sub1) this)
					   .anIntArray9040[i_820_]) * i_828_
					+ 16383)
				       >> 14);
				((Class157_Sub1) this).anIntArray9042[i_820_]
				    = ((((Class157_Sub1) this).anIntArray9042
					[i_820_]) * i_828_
				       - (((Class157_Sub1) this).anIntArray9040
					  [i_820_]) * i_827_
				       + 16383) >> 14;
				((Class157_Sub1) this).anIntArray9040[i_820_]
				    = i_829_;
			    }
			    ((Class157_Sub1) this).anIntArray9040[i_820_]
				+= ((Class157_Sub1) this).anInt9103;
			    ((Class157_Sub1) this).anIntArray9041[i_820_]
				+= ((Class157_Sub1) this).anInt9104;
			    ((Class157_Sub1) this).anIntArray9042[i_820_]
				+= ((Class157_Sub1) this).anInt9031;
			}
		    } else {
			for (int i_830_ = 0; i_830_ < is_818_.length;
			     i_830_++) {
			    int i_831_ = is_818_[i_830_];
			    ((Class157_Sub1) this).anIntArray9040[i_831_]
				-= ((Class157_Sub1) this).anInt9103;
			    ((Class157_Sub1) this).anIntArray9041[i_831_]
				-= ((Class157_Sub1) this).anInt9104;
			    ((Class157_Sub1) this).anIntArray9042[i_831_]
				-= ((Class157_Sub1) this).anInt9031;
			    if (i_800_ != 0) {
				int i_832_ = Class417.anIntArray4766[i_800_];
				int i_833_ = Class417.anIntArray4767[i_800_];
				int i_834_
				    = (((((Class157_Sub1) this).anIntArray9041
					 [i_831_]) * i_833_
					- (((Class157_Sub1) this)
					   .anIntArray9042[i_831_]) * i_832_
					+ 16383)
				       >> 14);
				((Class157_Sub1) this).anIntArray9042[i_831_]
				    = ((((Class157_Sub1) this).anIntArray9041
					[i_831_]) * i_832_
				       + (((Class157_Sub1) this).anIntArray9042
					  [i_831_]) * i_833_
				       + 16383) >> 14;
				((Class157_Sub1) this).anIntArray9041[i_831_]
				    = i_834_;
			    }
			    if (i_802_ != 0) {
				int i_835_ = Class417.anIntArray4766[i_802_];
				int i_836_ = Class417.anIntArray4767[i_802_];
				int i_837_
				    = (((((Class157_Sub1) this).anIntArray9041
					 [i_831_]) * i_835_
					+ (((Class157_Sub1) this)
					   .anIntArray9040[i_831_]) * i_836_
					+ 16383)
				       >> 14);
				((Class157_Sub1) this).anIntArray9041[i_831_]
				    = ((((Class157_Sub1) this).anIntArray9041
					[i_831_]) * i_836_
				       - (((Class157_Sub1) this).anIntArray9040
					  [i_831_]) * i_835_
				       + 16383) >> 14;
				((Class157_Sub1) this).anIntArray9040[i_831_]
				    = i_837_;
			    }
			    if (i_801_ != 0) {
				int i_838_ = Class417.anIntArray4766[i_801_];
				int i_839_ = Class417.anIntArray4767[i_801_];
				int i_840_
				    = (((((Class157_Sub1) this).anIntArray9042
					 [i_831_]) * i_838_
					+ (((Class157_Sub1) this)
					   .anIntArray9040[i_831_]) * i_839_
					+ 16383)
				       >> 14);
				((Class157_Sub1) this).anIntArray9042[i_831_]
				    = ((((Class157_Sub1) this).anIntArray9042
					[i_831_]) * i_839_
				       - (((Class157_Sub1) this).anIntArray9040
					  [i_831_]) * i_838_
				       + 16383) >> 14;
				((Class157_Sub1) this).anIntArray9040[i_831_]
				    = i_840_;
			    }
			    ((Class157_Sub1) this).anIntArray9040[i_831_]
				+= ((Class157_Sub1) this).anInt9103;
			    ((Class157_Sub1) this).anIntArray9041[i_831_]
				+= ((Class157_Sub1) this).anInt9104;
			    ((Class157_Sub1) this).anIntArray9042[i_831_]
				+= ((Class157_Sub1) this).anInt9031;
			}
		    }
		}
	    }
	    if (bool) {
		for (int i_841_ = 0; i_841_ < i_804_; i_841_++) {
		    int i_842_ = is[i_841_];
		    if (i_842_
			< ((Class157_Sub1) this).anIntArrayArray9033.length) {
			int[] is_843_ = (((Class157_Sub1) this)
					 .anIntArrayArray9033[i_842_]);
			for (int i_844_ = 0; i_844_ < is_843_.length;
			     i_844_++) {
			    int i_845_ = is_843_[i_844_];
			    int i_846_ = (((Class157_Sub1) this).anIntArray9100
					  [i_845_]);
			    int i_847_ = (((Class157_Sub1) this).anIntArray9100
					  [i_845_ + 1]);
			    for (int i_848_ = i_846_;
				 (i_848_ < i_847_
				  && (((Class157_Sub1) this).aShortArray9089
				      [i_848_]) != 0);
				 i_848_++) {
				int i_849_ = (((((Class157_Sub1) this)
						.aShortArray9089[i_848_])
					       & 0xffff)
					      - 1);
				if (i_802_ != 0) {
				    int i_850_
					= Class417.anIntArray4766[i_802_];
				    int i_851_
					= Class417.anIntArray4767[i_802_];
				    int i_852_
					= (((((Class157_Sub1) this)
					     .aShortArray9049[i_849_]) * i_850_
					    + ((((Class157_Sub1) this)
						.aShortArray9048[i_849_])
					       * i_851_)
					    + 16383)
					   >> 14);
				    ((Class157_Sub1) this).aShortArray9049
					[i_849_]
					= (short) ((((((Class157_Sub1) this)
						      .aShortArray9049[i_849_])
						     * i_851_)
						    - (((Class157_Sub1) this)
						       .aShortArray9048
						       [i_849_]) * i_850_
						    + 16383)
						   >> 14);
				    ((Class157_Sub1) this).aShortArray9048
					[i_849_]
					= (short) i_852_;
				}
				if (i_800_ != 0) {
				    int i_853_
					= Class417.anIntArray4766[i_800_];
				    int i_854_
					= Class417.anIntArray4767[i_800_];
				    int i_855_
					= (((((Class157_Sub1) this)
					     .aShortArray9049[i_849_]) * i_854_
					    - ((((Class157_Sub1) this)
						.aShortArray9038[i_849_])
					       * i_853_)
					    + 16383)
					   >> 14);
				    ((Class157_Sub1) this).aShortArray9038
					[i_849_]
					= (short) ((((((Class157_Sub1) this)
						      .aShortArray9049[i_849_])
						     * i_853_)
						    + (((Class157_Sub1) this)
						       .aShortArray9038
						       [i_849_]) * i_854_
						    + 16383)
						   >> 14);
				    ((Class157_Sub1) this).aShortArray9049
					[i_849_]
					= (short) i_855_;
				}
				if (i_801_ != 0) {
				    int i_856_
					= Class417.anIntArray4766[i_801_];
				    int i_857_
					= Class417.anIntArray4767[i_801_];
				    int i_858_
					= (((((Class157_Sub1) this)
					     .aShortArray9038[i_849_]) * i_856_
					    + ((((Class157_Sub1) this)
						.aShortArray9048[i_849_])
					       * i_857_)
					    + 16383)
					   >> 14);
				    ((Class157_Sub1) this).aShortArray9038
					[i_849_]
					= (short) ((((((Class157_Sub1) this)
						      .aShortArray9038[i_849_])
						     * i_857_)
						    - (((Class157_Sub1) this)
						       .aShortArray9048
						       [i_849_]) * i_856_
						    + 16383)
						   >> 14);
				    ((Class157_Sub1) this).aShortArray9048
					[i_849_]
					= (short) i_858_;
				}
			    }
			}
		    }
		}
		method8367();
	    }
	} else if (i == 3) {
	    for (int i_859_ = 0; i_859_ < i_804_; i_859_++) {
		int i_860_ = is[i_859_];
		if (i_860_
		    < ((Class157_Sub1) this).anIntArrayArray9033.length) {
		    int[] is_861_
			= ((Class157_Sub1) this).anIntArrayArray9033[i_860_];
		    for (int i_862_ = 0; i_862_ < is_861_.length; i_862_++) {
			int i_863_ = is_861_[i_862_];
			((Class157_Sub1) this).anIntArray9040[i_863_]
			    -= ((Class157_Sub1) this).anInt9103;
			((Class157_Sub1) this).anIntArray9041[i_863_]
			    -= ((Class157_Sub1) this).anInt9104;
			((Class157_Sub1) this).anIntArray9042[i_863_]
			    -= ((Class157_Sub1) this).anInt9031;
			((Class157_Sub1) this).anIntArray9040[i_863_]
			    = (((Class157_Sub1) this).anIntArray9040[i_863_]
			       * i_800_) >> 7;
			((Class157_Sub1) this).anIntArray9041[i_863_]
			    = (((Class157_Sub1) this).anIntArray9041[i_863_]
			       * i_801_) >> 7;
			((Class157_Sub1) this).anIntArray9042[i_863_]
			    = (((Class157_Sub1) this).anIntArray9042[i_863_]
			       * i_802_) >> 7;
			((Class157_Sub1) this).anIntArray9040[i_863_]
			    += ((Class157_Sub1) this).anInt9103;
			((Class157_Sub1) this).anIntArray9041[i_863_]
			    += ((Class157_Sub1) this).anInt9104;
			((Class157_Sub1) this).anIntArray9042[i_863_]
			    += ((Class157_Sub1) this).anInt9031;
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class157_Sub1) this).anIntArrayArray9063 != null) {
		boolean bool_864_ = false;
		for (int i_865_ = 0; i_865_ < i_804_; i_865_++) {
		    int i_866_ = is[i_865_];
		    if (i_866_
			< ((Class157_Sub1) this).anIntArrayArray9063.length) {
			int[] is_867_ = (((Class157_Sub1) this)
					 .anIntArrayArray9063[i_866_]);
			for (int i_868_ = 0; i_868_ < is_867_.length;
			     i_868_++) {
			    int i_869_ = is_867_[i_868_];
			    int i_870_ = (((((Class157_Sub1) this)
					    .aByteArray9058[i_869_])
					   & 0xff)
					  + i_800_ * 8);
			    if (i_870_ < 0)
				i_870_ = 0;
			    else if (i_870_ > 255)
				i_870_ = 255;
			    ((Class157_Sub1) this).aByteArray9058[i_869_]
				= (byte) i_870_;
			}
			bool_864_ = bool_864_ | is_867_.length > 0;
		    }
		}
		if (bool_864_) {
		    if (((Class157_Sub1) this).aClass348Array9078 != null) {
			for (int i_871_ = 0;
			     i_871_ < ((Class157_Sub1) this).anInt9092;
			     i_871_++) {
			    Class348 class348 = (((Class157_Sub1) this)
						 .aClass348Array9078[i_871_]);
			    Class328 class328 = (((Class157_Sub1) this)
						 .aClass328Array9094[i_871_]);
			    ((Class328) class328).anInt3503
				= (((Class328) class328).anInt3503 & 0xffffff
				   | 255 - ((((Class157_Sub1) this)
					     .aByteArray9058
					     [((Class348) class348).anInt3653])
					    & 0xff) << 24);
			}
		    }
		    method8356();
		}
	    }
	} else if (i == 7) {
	    if (((Class157_Sub1) this).anIntArrayArray9063 != null) {
		boolean bool_872_ = false;
		for (int i_873_ = 0; i_873_ < i_804_; i_873_++) {
		    int i_874_ = is[i_873_];
		    if (i_874_
			< ((Class157_Sub1) this).anIntArrayArray9063.length) {
			int[] is_875_ = (((Class157_Sub1) this)
					 .anIntArrayArray9063[i_874_]);
			for (int i_876_ = 0; i_876_ < is_875_.length;
			     i_876_++) {
			    int i_877_ = is_875_[i_876_];
			    int i_878_ = ((((Class157_Sub1) this)
					   .aShortArray9057[i_877_])
					  & 0xffff);
			    int i_879_ = i_878_ >> 10 & 0x3f;
			    int i_880_ = i_878_ >> 7 & 0x7;
			    int i_881_ = i_878_ & 0x7f;
			    i_879_ = i_879_ + i_800_ & 0x3f;
			    i_880_ += i_801_ / 4;
			    if (i_880_ < 0)
				i_880_ = 0;
			    else if (i_880_ > 7)
				i_880_ = 7;
			    i_881_ += i_802_;
			    if (i_881_ < 0)
				i_881_ = 0;
			    else if (i_881_ > 127)
				i_881_ = 127;
			    ((Class157_Sub1) this).aShortArray9057[i_877_]
				= (short) (i_879_ << 10 | i_880_ << 7
					   | i_881_);
			}
			bool_872_ = bool_872_ | is_875_.length > 0;
		    }
		}
		if (bool_872_) {
		    if (((Class157_Sub1) this).aClass348Array9078 != null) {
			for (int i_882_ = 0;
			     i_882_ < ((Class157_Sub1) this).anInt9092;
			     i_882_++) {
			    Class348 class348 = (((Class157_Sub1) this)
						 .aClass348Array9078[i_882_]);
			    Class328 class328 = (((Class157_Sub1) this)
						 .aClass328Array9094[i_882_]);
			    ((Class328) class328).anInt3503
				= (((Class328) class328).anInt3503 & ~0xffffff
				   | (Class649.anIntArray8420
				      [((((Class157_Sub1) this).aShortArray9057
					 [((Class348) class348).anInt3653])
					& 0xffff)]) & 0xffffff);
			}
		    }
		    method8356();
		}
	    }
	} else if (i == 8) {
	    if (((Class157_Sub1) this).anIntArrayArray9095 != null) {
		for (int i_883_ = 0; i_883_ < i_804_; i_883_++) {
		    int i_884_ = is[i_883_];
		    if (i_884_
			< ((Class157_Sub1) this).anIntArrayArray9095.length) {
			int[] is_885_ = (((Class157_Sub1) this)
					 .anIntArrayArray9095[i_884_]);
			for (int i_886_ = 0; i_886_ < is_885_.length;
			     i_886_++) {
			    Class328 class328
				= (((Class157_Sub1) this).aClass328Array9094
				   [is_885_[i_886_]]);
			    ((Class328) class328).anInt3508 += i_800_;
			    ((Class328) class328).anInt3507 += i_801_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class157_Sub1) this).anIntArrayArray9095 != null) {
		for (int i_887_ = 0; i_887_ < i_804_; i_887_++) {
		    int i_888_ = is[i_887_];
		    if (i_888_
			< ((Class157_Sub1) this).anIntArrayArray9095.length) {
			int[] is_889_ = (((Class157_Sub1) this)
					 .anIntArrayArray9095[i_888_]);
			for (int i_890_ = 0; i_890_ < is_889_.length;
			     i_890_++) {
			    Class328 class328
				= (((Class157_Sub1) this).aClass328Array9094
				   [is_889_[i_890_]]);
			    ((Class328) class328).anInt3504
				= (((Class328) class328).anInt3504 * i_800_
				   >> 7);
			    ((Class328) class328).anInt3506
				= (((Class328) class328).anInt3506 * i_801_
				   >> 7);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class157_Sub1) this).anIntArrayArray9095 != null) {
		for (int i_891_ = 0; i_891_ < i_804_; i_891_++) {
		    int i_892_ = is[i_891_];
		    if (i_892_
			< ((Class157_Sub1) this).anIntArrayArray9095.length) {
			int[] is_893_ = (((Class157_Sub1) this)
					 .anIntArrayArray9095[i_892_]);
			for (int i_894_ = 0; i_894_ < is_893_.length;
			     i_894_++) {
			    Class328 class328
				= (((Class157_Sub1) this).aClass328Array9094
				   [is_893_[i_894_]]);
			    ((Class328) class328).anInt3505
				= (((Class328) class328).anInt3505 + i_800_
				   & 0x3fff);
			}
		    }
		}
	    }
	}
    }
    
    void method1918(int i, int[] is, int i_895_, int i_896_, int i_897_,
		    boolean bool, int i_898_, int[] is_899_) {
	int i_900_ = is.length;
	if (i == 0) {
	    i_895_ <<= 4;
	    i_896_ <<= 4;
	    i_897_ <<= 4;
	    int i_901_ = 0;
	    ((Class157_Sub1) this).anInt9103 = 0;
	    ((Class157_Sub1) this).anInt9104 = 0;
	    ((Class157_Sub1) this).anInt9031 = 0;
	    for (int i_902_ = 0; i_902_ < i_900_; i_902_++) {
		int i_903_ = is[i_902_];
		if (i_903_
		    < ((Class157_Sub1) this).anIntArrayArray9033.length) {
		    int[] is_904_
			= ((Class157_Sub1) this).anIntArrayArray9033[i_903_];
		    for (int i_905_ = 0; i_905_ < is_904_.length; i_905_++) {
			int i_906_ = is_904_[i_905_];
			if (((Class157_Sub1) this).aShortArray9044 == null
			    || (i_898_ & (((Class157_Sub1) this)
					  .aShortArray9044[i_906_])) != 0) {
			    ((Class157_Sub1) this).anInt9103
				+= (((Class157_Sub1) this).anIntArray9040
				    [i_906_]);
			    ((Class157_Sub1) this).anInt9104
				+= (((Class157_Sub1) this).anIntArray9041
				    [i_906_]);
			    ((Class157_Sub1) this).anInt9031
				+= (((Class157_Sub1) this).anIntArray9042
				    [i_906_]);
			    i_901_++;
			}
		    }
		}
	    }
	    if (i_901_ > 0) {
		((Class157_Sub1) this).anInt9103
		    = ((Class157_Sub1) this).anInt9103 / i_901_ + i_895_;
		((Class157_Sub1) this).anInt9104
		    = ((Class157_Sub1) this).anInt9104 / i_901_ + i_896_;
		((Class157_Sub1) this).anInt9031
		    = ((Class157_Sub1) this).anInt9031 / i_901_ + i_897_;
		((Class157_Sub1) this).aBool9106 = true;
	    } else {
		((Class157_Sub1) this).anInt9103 = i_895_;
		((Class157_Sub1) this).anInt9104 = i_896_;
		((Class157_Sub1) this).anInt9031 = i_897_;
	    }
	} else if (i == 1) {
	    if (is_899_ != null) {
		int i_907_ = ((is_899_[0] * i_895_ + is_899_[1] * i_896_
			       + is_899_[2] * i_897_ + 8192)
			      >> 14);
		int i_908_ = ((is_899_[3] * i_895_ + is_899_[4] * i_896_
			       + is_899_[5] * i_897_ + 8192)
			      >> 14);
		int i_909_ = ((is_899_[6] * i_895_ + is_899_[7] * i_896_
			       + is_899_[8] * i_897_ + 8192)
			      >> 14);
		i_895_ = i_907_;
		i_896_ = i_908_;
		i_897_ = i_909_;
	    }
	    i_895_ <<= 4;
	    i_896_ <<= 4;
	    i_897_ <<= 4;
	    for (int i_910_ = 0; i_910_ < i_900_; i_910_++) {
		int i_911_ = is[i_910_];
		if (i_911_
		    < ((Class157_Sub1) this).anIntArrayArray9033.length) {
		    int[] is_912_
			= ((Class157_Sub1) this).anIntArrayArray9033[i_911_];
		    for (int i_913_ = 0; i_913_ < is_912_.length; i_913_++) {
			int i_914_ = is_912_[i_913_];
			if (((Class157_Sub1) this).aShortArray9044 == null
			    || (i_898_ & (((Class157_Sub1) this)
					  .aShortArray9044[i_914_])) != 0) {
			    ((Class157_Sub1) this).anIntArray9040[i_914_]
				+= i_895_;
			    ((Class157_Sub1) this).anIntArray9041[i_914_]
				+= i_896_;
			    ((Class157_Sub1) this).anIntArray9042[i_914_]
				+= i_897_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_899_ != null) {
		int i_915_ = is_899_[9] << 4;
		int i_916_ = is_899_[10] << 4;
		int i_917_ = is_899_[11] << 4;
		int i_918_ = is_899_[12] << 4;
		int i_919_ = is_899_[13] << 4;
		int i_920_ = is_899_[14] << 4;
		if (((Class157_Sub1) this).aBool9106) {
		    int i_921_
			= ((is_899_[0] * ((Class157_Sub1) this).anInt9103
			    + is_899_[3] * ((Class157_Sub1) this).anInt9104
			    + is_899_[6] * ((Class157_Sub1) this).anInt9031
			    + 8192)
			   >> 14);
		    int i_922_
			= ((is_899_[1] * ((Class157_Sub1) this).anInt9103
			    + is_899_[4] * ((Class157_Sub1) this).anInt9104
			    + is_899_[7] * ((Class157_Sub1) this).anInt9031
			    + 8192)
			   >> 14);
		    int i_923_
			= ((is_899_[2] * ((Class157_Sub1) this).anInt9103
			    + is_899_[5] * ((Class157_Sub1) this).anInt9104
			    + is_899_[8] * ((Class157_Sub1) this).anInt9031
			    + 8192)
			   >> 14);
		    i_921_ += i_918_;
		    i_922_ += i_919_;
		    i_923_ += i_920_;
		    ((Class157_Sub1) this).anInt9103 = i_921_;
		    ((Class157_Sub1) this).anInt9104 = i_922_;
		    ((Class157_Sub1) this).anInt9031 = i_923_;
		    ((Class157_Sub1) this).aBool9106 = false;
		}
		int[] is_924_ = new int[9];
		int i_925_ = Class417.anIntArray4767[i_895_];
		int i_926_ = Class417.anIntArray4766[i_895_];
		int i_927_ = Class417.anIntArray4767[i_896_];
		int i_928_ = Class417.anIntArray4766[i_896_];
		int i_929_ = Class417.anIntArray4767[i_897_];
		int i_930_ = Class417.anIntArray4766[i_897_];
		int i_931_ = i_926_ * i_929_ + 8192 >> 14;
		int i_932_ = i_926_ * i_930_ + 8192 >> 14;
		is_924_[0] = i_927_ * i_929_ + i_928_ * i_932_ + 8192 >> 14;
		is_924_[1] = -i_927_ * i_930_ + i_928_ * i_931_ + 8192 >> 14;
		is_924_[2] = i_928_ * i_925_ + 8192 >> 14;
		is_924_[3] = i_925_ * i_930_ + 8192 >> 14;
		is_924_[4] = i_925_ * i_929_ + 8192 >> 14;
		is_924_[5] = -i_926_;
		is_924_[6] = -i_928_ * i_929_ + i_927_ * i_932_ + 8192 >> 14;
		is_924_[7] = i_928_ * i_930_ + i_927_ * i_931_ + 8192 >> 14;
		is_924_[8] = i_927_ * i_925_ + 8192 >> 14;
		int i_933_ = ((is_924_[0] * -((Class157_Sub1) this).anInt9103
			       + is_924_[1] * -((Class157_Sub1) this).anInt9104
			       + is_924_[2] * -((Class157_Sub1) this).anInt9031
			       + 8192)
			      >> 14);
		int i_934_ = ((is_924_[3] * -((Class157_Sub1) this).anInt9103
			       + is_924_[4] * -((Class157_Sub1) this).anInt9104
			       + is_924_[5] * -((Class157_Sub1) this).anInt9031
			       + 8192)
			      >> 14);
		int i_935_ = ((is_924_[6] * -((Class157_Sub1) this).anInt9103
			       + is_924_[7] * -((Class157_Sub1) this).anInt9104
			       + is_924_[8] * -((Class157_Sub1) this).anInt9031
			       + 8192)
			      >> 14);
		int i_936_ = i_933_ + ((Class157_Sub1) this).anInt9103;
		int i_937_ = i_934_ + ((Class157_Sub1) this).anInt9104;
		int i_938_ = i_935_ + ((Class157_Sub1) this).anInt9031;
		int[] is_939_ = new int[9];
		for (int i_940_ = 0; i_940_ < 3; i_940_++) {
		    for (int i_941_ = 0; i_941_ < 3; i_941_++) {
			int i_942_ = 0;
			for (int i_943_ = 0; i_943_ < 3; i_943_++)
			    i_942_ += (is_924_[i_940_ * 3 + i_943_]
				       * is_899_[i_941_ * 3 + i_943_]);
			is_939_[i_940_ * 3 + i_941_] = i_942_ + 8192 >> 14;
		    }
		}
		int i_944_ = ((is_924_[0] * i_918_ + is_924_[1] * i_919_
			       + is_924_[2] * i_920_ + 8192)
			      >> 14);
		int i_945_ = ((is_924_[3] * i_918_ + is_924_[4] * i_919_
			       + is_924_[5] * i_920_ + 8192)
			      >> 14);
		int i_946_ = ((is_924_[6] * i_918_ + is_924_[7] * i_919_
			       + is_924_[8] * i_920_ + 8192)
			      >> 14);
		i_944_ += i_936_;
		i_945_ += i_937_;
		i_946_ += i_938_;
		int[] is_947_ = new int[9];
		for (int i_948_ = 0; i_948_ < 3; i_948_++) {
		    for (int i_949_ = 0; i_949_ < 3; i_949_++) {
			int i_950_ = 0;
			for (int i_951_ = 0; i_951_ < 3; i_951_++)
			    i_950_ += (is_899_[i_948_ * 3 + i_951_]
				       * is_939_[i_949_ + i_951_ * 3]);
			is_947_[i_948_ * 3 + i_949_] = i_950_ + 8192 >> 14;
		    }
		}
		int i_952_ = ((is_899_[0] * i_944_ + is_899_[1] * i_945_
			       + is_899_[2] * i_946_ + 8192)
			      >> 14);
		int i_953_ = ((is_899_[3] * i_944_ + is_899_[4] * i_945_
			       + is_899_[5] * i_946_ + 8192)
			      >> 14);
		int i_954_ = ((is_899_[6] * i_944_ + is_899_[7] * i_945_
			       + is_899_[8] * i_946_ + 8192)
			      >> 14);
		i_952_ += i_915_;
		i_953_ += i_916_;
		i_954_ += i_917_;
		for (int i_955_ = 0; i_955_ < i_900_; i_955_++) {
		    int i_956_ = is[i_955_];
		    if (i_956_
			< ((Class157_Sub1) this).anIntArrayArray9033.length) {
			int[] is_957_ = (((Class157_Sub1) this)
					 .anIntArrayArray9033[i_956_]);
			for (int i_958_ = 0; i_958_ < is_957_.length;
			     i_958_++) {
			    int i_959_ = is_957_[i_958_];
			    if (((Class157_Sub1) this).aShortArray9044 == null
				|| ((i_898_ & (((Class157_Sub1) this)
					       .aShortArray9044[i_959_]))
				    != 0)) {
				int i_960_
				    = (is_947_[0] * (((Class157_Sub1) this)
						     .anIntArray9040[i_959_])
				       + is_947_[1] * (((Class157_Sub1) this)
						       .anIntArray9041[i_959_])
				       + is_947_[2] * (((Class157_Sub1) this)
						       .anIntArray9042[i_959_])
				       + 8192) >> 14;
				int i_961_
				    = (is_947_[3] * (((Class157_Sub1) this)
						     .anIntArray9040[i_959_])
				       + is_947_[4] * (((Class157_Sub1) this)
						       .anIntArray9041[i_959_])
				       + is_947_[5] * (((Class157_Sub1) this)
						       .anIntArray9042[i_959_])
				       + 8192) >> 14;
				int i_962_
				    = (is_947_[6] * (((Class157_Sub1) this)
						     .anIntArray9040[i_959_])
				       + is_947_[7] * (((Class157_Sub1) this)
						       .anIntArray9041[i_959_])
				       + is_947_[8] * (((Class157_Sub1) this)
						       .anIntArray9042[i_959_])
				       + 8192) >> 14;
				i_960_ += i_952_;
				i_961_ += i_953_;
				i_962_ += i_954_;
				((Class157_Sub1) this).anIntArray9040[i_959_]
				    = i_960_;
				((Class157_Sub1) this).anIntArray9041[i_959_]
				    = i_961_;
				((Class157_Sub1) this).anIntArray9042[i_959_]
				    = i_962_;
			    }
			}
		    }
		}
	    } else {
		for (int i_963_ = 0; i_963_ < i_900_; i_963_++) {
		    int i_964_ = is[i_963_];
		    if (i_964_
			< ((Class157_Sub1) this).anIntArrayArray9033.length) {
			int[] is_965_ = (((Class157_Sub1) this)
					 .anIntArrayArray9033[i_964_]);
			for (int i_966_ = 0; i_966_ < is_965_.length;
			     i_966_++) {
			    int i_967_ = is_965_[i_966_];
			    if (((Class157_Sub1) this).aShortArray9044 == null
				|| ((i_898_ & (((Class157_Sub1) this)
					       .aShortArray9044[i_967_]))
				    != 0)) {
				((Class157_Sub1) this).anIntArray9040[i_967_]
				    -= ((Class157_Sub1) this).anInt9103;
				((Class157_Sub1) this).anIntArray9041[i_967_]
				    -= ((Class157_Sub1) this).anInt9104;
				((Class157_Sub1) this).anIntArray9042[i_967_]
				    -= ((Class157_Sub1) this).anInt9031;
				if (i_897_ != 0) {
				    int i_968_
					= Class417.anIntArray4766[i_897_];
				    int i_969_
					= Class417.anIntArray4767[i_897_];
				    int i_970_
					= ((((Class157_Sub1) this)
					    .anIntArray9041[i_967_]) * i_968_
					   + (((Class157_Sub1) this)
					      .anIntArray9040[i_967_]) * i_969_
					   + 16383) >> 14;
				    ((Class157_Sub1) this).anIntArray9041
					[i_967_]
					= ((((Class157_Sub1) this)
					    .anIntArray9041[i_967_]) * i_969_
					   - (((Class157_Sub1) this)
					      .anIntArray9040[i_967_]) * i_968_
					   + 16383) >> 14;
				    ((Class157_Sub1) this).anIntArray9040
					[i_967_]
					= i_970_;
				}
				if (i_895_ != 0) {
				    int i_971_
					= Class417.anIntArray4766[i_895_];
				    int i_972_
					= Class417.anIntArray4767[i_895_];
				    int i_973_
					= ((((Class157_Sub1) this)
					    .anIntArray9041[i_967_]) * i_972_
					   - (((Class157_Sub1) this)
					      .anIntArray9042[i_967_]) * i_971_
					   + 16383) >> 14;
				    ((Class157_Sub1) this).anIntArray9042
					[i_967_]
					= ((((Class157_Sub1) this)
					    .anIntArray9041[i_967_]) * i_971_
					   + (((Class157_Sub1) this)
					      .anIntArray9042[i_967_]) * i_972_
					   + 16383) >> 14;
				    ((Class157_Sub1) this).anIntArray9041
					[i_967_]
					= i_973_;
				}
				if (i_896_ != 0) {
				    int i_974_
					= Class417.anIntArray4766[i_896_];
				    int i_975_
					= Class417.anIntArray4767[i_896_];
				    int i_976_
					= ((((Class157_Sub1) this)
					    .anIntArray9042[i_967_]) * i_974_
					   + (((Class157_Sub1) this)
					      .anIntArray9040[i_967_]) * i_975_
					   + 16383) >> 14;
				    ((Class157_Sub1) this).anIntArray9042
					[i_967_]
					= ((((Class157_Sub1) this)
					    .anIntArray9042[i_967_]) * i_975_
					   - (((Class157_Sub1) this)
					      .anIntArray9040[i_967_]) * i_974_
					   + 16383) >> 14;
				    ((Class157_Sub1) this).anIntArray9040
					[i_967_]
					= i_976_;
				}
				((Class157_Sub1) this).anIntArray9040[i_967_]
				    += ((Class157_Sub1) this).anInt9103;
				((Class157_Sub1) this).anIntArray9041[i_967_]
				    += ((Class157_Sub1) this).anInt9104;
				((Class157_Sub1) this).anIntArray9042[i_967_]
				    += ((Class157_Sub1) this).anInt9031;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_977_ = 0; i_977_ < i_900_; i_977_++) {
			int i_978_ = is[i_977_];
			if (i_978_ < (((Class157_Sub1) this)
				      .anIntArrayArray9033).length) {
			    int[] is_979_ = (((Class157_Sub1) this)
					     .anIntArrayArray9033[i_978_]);
			    for (int i_980_ = 0; i_980_ < is_979_.length;
				 i_980_++) {
				int i_981_ = is_979_[i_980_];
				if ((((Class157_Sub1) this).aShortArray9044
				     == null)
				    || ((i_898_ & (((Class157_Sub1) this)
						   .aShortArray9044[i_981_]))
					!= 0)) {
				    int i_982_ = (((Class157_Sub1) this)
						  .anIntArray9100[i_981_]);
				    int i_983_ = (((Class157_Sub1) this)
						  .anIntArray9100[i_981_ + 1]);
				    for (int i_984_ = i_982_;
					 (i_984_ < i_983_
					  && (((Class157_Sub1) this)
					      .aShortArray9089[i_984_]) != 0);
					 i_984_++) {
					int i_985_
					    = (((((Class157_Sub1) this)
						 .aShortArray9089[i_984_])
						& 0xffff)
					       - 1);
					if (i_897_ != 0) {
					    int i_986_
						= (Class417.anIntArray4766
						   [i_897_]);
					    int i_987_
						= (Class417.anIntArray4767
						   [i_897_]);
					    int i_988_
						= ((((((Class157_Sub1) this)
						      .aShortArray9049[i_985_])
						     * i_986_)
						    + (((Class157_Sub1) this)
						       .aShortArray9048
						       [i_985_]) * i_987_
						    + 16383)
						   >> 14);
					    ((Class157_Sub1) this)
						.aShortArray9049[i_985_]
						= (short) (((((Class157_Sub1)
							      this)
							     .aShortArray9049
							     [i_985_]) * i_987_
							    - (((Class157_Sub1)
								this)
							       .aShortArray9048
							       [i_985_]) * i_986_
							    + 16383)
							   >> 14);
					    ((Class157_Sub1) this)
						.aShortArray9048[i_985_]
						= (short) i_988_;
					}
					if (i_895_ != 0) {
					    int i_989_
						= (Class417.anIntArray4766
						   [i_895_]);
					    int i_990_
						= (Class417.anIntArray4767
						   [i_895_]);
					    int i_991_
						= ((((((Class157_Sub1) this)
						      .aShortArray9049[i_985_])
						     * i_990_)
						    - (((Class157_Sub1) this)
						       .aShortArray9038
						       [i_985_]) * i_989_
						    + 16383)
						   >> 14);
					    ((Class157_Sub1) this)
						.aShortArray9038[i_985_]
						= (short) (((((Class157_Sub1)
							      this)
							     .aShortArray9049
							     [i_985_]) * i_989_
							    + (((Class157_Sub1)
								this)
							       .aShortArray9038
							       [i_985_]) * i_990_
							    + 16383)
							   >> 14);
					    ((Class157_Sub1) this)
						.aShortArray9049[i_985_]
						= (short) i_991_;
					}
					if (i_896_ != 0) {
					    int i_992_
						= (Class417.anIntArray4766
						   [i_896_]);
					    int i_993_
						= (Class417.anIntArray4767
						   [i_896_]);
					    int i_994_
						= ((((((Class157_Sub1) this)
						      .aShortArray9038[i_985_])
						     * i_992_)
						    + (((Class157_Sub1) this)
						       .aShortArray9048
						       [i_985_]) * i_993_
						    + 16383)
						   >> 14);
					    ((Class157_Sub1) this)
						.aShortArray9038[i_985_]
						= (short) (((((Class157_Sub1)
							      this)
							     .aShortArray9038
							     [i_985_]) * i_993_
							    - (((Class157_Sub1)
								this)
							       .aShortArray9048
							       [i_985_]) * i_992_
							    + 16383)
							   >> 14);
					    ((Class157_Sub1) this)
						.aShortArray9048[i_985_]
						= (short) i_994_;
					}
				    }
				}
			    }
			}
		    }
		    method8367();
		}
	    }
	} else if (i == 3) {
	    if (is_899_ != null) {
		int i_995_ = is_899_[9] << 4;
		int i_996_ = is_899_[10] << 4;
		int i_997_ = is_899_[11] << 4;
		int i_998_ = is_899_[12] << 4;
		int i_999_ = is_899_[13] << 4;
		int i_1000_ = is_899_[14] << 4;
		if (((Class157_Sub1) this).aBool9106) {
		    int i_1001_
			= ((is_899_[0] * ((Class157_Sub1) this).anInt9103
			    + is_899_[3] * ((Class157_Sub1) this).anInt9104
			    + is_899_[6] * ((Class157_Sub1) this).anInt9031
			    + 8192)
			   >> 14);
		    int i_1002_
			= ((is_899_[1] * ((Class157_Sub1) this).anInt9103
			    + is_899_[4] * ((Class157_Sub1) this).anInt9104
			    + is_899_[7] * ((Class157_Sub1) this).anInt9031
			    + 8192)
			   >> 14);
		    int i_1003_
			= ((is_899_[2] * ((Class157_Sub1) this).anInt9103
			    + is_899_[5] * ((Class157_Sub1) this).anInt9104
			    + is_899_[8] * ((Class157_Sub1) this).anInt9031
			    + 8192)
			   >> 14);
		    i_1001_ += i_998_;
		    i_1002_ += i_999_;
		    i_1003_ += i_1000_;
		    ((Class157_Sub1) this).anInt9103 = i_1001_;
		    ((Class157_Sub1) this).anInt9104 = i_1002_;
		    ((Class157_Sub1) this).anInt9031 = i_1003_;
		    ((Class157_Sub1) this).aBool9106 = false;
		}
		int i_1004_ = i_895_ << 15 >> 7;
		int i_1005_ = i_896_ << 15 >> 7;
		int i_1006_ = i_897_ << 15 >> 7;
		int i_1007_
		    = i_1004_ * -((Class157_Sub1) this).anInt9103 + 8192 >> 14;
		int i_1008_
		    = i_1005_ * -((Class157_Sub1) this).anInt9104 + 8192 >> 14;
		int i_1009_
		    = i_1006_ * -((Class157_Sub1) this).anInt9031 + 8192 >> 14;
		int i_1010_ = i_1007_ + ((Class157_Sub1) this).anInt9103;
		int i_1011_ = i_1008_ + ((Class157_Sub1) this).anInt9104;
		int i_1012_ = i_1009_ + ((Class157_Sub1) this).anInt9031;
		int[] is_1013_ = new int[9];
		is_1013_[0] = i_1004_ * is_899_[0] + 8192 >> 14;
		is_1013_[1] = i_1004_ * is_899_[3] + 8192 >> 14;
		is_1013_[2] = i_1004_ * is_899_[6] + 8192 >> 14;
		is_1013_[3] = i_1005_ * is_899_[1] + 8192 >> 14;
		is_1013_[4] = i_1005_ * is_899_[4] + 8192 >> 14;
		is_1013_[5] = i_1005_ * is_899_[7] + 8192 >> 14;
		is_1013_[6] = i_1006_ * is_899_[2] + 8192 >> 14;
		is_1013_[7] = i_1006_ * is_899_[5] + 8192 >> 14;
		is_1013_[8] = i_1006_ * is_899_[8] + 8192 >> 14;
		int i_1014_ = i_1004_ * i_998_ + 8192 >> 14;
		int i_1015_ = i_1005_ * i_999_ + 8192 >> 14;
		int i_1016_ = i_1006_ * i_1000_ + 8192 >> 14;
		i_1014_ += i_1010_;
		i_1015_ += i_1011_;
		i_1016_ += i_1012_;
		int[] is_1017_ = new int[9];
		for (int i_1018_ = 0; i_1018_ < 3; i_1018_++) {
		    for (int i_1019_ = 0; i_1019_ < 3; i_1019_++) {
			int i_1020_ = 0;
			for (int i_1021_ = 0; i_1021_ < 3; i_1021_++)
			    i_1020_ += (is_899_[i_1018_ * 3 + i_1021_]
					* is_1013_[i_1019_ + i_1021_ * 3]);
			is_1017_[i_1018_ * 3 + i_1019_] = i_1020_ + 8192 >> 14;
		    }
		}
		int i_1022_ = ((is_899_[0] * i_1014_ + is_899_[1] * i_1015_
				+ is_899_[2] * i_1016_ + 8192)
			       >> 14);
		int i_1023_ = ((is_899_[3] * i_1014_ + is_899_[4] * i_1015_
				+ is_899_[5] * i_1016_ + 8192)
			       >> 14);
		int i_1024_ = ((is_899_[6] * i_1014_ + is_899_[7] * i_1015_
				+ is_899_[8] * i_1016_ + 8192)
			       >> 14);
		i_1022_ += i_995_;
		i_1023_ += i_996_;
		i_1024_ += i_997_;
		for (int i_1025_ = 0; i_1025_ < i_900_; i_1025_++) {
		    int i_1026_ = is[i_1025_];
		    if (i_1026_
			< ((Class157_Sub1) this).anIntArrayArray9033.length) {
			int[] is_1027_ = (((Class157_Sub1) this)
					  .anIntArrayArray9033[i_1026_]);
			for (int i_1028_ = 0; i_1028_ < is_1027_.length;
			     i_1028_++) {
			    int i_1029_ = is_1027_[i_1028_];
			    if (((Class157_Sub1) this).aShortArray9044 == null
				|| ((i_898_ & (((Class157_Sub1) this)
					       .aShortArray9044[i_1029_]))
				    != 0)) {
				int i_1030_
				    = (is_1017_[0] * (((Class157_Sub1) this)
						      .anIntArray9040[i_1029_])
				       + is_1017_[1] * (((Class157_Sub1) this)
							.anIntArray9041
							[i_1029_])
				       + is_1017_[2] * (((Class157_Sub1) this)
							.anIntArray9042
							[i_1029_])
				       + 8192) >> 14;
				int i_1031_
				    = (is_1017_[3] * (((Class157_Sub1) this)
						      .anIntArray9040[i_1029_])
				       + is_1017_[4] * (((Class157_Sub1) this)
							.anIntArray9041
							[i_1029_])
				       + is_1017_[5] * (((Class157_Sub1) this)
							.anIntArray9042
							[i_1029_])
				       + 8192) >> 14;
				int i_1032_
				    = (is_1017_[6] * (((Class157_Sub1) this)
						      .anIntArray9040[i_1029_])
				       + is_1017_[7] * (((Class157_Sub1) this)
							.anIntArray9041
							[i_1029_])
				       + is_1017_[8] * (((Class157_Sub1) this)
							.anIntArray9042
							[i_1029_])
				       + 8192) >> 14;
				i_1030_ += i_1022_;
				i_1031_ += i_1023_;
				i_1032_ += i_1024_;
				((Class157_Sub1) this).anIntArray9040[i_1029_]
				    = i_1030_;
				((Class157_Sub1) this).anIntArray9041[i_1029_]
				    = i_1031_;
				((Class157_Sub1) this).anIntArray9042[i_1029_]
				    = i_1032_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1033_ = 0; i_1033_ < i_900_; i_1033_++) {
		    int i_1034_ = is[i_1033_];
		    if (i_1034_
			< ((Class157_Sub1) this).anIntArrayArray9033.length) {
			int[] is_1035_ = (((Class157_Sub1) this)
					  .anIntArrayArray9033[i_1034_]);
			for (int i_1036_ = 0; i_1036_ < is_1035_.length;
			     i_1036_++) {
			    int i_1037_ = is_1035_[i_1036_];
			    if (((Class157_Sub1) this).aShortArray9044 == null
				|| ((i_898_ & (((Class157_Sub1) this)
					       .aShortArray9044[i_1037_]))
				    != 0)) {
				((Class157_Sub1) this).anIntArray9040[i_1037_]
				    -= ((Class157_Sub1) this).anInt9103;
				((Class157_Sub1) this).anIntArray9041[i_1037_]
				    -= ((Class157_Sub1) this).anInt9104;
				((Class157_Sub1) this).anIntArray9042[i_1037_]
				    -= ((Class157_Sub1) this).anInt9031;
				((Class157_Sub1) this).anIntArray9040[i_1037_]
				    = (((Class157_Sub1) this).anIntArray9040
				       [i_1037_]) * i_895_ >> 7;
				((Class157_Sub1) this).anIntArray9041[i_1037_]
				    = (((Class157_Sub1) this).anIntArray9041
				       [i_1037_]) * i_896_ >> 7;
				((Class157_Sub1) this).anIntArray9042[i_1037_]
				    = (((Class157_Sub1) this).anIntArray9042
				       [i_1037_]) * i_897_ >> 7;
				((Class157_Sub1) this).anIntArray9040[i_1037_]
				    += ((Class157_Sub1) this).anInt9103;
				((Class157_Sub1) this).anIntArray9041[i_1037_]
				    += ((Class157_Sub1) this).anInt9104;
				((Class157_Sub1) this).anIntArray9042[i_1037_]
				    += ((Class157_Sub1) this).anInt9031;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class157_Sub1) this).anIntArrayArray9063 != null) {
		boolean bool_1038_ = false;
		for (int i_1039_ = 0; i_1039_ < i_900_; i_1039_++) {
		    int i_1040_ = is[i_1039_];
		    if (i_1040_
			< ((Class157_Sub1) this).anIntArrayArray9063.length) {
			int[] is_1041_ = (((Class157_Sub1) this)
					  .anIntArrayArray9063[i_1040_]);
			for (int i_1042_ = 0; i_1042_ < is_1041_.length;
			     i_1042_++) {
			    int i_1043_ = is_1041_[i_1042_];
			    if (((Class157_Sub1) this).aShortArray9064 == null
				|| ((i_898_ & (((Class157_Sub1) this)
					       .aShortArray9064[i_1043_]))
				    != 0)) {
				int i_1044_ = (((((Class157_Sub1) this)
						 .aByteArray9058[i_1043_])
						& 0xff)
					       + i_895_ * 8);
				if (i_1044_ < 0)
				    i_1044_ = 0;
				else if (i_1044_ > 255)
				    i_1044_ = 255;
				((Class157_Sub1) this).aByteArray9058[i_1043_]
				    = (byte) i_1044_;
			    }
			}
			bool_1038_ = bool_1038_ | is_1041_.length > 0;
		    }
		}
		if (bool_1038_) {
		    if (((Class157_Sub1) this).aClass348Array9078 != null) {
			for (int i_1045_ = 0;
			     i_1045_ < ((Class157_Sub1) this).anInt9092;
			     i_1045_++) {
			    Class348 class348 = (((Class157_Sub1) this)
						 .aClass348Array9078[i_1045_]);
			    Class328 class328 = (((Class157_Sub1) this)
						 .aClass328Array9094[i_1045_]);
			    ((Class328) class328).anInt3503
				= (((Class328) class328).anInt3503 & 0xffffff
				   | 255 - ((((Class157_Sub1) this)
					     .aByteArray9058
					     [((Class348) class348).anInt3653])
					    & 0xff) << 24);
			}
		    }
		    method8356();
		}
	    }
	} else if (i == 7) {
	    if (((Class157_Sub1) this).anIntArrayArray9063 != null) {
		boolean bool_1046_ = false;
		for (int i_1047_ = 0; i_1047_ < i_900_; i_1047_++) {
		    int i_1048_ = is[i_1047_];
		    if (i_1048_
			< ((Class157_Sub1) this).anIntArrayArray9063.length) {
			int[] is_1049_ = (((Class157_Sub1) this)
					  .anIntArrayArray9063[i_1048_]);
			for (int i_1050_ = 0; i_1050_ < is_1049_.length;
			     i_1050_++) {
			    int i_1051_ = is_1049_[i_1050_];
			    if (((Class157_Sub1) this).aShortArray9064 == null
				|| ((i_898_ & (((Class157_Sub1) this)
					       .aShortArray9064[i_1051_]))
				    != 0)) {
				int i_1052_ = ((((Class157_Sub1) this)
						.aShortArray9057[i_1051_])
					       & 0xffff);
				int i_1053_ = i_1052_ >> 10 & 0x3f;
				int i_1054_ = i_1052_ >> 7 & 0x7;
				int i_1055_ = i_1052_ & 0x7f;
				i_1053_ = i_1053_ + i_895_ & 0x3f;
				i_1054_ += i_896_ / 4;
				if (i_1054_ < 0)
				    i_1054_ = 0;
				else if (i_1054_ > 7)
				    i_1054_ = 7;
				i_1055_ += i_897_;
				if (i_1055_ < 0)
				    i_1055_ = 0;
				else if (i_1055_ > 127)
				    i_1055_ = 127;
				((Class157_Sub1) this).aShortArray9057[i_1051_]
				    = (short) (i_1053_ << 10 | i_1054_ << 7
					       | i_1055_);
			    }
			}
			bool_1046_ = bool_1046_ | is_1049_.length > 0;
		    }
		}
		if (bool_1046_) {
		    if (((Class157_Sub1) this).aClass348Array9078 != null) {
			for (int i_1056_ = 0;
			     i_1056_ < ((Class157_Sub1) this).anInt9092;
			     i_1056_++) {
			    Class348 class348 = (((Class157_Sub1) this)
						 .aClass348Array9078[i_1056_]);
			    Class328 class328 = (((Class157_Sub1) this)
						 .aClass328Array9094[i_1056_]);
			    ((Class328) class328).anInt3503
				= (((Class328) class328).anInt3503 & ~0xffffff
				   | (Class649.anIntArray8420
				      [((((Class157_Sub1) this).aShortArray9057
					 [((Class348) class348).anInt3653])
					& 0xffff)]) & 0xffffff);
			}
		    }
		    method8356();
		}
	    }
	} else if (i == 8) {
	    if (((Class157_Sub1) this).anIntArrayArray9095 != null) {
		for (int i_1057_ = 0; i_1057_ < i_900_; i_1057_++) {
		    int i_1058_ = is[i_1057_];
		    if (i_1058_
			< ((Class157_Sub1) this).anIntArrayArray9095.length) {
			int[] is_1059_ = (((Class157_Sub1) this)
					  .anIntArrayArray9095[i_1058_]);
			for (int i_1060_ = 0; i_1060_ < is_1059_.length;
			     i_1060_++) {
			    Class328 class328
				= (((Class157_Sub1) this).aClass328Array9094
				   [is_1059_[i_1060_]]);
			    ((Class328) class328).anInt3508 += i_895_;
			    ((Class328) class328).anInt3507 += i_896_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class157_Sub1) this).anIntArrayArray9095 != null) {
		for (int i_1061_ = 0; i_1061_ < i_900_; i_1061_++) {
		    int i_1062_ = is[i_1061_];
		    if (i_1062_
			< ((Class157_Sub1) this).anIntArrayArray9095.length) {
			int[] is_1063_ = (((Class157_Sub1) this)
					  .anIntArrayArray9095[i_1062_]);
			for (int i_1064_ = 0; i_1064_ < is_1063_.length;
			     i_1064_++) {
			    Class328 class328
				= (((Class157_Sub1) this).aClass328Array9094
				   [is_1063_[i_1064_]]);
			    ((Class328) class328).anInt3504
				= (((Class328) class328).anInt3504 * i_895_
				   >> 7);
			    ((Class328) class328).anInt3506
				= (((Class328) class328).anInt3506 * i_896_
				   >> 7);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class157_Sub1) this).anIntArrayArray9095 != null) {
		for (int i_1065_ = 0; i_1065_ < i_900_; i_1065_++) {
		    int i_1066_ = is[i_1065_];
		    if (i_1066_
			< ((Class157_Sub1) this).anIntArrayArray9095.length) {
			int[] is_1067_ = (((Class157_Sub1) this)
					  .anIntArrayArray9095[i_1066_]);
			for (int i_1068_ = 0; i_1068_ < is_1067_.length;
			     i_1068_++) {
			    Class328 class328
				= (((Class157_Sub1) this).aClass328Array9094
				   [is_1067_[i_1068_]]);
			    ((Class328) class328).anInt3505
				= (((Class328) class328).anInt3505 + i_895_
				   & 0x3fff);
			}
		    }
		}
	    }
	}
    }
    
    public void method1968(Class433 class433) {
	Class418 class418
	    = ((Class157_Sub1) this).aClass173_Sub1_9068.aClass418_9243;
	class418.method5035(class433);
	if (((Class157_Sub1) this).aClass170Array9090 != null) {
	    for (int i = 0;
		 i < ((Class157_Sub1) this).aClass170Array9090.length; i++) {
		Class170 class170
		    = ((Class157_Sub1) this).aClass170Array9090[i];
		Class170 class170_1069_ = class170;
		if (class170.aClass170_1958 != null)
		    class170_1069_ = class170.aClass170_1958;
		class170_1069_.anInt1950
		    = ((int) (class418.aFloatArray4768[12]
			      + ((class418.aFloatArray4768[0]
				  * (float) (((Class157_Sub1) this)
					     .anIntArray9040
					     [(class170.anInt1946
					       * 1977387945)]))
				 + (class418.aFloatArray4768[4]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9041
					       [(class170.anInt1946
						 * 1977387945)]))
				 + (class418.aFloatArray4768[8]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9042
					       [(class170.anInt1946
						 * 1977387945)]))))
		       * -1626668665);
		class170_1069_.anInt1951
		    = ((int) (class418.aFloatArray4768[13]
			      + ((class418.aFloatArray4768[1]
				  * (float) (((Class157_Sub1) this)
					     .anIntArray9040
					     [(class170.anInt1946
					       * 1977387945)]))
				 + (class418.aFloatArray4768[5]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9041
					       [(class170.anInt1946
						 * 1977387945)]))
				 + (class418.aFloatArray4768[9]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9042
					       [(class170.anInt1946
						 * 1977387945)]))))
		       * -1756604589);
		class170_1069_.anInt1952
		    = (int) (class418.aFloatArray4768[14]
			     + ((class418.aFloatArray4768[2]
				 * (float) (((Class157_Sub1) this)
					    .anIntArray9040
					    [class170.anInt1946 * 1977387945]))
				+ (class418.aFloatArray4768[6]
				   * (float) (((Class157_Sub1) this)
					      .anIntArray9041
					      [(class170.anInt1946
						* 1977387945)]))
				+ (class418.aFloatArray4768[10]
				   * (float) (((Class157_Sub1) this)
					      .anIntArray9042
					      [(class170.anInt1946
						* 1977387945)])))) * 908623173;
		class170_1069_.anInt1947
		    = ((int) (class418.aFloatArray4768[12]
			      + ((class418.aFloatArray4768[0]
				  * (float) (((Class157_Sub1) this)
					     .anIntArray9040
					     [(class170.anInt1945
					       * -1790775395)]))
				 + (class418.aFloatArray4768[4]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9041
					       [(class170.anInt1945
						 * -1790775395)]))
				 + (class418.aFloatArray4768[8]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9042
					       [(class170.anInt1945
						 * -1790775395)]))))
		       * -203979893);
		class170_1069_.anInt1944
		    = ((int) (class418.aFloatArray4768[13]
			      + ((class418.aFloatArray4768[1]
				  * (float) (((Class157_Sub1) this)
					     .anIntArray9040
					     [(class170.anInt1945
					       * -1790775395)]))
				 + (class418.aFloatArray4768[5]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9041
					       [(class170.anInt1945
						 * -1790775395)]))
				 + (class418.aFloatArray4768[9]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9042
					       [(class170.anInt1945
						 * -1790775395)]))))
		       * 1630459257);
		class170_1069_.anInt1955
		    = ((int) (class418.aFloatArray4768[14]
			      + ((class418.aFloatArray4768[2]
				  * (float) (((Class157_Sub1) this)
					     .anIntArray9040
					     [(class170.anInt1945
					       * -1790775395)]))
				 + (class418.aFloatArray4768[6]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9041
					       [(class170.anInt1945
						 * -1790775395)]))
				 + (class418.aFloatArray4768[10]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9042
					       [(class170.anInt1945
						 * -1790775395)]))))
		       * 1543452655);
		class170_1069_.anInt1956
		    = (int) (class418.aFloatArray4768[12]
			     + ((class418.aFloatArray4768[0]
				 * (float) (((Class157_Sub1) this)
					    .anIntArray9040
					    [class170.anInt1948 * 248261743]))
				+ (class418.aFloatArray4768[4]
				   * (float) (((Class157_Sub1) this)
					      .anIntArray9041
					      [(class170.anInt1948
						* 248261743)]))
				+ (class418.aFloatArray4768[8]
				   * (float) (((Class157_Sub1) this)
					      .anIntArray9042
					      [(class170.anInt1948
						* 248261743)])))) * 271456581;
		class170_1069_.anInt1953
		    = (int) (class418.aFloatArray4768[13]
			     + ((class418.aFloatArray4768[1]
				 * (float) (((Class157_Sub1) this)
					    .anIntArray9040
					    [class170.anInt1948 * 248261743]))
				+ (class418.aFloatArray4768[5]
				   * (float) (((Class157_Sub1) this)
					      .anIntArray9041
					      [(class170.anInt1948
						* 248261743)]))
				+ (class418.aFloatArray4768[9]
				   * (float) (((Class157_Sub1) this)
					      .anIntArray9042
					      [(class170.anInt1948
						* 248261743)])))) * 707964019;
		class170_1069_.anInt1943
		    = (int) (class418.aFloatArray4768[14]
			     + ((class418.aFloatArray4768[2]
				 * (float) (((Class157_Sub1) this)
					    .anIntArray9040
					    [class170.anInt1948 * 248261743]))
				+ (class418.aFloatArray4768[6]
				   * (float) (((Class157_Sub1) this)
					      .anIntArray9041
					      [(class170.anInt1948
						* 248261743)]))
				+ (class418.aFloatArray4768[10]
				   * (float) (((Class157_Sub1) this)
					      .anIntArray9042
					      [(class170.anInt1948
						* 248261743)])))) * -674151113;
	    }
	}
	if (((Class157_Sub1) this).aClass144Array9075 != null) {
	    for (int i = 0;
		 i < ((Class157_Sub1) this).aClass144Array9075.length; i++) {
		Class144 class144
		    = ((Class157_Sub1) this).aClass144Array9075[i];
		Class144 class144_1070_ = class144;
		if (class144.aClass144_1646 != null)
		    class144_1070_ = class144.aClass144_1646;
		if (class144.aClass418_1645 != null)
		    class144.aClass418_1645.method4986(class418);
		else
		    class144.aClass418_1645 = new Class418(class418);
		class144_1070_.anInt1648
		    = ((int) (class418.aFloatArray4768[12]
			      + ((class418.aFloatArray4768[0]
				  * (float) (((Class157_Sub1) this)
					     .anIntArray9040
					     [(class144.anInt1651
					       * 1842630443)]))
				 + (class418.aFloatArray4768[4]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9041
					       [(class144.anInt1651
						 * 1842630443)]))
				 + (class418.aFloatArray4768[8]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9042
					       [(class144.anInt1651
						 * 1842630443)]))))
		       * -1931908895);
		class144_1070_.anInt1649
		    = ((int) (class418.aFloatArray4768[13]
			      + ((class418.aFloatArray4768[1]
				  * (float) (((Class157_Sub1) this)
					     .anIntArray9040
					     [(class144.anInt1651
					       * 1842630443)]))
				 + (class418.aFloatArray4768[5]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9041
					       [(class144.anInt1651
						 * 1842630443)]))
				 + (class418.aFloatArray4768[9]
				    * (float) (((Class157_Sub1) this)
					       .anIntArray9042
					       [(class144.anInt1651
						 * 1842630443)]))))
		       * -1055365151);
		class144_1070_.anInt1650
		    = (int) (class418.aFloatArray4768[14]
			     + ((class418.aFloatArray4768[2]
				 * (float) (((Class157_Sub1) this)
					    .anIntArray9040
					    [class144.anInt1651 * 1842630443]))
				+ (class418.aFloatArray4768[6]
				   * (float) (((Class157_Sub1) this)
					      .anIntArray9041
					      [(class144.anInt1651
						* 1842630443)]))
				+ (class418.aFloatArray4768[10]
				   * (float) (((Class157_Sub1) this)
					      .anIntArray9042
					      [(class144.anInt1651
						* 1842630443)])))) * 870317833;
	    }
	}
    }
    
    void method1962(int i, int i_1071_, int i_1072_, int i_1073_) {
	if (i == 0) {
	    int i_1074_ = 0;
	    ((Class157_Sub1) this).anInt9103 = 0;
	    ((Class157_Sub1) this).anInt9104 = 0;
	    ((Class157_Sub1) this).anInt9031 = 0;
	    for (int i_1075_ = 0; i_1075_ < ((Class157_Sub1) this).anInt9039;
		 i_1075_++) {
		((Class157_Sub1) this).anInt9103
		    += ((Class157_Sub1) this).anIntArray9040[i_1075_];
		((Class157_Sub1) this).anInt9104
		    += ((Class157_Sub1) this).anIntArray9041[i_1075_];
		((Class157_Sub1) this).anInt9031
		    += ((Class157_Sub1) this).anIntArray9042[i_1075_];
		i_1074_++;
	    }
	    if (i_1074_ > 0) {
		((Class157_Sub1) this).anInt9103
		    = ((Class157_Sub1) this).anInt9103 / i_1074_ + i_1071_;
		((Class157_Sub1) this).anInt9104
		    = ((Class157_Sub1) this).anInt9104 / i_1074_ + i_1072_;
		((Class157_Sub1) this).anInt9031
		    = ((Class157_Sub1) this).anInt9031 / i_1074_ + i_1073_;
	    } else {
		((Class157_Sub1) this).anInt9103 = i_1071_;
		((Class157_Sub1) this).anInt9104 = i_1072_;
		((Class157_Sub1) this).anInt9031 = i_1073_;
	    }
	} else if (i == 1) {
	    for (int i_1076_ = 0; i_1076_ < ((Class157_Sub1) this).anInt9039;
		 i_1076_++) {
		((Class157_Sub1) this).anIntArray9040[i_1076_] += i_1071_;
		((Class157_Sub1) this).anIntArray9041[i_1076_] += i_1072_;
		((Class157_Sub1) this).anIntArray9042[i_1076_] += i_1073_;
	    }
	} else if (i == 2) {
	    for (int i_1077_ = 0; i_1077_ < ((Class157_Sub1) this).anInt9039;
		 i_1077_++) {
		((Class157_Sub1) this).anIntArray9040[i_1077_]
		    -= ((Class157_Sub1) this).anInt9103;
		((Class157_Sub1) this).anIntArray9041[i_1077_]
		    -= ((Class157_Sub1) this).anInt9104;
		((Class157_Sub1) this).anIntArray9042[i_1077_]
		    -= ((Class157_Sub1) this).anInt9031;
		if (i_1073_ != 0) {
		    int i_1078_ = Class417.anIntArray4766[i_1073_];
		    int i_1079_ = Class417.anIntArray4767[i_1073_];
		    int i_1080_
			= (((((Class157_Sub1) this).anIntArray9041[i_1077_]
			     * i_1078_)
			    + (((Class157_Sub1) this).anIntArray9040[i_1077_]
			       * i_1079_)
			    + 16383)
			   >> 14);
		    ((Class157_Sub1) this).anIntArray9041[i_1077_]
			= ((((Class157_Sub1) this).anIntArray9041[i_1077_]
			    * i_1079_)
			   - (((Class157_Sub1) this).anIntArray9040[i_1077_]
			      * i_1078_)
			   + 16383) >> 14;
		    ((Class157_Sub1) this).anIntArray9040[i_1077_] = i_1080_;
		}
		if (i_1071_ != 0) {
		    int i_1081_ = Class417.anIntArray4766[i_1071_];
		    int i_1082_ = Class417.anIntArray4767[i_1071_];
		    int i_1083_
			= (((((Class157_Sub1) this).anIntArray9041[i_1077_]
			     * i_1082_)
			    - (((Class157_Sub1) this).anIntArray9042[i_1077_]
			       * i_1081_)
			    + 16383)
			   >> 14);
		    ((Class157_Sub1) this).anIntArray9042[i_1077_]
			= ((((Class157_Sub1) this).anIntArray9041[i_1077_]
			    * i_1081_)
			   + (((Class157_Sub1) this).anIntArray9042[i_1077_]
			      * i_1082_)
			   + 16383) >> 14;
		    ((Class157_Sub1) this).anIntArray9041[i_1077_] = i_1083_;
		}
		if (i_1072_ != 0) {
		    int i_1084_ = Class417.anIntArray4766[i_1072_];
		    int i_1085_ = Class417.anIntArray4767[i_1072_];
		    int i_1086_
			= (((((Class157_Sub1) this).anIntArray9042[i_1077_]
			     * i_1084_)
			    + (((Class157_Sub1) this).anIntArray9040[i_1077_]
			       * i_1085_)
			    + 16383)
			   >> 14);
		    ((Class157_Sub1) this).anIntArray9042[i_1077_]
			= ((((Class157_Sub1) this).anIntArray9042[i_1077_]
			    * i_1085_)
			   - (((Class157_Sub1) this).anIntArray9040[i_1077_]
			      * i_1084_)
			   + 16383) >> 14;
		    ((Class157_Sub1) this).anIntArray9040[i_1077_] = i_1086_;
		}
		((Class157_Sub1) this).anIntArray9040[i_1077_]
		    += ((Class157_Sub1) this).anInt9103;
		((Class157_Sub1) this).anIntArray9041[i_1077_]
		    += ((Class157_Sub1) this).anInt9104;
		((Class157_Sub1) this).anIntArray9042[i_1077_]
		    += ((Class157_Sub1) this).anInt9031;
	    }
	} else if (i == 3) {
	    for (int i_1087_ = 0; i_1087_ < ((Class157_Sub1) this).anInt9039;
		 i_1087_++) {
		((Class157_Sub1) this).anIntArray9040[i_1087_]
		    -= ((Class157_Sub1) this).anInt9103;
		((Class157_Sub1) this).anIntArray9041[i_1087_]
		    -= ((Class157_Sub1) this).anInt9104;
		((Class157_Sub1) this).anIntArray9042[i_1087_]
		    -= ((Class157_Sub1) this).anInt9031;
		((Class157_Sub1) this).anIntArray9040[i_1087_]
		    = (((Class157_Sub1) this).anIntArray9040[i_1087_] * i_1071_
		       / 128);
		((Class157_Sub1) this).anIntArray9041[i_1087_]
		    = (((Class157_Sub1) this).anIntArray9041[i_1087_] * i_1072_
		       / 128);
		((Class157_Sub1) this).anIntArray9042[i_1087_]
		    = (((Class157_Sub1) this).anIntArray9042[i_1087_] * i_1073_
		       / 128);
		((Class157_Sub1) this).anIntArray9040[i_1087_]
		    += ((Class157_Sub1) this).anInt9103;
		((Class157_Sub1) this).anIntArray9041[i_1087_]
		    += ((Class157_Sub1) this).anInt9104;
		((Class157_Sub1) this).anIntArray9042[i_1087_]
		    += ((Class157_Sub1) this).anInt9031;
	    }
	} else if (i == 5) {
	    for (int i_1088_ = 0; i_1088_ < ((Class157_Sub1) this).anInt9055;
		 i_1088_++) {
		int i_1089_
		    = ((((Class157_Sub1) this).aByteArray9058[i_1088_] & 0xff)
		       + i_1071_ * 8);
		if (i_1089_ < 0)
		    i_1089_ = 0;
		else if (i_1089_ > 255)
		    i_1089_ = 255;
		((Class157_Sub1) this).aByteArray9058[i_1088_]
		    = (byte) i_1089_;
	    }
	    if (((Class157_Sub1) this).aClass348Array9078 != null) {
		for (int i_1090_ = 0;
		     i_1090_ < ((Class157_Sub1) this).anInt9092; i_1090_++) {
		    Class348 class348
			= ((Class157_Sub1) this).aClass348Array9078[i_1090_];
		    Class328 class328
			= ((Class157_Sub1) this).aClass328Array9094[i_1090_];
		    ((Class328) class328).anInt3503
			= (((Class328) class328).anInt3503 & 0xffffff
			   | 255 - ((((Class157_Sub1) this).aByteArray9058
				     [((Class348) class348).anInt3653])
				    & 0xff) << 24);
		}
	    }
	    method8356();
	} else if (i == 7) {
	    for (int i_1091_ = 0; i_1091_ < ((Class157_Sub1) this).anInt9055;
		 i_1091_++) {
		int i_1092_
		    = ((Class157_Sub1) this).aShortArray9057[i_1091_] & 0xffff;
		int i_1093_ = i_1092_ >> 10 & 0x3f;
		int i_1094_ = i_1092_ >> 7 & 0x7;
		int i_1095_ = i_1092_ & 0x7f;
		i_1093_ = i_1093_ + i_1071_ & 0x3f;
		i_1094_ += i_1072_ / 4;
		if (i_1094_ < 0)
		    i_1094_ = 0;
		else if (i_1094_ > 7)
		    i_1094_ = 7;
		i_1095_ += i_1073_;
		if (i_1095_ < 0)
		    i_1095_ = 0;
		else if (i_1095_ > 127)
		    i_1095_ = 127;
		((Class157_Sub1) this).aShortArray9057[i_1091_]
		    = (short) (i_1093_ << 10 | i_1094_ << 7 | i_1095_);
	    }
	    if (((Class157_Sub1) this).aClass348Array9078 != null) {
		for (int i_1096_ = 0;
		     i_1096_ < ((Class157_Sub1) this).anInt9092; i_1096_++) {
		    Class348 class348
			= ((Class157_Sub1) this).aClass348Array9078[i_1096_];
		    Class328 class328
			= ((Class157_Sub1) this).aClass328Array9094[i_1096_];
		    ((Class328) class328).anInt3503
			= (((Class328) class328).anInt3503 & ~0xffffff
			   | ((Class649.anIntArray8420
			       [(((Class157_Sub1) this).aShortArray9057
				 [((Class348) class348).anInt3653]) & 0xffff])
			      & 0xffffff));
		}
	    }
	    method8356();
	} else if (i == 8) {
	    for (int i_1097_ = 0; i_1097_ < ((Class157_Sub1) this).anInt9092;
		 i_1097_++) {
		Class328 class328
		    = ((Class157_Sub1) this).aClass328Array9094[i_1097_];
		((Class328) class328).anInt3508 += i_1071_;
		((Class328) class328).anInt3507 += i_1072_;
	    }
	} else if (i == 10) {
	    for (int i_1098_ = 0; i_1098_ < ((Class157_Sub1) this).anInt9092;
		 i_1098_++) {
		Class328 class328
		    = ((Class157_Sub1) this).aClass328Array9094[i_1098_];
		((Class328) class328).anInt3504
		    = ((Class328) class328).anInt3504 * i_1071_ >> 7;
		((Class328) class328).anInt3506
		    = ((Class328) class328).anInt3506 * i_1072_ >> 7;
	    }
	} else if (i == 9) {
	    for (int i_1099_ = 0; i_1099_ < ((Class157_Sub1) this).anInt9092;
		 i_1099_++) {
		Class328 class328
		    = ((Class157_Sub1) this).aClass328Array9094[i_1099_];
		((Class328) class328).anInt3505
		    = ((Class328) class328).anInt3505 + i_1071_ & 0x3fff;
	    }
	}
    }
    
    public void method1963(Class433 class433, int i, boolean bool) {
	if (((Class157_Sub1) this).aShortArray9044 != null) {
	    Class433 class433_1100_ = class433;
	    if (bool) {
		class433_1100_
		    = ((Class173_Sub1) (((Class157_Sub1) this)
					.aClass173_Sub1_9068)).aClass433_9242;
		class433_1100_.method5244(class433);
	    }
	    float[] fs = new float[3];
	    for (int i_1101_ = 0; i_1101_ < ((Class157_Sub1) this).anInt9039;
		 i_1101_++) {
		if ((i & ((Class157_Sub1) this).aShortArray9044[i_1101_])
		    != 0) {
		    class433_1100_.method5233((float) (((Class157_Sub1) this)
						       .anIntArray9040
						       [i_1101_]),
					      (float) (((Class157_Sub1) this)
						       .anIntArray9041
						       [i_1101_]),
					      (float) (((Class157_Sub1) this)
						       .anIntArray9042
						       [i_1101_]),
					      fs);
		    ((Class157_Sub1) this).anIntArray9040[i_1101_]
			= (int) fs[0];
		    ((Class157_Sub1) this).anIntArray9041[i_1101_]
			= (int) fs[1];
		    ((Class157_Sub1) this).anIntArray9042[i_1101_]
			= (int) fs[2];
		}
	    }
	}
    }
    
    public void method1964(Class433 class433, Class159 class159, int i) {
	if (aClass346_9107 != null)
	    aClass346_9107.method4535();
	if (class159 != null)
	    class159.aBool1751 = false;
	if (((Class157_Sub1) this).anInt9077 != 0) {
	    Class418 class418
		= (((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
		   .aClass418_9253);
	    Class418 class418_1102_
		= ((Class157_Sub1) this).aClass173_Sub1_9068.aClass418_9243;
	    Class418 class418_1103_
		= (((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
		   .aClass418_9244);
	    class418_1102_.method5035(class433);
	    class418_1103_.method4986(class418_1102_);
	    class418_1103_.method4974(((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aClass418_9257);
	    if (!((Class157_Sub1) this).aBool9046)
		method8358();
	    float[] fs
		= (((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
		   .aFloatArray9311);
	    class418_1102_.method5030(0.0F,
				      (float) ((Class157_Sub1) this).anInt9093,
				      0.0F, fs);
	    float f = fs[0];
	    float f_1104_ = fs[1];
	    float f_1105_ = fs[2];
	    class418_1102_.method5030(0.0F,
				      (float) ((Class157_Sub1) this).anInt9066,
				      0.0F, fs);
	    float f_1106_ = fs[0];
	    float f_1107_ = fs[1];
	    float f_1108_ = fs[2];
	    for (int i_1109_ = 0; i_1109_ < 6; i_1109_++) {
		float[] fs_1110_ = (((Class173_Sub1) (((Class157_Sub1) this)
						      .aClass173_Sub1_9068))
				    .aFloatArrayArray9259[i_1109_]);
		float f_1111_ = (fs_1110_[0] * f + fs_1110_[1] * f_1104_
				 + fs_1110_[2] * f_1105_ + fs_1110_[3]
				 + (float) ((Class157_Sub1) this).anInt9060);
		float f_1112_ = (fs_1110_[0] * f_1106_ + fs_1110_[1] * f_1107_
				 + fs_1110_[2] * f_1108_ + fs_1110_[3]
				 + (float) ((Class157_Sub1) this).anInt9060);
		if (f_1111_ < 0.0F && f_1112_ < 0.0F)
		    return;
	    }
	    if (class159 != null) {
		boolean bool = false;
		boolean bool_1113_ = true;
		int i_1114_ = ((((Class157_Sub1) this).anInt9079
				+ ((Class157_Sub1) this).anInt9080)
			       >> 1);
		int i_1115_ = ((((Class157_Sub1) this).anInt9081
				+ ((Class157_Sub1) this).anInt9082)
			       >> 1);
		int i_1116_ = i_1114_;
		int i_1117_ = ((Class157_Sub1) this).anInt9093;
		int i_1118_ = i_1115_;
		float f_1119_
		    = (class418_1103_.aFloatArray4768[0] * (float) i_1116_
		       + class418_1103_.aFloatArray4768[4] * (float) i_1117_
		       + class418_1103_.aFloatArray4768[8] * (float) i_1118_
		       + class418_1103_.aFloatArray4768[12]);
		float f_1120_
		    = (class418_1103_.aFloatArray4768[1] * (float) i_1116_
		       + class418_1103_.aFloatArray4768[5] * (float) i_1117_
		       + class418_1103_.aFloatArray4768[9] * (float) i_1118_
		       + class418_1103_.aFloatArray4768[13]);
		float f_1121_
		    = (class418_1103_.aFloatArray4768[2] * (float) i_1116_
		       + class418_1103_.aFloatArray4768[6] * (float) i_1117_
		       + class418_1103_.aFloatArray4768[10] * (float) i_1118_
		       + class418_1103_.aFloatArray4768[14]);
		float f_1122_
		    = (class418_1103_.aFloatArray4768[3] * (float) i_1116_
		       + class418_1103_.aFloatArray4768[7] * (float) i_1117_
		       + class418_1103_.aFloatArray4768[11] * (float) i_1118_
		       + class418_1103_.aFloatArray4768[15]);
		if (f_1121_ >= -f_1122_) {
		    class159.anInt1748
			= (int) ((((Class173_Sub1)
				   ((Class157_Sub1) this).aClass173_Sub1_9068)
				  .aFloat9260)
				 + (((Class173_Sub1) (((Class157_Sub1) this)
						      .aClass173_Sub1_9068))
				    .aFloat9261) * f_1119_ / f_1122_);
		    class159.anInt1750
			= (int) ((((Class173_Sub1)
				   ((Class157_Sub1) this).aClass173_Sub1_9068)
				  .aFloat9262)
				 + (((Class173_Sub1) (((Class157_Sub1) this)
						      .aClass173_Sub1_9068))
				    .aFloat9263) * f_1120_ / f_1122_);
		} else
		    bool = true;
		i_1116_ = i_1114_;
		i_1117_ = ((Class157_Sub1) this).anInt9066;
		i_1118_ = i_1115_;
		float f_1123_
		    = (class418_1103_.aFloatArray4768[0] * (float) i_1116_
		       + class418_1103_.aFloatArray4768[4] * (float) i_1117_
		       + class418_1103_.aFloatArray4768[8] * (float) i_1118_
		       + class418_1103_.aFloatArray4768[12]);
		float f_1124_
		    = (class418_1103_.aFloatArray4768[1] * (float) i_1116_
		       + class418_1103_.aFloatArray4768[5] * (float) i_1117_
		       + class418_1103_.aFloatArray4768[9] * (float) i_1118_
		       + class418_1103_.aFloatArray4768[13]);
		float f_1125_
		    = (class418_1103_.aFloatArray4768[2] * (float) i_1116_
		       + class418_1103_.aFloatArray4768[6] * (float) i_1117_
		       + class418_1103_.aFloatArray4768[10] * (float) i_1118_
		       + class418_1103_.aFloatArray4768[14]);
		float f_1126_
		    = (class418_1103_.aFloatArray4768[3] * (float) i_1116_
		       + class418_1103_.aFloatArray4768[7] * (float) i_1117_
		       + class418_1103_.aFloatArray4768[11] * (float) i_1118_
		       + class418_1103_.aFloatArray4768[15]);
		if (f_1125_ >= -f_1126_) {
		    class159.anInt1749
			= (int) ((((Class173_Sub1)
				   ((Class157_Sub1) this).aClass173_Sub1_9068)
				  .aFloat9260)
				 + (((Class173_Sub1) (((Class157_Sub1) this)
						      .aClass173_Sub1_9068))
				    .aFloat9261) * f_1123_ / f_1126_);
		    class159.anInt1752
			= (int) ((((Class173_Sub1)
				   ((Class157_Sub1) this).aClass173_Sub1_9068)
				  .aFloat9262)
				 + (((Class173_Sub1) (((Class157_Sub1) this)
						      .aClass173_Sub1_9068))
				    .aFloat9263) * f_1124_ / f_1126_);
		} else
		    bool = true;
		if (bool) {
		    if (f_1121_ < -f_1122_ && f_1125_ < -f_1126_)
			bool_1113_ = false;
		    else if (f_1121_ < -f_1122_) {
			float f_1127_
			    = (f_1121_ + f_1122_) / (f_1125_ + f_1126_) - 1.0F;
			float f_1128_
			    = f_1119_ + f_1127_ * (f_1123_ - f_1119_);
			float f_1129_
			    = f_1120_ + f_1127_ * (f_1124_ - f_1120_);
			float f_1130_
			    = f_1122_ + f_1127_ * (f_1126_ - f_1122_);
			class159.anInt1748
			    = (int) ((((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aFloat9260)
				     + (((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068)).aFloat9261
					* f_1128_ / f_1130_));
			class159.anInt1750
			    = (int) ((((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aFloat9262)
				     + (((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068)).aFloat9263
					* f_1129_ / f_1130_));
		    } else if (f_1125_ < -f_1126_) {
			float f_1131_
			    = (f_1125_ + f_1126_) / (f_1121_ + f_1122_) - 1.0F;
			float f_1132_
			    = f_1123_ + f_1131_ * (f_1119_ - f_1123_);
			float f_1133_
			    = f_1124_ + f_1131_ * (f_1120_ - f_1124_);
			float f_1134_
			    = f_1126_ + f_1131_ * (f_1122_ - f_1126_);
			class159.anInt1749
			    = (int) ((((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aFloat9260)
				     + (((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068)).aFloat9261
					* f_1132_ / f_1134_));
			class159.anInt1752
			    = (int) ((((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aFloat9262)
				     + (((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068)).aFloat9263
					* f_1133_ / f_1134_));
		    }
		}
		if (bool_1113_) {
		    if (f_1121_ / f_1122_ > f_1125_ / f_1126_) {
			float f_1135_
			    = (f_1119_
			       + (class418.aFloatArray4768[0]
				  * (float) ((Class157_Sub1) this).anInt9060)
			       + class418.aFloatArray4768[12]);
			float f_1136_
			    = (f_1122_
			       + (class418.aFloatArray4768[3]
				  * (float) ((Class157_Sub1) this).anInt9060)
			       + class418.aFloatArray4768[15]);
			class159.anInt1753
			    = (int) ((((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aFloat9260)
				     - (float) class159.anInt1748
				     + (((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068)).aFloat9261
					* f_1135_ / f_1136_));
		    } else {
			float f_1137_
			    = (f_1123_
			       + (class418.aFloatArray4768[0]
				  * (float) ((Class157_Sub1) this).anInt9060)
			       + class418.aFloatArray4768[12]);
			float f_1138_
			    = (f_1126_
			       + (class418.aFloatArray4768[3]
				  * (float) ((Class157_Sub1) this).anInt9060)
			       + class418.aFloatArray4768[15]);
			class159.anInt1753
			    = (int) ((((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aFloat9260)
				     - (float) class159.anInt1749
				     + (((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068)).aFloat9261
					* f_1137_ / f_1138_));
		    }
		    class159.aBool1751 = true;
		}
	    }
	    ((Class157_Sub1) this).aClass173_Sub1_9068.method8565(i);
	    method8361(class433);
	    ((Class157_Sub1) this).aClass173_Sub1_9068.method8565(0);
	    class418_1102_.method5035(class433);
	    class418_1102_.method4974(((Class157_Sub1) this)
				      .aClass173_Sub1_9068.aClass418_9381);
	    method8362(class418_1102_);
	}
    }
    
    boolean method8371() {
	if (((Class339) ((Class157_Sub1) this).aClass339_9101).aBool3582)
	    return true;
	if ((((Class339) ((Class157_Sub1) this).aClass339_9101)
	     .anInterface41_3583)
	    == null)
	    ((Class339) ((Class157_Sub1) this).aClass339_9101)
		.anInterface41_3583
		= ((Class157_Sub1) this).aClass173_Sub1_9068.method8476(false);
	Interface41 interface41
	    = (((Class339) ((Class157_Sub1) this).aClass339_9101)
	       .anInterface41_3583);
	interface41.method311(((Class157_Sub1) this).anInt9056 * 6);
	Unsafe unsafe
	    = ((Class157_Sub1) this).aClass173_Sub1_9068.anUnsafe9221;
	if (unsafe != null) {
	    int i = ((Class157_Sub1) this).anInt9056 * 6;
	    long l = interface41.method205(0, i);
	    if (l == 0L)
		return false;
	    for (int i_1139_ = 0; i_1139_ < ((Class157_Sub1) this).anInt9056;
		 i_1139_++) {
		unsafe.putShort(l, (((Class157_Sub1) this).aShortArray9059
				    [i_1139_]));
		l += 2L;
		unsafe.putShort(l, (((Class157_Sub1) this).aShortArray9105
				    [i_1139_]));
		l += 2L;
		unsafe.putShort(l, (((Class157_Sub1) this).aShortArray9091
				    [i_1139_]));
		l += 2L;
	    }
	    interface41.method192();
	    ((Class339) ((Class157_Sub1) this).aClass339_9101)
		.anInterface41_3580
		= interface41;
	    ((Class339) ((Class157_Sub1) this).aClass339_9101).aBool3582
		= true;
	    ((Class157_Sub1) this).aBool9071 = true;
	    return true;
	}
	ByteBuffer bytebuffer
	    = ((Class157_Sub1) this).aClass173_Sub1_9068.aByteBuffer9222;
	bytebuffer.clear();
	for (int i = 0; i < ((Class157_Sub1) this).anInt9056; i++) {
	    bytebuffer.putShort(((Class157_Sub1) this).aShortArray9059[i]);
	    bytebuffer.putShort(((Class157_Sub1) this).aShortArray9105[i]);
	    bytebuffer.putShort(((Class157_Sub1) this).aShortArray9091[i]);
	}
	if (interface41.method197(0, bytebuffer.position(),
				  (((Class157_Sub1) this).aClass173_Sub1_9068
				   .aLong9223))) {
	    ((Class339) ((Class157_Sub1) this).aClass339_9101)
		.anInterface41_3580
		= interface41;
	    ((Class339) ((Class157_Sub1) this).aClass339_9101).aBool3582
		= true;
	    ((Class157_Sub1) this).aBool9071 = true;
	    return true;
	}
	return false;
    }
    
    public void method1966(Class433 class433, Class159 class159, int i) {
	if (aClass346_9107 != null)
	    aClass346_9107.method4535();
	if (class159 != null)
	    class159.aBool1751 = false;
	if (((Class157_Sub1) this).anInt9077 != 0) {
	    Class418 class418
		= (((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
		   .aClass418_9253);
	    Class418 class418_1140_
		= ((Class157_Sub1) this).aClass173_Sub1_9068.aClass418_9243;
	    Class418 class418_1141_
		= (((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
		   .aClass418_9244);
	    class418_1140_.method5035(class433);
	    class418_1141_.method4986(class418_1140_);
	    class418_1141_.method4974(((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aClass418_9257);
	    if (!((Class157_Sub1) this).aBool9046)
		method8358();
	    float[] fs
		= (((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
		   .aFloatArray9311);
	    class418_1140_.method5030(0.0F,
				      (float) ((Class157_Sub1) this).anInt9093,
				      0.0F, fs);
	    float f = fs[0];
	    float f_1142_ = fs[1];
	    float f_1143_ = fs[2];
	    class418_1140_.method5030(0.0F,
				      (float) ((Class157_Sub1) this).anInt9066,
				      0.0F, fs);
	    float f_1144_ = fs[0];
	    float f_1145_ = fs[1];
	    float f_1146_ = fs[2];
	    for (int i_1147_ = 0; i_1147_ < 6; i_1147_++) {
		float[] fs_1148_ = (((Class173_Sub1) (((Class157_Sub1) this)
						      .aClass173_Sub1_9068))
				    .aFloatArrayArray9259[i_1147_]);
		float f_1149_ = (fs_1148_[0] * f + fs_1148_[1] * f_1142_
				 + fs_1148_[2] * f_1143_ + fs_1148_[3]
				 + (float) ((Class157_Sub1) this).anInt9060);
		float f_1150_ = (fs_1148_[0] * f_1144_ + fs_1148_[1] * f_1145_
				 + fs_1148_[2] * f_1146_ + fs_1148_[3]
				 + (float) ((Class157_Sub1) this).anInt9060);
		if (f_1149_ < 0.0F && f_1150_ < 0.0F)
		    return;
	    }
	    if (class159 != null) {
		boolean bool = false;
		boolean bool_1151_ = true;
		int i_1152_ = ((((Class157_Sub1) this).anInt9079
				+ ((Class157_Sub1) this).anInt9080)
			       >> 1);
		int i_1153_ = ((((Class157_Sub1) this).anInt9081
				+ ((Class157_Sub1) this).anInt9082)
			       >> 1);
		int i_1154_ = i_1152_;
		int i_1155_ = ((Class157_Sub1) this).anInt9093;
		int i_1156_ = i_1153_;
		float f_1157_
		    = (class418_1141_.aFloatArray4768[0] * (float) i_1154_
		       + class418_1141_.aFloatArray4768[4] * (float) i_1155_
		       + class418_1141_.aFloatArray4768[8] * (float) i_1156_
		       + class418_1141_.aFloatArray4768[12]);
		float f_1158_
		    = (class418_1141_.aFloatArray4768[1] * (float) i_1154_
		       + class418_1141_.aFloatArray4768[5] * (float) i_1155_
		       + class418_1141_.aFloatArray4768[9] * (float) i_1156_
		       + class418_1141_.aFloatArray4768[13]);
		float f_1159_
		    = (class418_1141_.aFloatArray4768[2] * (float) i_1154_
		       + class418_1141_.aFloatArray4768[6] * (float) i_1155_
		       + class418_1141_.aFloatArray4768[10] * (float) i_1156_
		       + class418_1141_.aFloatArray4768[14]);
		float f_1160_
		    = (class418_1141_.aFloatArray4768[3] * (float) i_1154_
		       + class418_1141_.aFloatArray4768[7] * (float) i_1155_
		       + class418_1141_.aFloatArray4768[11] * (float) i_1156_
		       + class418_1141_.aFloatArray4768[15]);
		if (f_1159_ >= -f_1160_) {
		    class159.anInt1748
			= (int) ((((Class173_Sub1)
				   ((Class157_Sub1) this).aClass173_Sub1_9068)
				  .aFloat9260)
				 + (((Class173_Sub1) (((Class157_Sub1) this)
						      .aClass173_Sub1_9068))
				    .aFloat9261) * f_1157_ / f_1160_);
		    class159.anInt1750
			= (int) ((((Class173_Sub1)
				   ((Class157_Sub1) this).aClass173_Sub1_9068)
				  .aFloat9262)
				 + (((Class173_Sub1) (((Class157_Sub1) this)
						      .aClass173_Sub1_9068))
				    .aFloat9263) * f_1158_ / f_1160_);
		} else
		    bool = true;
		i_1154_ = i_1152_;
		i_1155_ = ((Class157_Sub1) this).anInt9066;
		i_1156_ = i_1153_;
		float f_1161_
		    = (class418_1141_.aFloatArray4768[0] * (float) i_1154_
		       + class418_1141_.aFloatArray4768[4] * (float) i_1155_
		       + class418_1141_.aFloatArray4768[8] * (float) i_1156_
		       + class418_1141_.aFloatArray4768[12]);
		float f_1162_
		    = (class418_1141_.aFloatArray4768[1] * (float) i_1154_
		       + class418_1141_.aFloatArray4768[5] * (float) i_1155_
		       + class418_1141_.aFloatArray4768[9] * (float) i_1156_
		       + class418_1141_.aFloatArray4768[13]);
		float f_1163_
		    = (class418_1141_.aFloatArray4768[2] * (float) i_1154_
		       + class418_1141_.aFloatArray4768[6] * (float) i_1155_
		       + class418_1141_.aFloatArray4768[10] * (float) i_1156_
		       + class418_1141_.aFloatArray4768[14]);
		float f_1164_
		    = (class418_1141_.aFloatArray4768[3] * (float) i_1154_
		       + class418_1141_.aFloatArray4768[7] * (float) i_1155_
		       + class418_1141_.aFloatArray4768[11] * (float) i_1156_
		       + class418_1141_.aFloatArray4768[15]);
		if (f_1163_ >= -f_1164_) {
		    class159.anInt1749
			= (int) ((((Class173_Sub1)
				   ((Class157_Sub1) this).aClass173_Sub1_9068)
				  .aFloat9260)
				 + (((Class173_Sub1) (((Class157_Sub1) this)
						      .aClass173_Sub1_9068))
				    .aFloat9261) * f_1161_ / f_1164_);
		    class159.anInt1752
			= (int) ((((Class173_Sub1)
				   ((Class157_Sub1) this).aClass173_Sub1_9068)
				  .aFloat9262)
				 + (((Class173_Sub1) (((Class157_Sub1) this)
						      .aClass173_Sub1_9068))
				    .aFloat9263) * f_1162_ / f_1164_);
		} else
		    bool = true;
		if (bool) {
		    if (f_1159_ < -f_1160_ && f_1163_ < -f_1164_)
			bool_1151_ = false;
		    else if (f_1159_ < -f_1160_) {
			float f_1165_
			    = (f_1159_ + f_1160_) / (f_1163_ + f_1164_) - 1.0F;
			float f_1166_
			    = f_1157_ + f_1165_ * (f_1161_ - f_1157_);
			float f_1167_
			    = f_1158_ + f_1165_ * (f_1162_ - f_1158_);
			float f_1168_
			    = f_1160_ + f_1165_ * (f_1164_ - f_1160_);
			class159.anInt1748
			    = (int) ((((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aFloat9260)
				     + (((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068)).aFloat9261
					* f_1166_ / f_1168_));
			class159.anInt1750
			    = (int) ((((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aFloat9262)
				     + (((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068)).aFloat9263
					* f_1167_ / f_1168_));
		    } else if (f_1163_ < -f_1164_) {
			float f_1169_
			    = (f_1163_ + f_1164_) / (f_1159_ + f_1160_) - 1.0F;
			float f_1170_
			    = f_1161_ + f_1169_ * (f_1157_ - f_1161_);
			float f_1171_
			    = f_1162_ + f_1169_ * (f_1158_ - f_1162_);
			float f_1172_
			    = f_1164_ + f_1169_ * (f_1160_ - f_1164_);
			class159.anInt1749
			    = (int) ((((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aFloat9260)
				     + (((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068)).aFloat9261
					* f_1170_ / f_1172_));
			class159.anInt1752
			    = (int) ((((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aFloat9262)
				     + (((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068)).aFloat9263
					* f_1171_ / f_1172_));
		    }
		}
		if (bool_1151_) {
		    if (f_1159_ / f_1160_ > f_1163_ / f_1164_) {
			float f_1173_
			    = (f_1157_
			       + (class418.aFloatArray4768[0]
				  * (float) ((Class157_Sub1) this).anInt9060)
			       + class418.aFloatArray4768[12]);
			float f_1174_
			    = (f_1160_
			       + (class418.aFloatArray4768[3]
				  * (float) ((Class157_Sub1) this).anInt9060)
			       + class418.aFloatArray4768[15]);
			class159.anInt1753
			    = (int) ((((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aFloat9260)
				     - (float) class159.anInt1748
				     + (((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068)).aFloat9261
					* f_1173_ / f_1174_));
		    } else {
			float f_1175_
			    = (f_1161_
			       + (class418.aFloatArray4768[0]
				  * (float) ((Class157_Sub1) this).anInt9060)
			       + class418.aFloatArray4768[12]);
			float f_1176_
			    = (f_1164_
			       + (class418.aFloatArray4768[3]
				  * (float) ((Class157_Sub1) this).anInt9060)
			       + class418.aFloatArray4768[15]);
			class159.anInt1753
			    = (int) ((((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aFloat9260)
				     - (float) class159.anInt1749
				     + (((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068)).aFloat9261
					* f_1175_ / f_1176_));
		    }
		    class159.aBool1751 = true;
		}
	    }
	    ((Class157_Sub1) this).aClass173_Sub1_9068.method8565(i);
	    method8361(class433);
	    ((Class157_Sub1) this).aClass173_Sub1_9068.method8565(0);
	    class418_1140_.method5035(class433);
	    class418_1140_.method4974(((Class157_Sub1) this)
				      .aClass173_Sub1_9068.aClass418_9381);
	    method8362(class418_1140_);
	}
    }
    
    public boolean method1943(int i, int i_1177_, Class433 class433,
			      boolean bool, int i_1178_) {
	return method8372(i, i_1177_, 0, 0, class433, bool, i_1178_);
    }
    
    public void method1925(Class157 class157, int i, int i_1179_, int i_1180_,
			   boolean bool) {
	Class157_Sub1 class157_sub1_1181_ = (Class157_Sub1) class157;
	if (((Class157_Sub1) this).anInt9055 != 0
	    && ((Class157_Sub1) class157_sub1_1181_).anInt9055 != 0) {
	    int i_1182_ = ((Class157_Sub1) class157_sub1_1181_).anInt9039;
	    int[] is = ((Class157_Sub1) class157_sub1_1181_).anIntArray9040;
	    int[] is_1183_
		= ((Class157_Sub1) class157_sub1_1181_).anIntArray9041;
	    int[] is_1184_
		= ((Class157_Sub1) class157_sub1_1181_).anIntArray9042;
	    short[] is_1185_
		= ((Class157_Sub1) class157_sub1_1181_).aShortArray9048;
	    short[] is_1186_
		= ((Class157_Sub1) class157_sub1_1181_).aShortArray9049;
	    short[] is_1187_
		= ((Class157_Sub1) class157_sub1_1181_).aShortArray9038;
	    byte[] is_1188_
		= ((Class157_Sub1) class157_sub1_1181_).aByteArray9052;
	    short[] is_1189_;
	    short[] is_1190_;
	    short[] is_1191_;
	    byte[] is_1192_;
	    if (((Class157_Sub1) this).aClass352_9054 != null) {
		is_1189_ = (((Class352) ((Class157_Sub1) this).aClass352_9054)
			    .aShortArray3796);
		is_1190_ = (((Class352) ((Class157_Sub1) this).aClass352_9054)
			    .aShortArray3794);
		is_1191_ = (((Class352) ((Class157_Sub1) this).aClass352_9054)
			    .aShortArray3793);
		is_1192_ = (((Class352) ((Class157_Sub1) this).aClass352_9054)
			    .aByteArray3795);
	    } else {
		is_1189_ = null;
		is_1190_ = null;
		is_1191_ = null;
		is_1192_ = null;
	    }
	    short[] is_1193_;
	    short[] is_1194_;
	    short[] is_1195_;
	    byte[] is_1196_;
	    if (((Class157_Sub1) class157_sub1_1181_).aClass352_9054 != null) {
		is_1193_ = ((Class352) (((Class157_Sub1) class157_sub1_1181_)
					.aClass352_9054)).aShortArray3796;
		is_1194_ = ((Class352) (((Class157_Sub1) class157_sub1_1181_)
					.aClass352_9054)).aShortArray3794;
		is_1195_ = ((Class352) (((Class157_Sub1) class157_sub1_1181_)
					.aClass352_9054)).aShortArray3793;
		is_1196_ = ((Class352) (((Class157_Sub1) class157_sub1_1181_)
					.aClass352_9054)).aByteArray3795;
	    } else {
		is_1193_ = null;
		is_1194_ = null;
		is_1195_ = null;
		is_1196_ = null;
	    }
	    int[] is_1197_
		= ((Class157_Sub1) class157_sub1_1181_).anIntArray9100;
	    short[] is_1198_
		= ((Class157_Sub1) class157_sub1_1181_).aShortArray9089;
	    if (!((Class157_Sub1) class157_sub1_1181_).aBool9046)
		class157_sub1_1181_.method8358();
	    int i_1199_ = ((Class157_Sub1) class157_sub1_1181_).anInt9093;
	    int i_1200_ = ((Class157_Sub1) class157_sub1_1181_).anInt9066;
	    int i_1201_ = ((Class157_Sub1) class157_sub1_1181_).anInt9079;
	    int i_1202_ = ((Class157_Sub1) class157_sub1_1181_).anInt9080;
	    int i_1203_ = ((Class157_Sub1) class157_sub1_1181_).anInt9081;
	    int i_1204_ = ((Class157_Sub1) class157_sub1_1181_).anInt9082;
	    for (int i_1205_ = 0; i_1205_ < ((Class157_Sub1) this).anInt9039;
		 i_1205_++) {
		int i_1206_
		    = ((Class157_Sub1) this).anIntArray9041[i_1205_] - i_1179_;
		if (i_1206_ >= i_1199_ && i_1206_ <= i_1200_) {
		    int i_1207_
			= ((Class157_Sub1) this).anIntArray9040[i_1205_] - i;
		    if (i_1207_ >= i_1201_ && i_1207_ <= i_1202_) {
			int i_1208_
			    = (((Class157_Sub1) this).anIntArray9042[i_1205_]
			       - i_1180_);
			if (i_1208_ >= i_1203_ && i_1208_ <= i_1204_) {
			    int i_1209_ = -1;
			    int i_1210_ = (((Class157_Sub1) this)
					   .anIntArray9100[i_1205_]);
			    int i_1211_ = (((Class157_Sub1) this)
					   .anIntArray9100[i_1205_ + 1]);
			    for (int i_1212_ = i_1210_;
				 (i_1212_ < i_1211_
				  && (((Class157_Sub1) this).aShortArray9089
				      [i_1212_]) != 0);
				 i_1212_++) {
				i_1209_ = ((((Class157_Sub1) this)
					    .aShortArray9089[i_1212_])
					   & 0xffff) - 1;
				if ((((Class157_Sub1) this).aByteArray9052
				     [i_1209_])
				    != 0)
				    break;
			    }
			    if (i_1209_ != -1) {
				for (int i_1213_ = 0; i_1213_ < i_1182_;
				     i_1213_++) {
				    if (i_1207_ == is[i_1213_]
					&& i_1208_ == is_1184_[i_1213_]
					&& i_1206_ == is_1183_[i_1213_]) {
					int i_1214_ = -1;
					i_1210_ = is_1197_[i_1213_];
					i_1211_ = is_1197_[i_1213_ + 1];
					for (int i_1215_ = i_1210_;
					     (i_1215_ < i_1211_
					      && is_1198_[i_1215_] != 0);
					     i_1215_++) {
					    i_1214_ = (is_1198_[i_1215_] - 1
						       & 0xffff);
					    if (is_1188_[i_1214_] != 0)
						break;
					}
					if (i_1214_ != -1) {
					    if (is_1189_ == null) {
						((Class157_Sub1) this)
						    .aClass352_9054
						    = new Class352();
						is_1189_
						    = ((Class352)
						       (((Class157_Sub1) this)
							.aClass352_9054))
							  .aShortArray3796
						    = (Class407.method4883
						       ((((Class157_Sub1) this)
							 .aShortArray9048),
							1071173469));
						is_1190_
						    = ((Class352)
						       (((Class157_Sub1) this)
							.aClass352_9054))
							  .aShortArray3794
						    = (Class407.method4883
						       ((((Class157_Sub1) this)
							 .aShortArray9049),
							1071173469));
						is_1191_
						    = ((Class352)
						       (((Class157_Sub1) this)
							.aClass352_9054))
							  .aShortArray3793
						    = (Class407.method4883
						       ((((Class157_Sub1) this)
							 .aShortArray9038),
							1071173469));
						is_1192_
						    = ((Class352)
						       (((Class157_Sub1) this)
							.aClass352_9054))
							  .aByteArray3795
						    = (Class324.method4228
						       ((((Class157_Sub1) this)
							 .aByteArray9052),
							-1225588044));
					    }
					    if (is_1193_ == null) {
						Class352 class352
						    = (((Class157_Sub1)
							class157_sub1_1181_)
							   .aClass352_9054
						       = new Class352());
						is_1193_
						    = ((Class352) class352)
							  .aShortArray3796
						    = (Class407.method4883
						       (is_1185_, 1071173469));
						is_1194_
						    = ((Class352) class352)
							  .aShortArray3794
						    = (Class407.method4883
						       (is_1186_, 1071173469));
						is_1195_
						    = ((Class352) class352)
							  .aShortArray3793
						    = (Class407.method4883
						       (is_1187_, 1071173469));
						is_1196_
						    = ((Class352) class352)
							  .aByteArray3795
						    = (Class324.method4228
						       (is_1188_,
							-1053188923));
					    }
					    short i_1216_
						= (((Class157_Sub1) this)
						   .aShortArray9048[i_1209_]);
					    short i_1217_
						= (((Class157_Sub1) this)
						   .aShortArray9049[i_1209_]);
					    short i_1218_
						= (((Class157_Sub1) this)
						   .aShortArray9038[i_1209_]);
					    byte i_1219_
						= (((Class157_Sub1) this)
						   .aByteArray9052[i_1209_]);
					    i_1210_ = is_1197_[i_1213_];
					    i_1211_ = is_1197_[i_1213_ + 1];
					    for (int i_1220_ = i_1210_;
						 i_1220_ < i_1211_;
						 i_1220_++) {
						int i_1221_
						    = is_1198_[i_1220_] - 1;
						if (i_1221_ == -1)
						    break;
						if (is_1196_[i_1221_] != 0) {
						    is_1193_[i_1221_]
							+= i_1216_;
						    is_1194_[i_1221_]
							+= i_1217_;
						    is_1195_[i_1221_]
							+= i_1218_;
						    is_1196_[i_1221_]
							+= i_1219_;
						}
					    }
					    i_1216_ = is_1185_[i_1214_];
					    i_1217_ = is_1186_[i_1214_];
					    i_1218_ = is_1187_[i_1214_];
					    i_1219_ = is_1188_[i_1214_];
					    i_1210_
						= (((Class157_Sub1) this)
						   .anIntArray9100[i_1205_]);
					    i_1211_ = (((Class157_Sub1) this)
						       .anIntArray9100
						       [i_1205_ + 1]);
					    for (int i_1222_ = i_1210_;
						 (i_1222_ < i_1211_
						  && (((Class157_Sub1) this)
						      .aShortArray9089
						      [i_1222_]) != 0);
						 i_1222_++) {
						int i_1223_
						    = (((((Class157_Sub1) this)
							 .aShortArray9089
							 [i_1222_])
							& 0xffff)
						       - 1);
						if (is_1192_[i_1223_] != 0) {
						    is_1189_[i_1223_]
							+= i_1216_;
						    is_1190_[i_1223_]
							+= i_1217_;
						    is_1191_[i_1223_]
							+= i_1218_;
						    is_1192_[i_1223_]
							+= i_1219_;
						}
					    }
					    class157_sub1_1181_.method8367();
					    method8367();
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public Class528_Sub21_Sub12 method1969
	(Class528_Sub21_Sub12 class528_sub21_sub12) {
	if (((Class157_Sub1) this).anInt9077 == 0)
	    return null;
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	int i;
	int i_1224_;
	if ((((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
	     .anInt9306)
	    > 0) {
	    i = ((((Class157_Sub1) this).anInt9079
		  - ((((Class157_Sub1) this).anInt9066
		      * ((Class173_Sub1)
			 ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9306)
		     >> 8))
		 >> ((Class173_Sub1)
		     ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9305);
	    i_1224_
		= ((((Class157_Sub1) this).anInt9080
		    - ((((Class157_Sub1) this).anInt9093
			* ((Class173_Sub1) (((Class157_Sub1) this)
					    .aClass173_Sub1_9068)).anInt9306)
		       >> 8))
		   >> ((Class173_Sub1)
		       ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9305);
	} else {
	    i = ((((Class157_Sub1) this).anInt9079
		  - ((((Class157_Sub1) this).anInt9093
		      * ((Class173_Sub1)
			 ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9306)
		     >> 8))
		 >> ((Class173_Sub1)
		     ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9305);
	    i_1224_
		= ((((Class157_Sub1) this).anInt9080
		    - ((((Class157_Sub1) this).anInt9066
			* ((Class173_Sub1) (((Class157_Sub1) this)
					    .aClass173_Sub1_9068)).anInt9306)
		       >> 8))
		   >> ((Class173_Sub1)
		       ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9305);
	}
	int i_1225_;
	int i_1226_;
	if ((((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
	     .anInt9307)
	    > 0) {
	    i_1225_
		= ((((Class157_Sub1) this).anInt9081
		    - ((((Class157_Sub1) this).anInt9066
			* ((Class173_Sub1) (((Class157_Sub1) this)
					    .aClass173_Sub1_9068)).anInt9307)
		       >> 8))
		   >> ((Class173_Sub1)
		       ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9305);
	    i_1226_
		= ((((Class157_Sub1) this).anInt9082
		    - ((((Class157_Sub1) this).anInt9093
			* ((Class173_Sub1) (((Class157_Sub1) this)
					    .aClass173_Sub1_9068)).anInt9307)
		       >> 8))
		   >> ((Class173_Sub1)
		       ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9305);
	} else {
	    i_1225_
		= ((((Class157_Sub1) this).anInt9081
		    - ((((Class157_Sub1) this).anInt9093
			* ((Class173_Sub1) (((Class157_Sub1) this)
					    .aClass173_Sub1_9068)).anInt9307)
		       >> 8))
		   >> ((Class173_Sub1)
		       ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9305);
	    i_1226_
		= ((((Class157_Sub1) this).anInt9082
		    - ((((Class157_Sub1) this).anInt9066
			* ((Class173_Sub1) (((Class157_Sub1) this)
					    .aClass173_Sub1_9068)).anInt9307)
		       >> 8))
		   >> ((Class173_Sub1)
		       ((Class157_Sub1) this).aClass173_Sub1_9068).anInt9305);
	}
	int i_1227_ = i_1224_ - i + 1;
	int i_1228_ = i_1226_ - i_1225_ + 1;
	Class528_Sub21_Sub12_Sub1 class528_sub21_sub12_sub1
	    = (Class528_Sub21_Sub12_Sub1) class528_sub21_sub12;
	Class528_Sub21_Sub12_Sub1 class528_sub21_sub12_sub1_1229_;
	if (class528_sub21_sub12_sub1 != null
	    && class528_sub21_sub12_sub1.method10823(i_1227_, i_1228_)) {
	    class528_sub21_sub12_sub1_1229_ = class528_sub21_sub12_sub1;
	    class528_sub21_sub12_sub1_1229_.method10824();
	} else
	    class528_sub21_sub12_sub1_1229_
		= new Class528_Sub21_Sub12_Sub1((((Class157_Sub1) this)
						 .aClass173_Sub1_9068),
						i_1227_, i_1228_);
	class528_sub21_sub12_sub1_1229_.method10829(i, i_1225_, i_1224_,
						    i_1226_);
	method8359(class528_sub21_sub12_sub1_1229_);
	return class528_sub21_sub12_sub1_1229_;
    }
    
    public int method1980() {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	return ((Class157_Sub1) this).anInt9093;
    }
    
    public void method1971() {
	if (!((Class157_Sub1) this).aBool9083) {
	    if (!((Class157_Sub1) this).aBool9046)
		method8358();
	    ((Class157_Sub1) this).anInt9084
		= ((Class157_Sub1) this).anInt9093;
	    ((Class157_Sub1) this).aBool9083 = true;
	}
    }
    
    public int method1907() {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	return ((Class157_Sub1) this).anInt9060;
    }
    
    public int method1973() {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	return ((Class157_Sub1) this).anInt9060;
    }
    
    public void method1915(int i) {
	((Class157_Sub1) this).aShort9037 = (short) i;
	method8385();
	method8367();
    }
    
    public int method1975() {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	return ((Class157_Sub1) this).anInt9079;
    }
    
    public void method2026() {
	if (((Class157_Sub1) this).anInt9077 > 0
	    && ((Class157_Sub1) this).anInt9056 > 0) {
	    method8364();
	    method8363();
	    method8355();
	}
    }
    
    public int method1977() {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	return ((Class157_Sub1) this).anInt9079;
    }
    
    public int method1978() {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	return ((Class157_Sub1) this).anInt9080;
    }
    
    public int method1912() {
	return ((Class157_Sub1) this).aShort9037;
    }
    
    boolean method8372(int i, int i_1230_, int i_1231_, int i_1232_,
		       Class433 class433, boolean bool, int i_1233_) {
	Class418 class418
	    = ((Class157_Sub1) this).aClass173_Sub1_9068.aClass418_9243;
	class418.method5035(class433);
	class418.method4974(((Class173_Sub1)
			     ((Class157_Sub1) this).aClass173_Sub1_9068)
			    .aClass418_9257);
	boolean bool_1234_ = false;
	float f = 3.4028235E38F;
	float f_1235_ = -3.4028235E38F;
	float f_1236_ = 3.4028235E38F;
	float f_1237_ = -3.4028235E38F;
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	int i_1238_ = ((((Class157_Sub1) this).anInt9080
			- ((Class157_Sub1) this).anInt9079)
		       >> 1);
	int i_1239_ = ((((Class157_Sub1) this).anInt9066
			- ((Class157_Sub1) this).anInt9093)
		       >> 1);
	int i_1240_ = ((((Class157_Sub1) this).anInt9082
			- ((Class157_Sub1) this).anInt9081)
		       >> 1);
	int i_1241_ = ((Class157_Sub1) this).anInt9079 + i_1238_;
	int i_1242_ = ((Class157_Sub1) this).anInt9093 + i_1239_;
	int i_1243_ = ((Class157_Sub1) this).anInt9081 + i_1240_;
	int i_1244_ = i_1241_ - (i_1238_ << i_1233_);
	int i_1245_ = i_1242_ - (i_1239_ << i_1233_);
	int i_1246_ = i_1243_ - (i_1240_ << i_1233_);
	int i_1247_ = i_1241_ + (i_1238_ << i_1233_);
	int i_1248_ = i_1242_ + (i_1239_ << i_1233_);
	int i_1249_ = i_1243_ + (i_1240_ << i_1233_);
	((Class157_Sub1) this).anIntArray9072[0] = i_1244_;
	((Class157_Sub1) this).anIntArray9076[0] = i_1245_;
	((Class157_Sub1) this).anIntArray9102[0] = i_1246_;
	((Class157_Sub1) this).anIntArray9072[1] = i_1247_;
	((Class157_Sub1) this).anIntArray9076[1] = i_1245_;
	((Class157_Sub1) this).anIntArray9102[1] = i_1246_;
	((Class157_Sub1) this).anIntArray9072[2] = i_1244_;
	((Class157_Sub1) this).anIntArray9076[2] = i_1248_;
	((Class157_Sub1) this).anIntArray9102[2] = i_1246_;
	((Class157_Sub1) this).anIntArray9072[3] = i_1247_;
	((Class157_Sub1) this).anIntArray9076[3] = i_1248_;
	((Class157_Sub1) this).anIntArray9102[3] = i_1246_;
	((Class157_Sub1) this).anIntArray9072[4] = i_1244_;
	((Class157_Sub1) this).anIntArray9076[4] = i_1245_;
	((Class157_Sub1) this).anIntArray9102[4] = i_1249_;
	((Class157_Sub1) this).anIntArray9072[5] = i_1247_;
	((Class157_Sub1) this).anIntArray9076[5] = i_1245_;
	((Class157_Sub1) this).anIntArray9102[5] = i_1249_;
	((Class157_Sub1) this).anIntArray9072[6] = i_1244_;
	((Class157_Sub1) this).anIntArray9076[6] = i_1248_;
	((Class157_Sub1) this).anIntArray9102[6] = i_1249_;
	((Class157_Sub1) this).anIntArray9072[7] = i_1247_;
	((Class157_Sub1) this).anIntArray9076[7] = i_1248_;
	((Class157_Sub1) this).anIntArray9102[7] = i_1249_;
	for (int i_1250_ = 0; i_1250_ < 8; i_1250_++) {
	    float f_1251_
		= (float) ((Class157_Sub1) this).anIntArray9072[i_1250_];
	    float f_1252_
		= (float) ((Class157_Sub1) this).anIntArray9076[i_1250_];
	    float f_1253_
		= (float) ((Class157_Sub1) this).anIntArray9102[i_1250_];
	    float f_1254_ = (class418.aFloatArray4768[2] * f_1251_
			     + class418.aFloatArray4768[6] * f_1252_
			     + class418.aFloatArray4768[10] * f_1253_
			     + class418.aFloatArray4768[14]);
	    float f_1255_ = (class418.aFloatArray4768[3] * f_1251_
			     + class418.aFloatArray4768[7] * f_1252_
			     + class418.aFloatArray4768[11] * f_1253_
			     + class418.aFloatArray4768[15]);
	    if (f_1254_ >= -f_1255_) {
		float f_1256_ = (class418.aFloatArray4768[0] * f_1251_
				 + class418.aFloatArray4768[4] * f_1252_
				 + class418.aFloatArray4768[8] * f_1253_
				 + class418.aFloatArray4768[12]);
		float f_1257_ = (class418.aFloatArray4768[1] * f_1251_
				 + class418.aFloatArray4768[5] * f_1252_
				 + class418.aFloatArray4768[9] * f_1253_
				 + class418.aFloatArray4768[13]);
		float f_1258_
		    = (((Class173_Sub1)
			((Class157_Sub1) this).aClass173_Sub1_9068).aFloat9260
		       + (((Class173_Sub1) (((Class157_Sub1) this)
					    .aClass173_Sub1_9068)).aFloat9261
			  * f_1256_ / f_1255_));
		float f_1259_
		    = (((Class173_Sub1)
			((Class157_Sub1) this).aClass173_Sub1_9068).aFloat9262
		       + (((Class173_Sub1) (((Class157_Sub1) this)
					    .aClass173_Sub1_9068)).aFloat9263
			  * f_1257_ / f_1255_));
		if (f_1258_ < f)
		    f = f_1258_;
		if (f_1258_ > f_1235_)
		    f_1235_ = f_1258_;
		if (f_1259_ < f_1236_)
		    f_1236_ = f_1259_;
		if (f_1259_ > f_1237_)
		    f_1237_ = f_1259_;
		bool_1234_ = true;
	    }
	}
	int i_1260_ = i + i_1231_;
	int i_1261_ = i_1230_ + i_1232_;
	if (bool_1234_ && (float) i_1260_ > f && (float) i < f_1235_
	    && (float) i_1261_ > f_1236_ && (float) i_1230_ < f_1237_) {
	    if (bool)
		return true;
	    if (((Class157_Sub1) this).anIntArray9098.length
		< ((Class157_Sub1) this).anInt9077) {
		((Class157_Sub1) this).anIntArray9098
		    = new int[((Class157_Sub1) this).anInt9077];
		((Class157_Sub1) this).anIntArray9067
		    = new int[((Class157_Sub1) this).anInt9077];
	    }
	    for (int i_1262_ = 0; i_1262_ < ((Class157_Sub1) this).anInt9039;
		 i_1262_++) {
		float f_1263_
		    = (float) ((Class157_Sub1) this).anIntArray9040[i_1262_];
		float f_1264_
		    = (float) ((Class157_Sub1) this).anIntArray9041[i_1262_];
		float f_1265_
		    = (float) ((Class157_Sub1) this).anIntArray9042[i_1262_];
		float f_1266_ = (class418.aFloatArray4768[2] * f_1263_
				 + class418.aFloatArray4768[6] * f_1264_
				 + class418.aFloatArray4768[10] * f_1265_
				 + class418.aFloatArray4768[14]);
		float f_1267_ = (class418.aFloatArray4768[3] * f_1263_
				 + class418.aFloatArray4768[7] * f_1264_
				 + class418.aFloatArray4768[11] * f_1265_
				 + class418.aFloatArray4768[15]);
		if (f_1266_ >= -f_1267_) {
		    float f_1268_ = (class418.aFloatArray4768[0] * f_1263_
				     + class418.aFloatArray4768[4] * f_1264_
				     + class418.aFloatArray4768[8] * f_1265_
				     + class418.aFloatArray4768[12]);
		    float f_1269_ = (class418.aFloatArray4768[1] * f_1263_
				     + class418.aFloatArray4768[5] * f_1264_
				     + class418.aFloatArray4768[9] * f_1265_
				     + class418.aFloatArray4768[13]);
		    int i_1270_
			= ((Class157_Sub1) this).anIntArray9100[i_1262_];
		    int i_1271_
			= ((Class157_Sub1) this).anIntArray9100[i_1262_ + 1];
		    for (int i_1272_ = i_1270_;
			 (i_1272_ < i_1271_
			  && (((Class157_Sub1) this).aShortArray9089[i_1272_]
			      != 0));
			 i_1272_++) {
			int i_1273_
			    = ((((Class157_Sub1) this).aShortArray9089[i_1272_]
				& 0xffff)
			       - 1);
			((Class157_Sub1) this).anIntArray9098[i_1273_]
			    = (int) ((((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aFloat9260)
				     + (((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068)).aFloat9261
					* f_1268_ / f_1267_));
			((Class157_Sub1) this).anIntArray9067[i_1273_]
			    = (int) ((((Class173_Sub1) (((Class157_Sub1) this)
							.aClass173_Sub1_9068))
				      .aFloat9262)
				     + (((Class173_Sub1)
					 (((Class157_Sub1) this)
					  .aClass173_Sub1_9068)).aFloat9263
					* f_1269_ / f_1267_));
		    }
		} else {
		    int i_1274_
			= ((Class157_Sub1) this).anIntArray9100[i_1262_];
		    int i_1275_
			= ((Class157_Sub1) this).anIntArray9100[i_1262_ + 1];
		    for (int i_1276_ = i_1274_;
			 (i_1276_ < i_1275_
			  && (((Class157_Sub1) this).aShortArray9089[i_1276_]
			      != 0));
			 i_1276_++) {
			int i_1277_
			    = ((((Class157_Sub1) this).aShortArray9089[i_1276_]
				& 0xffff)
			       - 1);
			((Class157_Sub1) this).anIntArray9098[i_1277_]
			    = -999999;
		    }
		}
	    }
	    for (int i_1278_ = 0; i_1278_ < ((Class157_Sub1) this).anInt9055;
		 i_1278_++) {
		if ((((Class157_Sub1) this).anIntArray9098
		     [(((Class157_Sub1) this).aShortArray9059[i_1278_]
		       & 0xffff)]) != -999999
		    && (((Class157_Sub1) this).anIntArray9098
			[(((Class157_Sub1) this).aShortArray9105[i_1278_]
			  & 0xffff)]) != -999999
		    && (((Class157_Sub1) this).anIntArray9098
			[(((Class157_Sub1) this).aShortArray9091[i_1278_]
			  & 0xffff)]) != -999999
		    && method8360(i, i_1230_, i_1260_, i_1261_,
				  (((Class157_Sub1) this).anIntArray9067
				   [(((Class157_Sub1) this).aShortArray9059
				     [i_1278_]) & 0xffff]),
				  (((Class157_Sub1) this).anIntArray9067
				   [(((Class157_Sub1) this).aShortArray9105
				     [i_1278_]) & 0xffff]),
				  (((Class157_Sub1) this).anIntArray9067
				   [(((Class157_Sub1) this).aShortArray9091
				     [i_1278_]) & 0xffff]),
				  (((Class157_Sub1) this).anIntArray9098
				   [(((Class157_Sub1) this).aShortArray9059
				     [i_1278_]) & 0xffff]),
				  (((Class157_Sub1) this).anIntArray9098
				   [(((Class157_Sub1) this).aShortArray9105
				     [i_1278_]) & 0xffff]),
				  (((Class157_Sub1) this).anIntArray9098
				   [(((Class157_Sub1) this).aShortArray9091
				     [i_1278_]) & 0xffff])))
		    return true;
	    }
	}
	return false;
    }
    
    public int method1994() {
	return ((Class157_Sub1) this).aShort9037;
    }
    
    public int method1954() {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	return ((Class157_Sub1) this).anInt9065;
    }
    
    public int method1949() {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	return ((Class157_Sub1) this).anInt9081;
    }
    
    public int method1896() {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	return ((Class157_Sub1) this).anInt9082;
    }
    
    public int method1984() {
	if (!((Class157_Sub1) this).aBool9083)
	    method1909();
	return ((Class157_Sub1) this).anInt9084;
    }
    
    public int method1891() {
	if (!((Class157_Sub1) this).aBool9083)
	    method1909();
	return ((Class157_Sub1) this).anInt9084;
    }
    
    public void method1908(int i) {
	if (((Class157_Sub1) this).aClass354_9045 != null)
	    ((Class354) ((Class157_Sub1) this).aClass354_9045).aBool3802
		= Class338.method4395(i, ((Class157_Sub1) this).anInt9035);
	if (((Class157_Sub1) this).aClass354_9069 != null)
	    ((Class354) ((Class157_Sub1) this).aClass354_9069).aBool3802
		= Class338.method4462(i, ((Class157_Sub1) this).anInt9035);
	if (((Class157_Sub1) this).aClass354_9050 != null)
	    ((Class354) ((Class157_Sub1) this).aClass354_9050).aBool3802
		= Class338.method4397(i, ((Class157_Sub1) this).anInt9035);
	if (((Class157_Sub1) this).aClass354_9086 != null)
	    ((Class354) ((Class157_Sub1) this).aClass354_9086).aBool3802
		= Class338.method4396(i, ((Class157_Sub1) this).anInt9035);
	((Class157_Sub1) this).anInt9034 = i;
	if (((Class157_Sub1) this).aClass352_9054 != null
	    && (((Class157_Sub1) this).anInt9034 & 0x10000) == 0) {
	    ((Class157_Sub1) this).aShortArray9048
		= (((Class352) ((Class157_Sub1) this).aClass352_9054)
		   .aShortArray3796);
	    ((Class157_Sub1) this).aShortArray9049
		= (((Class352) ((Class157_Sub1) this).aClass352_9054)
		   .aShortArray3794);
	    ((Class157_Sub1) this).aShortArray9038
		= (((Class352) ((Class157_Sub1) this).aClass352_9054)
		   .aShortArray3793);
	    ((Class157_Sub1) this).aByteArray9052
		= (((Class352) ((Class157_Sub1) this).aClass352_9054)
		   .aByteArray3795);
	    ((Class157_Sub1) this).aClass352_9054 = null;
	}
	((Class157_Sub1) this).aBool9071 = true;
	method8355();
    }
    
    public int method1900() {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	return ((Class157_Sub1) this).anInt9081;
    }
    
    public void method1877(int i) {
	((Class157_Sub1) this).aShort9036 = (short) i;
	method8356();
    }
    
    public void method1936() {
	if (((Class157_Sub1) this).anInt9077 > 0
	    && ((Class157_Sub1) this).anInt9056 > 0) {
	    method8364();
	    method8363();
	    method8355();
	}
    }
    
    public void method1990(int i) {
	((Class157_Sub1) this).aShort9037 = (short) i;
	method8385();
	method8367();
    }
    
    public void method1991(int i) {
	((Class157_Sub1) this).aShort9037 = (short) i;
	method8385();
	method8367();
    }
    
    public void method1873(int i) {
	if (((Class157_Sub1) this).aClass354_9045 != null)
	    ((Class354) ((Class157_Sub1) this).aClass354_9045).aBool3802
		= Class338.method4395(i, ((Class157_Sub1) this).anInt9035);
	if (((Class157_Sub1) this).aClass354_9069 != null)
	    ((Class354) ((Class157_Sub1) this).aClass354_9069).aBool3802
		= Class338.method4462(i, ((Class157_Sub1) this).anInt9035);
	if (((Class157_Sub1) this).aClass354_9050 != null)
	    ((Class354) ((Class157_Sub1) this).aClass354_9050).aBool3802
		= Class338.method4397(i, ((Class157_Sub1) this).anInt9035);
	if (((Class157_Sub1) this).aClass354_9086 != null)
	    ((Class354) ((Class157_Sub1) this).aClass354_9086).aBool3802
		= Class338.method4396(i, ((Class157_Sub1) this).anInt9035);
	((Class157_Sub1) this).anInt9034 = i;
	if (((Class157_Sub1) this).aClass352_9054 != null
	    && (((Class157_Sub1) this).anInt9034 & 0x10000) == 0) {
	    ((Class157_Sub1) this).aShortArray9048
		= (((Class352) ((Class157_Sub1) this).aClass352_9054)
		   .aShortArray3796);
	    ((Class157_Sub1) this).aShortArray9049
		= (((Class352) ((Class157_Sub1) this).aClass352_9054)
		   .aShortArray3794);
	    ((Class157_Sub1) this).aShortArray9038
		= (((Class352) ((Class157_Sub1) this).aClass352_9054)
		   .aShortArray3793);
	    ((Class157_Sub1) this).aByteArray9052
		= (((Class352) ((Class157_Sub1) this).aClass352_9054)
		   .aByteArray3795);
	    ((Class157_Sub1) this).aClass352_9054 = null;
	}
	((Class157_Sub1) this).aBool9071 = true;
	method8355();
    }
    
    public int method1898() {
	return ((Class157_Sub1) this).aShort9036;
    }
    
    public byte[] method1911() {
	return ((Class157_Sub1) this).aByteArray9058;
    }
    
    public byte[] method1996() {
	return ((Class157_Sub1) this).aByteArray9058;
    }
    
    public void method1997(byte i, byte[] is) {
	if (is == null) {
	    for (int i_1279_ = 0; i_1279_ < ((Class157_Sub1) this).anInt9055;
		 i_1279_++)
		((Class157_Sub1) this).aByteArray9058[i_1279_] = i;
	} else {
	    for (int i_1280_ = 0; i_1280_ < ((Class157_Sub1) this).anInt9055;
		 i_1280_++) {
		int i_1281_ = 255 - ((255 - (is[i_1280_] & 0xff))
				     * (255 - (i & 0xff)) / 255);
		((Class157_Sub1) this).aByteArray9058[i_1280_]
		    = (byte) i_1281_;
	    }
	}
	method8356();
    }
    
    public void method1998(byte i, byte[] is) {
	if (is == null) {
	    for (int i_1282_ = 0; i_1282_ < ((Class157_Sub1) this).anInt9055;
		 i_1282_++)
		((Class157_Sub1) this).aByteArray9058[i_1282_] = i;
	} else {
	    for (int i_1283_ = 0; i_1283_ < ((Class157_Sub1) this).anInt9055;
		 i_1283_++) {
		int i_1284_ = 255 - ((255 - (is[i_1283_] & 0xff))
				     * (255 - (i & 0xff)) / 255);
		((Class157_Sub1) this).aByteArray9058[i_1283_]
		    = (byte) i_1284_;
	    }
	}
	method8356();
    }
    
    public void method1999(byte i, byte[] is) {
	if (is == null) {
	    for (int i_1285_ = 0; i_1285_ < ((Class157_Sub1) this).anInt9055;
		 i_1285_++)
		((Class157_Sub1) this).aByteArray9058[i_1285_] = i;
	} else {
	    for (int i_1286_ = 0; i_1286_ < ((Class157_Sub1) this).anInt9055;
		 i_1286_++) {
		int i_1287_ = 255 - ((255 - (is[i_1286_] & 0xff))
				     * (255 - (i & 0xff)) / 255);
		((Class157_Sub1) this).aByteArray9058[i_1286_]
		    = (byte) i_1287_;
	    }
	}
	method8356();
    }
    
    static byte[] method8373(byte[] is, int i) {
	byte[] is_1288_ = new byte[i];
	System.arraycopy(is, 0, is_1288_, 0, i);
	return is_1288_;
    }
    
    public int method2023() {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	return ((Class157_Sub1) this).anInt9066;
    }
    
    public void method1932(int i) {
	int i_1289_ = Class417.anIntArray4766[i];
	int i_1290_ = Class417.anIntArray4767[i];
	for (int i_1291_ = 0; i_1291_ < ((Class157_Sub1) this).anInt9039;
	     i_1291_++) {
	    int i_1292_
		= ((((Class157_Sub1) this).anIntArray9042[i_1291_] * i_1289_
		    + ((Class157_Sub1) this).anIntArray9040[i_1291_] * i_1290_)
		   >> 14);
	    ((Class157_Sub1) this).anIntArray9042[i_1291_]
		= ((((Class157_Sub1) this).anIntArray9042[i_1291_] * i_1290_
		    - ((Class157_Sub1) this).anIntArray9040[i_1291_] * i_1289_)
		   >> 14);
	    ((Class157_Sub1) this).anIntArray9040[i_1291_] = i_1292_;
	}
	for (int i_1293_ = 0; i_1293_ < ((Class157_Sub1) this).anInt9077;
	     i_1293_++) {
	    int i_1294_
		= ((((Class157_Sub1) this).aShortArray9038[i_1293_] * i_1289_
		    + (((Class157_Sub1) this).aShortArray9048[i_1293_]
		       * i_1290_))
		   >> 14);
	    ((Class157_Sub1) this).aShortArray9038[i_1293_]
		= (short) (((((Class157_Sub1) this).aShortArray9038[i_1293_]
			     * i_1290_)
			    - (((Class157_Sub1) this).aShortArray9048[i_1293_]
			       * i_1289_))
			   >> 14);
	    ((Class157_Sub1) this).aShortArray9048[i_1293_] = (short) i_1294_;
	}
	method8385();
	method8367();
	((Class157_Sub1) this).aBool9046 = false;
    }
    
    public void method2003(short i, short i_1295_) {
	Class165 class165
	    = ((Class157_Sub1) this).aClass173_Sub1_9068.aClass165_1984;
	for (int i_1296_ = 0; i_1296_ < ((Class157_Sub1) this).anInt9055;
	     i_1296_++) {
	    if (((Class157_Sub1) this).aShortArray9062[i_1296_] == i)
		((Class157_Sub1) this).aShortArray9062[i_1296_] = i_1295_;
	}
	byte i_1297_ = 0;
	byte i_1298_ = 0;
	if (i != -1) {
	    Class160 class160 = class165.method2093(i & 0xffff, (byte) -78);
	    i_1297_ = class160.aByte1802;
	    i_1298_ = class160.aByte1801;
	}
	byte i_1299_ = 0;
	byte i_1300_ = 0;
	if (i_1295_ != -1) {
	    Class160 class160
		= class165.method2093(i_1295_ & 0xffff, (byte) -104);
	    i_1299_ = class160.aByte1802;
	    i_1300_ = class160.aByte1801;
	    if (class160.aByte1775 != 0 || class160.aByte1776 != 0)
		((Class157_Sub1) this).aBool9073 = true;
	}
	if (i_1297_ != i_1299_ | i_1298_ != i_1300_) {
	    if (((Class157_Sub1) this).aClass348Array9078 != null) {
		for (int i_1301_ = 0;
		     i_1301_ < ((Class157_Sub1) this).anInt9092; i_1301_++) {
		    Class348 class348
			= ((Class157_Sub1) this).aClass348Array9078[i_1301_];
		    Class328 class328
			= ((Class157_Sub1) this).aClass328Array9094[i_1301_];
		    ((Class328) class328).anInt3503
			= (((Class328) class328).anInt3503 & ~0xffffff
			   | ((Class649.anIntArray8420
			       [(((Class157_Sub1) this).aShortArray9057
				 [((Class348) class348).anInt3653]) & 0xffff])
			      & 0xffffff));
		}
	    }
	    method8356();
	}
    }
    
    void method8374() {
	if (((Class157_Sub1) this).aClass354_9045 != null)
	    ((Class157_Sub1) this).aClass354_9045.method4574();
	if (((Class157_Sub1) this).aClass354_9069 != null)
	    ((Class157_Sub1) this).aClass354_9069.method4574();
	if (((Class157_Sub1) this).aClass354_9050 != null)
	    ((Class157_Sub1) this).aClass354_9050.method4574();
	if (((Class157_Sub1) this).aClass354_9086 != null)
	    ((Class157_Sub1) this).aClass354_9086.method4574();
	if (((Class157_Sub1) this).aClass339_9101 != null)
	    ((Class157_Sub1) this).aClass339_9101.method4482();
    }
    
    public void method2037(int i, int i_1302_, int i_1303_, int i_1304_) {
	for (int i_1305_ = 0; i_1305_ < ((Class157_Sub1) this).anInt9055;
	     i_1305_++) {
	    int i_1306_
		= ((Class157_Sub1) this).aShortArray9057[i_1305_] & 0xffff;
	    int i_1307_ = i_1306_ >> 10 & 0x3f;
	    int i_1308_ = i_1306_ >> 7 & 0x7;
	    int i_1309_ = i_1306_ & 0x7f;
	    if (i != -1)
		i_1307_ += (i - i_1307_) * i_1304_ >> 7;
	    if (i_1302_ != -1)
		i_1308_ += (i_1302_ - i_1308_) * i_1304_ >> 7;
	    if (i_1303_ != -1)
		i_1309_ += (i_1303_ - i_1309_) * i_1304_ >> 7;
	    ((Class157_Sub1) this).aShortArray9057[i_1305_]
		= (short) (i_1307_ << 10 | i_1308_ << 7 | i_1309_);
	}
	if (((Class157_Sub1) this).aClass348Array9078 != null) {
	    for (int i_1310_ = 0; i_1310_ < ((Class157_Sub1) this).anInt9092;
		 i_1310_++) {
		Class348 class348
		    = ((Class157_Sub1) this).aClass348Array9078[i_1310_];
		Class328 class328
		    = ((Class157_Sub1) this).aClass328Array9094[i_1310_];
		((Class328) class328).anInt3503
		    = (((Class328) class328).anInt3503 & ~0xffffff
		       | ((Class649.anIntArray8420
			   [(((Class157_Sub1) this).aShortArray9057
			     [((Class348) class348).anInt3653]) & 0xffff])
			  & 0xffffff));
	    }
	}
	method8356();
    }
    
    public void method2006(int i, int i_1311_, int i_1312_, int i_1313_) {
	for (int i_1314_ = 0; i_1314_ < ((Class157_Sub1) this).anInt9055;
	     i_1314_++) {
	    int i_1315_
		= ((Class157_Sub1) this).aShortArray9057[i_1314_] & 0xffff;
	    int i_1316_ = i_1315_ >> 10 & 0x3f;
	    int i_1317_ = i_1315_ >> 7 & 0x7;
	    int i_1318_ = i_1315_ & 0x7f;
	    if (i != -1)
		i_1316_ += (i - i_1316_) * i_1313_ >> 7;
	    if (i_1311_ != -1)
		i_1317_ += (i_1311_ - i_1317_) * i_1313_ >> 7;
	    if (i_1312_ != -1)
		i_1318_ += (i_1312_ - i_1318_) * i_1313_ >> 7;
	    ((Class157_Sub1) this).aShortArray9057[i_1314_]
		= (short) (i_1316_ << 10 | i_1317_ << 7 | i_1318_);
	}
	if (((Class157_Sub1) this).aClass348Array9078 != null) {
	    for (int i_1319_ = 0; i_1319_ < ((Class157_Sub1) this).anInt9092;
		 i_1319_++) {
		Class348 class348
		    = ((Class157_Sub1) this).aClass348Array9078[i_1319_];
		Class328 class328
		    = ((Class157_Sub1) this).aClass328Array9094[i_1319_];
		((Class328) class328).anInt3503
		    = (((Class328) class328).anInt3503 & ~0xffffff
		       | ((Class649.anIntArray8420
			   [(((Class157_Sub1) this).aShortArray9057
			     [((Class348) class348).anInt3653]) & 0xffff])
			  & 0xffffff));
	    }
	}
	method8356();
    }
    
    public void method2007(int i, int i_1320_, int i_1321_, int i_1322_) {
	for (int i_1323_ = 0; i_1323_ < ((Class157_Sub1) this).anInt9055;
	     i_1323_++) {
	    int i_1324_
		= ((Class157_Sub1) this).aShortArray9057[i_1323_] & 0xffff;
	    int i_1325_ = i_1324_ >> 10 & 0x3f;
	    int i_1326_ = i_1324_ >> 7 & 0x7;
	    int i_1327_ = i_1324_ & 0x7f;
	    if (i != -1)
		i_1325_ += (i - i_1325_) * i_1322_ >> 7;
	    if (i_1320_ != -1)
		i_1326_ += (i_1320_ - i_1326_) * i_1322_ >> 7;
	    if (i_1321_ != -1)
		i_1327_ += (i_1321_ - i_1327_) * i_1322_ >> 7;
	    ((Class157_Sub1) this).aShortArray9057[i_1323_]
		= (short) (i_1325_ << 10 | i_1326_ << 7 | i_1327_);
	}
	if (((Class157_Sub1) this).aClass348Array9078 != null) {
	    for (int i_1328_ = 0; i_1328_ < ((Class157_Sub1) this).anInt9092;
		 i_1328_++) {
		Class348 class348
		    = ((Class157_Sub1) this).aClass348Array9078[i_1328_];
		Class328 class328
		    = ((Class157_Sub1) this).aClass328Array9094[i_1328_];
		((Class328) class328).anInt3503
		    = (((Class328) class328).anInt3503 & ~0xffffff
		       | ((Class649.anIntArray8420
			   [(((Class157_Sub1) this).aShortArray9057
			     [((Class348) class348).anInt3653]) & 0xffff])
			  & 0xffffff));
	    }
	}
	method8356();
    }
    
    public Class170[] method2008() {
	return ((Class157_Sub1) this).aClass170Array9090;
    }
    
    public void method1880(int i, int i_1329_, int i_1330_) {
	for (int i_1331_ = 0; i_1331_ < ((Class157_Sub1) this).anInt9039;
	     i_1331_++) {
	    if (i != 0)
		((Class157_Sub1) this).anIntArray9040[i_1331_] += i;
	    if (i_1329_ != 0)
		((Class157_Sub1) this).anIntArray9041[i_1331_] += i_1329_;
	    if (i_1330_ != 0)
		((Class157_Sub1) this).anIntArray9042[i_1331_] += i_1330_;
	}
	method8385();
	((Class157_Sub1) this).aBool9046 = false;
    }
    
    public Class144[] method2010() {
	return ((Class157_Sub1) this).aClass144Array9075;
    }
    
    public int method1983() {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	return ((Class157_Sub1) this).anInt9060;
    }
    
    public Class144[] method2012() {
	return ((Class157_Sub1) this).aClass144Array9075;
    }
    
    void method8375() {
	if (((Class157_Sub1) this).aClass354_9045 != null)
	    ((Class157_Sub1) this).aClass354_9045.method4574();
	if (((Class157_Sub1) this).aClass354_9069 != null)
	    ((Class157_Sub1) this).aClass354_9069.method4574();
	if (((Class157_Sub1) this).aClass354_9050 != null)
	    ((Class157_Sub1) this).aClass354_9050.method4574();
	if (((Class157_Sub1) this).aClass354_9086 != null)
	    ((Class157_Sub1) this).aClass354_9086.method4574();
	if (((Class157_Sub1) this).aClass339_9101 != null)
	    ((Class157_Sub1) this).aClass339_9101.method4482();
    }
    
    public boolean method2014() {
	if (((Class157_Sub1) this).aShortArray9062 == null)
	    return true;
	for (int i = 0; i < ((Class157_Sub1) this).aShortArray9062.length;
	     i++) {
	    if (((Class157_Sub1) this).aShortArray9062[i] != -1
		&& !(((Class173_Sub1)
		      ((Class157_Sub1) this).aClass173_Sub1_9068)
			 .aClass329_9315.method4267
		     ((((Class157_Sub1) this).aClass173_Sub1_9068
			   .aClass165_1984.method2093
		       (((Class157_Sub1) this).aShortArray9062[i],
			(byte) -117)),
		      -1)))
		return false;
	}
	return true;
    }
    
    public void method1878(int i) {
	int i_1332_ = Class417.anIntArray4766[i];
	int i_1333_ = Class417.anIntArray4767[i];
	for (int i_1334_ = 0; i_1334_ < ((Class157_Sub1) this).anInt9039;
	     i_1334_++) {
	    int i_1335_
		= ((((Class157_Sub1) this).anIntArray9042[i_1334_] * i_1332_
		    + ((Class157_Sub1) this).anIntArray9040[i_1334_] * i_1333_)
		   >> 14);
	    ((Class157_Sub1) this).anIntArray9042[i_1334_]
		= ((((Class157_Sub1) this).anIntArray9042[i_1334_] * i_1333_
		    - ((Class157_Sub1) this).anIntArray9040[i_1334_] * i_1332_)
		   >> 14);
	    ((Class157_Sub1) this).anIntArray9040[i_1334_] = i_1335_;
	}
	method8385();
	((Class157_Sub1) this).aBool9046 = false;
    }
    
    public boolean method2016() {
	return ((Class157_Sub1) this).aBool9073;
    }
    
    public boolean method2021() {
	return ((Class157_Sub1) this).aBool9073;
    }
    
    public boolean method2017() {
	return ((Class157_Sub1) this).aBool9073;
    }
    
    public int method1874() {
	return ((Class157_Sub1) this).anInt9034;
    }
    
    public void method2019(int i, int i_1336_, int i_1337_) {
	for (int i_1338_ = 0; i_1338_ < ((Class157_Sub1) this).anInt9039;
	     i_1338_++) {
	    if (i != 0)
		((Class157_Sub1) this).anIntArray9040[i_1338_] += i;
	    if (i_1336_ != 0)
		((Class157_Sub1) this).anIntArray9041[i_1338_] += i_1336_;
	    if (i_1337_ != 0)
		((Class157_Sub1) this).anIntArray9042[i_1338_] += i_1337_;
	}
	method8385();
	((Class157_Sub1) this).aBool9046 = false;
    }
    
    static float[] method8376(float[] fs, int i) {
	float[] fs_1339_ = new float[i];
	System.arraycopy(fs, 0, fs_1339_, 0, i);
	return fs_1339_;
    }
    
    void method8377() {
	if (((Class157_Sub1) this).aBool9071) {
	    ((Class157_Sub1) this).aBool9071 = false;
	    if (((Class157_Sub1) this).aClass170Array9090 == null
		&& ((Class157_Sub1) this).aClass144Array9075 == null
		&& ((Class157_Sub1) this).aClass348Array9078 == null
		&& !Class338.method4382(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		boolean bool = false;
		boolean bool_1340_ = false;
		boolean bool_1341_ = false;
		if (((Class157_Sub1) this).anIntArray9040 != null
		    && !Class338.method4381(((Class157_Sub1) this).anInt9034,
					    (((Class157_Sub1) this)
					     .anInt9035))) {
		    if (((Class157_Sub1) this).aClass354_9045 == null
			|| ((Class157_Sub1) this).aClass354_9045
			       .method4573()) {
			if (!((Class157_Sub1) this).aBool9046)
			    method8358();
			bool = true;
		    } else
			((Class157_Sub1) this).aBool9071 = true;
		}
		if (((Class157_Sub1) this).anIntArray9041 != null
		    && !Class338.method4401(((Class157_Sub1) this).anInt9034,
					    (((Class157_Sub1) this)
					     .anInt9035))) {
		    if (((Class157_Sub1) this).aClass354_9045 == null
			|| ((Class157_Sub1) this).aClass354_9045
			       .method4573()) {
			if (!((Class157_Sub1) this).aBool9046)
			    method8358();
			bool_1340_ = true;
		    } else
			((Class157_Sub1) this).aBool9071 = true;
		}
		if (((Class157_Sub1) this).anIntArray9042 != null
		    && !Class338.method4402(((Class157_Sub1) this).anInt9034,
					    (((Class157_Sub1) this)
					     .anInt9035))) {
		    if (((Class157_Sub1) this).aClass354_9045 == null
			|| ((Class157_Sub1) this).aClass354_9045
			       .method4573()) {
			if (!((Class157_Sub1) this).aBool9046)
			    method8358();
			bool_1341_ = true;
		    } else
			((Class157_Sub1) this).aBool9071 = true;
		}
		if (bool)
		    ((Class157_Sub1) this).anIntArray9040 = null;
		if (bool_1340_)
		    ((Class157_Sub1) this).anIntArray9041 = null;
		if (bool_1341_)
		    ((Class157_Sub1) this).anIntArray9042 = null;
	    }
	    if (((Class157_Sub1) this).aShortArray9089 != null
		&& ((Class157_Sub1) this).anIntArray9040 == null
		&& ((Class157_Sub1) this).anIntArray9041 == null
		&& ((Class157_Sub1) this).anIntArray9042 == null) {
		((Class157_Sub1) this).aShortArray9089 = null;
		((Class157_Sub1) this).anIntArray9100 = null;
	    }
	while_36_:
	    do {
		if (((Class157_Sub1) this).aByteArray9052 != null
		    && !Class338.method4478(((Class157_Sub1) this).anInt9034,
					    (((Class157_Sub1) this)
					     .anInt9035))) {
		    do {
			if ((((Class157_Sub1) this).anInt9035 & 0x37) != 0) {
			    if (((Class157_Sub1) this).aClass354_9086 != null
				&& !((Class157_Sub1) this).aClass354_9086
					.method4573())
				break;
			} else if ((((Class157_Sub1) this).aClass354_9050
				    != null)
				   && !((Class157_Sub1) this)
					   .aClass354_9050.method4573())
			    break;
			((Class157_Sub1) this).aShortArray9038 = null;
			((Class157_Sub1) this).aShortArray9049 = null;
			((Class157_Sub1) this).aShortArray9048 = null;
			((Class157_Sub1) this).aByteArray9052 = null;
			break while_36_;
		    } while (false);
		    ((Class157_Sub1) this).aBool9071 = true;
		}
	    } while (false);
	    if (((Class157_Sub1) this).aShortArray9057 != null
		&& !Class338.method4404(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		if (((Class157_Sub1) this).aClass354_9050 == null
		    || ((Class157_Sub1) this).aClass354_9050.method4573())
		    ((Class157_Sub1) this).aShortArray9057 = null;
		else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aByteArray9058 != null
		&& !Class338.method4405(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		if (((Class157_Sub1) this).aClass354_9050 == null
		    || ((Class157_Sub1) this).aClass354_9050.method4573())
		    ((Class157_Sub1) this).aByteArray9058 = null;
		else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aFloatArray9061 != null
		&& !Class338.method4406(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		if (((Class157_Sub1) this).aClass354_9069 == null
		    || ((Class157_Sub1) this).aClass354_9069.method4573()) {
		    ((Class157_Sub1) this).aFloatArray9053 = null;
		    ((Class157_Sub1) this).aFloatArray9061 = null;
		} else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aShortArray9062 != null
		&& !Class338.method4410(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		if (((Class157_Sub1) this).aClass354_9050 == null
		    || ((Class157_Sub1) this).aClass354_9050.method4573())
		    ((Class157_Sub1) this).aShortArray9062 = null;
		else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aShortArray9059 != null
		&& !Class338.method4409(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		if ((((Class157_Sub1) this).aClass339_9101 == null
		     || ((Class157_Sub1) this).aClass339_9101.method4481())
		    && (((Class157_Sub1) this).aClass354_9050 == null
			|| ((Class157_Sub1) this).aClass354_9050
			       .method4573())) {
		    ((Class157_Sub1) this).aShortArray9091 = null;
		    ((Class157_Sub1) this).aShortArray9105 = null;
		    ((Class157_Sub1) this).aShortArray9059 = null;
		} else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aShortArray9043 != null) {
		if (((Class157_Sub1) this).aClass354_9045 == null
		    || ((Class157_Sub1) this).aClass354_9045.method4573())
		    ((Class157_Sub1) this).aShortArray9043 = null;
		else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aShortArray9047 != null) {
		if (((Class157_Sub1) this).aClass354_9050 == null
		    || ((Class157_Sub1) this).aClass354_9050.method4573())
		    ((Class157_Sub1) this).aShortArray9047 = null;
		else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).anIntArrayArray9063 != null
		&& !Class338.method4438(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		((Class157_Sub1) this).anIntArrayArray9063 = null;
		((Class157_Sub1) this).aShortArray9064 = null;
	    }
	    if (((Class157_Sub1) this).anIntArrayArray9033 != null
		&& !Class338.method4453(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		((Class157_Sub1) this).anIntArrayArray9033 = null;
		((Class157_Sub1) this).aShortArray9044 = null;
	    }
	    if (((Class157_Sub1) this).anIntArrayArray9095 != null
		&& !Class338.method4435(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035))
		((Class157_Sub1) this).anIntArrayArray9095 = null;
	    if (((Class157_Sub1) this).anIntArray9085 != null
		&& (((Class157_Sub1) this).anInt9034 & 0x800) == 0
		&& (((Class157_Sub1) this).anInt9034 & 0x40000) == 0) {
		((Class157_Sub1) this).anIntArray9085 = null;
		((Class157_Sub1) this).anIntArray9087 = null;
		((Class157_Sub1) this).anIntArray9099 = null;
	    }
	}
    }
    
    void method1892(int i, int[] is, int i_1342_, int i_1343_, int i_1344_,
		    int i_1345_, boolean bool) {
	int i_1346_ = is.length;
	if (i == 0) {
	    i_1342_ <<= 4;
	    i_1343_ <<= 4;
	    i_1344_ <<= 4;
	    int i_1347_ = 0;
	    ((Class157_Sub1) this).anInt9103 = 0;
	    ((Class157_Sub1) this).anInt9104 = 0;
	    ((Class157_Sub1) this).anInt9031 = 0;
	    for (int i_1348_ = 0; i_1348_ < i_1346_; i_1348_++) {
		int i_1349_ = is[i_1348_];
		if (i_1349_
		    < ((Class157_Sub1) this).anIntArrayArray9033.length) {
		    int[] is_1350_
			= ((Class157_Sub1) this).anIntArrayArray9033[i_1349_];
		    for (int i_1351_ = 0; i_1351_ < is_1350_.length;
			 i_1351_++) {
			int i_1352_ = is_1350_[i_1351_];
			((Class157_Sub1) this).anInt9103
			    += ((Class157_Sub1) this).anIntArray9040[i_1352_];
			((Class157_Sub1) this).anInt9104
			    += ((Class157_Sub1) this).anIntArray9041[i_1352_];
			((Class157_Sub1) this).anInt9031
			    += ((Class157_Sub1) this).anIntArray9042[i_1352_];
			i_1347_++;
		    }
		}
	    }
	    if (i_1347_ > 0) {
		((Class157_Sub1) this).anInt9103
		    = ((Class157_Sub1) this).anInt9103 / i_1347_ + i_1342_;
		((Class157_Sub1) this).anInt9104
		    = ((Class157_Sub1) this).anInt9104 / i_1347_ + i_1343_;
		((Class157_Sub1) this).anInt9031
		    = ((Class157_Sub1) this).anInt9031 / i_1347_ + i_1344_;
	    } else {
		((Class157_Sub1) this).anInt9103 = i_1342_;
		((Class157_Sub1) this).anInt9104 = i_1343_;
		((Class157_Sub1) this).anInt9031 = i_1344_;
	    }
	} else if (i == 1) {
	    i_1342_ <<= 4;
	    i_1343_ <<= 4;
	    i_1344_ <<= 4;
	    for (int i_1353_ = 0; i_1353_ < i_1346_; i_1353_++) {
		int i_1354_ = is[i_1353_];
		if (i_1354_
		    < ((Class157_Sub1) this).anIntArrayArray9033.length) {
		    int[] is_1355_
			= ((Class157_Sub1) this).anIntArrayArray9033[i_1354_];
		    for (int i_1356_ = 0; i_1356_ < is_1355_.length;
			 i_1356_++) {
			int i_1357_ = is_1355_[i_1356_];
			((Class157_Sub1) this).anIntArray9040[i_1357_]
			    += i_1342_;
			((Class157_Sub1) this).anIntArray9041[i_1357_]
			    += i_1343_;
			((Class157_Sub1) this).anIntArray9042[i_1357_]
			    += i_1344_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_1358_ = 0; i_1358_ < i_1346_; i_1358_++) {
		int i_1359_ = is[i_1358_];
		if (i_1359_
		    < ((Class157_Sub1) this).anIntArrayArray9033.length) {
		    int[] is_1360_
			= ((Class157_Sub1) this).anIntArrayArray9033[i_1359_];
		    if ((i_1345_ & 0x1) == 0) {
			for (int i_1361_ = 0; i_1361_ < is_1360_.length;
			     i_1361_++) {
			    int i_1362_ = is_1360_[i_1361_];
			    ((Class157_Sub1) this).anIntArray9040[i_1362_]
				-= ((Class157_Sub1) this).anInt9103;
			    ((Class157_Sub1) this).anIntArray9041[i_1362_]
				-= ((Class157_Sub1) this).anInt9104;
			    ((Class157_Sub1) this).anIntArray9042[i_1362_]
				-= ((Class157_Sub1) this).anInt9031;
			    if (i_1344_ != 0) {
				int i_1363_ = Class417.anIntArray4766[i_1344_];
				int i_1364_ = Class417.anIntArray4767[i_1344_];
				int i_1365_
				    = (((((Class157_Sub1) this).anIntArray9041
					 [i_1362_]) * i_1363_
					+ (((Class157_Sub1) this)
					   .anIntArray9040[i_1362_]) * i_1364_
					+ 16383)
				       >> 14);
				((Class157_Sub1) this).anIntArray9041[i_1362_]
				    = ((((Class157_Sub1) this).anIntArray9041
					[i_1362_]) * i_1364_
				       - (((Class157_Sub1) this).anIntArray9040
					  [i_1362_]) * i_1363_
				       + 16383) >> 14;
				((Class157_Sub1) this).anIntArray9040[i_1362_]
				    = i_1365_;
			    }
			    if (i_1342_ != 0) {
				int i_1366_ = Class417.anIntArray4766[i_1342_];
				int i_1367_ = Class417.anIntArray4767[i_1342_];
				int i_1368_
				    = (((((Class157_Sub1) this).anIntArray9041
					 [i_1362_]) * i_1367_
					- (((Class157_Sub1) this)
					   .anIntArray9042[i_1362_]) * i_1366_
					+ 16383)
				       >> 14);
				((Class157_Sub1) this).anIntArray9042[i_1362_]
				    = ((((Class157_Sub1) this).anIntArray9041
					[i_1362_]) * i_1366_
				       + (((Class157_Sub1) this).anIntArray9042
					  [i_1362_]) * i_1367_
				       + 16383) >> 14;
				((Class157_Sub1) this).anIntArray9041[i_1362_]
				    = i_1368_;
			    }
			    if (i_1343_ != 0) {
				int i_1369_ = Class417.anIntArray4766[i_1343_];
				int i_1370_ = Class417.anIntArray4767[i_1343_];
				int i_1371_
				    = (((((Class157_Sub1) this).anIntArray9042
					 [i_1362_]) * i_1369_
					+ (((Class157_Sub1) this)
					   .anIntArray9040[i_1362_]) * i_1370_
					+ 16383)
				       >> 14);
				((Class157_Sub1) this).anIntArray9042[i_1362_]
				    = ((((Class157_Sub1) this).anIntArray9042
					[i_1362_]) * i_1370_
				       - (((Class157_Sub1) this).anIntArray9040
					  [i_1362_]) * i_1369_
				       + 16383) >> 14;
				((Class157_Sub1) this).anIntArray9040[i_1362_]
				    = i_1371_;
			    }
			    ((Class157_Sub1) this).anIntArray9040[i_1362_]
				+= ((Class157_Sub1) this).anInt9103;
			    ((Class157_Sub1) this).anIntArray9041[i_1362_]
				+= ((Class157_Sub1) this).anInt9104;
			    ((Class157_Sub1) this).anIntArray9042[i_1362_]
				+= ((Class157_Sub1) this).anInt9031;
			}
		    } else {
			for (int i_1372_ = 0; i_1372_ < is_1360_.length;
			     i_1372_++) {
			    int i_1373_ = is_1360_[i_1372_];
			    ((Class157_Sub1) this).anIntArray9040[i_1373_]
				-= ((Class157_Sub1) this).anInt9103;
			    ((Class157_Sub1) this).anIntArray9041[i_1373_]
				-= ((Class157_Sub1) this).anInt9104;
			    ((Class157_Sub1) this).anIntArray9042[i_1373_]
				-= ((Class157_Sub1) this).anInt9031;
			    if (i_1342_ != 0) {
				int i_1374_ = Class417.anIntArray4766[i_1342_];
				int i_1375_ = Class417.anIntArray4767[i_1342_];
				int i_1376_
				    = (((((Class157_Sub1) this).anIntArray9041
					 [i_1373_]) * i_1375_
					- (((Class157_Sub1) this)
					   .anIntArray9042[i_1373_]) * i_1374_
					+ 16383)
				       >> 14);
				((Class157_Sub1) this).anIntArray9042[i_1373_]
				    = ((((Class157_Sub1) this).anIntArray9041
					[i_1373_]) * i_1374_
				       + (((Class157_Sub1) this).anIntArray9042
					  [i_1373_]) * i_1375_
				       + 16383) >> 14;
				((Class157_Sub1) this).anIntArray9041[i_1373_]
				    = i_1376_;
			    }
			    if (i_1344_ != 0) {
				int i_1377_ = Class417.anIntArray4766[i_1344_];
				int i_1378_ = Class417.anIntArray4767[i_1344_];
				int i_1379_
				    = (((((Class157_Sub1) this).anIntArray9041
					 [i_1373_]) * i_1377_
					+ (((Class157_Sub1) this)
					   .anIntArray9040[i_1373_]) * i_1378_
					+ 16383)
				       >> 14);
				((Class157_Sub1) this).anIntArray9041[i_1373_]
				    = ((((Class157_Sub1) this).anIntArray9041
					[i_1373_]) * i_1378_
				       - (((Class157_Sub1) this).anIntArray9040
					  [i_1373_]) * i_1377_
				       + 16383) >> 14;
				((Class157_Sub1) this).anIntArray9040[i_1373_]
				    = i_1379_;
			    }
			    if (i_1343_ != 0) {
				int i_1380_ = Class417.anIntArray4766[i_1343_];
				int i_1381_ = Class417.anIntArray4767[i_1343_];
				int i_1382_
				    = (((((Class157_Sub1) this).anIntArray9042
					 [i_1373_]) * i_1380_
					+ (((Class157_Sub1) this)
					   .anIntArray9040[i_1373_]) * i_1381_
					+ 16383)
				       >> 14);
				((Class157_Sub1) this).anIntArray9042[i_1373_]
				    = ((((Class157_Sub1) this).anIntArray9042
					[i_1373_]) * i_1381_
				       - (((Class157_Sub1) this).anIntArray9040
					  [i_1373_]) * i_1380_
				       + 16383) >> 14;
				((Class157_Sub1) this).anIntArray9040[i_1373_]
				    = i_1382_;
			    }
			    ((Class157_Sub1) this).anIntArray9040[i_1373_]
				+= ((Class157_Sub1) this).anInt9103;
			    ((Class157_Sub1) this).anIntArray9041[i_1373_]
				+= ((Class157_Sub1) this).anInt9104;
			    ((Class157_Sub1) this).anIntArray9042[i_1373_]
				+= ((Class157_Sub1) this).anInt9031;
			}
		    }
		}
	    }
	    if (bool) {
		for (int i_1383_ = 0; i_1383_ < i_1346_; i_1383_++) {
		    int i_1384_ = is[i_1383_];
		    if (i_1384_
			< ((Class157_Sub1) this).anIntArrayArray9033.length) {
			int[] is_1385_ = (((Class157_Sub1) this)
					  .anIntArrayArray9033[i_1384_]);
			for (int i_1386_ = 0; i_1386_ < is_1385_.length;
			     i_1386_++) {
			    int i_1387_ = is_1385_[i_1386_];
			    int i_1388_ = (((Class157_Sub1) this)
					   .anIntArray9100[i_1387_]);
			    int i_1389_ = (((Class157_Sub1) this)
					   .anIntArray9100[i_1387_ + 1]);
			    for (int i_1390_ = i_1388_;
				 (i_1390_ < i_1389_
				  && (((Class157_Sub1) this).aShortArray9089
				      [i_1390_]) != 0);
				 i_1390_++) {
				int i_1391_ = (((((Class157_Sub1) this)
						 .aShortArray9089[i_1390_])
						& 0xffff)
					       - 1);
				if (i_1344_ != 0) {
				    int i_1392_
					= Class417.anIntArray4766[i_1344_];
				    int i_1393_
					= Class417.anIntArray4767[i_1344_];
				    int i_1394_ = (((((Class157_Sub1) this)
						     .aShortArray9049
						     [i_1391_]) * i_1392_
						    + (((Class157_Sub1) this)
						       .aShortArray9048
						       [i_1391_]) * i_1393_
						    + 16383)
						   >> 14);
				    ((Class157_Sub1) this).aShortArray9049
					[i_1391_]
					= (short) (((((Class157_Sub1) this)
						     .aShortArray9049
						     [i_1391_]) * i_1393_
						    - (((Class157_Sub1) this)
						       .aShortArray9048
						       [i_1391_]) * i_1392_
						    + 16383)
						   >> 14);
				    ((Class157_Sub1) this).aShortArray9048
					[i_1391_]
					= (short) i_1394_;
				}
				if (i_1342_ != 0) {
				    int i_1395_
					= Class417.anIntArray4766[i_1342_];
				    int i_1396_
					= Class417.anIntArray4767[i_1342_];
				    int i_1397_ = (((((Class157_Sub1) this)
						     .aShortArray9049
						     [i_1391_]) * i_1396_
						    - (((Class157_Sub1) this)
						       .aShortArray9038
						       [i_1391_]) * i_1395_
						    + 16383)
						   >> 14);
				    ((Class157_Sub1) this).aShortArray9038
					[i_1391_]
					= (short) (((((Class157_Sub1) this)
						     .aShortArray9049
						     [i_1391_]) * i_1395_
						    + (((Class157_Sub1) this)
						       .aShortArray9038
						       [i_1391_]) * i_1396_
						    + 16383)
						   >> 14);
				    ((Class157_Sub1) this).aShortArray9049
					[i_1391_]
					= (short) i_1397_;
				}
				if (i_1343_ != 0) {
				    int i_1398_
					= Class417.anIntArray4766[i_1343_];
				    int i_1399_
					= Class417.anIntArray4767[i_1343_];
				    int i_1400_ = (((((Class157_Sub1) this)
						     .aShortArray9038
						     [i_1391_]) * i_1398_
						    + (((Class157_Sub1) this)
						       .aShortArray9048
						       [i_1391_]) * i_1399_
						    + 16383)
						   >> 14);
				    ((Class157_Sub1) this).aShortArray9038
					[i_1391_]
					= (short) (((((Class157_Sub1) this)
						     .aShortArray9038
						     [i_1391_]) * i_1399_
						    - (((Class157_Sub1) this)
						       .aShortArray9048
						       [i_1391_]) * i_1398_
						    + 16383)
						   >> 14);
				    ((Class157_Sub1) this).aShortArray9048
					[i_1391_]
					= (short) i_1400_;
				}
			    }
			}
		    }
		}
		method8367();
	    }
	} else if (i == 3) {
	    for (int i_1401_ = 0; i_1401_ < i_1346_; i_1401_++) {
		int i_1402_ = is[i_1401_];
		if (i_1402_
		    < ((Class157_Sub1) this).anIntArrayArray9033.length) {
		    int[] is_1403_
			= ((Class157_Sub1) this).anIntArrayArray9033[i_1402_];
		    for (int i_1404_ = 0; i_1404_ < is_1403_.length;
			 i_1404_++) {
			int i_1405_ = is_1403_[i_1404_];
			((Class157_Sub1) this).anIntArray9040[i_1405_]
			    -= ((Class157_Sub1) this).anInt9103;
			((Class157_Sub1) this).anIntArray9041[i_1405_]
			    -= ((Class157_Sub1) this).anInt9104;
			((Class157_Sub1) this).anIntArray9042[i_1405_]
			    -= ((Class157_Sub1) this).anInt9031;
			((Class157_Sub1) this).anIntArray9040[i_1405_]
			    = (((Class157_Sub1) this).anIntArray9040[i_1405_]
			       * i_1342_) >> 7;
			((Class157_Sub1) this).anIntArray9041[i_1405_]
			    = (((Class157_Sub1) this).anIntArray9041[i_1405_]
			       * i_1343_) >> 7;
			((Class157_Sub1) this).anIntArray9042[i_1405_]
			    = (((Class157_Sub1) this).anIntArray9042[i_1405_]
			       * i_1344_) >> 7;
			((Class157_Sub1) this).anIntArray9040[i_1405_]
			    += ((Class157_Sub1) this).anInt9103;
			((Class157_Sub1) this).anIntArray9041[i_1405_]
			    += ((Class157_Sub1) this).anInt9104;
			((Class157_Sub1) this).anIntArray9042[i_1405_]
			    += ((Class157_Sub1) this).anInt9031;
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class157_Sub1) this).anIntArrayArray9063 != null) {
		boolean bool_1406_ = false;
		for (int i_1407_ = 0; i_1407_ < i_1346_; i_1407_++) {
		    int i_1408_ = is[i_1407_];
		    if (i_1408_
			< ((Class157_Sub1) this).anIntArrayArray9063.length) {
			int[] is_1409_ = (((Class157_Sub1) this)
					  .anIntArrayArray9063[i_1408_]);
			for (int i_1410_ = 0; i_1410_ < is_1409_.length;
			     i_1410_++) {
			    int i_1411_ = is_1409_[i_1410_];
			    int i_1412_ = (((((Class157_Sub1) this)
					     .aByteArray9058[i_1411_])
					    & 0xff)
					   + i_1342_ * 8);
			    if (i_1412_ < 0)
				i_1412_ = 0;
			    else if (i_1412_ > 255)
				i_1412_ = 255;
			    ((Class157_Sub1) this).aByteArray9058[i_1411_]
				= (byte) i_1412_;
			}
			bool_1406_ = bool_1406_ | is_1409_.length > 0;
		    }
		}
		if (bool_1406_) {
		    if (((Class157_Sub1) this).aClass348Array9078 != null) {
			for (int i_1413_ = 0;
			     i_1413_ < ((Class157_Sub1) this).anInt9092;
			     i_1413_++) {
			    Class348 class348 = (((Class157_Sub1) this)
						 .aClass348Array9078[i_1413_]);
			    Class328 class328 = (((Class157_Sub1) this)
						 .aClass328Array9094[i_1413_]);
			    ((Class328) class328).anInt3503
				= (((Class328) class328).anInt3503 & 0xffffff
				   | 255 - ((((Class157_Sub1) this)
					     .aByteArray9058
					     [((Class348) class348).anInt3653])
					    & 0xff) << 24);
			}
		    }
		    method8356();
		}
	    }
	} else if (i == 7) {
	    if (((Class157_Sub1) this).anIntArrayArray9063 != null) {
		boolean bool_1414_ = false;
		for (int i_1415_ = 0; i_1415_ < i_1346_; i_1415_++) {
		    int i_1416_ = is[i_1415_];
		    if (i_1416_
			< ((Class157_Sub1) this).anIntArrayArray9063.length) {
			int[] is_1417_ = (((Class157_Sub1) this)
					  .anIntArrayArray9063[i_1416_]);
			for (int i_1418_ = 0; i_1418_ < is_1417_.length;
			     i_1418_++) {
			    int i_1419_ = is_1417_[i_1418_];
			    int i_1420_ = ((((Class157_Sub1) this)
					    .aShortArray9057[i_1419_])
					   & 0xffff);
			    int i_1421_ = i_1420_ >> 10 & 0x3f;
			    int i_1422_ = i_1420_ >> 7 & 0x7;
			    int i_1423_ = i_1420_ & 0x7f;
			    i_1421_ = i_1421_ + i_1342_ & 0x3f;
			    i_1422_ += i_1343_ / 4;
			    if (i_1422_ < 0)
				i_1422_ = 0;
			    else if (i_1422_ > 7)
				i_1422_ = 7;
			    i_1423_ += i_1344_;
			    if (i_1423_ < 0)
				i_1423_ = 0;
			    else if (i_1423_ > 127)
				i_1423_ = 127;
			    ((Class157_Sub1) this).aShortArray9057[i_1419_]
				= (short) (i_1421_ << 10 | i_1422_ << 7
					   | i_1423_);
			}
			bool_1414_ = bool_1414_ | is_1417_.length > 0;
		    }
		}
		if (bool_1414_) {
		    if (((Class157_Sub1) this).aClass348Array9078 != null) {
			for (int i_1424_ = 0;
			     i_1424_ < ((Class157_Sub1) this).anInt9092;
			     i_1424_++) {
			    Class348 class348 = (((Class157_Sub1) this)
						 .aClass348Array9078[i_1424_]);
			    Class328 class328 = (((Class157_Sub1) this)
						 .aClass328Array9094[i_1424_]);
			    ((Class328) class328).anInt3503
				= (((Class328) class328).anInt3503 & ~0xffffff
				   | (Class649.anIntArray8420
				      [((((Class157_Sub1) this).aShortArray9057
					 [((Class348) class348).anInt3653])
					& 0xffff)]) & 0xffffff);
			}
		    }
		    method8356();
		}
	    }
	} else if (i == 8) {
	    if (((Class157_Sub1) this).anIntArrayArray9095 != null) {
		for (int i_1425_ = 0; i_1425_ < i_1346_; i_1425_++) {
		    int i_1426_ = is[i_1425_];
		    if (i_1426_
			< ((Class157_Sub1) this).anIntArrayArray9095.length) {
			int[] is_1427_ = (((Class157_Sub1) this)
					  .anIntArrayArray9095[i_1426_]);
			for (int i_1428_ = 0; i_1428_ < is_1427_.length;
			     i_1428_++) {
			    Class328 class328
				= (((Class157_Sub1) this).aClass328Array9094
				   [is_1427_[i_1428_]]);
			    ((Class328) class328).anInt3508 += i_1342_;
			    ((Class328) class328).anInt3507 += i_1343_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class157_Sub1) this).anIntArrayArray9095 != null) {
		for (int i_1429_ = 0; i_1429_ < i_1346_; i_1429_++) {
		    int i_1430_ = is[i_1429_];
		    if (i_1430_
			< ((Class157_Sub1) this).anIntArrayArray9095.length) {
			int[] is_1431_ = (((Class157_Sub1) this)
					  .anIntArrayArray9095[i_1430_]);
			for (int i_1432_ = 0; i_1432_ < is_1431_.length;
			     i_1432_++) {
			    Class328 class328
				= (((Class157_Sub1) this).aClass328Array9094
				   [is_1431_[i_1432_]]);
			    ((Class328) class328).anInt3504
				= (((Class328) class328).anInt3504 * i_1342_
				   >> 7);
			    ((Class328) class328).anInt3506
				= (((Class328) class328).anInt3506 * i_1343_
				   >> 7);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class157_Sub1) this).anIntArrayArray9095 != null) {
		for (int i_1433_ = 0; i_1433_ < i_1346_; i_1433_++) {
		    int i_1434_ = is[i_1433_];
		    if (i_1434_
			< ((Class157_Sub1) this).anIntArrayArray9095.length) {
			int[] is_1435_ = (((Class157_Sub1) this)
					  .anIntArrayArray9095[i_1434_]);
			for (int i_1436_ = 0; i_1436_ < is_1435_.length;
			     i_1436_++) {
			    Class328 class328
				= (((Class157_Sub1) this).aClass328Array9094
				   [is_1435_[i_1436_]]);
			    ((Class328) class328).anInt3505
				= (((Class328) class328).anInt3505 + i_1342_
				   & 0x3fff);
			}
		    }
		}
	    }
	}
    }
    
    void method2030() {
	/* empty */
    }
    
    public int method1948() {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	return ((Class157_Sub1) this).anInt9066;
    }
    
    public boolean method1967() {
	return ((Class157_Sub1) this).aBool9051;
    }
    
    public void method1974(short i, short i_1437_) {
	for (int i_1438_ = 0; i_1438_ < ((Class157_Sub1) this).anInt9055;
	     i_1438_++) {
	    if (((Class157_Sub1) this).aShortArray9057[i_1438_] == i)
		((Class157_Sub1) this).aShortArray9057[i_1438_] = i_1437_;
	}
	if (((Class157_Sub1) this).aClass348Array9078 != null) {
	    for (int i_1439_ = 0; i_1439_ < ((Class157_Sub1) this).anInt9092;
		 i_1439_++) {
		Class348 class348
		    = ((Class157_Sub1) this).aClass348Array9078[i_1439_];
		Class328 class328
		    = ((Class157_Sub1) this).aClass328Array9094[i_1439_];
		((Class328) class328).anInt3503
		    = (((Class328) class328).anInt3503 & ~0xffffff
		       | ((Class649.anIntArray8420
			   [(((Class157_Sub1) this).aShortArray9057
			     [((Class348) class348).anInt3653]) & 0xffff])
			  & 0xffffff));
	    }
	}
	method8356();
    }
    
    void method1868() {
	/* empty */
    }
    
    void method2027() {
	/* empty */
    }
    
    void method2028() {
	/* empty */
    }
    
    void method2029() {
	/* empty */
    }
    
    public Class144[] method1985() {
	return ((Class157_Sub1) this).aClass144Array9075;
    }
    
    public int method1979() {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	return ((Class157_Sub1) this).anInt9093;
    }
    
    public void method1941(int i) {
	int i_1440_ = Class417.anIntArray4766[i];
	int i_1441_ = Class417.anIntArray4767[i];
	for (int i_1442_ = 0; i_1442_ < ((Class157_Sub1) this).anInt9039;
	     i_1442_++) {
	    int i_1443_
		= ((((Class157_Sub1) this).anIntArray9041[i_1442_] * i_1440_
		    + ((Class157_Sub1) this).anIntArray9040[i_1442_] * i_1441_)
		   >> 14);
	    ((Class157_Sub1) this).anIntArray9041[i_1442_]
		= ((((Class157_Sub1) this).anIntArray9041[i_1442_] * i_1441_
		    - ((Class157_Sub1) this).anIntArray9040[i_1442_] * i_1440_)
		   >> 14);
	    ((Class157_Sub1) this).anIntArray9040[i_1442_] = i_1443_;
	}
	method8385();
	((Class157_Sub1) this).aBool9046 = false;
    }
    
    public int method1902() {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	return ((Class157_Sub1) this).anInt9079;
    }
    
    void method8378() {
	if (((Class157_Sub1) this).aBool9071) {
	    ((Class157_Sub1) this).aBool9071 = false;
	    if (((Class157_Sub1) this).aClass170Array9090 == null
		&& ((Class157_Sub1) this).aClass144Array9075 == null
		&& ((Class157_Sub1) this).aClass348Array9078 == null
		&& !Class338.method4382(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		boolean bool = false;
		boolean bool_1444_ = false;
		boolean bool_1445_ = false;
		if (((Class157_Sub1) this).anIntArray9040 != null
		    && !Class338.method4381(((Class157_Sub1) this).anInt9034,
					    (((Class157_Sub1) this)
					     .anInt9035))) {
		    if (((Class157_Sub1) this).aClass354_9045 == null
			|| ((Class157_Sub1) this).aClass354_9045
			       .method4573()) {
			if (!((Class157_Sub1) this).aBool9046)
			    method8358();
			bool = true;
		    } else
			((Class157_Sub1) this).aBool9071 = true;
		}
		if (((Class157_Sub1) this).anIntArray9041 != null
		    && !Class338.method4401(((Class157_Sub1) this).anInt9034,
					    (((Class157_Sub1) this)
					     .anInt9035))) {
		    if (((Class157_Sub1) this).aClass354_9045 == null
			|| ((Class157_Sub1) this).aClass354_9045
			       .method4573()) {
			if (!((Class157_Sub1) this).aBool9046)
			    method8358();
			bool_1444_ = true;
		    } else
			((Class157_Sub1) this).aBool9071 = true;
		}
		if (((Class157_Sub1) this).anIntArray9042 != null
		    && !Class338.method4402(((Class157_Sub1) this).anInt9034,
					    (((Class157_Sub1) this)
					     .anInt9035))) {
		    if (((Class157_Sub1) this).aClass354_9045 == null
			|| ((Class157_Sub1) this).aClass354_9045
			       .method4573()) {
			if (!((Class157_Sub1) this).aBool9046)
			    method8358();
			bool_1445_ = true;
		    } else
			((Class157_Sub1) this).aBool9071 = true;
		}
		if (bool)
		    ((Class157_Sub1) this).anIntArray9040 = null;
		if (bool_1444_)
		    ((Class157_Sub1) this).anIntArray9041 = null;
		if (bool_1445_)
		    ((Class157_Sub1) this).anIntArray9042 = null;
	    }
	    if (((Class157_Sub1) this).aShortArray9089 != null
		&& ((Class157_Sub1) this).anIntArray9040 == null
		&& ((Class157_Sub1) this).anIntArray9041 == null
		&& ((Class157_Sub1) this).anIntArray9042 == null) {
		((Class157_Sub1) this).aShortArray9089 = null;
		((Class157_Sub1) this).anIntArray9100 = null;
	    }
	while_37_:
	    do {
		if (((Class157_Sub1) this).aByteArray9052 != null
		    && !Class338.method4478(((Class157_Sub1) this).anInt9034,
					    (((Class157_Sub1) this)
					     .anInt9035))) {
		    do {
			if ((((Class157_Sub1) this).anInt9035 & 0x37) != 0) {
			    if (((Class157_Sub1) this).aClass354_9086 != null
				&& !((Class157_Sub1) this).aClass354_9086
					.method4573())
				break;
			} else if ((((Class157_Sub1) this).aClass354_9050
				    != null)
				   && !((Class157_Sub1) this)
					   .aClass354_9050.method4573())
			    break;
			((Class157_Sub1) this).aShortArray9038 = null;
			((Class157_Sub1) this).aShortArray9049 = null;
			((Class157_Sub1) this).aShortArray9048 = null;
			((Class157_Sub1) this).aByteArray9052 = null;
			break while_37_;
		    } while (false);
		    ((Class157_Sub1) this).aBool9071 = true;
		}
	    } while (false);
	    if (((Class157_Sub1) this).aShortArray9057 != null
		&& !Class338.method4404(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		if (((Class157_Sub1) this).aClass354_9050 == null
		    || ((Class157_Sub1) this).aClass354_9050.method4573())
		    ((Class157_Sub1) this).aShortArray9057 = null;
		else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aByteArray9058 != null
		&& !Class338.method4405(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		if (((Class157_Sub1) this).aClass354_9050 == null
		    || ((Class157_Sub1) this).aClass354_9050.method4573())
		    ((Class157_Sub1) this).aByteArray9058 = null;
		else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aFloatArray9061 != null
		&& !Class338.method4406(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		if (((Class157_Sub1) this).aClass354_9069 == null
		    || ((Class157_Sub1) this).aClass354_9069.method4573()) {
		    ((Class157_Sub1) this).aFloatArray9053 = null;
		    ((Class157_Sub1) this).aFloatArray9061 = null;
		} else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aShortArray9062 != null
		&& !Class338.method4410(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		if (((Class157_Sub1) this).aClass354_9050 == null
		    || ((Class157_Sub1) this).aClass354_9050.method4573())
		    ((Class157_Sub1) this).aShortArray9062 = null;
		else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aShortArray9059 != null
		&& !Class338.method4409(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		if ((((Class157_Sub1) this).aClass339_9101 == null
		     || ((Class157_Sub1) this).aClass339_9101.method4481())
		    && (((Class157_Sub1) this).aClass354_9050 == null
			|| ((Class157_Sub1) this).aClass354_9050
			       .method4573())) {
		    ((Class157_Sub1) this).aShortArray9091 = null;
		    ((Class157_Sub1) this).aShortArray9105 = null;
		    ((Class157_Sub1) this).aShortArray9059 = null;
		} else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aShortArray9043 != null) {
		if (((Class157_Sub1) this).aClass354_9045 == null
		    || ((Class157_Sub1) this).aClass354_9045.method4573())
		    ((Class157_Sub1) this).aShortArray9043 = null;
		else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aShortArray9047 != null) {
		if (((Class157_Sub1) this).aClass354_9050 == null
		    || ((Class157_Sub1) this).aClass354_9050.method4573())
		    ((Class157_Sub1) this).aShortArray9047 = null;
		else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).anIntArrayArray9063 != null
		&& !Class338.method4438(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		((Class157_Sub1) this).anIntArrayArray9063 = null;
		((Class157_Sub1) this).aShortArray9064 = null;
	    }
	    if (((Class157_Sub1) this).anIntArrayArray9033 != null
		&& !Class338.method4453(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		((Class157_Sub1) this).anIntArrayArray9033 = null;
		((Class157_Sub1) this).aShortArray9044 = null;
	    }
	    if (((Class157_Sub1) this).anIntArrayArray9095 != null
		&& !Class338.method4435(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035))
		((Class157_Sub1) this).anIntArrayArray9095 = null;
	    if (((Class157_Sub1) this).anIntArray9085 != null
		&& (((Class157_Sub1) this).anInt9034 & 0x800) == 0
		&& (((Class157_Sub1) this).anInt9034 & 0x40000) == 0) {
		((Class157_Sub1) this).anIntArray9085 = null;
		((Class157_Sub1) this).anIntArray9087 = null;
		((Class157_Sub1) this).anIntArray9099 = null;
	    }
	}
    }
    
    void method1960(int i, int[] is, int i_1446_, int i_1447_, int i_1448_,
		    boolean bool, int i_1449_, int[] is_1450_) {
	int i_1451_ = is.length;
	if (i == 0) {
	    i_1446_ <<= 4;
	    i_1447_ <<= 4;
	    i_1448_ <<= 4;
	    int i_1452_ = 0;
	    ((Class157_Sub1) this).anInt9103 = 0;
	    ((Class157_Sub1) this).anInt9104 = 0;
	    ((Class157_Sub1) this).anInt9031 = 0;
	    for (int i_1453_ = 0; i_1453_ < i_1451_; i_1453_++) {
		int i_1454_ = is[i_1453_];
		if (i_1454_
		    < ((Class157_Sub1) this).anIntArrayArray9033.length) {
		    int[] is_1455_
			= ((Class157_Sub1) this).anIntArrayArray9033[i_1454_];
		    for (int i_1456_ = 0; i_1456_ < is_1455_.length;
			 i_1456_++) {
			int i_1457_ = is_1455_[i_1456_];
			if (((Class157_Sub1) this).aShortArray9044 == null
			    || (i_1449_ & (((Class157_Sub1) this)
					   .aShortArray9044[i_1457_])) != 0) {
			    ((Class157_Sub1) this).anInt9103
				+= (((Class157_Sub1) this).anIntArray9040
				    [i_1457_]);
			    ((Class157_Sub1) this).anInt9104
				+= (((Class157_Sub1) this).anIntArray9041
				    [i_1457_]);
			    ((Class157_Sub1) this).anInt9031
				+= (((Class157_Sub1) this).anIntArray9042
				    [i_1457_]);
			    i_1452_++;
			}
		    }
		}
	    }
	    if (i_1452_ > 0) {
		((Class157_Sub1) this).anInt9103
		    = ((Class157_Sub1) this).anInt9103 / i_1452_ + i_1446_;
		((Class157_Sub1) this).anInt9104
		    = ((Class157_Sub1) this).anInt9104 / i_1452_ + i_1447_;
		((Class157_Sub1) this).anInt9031
		    = ((Class157_Sub1) this).anInt9031 / i_1452_ + i_1448_;
		((Class157_Sub1) this).aBool9106 = true;
	    } else {
		((Class157_Sub1) this).anInt9103 = i_1446_;
		((Class157_Sub1) this).anInt9104 = i_1447_;
		((Class157_Sub1) this).anInt9031 = i_1448_;
	    }
	} else if (i == 1) {
	    if (is_1450_ != null) {
		int i_1458_ = ((is_1450_[0] * i_1446_ + is_1450_[1] * i_1447_
				+ is_1450_[2] * i_1448_ + 8192)
			       >> 14);
		int i_1459_ = ((is_1450_[3] * i_1446_ + is_1450_[4] * i_1447_
				+ is_1450_[5] * i_1448_ + 8192)
			       >> 14);
		int i_1460_ = ((is_1450_[6] * i_1446_ + is_1450_[7] * i_1447_
				+ is_1450_[8] * i_1448_ + 8192)
			       >> 14);
		i_1446_ = i_1458_;
		i_1447_ = i_1459_;
		i_1448_ = i_1460_;
	    }
	    i_1446_ <<= 4;
	    i_1447_ <<= 4;
	    i_1448_ <<= 4;
	    for (int i_1461_ = 0; i_1461_ < i_1451_; i_1461_++) {
		int i_1462_ = is[i_1461_];
		if (i_1462_
		    < ((Class157_Sub1) this).anIntArrayArray9033.length) {
		    int[] is_1463_
			= ((Class157_Sub1) this).anIntArrayArray9033[i_1462_];
		    for (int i_1464_ = 0; i_1464_ < is_1463_.length;
			 i_1464_++) {
			int i_1465_ = is_1463_[i_1464_];
			if (((Class157_Sub1) this).aShortArray9044 == null
			    || (i_1449_ & (((Class157_Sub1) this)
					   .aShortArray9044[i_1465_])) != 0) {
			    ((Class157_Sub1) this).anIntArray9040[i_1465_]
				+= i_1446_;
			    ((Class157_Sub1) this).anIntArray9041[i_1465_]
				+= i_1447_;
			    ((Class157_Sub1) this).anIntArray9042[i_1465_]
				+= i_1448_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_1450_ != null) {
		int i_1466_ = is_1450_[9] << 4;
		int i_1467_ = is_1450_[10] << 4;
		int i_1468_ = is_1450_[11] << 4;
		int i_1469_ = is_1450_[12] << 4;
		int i_1470_ = is_1450_[13] << 4;
		int i_1471_ = is_1450_[14] << 4;
		if (((Class157_Sub1) this).aBool9106) {
		    int i_1472_
			= ((is_1450_[0] * ((Class157_Sub1) this).anInt9103
			    + is_1450_[3] * ((Class157_Sub1) this).anInt9104
			    + is_1450_[6] * ((Class157_Sub1) this).anInt9031
			    + 8192)
			   >> 14);
		    int i_1473_
			= ((is_1450_[1] * ((Class157_Sub1) this).anInt9103
			    + is_1450_[4] * ((Class157_Sub1) this).anInt9104
			    + is_1450_[7] * ((Class157_Sub1) this).anInt9031
			    + 8192)
			   >> 14);
		    int i_1474_
			= ((is_1450_[2] * ((Class157_Sub1) this).anInt9103
			    + is_1450_[5] * ((Class157_Sub1) this).anInt9104
			    + is_1450_[8] * ((Class157_Sub1) this).anInt9031
			    + 8192)
			   >> 14);
		    i_1472_ += i_1469_;
		    i_1473_ += i_1470_;
		    i_1474_ += i_1471_;
		    ((Class157_Sub1) this).anInt9103 = i_1472_;
		    ((Class157_Sub1) this).anInt9104 = i_1473_;
		    ((Class157_Sub1) this).anInt9031 = i_1474_;
		    ((Class157_Sub1) this).aBool9106 = false;
		}
		int[] is_1475_ = new int[9];
		int i_1476_ = Class417.anIntArray4767[i_1446_];
		int i_1477_ = Class417.anIntArray4766[i_1446_];
		int i_1478_ = Class417.anIntArray4767[i_1447_];
		int i_1479_ = Class417.anIntArray4766[i_1447_];
		int i_1480_ = Class417.anIntArray4767[i_1448_];
		int i_1481_ = Class417.anIntArray4766[i_1448_];
		int i_1482_ = i_1477_ * i_1480_ + 8192 >> 14;
		int i_1483_ = i_1477_ * i_1481_ + 8192 >> 14;
		is_1475_[0]
		    = i_1478_ * i_1480_ + i_1479_ * i_1483_ + 8192 >> 14;
		is_1475_[1]
		    = -i_1478_ * i_1481_ + i_1479_ * i_1482_ + 8192 >> 14;
		is_1475_[2] = i_1479_ * i_1476_ + 8192 >> 14;
		is_1475_[3] = i_1476_ * i_1481_ + 8192 >> 14;
		is_1475_[4] = i_1476_ * i_1480_ + 8192 >> 14;
		is_1475_[5] = -i_1477_;
		is_1475_[6]
		    = -i_1479_ * i_1480_ + i_1478_ * i_1483_ + 8192 >> 14;
		is_1475_[7]
		    = i_1479_ * i_1481_ + i_1478_ * i_1482_ + 8192 >> 14;
		is_1475_[8] = i_1478_ * i_1476_ + 8192 >> 14;
		int i_1484_
		    = ((is_1475_[0] * -((Class157_Sub1) this).anInt9103
			+ is_1475_[1] * -((Class157_Sub1) this).anInt9104
			+ is_1475_[2] * -((Class157_Sub1) this).anInt9031
			+ 8192)
		       >> 14);
		int i_1485_
		    = ((is_1475_[3] * -((Class157_Sub1) this).anInt9103
			+ is_1475_[4] * -((Class157_Sub1) this).anInt9104
			+ is_1475_[5] * -((Class157_Sub1) this).anInt9031
			+ 8192)
		       >> 14);
		int i_1486_
		    = ((is_1475_[6] * -((Class157_Sub1) this).anInt9103
			+ is_1475_[7] * -((Class157_Sub1) this).anInt9104
			+ is_1475_[8] * -((Class157_Sub1) this).anInt9031
			+ 8192)
		       >> 14);
		int i_1487_ = i_1484_ + ((Class157_Sub1) this).anInt9103;
		int i_1488_ = i_1485_ + ((Class157_Sub1) this).anInt9104;
		int i_1489_ = i_1486_ + ((Class157_Sub1) this).anInt9031;
		int[] is_1490_ = new int[9];
		for (int i_1491_ = 0; i_1491_ < 3; i_1491_++) {
		    for (int i_1492_ = 0; i_1492_ < 3; i_1492_++) {
			int i_1493_ = 0;
			for (int i_1494_ = 0; i_1494_ < 3; i_1494_++)
			    i_1493_ += (is_1475_[i_1491_ * 3 + i_1494_]
					* is_1450_[i_1492_ * 3 + i_1494_]);
			is_1490_[i_1491_ * 3 + i_1492_] = i_1493_ + 8192 >> 14;
		    }
		}
		int i_1495_ = ((is_1475_[0] * i_1469_ + is_1475_[1] * i_1470_
				+ is_1475_[2] * i_1471_ + 8192)
			       >> 14);
		int i_1496_ = ((is_1475_[3] * i_1469_ + is_1475_[4] * i_1470_
				+ is_1475_[5] * i_1471_ + 8192)
			       >> 14);
		int i_1497_ = ((is_1475_[6] * i_1469_ + is_1475_[7] * i_1470_
				+ is_1475_[8] * i_1471_ + 8192)
			       >> 14);
		i_1495_ += i_1487_;
		i_1496_ += i_1488_;
		i_1497_ += i_1489_;
		int[] is_1498_ = new int[9];
		for (int i_1499_ = 0; i_1499_ < 3; i_1499_++) {
		    for (int i_1500_ = 0; i_1500_ < 3; i_1500_++) {
			int i_1501_ = 0;
			for (int i_1502_ = 0; i_1502_ < 3; i_1502_++)
			    i_1501_ += (is_1450_[i_1499_ * 3 + i_1502_]
					* is_1490_[i_1500_ + i_1502_ * 3]);
			is_1498_[i_1499_ * 3 + i_1500_] = i_1501_ + 8192 >> 14;
		    }
		}
		int i_1503_ = ((is_1450_[0] * i_1495_ + is_1450_[1] * i_1496_
				+ is_1450_[2] * i_1497_ + 8192)
			       >> 14);
		int i_1504_ = ((is_1450_[3] * i_1495_ + is_1450_[4] * i_1496_
				+ is_1450_[5] * i_1497_ + 8192)
			       >> 14);
		int i_1505_ = ((is_1450_[6] * i_1495_ + is_1450_[7] * i_1496_
				+ is_1450_[8] * i_1497_ + 8192)
			       >> 14);
		i_1503_ += i_1466_;
		i_1504_ += i_1467_;
		i_1505_ += i_1468_;
		for (int i_1506_ = 0; i_1506_ < i_1451_; i_1506_++) {
		    int i_1507_ = is[i_1506_];
		    if (i_1507_
			< ((Class157_Sub1) this).anIntArrayArray9033.length) {
			int[] is_1508_ = (((Class157_Sub1) this)
					  .anIntArrayArray9033[i_1507_]);
			for (int i_1509_ = 0; i_1509_ < is_1508_.length;
			     i_1509_++) {
			    int i_1510_ = is_1508_[i_1509_];
			    if (((Class157_Sub1) this).aShortArray9044 == null
				|| ((i_1449_ & (((Class157_Sub1) this)
						.aShortArray9044[i_1510_]))
				    != 0)) {
				int i_1511_
				    = (is_1498_[0] * (((Class157_Sub1) this)
						      .anIntArray9040[i_1510_])
				       + is_1498_[1] * (((Class157_Sub1) this)
							.anIntArray9041
							[i_1510_])
				       + is_1498_[2] * (((Class157_Sub1) this)
							.anIntArray9042
							[i_1510_])
				       + 8192) >> 14;
				int i_1512_
				    = (is_1498_[3] * (((Class157_Sub1) this)
						      .anIntArray9040[i_1510_])
				       + is_1498_[4] * (((Class157_Sub1) this)
							.anIntArray9041
							[i_1510_])
				       + is_1498_[5] * (((Class157_Sub1) this)
							.anIntArray9042
							[i_1510_])
				       + 8192) >> 14;
				int i_1513_
				    = (is_1498_[6] * (((Class157_Sub1) this)
						      .anIntArray9040[i_1510_])
				       + is_1498_[7] * (((Class157_Sub1) this)
							.anIntArray9041
							[i_1510_])
				       + is_1498_[8] * (((Class157_Sub1) this)
							.anIntArray9042
							[i_1510_])
				       + 8192) >> 14;
				i_1511_ += i_1503_;
				i_1512_ += i_1504_;
				i_1513_ += i_1505_;
				((Class157_Sub1) this).anIntArray9040[i_1510_]
				    = i_1511_;
				((Class157_Sub1) this).anIntArray9041[i_1510_]
				    = i_1512_;
				((Class157_Sub1) this).anIntArray9042[i_1510_]
				    = i_1513_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1514_ = 0; i_1514_ < i_1451_; i_1514_++) {
		    int i_1515_ = is[i_1514_];
		    if (i_1515_
			< ((Class157_Sub1) this).anIntArrayArray9033.length) {
			int[] is_1516_ = (((Class157_Sub1) this)
					  .anIntArrayArray9033[i_1515_]);
			for (int i_1517_ = 0; i_1517_ < is_1516_.length;
			     i_1517_++) {
			    int i_1518_ = is_1516_[i_1517_];
			    if (((Class157_Sub1) this).aShortArray9044 == null
				|| ((i_1449_ & (((Class157_Sub1) this)
						.aShortArray9044[i_1518_]))
				    != 0)) {
				((Class157_Sub1) this).anIntArray9040[i_1518_]
				    -= ((Class157_Sub1) this).anInt9103;
				((Class157_Sub1) this).anIntArray9041[i_1518_]
				    -= ((Class157_Sub1) this).anInt9104;
				((Class157_Sub1) this).anIntArray9042[i_1518_]
				    -= ((Class157_Sub1) this).anInt9031;
				if (i_1448_ != 0) {
				    int i_1519_
					= Class417.anIntArray4766[i_1448_];
				    int i_1520_
					= Class417.anIntArray4767[i_1448_];
				    int i_1521_
					= ((((Class157_Sub1) this)
					    .anIntArray9041[i_1518_]) * i_1519_
					   + ((((Class157_Sub1) this)
					       .anIntArray9040[i_1518_])
					      * i_1520_)
					   + 16383) >> 14;
				    ((Class157_Sub1) this).anIntArray9041
					[i_1518_]
					= ((((Class157_Sub1) this)
					    .anIntArray9041[i_1518_]) * i_1520_
					   - ((((Class157_Sub1) this)
					       .anIntArray9040[i_1518_])
					      * i_1519_)
					   + 16383) >> 14;
				    ((Class157_Sub1) this).anIntArray9040
					[i_1518_]
					= i_1521_;
				}
				if (i_1446_ != 0) {
				    int i_1522_
					= Class417.anIntArray4766[i_1446_];
				    int i_1523_
					= Class417.anIntArray4767[i_1446_];
				    int i_1524_
					= ((((Class157_Sub1) this)
					    .anIntArray9041[i_1518_]) * i_1523_
					   - ((((Class157_Sub1) this)
					       .anIntArray9042[i_1518_])
					      * i_1522_)
					   + 16383) >> 14;
				    ((Class157_Sub1) this).anIntArray9042
					[i_1518_]
					= ((((Class157_Sub1) this)
					    .anIntArray9041[i_1518_]) * i_1522_
					   + ((((Class157_Sub1) this)
					       .anIntArray9042[i_1518_])
					      * i_1523_)
					   + 16383) >> 14;
				    ((Class157_Sub1) this).anIntArray9041
					[i_1518_]
					= i_1524_;
				}
				if (i_1447_ != 0) {
				    int i_1525_
					= Class417.anIntArray4766[i_1447_];
				    int i_1526_
					= Class417.anIntArray4767[i_1447_];
				    int i_1527_
					= ((((Class157_Sub1) this)
					    .anIntArray9042[i_1518_]) * i_1525_
					   + ((((Class157_Sub1) this)
					       .anIntArray9040[i_1518_])
					      * i_1526_)
					   + 16383) >> 14;
				    ((Class157_Sub1) this).anIntArray9042
					[i_1518_]
					= ((((Class157_Sub1) this)
					    .anIntArray9042[i_1518_]) * i_1526_
					   - ((((Class157_Sub1) this)
					       .anIntArray9040[i_1518_])
					      * i_1525_)
					   + 16383) >> 14;
				    ((Class157_Sub1) this).anIntArray9040
					[i_1518_]
					= i_1527_;
				}
				((Class157_Sub1) this).anIntArray9040[i_1518_]
				    += ((Class157_Sub1) this).anInt9103;
				((Class157_Sub1) this).anIntArray9041[i_1518_]
				    += ((Class157_Sub1) this).anInt9104;
				((Class157_Sub1) this).anIntArray9042[i_1518_]
				    += ((Class157_Sub1) this).anInt9031;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_1528_ = 0; i_1528_ < i_1451_; i_1528_++) {
			int i_1529_ = is[i_1528_];
			if (i_1529_ < (((Class157_Sub1) this)
				       .anIntArrayArray9033).length) {
			    int[] is_1530_ = (((Class157_Sub1) this)
					      .anIntArrayArray9033[i_1529_]);
			    for (int i_1531_ = 0; i_1531_ < is_1530_.length;
				 i_1531_++) {
				int i_1532_ = is_1530_[i_1531_];
				if ((((Class157_Sub1) this).aShortArray9044
				     == null)
				    || ((i_1449_ & (((Class157_Sub1) this)
						    .aShortArray9044[i_1532_]))
					!= 0)) {
				    int i_1533_ = (((Class157_Sub1) this)
						   .anIntArray9100[i_1532_]);
				    int i_1534_
					= (((Class157_Sub1) this)
					   .anIntArray9100[i_1532_ + 1]);
				    for (int i_1535_ = i_1533_;
					 (i_1535_ < i_1534_
					  && (((Class157_Sub1) this)
					      .aShortArray9089[i_1535_]) != 0);
					 i_1535_++) {
					int i_1536_
					    = (((((Class157_Sub1) this)
						 .aShortArray9089[i_1535_])
						& 0xffff)
					       - 1);
					if (i_1448_ != 0) {
					    int i_1537_
						= (Class417.anIntArray4766
						   [i_1448_]);
					    int i_1538_
						= (Class417.anIntArray4767
						   [i_1448_]);
					    int i_1539_
						= (((((Class157_Sub1) this)
						     .aShortArray9049
						     [i_1536_]) * i_1537_
						    + (((Class157_Sub1) this)
						       .aShortArray9048
						       [i_1536_]) * i_1538_
						    + 16383)
						   >> 14);
					    ((Class157_Sub1) this)
						.aShortArray9049[i_1536_]
						= (short) ((((((Class157_Sub1)
							       this)
							      .aShortArray9049
							      [i_1536_])
							     * i_1538_)
							    - ((((Class157_Sub1)
								 this)
								.aShortArray9048
								[i_1536_])
							       * i_1537_)
							    + 16383)
							   >> 14);
					    ((Class157_Sub1) this)
						.aShortArray9048[i_1536_]
						= (short) i_1539_;
					}
					if (i_1446_ != 0) {
					    int i_1540_
						= (Class417.anIntArray4766
						   [i_1446_]);
					    int i_1541_
						= (Class417.anIntArray4767
						   [i_1446_]);
					    int i_1542_
						= (((((Class157_Sub1) this)
						     .aShortArray9049
						     [i_1536_]) * i_1541_
						    - (((Class157_Sub1) this)
						       .aShortArray9038
						       [i_1536_]) * i_1540_
						    + 16383)
						   >> 14);
					    ((Class157_Sub1) this)
						.aShortArray9038[i_1536_]
						= (short) ((((((Class157_Sub1)
							       this)
							      .aShortArray9049
							      [i_1536_])
							     * i_1540_)
							    + ((((Class157_Sub1)
								 this)
								.aShortArray9038
								[i_1536_])
							       * i_1541_)
							    + 16383)
							   >> 14);
					    ((Class157_Sub1) this)
						.aShortArray9049[i_1536_]
						= (short) i_1542_;
					}
					if (i_1447_ != 0) {
					    int i_1543_
						= (Class417.anIntArray4766
						   [i_1447_]);
					    int i_1544_
						= (Class417.anIntArray4767
						   [i_1447_]);
					    int i_1545_
						= (((((Class157_Sub1) this)
						     .aShortArray9038
						     [i_1536_]) * i_1543_
						    + (((Class157_Sub1) this)
						       .aShortArray9048
						       [i_1536_]) * i_1544_
						    + 16383)
						   >> 14);
					    ((Class157_Sub1) this)
						.aShortArray9038[i_1536_]
						= (short) ((((((Class157_Sub1)
							       this)
							      .aShortArray9038
							      [i_1536_])
							     * i_1544_)
							    - ((((Class157_Sub1)
								 this)
								.aShortArray9048
								[i_1536_])
							       * i_1543_)
							    + 16383)
							   >> 14);
					    ((Class157_Sub1) this)
						.aShortArray9048[i_1536_]
						= (short) i_1545_;
					}
				    }
				}
			    }
			}
		    }
		    method8367();
		}
	    }
	} else if (i == 3) {
	    if (is_1450_ != null) {
		int i_1546_ = is_1450_[9] << 4;
		int i_1547_ = is_1450_[10] << 4;
		int i_1548_ = is_1450_[11] << 4;
		int i_1549_ = is_1450_[12] << 4;
		int i_1550_ = is_1450_[13] << 4;
		int i_1551_ = is_1450_[14] << 4;
		if (((Class157_Sub1) this).aBool9106) {
		    int i_1552_
			= ((is_1450_[0] * ((Class157_Sub1) this).anInt9103
			    + is_1450_[3] * ((Class157_Sub1) this).anInt9104
			    + is_1450_[6] * ((Class157_Sub1) this).anInt9031
			    + 8192)
			   >> 14);
		    int i_1553_
			= ((is_1450_[1] * ((Class157_Sub1) this).anInt9103
			    + is_1450_[4] * ((Class157_Sub1) this).anInt9104
			    + is_1450_[7] * ((Class157_Sub1) this).anInt9031
			    + 8192)
			   >> 14);
		    int i_1554_
			= ((is_1450_[2] * ((Class157_Sub1) this).anInt9103
			    + is_1450_[5] * ((Class157_Sub1) this).anInt9104
			    + is_1450_[8] * ((Class157_Sub1) this).anInt9031
			    + 8192)
			   >> 14);
		    i_1552_ += i_1549_;
		    i_1553_ += i_1550_;
		    i_1554_ += i_1551_;
		    ((Class157_Sub1) this).anInt9103 = i_1552_;
		    ((Class157_Sub1) this).anInt9104 = i_1553_;
		    ((Class157_Sub1) this).anInt9031 = i_1554_;
		    ((Class157_Sub1) this).aBool9106 = false;
		}
		int i_1555_ = i_1446_ << 15 >> 7;
		int i_1556_ = i_1447_ << 15 >> 7;
		int i_1557_ = i_1448_ << 15 >> 7;
		int i_1558_
		    = i_1555_ * -((Class157_Sub1) this).anInt9103 + 8192 >> 14;
		int i_1559_
		    = i_1556_ * -((Class157_Sub1) this).anInt9104 + 8192 >> 14;
		int i_1560_
		    = i_1557_ * -((Class157_Sub1) this).anInt9031 + 8192 >> 14;
		int i_1561_ = i_1558_ + ((Class157_Sub1) this).anInt9103;
		int i_1562_ = i_1559_ + ((Class157_Sub1) this).anInt9104;
		int i_1563_ = i_1560_ + ((Class157_Sub1) this).anInt9031;
		int[] is_1564_ = new int[9];
		is_1564_[0] = i_1555_ * is_1450_[0] + 8192 >> 14;
		is_1564_[1] = i_1555_ * is_1450_[3] + 8192 >> 14;
		is_1564_[2] = i_1555_ * is_1450_[6] + 8192 >> 14;
		is_1564_[3] = i_1556_ * is_1450_[1] + 8192 >> 14;
		is_1564_[4] = i_1556_ * is_1450_[4] + 8192 >> 14;
		is_1564_[5] = i_1556_ * is_1450_[7] + 8192 >> 14;
		is_1564_[6] = i_1557_ * is_1450_[2] + 8192 >> 14;
		is_1564_[7] = i_1557_ * is_1450_[5] + 8192 >> 14;
		is_1564_[8] = i_1557_ * is_1450_[8] + 8192 >> 14;
		int i_1565_ = i_1555_ * i_1549_ + 8192 >> 14;
		int i_1566_ = i_1556_ * i_1550_ + 8192 >> 14;
		int i_1567_ = i_1557_ * i_1551_ + 8192 >> 14;
		i_1565_ += i_1561_;
		i_1566_ += i_1562_;
		i_1567_ += i_1563_;
		int[] is_1568_ = new int[9];
		for (int i_1569_ = 0; i_1569_ < 3; i_1569_++) {
		    for (int i_1570_ = 0; i_1570_ < 3; i_1570_++) {
			int i_1571_ = 0;
			for (int i_1572_ = 0; i_1572_ < 3; i_1572_++)
			    i_1571_ += (is_1450_[i_1569_ * 3 + i_1572_]
					* is_1564_[i_1570_ + i_1572_ * 3]);
			is_1568_[i_1569_ * 3 + i_1570_] = i_1571_ + 8192 >> 14;
		    }
		}
		int i_1573_ = ((is_1450_[0] * i_1565_ + is_1450_[1] * i_1566_
				+ is_1450_[2] * i_1567_ + 8192)
			       >> 14);
		int i_1574_ = ((is_1450_[3] * i_1565_ + is_1450_[4] * i_1566_
				+ is_1450_[5] * i_1567_ + 8192)
			       >> 14);
		int i_1575_ = ((is_1450_[6] * i_1565_ + is_1450_[7] * i_1566_
				+ is_1450_[8] * i_1567_ + 8192)
			       >> 14);
		i_1573_ += i_1546_;
		i_1574_ += i_1547_;
		i_1575_ += i_1548_;
		for (int i_1576_ = 0; i_1576_ < i_1451_; i_1576_++) {
		    int i_1577_ = is[i_1576_];
		    if (i_1577_
			< ((Class157_Sub1) this).anIntArrayArray9033.length) {
			int[] is_1578_ = (((Class157_Sub1) this)
					  .anIntArrayArray9033[i_1577_]);
			for (int i_1579_ = 0; i_1579_ < is_1578_.length;
			     i_1579_++) {
			    int i_1580_ = is_1578_[i_1579_];
			    if (((Class157_Sub1) this).aShortArray9044 == null
				|| ((i_1449_ & (((Class157_Sub1) this)
						.aShortArray9044[i_1580_]))
				    != 0)) {
				int i_1581_
				    = (is_1568_[0] * (((Class157_Sub1) this)
						      .anIntArray9040[i_1580_])
				       + is_1568_[1] * (((Class157_Sub1) this)
							.anIntArray9041
							[i_1580_])
				       + is_1568_[2] * (((Class157_Sub1) this)
							.anIntArray9042
							[i_1580_])
				       + 8192) >> 14;
				int i_1582_
				    = (is_1568_[3] * (((Class157_Sub1) this)
						      .anIntArray9040[i_1580_])
				       + is_1568_[4] * (((Class157_Sub1) this)
							.anIntArray9041
							[i_1580_])
				       + is_1568_[5] * (((Class157_Sub1) this)
							.anIntArray9042
							[i_1580_])
				       + 8192) >> 14;
				int i_1583_
				    = (is_1568_[6] * (((Class157_Sub1) this)
						      .anIntArray9040[i_1580_])
				       + is_1568_[7] * (((Class157_Sub1) this)
							.anIntArray9041
							[i_1580_])
				       + is_1568_[8] * (((Class157_Sub1) this)
							.anIntArray9042
							[i_1580_])
				       + 8192) >> 14;
				i_1581_ += i_1573_;
				i_1582_ += i_1574_;
				i_1583_ += i_1575_;
				((Class157_Sub1) this).anIntArray9040[i_1580_]
				    = i_1581_;
				((Class157_Sub1) this).anIntArray9041[i_1580_]
				    = i_1582_;
				((Class157_Sub1) this).anIntArray9042[i_1580_]
				    = i_1583_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1584_ = 0; i_1584_ < i_1451_; i_1584_++) {
		    int i_1585_ = is[i_1584_];
		    if (i_1585_
			< ((Class157_Sub1) this).anIntArrayArray9033.length) {
			int[] is_1586_ = (((Class157_Sub1) this)
					  .anIntArrayArray9033[i_1585_]);
			for (int i_1587_ = 0; i_1587_ < is_1586_.length;
			     i_1587_++) {
			    int i_1588_ = is_1586_[i_1587_];
			    if (((Class157_Sub1) this).aShortArray9044 == null
				|| ((i_1449_ & (((Class157_Sub1) this)
						.aShortArray9044[i_1588_]))
				    != 0)) {
				((Class157_Sub1) this).anIntArray9040[i_1588_]
				    -= ((Class157_Sub1) this).anInt9103;
				((Class157_Sub1) this).anIntArray9041[i_1588_]
				    -= ((Class157_Sub1) this).anInt9104;
				((Class157_Sub1) this).anIntArray9042[i_1588_]
				    -= ((Class157_Sub1) this).anInt9031;
				((Class157_Sub1) this).anIntArray9040[i_1588_]
				    = (((Class157_Sub1) this).anIntArray9040
				       [i_1588_]) * i_1446_ >> 7;
				((Class157_Sub1) this).anIntArray9041[i_1588_]
				    = (((Class157_Sub1) this).anIntArray9041
				       [i_1588_]) * i_1447_ >> 7;
				((Class157_Sub1) this).anIntArray9042[i_1588_]
				    = (((Class157_Sub1) this).anIntArray9042
				       [i_1588_]) * i_1448_ >> 7;
				((Class157_Sub1) this).anIntArray9040[i_1588_]
				    += ((Class157_Sub1) this).anInt9103;
				((Class157_Sub1) this).anIntArray9041[i_1588_]
				    += ((Class157_Sub1) this).anInt9104;
				((Class157_Sub1) this).anIntArray9042[i_1588_]
				    += ((Class157_Sub1) this).anInt9031;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class157_Sub1) this).anIntArrayArray9063 != null) {
		boolean bool_1589_ = false;
		for (int i_1590_ = 0; i_1590_ < i_1451_; i_1590_++) {
		    int i_1591_ = is[i_1590_];
		    if (i_1591_
			< ((Class157_Sub1) this).anIntArrayArray9063.length) {
			int[] is_1592_ = (((Class157_Sub1) this)
					  .anIntArrayArray9063[i_1591_]);
			for (int i_1593_ = 0; i_1593_ < is_1592_.length;
			     i_1593_++) {
			    int i_1594_ = is_1592_[i_1593_];
			    if (((Class157_Sub1) this).aShortArray9064 == null
				|| ((i_1449_ & (((Class157_Sub1) this)
						.aShortArray9064[i_1594_]))
				    != 0)) {
				int i_1595_ = (((((Class157_Sub1) this)
						 .aByteArray9058[i_1594_])
						& 0xff)
					       + i_1446_ * 8);
				if (i_1595_ < 0)
				    i_1595_ = 0;
				else if (i_1595_ > 255)
				    i_1595_ = 255;
				((Class157_Sub1) this).aByteArray9058[i_1594_]
				    = (byte) i_1595_;
			    }
			}
			bool_1589_ = bool_1589_ | is_1592_.length > 0;
		    }
		}
		if (bool_1589_) {
		    if (((Class157_Sub1) this).aClass348Array9078 != null) {
			for (int i_1596_ = 0;
			     i_1596_ < ((Class157_Sub1) this).anInt9092;
			     i_1596_++) {
			    Class348 class348 = (((Class157_Sub1) this)
						 .aClass348Array9078[i_1596_]);
			    Class328 class328 = (((Class157_Sub1) this)
						 .aClass328Array9094[i_1596_]);
			    ((Class328) class328).anInt3503
				= (((Class328) class328).anInt3503 & 0xffffff
				   | 255 - ((((Class157_Sub1) this)
					     .aByteArray9058
					     [((Class348) class348).anInt3653])
					    & 0xff) << 24);
			}
		    }
		    method8356();
		}
	    }
	} else if (i == 7) {
	    if (((Class157_Sub1) this).anIntArrayArray9063 != null) {
		boolean bool_1597_ = false;
		for (int i_1598_ = 0; i_1598_ < i_1451_; i_1598_++) {
		    int i_1599_ = is[i_1598_];
		    if (i_1599_
			< ((Class157_Sub1) this).anIntArrayArray9063.length) {
			int[] is_1600_ = (((Class157_Sub1) this)
					  .anIntArrayArray9063[i_1599_]);
			for (int i_1601_ = 0; i_1601_ < is_1600_.length;
			     i_1601_++) {
			    int i_1602_ = is_1600_[i_1601_];
			    if (((Class157_Sub1) this).aShortArray9064 == null
				|| ((i_1449_ & (((Class157_Sub1) this)
						.aShortArray9064[i_1602_]))
				    != 0)) {
				int i_1603_ = ((((Class157_Sub1) this)
						.aShortArray9057[i_1602_])
					       & 0xffff);
				int i_1604_ = i_1603_ >> 10 & 0x3f;
				int i_1605_ = i_1603_ >> 7 & 0x7;
				int i_1606_ = i_1603_ & 0x7f;
				i_1604_ = i_1604_ + i_1446_ & 0x3f;
				i_1605_ += i_1447_ / 4;
				if (i_1605_ < 0)
				    i_1605_ = 0;
				else if (i_1605_ > 7)
				    i_1605_ = 7;
				i_1606_ += i_1448_;
				if (i_1606_ < 0)
				    i_1606_ = 0;
				else if (i_1606_ > 127)
				    i_1606_ = 127;
				((Class157_Sub1) this).aShortArray9057[i_1602_]
				    = (short) (i_1604_ << 10 | i_1605_ << 7
					       | i_1606_);
			    }
			}
			bool_1597_ = bool_1597_ | is_1600_.length > 0;
		    }
		}
		if (bool_1597_) {
		    if (((Class157_Sub1) this).aClass348Array9078 != null) {
			for (int i_1607_ = 0;
			     i_1607_ < ((Class157_Sub1) this).anInt9092;
			     i_1607_++) {
			    Class348 class348 = (((Class157_Sub1) this)
						 .aClass348Array9078[i_1607_]);
			    Class328 class328 = (((Class157_Sub1) this)
						 .aClass328Array9094[i_1607_]);
			    ((Class328) class328).anInt3503
				= (((Class328) class328).anInt3503 & ~0xffffff
				   | (Class649.anIntArray8420
				      [((((Class157_Sub1) this).aShortArray9057
					 [((Class348) class348).anInt3653])
					& 0xffff)]) & 0xffffff);
			}
		    }
		    method8356();
		}
	    }
	} else if (i == 8) {
	    if (((Class157_Sub1) this).anIntArrayArray9095 != null) {
		for (int i_1608_ = 0; i_1608_ < i_1451_; i_1608_++) {
		    int i_1609_ = is[i_1608_];
		    if (i_1609_
			< ((Class157_Sub1) this).anIntArrayArray9095.length) {
			int[] is_1610_ = (((Class157_Sub1) this)
					  .anIntArrayArray9095[i_1609_]);
			for (int i_1611_ = 0; i_1611_ < is_1610_.length;
			     i_1611_++) {
			    Class328 class328
				= (((Class157_Sub1) this).aClass328Array9094
				   [is_1610_[i_1611_]]);
			    ((Class328) class328).anInt3508 += i_1446_;
			    ((Class328) class328).anInt3507 += i_1447_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class157_Sub1) this).anIntArrayArray9095 != null) {
		for (int i_1612_ = 0; i_1612_ < i_1451_; i_1612_++) {
		    int i_1613_ = is[i_1612_];
		    if (i_1613_
			< ((Class157_Sub1) this).anIntArrayArray9095.length) {
			int[] is_1614_ = (((Class157_Sub1) this)
					  .anIntArrayArray9095[i_1613_]);
			for (int i_1615_ = 0; i_1615_ < is_1614_.length;
			     i_1615_++) {
			    Class328 class328
				= (((Class157_Sub1) this).aClass328Array9094
				   [is_1614_[i_1615_]]);
			    ((Class328) class328).anInt3504
				= (((Class328) class328).anInt3504 * i_1446_
				   >> 7);
			    ((Class328) class328).anInt3506
				= (((Class328) class328).anInt3506 * i_1447_
				   >> 7);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class157_Sub1) this).anIntArrayArray9095 != null) {
		for (int i_1616_ = 0; i_1616_ < i_1451_; i_1616_++) {
		    int i_1617_ = is[i_1616_];
		    if (i_1617_
			< ((Class157_Sub1) this).anIntArrayArray9095.length) {
			int[] is_1618_ = (((Class157_Sub1) this)
					  .anIntArrayArray9095[i_1617_]);
			for (int i_1619_ = 0; i_1619_ < is_1618_.length;
			     i_1619_++) {
			    Class328 class328
				= (((Class157_Sub1) this).aClass328Array9094
				   [is_1618_[i_1619_]]);
			    ((Class328) class328).anInt3505
				= (((Class328) class328).anInt3505 + i_1446_
				   & 0x3fff);
			}
		    }
		}
	    }
	}
    }
    
    void method8379() {
	if (((Class157_Sub1) this).aBool9071) {
	    ((Class157_Sub1) this).aBool9071 = false;
	    if (((Class157_Sub1) this).aClass170Array9090 == null
		&& ((Class157_Sub1) this).aClass144Array9075 == null
		&& ((Class157_Sub1) this).aClass348Array9078 == null
		&& !Class338.method4382(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		boolean bool = false;
		boolean bool_1620_ = false;
		boolean bool_1621_ = false;
		if (((Class157_Sub1) this).anIntArray9040 != null
		    && !Class338.method4381(((Class157_Sub1) this).anInt9034,
					    (((Class157_Sub1) this)
					     .anInt9035))) {
		    if (((Class157_Sub1) this).aClass354_9045 == null
			|| ((Class157_Sub1) this).aClass354_9045
			       .method4573()) {
			if (!((Class157_Sub1) this).aBool9046)
			    method8358();
			bool = true;
		    } else
			((Class157_Sub1) this).aBool9071 = true;
		}
		if (((Class157_Sub1) this).anIntArray9041 != null
		    && !Class338.method4401(((Class157_Sub1) this).anInt9034,
					    (((Class157_Sub1) this)
					     .anInt9035))) {
		    if (((Class157_Sub1) this).aClass354_9045 == null
			|| ((Class157_Sub1) this).aClass354_9045
			       .method4573()) {
			if (!((Class157_Sub1) this).aBool9046)
			    method8358();
			bool_1620_ = true;
		    } else
			((Class157_Sub1) this).aBool9071 = true;
		}
		if (((Class157_Sub1) this).anIntArray9042 != null
		    && !Class338.method4402(((Class157_Sub1) this).anInt9034,
					    (((Class157_Sub1) this)
					     .anInt9035))) {
		    if (((Class157_Sub1) this).aClass354_9045 == null
			|| ((Class157_Sub1) this).aClass354_9045
			       .method4573()) {
			if (!((Class157_Sub1) this).aBool9046)
			    method8358();
			bool_1621_ = true;
		    } else
			((Class157_Sub1) this).aBool9071 = true;
		}
		if (bool)
		    ((Class157_Sub1) this).anIntArray9040 = null;
		if (bool_1620_)
		    ((Class157_Sub1) this).anIntArray9041 = null;
		if (bool_1621_)
		    ((Class157_Sub1) this).anIntArray9042 = null;
	    }
	    if (((Class157_Sub1) this).aShortArray9089 != null
		&& ((Class157_Sub1) this).anIntArray9040 == null
		&& ((Class157_Sub1) this).anIntArray9041 == null
		&& ((Class157_Sub1) this).anIntArray9042 == null) {
		((Class157_Sub1) this).aShortArray9089 = null;
		((Class157_Sub1) this).anIntArray9100 = null;
	    }
	while_38_:
	    do {
		if (((Class157_Sub1) this).aByteArray9052 != null
		    && !Class338.method4478(((Class157_Sub1) this).anInt9034,
					    (((Class157_Sub1) this)
					     .anInt9035))) {
		    do {
			if ((((Class157_Sub1) this).anInt9035 & 0x37) != 0) {
			    if (((Class157_Sub1) this).aClass354_9086 != null
				&& !((Class157_Sub1) this).aClass354_9086
					.method4573())
				break;
			} else if ((((Class157_Sub1) this).aClass354_9050
				    != null)
				   && !((Class157_Sub1) this)
					   .aClass354_9050.method4573())
			    break;
			((Class157_Sub1) this).aShortArray9038 = null;
			((Class157_Sub1) this).aShortArray9049 = null;
			((Class157_Sub1) this).aShortArray9048 = null;
			((Class157_Sub1) this).aByteArray9052 = null;
			break while_38_;
		    } while (false);
		    ((Class157_Sub1) this).aBool9071 = true;
		}
	    } while (false);
	    if (((Class157_Sub1) this).aShortArray9057 != null
		&& !Class338.method4404(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		if (((Class157_Sub1) this).aClass354_9050 == null
		    || ((Class157_Sub1) this).aClass354_9050.method4573())
		    ((Class157_Sub1) this).aShortArray9057 = null;
		else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aByteArray9058 != null
		&& !Class338.method4405(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		if (((Class157_Sub1) this).aClass354_9050 == null
		    || ((Class157_Sub1) this).aClass354_9050.method4573())
		    ((Class157_Sub1) this).aByteArray9058 = null;
		else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aFloatArray9061 != null
		&& !Class338.method4406(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		if (((Class157_Sub1) this).aClass354_9069 == null
		    || ((Class157_Sub1) this).aClass354_9069.method4573()) {
		    ((Class157_Sub1) this).aFloatArray9053 = null;
		    ((Class157_Sub1) this).aFloatArray9061 = null;
		} else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aShortArray9062 != null
		&& !Class338.method4410(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		if (((Class157_Sub1) this).aClass354_9050 == null
		    || ((Class157_Sub1) this).aClass354_9050.method4573())
		    ((Class157_Sub1) this).aShortArray9062 = null;
		else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aShortArray9059 != null
		&& !Class338.method4409(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		if ((((Class157_Sub1) this).aClass339_9101 == null
		     || ((Class157_Sub1) this).aClass339_9101.method4481())
		    && (((Class157_Sub1) this).aClass354_9050 == null
			|| ((Class157_Sub1) this).aClass354_9050
			       .method4573())) {
		    ((Class157_Sub1) this).aShortArray9091 = null;
		    ((Class157_Sub1) this).aShortArray9105 = null;
		    ((Class157_Sub1) this).aShortArray9059 = null;
		} else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aShortArray9043 != null) {
		if (((Class157_Sub1) this).aClass354_9045 == null
		    || ((Class157_Sub1) this).aClass354_9045.method4573())
		    ((Class157_Sub1) this).aShortArray9043 = null;
		else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).aShortArray9047 != null) {
		if (((Class157_Sub1) this).aClass354_9050 == null
		    || ((Class157_Sub1) this).aClass354_9050.method4573())
		    ((Class157_Sub1) this).aShortArray9047 = null;
		else
		    ((Class157_Sub1) this).aBool9071 = true;
	    }
	    if (((Class157_Sub1) this).anIntArrayArray9063 != null
		&& !Class338.method4438(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		((Class157_Sub1) this).anIntArrayArray9063 = null;
		((Class157_Sub1) this).aShortArray9064 = null;
	    }
	    if (((Class157_Sub1) this).anIntArrayArray9033 != null
		&& !Class338.method4453(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035)) {
		((Class157_Sub1) this).anIntArrayArray9033 = null;
		((Class157_Sub1) this).aShortArray9044 = null;
	    }
	    if (((Class157_Sub1) this).anIntArrayArray9095 != null
		&& !Class338.method4435(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035))
		((Class157_Sub1) this).anIntArrayArray9095 = null;
	    if (((Class157_Sub1) this).anIntArray9085 != null
		&& (((Class157_Sub1) this).anInt9034 & 0x800) == 0
		&& (((Class157_Sub1) this).anInt9034 & 0x40000) == 0) {
		((Class157_Sub1) this).anIntArray9085 = null;
		((Class157_Sub1) this).anIntArray9087 = null;
		((Class157_Sub1) this).anIntArray9099 = null;
	    }
	}
    }
    
    public void method2015(int i) {
	int i_1622_ = Class417.anIntArray4766[i];
	int i_1623_ = Class417.anIntArray4767[i];
	for (int i_1624_ = 0; i_1624_ < ((Class157_Sub1) this).anInt9039;
	     i_1624_++) {
	    int i_1625_
		= ((((Class157_Sub1) this).anIntArray9042[i_1624_] * i_1622_
		    + ((Class157_Sub1) this).anIntArray9040[i_1624_] * i_1623_)
		   >> 14);
	    ((Class157_Sub1) this).anIntArray9042[i_1624_]
		= ((((Class157_Sub1) this).anIntArray9042[i_1624_] * i_1623_
		    - ((Class157_Sub1) this).anIntArray9040[i_1624_] * i_1622_)
		   >> 14);
	    ((Class157_Sub1) this).anIntArray9040[i_1624_] = i_1625_;
	}
	method8385();
	((Class157_Sub1) this).aBool9046 = false;
    }
    
    public void method2002() {
	for (int i = 0; i < ((Class157_Sub1) this).anInt9039; i++)
	    ((Class157_Sub1) this).anIntArray9042[i]
		= -((Class157_Sub1) this).anIntArray9042[i];
	for (int i = 0; i < ((Class157_Sub1) this).anInt9077; i++)
	    ((Class157_Sub1) this).aShortArray9038[i]
		= (short) -((Class157_Sub1) this).aShortArray9038[i];
	for (int i = 0; i < ((Class157_Sub1) this).anInt9055; i++) {
	    short i_1626_ = ((Class157_Sub1) this).aShortArray9059[i];
	    ((Class157_Sub1) this).aShortArray9059[i]
		= ((Class157_Sub1) this).aShortArray9091[i];
	    ((Class157_Sub1) this).aShortArray9091[i] = i_1626_;
	}
	method8385();
	method8367();
	method8368();
	((Class157_Sub1) this).aBool9046 = false;
    }
    
    int method8380(int i, short i_1627_, int i_1628_) {
	int i_1629_
	    = (((Class173_Sub1) ((Class157_Sub1) this).aClass173_Sub1_9068)
	       .anIntArray9220[method8366(i, i_1628_)]);
	if (i_1627_ != -1) {
	    Class160 class160
		= ((Class157_Sub1) this).aClass173_Sub1_9068.aClass165_1984
		      .method2093(i_1627_ & 0xffff, (byte) -117);
	    int i_1630_ = class160.aByte1802 & 0xff;
	    if (i_1630_ != 0) {
		int i_1631_ = 131586 * i_1628_;
		if (i_1628_ < 0)
		    i_1631_ = 0;
		else if (i_1628_ > 127)
		    i_1631_ = 16777215;
		else
		    i_1631_ = 131586 * i_1628_;
		if (i_1630_ == 256)
		    i_1629_ = i_1631_;
		else {
		    int i_1632_ = i_1630_;
		    int i_1633_ = 256 - i_1630_;
		    i_1629_ = ((((i_1631_ & 0xff00ff) * i_1632_
				 + (i_1629_ & 0xff00ff) * i_1633_)
				& ~0xff00ff)
			       + (((i_1631_ & 0xff00) * i_1632_
				   + (i_1629_ & 0xff00) * i_1633_)
				  & 0xff0000)) >> 8;
		}
	    }
	    int i_1634_ = class160.aByte1801 & 0xff;
	    if (i_1634_ != 0) {
		i_1634_ += 256;
		int i_1635_ = ((i_1629_ & 0xff0000) >> 16) * i_1634_;
		if (i_1635_ > 65535)
		    i_1635_ = 65535;
		int i_1636_ = ((i_1629_ & 0xff00) >> 8) * i_1634_;
		if (i_1636_ > 65535)
		    i_1636_ = 65535;
		int i_1637_ = (i_1629_ & 0xff) * i_1634_;
		if (i_1637_ > 65535)
		    i_1637_ = 65535;
		i_1629_
		    = (i_1635_ << 8 & 0xff0000) + (i_1636_ & 0xff00) + (i_1637_
									>> 8);
	    }
	}
	return i_1629_ & 0xffffff;
    }
    
    void method8381() {
	int i = 32767;
	int i_1638_ = 32767;
	int i_1639_ = 32767;
	int i_1640_ = -32768;
	int i_1641_ = -32768;
	int i_1642_ = -32768;
	int i_1643_ = 0;
	int i_1644_ = 0;
	for (int i_1645_ = 0; i_1645_ < ((Class157_Sub1) this).anInt9039;
	     i_1645_++) {
	    int i_1646_ = ((Class157_Sub1) this).anIntArray9040[i_1645_];
	    int i_1647_ = ((Class157_Sub1) this).anIntArray9041[i_1645_];
	    int i_1648_ = ((Class157_Sub1) this).anIntArray9042[i_1645_];
	    if (i_1646_ < i)
		i = i_1646_;
	    if (i_1646_ > i_1640_)
		i_1640_ = i_1646_;
	    if (i_1647_ < i_1638_)
		i_1638_ = i_1647_;
	    if (i_1647_ > i_1641_)
		i_1641_ = i_1647_;
	    if (i_1648_ < i_1639_)
		i_1639_ = i_1648_;
	    if (i_1648_ > i_1642_)
		i_1642_ = i_1648_;
	    int i_1649_ = i_1646_ * i_1646_ + i_1648_ * i_1648_;
	    if (i_1649_ > i_1643_)
		i_1643_ = i_1649_;
	    i_1649_
		= i_1646_ * i_1646_ + i_1648_ * i_1648_ + i_1647_ * i_1647_;
	    if (i_1649_ > i_1644_)
		i_1644_ = i_1649_;
	}
	((Class157_Sub1) this).anInt9079 = i;
	((Class157_Sub1) this).anInt9080 = i_1640_;
	((Class157_Sub1) this).anInt9093 = i_1638_;
	((Class157_Sub1) this).anInt9066 = i_1641_;
	((Class157_Sub1) this).anInt9081 = i_1639_;
	((Class157_Sub1) this).anInt9082 = i_1642_;
	((Class157_Sub1) this).anInt9060
	    = (int) (Math.sqrt((double) i_1643_) + 0.99);
	((Class157_Sub1) this).anInt9065
	    = (int) (Math.sqrt((double) i_1644_) + 0.99);
	((Class157_Sub1) this).aBool9046 = true;
    }
    
    public void method1924(short i, short i_1650_) {
	Class165 class165
	    = ((Class157_Sub1) this).aClass173_Sub1_9068.aClass165_1984;
	for (int i_1651_ = 0; i_1651_ < ((Class157_Sub1) this).anInt9055;
	     i_1651_++) {
	    if (((Class157_Sub1) this).aShortArray9062[i_1651_] == i)
		((Class157_Sub1) this).aShortArray9062[i_1651_] = i_1650_;
	}
	byte i_1652_ = 0;
	byte i_1653_ = 0;
	if (i != -1) {
	    Class160 class160 = class165.method2093(i & 0xffff, (byte) -75);
	    i_1652_ = class160.aByte1802;
	    i_1653_ = class160.aByte1801;
	}
	byte i_1654_ = 0;
	byte i_1655_ = 0;
	if (i_1650_ != -1) {
	    Class160 class160
		= class165.method2093(i_1650_ & 0xffff, (byte) -60);
	    i_1654_ = class160.aByte1802;
	    i_1655_ = class160.aByte1801;
	    if (class160.aByte1775 != 0 || class160.aByte1776 != 0)
		((Class157_Sub1) this).aBool9073 = true;
	}
	if (i_1652_ != i_1654_ | i_1653_ != i_1655_) {
	    if (((Class157_Sub1) this).aClass348Array9078 != null) {
		for (int i_1656_ = 0;
		     i_1656_ < ((Class157_Sub1) this).anInt9092; i_1656_++) {
		    Class348 class348
			= ((Class157_Sub1) this).aClass348Array9078[i_1656_];
		    Class328 class328
			= ((Class157_Sub1) this).aClass328Array9094[i_1656_];
		    ((Class328) class328).anInt3503
			= (((Class328) class328).anInt3503 & ~0xffffff
			   | ((Class649.anIntArray8420
			       [(((Class157_Sub1) this).aShortArray9057
				 [((Class348) class348).anInt3653]) & 0xffff])
			      & 0xffffff));
		}
	    }
	    method8356();
	}
    }
    
    public void method1942(int i) {
	int i_1657_ = Class417.anIntArray4766[i];
	int i_1658_ = Class417.anIntArray4767[i];
	for (int i_1659_ = 0; i_1659_ < ((Class157_Sub1) this).anInt9039;
	     i_1659_++) {
	    int i_1660_
		= ((((Class157_Sub1) this).anIntArray9041[i_1659_] * i_1657_
		    + ((Class157_Sub1) this).anIntArray9040[i_1659_] * i_1658_)
		   >> 14);
	    ((Class157_Sub1) this).anIntArray9041[i_1659_]
		= ((((Class157_Sub1) this).anIntArray9041[i_1659_] * i_1658_
		    - ((Class157_Sub1) this).anIntArray9040[i_1659_] * i_1657_)
		   >> 14);
	    ((Class157_Sub1) this).anIntArray9040[i_1659_] = i_1660_;
	}
	method8385();
	((Class157_Sub1) this).aBool9046 = false;
    }
    
    void method8382() {
	int i = 32767;
	int i_1661_ = 32767;
	int i_1662_ = 32767;
	int i_1663_ = -32768;
	int i_1664_ = -32768;
	int i_1665_ = -32768;
	int i_1666_ = 0;
	int i_1667_ = 0;
	for (int i_1668_ = 0; i_1668_ < ((Class157_Sub1) this).anInt9039;
	     i_1668_++) {
	    int i_1669_ = ((Class157_Sub1) this).anIntArray9040[i_1668_];
	    int i_1670_ = ((Class157_Sub1) this).anIntArray9041[i_1668_];
	    int i_1671_ = ((Class157_Sub1) this).anIntArray9042[i_1668_];
	    if (i_1669_ < i)
		i = i_1669_;
	    if (i_1669_ > i_1663_)
		i_1663_ = i_1669_;
	    if (i_1670_ < i_1661_)
		i_1661_ = i_1670_;
	    if (i_1670_ > i_1664_)
		i_1664_ = i_1670_;
	    if (i_1671_ < i_1662_)
		i_1662_ = i_1671_;
	    if (i_1671_ > i_1665_)
		i_1665_ = i_1671_;
	    int i_1672_ = i_1669_ * i_1669_ + i_1671_ * i_1671_;
	    if (i_1672_ > i_1666_)
		i_1666_ = i_1672_;
	    i_1672_
		= i_1669_ * i_1669_ + i_1671_ * i_1671_ + i_1670_ * i_1670_;
	    if (i_1672_ > i_1667_)
		i_1667_ = i_1672_;
	}
	((Class157_Sub1) this).anInt9079 = i;
	((Class157_Sub1) this).anInt9080 = i_1663_;
	((Class157_Sub1) this).anInt9093 = i_1661_;
	((Class157_Sub1) this).anInt9066 = i_1664_;
	((Class157_Sub1) this).anInt9081 = i_1662_;
	((Class157_Sub1) this).anInt9082 = i_1665_;
	((Class157_Sub1) this).anInt9060
	    = (int) (Math.sqrt((double) i_1666_) + 0.99);
	((Class157_Sub1) this).anInt9065
	    = (int) (Math.sqrt((double) i_1667_) + 0.99);
	((Class157_Sub1) this).aBool9046 = true;
    }
    
    Class157_Sub1(Class173_Sub1 class173_sub1, int i, int i_1673_,
		  boolean bool, boolean bool_1674_) {
	((Class157_Sub1) this).anInt9039 = 0;
	((Class157_Sub1) this).anInt9077 = 0;
	((Class157_Sub1) this).anInt9055 = 0;
	((Class157_Sub1) this).anInt9056 = 0;
	((Class157_Sub1) this).aBool9070 = false;
	((Class157_Sub1) this).aBool9071 = true;
	((Class157_Sub1) this).aBool9051 = false;
	((Class157_Sub1) this).aBool9073 = false;
	((Class157_Sub1) this).aBool9046 = false;
	((Class157_Sub1) this).aBool9083 = false;
	((Class157_Sub1) this).aFloatArray9097 = new float[2];
	((Class157_Sub1) this).anIntArray9098 = new int[1];
	((Class157_Sub1) this).anIntArray9067 = new int[1];
	((Class157_Sub1) this).anIntArray9072 = new int[8];
	((Class157_Sub1) this).anIntArray9076 = new int[8];
	((Class157_Sub1) this).anIntArray9102 = new int[8];
	((Class157_Sub1) this).aClass173_Sub1_9068 = class173_sub1;
	((Class157_Sub1) this).anInt9034 = i;
	((Class157_Sub1) this).anInt9035 = i_1673_;
	((Class157_Sub1) this).aBool9070 = bool_1674_;
	if (bool || Class338.method4412(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035))
	    ((Class157_Sub1) this).aClass354_9045
		= new Class354(Class338.method4395((((Class157_Sub1) this)
						    .anInt9034),
						   (((Class157_Sub1) this)
						    .anInt9035)));
	if (bool || Class338.method4403(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035))
	    ((Class157_Sub1) this).aClass354_9069
		= new Class354(Class338.method4462((((Class157_Sub1) this)
						    .anInt9034),
						   (((Class157_Sub1) this)
						    .anInt9035)));
	if (bool || Class338.method4392(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035))
	    ((Class157_Sub1) this).aClass354_9050
		= new Class354(Class338.method4397((((Class157_Sub1) this)
						    .anInt9034),
						   (((Class157_Sub1) this)
						    .anInt9035)));
	if (bool || Class338.method4391(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035))
	    ((Class157_Sub1) this).aClass354_9086
		= new Class354(Class338.method4396((((Class157_Sub1) this)
						    .anInt9034),
						   (((Class157_Sub1) this)
						    .anInt9035)));
	if (bool || Class338.method4394(((Class157_Sub1) this).anInt9034,
					((Class157_Sub1) this).anInt9035))
	    ((Class157_Sub1) this).aClass339_9101
		= new Class339(Class338.method4386((((Class157_Sub1) this)
						    .anInt9034),
						   (((Class157_Sub1) this)
						    .anInt9035)));
	if (bool && bool_1674_) {
	    ((Class354) ((Class157_Sub1) this).aClass354_9045)
		.anInterface36_3804
		= ((Class354) ((Class157_Sub1) this).aClass354_9045)
		      .anInterface36_3803
		= ((Class157_Sub1) this).aClass173_Sub1_9068
		      .method8549(((Class157_Sub1) this).aBool9070);
	    ((Class354) ((Class157_Sub1) this).aClass354_9069)
		.anInterface36_3804
		= ((Class354) ((Class157_Sub1) this).aClass354_9069)
		      .anInterface36_3803
		= ((Class157_Sub1) this).aClass173_Sub1_9068
		      .method8549(((Class157_Sub1) this).aBool9070);
	    ((Class354) ((Class157_Sub1) this).aClass354_9050)
		.anInterface36_3804
		= ((Class354) ((Class157_Sub1) this).aClass354_9050)
		      .anInterface36_3803
		= ((Class157_Sub1) this).aClass173_Sub1_9068
		      .method8549(((Class157_Sub1) this).aBool9070);
	    ((Class354) ((Class157_Sub1) this).aClass354_9086)
		.anInterface36_3804
		= ((Class354) ((Class157_Sub1) this).aClass354_9086)
		      .anInterface36_3803
		= ((Class157_Sub1) this).aClass173_Sub1_9068
		      .method8549(((Class157_Sub1) this).aBool9070);
	}
    }
    
    public Class144[] method2033() {
	return ((Class157_Sub1) this).aClass144Array9075;
    }
    
    boolean method8383() {
	if (((Class339) ((Class157_Sub1) this).aClass339_9101).aBool3582)
	    return true;
	if ((((Class339) ((Class157_Sub1) this).aClass339_9101)
	     .anInterface41_3583)
	    == null)
	    ((Class339) ((Class157_Sub1) this).aClass339_9101)
		.anInterface41_3583
		= ((Class157_Sub1) this).aClass173_Sub1_9068.method8476(false);
	Interface41 interface41
	    = (((Class339) ((Class157_Sub1) this).aClass339_9101)
	       .anInterface41_3583);
	interface41.method311(((Class157_Sub1) this).anInt9056 * 6);
	Unsafe unsafe
	    = ((Class157_Sub1) this).aClass173_Sub1_9068.anUnsafe9221;
	if (unsafe != null) {
	    int i = ((Class157_Sub1) this).anInt9056 * 6;
	    long l = interface41.method205(0, i);
	    if (l == 0L)
		return false;
	    for (int i_1675_ = 0; i_1675_ < ((Class157_Sub1) this).anInt9056;
		 i_1675_++) {
		unsafe.putShort(l, (((Class157_Sub1) this).aShortArray9059
				    [i_1675_]));
		l += 2L;
		unsafe.putShort(l, (((Class157_Sub1) this).aShortArray9105
				    [i_1675_]));
		l += 2L;
		unsafe.putShort(l, (((Class157_Sub1) this).aShortArray9091
				    [i_1675_]));
		l += 2L;
	    }
	    interface41.method192();
	    ((Class339) ((Class157_Sub1) this).aClass339_9101)
		.anInterface41_3580
		= interface41;
	    ((Class339) ((Class157_Sub1) this).aClass339_9101).aBool3582
		= true;
	    ((Class157_Sub1) this).aBool9071 = true;
	    return true;
	}
	ByteBuffer bytebuffer
	    = ((Class157_Sub1) this).aClass173_Sub1_9068.aByteBuffer9222;
	bytebuffer.clear();
	for (int i = 0; i < ((Class157_Sub1) this).anInt9056; i++) {
	    bytebuffer.putShort(((Class157_Sub1) this).aShortArray9059[i]);
	    bytebuffer.putShort(((Class157_Sub1) this).aShortArray9105[i]);
	    bytebuffer.putShort(((Class157_Sub1) this).aShortArray9091[i]);
	}
	if (interface41.method197(0, bytebuffer.position(),
				  (((Class157_Sub1) this).aClass173_Sub1_9068
				   .aLong9223))) {
	    ((Class339) ((Class157_Sub1) this).aClass339_9101)
		.anInterface41_3580
		= interface41;
	    ((Class339) ((Class157_Sub1) this).aClass339_9101).aBool3582
		= true;
	    ((Class157_Sub1) this).aBool9071 = true;
	    return true;
	}
	return false;
    }
    
    boolean method8384() {
	if (((Class339) ((Class157_Sub1) this).aClass339_9101).aBool3582)
	    return true;
	if ((((Class339) ((Class157_Sub1) this).aClass339_9101)
	     .anInterface41_3583)
	    == null)
	    ((Class339) ((Class157_Sub1) this).aClass339_9101)
		.anInterface41_3583
		= ((Class157_Sub1) this).aClass173_Sub1_9068.method8476(false);
	Interface41 interface41
	    = (((Class339) ((Class157_Sub1) this).aClass339_9101)
	       .anInterface41_3583);
	interface41.method311(((Class157_Sub1) this).anInt9056 * 6);
	Unsafe unsafe
	    = ((Class157_Sub1) this).aClass173_Sub1_9068.anUnsafe9221;
	if (unsafe != null) {
	    int i = ((Class157_Sub1) this).anInt9056 * 6;
	    long l = interface41.method205(0, i);
	    if (l == 0L)
		return false;
	    for (int i_1676_ = 0; i_1676_ < ((Class157_Sub1) this).anInt9056;
		 i_1676_++) {
		unsafe.putShort(l, (((Class157_Sub1) this).aShortArray9059
				    [i_1676_]));
		l += 2L;
		unsafe.putShort(l, (((Class157_Sub1) this).aShortArray9105
				    [i_1676_]));
		l += 2L;
		unsafe.putShort(l, (((Class157_Sub1) this).aShortArray9091
				    [i_1676_]));
		l += 2L;
	    }
	    interface41.method192();
	    ((Class339) ((Class157_Sub1) this).aClass339_9101)
		.anInterface41_3580
		= interface41;
	    ((Class339) ((Class157_Sub1) this).aClass339_9101).aBool3582
		= true;
	    ((Class157_Sub1) this).aBool9071 = true;
	    return true;
	}
	ByteBuffer bytebuffer
	    = ((Class157_Sub1) this).aClass173_Sub1_9068.aByteBuffer9222;
	bytebuffer.clear();
	for (int i = 0; i < ((Class157_Sub1) this).anInt9056; i++) {
	    bytebuffer.putShort(((Class157_Sub1) this).aShortArray9059[i]);
	    bytebuffer.putShort(((Class157_Sub1) this).aShortArray9105[i]);
	    bytebuffer.putShort(((Class157_Sub1) this).aShortArray9091[i]);
	}
	if (interface41.method197(0, bytebuffer.position(),
				  (((Class157_Sub1) this).aClass173_Sub1_9068
				   .aLong9223))) {
	    ((Class339) ((Class157_Sub1) this).aClass339_9101)
		.anInterface41_3580
		= interface41;
	    ((Class339) ((Class157_Sub1) this).aClass339_9101).aBool3582
		= true;
	    ((Class157_Sub1) this).aBool9071 = true;
	    return true;
	}
	return false;
    }
    
    public void method1944(int i) {
	int i_1677_ = Class417.anIntArray4766[i];
	int i_1678_ = Class417.anIntArray4767[i];
	for (int i_1679_ = 0; i_1679_ < ((Class157_Sub1) this).anInt9039;
	     i_1679_++) {
	    int i_1680_
		= ((((Class157_Sub1) this).anIntArray9041[i_1679_] * i_1677_
		    + ((Class157_Sub1) this).anIntArray9040[i_1679_] * i_1678_)
		   >> 14);
	    ((Class157_Sub1) this).anIntArray9041[i_1679_]
		= ((((Class157_Sub1) this).anIntArray9041[i_1679_] * i_1678_
		    - ((Class157_Sub1) this).anIntArray9040[i_1679_] * i_1677_)
		   >> 14);
	    ((Class157_Sub1) this).anIntArray9040[i_1679_] = i_1680_;
	}
	method8385();
	((Class157_Sub1) this).aBool9046 = false;
    }
    
    void method8385() {
	if (((Class157_Sub1) this).aClass354_9045 != null)
	    ((Class354) ((Class157_Sub1) this).aClass354_9045).aBool3801
		= false;
    }
    
    public boolean method1950() {
	if (((Class157_Sub1) this).aShortArray9062 == null)
	    return true;
	for (int i = 0; i < ((Class157_Sub1) this).aShortArray9062.length;
	     i++) {
	    if (((Class157_Sub1) this).aShortArray9062[i] != -1
		&& !(((Class173_Sub1)
		      ((Class157_Sub1) this).aClass173_Sub1_9068)
			 .aClass329_9315.method4267
		     ((((Class157_Sub1) this).aClass173_Sub1_9068
			   .aClass165_1984.method2093
		       (((Class157_Sub1) this).aShortArray9062[i],
			(byte) -75)),
		      -1)))
		return false;
	}
	return true;
    }
    
    public int method1982() {
	if (!((Class157_Sub1) this).aBool9046)
	    method8358();
	return ((Class157_Sub1) this).anInt9081;
    }
    
    public void method2024(int i, int i_1681_, int i_1682_, int i_1683_) {
	for (int i_1684_ = 0; i_1684_ < ((Class157_Sub1) this).anInt9055;
	     i_1684_++) {
	    int i_1685_
		= ((Class157_Sub1) this).aShortArray9057[i_1684_] & 0xffff;
	    int i_1686_ = i_1685_ >> 10 & 0x3f;
	    int i_1687_ = i_1685_ >> 7 & 0x7;
	    int i_1688_ = i_1685_ & 0x7f;
	    if (i != -1)
		i_1686_ += (i - i_1686_) * i_1683_ >> 7;
	    if (i_1681_ != -1)
		i_1687_ += (i_1681_ - i_1687_) * i_1683_ >> 7;
	    if (i_1682_ != -1)
		i_1688_ += (i_1682_ - i_1688_) * i_1683_ >> 7;
	    ((Class157_Sub1) this).aShortArray9057[i_1684_]
		= (short) (i_1686_ << 10 | i_1687_ << 7 | i_1688_);
	}
	if (((Class157_Sub1) this).aClass348Array9078 != null) {
	    for (int i_1689_ = 0; i_1689_ < ((Class157_Sub1) this).anInt9092;
		 i_1689_++) {
		Class348 class348
		    = ((Class157_Sub1) this).aClass348Array9078[i_1689_];
		Class328 class328
		    = ((Class157_Sub1) this).aClass328Array9094[i_1689_];
		((Class328) class328).anInt3503
		    = (((Class328) class328).anInt3503 & ~0xffffff
		       | ((Class649.anIntArray8420
			   [(((Class157_Sub1) this).aShortArray9057
			     [((Class348) class348).anInt3653]) & 0xffff])
			  & 0xffffff));
	    }
	}
	method8356();
    }
}
