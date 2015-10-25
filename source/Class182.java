/* Class182 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.RandomAccessFile;

public final class Class182
{
    static final int anInt2094 = 25;
    Player aClass645_Sub1_Sub5_Sub1_Sub2_2095;
    public int anInt2096;
    public boolean aBool2097 = false;
    NPC aClass645_Sub1_Sub5_Sub1_Sub1_2098 = null;
    int anInt2099;
    int[] anIntArray2100;
    
    void method2687(int i) {
	((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub1_2098 = null;
	((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub2_2095 = null;
	aBool2097 = false;
    }
    
    void method2688(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
	if (!aBool2097) {
	    aBool2097 = true;
	    if (-1832008567 * anInt2096 >= 0) {
		((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub1_2098
		    = (new NPC
		       (client.aClass495_10935.method5973((byte) 101), 25));
		((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub1_2098.anInt11783
		    = ((Class182) this).anInt2099 * -2092310365;
		((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub1_2098.anInt11758
		    = 1463168197 * client.anInt11127;
		((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub1_2098
		    .method10898
		    (((Class299)
		      Class21.aClass5_Sub8_214
			  .method63(anInt2096 * -1832008567, 229762217)),
		     268859819);
		((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub1_2098
		    .setSize
		    ((((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub1_2098
		      .aClass299_12043.anInt3321) * -2134279851,
		     -1933113549);
		((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub1_2098.anInt11760
		    = ((((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub1_2098
			.aClass299_12043.anInt3301) * 65886605
		       << 3) * -1365090067;
		((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub1_2098.anInt11767
		    = (((Class185.anInt2115 += -1280156381) * -1923827061 - 1)
		       * 322053849);
	    } else {
		((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub2_2095
		    = (new Player
		       (client.aClass495_10935.method5973((byte) 107), 25));
		((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub2_2095
		    .decodeCharacterData(Class487.aClass528_Sub42_5493, -863151904);
		((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub2_2095.anInt11783
		    = ((Class182) this).anInt2099 * -2092310365;
		((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub2_2095.anInt11758
		    = 1463168197 * client.anInt11127;
		((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub2_2095.anInt11767
		    = (((Class185.anInt2115 += -1280156381) * -1923827061 - 1)
		       * 322053849);
	    }
	}
	if (-1832008567 * anInt2096 >= 0) {
	    ((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub1_2098.method10902
		(i_1_, i, i_0_, true,
		 ((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub1_2098
		     .method10671((byte) -73),
		 (byte) -54);
	    ((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub1_2098
		.method10663(i_2_, true, -2127232413);
	} else {
	    ((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub2_2095.aByte10675
		= ((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub2_2095
		      .aByte10674
		= (byte) i_1_;
	    ((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub2_2095
		.setPosition(i, i_0_, 896458943);
	    ((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub2_2095
		.method10663(i_2_, true, -2094685997);
	}
    }
    
    Class182(ByteBuffer class528_sub42, int i) {
	((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub2_2095 = null;
	((Class182) this).anInt2099 = i * -2076341019;
	int i_4_ = class528_sub42.readUnsignedByte((byte) 45);
	switch (i_4_) {
	default:
	    anInt2096 = 687279687;
	    break;
	case 1:
	    anInt2096 = 687279687;
	    break;
	case 0:
	    anInt2096 = class528_sub42.method9645((short) -7776) * -687279687;
	}
	class528_sub42.readString(252022831);
    }
    
    public Entity method2689(int i) {
	if (null != ((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub1_2098)
	    return ((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub1_2098;
	return ((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub2_2095;
    }
    
    boolean method2690(int i) {
	if (anInt2096 * -1832008567 >= 0) {
	    Class299 class299
		= ((Class299)
		   Class21.aClass5_Sub8_214.method63(-1832008567 * anInt2096,
						     1600336282));
	    boolean bool = class299.method3998(-597946632);
	    if (((Class182) this).anIntArray2100 == null) {
		RenderType renderType
		    = ((RenderType)
		       Class147.aClass5_Sub14_1673.method63((class299.anInt3274
							     * 941026227),
							    -1359299347));
		((Class182) this).anIntArray2100
		    = renderType.method6980((byte) -86);
	    }
	    int[] is = ((Class182) this).anIntArray2100;
	    for (int i_5_ = 0; i_5_ < is.length; i_5_++) {
		int i_6_ = is[i_5_];
		bool &= ((Class190)
			 Class379.aClass5_Sub4_3966.method63(i_6_, 1105205901))
			    .method2776(-227104680);
	    }
	    return bool;
	}
	return true;
    }
    
    void method2691() {
	((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub1_2098 = null;
	((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub2_2095 = null;
	aBool2097 = false;
    }
    
    void method2692(int i, int i_7_, int i_8_, int i_9_) {
	if (((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub1_2098 != null)
	    ((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub1_2098.method10902
		(i, i_7_, i_8_, true,
		 ((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub1_2098
		     .method10671((byte) -63),
		 (byte) -82);
	else {
	    ((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub2_2095.aByte10675
		= ((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub2_2095
		      .aByte10674
		= (byte) i;
	    ((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub2_2095
		.setPosition(i_7_, i_8_, 1945625685);
	}
    }
    
    boolean method2693() {
	if (anInt2096 * -1832008567 >= 0) {
	    Class299 class299
		= ((Class299)
		   Class21.aClass5_Sub8_214.method63(-1832008567 * anInt2096,
						     -2132344684));
	    boolean bool = class299.method3998(1167068313);
	    if (((Class182) this).anIntArray2100 == null) {
		RenderType renderType
		    = ((RenderType)
		       Class147.aClass5_Sub14_1673.method63((class299.anInt3274
							     * 941026227),
							    2145440970));
		((Class182) this).anIntArray2100
		    = renderType.method6980((byte) -69);
	    }
	    int[] is = ((Class182) this).anIntArray2100;
	    for (int i = 0; i < is.length; i++) {
		int i_10_ = is[i];
		bool &= ((Class190)
			 Class379.aClass5_Sub4_3966.method63(i_10_,
							     -2088311554))
			    .method2776(191230180);
	    }
	    return bool;
	}
	return true;
    }
    
    void method2694(int i, int i_11_, int i_12_) {
	if (((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub1_2098 != null)
	    ((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub1_2098.method10902
		(i, i_11_, i_12_, true,
		 ((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub1_2098
		     .method10671((byte) -19),
		 (byte) -6);
	else {
	    ((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub2_2095.aByte10675
		= ((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub2_2095
		      .aByte10674
		= (byte) i;
	    ((Class182) this).aClass645_Sub1_Sub5_Sub1_Sub2_2095
		.setPosition(i_11_, i_12_, 596587712);
	}
    }
    
    public static File method2695(String string, int i) {
	if (!Class490.aBool5508)
	    throw new RuntimeException("");
	File file = (File) Class490.aHashtable5510.get(string);
	if (file != null)
	    return file;
	File file_13_ = new File(Class490.aFile5509, string);
	RandomAccessFile randomaccessfile = null;
	File file_14_;
	try {
	    File file_15_ = new File(file_13_.getParent());
	    if (!file_15_.exists())
		throw new RuntimeException("");
	    randomaccessfile = new RandomAccessFile(file_13_, "rw");
	    int i_16_ = randomaccessfile.read();
	    randomaccessfile.seek(0L);
	    randomaccessfile.write(i_16_);
	    randomaccessfile.seek(0L);
	    randomaccessfile.close();
	    Class490.aHashtable5510.put(string, file_13_);
	    file_14_ = file_13_;
	} catch (Exception exception) {
	    try {
		if (randomaccessfile != null) {
		    randomaccessfile.close();
		    Object object = null;
		}
	    } catch (Exception exception_17_) {
		/* empty */
	    }
	    throw new RuntimeException();
	}
	return file_14_;
    }
    
    static final void method2696(Class648 class648, byte i) {
	int i_18_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = (Class196.aClass447_2200.method5401(i_18_, -438432000)
	       .aString11537);
    }
    
    static final void method2697(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub34_10591
		  .method10132((byte) 30);
    }
    
    static final void method2698(Class648 class648, short i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub9_10582
		  .method9892(-118149762) ? 1 : 0;
    }
    
    public static int method2699(int i, int i_19_, boolean bool,
				 boolean bool_20_, int i_21_) {
	Class528_Sub6 class528_sub6
	    = IncomingPacket.method4814(i, bool_20_, 1240381786);
	if (null == class528_sub6)
	    return 0;
	int i_22_ = 0;
	for (int i_23_ = 0;
	     i_23_ < ((Class528_Sub6) class528_sub6).anIntArray10253.length;
	     i_23_++) {
	    if (((Class528_Sub6) class528_sub6).anIntArray10253[i_23_] >= 0
		&& (((Class528_Sub6) class528_sub6).anIntArray10253[i_23_]
		    < Class18.aClass5_Sub13_206.anInt116 * -1906415229)) {
		ItemType itemType
		    = ((ItemType)
		       Class18.aClass5_Sub13_206.method63((((Class528_Sub6)
							    class528_sub6)
							   .anIntArray10253
							   [i_23_]),
							  -868934806));
		int i_24_
		    = itemType.method522(i_19_,
				       (((Class79)
					 Class208.aClass5_Sub10_2239
					     .method63(i_19_, 1071481911))
					.anInt809) * 1875093329,
				       -1835291372);
		if (bool)
		    i_22_ += (((Class528_Sub6) class528_sub6).anIntArray10252
			      [i_23_]) * i_24_;
		else
		    i_22_ += i_24_;
	    }
	}
	return i_22_;
    }
    
    static void method2700(int[] is, float[] fs, float[] fs_25_, int i,
			   int i_26_, int i_27_) {
	if (i < i_26_) {
	    int i_28_ = (i + i_26_) / 2;
	    int i_29_ = i;
	    int i_30_ = is[i_28_];
	    is[i_28_] = is[i_26_];
	    is[i_26_] = i_30_;
	    float f = fs[i_28_];
	    fs[i_28_] = fs[i_26_];
	    fs[i_26_] = f;
	    float f_31_ = fs_25_[i_28_];
	    fs_25_[i_28_] = fs_25_[i_26_];
	    fs_25_[i_26_] = f_31_;
	    int i_32_ = (long) i_30_ == 9223372036854775807L ? 0 : 1;
	    for (int i_33_ = i; i_33_ < i_26_; i_33_++) {
		if (is[i_33_] < (i_33_ & i_32_) + i_30_) {
		    int i_34_ = is[i_33_];
		    is[i_33_] = is[i_29_];
		    is[i_29_] = i_34_;
		    float f_35_ = fs[i_33_];
		    fs[i_33_] = fs[i_29_];
		    fs[i_29_] = f_35_;
		    float f_36_ = fs_25_[i_33_];
		    fs_25_[i_33_] = fs_25_[i_29_];
		    fs_25_[i_29_] = f_36_;
		    i_29_++;
		}
	    }
	    is[i_26_] = is[i_29_];
	    is[i_29_] = i_30_;
	    fs[i_26_] = fs[i_29_];
	    fs[i_29_] = f;
	    fs_25_[i_26_] = fs_25_[i_29_];
	    fs_25_[i_29_] = f_31_;
	    method2700(is, fs, fs_25_, i, i_29_ - 1, 919904438);
	    method2700(is, fs, fs_25_, 1 + i_29_, i_26_, 876259156);
	}
    }
    
    static void method2701(Class681 class681, int i) {
	Class409.aClass681_4709 = class681;
    }
}
