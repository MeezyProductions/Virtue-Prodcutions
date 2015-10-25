/* Class157_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;

import jaggl.OpenGL;

public class Class157_Sub3 extends Class157
{
    static final int anInt9621 = 1;
    static final int anInt9622 = 7;
    int anInt9623;
    static final int anInt9624 = 2;
    static final int anInt9625 = 4;
    static final int anInt9626 = 8;
    static final int anInt9627 = 16;
    Class173_Sub2 aClass173_Sub2_9628;
    int anInt9629;
    static final int anInt9630 = 4;
    float[] aFloatArray9631;
    short aShort9632;
    short aShort9633;
    boolean aBool9634 = false;
    boolean aBool9635 = false;
    int anInt9636 = 0;
    int anInt9637 = 0;
    short[] aShortArray9638;
    int[] anIntArray9639;
    int anInt9640;
    int[][] anIntArrayArray9641;
    short[] aShortArray9642;
    Interface16 anInterface16_9643;
    short aShort9644;
    short[] aShortArray9645;
    short[] aShortArray9646;
    byte[] aByteArray9647;
    int[] anIntArray9648;
    boolean aBool9649;
    float[] aFloatArray9650;
    int anInt9651;
    int anInt9652;
    short[] aShortArray9653;
    byte[] aByteArray9654;
    short[] aShortArray9655;
    static int[] anIntArray9656;
    short[] aShortArray9657;
    short[] aShortArray9658;
    int[][] anIntArrayArray9659;
    int[] anIntArray9660;
    Class122 aClass122_9661;
    Class122 aClass122_9662;
    Class122 aClass122_9663;
    Class144[] aClass144Array9664;
    Class129 aClass129_9665;
    int anInt9666;
    Interface14 anInterface14_9667;
    boolean aBool9668;
    byte aByte9669;
    short aShort9670;
    Class143 aClass143_9671;
    short aShort9672;
    short[] aShortArray9673;
    short aShort9674;
    static int[] anIntArray9675;
    short aShort9676;
    short[] aShortArray9677;
    boolean aBool9678;
    int[] anIntArray9679;
    int[] anIntArray9680;
    int anInt9681;
    short[] aShortArray9682;
    Class170[] aClass170Array9683;
    Class145[] aClass145Array9684;
    int anInt9685;
    Class122 aClass122_9686;
    Class113[] aClass113Array9687;
    short aShort9688;
    static long[] aLongArray9689;
    static float[] aFloatArray9690 = new float[2];
    int[][] anIntArrayArray9691;
    static int[] anIntArray9692;
    short aShort9693;
    static int anInt9694;
    static int anInt9695;
    static int anInt9696;
    static boolean aBool9697;
    
    public int method2022() {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	return ((Class157_Sub3) this).aShort9693;
    }
    
    public void method1946(int i, int i_0_, int i_1_) {
	for (int i_2_ = 0; i_2_ < ((Class157_Sub3) this).anInt9637; i_2_++) {
	    if (i != 128)
		((Class157_Sub3) this).anIntArray9679[i_2_]
		    = ((Class157_Sub3) this).anIntArray9679[i_2_] * i >> 7;
	    if (i_0_ != 128)
		((Class157_Sub3) this).anIntArray9639[i_2_]
		    = ((Class157_Sub3) this).anIntArray9639[i_2_] * i_0_ >> 7;
	    if (i_1_ != 128)
		((Class157_Sub3) this).anIntArray9648[i_2_]
		    = ((Class157_Sub3) this).anIntArray9648[i_2_] * i_1_ >> 7;
	}
	if (((Class157_Sub3) this).aClass122_9661 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9661)
		.anInterface14_1542
		= null;
	((Class157_Sub3) this).aBool9649 = false;
    }
    
    short method8882(Class177 class177, int i, long l, int i_3_, int i_4_,
		     int i_5_, int i_6_, float f, float f_7_) {
	int i_8_ = ((Class157_Sub3) this).anIntArray9660[i];
	int i_9_ = ((Class157_Sub3) this).anIntArray9660[i + 1];
	int i_10_ = 0;
	for (int i_11_ = i_8_; i_11_ < i_9_; i_11_++) {
	    if (((Class157_Sub3) this).aShortArray9682[i_11_] == 0) {
		i_10_ = i_11_;
		break;
	    }
	    int i_12_
		= (((Class157_Sub3) this).aShortArray9682[i_11_] & 0xffff) - 1;
	    if (aLongArray9689[i_11_] == l)
		return (short) i_12_;
	}
	((Class157_Sub3) this).aShortArray9682[i_10_]
	    = (short) (((Class157_Sub3) this).anInt9623 + 1);
	aLongArray9689[i_10_] = l;
	((Class157_Sub3) this).aShortArray9673[(((Class157_Sub3) this)
						.anInt9623)]
	    = (short) i_3_;
	((Class157_Sub3) this).aShortArray9645[(((Class157_Sub3) this)
						.anInt9623)]
	    = (short) i_4_;
	((Class157_Sub3) this).aShortArray9646[(((Class157_Sub3) this)
						.anInt9623)]
	    = (short) i_5_;
	((Class157_Sub3) this).aByteArray9647[((Class157_Sub3) this).anInt9623]
	    = (byte) i_6_;
	((Class157_Sub3) this).aFloatArray9631[(((Class157_Sub3) this)
						.anInt9623)]
	    = f;
	((Class157_Sub3) this).aFloatArray9650[(((Class157_Sub3) this)
						.anInt9623)]
	    = f_7_;
	return (short) ((Class157_Sub3) this).anInt9623++;
    }
    
    static byte[] method8883(byte[] is, int i) {
	byte[] is_13_ = new byte[i];
	System.arraycopy(is, 0, is_13_, 0, i);
	return is_13_;
    }
    
    Class157_Sub3(Class173_Sub2 class173_sub2, Class177 class177, int i,
		  int i_14_, int i_15_, int i_16_) {
	((Class157_Sub3) this).anInt9623 = 0;
	((Class157_Sub3) this).anInt9651 = 0;
	((Class157_Sub3) this).anInt9652 = 0;
	((Class157_Sub3) this).aBool9668 = true;
	((Class157_Sub3) this).aBool9649 = false;
	((Class157_Sub3) this).aBool9678 = false;
	((Class157_Sub3) this).aClass173_Sub2_9628 = class173_sub2;
	((Class157_Sub3) this).anInt9629 = i;
	((Class157_Sub3) this).anInt9640 = i_16_;
	if (Class117.method1455(i, i_16_))
	    ((Class157_Sub3) this).aClass122_9661
		= new Class122(null, 5126, 3, 0);
	if (Class117.method1529(i, i_16_))
	    ((Class157_Sub3) this).aClass122_9686
		= new Class122(null, 5126, 2, 0);
	if (Class117.method1456(i, i_16_))
	    ((Class157_Sub3) this).aClass122_9663
		= new Class122(null, 5126, 3, 0);
	if (Class117.method1520(i, i_16_))
	    ((Class157_Sub3) this).aClass122_9662
		= new Class122(null, 5121, 4, 0);
	if (Class117.method1459(i, i_16_))
	    ((Class157_Sub3) this).aClass129_9665 = new Class129();
	Class165 class165 = class173_sub2.aClass165_1984;
	Interface44 interface44 = class173_sub2.anInterface44_1983;
	int[] is = new int[class177.anInt2047];
	((Class157_Sub3) this).anIntArray9660
	    = new int[class177.anInt2074 + 1];
	for (int i_17_ = 0; i_17_ < class177.anInt2047; i_17_++) {
	    if (class177.aByteArray2054 == null
		|| class177.aByteArray2054[i_17_] != 2) {
		if (class177.aShortArray2037 != null
		    && class177.aShortArray2037[i_17_] != -1) {
		    Class160 class160
			= class165.method2093((class177.aShortArray2037[i_17_]
					       & 0xffff),
					      (byte) -108);
		    if (((((Class157_Sub3) this).anInt9640 & 0x40) == 0
			 || !class160.aBool1800)
			&& class160.aBool1798)
			continue;
		}
		is[((Class157_Sub3) this).anInt9651++] = i_17_;
		((Class157_Sub3) this).anIntArray9660[(class177.aShortArray2067
						       [i_17_])]++;
		((Class157_Sub3) this).anIntArray9660[(class177.aShortArray2049
						       [i_17_])]++;
		((Class157_Sub3) this).anIntArray9660[(class177.aShortArray2050
						       [i_17_])]++;
	    }
	}
	((Class157_Sub3) this).anInt9652 = ((Class157_Sub3) this).anInt9651;
	long[] ls = new long[((Class157_Sub3) this).anInt9651];
	boolean bool = (((Class157_Sub3) this).anInt9629 & 0x100) != 0;
	for (int i_18_ = 0; i_18_ < ((Class157_Sub3) this).anInt9651;
	     i_18_++) {
	    int i_19_ = is[i_18_];
	    Class160 class160 = null;
	    int i_20_ = 0;
	    int i_21_ = 0;
	    int i_22_ = 0;
	    int i_23_ = 0;
	    if (class177.aClass176Array2040 != null) {
		boolean bool_24_ = false;
		for (int i_25_ = 0; i_25_ < class177.aClass176Array2040.length;
		     i_25_++) {
		    Class176 class176 = class177.aClass176Array2040[i_25_];
		    if (i_19_ == class176.anInt2026 * 967499851) {
			Class391 class391
			    = interface44.method324((class176.anInt2028
						     * 1984522459),
						    310912556);
			if (class391.aBool4119)
			    bool_24_ = true;
			if (class391.anInt4113 * 176412091 != -1) {
			    Class160 class160_26_
				= class165.method2093((class391.anInt4113
						       * 176412091),
						      (byte) -97);
			    if (class160_26_.aClass583_1771
				== Class583.aClass583_7697)
				((Class157_Sub3) this).aBool9634 = true;
			}
		    }
		}
		if (bool_24_) {
		    ls[i_18_] = 9223372036854775807L;
		    ((Class157_Sub3) this).anInt9652--;
		    continue;
		}
	    }
	    if (class177.aClass170Array2078 != null) {
		boolean bool_27_ = false;
		for (int i_28_ = 0; i_28_ < class177.aClass170Array2078.length;
		     i_28_++) {
		    Class170 class170 = class177.aClass170Array2078[i_28_];
		    if (i_19_ == class170.anInt1954 * 1492183661) {
			Class386 class386
			    = (((Class157_Sub3) this).aClass173_Sub2_9628
				   .anInterface45_2005.method326
			       (class170.anInt1957 * 1262475263, (byte) -68));
			if (class386.aBool4043)
			    bool_27_ = true;
		    }
		}
		if (bool_27_) {
		    ls[i_18_] = 9223372036854775807L;
		    ((Class157_Sub3) this).anInt9652--;
		    continue;
		}
	    }
	    int i_29_ = -1;
	    if (class177.aShortArray2037 != null) {
		i_29_ = class177.aShortArray2037[i_19_];
		if (i_29_ != -1) {
		    class160 = class165.method2093(i_29_ & 0xffff, (byte) -40);
		    if ((((Class157_Sub3) this).anInt9640 & 0x40) == 0
			|| !class160.aBool1800) {
			i_22_ = class160.aByte1790;
			i_23_ = class160.aByte1796;
			if (class160.aByte1775 != 0 || class160.aByte1776 != 0)
			    ((Class157_Sub3) this).aBool9635 = true;
		    } else {
			i_29_ = -1;
			class160 = null;
		    }
		}
	    }
	    boolean bool_30_
		= ((class177.aByteArray2056 != null
		    && class177.aByteArray2056[i_19_] != 0)
		   || (class160 != null
		       && class160.aClass583_1771 != Class583.aClass583_7695));
	    if ((bool || bool_30_) && class177.aByteArray2048 != null)
		i_20_ += class177.aByteArray2048[i_19_] << 17;
	    if (bool_30_)
		i_20_ += 65536;
	    i_20_ += (i_22_ & 0xff) << 8;
	    i_20_ += i_23_ & 0xff;
	    i_21_ += (i_29_ & 0xffff) << 16;
	    i_21_ += i_18_ & 0xffff;
	    ls[i_18_] = ((long) i_20_ << 32) + (long) i_21_;
	    ((Class157_Sub3) this).aBool9634 |= bool_30_;
	    Class157_Sub3 class157_sub3_31_ = this;
	    ((Class157_Sub3) class157_sub3_31_).aBool9635
		= (((Class157_Sub3) class157_sub3_31_).aBool9635
		   | (class160 != null && (class160.aByte1775 != 0
					   || class160.aByte1776 != 0)));
	}
	Class650.method7737(ls, is, -305742667);
	((Class157_Sub3) this).anInt9636 = class177.anInt2036;
	((Class157_Sub3) this).anInt9637 = class177.anInt2074;
	((Class157_Sub3) this).anIntArray9679 = class177.anIntArray2038;
	((Class157_Sub3) this).anIntArray9639 = class177.anIntArray2068;
	((Class157_Sub3) this).anIntArray9648 = class177.anIntArray2044;
	((Class157_Sub3) this).aShortArray9642 = class177.aShortArray2043;
	Class119[] class119s = new Class119[((Class157_Sub3) this).anInt9637];
	((Class157_Sub3) this).aClass170Array9683
	    = class177.aClass170Array2078;
	((Class157_Sub3) this).aClass144Array9664
	    = class177.aClass144Array2059;
	if (class177.aClass176Array2040 != null) {
	    ((Class157_Sub3) this).anInt9685
		= class177.aClass176Array2040.length;
	    ((Class157_Sub3) this).aClass145Array9684
		= new Class145[((Class157_Sub3) this).anInt9685];
	    ((Class157_Sub3) this).aClass113Array9687
		= new Class113[((Class157_Sub3) this).anInt9685];
	    for (int i_32_ = 0; i_32_ < ((Class157_Sub3) this).anInt9685;
		 i_32_++) {
		Class176 class176 = class177.aClass176Array2040[i_32_];
		Class391 class391
		    = interface44.method324(class176.anInt2028 * 1984522459,
					    -5933012);
		int i_33_ = -1;
		for (int i_34_ = 0; i_34_ < ((Class157_Sub3) this).anInt9651;
		     i_34_++) {
		    if (is[i_34_] == class176.anInt2026 * 967499851) {
			i_33_ = i_34_;
			break;
		    }
		}
		if (i_33_ == -1)
		    throw new RuntimeException();
		int i_35_ = ((Class649.anIntArray8420
			      [(class177.aShortArray2058
				[class176.anInt2026 * 967499851]) & 0xffff])
			     & 0xffffff);
		i_35_ = i_35_ | 255 - (class177.aByteArray2056 != null
				       ? (class177.aByteArray2056
					  [class176.anInt2026 * 967499851])
				       : 0) << 24;
		((Class157_Sub3) this).aClass145Array9684[i_32_]
		    = new Class145(i_33_,
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
		((Class157_Sub3) this).aClass113Array9687[i_32_]
		    = new Class113(i_35_);
	    }
	}
	int i_36_ = ((Class157_Sub3) this).anInt9651 * 3;
	((Class157_Sub3) this).aShortArray9673 = new short[i_36_];
	((Class157_Sub3) this).aShortArray9645 = new short[i_36_];
	((Class157_Sub3) this).aShortArray9646 = new short[i_36_];
	((Class157_Sub3) this).aByteArray9647 = new byte[i_36_];
	((Class157_Sub3) this).aFloatArray9631 = new float[i_36_];
	((Class157_Sub3) this).aFloatArray9650 = new float[i_36_];
	((Class157_Sub3) this).aShortArray9653
	    = new short[((Class157_Sub3) this).anInt9651];
	((Class157_Sub3) this).aByteArray9654
	    = new byte[((Class157_Sub3) this).anInt9651];
	((Class157_Sub3) this).aShortArray9655
	    = new short[((Class157_Sub3) this).anInt9651];
	((Class157_Sub3) this).aShortArray9638
	    = new short[((Class157_Sub3) this).anInt9651];
	((Class157_Sub3) this).aShortArray9657
	    = new short[((Class157_Sub3) this).anInt9651];
	((Class157_Sub3) this).aShortArray9658
	    = new short[((Class157_Sub3) this).anInt9651];
	if (class177.aShortArray2062 != null)
	    ((Class157_Sub3) this).aShortArray9677
		= new short[((Class157_Sub3) this).anInt9651];
	((Class157_Sub3) this).aShort9632 = (short) i_14_;
	((Class157_Sub3) this).aShort9633 = (short) i_15_;
	((Class157_Sub3) this).aShortArray9682 = new short[i_36_];
	aLongArray9689 = new long[i_36_];
	int i_37_ = 0;
	for (int i_38_ = 0; i_38_ < class177.anInt2074; i_38_++) {
	    int i_39_ = ((Class157_Sub3) this).anIntArray9660[i_38_];
	    ((Class157_Sub3) this).anIntArray9660[i_38_] = i_37_;
	    i_37_ += i_39_;
	    class119s[i_38_] = new Class119();
	}
	((Class157_Sub3) this).anIntArray9660[class177.anInt2074] = i_37_;
	Class167 class167
	    = method1881(class177, is, ((Class157_Sub3) this).anInt9651);
	Class116[] class116s = new Class116[class177.anInt2047];
	for (int i_40_ = 0; i_40_ < class177.anInt2047; i_40_++) {
	    short i_41_ = class177.aShortArray2067[i_40_];
	    short i_42_ = class177.aShortArray2049[i_40_];
	    short i_43_ = class177.aShortArray2050[i_40_];
	    int i_44_ = (((Class157_Sub3) this).anIntArray9679[i_42_]
			 - ((Class157_Sub3) this).anIntArray9679[i_41_]);
	    int i_45_ = (((Class157_Sub3) this).anIntArray9639[i_42_]
			 - ((Class157_Sub3) this).anIntArray9639[i_41_]);
	    int i_46_ = (((Class157_Sub3) this).anIntArray9648[i_42_]
			 - ((Class157_Sub3) this).anIntArray9648[i_41_]);
	    int i_47_ = (((Class157_Sub3) this).anIntArray9679[i_43_]
			 - ((Class157_Sub3) this).anIntArray9679[i_41_]);
	    int i_48_ = (((Class157_Sub3) this).anIntArray9639[i_43_]
			 - ((Class157_Sub3) this).anIntArray9639[i_41_]);
	    int i_49_ = (((Class157_Sub3) this).anIntArray9648[i_43_]
			 - ((Class157_Sub3) this).anIntArray9648[i_41_]);
	    int i_50_ = i_45_ * i_49_ - i_48_ * i_46_;
	    int i_51_ = i_46_ * i_47_ - i_49_ * i_44_;
	    int i_52_;
	    for (i_52_ = i_44_ * i_48_ - i_47_ * i_45_;
		 (i_50_ > 8192 || i_51_ > 8192 || i_52_ > 8192 || i_50_ < -8192
		  || i_51_ < -8192 || i_52_ < -8192);
		 i_52_ >>= 1) {
		i_50_ >>= 1;
		i_51_ >>= 1;
	    }
	    int i_53_ = (int) Math.sqrt((double) (i_50_ * i_50_ + i_51_ * i_51_
						  + i_52_ * i_52_));
	    if (i_53_ <= 0)
		i_53_ = 1;
	    i_50_ = i_50_ * 256 / i_53_;
	    i_51_ = i_51_ * 256 / i_53_;
	    i_52_ = i_52_ * 256 / i_53_;
	    byte i_54_ = (class177.aByteArray2054 == null ? (byte) 0
			  : class177.aByteArray2054[i_40_]);
	    if (i_54_ == 0) {
		Class119 class119 = class119s[i_41_];
		((Class119) class119).anInt1483 += i_50_;
		((Class119) class119).anInt1481 += i_51_;
		((Class119) class119).anInt1484 += i_52_;
		((Class119) class119).anInt1482++;
		class119 = class119s[i_42_];
		((Class119) class119).anInt1483 += i_50_;
		((Class119) class119).anInt1481 += i_51_;
		((Class119) class119).anInt1484 += i_52_;
		((Class119) class119).anInt1482++;
		class119 = class119s[i_43_];
		((Class119) class119).anInt1483 += i_50_;
		((Class119) class119).anInt1481 += i_51_;
		((Class119) class119).anInt1484 += i_52_;
		((Class119) class119).anInt1482++;
	    } else if (i_54_ == 1) {
		Class116 class116 = class116s[i_40_] = new Class116();
		((Class116) class116).anInt1424 = i_50_;
		((Class116) class116).anInt1425 = i_51_;
		((Class116) class116).anInt1426 = i_52_;
	    }
	}
	for (int i_55_ = 0; i_55_ < ((Class157_Sub3) this).anInt9651;
	     i_55_++) {
	    int i_56_ = is[i_55_];
	    int i_57_ = class177.aShortArray2058[i_56_] & 0xffff;
	    int i_58_ = (class177.aByteArray2056 != null
			 ? class177.aByteArray2056[i_56_] & 0xff : 0);
	    short i_59_ = (class177.aShortArray2037 == null ? (short) -1
			   : class177.aShortArray2037[i_56_]);
	    if (i_59_ != -1 && (((Class157_Sub3) this).anInt9640 & 0x40) != 0
		&& class165.method2093(i_59_, (byte) -86).aBool1800)
		i_59_ = (short) -1;
	    float f = 0.0F;
	    float f_60_ = 0.0F;
	    float f_61_ = 0.0F;
	    float f_62_ = 0.0F;
	    float f_63_ = 0.0F;
	    float f_64_ = 0.0F;
	    long l;
	    long l_65_;
	    long l_66_;
	    if (i_59_ != -1) {
		int i_67_ = (class177.aShortArray2057 != null
			     ? class177.aShortArray2057[i_56_] : -1);
		if (i_67_ == 32766) {
		    int i_68_ = class177.aByteArray2051[i_56_] & 0xff;
		    int i_69_ = class177.aByteArray2075[i_56_] & 0xff;
		    int i_70_ = class177.aByteArray2053[i_56_] & 0xff;
		    i_68_ += (class177.anIntArray2041
			      [class177.aShortArray2067[i_56_]]);
		    l_66_ = (long) i_68_;
		    i_69_ += (class177.anIntArray2041
			      [class177.aShortArray2049[i_56_]]);
		    l_65_ = (long) i_68_;
		    i_70_ += (class177.anIntArray2041
			      [class177.aShortArray2050[i_56_]]);
		    l = (long) i_68_;
		    f = class177.aFloatArray2052[i_68_];
		    f_60_ = class177.aFloatArray2046[i_68_];
		    f_61_ = class177.aFloatArray2052[i_69_];
		    f_62_ = class177.aFloatArray2046[i_69_];
		    f_63_ = class177.aFloatArray2052[i_70_];
		    f_64_ = class177.aFloatArray2046[i_70_];
		} else if (i_67_ == -1) {
		    f = 0.0F;
		    f_60_ = 1.0F;
		    l_66_ = 65535L;
		    f_61_ = 1.0F;
		    f_62_ = 1.0F;
		    l_65_ = 131071L;
		    f_63_ = 0.0F;
		    f_64_ = 0.0F;
		    l = 196607L;
		} else {
		    i_67_ &= 0xffff;
		    int i_71_ = 0;
		    int i_72_ = 0;
		    int i_73_ = 0;
		    byte i_74_ = class177.aByteArray2076[i_67_];
		    if (i_74_ == 0) {
			short i_75_ = class177.aShortArray2067[i_56_];
			short i_76_ = class177.aShortArray2049[i_56_];
			short i_77_ = class177.aShortArray2050[i_56_];
			short i_78_ = class177.aShortArray2064[i_67_];
			short i_79_ = class177.aShortArray2077[i_67_];
			short i_80_ = class177.aShortArray2069[i_67_];
			float f_81_ = (float) class177.anIntArray2038[i_78_];
			float f_82_ = (float) class177.anIntArray2068[i_78_];
			float f_83_ = (float) class177.anIntArray2044[i_78_];
			float f_84_
			    = (float) class177.anIntArray2038[i_79_] - f_81_;
			float f_85_
			    = (float) class177.anIntArray2068[i_79_] - f_82_;
			float f_86_
			    = (float) class177.anIntArray2044[i_79_] - f_83_;
			float f_87_
			    = (float) class177.anIntArray2038[i_80_] - f_81_;
			float f_88_
			    = (float) class177.anIntArray2068[i_80_] - f_82_;
			float f_89_
			    = (float) class177.anIntArray2044[i_80_] - f_83_;
			float f_90_
			    = (float) class177.anIntArray2038[i_75_] - f_81_;
			float f_91_
			    = (float) class177.anIntArray2068[i_75_] - f_82_;
			float f_92_
			    = (float) class177.anIntArray2044[i_75_] - f_83_;
			float f_93_
			    = (float) class177.anIntArray2038[i_76_] - f_81_;
			float f_94_
			    = (float) class177.anIntArray2068[i_76_] - f_82_;
			float f_95_
			    = (float) class177.anIntArray2044[i_76_] - f_83_;
			float f_96_
			    = (float) class177.anIntArray2038[i_77_] - f_81_;
			float f_97_
			    = (float) class177.anIntArray2068[i_77_] - f_82_;
			float f_98_
			    = (float) class177.anIntArray2044[i_77_] - f_83_;
			float f_99_ = f_85_ * f_89_ - f_86_ * f_88_;
			float f_100_ = f_86_ * f_87_ - f_84_ * f_89_;
			float f_101_ = f_84_ * f_88_ - f_85_ * f_87_;
			float f_102_ = f_88_ * f_101_ - f_89_ * f_100_;
			float f_103_ = f_89_ * f_99_ - f_87_ * f_101_;
			float f_104_ = f_87_ * f_100_ - f_88_ * f_99_;
			float f_105_ = 1.0F / (f_102_ * f_84_ + f_103_ * f_85_
					       + f_104_ * f_86_);
			f = ((f_102_ * f_90_ + f_103_ * f_91_ + f_104_ * f_92_)
			     * f_105_);
			f_61_ = (f_102_ * f_93_ + f_103_ * f_94_
				 + f_104_ * f_95_) * f_105_;
			f_63_ = (f_102_ * f_96_ + f_103_ * f_97_
				 + f_104_ * f_98_) * f_105_;
			f_102_ = f_85_ * f_101_ - f_86_ * f_100_;
			f_103_ = f_86_ * f_99_ - f_84_ * f_101_;
			f_104_ = f_84_ * f_100_ - f_85_ * f_99_;
			f_105_ = 1.0F / (f_102_ * f_87_ + f_103_ * f_88_
					 + f_104_ * f_89_);
			f_60_ = (f_102_ * f_90_ + f_103_ * f_91_
				 + f_104_ * f_92_) * f_105_;
			f_62_ = (f_102_ * f_93_ + f_103_ * f_94_
				 + f_104_ * f_95_) * f_105_;
			f_64_ = (f_102_ * f_96_ + f_103_ * f_97_
				 + f_104_ * f_98_) * f_105_;
		    } else {
			short i_106_ = class177.aShortArray2067[i_56_];
			short i_107_ = class177.aShortArray2049[i_56_];
			short i_108_ = class177.aShortArray2050[i_56_];
			int i_109_ = class167.anIntArray1928[i_67_];
			int i_110_ = class167.anIntArray1930[i_67_];
			int i_111_ = class167.anIntArray1929[i_67_];
			float[] fs = class167.aFloatArrayArray1927[i_67_];
			byte i_112_ = class177.aByteArray2079[i_67_];
			float f_113_
			    = (float) class177.anIntArray2045[i_67_] / 256.0F;
			if (i_74_ == 1) {
			    float f_114_
				= ((float) class177.anIntArray2072[i_67_]
				   / 1024.0F);
			    method1867(class177.anIntArray2038[i_106_],
				       class177.anIntArray2068[i_106_],
				       class177.anIntArray2044[i_106_], i_109_,
				       i_110_, i_111_, fs, f_114_, i_112_,
				       f_113_, aFloatArray9690);
			    f = aFloatArray9690[0];
			    f_60_ = aFloatArray9690[1];
			    method1867(class177.anIntArray2038[i_107_],
				       class177.anIntArray2068[i_107_],
				       class177.anIntArray2044[i_107_], i_109_,
				       i_110_, i_111_, fs, f_114_, i_112_,
				       f_113_, aFloatArray9690);
			    f_61_ = aFloatArray9690[0];
			    f_62_ = aFloatArray9690[1];
			    method1867(class177.anIntArray2038[i_108_],
				       class177.anIntArray2068[i_108_],
				       class177.anIntArray2044[i_108_], i_109_,
				       i_110_, i_111_, fs, f_114_, i_112_,
				       f_113_, aFloatArray9690);
			    f_63_ = aFloatArray9690[0];
			    f_64_ = aFloatArray9690[1];
			    float f_115_ = f_114_ / 2.0F;
			    if ((i_112_ & 0x1) == 0) {
				if (f_61_ - f > f_115_) {
				    f_61_ -= f_114_;
				    i_72_ = 1;
				} else if (f - f_61_ > f_115_) {
				    f_61_ += f_114_;
				    i_72_ = 2;
				}
				if (f_63_ - f > f_115_) {
				    f_63_ -= f_114_;
				    i_73_ = 1;
				} else if (f - f_63_ > f_115_) {
				    f_63_ += f_114_;
				    i_73_ = 2;
				}
			    } else {
				if (f_62_ - f_60_ > f_115_) {
				    f_62_ -= f_114_;
				    i_72_ = 1;
				} else if (f_60_ - f_62_ > f_115_) {
				    f_62_ += f_114_;
				    i_72_ = 2;
				}
				if (f_64_ - f_60_ > f_115_) {
				    f_64_ -= f_114_;
				    i_73_ = 1;
				} else if (f_60_ - f_64_ > f_115_) {
				    f_64_ += f_114_;
				    i_73_ = 2;
				}
			    }
			} else if (i_74_ == 2) {
			    float f_116_
				= ((float) class177.anIntArray2055[i_67_]
				   / 256.0F);
			    float f_117_
				= ((float) class177.anIntArray2032[i_67_]
				   / 256.0F);
			    int i_118_ = (class177.anIntArray2038[i_107_]
					  - class177.anIntArray2038[i_106_]);
			    int i_119_ = (class177.anIntArray2068[i_107_]
					  - class177.anIntArray2068[i_106_]);
			    int i_120_ = (class177.anIntArray2044[i_107_]
					  - class177.anIntArray2044[i_106_]);
			    int i_121_ = (class177.anIntArray2038[i_108_]
					  - class177.anIntArray2038[i_106_]);
			    int i_122_ = (class177.anIntArray2068[i_108_]
					  - class177.anIntArray2068[i_106_]);
			    int i_123_ = (class177.anIntArray2044[i_108_]
					  - class177.anIntArray2044[i_106_]);
			    int i_124_ = i_119_ * i_123_ - i_122_ * i_120_;
			    int i_125_ = i_120_ * i_121_ - i_123_ * i_118_;
			    int i_126_ = i_118_ * i_122_ - i_121_ * i_119_;
			    float f_127_
				= (64.0F
				   / (float) class177.anIntArray2070[i_67_]);
			    float f_128_
				= (64.0F
				   / (float) class177.anIntArray2071[i_67_]);
			    float f_129_
				= (64.0F
				   / (float) class177.anIntArray2072[i_67_]);
			    float f_130_ = (((float) i_124_ * fs[0]
					     + (float) i_125_ * fs[1]
					     + (float) i_126_ * fs[2])
					    / f_127_);
			    float f_131_ = (((float) i_124_ * fs[3]
					     + (float) i_125_ * fs[4]
					     + (float) i_126_ * fs[5])
					    / f_128_);
			    float f_132_ = (((float) i_124_ * fs[6]
					     + (float) i_125_ * fs[7]
					     + (float) i_126_ * fs[8])
					    / f_129_);
			    i_71_ = method1993(f_130_, f_131_, f_132_);
			    method1869(class177.anIntArray2038[i_106_],
				       class177.anIntArray2068[i_106_],
				       class177.anIntArray2044[i_106_], i_109_,
				       i_110_, i_111_, i_71_, fs, i_112_,
				       f_113_, f_116_, f_117_,
				       aFloatArray9690);
			    f = aFloatArray9690[0];
			    f_60_ = aFloatArray9690[1];
			    method1869(class177.anIntArray2038[i_107_],
				       class177.anIntArray2068[i_107_],
				       class177.anIntArray2044[i_107_], i_109_,
				       i_110_, i_111_, i_71_, fs, i_112_,
				       f_113_, f_116_, f_117_,
				       aFloatArray9690);
			    f_61_ = aFloatArray9690[0];
			    f_62_ = aFloatArray9690[1];
			    method1869(class177.anIntArray2038[i_108_],
				       class177.anIntArray2068[i_108_],
				       class177.anIntArray2044[i_108_], i_109_,
				       i_110_, i_111_, i_71_, fs, i_112_,
				       f_113_, f_116_, f_117_,
				       aFloatArray9690);
			    f_63_ = aFloatArray9690[0];
			    f_64_ = aFloatArray9690[1];
			} else if (i_74_ == 3) {
			    method1866(class177.anIntArray2038[i_106_],
				       class177.anIntArray2068[i_106_],
				       class177.anIntArray2044[i_106_], i_109_,
				       i_110_, i_111_, fs, i_112_, f_113_,
				       aFloatArray9690);
			    f = aFloatArray9690[0];
			    f_60_ = aFloatArray9690[1];
			    method1866(class177.anIntArray2038[i_107_],
				       class177.anIntArray2068[i_107_],
				       class177.anIntArray2044[i_107_], i_109_,
				       i_110_, i_111_, fs, i_112_, f_113_,
				       aFloatArray9690);
			    f_61_ = aFloatArray9690[0];
			    f_62_ = aFloatArray9690[1];
			    method1866(class177.anIntArray2038[i_108_],
				       class177.anIntArray2068[i_108_],
				       class177.anIntArray2044[i_108_], i_109_,
				       i_110_, i_111_, fs, i_112_, f_113_,
				       aFloatArray9690);
			    f_63_ = aFloatArray9690[0];
			    f_64_ = aFloatArray9690[1];
			    if ((i_112_ & 0x1) == 0) {
				if (f_61_ - f > 0.5F) {
				    f_61_--;
				    i_72_ = 1;
				} else if (f - f_61_ > 0.5F) {
				    f_61_++;
				    i_72_ = 2;
				}
				if (f_63_ - f > 0.5F) {
				    f_63_--;
				    i_73_ = 1;
				} else if (f - f_63_ > 0.5F) {
				    f_63_++;
				    i_73_ = 2;
				}
			    } else {
				if (f_62_ - f_60_ > 0.5F) {
				    f_62_--;
				    i_72_ = 1;
				} else if (f_60_ - f_62_ > 0.5F) {
				    f_62_++;
				    i_72_ = 2;
				}
				if (f_64_ - f_60_ > 0.5F) {
				    f_64_--;
				    i_73_ = 1;
				} else if (f_60_ - f_64_ > 0.5F) {
				    f_64_++;
				    i_73_ = 2;
				}
			    }
			}
		    }
		    l_66_ = (long) (i_71_ << 16 | i_67_);
		    l_65_ = (long) (i_72_ << 19) | l_66_;
		    l = (long) (i_73_ << 19) | l_66_;
		}
	    } else {
		l = 0L;
		l_65_ = 0L;
		l_66_ = 0L;
	    }
	    byte i_133_ = (class177.aByteArray2054 != null
			   ? class177.aByteArray2054[i_56_] : (byte) 0);
	    if (i_133_ == 0) {
		long l_134_ = (long) ((i_57_ << 8) + i_58_);
		short i_135_ = class177.aShortArray2067[i_56_];
		short i_136_ = class177.aShortArray2049[i_56_];
		short i_137_ = class177.aShortArray2050[i_56_];
		Class119 class119 = class119s[i_135_];
		((Class157_Sub3) this).aShortArray9655[i_55_]
		    = method8882(class177, i_135_, l_134_ | l_66_ << 24,
				 ((Class119) class119).anInt1483,
				 ((Class119) class119).anInt1481,
				 ((Class119) class119).anInt1484,
				 ((Class119) class119).anInt1482, f, f_60_);
		class119 = class119s[i_136_];
		((Class157_Sub3) this).aShortArray9638[i_55_]
		    = method8882(class177, i_136_, l_134_ | l_65_ << 24,
				 ((Class119) class119).anInt1483,
				 ((Class119) class119).anInt1481,
				 ((Class119) class119).anInt1484,
				 ((Class119) class119).anInt1482, f_61_,
				 f_62_);
		class119 = class119s[i_137_];
		((Class157_Sub3) this).aShortArray9657[i_55_]
		    = method8882(class177, i_137_, l_134_ | l << 24,
				 ((Class119) class119).anInt1483,
				 ((Class119) class119).anInt1481,
				 ((Class119) class119).anInt1484,
				 ((Class119) class119).anInt1482, f_63_,
				 f_64_);
	    } else if (i_133_ == 1) {
		Class116 class116 = class116s[i_56_];
		long l_138_
		    = (((long) (((Class116) class116).anInt1424 & ~0x7fffffff)
			<< 9)
		       + ((long) (((Class116) class116).anInt1425 + 256) << 32)
		       + ((long) (((Class116) class116).anInt1426 + 256) << 24)
		       + (long) (i_57_ << 8) + (long) i_58_);
		((Class157_Sub3) this).aShortArray9655[i_55_]
		    = method8882(class177, class177.aShortArray2067[i_56_],
				 l_138_ | l_66_ << 41,
				 ((Class116) class116).anInt1424,
				 ((Class116) class116).anInt1425,
				 ((Class116) class116).anInt1426, 0, f, f_60_);
		((Class157_Sub3) this).aShortArray9638[i_55_]
		    = method8882(class177, class177.aShortArray2049[i_56_],
				 l_138_ | l_66_ << 41,
				 ((Class116) class116).anInt1424,
				 ((Class116) class116).anInt1425,
				 ((Class116) class116).anInt1426, 0, f_61_,
				 f_62_);
		((Class157_Sub3) this).aShortArray9657[i_55_]
		    = method8882(class177, class177.aShortArray2050[i_56_],
				 l_138_ | l_66_ << 41,
				 ((Class116) class116).anInt1424,
				 ((Class116) class116).anInt1425,
				 ((Class116) class116).anInt1426, 0, f_63_,
				 f_64_);
	    }
	    if (class177.aByteArray2056 != null)
		((Class157_Sub3) this).aByteArray9654[i_55_]
		    = class177.aByteArray2056[i_56_];
	    if (class177.aShortArray2062 != null)
		((Class157_Sub3) this).aShortArray9677[i_55_]
		    = class177.aShortArray2062[i_56_];
	    ((Class157_Sub3) this).aShortArray9653[i_55_]
		= class177.aShortArray2058[i_56_];
	    ((Class157_Sub3) this).aShortArray9658[i_55_] = i_59_;
	}
	int i_139_ = 0;
	short i_140_ = -10000;
	for (int i_141_ = 0; i_141_ < ((Class157_Sub3) this).anInt9652;
	     i_141_++) {
	    short i_142_ = ((Class157_Sub3) this).aShortArray9658[i_141_];
	    if (i_142_ != i_140_) {
		i_139_++;
		i_140_ = i_142_;
	    }
	}
	((Class157_Sub3) this).anIntArray9680 = new int[i_139_ + 1];
	i_139_ = 0;
	i_140_ = (short) -10000;
	for (int i_143_ = 0; i_143_ < ((Class157_Sub3) this).anInt9652;
	     i_143_++) {
	    short i_144_ = ((Class157_Sub3) this).aShortArray9658[i_143_];
	    if (i_144_ != i_140_) {
		((Class157_Sub3) this).anIntArray9680[i_139_++] = i_143_;
		i_140_ = i_144_;
	    }
	}
	((Class157_Sub3) this).anIntArray9680[i_139_]
	    = ((Class157_Sub3) this).anInt9652;
	aLongArray9689 = null;
	((Class157_Sub3) this).aShortArray9673
	    = method8891(((Class157_Sub3) this).aShortArray9673,
			 ((Class157_Sub3) this).anInt9623);
	((Class157_Sub3) this).aShortArray9645
	    = method8891(((Class157_Sub3) this).aShortArray9645,
			 ((Class157_Sub3) this).anInt9623);
	((Class157_Sub3) this).aShortArray9646
	    = method8891(((Class157_Sub3) this).aShortArray9646,
			 ((Class157_Sub3) this).anInt9623);
	((Class157_Sub3) this).aByteArray9647
	    = method8883(((Class157_Sub3) this).aByteArray9647,
			 ((Class157_Sub3) this).anInt9623);
	((Class157_Sub3) this).aFloatArray9631
	    = method8884(((Class157_Sub3) this).aFloatArray9631,
			 ((Class157_Sub3) this).anInt9623);
	((Class157_Sub3) this).aFloatArray9650
	    = method8884(((Class157_Sub3) this).aFloatArray9650,
			 ((Class157_Sub3) this).anInt9623);
	if (class177.anIntArray2042 != null
	    && Class117.method1473(i, ((Class157_Sub3) this).anInt9640))
	    ((Class157_Sub3) this).anIntArrayArray9641
		= class177.method2579(false);
	if (class177.aClass176Array2040 != null
	    && Class117.method1458(i, ((Class157_Sub3) this).anInt9640))
	    ((Class157_Sub3) this).anIntArrayArray9691 = class177.method2582();
	if (class177.anIntArray2060 != null
	    && Class117.method1472(i, ((Class157_Sub3) this).anInt9640)) {
	    int i_145_ = 0;
	    int[] is_146_ = new int[256];
	    for (int i_147_ = 0; i_147_ < ((Class157_Sub3) this).anInt9651;
		 i_147_++) {
		int i_148_ = class177.anIntArray2060[is[i_147_]];
		if (i_148_ >= 0) {
		    is_146_[i_148_]++;
		    if (i_148_ > i_145_)
			i_145_ = i_148_;
		}
	    }
	    ((Class157_Sub3) this).anIntArrayArray9659 = new int[i_145_ + 1][];
	    for (int i_149_ = 0; i_149_ <= i_145_; i_149_++) {
		((Class157_Sub3) this).anIntArrayArray9659[i_149_]
		    = new int[is_146_[i_149_]];
		is_146_[i_149_] = 0;
	    }
	    for (int i_150_ = 0; i_150_ < ((Class157_Sub3) this).anInt9651;
		 i_150_++) {
		int i_151_ = class177.anIntArray2060[is[i_150_]];
		if (i_151_ >= 0)
		    ((Class157_Sub3) this).anIntArrayArray9659[i_151_]
			[is_146_[i_151_]++]
			= i_150_;
	    }
	}
    }
    
    static float[] method8884(float[] fs, int i) {
	float[] fs_152_ = new float[i];
	System.arraycopy(fs, 0, fs_152_, 0, i);
	return fs_152_;
    }
    
    public void method1921(Class433 class433) {
	Class418 class418
	    = (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
	       .aClass418_9501);
	class418.method5035(class433);
	if (((Class157_Sub3) this).aClass170Array9683 != null) {
	    for (int i = 0;
		 i < ((Class157_Sub3) this).aClass170Array9683.length; i++) {
		Class170 class170
		    = ((Class157_Sub3) this).aClass170Array9683[i];
		Class170 class170_153_ = class170;
		if (class170.aClass170_1958 != null)
		    class170_153_ = class170.aClass170_1958;
		class170_153_.anInt1950
		    = ((int) (class418.aFloatArray4768[12]
			      + ((class418.aFloatArray4768[0]
				  * (float) (((Class157_Sub3) this)
					     .anIntArray9679
					     [(class170.anInt1946
					       * 1977387945)]))
				 + (class418.aFloatArray4768[4]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9639
					       [(class170.anInt1946
						 * 1977387945)]))
				 + (class418.aFloatArray4768[8]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9648
					       [(class170.anInt1946
						 * 1977387945)]))))
		       * -1626668665);
		class170_153_.anInt1951
		    = ((int) (class418.aFloatArray4768[13]
			      + ((class418.aFloatArray4768[1]
				  * (float) (((Class157_Sub3) this)
					     .anIntArray9679
					     [(class170.anInt1946
					       * 1977387945)]))
				 + (class418.aFloatArray4768[5]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9639
					       [(class170.anInt1946
						 * 1977387945)]))
				 + (class418.aFloatArray4768[9]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9648
					       [(class170.anInt1946
						 * 1977387945)]))))
		       * -1756604589);
		class170_153_.anInt1952
		    = (int) (class418.aFloatArray4768[14]
			     + ((class418.aFloatArray4768[2]
				 * (float) (((Class157_Sub3) this)
					    .anIntArray9679
					    [class170.anInt1946 * 1977387945]))
				+ (class418.aFloatArray4768[6]
				   * (float) (((Class157_Sub3) this)
					      .anIntArray9639
					      [(class170.anInt1946
						* 1977387945)]))
				+ (class418.aFloatArray4768[10]
				   * (float) (((Class157_Sub3) this)
					      .anIntArray9648
					      [(class170.anInt1946
						* 1977387945)])))) * 908623173;
		class170_153_.anInt1947
		    = ((int) (class418.aFloatArray4768[12]
			      + ((class418.aFloatArray4768[0]
				  * (float) (((Class157_Sub3) this)
					     .anIntArray9679
					     [(class170.anInt1945
					       * -1790775395)]))
				 + (class418.aFloatArray4768[4]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9639
					       [(class170.anInt1945
						 * -1790775395)]))
				 + (class418.aFloatArray4768[8]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9648
					       [(class170.anInt1945
						 * -1790775395)]))))
		       * -203979893);
		class170_153_.anInt1944
		    = ((int) (class418.aFloatArray4768[13]
			      + ((class418.aFloatArray4768[1]
				  * (float) (((Class157_Sub3) this)
					     .anIntArray9679
					     [(class170.anInt1945
					       * -1790775395)]))
				 + (class418.aFloatArray4768[5]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9639
					       [(class170.anInt1945
						 * -1790775395)]))
				 + (class418.aFloatArray4768[9]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9648
					       [(class170.anInt1945
						 * -1790775395)]))))
		       * 1630459257);
		class170_153_.anInt1955
		    = ((int) (class418.aFloatArray4768[14]
			      + ((class418.aFloatArray4768[2]
				  * (float) (((Class157_Sub3) this)
					     .anIntArray9679
					     [(class170.anInt1945
					       * -1790775395)]))
				 + (class418.aFloatArray4768[6]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9639
					       [(class170.anInt1945
						 * -1790775395)]))
				 + (class418.aFloatArray4768[10]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9648
					       [(class170.anInt1945
						 * -1790775395)]))))
		       * 1543452655);
		class170_153_.anInt1956
		    = (int) (class418.aFloatArray4768[12]
			     + ((class418.aFloatArray4768[0]
				 * (float) (((Class157_Sub3) this)
					    .anIntArray9679
					    [class170.anInt1948 * 248261743]))
				+ (class418.aFloatArray4768[4]
				   * (float) (((Class157_Sub3) this)
					      .anIntArray9639
					      [(class170.anInt1948
						* 248261743)]))
				+ (class418.aFloatArray4768[8]
				   * (float) (((Class157_Sub3) this)
					      .anIntArray9648
					      [(class170.anInt1948
						* 248261743)])))) * 271456581;
		class170_153_.anInt1953
		    = (int) (class418.aFloatArray4768[13]
			     + ((class418.aFloatArray4768[1]
				 * (float) (((Class157_Sub3) this)
					    .anIntArray9679
					    [class170.anInt1948 * 248261743]))
				+ (class418.aFloatArray4768[5]
				   * (float) (((Class157_Sub3) this)
					      .anIntArray9639
					      [(class170.anInt1948
						* 248261743)]))
				+ (class418.aFloatArray4768[9]
				   * (float) (((Class157_Sub3) this)
					      .anIntArray9648
					      [(class170.anInt1948
						* 248261743)])))) * 707964019;
		class170_153_.anInt1943
		    = (int) (class418.aFloatArray4768[14]
			     + ((class418.aFloatArray4768[2]
				 * (float) (((Class157_Sub3) this)
					    .anIntArray9679
					    [class170.anInt1948 * 248261743]))
				+ (class418.aFloatArray4768[6]
				   * (float) (((Class157_Sub3) this)
					      .anIntArray9639
					      [(class170.anInt1948
						* 248261743)]))
				+ (class418.aFloatArray4768[10]
				   * (float) (((Class157_Sub3) this)
					      .anIntArray9648
					      [(class170.anInt1948
						* 248261743)])))) * -674151113;
	    }
	}
	if (((Class157_Sub3) this).aClass144Array9664 != null) {
	    for (int i = 0;
		 i < ((Class157_Sub3) this).aClass144Array9664.length; i++) {
		Class144 class144
		    = ((Class157_Sub3) this).aClass144Array9664[i];
		Class144 class144_154_ = class144;
		if (class144.aClass144_1646 != null)
		    class144_154_ = class144.aClass144_1646;
		if (class144.aClass418_1645 != null)
		    class144.aClass418_1645.method4986(class418);
		else
		    class144.aClass418_1645 = new Class418(class418);
		class144_154_.anInt1648
		    = ((int) (class418.aFloatArray4768[12]
			      + ((class418.aFloatArray4768[0]
				  * (float) (((Class157_Sub3) this)
					     .anIntArray9679
					     [(class144.anInt1651
					       * 1842630443)]))
				 + (class418.aFloatArray4768[4]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9639
					       [(class144.anInt1651
						 * 1842630443)]))
				 + (class418.aFloatArray4768[8]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9648
					       [(class144.anInt1651
						 * 1842630443)]))))
		       * -1931908895);
		class144_154_.anInt1649
		    = ((int) (class418.aFloatArray4768[13]
			      + ((class418.aFloatArray4768[1]
				  * (float) (((Class157_Sub3) this)
					     .anIntArray9679
					     [(class144.anInt1651
					       * 1842630443)]))
				 + (class418.aFloatArray4768[5]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9639
					       [(class144.anInt1651
						 * 1842630443)]))
				 + (class418.aFloatArray4768[9]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9648
					       [(class144.anInt1651
						 * 1842630443)]))))
		       * -1055365151);
		class144_154_.anInt1650
		    = (int) (class418.aFloatArray4768[14]
			     + ((class418.aFloatArray4768[2]
				 * (float) (((Class157_Sub3) this)
					    .anIntArray9679
					    [class144.anInt1651 * 1842630443]))
				+ (class418.aFloatArray4768[6]
				   * (float) (((Class157_Sub3) this)
					      .anIntArray9639
					      [(class144.anInt1651
						* 1842630443)]))
				+ (class418.aFloatArray4768[10]
				   * (float) (((Class157_Sub3) this)
					      .anIntArray9648
					      [(class144.anInt1651
						* 1842630443)])))) * 870317833;
	    }
	}
    }
    
    public void method1873(int i) {
	((Class157_Sub3) this).anInt9629 = i;
	if (((Class157_Sub3) this).aClass143_9671 != null
	    && (((Class157_Sub3) this).anInt9629 & 0x10000) == 0) {
	    ((Class157_Sub3) this).aShortArray9673
		= (((Class143) ((Class157_Sub3) this).aClass143_9671)
		   .aShortArray1644);
	    ((Class157_Sub3) this).aShortArray9645
		= (((Class143) ((Class157_Sub3) this).aClass143_9671)
		   .aShortArray1642);
	    ((Class157_Sub3) this).aShortArray9646
		= (((Class143) ((Class157_Sub3) this).aClass143_9671)
		   .aShortArray1643);
	    ((Class157_Sub3) this).aByteArray9647
		= (((Class143) ((Class157_Sub3) this).aClass143_9671)
		   .aByteArray1641);
	    ((Class157_Sub3) this).aClass143_9671 = null;
	}
	((Class157_Sub3) this).aBool9668 = true;
	method8886();
    }
    
    public void method1934(int i) {
	int i_155_ = Class417.anIntArray4766[i];
	int i_156_ = Class417.anIntArray4767[i];
	for (int i_157_ = 0; i_157_ < ((Class157_Sub3) this).anInt9637;
	     i_157_++) {
	    int i_158_
		= ((((Class157_Sub3) this).anIntArray9639[i_157_] * i_156_
		    - ((Class157_Sub3) this).anIntArray9648[i_157_] * i_155_)
		   >> 14);
	    ((Class157_Sub3) this).anIntArray9648[i_157_]
		= ((((Class157_Sub3) this).anIntArray9639[i_157_] * i_155_
		    + ((Class157_Sub3) this).anIntArray9648[i_157_] * i_156_)
		   >> 14);
	    ((Class157_Sub3) this).anIntArray9639[i_157_] = i_158_;
	}
	if (((Class157_Sub3) this).aClass122_9661 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9661)
		.anInterface14_1542
		= null;
	((Class157_Sub3) this).aBool9649 = false;
    }
    
    public Class157 method1951(byte i, int i_159_, boolean bool) {
	boolean bool_160_ = false;
	Class157_Sub3 class157_sub3_161_;
	Class157_Sub3 class157_sub3_162_;
	if (i > 0 && i <= 8) {
	    class157_sub3_162_
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .aClass157_Sub3Array9590[i - 1]);
	    class157_sub3_161_
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .aClass157_Sub3Array9488[i - 1]);
	    bool_160_ = true;
	} else
	    class157_sub3_161_ = class157_sub3_162_
		= new Class157_Sub3(((Class157_Sub3) this)
				    .aClass173_Sub2_9628);
	return method8885(class157_sub3_161_, class157_sub3_162_, i_159_,
			  bool_160_, bool);
    }
    
    Class157 method8885(Class157_Sub3 class157_sub3_163_,
			Class157_Sub3 class157_sub3_164_, int i, boolean bool,
			boolean bool_165_) {
	((Class157_Sub3) class157_sub3_163_).aByte9669 = (byte) 0;
	((Class157_Sub3) class157_sub3_163_).anInt9629 = i;
	((Class157_Sub3) class157_sub3_163_).anInt9640
	    = ((Class157_Sub3) this).anInt9640;
	((Class157_Sub3) class157_sub3_163_).aShort9632
	    = ((Class157_Sub3) this).aShort9632;
	((Class157_Sub3) class157_sub3_163_).aShort9633
	    = ((Class157_Sub3) this).aShort9633;
	((Class157_Sub3) class157_sub3_163_).anInt9636
	    = ((Class157_Sub3) this).anInt9636;
	((Class157_Sub3) class157_sub3_163_).anInt9637
	    = ((Class157_Sub3) this).anInt9637;
	((Class157_Sub3) class157_sub3_163_).anInt9623
	    = ((Class157_Sub3) this).anInt9623;
	((Class157_Sub3) class157_sub3_163_).anInt9651
	    = ((Class157_Sub3) this).anInt9651;
	((Class157_Sub3) class157_sub3_163_).anInt9652
	    = ((Class157_Sub3) this).anInt9652;
	((Class157_Sub3) class157_sub3_163_).anInt9685
	    = ((Class157_Sub3) this).anInt9685;
	if ((i & 0x100) != 0)
	    ((Class157_Sub3) class157_sub3_163_).aBool9634 = true;
	else
	    ((Class157_Sub3) class157_sub3_163_).aBool9634
		= ((Class157_Sub3) this).aBool9634;
	((Class157_Sub3) class157_sub3_163_).aBool9635
	    = ((Class157_Sub3) this).aBool9635;
	boolean bool_166_
	    = Class117.method1443(i, ((Class157_Sub3) this).anInt9640);
	boolean bool_167_
	    = Class117.method1444(i, ((Class157_Sub3) this).anInt9640);
	boolean bool_168_
	    = Class117.method1445(i, ((Class157_Sub3) this).anInt9640);
	boolean bool_169_ = bool_166_ | bool_167_ | bool_168_;
	if (bool_169_) {
	    if (bool_166_) {
		if (((Class157_Sub3) class157_sub3_164_).anIntArray9679 == null
		    || ((((Class157_Sub3) class157_sub3_164_)
			 .anIntArray9679).length
			< ((Class157_Sub3) this).anInt9636))
		    ((Class157_Sub3) class157_sub3_163_).anIntArray9679
			= ((Class157_Sub3) class157_sub3_164_).anIntArray9679
			= new int[((Class157_Sub3) this).anInt9636];
		else
		    ((Class157_Sub3) class157_sub3_163_).anIntArray9679
			= ((Class157_Sub3) class157_sub3_164_).anIntArray9679;
	    } else
		((Class157_Sub3) class157_sub3_163_).anIntArray9679
		    = ((Class157_Sub3) this).anIntArray9679;
	    if (bool_167_) {
		if (((Class157_Sub3) class157_sub3_164_).anIntArray9639 == null
		    || ((((Class157_Sub3) class157_sub3_164_)
			 .anIntArray9639).length
			< ((Class157_Sub3) this).anInt9636))
		    ((Class157_Sub3) class157_sub3_163_).anIntArray9639
			= ((Class157_Sub3) class157_sub3_164_).anIntArray9639
			= new int[((Class157_Sub3) this).anInt9636];
		else
		    ((Class157_Sub3) class157_sub3_163_).anIntArray9639
			= ((Class157_Sub3) class157_sub3_164_).anIntArray9639;
	    } else
		((Class157_Sub3) class157_sub3_163_).anIntArray9639
		    = ((Class157_Sub3) this).anIntArray9639;
	    if (bool_168_) {
		if (((Class157_Sub3) class157_sub3_164_).anIntArray9648 == null
		    || ((((Class157_Sub3) class157_sub3_164_)
			 .anIntArray9648).length
			< ((Class157_Sub3) this).anInt9636))
		    ((Class157_Sub3) class157_sub3_163_).anIntArray9648
			= ((Class157_Sub3) class157_sub3_164_).anIntArray9648
			= new int[((Class157_Sub3) this).anInt9636];
		else
		    ((Class157_Sub3) class157_sub3_163_).anIntArray9648
			= ((Class157_Sub3) class157_sub3_164_).anIntArray9648;
	    } else
		((Class157_Sub3) class157_sub3_163_).anIntArray9648
		    = ((Class157_Sub3) this).anIntArray9648;
	    for (int i_170_ = 0; i_170_ < ((Class157_Sub3) this).anInt9636;
		 i_170_++) {
		if (bool_166_)
		    ((Class157_Sub3) class157_sub3_163_).anIntArray9679[i_170_]
			= ((Class157_Sub3) this).anIntArray9679[i_170_];
		if (bool_167_)
		    ((Class157_Sub3) class157_sub3_163_).anIntArray9639[i_170_]
			= ((Class157_Sub3) this).anIntArray9639[i_170_];
		if (bool_168_)
		    ((Class157_Sub3) class157_sub3_163_).anIntArray9648[i_170_]
			= ((Class157_Sub3) this).anIntArray9648[i_170_];
	    }
	} else {
	    ((Class157_Sub3) class157_sub3_163_).anIntArray9679
		= ((Class157_Sub3) this).anIntArray9679;
	    ((Class157_Sub3) class157_sub3_163_).anIntArray9639
		= ((Class157_Sub3) this).anIntArray9639;
	    ((Class157_Sub3) class157_sub3_163_).anIntArray9648
		= ((Class157_Sub3) this).anIntArray9648;
	}
	if (Class117.method1474(i, ((Class157_Sub3) this).anInt9640)) {
	    if (bool)
		((Class157_Sub3) class157_sub3_163_).aByte9669 |= 0x1;
	    ((Class157_Sub3) class157_sub3_163_).aClass122_9661
		= ((Class157_Sub3) class157_sub3_164_).aClass122_9661;
	    ((Class122) ((Class157_Sub3) class157_sub3_163_).aClass122_9661)
		.aByte1539
		= ((Class122) ((Class157_Sub3) this).aClass122_9661).aByte1539;
	    ((Class122) ((Class157_Sub3) class157_sub3_163_).aClass122_9661)
		.anInterface14_1542
		= (((Class122) ((Class157_Sub3) this).aClass122_9661)
		   .anInterface14_1542);
	} else if (Class117.method1455(i, ((Class157_Sub3) this).anInt9640))
	    ((Class157_Sub3) class157_sub3_163_).aClass122_9661
		= ((Class157_Sub3) this).aClass122_9661;
	else
	    ((Class157_Sub3) class157_sub3_163_).aClass122_9661 = null;
	if (Class117.method1509(i, ((Class157_Sub3) this).anInt9640)) {
	    if (((Class157_Sub3) class157_sub3_164_).aShortArray9653 == null
		|| (((Class157_Sub3) class157_sub3_164_).aShortArray9653.length
		    < ((Class157_Sub3) this).anInt9651))
		((Class157_Sub3) class157_sub3_163_).aShortArray9653
		    = ((Class157_Sub3) class157_sub3_164_).aShortArray9653
		    = new short[((Class157_Sub3) this).anInt9651];
	    else
		((Class157_Sub3) class157_sub3_163_).aShortArray9653
		    = ((Class157_Sub3) class157_sub3_164_).aShortArray9653;
	    for (int i_171_ = 0; i_171_ < ((Class157_Sub3) this).anInt9651;
		 i_171_++)
		((Class157_Sub3) class157_sub3_163_).aShortArray9653[i_171_]
		    = ((Class157_Sub3) this).aShortArray9653[i_171_];
	} else
	    ((Class157_Sub3) class157_sub3_163_).aShortArray9653
		= ((Class157_Sub3) this).aShortArray9653;
	if (Class117.method1449(i, ((Class157_Sub3) this).anInt9640)) {
	    if (((Class157_Sub3) class157_sub3_164_).aByteArray9654 == null
		|| (((Class157_Sub3) class157_sub3_164_).aByteArray9654.length
		    < ((Class157_Sub3) this).anInt9651))
		((Class157_Sub3) class157_sub3_163_).aByteArray9654
		    = ((Class157_Sub3) class157_sub3_164_).aByteArray9654
		    = new byte[((Class157_Sub3) this).anInt9651];
	    else
		((Class157_Sub3) class157_sub3_163_).aByteArray9654
		    = ((Class157_Sub3) class157_sub3_164_).aByteArray9654;
	    for (int i_172_ = 0; i_172_ < ((Class157_Sub3) this).anInt9651;
		 i_172_++)
		((Class157_Sub3) class157_sub3_163_).aByteArray9654[i_172_]
		    = ((Class157_Sub3) this).aByteArray9654[i_172_];
	} else
	    ((Class157_Sub3) class157_sub3_163_).aByteArray9654
		= ((Class157_Sub3) this).aByteArray9654;
	if (Class117.method1462(i, ((Class157_Sub3) this).anInt9640)) {
	    if (bool)
		((Class157_Sub3) class157_sub3_163_).aByte9669 |= 0x2;
	    ((Class157_Sub3) class157_sub3_163_).aClass122_9662
		= ((Class157_Sub3) class157_sub3_164_).aClass122_9662;
	    ((Class122) ((Class157_Sub3) class157_sub3_163_).aClass122_9662)
		.aByte1539
		= ((Class122) ((Class157_Sub3) this).aClass122_9662).aByte1539;
	    ((Class122) ((Class157_Sub3) class157_sub3_163_).aClass122_9662)
		.anInterface14_1542
		= (((Class122) ((Class157_Sub3) this).aClass122_9662)
		   .anInterface14_1542);
	} else if (Class117.method1520(i, ((Class157_Sub3) this).anInt9640))
	    ((Class157_Sub3) class157_sub3_163_).aClass122_9662
		= ((Class157_Sub3) this).aClass122_9662;
	else
	    ((Class157_Sub3) class157_sub3_163_).aClass122_9662 = null;
	if (Class117.method1447(i, ((Class157_Sub3) this).anInt9640)) {
	    if (((Class157_Sub3) class157_sub3_164_).aShortArray9673 == null
		|| (((Class157_Sub3) class157_sub3_164_).aShortArray9673.length
		    < ((Class157_Sub3) this).anInt9623)) {
		int i_173_ = ((Class157_Sub3) this).anInt9623;
		((Class157_Sub3) class157_sub3_163_).aShortArray9673
		    = ((Class157_Sub3) class157_sub3_164_).aShortArray9673
		    = new short[i_173_];
		((Class157_Sub3) class157_sub3_163_).aShortArray9645
		    = ((Class157_Sub3) class157_sub3_164_).aShortArray9645
		    = new short[i_173_];
		((Class157_Sub3) class157_sub3_163_).aShortArray9646
		    = ((Class157_Sub3) class157_sub3_164_).aShortArray9646
		    = new short[i_173_];
	    } else {
		((Class157_Sub3) class157_sub3_163_).aShortArray9673
		    = ((Class157_Sub3) class157_sub3_164_).aShortArray9673;
		((Class157_Sub3) class157_sub3_163_).aShortArray9645
		    = ((Class157_Sub3) class157_sub3_164_).aShortArray9645;
		((Class157_Sub3) class157_sub3_163_).aShortArray9646
		    = ((Class157_Sub3) class157_sub3_164_).aShortArray9646;
	    }
	    if (((Class157_Sub3) this).aClass143_9671 != null) {
		if (((Class157_Sub3) class157_sub3_164_).aClass143_9671
		    == null)
		    ((Class157_Sub3) class157_sub3_164_).aClass143_9671
			= new Class143();
		Class143 class143
		    = (((Class157_Sub3) class157_sub3_163_).aClass143_9671
		       = ((Class157_Sub3) class157_sub3_164_).aClass143_9671);
		if (((Class143) class143).aShortArray1644 == null
		    || (((Class143) class143).aShortArray1644.length
			< ((Class157_Sub3) this).anInt9623)) {
		    int i_174_ = ((Class157_Sub3) this).anInt9623;
		    ((Class143) class143).aShortArray1644 = new short[i_174_];
		    ((Class143) class143).aShortArray1642 = new short[i_174_];
		    ((Class143) class143).aShortArray1643 = new short[i_174_];
		    ((Class143) class143).aByteArray1641 = new byte[i_174_];
		}
		for (int i_175_ = 0; i_175_ < ((Class157_Sub3) this).anInt9623;
		     i_175_++) {
		    ((Class157_Sub3) class157_sub3_163_).aShortArray9673
			[i_175_]
			= ((Class157_Sub3) this).aShortArray9673[i_175_];
		    ((Class157_Sub3) class157_sub3_163_).aShortArray9645
			[i_175_]
			= ((Class157_Sub3) this).aShortArray9645[i_175_];
		    ((Class157_Sub3) class157_sub3_163_).aShortArray9646
			[i_175_]
			= ((Class157_Sub3) this).aShortArray9646[i_175_];
		    ((Class143) class143).aShortArray1644[i_175_]
			= (((Class143) ((Class157_Sub3) this).aClass143_9671)
			   .aShortArray1644[i_175_]);
		    ((Class143) class143).aShortArray1642[i_175_]
			= (((Class143) ((Class157_Sub3) this).aClass143_9671)
			   .aShortArray1642[i_175_]);
		    ((Class143) class143).aShortArray1643[i_175_]
			= (((Class143) ((Class157_Sub3) this).aClass143_9671)
			   .aShortArray1643[i_175_]);
		    ((Class143) class143).aByteArray1641[i_175_]
			= (((Class143) ((Class157_Sub3) this).aClass143_9671)
			   .aByteArray1641[i_175_]);
		}
	    } else {
		for (int i_176_ = 0; i_176_ < ((Class157_Sub3) this).anInt9623;
		     i_176_++) {
		    ((Class157_Sub3) class157_sub3_163_).aShortArray9673
			[i_176_]
			= ((Class157_Sub3) this).aShortArray9673[i_176_];
		    ((Class157_Sub3) class157_sub3_163_).aShortArray9645
			[i_176_]
			= ((Class157_Sub3) this).aShortArray9645[i_176_];
		    ((Class157_Sub3) class157_sub3_163_).aShortArray9646
			[i_176_]
			= ((Class157_Sub3) this).aShortArray9646[i_176_];
		}
	    }
	    ((Class157_Sub3) class157_sub3_163_).aByteArray9647
		= ((Class157_Sub3) this).aByteArray9647;
	} else {
	    ((Class157_Sub3) class157_sub3_163_).aClass143_9671
		= ((Class157_Sub3) this).aClass143_9671;
	    ((Class157_Sub3) class157_sub3_163_).aShortArray9673
		= ((Class157_Sub3) this).aShortArray9673;
	    ((Class157_Sub3) class157_sub3_163_).aShortArray9645
		= ((Class157_Sub3) this).aShortArray9645;
	    ((Class157_Sub3) class157_sub3_163_).aShortArray9646
		= ((Class157_Sub3) this).aShortArray9646;
	    ((Class157_Sub3) class157_sub3_163_).aByteArray9647
		= ((Class157_Sub3) this).aByteArray9647;
	}
	if (Class117.method1461(i, ((Class157_Sub3) this).anInt9640)) {
	    if (bool)
		((Class157_Sub3) class157_sub3_163_).aByte9669 |= 0x4;
	    ((Class157_Sub3) class157_sub3_163_).aClass122_9663
		= ((Class157_Sub3) class157_sub3_164_).aClass122_9663;
	    ((Class122) ((Class157_Sub3) class157_sub3_163_).aClass122_9663)
		.aByte1539
		= ((Class122) ((Class157_Sub3) this).aClass122_9663).aByte1539;
	    ((Class122) ((Class157_Sub3) class157_sub3_163_).aClass122_9663)
		.anInterface14_1542
		= (((Class122) ((Class157_Sub3) this).aClass122_9663)
		   .anInterface14_1542);
	} else if (Class117.method1456(i, ((Class157_Sub3) this).anInt9640))
	    ((Class157_Sub3) class157_sub3_163_).aClass122_9663
		= ((Class157_Sub3) this).aClass122_9663;
	else
	    ((Class157_Sub3) class157_sub3_163_).aClass122_9663 = null;
	if (Class117.method1463(i, ((Class157_Sub3) this).anInt9640)) {
	    if (((Class157_Sub3) class157_sub3_164_).aFloatArray9631 == null
		|| (((Class157_Sub3) class157_sub3_164_).aFloatArray9631.length
		    < ((Class157_Sub3) this).anInt9651)) {
		int i_177_ = ((Class157_Sub3) this).anInt9623;
		((Class157_Sub3) class157_sub3_163_).aFloatArray9631
		    = ((Class157_Sub3) class157_sub3_164_).aFloatArray9631
		    = new float[i_177_];
		((Class157_Sub3) class157_sub3_163_).aFloatArray9650
		    = ((Class157_Sub3) class157_sub3_164_).aFloatArray9650
		    = new float[i_177_];
	    } else {
		((Class157_Sub3) class157_sub3_163_).aFloatArray9631
		    = ((Class157_Sub3) class157_sub3_164_).aFloatArray9631;
		((Class157_Sub3) class157_sub3_163_).aFloatArray9650
		    = ((Class157_Sub3) class157_sub3_164_).aFloatArray9650;
	    }
	    for (int i_178_ = 0; i_178_ < ((Class157_Sub3) this).anInt9623;
		 i_178_++) {
		((Class157_Sub3) class157_sub3_163_).aFloatArray9631[i_178_]
		    = ((Class157_Sub3) this).aFloatArray9631[i_178_];
		((Class157_Sub3) class157_sub3_163_).aFloatArray9650[i_178_]
		    = ((Class157_Sub3) this).aFloatArray9650[i_178_];
	    }
	} else {
	    ((Class157_Sub3) class157_sub3_163_).aFloatArray9631
		= ((Class157_Sub3) this).aFloatArray9631;
	    ((Class157_Sub3) class157_sub3_163_).aFloatArray9650
		= ((Class157_Sub3) this).aFloatArray9650;
	}
	if (Class117.method1541(i, ((Class157_Sub3) this).anInt9640)) {
	    if (bool)
		((Class157_Sub3) class157_sub3_163_).aByte9669 |= 0x8;
	    ((Class157_Sub3) class157_sub3_163_).aClass122_9686
		= ((Class157_Sub3) class157_sub3_164_).aClass122_9686;
	    ((Class122) ((Class157_Sub3) class157_sub3_163_).aClass122_9686)
		.aByte1539
		= ((Class122) ((Class157_Sub3) this).aClass122_9686).aByte1539;
	    ((Class122) ((Class157_Sub3) class157_sub3_163_).aClass122_9686)
		.anInterface14_1542
		= (((Class122) ((Class157_Sub3) this).aClass122_9686)
		   .anInterface14_1542);
	} else if (Class117.method1529(i, ((Class157_Sub3) this).anInt9640))
	    ((Class157_Sub3) class157_sub3_163_).aClass122_9686
		= ((Class157_Sub3) this).aClass122_9686;
	else
	    ((Class157_Sub3) class157_sub3_163_).aClass122_9686 = null;
	if (Class117.method1507(i, ((Class157_Sub3) this).anInt9640)) {
	    if (((Class157_Sub3) class157_sub3_164_).aShortArray9655 == null
		|| (((Class157_Sub3) class157_sub3_164_).aShortArray9655.length
		    < ((Class157_Sub3) this).anInt9651)) {
		int i_179_ = ((Class157_Sub3) this).anInt9651;
		((Class157_Sub3) class157_sub3_163_).aShortArray9655
		    = ((Class157_Sub3) class157_sub3_164_).aShortArray9655
		    = new short[i_179_];
		((Class157_Sub3) class157_sub3_163_).aShortArray9638
		    = ((Class157_Sub3) class157_sub3_164_).aShortArray9638
		    = new short[i_179_];
		((Class157_Sub3) class157_sub3_163_).aShortArray9657
		    = ((Class157_Sub3) class157_sub3_164_).aShortArray9657
		    = new short[i_179_];
	    } else {
		((Class157_Sub3) class157_sub3_163_).aShortArray9655
		    = ((Class157_Sub3) class157_sub3_164_).aShortArray9655;
		((Class157_Sub3) class157_sub3_163_).aShortArray9638
		    = ((Class157_Sub3) class157_sub3_164_).aShortArray9638;
		((Class157_Sub3) class157_sub3_163_).aShortArray9657
		    = ((Class157_Sub3) class157_sub3_164_).aShortArray9657;
	    }
	    for (int i_180_ = 0; i_180_ < ((Class157_Sub3) this).anInt9651;
		 i_180_++) {
		((Class157_Sub3) class157_sub3_163_).aShortArray9655[i_180_]
		    = ((Class157_Sub3) this).aShortArray9655[i_180_];
		((Class157_Sub3) class157_sub3_163_).aShortArray9638[i_180_]
		    = ((Class157_Sub3) this).aShortArray9638[i_180_];
		((Class157_Sub3) class157_sub3_163_).aShortArray9657[i_180_]
		    = ((Class157_Sub3) this).aShortArray9657[i_180_];
	    }
	} else {
	    ((Class157_Sub3) class157_sub3_163_).aShortArray9655
		= ((Class157_Sub3) this).aShortArray9655;
	    ((Class157_Sub3) class157_sub3_163_).aShortArray9638
		= ((Class157_Sub3) this).aShortArray9638;
	    ((Class157_Sub3) class157_sub3_163_).aShortArray9657
		= ((Class157_Sub3) this).aShortArray9657;
	}
	if (Class117.method1492(i, ((Class157_Sub3) this).anInt9640)) {
	    if (bool)
		((Class157_Sub3) class157_sub3_163_).aByte9669 |= 0x10;
	    ((Class157_Sub3) class157_sub3_163_).aClass129_9665
		= ((Class157_Sub3) class157_sub3_164_).aClass129_9665;
	    ((Class129) ((Class157_Sub3) class157_sub3_163_).aClass129_9665)
		.anInterface16_1588
		= (((Class129) ((Class157_Sub3) this).aClass129_9665)
		   .anInterface16_1588);
	} else if (Class117.method1459(i, ((Class157_Sub3) this).anInt9640))
	    ((Class157_Sub3) class157_sub3_163_).aClass129_9665
		= ((Class157_Sub3) this).aClass129_9665;
	else
	    ((Class157_Sub3) class157_sub3_163_).aClass129_9665 = null;
	if (Class117.method1452(i, ((Class157_Sub3) this).anInt9640)) {
	    if (((Class157_Sub3) class157_sub3_164_).aShortArray9658 == null
		|| (((Class157_Sub3) class157_sub3_164_).aShortArray9658.length
		    < ((Class157_Sub3) this).anInt9651)) {
		int i_181_ = ((Class157_Sub3) this).anInt9651;
		((Class157_Sub3) class157_sub3_163_).aShortArray9658
		    = ((Class157_Sub3) class157_sub3_164_).aShortArray9658
		    = new short[i_181_];
	    } else
		((Class157_Sub3) class157_sub3_163_).aShortArray9658
		    = ((Class157_Sub3) class157_sub3_164_).aShortArray9658;
	    for (int i_182_ = 0; i_182_ < ((Class157_Sub3) this).anInt9651;
		 i_182_++)
		((Class157_Sub3) class157_sub3_163_).aShortArray9658[i_182_]
		    = ((Class157_Sub3) this).aShortArray9658[i_182_];
	} else
	    ((Class157_Sub3) class157_sub3_163_).aShortArray9658
		= ((Class157_Sub3) this).aShortArray9658;
	if (Class117.method1478(i, ((Class157_Sub3) this).anInt9640)) {
	    if (((Class157_Sub3) class157_sub3_164_).aClass113Array9687 == null
		|| ((((Class157_Sub3) class157_sub3_164_)
		     .aClass113Array9687).length
		    < ((Class157_Sub3) this).anInt9685)) {
		int i_183_ = ((Class157_Sub3) this).anInt9685;
		((Class157_Sub3) class157_sub3_163_).aClass113Array9687
		    = ((Class157_Sub3) class157_sub3_164_).aClass113Array9687
		    = new Class113[i_183_];
		for (int i_184_ = 0; i_184_ < ((Class157_Sub3) this).anInt9685;
		     i_184_++)
		    ((Class157_Sub3) class157_sub3_163_).aClass113Array9687
			[i_184_]
			= ((Class157_Sub3) this).aClass113Array9687[i_184_]
			      .method1439();
	    } else {
		((Class157_Sub3) class157_sub3_163_).aClass113Array9687
		    = ((Class157_Sub3) class157_sub3_164_).aClass113Array9687;
		for (int i_185_ = 0; i_185_ < ((Class157_Sub3) this).anInt9685;
		     i_185_++)
		    ((Class157_Sub3) class157_sub3_163_).aClass113Array9687
			[i_185_].method1440
			(((Class157_Sub3) this).aClass113Array9687[i_185_]);
	    }
	} else
	    ((Class157_Sub3) class157_sub3_163_).aClass113Array9687
		= ((Class157_Sub3) this).aClass113Array9687;
	((Class157_Sub3) class157_sub3_163_).aClass145Array9684
	    = ((Class157_Sub3) this).aClass145Array9684;
	if (((Class157_Sub3) this).aBool9649) {
	    ((Class157_Sub3) class157_sub3_163_).anInt9666
		= ((Class157_Sub3) this).anInt9666;
	    ((Class157_Sub3) class157_sub3_163_).anInt9681
		= ((Class157_Sub3) this).anInt9681;
	    ((Class157_Sub3) class157_sub3_163_).aShort9674
		= ((Class157_Sub3) this).aShort9674;
	    ((Class157_Sub3) class157_sub3_163_).aShort9688
		= ((Class157_Sub3) this).aShort9688;
	    ((Class157_Sub3) class157_sub3_163_).aShort9670
		= ((Class157_Sub3) this).aShort9670;
	    ((Class157_Sub3) class157_sub3_163_).aShort9693
		= ((Class157_Sub3) this).aShort9693;
	    ((Class157_Sub3) class157_sub3_163_).aShort9676
		= ((Class157_Sub3) this).aShort9676;
	    ((Class157_Sub3) class157_sub3_163_).aShort9644
		= ((Class157_Sub3) this).aShort9644;
	    ((Class157_Sub3) class157_sub3_163_).aBool9649 = true;
	} else
	    ((Class157_Sub3) class157_sub3_163_).aBool9649 = false;
	if (((Class157_Sub3) this).aBool9678) {
	    ((Class157_Sub3) class157_sub3_163_).aShort9672
		= ((Class157_Sub3) this).aShort9672;
	    ((Class157_Sub3) class157_sub3_163_).aBool9678 = true;
	} else
	    ((Class157_Sub3) class157_sub3_163_).aBool9678 = false;
	((Class157_Sub3) class157_sub3_163_).anIntArrayArray9641
	    = ((Class157_Sub3) this).anIntArrayArray9641;
	((Class157_Sub3) class157_sub3_163_).anIntArrayArray9659
	    = ((Class157_Sub3) this).anIntArrayArray9659;
	((Class157_Sub3) class157_sub3_163_).anIntArrayArray9691
	    = ((Class157_Sub3) this).anIntArrayArray9691;
	((Class157_Sub3) class157_sub3_163_).aShortArray9682
	    = ((Class157_Sub3) this).aShortArray9682;
	((Class157_Sub3) class157_sub3_163_).anIntArray9660
	    = ((Class157_Sub3) this).anIntArray9660;
	((Class157_Sub3) class157_sub3_163_).aShortArray9642
	    = ((Class157_Sub3) this).aShortArray9642;
	((Class157_Sub3) class157_sub3_163_).aShortArray9677
	    = ((Class157_Sub3) this).aShortArray9677;
	((Class157_Sub3) class157_sub3_163_).anIntArray9680
	    = ((Class157_Sub3) this).anIntArray9680;
	((Class157_Sub3) class157_sub3_163_).aClass170Array9683
	    = ((Class157_Sub3) this).aClass170Array9683;
	((Class157_Sub3) class157_sub3_163_).aClass144Array9664
	    = ((Class157_Sub3) this).aClass144Array9664;
	return class157_sub3_163_;
    }
    
    boolean method1889() {
	if (((Class157_Sub3) this).anIntArrayArray9641 == null)
	    return false;
	for (int i = 0; i < ((Class157_Sub3) this).anInt9636; i++) {
	    ((Class157_Sub3) this).anIntArray9679[i] <<= 4;
	    ((Class157_Sub3) this).anIntArray9639[i] <<= 4;
	    ((Class157_Sub3) this).anIntArray9648[i] <<= 4;
	}
	anInt9694 = 0;
	anInt9695 = 0;
	anInt9696 = 0;
	return true;
    }
    
    public void method1878(int i) {
	int i_186_ = Class417.anIntArray4766[i];
	int i_187_ = Class417.anIntArray4767[i];
	for (int i_188_ = 0; i_188_ < ((Class157_Sub3) this).anInt9637;
	     i_188_++) {
	    int i_189_
		= ((((Class157_Sub3) this).anIntArray9648[i_188_] * i_186_
		    + ((Class157_Sub3) this).anIntArray9679[i_188_] * i_187_)
		   >> 14);
	    ((Class157_Sub3) this).anIntArray9648[i_188_]
		= ((((Class157_Sub3) this).anIntArray9648[i_188_] * i_187_
		    - ((Class157_Sub3) this).anIntArray9679[i_188_] * i_186_)
		   >> 14);
	    ((Class157_Sub3) this).anIntArray9679[i_188_] = i_189_;
	}
	if (((Class157_Sub3) this).aClass122_9661 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9661)
		.anInterface14_1542
		= null;
	((Class157_Sub3) this).aBool9649 = false;
    }
    
    public void method1932(int i) {
	int i_190_ = Class417.anIntArray4766[i];
	int i_191_ = Class417.anIntArray4767[i];
	for (int i_192_ = 0; i_192_ < ((Class157_Sub3) this).anInt9637;
	     i_192_++) {
	    int i_193_
		= ((((Class157_Sub3) this).anIntArray9648[i_192_] * i_190_
		    + ((Class157_Sub3) this).anIntArray9679[i_192_] * i_191_)
		   >> 14);
	    ((Class157_Sub3) this).anIntArray9648[i_192_]
		= ((((Class157_Sub3) this).anIntArray9648[i_192_] * i_191_
		    - ((Class157_Sub3) this).anIntArray9679[i_192_] * i_190_)
		   >> 14);
	    ((Class157_Sub3) this).anIntArray9679[i_192_] = i_193_;
	}
	for (int i_194_ = 0; i_194_ < ((Class157_Sub3) this).anInt9623;
	     i_194_++) {
	    int i_195_
		= ((((Class157_Sub3) this).aShortArray9646[i_194_] * i_190_
		    + ((Class157_Sub3) this).aShortArray9673[i_194_] * i_191_)
		   >> 14);
	    ((Class157_Sub3) this).aShortArray9646[i_194_]
		= (short) (((((Class157_Sub3) this).aShortArray9646[i_194_]
			     * i_191_)
			    - (((Class157_Sub3) this).aShortArray9673[i_194_]
			       * i_190_))
			   >> 14);
	    ((Class157_Sub3) this).aShortArray9673[i_194_] = (short) i_195_;
	}
	if (((Class157_Sub3) this).aClass122_9663 == null
	    && ((Class157_Sub3) this).aClass122_9662 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9662)
		.anInterface14_1542
		= null;
	if (((Class157_Sub3) this).aClass122_9663 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9663)
		.anInterface14_1542
		= null;
	if (((Class157_Sub3) this).aClass122_9661 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9661)
		.anInterface14_1542
		= null;
	((Class157_Sub3) this).aBool9649 = false;
    }
    
    public int method1874() {
	return ((Class157_Sub3) this).anInt9629;
    }
    
    public void method1879(int i) {
	int i_196_ = Class417.anIntArray4766[i];
	int i_197_ = Class417.anIntArray4767[i];
	for (int i_198_ = 0; i_198_ < ((Class157_Sub3) this).anInt9637;
	     i_198_++) {
	    int i_199_
		= ((((Class157_Sub3) this).anIntArray9639[i_198_] * i_196_
		    + ((Class157_Sub3) this).anIntArray9679[i_198_] * i_197_)
		   >> 14);
	    ((Class157_Sub3) this).anIntArray9639[i_198_]
		= ((((Class157_Sub3) this).anIntArray9639[i_198_] * i_197_
		    - ((Class157_Sub3) this).anIntArray9679[i_198_] * i_196_)
		   >> 14);
	    ((Class157_Sub3) this).anIntArray9679[i_198_] = i_199_;
	}
	if (((Class157_Sub3) this).aClass122_9661 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9661)
		.anInterface14_1542
		= null;
	((Class157_Sub3) this).aBool9649 = false;
    }
    
    void method2028() {
	/* empty */
    }
    
    public void method2002() {
	for (int i = 0; i < ((Class157_Sub3) this).anInt9637; i++)
	    ((Class157_Sub3) this).anIntArray9648[i]
		= -((Class157_Sub3) this).anIntArray9648[i];
	for (int i = 0; i < ((Class157_Sub3) this).anInt9623; i++)
	    ((Class157_Sub3) this).aShortArray9646[i]
		= (short) -((Class157_Sub3) this).aShortArray9646[i];
	for (int i = 0; i < ((Class157_Sub3) this).anInt9651; i++) {
	    short i_200_ = ((Class157_Sub3) this).aShortArray9655[i];
	    ((Class157_Sub3) this).aShortArray9655[i]
		= ((Class157_Sub3) this).aShortArray9657[i];
	    ((Class157_Sub3) this).aShortArray9657[i] = i_200_;
	}
	if (((Class157_Sub3) this).aClass122_9663 == null
	    && ((Class157_Sub3) this).aClass122_9662 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9662)
		.anInterface14_1542
		= null;
	if (((Class157_Sub3) this).aClass122_9663 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9663)
		.anInterface14_1542
		= null;
	if (((Class157_Sub3) this).aClass122_9661 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9661)
		.anInterface14_1542
		= null;
	if (((Class157_Sub3) this).aClass129_9665 != null)
	    ((Class129) ((Class157_Sub3) this).aClass129_9665)
		.anInterface16_1588
		= null;
	((Class157_Sub3) this).aBool9649 = false;
    }
    
    public void method2011(int i, int i_201_, int i_202_) {
	for (int i_203_ = 0; i_203_ < ((Class157_Sub3) this).anInt9637;
	     i_203_++) {
	    if (i != 128)
		((Class157_Sub3) this).anIntArray9679[i_203_]
		    = ((Class157_Sub3) this).anIntArray9679[i_203_] * i >> 7;
	    if (i_201_ != 128)
		((Class157_Sub3) this).anIntArray9639[i_203_]
		    = (((Class157_Sub3) this).anIntArray9639[i_203_] * i_201_
		       >> 7);
	    if (i_202_ != 128)
		((Class157_Sub3) this).anIntArray9648[i_203_]
		    = (((Class157_Sub3) this).anIntArray9648[i_203_] * i_202_
		       >> 7);
	}
	if (((Class157_Sub3) this).aClass122_9661 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9661)
		.anInterface14_1542
		= null;
	((Class157_Sub3) this).aBool9649 = false;
    }
    
    public void method1883(int i, int i_204_, Class137 class137,
			   Class137 class137_205_, int i_206_, int i_207_,
			   int i_208_) {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	int i_209_ = i_206_ + ((Class157_Sub3) this).aShort9674;
	int i_210_ = i_206_ + ((Class157_Sub3) this).aShort9688;
	int i_211_ = i_208_ + ((Class157_Sub3) this).aShort9676;
	int i_212_ = i_208_ + ((Class157_Sub3) this).aShort9644;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_209_ >= 0
		&& ((i_210_ + class137.anInt1628 * 2130003981
		     >> class137.anInt1625 * 1543345989)
		    < class137.anInt1627 * -657933437)
		&& i_211_ >= 0
		&& ((i_212_ + class137.anInt1628 * 2130003981
		     >> class137.anInt1625 * 1543345989)
		    < class137.anInt1626 * 1769495707))) {
	    if (i == 4 || i == 5) {
		if (class137_205_ == null
		    || (i_209_ < 0
			|| ((i_210_ + class137_205_.anInt1628 * 2130003981
			     >> class137_205_.anInt1625 * 1543345989)
			    >= class137_205_.anInt1627 * -657933437)
			|| i_211_ < 0
			|| ((i_212_ + class137_205_.anInt1628 * 2130003981
			     >> class137_205_.anInt1625 * 1543345989)
			    >= class137_205_.anInt1626 * 1769495707)))
		    return;
	    } else {
		i_209_ >>= class137.anInt1625 * 1543345989;
		i_210_ = (i_210_ + (class137.anInt1628 * 2130003981 - 1)
			  >> class137.anInt1625 * 1543345989);
		i_211_ >>= class137.anInt1625 * 1543345989;
		i_212_ = (i_212_ + (class137.anInt1628 * 2130003981 - 1)
			  >> class137.anInt1625 * 1543345989);
		if (class137.method1669(i_209_, i_211_, (byte) 0) == i_207_
		    && class137.method1669(i_210_, i_211_, (byte) 0) == i_207_
		    && class137.method1669(i_209_, i_212_, (byte) 0) == i_207_
		    && class137.method1669(i_210_, i_212_, (byte) 0) == i_207_)
		    return;
	    }
	    if (i == 1) {
		for (int i_213_ = 0; i_213_ < ((Class157_Sub3) this).anInt9637;
		     i_213_++)
		    ((Class157_Sub3) this).anIntArray9639[i_213_]
			= (((Class157_Sub3) this).anIntArray9639[i_213_]
			   + class137.method1657(((((Class157_Sub3) this)
						   .anIntArray9679[i_213_])
						  + i_206_),
						 ((((Class157_Sub3) this)
						   .anIntArray9648[i_213_])
						  + i_208_),
						 1480290519)
			   - i_207_);
	    } else if (i == 2) {
		int i_214_ = ((Class157_Sub3) this).aShort9670;
		if (i_214_ == 0)
		    return;
		for (int i_215_ = 0; i_215_ < ((Class157_Sub3) this).anInt9637;
		     i_215_++) {
		    int i_216_ = (((Class157_Sub3) this).anIntArray9639[i_215_]
				  << 16) / i_214_;
		    if (i_216_ < i_204_)
			((Class157_Sub3) this).anIntArray9639[i_215_]
			    = (((Class157_Sub3) this).anIntArray9639[i_215_]
			       + (class137.method1657((((Class157_Sub3) this)
						       .anIntArray9679
						       [i_215_]) + i_206_,
						      (((Class157_Sub3) this)
						       .anIntArray9648
						       [i_215_]) + i_208_,
						      754556772)
				  - i_207_) * (i_204_ - i_216_) / i_204_);
		}
	    } else if (i == 3) {
		int i_217_ = (i_204_ & 0xff) * 4;
		int i_218_ = (i_204_ >> 8 & 0xff) * 4;
		int i_219_ = (i_204_ >> 16 & 0xff) << 6;
		int i_220_ = (i_204_ >> 24 & 0xff) << 6;
		if (i_206_ - (i_217_ >> 1) < 0
		    || ((i_206_ + (i_217_ >> 1)
			 + class137.anInt1628 * 2130003981)
			>= (class137.anInt1627 * -657933437
			    << class137.anInt1625 * 1543345989))
		    || i_208_ - (i_218_ >> 1) < 0
		    || ((i_208_ + (i_218_ >> 1)
			 + class137.anInt1628 * 2130003981)
			>= (class137.anInt1626 * 1769495707
			    << class137.anInt1625 * 1543345989)))
		    return;
		method1884(class137, i_206_, i_207_, i_208_, i_217_, i_218_,
			   i_219_, i_220_);
	    } else if (i == 4) {
		int i_221_ = (((Class157_Sub3) this).aShort9693
			      - ((Class157_Sub3) this).aShort9670);
		for (int i_222_ = 0; i_222_ < ((Class157_Sub3) this).anInt9637;
		     i_222_++)
		    ((Class157_Sub3) this).anIntArray9639[i_222_]
			= (((Class157_Sub3) this).anIntArray9639[i_222_]
			   + (class137_205_.method1657((((Class157_Sub3) this)
							.anIntArray9679
							[i_222_]) + i_206_,
						       (((Class157_Sub3) this)
							.anIntArray9648
							[i_222_]) + i_208_,
						       829092491)
			      - i_207_)
			   + i_221_);
	    } else if (i == 5) {
		int i_223_ = (((Class157_Sub3) this).aShort9693
			      - ((Class157_Sub3) this).aShort9670);
		for (int i_224_ = 0; i_224_ < ((Class157_Sub3) this).anInt9637;
		     i_224_++) {
		    int i_225_ = (((Class157_Sub3) this).anIntArray9679[i_224_]
				  + i_206_);
		    int i_226_ = (((Class157_Sub3) this).anIntArray9648[i_224_]
				  + i_208_);
		    int i_227_
			= class137.method1657(i_225_, i_226_, 1070887979);
		    int i_228_
			= class137_205_.method1657(i_225_, i_226_, 1170212731);
		    int i_229_ = i_227_ - i_228_ - i_204_;
		    ((Class157_Sub3) this).anIntArray9639[i_224_]
			= ((((Class157_Sub3) this).anIntArray9639[i_224_]
			    << 8) / i_223_ * i_229_
			   >> 8) - (i_207_ - i_227_);
		}
	    }
	    if (((Class157_Sub3) this).aClass122_9661 != null)
		((Class122) ((Class157_Sub3) this).aClass122_9661)
		    .anInterface14_1542
		    = null;
	    ((Class157_Sub3) this).aBool9649 = false;
	}
    }
    
    void method1962(int i, int i_230_, int i_231_, int i_232_) {
	if (i == 0) {
	    int i_233_ = 0;
	    anInt9694 = 0;
	    anInt9695 = 0;
	    anInt9696 = 0;
	    for (int i_234_ = 0; i_234_ < ((Class157_Sub3) this).anInt9637;
		 i_234_++) {
		anInt9694 += ((Class157_Sub3) this).anIntArray9679[i_234_];
		anInt9695 += ((Class157_Sub3) this).anIntArray9639[i_234_];
		anInt9696 += ((Class157_Sub3) this).anIntArray9648[i_234_];
		i_233_++;
	    }
	    if (i_233_ > 0) {
		anInt9694 = anInt9694 / i_233_ + i_230_;
		anInt9695 = anInt9695 / i_233_ + i_231_;
		anInt9696 = anInt9696 / i_233_ + i_232_;
	    } else {
		anInt9694 = i_230_;
		anInt9695 = i_231_;
		anInt9696 = i_232_;
	    }
	} else if (i == 1) {
	    for (int i_235_ = 0; i_235_ < ((Class157_Sub3) this).anInt9637;
		 i_235_++) {
		((Class157_Sub3) this).anIntArray9679[i_235_] += i_230_;
		((Class157_Sub3) this).anIntArray9639[i_235_] += i_231_;
		((Class157_Sub3) this).anIntArray9648[i_235_] += i_232_;
	    }
	} else if (i == 2) {
	    for (int i_236_ = 0; i_236_ < ((Class157_Sub3) this).anInt9637;
		 i_236_++) {
		((Class157_Sub3) this).anIntArray9679[i_236_] -= anInt9694;
		((Class157_Sub3) this).anIntArray9639[i_236_] -= anInt9695;
		((Class157_Sub3) this).anIntArray9648[i_236_] -= anInt9696;
		if (i_232_ != 0) {
		    int i_237_ = Class417.anIntArray4766[i_232_];
		    int i_238_ = Class417.anIntArray4767[i_232_];
		    int i_239_
			= (((((Class157_Sub3) this).anIntArray9639[i_236_]
			     * i_237_)
			    + (((Class157_Sub3) this).anIntArray9679[i_236_]
			       * i_238_)
			    + 16383)
			   >> 14);
		    ((Class157_Sub3) this).anIntArray9639[i_236_]
			= ((((Class157_Sub3) this).anIntArray9639[i_236_]
			    * i_238_)
			   - (((Class157_Sub3) this).anIntArray9679[i_236_]
			      * i_237_)
			   + 16383) >> 14;
		    ((Class157_Sub3) this).anIntArray9679[i_236_] = i_239_;
		}
		if (i_230_ != 0) {
		    int i_240_ = Class417.anIntArray4766[i_230_];
		    int i_241_ = Class417.anIntArray4767[i_230_];
		    int i_242_
			= (((((Class157_Sub3) this).anIntArray9639[i_236_]
			     * i_241_)
			    - (((Class157_Sub3) this).anIntArray9648[i_236_]
			       * i_240_)
			    + 16383)
			   >> 14);
		    ((Class157_Sub3) this).anIntArray9648[i_236_]
			= ((((Class157_Sub3) this).anIntArray9639[i_236_]
			    * i_240_)
			   + (((Class157_Sub3) this).anIntArray9648[i_236_]
			      * i_241_)
			   + 16383) >> 14;
		    ((Class157_Sub3) this).anIntArray9639[i_236_] = i_242_;
		}
		if (i_231_ != 0) {
		    int i_243_ = Class417.anIntArray4766[i_231_];
		    int i_244_ = Class417.anIntArray4767[i_231_];
		    int i_245_
			= (((((Class157_Sub3) this).anIntArray9648[i_236_]
			     * i_243_)
			    + (((Class157_Sub3) this).anIntArray9679[i_236_]
			       * i_244_)
			    + 16383)
			   >> 14);
		    ((Class157_Sub3) this).anIntArray9648[i_236_]
			= ((((Class157_Sub3) this).anIntArray9648[i_236_]
			    * i_244_)
			   - (((Class157_Sub3) this).anIntArray9679[i_236_]
			      * i_243_)
			   + 16383) >> 14;
		    ((Class157_Sub3) this).anIntArray9679[i_236_] = i_245_;
		}
		((Class157_Sub3) this).anIntArray9679[i_236_] += anInt9694;
		((Class157_Sub3) this).anIntArray9639[i_236_] += anInt9695;
		((Class157_Sub3) this).anIntArray9648[i_236_] += anInt9696;
	    }
	} else if (i == 3) {
	    for (int i_246_ = 0; i_246_ < ((Class157_Sub3) this).anInt9637;
		 i_246_++) {
		((Class157_Sub3) this).anIntArray9679[i_246_] -= anInt9694;
		((Class157_Sub3) this).anIntArray9639[i_246_] -= anInt9695;
		((Class157_Sub3) this).anIntArray9648[i_246_] -= anInt9696;
		((Class157_Sub3) this).anIntArray9679[i_246_]
		    = (((Class157_Sub3) this).anIntArray9679[i_246_] * i_230_
		       / 128);
		((Class157_Sub3) this).anIntArray9639[i_246_]
		    = (((Class157_Sub3) this).anIntArray9639[i_246_] * i_231_
		       / 128);
		((Class157_Sub3) this).anIntArray9648[i_246_]
		    = (((Class157_Sub3) this).anIntArray9648[i_246_] * i_232_
		       / 128);
		((Class157_Sub3) this).anIntArray9679[i_246_] += anInt9694;
		((Class157_Sub3) this).anIntArray9639[i_246_] += anInt9695;
		((Class157_Sub3) this).anIntArray9648[i_246_] += anInt9696;
	    }
	} else if (i == 5) {
	    for (int i_247_ = 0; i_247_ < ((Class157_Sub3) this).anInt9651;
		 i_247_++) {
		int i_248_
		    = ((((Class157_Sub3) this).aByteArray9654[i_247_] & 0xff)
		       + i_230_ * 8);
		if (i_248_ < 0)
		    i_248_ = 0;
		else if (i_248_ > 255)
		    i_248_ = 255;
		((Class157_Sub3) this).aByteArray9654[i_247_] = (byte) i_248_;
	    }
	    if (((Class157_Sub3) this).aClass122_9662 != null)
		((Class122) ((Class157_Sub3) this).aClass122_9662)
		    .anInterface14_1542
		    = null;
	    if (((Class157_Sub3) this).aClass145Array9684 != null) {
		for (int i_249_ = 0; i_249_ < ((Class157_Sub3) this).anInt9685;
		     i_249_++) {
		    Class145 class145
			= ((Class157_Sub3) this).aClass145Array9684[i_249_];
		    Class113 class113
			= ((Class157_Sub3) this).aClass113Array9687[i_249_];
		    ((Class113) class113).anInt1406
			= (((Class113) class113).anInt1406 & 0xffffff
			   | 255 - ((((Class157_Sub3) this).aByteArray9654
				     [((Class145) class145).anInt1655])
				    & 0xff) << 24);
		}
	    }
	} else if (i == 7) {
	    for (int i_250_ = 0; i_250_ < ((Class157_Sub3) this).anInt9651;
		 i_250_++) {
		int i_251_
		    = ((Class157_Sub3) this).aShortArray9653[i_250_] & 0xffff;
		int i_252_ = i_251_ >> 10 & 0x3f;
		int i_253_ = i_251_ >> 7 & 0x7;
		int i_254_ = i_251_ & 0x7f;
		i_252_ = i_252_ + i_230_ & 0x3f;
		i_253_ += i_231_ / 4;
		if (i_253_ < 0)
		    i_253_ = 0;
		else if (i_253_ > 7)
		    i_253_ = 7;
		i_254_ += i_232_;
		if (i_254_ < 0)
		    i_254_ = 0;
		else if (i_254_ > 127)
		    i_254_ = 127;
		((Class157_Sub3) this).aShortArray9653[i_250_]
		    = (short) (i_252_ << 10 | i_253_ << 7 | i_254_);
	    }
	    if (((Class157_Sub3) this).aClass122_9662 != null)
		((Class122) ((Class157_Sub3) this).aClass122_9662)
		    .anInterface14_1542
		    = null;
	    if (((Class157_Sub3) this).aClass145Array9684 != null) {
		for (int i_255_ = 0; i_255_ < ((Class157_Sub3) this).anInt9685;
		     i_255_++) {
		    Class145 class145
			= ((Class157_Sub3) this).aClass145Array9684[i_255_];
		    Class113 class113
			= ((Class157_Sub3) this).aClass113Array9687[i_255_];
		    ((Class113) class113).anInt1406
			= (((Class113) class113).anInt1406 & ~0xffffff
			   | ((Class649.anIntArray8420
			       [(((Class157_Sub3) this).aShortArray9653
				 [((Class145) class145).anInt1655]) & 0xffff])
			      & 0xffffff));
		}
	    }
	} else if (i == 8) {
	    for (int i_256_ = 0; i_256_ < ((Class157_Sub3) this).anInt9685;
		 i_256_++) {
		Class113 class113
		    = ((Class157_Sub3) this).aClass113Array9687[i_256_];
		((Class113) class113).anInt1402 += i_230_;
		((Class113) class113).anInt1405 += i_231_;
	    }
	} else if (i == 10) {
	    for (int i_257_ = 0; i_257_ < ((Class157_Sub3) this).anInt9685;
		 i_257_++) {
		Class113 class113
		    = ((Class157_Sub3) this).aClass113Array9687[i_257_];
		((Class113) class113).anInt1403
		    = ((Class113) class113).anInt1403 * i_230_ >> 7;
		((Class113) class113).anInt1404
		    = ((Class113) class113).anInt1404 * i_231_ >> 7;
	    }
	} else if (i == 9) {
	    for (int i_258_ = 0; i_258_ < ((Class157_Sub3) this).anInt9685;
		 i_258_++) {
		Class113 class113
		    = ((Class157_Sub3) this).aClass113Array9687[i_258_];
		((Class113) class113).anInt1407
		    = ((Class113) class113).anInt1407 + i_230_ & 0x3fff;
	    }
	}
    }
    
    void method1892(int i, int[] is, int i_259_, int i_260_, int i_261_,
		    int i_262_, boolean bool) {
	int i_263_ = is.length;
	if (i == 0) {
	    i_259_ <<= 4;
	    i_260_ <<= 4;
	    i_261_ <<= 4;
	    int i_264_ = 0;
	    anInt9694 = 0;
	    anInt9695 = 0;
	    anInt9696 = 0;
	    for (int i_265_ = 0; i_265_ < i_263_; i_265_++) {
		int i_266_ = is[i_265_];
		if (i_266_
		    < ((Class157_Sub3) this).anIntArrayArray9641.length) {
		    int[] is_267_
			= ((Class157_Sub3) this).anIntArrayArray9641[i_266_];
		    for (int i_268_ = 0; i_268_ < is_267_.length; i_268_++) {
			int i_269_ = is_267_[i_268_];
			anInt9694
			    += ((Class157_Sub3) this).anIntArray9679[i_269_];
			anInt9695
			    += ((Class157_Sub3) this).anIntArray9639[i_269_];
			anInt9696
			    += ((Class157_Sub3) this).anIntArray9648[i_269_];
			i_264_++;
		    }
		}
	    }
	    if (i_264_ > 0) {
		anInt9694 = anInt9694 / i_264_ + i_259_;
		anInt9695 = anInt9695 / i_264_ + i_260_;
		anInt9696 = anInt9696 / i_264_ + i_261_;
	    } else {
		anInt9694 = i_259_;
		anInt9695 = i_260_;
		anInt9696 = i_261_;
	    }
	} else if (i == 1) {
	    i_259_ <<= 4;
	    i_260_ <<= 4;
	    i_261_ <<= 4;
	    for (int i_270_ = 0; i_270_ < i_263_; i_270_++) {
		int i_271_ = is[i_270_];
		if (i_271_
		    < ((Class157_Sub3) this).anIntArrayArray9641.length) {
		    int[] is_272_
			= ((Class157_Sub3) this).anIntArrayArray9641[i_271_];
		    for (int i_273_ = 0; i_273_ < is_272_.length; i_273_++) {
			int i_274_ = is_272_[i_273_];
			((Class157_Sub3) this).anIntArray9679[i_274_]
			    += i_259_;
			((Class157_Sub3) this).anIntArray9639[i_274_]
			    += i_260_;
			((Class157_Sub3) this).anIntArray9648[i_274_]
			    += i_261_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_275_ = 0; i_275_ < i_263_; i_275_++) {
		int i_276_ = is[i_275_];
		if (i_276_
		    < ((Class157_Sub3) this).anIntArrayArray9641.length) {
		    int[] is_277_
			= ((Class157_Sub3) this).anIntArrayArray9641[i_276_];
		    if ((i_262_ & 0x1) == 0) {
			for (int i_278_ = 0; i_278_ < is_277_.length;
			     i_278_++) {
			    int i_279_ = is_277_[i_278_];
			    ((Class157_Sub3) this).anIntArray9679[i_279_]
				-= anInt9694;
			    ((Class157_Sub3) this).anIntArray9639[i_279_]
				-= anInt9695;
			    ((Class157_Sub3) this).anIntArray9648[i_279_]
				-= anInt9696;
			    if (i_261_ != 0) {
				int i_280_ = Class417.anIntArray4766[i_261_];
				int i_281_ = Class417.anIntArray4767[i_261_];
				int i_282_
				    = (((((Class157_Sub3) this).anIntArray9639
					 [i_279_]) * i_280_
					+ (((Class157_Sub3) this)
					   .anIntArray9679[i_279_]) * i_281_
					+ 16383)
				       >> 14);
				((Class157_Sub3) this).anIntArray9639[i_279_]
				    = ((((Class157_Sub3) this).anIntArray9639
					[i_279_]) * i_281_
				       - (((Class157_Sub3) this).anIntArray9679
					  [i_279_]) * i_280_
				       + 16383) >> 14;
				((Class157_Sub3) this).anIntArray9679[i_279_]
				    = i_282_;
			    }
			    if (i_259_ != 0) {
				int i_283_ = Class417.anIntArray4766[i_259_];
				int i_284_ = Class417.anIntArray4767[i_259_];
				int i_285_
				    = (((((Class157_Sub3) this).anIntArray9639
					 [i_279_]) * i_284_
					- (((Class157_Sub3) this)
					   .anIntArray9648[i_279_]) * i_283_
					+ 16383)
				       >> 14);
				((Class157_Sub3) this).anIntArray9648[i_279_]
				    = ((((Class157_Sub3) this).anIntArray9639
					[i_279_]) * i_283_
				       + (((Class157_Sub3) this).anIntArray9648
					  [i_279_]) * i_284_
				       + 16383) >> 14;
				((Class157_Sub3) this).anIntArray9639[i_279_]
				    = i_285_;
			    }
			    if (i_260_ != 0) {
				int i_286_ = Class417.anIntArray4766[i_260_];
				int i_287_ = Class417.anIntArray4767[i_260_];
				int i_288_
				    = (((((Class157_Sub3) this).anIntArray9648
					 [i_279_]) * i_286_
					+ (((Class157_Sub3) this)
					   .anIntArray9679[i_279_]) * i_287_
					+ 16383)
				       >> 14);
				((Class157_Sub3) this).anIntArray9648[i_279_]
				    = ((((Class157_Sub3) this).anIntArray9648
					[i_279_]) * i_287_
				       - (((Class157_Sub3) this).anIntArray9679
					  [i_279_]) * i_286_
				       + 16383) >> 14;
				((Class157_Sub3) this).anIntArray9679[i_279_]
				    = i_288_;
			    }
			    ((Class157_Sub3) this).anIntArray9679[i_279_]
				+= anInt9694;
			    ((Class157_Sub3) this).anIntArray9639[i_279_]
				+= anInt9695;
			    ((Class157_Sub3) this).anIntArray9648[i_279_]
				+= anInt9696;
			}
		    } else {
			for (int i_289_ = 0; i_289_ < is_277_.length;
			     i_289_++) {
			    int i_290_ = is_277_[i_289_];
			    ((Class157_Sub3) this).anIntArray9679[i_290_]
				-= anInt9694;
			    ((Class157_Sub3) this).anIntArray9639[i_290_]
				-= anInt9695;
			    ((Class157_Sub3) this).anIntArray9648[i_290_]
				-= anInt9696;
			    if (i_259_ != 0) {
				int i_291_ = Class417.anIntArray4766[i_259_];
				int i_292_ = Class417.anIntArray4767[i_259_];
				int i_293_
				    = (((((Class157_Sub3) this).anIntArray9639
					 [i_290_]) * i_292_
					- (((Class157_Sub3) this)
					   .anIntArray9648[i_290_]) * i_291_
					+ 16383)
				       >> 14);
				((Class157_Sub3) this).anIntArray9648[i_290_]
				    = ((((Class157_Sub3) this).anIntArray9639
					[i_290_]) * i_291_
				       + (((Class157_Sub3) this).anIntArray9648
					  [i_290_]) * i_292_
				       + 16383) >> 14;
				((Class157_Sub3) this).anIntArray9639[i_290_]
				    = i_293_;
			    }
			    if (i_261_ != 0) {
				int i_294_ = Class417.anIntArray4766[i_261_];
				int i_295_ = Class417.anIntArray4767[i_261_];
				int i_296_
				    = (((((Class157_Sub3) this).anIntArray9639
					 [i_290_]) * i_294_
					+ (((Class157_Sub3) this)
					   .anIntArray9679[i_290_]) * i_295_
					+ 16383)
				       >> 14);
				((Class157_Sub3) this).anIntArray9639[i_290_]
				    = ((((Class157_Sub3) this).anIntArray9639
					[i_290_]) * i_295_
				       - (((Class157_Sub3) this).anIntArray9679
					  [i_290_]) * i_294_
				       + 16383) >> 14;
				((Class157_Sub3) this).anIntArray9679[i_290_]
				    = i_296_;
			    }
			    if (i_260_ != 0) {
				int i_297_ = Class417.anIntArray4766[i_260_];
				int i_298_ = Class417.anIntArray4767[i_260_];
				int i_299_
				    = (((((Class157_Sub3) this).anIntArray9648
					 [i_290_]) * i_297_
					+ (((Class157_Sub3) this)
					   .anIntArray9679[i_290_]) * i_298_
					+ 16383)
				       >> 14);
				((Class157_Sub3) this).anIntArray9648[i_290_]
				    = ((((Class157_Sub3) this).anIntArray9648
					[i_290_]) * i_298_
				       - (((Class157_Sub3) this).anIntArray9679
					  [i_290_]) * i_297_
				       + 16383) >> 14;
				((Class157_Sub3) this).anIntArray9679[i_290_]
				    = i_299_;
			    }
			    ((Class157_Sub3) this).anIntArray9679[i_290_]
				+= anInt9694;
			    ((Class157_Sub3) this).anIntArray9639[i_290_]
				+= anInt9695;
			    ((Class157_Sub3) this).anIntArray9648[i_290_]
				+= anInt9696;
			}
		    }
		}
	    }
	    if (bool) {
		for (int i_300_ = 0; i_300_ < i_263_; i_300_++) {
		    int i_301_ = is[i_300_];
		    if (i_301_
			< ((Class157_Sub3) this).anIntArrayArray9641.length) {
			int[] is_302_ = (((Class157_Sub3) this)
					 .anIntArrayArray9641[i_301_]);
			for (int i_303_ = 0; i_303_ < is_302_.length;
			     i_303_++) {
			    int i_304_ = is_302_[i_303_];
			    int i_305_ = (((Class157_Sub3) this).anIntArray9660
					  [i_304_]);
			    int i_306_ = (((Class157_Sub3) this).anIntArray9660
					  [i_304_ + 1]);
			    for (int i_307_ = i_305_;
				 (i_307_ < i_306_
				  && (((Class157_Sub3) this).aShortArray9682
				      [i_307_]) != 0);
				 i_307_++) {
				int i_308_ = (((((Class157_Sub3) this)
						.aShortArray9682[i_307_])
					       & 0xffff)
					      - 1);
				if (i_261_ != 0) {
				    int i_309_
					= Class417.anIntArray4766[i_261_];
				    int i_310_
					= Class417.anIntArray4767[i_261_];
				    int i_311_
					= (((((Class157_Sub3) this)
					     .aShortArray9645[i_308_]) * i_309_
					    + ((((Class157_Sub3) this)
						.aShortArray9673[i_308_])
					       * i_310_)
					    + 16383)
					   >> 14);
				    ((Class157_Sub3) this).aShortArray9645
					[i_308_]
					= (short) ((((((Class157_Sub3) this)
						      .aShortArray9645[i_308_])
						     * i_310_)
						    - (((Class157_Sub3) this)
						       .aShortArray9673
						       [i_308_]) * i_309_
						    + 16383)
						   >> 14);
				    ((Class157_Sub3) this).aShortArray9673
					[i_308_]
					= (short) i_311_;
				}
				if (i_259_ != 0) {
				    int i_312_
					= Class417.anIntArray4766[i_259_];
				    int i_313_
					= Class417.anIntArray4767[i_259_];
				    int i_314_
					= (((((Class157_Sub3) this)
					     .aShortArray9645[i_308_]) * i_313_
					    - ((((Class157_Sub3) this)
						.aShortArray9646[i_308_])
					       * i_312_)
					    + 16383)
					   >> 14);
				    ((Class157_Sub3) this).aShortArray9646
					[i_308_]
					= (short) ((((((Class157_Sub3) this)
						      .aShortArray9645[i_308_])
						     * i_312_)
						    + (((Class157_Sub3) this)
						       .aShortArray9646
						       [i_308_]) * i_313_
						    + 16383)
						   >> 14);
				    ((Class157_Sub3) this).aShortArray9645
					[i_308_]
					= (short) i_314_;
				}
				if (i_260_ != 0) {
				    int i_315_
					= Class417.anIntArray4766[i_260_];
				    int i_316_
					= Class417.anIntArray4767[i_260_];
				    int i_317_
					= (((((Class157_Sub3) this)
					     .aShortArray9646[i_308_]) * i_315_
					    + ((((Class157_Sub3) this)
						.aShortArray9673[i_308_])
					       * i_316_)
					    + 16383)
					   >> 14);
				    ((Class157_Sub3) this).aShortArray9646
					[i_308_]
					= (short) ((((((Class157_Sub3) this)
						      .aShortArray9646[i_308_])
						     * i_316_)
						    - (((Class157_Sub3) this)
						       .aShortArray9673
						       [i_308_]) * i_315_
						    + 16383)
						   >> 14);
				    ((Class157_Sub3) this).aShortArray9673
					[i_308_]
					= (short) i_317_;
				}
			    }
			}
		    }
		}
		if (((Class157_Sub3) this).aClass122_9663 == null
		    && ((Class157_Sub3) this).aClass122_9662 != null)
		    ((Class122) ((Class157_Sub3) this).aClass122_9662)
			.anInterface14_1542
			= null;
		if (((Class157_Sub3) this).aClass122_9663 != null)
		    ((Class122) ((Class157_Sub3) this).aClass122_9663)
			.anInterface14_1542
			= null;
	    }
	} else if (i == 3) {
	    for (int i_318_ = 0; i_318_ < i_263_; i_318_++) {
		int i_319_ = is[i_318_];
		if (i_319_
		    < ((Class157_Sub3) this).anIntArrayArray9641.length) {
		    int[] is_320_
			= ((Class157_Sub3) this).anIntArrayArray9641[i_319_];
		    for (int i_321_ = 0; i_321_ < is_320_.length; i_321_++) {
			int i_322_ = is_320_[i_321_];
			((Class157_Sub3) this).anIntArray9679[i_322_]
			    -= anInt9694;
			((Class157_Sub3) this).anIntArray9639[i_322_]
			    -= anInt9695;
			((Class157_Sub3) this).anIntArray9648[i_322_]
			    -= anInt9696;
			((Class157_Sub3) this).anIntArray9679[i_322_]
			    = (((Class157_Sub3) this).anIntArray9679[i_322_]
			       * i_259_) >> 7;
			((Class157_Sub3) this).anIntArray9639[i_322_]
			    = (((Class157_Sub3) this).anIntArray9639[i_322_]
			       * i_260_) >> 7;
			((Class157_Sub3) this).anIntArray9648[i_322_]
			    = (((Class157_Sub3) this).anIntArray9648[i_322_]
			       * i_261_) >> 7;
			((Class157_Sub3) this).anIntArray9679[i_322_]
			    += anInt9694;
			((Class157_Sub3) this).anIntArray9639[i_322_]
			    += anInt9695;
			((Class157_Sub3) this).anIntArray9648[i_322_]
			    += anInt9696;
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class157_Sub3) this).anIntArrayArray9659 != null) {
		for (int i_323_ = 0; i_323_ < i_263_; i_323_++) {
		    int i_324_ = is[i_323_];
		    if (i_324_
			< ((Class157_Sub3) this).anIntArrayArray9659.length) {
			int[] is_325_ = (((Class157_Sub3) this)
					 .anIntArrayArray9659[i_324_]);
			for (int i_326_ = 0; i_326_ < is_325_.length;
			     i_326_++) {
			    int i_327_ = is_325_[i_326_];
			    int i_328_ = (((((Class157_Sub3) this)
					    .aByteArray9654[i_327_])
					   & 0xff)
					  + i_259_ * 8);
			    if (i_328_ < 0)
				i_328_ = 0;
			    else if (i_328_ > 255)
				i_328_ = 255;
			    ((Class157_Sub3) this).aByteArray9654[i_327_]
				= (byte) i_328_;
			}
			if (is_325_.length > 0
			    && ((Class157_Sub3) this).aClass122_9662 != null)
			    ((Class122) ((Class157_Sub3) this).aClass122_9662)
				.anInterface14_1542
				= null;
		    }
		}
		if (((Class157_Sub3) this).aClass145Array9684 != null) {
		    for (int i_329_ = 0;
			 i_329_ < ((Class157_Sub3) this).anInt9685; i_329_++) {
			Class145 class145 = (((Class157_Sub3) this)
					     .aClass145Array9684[i_329_]);
			Class113 class113 = (((Class157_Sub3) this)
					     .aClass113Array9687[i_329_]);
			((Class113) class113).anInt1406
			    = (((Class113) class113).anInt1406 & 0xffffff
			       | 255 - ((((Class157_Sub3) this).aByteArray9654
					 [((Class145) class145).anInt1655])
					& 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (((Class157_Sub3) this).anIntArrayArray9659 != null) {
		for (int i_330_ = 0; i_330_ < i_263_; i_330_++) {
		    int i_331_ = is[i_330_];
		    if (i_331_
			< ((Class157_Sub3) this).anIntArrayArray9659.length) {
			int[] is_332_ = (((Class157_Sub3) this)
					 .anIntArrayArray9659[i_331_]);
			for (int i_333_ = 0; i_333_ < is_332_.length;
			     i_333_++) {
			    int i_334_ = is_332_[i_333_];
			    int i_335_ = ((((Class157_Sub3) this)
					   .aShortArray9653[i_334_])
					  & 0xffff);
			    int i_336_ = i_335_ >> 10 & 0x3f;
			    int i_337_ = i_335_ >> 7 & 0x7;
			    int i_338_ = i_335_ & 0x7f;
			    i_336_ = i_336_ + i_259_ & 0x3f;
			    i_337_ += i_260_ / 4;
			    if (i_337_ < 0)
				i_337_ = 0;
			    else if (i_337_ > 7)
				i_337_ = 7;
			    i_338_ += i_261_;
			    if (i_338_ < 0)
				i_338_ = 0;
			    else if (i_338_ > 127)
				i_338_ = 127;
			    ((Class157_Sub3) this).aShortArray9653[i_334_]
				= (short) (i_336_ << 10 | i_337_ << 7
					   | i_338_);
			}
			if (is_332_.length > 0
			    && ((Class157_Sub3) this).aClass122_9662 != null)
			    ((Class122) ((Class157_Sub3) this).aClass122_9662)
				.anInterface14_1542
				= null;
		    }
		}
		if (((Class157_Sub3) this).aClass145Array9684 != null) {
		    for (int i_339_ = 0;
			 i_339_ < ((Class157_Sub3) this).anInt9685; i_339_++) {
			Class145 class145 = (((Class157_Sub3) this)
					     .aClass145Array9684[i_339_]);
			Class113 class113 = (((Class157_Sub3) this)
					     .aClass113Array9687[i_339_]);
			((Class113) class113).anInt1406
			    = (((Class113) class113).anInt1406 & ~0xffffff
			       | (Class649.anIntArray8420
				  [((((Class157_Sub3) this).aShortArray9653
				     [((Class145) class145).anInt1655])
				    & 0xffff)]) & 0xffffff);
		    }
		}
	    }
	} else if (i == 8) {
	    if (((Class157_Sub3) this).anIntArrayArray9691 != null) {
		for (int i_340_ = 0; i_340_ < i_263_; i_340_++) {
		    int i_341_ = is[i_340_];
		    if (i_341_
			< ((Class157_Sub3) this).anIntArrayArray9691.length) {
			int[] is_342_ = (((Class157_Sub3) this)
					 .anIntArrayArray9691[i_341_]);
			for (int i_343_ = 0; i_343_ < is_342_.length;
			     i_343_++) {
			    Class113 class113
				= (((Class157_Sub3) this).aClass113Array9687
				   [is_342_[i_343_]]);
			    ((Class113) class113).anInt1402 += i_259_;
			    ((Class113) class113).anInt1405 += i_260_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class157_Sub3) this).anIntArrayArray9691 != null) {
		for (int i_344_ = 0; i_344_ < i_263_; i_344_++) {
		    int i_345_ = is[i_344_];
		    if (i_345_
			< ((Class157_Sub3) this).anIntArrayArray9691.length) {
			int[] is_346_ = (((Class157_Sub3) this)
					 .anIntArrayArray9691[i_345_]);
			for (int i_347_ = 0; i_347_ < is_346_.length;
			     i_347_++) {
			    Class113 class113
				= (((Class157_Sub3) this).aClass113Array9687
				   [is_346_[i_347_]]);
			    ((Class113) class113).anInt1403
				= (((Class113) class113).anInt1403 * i_259_
				   >> 7);
			    ((Class113) class113).anInt1404
				= (((Class113) class113).anInt1404 * i_260_
				   >> 7);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class157_Sub3) this).anIntArrayArray9691 != null) {
		for (int i_348_ = 0; i_348_ < i_263_; i_348_++) {
		    int i_349_ = is[i_348_];
		    if (i_349_
			< ((Class157_Sub3) this).anIntArrayArray9691.length) {
			int[] is_350_ = (((Class157_Sub3) this)
					 .anIntArrayArray9691[i_349_]);
			for (int i_351_ = 0; i_351_ < is_350_.length;
			     i_351_++) {
			    Class113 class113
				= (((Class157_Sub3) this).aClass113Array9687
				   [is_350_[i_351_]]);
			    ((Class113) class113).anInt1407
				= (((Class113) class113).anInt1407 + i_259_
				   & 0x3fff);
			}
		    }
		}
	    }
	}
    }
    
    public void method2006(int i, int i_352_, int i_353_, int i_354_) {
	for (int i_355_ = 0; i_355_ < ((Class157_Sub3) this).anInt9651;
	     i_355_++) {
	    int i_356_
		= ((Class157_Sub3) this).aShortArray9653[i_355_] & 0xffff;
	    int i_357_ = i_356_ >> 10 & 0x3f;
	    int i_358_ = i_356_ >> 7 & 0x7;
	    int i_359_ = i_356_ & 0x7f;
	    if (i != -1)
		i_357_ += (i - i_357_) * i_354_ >> 7;
	    if (i_352_ != -1)
		i_358_ += (i_352_ - i_358_) * i_354_ >> 7;
	    if (i_353_ != -1)
		i_359_ += (i_353_ - i_359_) * i_354_ >> 7;
	    ((Class157_Sub3) this).aShortArray9653[i_355_]
		= (short) (i_357_ << 10 | i_358_ << 7 | i_359_);
	}
	if (((Class157_Sub3) this).aClass145Array9684 != null) {
	    for (int i_360_ = 0; i_360_ < ((Class157_Sub3) this).anInt9685;
		 i_360_++) {
		Class145 class145
		    = ((Class157_Sub3) this).aClass145Array9684[i_360_];
		Class113 class113
		    = ((Class157_Sub3) this).aClass113Array9687[i_360_];
		((Class113) class113).anInt1406
		    = (((Class113) class113).anInt1406 & ~0xffffff
		       | ((Class649.anIntArray8420
			   [(((Class157_Sub3) this).aShortArray9653
			     [((Class145) class145).anInt1655]) & 0xffff])
			  & 0xffffff));
	    }
	}
	if (((Class157_Sub3) this).aClass122_9662 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9662)
		.anInterface14_1542
		= null;
    }
    
    public int method1901() {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	return ((Class157_Sub3) this).anInt9666;
    }
    
    void method1885() {
	/* empty */
    }
    
    public int method1882() {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	return ((Class157_Sub3) this).aShort9688;
    }
    
    public int method2018() {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	return ((Class157_Sub3) this).aShort9670;
    }
    
    public int method1905() {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	return ((Class157_Sub3) this).aShort9693;
    }
    
    public int method1900() {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	return ((Class157_Sub3) this).aShort9676;
    }
    
    public void method2035(int i) {
	((Class157_Sub3) this).anInt9629 = i;
	if (((Class157_Sub3) this).aClass143_9671 != null
	    && (((Class157_Sub3) this).anInt9629 & 0x10000) == 0) {
	    ((Class157_Sub3) this).aShortArray9673
		= (((Class143) ((Class157_Sub3) this).aClass143_9671)
		   .aShortArray1644);
	    ((Class157_Sub3) this).aShortArray9645
		= (((Class143) ((Class157_Sub3) this).aClass143_9671)
		   .aShortArray1642);
	    ((Class157_Sub3) this).aShortArray9646
		= (((Class143) ((Class157_Sub3) this).aClass143_9671)
		   .aShortArray1643);
	    ((Class157_Sub3) this).aByteArray9647
		= (((Class143) ((Class157_Sub3) this).aClass143_9671)
		   .aByteArray1641);
	    ((Class157_Sub3) this).aClass143_9671 = null;
	}
	((Class157_Sub3) this).aBool9668 = true;
	method8886();
    }
    
    void method8886() {
	if (((Class157_Sub3) this).aBool9668) {
	    ((Class157_Sub3) this).aBool9668 = false;
	    if (((Class157_Sub3) this).aClass170Array9683 == null
		&& ((Class157_Sub3) this).aClass144Array9664 == null
		&& ((Class157_Sub3) this).aClass145Array9684 == null
		&& !Class117.method1446(((Class157_Sub3) this).anInt9629,
					((Class157_Sub3) this).anInt9640)) {
		boolean bool = false;
		boolean bool_361_ = false;
		boolean bool_362_ = false;
		if (((Class157_Sub3) this).anIntArray9679 != null
		    && !Class117.method1464(((Class157_Sub3) this).anInt9629,
					    (((Class157_Sub3) this)
					     .anInt9640))) {
		    if (((Class157_Sub3) this).aClass122_9661 == null
			|| (((Class122) ((Class157_Sub3) this).aClass122_9661)
			    .anInterface14_1542) != null) {
			if (!((Class157_Sub3) this).aBool9649)
			    method8893();
			bool = true;
		    } else
			((Class157_Sub3) this).aBool9668 = true;
		}
		if (((Class157_Sub3) this).anIntArray9639 != null
		    && !Class117.method1466(((Class157_Sub3) this).anInt9629,
					    (((Class157_Sub3) this)
					     .anInt9640))) {
		    if (((Class157_Sub3) this).aClass122_9661 == null
			|| (((Class122) ((Class157_Sub3) this).aClass122_9661)
			    .anInterface14_1542) != null) {
			if (!((Class157_Sub3) this).aBool9649)
			    method8893();
			bool_361_ = true;
		    } else
			((Class157_Sub3) this).aBool9668 = true;
		}
		if (((Class157_Sub3) this).anIntArray9648 != null
		    && !Class117.method1467(((Class157_Sub3) this).anInt9629,
					    (((Class157_Sub3) this)
					     .anInt9640))) {
		    if (((Class157_Sub3) this).aClass122_9661 == null
			|| (((Class122) ((Class157_Sub3) this).aClass122_9661)
			    .anInterface14_1542) != null) {
			if (!((Class157_Sub3) this).aBool9649)
			    method8893();
			bool_362_ = true;
		    } else
			((Class157_Sub3) this).aBool9668 = true;
		}
		if (bool)
		    ((Class157_Sub3) this).anIntArray9679 = null;
		if (bool_361_)
		    ((Class157_Sub3) this).anIntArray9639 = null;
		if (bool_362_)
		    ((Class157_Sub3) this).anIntArray9648 = null;
	    }
	    if (((Class157_Sub3) this).aShortArray9682 != null
		&& ((Class157_Sub3) this).anIntArray9679 == null
		&& ((Class157_Sub3) this).anIntArray9639 == null
		&& ((Class157_Sub3) this).anIntArray9648 == null) {
		((Class157_Sub3) this).aShortArray9682 = null;
		((Class157_Sub3) this).anIntArray9660 = null;
	    }
	    if (((Class157_Sub3) this).aByteArray9647 != null
		&& !Class117.method1468(((Class157_Sub3) this).anInt9629,
					((Class157_Sub3) this).anInt9640)) {
		if (((Class157_Sub3) this).aClass122_9663 != null) {
		    if ((((Class122) ((Class157_Sub3) this).aClass122_9663)
			 .anInterface14_1542)
			!= null) {
			((Class157_Sub3) this).aShortArray9646 = null;
			((Class157_Sub3) this).aShortArray9645 = null;
			((Class157_Sub3) this).aShortArray9673 = null;
			((Class157_Sub3) this).aByteArray9647 = null;
		    } else
			((Class157_Sub3) this).aBool9668 = true;
		} else if (((Class157_Sub3) this).aClass122_9662 == null
			   || (((Class122)
				((Class157_Sub3) this).aClass122_9662)
			       .anInterface14_1542) != null) {
		    ((Class157_Sub3) this).aShortArray9646 = null;
		    ((Class157_Sub3) this).aShortArray9645 = null;
		    ((Class157_Sub3) this).aShortArray9673 = null;
		    ((Class157_Sub3) this).aByteArray9647 = null;
		} else
		    ((Class157_Sub3) this).aBool9668 = true;
	    }
	    if (((Class157_Sub3) this).aShortArray9653 != null
		&& !Class117.method1469(((Class157_Sub3) this).anInt9629,
					((Class157_Sub3) this).anInt9640)) {
		if (((Class157_Sub3) this).aClass122_9662 == null
		    || (((Class122) ((Class157_Sub3) this).aClass122_9662)
			.anInterface14_1542) != null)
		    ((Class157_Sub3) this).aShortArray9653 = null;
		else
		    ((Class157_Sub3) this).aBool9668 = true;
	    }
	    if (((Class157_Sub3) this).aByteArray9654 != null
		&& !Class117.method1470(((Class157_Sub3) this).anInt9629,
					((Class157_Sub3) this).anInt9640)) {
		if (((Class157_Sub3) this).aClass122_9662 == null
		    || (((Class122) ((Class157_Sub3) this).aClass122_9662)
			.anInterface14_1542) != null)
		    ((Class157_Sub3) this).aByteArray9654 = null;
		else
		    ((Class157_Sub3) this).aBool9668 = true;
	    }
	    if (((Class157_Sub3) this).aFloatArray9631 != null
		&& !Class117.method1505(((Class157_Sub3) this).anInt9629,
					((Class157_Sub3) this).anInt9640)) {
		if (((Class157_Sub3) this).aClass122_9686 == null
		    || (((Class122) ((Class157_Sub3) this).aClass122_9686)
			.anInterface14_1542) != null) {
		    ((Class157_Sub3) this).aFloatArray9650 = null;
		    ((Class157_Sub3) this).aFloatArray9631 = null;
		} else
		    ((Class157_Sub3) this).aBool9668 = true;
	    }
	    if (((Class157_Sub3) this).aShortArray9658 != null
		&& !Class117.method1476(((Class157_Sub3) this).anInt9629,
					((Class157_Sub3) this).anInt9640)) {
		if (((Class157_Sub3) this).aClass122_9662 == null
		    || (((Class122) ((Class157_Sub3) this).aClass122_9662)
			.anInterface14_1542) != null)
		    ((Class157_Sub3) this).aShortArray9658 = null;
		else
		    ((Class157_Sub3) this).aBool9668 = true;
	    }
	    if (((Class157_Sub3) this).aShortArray9655 != null
		&& !Class117.method1482(((Class157_Sub3) this).anInt9629,
					((Class157_Sub3) this).anInt9640)) {
		if ((((Class157_Sub3) this).aClass129_9665 == null
		     || (((Class129) ((Class157_Sub3) this).aClass129_9665)
			 .anInterface16_1588) != null)
		    && (((Class157_Sub3) this).aClass122_9662 == null
			|| (((Class122) ((Class157_Sub3) this).aClass122_9662)
			    .anInterface14_1542) != null)) {
		    ((Class157_Sub3) this).aShortArray9657 = null;
		    ((Class157_Sub3) this).aShortArray9638 = null;
		    ((Class157_Sub3) this).aShortArray9655 = null;
		} else
		    ((Class157_Sub3) this).aBool9668 = true;
	    }
	    if (((Class157_Sub3) this).anIntArrayArray9659 != null
		&& !Class117.method1472(((Class157_Sub3) this).anInt9629,
					((Class157_Sub3) this).anInt9640)) {
		((Class157_Sub3) this).anIntArrayArray9659 = null;
		((Class157_Sub3) this).aShortArray9677 = null;
	    }
	    if (((Class157_Sub3) this).anIntArrayArray9641 != null
		&& !Class117.method1473(((Class157_Sub3) this).anInt9629,
					((Class157_Sub3) this).anInt9640)) {
		((Class157_Sub3) this).anIntArrayArray9641 = null;
		((Class157_Sub3) this).aShortArray9642 = null;
	    }
	    if (((Class157_Sub3) this).anIntArrayArray9691 != null
		&& !Class117.method1458(((Class157_Sub3) this).anInt9629,
					((Class157_Sub3) this).anInt9640))
		((Class157_Sub3) this).anIntArrayArray9691 = null;
	    if (((Class157_Sub3) this).anIntArray9680 != null
		&& (((Class157_Sub3) this).anInt9629 & 0x800) == 0
		&& (((Class157_Sub3) this).anInt9629 & 0x40000) == 0)
		((Class157_Sub3) this).anIntArray9680 = null;
	}
    }
    
    public void method1872(Class157 class157, int i, int i_363_, int i_364_,
			   boolean bool) {
	Class157_Sub3 class157_sub3_365_ = (Class157_Sub3) class157;
	if (((Class157_Sub3) this).anInt9651 != 0
	    && ((Class157_Sub3) class157_sub3_365_).anInt9651 != 0) {
	    int i_366_ = ((Class157_Sub3) class157_sub3_365_).anInt9637;
	    int[] is = ((Class157_Sub3) class157_sub3_365_).anIntArray9679;
	    int[] is_367_
		= ((Class157_Sub3) class157_sub3_365_).anIntArray9639;
	    int[] is_368_
		= ((Class157_Sub3) class157_sub3_365_).anIntArray9648;
	    short[] is_369_
		= ((Class157_Sub3) class157_sub3_365_).aShortArray9673;
	    short[] is_370_
		= ((Class157_Sub3) class157_sub3_365_).aShortArray9645;
	    short[] is_371_
		= ((Class157_Sub3) class157_sub3_365_).aShortArray9646;
	    byte[] is_372_
		= ((Class157_Sub3) class157_sub3_365_).aByteArray9647;
	    short[] is_373_;
	    short[] is_374_;
	    short[] is_375_;
	    byte[] is_376_;
	    if (((Class157_Sub3) this).aClass143_9671 != null) {
		is_373_ = (((Class143) ((Class157_Sub3) this).aClass143_9671)
			   .aShortArray1644);
		is_374_ = (((Class143) ((Class157_Sub3) this).aClass143_9671)
			   .aShortArray1642);
		is_375_ = (((Class143) ((Class157_Sub3) this).aClass143_9671)
			   .aShortArray1643);
		is_376_ = (((Class143) ((Class157_Sub3) this).aClass143_9671)
			   .aByteArray1641);
	    } else {
		is_373_ = null;
		is_374_ = null;
		is_375_ = null;
		is_376_ = null;
	    }
	    short[] is_377_;
	    short[] is_378_;
	    short[] is_379_;
	    byte[] is_380_;
	    if (((Class157_Sub3) class157_sub3_365_).aClass143_9671 != null) {
		is_377_ = ((Class143) (((Class157_Sub3) class157_sub3_365_)
				       .aClass143_9671)).aShortArray1644;
		is_378_ = ((Class143) (((Class157_Sub3) class157_sub3_365_)
				       .aClass143_9671)).aShortArray1642;
		is_379_ = ((Class143) (((Class157_Sub3) class157_sub3_365_)
				       .aClass143_9671)).aShortArray1643;
		is_380_ = ((Class143) (((Class157_Sub3) class157_sub3_365_)
				       .aClass143_9671)).aByteArray1641;
	    } else {
		is_377_ = null;
		is_378_ = null;
		is_379_ = null;
		is_380_ = null;
	    }
	    int[] is_381_
		= ((Class157_Sub3) class157_sub3_365_).anIntArray9660;
	    short[] is_382_
		= ((Class157_Sub3) class157_sub3_365_).aShortArray9682;
	    if (!((Class157_Sub3) class157_sub3_365_).aBool9649)
		class157_sub3_365_.method8893();
	    int i_383_ = ((Class157_Sub3) class157_sub3_365_).aShort9670;
	    int i_384_ = ((Class157_Sub3) class157_sub3_365_).aShort9693;
	    int i_385_ = ((Class157_Sub3) class157_sub3_365_).aShort9674;
	    int i_386_ = ((Class157_Sub3) class157_sub3_365_).aShort9688;
	    int i_387_ = ((Class157_Sub3) class157_sub3_365_).aShort9676;
	    int i_388_ = ((Class157_Sub3) class157_sub3_365_).aShort9644;
	    for (int i_389_ = 0; i_389_ < ((Class157_Sub3) this).anInt9637;
		 i_389_++) {
		int i_390_
		    = ((Class157_Sub3) this).anIntArray9639[i_389_] - i_363_;
		if (i_390_ >= i_383_ && i_390_ <= i_384_) {
		    int i_391_
			= ((Class157_Sub3) this).anIntArray9679[i_389_] - i;
		    if (i_391_ >= i_385_ && i_391_ <= i_386_) {
			int i_392_
			    = (((Class157_Sub3) this).anIntArray9648[i_389_]
			       - i_364_);
			if (i_392_ >= i_387_ && i_392_ <= i_388_) {
			    int i_393_ = -1;
			    int i_394_ = (((Class157_Sub3) this).anIntArray9660
					  [i_389_]);
			    int i_395_ = (((Class157_Sub3) this).anIntArray9660
					  [i_389_ + 1]);
			    for (int i_396_ = i_394_;
				 (i_396_ < i_395_
				  && (((Class157_Sub3) this).aShortArray9682
				      [i_396_]) != 0);
				 i_396_++) {
				i_393_ = ((((Class157_Sub3) this)
					   .aShortArray9682[i_396_])
					  & 0xffff) - 1;
				if ((((Class157_Sub3) this).aByteArray9647
				     [i_393_])
				    != 0)
				    break;
			    }
			    if (i_393_ != -1) {
				for (int i_397_ = 0; i_397_ < i_366_;
				     i_397_++) {
				    if (i_391_ == is[i_397_]
					&& i_392_ == is_368_[i_397_]
					&& i_390_ == is_367_[i_397_]) {
					int i_398_ = -1;
					i_394_ = is_381_[i_397_];
					i_395_ = is_381_[i_397_ + 1];
					for (int i_399_ = i_394_;
					     (i_399_ < i_395_
					      && is_382_[i_399_] != 0);
					     i_399_++) {
					    i_398_ = (is_382_[i_399_]
						      & 0xffff) - 1;
					    if (is_372_[i_398_] != 0)
						break;
					}
					if (i_398_ != -1) {
					    if (is_373_ == null) {
						((Class157_Sub3) this)
						    .aClass143_9671
						    = new Class143();
						is_373_
						    = ((Class143)
						       (((Class157_Sub3) this)
							.aClass143_9671))
							  .aShortArray1644
						    = (Class407.method4883
						       ((((Class157_Sub3) this)
							 .aShortArray9673),
							1071173469));
						is_374_
						    = ((Class143)
						       (((Class157_Sub3) this)
							.aClass143_9671))
							  .aShortArray1642
						    = (Class407.method4883
						       ((((Class157_Sub3) this)
							 .aShortArray9645),
							1071173469));
						is_375_
						    = ((Class143)
						       (((Class157_Sub3) this)
							.aClass143_9671))
							  .aShortArray1643
						    = (Class407.method4883
						       ((((Class157_Sub3) this)
							 .aShortArray9646),
							1071173469));
						is_376_
						    = ((Class143)
						       (((Class157_Sub3) this)
							.aClass143_9671))
							  .aByteArray1641
						    = (Class324.method4228
						       ((((Class157_Sub3) this)
							 .aByteArray9647),
							-192803816));
					    }
					    if (is_377_ == null) {
						Class143 class143
						    = (((Class157_Sub3)
							class157_sub3_365_)
							   .aClass143_9671
						       = new Class143());
						is_377_
						    = ((Class143) class143)
							  .aShortArray1644
						    = (Class407.method4883
						       (is_369_, 1071173469));
						is_378_
						    = ((Class143) class143)
							  .aShortArray1642
						    = (Class407.method4883
						       (is_370_, 1071173469));
						is_379_
						    = ((Class143) class143)
							  .aShortArray1643
						    = (Class407.method4883
						       (is_371_, 1071173469));
						is_380_
						    = ((Class143) class143)
							  .aByteArray1641
						    = (Class324.method4228
						       (is_372_, 1262298374));
					    }
					    short i_400_
						= (((Class157_Sub3) this)
						   .aShortArray9673[i_393_]);
					    short i_401_
						= (((Class157_Sub3) this)
						   .aShortArray9645[i_393_]);
					    short i_402_
						= (((Class157_Sub3) this)
						   .aShortArray9646[i_393_]);
					    byte i_403_
						= (((Class157_Sub3) this)
						   .aByteArray9647[i_393_]);
					    i_394_ = is_381_[i_397_];
					    i_395_ = is_381_[i_397_ + 1];
					    for (int i_404_ = i_394_;
						 i_404_ < i_395_; i_404_++) {
						int i_405_
						    = is_382_[i_404_] - 1;
						if (i_405_ == -1)
						    break;
						if (is_380_[i_405_] != 0) {
						    is_377_[i_405_] += i_400_;
						    is_378_[i_405_] += i_401_;
						    is_379_[i_405_] += i_402_;
						    is_380_[i_405_] += i_403_;
						}
					    }
					    i_400_ = is_369_[i_398_];
					    i_401_ = is_370_[i_398_];
					    i_402_ = is_371_[i_398_];
					    i_403_ = is_372_[i_398_];
					    i_394_ = (((Class157_Sub3) this)
						      .anIntArray9660[i_389_]);
					    i_395_ = (((Class157_Sub3) this)
						      .anIntArray9660
						      [i_389_ + 1]);
					    for (int i_406_ = i_394_;
						 (i_406_ < i_395_
						  && (((Class157_Sub3) this)
						      .aShortArray9682
						      [i_406_]) != 0);
						 i_406_++) {
						int i_407_
						    = (((((Class157_Sub3) this)
							 .aShortArray9682
							 [i_406_])
							& 0xffff)
						       - 1);
						if (is_376_[i_407_] != 0) {
						    is_373_[i_407_] += i_400_;
						    is_374_[i_407_] += i_401_;
						    is_375_[i_407_] += i_402_;
						    is_376_[i_407_] += i_403_;
						}
					    }
					    if ((((Class157_Sub3) this)
						 .aClass122_9663) == null
						&& (((Class157_Sub3) this)
						    .aClass122_9662) != null)
						((Class122)
						 (((Class157_Sub3) this)
						  .aClass122_9662))
						    .anInterface14_1542
						    = null;
					    if ((((Class157_Sub3) this)
						 .aClass122_9663)
						!= null)
						((Class122)
						 (((Class157_Sub3) this)
						  .aClass122_9663))
						    .anInterface14_1542
						    = null;
					    if ((((Class157_Sub3)
						  class157_sub3_365_)
						 .aClass122_9663) == null
						&& (((Class157_Sub3)
						     class157_sub3_365_)
						    .aClass122_9662) != null)
						((Class122)
						 (((Class157_Sub3)
						   class157_sub3_365_)
						  .aClass122_9662))
						    .anInterface14_1542
						    = null;
					    if ((((Class157_Sub3)
						  class157_sub3_365_)
						 .aClass122_9663)
						!= null)
						((Class122)
						 (((Class157_Sub3)
						   class157_sub3_365_)
						  .aClass122_9663))
						    .anInterface14_1542
						    = null;
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
    
    public void method1910(int i) {
	((Class157_Sub3) this).aShort9632 = (short) i;
	if (((Class157_Sub3) this).aClass122_9662 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9662)
		.anInterface14_1542
		= null;
    }
    
    public void method1915(int i) {
	((Class157_Sub3) this).aShort9633 = (short) i;
	if (((Class157_Sub3) this).aClass122_9662 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9662)
		.anInterface14_1542
		= null;
	if (((Class157_Sub3) this).aClass122_9663 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9663)
		.anInterface14_1542
		= null;
    }
    
    public int method1928() {
	return ((Class157_Sub3) this).aShort9632;
    }
    
    public int method1912() {
	return ((Class157_Sub3) this).aShort9633;
    }
    
    public byte[] method1913() {
	return ((Class157_Sub3) this).aByteArray9654;
    }
    
    public void method2005(Class433 class433, int i, boolean bool) {
	if (((Class157_Sub3) this).aShortArray9642 != null) {
	    Class433 class433_408_ = class433;
	    if (bool) {
		class433_408_
		    = ((Class173_Sub2) (((Class157_Sub3) this)
					.aClass173_Sub2_9628)).aClass433_9500;
		class433_408_.method5244(class433);
	    }
	    float[] fs = new float[3];
	    for (int i_409_ = 0; i_409_ < ((Class157_Sub3) this).anInt9637;
		 i_409_++) {
		if ((i & ((Class157_Sub3) this).aShortArray9642[i_409_])
		    != 0) {
		    class433_408_.method5233
			((float) ((Class157_Sub3) this).anIntArray9679[i_409_],
			 (float) ((Class157_Sub3) this).anIntArray9639[i_409_],
			 (float) ((Class157_Sub3) this).anIntArray9648[i_409_],
			 fs);
		    ((Class157_Sub3) this).anIntArray9679[i_409_]
			= (int) fs[0];
		    ((Class157_Sub3) this).anIntArray9639[i_409_]
			= (int) fs[1];
		    ((Class157_Sub3) this).anIntArray9648[i_409_]
			= (int) fs[2];
		}
	    }
	}
    }
    
    public void method1945(byte i, byte[] is) {
	if (is == null) {
	    for (int i_410_ = 0; i_410_ < ((Class157_Sub3) this).anInt9651;
		 i_410_++)
		((Class157_Sub3) this).aByteArray9654[i_410_] = i;
	} else {
	    for (int i_411_ = 0; i_411_ < ((Class157_Sub3) this).anInt9651;
		 i_411_++) {
		int i_412_ = 255 - ((255 - (is[i_411_] & 0xff))
				    * (255 - (i & 0xff)) / 255);
		((Class157_Sub3) this).aByteArray9654[i_411_] = (byte) i_412_;
	    }
	}
	if (((Class157_Sub3) this).aClass122_9662 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9662)
		.anInterface14_1542
		= null;
    }
    
    public void method1917(int i, int i_413_, int i_414_, int i_415_) {
	for (int i_416_ = 0; i_416_ < ((Class157_Sub3) this).anInt9651;
	     i_416_++) {
	    int i_417_
		= ((Class157_Sub3) this).aShortArray9653[i_416_] & 0xffff;
	    int i_418_ = i_417_ >> 10 & 0x3f;
	    int i_419_ = i_417_ >> 7 & 0x7;
	    int i_420_ = i_417_ & 0x7f;
	    if (i != -1)
		i_418_ += (i - i_418_) * i_415_ >> 7;
	    if (i_413_ != -1)
		i_419_ += (i_413_ - i_419_) * i_415_ >> 7;
	    if (i_414_ != -1)
		i_420_ += (i_414_ - i_420_) * i_415_ >> 7;
	    ((Class157_Sub3) this).aShortArray9653[i_416_]
		= (short) (i_418_ << 10 | i_419_ << 7 | i_420_);
	}
	if (((Class157_Sub3) this).aClass145Array9684 != null) {
	    for (int i_421_ = 0; i_421_ < ((Class157_Sub3) this).anInt9685;
		 i_421_++) {
		Class145 class145
		    = ((Class157_Sub3) this).aClass145Array9684[i_421_];
		Class113 class113
		    = ((Class157_Sub3) this).aClass113Array9687[i_421_];
		((Class113) class113).anInt1406
		    = (((Class113) class113).anInt1406 & ~0xffffff
		       | ((Class649.anIntArray8420
			   [(((Class157_Sub3) this).aShortArray9653
			     [((Class145) class145).anInt1655]) & 0xffff])
			  & 0xffffff));
	    }
	}
	if (((Class157_Sub3) this).aClass122_9662 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9662)
		.anInterface14_1542
		= null;
    }
    
    public int method1903() {
	if (!((Class157_Sub3) this).aBool9678)
	    method1909();
	return ((Class157_Sub3) this).aShort9672;
    }
    
    public boolean method1919() {
	return ((Class157_Sub3) this).aBool9634;
    }
    
    public int method1902() {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	return ((Class157_Sub3) this).aShort9674;
    }
    
    void method1886() {
	/* empty */
    }
    
    void method1893(int i, int[] is, int i_422_, int i_423_, int i_424_,
		    boolean bool, int i_425_, int[] is_426_) {
	int i_427_ = is.length;
	if (i == 0) {
	    i_422_ <<= 4;
	    i_423_ <<= 4;
	    i_424_ <<= 4;
	    int i_428_ = 0;
	    anInt9694 = 0;
	    anInt9695 = 0;
	    anInt9696 = 0;
	    for (int i_429_ = 0; i_429_ < i_427_; i_429_++) {
		int i_430_ = is[i_429_];
		if (i_430_
		    < ((Class157_Sub3) this).anIntArrayArray9641.length) {
		    int[] is_431_
			= ((Class157_Sub3) this).anIntArrayArray9641[i_430_];
		    for (int i_432_ = 0; i_432_ < is_431_.length; i_432_++) {
			int i_433_ = is_431_[i_432_];
			if (((Class157_Sub3) this).aShortArray9642 == null
			    || (i_425_ & (((Class157_Sub3) this)
					  .aShortArray9642[i_433_])) != 0) {
			    anInt9694 += (((Class157_Sub3) this).anIntArray9679
					  [i_433_]);
			    anInt9695 += (((Class157_Sub3) this).anIntArray9639
					  [i_433_]);
			    anInt9696 += (((Class157_Sub3) this).anIntArray9648
					  [i_433_]);
			    i_428_++;
			}
		    }
		}
	    }
	    if (i_428_ > 0) {
		anInt9694 = anInt9694 / i_428_ + i_422_;
		anInt9695 = anInt9695 / i_428_ + i_423_;
		anInt9696 = anInt9696 / i_428_ + i_424_;
		aBool9697 = true;
	    } else {
		anInt9694 = i_422_;
		anInt9695 = i_423_;
		anInt9696 = i_424_;
	    }
	} else if (i == 1) {
	    if (is_426_ != null) {
		int i_434_ = ((is_426_[0] * i_422_ + is_426_[1] * i_423_
			       + is_426_[2] * i_424_ + 8192)
			      >> 14);
		int i_435_ = ((is_426_[3] * i_422_ + is_426_[4] * i_423_
			       + is_426_[5] * i_424_ + 8192)
			      >> 14);
		int i_436_ = ((is_426_[6] * i_422_ + is_426_[7] * i_423_
			       + is_426_[8] * i_424_ + 8192)
			      >> 14);
		i_422_ = i_434_;
		i_423_ = i_435_;
		i_424_ = i_436_;
	    }
	    i_422_ <<= 4;
	    i_423_ <<= 4;
	    i_424_ <<= 4;
	    for (int i_437_ = 0; i_437_ < i_427_; i_437_++) {
		int i_438_ = is[i_437_];
		if (i_438_
		    < ((Class157_Sub3) this).anIntArrayArray9641.length) {
		    int[] is_439_
			= ((Class157_Sub3) this).anIntArrayArray9641[i_438_];
		    for (int i_440_ = 0; i_440_ < is_439_.length; i_440_++) {
			int i_441_ = is_439_[i_440_];
			if (((Class157_Sub3) this).aShortArray9642 == null
			    || (i_425_ & (((Class157_Sub3) this)
					  .aShortArray9642[i_441_])) != 0) {
			    ((Class157_Sub3) this).anIntArray9679[i_441_]
				+= i_422_;
			    ((Class157_Sub3) this).anIntArray9639[i_441_]
				+= i_423_;
			    ((Class157_Sub3) this).anIntArray9648[i_441_]
				+= i_424_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_426_ != null) {
		int i_442_ = is_426_[9] << 4;
		int i_443_ = is_426_[10] << 4;
		int i_444_ = is_426_[11] << 4;
		int i_445_ = is_426_[12] << 4;
		int i_446_ = is_426_[13] << 4;
		int i_447_ = is_426_[14] << 4;
		if (aBool9697) {
		    int i_448_
			= ((is_426_[0] * anInt9694 + is_426_[3] * anInt9695
			    + is_426_[6] * anInt9696 + 8192)
			   >> 14);
		    int i_449_
			= ((is_426_[1] * anInt9694 + is_426_[4] * anInt9695
			    + is_426_[7] * anInt9696 + 8192)
			   >> 14);
		    int i_450_
			= ((is_426_[2] * anInt9694 + is_426_[5] * anInt9695
			    + is_426_[8] * anInt9696 + 8192)
			   >> 14);
		    i_448_ += i_445_;
		    i_449_ += i_446_;
		    i_450_ += i_447_;
		    anInt9694 = i_448_;
		    anInt9695 = i_449_;
		    anInt9696 = i_450_;
		    aBool9697 = false;
		}
		int[] is_451_ = new int[9];
		int i_452_ = Class417.anIntArray4767[i_422_];
		int i_453_ = Class417.anIntArray4766[i_422_];
		int i_454_ = Class417.anIntArray4767[i_423_];
		int i_455_ = Class417.anIntArray4766[i_423_];
		int i_456_ = Class417.anIntArray4767[i_424_];
		int i_457_ = Class417.anIntArray4766[i_424_];
		int i_458_ = i_453_ * i_456_ + 8192 >> 14;
		int i_459_ = i_453_ * i_457_ + 8192 >> 14;
		is_451_[0] = i_454_ * i_456_ + i_455_ * i_459_ + 8192 >> 14;
		is_451_[1] = -i_454_ * i_457_ + i_455_ * i_458_ + 8192 >> 14;
		is_451_[2] = i_455_ * i_452_ + 8192 >> 14;
		is_451_[3] = i_452_ * i_457_ + 8192 >> 14;
		is_451_[4] = i_452_ * i_456_ + 8192 >> 14;
		is_451_[5] = -i_453_;
		is_451_[6] = -i_455_ * i_456_ + i_454_ * i_459_ + 8192 >> 14;
		is_451_[7] = i_455_ * i_457_ + i_454_ * i_458_ + 8192 >> 14;
		is_451_[8] = i_454_ * i_452_ + 8192 >> 14;
		int i_460_ = (is_451_[0] * -anInt9694 + is_451_[1] * -anInt9695
			      + is_451_[2] * -anInt9696 + 8192) >> 14;
		int i_461_ = (is_451_[3] * -anInt9694 + is_451_[4] * -anInt9695
			      + is_451_[5] * -anInt9696 + 8192) >> 14;
		int i_462_ = (is_451_[6] * -anInt9694 + is_451_[7] * -anInt9695
			      + is_451_[8] * -anInt9696 + 8192) >> 14;
		int i_463_ = i_460_ + anInt9694;
		int i_464_ = i_461_ + anInt9695;
		int i_465_ = i_462_ + anInt9696;
		int[] is_466_ = new int[9];
		for (int i_467_ = 0; i_467_ < 3; i_467_++) {
		    for (int i_468_ = 0; i_468_ < 3; i_468_++) {
			int i_469_ = 0;
			for (int i_470_ = 0; i_470_ < 3; i_470_++)
			    i_469_ += (is_451_[i_467_ * 3 + i_470_]
				       * is_426_[i_468_ * 3 + i_470_]);
			is_466_[i_467_ * 3 + i_468_] = i_469_ + 8192 >> 14;
		    }
		}
		int i_471_ = ((is_451_[0] * i_445_ + is_451_[1] * i_446_
			       + is_451_[2] * i_447_ + 8192)
			      >> 14);
		int i_472_ = ((is_451_[3] * i_445_ + is_451_[4] * i_446_
			       + is_451_[5] * i_447_ + 8192)
			      >> 14);
		int i_473_ = ((is_451_[6] * i_445_ + is_451_[7] * i_446_
			       + is_451_[8] * i_447_ + 8192)
			      >> 14);
		i_471_ += i_463_;
		i_472_ += i_464_;
		i_473_ += i_465_;
		int[] is_474_ = new int[9];
		for (int i_475_ = 0; i_475_ < 3; i_475_++) {
		    for (int i_476_ = 0; i_476_ < 3; i_476_++) {
			int i_477_ = 0;
			for (int i_478_ = 0; i_478_ < 3; i_478_++)
			    i_477_ += (is_426_[i_475_ * 3 + i_478_]
				       * is_466_[i_476_ + i_478_ * 3]);
			is_474_[i_475_ * 3 + i_476_] = i_477_ + 8192 >> 14;
		    }
		}
		int i_479_ = ((is_426_[0] * i_471_ + is_426_[1] * i_472_
			       + is_426_[2] * i_473_ + 8192)
			      >> 14);
		int i_480_ = ((is_426_[3] * i_471_ + is_426_[4] * i_472_
			       + is_426_[5] * i_473_ + 8192)
			      >> 14);
		int i_481_ = ((is_426_[6] * i_471_ + is_426_[7] * i_472_
			       + is_426_[8] * i_473_ + 8192)
			      >> 14);
		i_479_ += i_442_;
		i_480_ += i_443_;
		i_481_ += i_444_;
		for (int i_482_ = 0; i_482_ < i_427_; i_482_++) {
		    int i_483_ = is[i_482_];
		    if (i_483_
			< ((Class157_Sub3) this).anIntArrayArray9641.length) {
			int[] is_484_ = (((Class157_Sub3) this)
					 .anIntArrayArray9641[i_483_]);
			for (int i_485_ = 0; i_485_ < is_484_.length;
			     i_485_++) {
			    int i_486_ = is_484_[i_485_];
			    if (((Class157_Sub3) this).aShortArray9642 == null
				|| ((i_425_ & (((Class157_Sub3) this)
					       .aShortArray9642[i_486_]))
				    != 0)) {
				int i_487_
				    = (is_474_[0] * (((Class157_Sub3) this)
						     .anIntArray9679[i_486_])
				       + is_474_[1] * (((Class157_Sub3) this)
						       .anIntArray9639[i_486_])
				       + is_474_[2] * (((Class157_Sub3) this)
						       .anIntArray9648[i_486_])
				       + 8192) >> 14;
				int i_488_
				    = (is_474_[3] * (((Class157_Sub3) this)
						     .anIntArray9679[i_486_])
				       + is_474_[4] * (((Class157_Sub3) this)
						       .anIntArray9639[i_486_])
				       + is_474_[5] * (((Class157_Sub3) this)
						       .anIntArray9648[i_486_])
				       + 8192) >> 14;
				int i_489_
				    = (is_474_[6] * (((Class157_Sub3) this)
						     .anIntArray9679[i_486_])
				       + is_474_[7] * (((Class157_Sub3) this)
						       .anIntArray9639[i_486_])
				       + is_474_[8] * (((Class157_Sub3) this)
						       .anIntArray9648[i_486_])
				       + 8192) >> 14;
				i_487_ += i_479_;
				i_488_ += i_480_;
				i_489_ += i_481_;
				((Class157_Sub3) this).anIntArray9679[i_486_]
				    = i_487_;
				((Class157_Sub3) this).anIntArray9639[i_486_]
				    = i_488_;
				((Class157_Sub3) this).anIntArray9648[i_486_]
				    = i_489_;
			    }
			}
		    }
		}
	    } else {
		for (int i_490_ = 0; i_490_ < i_427_; i_490_++) {
		    int i_491_ = is[i_490_];
		    if (i_491_
			< ((Class157_Sub3) this).anIntArrayArray9641.length) {
			int[] is_492_ = (((Class157_Sub3) this)
					 .anIntArrayArray9641[i_491_]);
			for (int i_493_ = 0; i_493_ < is_492_.length;
			     i_493_++) {
			    int i_494_ = is_492_[i_493_];
			    if (((Class157_Sub3) this).aShortArray9642 == null
				|| ((i_425_ & (((Class157_Sub3) this)
					       .aShortArray9642[i_494_]))
				    != 0)) {
				((Class157_Sub3) this).anIntArray9679[i_494_]
				    -= anInt9694;
				((Class157_Sub3) this).anIntArray9639[i_494_]
				    -= anInt9695;
				((Class157_Sub3) this).anIntArray9648[i_494_]
				    -= anInt9696;
				if (i_424_ != 0) {
				    int i_495_
					= Class417.anIntArray4766[i_424_];
				    int i_496_
					= Class417.anIntArray4767[i_424_];
				    int i_497_
					= ((((Class157_Sub3) this)
					    .anIntArray9639[i_494_]) * i_495_
					   + (((Class157_Sub3) this)
					      .anIntArray9679[i_494_]) * i_496_
					   + 16383) >> 14;
				    ((Class157_Sub3) this).anIntArray9639
					[i_494_]
					= ((((Class157_Sub3) this)
					    .anIntArray9639[i_494_]) * i_496_
					   - (((Class157_Sub3) this)
					      .anIntArray9679[i_494_]) * i_495_
					   + 16383) >> 14;
				    ((Class157_Sub3) this).anIntArray9679
					[i_494_]
					= i_497_;
				}
				if (i_422_ != 0) {
				    int i_498_
					= Class417.anIntArray4766[i_422_];
				    int i_499_
					= Class417.anIntArray4767[i_422_];
				    int i_500_
					= ((((Class157_Sub3) this)
					    .anIntArray9639[i_494_]) * i_499_
					   - (((Class157_Sub3) this)
					      .anIntArray9648[i_494_]) * i_498_
					   + 16383) >> 14;
				    ((Class157_Sub3) this).anIntArray9648
					[i_494_]
					= ((((Class157_Sub3) this)
					    .anIntArray9639[i_494_]) * i_498_
					   + (((Class157_Sub3) this)
					      .anIntArray9648[i_494_]) * i_499_
					   + 16383) >> 14;
				    ((Class157_Sub3) this).anIntArray9639
					[i_494_]
					= i_500_;
				}
				if (i_423_ != 0) {
				    int i_501_
					= Class417.anIntArray4766[i_423_];
				    int i_502_
					= Class417.anIntArray4767[i_423_];
				    int i_503_
					= ((((Class157_Sub3) this)
					    .anIntArray9648[i_494_]) * i_501_
					   + (((Class157_Sub3) this)
					      .anIntArray9679[i_494_]) * i_502_
					   + 16383) >> 14;
				    ((Class157_Sub3) this).anIntArray9648
					[i_494_]
					= ((((Class157_Sub3) this)
					    .anIntArray9648[i_494_]) * i_502_
					   - (((Class157_Sub3) this)
					      .anIntArray9679[i_494_]) * i_501_
					   + 16383) >> 14;
				    ((Class157_Sub3) this).anIntArray9679
					[i_494_]
					= i_503_;
				}
				((Class157_Sub3) this).anIntArray9679[i_494_]
				    += anInt9694;
				((Class157_Sub3) this).anIntArray9639[i_494_]
				    += anInt9695;
				((Class157_Sub3) this).anIntArray9648[i_494_]
				    += anInt9696;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_504_ = 0; i_504_ < i_427_; i_504_++) {
			int i_505_ = is[i_504_];
			if (i_505_ < (((Class157_Sub3) this)
				      .anIntArrayArray9641).length) {
			    int[] is_506_ = (((Class157_Sub3) this)
					     .anIntArrayArray9641[i_505_]);
			    for (int i_507_ = 0; i_507_ < is_506_.length;
				 i_507_++) {
				int i_508_ = is_506_[i_507_];
				if ((((Class157_Sub3) this).aShortArray9642
				     == null)
				    || ((i_425_ & (((Class157_Sub3) this)
						   .aShortArray9642[i_508_]))
					!= 0)) {
				    int i_509_ = (((Class157_Sub3) this)
						  .anIntArray9660[i_508_]);
				    int i_510_ = (((Class157_Sub3) this)
						  .anIntArray9660[i_508_ + 1]);
				    for (int i_511_ = i_509_;
					 (i_511_ < i_510_
					  && (((Class157_Sub3) this)
					      .aShortArray9682[i_511_]) != 0);
					 i_511_++) {
					int i_512_
					    = (((((Class157_Sub3) this)
						 .aShortArray9682[i_511_])
						& 0xffff)
					       - 1);
					if (i_424_ != 0) {
					    int i_513_
						= (Class417.anIntArray4766
						   [i_424_]);
					    int i_514_
						= (Class417.anIntArray4767
						   [i_424_]);
					    int i_515_
						= ((((((Class157_Sub3) this)
						      .aShortArray9645[i_512_])
						     * i_513_)
						    + (((Class157_Sub3) this)
						       .aShortArray9673
						       [i_512_]) * i_514_
						    + 16383)
						   >> 14);
					    ((Class157_Sub3) this)
						.aShortArray9645[i_512_]
						= (short) (((((Class157_Sub3)
							      this)
							     .aShortArray9645
							     [i_512_]) * i_514_
							    - (((Class157_Sub3)
								this)
							       .aShortArray9673
							       [i_512_]) * i_513_
							    + 16383)
							   >> 14);
					    ((Class157_Sub3) this)
						.aShortArray9673[i_512_]
						= (short) i_515_;
					}
					if (i_422_ != 0) {
					    int i_516_
						= (Class417.anIntArray4766
						   [i_422_]);
					    int i_517_
						= (Class417.anIntArray4767
						   [i_422_]);
					    int i_518_
						= ((((((Class157_Sub3) this)
						      .aShortArray9645[i_512_])
						     * i_517_)
						    - (((Class157_Sub3) this)
						       .aShortArray9646
						       [i_512_]) * i_516_
						    + 16383)
						   >> 14);
					    ((Class157_Sub3) this)
						.aShortArray9646[i_512_]
						= (short) (((((Class157_Sub3)
							      this)
							     .aShortArray9645
							     [i_512_]) * i_516_
							    + (((Class157_Sub3)
								this)
							       .aShortArray9646
							       [i_512_]) * i_517_
							    + 16383)
							   >> 14);
					    ((Class157_Sub3) this)
						.aShortArray9645[i_512_]
						= (short) i_518_;
					}
					if (i_423_ != 0) {
					    int i_519_
						= (Class417.anIntArray4766
						   [i_423_]);
					    int i_520_
						= (Class417.anIntArray4767
						   [i_423_]);
					    int i_521_
						= ((((((Class157_Sub3) this)
						      .aShortArray9646[i_512_])
						     * i_519_)
						    + (((Class157_Sub3) this)
						       .aShortArray9673
						       [i_512_]) * i_520_
						    + 16383)
						   >> 14);
					    ((Class157_Sub3) this)
						.aShortArray9646[i_512_]
						= (short) (((((Class157_Sub3)
							      this)
							     .aShortArray9646
							     [i_512_]) * i_520_
							    - (((Class157_Sub3)
								this)
							       .aShortArray9673
							       [i_512_]) * i_519_
							    + 16383)
							   >> 14);
					    ((Class157_Sub3) this)
						.aShortArray9673[i_512_]
						= (short) i_521_;
					}
				    }
				}
			    }
			}
		    }
		    if (((Class157_Sub3) this).aClass122_9663 == null
			&& ((Class157_Sub3) this).aClass122_9662 != null)
			((Class122) ((Class157_Sub3) this).aClass122_9662)
			    .anInterface14_1542
			    = null;
		    if (((Class157_Sub3) this).aClass122_9663 != null)
			((Class122) ((Class157_Sub3) this).aClass122_9663)
			    .anInterface14_1542
			    = null;
		}
	    }
	} else if (i == 3) {
	    if (is_426_ != null) {
		int i_522_ = is_426_[9] << 4;
		int i_523_ = is_426_[10] << 4;
		int i_524_ = is_426_[11] << 4;
		int i_525_ = is_426_[12] << 4;
		int i_526_ = is_426_[13] << 4;
		int i_527_ = is_426_[14] << 4;
		if (aBool9697) {
		    int i_528_
			= ((is_426_[0] * anInt9694 + is_426_[3] * anInt9695
			    + is_426_[6] * anInt9696 + 8192)
			   >> 14);
		    int i_529_
			= ((is_426_[1] * anInt9694 + is_426_[4] * anInt9695
			    + is_426_[7] * anInt9696 + 8192)
			   >> 14);
		    int i_530_
			= ((is_426_[2] * anInt9694 + is_426_[5] * anInt9695
			    + is_426_[8] * anInt9696 + 8192)
			   >> 14);
		    i_528_ += i_525_;
		    i_529_ += i_526_;
		    i_530_ += i_527_;
		    anInt9694 = i_528_;
		    anInt9695 = i_529_;
		    anInt9696 = i_530_;
		    aBool9697 = false;
		}
		int i_531_ = i_422_ << 15 >> 7;
		int i_532_ = i_423_ << 15 >> 7;
		int i_533_ = i_424_ << 15 >> 7;
		int i_534_ = i_531_ * -anInt9694 + 8192 >> 14;
		int i_535_ = i_532_ * -anInt9695 + 8192 >> 14;
		int i_536_ = i_533_ * -anInt9696 + 8192 >> 14;
		int i_537_ = i_534_ + anInt9694;
		int i_538_ = i_535_ + anInt9695;
		int i_539_ = i_536_ + anInt9696;
		int[] is_540_ = new int[9];
		is_540_[0] = i_531_ * is_426_[0] + 8192 >> 14;
		is_540_[1] = i_531_ * is_426_[3] + 8192 >> 14;
		is_540_[2] = i_531_ * is_426_[6] + 8192 >> 14;
		is_540_[3] = i_532_ * is_426_[1] + 8192 >> 14;
		is_540_[4] = i_532_ * is_426_[4] + 8192 >> 14;
		is_540_[5] = i_532_ * is_426_[7] + 8192 >> 14;
		is_540_[6] = i_533_ * is_426_[2] + 8192 >> 14;
		is_540_[7] = i_533_ * is_426_[5] + 8192 >> 14;
		is_540_[8] = i_533_ * is_426_[8] + 8192 >> 14;
		int i_541_ = i_531_ * i_525_ + 8192 >> 14;
		int i_542_ = i_532_ * i_526_ + 8192 >> 14;
		int i_543_ = i_533_ * i_527_ + 8192 >> 14;
		i_541_ += i_537_;
		i_542_ += i_538_;
		i_543_ += i_539_;
		int[] is_544_ = new int[9];
		for (int i_545_ = 0; i_545_ < 3; i_545_++) {
		    for (int i_546_ = 0; i_546_ < 3; i_546_++) {
			int i_547_ = 0;
			for (int i_548_ = 0; i_548_ < 3; i_548_++)
			    i_547_ += (is_426_[i_545_ * 3 + i_548_]
				       * is_540_[i_546_ + i_548_ * 3]);
			is_544_[i_545_ * 3 + i_546_] = i_547_ + 8192 >> 14;
		    }
		}
		int i_549_ = ((is_426_[0] * i_541_ + is_426_[1] * i_542_
			       + is_426_[2] * i_543_ + 8192)
			      >> 14);
		int i_550_ = ((is_426_[3] * i_541_ + is_426_[4] * i_542_
			       + is_426_[5] * i_543_ + 8192)
			      >> 14);
		int i_551_ = ((is_426_[6] * i_541_ + is_426_[7] * i_542_
			       + is_426_[8] * i_543_ + 8192)
			      >> 14);
		i_549_ += i_522_;
		i_550_ += i_523_;
		i_551_ += i_524_;
		for (int i_552_ = 0; i_552_ < i_427_; i_552_++) {
		    int i_553_ = is[i_552_];
		    if (i_553_
			< ((Class157_Sub3) this).anIntArrayArray9641.length) {
			int[] is_554_ = (((Class157_Sub3) this)
					 .anIntArrayArray9641[i_553_]);
			for (int i_555_ = 0; i_555_ < is_554_.length;
			     i_555_++) {
			    int i_556_ = is_554_[i_555_];
			    if (((Class157_Sub3) this).aShortArray9642 == null
				|| ((i_425_ & (((Class157_Sub3) this)
					       .aShortArray9642[i_556_]))
				    != 0)) {
				int i_557_
				    = (is_544_[0] * (((Class157_Sub3) this)
						     .anIntArray9679[i_556_])
				       + is_544_[1] * (((Class157_Sub3) this)
						       .anIntArray9639[i_556_])
				       + is_544_[2] * (((Class157_Sub3) this)
						       .anIntArray9648[i_556_])
				       + 8192) >> 14;
				int i_558_
				    = (is_544_[3] * (((Class157_Sub3) this)
						     .anIntArray9679[i_556_])
				       + is_544_[4] * (((Class157_Sub3) this)
						       .anIntArray9639[i_556_])
				       + is_544_[5] * (((Class157_Sub3) this)
						       .anIntArray9648[i_556_])
				       + 8192) >> 14;
				int i_559_
				    = (is_544_[6] * (((Class157_Sub3) this)
						     .anIntArray9679[i_556_])
				       + is_544_[7] * (((Class157_Sub3) this)
						       .anIntArray9639[i_556_])
				       + is_544_[8] * (((Class157_Sub3) this)
						       .anIntArray9648[i_556_])
				       + 8192) >> 14;
				i_557_ += i_549_;
				i_558_ += i_550_;
				i_559_ += i_551_;
				((Class157_Sub3) this).anIntArray9679[i_556_]
				    = i_557_;
				((Class157_Sub3) this).anIntArray9639[i_556_]
				    = i_558_;
				((Class157_Sub3) this).anIntArray9648[i_556_]
				    = i_559_;
			    }
			}
		    }
		}
	    } else {
		for (int i_560_ = 0; i_560_ < i_427_; i_560_++) {
		    int i_561_ = is[i_560_];
		    if (i_561_
			< ((Class157_Sub3) this).anIntArrayArray9641.length) {
			int[] is_562_ = (((Class157_Sub3) this)
					 .anIntArrayArray9641[i_561_]);
			for (int i_563_ = 0; i_563_ < is_562_.length;
			     i_563_++) {
			    int i_564_ = is_562_[i_563_];
			    if (((Class157_Sub3) this).aShortArray9642 == null
				|| ((i_425_ & (((Class157_Sub3) this)
					       .aShortArray9642[i_564_]))
				    != 0)) {
				((Class157_Sub3) this).anIntArray9679[i_564_]
				    -= anInt9694;
				((Class157_Sub3) this).anIntArray9639[i_564_]
				    -= anInt9695;
				((Class157_Sub3) this).anIntArray9648[i_564_]
				    -= anInt9696;
				((Class157_Sub3) this).anIntArray9679[i_564_]
				    = (((Class157_Sub3) this).anIntArray9679
				       [i_564_]) * i_422_ >> 7;
				((Class157_Sub3) this).anIntArray9639[i_564_]
				    = (((Class157_Sub3) this).anIntArray9639
				       [i_564_]) * i_423_ >> 7;
				((Class157_Sub3) this).anIntArray9648[i_564_]
				    = (((Class157_Sub3) this).anIntArray9648
				       [i_564_]) * i_424_ >> 7;
				((Class157_Sub3) this).anIntArray9679[i_564_]
				    += anInt9694;
				((Class157_Sub3) this).anIntArray9639[i_564_]
				    += anInt9695;
				((Class157_Sub3) this).anIntArray9648[i_564_]
				    += anInt9696;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class157_Sub3) this).anIntArrayArray9659 != null) {
		for (int i_565_ = 0; i_565_ < i_427_; i_565_++) {
		    int i_566_ = is[i_565_];
		    if (i_566_
			< ((Class157_Sub3) this).anIntArrayArray9659.length) {
			int[] is_567_ = (((Class157_Sub3) this)
					 .anIntArrayArray9659[i_566_]);
			for (int i_568_ = 0; i_568_ < is_567_.length;
			     i_568_++) {
			    int i_569_ = is_567_[i_568_];
			    if (((Class157_Sub3) this).aShortArray9677 == null
				|| ((i_425_ & (((Class157_Sub3) this)
					       .aShortArray9677[i_569_]))
				    != 0)) {
				int i_570_ = (((((Class157_Sub3) this)
						.aByteArray9654[i_569_])
					       & 0xff)
					      + i_422_ * 8);
				if (i_570_ < 0)
				    i_570_ = 0;
				else if (i_570_ > 255)
				    i_570_ = 255;
				((Class157_Sub3) this).aByteArray9654[i_569_]
				    = (byte) i_570_;
				if (((Class157_Sub3) this).aClass122_9662
				    != null)
				    ((Class122)
				     ((Class157_Sub3) this).aClass122_9662)
					.anInterface14_1542
					= null;
			    }
			}
		    }
		}
		if (((Class157_Sub3) this).aClass145Array9684 != null) {
		    for (int i_571_ = 0;
			 i_571_ < ((Class157_Sub3) this).anInt9685; i_571_++) {
			Class145 class145 = (((Class157_Sub3) this)
					     .aClass145Array9684[i_571_]);
			Class113 class113 = (((Class157_Sub3) this)
					     .aClass113Array9687[i_571_]);
			((Class113) class113).anInt1406
			    = (((Class113) class113).anInt1406 & 0xffffff
			       | 255 - ((((Class157_Sub3) this).aByteArray9654
					 [((Class145) class145).anInt1655])
					& 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (((Class157_Sub3) this).anIntArrayArray9659 != null) {
		for (int i_572_ = 0; i_572_ < i_427_; i_572_++) {
		    int i_573_ = is[i_572_];
		    if (i_573_
			< ((Class157_Sub3) this).anIntArrayArray9659.length) {
			int[] is_574_ = (((Class157_Sub3) this)
					 .anIntArrayArray9659[i_573_]);
			for (int i_575_ = 0; i_575_ < is_574_.length;
			     i_575_++) {
			    int i_576_ = is_574_[i_575_];
			    if (((Class157_Sub3) this).aShortArray9677 == null
				|| ((i_425_ & (((Class157_Sub3) this)
					       .aShortArray9677[i_576_]))
				    != 0)) {
				int i_577_ = ((((Class157_Sub3) this)
					       .aShortArray9653[i_576_])
					      & 0xffff);
				int i_578_ = i_577_ >> 10 & 0x3f;
				int i_579_ = i_577_ >> 7 & 0x7;
				int i_580_ = i_577_ & 0x7f;
				i_578_ = i_578_ + i_422_ & 0x3f;
				i_579_ += i_423_ / 4;
				if (i_579_ < 0)
				    i_579_ = 0;
				else if (i_579_ > 7)
				    i_579_ = 7;
				i_580_ += i_424_;
				if (i_580_ < 0)
				    i_580_ = 0;
				else if (i_580_ > 127)
				    i_580_ = 127;
				((Class157_Sub3) this).aShortArray9653[i_576_]
				    = (short) (i_578_ << 10 | i_579_ << 7
					       | i_580_);
				if (((Class157_Sub3) this).aClass122_9662
				    != null)
				    ((Class122)
				     ((Class157_Sub3) this).aClass122_9662)
					.anInterface14_1542
					= null;
			    }
			}
		    }
		}
		if (((Class157_Sub3) this).aClass145Array9684 != null) {
		    for (int i_581_ = 0;
			 i_581_ < ((Class157_Sub3) this).anInt9685; i_581_++) {
			Class145 class145 = (((Class157_Sub3) this)
					     .aClass145Array9684[i_581_]);
			Class113 class113 = (((Class157_Sub3) this)
					     .aClass113Array9687[i_581_]);
			((Class113) class113).anInt1406
			    = (((Class113) class113).anInt1406 & ~0xffffff
			       | (Class649.anIntArray8420
				  [((((Class157_Sub3) this).aShortArray9653
				     [((Class145) class145).anInt1655])
				    & 0xffff)]) & 0xffffff);
		    }
		}
	    }
	} else if (i == 8) {
	    if (((Class157_Sub3) this).anIntArrayArray9691 != null) {
		for (int i_582_ = 0; i_582_ < i_427_; i_582_++) {
		    int i_583_ = is[i_582_];
		    if (i_583_
			< ((Class157_Sub3) this).anIntArrayArray9691.length) {
			int[] is_584_ = (((Class157_Sub3) this)
					 .anIntArrayArray9691[i_583_]);
			for (int i_585_ = 0; i_585_ < is_584_.length;
			     i_585_++) {
			    Class113 class113
				= (((Class157_Sub3) this).aClass113Array9687
				   [is_584_[i_585_]]);
			    ((Class113) class113).anInt1402 += i_422_;
			    ((Class113) class113).anInt1405 += i_423_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class157_Sub3) this).anIntArrayArray9691 != null) {
		for (int i_586_ = 0; i_586_ < i_427_; i_586_++) {
		    int i_587_ = is[i_586_];
		    if (i_587_
			< ((Class157_Sub3) this).anIntArrayArray9691.length) {
			int[] is_588_ = (((Class157_Sub3) this)
					 .anIntArrayArray9691[i_587_]);
			for (int i_589_ = 0; i_589_ < is_588_.length;
			     i_589_++) {
			    Class113 class113
				= (((Class157_Sub3) this).aClass113Array9687
				   [is_588_[i_589_]]);
			    ((Class113) class113).anInt1403
				= (((Class113) class113).anInt1403 * i_422_
				   >> 7);
			    ((Class113) class113).anInt1404
				= (((Class113) class113).anInt1404 * i_423_
				   >> 7);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class157_Sub3) this).anIntArrayArray9691 != null) {
		for (int i_590_ = 0; i_590_ < i_427_; i_590_++) {
		    int i_591_ = is[i_590_];
		    if (i_591_
			< ((Class157_Sub3) this).anIntArrayArray9691.length) {
			int[] is_592_ = (((Class157_Sub3) this)
					 .anIntArrayArray9691[i_591_]);
			for (int i_593_ = 0; i_593_ < is_592_.length;
			     i_593_++) {
			    Class113 class113
				= (((Class157_Sub3) this).aClass113Array9687
				   [is_592_[i_593_]]);
			    ((Class113) class113).anInt1407
				= (((Class113) class113).anInt1407 + i_422_
				   & 0x3fff);
			}
		    }
		}
	    }
	}
    }
    
    void method1894(int i, int i_594_, int i_595_, int i_596_) {
	if (i == 0) {
	    int i_597_ = 0;
	    anInt9694 = 0;
	    anInt9695 = 0;
	    anInt9696 = 0;
	    for (int i_598_ = 0; i_598_ < ((Class157_Sub3) this).anInt9637;
		 i_598_++) {
		anInt9694 += ((Class157_Sub3) this).anIntArray9679[i_598_];
		anInt9695 += ((Class157_Sub3) this).anIntArray9639[i_598_];
		anInt9696 += ((Class157_Sub3) this).anIntArray9648[i_598_];
		i_597_++;
	    }
	    if (i_597_ > 0) {
		anInt9694 = anInt9694 / i_597_ + i_594_;
		anInt9695 = anInt9695 / i_597_ + i_595_;
		anInt9696 = anInt9696 / i_597_ + i_596_;
	    } else {
		anInt9694 = i_594_;
		anInt9695 = i_595_;
		anInt9696 = i_596_;
	    }
	} else if (i == 1) {
	    for (int i_599_ = 0; i_599_ < ((Class157_Sub3) this).anInt9637;
		 i_599_++) {
		((Class157_Sub3) this).anIntArray9679[i_599_] += i_594_;
		((Class157_Sub3) this).anIntArray9639[i_599_] += i_595_;
		((Class157_Sub3) this).anIntArray9648[i_599_] += i_596_;
	    }
	} else if (i == 2) {
	    for (int i_600_ = 0; i_600_ < ((Class157_Sub3) this).anInt9637;
		 i_600_++) {
		((Class157_Sub3) this).anIntArray9679[i_600_] -= anInt9694;
		((Class157_Sub3) this).anIntArray9639[i_600_] -= anInt9695;
		((Class157_Sub3) this).anIntArray9648[i_600_] -= anInt9696;
		if (i_596_ != 0) {
		    int i_601_ = Class417.anIntArray4766[i_596_];
		    int i_602_ = Class417.anIntArray4767[i_596_];
		    int i_603_
			= (((((Class157_Sub3) this).anIntArray9639[i_600_]
			     * i_601_)
			    + (((Class157_Sub3) this).anIntArray9679[i_600_]
			       * i_602_)
			    + 16383)
			   >> 14);
		    ((Class157_Sub3) this).anIntArray9639[i_600_]
			= ((((Class157_Sub3) this).anIntArray9639[i_600_]
			    * i_602_)
			   - (((Class157_Sub3) this).anIntArray9679[i_600_]
			      * i_601_)
			   + 16383) >> 14;
		    ((Class157_Sub3) this).anIntArray9679[i_600_] = i_603_;
		}
		if (i_594_ != 0) {
		    int i_604_ = Class417.anIntArray4766[i_594_];
		    int i_605_ = Class417.anIntArray4767[i_594_];
		    int i_606_
			= (((((Class157_Sub3) this).anIntArray9639[i_600_]
			     * i_605_)
			    - (((Class157_Sub3) this).anIntArray9648[i_600_]
			       * i_604_)
			    + 16383)
			   >> 14);
		    ((Class157_Sub3) this).anIntArray9648[i_600_]
			= ((((Class157_Sub3) this).anIntArray9639[i_600_]
			    * i_604_)
			   + (((Class157_Sub3) this).anIntArray9648[i_600_]
			      * i_605_)
			   + 16383) >> 14;
		    ((Class157_Sub3) this).anIntArray9639[i_600_] = i_606_;
		}
		if (i_595_ != 0) {
		    int i_607_ = Class417.anIntArray4766[i_595_];
		    int i_608_ = Class417.anIntArray4767[i_595_];
		    int i_609_
			= (((((Class157_Sub3) this).anIntArray9648[i_600_]
			     * i_607_)
			    + (((Class157_Sub3) this).anIntArray9679[i_600_]
			       * i_608_)
			    + 16383)
			   >> 14);
		    ((Class157_Sub3) this).anIntArray9648[i_600_]
			= ((((Class157_Sub3) this).anIntArray9648[i_600_]
			    * i_608_)
			   - (((Class157_Sub3) this).anIntArray9679[i_600_]
			      * i_607_)
			   + 16383) >> 14;
		    ((Class157_Sub3) this).anIntArray9679[i_600_] = i_609_;
		}
		((Class157_Sub3) this).anIntArray9679[i_600_] += anInt9694;
		((Class157_Sub3) this).anIntArray9639[i_600_] += anInt9695;
		((Class157_Sub3) this).anIntArray9648[i_600_] += anInt9696;
	    }
	} else if (i == 3) {
	    for (int i_610_ = 0; i_610_ < ((Class157_Sub3) this).anInt9637;
		 i_610_++) {
		((Class157_Sub3) this).anIntArray9679[i_610_] -= anInt9694;
		((Class157_Sub3) this).anIntArray9639[i_610_] -= anInt9695;
		((Class157_Sub3) this).anIntArray9648[i_610_] -= anInt9696;
		((Class157_Sub3) this).anIntArray9679[i_610_]
		    = (((Class157_Sub3) this).anIntArray9679[i_610_] * i_594_
		       / 128);
		((Class157_Sub3) this).anIntArray9639[i_610_]
		    = (((Class157_Sub3) this).anIntArray9639[i_610_] * i_595_
		       / 128);
		((Class157_Sub3) this).anIntArray9648[i_610_]
		    = (((Class157_Sub3) this).anIntArray9648[i_610_] * i_596_
		       / 128);
		((Class157_Sub3) this).anIntArray9679[i_610_] += anInt9694;
		((Class157_Sub3) this).anIntArray9639[i_610_] += anInt9695;
		((Class157_Sub3) this).anIntArray9648[i_610_] += anInt9696;
	    }
	} else if (i == 5) {
	    for (int i_611_ = 0; i_611_ < ((Class157_Sub3) this).anInt9651;
		 i_611_++) {
		int i_612_
		    = ((((Class157_Sub3) this).aByteArray9654[i_611_] & 0xff)
		       + i_594_ * 8);
		if (i_612_ < 0)
		    i_612_ = 0;
		else if (i_612_ > 255)
		    i_612_ = 255;
		((Class157_Sub3) this).aByteArray9654[i_611_] = (byte) i_612_;
	    }
	    if (((Class157_Sub3) this).aClass122_9662 != null)
		((Class122) ((Class157_Sub3) this).aClass122_9662)
		    .anInterface14_1542
		    = null;
	    if (((Class157_Sub3) this).aClass145Array9684 != null) {
		for (int i_613_ = 0; i_613_ < ((Class157_Sub3) this).anInt9685;
		     i_613_++) {
		    Class145 class145
			= ((Class157_Sub3) this).aClass145Array9684[i_613_];
		    Class113 class113
			= ((Class157_Sub3) this).aClass113Array9687[i_613_];
		    ((Class113) class113).anInt1406
			= (((Class113) class113).anInt1406 & 0xffffff
			   | 255 - ((((Class157_Sub3) this).aByteArray9654
				     [((Class145) class145).anInt1655])
				    & 0xff) << 24);
		}
	    }
	} else if (i == 7) {
	    for (int i_614_ = 0; i_614_ < ((Class157_Sub3) this).anInt9651;
		 i_614_++) {
		int i_615_
		    = ((Class157_Sub3) this).aShortArray9653[i_614_] & 0xffff;
		int i_616_ = i_615_ >> 10 & 0x3f;
		int i_617_ = i_615_ >> 7 & 0x7;
		int i_618_ = i_615_ & 0x7f;
		i_616_ = i_616_ + i_594_ & 0x3f;
		i_617_ += i_595_ / 4;
		if (i_617_ < 0)
		    i_617_ = 0;
		else if (i_617_ > 7)
		    i_617_ = 7;
		i_618_ += i_596_;
		if (i_618_ < 0)
		    i_618_ = 0;
		else if (i_618_ > 127)
		    i_618_ = 127;
		((Class157_Sub3) this).aShortArray9653[i_614_]
		    = (short) (i_616_ << 10 | i_617_ << 7 | i_618_);
	    }
	    if (((Class157_Sub3) this).aClass122_9662 != null)
		((Class122) ((Class157_Sub3) this).aClass122_9662)
		    .anInterface14_1542
		    = null;
	    if (((Class157_Sub3) this).aClass145Array9684 != null) {
		for (int i_619_ = 0; i_619_ < ((Class157_Sub3) this).anInt9685;
		     i_619_++) {
		    Class145 class145
			= ((Class157_Sub3) this).aClass145Array9684[i_619_];
		    Class113 class113
			= ((Class157_Sub3) this).aClass113Array9687[i_619_];
		    ((Class113) class113).anInt1406
			= (((Class113) class113).anInt1406 & ~0xffffff
			   | ((Class649.anIntArray8420
			       [(((Class157_Sub3) this).aShortArray9653
				 [((Class145) class145).anInt1655]) & 0xffff])
			      & 0xffffff));
		}
	    }
	} else if (i == 8) {
	    for (int i_620_ = 0; i_620_ < ((Class157_Sub3) this).anInt9685;
		 i_620_++) {
		Class113 class113
		    = ((Class157_Sub3) this).aClass113Array9687[i_620_];
		((Class113) class113).anInt1402 += i_594_;
		((Class113) class113).anInt1405 += i_595_;
	    }
	} else if (i == 10) {
	    for (int i_621_ = 0; i_621_ < ((Class157_Sub3) this).anInt9685;
		 i_621_++) {
		Class113 class113
		    = ((Class157_Sub3) this).aClass113Array9687[i_621_];
		((Class113) class113).anInt1403
		    = ((Class113) class113).anInt1403 * i_594_ >> 7;
		((Class113) class113).anInt1404
		    = ((Class113) class113).anInt1404 * i_595_ >> 7;
	    }
	} else if (i == 9) {
	    for (int i_622_ = 0; i_622_ < ((Class157_Sub3) this).anInt9685;
		 i_622_++) {
		Class113 class113
		    = ((Class157_Sub3) this).aClass113Array9687[i_622_];
		((Class113) class113).anInt1407
		    = ((Class113) class113).anInt1407 + i_594_ & 0x3fff;
	    }
	}
    }
    
    public int method1907() {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	return ((Class157_Sub3) this).anInt9681;
    }
    
    void method1895() {
	for (int i = 0; i < ((Class157_Sub3) this).anInt9636; i++) {
	    ((Class157_Sub3) this).anIntArray9679[i]
		= ((Class157_Sub3) this).anIntArray9679[i] + 7 >> 4;
	    ((Class157_Sub3) this).anIntArray9639[i]
		= ((Class157_Sub3) this).anIntArray9639[i] + 7 >> 4;
	    ((Class157_Sub3) this).anIntArray9648[i]
		= ((Class157_Sub3) this).anIntArray9648[i] + 7 >> 4;
	}
	if (((Class157_Sub3) this).aClass122_9661 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9661)
		.anInterface14_1542
		= null;
	((Class157_Sub3) this).aBool9649 = false;
    }
    
    public Class144[] method2033() {
	return ((Class157_Sub3) this).aClass144Array9664;
    }
    
    public Class144[] method1923() {
	return ((Class157_Sub3) this).aClass144Array9664;
    }
    
    public Class528_Sub21_Sub12 method1970
	(Class528_Sub21_Sub12 class528_sub21_sub12) {
	if (((Class157_Sub3) this).anInt9623 == 0)
	    return null;
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	int i;
	int i_623_;
	if ((((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
	     .anInt9508)
	    > 0) {
	    i = ((((Class157_Sub3) this).aShort9674
		  - ((((Class157_Sub3) this).aShort9693
		      * ((Class173_Sub2)
			 ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9508)
		     >> 8))
		 >> ((Class173_Sub2)
		     ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9438);
	    i_623_
		= ((((Class157_Sub3) this).aShort9688
		    - ((((Class157_Sub3) this).aShort9670
			* ((Class173_Sub2) (((Class157_Sub3) this)
					    .aClass173_Sub2_9628)).anInt9508)
		       >> 8))
		   >> ((Class173_Sub2)
		       ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9438);
	} else {
	    i = ((((Class157_Sub3) this).aShort9674
		  - ((((Class157_Sub3) this).aShort9670
		      * ((Class173_Sub2)
			 ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9508)
		     >> 8))
		 >> ((Class173_Sub2)
		     ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9438);
	    i_623_
		= ((((Class157_Sub3) this).aShort9688
		    - ((((Class157_Sub3) this).aShort9693
			* ((Class173_Sub2) (((Class157_Sub3) this)
					    .aClass173_Sub2_9628)).anInt9508)
		       >> 8))
		   >> ((Class173_Sub2)
		       ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9438);
	}
	int i_624_;
	int i_625_;
	if ((((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
	     .anInt9462)
	    > 0) {
	    i_624_
		= ((((Class157_Sub3) this).aShort9676
		    - ((((Class157_Sub3) this).aShort9693
			* ((Class173_Sub2) (((Class157_Sub3) this)
					    .aClass173_Sub2_9628)).anInt9462)
		       >> 8))
		   >> ((Class173_Sub2)
		       ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9438);
	    i_625_
		= ((((Class157_Sub3) this).aShort9644
		    - ((((Class157_Sub3) this).aShort9670
			* ((Class173_Sub2) (((Class157_Sub3) this)
					    .aClass173_Sub2_9628)).anInt9462)
		       >> 8))
		   >> ((Class173_Sub2)
		       ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9438);
	} else {
	    i_624_
		= ((((Class157_Sub3) this).aShort9676
		    - ((((Class157_Sub3) this).aShort9670
			* ((Class173_Sub2) (((Class157_Sub3) this)
					    .aClass173_Sub2_9628)).anInt9462)
		       >> 8))
		   >> ((Class173_Sub2)
		       ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9438);
	    i_625_
		= ((((Class157_Sub3) this).aShort9644
		    - ((((Class157_Sub3) this).aShort9693
			* ((Class173_Sub2) (((Class157_Sub3) this)
					    .aClass173_Sub2_9628)).anInt9462)
		       >> 8))
		   >> ((Class173_Sub2)
		       ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9438);
	}
	int i_626_ = i_623_ - i + 1;
	int i_627_ = i_625_ - i_624_ + 1;
	Class528_Sub21_Sub12_Sub2 class528_sub21_sub12_sub2
	    = (Class528_Sub21_Sub12_Sub2) class528_sub21_sub12;
	Class528_Sub21_Sub12_Sub2 class528_sub21_sub12_sub2_628_;
	if (class528_sub21_sub12_sub2 != null
	    && class528_sub21_sub12_sub2.method10873(i_626_, i_627_)) {
	    class528_sub21_sub12_sub2_628_ = class528_sub21_sub12_sub2;
	    class528_sub21_sub12_sub2_628_.method10875();
	} else
	    class528_sub21_sub12_sub2_628_
		= new Class528_Sub21_Sub12_Sub2((((Class157_Sub3) this)
						 .aClass173_Sub2_9628),
						i_626_, i_627_);
	class528_sub21_sub12_sub2_628_.method10866(i, i_624_, i_623_, i_625_);
	method8894(class528_sub21_sub12_sub2_628_);
	return class528_sub21_sub12_sub2_628_;
    }
    
    public int method1982() {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	return ((Class157_Sub3) this).aShort9676;
    }
    
    public boolean method2000(int i, int i_629_, Class433 class433,
			      boolean bool, int i_630_) {
	Class418 class418
	    = (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
	       .aClass418_9501);
	class418.method5035(class433);
	class418.method4974(((Class173_Sub2)
			     ((Class157_Sub3) this).aClass173_Sub2_9628)
			    .aClass418_9489);
	boolean bool_631_ = false;
	int i_632_ = 2147483647;
	int i_633_ = -2147483648;
	int i_634_ = 2147483647;
	int i_635_ = -2147483648;
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	int i_636_ = ((((Class157_Sub3) this).aShort9688
		       - ((Class157_Sub3) this).aShort9674)
		      >> 1);
	int i_637_ = ((((Class157_Sub3) this).aShort9693
		       - ((Class157_Sub3) this).aShort9670)
		      >> 1);
	int i_638_ = ((((Class157_Sub3) this).aShort9644
		       - ((Class157_Sub3) this).aShort9676)
		      >> 1);
	int i_639_ = ((Class157_Sub3) this).aShort9674 + i_636_;
	int i_640_ = ((Class157_Sub3) this).aShort9670 + i_637_;
	int i_641_ = ((Class157_Sub3) this).aShort9676 + i_638_;
	int i_642_ = i_639_ - (i_636_ << i_630_);
	int i_643_ = i_640_ - (i_637_ << i_630_);
	int i_644_ = i_641_ - (i_638_ << i_630_);
	int i_645_ = i_639_ + (i_636_ << i_630_);
	int i_646_ = i_640_ + (i_637_ << i_630_);
	int i_647_ = i_641_ + (i_638_ << i_630_);
	anIntArray9675[0] = i_642_;
	anIntArray9692[0] = i_643_;
	anIntArray9656[0] = i_644_;
	anIntArray9675[1] = i_645_;
	anIntArray9692[1] = i_643_;
	anIntArray9656[1] = i_644_;
	anIntArray9675[2] = i_642_;
	anIntArray9692[2] = i_646_;
	anIntArray9656[2] = i_644_;
	anIntArray9675[3] = i_645_;
	anIntArray9692[3] = i_646_;
	anIntArray9656[3] = i_644_;
	anIntArray9675[4] = i_642_;
	anIntArray9692[4] = i_643_;
	anIntArray9656[4] = i_647_;
	anIntArray9675[5] = i_645_;
	anIntArray9692[5] = i_643_;
	anIntArray9656[5] = i_647_;
	anIntArray9675[6] = i_642_;
	anIntArray9692[6] = i_646_;
	anIntArray9656[6] = i_647_;
	anIntArray9675[7] = i_645_;
	anIntArray9692[7] = i_646_;
	anIntArray9656[7] = i_647_;
	for (int i_648_ = 0; i_648_ < 8; i_648_++) {
	    int i_649_ = anIntArray9675[i_648_];
	    int i_650_ = anIntArray9692[i_648_];
	    int i_651_ = anIntArray9656[i_648_];
	    float f = (class418.aFloatArray4768[2] * (float) i_649_
		       + class418.aFloatArray4768[6] * (float) i_650_
		       + class418.aFloatArray4768[10] * (float) i_651_
		       + class418.aFloatArray4768[14]);
	    float f_652_ = (class418.aFloatArray4768[3] * (float) i_649_
			    + class418.aFloatArray4768[7] * (float) i_650_
			    + class418.aFloatArray4768[11] * (float) i_651_
			    + class418.aFloatArray4768[15]);
	    if (f >= -f_652_) {
		float f_653_ = (class418.aFloatArray4768[0] * (float) i_649_
				+ class418.aFloatArray4768[4] * (float) i_650_
				+ class418.aFloatArray4768[8] * (float) i_651_
				+ class418.aFloatArray4768[12]);
		float f_654_ = (class418.aFloatArray4768[1] * (float) i_649_
				+ class418.aFloatArray4768[5] * (float) i_650_
				+ class418.aFloatArray4768[9] * (float) i_651_
				+ class418.aFloatArray4768[13]);
		int i_655_ = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
						       .aClass173_Sub2_9628))
				     .aFloat9607)
				    + (((Class173_Sub2) (((Class157_Sub3) this)
							 .aClass173_Sub2_9628))
				       .aFloat9493) * f_653_ / f_652_);
		int i_656_ = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
						       .aClass173_Sub2_9628))
				     .aFloat9494)
				    + (((Class173_Sub2) (((Class157_Sub3) this)
							 .aClass173_Sub2_9628))
				       .aFloat9534) * f_654_ / f_652_);
		if (i_655_ < i_632_)
		    i_632_ = i_655_;
		if (i_655_ > i_633_)
		    i_633_ = i_655_;
		if (i_656_ < i_634_)
		    i_634_ = i_656_;
		if (i_656_ > i_635_)
		    i_635_ = i_656_;
		bool_631_ = true;
	    }
	}
	if (bool_631_ && i > i_632_ && i < i_633_ && i_629_ > i_634_
	    && i_629_ < i_635_) {
	    if (bool)
		return true;
	    if ((((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		 .anIntArray9408).length
		< ((Class157_Sub3) this).anInt9623) {
		((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		    .anIntArray9408
		    = new int[((Class157_Sub3) this).anInt9623];
		((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		    .anIntArray9558
		    = new int[((Class157_Sub3) this).anInt9623];
	    }
	    int[] is
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .anIntArray9408);
	    int[] is_657_
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .anIntArray9558);
	    for (int i_658_ = 0; i_658_ < ((Class157_Sub3) this).anInt9637;
		 i_658_++) {
		int i_659_ = ((Class157_Sub3) this).anIntArray9679[i_658_];
		int i_660_ = ((Class157_Sub3) this).anIntArray9639[i_658_];
		int i_661_ = ((Class157_Sub3) this).anIntArray9648[i_658_];
		float f = (class418.aFloatArray4768[2] * (float) i_659_
			   + class418.aFloatArray4768[6] * (float) i_660_
			   + class418.aFloatArray4768[10] * (float) i_661_
			   + class418.aFloatArray4768[14]);
		float f_662_ = (class418.aFloatArray4768[3] * (float) i_659_
				+ class418.aFloatArray4768[7] * (float) i_660_
				+ class418.aFloatArray4768[11] * (float) i_661_
				+ class418.aFloatArray4768[15]);
		if (f >= -f_662_) {
		    float f_663_
			= (class418.aFloatArray4768[0] * (float) i_659_
			   + class418.aFloatArray4768[4] * (float) i_660_
			   + class418.aFloatArray4768[8] * (float) i_661_
			   + class418.aFloatArray4768[12]);
		    float f_664_
			= (class418.aFloatArray4768[1] * (float) i_659_
			   + class418.aFloatArray4768[5] * (float) i_660_
			   + class418.aFloatArray4768[9] * (float) i_661_
			   + class418.aFloatArray4768[13]);
		    int i_665_ = ((Class157_Sub3) this).anIntArray9660[i_658_];
		    int i_666_
			= ((Class157_Sub3) this).anIntArray9660[i_658_ + 1];
		    for (int i_667_ = i_665_;
			 (i_667_ < i_666_
			  && (((Class157_Sub3) this).aShortArray9682[i_667_]
			      != 0));
			 i_667_++) {
			int i_668_
			    = ((((Class157_Sub3) this).aShortArray9682[i_667_]
				& 0xffff)
			       - 1);
			is[i_668_]
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9607)
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9493
					* f_663_ / f_662_));
			is_657_[i_668_]
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9494)
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9534
					* f_664_ / f_662_));
		    }
		} else {
		    int i_669_ = ((Class157_Sub3) this).anIntArray9660[i_658_];
		    int i_670_
			= ((Class157_Sub3) this).anIntArray9660[i_658_ + 1];
		    for (int i_671_ = i_669_;
			 (i_671_ < i_670_
			  && (((Class157_Sub3) this).aShortArray9682[i_671_]
			      != 0));
			 i_671_++) {
			int i_672_
			    = ((((Class157_Sub3) this).aShortArray9682[i_671_]
				& 0xffff)
			       - 1);
			is[i_672_] = -999999;
		    }
		}
	    }
	    for (int i_673_ = 0; i_673_ < ((Class157_Sub3) this).anInt9651;
		 i_673_++) {
		if (is[(((Class157_Sub3) this).aShortArray9655[i_673_]
			& 0xffff)] != -999999
		    && is[(((Class157_Sub3) this).aShortArray9638[i_673_]
			   & 0xffff)] != -999999
		    && is[(((Class157_Sub3) this).aShortArray9657[i_673_]
			   & 0xffff)] != -999999
		    && method8895(i, i_629_,
				  is_657_[(((Class157_Sub3) this)
					   .aShortArray9655[i_673_]) & 0xffff],
				  is_657_[(((Class157_Sub3) this)
					   .aShortArray9638[i_673_]) & 0xffff],
				  is_657_[(((Class157_Sub3) this)
					   .aShortArray9657[i_673_]) & 0xffff],
				  is[(((Class157_Sub3) this).aShortArray9655
				      [i_673_]) & 0xffff],
				  is[(((Class157_Sub3) this).aShortArray9638
				      [i_673_]) & 0xffff],
				  is[(((Class157_Sub3) this).aShortArray9657
				      [i_673_]) & 0xffff]))
		    return true;
	    }
	}
	return false;
    }
    
    public Class528_Sub21_Sub12 method1899
	(Class528_Sub21_Sub12 class528_sub21_sub12) {
	if (((Class157_Sub3) this).anInt9623 == 0)
	    return null;
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	int i;
	int i_674_;
	if ((((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
	     .anInt9508)
	    > 0) {
	    i = ((((Class157_Sub3) this).aShort9674
		  - ((((Class157_Sub3) this).aShort9693
		      * ((Class173_Sub2)
			 ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9508)
		     >> 8))
		 >> ((Class173_Sub2)
		     ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9438);
	    i_674_
		= ((((Class157_Sub3) this).aShort9688
		    - ((((Class157_Sub3) this).aShort9670
			* ((Class173_Sub2) (((Class157_Sub3) this)
					    .aClass173_Sub2_9628)).anInt9508)
		       >> 8))
		   >> ((Class173_Sub2)
		       ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9438);
	} else {
	    i = ((((Class157_Sub3) this).aShort9674
		  - ((((Class157_Sub3) this).aShort9670
		      * ((Class173_Sub2)
			 ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9508)
		     >> 8))
		 >> ((Class173_Sub2)
		     ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9438);
	    i_674_
		= ((((Class157_Sub3) this).aShort9688
		    - ((((Class157_Sub3) this).aShort9693
			* ((Class173_Sub2) (((Class157_Sub3) this)
					    .aClass173_Sub2_9628)).anInt9508)
		       >> 8))
		   >> ((Class173_Sub2)
		       ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9438);
	}
	int i_675_;
	int i_676_;
	if ((((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
	     .anInt9462)
	    > 0) {
	    i_675_
		= ((((Class157_Sub3) this).aShort9676
		    - ((((Class157_Sub3) this).aShort9693
			* ((Class173_Sub2) (((Class157_Sub3) this)
					    .aClass173_Sub2_9628)).anInt9462)
		       >> 8))
		   >> ((Class173_Sub2)
		       ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9438);
	    i_676_
		= ((((Class157_Sub3) this).aShort9644
		    - ((((Class157_Sub3) this).aShort9670
			* ((Class173_Sub2) (((Class157_Sub3) this)
					    .aClass173_Sub2_9628)).anInt9462)
		       >> 8))
		   >> ((Class173_Sub2)
		       ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9438);
	} else {
	    i_675_
		= ((((Class157_Sub3) this).aShort9676
		    - ((((Class157_Sub3) this).aShort9670
			* ((Class173_Sub2) (((Class157_Sub3) this)
					    .aClass173_Sub2_9628)).anInt9462)
		       >> 8))
		   >> ((Class173_Sub2)
		       ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9438);
	    i_676_
		= ((((Class157_Sub3) this).aShort9644
		    - ((((Class157_Sub3) this).aShort9693
			* ((Class173_Sub2) (((Class157_Sub3) this)
					    .aClass173_Sub2_9628)).anInt9462)
		       >> 8))
		   >> ((Class173_Sub2)
		       ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9438);
	}
	int i_677_ = i_674_ - i + 1;
	int i_678_ = i_676_ - i_675_ + 1;
	Class528_Sub21_Sub12_Sub2 class528_sub21_sub12_sub2
	    = (Class528_Sub21_Sub12_Sub2) class528_sub21_sub12;
	Class528_Sub21_Sub12_Sub2 class528_sub21_sub12_sub2_679_;
	if (class528_sub21_sub12_sub2 != null
	    && class528_sub21_sub12_sub2.method10873(i_677_, i_678_)) {
	    class528_sub21_sub12_sub2_679_ = class528_sub21_sub12_sub2;
	    class528_sub21_sub12_sub2_679_.method10875();
	} else
	    class528_sub21_sub12_sub2_679_
		= new Class528_Sub21_Sub12_Sub2((((Class157_Sub3) this)
						 .aClass173_Sub2_9628),
						i_677_, i_678_);
	class528_sub21_sub12_sub2_679_.method10866(i, i_675_, i_674_, i_676_);
	method8894(class528_sub21_sub12_sub2_679_);
	return class528_sub21_sub12_sub2_679_;
    }
    
    public int method1992() {
	return ((Class157_Sub3) this).aShort9632;
    }
    
    public void method1897(Class433 class433, Class159 class159, int i) {
	if ((i & 0x2) != 0)
	    OpenGL.glPolygonMode(1032, 6913);
	if (((Class157_Sub3) this).anInt9623 != 0) {
	    Class418 class418
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .aClass418_9533);
	    Class418 class418_680_
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .aClass418_9501);
	    Class418 class418_681_
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .aClass418_9502);
	    class418_680_.method5035(class433);
	    class418_681_.method4986(class418_680_);
	    class418_681_.method4974(((Class173_Sub2) (((Class157_Sub3) this)
						       .aClass173_Sub2_9628))
				     .aClass418_9489);
	    if (!((Class157_Sub3) this).aBool9649)
		method8893();
	    float[] fs
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .aFloatArray9467);
	    class418_680_.method5030(0.0F,
				     (float) ((Class157_Sub3) this).aShort9670,
				     0.0F, fs);
	    float f = fs[0];
	    float f_682_ = fs[1];
	    float f_683_ = fs[2];
	    class418_680_.method5030(0.0F,
				     (float) ((Class157_Sub3) this).aShort9693,
				     0.0F, fs);
	    float f_684_ = fs[0];
	    float f_685_ = fs[1];
	    float f_686_ = fs[2];
	    for (int i_687_ = 0; i_687_ < 6; i_687_++) {
		float[] fs_688_ = (((Class173_Sub2)
				    ((Class157_Sub3) this).aClass173_Sub2_9628)
				   .aFloatArrayArray9490[i_687_]);
		float f_689_ = (fs_688_[0] * f + fs_688_[1] * f_682_
				+ fs_688_[2] * f_683_ + fs_688_[3]
				+ (float) ((Class157_Sub3) this).anInt9681);
		float f_690_ = (fs_688_[0] * f_684_ + fs_688_[1] * f_685_
				+ fs_688_[2] * f_686_ + fs_688_[3]
				+ (float) ((Class157_Sub3) this).anInt9681);
		if (f_689_ < 0.0F && f_690_ < 0.0F)
		    return;
	    }
	    if (class159 != null) {
		boolean bool = false;
		boolean bool_691_ = true;
		int i_692_ = ((((Class157_Sub3) this).aShort9674
			       + ((Class157_Sub3) this).aShort9688)
			      >> 1);
		int i_693_ = ((((Class157_Sub3) this).aShort9676
			       + ((Class157_Sub3) this).aShort9644)
			      >> 1);
		int i_694_ = i_692_;
		short i_695_ = ((Class157_Sub3) this).aShort9670;
		int i_696_ = i_693_;
		float f_697_
		    = (class418_681_.aFloatArray4768[0] * (float) i_694_
		       + class418_681_.aFloatArray4768[4] * (float) i_695_
		       + class418_681_.aFloatArray4768[8] * (float) i_696_
		       + class418_681_.aFloatArray4768[12]);
		float f_698_
		    = (class418_681_.aFloatArray4768[1] * (float) i_694_
		       + class418_681_.aFloatArray4768[5] * (float) i_695_
		       + class418_681_.aFloatArray4768[9] * (float) i_696_
		       + class418_681_.aFloatArray4768[13]);
		float f_699_
		    = (class418_681_.aFloatArray4768[2] * (float) i_694_
		       + class418_681_.aFloatArray4768[6] * (float) i_695_
		       + class418_681_.aFloatArray4768[10] * (float) i_696_
		       + class418_681_.aFloatArray4768[14]);
		float f_700_
		    = (class418_681_.aFloatArray4768[3] * (float) i_694_
		       + class418_681_.aFloatArray4768[7] * (float) i_695_
		       + class418_681_.aFloatArray4768[11] * (float) i_696_
		       + class418_681_.aFloatArray4768[15]);
		if (f_699_ >= -f_700_) {
		    class159.anInt1748
			= (int) ((((Class173_Sub2)
				   ((Class157_Sub3) this).aClass173_Sub2_9628)
				  .aFloat9607)
				 + (((Class173_Sub2) (((Class157_Sub3) this)
						      .aClass173_Sub2_9628))
				    .aFloat9493) * f_697_ / f_700_);
		    class159.anInt1750
			= (int) ((((Class173_Sub2)
				   ((Class157_Sub3) this).aClass173_Sub2_9628)
				  .aFloat9494)
				 + (((Class173_Sub2) (((Class157_Sub3) this)
						      .aClass173_Sub2_9628))
				    .aFloat9534) * f_698_ / f_700_);
		} else
		    bool = true;
		i_694_ = i_692_;
		i_695_ = ((Class157_Sub3) this).aShort9693;
		i_696_ = i_693_;
		float f_701_
		    = (class418_681_.aFloatArray4768[0] * (float) i_694_
		       + class418_681_.aFloatArray4768[4] * (float) i_695_
		       + class418_681_.aFloatArray4768[8] * (float) i_696_
		       + class418_681_.aFloatArray4768[12]);
		float f_702_
		    = (class418_681_.aFloatArray4768[1] * (float) i_694_
		       + class418_681_.aFloatArray4768[5] * (float) i_695_
		       + class418_681_.aFloatArray4768[9] * (float) i_696_
		       + class418_681_.aFloatArray4768[13]);
		float f_703_
		    = (class418_681_.aFloatArray4768[2] * (float) i_694_
		       + class418_681_.aFloatArray4768[6] * (float) i_695_
		       + class418_681_.aFloatArray4768[10] * (float) i_696_
		       + class418_681_.aFloatArray4768[14]);
		float f_704_
		    = (class418_681_.aFloatArray4768[3] * (float) i_694_
		       + class418_681_.aFloatArray4768[7] * (float) i_695_
		       + class418_681_.aFloatArray4768[11] * (float) i_696_
		       + class418_681_.aFloatArray4768[15]);
		if (f_703_ >= -f_704_) {
		    class159.anInt1749
			= (int) ((((Class173_Sub2)
				   ((Class157_Sub3) this).aClass173_Sub2_9628)
				  .aFloat9607)
				 + (((Class173_Sub2) (((Class157_Sub3) this)
						      .aClass173_Sub2_9628))
				    .aFloat9493) * f_701_ / f_704_);
		    class159.anInt1752
			= (int) ((((Class173_Sub2)
				   ((Class157_Sub3) this).aClass173_Sub2_9628)
				  .aFloat9494)
				 + (((Class173_Sub2) (((Class157_Sub3) this)
						      .aClass173_Sub2_9628))
				    .aFloat9534) * f_702_ / f_704_);
		} else
		    bool = true;
		if (bool) {
		    if (f_699_ < -f_700_ && f_703_ < -f_704_)
			bool_691_ = false;
		    else if (f_699_ < -f_700_) {
			float f_705_
			    = (f_699_ + f_700_) / (f_703_ + f_704_) - 1.0F;
			float f_706_ = f_697_ + f_705_ * (f_701_ - f_697_);
			float f_707_ = f_698_ + f_705_ * (f_702_ - f_698_);
			float f_708_ = f_700_ + f_705_ * (f_704_ - f_700_);
			class159.anInt1748
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9607)
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9493
					* f_706_ / f_708_));
			class159.anInt1750
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9494)
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9534
					* f_707_ / f_708_));
		    } else if (f_703_ < -f_704_) {
			float f_709_
			    = (f_703_ + f_704_) / (f_699_ + f_700_) - 1.0F;
			float f_710_ = f_701_ + f_709_ * (f_697_ - f_701_);
			float f_711_ = f_702_ + f_709_ * (f_698_ - f_702_);
			float f_712_ = f_704_ + f_709_ * (f_700_ - f_704_);
			class159.anInt1749
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9607)
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9493
					* f_710_ / f_712_));
			class159.anInt1752
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9494)
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9534
					* f_711_ / f_712_));
		    }
		}
		if (bool_691_) {
		    if (f_699_ / f_700_ > f_703_ / f_704_) {
			float f_713_
			    = (f_697_
			       + (class418.aFloatArray4768[0]
				  * (float) ((Class157_Sub3) this).anInt9681)
			       + class418.aFloatArray4768[12]);
			float f_714_
			    = (f_700_
			       + (class418.aFloatArray4768[3]
				  * (float) ((Class157_Sub3) this).anInt9681)
			       + class418.aFloatArray4768[15]);
			class159.anInt1753
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9607)
				     - (float) class159.anInt1748
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9493
					* f_713_ / f_714_));
		    } else {
			float f_715_
			    = (f_701_
			       + (class418.aFloatArray4768[0]
				  * (float) ((Class157_Sub3) this).anInt9681)
			       + class418.aFloatArray4768[12]);
			float f_716_
			    = (f_704_
			       + (class418.aFloatArray4768[3]
				  * (float) ((Class157_Sub3) this).anInt9681)
			       + class418.aFloatArray4768[15]);
			class159.anInt1753
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9607)
				     - (float) class159.anInt1749
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9493
					* f_715_ / f_716_));
		    }
		    class159.aBool1751 = true;
		}
	    }
	    ((Class157_Sub3) this).aClass173_Sub2_9628.method8772();
	    ((Class157_Sub3) this).aClass173_Sub2_9628
		.method8752(class418_680_);
	    method8887();
	    ((Class157_Sub3) this).aClass173_Sub2_9628.method8760();
	    class418_680_.method4974(((Class173_Sub2) (((Class157_Sub3) this)
						       .aClass173_Sub2_9628))
				     .aClass418_9485);
	    method8888(class418_680_);
	    if ((i & 0x2) != 0)
		OpenGL.glPolygonMode(1028, 6914);
	}
    }
    
    void method8887() {
	if (((Class157_Sub3) this).anInt9652 != 0) {
	    if (((Class157_Sub3) this).aByte9669 != 0)
		method8892(true);
	    method8892(false);
	    if (((Class157_Sub3) this).aClass129_9665 != null) {
		if ((((Class129) ((Class157_Sub3) this).aClass129_9665)
		     .anInterface16_1588)
		    == null)
		    method8889((((Class157_Sub3) this).aByte9669 & 0x10) != 0);
		if ((((Class129) ((Class157_Sub3) this).aClass129_9665)
		     .anInterface16_1588)
		    != null) {
		    ((Class157_Sub3) this).aClass173_Sub2_9628.method8784
			(((Class157_Sub3) this).aClass122_9663 != null);
		    ((Class157_Sub3) this).aClass173_Sub2_9628.method8779
			(((Class157_Sub3) this).aClass122_9661,
			 ((Class157_Sub3) this).aClass122_9663,
			 ((Class157_Sub3) this).aClass122_9662,
			 ((Class157_Sub3) this).aClass122_9686);
		    int i = ((Class157_Sub3) this).anIntArray9680.length - 1;
		    for (int i_717_ = 0; i_717_ < i; i_717_++) {
			int i_718_
			    = ((Class157_Sub3) this).anIntArray9680[i_717_];
			int i_719_ = (((Class157_Sub3) this).anIntArray9680
				      [i_717_ + 1]);
			int i_720_
			    = ((((Class157_Sub3) this).aShortArray9658[i_718_]
				== -1)
			       ? -1
			       : (((Class157_Sub3) this).aShortArray9658
				  [i_718_]) & 0xffff);
			((Class157_Sub3) this).aClass173_Sub2_9628.method8773
			    (i_720_,
			     ((Class157_Sub3) this).aClass122_9663 != null);
			((Class157_Sub3) this).aClass173_Sub2_9628.method8769
			    (((Class129) (((Class157_Sub3) this)
					  .aClass129_9665)).anInterface16_1588,
			     4, i_718_ * 3, (i_719_ - i_718_) * 3);
		    }
		}
	    }
	    method8886();
	}
    }
    
    void method8888(Class418 class418) {
	if (((Class157_Sub3) this).aClass145Array9684 != null) {
	    Class418 class418_721_
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .aClass418_9452);
	    ((Class157_Sub3) this).aClass173_Sub2_9628.method8799();
	    ((Class157_Sub3) this).aClass173_Sub2_9628
		.method2283(!((Class157_Sub3) this).aBool9634);
	    ((Class157_Sub3) this).aClass173_Sub2_9628.method8784(false);
	    ((Class157_Sub3) this).aClass173_Sub2_9628.method8779
		((((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		  .aClass122_9442),
		 null, null,
		 (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		  .aClass122_9461));
	    for (int i = 0; i < ((Class157_Sub3) this).anInt9685; i++) {
		Class145 class145
		    = ((Class157_Sub3) this).aClass145Array9684[i];
		Class113 class113
		    = ((Class157_Sub3) this).aClass113Array9687[i];
		if (!((Class145) class145).aBool1652
		    || !((Class157_Sub3) this).aClass173_Sub2_9628
			    .method2271()) {
		    float f
			= ((float) ((((Class157_Sub3) this).anIntArray9679
				     [((Class145) class145).anInt1657])
				    + (((Class157_Sub3) this).anIntArray9679
				       [((Class145) class145).anInt1653])
				    + (((Class157_Sub3) this).anIntArray9679
				       [((Class145) class145).anInt1654]))
			   * 0.3333333F);
		    float f_722_
			= ((float) ((((Class157_Sub3) this).anIntArray9639
				     [((Class145) class145).anInt1657])
				    + (((Class157_Sub3) this).anIntArray9639
				       [((Class145) class145).anInt1653])
				    + (((Class157_Sub3) this).anIntArray9639
				       [((Class145) class145).anInt1654]))
			   * 0.3333333F);
		    float f_723_
			= ((float) ((((Class157_Sub3) this).anIntArray9648
				     [((Class145) class145).anInt1657])
				    + (((Class157_Sub3) this).anIntArray9648
				       [((Class145) class145).anInt1653])
				    + (((Class157_Sub3) this).anIntArray9648
				       [((Class145) class145).anInt1654]))
			   * 0.3333333F);
		    float f_724_ = (class418.aFloatArray4768[0] * f
				    + class418.aFloatArray4768[4] * f_722_
				    + class418.aFloatArray4768[8] * f_723_
				    + class418.aFloatArray4768[12]);
		    float f_725_ = (class418.aFloatArray4768[1] * f
				    + class418.aFloatArray4768[5] * f_722_
				    + class418.aFloatArray4768[9] * f_723_
				    + class418.aFloatArray4768[13]);
		    float f_726_ = (class418.aFloatArray4768[2] * f
				    + class418.aFloatArray4768[6] * f_722_
				    + class418.aFloatArray4768[10] * f_723_
				    + class418.aFloatArray4768[14]);
		    float f_727_
			= ((float) (1.0
				    / Math.sqrt((double) (f_724_ * f_724_
							  + f_725_ * f_725_
							  + f_726_ * f_726_)))
			   * (float) ((Class145) class145).anInt1661);
		    class418_721_.method5000
			(((Class113) class113).anInt1407,
			 (((Class113) class113).anInt1403
			  * ((Class145) class145).aShort1656) >> 7,
			 (((Class113) class113).anInt1404
			  * ((Class145) class145).aShort1660) >> 7,
			 (f_724_ + (float) ((Class113) class113).anInt1402
			  - f_724_ * f_727_),
			 (f_725_ + (float) ((Class113) class113).anInt1405
			  - f_725_ * f_727_),
			 f_726_ - f_726_ * f_727_);
		    ((Class157_Sub3) this).aClass173_Sub2_9628
			.method8859(class418_721_);
		    int i_728_ = ((Class113) class113).anInt1406;
		    OpenGL.glColor4ub((byte) (i_728_ >> 16),
				      (byte) (i_728_ >> 8), (byte) i_728_,
				      (byte) (i_728_ >> 24));
		    ((Class157_Sub3) this).aClass173_Sub2_9628
			.method8840(((Class145) class145).aShort1658);
		    ((Class157_Sub3) this).aClass173_Sub2_9628
			.method8788(((Class145) class145).aByte1659);
		    ((Class157_Sub3) this).aClass173_Sub2_9628.method8768(7, 0,
									  4);
		}
	    }
	    ((Class157_Sub3) this).aClass173_Sub2_9628.method2283(true);
	    ((Class157_Sub3) this).aClass173_Sub2_9628.method8760();
	}
    }
    
    void method8889(boolean bool) {
	if ((((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
	     .aClass528_Sub42_Sub1_9597.payload).length
	    < ((Class157_Sub3) this).anInt9652 * 6)
	    ((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		.aClass528_Sub42_Sub1_9597
		= new Class528_Sub42_Sub1((((Class157_Sub3) this).anInt9652
					   + 100) * 6);
	else
	    ((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		.aClass528_Sub42_Sub1_9597.pointer
		= 0;
	Class528_Sub42_Sub1 class528_sub42_sub1
	    = (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
	       .aClass528_Sub42_Sub1_9597);
	if (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
	    .aBool9561) {
	    for (int i = 0; i < ((Class157_Sub3) this).anInt9652; i++) {
		class528_sub42_sub1.method9717((((Class157_Sub3) this)
						.aShortArray9655[i]),
					       (byte) -37);
		class528_sub42_sub1.method9717((((Class157_Sub3) this)
						.aShortArray9638[i]),
					       (byte) 84);
		class528_sub42_sub1.method9717((((Class157_Sub3) this)
						.aShortArray9657[i]),
					       (byte) -15);
	    }
	} else {
	    for (int i = 0; i < ((Class157_Sub3) this).anInt9652; i++) {
		class528_sub42_sub1.writeLEShort((((Class157_Sub3) this)
						.aShortArray9655[i]),
					       -1102718643);
		class528_sub42_sub1.writeLEShort((((Class157_Sub3) this)
						.aShortArray9638[i]),
					       -1102718643);
		class528_sub42_sub1.writeLEShort((((Class157_Sub3) this)
						.aShortArray9657[i]),
					       -1102718643);
	    }
	}
	if (class528_sub42_sub1.pointer * -185904669 != 0) {
	    if (bool) {
		if (((Class157_Sub3) this).anInterface16_9643 == null)
		    ((Class157_Sub3) this).anInterface16_9643
			= (((Class157_Sub3) this).aClass173_Sub2_9628
			       .method8815
			   (5123, class528_sub42_sub1.payload,
			    class528_sub42_sub1.pointer * -185904669,
			    true));
		else
		    ((Class157_Sub3) this).anInterface16_9643.method85
			(5123, class528_sub42_sub1.payload,
			 class528_sub42_sub1.pointer * -185904669);
		((Class129) ((Class157_Sub3) this).aClass129_9665)
		    .anInterface16_1588
		    = ((Class157_Sub3) this).anInterface16_9643;
	    } else
		((Class129) ((Class157_Sub3) this).aClass129_9665)
		    .anInterface16_1588
		    = (((Class157_Sub3) this).aClass173_Sub2_9628.method8815
		       (5123, class528_sub42_sub1.payload,
			class528_sub42_sub1.pointer * -185904669, false));
	    if (!bool)
		((Class157_Sub3) this).aBool9668 = true;
	}
    }
    
    public int method2004() {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	return ((Class157_Sub3) this).aShort9644;
    }
    
    public void method1989(int i) {
	((Class157_Sub3) this).aShort9633 = (short) i;
	if (((Class157_Sub3) this).aClass122_9662 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9662)
		.anInterface14_1542
		= null;
	if (((Class157_Sub3) this).aClass122_9663 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9663)
		.anInterface14_1542
		= null;
    }
    
    static final int method8890(int i, int i_729_) {
	i_729_ = i_729_ * (i & 0x7f) >> 7;
	if (i_729_ < 2)
	    i_729_ = 2;
	else if (i_729_ > 126)
	    i_729_ = 126;
	return (i & 0xff80) + i_729_;
    }
    
    static {
	anIntArray9675 = new int[8];
	anIntArray9692 = new int[8];
	anIntArray9656 = new int[8];
    }
    
    public void method1925(Class157 class157, int i, int i_730_, int i_731_,
			   boolean bool) {
	Class157_Sub3 class157_sub3_732_ = (Class157_Sub3) class157;
	if (((Class157_Sub3) this).anInt9651 != 0
	    && ((Class157_Sub3) class157_sub3_732_).anInt9651 != 0) {
	    int i_733_ = ((Class157_Sub3) class157_sub3_732_).anInt9637;
	    int[] is = ((Class157_Sub3) class157_sub3_732_).anIntArray9679;
	    int[] is_734_
		= ((Class157_Sub3) class157_sub3_732_).anIntArray9639;
	    int[] is_735_
		= ((Class157_Sub3) class157_sub3_732_).anIntArray9648;
	    short[] is_736_
		= ((Class157_Sub3) class157_sub3_732_).aShortArray9673;
	    short[] is_737_
		= ((Class157_Sub3) class157_sub3_732_).aShortArray9645;
	    short[] is_738_
		= ((Class157_Sub3) class157_sub3_732_).aShortArray9646;
	    byte[] is_739_
		= ((Class157_Sub3) class157_sub3_732_).aByteArray9647;
	    short[] is_740_;
	    short[] is_741_;
	    short[] is_742_;
	    byte[] is_743_;
	    if (((Class157_Sub3) this).aClass143_9671 != null) {
		is_740_ = (((Class143) ((Class157_Sub3) this).aClass143_9671)
			   .aShortArray1644);
		is_741_ = (((Class143) ((Class157_Sub3) this).aClass143_9671)
			   .aShortArray1642);
		is_742_ = (((Class143) ((Class157_Sub3) this).aClass143_9671)
			   .aShortArray1643);
		is_743_ = (((Class143) ((Class157_Sub3) this).aClass143_9671)
			   .aByteArray1641);
	    } else {
		is_740_ = null;
		is_741_ = null;
		is_742_ = null;
		is_743_ = null;
	    }
	    short[] is_744_;
	    short[] is_745_;
	    short[] is_746_;
	    byte[] is_747_;
	    if (((Class157_Sub3) class157_sub3_732_).aClass143_9671 != null) {
		is_744_ = ((Class143) (((Class157_Sub3) class157_sub3_732_)
				       .aClass143_9671)).aShortArray1644;
		is_745_ = ((Class143) (((Class157_Sub3) class157_sub3_732_)
				       .aClass143_9671)).aShortArray1642;
		is_746_ = ((Class143) (((Class157_Sub3) class157_sub3_732_)
				       .aClass143_9671)).aShortArray1643;
		is_747_ = ((Class143) (((Class157_Sub3) class157_sub3_732_)
				       .aClass143_9671)).aByteArray1641;
	    } else {
		is_744_ = null;
		is_745_ = null;
		is_746_ = null;
		is_747_ = null;
	    }
	    int[] is_748_
		= ((Class157_Sub3) class157_sub3_732_).anIntArray9660;
	    short[] is_749_
		= ((Class157_Sub3) class157_sub3_732_).aShortArray9682;
	    if (!((Class157_Sub3) class157_sub3_732_).aBool9649)
		class157_sub3_732_.method8893();
	    int i_750_ = ((Class157_Sub3) class157_sub3_732_).aShort9670;
	    int i_751_ = ((Class157_Sub3) class157_sub3_732_).aShort9693;
	    int i_752_ = ((Class157_Sub3) class157_sub3_732_).aShort9674;
	    int i_753_ = ((Class157_Sub3) class157_sub3_732_).aShort9688;
	    int i_754_ = ((Class157_Sub3) class157_sub3_732_).aShort9676;
	    int i_755_ = ((Class157_Sub3) class157_sub3_732_).aShort9644;
	    for (int i_756_ = 0; i_756_ < ((Class157_Sub3) this).anInt9637;
		 i_756_++) {
		int i_757_
		    = ((Class157_Sub3) this).anIntArray9639[i_756_] - i_730_;
		if (i_757_ >= i_750_ && i_757_ <= i_751_) {
		    int i_758_
			= ((Class157_Sub3) this).anIntArray9679[i_756_] - i;
		    if (i_758_ >= i_752_ && i_758_ <= i_753_) {
			int i_759_
			    = (((Class157_Sub3) this).anIntArray9648[i_756_]
			       - i_731_);
			if (i_759_ >= i_754_ && i_759_ <= i_755_) {
			    int i_760_ = -1;
			    int i_761_ = (((Class157_Sub3) this).anIntArray9660
					  [i_756_]);
			    int i_762_ = (((Class157_Sub3) this).anIntArray9660
					  [i_756_ + 1]);
			    for (int i_763_ = i_761_;
				 (i_763_ < i_762_
				  && (((Class157_Sub3) this).aShortArray9682
				      [i_763_]) != 0);
				 i_763_++) {
				i_760_ = ((((Class157_Sub3) this)
					   .aShortArray9682[i_763_])
					  & 0xffff) - 1;
				if ((((Class157_Sub3) this).aByteArray9647
				     [i_760_])
				    != 0)
				    break;
			    }
			    if (i_760_ != -1) {
				for (int i_764_ = 0; i_764_ < i_733_;
				     i_764_++) {
				    if (i_758_ == is[i_764_]
					&& i_759_ == is_735_[i_764_]
					&& i_757_ == is_734_[i_764_]) {
					int i_765_ = -1;
					i_761_ = is_748_[i_764_];
					i_762_ = is_748_[i_764_ + 1];
					for (int i_766_ = i_761_;
					     (i_766_ < i_762_
					      && is_749_[i_766_] != 0);
					     i_766_++) {
					    i_765_ = (is_749_[i_766_]
						      & 0xffff) - 1;
					    if (is_739_[i_765_] != 0)
						break;
					}
					if (i_765_ != -1) {
					    if (is_740_ == null) {
						((Class157_Sub3) this)
						    .aClass143_9671
						    = new Class143();
						is_740_
						    = ((Class143)
						       (((Class157_Sub3) this)
							.aClass143_9671))
							  .aShortArray1644
						    = (Class407.method4883
						       ((((Class157_Sub3) this)
							 .aShortArray9673),
							1071173469));
						is_741_
						    = ((Class143)
						       (((Class157_Sub3) this)
							.aClass143_9671))
							  .aShortArray1642
						    = (Class407.method4883
						       ((((Class157_Sub3) this)
							 .aShortArray9645),
							1071173469));
						is_742_
						    = ((Class143)
						       (((Class157_Sub3) this)
							.aClass143_9671))
							  .aShortArray1643
						    = (Class407.method4883
						       ((((Class157_Sub3) this)
							 .aShortArray9646),
							1071173469));
						is_743_
						    = ((Class143)
						       (((Class157_Sub3) this)
							.aClass143_9671))
							  .aByteArray1641
						    = (Class324.method4228
						       ((((Class157_Sub3) this)
							 .aByteArray9647),
							1265501816));
					    }
					    if (is_744_ == null) {
						Class143 class143
						    = (((Class157_Sub3)
							class157_sub3_732_)
							   .aClass143_9671
						       = new Class143());
						is_744_
						    = ((Class143) class143)
							  .aShortArray1644
						    = (Class407.method4883
						       (is_736_, 1071173469));
						is_745_
						    = ((Class143) class143)
							  .aShortArray1642
						    = (Class407.method4883
						       (is_737_, 1071173469));
						is_746_
						    = ((Class143) class143)
							  .aShortArray1643
						    = (Class407.method4883
						       (is_738_, 1071173469));
						is_747_
						    = ((Class143) class143)
							  .aByteArray1641
						    = (Class324.method4228
						       (is_739_, 1256151719));
					    }
					    short i_767_
						= (((Class157_Sub3) this)
						   .aShortArray9673[i_760_]);
					    short i_768_
						= (((Class157_Sub3) this)
						   .aShortArray9645[i_760_]);
					    short i_769_
						= (((Class157_Sub3) this)
						   .aShortArray9646[i_760_]);
					    byte i_770_
						= (((Class157_Sub3) this)
						   .aByteArray9647[i_760_]);
					    i_761_ = is_748_[i_764_];
					    i_762_ = is_748_[i_764_ + 1];
					    for (int i_771_ = i_761_;
						 i_771_ < i_762_; i_771_++) {
						int i_772_
						    = is_749_[i_771_] - 1;
						if (i_772_ == -1)
						    break;
						if (is_747_[i_772_] != 0) {
						    is_744_[i_772_] += i_767_;
						    is_745_[i_772_] += i_768_;
						    is_746_[i_772_] += i_769_;
						    is_747_[i_772_] += i_770_;
						}
					    }
					    i_767_ = is_736_[i_765_];
					    i_768_ = is_737_[i_765_];
					    i_769_ = is_738_[i_765_];
					    i_770_ = is_739_[i_765_];
					    i_761_ = (((Class157_Sub3) this)
						      .anIntArray9660[i_756_]);
					    i_762_ = (((Class157_Sub3) this)
						      .anIntArray9660
						      [i_756_ + 1]);
					    for (int i_773_ = i_761_;
						 (i_773_ < i_762_
						  && (((Class157_Sub3) this)
						      .aShortArray9682
						      [i_773_]) != 0);
						 i_773_++) {
						int i_774_
						    = (((((Class157_Sub3) this)
							 .aShortArray9682
							 [i_773_])
							& 0xffff)
						       - 1);
						if (is_743_[i_774_] != 0) {
						    is_740_[i_774_] += i_767_;
						    is_741_[i_774_] += i_768_;
						    is_742_[i_774_] += i_769_;
						    is_743_[i_774_] += i_770_;
						}
					    }
					    if ((((Class157_Sub3) this)
						 .aClass122_9663) == null
						&& (((Class157_Sub3) this)
						    .aClass122_9662) != null)
						((Class122)
						 (((Class157_Sub3) this)
						  .aClass122_9662))
						    .anInterface14_1542
						    = null;
					    if ((((Class157_Sub3) this)
						 .aClass122_9663)
						!= null)
						((Class122)
						 (((Class157_Sub3) this)
						  .aClass122_9663))
						    .anInterface14_1542
						    = null;
					    if ((((Class157_Sub3)
						  class157_sub3_732_)
						 .aClass122_9663) == null
						&& (((Class157_Sub3)
						     class157_sub3_732_)
						    .aClass122_9662) != null)
						((Class122)
						 (((Class157_Sub3)
						   class157_sub3_732_)
						  .aClass122_9662))
						    .anInterface14_1542
						    = null;
					    if ((((Class157_Sub3)
						  class157_sub3_732_)
						 .aClass122_9663)
						!= null)
						((Class122)
						 (((Class157_Sub3)
						   class157_sub3_732_)
						  .aClass122_9663))
						    .anInterface14_1542
						    = null;
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
    
    public Class157 method1926(byte i, int i_775_, boolean bool) {
	boolean bool_776_ = false;
	Class157_Sub3 class157_sub3_777_;
	Class157_Sub3 class157_sub3_778_;
	if (i > 0 && i <= 8) {
	    class157_sub3_778_
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .aClass157_Sub3Array9590[i - 1]);
	    class157_sub3_777_
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .aClass157_Sub3Array9488[i - 1]);
	    bool_776_ = true;
	} else
	    class157_sub3_777_ = class157_sub3_778_
		= new Class157_Sub3(((Class157_Sub3) this)
				    .aClass173_Sub2_9628);
	return method8885(class157_sub3_777_, class157_sub3_778_, i_775_,
			  bool_776_, bool);
    }
    
    public Class157 method1927(byte i, int i_779_, boolean bool) {
	boolean bool_780_ = false;
	Class157_Sub3 class157_sub3_781_;
	Class157_Sub3 class157_sub3_782_;
	if (i > 0 && i <= 8) {
	    class157_sub3_782_
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .aClass157_Sub3Array9590[i - 1]);
	    class157_sub3_781_
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .aClass157_Sub3Array9488[i - 1]);
	    bool_780_ = true;
	} else
	    class157_sub3_781_ = class157_sub3_782_
		= new Class157_Sub3(((Class157_Sub3) this)
				    .aClass173_Sub2_9628);
	return method8885(class157_sub3_781_, class157_sub3_782_, i_779_,
			  bool_780_, bool);
    }
    
    public int method2032() {
	return ((Class157_Sub3) this).anInt9629;
    }
    
    public int method1949() {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	return ((Class157_Sub3) this).aShort9676;
    }
    
    public void method1991(int i) {
	((Class157_Sub3) this).aShort9633 = (short) i;
	if (((Class157_Sub3) this).aClass122_9662 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9662)
		.anInterface14_1542
		= null;
	if (((Class157_Sub3) this).aClass122_9663 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9663)
		.anInterface14_1542
		= null;
    }
    
    public void method1986(int i) {
	((Class157_Sub3) this).aShort9632 = (short) i;
	if (((Class157_Sub3) this).aClass122_9662 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9662)
		.anInterface14_1542
		= null;
    }
    
    public void method1968(Class433 class433) {
	Class418 class418
	    = (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
	       .aClass418_9501);
	class418.method5035(class433);
	if (((Class157_Sub3) this).aClass170Array9683 != null) {
	    for (int i = 0;
		 i < ((Class157_Sub3) this).aClass170Array9683.length; i++) {
		Class170 class170
		    = ((Class157_Sub3) this).aClass170Array9683[i];
		Class170 class170_783_ = class170;
		if (class170.aClass170_1958 != null)
		    class170_783_ = class170.aClass170_1958;
		class170_783_.anInt1950
		    = ((int) (class418.aFloatArray4768[12]
			      + ((class418.aFloatArray4768[0]
				  * (float) (((Class157_Sub3) this)
					     .anIntArray9679
					     [(class170.anInt1946
					       * 1977387945)]))
				 + (class418.aFloatArray4768[4]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9639
					       [(class170.anInt1946
						 * 1977387945)]))
				 + (class418.aFloatArray4768[8]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9648
					       [(class170.anInt1946
						 * 1977387945)]))))
		       * -1626668665);
		class170_783_.anInt1951
		    = ((int) (class418.aFloatArray4768[13]
			      + ((class418.aFloatArray4768[1]
				  * (float) (((Class157_Sub3) this)
					     .anIntArray9679
					     [(class170.anInt1946
					       * 1977387945)]))
				 + (class418.aFloatArray4768[5]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9639
					       [(class170.anInt1946
						 * 1977387945)]))
				 + (class418.aFloatArray4768[9]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9648
					       [(class170.anInt1946
						 * 1977387945)]))))
		       * -1756604589);
		class170_783_.anInt1952
		    = (int) (class418.aFloatArray4768[14]
			     + ((class418.aFloatArray4768[2]
				 * (float) (((Class157_Sub3) this)
					    .anIntArray9679
					    [class170.anInt1946 * 1977387945]))
				+ (class418.aFloatArray4768[6]
				   * (float) (((Class157_Sub3) this)
					      .anIntArray9639
					      [(class170.anInt1946
						* 1977387945)]))
				+ (class418.aFloatArray4768[10]
				   * (float) (((Class157_Sub3) this)
					      .anIntArray9648
					      [(class170.anInt1946
						* 1977387945)])))) * 908623173;
		class170_783_.anInt1947
		    = ((int) (class418.aFloatArray4768[12]
			      + ((class418.aFloatArray4768[0]
				  * (float) (((Class157_Sub3) this)
					     .anIntArray9679
					     [(class170.anInt1945
					       * -1790775395)]))
				 + (class418.aFloatArray4768[4]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9639
					       [(class170.anInt1945
						 * -1790775395)]))
				 + (class418.aFloatArray4768[8]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9648
					       [(class170.anInt1945
						 * -1790775395)]))))
		       * -203979893);
		class170_783_.anInt1944
		    = ((int) (class418.aFloatArray4768[13]
			      + ((class418.aFloatArray4768[1]
				  * (float) (((Class157_Sub3) this)
					     .anIntArray9679
					     [(class170.anInt1945
					       * -1790775395)]))
				 + (class418.aFloatArray4768[5]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9639
					       [(class170.anInt1945
						 * -1790775395)]))
				 + (class418.aFloatArray4768[9]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9648
					       [(class170.anInt1945
						 * -1790775395)]))))
		       * 1630459257);
		class170_783_.anInt1955
		    = ((int) (class418.aFloatArray4768[14]
			      + ((class418.aFloatArray4768[2]
				  * (float) (((Class157_Sub3) this)
					     .anIntArray9679
					     [(class170.anInt1945
					       * -1790775395)]))
				 + (class418.aFloatArray4768[6]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9639
					       [(class170.anInt1945
						 * -1790775395)]))
				 + (class418.aFloatArray4768[10]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9648
					       [(class170.anInt1945
						 * -1790775395)]))))
		       * 1543452655);
		class170_783_.anInt1956
		    = (int) (class418.aFloatArray4768[12]
			     + ((class418.aFloatArray4768[0]
				 * (float) (((Class157_Sub3) this)
					    .anIntArray9679
					    [class170.anInt1948 * 248261743]))
				+ (class418.aFloatArray4768[4]
				   * (float) (((Class157_Sub3) this)
					      .anIntArray9639
					      [(class170.anInt1948
						* 248261743)]))
				+ (class418.aFloatArray4768[8]
				   * (float) (((Class157_Sub3) this)
					      .anIntArray9648
					      [(class170.anInt1948
						* 248261743)])))) * 271456581;
		class170_783_.anInt1953
		    = (int) (class418.aFloatArray4768[13]
			     + ((class418.aFloatArray4768[1]
				 * (float) (((Class157_Sub3) this)
					    .anIntArray9679
					    [class170.anInt1948 * 248261743]))
				+ (class418.aFloatArray4768[5]
				   * (float) (((Class157_Sub3) this)
					      .anIntArray9639
					      [(class170.anInt1948
						* 248261743)]))
				+ (class418.aFloatArray4768[9]
				   * (float) (((Class157_Sub3) this)
					      .anIntArray9648
					      [(class170.anInt1948
						* 248261743)])))) * 707964019;
		class170_783_.anInt1943
		    = (int) (class418.aFloatArray4768[14]
			     + ((class418.aFloatArray4768[2]
				 * (float) (((Class157_Sub3) this)
					    .anIntArray9679
					    [class170.anInt1948 * 248261743]))
				+ (class418.aFloatArray4768[6]
				   * (float) (((Class157_Sub3) this)
					      .anIntArray9639
					      [(class170.anInt1948
						* 248261743)]))
				+ (class418.aFloatArray4768[10]
				   * (float) (((Class157_Sub3) this)
					      .anIntArray9648
					      [(class170.anInt1948
						* 248261743)])))) * -674151113;
	    }
	}
	if (((Class157_Sub3) this).aClass144Array9664 != null) {
	    for (int i = 0;
		 i < ((Class157_Sub3) this).aClass144Array9664.length; i++) {
		Class144 class144
		    = ((Class157_Sub3) this).aClass144Array9664[i];
		Class144 class144_784_ = class144;
		if (class144.aClass144_1646 != null)
		    class144_784_ = class144.aClass144_1646;
		if (class144.aClass418_1645 != null)
		    class144.aClass418_1645.method4986(class418);
		else
		    class144.aClass418_1645 = new Class418(class418);
		class144_784_.anInt1648
		    = ((int) (class418.aFloatArray4768[12]
			      + ((class418.aFloatArray4768[0]
				  * (float) (((Class157_Sub3) this)
					     .anIntArray9679
					     [(class144.anInt1651
					       * 1842630443)]))
				 + (class418.aFloatArray4768[4]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9639
					       [(class144.anInt1651
						 * 1842630443)]))
				 + (class418.aFloatArray4768[8]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9648
					       [(class144.anInt1651
						 * 1842630443)]))))
		       * -1931908895);
		class144_784_.anInt1649
		    = ((int) (class418.aFloatArray4768[13]
			      + ((class418.aFloatArray4768[1]
				  * (float) (((Class157_Sub3) this)
					     .anIntArray9679
					     [(class144.anInt1651
					       * 1842630443)]))
				 + (class418.aFloatArray4768[5]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9639
					       [(class144.anInt1651
						 * 1842630443)]))
				 + (class418.aFloatArray4768[9]
				    * (float) (((Class157_Sub3) this)
					       .anIntArray9648
					       [(class144.anInt1651
						 * 1842630443)]))))
		       * -1055365151);
		class144_784_.anInt1650
		    = (int) (class418.aFloatArray4768[14]
			     + ((class418.aFloatArray4768[2]
				 * (float) (((Class157_Sub3) this)
					    .anIntArray9679
					    [class144.anInt1651 * 1842630443]))
				+ (class418.aFloatArray4768[6]
				   * (float) (((Class157_Sub3) this)
					      .anIntArray9639
					      [(class144.anInt1651
						* 1842630443)]))
				+ (class418.aFloatArray4768[10]
				   * (float) (((Class157_Sub3) this)
					      .anIntArray9648
					      [(class144.anInt1651
						* 1842630443)])))) * 870317833;
	    }
	}
    }
    
    public void method1908(int i) {
	((Class157_Sub3) this).anInt9629 = i;
	if (((Class157_Sub3) this).aClass143_9671 != null
	    && (((Class157_Sub3) this).anInt9629 & 0x10000) == 0) {
	    ((Class157_Sub3) this).aShortArray9673
		= (((Class143) ((Class157_Sub3) this).aClass143_9671)
		   .aShortArray1644);
	    ((Class157_Sub3) this).aShortArray9645
		= (((Class143) ((Class157_Sub3) this).aClass143_9671)
		   .aShortArray1642);
	    ((Class157_Sub3) this).aShortArray9646
		= (((Class143) ((Class157_Sub3) this).aClass143_9671)
		   .aShortArray1643);
	    ((Class157_Sub3) this).aByteArray9647
		= (((Class143) ((Class157_Sub3) this).aClass143_9671)
		   .aByteArray1641);
	    ((Class157_Sub3) this).aClass143_9671 = null;
	}
	((Class157_Sub3) this).aBool9668 = true;
	method8886();
    }
    
    public void method2026() {
	if (((Class157_Sub3) this).anInt9623 > 0
	    && ((Class157_Sub3) this).anInt9652 > 0) {
	    method8892(false);
	    if ((((Class157_Sub3) this).aByte9669 & 0x10) == 0
		&& (((Class129) ((Class157_Sub3) this).aClass129_9665)
		    .anInterface16_1588) == null)
		method8889(false);
	    method8886();
	}
    }
    
    void method2034() {
	/* empty */
    }
    
    public void method1941(int i) {
	int i_785_ = Class417.anIntArray4766[i];
	int i_786_ = Class417.anIntArray4767[i];
	for (int i_787_ = 0; i_787_ < ((Class157_Sub3) this).anInt9637;
	     i_787_++) {
	    int i_788_
		= ((((Class157_Sub3) this).anIntArray9639[i_787_] * i_785_
		    + ((Class157_Sub3) this).anIntArray9679[i_787_] * i_786_)
		   >> 14);
	    ((Class157_Sub3) this).anIntArray9639[i_787_]
		= ((((Class157_Sub3) this).anIntArray9639[i_787_] * i_786_
		    - ((Class157_Sub3) this).anIntArray9679[i_787_] * i_785_)
		   >> 14);
	    ((Class157_Sub3) this).anIntArray9679[i_787_] = i_788_;
	}
	if (((Class157_Sub3) this).aClass122_9661 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9661)
		.anInterface14_1542
		= null;
	((Class157_Sub3) this).aBool9649 = false;
    }
    
    public void method2015(int i) {
	int i_789_ = Class417.anIntArray4766[i];
	int i_790_ = Class417.anIntArray4767[i];
	for (int i_791_ = 0; i_791_ < ((Class157_Sub3) this).anInt9637;
	     i_791_++) {
	    int i_792_
		= ((((Class157_Sub3) this).anIntArray9648[i_791_] * i_789_
		    + ((Class157_Sub3) this).anIntArray9679[i_791_] * i_790_)
		   >> 14);
	    ((Class157_Sub3) this).anIntArray9648[i_791_]
		= ((((Class157_Sub3) this).anIntArray9648[i_791_] * i_790_
		    - ((Class157_Sub3) this).anIntArray9679[i_791_] * i_789_)
		   >> 14);
	    ((Class157_Sub3) this).anIntArray9679[i_791_] = i_792_;
	}
	if (((Class157_Sub3) this).aClass122_9661 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9661)
		.anInterface14_1542
		= null;
	((Class157_Sub3) this).aBool9649 = false;
    }
    
    public void method1972(int i) {
	int i_793_ = Class417.anIntArray4766[i];
	int i_794_ = Class417.anIntArray4767[i];
	for (int i_795_ = 0; i_795_ < ((Class157_Sub3) this).anInt9637;
	     i_795_++) {
	    int i_796_
		= ((((Class157_Sub3) this).anIntArray9648[i_795_] * i_793_
		    + ((Class157_Sub3) this).anIntArray9679[i_795_] * i_794_)
		   >> 14);
	    ((Class157_Sub3) this).anIntArray9648[i_795_]
		= ((((Class157_Sub3) this).anIntArray9648[i_795_] * i_794_
		    - ((Class157_Sub3) this).anIntArray9679[i_795_] * i_793_)
		   >> 14);
	    ((Class157_Sub3) this).anIntArray9679[i_795_] = i_796_;
	}
	if (((Class157_Sub3) this).aClass122_9661 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9661)
		.anInterface14_1542
		= null;
	((Class157_Sub3) this).aBool9649 = false;
    }
    
    public void method1939(int i) {
	int i_797_ = Class417.anIntArray4766[i];
	int i_798_ = Class417.anIntArray4767[i];
	for (int i_799_ = 0; i_799_ < ((Class157_Sub3) this).anInt9637;
	     i_799_++) {
	    int i_800_
		= ((((Class157_Sub3) this).anIntArray9648[i_799_] * i_797_
		    + ((Class157_Sub3) this).anIntArray9679[i_799_] * i_798_)
		   >> 14);
	    ((Class157_Sub3) this).anIntArray9648[i_799_]
		= ((((Class157_Sub3) this).anIntArray9648[i_799_] * i_798_
		    - ((Class157_Sub3) this).anIntArray9679[i_799_] * i_797_)
		   >> 14);
	    ((Class157_Sub3) this).anIntArray9679[i_799_] = i_800_;
	}
	for (int i_801_ = 0; i_801_ < ((Class157_Sub3) this).anInt9623;
	     i_801_++) {
	    int i_802_
		= ((((Class157_Sub3) this).aShortArray9646[i_801_] * i_797_
		    + ((Class157_Sub3) this).aShortArray9673[i_801_] * i_798_)
		   >> 14);
	    ((Class157_Sub3) this).aShortArray9646[i_801_]
		= (short) (((((Class157_Sub3) this).aShortArray9646[i_801_]
			     * i_798_)
			    - (((Class157_Sub3) this).aShortArray9673[i_801_]
			       * i_797_))
			   >> 14);
	    ((Class157_Sub3) this).aShortArray9673[i_801_] = (short) i_802_;
	}
	if (((Class157_Sub3) this).aClass122_9663 == null
	    && ((Class157_Sub3) this).aClass122_9662 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9662)
		.anInterface14_1542
		= null;
	if (((Class157_Sub3) this).aClass122_9663 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9663)
		.anInterface14_1542
		= null;
	if (((Class157_Sub3) this).aClass122_9661 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9661)
		.anInterface14_1542
		= null;
	((Class157_Sub3) this).aBool9649 = false;
    }
    
    boolean method1876() {
	if (((Class157_Sub3) this).anIntArrayArray9641 == null)
	    return false;
	for (int i = 0; i < ((Class157_Sub3) this).anInt9636; i++) {
	    ((Class157_Sub3) this).anIntArray9679[i] <<= 4;
	    ((Class157_Sub3) this).anIntArray9639[i] <<= 4;
	    ((Class157_Sub3) this).anIntArray9648[i] <<= 4;
	}
	anInt9694 = 0;
	anInt9695 = 0;
	anInt9696 = 0;
	return true;
    }
    
    public void method2007(int i, int i_803_, int i_804_, int i_805_) {
	for (int i_806_ = 0; i_806_ < ((Class157_Sub3) this).anInt9651;
	     i_806_++) {
	    int i_807_
		= ((Class157_Sub3) this).aShortArray9653[i_806_] & 0xffff;
	    int i_808_ = i_807_ >> 10 & 0x3f;
	    int i_809_ = i_807_ >> 7 & 0x7;
	    int i_810_ = i_807_ & 0x7f;
	    if (i != -1)
		i_808_ += (i - i_808_) * i_805_ >> 7;
	    if (i_803_ != -1)
		i_809_ += (i_803_ - i_809_) * i_805_ >> 7;
	    if (i_804_ != -1)
		i_810_ += (i_804_ - i_810_) * i_805_ >> 7;
	    ((Class157_Sub3) this).aShortArray9653[i_806_]
		= (short) (i_808_ << 10 | i_809_ << 7 | i_810_);
	}
	if (((Class157_Sub3) this).aClass145Array9684 != null) {
	    for (int i_811_ = 0; i_811_ < ((Class157_Sub3) this).anInt9685;
		 i_811_++) {
		Class145 class145
		    = ((Class157_Sub3) this).aClass145Array9684[i_811_];
		Class113 class113
		    = ((Class157_Sub3) this).aClass113Array9687[i_811_];
		((Class113) class113).anInt1406
		    = (((Class113) class113).anInt1406 & ~0xffffff
		       | ((Class649.anIntArray8420
			   [(((Class157_Sub3) this).aShortArray9653
			     [((Class145) class145).anInt1655]) & 0xffff])
			  & 0xffffff));
	    }
	}
	if (((Class157_Sub3) this).aClass122_9662 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9662)
		.anInterface14_1542
		= null;
    }
    
    public void method1942(int i) {
	int i_812_ = Class417.anIntArray4766[i];
	int i_813_ = Class417.anIntArray4767[i];
	for (int i_814_ = 0; i_814_ < ((Class157_Sub3) this).anInt9637;
	     i_814_++) {
	    int i_815_
		= ((((Class157_Sub3) this).anIntArray9639[i_814_] * i_812_
		    + ((Class157_Sub3) this).anIntArray9679[i_814_] * i_813_)
		   >> 14);
	    ((Class157_Sub3) this).anIntArray9639[i_814_]
		= ((((Class157_Sub3) this).anIntArray9639[i_814_] * i_813_
		    - ((Class157_Sub3) this).anIntArray9679[i_814_] * i_812_)
		   >> 14);
	    ((Class157_Sub3) this).anIntArray9679[i_814_] = i_815_;
	}
	if (((Class157_Sub3) this).aClass122_9661 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9661)
		.anInterface14_1542
		= null;
	((Class157_Sub3) this).aBool9649 = false;
    }
    
    public void method1995(int i) {
	int i_816_ = Class417.anIntArray4766[i];
	int i_817_ = Class417.anIntArray4767[i];
	for (int i_818_ = 0; i_818_ < ((Class157_Sub3) this).anInt9637;
	     i_818_++) {
	    int i_819_
		= ((((Class157_Sub3) this).anIntArray9639[i_818_] * i_816_
		    + ((Class157_Sub3) this).anIntArray9679[i_818_] * i_817_)
		   >> 14);
	    ((Class157_Sub3) this).anIntArray9639[i_818_]
		= ((((Class157_Sub3) this).anIntArray9639[i_818_] * i_817_
		    - ((Class157_Sub3) this).anIntArray9679[i_818_] * i_816_)
		   >> 14);
	    ((Class157_Sub3) this).anIntArray9679[i_818_] = i_819_;
	}
	if (((Class157_Sub3) this).aClass122_9661 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9661)
		.anInterface14_1542
		= null;
	((Class157_Sub3) this).aBool9649 = false;
    }
    
    public void method1944(int i) {
	int i_820_ = Class417.anIntArray4766[i];
	int i_821_ = Class417.anIntArray4767[i];
	for (int i_822_ = 0; i_822_ < ((Class157_Sub3) this).anInt9637;
	     i_822_++) {
	    int i_823_
		= ((((Class157_Sub3) this).anIntArray9639[i_822_] * i_820_
		    + ((Class157_Sub3) this).anIntArray9679[i_822_] * i_821_)
		   >> 14);
	    ((Class157_Sub3) this).anIntArray9639[i_822_]
		= ((((Class157_Sub3) this).anIntArray9639[i_822_] * i_821_
		    - ((Class157_Sub3) this).anIntArray9679[i_822_] * i_820_)
		   >> 14);
	    ((Class157_Sub3) this).anIntArray9679[i_822_] = i_823_;
	}
	if (((Class157_Sub3) this).aClass122_9661 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9661)
		.anInterface14_1542
		= null;
	((Class157_Sub3) this).aBool9649 = false;
    }
    
    public boolean method1920() {
	return ((Class157_Sub3) this).aBool9635;
    }
    
    public void method1914(short i, short i_824_) {
	for (int i_825_ = 0; i_825_ < ((Class157_Sub3) this).anInt9651;
	     i_825_++) {
	    if (((Class157_Sub3) this).aShortArray9653[i_825_] == i)
		((Class157_Sub3) this).aShortArray9653[i_825_] = i_824_;
	}
	if (((Class157_Sub3) this).aClass145Array9684 != null) {
	    for (int i_826_ = 0; i_826_ < ((Class157_Sub3) this).anInt9685;
		 i_826_++) {
		Class145 class145
		    = ((Class157_Sub3) this).aClass145Array9684[i_826_];
		Class113 class113
		    = ((Class157_Sub3) this).aClass113Array9687[i_826_];
		((Class113) class113).anInt1406
		    = (((Class113) class113).anInt1406 & ~0xffffff
		       | ((Class649.anIntArray8420
			   [(((Class157_Sub3) this).aShortArray9653
			     [((Class145) class145).anInt1655]) & 0xffff])
			  & 0xffffff));
	    }
	}
	if (((Class157_Sub3) this).aClass122_9662 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9662)
		.anInterface14_1542
		= null;
    }
    
    public void method1904(int i, int i_827_, Class137 class137,
			   Class137 class137_828_, int i_829_, int i_830_,
			   int i_831_) {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	int i_832_ = i_829_ + ((Class157_Sub3) this).aShort9674;
	int i_833_ = i_829_ + ((Class157_Sub3) this).aShort9688;
	int i_834_ = i_831_ + ((Class157_Sub3) this).aShort9676;
	int i_835_ = i_831_ + ((Class157_Sub3) this).aShort9644;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_832_ >= 0
		&& ((i_833_ + class137.anInt1628 * 2130003981
		     >> class137.anInt1625 * 1543345989)
		    < class137.anInt1627 * -657933437)
		&& i_834_ >= 0
		&& ((i_835_ + class137.anInt1628 * 2130003981
		     >> class137.anInt1625 * 1543345989)
		    < class137.anInt1626 * 1769495707))) {
	    if (i == 4 || i == 5) {
		if (class137_828_ == null
		    || (i_832_ < 0
			|| ((i_833_ + class137_828_.anInt1628 * 2130003981
			     >> class137_828_.anInt1625 * 1543345989)
			    >= class137_828_.anInt1627 * -657933437)
			|| i_834_ < 0
			|| ((i_835_ + class137_828_.anInt1628 * 2130003981
			     >> class137_828_.anInt1625 * 1543345989)
			    >= class137_828_.anInt1626 * 1769495707)))
		    return;
	    } else {
		i_832_ >>= class137.anInt1625 * 1543345989;
		i_833_ = (i_833_ + (class137.anInt1628 * 2130003981 - 1)
			  >> class137.anInt1625 * 1543345989);
		i_834_ >>= class137.anInt1625 * 1543345989;
		i_835_ = (i_835_ + (class137.anInt1628 * 2130003981 - 1)
			  >> class137.anInt1625 * 1543345989);
		if (class137.method1669(i_832_, i_834_, (byte) 0) == i_830_
		    && class137.method1669(i_833_, i_834_, (byte) 0) == i_830_
		    && class137.method1669(i_832_, i_835_, (byte) 0) == i_830_
		    && class137.method1669(i_833_, i_835_, (byte) 0) == i_830_)
		    return;
	    }
	    if (i == 1) {
		for (int i_836_ = 0; i_836_ < ((Class157_Sub3) this).anInt9637;
		     i_836_++)
		    ((Class157_Sub3) this).anIntArray9639[i_836_]
			= (((Class157_Sub3) this).anIntArray9639[i_836_]
			   + class137.method1657(((((Class157_Sub3) this)
						   .anIntArray9679[i_836_])
						  + i_829_),
						 ((((Class157_Sub3) this)
						   .anIntArray9648[i_836_])
						  + i_831_),
						 977692695)
			   - i_830_);
	    } else if (i == 2) {
		int i_837_ = ((Class157_Sub3) this).aShort9670;
		if (i_837_ == 0)
		    return;
		for (int i_838_ = 0; i_838_ < ((Class157_Sub3) this).anInt9637;
		     i_838_++) {
		    int i_839_ = (((Class157_Sub3) this).anIntArray9639[i_838_]
				  << 16) / i_837_;
		    if (i_839_ < i_827_)
			((Class157_Sub3) this).anIntArray9639[i_838_]
			    = (((Class157_Sub3) this).anIntArray9639[i_838_]
			       + (class137.method1657((((Class157_Sub3) this)
						       .anIntArray9679
						       [i_838_]) + i_829_,
						      (((Class157_Sub3) this)
						       .anIntArray9648
						       [i_838_]) + i_831_,
						      802172290)
				  - i_830_) * (i_827_ - i_839_) / i_827_);
		}
	    } else if (i == 3) {
		int i_840_ = (i_827_ & 0xff) * 4;
		int i_841_ = (i_827_ >> 8 & 0xff) * 4;
		int i_842_ = (i_827_ >> 16 & 0xff) << 6;
		int i_843_ = (i_827_ >> 24 & 0xff) << 6;
		if (i_829_ - (i_840_ >> 1) < 0
		    || ((i_829_ + (i_840_ >> 1)
			 + class137.anInt1628 * 2130003981)
			>= (class137.anInt1627 * -657933437
			    << class137.anInt1625 * 1543345989))
		    || i_831_ - (i_841_ >> 1) < 0
		    || ((i_831_ + (i_841_ >> 1)
			 + class137.anInt1628 * 2130003981)
			>= (class137.anInt1626 * 1769495707
			    << class137.anInt1625 * 1543345989)))
		    return;
		method1884(class137, i_829_, i_830_, i_831_, i_840_, i_841_,
			   i_842_, i_843_);
	    } else if (i == 4) {
		int i_844_ = (((Class157_Sub3) this).aShort9693
			      - ((Class157_Sub3) this).aShort9670);
		for (int i_845_ = 0; i_845_ < ((Class157_Sub3) this).anInt9637;
		     i_845_++)
		    ((Class157_Sub3) this).anIntArray9639[i_845_]
			= (((Class157_Sub3) this).anIntArray9639[i_845_]
			   + (class137_828_.method1657((((Class157_Sub3) this)
							.anIntArray9679
							[i_845_]) + i_829_,
						       (((Class157_Sub3) this)
							.anIntArray9648
							[i_845_]) + i_831_,
						       1591775549)
			      - i_830_)
			   + i_844_);
	    } else if (i == 5) {
		int i_846_ = (((Class157_Sub3) this).aShort9693
			      - ((Class157_Sub3) this).aShort9670);
		for (int i_847_ = 0; i_847_ < ((Class157_Sub3) this).anInt9637;
		     i_847_++) {
		    int i_848_ = (((Class157_Sub3) this).anIntArray9679[i_847_]
				  + i_829_);
		    int i_849_ = (((Class157_Sub3) this).anIntArray9648[i_847_]
				  + i_831_);
		    int i_850_
			= class137.method1657(i_848_, i_849_, 909073424);
		    int i_851_
			= class137_828_.method1657(i_848_, i_849_, 1708943951);
		    int i_852_ = i_850_ - i_851_ - i_827_;
		    ((Class157_Sub3) this).anIntArray9639[i_847_]
			= ((((Class157_Sub3) this).anIntArray9639[i_847_]
			    << 8) / i_846_ * i_852_
			   >> 8) - (i_830_ - i_850_);
		}
	    }
	    if (((Class157_Sub3) this).aClass122_9661 != null)
		((Class122) ((Class157_Sub3) this).aClass122_9661)
		    .anInterface14_1542
		    = null;
	    ((Class157_Sub3) this).aBool9649 = false;
	}
    }
    
    void method1938() {
	/* empty */
    }
    
    void method1933() {
	/* empty */
    }
    
    public void method1909() {
	if (!((Class157_Sub3) this).aBool9678) {
	    if (!((Class157_Sub3) this).aBool9649)
		method8893();
	    ((Class157_Sub3) this).aShort9672
		= ((Class157_Sub3) this).aShort9670;
	    ((Class157_Sub3) this).aBool9678 = true;
	}
    }
    
    void method1952() {
	/* empty */
    }
    
    boolean method1953() {
	if (((Class157_Sub3) this).anIntArrayArray9641 == null)
	    return false;
	for (int i = 0; i < ((Class157_Sub3) this).anInt9636; i++) {
	    ((Class157_Sub3) this).anIntArray9679[i] <<= 4;
	    ((Class157_Sub3) this).anIntArray9639[i] <<= 4;
	    ((Class157_Sub3) this).anIntArray9648[i] <<= 4;
	}
	anInt9694 = 0;
	anInt9695 = 0;
	anInt9696 = 0;
	return true;
    }
    
    public void method1998(byte i, byte[] is) {
	if (is == null) {
	    for (int i_853_ = 0; i_853_ < ((Class157_Sub3) this).anInt9651;
		 i_853_++)
		((Class157_Sub3) this).aByteArray9654[i_853_] = i;
	} else {
	    for (int i_854_ = 0; i_854_ < ((Class157_Sub3) this).anInt9651;
		 i_854_++) {
		int i_855_ = 255 - ((255 - (is[i_854_] & 0xff))
				    * (255 - (i & 0xff)) / 255);
		((Class157_Sub3) this).aByteArray9654[i_854_] = (byte) i_855_;
	    }
	}
	if (((Class157_Sub3) this).aClass122_9662 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9662)
		.anInterface14_1542
		= null;
    }
    
    boolean method1955() {
	if (((Class157_Sub3) this).anIntArrayArray9641 == null)
	    return false;
	for (int i = 0; i < ((Class157_Sub3) this).anInt9636; i++) {
	    ((Class157_Sub3) this).anIntArray9679[i] <<= 4;
	    ((Class157_Sub3) this).anIntArray9639[i] <<= 4;
	    ((Class157_Sub3) this).anIntArray9648[i] <<= 4;
	}
	anInt9694 = 0;
	anInt9695 = 0;
	anInt9696 = 0;
	return true;
    }
    
    void method1906() {
	for (int i = 0; i < ((Class157_Sub3) this).anInt9636; i++) {
	    ((Class157_Sub3) this).anIntArray9679[i]
		= ((Class157_Sub3) this).anIntArray9679[i] + 7 >> 4;
	    ((Class157_Sub3) this).anIntArray9639[i]
		= ((Class157_Sub3) this).anIntArray9639[i] + 7 >> 4;
	    ((Class157_Sub3) this).anIntArray9648[i]
		= ((Class157_Sub3) this).anIntArray9648[i] + 7 >> 4;
	}
	if (((Class157_Sub3) this).aClass122_9661 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9661)
		.anInterface14_1542
		= null;
	((Class157_Sub3) this).aBool9649 = false;
    }
    
    void method1918(int i, int[] is, int i_856_, int i_857_, int i_858_,
		    boolean bool, int i_859_, int[] is_860_) {
	int i_861_ = is.length;
	if (i == 0) {
	    i_856_ <<= 4;
	    i_857_ <<= 4;
	    i_858_ <<= 4;
	    int i_862_ = 0;
	    anInt9694 = 0;
	    anInt9695 = 0;
	    anInt9696 = 0;
	    for (int i_863_ = 0; i_863_ < i_861_; i_863_++) {
		int i_864_ = is[i_863_];
		if (i_864_
		    < ((Class157_Sub3) this).anIntArrayArray9641.length) {
		    int[] is_865_
			= ((Class157_Sub3) this).anIntArrayArray9641[i_864_];
		    for (int i_866_ = 0; i_866_ < is_865_.length; i_866_++) {
			int i_867_ = is_865_[i_866_];
			if (((Class157_Sub3) this).aShortArray9642 == null
			    || (i_859_ & (((Class157_Sub3) this)
					  .aShortArray9642[i_867_])) != 0) {
			    anInt9694 += (((Class157_Sub3) this).anIntArray9679
					  [i_867_]);
			    anInt9695 += (((Class157_Sub3) this).anIntArray9639
					  [i_867_]);
			    anInt9696 += (((Class157_Sub3) this).anIntArray9648
					  [i_867_]);
			    i_862_++;
			}
		    }
		}
	    }
	    if (i_862_ > 0) {
		anInt9694 = anInt9694 / i_862_ + i_856_;
		anInt9695 = anInt9695 / i_862_ + i_857_;
		anInt9696 = anInt9696 / i_862_ + i_858_;
		aBool9697 = true;
	    } else {
		anInt9694 = i_856_;
		anInt9695 = i_857_;
		anInt9696 = i_858_;
	    }
	} else if (i == 1) {
	    if (is_860_ != null) {
		int i_868_ = ((is_860_[0] * i_856_ + is_860_[1] * i_857_
			       + is_860_[2] * i_858_ + 8192)
			      >> 14);
		int i_869_ = ((is_860_[3] * i_856_ + is_860_[4] * i_857_
			       + is_860_[5] * i_858_ + 8192)
			      >> 14);
		int i_870_ = ((is_860_[6] * i_856_ + is_860_[7] * i_857_
			       + is_860_[8] * i_858_ + 8192)
			      >> 14);
		i_856_ = i_868_;
		i_857_ = i_869_;
		i_858_ = i_870_;
	    }
	    i_856_ <<= 4;
	    i_857_ <<= 4;
	    i_858_ <<= 4;
	    for (int i_871_ = 0; i_871_ < i_861_; i_871_++) {
		int i_872_ = is[i_871_];
		if (i_872_
		    < ((Class157_Sub3) this).anIntArrayArray9641.length) {
		    int[] is_873_
			= ((Class157_Sub3) this).anIntArrayArray9641[i_872_];
		    for (int i_874_ = 0; i_874_ < is_873_.length; i_874_++) {
			int i_875_ = is_873_[i_874_];
			if (((Class157_Sub3) this).aShortArray9642 == null
			    || (i_859_ & (((Class157_Sub3) this)
					  .aShortArray9642[i_875_])) != 0) {
			    ((Class157_Sub3) this).anIntArray9679[i_875_]
				+= i_856_;
			    ((Class157_Sub3) this).anIntArray9639[i_875_]
				+= i_857_;
			    ((Class157_Sub3) this).anIntArray9648[i_875_]
				+= i_858_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_860_ != null) {
		int i_876_ = is_860_[9] << 4;
		int i_877_ = is_860_[10] << 4;
		int i_878_ = is_860_[11] << 4;
		int i_879_ = is_860_[12] << 4;
		int i_880_ = is_860_[13] << 4;
		int i_881_ = is_860_[14] << 4;
		if (aBool9697) {
		    int i_882_
			= ((is_860_[0] * anInt9694 + is_860_[3] * anInt9695
			    + is_860_[6] * anInt9696 + 8192)
			   >> 14);
		    int i_883_
			= ((is_860_[1] * anInt9694 + is_860_[4] * anInt9695
			    + is_860_[7] * anInt9696 + 8192)
			   >> 14);
		    int i_884_
			= ((is_860_[2] * anInt9694 + is_860_[5] * anInt9695
			    + is_860_[8] * anInt9696 + 8192)
			   >> 14);
		    i_882_ += i_879_;
		    i_883_ += i_880_;
		    i_884_ += i_881_;
		    anInt9694 = i_882_;
		    anInt9695 = i_883_;
		    anInt9696 = i_884_;
		    aBool9697 = false;
		}
		int[] is_885_ = new int[9];
		int i_886_ = Class417.anIntArray4767[i_856_];
		int i_887_ = Class417.anIntArray4766[i_856_];
		int i_888_ = Class417.anIntArray4767[i_857_];
		int i_889_ = Class417.anIntArray4766[i_857_];
		int i_890_ = Class417.anIntArray4767[i_858_];
		int i_891_ = Class417.anIntArray4766[i_858_];
		int i_892_ = i_887_ * i_890_ + 8192 >> 14;
		int i_893_ = i_887_ * i_891_ + 8192 >> 14;
		is_885_[0] = i_888_ * i_890_ + i_889_ * i_893_ + 8192 >> 14;
		is_885_[1] = -i_888_ * i_891_ + i_889_ * i_892_ + 8192 >> 14;
		is_885_[2] = i_889_ * i_886_ + 8192 >> 14;
		is_885_[3] = i_886_ * i_891_ + 8192 >> 14;
		is_885_[4] = i_886_ * i_890_ + 8192 >> 14;
		is_885_[5] = -i_887_;
		is_885_[6] = -i_889_ * i_890_ + i_888_ * i_893_ + 8192 >> 14;
		is_885_[7] = i_889_ * i_891_ + i_888_ * i_892_ + 8192 >> 14;
		is_885_[8] = i_888_ * i_886_ + 8192 >> 14;
		int i_894_ = (is_885_[0] * -anInt9694 + is_885_[1] * -anInt9695
			      + is_885_[2] * -anInt9696 + 8192) >> 14;
		int i_895_ = (is_885_[3] * -anInt9694 + is_885_[4] * -anInt9695
			      + is_885_[5] * -anInt9696 + 8192) >> 14;
		int i_896_ = (is_885_[6] * -anInt9694 + is_885_[7] * -anInt9695
			      + is_885_[8] * -anInt9696 + 8192) >> 14;
		int i_897_ = i_894_ + anInt9694;
		int i_898_ = i_895_ + anInt9695;
		int i_899_ = i_896_ + anInt9696;
		int[] is_900_ = new int[9];
		for (int i_901_ = 0; i_901_ < 3; i_901_++) {
		    for (int i_902_ = 0; i_902_ < 3; i_902_++) {
			int i_903_ = 0;
			for (int i_904_ = 0; i_904_ < 3; i_904_++)
			    i_903_ += (is_885_[i_901_ * 3 + i_904_]
				       * is_860_[i_902_ * 3 + i_904_]);
			is_900_[i_901_ * 3 + i_902_] = i_903_ + 8192 >> 14;
		    }
		}
		int i_905_ = ((is_885_[0] * i_879_ + is_885_[1] * i_880_
			       + is_885_[2] * i_881_ + 8192)
			      >> 14);
		int i_906_ = ((is_885_[3] * i_879_ + is_885_[4] * i_880_
			       + is_885_[5] * i_881_ + 8192)
			      >> 14);
		int i_907_ = ((is_885_[6] * i_879_ + is_885_[7] * i_880_
			       + is_885_[8] * i_881_ + 8192)
			      >> 14);
		i_905_ += i_897_;
		i_906_ += i_898_;
		i_907_ += i_899_;
		int[] is_908_ = new int[9];
		for (int i_909_ = 0; i_909_ < 3; i_909_++) {
		    for (int i_910_ = 0; i_910_ < 3; i_910_++) {
			int i_911_ = 0;
			for (int i_912_ = 0; i_912_ < 3; i_912_++)
			    i_911_ += (is_860_[i_909_ * 3 + i_912_]
				       * is_900_[i_910_ + i_912_ * 3]);
			is_908_[i_909_ * 3 + i_910_] = i_911_ + 8192 >> 14;
		    }
		}
		int i_913_ = ((is_860_[0] * i_905_ + is_860_[1] * i_906_
			       + is_860_[2] * i_907_ + 8192)
			      >> 14);
		int i_914_ = ((is_860_[3] * i_905_ + is_860_[4] * i_906_
			       + is_860_[5] * i_907_ + 8192)
			      >> 14);
		int i_915_ = ((is_860_[6] * i_905_ + is_860_[7] * i_906_
			       + is_860_[8] * i_907_ + 8192)
			      >> 14);
		i_913_ += i_876_;
		i_914_ += i_877_;
		i_915_ += i_878_;
		for (int i_916_ = 0; i_916_ < i_861_; i_916_++) {
		    int i_917_ = is[i_916_];
		    if (i_917_
			< ((Class157_Sub3) this).anIntArrayArray9641.length) {
			int[] is_918_ = (((Class157_Sub3) this)
					 .anIntArrayArray9641[i_917_]);
			for (int i_919_ = 0; i_919_ < is_918_.length;
			     i_919_++) {
			    int i_920_ = is_918_[i_919_];
			    if (((Class157_Sub3) this).aShortArray9642 == null
				|| ((i_859_ & (((Class157_Sub3) this)
					       .aShortArray9642[i_920_]))
				    != 0)) {
				int i_921_
				    = (is_908_[0] * (((Class157_Sub3) this)
						     .anIntArray9679[i_920_])
				       + is_908_[1] * (((Class157_Sub3) this)
						       .anIntArray9639[i_920_])
				       + is_908_[2] * (((Class157_Sub3) this)
						       .anIntArray9648[i_920_])
				       + 8192) >> 14;
				int i_922_
				    = (is_908_[3] * (((Class157_Sub3) this)
						     .anIntArray9679[i_920_])
				       + is_908_[4] * (((Class157_Sub3) this)
						       .anIntArray9639[i_920_])
				       + is_908_[5] * (((Class157_Sub3) this)
						       .anIntArray9648[i_920_])
				       + 8192) >> 14;
				int i_923_
				    = (is_908_[6] * (((Class157_Sub3) this)
						     .anIntArray9679[i_920_])
				       + is_908_[7] * (((Class157_Sub3) this)
						       .anIntArray9639[i_920_])
				       + is_908_[8] * (((Class157_Sub3) this)
						       .anIntArray9648[i_920_])
				       + 8192) >> 14;
				i_921_ += i_913_;
				i_922_ += i_914_;
				i_923_ += i_915_;
				((Class157_Sub3) this).anIntArray9679[i_920_]
				    = i_921_;
				((Class157_Sub3) this).anIntArray9639[i_920_]
				    = i_922_;
				((Class157_Sub3) this).anIntArray9648[i_920_]
				    = i_923_;
			    }
			}
		    }
		}
	    } else {
		for (int i_924_ = 0; i_924_ < i_861_; i_924_++) {
		    int i_925_ = is[i_924_];
		    if (i_925_
			< ((Class157_Sub3) this).anIntArrayArray9641.length) {
			int[] is_926_ = (((Class157_Sub3) this)
					 .anIntArrayArray9641[i_925_]);
			for (int i_927_ = 0; i_927_ < is_926_.length;
			     i_927_++) {
			    int i_928_ = is_926_[i_927_];
			    if (((Class157_Sub3) this).aShortArray9642 == null
				|| ((i_859_ & (((Class157_Sub3) this)
					       .aShortArray9642[i_928_]))
				    != 0)) {
				((Class157_Sub3) this).anIntArray9679[i_928_]
				    -= anInt9694;
				((Class157_Sub3) this).anIntArray9639[i_928_]
				    -= anInt9695;
				((Class157_Sub3) this).anIntArray9648[i_928_]
				    -= anInt9696;
				if (i_858_ != 0) {
				    int i_929_
					= Class417.anIntArray4766[i_858_];
				    int i_930_
					= Class417.anIntArray4767[i_858_];
				    int i_931_
					= ((((Class157_Sub3) this)
					    .anIntArray9639[i_928_]) * i_929_
					   + (((Class157_Sub3) this)
					      .anIntArray9679[i_928_]) * i_930_
					   + 16383) >> 14;
				    ((Class157_Sub3) this).anIntArray9639
					[i_928_]
					= ((((Class157_Sub3) this)
					    .anIntArray9639[i_928_]) * i_930_
					   - (((Class157_Sub3) this)
					      .anIntArray9679[i_928_]) * i_929_
					   + 16383) >> 14;
				    ((Class157_Sub3) this).anIntArray9679
					[i_928_]
					= i_931_;
				}
				if (i_856_ != 0) {
				    int i_932_
					= Class417.anIntArray4766[i_856_];
				    int i_933_
					= Class417.anIntArray4767[i_856_];
				    int i_934_
					= ((((Class157_Sub3) this)
					    .anIntArray9639[i_928_]) * i_933_
					   - (((Class157_Sub3) this)
					      .anIntArray9648[i_928_]) * i_932_
					   + 16383) >> 14;
				    ((Class157_Sub3) this).anIntArray9648
					[i_928_]
					= ((((Class157_Sub3) this)
					    .anIntArray9639[i_928_]) * i_932_
					   + (((Class157_Sub3) this)
					      .anIntArray9648[i_928_]) * i_933_
					   + 16383) >> 14;
				    ((Class157_Sub3) this).anIntArray9639
					[i_928_]
					= i_934_;
				}
				if (i_857_ != 0) {
				    int i_935_
					= Class417.anIntArray4766[i_857_];
				    int i_936_
					= Class417.anIntArray4767[i_857_];
				    int i_937_
					= ((((Class157_Sub3) this)
					    .anIntArray9648[i_928_]) * i_935_
					   + (((Class157_Sub3) this)
					      .anIntArray9679[i_928_]) * i_936_
					   + 16383) >> 14;
				    ((Class157_Sub3) this).anIntArray9648
					[i_928_]
					= ((((Class157_Sub3) this)
					    .anIntArray9648[i_928_]) * i_936_
					   - (((Class157_Sub3) this)
					      .anIntArray9679[i_928_]) * i_935_
					   + 16383) >> 14;
				    ((Class157_Sub3) this).anIntArray9679
					[i_928_]
					= i_937_;
				}
				((Class157_Sub3) this).anIntArray9679[i_928_]
				    += anInt9694;
				((Class157_Sub3) this).anIntArray9639[i_928_]
				    += anInt9695;
				((Class157_Sub3) this).anIntArray9648[i_928_]
				    += anInt9696;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_938_ = 0; i_938_ < i_861_; i_938_++) {
			int i_939_ = is[i_938_];
			if (i_939_ < (((Class157_Sub3) this)
				      .anIntArrayArray9641).length) {
			    int[] is_940_ = (((Class157_Sub3) this)
					     .anIntArrayArray9641[i_939_]);
			    for (int i_941_ = 0; i_941_ < is_940_.length;
				 i_941_++) {
				int i_942_ = is_940_[i_941_];
				if ((((Class157_Sub3) this).aShortArray9642
				     == null)
				    || ((i_859_ & (((Class157_Sub3) this)
						   .aShortArray9642[i_942_]))
					!= 0)) {
				    int i_943_ = (((Class157_Sub3) this)
						  .anIntArray9660[i_942_]);
				    int i_944_ = (((Class157_Sub3) this)
						  .anIntArray9660[i_942_ + 1]);
				    for (int i_945_ = i_943_;
					 (i_945_ < i_944_
					  && (((Class157_Sub3) this)
					      .aShortArray9682[i_945_]) != 0);
					 i_945_++) {
					int i_946_
					    = (((((Class157_Sub3) this)
						 .aShortArray9682[i_945_])
						& 0xffff)
					       - 1);
					if (i_858_ != 0) {
					    int i_947_
						= (Class417.anIntArray4766
						   [i_858_]);
					    int i_948_
						= (Class417.anIntArray4767
						   [i_858_]);
					    int i_949_
						= ((((((Class157_Sub3) this)
						      .aShortArray9645[i_946_])
						     * i_947_)
						    + (((Class157_Sub3) this)
						       .aShortArray9673
						       [i_946_]) * i_948_
						    + 16383)
						   >> 14);
					    ((Class157_Sub3) this)
						.aShortArray9645[i_946_]
						= (short) (((((Class157_Sub3)
							      this)
							     .aShortArray9645
							     [i_946_]) * i_948_
							    - (((Class157_Sub3)
								this)
							       .aShortArray9673
							       [i_946_]) * i_947_
							    + 16383)
							   >> 14);
					    ((Class157_Sub3) this)
						.aShortArray9673[i_946_]
						= (short) i_949_;
					}
					if (i_856_ != 0) {
					    int i_950_
						= (Class417.anIntArray4766
						   [i_856_]);
					    int i_951_
						= (Class417.anIntArray4767
						   [i_856_]);
					    int i_952_
						= ((((((Class157_Sub3) this)
						      .aShortArray9645[i_946_])
						     * i_951_)
						    - (((Class157_Sub3) this)
						       .aShortArray9646
						       [i_946_]) * i_950_
						    + 16383)
						   >> 14);
					    ((Class157_Sub3) this)
						.aShortArray9646[i_946_]
						= (short) (((((Class157_Sub3)
							      this)
							     .aShortArray9645
							     [i_946_]) * i_950_
							    + (((Class157_Sub3)
								this)
							       .aShortArray9646
							       [i_946_]) * i_951_
							    + 16383)
							   >> 14);
					    ((Class157_Sub3) this)
						.aShortArray9645[i_946_]
						= (short) i_952_;
					}
					if (i_857_ != 0) {
					    int i_953_
						= (Class417.anIntArray4766
						   [i_857_]);
					    int i_954_
						= (Class417.anIntArray4767
						   [i_857_]);
					    int i_955_
						= ((((((Class157_Sub3) this)
						      .aShortArray9646[i_946_])
						     * i_953_)
						    + (((Class157_Sub3) this)
						       .aShortArray9673
						       [i_946_]) * i_954_
						    + 16383)
						   >> 14);
					    ((Class157_Sub3) this)
						.aShortArray9646[i_946_]
						= (short) (((((Class157_Sub3)
							      this)
							     .aShortArray9646
							     [i_946_]) * i_954_
							    - (((Class157_Sub3)
								this)
							       .aShortArray9673
							       [i_946_]) * i_953_
							    + 16383)
							   >> 14);
					    ((Class157_Sub3) this)
						.aShortArray9673[i_946_]
						= (short) i_955_;
					}
				    }
				}
			    }
			}
		    }
		    if (((Class157_Sub3) this).aClass122_9663 == null
			&& ((Class157_Sub3) this).aClass122_9662 != null)
			((Class122) ((Class157_Sub3) this).aClass122_9662)
			    .anInterface14_1542
			    = null;
		    if (((Class157_Sub3) this).aClass122_9663 != null)
			((Class122) ((Class157_Sub3) this).aClass122_9663)
			    .anInterface14_1542
			    = null;
		}
	    }
	} else if (i == 3) {
	    if (is_860_ != null) {
		int i_956_ = is_860_[9] << 4;
		int i_957_ = is_860_[10] << 4;
		int i_958_ = is_860_[11] << 4;
		int i_959_ = is_860_[12] << 4;
		int i_960_ = is_860_[13] << 4;
		int i_961_ = is_860_[14] << 4;
		if (aBool9697) {
		    int i_962_
			= ((is_860_[0] * anInt9694 + is_860_[3] * anInt9695
			    + is_860_[6] * anInt9696 + 8192)
			   >> 14);
		    int i_963_
			= ((is_860_[1] * anInt9694 + is_860_[4] * anInt9695
			    + is_860_[7] * anInt9696 + 8192)
			   >> 14);
		    int i_964_
			= ((is_860_[2] * anInt9694 + is_860_[5] * anInt9695
			    + is_860_[8] * anInt9696 + 8192)
			   >> 14);
		    i_962_ += i_959_;
		    i_963_ += i_960_;
		    i_964_ += i_961_;
		    anInt9694 = i_962_;
		    anInt9695 = i_963_;
		    anInt9696 = i_964_;
		    aBool9697 = false;
		}
		int i_965_ = i_856_ << 15 >> 7;
		int i_966_ = i_857_ << 15 >> 7;
		int i_967_ = i_858_ << 15 >> 7;
		int i_968_ = i_965_ * -anInt9694 + 8192 >> 14;
		int i_969_ = i_966_ * -anInt9695 + 8192 >> 14;
		int i_970_ = i_967_ * -anInt9696 + 8192 >> 14;
		int i_971_ = i_968_ + anInt9694;
		int i_972_ = i_969_ + anInt9695;
		int i_973_ = i_970_ + anInt9696;
		int[] is_974_ = new int[9];
		is_974_[0] = i_965_ * is_860_[0] + 8192 >> 14;
		is_974_[1] = i_965_ * is_860_[3] + 8192 >> 14;
		is_974_[2] = i_965_ * is_860_[6] + 8192 >> 14;
		is_974_[3] = i_966_ * is_860_[1] + 8192 >> 14;
		is_974_[4] = i_966_ * is_860_[4] + 8192 >> 14;
		is_974_[5] = i_966_ * is_860_[7] + 8192 >> 14;
		is_974_[6] = i_967_ * is_860_[2] + 8192 >> 14;
		is_974_[7] = i_967_ * is_860_[5] + 8192 >> 14;
		is_974_[8] = i_967_ * is_860_[8] + 8192 >> 14;
		int i_975_ = i_965_ * i_959_ + 8192 >> 14;
		int i_976_ = i_966_ * i_960_ + 8192 >> 14;
		int i_977_ = i_967_ * i_961_ + 8192 >> 14;
		i_975_ += i_971_;
		i_976_ += i_972_;
		i_977_ += i_973_;
		int[] is_978_ = new int[9];
		for (int i_979_ = 0; i_979_ < 3; i_979_++) {
		    for (int i_980_ = 0; i_980_ < 3; i_980_++) {
			int i_981_ = 0;
			for (int i_982_ = 0; i_982_ < 3; i_982_++)
			    i_981_ += (is_860_[i_979_ * 3 + i_982_]
				       * is_974_[i_980_ + i_982_ * 3]);
			is_978_[i_979_ * 3 + i_980_] = i_981_ + 8192 >> 14;
		    }
		}
		int i_983_ = ((is_860_[0] * i_975_ + is_860_[1] * i_976_
			       + is_860_[2] * i_977_ + 8192)
			      >> 14);
		int i_984_ = ((is_860_[3] * i_975_ + is_860_[4] * i_976_
			       + is_860_[5] * i_977_ + 8192)
			      >> 14);
		int i_985_ = ((is_860_[6] * i_975_ + is_860_[7] * i_976_
			       + is_860_[8] * i_977_ + 8192)
			      >> 14);
		i_983_ += i_956_;
		i_984_ += i_957_;
		i_985_ += i_958_;
		for (int i_986_ = 0; i_986_ < i_861_; i_986_++) {
		    int i_987_ = is[i_986_];
		    if (i_987_
			< ((Class157_Sub3) this).anIntArrayArray9641.length) {
			int[] is_988_ = (((Class157_Sub3) this)
					 .anIntArrayArray9641[i_987_]);
			for (int i_989_ = 0; i_989_ < is_988_.length;
			     i_989_++) {
			    int i_990_ = is_988_[i_989_];
			    if (((Class157_Sub3) this).aShortArray9642 == null
				|| ((i_859_ & (((Class157_Sub3) this)
					       .aShortArray9642[i_990_]))
				    != 0)) {
				int i_991_
				    = (is_978_[0] * (((Class157_Sub3) this)
						     .anIntArray9679[i_990_])
				       + is_978_[1] * (((Class157_Sub3) this)
						       .anIntArray9639[i_990_])
				       + is_978_[2] * (((Class157_Sub3) this)
						       .anIntArray9648[i_990_])
				       + 8192) >> 14;
				int i_992_
				    = (is_978_[3] * (((Class157_Sub3) this)
						     .anIntArray9679[i_990_])
				       + is_978_[4] * (((Class157_Sub3) this)
						       .anIntArray9639[i_990_])
				       + is_978_[5] * (((Class157_Sub3) this)
						       .anIntArray9648[i_990_])
				       + 8192) >> 14;
				int i_993_
				    = (is_978_[6] * (((Class157_Sub3) this)
						     .anIntArray9679[i_990_])
				       + is_978_[7] * (((Class157_Sub3) this)
						       .anIntArray9639[i_990_])
				       + is_978_[8] * (((Class157_Sub3) this)
						       .anIntArray9648[i_990_])
				       + 8192) >> 14;
				i_991_ += i_983_;
				i_992_ += i_984_;
				i_993_ += i_985_;
				((Class157_Sub3) this).anIntArray9679[i_990_]
				    = i_991_;
				((Class157_Sub3) this).anIntArray9639[i_990_]
				    = i_992_;
				((Class157_Sub3) this).anIntArray9648[i_990_]
				    = i_993_;
			    }
			}
		    }
		}
	    } else {
		for (int i_994_ = 0; i_994_ < i_861_; i_994_++) {
		    int i_995_ = is[i_994_];
		    if (i_995_
			< ((Class157_Sub3) this).anIntArrayArray9641.length) {
			int[] is_996_ = (((Class157_Sub3) this)
					 .anIntArrayArray9641[i_995_]);
			for (int i_997_ = 0; i_997_ < is_996_.length;
			     i_997_++) {
			    int i_998_ = is_996_[i_997_];
			    if (((Class157_Sub3) this).aShortArray9642 == null
				|| ((i_859_ & (((Class157_Sub3) this)
					       .aShortArray9642[i_998_]))
				    != 0)) {
				((Class157_Sub3) this).anIntArray9679[i_998_]
				    -= anInt9694;
				((Class157_Sub3) this).anIntArray9639[i_998_]
				    -= anInt9695;
				((Class157_Sub3) this).anIntArray9648[i_998_]
				    -= anInt9696;
				((Class157_Sub3) this).anIntArray9679[i_998_]
				    = (((Class157_Sub3) this).anIntArray9679
				       [i_998_]) * i_856_ >> 7;
				((Class157_Sub3) this).anIntArray9639[i_998_]
				    = (((Class157_Sub3) this).anIntArray9639
				       [i_998_]) * i_857_ >> 7;
				((Class157_Sub3) this).anIntArray9648[i_998_]
				    = (((Class157_Sub3) this).anIntArray9648
				       [i_998_]) * i_858_ >> 7;
				((Class157_Sub3) this).anIntArray9679[i_998_]
				    += anInt9694;
				((Class157_Sub3) this).anIntArray9639[i_998_]
				    += anInt9695;
				((Class157_Sub3) this).anIntArray9648[i_998_]
				    += anInt9696;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class157_Sub3) this).anIntArrayArray9659 != null) {
		for (int i_999_ = 0; i_999_ < i_861_; i_999_++) {
		    int i_1000_ = is[i_999_];
		    if (i_1000_
			< ((Class157_Sub3) this).anIntArrayArray9659.length) {
			int[] is_1001_ = (((Class157_Sub3) this)
					  .anIntArrayArray9659[i_1000_]);
			for (int i_1002_ = 0; i_1002_ < is_1001_.length;
			     i_1002_++) {
			    int i_1003_ = is_1001_[i_1002_];
			    if (((Class157_Sub3) this).aShortArray9677 == null
				|| ((i_859_ & (((Class157_Sub3) this)
					       .aShortArray9677[i_1003_]))
				    != 0)) {
				int i_1004_ = (((((Class157_Sub3) this)
						 .aByteArray9654[i_1003_])
						& 0xff)
					       + i_856_ * 8);
				if (i_1004_ < 0)
				    i_1004_ = 0;
				else if (i_1004_ > 255)
				    i_1004_ = 255;
				((Class157_Sub3) this).aByteArray9654[i_1003_]
				    = (byte) i_1004_;
				if (((Class157_Sub3) this).aClass122_9662
				    != null)
				    ((Class122)
				     ((Class157_Sub3) this).aClass122_9662)
					.anInterface14_1542
					= null;
			    }
			}
		    }
		}
		if (((Class157_Sub3) this).aClass145Array9684 != null) {
		    for (int i_1005_ = 0;
			 i_1005_ < ((Class157_Sub3) this).anInt9685;
			 i_1005_++) {
			Class145 class145 = (((Class157_Sub3) this)
					     .aClass145Array9684[i_1005_]);
			Class113 class113 = (((Class157_Sub3) this)
					     .aClass113Array9687[i_1005_]);
			((Class113) class113).anInt1406
			    = (((Class113) class113).anInt1406 & 0xffffff
			       | 255 - ((((Class157_Sub3) this).aByteArray9654
					 [((Class145) class145).anInt1655])
					& 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (((Class157_Sub3) this).anIntArrayArray9659 != null) {
		for (int i_1006_ = 0; i_1006_ < i_861_; i_1006_++) {
		    int i_1007_ = is[i_1006_];
		    if (i_1007_
			< ((Class157_Sub3) this).anIntArrayArray9659.length) {
			int[] is_1008_ = (((Class157_Sub3) this)
					  .anIntArrayArray9659[i_1007_]);
			for (int i_1009_ = 0; i_1009_ < is_1008_.length;
			     i_1009_++) {
			    int i_1010_ = is_1008_[i_1009_];
			    if (((Class157_Sub3) this).aShortArray9677 == null
				|| ((i_859_ & (((Class157_Sub3) this)
					       .aShortArray9677[i_1010_]))
				    != 0)) {
				int i_1011_ = ((((Class157_Sub3) this)
						.aShortArray9653[i_1010_])
					       & 0xffff);
				int i_1012_ = i_1011_ >> 10 & 0x3f;
				int i_1013_ = i_1011_ >> 7 & 0x7;
				int i_1014_ = i_1011_ & 0x7f;
				i_1012_ = i_1012_ + i_856_ & 0x3f;
				i_1013_ += i_857_ / 4;
				if (i_1013_ < 0)
				    i_1013_ = 0;
				else if (i_1013_ > 7)
				    i_1013_ = 7;
				i_1014_ += i_858_;
				if (i_1014_ < 0)
				    i_1014_ = 0;
				else if (i_1014_ > 127)
				    i_1014_ = 127;
				((Class157_Sub3) this).aShortArray9653[i_1010_]
				    = (short) (i_1012_ << 10 | i_1013_ << 7
					       | i_1014_);
				if (((Class157_Sub3) this).aClass122_9662
				    != null)
				    ((Class122)
				     ((Class157_Sub3) this).aClass122_9662)
					.anInterface14_1542
					= null;
			    }
			}
		    }
		}
		if (((Class157_Sub3) this).aClass145Array9684 != null) {
		    for (int i_1015_ = 0;
			 i_1015_ < ((Class157_Sub3) this).anInt9685;
			 i_1015_++) {
			Class145 class145 = (((Class157_Sub3) this)
					     .aClass145Array9684[i_1015_]);
			Class113 class113 = (((Class157_Sub3) this)
					     .aClass113Array9687[i_1015_]);
			((Class113) class113).anInt1406
			    = (((Class113) class113).anInt1406 & ~0xffffff
			       | (Class649.anIntArray8420
				  [((((Class157_Sub3) this).aShortArray9653
				     [((Class145) class145).anInt1655])
				    & 0xffff)]) & 0xffffff);
		    }
		}
	    }
	} else if (i == 8) {
	    if (((Class157_Sub3) this).anIntArrayArray9691 != null) {
		for (int i_1016_ = 0; i_1016_ < i_861_; i_1016_++) {
		    int i_1017_ = is[i_1016_];
		    if (i_1017_
			< ((Class157_Sub3) this).anIntArrayArray9691.length) {
			int[] is_1018_ = (((Class157_Sub3) this)
					  .anIntArrayArray9691[i_1017_]);
			for (int i_1019_ = 0; i_1019_ < is_1018_.length;
			     i_1019_++) {
			    Class113 class113
				= (((Class157_Sub3) this).aClass113Array9687
				   [is_1018_[i_1019_]]);
			    ((Class113) class113).anInt1402 += i_856_;
			    ((Class113) class113).anInt1405 += i_857_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class157_Sub3) this).anIntArrayArray9691 != null) {
		for (int i_1020_ = 0; i_1020_ < i_861_; i_1020_++) {
		    int i_1021_ = is[i_1020_];
		    if (i_1021_
			< ((Class157_Sub3) this).anIntArrayArray9691.length) {
			int[] is_1022_ = (((Class157_Sub3) this)
					  .anIntArrayArray9691[i_1021_]);
			for (int i_1023_ = 0; i_1023_ < is_1022_.length;
			     i_1023_++) {
			    Class113 class113
				= (((Class157_Sub3) this).aClass113Array9687
				   [is_1022_[i_1023_]]);
			    ((Class113) class113).anInt1403
				= (((Class113) class113).anInt1403 * i_856_
				   >> 7);
			    ((Class113) class113).anInt1404
				= (((Class113) class113).anInt1404 * i_857_
				   >> 7);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class157_Sub3) this).anIntArrayArray9691 != null) {
		for (int i_1024_ = 0; i_1024_ < i_861_; i_1024_++) {
		    int i_1025_ = is[i_1024_];
		    if (i_1025_
			< ((Class157_Sub3) this).anIntArrayArray9691.length) {
			int[] is_1026_ = (((Class157_Sub3) this)
					  .anIntArrayArray9691[i_1025_]);
			for (int i_1027_ = 0; i_1027_ < is_1026_.length;
			     i_1027_++) {
			    Class113 class113
				= (((Class157_Sub3) this).aClass113Array9687
				   [is_1026_[i_1027_]]);
			    ((Class113) class113).anInt1407
				= (((Class113) class113).anInt1407 + i_856_
				   & 0x3fff);
			}
		    }
		}
	    }
	}
    }
    
    void method1871() {
	for (int i = 0; i < ((Class157_Sub3) this).anInt9636; i++) {
	    ((Class157_Sub3) this).anIntArray9679[i]
		= ((Class157_Sub3) this).anIntArray9679[i] + 7 >> 4;
	    ((Class157_Sub3) this).anIntArray9639[i]
		= ((Class157_Sub3) this).anIntArray9639[i] + 7 >> 4;
	    ((Class157_Sub3) this).anIntArray9648[i]
		= ((Class157_Sub3) this).anIntArray9648[i] + 7 >> 4;
	}
	if (((Class157_Sub3) this).aClass122_9661 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9661)
		.anInterface14_1542
		= null;
	((Class157_Sub3) this).aBool9649 = false;
    }
    
    void method1958() {
	for (int i = 0; i < ((Class157_Sub3) this).anInt9636; i++) {
	    ((Class157_Sub3) this).anIntArray9679[i]
		= ((Class157_Sub3) this).anIntArray9679[i] + 7 >> 4;
	    ((Class157_Sub3) this).anIntArray9639[i]
		= ((Class157_Sub3) this).anIntArray9639[i] + 7 >> 4;
	    ((Class157_Sub3) this).anIntArray9648[i]
		= ((Class157_Sub3) this).anIntArray9648[i] + 7 >> 4;
	}
	if (((Class157_Sub3) this).aClass122_9661 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9661)
		.anInterface14_1542
		= null;
	((Class157_Sub3) this).aBool9649 = false;
    }
    
    public void method1875() {
	if (((Class157_Sub3) this).anInt9623 > 0
	    && ((Class157_Sub3) this).anInt9652 > 0) {
	    method8892(false);
	    if ((((Class157_Sub3) this).aByte9669 & 0x10) == 0
		&& (((Class129) ((Class157_Sub3) this).aClass129_9665)
		    .anInterface16_1588) == null)
		method8889(false);
	    method8886();
	}
    }
    
    void method1960(int i, int[] is, int i_1028_, int i_1029_, int i_1030_,
		    boolean bool, int i_1031_, int[] is_1032_) {
	int i_1033_ = is.length;
	if (i == 0) {
	    i_1028_ <<= 4;
	    i_1029_ <<= 4;
	    i_1030_ <<= 4;
	    int i_1034_ = 0;
	    anInt9694 = 0;
	    anInt9695 = 0;
	    anInt9696 = 0;
	    for (int i_1035_ = 0; i_1035_ < i_1033_; i_1035_++) {
		int i_1036_ = is[i_1035_];
		if (i_1036_
		    < ((Class157_Sub3) this).anIntArrayArray9641.length) {
		    int[] is_1037_
			= ((Class157_Sub3) this).anIntArrayArray9641[i_1036_];
		    for (int i_1038_ = 0; i_1038_ < is_1037_.length;
			 i_1038_++) {
			int i_1039_ = is_1037_[i_1038_];
			if (((Class157_Sub3) this).aShortArray9642 == null
			    || (i_1031_ & (((Class157_Sub3) this)
					   .aShortArray9642[i_1039_])) != 0) {
			    anInt9694 += (((Class157_Sub3) this).anIntArray9679
					  [i_1039_]);
			    anInt9695 += (((Class157_Sub3) this).anIntArray9639
					  [i_1039_]);
			    anInt9696 += (((Class157_Sub3) this).anIntArray9648
					  [i_1039_]);
			    i_1034_++;
			}
		    }
		}
	    }
	    if (i_1034_ > 0) {
		anInt9694 = anInt9694 / i_1034_ + i_1028_;
		anInt9695 = anInt9695 / i_1034_ + i_1029_;
		anInt9696 = anInt9696 / i_1034_ + i_1030_;
		aBool9697 = true;
	    } else {
		anInt9694 = i_1028_;
		anInt9695 = i_1029_;
		anInt9696 = i_1030_;
	    }
	} else if (i == 1) {
	    if (is_1032_ != null) {
		int i_1040_ = ((is_1032_[0] * i_1028_ + is_1032_[1] * i_1029_
				+ is_1032_[2] * i_1030_ + 8192)
			       >> 14);
		int i_1041_ = ((is_1032_[3] * i_1028_ + is_1032_[4] * i_1029_
				+ is_1032_[5] * i_1030_ + 8192)
			       >> 14);
		int i_1042_ = ((is_1032_[6] * i_1028_ + is_1032_[7] * i_1029_
				+ is_1032_[8] * i_1030_ + 8192)
			       >> 14);
		i_1028_ = i_1040_;
		i_1029_ = i_1041_;
		i_1030_ = i_1042_;
	    }
	    i_1028_ <<= 4;
	    i_1029_ <<= 4;
	    i_1030_ <<= 4;
	    for (int i_1043_ = 0; i_1043_ < i_1033_; i_1043_++) {
		int i_1044_ = is[i_1043_];
		if (i_1044_
		    < ((Class157_Sub3) this).anIntArrayArray9641.length) {
		    int[] is_1045_
			= ((Class157_Sub3) this).anIntArrayArray9641[i_1044_];
		    for (int i_1046_ = 0; i_1046_ < is_1045_.length;
			 i_1046_++) {
			int i_1047_ = is_1045_[i_1046_];
			if (((Class157_Sub3) this).aShortArray9642 == null
			    || (i_1031_ & (((Class157_Sub3) this)
					   .aShortArray9642[i_1047_])) != 0) {
			    ((Class157_Sub3) this).anIntArray9679[i_1047_]
				+= i_1028_;
			    ((Class157_Sub3) this).anIntArray9639[i_1047_]
				+= i_1029_;
			    ((Class157_Sub3) this).anIntArray9648[i_1047_]
				+= i_1030_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_1032_ != null) {
		int i_1048_ = is_1032_[9] << 4;
		int i_1049_ = is_1032_[10] << 4;
		int i_1050_ = is_1032_[11] << 4;
		int i_1051_ = is_1032_[12] << 4;
		int i_1052_ = is_1032_[13] << 4;
		int i_1053_ = is_1032_[14] << 4;
		if (aBool9697) {
		    int i_1054_
			= ((is_1032_[0] * anInt9694 + is_1032_[3] * anInt9695
			    + is_1032_[6] * anInt9696 + 8192)
			   >> 14);
		    int i_1055_
			= ((is_1032_[1] * anInt9694 + is_1032_[4] * anInt9695
			    + is_1032_[7] * anInt9696 + 8192)
			   >> 14);
		    int i_1056_
			= ((is_1032_[2] * anInt9694 + is_1032_[5] * anInt9695
			    + is_1032_[8] * anInt9696 + 8192)
			   >> 14);
		    i_1054_ += i_1051_;
		    i_1055_ += i_1052_;
		    i_1056_ += i_1053_;
		    anInt9694 = i_1054_;
		    anInt9695 = i_1055_;
		    anInt9696 = i_1056_;
		    aBool9697 = false;
		}
		int[] is_1057_ = new int[9];
		int i_1058_ = Class417.anIntArray4767[i_1028_];
		int i_1059_ = Class417.anIntArray4766[i_1028_];
		int i_1060_ = Class417.anIntArray4767[i_1029_];
		int i_1061_ = Class417.anIntArray4766[i_1029_];
		int i_1062_ = Class417.anIntArray4767[i_1030_];
		int i_1063_ = Class417.anIntArray4766[i_1030_];
		int i_1064_ = i_1059_ * i_1062_ + 8192 >> 14;
		int i_1065_ = i_1059_ * i_1063_ + 8192 >> 14;
		is_1057_[0]
		    = i_1060_ * i_1062_ + i_1061_ * i_1065_ + 8192 >> 14;
		is_1057_[1]
		    = -i_1060_ * i_1063_ + i_1061_ * i_1064_ + 8192 >> 14;
		is_1057_[2] = i_1061_ * i_1058_ + 8192 >> 14;
		is_1057_[3] = i_1058_ * i_1063_ + 8192 >> 14;
		is_1057_[4] = i_1058_ * i_1062_ + 8192 >> 14;
		is_1057_[5] = -i_1059_;
		is_1057_[6]
		    = -i_1061_ * i_1062_ + i_1060_ * i_1065_ + 8192 >> 14;
		is_1057_[7]
		    = i_1061_ * i_1063_ + i_1060_ * i_1064_ + 8192 >> 14;
		is_1057_[8] = i_1060_ * i_1058_ + 8192 >> 14;
		int i_1066_
		    = ((is_1057_[0] * -anInt9694 + is_1057_[1] * -anInt9695
			+ is_1057_[2] * -anInt9696 + 8192)
		       >> 14);
		int i_1067_
		    = ((is_1057_[3] * -anInt9694 + is_1057_[4] * -anInt9695
			+ is_1057_[5] * -anInt9696 + 8192)
		       >> 14);
		int i_1068_
		    = ((is_1057_[6] * -anInt9694 + is_1057_[7] * -anInt9695
			+ is_1057_[8] * -anInt9696 + 8192)
		       >> 14);
		int i_1069_ = i_1066_ + anInt9694;
		int i_1070_ = i_1067_ + anInt9695;
		int i_1071_ = i_1068_ + anInt9696;
		int[] is_1072_ = new int[9];
		for (int i_1073_ = 0; i_1073_ < 3; i_1073_++) {
		    for (int i_1074_ = 0; i_1074_ < 3; i_1074_++) {
			int i_1075_ = 0;
			for (int i_1076_ = 0; i_1076_ < 3; i_1076_++)
			    i_1075_ += (is_1057_[i_1073_ * 3 + i_1076_]
					* is_1032_[i_1074_ * 3 + i_1076_]);
			is_1072_[i_1073_ * 3 + i_1074_] = i_1075_ + 8192 >> 14;
		    }
		}
		int i_1077_ = ((is_1057_[0] * i_1051_ + is_1057_[1] * i_1052_
				+ is_1057_[2] * i_1053_ + 8192)
			       >> 14);
		int i_1078_ = ((is_1057_[3] * i_1051_ + is_1057_[4] * i_1052_
				+ is_1057_[5] * i_1053_ + 8192)
			       >> 14);
		int i_1079_ = ((is_1057_[6] * i_1051_ + is_1057_[7] * i_1052_
				+ is_1057_[8] * i_1053_ + 8192)
			       >> 14);
		i_1077_ += i_1069_;
		i_1078_ += i_1070_;
		i_1079_ += i_1071_;
		int[] is_1080_ = new int[9];
		for (int i_1081_ = 0; i_1081_ < 3; i_1081_++) {
		    for (int i_1082_ = 0; i_1082_ < 3; i_1082_++) {
			int i_1083_ = 0;
			for (int i_1084_ = 0; i_1084_ < 3; i_1084_++)
			    i_1083_ += (is_1032_[i_1081_ * 3 + i_1084_]
					* is_1072_[i_1082_ + i_1084_ * 3]);
			is_1080_[i_1081_ * 3 + i_1082_] = i_1083_ + 8192 >> 14;
		    }
		}
		int i_1085_ = ((is_1032_[0] * i_1077_ + is_1032_[1] * i_1078_
				+ is_1032_[2] * i_1079_ + 8192)
			       >> 14);
		int i_1086_ = ((is_1032_[3] * i_1077_ + is_1032_[4] * i_1078_
				+ is_1032_[5] * i_1079_ + 8192)
			       >> 14);
		int i_1087_ = ((is_1032_[6] * i_1077_ + is_1032_[7] * i_1078_
				+ is_1032_[8] * i_1079_ + 8192)
			       >> 14);
		i_1085_ += i_1048_;
		i_1086_ += i_1049_;
		i_1087_ += i_1050_;
		for (int i_1088_ = 0; i_1088_ < i_1033_; i_1088_++) {
		    int i_1089_ = is[i_1088_];
		    if (i_1089_
			< ((Class157_Sub3) this).anIntArrayArray9641.length) {
			int[] is_1090_ = (((Class157_Sub3) this)
					  .anIntArrayArray9641[i_1089_]);
			for (int i_1091_ = 0; i_1091_ < is_1090_.length;
			     i_1091_++) {
			    int i_1092_ = is_1090_[i_1091_];
			    if (((Class157_Sub3) this).aShortArray9642 == null
				|| ((i_1031_ & (((Class157_Sub3) this)
						.aShortArray9642[i_1092_]))
				    != 0)) {
				int i_1093_
				    = (is_1080_[0] * (((Class157_Sub3) this)
						      .anIntArray9679[i_1092_])
				       + is_1080_[1] * (((Class157_Sub3) this)
							.anIntArray9639
							[i_1092_])
				       + is_1080_[2] * (((Class157_Sub3) this)
							.anIntArray9648
							[i_1092_])
				       + 8192) >> 14;
				int i_1094_
				    = (is_1080_[3] * (((Class157_Sub3) this)
						      .anIntArray9679[i_1092_])
				       + is_1080_[4] * (((Class157_Sub3) this)
							.anIntArray9639
							[i_1092_])
				       + is_1080_[5] * (((Class157_Sub3) this)
							.anIntArray9648
							[i_1092_])
				       + 8192) >> 14;
				int i_1095_
				    = (is_1080_[6] * (((Class157_Sub3) this)
						      .anIntArray9679[i_1092_])
				       + is_1080_[7] * (((Class157_Sub3) this)
							.anIntArray9639
							[i_1092_])
				       + is_1080_[8] * (((Class157_Sub3) this)
							.anIntArray9648
							[i_1092_])
				       + 8192) >> 14;
				i_1093_ += i_1085_;
				i_1094_ += i_1086_;
				i_1095_ += i_1087_;
				((Class157_Sub3) this).anIntArray9679[i_1092_]
				    = i_1093_;
				((Class157_Sub3) this).anIntArray9639[i_1092_]
				    = i_1094_;
				((Class157_Sub3) this).anIntArray9648[i_1092_]
				    = i_1095_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1096_ = 0; i_1096_ < i_1033_; i_1096_++) {
		    int i_1097_ = is[i_1096_];
		    if (i_1097_
			< ((Class157_Sub3) this).anIntArrayArray9641.length) {
			int[] is_1098_ = (((Class157_Sub3) this)
					  .anIntArrayArray9641[i_1097_]);
			for (int i_1099_ = 0; i_1099_ < is_1098_.length;
			     i_1099_++) {
			    int i_1100_ = is_1098_[i_1099_];
			    if (((Class157_Sub3) this).aShortArray9642 == null
				|| ((i_1031_ & (((Class157_Sub3) this)
						.aShortArray9642[i_1100_]))
				    != 0)) {
				((Class157_Sub3) this).anIntArray9679[i_1100_]
				    -= anInt9694;
				((Class157_Sub3) this).anIntArray9639[i_1100_]
				    -= anInt9695;
				((Class157_Sub3) this).anIntArray9648[i_1100_]
				    -= anInt9696;
				if (i_1030_ != 0) {
				    int i_1101_
					= Class417.anIntArray4766[i_1030_];
				    int i_1102_
					= Class417.anIntArray4767[i_1030_];
				    int i_1103_
					= ((((Class157_Sub3) this)
					    .anIntArray9639[i_1100_]) * i_1101_
					   + ((((Class157_Sub3) this)
					       .anIntArray9679[i_1100_])
					      * i_1102_)
					   + 16383) >> 14;
				    ((Class157_Sub3) this).anIntArray9639
					[i_1100_]
					= ((((Class157_Sub3) this)
					    .anIntArray9639[i_1100_]) * i_1102_
					   - ((((Class157_Sub3) this)
					       .anIntArray9679[i_1100_])
					      * i_1101_)
					   + 16383) >> 14;
				    ((Class157_Sub3) this).anIntArray9679
					[i_1100_]
					= i_1103_;
				}
				if (i_1028_ != 0) {
				    int i_1104_
					= Class417.anIntArray4766[i_1028_];
				    int i_1105_
					= Class417.anIntArray4767[i_1028_];
				    int i_1106_
					= ((((Class157_Sub3) this)
					    .anIntArray9639[i_1100_]) * i_1105_
					   - ((((Class157_Sub3) this)
					       .anIntArray9648[i_1100_])
					      * i_1104_)
					   + 16383) >> 14;
				    ((Class157_Sub3) this).anIntArray9648
					[i_1100_]
					= ((((Class157_Sub3) this)
					    .anIntArray9639[i_1100_]) * i_1104_
					   + ((((Class157_Sub3) this)
					       .anIntArray9648[i_1100_])
					      * i_1105_)
					   + 16383) >> 14;
				    ((Class157_Sub3) this).anIntArray9639
					[i_1100_]
					= i_1106_;
				}
				if (i_1029_ != 0) {
				    int i_1107_
					= Class417.anIntArray4766[i_1029_];
				    int i_1108_
					= Class417.anIntArray4767[i_1029_];
				    int i_1109_
					= ((((Class157_Sub3) this)
					    .anIntArray9648[i_1100_]) * i_1107_
					   + ((((Class157_Sub3) this)
					       .anIntArray9679[i_1100_])
					      * i_1108_)
					   + 16383) >> 14;
				    ((Class157_Sub3) this).anIntArray9648
					[i_1100_]
					= ((((Class157_Sub3) this)
					    .anIntArray9648[i_1100_]) * i_1108_
					   - ((((Class157_Sub3) this)
					       .anIntArray9679[i_1100_])
					      * i_1107_)
					   + 16383) >> 14;
				    ((Class157_Sub3) this).anIntArray9679
					[i_1100_]
					= i_1109_;
				}
				((Class157_Sub3) this).anIntArray9679[i_1100_]
				    += anInt9694;
				((Class157_Sub3) this).anIntArray9639[i_1100_]
				    += anInt9695;
				((Class157_Sub3) this).anIntArray9648[i_1100_]
				    += anInt9696;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_1110_ = 0; i_1110_ < i_1033_; i_1110_++) {
			int i_1111_ = is[i_1110_];
			if (i_1111_ < (((Class157_Sub3) this)
				       .anIntArrayArray9641).length) {
			    int[] is_1112_ = (((Class157_Sub3) this)
					      .anIntArrayArray9641[i_1111_]);
			    for (int i_1113_ = 0; i_1113_ < is_1112_.length;
				 i_1113_++) {
				int i_1114_ = is_1112_[i_1113_];
				if ((((Class157_Sub3) this).aShortArray9642
				     == null)
				    || ((i_1031_ & (((Class157_Sub3) this)
						    .aShortArray9642[i_1114_]))
					!= 0)) {
				    int i_1115_ = (((Class157_Sub3) this)
						   .anIntArray9660[i_1114_]);
				    int i_1116_
					= (((Class157_Sub3) this)
					   .anIntArray9660[i_1114_ + 1]);
				    for (int i_1117_ = i_1115_;
					 (i_1117_ < i_1116_
					  && (((Class157_Sub3) this)
					      .aShortArray9682[i_1117_]) != 0);
					 i_1117_++) {
					int i_1118_
					    = (((((Class157_Sub3) this)
						 .aShortArray9682[i_1117_])
						& 0xffff)
					       - 1);
					if (i_1030_ != 0) {
					    int i_1119_
						= (Class417.anIntArray4766
						   [i_1030_]);
					    int i_1120_
						= (Class417.anIntArray4767
						   [i_1030_]);
					    int i_1121_
						= (((((Class157_Sub3) this)
						     .aShortArray9645
						     [i_1118_]) * i_1119_
						    + (((Class157_Sub3) this)
						       .aShortArray9673
						       [i_1118_]) * i_1120_
						    + 16383)
						   >> 14);
					    ((Class157_Sub3) this)
						.aShortArray9645[i_1118_]
						= (short) ((((((Class157_Sub3)
							       this)
							      .aShortArray9645
							      [i_1118_])
							     * i_1120_)
							    - ((((Class157_Sub3)
								 this)
								.aShortArray9673
								[i_1118_])
							       * i_1119_)
							    + 16383)
							   >> 14);
					    ((Class157_Sub3) this)
						.aShortArray9673[i_1118_]
						= (short) i_1121_;
					}
					if (i_1028_ != 0) {
					    int i_1122_
						= (Class417.anIntArray4766
						   [i_1028_]);
					    int i_1123_
						= (Class417.anIntArray4767
						   [i_1028_]);
					    int i_1124_
						= (((((Class157_Sub3) this)
						     .aShortArray9645
						     [i_1118_]) * i_1123_
						    - (((Class157_Sub3) this)
						       .aShortArray9646
						       [i_1118_]) * i_1122_
						    + 16383)
						   >> 14);
					    ((Class157_Sub3) this)
						.aShortArray9646[i_1118_]
						= (short) ((((((Class157_Sub3)
							       this)
							      .aShortArray9645
							      [i_1118_])
							     * i_1122_)
							    + ((((Class157_Sub3)
								 this)
								.aShortArray9646
								[i_1118_])
							       * i_1123_)
							    + 16383)
							   >> 14);
					    ((Class157_Sub3) this)
						.aShortArray9645[i_1118_]
						= (short) i_1124_;
					}
					if (i_1029_ != 0) {
					    int i_1125_
						= (Class417.anIntArray4766
						   [i_1029_]);
					    int i_1126_
						= (Class417.anIntArray4767
						   [i_1029_]);
					    int i_1127_
						= (((((Class157_Sub3) this)
						     .aShortArray9646
						     [i_1118_]) * i_1125_
						    + (((Class157_Sub3) this)
						       .aShortArray9673
						       [i_1118_]) * i_1126_
						    + 16383)
						   >> 14);
					    ((Class157_Sub3) this)
						.aShortArray9646[i_1118_]
						= (short) ((((((Class157_Sub3)
							       this)
							      .aShortArray9646
							      [i_1118_])
							     * i_1126_)
							    - ((((Class157_Sub3)
								 this)
								.aShortArray9673
								[i_1118_])
							       * i_1125_)
							    + 16383)
							   >> 14);
					    ((Class157_Sub3) this)
						.aShortArray9673[i_1118_]
						= (short) i_1127_;
					}
				    }
				}
			    }
			}
		    }
		    if (((Class157_Sub3) this).aClass122_9663 == null
			&& ((Class157_Sub3) this).aClass122_9662 != null)
			((Class122) ((Class157_Sub3) this).aClass122_9662)
			    .anInterface14_1542
			    = null;
		    if (((Class157_Sub3) this).aClass122_9663 != null)
			((Class122) ((Class157_Sub3) this).aClass122_9663)
			    .anInterface14_1542
			    = null;
		}
	    }
	} else if (i == 3) {
	    if (is_1032_ != null) {
		int i_1128_ = is_1032_[9] << 4;
		int i_1129_ = is_1032_[10] << 4;
		int i_1130_ = is_1032_[11] << 4;
		int i_1131_ = is_1032_[12] << 4;
		int i_1132_ = is_1032_[13] << 4;
		int i_1133_ = is_1032_[14] << 4;
		if (aBool9697) {
		    int i_1134_
			= ((is_1032_[0] * anInt9694 + is_1032_[3] * anInt9695
			    + is_1032_[6] * anInt9696 + 8192)
			   >> 14);
		    int i_1135_
			= ((is_1032_[1] * anInt9694 + is_1032_[4] * anInt9695
			    + is_1032_[7] * anInt9696 + 8192)
			   >> 14);
		    int i_1136_
			= ((is_1032_[2] * anInt9694 + is_1032_[5] * anInt9695
			    + is_1032_[8] * anInt9696 + 8192)
			   >> 14);
		    i_1134_ += i_1131_;
		    i_1135_ += i_1132_;
		    i_1136_ += i_1133_;
		    anInt9694 = i_1134_;
		    anInt9695 = i_1135_;
		    anInt9696 = i_1136_;
		    aBool9697 = false;
		}
		int i_1137_ = i_1028_ << 15 >> 7;
		int i_1138_ = i_1029_ << 15 >> 7;
		int i_1139_ = i_1030_ << 15 >> 7;
		int i_1140_ = i_1137_ * -anInt9694 + 8192 >> 14;
		int i_1141_ = i_1138_ * -anInt9695 + 8192 >> 14;
		int i_1142_ = i_1139_ * -anInt9696 + 8192 >> 14;
		int i_1143_ = i_1140_ + anInt9694;
		int i_1144_ = i_1141_ + anInt9695;
		int i_1145_ = i_1142_ + anInt9696;
		int[] is_1146_ = new int[9];
		is_1146_[0] = i_1137_ * is_1032_[0] + 8192 >> 14;
		is_1146_[1] = i_1137_ * is_1032_[3] + 8192 >> 14;
		is_1146_[2] = i_1137_ * is_1032_[6] + 8192 >> 14;
		is_1146_[3] = i_1138_ * is_1032_[1] + 8192 >> 14;
		is_1146_[4] = i_1138_ * is_1032_[4] + 8192 >> 14;
		is_1146_[5] = i_1138_ * is_1032_[7] + 8192 >> 14;
		is_1146_[6] = i_1139_ * is_1032_[2] + 8192 >> 14;
		is_1146_[7] = i_1139_ * is_1032_[5] + 8192 >> 14;
		is_1146_[8] = i_1139_ * is_1032_[8] + 8192 >> 14;
		int i_1147_ = i_1137_ * i_1131_ + 8192 >> 14;
		int i_1148_ = i_1138_ * i_1132_ + 8192 >> 14;
		int i_1149_ = i_1139_ * i_1133_ + 8192 >> 14;
		i_1147_ += i_1143_;
		i_1148_ += i_1144_;
		i_1149_ += i_1145_;
		int[] is_1150_ = new int[9];
		for (int i_1151_ = 0; i_1151_ < 3; i_1151_++) {
		    for (int i_1152_ = 0; i_1152_ < 3; i_1152_++) {
			int i_1153_ = 0;
			for (int i_1154_ = 0; i_1154_ < 3; i_1154_++)
			    i_1153_ += (is_1032_[i_1151_ * 3 + i_1154_]
					* is_1146_[i_1152_ + i_1154_ * 3]);
			is_1150_[i_1151_ * 3 + i_1152_] = i_1153_ + 8192 >> 14;
		    }
		}
		int i_1155_ = ((is_1032_[0] * i_1147_ + is_1032_[1] * i_1148_
				+ is_1032_[2] * i_1149_ + 8192)
			       >> 14);
		int i_1156_ = ((is_1032_[3] * i_1147_ + is_1032_[4] * i_1148_
				+ is_1032_[5] * i_1149_ + 8192)
			       >> 14);
		int i_1157_ = ((is_1032_[6] * i_1147_ + is_1032_[7] * i_1148_
				+ is_1032_[8] * i_1149_ + 8192)
			       >> 14);
		i_1155_ += i_1128_;
		i_1156_ += i_1129_;
		i_1157_ += i_1130_;
		for (int i_1158_ = 0; i_1158_ < i_1033_; i_1158_++) {
		    int i_1159_ = is[i_1158_];
		    if (i_1159_
			< ((Class157_Sub3) this).anIntArrayArray9641.length) {
			int[] is_1160_ = (((Class157_Sub3) this)
					  .anIntArrayArray9641[i_1159_]);
			for (int i_1161_ = 0; i_1161_ < is_1160_.length;
			     i_1161_++) {
			    int i_1162_ = is_1160_[i_1161_];
			    if (((Class157_Sub3) this).aShortArray9642 == null
				|| ((i_1031_ & (((Class157_Sub3) this)
						.aShortArray9642[i_1162_]))
				    != 0)) {
				int i_1163_
				    = (is_1150_[0] * (((Class157_Sub3) this)
						      .anIntArray9679[i_1162_])
				       + is_1150_[1] * (((Class157_Sub3) this)
							.anIntArray9639
							[i_1162_])
				       + is_1150_[2] * (((Class157_Sub3) this)
							.anIntArray9648
							[i_1162_])
				       + 8192) >> 14;
				int i_1164_
				    = (is_1150_[3] * (((Class157_Sub3) this)
						      .anIntArray9679[i_1162_])
				       + is_1150_[4] * (((Class157_Sub3) this)
							.anIntArray9639
							[i_1162_])
				       + is_1150_[5] * (((Class157_Sub3) this)
							.anIntArray9648
							[i_1162_])
				       + 8192) >> 14;
				int i_1165_
				    = (is_1150_[6] * (((Class157_Sub3) this)
						      .anIntArray9679[i_1162_])
				       + is_1150_[7] * (((Class157_Sub3) this)
							.anIntArray9639
							[i_1162_])
				       + is_1150_[8] * (((Class157_Sub3) this)
							.anIntArray9648
							[i_1162_])
				       + 8192) >> 14;
				i_1163_ += i_1155_;
				i_1164_ += i_1156_;
				i_1165_ += i_1157_;
				((Class157_Sub3) this).anIntArray9679[i_1162_]
				    = i_1163_;
				((Class157_Sub3) this).anIntArray9639[i_1162_]
				    = i_1164_;
				((Class157_Sub3) this).anIntArray9648[i_1162_]
				    = i_1165_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1166_ = 0; i_1166_ < i_1033_; i_1166_++) {
		    int i_1167_ = is[i_1166_];
		    if (i_1167_
			< ((Class157_Sub3) this).anIntArrayArray9641.length) {
			int[] is_1168_ = (((Class157_Sub3) this)
					  .anIntArrayArray9641[i_1167_]);
			for (int i_1169_ = 0; i_1169_ < is_1168_.length;
			     i_1169_++) {
			    int i_1170_ = is_1168_[i_1169_];
			    if (((Class157_Sub3) this).aShortArray9642 == null
				|| ((i_1031_ & (((Class157_Sub3) this)
						.aShortArray9642[i_1170_]))
				    != 0)) {
				((Class157_Sub3) this).anIntArray9679[i_1170_]
				    -= anInt9694;
				((Class157_Sub3) this).anIntArray9639[i_1170_]
				    -= anInt9695;
				((Class157_Sub3) this).anIntArray9648[i_1170_]
				    -= anInt9696;
				((Class157_Sub3) this).anIntArray9679[i_1170_]
				    = (((Class157_Sub3) this).anIntArray9679
				       [i_1170_]) * i_1028_ >> 7;
				((Class157_Sub3) this).anIntArray9639[i_1170_]
				    = (((Class157_Sub3) this).anIntArray9639
				       [i_1170_]) * i_1029_ >> 7;
				((Class157_Sub3) this).anIntArray9648[i_1170_]
				    = (((Class157_Sub3) this).anIntArray9648
				       [i_1170_]) * i_1030_ >> 7;
				((Class157_Sub3) this).anIntArray9679[i_1170_]
				    += anInt9694;
				((Class157_Sub3) this).anIntArray9639[i_1170_]
				    += anInt9695;
				((Class157_Sub3) this).anIntArray9648[i_1170_]
				    += anInt9696;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class157_Sub3) this).anIntArrayArray9659 != null) {
		for (int i_1171_ = 0; i_1171_ < i_1033_; i_1171_++) {
		    int i_1172_ = is[i_1171_];
		    if (i_1172_
			< ((Class157_Sub3) this).anIntArrayArray9659.length) {
			int[] is_1173_ = (((Class157_Sub3) this)
					  .anIntArrayArray9659[i_1172_]);
			for (int i_1174_ = 0; i_1174_ < is_1173_.length;
			     i_1174_++) {
			    int i_1175_ = is_1173_[i_1174_];
			    if (((Class157_Sub3) this).aShortArray9677 == null
				|| ((i_1031_ & (((Class157_Sub3) this)
						.aShortArray9677[i_1175_]))
				    != 0)) {
				int i_1176_ = (((((Class157_Sub3) this)
						 .aByteArray9654[i_1175_])
						& 0xff)
					       + i_1028_ * 8);
				if (i_1176_ < 0)
				    i_1176_ = 0;
				else if (i_1176_ > 255)
				    i_1176_ = 255;
				((Class157_Sub3) this).aByteArray9654[i_1175_]
				    = (byte) i_1176_;
				if (((Class157_Sub3) this).aClass122_9662
				    != null)
				    ((Class122)
				     ((Class157_Sub3) this).aClass122_9662)
					.anInterface14_1542
					= null;
			    }
			}
		    }
		}
		if (((Class157_Sub3) this).aClass145Array9684 != null) {
		    for (int i_1177_ = 0;
			 i_1177_ < ((Class157_Sub3) this).anInt9685;
			 i_1177_++) {
			Class145 class145 = (((Class157_Sub3) this)
					     .aClass145Array9684[i_1177_]);
			Class113 class113 = (((Class157_Sub3) this)
					     .aClass113Array9687[i_1177_]);
			((Class113) class113).anInt1406
			    = (((Class113) class113).anInt1406 & 0xffffff
			       | 255 - ((((Class157_Sub3) this).aByteArray9654
					 [((Class145) class145).anInt1655])
					& 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (((Class157_Sub3) this).anIntArrayArray9659 != null) {
		for (int i_1178_ = 0; i_1178_ < i_1033_; i_1178_++) {
		    int i_1179_ = is[i_1178_];
		    if (i_1179_
			< ((Class157_Sub3) this).anIntArrayArray9659.length) {
			int[] is_1180_ = (((Class157_Sub3) this)
					  .anIntArrayArray9659[i_1179_]);
			for (int i_1181_ = 0; i_1181_ < is_1180_.length;
			     i_1181_++) {
			    int i_1182_ = is_1180_[i_1181_];
			    if (((Class157_Sub3) this).aShortArray9677 == null
				|| ((i_1031_ & (((Class157_Sub3) this)
						.aShortArray9677[i_1182_]))
				    != 0)) {
				int i_1183_ = ((((Class157_Sub3) this)
						.aShortArray9653[i_1182_])
					       & 0xffff);
				int i_1184_ = i_1183_ >> 10 & 0x3f;
				int i_1185_ = i_1183_ >> 7 & 0x7;
				int i_1186_ = i_1183_ & 0x7f;
				i_1184_ = i_1184_ + i_1028_ & 0x3f;
				i_1185_ += i_1029_ / 4;
				if (i_1185_ < 0)
				    i_1185_ = 0;
				else if (i_1185_ > 7)
				    i_1185_ = 7;
				i_1186_ += i_1030_;
				if (i_1186_ < 0)
				    i_1186_ = 0;
				else if (i_1186_ > 127)
				    i_1186_ = 127;
				((Class157_Sub3) this).aShortArray9653[i_1182_]
				    = (short) (i_1184_ << 10 | i_1185_ << 7
					       | i_1186_);
				if (((Class157_Sub3) this).aClass122_9662
				    != null)
				    ((Class122)
				     ((Class157_Sub3) this).aClass122_9662)
					.anInterface14_1542
					= null;
			    }
			}
		    }
		}
		if (((Class157_Sub3) this).aClass145Array9684 != null) {
		    for (int i_1187_ = 0;
			 i_1187_ < ((Class157_Sub3) this).anInt9685;
			 i_1187_++) {
			Class145 class145 = (((Class157_Sub3) this)
					     .aClass145Array9684[i_1187_]);
			Class113 class113 = (((Class157_Sub3) this)
					     .aClass113Array9687[i_1187_]);
			((Class113) class113).anInt1406
			    = (((Class113) class113).anInt1406 & ~0xffffff
			       | (Class649.anIntArray8420
				  [((((Class157_Sub3) this).aShortArray9653
				     [((Class145) class145).anInt1655])
				    & 0xffff)]) & 0xffffff);
		    }
		}
	    }
	} else if (i == 8) {
	    if (((Class157_Sub3) this).anIntArrayArray9691 != null) {
		for (int i_1188_ = 0; i_1188_ < i_1033_; i_1188_++) {
		    int i_1189_ = is[i_1188_];
		    if (i_1189_
			< ((Class157_Sub3) this).anIntArrayArray9691.length) {
			int[] is_1190_ = (((Class157_Sub3) this)
					  .anIntArrayArray9691[i_1189_]);
			for (int i_1191_ = 0; i_1191_ < is_1190_.length;
			     i_1191_++) {
			    Class113 class113
				= (((Class157_Sub3) this).aClass113Array9687
				   [is_1190_[i_1191_]]);
			    ((Class113) class113).anInt1402 += i_1028_;
			    ((Class113) class113).anInt1405 += i_1029_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class157_Sub3) this).anIntArrayArray9691 != null) {
		for (int i_1192_ = 0; i_1192_ < i_1033_; i_1192_++) {
		    int i_1193_ = is[i_1192_];
		    if (i_1193_
			< ((Class157_Sub3) this).anIntArrayArray9691.length) {
			int[] is_1194_ = (((Class157_Sub3) this)
					  .anIntArrayArray9691[i_1193_]);
			for (int i_1195_ = 0; i_1195_ < is_1194_.length;
			     i_1195_++) {
			    Class113 class113
				= (((Class157_Sub3) this).aClass113Array9687
				   [is_1194_[i_1195_]]);
			    ((Class113) class113).anInt1403
				= (((Class113) class113).anInt1403 * i_1028_
				   >> 7);
			    ((Class113) class113).anInt1404
				= (((Class113) class113).anInt1404 * i_1029_
				   >> 7);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class157_Sub3) this).anIntArrayArray9691 != null) {
		for (int i_1196_ = 0; i_1196_ < i_1033_; i_1196_++) {
		    int i_1197_ = is[i_1196_];
		    if (i_1197_
			< ((Class157_Sub3) this).anIntArrayArray9691.length) {
			int[] is_1198_ = (((Class157_Sub3) this)
					  .anIntArrayArray9691[i_1197_]);
			for (int i_1199_ = 0; i_1199_ < is_1198_.length;
			     i_1199_++) {
			    Class113 class113
				= (((Class157_Sub3) this).aClass113Array9687
				   [is_1198_[i_1199_]]);
			    ((Class113) class113).anInt1407
				= (((Class113) class113).anInt1407 + i_1028_
				   & 0x3fff);
			}
		    }
		}
	    }
	}
    }
    
    public void method1931(int i) {
	((Class157_Sub3) this).anInt9629 = i;
	if (((Class157_Sub3) this).aClass143_9671 != null
	    && (((Class157_Sub3) this).anInt9629 & 0x10000) == 0) {
	    ((Class157_Sub3) this).aShortArray9673
		= (((Class143) ((Class157_Sub3) this).aClass143_9671)
		   .aShortArray1644);
	    ((Class157_Sub3) this).aShortArray9645
		= (((Class143) ((Class157_Sub3) this).aClass143_9671)
		   .aShortArray1642);
	    ((Class157_Sub3) this).aShortArray9646
		= (((Class143) ((Class157_Sub3) this).aClass143_9671)
		   .aShortArray1643);
	    ((Class157_Sub3) this).aByteArray9647
		= (((Class143) ((Class157_Sub3) this).aClass143_9671)
		   .aByteArray1641);
	    ((Class157_Sub3) this).aClass143_9671 = null;
	}
	((Class157_Sub3) this).aBool9668 = true;
	method8886();
    }
    
    void method1961(int i, int i_1200_, int i_1201_, int i_1202_) {
	if (i == 0) {
	    int i_1203_ = 0;
	    anInt9694 = 0;
	    anInt9695 = 0;
	    anInt9696 = 0;
	    for (int i_1204_ = 0; i_1204_ < ((Class157_Sub3) this).anInt9637;
		 i_1204_++) {
		anInt9694 += ((Class157_Sub3) this).anIntArray9679[i_1204_];
		anInt9695 += ((Class157_Sub3) this).anIntArray9639[i_1204_];
		anInt9696 += ((Class157_Sub3) this).anIntArray9648[i_1204_];
		i_1203_++;
	    }
	    if (i_1203_ > 0) {
		anInt9694 = anInt9694 / i_1203_ + i_1200_;
		anInt9695 = anInt9695 / i_1203_ + i_1201_;
		anInt9696 = anInt9696 / i_1203_ + i_1202_;
	    } else {
		anInt9694 = i_1200_;
		anInt9695 = i_1201_;
		anInt9696 = i_1202_;
	    }
	} else if (i == 1) {
	    for (int i_1205_ = 0; i_1205_ < ((Class157_Sub3) this).anInt9637;
		 i_1205_++) {
		((Class157_Sub3) this).anIntArray9679[i_1205_] += i_1200_;
		((Class157_Sub3) this).anIntArray9639[i_1205_] += i_1201_;
		((Class157_Sub3) this).anIntArray9648[i_1205_] += i_1202_;
	    }
	} else if (i == 2) {
	    for (int i_1206_ = 0; i_1206_ < ((Class157_Sub3) this).anInt9637;
		 i_1206_++) {
		((Class157_Sub3) this).anIntArray9679[i_1206_] -= anInt9694;
		((Class157_Sub3) this).anIntArray9639[i_1206_] -= anInt9695;
		((Class157_Sub3) this).anIntArray9648[i_1206_] -= anInt9696;
		if (i_1202_ != 0) {
		    int i_1207_ = Class417.anIntArray4766[i_1202_];
		    int i_1208_ = Class417.anIntArray4767[i_1202_];
		    int i_1209_
			= (((((Class157_Sub3) this).anIntArray9639[i_1206_]
			     * i_1207_)
			    + (((Class157_Sub3) this).anIntArray9679[i_1206_]
			       * i_1208_)
			    + 16383)
			   >> 14);
		    ((Class157_Sub3) this).anIntArray9639[i_1206_]
			= ((((Class157_Sub3) this).anIntArray9639[i_1206_]
			    * i_1208_)
			   - (((Class157_Sub3) this).anIntArray9679[i_1206_]
			      * i_1207_)
			   + 16383) >> 14;
		    ((Class157_Sub3) this).anIntArray9679[i_1206_] = i_1209_;
		}
		if (i_1200_ != 0) {
		    int i_1210_ = Class417.anIntArray4766[i_1200_];
		    int i_1211_ = Class417.anIntArray4767[i_1200_];
		    int i_1212_
			= (((((Class157_Sub3) this).anIntArray9639[i_1206_]
			     * i_1211_)
			    - (((Class157_Sub3) this).anIntArray9648[i_1206_]
			       * i_1210_)
			    + 16383)
			   >> 14);
		    ((Class157_Sub3) this).anIntArray9648[i_1206_]
			= ((((Class157_Sub3) this).anIntArray9639[i_1206_]
			    * i_1210_)
			   + (((Class157_Sub3) this).anIntArray9648[i_1206_]
			      * i_1211_)
			   + 16383) >> 14;
		    ((Class157_Sub3) this).anIntArray9639[i_1206_] = i_1212_;
		}
		if (i_1201_ != 0) {
		    int i_1213_ = Class417.anIntArray4766[i_1201_];
		    int i_1214_ = Class417.anIntArray4767[i_1201_];
		    int i_1215_
			= (((((Class157_Sub3) this).anIntArray9648[i_1206_]
			     * i_1213_)
			    + (((Class157_Sub3) this).anIntArray9679[i_1206_]
			       * i_1214_)
			    + 16383)
			   >> 14);
		    ((Class157_Sub3) this).anIntArray9648[i_1206_]
			= ((((Class157_Sub3) this).anIntArray9648[i_1206_]
			    * i_1214_)
			   - (((Class157_Sub3) this).anIntArray9679[i_1206_]
			      * i_1213_)
			   + 16383) >> 14;
		    ((Class157_Sub3) this).anIntArray9679[i_1206_] = i_1215_;
		}
		((Class157_Sub3) this).anIntArray9679[i_1206_] += anInt9694;
		((Class157_Sub3) this).anIntArray9639[i_1206_] += anInt9695;
		((Class157_Sub3) this).anIntArray9648[i_1206_] += anInt9696;
	    }
	} else if (i == 3) {
	    for (int i_1216_ = 0; i_1216_ < ((Class157_Sub3) this).anInt9637;
		 i_1216_++) {
		((Class157_Sub3) this).anIntArray9679[i_1216_] -= anInt9694;
		((Class157_Sub3) this).anIntArray9639[i_1216_] -= anInt9695;
		((Class157_Sub3) this).anIntArray9648[i_1216_] -= anInt9696;
		((Class157_Sub3) this).anIntArray9679[i_1216_]
		    = (((Class157_Sub3) this).anIntArray9679[i_1216_] * i_1200_
		       / 128);
		((Class157_Sub3) this).anIntArray9639[i_1216_]
		    = (((Class157_Sub3) this).anIntArray9639[i_1216_] * i_1201_
		       / 128);
		((Class157_Sub3) this).anIntArray9648[i_1216_]
		    = (((Class157_Sub3) this).anIntArray9648[i_1216_] * i_1202_
		       / 128);
		((Class157_Sub3) this).anIntArray9679[i_1216_] += anInt9694;
		((Class157_Sub3) this).anIntArray9639[i_1216_] += anInt9695;
		((Class157_Sub3) this).anIntArray9648[i_1216_] += anInt9696;
	    }
	} else if (i == 5) {
	    for (int i_1217_ = 0; i_1217_ < ((Class157_Sub3) this).anInt9651;
		 i_1217_++) {
		int i_1218_
		    = ((((Class157_Sub3) this).aByteArray9654[i_1217_] & 0xff)
		       + i_1200_ * 8);
		if (i_1218_ < 0)
		    i_1218_ = 0;
		else if (i_1218_ > 255)
		    i_1218_ = 255;
		((Class157_Sub3) this).aByteArray9654[i_1217_]
		    = (byte) i_1218_;
	    }
	    if (((Class157_Sub3) this).aClass122_9662 != null)
		((Class122) ((Class157_Sub3) this).aClass122_9662)
		    .anInterface14_1542
		    = null;
	    if (((Class157_Sub3) this).aClass145Array9684 != null) {
		for (int i_1219_ = 0;
		     i_1219_ < ((Class157_Sub3) this).anInt9685; i_1219_++) {
		    Class145 class145
			= ((Class157_Sub3) this).aClass145Array9684[i_1219_];
		    Class113 class113
			= ((Class157_Sub3) this).aClass113Array9687[i_1219_];
		    ((Class113) class113).anInt1406
			= (((Class113) class113).anInt1406 & 0xffffff
			   | 255 - ((((Class157_Sub3) this).aByteArray9654
				     [((Class145) class145).anInt1655])
				    & 0xff) << 24);
		}
	    }
	} else if (i == 7) {
	    for (int i_1220_ = 0; i_1220_ < ((Class157_Sub3) this).anInt9651;
		 i_1220_++) {
		int i_1221_
		    = ((Class157_Sub3) this).aShortArray9653[i_1220_] & 0xffff;
		int i_1222_ = i_1221_ >> 10 & 0x3f;
		int i_1223_ = i_1221_ >> 7 & 0x7;
		int i_1224_ = i_1221_ & 0x7f;
		i_1222_ = i_1222_ + i_1200_ & 0x3f;
		i_1223_ += i_1201_ / 4;
		if (i_1223_ < 0)
		    i_1223_ = 0;
		else if (i_1223_ > 7)
		    i_1223_ = 7;
		i_1224_ += i_1202_;
		if (i_1224_ < 0)
		    i_1224_ = 0;
		else if (i_1224_ > 127)
		    i_1224_ = 127;
		((Class157_Sub3) this).aShortArray9653[i_1220_]
		    = (short) (i_1222_ << 10 | i_1223_ << 7 | i_1224_);
	    }
	    if (((Class157_Sub3) this).aClass122_9662 != null)
		((Class122) ((Class157_Sub3) this).aClass122_9662)
		    .anInterface14_1542
		    = null;
	    if (((Class157_Sub3) this).aClass145Array9684 != null) {
		for (int i_1225_ = 0;
		     i_1225_ < ((Class157_Sub3) this).anInt9685; i_1225_++) {
		    Class145 class145
			= ((Class157_Sub3) this).aClass145Array9684[i_1225_];
		    Class113 class113
			= ((Class157_Sub3) this).aClass113Array9687[i_1225_];
		    ((Class113) class113).anInt1406
			= (((Class113) class113).anInt1406 & ~0xffffff
			   | ((Class649.anIntArray8420
			       [(((Class157_Sub3) this).aShortArray9653
				 [((Class145) class145).anInt1655]) & 0xffff])
			      & 0xffffff));
		}
	    }
	} else if (i == 8) {
	    for (int i_1226_ = 0; i_1226_ < ((Class157_Sub3) this).anInt9685;
		 i_1226_++) {
		Class113 class113
		    = ((Class157_Sub3) this).aClass113Array9687[i_1226_];
		((Class113) class113).anInt1402 += i_1200_;
		((Class113) class113).anInt1405 += i_1201_;
	    }
	} else if (i == 10) {
	    for (int i_1227_ = 0; i_1227_ < ((Class157_Sub3) this).anInt9685;
		 i_1227_++) {
		Class113 class113
		    = ((Class157_Sub3) this).aClass113Array9687[i_1227_];
		((Class113) class113).anInt1403
		    = ((Class113) class113).anInt1403 * i_1200_ >> 7;
		((Class113) class113).anInt1404
		    = ((Class113) class113).anInt1404 * i_1201_ >> 7;
	    }
	} else if (i == 9) {
	    for (int i_1228_ = 0; i_1228_ < ((Class157_Sub3) this).anInt9685;
		 i_1228_++) {
		Class113 class113
		    = ((Class157_Sub3) this).aClass113Array9687[i_1228_];
		((Class113) class113).anInt1407
		    = ((Class113) class113).anInt1407 + i_1200_ & 0x3fff;
	    }
	}
    }
    
    public void method1957() {
	for (int i = 0; i < ((Class157_Sub3) this).anInt9637; i++)
	    ((Class157_Sub3) this).anIntArray9648[i]
		= -((Class157_Sub3) this).anIntArray9648[i];
	for (int i = 0; i < ((Class157_Sub3) this).anInt9623; i++)
	    ((Class157_Sub3) this).aShortArray9646[i]
		= (short) -((Class157_Sub3) this).aShortArray9646[i];
	for (int i = 0; i < ((Class157_Sub3) this).anInt9651; i++) {
	    short i_1229_ = ((Class157_Sub3) this).aShortArray9655[i];
	    ((Class157_Sub3) this).aShortArray9655[i]
		= ((Class157_Sub3) this).aShortArray9657[i];
	    ((Class157_Sub3) this).aShortArray9657[i] = i_1229_;
	}
	if (((Class157_Sub3) this).aClass122_9663 == null
	    && ((Class157_Sub3) this).aClass122_9662 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9662)
		.anInterface14_1542
		= null;
	if (((Class157_Sub3) this).aClass122_9663 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9663)
		.anInterface14_1542
		= null;
	if (((Class157_Sub3) this).aClass122_9661 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9661)
		.anInterface14_1542
		= null;
	if (((Class157_Sub3) this).aClass129_9665 != null)
	    ((Class129) ((Class157_Sub3) this).aClass129_9665)
		.anInterface16_1588
		= null;
	((Class157_Sub3) this).aBool9649 = false;
    }
    
    public void method1963(Class433 class433, int i, boolean bool) {
	if (((Class157_Sub3) this).aShortArray9642 != null) {
	    Class433 class433_1230_ = class433;
	    if (bool) {
		class433_1230_
		    = ((Class173_Sub2) (((Class157_Sub3) this)
					.aClass173_Sub2_9628)).aClass433_9500;
		class433_1230_.method5244(class433);
	    }
	    float[] fs = new float[3];
	    for (int i_1231_ = 0; i_1231_ < ((Class157_Sub3) this).anInt9637;
		 i_1231_++) {
		if ((i & ((Class157_Sub3) this).aShortArray9642[i_1231_])
		    != 0) {
		    class433_1230_.method5233((float) (((Class157_Sub3) this)
						       .anIntArray9679
						       [i_1231_]),
					      (float) (((Class157_Sub3) this)
						       .anIntArray9639
						       [i_1231_]),
					      (float) (((Class157_Sub3) this)
						       .anIntArray9648
						       [i_1231_]),
					      fs);
		    ((Class157_Sub3) this).anIntArray9679[i_1231_]
			= (int) fs[0];
		    ((Class157_Sub3) this).anIntArray9639[i_1231_]
			= (int) fs[1];
		    ((Class157_Sub3) this).anIntArray9648[i_1231_]
			= (int) fs[2];
		}
	    }
	}
    }
    
    public void method1935() {
	if (((Class157_Sub3) this).anInt9623 > 0
	    && ((Class157_Sub3) this).anInt9652 > 0) {
	    method8892(false);
	    if ((((Class157_Sub3) this).aByte9669 & 0x10) == 0
		&& (((Class129) ((Class157_Sub3) this).aClass129_9665)
		    .anInterface16_1588) == null)
		method8889(false);
	    method8886();
	}
    }
    
    public void method1965(Class433 class433, Class159 class159, int i) {
	if ((i & 0x2) != 0)
	    OpenGL.glPolygonMode(1032, 6913);
	if (((Class157_Sub3) this).anInt9623 != 0) {
	    Class418 class418
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .aClass418_9533);
	    Class418 class418_1232_
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .aClass418_9501);
	    Class418 class418_1233_
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .aClass418_9502);
	    class418_1232_.method5035(class433);
	    class418_1233_.method4986(class418_1232_);
	    class418_1233_.method4974(((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aClass418_9489);
	    if (!((Class157_Sub3) this).aBool9649)
		method8893();
	    float[] fs
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .aFloatArray9467);
	    class418_1232_.method5030(0.0F, (float) (((Class157_Sub3) this)
						     .aShort9670), 0.0F, fs);
	    float f = fs[0];
	    float f_1234_ = fs[1];
	    float f_1235_ = fs[2];
	    class418_1232_.method5030(0.0F, (float) (((Class157_Sub3) this)
						     .aShort9693), 0.0F, fs);
	    float f_1236_ = fs[0];
	    float f_1237_ = fs[1];
	    float f_1238_ = fs[2];
	    for (int i_1239_ = 0; i_1239_ < 6; i_1239_++) {
		float[] fs_1240_ = (((Class173_Sub2) (((Class157_Sub3) this)
						      .aClass173_Sub2_9628))
				    .aFloatArrayArray9490[i_1239_]);
		float f_1241_ = (fs_1240_[0] * f + fs_1240_[1] * f_1234_
				 + fs_1240_[2] * f_1235_ + fs_1240_[3]
				 + (float) ((Class157_Sub3) this).anInt9681);
		float f_1242_ = (fs_1240_[0] * f_1236_ + fs_1240_[1] * f_1237_
				 + fs_1240_[2] * f_1238_ + fs_1240_[3]
				 + (float) ((Class157_Sub3) this).anInt9681);
		if (f_1241_ < 0.0F && f_1242_ < 0.0F)
		    return;
	    }
	    if (class159 != null) {
		boolean bool = false;
		boolean bool_1243_ = true;
		int i_1244_ = ((((Class157_Sub3) this).aShort9674
				+ ((Class157_Sub3) this).aShort9688)
			       >> 1);
		int i_1245_ = ((((Class157_Sub3) this).aShort9676
				+ ((Class157_Sub3) this).aShort9644)
			       >> 1);
		int i_1246_ = i_1244_;
		short i_1247_ = ((Class157_Sub3) this).aShort9670;
		int i_1248_ = i_1245_;
		float f_1249_
		    = (class418_1233_.aFloatArray4768[0] * (float) i_1246_
		       + class418_1233_.aFloatArray4768[4] * (float) i_1247_
		       + class418_1233_.aFloatArray4768[8] * (float) i_1248_
		       + class418_1233_.aFloatArray4768[12]);
		float f_1250_
		    = (class418_1233_.aFloatArray4768[1] * (float) i_1246_
		       + class418_1233_.aFloatArray4768[5] * (float) i_1247_
		       + class418_1233_.aFloatArray4768[9] * (float) i_1248_
		       + class418_1233_.aFloatArray4768[13]);
		float f_1251_
		    = (class418_1233_.aFloatArray4768[2] * (float) i_1246_
		       + class418_1233_.aFloatArray4768[6] * (float) i_1247_
		       + class418_1233_.aFloatArray4768[10] * (float) i_1248_
		       + class418_1233_.aFloatArray4768[14]);
		float f_1252_
		    = (class418_1233_.aFloatArray4768[3] * (float) i_1246_
		       + class418_1233_.aFloatArray4768[7] * (float) i_1247_
		       + class418_1233_.aFloatArray4768[11] * (float) i_1248_
		       + class418_1233_.aFloatArray4768[15]);
		if (f_1251_ >= -f_1252_) {
		    class159.anInt1748
			= (int) ((((Class173_Sub2)
				   ((Class157_Sub3) this).aClass173_Sub2_9628)
				  .aFloat9607)
				 + (((Class173_Sub2) (((Class157_Sub3) this)
						      .aClass173_Sub2_9628))
				    .aFloat9493) * f_1249_ / f_1252_);
		    class159.anInt1750
			= (int) ((((Class173_Sub2)
				   ((Class157_Sub3) this).aClass173_Sub2_9628)
				  .aFloat9494)
				 + (((Class173_Sub2) (((Class157_Sub3) this)
						      .aClass173_Sub2_9628))
				    .aFloat9534) * f_1250_ / f_1252_);
		} else
		    bool = true;
		i_1246_ = i_1244_;
		i_1247_ = ((Class157_Sub3) this).aShort9693;
		i_1248_ = i_1245_;
		float f_1253_
		    = (class418_1233_.aFloatArray4768[0] * (float) i_1246_
		       + class418_1233_.aFloatArray4768[4] * (float) i_1247_
		       + class418_1233_.aFloatArray4768[8] * (float) i_1248_
		       + class418_1233_.aFloatArray4768[12]);
		float f_1254_
		    = (class418_1233_.aFloatArray4768[1] * (float) i_1246_
		       + class418_1233_.aFloatArray4768[5] * (float) i_1247_
		       + class418_1233_.aFloatArray4768[9] * (float) i_1248_
		       + class418_1233_.aFloatArray4768[13]);
		float f_1255_
		    = (class418_1233_.aFloatArray4768[2] * (float) i_1246_
		       + class418_1233_.aFloatArray4768[6] * (float) i_1247_
		       + class418_1233_.aFloatArray4768[10] * (float) i_1248_
		       + class418_1233_.aFloatArray4768[14]);
		float f_1256_
		    = (class418_1233_.aFloatArray4768[3] * (float) i_1246_
		       + class418_1233_.aFloatArray4768[7] * (float) i_1247_
		       + class418_1233_.aFloatArray4768[11] * (float) i_1248_
		       + class418_1233_.aFloatArray4768[15]);
		if (f_1255_ >= -f_1256_) {
		    class159.anInt1749
			= (int) ((((Class173_Sub2)
				   ((Class157_Sub3) this).aClass173_Sub2_9628)
				  .aFloat9607)
				 + (((Class173_Sub2) (((Class157_Sub3) this)
						      .aClass173_Sub2_9628))
				    .aFloat9493) * f_1253_ / f_1256_);
		    class159.anInt1752
			= (int) ((((Class173_Sub2)
				   ((Class157_Sub3) this).aClass173_Sub2_9628)
				  .aFloat9494)
				 + (((Class173_Sub2) (((Class157_Sub3) this)
						      .aClass173_Sub2_9628))
				    .aFloat9534) * f_1254_ / f_1256_);
		} else
		    bool = true;
		if (bool) {
		    if (f_1251_ < -f_1252_ && f_1255_ < -f_1256_)
			bool_1243_ = false;
		    else if (f_1251_ < -f_1252_) {
			float f_1257_
			    = (f_1251_ + f_1252_) / (f_1255_ + f_1256_) - 1.0F;
			float f_1258_
			    = f_1249_ + f_1257_ * (f_1253_ - f_1249_);
			float f_1259_
			    = f_1250_ + f_1257_ * (f_1254_ - f_1250_);
			float f_1260_
			    = f_1252_ + f_1257_ * (f_1256_ - f_1252_);
			class159.anInt1748
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9607)
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9493
					* f_1258_ / f_1260_));
			class159.anInt1750
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9494)
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9534
					* f_1259_ / f_1260_));
		    } else if (f_1255_ < -f_1256_) {
			float f_1261_
			    = (f_1255_ + f_1256_) / (f_1251_ + f_1252_) - 1.0F;
			float f_1262_
			    = f_1253_ + f_1261_ * (f_1249_ - f_1253_);
			float f_1263_
			    = f_1254_ + f_1261_ * (f_1250_ - f_1254_);
			float f_1264_
			    = f_1256_ + f_1261_ * (f_1252_ - f_1256_);
			class159.anInt1749
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9607)
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9493
					* f_1262_ / f_1264_));
			class159.anInt1752
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9494)
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9534
					* f_1263_ / f_1264_));
		    }
		}
		if (bool_1243_) {
		    if (f_1251_ / f_1252_ > f_1255_ / f_1256_) {
			float f_1265_
			    = (f_1249_
			       + (class418.aFloatArray4768[0]
				  * (float) ((Class157_Sub3) this).anInt9681)
			       + class418.aFloatArray4768[12]);
			float f_1266_
			    = (f_1252_
			       + (class418.aFloatArray4768[3]
				  * (float) ((Class157_Sub3) this).anInt9681)
			       + class418.aFloatArray4768[15]);
			class159.anInt1753
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9607)
				     - (float) class159.anInt1748
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9493
					* f_1265_ / f_1266_));
		    } else {
			float f_1267_
			    = (f_1253_
			       + (class418.aFloatArray4768[0]
				  * (float) ((Class157_Sub3) this).anInt9681)
			       + class418.aFloatArray4768[12]);
			float f_1268_
			    = (f_1256_
			       + (class418.aFloatArray4768[3]
				  * (float) ((Class157_Sub3) this).anInt9681)
			       + class418.aFloatArray4768[15]);
			class159.anInt1753
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9607)
				     - (float) class159.anInt1749
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9493
					* f_1267_ / f_1268_));
		    }
		    class159.aBool1751 = true;
		}
	    }
	    ((Class157_Sub3) this).aClass173_Sub2_9628.method8772();
	    ((Class157_Sub3) this).aClass173_Sub2_9628
		.method8752(class418_1232_);
	    method8887();
	    ((Class157_Sub3) this).aClass173_Sub2_9628.method8760();
	    class418_1232_.method4974(((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aClass418_9485);
	    method8888(class418_1232_);
	    if ((i & 0x2) != 0)
		OpenGL.glPolygonMode(1028, 6914);
	}
    }
    
    public void method1966(Class433 class433, Class159 class159, int i) {
	if ((i & 0x2) != 0)
	    OpenGL.glPolygonMode(1032, 6913);
	if (((Class157_Sub3) this).anInt9623 != 0) {
	    Class418 class418
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .aClass418_9533);
	    Class418 class418_1269_
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .aClass418_9501);
	    Class418 class418_1270_
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .aClass418_9502);
	    class418_1269_.method5035(class433);
	    class418_1270_.method4986(class418_1269_);
	    class418_1270_.method4974(((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aClass418_9489);
	    if (!((Class157_Sub3) this).aBool9649)
		method8893();
	    float[] fs
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .aFloatArray9467);
	    class418_1269_.method5030(0.0F, (float) (((Class157_Sub3) this)
						     .aShort9670), 0.0F, fs);
	    float f = fs[0];
	    float f_1271_ = fs[1];
	    float f_1272_ = fs[2];
	    class418_1269_.method5030(0.0F, (float) (((Class157_Sub3) this)
						     .aShort9693), 0.0F, fs);
	    float f_1273_ = fs[0];
	    float f_1274_ = fs[1];
	    float f_1275_ = fs[2];
	    for (int i_1276_ = 0; i_1276_ < 6; i_1276_++) {
		float[] fs_1277_ = (((Class173_Sub2) (((Class157_Sub3) this)
						      .aClass173_Sub2_9628))
				    .aFloatArrayArray9490[i_1276_]);
		float f_1278_ = (fs_1277_[0] * f + fs_1277_[1] * f_1271_
				 + fs_1277_[2] * f_1272_ + fs_1277_[3]
				 + (float) ((Class157_Sub3) this).anInt9681);
		float f_1279_ = (fs_1277_[0] * f_1273_ + fs_1277_[1] * f_1274_
				 + fs_1277_[2] * f_1275_ + fs_1277_[3]
				 + (float) ((Class157_Sub3) this).anInt9681);
		if (f_1278_ < 0.0F && f_1279_ < 0.0F)
		    return;
	    }
	    if (class159 != null) {
		boolean bool = false;
		boolean bool_1280_ = true;
		int i_1281_ = ((((Class157_Sub3) this).aShort9674
				+ ((Class157_Sub3) this).aShort9688)
			       >> 1);
		int i_1282_ = ((((Class157_Sub3) this).aShort9676
				+ ((Class157_Sub3) this).aShort9644)
			       >> 1);
		int i_1283_ = i_1281_;
		short i_1284_ = ((Class157_Sub3) this).aShort9670;
		int i_1285_ = i_1282_;
		float f_1286_
		    = (class418_1270_.aFloatArray4768[0] * (float) i_1283_
		       + class418_1270_.aFloatArray4768[4] * (float) i_1284_
		       + class418_1270_.aFloatArray4768[8] * (float) i_1285_
		       + class418_1270_.aFloatArray4768[12]);
		float f_1287_
		    = (class418_1270_.aFloatArray4768[1] * (float) i_1283_
		       + class418_1270_.aFloatArray4768[5] * (float) i_1284_
		       + class418_1270_.aFloatArray4768[9] * (float) i_1285_
		       + class418_1270_.aFloatArray4768[13]);
		float f_1288_
		    = (class418_1270_.aFloatArray4768[2] * (float) i_1283_
		       + class418_1270_.aFloatArray4768[6] * (float) i_1284_
		       + class418_1270_.aFloatArray4768[10] * (float) i_1285_
		       + class418_1270_.aFloatArray4768[14]);
		float f_1289_
		    = (class418_1270_.aFloatArray4768[3] * (float) i_1283_
		       + class418_1270_.aFloatArray4768[7] * (float) i_1284_
		       + class418_1270_.aFloatArray4768[11] * (float) i_1285_
		       + class418_1270_.aFloatArray4768[15]);
		if (f_1288_ >= -f_1289_) {
		    class159.anInt1748
			= (int) ((((Class173_Sub2)
				   ((Class157_Sub3) this).aClass173_Sub2_9628)
				  .aFloat9607)
				 + (((Class173_Sub2) (((Class157_Sub3) this)
						      .aClass173_Sub2_9628))
				    .aFloat9493) * f_1286_ / f_1289_);
		    class159.anInt1750
			= (int) ((((Class173_Sub2)
				   ((Class157_Sub3) this).aClass173_Sub2_9628)
				  .aFloat9494)
				 + (((Class173_Sub2) (((Class157_Sub3) this)
						      .aClass173_Sub2_9628))
				    .aFloat9534) * f_1287_ / f_1289_);
		} else
		    bool = true;
		i_1283_ = i_1281_;
		i_1284_ = ((Class157_Sub3) this).aShort9693;
		i_1285_ = i_1282_;
		float f_1290_
		    = (class418_1270_.aFloatArray4768[0] * (float) i_1283_
		       + class418_1270_.aFloatArray4768[4] * (float) i_1284_
		       + class418_1270_.aFloatArray4768[8] * (float) i_1285_
		       + class418_1270_.aFloatArray4768[12]);
		float f_1291_
		    = (class418_1270_.aFloatArray4768[1] * (float) i_1283_
		       + class418_1270_.aFloatArray4768[5] * (float) i_1284_
		       + class418_1270_.aFloatArray4768[9] * (float) i_1285_
		       + class418_1270_.aFloatArray4768[13]);
		float f_1292_
		    = (class418_1270_.aFloatArray4768[2] * (float) i_1283_
		       + class418_1270_.aFloatArray4768[6] * (float) i_1284_
		       + class418_1270_.aFloatArray4768[10] * (float) i_1285_
		       + class418_1270_.aFloatArray4768[14]);
		float f_1293_
		    = (class418_1270_.aFloatArray4768[3] * (float) i_1283_
		       + class418_1270_.aFloatArray4768[7] * (float) i_1284_
		       + class418_1270_.aFloatArray4768[11] * (float) i_1285_
		       + class418_1270_.aFloatArray4768[15]);
		if (f_1292_ >= -f_1293_) {
		    class159.anInt1749
			= (int) ((((Class173_Sub2)
				   ((Class157_Sub3) this).aClass173_Sub2_9628)
				  .aFloat9607)
				 + (((Class173_Sub2) (((Class157_Sub3) this)
						      .aClass173_Sub2_9628))
				    .aFloat9493) * f_1290_ / f_1293_);
		    class159.anInt1752
			= (int) ((((Class173_Sub2)
				   ((Class157_Sub3) this).aClass173_Sub2_9628)
				  .aFloat9494)
				 + (((Class173_Sub2) (((Class157_Sub3) this)
						      .aClass173_Sub2_9628))
				    .aFloat9534) * f_1291_ / f_1293_);
		} else
		    bool = true;
		if (bool) {
		    if (f_1288_ < -f_1289_ && f_1292_ < -f_1293_)
			bool_1280_ = false;
		    else if (f_1288_ < -f_1289_) {
			float f_1294_
			    = (f_1288_ + f_1289_) / (f_1292_ + f_1293_) - 1.0F;
			float f_1295_
			    = f_1286_ + f_1294_ * (f_1290_ - f_1286_);
			float f_1296_
			    = f_1287_ + f_1294_ * (f_1291_ - f_1287_);
			float f_1297_
			    = f_1289_ + f_1294_ * (f_1293_ - f_1289_);
			class159.anInt1748
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9607)
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9493
					* f_1295_ / f_1297_));
			class159.anInt1750
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9494)
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9534
					* f_1296_ / f_1297_));
		    } else if (f_1292_ < -f_1293_) {
			float f_1298_
			    = (f_1292_ + f_1293_) / (f_1288_ + f_1289_) - 1.0F;
			float f_1299_
			    = f_1290_ + f_1298_ * (f_1286_ - f_1290_);
			float f_1300_
			    = f_1291_ + f_1298_ * (f_1287_ - f_1291_);
			float f_1301_
			    = f_1293_ + f_1298_ * (f_1289_ - f_1293_);
			class159.anInt1749
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9607)
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9493
					* f_1299_ / f_1301_));
			class159.anInt1752
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9494)
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9534
					* f_1300_ / f_1301_));
		    }
		}
		if (bool_1280_) {
		    if (f_1288_ / f_1289_ > f_1292_ / f_1293_) {
			float f_1302_
			    = (f_1286_
			       + (class418.aFloatArray4768[0]
				  * (float) ((Class157_Sub3) this).anInt9681)
			       + class418.aFloatArray4768[12]);
			float f_1303_
			    = (f_1289_
			       + (class418.aFloatArray4768[3]
				  * (float) ((Class157_Sub3) this).anInt9681)
			       + class418.aFloatArray4768[15]);
			class159.anInt1753
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9607)
				     - (float) class159.anInt1748
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9493
					* f_1302_ / f_1303_));
		    } else {
			float f_1304_
			    = (f_1290_
			       + (class418.aFloatArray4768[0]
				  * (float) ((Class157_Sub3) this).anInt9681)
			       + class418.aFloatArray4768[12]);
			float f_1305_
			    = (f_1293_
			       + (class418.aFloatArray4768[3]
				  * (float) ((Class157_Sub3) this).anInt9681)
			       + class418.aFloatArray4768[15]);
			class159.anInt1753
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9607)
				     - (float) class159.anInt1749
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9493
					* f_1304_ / f_1305_));
		    }
		    class159.aBool1751 = true;
		}
	    }
	    ((Class157_Sub3) this).aClass173_Sub2_9628.method8772();
	    ((Class157_Sub3) this).aClass173_Sub2_9628
		.method8752(class418_1269_);
	    method8887();
	    ((Class157_Sub3) this).aClass173_Sub2_9628.method8760();
	    class418_1269_.method4974(((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aClass418_9485);
	    method8888(class418_1269_);
	    if ((i & 0x2) != 0)
		OpenGL.glPolygonMode(1028, 6914);
	}
    }
    
    public boolean method1943(int i, int i_1306_, Class433 class433,
			      boolean bool, int i_1307_) {
	Class418 class418
	    = (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
	       .aClass418_9501);
	class418.method5035(class433);
	class418.method4974(((Class173_Sub2)
			     ((Class157_Sub3) this).aClass173_Sub2_9628)
			    .aClass418_9489);
	boolean bool_1308_ = false;
	int i_1309_ = 2147483647;
	int i_1310_ = -2147483648;
	int i_1311_ = 2147483647;
	int i_1312_ = -2147483648;
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	int i_1313_ = ((((Class157_Sub3) this).aShort9688
			- ((Class157_Sub3) this).aShort9674)
		       >> 1);
	int i_1314_ = ((((Class157_Sub3) this).aShort9693
			- ((Class157_Sub3) this).aShort9670)
		       >> 1);
	int i_1315_ = ((((Class157_Sub3) this).aShort9644
			- ((Class157_Sub3) this).aShort9676)
		       >> 1);
	int i_1316_ = ((Class157_Sub3) this).aShort9674 + i_1313_;
	int i_1317_ = ((Class157_Sub3) this).aShort9670 + i_1314_;
	int i_1318_ = ((Class157_Sub3) this).aShort9676 + i_1315_;
	int i_1319_ = i_1316_ - (i_1313_ << i_1307_);
	int i_1320_ = i_1317_ - (i_1314_ << i_1307_);
	int i_1321_ = i_1318_ - (i_1315_ << i_1307_);
	int i_1322_ = i_1316_ + (i_1313_ << i_1307_);
	int i_1323_ = i_1317_ + (i_1314_ << i_1307_);
	int i_1324_ = i_1318_ + (i_1315_ << i_1307_);
	anIntArray9675[0] = i_1319_;
	anIntArray9692[0] = i_1320_;
	anIntArray9656[0] = i_1321_;
	anIntArray9675[1] = i_1322_;
	anIntArray9692[1] = i_1320_;
	anIntArray9656[1] = i_1321_;
	anIntArray9675[2] = i_1319_;
	anIntArray9692[2] = i_1323_;
	anIntArray9656[2] = i_1321_;
	anIntArray9675[3] = i_1322_;
	anIntArray9692[3] = i_1323_;
	anIntArray9656[3] = i_1321_;
	anIntArray9675[4] = i_1319_;
	anIntArray9692[4] = i_1320_;
	anIntArray9656[4] = i_1324_;
	anIntArray9675[5] = i_1322_;
	anIntArray9692[5] = i_1320_;
	anIntArray9656[5] = i_1324_;
	anIntArray9675[6] = i_1319_;
	anIntArray9692[6] = i_1323_;
	anIntArray9656[6] = i_1324_;
	anIntArray9675[7] = i_1322_;
	anIntArray9692[7] = i_1323_;
	anIntArray9656[7] = i_1324_;
	for (int i_1325_ = 0; i_1325_ < 8; i_1325_++) {
	    int i_1326_ = anIntArray9675[i_1325_];
	    int i_1327_ = anIntArray9692[i_1325_];
	    int i_1328_ = anIntArray9656[i_1325_];
	    float f = (class418.aFloatArray4768[2] * (float) i_1326_
		       + class418.aFloatArray4768[6] * (float) i_1327_
		       + class418.aFloatArray4768[10] * (float) i_1328_
		       + class418.aFloatArray4768[14]);
	    float f_1329_ = (class418.aFloatArray4768[3] * (float) i_1326_
			     + class418.aFloatArray4768[7] * (float) i_1327_
			     + class418.aFloatArray4768[11] * (float) i_1328_
			     + class418.aFloatArray4768[15]);
	    if (f >= -f_1329_) {
		float f_1330_
		    = (class418.aFloatArray4768[0] * (float) i_1326_
		       + class418.aFloatArray4768[4] * (float) i_1327_
		       + class418.aFloatArray4768[8] * (float) i_1328_
		       + class418.aFloatArray4768[12]);
		float f_1331_
		    = (class418.aFloatArray4768[1] * (float) i_1326_
		       + class418.aFloatArray4768[5] * (float) i_1327_
		       + class418.aFloatArray4768[9] * (float) i_1328_
		       + class418.aFloatArray4768[13]);
		int i_1332_
		    = (int) ((((Class173_Sub2)
			       ((Class157_Sub3) this).aClass173_Sub2_9628)
			      .aFloat9607)
			     + (((Class173_Sub2)
				 ((Class157_Sub3) this).aClass173_Sub2_9628)
				.aFloat9493) * f_1330_ / f_1329_);
		int i_1333_
		    = (int) ((((Class173_Sub2)
			       ((Class157_Sub3) this).aClass173_Sub2_9628)
			      .aFloat9494)
			     + (((Class173_Sub2)
				 ((Class157_Sub3) this).aClass173_Sub2_9628)
				.aFloat9534) * f_1331_ / f_1329_);
		if (i_1332_ < i_1309_)
		    i_1309_ = i_1332_;
		if (i_1332_ > i_1310_)
		    i_1310_ = i_1332_;
		if (i_1333_ < i_1311_)
		    i_1311_ = i_1333_;
		if (i_1333_ > i_1312_)
		    i_1312_ = i_1333_;
		bool_1308_ = true;
	    }
	}
	if (bool_1308_ && i > i_1309_ && i < i_1310_ && i_1306_ > i_1311_
	    && i_1306_ < i_1312_) {
	    if (bool)
		return true;
	    if ((((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		 .anIntArray9408).length
		< ((Class157_Sub3) this).anInt9623) {
		((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		    .anIntArray9408
		    = new int[((Class157_Sub3) this).anInt9623];
		((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		    .anIntArray9558
		    = new int[((Class157_Sub3) this).anInt9623];
	    }
	    int[] is
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .anIntArray9408);
	    int[] is_1334_
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .anIntArray9558);
	    for (int i_1335_ = 0; i_1335_ < ((Class157_Sub3) this).anInt9637;
		 i_1335_++) {
		int i_1336_ = ((Class157_Sub3) this).anIntArray9679[i_1335_];
		int i_1337_ = ((Class157_Sub3) this).anIntArray9639[i_1335_];
		int i_1338_ = ((Class157_Sub3) this).anIntArray9648[i_1335_];
		float f = (class418.aFloatArray4768[2] * (float) i_1336_
			   + class418.aFloatArray4768[6] * (float) i_1337_
			   + class418.aFloatArray4768[10] * (float) i_1338_
			   + class418.aFloatArray4768[14]);
		float f_1339_
		    = (class418.aFloatArray4768[3] * (float) i_1336_
		       + class418.aFloatArray4768[7] * (float) i_1337_
		       + class418.aFloatArray4768[11] * (float) i_1338_
		       + class418.aFloatArray4768[15]);
		if (f >= -f_1339_) {
		    float f_1340_
			= (class418.aFloatArray4768[0] * (float) i_1336_
			   + class418.aFloatArray4768[4] * (float) i_1337_
			   + class418.aFloatArray4768[8] * (float) i_1338_
			   + class418.aFloatArray4768[12]);
		    float f_1341_
			= (class418.aFloatArray4768[1] * (float) i_1336_
			   + class418.aFloatArray4768[5] * (float) i_1337_
			   + class418.aFloatArray4768[9] * (float) i_1338_
			   + class418.aFloatArray4768[13]);
		    int i_1342_
			= ((Class157_Sub3) this).anIntArray9660[i_1335_];
		    int i_1343_
			= ((Class157_Sub3) this).anIntArray9660[i_1335_ + 1];
		    for (int i_1344_ = i_1342_;
			 (i_1344_ < i_1343_
			  && (((Class157_Sub3) this).aShortArray9682[i_1344_]
			      != 0));
			 i_1344_++) {
			int i_1345_
			    = ((((Class157_Sub3) this).aShortArray9682[i_1344_]
				& 0xffff)
			       - 1);
			is[i_1345_]
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9607)
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9493
					* f_1340_ / f_1339_));
			is_1334_[i_1345_]
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9494)
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9534
					* f_1341_ / f_1339_));
		    }
		} else {
		    int i_1346_
			= ((Class157_Sub3) this).anIntArray9660[i_1335_];
		    int i_1347_
			= ((Class157_Sub3) this).anIntArray9660[i_1335_ + 1];
		    for (int i_1348_ = i_1346_;
			 (i_1348_ < i_1347_
			  && (((Class157_Sub3) this).aShortArray9682[i_1348_]
			      != 0));
			 i_1348_++) {
			int i_1349_
			    = ((((Class157_Sub3) this).aShortArray9682[i_1348_]
				& 0xffff)
			       - 1);
			is[i_1349_] = -999999;
		    }
		}
	    }
	    for (int i_1350_ = 0; i_1350_ < ((Class157_Sub3) this).anInt9651;
		 i_1350_++) {
		if (is[(((Class157_Sub3) this).aShortArray9655[i_1350_]
			& 0xffff)] != -999999
		    && is[(((Class157_Sub3) this).aShortArray9638[i_1350_]
			   & 0xffff)] != -999999
		    && is[(((Class157_Sub3) this).aShortArray9657[i_1350_]
			   & 0xffff)] != -999999
		    && method8895(i, i_1306_,
				  is_1334_[((((Class157_Sub3) this)
					     .aShortArray9655[i_1350_])
					    & 0xffff)],
				  is_1334_[((((Class157_Sub3) this)
					     .aShortArray9638[i_1350_])
					    & 0xffff)],
				  is_1334_[((((Class157_Sub3) this)
					     .aShortArray9657[i_1350_])
					    & 0xffff)],
				  is[(((Class157_Sub3) this).aShortArray9655
				      [i_1350_]) & 0xffff],
				  is[(((Class157_Sub3) this).aShortArray9638
				      [i_1350_]) & 0xffff],
				  is[(((Class157_Sub3) this).aShortArray9657
				      [i_1350_]) & 0xffff]))
		    return true;
	    }
	}
	return false;
    }
    
    void method1956() {
	for (int i = 0; i < ((Class157_Sub3) this).anInt9636; i++) {
	    ((Class157_Sub3) this).anIntArray9679[i]
		= ((Class157_Sub3) this).anIntArray9679[i] + 7 >> 4;
	    ((Class157_Sub3) this).anIntArray9639[i]
		= ((Class157_Sub3) this).anIntArray9639[i] + 7 >> 4;
	    ((Class157_Sub3) this).anIntArray9648[i]
		= ((Class157_Sub3) this).anIntArray9648[i] + 7 >> 4;
	}
	if (((Class157_Sub3) this).aClass122_9661 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9661)
		.anInterface14_1542
		= null;
	((Class157_Sub3) this).aBool9649 = false;
    }
    
    public Class528_Sub21_Sub12 method1969
	(Class528_Sub21_Sub12 class528_sub21_sub12) {
	if (((Class157_Sub3) this).anInt9623 == 0)
	    return null;
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	int i;
	int i_1351_;
	if ((((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
	     .anInt9508)
	    > 0) {
	    i = ((((Class157_Sub3) this).aShort9674
		  - ((((Class157_Sub3) this).aShort9693
		      * ((Class173_Sub2)
			 ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9508)
		     >> 8))
		 >> ((Class173_Sub2)
		     ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9438);
	    i_1351_
		= ((((Class157_Sub3) this).aShort9688
		    - ((((Class157_Sub3) this).aShort9670
			* ((Class173_Sub2) (((Class157_Sub3) this)
					    .aClass173_Sub2_9628)).anInt9508)
		       >> 8))
		   >> ((Class173_Sub2)
		       ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9438);
	} else {
	    i = ((((Class157_Sub3) this).aShort9674
		  - ((((Class157_Sub3) this).aShort9670
		      * ((Class173_Sub2)
			 ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9508)
		     >> 8))
		 >> ((Class173_Sub2)
		     ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9438);
	    i_1351_
		= ((((Class157_Sub3) this).aShort9688
		    - ((((Class157_Sub3) this).aShort9693
			* ((Class173_Sub2) (((Class157_Sub3) this)
					    .aClass173_Sub2_9628)).anInt9508)
		       >> 8))
		   >> ((Class173_Sub2)
		       ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9438);
	}
	int i_1352_;
	int i_1353_;
	if ((((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
	     .anInt9462)
	    > 0) {
	    i_1352_
		= ((((Class157_Sub3) this).aShort9676
		    - ((((Class157_Sub3) this).aShort9693
			* ((Class173_Sub2) (((Class157_Sub3) this)
					    .aClass173_Sub2_9628)).anInt9462)
		       >> 8))
		   >> ((Class173_Sub2)
		       ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9438);
	    i_1353_
		= ((((Class157_Sub3) this).aShort9644
		    - ((((Class157_Sub3) this).aShort9670
			* ((Class173_Sub2) (((Class157_Sub3) this)
					    .aClass173_Sub2_9628)).anInt9462)
		       >> 8))
		   >> ((Class173_Sub2)
		       ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9438);
	} else {
	    i_1352_
		= ((((Class157_Sub3) this).aShort9676
		    - ((((Class157_Sub3) this).aShort9670
			* ((Class173_Sub2) (((Class157_Sub3) this)
					    .aClass173_Sub2_9628)).anInt9462)
		       >> 8))
		   >> ((Class173_Sub2)
		       ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9438);
	    i_1353_
		= ((((Class157_Sub3) this).aShort9644
		    - ((((Class157_Sub3) this).aShort9693
			* ((Class173_Sub2) (((Class157_Sub3) this)
					    .aClass173_Sub2_9628)).anInt9462)
		       >> 8))
		   >> ((Class173_Sub2)
		       ((Class157_Sub3) this).aClass173_Sub2_9628).anInt9438);
	}
	int i_1354_ = i_1351_ - i + 1;
	int i_1355_ = i_1353_ - i_1352_ + 1;
	Class528_Sub21_Sub12_Sub2 class528_sub21_sub12_sub2
	    = (Class528_Sub21_Sub12_Sub2) class528_sub21_sub12;
	Class528_Sub21_Sub12_Sub2 class528_sub21_sub12_sub2_1356_;
	if (class528_sub21_sub12_sub2 != null
	    && class528_sub21_sub12_sub2.method10873(i_1354_, i_1355_)) {
	    class528_sub21_sub12_sub2_1356_ = class528_sub21_sub12_sub2;
	    class528_sub21_sub12_sub2_1356_.method10875();
	} else
	    class528_sub21_sub12_sub2_1356_
		= new Class528_Sub21_Sub12_Sub2((((Class157_Sub3) this)
						 .aClass173_Sub2_9628),
						i_1354_, i_1355_);
	class528_sub21_sub12_sub2_1356_.method10866(i, i_1352_, i_1351_,
						    i_1353_);
	method8894(class528_sub21_sub12_sub2_1356_);
	return class528_sub21_sub12_sub2_1356_;
    }
    
    public int method1994() {
	return ((Class157_Sub3) this).aShort9633;
    }
    
    public void method1971() {
	if (!((Class157_Sub3) this).aBool9678) {
	    if (!((Class157_Sub3) this).aBool9649)
		method8893();
	    ((Class157_Sub3) this).aShort9672
		= ((Class157_Sub3) this).aShort9670;
	    ((Class157_Sub3) this).aBool9678 = true;
	}
    }
    
    static short[] method8891(short[] is, int i) {
	short[] is_1357_ = new short[i];
	System.arraycopy(is, 0, is_1357_, 0, i);
	return is_1357_;
    }
    
    public int method1976() {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	return ((Class157_Sub3) this).aShort9674;
    }
    
    public int method1983() {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	return ((Class157_Sub3) this).anInt9681;
    }
    
    void method8892(boolean bool) {
	boolean bool_1358_
	    = (((Class157_Sub3) this).aClass122_9662 != null
	       && (((Class122) ((Class157_Sub3) this).aClass122_9662)
		   .anInterface14_1542) == null);
	boolean bool_1359_
	    = (((Class157_Sub3) this).aClass122_9663 != null
	       && (((Class122) ((Class157_Sub3) this).aClass122_9663)
		   .anInterface14_1542) == null);
	boolean bool_1360_
	    = (((Class157_Sub3) this).aClass122_9661 != null
	       && (((Class122) ((Class157_Sub3) this).aClass122_9661)
		   .anInterface14_1542) == null);
	boolean bool_1361_
	    = (((Class157_Sub3) this).aClass122_9686 != null
	       && (((Class122) ((Class157_Sub3) this).aClass122_9686)
		   .anInterface14_1542) == null);
	if (bool) {
	    bool_1358_
		= bool_1358_ & (((Class157_Sub3) this).aByte9669 & 0x2) != 0;
	    bool_1359_
		= bool_1359_ & (((Class157_Sub3) this).aByte9669 & 0x4) != 0;
	    bool_1360_
		= bool_1360_ & (((Class157_Sub3) this).aByte9669 & 0x1) != 0;
	    bool_1361_
		= bool_1361_ & (((Class157_Sub3) this).aByte9669 & 0x8) != 0;
	}
	byte i = 0;
	byte i_1362_ = 0;
	byte i_1363_ = 0;
	byte i_1364_ = 0;
	byte i_1365_ = 0;
	if (bool_1360_) {
	    i_1362_ = i;
	    i += 12;
	}
	if (bool_1358_) {
	    i_1363_ = i;
	    i += 4;
	}
	if (bool_1359_) {
	    i_1364_ = i;
	    i += 12;
	}
	if (bool_1361_) {
	    i_1365_ = i;
	    i += 8;
	}
	if (i != 0) {
	    if ((((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		 .aClass528_Sub42_Sub1_9597.payload).length
		< ((Class157_Sub3) this).anInt9623 * i)
		((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		    .aClass528_Sub42_Sub1_9597
		    = new Class528_Sub42_Sub1((((Class157_Sub3) this).anInt9623
					       + 100) * i);
	    else
		((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		    .aClass528_Sub42_Sub1_9597.pointer
		    = 0;
	    Class528_Sub42_Sub1 class528_sub42_sub1
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .aClass528_Sub42_Sub1_9597);
	    if (bool_1360_) {
		if (((Class173_Sub2)
		     ((Class157_Sub3) this).aClass173_Sub2_9628)
		    .aBool9561) {
		    for (int i_1366_ = 0;
			 i_1366_ < ((Class157_Sub3) this).anInt9637;
			 i_1366_++) {
			int i_1367_
			    = Stream.floatToRawIntBits((float) ((Class157_Sub3)
								this)
							       .anIntArray9679
							       [i_1366_]);
			int i_1368_
			    = Stream.floatToRawIntBits((float) ((Class157_Sub3)
								this)
							       .anIntArray9639
							       [i_1366_]);
			int i_1369_
			    = Stream.floatToRawIntBits((float) ((Class157_Sub3)
								this)
							       .anIntArray9648
							       [i_1366_]);
			int i_1370_
			    = ((Class157_Sub3) this).anIntArray9660[i_1366_];
			int i_1371_ = (((Class157_Sub3) this).anIntArray9660
				       [i_1366_ + 1]);
			for (int i_1372_ = i_1370_;
			     (i_1372_ < i_1371_
			      && (((Class157_Sub3) this).aShortArray9682
				  [i_1372_]) != 0);
			     i_1372_++) {
			    int i_1373_ = (((((Class157_Sub3) this)
					     .aShortArray9682[i_1372_])
					    & 0xffff)
					   - 1);
			    class528_sub42_sub1.pointer
				= i_1373_ * i * 2015001547;
			    class528_sub42_sub1.writeInt(i_1367_,
							   2114563136);
			    class528_sub42_sub1.writeInt(i_1368_,
							   2007692934);
			    class528_sub42_sub1.writeInt(i_1369_,
							   2132430953);
			}
		    }
		} else {
		    for (int i_1374_ = 0;
			 i_1374_ < ((Class157_Sub3) this).anInt9637;
			 i_1374_++) {
			int i_1375_
			    = Stream.floatToRawIntBits((float) ((Class157_Sub3)
								this)
							       .anIntArray9679
							       [i_1374_]);
			int i_1376_
			    = Stream.floatToRawIntBits((float) ((Class157_Sub3)
								this)
							       .anIntArray9639
							       [i_1374_]);
			int i_1377_
			    = Stream.floatToRawIntBits((float) ((Class157_Sub3)
								this)
							       .anIntArray9648
							       [i_1374_]);
			int i_1378_
			    = ((Class157_Sub3) this).anIntArray9660[i_1374_];
			int i_1379_ = (((Class157_Sub3) this).anIntArray9660
				       [i_1374_ + 1]);
			for (int i_1380_ = i_1378_;
			     (i_1380_ < i_1379_
			      && (((Class157_Sub3) this).aShortArray9682
				  [i_1380_]) != 0);
			     i_1380_++) {
			    int i_1381_ = (((((Class157_Sub3) this)
					     .aShortArray9682[i_1380_])
					    & 0xffff)
					   - 1);
			    class528_sub42_sub1.pointer
				= i_1381_ * i * 2015001547;
			    class528_sub42_sub1.method9611(i_1375_,
							   2126045384);
			    class528_sub42_sub1.method9611(i_1376_,
							   1740076845);
			    class528_sub42_sub1.method9611(i_1377_,
							   2059731030);
			}
		    }
		}
	    }
	    if (bool_1358_) {
		if (((Class157_Sub3) this).aClass122_9663 == null) {
		    short[] is;
		    short[] is_1382_;
		    short[] is_1383_;
		    byte[] is_1384_;
		    if (((Class157_Sub3) this).aClass143_9671 != null) {
			is = ((Class143) (((Class157_Sub3) this)
					  .aClass143_9671)).aShortArray1644;
			is_1382_
			    = ((Class143) (((Class157_Sub3) this)
					   .aClass143_9671)).aShortArray1642;
			is_1383_
			    = ((Class143) (((Class157_Sub3) this)
					   .aClass143_9671)).aShortArray1643;
			is_1384_
			    = ((Class143) (((Class157_Sub3) this)
					   .aClass143_9671)).aByteArray1641;
		    } else {
			is = ((Class157_Sub3) this).aShortArray9673;
			is_1382_ = ((Class157_Sub3) this).aShortArray9645;
			is_1383_ = ((Class157_Sub3) this).aShortArray9646;
			is_1384_ = ((Class157_Sub3) this).aByteArray9647;
		    }
		    float f = (((Class173_Sub2)
				((Class157_Sub3) this).aClass173_Sub2_9628)
			       .aFloatArray9521[0]);
		    float f_1385_ = (((Class173_Sub2) (((Class157_Sub3) this)
						       .aClass173_Sub2_9628))
				     .aFloatArray9521[1]);
		    float f_1386_ = (((Class173_Sub2) (((Class157_Sub3) this)
						       .aClass173_Sub2_9628))
				     .aFloatArray9521[2]);
		    float f_1387_ = (((Class173_Sub2) (((Class157_Sub3) this)
						       .aClass173_Sub2_9628))
				     .aFloat9527);
		    float f_1388_
			= (((Class173_Sub2) (((Class157_Sub3) this)
					     .aClass173_Sub2_9628)).aFloat9484
			   * 768.0F
			   / (float) ((Class157_Sub3) this).aShort9633);
		    float f_1389_
			= (((Class173_Sub2) (((Class157_Sub3) this)
					     .aClass173_Sub2_9628)).aFloat9464
			   * 768.0F
			   / (float) ((Class157_Sub3) this).aShort9633);
		    for (int i_1390_ = 0;
			 i_1390_ < ((Class157_Sub3) this).anInt9651;
			 i_1390_++) {
			int i_1391_
			    = method8896((((Class157_Sub3) this)
					  .aShortArray9653[i_1390_]),
					 (((Class157_Sub3) this)
					  .aShortArray9658[i_1390_]),
					 ((Class157_Sub3) this).aShort9632,
					 (((Class157_Sub3) this).aByteArray9654
					  [i_1390_]));
			float f_1392_
			    = ((float) (i_1391_ >>> 24)
			       * (((Class173_Sub2)
				   ((Class157_Sub3) this).aClass173_Sub2_9628)
				  .aFloat9436));
			float f_1393_
			    = ((float) (i_1391_ >> 16 & 0xff)
			       * (((Class173_Sub2)
				   ((Class157_Sub3) this).aClass173_Sub2_9628)
				  .aFloat9525));
			float f_1394_
			    = ((float) (i_1391_ >> 8 & 0xff)
			       * (((Class173_Sub2)
				   ((Class157_Sub3) this).aClass173_Sub2_9628)
				  .aFloat9458));
			int i_1395_
			    = (((Class157_Sub3) this).aShortArray9655[i_1390_]
			       & 0xffff);
			short i_1396_ = (short) is_1384_[i_1395_];
			float f_1397_;
			if (i_1396_ == 0)
			    f_1397_ = ((f * (float) is[i_1395_]
					+ f_1385_ * (float) is_1382_[i_1395_]
					+ f_1386_ * (float) is_1383_[i_1395_])
				       * 0.0026041667F);
			else
			    f_1397_ = ((f * (float) is[i_1395_]
					+ f_1385_ * (float) is_1382_[i_1395_]
					+ f_1386_ * (float) is_1383_[i_1395_])
				       / (float) (i_1396_ * 256));
			float f_1398_
			    = f_1387_ + f_1397_ * (f_1397_ < 0.0F ? f_1389_
						   : f_1388_);
			int i_1399_ = (int) (f_1392_ * f_1398_);
			if (i_1399_ < 0)
			    i_1399_ = 0;
			else if (i_1399_ > 255)
			    i_1399_ = 255;
			int i_1400_ = (int) (f_1393_ * f_1398_);
			if (i_1400_ < 0)
			    i_1400_ = 0;
			else if (i_1400_ > 255)
			    i_1400_ = 255;
			int i_1401_ = (int) (f_1394_ * f_1398_);
			if (i_1401_ < 0)
			    i_1401_ = 0;
			else if (i_1401_ > 255)
			    i_1401_ = 255;
			class528_sub42_sub1.pointer
			    = (i_1363_ + i_1395_ * i) * 2015001547;
			class528_sub42_sub1.writeByte(i_1399_, (byte) -7);
			class528_sub42_sub1.writeByte(i_1400_, (byte) -31);
			class528_sub42_sub1.writeByte(i_1401_, (byte) -47);
			class528_sub42_sub1.writeByte(255 - ((((Class157_Sub3)
								this)
							       .aByteArray9654
							       [i_1390_])
							      & 0xff),
						       (byte) -6);
			i_1395_
			    = (((Class157_Sub3) this).aShortArray9638[i_1390_]
			       & 0xffff);
			i_1396_ = (short) is_1384_[i_1395_];
			if (i_1396_ == 0)
			    f_1397_ = ((f * (float) is[i_1395_]
					+ f_1385_ * (float) is_1382_[i_1395_]
					+ f_1386_ * (float) is_1383_[i_1395_])
				       * 0.0026041667F);
			else
			    f_1397_ = ((f * (float) is[i_1395_]
					+ f_1385_ * (float) is_1382_[i_1395_]
					+ f_1386_ * (float) is_1383_[i_1395_])
				       / (float) (i_1396_ * 256));
			f_1398_ = f_1387_ + f_1397_ * (f_1397_ < 0.0F ? f_1389_
						       : f_1388_);
			i_1399_ = (int) (f_1392_ * f_1398_);
			if (i_1399_ < 0)
			    i_1399_ = 0;
			else if (i_1399_ > 255)
			    i_1399_ = 255;
			i_1400_ = (int) (f_1393_ * f_1398_);
			if (i_1400_ < 0)
			    i_1400_ = 0;
			else if (i_1400_ > 255)
			    i_1400_ = 255;
			i_1401_ = (int) (f_1394_ * f_1398_);
			if (i_1401_ < 0)
			    i_1401_ = 0;
			else if (i_1401_ > 255)
			    i_1401_ = 255;
			class528_sub42_sub1.pointer
			    = (i_1363_ + i_1395_ * i) * 2015001547;
			class528_sub42_sub1.writeByte(i_1399_, (byte) -33);
			class528_sub42_sub1.writeByte(i_1400_, (byte) -41);
			class528_sub42_sub1.writeByte(i_1401_, (byte) -64);
			class528_sub42_sub1.writeByte(255 - ((((Class157_Sub3)
								this)
							       .aByteArray9654
							       [i_1390_])
							      & 0xff),
						       (byte) -49);
			i_1395_
			    = (((Class157_Sub3) this).aShortArray9657[i_1390_]
			       & 0xffff);
			i_1396_ = (short) is_1384_[i_1395_];
			if (i_1396_ == 0)
			    f_1397_ = ((f * (float) is[i_1395_]
					+ f_1385_ * (float) is_1382_[i_1395_]
					+ f_1386_ * (float) is_1383_[i_1395_])
				       * 0.0026041667F);
			else
			    f_1397_ = ((f * (float) is[i_1395_]
					+ f_1385_ * (float) is_1382_[i_1395_]
					+ f_1386_ * (float) is_1383_[i_1395_])
				       / (float) (i_1396_ * 256));
			f_1398_ = f_1387_ + f_1397_ * (f_1397_ < 0.0F ? f_1389_
						       : f_1388_);
			i_1399_ = (int) (f_1392_ * f_1398_);
			if (i_1399_ < 0)
			    i_1399_ = 0;
			else if (i_1399_ > 255)
			    i_1399_ = 255;
			i_1400_ = (int) (f_1393_ * f_1398_);
			if (i_1400_ < 0)
			    i_1400_ = 0;
			else if (i_1400_ > 255)
			    i_1400_ = 255;
			i_1401_ = (int) (f_1394_ * f_1398_);
			if (i_1401_ < 0)
			    i_1401_ = 0;
			else if (i_1401_ > 255)
			    i_1401_ = 255;
			class528_sub42_sub1.pointer
			    = (i_1363_ + i_1395_ * i) * 2015001547;
			class528_sub42_sub1.writeByte(i_1399_, (byte) 48);
			class528_sub42_sub1.writeByte(i_1400_, (byte) -58);
			class528_sub42_sub1.writeByte(i_1401_, (byte) 23);
			class528_sub42_sub1.writeByte(255 - ((((Class157_Sub3)
								this)
							       .aByteArray9654
							       [i_1390_])
							      & 0xff),
						       (byte) -72);
		    }
		} else {
		    for (int i_1402_ = 0;
			 i_1402_ < ((Class157_Sub3) this).anInt9651;
			 i_1402_++) {
			int i_1403_
			    = method8896((((Class157_Sub3) this)
					  .aShortArray9653[i_1402_]),
					 (((Class157_Sub3) this)
					  .aShortArray9658[i_1402_]),
					 ((Class157_Sub3) this).aShort9632,
					 (((Class157_Sub3) this).aByteArray9654
					  [i_1402_]));
			class528_sub42_sub1.pointer
			    = (i_1363_ + ((((Class157_Sub3) this)
					   .aShortArray9655[i_1402_])
					  & 0xffff) * i) * 2015001547;
			class528_sub42_sub1.writeInt(i_1403_, 2053886016);
			class528_sub42_sub1.pointer
			    = (i_1363_ + ((((Class157_Sub3) this)
					   .aShortArray9638[i_1402_])
					  & 0xffff) * i) * 2015001547;
			class528_sub42_sub1.writeInt(i_1403_, 2110662936);
			class528_sub42_sub1.pointer
			    = (i_1363_ + ((((Class157_Sub3) this)
					   .aShortArray9657[i_1402_])
					  & 0xffff) * i) * 2015001547;
			class528_sub42_sub1.writeInt(i_1403_, 2044029086);
		    }
		}
	    }
	    if (bool_1359_) {
		short[] is;
		short[] is_1404_;
		short[] is_1405_;
		byte[] is_1406_;
		if (((Class157_Sub3) this).aClass143_9671 != null) {
		    is = (((Class143) ((Class157_Sub3) this).aClass143_9671)
			  .aShortArray1644);
		    is_1404_
			= (((Class143) ((Class157_Sub3) this).aClass143_9671)
			   .aShortArray1642);
		    is_1405_
			= (((Class143) ((Class157_Sub3) this).aClass143_9671)
			   .aShortArray1643);
		    is_1406_
			= (((Class143) ((Class157_Sub3) this).aClass143_9671)
			   .aByteArray1641);
		} else {
		    is = ((Class157_Sub3) this).aShortArray9673;
		    is_1404_ = ((Class157_Sub3) this).aShortArray9645;
		    is_1405_ = ((Class157_Sub3) this).aShortArray9646;
		    is_1406_ = ((Class157_Sub3) this).aByteArray9647;
		}
		float f = 3.0F / (float) ((Class157_Sub3) this).aShort9633;
		float f_1407_
		    = 3.0F / (float) (((Class157_Sub3) this).aShort9633
				      + ((Class157_Sub3) this).aShort9633 / 2);
		class528_sub42_sub1.pointer = i_1364_ * 2015001547;
		if (((Class173_Sub2)
		     ((Class157_Sub3) this).aClass173_Sub2_9628)
		    .aBool9561) {
		    for (int i_1408_ = 0;
			 i_1408_ < ((Class157_Sub3) this).anInt9623;
			 i_1408_++) {
			int i_1409_ = is_1406_[i_1408_] & 0xff;
			if (i_1409_ == 0) {
			    class528_sub42_sub1
				.method10615((float) is[i_1408_] * f_1407_);
			    class528_sub42_sub1.method10615((float) (is_1404_
								     [i_1408_])
							    * f_1407_);
			    class528_sub42_sub1.method10615((float) (is_1405_
								     [i_1408_])
							    * f_1407_);
			} else {
			    float f_1410_ = f / (float) i_1409_;
			    class528_sub42_sub1
				.method10615((float) is[i_1408_] * f_1410_);
			    class528_sub42_sub1.method10615((float) (is_1404_
								     [i_1408_])
							    * f_1410_);
			    class528_sub42_sub1.method10615((float) (is_1405_
								     [i_1408_])
							    * f_1410_);
			}
			class528_sub42_sub1.pointer
			    += (i - 12) * 2015001547;
		    }
		} else {
		    for (int i_1411_ = 0;
			 i_1411_ < ((Class157_Sub3) this).anInt9623;
			 i_1411_++) {
			int i_1412_ = is_1406_[i_1411_] & 0xff;
			if (i_1412_ == 0) {
			    class528_sub42_sub1
				.method10614((float) is[i_1411_] * f_1407_);
			    class528_sub42_sub1.method10614((float) (is_1404_
								     [i_1411_])
							    * f_1407_);
			    class528_sub42_sub1.method10614((float) (is_1405_
								     [i_1411_])
							    * f_1407_);
			} else {
			    float f_1413_ = f / (float) i_1412_;
			    class528_sub42_sub1
				.method10614((float) is[i_1411_] * f_1413_);
			    class528_sub42_sub1.method10614((float) (is_1404_
								     [i_1411_])
							    * f_1413_);
			    class528_sub42_sub1.method10614((float) (is_1405_
								     [i_1411_])
							    * f_1413_);
			}
			class528_sub42_sub1.pointer
			    += (i - 12) * 2015001547;
		    }
		}
	    }
	    if (bool_1361_) {
		class528_sub42_sub1.pointer = i_1365_ * 2015001547;
		if (((Class173_Sub2)
		     ((Class157_Sub3) this).aClass173_Sub2_9628)
		    .aBool9561) {
		    for (int i_1414_ = 0;
			 i_1414_ < ((Class157_Sub3) this).anInt9623;
			 i_1414_++) {
			class528_sub42_sub1.method10615(((Class157_Sub3) this)
							.aFloatArray9631
							[i_1414_]);
			class528_sub42_sub1.method10615(((Class157_Sub3) this)
							.aFloatArray9650
							[i_1414_]);
			class528_sub42_sub1.pointer += (i - 8) * 2015001547;
		    }
		} else {
		    for (int i_1415_ = 0;
			 i_1415_ < ((Class157_Sub3) this).anInt9623;
			 i_1415_++) {
			class528_sub42_sub1.method10614(((Class157_Sub3) this)
							.aFloatArray9631
							[i_1415_]);
			class528_sub42_sub1.method10614(((Class157_Sub3) this)
							.aFloatArray9650
							[i_1415_]);
			class528_sub42_sub1.pointer += (i - 8) * 2015001547;
		    }
		}
	    }
	    class528_sub42_sub1.pointer
		= i * ((Class157_Sub3) this).anInt9623 * 2015001547;
	    Interface14 interface14;
	    if (bool) {
		if (((Class157_Sub3) this).anInterface14_9667 == null)
		    ((Class157_Sub3) this).anInterface14_9667
			= (((Class157_Sub3) this).aClass173_Sub2_9628
			       .method8770
			   (i, class528_sub42_sub1.payload,
			    class528_sub42_sub1.pointer * -185904669,
			    true));
		else
		    ((Class157_Sub3) this).anInterface14_9667.method70
			(i, class528_sub42_sub1.payload,
			 class528_sub42_sub1.pointer * -185904669);
		interface14 = ((Class157_Sub3) this).anInterface14_9667;
		((Class157_Sub3) this).aByte9669 = (byte) 0;
	    } else {
		interface14
		    = (((Class157_Sub3) this).aClass173_Sub2_9628.method8770
		       (i, class528_sub42_sub1.payload,
			class528_sub42_sub1.pointer * -185904669, false));
		((Class157_Sub3) this).aBool9668 = true;
	    }
	    if (bool_1360_) {
		((Class122) ((Class157_Sub3) this).aClass122_9661)
		    .anInterface14_1542
		    = interface14;
		((Class122) ((Class157_Sub3) this).aClass122_9661).aByte1539
		    = i_1362_;
	    }
	    if (bool_1361_) {
		((Class122) ((Class157_Sub3) this).aClass122_9686)
		    .anInterface14_1542
		    = interface14;
		((Class122) ((Class157_Sub3) this).aClass122_9686).aByte1539
		    = i_1365_;
	    }
	    if (bool_1358_) {
		((Class122) ((Class157_Sub3) this).aClass122_9662)
		    .anInterface14_1542
		    = interface14;
		((Class122) ((Class157_Sub3) this).aClass122_9662).aByte1539
		    = i_1363_;
	    }
	    if (bool_1359_) {
		((Class122) ((Class157_Sub3) this).aClass122_9663)
		    .anInterface14_1542
		    = interface14;
		((Class122) ((Class157_Sub3) this).aClass122_9663).aByte1539
		    = i_1364_;
	    }
	}
    }
    
    void method8893() {
	int i = 32767;
	int i_1416_ = 32767;
	int i_1417_ = 32767;
	int i_1418_ = -32768;
	int i_1419_ = -32768;
	int i_1420_ = -32768;
	int i_1421_ = 0;
	int i_1422_ = 0;
	for (int i_1423_ = 0; i_1423_ < ((Class157_Sub3) this).anInt9637;
	     i_1423_++) {
	    int i_1424_ = ((Class157_Sub3) this).anIntArray9679[i_1423_];
	    int i_1425_ = ((Class157_Sub3) this).anIntArray9639[i_1423_];
	    int i_1426_ = ((Class157_Sub3) this).anIntArray9648[i_1423_];
	    if (i_1424_ < i)
		i = i_1424_;
	    if (i_1424_ > i_1418_)
		i_1418_ = i_1424_;
	    if (i_1425_ < i_1416_)
		i_1416_ = i_1425_;
	    if (i_1425_ > i_1419_)
		i_1419_ = i_1425_;
	    if (i_1426_ < i_1417_)
		i_1417_ = i_1426_;
	    if (i_1426_ > i_1420_)
		i_1420_ = i_1426_;
	    int i_1427_ = i_1424_ * i_1424_ + i_1426_ * i_1426_;
	    if (i_1427_ > i_1421_)
		i_1421_ = i_1427_;
	    i_1427_
		= i_1424_ * i_1424_ + i_1426_ * i_1426_ + i_1425_ * i_1425_;
	    if (i_1427_ > i_1422_)
		i_1422_ = i_1427_;
	}
	((Class157_Sub3) this).aShort9674 = (short) i;
	((Class157_Sub3) this).aShort9688 = (short) i_1418_;
	((Class157_Sub3) this).aShort9670 = (short) i_1416_;
	((Class157_Sub3) this).aShort9693 = (short) i_1419_;
	((Class157_Sub3) this).aShort9676 = (short) i_1417_;
	((Class157_Sub3) this).aShort9644 = (short) i_1420_;
	((Class157_Sub3) this).anInt9681
	    = (int) (Math.sqrt((double) i_1421_) + 0.99);
	((Class157_Sub3) this).anInt9666
	    = (int) (Math.sqrt((double) i_1422_) + 0.99);
	((Class157_Sub3) this).aBool9649 = true;
    }
    
    public int method1977() {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	return ((Class157_Sub3) this).aShort9674;
    }
    
    public int method1978() {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	return ((Class157_Sub3) this).aShort9688;
    }
    
    public int method1979() {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	return ((Class157_Sub3) this).aShort9670;
    }
    
    public int method1980() {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	return ((Class157_Sub3) this).aShort9670;
    }
    
    public int method1981() {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	return ((Class157_Sub3) this).aShort9670;
    }
    
    public int method1984() {
	if (!((Class157_Sub3) this).aBool9678)
	    method1909();
	return ((Class157_Sub3) this).aShort9672;
    }
    
    public void method1964(Class433 class433, Class159 class159, int i) {
	if ((i & 0x2) != 0)
	    OpenGL.glPolygonMode(1032, 6913);
	if (((Class157_Sub3) this).anInt9623 != 0) {
	    Class418 class418
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .aClass418_9533);
	    Class418 class418_1428_
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .aClass418_9501);
	    Class418 class418_1429_
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .aClass418_9502);
	    class418_1428_.method5035(class433);
	    class418_1429_.method4986(class418_1428_);
	    class418_1429_.method4974(((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aClass418_9489);
	    if (!((Class157_Sub3) this).aBool9649)
		method8893();
	    float[] fs
		= (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		   .aFloatArray9467);
	    class418_1428_.method5030(0.0F, (float) (((Class157_Sub3) this)
						     .aShort9670), 0.0F, fs);
	    float f = fs[0];
	    float f_1430_ = fs[1];
	    float f_1431_ = fs[2];
	    class418_1428_.method5030(0.0F, (float) (((Class157_Sub3) this)
						     .aShort9693), 0.0F, fs);
	    float f_1432_ = fs[0];
	    float f_1433_ = fs[1];
	    float f_1434_ = fs[2];
	    for (int i_1435_ = 0; i_1435_ < 6; i_1435_++) {
		float[] fs_1436_ = (((Class173_Sub2) (((Class157_Sub3) this)
						      .aClass173_Sub2_9628))
				    .aFloatArrayArray9490[i_1435_]);
		float f_1437_ = (fs_1436_[0] * f + fs_1436_[1] * f_1430_
				 + fs_1436_[2] * f_1431_ + fs_1436_[3]
				 + (float) ((Class157_Sub3) this).anInt9681);
		float f_1438_ = (fs_1436_[0] * f_1432_ + fs_1436_[1] * f_1433_
				 + fs_1436_[2] * f_1434_ + fs_1436_[3]
				 + (float) ((Class157_Sub3) this).anInt9681);
		if (f_1437_ < 0.0F && f_1438_ < 0.0F)
		    return;
	    }
	    if (class159 != null) {
		boolean bool = false;
		boolean bool_1439_ = true;
		int i_1440_ = ((((Class157_Sub3) this).aShort9674
				+ ((Class157_Sub3) this).aShort9688)
			       >> 1);
		int i_1441_ = ((((Class157_Sub3) this).aShort9676
				+ ((Class157_Sub3) this).aShort9644)
			       >> 1);
		int i_1442_ = i_1440_;
		short i_1443_ = ((Class157_Sub3) this).aShort9670;
		int i_1444_ = i_1441_;
		float f_1445_
		    = (class418_1429_.aFloatArray4768[0] * (float) i_1442_
		       + class418_1429_.aFloatArray4768[4] * (float) i_1443_
		       + class418_1429_.aFloatArray4768[8] * (float) i_1444_
		       + class418_1429_.aFloatArray4768[12]);
		float f_1446_
		    = (class418_1429_.aFloatArray4768[1] * (float) i_1442_
		       + class418_1429_.aFloatArray4768[5] * (float) i_1443_
		       + class418_1429_.aFloatArray4768[9] * (float) i_1444_
		       + class418_1429_.aFloatArray4768[13]);
		float f_1447_
		    = (class418_1429_.aFloatArray4768[2] * (float) i_1442_
		       + class418_1429_.aFloatArray4768[6] * (float) i_1443_
		       + class418_1429_.aFloatArray4768[10] * (float) i_1444_
		       + class418_1429_.aFloatArray4768[14]);
		float f_1448_
		    = (class418_1429_.aFloatArray4768[3] * (float) i_1442_
		       + class418_1429_.aFloatArray4768[7] * (float) i_1443_
		       + class418_1429_.aFloatArray4768[11] * (float) i_1444_
		       + class418_1429_.aFloatArray4768[15]);
		if (f_1447_ >= -f_1448_) {
		    class159.anInt1748
			= (int) ((((Class173_Sub2)
				   ((Class157_Sub3) this).aClass173_Sub2_9628)
				  .aFloat9607)
				 + (((Class173_Sub2) (((Class157_Sub3) this)
						      .aClass173_Sub2_9628))
				    .aFloat9493) * f_1445_ / f_1448_);
		    class159.anInt1750
			= (int) ((((Class173_Sub2)
				   ((Class157_Sub3) this).aClass173_Sub2_9628)
				  .aFloat9494)
				 + (((Class173_Sub2) (((Class157_Sub3) this)
						      .aClass173_Sub2_9628))
				    .aFloat9534) * f_1446_ / f_1448_);
		} else
		    bool = true;
		i_1442_ = i_1440_;
		i_1443_ = ((Class157_Sub3) this).aShort9693;
		i_1444_ = i_1441_;
		float f_1449_
		    = (class418_1429_.aFloatArray4768[0] * (float) i_1442_
		       + class418_1429_.aFloatArray4768[4] * (float) i_1443_
		       + class418_1429_.aFloatArray4768[8] * (float) i_1444_
		       + class418_1429_.aFloatArray4768[12]);
		float f_1450_
		    = (class418_1429_.aFloatArray4768[1] * (float) i_1442_
		       + class418_1429_.aFloatArray4768[5] * (float) i_1443_
		       + class418_1429_.aFloatArray4768[9] * (float) i_1444_
		       + class418_1429_.aFloatArray4768[13]);
		float f_1451_
		    = (class418_1429_.aFloatArray4768[2] * (float) i_1442_
		       + class418_1429_.aFloatArray4768[6] * (float) i_1443_
		       + class418_1429_.aFloatArray4768[10] * (float) i_1444_
		       + class418_1429_.aFloatArray4768[14]);
		float f_1452_
		    = (class418_1429_.aFloatArray4768[3] * (float) i_1442_
		       + class418_1429_.aFloatArray4768[7] * (float) i_1443_
		       + class418_1429_.aFloatArray4768[11] * (float) i_1444_
		       + class418_1429_.aFloatArray4768[15]);
		if (f_1451_ >= -f_1452_) {
		    class159.anInt1749
			= (int) ((((Class173_Sub2)
				   ((Class157_Sub3) this).aClass173_Sub2_9628)
				  .aFloat9607)
				 + (((Class173_Sub2) (((Class157_Sub3) this)
						      .aClass173_Sub2_9628))
				    .aFloat9493) * f_1449_ / f_1452_);
		    class159.anInt1752
			= (int) ((((Class173_Sub2)
				   ((Class157_Sub3) this).aClass173_Sub2_9628)
				  .aFloat9494)
				 + (((Class173_Sub2) (((Class157_Sub3) this)
						      .aClass173_Sub2_9628))
				    .aFloat9534) * f_1450_ / f_1452_);
		} else
		    bool = true;
		if (bool) {
		    if (f_1447_ < -f_1448_ && f_1451_ < -f_1452_)
			bool_1439_ = false;
		    else if (f_1447_ < -f_1448_) {
			float f_1453_
			    = (f_1447_ + f_1448_) / (f_1451_ + f_1452_) - 1.0F;
			float f_1454_
			    = f_1445_ + f_1453_ * (f_1449_ - f_1445_);
			float f_1455_
			    = f_1446_ + f_1453_ * (f_1450_ - f_1446_);
			float f_1456_
			    = f_1448_ + f_1453_ * (f_1452_ - f_1448_);
			class159.anInt1748
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9607)
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9493
					* f_1454_ / f_1456_));
			class159.anInt1750
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9494)
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9534
					* f_1455_ / f_1456_));
		    } else if (f_1451_ < -f_1452_) {
			float f_1457_
			    = (f_1451_ + f_1452_) / (f_1447_ + f_1448_) - 1.0F;
			float f_1458_
			    = f_1449_ + f_1457_ * (f_1445_ - f_1449_);
			float f_1459_
			    = f_1450_ + f_1457_ * (f_1446_ - f_1450_);
			float f_1460_
			    = f_1452_ + f_1457_ * (f_1448_ - f_1452_);
			class159.anInt1749
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9607)
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9493
					* f_1458_ / f_1460_));
			class159.anInt1752
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9494)
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9534
					* f_1459_ / f_1460_));
		    }
		}
		if (bool_1439_) {
		    if (f_1447_ / f_1448_ > f_1451_ / f_1452_) {
			float f_1461_
			    = (f_1445_
			       + (class418.aFloatArray4768[0]
				  * (float) ((Class157_Sub3) this).anInt9681)
			       + class418.aFloatArray4768[12]);
			float f_1462_
			    = (f_1448_
			       + (class418.aFloatArray4768[3]
				  * (float) ((Class157_Sub3) this).anInt9681)
			       + class418.aFloatArray4768[15]);
			class159.anInt1753
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9607)
				     - (float) class159.anInt1748
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9493
					* f_1461_ / f_1462_));
		    } else {
			float f_1463_
			    = (f_1449_
			       + (class418.aFloatArray4768[0]
				  * (float) ((Class157_Sub3) this).anInt9681)
			       + class418.aFloatArray4768[12]);
			float f_1464_
			    = (f_1452_
			       + (class418.aFloatArray4768[3]
				  * (float) ((Class157_Sub3) this).anInt9681)
			       + class418.aFloatArray4768[15]);
			class159.anInt1753
			    = (int) ((((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aFloat9607)
				     - (float) class159.anInt1749
				     + (((Class173_Sub2)
					 (((Class157_Sub3) this)
					  .aClass173_Sub2_9628)).aFloat9493
					* f_1463_ / f_1464_));
		    }
		    class159.aBool1751 = true;
		}
	    }
	    ((Class157_Sub3) this).aClass173_Sub2_9628.method8772();
	    ((Class157_Sub3) this).aClass173_Sub2_9628
		.method8752(class418_1428_);
	    method8887();
	    ((Class157_Sub3) this).aClass173_Sub2_9628.method8760();
	    class418_1428_.method4974(((Class173_Sub2) (((Class157_Sub3) this)
							.aClass173_Sub2_9628))
				      .aClass418_9485);
	    method8888(class418_1428_);
	    if ((i & 0x2) != 0)
		OpenGL.glPolygonMode(1028, 6914);
	}
    }
    
    public int method1896() {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	return ((Class157_Sub3) this).aShort9644;
    }
    
    void method2029() {
	/* empty */
    }
    
    public int method1891() {
	if (!((Class157_Sub3) this).aBool9678)
	    method1909();
	return ((Class157_Sub3) this).aShort9672;
    }
    
    public Class144[] method1985() {
	return ((Class157_Sub3) this).aClass144Array9664;
    }
    
    public void method1987(int i) {
	((Class157_Sub3) this).aShort9632 = (short) i;
	if (((Class157_Sub3) this).aClass122_9662 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9662)
		.anInterface14_1542
		= null;
    }
    
    public void method1877(int i) {
	((Class157_Sub3) this).aShort9632 = (short) i;
	if (((Class157_Sub3) this).aClass122_9662 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9662)
		.anInterface14_1542
		= null;
    }
    
    public void method1880(int i, int i_1465_, int i_1466_) {
	for (int i_1467_ = 0; i_1467_ < ((Class157_Sub3) this).anInt9637;
	     i_1467_++) {
	    if (i != 0)
		((Class157_Sub3) this).anIntArray9679[i_1467_] += i;
	    if (i_1465_ != 0)
		((Class157_Sub3) this).anIntArray9639[i_1467_] += i_1465_;
	    if (i_1466_ != 0)
		((Class157_Sub3) this).anIntArray9648[i_1467_] += i_1466_;
	}
	if (((Class157_Sub3) this).aClass122_9661 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9661)
		.anInterface14_1542
		= null;
	((Class157_Sub3) this).aBool9649 = false;
    }
    
    void method1959(int i, int[] is, int i_1468_, int i_1469_, int i_1470_,
		    int i_1471_, boolean bool) {
	int i_1472_ = is.length;
	if (i == 0) {
	    i_1468_ <<= 4;
	    i_1469_ <<= 4;
	    i_1470_ <<= 4;
	    int i_1473_ = 0;
	    anInt9694 = 0;
	    anInt9695 = 0;
	    anInt9696 = 0;
	    for (int i_1474_ = 0; i_1474_ < i_1472_; i_1474_++) {
		int i_1475_ = is[i_1474_];
		if (i_1475_
		    < ((Class157_Sub3) this).anIntArrayArray9641.length) {
		    int[] is_1476_
			= ((Class157_Sub3) this).anIntArrayArray9641[i_1475_];
		    for (int i_1477_ = 0; i_1477_ < is_1476_.length;
			 i_1477_++) {
			int i_1478_ = is_1476_[i_1477_];
			anInt9694
			    += ((Class157_Sub3) this).anIntArray9679[i_1478_];
			anInt9695
			    += ((Class157_Sub3) this).anIntArray9639[i_1478_];
			anInt9696
			    += ((Class157_Sub3) this).anIntArray9648[i_1478_];
			i_1473_++;
		    }
		}
	    }
	    if (i_1473_ > 0) {
		anInt9694 = anInt9694 / i_1473_ + i_1468_;
		anInt9695 = anInt9695 / i_1473_ + i_1469_;
		anInt9696 = anInt9696 / i_1473_ + i_1470_;
	    } else {
		anInt9694 = i_1468_;
		anInt9695 = i_1469_;
		anInt9696 = i_1470_;
	    }
	} else if (i == 1) {
	    i_1468_ <<= 4;
	    i_1469_ <<= 4;
	    i_1470_ <<= 4;
	    for (int i_1479_ = 0; i_1479_ < i_1472_; i_1479_++) {
		int i_1480_ = is[i_1479_];
		if (i_1480_
		    < ((Class157_Sub3) this).anIntArrayArray9641.length) {
		    int[] is_1481_
			= ((Class157_Sub3) this).anIntArrayArray9641[i_1480_];
		    for (int i_1482_ = 0; i_1482_ < is_1481_.length;
			 i_1482_++) {
			int i_1483_ = is_1481_[i_1482_];
			((Class157_Sub3) this).anIntArray9679[i_1483_]
			    += i_1468_;
			((Class157_Sub3) this).anIntArray9639[i_1483_]
			    += i_1469_;
			((Class157_Sub3) this).anIntArray9648[i_1483_]
			    += i_1470_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_1484_ = 0; i_1484_ < i_1472_; i_1484_++) {
		int i_1485_ = is[i_1484_];
		if (i_1485_
		    < ((Class157_Sub3) this).anIntArrayArray9641.length) {
		    int[] is_1486_
			= ((Class157_Sub3) this).anIntArrayArray9641[i_1485_];
		    if ((i_1471_ & 0x1) == 0) {
			for (int i_1487_ = 0; i_1487_ < is_1486_.length;
			     i_1487_++) {
			    int i_1488_ = is_1486_[i_1487_];
			    ((Class157_Sub3) this).anIntArray9679[i_1488_]
				-= anInt9694;
			    ((Class157_Sub3) this).anIntArray9639[i_1488_]
				-= anInt9695;
			    ((Class157_Sub3) this).anIntArray9648[i_1488_]
				-= anInt9696;
			    if (i_1470_ != 0) {
				int i_1489_ = Class417.anIntArray4766[i_1470_];
				int i_1490_ = Class417.anIntArray4767[i_1470_];
				int i_1491_
				    = (((((Class157_Sub3) this).anIntArray9639
					 [i_1488_]) * i_1489_
					+ (((Class157_Sub3) this)
					   .anIntArray9679[i_1488_]) * i_1490_
					+ 16383)
				       >> 14);
				((Class157_Sub3) this).anIntArray9639[i_1488_]
				    = ((((Class157_Sub3) this).anIntArray9639
					[i_1488_]) * i_1490_
				       - (((Class157_Sub3) this).anIntArray9679
					  [i_1488_]) * i_1489_
				       + 16383) >> 14;
				((Class157_Sub3) this).anIntArray9679[i_1488_]
				    = i_1491_;
			    }
			    if (i_1468_ != 0) {
				int i_1492_ = Class417.anIntArray4766[i_1468_];
				int i_1493_ = Class417.anIntArray4767[i_1468_];
				int i_1494_
				    = (((((Class157_Sub3) this).anIntArray9639
					 [i_1488_]) * i_1493_
					- (((Class157_Sub3) this)
					   .anIntArray9648[i_1488_]) * i_1492_
					+ 16383)
				       >> 14);
				((Class157_Sub3) this).anIntArray9648[i_1488_]
				    = ((((Class157_Sub3) this).anIntArray9639
					[i_1488_]) * i_1492_
				       + (((Class157_Sub3) this).anIntArray9648
					  [i_1488_]) * i_1493_
				       + 16383) >> 14;
				((Class157_Sub3) this).anIntArray9639[i_1488_]
				    = i_1494_;
			    }
			    if (i_1469_ != 0) {
				int i_1495_ = Class417.anIntArray4766[i_1469_];
				int i_1496_ = Class417.anIntArray4767[i_1469_];
				int i_1497_
				    = (((((Class157_Sub3) this).anIntArray9648
					 [i_1488_]) * i_1495_
					+ (((Class157_Sub3) this)
					   .anIntArray9679[i_1488_]) * i_1496_
					+ 16383)
				       >> 14);
				((Class157_Sub3) this).anIntArray9648[i_1488_]
				    = ((((Class157_Sub3) this).anIntArray9648
					[i_1488_]) * i_1496_
				       - (((Class157_Sub3) this).anIntArray9679
					  [i_1488_]) * i_1495_
				       + 16383) >> 14;
				((Class157_Sub3) this).anIntArray9679[i_1488_]
				    = i_1497_;
			    }
			    ((Class157_Sub3) this).anIntArray9679[i_1488_]
				+= anInt9694;
			    ((Class157_Sub3) this).anIntArray9639[i_1488_]
				+= anInt9695;
			    ((Class157_Sub3) this).anIntArray9648[i_1488_]
				+= anInt9696;
			}
		    } else {
			for (int i_1498_ = 0; i_1498_ < is_1486_.length;
			     i_1498_++) {
			    int i_1499_ = is_1486_[i_1498_];
			    ((Class157_Sub3) this).anIntArray9679[i_1499_]
				-= anInt9694;
			    ((Class157_Sub3) this).anIntArray9639[i_1499_]
				-= anInt9695;
			    ((Class157_Sub3) this).anIntArray9648[i_1499_]
				-= anInt9696;
			    if (i_1468_ != 0) {
				int i_1500_ = Class417.anIntArray4766[i_1468_];
				int i_1501_ = Class417.anIntArray4767[i_1468_];
				int i_1502_
				    = (((((Class157_Sub3) this).anIntArray9639
					 [i_1499_]) * i_1501_
					- (((Class157_Sub3) this)
					   .anIntArray9648[i_1499_]) * i_1500_
					+ 16383)
				       >> 14);
				((Class157_Sub3) this).anIntArray9648[i_1499_]
				    = ((((Class157_Sub3) this).anIntArray9639
					[i_1499_]) * i_1500_
				       + (((Class157_Sub3) this).anIntArray9648
					  [i_1499_]) * i_1501_
				       + 16383) >> 14;
				((Class157_Sub3) this).anIntArray9639[i_1499_]
				    = i_1502_;
			    }
			    if (i_1470_ != 0) {
				int i_1503_ = Class417.anIntArray4766[i_1470_];
				int i_1504_ = Class417.anIntArray4767[i_1470_];
				int i_1505_
				    = (((((Class157_Sub3) this).anIntArray9639
					 [i_1499_]) * i_1503_
					+ (((Class157_Sub3) this)
					   .anIntArray9679[i_1499_]) * i_1504_
					+ 16383)
				       >> 14);
				((Class157_Sub3) this).anIntArray9639[i_1499_]
				    = ((((Class157_Sub3) this).anIntArray9639
					[i_1499_]) * i_1504_
				       - (((Class157_Sub3) this).anIntArray9679
					  [i_1499_]) * i_1503_
				       + 16383) >> 14;
				((Class157_Sub3) this).anIntArray9679[i_1499_]
				    = i_1505_;
			    }
			    if (i_1469_ != 0) {
				int i_1506_ = Class417.anIntArray4766[i_1469_];
				int i_1507_ = Class417.anIntArray4767[i_1469_];
				int i_1508_
				    = (((((Class157_Sub3) this).anIntArray9648
					 [i_1499_]) * i_1506_
					+ (((Class157_Sub3) this)
					   .anIntArray9679[i_1499_]) * i_1507_
					+ 16383)
				       >> 14);
				((Class157_Sub3) this).anIntArray9648[i_1499_]
				    = ((((Class157_Sub3) this).anIntArray9648
					[i_1499_]) * i_1507_
				       - (((Class157_Sub3) this).anIntArray9679
					  [i_1499_]) * i_1506_
				       + 16383) >> 14;
				((Class157_Sub3) this).anIntArray9679[i_1499_]
				    = i_1508_;
			    }
			    ((Class157_Sub3) this).anIntArray9679[i_1499_]
				+= anInt9694;
			    ((Class157_Sub3) this).anIntArray9639[i_1499_]
				+= anInt9695;
			    ((Class157_Sub3) this).anIntArray9648[i_1499_]
				+= anInt9696;
			}
		    }
		}
	    }
	    if (bool) {
		for (int i_1509_ = 0; i_1509_ < i_1472_; i_1509_++) {
		    int i_1510_ = is[i_1509_];
		    if (i_1510_
			< ((Class157_Sub3) this).anIntArrayArray9641.length) {
			int[] is_1511_ = (((Class157_Sub3) this)
					  .anIntArrayArray9641[i_1510_]);
			for (int i_1512_ = 0; i_1512_ < is_1511_.length;
			     i_1512_++) {
			    int i_1513_ = is_1511_[i_1512_];
			    int i_1514_ = (((Class157_Sub3) this)
					   .anIntArray9660[i_1513_]);
			    int i_1515_ = (((Class157_Sub3) this)
					   .anIntArray9660[i_1513_ + 1]);
			    for (int i_1516_ = i_1514_;
				 (i_1516_ < i_1515_
				  && (((Class157_Sub3) this).aShortArray9682
				      [i_1516_]) != 0);
				 i_1516_++) {
				int i_1517_ = (((((Class157_Sub3) this)
						 .aShortArray9682[i_1516_])
						& 0xffff)
					       - 1);
				if (i_1470_ != 0) {
				    int i_1518_
					= Class417.anIntArray4766[i_1470_];
				    int i_1519_
					= Class417.anIntArray4767[i_1470_];
				    int i_1520_ = (((((Class157_Sub3) this)
						     .aShortArray9645
						     [i_1517_]) * i_1518_
						    + (((Class157_Sub3) this)
						       .aShortArray9673
						       [i_1517_]) * i_1519_
						    + 16383)
						   >> 14);
				    ((Class157_Sub3) this).aShortArray9645
					[i_1517_]
					= (short) (((((Class157_Sub3) this)
						     .aShortArray9645
						     [i_1517_]) * i_1519_
						    - (((Class157_Sub3) this)
						       .aShortArray9673
						       [i_1517_]) * i_1518_
						    + 16383)
						   >> 14);
				    ((Class157_Sub3) this).aShortArray9673
					[i_1517_]
					= (short) i_1520_;
				}
				if (i_1468_ != 0) {
				    int i_1521_
					= Class417.anIntArray4766[i_1468_];
				    int i_1522_
					= Class417.anIntArray4767[i_1468_];
				    int i_1523_ = (((((Class157_Sub3) this)
						     .aShortArray9645
						     [i_1517_]) * i_1522_
						    - (((Class157_Sub3) this)
						       .aShortArray9646
						       [i_1517_]) * i_1521_
						    + 16383)
						   >> 14);
				    ((Class157_Sub3) this).aShortArray9646
					[i_1517_]
					= (short) (((((Class157_Sub3) this)
						     .aShortArray9645
						     [i_1517_]) * i_1521_
						    + (((Class157_Sub3) this)
						       .aShortArray9646
						       [i_1517_]) * i_1522_
						    + 16383)
						   >> 14);
				    ((Class157_Sub3) this).aShortArray9645
					[i_1517_]
					= (short) i_1523_;
				}
				if (i_1469_ != 0) {
				    int i_1524_
					= Class417.anIntArray4766[i_1469_];
				    int i_1525_
					= Class417.anIntArray4767[i_1469_];
				    int i_1526_ = (((((Class157_Sub3) this)
						     .aShortArray9646
						     [i_1517_]) * i_1524_
						    + (((Class157_Sub3) this)
						       .aShortArray9673
						       [i_1517_]) * i_1525_
						    + 16383)
						   >> 14);
				    ((Class157_Sub3) this).aShortArray9646
					[i_1517_]
					= (short) (((((Class157_Sub3) this)
						     .aShortArray9646
						     [i_1517_]) * i_1525_
						    - (((Class157_Sub3) this)
						       .aShortArray9673
						       [i_1517_]) * i_1524_
						    + 16383)
						   >> 14);
				    ((Class157_Sub3) this).aShortArray9673
					[i_1517_]
					= (short) i_1526_;
				}
			    }
			}
		    }
		}
		if (((Class157_Sub3) this).aClass122_9663 == null
		    && ((Class157_Sub3) this).aClass122_9662 != null)
		    ((Class122) ((Class157_Sub3) this).aClass122_9662)
			.anInterface14_1542
			= null;
		if (((Class157_Sub3) this).aClass122_9663 != null)
		    ((Class122) ((Class157_Sub3) this).aClass122_9663)
			.anInterface14_1542
			= null;
	    }
	} else if (i == 3) {
	    for (int i_1527_ = 0; i_1527_ < i_1472_; i_1527_++) {
		int i_1528_ = is[i_1527_];
		if (i_1528_
		    < ((Class157_Sub3) this).anIntArrayArray9641.length) {
		    int[] is_1529_
			= ((Class157_Sub3) this).anIntArrayArray9641[i_1528_];
		    for (int i_1530_ = 0; i_1530_ < is_1529_.length;
			 i_1530_++) {
			int i_1531_ = is_1529_[i_1530_];
			((Class157_Sub3) this).anIntArray9679[i_1531_]
			    -= anInt9694;
			((Class157_Sub3) this).anIntArray9639[i_1531_]
			    -= anInt9695;
			((Class157_Sub3) this).anIntArray9648[i_1531_]
			    -= anInt9696;
			((Class157_Sub3) this).anIntArray9679[i_1531_]
			    = (((Class157_Sub3) this).anIntArray9679[i_1531_]
			       * i_1468_) >> 7;
			((Class157_Sub3) this).anIntArray9639[i_1531_]
			    = (((Class157_Sub3) this).anIntArray9639[i_1531_]
			       * i_1469_) >> 7;
			((Class157_Sub3) this).anIntArray9648[i_1531_]
			    = (((Class157_Sub3) this).anIntArray9648[i_1531_]
			       * i_1470_) >> 7;
			((Class157_Sub3) this).anIntArray9679[i_1531_]
			    += anInt9694;
			((Class157_Sub3) this).anIntArray9639[i_1531_]
			    += anInt9695;
			((Class157_Sub3) this).anIntArray9648[i_1531_]
			    += anInt9696;
		    }
		}
	    }
	} else if (i == 5) {
	    if (((Class157_Sub3) this).anIntArrayArray9659 != null) {
		for (int i_1532_ = 0; i_1532_ < i_1472_; i_1532_++) {
		    int i_1533_ = is[i_1532_];
		    if (i_1533_
			< ((Class157_Sub3) this).anIntArrayArray9659.length) {
			int[] is_1534_ = (((Class157_Sub3) this)
					  .anIntArrayArray9659[i_1533_]);
			for (int i_1535_ = 0; i_1535_ < is_1534_.length;
			     i_1535_++) {
			    int i_1536_ = is_1534_[i_1535_];
			    int i_1537_ = (((((Class157_Sub3) this)
					     .aByteArray9654[i_1536_])
					    & 0xff)
					   + i_1468_ * 8);
			    if (i_1537_ < 0)
				i_1537_ = 0;
			    else if (i_1537_ > 255)
				i_1537_ = 255;
			    ((Class157_Sub3) this).aByteArray9654[i_1536_]
				= (byte) i_1537_;
			}
			if (is_1534_.length > 0
			    && ((Class157_Sub3) this).aClass122_9662 != null)
			    ((Class122) ((Class157_Sub3) this).aClass122_9662)
				.anInterface14_1542
				= null;
		    }
		}
		if (((Class157_Sub3) this).aClass145Array9684 != null) {
		    for (int i_1538_ = 0;
			 i_1538_ < ((Class157_Sub3) this).anInt9685;
			 i_1538_++) {
			Class145 class145 = (((Class157_Sub3) this)
					     .aClass145Array9684[i_1538_]);
			Class113 class113 = (((Class157_Sub3) this)
					     .aClass113Array9687[i_1538_]);
			((Class113) class113).anInt1406
			    = (((Class113) class113).anInt1406 & 0xffffff
			       | 255 - ((((Class157_Sub3) this).aByteArray9654
					 [((Class145) class145).anInt1655])
					& 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (((Class157_Sub3) this).anIntArrayArray9659 != null) {
		for (int i_1539_ = 0; i_1539_ < i_1472_; i_1539_++) {
		    int i_1540_ = is[i_1539_];
		    if (i_1540_
			< ((Class157_Sub3) this).anIntArrayArray9659.length) {
			int[] is_1541_ = (((Class157_Sub3) this)
					  .anIntArrayArray9659[i_1540_]);
			for (int i_1542_ = 0; i_1542_ < is_1541_.length;
			     i_1542_++) {
			    int i_1543_ = is_1541_[i_1542_];
			    int i_1544_ = ((((Class157_Sub3) this)
					    .aShortArray9653[i_1543_])
					   & 0xffff);
			    int i_1545_ = i_1544_ >> 10 & 0x3f;
			    int i_1546_ = i_1544_ >> 7 & 0x7;
			    int i_1547_ = i_1544_ & 0x7f;
			    i_1545_ = i_1545_ + i_1468_ & 0x3f;
			    i_1546_ += i_1469_ / 4;
			    if (i_1546_ < 0)
				i_1546_ = 0;
			    else if (i_1546_ > 7)
				i_1546_ = 7;
			    i_1547_ += i_1470_;
			    if (i_1547_ < 0)
				i_1547_ = 0;
			    else if (i_1547_ > 127)
				i_1547_ = 127;
			    ((Class157_Sub3) this).aShortArray9653[i_1543_]
				= (short) (i_1545_ << 10 | i_1546_ << 7
					   | i_1547_);
			}
			if (is_1541_.length > 0
			    && ((Class157_Sub3) this).aClass122_9662 != null)
			    ((Class122) ((Class157_Sub3) this).aClass122_9662)
				.anInterface14_1542
				= null;
		    }
		}
		if (((Class157_Sub3) this).aClass145Array9684 != null) {
		    for (int i_1548_ = 0;
			 i_1548_ < ((Class157_Sub3) this).anInt9685;
			 i_1548_++) {
			Class145 class145 = (((Class157_Sub3) this)
					     .aClass145Array9684[i_1548_]);
			Class113 class113 = (((Class157_Sub3) this)
					     .aClass113Array9687[i_1548_]);
			((Class113) class113).anInt1406
			    = (((Class113) class113).anInt1406 & ~0xffffff
			       | (Class649.anIntArray8420
				  [((((Class157_Sub3) this).aShortArray9653
				     [((Class145) class145).anInt1655])
				    & 0xffff)]) & 0xffffff);
		    }
		}
	    }
	} else if (i == 8) {
	    if (((Class157_Sub3) this).anIntArrayArray9691 != null) {
		for (int i_1549_ = 0; i_1549_ < i_1472_; i_1549_++) {
		    int i_1550_ = is[i_1549_];
		    if (i_1550_
			< ((Class157_Sub3) this).anIntArrayArray9691.length) {
			int[] is_1551_ = (((Class157_Sub3) this)
					  .anIntArrayArray9691[i_1550_]);
			for (int i_1552_ = 0; i_1552_ < is_1551_.length;
			     i_1552_++) {
			    Class113 class113
				= (((Class157_Sub3) this).aClass113Array9687
				   [is_1551_[i_1552_]]);
			    ((Class113) class113).anInt1402 += i_1468_;
			    ((Class113) class113).anInt1405 += i_1469_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (((Class157_Sub3) this).anIntArrayArray9691 != null) {
		for (int i_1553_ = 0; i_1553_ < i_1472_; i_1553_++) {
		    int i_1554_ = is[i_1553_];
		    if (i_1554_
			< ((Class157_Sub3) this).anIntArrayArray9691.length) {
			int[] is_1555_ = (((Class157_Sub3) this)
					  .anIntArrayArray9691[i_1554_]);
			for (int i_1556_ = 0; i_1556_ < is_1555_.length;
			     i_1556_++) {
			    Class113 class113
				= (((Class157_Sub3) this).aClass113Array9687
				   [is_1555_[i_1556_]]);
			    ((Class113) class113).anInt1403
				= (((Class113) class113).anInt1403 * i_1468_
				   >> 7);
			    ((Class113) class113).anInt1404
				= (((Class113) class113).anInt1404 * i_1469_
				   >> 7);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (((Class157_Sub3) this).anIntArrayArray9691 != null) {
		for (int i_1557_ = 0; i_1557_ < i_1472_; i_1557_++) {
		    int i_1558_ = is[i_1557_];
		    if (i_1558_
			< ((Class157_Sub3) this).anIntArrayArray9691.length) {
			int[] is_1559_ = (((Class157_Sub3) this)
					  .anIntArrayArray9691[i_1558_]);
			for (int i_1560_ = 0; i_1560_ < is_1559_.length;
			     i_1560_++) {
			    Class113 class113
				= (((Class157_Sub3) this).aClass113Array9687
				   [is_1559_[i_1560_]]);
			    ((Class113) class113).anInt1407
				= (((Class113) class113).anInt1407 + i_1468_
				   & 0x3fff);
			}
		    }
		}
	    }
	}
    }
    
    public Class170[] method2008() {
	return ((Class157_Sub3) this).aClass170Array9683;
    }
    
    public int method1898() {
	return ((Class157_Sub3) this).aShort9632;
    }
    
    public void method1947(int i, int i_1561_, int i_1562_) {
	for (int i_1563_ = 0; i_1563_ < ((Class157_Sub3) this).anInt9637;
	     i_1563_++) {
	    if (i != 128)
		((Class157_Sub3) this).anIntArray9679[i_1563_]
		    = ((Class157_Sub3) this).anIntArray9679[i_1563_] * i >> 7;
	    if (i_1561_ != 128)
		((Class157_Sub3) this).anIntArray9639[i_1563_]
		    = (((Class157_Sub3) this).anIntArray9639[i_1563_] * i_1561_
		       >> 7);
	    if (i_1562_ != 128)
		((Class157_Sub3) this).anIntArray9648[i_1563_]
		    = (((Class157_Sub3) this).anIntArray9648[i_1563_] * i_1562_
		       >> 7);
	}
	if (((Class157_Sub3) this).aClass122_9661 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9661)
		.anInterface14_1542
		= null;
	((Class157_Sub3) this).aBool9649 = false;
    }
    
    public byte[] method1911() {
	return ((Class157_Sub3) this).aByteArray9654;
    }
    
    public byte[] method1996() {
	return ((Class157_Sub3) this).aByteArray9654;
    }
    
    public void method1936() {
	if (((Class157_Sub3) this).anInt9623 > 0
	    && ((Class157_Sub3) this).anInt9652 > 0) {
	    method8892(false);
	    if ((((Class157_Sub3) this).aByte9669 & 0x10) == 0
		&& (((Class129) ((Class157_Sub3) this).aClass129_9665)
		    .anInterface16_1588) == null)
		method8889(false);
	    method8886();
	}
    }
    
    public void method1999(byte i, byte[] is) {
	if (is == null) {
	    for (int i_1564_ = 0; i_1564_ < ((Class157_Sub3) this).anInt9651;
		 i_1564_++)
		((Class157_Sub3) this).aByteArray9654[i_1564_] = i;
	} else {
	    for (int i_1565_ = 0; i_1565_ < ((Class157_Sub3) this).anInt9651;
		 i_1565_++) {
		int i_1566_ = 255 - ((255 - (is[i_1565_] & 0xff))
				     * (255 - (i & 0xff)) / 255);
		((Class157_Sub3) this).aByteArray9654[i_1565_]
		    = (byte) i_1566_;
	    }
	}
	if (((Class157_Sub3) this).aClass122_9662 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9662)
		.anInterface14_1542
		= null;
    }
    
    public void method1924(short i, short i_1567_) {
	Class165 class165
	    = ((Class157_Sub3) this).aClass173_Sub2_9628.aClass165_1984;
	for (int i_1568_ = 0; i_1568_ < ((Class157_Sub3) this).anInt9651;
	     i_1568_++) {
	    if (((Class157_Sub3) this).aShortArray9658[i_1568_] == i)
		((Class157_Sub3) this).aShortArray9658[i_1568_] = i_1567_;
	}
	byte i_1569_ = 0;
	byte i_1570_ = 0;
	if (i != -1) {
	    Class160 class160 = class165.method2093(i & 0xffff, (byte) -17);
	    i_1569_ = class160.aByte1802;
	    i_1570_ = class160.aByte1801;
	}
	byte i_1571_ = 0;
	byte i_1572_ = 0;
	if (i_1567_ != -1) {
	    Class160 class160
		= class165.method2093(i_1567_ & 0xffff, (byte) -56);
	    i_1571_ = class160.aByte1802;
	    i_1572_ = class160.aByte1801;
	    if (class160.aByte1775 != 0 || class160.aByte1776 != 0)
		((Class157_Sub3) this).aBool9635 = true;
	}
	if (i_1569_ != i_1571_ | i_1570_ != i_1572_) {
	    if (((Class157_Sub3) this).aClass145Array9684 != null) {
		for (int i_1573_ = 0;
		     i_1573_ < ((Class157_Sub3) this).anInt9685; i_1573_++) {
		    Class145 class145
			= ((Class157_Sub3) this).aClass145Array9684[i_1573_];
		    Class113 class113
			= ((Class157_Sub3) this).aClass113Array9687[i_1573_];
		    ((Class113) class113).anInt1406
			= (((Class113) class113).anInt1406 & ~0xffffff
			   | ((Class649.anIntArray8420
			       [(((Class157_Sub3) this).aShortArray9653
				 [((Class145) class145).anInt1655]) & 0xffff])
			      & 0xffffff));
		}
	    }
	    if (((Class157_Sub3) this).aClass122_9662 != null)
		((Class122) ((Class157_Sub3) this).aClass122_9662)
		    .anInterface14_1542
		    = null;
	}
    }
    
    public void method2001(short i, short i_1574_) {
	Class165 class165
	    = ((Class157_Sub3) this).aClass173_Sub2_9628.aClass165_1984;
	for (int i_1575_ = 0; i_1575_ < ((Class157_Sub3) this).anInt9651;
	     i_1575_++) {
	    if (((Class157_Sub3) this).aShortArray9658[i_1575_] == i)
		((Class157_Sub3) this).aShortArray9658[i_1575_] = i_1574_;
	}
	byte i_1576_ = 0;
	byte i_1577_ = 0;
	if (i != -1) {
	    Class160 class160 = class165.method2093(i & 0xffff, (byte) -9);
	    i_1576_ = class160.aByte1802;
	    i_1577_ = class160.aByte1801;
	}
	byte i_1578_ = 0;
	byte i_1579_ = 0;
	if (i_1574_ != -1) {
	    Class160 class160
		= class165.method2093(i_1574_ & 0xffff, (byte) -4);
	    i_1578_ = class160.aByte1802;
	    i_1579_ = class160.aByte1801;
	    if (class160.aByte1775 != 0 || class160.aByte1776 != 0)
		((Class157_Sub3) this).aBool9635 = true;
	}
	if (i_1576_ != i_1578_ | i_1577_ != i_1579_) {
	    if (((Class157_Sub3) this).aClass145Array9684 != null) {
		for (int i_1580_ = 0;
		     i_1580_ < ((Class157_Sub3) this).anInt9685; i_1580_++) {
		    Class145 class145
			= ((Class157_Sub3) this).aClass145Array9684[i_1580_];
		    Class113 class113
			= ((Class157_Sub3) this).aClass113Array9687[i_1580_];
		    ((Class113) class113).anInt1406
			= (((Class113) class113).anInt1406 & ~0xffffff
			   | ((Class649.anIntArray8420
			       [(((Class157_Sub3) this).aShortArray9653
				 [((Class145) class145).anInt1655]) & 0xffff])
			      & 0xffffff));
		}
	    }
	    if (((Class157_Sub3) this).aClass122_9662 != null)
		((Class122) ((Class157_Sub3) this).aClass122_9662)
		    .anInterface14_1542
		    = null;
	}
    }
    
    public void method2036(short i, short i_1581_) {
	Class165 class165
	    = ((Class157_Sub3) this).aClass173_Sub2_9628.aClass165_1984;
	for (int i_1582_ = 0; i_1582_ < ((Class157_Sub3) this).anInt9651;
	     i_1582_++) {
	    if (((Class157_Sub3) this).aShortArray9658[i_1582_] == i)
		((Class157_Sub3) this).aShortArray9658[i_1582_] = i_1581_;
	}
	byte i_1583_ = 0;
	byte i_1584_ = 0;
	if (i != -1) {
	    Class160 class160 = class165.method2093(i & 0xffff, (byte) -86);
	    i_1583_ = class160.aByte1802;
	    i_1584_ = class160.aByte1801;
	}
	byte i_1585_ = 0;
	byte i_1586_ = 0;
	if (i_1581_ != -1) {
	    Class160 class160
		= class165.method2093(i_1581_ & 0xffff, (byte) -61);
	    i_1585_ = class160.aByte1802;
	    i_1586_ = class160.aByte1801;
	    if (class160.aByte1775 != 0 || class160.aByte1776 != 0)
		((Class157_Sub3) this).aBool9635 = true;
	}
	if (i_1583_ != i_1585_ | i_1584_ != i_1586_) {
	    if (((Class157_Sub3) this).aClass145Array9684 != null) {
		for (int i_1587_ = 0;
		     i_1587_ < ((Class157_Sub3) this).anInt9685; i_1587_++) {
		    Class145 class145
			= ((Class157_Sub3) this).aClass145Array9684[i_1587_];
		    Class113 class113
			= ((Class157_Sub3) this).aClass113Array9687[i_1587_];
		    ((Class113) class113).anInt1406
			= (((Class113) class113).anInt1406 & ~0xffffff
			   | ((Class649.anIntArray8420
			       [(((Class157_Sub3) this).aShortArray9653
				 [((Class145) class145).anInt1655]) & 0xffff])
			      & 0xffffff));
		}
	    }
	    if (((Class157_Sub3) this).aClass122_9662 != null)
		((Class122) ((Class157_Sub3) this).aClass122_9662)
		    .anInterface14_1542
		    = null;
	}
    }
    
    public void method2003(short i, short i_1588_) {
	Class165 class165
	    = ((Class157_Sub3) this).aClass173_Sub2_9628.aClass165_1984;
	for (int i_1589_ = 0; i_1589_ < ((Class157_Sub3) this).anInt9651;
	     i_1589_++) {
	    if (((Class157_Sub3) this).aShortArray9658[i_1589_] == i)
		((Class157_Sub3) this).aShortArray9658[i_1589_] = i_1588_;
	}
	byte i_1590_ = 0;
	byte i_1591_ = 0;
	if (i != -1) {
	    Class160 class160 = class165.method2093(i & 0xffff, (byte) -14);
	    i_1590_ = class160.aByte1802;
	    i_1591_ = class160.aByte1801;
	}
	byte i_1592_ = 0;
	byte i_1593_ = 0;
	if (i_1588_ != -1) {
	    Class160 class160
		= class165.method2093(i_1588_ & 0xffff, (byte) -51);
	    i_1592_ = class160.aByte1802;
	    i_1593_ = class160.aByte1801;
	    if (class160.aByte1775 != 0 || class160.aByte1776 != 0)
		((Class157_Sub3) this).aBool9635 = true;
	}
	if (i_1590_ != i_1592_ | i_1591_ != i_1593_) {
	    if (((Class157_Sub3) this).aClass145Array9684 != null) {
		for (int i_1594_ = 0;
		     i_1594_ < ((Class157_Sub3) this).anInt9685; i_1594_++) {
		    Class145 class145
			= ((Class157_Sub3) this).aClass145Array9684[i_1594_];
		    Class113 class113
			= ((Class157_Sub3) this).aClass113Array9687[i_1594_];
		    ((Class113) class113).anInt1406
			= (((Class113) class113).anInt1406 & ~0xffffff
			   | ((Class649.anIntArray8420
			       [(((Class157_Sub3) this).aShortArray9653
				 [((Class145) class145).anInt1655]) & 0xffff])
			      & 0xffffff));
		}
	    }
	    if (((Class157_Sub3) this).aClass122_9662 != null)
		((Class122) ((Class157_Sub3) this).aClass122_9662)
		    .anInterface14_1542
		    = null;
	}
    }
    
    public void method2024(int i, int i_1595_, int i_1596_, int i_1597_) {
	for (int i_1598_ = 0; i_1598_ < ((Class157_Sub3) this).anInt9651;
	     i_1598_++) {
	    int i_1599_
		= ((Class157_Sub3) this).aShortArray9653[i_1598_] & 0xffff;
	    int i_1600_ = i_1599_ >> 10 & 0x3f;
	    int i_1601_ = i_1599_ >> 7 & 0x7;
	    int i_1602_ = i_1599_ & 0x7f;
	    if (i != -1)
		i_1600_ += (i - i_1600_) * i_1597_ >> 7;
	    if (i_1595_ != -1)
		i_1601_ += (i_1595_ - i_1601_) * i_1597_ >> 7;
	    if (i_1596_ != -1)
		i_1602_ += (i_1596_ - i_1602_) * i_1597_ >> 7;
	    ((Class157_Sub3) this).aShortArray9653[i_1598_]
		= (short) (i_1600_ << 10 | i_1601_ << 7 | i_1602_);
	}
	if (((Class157_Sub3) this).aClass145Array9684 != null) {
	    for (int i_1603_ = 0; i_1603_ < ((Class157_Sub3) this).anInt9685;
		 i_1603_++) {
		Class145 class145
		    = ((Class157_Sub3) this).aClass145Array9684[i_1603_];
		Class113 class113
		    = ((Class157_Sub3) this).aClass113Array9687[i_1603_];
		((Class113) class113).anInt1406
		    = (((Class113) class113).anInt1406 & ~0xffffff
		       | ((Class649.anIntArray8420
			   [(((Class157_Sub3) this).aShortArray9653
			     [((Class145) class145).anInt1655]) & 0xffff])
			  & 0xffffff));
	    }
	}
	if (((Class157_Sub3) this).aClass122_9662 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9662)
		.anInterface14_1542
		= null;
    }
    
    public void method2037(int i, int i_1604_, int i_1605_, int i_1606_) {
	for (int i_1607_ = 0; i_1607_ < ((Class157_Sub3) this).anInt9651;
	     i_1607_++) {
	    int i_1608_
		= ((Class157_Sub3) this).aShortArray9653[i_1607_] & 0xffff;
	    int i_1609_ = i_1608_ >> 10 & 0x3f;
	    int i_1610_ = i_1608_ >> 7 & 0x7;
	    int i_1611_ = i_1608_ & 0x7f;
	    if (i != -1)
		i_1609_ += (i - i_1609_) * i_1606_ >> 7;
	    if (i_1604_ != -1)
		i_1610_ += (i_1604_ - i_1610_) * i_1606_ >> 7;
	    if (i_1605_ != -1)
		i_1611_ += (i_1605_ - i_1611_) * i_1606_ >> 7;
	    ((Class157_Sub3) this).aShortArray9653[i_1607_]
		= (short) (i_1609_ << 10 | i_1610_ << 7 | i_1611_);
	}
	if (((Class157_Sub3) this).aClass145Array9684 != null) {
	    for (int i_1612_ = 0; i_1612_ < ((Class157_Sub3) this).anInt9685;
		 i_1612_++) {
		Class145 class145
		    = ((Class157_Sub3) this).aClass145Array9684[i_1612_];
		Class113 class113
		    = ((Class157_Sub3) this).aClass113Array9687[i_1612_];
		((Class113) class113).anInt1406
		    = (((Class113) class113).anInt1406 & ~0xffffff
		       | ((Class649.anIntArray8420
			   [(((Class157_Sub3) this).aShortArray9653
			     [((Class145) class145).anInt1655]) & 0xffff])
			  & 0xffffff));
	    }
	}
	if (((Class157_Sub3) this).aClass122_9662 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9662)
		.anInterface14_1542
		= null;
    }
    
    public void method1990(int i) {
	((Class157_Sub3) this).aShort9633 = (short) i;
	if (((Class157_Sub3) this).aClass122_9662 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9662)
		.anInterface14_1542
		= null;
	if (((Class157_Sub3) this).aClass122_9663 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9663)
		.anInterface14_1542
		= null;
    }
    
    public int method1930() {
	return ((Class157_Sub3) this).anInt9629;
    }
    
    public Class170[] method1922() {
	return ((Class157_Sub3) this).aClass170Array9683;
    }
    
    public int method1973() {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	return ((Class157_Sub3) this).anInt9681;
    }
    
    public Class144[] method2010() {
	return ((Class157_Sub3) this).aClass144Array9664;
    }
    
    void method8894(Class528_Sub21_Sub12_Sub2 class528_sub21_sub12_sub2) {
	if ((((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
	     .anIntArray9408).length
	    < ((Class157_Sub3) this).anInt9623) {
	    ((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		.anIntArray9408
		= new int[((Class157_Sub3) this).anInt9623];
	    ((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
		.anIntArray9558
		= new int[((Class157_Sub3) this).anInt9623];
	}
	int[] is
	    = (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
	       .anIntArray9408);
	int[] is_1613_
	    = (((Class173_Sub2) ((Class157_Sub3) this).aClass173_Sub2_9628)
	       .anIntArray9558);
	for (int i = 0; i < ((Class157_Sub3) this).anInt9637; i++) {
	    int i_1614_
		= (((((Class157_Sub3) this).anIntArray9679[i]
		     - ((((Class157_Sub3) this).anIntArray9639[i]
			 * ((Class173_Sub2) (((Class157_Sub3) this)
					     .aClass173_Sub2_9628)).anInt9508)
			>> 8))
		    >> ((Class173_Sub2)
			((Class157_Sub3) this).aClass173_Sub2_9628).anInt9438)
		   - (((Class528_Sub21_Sub12_Sub2) class528_sub21_sub12_sub2)
		      .anInt12004));
	    int i_1615_
		= (((((Class157_Sub3) this).anIntArray9648[i]
		     - ((((Class157_Sub3) this).anIntArray9639[i]
			 * ((Class173_Sub2) (((Class157_Sub3) this)
					     .aClass173_Sub2_9628)).anInt9462)
			>> 8))
		    >> ((Class173_Sub2)
			((Class157_Sub3) this).aClass173_Sub2_9628).anInt9438)
		   - (((Class528_Sub21_Sub12_Sub2) class528_sub21_sub12_sub2)
		      .anInt12005));
	    int i_1616_ = ((Class157_Sub3) this).anIntArray9660[i];
	    int i_1617_ = ((Class157_Sub3) this).anIntArray9660[i + 1];
	    for (int i_1618_ = i_1616_;
		 (i_1618_ < i_1617_
		  && ((Class157_Sub3) this).aShortArray9682[i_1618_] != 0);
		 i_1618_++) {
		int i_1619_ = ((((Class157_Sub3) this).aShortArray9682[i_1618_]
				& 0xffff)
			       - 1);
		is[i_1619_] = i_1614_;
		is_1613_[i_1619_] = i_1615_;
	    }
	}
	for (int i = 0; i < ((Class157_Sub3) this).anInt9652; i++) {
	    if (((Class157_Sub3) this).aByteArray9654 == null
		|| ((Class157_Sub3) this).aByteArray9654[i] <= 128) {
		int i_1620_
		    = ((Class157_Sub3) this).aShortArray9655[i] & 0xffff;
		int i_1621_
		    = ((Class157_Sub3) this).aShortArray9638[i] & 0xffff;
		int i_1622_
		    = ((Class157_Sub3) this).aShortArray9657[i] & 0xffff;
		int i_1623_ = is[i_1620_];
		int i_1624_ = is[i_1621_];
		int i_1625_ = is[i_1622_];
		int i_1626_ = is_1613_[i_1620_];
		int i_1627_ = is_1613_[i_1621_];
		int i_1628_ = is_1613_[i_1622_];
		if (((i_1623_ - i_1624_) * (i_1627_ - i_1628_)
		     - (i_1627_ - i_1626_) * (i_1625_ - i_1624_))
		    > 0)
		    class528_sub21_sub12_sub2.method10867(i_1626_, i_1627_,
							  i_1628_, i_1623_,
							  i_1624_, i_1625_);
	    }
	}
    }
    
    public Class144[] method2012() {
	return ((Class157_Sub3) this).aClass144Array9664;
    }
    
    public boolean method2013() {
	if (((Class157_Sub3) this).aShortArray9658 == null)
	    return true;
	for (int i = 0; i < ((Class157_Sub3) this).aShortArray9658.length;
	     i++) {
	    if (((Class157_Sub3) this).aShortArray9658[i] != -1) {
		Class160 class160
		    = (((Class157_Sub3) this).aClass173_Sub2_9628
			   .aClass165_1984.method2093
		       (((Class157_Sub3) this).aShortArray9658[i] & 0xffff,
			(byte) -16));
		if (class160.aBool1768
		    && !((Class173_Sub2)
			 ((Class157_Sub3) this).aClass173_Sub2_9628)
			    .aClass135_9399
			    .method1644(Class600.aClass600_7866, class160, -1))
		    return false;
	    }
	}
	return true;
    }
    
    public boolean method2014() {
	if (((Class157_Sub3) this).aShortArray9658 == null)
	    return true;
	for (int i = 0; i < ((Class157_Sub3) this).aShortArray9658.length;
	     i++) {
	    if (((Class157_Sub3) this).aShortArray9658[i] != -1) {
		Class160 class160
		    = (((Class157_Sub3) this).aClass173_Sub2_9628
			   .aClass165_1984.method2093
		       (((Class157_Sub3) this).aShortArray9658[i] & 0xffff,
			(byte) -88));
		if (class160.aBool1768
		    && !((Class173_Sub2)
			 ((Class157_Sub3) this).aClass173_Sub2_9628)
			    .aClass135_9399
			    .method1644(Class600.aClass600_7866, class160, -1))
		    return false;
	    }
	}
	return true;
    }
    
    public boolean method1967() {
	return ((Class157_Sub3) this).aBool9634;
    }
    
    public int method2020() {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	return ((Class157_Sub3) this).anInt9666;
    }
    
    public boolean method2021() {
	return ((Class157_Sub3) this).aBool9635;
    }
    
    public boolean method2017() {
	return ((Class157_Sub3) this).aBool9635;
    }
    
    boolean method8895(int i, int i_1629_, int i_1630_, int i_1631_,
		       int i_1632_, int i_1633_, int i_1634_, int i_1635_) {
	if (i_1629_ < i_1630_ && i_1629_ < i_1631_ && i_1629_ < i_1632_)
	    return false;
	if (i_1629_ > i_1630_ && i_1629_ > i_1631_ && i_1629_ > i_1632_)
	    return false;
	if (i < i_1633_ && i < i_1634_ && i < i_1635_)
	    return false;
	if (i > i_1633_ && i > i_1634_ && i > i_1635_)
	    return false;
	return true;
    }
    
    public void method1940(int i) {
	int i_1636_ = Class417.anIntArray4766[i];
	int i_1637_ = Class417.anIntArray4767[i];
	for (int i_1638_ = 0; i_1638_ < ((Class157_Sub3) this).anInt9637;
	     i_1638_++) {
	    int i_1639_
		= ((((Class157_Sub3) this).anIntArray9648[i_1638_] * i_1636_
		    + ((Class157_Sub3) this).anIntArray9679[i_1638_] * i_1637_)
		   >> 14);
	    ((Class157_Sub3) this).anIntArray9648[i_1638_]
		= ((((Class157_Sub3) this).anIntArray9648[i_1638_] * i_1637_
		    - ((Class157_Sub3) this).anIntArray9679[i_1638_] * i_1636_)
		   >> 14);
	    ((Class157_Sub3) this).anIntArray9679[i_1638_] = i_1639_;
	}
	for (int i_1640_ = 0; i_1640_ < ((Class157_Sub3) this).anInt9623;
	     i_1640_++) {
	    int i_1641_
		= ((((Class157_Sub3) this).aShortArray9646[i_1640_] * i_1636_
		    + (((Class157_Sub3) this).aShortArray9673[i_1640_]
		       * i_1637_))
		   >> 14);
	    ((Class157_Sub3) this).aShortArray9646[i_1640_]
		= (short) (((((Class157_Sub3) this).aShortArray9646[i_1640_]
			     * i_1637_)
			    - (((Class157_Sub3) this).aShortArray9673[i_1640_]
			       * i_1636_))
			   >> 14);
	    ((Class157_Sub3) this).aShortArray9673[i_1640_] = (short) i_1641_;
	}
	if (((Class157_Sub3) this).aClass122_9663 == null
	    && ((Class157_Sub3) this).aClass122_9662 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9662)
		.anInterface14_1542
		= null;
	if (((Class157_Sub3) this).aClass122_9663 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9663)
		.anInterface14_1542
		= null;
	if (((Class157_Sub3) this).aClass122_9661 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9661)
		.anInterface14_1542
		= null;
	((Class157_Sub3) this).aBool9649 = false;
    }
    
    public int method1975() {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	return ((Class157_Sub3) this).aShort9674;
    }
    
    public int method1929() {
	return ((Class157_Sub3) this).anInt9629;
    }
    
    public void method1870(int i) {
	int i_1642_ = Class417.anIntArray4766[i];
	int i_1643_ = Class417.anIntArray4767[i];
	for (int i_1644_ = 0; i_1644_ < ((Class157_Sub3) this).anInt9637;
	     i_1644_++) {
	    int i_1645_
		= ((((Class157_Sub3) this).anIntArray9639[i_1644_] * i_1643_
		    - ((Class157_Sub3) this).anIntArray9648[i_1644_] * i_1642_)
		   >> 14);
	    ((Class157_Sub3) this).anIntArray9648[i_1644_]
		= ((((Class157_Sub3) this).anIntArray9639[i_1644_] * i_1642_
		    + ((Class157_Sub3) this).anIntArray9648[i_1644_] * i_1643_)
		   >> 14);
	    ((Class157_Sub3) this).anIntArray9639[i_1644_] = i_1645_;
	}
	if (((Class157_Sub3) this).aClass122_9661 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9661)
		.anInterface14_1542
		= null;
	((Class157_Sub3) this).aBool9649 = false;
    }
    
    public void method2019(int i, int i_1646_, int i_1647_) {
	for (int i_1648_ = 0; i_1648_ < ((Class157_Sub3) this).anInt9637;
	     i_1648_++) {
	    if (i != 0)
		((Class157_Sub3) this).anIntArray9679[i_1648_] += i;
	    if (i_1646_ != 0)
		((Class157_Sub3) this).anIntArray9639[i_1648_] += i_1646_;
	    if (i_1647_ != 0)
		((Class157_Sub3) this).anIntArray9648[i_1648_] += i_1647_;
	}
	if (((Class157_Sub3) this).aClass122_9661 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9661)
		.anInterface14_1542
		= null;
	((Class157_Sub3) this).aBool9649 = false;
    }
    
    public void method1997(byte i, byte[] is) {
	if (is == null) {
	    for (int i_1649_ = 0; i_1649_ < ((Class157_Sub3) this).anInt9651;
		 i_1649_++)
		((Class157_Sub3) this).aByteArray9654[i_1649_] = i;
	} else {
	    for (int i_1650_ = 0; i_1650_ < ((Class157_Sub3) this).anInt9651;
		 i_1650_++) {
		int i_1651_ = 255 - ((255 - (is[i_1650_] & 0xff))
				     * (255 - (i & 0xff)) / 255);
		((Class157_Sub3) this).aByteArray9654[i_1650_]
		    = (byte) i_1651_;
	    }
	}
	if (((Class157_Sub3) this).aClass122_9662 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9662)
		.anInterface14_1542
		= null;
    }
    
    public int method1954() {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	return ((Class157_Sub3) this).anInt9666;
    }
    
    public boolean method1950() {
	if (((Class157_Sub3) this).aShortArray9658 == null)
	    return true;
	for (int i = 0; i < ((Class157_Sub3) this).aShortArray9658.length;
	     i++) {
	    if (((Class157_Sub3) this).aShortArray9658[i] != -1) {
		Class160 class160
		    = (((Class157_Sub3) this).aClass173_Sub2_9628
			   .aClass165_1984.method2093
		       (((Class157_Sub3) this).aShortArray9658[i] & 0xffff,
			(byte) -102));
		if (class160.aBool1768
		    && !((Class173_Sub2)
			 ((Class157_Sub3) this).aClass173_Sub2_9628)
			    .aClass135_9399
			    .method1644(Class600.aClass600_7866, class160, -1))
		    return false;
	    }
	}
	return true;
    }
    
    public int method2023() {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	return ((Class157_Sub3) this).aShort9693;
    }
    
    public int method1948() {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	return ((Class157_Sub3) this).aShort9693;
    }
    
    public void method1865(short i, short i_1652_) {
	for (int i_1653_ = 0; i_1653_ < ((Class157_Sub3) this).anInt9651;
	     i_1653_++) {
	    if (((Class157_Sub3) this).aShortArray9653[i_1653_] == i)
		((Class157_Sub3) this).aShortArray9653[i_1653_] = i_1652_;
	}
	if (((Class157_Sub3) this).aClass145Array9684 != null) {
	    for (int i_1654_ = 0; i_1654_ < ((Class157_Sub3) this).anInt9685;
		 i_1654_++) {
		Class145 class145
		    = ((Class157_Sub3) this).aClass145Array9684[i_1654_];
		Class113 class113
		    = ((Class157_Sub3) this).aClass113Array9687[i_1654_];
		((Class113) class113).anInt1406
		    = (((Class113) class113).anInt1406 & ~0xffffff
		       | ((Class649.anIntArray8420
			   [(((Class157_Sub3) this).aShortArray9653
			     [((Class145) class145).anInt1655]) & 0xffff])
			  & 0xffffff));
	    }
	}
	if (((Class157_Sub3) this).aClass122_9662 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9662)
		.anInterface14_1542
		= null;
    }
    
    public void method1974(short i, short i_1655_) {
	for (int i_1656_ = 0; i_1656_ < ((Class157_Sub3) this).anInt9651;
	     i_1656_++) {
	    if (((Class157_Sub3) this).aShortArray9653[i_1656_] == i)
		((Class157_Sub3) this).aShortArray9653[i_1656_] = i_1655_;
	}
	if (((Class157_Sub3) this).aClass145Array9684 != null) {
	    for (int i_1657_ = 0; i_1657_ < ((Class157_Sub3) this).anInt9685;
		 i_1657_++) {
		Class145 class145
		    = ((Class157_Sub3) this).aClass145Array9684[i_1657_];
		Class113 class113
		    = ((Class157_Sub3) this).aClass113Array9687[i_1657_];
		((Class113) class113).anInt1406
		    = (((Class113) class113).anInt1406 & ~0xffffff
		       | ((Class649.anIntArray8420
			   [(((Class157_Sub3) this).aShortArray9653
			     [((Class145) class145).anInt1655]) & 0xffff])
			  & 0xffffff));
	    }
	}
	if (((Class157_Sub3) this).aClass122_9662 != null)
	    ((Class122) ((Class157_Sub3) this).aClass122_9662)
		.anInterface14_1542
		= null;
    }
    
    void method1868() {
	/* empty */
    }
    
    void method2027() {
	/* empty */
    }
    
    Class157_Sub3(Class173_Sub2 class173_sub2) {
	((Class157_Sub3) this).anInt9623 = 0;
	((Class157_Sub3) this).anInt9651 = 0;
	((Class157_Sub3) this).anInt9652 = 0;
	((Class157_Sub3) this).aBool9668 = true;
	((Class157_Sub3) this).aBool9649 = false;
	((Class157_Sub3) this).aBool9678 = false;
	((Class157_Sub3) this).aClass173_Sub2_9628 = class173_sub2;
	((Class157_Sub3) this).aClass122_9661 = new Class122(null, 5126, 3, 0);
	((Class157_Sub3) this).aClass122_9686 = new Class122(null, 5126, 2, 0);
	((Class157_Sub3) this).aClass122_9663 = new Class122(null, 5126, 3, 0);
	((Class157_Sub3) this).aClass122_9662 = new Class122(null, 5121, 4, 0);
	((Class157_Sub3) this).aClass129_9665 = new Class129();
    }
    
    int method8896(int i, short i_1658_, int i_1659_, byte i_1660_) {
	int i_1661_ = Class649.anIntArray8420[method8890(i, i_1659_)];
	if (i_1658_ != -1) {
	    Class160 class160
		= ((Class157_Sub3) this).aClass173_Sub2_9628.aClass165_1984
		      .method2093(i_1658_ & 0xffff, (byte) -89);
	    int i_1662_ = class160.aByte1802 & 0xff;
	    if (i_1662_ != 0) {
		int i_1663_;
		if (i_1659_ < 0)
		    i_1663_ = 0;
		else if (i_1659_ > 127)
		    i_1663_ = 16777215;
		else
		    i_1663_ = 131586 * i_1659_;
		if (i_1662_ == 256)
		    i_1661_ = i_1663_;
		else {
		    int i_1664_ = i_1662_;
		    int i_1665_ = 256 - i_1662_;
		    i_1661_ = ((((i_1663_ & 0xff00ff) * i_1664_
				 + (i_1661_ & 0xff00ff) * i_1665_)
				& ~0xff00ff)
			       + (((i_1663_ & 0xff00) * i_1664_
				   + (i_1661_ & 0xff00) * i_1665_)
				  & 0xff0000)) >> 8;
		}
	    }
	    int i_1666_ = class160.aByte1801 & 0xff;
	    if (i_1666_ != 0) {
		i_1666_ += 256;
		int i_1667_ = ((i_1661_ & 0xff0000) >> 16) * i_1666_;
		if (i_1667_ > 65535)
		    i_1667_ = 65535;
		int i_1668_ = ((i_1661_ & 0xff00) >> 8) * i_1666_;
		if (i_1668_ > 65535)
		    i_1668_ = 65535;
		int i_1669_ = (i_1661_ & 0xff) * i_1666_;
		if (i_1669_ > 65535)
		    i_1669_ = 65535;
		i_1661_
		    = (i_1667_ << 8 & 0xff0000) + (i_1668_ & 0xff00) + (i_1669_
									>> 8);
	    }
	}
	return i_1661_ << 8 | 255 - (i_1660_ & 0xff);
    }
    
    void method2030() {
	/* empty */
    }
    
    public int method1937() {
	if (!((Class157_Sub3) this).aBool9649)
	    method8893();
	return ((Class157_Sub3) this).anInt9681;
    }
    
    public void method1916(short i, short i_1670_) {
	Class165 class165
	    = ((Class157_Sub3) this).aClass173_Sub2_9628.aClass165_1984;
	for (int i_1671_ = 0; i_1671_ < ((Class157_Sub3) this).anInt9651;
	     i_1671_++) {
	    if (((Class157_Sub3) this).aShortArray9658[i_1671_] == i)
		((Class157_Sub3) this).aShortArray9658[i_1671_] = i_1670_;
	}
	byte i_1672_ = 0;
	byte i_1673_ = 0;
	if (i != -1) {
	    Class160 class160 = class165.method2093(i & 0xffff, (byte) 0);
	    i_1672_ = class160.aByte1802;
	    i_1673_ = class160.aByte1801;
	}
	byte i_1674_ = 0;
	byte i_1675_ = 0;
	if (i_1670_ != -1) {
	    Class160 class160
		= class165.method2093(i_1670_ & 0xffff, (byte) 4);
	    i_1674_ = class160.aByte1802;
	    i_1675_ = class160.aByte1801;
	    if (class160.aByte1775 != 0 || class160.aByte1776 != 0)
		((Class157_Sub3) this).aBool9635 = true;
	}
	if (i_1672_ != i_1674_ | i_1673_ != i_1675_) {
	    if (((Class157_Sub3) this).aClass145Array9684 != null) {
		for (int i_1676_ = 0;
		     i_1676_ < ((Class157_Sub3) this).anInt9685; i_1676_++) {
		    Class145 class145
			= ((Class157_Sub3) this).aClass145Array9684[i_1676_];
		    Class113 class113
			= ((Class157_Sub3) this).aClass113Array9687[i_1676_];
		    ((Class113) class113).anInt1406
			= (((Class113) class113).anInt1406 & ~0xffffff
			   | ((Class649.anIntArray8420
			       [(((Class157_Sub3) this).aShortArray9653
				 [((Class145) class145).anInt1655]) & 0xffff])
			      & 0xffffff));
		}
	    }
	    if (((Class157_Sub3) this).aClass122_9662 != null)
		((Class122) ((Class157_Sub3) this).aClass122_9662)
		    .anInterface14_1542
		    = null;
	}
    }
    
    public boolean method2016() {
	return ((Class157_Sub3) this).aBool9635;
    }
}
