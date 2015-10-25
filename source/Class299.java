/* Class299 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;

public class Class299 implements Definition
{
    public int anInt3263;
    public static final int anInt3264 = 8;
    static final int anInt3265 = 6;
    public int anInt3266;
    Interface12 anInterface12_3267;
    public int anInt3268;
    public String aString3269 = "null";
    public int anInt3270;
    public int[] anIntArray3271;
    public int[] anIntArray3272;
    int[][] anIntArrayArray3273;
    public int anInt3274;
    short[] aShortArray3275;
    public static final int anInt3276 = 1;
    byte[] aByteArray3277;
    Class692 aClass692_3278;
    public boolean aBool3279;
    public byte[] aByteArray3280;
    public boolean aBool3281;
    public int[] anIntArray3282;
    byte aByte3283;
    public short[] aShortArray3284;
    public byte[] aByteArray3285;
    public String[] aStringArray3286;
    int[] anIntArray3287;
    Class285 aClass285_3288;
    public boolean aBool3289;
    public boolean aBool3290;
    int anInt3291;
    int anInt3292;
    public int anInt3293;
    public boolean aBool3294;
    public boolean aBool3295;
    int anInt3296;
    public int anInt3297;
    public int[] anIntArray3298;
    public short[] aShortArray3299;
    public int anInt3300;
    public int anInt3301;
    public int[] anIntArray3302;
    int anInt3303;
    int anInt3304;
    public boolean aBool3305;
    public boolean aBool3306;
    public boolean aBool3307;
    public short aShort3308;
    public int anInt3309;
    public byte aByte3310;
    public byte aByte3311;
    public short aShort3312;
    public byte aByte3313;
    public byte aByte3314;
    int anInt3315;
    public static final int anInt3316 = 2;
    byte aByte3317;
    public int anInt3318;
    public int anInt3319;
    public short[] aShortArray3320;
    public int anInt3321 = -801457155;
    public int anInt3322;
    public short aShort3323;
    public static short[] aShortArray3324 = new short[256];
    public int anInt3325;
    public Class657 aClass657_3326;
    public int anInt3327;
    short[] aShortArray3328;
    public byte aByte3329;
    public int anInt3330;
    public Class431 aClass431_3331;
    public int anInt3332;
    byte aByte3333;
    public int anInt3334;
    public int anInt3335;
    public int anInt3336;
    byte aByte3337;
    
    public final Class157 method3994
	(Class173 class173, int i, Class5_Sub14 class5_sub14,
	 IMultiVarDefinitionsLoader iMultiVarDefinitionsLoader, IMultiVarValueReader iMultiVarValueReader, Class690 class690,
	 Class690 class690_0_, Class690[] class690s, int[] is, int i_1_,
	 Class287 class287, byte i_2_) {
	return method3997(class173, i, class5_sub14, iMultiVarDefinitionsLoader, iMultiVarValueReader,
			  class690, class690_0_, class690s, is, i_1_, class287,
			  anInt3274 * 941026227, true, 1600226731);
    }
    
    public void method58(ByteBuffer class528_sub42, byte i) {
	for (;;) {
	    int i_3_ = class528_sub42.readUnsignedByte((byte) 93);
	    if (0 == i_3_)
		break;
	    method3995(class528_sub42, i_3_, 934933890);
	}
    }
    
    void method3995(ByteBuffer class528_sub42, int i, int i_4_) {
	if (1 == i) {
	    int i_5_ = class528_sub42.readUnsignedByte((byte) 52);
	    anIntArray3271 = new int[i_5_];
	    for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
		anIntArray3271[i_6_]
		    = class528_sub42.method9645((short) -24738);
	} else if (2 == i)
	    aString3269 = class528_sub42.readString(1882754306);
	else if (i == 12)
	    anInt3321 = class528_sub42.readUnsignedByte((byte) 47) * -801457155;
	else if (i >= 30 && i < 35)
	    aStringArray3286[i - 30] = class528_sub42.readString(280983828);
	else if (i == 40) {
	    int i_7_ = class528_sub42.readUnsignedByte((byte) 47);
	    ((Class299) this).aShortArray3275 = new short[i_7_];
	    aShortArray3284 = new short[i_7_];
	    for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
		((Class299) this).aShortArray3275[i_8_]
		    = (short) class528_sub42.readUnsignedShort(-1300144551);
		aShortArray3284[i_8_]
		    = (short) class528_sub42.readUnsignedShort(603461332);
	    }
	} else if (i == 41) {
	    int i_9_ = class528_sub42.readUnsignedByte((byte) 32);
	    ((Class299) this).aShortArray3328 = new short[i_9_];
	    aShortArray3320 = new short[i_9_];
	    for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
		((Class299) this).aShortArray3328[i_10_]
		    = (short) class528_sub42.readUnsignedShort(-1711255494);
		aShortArray3320[i_10_]
		    = (short) class528_sub42.readUnsignedShort(175023348);
	    }
	} else if (i == 42) {
	    int i_11_ = class528_sub42.readUnsignedByte((byte) 125);
	    ((Class299) this).aByteArray3277 = new byte[i_11_];
	    for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
		((Class299) this).aByteArray3277[i_12_]
		    = class528_sub42.method9627(-1085870748);
	} else if (44 == i) {
	    int i_13_ = class528_sub42.readUnsignedShort(-1375017261);
	    int i_14_ = 0;
	    for (int i_15_ = i_13_; i_15_ > 0; i_15_ >>= 1)
		i_14_++;
	    aByteArray3280 = new byte[i_14_];
	    byte i_16_ = 0;
	    for (int i_17_ = 0; i_17_ < i_14_; i_17_++) {
		if ((i_13_ & 1 << i_17_) > 0) {
		    aByteArray3280[i_17_] = i_16_;
		    i_16_++;
		} else
		    aByteArray3280[i_17_] = (byte) -1;
	    }
	} else if (i == 45) {
	    int i_18_ = class528_sub42.readUnsignedShort(-2108877533);
	    int i_19_ = 0;
	    for (int i_20_ = i_18_; i_20_ > 0; i_20_ >>= 1)
		i_19_++;
	    aByteArray3285 = new byte[i_19_];
	    byte i_21_ = 0;
	    for (int i_22_ = 0; i_22_ < i_19_; i_22_++) {
		if ((i_18_ & 1 << i_22_) > 0) {
		    aByteArray3285[i_22_] = i_21_;
		    i_21_++;
		} else
		    aByteArray3285[i_22_] = (byte) -1;
	    }
	} else if (i == 60) {
	    int i_23_ = class528_sub42.readUnsignedByte((byte) 69);
	    anIntArray3272 = new int[i_23_];
	    for (int i_24_ = 0; i_24_ < i_23_; i_24_++)
		anIntArray3272[i_24_]
		    = class528_sub42.method9645((short) 4841);
	} else if (i == 93)
	    aBool3289 = false;
	else if (95 == i)
	    anInt3266 = class528_sub42.readUnsignedShort(-156326554) * 1381102247;
	else if (i == 97)
	    ((Class299) this).anInt3291
		= class528_sub42.readUnsignedShort(-1331625713) * -1351719039;
	else if (i == 98)
	    ((Class299) this).anInt3292
		= class528_sub42.readUnsignedShort(-428542626) * -834247755;
	else if (99 == i)
	    aBool3290 = true;
	else if (i == 100)
	    ((Class299) this).anInt3296
		= class528_sub42.method9627(-1514572745) * -657521887;
	else if (101 == i)
	    ((Class299) this).anInt3315
		= class528_sub42.method9627(-1833147397) * -1679659729;
	else if (102 == i) {
	    int i_25_ = class528_sub42.readUnsignedByte((byte) 55);
	    int i_26_ = 0;
	    for (int i_27_ = i_25_; 0 != i_27_; i_27_ >>= 1)
		i_26_++;
	    anIntArray3298 = new int[i_26_];
	    aShortArray3299 = new short[i_26_];
	    for (int i_28_ = 0; i_28_ < i_26_; i_28_++) {
		if (0 == (i_25_ & 1 << i_28_)) {
		    anIntArray3298[i_28_] = -1;
		    aShortArray3299[i_28_] = (short) -1;
		} else {
		    anIntArray3298[i_28_]
			= class528_sub42.method9645((short) 30131);
		    aShortArray3299[i_28_]
			= (short) class528_sub42.method9725(-899539179);
		}
	    }
	} else if (i == 103)
	    anInt3301 = class528_sub42.readUnsignedShort(-1495463032) * 134648133;
	else if (i == 106 || 118 == i) {
	    ((Class299) this).anInt3303
		= class528_sub42.readUnsignedShort(-2122627064) * 1662505193;
	    if (((Class299) this).anInt3303 * 78776153 == 65535)
		((Class299) this).anInt3303 = -1662505193;
	    ((Class299) this).anInt3304
		= class528_sub42.readUnsignedShort(-1723707213) * -1732755857;
	    if (-422780785 * ((Class299) this).anInt3304 == 65535)
		((Class299) this).anInt3304 = 1732755857;
	    int i_29_ = -1;
	    if (i == 118) {
		i_29_ = class528_sub42.readUnsignedShort(-255628236);
		if (i_29_ == 65535)
		    i_29_ = -1;
	    }
	    int i_30_ = class528_sub42.readUnsignedByte((byte) 81);
	    anIntArray3302 = new int[2 + i_30_];
	    for (int i_31_ = 0; i_31_ <= i_30_; i_31_++) {
		anIntArray3302[i_31_] = class528_sub42.readUnsignedShort(-991875957);
		if (65535 == anIntArray3302[i_31_])
		    anIntArray3302[i_31_] = -1;
	    }
	    anIntArray3302[1 + i_30_] = i_29_;
	} else if (i == 107)
	    aBool3305 = false;
	else if (109 == i)
	    aBool3306 = false;
	else if (111 == i)
	    aBool3307 = false;
	else if (i == 113) {
	    aShort3308 = (short) class528_sub42.readUnsignedShort(-1706883265);
	    aShort3323 = (short) class528_sub42.readUnsignedShort(851068931);
	} else if (i == 114) {
	    aByte3310 = class528_sub42.method9627(-1561973747);
	    aByte3311 = class528_sub42.method9627(-1037600337);
	} else if (119 == i)
	    aByte3314 = class528_sub42.method9627(-1808542476);
	else if (i == 121) {
	    ((Class299) this).anIntArrayArray3273
		= new int[anIntArray3271.length][];
	    int i_32_ = class528_sub42.readUnsignedByte((byte) 121);
	    for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
		int i_34_ = class528_sub42.readUnsignedByte((byte) 84);
		int[] is = (((Class299) this).anIntArrayArray3273[i_34_]
			    = new int[3]);
		is[0] = class528_sub42.method9627(-1284785156);
		is[1] = class528_sub42.method9627(-1007356404);
		is[2] = class528_sub42.method9627(-1058110295);
	    }
	} else if (123 == i)
	    anInt3325 = class528_sub42.readUnsignedShort(-210418948) * -289833045;
	else if (125 == i)
	    aClass657_3326
		= ((Class657)
		   Class443.method5321(Class575.method6890((byte) 105),
				       class528_sub42.method9627(-1593106140),
				       876154744));
	else if (127 == i)
	    anInt3274 = class528_sub42.readUnsignedShort(-1274502211) * -1989428357;
	else if (i == 128)
	    Class443.method5321(Class666.method7904(69866486),
				class528_sub42.readUnsignedByte((byte) 123),
				1421466869);
	else if (i == 134) {
	    anInt3318 = class528_sub42.readUnsignedShort(694215138) * 999895929;
	    if (65535 == 1163904713 * anInt3318)
		anInt3318 = -999895929;
	    anInt3297 = class528_sub42.readUnsignedShort(-2119431929) * -973270195;
	    if (65535 == -58040955 * anInt3297)
		anInt3297 = 973270195;
	    anInt3319 = class528_sub42.readUnsignedShort(-1685577417) * 1429291867;
	    if (65535 == anInt3319 * -187353901)
		anInt3319 = -1429291867;
	    anInt3335 = class528_sub42.readUnsignedShort(922047856) * 1539715857;
	    if (65535 == anInt3335 * -1701765647)
		anInt3335 = -1539715857;
	    anInt3293 = class528_sub42.readUnsignedByte((byte) 6) * -1498098201;
	} else if (135 == i || 136 == i) {
	    class528_sub42.readUnsignedByte((byte) 28);
	    class528_sub42.readUnsignedShort(-930117548);
	} else if (137 == i)
	    anInt3270 = class528_sub42.readUnsignedShort(-932026280) * -2087803753;
	else if (138 == i)
	    anInt3263 = class528_sub42.method9645((short) 1826) * -1883117641;
	else if (i == 140)
	    anInt3300 = class528_sub42.readUnsignedByte((byte) 14) * 331261033;
	else if (i == 141)
	    aBool3279 = true;
	else if (i == 142)
	    anInt3327 = class528_sub42.readUnsignedShort(-961747703) * 1135522531;
	else if (143 == i)
	    aBool3294 = true;
	else if (i >= 150 && i < 155) {
	    aStringArray3286[i - 150] = class528_sub42.readString(386638167);
	    if (!((Class285) ((Class299) this).aClass285_3288).aBool3126)
		aStringArray3286[i - 150] = null;
	} else if (i == 155) {
	    ((Class299) this).aByte3333
		= class528_sub42.method9627(-1102846447);
	    ((Class299) this).aByte3283
		= class528_sub42.method9627(-1513856138);
	    ((Class299) this).aByte3337
		= class528_sub42.method9627(-2053019180);
	    ((Class299) this).aByte3317
		= class528_sub42.method9627(-1965971614);
	} else if (158 == i)
	    aByte3329 = (byte) 1;
	else if (i == 159)
	    aByte3329 = (byte) 0;
	else if (i == 160) {
	    int i_35_ = class528_sub42.readUnsignedByte((byte) 68);
	    anIntArray3282 = new int[i_35_];
	    for (int i_36_ = 0; i_36_ < i_35_; i_36_++)
		anIntArray3282[i_36_] = class528_sub42.readUnsignedShort(-638833378);
	} else if (162 != i) {
	    if (163 == i)
		anInt3330 = class528_sub42.readUnsignedByte((byte) 15) * -1560592077;
	    else if (i == 164) {
		anInt3309 = class528_sub42.readUnsignedShort(-456395255) * 1970462473;
		anInt3332 = class528_sub42.readUnsignedShort(944863823) * -728885749;
	    } else if (165 == i)
		anInt3334 = class528_sub42.readUnsignedByte((byte) 23) * 1838865299;
	    else if (168 == i)
		anInt3322 = class528_sub42.readUnsignedByte((byte) 36) * -1782697777;
	    else if (169 == i)
		aBool3281 = false;
	    else if (i >= 170 && i < 176) {
		if (null == ((Class299) this).anIntArray3287) {
		    ((Class299) this).anIntArray3287 = new int[6];
		    Arrays.fill(((Class299) this).anIntArray3287, -1);
		}
		int i_37_ = class528_sub42.readUnsignedShort(-1023206907);
		if (i_37_ == 65535)
		    i_37_ = -1;
		((Class299) this).anIntArray3287[i - 170] = i_37_;
	    } else if (178 != i) {
		if (i == 179) {
		    aClass431_3331 = new Class431();
		    aClass431_3331.aFloat4824
			= (float) class528_sub42.method9640(-1165449684);
		    aClass431_3331.aFloat4826
			= (float) class528_sub42.method9640(-1987130715);
		    aClass431_3331.aFloat4822
			= (float) class528_sub42.method9640(-2076505480);
		    aClass431_3331.aFloat4823
			= (float) class528_sub42.method9640(-1059108758);
		    aClass431_3331.aFloat4827
			= (float) class528_sub42.method9640(-1362929312);
		    aClass431_3331.aFloat4825
			= (float) class528_sub42.method9640(-1394530062);
		} else if (180 == i)
		    anInt3336 = ((class528_sub42.readUnsignedByte((byte) 6) & 0xff)
				 * 46585031);
		else if (181 == i) {
		    aShort3312 = (short) class528_sub42.readUnsignedShort(-524357933);
		    aByte3313 = (byte) class528_sub42.readUnsignedByte((byte) 41);
		} else if (182 == i)
		    aBool3295 = true;
		else if (249 == i) {
		    int i_38_ = class528_sub42.readUnsignedByte((byte) 38);
		    if (null == ((Class299) this).aClass692_3278) {
			int i_39_ = Class327.method4259(i_38_, -2134279851);
			((Class299) this).aClass692_3278 = new Class692(i_39_);
		    }
		    for (int i_40_ = 0; i_40_ < i_38_; i_40_++) {
			boolean bool
			    = class528_sub42.readUnsignedByte((byte) 92) == 1;
			int i_41_ = class528_sub42.readTriByte(-1948250089);
			Node node;
			if (bool)
			    node = (new Class528_Sub31
					(class528_sub42.readString(70854183)));
			else
			    node
				= (new Class528_Sub17
				   (class528_sub42.readInt(973790104)));
			((Class299) this).aClass692_3278
			    .method8142(node, (long) i_41_);
		    }
		}
	    }
	}
    }
    
    public void method61(int i) {
	if (anIntArray3271 == null)
	    anIntArray3271 = new int[0];
	if (aByte3329 == -1) {
	    if (null == ((Class299) this).aClass285_3288
		|| (Class673.aClass673_8529
		    == (((Class285) ((Class299) this).aClass285_3288)
			.aClass673_3127)))
		aByte3329 = (byte) 1;
	    else
		aByte3329 = (byte) 0;
	}
    }
    
    public final Class299 method3996(IMultiVarDefinitionsLoader iMultiVarDefinitionsLoader,
				     IMultiVarValueReader iMultiVarValueReader, int i) {
	int i_42_ = -1;
	if (((Class299) this).anInt3303 * 78776153 != -1) {
	    VarDefinition varDefinition
		= iMultiVarDefinitionsLoader.method79(((Class299) this).anInt3303 * 78776153,
				       (byte) 10);
	    if (varDefinition != null)
		i_42_ = iMultiVarValueReader.method97(varDefinition, -1860881523);
	} else if (-422780785 * ((Class299) this).anInt3304 != -1) {
	    Class142 class142
		= iMultiVarDefinitionsLoader.method82(VarDomainType.PLAYER_CONFIGS,
				       (-422780785
					* ((Class299) this).anInt3304),
				       -1818506179);
	    if (null != class142)
		i_42_ = iMultiVarValueReader.method114(class142, (byte) -48);
	}
	if (i_42_ < 0 || i_42_ >= anIntArray3302.length - 1) {
	    int i_43_ = anIntArray3302[anIntArray3302.length - 1];
	    if (-1 != i_43_)
		return (Class299) ((Class299) this).anInterface12_3267
				      .method63(i_43_, 1541405911);
	    return null;
	}
	if (anIntArray3302[i_42_] == -1)
	    return null;
	return (Class299) ((Class299) this).anInterface12_3267
			      .method63(anIntArray3302[i_42_], -151745946);
    }
    
    public final Class157 method3997
	(Class173 class173, int i, Class5_Sub14 class5_sub14,
	 IMultiVarDefinitionsLoader iMultiVarDefinitionsLoader, IMultiVarValueReader iMultiVarValueReader, Class690 class690,
	 Class690 class690_44_, Class690[] class690s, int[] is, int i_45_,
	 Class287 class287, int i_46_, boolean bool, int i_47_) {
	if (null != anIntArray3302) {
	    Class299 class299_48_
		= method3996(iMultiVarDefinitionsLoader, iMultiVarValueReader, -838799530);
	    if (class299_48_ == null)
		return null;
	    return class299_48_.method3997(class173, i, class5_sub14,
					   iMultiVarDefinitionsLoader, iMultiVarValueReader, class690,
					   class690_44_, class690s, is, i_45_,
					   class287, i_46_, bool, 1600226731);
	}
	int i_49_ = i;
	if (2048766621 * ((Class299) this).anInt3292 != 128)
	    i_49_ |= 0x2;
	if (((Class299) this).anInt3291 * 243914881 != 128)
	    i_49_ |= 0x5;
	boolean bool_50_ = false;
	int i_51_ = null != class690s ? class690s.length : 0;
	for (int i_52_ = 0; i_52_ < i_51_; i_52_++) {
	    if (class690s[i_52_] != null) {
		i_49_ |= class690s[i_52_].method8078(1243119330);
		bool_50_ = true;
	    }
	}
	if (class690 != null) {
	    i_49_ |= class690.method8078(1829087560);
	    bool_50_ = true;
	}
	if (null != class690_44_) {
	    i_49_ |= class690_44_.method8078(1871793097);
	    bool_50_ = true;
	}
	long l = (long) (anInt3268 * 284752095
			 | class173.anInt1985 * 1967042207 << 16);
	if (null != class287)
	    l |= -520498264642171083L * class287.aLong3154 << 24;
	Class157 class157;
	synchronized (((Class285) ((Class299) this).aClass285_3288)
		      .aClass186_3124) {
	    class157 = (Class157) ((Class285) ((Class299) this).aClass285_3288)
				      .aClass186_3124.method2727(l);
	}
	RenderType renderType = null;
	if (!bool && i_46_ != -1)
	    renderType = (RenderType) class5_sub14.method63(i_46_, -175741954);
	else if (941026227 * anInt3274 != -1)
	    renderType = (RenderType) class5_sub14.method63(941026227 * anInt3274,
							-466147492);
	if (null == class157 || (class157.method1874() & i_49_) != i_49_) {
	    if (null != class157)
		i_49_ |= class157.method1874();
	    int i_53_ = i_49_;
	    if (((Class299) this).aShortArray3275 != null)
		i_53_ |= 0x4000;
	    if (((Class299) this).aShortArray3328 != null)
		i_53_ |= 0x8000;
	    if (((Class299) this).aByte3317 != 0)
		i_53_ |= 0x80000;
	    int[] is_54_ = (null != class287 && null != class287.anIntArray3159
			    ? class287.anIntArray3159 : anIntArray3271);
	    boolean bool_55_ = false;
	    synchronized (((Class285) ((Class299) this).aClass285_3288)
			  .aClass446_3121) {
		for (int i_56_ = 0; i_56_ < is_54_.length; i_56_++) {
		    if (is_54_[i_56_] != -1
			&& !((Class285) ((Class299) this).aClass285_3288)
				.aClass446_3121
				.method5350(is_54_[i_56_], 0, 909319436))
			bool_55_ = true;
		}
	    }
	    if (bool_55_)
		return null;
	    Class177[] class177s = new Class177[is_54_.length];
	    for (int i_57_ = 0; i_57_ < is_54_.length; i_57_++) {
		if (-1 != is_54_[i_57_]) {
		    synchronized (((Class285) ((Class299) this).aClass285_3288)
				  .aClass446_3121) {
			class177s[i_57_]
			    = Class177.method2590((((Class285)
						    (((Class299) this)
						     .aClass285_3288))
						   .aClass446_3121),
						  is_54_[i_57_], 0);
		    }
		    if (class177s[i_57_] != null) {
			if (class177s[i_57_].anInt2035 < 13)
			    class177s[i_57_].method2585(2);
			if (((Class299) this).anIntArrayArray3273 != null
			    && (((Class299) this).anIntArrayArray3273[i_57_]
				!= null))
			    class177s[i_57_].method2572((((Class299) this)
							 .anIntArrayArray3273
							 [i_57_][0]),
							(((Class299) this)
							 .anIntArrayArray3273
							 [i_57_][1]),
							(((Class299) this)
							 .anIntArrayArray3273
							 [i_57_][2]));
		    }
		}
	    }
	    if (class287 != null) {
		for (int i_58_ = 0; i_58_ < class177s.length; i_58_++) {
		    if (class177s[i_58_] != null) {
			if (((Class287) class287).aFloatArray3155 != null
			    && (((Class287) class287).aFloatArray3155[i_58_]
				!= 0.0F))
			    class177s[i_58_].method2586(((Class287) class287)
							.aFloatArray3155
							[i_58_]);
			if (((Class287) class287).anIntArrayArray3157 != null)
			    class177s[i_58_].method2578((((Class287) class287)
							 .anIntArrayArray3157
							 [i_58_][0]),
							(((Class287) class287)
							 .anIntArrayArray3157
							 [i_58_][1]),
							(((Class287) class287)
							 .anIntArrayArray3157
							 [i_58_][2]));
			if (((Class287) class287).anIntArrayArray3158 != null)
			    class177s[i_58_].method2572((((Class287) class287)
							 .anIntArrayArray3158
							 [i_58_][0]),
							(((Class287) class287)
							 .anIntArrayArray3158
							 [i_58_][1]),
							(((Class287) class287)
							 .anIntArrayArray3158
							 [i_58_][2]));
		    }
		}
	    }
	    if (null != renderType && null != renderType.anIntArrayArray7678) {
		for (int i_59_ = 0;
		     i_59_ < renderType.anIntArrayArray7678.length; i_59_++) {
		    if (i_59_ < class177s.length && null != class177s[i_59_]) {
			int i_60_ = 0;
			int i_61_ = 0;
			int i_62_ = 0;
			int i_63_ = 0;
			int i_64_ = 0;
			int i_65_ = 0;
			if (renderType.anIntArrayArray7678[i_59_] != null) {
			    i_60_ = renderType.anIntArrayArray7678[i_59_][0];
			    i_61_ = renderType.anIntArrayArray7678[i_59_][1];
			    i_62_ = renderType.anIntArrayArray7678[i_59_][2];
			    i_63_
				= renderType.anIntArrayArray7678[i_59_][3] << 3;
			    i_64_
				= renderType.anIntArrayArray7678[i_59_][4] << 3;
			    i_65_
				= renderType.anIntArrayArray7678[i_59_][5] << 3;
			}
			if (i_63_ != 0 || 0 != i_64_ || i_65_ != 0)
			    class177s[i_59_].method2578(i_63_, i_64_, i_65_);
			if (i_60_ != 0 || 0 != i_61_ || i_62_ != 0)
			    class177s[i_59_].method2572(i_60_, i_61_, i_62_);
		    }
		}
	    }
	    Class177 class177;
	    if (1 == class177s.length)
		class177 = class177s[0];
	    else
		class177 = new Class177(class177s, class177s.length);
	    class157
		= (class173.method2244
		   (class177, i_53_,
		    1496058747 * (((Class285) ((Class299) this).aClass285_3288)
				  .anInt3123),
		    64 + ((Class299) this).anInt3296 * 1317421281,
		    ((Class299) this).anInt3315 * -1142824693 + 850));
	    if (((Class299) this).aShortArray3275 != null) {
		short[] is_66_;
		if (null != class287 && null != class287.aShortArray3156)
		    is_66_ = class287.aShortArray3156;
		else
		    is_66_ = aShortArray3284;
		for (int i_67_ = 0;
		     i_67_ < ((Class299) this).aShortArray3275.length;
		     i_67_++) {
		    if (null != ((Class299) this).aByteArray3277
			&& i_67_ < ((Class299) this).aByteArray3277.length)
			class157.method1914((((Class299) this).aShortArray3275
					     [i_67_]),
					    aShortArray3324[(((Class299) this)
							     .aByteArray3277
							     [i_67_]) & 0xff]);
		    else
			class157.method1914((((Class299) this).aShortArray3275
					     [i_67_]),
					    is_66_[i_67_]);
		}
	    }
	    if (((Class299) this).aShortArray3328 != null) {
		short[] is_68_;
		if (class287 != null && class287.aShortArray3160 != null)
		    is_68_ = class287.aShortArray3160;
		else
		    is_68_ = aShortArray3320;
		for (int i_69_ = 0;
		     i_69_ < ((Class299) this).aShortArray3328.length; i_69_++)
		    class157.method1916((((Class299) this).aShortArray3328
					 [i_69_]),
					is_68_[i_69_]);
	    }
	    if (0 != ((Class299) this).aByte3317)
		class157.method1917(((Class299) this).aByte3333,
				    ((Class299) this).aByte3283,
				    ((Class299) this).aByte3337,
				    ((Class299) this).aByte3317 & 0xff);
	    class157.method1909();
	    class157.method1873(i_49_);
	    synchronized (((Class285) ((Class299) this).aClass285_3288)
			  .aClass186_3124) {
		((Class285) ((Class299) this).aClass285_3288)
		    .aClass186_3124.method2729(class157, l);
	    }
	}
	Class157 class157_70_ = class157.method1951((byte) 4, i_49_, true);
	boolean bool_71_ = false;
	if (null != is) {
	    for (int i_72_ = 0; i_72_ < 12; i_72_++) {
		if (-1 != is[i_72_])
		    bool_71_ = true;
	    }
	}
	if (!bool_50_ && !bool_71_)
	    return class157_70_;
	Class433[] class433s = null;
	if (renderType != null)
	    class433s = renderType.method6982(773423611);
	if (bool_71_ && null != class433s) {
	    for (int i_73_ = 0; i_73_ < 12; i_73_++) {
		if (null != class433s[i_73_])
		    class157_70_.method2005(class433s[i_73_], 1 << i_73_,
					    true);
	    }
	}
	int i_74_ = 0;
	int i_75_ = 1;
	while (i_74_ < i_51_) {
	    if (class690s[i_74_] != null)
		class690s[i_74_].method8093(class157_70_, 0, i_75_,
					    -654143323);
	    i_74_++;
	    i_75_ <<= 1;
	}
	if (bool_71_) {
	    for (i_74_ = 0; i_74_ < 12; i_74_++) {
		if (is[i_74_] != -1) {
		    i_75_ = is[i_74_] - i_45_;
		    i_75_ &= 0x3fff;
		    Class433 class433 = new Class433();
		    class433.method5224(0.0F, 1.0F, 0.0F,
					Class417.method4970(i_75_));
		    class157_70_.method2005(class433, 1 << i_74_, false);
		}
	    }
	}
	if (bool_71_ && null != class433s) {
	    for (i_74_ = 0; i_74_ < 12; i_74_++) {
		if (class433s[i_74_] != null)
		    class157_70_.method2005(class433s[i_74_], 1 << i_74_,
					    false);
	    }
	}
	if (null != class690 && null != class690_44_)
	    Class283.method3834(class157_70_, class690, class690_44_,
				1456405518);
	else if (null != class690)
	    class690.method8079(class157_70_, 0, -1601842103);
	else if (null != class690_44_)
	    class690_44_.method8079(class157_70_, 0, -775035924);
	if (243914881 * ((Class299) this).anInt3291 != 128
	    || 128 != 2048766621 * ((Class299) this).anInt3292)
	    class157_70_.method2011(243914881 * ((Class299) this).anInt3291,
				    ((Class299) this).anInt3292 * 2048766621,
				    ((Class299) this).anInt3291 * 243914881);
	class157_70_.method1873(i);
	return class157_70_;
    }
    
    public final boolean method3998(int i) {
	if (null == anIntArray3271)
	    return true;
	boolean bool = true;
	int[] is = anIntArray3271;
	for (int i_76_ = 0; i_76_ < is.length; i_76_++) {
	    int i_77_ = is[i_76_];
	    if (!((Class285) ((Class299) this).aClass285_3288)
		     .aClass446_3121.method5350(i_77_, 0, -1928201900))
		bool = false;
	}
	return bool;
    }
    
    public int method3999(int i, int i_78_, int i_79_) {
	if (((Class299) this).aClass692_3278 == null)
	    return i_78_;
	Class528_Sub17 class528_sub17
	    = ((Class528_Sub17)
	       ((Class299) this).aClass692_3278.method8137((long) i));
	if (null == class528_sub17)
	    return i_78_;
	return class528_sub17.anInt10388 * 870949851;
    }
    
    public String method4000(int i, String string, int i_80_) {
	if (null == ((Class299) this).aClass692_3278)
	    return string;
	Class528_Sub31 class528_sub31
	    = ((Class528_Sub31)
	       ((Class299) this).aClass692_3278.method8137((long) i));
	if (class528_sub31 == null)
	    return string;
	return (String) class528_sub31.anObject10468;
    }
    
    public boolean method4001(IMultiVarDefinitionsLoader iMultiVarDefinitionsLoader, IMultiVarValueReader iMultiVarValueReader,
			      int i) {
	if (anIntArray3302 == null)
	    return true;
	int i_81_ = -1;
	if (((Class299) this).anInt3303 * 78776153 != -1) {
	    VarDefinition varDefinition
		= iMultiVarDefinitionsLoader.method79(((Class299) this).anInt3303 * 78776153,
				       (byte) 10);
	    if (null != varDefinition)
		i_81_ = iMultiVarValueReader.method97(varDefinition, -1860881523);
	} else if (-1 != ((Class299) this).anInt3304 * -422780785) {
	    Class142 class142
		= iMultiVarDefinitionsLoader.method82(VarDomainType.PLAYER_CONFIGS,
				       (((Class299) this).anInt3304
					* -422780785),
				       -1194928574);
	    if (class142 != null)
		i_81_ = iMultiVarValueReader.method114(class142, (byte) 13);
	}
	if (i_81_ < 0 || i_81_ >= anIntArray3302.length - 1) {
	    int i_82_ = anIntArray3302[anIntArray3302.length - 1];
	    if (i_82_ != -1)
		return true;
	    return false;
	}
	if (-1 == anIntArray3302[i_81_])
	    return false;
	return true;
    }
    
    public boolean method4002(byte i) {
	if (null == anIntArray3302)
	    return (-1 != anInt3318 * 1163904713
		    || -1 != anInt3319 * -187353901
		    || -1701765647 * anInt3335 != -1);
	for (int i_83_ = 0; i_83_ < anIntArray3302.length; i_83_++) {
	    if (anIntArray3302[i_83_] != -1) {
		Class299 class299_84_
		    = ((Class299)
		       ((Class299) this).anInterface12_3267
			   .method63(anIntArray3302[i_83_], 1073638790));
		if (1163904713 * class299_84_.anInt3318 != -1
		    || -187353901 * class299_84_.anInt3319 != -1
		    || -1 != class299_84_.anInt3335 * -1701765647)
		    return true;
	    }
	}
	return false;
    }
    
    public int method4003(int i, int i_85_) {
	if (null == ((Class299) this).anIntArray3287)
	    return -1;
	return ((Class299) this).anIntArray3287[i];
    }
    
    Class299(int i, Class285 class285, Interface12 interface12) {
	anInt3274 = 1989428357;
	((Class299) this).aByte3317 = (byte) 0;
	anInt3270 = 2087803753;
	aBool3289 = true;
	anInt3266 = -1381102247;
	((Class299) this).anInt3291 = -1221345152;
	((Class299) this).anInt3292 = 590469760;
	aBool3290 = false;
	aBool3294 = false;
	aBool3279 = false;
	((Class299) this).anInt3296 = 0;
	((Class299) this).anInt3315 = 0;
	anIntArray3298 = null;
	aShortArray3299 = null;
	anInt3263 = 1883117641;
	anInt3301 = 13772960;
	((Class299) this).anInt3303 = -1662505193;
	((Class299) this).anInt3304 = 1732755857;
	aBool3305 = true;
	aBool3306 = true;
	aBool3307 = true;
	aShort3308 = (short) 0;
	aShort3323 = (short) 0;
	aByte3310 = (byte) -96;
	aByte3311 = (byte) -16;
	aShort3312 = (short) -1;
	aByte3313 = (byte) 0;
	aByte3314 = (byte) 0;
	anInt3318 = -999895929;
	anInt3297 = 973270195;
	anInt3319 = -1429291867;
	anInt3335 = -1539715857;
	anInt3293 = 0;
	anInt3322 = 0;
	anInt3300 = -1427782505;
	anInt3325 = 289833045;
	aClass657_3326 = Class657.aClass657_8439;
	anInt3327 = -1135522531;
	aByte3329 = (byte) -1;
	anInt3330 = 1560592077;
	anInt3309 = 1927219456;
	anInt3332 = -1911158016;
	anInt3334 = 0;
	aBool3281 = true;
	anInt3336 = 0;
	aBool3295 = false;
	anInt3268 = 347652895 * i;
	((Class299) this).aClass285_3288 = class285;
	((Class299) this).anInterface12_3267 = interface12;
	aStringArray3286
	    = (String[]) ((Class285) ((Class299) this).aClass285_3288)
			     .aStringArray3122.clone();
    }
    
    public void method57(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 20);
	    if (0 == i)
		break;
	    method3995(class528_sub42, i, 2070942487);
	}
    }
    
    public void method60(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 21);
	    if (0 == i)
		break;
	    method3995(class528_sub42, i, 71436925);
	}
    }
    
    public final Class157 method4004
	(Class173 class173, int i, IMultiVarDefinitionsLoader iMultiVarDefinitionsLoader,
	 IMultiVarValueReader iMultiVarValueReader, Class690 class690, Class287 class287,
	 int i_86_) {
	if (anIntArray3302 != null) {
	    Class299 class299_87_
		= method3996(iMultiVarDefinitionsLoader, iMultiVarValueReader, -536982244);
	    if (class299_87_ == null)
		return null;
	    return class299_87_.method4004(class173, i, iMultiVarDefinitionsLoader,
					   iMultiVarValueReader, class690, class287,
					   189991512);
	}
	if (null == anIntArray3272
	    && (class287 == null || class287.anIntArray3159 == null))
	    return null;
	int i_88_ = i;
	if (class690 != null)
	    i_88_ |= class690.method8078(1393482305);
	long l = (long) (anInt3268 * 284752095
			 | class173.anInt1985 * 1967042207 << 16);
	if (class287 != null)
	    l |= class287.aLong3154 * -520498264642171083L << 24;
	Class157 class157;
	synchronized (((Class285) ((Class299) this).aClass285_3288)
		      .aClass186_3125) {
	    class157 = (Class157) ((Class285) ((Class299) this).aClass285_3288)
				      .aClass186_3125.method2727(l);
	}
	if (class157 == null || (class157.method1874() & i_88_) != i_88_) {
	    if (class157 != null)
		i_88_ |= class157.method1874();
	    int i_89_ = i_88_;
	    if (((Class299) this).aShortArray3275 != null)
		i_89_ |= 0x4000;
	    if (null != ((Class299) this).aShortArray3328)
		i_89_ |= 0x8000;
	    if (0 != ((Class299) this).aByte3317)
		i_89_ |= 0x80000;
	    int[] is = (class287 != null && null != class287.anIntArray3159
			? class287.anIntArray3159 : anIntArray3272);
	    boolean bool = false;
	    synchronized (((Class285) ((Class299) this).aClass285_3288)
			  .aClass446_3121) {
		for (int i_90_ = 0; i_90_ < is.length; i_90_++) {
		    if (!((Class285) ((Class299) this).aClass285_3288)
			     .aClass446_3121
			     .method5350(is[i_90_], 0, -422542175))
			bool = true;
		}
	    }
	    if (bool)
		return null;
	    Class177[] class177s = new Class177[is.length];
	    synchronized (((Class285) ((Class299) this).aClass285_3288)
			  .aClass446_3121) {
		for (int i_91_ = 0; i_91_ < is.length; i_91_++)
		    class177s[i_91_]
			= Class177.method2590((((Class285) (((Class299) this)
							    .aClass285_3288))
					       .aClass446_3121),
					      is[i_91_], 0);
	    }
	    for (int i_92_ = 0; i_92_ < is.length; i_92_++) {
		if (null != class177s[i_92_]
		    && class177s[i_92_].anInt2035 < 13)
		    class177s[i_92_].method2585(2);
	    }
	    Class177 class177;
	    if (1 == class177s.length)
		class177 = class177s[0];
	    else
		class177 = new Class177(class177s, class177s.length);
	    class157 = class173.method2244(class177, i_89_,
					   (((Class285)
					     ((Class299) this).aClass285_3288)
					    .anInt3123) * 1496058747,
					   64, 768);
	    if (((Class299) this).aShortArray3275 != null) {
		short[] is_93_;
		if (null != class287 && null != class287.aShortArray3156)
		    is_93_ = class287.aShortArray3156;
		else
		    is_93_ = aShortArray3284;
		for (int i_94_ = 0;
		     i_94_ < ((Class299) this).aShortArray3275.length;
		     i_94_++) {
		    if (((Class299) this).aByteArray3277 != null
			&& i_94_ < ((Class299) this).aByteArray3277.length)
			class157.method1914((((Class299) this).aShortArray3275
					     [i_94_]),
					    aShortArray3324[(((Class299) this)
							     .aByteArray3277
							     [i_94_]) & 0xff]);
		    else
			class157.method1914((((Class299) this).aShortArray3275
					     [i_94_]),
					    is_93_[i_94_]);
		}
	    }
	    if (((Class299) this).aShortArray3328 != null) {
		short[] is_95_;
		if (class287 != null && null != class287.aShortArray3160)
		    is_95_ = class287.aShortArray3160;
		else
		    is_95_ = aShortArray3320;
		for (int i_96_ = 0;
		     i_96_ < ((Class299) this).aShortArray3328.length; i_96_++)
		    class157.method1916((((Class299) this).aShortArray3328
					 [i_96_]),
					is_95_[i_96_]);
	    }
	    if (((Class299) this).aByte3317 != 0)
		class157.method1917(((Class299) this).aByte3333,
				    ((Class299) this).aByte3283,
				    ((Class299) this).aByte3337,
				    ((Class299) this).aByte3317 & 0xff);
	    class157.method1873(i_88_);
	    synchronized (((Class285) ((Class299) this).aClass285_3288)
			  .aClass186_3125) {
		((Class285) ((Class299) this).aClass285_3288)
		    .aClass186_3125.method2729(class157, l);
	    }
	}
	if (null != class690) {
	    class157 = class157.method1951((byte) 1, i_88_, true);
	    class690.method8079(class157, 0, 481653411);
	}
	class157.method1873(i);
	return class157;
    }
    
    public int method4005(int i, int i_97_) {
	if (((Class299) this).aClass692_3278 == null)
	    return i_97_;
	Class528_Sub17 class528_sub17
	    = ((Class528_Sub17)
	       ((Class299) this).aClass692_3278.method8137((long) i));
	if (null == class528_sub17)
	    return i_97_;
	return class528_sub17.anInt10388 * 870949851;
    }
    
    public final boolean method4006() {
	if (null == anIntArray3271)
	    return true;
	boolean bool = true;
	int[] is = anIntArray3271;
	for (int i = 0; i < is.length; i++) {
	    int i_98_ = is[i];
	    if (!((Class285) ((Class299) this).aClass285_3288)
		     .aClass446_3121.method5350(i_98_, 0, -949695465))
		bool = false;
	}
	return bool;
    }
    
    public final boolean method4007() {
	if (null == anIntArray3271)
	    return true;
	boolean bool = true;
	int[] is = anIntArray3271;
	for (int i = 0; i < is.length; i++) {
	    int i_99_ = is[i];
	    if (!((Class285) ((Class299) this).aClass285_3288)
		     .aClass446_3121.method5350(i_99_, 0, -1270894577))
		bool = false;
	}
	return bool;
    }
    
    public final boolean method4008() {
	if (null == anIntArray3271)
	    return true;
	boolean bool = true;
	int[] is = anIntArray3271;
	for (int i = 0; i < is.length; i++) {
	    int i_100_ = is[i];
	    if (!((Class285) ((Class299) this).aClass285_3288)
		     .aClass446_3121.method5350(i_100_, 0, 1284369322))
		bool = false;
	}
	return bool;
    }
    
    public final boolean method4009() {
	if (null == anIntArray3271)
	    return true;
	boolean bool = true;
	int[] is = anIntArray3271;
	for (int i = 0; i < is.length; i++) {
	    int i_101_ = is[i];
	    if (!((Class285) ((Class299) this).aClass285_3288)
		     .aClass446_3121.method5350(i_101_, 0, 279931446))
		bool = false;
	}
	return bool;
    }
    
    public int method4010(int i) {
	if (null == ((Class299) this).anIntArray3287)
	    return -1;
	return ((Class299) this).anIntArray3287[i];
    }
    
    public int method4011(int i, int i_102_) {
	if (((Class299) this).aClass692_3278 == null)
	    return i_102_;
	Class528_Sub17 class528_sub17
	    = ((Class528_Sub17)
	       ((Class299) this).aClass692_3278.method8137((long) i));
	if (null == class528_sub17)
	    return i_102_;
	return class528_sub17.anInt10388 * 870949851;
    }
    
    public boolean method4012() {
	if (null == anIntArray3302)
	    return (-1 != anInt3318 * 1163904713
		    || -1 != anInt3319 * -187353901
		    || -1701765647 * anInt3335 != -1);
	for (int i = 0; i < anIntArray3302.length; i++) {
	    if (anIntArray3302[i] != -1) {
		Class299 class299_103_
		    = (Class299) ((Class299) this).anInterface12_3267
				     .method63(anIntArray3302[i], -1855356887);
		if (1163904713 * class299_103_.anInt3318 != -1
		    || -187353901 * class299_103_.anInt3319 != -1
		    || -1 != class299_103_.anInt3335 * -1701765647)
		    return true;
	    }
	}
	return false;
    }
    
    public void method59() {
	if (anIntArray3271 == null)
	    anIntArray3271 = new int[0];
	if (aByte3329 == -1) {
	    if (null == ((Class299) this).aClass285_3288
		|| (Class673.aClass673_8529
		    == (((Class285) ((Class299) this).aClass285_3288)
			.aClass673_3127)))
		aByte3329 = (byte) 1;
	    else
		aByte3329 = (byte) 0;
	}
    }
    
    static final void method4013(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class602.method7179(class229, class226, class648, -461783201);
    }
    
    static final void method4014(Class648 class648, int i) {
	throw new RuntimeException("");
    }
    
    static final void method4015(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -577899301;
	int i_104_ = (((Class648) class648).anIntArray8394
		      [((Class648) class648).anInt8395 * 717927929]);
	int i_105_ = (((Class648) class648).anIntArray8394
		      [1 + 717927929 * ((Class648) class648).anInt8395]);
	int i_106_ = (((Class648) class648).anIntArray8394
		      [2 + 717927929 * ((Class648) class648).anInt8395]);
	long l
	    = Class635.method7564(0, 0, 12, i_104_, i_105_, i_106_, (byte) 0);
	int i_107_ = Class662.method7880(l);
	if (i_106_ < 1970)
	    i_107_--;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = i_107_;
    }
    
    static final void method4016(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class29.method752(class229, class226, class648, 332002414);
    }
}
