/* Class497 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class497
{
    Class151 aClass151_6805;
    int anInt6806;
    static final int anInt6807 = 1;
    static final int anInt6808 = 2;
    static final int anInt6809 = 192;
    int anInt6810;
    int anInt6811;
    int anInt6812;
    int anInt6813;
    boolean aBool6814;
    int anInt6815;
    int anInt6816;
    int anInt6817;
    int anInt6818;
    int anInt6819;
    int anInt6820;
    static int[] anIntArray6821 = new int[4];
    int anInt6822;
    static final int anInt6823 = 24;
    int anInt6824;
    static final int anInt6825 = 512;
    static final int anInt6826 = 0;
    static final int anInt6827 = 24;
    int anInt6828;
    static final int anInt6829 = 128;
    static final int anInt6830 = 13;
    static final int anInt6831 = 16;
    static Class157 aClass157_6832;
    static Class151 aClass151_6833;
    static Class151 aClass151_6834;
    int anInt6835;
    
    boolean method6057(int i, int i_0_, int i_1_, int i_2_) {
	int i_3_;
	int i_4_;
	int i_5_;
	if (!((Class497) this).aBool6814) {
	    i_3_ = ((Class497) this).anInt6811 - i;
	    i_4_ = ((Class497) this).anInt6806 - i_0_;
	    i_5_ = ((Class497) this).anInt6822 - i_1_;
	    ((Class497) this).anInt6819
		= (int) Math.sqrt((double) (i_3_ * i_3_ + i_4_ * i_4_
					    + i_5_ * i_5_));
	    if (((Class497) this).anInt6819 == 0)
		((Class497) this).anInt6819 = 1;
	    i_3_ = (i_3_ << 8) / ((Class497) this).anInt6819;
	    i_4_ = (i_4_ << 8) / ((Class497) this).anInt6819;
	    i_5_ = (i_5_ << 8) / ((Class497) this).anInt6819;
	} else {
	    ((Class497) this).anInt6819 = 1073741823;
	    i_3_ = ((Class497) this).anInt6811;
	    i_4_ = ((Class497) this).anInt6806;
	    i_5_ = ((Class497) this).anInt6822;
	}
	int i_6_ = (int) (Math.sqrt((double) (i_3_ * i_3_ + i_4_ * i_4_
					      + i_5_ * i_5_))
			  * 256.0);
	if (i_6_ > 128) {
	    i_3_ = (i_3_ << 16) / i_6_;
	    i_4_ = (i_4_ << 16) / i_6_;
	    i_5_ = (i_5_ << 16) / i_6_;
	    ((Class497) this).anInt6812
		= (((Class497) this).anInt6810 * i_2_
		   / (((Class497) this).aBool6814 ? 1024
		      : ((Class497) this).anInt6819));
	} else
	    ((Class497) this).anInt6812 = 0;
	if (((Class497) this).anInt6812 < 8) {
	    ((Class497) this).aClass151_6805 = null;
	    return false;
	}
	int i_7_
	    = Class327.method4259(((Class497) this).anInt6812, -2134279851);
	if (i_7_ > i_2_)
	    i_7_ = ItemStyleOverride.method531(i_2_, -1479148165);
	if (i_7_ > 512)
	    i_7_ = 512;
	if (i_7_ != ((Class497) this).anInt6820)
	    ((Class497) this).anInt6820 = i_7_;
	((Class497) this).anInt6828
	    = (int) (Math.asin((double) ((float) i_4_ / 256.0F))
		     * 2607.5945876176133) & 0x3fff;
	((Class497) this).anInt6818
	    = (int) (Math.atan2((double) i_3_, (double) -i_5_)
		     * 2607.5945876176133) & 0x3fff;
	((Class497) this).aClass151_6805 = null;
	return true;
    }
    
    static void method6058() {
	aClass157_6832 = null;
	aClass151_6834 = null;
    }
    
    boolean method6059(Class173 class173, Class497 class497_8_) {
	return (((Class497) this).aClass151_6805 != null
		|| method6061(class173, class497_8_));
    }
    
    void method6060(Class173 class173, int i, int i_9_, int i_10_, int i_11_,
		    int i_12_, int i_13_, int i_14_, int i_15_, int i_16_,
		    int i_17_) {
	if (((Class497) this).aClass151_6805 != null) {
	    float[] fs = new float[3];
	    float f = (float) -(((Class497) this).anInt6811 - i_14_ << 16);
	    float f_18_ = (float) (((Class497) this).anInt6806 - i_15_ << 15);
	    float f_19_ = (float) -(((Class497) this).anInt6822 - i_16_ << 16);
	    float[] fs_20_ = new float[3];
	    class173.method2529().method5235(fs_20_);
	    f += fs_20_[0];
	    f_18_ += fs_20_[1];
	    f_19_ += fs_20_[2];
	    class173.method2322(f, f_18_, f_19_, fs);
	    if (!(fs[2] < 0.0F)) {
		int i_21_ = (int) (fs[0] - (float) (((Class497) this).anInt6812
						    / 2));
		int i_22_ = (int) (fs[1] - (float) (((Class497) this).anInt6812
						    / 2));
		if (i_22_ < i_11_ && i_22_ + ((Class497) this).anInt6812 > 0
		    && i_21_ < i_10_
		    && i_21_ + ((Class497) this).anInt6812 > 0)
		    ((Class497) this).aClass151_6805.method1776
			(i_21_, i_22_, ((Class497) this).anInt6812,
			 ((Class497) this).anInt6812, 0,
			 i_17_ << 24 | 0xffffff, 1);
	    }
	}
    }
    
    boolean method6061(Class173 class173, Class497 class497_23_) {
	if (((Class497) this).aClass151_6805 == null) {
	    if (((Class497) this).anInt6835 == 0) {
		if (Class481.anInterface22_5460.method122
		    (Class600.aClass600_7866, ((Class497) this).anInt6815,
		     Class595.aClass595_7761, 0.7F,
		     ((Class497) this).anInt6820, ((Class497) this).anInt6820,
		     false, (byte) 60)) {
		    int[] is
			= (Class481.anInterface22_5460.method127
			   (Class600.aClass600_7866,
			    ((Class497) this).anInt6815, 0.7F,
			    ((Class497) this).anInt6820,
			    ((Class497) this).anInt6820, false, (byte) 9));
		    ((Class497) this).aClass151_6805
			= class173.method2418(is, 0,
					      ((Class497) this).anInt6820,
					      ((Class497) this).anInt6820,
					      ((Class497) this).anInt6820,
					      -2066530741);
		}
	    } else if (((Class497) this).anInt6835 == 2)
		method6062(class173, class497_23_);
	    else if (((Class497) this).anInt6835 == 1)
		method6063(class173, class497_23_);
	}
	return ((Class497) this).aClass151_6805 != null;
    }
    
    void method6062(Class173 class173, Class497 class497_24_) {
	Class177 class177
	    = Class177.method2590(Class28.aClass446_304,
				  ((Class497) this).anInt6815, 0);
	if (class177 != null) {
	    class173.method2207(anIntArray6821);
	    class173.method2204(0, 0, ((Class497) this).anInt6820,
				((Class497) this).anInt6820);
	    class173.method2268(2, 0);
	    class173.method2216(0, 0, ((Class497) this).anInt6820,
				((Class497) this).anInt6820, 0, 0);
	    int i = 0;
	    int i_25_ = 0;
	    int i_26_ = 256;
	    if (class497_24_ != null) {
		if (((Class497) class497_24_).aBool6814) {
		    i = -((Class497) class497_24_).anInt6811;
		    i_25_ = -((Class497) class497_24_).anInt6806;
		    i_26_ = -((Class497) class497_24_).anInt6822;
		} else {
		    i = (((Class497) this).anInt6811
			 - ((Class497) class497_24_).anInt6811);
		    i_25_ = (((Class497) this).anInt6806
			     - ((Class497) class497_24_).anInt6806);
		    i_26_ = (((Class497) this).anInt6822
			     - ((Class497) class497_24_).anInt6822);
		}
	    }
	    if (((Class497) this).anInt6828 != 0) {
		int i_27_ = -((Class497) this).anInt6828 & 0x3fff;
		int i_28_ = Class417.anIntArray4766[i_27_];
		int i_29_ = Class417.anIntArray4767[i_27_];
		int i_30_ = i_25_ * i_29_ - i_26_ * i_28_ >> 14;
		i_26_ = i_25_ * i_28_ + i_26_ * i_29_ >> 14;
		i_25_ = i_30_;
	    }
	    if (((Class497) this).anInt6818 != 0) {
		int i_31_ = -((Class497) this).anInt6818 & 0x3fff;
		int i_32_ = Class417.anIntArray4766[i_31_];
		int i_33_ = Class417.anIntArray4767[i_31_];
		int i_34_ = i_26_ * i_32_ + i * i_33_ >> 14;
		i_26_ = i_26_ * i_33_ - i * i_32_ >> 14;
		i = i_34_;
	    }
	    class173.method2477(1.0F);
	    class173.method2160(((Class497) this).anInt6816, 1.0F, 1.0F,
				(float) i, (float) i_25_, (float) i_26_);
	    class177.method2578(((Class497) this).anInt6813 & 0x3fff,
				((Class497) this).anInt6824 & 0x3fff,
				((Class497) this).anInt6817 & 0x3fff);
	    Class157 class157
		= class173.method2244(class177, 2048, 0, 64, 768);
	    int i_35_ = class157.method1882() - class157.method1902();
	    int i_36_ = class157.method1905() - class157.method2018();
	    int i_37_ = i_35_ > i_36_ ? i_35_ : i_36_;
	    int i_38_ = 1024 * ((Class497) this).anInt6820 / i_37_;
	    Class418 class418 = class173.method2187();
	    Class418 class418_39_ = class173.method2241();
	    class418_39_.method5025((float) (((Class497) this).anInt6820 / 2),
				    (float) (((Class497) this).anInt6820 / 2),
				    (float) i_38_, (float) i_38_, 50.0F,
				    50000.0F,
				    (float) class173.method2403((byte) -85)
						.method2074(),
				    (float) class173.method2403
						((byte) -109).method2070(),
				    1024.0F);
	    class173.method2252(class418_39_);
	    Class433 class433 = new Class433();
	    class173.method2465(class433);
	    Class433 class433_40_ = class173.method2479();
	    class433_40_.method5248(0.0F, 0.0F,
				    (float) (50 - class157.method1900()));
	    class157.method1897(class433_40_, null, 1);
	    ((Class497) this).aClass151_6805
		= class173.method2234(0, 0, ((Class497) this).anInt6820,
				      ((Class497) this).anInt6820, true);
	    ((Class497) this).aClass151_6805.method1787(0, 0, 3);
	    class173.method2252(class418);
	    class173.method2204(anIntArray6821[0], anIntArray6821[1],
				anIntArray6821[2], anIntArray6821[3]);
	}
    }
    
    void method6063(Class173 class173, Class497 class497_41_) {
	method6064(class173);
	method6065(class173);
	class173.method2207(anIntArray6821);
	class173.method2204(0, 0, ((Class497) this).anInt6820,
			    ((Class497) this).anInt6820);
	class173.method2268(2, 0);
	class173.method2216(0, 0, ((Class497) this).anInt6820,
			    ((Class497) this).anInt6820,
			    ~0xffffff | ((Class497) this).anInt6816, 0);
	int i = 0;
	int i_42_ = 0;
	int i_43_ = 256;
	if (class497_41_ != null) {
	    if (((Class497) class497_41_).aBool6814) {
		i = -((Class497) class497_41_).anInt6811;
		i_42_ = -((Class497) class497_41_).anInt6806;
		i_43_ = -((Class497) class497_41_).anInt6822;
	    } else {
		i = (((Class497) class497_41_).anInt6811
		     - ((Class497) this).anInt6811);
		i_42_ = (((Class497) class497_41_).anInt6806
			 - ((Class497) this).anInt6806);
		i_43_ = (((Class497) class497_41_).anInt6822
			 - ((Class497) this).anInt6822);
	    }
	}
	if (((Class497) this).anInt6828 != 0) {
	    int i_44_ = Class417.anIntArray4766[((Class497) this).anInt6828];
	    int i_45_ = Class417.anIntArray4767[((Class497) this).anInt6828];
	    int i_46_ = i_42_ * i_45_ - i_43_ * i_44_ >> 14;
	    i_43_ = i_42_ * i_44_ + i_43_ * i_45_ >> 14;
	    i_42_ = i_46_;
	}
	if (((Class497) this).anInt6818 != 0) {
	    int i_47_ = Class417.anIntArray4766[((Class497) this).anInt6818];
	    int i_48_ = Class417.anIntArray4767[((Class497) this).anInt6818];
	    int i_49_ = i_43_ * i_47_ + i * i_48_ >> 14;
	    i_43_ = i_43_ * i_48_ - i * i_47_ >> 14;
	    i = i_49_;
	}
	Class157 class157 = aClass157_6832.method1951((byte) 0, 51200, true);
	class157.method1916((short) 0, (short) ((Class497) this).anInt6815);
	class173.method2477(1.0F);
	class173.method2160(16777215, 1.0F, 1.0F, (float) i, (float) i_42_,
			    (float) i_43_);
	int i_50_ = (1024 * ((Class497) this).anInt6820
		     / (class157.method1882() - class157.method1902()));
	if (((Class497) this).anInt6816 != 0)
	    i_50_ = i_50_ * 13 / 16;
	Class418 class418 = class173.method2187();
	Class418 class418_51_ = class173.method2241();
	class418_51_.method5025((float) (((Class497) this).anInt6820 / 2),
				(float) (((Class497) this).anInt6820 / 2),
				(float) i_50_, (float) i_50_, 50.0F, 50000.0F,
				(float) class173.method2403((byte) -2)
					    .method2074(),
				(float) class173.method2403((byte) -23)
					    .method2070(),
				1024.0F);
	class173.method2252(class418_51_);
	class173.method2465(new Class433());
	Class433 class433 = new Class433();
	class433.method5248(0.0F, 0.0F, (float) (50 - class157.method1900()));
	class157.method1897(class433, null, 1);
	int i_52_ = ((Class497) this).anInt6820 * 13 / 16;
	int i_53_ = (((Class497) this).anInt6820 - i_52_) / 2;
	aClass151_6833.method1776(i_53_, i_53_, i_52_, i_52_, 0,
				  ~0xffffff | ((Class497) this).anInt6816, 1);
	((Class497) this).aClass151_6805
	    = class173.method2234(0, 0, ((Class497) this).anInt6820,
				  ((Class497) this).anInt6820, true);
	class173.method2268(2, 0);
	class173.method2216(0, 0, ((Class497) this).anInt6820,
			    ((Class497) this).anInt6820, 0, 0);
	aClass151_6834.method1776(0, 0, ((Class497) this).anInt6820,
				  ((Class497) this).anInt6820, 1, 0, 0);
	((Class497) this).aClass151_6805.method1787(0, 0, 3);
	class173.method2252(class418);
	class173.method2204(anIntArray6821[0], anIntArray6821[1],
			    anIntArray6821[2], anIntArray6821[3]);
    }
    
    static void method6064(Class173 class173) {
	if (aClass157_6832 == null) {
	    Class177 class177 = new Class177(580, 1104, 1);
	    class177.method2574((short) 0, (short) 32767, (short) 0,
				(short) 1024, (short) 1024, (short) 1024,
				(byte) 0, (byte) 0, (byte) 0);
	    class177.method2576(0, 128, 0);
	    class177.method2576(0, -128, 0);
	    for (int i = 0; i <= 24; i++) {
		int i_54_ = i * 8192 / 24;
		int i_55_ = Class417.anIntArray4766[i_54_];
		int i_56_ = Class417.anIntArray4767[i_54_];
		for (int i_57_ = 1; i_57_ < 24; i_57_++) {
		    int i_58_ = i_57_ * 8192 / 24;
		    int i_59_ = Class417.anIntArray4767[i_58_] >> 7;
		    int i_60_ = Class417.anIntArray4766[i_58_] * i_55_ >> 21;
		    int i_61_ = Class417.anIntArray4766[i_58_] * i_56_ >> 21;
		    class177.method2576(i_61_, i_59_, -i_60_);
		}
		if (i > 0) {
		    int i_62_ = i * 23 + 2;
		    int i_63_ = i_62_ - 23;
		    class177.method2580(0, i_63_, i_62_, (byte) 0, (byte) 0,
					(short) 127, (byte) 0, (short) 0);
		    for (int i_64_ = 1; i_64_ < 23; i_64_++) {
			int i_65_ = i_63_ + 1;
			int i_66_ = i_62_ + 1;
			class177.method2580(i_63_, i_65_, i_62_, (byte) 0,
					    (byte) 0, (short) 127, (byte) 0,
					    (short) 0);
			class177.method2580(i_65_, i_66_, i_62_, (byte) 0,
					    (byte) 0, (short) 127, (byte) 0,
					    (short) 0);
			i_63_ = i_65_;
			i_62_ = i_66_;
		    }
		    class177.method2580(i_62_, i_63_, 1, (byte) 0, (byte) 0,
					(short) 127, (byte) 0, (short) 0);
		}
	    }
	    class177.anInt2074 = class177.anInt2036;
	    class177.anIntArray2060 = null;
	    class177.anIntArray2042 = null;
	    class177.aByteArray2048 = null;
	    aClass157_6832 = class173.method2244(class177, 51200, 33, 64, 768);
	}
    }
    
    static void method6065(Class173 class173) {
	if (aClass151_6834 == null) {
	    int[] is = new int[16384];
	    int[] is_67_ = new int[16384];
	    for (int i = 0; i < 64; i++) {
		int i_68_ = 64 - i;
		i_68_ *= i_68_;
		int i_69_ = 128 - i - 1;
		int i_70_ = i * 128;
		int i_71_ = i_69_ * 128;
		for (int i_72_ = 0; i_72_ < 64; i_72_++) {
		    int i_73_ = 64 - i_72_;
		    i_73_ *= i_73_;
		    int i_74_ = 128 - i_72_ - 1;
		    int i_75_ = 256 - (i_73_ + i_68_ << 8) / 4096;
		    i_75_ = i_75_ * 3072 / 1536;
		    if (i_75_ < 0)
			i_75_ = 0;
		    else if (i_75_ > 255)
			i_75_ = 255;
		    int i_76_ = i_75_ / 2;
		    is_67_[i_70_ + i_72_] = is_67_[i_70_ + i_74_]
			= is_67_[i_71_ + i_72_] = is_67_[i_71_ + i_74_]
			= ~0xffffff | i_75_ << 16;
		    is[i_70_ + i_72_] = is[i_70_ + i_74_]
			= is[i_71_ + i_72_] = is[i_71_ + i_74_]
			= 127 - i_76_ << 24 | 0xffffff;
		}
	    }
	    aClass151_6834
		= class173.method2418(is_67_, 0, 128, 128, 128, -1397681126);
	    aClass151_6833
		= class173.method2418(is, 0, 128, 128, 128, -1935891257);
	}
    }
    
    public Class497(int i, int i_77_, int i_78_, int i_79_, int i_80_,
		    int i_81_, int i_82_, boolean bool, int i_83_, int i_84_,
		    int i_85_) {
	((Class497) this).anInt6811 = i_78_;
	((Class497) this).anInt6806 = i_79_;
	((Class497) this).anInt6822 = i_80_;
	((Class497) this).aBool6814 = bool;
	((Class497) this).anInt6815 = i_77_;
	((Class497) this).anInt6816 = i_82_;
	((Class497) this).anInt6810 = i_81_;
	((Class497) this).anInt6835 = i;
	((Class497) this).anInt6813 = i_83_;
	((Class497) this).anInt6824 = i_84_;
	((Class497) this).anInt6817 = i_85_;
    }
    
    boolean method6066(int i, int i_86_, int i_87_, int i_88_) {
	int i_89_;
	int i_90_;
	int i_91_;
	if (!((Class497) this).aBool6814) {
	    i_89_ = ((Class497) this).anInt6811 - i;
	    i_90_ = ((Class497) this).anInt6806 - i_86_;
	    i_91_ = ((Class497) this).anInt6822 - i_87_;
	    ((Class497) this).anInt6819
		= (int) Math.sqrt((double) (i_89_ * i_89_ + i_90_ * i_90_
					    + i_91_ * i_91_));
	    if (((Class497) this).anInt6819 == 0)
		((Class497) this).anInt6819 = 1;
	    i_89_ = (i_89_ << 8) / ((Class497) this).anInt6819;
	    i_90_ = (i_90_ << 8) / ((Class497) this).anInt6819;
	    i_91_ = (i_91_ << 8) / ((Class497) this).anInt6819;
	} else {
	    ((Class497) this).anInt6819 = 1073741823;
	    i_89_ = ((Class497) this).anInt6811;
	    i_90_ = ((Class497) this).anInt6806;
	    i_91_ = ((Class497) this).anInt6822;
	}
	int i_92_ = (int) (Math.sqrt((double) (i_89_ * i_89_ + i_90_ * i_90_
					       + i_91_ * i_91_))
			   * 256.0);
	if (i_92_ > 128) {
	    i_89_ = (i_89_ << 16) / i_92_;
	    i_90_ = (i_90_ << 16) / i_92_;
	    i_91_ = (i_91_ << 16) / i_92_;
	    ((Class497) this).anInt6812
		= (((Class497) this).anInt6810 * i_88_
		   / (((Class497) this).aBool6814 ? 1024
		      : ((Class497) this).anInt6819));
	} else
	    ((Class497) this).anInt6812 = 0;
	if (((Class497) this).anInt6812 < 8) {
	    ((Class497) this).aClass151_6805 = null;
	    return false;
	}
	int i_93_
	    = Class327.method4259(((Class497) this).anInt6812, -2134279851);
	if (i_93_ > i_88_)
	    i_93_ = ItemStyleOverride.method531(i_88_, 586517185);
	if (i_93_ > 512)
	    i_93_ = 512;
	if (i_93_ != ((Class497) this).anInt6820)
	    ((Class497) this).anInt6820 = i_93_;
	((Class497) this).anInt6828
	    = (int) (Math.asin((double) ((float) i_90_ / 256.0F))
		     * 2607.5945876176133) & 0x3fff;
	((Class497) this).anInt6818
	    = (int) (Math.atan2((double) i_89_, (double) -i_91_)
		     * 2607.5945876176133) & 0x3fff;
	((Class497) this).aClass151_6805 = null;
	return true;
    }
    
    static void method6067(Class173 class173) {
	if (aClass151_6834 == null) {
	    int[] is = new int[16384];
	    int[] is_94_ = new int[16384];
	    for (int i = 0; i < 64; i++) {
		int i_95_ = 64 - i;
		i_95_ *= i_95_;
		int i_96_ = 128 - i - 1;
		int i_97_ = i * 128;
		int i_98_ = i_96_ * 128;
		for (int i_99_ = 0; i_99_ < 64; i_99_++) {
		    int i_100_ = 64 - i_99_;
		    i_100_ *= i_100_;
		    int i_101_ = 128 - i_99_ - 1;
		    int i_102_ = 256 - (i_100_ + i_95_ << 8) / 4096;
		    i_102_ = i_102_ * 3072 / 1536;
		    if (i_102_ < 0)
			i_102_ = 0;
		    else if (i_102_ > 255)
			i_102_ = 255;
		    int i_103_ = i_102_ / 2;
		    is_94_[i_97_ + i_99_] = is_94_[i_97_ + i_101_]
			= is_94_[i_98_ + i_99_] = is_94_[i_98_ + i_101_]
			= ~0xffffff | i_102_ << 16;
		    is[i_97_ + i_99_] = is[i_97_ + i_101_]
			= is[i_98_ + i_99_] = is[i_98_ + i_101_]
			= 127 - i_103_ << 24 | 0xffffff;
		}
	    }
	    aClass151_6834
		= class173.method2418(is_94_, 0, 128, 128, 128, -1503695051);
	    aClass151_6833
		= class173.method2418(is, 0, 128, 128, 128, -1268307448);
	}
    }
}
