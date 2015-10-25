/* Class234 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class234
{
    int[] anIntArray2578;
    int anInt2579;
    boolean[] aBoolArray2580;
    int[] anIntArray2581;
    int[][] anIntArrayArray2582;
    int[] anIntArray2583;
    int[][] anIntArrayArray2584;
    int[][] anIntArrayArray2585;
    static int[] anIntArray2586 = { 256, 128, 86, 64 };
    boolean[][] aBoolArrayArray2587;
    Class241 aClass241_2588;
    int[] anIntArray2589;
    int[] anIntArray2590;
    static float[] aFloatArray2591
	= { 1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F,
	    1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F,
	    1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F,
	    2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F,
	    2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F,
	    3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F,
	    4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F,
	    6.208247E-7F, 6.611694E-7F, 7.041359E-7F, 7.4989464E-7F,
	    7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F,
	    1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F,
	    1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F,
	    1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F,
	    2.1869757E-6F, 2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F,
	    2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F,
	    3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F,
	    4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F,
	    5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F,
	    7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F,
	    1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F, 1.2748789E-5F,
	    1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F,
	    1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F,
	    2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F,
	    2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F,
	    3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F,
	    4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F,
	    6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F,
	    7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F,
	    1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F,
	    1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F,
	    1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F,
	    2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F,
	    2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F,
	    3.5866388E-4F, 3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F,
	    4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F,
	    5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 7.16917E-4F,
	    7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F,
	    9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F,
	    0.0012634633F, 0.0013455702F, 0.0014330129F, 0.0015261382F,
	    0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F,
	    0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F,
	    0.0026895993F, 0.0028643848F, 0.0030505287F, 0.003248769F,
	    0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F,
	    0.004450795F, 0.004740033F, 0.005048067F, 0.0053761187F,
	    0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F,
	    0.0073652514F, 0.007843887F, 0.008353627F, 0.008896492F,
	    0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F,
	    0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F,
	    0.015678791F, 0.016697686F, 0.017782796F, 0.018938422F,
	    0.020169148F, 0.021479854F, 0.022875736F, 0.02436233F,
	    0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F,
	    0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F,
	    0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F,
	    0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F,
	    0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F,
	    0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F,
	    0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F,
	    0.22067343F, 0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F,
	    0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F,
	    0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F,
	    0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F,
	    0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F };
    
    void method3260(int i, int i_0_, int i_1_) {
	if (i < i_0_) {
	    int i_2_ = i;
	    int i_3_ = ((Class234) this).anIntArrayArray2585[i_1_][i_2_];
	    int i_4_ = ((Class234) this).anIntArrayArray2582[i_1_][i_2_];
	    boolean bool = ((Class234) this).aBoolArrayArray2587[i_1_][i_2_];
	    for (int i_5_ = i + 1; i_5_ <= i_0_; i_5_++) {
		int i_6_ = ((Class234) this).anIntArrayArray2585[i_1_][i_5_];
		if (i_6_ < i_3_) {
		    ((Class234) this).anIntArrayArray2585[i_1_][i_2_] = i_6_;
		    ((Class234) this).anIntArrayArray2582[i_1_][i_2_]
			= ((Class234) this).anIntArrayArray2582[i_1_][i_5_];
		    ((Class234) this).aBoolArrayArray2587[i_1_][i_2_]
			= ((Class234) this).aBoolArrayArray2587[i_1_][i_5_];
		    i_2_++;
		    ((Class234) this).anIntArrayArray2585[i_1_][i_5_]
			= ((Class234) this).anIntArrayArray2585[i_1_][i_2_];
		    ((Class234) this).anIntArrayArray2582[i_1_][i_5_]
			= ((Class234) this).anIntArrayArray2582[i_1_][i_2_];
		    ((Class234) this).aBoolArrayArray2587[i_1_][i_5_]
			= ((Class234) this).aBoolArrayArray2587[i_1_][i_2_];
		}
	    }
	    ((Class234) this).anIntArrayArray2585[i_1_][i_2_] = i_3_;
	    ((Class234) this).anIntArrayArray2582[i_1_][i_2_] = i_4_;
	    ((Class234) this).aBoolArrayArray2587[i_1_][i_2_] = bool;
	    method3266(i, i_2_ - 1, i_1_);
	    method3266(i_2_ + 1, i_0_, i_1_);
	}
    }
    
    void method3261(Class241 class241, int i) {
	((Class234) this).aClass241_2588 = class241;
	int i_7_ = ((Class234) this).aClass241_2588.method3336(16);
	if (i_7_ != 1)
	    throw new RuntimeException();
	if (((Class234) this).aBoolArray2580 == null
	    || ((Class234) this).aBoolArray2580.length != i)
	    ((Class234) this).aBoolArray2580 = new boolean[i];
	else {
	    for (int i_8_ = 0; i_8_ < ((Class234) this).aBoolArray2580.length;
		 i_8_++)
		((Class234) this).aBoolArray2580[i_8_] = false;
	}
	int i_9_ = ((Class234) this).aClass241_2588.method3336(5);
	int i_10_ = 0;
	if (((Class234) this).anIntArray2589 == null
	    || ((Class234) this).anIntArray2589.length != i_9_)
	    ((Class234) this).anIntArray2589 = new int[i_9_];
	else
	    method3274(((Class234) this).anIntArray2589);
	for (int i_11_ = 0; i_11_ < i_9_; i_11_++) {
	    int i_12_ = ((Class234) this).aClass241_2588.method3336(4);
	    ((Class234) this).anIntArray2589[i_11_] = i_12_;
	    if (i_12_ >= i_10_)
		i_10_ = i_12_ + 1;
	}
	if (((Class234) this).anIntArray2581 == null
	    || ((Class234) this).anIntArray2581.length != i_10_)
	    ((Class234) this).anIntArray2581 = new int[i_10_];
	else
	    method3274(((Class234) this).anIntArray2581);
	if (((Class234) this).anIntArray2578 == null
	    || ((Class234) this).anIntArray2578.length != i_10_)
	    ((Class234) this).anIntArray2578 = new int[i_10_];
	else
	    method3274(((Class234) this).anIntArray2578);
	if (((Class234) this).anIntArray2590 == null
	    || ((Class234) this).anIntArray2590.length != i_10_)
	    ((Class234) this).anIntArray2590 = new int[i_10_];
	else
	    method3274(((Class234) this).anIntArray2590);
	if (((Class234) this).anIntArrayArray2584 == null
	    || ((Class234) this).anIntArrayArray2584.length != i_10_)
	    ((Class234) this).anIntArrayArray2584 = new int[i_10_][];
	for (int i_13_ = 0; i_13_ < i_10_; i_13_++) {
	    ((Class234) this).anIntArray2581[i_13_]
		= ((Class234) this).aClass241_2588.method3336(3) + 1;
	    int i_14_ = (((Class234) this).anIntArray2578[i_13_]
			 = ((Class234) this).aClass241_2588.method3336(2));
	    if (i_14_ != 0)
		((Class234) this).anIntArray2590[i_13_]
		    = ((Class234) this).aClass241_2588.method3336(8);
	    i_14_ = 1 << i_14_;
	    int[] is = new int[i_14_];
	    ((Class234) this).anIntArrayArray2584[i_13_] = is;
	    for (int i_15_ = 0; i_15_ < i_14_; i_15_++)
		is[i_15_] = ((Class234) this).aClass241_2588.method3336(8) - 1;
	}
	((Class234) this).anInt2579
	    = ((Class234) this).aClass241_2588.method3336(2) + 1;
	int i_16_ = ((Class234) this).aClass241_2588.method3336(4);
	int i_17_ = 2;
	for (int i_18_ = 0; i_18_ < i_9_; i_18_++)
	    i_17_ += (((Class234) this).anIntArray2581
		      [((Class234) this).anIntArray2589[i_18_]]);
	if (((Class234) this).anIntArray2583 == null
	    || ((Class234) this).anIntArray2583.length != i_17_)
	    ((Class234) this).anIntArray2583 = new int[i_17_];
	else
	    method3274(((Class234) this).anIntArray2583);
	((Class234) this).anIntArray2583[0] = 0;
	((Class234) this).anIntArray2583[1] = 1 << i_16_;
	i_17_ = 2;
	for (int i_19_ = 0; i_19_ < i_9_; i_19_++) {
	    int i_20_ = ((Class234) this).anIntArray2589[i_19_];
	    for (int i_21_ = 0;
		 i_21_ < ((Class234) this).anIntArray2581[i_20_]; i_21_++)
		((Class234) this).anIntArray2583[i_17_++]
		    = ((Class234) this).aClass241_2588.method3336(i_16_);
	}
	if (((Class234) this).anIntArrayArray2585 == null
	    || ((Class234) this).anIntArrayArray2585.length < i_17_) {
	    ((Class234) this).anIntArrayArray2585 = new int[i][i_17_];
	    ((Class234) this).anIntArrayArray2582 = new int[i][i_17_];
	    ((Class234) this).aBoolArrayArray2587 = new boolean[i][i_17_];
	}
    }
    
    static int method3262(int[] is, int i) {
	int i_22_ = is[i];
	int i_23_ = -1;
	int i_24_ = 2147483647;
	for (int i_25_ = 0; i_25_ < i; i_25_++) {
	    int i_26_ = is[i_25_];
	    if (i_26_ > i_22_ && i_26_ < i_24_) {
		i_23_ = i_25_;
		i_24_ = i_26_;
	    }
	}
	return i_23_;
    }
    
    int method3263(int i, int i_27_, int i_28_, int i_29_, int i_30_) {
	int i_31_ = i_29_ - i_27_;
	int i_32_ = i_28_ - i;
	int i_33_ = i_31_ < 0 ? -i_31_ : i_31_;
	int i_34_ = i_33_ * (i_30_ - i);
	int i_35_ = i_34_ / i_32_;
	return i_31_ < 0 ? i_27_ - i_35_ : i_27_ + i_35_;
    }
    
    void method3264(int i, int i_36_, int i_37_) {
	if (i < i_36_) {
	    int i_38_ = i;
	    int i_39_ = ((Class234) this).anIntArrayArray2585[i_37_][i_38_];
	    int i_40_ = ((Class234) this).anIntArrayArray2582[i_37_][i_38_];
	    boolean bool = ((Class234) this).aBoolArrayArray2587[i_37_][i_38_];
	    for (int i_41_ = i + 1; i_41_ <= i_36_; i_41_++) {
		int i_42_
		    = ((Class234) this).anIntArrayArray2585[i_37_][i_41_];
		if (i_42_ < i_39_) {
		    ((Class234) this).anIntArrayArray2585[i_37_][i_38_]
			= i_42_;
		    ((Class234) this).anIntArrayArray2582[i_37_][i_38_]
			= ((Class234) this).anIntArrayArray2582[i_37_][i_41_];
		    ((Class234) this).aBoolArrayArray2587[i_37_][i_38_]
			= ((Class234) this).aBoolArrayArray2587[i_37_][i_41_];
		    i_38_++;
		    ((Class234) this).anIntArrayArray2585[i_37_][i_41_]
			= ((Class234) this).anIntArrayArray2585[i_37_][i_38_];
		    ((Class234) this).anIntArrayArray2582[i_37_][i_41_]
			= ((Class234) this).anIntArrayArray2582[i_37_][i_38_];
		    ((Class234) this).aBoolArrayArray2587[i_37_][i_41_]
			= ((Class234) this).aBoolArrayArray2587[i_37_][i_38_];
		}
	    }
	    ((Class234) this).anIntArrayArray2585[i_37_][i_38_] = i_39_;
	    ((Class234) this).anIntArrayArray2582[i_37_][i_38_] = i_40_;
	    ((Class234) this).aBoolArrayArray2587[i_37_][i_38_] = bool;
	    method3266(i, i_38_ - 1, i_37_);
	    method3266(i_38_ + 1, i_36_, i_37_);
	}
    }
    
    static int method3265(int[] is, int i) {
	int i_43_ = is[i];
	int i_44_ = -1;
	int i_45_ = -2147483648;
	for (int i_46_ = 0; i_46_ < i; i_46_++) {
	    int i_47_ = is[i_46_];
	    if (i_47_ < i_43_ && i_47_ > i_45_) {
		i_44_ = i_46_;
		i_45_ = i_47_;
	    }
	}
	return i_44_;
    }
    
    void method3266(int i, int i_48_, int i_49_) {
	if (i < i_48_) {
	    int i_50_ = i;
	    int i_51_ = ((Class234) this).anIntArrayArray2585[i_49_][i_50_];
	    int i_52_ = ((Class234) this).anIntArrayArray2582[i_49_][i_50_];
	    boolean bool = ((Class234) this).aBoolArrayArray2587[i_49_][i_50_];
	    for (int i_53_ = i + 1; i_53_ <= i_48_; i_53_++) {
		int i_54_
		    = ((Class234) this).anIntArrayArray2585[i_49_][i_53_];
		if (i_54_ < i_51_) {
		    ((Class234) this).anIntArrayArray2585[i_49_][i_50_]
			= i_54_;
		    ((Class234) this).anIntArrayArray2582[i_49_][i_50_]
			= ((Class234) this).anIntArrayArray2582[i_49_][i_53_];
		    ((Class234) this).aBoolArrayArray2587[i_49_][i_50_]
			= ((Class234) this).aBoolArrayArray2587[i_49_][i_53_];
		    i_50_++;
		    ((Class234) this).anIntArrayArray2585[i_49_][i_53_]
			= ((Class234) this).anIntArrayArray2585[i_49_][i_50_];
		    ((Class234) this).anIntArrayArray2582[i_49_][i_53_]
			= ((Class234) this).anIntArrayArray2582[i_49_][i_50_];
		    ((Class234) this).aBoolArrayArray2587[i_49_][i_53_]
			= ((Class234) this).aBoolArrayArray2587[i_49_][i_50_];
		}
	    }
	    ((Class234) this).anIntArrayArray2585[i_49_][i_50_] = i_51_;
	    ((Class234) this).anIntArrayArray2582[i_49_][i_50_] = i_52_;
	    ((Class234) this).aBoolArrayArray2587[i_49_][i_50_] = bool;
	    method3266(i, i_50_ - 1, i_49_);
	    method3266(i_50_ + 1, i_48_, i_49_);
	}
    }
    
    boolean method3267(int i) {
	boolean bool = ((Class234) this).aClass241_2588.method3335() != 0;
	((Class234) this).aBoolArray2580[i] = bool;
	if (!bool)
	    return false;
	int i_55_ = ((Class234) this).anIntArray2583.length;
	for (int i_56_ = 0; i_56_ < i_55_; i_56_++)
	    ((Class234) this).anIntArrayArray2585[i][i_56_]
		= ((Class234) this).anIntArray2583[i_56_];
	int i_57_ = anIntArray2586[((Class234) this).anInt2579 - 1];
	int i_58_ = Class296.method3974(i_57_ - 1, -130920816);
	((Class234) this).anIntArrayArray2582[i][0]
	    = ((Class234) this).aClass241_2588.method3336(i_58_);
	((Class234) this).anIntArrayArray2582[i][1]
	    = ((Class234) this).aClass241_2588.method3336(i_58_);
	int i_59_ = 2;
	for (int i_60_ = 0; i_60_ < ((Class234) this).anIntArray2589.length;
	     i_60_++) {
	    int i_61_ = ((Class234) this).anIntArray2589[i_60_];
	    int i_62_ = ((Class234) this).anIntArray2581[i_61_];
	    int i_63_ = ((Class234) this).anIntArray2578[i_61_];
	    int i_64_ = (1 << i_63_) - 1;
	    int i_65_ = 0;
	    if (i_63_ > 0)
		i_65_ = ((Class241) ((Class234) this).aClass241_2588)
			    .aClass245Array2668
			    [((Class234) this).anIntArray2590[i_61_]]
			    .method3398(((Class234) this).aClass241_2588);
	    for (int i_66_ = 0; i_66_ < i_62_; i_66_++) {
		int i_67_ = (((Class234) this).anIntArrayArray2584[i_61_]
			     [i_65_ & i_64_]);
		i_65_ >>>= i_63_;
		((Class234) this).anIntArrayArray2582[i][i_59_]
		    = (i_67_ >= 0
		       ? ((Class241) ((Class234) this).aClass241_2588)
			     .aClass245Array2668[i_67_]
			     .method3398(((Class234) this).aClass241_2588)
		       : 0);
		i_59_++;
	    }
	}
	return true;
    }
    
    void method3268(int i) {
	if (((Class234) this).aBoolArray2580[i]) {
	    int i_68_ = ((Class234) this).anIntArray2583.length;
	    int i_69_ = anIntArray2586[((Class234) this).anInt2579 - 1];
	    boolean[] bools = ((Class234) this).aBoolArrayArray2587[i];
	    ((Class234) this).aBoolArrayArray2587[i][1] = true;
	    bools[0] = true;
	    for (int i_70_ = 2; i_70_ < i_68_; i_70_++) {
		int i_71_
		    = method3265(((Class234) this).anIntArray2583, i_70_);
		int i_72_
		    = method3262(((Class234) this).anIntArray2583, i_70_);
		int i_73_
		    = method3263(((Class234) this).anIntArray2583[i_71_],
				 (((Class234) this).anIntArrayArray2582[i]
				  [i_71_]),
				 ((Class234) this).anIntArray2583[i_72_],
				 (((Class234) this).anIntArrayArray2582[i]
				  [i_72_]),
				 ((Class234) this).anIntArray2583[i_70_]);
		int i_74_ = ((Class234) this).anIntArrayArray2582[i][i_70_];
		int i_75_ = i_69_ - i_73_;
		int i_76_ = i_73_;
		int i_77_ = (i_75_ < i_76_ ? i_75_ : i_76_) << 1;
		if (i_74_ != 0) {
		    boolean[] bools_78_
			= ((Class234) this).aBoolArrayArray2587[i];
		    int i_79_ = i_71_;
		    ((Class234) this).aBoolArrayArray2587[i][i_72_] = true;
		    bools_78_[i_79_] = true;
		    ((Class234) this).aBoolArrayArray2587[i][i_70_] = true;
		    if (i_74_ >= i_77_)
			((Class234) this).anIntArrayArray2582[i][i_70_]
			    = (i_75_ > i_76_ ? i_74_ - i_76_ + i_73_
			       : i_73_ - i_74_ + i_75_ - 1);
		    else
			((Class234) this).anIntArrayArray2582[i][i_70_]
			    = ((i_74_ & 0x1) != 0 ? i_73_ - (i_74_ + 1 >> 1)
			       : i_73_ + (i_74_ >> 1));
		} else {
		    ((Class234) this).aBoolArrayArray2587[i][i_70_] = false;
		    ((Class234) this).anIntArrayArray2582[i][i_70_] = i_73_;
		}
	    }
	    for (int i_80_ = 0; i_80_ < i_68_; i_80_++) {
		if (!((Class234) this).aBoolArrayArray2587[i][i_80_])
		    ((Class234) this).anIntArrayArray2582[i][i_80_] = -1;
	    }
	}
    }
    
    void method3269(Class247 class247, int i, int i_81_) {
	if (((Class234) this).aBoolArray2580[i_81_]) {
	    int i_82_ = ((Class234) this).anIntArray2583.length;
	    method3266(0, i_82_ - 1, i_81_);
	    int i_83_ = 0;
	    int i_84_ = (((Class234) this).anIntArrayArray2582[i_81_][0]
			 * ((Class234) this).anInt2579);
	    for (int i_85_ = 1; i_85_ < i_82_; i_85_++) {
		if (((Class234) this).anIntArrayArray2582[i_81_][i_85_] >= 0) {
		    int i_86_
			= ((Class234) this).anIntArrayArray2585[i_81_][i_85_];
		    int i_87_
			= (((Class234) this).anIntArrayArray2582[i_81_][i_85_]
			   * ((Class234) this).anInt2579);
		    method3271(i_83_, i_84_, i_86_, i_87_, class247, i);
		    if (i_86_ < i) {
			/* empty */
		    }
		    i_83_ = i_86_;
		    i_84_ = i_87_;
		}
	    }
	    float f = aFloatArray2591[i_84_];
	    for (int i_88_ = i_83_; i_88_ < i; i_88_++)
		((Class247) class247).aFloatArray2769[i_88_] *= f;
	}
    }
    
    Class234() {
	/* empty */
    }
    
    void method3270(int i, int i_89_, int i_90_) {
	if (i < i_89_) {
	    int i_91_ = i;
	    int i_92_ = ((Class234) this).anIntArrayArray2585[i_90_][i_91_];
	    int i_93_ = ((Class234) this).anIntArrayArray2582[i_90_][i_91_];
	    boolean bool = ((Class234) this).aBoolArrayArray2587[i_90_][i_91_];
	    for (int i_94_ = i + 1; i_94_ <= i_89_; i_94_++) {
		int i_95_
		    = ((Class234) this).anIntArrayArray2585[i_90_][i_94_];
		if (i_95_ < i_92_) {
		    ((Class234) this).anIntArrayArray2585[i_90_][i_91_]
			= i_95_;
		    ((Class234) this).anIntArrayArray2582[i_90_][i_91_]
			= ((Class234) this).anIntArrayArray2582[i_90_][i_94_];
		    ((Class234) this).aBoolArrayArray2587[i_90_][i_91_]
			= ((Class234) this).aBoolArrayArray2587[i_90_][i_94_];
		    i_91_++;
		    ((Class234) this).anIntArrayArray2585[i_90_][i_94_]
			= ((Class234) this).anIntArrayArray2585[i_90_][i_91_];
		    ((Class234) this).anIntArrayArray2582[i_90_][i_94_]
			= ((Class234) this).anIntArrayArray2582[i_90_][i_91_];
		    ((Class234) this).aBoolArrayArray2587[i_90_][i_94_]
			= ((Class234) this).aBoolArrayArray2587[i_90_][i_91_];
		}
	    }
	    ((Class234) this).anIntArrayArray2585[i_90_][i_91_] = i_92_;
	    ((Class234) this).anIntArrayArray2582[i_90_][i_91_] = i_93_;
	    ((Class234) this).aBoolArrayArray2587[i_90_][i_91_] = bool;
	    method3266(i, i_91_ - 1, i_90_);
	    method3266(i_91_ + 1, i_89_, i_90_);
	}
    }
    
    void method3271(int i, int i_96_, int i_97_, int i_98_, Class247 class247,
		    int i_99_) {
	int i_100_ = i_98_ - i_96_;
	int i_101_ = i_97_ - i;
	int i_102_ = i_100_ < 0 ? -i_100_ : i_100_;
	int i_103_ = i_100_ / i_101_;
	int i_104_ = i_96_;
	int i_105_ = 0;
	int i_106_ = i_100_ < 0 ? i_103_ - 1 : i_103_ + 1;
	i_102_ = i_102_ - (i_103_ < 0 ? -i_103_ : i_103_) * i_101_;
	((Class247) class247).aFloatArray2769[i] *= aFloatArray2591[i_104_];
	if (i_97_ > i_99_)
	    i_97_ = i_99_;
	for (int i_107_ = i + 1; i_107_ < i_97_; i_107_++) {
	    i_105_ += i_102_;
	    if (i_105_ >= i_101_) {
		i_105_ -= i_101_;
		i_104_ += i_106_;
	    } else
		i_104_ += i_103_;
	    ((Class247) class247).aFloatArray2769[i_107_]
		*= aFloatArray2591[i_104_];
	}
    }
    
    void method3272(int i) {
	if (((Class234) this).aBoolArray2580[i]) {
	    int i_108_ = ((Class234) this).anIntArray2583.length;
	    int i_109_ = anIntArray2586[((Class234) this).anInt2579 - 1];
	    boolean[] bools = ((Class234) this).aBoolArrayArray2587[i];
	    ((Class234) this).aBoolArrayArray2587[i][1] = true;
	    bools[0] = true;
	    for (int i_110_ = 2; i_110_ < i_108_; i_110_++) {
		int i_111_
		    = method3265(((Class234) this).anIntArray2583, i_110_);
		int i_112_
		    = method3262(((Class234) this).anIntArray2583, i_110_);
		int i_113_
		    = method3263(((Class234) this).anIntArray2583[i_111_],
				 (((Class234) this).anIntArrayArray2582[i]
				  [i_111_]),
				 ((Class234) this).anIntArray2583[i_112_],
				 (((Class234) this).anIntArrayArray2582[i]
				  [i_112_]),
				 ((Class234) this).anIntArray2583[i_110_]);
		int i_114_ = ((Class234) this).anIntArrayArray2582[i][i_110_];
		int i_115_ = i_109_ - i_113_;
		int i_116_ = i_113_;
		int i_117_ = (i_115_ < i_116_ ? i_115_ : i_116_) << 1;
		if (i_114_ != 0) {
		    boolean[] bools_118_
			= ((Class234) this).aBoolArrayArray2587[i];
		    int i_119_ = i_111_;
		    ((Class234) this).aBoolArrayArray2587[i][i_112_] = true;
		    bools_118_[i_119_] = true;
		    ((Class234) this).aBoolArrayArray2587[i][i_110_] = true;
		    if (i_114_ >= i_117_)
			((Class234) this).anIntArrayArray2582[i][i_110_]
			    = (i_115_ > i_116_ ? i_114_ - i_116_ + i_113_
			       : i_113_ - i_114_ + i_115_ - 1);
		    else
			((Class234) this).anIntArrayArray2582[i][i_110_]
			    = ((i_114_ & 0x1) != 0 ? i_113_ - (i_114_ + 1 >> 1)
			       : i_113_ + (i_114_ >> 1));
		} else {
		    ((Class234) this).aBoolArrayArray2587[i][i_110_] = false;
		    ((Class234) this).anIntArrayArray2582[i][i_110_] = i_113_;
		}
	    }
	    for (int i_120_ = 0; i_120_ < i_108_; i_120_++) {
		if (!((Class234) this).aBoolArrayArray2587[i][i_120_])
		    ((Class234) this).anIntArrayArray2582[i][i_120_] = -1;
	    }
	}
    }
    
    void method3273(int i) {
	if (((Class234) this).aBoolArray2580[i]) {
	    int i_121_ = ((Class234) this).anIntArray2583.length;
	    int i_122_ = anIntArray2586[((Class234) this).anInt2579 - 1];
	    boolean[] bools = ((Class234) this).aBoolArrayArray2587[i];
	    ((Class234) this).aBoolArrayArray2587[i][1] = true;
	    bools[0] = true;
	    for (int i_123_ = 2; i_123_ < i_121_; i_123_++) {
		int i_124_
		    = method3265(((Class234) this).anIntArray2583, i_123_);
		int i_125_
		    = method3262(((Class234) this).anIntArray2583, i_123_);
		int i_126_
		    = method3263(((Class234) this).anIntArray2583[i_124_],
				 (((Class234) this).anIntArrayArray2582[i]
				  [i_124_]),
				 ((Class234) this).anIntArray2583[i_125_],
				 (((Class234) this).anIntArrayArray2582[i]
				  [i_125_]),
				 ((Class234) this).anIntArray2583[i_123_]);
		int i_127_ = ((Class234) this).anIntArrayArray2582[i][i_123_];
		int i_128_ = i_122_ - i_126_;
		int i_129_ = i_126_;
		int i_130_ = (i_128_ < i_129_ ? i_128_ : i_129_) << 1;
		if (i_127_ != 0) {
		    boolean[] bools_131_
			= ((Class234) this).aBoolArrayArray2587[i];
		    int i_132_ = i_124_;
		    ((Class234) this).aBoolArrayArray2587[i][i_125_] = true;
		    bools_131_[i_132_] = true;
		    ((Class234) this).aBoolArrayArray2587[i][i_123_] = true;
		    if (i_127_ >= i_130_)
			((Class234) this).anIntArrayArray2582[i][i_123_]
			    = (i_128_ > i_129_ ? i_127_ - i_129_ + i_126_
			       : i_126_ - i_127_ + i_128_ - 1);
		    else
			((Class234) this).anIntArrayArray2582[i][i_123_]
			    = ((i_127_ & 0x1) != 0 ? i_126_ - (i_127_ + 1 >> 1)
			       : i_126_ + (i_127_ >> 1));
		} else {
		    ((Class234) this).aBoolArrayArray2587[i][i_123_] = false;
		    ((Class234) this).anIntArrayArray2582[i][i_123_] = i_126_;
		}
	    }
	    for (int i_133_ = 0; i_133_ < i_121_; i_133_++) {
		if (!((Class234) this).aBoolArrayArray2587[i][i_133_])
		    ((Class234) this).anIntArrayArray2582[i][i_133_] = -1;
	    }
	}
    }
    
    void method3274(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    void method3275(int i) {
	if (((Class234) this).aBoolArray2580[i]) {
	    int i_134_ = ((Class234) this).anIntArray2583.length;
	    int i_135_ = anIntArray2586[((Class234) this).anInt2579 - 1];
	    boolean[] bools = ((Class234) this).aBoolArrayArray2587[i];
	    ((Class234) this).aBoolArrayArray2587[i][1] = true;
	    bools[0] = true;
	    for (int i_136_ = 2; i_136_ < i_134_; i_136_++) {
		int i_137_
		    = method3265(((Class234) this).anIntArray2583, i_136_);
		int i_138_
		    = method3262(((Class234) this).anIntArray2583, i_136_);
		int i_139_
		    = method3263(((Class234) this).anIntArray2583[i_137_],
				 (((Class234) this).anIntArrayArray2582[i]
				  [i_137_]),
				 ((Class234) this).anIntArray2583[i_138_],
				 (((Class234) this).anIntArrayArray2582[i]
				  [i_138_]),
				 ((Class234) this).anIntArray2583[i_136_]);
		int i_140_ = ((Class234) this).anIntArrayArray2582[i][i_136_];
		int i_141_ = i_135_ - i_139_;
		int i_142_ = i_139_;
		int i_143_ = (i_141_ < i_142_ ? i_141_ : i_142_) << 1;
		if (i_140_ != 0) {
		    boolean[] bools_144_
			= ((Class234) this).aBoolArrayArray2587[i];
		    int i_145_ = i_137_;
		    ((Class234) this).aBoolArrayArray2587[i][i_138_] = true;
		    bools_144_[i_145_] = true;
		    ((Class234) this).aBoolArrayArray2587[i][i_136_] = true;
		    if (i_140_ >= i_143_)
			((Class234) this).anIntArrayArray2582[i][i_136_]
			    = (i_141_ > i_142_ ? i_140_ - i_142_ + i_139_
			       : i_139_ - i_140_ + i_141_ - 1);
		    else
			((Class234) this).anIntArrayArray2582[i][i_136_]
			    = ((i_140_ & 0x1) != 0 ? i_139_ - (i_140_ + 1 >> 1)
			       : i_139_ + (i_140_ >> 1));
		} else {
		    ((Class234) this).aBoolArrayArray2587[i][i_136_] = false;
		    ((Class234) this).anIntArrayArray2582[i][i_136_] = i_139_;
		}
	    }
	    for (int i_146_ = 0; i_146_ < i_134_; i_146_++) {
		if (!((Class234) this).aBoolArrayArray2587[i][i_146_])
		    ((Class234) this).anIntArrayArray2582[i][i_146_] = -1;
	    }
	}
    }
    
    void method3276(int i) {
	if (((Class234) this).aBoolArray2580[i]) {
	    int i_147_ = ((Class234) this).anIntArray2583.length;
	    int i_148_ = anIntArray2586[((Class234) this).anInt2579 - 1];
	    boolean[] bools = ((Class234) this).aBoolArrayArray2587[i];
	    ((Class234) this).aBoolArrayArray2587[i][1] = true;
	    bools[0] = true;
	    for (int i_149_ = 2; i_149_ < i_147_; i_149_++) {
		int i_150_
		    = method3265(((Class234) this).anIntArray2583, i_149_);
		int i_151_
		    = method3262(((Class234) this).anIntArray2583, i_149_);
		int i_152_
		    = method3263(((Class234) this).anIntArray2583[i_150_],
				 (((Class234) this).anIntArrayArray2582[i]
				  [i_150_]),
				 ((Class234) this).anIntArray2583[i_151_],
				 (((Class234) this).anIntArrayArray2582[i]
				  [i_151_]),
				 ((Class234) this).anIntArray2583[i_149_]);
		int i_153_ = ((Class234) this).anIntArrayArray2582[i][i_149_];
		int i_154_ = i_148_ - i_152_;
		int i_155_ = i_152_;
		int i_156_ = (i_154_ < i_155_ ? i_154_ : i_155_) << 1;
		if (i_153_ != 0) {
		    boolean[] bools_157_
			= ((Class234) this).aBoolArrayArray2587[i];
		    int i_158_ = i_150_;
		    ((Class234) this).aBoolArrayArray2587[i][i_151_] = true;
		    bools_157_[i_158_] = true;
		    ((Class234) this).aBoolArrayArray2587[i][i_149_] = true;
		    if (i_153_ >= i_156_)
			((Class234) this).anIntArrayArray2582[i][i_149_]
			    = (i_154_ > i_155_ ? i_153_ - i_155_ + i_152_
			       : i_152_ - i_153_ + i_154_ - 1);
		    else
			((Class234) this).anIntArrayArray2582[i][i_149_]
			    = ((i_153_ & 0x1) != 0 ? i_152_ - (i_153_ + 1 >> 1)
			       : i_152_ + (i_153_ >> 1));
		} else {
		    ((Class234) this).aBoolArrayArray2587[i][i_149_] = false;
		    ((Class234) this).anIntArrayArray2582[i][i_149_] = i_152_;
		}
	    }
	    for (int i_159_ = 0; i_159_ < i_147_; i_159_++) {
		if (!((Class234) this).aBoolArrayArray2587[i][i_159_])
		    ((Class234) this).anIntArrayArray2582[i][i_159_] = -1;
	    }
	}
    }
}
